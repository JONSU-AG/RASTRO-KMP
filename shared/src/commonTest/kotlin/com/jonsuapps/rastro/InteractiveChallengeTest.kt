package com.jonsuapps.rastro

import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.data.content.LessonContentMapper
import com.jonsuapps.rastro.data.content.QuestionJson
import com.jonsuapps.rastro.data.catalog.BiologiaPart1
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
import kotlin.test.*

/** Synthetic interaction fixtures, never installed in a lesson/catalog. */
class InteractiveChallengeTest {
    @Test fun templateMarkersEscapeAllLiteralBracesForAndroidIcu() {
        assertEquals("""\{\{([^{}]+)\}\}""", ChallengeInteraction.templateMarker.pattern)
        val text = "{nota} {{first}} y {{second}}; {{incompleto}"
        assertEquals(listOf("first", "second"), ChallengeInteraction.templateMarker.findAll(text).map { it.groupValues[1] }.toList())
        assertTrue(ChallengeInteraction.validationErrors(filling()).isEmpty())
        assertFalse(ChallengeInteraction.fillingComplete(filling(), emptyMap()))
        assertTrue(ChallengeInteraction.fillingCorrect(filling(), mapOf("first" to "A", "second" to "Dos")))
    }
    private fun matching() = Challenge(id = "fixture-match", type = ChallengeType.MATCH_PAIRS,
        statement = "Relaciona los elementos", explanation = "Fixture de interacción",
        pairs = listOf(ChallengePair("a", "A", "Uno"), ChallengePair("b", "B", "Dos")),
        rightOptions = listOf(ChallengeMatchOption("b", "Dos"), ChallengeMatchOption("a", "Uno")))
    private fun filling() = Challenge(id = "fixture-fill", type = ChallengeType.FILL_BLANK,
        statement = "Completa el texto", explanation = "Fixture de interacción",
        textTemplate = "Primero {{first}}, después {{second}}.", blanks = listOf(
            ChallengeBlank("first", listOf("A", "B"), "A"),
            ChallengeBlank("second", listOf("Uno", "Dos"), "Dos")))

    @Test fun matchingLocksBothEndpointsAndWrongLinksDoNotReduceChoices() {
        val challenge = matching()
        var state = ChallengeInteraction.match(challenge, MatchAnswerState(), 0, 0)
        assertEquals(1, state.mistakes)
        assertTrue(state.links.isEmpty())
        assertTrue(state.lastMismatch)
        state = ChallengeInteraction.match(challenge, state, 0, 1)
        assertEquals(mapOf(0 to 1), state.links)
        assertFalse(state.lastMismatch)
        assertEquals(state, ChallengeInteraction.match(challenge, state, 0, 0))
        assertEquals(state, ChallengeInteraction.match(challenge, state, 1, 1))
        assertFalse(ChallengeInteraction.matchingComplete(challenge, state))
        state = ChallengeInteraction.match(challenge, state, 1, 0)
        assertTrue(ChallengeInteraction.matchingComplete(challenge, state))
        assertEquals(1, state.mistakes) // Engine records one failed activity, not XP per pair.
    }
    @Test fun fillingRequiresEverySpaceAndAllowsCorrectionsBeforeChecking() {
        val challenge = filling()
        assertFalse(ChallengeInteraction.fillingComplete(challenge, mapOf("first" to "A")))
        val wrong = mapOf("first" to "B", "second" to "Dos")
        assertTrue(ChallengeInteraction.fillingComplete(challenge, wrong))
        assertFalse(ChallengeInteraction.fillingCorrect(challenge, wrong))
        assertTrue(ChallengeInteraction.fillingCorrect(challenge, wrong + ("first" to "A")))
        assertFalse(ChallengeInteraction.fillingComplete(challenge, wrong + ("first" to "injected")))
    }
    @Test fun malformedActivitiesFailLocallyAndCannotAwardCorrectAnswers() {
        val matching = matching().copy(rightOptions = listOf(ChallengeMatchOption("unknown", "Otro")))
        assertTrue(ChallengeInteraction.validationErrors(matching).isNotEmpty())
        assertEquals(MatchAnswerState(), ChallengeInteraction.match(matching, MatchAnswerState(), 0, 0))
        val missing = filling().copy(textTemplate = "Solo {{first}}")
        assertTrue(ChallengeInteraction.validationErrors(missing).isNotEmpty())
        assertFalse(ChallengeInteraction.fillingCorrect(missing, mapOf("first" to "A", "second" to "Dos")))
        val duplicated = filling().copy(textTemplate = "{{first}} {{first}} {{second}}")
        assertTrue(ChallengeInteraction.validationErrors(duplicated).isNotEmpty())
        val ambiguous = matching().copy(pairs = matching().pairs.map { it.copy(left = "Igual") })
        assertTrue(ChallengeInteraction.validationErrors(ambiguous).isNotEmpty())
    }
    @Test fun legacySingleBlankAndImplicitRightColumnRemainSupported() {
        val legacy = Challenge(id = "legacy", type = ChallengeType.FILL_BLANK, statement = "A ___ B",
            chips = listOf("uno", "dos"), correctText = "uno")
        assertTrue(ChallengeInteraction.validationErrors(legacy).isEmpty())
        assertEquals("A  {{answer}}  B", ChallengeInteraction.template(legacy))
        assertTrue(ChallengeInteraction.fillingCorrect(legacy, mapOf("answer" to "uno")))
        val match = matching().copy(rightOptions = emptyList())
        assertTrue(ChallengeInteraction.validationErrors(match).isEmpty())
        assertEquals(listOf("a", "b"), ChallengeInteraction.rightOptions(match).map { it.id })
    }
    @Test fun jsonMapperSupportsTwoActivitiesWithoutMultipleChoiceFields() {
        val raw = """[{"id":"match","type":"MATCH_PAIRS","statement":"Relaciona","explanation":"Fixture", "pairs":[{"id":"a","left":"A","right":"Uno"},{"id":"b","left":"B","right":"Dos"}]},
          {"id":"fill","type":"FILL_BLANK","statement":"Completa","explanation":"Fixture", "textTemplate":"{{first}} y {{second}}", "blanks":[{"id":"first","options":["A","B"],"correctText":"A"},{"id":"second","options":["Uno","Dos"],"correctText":"Dos"}]}]"""
        val loaded = LessonContentMapper.toChallenges(Json.decodeFromString<List<QuestionJson>>(raw))
        assertEquals(listOf(ChallengeType.MATCH_PAIRS, ChallengeType.FILL_BLANK), loaded.map { it.type })
        assertEquals(2, loaded[1].blanks.size)
        assertEquals(loaded, Json.decodeFromString<List<Challenge>>(Json.encodeToString(loaded)))
        assertFailsWith<IllegalArgumentException> {
            LessonContentMapper.toChallenges(listOf(QuestionJson(id = "bad", type = "FILL_BLANK", statement = "Bad", explanation = "Fixture")))
        }
    }
    @Test fun catalogValidatorIncludesInteractiveStructureWithoutAcademicContamination() {
        val base = BiologiaPart1.lessons.first()
        val bad = filling().copy(textTemplate = "Sin espacios")
        val report = CatalogValidator.validateLesson(base.copy(challenges = listOf(bad)))
        assertTrue(report.issues.any { it.code == "INVALID_INTERACTIVE_CHALLENGE" })
        assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Literatura", filling().statement))
    }
}
