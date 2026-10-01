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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageMetadata
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun AddObraDialog(
    isOpen: Boolean,
    onDismiss: () -> Unit
) {
    if (!isOpen) return

    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val currentUser by UserManager.currentUser.collectAsState()

    var titulo by remember { mutableStateOf("") }
    var autor by remember { mutableStateOf("") }
    var categoria by remember { mutableStateOf("Literatura Peruana") }
    var genero by remember { mutableStateOf("Narrativo") }
    var especie by remember { mutableStateOf("Novela") }
    var corriente by remember { mutableStateOf("Contemporánea") }
    var anio by remember { mutableStateOf("") }
    var sinopsis by remember { mutableStateOf("") }
    var contextoHistorico by remember { mutableStateOf("") }
    var coverUrl by remember { mutableStateOf("") }
    var bannerUrl by remember { mutableStateOf("") }
    var documentUrl by remember { mutableStateOf("") }

    var isCategoryDropdownOpen by remember { mutableStateOf(false) }
    var isUploadingMedia by remember { mutableStateOf(false) }
    var uploadStatusMessage by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var isSaving by remember { mutableStateOf(false) }

    val categories = listOf(
        "Literatura Peruana",
        "Literatura Universal",
        "Literatura Española",
        "Literatura Hispanoamericana",
        "Literatura Regional"
    )

    // Selector de portada
    val pickCoverLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            isUploadingMedia = true
            uploadStatusMessage = "Subiendo portada a la nube..."
            errorMessage = null
            val bytes = try {
                context.contentResolver.openInputStream(uri)?.use { it.readBytes() }
            } catch (e: Exception) {
                null
            }
            if (bytes == null || bytes.isEmpty()) {
                errorMessage = "No se pudo leer la imagen local seleccionada."
                isUploadingMedia = false
                return@rememberLauncherForActivityResult
            }
            val ref = FirebaseStorage.getInstance().reference.child("uploads/book_cover_${System.currentTimeMillis()}.jpg")
            val metadata = StorageMetadata.Builder().setContentType("image/jpeg").build()
            ref.putBytes(bytes, metadata).continueWithTask { task ->
                if (!task.isSuccessful) throw task.exception ?: IllegalStateException("Error al subir portada")
                ref.downloadUrl
            }.addOnSuccessListener { downloadUri ->
                coverUrl = downloadUri.toString()
                isUploadingMedia = false
                DuolingoHaptics.playAnswerCorrect(context)
            }.addOnFailureListener {
                isUploadingMedia = false
                errorMessage = "Error al subir portada: ${it.localizedMessage}"
                DuolingoHaptics.playAnswerIncorrect(context)
            }
        }
    }

    // Selector de documento / PDF
    val pickDocLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            isUploadingMedia = true
            uploadStatusMessage = "Subiendo documento/PDF de la obra..."
            errorMessage = null
            val bytes = try {
                context.contentResolver.openInputStream(uri)?.use { it.readBytes() }
            } catch (e: Exception) {
                null
            }
            if (bytes == null || bytes.isEmpty()) {
                errorMessage = "No se pudo leer el archivo local."
                isUploadingMedia = false
                return@rememberLauncherForActivityResult
            }
            val ref = FirebaseStorage.getInstance().reference.child("uploads/book_doc_${System.currentTimeMillis()}.pdf")
            val metadata = StorageMetadata.Builder().setContentType("application/pdf").build()
            ref.putBytes(bytes, metadata).continueWithTask { task ->
                if (!task.isSuccessful) throw task.exception ?: IllegalStateException("Error al subir documento")
                ref.downloadUrl
            }.addOnSuccessListener { downloadUri ->
                documentUrl = downloadUri.toString()
                isUploadingMedia = false
                DuolingoHaptics.playAnswerCorrect(context)
            }.addOnFailureListener {
                isUploadingMedia = false
                errorMessage = "Error al subir documento: ${it.localizedMessage}"
                DuolingoHaptics.playAnswerIncorrect(context)
            }
        }
    }

    Dialog(
        onDismissRequest = { if (!isSaving && !isUploadingMedia) onDismiss() },
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.65f))
                .padding(horizontal = 20.dp, vertical = 24.dp),
            contentAlignment = Alignment.Center
        ) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = 520.dp)
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
                                color = Color(0xFF047857).copy(alpha = 0.12f),
                                modifier = Modifier.size(40.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        Icons.Rounded.AutoStories,
                                        contentDescription = null,
                                        tint = Color(0xFF047857),
                                        modifier = Modifier.size(22.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "Añadir Obra Adicional",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = theme.textPrimary
                                )
                                Text(
                                    text = "Biblioteca RASTRO Literatura",
                                    fontSize = 11.sp,
                                    color = theme.textSecondary
                                )
                            }
                        }

                        IconButton(onClick = onDismiss, enabled = !isSaving) {
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

                    if (isUploadingMedia) {
                        Column(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            LinearProgressIndicator(modifier = Modifier.fillMaxWidth(), color = Color(0xFF047857))
                            Text(uploadStatusMessage, fontSize = 11.sp, color = theme.textSecondary)
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                    }

                    // Título de la Obra
                    Text("Título de la Obra *", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = titulo,
                        onValueChange = { titulo = it; errorMessage = null },
                        placeholder = { Text("Ej: Crimen y Castigo", fontSize = 12.sp) },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Autor
                    Text("Autor *", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = autor,
                        onValueChange = { autor = it; errorMessage = null },
                        placeholder = { Text("Ej: Fiódor Dostoyevski", fontSize = 12.sp) },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Categoría
                    Text("Categoría Literaria *", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
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
                                Text(categoria, fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = theme.textPrimary)
                                Icon(Icons.Rounded.KeyboardArrowDown, contentDescription = null, tint = theme.textSecondary)
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
                                        categoria = cat
                                        isCategoryDropdownOpen = false
                                    }
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Fila de Género y Especie
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Género", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                            Spacer(modifier = Modifier.height(6.dp))
                            OutlinedTextField(
                                value = genero,
                                onValueChange = { genero = it },
                                placeholder = { Text("Narrativo", fontSize = 12.sp) },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                singleLine = true
                            )
                        }
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Especie", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                            Spacer(modifier = Modifier.height(6.dp))
                            OutlinedTextField(
                                value = especie,
                                onValueChange = { especie = it },
                                placeholder = { Text("Novela", fontSize = 12.sp) },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                singleLine = true
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Corriente y Año
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Corriente", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                            Spacer(modifier = Modifier.height(6.dp))
                            OutlinedTextField(
                                value = corriente,
                                onValueChange = { corriente = it },
                                placeholder = { Text("Realismo", fontSize = 12.sp) },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                singleLine = true
                            )
                        }
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Año / Época", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                            Spacer(modifier = Modifier.height(6.dp))
                            OutlinedTextField(
                                value = anio,
                                onValueChange = { anio = it },
                                placeholder = { Text("1866", fontSize = 12.sp) },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                singleLine = true
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Sinopsis / Argumento
                    Text("Argumento / Sinopsis *", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = sinopsis,
                        onValueChange = { sinopsis = it; errorMessage = null },
                        placeholder = { Text("Resumen del conflicto principal, personajes centrales y desenlace...", fontSize = 12.sp) },
                        modifier = Modifier.fillMaxWidth().height(90.dp),
                        shape = RoundedCornerShape(12.dp),
                        maxLines = 4
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Contexto Histórico
                    Text("Contexto Histórico", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                    Spacer(modifier = Modifier.height(6.dp))
                    OutlinedTextField(
                        value = contextoHistorico,
                        onValueChange = { contextoHistorico = it },
                        placeholder = { Text("Época de publicación, influencia social o política...", fontSize = 12.sp) },
                        modifier = Modifier.fillMaxWidth().height(80.dp),
                        shape = RoundedCornerShape(12.dp),
                        maxLines = 3
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // Portada de la Obra
                    Text("Portada de la Obra (Imagen)", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                    Spacer(modifier = Modifier.height(6.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = coverUrl,
                            onValueChange = { coverUrl = it },
                            placeholder = { Text("URL HTTPS o sube de tu galería", fontSize = 11.sp) },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp),
                            singleLine = true
                        )
                        IconButton(
                            onClick = { pickCoverLauncher.launch("image/*") },
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(theme.surfaceAccent)
                        ) {
                            Icon(Icons.Rounded.AddPhotoAlternate, contentDescription = "Subir Portada", tint = Color(0xFF047857))
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Archivo PDF / Documento de lectura
                    Text("Texto Completo o PDF de Lectura", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                    Spacer(modifier = Modifier.height(6.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = documentUrl,
                            onValueChange = { documentUrl = it },
                            placeholder = { Text("URL de Google Drive o PDF local", fontSize = 11.sp) },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp),
                            singleLine = true
                        )
                        IconButton(
                            onClick = { pickDocLauncher.launch("application/pdf") },
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(theme.surfaceAccent)
                        ) {
                            Icon(Icons.Rounded.UploadFile, contentDescription = "Subir PDF", tint = Color(0xFF047857))
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Botones de acción
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextButton(onClick = onDismiss, enabled = !isSaving) {
                            Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.SemiBold)
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Sticker3dButton(
                            enabled = !isSaving && titulo.isNotBlank() && autor.isNotBlank() && sinopsis.isNotBlank(),
                            onClick = {
                                if (titulo.isBlank() || autor.isBlank() || sinopsis.isBlank()) {
                                    DuolingoHaptics.playAnswerIncorrect(context)
                                    errorMessage = "Por favor ingresa título, autor y argumento de la obra."
                                    return@Sticker3dButton
                                }
                                val cleanCover = coverUrl.trim()
                                if (cleanCover.isNotBlank() && !cleanCover.startsWith("https://") && !cleanCover.startsWith("http://")) {
                                    DuolingoHaptics.playAnswerIncorrect(context)
                                    errorMessage = "La URL de la portada debe empezar con http:// o https://."
                                    return@Sticker3dButton
                                }

                                isSaving = true
                                val newId = "obra_adicional_${System.currentTimeMillis()}"
                                val newObraData = mapOf(
                                    "id" to newId,
                                    "titulo" to titulo.trim(),
                                    "autor" to autor.trim(),
                                    "categoria" to categoria,
                                    "genero" to genero.trim().ifBlank { "Narrativo" },
                                    "especie" to especie.trim().ifBlank { "Novela" },
                                    "corriente" to corriente.trim().ifBlank { "Contemporánea" },
                                    "anio" to anio.trim().ifBlank { "S/F" },
                                    "ano" to anio.trim().ifBlank { "S/F" },
                                    "sinopsis" to sinopsis.trim(),
                                    "contextoHistorico" to contextoHistorico.trim(),
                                    "coverUrl" to cleanCover,
                                    "bannerUrl" to bannerUrl.trim(),
                                    "documentUrl" to documentUrl.trim(),
                                    "colorHex" to "#047857",
                                    "authorUid" to (currentUser.uid.ifBlank { "community" }),
                                    "authorName" to (currentUser.displayName.ifBlank { "Estudiante RASTRO" }),
                                    "createdAt" to com.google.firebase.firestore.FieldValue.serverTimestamp()
                                )

                                FirebaseFirestore.getInstance().collection("libros").document(newId)
                                    .set(newObraData, SetOptions.merge())
                                    .addOnSuccessListener {
                                        isSaving = false
                                        DuolingoHaptics.playAnswerCorrect(context)
                                        onDismiss()
                                    }
                                    .addOnFailureListener {
                                        isSaving = false
                                        errorMessage = "Error al guardar obra: ${it.localizedMessage}"
                                        DuolingoHaptics.playAnswerIncorrect(context)
                                    }
                            },
                            containerColor = Color(0xFF047857),
                            bottomBevelColor = Color(0xFF065F46),
                            strokeColor = theme.strokeBorder,
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier.height(46.dp)
                        ) {
                            Icon(Icons.Rounded.Save, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = if (isSaving) "Guardando…" else "Guardar Obra",
                                fontWeight = FontWeight.Bold,
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
