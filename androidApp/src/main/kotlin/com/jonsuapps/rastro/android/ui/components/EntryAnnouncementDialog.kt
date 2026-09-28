package com.jonsuapps.rastro.android.ui.components

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Campaign
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.MenuBook
import androidx.compose.material.icons.rounded.Shield
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.theme.RastroPalette

/**
 * Diálogo obligatorio de Consentimiento y Aceptación de Términos al inicio de la app.
 * Informa sobre:
 * - Términos de Servicio y Privacidad.
 * - Almacenamiento descentralizado vía Google Drive del usuario.
 * - Asistencia pedagógica con Inteligencia Artificial.
 */
@Composable
fun TermsConsentDialog(
    isOpen: Boolean,
    onAccept: () -> Unit,
    onViewTerms: () -> Unit,
    theme: RastroPalette
) {
    if (!isOpen) return
    val context = LocalContext.current

    Dialog(
        onDismissRequest = {}, // Bloqueante hasta aceptar o revisar
        properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
    ) {
        Sticker3dCard(
            shape = RoundedCornerShape(26.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            modifier = Modifier.fillMaxWidth(0.94f)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Mascota Artyon dando la bienvenida
                Box(
                    modifier = Modifier.size(90.dp),
                    contentAlignment = Alignment.Center
                ) {
                    ArtyonMascot(
                        mood = MascotMood.HAPPY,
                        modifier = Modifier.size(86.dp)
                    )
                }

                Spacer(Modifier.height(10.dp))

                Text(
                    text = "¡Bienvenido a RASTRO!",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary,
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(6.dp))

                Text(
                    text = "Para continuar y personalizar tu preparación preuniversitaria, debes aceptar nuestros Términos de Servicio y Políticas de Privacidad.\n\nRecuerda que RASTRO utiliza el almacenamiento de tu propio Google Drive para tus materiales y cuenta con soporte de Inteligencia Artificial para tu aprendizaje.",
                    style = MaterialTheme.typography.bodySmall,
                    color = theme.textSecondary,
                    textAlign = TextAlign.Center,
                    lineHeight = 18.sp
                )

                Spacer(Modifier.height(18.dp))

                // Botón principal: Aceptar y Continuar
                Sticker3dButton(
                    onClick = {
                        DuolingoHaptics.playAnswerCorrect(context)
                        onAccept()
                    },
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    shape = RoundedCornerShape(16.dp),
                    bevelHeight = 3.5.dp
                ) {
                    Icon(Icons.Rounded.Check, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = "Aceptar y Continuar",
                        color = Color.White,
                        fontWeight = FontWeight.Black,
                        fontSize = 13.5.sp
                    )
                }

                Spacer(Modifier.height(8.dp))

                // Botón secundario: Ver Términos y Condiciones
                Sticker3dButton(
                    onClick = {
                        DuolingoHaptics.playOptionSelected(context)
                        onViewTerms()
                    },
                    modifier = Modifier.fillMaxWidth().height(44.dp),
                    containerColor = theme.surfaceAccent,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    shape = RoundedCornerShape(16.dp),
                    bevelHeight = 3.dp
                ) {
                    Icon(Icons.Rounded.Shield, contentDescription = null, tint = theme.accent, modifier = Modifier.size(16.dp))
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = "Ver Términos y Condiciones",
                        color = theme.textPrimary,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

/**
 * Diálogo Pop-up emergente al entrar el usuario para comunicados importantes:
 * Mantenimiento, alertas técnicas, felicitaciones (Día del Estudiante, etc.) o mensajes del administrador.
 */
@Composable
fun EntryAnnouncementDialog(
    isOpen: Boolean,
    title: String,
    message: String,
    tag: String = "Aviso Oficial",
    mood: MascotMood = MascotMood.HAPPY,
    onDismiss: () -> Unit,
    theme: RastroPalette
) {
    if (!isOpen) return
    val context = LocalContext.current

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            shape = RoundedCornerShape(26.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            modifier = Modifier.fillMaxWidth(0.92f).widthIn(max = 440.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Fila superior con tag y botón de cerrar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFF59E0B).copy(alpha = 0.15f))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                Icons.Rounded.Campaign,
                                contentDescription = null,
                                tint = Color(0xFFD97706),
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                text = tag,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black,
                                color = Color(0xFFD97706)
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = theme.textSecondary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(Modifier.height(8.dp))

                // Mascota temática
                Box(
                    modifier = Modifier.size(85.dp),
                    contentAlignment = Alignment.Center
                ) {
                    ArtyonMascot(
                        mood = mood,
                        modifier = Modifier.size(80.dp)
                    )
                }

                Spacer(Modifier.height(10.dp))

                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary,
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(8.dp))

                Text(
                    text = message,
                    style = MaterialTheme.typography.bodyMedium,
                    color = theme.textSecondary,
                    textAlign = TextAlign.Center,
                    lineHeight = 20.sp
                )

                Spacer(Modifier.height(18.dp))

                Sticker3dButton(
                    onClick = {
                        DuolingoHaptics.playOptionSelected(context)
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    containerColor = theme.accent,
                    bottomBevelColor = theme.accentBevel,
                    strokeColor = theme.strokeBorder,
                    shape = RoundedCornerShape(16.dp),
                    bevelHeight = 3.5.dp
                ) {
                    Text(
                        text = "¡Entendido!",
                        color = Color.White,
                        fontWeight = FontWeight.Black,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}
