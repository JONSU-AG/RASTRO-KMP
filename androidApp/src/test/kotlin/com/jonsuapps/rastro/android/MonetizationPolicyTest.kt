package com.jonsuapps.rastro.android
import org.junit.Assert.*
import org.junit.Test
import com.jonsuapps.rastro.monetization.*
import com.jonsuapps.rastro.gamification.*

class MonetizationPolicyTest {
    @Test fun grantsRequireExactWindowAndCanBeRevoked() {
        val grant=ProGrant("Personalizado",100,200,true,"g")
        assertFalse(grant.active(99));assertTrue(grant.active(100));assertTrue(grant.active(199));assertFalse(grant.active(200))
        assertFalse(grant.copy(enabled=false).active(150));assertTrue(grant.copy(endsAt=null).active(900))
    }
    @Test fun firstFreePlusThreeProAttemptsThenCoins() {
        val grant=ProGrant("Permanente",0,null,true,"g")
        val config=EconomyConfig()
        val attempts=mutableListOf<EconomyAttempt>()
        assertEquals(0,EconomyPolicy.cost("SIMULACRO",attempts,ProGrant(),100,config))
        attempts+=EconomyAttempt("first","SIMULACRO",0)
        repeat(3) { assertEquals(0,EconomyPolicy.cost("SIMULACRO",attempts,grant,100,config));attempts+=EconomyAttempt("pro$it","SIMULACRO",0,"g") }
        assertEquals(75,EconomyPolicy.cost("SIMULACRO",attempts,grant,100,config))
        assertEquals(75,EconomyPolicy.cost("RANKING",attempts,grant,100,config))
        assertEquals(30,EconomyPolicy.cost("RAPIDO",attempts,grant,100,config))
    }
    @Test fun proDoublesRewardsButKeepsStarsAndDoesNotLoseLives() {
        GamificationManager.applyRestored(GamificationState(hearts=10,maxHearts=15))
        ProAccess.update(ProGrant("Permanente",0,null,true,"g"))
        val reward=GamificationManager.quoteLessonReward("test",50,3)
        assertEquals(100,reward.xp);assertEquals(60,reward.coins);assertEquals(30,reward.starEntitlement)
        GamificationManager.loseHeart();assertEquals(10,GamificationManager.hearts.value)
        ProAccess.update(ProGrant());GamificationManager.loseHeart();assertEquals(9,GamificationManager.hearts.value)
    }
    @Test fun paidAttemptIdIsChargedOnlyOnceAndRefundedOnlyOnce() {
        ProAccess.update(ProGrant());EconomySettings.update(EconomyConfig())
        GamificationManager.applyRestored(GamificationState(coins=100))
        assertTrue(GamificationManager.reserveEconomyAttempt("id","RAPIDO"));assertEquals(70,GamificationManager.state.value.coins)
        assertTrue(GamificationManager.reserveEconomyAttempt("id","RAPIDO"));assertEquals(70,GamificationManager.state.value.coins)
        GamificationManager.releaseUnstartedEconomyAttempt("id");GamificationManager.releaseUnstartedEconomyAttempt("id");assertEquals(100,GamificationManager.state.value.coins)
    }
    @Test fun zeroHeartsDoesNotGoNegativeAndBuyingAddsInsteadOfReplacing() {
        ProAccess.update(ProGrant());GamificationManager.applyRestored(GamificationState(coins=40,hearts=0,maxHearts=15))
        GamificationManager.loseHeart();assertEquals(0,GamificationManager.hearts.value)
        assertTrue(GamificationManager.buyLives(5,15));assertEquals(5,GamificationManager.hearts.value)
        assertTrue(GamificationManager.buyLives(10,25));assertEquals(15,GamificationManager.hearts.value);assertEquals(0,GamificationManager.state.value.coins)
        assertFalse(GamificationManager.buyLives(5,15))
    }
    @Test fun automaticAdsNeverInterruptAndAvoidRewardedAdjacency() {
        val config=EconomyConfig(automaticAds=true)
        fun allowed(pro:Boolean=false,admin:Boolean=false,question:Boolean=false,day:Int=4,rewarded:Long=0,count:Int=0)=EconomyPolicy.shouldAdvertise(pro,admin,question,day,2,count,0,rewarded,10_000_000,config)
        assertTrue(allowed());assertFalse(allowed(pro=true));assertFalse(allowed(admin=true));assertFalse(allowed(question=true));assertFalse(allowed(day=1));assertFalse(allowed(rewarded=9_999_999));assertFalse(allowed(count=4))
    }
    @Test fun packReceiptsAreUniqueAndPartialPacksCannotPay() {
        val pack=RewardPackProgress("s","double",2,25)
        val first=pack.confirm("r1").confirm("r1")
        assertEquals(1,first.receipts.size);assertEquals(0,first.claim().second)
        val complete=first.confirm("r2")
        assertEquals(25,complete.claim().second);assertEquals(0,complete.claim().first.claim().second)
        assertEquals(complete,complete.confirm("r3"))
    }
    @Test fun restoreKeepsAttemptLedgerAndOldSnapshotsDecode() {
        val state=GamificationState(economyAttempts=listOf(EconomyAttempt("a","SIMULACRO",0)))
        assertEquals(state,GamificationStateCodec.decode(GamificationStateCodec.encode(state)))
        assertTrue(GamificationStateCodec.decode("{} ").economyAttempts.isEmpty())
    }
}
