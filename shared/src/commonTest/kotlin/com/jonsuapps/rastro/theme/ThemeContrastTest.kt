package com.jonsuapps.rastro.theme

import androidx.compose.ui.graphics.Color
import kotlin.test.*

class ThemeContrastTest {
    private fun checkReading(p: RastroPalette) {
        for(bg in listOf(p.background,p.surface,p.surfaceAccent)) {
            for(fg in listOf(p.textPrimary,p.textSecondary,p.textMuted,p.accentText))
                assertTrue(contrastRatio(fg,bg)>=4.499f,"Contrast ${contrastRatio(fg,bg)} against $bg")
        }
        assertTrue(contrastRatio(p.onAccent,p.accent)>=4.5f)
    }
    @Test fun everyExistingThemeAndIntensityHasReadableRoles() {
        RastroThemeId.entries.forEach { id ->
            val raw=RastroThemeTokens.getColors(id)
            checkReading(accessiblePalette(raw))
            MaterialYouIntensity.entries.forEach { checkReading(accessiblePalette(materialYouPalette(raw,it))) }
        }
    }
    @Test fun customBackgroundAndCardWithOppositeBrightnessStayReadable() {
        val extremes=listOf(Color.Black,Color.White,Color(0xFFFFEB3B),Color(0xFF514279),Color(0xFF777777))
        for(bg in extremes) for(surface in extremes) for(accent in extremes) {
            checkReading(accessiblePalette(generateCustomPalette(bg,surface,accent)))
        }
    }
    @Test fun softRetainsSourceAndStrongKeepsNeutralBackgroundWhileStrengtheningDetails() {
        val source=RastroThemeTokens.getColors(RastroThemeId.MATERIAL_YOU)
        assertEquals(source,materialYouPalette(source,MaterialYouIntensity.SOFT))
        val medium=materialYouPalette(source,MaterialYouIntensity.MEDIUM)
        val strong=materialYouPalette(source,MaterialYouIntensity.STRONG)
        fun distance(a:Color,b:Color)=kotlin.math.abs(a.red-b.red)+kotlin.math.abs(a.green-b.green)+kotlin.math.abs(a.blue-b.blue)
        assertTrue(distance(strong.background,source.background)>distance(medium.background,source.background))
        assertTrue(distance(strong.background,source.background)<.25f)
        assertTrue(distance(strong.surfaceAccent,source.surfaceAccent)>distance(medium.surfaceAccent,source.surfaceAccent))
        assertTrue(distance(strong.background,strong.accent)>.5f)
        assertEquals(source.isLight,strong.isLight)
    }
    @Test fun preferencesFallbackAndThemeIsolation() {
        assertEquals(MaterialYouIntensity.MEDIUM,MaterialYouIntensity.fromId(null))
        assertEquals(MaterialYouIntensity.MEDIUM,MaterialYouIntensity.fromId("unknown"))
        MaterialYouIntensity.entries.forEach { assertEquals(it,MaterialYouIntensity.fromId(it.id)) }
        val previous=ThemeManager.currentThemeId
        val previousIntensity=ThemeManager.materialYouIntensity
        try {
            ThemeManager.setTheme(RastroThemeId.LIGHT)
            val baseline=ThemeManager.currentTheme
            ThemeManager.chooseMaterialYouIntensity(MaterialYouIntensity.STRONG)
            assertEquals(baseline,ThemeManager.currentTheme)
            ThemeManager.setTheme(RastroThemeId.MATERIAL_YOU)
            checkReading(ThemeManager.currentTheme)
        } finally {
            ThemeManager.chooseMaterialYouIntensity(previousIntensity)
            ThemeManager.setTheme(previous)
        }
    }
    @Test fun alphaForegroundContrastUsesActualCompositing() {
        assertEquals(21f,contrastRatio(Color.Black,Color.White),.001f)
        assertTrue(contrastRatio(Color.Black.copy(alpha=.1f),Color.White)<2f)
        assertEquals(Color.Black,onColor(Color(0xFFFFEB3B)))
        assertEquals(Color.White,onColor(Color(0xFF351545)))
    }
}
