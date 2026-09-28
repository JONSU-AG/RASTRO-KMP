package com.jonsuapps.rastro.utils

/**
 * Utilidad de validación y aislamiento de fuentes de video.
 * Regla de Oro:
 * - Solo se permite la visualización de enlaces públicos directos de YouTube.
 * - Enlaces de Firebase Storage, Google Cloud Storage o archivos binarios MP4 locales
 *   quedan bloqueados visualmente para costo $0 y seguridad absoluta.
 */
object VideoValidation {

    fun isPublicYouTube(url: String?): Boolean {
        if (url.isNullOrBlank()) return false
        val cleanUrl = url.trim().lowercase()
        return cleanUrl.contains("youtube.com/watch") ||
                cleanUrl.contains("youtube.com/playlist") ||
                cleanUrl.contains("youtube.com/embed") ||
                cleanUrl.contains("youtube.com/shorts") ||
                cleanUrl.contains("youtu.be/")
    }

    fun isBlockedSource(url: String?): Boolean {
        if (url.isNullOrBlank()) return false
        val cleanUrl = url.trim().lowercase()
        return cleanUrl.contains("firebasestorage") ||
                cleanUrl.contains("storage.googleapis") ||
                cleanUrl.startsWith("blob:") ||
                cleanUrl.endsWith(".mp4") ||
                cleanUrl.endsWith(".webm") ||
                cleanUrl.endsWith(".mov") ||
                cleanUrl.endsWith(".avi")
    }

    fun extractYouTubeId(url: String?): String? {
        if (url.isNullOrBlank()) return null
        val regex = Regex("^.*(youtu.be/|v/|u/\\w/|embed/|shorts/|watch\\?v=|&v=)([^#&?]*).*")
        val match = regex.find(url)
        val id = match?.groupValues?.getOrNull(2)
        return if (id != null && id.length == 11) id else null
    }

    fun extractPlaylistId(url: String?): String? {
        if (url.isNullOrBlank()) return null
        val clean = url.trim()
        val listParamRegex = Regex("[?&]list=([a-zA-Z0-9_-]+)")
        val match = listParamRegex.find(clean)
        if (match != null && match.groupValues.size > 1) {
            return match.groupValues[1]
        }
        val directPlaylistRegex = Regex("^(PL|OL|UU|RD|FL)[a-zA-Z0-9_-]{10,}$")
        if (directPlaylistRegex.matches(clean)) {
            return clean
        }
        return null
    }
}
