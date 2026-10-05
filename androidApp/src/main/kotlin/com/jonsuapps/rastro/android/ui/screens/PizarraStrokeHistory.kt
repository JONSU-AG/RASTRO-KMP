package com.jonsuapps.rastro.android.ui.screens

import kotlin.math.hypot

internal data class InkPoint(val x: Float, val y: Float)
internal data class InkStroke(val points: List<InkPoint>, val color: Int, val width: Float, val isEraser: Boolean = false)

/** Immutable strokes share their geometry across a bounded history; no bitmap snapshots. */
internal class PizarraStrokeHistory {
    var strokes: List<InkStroke> = emptyList()
        private set
    private val past = ArrayDeque<List<InkStroke>>()
    private val future = ArrayDeque<List<InkStroke>>()
    private var beforeErase: List<InkStroke>? = null
    val canUndo get() = past.isNotEmpty()
    val canRedo get() = future.isNotEmpty()

    private fun rememberPrevious(previous: List<InkStroke>) {
        past.addLast(previous)
        while (past.size > 32) past.removeFirst()
        future.clear()
    }
    private fun trimGeometry() {
        fun pointCount(): Int {
            val unique = java.util.IdentityHashMap<InkStroke, Boolean>()
            strokes.forEach { unique[it] = true }
            past.forEach { snapshot -> snapshot.forEach { unique[it] = true } }
            return unique.keys.sumOf { it.points.size }
        }
        while (past.isNotEmpty() && pointCount() > 240000) past.removeFirst()
    }
    fun add(stroke: InkStroke) {
        if (stroke.points.isEmpty()) return
        rememberPrevious(strokes)
        strokes = strokes + stroke
        trimGeometry()
    }
    fun clear() {
        if (strokes.isEmpty()) return
        rememberPrevious(strokes)
        strokes = emptyList()
        trimGeometry()
    }
    fun beginErase() { beforeErase = strokes }
    fun erase(from: InkPoint, to: InkPoint, radius: Float): Boolean {
        val remaining = strokes.filterNot { stroke ->
            val threshold = radius + stroke.width / 2
            !stroke.isEraser && stroke.points.indices.any { i ->
                segmentsTouch(from, to, stroke.points[i], stroke.points[(i + 1).coerceAtMost(stroke.points.lastIndex)], threshold)
            }
        }
        if (remaining.size == strokes.size) return false
        strokes = remaining
        return true
    }
    fun finishErase() {
        beforeErase?.let { if (it !== strokes) rememberPrevious(it) }
        beforeErase = null
    }
    fun cancelErase() { beforeErase?.let { strokes = it }; beforeErase = null }
    fun undo() { if (canUndo) { future.addLast(strokes); strokes = past.removeLast() } }
    fun redo() { if (canRedo) { past.addLast(strokes); strokes = future.removeLast() } }
    fun release() { strokes = emptyList(); past.clear(); future.clear(); beforeErase = null }
}

private fun distance(p: InkPoint, a: InkPoint, b: InkPoint): Float {
    val dx = b.x - a.x; val dy = b.y - a.y
    val length = dx * dx + dy * dy
    val t = if (length == 0f) 0f else (((p.x-a.x)*dx + (p.y-a.y)*dy)/length).coerceIn(0f, 1f)
    return hypot(p.x-a.x-t*dx, p.y-a.y-t*dy)
}

private fun segmentsTouch(a: InkPoint, b: InkPoint, c: InkPoint, d: InkPoint, radius: Float): Boolean {
    fun cross(p: InkPoint, q: InkPoint, r: InkPoint) = (q.x-p.x)*(r.y-p.y)-(q.y-p.y)*(r.x-p.x)
    val abC = cross(a,b,c); val abD = cross(a,b,d)
    val cdA = cross(c,d,a); val cdB = cross(c,d,b)
    if (((abC > 0 && abD < 0) || (abC < 0 && abD > 0)) &&
        ((cdA > 0 && cdB < 0) || (cdA < 0 && cdB > 0))) return true
    return minOf(distance(a,c,d), distance(b,c,d), distance(c,a,b), distance(d,a,b)) <= radius
}
