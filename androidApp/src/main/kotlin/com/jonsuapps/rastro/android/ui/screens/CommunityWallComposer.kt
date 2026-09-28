package com.jonsuapps.rastro.android.ui.screens

import android.graphics.BitmapFactory
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddPhotoAlternate
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.auth.UserManager
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.android.ui.components.CartoonAvatar
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun CommunityWallComposer(modifier: Modifier = Modifier, onNavigateToAuth: () -> Unit = {}) {
    val theme = ThemeManager.currentTheme
    val user by UserManager.currentUser.collectAsState()
    val context = LocalContext.current
    var text by remember { mutableStateOf("") }
    var photo by remember { mutableStateOf<Uri?>(null) }
    var posting by remember { mutableStateOf(false) }
    var feedback by remember { mutableStateOf<String?>(null) }
    val imagePicker = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { photo = it }
    val photoBitmap = produceState<androidx.compose.ui.graphics.ImageBitmap?>(null, photo) {
        value = photo?.let { uri -> withContext(Dispatchers.IO) {
            runCatching { context.contentResolver.openInputStream(uri)?.use { BitmapFactory.decodeStream(it)?.asImageBitmap() } }.getOrNull()
        } }
    }.value

    Sticker3dCard(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        containerColor = theme.surface,
        strokeColor = theme.strokeBorder,
        bevelColor = theme.cardBevel,
        bevelHeight = 3.dp
    ) {
        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                val firebaseUser = FirebaseAuth.getInstance().currentUser
                val profilePhoto = user.photoURL?.takeIf(String::isNotBlank)
                    ?: firebaseUser?.photoUrl?.toString()?.takeIf(String::isNotBlank)
                    ?: firebaseUser?.providerData?.firstOrNull { it.providerId == "google.com" }
                        ?.photoUrl?.toString()?.takeIf(String::isNotBlank)
                CartoonAvatar(
                    photoUrl = profilePhoto,
                    size = 40.dp,
                    strokeColor = theme.strokeBorder,
                    strokeWidth = 1.8.dp,
                    bevelColor = theme.cardBevel,
                    bevelOffset = 2.dp,
                    contentDescription = "Foto de perfil"
                )
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    modifier = Modifier.weight(1f),
                    placeholder = { Text("Escribe una publicación o recomendación para la comunidad…") },
                    minLines = 2,
                    maxLines = 5,
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = theme.accent,
                        unfocusedBorderColor = theme.strokeBorder.copy(alpha = 0.5f)
                    )
                )
            }
            photoBitmap?.let { Image(it, contentDescription = "Foto adjunta", modifier = Modifier.fillMaxWidth().heightIn(max = 250.dp).clip(RoundedCornerShape(14.dp)), contentScale = ContentScale.Fit) }
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                TextButton(enabled = !posting, onClick = { imagePicker.launch("image/*") }) {
                    Icon(Icons.Rounded.AddPhotoAlternate, contentDescription = null)
                    Spacer(Modifier.width(6.dp)); Text(if (photo == null) "Adjuntar foto" else "Cambiar foto")
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (feedback != null) Text(feedback!!, color = theme.textSecondary, style = MaterialTheme.typography.labelSmall, modifier = Modifier.padding(end = 8.dp))
                    val isPostEnabled = text.isNotBlank() && !posting && user.isAuthenticated && !user.isAnonymous
                    val buttonContentColor = if (isPostEnabled) Color.White else Color(0xFF475569)
                    Sticker3dButton(
                        enabled = isPostEnabled,
                        onClick = {
                            posting = true; feedback = null
                            UserUploadRepository.publishWallPost(context, user, text, photo) { result ->
                                posting = false
                                result.onSuccess { text = ""; photo = null; feedback = "Publicado con éxito" }
                                    .onFailure { feedback = it.localizedMessage ?: "No se pudo publicar" }
                            }
                        },
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder,
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 9.dp)
                    ) {
                        if (posting) {
                            CircularProgressIndicator(Modifier.size(16.dp), strokeWidth = 2.dp, color = Color.White)
                        } else {
                            Icon(
                                Icons.Rounded.Send,
                                contentDescription = null,
                                tint = buttonContentColor,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                "Publicar",
                                color = buttonContentColor,
                                fontWeight = FontWeight.Black,
                                fontSize = 13.sp
                            )
                        }
                    }
                    if (!user.isAuthenticated || user.isAnonymous) {
                        Button(onClick = onNavigateToAuth) {
                            Icon(Icons.Rounded.Person, contentDescription = null)
                            Spacer(Modifier.width(5.dp))
                            Text("Iniciar sesión")
                        }
                    }
                }
            }
            if (!user.isAuthenticated || user.isAnonymous) Text("Inicia sesión para publicar en el muro.", color = theme.textSecondary, style = MaterialTheme.typography.labelSmall)
        }
    }
}
