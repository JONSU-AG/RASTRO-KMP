package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class PhilosophyTheoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/filosofia")
    private fun theory(week: Int, part: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week))

    @Test fun eightMapsKeepAllReviewedConceptsReachableAndFixturesEquivalent() {
        var count = 0
        for (week in 2..5) for (part in 1..2) {
            val file = theory(week, part)
            val map = prepareAcademicTheory(file.readText()).diagrams.single()
            val ids = map.nodes.map { it.id }.toSet()
            assertEquals(map.nodes.size, ids.size)
            assertTrue(map.nodes.all { it.label.isNotBlank() })
            assertTrue(map.edges.all { it.from in ids && it.to in ids })
            val reached = mutableSetOf("ROOT")
            while (true) {
                val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                if (added.isEmpty()) break
                reached.addAll(added)
            }
            assertEquals(file.path, ids, reached)
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/filosofia/${file.relativeTo(root).path}").readBytes())
            count += map.nodes.size
        }
        assertEquals(152, count)
    }

    @Test fun mapsDoNotEquateRandomnessWithControlOrScientificTheoriesWithGraduatedLaws() {
        for (part in 1..2) {
            fun labels(week: Int) = prepareAcademicTheory(theory(week, part).readText()).diagrams.flatMap { it.nodes }.map { it.label }
            assertTrue(labels(3).any { it.contains("azar por sí solo no demuestra control") })
            assertTrue(labels(3).any { it.contains("no son por definición subtipos") })
            assertTrue(labels(4).any { it.contains("razón suficiente") && it.contains("no una tautología") })
            assertTrue(labels(4).any { it.contains("Deducir no se limita") })
            assertTrue(labels(5).any { it.contains("No existe una secuencia rígida") })
            assertTrue(labels(5).any { it.contains("no se transforma automáticamente en ley") })
        }
        val expected = mapOf(2 to "Pregunta de ejemplo", 3 to "Pregunta", 4 to "Premisas", 5 to "Concepto")
        expected.forEach { (week, first) ->
            val table = extractAcademicTables(theory(week, 1).readLines()).second.single { it.headers.first() == first }
            assertTrue(table.rows.size >= 2)
            assertTrue(table.rows.all { it.size == table.headers.size })
        }
    }

    @Test fun thePublishedCounterexampleAndModusPonensAgreeWithAllFourValuations() {
        val values = listOf(false, true)
        for (p in values) for (q in values) {
            if ((!p || q) && p) assertTrue(q)
        }
        val counterexamples = values.flatMap { p -> values.map { q -> p to q } }
            .filter { (p, q) -> (!p || q) && q && !p }
        assertEquals(listOf(false to true), counterexamples)
        val text = theory(4, 1).readText()
        assertTrue(text.contains("con p falsa y q verdadera"))
        assertTrue(text.contains("Afirmación del consecuente: inválida"))
    }
}
