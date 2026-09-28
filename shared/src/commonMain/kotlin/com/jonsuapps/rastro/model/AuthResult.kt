package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

sealed class AuthState {
    data object Loading : AuthState()
    data object Unauthenticated : AuthState()
    data class Authenticated(
        val uid: String,
        val email: String?,
        val displayName: String,
        val photoUrl: String?,
        val isAnonymous: Boolean,
        val isAuthor: Boolean,
        val userData: UserData?
    ) : AuthState()
}

@Serializable
data class GuestConflictSnapshot(
    val googleUid: String,
    val guestDisplayName: String,
    val guestXp: Int,
    val guestStreak: Int,
    val googleDisplayName: String,
    val googleXp: Int,
    val googleStreak: Int
)

sealed class GuestResolutionChoice {
    data object KeepGuestProgress : GuestResolutionChoice()
    data object KeepGoogleProgress : GuestResolutionChoice()
}
