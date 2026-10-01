package com.jonsuapps.rastro.gamification

import kotlinx.serialization.Serializable

/**
 * Unidades temporales para la recuperación de vidas del sistema (§4.2 Gamificación).
 * Diseñado para soportar rangos desde 1 segundo hasta décadas sin desbordamiento numérico (overflow).
 */
@Serializable
enum class LifeRecoveryUnit(
    val title: String,
    val secondsMultiplier: Long
) {
    SEGUNDOS("Segundos", 1L),
    MINUTOS("Minutos", 60L),
    HORAS("Horas", 3600L),
    DIAS("Días", 86400L),
    ANIOS("Años", 31557600L); // 365.25 días en promedio por año

    companion object {
        fun fromString(value: String?): LifeRecoveryUnit {
            return when (value?.trim()?.uppercase()) {
                "SEGUNDOS", "SEGUNDO", "SECONDS", "SECOND", "SEG" -> SEGUNDOS
                "MINUTOS", "MINUTO", "MINUTES", "MINUTE", "MIN" -> MINUTOS
                "HORAS", "HORA", "HOURS", "HOUR", "H", "HRS" -> HORAS
                "DIAS", "DÍAS", "DIA", "DÍA", "DAYS", "DAY", "D" -> DIAS
                "ANIOS", "AÑOS", "ANIO", "AÑO", "YEARS", "YEAR", "A" -> ANIOS
                else -> MINUTOS
            }
        }
    }
}
