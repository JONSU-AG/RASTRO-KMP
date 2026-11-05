package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.ui.geometry.Offset
import org.junit.Assert.*
import org.junit.Test

class StudyInkLayoutTest {
    @Test fun highlightsFollowDocumentCoordinatesWhenTheContentScrolls() {
        val mark=studyDocumentPoint(Offset(30f,100f),-200f)
        assertEquals(Offset(30f,300f),mark)
        val sameMarkAfterScroll=studyDocumentPoint(Offset(30f,50f),-250f)
        assertEquals(mark,sameMarkAfterScroll)
    }
    @Test fun scrollingWithinTheSameAllocationBlockDoesNotRequestAnotherBitmapSize() {
        assertEquals(studyInkBufferHeight(600,-20f),studyInkBufferHeight(600,-21f))
        assertTrue(studyInkBufferHeight(600,-500f)>=1100)
        assertTrue(studyInkBufferHeight(600,-500f)>studyInkBufferHeight(600,-20f))
        assertEquals(studyInkBufferHeight(600,0f),studyInkBufferHeight(600,Float.NaN))
    }
}
