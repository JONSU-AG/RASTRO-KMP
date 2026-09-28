package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.PostAdd
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
import androidx.compose.ui.layout.ContentScale
import com.jonsuapps.rastro.android.data.ExamQuestionRepository
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun CreateExamQuestionDialog(onDismiss: () -> Unit) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    var question by remember { mutableStateOf("") }
    val options = remember { mutableStateListOf("", "", "", "", "") }
    var correctIndex by remember { mutableIntStateOf(0) }
    var subject by remember { mutableStateOf("Biología") }
    var selectedArea by remember { mutableStateOf("General") }
    var imageUrl by remember { mutableStateOf("") }
    var explanation by remember { mutableStateOf("") }
    var isSaving by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }

    Dialog(
        onDismissRequest = { if (!isSaving) onDismiss() },
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .widthIn(max = 480.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
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
                                .background(theme.accent.copy(alpha = 0.15f))
                                .border(1.dp, theme.accent, RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.PostAdd,
                                contentDescription = null,
                                tint = theme.accent,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Crear Pregunta",
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Black,
                                fontSize = 17.sp
                            )
                            Text(
                                text = "Aporte al banco comunitario",
                                color = theme.textSecondary,
                                fontSize = 11.sp
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(30.dp),
                        enabled = !isSaving
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = theme.textSecondary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(Modifier.height(14.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 480.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedTextField(
                        value = question,
                        onValueChange = { question = it },
                        label = { Text("Enunciado de la pregunta") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 2,
                        maxLines = 4,
                        shape = RoundedCornerShape(12.dp)
                    )

                    OutlinedTextField(
                        value = subject,
                        onValueChange = { subject = it },
                        label = { Text("Asignatura / Curso") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )

                    Text(
                        text = "Área de Admisión UNSA:",
                        fontSize = 11.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textSecondary
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        listOf("General", "Ingenierías", "Biomédicas", "Sociales").forEach { areaName ->
                            val isSelected = selectedArea == areaName
                            com.jonsuapps.rastro.android.ui.components.Sticker3dPill(
                                selected = isSelected,
                                onClick = { selectedArea = areaName },
                                modifier = Modifier.weight(1f),
                                selectedColor = theme.accent,
                                unselectedColor = theme.surface,
                                selectedBevel = theme.accentBevel,
                                unselectedBevel = theme.cardBevel,
                                strokeColor = theme.strokeBorder,
                                strokeWidth = 1.2.dp,
                                bevelHeight = 2.dp
                            ) {
                                Text(
                                    text = areaName,
                                    fontSize = 10.sp,
                                    fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                    color = if (isSelected) Color.White else theme.textSecondary,
                                    maxLines = 1
                                )
                            }
                        }
                    }

                    OutlinedTextField(
                        value = imageUrl,
                        onValueChange = { imageUrl = it },
                        label = { Text("URL de Imagen (gráfico, fórmula, diagrama - opcional)") },
                        placeholder = { Text("https://ejemplo.com/grafico.png") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )

                    if (imageUrl.isNotBlank()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(theme.surfaceAccent)
                                .border(1.dp, theme.strokeBorder.copy(alpha = 0.3f), RoundedCornerShape(12.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            CachedRemoteImage(
                                url = imageUrl.trim(),
                                contentDescription = "Vista previa de la imagen",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Fit
                            )
                        }
                    }

                    Text(
                        text = "Opciones · selecciona el círculo de la respuesta correcta:",
                        fontSize = 11.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textSecondary
                    )

                    options.forEachIndexed { index, value ->
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = correctIndex == index,
                                onClick = { correctIndex = index },
                                colors = RadioButtonDefaults.colors(selectedColor = theme.accent)
                            )
                            OutlinedTextField(
                                value = value,
                                onValueChange = { options[index] = it },
                                label = { Text("Opción ${'A' + index}") },
                                modifier = Modifier.weight(1f),
                                singleLine = true,
                                shape = RoundedCornerShape(12.dp)
                            )
                        }
                    }

                    OutlinedTextField(
                        value = explanation,
                        onValueChange = { explanation = it },
                        label = { Text("Explicación o resolución paso a paso (opcional)") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 2,
                        maxLines = 4,
                        shape = RoundedCornerShape(12.dp)
                    )

                    error?.let {
                        Text(it, color = MaterialTheme.colorScheme.error, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }

                Spacer(Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.weight(1f).height(44.dp),
                        shape = RoundedCornerShape(14.dp),
                        enabled = !isSaving
                    ) {
                        Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.Bold)
                    }

                    val canPublish = !isSaving && question.isNotBlank() && options.count(String::isNotBlank) >= 2
                    Sticker3dButton(
                        onClick = {
                            val cleanOptions = options.map(String::trim).filter(String::isNotBlank)
                            val selectedCorrect = options.take(correctIndex).count(String::isNotBlank)
                            isSaving = true
                            error = null
                            ExamQuestionRepository.createCommunityQuestion(
                                question = question,
                                options = cleanOptions,
                                answerIndex = selectedCorrect.coerceIn(0, cleanOptions.lastIndex),
                                subject = subject.ifBlank { "General" },
                                explanation = explanation,
                                imageUrl = imageUrl.trim().ifBlank { null },
                                area = selectedArea
                            ) { result ->
                                isSaving = false
                                result.onSuccess {
                                    DuolingoHaptics.playAnswerCorrect(context)
                                    onDismiss()
                                }.onFailure {
                                    DuolingoHaptics.playAnswerIncorrect(context)
                                    error = "No se pudo guardar. Inicia sesión e inténtalo otra vez."
                                }
                            }
                        },
                        enabled = canPublish,
                        modifier = Modifier.weight(1.3f).height(44.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Text(
                            text = if (isSaving) "Publicando…" else "Publicar Pregunta",
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
