package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.LessonTheory
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import kotlinx.serialization.json.*

class LearningPlaybackTest {
    @Test fun numberedStepStaysWithItsExplanation() {
        assertEquals(listOf("1. Usamos la equivalencia.","2. Calculamos el resultado."),
            resolutionSegments("1. Usamos la equivalencia.\n2. Calculamos el resultado."))
    }
    @Test fun segmentsProseWithoutBreakingDecimalsAbbreviationsOrMath() {
        val text = "El Dr. Pérez calcula 1.25 m. Luego usa \\(x=1.25. \\text{Dato interno}\\). Finalmente compara."
        val parts = resolutionSegments(text)
        assertEquals(3, parts.size)
        assertEquals("El Dr. Pérez calcula 1.25 m.", parts.first())
        assertTrue(parts[1].contains("\\(x=1.25. \\text{Dato interno}\\)"))
        assertEquals(text, parts.joinToString(" "))
    }
    @Test fun singleSentenceAndEmptyExplanationDoNotInventSteps() {
        assertEquals(emptyList<String>(), resolutionSegments("  "))
        val generic = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
        assertEquals(listOf(generic), resolutionSegments(generic))
        assertEquals(listOf("α + β = 180°"), resolutionSegments("α + β = 180°"))
    }
    @Test fun realExplanationsAcrossAllResourceSubjectsKeepEveryNonWhitespaceCharacter() {
        val root = File("../shared/src/commonMain/composeResources/files/aprender")
        val subjects = root.listFiles()!!.filter { it.isDirectory }
        var checked = 0
        subjects.forEach { subject ->
            val file = subject.walkTopDown().firstOrNull { it.name == "questions.json" } ?: return@forEach
            Json.parseToJsonElement(file.readText()).jsonArray.forEach { item ->
                val source = item.jsonObject["explanation"]?.jsonPrimitive?.content.orEmpty()
                assertEquals(file.path, source.filterNot(Char::isWhitespace), resolutionSegments(source).joinToString("").filterNot(Char::isWhitespace))
                checked++
            }
        }
        assertTrue("Expected multiple academic areas", subjects.size >= 15)
        assertTrue(checked >= 100)
    }
    @Test fun geometryMatchesRealSectionsAndRejectsOtherSubjectsAndGenericTitles() {
        val root = File("../shared/src/commonMain/composeResources/files/aprender/geometria")
        val expected = mapOf("semana03/3.1/theory.md" to GeometryConstruction.TRIANGLE_ANGLES,
            "semana07/7.1/theory.md" to GeometryConstruction.CIRCLE_TANGENT)
        expected.forEach { (path, diagram) ->
            val content = File(root,path).readText()
            val sections = parseAcademicContent(LessonTheory("test","Geometría",1,"Test",content)).sections
            assertTrue(path, sections.any { geometryDiagramFor("geometria",it.title) == diagram })
        }
        assertNull(geometryDiagramFor("biologia","Propiedades fundamentales de la circunferencia"))
        assertNull(geometryDiagramFor("geometria","Fundamentos y leyes principales"))
        assertNull(geometryDiagramFor("geometria","Suma de ángulos interiores de un polígono"))
    }
    @Test fun conceptMapUsesOnlyExplicitTermsAndRejectsDuplicates() {
        val section=AcademicSection(1,"Tipos",definitions=listOf("Masa: Cantidad de materia","Volumen: Espacio ocupado","Densidad: Masa por volumen"))
        assertEquals(listOf("Masa","Volumen","Densidad"), academicMapLabels(section))
        assertTrue(academicMapLabels(section.copy(definitions=listOf("Texto sin estructura"))).isEmpty())
        assertTrue(academicMapLabels(section.copy(definitions=List(3){"Masa: Cantidad de materia"})).isEmpty())
    }
}
