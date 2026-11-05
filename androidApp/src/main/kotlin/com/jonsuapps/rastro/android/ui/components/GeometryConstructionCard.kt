package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Pause
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.launch
import java.text.Normalizer
import java.util.Locale
import kotlin.math.*

internal enum class GeometryConstruction { TRIANGLE_ANGLES, CIRCLE_TANGENT }

/** Narrow section-heading match: generic course titles and other subjects get no invented diagram. */
internal fun geometryDiagramFor(subject: String, heading: String): GeometryConstruction? {
    if (subject != "geometria") return null
    val text = Normalizer.normalize(heading, Normalizer.Form.NFD).replace(Regex("\\p{M}+"), "").lowercase(Locale.ROOT)
    return when {
        "definicion y propiedades fundamentales del triangulo" in text || "angulos interiores del triangulo" in text -> GeometryConstruction.TRIANGLE_ANGLES
        "propiedades fundamentales de la circunferencia" in text || "propiedad del radio y la tangente" in text -> GeometryConstruction.CIRCLE_TANGENT
        else -> null
    }
}

@Composable
internal fun GeometryConstructionCard(kind: GeometryConstruction) {
    val theme = ThemeManager.currentTheme
    val ink = academicInk(theme.isDark)
    val progress = remember(kind) { Animatable(0f) }
    var playing by remember(kind) { mutableStateOf(false) }
    PauseLearningPlaybackWhenInactive { playing = false }
    val scope = rememberCoroutineScope()
    LaunchedEffect(playing) {
        if (playing) {
            if (progress.value >= .999f) progress.snapTo(0f)
            progress.animateTo(1f, tween(((1 - progress.value) * 7000).toInt().coerceAtLeast(1), easing = LinearEasing))
            playing = false
        }
    }
    val triangle = kind == GeometryConstruction.TRIANGLE_ANGLES
    val title = if (triangle) "Construye el triángulo" else "Radio y tangente"
    val description = if (triangle) "Ejemplo ilustrativo: tres lados y tres ángulos interiores. Su suma es 180°; el dibujo no está hecho para medir con transportador." else
        "Ejemplo ilustrativo: la circunferencia tiene centro O y radio r. El diámetro mide 2r; la tangente en T es perpendicular al radio OT."
    Surface(color = theme.surfaceAccent, border = BorderStroke(1.5.dp, theme.borderSubtle), shape = RoundedCornerShape(18.dp)) {
        Column(Modifier.fillMaxWidth().padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(title, color = theme.textPrimary, fontWeight = FontWeight.Bold)
            Text(description, color = theme.textSecondary, style = MaterialTheme.typography.bodySmall)
            Canvas(Modifier.fillMaxWidth().height(210.dp).semantics { contentDescription = "$title. $description" }) {
                fun label(value: String, at: Offset, color: androidx.compose.ui.graphics.Color = theme.textPrimary) {
                    drawContext.canvas.nativeCanvas.drawText(value, at.x, at.y,
                        android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
                            this.color = color.toArgb(); textSize = 15.dp.toPx(); isFakeBoldText = true
                        })
                }
                fun segment(a: Offset, b: Offset, phase: Float, color: androidx.compose.ui.graphics.Color) {
                    if (phase > 0f) drawLine(color, a, a + (b-a)*phase.coerceIn(0f,1f), 3.dp.toPx())
                }
                val t = progress.value
                if (triangle) {
                    val unit = min(size.width / 5f, size.height / 4f)
                    val a = Offset(size.width/2 - 2*unit, size.height/2 + 1.5f*unit)
                    val b = a + Offset(4*unit, 0f)
                    val c = a + Offset(unit, -3*unit)
                    segment(a,b,t/.15f,ink.concept)
                    segment(b,c,(t-.15f)/.15f,ink.secondary)
                    segment(c,a,(t-.30f)/.15f,ink.underline)
                    label("A",a+Offset(-10.dp.toPx(),19.dp.toPx()))
                    label("B",b+Offset(0f,19.dp.toPx()))
                    label("C",c+Offset(0f,-9.dp.toPx()))
                    if (t >= .45f) {
                        fun angle(vertex: Offset, p: Offset, q: Offset) {
                            val one = atan2(p.y-vertex.y,p.x-vertex.x)*180f/PI.toFloat()
                            val two = atan2(q.y-vertex.y,q.x-vertex.x)*180f/PI.toFloat()
                            val sweep = ((two-one+540f)%360f)-180f
                            val radius = 22.dp.toPx()
                            drawArc(ink.secondary,one,sweep*((t-.45f)/.3f).coerceIn(0f,1f),false,
                                vertex-Offset(radius,radius),Size(radius*2,radius*2),style=Stroke(2.dp.toPx()))
                        }
                        angle(a,b,c); angle(b,c,a); angle(c,a,b)
                        label("α",a+Offset(27.dp.toPx(),-8.dp.toPx()),ink.secondary)
                        label("β",b+Offset(-36.dp.toPx(),-8.dp.toPx()),ink.secondary)
                        label("γ",c+Offset(0f,36.dp.toPx()),ink.secondary)
                    }
                } else {
                    val radius = min(size.width*.30f, size.height*.36f)
                    val center = Offset(size.width*.46f,size.height*.50f)
                    val contact = center + Offset(radius,0f)
                    if(t>0) drawArc(ink.concept,0f,360*(t/.45f).coerceIn(0f,1f),false,
                        center-Offset(radius,radius),Size(2*radius,2*radius),style=Stroke(2.5.dp.toPx()))
                    drawCircle(theme.textPrimary,3.dp.toPx(),center); label("O",center+Offset(-17.dp.toPx(),18.dp.toPx()))
                    if(t>=.45f) {
                        segment(center-Offset(radius,0f),contact,(t-.45f)/.25f,ink.underline)
                        segment(center,contact,(t-.45f)/.25f,ink.secondary)
                        label("r",center+Offset(radius/2,-7.dp.toPx()),ink.secondary)
                        label("2r",center+Offset(-radius*.6f,18.dp.toPx()),ink.underline)
                        label("T",contact+Offset(7.dp.toPx(),18.dp.toPx()))
                    }
                    if(t>=.70f) {
                        segment(contact-Offset(0f,radius+15.dp.toPx()),contact+Offset(0f,radius+15.dp.toPx()),(t-.7f)/.3f,ink.secondary)
                        val corner=12.dp.toPx()
                        drawLine(theme.textPrimary,contact+Offset(-corner,0f),contact+Offset(-corner,-corner),1.5.dp.toPx())
                        drawLine(theme.textPrimary,contact+Offset(-corner,-corner),contact+Offset(0f,-corner),1.5.dp.toPx())
                    }
                }
            }
            val stage = when { progress.value < .45f -> "1 / 3 · Traza la figura"; progress.value < .75f -> "2 / 3 · Identifica sus elementos"; else -> "3 / 3 · Relaciona sus propiedades" }
            Text(stage, color=theme.textSecondary, style=MaterialTheme.typography.labelMedium)
            if(progress.value >= .75f) ScientificMath(listOf(if(triangle) "\\alpha+\\beta+\\gamma=180^\\circ" else "OT=r,\\quad d=2r,\\quad OT\\perp \\text{tangente}"), theme.textPrimary, fontSize=17f)
            Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                TextButton(onClick={playing=!playing}) {
                    Icon(if(playing) Icons.Rounded.Pause else Icons.Rounded.PlayArrow,null)
                    Text(if(playing)"Pausar" else "Reproducir")
                }
                TextButton(onClick={playing=false;scope.launch { progress.snapTo(0f) }}) { Text("Reiniciar") }
            }
            Slider(progress.value,onValueChange={playing=false;scope.launch { progress.snapTo(it) }})
        }
    }
}
