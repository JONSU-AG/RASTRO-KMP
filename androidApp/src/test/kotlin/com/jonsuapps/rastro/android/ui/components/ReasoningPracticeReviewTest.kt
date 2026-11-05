package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ReasoningPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })

    private suspend fun verify(subject: String, prefix: String, weeks: Int, name: String) {
        var count = 0
        for (week in 1..weeks) for (part in 1..2) {
            val level = "$week.$part"
            val lesson = loader().loadLesson(subject, week, level).lesson
            assertEquals(level, 11, lesson.challenges.size)
            assertEquals(level, 11, lesson.challenges.map { it.statement }.toSet().size)
            val report = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(), 0, report.errorCount)
            assertEquals(report.printSummary(), 0, report.warningCount)
            lesson.challenges.forEachIndexed { index, q ->
                assertEquals("${prefix}_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                assertEquals(q.id, 4, q.options.toSet().size)
                assertTrue(q.id, q.correctIndex in q.options.indices)
                assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination(name, q.statement))
                assertFalse(q.id, q.statement.contains("marco conceptual desarrollado"))
            }
            val rel = "aprender/$subject/semana%02d/$level/questions.json".format(week)
            assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
            count += lesson.challenges.size
        }
        assertEquals(weeks * 22, count)
    }

    @Test fun logicalBanksLoadWithoutWarningsAndKeepTheirIds() = runBlocking {
        verify("raz_logico", "rl", 9, "Razonamiento Lógico")
    }

    @Test fun logicalKeysSeparateConverseFromContrapositiveAndSatisfiabilityFromTautology() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("raz_logico", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("No, ninguna asignación hace verdaderas todas.", chosen(6, 1, 1))
        assertEquals("Sí, existe al menos una asignación que hace verdaderas todas.", chosen(6, 1, 6))
        assertEquals("Condición necesaria para ingresar.", chosen(7, 1, 11))
        assertEquals("$6\\,\\text{órdenes}$", chosen(8, 1, 5))
        assertEquals("B.", chosen(8, 1, 2))
        assertTrue(chosen(9, 2, 10).contains("podría ser verdadera"))
    }

    @Test fun mathematicalBanksLoadWithoutWarningsAndKeepTheirIds() = runBlocking {
        verify("raz_matematico", "rm", 7, "Razonamiento Matemático")
    }

    @Test fun mathematicalKeysRespectCountingProbabilityAndVarianceConventions() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("raz_matematico", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$21$", chosen(1, 1, 4))
        assertEquals("$20\\,\\text{años}$", chosen(3, 1, 3))
        assertEquals("$4\\,\\text{números}$", chosen(5, 1, 7))
        assertEquals("$\\frac{3}{10}$", chosen(6, 2, 1))
        assertEquals("$\\frac{9}{25}$", chosen(6, 2, 2))
        assertEquals("$\\frac{3}{4}$", chosen(6, 2, 9))
        assertEquals("$\\frac{8}{3}$", chosen(7, 2, 1))
        assertEquals("$4$", chosen(7, 2, 2))
    }
}
