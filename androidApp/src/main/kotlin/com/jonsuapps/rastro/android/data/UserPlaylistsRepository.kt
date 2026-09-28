package com.jonsuapps.rastro.android.data

import android.content.Context
import android.net.Uri
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
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

    fun init(context: Context) {
        if (initialized) return
        initialized = true
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
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

        fetchPlaylistItemsFromYouTubeApi(cleanId).ifEmpty {
            fetchPlaylistItemsFromRss(cleanId)
        }
    }

    /**
     * The official Data API paginates all playlist items (up to 50 per request).
     * A blank key intentionally falls back to RSS, which only exposes the latest 15 items.
     */
    private fun fetchPlaylistItemsFromYouTubeApi(cleanId: String): List<CustomVideoItem> {
        val key = BuildConfig.YOUTUBE_DATA_API_KEY.trim()
        if (key.isBlank()) return emptyList()

        return runCatching {
            val items = mutableListOf<CustomVideoItem>()
            var pageToken: String? = null
            do {
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
                val response = connection.inputStream.bufferedReader().use { it.readText() }
                val payload = JSONObject(response)
                val pageItems = payload.optJSONArray("items") ?: JSONArray()
                for (index in 0 until pageItems.length()) {
                    val item = pageItems.optJSONObject(index) ?: continue
                    val snippet = item.optJSONObject("snippet")
                    val videoId = item.optJSONObject("contentDetails")?.optString("videoId").orEmpty()
                        .ifBlank { snippet?.optJSONObject("resourceId")?.optString("videoId").orEmpty() }
                    if (videoId.isNotBlank()) {
                        items += CustomVideoItem(
                            id = videoId,
                            title = snippet?.optString("title").orEmpty().ifBlank { "Clase ${items.size + 1}" },
                            urlOrId = videoId
                        )
                    }
                }
                pageToken = payload.optString("nextPageToken").takeIf { it.isNotBlank() }
            } while (pageToken != null)
            items
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
    }

    fun deletePlaylist(context: Context, id: String) {
        playlists.removeAll { it.id == id }
        customVideosMap.remove(id)
        isCustomListMap.remove(id)
        save(context)
    }

    private fun save(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
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
