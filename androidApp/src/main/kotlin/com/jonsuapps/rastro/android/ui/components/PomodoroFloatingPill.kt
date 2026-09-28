package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.*
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.OpenInFull
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.pomodoro.PomodoroState
import com.jonsuapps.rastro.pomodoro.PomodoroViewState
import com.jonsuapps.rastro.theme.RastroColors
import kotlin.math.roundToInt

/**
 * Píldora de Pomodoro Flotante con atracción magnética a los bordes laterales.
 * Reproduce exactamente la conducta de Screen Recorder PIP del §3.19 y §4.3 del mapa.
 */
@Composable
fun BoxScope.PomodoroFloatingPillOverlay(
    state: PomodoroState,
    colors: RastroColors,
    onTogglePlay: () -> Unit,
    onExpandChange: (Boolean) -> Unit,
    onOpenFullModal: () -> Unit,
    onAddFiveMinutes: () -> Unit
) {
    var offsetX by remember { mutableFloatStateOf(0f) }
    var offsetY by remember { mutableFloatStateOf(140f) }
    var screenWidthPx by remember { mutableFloatStateOf(1080f) }
    val isExpanded = state.viewState == PomodoroViewState.EXPANDED_PILL
    val minutes = state.timeLeftSeconds / 60
    val seconds = state.timeLeftSeconds % 60
    val timeFormatted = String.format("%02d:%02d", minutes, seconds)

    Box(
        modifier = Modifier
            .align(Alignment.TopStart)
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .pointerInput(Unit) {
                screenWidthPx = size.width.toFloat()
                detectDragGestures(
                    onDragEnd = {
                        // Snap magnético: anclar al borde más cercano
                        offsetX = if (offsetX + 100 > size.width / 2) {
                            (size.width - 200).toFloat().coerceAtLeast(0f)
                        } else {
                            0f
                        }
                    }
                ) { change, dragAmount ->
                    change.consume()
                    offsetX = (offsetX + dragAmount.x).coerceIn(0f, (size.width - 180).toFloat().coerceAtLeast(0f))
                    offsetY = (offsetY + dragAmount.y).coerceIn(80f, 1800f)
                }
            }
            .padding(horizontal = 6.dp)
    ) {
        val isRunning = state.isRunning
        val pulseScale by rememberBreathingPulse(minScale = 0.85f, maxScale = 1.15f, durationMillis = 1200)

        Box(
            modifier = Modifier
                .appleGlass(
                    cornerRadius = 24.dp,
                    isDark = !colors.isLight,
                    alpha = if (colors.isLight) 0.82f else 0.70f,
                    tintColor = colors.surface
                )
                .bouncyClick(scaleDown = 0.96f) { onExpandChange(!isExpanded) }
                .padding(horizontal = 12.dp, vertical = 8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Indicador luminoso con micro-animación pulsante continua
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .graphicsLayer {
                            if (isRunning) {
                                scaleX = pulseScale
                                scaleY = pulseScale
                            }
                        }
                        .clip(CircleShape)
                        .background(if (isRunning) Color(0xFF10B981) else Color(0xFFF59E0B))
                )

                Text(
                    text = timeFormatted,
                    color = colors.textPrimary,
                    fontSize = 13.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Black
                )

                AnimatedVisibility(
                    visible = isExpanded,
                    enter = fadeIn() + expandHorizontally(),
                    exit = fadeOut() + shrinkHorizontally()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Play / Pause con micro-rebote
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .clip(CircleShape)
                                .background(colors.accent.copy(alpha = 0.15f))
                                .bouncyClick(scaleDown = 0.88f) { onTogglePlay() },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = if (state.isRunning) Icons.Default.Pause else Icons.Default.PlayArrow,
                                contentDescription = null,
                                tint = colors.accent,
                                modifier = Modifier.size(16.dp)
                            )
                        }

                        // +5m botón con micro-rebote
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.surfaceAccent)
                                .bouncyClick(scaleDown = 0.90f) { onAddFiveMinutes() }
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "+5m",
                                fontSize = 11.sp,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                color = colors.textPrimary
                            )
                        }

                        // Maximizar con micro-rebote
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .clip(CircleShape)
                                .background(colors.surfaceAccent)
                                .bouncyClick(scaleDown = 0.88f) { onOpenFullModal() },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.OpenInFull,
                                contentDescription = "Maximizar",
                                tint = colors.textSecondary,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
