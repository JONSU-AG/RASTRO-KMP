package com.jonsuapps.rastro.vocational

/**
 * Motor determinista de cálculo y puntuación para el O*NET Interest Profiler / modelo RIASEC.
 * Calcula puntuaciones brutas por dimensión (10 a 50 puntos), detecta empates reales y
 * deriva el código Holland predominante.
 */
object VocationalScoringEngine {

    /**
     * Calcula el [VocationalResult] a partir del catálogo de preguntas y las respuestas proporcionadas.
     * @param questions Lista de preguntas del test (se esperan 60 preguntas, 10 por dimensión).
     * @param answers Mapa de questionId a valor Likert (1..5).
     * @param timestamp Marca temporal de la resolución.
     * @throws IllegalArgumentException si falta alguna respuesta o contiene valores inválidos.
     */
    fun calculateResult(
        questions: List<VocationalQuestion>,
        answers: Map<Int, Int>,
        timestamp: Long = 0L
    ): VocationalResult {
        require(questions.isNotEmpty()) { "La lista de preguntas no puede estar vacía." }

        // Validar que todas las preguntas tengan respuesta
        val missingQuestionIds = questions.map { it.id }.filterNot { answers.containsKey(it) }
        require(missingQuestionIds.isEmpty()) {
            "Faltan respuestas para las siguientes preguntas: $missingQuestionIds"
        }

        // Validar rango de cada respuesta
        answers.forEach { (questionId, value) ->
            require(value in 1..5) {
                "La respuesta para la pregunta $questionId tiene un valor fuera del rango 1..5: $value"
            }
        }

        // Sumar puntuación por dimensión
        var realisticSum = 0
        var investigativeSum = 0
        var artisticSum = 0
        var socialSum = 0
        var enterprisingSum = 0
        var conventionalSum = 0

        for (question in questions) {
            val answerValue = answers[question.id] ?: continue
            when (question.dimension) {
                RiasecDimension.REALISTIC -> realisticSum += answerValue
                RiasecDimension.INVESTIGATIVE -> investigativeSum += answerValue
                RiasecDimension.ARTISTIC -> artisticSum += answerValue
                RiasecDimension.SOCIAL -> socialSum += answerValue
                RiasecDimension.ENTERPRISING -> enterprisingSum += answerValue
                RiasecDimension.CONVENTIONAL -> conventionalSum += answerValue
            }
        }

        val dimensionScores = listOf(
            VocationalDimensionScore(RiasecDimension.REALISTIC, realisticSum),
            VocationalDimensionScore(RiasecDimension.INVESTIGATIVE, investigativeSum),
            VocationalDimensionScore(RiasecDimension.ARTISTIC, artisticSum),
            VocationalDimensionScore(RiasecDimension.SOCIAL, socialSum),
            VocationalDimensionScore(RiasecDimension.ENTERPRISING, enterprisingSum),
            VocationalDimensionScore(RiasecDimension.CONVENTIONAL, conventionalSum)
        )

        // Ordenar descendentemente por puntuación
        // En caso de empate numérico, el orden natural del enum se mantiene de forma determinista
        val sortedScores = dimensionScores.sortedWith(
            compareByDescending<VocationalDimensionScore> { it.score }
                .thenBy { it.dimension.ordinal }
        )

        // Detectar empates reales entre dimensiones
        val ties = mutableListOf<Pair<RiasecDimension, RiasecDimension>>()
        for (i in 0 until dimensionScores.size) {
            for (j in i + 1 until dimensionScores.size) {
                if (dimensionScores[i].score == dimensionScores[j].score) {
                    ties.add(dimensionScores[i].dimension to dimensionScores[j].dimension)
                }
            }
        }

        // Construir código Holland principal con las tres dimensiones superiores
        val top3 = sortedScores.take(3)
        val hollandCode = top3.map { it.dimension.code }.joinToString("")

        return VocationalResult(
            realistic = realisticSum,
            investigative = investigativeSum,
            artistic = artisticSum,
            social = socialSum,
            enterprising = enterprisingSum,
            conventional = conventionalSum,
            hollandCode = hollandCode,
            timestamp = timestamp,
            tiedDimensions = ties
        )
    }

    /**
     * Genera una síntesis interpretativa neutral y respetuosa basada en el perfil obtenido.
     * No efectúa diagnósticos psicológicos ni afirmaciones absolutas sobre aptitudes.
     */
    fun generateProfileSynthesis(result: VocationalResult): String {
        val topScores = result.orderedScores().take(3)
        if (topScores.isEmpty()) return ""

        val top1 = topScores[0].dimension
        val top2 = topScores.getOrNull(1)?.dimension
        val top3 = topScores.getOrNull(2)?.dimension

        val builder = StringBuilder()
        builder.append("Tus respuestas muestran mayor afinidad e interés por actividades vinculadas al área ")
        builder.append(top1.title)

        if (top2 != null) {
            builder.append(", acompañado de interés en tareas de tipo ")
            builder.append(top2.title)
        }
        if (top3 != null) {
            builder.append(" y ")
            builder.append(top3.title)
        }
        builder.append(".\n\n")

        builder.append(top1.detailedInterpretation)
        if (top2 != null) {
            builder.append(" Asimismo, complementariamente: ")
            builder.append(top2.detailedInterpretation)
        }

        // Mencionar empates en las primeras posiciones si existen
        val relevantTies = result.tiedDimensions.filter { (d1, d2) ->
            (d1 == top1 || d1 == top2 || d1 == top3) && (d2 == top1 || d2 == top2 || d2 == top3)
        }
        if (relevantTies.isNotEmpty()) {
            builder.append("\n\nNota de consistencia: Se registraron puntuaciones idénticas entre ")
            builder.append(relevantTies.joinToString("; ") { "${it.first.title} y ${it.second.title}" })
            builder.append(", lo que refleja un nivel de interés de similar intensidad en ambas dimensiones.")
        }

        return builder.toString()
    }
}
