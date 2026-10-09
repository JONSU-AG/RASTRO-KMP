package com.jonsuapps.rastro.android.data

import android.content.Context
import android.net.Uri
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.FieldValue
import com.jonsuapps.rastro.BuildConfig
import com.jonsuapps.rastro.data.CoursePlaylist
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.util.UUID

data class CustomVideoItem(
    val id: String = UUID.randomUUID().toString(),
    val title: String = "",
    val urlOrId: String = ""
)

object UserPlaylistsRepository {
    private const val PREFS_NAME = "rastro_user_playlists"
    private const val KEY_PLAYLISTS = "custom_playlists"

    val playlists = mutableStateListOf<CoursePlaylist>()
    val customVideosMap = mutableStateMapOf<String, List<CustomVideoItem>>()
    val isCustomListMap = mutableStateMapOf<String, Boolean>()
    private var initialized = false
    private var accountKey = ""
    private var cloudListener: ListenerRegistration? = null
    private var appContext: Context? = null
    val syncError = mutableStateOf<String?>(null)
    val hasMore = mutableStateOf(false)
    private val migrating = mutableSetOf<String>()
    private val cloudLimit = 20L
    private var cursor: com.google.firebase.firestore.DocumentSnapshot? = null
    private var syncGeneration = 0
    private var loading = false
    private val collection get() = FirebaseFirestore.getInstance().collection("rastro_yt_playlists")

    fun stopSync() { syncGeneration++; loading = false; cloudListener?.remove(); cloudListener = null }

    fun loadMore() { startSync(append = true) }

    private fun cloudData(pl: CoursePlaylist): Map<String, Any> = playlistAccountPayload(
        accountKey, pl, isCustomListMap[pl.id] == true, customVideosMap[pl.id].orEmpty()
    ) + mapOf("updatedAt" to FieldValue.serverTimestamp())

    private fun startSync(append: Boolean = false) {
        if (loading || (append && cursor == null)) return
        if (!append) { stopSync(); cursor = null }
        val uid = accountKey
        if (FirebaseAuth.getInstance().currentUser?.let { !it.isAnonymous && it.uid == uid } != true) return
        loading = true
        val request = syncGeneration
        var query = collection.whereEqualTo("ownerUid", uid).whereEqualTo("isHidden", false).limit(cloudLimit)
        if (append) cursor?.let { query = query.startAfter(it) }
        query.get().addOnSuccessListener { snapshot ->
                if (request != syncGeneration || accountKey != uid || FirebaseAuth.getInstance().currentUser?.uid != uid) return@addOnSuccessListener
                loading = false
                cursor = snapshot.documents.lastOrNull()
                syncError.value = null
                hasMore.value = snapshot?.size()?.toLong() == cloudLimit
                snapshot?.documents.orEmpty().forEach { doc ->
                    val id = doc.getString("localId") ?: return@forEach
                    if (doc.getBoolean("isDeleted") == true) {
                        playlists.removeAll { it.id == id }; customVideosMap.remove(id); isCustomListMap.remove(id)
                        return@forEach
                    }
                    val videos = (doc.get("videos") as? List<*>)?.mapNotNull { raw ->
                        val v = raw as? Map<*, *> ?: return@mapNotNull null
                        val url = v["urlOrId"] as? String ?: return@mapNotNull null
                        CustomVideoItem(v["id"] as? String ?: url, v["title"] as? String ?: "", url)
                    }.orEmpty()
                    isCustomListMap[id] = doc.getBoolean("isCustomList") == true
                    customVideosMap[id] = videos
                    val pl = CoursePlaylist(id, doc.getString("title") ?: "Mi Playlist",
                        doc.getString("channelTitle") ?: "Playlist de YouTube", doc.getString("subject") ?: "General",
                        doc.getString("playlistId") ?: "", doc.getLong("videoCount")?.toInt() ?: 0,
                        "Mías", description = doc.getString("description") ?: "")
                    val index = playlists.indexOfFirst { it.id == id }
                    if (index < 0) playlists.add(pl) else playlists[index] = pl
                }
                appContext?.let { save(it) }
            }.addOnFailureListener { if (request == syncGeneration && accountKey == uid) { loading = false; syncError.value = "No se pudieron actualizar tus playlists. La copia local se conserva." } }
    }

    fun init(context: Context) {
        val uid = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }?.uid ?: "guest"
        if (initialized && accountKey == uid) { migrateLocalToCloud(); startSync(); return }
        stopSync()
        appContext = context.applicationContext
        cursor = null
        hasMore.value = false
        syncError.value = null
        migrating.clear()
        initialized = true
        accountKey = uid
        playlists.clear()
        customVideosMap.clear()
        isCustomListMap.clear()
        val legacy = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        // The first account keeps its existing device lists; never migrate them again to another account.
        if (!legacy.contains("migratedOwner")) {
            val old = legacy.getString(KEY_PLAYLISTS, null)
            context.getSharedPreferences("${PREFS_NAME}_$uid", Context.MODE_PRIVATE).edit()
                .putString(KEY_PLAYLISTS, old).apply()
            legacy.edit().putString("migratedOwner", uid).apply()
        }
        val prefs = context.getSharedPreferences("${PREFS_NAME}_$accountKey", Context.MODE_PRIVATE)
        migrating.addAll(prefs.getStringSet("cloudMigrated", emptySet()).orEmpty())
        val jsonStr = prefs.getString(KEY_PLAYLISTS, null)
        if (!jsonStr.isNullOrBlank()) {
            try {
                val array = JSONArray(jsonStr)
                playlists.clear()
                for (i in 0 until array.length()) {
                    val obj = array.getJSONObject(i)
                    val id = obj.optString("id", UUID.randomUUID().toString())
                    val isCustom = obj.optBoolean("isCustomList", false)
                    
                    val videosList = mutableListOf<CustomVideoItem>()
                    val videosArray = obj.optJSONArray("videos")
                    if (videosArray != null) {
                        for (j in 0 until videosArray.length()) {
                            val vObj = videosArray.getJSONObject(j)
                            videosList.add(
                                CustomVideoItem(
                                    id = vObj.optString("id", UUID.randomUUID().toString()),
                                    title = vObj.optString("title", ""),
                                    urlOrId = vObj.optString("urlOrId", "")
                                )
                            )
                        }
                    }

                    isCustomListMap[id] = isCustom
                    customVideosMap[id] = videosList

                    playlists.add(
                        CoursePlaylist(
                            id = id,
                            title = obj.optString("title", "Mi Playlist"),
                            channelTitle = obj.optString("channelTitle", if (isCustom) "Colección de Videos" else "Playlist de YouTube"),
                            subject = obj.optString("subject", "General"),
                            playlistId = obj.optString("playlistId", ""),
                            videoCount = if (isCustom) videosList.size else obj.optInt("videoCount", 0),
                            category = "Mías",
                            isVerified = false,
                            description = obj.optString("description", "")
                        )
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        migrateLocalToCloud()
        startSync()
    }

    private fun migrateLocalToCloud() {
        val uid = accountKey
        if (FirebaseAuth.getInstance().currentUser?.let { !it.isAnonymous && it.uid == uid } != true) return
        playlists.toList().forEach { pl ->
            if (appContext?.getSharedPreferences("${PREFS_NAME}_$uid", Context.MODE_PRIVATE)?.getStringSet("cloudMigrated", emptySet())?.contains(pl.id) == true || !migrating.add(pl.id)) return@forEach
            val payload = cloudData(pl)
            val ref = collection.document("${uid}_${pl.id}")
            // Only seed missing documents: an old device must never replace remote edits or tombstones.
            FirebaseFirestore.getInstance().runTransaction { tx ->
                if (!tx.get(ref).exists()) tx.set(ref, payload)
            }.addOnSuccessListener {
                if (accountKey == uid) {
                    val prefs = appContext?.getSharedPreferences("${PREFS_NAME}_$uid", Context.MODE_PRIVATE)
                    val migrated = prefs?.getStringSet("cloudMigrated", emptySet()).orEmpty() + pl.id
                    prefs?.edit()?.putStringSet("cloudMigrated", migrated)?.apply()
                }
            }.addOnFailureListener {
                if (accountKey == uid) { migrating.remove(pl.id); syncError.value = "Tus listas siguen guardadas aquí; su sincronización está pendiente." }
            }
        }
    }

    fun extractPlaylistId(urlOrId: String): String {
        val text = urlOrId.trim()
        if (text.isBlank()) return ""
        if (text.startsWith("PL") || text.startsWith("UU") || text.startsWith("RD") || text.startsWith("OL")) return text
        
        return runCatching {
            val fullUrl = if (text.startsWith("https://") || text.startsWith("http://")) text else "https://$text"
            val uri = Uri.parse(fullUrl)
            
            val listId = uri.getQueryParameter("list")
            if (!listId.isNullOrBlank()) return@runCatching listId
            
            val videoId = uri.getQueryParameter("v")
            if (!videoId.isNullOrBlank()) return@runCatching videoId
            
            val path = uri.lastPathSegment.orEmpty()
            if (path.length in 10..34) return@runCatching path
            
            text
        }.getOrDefault(text)
    }

    suspend fun fetchYouTubePlaylistVideos(playlistId: String): List<CustomVideoItem> = withContext(
        Dispatchers.IO) {
        val cleanId = extractPlaylistId(playlistId)
        if (cleanId.isBlank()) return@withContext emptyList()
        if (!cleanId.startsWith("PL") && !cleanId.startsWith("UU") && !cleanId.startsWith("RD") && !cleanId.startsWith("OL") && cleanId.length <= 15) {
            return@withContext listOf(CustomVideoItem(id = cleanId, title = "Video de la clase", urlOrId = cleanId))
        }

        // Never label the RSS feed's latest 15 entries as the complete playlist.
        // When Data API is unavailable the screen uses the official IFrame queue instead.
        fetchPlaylistItemsFromYouTubeApi(cleanId)
    }

    /**
     * The official Data API paginates all playlist items (up to 50 per request).
     * A blank/unavailable key delegates to the official IFrame API in the screen.
     */
    private fun fetchPlaylistItemsFromYouTubeApi(cleanId: String): List<CustomVideoItem> {
        val key = BuildConfig.YOUTUBE_DATA_API_KEY.trim()
        if (key.isBlank()) return emptyList()

        return runCatching {
            YouTubePlaylistPages.readAll { pageToken ->
                val url = Uri.Builder()
                    .scheme("https")
                    .authority("www.googleapis.com")
                    .appendPath("youtube")
                    .appendPath("v3")
                    .appendPath("playlistItems")
                    .appendQueryParameter("part", "snippet,contentDetails")
                    .appendQueryParameter("maxResults", "50")
                    .appendQueryParameter("playlistId", cleanId)
                    .appendQueryParameter("key", key)
                    .apply { pageToken?.let { appendQueryParameter("pageToken", it) } }
                    .build()
                    .toString()
                val connection = URL(url).openConnection() as HttpURLConnection
                connection.connectTimeout = 8000
                connection.readTimeout = 8000
                connection.requestMethod = "GET"
                val response = try { connection.inputStream.bufferedReader().use { it.readText() } } finally { connection.disconnect() }
                val payload = JSONObject(response)
                check(!payload.has("error")) { "YouTube no pudo cargar la playlist." }
                val page = payload.getJSONArray("items")
                val videos = (0 until page.length()).mapNotNull { index ->
                    val item = page.getJSONObject(index)
                    val snippet = item.optJSONObject("snippet")
                    val id = item.optJSONObject("contentDetails")?.optString("videoId").orEmpty()
                        .ifBlank { snippet?.optJSONObject("resourceId")?.optString("videoId").orEmpty() }
                    if (id.isBlank()) null else CustomVideoItem(id,
                        snippet?.optString("title").orEmpty().ifBlank { "Clase" }, id)
                }
                YouTubePlaylistPage(videos, payload.optString("nextPageToken"))
            }
        }.getOrDefault(emptyList())
    }

    private fun fetchPlaylistItemsFromRss(cleanId: String): List<CustomVideoItem> {
        return runCatching {
            val url = URL("https://www.youtube.com/feeds/videos.xml?playlist_id=$cleanId")
            val connection = url.openConnection() as HttpURLConnection
            connection.connectTimeout = 8000
            connection.readTimeout = 8000
            connection.requestMethod = "GET"
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; K)")

            val xmlText = connection.inputStream.bufferedReader().use { it.readText() }

            val entryRegex = Regex("<entry>(.*?)</entry>", RegexOption.DOT_MATCHES_ALL)
            val titleRegex = Regex("<title>(.*?)</title>")
            val videoIdRegex = Regex("<yt:videoId>(.*?)</yt:videoId>")

            val items = mutableListOf<CustomVideoItem>()
            entryRegex.findAll(xmlText).forEach { match ->
                val entryXml = match.groupValues[1]
                val vId = videoIdRegex.find(entryXml)?.groupValues?.get(1)?.trim().orEmpty()
                val vTitle = titleRegex.find(entryXml)?.groupValues?.get(1)?.trim().orEmpty()
                    .replace("&amp;", "&")
                    .replace("&quot;", "\"")
                    .replace("&#39;", "'")
                    .replace("&lt;", "<")
                    .replace("&gt;", ">")

                if (vId.isNotBlank()) {
                    items.add(CustomVideoItem(id = vId, title = vTitle.ifBlank { "Clase ${items.size + 1}" }, urlOrId = vId))
                }
            }
            items
        }.getOrDefault(emptyList())
    }

    fun addPlaylist(context: Context, title: String, urlOrId: String, subject: String, description: String) {
        saveUserPlaylist(context, null, title, urlOrId, subject, description, false, emptyList())
    }

    fun saveUserPlaylist(
        context: Context,
        existingId: String?,
        title: String,
        urlOrId: String,
        subject: String,
        description: String,
        isCustomList: Boolean,
        videos: List<CustomVideoItem>
    ) {
        if (FirebaseAuth.getInstance().currentUser?.let { !it.isAnonymous && it.uid == accountKey } != true) {
            syncError.value = "Inicia sesión para crear playlists."
            return
        }
        val playlistId = extractPlaylistId(urlOrId)
        val cleanSubject = subject.trim().ifBlank { "General" }
        val cleanTitle = title.trim().ifBlank {
            if (cleanSubject != "General") "Curso de $cleanSubject" else "Mi Colección de YouTube"
        }
        val id = existingId ?: "user_pl_${UUID.randomUUID()}"

        val newPlaylist = CoursePlaylist(
            id = id,
            title = cleanTitle,
            channelTitle = if (isCustomList) "Colección de Videos (${videos.size})" else "Playlist de YouTube",
            subject = cleanSubject,
            playlistId = playlistId,
            videoCount = if (isCustomList) videos.size else 0,
            category = "Mías",
            isVerified = false,
            description = description.trim()
        )

        isCustomListMap[id] = isCustomList
        customVideosMap[id] = videos

        val idx = playlists.indexOfFirst { it.id == id }
        if (idx >= 0) {
            playlists[idx] = newPlaylist
        } else {
            playlists.add(0, newPlaylist)
        }
        save(context)
        if (FirebaseAuth.getInstance().currentUser?.let { !it.isAnonymous && it.uid == accountKey } == true) {
            val uid = accountKey
            val ref = collection.document("${uid}_$id")
            val payload = cloudData(newPlaylist)
            // Merge preserves the independently selected community visibility.
            ref.set(payload, com.google.firebase.firestore.SetOptions.mergeFields(
                playlistEditFields(payload)
            )).addOnSuccessListener {
                if (accountKey == uid) {
                    val prefs = context.getSharedPreferences("${PREFS_NAME}_$uid", Context.MODE_PRIVATE)
                    prefs.edit().putStringSet("cloudMigrated", prefs.getStringSet("cloudMigrated", emptySet()).orEmpty() + id).apply()
                }
            }.addOnFailureListener {
                if (accountKey == uid) syncError.value = "No se pudo guardar la playlist en tu cuenta. La copia local se conserva."
            }
        }
    }

    fun deletePlaylist(context: Context, id: String) {
        val pl = playlists.firstOrNull { it.id == id }
        if (pl != null && FirebaseAuth.getInstance().currentUser?.let { !it.isAnonymous && it.uid == accountKey } == true) {
            val uid = accountKey
            collection.document("${uid}_$id").set(cloudData(pl) + mapOf("isDeleted" to true),
                com.google.firebase.firestore.SetOptions.merge()).addOnFailureListener {
                if (accountKey == uid) syncError.value = "No se pudo sincronizar la eliminación de esta playlist."
            }
        }
        playlists.removeAll { it.id == id }
        customVideosMap.remove(id)
        isCustomListMap.remove(id)
        save(context)
    }

    private fun save(context: Context) {
        val prefs = context.getSharedPreferences("${PREFS_NAME}_$accountKey", Context.MODE_PRIVATE)
        val array = JSONArray()
        playlists.forEach { pl ->
            val isCustom = isCustomListMap[pl.id] ?: false
            val videos = customVideosMap[pl.id].orEmpty()

            val videosArray = JSONArray()
            videos.forEach { v ->
                videosArray.put(JSONObject().apply {
                    put("id", v.id)
                    put("title", v.title)
                    put("urlOrId", v.urlOrId)
                })
            }

            val obj = JSONObject().apply {
                put("id", pl.id)
                put("title", pl.title)
                put("channelTitle", pl.channelTitle)
                put("subject", pl.subject)
                put("playlistId", pl.playlistId)
                put("videoCount", pl.videoCount)
                put("category", pl.category)
                put("description", pl.description)
                put("isCustomList", isCustom)
                put("videos", videosArray)
            }
            array.put(obj)
        }
        prefs.edit().putString(KEY_PLAYLISTS, array.toString()).apply()
    }
}
