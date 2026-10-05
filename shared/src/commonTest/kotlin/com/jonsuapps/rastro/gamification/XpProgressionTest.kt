package com.jonsuapps.rastro.gamification

import com.jonsuapps.rastro.model.LeagueCatalog
import kotlin.test.*

class XpProgressionTest {
    @Test fun everyBoundaryUsesTheSameCurveAsTheHudAndLeagues() {
        for (level in 1..100) {
            val min = XpProgression.minimumXp(level)
            assertEquals(level, GamificationState(xp = min).level)
            assertEquals(0f, GamificationState(xp = min).levelProgressFraction)
            val required = XpProgression.requiredForNext(level)
            assertEquals(min + required, XpProgression.minimumXp(level + 1))
            assertEquals(level, XpProgression.level(min + required - 1))
        }
        assertEquals(listOf(0, 1100, 3600, 12350, 26100), LeagueCatalog.all.map { it.minXp })
    }
    @Test fun restoresAccumulatedXpWithoutChangingBalanceAndHandlesBounds() {
        val state = GamificationStateCodec.decode(GamificationStateCodec.encode(GamificationState(xp = 925, coins = 30)))
        assertEquals(925, state.xp)
        assertEquals(30, state.coins)
        assertEquals(4, state.level)
        assertEquals(175, state.currentLevelProgress)
        assertEquals(1, XpProgression.level(-1))
        assertTrue(XpProgression.level(Int.MAX_VALUE) > 9000)
        assertEquals(Int.MAX_VALUE, XpProgression.minimumXp(Int.MAX_VALUE))
    }
}
