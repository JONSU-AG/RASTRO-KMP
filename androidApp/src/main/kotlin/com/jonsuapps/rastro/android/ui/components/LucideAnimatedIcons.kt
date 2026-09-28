package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.BookmarkBorder
import androidx.compose.material.icons.rounded.BookmarkAdd
import androidx.compose.material.icons.rounded.BookmarkAdded
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.rounded.ChatBubbleOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Lucide Animated Icons para Jetpack Compose:
 * Inspirados en https://lucide-animated.com/
 * Proporcionan micro-animaciones vectoriales elásticas en Compose para acciones
 * de guardado, favoritos, eliminar, búsqueda, notificaciones, etc.
 */

/**
 * 1. Lucide Bookmark / Guardar Animado
 */
@Composable
fun LucideBookmarkIcon(
    isBookmarked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    activeColor: Color = Color(0xFF6366F1),
    inactiveColor: Color = Color(0xFF94A3B8),
    size: Dp = 22.dp
) {
    val haptic = LocalHapticFeedback.current
    var isTriggered by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isTriggered) 1.38f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "BookmarkScale",
        finishedListener = { isTriggered = false }
    )

    val tint by animateColorAsState(
        targetValue = if (isBookmarked) activeColor else inactiveColor,
        animationSpec = spring(stiffness = Spring.StiffnessLow),
        label = "BookmarkTint"
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isTriggered = true
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            }
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = if (isBookmarked) Icons.Rounded.BookmarkAdded else Icons.Rounded.BookmarkAdd,
            contentDescription = if (isBookmarked) "Guardado" else "Guardar",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 2. Lucide Star / Favorito Animado
 */
@Composable
fun LucideStarIcon(
    isStarred: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    activeColor: Color = Color(0xFFF59E0B),
    inactiveColor: Color = Color(0xFF94A3B8),
    size: Dp = 22.dp
) {
    val haptic = LocalHapticFeedback.current
    var isTriggered by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isTriggered) 1.38f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "StarScale",
        finishedListener = { isTriggered = false }
    )

    val rotation by animateFloatAsState(
        targetValue = if (isStarred) 72f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "StarRotation"
    )

    val tint by animateColorAsState(
        targetValue = if (isStarred) activeColor else inactiveColor,
        animationSpec = spring(stiffness = Spring.StiffnessLow),
        label = "StarTint"
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isTriggered = true
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            }
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
                rotationZ = rotation
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = if (isStarred) Icons.Rounded.Star else Icons.Rounded.StarOutline,
            contentDescription = "Favorito",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 3. Lucide Trash / Eliminar Animado (Saccadic Shake + Pop)
 */
@Composable
fun LucideTrashIcon(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color(0xFFEF4444),
    size: Dp = 20.dp
) {
    val haptic = LocalHapticFeedback.current
    val shakeAnim = remember { Animatable(0f) }

    LaunchedEffect(shakeAnim.targetValue) {
        if (shakeAnim.targetValue != 0f) {
            shakeAnim.animateTo(12f, spring(stiffness = Spring.StiffnessHigh))
            shakeAnim.animateTo(-12f, spring(stiffness = Spring.StiffnessHigh))
            shakeAnim.animateTo(6f, spring(stiffness = Spring.StiffnessHigh))
            shakeAnim.animateTo(0f, spring(stiffness = Spring.StiffnessHigh))
        }
    }

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            }
            .graphicsLayer {
                rotationZ = shakeAnim.value
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.Delete,
            contentDescription = "Eliminar",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 4. Lucide Plus / Agregar Animado
 */
@Composable
fun LucidePlusIcon(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color.White,
    size: Dp = 20.dp
) {
    var isRotated by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (isRotated) 90f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "PlusRotation",
        finishedListener = { isRotated = false }
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isRotated = true
                onClick()
            }
            .graphicsLayer {
                rotationZ = rotation
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.Add,
            contentDescription = "Agregar",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 5. Lucide Heart / Me Gusta Animado
 */
@Composable
fun LucideHeartIcon(
    isLiked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    activeColor: Color = Color(0xFFEC4899),
    inactiveColor: Color = Color(0xFF94A3B8),
    size: Dp = 22.dp
) {
    val haptic = LocalHapticFeedback.current
    var isTriggered by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isTriggered) 1.45f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioHighBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "HeartScale",
        finishedListener = { isTriggered = false }
    )

    val tint by animateColorAsState(
        targetValue = if (isLiked) activeColor else inactiveColor,
        animationSpec = spring(stiffness = Spring.StiffnessLow),
        label = "HeartTint"
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isTriggered = true
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            }
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = if (isLiked) Icons.Rounded.Favorite else Icons.Rounded.FavoriteBorder,
            contentDescription = "Me gusta",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 6. Lucide Bell / Notificación Animada (Péndulo)
 */
@Composable
fun LucideBellIcon(
    hasUnread: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    activeColor: Color = Color(0xFFF59E0B),
    inactiveColor: Color = Color(0xFF64748B),
    size: Dp = 22.dp
) {
    val haptic = LocalHapticFeedback.current
    var isRinging by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (isRinging) 18f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessHigh
        ),
        label = "BellRing",
        finishedListener = { isRinging = false }
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isRinging = true
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            }
            .graphicsLayer {
                rotationZ = rotation
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.Notifications,
            contentDescription = "Notificaciones",
            tint = if (hasUnread) activeColor else inactiveColor,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 7. Lucide Settings / Engranaje Animado (Giro 180°)
 */
@Composable
fun LucideSettingsIcon(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color(0xFF64748B),
    size: Dp = 22.dp
) {
    var isSpinning by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (isSpinning) 180f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "SettingsRotation",
        finishedListener = { isSpinning = false }
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isSpinning = true
                onClick()
            }
            .graphicsLayer {
                rotationZ = rotation
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.Settings,
            contentDescription = "Ajustes",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 8. Lucide Share / Compartir Animado (Icono SVG sin texto)
 */
@Composable
fun LucideShareIcon(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color(0xFF64748B),
    size: Dp = 20.dp
) {
    val haptic = LocalHapticFeedback.current
    var isTriggered by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isTriggered) 1.12f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "ShareScale",
        finishedListener = { isTriggered = false }
    )

    val rotation by animateFloatAsState(
        targetValue = if (isTriggered) -22f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessHigh
        ),
        label = "ShareRotation"
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isTriggered = true
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            }
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
                rotationZ = rotation
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.Share,
            contentDescription = "Compartir",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}

/**
 * 9. Lucide Chat / Comentarios Animado
 */
@Composable
fun LucideChatIcon(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color(0xFF64748B),
    size: Dp = 20.dp
) {
    var isTriggered by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isTriggered) 1.30f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "ChatScale",
        finishedListener = { isTriggered = false }
    )

    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                isTriggered = true
                onClick()
            }
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.ChatBubbleOutline,
            contentDescription = "Comentarios",
            tint = tint,
            modifier = Modifier.size(size)
        )
    }
}
