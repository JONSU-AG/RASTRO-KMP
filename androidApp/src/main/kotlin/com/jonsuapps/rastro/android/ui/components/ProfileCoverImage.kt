package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize

data class CoverPlacement(val zoom: Float = 1f, val x: Float = 0f, val y: Float = 0f) {
    fun bounded() = CoverPlacement(
        zoom.takeIf { it.isFinite() }?.coerceIn(1f, 3f) ?: 1f,
        x.takeIf { it.isFinite() }?.coerceIn(-1f, 1f) ?: 0f,
        y.takeIf { it.isFinite() }?.coerceIn(-1f, 1f) ?: 0f)
}

/** Identical crop rendering for the preview, saved profile and Home. No bitmap copies. */
@Composable
fun ProfileCoverImage(url: String?, placement: CoverPlacement, modifier: Modifier = Modifier,
    bitmap: ImageBitmap? = null, onChange: ((CoverPlacement) -> Unit)? = null) {
    val safe = placement.bounded()
    var bounds by remember { mutableStateOf(IntSize.Zero) }
    val current by rememberUpdatedState(safe)
    val change by rememberUpdatedState(onChange)
    val gesture = if (onChange == null) Modifier else Modifier.pointerInput(Unit) {
        detectTransformGestures { _, pan, zoom, _ ->
            val old = current
            change?.invoke(CoverPlacement(old.zoom * zoom,
                old.x + pan.x * 2f / bounds.width.coerceAtLeast(1),
                old.y + pan.y * 2f / bounds.height.coerceAtLeast(1)).bounded())
        }
    }
    Box(modifier.clipToBounds().onSizeChanged { bounds = it }.then(gesture)) {
        val imageModifier = Modifier.fillMaxSize().graphicsLayer {
            scaleX = safe.zoom; scaleY = safe.zoom
            translationX = safe.x * (safe.zoom - 1f) * bounds.width / 2f
            translationY = safe.y * (safe.zoom - 1f) * bounds.height / 2f
        }
        // Positive positions move the image right/down; bias selects the corresponding crop.
        val alignment = BiasAlignment(-safe.x, -safe.y)
        if (bitmap != null) Image(bitmap, "Portada", imageModifier, alignment = alignment, contentScale = ContentScale.Crop)
        else CachedRemoteImage(url, imageModifier, ContentScale.Crop, "Portada", alignment = alignment)
    }
}
