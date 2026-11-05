package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class CivicsTheoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/civica")
    private fun theory(week: Int, part: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week))

    @Test fun sixMapsKeepOneHundredTwoNodesReachableAndFixturesEquivalent() {
        var total = 0
        for (week in 1..3) for (part in 1..2) {
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
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/civica/${file.relativeTo(root).path}").readBytes())
            total += map.nodes.size
        }
        assertEquals(102, total)
    }

    @Test fun mapsKeepTheConstitutionalQualifiersAndSeparateCitizenshipFromItsExercise() {
        for (part in 1..2) {
            fun labels(week: Int) = prepareAcademicTheory(theory(week, part).readText()).diagrams.flatMap { it.nodes }.map { it.label }
            assertTrue(labels(1).any { it.contains("concebido") && it.contains("en todo cuanto le favorece") })
            assertTrue(labels(2).any { it.contains("inscripción electoral") && it.contains("ejercicio de la ciudadanía") })
            assertTrue(labels(2).any { it.contains("suspensión del ejercicio") && it.contains("no equivale a borrar identidad") })
            assertTrue(labels(2).any { it.contains("propuesta de reforma") && it.contains("ya aprobada y vigente") })
            assertTrue(labels(3).any { it.contains("Ius soli") && it.contains("criterios de nacionalidad") })
            assertTrue(labels(3).any { it.contains("Gobierno:") && it.contains("no es idéntico al Estado") })
        }
    }

    @Test fun threeTablesPreserveFourRowsAndDistinctConcepts() {
        val headers = mapOf(1 to "Tipo de norma, como distinción didáctica", 2 to "Categoría", 3 to "Concepto")
        headers.forEach { (week, first) ->
            val table = extractAcademicTables(theory(week, 1).readLines()).second.single { it.headers.first() == first }
            assertEquals(4, table.rows.size)
            assertTrue(table.rows.all { it.size == table.headers.size })
        }
        val citizenship = extractAcademicTables(theory(2, 1).readLines()).second.single { it.headers.first() == "Categoría" }
        assertEquals(listOf("Persona", "Nacionalidad", "Ciudadanía", "Ejercicio"), citizenship.rows.map { it.first() })
    }
}
