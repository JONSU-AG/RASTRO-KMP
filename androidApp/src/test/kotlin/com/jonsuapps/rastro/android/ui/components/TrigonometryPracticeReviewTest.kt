package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import kotlin.math.*

class TrigonometryPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })

    @Test fun everyTrigonometryLevelHasElevenUsableQuestionsAndNoValidationWarnings() = runBlocking {
        var newQuestions = 0
        for (week in 1..12) for (part in 1..2) {
            val lesson = loader().loadLesson("trigonometria", week, "$week.$part").lesson
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
                assertFalse(q.id, q.explanation.contains("Se deduce directamente"))
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination("Trigonometría", q.statement))
            }
            if (week != 1 || part != 1) {
                lesson.challenges.forEachIndexed { index, q ->
                    assertEquals("trig_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                    assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
                    assertFalse(q.id, q.statement.contains("anterior"))
                }
                val rel = "aprender/trigonometria/semana%02d/$week.$part/questions.json".format(week)
                assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
                newQuestions += lesson.challenges.size
            }
        }
        assertEquals(253, newQuestions)
    }

    @Test fun equationsRespectExcludedFactorsAndOpenOrClosedEndpoints() = runBlocking {
        suspend fun chosen(part: Int, index: Int): String {
            val q = loader().loadLesson("trigonometria", 7, "7.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$2$", chosen(1, 1)) // sin(x)=0 on [0,2π).
        assertEquals("$2$", chosen(1, 8)) // cos(x)=1 on [0,2π].
        assertEquals("$4$", chosen(2, 2)) // factor sin(x) must not be cancelled.
        assertEquals("$2$", chosen(2, 3)) // sin(x)(cos(x)-1)=0.
        assertEquals("$3$", chosen(2, 4)) // cos(2x)=1 includes both endpoints.
    }

    @Test fun inverseBranchesAndAmbiguousTriangleRemainCorrectAfterLoading() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("trigonometria", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$\\frac{\\pi}{6}\\,\\mathrm{rad}$", chosen(11, 2, 1))
        assertEquals("$- \\frac{\\pi}{3}\\,\\mathrm{rad}$", chosen(11, 2, 2))
        assertEquals("$2$", chosen(8, 2, 3))
        assertEquals("$0$", chosen(8, 2, 4))
        assertEquals(25.0, 10 * cos(PI / 4) * 5 * sin(PI / 4), 1e-12)
        assertEquals("$25\\,\\mathrm{cm^2}$", chosen(12, 2, 9))
    }
}
