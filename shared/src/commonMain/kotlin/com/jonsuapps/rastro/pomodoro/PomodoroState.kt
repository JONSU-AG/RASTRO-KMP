package com.jonsuapps.rastro.pomodoro

enum class PomodoroMode(val id: String, val title: String, val defaultMinutes: Int) {
    STUDY("study", "Estudio", 25),
    SHORT_BREAK("shortBreak", "Descanso Corto", 5),
    LONG_BREAK("longBreak", "Descanso Largo", 15),
    CUSTOM("custom", "Personalizado", 25)
}

enum class PomodoroAlertSound(val id: String, val title: String) {
    BEEP("beep", "Beep clásico"),
    DOUBLE_BEEP("double", "Doble beep"),
    CONFIRM("confirm", "Confirmación"),
    SILENT("silent", "Sin sonido")
}

enum class PomodoroViewState {
    HIDDEN,          // No se ha iniciado ni abierto el temporizador
    MINI_PILL,       // Píldora compacta 36px anclada a borde lateral
    EXPANDED_PILL,   // Píldora expandida con controles rápidos (+5m, play/pause)
    FULL_MODAL       // Modal extendido a 92vh con reloj circular y presets
}

enum class DockSide {
    LEFT,
    RIGHT
}

data class PomodoroState(
    val mode: PomodoroMode = PomodoroMode.STUDY,
    val timeLeftSeconds: Int = 25 * 60,
    val isRunning: Boolean = false,
    val completedCycles: Int = 0,
    val todayStudiedMinutes: Int = 0,
    val customStudyMinutes: Int = 25,
    val customShortBreakMinutes: Int = 5,
    val customLongBreakMinutes: Int = 15,
    val customCyclesBeforeLongBreak: Int = 4,
    val viewState: PomodoroViewState = PomodoroViewState.HIDDEN,
    val dockSide: DockSide = DockSide.RIGHT,
    val verticalYPercent: Float = 0.25f,
    val autoCycle: Boolean = true,
    val soundEnabled: Boolean = true,
    val studyAlertSound: PomodoroAlertSound = PomodoroAlertSound.BEEP,
    val shortBreakAlertSound: PomodoroAlertSound = PomodoroAlertSound.CONFIRM,
    val longBreakAlertSound: PomodoroAlertSound = PomodoroAlertSound.DOUBLE_BEEP
) {
    fun durationMinutes(forMode: PomodoroMode = mode): Int = when (forMode) {
        PomodoroMode.STUDY, PomodoroMode.CUSTOM -> customStudyMinutes
        PomodoroMode.SHORT_BREAK -> customShortBreakMinutes
        PomodoroMode.LONG_BREAK -> customLongBreakMinutes
    }.coerceIn(1, 120)

    fun alertSound(forMode: PomodoroMode = mode): PomodoroAlertSound = when (forMode) {
        PomodoroMode.STUDY, PomodoroMode.CUSTOM -> studyAlertSound
        PomodoroMode.SHORT_BREAK -> shortBreakAlertSound
        PomodoroMode.LONG_BREAK -> longBreakAlertSound
    }
}
