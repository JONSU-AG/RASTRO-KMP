package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class GeographyTheoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/geografia")
    private fun file(week: Int, part: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week))

    @Test fun fourSourcesKeepEquivalentFixturesAndRemoveFixedWidthDrawings() {
        for (week in 5..6) for (part in 1..2) {
            val source = file(week, part)
            val text = source.readText()
            assertFalse(text.contains("+-----------------------------------------+"))
            assertFalse(text.contains("CORDILLERA DE LOS ANDES"))
            assertFalse(text.contains("53 ríos"))
            val fixture = File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/geografia/${source.relativeTo(root).path}")
            assertArrayEquals(source.readBytes(), fixture.readBytes())
            assertTrue(prepareAcademicTheory(text).diagrams.all { it.nodes.isNotEmpty() })
        }
    }

    @Test fun drainageMapMakesEveryNodeReachableAndDistinguishesInternalOutlet() {
        for (part in 1..2) {
            val map = prepareAcademicTheory(file(6, part).readText()).diagrams.single { it.nodes.any { n -> n.label == "Vertientes hidrográficas: destino de las aguas" } }
            val reached = mutableSetOf("ROOT")
            while (true) {
                val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                if (added.isEmpty()) break
                reached.addAll(added)
            }
            assertEquals(17, map.nodes.size)
            assertEquals(16, map.edges.size)
            assertEquals(map.nodes.map { it.id }.toSet(), reached)
            assertTrue(map.nodes.any { it.label.contains("Desaguadero") && it.label.contains("sistema interior") })
            assertTrue(map.nodes.any { it.label.contains("no todos sus tramos son navegables") })
            assertTrue(map.nodes.any { it.label.contains("ríos del conteo de cuencas") })
        }
    }

    @Test fun atmosphericProfileSeparatesThermalLayersFromIonizationAndModelAssumptions() {
        for (part in 1..2) {
            val text = file(5, part).readText()
            assertFalse(text.contains("Termósfera o Ionósfera"))
            assertTrue(text.contains("no es otro nombre de la termósfera"))
            assertTrue(text.contains("no está siempre a 12 km"))
            assertTrue(text.contains("no significa que toda columna real de aire tenga siempre ese gradiente"))
            val table = extractAcademicTables(text.lines()).second.single { it.headers.first() == "Capa" }
            assertEquals(listOf("Tropósfera", "Estratósfera", "Mesósfera", "Termósfera", "Exósfera"), table.rows.map { it.first() })
            assertTrue(table.rows.all { it.size == 3 })
            val drainage = extractAcademicTables(file(6, part).readLines()).second.single { it.headers.first() == "Región hidrográfica" }
            assertEquals(3, drainage.rows.size)
            assertTrue(drainage.rows.all { it.size == 3 })
        }
    }
}
