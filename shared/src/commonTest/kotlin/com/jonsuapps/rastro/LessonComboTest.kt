package com.jonsuapps.rastro

import com.jonsuapps.rastro.model.*
import kotlin.test.*

class LessonComboTest {
    @Test fun chainCapsAtFiveAndEmitsOnlyActualMilestones() {
        var state = LessonComboState()
        val events = mutableListOf<ComboEvent>()
        for (i in 1..9) {
            val update = state.answer("question-$i", true)
            state = update.state
            events += update.events
            assertEquals(i.coerceAtMost(5), state.value)
        }
        assertEquals<List<ComboEvent>>((2..5).map { ComboEvent.Reached(it) }, events)
    }

    @Test fun failureBreaksChainAndRearmsMaximum() {
        var state = LessonComboState()
        repeat(5) { state = state.answer("first-$it", true).state }
        val broken = state.answer("wrong", false)
        assertEquals(0, broken.state.value)
        assertEquals(listOf(ComboEvent.Broken(5)), broken.events)
        state = broken.state
        repeat(4) { state = state.answer("second-$it", true).state }
        val maximum = state.answer("second-4", true)
        assertEquals(listOf(ComboEvent.Reached(5)), maximum.events)
        assertTrue(maximum.state.answer("second-4", true).events.isEmpty())
    }

    @Test fun repeatedCallbacksCannotCountOrBreakTheSameAttemptTwice() {
        val answered = LessonComboState().answer("normal:1:q", true).state
        assertEquals(answered, answered.answer("normal:1:q", true).state)
        assertEquals(answered, answered.answer("normal:1:q", false).state)
        val retry = answered.answer("redemption:1:q", false)
        assertEquals(0, retry.state.value)
        assertTrue(retry.state.answer("redemption:1:q", false).events.isEmpty())
    }

    @Test fun restoringProcessedAttemptsDoesNotReplayMaximumAndNewSessionStartsAtZero() {
        var state = LessonComboState()
        repeat(5) { state = state.answer("q-$it", true).state }
        val restored = LessonComboState(state.value, state.answeredAttempts.toSet())
        assertTrue(restored.answer("q-4", true).events.isEmpty())
        assertTrue(restored.answer("q-5", true).events.isEmpty())
        assertEquals(5, restored.answer("q-5", true).state.value)
        assertEquals(0, LessonComboState().value)
        assertTrue(LessonComboState().answer("wrong-first", false).events.isEmpty())
    }
}
