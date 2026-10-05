package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

internal enum class RastroWindowClass { COMPACT, MEDIUM, EXPANDED }
internal data class RastroLayoutPolicy(val windowClass: RastroWindowClass, val feedWidth: Float,
    val readerWidth: Float, val columns: Int, val featureWidth: Float, val heroWidth: Float)

/** Window width, not device type/orientation. Shared by feeds and the single learning path. */
internal fun rastroLayoutPolicy(width: Float): RastroLayoutPolicy {
    val available = width.coerceAtLeast(0f)
    val size = when { available < 600f -> RastroWindowClass.COMPACT
        available < 840f -> RastroWindowClass.MEDIUM; else -> RastroWindowClass.EXPANDED }
    val feed = minOf(available, if(size == RastroWindowClass.EXPANDED) 1200f else 680f)
    val columns = if(size == RastroWindowClass.EXPANDED) ((feed - 32f + 16f) / (360f + 16f)).toInt().coerceIn(1,3) else 1
    return RastroLayoutPolicy(size, feed, minOf(available, 640f), columns,
        minOf(available, 720f), minOf(available, 520f))
}

internal val LocalRastroLayout = staticCompositionLocalOf { rastroLayoutPolicy(360f) }

@Composable internal fun RastroAdaptiveViewport(modifier: Modifier = Modifier, reader: Boolean = false,
    content: @Composable (RastroLayoutPolicy) -> Unit) {
    BoxWithConstraints(modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        val policy = rastroLayoutPolicy(maxWidth.value)
        CompositionLocalProvider(LocalRastroLayout provides policy) {
            // Limit BEFORE filling, otherwise fixed parent constraints override widthIn.
            Box(Modifier.widthIn(max = (if(reader) policy.readerWidth else policy.feedWidth).dp).fillMaxSize(),
                contentAlignment = Alignment.TopCenter) { content(policy) }
        }
    }
}

/** Full-span items remain full-span, but their actual content has a readable, centered width. */
@Composable internal fun RastroBoundedBlock(hero: Boolean = false, content: @Composable BoxScope.() -> Unit) {
    Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
        val policy = LocalRastroLayout.current
        Box(Modifier.widthIn(max = (if(hero) policy.heroWidth else policy.featureWidth).dp).fillMaxWidth(), content = content)
    }
}

internal fun rastroPreviewWidth(available: Float, ratio: Float, size: RastroWindowClass): Float =
    (if(size == RastroWindowClass.COMPACT) available else minOf(available, 360f * ratio.coerceAtLeast(.01f))) *
        (if (ratio < .9f) .8f else 1f)

/** Tall publications stay proportional; full image remains available in the existing viewer. */
@Composable internal fun RastroMediaFrame(ratio: Float, modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit) {
    BoxWithConstraints(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        val width = rastroPreviewWidth(maxWidth.value, ratio, LocalRastroLayout.current.windowClass)
        Box(Modifier.width(width.dp).aspectRatio(ratio).then(modifier),
            contentAlignment = Alignment.Center, content = content)
    }
}
