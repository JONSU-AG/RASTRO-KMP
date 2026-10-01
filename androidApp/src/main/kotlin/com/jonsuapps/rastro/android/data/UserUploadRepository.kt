package com.jonsuapps.rastro.android.data

import android.content.Context
import android.net.Uri
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.SetOptions
import com.google.firebase.storage.FirebaseStorage
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.model.UserData

data class UserUpload(
    val id: String,
    val title: String,
    val author: String,
    val category: String,
    val description: String,
    val url: String,
    val createdAtMillis: Long,
    val previewUrls: List<String> = emptyList(),
    val isImage: Boolean = false,
    val isPdf: Boolean = false,
    val isFolder: Boolean = false,
    val ownerUid: String = "",
    val ownerPhotoUrl: String? = null,
    val reactions: Map<String, List<String>> = emptyMap(),
    val isPinned: Boolean = false,
    val isFeatured: Boolean = false,
    val savedBy: List<String> = emptyList(),
    val reportedBy: List<String> = emptyList(),
    val isHidden: Boolean = false,
    val reportsCount: Int = 0
)

data class UgcReport(
    val id: String = "",
    val postId: String = "",
    val postTitle: String = "",
    val postCategory: String = "",
    val authorUid: String = "",
    val authorName: String = "",
    val reporterUid: String = "",
    val reporterName: String = "",
    val reason: String = "",
    val details: String = "",
    val timestamp: Long = 0L,
    val urgent: Boolean = false,
    val resolved: Boolean = false
)

data class UploadComment(
    val id: String,
    val authorName: String,
    val text: String,
    val timestamp: Long,
    val authorUid: String = "",
    val postId: String = "",
    val postAuthorUid: String = ""
)

object UserUploadRepository {
    fun observe(uid: String, onUploads: (List<UserUpload>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("uploads")
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                onUploads(snapshot.documents.filter { document ->
                    val uploadedBy = document.get("uploadedBy") as? Map<*, *>
                    uploadedBy?.get("uid") == uid || document.getString("ownerId") == uid || document.getString("authorUid") == uid
                }.mapNotNull(::toUserUpload).sortedWith(compareByDescending<UserUpload> { it.isPinned }.thenByDescending { it.createdAtMillis }))
            }

    /** Flujo en tiempo real solo de publicaciones marcadas como destacadas (destacado == true). */
    fun observeFeatured(onUploads: (List<UserUpload>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("uploads")
            .whereEqualTo("destacado", true)
            .limit(20)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                onUploads(snapshot.documents.mapNotNull(::toUserUpload).sortedByDescending { it.createdAtMillis })
            }

    /** Same live collection used by React's Biblioteca community tab. */
    fun observeCommunity(onUploads: (List<UserUpload>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("uploads")
            .limit(100)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                onUploads(snapshot.documents.mapNotNull(::toUserUpload).sortedWith(compareByDescending<UserUpload> { it.isFeatured }.thenByDescending { it.createdAtMillis }))
            }

    fun observeSaved(uid: String, onUploads: (List<UserUpload>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("uploads")
            .whereArrayContains("savedBy", uid)
            .limit(100)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                onUploads(snapshot.documents.mapNotNull(::toUserUpload).sortedWith(compareByDescending<UserUpload> { it.isPinned }.thenByDescending { it.createdAtMillis }))
            }

    private fun toUserUpload(document: com.google.firebase.firestore.DocumentSnapshot, includeHidden: Boolean = false): UserUpload? {
        val isHidden = document.getBoolean("oculto") == true || document.getBoolean("hidden") == true
        val reportsCount = (document.getLong("reportsCount") ?: 0L).toInt()
        if (!includeHidden && (isHidden || reportsCount >= 3)) return null
        val driveLinks = document.get("driveLinks") as? List<*>
        val imageUrls = (document.get("images") as? List<*>)?.mapNotNull { it as? String }.orEmpty()
        val fileMeta = document.get("fileMeta") as? Map<*, *>
        val fileName = fileMeta?.get("name") as? String ?: ""
        val mimeType = fileMeta?.get("mimeType") as? String ?: ""
        val type = document.getString("type").orEmpty().lowercase()
        val url = document.getString("driveUrl")
            ?: document.getString("url")
            ?: document.getString("fileUrl")
            ?: document.getString("imageUrl")
            ?: driveLinks?.firstNotNullOfOrNull { it as? String }
            ?: imageUrls.firstOrNull()
            ?: document.getString("desc")?.takeIf(String::isNotBlank)?.let { "" }
            ?: return null
        val uploadedBy = document.get("uploadedBy") as? Map<*, *>
        val createdAt = document.getTimestamp("createdAt")?.toDate()?.time
            ?: document.getLong("timestamp") ?: 0L
        val explicitlyPdf = type == "pdf" || mimeType.contains("pdf", ignoreCase = true) ||
            fileName.endsWith(".pdf", ignoreCase = true) || url.substringBefore('?').endsWith(".pdf", ignoreCase = true)
        val isFolder = type in setOf("folder", "carpeta", "drive_folder") ||
            mimeType == "application/vnd.google-apps.folder" ||
            Regex("/folders/|[?&]resourcekey=.*folder|folderview|embeddedfolderview", RegexOption.IGNORE_CASE).containsMatchIn(url) ||
            document.getString("title")?.contains("carpeta", ignoreCase = true) == true ||
            document.getString("category")?.contains("carpeta", ignoreCase = true) == true
        val isImage = !explicitlyPdf && !isFolder && (
            imageUrls.isNotEmpty() || type in setOf("imagen", "image", "imagenes", "galeria") ||
                mimeType.startsWith("image", ignoreCase = true) ||
                fileName.substringBefore('?').lowercase().let { it.endsWith(".jpg") || it.endsWith(".jpeg") || it.endsWith(".png") || it.endsWith(".webp") || it.endsWith(".gif") } ||
                url.startsWith("data:image/", ignoreCase = true) ||
                url.substringBefore('?').lowercase().let { it.endsWith(".jpg") || it.endsWith(".jpeg") || it.endsWith(".png") || it.endsWith(".webp") || it.endsWith(".gif") } ||
                (url.contains("firebasestorage.googleapis.com", ignoreCase = true) && document.getString("imageUrl") != null)
            )
        val previews = (imageUrls + listOfNotNull(document.getString("imageUrl"), if (isImage) url else null)).distinct()
        return UserUpload(
            id = document.id,
            title = document.getString("title")?.takeIf(String::isNotBlank) ?: "Material compartido",
            author = document.getString("author")?.takeIf(String::isNotBlank)
                ?: document.getString("authorName")?.takeIf(String::isNotBlank)
                ?: document.getString("ownerName")?.takeIf(String::isNotBlank)
                ?: document.getString("userName")?.takeIf(String::isNotBlank)
                ?: document.getString("user_name")?.takeIf(String::isNotBlank)
                ?: (uploadedBy?.get("name") as? String)?.takeIf(String::isNotBlank)
                ?: (uploadedBy?.get("displayName") as? String)?.takeIf(String::isNotBlank)
                ?: (uploadedBy?.get("author") as? String)?.takeIf(String::isNotBlank)
                ?: "Estudiante RASTRO",
            category = document.getString("categoriaLabel") ?: document.getString("category").orEmpty(),
            description = document.getString("desc") ?: document.getString("description").orEmpty(),
            url = url,
            createdAtMillis = createdAt,
            previewUrls = previews,
            isImage = isImage,
            isPdf = explicitlyPdf,
            isFolder = isFolder,
            ownerUid = document.getString("ownerId") ?: uploadedBy?.get("uid") as? String ?: "",
            ownerPhotoUrl = document.getString("photoURL") ?: uploadedBy?.get("photoURL") as? String,
            reactions = (document.get("reactions") as? Map<*, *>)?.mapNotNull { (emoji, users) ->
                val key = emoji as? String ?: return@mapNotNull null
                key to ((users as? List<*>)?.mapNotNull { it as? String } ?: emptyList())
            }?.toMap().orEmpty(),
            isPinned = document.getBoolean("fijado") == true,
            isFeatured = document.getBoolean("destacado") == true,
            savedBy = (document.get("savedBy") as? List<*>)?.mapNotNull { it as? String }.orEmpty(),
            reportedBy = (document.get("reportedBy") as? List<*>)?.mapNotNull { it as? String }.orEmpty(),
            isHidden = isHidden,
            reportsCount = reportsCount
        )
    }

    fun observeComments(uploadId: String, onComments: (List<UploadComment>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("publicacion_comentarios")
            .whereEqualTo("postId", uploadId)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                onComments(snapshot.documents.map { doc ->
                    UploadComment(
                        id = doc.id,
                        authorName = doc.getString("authorName") ?: "Estudiante",
                        text = doc.getString("text").orEmpty(),
                        timestamp = doc.getTimestamp("createdAt")?.toDate()?.time ?: doc.getLong("timestamp") ?: 0L,
                        authorUid = doc.getString("authorUid").orEmpty(),
                        postId = doc.getString("postId") ?: uploadId,
                        postAuthorUid = doc.getString("postAuthorUid") ?: doc.getString("profileUid").orEmpty()
                    )
                }.sortedBy { it.timestamp })
            }

    fun toggleReaction(upload: UserUpload, emoji: String, uid: String, userName: String) {
        if (uid.isBlank()) return
        val ref = FirebaseFirestore.getInstance().collection("uploads").document(upload.id)
        ref.get().addOnSuccessListener { snapshot ->
            val reactions = mutableMapOf<String, List<String>>()
            (snapshot.get("reactions") as? Map<*, *>)?.forEach { (key, value) ->
                val name = key as? String ?: return@forEach
                reactions[name] = (value as? List<*>)?.mapNotNull { it as? String } ?: emptyList()
            }
            val users = reactions[emoji]?.toMutableList() ?: mutableListOf()
            val alreadyReacted = uid in users
            if (uid in users) users.remove(uid) else users.add(uid)
            reactions[emoji] = users
            ref.set(mapOf("reactions" to reactions), SetOptions.merge()).addOnSuccessListener {
                if (!alreadyReacted && upload.ownerUid.isNotBlank() && upload.ownerUid != uid) {
                    FirebaseFirestore.getInstance().collection("notificaciones").add(mapOf(
                        "recipientUid" to upload.ownerUid, "senderUid" to uid, "senderName" to userName,
                        "type" to "reaction", "postId" to upload.id, "profileUid" to upload.ownerUid,
                        "postTitle" to upload.title, "message" to "reaccionó $emoji a tu publicación", "read" to false,
                        "createdAt" to FieldValue.serverTimestamp(), "timestamp" to System.currentTimeMillis()
                    ))
                }
            }
        }
    }

    fun togglePinned(uploadId: String, pinned: Boolean) {
        FirebaseFirestore.getInstance().collection("uploads").document(uploadId)
            .set(mapOf("fijado" to pinned, "fijadoAt" to if (pinned) FieldValue.serverTimestamp() else null), SetOptions.merge())
    }

    fun toggleFeatured(uploadId: String, featured: Boolean, uid: String) {
        FirebaseFirestore.getInstance().collection("uploads").document(uploadId)
            .set(mapOf("destacado" to featured, "destacadoAt" to if (featured) FieldValue.serverTimestamp() else null,
                "destacadoBy" to if (featured) uid else null), SetOptions.merge())
    }

    fun toggleSaved(uploadId: String, uid: String, saved: Boolean) {
        if (uid.isBlank()) return
        val value = if (saved) FieldValue.arrayUnion(uid) else FieldValue.arrayRemove(uid)
        val docRef = FirebaseFirestore.getInstance().collection("uploads").document(uploadId)
        docRef.update("savedBy", value).addOnFailureListener {
            docRef.set(mapOf("savedBy" to value), SetOptions.merge())
        }
    }

    fun report(uploadId: String, uid: String) {
        if (uid.isBlank()) return
        FirebaseFirestore.getInstance().collection("uploads").document(uploadId).get().addOnSuccessListener { snapshot ->
            val reporters = (snapshot.get("reportedBy") as? List<*>)?.mapNotNull { it as? String }.orEmpty()
            if (uid in reporters) return@addOnSuccessListener
            snapshot.reference.update("reportsCount", FieldValue.increment(1), "reportedBy", FieldValue.arrayUnion(uid))
        }
    }

    fun addComment(upload: UserUpload, uid: String, name: String, text: String) {
        if (uid.isBlank() || text.isBlank()) return
        FirebaseFirestore.getInstance().collection("publicacion_comentarios").add(mapOf(
            "postId" to upload.id,
            "postAuthorUid" to upload.ownerUid,
            "profileUid" to upload.ownerUid,
            "authorUid" to uid,
            "authorName" to name,
            "text" to text.trim(),
            "reactions" to emptyMap<String, List<String>>(),
            "createdAt" to FieldValue.serverTimestamp(),
            "timestamp" to System.currentTimeMillis()
        )).addOnSuccessListener {
            if (upload.ownerUid.isNotBlank() && upload.ownerUid != uid) {
                FirebaseFirestore.getInstance().collection("notificaciones").add(mapOf(
                    "recipientUid" to upload.ownerUid, "senderUid" to uid, "senderName" to name,
                    "type" to "comment", "postId" to upload.id, "profileUid" to upload.ownerUid,
                    "postTitle" to upload.title, "message" to "comentó en tu material: ${text.trim().take(160)}",
                    "read" to false, "createdAt" to FieldValue.serverTimestamp(), "timestamp" to System.currentTimeMillis()
                ))
            }
        }
    }

    fun editComment(commentId: String, newText: String, upload: UserUpload, uid: String, name: String) {
        if (commentId.isBlank() || newText.isBlank() || uid.isBlank()) return
        FirebaseFirestore.getInstance().collection("publicacion_comentarios").document(commentId)
            .update(
                "text", newText.trim(),
                "editedAt", FieldValue.serverTimestamp(),
                "isEdited", true
            ).addOnSuccessListener {
                if (upload.ownerUid.isNotBlank() && upload.ownerUid != uid) {
                    FirebaseFirestore.getInstance().collection("notificaciones").add(mapOf(
                        "recipientUid" to upload.ownerUid,
                        "senderUid" to uid,
                        "senderName" to name,
                        "type" to "comment_edit",
                        "postId" to upload.id,
                        "profileUid" to upload.ownerUid,
                        "postTitle" to upload.title,
                        "message" to "editó su comentario en tu publicación: ${newText.trim().take(120)}",
                        "read" to false,
                        "createdAt" to FieldValue.serverTimestamp(),
                        "timestamp" to System.currentTimeMillis()
                    ))
                }
            }
    }

    fun deleteComment(commentId: String, upload: UserUpload, uid: String, name: String) {
        if (commentId.isBlank() || uid.isBlank()) return
        FirebaseFirestore.getInstance().collection("publicacion_comentarios").document(commentId)
            .delete()
            .addOnSuccessListener {
                if (upload.ownerUid.isNotBlank() && upload.ownerUid != uid) {
                    FirebaseFirestore.getInstance().collection("notificaciones").add(mapOf(
                        "recipientUid" to upload.ownerUid,
                        "senderUid" to uid,
                        "senderName" to name,
                        "type" to "comment_delete",
                        "postId" to upload.id,
                        "profileUid" to upload.ownerUid,
                        "postTitle" to upload.title,
                        "message" to "eliminó su comentario en tu publicación \"${upload.title.take(60)}\"",
                        "read" to false,
                        "createdAt" to FieldValue.serverTimestamp(),
                        "timestamp" to System.currentTimeMillis()
                    ))
                }
            }
    }

    fun publishWallPost(context: Context, user: UserData, text: String, photo: Uri?, onComplete: (Result<Unit>) -> Unit) {
        if (!user.isAuthenticated || user.isAnonymous || user.uid.isBlank()) {
            onComplete(Result.failure(IllegalStateException("Inicia sesión para publicar en el muro.")))
            return
        }
        val db = FirebaseFirestore.getInstance()
        val ref = db.collection("uploads").document()
        val title = text.lineSequence().firstOrNull()?.take(100)?.ifBlank { "Publicación de ${user.displayName}" }
            ?: "Publicación de ${user.displayName}"
        fun save(photoUrl: String?) {
            val data = mutableMapOf<String, Any?>(
                "title" to title, "author" to user.displayName, "category" to "Muro & Aportes",
                "categoriaLabel" to "Muro & Aportes", "type" to if (photoUrl == null) "wall_post" else "image",
                "sourceMode" to "wall_post", "url" to (photoUrl ?: ""), "desc" to text.trim(),
                "description" to text.trim(), "ownerId" to user.uid, "ownerName" to user.displayName,
                "uploadedBy" to mapOf("uid" to user.uid, "name" to user.displayName, "photoURL" to user.photoURL),
                "reactions" to emptyMap<String, List<String>>(), "status" to "aprobado", "reportsCount" to 0,
                "oculto" to false, "createdAt" to FieldValue.serverTimestamp(), "timestamp" to System.currentTimeMillis()
            )
            if (photoUrl != null) {
                data["imageUrl"] = photoUrl
                data["images"] = listOf(photoUrl)
                data["fileMeta"] = mapOf("name" to "foto.jpg", "mimeType" to "image/jpeg")
            }
            ref.set(data).addOnSuccessListener { onComplete(Result.success(Unit)) }
                .addOnFailureListener { onComplete(Result.failure(it)) }
        }
        if (photo == null) save(null) else {
            // Keep the object under the community upload path allowed by the existing Storage rules.
            val objectRef = FirebaseStorage.getInstance().reference.child("uploads/${user.uid}_${ref.id}.jpg")
            objectRef.putFile(photo).continueWithTask { task ->
                if (!task.isSuccessful) throw task.exception ?: IllegalStateException("No se pudo subir la foto")
                objectRef.downloadUrl
            }.addOnSuccessListener { uri -> save(uri.toString()) }
                .addOnFailureListener { onComplete(Result.failure(it)) }
        }
    }

    fun publish(user: UserData, title: String, author: String, category: String, url: String, description: String, onComplete: (Result<Unit>) -> Unit) {
        if (user.uid.isBlank()) {
            onComplete(Result.failure(IllegalStateException("Inicia sesión para publicar material.")))
            return
        }
        val db = FirebaseFirestore.getInstance()
        val uploadRef = db.collection("uploads").document()
        val userRef = db.collection("usuarios").document(user.uid)
        val isPdf = url.substringBefore('?').endsWith(".pdf", ignoreCase = true)
        val upload = mapOf(
            "title" to title.trim(),
            "author" to author.trim(),
            "category" to category,
            "categoriaLabel" to category,
            "type" to if (isPdf) "pdf" else "link",
            "sourceMode" to if (url.contains("firebasestorage", ignoreCase = true)) "file" else "link",
            "url" to url.trim(),
            "fileUrl" to url.trim(),
            "driveUrl" to url.trim(),
            "driveLinks" to listOf(url.trim()),
            "desc" to description.trim(),
            "description" to description.trim(),
            "ownerId" to user.uid,
            "ownerName" to user.displayName,
            "uploadedBy" to mapOf("uid" to user.uid, "name" to user.displayName, "photoURL" to user.photoURL),
            "status" to "aprobado",
            "reportsCount" to 0,
            "oculto" to false,
            "createdAt" to FieldValue.serverTimestamp()
        )
        db.runTransaction { transaction ->
            val profile = transaction.get(userRef)
            val nextCount = (profile.getLong("uploadCount") ?: user.uploadCount.toLong()) + 1
            transaction.set(uploadRef, upload)
            transaction.set(userRef, mapOf(
                "uid" to user.uid,
                "email" to user.email,
                "displayName" to user.displayName,
                "photoURL" to user.photoURL,
                "uploadCount" to nextCount,
                "createdAt" to (profile.get("createdAt") ?: FieldValue.serverTimestamp())
            ), SetOptions.merge())
            nextCount
        }.addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    /** Permite al autor editar el título y texto de su publicación */
    fun editUpload(uploadId: String, newTitle: String, newDescription: String, onComplete: (Result<Unit>) -> Unit) {
        if (uploadId.isBlank()) {
            onComplete(Result.failure(IllegalArgumentException("ID de publicación inválido")))
            return
        }
        FirebaseFirestore.getInstance().collection("uploads").document(uploadId)
            .update(
                mapOf(
                    "title" to newTitle.trim(),
                    "desc" to newDescription.trim(),
                    "description" to newDescription.trim(),
                    "editedAt" to FieldValue.serverTimestamp()
                )
            )
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    /** Permite al autor o al administrador borrar definitivamente la publicación */
    fun deleteUpload(uploadId: String, onComplete: (Result<Unit>) -> Unit) {
        if (uploadId.isBlank()) {
            onComplete(Result.failure(IllegalArgumentException("ID de publicación inválido")))
            return
        }
        FirebaseFirestore.getInstance().collection("uploads").document(uploadId)
            .delete()
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    /** Ocultar o desocultar cualquier publicación (Control Maestro Administrador) */
    fun setUploadHidden(uploadId: String, hidden: Boolean, onComplete: (Result<Unit>) -> Unit = {}) {
        if (uploadId.isBlank()) return
        FirebaseFirestore.getInstance().collection("uploads").document(uploadId)
            .update(
                mapOf(
                    "oculto" to hidden,
                    "hidden" to hidden
                )
            )
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    /**
     * Sistema Oficial de Reportes con opciones:
     * - Guarda el reporte en `reportes_ugc` para el Panel Admin
     * - Incrementa `reportsCount` en `uploads/{postId}`
     * - REGLA DE AUTO-MODERACIÓN: Si la publicación acumula 3 reportes y el autor NO es admin,
     *   se oculta automáticamente para todos (`oculto = true`, `hidden = true`) y se marca como REPORTE URGENTE.
     */
    fun reportUpload(
        upload: UserUpload,
        reporter: UserData,
        reason: String,
        details: String,
        onComplete: (Result<Unit>) -> Unit
    ) {
        if (upload.id.isBlank() || reporter.uid.isBlank()) {
            onComplete(Result.failure(IllegalArgumentException("Datos incompletos para reportar")))
            return
        }
        val db = FirebaseFirestore.getInstance()
        val uploadRef = db.collection("uploads").document(upload.id)
        val reportRef = db.collection("reportes_ugc").document()

        db.runTransaction { transaction ->
            val snapshot = transaction.get(uploadRef)
            val currentReports = (snapshot.getLong("reportsCount") ?: 0L).toInt() + 1
            val isAuthorAdmin = AdminConfig.isAdmin(upload.ownerUid)

            val shouldAutoHide = currentReports >= 3 && !isAuthorAdmin
            val updates = mutableMapOf<String, Any>(
                "reportsCount" to currentReports,
                "reportedBy" to FieldValue.arrayUnion(reporter.uid)
            )
            if (shouldAutoHide) {
                updates["oculto"] = true
                updates["hidden"] = true
            }
            transaction.update(uploadRef, updates)

            val reportData = mapOf(
                "id" to reportRef.id,
                "postId" to upload.id,
                "postTitle" to upload.title,
                "postCategory" to upload.category,
                "authorUid" to upload.ownerUid,
                "authorName" to upload.author,
                "reporterUid" to reporter.uid,
                "reporterName" to reporter.displayName,
                "reason" to reason,
                "details" to details.trim(),
                "urgent" to shouldAutoHide,
                "resolved" to false,
                "timestamp" to System.currentTimeMillis(),
                "createdAt" to FieldValue.serverTimestamp()
            )
            transaction.set(reportRef, reportData)

            if (shouldAutoHide) {
                // Notificación de alta prioridad para administradores
                val notifRef = db.collection("notificaciones").document()
                transaction.set(notifRef, mapOf(
                    "recipientUid" to "ADMIN_BROADCAST",
                    "senderUid" to reporter.uid,
                    "senderName" to reporter.displayName,
                    "type" to "urgent_report",
                    "postId" to upload.id,
                    "postTitle" to upload.title,
                    "message" to "🚨 REPORTE URGENTE: '${upload.title.take(50)}' acumuló 3 reportes y fue oculta automáticamente para revisión.",
                    "read" to false,
                    "createdAt" to FieldValue.serverTimestamp(),
                    "timestamp" to System.currentTimeMillis()
                ))
            }
        }.addOnSuccessListener { onComplete(Result.success(Unit)) }
         .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun reportComment(
        commentId: String,
        commentText: String,
        authorUid: String,
        authorName: String,
        postId: String,
        postTitle: String,
        reporterUid: String,
        reporterName: String,
        reason: String,
        details: String,
        onComplete: (Result<Unit>) -> Unit
    ) {
        if (commentId.isBlank() || reporterUid.isBlank()) {
            onComplete(Result.failure(IllegalArgumentException("Datos incompletos para reportar comentario")))
            return
        }
        val db = FirebaseFirestore.getInstance()
        val reportRef = db.collection("reportes_ugc").document()
        val reportData = mapOf(
            "id" to reportRef.id,
            "type" to "comment",
            "commentId" to commentId,
            "commentText" to commentText,
            "postId" to postId,
            "postTitle" to postTitle,
            "authorUid" to authorUid,
            "authorName" to authorName,
            "reporterUid" to reporterUid,
            "reporterName" to reporterName,
            "reason" to reason,
            "details" to details,
            "timestamp" to System.currentTimeMillis(),
            "resolved" to false
        )
        reportRef.set(reportData)
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun reportComment(
        comment: UploadComment,
        upload: UserUpload,
        reporter: UserData,
        reason: String,
        details: String,
        onComplete: (Result<Unit>) -> Unit
    ) {
        reportComment(
            commentId = comment.id,
            commentText = comment.text,
            authorUid = comment.authorUid,
            authorName = comment.authorName,
            postId = upload.id,
            postTitle = upload.title,
            reporterUid = reporter.uid,
            reporterName = reporter.displayName,
            reason = reason,
            details = details,
            onComplete = onComplete
        )
    }

    fun reportUser(
        targetUid: String,
        targetName: String,
        reporter: UserData,
        reason: String,
        details: String,
        onComplete: (Result<Unit>) -> Unit
    ) {
        if (targetUid.isBlank() || reporter.uid.isBlank()) {
            onComplete(Result.failure(IllegalArgumentException("Datos incompletos para reportar usuario")))
            return
        }
        val db = FirebaseFirestore.getInstance()
        val reportRef = db.collection("reportes_ugc").document()
        val reportData = mapOf(
            "id" to reportRef.id,
            "type" to "user",
            "targetUid" to targetUid,
            "targetName" to targetName,
            "reporterUid" to reporter.uid,
            "reporterName" to reporter.displayName,
            "reason" to reason,
            "details" to details,
            "timestamp" to System.currentTimeMillis(),
            "resolved" to false
        )
        reportRef.set(reportData)
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    /** Observa en tiempo real los reportes de contenido pendientes para el Panel Admin */
    fun observeReports(onReports: (List<UgcReport>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("reportes_ugc")
            .limit(100)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                val reports = snapshot.documents.mapNotNull { doc ->
                    if (doc.getBoolean("resolved") == true) return@mapNotNull null
                    UgcReport(
                        id = doc.id,
                        postId = doc.getString("postId").orEmpty(),
                        postTitle = doc.getString("postTitle").orEmpty(),
                        postCategory = doc.getString("postCategory").orEmpty(),
                        authorUid = doc.getString("authorUid").orEmpty(),
                        authorName = doc.getString("authorName").orEmpty(),
                        reporterUid = doc.getString("reporterUid").orEmpty(),
                        reporterName = doc.getString("reporterName").orEmpty(),
                        reason = doc.getString("reason").orEmpty(),
                        details = doc.getString("details").orEmpty(),
                        timestamp = doc.getLong("timestamp") ?: 0L,
                        urgent = doc.getBoolean("urgent") == true,
                        resolved = doc.getBoolean("resolved") == true
                    )
                }.sortedWith(compareByDescending<UgcReport> { it.urgent }.thenByDescending { it.timestamp })
                onReports(reports)
            }

    /** Resuelve o descarta un reporte de contenido */
    fun resolveReport(reportId: String, onComplete: (Result<Unit>) -> Unit = {}) {
        if (reportId.isBlank()) return
        FirebaseFirestore.getInstance().collection("reportes_ugc").document(reportId)
            .update("resolved", true)
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    /** Observa TODAS las publicaciones para el Panel Admin (incluyendo las ocultas y reportadas) */
    fun observeAllUploadsForAdmin(onUploads: (List<UserUpload>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("uploads")
            .limit(150)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                val list = snapshot.documents.mapNotNull { toUserUpload(it, includeHidden = true) }
                    .sortedWith(compareByDescending<UserUpload> { it.reportsCount }.thenByDescending { it.createdAtMillis })
                onUploads(list)
            }
}
