package com.jonsuapps.rastro.android.data

import org.junit.Assert.*
import org.junit.Test

class OptionalUpdatePolicyTest {
    @Test fun neverOffersAnOlderOrInstalledVersion() {
        assertFalse(OptionalUpdatePolicy.shouldOffer(204, 204, 0, 0, 1000))
        assertFalse(OptionalUpdatePolicy.shouldOffer(204, 203, 0, 0, 1000))
        assertTrue(OptionalUpdatePolicy.shouldOffer(204, 205, 0, 0, 1000))
    }
    @Test fun closingSuppressesThatVersionForOneDayButNotANewerRelease() {
        val closed = 10_000L
        assertFalse(OptionalUpdatePolicy.shouldOffer(204, 205, 205, closed, closed + OptionalUpdatePolicy.DAY - 1))
        assertTrue(OptionalUpdatePolicy.shouldOffer(204, 205, 205, closed, closed + OptionalUpdatePolicy.DAY))
        assertTrue(OptionalUpdatePolicy.shouldOffer(204, 206, 205, closed, closed + 100))
    }
    @Test fun clockChangeCannotSuppressAnUpdateIndefinitely() {
        assertTrue(OptionalUpdatePolicy.shouldOffer(204, 205, 205, 10_000, 1000))
    }
}
