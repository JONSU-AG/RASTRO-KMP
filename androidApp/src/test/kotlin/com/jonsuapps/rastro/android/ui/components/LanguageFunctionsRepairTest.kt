package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class LanguageFunctionsRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana01/1.3")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun lessonIdentityAndLocalValidationRemainStable()=runBlocking {
        val l=loader().loadLesson("lenguaje",1,"1.3").lesson
        assertEquals("leng_t01_s03",l.id)
        assertEquals(listOf(2,2,3,2,2,1,0,1,2,0,1,2),l.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(l))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(report.printSummary(),0,report.warningCount)
        l.challenges.forEachIndexed{i,q ->
            assertEquals("leng_t01_s03_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
            for(p in listOf("Criterio:","Aplicación:","Respuesta:")) assertTrue(q.id,q.explanation.contains(p))
        }
    }
    @Test fun questionsGiveContextInsteadOfTeachingFalseRules()=runBlocking {
        val q=loader().loadLesson("lenguaje",1,"1.3").lesson.challenges
        assertTrue(q[1].statement.contains("informe ficticio"))
        assertTrue(q[1].explanation.contains("no certifica"))
        assertTrue(q[4].statement.contains("repetición de sonidos"))
        assertTrue(q[5].explanation.contains("existen usos sin él"))
        assertFalse(q[5].statement.contains("exigen obligatoriamente"))
        assertTrue(q[10].statement.contains("posición teórica"))
        assertTrue(q[10].explanation.contains("ni vuelve innecesaria la experiencia"))
    }
    @Test fun theoryKeepsDistinctModelsAndJustifiedInterpretations() {
        val t=File(root,"theory.md").readText()
        assertTrue(t.length>=8000)
        assertEquals(1,prepareAcademicTheory(t).diagrams.size)
        for(p in listOf("No son tres objetos separados","No significa necesariamente belleza agradable","Las funciones pueden coexistir","Orientación informativa no equivale a verdad comprobada","Chomsky","no convierte automáticamente","| Autor |","| Función |","| Concepto |")) assertTrue(p,t.contains(p))
        for(p in listOf("hacking de examen","emoción cruda","casi todos los exámenes","referencial excluyente","inmutable en su base biológica")) assertFalse(p,t.contains(p))
        val m=File(root,"lesson.json").readText()
        assertFalse(m.contains("tres funciones de Jakobson"))
        assertFalse(m.contains("emoción cruda"))
    }
    @Test fun productionAndAllFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana01/1.3")
        for(n in listOf("questions.json","theory.md","lesson.json")) assertArrayEquals(n,File(root,n).readBytes(),File(f,n).readBytes())
    }
}
