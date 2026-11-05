package com.jonsuapps.rastro.android.ui.components

import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ChemistryTheoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/quimica")

    @Test fun fifteenChemistryMapsHaveReachableConceptsAndMatchingFixtures() {
        var total = 0
        for (week in 1..15) {
            val rel = "semana%02d/$week.1/theory.md".format(week)
            val file = File(root, rel)
            val map = prepareAcademicTheory(file.readText()).diagrams.single { it.nodes.any { n -> n.id == "ROOT" } }
            val ids = map.nodes.map { it.id }.toSet()
            assertEquals(map.nodes.size, ids.size)
            assertTrue(map.edges.all { it.from in ids && it.to in ids })
            val reached = mutableSetOf("ROOT")
            while (true) {
                val new = map.edges.filter { it.from in reached }.map { it.to }.toSet() - reached
                if (new.isEmpty()) break
                reached.addAll(new)
            }
            assertEquals(rel, ids, reached)
            assertTrue(map.nodes.all { it.label.isNotBlank() })
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/quimica/$rel").readBytes())
            total += map.nodes.size
        }
        assertEquals(277, total)
    }

    @Test fun chemistryMapsDoNotTeachTheDetectedOversimplifications() {
        fun labels(week: Int) = prepareAcademicTheory(File(root, "semana%02d/$week.1/theory.md".format(week)).readText())
            .diagrams.flatMap { it.nodes }.map { it.label }
        assertTrue(labels(1).any { it.contains("coloide") && it.contains("fases distintas") })
        assertTrue(labels(2).any { it.contains("E_0=mc^2") && it.contains("invariante") })
        assertTrue(labels(3).any { it.contains("isoelectrónicas") && it.contains("no es una propiedad del núcleo") })
        assertTrue(labels(4).any { it.contains("18 grupos") })
        assertTrue(labels(4).any { it.contains("No es un giro clásico") })
        assertTrue(labels(5).any { it.contains("London") && it.contains("polares como apolares") })
    }

    @Test fun continuationTablesKeepChemicalNotationAndTheWorkedAmounts() {
        fun text(week: Int) = File(root, "semana%02d/$week.1/theory.md".format(week)).readText()
        val names = extractAcademicTables(text(6).lines()).second.single { it.headers == listOf("Fórmula", "Familia", "Nombre") }
        assertEquals(6, names.rows.size)
        assertTrue(names.rows.any { it[0].contains("HCl(aq)") && it[2] == "Ácido clorhídrico" })
        val agents = extractAcademicTables(text(7).lines()).second.single { it.headers.contains("Función") }
        assertTrue(agents.rows.any { it[0].contains("Zn") && it.last() == "Agente reductor" })
        assertTrue(agents.rows.any { it[0].contains("Cu^{2+}") && it.last() == "Agente oxidante" })
        val amounts = extractAcademicTables(text(8).lines()).second.single { it.headers.contains("Coeficiente") }
        assertEquals(2, amounts.rows.size)
        assertTrue(text(8).contains("sobran $2\\ \\mathrm{mol}$ de hidrógeno"))
        val labels = prepareAcademicTheory(text(8)).diagrams.flatMap { it.nodes }.map { it.label }
        assertTrue(labels.any { it.contains("22{,}4") && it.contains("273{,}15") && it.contains("atm") })
        assertTrue(prepareAcademicTheory(text(6)).diagrams.flatMap { it.nodes }.any {
            it.label.contains("No todo óxido") && it.label.contains("automáticamente")
        })
    }

    @Test fun finalMapsKeepTheNecessaryConditionsAndFiveTables() {
        val documents = (9..15).associateWith { week ->
            File(root, "semana%02d/$week.1/theory.md".format(week)).readText()
        }
        fun labels(week: Int) = prepareAcademicTheory(documents.getValue(week)).diagrams.flatMap { it.nodes }.map { it.label }
        assertTrue(labels(9).any { it.contains("cantidad de gas constantes") })
        assertTrue(labels(10).any { it.contains("mg/kg") && it.contains("densidad") })
        assertTrue(labels(11).any { it.contains("experimentalmente") && it.contains("no se copian") })
        assertTrue(labels(12).any { it.contains("14 a") && it.contains("25") })
        assertTrue(labels(13).any { it.contains("no multiplicar potenciales") })
        assertTrue(labels(14).any { it.contains("acíclicos con un solo doble") })
        assertTrue(labels(15).any { it.contains("oxidantes suaves") && it.contains("nunca") })
        val headers = mapOf(9 to "Condiciones", 10 to "Concentración", 12 to "Situación", 14 to "Familia y condición", 15 to "Familia")
        headers.forEach { (week, header) ->
            val table = extractAcademicTables(documents.getValue(week).lines()).second.single { it.headers.first() == header }
            assertTrue("$week.1", table.rows.size >= 4)
            assertTrue(table.rows.all { it.size == table.headers.size })
        }
    }
}
