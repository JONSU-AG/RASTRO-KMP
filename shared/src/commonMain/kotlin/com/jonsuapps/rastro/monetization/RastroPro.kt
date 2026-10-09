package com.jonsuapps.rastro.monetization

import kotlinx.serialization.Serializable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.datetime.Clock

@Serializable
data class ProGrant(val plan: String = "", val startsAt: Long = 0, val endsAt: Long? = null, val enabled: Boolean = false, val grantId: String = "") {
    fun active(now: Long) = enabled && startsAt <= now && (endsAt == null || now < endsAt) && grantId.isNotBlank()
}
object ProAccess {
    private var manual = ProGrant()
    private var purchased = ProGrant()
    private val mutable = MutableStateFlow(ProGrant())
    val grant = mutable.asStateFlow()
    private val current = MutableStateFlow(false)
    val isActive = current.asStateFlow()
    private fun effective(now: Long) = when {
        manual.active(now) -> manual
        purchased.active(now) -> purchased
        else -> ProGrant()
    }
    fun refresh(now: Long = Clock.System.now().toEpochMilliseconds()) {
        mutable.value = effective(now); current.value = mutable.value.active(now)
    }
    fun update(value: ProGrant) { manual = value; refresh() }
    fun updatePurchased(value: ProGrant) { purchased = value; refresh() }
    fun clear() { manual = ProGrant(); purchased = ProGrant(); refresh() }
    fun active(now: Long = Clock.System.now().toEpochMilliseconds()) = effective(now).active(now)
}
@Serializable
data class RewardPack(val id: String, val name: String, val videos: Int, val coins: Int, val enabled: Boolean = true)
@Serializable
data class EconomyConfig(
    val maxLives: Int = 15, val recoveryMinutes: Long = 30,
    val fiveLivesPrice: Int = 15, val tenLivesPrice: Int = 25, val fullLivesPrice: Int = 35,
    val quickExamPrice: Int = 30, val examPrice: Int = 75,
    val automaticAds: Boolean = false, val firstAdDay: Int = 2,
    val minimumAdGapMinutes: Int = 15, val maxDailyAds: Int = 4,
    val secondDayEvery: Int = 4, val thirdDayEvery: Int = 3, val normalEvery: Int = 2,
    val packs: List<RewardPack> = listOf(RewardPack("quick", "Rápido", 1, 10), RewardPack("double", "Doble", 2, 25), RewardPack("bonus", "Pack Bonus", 3, 40), RewardPack("super", "Super Pack", 5, 65))
)
object EconomySettings {
    private val mutable = MutableStateFlow(EconomyConfig())
    val config = mutable.asStateFlow()
    fun update(value: EconomyConfig) { mutable.value = value }
}
@Serializable
data class EconomyAttempt(val id: String, val kind: String, val cost: Int, val proGrantId: String = "")
object EconomyPolicy {
    fun cost(kind: String, previous: List<EconomyAttempt>, grant: ProGrant, now: Long, config: EconomyConfig): Int {
        if (kind == "SIMULACRO" && previous.none { it.kind == kind }) return 0
        if (kind == "SIMULACRO" && grant.active(now) && previous.count { it.proGrantId == grant.grantId } < 3) return 0
        return if (kind == "RAPIDO") config.quickExamPrice else config.examPrice
    }
    fun shouldAdvertise(pro: Boolean, admin: Boolean, questionActive: Boolean, accountDay: Int, completedSessions: Int,
        shownToday: Int, lastAdAt: Long, lastRewardedAt: Long, now: Long, config: EconomyConfig): Boolean {
        if (!config.automaticAds || pro || admin || questionActive || accountDay < config.firstAdDay || shownToday >= config.maxDailyAds) return false
        val gap = config.minimumAdGapMinutes * 60_000L
        if ((lastAdAt > 0 && now - lastAdAt < gap) || (lastRewardedAt > 0 && now - lastRewardedAt < gap)) return false
        val every = when(accountDay) { 2 -> config.secondDayEvery; 3 -> config.thirdDayEvery; else -> config.normalEvery }
        return completedSessions > 0 && completedSessions % every.coerceAtLeast(1) == 0
    }
}
