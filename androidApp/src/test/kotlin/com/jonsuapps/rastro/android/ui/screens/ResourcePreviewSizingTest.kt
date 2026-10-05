package com.jonsuapps.rastro.android.ui.screens

import org.junit.Assert.*
import org.junit.Test

class ResourcePreviewSizingTest {
    @Test fun enlargementIsTwelvePercentAndAlwaysFitsTheWindow() {
        for (window in listOf(320f, 411f, 600f, 840f, 1280f, 1920f)) {
            val previous = minOf(560f, window - 48f) * .96f
            assertEquals(minOf(window * .96f, previous * 1.12f), resourceDialogWidth(window), .01f)
            assertTrue(resourceDialogWidth(window) > previous)
            assertTrue(resourceDialogWidth(window) <= window * .96f)
        }
    }
}
