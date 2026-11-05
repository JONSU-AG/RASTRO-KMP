package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.LessonTheory
import java.io.File
import org.junit.Assert.*
import org.junit.Test

class AcademicCompanionPolicyTest {
    @Test fun organLessonsDoNotReceiveCellsOrUnrelatedScientificCompanions() {
        assertFalse(academicCompanionMatches(AcademicArtwork.CELL,"Corazón y vasos sanguíneos"))
        assertFalse(academicCompanionMatches(AcademicArtwork.CELL,"Intestino grueso y microbiota"))
        assertFalse(academicCompanionMatches(AcademicArtwork.FLASK,"Configuración electrónica"))
        assertTrue(academicCompanionMatches(AcademicArtwork.CELL,"Célula procariota y orgánulos"))
        assertTrue(academicCompanionMatches(AcademicArtwork.DNA,"Genética y cromosomas"))
    }
    @Test fun knownSubjectsNeverFallThroughToDnaAndCanonicalDrawingsRoundTrip() {
        val subjects = mapOf(
            "Álgebra" to AcademicArtwork.MATH, "aritmetica" to AcademicArtwork.MATH,
            "Geometría" to AcademicArtwork.TRIANGLE, "trigonometria" to AcademicArtwork.TRIANGLE,
            "Geografía" to AcademicArtwork.GLOBE, "Historia del Perú" to AcademicArtwork.SCROLL,
            "historia_universal" to AcademicArtwork.SCROLL, "civica" to AcademicArtwork.SCALES,
            "Literatura" to AcademicArtwork.LITERATURE, "Lenguaje" to AcademicArtwork.SPEECH,
            "comprension_lectora" to AcademicArtwork.SPEECH, "raz_verbal" to AcademicArtwork.SPEECH,
            "Inglés" to AcademicArtwork.SPEECH, "Psicología" to AcademicArtwork.BRAIN,
            "Filosofía" to AcademicArtwork.IDEA, "raz_logico" to AcademicArtwork.IDEA,
            "raz_matematico" to AcademicArtwork.IDEA, "Biología" to AcademicArtwork.CELL,
            "Química" to AcademicArtwork.FLASK, "Física" to AcademicArtwork.ATOM
        )
        subjects.forEach { (subject, expected) -> assertEquals(subject, expected, academicArtworkFor(subject, "Introducción")) }
        AcademicArtwork.entries.forEach { assertEquals(it, AcademicIllustrationsCatalog.resolveArtwork(it.key)) }
        assertEquals(AcademicArtwork.BOOKS, AcademicIllustrationsCatalog.resolveArtwork("sin correspondencia"))
        assertNull(academicArtworkFor("desconocida", "vida material"))
    }

    @Test fun subjectWinsOverMisleadingSubstringsAndDnaRequiresGenetics() {
        assertEquals(AcademicArtwork.GLOBE, academicArtworkFor("Geografía", "Fundamento de la vida material"))
        assertEquals(AcademicArtwork.PIN, academicArtworkFor("geografia", "Principio de localización"))
        assertEquals(AcademicArtwork.CELL, academicArtworkFor("biologia", "Introducción a la vida"))
        assertEquals(AcademicArtwork.DNA, academicArtworkFor("biologia", "Genética y cromosomas"))
        assertEquals(AcademicArtwork.PAW, academicArtworkFor("biologia", "Zoología: animales"))
        assertEquals(AcademicArtwork.PLANT, academicArtworkFor("biologia", "Fotosíntesis"))
        assertEquals(AcademicArtwork.SPEECH, academicArtworkFor("ingles", "Materiales de lectura y energía"))
        assertEquals(AcademicArtwork.SCROLL, academicArtworkFor("historia_peru", "Cultura y evolución del trabajo"))
    }

    @Test fun genericCardsHaveNoDrawingAndLessonBudgetIsStableAndDistinct() {
        val generic = """## Principios geográficos
            |- **Autor:** Federico Ratzel.
            |- **Fundamento:** Todo fenómeno se ubica en el espacio.
            |- **Autor:** Paul Vidal de la Blache.
        """.trimMargin()
        val parsed = parseAcademicContent(LessonTheory("geo", "Geografía", 1, "Principios", generic))
        assertTrue(parsed.sections.flatMap { it.branchCards }.all { it.artwork == null })
        val sections = (0..9).map { index ->
            AcademicSection(index, listOf("Clima", "Relieve", "Hidrografía", "Población", "Cartografía")[index % 5],
                branchCards = listOf(AcademicBranch("Características del tema", "Texto", emptyList(), "geografia"), AcademicBranch("Otra rama", "Más texto", emptyList(), "geografia")))
        }
        val selected = withAcademicCompanions(sections, "geografia")
        val drawings = selected.flatMap { it.branchCards }.mapNotNull { it.artwork }
        assertEquals(3, drawings.size)
        assertEquals(drawings.size, drawings.distinct().size)
        assertTrue(selected.all { s -> s.branchCards.count { it.artwork != null } <= 1 })
        assertEquals(selected, withAcademicCompanions(sections, "geografia"))
        assertEquals(sections.flatMap { it.branchCards }.map { it.subtitle }, selected.flatMap { it.branchCards }.map { it.subtitle })
    }

    @Test fun everyLoadedTheoryKeepsTextAndRespectsTheSameCompanionBudget() {
        val root = File("../shared/src/commonMain/composeResources/files/aprender")
        var lessons = 0
        root.walkTopDown().filter { it.name == "theory.md" }.forEach { file ->
            val subject = file.relativeTo(root).path.substringBefore(File.separator)
            val parsed = parseAcademicContent(LessonTheory(file.path, subject, 1, file.parentFile?.name.orEmpty(), file.readText()))
            val drawings = parsed.sections.flatMap { it.branchCards }.mapNotNull { it.artwork }
            assertTrue(file.path, drawings.size <= 3)
            assertEquals(file.path, drawings.size, drawings.distinct().size)
            assertTrue(parsed.sections.all { s -> s.branchCards.count { it.artwork != null } <= 1 })
            if (subject != "biologia") assertFalse(file.path, drawings.contains(AcademicArtwork.DNA))
            lessons++
        }
        assertTrue("The full theory catalog must be covered", lessons >= 418)
    }
}
