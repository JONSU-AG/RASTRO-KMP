package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldPath
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Source
import com.jonsuapps.rastro.android.util.awaitResult
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.model.UserData
import java.text.Normalizer
import java.util.Locale

/** One directory for moderation and manual Pro. Reads only on entry/explicit refresh. */
object AdminUserDirectory {
    private var cachedOwner: String? = null
    private var cachedAt = 0L
    private var cached = emptyList<UserData>()

    suspend fun load(force: Boolean = false): List<UserData> {
        val auth = FirebaseAuth.getInstance()
        val admin = auth.currentUser ?: error("Inicia sesión como administrador.")
        check(AdminConfig.isAdmin(admin.email)) { "Solo Admin puede consultar este directorio." }
        if (!force && cachedOwner == admin.uid && System.currentTimeMillis() - cachedAt < 300_000) return cached
        val result = mutableListOf<UserData>()
        val base = FirebaseFirestore.getInstance().collection("usuarios")
            .orderBy(FieldPath.documentId()).limit(100)
        var cursor: com.google.firebase.firestore.DocumentSnapshot? = null
        do {
            check(auth.currentUser?.uid == admin.uid) { "La sesión cambió; vuelve a abrir Admin." }
            val page = (cursor?.let { base.startAfter(it) } ?: base).get(Source.SERVER).awaitResult()
            result += page.documents.map { fromProfile(it.id, it.data.orEmpty()) }
            cursor = page.documents.lastOrNull()
        } while (page.size() == 100)
        check(auth.currentUser?.uid == admin.uid) { "La sesión cambió; vuelve a abrir Admin." }
        cachedOwner = admin.uid
        cachedAt = System.currentTimeMillis()
        cached = result
        return result
    }

    internal fun fromProfile(uid: String, fields: Map<String, Any?>): UserData {
        fun text(vararg keys: String) = keys.firstNotNullOfOrNull { (fields[it] as? String)?.trim()?.takeIf(String::isNotBlank) }
        return UserData(uid = uid, email = text("email", "correo"),
            displayName = text("displayName", "username", "name", "nombre") ?: "Estudiante",
            photoURL = text("photoURL", "photoUrl"), targetCareer = text("targetCareer") ?: "",
            targetUniversity = text("targetUniversity") ?: "", isAlly = fields["isAlly"] == true,
            hasWarning = fields["hasWarning"] == true, warningMessage = text("warningMessage") ?: "",
            banned = fields["banned"] == true)
    }

    private fun normalize(text: String) = Normalizer.normalize(text.trim(), Normalizer.Form.NFD)
        .replace(Regex("\\p{M}+"), "").lowercase(Locale.ROOT)

    fun matches(user: UserData, query: String): Boolean {
        val term = normalize(query)
        return listOf(user.uid, user.email.orEmpty(), user.displayName, user.targetCareer)
            .any { normalize(it).contains(term) }
    }

    internal fun missingIdentity(fields: Map<String, Any?>, email: String?, displayName: String?): Map<String, Any> = buildMap {
        if (!email.isNullOrBlank() && fields["email"] != email) put("email", email)
        if (listOf("displayName", "username", "name", "nombre").none { (fields[it] as? String)?.isNotBlank() == true }) {
            put("displayName", displayName?.takeIf(String::isNotBlank) ?: email?.substringBefore('@')?.takeIf(String::isNotBlank) ?: "Estudiante")
        }
    }
}
