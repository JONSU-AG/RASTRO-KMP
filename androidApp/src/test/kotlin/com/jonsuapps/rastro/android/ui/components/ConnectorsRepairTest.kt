package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ConnectorsRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana04/4.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",4,"4.1").lesson
        assertEquals(listOf(3,0,3,2,1,0,0,0,3,1),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t04_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun questionsConstrainRelationsAndDoNotTreatConnectorsAsProof()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",4,"4.1").lesson.challenges
        assertTrue(qs[1].statement.contains("enlace de contraste"))
        assertTrue(qs[2].statement.contains("primero una consecuencia y después su motivo"))
        assertTrue(qs[4].explanation.contains("no convierte una deducción injustificada",ignoreCase=true))
        assertTrue(qs[5].explanation.contains("Aunque"))
        assertTrue(qs[7].statement.contains("contrastar"))
        assertTrue(qs[8].explanation.contains("No toda información añadida"))
        assertTrue(qs[9].explanation.contains("no demuestra por sí sola"))
    }
    @Test fun theoryDistinguishesConditionConstructionAndPunctuation() {
        val t=File(root,"theory.md").readText()
        for(topic in listOf("Condición: distinguir si y solo si","presentarlo baste","Sino, sino que y si no","No está obligado a llevar siempre un punto y coma","No es obligatorio definir siempre")) assertTrue(topic,t.contains(topic))
        for(old in listOf("jerarquía epistemológica universal","rechazado de inmediato","metilación de citocinas","resistencia sismorresistente","HACKING PREUNIVERSITARIO")) assertFalse(old,t.contains(old))
        assertEquals(2,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.contains("**Procedimiento:** consulta el mapa"))
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana04/4.1")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
