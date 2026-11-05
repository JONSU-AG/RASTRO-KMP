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
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.launch
import java.util.Locale

internal data class DensitySample(val mass: Double, val volume: Double) {
    init { require(mass.isFinite() && volume.isFinite() && mass>0 && volume>0) }
    val density get() = mass/volume
    fun portion(fraction: Double): DensitySample {
        require(fraction.isFinite() && fraction>0 && fraction<=1)
        return DensitySample(mass*fraction,volume*fraction)
    }
}

@Composable
internal fun DensityLearningCard() {
    val theme=ThemeManager.currentTheme
    val ink=academicInk(theme.isDark)
    val original=remember {DensitySample(60.0,20.0)}
    val progress=remember {Animatable(0f)}
    var playing by remember {mutableStateOf(false)}
    val scope=rememberCoroutineScope()
    PauseLearningPlaybackWhenInactive {playing=false}
    LaunchedEffect(playing) {
        if(playing) {
            if(progress.value>=.999f)progress.snapTo(0f)
            progress.animateTo(1f,tween(((1-progress.value)*5000).toInt().coerceAtLeast(1),easing=LinearEasing))
            playing=false
        }
    }
    val sample=original.portion(1-.75*progress.value)
    fun number(value:Double)=String.format(Locale.ROOT,"%.2f",value)
    Surface(color=theme.surfaceAccent,shape=RoundedCornerShape(16.dp),border=BorderStroke(1.dp,theme.borderSubtle)) {
        Column(Modifier.fillMaxWidth().padding(12.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
            Text("Menos muestra, misma densidad",color=theme.textPrimary,style=MaterialTheme.typography.titleSmall)
            Text("Ejemplo de material homogéneo a temperatura y presión constantes. No representa una sustancia específica.",color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
            Canvas(Modifier.fillMaxWidth().height(190.dp).semantics {contentDescription="Gráfica masa–volumen. Masa ${number(sample.mass)} gramos, volumen ${number(sample.volume)} centímetros cúbicos y densidad 3 gramos por centímetro cúbico."}) {
                val left=38.dp.toPx();val right=size.width-12.dp.toPx()
                val top=22.dp.toPx();val bottom=size.height-32.dp.toPx()
                fun at(volume:Double,mass:Double)=Offset(left+(right-left)*(volume/20).toFloat(),bottom-(bottom-top)*(mass/60).toFloat())
                drawLine(theme.textSecondary,at(0.0,0.0),at(20.0,0.0),1.5.dp.toPx())
                drawLine(theme.textSecondary,at(0.0,0.0),at(0.0,60.0),1.5.dp.toPx())
                drawLine(ink.concept,at(0.0,0.0),at(20.0,60.0),2.5.dp.toPx())
                drawCircle(ink.secondary,6.dp.toPx(),at(sample.volume,sample.mass))
                fun label(value:String,point:Offset) = drawContext.canvas.nativeCanvas.drawText(value,point.x,point.y,
                    android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {color=theme.textPrimary.toArgb();textSize=11.dp.toPx()})
                label("m (g)",Offset(0f,top-6.dp.toPx()))
                label("V (cm³)",Offset(right-44.dp.toPx(),size.height-3.dp.toPx()))
                for(v in listOf(0.0,10.0,20.0))label(v.toInt().toString(),at(v,0.0)+Offset(-5.dp.toPx(),15.dp.toPx()))
                for(m in listOf(30.0,60.0))label(m.toInt().toString(),at(0.0,m)+Offset(-24.dp.toPx(),4.dp.toPx()))
            }
            AcademicText("Masa: ${number(sample.mass)} g\nVolumen: ${number(sample.volume)} cm³",theoryStyle=true,color=theme.textPrimary)
            ScientificMath(listOf("\\rho=\\frac{m}{V}=3\\;\\mathrm{g/cm^3}"),theme.textPrimary,fontSize=17f)
            Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                TextButton(onClick={playing=!playing}) {Text(if(playing)"Pausar" else "Dividir muestra")}
                TextButton(onClick={playing=false;scope.launch {progress.snapTo(0f)}}) {Text("Reiniciar")}
            }
            Slider(progress.value,onValueChange={playing=false;scope.launch {progress.snapTo(it)}})
        }
    }
}
