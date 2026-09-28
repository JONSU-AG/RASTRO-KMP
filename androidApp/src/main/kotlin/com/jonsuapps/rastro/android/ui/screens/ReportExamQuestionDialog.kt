package com.jonsuapps.rastro.android.ui.screens

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
import com.jonsuapps.rastro.android.data.ExamQuestionRepository
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.model.ExamQuestion
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun ReportExamQuestionDialog(
    question: ExamQuestion,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    val reasons = listOf("Respuesta incorrecta", "Pregunta ambigua", "Contenido repetido", "Falta contexto", "Otro problema")
    var selectedReason by remember { mutableStateOf(reasons.first()) }
    var details by remember { mutableStateOf("") }
    var submitting by remember { mutableStateOf(false) }
    var submitted by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }

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
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(0xFFEF4444).copy(alpha = 0.15f))
                                .border(1.dp, Color(0xFFEF4444), RoundedCornerShape(10.dp)),
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
                        Text(
                            text = if (submitted) "Reporte Enviado" else "Reportar Pregunta",
                            color = theme.textPrimary,
                            fontWeight = FontWeight.Black,
                            fontSize = 17.sp
                        )
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(30.dp),
                        enabled = !submitting
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = theme.textSecondary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                if (submitted) {
                    Text(
                        text = "¡Muchas gracias! Nuestro equipo pedagógico y la comunidad revisarán esta pregunta para corregir cualquier discrepancia.",
                        color = theme.textSecondary,
                        fontSize = 13.sp,
                        lineHeight = 18.sp
                    )

                    Spacer(Modifier.height(8.dp))

                    Sticker3dButton(
                        onClick = onDismiss,
                        modifier = Modifier.fillMaxWidth().height(42.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Text("Cerrar", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                } else {
                    Text(
                        text = question.q,
                        color = theme.textSecondary,
                        maxLines = 3,
                        fontSize = 12.5.sp,
                        lineHeight = 17.sp
                    )

                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        reasons.forEach { reason ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(8.dp))
                                    .clickable { selectedReason = reason }
                                    .padding(vertical = 2.dp, horizontal = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = selectedReason == reason,
                                    onClick = { selectedReason = reason },
                                    colors = RadioButtonDefaults.colors(selectedColor = Color(0xFFEF4444))
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = reason,
                                    color = theme.textPrimary,
                                    fontSize = 13.sp,
                                    fontWeight = if (selectedReason == reason) FontWeight.Bold else FontWeight.Normal
                                )
                            }
                        }
                    }

                    OutlinedTextField(
                        value = details,
                        onValueChange = { details = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("Detalles adicionales (opcional)") },
                        minLines = 2,
                        maxLines = 3,
                        shape = RoundedCornerShape(12.dp)
                    )

                    error?.let {
                        Text(it, color = MaterialTheme.colorScheme.error, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = onDismiss,
                            modifier = Modifier.weight(1f).height(44.dp),
                            shape = RoundedCornerShape(14.dp),
                            enabled = !submitting
                        ) {
                            Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.Bold)
                        }

                        Sticker3dButton(
                            onClick = {
                                submitting = true
                                error = null
                                ExamQuestionRepository.reportQuestion(question, selectedReason, details) { result ->
                                    submitting = false
                                    result.fold(
                                        onSuccess = {
                                            DuolingoHaptics.playAnswerCorrect(context)
                                            submitted = true
                                        },
                                        onFailure = {
                                            DuolingoHaptics.playAnswerIncorrect(context)
                                            error = it.localizedMessage ?: "No se pudo enviar el reporte."
                                        }
                                    )
                                }
                            },
                            enabled = !submitting,
                            modifier = Modifier.weight(1.3f).height(44.dp),
                            containerColor = Color(0xFFEF4444),
                            bottomBevelColor = Color(0xFFB91C1C),
                            strokeColor = Color(0xFF7F1D1D)
                        ) {
                            Text(
                                text = if (submitting) "Enviando..." else "Enviar Reporte",
                                color = Color.White,
                                fontWeight = FontWeight.Black,
                                fontSize = 13.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
