package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Corazón SVG animado con latido cardíaco elástico (diástole-sístole)
 * y respiración continua cuando está en estado reactivo.
 */
@Composable
fun AnimatedHeartIcon(
    isReacted: Boolean,
    modifier: Modifier = Modifier.size(17.dp),
    activeColor: Color = Color(0xFFEF4444)
) {
    // Escala del latido al reaccionar
    val heartScale = remember { Animatable(1f) }

    // Latido sutil continuo cuando está activado
    val infiniteTransition = rememberInfiniteTransition(label = "heartBreathing")
    val breathingScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = if (isReacted) 1.08f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "heartBreathScale"
    )

    // Disparar latido potente al activarse
    LaunchedEffect(isReacted) {
        if (isReacted) {
            // Doble latido de corazón
            heartScale.animateTo(1.38f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessHigh))
            heartScale.animateTo(1.10f, tween(80))
            heartScale.animateTo(1.25f, tween(100))
            heartScale.animateTo(1.0f, spring(dampingRatio = Spring.DampingRatioLowBouncy, stiffness = Spring.StiffnessMedium))
        } else {
            heartScale.snapTo(1f)
        }
    }

    Box(
        modifier = modifier
            .graphicsLayer {
                val s = heartScale.value * (if (isReacted) breathingScale else 1f)
                scaleX = s
                scaleY = s
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_reaction_heart),
            contentDescription = "Corazón",
            tint = Color.Unspecified,
            modifier = Modifier.matchParentSize()
        )
    }
}

/**
 * Fuego SVG animado con llamas vivas que oscilan y fluctúan en escala vertical
 * simulando el comportamiento físico de una fogata activa.
 */
@Composable
fun AnimatedFlameIcon(
    isReacted: Boolean,
    modifier: Modifier = Modifier.size(17.dp)
) {
    // Oscilación lateral continua del fuego
    val infiniteTransition = rememberInfiniteTransition(label = "flameDance")
    val flameRotation by infiniteTransition.animateFloat(
        initialValue = -7f,
        targetValue = 7f,
        animationSpec = infiniteRepeatable(
            animation = tween(450, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "flameRot"
    )
    val flameScaleY by infiniteTransition.animateFloat(
        initialValue = 0.95f,
        targetValue = 1.15f,
        animationSpec = infiniteRepeatable(
            animation = tween(380, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "flameScaleY"
    )

    // Pop de ignición al encender
    val ignitionScale = remember { Animatable(1f) }
    LaunchedEffect(isReacted) {
        if (isReacted) {
            ignitionScale.animateTo(1.35f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessHigh))
            ignitionScale.animateTo(1.0f, spring(dampingRatio = Spring.DampingRatioLowBouncy, stiffness = Spring.StiffnessMedium))
        } else {
            ignitionScale.snapTo(1f)
        }
    }

    Box(
        modifier = modifier
            .graphicsLayer {
                rotationZ = if (isReacted) flameRotation else 0f
                scaleY = ignitionScale.value * (if (isReacted) flameScaleY else 1f)
                scaleX = ignitionScale.value
                transformOrigin = TransformOrigin(0.5f, 0.9f)
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_reaction_fire),
            contentDescription = "Fuego",
            tint = Color.Unspecified,
            modifier = Modifier.matchParentSize()
        )
    }
}

/**
 * Pulgar Arriba (Like 👍) animado con resorte de asentimiento elástico
 * y chispitas / rotación al dar like.
 */
@Composable
fun AnimatedThumbUpIcon(
    isReacted: Boolean,
    modifier: Modifier = Modifier.size(17.dp),
    activeColor: Color = Color(0xFF0284C7),
    inactiveColor: Color = Color(0xFF64748B)
) {
    val thumbScale = remember { Animatable(1f) }
    val thumbRotate = remember { Animatable(0f) }

    LaunchedEffect(isReacted) {
        if (isReacted) {
            // Animación de impulso y asentimiento
            launch {
                thumbScale.animateTo(1.42f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessHigh))
                thumbScale.animateTo(1.0f, spring(dampingRatio = Spring.DampingRatioLowBouncy, stiffness = Spring.StiffnessMedium))
            }
            launch {
                thumbRotate.animateTo(-24f, tween(80, easing = FastOutSlowInEasing))
                thumbRotate.animateTo(12f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessHigh))
                thumbRotate.animateTo(0f, spring(dampingRatio = Spring.DampingRatioLowBouncy, stiffness = Spring.StiffnessMedium))
            }
        } else {
            thumbScale.snapTo(1f)
            thumbRotate.snapTo(0f)
        }
    }

    Box(
        modifier = modifier
            .graphicsLayer {
                scaleX = thumbScale.value
                scaleY = thumbScale.value
                rotationZ = thumbRotate.value
                transformOrigin = TransformOrigin(0.2f, 0.8f) // Pivote en la muñeca
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.ThumbUp,
            contentDescription = "Like",
            tint = if (isReacted) activeColor else inactiveColor,
            modifier = Modifier.matchParentSize()
        )
    }
}
