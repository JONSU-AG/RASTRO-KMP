package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.luminance
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.ThemeManager
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.platform.LocalContext
import android.graphics.BitmapFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/** Stable subject IDs, exact filenames from LOGO/BANNER-CURSOS. No visible-label matching. */
internal object CourseBanners {
    val files = mapOf(
        "biologia" to "BIOLOGIA.png",
        "fisica" to "FISICA.png",
        "quimica" to "QUIMICA.png",
        "psicologia" to "PSICOLOGIA.png",
        "literatura" to "LITERATURA.png",
        "lenguaje" to "LENGUAJE.png",
        "ingles" to "INGLES.png",
        "civica" to "CIVICA.png",
        "geografia" to "GEOGRAFIA.png",
        "filosofia" to "FILOSOFIA.png",
        "historia_peru" to "HISTORIA-DEL-PERU.png",
        "historia_universal" to "HISTORIA-UNIVERSAL.png",
        "trigonometria" to "TRIGONOMETRIA.png",
        "geometria" to "GEOMETRIA.png",
        "algebra" to "ALGEBRA.png",
        "raz_verbal" to "RAZ-VERBAL.png",
        "raz_matematico" to "RAZ-MATEMATICO.png",
        "raz_logico" to "RAZ-LOGICO.png",
        "aritmetica" to "ARITMETICA.png",
        "comprension_lectora" to "COMPRENSION-LECTORA.png"
    )
    fun fileName(subjectId: String): String? = files[subjectId]
}

internal data class BannerContrast(val ink: Color, val foreground: Color, val progress: Color,
    val track: Color, val button: Color, val buttonBorder: Color)

internal fun bannerContrast(theme: RastroPalette): BannerContrast {
    val ink = lerp(Color.Black, theme.accent, .09f)
    val track = lerp(ink, theme.surface, .12f)
    var progress = theme.accent
    for(step in 0..20) {
        progress = lerp(theme.accent, Color.White, step / 20f)
        if(bannerRatio(progress, track) >= 3f) break
    }
    return BannerContrast(ink, Color.White, progress, track, ink.copy(alpha = .62f),
        Color.White.copy(alpha = .65f))
}

internal fun bannerRatio(a: Color, b: Color) =
    (maxOf(a.luminance(), b.luminance()) + .05f) / (minOf(a.luminance(), b.luminance()) + .05f)

/** Minimal local protection needed for readable white text, not a fixed dark filter. */
internal fun bannerProtection(background: Color, ink: Color): Float {
    for(step in 0..90) {
        val opacity = step / 100f
        if(bannerRatio(Color.White, ink.copy(alpha = opacity).compositeOver(background)) >= 4.8f) return opacity
    }
    return .9f
}

@Composable internal fun CourseBannerProgress(progress: Float, modifier: Modifier = Modifier) {
    val colors = bannerContrast(ThemeManager.currentTheme)
    LinearProgressIndicator(progress = { progress.coerceIn(0f, 1f) },
        modifier = modifier.height(6.dp).clip(CircleShape).border(.75.dp, colors.buttonBorder, CircleShape),
        color = colors.progress, trackColor = colors.track, strokeCap = StrokeCap.Round,
        gapSize = 0.dp, drawStopIndicator = {})
}

private data class BannerImage(val bitmap: ImageBitmap, val upper: Color, val lower: Color)

/** Transparent on missing/failed assets: the existing subject gradient underneath is the fallback. */
@Composable internal fun CourseBannerSurface(subjectId: String, fallback: Brush,
    content: @Composable BoxScope.() -> Unit) {
    val context = LocalContext.current
    val filename = CourseBanners.fileName(subjectId)
    val colors = bannerContrast(ThemeManager.currentTheme)
    var frame by remember(filename) { mutableStateOf(IntSize.Zero) }
    var loaded by remember(filename, context) { mutableStateOf<BannerImage?>(null) }
    LaunchedEffect(filename, context, frame) {
        loaded = withContext(Dispatchers.IO) {
            filename?.let { file -> runCatching {
                context.assets.open(file).use { input ->
                    BitmapFactory.decodeStream(input)?.let { bitmap ->
                        // Bounds of every RGB channel cover bright details as well as broad light areas.
                        // Scan off the UI thread. The bottom spans all controls; upper-right artwork is excluded.
                        fun bound(left: Int, top: Int, right: Int, bottom: Int): Color {
                            val pixels = IntArray((right-left)*(bottom-top))
                            bitmap.getPixels(pixels, 0, right-left, left, top, right-left, bottom-top)
                            var r=0; var g=0; var b=0
                            for(pixel in pixels) {
                                if(android.graphics.Color.alpha(pixel) < 255) { r=255; g=255; b=255; break }
                                r=maxOf(r, android.graphics.Color.red(pixel)); g=maxOf(g, android.graphics.Color.green(pixel)); b=maxOf(b, android.graphics.Color.blue(pixel))
                            }
                            return Color(r, g, b)
                        }
                        // Match Crop + CenterEnd: narrower/taller layouts shift the source area beneath the text.
                        val scale = if(frame.width > 0 && frame.height > 0)
                            maxOf(frame.width.toFloat()/bitmap.width, frame.height.toFloat()/bitmap.height) else 1f
                        val visibleWidth = if(frame.width > 0) (frame.width/scale).coerceAtMost(bitmap.width.toFloat()) else bitmap.width.toFloat()
                        val visibleHeight = if(frame.height > 0) (frame.height/scale).coerceAtMost(bitmap.height.toFloat()) else bitmap.height.toFloat()
                        val left = (bitmap.width-visibleWidth).toInt().coerceIn(0, bitmap.width-1)
                        val top = ((bitmap.height-visibleHeight)/2).toInt().coerceIn(0, bitmap.height-1)
                        val titleRight = (left+visibleWidth*.7f).toInt().coerceIn(left+1, bitmap.width)
                        val titleBottom = (top+visibleHeight*.65f).toInt().coerceIn(top+1, bitmap.height)
                        val bottomTop = (top+visibleHeight*.55f).toInt().coerceIn(0, bitmap.height-1)
                        val bottom = (top+visibleHeight).toInt().coerceIn(bottomTop+1, bitmap.height)
                        BannerImage(bitmap.asImageBitmap(), bound(left, top, titleRight, titleBottom),
                            bound(left, bottomTop, bitmap.width, bottom))
                    }
                }
            }.getOrNull() }
        }
    }
    BoxWithConstraints(Modifier.fillMaxWidth()) {
        // Keep the full image height on wide screens; narrower layouts may crop the quiet left edge.
        val ratio = loaded?.bitmap?.let { it.width.toFloat() / it.height.coerceAtLeast(1) } ?: 3f
        val minimumHeight = (maxWidth / ratio).coerceAtMost(180.dp)
        Box(Modifier.fillMaxWidth().heightIn(min = minimumHeight).onSizeChanged { frame = it }.background(fallback)) {
            loaded?.bitmap?.let { image ->
                Image(bitmap = image, contentDescription = null, modifier = Modifier.matchParentSize(),
                    contentScale = ContentScale.Crop, alignment = Alignment.CenterEnd)
            }
            val upperAlpha = (bannerProtection(loaded?.upper ?: Color.White, colors.ink) - .06f).coerceAtLeast(0f)
            val lowerAlpha = (bannerProtection(loaded?.lower ?: Color.White, colors.ink) - .24f).coerceAtLeast(0f)
            // Protection remains beneath the text area then smoothly frees the characters on the right.
            Box(Modifier.matchParentSize().graphicsLayer { compositingStrategy = CompositingStrategy.Offscreen }
                .drawWithContent {
                    drawContent()
                    drawRect(Brush.verticalGradient(0f to Color.White, .65f to Color.White, 1f to Color.Transparent),
                        blendMode = BlendMode.DstIn)
                }.background(Brush.horizontalGradient(
                    0f to colors.ink.copy(alpha = upperAlpha), .68f to colors.ink.copy(alpha = upperAlpha),
                    1f to Color.Transparent)))
            Box(Modifier.matchParentSize().background(Brush.verticalGradient(
                0f to Color.Transparent, .55f to Color.Transparent, 1f to colors.ink.copy(alpha = lowerAlpha))))
            content()
        }
    }
}
