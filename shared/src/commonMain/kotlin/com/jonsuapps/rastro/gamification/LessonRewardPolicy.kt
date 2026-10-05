package com.jonsuapps.rastro.gamification

/** One policy for previews and actual delivery. earnedCoins tracks the star entitlement, not replay income. */
data class LessonReward(val xp: Int, val coins: Int, val starEntitlement: Int)
object LessonRewardPolicy {
    const val COINS_PER_STAR = 10
    const val REPLAY_COINS_PER_STAR = 2
    fun quote(previous: LessonCompletion?, fullXp: Int, stars: Int): LessonReward {
        val safeStars = stars.coerceIn(0, 3)
        val replay = previous != null && !previous.skipped
        val entitlement = maxOf(if (replay) previous!!.stars.coerceIn(0, 3) else 0, safeStars) * COINS_PER_STAR
        val unpaid = (entitlement - if (replay) previous!!.earnedCoins.coerceAtLeast(0) else 0).coerceAtLeast(0)
        return LessonReward(if (replay) fullXp.coerceAtLeast(0) / 5 else fullXp.coerceAtLeast(0),
            unpaid + if (replay) safeStars * REPLAY_COINS_PER_STAR else 0, entitlement)
    }
    /** Pay only the missing entitlement, so reloads and spent balances cannot duplicate the grant. */
    fun reconcileLegacy(state: GamificationState): GamificationState {
        var credit = 0
        val lessons = state.completedLessons.mapValues { (_, completion) ->
            val entitled = if (completion.skipped) 0 else completion.stars.coerceIn(0, 3) * COINS_PER_STAR
            val missing = (entitled - completion.earnedCoins.coerceAtLeast(0)).coerceAtLeast(0)
            credit += missing
            if (missing > 0) completion.copy(earnedCoins = entitled) else completion
        }
        return state.copy(coins = state.coins.coerceAtLeast(0) + credit, completedLessons = lessons)
    }
}
