package com.jonsuapps.rastro.android.ui.components

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.pm.ActivityInfo
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebResourceRequest
import android.os.Message
import android.widget.FrameLayout
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat

internal fun Context.findActivity(): Activity? = when (this) {
    is Activity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}

/** Reuses the same player/session in a fullscreen window, preserving position and playback. */
internal class RastroYouTubeChromeClient(private val activity: Activity?, private val onFullscreenChanged: (Boolean) -> Unit = {}) : WebChromeClient() {
    private var callback: CustomViewCallback? = null
    private var fullscreen: View? = null
    private var previousOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
    private var fullscreenDialog: android.app.Dialog? = null
    private var originalParent: ViewGroup? = null
    private var originalIndex = 0
    private var originalParams: ViewGroup.LayoutParams? = null

    override fun onCreateWindow(view: WebView, isDialog: Boolean, isUserGesture: Boolean, resultMsg: Message): Boolean {
        if (!isUserGesture) return false
        val popup = WebView(view.context)
        popup.webViewClient = object : WebViewClient() {
            private fun route(url: String): Boolean {
                val opened = openYouTube(view.context, url)
                if (opened) popup.post { popup.destroy() }
                return true
            }
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest) = route(request.url.toString())
            @Suppress("DEPRECATION")
            override fun shouldOverrideUrlLoading(view: WebView, url: String) = route(url)
        }
        (resultMsg.obj as? WebView.WebViewTransport)?.webView = popup
        resultMsg.sendToTarget()
        popup.postDelayed({ runCatching { popup.destroy() } }, 5000)
        return true
    }

    override fun onShowCustomView(view: View, callback: CustomViewCallback) {
        if (fullscreen != null) { callback.onCustomViewHidden(); return }
        if (activity == null) { callback.onCustomViewHidden(); return }
        if (activity.isFinishing || activity.isDestroyed) { callback.onCustomViewHidden(); return }
        showFullscreen(view, callback)
    }

    private fun showFullscreen(view: View, customCallback: CustomViewCallback) {
        val host = activity ?: return
        fullscreen = view
        onFullscreenChanged(true)
        this.callback = customCallback
        previousOrientation = host.requestedOrientation
        originalParent = view.parent as? ViewGroup
        originalIndex = originalParent?.indexOfChild(view) ?: 0
        originalParams = view.layoutParams
        originalParent?.removeView(view)
        // FULL_USER follows the phone's auto-rotate setting, including a user rotation lock.
        host.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_FULL_USER
        fullscreenDialog = android.app.Dialog(host, android.R.style.Theme_Black_NoTitleBar_Fullscreen).apply {
            val root = FrameLayout(host).apply {
                setBackgroundColor(android.graphics.Color.BLACK)
                addView(view, FrameLayout.LayoutParams(-1, -1, android.view.Gravity.CENTER))
            }
            setContentView(root)
            setOnCancelListener { exitFullscreen() }
            show()
            window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            window?.let { WindowCompat.getInsetsController(it, root).apply {
                systemBarsBehavior = androidx.core.view.WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                hide(WindowInsetsCompat.Type.systemBars())
            } }
        }
    }

    override fun onHideCustomView() { exitFullscreen() }

    fun exitFullscreen() {
        val host = activity ?: return
        if (fullscreen == null) return
        val view = fullscreen ?: return
        val savedCallback = callback
        callback = null
        fullscreen = null
        (view.parent as? ViewGroup)?.removeView(view)
        originalParent?.addView(view, originalIndex.coerceAtMost(originalParent?.childCount ?: 0), originalParams)
        originalParent = null
        originalParams = null
        fullscreenDialog?.dismiss()
        fullscreenDialog = null
        host.requestedOrientation = previousOrientation
        savedCallback?.onCustomViewHidden()
        onFullscreenChanged(false)
    }
}
