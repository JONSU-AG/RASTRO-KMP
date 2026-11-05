package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class ReadingTheoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/comprension_lectora")
    private fun theory(week: Int, part: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week))

    @Test fun allSixteenLessonsKeepTwentyTwoConnectedMapsAndMatchingFixtures() {
        var graphs = 0
        var nodes = 0
        for (week in 1..8) for (part in 1..2) {
            val file = theory(week, part)
            val maps = prepareAcademicTheory(file.readText()).diagrams
            assertEquals(file.path, if (week in setOf(4, 5, 7)) 2 else 1, maps.size)
            maps.forEach { map ->
                val ids = map.nodes.map { it.id }.toSet()
                assertEquals(map.nodes.size, ids.size)
                assertTrue(map.nodes.all { it.label.isNotBlank() })
                assertTrue(map.edges.all { it.from in ids && it.to in ids })
                val starts = map.nodes.filter { n -> map.edges.none { it.to == n.id } }
                assertEquals(1, starts.size)
                val reached = mutableSetOf(starts.single().id)
                while (true) {
                    val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                    if (added.isEmpty()) break
                    reached.addAll(added)
                }
                assertEquals(file.path, ids, reached)
                nodes += map.nodes.size
                graphs++
            }
            val rel = file.relativeTo(root).path
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/comprension_lectora/$rel").readBytes())
        }
        assertEquals(22, graphs)
        assertEquals(256, nodes)
    }

    @Test fun paragraphStructuresAreTablesAndCohesionDoesNotContainTheMisplacedToneChart() {
        for (part in 1..2) {
            val table = extractAcademicTables(theory(3, part).readLines()).second.single { it.headers.first() == "Organización habitual" }
            assertEquals(5, table.rows.size)
            assertTrue(table.rows.any { it.first() == "Centrada" })
            val coherence = prepareAcademicTheory(theory(7, part).readText()).diagrams
            assertFalse(coherence.flatMap { it.nodes }.any { it.label.contains("LAUDATORIO") || it.label.contains("BELIGERANTE") })
        }
        val expected = mapOf(1 to "Texto de partida", 2 to "Lectura", 5 to "Afirmación", 8 to "Formato")
        expected.forEach { (week, first) ->
            val table = extractAcademicTables(theory(week, 1).readLines()).second.single { it.headers.first() == first }
            assertEquals(3, table.rows.size)
            assertTrue(table.rows.all { it.size == table.headers.size })
        }
    }

    @Test fun unsupportedClaimsAndContradictionsRemainDifferentAndTitleRulesAreNotAbsolute() {
        for (part in 1..2) {
            val labels = prepareAcademicTheory(theory(5, part).readText()).diagrams.flatMap { it.nodes }.map { it.label }
            assertTrue(labels.any { it.contains("No determinado") && it.contains("ausencia de información no significa falsedad") })
            assertTrue(labels.any { it.contains("no equivale necesariamente a demostrado") })
            assertFalse(theory(3, part).readText().contains("regla morfosintáctica inquebrantable"))
            assertFalse(theory(5, part).readText().contains("En exámenes rigurosos de la UNSA y UNMSM"))
            assertFalse(theory(4, part).readText().contains("Empieza siempre con *ar, er, ir*"))
            assertFalse(theory(6, part).readText().contains("con fidelidad matemática"))
        }
    }
}
