package com.jonsuapps.rastro.android.data

import org.junit.Assert.*
import org.junit.Test
import java.time.Instant
import java.time.ZoneId

class DailyActivityMathTest {
    @Test fun durationIsFormattedWithoutInventingHistoricalMinutes() {
        assertEquals("1 h 25 min", DailyActivityMath.duration(5100))
        assertEquals("37 min", DailyActivityMath.duration(2220))
        val old = summary(mapOf("activityDates" to listOf("2026-10-01")))
        assertTrue(old.dailyItems.first().isHistoricalOnly)
        assertEquals("Actividad registrada · duración desconocida", old.dailyItems.first().formattedTime)
        assertEquals(0, old.shortVisitDaysCount)
    }
    private fun summary(data: Map<String, Any> = emptyMap(), start: String = "2026-10-01", end: String = "2026-10-04") =
        DailyActivityMath.summary("uid", "user@example.com", "Juan", null, data, start, end, "2026-10-04")
    @Test fun noEvidenceIsNotAnEntryEvenWithAuthDate() {
        val value = summary(mapOf("lastSignInTime" to 1791000000000L))
        assertEquals(0, value.activeDaysCount); assertEquals(4, value.inactiveDaysCount)
        assertTrue(value.dailyItems.all { it.formattedTime == "Sin registro" })
    }
    @Test fun oneMinuteAndFourMinutesUseDifferentCategories() {
        val value = summary(mapOf("testerDailyApp" to mapOf("2026-10-01" to 60L, "2026-10-02" to 360L)))
        assertEquals(2, value.activeDaysCount); assertEquals(1, value.shortVisitDaysCount); assertEquals(1, value.longVisitDaysCount)
        assertEquals("1 min · Menos de 5 min", value.dailyItems[0].formattedTime)
        assertEquals("6 min · 5 min o más", value.dailyItems[1].formattedTime)
    }
    @Test fun zeroSecondOpeningIsAnEntryAndBoundaryIsExactlyFiveMinutes() {
        val value = summary(mapOf("testerDailyApp" to mapOf("2026-10-01" to 0L, "2026-10-02" to 299L, "2026-10-03" to 300L)))
        assertEquals(3, value.activeDaysCount); assertEquals(2, value.shortVisitDaysCount); assertEquals(1, value.longVisitDaysCount)
    }
    @Test fun morningAndEveningSessionsAccumulateIntoOneDay() {
        val day = "2026-10-01"
        val sessions = listOf(120L, 180L)
        val value = summary(mapOf("testerDailyApp" to mapOf(day to sessions.sum())))
        assertEquals(1, value.activeDaysCount); assertEquals(1, value.longVisitDaysCount)
    }
    @Test fun severalOpeningsDoNotMultiplyDaysOrDoubleCountTotalAndApp() {
        val data = mapOf("testerDailyApp" to mapOf("2026-10-01" to 330L), "testerDailySeconds" to mapOf("2026-10-01" to 330L),
            "lastTesterActiveDate" to "2026-10-01")
        val value = summary(data)
        assertEquals(1, value.activeDaysCount); assertEquals(330L, value.totalSeconds)
    }
    @Test fun persistentLoginCanHaveEvidenceOnEveryDate() {
        val value = summary(mapOf("testerDailyApp" to mapOf("2026-10-01" to 10L, "2026-10-02" to 20L, "2026-10-03" to 5L)))
        assertEquals(3, value.activeDaysCount)
    }
    @Test fun rangeIsInclusiveAndRecomputesBothSummariesAndDetails() {
        val data = mapOf("testerDailyApp" to mapOf("2026-10-01" to 330L, "2026-10-04" to 60L))
        val all = summary(data); val filtered = summary(data, "2026-10-02", "2026-10-04")
        assertEquals(2, all.activeDaysCount); assertEquals(1, filtered.activeDaysCount)
        assertEquals(0, filtered.longVisitDaysCount); assertEquals(3, filtered.dailyItems.size)
        assertEquals("4 oct 2026", filtered.formattedLastActive)
    }
    @Test fun dottedLegacyAndNestedNewValuesAreRecoveredWithoutDuplicatingSources() {
        val value = summary(mapOf("testerDailyApp.2026-10-01" to 60L, "testerDailySeconds.2026-10-01" to 60L,
            "testerDailyApp" to mapOf("2026-10-01" to 240L), "testerDailySeconds" to mapOf("2026-10-01" to 240L)))
        assertEquals(300L, value.totalSeconds); assertEquals(1, value.longVisitDaysCount)
    }
    @Test fun appAndWebReuseCombinedTotalOnlyOnce() {
        val value = summary(mapOf("testerDailyApp" to mapOf("2026-10-01" to 60L), "testerDailyWeb" to mapOf("2026-10-01" to 240L),
            "testerDailySeconds" to mapOf("2026-10-01" to 300L)))
        assertEquals(300L, value.totalSeconds); assertEquals(1, value.activeDaysCount)
    }
    @Test fun midnightSplitsByLocalDayNotUtcAndKeepsSubsecondRemainders() {
        val zone = ZoneId.of("America/Lima")
        val end = Instant.parse("2026-10-02T05:01:00Z").toEpochMilli()
        val chunks = DailyActivityMath.splitInterval(end, 120000, zone)
        assertEquals(mapOf("2026-10-01" to 60000L, "2026-10-02" to 60000L), chunks)
        assertEquals("2026-10-01", DailyActivityMath.dateAt(Instant.parse("2026-10-02T03:00:00Z").toEpochMilli(), zone))
        assertEquals(999L, DailyActivityMath.splitInterval(end, 999, zone).values.sum())
    }
    @Test fun futureDaysAndInvalidRangesAreNotMarkedAbsent() {
        assertEquals(4, summary(end = "2026-10-15").dailyItems.size)
        assertEquals(0, summary(start = "2026-10-05", end = "2026-10-15").dailyItems.size)
        assertFalse(DailyActivityMath.validRange("2026-10-04", "2026-10-01"))
        assertFalse(DailyActivityMath.validRange("bad", "2026-10-01"))
    }
}
