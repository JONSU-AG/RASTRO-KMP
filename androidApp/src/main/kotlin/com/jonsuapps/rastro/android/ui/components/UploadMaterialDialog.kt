package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun UploadMaterialDialog(
    isOpen: Boolean,
    onClose: () -> Unit,
    onUploadSuccess: () -> Unit = {},
    onRequestSignIn: () -> Unit = {}
) {
    if (!isOpen) return

    val theme = ThemeManager.currentTheme
    val currentUser by UserManager.currentUser.collectAsState()
    val context = androidx.compose.ui.platform.LocalContext.current

    var title by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("Tomos CEPREUNSA") }
    var fileUrl by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var isCategoryDropdownOpen by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var isPublishing by remember { mutableStateOf(false) }

    val categories = listOf(
        "Tomos CEPREUNSA",
        "Biología & Anatomía",
        "Química & Estequiometría",
        "Física Clásica & Moderna",
        "Matemática & Álgebra",
        "Geometría & Trigonometría",
        "Literatura Peruana & Universal",
        "Historia del Perú & Universal",
        "Filosofía & Lógica",
        "Psicología & Cívica",
        "Razonamiento Verbal",
        "Razonamiento Matemático",
        "Formularios de Repaso"
    )

    Dialog(
        onDismissRequest = onClose,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.65f))
                .padding(horizontal = 20.dp, vertical = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = 500.dp)
                    .wrapContentHeight(),
                shape = RoundedCornerShape(26.dp),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 5.dp
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    // Encabezado
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = Color(0xFFF97316).copy(alpha = 0.12f),
                                modifier = Modifier.size(40.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        Icons.Rounded.CloudUpload,
                                        contentDescription = null,
                                        tint = Color(0xFFF97316),
                                        modifier = Modifier.size(22.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "Subir Aporte de Material",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = theme.textPrimary
                                )
                                Text(
                                    text = "Comparte con la comunidad RASTRO UNSA",
                                    fontSize = 11.sp,
                                    color = theme.textSecondary
                                )
                            }
                        }

                        IconButton(onClick = onClose) {
                            Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    if (errorMessage != null) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = Color(0xFFEF4444).copy(alpha = 0.12f),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = errorMessage ?: "",
                                color = Color(0xFFEF4444),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                    }

                    if (!currentUser.isAuthenticated || currentUser.isAnonymous) {
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            color = theme.accent.copy(alpha = 0.09f),
                            border = androidx.compose.foundation.BorderStroke(1.dp, theme.accent.copy(alpha = 0.25f))
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(10.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(Icons.Rounded.Lock, contentDescription = null, tint = theme.accent)
                                Text("Inicia sesión para publicar tu aporte.", modifier = Modifier.weight(1f),
                                    color = theme.textPrimary, fontSize = 12.sp)
                                TextButton(onClick = onRequestSignIn) { Text("Entrar") }
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                    }

                    // 1. Título del aporte
                    Text(
                        text = "Título del Material *",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = title,
                        onValueChange = {
                            title = it
                            errorMessage = null
                        },
                        placeholder = { Text("Ej: Banco de Preguntas Fijas Biología 2026", fontSize = 12.sp) },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFF97316),
                            unfocusedBorderColor = theme.borderSubtle
                        )
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // 2. Asignatura / Categoría
                    Text(
                        text = "Materia / Categoría *",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = theme.surfaceAccent,
                            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle),
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { isCategoryDropdownOpen = !isCategoryDropdownOpen }
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = selectedCategory,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = theme.textPrimary
                                )
                                Icon(
                                    Icons.Rounded.KeyboardArrowDown,
                                    contentDescription = null,
                                    tint = theme.textSecondary
                                )
                            }
                        }

                        DropdownMenu(
                            expanded = isCategoryDropdownOpen,
                            onDismissRequest = { isCategoryDropdownOpen = false },
                            modifier = Modifier.background(theme.surface)
                        ) {
                            categories.forEach { cat ->
                                DropdownMenuItem(
                                    text = { Text(cat, fontSize = 13.sp, color = theme.textPrimary) },
                                    onClick = {
                                        selectedCategory = cat
                                        isCategoryDropdownOpen = false
                                    }
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // 3. Enlace (Drive / PDF / Web)
                    Text(
                        text = "Enlace de Descarga o Vista (Google Drive / Web) *",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = fileUrl,
                        onValueChange = {
                            fileUrl = it
                            errorMessage = null
                        },
                        placeholder = { Text("https://drive.google.com/file/d/...", fontSize = 12.sp) },
                        leadingIcon = {
                            Icon(Icons.Rounded.Link, contentDescription = null, tint = theme.textSecondary)
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFF97316),
                            unfocusedBorderColor = theme.borderSubtle
                        )
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // 4. Descripción del material
                    Text(
                        text = "Descripción o Recomendación *",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = description,
                        onValueChange = {
                            description = it
                            errorMessage = null
                        },
                        placeholder = { Text("Explica qué contiene este aporte, en qué semana o fase se usó...", fontSize = 12.sp) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp),
                        shape = RoundedCornerShape(12.dp),
                        maxLines = 4,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFF97316),
                            unfocusedBorderColor = theme.borderSubtle
                        )
                    )

                    Spacer(modifier = Modifier.height(22.dp))

                    // Botones de acción
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextButton(onClick = onClose) {
                            Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.SemiBold)
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Sticker3dButton(
                            enabled = !isPublishing && currentUser.isAuthenticated && !currentUser.isAnonymous,
                            onClick = {
                                if (title.isBlank()) {
                                    DuolingoHaptics.playAnswerIncorrect(context)
                                    errorMessage = "Por favor ingresa un título para tu aporte."
                                    return@Sticker3dButton
                                }
                                if (fileUrl.isBlank()) {
                                    DuolingoHaptics.playAnswerIncorrect(context)
                                    errorMessage = "Por favor ingresa un enlace o archivo de descarga."
                                    return@Sticker3dButton
                                }
                                if (description.isBlank()) {
                                    DuolingoHaptics.playAnswerIncorrect(context)
                                    errorMessage = "Por favor añade una breve descripción de tu aporte."
                                    return@Sticker3dButton
                                }
                                if (!fileUrl.trim().startsWith("https://") && !fileUrl.trim().startsWith("http://")) {
                                    DuolingoHaptics.playAnswerIncorrect(context)
                                    errorMessage = "El enlace debe comenzar con https:// o http://."
                                    return@Sticker3dButton
                                }
                                isPublishing = true
                                UserUploadRepository.publish(
                                    user = currentUser,
                                    title = title,
                                    author = currentUser.displayName,
                                    category = selectedCategory,
                                    url = fileUrl,
                                    description = description
                                ) { result ->
                                    isPublishing = false
                                    result.onSuccess {
                                        DuolingoHaptics.playAnswerCorrect(context)
                                        onUploadSuccess()
                                        onClose()
                                    }.onFailure { error ->
                                        DuolingoHaptics.playAnswerIncorrect(context)
                                        errorMessage = error.localizedMessage ?: "No se pudo publicar el material."
                                    }
                                }
                            },
                            containerColor = Color(0xFFF97316),
                            bottomBevelColor = Color(0xFFC2410C),
                            strokeColor = theme.strokeBorder,
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier.height(48.dp),
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp)
                        ) {
                            Icon(Icons.Rounded.Send, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = if (isPublishing) "Publicando…" else "Publicar Aporte",
                                fontWeight = FontWeight.Black,
                                color = Color.White,
                                fontSize = 13.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
