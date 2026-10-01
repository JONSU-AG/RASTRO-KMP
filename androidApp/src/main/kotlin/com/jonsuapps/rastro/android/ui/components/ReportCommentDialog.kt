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
import com.jonsuapps.rastro.android.data.UploadComment
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.model.UserData
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun ReportCommentDialog(
    comment: UploadComment,
    upload: UserUpload,
    currentUser: UserData,
    onDismiss: () -> Unit
) {
    ReportCommentDialog(
        targetCommentId = comment.id,
        targetCommentAuthor = comment.authorName,
        targetUploadTitle = upload.title,
        currentUid = currentUser.uid,
        currentUserName = currentUser.displayName,
        targetCommentText = comment.text,
        targetCommentAuthorUid = comment.authorUid,
        onDismiss = onDismiss
    )
}

@Composable
fun ReportCommentDialog(
    targetCommentId: String,
    targetCommentAuthor: String,
    targetUploadTitle: String,
    currentUid: String,
    currentUserName: String,
    targetCommentText: String = "",
    targetCommentAuthorUid: String = "",
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    val reasons = listOf(
        "Spam o Contenido Comercial",
        "Acoso, Insultos o Hostigamiento",
        "Lenguaje Ofensivo o Inapropiado",
        "Información Falsa o Engañosa",
        "Otro motivo (especificar)"
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
                                text = "Reportar Comentario",
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Black,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "De: ${targetCommentAuthor.take(25)}",
                                color = theme.textSecondary,
                                fontSize = 12.sp
                            )
                        }
                    }
                    IconButton(onClick = onDismiss, modifier = Modifier.size(28.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                // Cita del comentario (si hay texto disponible)
                if (targetCommentText.isNotBlank()) {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        color = theme.surfaceAccent.copy(alpha = 0.6f)
                    ) {
                        Text(
                            text = "\"${targetCommentText.take(120)}${if (targetCommentText.length > 120) "..." else ""}\"",
                            fontSize = 12.sp,
                            color = theme.textSecondary,
                            modifier = Modifier.padding(10.dp)
                        )
                    }
                }

                Text(
                    text = "¿Cuál es el problema con este comentario?",
                    color = theme.textPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp
                )

                // Lista de Motivos
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    reasons.forEach { reason ->
                        val isSelected = selectedReason == reason
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(if (isSelected) theme.accent.copy(alpha = 0.1f) else Color.Transparent)
                                .border(
                                    width = 1.dp,
                                    color = if (isSelected) theme.accent else theme.strokeBorder.copy(alpha = 0.35f),
                                    shape = RoundedCornerShape(12.dp)
                                )
                                .clickable {
                                    DuolingoHaptics.playOptionSelected(context)
                                    selectedReason = reason
                                }
                                .padding(horizontal = 12.dp, vertical = 8.dp),
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

                // Detalles adicionales
                OutlinedTextField(
                    value = details,
                    onValueChange = { details = it },
                    label = { Text("Detalles adicionales (opcional)", fontSize = 12.sp) },
                    placeholder = { Text("Explica brevemente la infracción...", fontSize = 11.5.sp) },
                    modifier = Modifier.fillMaxWidth().height(80.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = theme.accent,
                        unfocusedBorderColor = theme.strokeBorder.copy(alpha = 0.35f)
                    )
                )

                // Botón Enviar Reporte
                Sticker3dButton(
                    onClick = {
                        submitting = true
                        DuolingoHaptics.playOptionSelected(context)
                        UserUploadRepository.reportComment(
                            commentId = targetCommentId,
                            commentText = targetCommentText,
                            authorUid = targetCommentAuthorUid,
                            authorName = targetCommentAuthor,
                            postId = "",
                            postTitle = targetUploadTitle,
                            reporterUid = currentUid,
                            reporterName = currentUserName,
                            reason = selectedReason,
                            details = details
                        ) { result ->
                            submitting = false
                            if (result.isSuccess) {
                                DuolingoHaptics.playAnswerCorrect(context)
                                Toast.makeText(context, "Reporte enviado para moderación. ¡Gracias!", Toast.LENGTH_LONG).show()
                                onDismiss()
                            } else {
                                Toast.makeText(context, "Error al enviar reporte: ${result.exceptionOrNull()?.message}", Toast.LENGTH_SHORT).show()
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
