package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class EnglishPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })

    @Test fun everyEnglishQuestionHasContextAndLoadsWithoutWarnings() = runBlocking {
        var total = 0
        for (week in 1..7) for (part in 1..2) {
            val level = "$week.$part"
            val lesson = loader().loadLesson("ingles", week, level).lesson
            assertEquals(level, 11, lesson.challenges.size)
            assertEquals(level, 11, lesson.challenges.map { it.statement }.toSet().size)
            val report = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(), 0, report.errorCount)
            assertEquals(report.printSummary(), 0, report.warningCount)
            lesson.challenges.forEachIndexed { index, q ->
                assertEquals("ing_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                assertEquals(q.id, 4, q.options.toSet().size)
                assertTrue(q.id, q.correctIndex in q.options.indices)
                assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
                assertFalse(q.id, q.statement.contains("regarding the lesson theory"))
                assertFalse(q.id, q.explanation.contains("Directly deduced"))
                assertFalse(q.id, q.explanation.contains("___"))
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination("Inglés", q.statement))
                if (week >= 6) assertTrue(q.id, q.statement.startsWith("Lee el texto") || q.statement.contains("estrategia"))
            }
            val rel = "aprender/ingles/semana%02d/$level/questions.json".format(week)
            assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
            total += lesson.challenges.size
        }
        assertEquals(154, total)
    }

    @Test fun grammarKeysAgreeWithTheirCompletedSentences() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("ingles", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("waters", chosen(1, 1, 1))
        assertEquals("wrote", chosen(2, 1, 7))
        assertEquals("No tienes obligación de asistir.", chosen(3, 1, 10))
        assertEquals("to get", chosen(4, 2, 1))
        assertEquals("at / on", chosen(5, 2, 5))
        val q = loader().loadLesson("ingles", 5, "5.2").lesson.challenges[4]
        assertTrue(q.explanation.contains("at 8:30 on Tuesday"))
    }

    @Test fun readingKeysUseThePassageInsteadOfInventedDetails() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("ingles", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("Three hours.", chosen(6, 1, 2))
        assertEquals("No.", chosen(6, 2, 9))
        assertEquals("Not yet.", chosen(7, 1, 6))
        assertEquals("A diagnosis or treatment.", chosen(7, 2, 9))
        assertEquals("Every member prefers Wednesday to Friday.", chosen(7, 2, 11))
    }
}
