package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class PhilosophyHistoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/filosofia")
    private fun theory(week: Int, part: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week))

    @Test fun fourMapsKeepSixtyEightConceptsReachableAndSixFixturesEquivalent() {
        var nodes = 0
        for (week in 6..8) for (part in 1..2) {
            val file = theory(week, part)
            val diagrams = prepareAcademicTheory(file.readText()).diagrams
            assertEquals(file.path, if (week == 6) 0 else 1, diagrams.size)
            diagrams.forEach { map ->
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
                assertEquals(ids, reached)
                nodes += map.nodes.size
            }
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/filosofia/${file.relativeTo(root).path}").readBytes())
        }
        assertEquals(68, nodes)
    }

    @Test fun historicalTablesDoNotPlaceHegelEntirelyBeforeTheNineteenthCentury() {
        for (part in 1..2) {
            val table = extractAcademicTables(theory(6, part).readLines()).second.single {
                it.headers.first() == "Recorrido orientativo"
            }
            assertEquals(5, table.rows.size)
            val row = table.rows.single { it[1].contains("1770–1831") }
            assertTrue(row.first().contains("siglo XIX"))
            assertTrue(table.rows.any { it[1].contains("árabes y judías") })
            assertTrue(table.rows.all { it.size == table.headers.size })
        }
    }

    @Test fun contemporaryAndLatinAmericanComparisonsPreserveDifferencesBetweenAuthors() {
        for (part in 1..2) {
            fun labels(week: Int) = prepareAcademicTheory(theory(week, part).readText()).diagrams.flatMap { it.nodes }.map { it.label }
            assertTrue(labels(7).any { it.contains("Valladolid") && it.contains("no tuvo lugar en Perú") })
            assertTrue(labels(7).any { it.contains("Mariátegui") && it.contains("desacuerdos") })
            assertTrue(labels(8).any { it.contains("Gadamer no es una subdivisión") })
            assertTrue(labels(8).any { it.contains("Habermas") && it.contains("no presentarlo como defensor") })
        }
        assertEquals(3, extractAcademicTables(theory(7, 1).readLines()).second.single {
            it.headers == listOf("Cuestión", "Salazar Bondy", "Leopoldo Zea")
        }.rows.size)
        assertEquals(5, extractAcademicTables(theory(8, 1).readLines()).second.single {
            it.headers == listOf("Autor", "Concepto de orientación", "Pregunta de lectura")
        }.rows.size)
    }
}
