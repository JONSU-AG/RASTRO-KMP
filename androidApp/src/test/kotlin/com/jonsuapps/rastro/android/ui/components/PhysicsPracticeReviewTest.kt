package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import kotlin.math.sqrt

class PhysicsPracticeReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride = { path ->
        File(root, path.removePrefix("files/")).readBytes()
    })

    @Test fun allPhysicsPracticeLoadsThroughProductionLoaderAndValidator() = runBlocking {
        var count = 0
        for (week in 1..12) for (part in 1..2) {
            val lesson = loader().loadLesson("fisica", week, "$week.$part").lesson
            assertEquals(lesson.id, 11, lesson.challenges.size)
            val report = CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(), 0, report.errorCount)
            assertEquals(report.printSummary(), 0, report.warningCount)
            assertEquals(lesson.id, 11, lesson.challenges.map { it.id }.toSet().size)
            assertEquals(lesson.id, 11, lesson.challenges.map { it.statement }.toSet().size)
            lesson.challenges.forEach { q ->
                assertTrue(q.id, q.correctIndex in q.options.indices)
                assertEquals(q.id, 4, q.options.toSet().size)
                assertFalse(q.id, q.statement.contains("marco conceptual desarrollado"))
                assertFalse(q.id, q.explanation.contains("Se deduce directamente"))
                assertFalse(q.id, AcademicSanitizer.hasUnrelatedStemContamination("Física", q.statement))
            }
            if (week != 2 && !(week == 1 && part == 1)) {
                lesson.challenges.forEachIndexed { index, q ->
                    assertEquals("fis_t%02d_s%02d_c%02d".format(week, part, index + 1), q.id)
                    assertTrue(q.id, resolutionSegments(q.explanation).size >= 3)
                    assertFalse(q.id, q.statement.contains("anterior"))
                    assertFalse(q.id, q.statement.contains("El mismo bloque"))
                }
                val rel = "aprender/fisica/semana%02d/$week.$part/questions.json".format(week)
                assertArrayEquals(File(root, rel).readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files", rel).readBytes())
                count += lesson.challenges.size
            }
        }
        assertEquals(231, count)
    }

    @Test fun vectorImpulseAndOrbitalCasesKeepTheComputedKey() = runBlocking {
        suspend fun selected(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("fisica", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        val cross = listOf(-4.0, 7.0, 5.0)
        assertEquals(3 * sqrt(10.0) / 2, sqrt(cross.sumOf { it * it }) / 2, 1e-12)
        assertEquals("$\\frac{3 \\sqrt{10}}{2}\\,\\mathrm{m^2}$", selected(1, 2, 3))
        assertEquals(16.0, .2 * (50 - (-30)), 1e-12)
        assertEquals("$16\\,\\mathrm{N\\,s}$", selected(5, 1, 2))
        assertEquals("$0.25$", selected(5, 2, 5))
        assertEquals("$37.5\\,\\mathrm{N}$", selected(3, 2, 7))
    }

    @Test fun thermalPressureAndQuantumBoundariesAreNotConfused() = runBlocking {
        suspend fun answer(week: Int, part: Int, index: Int): String {
            val q = loader().loadLesson("fisica", week, "$week.$part").lesson.challenges[index - 1]
            return q.options[q.correctIndex]
        }
        assertEquals(40.0, (100.0 * 20 + 200.0 * 50) / 300, 0.0)
        assertEquals("$40\\,\\mathrm{^\\circ C}$", answer(7, 2, 9))
        assertEquals("$120000\\,\\mathrm{Pa}$", answer(8, 1, 4))
        assertEquals("$0\\,\\text{electrones}$", answer(12, 1, 9))
        assertEquals("$1.25$", answer(12, 1, 4))
        val wave = answer(12, 2, 1)
        assertEquals("$3\\times10^{-10}\\,\\mathrm{m}$", wave)
    }

    @Test fun latentHeatTheoryDistinguishesEquilibriumFromEnergyBalance() {
        val text = File(root, "aprender/fisica/semana07/7.2/theory.md").readText()
        assertFalse(text.contains("Conservación de la Energía Térmica (Ley Cero)"))
        assertFalse(text.contains("obligatoriamente 0"))
        assertTrue(text.contains("293.15"))
        assertTrue(text.contains("no la ley cero"))
        assertTrue(text.contains("hielo a temperatura negativa"))
    }
}
