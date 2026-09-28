package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

enum class MascotMood {
    HAPPY,
    CHEERING,
    CELEBRATING,
    STUDYING,
    SAD,
    PROUD,
    SURPRISED,
    WINKING,
    SHY,
    ANGRY
}

/**
 * Retorna el ID del recurso drawable real de Orstty según el estado de ánimo.
 */
fun getOrsttyDrawable(mood: MascotMood): Int {
    return when (mood) {
        MascotMood.HAPPY -> R.drawable.orstty_feliz
        MascotMood.CHEERING, MascotMood.CELEBRATING, MascotMood.PROUD -> R.drawable.orstty_contento
        MascotMood.STUDYING -> R.drawable.orstty_pensativo
        MascotMood.SAD -> R.drawable.orstty_triste
        MascotMood.SURPRISED -> R.drawable.orstty_sorprendido
        MascotMood.WINKING -> R.drawable.orstty_guinando
        MascotMood.SHY -> R.drawable.orstty_timido
        MascotMood.ANGRY -> R.drawable.orstty_enojado
    }
}

/**
 * Retorna el ID del recurso drawable real de Artyon según el estado de ánimo.
 */
fun getArtyonDrawable(mood: MascotMood): Int {
    return when (mood) {
        MascotMood.HAPPY -> R.drawable.artyon_feliz
        MascotMood.CHEERING, MascotMood.CELEBRATING, MascotMood.PROUD -> R.drawable.artyon_emocionado
        MascotMood.STUDYING -> R.drawable.artyon_pensativo
        MascotMood.SAD -> R.drawable.artyon_triste
        MascotMood.SURPRISED -> R.drawable.artyon_sorprendido
        MascotMood.WINKING -> R.drawable.artyon_guinando
        MascotMood.SHY -> R.drawable.artyon_timido
        MascotMood.ANGRY -> R.drawable.artyon_enojado
    }
}

/**
 * ORSTTY - Mascota Oficial RASTRO (Arte Original PNG con suave flotación física)
 */
@Composable
fun OrsttyMascot(
    size: Dp = 72.dp,
    mood: MascotMood = MascotMood.HAPPY,
    modifier: Modifier = Modifier
) {
    val infiniteTransition = rememberInfiniteTransition(label = "OrsttyMotion")
    val bounceY by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (mood == MascotMood.CHEERING) -7f else -3f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = if (mood == MascotMood.CHEERING) 600 else 1500,
                easing = FastOutSlowInEasing
            ),
            repeatMode = RepeatMode.Reverse
        ),
        label = "OrsttyBounce"
    )

    Box(
        modifier = modifier
            .size(size)
            .offset(y = bounceY.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = getOrsttyDrawable(mood)),
            contentDescription = "Orstty - Mascota RASTRO",
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxSize()
        )
    }
}

/**
 * ARTYON - Mascota Oficial RASTRO (Arte Original PNG con suave balanceo cósmico)
 */
@Composable
fun ArtyonMascot(
    size: Dp = 68.dp,
    mood: MascotMood = MascotMood.HAPPY,
    modifier: Modifier = Modifier
) {
    val infiniteTransition = rememberInfiniteTransition(label = "ArtyonMotion")
    val wiggleAngle by infiniteTransition.animateFloat(
        initialValue = -2.5f,
        targetValue = 2.5f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "ArtyonWiggle"
    )

    Box(
        modifier = modifier
            .size(size)
            .rotate(wiggleAngle),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = getArtyonDrawable(mood)),
            contentDescription = "Artyon - Mascota RASTRO",
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxSize()
        )
    }
}

/**
 * Pareja de Mascotas Oficial: Orstty y Artyon juntos
 */
@Composable
fun DualMascotDuo(
    size: Dp = 72.dp,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.size(size),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.artyon_feliz),
            contentDescription = "Artyon",
            contentScale = ContentScale.Fit,
            modifier = Modifier.weight(1f).fillMaxHeight()
        )
        Image(
            painter = painterResource(id = R.drawable.orstty_feliz),
            contentDescription = "Orstty",
            contentScale = ContentScale.Fit,
            modifier = Modifier.weight(1f).fillMaxHeight()
        )
    }
}

/**
 * Avatar circular de Orstty para botones e indicadores rápidos
 */
@Composable
fun OrsttyAvatarIcon(
    size: Dp = 24.dp,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.orstty_feliz),
        contentDescription = "Orstty Avatar",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(size)
            .clip(CircleShape)
    )
}

/**
 * Globo de Diálogo de la Mascota estilo Duolingo / Knowunity
 */
@Composable
fun MascotDialogueBubble(
    message: String,
    title: String = "Orstty dice:",
    mascotMood: MascotMood = MascotMood.HAPPY,
    theme: RastroPalette = ThemeManager.currentTheme,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RastroShapes.Squircle)
            .background(theme.surface)
            .border(1.dp, theme.borderSubtle, RastroShapes.Squircle)
            .padding(14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OrsttyMascot(size = 56.dp, mood = mascotMood)

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF8B5CF6)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    imageVector = Icons.Rounded.AutoAwesome,
                    contentDescription = null,
                    tint = Color(0xFFF59E0B),
                    modifier = Modifier.size(14.dp)
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = message,
                style = MaterialTheme.typography.bodySmall,
                color = theme.textPrimary,
                lineHeight = 17.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}
