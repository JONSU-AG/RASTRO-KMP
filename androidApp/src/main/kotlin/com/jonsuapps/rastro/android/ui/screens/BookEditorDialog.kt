package com.jonsuapps.rastro.android.ui.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.storage.FirebaseStorage
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
internal fun BookEditorDialog(book: ObraLiteraria, onDismiss: () -> Unit) {
    val theme = ThemeManager.currentTheme
    var title by remember { mutableStateOf(book.titulo) }
    var author by remember { mutableStateOf(book.autor) }
    var description by remember { mutableStateOf(book.sinopsis) }
    var history by remember { mutableStateOf(book.contextoHistorico) }
    var cover by remember { mutableStateOf(book.coverUrl) }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    val user = UserManager.currentUser.value
    val pickCover = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null) {
            busy = true
            val ref = FirebaseStorage.getInstance().reference.child("avatars/${user.uid}_book_${book.id}_${System.currentTimeMillis()}")
            ref.putFile(uri).continueWithTask { upload ->
                if (!upload.isSuccessful) throw upload.exception ?: IllegalStateException("No se pudo subir la portada")
                ref.downloadUrl
            }.addOnSuccessListener { cover = it.toString(); busy = false }
                .addOnFailureListener { error = "No se pudo subir la portada: ${it.localizedMessage}"; busy = false }
        }
    }
    Dialog(onDismissRequest = { if (!busy) onDismiss() }, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Sticker3dCard(Modifier.fillMaxWidth(0.95f).fillMaxHeight(0.92f), containerColor = theme.surface,
            strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel) {
            Column(Modifier.padding(16.dp).verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text("Editar obra", style = MaterialTheme.typography.titleLarge, color = theme.textPrimary)
                OutlinedTextField(title, { title = it }, label = { Text("Título") }, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(author, { author = it }, label = { Text("Autor") }, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(cover, { cover = it }, label = { Text("Enlace de portada") }, modifier = Modifier.fillMaxWidth())
                TextButton(onClick = { pickCover.launch("image/*") }, enabled = !busy) { Text("Elegir portada de la galería") }
                OutlinedTextField(description, { description = it }, label = { Text("Descripción / argumento") }, minLines = 4, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(history, { history = it }, label = { Text("Contexto histórico") }, minLines = 3, modifier = Modifier.fillMaxWidth())
                error?.let { Text(it, color = theme.textPrimary) }
                if (busy) LinearProgressIndicator(Modifier.fillMaxWidth())
                Sticker3dButton(onClick = {
                    if (cover.isNotBlank() && !cover.startsWith("https://")) { error = "La portada debe usar un enlace HTTPS" }
                    else {
                        busy = true
                        FirebaseFirestore.getInstance().collection("libros").document(book.id)
                            .set(mapOf("titulo" to title.trim(), "autor" to author.trim(), "sinopsis" to description.trim(),
                                "contextoHistorico" to history.trim(), "coverUrl" to cover.trim(), "authorUid" to user.uid), SetOptions.merge())
                            .addOnSuccessListener { busy = false; onDismiss() }
                            .addOnFailureListener { busy = false; error = "No se guardó: ${it.localizedMessage}" }
                    }
                }, enabled = !busy && title.isNotBlank() && author.isNotBlank(), modifier = Modifier.fillMaxWidth(), containerColor = Color(0xFF047857)) {
                    Text("Guardar cambios", color = Color.White)
                }
                TextButton(onClick = onDismiss, enabled = !busy, modifier = Modifier.fillMaxWidth()) { Text("Cerrar") }
            }
        }
    }
}
