package com.jonsuapps.rastro.android.data

enum class ProPlayPlan(val label: String) {
    MONTHLY("Pro mensual"), SIX_MONTHS("Pro 6 meses"), ANNUAL("Pro anual"), PERMANENT("Pro permanente")
}

data class ProPlayProduct(
    val plan: ProPlayPlan,
    val productId: String? = null,
    val basePlanId: String? = null,
) {
    val subscription get() = plan != ProPlayPlan.PERMANENT
    val configured get() = !productId.isNullOrBlank() && (!subscription || !basePlanId.isNullOrBlank())
}

/** Real Google Play identifiers. Prices always come from the store. */
object PlayBillingConfig {
    const val checkoutEnabled = true
    // Android public SDK key, not the service-account JSON or a secret RevenueCat API key.
    const val revenueCatApiKey = "goog_gdXpvnmwMkNbUxVKiTdaPiILGud"
    const val entitlementId = "rastro_preuniversitario_pro"
    val products = listOf(
        ProPlayProduct(ProPlayPlan.MONTHLY, "rastro_pro", "mensual"),
        ProPlayProduct(ProPlayPlan.SIX_MONTHS, "rastro_pro", "seis-meses"),
        ProPlayProduct(ProPlayPlan.ANNUAL, "rastro_pro", "anual"),
        ProPlayProduct(ProPlayPlan.PERMANENT, "rastro_pro_permanente"),
    )
    val configuredProducts get() = products.filter { it.configured }
}
