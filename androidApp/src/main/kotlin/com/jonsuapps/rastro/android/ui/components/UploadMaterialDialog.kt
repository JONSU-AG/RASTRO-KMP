package com.jonsuapps.rastro.android.ui.components

import android.net.Uri
import android.provider.OpenableColumns
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageMetadata
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.android.util.LegalLinks
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
    var selectedCategory by remember { mutableStateOf("Material Educativo") }
    var fileUrl by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var isCategoryDropdownOpen by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var isPublishing by remember { mutableStateOf(false) }

    // Estado de subida de archivo local
    var sourceModeTab by remember { mutableIntStateOf(0) } // 0: Enlace Drive/Web, 1: Archivo / PDF Local
    var isUploadingFile by remember { mutableStateOf(false) }
    var fileUploadProgress by remember { mutableStateOf("") }
    var uploadedFileName by remember { mutableStateOf<String?>(null) }

    val pickFileLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            isUploadingFile = true
            fileUploadProgress = "Leyendo archivo..."
            errorMessage = null

            val bytes = try {
                context.contentResolver.openInputStream(uri)?.use { it.readBytes() }
            } catch (e: Exception) {
                null
            }

            if (bytes == null || bytes.isEmpty()) {
                errorMessage = "No se pudo leer el archivo local seleccionado."
                isUploadingFile = false
                return@rememberLauncherForActivityResult
            }

            var origName: String? = null
            if (uri.scheme == "content") {
                context.contentResolver.query(uri, null, null, null, null)?.use { cursor ->
                    if (cursor.moveToFirst()) {
                        val nameIdx = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                        if (nameIdx >= 0) origName = cursor.getString(nameIdx)
                    }
                }
            }
            if (origName == null) {
                origName = uri.lastPathSegment ?: "aporte_${System.currentTimeMillis()}.pdf"
            }
            val cleanName = origName!!.replace("[^a-zA-Z0-9._-]".toRegex(), "_")
            val isPdfFile = cleanName.endsWith(".pdf", ignoreCase = true)
            val mimeType = if (isPdfFile) "application/pdf" else (context.contentResolver.getType(uri) ?: "application/octet-stream")

            fileUploadProgress = "Subiendo archivo a la nube..."
            val storagePath = "uploads/material_${currentUser.uid}_${System.currentTimeMillis()}_$cleanName"
            val ref = FirebaseStorage.getInstance().reference.child(storagePath)
            val metadata = StorageMetadata.Builder().setContentType(mimeType).build()

            ref.putBytes(bytes, metadata).continueWithTask { task ->
                if (!task.isSuccessful) throw task.exception ?: IllegalStateException("Error al subir archivo a Storage")
                ref.downloadUrl
            }.addOnSuccessListener { downloadUri ->
                fileUrl = downloadUri.toString()
                if (title.isBlank()) {
                    title = origName!!.substringBeforeLast('.')
                }
                uploadedFileName = origName
                isUploadingFile = false
                DuolingoHaptics.playAnswerCorrect(context)
            }.addOnFailureListener { e ->
                isUploadingFile = false
                errorMessage = "Error al subir archivo: ${e.localizedMessage}"
                DuolingoHaptics.playAnswerIncorrect(context)
            }
        }
    }

    val categories = listOf(
        "Material Educativo",
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

                    // 3. Origen del Material: Enlace vs Archivo Local / PDF
                    Text(
                        text = "Archivo o Enlace del Material *",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    // Pestañas de modo de aporte
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(theme.surfaceAccent)
                            .padding(4.dp),
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Surface(
                            onClick = {
                                sourceModeTab = 0
                                errorMessage = null
                            },
                            shape = RoundedCornerShape(10.dp),
                            color = if (sourceModeTab == 0) Color(0xFFF97316) else Color.Transparent,
                            modifier = Modifier.weight(1f)
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 8.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Rounded.Link,
                                    contentDescription = null,
                                    tint = if (sourceModeTab == 0) Color.White else theme.textSecondary,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Enlace Web / Drive",
                                    fontSize = 12.sp,
                                    fontWeight = if (sourceModeTab == 0) FontWeight.Bold else FontWeight.Medium,
                                    color = if (sourceModeTab == 0) Color.White else theme.textSecondary
                                )
                            }
                        }

                        Surface(
                            onClick = {
                                sourceModeTab = 1
                                errorMessage = null
                            },
                            shape = RoundedCornerShape(10.dp),
                            color = if (sourceModeTab == 1) Color(0xFFF97316) else Color.Transparent,
                            modifier = Modifier.weight(1f)
                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 8.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Rounded.AttachFile,
                                    contentDescription = null,
                                    tint = if (sourceModeTab == 1) Color.White else theme.textSecondary,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Subir Archivo / PDF",
                                    fontSize = 12.sp,
                                    fontWeight = if (sourceModeTab == 1) FontWeight.Bold else FontWeight.Medium,
                                    color = if (sourceModeTab == 1) Color.White else theme.textSecondary
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    if (sourceModeTab == 1) {
                        // Subida directa de archivo / PDF a Storage
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = theme.surfaceAccent,
                            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(
                                modifier = Modifier.padding(14.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                if (uploadedFileName != null) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(10.dp))
                                            .background(Color(0xFF10B981).copy(alpha = 0.12f))
                                            .padding(10.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            Icons.Rounded.CheckCircle,
                                            contentDescription = null,
                                            tint = Color(0xFF10B981),
                                            modifier = Modifier.size(20.dp)
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = uploadedFileName ?: "Archivo listo",
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = theme.textPrimary,
                                                maxLines = 1
                                            )
                                            Text(
                                                text = "Listo para publicar en la comunidad",
                                                fontSize = 10.5.sp,
                                                color = Color(0xFF10B981)
                                            )
                                        }
                                        IconButton(
                                            onClick = {
                                                uploadedFileName = null
                                                fileUrl = ""
                                            },
                                            modifier = Modifier.size(28.dp)
                                        ) {
                                            Icon(
                                                Icons.Rounded.Delete,
                                                contentDescription = "Quitar",
                                                tint = theme.textSecondary,
                                                modifier = Modifier.size(16.dp)
                                            )
                                        }
                                    }
                                }

                                if (isUploadingFile) {
                                    Column(
                                        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {
                                        LinearProgressIndicator(
                                            modifier = Modifier.fillMaxWidth(),
                                            color = Color(0xFFF97316)
                                        )
                                        Text(
                                            text = fileUploadProgress,
                                            fontSize = 11.sp,
                                            color = theme.textSecondary
                                        )
                                    }
                                } else {
                                    Sticker3dButton(
                                        onClick = {
                                            if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
                                                pickFileLauncher.launch("*/*")
                                            } else {
                                                onRequestSignIn()
                                            }
                                        },
                                        containerColor = Color(0xFFF97316),
                                        bottomBevelColor = Color(0xFFC2410C),
                                        strokeColor = theme.strokeBorder,
                                        shape = RoundedCornerShape(12.dp),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Icon(
                                            Icons.Rounded.UploadFile,
                                            contentDescription = null,
                                            tint = Color.White,
                                            modifier = Modifier.size(18.dp)
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = if (uploadedFileName == null) "Elegir archivo / PDF del dispositivo" else "Cambiar archivo",
                                            color = Color.White,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 12.5.sp
                                        )
                                    }
                                }
                            }
                        }
                    } else {
                        // Enlace directo
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
                    }

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

                    Spacer(modifier = Modifier.height(14.dp))

                    // Aviso discreto de cumplimiento de Normas de la Comunidad
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Policy,
                            contentDescription = null,
                            tint = theme.textSecondary,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Al publicar contenido debes cumplir las ",
                            fontSize = 11.sp,
                            color = theme.textSecondary
                        )
                        Text(
                            text = "Normas de la Comunidad",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFF97316),
                            textDecoration = androidx.compose.ui.text.style.TextDecoration.Underline,
                            modifier = Modifier.clickable {
                                LegalLinks.openUrl(context, LegalLinks.URL_COMUNIDAD)
                            }
                        )
                        Text(
                            text = ".",
                            fontSize = 11.sp,
                            color = theme.textSecondary
                        )
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    // Botones de acción
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextButton(onClick = onClose) {
                            Icon(Icons.Rounded.Close, contentDescription = null, tint = theme.textSecondary, modifier = Modifier.size(15.dp))
                            Spacer(Modifier.width(4.dp))
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
