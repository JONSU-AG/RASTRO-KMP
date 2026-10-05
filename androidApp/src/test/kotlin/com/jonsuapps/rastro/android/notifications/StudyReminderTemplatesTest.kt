package com.jonsuapps.rastro.android.notifications

import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDate

class StudyReminderTemplatesTest {
    @Test fun activityUsesRealCompletionAndDoesNotCallAFrozenStreakLost() {
        val today = LocalDate.of(2026, 10, 3)
        assertEquals(ReminderActivity.LESSON_DONE, reminderActivity(today, true, "2026-10-01", 0))
        assertEquals(ReminderActivity.STILL_TIME, reminderActivity(today, false, "2026-10-02", 0))
        assertEquals(ReminderActivity.STREAK_LOST, reminderActivity(today, false, "2026-10-01", 0))
        assertEquals(ReminderActivity.STILL_TIME, reminderActivity(today, false, "2026-10-01", 1))
        assertEquals(ReminderActivity.STILL_TIME, reminderActivity(today, false, "", 0))
    }
    @Test fun editorialRoundTripPreservesActivitiesSchedulesAndDisabledMessages() {
        val rows = StudyReminderTemplates.defaults + StudyReminderTemplate("extra", ReminderActivity.LESSON_DONE,
            "Otro avance", "Mensaje del administrador", 10, 12, false)
        assertEquals(rows, StudyReminderTemplates.decode(rows.map { it.payload() }))
        assertEquals(emptyList<StudyReminderTemplate>(), StudyReminderTemplates.decode(emptyList<Any>()))
    }
    @Test fun corruptEditorialDataIsRejectedRatherThanPartlyEnabled() {
        val valid = StudyReminderTemplates.defaults.first().payload()
        assertNull(StudyReminderTemplates.decode(listOf(valid, valid)))
        assertNull(StudyReminderTemplates.decode(listOf(valid + ("activity" to "UNKNOWN"))))
        assertNull(StudyReminderTemplates.decode(listOf(valid + ("startHour" to 24))))
        assertNull(StudyReminderTemplates.decode(listOf(valid + ("body" to ""))))
    }
}
