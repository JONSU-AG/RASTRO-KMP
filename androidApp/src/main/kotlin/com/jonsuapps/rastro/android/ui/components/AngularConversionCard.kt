package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.launch
import java.util.Locale
import kotlin.math.*

internal fun angleGradians(degrees: Double) = degrees * 10.0 / 9.0
internal fun angleRadians(degrees: Double) = degrees * PI / 180.0

/** Only receives a reviewed value from the challenge; never infer a diagram from its ID. */
@Composable
internal fun AngularConversionCard(degrees: Double) {
    if (!degrees.isFinite() || abs(degrees) > 360.0 || degrees == 0.0) return
    val progress = remember(degrees) { Animatable(0f) }
    var playing by remember(degrees) { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    val theme = ThemeManager.currentTheme
    val ink = academicInk(theme.isDark)
    PauseLearningPlaybackWhenInactive { playing = false }
    LaunchedEffect(playing) {
        if(playing) {
            if(progress.value >= .999f) progress.snapTo(0f)
            progress.animateTo(1f,tween(((1-progress.value)*4500).toInt().coerceAtLeast(1),easing=LinearEasing))
            playing=false
        }
    }
    val current = degrees * progress.value
    fun number(n: Double) = String.format(Locale.ROOT,"%.2f",n)
    Surface(color=theme.surfaceAccent,shape=RoundedCornerShape(16.dp),border=BorderStroke(1.dp,theme.borderSubtle)) {
        Column(Modifier.fillMaxWidth().padding(12.dp),verticalArrangement=Arrangement.spacedBy(7.dp)) {
            Text("Un ángulo, tres sistemas",color=theme.textPrimary,fontWeight=FontWeight.Bold)
            Text("Giro hasta ${number(degrees)}°. Las tres medidas representan el mismo ángulo.",color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
            Canvas(Modifier.fillMaxWidth().height(140.dp).semantics { contentDescription="Ángulo de ${number(current)} grados. Antihorario positivo; horario negativo." }) {
                val radius=min(size.width*.35f,size.height*.40f)
                val origin=Offset(size.width/2,size.height/2)
                val radians=angleRadians(current).toFloat()
                drawCircle(theme.borderSubtle,radius,origin,style=Stroke(1.dp.toPx()))
                drawLine(ink.concept,origin,origin+Offset(radius,0f),2.5.dp.toPx())
                drawLine(ink.secondary,origin,origin+Offset(cos(radians)*radius,-sin(radians)*radius),3.dp.toPx())
                drawArc(ink.underline,0f,-current.toFloat(),false,origin-Offset(radius*.55f,radius*.55f),Size(radius*1.1f,radius*1.1f),style=Stroke(3.dp.toPx()))
                drawCircle(theme.textPrimary,3.dp.toPx(),origin)
            }
            AcademicText("S ≈ ${number(current)}°\nC ≈ ${number(angleGradians(current))} g\nR ≈ ${number(angleRadians(current))} rad",color=theme.textPrimary)
            Text("Lecturas aproximadas a dos decimales.", color=theme.textSecondary, style=MaterialTheme.typography.bodySmall)
            ScientificMath(listOf("\\frac{S}{180}=\\frac{C}{200}=\\frac{R}{\\pi}"),theme.textPrimary,fontSize=16f)
            Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                TextButton(onClick={playing=!playing}) { Text(if(playing)"Pausar" else "Reproducir giro") }
                TextButton(onClick={playing=false;scope.launch { progress.snapTo(0f) }}) { Text("Reiniciar") }
            }
            Slider(progress.value,onValueChange={playing=false;scope.launch { progress.snapTo(it) }})
        }
    }
}
