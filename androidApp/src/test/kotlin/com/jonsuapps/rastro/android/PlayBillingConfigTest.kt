package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.data.*
import org.junit.Assert.*
import org.junit.Test

class PlayBillingConfigTest {
    @Test fun checkoutUsesRealAndroidStoreAndExistingEntitlement() {
        assertTrue(PlayBillingConfig.checkoutEnabled)
        assertTrue(PlayBillingConfig.revenueCatApiKey.startsWith("goog_"))
        assertEquals("rastro_preuniversitario_pro", PlayBillingConfig.entitlementId)
    }
    @Test fun accountBindingIsStableAndDoesNotRevealUid() {
        val hash = PlayBillingRepository.accountHash("example-user")
        assertEquals(64, hash.length)
        assertEquals(hash, PlayBillingRepository.accountHash("example-user"))
        assertNotEquals(hash, PlayBillingRepository.accountHash("another-user"))
    }
    @Test fun productionPlansHaveDistinctBasePlansAndOnePermanentProduct() {
        assertEquals(4, PlayBillingConfig.products.size)
        assertEquals(4, PlayBillingConfig.configuredProducts.size)
        assertEquals(setOf("mensual", "seis-meses", "anual"), PlayBillingConfig.products.filter { it.subscription }.map { it.basePlanId }.toSet())
        assertEquals("rastro_pro_permanente", PlayBillingConfig.products.single { !it.subscription }.productId)
    }
    @Test fun subscriptionsRequireAnExplicitBasePlan() {
        assertFalse(ProPlayProduct(ProPlayPlan.MONTHLY, "test-product").configured)
        assertTrue(ProPlayProduct(ProPlayPlan.MONTHLY, "test-product", "test-base-plan").configured)
    }
    @Test fun oneTimeProductDoesNotRequireASubscriptionPlan() {
        assertTrue(ProPlayProduct(ProPlayPlan.PERMANENT, "test-product").configured)
        assertFalse(ProPlayProduct(ProPlayPlan.PERMANENT, " ").configured)
        assertFalse(ProPlayProduct(ProPlayPlan.PERMANENT).subscription)
    }
}
