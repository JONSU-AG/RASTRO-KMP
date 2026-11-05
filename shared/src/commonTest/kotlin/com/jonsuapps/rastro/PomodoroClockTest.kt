package com.jonsuapps.rastro

import com.jonsuapps.rastro.pomodoro.*
import kotlin.test.*

class PomodoroClockTest {
    @Test fun pauseAndResumeKeepTimeWithoutTheScreenTicking() {
        val initial = PomodoroState(timeLeftSeconds = 60)
        val started = PomodoroClock.edit(initial, initial.copy(isRunning = true), 0, 10000)
        assertEquals(70000L, started.deadlineMillis)
        val paused = PomodoroClock.edit(started.state, started.state.copy(isRunning = false), started.deadlineMillis, 30000)
        assertEquals(40, paused.state.timeLeftSeconds)
        assertEquals(0L, paused.deadlineMillis)
        val resumed = PomodoroClock.edit(paused.state, paused.state.copy(isRunning = true), 0, 90000)
        assertEquals(130000L, resumed.deadlineMillis)
    }

    @Test fun mutingDoesNotRestartAndAddingFiveMinutesExtendsTheAlarm() {
        val running = PomodoroState(timeLeftSeconds = 50, isRunning = true)
        val muted = PomodoroClock.edit(running, running.copy(soundEnabled = false), 60000, 12000)
        assertEquals(60000L, muted.deadlineMillis)
        assertEquals(48, muted.state.timeLeftSeconds)
        val extended = PomodoroClock.edit(muted.state, muted.state.copy(timeLeftSeconds = 348), 60000, 12000)
        assertEquals(360000L, extended.deadlineMillis)
        val reset = PomodoroClock.edit(extended.state, extended.state.copy(timeLeftSeconds = 1500, isRunning = false), 360000, 13000)
        assertEquals(0L, reset.deadlineMillis)
        assertEquals(1500, reset.state.timeLeftSeconds)
    }

    @Test fun sleepingScreenDoesNotLoseElapsedTime() {
        val deadline = 25 * 60 * 1000L
        assertEquals(1500, PomodoroClock.remainingSeconds(deadline, 0))
        assertEquals(300, PomodoroClock.remainingSeconds(deadline, 20 * 60 * 1000L))
        assertEquals(0, PomodoroClock.remainingSeconds(deadline, deadline + 90000L))
        assertEquals(1, PomodoroClock.remainingSeconds(deadline, deadline - 1))
    }

    @Test fun studyCompletesOnceAndRespectsManualNextBlock() {
        val next = PomodoroClock.completed(PomodoroState(autoCycle = false))
        assertEquals(PomodoroMode.SHORT_BREAK, next.mode)
        assertEquals(1, next.completedCycles)
        assertEquals(25, next.todayStudiedMinutes)
        assertEquals(300, next.timeLeftSeconds)
        assertFalse(next.isRunning)
    }

    @Test fun configuredCyclesLeadToLongBreakAndBreakDoesNotCountAsStudy() {
        val next = PomodoroClock.completed(PomodoroState(mode = PomodoroMode.CUSTOM,
            completedCycles = 1, customCyclesBeforeLongBreak = 2, customStudyMinutes = 17,
            customLongBreakMinutes = 12, soundEnabled = false, studyAlertSound = PomodoroAlertSound.SILENT))
        assertEquals(PomodoroMode.LONG_BREAK, next.mode)
        assertEquals(720, next.timeLeftSeconds)
        assertEquals(17, next.todayStudiedMinutes)
        assertFalse(next.soundEnabled)
        assertEquals(PomodoroAlertSound.SILENT, next.studyAlertSound)
        val afterBreak = PomodoroClock.completed(next)
        assertEquals(PomodoroMode.STUDY, afterBreak.mode)
        assertEquals(2, afterBreak.completedCycles)
        assertEquals(17, afterBreak.todayStudiedMinutes)
        assertTrue(afterBreak.isRunning)
    }
}
