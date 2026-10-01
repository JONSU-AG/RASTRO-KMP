package com.jonsuapps.rastro.vocational

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class VocationalTestValidationTest {

    private fun generateMock60Questions(): List<VocationalQuestion> {
        val list = mutableListOf<VocationalQuestion>()
        var order = 1
        var idCounter = 1
        RiasecDimension.entries.forEach { dim ->
            for (i in 1..10) {
                list.add(
                    VocationalQuestion(
                        id = idCounter++,
                        text = "Actividad oficial para ${dim.title} #$i",
                        dimension = dim,
                        order = order++
                    )
                )
            }
        }
        return list
    }

    @Test
    fun testItemBankSpecificationIntegrity() {
        val mockQuestions = generateMock60Questions()

        // Exactamente 60 items
        assertEquals(60, mockQuestions.size, "El banco debe requerir exactamente 60 ítems")

        // Exactamente 10 por dimensión
        RiasecDimension.entries.forEach { dim ->
            val count = mockQuestions.count { it.dimension == dim }
            assertEquals(10, count, "La dimensión $dim debe tener exactamente 10 ítems")
        }

        // Ninguna pregunta sin dimensión y ninguna repetida
        val uniqueIds = mockQuestions.map { it.id }.toSet()
        assertEquals(60, uniqueIds.size, "No deben existir preguntas con ID duplicado")

        mockQuestions.forEach { q ->
            assertTrue(q.id > 0, "El ID de la pregunta debe ser un entero positivo")
            assertTrue(q.text.isNotBlank(), "El texto de la pregunta no debe estar vacío")
        }
    }

    @Test
    fun testPendingStateItemBank() {
        assertFalse(VocationalItemBank.isBankLoaded, "El banco de ítems inicialmente está pendiente de carga oficial")
        assertEquals(emptyList(), VocationalItemBank.getQuestions())
    }

    @Test
    fun testAllowedAnswerValuesRange() {
        // Valores permitidos 1..5
        assertFailsWith<IllegalArgumentException> {
            VocationalAnswer(1, 0)
        }
        assertFailsWith<IllegalArgumentException> {
            VocationalAnswer(1, 6)
        }

        val validAnswers = (1..5).map { VocationalAnswer(it, it) }
        assertEquals(5, validAnswers.size)
        validAnswers.forEach {
            assertTrue(it.value in 1..5)
        }
    }

    @Test
    fun testCalculationAndScoreBounds() {
        val questions = generateMock60Questions()

        // Cada dimensión con respuestas mínimas (todas 1) => Puntaje = 10
        val minAnswers = questions.associate { it.id to 1 }
        val minResult = VocationalScoringEngine.calculateResult(questions, minAnswers)

        assertEquals(10, minResult.realistic)
        assertEquals(10, minResult.investigative)
        assertEquals(10, minResult.artistic)
        assertEquals(10, minResult.social)
        assertEquals(10, minResult.enterprising)
        assertEquals(10, minResult.conventional)

        // Cada dimensión con respuestas máximas (todas 5) => Puntaje = 50
        val maxAnswers = questions.associate { it.id to 5 }
        val maxResult = VocationalScoringEngine.calculateResult(questions, maxAnswers)

        assertEquals(50, maxResult.realistic)
        assertEquals(50, maxResult.investigative)
        assertEquals(50, maxResult.artistic)
        assertEquals(50, maxResult.social)
        assertEquals(50, maxResult.enterprising)
        assertEquals(50, maxResult.conventional)
    }

    @Test
    fun testSpecificDimensionScoringAndOrdering() {
        val questions = generateMock60Questions()

        // Asignar puntajes deliberados y no ambiguos:
        // Investigative = 50 (todas 5)
        // Realistic = 40 (todas 4)
        // Conventional = 30 (todas 3)
        // Social = 20 (todas 2)
        // Enterprising = 15 (5x1 + 5x2)
        // Artistic = 10 (todas 1)
        val answers = mutableMapOf<Int, Int>()
        questions.forEach { q ->
            val value = when (q.dimension) {
                RiasecDimension.INVESTIGATIVE -> 5
                RiasecDimension.REALISTIC -> 4
                RiasecDimension.CONVENTIONAL -> 3
                RiasecDimension.SOCIAL -> 2
                RiasecDimension.ENTERPRISING -> if (q.order % 2 == 0) 2 else 1
                RiasecDimension.ARTISTIC -> 1
            }
            answers[q.id] = value
        }

        val result = VocationalScoringEngine.calculateResult(questions, answers)

        assertEquals(50, result.investigative)
        assertEquals(40, result.realistic)
        assertEquals(30, result.conventional)
        assertEquals(20, result.social)
        assertEquals(15, result.enterprising)
        assertEquals(10, result.artistic)

        // Código Holland de las 3 primeras: IRC
        assertEquals("IRC", result.hollandCode)
        val ordered = result.orderedScores()
        assertEquals(RiasecDimension.INVESTIGATIVE, ordered[0].dimension)
        assertEquals(RiasecDimension.REALISTIC, ordered[1].dimension)
        assertEquals(RiasecDimension.CONVENTIONAL, ordered[2].dimension)
        assertEquals(RiasecDimension.SOCIAL, ordered[3].dimension)
        assertEquals(RiasecDimension.ENTERPRISING, ordered[4].dimension)
        assertEquals(RiasecDimension.ARTISTIC, ordered[5].dimension)
    }

    @Test
    fun testTiesPreservedWithoutRandomManipulation() {
        val questions = generateMock60Questions()

        // Empate exacto entre Investigador y Realista: ambos con 40 puntos
        val answers = questions.associate { q ->
            val value = when (q.dimension) {
                RiasecDimension.INVESTIGATIVE -> 4 // 10 * 4 = 40
                RiasecDimension.REALISTIC -> 4 // 10 * 4 = 40
                RiasecDimension.CONVENTIONAL -> 3
                RiasecDimension.SOCIAL -> 2
                RiasecDimension.ENTERPRISING -> 1
                RiasecDimension.ARTISTIC -> 1
            }
            q.id to value
        }

        val result = VocationalScoringEngine.calculateResult(questions, answers)

        assertEquals(40, result.investigative)
        assertEquals(40, result.realistic)

        // Verificar que el empate esté registrado explícitamente
        assertTrue(result.tiedDimensions.isNotEmpty(), "Debe detectar el empate sin alteración forzada de puntos")
        val isTied = result.tiedDimensions.any {
            (it.first == RiasecDimension.INVESTIGATIVE && it.second == RiasecDimension.REALISTIC) ||
                    (it.first == RiasecDimension.REALISTIC && it.second == RiasecDimension.INVESTIGATIVE)
        }
        assertTrue(isTied, "Investigativo y Realista deben estar registrados como empatados")
    }

    @Test
    fun testRejectsIncompleteAnswers() {
        val questions = generateMock60Questions()
        // Solo 59 respuestas
        val incompleteAnswers = questions.dropLast(1).associate { it.id to 3 }

        assertFailsWith<IllegalArgumentException> {
            VocationalScoringEngine.calculateResult(questions, incompleteAnswers)
        }
    }

    @Test
    fun testAlgorithmIsStrictlyDeterministic() {
        val questions = generateMock60Questions()
        val answers = questions.mapIndexed { index, q ->
            q.id to ((index % 5) + 1)
        }.toMap()

        val run1 = VocationalScoringEngine.calculateResult(questions, answers)
        val run2 = VocationalScoringEngine.calculateResult(questions, answers)

        assertEquals(run1.hollandCode, run2.hollandCode)
        assertEquals(run1.realistic, run2.realistic)
        assertEquals(run1.investigative, run2.investigative)
        assertEquals(run1.artistic, run2.artistic)
        assertEquals(run1.social, run2.social)
        assertEquals(run1.enterprising, run2.enterprising)
        assertEquals(run1.conventional, run2.conventional)
        assertEquals(VocationalScoringEngine.generateProfileSynthesis(run1), VocationalScoringEngine.generateProfileSynthesis(run2))
    }

    @Test
    fun testRepositoryPrivacyAndGuestSupport() {
        VocationalRepository.clearResult()

        // Inicialmente vacío
        assertNull(VocationalRepository.currentResult.value)

        val questions = generateMock60Questions()
        val answers = questions.associate { it.id to 4 }
        val result = VocationalScoringEngine.calculateResult(questions, answers)

        // Soporte de invitado (guarda en memoria local sin cuenta obligatoria)
        VocationalRepository.saveResult(result)
        assertEquals(result, VocationalRepository.currentResult.value)

        // Limpiar para repetir test
        VocationalRepository.clearResult()
        assertNull(VocationalRepository.currentResult.value)
    }
}
