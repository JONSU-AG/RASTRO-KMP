package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.SimuladorRepository
import com.jonsuapps.rastro.model.*
import kotlin.test.*

class CompetitionTest {
    @Test fun leagueBoundariesPromotionAndRelegationShareXp() {
        assertEquals("wawita", LeagueCatalog.current(-20).id)
        assertEquals("wawita", LeagueCatalog.current(1099).id)
        assertEquals("kinder", LeagueCatalog.current(1100).id)
        assertEquals(LeagueMovement.PROMOTION, LeagueCatalog.movement("wawita", 3600))
        assertEquals(LeagueMovement.RELEGATION, LeagueCatalog.movement("fosil", 3600))
        assertEquals(LeagueMovement.STAY, LeagueCatalog.movement("kinder", 1500))
        assertEquals(0f, LeagueCatalog.progress(1100))
        assertEquals(1f, LeagueCatalog.progress(26100))
        assertNull(LeagueCatalog.next(26100))
        assertNull(LeagueCatalog.previous(0))
    }
    @Test fun configurableEligibilityLimitsAndExtraAttempts() {
        val unlimited = RankingExamCatalog.forArea(AreaAdmision.SOCIALES)
        assertNull(unlimited.remaining(100000))
        assertTrue(unlimited.canAttempt("real-uid", 1, 100000))
        assertFalse(unlimited.canAttempt("", 1, 0))
        val limited = unlimited.copy(maxAttempts = 2, audience = ExamAudience.SELECTED_USERS, eligibleUids = setOf("eligible"), minimumLevel = 4)
        assertFalse(limited.canAttempt("other", 10, 0))
        assertFalse(limited.canAttempt("eligible", 3, 0))
        assertTrue(limited.canAttempt("eligible", 4, 1))
        assertFalse(limited.canAttempt("eligible", 4, 2))
        assertTrue(limited.canAttempt("eligible", 4, 2, 1))
        assertEquals(0, limited.remaining(99))
        assertFailsWith<IllegalArgumentException> { unlimited.copy(maxAttempts = 0) }
        assertNotEquals(unlimited.key, unlimited.copy(version = 2).key)
    }
    @Test fun calculatorUsesExactWeightsAndResetsByArea() {
        AreaAdmision.entries.forEach { area ->
            val rules = SimuladorRepository.getPonderaciones(area)
            assertEquals(80, rules.sumOf { it.preguntas })
            assertEquals(0.0, SimuladorRepository.projectedScore(area, emptyMap()))
            assertEquals(100.0, SimuladorRepository.projectedScore(area, rules.associate { it.asignatura to it.preguntas }), .002)
            val subject = rules.first()
            assertEquals(subject.valor, SimuladorRepository.projectedScore(area, mapOf(subject.asignatura to 1)), .0001)
            assertEquals(0.0, SimuladorRepository.projectedScore(area, mapOf(subject.asignatura to -10)))
            assertEquals(SimuladorRepository.projectedScore(area, mapOf(subject.asignatura to subject.preguntas)),
                SimuladorRepository.projectedScore(area, mapOf(subject.asignatura to 999)))
        }
    }
    private fun bank(area: AreaAdmision) = SimuladorRepository.getPonderaciones(area).flatMap { rule ->
        (0 until 15).map { i -> ExamQuestion("${rule.asignatura}_$i", "Fixture $i", listOf("A", "B"), 0, rule.asignatura, rule.curso, area.label) }
    }
    @Test fun rankingUsesActualSubjectsDistinctQuestionsAndFailsWhenBankInsufficient() {
        val area = AreaAdmision.BIOMEDICAS
        val source = bank(area).filterNot { it.asignatura == "Geometría" }
        val paper = SimuladorRepository.generateRankingExam(source, area, 42)
        assertEquals(80, paper.size)
        assertEquals(80, paper.distinctBy { it.id }.size)
        assertTrue(paper.all { q -> source.first { it.id == q.id }.asignatura == q.asignatura })
        assertTrue(paper.all { it.valorPonderado != null })
        assertEquals(paper, SimuladorRepository.generateRankingExam(source, area, 42))
        assertFailsWith<IllegalArgumentException> { SimuladorRepository.generateRankingExam(source.take(10), area, 42) }
    }
    @Test fun competitiveScoreUsesActualPaperWeightsAndDoesNotChangeOfficialScore() {
        val area = AreaAdmision.INGENIERIAS
        val paper = SimuladorRepository.generateRankingExam(bank(area), area, 1)
        val perfect = SimuladorRepository.calculateScore(paper, paper.indices.associateWith { 0 }, area)
        assertEquals(100.0, SimuladorRepository.rankingScore(perfect))
        val wrong = SimuladorRepository.calculateScore(paper, paper.indices.associateWith { 1 }, area)
        assertEquals(0.0, SimuladorRepository.rankingScore(wrong))
        val partial = SimuladorRepository.calculateScore(paper, mapOf(0 to 0), area)
        assertTrue(SimuladorRepository.rankingScore(partial) in 0.0001..99.9999)
        assertEquals(paper.first().valorPonderado!!, partial.unsaWeightedScore, .0001)
    }
}
