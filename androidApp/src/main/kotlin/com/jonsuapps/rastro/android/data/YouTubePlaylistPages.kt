package com.jonsuapps.rastro.android.data

internal data class YouTubePlaylistPage(val videos: List<CustomVideoItem>, val nextPageToken: String?)

/** Exhaust all official pages. A failed page must not silently return a partial playlist. */
internal object YouTubePlaylistPages {
    fun readAll(fetchPage: (String?) -> YouTubePlaylistPage): List<CustomVideoItem> {
        val videos = mutableListOf<CustomVideoItem>()
        val tokens = mutableSetOf<String>()
        var token: String? = null
        do {
            val page = fetchPage(token)
            videos += page.videos
            token = page.nextPageToken?.takeIf { it.isNotBlank() }
            if (token != null) check(tokens.add(token)) { "YouTube repitió una página; vuelve a intentarlo." }
        } while (token != null)
        return videos
    }
}
