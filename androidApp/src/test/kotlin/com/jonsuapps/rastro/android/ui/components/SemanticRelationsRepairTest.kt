package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class SemanticRelationsRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana01/1.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",1,"1.2").lesson
        assertEquals(listOf(1,0,0,0,1,2,2,2,1,1),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t01_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun questionsStatePronunciationAndComparisonScope()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",1,"1.2").lesson.challenges
        assertTrue(qs[2].statement.contains("pronunciación yeísta"))
        assertTrue(qs[2].explanation.contains("hablantes que distinguen"))
        assertTrue(qs[3].statement.contains("hoz"))
        assertFalse(qs[3].statement.contains("Gato"))
        assertTrue(qs[6].explanation.contains("No se afirma que paloma nombre una única especie"))
        assertTrue(qs[8].statement.contains("exactamente uno de dos estados"))
        assertTrue(qs[9].explanation.contains("merónimo de bicicleta"))
    }
    @Test fun theoryAvoidsInventedOriginsAndKeepsRelationshipsDistinct() {
        val t=File(root,"theory.md").readText()
        for(topic in listOf("Comprobar el ejemplo de gato","Homofonía y variedad de pronunciación","Paronimia: semejanza","Meronimia y holonimia")) assertTrue(topic,t.contains(topic))
        assertTrue(t.contains("No es correcto atribuirles orígenes distintos"))
        assertTrue(t.contains("también deben cubrir los casos"))
        for(old in listOf("/o-z/","forma cóncava y remate superior","grave / aguda","etimologías completamente disjuntas","afligirse de")) assertFalse(old,t.contains(old,ignoreCase=true))
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana01/1.2")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
