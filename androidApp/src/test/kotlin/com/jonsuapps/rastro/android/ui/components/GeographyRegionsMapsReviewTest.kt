package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class GeographyRegionsMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/geografia/semana08")
    private fun file(part: Int) = File(root, "8.$part/theory.md")

    @Test fun bothMapsKeepAllNewNodesReachableAndFixturesEquivalent() {
        for (part in 1..2) {
            val source = file(part)
            val text = source.readText()
            assertFalse(text.contains("Altitud (m)"))
            val maps = prepareAcademicTheory(text).diagrams
            assertEquals(2, maps.size)
            assertTrue(maps.all { it.nodes.isNotEmpty() })
            val map = maps.single { it.nodes.first().id == "ROOT" }
            val reached = mutableSetOf("ROOT")
            while (true) {
                val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                if (added.isEmpty()) break
                reached.addAll(added)
            }
            assertEquals(17, map.nodes.size)
            assertEquals(16, map.edges.size)
            assertEquals(map.nodes.map { it.id }.toSet(), reached)
            val fixture = File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/geografia/semana08/8.$part/theory.md")
            assertArrayEquals(source.readBytes(), fixture.readBytes())
        }
    }

    @Test fun eightRowsKeepBothYungaIntervalsAndAllOriginalRegionNodes() {
        for (part in 1..2) {
            val text = file(part).readText()
            val table = extractAcademicTables(text.lines()).second.single { it.headers.first() == "Región" && it.headers.size == 3 }
            assertEquals(listOf("Chala", "Yunga", "Quechua", "Suni", "Puna", "Janca", "Rupa Rupa", "Omagua"), table.rows.map { it.first() })
            assertTrue(table.rows.all { it.size == 3 })
            val yunga = table.rows.single { it.first() == "Yunga" }[1]
            assertTrue(yunga.contains("500–2300"))
            assertTrue(yunga.contains("1000–2300"))
            val original = prepareAcademicTheory(text).diagrams.single { it.nodes.first().id == "OCHO_REG" }
            assertTrue(original.nodes.map { it.id }.containsAll(listOf("CHALA", "YUNGA", "QUECHUA", "SUNI", "PUNA", "JANCA", "RUPA", "OMAGUA")))
        }
    }

    @Test fun classificationDoesNotBecomeAnAdministrativeBoundaryOrUniversalWeatherRule() {
        for (part in 1..2) {
            val text = file(part).readText()
            assertTrue(text.contains("no son departamentos"))
            assertTrue(text.contains("no son exclusivos de una sola ladera"))
            assertTrue(text.contains("especie usada como ejemplo no es necesariamente exclusiva"))
            assertTrue(text.contains("justo en un límite"))
            assertFalse(text.contains("sol permanente"))
            assertFalse(text.contains("bajo 0^\\circ\\text{C} siempre"))
        }
    }
}
