package com.jonsuapps.rastro.community

import kotlinx.serialization.Serializable

@Serializable
data class MuroPost(
    val id: String,
    val authorUid: String,
    val authorName: String,
    val authorAvatar: String? = null,
    val timeAgo: String,
    val tag: String,
    val title: String,
    val content: String,
    val fileUrl: String? = null,
    val reactions: Map<String, List<String>> = emptyMap(), // emoji -> Lista de UIDs que reaccionaron
    val comments: List<PostComment> = emptyList(),
    val destacado: Boolean = false,
    val fijado: Boolean = false
) {
    val totalReactionsCount: Int
        get() = reactions.values.sumOf { it.size }

    fun hasUserReacted(emoji: String, userUid: String): Boolean {
        return reactions[emoji]?.contains(userUid) == true
    }
}

@Serializable
data class PostComment(
    val id: String,
    val postId: String,
    val authorUid: String,
    val authorName: String,
    val authorAvatar: String? = null,
    val text: String,
    val timeAgo: String,
    val reactions: Map<String, List<String>> = emptyMap()
) {
    val totalReactionsCount: Int
        get() = reactions.values.sumOf { it.size }

    fun hasUserReacted(emoji: String, userUid: String): Boolean {
        return reactions[emoji]?.contains(userUid) == true
    }
}
