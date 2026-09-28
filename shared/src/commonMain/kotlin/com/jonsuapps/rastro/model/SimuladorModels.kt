package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
enum class AreaAdmision(val label: String, val totalPreguntas: Int = 80) {
    BIOMEDICAS("Biomédicas", 80),
    INGENIERIAS("Ingenierías", 80),
    SOCIALES("Sociales", 80)
}

@Serializable
data class PonderacionAsignatura(
    val curso: String,
    val asignatura: String,
    val preguntas: Int,
    val valor: Double
)

@Serializable
data class ExamQuestion(
    val id: String,
    val q: String,
    val options: List<String>,
    val answer: Int,
    val asignatura: String,
    val curso: String,
    val area: String,
    val explanation: String = "",
    val imageUrl: String? = null,
    val valorPonderado: Double? = null,
    val semana: Int? = null,
    val authorName: String = "Comunidad RASTRO",
    val authorUid: String? = null,
    val subtema: String = "",
    val destinoUso: String = "SOLO_EXAMEN",
    val nivelDificultad: String = "INTERMEDIO",
    val aptoExamenRepaso: Boolean = true,
    val estadoGrafico: String = "SIN_GRAFICO_TEXTUAL",
    val tipoFormato: String = "TEORICO_DIRECTO",
    val observacion: String = ""
)

@Serializable
data class QuestionEvaluationDetail(
    val question: String,
    val options: List<String>,
    val userChoice: Int?,
    val correctChoice: Int,
    val isCorrect: Boolean,
    val isBlank: Boolean,
    val explanation: String,
    val asignatura: String,
    val valorPonderado: Double
)

@Serializable
data class ExamEvaluationResult(
    val totalPreguntas: Int,
    val correctCount: Int,
    val wrongCount: Int,
    val blankCount: Int,
    val unsaWeightedScore: Double, // Puntaje ponderado sobre 100 con 4 decimales
    val percentage: Int,
    val aciertosPorAsignatura: Map<String, Int>,
    val totalPorAsignatura: Map<String, Int>,
    val details: List<QuestionEvaluationDetail>
)

@Serializable
data class CareerCutoff(
    val name: String,
    val area: AreaAdmision,
    val minScore: Double,
    val maxScore: Double,
    val vacantCount: Int
)

@Serializable
data class FlashcardItem(
    val id: String,
    val q: String,
    val a: String,
    val subject: String,
    val authorName: String = "Comunidad RASTRO",
    val authorUid: String? = null,
    val semana: Int? = null,
    val subtemaCode: String? = null,
    val subtemaTitle: String? = null,
    val imageUrl: String? = null
)
