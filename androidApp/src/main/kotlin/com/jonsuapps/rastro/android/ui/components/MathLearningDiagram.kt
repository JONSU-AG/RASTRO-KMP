package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.launch
import java.util.Locale
import kotlin.math.*

internal enum class MathLearningDiagram { UNIT_CIRCLE, QUADRATIC, PYTHAGORAS }

internal fun mathDiagramFor(subject: String, title: String): MathLearningDiagram? {
    val text = java.text.Normalizer.normalize(title, java.text.Normalizer.Form.NFD)
        .replace(Regex("\\p{M}+"), "").lowercase(Locale.ROOT)
    return when {
        subject == "trigonometria" && ("circunferencia trigonometrica" in text || "circulo trigonometrico" in text) -> MathLearningDiagram.UNIT_CIRCLE
        subject == "algebra" && "funcion" in text && "cuadratic" in text -> MathLearningDiagram.QUADRATIC
        subject == "geometria" && "pitagoras" in text -> MathLearningDiagram.PYTHAGORAS
        else -> null
    }
}

@Composable
internal fun AcademicLessonDiagram(lesson: LessonNode) {
    if (lesson.subjectId == "fisica") {
        PhysicsLearningDiagram.forLesson(lesson.id, lesson.title)?.let { PhysicsDiagramCard(it) }
    } else when (mathDiagramFor(lesson.subjectId, lesson.title)) {
        MathLearningDiagram.PYTHAGORAS -> PythagorasGeometricGraphic(ThemeManager.currentTheme)
        MathLearningDiagram.UNIT_CIRCLE -> ParametricMathDiagram(circle = true)
        MathLearningDiagram.QUADRATIC -> ParametricMathDiagram(circle = false)
        null -> Unit
    }
}

@Composable
private fun ParametricMathDiagram(circle: Boolean) {
    val theme = ThemeManager.currentTheme
    val progress = remember(circle) { Animatable(0f) }
    var playing by remember(circle) { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(playing) {
        if (playing) {
            if (progress.value >= .999f) progress.snapTo(0f)
            progress.animateTo(1f, tween(((1-progress.value)*6000).toInt().coerceAtLeast(1), easing = LinearEasing))
            playing = false
        }
    }
    val angle = progress.value * 2 * PI.toFloat()
    val x = if (circle) cos(angle) else progress.value * 4 - 2
    val y = if (circle) sin(angle) else x*x
    val title = if (circle) "Circunferencia de radio uno" else "Una función cuadrática: y = x²"
    val caption = if (circle) "El punto P tiene coordenadas (cos θ, sen θ). Sus proyecciones cambian de signo según el cuadrante. Los valores son adimensionales." else
        "Ejemplo ilustrativo: y = x² en −2 ≤ x ≤ 2. La curva es simétrica respecto del eje y y su vértice es (0, 0); otras funciones cuadráticas pueden tener otro vértice y orientación."
    Surface(color = theme.surfaceAccent, shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)) {
        Column(Modifier.fillMaxWidth().padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(title, color = theme.textPrimary, fontWeight = FontWeight.Bold)
            Text(caption, color = theme.textSecondary, style = MaterialTheme.typography.bodySmall)
            Canvas(Modifier.fillMaxWidth().height(210.dp).semantics { contentDescription = "$title. $caption" }) {
                val left = 35.dp.toPx(); val right = size.width - 20.dp.toPx()
                val bottom = size.height - 28.dp.toPx(); val top = 22.dp.toPx()
                val origin = Offset((left+right)/2, if(circle) (top+bottom)/2 else bottom)
                val unit = if(circle) min((right-left)/2, (bottom-top)/2) * .85f else (right-left)/4
                fun at(a: Float, b: Float) = Offset(origin.x+a*unit, origin.y-b*(if(circle)unit else (bottom-top)/4))
                drawLine(theme.textSecondary, Offset(left,origin.y), Offset(right,origin.y), 1.5.dp.toPx())
                drawLine(theme.textSecondary, Offset(origin.x,top), Offset(origin.x,bottom), 1.5.dp.toPx())
                fun label(text: String, point: Offset) = drawContext.canvas.nativeCanvas.drawText(text,point.x,point.y,
                    android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply { color=theme.textPrimary.toArgb();textSize=11.dp.toPx() })
                label("x",Offset(right,origin.y-6.dp.toPx()));label("y",Offset(origin.x+7.dp.toPx(),top))
                label("0",origin+Offset(5.dp.toPx(),14.dp.toPx()))
                if(circle) {
                    drawCircle(theme.accent,unit,origin,style=Stroke(2.dp.toPx()))
                    drawLine(theme.accent,origin,at(x,y),2.5.dp.toPx())
                    drawLine(theme.textSecondary,at(x,0f),at(x,y),1.5.dp.toPx())
                    drawLine(theme.textSecondary,at(0f,y),at(x,y),1.5.dp.toPx())
                    label("1",at(1f,0f)+Offset(4.dp.toPx(),14.dp.toPx()));label("−1",at(-1f,0f)+Offset(-16.dp.toPx(),14.dp.toPx()))
                } else {
                    val path=Path().apply { for(i in 0..80) { val a=-2+i/20f;val p=at(a,a*a);if(i==0)moveTo(p.x,p.y)else lineTo(p.x,p.y) } }
                    drawPath(path,theme.accent,style=Stroke(2.5.dp.toPx()))
                    for(i in listOf(-2,-1,1,2))label(i.toString(),at(i.toFloat(),0f)+Offset(-4.dp.toPx(),14.dp.toPx()))
                    label("4",at(0f,4f)+Offset(7.dp.toPx(),5.dp.toPx()))
                }
                drawCircle(theme.accent,5.dp.toPx(),at(x,y))
            }
            Text((if(circle) "θ = ${String.format(Locale.ROOT,"%.0f",angle*180/PI)}° · " else "")+
                "P = (${String.format(Locale.ROOT,"%.2f",x)}, ${String.format(Locale.ROOT,"%.2f",y)})", color=theme.textPrimary)
            Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                TextButton(onClick={playing=!playing}) { Text(if(playing)"Pausar" else "Reproducir") }
                TextButton(onClick={playing=false;scope.launch { progress.snapTo(0f) }}) { Text("Reiniciar") }
            }
            Slider(progress.value,onValueChange={playing=false;scope.launch { progress.snapTo(it) }})
        }
    }
}
