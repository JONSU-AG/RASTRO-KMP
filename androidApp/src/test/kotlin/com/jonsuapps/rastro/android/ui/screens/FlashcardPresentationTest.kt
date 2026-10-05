package com.jonsuapps.rastro.android.ui.screens

import org.junit.Assert.*
import org.junit.Test

class FlashcardPresentationTest {
    @Test fun separatesExistingFoundationWithoutChangingAcademicText() {
        val explanation = "El término Biología proviene del griego:\nbíos = vida; lógos = estudio racional."
        val parts = flashcardAnswerParts("El estudio racional de los fenómenos vitales\n\n📌 Fundamento:\n$explanation")
        assertEquals("El estudio racional de los fenómenos vitales", parts.answer)
        assertEquals("Fundamento", parts.heading)
        assertEquals(explanation, parts.explanation)
    }
    @Test fun plainAnswerIsNotInventedOrShortened() {
        val text = "Una respuesta larga.\nUn fundamento en medio de una oración no es un encabezado."
        assertEquals(FlashcardAnswerParts(text, null, null), flashcardAnswerParts(text))
    }
    @Test fun supportsExistingExplanationHeadingAndPreservesFormula() {
        val parts = flashcardAnswerParts("42\nExplicación: E = mc²\nΣ = suma")
        assertEquals("42", parts.answer)
        assertEquals("E = mc²\nΣ = suma", parts.explanation)
    }
}
