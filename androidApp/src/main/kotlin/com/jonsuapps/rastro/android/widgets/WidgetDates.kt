package com.jonsuapps.rastro.android.widgets

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import java.util.concurrent.TimeUnit

internal object WidgetDates {
    data class Display(val value: String, val label: String)

    fun display(date: String, now: Long): Display {
        val days = daysUntil(date, now) ?: return Display("—", "CONFIGURA LA FECHA")
        val today = formatter().format(Date(now))
        if (date < today) return Display("—", "EXAMEN FINALIZADO")
        if (date == today) return Display("HOY", "ES TU EXAMEN")
        if (days == 1) {
            val remaining = (runCatching { formatter().parse(date)?.time }.getOrNull()
                ?: return Display("—", "CONFIGURA LA FECHA")) - now
            val hours = ((remaining + TimeUnit.HOURS.toMillis(1) - 1) / TimeUnit.HOURS.toMillis(1)).coerceIn(1, 24)
            return Display(hours.toString(), if (hours == 1L) "HORA RESTANTE" else "HORAS RESTANTES")
        }
        return Display(days.toString(), "DÍAS RESTANTES")
    }

    fun nextRefresh(date: String, now: Long): Long? {
        if (daysUntil(date, now) == null || date < formatter().format(Date(now))) return null
        val calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("America/Lima")).apply {
            timeInMillis = now
            if (daysUntil(date, now) == 1) {
                add(java.util.Calendar.HOUR_OF_DAY, 1)
            } else {
                add(java.util.Calendar.DAY_OF_YEAR, 1)
                set(java.util.Calendar.HOUR_OF_DAY, 0)
            }
            set(java.util.Calendar.MINUTE, 0)
            set(java.util.Calendar.SECOND, 0)
            set(java.util.Calendar.MILLISECOND, 0)
        }
        return calendar.timeInMillis
    }

    private fun formatter() = SimpleDateFormat("yyyy-MM-dd", Locale.US).apply {
        isLenient = false
        timeZone = TimeZone.getTimeZone("America/Lima")
    }
    /** Calendar days in Lima; an unset/invalid target is not an invented exam countdown. */
    fun daysUntil(date: String, now: Long): Int? = runCatching {
        if (!date.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) return null
        val format = formatter()
        val target = format.parse(date) ?: return null
        val today = format.parse(format.format(Date(now))) ?: return null
        TimeUnit.MILLISECONDS.toDays(target.time - today.time).toInt().coerceAtLeast(0)
    }.getOrNull()
}
