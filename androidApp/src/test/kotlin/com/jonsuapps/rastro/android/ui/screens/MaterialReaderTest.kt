package com.jonsuapps.rastro.android.ui.screens

import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.data.content.JsonContentLoader
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class MaterialReaderTest {
    private fun lesson(id: String="x",sub: String="1.1",week: Int=1) = LessonNode(id,"geografia",week,sub,"Tema real $sub",
        LessonTheory("t$id","Geografía",week,"Título original","## Concepto\nTexto original.\n- **Autor:** Nombre original."),
        listOf(Challenge("$id-q",statement="¿Pregunta original?",options=listOf("A","B"),correctIndex=1,explanation="Explicación original")))

    @Test fun modesReuseTheSameQuestionAndKeepIdentityWithoutChangingProgress() {
        val source=lesson().copy(isLocked=true,isCompleted=true,stars=3)
        val questions=materialUnits(listOf(source),MaterialSelection(kind=MaterialKind.QUESTIONS))
        assertEquals(1,questions.size)
        assertSame(source.challenges.single(),questions.single().challenge)
        assertTrue(materialUnits(listOf(source),MaterialSelection(kind=MaterialKind.THEORY)).none {it.challenge!=null})
        assertEquals(listOf("B"),materialAnswer(questions.single().challenge!!))
        assertEquals(source,questions.single().lesson)
        assertEquals(3,source.stars)
    }
    @Test fun topicAndSubtopicSelectionPreserveNaturalOrderAndUniqueKeys() {
        val source=listOf(lesson("ten","1.10"),lesson("two","1.2"),lesson("next","2.1",2))
        val items=materialUnits(source,MaterialSelection(MaterialKind.QUESTIONS))
        assertEquals(listOf("two","ten","next"),items.map {it.lesson.id})
        assertEquals(2,materialUnits(source,MaterialSelection(MaterialKind.QUESTIONS,week=1)).size)
        assertEquals("next",materialUnits(source,MaterialSelection(MaterialKind.QUESTIONS,lessonId="next")).single().lesson.id)
        assertEquals(items.size,items.map {it.id}.distinct().size)
        assertEquals(items,materialUnits(source,MaterialSelection(MaterialKind.QUESTIONS,MaterialNavigation.HORIZONTAL)))
    }
    @Test fun bookmarkFallsBackLocallyAndChangedContentBecomesPending() {
        val units=materialUnits(listOf(lesson()),MaterialSelection())
        assertEquals(0,materialRestoreIndex(units,"missing"))
        assertEquals(units.lastIndex,materialRestoreIndex(units,units.last().id))
        val unit=units.last();val mark=MaterialMark(unit.fingerprint,MaterialReview.FLAGGED,"Error localizado")
        assertEquals(MaterialReview.FLAGGED,materialStatus(unit,mark))
        assertEquals(MaterialReview.PENDING,materialStatus(unit.copy(fingerprint="new"),mark))
    }
    @Test fun allQuestionKindsExposeOnlyTheirStoredAnswers() {
        val match=Challenge("m",type=ChallengeType.MATCH_PAIRS,statement="Relaciona",pairs=listOf(ChallengePair("p","Autor","Obra")))
        assertEquals(listOf("Autor ↔ Obra"),materialAnswer(match))
        val fill=Challenge("f",type=ChallengeType.FILL_BLANK,statement="Completa",blanks=listOf(ChallengeBlank("b",listOf("x","y"),"y")))
        assertEquals(listOf("b: y"),materialAnswer(fill))
        assertTrue(materialAnswer(Challenge("bad",statement="?",correctIndex=4)).isEmpty())
    }
    @Test fun everyResourceLessonLoadsIntoConsultationWithoutDuplicatingQuestions() = runBlocking {
        val root=File("../shared/src/commonMain/composeResources/files")
        val loader=JsonContentLoader(readBytesOverride={ path -> File(root,path.removePrefix("files/")).readBytes() })
        var count=0;var questionCount=0
        root.resolve("aprender").walkTopDown().filter {it.name=="lesson.json"}.forEach { metadata ->
            val rel=metadata.relativeTo(root.resolve("aprender")).path.split(File.separator)
            val source=loader.loadLesson(rel[0],rel[1].removePrefix("semana").toInt(),rel[2]).lesson
            val questions=materialUnits(listOf(source),MaterialSelection(MaterialKind.QUESTIONS))
            assertEquals(source.id,source.challenges.map {it.id}.toSet(),questions.mapNotNull {it.challenge?.id}.toSet())
            assertEquals(source.challenges.size,questions.size)
            val units=materialUnits(listOf(source),MaterialSelection())
            assertEquals(source.id,units.size,units.map {it.id}.distinct().size)
            assertTrue(source.id,units.any {it.challenge==null})
            count++;questionCount+=questions.size
        }
        assertEquals(418,count)
        assertEquals(4554,questionCount)
    }
}
