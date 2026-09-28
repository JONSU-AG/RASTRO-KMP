package com.jonsuapps.rastro.android.data

import android.content.Context
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration

data class RastroNotification(
    val id: String,
    val title: String,
    val message: String,
    val type: String,
    val senderName: String,
    val timestamp: Long,
    val read: Boolean,
    val senderUid: String = "",
    val targetUid: String = "",
    val isBroadcast: Boolean = false
)

object NotificationRepository {
    private const val PREFS_NAME = "rastro_dismissed_announcements"
    private const val KEY_DISMISSED_IDS = "dismissed_broadcast_ids"

    fun getDismissedBroadcastIds(context: Context): Set<String> {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getStringSet(KEY_DISMISSED_IDS, emptySet()) ?: emptySet()
    }

    fun dismissBroadcastForUser(context: Context, id: String) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val current = prefs.getStringSet(KEY_DISMISSED_IDS, emptySet())?.toMutableSet() ?: mutableSetOf()
        current.add(id)
        prefs.edit().putStringSet(KEY_DISMISSED_IDS, current).apply()
    }

    fun dismissAllBroadcastsForUser(context: Context, ids: List<String>) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val current = prefs.getStringSet(KEY_DISMISSED_IDS, emptySet())?.toMutableSet() ?: mutableSetOf()
        current.addAll(ids)
        prefs.edit().putStringSet(KEY_DISMISSED_IDS, current).apply()
    }

    fun observe(
        uid: String,
        context: Context? = null,
        onChange: (List<RastroNotification>) -> Unit
    ): List<ListenerRegistration> {
        if (uid.isBlank()) return emptyList()
        val db = FirebaseFirestore.getInstance()
        var personal = emptyList<RastroNotification>()
        var broadcasts = emptyList<RastroNotification>()

        fun publish() {
            val dismissedIds = if (context != null) getDismissedBroadcastIds(context) else emptySet()
            val filteredBroadcasts = broadcasts.filterNot { it.id in dismissedIds }
            val combined = (personal + filteredBroadcasts).distinctBy { it.id }.sortedByDescending { it.timestamp }
            onChange(combined)
        }

        fun listen(recipient: String, isBroad: Boolean, update: (List<RastroNotification>) -> Unit) =
            db.collection("notificaciones").whereEqualTo("recipientUid", recipient)
                .limit(50)
                .addSnapshotListener { snapshot, error ->
                    if (error != null || snapshot == null) return@addSnapshotListener
                    update(snapshot.documents.map { document ->
                        RastroNotification(
                            id = document.id,
                            title = document.getString("title") ?: document.getString("postTitle") ?: "Aviso de RASTRO",
                            message = document.getString("message") ?: document.getString("text") ?: "Tienes una nueva notificación.",
                            type = document.getString("type").orEmpty(),
                            senderName = document.getString("senderName").orEmpty(),
                            timestamp = document.getTimestamp("createdAt")?.toDate()?.time ?: document.getLong("timestamp") ?: 0L,
                            read = document.getBoolean("read") ?: false,
                            senderUid = document.getString("senderUid").orEmpty(),
                            targetUid = document.getString("profileUid") ?: document.getString("targetUid").orEmpty(),
                            isBroadcast = isBroad
                        )
                    })
                    publish()
                }

        return listOf(
            listen(uid, isBroad = false) { personal = it },
            listen("all", isBroad = true) { broadcasts = it }
        )
    }

    fun markRead(id: String) = FirebaseFirestore.getInstance().collection("notificaciones").document(id)
        .update("read", true)

    fun markAllRead(items: List<RastroNotification>) {
        val batch = FirebaseFirestore.getInstance().batch()
        items.filterNot { it.read }.forEach { item ->
            batch.update(FirebaseFirestore.getInstance().collection("notificaciones").document(item.id), "read", true)
        }
        batch.commit()
    }

    fun delete(id: String) = FirebaseFirestore.getInstance().collection("notificaciones").document(id).delete()
}
