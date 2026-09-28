package com.jonsuapps.rastro.android.ui.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Flag
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
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.model.UserData
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun ReportPostDialog(
    upload: UserUpload,
    currentUser: UserData,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    val reasons = listOf(
        "Spam o Publicidad no deseada",
        "Contenido Inapropiado u Ofensivo",
        "Información Académica Falsa o Error",
        "Violación de Derechos de Autor",
        "Otro problema (especificar)"
    )
    var selectedReason by remember { mutableStateOf(reasons.first()) }
    var details by remember { mutableStateOf("") }
    var submitting by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = { if (!submitting) onDismiss() },
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .widthIn(max = 440.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Cabecera
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(38.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFFEF4444).copy(alpha = 0.15f))
                                .border(1.5.dp, Color(0xFFEF4444), RoundedCornerShape(12.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Flag,
                                contentDescription = null,
                                tint = Color(0xFFEF4444),
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Reportar Publicación",
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Black,
                                fontSize = 16.sp
                            )
                            Text(
                                text = upload.title.take(35),
                                color = theme.textSecondary,
                                fontSize = 11.sp,
                                maxLines = 1
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(32.dp),
                        enabled = !submitting
                    ) {
                        Icon(Icons.Rounded.Close, null, tint = theme.textSecondary)
                    }
                }

                Text(
                    text = "¿Cuál es el motivo del reporte?",
                    color = theme.textPrimary,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )

                // Lista de Motivos
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    reasons.forEach { reason ->
                        val isSelected = selectedReason == reason
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(if (isSelected) theme.accent.copy(alpha = 0.12f) else theme.surfaceAccent)
                                .border(
                                    1.5.dp,
                                    if (isSelected) theme.accent else theme.strokeBorder.copy(alpha = 0.25f),
                                    RoundedCornerShape(12.dp)
                                )
                                .clickable {
                                    DuolingoHaptics.playOptionSelected(context)
                                    selectedReason = reason
                                }
                                .padding(horizontal = 12.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = isSelected,
                                onClick = {
                                    DuolingoHaptics.playOptionSelected(context)
                                    selectedReason = reason
                                },
                                colors = RadioButtonDefaults.colors(selectedColor = theme.accent)
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = reason,
                                color = theme.textPrimary,
                                fontSize = 12.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                            )
                        }
                    }
                }

                // Campo de Detalles
                OutlinedTextField(
                    value = details,
                    onValueChange = { details = it },
                    label = { Text("Detalles adicionales (opcional)", fontSize = 12.sp) },
                    placeholder = { Text("Explica brevemente el problema detectado...", fontSize = 11.5.sp) },
                    modifier = Modifier.fillMaxWidth().height(90.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = theme.accent,
                        unfocusedBorderColor = theme.strokeBorder.copy(alpha = 0.35f)
                    )
                )

                // Botón Enviar Reporte 3D
                Sticker3dButton(
                    onClick = {
                        submitting = true
                        DuolingoHaptics.playOptionSelected(context)
                        UserUploadRepository.reportUpload(
                            upload = upload,
                            reporter = currentUser,
                            reason = selectedReason,
                            details = details
                        ) { result ->
                            submitting = false
                            if (result.isSuccess) {
                                DuolingoHaptics.playAnswerCorrect(context)
                                Toast.makeText(context, "Reporte enviado para moderación. ¡Gracias por cuidar la comunidad!", Toast.LENGTH_LONG).show()
                                onDismiss()
                            } else {
                                Toast.makeText(context, "No se pudo enviar el reporte: ${result.exceptionOrNull()?.message}", Toast.LENGTH_SHORT).show()
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    containerColor = Color(0xFFEF4444),
                    bottomBevelColor = Color(0xFFB91C1C),
                    strokeColor = theme.strokeBorder,
                    enabled = !submitting
                ) {
                    if (submitting) {
                        CircularProgressIndicator(color = Color.White, modifier = Modifier.size(20.dp), strokeWidth = 2.dp)
                    } else {
                        Icon(Icons.Rounded.Flag, null, tint = Color.White, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text("Enviar Reporte a Moderación", color = Color.White, fontWeight = FontWeight.Black, fontSize = 13.5.sp)
                    }
                }
            }
        }
    }
}
