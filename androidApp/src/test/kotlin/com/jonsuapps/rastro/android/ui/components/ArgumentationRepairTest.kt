package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class ArgumentationRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/raz_verbal/semana05")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun twentyQuestionsKeepTheirIdsAndKeysWithNoNewValidationIssue()=runBlocking {
        val keys=mapOf("5.1" to listOf(3,2,0,1,1,3,0,0,0,2),"5.2" to listOf(2,2,1,3,3,0,3,1,1,2))
        for((level,expected) in keys) {
            val lesson=loader().loadLesson("raz_verbal",5,level).lesson
            assertEquals(expected,lesson.challenges.map {it.correctIndex})
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount)
            assertEquals(report.printSummary(),1,report.warningCount)
            assertTrue(report.reports.flatMap {it.issues}.all {it.code=="DEPTH_CHALLENGE_SHORTFALL"})
            lesson.challenges.forEachIndexed {index,q->
                assertEquals("rv_t05_s%02d_c%02d".format(level.substringAfter('.').toInt(),index+1),q.id)
                assertEquals(4,q.options.distinct().size)
                assertTrue(q.explanation.contains("Criterio:"));assertTrue(q.explanation.contains("Aplicación:"));assertTrue(q.explanation.contains("Respuesta:"))
                assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Razonamiento Verbal",q.statement))
            }
        }
    }
    @Test fun madeUpStudiesAndPercentagesAreNotPresentedAsWorldFacts() {
        for(level in listOf("5.1","5.2")) {
            val text=File(root,"$level/theory.md").readText()+File(root,"$level/questions.json").readText()
            for(old in listOf("INGEMMET","arándanos","polifenoles","70 %","40 %","90%","inferior al 2%","ensayos clínicos controlados","diversos estudios neurobiológicos"))assertFalse(old,text.contains(old,ignoreCase=true))
            assertTrue(text.contains("ficticios",ignoreCase=true))
        }
    }
    @Test fun hypotheticalReinforcementAndWeakeningRemainConditional()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",5,"5.2").lesson.challenges
        assertTrue(qs[2].statement.startsWith("Caso ficticio"))
        assertTrue(qs[2].explanation.contains("No demuestra que las cámaras"))
        assertTrue(qs[3].statement.contains("dato hipotético"))
        assertTrue(qs[3].explanation.contains("no un estudio real de RASTRO"))
        assertTrue(qs[4].explanation.contains("No descarta automáticamente"))
        assertTrue(qs[6].statement.contains("dato hipotético"))
        assertTrue(qs[8].explanation.contains("No prueba que toda enseñanza virtual sea peor"))
    }
    @Test fun thesisIsQuotedFromItsPassageAndImplicitPremiseIsNotTheWholeArgument()=runBlocking {
        val qs=loader().loadLesson("raz_verbal",5,"5.1").lesson.challenges
        assertEquals("Se debe ampliar el horario de préstamo de la biblioteca.",qs[3].options[qs[3].correctIndex])
        assertTrue(qs[3].statement.contains("propongo ampliar el horario de préstamo"))
        assertTrue(qs[9].statement.contains("La reserva de Ana está confirmada"))
        assertTrue(qs[9].explanation.contains("el entimema es el razonamiento abreviado"))
        assertFalse(qs[9].statement.contains("Premisa Implícita' o entimema"))
    }
    @Test fun universalCounterexampleDoesNotReverseTheUniversalConclusion()=runBlocking {
        val q=loader().loadLesson("raz_verbal",5,"5.2").lesson.challenges[7]
        assertTrue(q.statement.contains("esa misma laguna"))
        assertEquals("La afirmación universal sobre esa laguna hoy es falsa.",q.options[q.correctIndex])
        assertTrue(q.explanation.contains("No permite concluir que todos sean negros"))
    }
    @Test fun developedTheoryKeepsMapsAndEquivalentFixtures() {
        val fixture=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/raz_verbal/semana05")
        for(level in listOf("5.1","5.2")) {
            for(name in listOf("questions.json","theory.md")) assertArrayEquals(File(root,"$level/$name").readBytes(),File(fixture,"$level/$name").readBytes())
            val text=File(root,"$level/theory.md").readText()
            assertTrue(text.length>8000)
            assertEquals(2,prepareAcademicTheory(text).diagrams.size)
            assertTrue(text.contains("Importante"))
        }
    }
}
