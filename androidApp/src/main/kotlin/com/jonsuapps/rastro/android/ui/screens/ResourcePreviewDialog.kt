package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.theme.RastroPalette

internal fun resourceDialogWidth(window: Float): Float =
    minOf(window * .96f, minOf(560f, (window - 48f).coerceAtLeast(0f)) * .96f * 1.12f)

/** Shared image/PDF-cover viewer for profile and community publications. */
@Composable internal fun ResourcePreviewDialog(bitmap: ImageBitmap, title: String,
    theme: RastroPalette, onDismiss: () -> Unit) {
    Dialog(onDismiss, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        BoxWithConstraints(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            val width = resourceDialogWidth(maxWidth.value).dp
            val ratio = bitmap.width.toFloat() / bitmap.height.coerceAtLeast(1)
            val height = minOf((width - 28.dp) / ratio, (maxHeight * .88f - 100.dp).coerceAtLeast(80.dp))
            Sticker3dCard(Modifier.width(width), containerColor = theme.surface,
                strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel,
                shape = RoundedCornerShape(22.dp)) {
                Column(Modifier.padding(14.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(title, color = theme.textPrimary, maxLines = 1,
                            overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f))
                        TextButton(onClick = onDismiss) { Text("Cerrar", color = theme.accent) }
                    }
                    var scale by remember(bitmap) { mutableFloatStateOf(1f) }
                    var offset by remember(bitmap) { mutableStateOf(Offset.Zero) }
                    val density = LocalDensity.current
                    BoxWithConstraints(Modifier.fillMaxWidth().height(height)
                        .clip(RoundedCornerShape(14.dp)).background(theme.background),
                        contentAlignment = Alignment.Center) {
                        val frameWidth = with(density) { maxWidth.toPx() }
                        val frameHeight = with(density) { maxHeight.toPx() }
                        Box(Modifier.fillMaxSize().pointerInput(bitmap, frameWidth, frameHeight) {
                            detectTransformGestures { centroid, pan, zoom, _ ->
                                val next = (scale * zoom).coerceIn(1f, 5f)
                                val pivot = centroid - Offset(frameWidth / 2, frameHeight / 2)
                                val moved = (offset - pivot) * (next / scale) + pivot + pan
                                offset = Offset(moved.x.coerceIn(-frameWidth * (next - 1) / 2, frameWidth * (next - 1) / 2),
                                    moved.y.coerceIn(-frameHeight * (next - 1) / 2, frameHeight * (next - 1) / 2))
                                scale = next
                            }
                        }) {
                            Image(bitmap, "Vista ampliada de $title", Modifier.fillMaxSize().graphicsLayer {
                                scaleX = scale; scaleY = scale; translationX = offset.x; translationY = offset.y
                            }, contentScale = ContentScale.Fit)
                        }
                    }
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                        TextButton(onClick = { scale = (scale - .5f).coerceAtLeast(1f); offset = Offset.Zero }) { Text("−", color = theme.accent) }
                        TextButton(onClick = { scale = 1f; offset = Offset.Zero }) { Text("Restablecer", color = theme.accent) }
                        TextButton(onClick = { scale = (scale + .5f).coerceAtMost(5f) }) { Text("+", color = theme.accent) }
                    }
                }
            }
        }
    }
}
