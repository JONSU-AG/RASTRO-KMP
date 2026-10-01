package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
enum class UserRole {
    ESTUDIANTE,
    ALIADO,
    ADMIN
}

@Serializable
enum class AcademicStatus(val label: String) {
    POSTULANTE("Postulante Preuniversitario"),
    ESTUDIANTE_UNSA("Estudiante Universitario"),
    CACHIMBO("Cachimbo Ingresante"),
    EGRESADO("Egresado Universitario")
}

@Serializable
data class UserData(
    val uid: String = "",
    val email: String? = null,
    val displayName: String = "Estudiante RASTRO",
    val photoURL: String? = null,
    val coverUrl: String? = null,
    val coverGradient: String = "",
    val instagramUrl: String = "",
    val isAuthenticated: Boolean = false,
    val isAnonymous: Boolean = false,
    val uploadCount: Int = 0,
    val isAlly: Boolean = false,
    val isAdmin: Boolean = false,
    val role: String = "estudiante",
    val hasChosenUsername: Boolean = false,
    val banned: Boolean = false,
    val hasWarning: Boolean = false,
    val warningMessage: String = "",
    val bio: String = "Estudiante enfocado en alcanzar la meta universitaria.",
    val academicStatus: AcademicStatus = AcademicStatus.POSTULANTE,
    val targetCareer: String = "",
    val targetUniversity: String = "Universidad Nacional",
    val avatarFrame: String = "none",
    val whatsappChannel: String = "",
    val tiktokUrl: String = "",
    val createdAt: String = "",
    val blockedUsers: List<String> = emptyList()
)
