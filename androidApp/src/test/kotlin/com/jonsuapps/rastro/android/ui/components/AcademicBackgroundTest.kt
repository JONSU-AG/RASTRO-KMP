package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.RastroThemeId
import com.jonsuapps.rastro.theme.RastroThemeTokens
import androidx.compose.ui.graphics.lerp
import org.junit.Assert.*
import org.junit.After
import org.junit.Test

class AcademicBackgroundTest {
    @After fun reset() { ThemeManager.setAcademicBackground(false) }
    @Test fun isOptionalForEveryoneAndCanBeDisabledImmediately() {
        ThemeManager.setAcademicBackground(false)
        assertFalse(ThemeManager.academicBackgroundEnabled)
        ThemeManager.setAcademicBackground(true)
        assertTrue(ThemeManager.academicBackgroundEnabled)
        ThemeManager.setAcademicBackground(false)
        assertFalse(ThemeManager.academicBackgroundEnabled)
    }
    @Test fun toggleDoesNotChangeBaseThemeOrCustomColors() {
        val theme = ThemeManager.currentThemeId
        val custom = ThemeManager.customColors
        ThemeManager.setAcademicBackground(true)
        ThemeManager.setAcademicBackground(false)
        assertEquals(theme, ThemeManager.currentThemeId)
        assertEquals(custom, ThemeManager.customColors)
    }
    @Test fun layoutIsDeterministicAndAllRotatedSymbolsFit() {
        for ((w,h) in listOf(280f to 480f, 412f to 915f, 800f to 1280f, 1280f to 800f)) {
            val a = AcademicPatternLayout.positions(w,h)
            assertTrue(a.isNotEmpty())
            assertEquals(a, AcademicPatternLayout.positions(w,h))
            assertEquals(a.size, a.map { it.x to it.y }.toSet().size)
            assertTrue(a.all { it.x >= 20 && it.x <= w-20 && it.y >= 20 && it.y <= h-20 && it.kind in 0..13 })
        }
    }
    @Test fun largerViewportAddsSymbolsWithoutChangingTheirSizeOrExistingPositions() {
        val phone = AcademicPatternLayout.positions(360f,640f)
        val tablet = AcademicPatternLayout.positions(1080f,1920f)
        assertTrue(tablet.size > phone.size * 5)
        assertTrue(tablet.containsAll(phone))
        assertEquals(48f, AcademicPatternLayout.SYMBOL_DP, 0f)
        // Different pixel densities representing the same dp viewport retain identical geometry.
        assertEquals(phone, AcademicPatternLayout.positions(1080f/3f,1920f/3f))
        assertTrue(AcademicPatternLayout.positions(0f,640f).isEmpty())
        assertTrue(AcademicPatternLayout.positions(Float.NaN,640f).isEmpty())
    }
    @Test fun subtleInkDerivesFromEveryExistingPalette() {
        RastroThemeId.entries.forEach { id ->
            val theme = RastroThemeTokens.getColors(id)
            val amount = if (theme.isLight) .075f else .085f
            assertEquals(lerp(theme.background, theme.textPrimary, amount), academicPatternInk(theme))
            assertTrue(amount < .1f)
        }
    }
}
