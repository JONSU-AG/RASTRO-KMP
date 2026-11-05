package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class AcademicContextRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files")
    private fun loader()=JsonContentLoader(readBytesOverride={File(root,it.removePrefix("files/")).readBytes()})
    @Test fun repairedLessonsLoadWithoutCriticalErrorsAndOnlyTheExistingQuestionCountWarning()=runBlocking {
        for((subject,week,part) in listOf(Triple("raz_verbal",3,"3.1"),Triple("raz_verbal",3,"3.2"),Triple("ingles",1,"1.1"),Triple("ingles",1,"1.2"))) {
            val lesson=loader().loadLesson(subject,week,part).lesson
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount)
            // Both RV lessons were already NORMAL with ten questions; preserve the bank size.
            assertEquals(report.printSummary(),if(subject=="raz_verbal")1 else 0,report.warningCount)
            assertTrue(report.printSummary(),report.reports.flatMap {it.issues}.all {it.code=="DEPTH_CHALLENGE_SHORTFALL"})
            lesson.challenges.forEach {assertFalse(it.id,AcademicSanitizer.hasUnrelatedStemContamination(subject,it.statement))}
        }
    }
    @Test fun excludedTermQuestionsKeepTheirIdsAndKeysAndShowTheCompleteGroup()=runBlocking {
        val questions=loader().loadLesson("raz_verbal",3,"3.2").lesson.challenges
        assertEquals(10,questions.size)
        assertEquals(listOf(1,3,1,2,0,3,3,3,2,1),questions.map {it.correctIndex})
        questions.forEachIndexed {index,q->
            assertEquals("rv_t03_s02_c%02d".format(index+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertTrue(q.id,q.explanation.contains("Criterio:"))
            assertTrue(q.id,q.explanation.contains("Aplicación:"))
            assertTrue(q.id,q.explanation.contains("Respuesta:"))
            if(index in 1..8) q.options.forEach {option->assertTrue("${q.id}: $option",q.statement.contains(option.removeSuffix("."),ignoreCase=true))}
        }
    }
    @Test fun classificationDistinguishesPartsTypesAndContextWithoutInventingAnObligatorySequence() {
        for(part in listOf("3.1","3.2")) {
            val text=File(root,"aprender/raz_verbal/semana03/$part/theory.md").readText()
            assertFalse(text.contains("Continuación obligatoria"))
            assertFalse(text.contains("automáticamente la clave"))
            assertFalse(text.contains("intensidad sonora estrictamente creciente"))
            assertFalse(text.contains("Boss Challenge"))
            assertTrue(text.contains("cohipónimos",ignoreCase=true) || text.contains("cohiponimia",ignoreCase=true))
            assertTrue(text.contains("criterio",ignoreCase=true))
            assertEquals(2,prepareAcademicTheory(text).diagrams.size)
        }
        val core=File(root,"aprender/raz_verbal/semana03/3.1/theory.md").readText()
        assertTrue(core.contains("varias palabras pueden servir"))
        assertTrue(core.contains("campo asociativo"))
        assertTrue(File(root,"aprender/raz_verbal/semana03/3.2/theory.md").readText().contains("no una lista de sinónimos"))
    }
    @Test fun grammarFrequencyIsContextualAndStativeGuidanceHasItsIntendedScope() {
        val core=File(root,"aprender/ingles/semana01/1.1/theory.md").readText()
        assertFalse(core.contains("usually 80%"));assertFalse(core.contains("sometimes 40%"))
        assertTrue(core.contains("No equivalen a porcentajes fijos"))
        assertTrue(core.contains("normalmente usan formas simples cuando expresan estados"))
        val applied=File(root,"aprender/ingles/semana01/1.2/theory.md").readText()
        assertTrue(applied.contains("I am thinking about the problem"))
        assertFalse(core.contains("## 2. FORMAL THEORETICAL FOUNDATIONS"))
    }
    @Test fun changedSourcesAndUnitTestFixturesAreEquivalent() {
        for(relative in listOf("raz_verbal/semana03/3.1/theory.md","raz_verbal/semana03/3.2/theory.md","raz_verbal/semana03/3.2/questions.json","ingles/semana01/1.1/theory.md","ingles/semana01/1.2/theory.md")) {
            assertArrayEquals(relative,File(root,"aprender/$relative").readBytes(),File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/$relative").readBytes())
        }
    }
}
