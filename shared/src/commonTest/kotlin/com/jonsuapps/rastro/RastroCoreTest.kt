package com.jonsuapps.rastro

import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.data.SimuladorRepository
import com.jonsuapps.rastro.model.AreaAdmision
import com.jonsuapps.rastro.utils.AcademicSanitizer
import com.jonsuapps.rastro.utils.VideoValidation
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RastroCoreTest {

    @Test
    fun testAdminConfigValidatesOfficialEmails() {
        val officialEmail = "jonsu.aguilar@gmail.com"
        assertTrue(AdminConfig.isAdmin(officialEmail), "El correo oficial de Jonsu Aguilar debe ser admin")

        val randomUser = "postulante@unsa.edu.pe"
        assertFalse(AdminConfig.isAdmin(randomUser), "Un postulante normal no debe tener privilegios de admin")
    }

    @Test
    fun testVideoValidationRules() {
        val validYouTubeWatch = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
        val validYouTubePlaylist = "https://www.youtube.com/playlist?list=PLu_4Hj0tZRhC0X8W-9K23jX6G7sD_T"
        val blockedFirebaseStorage = "https://firebasestorage.googleapis.com/v0/b/rumbo-jonsu.appspot.com/o/video.mp4"

        assertTrue(VideoValidation.isPublicYouTube(validYouTubeWatch))
        assertTrue(VideoValidation.isPublicYouTube(validYouTubePlaylist))
        assertTrue(VideoValidation.isBlockedSource(blockedFirebaseStorage))
        assertFalse(VideoValidation.isPublicYouTube(blockedFirebaseStorage))
    }

    @Test
    fun testAcademicSanitizerSubjectAreaClassification() {
        assertEquals("stem", AcademicSanitizer.normalizeSubjectArea("Física"))
        assertEquals("stem", AcademicSanitizer.normalizeSubjectArea("Álgebra"))
        assertEquals("biomedicas", AcademicSanitizer.normalizeSubjectArea("Biología"))
        assertEquals("humanidades", AcademicSanitizer.normalizeSubjectArea("Literatura"))
        assertEquals("humanidades", AcademicSanitizer.normalizeSubjectArea("Filosofía"))

        val contaminatedQuestion = "¿Cuál es la unidad en el S.I. de la fuerza y cómo influye en el Vanguardismo?"
        assertTrue(AcademicSanitizer.hasUnrelatedStemContamination("Literatura", contaminatedQuestion))
    }

    @Test
    fun testSimuladorWeightedScoreCalculation() {
        val sampleQuestions = SimuladorRepository.sampleExamQuestions
        // Simular que el usuario acierta la primera pregunta (Biología) y deja en blanco las demás
        val userAnswers = mapOf(0 to sampleQuestions[0].answer)

        val result = SimuladorRepository.calculateScore(
            questions = sampleQuestions,
            userAnswers = userAnswers,
            area = AreaAdmision.BIOMEDICAS
        )

        assertEquals(1, result.correctCount)
        assertEquals(0, result.wrongCount)
        assertEquals(sampleQuestions.size - 1, result.blankCount)
        assertTrue(result.unsaWeightedScore > 0.0, "El puntaje ponderado oficial debe ser mayor a 0")
        assertTrue(result.unsaWeightedScore <= 100.0, "El puntaje no debe exceder 100.0")
    }
}
