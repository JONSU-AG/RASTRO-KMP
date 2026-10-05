package com.jonsuapps.rastro.model

/** Answer interaction only. XP, hearts, retries and progress remain in Lesson Engine. */
object ChallengeInteraction {
    // Android uses ICU, which requires literal closing braces to be escaped too.
    val templateMarker = Regex("""\{\{([^{}]+)\}\}""")
    fun rightOptions(challenge: Challenge): List<ChallengeMatchOption> = challenge.rightOptions.ifEmpty {
        challenge.pairs.map { ChallengeMatchOption(it.id, it.right) }
    }

    fun blanks(challenge: Challenge): List<ChallengeBlank> = challenge.blanks.ifEmpty {
        if (challenge.type == ChallengeType.FILL_BLANK)
            listOf(ChallengeBlank("answer", challenge.chips, challenge.correctText.orEmpty())) else emptyList()
    }

    fun template(challenge: Challenge): String = if (challenge.blanks.isNotEmpty())
        challenge.textTemplate.orEmpty() else "${(challenge.sentenceBefore ?: challenge.statement.substringBefore("___", challenge.statement))} {{answer}} ${(challenge.sentenceAfter ?: challenge.statement.substringAfter("___", ""))}"

    fun validationErrors(challenge: Challenge): List<String> = buildList {
        when (challenge.type) {
            ChallengeType.MULTIPLE_CHOICE -> Unit
            ChallengeType.MATCH_PAIRS -> {
                val pairs = challenge.pairs
                val right = rightOptions(challenge)
                if (pairs.size < 2) add("Relacionar necesita al menos dos parejas.")
                if (pairs.any { it.id.isBlank() || it.left.isBlank() || it.right.isBlank() }) add("Parejas con ID o texto vacío.")
                if (pairs.map { it.left.trim().lowercase() }.distinct().size != pairs.size ||
                    right.map { it.text.trim().lowercase() }.distinct().size != right.size) add("Los textos de cada columna deben ser distintos para evitar parejas ambiguas.")
                if (pairs.map { it.id }.distinct().size != pairs.size) add("IDs de pareja duplicados.")
                if (right.any { it.id.isBlank() || it.text.isBlank() } || right.map { it.id }.distinct().size != right.size)
                    add("Opciones derechas vacías o duplicadas.")
                if (right.map { it.id }.toSet() != pairs.map { it.id }.toSet()) add("Las opciones derechas deben corresponder a las parejas por ID.")
            }
            ChallengeType.FILL_BLANK -> {
                val blanks = blanks(challenge)
                if (blanks.isEmpty() || blanks.any { it.id.isBlank() }) add("Faltan espacios con ID.")
                if (blanks.map { it.id }.distinct().size != blanks.size) add("IDs de espacio duplicados.")
                blanks.forEach { blank ->
                    val options = blank.options.map { it.trim().lowercase() }
                    if (options.size < 2 || options.any { it.isBlank() } || options.distinct().size != options.size)
                        add("${blank.id}: necesita opciones distintas y no vacías.")
                    if (blank.correctText.isBlank() || blank.correctText.trim().lowercase() !in options)
                        add("${blank.id}: respuesta correcta ausente en las opciones.")
                }
                val ids = templateMarker.findAll(template(challenge)).map { it.groupValues[1] }.toList()
                if (ids.sorted() != blanks.map { it.id }.sorted()) add("Cada espacio debe aparecer exactamente una vez como {{id}} en el texto.")
            }
        }
    }

    /** Only correct links are added. Locked endpoints cannot be reused or changed. */
    fun match(challenge: Challenge, state: MatchAnswerState, left: Int, right: Int): MatchAnswerState {
        if (validationErrors(challenge).isNotEmpty() || left in state.links || right in state.links.values) return state
        val pair = challenge.pairs.getOrNull(left) ?: return state
        val option = rightOptions(challenge).getOrNull(right) ?: return state
        return if (pair.id == option.id) state.copy(links = state.links + (left to right), lastMismatch = false)
            else state.copy(mistakes = state.mistakes + 1, lastMismatch = true, mismatchLeft = left, mismatchRight = right)
    }

    fun matchingComplete(challenge: Challenge, state: MatchAnswerState): Boolean =
        validationErrors(challenge).isEmpty() && state.links.size == challenge.pairs.size &&
            challenge.pairs.indices.all { left -> state.links[left]?.let { rightOptions(challenge).getOrNull(it)?.id } == challenge.pairs[left].id }

    fun fillingComplete(challenge: Challenge, answers: Map<String, String>): Boolean =
        validationErrors(challenge).isEmpty() && blanks(challenge).all { answers[it.id] in it.options }

    fun fillingCorrect(challenge: Challenge, answers: Map<String, String>): Boolean =
        fillingComplete(challenge, answers) && blanks(challenge).all {
            answers[it.id]?.trim().equals(it.correctText.trim(), ignoreCase = true)
        }
}

data class MatchAnswerState(val links: Map<Int, Int> = emptyMap(), val mistakes: Int = 0, val lastMismatch: Boolean = false,
    val mismatchLeft: Int? = null, val mismatchRight: Int? = null)
