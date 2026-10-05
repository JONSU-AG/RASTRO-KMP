package com.jonsuapps.rastro.android.widgets

import org.junit.Assert.*
import org.junit.Test
import java.time.Instant

class ExamCountdownTest {
    private fun time(value: String) = Instant.parse(value).toEpochMilli()

    @Test fun daysBecomeHoursOnPreviousDayAndTodayAtLimaMidnight() {
        val target = "2027-03-14"
        assertEquals(WidgetDates.Display("2", "DÍAS RESTANTES"), WidgetDates.display(target, time("2027-03-12T17:00:00Z")))
        assertEquals(WidgetDates.Display("24", "HORAS RESTANTES"), WidgetDates.display(target, time("2027-03-13T05:00:00Z")))
        assertEquals(WidgetDates.Display("18", "HORAS RESTANTES"), WidgetDates.display(target, time("2027-03-13T11:00:00Z")))
        assertEquals(WidgetDates.Display("1", "HORA RESTANTE"), WidgetDates.display(target, time("2027-03-14T04:59:59Z")))
        assertEquals(WidgetDates.Display("HOY", "ES TU EXAMEN"), WidgetDates.display(target, time("2027-03-14T05:00:00Z")))
        assertEquals(WidgetDates.Display("HOY", "ES TU EXAMEN"), WidgetDates.display(target, time("2027-03-14T12:00:00Z")))
        assertEquals(WidgetDates.Display("—", "EXAMEN FINALIZADO"), WidgetDates.display(target, time("2027-03-15T05:00:00Z")))
    }

    @Test fun scheduledRefreshMatchesNextHourOrNextLimaDayWithoutPolling() {
        val target = "2027-03-14"
        assertEquals(time("2027-03-13T05:00:00Z"), WidgetDates.nextRefresh(target, time("2027-03-12T17:00:00Z")))
        assertEquals(time("2027-03-13T12:00:00Z"), WidgetDates.nextRefresh(target, time("2027-03-13T11:30:00Z")))
        assertEquals(time("2027-03-14T05:00:00Z"), WidgetDates.nextRefresh(target, time("2027-03-14T04:59:00Z")))
        assertNull(WidgetDates.nextRefresh(target, time("2027-03-15T05:00:00Z")))
        assertNull(WidgetDates.nextRefresh("", time("2027-03-12T17:00:00Z")))
    }

    @Test fun suppliedCalendarSeparatesFiveAdmissionDatesFromFourPreliminaryDates() {
        val main = UnsaExamDates.options.filterNot { it.preliminary }
        assertEquals(listOf("2026-11-01", "2027-01-24", "2027-02-21", "2027-03-14", "2027-03-20"), main.map { it.date })
        val preliminary = UnsaExamDates.options.filter { it.preliminary }
        assertEquals(listOf("2026-10-18", "2027-01-10", "2027-02-14", "2027-03-07"), preliminary.map { it.date })
        assertEquals(9, UnsaExamDates.options.map { it.id }.distinct().size)
        assertTrue(UnsaExamDates.options.all { WidgetDates.daysUntil(it.date, time("2026-10-01T12:00:00Z")) != null })
    }

    @Test fun arbitraryPersonalDateIsSupportedAndInvalidDateIsUnconfigured() {
        assertEquals(WidgetDates.Display("2", "DÍAS RESTANTES"), WidgetDates.display("2026-07-05", time("2026-07-03T12:00:00Z")))
        assertEquals(WidgetDates.Display("—", "CONFIGURA LA FECHA"), WidgetDates.display("2027-02-30", time("2026-07-03T12:00:00Z")))
    }
}
