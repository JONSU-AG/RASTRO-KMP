package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

/** A finite, small XP burst; the chest remains the prepared Lottie artwork. */
@Composable fun ChestXpParticles(modifier: Modifier = Modifier) {
    val travel = remember { Animatable(0f) }
    LaunchedEffect(Unit) { travel.animateTo(1f, tween(1000)) }
    Box(modifier, contentAlignment = Alignment.Center) {
        repeat(7) { index ->
            Icon(Icons.Rounded.Star, null, Modifier.size(15.dp).graphicsLayer {
                translationX = (index - 3) * 18.dp.toPx() * travel.value
                translationY = -travel.value * (70 + index % 3 * 20).dp.toPx()
                rotationZ = travel.value * (index - 3) * 20f
                scaleX = 1f - travel.value * 0.45f; scaleY = scaleX
                alpha = 1f - travel.value
            }, tint = Color(0xFFFFBF24))
        }
    }
}
