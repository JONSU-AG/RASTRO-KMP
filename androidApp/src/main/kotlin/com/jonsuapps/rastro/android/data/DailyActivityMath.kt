package com.jonsuapps.rastro.android.data

import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

/**
 * Elemento de actividad diaria de un tester en un día calendario específico.
 */
data class DailyActivityItem(
    val date: String,             // Formato YYYY-MM-DD
    val formattedDate: String,    // Ej: "24 sep."
    val activeSeconds: Long,      // Segundos activos
    val appSeconds: Long = 0L,    // Segundos en App
    val webSeconds: Long = 0L,    // Segundos en Web
    val formattedTime: String,    // Ej: "25 min (App: 15 min · Web: 10 min)" o "Sin actividad"
    val isActive: Boolean,        // true si tuvo tiempo > 0 o actividad comprobada
    val isHistoricalOnly: Boolean = false, // true si proviene de historial gamificación sin minutos exactos
    val isNoHistoricalData: Boolean = false // true si es previo al inicio de la medición sin evidencia
)

/**
 * Resumen consolidado de actividad para un tester dentro del período observado.
 */
data class TesterSummary(
    val uid: String,
    val email: String,
    val displayName: String,
    val photoUrl: String? = null,
    val activeDaysCount: Int = 0,
    val inactiveDaysCount: Int = 0,
    val totalSeconds: Long = 0L,
    val formattedTotalTime: String = "0 min",
    val averageSecondsPerActiveDay: Long = 0L,
    val formattedAverage: String = "0 min",
    val lastActiveDate: String = "",
    val formattedLastActive: String = "Sin registro",
    val dailyItems: List<DailyActivityItem> = emptyList(),
    val longVisitDaysCount: Int = 0,
    val shortVisitDaysCount: Int = 0,
    val historicalRecoveredDates: Set<String> = emptySet(),
    // Desglose APK/Web del período + histórico acumulado (totalTesterSeconds).
    val appPeriodSeconds: Long = 0L,
    val formattedAppPeriodTime: String = "0 min",
    val webPeriodSeconds: Long = 0L,
    val formattedWebPeriodTime: String = "0 min",
    val historicTotalSeconds: Long = 0L,
    val formattedHistoricTotalTime: String = "0 min",
    val formattedLastActiveDateTime: String = "Sin registro"
)

/** Pure daily aggregation shared by Admin summary/detail and JVM tests. */
object DailyActivityMath {
    const val MINIMUM_SECONDS = 300L
    fun duration(seconds: Long): String {
        val minutes = seconds.coerceAtLeast(0) / 60
        return when { seconds <= 0 -> "0 min"; minutes == 0L -> "Menos de 1 min"
            minutes < 60 -> "$minutes min"; minutes % 60 == 0L -> "${minutes / 60} h"
            else -> "${minutes / 60} h ${minutes % 60} min" }
    }
    fun validRange(start: String, end: String): Boolean = runCatching {
        !LocalDate.parse(start).isAfter(LocalDate.parse(end))
    }.getOrDefault(false)
    fun dates(start: String, end: String): List<String> {
        if (!validRange(start, end)) return emptyList()
        val first = LocalDate.parse(start).toEpochDay()
        val last = LocalDate.parse(end).toEpochDay()
        return (first..last).map { LocalDate.ofEpochDay(it).toString() }
    }
    fun dateAt(millis: Long, zone: ZoneId = ZoneId.systemDefault()): String =
        Instant.ofEpochMilli(millis).atZone(zone).toLocalDate().toString()

    // The foreground duration comes from elapsedRealtime, not from a mutable wall clock.
    fun splitInterval(endMillis: Long, durationMillis: Long, zone: ZoneId = ZoneId.systemDefault()): Map<String, Long> {
        if (durationMillis <= 0) return emptyMap()
        val result = linkedMapOf<String, Long>()
        var cursor = endMillis - durationMillis
        while (cursor < endMillis) {
            val day = Instant.ofEpochMilli(cursor).atZone(zone).toLocalDate()
            val boundary = day.plusDays(1).atStartOfDay(zone).toInstant().toEpochMilli()
            val stop = minOf(boundary, endMillis)
            result[day.toString()] = (result[day.toString()] ?: 0L) + stop - cursor
            cursor = stop
        }
        return result
    }
    fun readSeconds(data: Map<String, Any>, field: String): Map<String, Long> {
        val result = linkedMapOf<String, Long>()
        (data[field] as? Map<*, *>)?.forEach { (key, value) ->
            val date = key as? String ?: return@forEach
            if (runCatching { LocalDate.parse(date) }.isSuccess && value is Number)
                result[date] = value.toLong().coerceAtLeast(0)
        }
        // Previous set(..., merge) wrote literal dotted fields. Keep those original values intact.
        data.filterKeys { it.startsWith("$field.") }.forEach { (key, value) ->
            val date = key.removePrefix("$field.")
            if (runCatching { LocalDate.parse(date) }.isSuccess && value is Number)
                result[date] = (result[date] ?: 0L) + value.toLong().coerceAtLeast(0)
        }
        return result
    }
    fun summary(uid: String, email: String, name: String, photo: String?, data: Map<String, Any>,
        start: String, end: String, today: String): TesterSummary {
        val total = readSeconds(data, "testerDailySeconds")
        val app = readSeconds(data, "testerDailyApp")
        val web = readSeconds(data, "testerDailyWeb")
        val lastRecorded = data["lastTesterActiveDate"] as? String ?: ""
        val historical = (data["activityDates"] as? List<*>)?.filterIsInstance<String>().orEmpty().toSet()
        val measured = total.keys + app.keys + web.keys
        val evidence = measured + historical + listOf(lastRecorded)
        val last = evidence.filter { runCatching { LocalDate.parse(it) }.isSuccess && it <= today }.maxOrNull().orEmpty()
        val items = dates(start, minOf(end, today)).map { date ->
            val seconds = maxOf(total[date] ?: 0, (app[date] ?: 0) + (web[date] ?: 0))
            val entered = date in evidence
            val unknownDuration = entered && date !in measured
            DailyActivityItem(date, shortDate(date), seconds, app[date] ?: 0, web[date] ?: 0,
                when { !entered -> "Sin registro"; unknownDuration -> "Actividad registrada · duración desconocida"
                    else -> "${duration(seconds)} · ${if (seconds >= MINIMUM_SECONDS) "5 min o más" else "Menos de 5 min"}" },
                entered, isHistoricalOnly = unknownDuration)
        }
        val active = items.count { it.isActive }
        val longVisits = items.count { it.isActive && it.activeSeconds >= MINIMUM_SECONDS }
        return TesterSummary(uid = uid, email = email.ifBlank { "Cuenta sin correo" }, displayName = name, photoUrl = photo,
            activeDaysCount = active, inactiveDaysCount = items.size - active,
            longVisitDaysCount = longVisits, shortVisitDaysCount = items.count { it.isActive && !it.isHistoricalOnly && it.activeSeconds < MINIMUM_SECONDS },
            totalSeconds = items.sumOf { it.activeSeconds }, lastActiveDate = last,
            formattedTotalTime = duration(items.sumOf { it.activeSeconds }),
            formattedAverage = duration(if (active == 0) 0 else items.sumOf { it.activeSeconds } / active),
            appPeriodSeconds = items.sumOf { it.appSeconds }, formattedAppPeriodTime = duration(items.sumOf { it.appSeconds }),
            webPeriodSeconds = items.sumOf { it.webSeconds }, formattedWebPeriodTime = duration(items.sumOf { it.webSeconds }),
            historicalRecoveredDates = historical,
            formattedLastActive = if (last.isBlank()) "Sin registro" else shortDate(last),
            formattedLastActiveDateTime = if (last.isBlank()) "Sin registro" else shortDate(last), dailyItems = items)
    }
    fun shortDate(date: String): String = runCatching {
        val parsed = LocalDate.parse(date)
        "${parsed.dayOfMonth} ${listOf("ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic")[parsed.monthValue - 1]} ${parsed.year}"
    }.getOrDefault(date)
}
