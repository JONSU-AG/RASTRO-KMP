package com.jonsuapps.rastro.vocational

/**
 * Dimensiones fundamentales del modelo tipológico RIASEC de John Holland,
 * empleado por la metodología psicométrica del O*NET® Interest Profiler™.
 */
enum class RiasecDimension(
    val code: Char,
    val title: String,
    val description: String,
    val detailedInterpretation: String
) {
    REALISTIC(
        code = 'R',
        title = "Realista",
        description = "Preferencia por actividades prácticas, concretas y técnicas, con herramientas, equipos, objetos o resolución directa de problemas.",
        detailedInterpretation = "Tus respuestas reflejan afinidad por el trabajo práctico y concreto, interactuando con herramientas, tecnología física, maquinaria o trabajo al aire libre."
    ),
    INVESTIGATIVE(
        code = 'I',
        title = "Investigador",
        description = "Preferencia por analizar, investigar, comprender fenómenos, resolver problemas complejos y trabajar con ideas o información.",
        detailedInterpretation = "Tus respuestas indican interés por actividades de investigación, análisis científico, razonamiento lógico y profundización teórica de fenómenos."
    ),
    ARTISTIC(
        code = 'A',
        title = "Artístico",
        description = "Preferencia por crear, diseñar, expresarse y trabajar en actividades donde exista espacio para la imaginación y la originalidad.",
        detailedInterpretation = "Tus respuestas muestran interés en la autoexpresión creativa, diseño, comunicación visual, literaria o actividades con libertad de innovación."
    ),
    SOCIAL(
        code = 'S',
        title = "Social",
        description = "Preferencia por ayudar, enseñar, orientar, acompañar o colaborar directamente con otras personas.",
        detailedInterpretation = "Tus respuestas expresan vocación de servicio interpersonal, empatía, pedagogía, asesoramiento o trabajo colaborativo con grupos humanos."
    ),
    ENTERPRISING(
        code = 'E',
        title = "Emprendedor",
        description = "Preferencia por liderar, persuadir, organizar iniciativas, negociar, tomar decisiones o impulsar proyectos.",
        detailedInterpretation = "Tus respuestas denotan iniciativa hacia la toma de decisiones, liderazgo de equipos, persuasión, gestión estratégica y asunción de proyectos."
    ),
    CONVENTIONAL(
        code = 'C',
        title = "Convencional",
        description = "Preferencia por organizar información, trabajar con procedimientos, datos, estructuras y tareas que requieren orden y precisión.",
        detailedInterpretation = "Tus respuestas revelan interés por tareas estructuradas, precisión en el manejo de datos, sistematización de procesos y cumplimiento riguroso de métodos."
    );

    companion object {
        fun fromCode(code: Char): RiasecDimension? {
            return entries.firstOrNull { it.code.equals(code, ignoreCase = true) }
        }
    }
}

/**
 * Representa una actividad a evaluar en el test vocacional O*NET Interest Profiler.
 * La dimensión es metadata interna y NUNCA se muestra al estudiante durante el test.
 */
data class VocationalQuestion(
    val id: Int,
    val text: String,
    val dimension: RiasecDimension,
    val order: Int
)

/**
 * Respuesta dada por el estudiante en una escala Likert de 5 puntos (1 a 5).
 * 1 = Me disgusta mucho
 * 2 = Me disgusta
 * 3 = No estoy seguro/a
 * 4 = Me gusta
 * 5 = Me gusta mucho
 */
data class VocationalAnswer(
    val questionId: Int,
    val value: Int
) {
    init {
        require(value in 1..5) { "El valor de respuesta debe encontrarse en el rango de 1 a 5." }
    }
}

/**
 * Puntaje calculado para una dimensión RIASEC específica.
 */
data class VocationalDimensionScore(
    val dimension: RiasecDimension,
    val score: Int
)

/**
 * Resultado completo del Test Vocacional RIASEC.
 * Incluye puntuaciones por cada escala (10 a 50 puntos cada una), código Holland resultante,
 * fecha de evaluación y registro de posibles empates para reflejar la incertidumbre real.
 */
data class VocationalResult(
    val realistic: Int,
    val investigative: Int,
    val artistic: Int,
    val social: Int,
    val enterprising: Int,
    val conventional: Int,
    val hollandCode: String,
    val timestamp: Long = 0L,
    val tiedDimensions: List<Pair<RiasecDimension, RiasecDimension>> = emptyList()
) {
    fun scoreFor(dimension: RiasecDimension): Int = when (dimension) {
        RiasecDimension.REALISTIC -> realistic
        RiasecDimension.INVESTIGATIVE -> investigative
        RiasecDimension.ARTISTIC -> artistic
        RiasecDimension.SOCIAL -> social
        RiasecDimension.ENTERPRISING -> enterprising
        RiasecDimension.CONVENTIONAL -> conventional
    }

    fun orderedScores(): List<VocationalDimensionScore> {
        return listOf(
            VocationalDimensionScore(RiasecDimension.REALISTIC, realistic),
            VocationalDimensionScore(RiasecDimension.INVESTIGATIVE, investigative),
            VocationalDimensionScore(RiasecDimension.ARTISTIC, artistic),
            VocationalDimensionScore(RiasecDimension.SOCIAL, social),
            VocationalDimensionScore(RiasecDimension.ENTERPRISING, enterprising),
            VocationalDimensionScore(RiasecDimension.CONVENTIONAL, conventional)
        ).sortedByDescending { it.score }
    }
}

/**
 * Estructura extensible para futuras recomendaciones de áreas ocupacionales y carreras.
 * Preparada para vincularse posteriormente con fuentes autorizadas de O*NET / SUNEDU / UNSA.
 */
data class CareerExplorationRecommendation(
    val careerName: String,
    val academicArea: String,
    val primaryCode: String,
    val description: String,
    val explorationSuggestions: List<String> = emptyList()
)
