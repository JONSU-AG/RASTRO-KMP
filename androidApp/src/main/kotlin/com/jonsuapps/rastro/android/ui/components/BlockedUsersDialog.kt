package com.jonsuapps.rastro.android.ui.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Block
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.LockOpen
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
import com.jonsuapps.rastro.android.data.UserProfileRepository
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.model.UserData
import com.jonsuapps.rastro.theme.ThemeManager

private data class BlockedUserItem(
    val uid: String,
    val displayName: String,
    val photoUrl: String?
)

@Composable
fun BlockedUsersDialog(
    currentUser: UserData,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    var blockedUsersList by remember { mutableStateOf<List<BlockedUserItem>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(currentUser.blockedUsers) {
        if (currentUser.blockedUsers.isEmpty()) {
            blockedUsersList = emptyList()
            isLoading = false
            return@LaunchedEffect
        }
        isLoading = true
        val db = FirebaseFirestore.getInstance()
        val loaded = mutableListOf<BlockedUserItem>()
        currentUser.blockedUsers.forEach { uid ->
            db.collection("usuarios").document(uid).get()
                .addOnSuccessListener { doc ->
                    val name = doc.getString("displayName") ?: "Estudiante RASTRO"
                    val photo = doc.getString("photoURL")
                    loaded.add(BlockedUserItem(uid, name, photo))
                    if (loaded.size == currentUser.blockedUsers.size) {
                        blockedUsersList = loaded.toList()
                        isLoading = false
                    }
                }
                .addOnFailureListener {
                    loaded.add(BlockedUserItem(uid, "Usuario (${uid.take(6)})", null))
                    if (loaded.size == currentUser.blockedUsers.size) {
                        blockedUsersList = loaded.toList()
                        isLoading = false
                    }
                }
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .widthIn(max = 460.dp)
                .heightIn(max = 520.dp),
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
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Cabecera
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(38.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFFEF4444).copy(alpha = 0.15f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Block,
                                contentDescription = null,
                                tint = Color(0xFFEF4444),
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Usuarios Bloqueados",
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Black,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "${currentUser.blockedUsers.size} bloqueado${if (currentUser.blockedUsers.size != 1) "s" else ""}",
                                color = theme.textSecondary,
                                fontSize = 12.sp
                            )
                        }
                    }
                    IconButton(onClick = onDismiss, modifier = Modifier.size(28.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                Text(
                    text = "Los usuarios en esta lista no pueden ver tus aportes ni tú verás sus publicaciones o comentarios en la comunidad.",
                    fontSize = 12.sp,
                    color = theme.textSecondary,
                    lineHeight = 16.sp
                )

                if (isLoading) {
                    Box(modifier = Modifier.fillMaxWidth().height(140.dp), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(color = theme.accent, modifier = Modifier.size(32.dp))
                    }
                } else if (currentUser.blockedUsers.isEmpty()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.LockOpen,
                                contentDescription = null,
                                tint = theme.textSecondary.copy(alpha = 0.5f),
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                text = "No tienes usuarios bloqueados",
                                color = theme.textSecondary,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f, fill = false),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(blockedUsersList, key = { it.uid }) { userItem ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(theme.surfaceAccent)
                                    .padding(10.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.weight(1f).padding(end = 8.dp)
                                ) {
                                    CartoonAvatar(
                                        photoUrl = userItem.photoUrl,
                                        size = 36.dp,
                                        strokeColor = theme.strokeBorder
                                    )
                                    Spacer(Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = userItem.displayName,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 13.sp,
                                            color = theme.textPrimary
                                        )
                                        Text(
                                            text = "Bloqueado",
                                            fontSize = 11.sp,
                                            color = Color(0xFFEF4444)
                                        )
                                    }
                                }

                                Sticker3dButton(
                                    onClick = {
                                        DuolingoHaptics.playOptionSelected(context)
                                        UserManager.unblockUser(userItem.uid)
                                        UserProfileRepository.blockUser(currentUser.uid, userItem.uid, block = false)
                                        Toast.makeText(context, "Usuario desbloqueado.", Toast.LENGTH_SHORT).show()
                                    },
                                    containerColor = theme.surface,
                                    bottomBevelColor = theme.cardBevel,
                                    strokeColor = theme.strokeBorder,
                                    shape = RoundedCornerShape(10.dp),
                                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 5.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.LockOpen,
                                        contentDescription = null,
                                        tint = theme.accent,
                                        modifier = Modifier.size(13.dp)
                                    )
                                    Spacer(Modifier.width(4.dp))
                                    Text(
                                        text = "Desbloquear",
                                        color = theme.textPrimary,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
