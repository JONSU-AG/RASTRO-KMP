package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.ThemeManager
import java.math.BigDecimal
import kotlin.math.abs
import kotlin.math.roundToInt

internal enum class AlgebraStudyGraphic { DISTANCE, PRINCIPAL_ROOT }

/** Exact authored anchors, shared by Material and Aprender, never a subject-wide fallback. */
internal fun algebraStudyGraphic(subject: String, title: String): AlgebraStudyGraphic? {
    if (subject != "algebra") return null
    return when (title) {
        "2.1.4 · Valor absoluto como distancia", "2.2.1 · Ecuaciones de distancia" -> AlgebraStudyGraphic.DISTANCE
        "3.1.3 · Raíces reales y raíz principal" -> AlgebraStudyGraphic.PRINCIPAL_ROOT
        else -> null
    }
}

internal data class StudyRealInterval(val lower: Double?, val upper: Double?, val lowerClosed: Boolean=false, val upperClosed: Boolean=false) {
    fun contains(value: Double): Boolean = value.isFinite() &&
        (lower == null || value > lower || lowerClosed && value == lower) &&
        (upper == null || value < upper || upperClosed && value == upper)
}

/** Solve |x-center| <=/>= radius (or strict variants), including zero/negative radius. */
internal fun absoluteDistanceIntervals(center: Double, radius: Double, within: Boolean, inclusive: Boolean): List<StudyRealInterval> {
    require(center.isFinite() && radius.isFinite())
    if (radius < 0) return if (within) emptyList() else listOf(StudyRealInterval(null,null))
    if (radius == 0.0) return when {
        within && inclusive -> listOf(StudyRealInterval(center,center,true,true))
        within -> emptyList()
        inclusive -> listOf(StudyRealInterval(null,null))
        else -> listOf(StudyRealInterval(null,center),StudyRealInterval(center,null))
    }
    require((center-radius).isFinite() && (center+radius).isFinite())
    return if (within) listOf(StudyRealInterval(center-radius,center+radius,inclusive,inclusive))
        else listOf(StudyRealInterval(null,center-radius,false,inclusive),StudyRealInterval(center+radius,null,inclusive,false))
}

private fun realNumber(value: Double): String = BigDecimal.valueOf(if(value==0.0)0.0 else value).stripTrailingZeros().toPlainString()
internal fun studyIntervalsTex(intervals: List<StudyRealInterval>): String = when {
    intervals.isEmpty() -> "\\varnothing"
    else -> intervals.joinToString(" \\cup ") { part ->
        when {
            part.lower==null && part.upper==null -> "\\mathbb{R}"
            part.lower!=null && part.lower==part.upper -> "\\{${realNumber(part.lower)}\\}"
            else -> (if(part.lowerClosed)"[" else "(") + (part.lower?.let(::realNumber) ?: "-\\infty") + "," +
                (part.upper?.let(::realNumber) ?: "+\\infty") + (if(part.upperClosed)"]" else ")")
        }
    }
}

@Composable
internal fun AlgebraRealLineCard(graphic: AlgebraStudyGraphic) {
    val theme=ThemeManager.currentTheme
    var center by remember(graphic) { mutableFloatStateOf(1f) }
    var radius by remember(graphic) { mutableFloatStateOf(3f) }
    var within by remember(graphic) { mutableStateOf(true) }
    var inclusive by remember(graphic) { mutableStateOf(true) }
    var sample by remember(graphic) { mutableFloatStateOf(-3f) }
    val title=if(graphic==AlgebraStudyGraphic.DISTANCE) "Distancia en la recta real" else "La raíz principal no cambia de signo"
    Sticker3dCard(Modifier.fillMaxWidth(),containerColor=theme.surfaceAccent,strokeColor=theme.strokeBorder,
        bevelColor=theme.cardBevel,shape=RoundedCornerShape(18.dp)) {
        Column(Modifier.fillMaxWidth().padding(14.dp),verticalArrangement=Arrangement.spacedBy(10.dp)) {
            Text(title,color=theme.textPrimary,fontWeight=FontWeight.Bold)
            if(graphic==AlgebraStudyGraphic.DISTANCE) {
                val intervals=absoluteDistanceIntervals(center.toDouble(),radius.toDouble(),within,inclusive)
                val relation=if(within){if(inclusive)"\\le" else "<"}else{if(inclusive)"\\ge" else ">"}
                ScientificMath(listOf("\\lvert x-(${realNumber(center.toDouble())})\\rvert $relation ${realNumber(radius.toDouble())}",
                    "S=${studyIntervalsTex(intervals)}"),theme.textPrimary,fontSize=17f)
                RealLineDrawing(intervals)
                StudyChoiceField("Puntos que buscamos",listOf(true,false),within,{if(it) "Más cerca del centro" else "Más lejos del centro"}) {within=it}
                Text("Centro: ${realNumber(center.toDouble())}",color=theme.textPrimary)
                Slider(value=center,onValueChange={center=it.roundToInt().toFloat()},valueRange=-4f..4f,steps=7)
                Text("Distancia: ${realNumber(radius.toDouble())}",color=theme.textPrimary)
                Slider(value=radius,onValueChange={radius=it.roundToInt().toFloat()},valueRange=0f..4f,steps=3)
                Row(Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically) {
                    Text("Permitir igualdad",Modifier.weight(1f),color=theme.textPrimary)
                    Switch(checked=inclusive,onCheckedChange={inclusive=it})
                }
                Text("Círculo lleno: extremo incluido. Círculo vacío: extremo excluido. El tramo coloreado representa la solución.",
                    color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
            } else {
                val x=sample.toDouble()
                ScientificMath(listOf("x=${realNumber(x)}", "\\sqrt{(${realNumber(x)})^2}=\\sqrt{${realNumber(x*x)}}=${realNumber(abs(x))}=\\lvert ${realNumber(x)}\\rvert"),
                    theme.textPrimary,fontSize=17f)
                RealLineDrawing(listOf(StudyRealInterval(x,x,true,true),StudyRealInterval(abs(x),abs(x),true,true)),"Se señalan x y su valor absoluto")
                Text("Valor de x: ${realNumber(x)}",color=theme.textPrimary)
                Slider(value=sample,onValueChange={sample=(it*2).roundToInt()/2f},valueRange=-5f..5f,steps=19)
                Text("La raíz cuadrada principal es no negativa. Si x es negativo, el resultado es su opuesto; si x es no negativo, coincide con x.",
                    color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Composable
private fun RealLineDrawing(intervals: List<StudyRealInterval>, purpose: String="Conjunto solución") {
    val theme=ThemeManager.currentTheme
    val description=purpose+". "+if(intervals.isEmpty()) "No hay puntos." else intervals.joinToString(" O bien: ") {
        when {
            it.lower==null && it.upper==null -> "Todos los números reales."
            it.lower!=null && it.lower==it.upper -> "El punto ${realNumber(it.lower)}."
            else -> "Desde ${it.lower?.let(::realNumber) ?: "menos infinito"}, ${if(it.lowerClosed)"incluido" else "excluido"}, hasta "+
                "${it.upper?.let(::realNumber) ?: "más infinito"}, ${if(it.upperClosed)"incluido" else "excluido"}."
        }
    }
    Canvas(Modifier.fillMaxWidth().height(112.dp).semantics {contentDescription=description}) {
        val start=18.dp.toPx();val end=size.width-start;val y=size.height*.54f
        fun at(x:Double)=start+((x+9.0)/18.0).toFloat()*(end-start)
        fun label(text:String,x:Float,y:Float) {
            drawContext.canvas.nativeCanvas.drawText(text,x,y,android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
                color=theme.textPrimary.toArgb();textSize=12.dp.toPx();textAlign=android.graphics.Paint.Align.CENTER
            })
        }
        drawLine(theme.textSecondary,Offset(start,y),Offset(end,y),1.5.dp.toPx())
        for(tick in listOf(-8,-4,0,4,8)) {
            val x=at(tick.toDouble());drawLine(theme.textSecondary,Offset(x,y-4.dp.toPx()),Offset(x,y+4.dp.toPx()),1.dp.toPx())
            label(tick.toString(),x,y+25.dp.toPx())
        }
        intervals.forEach { part ->
            val left=at(part.lower ?: -9.0);val right=at(part.upper ?: 9.0)
            drawLine(theme.accent,Offset(left,y),Offset(right,y),5.dp.toPx())
            if(part.lower==null) {
                drawLine(theme.accent,Offset(start,y),Offset(start+8.dp.toPx(),y-7.dp.toPx()),3.dp.toPx())
                drawLine(theme.accent,Offset(start,y),Offset(start+8.dp.toPx(),y+7.dp.toPx()),3.dp.toPx())
            }
            if(part.upper==null) {
                drawLine(theme.accent,Offset(end,y),Offset(end-8.dp.toPx(),y-7.dp.toPx()),3.dp.toPx())
                drawLine(theme.accent,Offset(end,y),Offset(end-8.dp.toPx(),y+7.dp.toPx()),3.dp.toPx())
            }
        }
        intervals.flatMap { listOfNotNull(it.lower?.let {v->v to it.lowerClosed},it.upper?.let {v->v to it.upperClosed}) }
            .distinctBy {it.first}.forEach { (value,closed) ->
                val point=Offset(at(value),y)
                drawCircle(if(closed)theme.accent else theme.surfaceAccent,6.dp.toPx(),point)
                drawCircle(theme.accent,6.dp.toPx(),point,style=Stroke(2.dp.toPx()))
                label(realNumber(value),point.x,y-16.dp.toPx())
            }
    }
}
