package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.ErrorBankOrigins
import com.jonsuapps.rastro.android.data.FailedQuestion
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.android.ui.components.answerText
import com.jonsuapps.rastro.theme.RastroPalette

@Composable fun ErrorBankDialog(questions: List<FailedQuestion>, theme: RastroPalette,
    initialOrigin: String = ErrorBankOrigins.APRENDER, onDismiss: () -> Unit,
    onSolve: ((String) -> Unit)? = null, shared: Boolean = false,
    onShareChange: ((Boolean) -> Unit)? = null, status: String? = null,
    title: String = "Mis errores", paused: Boolean = false, clearing: Boolean = false,
    onPauseChange: ((Boolean) -> Unit)? = null, onClearAll: (() -> Unit)? = null) {
    var selectedOrigin by remember(initialOrigin) { mutableStateOf(initialOrigin) }
    Dialog(onDismiss, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Box(Modifier.fillMaxSize().padding(12.dp), contentAlignment = Alignment.Center) {
            Sticker3dCard(Modifier.widthIn(max = 680.dp).fillMaxWidth().fillMaxHeight(.92f),
                containerColor = theme.surface, strokeColor = theme.strokeBorder,
                bevelColor = theme.cardBevel, shape = RoundedCornerShape(26.dp)) {
                Column(Modifier.fillMaxSize().padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Column(Modifier.weight(1f)) {
                            Text(title, color = theme.textPrimary, fontSize = 20.sp, fontWeight = FontWeight.Black)
                            Text("Repasa tus fallos por modalidad", color = theme.textSecondary, fontSize = 12.sp)
                        }
                        IconButton(onClick = onDismiss) { Icon(Icons.Rounded.Close, "Cerrar", tint = theme.textPrimary) }
                    }
                    LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        items(ErrorBankOrigins.all) { origin ->
                            FilterChip(selectedOrigin == origin, onClick = { selectedOrigin = origin }, label = {
                                Text("$origin · ${questions.count { !it.isSolved && it.origin == origin }}")
                            })
                        }
                    }
                    // Privacy, status and cards share one scroll so large fonts/small landscape windows remain usable.
                    LazyColumn(Modifier.weight(1f).fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        if (onPauseChange != null) item {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Column(Modifier.weight(1f)) {
                                    Text("Pausar guardado de errores", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                                    Text(if (paused) "Puedes seguir practicando. Tus errores nuevos no se guardarán."
                                        else "Guarda los fallos nuevos para repasarlos después.", color = theme.textSecondary, fontSize = 12.sp)
                                }
                                Switch(paused, onCheckedChange = onPauseChange)
                            }
                        }
                        if (onClearAll != null) item {
                            Sticker3dButton(onClick = onClearAll, enabled = questions.isNotEmpty() && !clearing,
                                modifier = Modifier.fillMaxWidth(), containerColor = theme.surfaceAccent,
                                bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder) {
                                Text(if (clearing) "Limpiando…" else "Limpiar todos los errores", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                            }
                            Text("Limpia todas las modalidades, incluidos los errores repasados. Tu progreso se conserva.",
                                color = theme.textSecondary, fontSize = 12.sp)
                        }
                        if (onShareChange != null) item {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Column(Modifier.weight(1f)) {
                                    Text(if (shared) "Compartidos públicamente" else "Privados: solo tú", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                                    Text("Al activar compartes tus 30 errores más recientes en tu perfil, incluidas tus respuestas. Puedes volver a hacerlos privados.", color = theme.textSecondary, fontSize = 12.sp)
                                }
                                Switch(shared, onCheckedChange = onShareChange)
                            }
                        }
                        status?.let { message -> item { Text(message, color = theme.textSecondary) } }
                        val filtered = questions.filter { it.origin == selectedOrigin }.sortedWith(compareBy<FailedQuestion> { it.isSolved }.thenByDescending { it.dateAdded })
                        if (filtered.isEmpty()) item {
                            Text("Aún no hay errores registrados en $selectedOrigin.", color = theme.textSecondary, modifier = Modifier.padding(vertical = 24.dp))
                        }
                        items(filtered, key = { it.id }) { question ->
                            QuestionReviewCard(question, theme, status = if (question.isSolved) "Repasado" else "Pendiente",
                                onSolve = if (question.isSolved || onSolve == null) null else { { onSolve(question.id) } })
                        }
                    }
                }
            }
        }
    }
}

/** Used both in the private error bank and the completed-exam review; never evaluates or awards XP. */
@Composable internal fun QuestionReviewCard(question: FailedQuestion, theme: RastroPalette,
    status: String = "Pendiente", onSolve: (() -> Unit)? = null) {
    Sticker3dCard(Modifier.fillMaxWidth(), containerColor = theme.surface,
        strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel, shape = RoundedCornerShape(18.dp)) {
        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            // Metadata and status occupy separate lines: a long subject cannot squeeze "Pendiente" vertically.
            Text(listOf(question.origin, question.subject, question.subtema).filter { it.isNotBlank() }.joinToString(" · "),
                color = theme.textSecondary, fontSize = 12.sp, lineHeight = 17.sp)
            Text(status, color = theme.textSecondary, fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Text(question.question, color = theme.textPrimary, fontWeight = FontWeight.Bold, fontSize = 16.sp, lineHeight = 23.sp)
            question.imageUrl?.takeIf { it.isNotBlank() }?.let { url ->
                CachedRemoteImage(url = url, contentDescription = "Imagen de la pregunta", modifier = Modifier.fillMaxWidth().heightIn(max = 240.dp), contentScale = androidx.compose.ui.layout.ContentScale.Fit)
            }
            question.options.forEachIndexed { index, option ->
                val correct = index == question.correctAnswerIndex
                val selected = index == question.selectedAnswerIndex
                val color = if (correct || selected) theme.answerText(correct) else theme.textPrimary
                Column(Modifier.fillMaxWidth().background(theme.surfaceAccent, RoundedCornerShape(12.dp)).padding(10.dp)) {
                    Text("${('A' + index)}. $option", color = color,
                        fontWeight = if (correct || selected) FontWeight.Bold else FontWeight.Normal, lineHeight = 21.sp)
                    if (correct || selected) Text(when {
                        correct && selected -> "Tu respuesta · Correcta"
                        correct -> "Respuesta correcta"
                        else -> "Tu respuesta · Incorrecta"
                    }, color = color, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }
            if (question.selectedAnswerIndex == null) Text("Tu respuesta: sin responder", color = theme.textSecondary)
            if (question.explanation.isNotBlank()) {
                Column(Modifier.fillMaxWidth().background(theme.surfaceAccent, RoundedCornerShape(12.dp)).padding(12.dp)) {
                    Text("Explicación", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                    Text(question.explanation, color = theme.textPrimary, fontSize = 14.sp, lineHeight = 21.sp)
                }
            }
            onSolve?.let { action ->
                Sticker3dButton(action, modifier = Modifier.fillMaxWidth(), containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder) {
                    Text("Ya lo entendí · Marcar repasado", color = com.jonsuapps.rastro.android.ui.components.contrastingText(theme.accent), fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
