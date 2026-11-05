package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class CommunicationTypesRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana01/1.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("lenguaje",1,"1.2").lesson
        assertEquals("leng_t01_s02",lesson.id)
        assertEquals(listOf(3,0,3,1,0,0,1,3,1,3),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed{i,q ->
            assertEquals("leng_t01_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
            for(part in listOf("Criterio:","Aplicación:","Respuesta:")) assertTrue(q.id,q.explanation.contains(part))
        }
    }
    @Test fun brailleAnswerAndInteractionScopeAreExplicit()=runBlocking {
        val qs=loader().loadLesson("lenguaje",1,"1.2").lesson.challenges
        assertTrue(qs[4].statement.contains("oración en español"))
        assertEquals("Comunicación lingüística escrita con lectura táctil",qs[4].options[qs[4].correctIndex])
        assertTrue(qs[2].statement.contains("solo el intercambio entre ellos"))
        assertTrue(qs[5].explanation.contains("no demuestra que toda conducta animal"))
        assertTrue(qs[7].explanation.contains("las lenguas de señas son lenguas"))
        assertTrue(qs[9].statement.contains("solo ese tramo"))
        assertTrue(qs[9].explanation.contains("no significa ausencia de actividad mental"))
    }
    @Test fun theorySeparatesLanguageModalityTimeAndAudience() {
        val t=File(root,"theory.md").readText()
        assertTrue(t.length>=8000)
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        for(s in listOf("El **braille es un sistema de lectoescritura**","Las **lenguas de señas son lenguas**","La demora no equivale a ausencia de retorno","No necesita alcanzar millones","no garantiza confidencialidad","| Caso delimitado |","| Caso |")) assertTrue(s,t.contains(s))
        for(s in listOf("sin idioma ni cultura","No hay idioma ni reflexión","terror sacerdotal","CLAVE DE ADMISIÓN","Braille es comunicación humana no lingüística")) assertFalse(s,t.contains(s))
        val m=File(root,"lesson.json").readText()
        assertFalse(m.contains("no verbal = sirena, semáforo, guiño, braille"))
        assertFalse(m.contains("señales instintivas animales"))
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana01/1.2")
        for(n in listOf("questions.json","theory.md","lesson.json")) assertArrayEquals(n,File(root,n).readBytes(),File(f,n).readBytes())
    }
}
