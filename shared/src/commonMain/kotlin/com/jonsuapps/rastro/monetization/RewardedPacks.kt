package com.jonsuapps.rastro.monetization
import kotlinx.serialization.Serializable

/** Offer terms are frozen when a pack starts, even if Admin changes the catalog later. */
@Serializable
data class RewardPackProgress(val sessionId: String, val offerId: String, val required: Int, val coins: Int,
    val receipts: Set<String> = emptySet(), val claimed: Boolean = false) {
    val complete get() = receipts.size >= required
    fun confirm(receipt: String): RewardPackProgress = if(receipt.isBlank() || claimed || complete) this else copy(receipts = receipts + receipt)
    fun claim(): Pair<RewardPackProgress,Int> = if(!complete || claimed) this to 0 else copy(claimed=true) to coins
}
