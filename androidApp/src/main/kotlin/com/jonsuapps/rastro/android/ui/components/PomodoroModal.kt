package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Minimize
import androidx.compose.material.icons.rounded.Pause
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Timer
import androidx.compose.material.icons.rounded.VolumeOff
import androidx.compose.material.icons.rounded.VolumeUp
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.pomodoro.PomodoroAlertSound
import com.jonsuapps.rastro.pomodoro.PomodoroMode
import com.jonsuapps.rastro.pomodoro.PomodoroState
import com.jonsuapps.rastro.theme.RastroColors
import com.jonsuapps.rastro.theme.RastroShapes

/**
 * Modal Extendido Pomodoro con la firma de diseño Sticker 3D Cartoon:
 * - Tarjeta base física con bisel 3D y trazo oscuro.
 * - Botón de inicio/pausa Sticker3dButton con amortiguación táctil y haptics Duolingo.
 * - Selector de modos tipo keycaps mecánicos con relieve.
 * - Botones auxiliares con bisel físico.
 */
@Composable
fun PomodoroFullModal(
    state: PomodoroState,
    colors: RastroColors,
    onDismiss: () -> Unit,
    onMinimize: () -> Unit,
    onToggleSound: () -> Unit,
    onTogglePlay: () -> Unit,
    onReset: () -> Unit,
    onAddFiveMinutes: () -> Unit,
    onSetCyclesBeforeLongBreak: (Int) -> Unit,
    onSetDuration: (PomodoroMode, Int) -> Unit,
    onSetAlertSound: (PomodoroMode, PomodoroAlertSound) -> Unit,
    onSelectMode: (PomodoroMode) -> Unit,
    onApplyPreset: (Int) -> Unit,
    onToggleAutoCycle: (Boolean) -> Unit = {}
) {
    val context = LocalContext.current
    val minutes = state.timeLeftSeconds / 60
    val seconds = state.timeLeftSeconds % 60
    val timeFormatted = String.format("%02d:%02d", minutes, seconds)
    var showSettings by remember { mutableStateOf(false) }
    val activeModes = listOf(PomodoroMode.STUDY, PomodoroMode.SHORT_BREAK, PomodoroMode.LONG_BREAK)
    val cyclesPerBlock = state.customCyclesBeforeLongBreak.coerceAtLeast(1)
    val currentCycle = (state.completedCycles % cyclesPerBlock) + 1

    Dialog(onDismissRequest = onDismiss, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .fillMaxHeight(0.92f)
                .widthIn(max = 520.dp),
            containerColor = colors.surface,
            bottomBevelColor = colors.cardBevel,
            strokeColor = colors.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(28.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 14.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Cabecera superior
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.accent.copy(alpha = 0.14f))
                            .border(1.5.dp, colors.accent.copy(alpha = 0.35f), RoundedCornerShape(12.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Timer,
                            contentDescription = null,
                            tint = colors.accent,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                    Spacer(Modifier.width(10.dp))
                    Column(Modifier.weight(1f)) {
                        Text(
                            text = "TEMPORIZADOR POMODORO",
                            fontSize = 9.sp,
                            letterSpacing = 0.8.sp,
                            color = colors.accent,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = if (state.mode == PomodoroMode.CUSTOM) "Estudio Personalizado" else state.mode.title,
                            fontSize = 15.sp,
                            color = colors.textPrimary,
                            fontWeight = FontWeight.Black
                        )
                    }

                    TactileHeaderIcon(
                        icon = if (state.soundEnabled) Icons.Rounded.VolumeUp else Icons.Rounded.VolumeOff,
                        label = if (state.soundEnabled) "Silenciar alarma" else "Activar alarma",
                        colors = colors,
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            onToggleSound()
                        }
                    )
                    Spacer(Modifier.width(4.dp))
                    TactileHeaderIcon(
                        icon = Icons.Rounded.Settings,
                        label = "Personalizar Pomodoro",
                        colors = colors,
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            showSettings = true
                        }
                    )
                    Spacer(Modifier.width(4.dp))
                    TactileHeaderIcon(
                        icon = Icons.Rounded.Minimize,
                        label = "Minimizar",
                        colors = colors,
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            onMinimize()
                        }
                    )
                    Spacer(Modifier.width(4.dp))
                    TactileHeaderIcon(
                        icon = Icons.Rounded.Close,
                        label = "Cerrar",
                        colors = colors,
                        onClick = onDismiss
                    )
                }

                // Selector de modo tipo Keycaps 3D físicos con bisel y relieve (altura 56dp anti-cortes)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    activeModes.forEach { mode ->
                        val selected = state.mode == mode || (mode == PomodoroMode.STUDY && state.mode == PomodoroMode.CUSTOM)
                        val modeColor = when (mode) {
                            PomodoroMode.STUDY -> colors.accent
                            PomodoroMode.SHORT_BREAK -> Color(0xFF10B981)
                            PomodoroMode.LONG_BREAK -> Color(0xFF8B5CF6)
                            else -> colors.accent
                        }
                        val modeBevelColor = when (mode) {
                            PomodoroMode.STUDY -> colors.accentBevel
                            PomodoroMode.SHORT_BREAK -> Color(0xFF047857)
                            PomodoroMode.LONG_BREAK -> Color(0xFF6D28D9)
                            else -> colors.cardBevel
                        }

                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                onSelectMode(mode)
                            },
                            modifier = Modifier
                                .weight(1f)
                                .height(62.dp),
                            containerColor = if (selected) modeColor else colors.surface,
                            bottomBevelColor = if (selected) modeBevelColor else colors.cardBevel,
                            strokeColor = colors.strokeBorder,
                            strokeWidth = 1.5.dp,
                            bevelHeight = 3.5.dp,
                            shape = RoundedCornerShape(14.dp),
                            contentPadding = PaddingValues(horizontal = 2.dp, vertical = 2.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = mode.title,
                                    fontSize = 11.sp,
                                    maxLines = 1,
                                    overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis,
                                    color = if (selected) Color.White else colors.textPrimary,
                                    fontWeight = if (selected) FontWeight.Black else FontWeight.Bold
                                )
                                Spacer(Modifier.height(2.dp))
                                Text(
                                    text = "${state.durationMinutes(mode)} min",
                                    fontSize = 10.sp,
                                    maxLines = 1,
                                    color = if (selected) Color.White.copy(alpha = 0.9f) else colors.textSecondary,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }

                // Acceso directo: Modo Bloques Seguidos (Auto-ciclo continuo)
                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(if (state.autoCycle) colors.accent.copy(alpha = 0.12f) else colors.surfaceAccent)
                        .border(
                            1.2.dp,
                            if (state.autoCycle) colors.accent.copy(alpha = 0.4f) else colors.strokeBorder.copy(alpha = 0.3f),
                            RoundedCornerShape(20.dp)
                        )
                        .bouncyClick(scaleDown = 0.95f) {
                            DuolingoHaptics.playOptionSelected(context)
                            onToggleAutoCycle(!state.autoCycle)
                        }
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Refresh,
                        contentDescription = null,
                        tint = if (state.autoCycle) colors.accent else colors.textSecondary,
                        modifier = Modifier.size(13.dp)
                    )
                    Text(
                        text = if (state.autoCycle) "🔁 Bloques Seguidos: ACTIVADO" else "⏸ Bloques Seguidos: PAUSADO",
                        fontSize = 10.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (state.autoCycle) colors.accent else colors.textSecondary
                    )
                }

                // Dial circular central 3D
                val dialBorderColor = if (state.isRunning) Color(0xFF10B981) else colors.accent
                Box(
                    modifier = Modifier
                        .size(176.dp)
                        .clip(CircleShape)
                        .background(colors.surface)
                        .border(4.dp, dialBorderColor.copy(alpha = 0.25f), CircleShape)
                        .padding(6.dp)
                        .border(2.5.dp, dialBorderColor, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = timeFormatted,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Black,
                            color = colors.textPrimary,
                            letterSpacing = (-0.5).sp
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = when {
                                state.isRunning -> "EN CURSO"
                                state.timeLeftSeconds < state.durationMinutes() * 60 -> "PAUSADO"
                                else -> "LISTO PARA ESTUDIAR"
                            },
                            fontSize = 9.5.sp,
                            letterSpacing = 0.8.sp,
                            fontWeight = FontWeight.Black,
                            color = if (state.isRunning) Color(0xFF10B981) else colors.accent,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(dialBorderColor.copy(alpha = 0.12f))
                                .padding(horizontal = 10.dp, vertical = 3.dp)
                        )
                    }
                }

                // Indicador de Bloques / Ciclos
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Bloque $currentCycle de $cyclesPerBlock",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textSecondary
                    )
                    Spacer(Modifier.height(6.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        repeat(cyclesPerBlock.coerceAtMost(8)) { index ->
                            Box(
                                modifier = Modifier
                                    .size(if (index + 1 == currentCycle) 10.dp else 8.dp)
                                    .clip(CircleShape)
                                    .background(if (index + 1 <= currentCycle) colors.accent else colors.surfaceBorder)
                                    .border(1.dp, colors.strokeBorder.copy(alpha = 0.3f), CircleShape)
                            )
                        }
                    }
                }

                // Presets Rápidos 3D
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Ajuste rápido:",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textSecondary
                    )
                    listOf(15, 25, 45, 50).forEach { preset ->
                        val selected = state.mode == PomodoroMode.CUSTOM && state.customStudyMinutes == preset
                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                onApplyPreset(preset)
                            },
                            containerColor = if (selected) colors.accent else colors.surface,
                            bottomBevelColor = if (selected) colors.accentBevel else colors.cardBevel,
                            strokeColor = colors.strokeBorder,
                            strokeWidth = 1.3.dp,
                            bevelHeight = 2.5.dp,
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 5.dp)
                        ) {
                            Text(
                                text = "${preset}m",
                                fontSize = 11.sp,
                                fontWeight = if (selected) FontWeight.Black else FontWeight.Bold,
                                color = if (selected) Color.White else colors.textPrimary
                            )
                        }
                    }
                }

                // ── FILA PRINCIPAL DE CONTROLES TÁCTILES ──────────────────
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Botón Reiniciar 3D
                    TactileSmallAction(
                        icon = Icons.Rounded.Refresh,
                        label = "Reiniciar",
                        colors = colors,
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            onReset()
                        }
                    )

                    Spacer(Modifier.width(10.dp))

                    // Botón Principal Sticker3dButton (Con bisel físico y amortiguación táctil)
                    val isRunning = state.isRunning
                    val buttonContainerColor = if (isRunning) Color(0xFF10B981) else colors.accent
                    val buttonBevelColor = if (isRunning) Color(0xFF047857) else colors.accentBevel
                    val buttonText = if (isRunning) "Pausar" else "Iniciar ${if (state.mode == PomodoroMode.STUDY || state.mode == PomodoroMode.CUSTOM) "Estudio" else "Descanso"}"

                    Sticker3dButton(
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            onTogglePlay()
                        },
                        modifier = Modifier
                            .weight(1f)
                            .height(48.dp),
                        containerColor = buttonContainerColor,
                        bottomBevelColor = buttonBevelColor,
                        strokeColor = colors.strokeBorder,
                        strokeWidth = 1.8.dp,
                        bevelHeight = 4.dp,
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Icon(if (isRunning) Icons.Rounded.Pause else Icons.Rounded.PlayArrow, contentDescription = null, tint = Color.White, modifier = Modifier.size(20.dp))
                        Spacer(Modifier.width(8.dp))
                        Text(buttonText, color = Color.White, fontWeight = FontWeight.Black, fontSize = 14.sp)
                    }

                    Spacer(Modifier.width(10.dp))

                    // Botón +5m con bisel 3D
                    Sticker3dButton(
                        onClick = {
                            DuolingoHaptics.playOptionSelected(context)
                            onAddFiveMinutes()
                        },
                        containerColor = colors.surface,
                        bottomBevelColor = colors.cardBevel,
                        strokeColor = colors.strokeBorder,
                        strokeWidth = 1.5.dp,
                        bevelHeight = 3.5.dp,
                        shape = RoundedCornerShape(14.dp),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp),
                        modifier = Modifier.height(48.dp)
                    ) {
                        Text(
                            text = "+5m",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Black,
                            color = colors.textPrimary
                        )
                    }
                }

                // Fila Inferior con Mascota Orstty
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(colors.surfaceAccent.copy(alpha = 0.7f))
                        .border(1.2.dp, colors.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(16.dp))
                        .padding(horizontal = 12.dp, vertical = 8.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        OrsttyMascot(
                            size = 36.dp,
                            mood = if (state.isRunning) MascotMood.STUDYING else MascotMood.HAPPY
                        )
                        Spacer(Modifier.width(10.dp))
                        Column(Modifier.weight(1f)) {
                            Text(
                                text = "Hoy: ${state.todayStudiedMinutes} min de enfoque  ·  Bloques: ${state.completedCycles}",
                                fontSize = 10.5.sp,
                                color = colors.textPrimary,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "El éxito en el examen se construye bloque a bloque. ¡Mantén el enfoque!",
                                fontSize = 10.sp,
                                color = colors.textSecondary,
                                maxLines = 1
                            )
                        }
                    }
                }
            }
        }
    }

    // Modal de Personalización de Bloques con Estilo 3D
    if (showSettings) {
        Dialog(onDismissRequest = { showSettings = false }) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .widthIn(max = 440.dp),
                containerColor = colors.surface,
                bottomBevelColor = colors.cardBevel,
                strokeColor = colors.strokeBorder,
                bevelHeight = 5.dp,
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(18.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Ajustes de Pomodoro",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Black,
                            color = colors.textPrimary
                        )
                        IconButton(onClick = { showSettings = false }, modifier = Modifier.size(28.dp)) {
                            Icon(Icons.Rounded.Close, "Cerrar", tint = colors.textSecondary, modifier = Modifier.size(18.dp))
                        }
                    }

                    Text(
                        text = "Configura la duración y sonido de cada etapa:",
                        fontSize = 11.5.sp,
                        color = colors.textSecondary
                    )

                    PomodoroBlockSettings(
                        title = "Estudio", mode = PomodoroMode.STUDY,
                        minutes = state.customStudyMinutes, sound = state.studyAlertSound,
                        onDuration = onSetDuration, onSound = onSetAlertSound
                    )
                    PomodoroBlockSettings(
                        title = "Descanso Corto", mode = PomodoroMode.SHORT_BREAK,
                        minutes = state.customShortBreakMinutes, sound = state.shortBreakAlertSound,
                        onDuration = onSetDuration, onSound = onSetAlertSound
                    )
                    PomodoroBlockSettings(
                        title = "Descanso Largo", mode = PomodoroMode.LONG_BREAK,
                        minutes = state.customLongBreakMinutes, sound = state.longBreakAlertSound,
                        onDuration = onSetDuration, onSound = onSetAlertSound
                    )

                    HorizontalDivider(color = colors.strokeBorder.copy(alpha = 0.3f))

                    Text(
                        text = "Bloques antes del descanso largo:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textPrimary
                    )

                    Row(
                        modifier = Modifier.horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf(2, 3, 4, 5, 6).forEach { count ->
                            val isSelected = state.customCyclesBeforeLongBreak == count
                            Sticker3dButton(
                                onClick = {
                                    DuolingoHaptics.playOptionSelected(context)
                                    onSetCyclesBeforeLongBreak(count)
                                },
                                containerColor = if (isSelected) colors.accent else colors.surface,
                                bottomBevelColor = if (isSelected) colors.accentBevel else colors.cardBevel,
                                strokeColor = colors.strokeBorder,
                                strokeWidth = 1.3.dp,
                                bevelHeight = 2.5.dp,
                                shape = RoundedCornerShape(12.dp),
                                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 7.dp)
                            ) {
                                Text(
                                    text = "$count bloques",
                                    fontSize = 12.sp,
                                    fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                    color = if (isSelected) Color.White else colors.textPrimary
                                )
                            }
                        }
                    }

                    HorizontalDivider(color = colors.strokeBorder.copy(alpha = 0.3f))

                    // ── OPCIÓN DE BLOQUES SEGUIDOS AUTOMÁTICOS ──
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(if (state.autoCycle) colors.accent.copy(alpha = 0.1f) else colors.surfaceAccent)
                            .border(
                                1.2.dp,
                                if (state.autoCycle) colors.accent.copy(alpha = 0.4f) else colors.strokeBorder.copy(alpha = 0.3f),
                                RoundedCornerShape(14.dp)
                            )
                            .clickable {
                                DuolingoHaptics.playOptionSelected(context)
                                onToggleAutoCycle(!state.autoCycle)
                            }
                            .padding(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Bloques Seguidos Automáticos",
                                    fontSize = 12.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = colors.textPrimary
                                )
                                Text(
                                    text = if (state.autoCycle) "Activo: Al terminar un bloque, inicia automáticamente el siguiente." else "Pausado: Se detiene al terminar cada bloque de estudio o descanso.",
                                    fontSize = 10.5.sp,
                                    color = colors.textSecondary,
                                    lineHeight = 14.sp
                                )
                            }
                            Spacer(Modifier.width(8.dp))
                            Switch(
                                checked = state.autoCycle,
                                onCheckedChange = {
                                    DuolingoHaptics.playOptionSelected(context)
                                    onToggleAutoCycle(it)
                                },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = Color.White,
                                    checkedTrackColor = colors.accent,
                                    uncheckedThumbColor = colors.textSecondary,
                                    uncheckedTrackColor = colors.surfaceBorder
                                )
                            )
                        }
                    }

                    Spacer(Modifier.height(4.dp))

                    Sticker3dButton(
                        onClick = { showSettings = false },
                        modifier = Modifier.fillMaxWidth().height(46.dp),
                        containerColor = colors.accent,
                        bottomBevelColor = colors.accentBevel,
                        strokeColor = colors.strokeBorder,
                        strokeWidth = 1.8.dp,
                        bevelHeight = 4.dp,
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text("Guardar y Continuar", color = Color.White, fontWeight = FontWeight.Black, fontSize = 14.sp)
                    }
                }
            }
        }
    }
}

@Composable
private fun TactileHeaderIcon(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    colors: RastroColors,
    onClick: () -> Unit
) {
    Sticker3dButton(
        onClick = onClick,
        modifier = Modifier.size(36.dp),
        containerColor = colors.surface,
        bottomBevelColor = colors.cardBevel,
        strokeColor = colors.strokeBorder,
        strokeWidth = 1.3.dp,
        bevelHeight = 2.5.dp,
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Icon(icon, label, tint = colors.textPrimary, modifier = Modifier.size(17.dp))
    }
}

@Composable
private fun TactileSmallAction(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    colors: RastroColors,
    onClick: () -> Unit
) {
    Sticker3dButton(
        onClick = onClick,
        modifier = Modifier.size(48.dp),
        containerColor = colors.surface,
        bottomBevelColor = colors.cardBevel,
        strokeColor = colors.strokeBorder,
        strokeWidth = 1.5.dp,
        bevelHeight = 3.5.dp,
        shape = RoundedCornerShape(14.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Icon(icon, label, tint = colors.textPrimary, modifier = Modifier.size(22.dp))
    }
}

@Composable
private fun PomodoroBlockSettings(
    title: String,
    mode: PomodoroMode,
    minutes: Int,
    sound: PomodoroAlertSound,
    onDuration: (PomodoroMode, Int) -> Unit,
    onSound: (PomodoroMode, PomodoroAlertSound) -> Unit
) {
    var rawText by remember(minutes) { mutableStateOf(minutes.toString()) }
    var soundMenuOpen by remember { mutableStateOf(false) }
    val invalidMinutes = rawText.toIntOrNull()?.let { it !in 1..120 } ?: true

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f))
            .border(1.2.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.25f), RoundedCornerShape(16.dp))
            .padding(12.dp)
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(title, fontWeight = FontWeight.Black, fontSize = 14.sp)
                OutlinedTextField(
                    value = rawText,
                    onValueChange = { value ->
                        rawText = value
                        value.toIntOrNull()?.takeIf { it in 1..120 }?.let { onDuration(mode, it) }
                    },
                    modifier = Modifier.width(90.dp),
                    label = { Text("min", fontWeight = FontWeight.Bold) },
                    singleLine = true,
                    isError = invalidMinutes,
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
            }
            Box {
                OutlinedButton(
                    onClick = { soundMenuOpen = true },
                    modifier = Modifier.fillMaxWidth().height(42.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = androidx.compose.foundation.BorderStroke(1.3.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.35f))
                ) {
                    Icon(
                        if (sound == PomodoroAlertSound.SILENT) Icons.Rounded.VolumeOff else Icons.Rounded.VolumeUp,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(Modifier.width(8.dp))
                    Text("Alarma: ${sound.title}", modifier = Modifier.weight(1f), maxLines = 1, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    Icon(Icons.Rounded.ArrowDropDown, contentDescription = null)
                }
                DropdownMenu(expanded = soundMenuOpen, onDismissRequest = { soundMenuOpen = false }) {
                    PomodoroAlertSound.values().forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option.title, fontWeight = FontWeight.Medium) },
                            onClick = { onSound(mode, option); soundMenuOpen = false }
                        )
                    }
                }
            }
        }
    }
}

