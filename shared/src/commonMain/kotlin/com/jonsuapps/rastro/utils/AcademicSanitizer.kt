package com.jonsuapps.rastro.utils

/**
 * Sanitizador pedagógico oficial CEPREUNSA / UNSA
 * Garantiza rigor pedagógico por áreas de conocimiento:
 * 1. STEM (Matemáticas, Física, Química, Raz. Matemático): Fórmulas y unidades válidas en el S.I.
 * 2. BIOMÉDICAS (Biología): Bioenergética, citología y genética mendeliana.
 * 3. HUMANIDADES Y SOCIALES (Filosofía, Historia, Lenguaje, Literatura, Cívica, Geografía, Psicología):
 *    Elimina contaminación de fórmulas físicas ficticias en materias de letras.
 */
object AcademicSanitizer {

    fun normalizeSubjectArea(name: String?): String {
        if (name.isNullOrBlank()) return "general"
        val n = name.lowercase().trim()
        return when {
            n.contains("matem") || n.contains("algeb") || n.contains("álgeb") ||
                    n.contains("fisic") || n.contains("físic") ||
                    n.contains("quimic") || n.contains("químic") ||
                    n.contains("aritmet") || n.contains("aritmét") ||
                    n.contains("geom") || n.contains("trigo") ||
                    n.contains("calcul") || n.contains("cálcul") -> "stem"
            n.contains("biolog") || n.contains("biológ") || n.contains("anatomi") || n.contains("anatomí") -> "biomedicas"
            else -> "humanidades"
        }
    }

    fun isStemSubject(subjectName: String?): Boolean = normalizeSubjectArea(subjectName) == "stem"

    fun isHumanitiesSubject(subjectName: String?): Boolean = normalizeSubjectArea(subjectName) == "humanidades"

    /**
     * Limpia términos específicos de universidades para universalizar la experiencia pedagógica.
     */
    fun cleanUniversalText(text: String?): String {
        if (text.isNullOrBlank()) return ""
        return text
            .replace(Regex("de la Universidad Nacional de San Agustín\\s*\\((?:UNSA|CEPREUNSA)\\)", RegexOption.IGNORE_CASE), "de preparación preuniversitaria")
            .replace(Regex("Universidad Nacional de San Agustín", RegexOption.IGNORE_CASE), "universidades oficiales")
            .replace(Regex("Clave\\s+Fija\\s+(?:CEPREUNSA|UNSA)", RegexOption.IGNORE_CASE), "Clave Fija Esencial")
            .replace(Regex("Fija\\s+(?:CEPREUNSA|UNSA)", RegexOption.IGNORE_CASE), "Clave Fija")
            .replace(Regex("Tip\\s+(?:UNSA|CEPREUNSA)", RegexOption.IGNORE_CASE), "Consejo Práctico")
            .replace(Regex("criterio\\s+de\\s+admisi[oó]n", RegexOption.IGNORE_CASE), "criterio clave")
    }

    /**
     * Sanitizador pedagógico: elimina cualquier distractor o pregunta de física/matemática
     * (unidades S.I., fórmulas) en cursos de humanidades (Literatura, Filosofía, Historia, etc.)
     */
    fun hasUnrelatedStemContamination(subject: String, questionText: String): Boolean {
        if (!isHumanitiesSubject(subject)) return false
        val lower = questionText.lowercase()
        return lower.contains("unidad en el s.i") ||
                lower.contains("unidades en el s.i") ||
                lower.contains("sistema internacional de unidades") ||
                lower.contains("coherencia dimensional") ||
                lower.contains("m/s²") ||
                lower.contains("newton") ||
                lower.contains("joule")
    }
}
