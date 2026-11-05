package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class PhilosophyFinalMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/filosofia")
    private fun theory(week: Int, part: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week))

    @Test fun tenMapsKeepOneHundredSeventyFourNodesReachableAndFixturesEquivalent() {
        var total = 0
        for (week in 9..13) for (part in 1..2) {
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
            total += map.nodes.size
        }
        assertEquals(174, total)
    }

    @Test fun philosophicalDistinctionsAreNotPresentedAsSimplisticEquivalences() {
        for (part in 1..2) {
            fun labels(week: Int) = prepareAcademicTheory(theory(week, part).readText()).diagrams.flatMap { it.nodes }.map { it.label }
            assertTrue(labels(9).any { it.contains("fin del arte no significa") })
            assertTrue(labels(10).any { it.contains("no equivale simplemente a satisfacer a una mayoría") })
            assertTrue(labels(10).any { it.contains("no tratar a alguien meramente como medio") })
            assertTrue(labels(11).any { it.contains("no se presenta como una escala universal") })
            assertTrue(labels(12).any { it.contains("banalidad del mal no significa daño insignificante") })
            assertTrue(labels(12).any { it.contains("no amnesia real") })
            assertTrue(labels(13).any { it.contains("no significa descender de los chimpancés que viven hoy") })
        }
    }

    @Test fun fiveComparativeTablesKeepTheirRowsAndTheSchelerAttribution() {
        val headers = mapOf(9 to "Referencia", 10 to "Enfoque", 12 to "Pregunta", 13 to "Pregunta")
        headers.forEach { (week, first) ->
            val table = extractAcademicTables(theory(week, 1).readLines()).second.single { it.headers.first() == first }
            assertEquals(4, table.rows.size)
            assertTrue(table.rows.all { it.size == table.headers.size })
        }
        val text = theory(11, 1).readText()
        val hierarchy = extractAcademicTables(text.lines()).second.single { it.headers.first().contains("en su propuesta") }
        assertEquals(4, hierarchy.rows.size)
        assertTrue(hierarchy.rows.first().first().contains("Agradable"))
        assertEquals("Religiosos", hierarchy.rows.last().first())
        assertTrue(text.contains("Leer la jerarquía como propuesta de Scheler"))
        assertTrue(text.contains("No es una clasificación impuesta al estudiante"))
    }
}
