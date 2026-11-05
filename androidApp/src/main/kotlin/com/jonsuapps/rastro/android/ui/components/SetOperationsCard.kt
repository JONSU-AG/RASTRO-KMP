package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.launch

internal enum class IllustratedSetOperation(val label: String) { UNION("Unión"), INTERSECTION("Intersección"), DIFFERENCE("A − B"), SYMMETRIC("Dif. simétrica") }
internal fun setOperationResult(a: Set<Int>, b: Set<Int>, operation: IllustratedSetOperation): Set<Int> = when(operation) {
    IllustratedSetOperation.UNION -> a union b
    IllustratedSetOperation.INTERSECTION -> a intersect b
    IllustratedSetOperation.DIFFERENCE -> a - b
    IllustratedSetOperation.SYMMETRIC -> (a-b) union (b-a)
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
internal fun SetOperationsCard() {
    val theme=ThemeManager.currentTheme
    val ink=academicInk(theme.isDark)
    var operation by remember { mutableStateOf(IllustratedSetOperation.UNION) }
    val progress=remember(operation) { Animatable(0f) }
    var playing by remember(operation) { mutableStateOf(false) }
    val scope=rememberCoroutineScope()
    PauseLearningPlaybackWhenInactive { playing=false }
    LaunchedEffect(playing,operation) {
        if(playing) {
            if(progress.value >= .999f)progress.snapTo(0f)
            progress.animateTo(1f,tween(((1-progress.value)*3500).toInt().coerceAtLeast(1)))
            playing=false
        }
    }
    val result=setOperationResult(setOf(1,2,3),setOf(3,4),operation).sorted()
    Surface(color=theme.surfaceAccent,shape=RoundedCornerShape(16.dp),border=BorderStroke(1.dp,theme.borderSubtle)) {
        Column(Modifier.fillMaxWidth().padding(12.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
            Text("Operaciones con conjuntos",color=theme.textPrimary,style=MaterialTheme.typography.titleSmall)
            Text("Ejemplo ilustrativo",color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
            ScientificMath(listOf("A=\\{1,2,3\\},\\quad B=\\{3,4\\}"),theme.textPrimary,fontSize=17f)
            FlowRow(horizontalArrangement=Arrangement.spacedBy(4.dp)) {
                IllustratedSetOperation.entries.forEach { item ->
                    FilterChip(selected=operation==item,onClick={playing=false;operation=item},label={Text(item.label)})
                }
            }
            Canvas(Modifier.fillMaxWidth().height(170.dp).semantics { contentDescription="${operation.label}. Resultado: ${result.joinToString()}" }) {
                val radius=minOf(size.width*.28f,size.height*.38f)
                val center=Offset(size.width/2,size.height/2)
                val left=center-Offset(radius*.55f,0f);val right=center+Offset(radius*.55f,0f)
                fun oval(at: Offset)=Path().apply {addOval(Rect(at-Offset(radius,radius),at+Offset(radius,radius)))}
                val a=oval(left);val b=oval(right)
                val region=Path.combine(when(operation) {
                    IllustratedSetOperation.UNION -> PathOperation.Union
                    IllustratedSetOperation.INTERSECTION -> PathOperation.Intersect
                    IllustratedSetOperation.DIFFERENCE -> PathOperation.Difference
                    IllustratedSetOperation.SYMMETRIC -> PathOperation.Xor
                },a,b)
                drawPath(region,ink.underline.copy(alpha=progress.value*.30f))
                drawPath(a,ink.concept,style=Stroke(2.dp.toPx()));drawPath(b,ink.secondary,style=Stroke(2.dp.toPx()))
                fun label(text:String,at:Offset) = drawContext.canvas.nativeCanvas.drawText(text,at.x,at.y,
                    android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {color=theme.textPrimary.toArgb();textSize=16.dp.toPx()})
                label("A",left+Offset(-radius*.8f,-radius));label("B",right+Offset(radius*.65f,-radius))
                label("1, 2",left+Offset(-radius*.55f,5.dp.toPx()));label("3",center+Offset(-5.dp.toPx(),5.dp.toPx()));label("4",right+Offset(radius*.40f,5.dp.toPx()))
            }
            if(progress.value >= .95f) ScientificMath(listOf("\\text{Resultado: }\\{${result.joinToString()}\\}"),theme.textPrimary,fontSize=17f)
            Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween) {
                TextButton(onClick={playing=!playing}) {Text(if(playing)"Pausar" else "Reproducir")}
                TextButton(onClick={playing=false;scope.launch {progress.snapTo(0f)}}) {Text("Reiniciar")}
            }
            Slider(progress.value,onValueChange={playing=false;scope.launch {progress.snapTo(it)}})
        }
    }
}
