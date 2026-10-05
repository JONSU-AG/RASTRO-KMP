package com.jonsuapps.rastro

import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.data.catalog.BiologiaCatalog
import kotlin.test.*

class TrailIllustrationsTest {
    private fun node(id: String, title: String, subject: String = "biologia") = LessonNode(
        id, subject, 1, title, title, LessonTheory(id, subject, 1, title, ""))

    @Test fun identitySurvivesProgressAndAvailabilityChanges() {
        val lesson = node("dna1", "Genética y ADN")
        assertEquals(TrailIllustrations.resolve(lesson), TrailIllustrations.resolve(lesson.copy(
            isLocked = true, isCompleted = true, isCurrent = true, stars = 3)))
    }
    @Test fun adjacentCompatibleLessonsRemainDistinctAndDeterministic() {
        val path = (1..20).map { node("dna$it", "Genética y ADN") }
        val icons = TrailIllustrations.resolvePath(path)
        assertEquals(icons, TrailIllustrations.resolvePath(path))
        assertTrue(icons.zipWithNext().all { (a,b) -> a != b })
        assertTrue(icons.all { it in setOf("dna", "dna-off", "network") })
    }
    @Test fun topicChangesSelectRelevantFamilies() {
        assertTrue(TrailIllustrations.resolve(node("poem", "Poesía lírica", "literatura")) in setOf("feather", "quote", "pen-tool"))
        assertTrue(TrailIllustrations.resolve(node("magnet", "Magnetismo", "fisica")) in setOf("magnet", "compass"))
        assertTrue(TrailIllustrations.resolve(node("plant", "Fotosíntesis")) in setOf("leaf", "sprout", "flower-2", "sun"))
        assertTrue(TrailIllustrations.resolve(node("triangle", "Triángulos", "matematica")) in setOf("triangle", "pentagon", "ruler", "square"))
    }
    @Test fun unknownSubjectsUseGenericFamily() {
        assertTrue(TrailIllustrations.resolve(node("other", "Introducción", "nuevo")) in
            setOf("puzzle", "target", "graduation-cap", "lightbulb", "book-check", "compass", "globe", "route"))
    }
    @Test fun actualReproductionRouteUsesRelevantExistingSymbols() {
        val path = BiologiaCatalog.lessons.filter { it.semana == 10 }
        val allowed = listOf(setOf("circle-dot", "microscope"), setOf("bubbles", "circle-dot"),
            setOf("dna", "network"), setOf("circle-dot", "dna"))
        assertEquals(4, path.size)
        TrailIllustrations.resolvePath(path).forEachIndexed { i, icon ->
            assertTrue(icon in allowed[i], "${path[i].title}: $icon")
            println("${path[i].id} | ${path[i].title} | $icon")
        }
    }
    @Test fun generalBiologyDoesNotChooseAnUnrelatedOrganism() {
        for (title in listOf("Sistema Endocrino Humano", "Sistema Excretor y Fisiología Renal",
            "Tejidos Animales: Epitelial y Conectivo", "Objeto de Estudio y Ramas de la Biología", "Subtema nuevo")) {
            assertTrue(TrailIllustrations.candidates(node("example", title)).none {
                it in setOf("fish", "bird", "rabbit", "turtle", "shell", "bug") }, title)
        }
    }
    @Test fun mainConceptWinsOverBroadTopicAndInvertebratesStayInvertebrates() {
        assertEquals(listOf("circle-dot", "dna"), TrailIllustrations.candidates(
            node("human", "Gametogénesis y Ciclo Menstrual Humano").copy(subtema = "Reino Animal")))
        assertEquals(listOf("bug", "shell"), TrailIllustrations.candidates(node("invertebrate", "Invertebrados")))
    }
}
