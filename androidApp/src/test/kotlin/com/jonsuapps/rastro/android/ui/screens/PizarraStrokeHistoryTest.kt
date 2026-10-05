package com.jonsuapps.rastro.android.ui.screens

import org.junit.Assert.*
import org.junit.Test

class PizarraStrokeHistoryTest {
    @Test fun precisionErasePreservesOriginalStrokeAndUndoRedoOrdering() {
        val history = PizarraStrokeHistory()
        val ink = line(10f)
        val erase = InkStroke(listOf(InkPoint(50f,10f)),0,4f,true)
        history.add(ink); history.add(erase)
        assertEquals(listOf(ink,erase),history.strokes)
        history.undo(); assertEquals(listOf(ink),history.strokes)
        history.redo(); assertEquals(listOf(ink,erase),history.strokes)
        val later = line(12f)
        history.add(later)
        assertEquals(listOf(ink,erase,later),history.strokes)
    }
    @Test fun wholeStrokeEraserDoesNotRemovePrecisionEraseOperations() {
        val history = PizarraStrokeHistory()
        val erase = InkStroke(listOf(InkPoint(50f,10f)),0,4f,true)
        history.add(line(10f)); history.add(erase)
        history.beginErase()
        history.erase(InkPoint(50f,0f),InkPoint(50f,20f),2f)
        history.finishErase()
        assertEquals(listOf(erase),history.strokes)
        history.undo(); assertEquals(2,history.strokes.size)
    }
    private fun line(y: Float) = InkStroke(listOf(InkPoint(0f,y),InkPoint(100f,y)),0,2f)

    @Test fun fastEraserCrossingRemovesWholeStrokeAndCanUndoRedo() {
        val history = PizarraStrokeHistory()
        val first = line(10f); val second = line(50f)
        history.add(first); history.add(second)
        history.beginErase()
        assertTrue(history.erase(InkPoint(50f,0f),InkPoint(50f,20f),2f))
        history.finishErase()
        assertEquals(listOf(second),history.strokes)
        history.undo(); assertEquals(listOf(first,second),history.strokes)
        history.redo(); assertEquals(listOf(second),history.strokes)
    }
    @Test fun eraseGestureGroupsSeveralRemovalsAndCancellationRestoresDrawing() {
        val history = PizarraStrokeHistory()
        history.add(line(10f)); history.add(line(50f))
        val initial = history.strokes
        history.beginErase()
        history.erase(InkPoint(20f,10f),InkPoint(20f,10f),2f)
        history.erase(InkPoint(20f,50f),InkPoint(20f,50f),2f)
        history.finishErase()
        assertTrue(history.strokes.isEmpty())
        history.undo(); assertEquals(initial,history.strokes)
        history.beginErase()
        history.erase(InkPoint(20f,0f),InkPoint(20f,60f),2f)
        history.cancelErase(); assertEquals(initial,history.strokes)
    }
    @Test fun clearIsUndoableAndNewDrawingInvalidatesRedo() {
        val history = PizarraStrokeHistory()
        val first = line(5f)
        history.add(first); history.clear()
        history.undo(); assertEquals(listOf(first),history.strokes)
        history.add(line(25f)); assertFalse(history.canRedo)
    }
    @Test fun eraserMissDoesNotCreateHistoryAndRoundDotsAreErasable() {
        val history = PizarraStrokeHistory()
        val dot = InkStroke(listOf(InkPoint(40f,40f)),0,20f)
        history.add(dot)
        history.beginErase()
        assertFalse(history.erase(InkPoint(0f,0f),InkPoint(10f,0f),1f))
        history.finishErase()
        history.undo(); assertTrue(history.strokes.isEmpty())
        history.redo()
        history.beginErase()
        assertTrue(history.erase(InkPoint(50f,40f),InkPoint(50f,40f),1f))
        history.finishErase(); assertTrue(history.strokes.isEmpty())
    }
    @Test fun undoHistoryIsBounded() {
        val history = PizarraStrokeHistory()
        repeat(50) { history.add(line(it.toFloat())) }
        repeat(32) { history.undo() }
        assertFalse(history.canUndo)
        assertEquals(18,history.strokes.size)
        repeat(32) { history.redo() }
        assertEquals(50,history.strokes.size)
    }
}
