package com.jonsuapps.rastro.gamification

/** One curve for the HUD, level and league membership; accumulated XP is never rewritten. */
object XpProgression {
    fun minimumXp(level: Int): Int {
        val n = (level.coerceIn(1, 10001) - 1).toLong()
        return (200L * n + 25L * n * (n - 1)).coerceAtMost(Int.MAX_VALUE.toLong()).toInt()
    }
    fun level(xp: Int): Int {
        val total = xp.coerceAtLeast(0)
        var low = 1
        var high = 10000
        while (low < high) {
            val mid = (low + high + 1) / 2
            val n = (mid - 1).toLong()
            if (200L * n + 25L * n * (n - 1) <= total.toLong()) low = mid else high = mid - 1
        }
        return low
    }
    fun requiredForNext(level: Int): Int = (200L + 50L * (level.coerceAtLeast(1) - 1)).coerceAtMost(Int.MAX_VALUE.toLong()).toInt()
}
