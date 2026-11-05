package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class TextualReasoningRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana08/8.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",8,"8.2").lesson
        assertEquals(listOf(3,2,0,1,1,0,3,3,0,2),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t08_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun questionsSupplyRulesTextsAndActualReferents()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",8,"8.2").lesson.challenges
        assertTrue(qs[0].statement.contains("que la regla se cumple"))
        assertTrue(qs[1].explanation.contains("no se debe",ignoreCase=true))
        assertTrue(qs[3].explanation.contains("no es una estructura obligatoria"))
        assertEquals("Al informe, mencionado antes.",qs[4].options[qs[4].correctIndex])
        assertTrue(qs[5].explanation.contains("anticipa"))
        assertEquals("Eligió.",qs[6].options[qs[6].correctIndex])
        assertTrue(qs[7].explanation.contains("no una oposición total"))
        assertTrue(qs[8].explanation.contains("no necesariamente una tesis"))
        assertTrue(qs[9].explanation.contains("no demuestra que el taller sea inútil"))
    }
    @Test fun theoryMatchesTheAssessedConceptsWithoutUniversalShortcuts() {
        val t=File(root,"theory.md").readText()
        for(topic in listOf("Consecuencia necesaria e interpretación plausible","Anáfora: referencia hacia atrás","Catáfora: información que se explicita después","Elipsis: recuperar sin inventar","Punto de discrepancia","Idea principal, tema y tesis","Generalización precipitada")) assertTrue(topic,t.contains(topic))
        for(old in listOf("cronometría biológica del hemostato","microdiscectomía","premia el examen","Identifica el estrato o la región:","HACK:","ordenamiento deductivo universal")) assertFalse(old,t.contains(old))
        assertEquals(2,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana08/8.2")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
