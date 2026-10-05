package com.jonsuapps.rastro.android.navigation

import android.net.Uri
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

object RastroAppLinks {
    private val pending = MutableStateFlow<String?>(null)
    val route = pending.asStateFlow()
    fun profileUrl(uid: String, publicationId: String? = null): String =
        Uri.Builder().scheme("https").authority("rumbo-jonsu.web.app")
            .appendPath("usuario").appendPath(uid).apply {
                if (!publicationId.isNullOrBlank()) appendQueryParameter("pubId", publicationId)
            }.build().toString()

    fun accept(uri: Uri?) {
        uri?.toString()?.let(::routeFromUrl)?.let { pending.value = it }
    }

    const val ACTION_LEARN = "com.jonsuapps.rastro.action.LEARN"
    const val ACTION_CONTRIBUTE = "com.jonsuapps.rastro.action.CONTRIBUTE"

    internal fun routeFromShortcut(action: String?): String? = when (action) {
        ACTION_LEARN -> "aprender"
        ACTION_CONTRIBUTE -> "biblioteca/aportes"
        else -> null
    }

    fun acceptShortcut(action: String?) {
        routeFromShortcut(action)?.let { pending.value = it }
    }

    internal fun routeFromUrl(url: String): String? = runCatching {
        val uri = java.net.URI(url)
        if (uri.scheme != "https" || uri.host != "rumbo-jonsu.web.app" || uri.userInfo != null ||
            (uri.port != -1 && uri.port != 443)) return@runCatching null
        val path = if (uri.rawFragment?.startsWith("/usuario/") == true)
            java.net.URI("https://rumbo-jonsu.web.app${uri.rawFragment}") else uri
        val parts = path.rawPath.orEmpty().trimStart('/').split('/')
        if (parts.size != 2 || parts[0] != "usuario") return@runCatching null
        fun decode(value: String) = java.net.URLDecoder.decode(value, "UTF-8")
        fun encode(value: String) = java.net.URLEncoder.encode(value, "UTF-8").replace("+", "%20")
        val uid = decode(parts[1])
        if (uid.isBlank()) return@runCatching null
        val pub = path.rawQuery?.split('&')?.firstOrNull { it.substringBefore('=') == "pubId" }
            ?.substringAfter('=', "")?.let(::decode)?.takeIf { it.isNotBlank() }
        "usuario/${encode(uid)}" + if (pub == null) "" else "?pubId=${encode(pub)}"
    }.getOrNull()

    fun consume() { pending.value = null }
}
