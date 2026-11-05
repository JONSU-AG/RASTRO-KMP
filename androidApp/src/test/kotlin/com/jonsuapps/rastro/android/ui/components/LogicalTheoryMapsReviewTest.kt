package com.jonsuapps.rastro.android.ui.components

import org.junit.Assert.*
import org.junit.Test
import java.io.File

class LogicalTheoryMapsReviewTest {
    private val root = File("../shared/src/commonMain/composeResources/files/aprender/raz_logico")

    @Test fun nineLogicalMapsKeepTheirReviewedBranchesReachableFromTheRoot() {
        var nodes = 0
        for (week in 1..9) {
            val rel = "semana%02d/$week.1/theory.md".format(week)
            val file = File(root, rel)
            val document = prepareAcademicTheory(file.readText())
            val map = document.diagrams.single { it.nodes.any { node -> node.id == "ROOT" } }
            val ids = map.nodes.map { it.id }.toSet()
            assertEquals(file.path, map.nodes.size, ids.size)
            assertTrue(file.path, map.edges.all { it.from in ids && it.to in ids })
            val reachable = mutableSetOf("ROOT")
            while (true) {
                val next = map.edges.filter { it.from in reachable }.map { it.to }.toSet() - reachable
                if (next.isEmpty()) break
                reachable.addAll(next)
            }
            assertEquals(file.path, ids, reachable)
            assertTrue(file.path, map.nodes.all { it.label.isNotBlank() })
            assertTrue(file.path, map.edges.filter { it.from == "ROOT" }.size in 3..4)
            assertFalse(file.path, map.source.contains("├"))
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_logico", rel).readBytes())
            nodes += map.nodes.size
        }
        assertEquals(150, nodes)
    }

    @Test fun reviewedMapsDoNotEquateContingencyWithSatisfiabilityOrConditionalsWithCausality() {
        val connectors = prepareAcademicTheory(File(root, "semana02/2.1/theory.md").readText())
        assertFalse(connectors.text.contains("Estructura de Causa-Efecto"))
        assertTrue(connectors.text.contains("no demuestra una causa física"))
        val systems = prepareAcademicTheory(File(root, "semana06/6.1/theory.md").readText()).diagrams.single { it.nodes.any { node -> node.id == "ROOT" } }
        assertTrue(systems.nodes.any { it.label.contains("contingente") && it.label.contains("también tiene asignaciones falsas") })
        val relations = File(root, "semana03/3.1/theory.md").readText()
        assertTrue(relations.contains("no dos flechas opuestas"))
        assertFalse(relations.contains("votar en las elecciones de la UNSA"))
    }

    @Test fun mathematicalAndEnglishMapsKeepAllNodesReachableAndFixturesEquivalent() {
        val levels = (1..7).map { "raz_matematico/semana%02d/$it.1".format(it) } +
            listOf("raz_matematico/semana05/5.2", "ingles/semana04/4.2")
        val content = File("../shared/src/commonMain/composeResources/files/aprender")
        var total = 0
        levels.forEach { level ->
            val file = File(content, "$level/theory.md")
            val diagram = prepareAcademicTheory(file.readText()).diagrams.single { map -> map.nodes.any { it.id == "ROOT" } }
            val ids = diagram.nodes.map { it.id }.toSet()
            val reachable = mutableSetOf("ROOT")
            while (true) {
                val next = diagram.edges.filter { it.from in reachable }.map { it.to }.toSet() - reachable
                if (next.isEmpty()) break
                reachable.addAll(next)
            }
            assertEquals(level, ids, reachable)
            assertTrue(level, diagram.nodes.all { it.label.isNotBlank() })
            assertArrayEquals(file.readBytes(), File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/$level/theory.md").readBytes())
            total += diagram.nodes.size
        }
        assertEquals(154, total)
        val geometry = File(content, "raz_matematico/semana04/4.1/theory.md").readText()
        assertTrue(geometry.contains("también se cuentan sus bordes interiores"))
        val probability = prepareAcademicTheory(File(content, "raz_matematico/semana06/6.1/theory.md").readText())
        val labels = probability.diagrams.flatMap { it.nodes }.map { it.label }
        assertTrue(labels.any { it.contains("equiprobables") })
        assertTrue(labels.any { it.contains("P(B)>0") })
    }
}
