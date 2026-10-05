package com.jonsuapps.rastro

import com.jonsuapps.rastro.model.*
import kotlin.test.*

class LessonSpecialActivitiesTest {
    @Test fun preparedPilotRemainsValidWithoutWarnings() {
        val prepared = com.jonsuapps.rastro.data.catalog.BiologiaPart1.lessons.take(4).map(LessonSpecialActivities::prepare)
        val summary = com.jonsuapps.rastro.data.validation.CatalogValidator.validateCatalog(prepared)
        assertEquals(0, summary.errorCount, summary.toString())
        assertEquals(0, summary.warningCount, summary.toString())
    }
    @Test fun identicalInteractiveContentIsStillDetectedAsDuplicate() {
        val prepared = LessonSpecialActivities.prepare(com.jonsuapps.rastro.data.catalog.BiologiaPart1.lessons.first())
        val exercise = prepared.challenges.first { it.type == ChallengeType.FILL_BLANK }
        val duplicated = prepared.copy(challenges = prepared.challenges + exercise.copy(id = "duplicate-fixture"))
        val summary = com.jonsuapps.rastro.data.validation.CatalogValidator.validateCatalog(listOf(duplicated))
        assertEquals(1, summary.errorCount)
        assertTrue(summary.reports.single().issues.any { it.code == "DUPLICATE_QUESTION_STATEMENT" })
    }
    private fun lesson(count: Int = 20) = LessonNode("fixture", "literatura", 1, "1.1", "Fixture",
        LessonTheory("fixture", "literatura", 1, "Fixture", "Fixture"),
        (0 until count).map { index -> Challenge("q$index", statement = "Enunciado $index", subject = "literatura",
            options = listOf("Concepto $index", "Distractor $index"), explanation = "El Concepto $index pertenece al enunciado $index.") })
    @Test fun addsFourDistributedExercisesWithoutRemovingOriginalsAndIsIdempotent() {
        listOf(7, 13, 20).forEach { count ->
            val original = lesson(count)
            val prepared = LessonSpecialActivities.prepare(original)
            assertEquals(count + 4, prepared.challenges.size)
            assertEquals(2, prepared.challenges.count { it.type == ChallengeType.MATCH_PAIRS })
            assertEquals(2, prepared.challenges.count { it.type == ChallengeType.FILL_BLANK })
            assertEquals(original.challenges, prepared.challenges.filter { it.type == ChallengeType.MULTIPLE_CHOICE })
            assertEquals(prepared, LessonSpecialActivities.prepare(prepared))
            prepared.challenges.forEach { assertTrue(ChallengeInteraction.validationErrors(it).isEmpty()) }
            assertTrue(prepared.challenges.indexOfFirst { it.type != ChallengeType.MULTIPLE_CHOICE } < count / 2)
        }
    }
    @Test fun completionHidesExistingCorrectPhraseAndMatchingUsesOnlyLocalAnswers() {
        val original = lesson()
        val prepared = LessonSpecialActivities.prepare(original)
        val sources = original.challenges.associateBy { it.id }
        prepared.challenges.filter { it.type == ChallengeType.FILL_BLANK }.forEach { q ->
            val source = sources.getValue(q.id.removeSuffix("_practice_fill"))
            assertEquals(source.explanation, q.textTemplate!!.replace("{{answer}}", q.blanks.single().correctText))
        }
        prepared.challenges.filter { it.type == ChallengeType.MATCH_PAIRS }.flatMap { it.pairs }.forEach { p ->
            assertEquals(sources.getValue(p.id).options.first(), p.right)
            assertEquals(sources.getValue(p.id).statement, p.left)
        }
    }
    @Test fun calculationAndUnsupportedSubjectsRetainTheirQuestions() {
        val physics = lesson().copy(subjectId = "fisica", challenges = listOf(Challenge("number", statement = "Calcula la velocidad a los 5 segundos", options = listOf("20 m/s", "10 m/s"))))
        assertEquals(physics, LessonSpecialActivities.prepare(physics))
        val algebra = lesson().copy(subjectId = "algebra")
        assertEquals(algebra, LessonSpecialActivities.prepare(algebra))
    }
    @Test fun difficultRelationsUseCompletionWithoutDuplicatingPairs() {
        val original = lesson(4).let { it.copy(challenges = it.challenges.map { q -> q.copy(statement = "Texto conceptual extenso. ".repeat(15)) }) }
        val special = LessonSpecialActivities.prepare(original).challenges.filter { it.type != ChallengeType.MULTIPLE_CHOICE }
        assertEquals(4, special.size)
        assertTrue(special.all { it.type == ChallengeType.FILL_BLANK })
        assertEquals(4, special.map { it.id }.distinct().size)
    }
    @Test fun explicitTheoryNotesSupplyCompletionWhenQuestionAnswersAreTooLong() {
        val original = lesson(4).let { node -> node.copy(
            theory = node.theory.copy(conceptosClave = listOf("Concepto A: Definición A", "Concepto B: Definición B", "Concepto C: Definición C", "Concepto D: Definición D")),
            challenges = node.challenges.map { it.copy(options = listOf("Una respuesta extensa. ".repeat(12), "Otro distractor extenso. ".repeat(12))) }) }
        val prepared = LessonSpecialActivities.prepare(original)
        val added = prepared.challenges.filter { it.type != ChallengeType.MULTIPLE_CHOICE }
        assertEquals(4, added.size)
        assertEquals(3, added.count { it.type == ChallengeType.FILL_BLANK })
        assertTrue(added.filter { it.type == ChallengeType.MATCH_PAIRS }.all { it.pairs.size in 4..6 })
        assertEquals(prepared, LessonSpecialActivities.prepare(prepared))
        added.forEach { q ->
            assertTrue(ChallengeInteraction.validationErrors(q).isEmpty())
            q.explanation.lines().forEach { assertTrue(it in original.theory.conceptosClave) }
        }
    }
}
