package com.jonsuapps.rastro.android.data

internal object AccountDeletionPlan {
    fun isGeneratedProfileImage(uid: String, name: String) = Regex("^${Regex.escape(uid)}_(profile|cover)_[0-9]+\\.jpg$").matches(name)
    fun hasRecentLogin(authSeconds: Long, nowSeconds: Long) = authSeconds > 0 && nowSeconds - authSeconds in 0..240
    val privateCollections = listOf("gamificacion", "coin_rewards")
    val ownedQueries = listOf(
        "uploads" to "uploadedBy.uid", "uploads" to "ownerId",
        "libros" to "authorUid", "flashcards" to "authorUid", "preguntas_examen" to "authorUid",
        "perfil_comentarios" to "authorUid", "perfil_comentarios" to "profileUid",
        "publicacion_comentarios" to "authorUid", "clase_comentarios" to "authorUid",
        "publicacion_comentarios" to "profileUid", "notificaciones" to "senderUid", "notificaciones" to "recipientUid",
        "mensajes_directos_privados" to "senderUid", "mensajes_directos_privados" to "recipientUid",
        "siguiendo" to "followerUid", "siguiendo" to "followedUid", "ranking_simulacros" to "uid",
        "rastro_yt_playlists" to "ownerUid", "racha_dual" to "user1Uid", "racha_dual" to "user2Uid",
        "reportes" to "reporterUid", "reportes_ugc" to "reporterUid", "solicitudes_aliados" to "uid"
    )
    val arrayQueries = listOf("uploads" to "savedBy", "uploads" to "likedBy", "uploads" to "reportedBy") +
        listOf("uploads", "publicacion_comentarios", "perfil_comentarios", "clase_comentarios").flatMap { c ->
            listOf("👍", "❤️", "🔥").map { c to "reactions.$it" }
        } + listOf("blockedUsers", "friends", "followers", "following").map { "usuarios" to it }
}
