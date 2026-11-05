package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ContextualWordsRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana01/1.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val lesson=loader().loadLesson("raz_verbal",1,"1.1").lesson
        assertEquals(listOf(0,3,2,3,3,3,3,1,0,2),lesson.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        lesson.challenges.forEachIndexed {i,q ->
            assertEquals("rv_t01_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
        }
    }
    @Test fun replacementsPreserveContextInsteadOfLooseAssociations()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",1,"1.1").lesson.challenges
        assertEquals("Atrevida.",qs[1].options[qs[1].correctIndex])
        assertTrue(qs[1].explanation.contains("novedosa no es necesariamente audaz"))
        assertEquals("Alterado.",qs[3].options[qs[3].correctIndex])
        assertEquals("Inequívocas.",qs[5].options[qs[5].correctIndex])
        assertTrue(qs[5].explanation.contains("categórico no demuestra por sí solo"))
        assertEquals("Falso.",qs[6].options[qs[6].correctIndex])
        assertTrue(qs[6].explanation.contains("No se presupone"))
        assertTrue(qs[9].explanation.contains("al menos una opción defendible"))
    }
    @Test fun theoryRetainsRelationsAndRemovesUnsupportedRules() {
        val t=File(root,"theory.md").readText()
        for(topic in listOf("Audaz no equivale simplemente a nuevo","Falso, espurio y adulterado","Inclusión y parte de un objeto","Precisión sin prohibir palabras frecuentes")) assertTrue(topic,t.contains(topic))
        for(old in listOf("afligirse de","/o-z/","100% de los contextos","grave / aguda","litigios millonarios")) assertFalse(old,t.contains(old,ignoreCase=true))
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        val table=extractAcademicTables(t.lines()).second.single{it.headers.first()=="Relación"}
        assertEquals(4,table.rows.size)
        assertTrue(t.length>8000)
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana01/1.1")
        for(n in listOf("questions.json","theory.md")) assertArrayEquals(File(root,n).readBytes(),File(f,n).readBytes())
    }
}
