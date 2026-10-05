package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.android.ui.components.PlaylistQueueParser
import org.junit.Assert.*
import org.junit.Test

class YouTubePlaylistPagesTest {
    private fun videos(start: Int, size: Int) = (start until start + size).map {
        val id = "v" + it.toString().padStart(10, '0')
        CustomVideoItem(id, "Video $it", id)
    }
    @Test fun readsEveryPageBeyondFifteenAndFiftyInOriginalOrder() {
        val requested = mutableListOf<String?>()
        val result = YouTubePlaylistPages.readAll { token ->
            requested += token
            if (token == null) YouTubePlaylistPage(videos(0, 50), "second")
            else YouTubePlaylistPage(videos(50, 23), null)
        }
        assertEquals(listOf(null, "second"), requested)
        assertEquals(videos(0, 73), result)
    }
    @Test fun secondPageFailureDoesNotMasqueradeAsCompleteList() {
        try {
            YouTubePlaylistPages.readAll { token ->
                if (token == null) YouTubePlaylistPage(videos(0, 50), "next")
                else error("offline")
            }
            fail("Partial list must not be returned")
        } catch (error: IllegalStateException) { assertEquals("offline", error.message) }
    }
    @Test fun repeatedPageTokenStopsInfiniteRequests() {
        var requests = 0
        try {
            YouTubePlaylistPages.readAll { requests++; YouTubePlaylistPage(emptyList(), "same") }
            fail("Repeated token must fail")
        } catch (_: IllegalStateException) { assertEquals(2, requests) }
    }
    @Test fun iframeQueueKeepsAllFiftyAndRejectsInvalidIdentifiers() {
        val ids = videos(0, 50).map { it.id }
        val queue = PlaylistQueueParser.fromIds(ids + listOf("", "<script>", "bad/identifier"))
        assertEquals(ids, queue.map { it.id })
        assertEquals("", queue.last().title)
    }
}
