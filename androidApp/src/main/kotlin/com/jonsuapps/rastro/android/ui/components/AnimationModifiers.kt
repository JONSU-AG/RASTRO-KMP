package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

enum class ButtonPressState { Idle, Pressed }

/**
 * Efecto Bouncy Click estilo Duolingo / Apple iOS:
 * Al tocar el botón o tarjeta, se comprime suavemente con física de resorte (spring)
 * y ejecuta una vibración háptica instantánea.
 */
@Composable
fun Modifier.bouncyClick(
    scaleDown: Float = 0.93f,
    hapticType: HapticFeedbackType? = null,
    enabled: Boolean = true,
    onClick: () -> Unit
): Modifier {
    if (!enabled) return this

    var buttonState by remember { mutableStateOf(ButtonPressState.Idle) }
    val haptic = LocalHapticFeedback.current
    val scope = rememberCoroutineScope()
    var pressJob by remember { mutableStateOf<Job?>(null) }

    val scale by animateFloatAsState(
        targetValue = if (buttonState == ButtonPressState.Pressed) scaleDown else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "BouncyScale"
    )

    return this
        .graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .pointerInput(enabled) {
            if (!enabled) return@pointerInput
            awaitPointerEventScope {
                while (true) {
                    awaitFirstDown(false)
                    pressJob?.cancel()
                    buttonState = ButtonPressState.Pressed
                    val downTime = System.currentTimeMillis()
                    val up = waitForUpOrCancellation()
                    val elapsed = System.currentTimeMillis() - downTime

                    pressJob = scope.launch {
                        if (elapsed < 110) {
                            delay(110 - elapsed)
                        }
                        buttonState = ButtonPressState.Idle
                    }
                    if (up != null) {
                        hapticType?.let { haptic.performHapticFeedback(it) }
                        onClick()
                    }
                }
            }
        }
}

/**
 * Efecto Glassmorphism estilo Apple iOS:
 * Fondo translúcido con gradiente suave, borde especular (highlight) y esquinas redondeadas continuas.
 */
fun Modifier.appleGlass(
    cornerRadius: Dp = 24.dp,
    shape: Shape = RoundedCornerShape(cornerRadius),
    isDark: Boolean = false,
    alpha: Float = if (isDark) 0.65f else 0.75f,
    tintColor: Color? = null
): Modifier {
    val baseColor = tintColor ?: if (isDark) Color(0xFF161618) else Color(0xFFFFFFFF)
    val backgroundBrush = Brush.linearGradient(
        colors = listOf(
            baseColor.copy(alpha = alpha),
            baseColor.copy(alpha = alpha * 0.85f)
        ),
        start = Offset(0f, 0f),
        end = Offset(0f, Float.POSITIVE_INFINITY)
    )

    val borderBrush = Brush.linearGradient(
        colors = if (isDark) {
            listOf(
                Color.White.copy(alpha = 0.22f),
                Color.White.copy(alpha = 0.06f),
                Color.Black.copy(alpha = 0.35f)
            )
        } else {
            listOf(
                Color.White.copy(alpha = 0.85f),
                Color.White.copy(alpha = 0.35f),
                Color.White.copy(alpha = 0.15f)
            )
        },
        start = Offset(0f, 0f),
        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
    )

    return this
        .clip(shape)
        .background(backgroundBrush)
        .border(width = 1.dp, brush = borderBrush, shape = shape)
}

/**
 * Micro-animación de respiración / pulso continuo para badges, rachas o iconos activos.
 */
@Composable
fun rememberBreathingPulse(
    minScale: Float = 0.95f,
    maxScale: Float = 1.05f,
    durationMillis: Int = 1500
): State<Float> {
    val infiniteTransition = rememberInfiniteTransition(label = "PulseTransition")
    return infiniteTransition.animateFloat(
        initialValue = minScale,
        targetValue = maxScale,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "PulseScale"
    )
}

/**
 * Efecto de carga esqueleto (Shimmer / Skeleton loading estilo YouTube):
 * Reemplaza los spinners por una animación reflectante que precarga la silueta del layout.
 */
@Composable
fun Modifier.shimmerLoadingAnimation(
    isDark: Boolean = false,
    durationMillis: Int = 1100
): Modifier {
    val transition = rememberInfiniteTransition(label = "ShimmerTransition")
    val translateAnim by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1200f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = durationMillis,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "ShimmerTranslate"
    )

    val shimmerColors = if (isDark) {
        listOf(
            Color(0xFF262629),
            Color(0xFF38383D),
            Color(0xFF262629)
        )
    } else {
        listOf(
            Color(0xFFE2E8F0),
            Color(0xFFF1F5F9),
            Color(0xFFE2E8F0)
        )
    }

    val brush = Brush.linearGradient(
        colors = shimmerColors,
        start = Offset(translateAnim - 400f, translateAnim - 400f),
        end = Offset(translateAnim, translateAnim)
    )

    return this.background(brush)
}

@Composable
fun SkeletonBox(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(8.dp),
    isDark: Boolean = false
) {
    Box(
        modifier = modifier
            .clip(shape)
            .shimmerLoadingAnimation(isDark = isDark)
    )
}

@Composable
fun SkeletonCourseCard(
    theme: RastroPalette
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RastroShapes.Squircle,
        colors = CardDefaults.cardColors(containerColor = theme.surface),
        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
            ) {
                SkeletonBox(
                    modifier = Modifier
                        .width(80.dp)
                        .height(20.dp),
                    shape = RastroShapes.Pill,
                    isDark = !theme.isLight
                )
                SkeletonBox(
                    modifier = Modifier
                        .width(50.dp)
                        .height(14.dp),
                    isDark = !theme.isLight
                )
            }
            SkeletonBox(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(18.dp),
                isDark = !theme.isLight
            )
            SkeletonBox(
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .height(14.dp),
                isDark = !theme.isLight
            )
            SkeletonBox(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(38.dp),
                shape = RastroShapes.Pill,
                isDark = !theme.isLight
            )
        }
    }
}

@Composable
fun SkeletonPostCard(
    theme: RastroPalette
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = theme.surface),
        border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                SkeletonBox(
                    modifier = Modifier.size(40.dp),
                    shape = CircleShape,
                    isDark = !theme.isLight
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    SkeletonBox(
                        modifier = Modifier
                            .width(120.dp)
                            .height(14.dp),
                        isDark = !theme.isLight
                    )
                    SkeletonBox(
                        modifier = Modifier
                            .width(70.dp)
                            .height(10.dp),
                        isDark = !theme.isLight
                    )
                }
            }
            SkeletonBox(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp),
                isDark = !theme.isLight
            )
            SkeletonBox(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp),
                shape = RoundedCornerShape(14.dp),
                isDark = !theme.isLight
            )
        }
    }
}

/**
 * Botón Físico 3D estilo Cartoon / Sticker (como la referencia "Ganar XP"):
 * Posee trazo exterior visible, base o bisel inferior sólido 3D (bevel) y se hunde al tocarlo,
 * eliminando la sensación de botón plano y dando respuesta táctil viva.
 */
@Composable
fun Sticker3dButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    containerColor: Color = Color(0xFFF472B6), // Rosa vívido de referencia
    bottomBevelColor: Color? = null,
    strokeColor: Color = Color(0xFF2A0824), // Trazo contorneado oscuro estilo dibujo/sticker
    strokeWidth: Dp = 1.8.dp,
    bevelHeight: Dp = 4.dp,
    shape: Shape = RastroShapes.Pill,
    contentPadding: PaddingValues = PaddingValues(horizontal = 20.dp, vertical = 10.dp),
    content: @Composable RowScope.() -> Unit
) {
    var isPressedState by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    var pressJob by remember { mutableStateOf<Job?>(null) }
    val haptic = LocalHapticFeedback.current

    // Color del bisel inferior (más oscuro y saturado para la sombra 3D física)
    val actualBottomColor = bottomBevelColor ?: remember(containerColor) {
        val hsl = FloatArray(3)
        androidx.core.graphics.ColorUtils.colorToHSL(
            android.graphics.Color.argb(
                (containerColor.alpha * 255).toInt(),
                (containerColor.red * 255).toInt(),
                (containerColor.green * 255).toInt(),
                (containerColor.blue * 255).toInt()
            ),
            hsl
        )
        hsl[2] = (hsl[2] * 0.65f).coerceIn(0f, 1f) // Más oscuro
        Color(androidx.core.graphics.ColorUtils.HSLToColor(hsl))
    }

    val animatedOffset by animateDpAsState(
        targetValue = if (isPressedState && enabled) bevelHeight else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "Sticker3dOffset"
    )

    Box(
        modifier = modifier
            .padding(bottom = bevelHeight)
            .pointerInput(enabled) {
                if (!enabled) return@pointerInput
                awaitPointerEventScope {
                    while (true) {
                        awaitFirstDown(false)
                        pressJob?.cancel()
                        isPressedState = true
                        val downTime = System.currentTimeMillis()
                        val up = waitForUpOrCancellation()
                        val elapsed = System.currentTimeMillis() - downTime

                        pressJob = scope.launch {
                            if (elapsed < 110) {
                                delay(110 - elapsed)
                            }
                            isPressedState = false
                        }
                        if (up != null) {
                            onClick()
                        }
                    }
                }
            },
        propagateMinConstraints = true
    ) {
        // 1. Capa Inferior 3D (Bevel / Sombra física sólida perfectamente alineada)
        Box(
            modifier = Modifier
                .matchParentSize()
                .offset(y = bevelHeight)
                .clip(shape)
                .background(if (enabled) actualBottomColor else Color.Gray.copy(alpha = 0.5f))
                .border(strokeWidth, strokeColor, shape)
        )

        // 2. Capa Superior (Frontal del Botón que se presiona y cubre la capa inferior en X)
        Box(
            modifier = Modifier
                .offset(y = animatedOffset)
                .clip(shape)
                .background(if (enabled) containerColor else Color(0xFFCBD5E1))
                .border(strokeWidth, if (enabled) strokeColor else Color(0xFF94A3B8), shape),
            contentAlignment = Alignment.Center,
            propagateMinConstraints = true
        ) {
            Row(
                modifier = Modifier.padding(contentPadding),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

/**
 * Tarjeta Física 3D estilo Cartoon / Sticker con trazo contorneado limpio y bisel inferior sólido.
 * Si se especifica [onClick], ofrece respuesta táctil de hundimiento (sinking physics) al presionarse.
 */
@Composable
fun Sticker3dCard(
    modifier: Modifier = Modifier,
    containerColor: Color = Color.White,
    strokeColor: Color = Color(0xFF1E293B),
    bevelColor: Color = Color(0xFFCBD5E1),
    bottomBevelColor: Color = bevelColor,
    strokeWidth: Dp = 1.5.dp,
    bevelHeight: Dp = 3.dp,
    shape: Shape = RoundedCornerShape(20.dp),
    onClick: (() -> Unit)? = null,
    content: @Composable BoxScope.() -> Unit
) {
    val actualBevel = if (bottomBevelColor != Color(0xFFCBD5E1)) bottomBevelColor else bevelColor
    var isPressedState by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    var pressJob by remember { mutableStateOf<Job?>(null) }

    val animatedOffset by animateDpAsState(
        targetValue = if (isPressedState && onClick != null) bevelHeight else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "Sticker3dCardOffset"
    )

    val pointerModifier = if (onClick != null) {
        Modifier.pointerInput(Unit) {
            awaitPointerEventScope {
                while (true) {
                    awaitFirstDown(false)
                    pressJob?.cancel()
                    isPressedState = true
                    val downTime = System.currentTimeMillis()
                    val up = waitForUpOrCancellation()
                    val elapsed = System.currentTimeMillis() - downTime

                    pressJob = scope.launch {
                        if (elapsed < 110) {
                            delay(110 - elapsed)
                        }
                        isPressedState = false
                    }
                    if (up != null) {
                        onClick()
                    }
                }
            }
        }
    } else {
        Modifier
    }

    Box(
        modifier = modifier
            .padding(bottom = bevelHeight)
            .then(pointerModifier),
        propagateMinConstraints = true
    ) {
        // 1. Capa inferior 3D (Bisel / Extrusión física sólida)
        Box(
            modifier = Modifier
                .matchParentSize()
                .offset(y = bevelHeight)
                .clip(shape)
                .background(actualBevel)
                .border(strokeWidth, strokeColor, shape)
        )

        // 2. Capa frontal (Cara de la tarjeta: cubre exactamente la capa inferior en X e Y=0)
        Box(
            modifier = Modifier
                .offset(y = animatedOffset)
                .clip(shape)
                .background(containerColor)
                .border(strokeWidth, strokeColor, shape),
            propagateMinConstraints = true,
            content = content
        )
    }
}

/**
 * Píldora / Chip interactivo 3D con estilo Sticker / Cartoon
 */
@Composable
fun Sticker3dPill(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    selectedColor: Color,
    unselectedColor: Color,
    selectedBevel: Color,
    unselectedBevel: Color,
    strokeColor: Color,
    strokeWidth: Dp = 1.5.dp,
    bevelHeight: Dp = 2.5.dp,
    content: @Composable RowScope.() -> Unit
) {
    var isPressedState by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    var pressJob by remember { mutableStateOf<Job?>(null) }
    val currentBg = if (selected) selectedColor else unselectedColor
    val currentBevel = if (selected) selectedBevel else unselectedBevel

    val animatedOffset by animateDpAsState(
        targetValue = if (isPressedState) bevelHeight else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "StickerPillOffset"
    )

    Box(
        modifier = modifier
            .padding(bottom = bevelHeight)
            .pointerInput(Unit) {
                awaitPointerEventScope {
                    while (true) {
                        awaitFirstDown(false)
                        pressJob?.cancel()
                        isPressedState = true
                        val downTime = System.currentTimeMillis()
                        val up = waitForUpOrCancellation()
                        val elapsed = System.currentTimeMillis() - downTime

                        pressJob = scope.launch {
                            if (elapsed < 110) {
                                delay(110 - elapsed)
                            }
                            isPressedState = false
                        }
                        if (up != null) {
                            onClick()
                        }
                    }
                }
            },
        propagateMinConstraints = true
    ) {
        Box(
            modifier = Modifier
                .matchParentSize()
                .offset(y = bevelHeight)
                .clip(RastroShapes.CircularPill)
                .background(currentBevel)
                .border(strokeWidth, strokeColor, RastroShapes.CircularPill)
        )

        Box(
            modifier = Modifier
                .offset(y = animatedOffset)
                .clip(RastroShapes.CircularPill)
                .background(currentBg)
                .border(strokeWidth, strokeColor, RastroShapes.CircularPill)
                .padding(horizontal = 14.dp, vertical = 7.dp),
            contentAlignment = Alignment.Center,
            propagateMinConstraints = true
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                content = content
            )
        }
    }
}

/**
 * Sobrecarga de conveniencia de Sticker3dPill para texto simple con colores automáticos
 */
@Composable
fun Sticker3dPill(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    selectedBgColor: Color = Color(0xFF10B981),
    selectedContentColor: Color = Color.White,
    unselectedBgColor: Color = Color.White,
    unselectedContentColor: Color = Color(0xFF64748B),
    strokeColor: Color = Color(0xFF1E293B),
    strokeWidth: Dp = 1.5.dp,
    bevelHeight: Dp = 2.5.dp,
    selectedBevel: Color = selectedBgColor,
    unselectedBevel: Color = unselectedBgColor
) {
    Sticker3dPill(
        selected = isSelected,
        onClick = onClick,
        modifier = modifier,
        selectedColor = selectedBgColor,
        unselectedColor = unselectedBgColor,
        selectedBevel = selectedBevel,
        unselectedBevel = unselectedBevel,
        strokeColor = strokeColor,
        strokeWidth = strokeWidth,
        bevelHeight = bevelHeight
    ) {
        androidx.compose.material3.Text(
            text = text,
            fontSize = 12.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            color = if (isSelected) selectedContentColor else unselectedContentColor,
            maxLines = 1,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
    }
}

/**
 * Botón circular 3D con estilo Cartoon / Duolingo (para flechas < y >, botones de acción flotantes)
 */
@Composable
fun Sticker3dCircleButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: Dp = 38.dp,
    containerColor: Color = Color.White,
    bottomBevelColor: Color = Color(0xFFCBD5E1),
    strokeColor: Color = Color(0xFF1E293B),
    strokeWidth: Dp = 1.5.dp,
    bevelHeight: Dp = 2.5.dp,
    enabled: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
    var isPressedState by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    var pressJob by remember { mutableStateOf<Job?>(null) }

    val animatedOffset by animateDpAsState(
        targetValue = if (isPressedState && enabled) bevelHeight else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "CircleButtonOffset"
    )

    val currentAlpha = if (enabled) 1f else 0.40f

    Box(
        modifier = modifier
            .padding(bottom = bevelHeight)
            .size(size)
            .graphicsLayer { alpha = currentAlpha }
            .pointerInput(enabled) {
                if (!enabled) return@pointerInput
                awaitPointerEventScope {
                    while (true) {
                        awaitFirstDown(false)
                        pressJob?.cancel()
                        isPressedState = true
                        val downTime = System.currentTimeMillis()
                        val up = waitForUpOrCancellation()
                        val elapsed = System.currentTimeMillis() - downTime

                        pressJob = scope.launch {
                            if (elapsed < 110) {
                                delay(110 - elapsed)
                            }
                            isPressedState = false
                        }
                        if (up != null) {
                            onClick()
                        }
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = bevelHeight)
                .clip(CircleShape)
                .background(bottomBevelColor)
                .border(strokeWidth, strokeColor, CircleShape)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = animatedOffset)
                .clip(CircleShape)
                .background(containerColor)
                .border(strokeWidth, strokeColor, CircleShape),
            contentAlignment = Alignment.Center,
            content = content
        )
    }
}

/**
 * Botón mini squircle 3D para contadores numéricos (- y +) con feedback háptico táctil
 */
@Composable
fun Sticker3dCounterButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: Dp = 32.dp,
    containerColor: Color = Color.White,
    bottomBevelColor: Color = Color(0xFFCBD5E1),
    strokeColor: Color = Color(0xFF1E293B),
    strokeWidth: Dp = 1.5.dp,
    bevelHeight: Dp = 2.dp,
    enabled: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
    var isPressedState by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    var pressJob by remember { mutableStateOf<Job?>(null) }

    val animatedOffset by animateDpAsState(
        targetValue = if (isPressedState && enabled) bevelHeight else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "CounterButtonOffset"
    )

    val currentAlpha = if (enabled) 1f else 0.35f
    val shape = RoundedCornerShape(10.dp)

    Box(
        modifier = modifier
            .padding(bottom = bevelHeight)
            .size(size)
            .graphicsLayer { alpha = currentAlpha }
            .pointerInput(enabled) {
                if (!enabled) return@pointerInput
                awaitPointerEventScope {
                    while (true) {
                        awaitFirstDown(false)
                        pressJob?.cancel()
                        isPressedState = true
                        val downTime = System.currentTimeMillis()
                        val up = waitForUpOrCancellation()
                        val elapsed = System.currentTimeMillis() - downTime

                        pressJob = scope.launch {
                            if (elapsed < 110) {
                                delay(110 - elapsed)
                            }
                            isPressedState = false
                        }
                        if (up != null) {
                            onClick()
                        }
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = bevelHeight)
                .clip(shape)
                .background(bottomBevelColor)
                .border(strokeWidth, strokeColor, shape)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = animatedOffset)
                .clip(shape)
                .background(containerColor)
                .border(strokeWidth, strokeColor, shape),
            contentAlignment = Alignment.Center,
            content = content
        )
    }
}



