package com.jonsuapps.rastro.android.ui.components
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.onAccent

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.CartoonFinish
import kotlinx.coroutines.channels.Channel
import kotlin.math.sin

/** Visual receipts only: never awards XP or writes progress. */
object XpDelivery {
    internal val receipts = Channel<Int>(Channel.UNLIMITED)
    fun show(amount: Int) { if (amount > 0) receipts.trySend(amount) }
}

data class LearningLeague(val title: String, val fromLevel: Int)
val learningLeagues = com.jonsuapps.rastro.model.LeagueCatalog.all.map { LearningLeague(it.title, it.fromLevel) }
fun learningLeague(level: Int) = learningLeagues.last { level >= it.fromLevel }

@Composable
fun LearningProgressHud(onStreak: () -> Unit, onTricks: () -> Unit, onTarget: (Offset) -> Unit) {
    val theme = ThemeManager.currentTheme
    val progress by GamificationManager.state.collectAsState()
    val hearts by GamificationManager.hearts.collectAsState()
    val proActive by com.jonsuapps.rastro.monetization.ProAccess.isActive.collectAsState()
    var showLeagues by remember { mutableStateOf(false) }
    var showCoins by remember { mutableStateOf(false) }
    var showLives by remember { mutableStateOf(false) }
    val maxHearts by GamificationManager.maxHearts.collectAsState()
    val recoveryAmount by GamificationManager.recoveryAmount.collectAsState()
    val recoveryUnit by GamificationManager.recoveryUnit.collectAsState()
    val measurer = rememberTextMeasurer()
    val density = LocalDensity.current
    Box(Modifier.fillMaxWidth().background(theme.background), contentAlignment = Alignment.Center) {
        BoxWithConstraints(Modifier.widthIn(max = 720.dp).fillMaxWidth().padding(horizontal = 10.dp, vertical = 5.dp)) {
            val availableWidth = maxWidth
            val labels = listOf("${progress.streak}d", "Nv.${progress.level}", if(proActive && !com.jonsuapps.rastro.monetization.PresentationMode.enabled) "∞" else "$hearts", "${progress.coins}")
            val subtitles = listOf("Racha", "${progress.xp} XP", "Vidas", "Monedas")
            fun textWidth(text: String) = with(density) {
                measurer.measure(text, TextStyle(fontSize = 11.sp, fontWeight = FontWeight.Black), softWrap = false).size.width.toDp()
            }
            val minimums = labels.indices.map { i ->
                maxOf(48.dp, textWidth(labels[i]) + 29.dp, textWidth(subtitles[i]) + 12.dp)
            }
            val lineHeight = with(density) {
                measurer.measure("Ag", TextStyle(fontSize = 11.sp, lineHeight = 14.sp, fontWeight = FontWeight.Black)).size.height.toDp()
            }
            // Same two-line face and shared height, including the space reserved for the XP bar.
            val cardHeight = maxOf(48.dp, lineHeight * 2 + 16.dp)
            val gap = 5.dp
            // Very large accessibility fonts can use two rows rather than break words or shrink type.
            val rows = if (minimums.fold(0.dp) { a, v -> a + v } + gap * 3 <= availableWidth)
                listOf(listOf(0, 1, 2, 3)) else listOf(listOf(0, 1), listOf(2, 3))
            Column(verticalArrangement = Arrangement.spacedBy(gap)) {
                rows.forEach { indices ->
                    val extra = (availableWidth - gap * (indices.size - 1) - indices.fold(0.dp) { a, i -> a + minimums[i] }).coerceAtLeast(0.dp)
                    val totalWeight = indices.fold(0) { total, i -> total + if (i == 1) 2 else 1 }
                    Row(horizontalArrangement = Arrangement.spacedBy(gap), verticalAlignment = Alignment.CenterVertically) {
                        indices.forEach { i ->
                            val width = minimums[i] + extra * ((if (i == 1) 2f else 1f) / totalWeight)
                            val modifier = Modifier.width(width).then(if (i == 1)
                                Modifier.onGloballyPositioned { onTarget(it.boundsInRoot().center) } else Modifier)
                            HudPill(labels[i],
                                listOf(Icons.Rounded.LocalFireDepartment, Icons.Rounded.AutoAwesome, Icons.Rounded.Favorite, Icons.Rounded.Paid)[i],
                                modifier, when(i) { 0 -> onStreak; 1 -> { { showLeagues = true } }; 2 -> { { showLives = true } }; else -> { { showCoins = true } } },
                                subtitle = subtitles[i].ifBlank { null },
                                tint = if (i == 0 || i == 2) CartoonFinish.coral(theme) else CartoonFinish.gold(theme),
                                progress = if (i == 1) progress.levelProgressFraction else null,
                                cardHeight = cardHeight)
                        }
                    }
                }
            }
        }
    }
    if (showCoins) CoinAndLivesDialog { showCoins = false }
    if (showLives) {
        if(proActive && !com.jonsuapps.rastro.monetization.PresentationMode.enabled) RastroProDialog { showLives = false }
        else CoinAndLivesDialog { showLives = false }
    }
    if (showLeagues) Dialog(onDismissRequest = { showLeagues = false }) {
        Sticker3dCard(containerColor = theme.surface, strokeColor = theme.strokeBorder,
            bevelColor = theme.cardBevel, shape = RoundedCornerShape(24.dp)) {
            Column(Modifier.fillMaxWidth().heightIn(max = 600.dp).verticalScroll(rememberScrollState()).padding(22.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)) {
                Text("Tus ligas", fontSize = 25.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
                Text("${learningLeague(progress.level).title} · Nivel ${progress.level}", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                Text("${progress.xp} XP acumulada · ${progress.nextLevelRequiredXp - progress.currentLevelProgress} XP para el siguiente nivel",
                    color = theme.textSecondary)
                androidx.compose.material3.LinearProgressIndicator(progress = { progress.levelProgressFraction },
                    modifier = Modifier.fillMaxWidth(), color = theme.accentText, trackColor = theme.surfaceAccent)
                learningLeagues.forEach { league ->
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(league.title, color = theme.textPrimary, fontWeight = FontWeight.Bold)
                        Text("Nv. ${league.fromLevel}+", color = theme.textSecondary)
                    }
                }
                Text("Aprender y los simulacros comparten tu XP y tus ligas.", color = theme.textSecondary)
                Sticker3dButton(onClick = { showLeagues = false }, modifier = Modifier.fillMaxWidth(),
                    containerColor = theme.accent, bottomBevelColor = theme.accentBevel) {
                    Text("ENTENDIDO", color = contrastingText(theme.accent), fontWeight = FontWeight.Black)
                }
            }
        }
    }
}

@Composable private fun HudPill(label: String, icon: androidx.compose.ui.graphics.vector.ImageVector,
    modifier: Modifier, onClick: () -> Unit, subtitle: String? = null,
    tint: Color = ThemeManager.currentTheme.accent, progress: Float? = null,
    cardHeight: androidx.compose.ui.unit.Dp) {
    val theme = ThemeManager.currentTheme
    Sticker3dButton(onClick = onClick, modifier = modifier.height(cardHeight),
        containerColor = theme.surface, bottomBevelColor = theme.cardBevel,
        strokeColor = CartoonFinish.ink(theme), shape = RoundedCornerShape(14.dp), bevelHeight = CartoonFinish.compactDepth,
        contentPadding = PaddingValues(horizontal = 6.dp, vertical = 4.dp)) {
        Box(Modifier.fillMaxSize()) {
            Column(Modifier.align(Alignment.Center).fillMaxWidth().padding(bottom = 3.dp),
                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(1.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(3.dp)) {
                    Icon(icon, null, tint = tint, modifier = Modifier.size(14.dp))
                    Text(label, color = theme.textPrimary, fontSize = 11.sp, lineHeight = 14.sp, fontWeight = FontWeight.Black,
                        maxLines = 1, softWrap = false, overflow = TextOverflow.Ellipsis)
                }
                subtitle?.let { Text(it, color = theme.textSecondary, fontSize = 10.sp, lineHeight = 12.sp, fontWeight = FontWeight.Medium,
                    maxLines = 1, softWrap = false, overflow = TextOverflow.Ellipsis) }
            }
            progress?.let {
                androidx.compose.material3.LinearProgressIndicator(progress = { it.coerceIn(0f, 1f) },
                    modifier = Modifier.align(Alignment.BottomCenter).fillMaxWidth().height(3.dp), color = tint,
                    trackColor = tint.copy(alpha = .18f), gapSize = 0.dp, drawStopIndicator = {})
            }
        }
    }
}

/** XP sparkles (not coins) and a numeric receipt travel to the measured level badge. */
@Composable fun XpDeliveryOverlay(target: Offset?, modifier: Modifier = Modifier) {
    val progress = remember { Animatable(1f) }
    var amount by remember { mutableIntStateOf(0) }
    val paint = remember { android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
        typeface = android.graphics.Typeface.create("sans-serif", android.graphics.Typeface.BOLD)
        textAlign = android.graphics.Paint.Align.CENTER
    } }
    LaunchedEffect(Unit) {
        for (receipt in XpDelivery.receipts) {
            amount = receipt
            progress.snapTo(0f)
            progress.animateTo(1f, tween(1500))
            amount = 0
        }
    }
    val deliveryTheme = ThemeManager.currentTheme
    Canvas(modifier.fillMaxSize()) {
        if (amount <= 0) return@Canvas
        val end = target ?: Offset(size.width * .5f, 80.dp.toPx())
        val start = Offset(size.width * .5f, size.height * .68f)
        val control = Offset(size.width * .85f, size.height * .3f)
        val t = progress.value
        repeat(9) { index ->
            val p = ((t * 1.25f - index * .025f) / 1.05f).coerceIn(0f, 1f)
            val point = start * ((1 - p) * (1 - p)) + control * (2 * (1 - p) * p) + end * (p * p)
            val spread = (1 - p) * 22.dp.toPx()
            val pos = point + Offset(sin(index * 1.9f) * spread, sin(index * 2.7f) * spread)
            val r = 8.dp.toPx()
            val spark = androidx.compose.ui.graphics.Path().apply {
                moveTo(pos.x, pos.y-r); lineTo(pos.x+r*.3f, pos.y-r*.3f)
                lineTo(pos.x+r, pos.y); lineTo(pos.x+r*.3f, pos.y+r*.3f)
                lineTo(pos.x, pos.y+r); lineTo(pos.x-r*.3f, pos.y+r*.3f)
                lineTo(pos.x-r, pos.y); lineTo(pos.x-r*.3f, pos.y-r*.3f); close()
            }
            drawPath(spark, Color(0xFFFFC83D))
            drawPath(spark, Color(0xFF854D0E), style = Stroke(1.dp.toPx()))
        }
        if (t < .85f) {
            paint.color = deliveryTheme.accentText.toArgb()
            paint.textSize = 25.sp.toPx()
            val point = start * (1 - t) + end * t
            drawContext.canvas.nativeCanvas.drawText("+$amount XP", point.x, point.y - 24.dp.toPx(), paint)
        }
        if (t > .8f) drawCircle(Color(0xFFFFC83D).copy(alpha = (1-t)*4),
            (25 + (t-.8f)*120).dp.toPx(), end, style = Stroke(3.dp.toPx()))
    }
}
