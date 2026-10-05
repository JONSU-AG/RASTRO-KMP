package com.jonsuapps.rastro.android.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.contentOrNull
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

/** Public YouTube oEmbed metadata only; no scraping, media extraction, or API credential required. */
object YouTubeVideoTitles {
    private val cache = LinkedHashMap<String, Pair<Long,String>>()
    internal fun missing(title: String): Boolean = title.isBlank() || title.matches(Regex("Clase(?: \\d+)?", RegexOption.IGNORE_CASE)) || title == "Video de la clase"
    internal fun parse(payload: String): String? = runCatching {
        Json.parseToJsonElement(payload).jsonObject["title"]?.jsonPrimitive?.contentOrNull?.trim()?.takeIf { it.isNotBlank() }
    }.getOrNull()
    suspend fun resolve(videos: List<CustomVideoItem>, onTitle: (String,String) -> Unit) = coroutineScope {
        videos.filter { missing(it.title) }.distinctBy { it.urlOrId }.chunked(4).forEach { group ->
            group.map { video -> async(Dispatchers.IO) {
                val id = UserPlaylistsRepository.extractPlaylistId(video.urlOrId)
                id to fetch(id)
            } }.awaitAll().forEach { (id,title) -> if(title != null) onTitle(id,title) }
        }
    }
    private fun fetch(id: String): String? {
        if (!id.matches(Regex("[A-Za-z0-9_-]{11}"))) return null
        synchronized(cache) { cache[id]?.takeIf { System.currentTimeMillis()-it.first < 24*60*60*1000L }?.let { return it.second } }
        val title = runCatching {
            val watch = URLEncoder.encode("https://www.youtube.com/watch?v=$id", "UTF-8")
            val connection = URL("https://www.youtube.com/oembed?url=$watch&format=json").openConnection() as HttpURLConnection
            connection.connectTimeout=5000; connection.readTimeout=5000
            try { if(connection.responseCode == 200) parse(connection.inputStream.bufferedReader().use { it.readText() }) else null }
            finally { connection.disconnect() }
        }.getOrNull()
        if(title != null) synchronized(cache) {
            cache[id] = System.currentTimeMillis() to title
            if(cache.size>500) cache.remove(cache.keys.first())
        }
        return title
    }
}
