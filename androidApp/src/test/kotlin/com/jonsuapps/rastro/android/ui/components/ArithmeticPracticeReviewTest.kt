package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ArithmeticPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })

    @Test fun everyArithmeticLevelHasElevenQuestionsAndLoadsWithoutValidationWarnings() = runBlocking {
        var rewritten = 0
        for (week in 1..13) for (part in 1..2) {
            val lesson = loader().loadLesson("aritmetica", week, "$week.$part").lesson
            assertEquals(lesson.id, 11, lesson.challenges.size)
            assertEquals(lesson.id, 11, lesson.challenges.map { it.id }.toSet().size)
            assertEquals(lesson.id, 11, lesson.challenges.map { it.statement }.toSet().size)
            val report = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(), 0, report.errorCount)
            assertEquals(report.printSummary(), 0, report.warningCount)
            lesson.challenges.forEach { q ->
                assertEquals(q.id, 4, q.options.toSet().size)
                assertTrue(q.id, q.correctIndex in q.options.indices)
                assertFalse(q.id, q.statement.contains("marco conceptual desarrollado"))
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination("Aritmética", q.statement))
            }
            if (week >= 2) {
                lesson.challenges.forEachIndexed { index, q ->
                    assertEquals("arit_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                    assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
                    assertFalse(q.id, q.statement.contains("anterior"))
                }
                val rel = "aprender/aritmetica/semana%02d/$week.$part/questions.json".format(week)
                assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
                rewritten += lesson.challenges.size
            }
        }
        assertEquals(264, rewritten)
    }

    @Test fun periodicDecimalsStayFractionsAndStatisticsSpecifyTheirDenominator() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("aritmetica", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$\\frac{1}{8}$", chosen(5, 2, 1))
        assertEquals("$\\frac{4}{33}$", chosen(5, 2, 3))
        assertEquals("$\\frac{8}{3}$", chosen(11, 2, 2))
        assertEquals("$4$", chosen(11, 2, 3))
        assertEquals("$12$", chosen(11, 2, 9))
    }

    @Test fun combinationsConditioningAndBayesMatchIndependentCounts() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("aritmetica", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$4$", chosen(12, 2, 5)) // 012 and 021 are not three-digit numerals.
        assertEquals("$\\frac{3}{10}$", chosen(13, 2, 1))
        assertEquals("$\\frac{9}{25}$", chosen(13, 2, 2))
        assertEquals("$\\frac{3}{8}$", chosen(13, 2, 7))
        assertEquals("$0$", chosen(13, 2, 9))
    }
}
