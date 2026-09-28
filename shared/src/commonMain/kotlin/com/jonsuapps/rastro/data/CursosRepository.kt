package com.jonsuapps.rastro.data

import kotlinx.serialization.Serializable

@Serializable
data class CoursePlaylist(
    val id: String,
    val title: String,
    val channelTitle: String,
    val subject: String,
    val playlistId: String,
    val videoCount: Int,
    val category: String, // "Mías", "Comunidad", "Compartidas"
    val isVerified: Boolean = false,
    val description: String = ""
)

object CursosRepository {

    val playlists = listOf(
        CoursePlaylist(
            id = "yt_fisica_cepreunsa",
            title = "Física Preuniversitaria Completa (MRU a Electromagnetismo)",
            channelTitle = "Canal Pre-U Comunitario",
            subject = "Física",
            playlistId = "PLu_4Hj0tZRhC0X8W-9K23jX6G7sD_T",
            videoCount = 24,
            category = "Comunidad",
            isVerified = false,
            description = "Resolución paso a paso de problemas tipo examen de admisión y deducción de fórmulas."
        ),
        CoursePlaylist(
            id = "yt_quimica_general",
            title = "Química Integral: Estequiometría y Nomenclatura",
            channelTitle = "Ciencias RASTRO Comunidad",
            subject = "Química",
            playlistId = "PLk7f9A3v1D4w5Z2x8y0m7N3q6l",
            videoCount = 18,
            category = "Comunidad",
            isVerified = false,
            description = "Estructura atómica, tabla periódica, enlaces, balance redox y gases ideales."
        ),
        CoursePlaylist(
            id = "yt_biologia_humana",
            title = "Biología y Anatomía Humana para Biomédicas",
            channelTitle = "Médicos del Mañana Comunitario",
            subject = "Biología",
            playlistId = "PL9Hj0tZRhC0X8W9K23jX6G7sD_T1",
            videoCount = 30,
            category = "Comunidad",
            isVerified = false,
            description = "Citología, histología humana, aparatos y sistemas, genética y ecología."
        ),
        CoursePlaylist(
            id = "yt_algebra_admision",
            title = "Álgebra Preuniversitaria: Polinomios y Funciones",
            channelTitle = "Matemáticas Puras",
            subject = "Álgebra",
            playlistId = "PL8jX6G7sD_Tu_4Hj0tZRhC0X8W",
            videoCount = 20,
            category = "Comunidad",
            isVerified = false,
            description = "Productos notables, factorización, división algebraica, matrices y determinantes."
        ),
        CoursePlaylist(
            id = "yt_historia_peru",
            title = "Historia del Perú: De Caral a la República",
            channelTitle = "Humanidades Comunidad",
            subject = "Historia",
            playlistId = "PL0X8W9K23jX6G7sD_Tu_4Hj0tZ",
            videoCount = 16,
            category = "Comunidad",
            isVerified = false,
            description = "Periodización andina, horizonte temprano e intermedio, incas, conquista y república."
        )
    )

    fun getBySubject(subject: String): List<CoursePlaylist> {
        if (subject.isBlank() || subject.equals("Todas", ignoreCase = true)) return playlists
        return playlists.filter { it.subject.equals(subject, ignoreCase = true) }
    }

    fun getByCategory(category: String): List<CoursePlaylist> {
        if (category.isBlank() || category.equals("Todas", ignoreCase = true)) return playlists
        return playlists.filter { it.category.equals(category, ignoreCase = true) }
    }
}
