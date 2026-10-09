package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.ui.screens.PeriodicElementCatalog
import com.jonsuapps.rastro.android.widgets.UnsaExamDates
import org.junit.Assert.*
import org.junit.Test

class HomeToolsTest {
    @Test fun periodicZoomIsBoundedAndRejectsInvalidGestureFactors() {
        assertEquals(2.25f, com.jonsuapps.rastro.android.ui.screens.boundedPeriodicZoom(1f, 9f), 0f)
        assertEquals(0.6f, com.jonsuapps.rastro.android.ui.screens.boundedPeriodicZoom(1f, 0.1f), 0f)
        assertEquals(1f, com.jonsuapps.rastro.android.ui.screens.boundedPeriodicZoom(1f, Float.NaN), 0f)
        assertEquals(1.2f, com.jonsuapps.rastro.android.ui.screens.boundedPeriodicZoom(1f, 1.2f), 0f)
    }
    @Test fun periodicTableIsCompleteWithUniquePositionsAndSymbols() {
        val elements = PeriodicElementCatalog.elements
        assertEquals((1..118).toList(), elements.map { it.number })
        assertEquals(118, elements.map { it.symbol }.toSet().size)
        assertEquals(118, elements.map(PeriodicElementCatalog::tablePosition).toSet().size)
        assertTrue(elements.all { it.name.isNotBlank() && it.mass.isNotBlank() })
        assertEquals(8 to 3, PeriodicElementCatalog.tablePosition(elements[56]))
        assertEquals(9 to 17, PeriodicElementCatalog.tablePosition(elements[102]))
        assertEquals(7 to 18, PeriodicElementCatalog.tablePosition(elements.last()))
    }
    @Test fun defaultExamUsesKnowledgeOnlyAndKeepsExamDayIncluded() {
        assertEquals("2026-11-01", UnsaExamDates.nearestKnowledgeExam("2026-10-08")?.date)
        assertEquals("2026-11-01", UnsaExamDates.nearestKnowledgeExam("2026-11-01")?.date)
        assertEquals("2027-03-14", UnsaExamDates.nearestKnowledgeExam("2027-02-01")?.date)
        assertNull(UnsaExamDates.nearestKnowledgeExam("2027-03-21"))
    }
}
