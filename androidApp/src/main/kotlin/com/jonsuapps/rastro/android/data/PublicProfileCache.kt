package com.jonsuapps.rastro.android.data

import android.os.Handler
import android.os.Looper
import com.google.firebase.firestore.FieldPath
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class PublicAuthor(val name: String?, val photo: String?)

/** One cached identity per author, shared by cards; never fan out profile edits to posts. */
object PublicProfileCache {
    private val state = MutableStateFlow<Map<String, PublicAuthor>>(emptyMap())
    val authors = state.asStateFlow()
    private val fetched = mutableMapOf<String, Long>()
    private val pending = mutableSetOf<String>()
    private val inFlight = mutableSetOf<String>()
    private val handler = Handler(Looper.getMainLooper())
    private const val TTL = 15 * 60_000L
    fun update(uid: String, fields: Map<String, Any?>) {
        if (uid.isBlank()) return
        val previous = state.value[uid]
        state.value = state.value + (uid to PublicAuthor(
            if (fields.containsKey("displayName")) fields["displayName"] as? String else previous?.name,
            if (fields.containsKey("photoURL")) fields["photoURL"] as? String else previous?.photo))
        fetched[uid] = System.currentTimeMillis()
    }
    fun request(uid: String) {
        if (uid.isBlank() || uid in inFlight || System.currentTimeMillis() - (fetched[uid] ?: 0) < TTL) return
        if (pending.add(uid) && pending.size == 1) handler.postDelayed({ flush() }, 1000)
    }
    private fun flush() {
        val ids = pending.toList(); pending.clear(); inFlight.addAll(ids)
        ids.chunked(10).forEach { chunk ->
            FirebaseFirestore.getInstance().collection("usuarios").whereIn(FieldPath.documentId(), chunk)
                .get().addOnSuccessListener { result ->
                    chunk.forEach { fetched[it] = System.currentTimeMillis() }
                    result.documents.forEach { update(it.id, it.data.orEmpty()) }
                }.addOnCompleteListener { inFlight.removeAll(chunk.toSet()) }
        }
    }
}
