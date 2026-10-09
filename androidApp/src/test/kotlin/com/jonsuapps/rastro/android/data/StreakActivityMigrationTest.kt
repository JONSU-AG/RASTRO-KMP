package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.gamification.GamificationState
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDate

class StreakActivityMigrationTest {
    @Test fun loginExceptionRequiresVerifiedAdminAndDoesNotInventMissingDays() {
        val day = LocalDate.parse("2026-10-09")
        val state = GamificationState(streak = 1, lastStudyDate = day.toString(), coins = 500)
        val accesses = mapOf<String, Any>("testerDailyApp" to mapOf("2026-10-07" to 1, "2026-10-08" to 2))
        assertEquals(state, StreakActivityMigration.recoverAdminAccess(state, accesses, false, day))
        val repaired = StreakActivityMigration.recoverAdminAccess(state, accesses, true, day)
        assertEquals(3, repaired.streak)
        assertEquals(500, repaired.coins)
        assertEquals(repaired, StreakActivityMigration.recoverAdminAccess(repaired, accesses, true, day))
        val gap = mapOf<String, Any>("testerDailyApp" to mapOf("2026-10-07" to 1, "2026-10-10" to 5))
        assertEquals(1, StreakActivityMigration.recoverAdminAccess(state, gap, true, day).streak)
    }
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
    @Test fun resetStreakIsRebuiltFromContinuousEvidenceForAnyAccount() {
        val end=LocalDate.parse("2026-10-08")
        val evidence=(0L..14L).map {end.minusDays(it).toString()}.toSet()
        val broken=GamificationState(streak=2,bestStreak=14,lastStudyDate=end.toString(),activityDates=evidence,coins=123,streakActivityVersion=1)
        val repaired=StreakActivityMigration.recover(broken,emptyMap(),end)
        assertEquals(15,repaired.streak)
        assertEquals(123,repaired.coins)
        assertEquals(2,repaired.streakActivityVersion)
        assertEquals(repaired,StreakActivityMigration.recover(repaired,emptyMap(),end))
    }
    @Test fun oldMaximumAndMissingDaysCannotRestoreCurrentStreak() {
        val end=LocalDate.parse("2026-10-08")
        val broken=GamificationState(streak=2,bestStreak=14,lastStudyDate=end.toString(),activityDates=setOf("2026-10-05","2026-10-07","2026-10-08"))
        assertEquals(2,StreakActivityMigration.reconstruct(broken,end).streak)
        val old=broken.copy(streak=14,lastStudyDate="2026-10-01",activityDates=emptySet())
        assertEquals("2026-10-01",StreakActivityMigration.reconstruct(old,end).lastStudyDate)
    }
    @Test fun migrationDoesNotApplyOldFiveMinuteRuleToNewDates() {
        val end=LocalDate.parse("2026-10-10")
        val state=GamificationState(streak=2,lastStudyDate="2026-10-07",streakActivityVersion=1)
        val profile=mapOf<String,Any>("testerDailyApp" to mapOf("2026-10-08" to 300L,"2026-10-09" to 300L))
        val result=StreakActivityMigration.recover(state,profile,end)
        assertFalse("2026-10-08" in result.activityDates)
        assertEquals("2026-10-07",result.lastStudyDate)
    }
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
