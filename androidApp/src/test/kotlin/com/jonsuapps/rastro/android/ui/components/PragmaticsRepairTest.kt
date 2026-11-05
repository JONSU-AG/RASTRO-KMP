package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class PragmaticsRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana06/6.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityAndLocalValidationArePreserved()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",6,"6.1").lesson
        assertEquals(listOf(1,2,1,0,1,0,2,0,0,1),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed { i,q ->
            assertEquals("rv_t06_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun contextualAnswersHaveEnoughCluesAndQualifiedExplanations()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",6,"6.1").lesson.challenges
        assertTrue(qs[4].statement.contains("no saldrá esa noche"))
        assertTrue(qs[4].explanation.contains("Sin la aclaración"))
        assertTrue(qs[7].statement.contains("comienza a despedirse"))
        assertTrue(qs[2].explanation.contains("no certifica hechos"))
        assertTrue(qs[5].explanation.contains("No he renunciado"))
        assertFalse(qs[6].explanation.contains("pobre pero honrado"))
    }
    @Test fun unsupportedForensicDeductionsAreRemoved() {
        val text=File(root,"theory.md").readText()
        for (old in listOf("rigidez cadavérica","miocardio","puñal artesanal","180°","confrontación militar","orden perlocutiva")) assertFalse(old,text.contains(old))
        assertTrue(text.contains("falló el proyector"))
        assertTrue(text.contains("Atribuir ese motivo sería inventar información"))
        assertEquals(1,Regex("(?m)^## 7. Importante$").findAll(text).count())
        assertEquals(1,prepareAcademicTheory(text).diagrams.size)
        assertTrue(text.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val fixture=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana06/6.1")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(fixture,n).readBytes())
    }
}
