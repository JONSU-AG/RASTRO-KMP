package com.jonsuapps.rastro.android.ui.components

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun EditUploadDialog(
    upload: UserUpload,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val theme = ThemeManager.currentTheme
    var title by remember { mutableStateOf(upload.title) }
    var description by remember { mutableStateOf(upload.description) }
    var saving by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = { if (!saving) onDismiss() },
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .widthIn(max = 440.dp),
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
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Rounded.Edit,
                            contentDescription = null,
                            tint = theme.accent,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            text = "Editar Publicación",
                            color = theme.textPrimary,
                            fontWeight = FontWeight.Black,
                            fontSize = 17.sp
                        )
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(32.dp),
                        enabled = !saving
                    ) {
                        Icon(Icons.Rounded.Close, null, tint = theme.textSecondary)
                    }
                }

                // Título
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Título del material") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = theme.accent,
                        unfocusedBorderColor = theme.strokeBorder.copy(alpha = 0.35f)
                    )
                )

                // Descripción / Contenido
                OutlinedTextField(
                    value = description,
                    onValueChange = { description = it },
                    label = { Text("Descripción / Mensaje") },
                    modifier = Modifier.fillMaxWidth().height(140.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = theme.accent,
                        unfocusedBorderColor = theme.strokeBorder.copy(alpha = 0.35f)
                    )
                )

                // Botón Guardar Cambios 3D
                Sticker3dButton(
                    onClick = {
                        if (title.isBlank()) {
                            Toast.makeText(context, "El título no puede estar vacío", Toast.LENGTH_SHORT).show()
                            return@Sticker3dButton
                        }
                        saving = true
                        DuolingoHaptics.playOptionSelected(context)
                        UserUploadRepository.editUpload(
                            uploadId = upload.id,
                            newTitle = title,
                            newDescription = description
                        ) { result ->
                            saving = false
                            if (result.isSuccess) {
                                DuolingoHaptics.playAnswerCorrect(context)
                                Toast.makeText(context, "¡Publicación actualizada con éxito!", Toast.LENGTH_SHORT).show()
                                onDismiss()
                            } else {
                                Toast.makeText(context, "Error: ${result.exceptionOrNull()?.message}", Toast.LENGTH_SHORT).show()
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    enabled = !saving
                ) {
                    if (saving) {
                        CircularProgressIndicator(color = Color.White, modifier = Modifier.size(20.dp), strokeWidth = 2.dp)
                    } else {
                        Text("Guardar Cambios", color = Color.White, fontWeight = FontWeight.Black, fontSize = 14.sp)
                    }
                }
            }
        }
    }
}
