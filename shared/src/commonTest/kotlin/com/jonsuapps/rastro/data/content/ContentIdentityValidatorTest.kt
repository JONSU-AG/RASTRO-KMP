package com.jonsuapps.rastro.data.content

import com.jonsuapps.rastro.model.LessonDepth
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class ContentIdentityValidatorTest {

    @Test
    fun testValidIdentity() {
        val lesson = LessonNode(
            id = "bio_t08_s01",
            subjectId = "biologia",
            semana = 8,
            subtema = "8.1",
            title = "Sistema Digestivo Humano",
            theory = LessonTheory(id = "th_bio_t08_s01", asignatura = "Biología", semana = 8, titulo = "Test", resumen = "Test"),
            challenges = emptyList(),
            depth = LessonDepth.NORMAL
        )
        
        // No debe lanzar excepción
        ContentIdentityValidator.validate(lesson, "biologia", 8, "8.1")
    }

    @Test
    fun testInvalidSubjectId() {
        val lesson = LessonNode(
            id = "bio_t08_s01",
            subjectId = "quimica",  // Incorrecto
            semana = 8,
            subtema = "8.1",
            title = "Test",
            theory = LessonTheory(id = "th", asignatura = "Biología", semana = 8, titulo = "Test", resumen = "Test"),
            challenges = emptyList()
        )
        
        val exception = assertFailsWith<IllegalStateException> {
            ContentIdentityValidator.validate(lesson, "biologia", 8, "8.1")
        }
        assertTrue(exception.message!!.contains("subjectId mismatch"))
    }

    @Test
    fun testInvalidWeek() {
        val lesson = LessonNode(
            id = "bio_t08_s01",
            subjectId = "biologia",
            semana = 9,  // Incorrecto
            subtema = "8.1",
            title = "Test",
            theory = LessonTheory(id = "th", asignatura = "Biología", semana = 8, titulo = "Test", resumen = "Test"),
            challenges = emptyList()
        )
        
        val exception = assertFailsWith<IllegalStateException> {
            ContentIdentityValidator.validate(lesson, "biologia", 8, "8.1")
        }
        assertTrue(exception.message!!.contains("semana mismatch"))
    }

    @Test
    fun testInvalidSubtopic() {
        val lesson = LessonNode(
            id = "bio_t08_s01",
            subjectId = "biologia",
            semana = 8,
            subtema = "Semana 8",  // Incorrecto: debería ser "8.1"
            title = "Test",
            theory = LessonTheory(id = "th", asignatura = "Biología", semana = 8, titulo = "Test", resumen = "Test"),
            challenges = emptyList()
        )
        
        val exception = assertFailsWith<IllegalStateException> {
            ContentIdentityValidator.validate(lesson, "biologia", 8, "8.1")
        }
        assertTrue(exception.message!!.contains("subtema mismatch"))
    }

    @Test
    fun testInvalidLessonIdFormat() {
        val lesson = LessonNode(
            id = "uuid_random_123",  // Formato incorrecto
            subjectId = "biologia",
            semana = 8,
            subtema = "8.1",
            title = "Test",
            theory = LessonTheory(id = "th", asignatura = "Biología", semana = 8, titulo = "Test", resumen = "Test"),
            challenges = emptyList()
        )
        
        val exception = assertFailsWith<IllegalStateException> {
            ContentIdentityValidator.validate(lesson, "biologia", 8, "8.1")
        }
        assertTrue(exception.message!!.contains("lesson.id"))
    }
}