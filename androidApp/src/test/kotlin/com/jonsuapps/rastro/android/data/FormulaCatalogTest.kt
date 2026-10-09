package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.data.MnemotecniasRepository
import org.junit.Assert.*
import org.junit.Test

class FormulaCatalogTest {
    @Test fun extensionHasUniqueIdsAndRealMnemonicLinks() {
        val formulas = FormulasRepository.allFormulas
        assertEquals(32, formulas.size)
        assertEquals(formulas.size, formulas.map { it.id }.toSet().size)
        val mnemonics = MnemotecniasRepository.items
        assertEquals(mnemonics.size, mnemonics.map { it.id }.toSet().size)
        additionalFormulas.forEach { formula ->
            val links = FormulasRepository.mnemonicsFor(formula.id)
            assertTrue("Missing mnemonic: ${formula.id}", links.isNotEmpty())
            assertTrue(links.any { it.shortFormula == formula.mainExpression })
            assertTrue(formula.description.isNotBlank() && formula.datoClave.isNotBlank())
        }
        assertTrue(FormulasRepository.mnemonicsFor("bio_fotosintesis_global").isEmpty())
    }
}
