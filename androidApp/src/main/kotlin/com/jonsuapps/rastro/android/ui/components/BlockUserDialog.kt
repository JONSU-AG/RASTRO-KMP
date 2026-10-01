package com.jonsuapps.rastro.android.ui.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Block
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.UserProfileRepository
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun BlockUserDialog(
    targetUid: String,
    targetName: String,
    currentUid: String,
    onDismiss: () -> Unit,
    onBlocked: () -> Unit = {}
) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    var isProcessing by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = { if (!isProcessing) onDismiss() },
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .widthIn(max = 420.dp),
            containerColor = theme.surface,
            bottomBevelColor = Color(0xFFB91C1C),
            strokeColor = Color(0xFFEF4444),
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Cabecera con botón cerrar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    IconButton(
                        onClick = { if (!isProcessing) onDismiss() },
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = theme.textSecondary
                        )
                    }
                }

                // Ícono de Bloqueo 3D
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFEF4444).copy(alpha = 0.12f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Block,
                        contentDescription = null,
                        tint = Color(0xFFEF4444),
                        modifier = Modifier.size(32.dp)
                    )
                }

                Text(
                    text = "¿Bloquear a ${targetName.ifBlank { "este usuario" }}?",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary,
                    textAlign = TextAlign.Center
                )

                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    color = theme.surfaceAccent.copy(alpha = 0.6f)
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Al bloquear a este usuario:",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "• No verás sus publicaciones en la biblioteca ni en el muro.",
                            fontSize = 11.5.sp,
                            color = theme.textSecondary,
                            lineHeight = 16.sp
                        )
                        Text(
                            text = "• No verás sus comentarios en ningún aporte.",
                            fontSize = 11.5.sp,
                            color = theme.textSecondary,
                            lineHeight = 16.sp
                        )
                        Text(
                            text = "• No podrá interactuar contigo en la comunidad.",
                            fontSize = 11.5.sp,
                            color = theme.textSecondary,
                            lineHeight = 16.sp
                        )
                        Text(
                            text = "• Puedes desbloquearlo cuando quieras en Ajustes > Usuarios Bloqueados.",
                            fontSize = 11.5.sp,
                            color = theme.accent,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                // Botón Confirmar Bloqueo
                Sticker3dButton(
                    onClick = {
                        isProcessing = true
                        DuolingoHaptics.playOptionSelected(context)
                        UserManager.blockUser(targetUid)
                        UserProfileRepository.blockUser(currentUid, targetUid, block = true) {
                            isProcessing = false
                            DuolingoHaptics.playAnswerCorrect(context)
                            Toast.makeText(context, "Usuario bloqueado correctamente.", Toast.LENGTH_SHORT).show()
                            onBlocked()
                            onDismiss()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    containerColor = Color(0xFFEF4444),
                    bottomBevelColor = Color(0xFFB91C1C),
                    strokeColor = Color(0xFF7F1D1D),
                    enabled = !isProcessing
                ) {
                    if (isProcessing) {
                        CircularProgressIndicator(
                            color = Color.White,
                            modifier = Modifier.size(20.dp),
                            strokeWidth = 2.dp
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Rounded.Block,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = "Bloquear Usuario",
                            color = Color.White,
                            fontWeight = FontWeight.Black,
                            fontSize = 13.5.sp
                        )
                    }
                }

                // Botón Cancelar
                TextButton(
                    onClick = { if (!isProcessing) onDismiss() },
                    enabled = !isProcessing
                ) {
                    Text(
                        text = "Cancelar",
                        color = theme.textSecondary,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
                }
            }
        }
    }
}
