package com.jonsuapps.rastro.android.data

import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.jonsuapps.rastro.model.DirectChatConversation
import com.jonsuapps.rastro.model.DirectChatMessage
import com.jonsuapps.rastro.model.UserData

object ChatRepository {

    /**
     * Escucha en tiempo real la bandeja de entrada de chats directos del usuario autenticado.
     * Utiliza la colección real de Firebase: "mensajes_directos_privados".
     */
    fun observeConversations(
        currentUserUid: String,
        onConversations: (List<DirectChatConversation>) -> Unit
    ): ListenerRegistration {
        if (currentUserUid.isBlank()) {
            onConversations(emptyList())
            return ListenerRegistration { }
        }

        return FirebaseFirestore.getInstance()
            .collection("mensajes_directos_privados")
            .whereArrayContains("participants", currentUserUid)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                val map = mutableMapOf<String, DirectChatConversation>()

                for (doc in snapshot.documents) {
                    val senderUid = doc.getString("senderUid").orEmpty()
                    val recipientUid = doc.getString("recipientUid").orEmpty()
                    val participants = (doc.get("participants") as? List<*>)?.mapNotNull { it as? String }
                        ?: listOf(senderUid, recipientUid)

                    val partnerUid = participants.firstOrNull { it != currentUserUid }
                        ?: if (senderUid == currentUserUid) recipientUid else senderUid

                    if (partnerUid.isBlank()) continue

                    val partnerName = if (senderUid == currentUserUid) {
                        doc.getString("recipientName")?.takeIf(String::isNotBlank) ?: "Estudiante RASTRO"
                    } else {
                        doc.getString("senderName")?.takeIf(String::isNotBlank) ?: "Estudiante RASTRO"
                    }

                    val partnerPhoto = if (senderUid == currentUserUid) {
                        doc.getString("recipientPhoto").orEmpty()
                    } else {
                        doc.getString("senderPhoto").orEmpty()
                    }

                    val text = doc.getString("text").orEmpty()
                    val msgTime = doc.getTimestamp("createdAt")?.toDate()?.time
                        ?: doc.getLong("timestamp")
                        ?: 0L
                    val isRead = doc.getBoolean("read") == true
                    val isUnreadForMe = !isRead && recipientUid == currentUserUid

                    val conversationId = doc.getString("conversationId")
                        ?: listOf(currentUserUid, partnerUid).sorted().joinToString("_")

                    val existing = map[partnerUid]
                    if (existing == null) {
                        map[partnerUid] = DirectChatConversation(
                            id = conversationId,
                            participantUids = participants,
                            otherUid = partnerUid,
                            otherName = partnerName,
                            otherPhotoUrl = partnerPhoto,
                            otherAcademicStatus = "Postulante Preuniversitario",
                            lastMessageText = text,
                            lastMessageTime = msgTime,
                            unreadCount = if (isUnreadForMe) 1 else 0
                        )
                    } else {
                        val shouldUpdateLast = msgTime >= existing.lastMessageTime
                        map[partnerUid] = existing.copy(
                            otherName = if (existing.otherName.isBlank() || existing.otherName == "Estudiante RASTRO") partnerName else existing.otherName,
                            otherPhotoUrl = if (existing.otherPhotoUrl.isBlank()) partnerPhoto else existing.otherPhotoUrl,
                            lastMessageText = if (shouldUpdateLast) text else existing.lastMessageText,
                            lastMessageTime = if (shouldUpdateLast) msgTime else existing.lastMessageTime,
                            unreadCount = existing.unreadCount + (if (isUnreadForMe) 1 else 0)
                        )
                    }
                }

                val list = map.values.sortedByDescending { it.lastMessageTime }
                onConversations(list)
            }
    }

    /**
     * Escucha en tiempo real los mensajes de una conversación 1:1 específica.
     */
    fun observeMessages(
        conversationId: String,
        currentUserUid: String,
        onMessages: (List<DirectChatMessage>) -> Unit
    ): ListenerRegistration {
        if (conversationId.isBlank()) {
            onMessages(emptyList())
            return ListenerRegistration { }
        }

        return FirebaseFirestore.getInstance()
            .collection("mensajes_directos_privados")
            .whereEqualTo("conversationId", conversationId)
            .limit(100)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                val messages = snapshot.documents.mapNotNull { doc ->
                    val senderUid = doc.getString("senderUid").orEmpty()
                    val senderName = doc.getString("senderName") ?: "Estudiante RASTRO"
                    val text = doc.getString("text").orEmpty()
                    val ts = doc.getTimestamp("createdAt")?.toDate()?.time
                        ?: doc.getLong("timestamp")
                        ?: 0L
                    val read = doc.getBoolean("read") == true

                    // Marcar como leído si el mensaje fue enviado hacia mí
                    if (!read && doc.getString("recipientUid") == currentUserUid) {
                        runCatching { doc.reference.update("read", true) }
                    }

                    DirectChatMessage(
                        id = doc.id,
                        senderUid = senderUid,
                        senderName = senderName,
                        senderPhotoUrl = doc.getString("senderPhoto").orEmpty(),
                        text = text,
                        timestamp = ts,
                        read = read
                    )
                }.sortedBy { it.timestamp }
                onMessages(messages)
            }
    }

    /**
     * Envía un mensaje 1:1 real a Firestore y notifica al destinatario en 'notificaciones'.
     */
    fun sendMessage(
        currentUser: UserData,
        partnerUid: String,
        partnerName: String,
        partnerPhoto: String?,
        text: String,
        onSuccess: () -> Unit = {}
    ) {
        if (currentUser.uid.isBlank() || partnerUid.isBlank() || text.isBlank()) return

        val participants = listOf(currentUser.uid, partnerUid).sorted()
        val conversationId = participants.joinToString("_")
        val now = System.currentTimeMillis()
        val db = FirebaseFirestore.getInstance()

        val cleanText = text.trim()

        db.collection("mensajes_directos_privados").add(
            mapOf(
                "conversationId" to conversationId,
                "participants" to participants,
                "senderUid" to currentUser.uid,
                "senderName" to currentUser.displayName.ifBlank { "Estudiante RASTRO" },
                "senderPhoto" to currentUser.photoURL,
                "recipientUid" to partnerUid,
                "recipientName" to partnerName.ifBlank { "Estudiante RASTRO" },
                "recipientPhoto" to partnerPhoto,
                "text" to cleanText,
                "createdAt" to FieldValue.serverTimestamp(),
                "timestamp" to now,
                "read" to false
            )
        ).addOnSuccessListener {
            // Notificación al destinatario
            if (currentUser.uid != partnerUid) {
                db.collection("notificaciones").add(
                    mapOf(
                        "recipientUid" to partnerUid,
                        "senderUid" to currentUser.uid,
                        "senderName" to currentUser.displayName.ifBlank { "Estudiante RASTRO" },
                        "senderPhoto" to currentUser.photoURL,
                        "type" to "chat",
                        "conversationId" to conversationId,
                        "targetPath" to "/chats?with=${currentUser.uid}",
                        "text" to cleanText,
                        "message" to "te envió un mensaje: \"${cleanText.take(180)}\"",
                        "read" to false,
                        "createdAt" to FieldValue.serverTimestamp(),
                        "timestamp" to now
                    )
                )
            }
            onSuccess()
        }
    }

    /**
     * Permite buscar usuarios reales registrados en Firestore para iniciar nuevas conversaciones.
     */
    fun searchRegisteredUsers(
        query: String,
        currentUserUid: String,
        onResults: (List<UserData>) -> Unit
    ) {
        FirebaseFirestore.getInstance()
            .collection("usuarios")
            .limit(30)
            .get()
            .addOnSuccessListener { snapshot ->
                val term = query.trim().lowercase()
                val users = snapshot.documents.mapNotNull { doc ->
                    val uid = doc.id
                    if (uid == currentUserUid) return@mapNotNull null
                    val name = doc.getString("displayName") ?: doc.getString("nombre") ?: "Estudiante RASTRO"
                    val email = doc.getString("email").orEmpty()
                    val targetCareer = doc.getString("targetCareer") ?: doc.getString("carrera").orEmpty()
                    val targetUniversity = doc.getString("targetUniversity") ?: doc.getString("universidad").orEmpty()

                    if (term.isNotBlank() &&
                        !name.lowercase().contains(term) &&
                        !email.lowercase().contains(term) &&
                        !targetCareer.lowercase().contains(term)
                    ) {
                        return@mapNotNull null
                    }

                    UserData(
                        uid = uid,
                        displayName = name,
                        email = email,
                        photoURL = doc.getString("photoUrl") ?: doc.getString("photoURL"),
                        targetCareer = targetCareer,
                        targetUniversity = targetUniversity,
                        isAuthenticated = true
                    )
                }
                onResults(users)
            }
            .addOnFailureListener {
                onResults(emptyList())
            }
    }
}
