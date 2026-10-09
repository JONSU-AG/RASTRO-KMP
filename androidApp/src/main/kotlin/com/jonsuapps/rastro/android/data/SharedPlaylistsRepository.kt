package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.jonsuapps.rastro.data.CoursePlaylist
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.tasks.await

data class SharedPlaylist(val playlist: CoursePlaylist, val ownerUid: String,
    val videos: List<CustomVideoItem>, val custom: Boolean)

/** Public visibility is an explicit choice, independent of private account synchronization. */
object SharedPlaylistsRepository {
    private val collection get() = FirebaseFirestore.getInstance().collection("rastro_yt_playlists")
    private val rows = MutableStateFlow<List<SharedPlaylist>>(emptyList())
    val community = rows.asStateFlow()
    private val own = MutableStateFlow<Set<String>>(emptySet())
    val sharedIds = own.asStateFlow()
    private val status = MutableStateFlow<String?>(null)
    val message = status.asStateFlow()
    private val pageLimit = MutableStateFlow(20L)
    val loadedLimit = pageLimit.asStateFlow()
    private var generation = 0
    private var cursor: com.google.firebase.firestore.DocumentSnapshot? = null
    private var loading = false
    fun loadMore() = fetch(FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }?.uid, true)
    fun start(uid: String?, limit: Long = 20, clear: Boolean = true) {
        generation++
        loading = false
        cursor = null
        pageLimit.value = 20
        if (clear) { rows.value = emptyList(); own.value = emptySet() }
        fetch(uid, false)
    }
    private fun fetch(uid: String?, append: Boolean) {
        if (loading || (append && cursor == null)) return
        loading = true
        status.value = null
        val request = generation
        var query = collection.whereEqualTo("isShared", true).whereEqualTo("isHidden", false).limit(20)
        if (append) cursor?.let { query = query.startAfter(it) }
        query.get().addOnSuccessListener { snapshot ->
            if (request != generation) return@addOnSuccessListener
            loading = false
            cursor = if (snapshot.size() == 20) snapshot.documents.lastOrNull() else null
            val received = snapshot.documents.mapNotNull { doc ->
                    val d = doc.data ?: return@mapNotNull null
                    val id = d["localId"] as? String ?: return@mapNotNull null
                    val owner = d["ownerUid"] as? String ?: return@mapNotNull null
                    val videos = (d["videos"] as? List<*>)?.mapNotNull { value ->
                        val v = value as? Map<*, *> ?: return@mapNotNull null
                        val video = v["urlOrId"] as? String ?: return@mapNotNull null
                        CustomVideoItem(video, v["title"] as? String ?: "Clase", video)
                    }.orEmpty()
                    SharedPlaylist(CoursePlaylist(id, d["title"] as? String ?: "Playlist",
                        d["channelTitle"] as? String ?: "Playlist de YouTube", d["subject"] as? String ?: "General",
                        d["playlistId"] as? String ?: "", (d["videoCount"] as? Number)?.toInt() ?: 0,
                        "Comunidad", description = d["description"] as? String ?: ""), owner, videos,
                        d["isCustomList"] == true)
            }
            rows.value = (if (append) rows.value + received else received).distinctBy { it.ownerUid + ":" + it.playlist.id }
            pageLimit.value = if (cursor != null) rows.value.size.toLong() else Long.MAX_VALUE
        }.addOnFailureListener {
            if (request == generation) { loading = false; status.value = "No pudimos actualizar Comunidad. Tu copia anterior se conserva." }
        }
        if (!append && uid != null && FirebaseAuth.getInstance().currentUser?.let { !it.isAnonymous && it.uid == uid } == true) {
            collection.whereEqualTo("ownerUid", uid).whereEqualTo("isShared", true).whereEqualTo("isHidden", false)
                .limit(100).get().addOnSuccessListener { snapshot ->
                    if (request == generation && FirebaseAuth.getInstance().currentUser?.uid == uid)
                        own.value = snapshot.documents.mapNotNull { it.getString("localId") }.toSet()
                }
        }
    }
    fun stop() { generation++; loading = false; cursor = null; rows.value = emptyList(); own.value = emptySet() }
    suspend fun setShared(playlist: CoursePlaylist, shared: Boolean) {
        val user = FirebaseAuth.getInstance().currentUser
        require(user != null && !user.isAnonymous) { "Inicia sesión para compartir tus playlists." }
        require(UserPlaylistsRepository.playlists.any { it.id == playlist.id }) { "Solo puedes compartir tus propias listas." }
        val ref = collection.document("${user.uid}_${playlist.id}")
        if (!shared) {
            ref.update("isShared", false).await()
            if (FirebaseAuth.getInstance().currentUser?.uid == user.uid) {
                own.value = own.value - playlist.id
                rows.value = rows.value.filterNot { it.ownerUid == user.uid && it.playlist.id == playlist.id }
            }
            return
        }
        // The private playlist is already created by savePlaylist/migration. Change visibility only.
        ref.update("isShared", true).await()
        if (FirebaseAuth.getInstance().currentUser?.uid == user.uid) own.value = own.value + playlist.id
    }
}
