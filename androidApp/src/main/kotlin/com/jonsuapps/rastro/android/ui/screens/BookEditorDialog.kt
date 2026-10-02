package com.jonsuapps.rastro.android.ui.screens

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Image
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
import androidx.compose.ui.platform.LocalContext
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.android.data.DriveUploadRepository
import com.jonsuapps.rastro.android.util.ImageCacheManager
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.screens.literatura.ObraBannerGraphic
import com.jonsuapps.rastro.android.ui.screens.literatura.ObraCoverGraphic
import com.jonsuapps.rastro.android.ui.screens.literatura.PersonajeAvatarGraphic
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.theme.ThemeManager

/**
 * Diálogo de Administración de Recursos Visuales y Metadatos de la Obra.
 *
 * Permite administrar de forma integral:
 * 1. Portada: Subir, cambiar y quitar (con persistencia en Firebase Storage y Firestore).
 * 2. Banner: Subir, cambiar y quitar (con crop controlado y preview adaptativo).
 * 3. Personajes: Subir, cambiar y quitar imágenes individuales por personaje.
 *
 * Mantiene intactos todos los textos y datos académicos de la obra original.
 */
@Composable
internal fun BookEditorDialog(book: ObraLiteraria, onDismiss: () -> Unit) {
    val theme = ThemeManager.currentTheme
    var title by remember { mutableStateOf(book.titulo) }
    var author by remember { mutableStateOf(book.autor) }
    var description by remember { mutableStateOf(book.sinopsis) }
    var history by remember { mutableStateOf(book.contextoHistorico) }

    // Recursos visuales editables
    var cover by remember { mutableStateOf(book.coverUrl) }
    var banner by remember { mutableStateOf(book.bannerUrl) }

    // Lista mutable de personajes para editar fotos individuales
    var charactersState by remember {
        mutableStateOf(book.personajes.map { it.copy() })
    }

    var busy by remember { mutableStateOf(false) }
    var busyMessage by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }
    val user = UserManager.currentUser.value

    val themeColor = runCatching {
        Color(android.graphics.Color.parseColor(book.colorHex))
    }.getOrDefault(Color(0xFF047857))

    val context = LocalContext.current

    // Selector de Portada
    val pickCover = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            busy = true
            busyMessage = "Subiendo portada a la nube..."
            error = null
            val bytes = try {
                context.contentResolver.openInputStream(uri)?.use { it.readBytes() }
            } catch (e: Exception) {
                null
            }
            if (bytes == null || bytes.isEmpty()) {
                error = "No se pudo leer la imagen local seleccionada"
                busy = false
                return@rememberLauncherForActivityResult
            }
            DriveUploadRepository.uploadUserFile(
                context = context,
                bytes = bytes,
                displayName = "portada_${book.id}_${System.currentTimeMillis()}.jpg",
                mimeType = "image/jpeg",
                makePublic = true,
                onResult = { result ->
                    result.onSuccess { file ->
                        ImageCacheManager.evict(cover)
                        cover = file.directUrl
                        busy = false
                    }.onFailure {
                        error = "Error al subir portada: ${it.localizedMessage}"
                        busy = false
                    }
                }
            )
        }
    }

    // Selector de Banner
    val pickBanner = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            busy = true
            busyMessage = "Subiendo banner superior..."
            error = null
            val bytes = try {
                context.contentResolver.openInputStream(uri)?.use { it.readBytes() }
            } catch (e: Exception) {
                null
            }
            if (bytes == null || bytes.isEmpty()) {
                error = "No se pudo leer la imagen local seleccionada"
                busy = false
                return@rememberLauncherForActivityResult
            }
            DriveUploadRepository.uploadUserFile(
                context = context,
                bytes = bytes,
                displayName = "banner_${book.id}_${System.currentTimeMillis()}.jpg",
                mimeType = "image/jpeg",
                makePublic = true,
                onResult = { result ->
                    result.onSuccess { file ->
                        ImageCacheManager.evict(banner)
                        banner = file.directUrl
                        busy = false
                    }.onFailure {
                        error = "Error al subir banner: ${it.localizedMessage}"
                        busy = false
                    }
                }
            )
        }
    }

    // Selector individual de personaje
    var targetCharIndex by remember { mutableIntStateOf(-1) }
    val pickCharacterPhoto = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        val idx = targetCharIndex
        if (uri != null && idx in charactersState.indices) {
            busy = true
            busyMessage = "Subiendo foto del personaje..."
            error = null
            val bytes = try {
                context.contentResolver.openInputStream(uri)?.use { it.readBytes() }
            } catch (e: Exception) {
                null
            }
            if (bytes == null || bytes.isEmpty()) {
                error = "No se pudo leer la foto local seleccionada"
                busy = false
                return@rememberLauncherForActivityResult
            }
            DriveUploadRepository.uploadUserFile(
                context = context,
                bytes = bytes,
                displayName = "personaje_${book.id}_${idx}_${System.currentTimeMillis()}.jpg",
                mimeType = "image/jpeg",
                makePublic = true,
                onResult = { result ->
                    result.onSuccess { file ->
                        ImageCacheManager.evict(charactersState[idx].imageUrl)
                        val updated = charactersState.toMutableList()
                        updated[idx] = updated[idx].copy(imageUrl = file.directUrl)
                        charactersState = updated
                        busy = false
                    }.onFailure {
                        error = "Error al subir foto de personaje: ${it.localizedMessage}"
                        busy = false
                    }
                }
            )
        }
    }

    Dialog(onDismissRequest = { if (!busy) onDismiss() }, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Sticker3dCard(
            Modifier
                .fillMaxWidth(0.96f)
                .fillMaxHeight(0.94f),
            containerColor = theme.surface,
            strokeColor = theme.strokeBorder,
            bevelColor = theme.cardBevel
        ) {
            Column(
                Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                Text(
                    "Administración de Obra: ${book.titulo}",
                    style = MaterialTheme.typography.titleLarge,
                    color = theme.textPrimary,
                    fontWeight = FontWeight.Black
                )

                // Contenido desplazable; Guardar/Cerrar quedan fijos abajo.
                Column(
                    Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {

                // ──────────────── 1. SECCIÓN PORTADA ────────────────
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = theme.background)
                ) {
                    Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text("PORTADA DE LA OBRA", fontSize = 12.sp, fontWeight = FontWeight.Black, color = theme.accent)

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Preview dinámico de la portada
                            ObraCoverGraphic(
                                obra = book.copy(coverUrl = cover),
                                width = 70.dp,
                                height = 98.dp
                            )

                            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                Button(
                                    onClick = { pickCover.launch("image/*") },
                                    enabled = !busy,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Icon(Icons.Rounded.Image, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(Modifier.width(6.dp))
                                    Text("Subir portada de galería")
                                }

                                if (cover.isNotBlank()) {
                                    OutlinedButton(
                                        onClick = { cover = "" },
                                        enabled = !busy,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Icon(Icons.Rounded.Delete, contentDescription = null, tint = Color(0xFFEF4444), modifier = Modifier.size(16.dp))
                                        Spacer(Modifier.width(6.dp))
                                        Text("Quitar portada (usar SVG)", color = Color(0xFFEF4444))
                                    }
                                }
                            }
                        }

                        OutlinedTextField(
                            value = cover,
                            onValueChange = { cover = it },
                            label = { Text("Enlace HTTPS de portada") },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )
                    }
                }

                // ──────────────── 2. SECCIÓN BANNER SUPERIOR ────────────────
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = theme.background)
                ) {
                    Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text("BANNER SUPERIOR (OPCIONAL)", fontSize = 12.sp, fontWeight = FontWeight.Black, color = theme.accent)

                        // Preview del banner con crop controlado
                        ObraBannerGraphic(
                            bannerUrl = banner,
                            themeColor = themeColor,
                            height = 90.dp
                        )

                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Button(
                                onClick = { pickBanner.launch("image/*") },
                                enabled = !busy,
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(Icons.Rounded.Image, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text("Subir banner")
                            }

                            if (banner.isNotBlank()) {
                                OutlinedButton(
                                    onClick = { banner = "" },
                                    enabled = !busy,
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Icon(Icons.Rounded.Delete, contentDescription = null, tint = Color(0xFFEF4444), modifier = Modifier.size(16.dp))
                                    Spacer(Modifier.width(6.dp))
                                    Text("Quitar banner", color = Color(0xFFEF4444))
                                }
                            }
                        }

                        OutlinedTextField(
                            value = banner,
                            onValueChange = { banner = it },
                            label = { Text("Enlace HTTPS de banner") },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )
                    }
                }

                // ──────────────── 3. SECCIÓN PERSONAJES ────────────────
                if (charactersState.isNotEmpty()) {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = theme.background)
                    ) {
                        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Text("PERSONAJES DE LA OBRA (${charactersState.size})", fontSize = 12.sp, fontWeight = FontWeight.Black, color = theme.accent)

                            charactersState.forEachIndexed { index, personaje ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(theme.surface)
                                        .border(1.dp, theme.strokeBorder.copy(alpha = 0.3f), RoundedCornerShape(12.dp))
                                        .padding(8.dp),
                                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    // Avatar con fallback cartoon
                                    PersonajeAvatarGraphic(personaje = personaje, size = 46.dp)

                                    Column(Modifier.weight(1f)) {
                                        Text(personaje.nombre, fontWeight = FontWeight.Black, fontSize = 13.5.sp, color = theme.textPrimary)
                                        Text(personaje.rol, fontSize = 11.sp, color = theme.accent, fontWeight = FontWeight.Bold)
                                    }

                                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                        IconButton(
                                            onClick = {
                                                targetCharIndex = index
                                                pickCharacterPhoto.launch("image/*")
                                            },
                                            enabled = !busy
                                        ) {
                                            Icon(Icons.Rounded.Image, contentDescription = "Subir foto", tint = theme.accent)
                                        }

                                        if (personaje.imageUrl.isNotBlank()) {
                                            IconButton(
                                                onClick = {
                                                    val updated = charactersState.toMutableList()
                                                    updated[index] = updated[index].copy(imageUrl = "")
                                                    charactersState = updated
                                                },
                                                enabled = !busy
                                            ) {
                                                Icon(Icons.Rounded.Delete, contentDescription = "Quitar foto", tint = Color(0xFFEF4444))
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                // ──────────────── 4. METADATOS BÁSICOS (EDITABLES) ────────────────
                OutlinedTextField(title, { title = it }, label = { Text("Título") }, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(author, { author = it }, label = { Text("Autor") }, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(description, { description = it }, label = { Text("Descripción / Argumento") }, minLines = 3, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(history, { history = it }, label = { Text("Contexto Histórico") }, minLines = 2, modifier = Modifier.fillMaxWidth())

                error?.let {
                    Text(it, color = Color(0xFFEF4444), fontSize = 12.5.sp, fontWeight = FontWeight.Bold)
                }

                if (busy) {
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        LinearProgressIndicator(Modifier.fillMaxWidth())
                        if (busyMessage.isNotBlank()) {
                            Text(busyMessage, fontSize = 11.5.sp, color = theme.textSecondary)
                        }
                    }
                }

                } // Fin contenido desplazable: Guardar/Cerrar fijos abajo.

                // ──────────────── 5. BOTÓN GUARDAR CON PERSISTENCIA REAL ────────────────
                Sticker3dButton(
                    onClick = {
                        val cleanCover = cover.trim()
                        val cleanBanner = banner.trim()
                        val isCoverValid = cleanCover.isBlank() || cleanCover.startsWith("https://") || cleanCover.startsWith("http://")
                        val isBannerValid = cleanBanner.isBlank() || cleanBanner.startsWith("https://") || cleanBanner.startsWith("http://")

                        if (!isCoverValid) {
                            error = "La portada debe usar un enlace HTTP/HTTPS o subirse de la galería"
                        } else if (!isBannerValid) {
                            error = "El banner debe usar un enlace HTTP/HTTPS o subirse de la galería"
                        } else {
                            busy = true
                            busyMessage = "Guardando cambios en Firestore..."
                            error = null

                            // Persistir los personajes con sus imageUrl actualizadas manteniendo texto académico
                            val personajesData = charactersState.map {
                                mapOf(
                                    "nombre" to it.nombre,
                                    "rol" to it.rol,
                                    "descripcion" to it.descripcion,
                                    "imageUrl" to it.imageUrl
                                )
                            }

                            FirebaseFirestore.getInstance().collection("libros").document(book.id)
                                .set(
                                    mapOf(
                                        "titulo" to title.trim(),
                                        "autor" to author.trim(),
                                        "sinopsis" to description.trim(),
                                        "contextoHistorico" to history.trim(),
                                        "coverUrl" to cleanCover,
                                        "bannerUrl" to cleanBanner,
                                        "personajes" to personajesData,
                                        "authorUid" to (user?.uid ?: "")
                                    ),
                                    SetOptions.merge()
                                )
                                .addOnSuccessListener {
                                    busy = false
                                    onDismiss()
                                }
                                .addOnFailureListener {
                                    busy = false
                                    error = "No se guardó: ${it.localizedMessage}"
                                }
                        }
                    },
                    enabled = !busy && title.isNotBlank() && author.isNotBlank(),
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = Color(0xFF047857)
                ) {
                    Text("Guardar cambios", color = Color.White, fontWeight = FontWeight.Bold)
                }

                TextButton(onClick = onDismiss, enabled = !busy, modifier = Modifier.fillMaxWidth()) {
                    Text("Cerrar")
                }
            }
        }
    }
}
