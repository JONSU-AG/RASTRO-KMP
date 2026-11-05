package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Pause
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Replay
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.launch
import java.util.Locale
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin

@Composable
internal fun PhysicsDiagramCard(diagram: PhysicsLearningDiagram) {
    val theme = ThemeManager.currentTheme
    val fraction = remember(diagram) { Animatable(0f) }
    var playing by rememberSaveable(diagram.name) { mutableStateOf(false) }
    var axis by rememberSaveable(diagram.name) { mutableIntStateOf(0) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(playing, diagram) {
        if (playing) {
            if (fraction.value >= .999f) fraction.snapTo(0f)
            fraction.animateTo(1f, tween(((1f - fraction.value) * 5000).toInt().coerceAtLeast(1), easing = LinearEasing))
            playing = false
        }
    }
    val time = fraction.value * 4f
    val readout = when (diagram) {
        PhysicsLearningDiagram.DIMENSIONS -> "Fuerza: [F] = MLT⁻² · Presión: [p] = ML⁻¹T⁻²"
        PhysicsLearningDiagram.MRU -> "t = ${decimal(time)} s · x = ${decimal(PhysicsDiagramMath.position(time, 2f))} m"
        PhysicsLearningDiagram.MRUV -> "t = ${decimal(time)} s · x = ${decimal(PhysicsDiagramMath.position(time, 0f, 2f))} m · v = ${decimal(time * 2)} m/s"
        PhysicsLearningDiagram.PROJECTILE -> "t = ${decimal(fraction.value)} s · x = ${decimal(4 * fraction.value)} m · y = ${decimal(PhysicsDiagramMath.projectileHeight(fraction.value))} m"
        PhysicsLearningDiagram.OHM -> "I = ${decimal(3 * fraction.value)} A · V = ${decimal(PhysicsDiagramMath.voltage(3 * fraction.value))} V"
        PhysicsLearningDiagram.FORCES -> "F − f = 6 − 2 = 4 N · N − P = 0 N"
        PhysicsLearningDiagram.VECTORS -> "A + B = (3, 2) u"
        PhysicsLearningDiagram.COMPONENTS -> "Ax = 3 u · Ay = 2 u"
    }
    Surface(shape = RoundedCornerShape(16.dp), color = theme.surfaceAccent,
        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)) {
        Column(Modifier.fillMaxWidth().padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text(diagram.title, color = theme.textPrimary, fontWeight = FontWeight.Bold)
            Text(diagram.caption, color = theme.textSecondary, fontSize = 12.sp, lineHeight = 17.sp)
            if (diagram == PhysicsLearningDiagram.MRUV) {
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    listOf("x–t", "v–t", "a–t").forEachIndexed { index, label ->
                        FilterChip(selected = axis == index, onClick = { axis = index }, label = { Text(label) })
                    }
                }
            }
            if (diagram == PhysicsLearningDiagram.DIMENSIONS) {
                ScientificMath(listOf("F = ma", "[F]=[m][a]=M\\,(LT^{-2})=MLT^{-2}",
                    "p=\\frac{F}{A}", "[p]=\\frac{[F]}{[A]}=\\frac{MLT^{-2}}{L^2}=ML^{-1}T^{-2}"), theme.textPrimary)
            } else Canvas(Modifier.fillMaxWidth().height(190.dp).background(theme.surface, RoundedCornerShape(12.dp))
                .semantics { contentDescription = "${diagram.title}. ${diagram.caption} $readout" }) {
                drawPhysics(diagram, fraction.value, axis, theme.textPrimary, theme.borderSubtle, theme.accent)
            }
            Text(readout, color = theme.textPrimary, fontSize = 12.sp, fontWeight = FontWeight.Bold)
            if (diagram !in listOf(PhysicsLearningDiagram.DIMENSIONS, PhysicsLearningDiagram.FORCES, PhysicsLearningDiagram.COMPONENTS)) {
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    TextButton(onClick = { playing = !playing }) {
                        Icon(if (playing) Icons.Rounded.Pause else Icons.Rounded.PlayArrow, null, Modifier.size(18.dp))
                        Text(if (playing) "Pausar" else "Reproducir")
                    }
                    IconButton(onClick = { playing = false; scope.launch { fraction.snapTo(0f) } }) {
                        Icon(Icons.Rounded.Replay, "Reiniciar gráfico")
                    }
                }
                Slider(value = fraction.value, onValueChange = { playing = false; scope.launch { fraction.snapTo(it) } },
                    modifier = Modifier.semantics { contentDescription = "Avance de la ilustración" })
            }
        }
    }
}

private fun decimal(value: Float) = String.format(Locale.ROOT, "%.1f", value)

private fun DrawScope.drawPhysics(kind: PhysicsLearningDiagram, progress: Float, axis: Int, ink: Color, grid: Color, accent: Color) {
    val cyan = Color(0xFF168AAD)
    val purple = Color(0xFF9657CF)
    val orange = Color(0xFFCF640C)
    val left = 43.dp.toPx(); val bottom = size.height - 30.dp.toPx()
    val width = size.width - left - 30.dp.toPx(); val height = bottom - 25.dp.toPx()
    fun label(text: String, p: Offset, color: Color = ink) {
        drawContext.canvas.nativeCanvas.drawText(text, p.x, p.y, android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
            this.color = color.toArgb(); textSize = 11.sp.toPx(); typeface = android.graphics.Typeface.DEFAULT_BOLD
        })
    }
    fun arrow(start: Offset, end: Offset, color: Color) {
        drawLine(color, start, end, 2.5.dp.toPx(), StrokeCap.Round)
        val angle = atan2(end.y - start.y, end.x - start.x)
        val wing = 8.dp.toPx()
        val path = Path().apply { moveTo(end.x, end.y)
            lineTo(end.x - wing * cos(angle - .45f), end.y - wing * sin(angle - .45f))
            lineTo(end.x - wing * cos(angle + .45f), end.y - wing * sin(angle + .45f)); close() }
        drawPath(path, color)
    }
    fun point(x: Float, y: Float, maxX: Float, maxY: Float) = Offset(left + width * x / maxX, bottom - height * y / maxY)
    fun axes(maxX: Float, maxY: Float, xLabel: String, yLabel: String) {
        for (i in 1..4) {
            val x = left + width * i / 4; val y = bottom - height * i / 4
            drawLine(grid, Offset(x, bottom), Offset(x, bottom - height), 1.dp.toPx())
            drawLine(grid, Offset(left, y), Offset(left + width, y), 1.dp.toPx())
            label(decimal(maxX * i / 4), Offset(x - 6.dp.toPx(), bottom + 14.dp.toPx()))
            label(decimal(maxY * i / 4), Offset(4.dp.toPx(), y + 4.dp.toPx()))
        }
        arrow(Offset(left, bottom), Offset(left + width + 9.dp.toPx(), bottom), ink)
        arrow(Offset(left, bottom), Offset(left, bottom - height - 10.dp.toPx()), ink)
        label("0", Offset(left - 12.dp.toPx(), bottom + 13.dp.toPx()))
        label(xLabel, Offset(size.width - 48.dp.toPx(), size.height - 3.dp.toPx()))
        label(yLabel, Offset(left + 6.dp.toPx(), 16.dp.toPx()))
    }
    if (kind == PhysicsLearningDiagram.FORCES) {
        val c = Offset(size.width * .5f, size.height * .5f)
        drawLine(grid, Offset(15.dp.toPx(), c.y + 19.dp.toPx()), Offset(size.width - 15.dp.toPx(), c.y + 19.dp.toPx()), 3.dp.toPx())
        drawRoundRect(accent, Offset(c.x - 22.dp.toPx(), c.y - 18.dp.toPx()), Size(44.dp.toPx(), 36.dp.toPx()), androidx.compose.ui.geometry.CornerRadius(6.dp.toPx()))
        val up = c + Offset(0f, -63.dp.toPx()); val down = c + Offset(0f, 63.dp.toPx())
        arrow(c, up, cyan); arrow(c, down, orange)
        arrow(c, c + Offset(66.dp.toPx(), 0f), purple)
        arrow(c, c + Offset(-35.dp.toPx(), 0f), orange)
        label("N", up + Offset(7.dp.toPx(), 0f)); label("P", down + Offset(7.dp.toPx(), 0f))
        label("F", c + Offset(70.dp.toPx(), -5.dp.toPx())); label("f", c + Offset(-47.dp.toPx(), -5.dp.toPx()))
        label("Flechas cualitativas; magnitudes en el ejemplo", Offset(8.dp.toPx(), size.height - 9.dp.toPx()))
        return
    }
    if (kind == PhysicsLearningDiagram.VECTORS || kind == PhysicsLearningDiagram.COMPONENTS) {
        axes(4f, 3f, "x (u)", "y (u)")
        val origin = point(0f, 0f, 4f, 3f); val a = point(3f, 0f, 4f, 3f); val end = point(3f, 2f, 4f, 3f)
        arrow(origin, a, cyan)
        val bStart = point(if (kind == PhysicsLearningDiagram.COMPONENTS) 3f else 3 * progress, 0f, 4f, 3f)
        arrow(bStart, bStart + (end - a), purple)
        arrow(origin, end, orange)
        drawLine(grid, point(0f, 2f, 4f, 3f), end, 1.5.dp.toPx(), pathEffect = androidx.compose.ui.graphics.PathEffect.dashPathEffect(floatArrayOf(6.dp.toPx(), 4.dp.toPx())))
        label(if (kind == PhysicsLearningDiagram.COMPONENTS) "Ax" else "A", a + Offset(-20.dp.toPx(), -7.dp.toPx()), cyan)
        label(if (kind == PhysicsLearningDiagram.COMPONENTS) "Ay" else "B", bStart + Offset(7.dp.toPx(), -height * .38f), purple)
        label(if (kind == PhysicsLearningDiagram.COMPONENTS) "A" else "R", end + Offset(5.dp.toPx(), -6.dp.toPx()), orange)
        return
    }
    val maxX = if (kind == PhysicsLearningDiagram.OHM) 3f else 4f
    val maxY = when (kind) {
        PhysicsLearningDiagram.MRUV -> if (axis == 0) 16f else if (axis == 1) 8f else 2.5f
        PhysicsLearningDiagram.PROJECTILE -> 1.5f
        PhysicsLearningDiagram.OHM -> 12f
        else -> 8f
    }
    val ylabel = when (kind) {
        PhysicsLearningDiagram.MRUV -> if (axis == 0) "x (m)" else if (axis == 1) "v (m/s)" else "a (m/s²)"
        PhysicsLearningDiagram.PROJECTILE -> "y (m)"
        PhysicsLearningDiagram.OHM -> "V (V)"
        else -> "x (m)"
    }
    axes(maxX, maxY, if (kind == PhysicsLearningDiagram.PROJECTILE) "x (m)" else if (kind == PhysicsLearningDiagram.OHM) "I (A)" else "t (s)", ylabel)
    fun y(x: Float): Float = when (kind) {
        PhysicsLearningDiagram.MRUV -> if (axis == 0) PhysicsDiagramMath.position(x, 0f, 2f) else if (axis == 1) 2 * x else 2f
        PhysicsLearningDiagram.PROJECTILE -> PhysicsDiagramMath.projectileHeight(x / 4)
        PhysicsLearningDiagram.OHM -> PhysicsDiagramMath.voltage(x)
        else -> PhysicsDiagramMath.position(x, 2f)
    }
    val path = Path().apply {
        for (i in 0..80) {
            val x = maxX * i / 80; val p = point(x, y(x), maxX, maxY)
            if (i == 0) moveTo(p.x, p.y) else lineTo(p.x, p.y)
        }
    }
    drawPath(path, accent, style = Stroke(2.5.dp.toPx()))
    val currentX = maxX * progress; val current = point(currentX, y(currentX), maxX, maxY)
    drawLine(grid, Offset(current.x, bottom), current, 1.5.dp.toPx())
    drawCircle(accent, 6.dp.toPx(), current); drawCircle(ink, 6.dp.toPx(), current, style = Stroke(1.5.dp.toPx()))
}
