package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.android.data.FormulasRepository
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.MnemotecniasRepository
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ScientificMathTest {
    @Test fun explicitScriptsAndAdjacentFactorsAreNotRegrouped() {
        val formulas = listOf("C_nH_{2n}", "M_fV_f=M_1V_1+M_2V_2", "K_aC_0")
        formulas.forEach { source ->
            assertEquals(source, ScientificMathSource.normalize("$" + source + "$"))
            assertEquals(source, ScientificMathSource.normalize("\\(" + source + "\\)"))
        }
        assertEquals("C_nH_{2n}", ScientificMathSource.normalize("C_nH_{2n}"))
        assertEquals("M_{f}V_{f}", ScientificMathSource.normalize("M_fV_f"))
        assertEquals("K_{a}C_{0}", ScientificMathSource.normalize("K_aC_0"))
    }
    @Test fun preservesAuthoritativeLatex() {
        val source = "\\vec{A} \\cdot \\vec{B} = \\frac{a_{x}}{\\sqrt{b^2 + c^2}}"
        assertEquals(source, ScientificMathSource.normalize(source))
        assertEquals(source, ScientificMathSource.normalize("$$" + source + "$$"))
        assertEquals(source, ScientificMathSource.normalize("\\[" + source + "\\]"))
    }
    @Test fun groupsUnicodeAndNamedSubscriptsWithoutChangingSigns() {
        assertEquals("v_{f}^{2} = v_{0}^{2} \\pm  2a\\cdot d", ScientificMathSource.normalize("v_f² = v_0² ± 2a·d"))
        assertEquals("LT^{-2}", ScientificMathSource.normalize("LT⁻²"))
        assertEquals("H_{max}", ScientificMathSource.normalize("H_max"))
        assertEquals("\\sqrt{a^{2} + b^{2}}", ScientificMathSource.normalize("√(a² + b²)"))
    }
    @Test fun canonicalFractionsKeepPrefixAndSuffix() {
        val formulas = FormulasRepository.allFormulas
        val mru = formulas.first { it.id == "fis_mru_rapidez" }
        assertEquals("v = \\frac{d}{t}", ScientificMathSource.canonical(mru))
        val mruv = ScientificMathSource.canonical(formulas.first { it.id == "fis_mruv_distancia" })
        assertTrue(mruv.startsWith("d = v_{0}"))
        assertTrue(mruv.contains("\\frac{1}{2}"))
        assertTrue(mruv.endsWith("a \\cdot  t^{2}"))
    }
    @Test fun scientificExamplesHaveConsistentUnitsAndLimits() {
        assertEquals(8f, PhysicsDiagramMath.position(4f, 2f), 0.0001f)
        assertEquals(16f, PhysicsDiagramMath.position(4f, 0f, 2f), 0.0001f)
        assertEquals(8f, PhysicsDiagramMath.velocity(4f, 0f, 2f), 0.0001f)
        assertEquals(0f, PhysicsDiagramMath.projectileHeight(1f), 0.0001f)
        assertEquals(1.225f, PhysicsDiagramMath.projectileHeight(.5f), 0.0001f)
        assertEquals(12f, PhysicsDiagramMath.voltage(3f), 0.0001f)
    }
    @Test fun keepsPercentageAndTrigonometricOperators() {
        assertEquals("20\\%", ScientificMathSource.normalize("20%"))
        assertEquals("\\cos \\theta ", ScientificMathSource.normalize("cosθ"))
        assertFalse(ScientificMathSource.isMathSubject("Lenguaje"))
        assertTrue(ScientificMathSource.isMathSubject("Física"))
    }
    @Test fun explicitMappingDoesNotContaminateOtherLessons() {
        assertEquals(PhysicsLearningDiagram.VECTORS, PhysicsLearningDiagram.forLesson("fis_t01_s03", "Álgebra Vectorial y Método del Paralelogramo"))
        assertEquals(PhysicsLearningDiagram.OHM, PhysicsLearningDiagram.forFormula("fis_ohm"))
        assertNull(PhysicsLearningDiagram.forLesson("bio_t01_s03", "Célula"))
        assertNull(PhysicsLearningDiagram.forLesson("fis_t09_s01", "Temperatura, Escalas y Dilatación"))
        assertNull(PhysicsLearningDiagram.forLesson("fis_t05_s01", "CANTIDAD DE MOVIMIENTO Y GRAVITACIÓN - Fundamentos y Leyes Principales"))
        assertEquals(PhysicsLearningDiagram.OHM, PhysicsLearningDiagram.forLesson("fis_t09_s01", "ELECTRICIDAD - Fundamentos y Leyes Principales"))
        assertNull(PhysicsLearningDiagram.forFormula("geo_triangulo_area"))
    }
    @Test fun exportActualCatalogExpressionsForTypesetterValidation() {
        val formulas = FormulasRepository.allFormulas
        val lessons = AprenderRepository.getLessonsForSubjectSync("fisica")
        assertTrue(lessons.size >= 48)
        val sources = (formulas.map(ScientificMathSource::canonical) +
            formulas.flatMap { it.despejes }.map { ScientificMathSource.normalize(it.mathExpression) } +
            MnemotecniasRepository.items.filter { ScientificMathSource.isMathSubject(it.subject) }
                .map { ScientificMathSource.normalize(it.shortFormula) } +
            lessons.flatMap { listOfNotNull(it.theory.formulaLatex) + it.theory.formulas }
                .filter(String::isNotBlank).map(ScientificMathSource::normalize)).distinct()
        assertTrue(sources.size > 100)
        File("build/reports/scientific-math-fixtures.json").apply { parentFile?.mkdirs(); writeText(Json.encodeToString(sources)) }
    }
}
