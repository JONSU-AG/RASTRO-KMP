package com.jonsuapps.rastro.android.ui.components

import org.junit.Assert.*
import org.junit.Test

class LessonResultTimingTest {
    @Test fun countersFinishInOrderBeforeTheStars() {
        val targets = listOf(20, 150, 30)
        for (index in targets.indices) {
            assertEquals(0, LessonResultTiming.count(targets[index], index, 0f))
            val finish = LessonResultTiming.countStart(index) + LessonResultTiming.COUNT_SECONDS
            assertEquals(targets[index], LessonResultTiming.count(targets[index], index, finish))
            for (next in index + 1 until targets.size) {
                assertEquals(0, LessonResultTiming.count(targets[next], next, finish))
                assertTrue(finish < LessonResultTiming.countStart(next))
            }
        }
        assertTrue(LessonResultTiming.countStart(2) + LessonResultTiming.COUNT_SECONDS < 4.25f)
    }
    @Test fun countsAreSoftCuesAndOnlyEarnedStarsHaveImpacts() {
        assertEquals(LessonResultTiming.Pulse.COUNT, LessonResultTiming.pulse(.59f, .61f, listOf(20, 150, 30), 2))
        assertNull(LessonResultTiming.pulse(.59f, .61f, listOf(0, 150, 30), 2))
        assertEquals(LessonResultTiming.Pulse.STAR, LessonResultTiming.pulse(4.54f, 4.56f, listOf(20, 150, 30), 2))
        assertNull(LessonResultTiming.pulse(6.10f, 6.12f, listOf(20, 150, 30), 2))
        assertEquals(LessonResultTiming.Pulse.STAR, LessonResultTiming.pulse(6.10f, 6.12f, listOf(20, 150, 30), 3))
    }
    @Test fun restoringOrMovingBackDoesNotReplayVibrations() {
        assertNull(LessonResultTiming.pulse(0f, 6.5f, listOf(20, 150, 30), 3))
        assertNull(LessonResultTiming.pulse(4.56f, 4.54f, listOf(20, 150, 30), 3))
        assertNull(LessonResultTiming.pulse(4.56f, 4.56f, listOf(20, 150, 30), 3))
    }
}
