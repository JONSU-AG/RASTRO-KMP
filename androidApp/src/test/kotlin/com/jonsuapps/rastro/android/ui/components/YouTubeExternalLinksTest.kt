package com.jonsuapps.rastro.android.ui.components

import org.junit.Assert.*
import org.junit.Test

class YouTubeExternalLinksTest {
    @Test fun opensVideoPlaylistAndCreatorLinksWithoutChangingTheirTarget() {
        listOf("https://www.youtube.com/watch?v=jNQXAC9IVRw&t=12", "https://m.youtube.com/playlist?list=PLexample",
            "https://youtu.be/jNQXAC9IVRw", "https://www.youtube.com/@creator", "https://www.youtube.com/shorts/jNQXAC9IVRw")
            .forEach { assertEquals(it, externalYouTubeUrl(it)) }
    }
    @Test fun leavesPlayerFramesAndApiRequestsInsideTheWebView() {
        listOf("https://www.youtube.com/embed/jNQXAC9IVRw", "https://www.youtube.com/iframe_api",
            "https://www.youtube.com/youtubei/v1/player", "https://www.youtube-nocookie.com/embed/jNQXAC9IVRw")
            .forEach { assertNull(externalYouTubeUrl(it)) }
    }
    @Test fun rejectsSpoofedHostsAndNonWebSchemes() {
        listOf("https://youtube.com.evil.test/watch?v=x", "https://notyoutube.com/watch?v=x", "javascript:alert(1)",
            "intent://watch?v=x", "https://youtube.com@evil.test/watch?v=x", "not a url")
            .forEach { assertNull(externalYouTubeUrl(it)) }
    }
}
