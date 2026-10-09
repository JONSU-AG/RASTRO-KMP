package com.jonsuapps.rastro

import com.jonsuapps.rastro.monetization.*
import kotlin.test.*

class ProAccessSourcesTest {
    @BeforeTest fun reset() = ProAccess.clear()
    @AfterTest fun cleanup() = ProAccess.clear()
    @Test fun manualListenerCannotErasePaidAccess() {
        ProAccess.updatePurchased(ProGrant("ANNUAL", 0, null, true, "paid"))
        ProAccess.update(ProGrant())
        assertTrue(ProAccess.active(10))
        assertEquals("paid", ProAccess.grant.value.grantId)
    }
    @Test fun refundCannotEraseAnAdminGift() {
        ProAccess.update(ProGrant("PERMANENT", 0, null, true, "gift"))
        ProAccess.updatePurchased(ProGrant())
        assertTrue(ProAccess.active(10))
        assertEquals("gift", ProAccess.grant.value.grantId)
    }
    @Test fun expiryFallsBackToPaidAndAccountChangeClearsBoth() {
        ProAccess.update(ProGrant("MONTHLY", 0, 20, true, "gift"))
        ProAccess.updatePurchased(ProGrant("ANNUAL", 0, 40, true, "paid"))
        ProAccess.refresh(19)
        assertEquals("gift", ProAccess.grant.value.grantId)
        ProAccess.refresh(20)
        assertEquals("paid", ProAccess.grant.value.grantId)
        assertFalse(ProAccess.active(40))
        ProAccess.clear()
        assertFalse(ProAccess.active(10))
    }
}
