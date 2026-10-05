package com.jonsuapps.rastro.android.data

import org.junit.Assert.*
import org.junit.Test

class YouTubeVideoTitlesTest {
    @Test fun replacesOnlyLegacyPlaceholders() {
        listOf("", "Clase 1", "clase 75", "Video de la clase").forEach { assertTrue(YouTubeVideoTitles.missing(it)) }
        listOf("Vectores (Teoría)", "Clase práctica: energía", "Video 1: Óptica").forEach { assertFalse(YouTubeVideoTitles.missing(it)) }
    }
    @Test fun readsOriginalUnicodeTitleAndRejectsUnavailableMetadata() {
        assertEquals("Vectores: teoría y práctica", YouTubeVideoTitles.parse("""{"title":"Vectores: teoría y práctica","author_name":"Profesor"}"""))
        listOf("{}", "invalid", "{\"title\":null}", "{\"title\":\" \"}").forEach { assertNull(YouTubeVideoTitles.parse(it)) }
    }
}
