package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class AlgebraPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path ->
        File(root, path.removePrefix("files/")).readBytes()
    })

    @Test fun allThirtyPracticeLevelsLoadWithUniqueQuestionsAndValidKeys() = runBlocking {
        for (week in 2..16) for (part in 1..2) {
            val lesson = loader().loadLesson("algebra", week, "$week.$part").lesson
            assertEquals(lesson.id, 11, lesson.challenges.size)
            assertEquals(lesson.id, 11, lesson.challenges.map { it.id }.toSet().size)
            assertEquals(lesson.id, 11, lesson.challenges.map { it.statement }.toSet().size)
            val validation = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(validation.printSummary(), 0, validation.errorCount)
            assertEquals(validation.printSummary(), 0, validation.warningCount)
            lesson.challenges.forEachIndexed { index, q ->
                assertEquals("alg_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                assertEquals(q.id, 4, q.options.size)
                assertEquals(q.id, 4, q.options.toSet().size)
                assertTrue(q.id, q.correctIndex in q.options.indices)
                assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
                assertFalse(q.id, q.statement.contains("marco conceptual desarrollado"))
                assertFalse(q.id, q.explanation.contains("Se deduce directamente"))
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination(lesson.theory.asignatura, q.statement))
            }
            val relative = "aprender/algebra/semana%02d/$week.$part/questions.json".format(week)
            assertArrayEquals(File(root, relative).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", relative).readBytes())
        }
    }

    @Test fun fragileBoundaryCasesReachTheCorrectOptionAfterLoading() = runBlocking {
        suspend fun selected(week: Int, part: Int, question: Int): String {
            val q = loader().loadLesson("algebra", week, "$week.$part").lesson.challenges[question - 1]
            return q.options[q.correctIndex]
        }
        // Strict absolute interval: |x-4|<5 gives -1<x<9, hence nine integers.
        assertEquals("$9$", selected(2, 2, 2))
        assertEquals("$0$", selected(6, 2, 3)) // x²+16 has no real roots.
        assertEquals("$-4$", selected(7, 2, 2)) // coefficient B in 4/[x(x+1)].
        assertEquals("$-5$", selected(13, 2, 4)) // floor(-4.2) goes left, not toward zero.
        assertEquals("$4$", selected(16, 2, 4)) // 32 grams / 2³.
    }
}
