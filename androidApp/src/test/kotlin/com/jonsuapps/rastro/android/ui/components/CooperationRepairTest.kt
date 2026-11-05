package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class CooperationRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana06/6.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",6,"6.2").lesson
        assertEquals(listOf(3,1,3,3,2,0,3,2,3,2),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t06_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun questionsDistinguishInterpretationFromProofAndEffect()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",6,"6.2").lesson.challenges
        assertTrue(qs[0].explanation.contains("no afirma que todos cooperen siempre"))
        assertTrue(qs[6].statement.contains("Lo digo porque llegaste muy tarde"))
        assertTrue(qs[6].explanation.contains("No todo incumplimiento"))
        assertTrue(qs[7].explanation.contains("también con pertinencia"))
        assertTrue(qs[7].explanation.contains("no establece incapacidad"))
        assertTrue(qs[8].explanation.contains("no demuestra una intención de engañar"))
        assertTrue(qs[9].statement.contains("decide no cerrarla"))
        assertTrue(qs[9].explanation.contains("no permite afirmar que no hubiera ningún otro efecto"))
    }
    @Test fun theoryCoversMaximsWithoutMedicalOrAutomaticRules() {
        val t=File(root,"theory.md").readText()
        for(topic in listOf("Cantidad: información suficiente","Cualidad: no afirmar más","Relación: atender al asunto","Modo: claridad","Información omitida e implicatura","Enunciado, acción comunicativa y efecto")) assertTrue(topic,t.contains(topic))
        for(old in listOf("rigidez cadavérica","miocardio","confrontación militar","orden perlocutiva","180°","afasia","demencia")) assertFalse(old,t.contains(old,ignoreCase=true))
        assertTrue(t.contains("no demuestra incapacidad"))
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana06/6.2")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
