package com.jonsuapps.rastro.android.ui.components

import org.junit.Assert.*
import org.junit.Test

class RastroAdaptiveLayoutTest {
    @Test fun phonesStaySingleColumnAndMediumDoesNotStretch() {
        listOf(320f,360f,411f,599f).forEach {
            val policy = rastroLayoutPolicy(it)
            assertEquals(RastroWindowClass.COMPACT, policy.windowClass)
            assertEquals(1, policy.columns)
            assertEquals(it, policy.feedWidth, .01f)
        }
        listOf(600f,720f,800f,839f).forEach {
            val policy = rastroLayoutPolicy(it)
            assertEquals(RastroWindowClass.MEDIUM, policy.windowClass)
            assertEquals(1, policy.columns)
            assertTrue(policy.feedWidth <= 680f)
        }
    }

    @Test fun expandedUsesOnlyColumnsWithEnoughRoom() {
        listOf(840f,900f,1024f,1200f,1600f,2560f).forEach {
            val policy = rastroLayoutPolicy(it)
            assertEquals(RastroWindowClass.EXPANDED, policy.windowClass)
            assertTrue(policy.columns >= 2)
            val cardWidth = (policy.feedWidth - 32f - (policy.columns - 1)*16f) / policy.columns
            assertTrue("$it: $cardWidth", cardWidth >= 360f)
            assertTrue(policy.feedWidth <= 1200f)
            assertTrue(policy.featureWidth <= 720f)
            assertTrue(policy.readerWidth <= 640f)
            assertTrue(policy.heroWidth <= 520f)
        }
    }

    @Test fun allMainScreenRolesFitPhoneFoldableAndTabletWindows() {
        // Home/Profile/Courses/feeds use feedWidth; Aprender keeps its single reader path.
        listOf(320f,411f,720f,800f,840f,1280f,1920f).forEach { width ->
            val p = rastroLayoutPolicy(width)
            listOf(p.feedWidth,p.readerWidth,p.featureWidth,p.heroWidth).forEach { assertTrue(it <= width) }
            assertTrue(p.readerWidth <= 640f)
            assertTrue(p.heroWidth/(1944f/809f) < 220f)
        }
    }

    @Test fun portraitAndLandscapePublicationPreviewsKeepTheirRatioAndHeightBound() {
        listOf(RastroWindowClass.MEDIUM,RastroWindowClass.EXPANDED).forEach { size ->
            listOf(.4f,.68f,1f,1.78f,3f).forEach { ratio ->
                listOf(360f,600f,900f).forEach { available ->
                    val width = rastroPreviewWidth(available,ratio,size)
                    assertTrue(width <= available)
                    assertTrue(width/ratio <= 360.01f)
                }
            }
        }
        assertEquals(360f, rastroPreviewWidth(360f,1.78f,RastroWindowClass.COMPACT), .01f)
        assertEquals(288f, rastroPreviewWidth(360f,.4f,RastroWindowClass.COMPACT), .01f)
    }
}
