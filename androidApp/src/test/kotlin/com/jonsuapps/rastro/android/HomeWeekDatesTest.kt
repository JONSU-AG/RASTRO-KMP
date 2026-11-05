package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.ui.screens.homeWeekDates
import org.junit.Assert.*
import org.junit.Test

class HomeWeekDatesTest {
    @Test fun utcSundayStillBelongsToSaturdayWeekInPeru() {
        val week = homeWeekDates(java.time.Instant.parse("2026-11-01T03:00:00Z").toEpochMilli())
        assertEquals("2026-10-26", week.first())
        assertEquals("2026-11-01", week.last())
        assertEquals(7, week.distinct().size)
    }
    @Test fun weekChangesAtMidnightInLimaInsteadOfMidnightUtc() {
        val before = homeWeekDates(java.time.Instant.parse("2026-11-02T04:59:00Z").toEpochMilli())
        val after = homeWeekDates(java.time.Instant.parse("2026-11-02T05:00:00Z").toEpochMilli())
        assertEquals("2026-10-26", before.first())
        assertEquals("2026-11-02", after.first())
        assertEquals("2026-11-08", after.last())
    }
}
