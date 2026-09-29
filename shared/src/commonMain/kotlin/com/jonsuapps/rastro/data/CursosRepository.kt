package com.jonsuapps.rastro.data

import kotlinx.serialization.Serializable

@Serializable
enum class PlaylistLessonStatus {
    COMPLETED,
    CURRENT,
    AVAILABLE,
    LOCKED
}

@Serializable
data class CourseLesson(
    val id: String,
    val number: Int,
    val title: String,
    val semana: String,
    val duration: String,
    val status: PlaylistLessonStatus = PlaylistLessonStatus.AVAILABLE,
    val youtubeVideoId: String = "",
    val hasQuestions: Boolean = false,
    val pdfUrl: String? = null
)

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
    val description: String = "",
    val lessons: List<CourseLesson> = emptyList()
)

object CursosRepository {

    val playlists = listOf(
        CoursePlaylist(
            id = "yt_fisica_cepreunsa",
            title = "Física desde cero",
            channelTitle = "Canal Pre-U Comunitario",
            subject = "Física",
            playlistId = "PLu_4Hj0tZRhC0X8W-9K23jX6G7sD_T",
            videoCount = 15,
            category = "Comunidad",
            isVerified = true,
            description = "Resolución paso a paso de problemas tipo examen de admisión y deducción de fórmulas.",
            lessons = listOf(
                CourseLesson("fis_c01", 1, "Vectores", "Semana 1", "28:15", PlaylistLessonStatus.COMPLETED, "yt_v1", hasQuestions = true, pdfUrl = "pdf_v1"),
                CourseLesson("fis_c02", 2, "Análisis dimensional", "Semana 1", "35:42", PlaylistLessonStatus.COMPLETED, "yt_v2", hasQuestions = true),
                CourseLesson("fis_c03", 3, "Descomposición rectangular", "Semana 2", "32:10", PlaylistLessonStatus.COMPLETED, "yt_v3", pdfUrl = "pdf_v3"),
                CourseLesson("fis_c04", 4, "Cinemática", "Semana 2 · Lección 4", "45:10", PlaylistLessonStatus.CURRENT, "yt_v4", hasQuestions = true, pdfUrl = "pdf_v4"),
                CourseLesson("fis_c05", 5, "Movimiento Rectilíneo Uniforme", "Semana 2", "38:20", PlaylistLessonStatus.LOCKED, "yt_v5"),
                CourseLesson("fis_c06", 6, "MRUV", "Semana 2", "41:05", PlaylistLessonStatus.LOCKED, "yt_v6"),
                CourseLesson("fis_c07", 7, "Caída libre", "Semana 3", "29:18", PlaylistLessonStatus.LOCKED, "yt_v7"),
                CourseLesson("fis_c08", 8, "Movimiento Parabólico", "Semana 3", "34:50", PlaylistLessonStatus.LOCKED, "yt_v8"),
                CourseLesson("fis_c09", 9, "Movimiento Circular", "Semana 4", "31:12", PlaylistLessonStatus.LOCKED, "yt_v9"),
                CourseLesson("fis_c10", 10, "Estática I", "Semana 4", "42:00", PlaylistLessonStatus.LOCKED, "yt_v10"),
                CourseLesson("fis_c11", 11, "Estática II", "Semana 5", "36:45", PlaylistLessonStatus.LOCKED, "yt_v11"),
                CourseLesson("fis_c12", 12, "Dinámica Lineal", "Semana 5", "39:20", PlaylistLessonStatus.LOCKED, "yt_v12"),
                CourseLesson("fis_c13", 13, "Trabajo y Energía", "Semana 6", "44:10", PlaylistLessonStatus.LOCKED, "yt_v13"),
                CourseLesson("fis_c14", 14, "Hidrostática", "Semana 6", "33:15", PlaylistLessonStatus.LOCKED, "yt_v14"),
                CourseLesson("fis_c15", 15, "Electromagnetismo", "Semana 7", "48:00", PlaylistLessonStatus.LOCKED, "yt_v15")
            )
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
