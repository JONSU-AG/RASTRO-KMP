package com.jonsuapps.rastro.android.ui.screens

import org.junit.Assert.*
import org.junit.Test

class CanvasMemoryPolicyTest {
    @Test fun phoneTabletAndExtremeDimensionsRespectBudgetWithResizeHeadroom() {
        for (heap in listOf(32L, 128L, 512L)) {
            val budget = CanvasMemoryPolicy.budget(heap * 1024 * 1024)
            for ((width, height) in listOf(720 to 1600, 2560 to 3200, 3200 to 2560, Int.MAX_VALUE to Int.MAX_VALUE)) {
                val (w, h) = CanvasMemoryPolicy.dimensions(width, height, budget)
                val bytes = w.toLong() * h * 4
                assertTrue(w > 0 && h > 0)
                assertTrue(bytes * 3 <= budget)
                val undo = CanvasMemoryPolicy.undoLimit(bytes, budget)
                assertTrue(undo in 0..12)
                assertTrue(bytes * (undo + 2) <= budget)
            }
        }
    }
    @Test fun smallCanvasPreservesResolutionAndUndoIsBounded() {
        val budget = 32L * 1024 * 1024
        assertEquals(300 to 400, CanvasMemoryPolicy.dimensions(300, 400, budget))
        assertEquals(12, CanvasMemoryPolicy.undoLimit(300L * 400 * 4, budget))
        assertEquals(0, CanvasMemoryPolicy.undoLimit(0, budget))
        assertEquals(0, CanvasMemoryPolicy.undoLimit(budget, budget))
    }
}
