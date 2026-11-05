package com.jonsuapps.rastro.android.ui.screens

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.IntSize

internal class PizarraCanvasEngine(private val paperColor: Int = android.graphics.Color.WHITE,private val virtualViewport:Boolean=false) {
    private val history = PizarraStrokeHistory()
    private val budget = CanvasMemoryPolicy.budget(Runtime.getRuntime().maxMemory())
    var bitmap: Bitmap? = null
        private set
    var size = IntSize.Zero
        private set
    private var canvas: Canvas? = null
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE; strokeCap = Paint.Cap.ROUND; strokeJoin = Paint.Join.ROUND
    }
    val activePath = Path()
    private val activePoints = ArrayList<InkPoint>()
    private var ink = android.graphics.Color.BLACK
    private var width = 9f
    private var erasing = false
    private var precision = false
    var pointer by mutableStateOf<Offset?>(null)
        private set
    var revision by mutableIntStateOf(0)
        private set
    var canUndo by mutableStateOf(false)
        private set
    var canRedo by mutableStateOf(false)
        private set
    var hasDrawing by mutableStateOf(false)
        private set
    var notice by mutableStateOf<String?>(null)
    private var viewport=InkViewport()
    val retainedPoints get()=history.retainedPoints
    private val paths=java.util.IdentityHashMap<InkStroke,Path>()
    fun setViewport(next:InkViewport){if(viewport!=next){viewport=next;if(virtualViewport)redraw()}}
    fun releaseRaster(){bitmap?.recycle();bitmap=null;canvas=null;size=IntSize.Zero;paths.clear()}

    fun resize(viewport: IntSize) {
        if (viewport.width <= 0 || viewport.height <= 0) return
        val next = if(virtualViewport)viewport else IntSize(maxOf(size.width, viewport.width), maxOf(size.height, viewport.height))
        if (next == size && bitmap != null) return
        val (w, h) = CanvasMemoryPolicy.dimensions(next.width, next.height, budget)
        val buffer = try { Bitmap.createBitmap(w,h,Bitmap.Config.ARGB_8888) }
        catch (_: OutOfMemoryError) { notice = "No hay memoria suficiente para ampliar el lienzo."; return }
        catch (_: IllegalArgumentException) { notice = "No se pudo ampliar el lienzo."; return }
        val old = bitmap
        size = next; bitmap = buffer
        canvas = Canvas(buffer).apply { scale(w.toFloat()/next.width, h.toFloat()/next.height) }
        redraw(); old?.recycle()
    }
    private fun configure(color: Int, thickness: Float) { paint.color = color; paint.strokeWidth = thickness }
    private fun render(stroke: InkStroke) {
        val target=canvas ?: return
        val saved=target.save()
        if(virtualViewport){target.translate(viewport.panX,viewport.panY);target.scale(viewport.zoom,viewport.zoom)}
        configure(stroke.color, stroke.width)
        paint.xfermode = if (stroke.isEraser) android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR) else null
        if (stroke.points.size == 1) {
            paint.style = Paint.Style.FILL
            canvas?.drawCircle(stroke.points[0].x,stroke.points[0].y,stroke.width/2,paint)
            paint.style = Paint.Style.STROKE
        } else {
            val path = paths.getOrPut(stroke){Path().apply {stroke.points.forEachIndexed {i,p->if(i==0)moveTo(p.x,p.y) else lineTo(p.x,p.y)}}}
            canvas?.drawPath(path,paint)
        }
        target.restoreToCount(saved)
    }
    private fun update() {
        canUndo = history.canUndo; canRedo = history.canRedo
        hasDrawing = history.strokes.any { !it.isEraser }; revision++
    }
    private fun redraw() {
        val retained=java.util.IdentityHashMap<InkStroke,Boolean>();history.strokes.forEach {retained[it]=true}
        paths.keys.removeAll {it !in retained}
        canvas?.drawColor(paperColor,android.graphics.PorterDuff.Mode.SRC); history.strokes.forEach(::render)
        if (erasing && precision && activePoints.isNotEmpty()) render(InkStroke(activePoints,ink,width,true))
        update()
    }
    fun begin(position: Offset, color: Int, thickness: Float, erase: Boolean, precise: Boolean = false) {
        erasing = erase; precision = precise; pointer = position; ink = color; width = thickness
        if (erase && !precise) {
            history.beginErase()
            if (history.erase(position.inkPoint(),position.inkPoint(),width/2)) redraw()
        } else {
            activePoints.clear(); activePath.reset()
            activePoints.add(position.inkPoint()); activePath.moveTo(position.x,position.y)
            if (erase) render(InkStroke(listOf(position.inkPoint()),ink,width,true))
        }
        revision++
    }
    fun move(position: Offset) {
        if (erasing && !precision) {
            if (history.erase((pointer ?: position).inkPoint(),position.inkPoint(),width/2)) redraw()
        } else if (activePoints.size < 16000) {
            activePoints.add(position.inkPoint()); activePath.lineTo(position.x,position.y)
            if (erasing) render(InkStroke(listOf((pointer ?: position).inkPoint(),position.inkPoint()),ink,width,true))
        }
        pointer = position; revision++
    }
    fun finish(cancelled: Boolean = false) {
        if (erasing && !precision) {
            if (cancelled) history.cancelErase() else history.finishErase()
            redraw()
        } else if (!cancelled && activePoints.isNotEmpty()) {
            if (history.strokes.sumOf { it.points.size } + activePoints.size <= 120000) {
                val stroke = InkStroke(activePoints.toList(),ink,width,erasing)
                history.add(stroke); render(stroke)
            } else notice = "El lienzo está lleno. Guarda el dibujo antes de iniciar otro."
        }
        activePoints.clear(); activePath.reset(); pointer = null
        if (erasing && precision) redraw() else update()
    }
    fun drawActive(target: Canvas) {
        if (erasing || activePoints.isEmpty()) return
        val saved=target.save()
        if(virtualViewport){target.translate(viewport.panX,viewport.panY);target.scale(viewport.zoom,viewport.zoom)}
        configure(ink,width)
        paint.xfermode = null
        if (activePoints.size == 1) {
            paint.style = Paint.Style.FILL
            target.drawCircle(activePoints[0].x,activePoints[0].y,width/2,paint)
            paint.style = Paint.Style.STROKE
        } else target.drawPath(activePath,paint)
        target.restoreToCount(saved)
    }
    fun undo() { history.undo(); redraw() }
    fun redo() { history.redo(); redraw() }
    fun clear() { history.clear(); redraw() }
    fun snapshot(): Bitmap? = try { bitmap?.copy(Bitmap.Config.ARGB_8888,true)?.also {
        // Precision erasure clears alpha; exported paper remains white, without painting over ink.
        Canvas(it).drawColor(android.graphics.Color.WHITE, android.graphics.PorterDuff.Mode.DST_OVER)
    } }
        catch (_: OutOfMemoryError) { notice = "No hay memoria suficiente para exportar la imagen."; null }
    fun release() { releaseRaster();paths.clear();history.release() }
    private fun Offset.inkPoint() = InkPoint(x,y)
}
