package com.jonsuapps.rastro.android.ui.components

import org.junit.Assert.*
import org.junit.Test

class AcademicPresentationStyleTest {
    @Test fun allImportantSectionsMergeWithoutLosingNotesOrDecorationsLeakingIntoTitles() {
        val input=listOf(AcademicSection(1,"Introducción",bodyText="Texto principal"),
            AcademicSection(2,"🔥 Clave fija de admisión",leadText="Nota primera",definitions=listOf("Definición")),
            AcademicSection(3,"Importante",bodyText="Nota segunda"))
        val result=consolidateAcademicImportant(input,listOf("Nota adicional"))
        assertEquals(1,result.count {AcademicPresentationText.isImportant(it.title)})
        assertEquals(input.first(),result.first())
        val note=result.last()
        assertEquals("Importante",note.title)
        assertTrue(note.leadText.contains("Nota primera"));assertTrue(note.bodyText.contains("Nota segunda"))
        assertTrue(note.definitions.containsAll(listOf("Definición","Nota adicional")))
        assertEquals("Importante",AcademicPresentationText.clean("Clave fija"))
    }
    @Test fun theoryHasColoredEmphasisWithoutChangingQuestionPresentation() {
        val source = "**Masa** y *volumen*; <u>densidad</u>."
        val theory = renderFormattedInlineText(source, theoryStyle = true)
        val question = renderFormattedInlineText(source)
        assertEquals("Masa y volumen; densidad.", theory.text)
        assertEquals(theory.text, question.text)
        assertTrue(theory.spanStyles.any { it.item.color == academicInk(false).concept })
        assertTrue(theory.spanStyles.any { it.item.color == academicInk(false).secondary })
        assertTrue(theory.spanStyles.any { it.item.textDecoration == androidx.compose.ui.text.style.TextDecoration.Underline })
        assertTrue(question.spanStyles.all { it.item.color == androidx.compose.ui.graphics.Color.Unspecified })
    }
    @Test fun definitionEmphasisPreservesTextAndDoesNotGuessWordsInProse() {
        assertEquals("**Masa:** Cantidad de materia", academicTheoryMarkup("Masa: Cantidad de materia"))
        assertEquals("La masa es una magnitud.", academicTheoryMarkup("La masa es una magnitud."))
        assertEquals("https://example.com", academicTheoryMarkup("https://example.com"))
        assertEquals("**Masa:** Cantidad de materia", academicTheoryMarkup("**Masa:** Cantidad de materia"))
    }
    @Test fun admissionLabelsBecomeImportantWithoutLosingExplanation() {
        listOf("🔥 Clave fija de admisión", "Fija UNSA", "Dato Clave UNSA", "Consejo de Examen").forEach {
            assertEquals("Importante", AcademicPresentationText.clean(it))
        }
        assertEquals("Importante: Conserva las unidades", AcademicPresentationText.clean("Fija de examen: Conserva las unidades"))
        assertTrue(AcademicPresentationText.isImportant("2. Fija de examen"))
        assertEquals("La UNSA es una universidad pública.", AcademicPresentationText.clean("La UNSA es una universidad pública."))
    }
    @Test fun preservesScientificSymbolsWhileRemovingDecorativeEmoji() {
        assertEquals("α + β → F = ma; ♀ y ♂; m²", AcademicPresentationText.clean("🧠 α + β → F = ma; ♀ y ♂; m² ✨"))
    }
    @Test fun convertsOnlyCompleteHomogeneousDefinitionLists() {
        val entries = listOf("Masa: Cantidad de materia", "Volumen: Espacio ocupado", "Densidad: Masa por volumen")
        val table = academicDefinitionTable(entries)!!
        assertEquals(listOf("Concepto", "Descripción"), table.headers)
        assertEquals(listOf("Densidad", "Masa por volumen"), table.rows.last())
        assertNull(academicDefinitionTable(entries + "Un párrafo sin definición"))
        assertNull(academicDefinitionTable(listOf(entries[0], entries[0], entries[1])))
        assertNull(academicDefinitionTable(entries.take(2)))
    }
}
