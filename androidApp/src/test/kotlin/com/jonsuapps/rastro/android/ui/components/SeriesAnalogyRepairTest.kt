package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class SeriesAnalogyRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files")
    private fun loader()=JsonContentLoader(readBytesOverride={File(root,it.removePrefix("files/")).readBytes()})
    @Test fun thirtyRepairedQuestionsKeepIdsKeysAndLoadWithoutNewCatalogIssues()=runBlocking {
        val keys=mapOf("2.1" to listOf(1,0,2,3,2,0,0,3,3,1),"2.2" to listOf(2,3,2,1,1,3,0,2,0,1),"3.1" to listOf(3,0,2,1,2,0,0,2,0,1))
        for((level,expected) in keys) {
            val week=level.substringBefore('.').toInt();val part=level.substringAfter('.').toInt()
            val lesson=loader().loadLesson("raz_verbal",week,level).lesson
            assertEquals(expected,lesson.challenges.map {it.correctIndex})
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount)
            assertEquals(report.printSummary(),1,report.warningCount)
            assertTrue(report.reports.flatMap {it.issues}.all {it.code=="DEPTH_CHALLENGE_SHORTFALL"})
            lesson.challenges.forEachIndexed {index,q->
                assertEquals("rv_t%02d_s%02d_c%02d".format(week,part,index+1),q.id)
                assertEquals(4,q.options.distinct().size)
                assertTrue(q.explanation.contains("Relación:"));assertTrue(q.explanation.contains("Aplicación:"));assertTrue(q.explanation.contains("Respuesta:"))
                assertFalse(q.id,AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
            }
        }
    }
    @Test fun answerNamesTheConductInsteadOfUsingAnAdjectiveForThePerson()=runBlocking {
        val q=loader().loadLesson("raz_verbal",3,"3.1").lesson.challenges[8]
        assertEquals("Perfidia.",q.options[q.correctIndex])
        assertTrue(q.statement.contains("sustantivos"))
        assertTrue(q.explanation.contains("como adjetivo"))
    }
    @Test fun seriesDoNotConflateClassMembershipWithOrderOrEqualTaxonomicRanks()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",3,"3.1").lesson.challenges
        assertTrue(qs[3].statement.contains("por parejas"))
        assertFalse(qs[3].statement.contains("alterna:"))
        assertFalse(qs[4].statement.contains("cohiponimia"))
        assertTrue(qs[4].explanation.contains("familia de los delfines"))
        assertEquals("Furia.",qs[5].options[qs[5].correctIndex])
        assertTrue(qs[5].explanation.contains("no una escala psicológica"))
    }
    @Test fun analogySeparatesActionFromMagnitudeAndRestrictsCausalClaimsToTheCase()=runBlocking {
        val basics=loader().loadLesson("raz_verbal",2,"2.1").lesson.challenges
        val action=basics[2]
        assertEquals("Termómetro : Medir la temperatura.",action.options[action.correctIndex])
        assertTrue(action.statement.contains("expresada como acción"))
        assertTrue(basics[8].statement.contains("madera"))
        val applied=loader().loadLesson("raz_verbal",2,"2.2").lesson.challenges
        assertTrue(applied[3].statement.startsWith("En un caso de práctica"))
        assertTrue(applied[3].explanation.contains("no permite concluir"))
        assertTrue(applied[7].statement.contains("sin suponer que el anterior haya desaparecido"))
    }
    @Test fun ambiguousTeachingExamplesAreAcknowledgedInsteadOfForcingACanonicalKey() {
        for(part in listOf("2.1","2.2")) {
            val text=File(root,"aprender/raz_verbal/semana02/$part/theory.md").readText()
            assertFalse(text.contains("100% de efectividad"))
            assertFalse(text.contains("canon clásico de exámenes"))
            assertFalse(text.contains("pasa por un proceso idéntico"))
            assertTrue(text.contains("No se debe afirmar que todos los quesos"))
            assertTrue(text.contains("no tiene una respuesta única"))
            assertTrue(text.contains("varias parejas cumplen"))
            assertEquals(2,prepareAcademicTheory(text).diagrams.size)
        }
    }
    @Test fun productionAndFixturesMatchForEveryChangedFile() {
        val relatives=listOf("semana03/3.1/questions.json","semana02/2.1/questions.json","semana02/2.2/questions.json","semana02/2.1/theory.md","semana02/2.2/theory.md")
        relatives.forEach {rel->
            assertArrayEquals(rel,File(root,"aprender/raz_verbal/$rel").readBytes(),File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/$rel").readBytes())
        }
    }
}
