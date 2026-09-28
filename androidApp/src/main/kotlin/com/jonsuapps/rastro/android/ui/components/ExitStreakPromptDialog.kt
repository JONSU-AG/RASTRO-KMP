package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.LocalFireDepartment
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.theme.RastroPalette

/**
 * Modal de Despedida / Salida con Mascota (Loki / Mascot):
 * "¿Nos dejas? ¡Una última racha o prueba rápida!"
 * Anima al estudiante a completar 1 lección rápida de 1 minuto antes de salir.
 */
@Composable
fun ExitStreakPromptDialog(
    theme: RastroPalette,
    currentStreak: Int = 1,
    onStartQuickQuiz: () -> Unit,
    onExitApp: () -> Unit,
    onDismiss: () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.88f)
                .widthIn(max = 380.dp),
            shape = RoundedCornerShape(24.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFF97316).copy(alpha = 0.18f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.LocalFireDepartment,
                            contentDescription = null,
                            tint = Color(0xFFF97316),
                            modifier = Modifier.size(22.dp)
                        )
                    }

                    IconButton(onClick = onDismiss, modifier = Modifier.size(32.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary, modifier = Modifier.size(18.dp))
                    }
                }

                // Mascota Cartoon Avatar
                CartoonAvatar(
                    photoUrl = null,
                    size = 72.dp,
                    strokeColor = theme.strokeBorder,
                    strokeWidth = 2.dp,
                    bevelColor = theme.cardBevel
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "¿Nos dejas tan pronto?",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "¡Estás a solo 1 minuto de asegurar tu racha de $currentStreak días y subir en el ranking preu!",
                        style = MaterialTheme.typography.bodySmall,
                        color = theme.textSecondary,
                        textAlign = TextAlign.Center,
                        lineHeight = 17.sp
                    )
                }

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Sticker3dButton(
                        onClick = onStartQuickQuiz,
                        modifier = Modifier.fillMaxWidth().height(44.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder,
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            Icon(Icons.Rounded.PlayArrow, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                            Text("⚡ Hacer 1 racha rápida (1 min)", color = Color.White, fontWeight = FontWeight.Black, fontSize = 12.5.sp)
                        }
                    }

                    Sticker3dButton(
                        onClick = onExitApp,
                        modifier = Modifier.fillMaxWidth().height(40.dp),
                        containerColor = theme.surfaceAccent,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text("👋 Salir por hoy", color = theme.textSecondary, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                    }
                }
            }
        }
    }
}
