package com.jonsuapps.rastro.logo

/**
 * Configuración centralizada de umbrales para los estados emocionales del Logo de RASTRO.
 *
 * Evita la dispersión de números mágicos por la app y permite modificar los períodos
 * de inactividad de manera unificada.
 */
object LogoMoodConfig {
    /**
     * Horas de inactividad requeridas para pasar de BASE a ENOJO (Nivel 1).
     * Modificable centralmente sin alterar código disperso.
     */
    var inactiveAngryThresholdHours: Long = 24L

    /**
     * Horas de inactividad requeridas para pasar de ENOJO a FURIA (Nivel 2).
     * Modificable centralmente sin alterar código disperso.
     */
    var inactiveFuriousThresholdHours: Long = 48L

    /**
     * Restablece los umbrales a sus valores predeterminados.
     */
    fun resetToDefaults() {
        inactiveAngryThresholdHours = 24L
        inactiveFuriousThresholdHours = 48L
    }
}
