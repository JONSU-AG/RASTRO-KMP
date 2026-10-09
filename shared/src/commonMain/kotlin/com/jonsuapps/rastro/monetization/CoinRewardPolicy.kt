package com.jonsuapps.rastro.monetization

import com.jonsuapps.rastro.gamification.GamificationState

/** Gifts use the existing wallet; Pro never multiplies administrative credits. */
object CoinRewardPolicy {
    const val MAX_REWARD = 1_000_000
    fun apply(state: GamificationState, receipt: String, amount: Int): GamificationState {
        if (receipt.isBlank() || amount !in 1..MAX_REWARD || receipt in state.coinRewardReceipts ||
            state.coins > Int.MAX_VALUE - amount) return state
        return state.copy(coins = state.coins + amount, coinRewardReceipts = state.coinRewardReceipts + receipt)
    }
    fun normalizeCode(input: String): String = input.trim().uppercase()
    fun validCode(code: String): Boolean = Regex("[A-Z0-9_-]{3,32}").matches(code)
}
