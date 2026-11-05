package com.jonsuapps.rastro.android.ui.components

import android.annotation.SuppressLint
import android.webkit.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.*
import androidx.compose.ui.unit.Velocity
import kotlinx.coroutines.launch
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*

private const val MATH_ROOT = "https://appassets.androidplatform.net/assets/scientific-math/"

/** A local, read-only typesetter. No external fonts, network requests, cookies or arbitrary HTML. */
@SuppressLint("SetJavaScriptEnabled", "JavascriptInterface")
@Composable
internal fun ScientificMath(
    expressions: List<String>, color: Color, modifier: Modifier = Modifier, fontSize: Float = 19f,
    richText: String? = null, onClick: (() -> Unit)? = null, tables: List<AcademicTable> = emptyList(), theoryStyle: Boolean = false
) {
    val scale = LocalDensity.current.fontScale
    val scrollDispatcher=remember {NestedScrollDispatcher()}
    val scrollConnection=remember {object:NestedScrollConnection{}}
    val scrollScope=rememberCoroutineScope()
    val sources = remember(expressions) { expressions.filter(String::isNotBlank).distinct() }
    val ink = academicInk(com.jonsuapps.rastro.theme.ThemeManager.currentTheme.isDark)
    val payload = remember(sources, color, scale, fontSize, richText, tables, theoryStyle, ink) {
        buildJsonObject {
            put("expressions", JsonArray(sources.map(::JsonPrimitive)))
            put("color", "#%06X".format(color.toArgb() and 0xFFFFFF))
            put("fontSize", fontSize * scale)
            put("theoryStyle", theoryStyle)
            if (theoryStyle) {
                put("conceptColor", "#%06X".format(ink.concept.toArgb() and 0xFFFFFF))
                put("secondaryColor", "#%06X".format(ink.secondary.toArgb() and 0xFFFFFF))
                put("underlineColor", "#%06X".format(ink.underline.toArgb() and 0xFFFFFF))
            }
            richText?.let { put("richText", it) }
            put("tables", JsonArray(tables.map { table -> buildJsonObject {
                put("headers", JsonArray(table.headers.map(::JsonPrimitive)))
                put("rows", JsonArray(table.rows.map { row -> JsonArray(row.map(::JsonPrimitive)) }))
            } }))
        }.toString()
    }
    if (sources.isEmpty() && richText.isNullOrBlank() && tables.isEmpty()) return
    var height by remember(sources, richText, tables) { mutableIntStateOf(76) }
    var failed by remember(sources, richText, tables) { mutableStateOf(false) }
    val reportHeight by rememberUpdatedState<(Int) -> Unit> { value ->
        if (value > 0) height = value.coerceAtLeast(36)
    }
    val reportFailure by rememberUpdatedState { failed = true }
    val tapAction by rememberUpdatedState(onClick)
    if (failed) {
        Column(modifier) {
            richText?.let { Text(it, color = color) }
            tables.forEach { table -> Text((listOf(table.headers) + table.rows).joinToString("\n") { it.joinToString(" · ") }, color = color) }
            sources.forEach { Text(it, color = color) }
            Text("No se pudo cargar la notación matemática.", color = color)
        }
        return
    }
    AndroidView(
        modifier = modifier.fillMaxWidth().height(height.dp).nestedScroll(scrollConnection,scrollDispatcher),
        factory = { context ->
            object : WebView(context) {
                // A theory block is measured at full height; it never owns vertical scrolling.
                override fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
                    super.onScrollChanged(l, t, oldl, oldt)
                    if (t != 0) scrollTo(l, 0)
                }
            }.apply {
                setBackgroundColor(android.graphics.Color.TRANSPARENT)
                settings.apply {
                    javaScriptEnabled = true
                    allowFileAccess = false; allowContentAccess = false
                    domStorageEnabled = false; blockNetworkLoads = true
                    mixedContentMode = WebSettings.MIXED_CONTENT_NEVER_ALLOW
                    setSupportZoom(false); builtInZoomControls = false
                }
                isVerticalScrollBarEnabled = false
                isNestedScrollingEnabled = false
                overScrollMode = android.view.View.OVER_SCROLL_NEVER
                var downX = 0f; var downY = 0f; var lastY=0f
                var velocity:android.view.VelocityTracker?=null
                fun track(event:android.view.MotionEvent) {
                    val raw=android.view.MotionEvent.obtain(event)
                    raw.offsetLocation(event.rawX-event.x,event.rawY-event.y)
                    velocity?.addMovement(raw);raw.recycle()
                }
                var touchAxis=AcademicTouchAxis.UNDECIDED
                var multiplePointers=false
                val slop = android.view.ViewConfiguration.get(context).scaledTouchSlop
                setOnTouchListener { _, event ->
                    when (event.actionMasked) {
                        android.view.MotionEvent.ACTION_DOWN -> {
                            downX=event.rawX;downY=event.rawY;lastY=event.rawY;touchAxis=AcademicTouchAxis.UNDECIDED;multiplePointers=false
                            velocity?.recycle();velocity=android.view.VelocityTracker.obtain();track(event)
                            // Retain initial events until direction is known, including inside a pager.
                            parent?.requestDisallowInterceptTouchEvent(true)
                        }
                        android.view.MotionEvent.ACTION_POINTER_DOWN -> multiplePointers=true
                        android.view.MotionEvent.ACTION_MOVE -> {
                            if(touchAxis==AcademicTouchAxis.UNDECIDED)touchAxis=academicTouchAxis(event.rawX-downX,event.rawY-downY,slop.toFloat())
                            track(event)
                            if(touchAxis==AcademicTouchAxis.VERTICAL && !multiplePointers) {
                                val delta=Offset(0f,event.rawY-lastY)
                                // WebView does not dispatch native nested scroll itself. Hand the
                                // vertical distance to the actual Compose reader, including over text.
                                val pre=scrollDispatcher.dispatchPreScroll(delta,NestedScrollSource.UserInput)
                                scrollDispatcher.dispatchPostScroll(Offset.Zero,delta-pre,NestedScrollSource.UserInput)
                            }
                            lastY=event.rawY
                            parent?.requestDisallowInterceptTouchEvent(true)
                        }
                        android.view.MotionEvent.ACTION_UP -> {
                            parent?.requestDisallowInterceptTouchEvent(false)
                            if(touchAxis==AcademicTouchAxis.VERTICAL && !multiplePointers) {
                                track(event);velocity?.computeCurrentVelocity(1000)
                                val fling=Velocity(0f,velocity?.yVelocity?:0f)
                                scrollScope.launch {scrollDispatcher.dispatchPostFling(Velocity.Zero,fling)}
                            }
                            velocity?.recycle();velocity=null
                            if(!multiplePointers && touchAxis==AcademicTouchAxis.UNDECIDED &&
                                kotlin.math.abs(event.rawX-downX)<slop && kotlin.math.abs(event.rawY-downY)<slop)tapAction?.invoke()
                        }
                        android.view.MotionEvent.ACTION_CANCEL -> {
                            parent?.requestDisallowInterceptTouchEvent(false)
                            velocity?.recycle();velocity=null
                        }
                    }
                    if (touchAxis == AcademicTouchAxis.VERTICAL) {
                        // Compose AndroidView participates in nested scrolling. Parent interception
                        // alone does not cancel WebView's native scroll; explicitly cancel that child.
                        val cancel = android.view.MotionEvent.obtain(event)
                        cancel.action = android.view.MotionEvent.ACTION_CANCEL
                        onTouchEvent(cancel)
                        cancel.recycle()
                        true
                    } else false
                }
                addJavascriptInterface(object {
                    @JavascriptInterface fun height(value: Int) {
                        post { reportHeight(value) }
                    }
                }, "RastroMathSize")
                webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest) = true
                    override fun shouldInterceptRequest(view: WebView, request: WebResourceRequest): WebResourceResponse {
                        val url = request.url.toString()
                        val relative = url.removePrefix(MATH_ROOT)
                        if (!url.startsWith(MATH_ROOT) || relative.contains("..") ||
                            !Regex("[A-Za-z0-9_./-]+").matches(relative)) return WebResourceResponse("text/plain", "UTF-8", null)
                        return try {
                            val type = when {
                                relative.endsWith(".js") -> "application/javascript"
                                relative.endsWith(".css") -> "text/css"
                                relative.endsWith(".woff2") -> "font/woff2"
                                else -> "text/html"
                            }
                            WebResourceResponse(type, "UTF-8", context.assets.open("scientific-math/$relative"))
                        } catch (_: java.io.IOException) { WebResourceResponse("text/plain", "UTF-8", null) }
                    }
                    override fun onPageFinished(view: WebView, url: String) {
                        if (url == MATH_ROOT + "render.html") {
                            view.tag = true
                            view.evaluateJavascript("window.renderMath(${view.getTag(com.jonsuapps.rastro.R.id.scientific_math_payload)})", null)
                        }
                    }
                    override fun onReceivedError(view: WebView, request: WebResourceRequest, error: WebResourceError) {
                        if (request.isForMainFrame) reportFailure()
                    }
                }
                loadUrl(MATH_ROOT + "render.html")
            }
        },
        update = { view ->
            if (view.getTag(com.jonsuapps.rastro.R.id.scientific_math_payload) != payload) {
                view.setTag(com.jonsuapps.rastro.R.id.scientific_math_payload, payload)
                if (view.tag == true) view.evaluateJavascript("window.renderMath($payload)", null)
            }
        },
        onRelease = { it.removeJavascriptInterface("RastroMathSize"); it.stopLoading(); it.destroy() }
    )
}
