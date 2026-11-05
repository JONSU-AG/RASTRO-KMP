package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class VerbalTheoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal")

    @Test fun sixteenLessonsKeepTwentySixReachableMapsAndEquivalentFixtures() {
        var graphs = 0
        var nodes = 0
        for (week in 1..8) for (part in 1..2) {
            val rel = "semana%02d/$week.$part/theory.md".format(week)
            val file = File(root, rel)
            val maps = prepareAcademicTheory(file.readText()).diagrams
            assertEquals(rel, if (week in setOf(2, 3, 4, 5, 8)) 2 else 1, maps.size)
            assertEquals(1, maps.count { map -> map.nodes.any { it.id == "ROOT" } })
            maps.forEach { map ->
                val ids = map.nodes.map { it.id }.toSet()
                assertEquals(map.nodes.size, ids.size)
                assertTrue(map.nodes.all { it.label.isNotBlank() })
                assertTrue(map.edges.all { it.from in ids && it.to in ids })
                val start = map.nodes.filter { n -> map.edges.none { it.to == n.id } }
                assertEquals(rel, 1, start.size)
                val reached = mutableSetOf(start.single().id)
                while (true) {
                    val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                    if (added.isEmpty()) break
                    reached.addAll(added)
                }
                assertEquals(rel, ids, reached)
                nodes += map.nodes.size
                graphs++
            }
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/$rel").readBytes())
        }
        assertEquals(26, graphs)
        assertEquals(274, nodes)
    }

    @Test fun repeatedProceduresBecomeReferencesAndTheFourTablesRemainStructured() {
        for (week in listOf(3, 4, 8)) {
            val text = File(root, "semana%02d/$week.1/theory.md".format(week)).readText()
            assertEquals(1, Regex("PROOT\\[").findAll(text).count())
            assertTrue(text.contains("**Procedimiento:** consulta el mapa"))
        }
        val expected = mapOf(1 to "Relación", 2 to "Par", 6 to "Dimensión", 7 to "Caso")
        expected.forEach { (week, header) ->
            val text = File(root, "semana%02d/$week.1/theory.md".format(week)).readText()
            val table = extractAcademicTables(text.lines()).second.single { it.headers.first() == header }
            assertTrue(table.rows.size >= 3)
            assertTrue(table.rows.all { it.size == table.headers.size })
        }
    }

    @Test fun explanationsDoNotRejectValidGrammarOrTreatPresuppositionsAsProof() {
        for (part in 1..2) {
            fun theory(week: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week)).readText()
            assertFalse(theory(1).contains("erradicando los \"verbos comodín\""))
            assertFalse(theory(3).contains("de manera infalible"))
            assertFalse(theory(6).contains("presuposición lingüística incuestionable"))
            assertFalse(theory(6).contains("**No resiste la negación formal.**"))
            assertTrue(theory(7).contains("quejarse admite un complemento con de"))
            assertTrue(theory(7).contains("admite concordancia en singular o plural"))
            assertFalse(theory(7).contains("todo pleonasmo es clasificado"))
            assertTrue(theory(7).contains("Hacer un plan\" es una construcción válida"))
        }
    }
}
