package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class GeographyReliefMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/geografia/semana07")
    private fun file(part: Int) = File(root, "7.$part/theory.md")

    @Test fun everyReliefNodeIsReachableWithoutFixedWidthSketches() {
        for (part in 1..2) {
            val text = file(part).readText()
            assertFalse(text.contains("[SECTOR NORTE]"))
            assertFalse(text.contains("[TAHUAMPAS / AGUAJALES]"))
            assertFalse(text.contains("Nivel del mar (0 m)"))
            val maps = prepareAcademicTheory(text).diagrams.filter { it.nodes.firstOrNull()?.id == "ROOT" }
            assertEquals(2, maps.size)
            for (map in maps) {
                val reached = mutableSetOf("ROOT")
                while (true) {
                    val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                    if (added.isEmpty()) break
                    reached.addAll(added)
                }
                assertEquals(17, map.nodes.size)
                assertEquals(16, map.edges.size)
                assertEquals(map.nodes.map { it.id }.toSet(), reached)
            }
            val fixture = File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/geografia/semana07/7.$part/theory.md")
            assertArrayEquals(file(part).readBytes(), fixture.readBytes())
        }
    }

    @Test fun twoComparisonsKeepAllFormsAndRectangularCells() {
        for (part in 1..2) {
            val tables = extractAcademicTables(file(part).readLines()).second
            val marine = tables.single { it.headers.first() == "Forma" }
            assertEquals(5, marine.rows.size)
            assertTrue(marine.rows.any { it.first() == "Llanura abisal" })
            val flood = tables.single { it.headers.first() == "Término" }
            assertEquals(listOf("Tahuampa", "Aguajal", "Restinga", "Alto", "Filo", "Cocha"), flood.rows.map { it.first() })
            for (t in listOf(marine, flood)) assertTrue(t.rows.all { it.size == t.headers.size })
        }
    }

    @Test fun definitionsDoNotTurnRegionalExamplesIntoUniversalSafetyClaims() {
        for (part in 1..2) {
            val text = file(part).readText()
            assertFalse(text.contains("Tahuampas o Aguajales"))
            assertFalse(text.contains("nunca se inundan"))
            assertFalse(text.contains("siempre bajo agua"))
            assertTrue(text.contains("no son sinónimos") || text.contains("no sinónimos"))
            assertTrue(text.contains("no garantiza por sí solo seguridad"))
            assertTrue(text.contains("no coincide necesariamente con toda la plataforma"))
            assertTrue(text.contains("no es un perfil batimétrico a escala"))
            assertTrue(text.contains("no una escala altitudinal universal") || text.contains("en una escala altitudinal universal"))
        }
    }
}
