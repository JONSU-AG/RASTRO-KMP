package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ConcordanceRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana07/7.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationArePreserved()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",7,"7.2").lesson
        assertEquals(listOf(1,0,2,0,2,0,1,3,2,2),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t07_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun questionsDistinguishExistentialAuxiliaryAndAcceptedVariation()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",7,"7.2").lesson.challenges
        assertTrue(qs[1].options.contains("Los asistentes habían llegado temprano."))
        assertTrue(qs[1].explanation.contains("No debe cambiarse"))
        assertTrue(qs[2].explanation.contains("Ambas formas son admisibles"))
        assertTrue(qs[4].explanation.contains("no significa que todo nombre plural"))
        assertTrue(qs[5].statement.contains("pronombre personal"))
        assertTrue(qs[9].statement.contains("dos objetos distintos"))
        assertEquals("están",qs[9].options[qs[9].correctIndex])
    }
    @Test fun theoryNowCoversAllTheExaminedConstructions() {
        val t=File(root,"theory.md").readText()
        for (topic in listOf("Haber de existencia y haber auxiliar","habían llegado","La mayoría de los participantes","Se entrevistó a las postulantes","Me di cuenta de eso","variación regional")) assertTrue(topic,t.contains(topic))
        assertFalse(t.contains("incorrección vulgar"))
        assertFalse(t.contains("no pudo aprobarse por unanimidad"))
        assertFalse(t.contains("\\begin{array}"))
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAreEquivalent() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana07/7.2")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
