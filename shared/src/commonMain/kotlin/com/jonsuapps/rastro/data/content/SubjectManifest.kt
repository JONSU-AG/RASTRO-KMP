package com.jonsuapps.rastro.data.content

import kotlinx.serialization.Serializable

/**
 * Manifiesto de una materia (ej. Biología).
 * Define metadatos globales y lista de semanas disponibles.
 */
@Serializable
data class SubjectManifest(
    val subjectId: String,           // "biologia"
    val name: String,                // "Biología"
    val area: String,                // "Ciencia y Tecnología"
    val colorHex: String,            // "#10B981"
    val description: String,         // Descripción corta
    val weeks: Int,                  // 10
    val source: String,              // "TEMARIO_OFICIAL_UNSA.md §3.4"
    val weekManifests: List<WeekRef> // Referencias a semanas
)

@Serializable
data class WeekRef(
    val week: Int,                   // 8
    val title: String,               // "Fisiología Humana I"
    val path: String                 // "semana08/manifest.json"
)