package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform

/** Opaque fills and outlined vector paths. Decorative: the card's text carries the meaning. */
@Composable
internal fun AcademicContextDoodle(artwork: AcademicArtwork, modifier: Modifier = Modifier) {
    Canvas(modifier) {
        withTransform({ scale(size.width / 100f, size.height / 100f, Offset.Zero) }) {
            val ink = Color(0xFF253344)
            val blue = Color(0xFF38BDF8)
            val green = Color(0xFF34D399)
            val cream = Color(0xFFFFF1BC)
            val purple = Color(0xFFA78BFA)
            val orange = Color(0xFFFB923C)
            fun line(x: Float, y: Float, xx: Float, yy: Float, c: Color = ink) =
                drawLine(c, Offset(x, y), Offset(xx, yy), 3f, StrokeCap.Round)
            fun circle(x: Float, y: Float, r: Float, c: Color) {
                drawCircle(c, r, Offset(x, y)); drawCircle(ink, r, Offset(x, y), style = Stroke(2.6f))
            }
            fun rect(x: Float, y: Float, w: Float, h: Float, c: Color) {
                drawRoundRect(c, Offset(x, y), Size(w, h), CornerRadius(6f))
                drawRoundRect(ink, Offset(x, y), Size(w, h), CornerRadius(6f), style = Stroke(2.6f))
            }
            fun shape(c: Color, build: Path.() -> Unit) {
                val path = Path().apply(build)
                drawPath(path, c); drawPath(path, ink, style = Stroke(2.6f))
            }
            when (artwork) {
                AcademicArtwork.GLOBE -> {
                    line(51f, 77f, 51f, 87f); rect(32f, 86f, 39f, 7f, cream)
                    circle(50f, 43f, 33f, blue)
                    shape(green) { moveTo(24f,25f); lineTo(42f,18f); lineTo(49f,33f); lineTo(40f,45f); lineTo(28f,41f); close() }
                    shape(green) { moveTo(55f,45f); lineTo(76f,40f); lineTo(74f,62f); lineTo(58f,70f); lineTo(49f,57f); close() }
                }
                AcademicArtwork.PIN -> {
                    shape(cream) { moveTo(12f,47f); lineTo(35f,40f); lineTo(64f,48f); lineTo(87f,40f); lineTo(87f,86f); lineTo(64f,93f); lineTo(35f,85f); lineTo(12f,93f); close() }
                    line(35f,53f,35f,84f); line(64f,61f,64f,90f)
                    shape(orange) { moveTo(50f,66f); cubicTo(18f,39f,24f,12f,50f,12f); cubicTo(76f,12f,82f,39f,50f,66f); close() }
                    circle(50f,33f,9f,cream)
                }
                AcademicArtwork.WEATHER -> {
                    circle(37f,34f,20f,Color(0xFFFACC15))
                    for (i in 0..7) {
                        val a = i * Math.PI / 4
                        line(37f+27f*kotlin.math.cos(a).toFloat(),34f+27f*kotlin.math.sin(a).toFloat(),37f+33f*kotlin.math.cos(a).toFloat(),34f+33f*kotlin.math.sin(a).toFloat())
                    }
                    shape(Color(0xFFE0F2FE)) { moveTo(26f,72f); cubicTo(7f,67f,14f,45f,31f,48f); cubicTo(35f,21f,70f,25f,73f,47f); cubicTo(94f,44f,96f,73f,76f,74f); close() }
                    line(38f,82f,34f,90f,blue); line(59f,82f,55f,90f,blue)
                }
                AcademicArtwork.MOUNTAIN -> {
                    shape(purple) { moveTo(5f,85f); lineTo(39f,17f); lineTo(67f,85f); close() }
                    shape(green) { moveTo(40f,85f); lineTo(68f,33f); lineTo(94f,85f); close() }
                    shape(cream) { moveTo(26f,43f); lineTo(39f,17f); lineTo(50f,43f); lineTo(38f,38f); close() }
                }
                AcademicArtwork.WATER -> {
                    shape(blue) { moveTo(50f,8f); cubicTo(43f,25f,21f,45f,23f,61f); cubicTo(24f,95f,77f,95f,77f,61f); cubicTo(77f,43f,57f,22f,50f,8f); close() }
                    drawPath(Path().apply { moveTo(34f,64f); quadraticTo(46f,79f,62f,65f) }, cream, style=Stroke(4f, cap=StrokeCap.Round))
                }
                AcademicArtwork.PEOPLE -> {
                    rect(5f,52f,28f,32f,green); rect(67f,52f,28f,32f,orange)
                    circle(19f,37f,12f,cream); circle(81f,37f,12f,cream)
                    rect(30f,54f,40f,38f,purple); circle(50f,33f,17f,cream)
                }
                AcademicArtwork.SCROLL -> {
                    rect(25f,13f,54f,70f,cream); circle(25f,21f,10f,orange)
                    line(43f,32f,67f,32f); line(40f,45f,66f,45f); line(40f,58f,61f,58f)
                    rect(16f,74f,62f,15f,Color(0xFFFACC15))
                }
                AcademicArtwork.SCALES -> {
                    rect(29f,85f,43f,8f,cream); line(50f,22f,50f,85f); line(15f,32f,85f,32f)
                    circle(50f,22f,7f,orange)
                    for (x in listOf(24f,76f)) {
                        line(x,34f,x-14f,61f); line(x,34f,x+14f,61f)
                        shape(blue) { moveTo(x-15f,61f); lineTo(x+15f,61f); quadraticTo(x,83f,x-15f,61f); close() }
                    }
                }
                AcademicArtwork.MATH -> {
                    rect(10f,10f,80f,80f,cream); line(50f,12f,50f,88f); line(12f,50f,88f,50f)
                    line(20f,30f,40f,30f); line(30f,20f,30f,40f)
                    line(61f,30f,80f,30f)
                    line(22f,62f,38f,78f); line(38f,62f,22f,78f)
                    line(61f,65f,80f,65f); line(61f,75f,80f,75f)
                }
                AcademicArtwork.TRIANGLE -> {
                    shape(orange) { moveTo(17f,82f); lineTo(17f,20f); lineTo(88f,82f); close() }
                    line(17f,66f,33f,66f); line(33f,66f,33f,82f)
                    circle(17f,20f,4f,cream); circle(88f,82f,4f,cream)
                }
                AcademicArtwork.SPEECH -> {
                    shape(purple) { moveTo(19f,15f); lineTo(81f,15f); quadraticTo(91f,15f,91f,27f); lineTo(91f,66f); quadraticTo(91f,77f,78f,77f); lineTo(44f,77f); lineTo(23f,92f); lineTo(23f,77f); quadraticTo(9f,77f,9f,64f); lineTo(9f,27f); quadraticTo(9f,15f,19f,15f); close() }
                    line(26f,35f,74f,35f,cream); line(26f,49f,68f,49f,cream); line(26f,63f,56f,63f,cream)
                }
                AcademicArtwork.IDEA -> {
                    shape(Color(0xFFFACC15)) { moveTo(35f,71f); lineTo(35f,64f); cubicTo(3f,32f,27f,9f,50f,9f); cubicTo(75f,9f,96f,35f,65f,64f); lineTo(65f,71f); close() }
                    rect(35f,72f,30f,12f,purple); line(42f,91f,58f,91f)
                    line(43f,70f,40f,46f); line(58f,70f,61f,46f); line(40f,46f,61f,46f)
                }
                AcademicArtwork.CELL -> {
                    shape(Color(0xFFFDA4AF)) { moveTo(16f,28f); cubicTo(40f,-1f,86f,12f,90f,49f); cubicTo(97f,87f,41f,102f,17f,77f); cubicTo(3f,64f,5f,42f,16f,28f); close() }
                    circle(52f,49f,19f,purple); circle(53f,49f,7f,cream)
                    circle(25f,42f,5f,green); circle(37f,76f,5f,green); circle(77f,69f,5f,green)
                }
                AcademicArtwork.PAW -> {
                    shape(orange) { moveTo(27f,64f); cubicTo(35f,42f,65f,42f,73f,64f); cubicTo(92f,92f,54f,86f,50f,81f); cubicTo(44f,87f,9f,91f,27f,64f); close() }
                    circle(16f,42f,10f,cream); circle(36f,23f,11f,cream); circle(64f,23f,11f,cream); circle(84f,42f,10f,cream)
                }
                else -> error("Existing dedicated drawing must be used for $artwork")
            }
        }
    }
}
