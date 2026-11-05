package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class CommunicationRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana01/1.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})

    @Test fun identityAndQuestionCoverageRemainStable()=runBlocking {
        val lesson=loader().loadLesson("lenguaje",1,"1.1").lesson
        assertEquals("leng_t01_s01",lesson.id)
        assertEquals(listOf(0,3,0,1,1,3,0,2,2,3),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("leng_t01_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
            for (part in listOf("Criterio:","Aplicación:","Respuesta:")) assertTrue(q.id,q.explanation.contains(part))
        }
    }

    @Test fun questionsSeparateTransmissionFromInterpretation()=runBlocking {
        val qs=loader().loadLesson("lenguaje",1,"1.1").lesson.challenges
        assertTrue(qs[1].statement.contains("soporte material escrito"))
        assertTrue(qs[4].explanation.contains("no una garantía absoluta"))
        assertTrue(qs[6].options[0].contains("contexto temporal"))
        assertTrue(qs[7].explanation.contains("no demuestra por sí sola"))
        assertTrue(qs[8].statement.contains("sin traducción, gestos"))
        assertTrue(qs[9].explanation.contains("ondas sonoras constituyen la señal"))
    }

    @Test fun theoryHasUsableMapTablesAndNoUnsupportedClaims() {
        val theory=File(root,"theory.md").readText()
        assertTrue(theory.length>=8000)
        assertEquals(1,prepareAcademicTheory(theory).diagrams.size)
        for (topic in listOf("| Fase |","| Concepto |","| Caso |","El ruido no tiene que ser involuntario","No demuestra por sí solo comprensión completa","no resuelve necesariamente toda duda","no implica que dos personas de distintas lenguas sean incapaces")) assertTrue(topic,theory.contains(topic))
        for (old in listOf("terror sacerdotal","más preguntado","más castigada","CLAVE DE ADMISIÓN","comprensión es nula")) assertFalse(old,theory.contains(old))
        val metadata=File(root,"lesson.json").readText()
        assertFalse(metadata.contains("ocho elementos"))
        assertFalse(metadata.contains("más castigada"))
    }

    @Test fun allLessonFilesMatchThePackagedFixtures() {
        val fixture=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana01/1.1")
        for (name in listOf("questions.json","theory.md","lesson.json")) assertArrayEquals(name,File(root,name).readBytes(),File(fixture,name).readBytes())
    }
}
