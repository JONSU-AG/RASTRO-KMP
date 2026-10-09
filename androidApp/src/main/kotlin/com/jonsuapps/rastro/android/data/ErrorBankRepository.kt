package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.android.RastroApplication
import com.jonsuapps.rastro.model.ExamQuestion
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.json.JSONArray
import org.json.JSONObject

object ErrorBankOrigins {
    const val APRENDER = "Aprender"
    const val SIMULACRO = "Simulacro"
    const val EXAMEN_RAPIDO = "Examen Rápido"
    const val RANKING = "Ranking"
    val all = listOf(APRENDER, SIMULACRO, EXAMEN_RAPIDO, RANKING)
}
data class FailedQuestion(val id: String, val subject: String, val subtema: String,
    val question: String, val options: List<String>, val correctAnswerIndex: Int,
    val explanation: String, val dateAdded: Long = System.currentTimeMillis(),
    val isSolved: Boolean = false, val origin: String = ErrorBankOrigins.APRENDER,
    val selectedAnswerIndex: Int? = null, val imageUrl: String? = null) {
    fun payload(): Map<String, Any?> = mapOf("id" to id, "subject" to subject, "subtema" to subtema,
        "question" to question, "options" to options, "correctAnswerIndex" to correctAnswerIndex,
        "explanation" to explanation, "dateAdded" to dateAdded, "isSolved" to isSolved,
        "origin" to origin, "selectedAnswerIndex" to selectedAnswerIndex, "imageUrl" to imageUrl)
    companion object {
        fun from(data: Map<String, Any?>): FailedQuestion? = runCatching {
            val options = (data["options"] as List<*>).map { it as String }
            val correct = (data["correctAnswerIndex"] as Number).toInt()
            require(correct in options.indices)
            FailedQuestion(data["id"] as String, data["subject"] as? String ?: "", data["subtema"] as? String ?: "",
                data["question"] as String, options, correct, data["explanation"] as? String ?: "",
                (data["dateAdded"] as? Number)?.toLong() ?: 0, data["isSolved"] == true,
                data["origin"] as? String ?: ErrorBankOrigins.APRENDER,
                (data["selectedAnswerIndex"] as? Number)?.toInt()?.takeIf { it in options.indices }, data["imageUrl"] as? String)
        }.getOrNull()
    }
}
internal fun examErrors(questions: List<ExamQuestion>, answers: Map<String, Int>, origin: String): List<FailedQuestion> =
    questions.filter { it.answer in it.options.indices && answers[it.id] != it.answer }.map {
        FailedQuestion("$origin:${it.id}", it.asignatura, it.subtema.ifBlank { it.curso }, it.q, it.options,
            it.answer, it.explanation, origin = origin, selectedAnswerIndex = answers[it.id]?.takeIf { i -> i in it.options.indices }, imageUrl = it.imageUrl)
    }
internal fun mergeError(current: List<FailedQuestion>, next: FailedQuestion): List<FailedQuestion> =
    listOf(next.copy(isSolved = false)) + current.filterNot { it.id == next.id }

internal fun visibleErrors(rows: List<FailedQuestion>, clearedAt: Long): List<FailedQuestion> =
    rows.filter { clearedAt == 0L || it.dateAdded > clearedAt }

internal const val ERROR_RETENTION_MILLIS = 15L * 24 * 60 * 60 * 1000
internal fun retainedErrors(rows: List<FailedQuestion>, now: Long = System.currentTimeMillis()) =
    rows.filter { it.dateAdded > now - ERROR_RETENTION_MILLIS }

/** Only the active account's private documents are observed. Public data is a separate opt-in projection. */
object ErrorBankRepository {
    private val _errors = MutableStateFlow<List<FailedQuestion>>(emptyList())
    val errors = _errors.asStateFlow()
    private val _shared = MutableStateFlow(false)
    val shared = _shared.asStateFlow()
    private val _paused = MutableStateFlow(true)
    val paused = _paused.asStateFlow()
    private val _clearing = MutableStateFlow(false)
    val clearing = _clearing.asStateFlow()
    private var clearedAt = 0L
    private val _message = MutableStateFlow<String?>(null)
    val message = _message.asStateFlow()
    private var initialized = false
    private var uid = "__unbound__"
    private var listener: ListenerRegistration? = null
    private var publicListener: ListenerRegistration? = null
    private val db get() = FirebaseFirestore.getInstance()
    private val prefs get() = RastroApplication.instance.getSharedPreferences("rastro_errors_by_account", 0)
    private fun collection(owner: String) = db.collection("usuarios").document(owner).collection("gamificacion")
    private fun docId(id: String) = "failed_" + java.security.MessageDigest.getInstance("SHA-256")
        .digest(id.toByteArray()).joinToString("") { "%02x".format(it) }
    fun init() {
        val auth = FirebaseAuth.getInstance()
        bindAccount(auth.currentUser?.takeUnless { it.isAnonymous }?.uid.orEmpty())
        pruneExpired()
        if (initialized) return
        initialized = true
        auth.addAuthStateListener { bindAccount(it.currentUser?.takeUnless { user -> user.isAnonymous }?.uid.orEmpty()) }
    }
    private fun bindAccount(owner: String) {
        if (uid == owner) return
        listener?.remove(); publicListener?.remove(); uid = owner
        _shared.value = false; _message.value = null; _clearing.value = false
        _paused.value = prefs.getBoolean("paused:$owner", true)
        clearedAt = prefs.getLong("cleared:$owner", 0L)
        _errors.value = visibleErrors(loadLocal(owner), clearedAt)
        pruneExpired()
        if (owner.isNotBlank() && !prefs.contains(owner)) {
            val bound = owner
            collection(owner).whereEqualTo("recordType", "failed_question").get()
                .addOnSuccessListener { snap ->
                    if (uid == bound) {
                        val remote = snap.documents.mapNotNull { FailedQuestion.from(it.data.orEmpty()) }
                        _errors.value = visibleErrors(_errors.value + remote, clearedAt).distinctBy { it.id }
                        pruneExpired()
                        saveLocal()
                    }
                }
        }
    }
    /** Reuse the existing account profile observation, without another listener. */
    fun applyProfile(owner: String, data: Map<String, Any?>) {
        init()
        if (uid != owner) return
        _shared.value = data["errorsPublic"] == true
        if (!prefs.contains("paused:$owner")) (data["errorSavingPaused"] as? Boolean)?.let { _paused.value = it }
        clearedAt = maxOf(clearedAt, (data["errorsClearedAt"] as? Number)?.toLong() ?: 0L)
        prefs.edit().putBoolean("paused:$owner", _paused.value).putLong("cleared:$owner", clearedAt).apply()
        _errors.value = visibleErrors(_errors.value, clearedAt)
        pruneExpired()
        saveLocal()
    }
    /** Local expiration; deletes are deferred to the existing explicit/weekly cloud backup. */
    private fun pruneExpired() {
        val rows = _errors.value
        val retained = retainedErrors(rows)
        val expired = rows.filterNot { it in retained }
        if (expired.isEmpty()) return
        if (uid.isNotBlank()) {
            val pending = prefs.getStringSet("expired:$uid", emptySet()).orEmpty() + expired.map { it.id }
            prefs.edit().putStringSet("expired:$uid", pending).apply()
        }
        _errors.value = retained
        saveLocal()
    }
    fun syncBackup(callback: (Result<Unit>) -> Unit) {
        init()
        val owner = uid
        if (owner.isBlank()) { callback(Result.success(Unit)); return }
        val profile = db.collection("usuarios").document(owner)
        val rows = _errors.value.toList()
        // Chunks respect Firestore batch limits. Only locally changed rows are sent.
        val dirty = rows.filter { prefs.getLong("uploaded:$owner:${it.id}", 0) != it.dateAdded }
        val expiredIds = prefs.getStringSet("expired:$owner", emptySet()).orEmpty().toSet()
        val cutoff = System.currentTimeMillis() - ERROR_RETENTION_MILLIS
        val cleanup = expiredIds.chunked(100).map { ids ->
            db.runTransaction { transaction ->
                val docs = ids.map { transaction.get(collection(owner).document(docId(it))) }
                docs.filter { it.getString("recordType") == "failed_question" && (it.getLong("dateAdded") ?: 0L) <= cutoff }
                    .forEach { transaction.delete(it.reference) }
            }
        }
        val tasks = dirty.chunked(400).map { chunk ->
            val batch = db.batch()
            chunk.forEach { batch.set(collection(owner).document(docId(it.id)), it.payload() + ("recordType" to "failed_question")) }
            batch.commit()
        } + cleanup + profile.set(mapOf("errorSavingPaused" to _paused.value), SetOptions.merge())
        com.google.android.gms.tasks.Tasks.whenAll(tasks).addOnSuccessListener {
            val edit = prefs.edit()
            val remaining = prefs.getStringSet("expired:$owner", emptySet()).orEmpty() - expiredIds
            edit.putStringSet("expired:$owner", remaining)
            dirty.forEach { edit.putLong("uploaded:$owner:${it.id}", it.dateAdded) }
            edit.apply()
            callback(Result.success(Unit))
        }.addOnFailureListener { callback(Result.failure(it)) }
    }

    private fun loadLocal(owner: String): List<FailedQuestion> = runCatching {
        val array = JSONArray(prefs.getString(owner.ifBlank { "guest" }, "[]"))
        (0 until array.length()).mapNotNull { i ->
            val obj = array.getJSONObject(i)
            val data = obj.keys().asSequence().associateWith { key ->
                val value = obj.opt(key)
                if (value is JSONArray) (0 until value.length()).map { value.getString(it) } else value.takeUnless { it == JSONObject.NULL }
            }
            FailedQuestion.from(data)
        }
    }.getOrDefault(emptyList())
    private fun saveLocal() { prefs.edit().putString(uid.ifBlank { "guest" }, JSONArray(_errors.value.map { JSONObject(it.payload()) }).toString()).apply() }
    fun recordExam(questions: List<ExamQuestion>, answers: Map<String, Int>, origin: String) {
        init()
        if (_paused.value) return
        val captured = examErrors(questions, answers, origin)
        if (captured.isEmpty()) return
        captured.forEach { _errors.value = mergeError(_errors.value, it) }
        saveLocal()
        if (_shared.value) publishCurrent()
    }
    fun addFailedQuestion(question: FailedQuestion) {
        init()
        if (_paused.value) return
        _errors.value = mergeError(_errors.value, question); saveLocal()
        if (_shared.value) publishCurrent()
    }
    fun markAsSolved(id: String) {
        init()
        val next = _errors.value.firstOrNull { it.id == id }?.copy(isSolved = true, dateAdded = System.currentTimeMillis()) ?: return
        _errors.value = _errors.value.map { if (it.id == id) next else it }; saveLocal()
        if (_shared.value) publishCurrent()
    }
    fun setPaused(enabled: Boolean) {
        init()
        val owner = uid
        _paused.value = enabled
        prefs.edit().putBoolean("paused:$owner", enabled).apply()
        _message.value = if (enabled) "Guardado de errores pausado." else "Se guardarán los errores nuevos."

    }

    fun clearAll() {
        init()
        if (_clearing.value) return
        val owner = uid
        val cutoff = maxOf(System.currentTimeMillis(), clearedAt + 1,
            (_errors.value.maxOfOrNull { it.dateAdded } ?: 0L) + 1)
        clearedAt = cutoff
        prefs.edit().putLong("cleared:$owner", cutoff).apply()
        _errors.value = emptyList()
        saveLocal()
        _message.value = "Historial de errores limpio."
        if (owner.isBlank()) return
        _clearing.value = true
        // A persistent cutoff prevents cached/offline documents on another device from reappearing.
        db.collection("usuarios").document(owner).set(mapOf("errorsClearedAt" to cutoff,
            "sharedErrorBank" to emptyList<Map<String, Any?>>()), SetOptions.merge())
            .addOnFailureListener {
                if (uid == owner) { _clearing.value = false; _message.value = "Historial limpio aquí; sincronización pendiente." }
            }
            .addOnSuccessListener {
                collection(owner).whereEqualTo("recordType", "failed_question").get(com.google.firebase.firestore.Source.SERVER)
                    .addOnSuccessListener { snapshot ->
                        val tasks = snapshot.documents.filter { (it.getLong("dateAdded") ?: 0L) <= cutoff }.chunked(100).map { rows ->
                            db.runTransaction { transaction ->
                                // A question answered again during cleanup must survive the old-history deletion.
                                val old = rows.map { transaction.get(it.reference) }.filter {
                                    it.getString("recordType") == "failed_question" && (it.getLong("dateAdded") ?: 0L) <= cutoff
                                }
                                old.forEach { transaction.delete(it.reference) }
                            }
                        }
                        com.google.android.gms.tasks.Tasks.whenAll(tasks).addOnCompleteListener { result ->
                            if (uid == owner) {
                                _clearing.value = false
                                if (!result.isSuccessful) _message.value = "Historial ocultado; limpieza remota pendiente."
                                else if (_shared.value && _errors.value.isNotEmpty()) publishCurrent()
                            }
                        }
                    }.addOnFailureListener {
                        if (uid == owner) { _clearing.value = false; _message.value = "Historial ocultado; limpieza remota pendiente." }
                    }
            }
    }
    fun setShared(enabled: Boolean) {
        init()
        if (uid.isBlank() || FirebaseAuth.getInstance().currentUser?.isAnonymous == true) {
            _message.value = "Inicia sesión para compartir tus errores."; return
        }
        val owner = uid
        db.collection("usuarios").document(owner).set(mapOf("errorsPublic" to enabled,
            "sharedErrorBank" to if (enabled) publicProjection(_errors.value) else FieldValue.delete()), SetOptions.merge())
            .addOnSuccessListener { if (uid == owner) { _shared.value = enabled; _message.value = if (enabled) "Errores publicados." else "Tus errores son privados." } }
            .addOnFailureListener { if (uid == owner) _message.value = "No se cambió la privacidad: ${it.localizedMessage}" }
    }
    private fun publishCurrent() {
        // Update only the projection; cannot re-enable a remotely revoked sharing preference.
        if (uid.isNotBlank()) {
            val profile = db.collection("usuarios").document(uid)
            val rows = _errors.value
            db.runTransaction { transaction ->
                val data = transaction.get(profile)
                if (data.getBoolean("errorsPublic") == true)
                    transaction.update(profile, "sharedErrorBank", publicProjection(visibleErrors(rows, data.getLong("errorsClearedAt") ?: 0L)))
            }.addOnFailureListener { _message.value = "Tus errores se guardaron; publicación pendiente de conexión." }
        }
    }
    internal fun publicProjection(rows: List<FailedQuestion>) = rows.sortedByDescending { it.dateAdded }.take(30).map { it.payload() }
    fun publicQuestions(data: Map<String, Any?>): List<FailedQuestion> {
        if (data["errorsPublic"] != true) return emptyList()
        val rows = (data["sharedErrorBank"] as? List<*>)?.mapNotNull { row ->
            @Suppress("UNCHECKED_CAST")
            (row as? Map<String, Any?>)?.let(FailedQuestion::from)
        }.orEmpty()
        return retainedErrors(visibleErrors(rows, (data["errorsClearedAt"] as? Number)?.toLong() ?: 0L))
    }
}
