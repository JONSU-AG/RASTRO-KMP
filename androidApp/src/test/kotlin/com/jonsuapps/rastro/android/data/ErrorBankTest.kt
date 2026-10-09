package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.model.ExamQuestion
import org.junit.Assert.*
import org.junit.Test

class ErrorBankTest {
    @Test fun clearingAllOriginsKeepsOnlyFailuresCapturedAfterTheCutoff() {
        val base = examErrors(listOf(question("same")), emptyMap(), ErrorBankOrigins.APRENDER).single()
        val old = ErrorBankOrigins.all.map { base.copy(id = it, origin = it, dateAdded = 100L, isSolved = true) }
        val newer = base.copy(id = "new", dateAdded = 201L)
        assertEquals(listOf(newer), visibleErrors(old + newer, 200L))
        assertEquals(old, visibleErrors(old, 0L))
    }
    @Test fun stalePublicProjectionCannotResurrectClearedErrors() {
        val base = examErrors(listOf(question("same")), emptyMap(), ErrorBankOrigins.APRENDER).single()
        val cutoff = System.currentTimeMillis() - 1000
        val old = base.copy(dateAdded = cutoff)
        val newer = base.copy(id = "new", dateAdded = cutoff + 1)
        assertEquals(listOf(newer), ErrorBankRepository.publicQuestions(mapOf("errorsPublic" to true,
            "errorsClearedAt" to cutoff, "sharedErrorBank" to listOf(old.payload(), newer.payload()))))
    }
    @Test fun expiresAtFifteenDaysWithoutRemovingRecentFailures() {
        val now = 20L * 24 * 60 * 60 * 1000
        val base = examErrors(listOf(question("same")), emptyMap(), ErrorBankOrigins.APRENDER).single()
        val old = base.copy(dateAdded = now - ERROR_RETENTION_MILLIS)
        val recent = base.copy(id = "recent", dateAdded = now - ERROR_RETENTION_MILLIS + 1)
        assertEquals(listOf(recent), retainedErrors(listOf(old, recent), now))
    }
    private fun question(id: String) = ExamQuestion(id, "Pregunta $id", listOf("A", "B", "C"), 1,
        "Biología", "Curso", "SOCIALES", explanation = "Explicación original")
    @Test fun capturesActualWrongAndBlankResponsesButNotCorrectOnes() {
        val result = examErrors(listOf(question("wrong"), question("correct"), question("blank")),
            mapOf("wrong" to 2, "correct" to 1), ErrorBankOrigins.SIMULACRO)
        assertEquals(2, result.size)
        assertEquals(2, result.first().selectedAnswerIndex)
        assertEquals(1, result.first().correctAnswerIndex)
        assertEquals("Explicación original", result.first().explanation)
        assertNull(result.last().selectedAnswerIndex)
    }
    @Test fun quickNormalAndRankingKeepDistinctOriginsForTheSameQuestion() {
        val records = listOf(ErrorBankOrigins.EXAMEN_RAPIDO, ErrorBankOrigins.SIMULACRO, ErrorBankOrigins.RANKING)
            .flatMap { examErrors(listOf(question("same")), mapOf("same" to 0), it) }
        assertEquals(3, records.map { it.id }.distinct().size)
        assertEquals(3, records.map { it.origin }.distinct().size)
    }
    @Test fun refailingAReviewedQuestionReopensItWithTheLatestChoiceWithoutDuplicating() {
        val next = examErrors(listOf(question("same")), mapOf("same" to 2), ErrorBankOrigins.RANKING).single()
        val updated = mergeError(listOf(next.copy(isSolved = true, selectedAnswerIndex = 0)), next)
        assertEquals(1, updated.size)
        assertFalse(updated.single().isSolved)
        assertEquals(2, updated.single().selectedAnswerIndex)
    }
    @Test fun missingOrFalseConsentNeverExposesPublicRows() {
        val error = examErrors(listOf(question("same")), emptyMap(), ErrorBankOrigins.SIMULACRO).single()
        val projection = listOf(error.payload())
        assertTrue(ErrorBankRepository.publicQuestions(mapOf("sharedErrorBank" to projection)).isEmpty())
        assertTrue(ErrorBankRepository.publicQuestions(mapOf("errorsPublic" to false, "sharedErrorBank" to projection)).isEmpty())
        assertEquals(listOf(error), ErrorBankRepository.publicQuestions(mapOf("errorsPublic" to true, "sharedErrorBank" to projection)))
    }
    @Test fun publicProjectionIsBoundedAndIncludesOnlyTheMostRecentRecords() {
        val error = examErrors(listOf(question("same")), emptyMap(), ErrorBankOrigins.SIMULACRO).single()
        val records = (1..50).map { error.copy(id = "error:$it", dateAdded = it.toLong()) }
        val projection = ErrorBankRepository.publicProjection(records)
        assertEquals(30, projection.size)
        assertEquals("error:50", projection.first()["id"])
        assertEquals("error:21", projection.last()["id"])
    }
    @Test fun malformedCorrectAnswerCannotProduceAFakeCorrectOption() {
        assertTrue(examErrors(listOf(question("bad").copy(answer = 99)), emptyMap(), ErrorBankOrigins.SIMULACRO).isEmpty())
        assertNull(FailedQuestion.from(mapOf("options" to listOf("A"), "correctAnswerIndex" to 9)))
    }
}
