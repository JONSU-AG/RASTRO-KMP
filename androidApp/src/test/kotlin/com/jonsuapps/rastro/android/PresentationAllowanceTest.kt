package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.gamification.GamificationState
import com.jonsuapps.rastro.monetization.*
import org.junit.Assert.*
import org.junit.Test
import org.junit.After

class PresentationAllowanceTest {
    @After fun resetRuntime() {
        PresentationMode.configure(false); ProAccess.clear(); GamificationManager.applyRestored(GamificationState())
    }
    @Test fun allowanceIsFiniteAndDoesNotRepeatAfterRestore() {
        PresentationMode.configure(true)
        try {
            ProAccess.clear()
            GamificationManager.applyRestored(GamificationState(coins=20,hearts=3))
            assertEquals(770, GamificationManager.state.value.coins)
            assertEquals(75, GamificationManager.hearts.value)
            assertFalse(ProAccess.active())
            GamificationManager.loseHeart()
            assertEquals(74, GamificationManager.hearts.value)
            val before=GamificationManager.state.value.coins
            assertTrue(GamificationManager.reserveEconomyAttempt("presentation-first", "SIMULACRO"))
            assertTrue(GamificationManager.reserveEconomyAttempt("presentation-second", "SIMULACRO"))
            assertEquals(before-75, GamificationManager.state.value.coins)
            val saved=GamificationManager.state.value
            GamificationManager.applyRestored(saved)
            assertEquals(saved.coins,GamificationManager.state.value.coins)
            assertEquals(74,GamificationManager.hearts.value)
            assertTrue(GamificationManager.buyLives(1, 15))
            assertEquals(saved.coins-15,GamificationManager.state.value.coins)
        } finally { PresentationMode.configure(false); ProAccess.clear(); GamificationManager.applyRestored(GamificationState()) }
    }
    @Test fun normalBuildDoesNotAddAllowanceAndRestoresNormalLimit() {
        PresentationMode.configure(false)
        GamificationManager.applyRestored(GamificationState(coins=7, hearts=4))
        assertEquals(7,GamificationManager.state.value.coins)
        GamificationManager.setMaxHearts(15)
        assertEquals(15,GamificationManager.maxHearts.value)
    }
}
