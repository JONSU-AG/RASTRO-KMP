package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.LessonTheory
import org.junit.Assert.*
import org.junit.Test

class AcademicTableTest {
    @Test fun preservesHeadersRowsMathAndEscapedPipes() {
        val input = listOf("Antes", "| Magnitud | Dimensión |", "|:---|---:|", "| Fuerza | MLT^{-2} |", "| Módulo | \\|v\\| |", "Después")
        val (prose, tables) = extractAcademicTables(input)
        assertEquals(listOf("Antes", "Después"), prose)
        assertEquals(listOf("Magnitud", "Dimensión"), tables.single().headers)
        assertEquals(listOf("Fuerza", "MLT^{-2}"), tables.single().rows.first())
        assertEquals("|v|", tables.single().rows.last()[1])
    }
    @Test fun malformedRowsAreNotDroppedOrInvented() {
        val input = listOf("| A | B |", "|---|---|", "| Uno |")
        val (prose, tables) = extractAcademicTables(input)
        assertTrue(tables.isEmpty()); assertEquals(input, prose)
    }
    @Test fun unheadedTableStaysATableInTheory() {
        val theory = LessonTheory("table", "Física", 1, "Magnitudes", "| A | B |\n|---|---|\n| Uno | Dos |")
        val result = parseAcademicContent(theory)
        assertTrue(result.intro.isEmpty())
        assertEquals("Dos", result.sections.single().tables.single().rows.single()[1])
    }
}
