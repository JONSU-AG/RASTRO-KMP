package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ReadingPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })

    @Test fun allReadingQuestionsIncludeTheirPassageAndPreserveIdentity() = runBlocking {
        var total = 0
        for (week in 1..8) for (part in 1..2) {
            val level = "$week.$part"
            val lesson = loader().loadLesson("comprension_lectora", week, level).lesson
            assertEquals(level, 11, lesson.challenges.size)
            assertEquals(level, 11, lesson.challenges.map { it.statement }.toSet().size)
            val report = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(), 0, report.errorCount)
            assertEquals(report.printSummary(), 0, report.warningCount)
            lesson.challenges.forEachIndexed { index, q ->
                assertEquals("cl_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                assertTrue(q.id, q.statement.startsWith("Lee el texto original de práctica:"))
                assertEquals(q.id, 4, q.options.toSet().size)
                assertTrue(q.id, q.correctIndex in q.options.indices)
                assertEquals(q.id, 3, resolutionSegments(q.explanation).size)
                assertTrue(q.id, q.explanation.startsWith("1. Localizamos la evidencia:"))
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination("Comprensión lectora", q.statement))
            }
            val rel = "aprender/comprension_lectora/semana%02d/$level/questions.json".format(week)
            assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
            total += lesson.challenges.size
        }
        assertEquals(176, total)
    }

    @Test fun interpretationsDoNotInventMissingInformationOrTurnOpinionsIntoVerifiedFacts() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("comprension_lectora", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertTrue(chosen(1, 2, 10).contains("ausencia de observación", ignoreCase = true))
        assertTrue(chosen(2, 1, 7).contains("no determinan ese número"))
        assertTrue(chosen(5, 2, 9).contains("Comprobar la evidencia"))
        assertEquals("Su referente es ambiguo en ese contexto.", chosen(7, 1, 10))
        assertEquals("Ninguna; ser secundaria no la vuelve impertinente.", chosen(7, 2, 9))
        assertTrue(chosen(8, 2, 7).contains("A permite que algunos sí"))
    }

    @Test fun playbackKeepsMultiSentenceAndNestedCitationsTogether() {
        val source = "1. Evidencia: “Los vecinos llegaron. Ellos también trajeron libros.”.\n2. El pronombre retoma a los vecinos.\n3. Esa es la respuesta."
        val parts = resolutionSegments(source)
        assertEquals(3, parts.size)
        assertTrue(parts.first().contains("llegaron. Ellos"))
        val nested = "1. Evidencia: «Dijo: “Llegamos. Esperen aquí”. Después cerró la puerta».\n2. Se conserva la cita completa."
        assertEquals(2, resolutionSegments(nested).size)
        val english = "Don't change the words. Keep the quotation."
        assertEquals(2, resolutionSegments(english).size)
        assertEquals(source.filterNot(Char::isWhitespace), parts.joinToString("").filterNot(Char::isWhitespace))
    }
}
