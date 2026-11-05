package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.ui.geometry.Offset
import org.junit.Assert.*
import org.junit.Test

class QuestionNotebookStateTest {
    private fun same(a:Offset,b:Offset) {assertEquals(a.x,b.x,.001f);assertEquals(a.y,b.y,.001f)}
    @Test fun zoomKeepsTheWorldPointUnderThePinchAnchor() {
        val initial=InkViewport(1.5f,-35f,80f);val anchor=Offset(100f,230f)
        val next=initial.gesture(anchor,Offset.Zero,2f)
        same(initial.world(anchor),next.world(anchor))
    }
    @Test fun panAndZoomTogetherFollowTheMovingCentroid() {
        val initial=InkViewport(.6f,10f,-20f);val anchor=Offset(75f,60f);val pan=Offset(80f,-90f)
        val next=initial.gesture(anchor,pan,1.7f)
        same(anchor+pan,next.screen(initial.world(anchor)))
    }
    @Test fun zoomClampingPreservesTheAnchor() {
        val anchor=Offset(220f,35f);val initial=InkViewport(5f,22f,-1f)
        val next=initial.gesture(anchor,Offset.Zero,100f)
        assertEquals(6f,next.zoom,0f);same(initial.world(anchor),next.world(anchor))
        assertEquals(.25f,initial.gesture(anchor,Offset.Zero,.001f).zoom,0f)
    }
    @Test fun coordinatesOutsideTheScreenAreRetained() {
        val world=Offset(-20000f,30000f);val view=InkViewport(2f,180f,-40f)
        same(world,view.world(view.screen(world)))
    }
    @Test fun invalidGesturesCannotPoisonDrawingCoordinates() {
        val view=InkViewport()
        assertEquals(view,view.gesture(Offset.Zero,Offset.Zero,Float.NaN))
        assertEquals(view,view.gesture(Offset(Float.NaN,0f),Offset.Zero,1f))
        assertEquals(view,view.gesture(Offset.Zero,Offset(Float.POSITIVE_INFINITY,0f),1f))
    }
    private class Doc(var points:Int=0,var released:Boolean=false)
    private fun cache(limit:Int=3,points:Int=100)=QuestionDocumentCache({Doc()},{it.released=true},{it.points},limit,points)
    @Test fun eachQuestionHasItsOwnDocumentAndReturningRestoresIt() {
        val cache=cache();val first=cache.document("user:attempt:q1");first.points=12
        val second=cache.document("user:attempt:q2")
        assertNotSame(first,second);assertSame(first,cache.document("user:attempt:q1"));assertEquals(12,first.points)
        assertNotSame(first,cache.document("otherUser:attempt:q1"))
    }
    @Test fun leastRecentlyUsedInactiveQuestionIsEvicted() {
        val cache=cache(2);val a=cache.document("a");val b=cache.document("b")
        cache.document("a");cache.document("c")
        assertTrue(b.released);assertFalse(a.released);assertEquals(2,cache.size)
    }
    @Test fun visibleCanvasCannotBeEvicted() {
        val cache=cache(2);val a=cache.document("a");cache.activate("a")
        val b=cache.document("b");cache.document("c")
        assertFalse(a.released);assertTrue(b.released)
    }
    @Test fun pointBudgetEvictsInactiveGeometry() {
        val cache=cache(points=20);val a=cache.document("a");a.points=15
        val b=cache.document("b");b.points=15;cache.deactivate("b")
        assertTrue(a.released);assertFalse(b.released);assertEquals(1,cache.size)
    }
    @Test fun activityDisposalReleasesAllDocuments() {
        val cache=cache();val a=cache.document("a");cache.activate("a");val b=cache.document("b")
        cache.clear();assertTrue(a.released);assertTrue(b.released);assertEquals(0,cache.size)
    }
    @Test fun progressDoesNotCountAnUnansweredCurrentQuestion() {
        val progress=QuestionProgress(1,18,0)
        assertEquals("1/18",progress.label);assertEquals(0f,progress.fraction,0f)
        assertEquals(1f/18,progress.copy(answered=1).fraction,.0001f)
    }
    @Test fun progressHandlesEmptyAndInvalidCountsWithoutOverflow() {
        assertEquals(0f,QuestionProgress(1,0,2).fraction,0f)
        assertEquals("0/0",QuestionProgress(1,-3,2).label)
        assertEquals(1f,QuestionProgress(99,18,99).fraction,0f)
        assertEquals(0f,QuestionProgress(1,18,-1).fraction,0f)
    }
    @Test fun revisitingAnExamQuestionDoesNotChangeAnsweredProgress() {
        val progress=QuestionProgress(1,80,24)
        assertEquals(progress.fraction,progress.copy(current=12).fraction,0f)
    }
    @Test fun geometryBudgetCountsSharedHistoryOnlyOnce() {
        val history=PizarraStrokeHistory()
        val first=InkStroke(listOf(InkPoint(0f,0f),InkPoint(1f,1f)),0,2f)
        val second=InkStroke(listOf(InkPoint(2f,2f)),0,2f)
        history.add(first);history.add(second)
        assertEquals(3,history.retainedPoints)
        history.undo();assertEquals(3,history.retainedPoints)
        history.redo();assertEquals(3,history.retainedPoints)
        history.release();assertEquals(0,history.retainedPoints)
    }
    @Test fun scrollCueIsAbsentWhenEverythingFitsOrAtTheEnd() {
        assertFalse(hasQuestionContentBelow(0,0))
        assertFalse(hasQuestionContentBelow(100,100))
        assertFalse(hasQuestionContentBelow(100,102))
        assertFalse(hasQuestionContentBelow(102,100))
    }
    @Test fun scrollCueOnlyTracksRealRemainingContent() {
        assertTrue(hasQuestionContentBelow(0,100))
        assertTrue(hasQuestionContentBelow(50,100))
        assertFalse(hasQuestionContentBelow(100,100))
    }
}
