package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.catalog.BiologiaPart1
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.model.LessonDepth
import com.jonsuapps.rastro.model.SubtemaCode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CatalogPilotValidationTest {

    @Test
    fun testSubtemaCodeNaturalOrdering() {
        val rawCodes = listOf("2.1", "1.10", "1.2", "1.1.2", "1.1", "1.1.1")
        val sorted = rawCodes.sortedWith(SubtemaCode.comparator)
        val expected = listOf("1.1", "1.1.1", "1.1.2", "1.2", "1.10", "2.1")
        assertEquals(expected, sorted, "El orden jerárquico natural de subtemas debe cumplirse estrictamente sin floats")
    }

    @Test
    fun testBiologiaTema1PilotAcademicIntegrity() {
        val pilotLessons = BiologiaPart1.lessons.take(4)
        assertEquals(4, pilotLessons.size, "El piloto debe tener exactamente 4 lecciones para la Semana 1")

        val l1 = pilotLessons[0]
        val l2 = pilotLessons[1]
        val l3 = pilotLessons[2]
        val l4 = pilotLessons[3]

        // 1. Verificación de profundidades declaradas
        assertEquals(LessonDepth.NORMAL, l1.depth)
        assertEquals(LessonDepth.NORMAL, l2.depth)
        assertEquals(LessonDepth.SIMPLE, l3.depth)
        assertEquals(LessonDepth.EXTENSIVE, l4.depth)

        // 2. Verificación de cantidad de retos acordados sin relleno
        assertEquals(14, l1.challenges.size, "1.1 debe tener 14 retos")
        assertEquals(13, l2.challenges.size, "1.2 debe tener 13 retos")
        assertEquals(7, l3.challenges.size, "1.3 debe tener 7 retos")
        assertEquals(19, l4.challenges.size, "1.4 debe tener 19 retos")

        // 3. Ejecutar CatalogValidator sobre las 4 lecciones del piloto
        val summary = CatalogValidator.validateCatalog(pilotLessons)

        for (report in summary.reports) {
            println(report.toFormattedString())
            assertFalse(report.hasErrors, "La lección ${report.lessonId} no debe tener errores críticos: ${report.issues}")
            assertFalse(report.hasWarnings, "La lección ${report.lessonId} no debe tener advertencias pedagógicas: ${report.issues}")
            assertTrue(report.isClean, "La lección ${report.lessonId} debe estar 100% limpia")
        }

        assertEquals(0, summary.errorCount, "No debe haber ningún error en el piloto")
        assertEquals(0, summary.warningCount, "No debe haber advertencias en el piloto")
        assertEquals(4, summary.cleanLessonsCount, "Las 4 lecciones deben estar completamente conformes")
    }

    @Test
    fun testChallengesInternalIntegrity() {
        val pilotLessons = BiologiaPart1.lessons.take(4)
        for (lesson in pilotLessons) {
            for (challenge in lesson.challenges) {
                assertTrue(challenge.statement.isNotBlank(), "El enunciado no puede estar vacío en ${challenge.id}")
                assertTrue(challenge.options.size >= 2, "Debe tener al menos 2 opciones en ${challenge.id}")
                assertTrue(challenge.correctIndex in challenge.options.indices, "correctIndex fuera de rango en ${challenge.id}")
                assertTrue(challenge.explanation.isNotBlank(), "La explicación no puede estar vacía en ${challenge.id}")
                assertEquals(challenge.options.size, challenge.options.distinct().size, "Opciones duplicadas en ${challenge.id}")
            }
        }
    }

    @Test
    fun testBiologiaBloque1Validation() {
        val bloque1Lessons = BiologiaPart1.lessons.slice(4..15)
        assertEquals(12, bloque1Lessons.size, "El Bloque 1 debe tener exactamente 12 lecciones (Semanas 2, 3 y 4)")

        // 1. Verificar Semanas y Subtemas
        val expectedSubtemas = listOf(
            "2.1", "2.2", "2.3", "2.4",
            "3.1", "3.2", "3.3", "3.4",
            "4.1", "4.2", "4.3", "4.4"
        )
        assertEquals(expectedSubtemas, bloque1Lessons.map { it.subtema })

        // 2. Verificar LessonDepths
        val expectedDepths = listOf(
            LessonDepth.NORMAL, LessonDepth.SIMPLE, LessonDepth.NORMAL, LessonDepth.NORMAL,
            LessonDepth.NORMAL, LessonDepth.SIMPLE, LessonDepth.NORMAL, LessonDepth.NORMAL,
            LessonDepth.NORMAL, LessonDepth.NORMAL, LessonDepth.EXTENSIVE, LessonDepth.EXTENSIVE
        )
        assertEquals(expectedDepths, bloque1Lessons.map { it.depth })

        // 3. Verificar cantidad de retos por nivel
        val expectedCounts = listOf(
            13, 8, 12, 14,
            13, 8, 13, 12,
            14, 13, 19, 19
        )
        assertEquals(expectedCounts, bloque1Lessons.map { it.challenges.size })
        val totalQuestions = bloque1Lessons.sumOf { it.challenges.size }
        assertEquals(158, totalQuestions, "Total de preguntas en Bloque 1 debe ser exactamente 158")

        // 4. Integridad de retos (opciones no repetidas, correctIndex válido, explicaciones)
        val allChallengeIds = mutableSetOf<String>()
        for (lesson in bloque1Lessons) {
            for (challenge in lesson.challenges) {
                assertTrue(challenge.statement.isNotBlank(), "Enunciado vacío en ${challenge.id}")
                assertTrue(challenge.options.size in 4..5, "Opciones fuera de rango en ${challenge.id}: ${challenge.options.size}")
                assertTrue(challenge.correctIndex in challenge.options.indices, "correctIndex inválido en ${challenge.id}")
                assertTrue(challenge.explanation.isNotBlank(), "Explicación vacía en ${challenge.id}")
                assertEquals(challenge.options.size, challenge.options.distinct().size, "Opciones repetidas en ${challenge.id}")
                assertTrue(allChallengeIds.add(challenge.id), "ID de reto duplicado: ${challenge.id}")
            }
        }

        // 5. Ejecución completa de CatalogValidator
        val summary = CatalogValidator.validateCatalog(bloque1Lessons)
        for (report in summary.reports) {
            println(report.toFormattedString())
            assertFalse(report.hasErrors, "Error crítico en ${report.lessonId}: ${report.issues}")
            assertFalse(report.hasWarnings, "Advertencia en ${report.lessonId}: ${report.issues}")
            assertTrue(report.isClean, "La lección ${report.lessonId} debe estar 100% limpia")
        }

        assertEquals(0, summary.errorCount, "No debe haber errores en CatalogValidator para el Bloque 1")
        assertEquals(0, summary.warningCount, "No debe haber advertencias en CatalogValidator para el Bloque 1")
        assertEquals(12, summary.cleanLessonsCount, "Las 12 lecciones del Bloque 1 deben ser conformes")
    }
}
