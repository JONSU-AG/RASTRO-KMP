package com.jonsuapps.rastro.logo

/**
 * Evaluador y fuente de verdad lógica para el estado emocional del logo de RASTRO.
 *
 * Prioridad inquebrantable de estados:
 * 1. RACHA PERDIDA REAL  -> TRISTE
 * 2. INACTIVIDAD CRÍTICA -> FURIA  (inactiveHours >= inactiveFuriousThresholdHours)
 * 3. INACTIVIDAD MEDIA   -> ENOJO  (inactiveHours >= inactiveAngryThresholdHours)
 * 4. ACTIVO / REGRESO    -> BASE
 *
 * El logo solo REFLEJA el estado de la racha; no es la fuente de verdad del streak.
 */
object RastroLogoEvaluator {

    /**
     * Override no destructivo para pruebas y QA.
     * Si no es nulo, este valor prevalece sin alterar datos de racha ni SharedPreferences.
     */
    var debugOverride: RastroLogoMood? = null

    /**
     * Evalúa el estado del logo a partir de condiciones concretas.
     *
     * @param isStreakLost true si el usuario perdió su racha activa de estudio.
     * @param inactiveHours cantidad de horas transcurridas desde el último acceso/sesión del usuario.
     * @param isUserCurrentlyActive true si el usuario está actualmente en la app interactuando hoy.
     * @return El estado del logo que corresponde según la jerarquía de prioridad.
     */
    fun evaluateMood(
        isStreakLost: Boolean,
        inactiveHours: Long,
        isUserCurrentlyActive: Boolean = true
    ): RastroLogoMood {
        // Prioridad 0: Modo debug no destructivo
        debugOverride?.let { return it }

        // Prioridad 1: Racha perdida real (nunca por simple tiempo si la racha no se perdió)
        if (isStreakLost) {
            return RastroLogoMood.TRISTE
        }

        // Si el usuario acaba de ingresar o interactuar en la app, vuelve automáticamente a BASE
        if (isUserCurrentlyActive && inactiveHours < LogoMoodConfig.inactiveAngryThresholdHours) {
            return RastroLogoMood.BASE
        }

        // Prioridad 2: Inactividad crítica
        if (inactiveHours >= LogoMoodConfig.inactiveFuriousThresholdHours) {
            return RastroLogoMood.FURIA
        }

        // Prioridad 3: Inactividad media
        if (inactiveHours >= LogoMoodConfig.inactiveAngryThresholdHours) {
            return RastroLogoMood.ENOJO
        }

        // Prioridad 4: Estado normal activo
        return RastroLogoMood.BASE
    }

    /**
     * Limpia cualquier override de pruebas.
     */
    fun clearDebugOverride() {
        debugOverride = null
    }
}
