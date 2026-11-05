package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import kotlin.math.*

class AcademicBlock01Test {
    private val root = File("../shared/src/commonMain/composeResources/files")
    private fun loader() = JsonContentLoader(readBytesOverride={path -> File(root,path.removePrefix("files/")).readBytes()})
    @Test fun reviewedLevelsLoadWithOriginalIdsAndNoGenericResolution() = runBlocking {
        val levels=listOf(Triple("trigonometria",1,"1.1"),Triple("geometria",3,"3.1"),Triple("geometria",7,"7.1"))
        levels.forEach { (subject,week,subtopic) ->
            val lesson=loader().loadLesson(subject,week,subtopic).lesson
            assertEquals(11,lesson.challenges.size)
            assertEquals(11,lesson.challenges.map {it.id}.distinct().size)
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount)
            assertEquals(report.printSummary(),0,report.warningCount)
            lesson.challenges.forEach { challenge ->
                assertTrue(challenge.id.startsWith(if(subject=="geometria") "geom_t" else "trig_t"))
                assertTrue(resolutionSegments(challenge.explanation).size >= 3)
                assertFalse(challenge.statement.contains("marco conceptual"))
                assertFalse(challenge.explanation.contains("conforme a las leyes"))
                assertFalse(AcademicSanitizer.hasUnrelatedStemContamination(lesson.theory.asignatura,challenge.statement))
            }
        }
    }
    @Test fun independentCalculationsAgreeWithCorrectedCriticalKeys() = runBlocking {
        val trig=loader().loadLesson("trigonometria",1,"1.1").lesson.challenges
        assertEquals(2*PI/5,angleRadians(72.0),1e-10)
        assertEquals(40.0,angleGradians(36.0),1e-10)
        assertEquals(27.0,(80*360.0/400-18)/2,1e-10)
        assertEquals("27°",trig[2].options[trig[2].correctIndex])
        assertEquals(72.0,trig[0].angleDegrees!!,0.0)
        assertEquals(-90.0,trig[4].angleDegrees!!,0.0)
        assertEquals(135.0,angleGradians(135.0)*360/400,1e-10)
        val circle=loader().loadLesson("geometria",7,"7.1").lesson.challenges
        val hypotenuse=hypot(8.0,15.0)
        val radius=(8+15-hypotenuse)/2
        assertEquals(3.0,radius,0.0)
        assertEquals("3 cm",circle[1].options[circle[1].correctIndex])
        val leg=(4.0+16)/2
        val height=sqrt(leg*leg-((16.0-4)/2).pow(2))
        assertEquals(4.0,height/2,0.0)
        assertEquals("4 m",circle[2].options[circle[2].correctIndex])
    }
    @Test fun onlyReviewedQuestionsCarryAngularDataAndExistingDataRemainsOptional() = runBlocking {
        val lesson=loader().loadLesson("trigonometria",1,"1.1").lesson
        assertEquals(7,lesson.challenges.count {it.angleDegrees != null})
        assertTrue(loader().loadLesson("geometria",3,"3.1").lesson.challenges.all {it.angleDegrees == null})
        assertTrue(loader().loadLesson("fisica",1,"1.1").lesson.challenges.all {it.angleDegrees == null})
    }
}
