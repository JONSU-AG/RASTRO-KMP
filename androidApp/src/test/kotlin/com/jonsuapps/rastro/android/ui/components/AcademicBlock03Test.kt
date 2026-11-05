package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import kotlin.math.*

class AcademicBlock03Test {
    private val root=File("../shared/src/commonMain/composeResources/files")
    private fun loader()=JsonContentLoader(readBytesOverride={path -> File(root,path.removePrefix("files/")).readBytes()})
    @Test fun sixReviewedLevelsLoadWithoutGenericQuestionsOrValidationWarnings() = runBlocking {
        for((subject,week) in listOf("quimica" to 1,"fisica" to 2,"aritmetica" to 1))for(part in 1..2) {
            val lesson=loader().loadLesson(subject,week,"$week.$part").lesson
            assertEquals(lesson.id,11,lesson.challenges.size)
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount)
            assertEquals(report.printSummary(),0,report.warningCount)
            lesson.challenges.forEach {q ->
                assertFalse(q.id,q.statement.contains("marco conceptual desarrollado"))
                assertTrue(q.id,resolutionSegments(q.explanation).size>=3)
                assertFalse(q.id,AcademicSanitizer.hasUnrelatedStemContamination(lesson.theory.asignatura,q.statement))
            }
        }
    }
    @Test fun densityRemainsConstantAcrossPositivePortionsAndRejectsZeroVolume() {
        val sample=DensitySample(60.0,20.0)
        for(fraction in listOf(.25,.5,.75,1.0)) {
            val part=sample.portion(fraction)
            assertEquals(3.0,part.density,1e-12)
            assertEquals(60*fraction,part.mass,1e-12)
            assertEquals(20*fraction,part.volume,1e-12)
        }
        assertThrows(IllegalArgumentException::class.java) {DensitySample(1.0,0.0)}
        assertThrows(IllegalArgumentException::class.java) {sample.portion(0.0)}
    }
    @Test fun independentMotionAndUnitCalculationsMatchReviewedAnswers() = runBlocking {
        val motion=loader().loadLesson("fisica",2,"2.1").lesson.challenges
        assertEquals(4.0,(30.0+10)/10,0.0)
        assertEquals("4 m/s",motion[1].options[motion[1].correctIndex])
        assertEquals(2.0,(30.0-10)/10,0.0)
        assertEquals("2 m/s",motion[2].options[motion[2].correctIndex])
        val projectile=loader().loadLesson("fisica",2,"2.2").lesson.challenges
        assertEquals(20.0,hypot(12.0,16.0),0.0)
        assertEquals(60.0,15*(2*20.0/10),0.0)
        assertEquals("60 m",projectile[3].options[projectile[3].correctIndex])
        assertEquals(8.0,4.0.pow(2)/2,0.0)
        val chemistry=loader().loadLesson("quimica",1,"1.2").lesson.challenges
        assertEquals(298.15,25.0+273.15,1e-9)
        assertEquals("298.15 K",chemistry[6].options[chemistry[6].correctIndex])
    }
    @Test fun nestedSetCardinalityAndPartitionIdentitiesUseActualElements() {
        val a:Set<Any> = setOf(3,setOf(5),8)
        assertEquals(3,a.size)
        assertFalse(a.contains(5));assertTrue(a.contains(setOf(5)))
        assertTrue(a.containsAll(setOf(3,8)))
        // Seven Venn regions: three exclusive, three pair-only, one triple.
        val r=listOf(9,8,7,1,2,3,2)
        val memberSum=r.take(3).sum()+2*r.subList(3,6).sum()+3*r[6]
        assertEquals(42,memberSum)
        assertEquals(32,r.sum())
    }
    @Test fun splitMathEnvironmentIsNowLocalToArithmeticFirstLevel() {
        val one=File(root,"aprender/aritmetica/semana01/1.1/theory.md").readText()
        val two=File(root,"aprender/aritmetica/semana01/1.2/theory.md").readText()
        assertEquals(1,Regex("""\\begin\{cases\}""").findAll(one).count())
        assertEquals(1,Regex("""\\end\{cases\}""").findAll(one).count())
        assertFalse(two.contains("\\end{cases}"))
        assertFalse(two.contains("Se utiliza obligatoriamente"))
    }
}
