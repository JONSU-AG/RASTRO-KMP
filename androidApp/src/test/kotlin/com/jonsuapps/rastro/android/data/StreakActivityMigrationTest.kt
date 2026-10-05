package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.gamification.GamificationState
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDate

class StreakActivityMigrationTest {
    @Test fun presenceNeedsFifteenMinutesAndOpeningDoesNotEarnIt() {
        val manager = com.jonsuapps.rastro.gamification.GamificationManager
        val saved = manager.state.value
        val yesterday = LocalDate.now().minusDays(1).toString()
        try {
            manager.applyRestored(GamificationState(streak = 12, lastStudyDate = yesterday, activityDates = setOf(yesterday)))
            manager.recordActiveStudyTime(899)
            assertEquals(yesterday, manager.state.value.lastStudyDate)
            manager.recordActiveStudySeconds(1)
            assertEquals(LocalDate.now().toString(), manager.state.value.lastStudyDate)
            assertEquals(13, manager.state.value.streak)
            manager.recordActiveStudySeconds(900)
            assertEquals(13, manager.state.value.streak)
            manager.applyRestored(GamificationState())
            assertFalse(LocalDate.now().toString() in manager.state.value.activityDates)
        } finally { manager.applyRestored(saved) }
    }
    @Test fun staleLocalProgressCannotReplaceNewerRemoteStreakOrInventCoins() {
        val local = GamificationState(streak = 10, lastStudyDate = "2026-10-01", coins = 100)
        val remote = GamificationState(streak = 12, lastStudyDate = "2026-10-03", coins = 20)
        val merged = StreakActivityMigration.merge(local, remote)
        assertEquals(12, merged.streak)
        assertEquals(remote.lastStudyDate, merged.lastStudyDate)
        assertEquals(20, merged.coins)
    }
    private val today = LocalDate.parse("2026-10-04")
    @Test fun verifiedLegacyDaysContinueExistingStreakOnce() {
        val state = GamificationState(streak = 12, lastStudyDate = "2026-10-01")
        val profile = mapOf<String, Any>("testerDailyWeb" to mapOf("2026-10-02" to 300L, "2026-10-03" to 900L))
        val recovered = StreakActivityMigration.recover(state, profile, today)
        assertEquals(14, recovered.streak)
        assertEquals("2026-10-03", recovered.lastStudyDate)
        assertEquals(recovered, StreakActivityMigration.recover(recovered, profile, today))
    }
    @Test fun openingOrMissingDayDoesNotCreateAStreak() {
        val state = GamificationState(streak = 12, lastStudyDate = "2026-10-01")
        val profile = mapOf<String, Any>("lastTesterActiveDate" to "2026-10-03", "testerDailyWeb" to mapOf("2026-10-02" to 30L, "2026-10-03" to 900L))
        assertEquals(12, StreakActivityMigration.recover(state, profile, today).streak)
    }
    @Test fun todayUsesNewThresholdAndCannotBeRecoveredAtFiveMinutes() {
        val state = GamificationState(streak = 12, lastStudyDate = "2026-10-03")
        val profile = mapOf<String, Any>("testerDailyApp" to mapOf("2026-10-04" to 300L))
        assertEquals(state.lastStudyDate, StreakActivityMigration.recover(state, profile, today).lastStudyDate)
    }
    @Test fun groupRequiresEveryMemberAndIgnoresUnacceptedGroups() {
        val group = mapOf<String, Any>("status" to "active", "participants" to listOf("a", "b", "c"),
            "dailyActivity" to mapOf("a" to mapOf("2026-10-03" to true), "b" to mapOf("2026-10-03" to true), "c" to mapOf("2026-10-03" to true)))
        assertEquals(1, SharedStreakMath.days(group, today))
        assertEquals(0, SharedStreakMath.days(group + ("participants" to listOf("a", "b", "c", "missing")), today))
        assertEquals(0, SharedStreakMath.days(group + ("status" to "pending"), today))
    }
}
