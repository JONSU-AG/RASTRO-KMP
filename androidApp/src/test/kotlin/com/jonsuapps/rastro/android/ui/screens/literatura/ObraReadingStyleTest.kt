package com.jonsuapps.rastro.android.ui.screens.literatura

import androidx.compose.ui.graphics.luminance
import com.jonsuapps.rastro.theme.RastroThemeId
import com.jonsuapps.rastro.theme.RastroThemeTokens
import org.junit.Assert.*
import org.junit.Test

class ObraReadingStyleTest {
    @Test fun pastelTextRemainsReadableAcrossExistingThemes() {
        RastroThemeId.entries.forEach { id ->
            val theme = RastroThemeTokens.getColors(id)
            val palette = readingPastels(theme)
            listOf(theme.surface, theme.background, palette.surface).forEach { background ->
                assertTrue("$id normal", readingContrast(palette.text, background) >= 4.5f)
                assertTrue("$id accent", readingContrast(palette.accent, background) >= 4.5f)
            }
            assertTrue("$id marker", readingContrast(palette.accent, palette.marker) >= 4.5f)
            if (theme.isDark) assertTrue("$id dark pastel", palette.surface.luminance() < .25f)
        }
    }

    @Test fun academicTextIsPreservedAndEmphasisIsSparse() {
        val source = "Aquiles y Héctor: honor, piedad y reconciliación.\n".repeat(20)
        val result = emphasizeReading(source, listOf("Aquiles", "Héctor", "honor", "piedad", "reconciliación"),
            readingPastels(RastroThemeTokens.getColors(RastroThemeId.LIGHT_WARM)))
        assertEquals(source, result.text.text)
        assertEquals(4, result.text.spanStyles.count { it.item.fontWeight != null })
        assertEquals(1, result.markers.size)
        assertTrue(result.markers.single().count() <= minOf(48, source.length / 20))
    }

    @Test fun matchesOnlyCompleteTermsAndTreatsRegexCharactersLiterally() {
        val source = "Reyerta no es rey. C++ es literal.\n".repeat(10)
        val result = emphasizeReading(source, listOf("rey", "C++"),
            readingPastels(RastroThemeTokens.getColors(RastroThemeId.DARK)))
        val ranges = result.text.spanStyles.filter { it.item.fontWeight != null }
        assertEquals(listOf("rey", "C++"), ranges.map { source.substring(it.start, it.end) })
        assertEquals(source, result.text.text)
    }

    @Test fun shortTextHasNoDisproportionateMarker() {
        val source = "Aquiles lucha."
        val result = emphasizeReading(source, listOf("Aquiles"),
            readingPastels(RastroThemeTokens.getColors(RastroThemeId.LIGHT)))
        assertTrue(result.markers.isEmpty())
        assertEquals(source, result.text.text)
    }
}
