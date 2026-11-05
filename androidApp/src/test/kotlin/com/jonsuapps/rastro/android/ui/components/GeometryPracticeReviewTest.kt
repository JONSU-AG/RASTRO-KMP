package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class GeometryPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })

    @Test fun allGeometryLevelsLoadWithElevenDistinctQuestionsAndValidAnswers() = runBlocking {
        var rewritten = 0
        for (week in 1..11) for (part in 1..2) {
            val lesson = loader().loadLesson("geometria", week, "$week.$part").lesson
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
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination("Geometría", q.statement))
            }
            if (!((week == 3 || week == 7) && part == 1)) {
                lesson.challenges.forEachIndexed { index, q ->
                    assertEquals("geom_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                    assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
                    assertFalse(q.id, q.statement.contains("anterior"))
                }
                val rel = "aprender/geometria/semana%02d/$week.$part/questions.json".format(week)
                assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
                rewritten += lesson.challenges.size
            }
        }
        assertEquals(220, rewritten)
    }

    @Test fun circlePowerAndTriangleCentersKeepTheirOwnLengthsAndUnits() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("geometria", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$4\\,\\mathrm{cm}$", chosen(4, 2, 3))
        assertEquals("$6\\,\\mathrm{cm}$", chosen(4, 2, 4))
        assertEquals("$\\sqrt{5}\\,\\mathrm{cm}$", chosen(5, 2, 4))
        assertEquals("$110\\,\\mathrm{^\\circ}$", chosen(7, 2, 1))
    }

    @Test fun solidsAndConicsDoNotConfuseSquaredAndCubedMeasures() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("geometria", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$63\\,\\mathrm{cm^3}$", chosen(9, 2, 6))
        assertEquals("$\\frac{52 \\pi}{3}\\,\\mathrm{cm^3}$", chosen(10, 2, 5))
        assertEquals("$4$", chosen(11, 2, 3)) // ellipse c²=a²−b²
        assertEquals("$5$", chosen(11, 2, 6)) // hyperbola c²=a²+b²
    }
}
