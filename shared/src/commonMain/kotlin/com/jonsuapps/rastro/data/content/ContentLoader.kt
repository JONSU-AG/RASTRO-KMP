package com.jonsuapps.rastro.data.content

import com.jonsuapps.rastro.model.LessonNode
import kotlinx.coroutines.flow.Flow

/**
 * Interfaz para cargar contenido académico aislado.
 * Implementación por defecto: [JsonContentLoader] (JSON + Markdown en resources).
 */
interface ContentLoader {
    /**
     * Carga el manifiesto de una materia.
     */
    suspend fun loadSubjectManifest(subjectId: String): SubjectManifest

    /**
     * Carga el manifiesto de una semana dentro de una materia.
     */
    suspend fun loadWeekManifest(subjectId: String, week: Int): WeekManifest

    /**
     * Carga una lección completa (identidad + teoría + preguntas).
     * Valida identidad antes de convertir a [LessonNode].
     */
    suspend fun loadLesson(
        subjectId: String,
        week: Int,
        subtopic: String
    ): LessonContent

    /**
     * Carga todas las lecciones de una materia (para índice).
     * Útil para `AprenderRepository.getLessonsForSubject()`.
     */
    suspend fun loadSubjectLessons(subjectId: String): List<LessonNode>

    /**
     * Stream reactivo de lecciones de una materia (para UI reactiva).
     */
    fun observeSubjectLessons(subjectId: String): Flow<List<LessonNode>>
}