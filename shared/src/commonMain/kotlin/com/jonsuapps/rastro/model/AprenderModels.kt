package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
data class SubjectConfig(
    val id: String,
    val name: String,
    val area: String,
    val colorHex: String,
    val description: String,
    val asigBanco: String,
    val mascotTip: String = ""
)

@Serializable
data class LessonTheory(
    val id: String,
    val asignatura: String,
    val semana: Int,
    val titulo: String,
    val resumen: String,
    val conceptosClave: List<String> = emptyList(),
    val fechasYPersonajes: List<String> = emptyList(),
    val hechosRelevantes: List<String> = emptyList(),
    val formulas: List<String> = emptyList(),
    val clavesFijas: List<String> = emptyList(),
    val advertenciasErroresComunes: List<String> = emptyList(),
    val formulaName: String? = null,
    val formulaLatex: String? = null,
    val formulaDescription: String? = null,
    val admissionTip: String? = null,
    val admissionExplanation: String? = null
)

@Serializable
enum class ChallengeType {
    MULTIPLE_CHOICE,
    MATCH_PAIRS,
    FILL_BLANK
}

@Serializable
data class Challenge(
    val id: String,
    val type: ChallengeType = ChallengeType.MULTIPLE_CHOICE,
    val statement: String,
    val options: List<String> = emptyList(),
    val correctIndex: Int = 0,
    val explanation: String = "",
    val formula: String? = null,
    val subject: String = "",
    val semana: Int = 1,
    val correctText: String? = null,
    val sentenceBefore: String? = null,
    val sentenceAfter: String? = null,
    val chips: List<String> = emptyList(),
    val pairs: List<ChallengePair> = emptyList(),
    val rightOptions: List<ChallengeMatchOption> = emptyList(),
    val instruction: String? = null,
    val pedagogicalTier: String? = null,
    val fuente: String? = null
)

@Serializable
data class ChallengePair(
    val id: String,
    val left: String,
    val right: String
)

@Serializable
data class ChallengeMatchOption(
    val id: String,
    val text: String
)

@Serializable
enum class LessonDepth(val targetChallenges: Int) {
    SIMPLE(7),
    NORMAL(15),
    EXTENSIVE(20)
}

/**
 * Representa y compara códigos de subtema jerárquicos (ej: "1.1", "1.1.1", "1.1.2", "1.2", "1.10").
 * NUNCA convierte a Float/Double para preservar la distinción matemática exacta entre 1.10 y 1.1.
 */
@Serializable
data class SubtemaCode(
    val segments: List<Int>
) : Comparable<SubtemaCode> {

    override fun compareTo(other: SubtemaCode): Int {
        val maxLen = maxOf(this.segments.size, other.segments.size)
        for (i in 0 until maxLen) {
            val a = this.segments.getOrNull(i)
            val b = other.segments.getOrNull(i)
            if (a == null && b != null) return -1
            if (a != null && b == null) return 1
            if (a != null && b != null && a != b) {
                return a.compareTo(b)
            }
        }
        return 0
    }

    override fun toString(): String = segments.joinToString(".")

    companion object {
        val comparator: Comparator<String> = Comparator { s1, s2 ->
            parse(s1).compareTo(parse(s2))
        }

        fun parse(raw: String): SubtemaCode {
            val clean = raw.trim()
            val match = Regex("""\b(\d+(?:\.\d+)+|\d+)\b""").find(clean)
            val numbersStr = match?.value ?: clean
            val segments = numbersStr.split(".")
                .mapNotNull { it.trim().toIntOrNull() }
            return SubtemaCode(if (segments.isEmpty()) listOf(0) else segments)
        }
    }
}

@Serializable
data class LessonNode(
    val id: String,
    val subjectId: String,
    val semana: Int,
    val subtema: String,
    val title: String,
    val theory: LessonTheory,
    val challenges: List<Challenge> = emptyList(),
    val learningObjectives: List<String> = emptyList(),
    val depth: LessonDepth = LessonDepth.NORMAL,
    val isLocked: Boolean = false,
    val isCompleted: Boolean = false,
    val stars: Int = 0,
    val isCurrent: Boolean = false
) {
    /**
     * Devuelve los objetivos de aprendizaje específicos para ESTA lección.
     * Si no fueron definidos explícitamente en el catálogo, se derivan dinámicamente
     * a partir de sus propios conceptos clave, encabezados de teoría o título real.
     */
    fun getEffectiveLearningObjectives(): List<String> {
        if (learningObjectives.isNotEmpty()) return learningObjectives

        if (theory.conceptosClave.isNotEmpty()) {
            return theory.conceptosClave.take(4).map { raw ->
                var clean = raw.trim()
                if (clean.startsWith("•") || clean.startsWith("-")) clean = clean.substring(1).trim()
                clean
            }
        }

        // Derivar desde los encabezados (# o viñetas destacadas) del resumen real de ESTA lección
        val sectionsFromResumen = theory.resumen.lines()
            .map { it.trim() }
            .filter { it.startsWith("#") || it.startsWith("- **") || it.startsWith("• **") }
            .map { line ->
                line.removePrefix("#").trim()
                    .replace(Regex("^\\d+\\.\\s*"), "")
                    .replace(Regex("^\\*\\*(.*?)\\*\\*.*"), "$1")
                    .replace(":", "")
                    .trim()
            }
            .filter { it.length in 4..50 && !it.startsWith("Semana", ignoreCase = true) }
            .distinct()

        if (sectionsFromResumen.isNotEmpty()) {
            return sectionsFromResumen.take(4).map { topic ->
                "Comprender $topic"
            }
        }

        // Fallback dinámico contextual basado en el título real de la lección
        val cleanTitle = theory.titulo.ifBlank { title }
        return listOf(
            "Fundamentos clave de $cleanTitle",
            "Conceptos esenciales de $title",
            "Resolución de retos de ${theory.asignatura} para admisión"
        )
    }
}

