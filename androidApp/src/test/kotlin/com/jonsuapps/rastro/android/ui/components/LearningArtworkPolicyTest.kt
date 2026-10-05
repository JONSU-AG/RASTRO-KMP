package com.jonsuapps.rastro.android.ui.components

import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import com.jonsuapps.rastro.theme.RastroThemeId
import com.jonsuapps.rastro.theme.RastroThemeTokens
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class LearningArtworkPolicyTest {
    @Test fun victoryUsesAllCharactersWithoutLokiPreference() {
        val random = kotlin.random.Random(17)
        val characters = List(3000) { LearningArtworkResolver.explosionCharacter(random) }
        ClassicCharacter.entries.forEach { character ->
            assertTrue(characters.count { it == character } in 900..1100)
        }
        val appearances = List(1000) { LearningArtworkResolver.victoryAppearance(3, random) }
        assertEquals(setOf(ClassicAppearance.HAPPY, ClassicAppearance.IN_LOVE), appearances.toSet())
        assertTrue(appearances.count { it == ClassicAppearance.HAPPY } in 430..570)
    }
    @Test fun resultCategoriesStayValidAndNeverRepeatThreeTimesExceptExplosion() {
        val emotions = VarietySelector<ClassicAppearance>()
        val characters = VarietySelector<ClassicCharacter>()
        val random = kotlin.random.Random(31)
        fun <T> checkRun(values: List<T>) = values.windowed(3).forEach { assertTrue(it.distinct().size > 1) }
        listOf(1, 3).forEach { stars ->
            val valid = LearningArtworkResolver.victoryChoices(stars)
            val drawn = List(1000) { emotions.choose(valid, random) }
            assertEquals(valid.toSet(), drawn.toSet())
            checkRun(drawn)
        }
        assertEquals(setOf(ClassicAppearance.EXPLOSION), List(10) {
            emotions.choose(LearningArtworkResolver.victoryChoices(2), random)
        }.toSet())
        checkRun(List(2000) { characters.choose(ClassicCharacter.entries, random) })
    }
    @Test fun relationColorsAreDistinctAndReadableInEveryTheme() {
        RastroThemeId.entries.forEach { id ->
            val theme = RastroThemeTokens.getColors(id)
            val colors = List(8) { relationColor(it, 8, theme.isDark) }
            assertEquals(8, colors.distinct().size)
            colors.forEach { color ->
                val fill = color.copy(alpha = .22f).compositeOver(theme.surface)
                assertTrue("$id", contrast(contrastingText(fill), fill) >= 4.5)
            }
        }
    }
    @Test fun shortenedReadingPreservesThrowAndExplosion() {
        // Read for 1.3 s; paper is released before the native blast begins at 2.08 s.
        assertNull(sampleLearningExplosion(0f).paperGag?.takeIf { it.blast > 0f })
        assertEquals(0f, sampleLearningExplosion(2f / 5.1f).paperGag!!.blast, 0f)
        assertTrue(sampleLearningExplosion(2.12f / 5.1f).paperGag!!.paperBehind)
        assertTrue(sampleLearningExplosion(2.12f / 5.1f).paperGag!!.blast > 0f)
        val source = com.jonsuapps.rastro.android.ui.mascots.loki.sampleLokiPaperGag(5f / 6.8f)
        val actual = sampleLearningExplosion(3.3f / 5.1f)
        assertEquals(source.paperGag!!.blast, actual.paperGag!!.blast, .0001f)
        assertEquals(source.paperGag!!.serious, actual.paperGag!!.serious, .0001f)
    }
    @Test fun answerContainersRemainReadableAcrossAllThemes() {
        RastroThemeId.entries.forEach { id ->
            val theme = RastroThemeTokens.getColors(id)
            listOf(true, false).forEach { correct ->
                assertTrue("$id / $correct", contrast(theme.answerText(correct), theme.answerSurface(correct)) >= 4.5)
            }
            assertTrue("Button $id", contrast(contrastingText(theme.accent), theme.accent) >= 4.5)
        }
    }
    private fun contrast(a: Color, b: Color): Double =
        (maxOf(a.luminance(), b.luminance()) + 0.05).toDouble() /
            (minOf(a.luminance(), b.luminance()) + 0.05)
}
