package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.OpenInFull
import androidx.compose.material.icons.rounded.FitScreen
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.theme.ThemeManager

/** The thumbnail and expanded canvas use exactly the same nodes, edges and layout. */
@Composable
internal fun AcademicSourceMap(diagram: AcademicSourceDiagram) {
    val theme=ThemeManager.currentTheme
    var expanded by remember(diagram){mutableStateOf(false)}
    if(diagram.nodes.isEmpty()) {
        // Unsupported source remains readable instead of inventing graph relationships.
        Surface(color=theme.surfaceAccent,shape=RoundedCornerShape(16.dp)) {
            Column(Modifier.fillMaxWidth().padding(12.dp)) {
                Text("Esquema del tema",color=theme.textPrimary,fontWeight=FontWeight.Bold)
                Text(diagram.source,color=theme.textPrimary,fontFamily=FontFamily.Monospace)
            }
        }
        return
    }
    Sticker3dCard(Modifier.fillMaxWidth(),containerColor=theme.surface,strokeColor=theme.strokeBorder,
        bevelColor=theme.cardBevel,shape=RoundedCornerShape(18.dp)) {
        Column(Modifier.fillMaxWidth().padding(12.dp),verticalArrangement=Arrangement.spacedBy(8.dp)) {
            Text("Mapa del tema",color=theme.textPrimary,fontWeight=FontWeight.Bold)
            Box(Modifier.fillMaxWidth().height(270.dp)) {
                AcademicMapCanvas(diagram,false,0,Modifier.fillMaxSize())
                // Compose handles the tap and yields vertical drags to the containing reader.
                Box(Modifier.matchParentSize().clickable(role=Role.Button,onClickLabel="Ampliar mapa completo",onClick={expanded=true}))
            }
            Sticker3dButton(onClick={expanded=true},modifier=Modifier.fillMaxWidth(),
                containerColor=theme.surfaceAccent,bottomBevelColor=theme.cardBevel,
                contentPadding=PaddingValues(horizontal=12.dp,vertical=9.dp)) {
                Icon(Icons.Rounded.OpenInFull,null,Modifier.size(18.dp),tint=theme.textPrimary)
                Spacer(Modifier.width(8.dp))
                Text("Ampliar mapa",color=theme.textPrimary,fontWeight=FontWeight.Bold)
            }
        }
    }
    if(expanded) Dialog(onDismissRequest={expanded=false},properties=DialogProperties(usePlatformDefaultWidth=false,decorFitsSystemWindows=false)) {
        var reset by remember{mutableIntStateOf(0)}
        Surface(Modifier.fillMaxSize(),color=theme.background) {
            Column(Modifier.fillMaxSize().safeDrawingPadding()) {
                Row(Modifier.fillMaxWidth().padding(horizontal=8.dp),verticalAlignment=Alignment.CenterVertically) {
                    IconButton(onClick={expanded=false}){Icon(Icons.Rounded.Close,"Cerrar mapa",tint=theme.textPrimary)}
                    Text("Mapa del tema",Modifier.weight(1f),fontWeight=FontWeight.Bold,color=theme.textPrimary)
                    IconButton(onClick={reset++}){Icon(Icons.Rounded.FitScreen,"Ver mapa completo",tint=theme.textPrimary)}
                }
                Text("Pellizca para ampliar · Arrastra para moverte",Modifier.padding(horizontal=16.dp,vertical=6.dp),
                    color=theme.textSecondary,style=MaterialTheme.typography.bodySmall)
                AcademicMapCanvas(diagram,true,reset,Modifier.weight(1f).fillMaxWidth())
            }
        }
    }
}

/** Native drawing is immediate: no browser initialization, JavaScript or timeout per map. */
@Composable
private fun AcademicMapCanvas(diagram:AcademicSourceDiagram,expanded:Boolean,reset:Int,modifier:Modifier) {
    NativeMapOverview(diagram,modifier,expanded,reset)
}

/** The preview and expanded map share the same measured forest and original relationships. */
@Composable
private fun NativeMapOverview(diagram: AcademicSourceDiagram, modifier: Modifier, expanded: Boolean, reset: Int) {
    var zoom by remember(diagram, reset) { mutableFloatStateOf(1f) }
    var pan by remember(diagram, reset) { mutableStateOf(Offset.Zero) }
    val theme = ThemeManager.currentTheme
    val concept = academicInk(theme.isDark).concept.toArgb()
    val ink = theme.textPrimary.toArgb()
    val surface = theme.surface.toArgb()
    val border = theme.strokeBorder.toArgb()
    val context=LocalContext.current
    val formulas=remember(diagram) {diagram.nodes.map {AcademicMapMathLabels.load(context,it.label)}}
    val fontScale=LocalDensity.current.fontScale
    val labels = remember(diagram, ink,fontScale) {
        diagram.nodes.map { node ->
            val paint = android.text.TextPaint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
                color = ink; textSize = 26f*fontScale
            }
            android.text.StaticLayout.Builder.obtain(AcademicPresentationText.clean(node.label),
                0, AcademicPresentationText.clean(node.label).length, paint, 280)
                .setIncludePad(false).build()
        }
    }
    val layout = remember(diagram,labels) {
        layoutAcademicMap(diagram,diagram.nodes.mapIndexed {i,node ->
            node.id to ((formulas[i]?.let {it.height.toFloat()*280f/it.width} ?: labels[i].height.toFloat())+40f)
        }.toMap())
    }
    val positions=layout.boxes
    val description = remember(diagram) {diagram.nodes.joinToString(". ") { it.label } + ". " +
        diagram.edges.joinToString(". ") { edge ->
            val from = diagram.nodes.firstOrNull { it.id == edge.from }?.label.orEmpty()
            val to = diagram.nodes.firstOrNull { it.id == edge.to }?.label.orEmpty()
            "$from ${edge.label} → $to"
        } }
    val gestures = if (expanded) Modifier.pointerInput(diagram, reset) {
        detectTransformGestures { _, movement, factor, _ ->
            zoom = (zoom * factor).coerceIn(1f, 32f)
            val fit=minOf(size.width/layout.width,size.height/layout.height)
            val horizontal=maxOf(0f,(layout.width*fit*zoom-size.width)/2)
            val vertical=maxOf(0f,(layout.height*fit*zoom-size.height)/2)
            val moved=pan+movement
            pan=Offset(moved.x.coerceIn(-horizontal,horizontal),moved.y.coerceIn(-vertical,vertical))
        }
    } else Modifier
    Canvas(modifier.then(gestures).semantics { contentDescription = description }) {
        val canvas = drawContext.canvas.nativeCanvas
        val height=layout.height
        val scale = minOf(size.width / layout.width, size.height / height) * zoom
        canvas.save()
        canvas.clipRect(0f, 0f, size.width, size.height)
        val horizontal=maxOf(0f,(layout.width*scale-size.width)/2)
        val vertical=maxOf(0f,(height*scale-size.height)/2)
        canvas.translate((size.width-layout.width*scale)/2+pan.x.coerceIn(-horizontal,horizontal),
            (size.height-height*scale)/2+pan.y.coerceIn(-vertical,vertical))
        canvas.scale(scale, scale)
        val paint = android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
            color = concept; strokeWidth = 3f
        }
        diagram.edges.forEach { edge ->
            val a = positions[edge.from] ?: return@forEach
            val b = positions[edge.to] ?: return@forEach
            val startX = a.right; val startY = a.centerY
            val endX = b.left; val endY = b.centerY
            // A branch has its own vertical span; its connector stays in the gap between columns.
            val middleX=(startX+endX)/2
            val path=android.graphics.Path().apply {
                moveTo(startX,startY);lineTo(middleX,startY);lineTo(middleX,endY);lineTo(endX,endY)
            }
            paint.style=android.graphics.Paint.Style.STROKE
            canvas.drawPath(path,paint)
            paint.style=android.graphics.Paint.Style.FILL
            if (edge.label.isNotBlank()) {
                val labelPaint = android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
                    color = concept; textSize = 18f; textAlign = android.graphics.Paint.Align.CENTER
                }
                canvas.drawText(edge.label, (startX + endX) / 2, (startY + endY) / 2 - 5f, labelPaint)
            }
            val angle = if(endX>=middleX) 0f else kotlin.math.PI.toFloat()
            for (turn in listOf(-0.45f, 0.45f)) {
                canvas.drawLine(endX, endY, endX - 15f * kotlin.math.cos(angle + turn),
                    endY - 15f * kotlin.math.sin(angle + turn), paint)
            }
        }
        diagram.nodes.forEachIndexed { index, node ->
            val box = positions.getValue(node.id)
            paint.style = android.graphics.Paint.Style.FILL; paint.color = surface
            canvas.drawRoundRect(box.left,box.top,box.right,box.bottom,18f,18f,paint)
            paint.style = android.graphics.Paint.Style.STROKE; paint.color = border
            canvas.drawRoundRect(box.left,box.top,box.right,box.bottom,18f,18f,paint)
            paint.style = android.graphics.Paint.Style.FILL
            canvas.save(); canvas.translate(box.left + 20f, box.top + 20f)
            val formula=formulas[index]
            if(formula!=null) {
                val imagePaint=android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG or android.graphics.Paint.FILTER_BITMAP_FLAG).apply {
                    colorFilter=android.graphics.PorterDuffColorFilter(ink,android.graphics.PorterDuff.Mode.SRC_IN)
                }
                canvas.drawBitmap(formula,null,android.graphics.RectF(0f,0f,280f,box.height-40f),imagePaint)
            } else labels[index].draw(canvas)
            canvas.restore()
        }
        canvas.restore()
    }
}
