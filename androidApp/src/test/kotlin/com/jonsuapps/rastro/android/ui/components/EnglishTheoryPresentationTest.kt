package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class EnglishTheoryPresentationTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/ingles")
    private fun file(level: String) = File(root, "semana%02d/$level/theory.md".format(level.substringBefore('.').toInt()))

    @Test fun brokenFencesAndArrayFragmentsAreReplacedWithEquivalentFixtures() {
        for (level in listOf("5.1", "5.2", "6.2")) {
            val source = file(level)
            val text = source.readText()
            assertEquals(0, Regex("```").findAll(text).count() % 2)
            assertFalse(text.contains("\\end{array}"))
            assertFalse(text.contains("│"))
            val fixture = File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/ingles/${source.relativeTo(root).path}")
            assertArrayEquals(source.readBytes(), fixture.readBytes())
        }
    }

    @Test fun allMapNodesAreReachableAndComparisonTablesRemainRectangular() {
        val map = prepareAcademicTheory(file("5.1").readText()).diagrams.single()
        val reached = mutableSetOf("ROOT")
        while (true) {
            val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
            if (added.isEmpty()) break
            reached.addAll(added)
        }
        assertEquals(17, map.nodes.size)
        assertEquals(map.nodes.map { it.id }.toSet(), reached)
        val tables = extractAcademicTables(file("5.2").readLines()).second
        assertEquals(4, tables.size)
        assertEquals(listOf(5, 9, 5, 4), tables.map { it.rows.size })
        assertTrue(tables.all { t -> t.rows.all { it.size == t.headers.size } })
        val reading = extractAcademicTables(file("6.2").readLines()).second.single()
        assertEquals(4, reading.rows.size)
    }

    @Test fun explanationsPreserveMeaningInsteadOfTeachingFalseAbsoluteRules() {
        val grammar = file("5.2").readText()
        assertTrue(grammar.contains("Yesterday, John bought"))
        assertTrue(grammar.contains("In the last year") && grammar.contains("no es incorrecto por sí mismo"))
        assertTrue(grammar.contains("The table is beautiful"))
        assertTrue(grammar.contains("no es una regla gramatical"))
        assertTrue(grammar.contains("On Monday morning"))
        val reading = file("6.2").readText()
        assertTrue(reading.contains("no indica una moneda"))
        assertTrue(reading.contains("no descartes", ignoreCase = true))
        assertTrue(reading.contains("exchange@example.org"))
        assertFalse(reading.contains("exchange@unsa.edu.pe"))
        for (literal in listOf("14 days", "1.50 per day", "10 minutes", "March 12th", "March 15th")) {
            assertTrue("Missing original reading fact: $literal", reading.contains(literal))
        }
    }
}
