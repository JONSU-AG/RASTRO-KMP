package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

/** Same inbox and schema already observed by the Admin panel. */
object AcademicReportRepository {
    fun send(id: String, statement: String, category: String, details: String,
        onComplete: (Result<Unit>) -> Unit) {
        val user = FirebaseAuth.getInstance().currentUser
        if (user == null) {
            onComplete(Result.failure(IllegalStateException("Inicia sesión para enviar el reporte.")))
            return
        }
        FirebaseFirestore.getInstance().collection("reportes_ugc").add(mapOf(
            "postId" to "", "targetId" to id, "targetType" to "pregunta",
            "postTitle" to statement, "postCategory" to category,
            "authorUid" to "", "authorName" to "Contenido académico RASTRO",
            "reporterUid" to user.uid, "reporterName" to (user.displayName ?: "Estudiante"),
            "reason" to "Revisar pregunta académica", "details" to "ID: $id\n$category\n$details",
            "resolved" to false, "urgent" to false,
            "timestamp" to System.currentTimeMillis(), "createdAt" to FieldValue.serverTimestamp()
        )).addOnSuccessListener { onComplete(Result.success(Unit)) }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }
}
