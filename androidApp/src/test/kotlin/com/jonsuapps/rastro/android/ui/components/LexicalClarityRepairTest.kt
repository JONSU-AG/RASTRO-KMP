package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class LexicalClarityRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana07/7.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",7,"7.1").lesson
        assertEquals(listOf(1,3,3,0,1,2,3,1,0,3),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t07_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertTrue(q.explanation.contains("Aplicación:"))
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun correctionsPreserveTheDescribedAction()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",7,"7.1").lesson.challenges
        assertTrue(qs[9].statement.contains("está escribiendo"))
        assertTrue(qs[9].statement.contains("aún no se ha aprobado"))
        assertEquals("Redactar una propuesta de ley.",qs[9].options[qs[9].correctIndex])
        assertTrue(qs[5].statement.contains("infligir"))
        assertTrue(qs[5].explanation.contains("infringió una norma"))
        assertTrue(qs[3].statement.contains("sin énfasis especial"))
        assertTrue(qs[2].explanation.contains("no se elimina solo"))
    }
    @Test fun theoryDoesNotTeachTheOldFalseRules() {
        val t=File(root,"theory.md").readText()
        assertTrue(t.contains("también puede referirse a mostrar o hacer patente"))
        assertTrue(t.contains("La unanimidad informa del voto"))
        assertTrue(t.contains("después explicó"))
        assertTrue(t.contains("estilísticamente desaconsejable"))
        for(old in listOf("no pudo aprobarse por unanimidad","inconsistencia de motivación judicial","abrigarse de dudas", "\\begin{array}","🔴","🟡","🟢","HACKING PREUNIVERSITARIO")) assertFalse(old,t.contains(old))
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.length>8000)
    }
    @Test fun fixturesExactlyMatchProduction() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana07/7.1")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
