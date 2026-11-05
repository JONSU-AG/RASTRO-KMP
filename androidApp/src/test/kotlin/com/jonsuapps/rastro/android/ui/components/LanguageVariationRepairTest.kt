package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class LanguageVariationRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana02/2.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityAndLocalValidationArePreserved()=runBlocking {
        val l=loader().loadLesson("lenguaje",2,"2.1").lesson
        assertEquals("leng_t02_s01",l.id)
        assertEquals(listOf(3,0,0,2,2,1,2,1,0,2),l.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(l))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        l.challenges.forEachIndexed{i,q ->
            assertEquals("leng_t02_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
            for(p in listOf("Criterio:","Aplicación:","Respuesta:")) assertTrue(q.id,q.explanation.contains(p))
        }
    }
    @Test fun questionsDoNotInferPersonalIdentityFromIsolatedWords()=runBlocking {
        val q=loader().loadLesson("lenguaje",2,"2.1").lesson.challenges
        assertTrue(q[3].options[q[3].correctIndex].contains("norma de referencia"))
        assertTrue(q[7].options[q[7].correctIndex].contains("Diafásica"))
        assertTrue(q[7].explanation.contains("No equivale a idiolecto"))
        assertTrue(q[8].options[q[8].correctIndex].contains("no prueba"))
        assertTrue(q[9].statement.contains("Sin afirmar una distribución regional"))
        assertTrue(q[4].statement.contains("Sin atribuirlas a una región"))
    }
    @Test fun theoryHasMapTablesAndPreservesTheExistingComplement() {
        val t=File(root,"theory.md").readText()
        assertTrue(t.length>=8000)
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        for(p in listOf("No es sinónimo de registro diafásico","Una palabra aislada no permite deducir","## Variedad situacional y origen latino del español","| Plano |","| Factor destacado |","| Distinción |")) assertTrue(p,t.contains(p))
        for(p in listOf("IDIO-FASE","pobreza léxica","replana es siempre subestándar","la geografía manda","Idiolecto = variación diafásica")) assertFalse(p,t.contains(p))
        assertFalse(File(root,"lesson.json").readText().contains("Idiolecto = variación diafásica"))
    }
    @Test fun threeFilesMatchPackagedFixtures() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana02/2.1")
        for(n in listOf("questions.json","theory.md","lesson.json")) assertArrayEquals(n,File(root,n).readBytes(),File(f,n).readBytes())
    }
}
