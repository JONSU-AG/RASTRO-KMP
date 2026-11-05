package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class AcademicBlock02Test {
    private val root=File("../shared/src/commonMain/composeResources/files")
    private fun loader()=JsonContentLoader(readBytesOverride={path -> File(root,path.removePrefix("files/")).readBytes()})
    @Test fun algebraLevelsLoadWithoutGenericQuestionsOrValidationWarnings() = runBlocking {
        for(topic in listOf("1.1","1.2")) {
            val lesson=loader().loadLesson("algebra",1,topic).lesson
            assertEquals(11,lesson.challenges.size)
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount)
            assertEquals(report.printSummary(),0,report.warningCount)
            lesson.challenges.forEach { q ->
                assertFalse(q.statement.contains("marco conceptual desarrollado"))
                assertTrue(resolutionSegments(q.explanation).size>=3)
                assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Álgebra",q.statement))
            }
        }
    }
    @Test fun setDiagramsUseRealMembershipAndRespectBooleanIdentities() {
        val a=setOf(1,2,3);val b=setOf(3,4)
        assertEquals(setOf(1,2,3,4),setOperationResult(a,b,IllustratedSetOperation.UNION))
        assertEquals(setOf(3),setOperationResult(a,b,IllustratedSetOperation.INTERSECTION))
        assertEquals(setOf(1,2),setOperationResult(a,b,IllustratedSetOperation.DIFFERENCE))
        assertEquals(setOf(1,2,4),setOperationResult(a,b,IllustratedSetOperation.SYMMETRIC))
        val universe=(1..4).toSet()
        val sets=(0 until 16).map {mask -> universe.filter { mask and (1 shl (it-1)) != 0 }.toSet()}
        for(x in sets)for(y in sets) {
            assertEquals(x,x union (x intersect y))
            assertEquals(x union y,x union ((universe-x) intersect y))
            assertEquals((universe-x) intersect (universe-y),universe-(x union y))
        }
    }
    @Test fun reviewedReasoningAlternativesAreDistinctWithCompleteStatements() = runBlocking {
        var checked=0
        for((subject,maxWeek) in listOf("raz_logico" to 5,"raz_matematico" to 7)) {
            for(week in 1..maxWeek) {
                val lesson=loader().loadLesson(subject,week,"$week.2").lesson
                for(suffix in listOf("c03","c04")) {
                    val q=lesson.challenges.single {it.id.endsWith(suffix)}
                    assertEquals(q.id,4,q.options.distinct().size)
                    assertEquals(q.id,4,q.options.size)
                    assertTrue(q.id,q.correctIndex in q.options.indices)
                    assertTrue(q.id,resolutionSegments(q.explanation).size>=3)
                    assertFalse(q.id,q.options.any {it.contains("Valor o condición no aplicable")})
                    checked++
                }
            }
        }
        assertEquals(24,checked)
    }
    @Test fun independentCardinalityAndProbabilityCalculations() {
        val universe=(1..50).toSet()
        val tea=(1..30).toSet()
        val coffee=(18..45).toSet()
        assertEquals(13,(tea intersect coffee).size)
        assertEquals(45,(tea union coffee).size)
        assertEquals(5,(universe-(tea union coffee)).size)
        val outcomes=(0..7).count {it!=0}
        assertEquals(7.0/8,outcomes/8.0,0.0)
        val regions=listOf(13,12,10,3,2,1,2)
        assertEquals(43,regions.sum())
        assertEquals(43,20+18+15-5-4-3+2)
    }
}
