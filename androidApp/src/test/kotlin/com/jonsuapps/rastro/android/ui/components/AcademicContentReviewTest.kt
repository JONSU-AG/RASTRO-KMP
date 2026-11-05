package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class AcademicContentReviewTest {
    private val root get() = File("../shared/src/commonMain/composeResources/files")
    @Test fun physicsFirstLevelPassesRealLoaderValidatorAndSanitizer() = runBlocking {
        val loader = JsonContentLoader(readBytesOverride = { path -> File(root, path.removePrefix("files/")).readBytes() })
        val loaded = loader.loadLesson("fisica", 1, "1.1").lesson
        assertEquals(17, parseAcademicContent(loaded.theory).sections.flatMap { it.tables }.sumOf { it.rows.size })
        val report = CatalogValidator.validateCatalog(listOf(loaded))
        assertEquals(report.printSummary(), 0, report.errorCount)
        assertEquals(report.printSummary(), 0, report.warningCount)
        assertEquals(11, loaded.challenges.size)
        val questions = loaded.challenges.associateBy { it.id }
        assertEquals(3, questions.getValue("fis_t01_s01_c01").correctIndex)
        assertEquals(0, questions.getValue("fis_t01_s01_c02").correctIndex)
        assertEquals(0, questions.getValue("fis_t01_s01_c03").correctIndex)
        loaded.challenges.forEach {
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Física", it.statement))
            assertFalse(it.statement.contains("marco conceptual desarrollado"))
        }
        assertEquals(PhysicsLearningDiagram.DIMENSIONS, PhysicsLearningDiagram.forLesson(loaded.id, loaded.title))
    }
    @Test fun rendererDetectsMathInsideTheoryWithoutReclassifyingNormalProse() {
        assertTrue(hasScientificMarkup("La velocidad tiene dimensión LT^{-1}."))
        assertTrue(hasScientificMarkup("La fuerza es \\vec{F}."))
        assertTrue(hasScientificMarkup("Se cumple x = 2."))
        assertFalse(hasScientificMarkup("La filosofía estudia problemas fundamentales."))
    }
    @Test fun mathDiagramsAreSpecificToTheirSubjectAndTopic() {
        assertEquals(MathLearningDiagram.UNIT_CIRCLE, mathDiagramFor("trigonometria", "Circunferencia trigonométrica"))
        assertEquals(MathLearningDiagram.QUADRATIC, mathDiagramFor("algebra", "Funciones cuadráticas"))
        assertNull(mathDiagramFor("algebra", "Ecuaciones cuadráticas"))
        assertNull(mathDiagramFor("historia_peru", "Funciones cuadráticas"))
    }
}
