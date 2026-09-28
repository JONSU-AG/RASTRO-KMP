package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

/** Stars land separately with spring overshoot; empty stars remain visible. */
@Composable
internal fun EarnedStars(stars: Int) {
    Row(Modifier.semantics { contentDescription = "$stars de 3 estrellas" },
        horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        repeat(3) { index ->
            val landing = remember { Animatable(0f) }
            LaunchedEffect(stars) {
                delay(250L + index * 280L)
                landing.animateTo(1f, spring(dampingRatio = 0.48f, stiffness = 220f))
            }
            Box(Modifier.size(54.dp)) {
                Icon(Icons.Rounded.Star, null, Modifier.fillMaxSize(), tint = Color(0xFFD3DCE6))
                if (index < stars) Icon(Icons.Rounded.Star, null,
                    Modifier.fillMaxSize().graphicsLayer {
                        scaleX = landing.value
                        scaleY = landing.value
                        translationY = (1f - landing.value) * -65.dp.toPx()
                        rotationZ = (1f - landing.value) * -25f
                        alpha = landing.value.coerceIn(0f, 1f)
                    }, tint = Color(0xFFFFBF24))
            }
        }
    }
}

/** Original vector chest. The lid opens and gold sparkles appear after claiming. */
@Composable
internal fun RewardChest(open: Boolean, modifier: Modifier = Modifier) {
    val opening by animateFloatAsState(if (open) 1f else 0f,
        spring(dampingRatio = 0.55f, stiffness = 180f), label = "chestLid")
    Canvas(modifier.semantics { contentDescription = if (open) "Cofre abierto" else "Cofre de XP" }) {
        val unit = size.minDimension / 64f
        withTransform({ scale(unit, unit, pivot = Offset.Zero) }) {
            val outline = Color(0xFF713C17)
            drawRoundRect(outline, Offset(8f, 29f), Size(48f, 30f), CornerRadius(6f))
            drawRoundRect(Color(0xFFCF741D), Offset(9f, 25f), Size(46f, 30f), CornerRadius(5f))
            drawRoundRect(Color(0xFFFFC64D), Offset(11f, 27f), Size(42f, 26f), CornerRadius(4f), style = Stroke(3f))
            drawLine(outline, Offset(18f, 30f), Offset(18f, 51f), 2f)
            drawLine(outline, Offset(46f, 30f), Offset(46f, 51f), 2f)
            withTransform({ rotate(-opening * 28f, pivot = Offset(10f, 28f)) }) {
                drawRoundRect(Color(0xFFAB4F22), Offset(8f, 14f), Size(48f, 20f), CornerRadius(7f))
                drawRoundRect(Color(0xFFFFD264), Offset(8f, 14f), Size(48f, 20f), CornerRadius(7f), style = Stroke(3f))
                drawLine(Color(0xFFFFEBAD), Offset(15f, 19f), Offset(48f, 19f), 2f)
            }
            drawRoundRect(Color(0xFFFFDA58), Offset(26f, 29f), Size(12f, 14f), CornerRadius(3f))
            drawCircle(outline, 2f, Offset(32f, 35f))
            drawLine(outline, Offset(32f, 35f), Offset(32f, 39f), 2f)
            if (opening > 0f) repeat(4) { index ->
                val x = 17f + index * 10f
                val y = 19f - opening * (8f + index % 2 * 9f)
                drawLine(Color(0xFFFFC029), Offset(x - 3f, y), Offset(x + 3f, y), 2f)
                drawLine(Color(0xFFFFC029), Offset(x, y - 3f), Offset(x, y + 3f), 2f)
            }
        }
    }
}
