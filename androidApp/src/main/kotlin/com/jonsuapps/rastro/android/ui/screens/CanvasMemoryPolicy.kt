package com.jonsuapps.rastro.android.ui.screens

import kotlin.math.sqrt

/** Shared budget for canvas + undo + one temporary resize buffer, measured in bytes. */
internal object CanvasMemoryPolicy {
    fun budget(heapBytes: Long): Long = (heapBytes / 8).coerceIn(4L * 1024 * 1024, 32L * 1024 * 1024)
    fun dimensions(width: Int, height: Int, budget: Long): Pair<Int, Int> {
        require(width > 0 && height > 0)
        val maxPixels = (budget / 3 / 4).coerceAtLeast(1)
        val scale = sqrt(maxPixels.toDouble() / (width.toLong() * height)).coerceAtMost(1.0)
        return (width * scale).toInt().coerceAtLeast(1) to (height * scale).toInt().coerceAtLeast(1)
    }
    fun undoLimit(bitmapBytes: Long, budget: Long): Int =
        if (bitmapBytes <= 0) 0 else ((budget / bitmapBytes) - 2).coerceIn(0, 12).toInt()
}
