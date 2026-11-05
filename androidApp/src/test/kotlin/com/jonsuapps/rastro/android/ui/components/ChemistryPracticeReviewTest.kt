package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ChemistryPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })

    @Test fun allChemistryLevelsKeepTheirIdsAndPassTheRealLoader() = runBlocking {
        var total = 0
        var rewritten = 0
        for (week in 1..16) for (part in 1..2) {
            val level = "$week.$part"
            val lesson = loader().loadLesson("quimica", week, level).lesson
            val count = if (level in setOf("7.2", "10.1", "16.1", "16.2")) 12 else 11
            assertEquals(level, count, lesson.challenges.size)
            assertEquals(level, count, lesson.challenges.map { it.statement }.toSet().size)
            val report = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(), 0, report.errorCount)
            assertEquals(report.printSummary(), 0, report.warningCount)
            lesson.challenges.forEachIndexed { index, q ->
                assertEquals("quim_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                assertEquals(q.id, 4, q.options.toSet().size)
                assertTrue(q.id, q.correctIndex in q.options.indices)
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination("Química", q.statement))
                assertFalse(q.id, q.statement.contains("marco conceptual desarrollado"))
                if (week >= 2) assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
            }
            if (week >= 2) {
                val rel = "aprender/quimica/semana%02d/$level/questions.json".format(week)
                assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
                rewritten += count
            }
            total += count
        }
        assertEquals(334, rewritten)
        assertEquals(356, total)
    }

    @Test fun oxidationElectrochemistryAndOrganicCountsHaveVerifiedKeys() = runBlocking {
        suspend fun chosen(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("quimica", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals("$7$", chosen(6, 1, 2))
        assertEquals("$6\\,\\text{electrones}$", chosen(14, 2, 1))
        assertEquals("$8\\,\\text{átomos}$", chosen(15, 2, 2))
        assertEquals("$75\\,\\mathrm{g/mol}$", chosen(15, 2, 3))
        assertEquals("$4\\,\\mathrm{enlaces}$", chosen(15, 2, 4))
    }

    @Test fun waterTreatmentKeysDoNotPromiseSafetyFromAppearanceOrChlorinationAlone() = runBlocking {
        val bank = loader().loadLesson("quimica", 16, "16.2").lesson.challenges
        fun chosen(i: Int) = bank[i - 1].let { it.options[it.correctIndex] }
        assertTrue(chosen(3).contains("riesgos microbiológicos y químicos"))
        assertTrue(chosen(4).contains("no garantiza retirar todos"))
        assertTrue(chosen(5).contains("no demuestra por sí solo"))
        assertTrue(chosen(12).contains("No basta", ignoreCase = true))
        val acidRain = loader().loadLesson("quimica", 16, "16.1").lesson.challenges[7]
        assertEquals("Dióxido de azufre y óxidos de nitrógeno.", acidRain.options[acidRain.correctIndex])
    }
}
