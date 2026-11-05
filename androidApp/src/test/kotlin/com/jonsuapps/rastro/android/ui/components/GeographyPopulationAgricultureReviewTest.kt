package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test

class GeographyPopulationAgricultureReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/geografia")
    private fun file(week: Int, part: Int) = File(root, "semana%02d/$week.$part/theory.md".format(week))

    @Test fun fourMapsAreReachableAndFixturesEquivalent() {
        for (week in 11..12) for (part in 1..2) {
            val source = file(week, part)
            val text = source.readText()
            val map = prepareAcademicTheory(text).diagrams.single { it.nodes.firstOrNull()?.id == "ROOT" }
            val reached = mutableSetOf("ROOT")
            while (true) {
                val added = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                if (added.isEmpty()) break
                reached.addAll(added)
            }
            assertEquals(17, map.nodes.size)
            assertEquals(16, map.edges.size)
            assertEquals(map.nodes.map { it.id }.toSet(), reached)
            val fixture = File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/geografia/${source.relativeTo(root).path}")
            assertArrayEquals(source.readBytes(), fixture.readBytes())
        }
    }

    @Test fun populationInterpretationSeparatesObservedProfileFromRatesAndLabourStatus() {
        for (part in 1..2) {
            val text = file(11, part).readText()
            assertFalse(text.contains("Países Subdesarrollados"))
            assertFalse(text.contains("**Estructura actual del Perú**"))
            assertTrue(text.contains("personas o porcentajes"))
            assertTrue(text.contains("no permite calcular por sí sola una tasa exacta"))
            assertTrue(text.contains("14 años o más"))
            assertTrue(text.contains("15–64"))
            assertTrue(text.contains("no se decide solo por ser estudiante"))
            assertTrue(text.contains("No garantiza empleo"))
            val table = extractAcademicTables(text.lines()).second.single { it.headers.first() == "Modelo general" }
            assertEquals(3, table.rows.size)
            assertTrue(table.rows.all { it.size == 3 })
        }
    }

    @Test fun agriculturalComparisonsDoNotAssignOneTechnologyOrMarketToAnEntireRegion() {
        for (part in 1..2) {
            val text = file(12, part).readText()
            assertFalse(text.contains("AGRICULTURA EN EL PERÚ"))
            assertTrue(text.contains("Coexisten secano y riego"))
            assertTrue(text.contains("Agricultura familiar no es sinónimo de autoconsumo"))
            assertTrue(text.contains("no toda parcela usa riego tecnificado"))
            assertTrue(text.contains("no la definición de toda la agricultura amazónica"))
            val table = extractAcademicTables(text.lines()).second.single { it.headers.first() == "Criterio" }
            assertEquals(listOf("Agua", "Organización", "Producción y destino"), table.rows.map { it.first() })
            assertTrue(table.rows.all { it.size == 3 })
        }
    }
}
