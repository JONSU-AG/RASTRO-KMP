package com.jonsuapps.rastro.pomodoro

/** Tiempo transcurrido real; no depende del número de veces que se dibuja la pantalla. */
object PomodoroClock {
    data class Edit(val state: PomodoroState, val deadlineMillis: Long)

    fun edit(previous: PomodoroState, requested: PomodoroState, deadlineMillis: Long, nowMillis: Long): Edit {
        val changedTime = requested.timeLeftSeconds != previous.timeLeftSeconds || requested.mode != previous.mode
        val next = if (!changedTime && previous.isRunning)
            requested.copy(timeLeftSeconds = remainingSeconds(deadlineMillis, nowMillis)) else requested
        val deadline = when {
            !next.isRunning -> 0L
            !previous.isRunning || changedTime -> nowMillis + next.timeLeftSeconds * 1000L
            else -> deadlineMillis
        }
        return Edit(next, deadline)
    }

    fun remainingSeconds(deadlineMillis: Long, nowMillis: Long): Int =
        ((deadlineMillis - nowMillis).coerceAtLeast(0L).let { (it + 999L) / 1000L })
            .coerceAtMost(Int.MAX_VALUE.toLong()).toInt()

    fun completed(state: PomodoroState): PomodoroState {
        val study = state.mode == PomodoroMode.STUDY || state.mode == PomodoroMode.CUSTOM
        val cycles = state.completedCycles + if (study) 1 else 0
        val next = if (!study) PomodoroMode.STUDY
        else if (cycles % state.customCyclesBeforeLongBreak.coerceAtLeast(1) == 0) PomodoroMode.LONG_BREAK
        else PomodoroMode.SHORT_BREAK
        return state.copy(
            mode = next,
            timeLeftSeconds = state.durationMinutes(next) * 60,
            isRunning = state.autoCycle,
            completedCycles = cycles,
            todayStudiedMinutes = state.todayStudiedMinutes + if (study) state.durationMinutes() else 0
        )
    }
}
