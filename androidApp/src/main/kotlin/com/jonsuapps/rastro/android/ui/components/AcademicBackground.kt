package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.theme.RastroPalette
import kotlin.math.*

/** Default false: opt-in setting shared by all accounts; previews and dialogs keep their backgrounds. */
val LocalAcademicBackgroundPilot = staticCompositionLocalOf { false }

internal data class AcademicDoodle(val x: Float, val y: Float, val kind: Int, val angle: Float)

/** Coordinates in dp: more space means more symbols, never larger symbols. No random state. */
internal object AcademicPatternLayout {
    const val SYMBOL_DP = 48f
    const val SPACING_DP = 76f
    fun positions(widthDp: Float, heightDp: Float): List<AcademicDoodle> {
        if (!widthDp.isFinite() || !heightDp.isFinite() || widthDp < 40 || heightDp < 40) return emptyList()
        val margin = 34f
        val result = ArrayList<AcademicDoodle>()
        val rows = ceil(heightDp / SPACING_DP).toInt()
        val columns = ceil(widthDp / SPACING_DP).toInt()
        for (row in 0 until rows) for (column in 0 until columns) {
            val seed = ((row * 73856093) xor (column * 19349663)) and Int.MAX_VALUE
            val x = margin + 12f + column * SPACING_DP + (if (row % 2 == 0) 0f else 35f) + (seed % 19 - 9)
            val y = margin + 12f + row * SPACING_DP + ((seed / 19) % 19 - 9)
            // Keep complete small doodles within the viewport; no obvious cropped shapes at edges.
            if (x >= margin && y >= margin && x <= widthDp-margin && y <= heightDp-margin)
                result += AcademicDoodle(x, y, (seed / 361 + row + column * 5) % 14, (seed % 35 - 17).toFloat())
        }
        return result
    }
}

internal fun academicPatternInk(theme: RastroPalette): Color =
    lerp(theme.background, theme.textPrimary, if (theme.isLight) .075f else .085f)

/** One cached path, two draw calls, no bitmap, composable grid, animation or touch handler. */
@Composable
fun Modifier.rastroAcademicBackground(theme: RastroPalette, paintBase: Boolean = true): Modifier {
    if (!LocalAcademicBackgroundPilot.current) return if (paintBase) background(theme.background) else this
    val patternModifier = remember(theme.background, theme.textPrimary, theme.isLight) {
      Modifier.drawWithCache {
        val densityScale = 1.dp.toPx()
        val doodles = AcademicPatternLayout.positions(size.width / densityScale, size.height / densityScale)
        val pattern = Path()
        for (item in doodles) {
            val radians = item.angle * PI.toFloat() / 180f
            val c = cos(radians); val s = sin(radians)
            fun point(x: Float, y: Float): Pair<Float, Float> {
                val dx = (x-12f) * (AcademicPatternLayout.SYMBOL_DP / 24f)
                val dy = (y-12f) * (AcademicPatternLayout.SYMBOL_DP / 24f)
                return ((item.x+dx*c-dy*s)*densityScale) to ((item.y+dx*s+dy*c)*densityScale)
            }
            fun line(vararg xy: Float) {
                xy.toList().chunked(2).forEachIndexed { i, p ->
                    val (x,y) = point(p[0],p[1])
                    if(i==0) pattern.moveTo(x,y) else pattern.lineTo(x,y)
                }
            }
            fun oval(cx: Float, cy: Float, rx: Float, ry: Float) {
                for(i in 0..20) {
                    val a=i*PI.toFloat()/10f; val (x,y)=point(cx+rx*cos(a),cy+ry*sin(a))
                    if(i==0) pattern.moveTo(x,y) else pattern.lineTo(x,y)
                }
            }
            when(item.kind) {
                0 -> { // book
                    line(2f,4f,12f,6f,22f,4f,22f,20f,12f,22f,2f,20f,2f,4f)
                    line(12f,6f,12f,22f); line(5f,8f,9f,9f); line(15f,9f,19f,8f)
                }
                1 -> { line(3f,21f,5f,15f,17f,3f,21f,7f,9f,19f,3f,21f); line(5f,15f,9f,19f); line(15f,5f,19f,9f) }
                2 -> { line(2f,6f,22f,6f,22f,17f,2f,17f,2f,6f); for(x in 5..20 step 4) line(x.toFloat(),6f,x.toFloat(),10f) }
                3 -> { line(3f,3f,3f,21f,21f,21f,3f,3f); line(7f,12f,7f,17f,12f,17f,7f,12f) }
                4 -> { oval(12f,8f,6f,6f); line(8f,13f,9f,18f,15f,18f,16f,13f); line(9f,21f,15f,21f) }
                5 -> { oval(12f,12f,10f,4f); oval(12f,12f,4f,10f); oval(12f,12f,1f,1f) }
                6 -> { line(8f,2f,16f,2f); line(9f,2f,9f,10f,3f,20f,3f,22f,21f,22f,21f,20f,15f,10f,15f,2f); line(6f,16f,18f,16f) }
                7 -> { line(12f,2f,15f,8f,22f,9f,17f,14f,18f,21f,12f,18f,6f,21f,7f,14f,2f,9f,9f,8f,12f,2f) }
                8 -> { line(3f,21f,12f,12f,21f,3f); line(4f,19f,3f,12f,7f,5f,21f,3f,19f,17f,12f,21f,4f,19f) }
                9 -> { line(1f,8f,12f,3f,23f,8f,12f,13f,1f,8f); line(5f,10f,5f,17f,12f,20f,19f,17f,19f,10f); line(23f,8f,23f,18f) }
                10 -> line(2f,13f,5f,13f,8f,21f,13f,4f,23f,4f)
                11 -> line(21f,3f,4f,3f,13f,12f,4f,21f,21f,21f)
                12 -> { line(3f,9f,12f,20f); line(12f,9f,3f,20f); line(16f,4f,20f,3f,22f,5f,16f,10f,22f,10f) }
                else -> { line(3f,4f,9f,4f,9f,21f); line(6f,8f,20f,8f); line(15f,8f,15f,21f,19f,21f) }
            }
        }
        val ink = academicPatternInk(theme)
        val stroke = Stroke(width = 1.7.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round)
        onDrawBehind {
            drawRect(theme.background)
            drawPath(pattern, ink, style = stroke)
        }
      }
    }
    return then(patternModifier)
}
