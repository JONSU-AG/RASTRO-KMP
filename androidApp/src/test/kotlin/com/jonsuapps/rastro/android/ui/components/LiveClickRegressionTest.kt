package com.jonsuapps.rastro.android.ui.components

import androidx.compose.runtime.AbstractApplier
import androidx.compose.runtime.Composition
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.runtime.Recomposer
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.snapshots.Snapshot
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test

class LiveClickRegressionTest {
    private class EmptyApplier : AbstractApplier<Unit>(Unit) {
        override fun insertTopDown(index: Int, instance: Unit) {}
        override fun insertBottomUp(index: Int, instance: Unit) {}
        override fun remove(index: Int, count: Int) {}
        override fun move(from: Int, to: Int, count: Int) {}
        override fun onClear() {}
    }
    private val clock = object : MonotonicFrameClock {
        override suspend fun <R> withFrameNanos(onFrame: (Long) -> R): R = onFrame(System.nanoTime())
    }

    @Test fun runningGestureAdvancesEveryQuestionUsingTheCurrentAction() = runBlocking(clock) {
        val recomposer = Recomposer(coroutineContext)
        val runner = launch(start = CoroutineStart.UNDISPATCHED) { recomposer.runRecomposeAndApplyChanges() }
        val composition = Composition(EmptyApplier(), recomposer)
        val question = mutableIntStateOf(0)
        var latest: (() -> Unit)? = null
        try {
            composition.setContent {
                val index = question.intValue
                latest = rememberLiveClick { question.intValue = index + 1 }
            }
            // Mimics pointerInput(enabled): the gesture retains the first callback instance.
            val runningGesture = latest!!
            for(expected in 1..8) {
                runningGesture()
                Snapshot.sendApplyNotifications()
                recomposer.awaitIdle()
                assertEquals(expected, question.intValue)
                assertSame(runningGesture, latest)
            }
        } finally {
            composition.dispose(); recomposer.cancel(); runner.cancelAndJoin()
        }
    }
    @Test fun retainedCounterActionUsesCurrentCountAndArea() = runBlocking(clock) {
        val recomposer = Recomposer(coroutineContext)
        val runner = launch(start = CoroutineStart.UNDISPATCHED) { recomposer.runRecomposeAndApplyChanges() }
        val composition = Composition(EmptyApplier(), recomposer)
        val area = mutableIntStateOf(0)
        val counts = androidx.compose.runtime.mutableStateMapOf(0 to 0, 1 to 0)
        var increment: (() -> Unit)? = null
        var decrement: (() -> Unit)? = null
        try {
            composition.setContent {
                val selected = area.intValue
                val count = counts[selected] ?: 0
                increment = rememberLiveClick { counts[selected] = (count + 1).coerceAtMost(5) }
                decrement = rememberLiveClick { counts[selected] = (count - 1).coerceAtLeast(0) }
            }
            val heldPlus = increment!!
            val heldMinus = decrement!!
            repeat(7) { heldPlus(); Snapshot.sendApplyNotifications(); recomposer.awaitIdle() }
            assertEquals(5, counts[0])
            repeat(3) { heldMinus(); Snapshot.sendApplyNotifications(); recomposer.awaitIdle() }
            assertEquals(2, counts[0])
            area.intValue = 1; Snapshot.sendApplyNotifications(); recomposer.awaitIdle()
            heldPlus(); Snapshot.sendApplyNotifications(); recomposer.awaitIdle()
            assertEquals(1, counts[1]); assertEquals(2, counts[0])
        } finally { composition.dispose(); recomposer.cancel(); runner.cancelAndJoin() }
    }

}
