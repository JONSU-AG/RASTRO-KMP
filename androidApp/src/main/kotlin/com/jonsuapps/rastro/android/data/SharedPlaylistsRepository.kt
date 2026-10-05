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
    private var publicListener: ListenerRegistration? = null
    private var ownListener: ListenerRegistration? = null
    private val pageLimit = MutableStateFlow(100L)
    val loadedLimit = pageLimit.asStateFlow()
    fun loadMore() = start(FirebaseAuth.getInstance().currentUser?.uid, pageLimit.value + 100, false)
    fun start(uid: String?, limit: Long = 100, clear: Boolean = true) {
        if (clear) stop() else { publicListener?.remove(); ownListener?.remove() }
        pageLimit.value = limit
        status.value = null
        publicListener = collection.whereEqualTo("isShared", true).whereEqualTo("isHidden", false)
            .limit(limit).addSnapshotListener { snapshot, error ->
                if (error != null) { status.value = "No pudimos cargar las listas compartidas. Revisa la conexión e inténtalo de nuevo."; return@addSnapshotListener }
                rows.value = snapshot?.documents.orEmpty().mapNotNull { doc ->
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
            }
        if (uid != null) ownListener = collection.whereEqualTo("ownerUid", uid).whereEqualTo("isHidden", false)
            .limit(limit).addSnapshotListener { snapshot, error ->
                if (FirebaseAuth.getInstance().currentUser?.uid != uid) return@addSnapshotListener
                if (error == null) own.value = snapshot?.documents.orEmpty()
                    .filter { it.getBoolean("isShared") == true }.mapNotNull { it.getString("localId") }.toSet()
            }
    }
    fun stop() {
        publicListener?.remove(); ownListener?.remove()
        publicListener = null; ownListener = null
        rows.value = emptyList(); own.value = emptySet()
    }
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
        val videos = if (UserPlaylistsRepository.isCustomListMap[playlist.id] == true)
            UserPlaylistsRepository.customVideosMap[playlist.id].orEmpty() else emptyList()
        require(videos.size <= 200) { "Puedes compartir colecciones de hasta 200 videos." }
        // Existing rules require a private document before opting into public visibility.
        ref.set(mapOf("ownerUid" to user.uid, "localId" to playlist.id, "isShared" to false,
            "isCurated" to false, "isHidden" to false, "title" to playlist.title.take(200),
            "channelTitle" to playlist.channelTitle, "subject" to playlist.subject,
            "playlistId" to playlist.playlistId, "videoCount" to playlist.videoCount,
            "description" to playlist.description.take(2000), "isCustomList" to (videos.isNotEmpty()),
            "videos" to videos.map { mapOf("title" to it.title.take(200), "urlOrId" to it.urlOrId) })).await()
        check(FirebaseAuth.getInstance().currentUser?.uid == user.uid) { "La sesión cambió; vuelve a intentarlo." }
        ref.update("isShared", true).await()
        if (FirebaseAuth.getInstance().currentUser?.uid == user.uid) own.value = own.value + playlist.id
    }
}
