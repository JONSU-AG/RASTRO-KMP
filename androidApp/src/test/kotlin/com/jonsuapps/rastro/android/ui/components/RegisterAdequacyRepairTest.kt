package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class RegisterAdequacyRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana08/8.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",8,"8.1").lesson
        assertEquals(listOf(1,2,2,1,0,2,3,0,3,1),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t08_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun questionsUseSpecificGoalsInsteadOfPrestigeOrLegalAssumptions()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",8,"8.1").lesson.challenges
        assertTrue(qs[2].statement.contains("veinte personas"))
        assertTrue(qs[4].explanation.contains("no establece una escala de valor"))
        assertTrue(qs[5].explanation.contains("no implica una manera de hablar fija"))
        assertTrue(qs[6].explanation.contains("ni garantiza que la convalidación sea aprobada"))
        assertTrue(qs[8].explanation.contains("jurídicamente inválido"))
        assertTrue(qs[9].explanation.contains("guía de revisión"))
    }
    @Test fun theoryRemovesUnsupportedIdentityAndForensicRules() {
        val t=File(root,"theory.md").readText()
        for(old in listOf("cronometría biológica del hemostato","microdiscectomía","estrato o la región:","premia el examen","exige de forma innegociable","es el vocablo exacto")) assertFalse(old,t.contains(old))
        assertTrue(t.contains("relojes están sincronizados"))
        assertTrue(t.contains("no decidir cuál es falso"))
        assertTrue(t.contains("no acredita una titulación"))
        assertEquals(2,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.contains("**Procedimiento:** consulta el mapa"))
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana08/8.1")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
