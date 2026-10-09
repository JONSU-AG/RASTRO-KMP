package com.jonsuapps.rastro

import com.jonsuapps.rastro.gamification.GamificationState
import com.jonsuapps.rastro.gamification.GamificationStateCodec
import com.jonsuapps.rastro.monetization.CoinRewardPolicy
import kotlin.test.*

class CoinRewardPolicyTest {
    @Test fun receiptSurvivesSaveAndIsNotAwardedTwice() {
        val awarded = CoinRewardPolicy.apply(GamificationState(coins = 10), "promo_HOLA", 50)
        val restored = GamificationStateCodec.decode(GamificationStateCodec.encode(awarded))
        assertEquals(60, restored.coins)
        assertEquals(restored, CoinRewardPolicy.apply(restored, "promo_HOLA", 50))
        assertEquals(110, CoinRewardPolicy.apply(restored, "gift_2", 50).coins)
    }
    @Test fun invalidCreditsAndOverflowDoNotChangeWallet() {
        val wallet = GamificationState(coins = 10)
        listOf(0, -1, 1_000_001).forEach { assertEquals(wallet, CoinRewardPolicy.apply(wallet, "gift", it)) }
        assertEquals(wallet, CoinRewardPolicy.apply(wallet, "", 1))
        val maximum = GamificationState(coins = Int.MAX_VALUE)
        assertEquals(maximum, CoinRewardPolicy.apply(maximum, "gift", 1))
    }
    @Test fun olderStatesHaveNoReceiptsAndCodesRejectPaths() {
        assertTrue(GamificationStateCodec.decode("{\"coins\":7}").coinRewardReceipts.isEmpty())
        assertEquals("HOLA-2026", CoinRewardPolicy.normalizeCode(" hola-2026 "))
        assertTrue(CoinRewardPolicy.validCode("HOLA_2026"))
        listOf("AB", "A/B", "a b", "A".repeat(33)).forEach { assertFalse(CoinRewardPolicy.validCode(it)) }
    }
    @Test fun millionCoinGiftIsAppliedOnceAndDoesNotOverflow() {
        val credited = CoinRewardPolicy.apply(GamificationState(coins = 200), "promo_MILLON", 1_000_000)
        assertEquals(1_000_200, credited.coins)
        assertEquals(credited, CoinRewardPolicy.apply(credited, "promo_MILLON", 1_000_000))
        val full = GamificationState(coins = Int.MAX_VALUE - 500_000)
        assertEquals(full, CoinRewardPolicy.apply(full, "gift", 1_000_000))
    }
}
