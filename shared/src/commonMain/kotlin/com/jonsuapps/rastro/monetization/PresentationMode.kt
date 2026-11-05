package com.jonsuapps.rastro.monetization

/** Local build experience. Never grants Pro, changes store entitlements, or writes remote settings. */
object PresentationMode {
    private var configured = false
    val enabled: Boolean get() = configured
    fun configure(enabled: Boolean) { configured = enabled }
    const val allowanceReceipt = "rastro-presentation-2026-11-v1"
    const val allowanceCoins = 750
    const val allowanceLives = 75
    fun proBenefits(): Boolean = !enabled && ProAccess.active()
    fun unlimitedLives(): Boolean = proBenefits()
    fun entryCost(kind: String, previous: List<EconomyAttempt>, grant: ProGrant, now: Long, config: EconomyConfig): Int =
        EconomyPolicy.cost(kind, previous, if (enabled) ProGrant() else grant, now, config)
}
