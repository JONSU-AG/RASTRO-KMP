package com.jonsuapps.rastro.data.content

import kotlinx.serialization.Serializable

/**
 * Manifiesto de una semana (ej. Semana 8 de Biología).
 * Define las lecciones que contiene.
 */
@Serializable
data class WeekManifest(
    val week: Int,                   // 8
    val title: String,               // "Fisiología Humana I"
    val lessons: List<LessonRef>     // Lecciones de esta semana
)

@Serializable
data class LessonRef(
    val subtopic: String,            // "8.1"
    val lessonId: String,            // "bio_t08_s01"
    val title: String,               // "Sistema Digestivo Humano"
    val path: String                 // "8.1/lesson.json"
)