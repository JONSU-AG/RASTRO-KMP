package com.jonsuapps.rastro.auth

import com.jonsuapps.rastro.model.AreaAdmision
import com.jonsuapps.rastro.model.UserData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object UserManager {

    private val _currentUser = MutableStateFlow(
        UserData(
            uid = "local_student_1",
            displayName = "Estudiante RASTRO",
            targetUniversity = "Universidad Nacional de San Agustín (UNSA)",
            targetCareer = "Medicina Humana",
            hasChosenUsername = false
        )
    )
    val currentUser: StateFlow<UserData> = _currentUser.asStateFlow()

    private val _selectedArea = MutableStateFlow(AreaAdmision.BIOMEDICAS)
    val selectedArea: StateFlow<AreaAdmision> = _selectedArea.asStateFlow()

    private val _notificationsEnabled = MutableStateFlow(false)
    val notificationsEnabled: StateFlow<Boolean> = _notificationsEnabled.asStateFlow()

    private val _savedMnemotecniaIds = MutableStateFlow(
        setOf("mne_fis_mru_diosito", "mne_qui_gases_pavo_raton", "mne_bio_mitosis_prometo")
    )
    val savedMnemotecniaIds: StateFlow<Set<String>> = _savedMnemotecniaIds.asStateFlow()

    private val _savedObraIds = MutableStateFlow(
        setOf("obra_rios_profundos", "obra_ciudad_perros")
    )
    val savedObraIds: StateFlow<Set<String>> = _savedObraIds.asStateFlow()

    fun updateProfile(
        name: String,
        career: String,
        area: AreaAdmision,
        notificationsPermitted: Boolean = true
    ) {
        val trimmedName = name.trim().ifBlank { "Estudiante RASTRO" }
        _currentUser.value = _currentUser.value.copy(
            displayName = trimmedName,
            targetCareer = career.trim().ifBlank { "Medicina Humana" },
            hasChosenUsername = true
        )
        _selectedArea.value = area
        _notificationsEnabled.value = notificationsPermitted
    }

    fun toggleSaveMnemotecnia(id: String) {
        val current = _savedMnemotecniaIds.value.toMutableSet()
        if (current.contains(id)) {
            current.remove(id)
        } else {
            current.add(id)
        }
        _savedMnemotecniaIds.value = current
    }

    fun toggleSaveObra(id: String) {
        val current = _savedObraIds.value.toMutableSet()
        if (current.contains(id)) {
            current.remove(id)
        } else {
            current.add(id)
        }
        _savedObraIds.value = current
    }

    fun updateUserFromFirebase(
        uid: String,
        displayName: String?,
        email: String?,
        photoUrl: String?,
        isAnonymous: Boolean = false
    ) {
        _currentUser.value = _currentUser.value.copy(
            uid = uid,
            displayName = displayName?.ifBlank { null } ?: email?.substringBefore("@") ?: "Estudiante RASTRO",
            email = email,
            photoURL = photoUrl,
            isAuthenticated = true,
            isAnonymous = isAnonymous,
            hasChosenUsername = true
        )
    }

    fun applyProfileFields(
        displayName: String? = null,
        photoURL: String? = null,
        bio: String? = null,
        coverUrl: String? = null,
        coverGradient: String? = null,
        whatsappChannel: String? = null,
        tiktokUrl: String? = null,
        instagramUrl: String? = null,
        uploadCount: Int? = null,
        blockedUsers: List<String>? = null
    ) {
        _currentUser.value = _currentUser.value.copy(
            displayName = displayName?.takeIf(String::isNotBlank) ?: _currentUser.value.displayName,
            photoURL = photoURL?.takeIf(String::isNotBlank) ?: _currentUser.value.photoURL,
            bio = bio ?: _currentUser.value.bio,
            coverUrl = coverUrl ?: _currentUser.value.coverUrl,
            coverGradient = coverGradient ?: _currentUser.value.coverGradient,
            whatsappChannel = whatsappChannel ?: _currentUser.value.whatsappChannel,
            tiktokUrl = tiktokUrl ?: _currentUser.value.tiktokUrl,
            instagramUrl = instagramUrl ?: _currentUser.value.instagramUrl,
            uploadCount = uploadCount ?: _currentUser.value.uploadCount,
            blockedUsers = blockedUsers ?: _currentUser.value.blockedUsers
        )
    }

    fun blockUser(targetUid: String) {
        if (targetUid.isBlank() || targetUid == _currentUser.value.uid) return
        val current = _currentUser.value.blockedUsers.toMutableList()
        if (!current.contains(targetUid)) {
            current.add(targetUid)
            _currentUser.value = _currentUser.value.copy(blockedUsers = current)
        }
    }

    fun unblockUser(targetUid: String) {
        if (targetUid.isBlank()) return
        val current = _currentUser.value.blockedUsers.toMutableList()
        if (current.remove(targetUid)) {
            _currentUser.value = _currentUser.value.copy(blockedUsers = current)
        }
    }

    fun isUserBlocked(targetUid: String): Boolean = _currentUser.value.blockedUsers.contains(targetUid)

    fun logout() {
        _currentUser.value = UserData(
            uid = "local_student_guest",
            displayName = "Estudiante Invitado",
            isAuthenticated = false,
            isAnonymous = false,
            targetUniversity = "Universidad Nacional de San Agustín (UNSA)",
            targetCareer = "Medicina Humana",
            hasChosenUsername = false
        )
    }

    fun clearUser() = logout()

    fun isMnemotecniaSaved(id: String): Boolean = _savedMnemotecniaIds.value.contains(id)
    fun isObraSaved(id: String): Boolean = _savedObraIds.value.contains(id)
}
