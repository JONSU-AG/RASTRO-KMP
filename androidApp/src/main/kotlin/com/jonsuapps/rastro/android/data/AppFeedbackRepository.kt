package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldPath
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.Source
import kotlinx.coroutines.tasks.await

internal object AppFeedbackInput {
    const val MAX_LENGTH = 2000
    fun valid(kind: String, message: String) = kind in listOf("error", "suggestion") &&
        message.trim().length in 5..MAX_LENGTH
}

internal data class AppFeedback(
    val id: String, val kind: String, val message: String, val sender: String,
    val sentAt: Long, val resolved: Boolean
)
internal data class AppFeedbackPage(val messages: List<AppFeedback>, val cursor: DocumentSnapshot?, val hasMore: Boolean)

/** Existing private reports inbox: users create; only the authorized Admin reads/updates. */
internal object AppFeedbackRepository {
    private val reports get() = FirebaseFirestore.getInstance().collection("reportes")
    suspend fun send(id: String, kind: String, message: String, name: String) {
        require(AppFeedbackInput.valid(kind,message)) { "Escribe entre 5 y 2000 caracteres." }
        val user = FirebaseAuth.getInstance().currentUser ?: error("Inicia sesión para enviar tu mensaje.")
        reports.document(id).set(mapOf(
            "targetType" to "app_feedback", "reporterUid" to user.uid,
            "reporterName" to name.ifBlank { user.displayName ?: "Estudiante" }.take(100),
            "kind" to kind, "message" to message.trim(), "resolved" to false,
            "createdAt" to FieldValue.serverTimestamp()
        )).await()
    }
    suspend fun page(cursor: DocumentSnapshot?): AppFeedbackPage {
        // Time-prefixed IDs give bounded chronological paging without a new composite index.
        var query = reports.whereEqualTo("targetType","app_feedback")
            .orderBy(FieldPath.documentId(),Query.Direction.DESCENDING).limit(21)
        if (cursor != null) query = query.startAfter(cursor)
        val documents = query.get(Source.SERVER).await().documents
        val visible = documents.take(20)
        return AppFeedbackPage(visible.filter { it.getBoolean("deleted") != true }.map { document -> AppFeedback(
            document.id,document.getString("kind").orEmpty(),document.getString("message").orEmpty(),
            document.getString("reporterName") ?: "Estudiante",document.getTimestamp("createdAt")?.toDate()?.time ?: 0L,
            document.getBoolean("resolved") == true
        ) },visible.lastOrNull(),documents.size > 20)
    }
    suspend fun resolve(id: String) { reports.document(id).update("resolved",true).await() }
    suspend fun delete(id: String) { reports.document(id).delete().await() }
}
