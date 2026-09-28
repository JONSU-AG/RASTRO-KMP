package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.Query
import com.jonsuapps.rastro.model.FlashcardItem

object FlashcardRepository {
    fun observeCommunity(onCards: (List<FlashcardItem>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("flashcards")
            .orderBy("createdAt", Query.Direction.DESCENDING)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                onCards(snapshot.documents.mapNotNull { document ->
                    val question = document.getString("q")?.trim()?.takeIf(String::isNotBlank) ?: return@mapNotNull null
                    val answer = document.getString("a")?.trim()?.takeIf(String::isNotBlank) ?: return@mapNotNull null
                    FlashcardItem(
                        id = document.id,
                        q = question,
                        a = answer,
                        subject = document.getString("subject") ?: "General",
                        authorName = document.getString("authorName") ?: "Comunidad RASTRO",
                        authorUid = document.getString("authorUid"),
                        semana = document.getLong("semana")?.toInt(),
                        subtemaCode = document.getString("subtemaCode"),
                        subtemaTitle = document.getString("subtemaTitle"),
                        imageUrl = document.getString("imageUrl")
                    )
                })
            }

    fun create(
        question: String,
        answer: String,
        subject: String,
        semana: Int? = null,
        subtemaCode: String? = null,
        subtemaTitle: String? = null,
        imageUrl: String? = null,
        onComplete: (Result<Unit>) -> Unit
    ) {
        val user = FirebaseAuth.getInstance().currentUser
        val payload = mapOf(
            "q" to question.trim(),
            "a" to answer.trim(),
            "subject" to subject,
            "authorName" to (user?.displayName ?: "Estudiante RASTRO"),
            "authorUid" to user?.uid,
            "semana" to semana,
            "subtemaCode" to subtemaCode,
            "subtemaTitle" to subtemaTitle,
            "imageUrl" to imageUrl?.trim()?.takeIf { it.isNotBlank() },
            "createdAt" to FieldValue.serverTimestamp()
        )
        FirebaseFirestore.getInstance().collection("flashcards").add(payload)
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun update(id: String, question: String, answer: String, subject: String, onComplete: (Result<Unit>) -> Unit) {
        FirebaseFirestore.getInstance().collection("flashcards").document(id)
            .update(mapOf("q" to question.trim(), "a" to answer.trim(), "subject" to subject))
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun delete(id: String, onComplete: (Result<Unit>) -> Unit) {
        FirebaseFirestore.getInstance().collection("flashcards").document(id).delete()
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun report(card: FlashcardItem, reason: String, details: String, onComplete: (Result<Unit>) -> Unit) {
        val user = FirebaseAuth.getInstance().currentUser
        val report = mapOf(
            "targetId" to card.id,
            "targetTitle" to card.q,
            "targetType" to "flashcard",
            "reporterUid" to (user?.uid ?: "anonimo"),
            "reporterEmail" to (user?.email ?: "anonimo"),
            "reason" to reason,
            "reasonLabel" to reason,
            "details" to details.trim(),
            "autoHideApplied" to false,
            "status" to "pendiente",
            "createdAt" to FieldValue.serverTimestamp(),
            "timestamp" to System.currentTimeMillis()
        )
        FirebaseFirestore.getInstance().collection("reportes").add(report)
            .addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }
}
