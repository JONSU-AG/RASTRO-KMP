package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
data class DirectChatMessage(
    val id: String,
    val senderUid: String,
    val senderName: String,
    val senderPhotoUrl: String = "",
    val text: String,
    val timestamp: Long,
    val read: Boolean = false,
    val imageUrl: String? = null
)

@Serializable
data class DirectChatConversation(
    val id: String,
    val participantUids: List<String>,
    val otherUid: String,
    val otherName: String,
    val otherPhotoUrl: String = "",
    val otherAcademicStatus: String = "Postulante",
    val lastMessageText: String = "",
    val lastMessageTime: Long = 0L,
    val unreadCount: Int = 0
)

@Serializable
enum class OrsttyContextSource {
    DIRECT,
    SUBJECT_PATH,
    BIBLIOTECA,
    POMODORO,
    CHATS,
    SIMULADOR
}

@Serializable
data class OrsttyMessage(
    val id: String,
    val isFromOrstty: Boolean,
    val content: String,
    val timestamp: Long,
    val sourceContext: OrsttyContextSource = OrsttyContextSource.DIRECT,
    val sourceSubject: String? = null,
    val relatedCards: List<String> = emptyList(),
    val suggestions: List<String> = emptyList()
)
