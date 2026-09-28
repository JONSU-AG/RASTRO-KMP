package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ContentCopy
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.SmartToy
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.data.OrsttyService
import com.jonsuapps.rastro.model.OrsttyContextSource
import com.jonsuapps.rastro.model.OrsttyMessage
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import kotlinx.coroutines.launch

@Composable
fun OrsttyScreen(
    contextSource: OrsttyContextSource = OrsttyContextSource.DIRECT,
    sourceSubject: String? = null,
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val scope = rememberCoroutineScope()
    val listState = rememberLazyListState()

    val messages = remember {
        mutableStateListOf<OrsttyMessage>().apply {
            addAll(OrsttyService.sampleInitialMessages)
        }
    }

    var inputText by remember { mutableStateOf("") }
    val suggestionChips = remember(contextSource, sourceSubject) {
        OrsttyService.getChipsForSource(contextSource, sourceSubject)
    }

    // Auto-scroll al recibir o enviar mensaje
    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) {
            listState.animateScrollToItem(messages.size - 1)
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background)
    ) {
        // Cabecera de 56px de Orstty IA
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(theme.surface)
                .border(1.dp, theme.borderSubtle)
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RastroShapes.Pill)
                    .background(theme.accent.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.SmartToy,
                    contentDescription = null,
                    tint = theme.accent,
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = "ORSTTY IA",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = theme.textPrimary
                )
                Text(
                    text = "Tutor Académico Preuniversitario • En línea",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color(0xFF10B981)
                )
            }
        }

        // Aviso Permanente de Inteligencia Artificial (MAPA_PARA_KOTLIN §9 y §11)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(theme.surfaceAccent.copy(alpha = 0.6f))
                .padding(horizontal = 16.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Info,
                contentDescription = null,
                tint = theme.textSecondary,
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Orstty puede cometer errores. Recuerda contrastar siempre con tus libros oficiales.",
                style = MaterialTheme.typography.labelSmall,
                color = theme.textSecondary,
                fontSize = 11.sp
            )
        }

        // Mensajes del Chat
        LazyColumn(
            state = listState,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(messages, key = { it.id }) { msg ->
                OrsttyMessageBubble(message = msg, theme = theme)
            }
        }

        // Carrusel de Chips Sugeridos (Cero Emojis en UI)
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(suggestionChips) { chipText ->
                Box(
                    modifier = Modifier
                        .clip(RastroShapes.Pill)
                        .background(theme.surface)
                        .border(1.dp, theme.accent.copy(alpha = 0.3f), RastroShapes.Pill)
                        .clickable {
                            val userMsg = OrsttyMessage(
                                id = "msg_${System.currentTimeMillis()}",
                                isFromOrstty = false,
                                content = chipText,
                                timestamp = System.currentTimeMillis()
                            )
                            messages.add(userMsg)

                            // Respuesta simulada de Orstty con rigor preuniversitario
                            val orsttyResponse = OrsttyMessage(
                                id = "msg_resp_${System.currentTimeMillis()}",
                                isFromOrstty = true,
                                content = "Excelente consulta: '$chipText'. En el examen de admisión, este punto es clave. Recuerda sintetizar los datos del enunciado, verificar las unidades y descartar opciones distractivas mediante el principio de coherencia.",
                                timestamp = System.currentTimeMillis() + 500L
                            )
                            messages.add(orsttyResponse)
                        }
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = chipText,
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.accent,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }

        // Barra Inferior de Entrada de Texto
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 110.dp, top = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = inputText,
                onValueChange = { inputText = it },
                placeholder = {
                    Text(
                        text = "Pregúntale a Orstty sobre fórmulas o teoría...",
                        style = MaterialTheme.typography.bodySmall,
                        color = theme.textSecondary
                    )
                },
                modifier = Modifier
                    .weight(1f)
                    .clip(RastroShapes.Squircle),
                singleLine = true,
                shape = RastroShapes.Squircle,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = theme.accent,
                    unfocusedBorderColor = theme.borderSubtle,
                    focusedContainerColor = theme.surface,
                    unfocusedContainerColor = theme.surface
                )
            )

            Spacer(modifier = Modifier.width(8.dp))

            IconButton(
                onClick = {
                    if (inputText.isNotBlank()) {
                        val userText = inputText.trim()
                        inputText = ""
                        val userMsg = OrsttyMessage(
                            id = "msg_${System.currentTimeMillis()}",
                            isFromOrstty = false,
                            content = userText,
                            timestamp = System.currentTimeMillis()
                        )
                        messages.add(userMsg)

                        val orsttyResp = OrsttyMessage(
                            id = "msg_resp_${System.currentTimeMillis()}",
                            isFromOrstty = true,
                            content = "Analizando tu pregunta sobre '$userText':\n1. Identifica el marco teórico del tema.\n2. Plantea las ecuaciones o axiomas correspondientes.\n3. Recuerda que la práctica constante es la que asegura tu vacante preuniversitaria.",
                            timestamp = System.currentTimeMillis() + 600L
                        )
                        messages.add(orsttyResp)
                    }
                },
                modifier = Modifier
                    .size(46.dp)
                    .clip(RastroShapes.Pill)
                    .background(theme.accent)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Send,
                    contentDescription = "Enviar mensaje",
                    tint = theme.surface,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Composable
fun OrsttyMessageBubble(
    message: OrsttyMessage,
    theme: com.jonsuapps.rastro.theme.RastroPalette
) {
    val isOrstty = message.isFromOrstty

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (isOrstty) Arrangement.Start else Arrangement.End
    ) {
        if (isOrstty) {
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .clip(RastroShapes.Pill)
                    .background(theme.accent.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.SmartToy,
                    contentDescription = null,
                    tint = theme.accent,
                    modifier = Modifier.size(16.dp)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
        }

        Column(
            modifier = Modifier.fillMaxWidth(0.82f),
            horizontalAlignment = if (isOrstty) Alignment.Start else Alignment.End
        ) {
            Box(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 16.dp,
                            bottomStart = if (isOrstty) 4.dp else 16.dp,
                            bottomEnd = if (isOrstty) 16.dp else 4.dp
                        )
                    )
                    .background(if (isOrstty) theme.surface else theme.accent)
                    .border(
                        1.dp,
                        if (isOrstty) theme.borderSubtle else Color.Transparent,
                        RoundedCornerShape(16.dp)
                    )
                    .padding(12.dp)
            ) {
                Text(
                    text = message.content,
                    style = MaterialTheme.typography.bodyMedium,
                    color = if (isOrstty) theme.textPrimary else theme.surface,
                    lineHeight = 20.sp
                )
            }

            if (isOrstty) {
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ContentCopy,
                        contentDescription = "Copiar",
                        tint = theme.textSecondary,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Copiar",
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.textSecondary,
                        fontSize = 11.sp
                    )
                }
            }
        }
    }
}
