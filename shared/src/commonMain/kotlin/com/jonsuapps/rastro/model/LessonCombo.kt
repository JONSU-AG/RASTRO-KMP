package com.jonsuapps.rastro.model

/** Only consumes the engine's verdict; does not evaluate questions or award rewards. */
data class LessonComboState(val value: Int = 0, val answeredAttempts: Set<String> = emptySet()) {
    init { require(value in 0..MAX) }

    fun answer(attemptKey: String, correct: Boolean): ComboTransition {
        require(attemptKey.isNotBlank())
        if (attemptKey in answeredAttempts) return ComboTransition(this)
        val next = if (correct) (value + 1).coerceAtMost(MAX) else 0
        val events = when {
            !correct && value > 0 -> listOf(ComboEvent.Broken(value))
            correct && next > value && next >= 2 -> listOf(ComboEvent.Reached(next))
            else -> emptyList()
        }
        return ComboTransition(copy(value = next, answeredAttempts = answeredAttempts + attemptKey), events)
    }

    companion object { const val MAX = 5 }
}

sealed interface ComboEvent {
    data class Reached(val value: Int) : ComboEvent
    data class Broken(val previousValue: Int) : ComboEvent
}
data class ComboTransition(val state: LessonComboState, val events: List<ComboEvent> = emptyList())
