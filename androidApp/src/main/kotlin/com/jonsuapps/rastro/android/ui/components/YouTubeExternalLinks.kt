package com.jonsuapps.rastro.android.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import java.net.URI

/** Only user-facing YouTube destinations; never intercept embedded-player/resource URLs. */
internal fun externalYouTubeUrl(raw: String): String? = runCatching {
    val uri = URI(raw)
    if (uri.scheme !in listOf("https", "http")) return null
    val host = uri.host?.lowercase() ?: return null
    if (host == "youtu.be") return raw
    if (host != "youtube.com" && !host.endsWith(".youtube.com")) return null
    if (uri.path == "/watch" || uri.path == "/playlist" || uri.path.startsWith("/shorts/") ||
        uri.path.startsWith("/channel/") || uri.path.startsWith("/@") || uri.path.startsWith("/user/")) raw else null
}.getOrNull()

internal fun openYouTube(context: Context, url: String): Boolean {
    if (externalYouTubeUrl(url) == null) return false
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    if (context.findActivity() == null) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    return runCatching { context.startActivity(Intent(intent).setPackage("com.google.android.youtube")); true }
        .getOrElse { runCatching { context.startActivity(intent); true }.getOrDefault(false) }
}

internal class YouTubeExternalLinkClient : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean =
        request.isForMainFrame && externalYouTubeUrl(request.url.toString()) != null && openYouTube(view.context, request.url.toString())
    @Suppress("DEPRECATION")
    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean =
        externalYouTubeUrl(url) != null && openYouTube(view.context, url)
}
