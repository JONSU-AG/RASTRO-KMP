package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.android.ui.mascots.loki.*

/** Lesson-only timing: one counter finishes before the next begins. */
internal object LessonResultTiming {
    const val COUNT_SECONDS = .9f
    fun countStart(index: Int) = rewardCardStart(index) + .48f
    fun count(target: Int, index: Int, seconds: Float) =
        rewardCount(target, rewardProgress(seconds, countStart(index), COUNT_SECONDS))

    enum class Pulse { COUNT, STAR }
    fun pulse(before: Float, after: Float, values: List<Int>, stars: Int): Pulse? {
        // Restoring, seeking or resuming must not replay a backlog of impacts.
        if (!before.isFinite() || !after.isFinite() || after <= before || after - before > .15f) return null
        fun crossed(mark: Float) = mark > before && mark <= after
        if ((0 until stars.coerceIn(0, 3)).any { crossed(rewardStarStart(RewardScene.RESULTS, it) + .3f) })
            return Pulse.STAR
        if (values.indices.any { index -> values[index] > 0 && (0..4).any {
                crossed(countStart(index) + .12f + it * .16f)
            } }) return Pulse.COUNT
        return null
    }
}
