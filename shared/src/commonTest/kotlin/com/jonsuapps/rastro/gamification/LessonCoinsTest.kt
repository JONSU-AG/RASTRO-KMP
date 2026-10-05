package com.jonsuapps.rastro.gamification

import kotlin.test.*

class LessonCoinsTest {
    @AfterTest fun cleanup() { GamificationManager.restore(GamificationState()) }
    @Test fun firstCompletionAndReplaysHaveDifferentRewardsAndKeepBestStars() {
        GamificationManager.restore(GamificationState(xp = 100, coins = 7))
        GamificationManager.recordLessonCompletion("first", 25, 2, "attempt-a")
        assertEquals(27, GamificationManager.state.value.coins)
        assertEquals(125, GamificationManager.state.value.xp)
        GamificationManager.recordLessonCompletion("first", 25, 3, "attempt-b")
        // 10 missing coins for the improved third star + 6 for replay.
        assertEquals(43, GamificationManager.state.value.coins)
        assertEquals(130, GamificationManager.state.value.xp)
        assertEquals(30, GamificationManager.state.value.completedLessons.getValue("first").earnedCoins)
        GamificationManager.recordLessonCompletion("first", 25, 1, "attempt-c")
        assertEquals(45, GamificationManager.state.value.coins)
        assertEquals(135, GamificationManager.state.value.xp)
        assertEquals(3, GamificationManager.state.value.completedLessons.getValue("first").stars)
    }
    @Test fun sameAttemptCannotPayTwiceIncludingAfterRestore() {
        GamificationManager.restore(GamificationState(xp = 0))
        GamificationManager.recordLessonCompletion("lesson", 50, 3, "first")
        val paid = GamificationStateCodec.decode(GamificationStateCodec.encode(GamificationManager.state.value))
        GamificationManager.restore(paid)
        GamificationManager.recordLessonCompletion("lesson", 50, 3, "first")
        assertEquals(50, GamificationManager.state.value.xp)
        assertEquals(30, GamificationManager.state.value.coins)
        GamificationManager.recordLessonCompletion("lesson", 50, 3, "second")
        assertEquals(60, GamificationManager.state.value.xp)
        assertEquals(36, GamificationManager.state.value.coins)
    }
    @Test fun legacyStarsPaidOnlyOnceAndAlreadyPaidOrSkippedNotRecredited() {
        val old = GamificationStateCodec.decode("""{"xp":400,"coins":7,"completedLessons":{"old":{"stars":3,"completedAt":1},"partial":{"stars":2,"completedAt":2,"earnedCoins":10},"paid":{"stars":3,"completedAt":3,"earnedCoins":30},"skip":{"stars":3,"completedAt":4,"skipped":true}}}""")
        GamificationManager.restore(old)
        assertEquals(47, GamificationManager.state.value.coins)
        assertEquals(400, GamificationManager.state.value.xp)
        val migrated = GamificationManager.state.value
        GamificationManager.restore(migrated.copy(coins = 0)) // spending coins never grants entitlement again
        assertEquals(0, GamificationManager.state.value.coins)
        assertEquals(30, GamificationManager.state.value.completedLessons.getValue("old").earnedCoins)
        assertNull(GamificationManager.state.value.completedLessons["skip"])
        GamificationManager.recordLessonCompletion("skip", 25, 1)
        assertEquals(10, GamificationManager.state.value.coins)
    }
    @Test fun rewardPreviewAgreesWithManagerAndReplayIsTwentyPercent() {
        GamificationManager.restore(GamificationState(xp = 0))
        val first = LessonRewardPolicy.quote(null, 75, 3)
        GamificationManager.recordLessonCompletion("lesson", 75, 3)
        assertEquals(first.xp, GamificationManager.state.value.xp)
        assertEquals(first.coins, GamificationManager.state.value.coins)
        val again = LessonRewardPolicy.quote(GamificationManager.state.value.completedLessons["lesson"], 75, 3)
        assertEquals(LessonReward(15, 6, 30), again)
        GamificationManager.recordLessonCompletion("lesson", 75, 3)
        assertEquals(90, GamificationManager.state.value.xp)
        assertEquals(36, GamificationManager.state.value.coins)
    }
}
