package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class CompletionOrderRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana04/4.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",4,"4.2").lesson
        assertEquals(listOf(2,2,3,1,0,3,1,2,2,1),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t04_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun questionsUseExplicitCluesAndPreserveLimits()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",4,"4.2").lesson.challenges
        assertTrue(qs[2].statement.contains("mayor habilidad"))
        assertTrue(qs[4].explanation.contains("No garantiza"))
        assertTrue(qs[5].statement.contains("mejor distribución posible"))
        assertTrue(qs[6].statement.contains("reconoció"))
        assertTrue(qs[6].explanation.contains("mirada aislada"))
        assertTrue(qs[7].statement.contains("no la demuestran de manera definitiva"))
        assertTrue(qs[7].explanation.contains("no verifica por sí sola"))
        assertTrue(qs[9].explanation.contains("se revisa la consigna"))
    }
    @Test fun theoryTeachesOrderingWithoutUniversalShortcuts() {
        val t=File(root,"theory.md").readText()
        for(topic in listOf("Anterioridad no significa contigüidad","II — III — I","no convierte A — C en un bloque inseparable","No se prohíbe todo demostrativo","Emociones declaradas")) assertTrue(topic,t.contains(topic))
        for(old in listOf("contradicciones prueban","metilación de citocinas","resistencia sismorresistente","menos de 10 segundos","jerarquía epistemológica universal")) assertFalse(old,t.contains(old))
        assertEquals(2,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana04/4.2")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
