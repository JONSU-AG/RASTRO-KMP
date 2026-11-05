package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class BiologyRelationsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })
    private val targets = mapOf("9.2" to "bio_t09_s02_c12", "9.3" to "bio_t09_s03_c11", "9.4" to "bio_t09_s04_c11",
        "10.1" to "bio_t10_s01_c12", "11.4" to "bio_t11_s04_c12", "12.3" to "bio_t12_s03_c12",
        "13.1" to "bio_t13_s01_c12", "13.2" to "bio_t13_s02_c12", "13.3" to "bio_t13_s03_c12", "13.4" to "bio_t13_s04_c12")

    @Test fun tenRelationsReachTheExistingEngineWithFourExplicitPairs() = runBlocking {
        for ((level, id) in targets) {
            val week = level.substringBefore('.').toInt()
            val lesson = loader().loadLesson("biologia", week, level).lesson
            val report = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(), 0, report.errorCount)
            assertEquals(report.printSummary(), 0, report.warningCount)
            val q = lesson.challenges.single { it.id == id }
            assertEquals(id, ChallengeType.MATCH_PAIRS, q.type)
            assertEquals(id, 4, q.pairs.size)
            assertEquals(id, 4, q.pairs.map { it.left }.toSet().size)
            assertEquals(id, 4, q.pairs.map { it.right }.toSet().size)
            assertEquals(id, q.pairs.map { it.id }.toSet(), q.rightOptions.map { it.id }.toSet())
            q.pairs.forEach { pair -> assertEquals(pair.right, q.rightOptions.single { it.id == pair.id }.text) }
            assertFalse(id, q.rightOptions.map { it.id } == q.pairs.map { it.id })
            assertTrue(id, q.options.isEmpty())
            assertTrue(id, resolutionSegments(q.explanation).size >= 4)
            assertFalse(id, AcademicSanitizer.hasUnrelatedStemContamination("Biología", q.statement))
            val rel = "aprender/biologia/semana%02d/$level/questions.json".format(week)
            assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
        }
    }

    @Test fun intrinsicFactorQuestionEvaluatesPhysiologyWithoutPrescribingTreatment() = runBlocking {
        val lesson = loader().loadLesson("biologia", 8, "8.1").lesson
        val q = lesson.challenges.single { it.id == "bio_t08_s01_c1" }
        assertEquals("Factor intrínseco de Castle", q.options[q.correctIndex])
        assertFalse(q.statement.contains("inyectable"))
        assertFalse(q.statement.contains("de por vida"))
        assertTrue(resolutionSegments(q.explanation).size >= 3)
        val report = CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(), 0, report.errorCount)
        assertEquals(report.printSummary(), 0, report.warningCount)
    }
}
