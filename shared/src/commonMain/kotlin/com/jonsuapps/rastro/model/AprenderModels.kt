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
data class LessonNode(
    val id: String,
    val subjectId: String,
    val semana: Int,
    val subtema: String,
    val title: String,
    val theory: LessonTheory,
    val challenges: List<Challenge> = emptyList(),
    val isLocked: Boolean = false,
    val isCompleted: Boolean = false,
    val stars: Int = 0,
    val isCurrent: Boolean = false
)
