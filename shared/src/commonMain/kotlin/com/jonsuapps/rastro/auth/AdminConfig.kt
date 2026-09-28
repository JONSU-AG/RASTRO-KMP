package com.jonsuapps.rastro.auth

import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Correos oficiales autorizados del autor / creador del proyecto Firebase (rumbo-jonsu)
 * Jonsu Aguilar. Cualquier poder administrativo exige que este correo esté verificado en el token de Auth.
 */
object AdminConfig {
    val ADMIN_EMAILS: List<String> = listOf(
        "aguilar.jonsu@gmail.com",
        "rumbo.jonsu@gmail.com",
        "jhojan.aguilar.13.10@gmail.com",
        "rulua617@gmail.com",
        "147279812+rulua617@users.noreply.github.com"
    )

    /**
     * Determina si un correo pertenece al autor/creador de Firebase (Jonsu Aguilar).
     * Se evalúa en minúsculas y sin espacios.
     */
    fun isAuthorOfFirebase(email: String?): Boolean {
        if (email.isNullOrBlank()) return false
        val clean = email.trim().lowercase()
        return ADMIN_EMAILS.any { it.trim().lowercase() == clean }
    }

    private val _isUserViewModeEnabled = MutableStateFlow(false)

    var isUserViewModeEnabled: Boolean
        get() = _isUserViewModeEnabled.value
        set(value) { _isUserViewModeEnabled.value = value }

    fun isAdmin(email: String?): Boolean = isAuthorOfFirebase(email)

    fun isEffectiveAdmin(email: String?): Boolean {
        if (isUserViewModeEnabled) return false
        return isAdmin(email)
    }
}
