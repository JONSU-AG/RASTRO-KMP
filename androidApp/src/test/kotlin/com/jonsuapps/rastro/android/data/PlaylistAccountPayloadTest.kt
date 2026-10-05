package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.data.CoursePlaylist
import org.junit.Assert.*
import org.junit.Test

class PlaylistAccountPayloadTest {
    private val playlist = CoursePlaylist("local-list", "Física", "Canal", "Física", "PLtest", 50, "Mías")
    private val video = CustomVideoItem("item-1", "Vectores", "jNQXAC9IVRw")

    @Test fun newListIsPrivateAndBelongsToAuthenticatedAccount() {
        val data = playlistAccountPayload("account-A", playlist, false, emptyList())
        assertEquals("account-A", data["ownerUid"])
        assertEquals("local-list", data["localId"])
        assertEquals(false, data["isShared"])
        assertEquals(false, data["isHidden"])
    }

    @Test fun editingSharedPlaylistKeepsItsVisibilityChoice() {
        val data = playlistAccountPayload("account-A", playlist, false, emptyList())
        val remote = data.toMutableMap().apply { put("isShared", true) }
        playlistEditFields(data).forEach { remote[it] = data.getValue(it) }
        assertEquals(true, remote["isShared"])
        assertTrue(playlistEditFields(data).contains("title"))
    }

    @Test fun ordinaryPlaylistDoesNotUploadCachedYoutubeQueue() {
        val data = playlistAccountPayload("account-A", playlist, false, listOf(video))
        assertEquals(emptyList<Any>(), data["videos"])
        assertEquals(50, data["videoCount"])
    }

    @Test fun customCollectionPreservesOriginalTitlesAndItemIdentity() {
        val data = playlistAccountPayload("account-A", playlist, true, listOf(video))
        val saved = (data["videos"] as List<*>).single() as Map<*, *>
        assertEquals("Vectores", saved["title"])
        assertEquals("item-1", saved["id"])
        assertEquals("jNQXAC9IVRw", saved["urlOrId"])
    }
}
