package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.ui.components.CoverPlacement
import org.junit.Assert.assertEquals
import org.junit.Test

class CoverPlacementTest {
    @Test fun corruptOrLegacyCropFallsBackToVisibleImage() {
        assertEquals(CoverPlacement(), CoverPlacement(Float.NaN, Float.POSITIVE_INFINITY, Float.NaN).bounded())
    }
    @Test fun ExtremeCropCannotExposeOutsideZoomBounds() {
        assertEquals(CoverPlacement(3f, -1f, 1f), CoverPlacement(10f, -8f, 4f).bounded())
        assertEquals(CoverPlacement(1f, 0.4f, -0.2f), CoverPlacement(0f, 0.4f, -0.2f).bounded())
    }
}
