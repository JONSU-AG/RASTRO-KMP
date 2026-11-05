package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException
import com.google.firebase.firestore.*
import kotlinx.coroutines.*
import kotlinx.coroutines.tasks.await

/** Spark-compatible cleanup. Authentication is deleted only after data cleanup succeeds. */
object AccountDeletionRepository {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private var running = false
    fun deleteCurrentAccount(context: android.content.Context, onResult: (Result<Unit>) -> Unit) {
        if (running) { onResult(Result.failure(IllegalStateException("La eliminación ya está en curso."))); return }
        val user = FirebaseAuth.getInstance().currentUser
        if (user == null) { onResult(Result.failure(IllegalStateException("Inicia sesión para eliminar tu cuenta."))); return }
        running = true
        scope.launch {
            val result = runCatching {
                val token = user.getIdToken(true).await()
                val authTime = (token.claims["auth_time"] as? Number)?.toLong() ?: 0L
                require(AccountDeletionPlan.hasRecentLogin(authTime, System.currentTimeMillis() / 1000)) {
                    "Vuelve a iniciar sesión para confirmar que la cuenta es tuya e inténtalo de nuevo."
                }
                val db = FirebaseFirestore.getInstance()
                val uid = user.uid
                fun checkAccount() = check(FirebaseAuth.getInstance().currentUser?.uid == uid) { "La sesión cambió. Vuelve a iniciar sesión para continuar." }
                checkAccount()
                val profileData = db.collection("usuarios").document(uid).get(Source.SERVER).await()
                val media = listOfNotNull(profileData.getString("photoURL"), profileData.getString("coverUrl"))
                if (media.any { android.net.Uri.parse(it).host in setOf("drive.google.com", "lh3.googleusercontent.com") && DriveUploadRepository.extractDriveFileId(it) != null }) {
                    withContext(Dispatchers.IO) { DriveUploadRepository.trashGeneratedProfileImages(context, uid) }
                    checkAccount()
                }
                val ticket = db.collection("account_deletions").document(uid)
                if (!ticket.get(Source.SERVER).await().exists()) ticket.set(mapOf("requestedAt" to FieldValue.serverTimestamp())).await()
                suspend fun removeQuery(query: Query, collection: String) {
                    while (true) {
                        checkAccount()
                        val page = query.limit(100).get(Source.SERVER).await()
                        if (page.isEmpty) break
                        if (collection == "uploads") for (post in page.documents) {
                            val comments = db.collection("publicacion_comentarios").whereEqualTo("postId", post.id)
                            while (true) {
                                val children = comments.limit(100).get(Source.SERVER).await()
                                if (children.isEmpty) break
                                checkAccount()
                                db.batch().apply { children.documents.forEach { delete(it.reference) } }.commit().await()
                            }
                        }
                        checkAccount()
                        db.batch().apply { page.documents.forEach { document ->
                            val remaining = (document.get("participants") as? List<*>)?.filterIsInstance<String>().orEmpty().filter { it != uid }
                            if (collection == "racha_dual" && document.getString("type") == "group" && remaining.size >= 2) {
                                val first = document.getString("user1Uid")?.takeIf { it in remaining } ?: remaining.first()
                                val second = document.getString("user2Uid")?.takeIf { it in remaining && it != first } ?: remaining.first { it != first }
                                val changes = mutableMapOf<String, Any>("participants" to remaining, "user1Uid" to first, "user2Uid" to second,
                                    "accepted" to ((document.get("accepted") as? Map<*, *>)?.filterKeys { it != uid } ?: emptyMap<String, Any>()),
                                    "dailyActivity" to ((document.get("dailyActivity") as? Map<*, *>)?.filterKeys { it != uid } ?: emptyMap<String, Any>()))
                                if (document.getString("user1Uid") != first) changes["senderName"] = ""
                                if (document.getString("user2Uid") != second) changes["recipientName"] = ""
                                update(document.reference, changes)
                            } else delete(document.reference)
                        } }.commit().await()
                    }
                }
                for ((collection, field) in AccountDeletionPlan.ownedQueries)
                    removeQuery(db.collection(collection).whereEqualTo(field, uid), collection)
                removeQuery(db.collection("racha_dual").whereArrayContains("participants", uid), "racha_dual")
                for ((collection, field) in AccountDeletionPlan.arrayQueries) {
                    val path = FieldPath.of(*field.split('.').toTypedArray())
                    while (true) {
                        checkAccount()
                        val page = db.collection(collection).whereArrayContains(path, uid).limit(100).get(Source.SERVER).await()
                        if (page.isEmpty) break
                        db.batch().apply { page.documents.forEach { update(it.reference, path, FieldValue.arrayRemove(uid)) } }.commit().await()
                    }
                }
                val profile = db.collection("usuarios").document(uid)
                for (child in AccountDeletionPlan.privateCollections) removeQuery(profile.collection(child), child)
                checkAccount()
                db.collection("rastro_pro").document(uid).delete().await()
                profile.delete().await()
                checkAccount()
                user.delete().await()
                StudyGoalPreferences(context, studyGoalScope(uid, true, false)).clear()
                com.jonsuapps.rastro.android.ui.screens.MaterialReaderStore.clear(context, uid)
                Unit
            }.recoverCatching { error ->
                val message = if (error is FirebaseAuthRecentLoginRequiredException)
                    "Vuelve a iniciar sesión para confirmar que la cuenta es tuya e inténtalo de nuevo."
                else if (error is IllegalArgumentException || error is IllegalStateException) error.message
                else "No se completó la eliminación de datos. Tu acceso se conserva: comprueba la conexión y vuelve a intentarlo."
                throw IllegalStateException(message, error)
            }
            running = false
            onResult(result)
        }
    }
}
