package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.ui.components.scientificNotation
import com.jonsuapps.rastro.android.ui.screens.subjectStickerDrawable
import androidx.compose.ui.text.style.BaselineShift
import org.junit.Assert.*
import org.junit.Test

class StudyPresentationTest {
    @Test fun subscriptsKeepVariablesOperatorsAndUnits() {
        val shown = scientificNotation("a = (v_f - v_0) / t; ρ_liq · g · h")
        assertEquals("a = (vf - v0) / t; ρliq · g · h", shown.text)
        assertEquals(listOf("f", "0", "liq"), shown.spanStyles.map { shown.text.substring(it.start, it.end) })
        assertTrue(shown.spanStyles.all { it.item.baselineShift == BaselineShift.Subscript })
    }

    @Test fun chemicalAndTrigonometricNotationStaysIntact() {
        for (expression in listOf("6 CO₂ + 6 H₂O + luz → C₆H₁₂O₆ + 6 O₂", "sin²θ + cos²θ = 1", "-b ± √(b² - 4ac)")) {
            assertEquals(expression, scientificNotation(expression).text)
        }
    }

    @Test fun eachCurrentSubjectHasDistinctBannerArt() {
        val subjects = com.jonsuapps.rastro.data.AprenderRepository.subjects.map { it.id }
        assertEquals(subjects.size, subjects.map(::subjectStickerDrawable).distinct().size)
    }
}
