package com.jonsuapps.rastro.android.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.theme.*

/**
 * Modal 3D Cartoon de Ajustes de Perfil y Sistema.
 * Integra:
 * - Selección de Temas RASTRO.
 * - Políticas de Privacidad y Términos de Servicio.
 * - Flujo obligatorio de Google Play: Eliminación permanente de cuenta y datos.
 * - Cierre de sesión y datos de cuenta.
 */
@Composable
fun ProfileSettingsDialog(
    currentThemeId: RastroThemeId,
    colors: RastroPalette,
    onSelectTheme: (RastroThemeId) -> Unit,
    onDismiss: () -> Unit,
    onOpenTermsAndPrivacy: (initialTab: Int) -> Unit,
    onLogout: () -> Unit,
    onAccountDeleted: () -> Unit,
    onOpenThemeSelector: () -> Unit = {}
) {
    val context = LocalContext.current
    val currentUser by UserManager.currentUser.collectAsState()
    var showDeleteConfirmDialog by remember { mutableStateOf(false) }
    var isDeleting by remember { mutableStateOf(false) }
    var deletionError by remember { mutableStateOf<String?>(null) }

    val rastroPrefs = remember(context) {
        context.getSharedPreferences("rastro_preferences", android.content.Context.MODE_PRIVATE)
    }
    var studyNotificationsEnabled by remember {
        mutableStateOf(rastroPrefs.getBoolean("notifications_study_enabled", true))
    }
    var streakAlertsEnabled by remember {
        mutableStateOf(rastroPrefs.getBoolean("notifications_streak_enabled", true))
    }
    var vibrationsEnabled by remember {
        mutableStateOf(rastroPrefs.getBoolean("vibrations_enabled", true))
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .fillMaxHeight(0.88f)
                .widthIn(max = 500.dp),
            containerColor = colors.surface,
            bottomBevelColor = colors.cardBevel,
            strokeColor = colors.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(26.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp)
            ) {
                // Cabecera 3D
                Row(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(13.dp))
                                .background(colors.accent.copy(alpha = 0.14f))
                                .border(1.5.dp, colors.accent.copy(alpha = 0.35f), RoundedCornerShape(13.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Settings,
                                contentDescription = null,
                                tint = colors.accent,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Ajustes de Perfil",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Black,
                                color = colors.textPrimary
                            )
                            Text(
                                text = "Temas, Seguridad y Privacidad",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = colors.textSecondary
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = colors.textSecondary,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                // Scroll principal
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    // ── 1. SECCIÓN PERSONALIZACIÓN VISUAL (Separado a su propio selector) ──
                    SettingsSectionCard(
                        title = "Personalización Visual",
                        icon = Icons.Rounded.Palette,
                        iconColor = Color(0xFF8B5CF6),
                        colors = colors
                    ) {
                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                onOpenThemeSelector()
                            },
                            modifier = Modifier.fillMaxWidth(),
                            containerColor = colors.surfaceAccent,
                            bottomBevelColor = colors.cardBevel,
                            strokeColor = colors.strokeBorder,
                            strokeWidth = 1.3.dp,
                            bevelHeight = 3.dp,
                            shape = RoundedCornerShape(14.dp),
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    val currentThemeTokens = RastroThemeTokens.getColors(currentThemeId)
                                    Box(
                                        modifier = Modifier
                                            .size(22.dp)
                                            .clip(CircleShape)
                                            .background(currentThemeTokens.accent)
                                            .border(1.5.dp, colors.strokeBorder, CircleShape)
                                    )
                                    Column {
                                        Text(
                                            text = "Temas de Color RASTRO",
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Black,
                                            color = colors.textPrimary
                                        )
                                        Text(
                                            text = "Tema actual: ${currentThemeId.displayName}",
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = colors.accent
                                        )
                                    }
                                }
                                Icon(
                                    imageVector = Icons.Rounded.ChevronRight,
                                    contentDescription = null,
                                    tint = colors.textSecondary
                                )
                            }
                        }
                    }

                    // ── 2. SECCIÓN NOTIFICACIONES Y SENSACIONES HÁPTICAS ────
                    SettingsSectionCard(
                        title = "Notificaciones y Sensaciones Hápticas",
                        icon = Icons.Rounded.NotificationsActive,
                        iconColor = Color(0xFF3B82F6),
                        colors = colors
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            SettingsSwitchRow(
                                title = "Notificaciones de Estudio",
                                subtitle = "Recordatorios de repaso y bancos de preguntas",
                                icon = Icons.Rounded.School,
                                checked = studyNotificationsEnabled,
                                colors = colors,
                                onCheckedChange = {
                                    studyNotificationsEnabled = it
                                    rastroPrefs.edit().putBoolean("notifications_study_enabled", it).apply()
                                    if (vibrationsEnabled) DuolingoHaptics.playOptionSelected(context)
                                }
                            )

                            SettingsSwitchRow(
                                title = "Alertas de Racha Diaria",
                                subtitle = "Avisos para proteger tu racha y no perder días de fuego",
                                icon = Icons.Rounded.LocalFireDepartment,
                                checked = streakAlertsEnabled,
                                colors = colors,
                                onCheckedChange = {
                                    streakAlertsEnabled = it
                                    rastroPrefs.edit().putBoolean("notifications_streak_enabled", it).apply()
                                    if (vibrationsEnabled) DuolingoHaptics.playOptionSelected(context)
                                }
                            )

                            SettingsSwitchRow(
                                title = "Vibración Háptica 3D",
                                subtitle = "Feedback táctil estilo Duolingo en botones y aciertos",
                                icon = Icons.Rounded.Vibration,
                                checked = vibrationsEnabled,
                                colors = colors,
                                onCheckedChange = {
                                    vibrationsEnabled = it
                                    rastroPrefs.edit().putBoolean("vibrations_enabled", it).apply()
                                    if (it) DuolingoHaptics.playOptionSelected(context)
                                }
                            )
                        }
                    }

                    // ── 3. SECCIÓN CUENTA Y SESIÓN ──────────────────────────
                    SettingsSectionCard(
                        title = "Información de Usuario",
                        icon = Icons.Rounded.AccountCircle,
                        iconColor = colors.accent,
                        colors = colors
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column {
                                    Text(
                                        text = currentUser.displayName.ifBlank { "Estudiante RASTRO" },
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = colors.textPrimary
                                    )
                                    Text(
                                        text = currentUser.email?.ifBlank { null } ?: (if (currentUser.isAnonymous) "Sesión Invitado" else "Sin correo"),
                                        fontSize = 11.sp,
                                        color = colors.textSecondary
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(if (currentUser.isAuthenticated && !currentUser.isAnonymous) Color(0xFF10B981).copy(alpha = 0.15f) else colors.surfaceBorder)
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        text = if (currentUser.isAuthenticated && !currentUser.isAnonymous) "Verificado" else "Invitado",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = if (currentUser.isAuthenticated && !currentUser.isAnonymous) Color(0xFF10B981) else colors.textSecondary
                                    )
                                }
                            }

                            if (currentUser.isAuthenticated) {
                                Sticker3dButton(
                                    onClick = onLogout,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(42.dp),
                                    containerColor = colors.surfaceAccent,
                                    bottomBevelColor = colors.strokeBorder,
                                    contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                                ) {
                                    Text(
                                        text = "Cerrar Sesión",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp,
                                        color = colors.textPrimary
                                    )
                                }
                            }
                        }
                    }

                    // ── 3. LEGAL Y CUMPLIMIENTO PLAY STORE ──────────────────
                    SettingsSectionCard(
                        title = "Legal y Políticas Google Play",
                        icon = Icons.Rounded.Gavel,
                        iconColor = Color(0xFF10B981),
                        colors = colors
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            SettingsOptionRow(
                                title = "Políticas de Privacidad & Protección de Datos",
                                subtitle = "Cero venta de datos, retención segura y Firebase",
                                icon = Icons.Rounded.Shield,
                                colors = colors,
                                onClick = { onOpenTermsAndPrivacy(0) }
                            )

                            SettingsOptionRow(
                                title = "Términos de Servicio y Moderación UGC",
                                subtitle = "Normas de la comunidad y tolerancia cero",
                                icon = Icons.Rounded.Policy,
                                colors = colors,
                                onClick = { onOpenTermsAndPrivacy(1) }
                            )

                            SettingsOptionRow(
                                title = "Autoría, CEPREUNSA y Deslinde",
                                subtitle = "Material pedagógico y deslinde institucional",
                                icon = Icons.Rounded.School,
                                colors = colors,
                                onClick = { onOpenTermsAndPrivacy(3) }
                            )
                        }
                    }

                    // ── 4. ZONA DE PELIGRO: ELIMINAR CUENTA (GOOGLE PLAY) ────
                    SettingsSectionCard(
                        title = "Eliminar Cuenta y Datos (Play Store)",
                        icon = Icons.Rounded.DeleteForever,
                        iconColor = Color(0xFFEF4444),
                        colors = colors
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                text = "Conforme a las exigencias de Google Play, puedes eliminar permanentemente tu cuenta y todos tus datos personales asociados de forma inmediata.",
                                fontSize = 11.5.sp,
                                color = colors.textSecondary,
                                lineHeight = 16.sp
                            )

                            Sticker3dButton(
                                onClick = { showDeleteConfirmDialog = true },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(42.dp),
                                containerColor = Color(0xFFEF4444),
                                bottomBevelColor = Color(0xFFB91C1C),
                                strokeColor = Color(0xFF7F1D1D),
                                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.DeleteForever,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Eliminar Mi Cuenta y Datos",
                                    fontWeight = FontWeight.Black,
                                    fontSize = 13.sp,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    // Modal de confirmación irreversible de eliminación de cuenta
    if (showDeleteConfirmDialog) {
        Dialog(onDismissRequest = { if (!isDeleting) showDeleteConfirmDialog = false }) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .widthIn(max = 400.dp),
                containerColor = colors.surface,
                bottomBevelColor = Color(0xFFB91C1C),
                strokeColor = Color(0xFFEF4444),
                bevelHeight = 5.dp,
                shape = RoundedCornerShape(22.dp)
            ) {
                Column(
                    modifier = Modifier.padding(18.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFEF4444).copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Warning,
                            contentDescription = null,
                            tint = Color(0xFFEF4444),
                            modifier = Modifier.size(28.dp)
                        )
                    }

                    Text(
                        text = "¿Eliminar Cuenta Permanentemente?",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Black,
                        color = colors.textPrimary,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )

                    Text(
                        text = "Se borrarán todos tus simulacros, racha, vidas y perfil en la nube. Esta acción no se puede deshacer.",
                        fontSize = 12.sp,
                        color = colors.textSecondary,
                        lineHeight = 17.sp,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )

                    if (deletionError != null) {
                        Text(
                            text = deletionError.orEmpty(),
                            fontSize = 11.sp,
                            color = Color(0xFFEF4444),
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = { showDeleteConfirmDialog = false },
                            modifier = Modifier.weight(1f).height(44.dp),
                            shape = RoundedCornerShape(14.dp),
                            enabled = !isDeleting
                        ) {
                            Text("Cancelar", fontWeight = FontWeight.Bold, color = colors.textPrimary)
                        }

                        Sticker3dButton(
                            onClick = {
                                isDeleting = true
                                deletionError = null
                                val user = FirebaseAuth.getInstance().currentUser
                                if (user == null) {
                                    UserManager.clearUser()
                                    showDeleteConfirmDialog = false
                                    onAccountDeleted()
                                    onDismiss()
                                } else {
                                    val uid = user.uid
                                    FirebaseFirestore.getInstance().collection("usuarios").document(uid).delete()
                                    user.delete().addOnCompleteListener { task ->
                                        isDeleting = false
                                        if (task.isSuccessful) {
                                            UserManager.clearUser()
                                            showDeleteConfirmDialog = false
                                            onAccountDeleted()
                                            onDismiss()
                                        } else {
                                            deletionError = "Por seguridad, debes haber iniciado sesión recientemente. Vuelve a iniciar sesión e inténtalo."
                                        }
                                    }
                                }
                            },
                            enabled = !isDeleting,
                            modifier = Modifier.weight(1.2f).height(44.dp),
                            containerColor = Color(0xFFEF4444),
                            bottomBevelColor = Color(0xFFB91C1C),
                            strokeColor = Color(0xFF7F1D1D),
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = if (isDeleting) "Borrando..." else "Eliminar",
                                fontWeight = FontWeight.Black,
                                fontSize = 13.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun SettingsSectionCard(
    title: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    iconColor: Color,
    colors: RastroPalette,
    content: @Composable ColumnScope.() -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(colors.surface)
            .border(1.2.dp, colors.strokeBorder.copy(alpha = 0.4f), RoundedCornerShape(16.dp))
            .padding(14.dp)
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(iconColor.copy(alpha = 0.12f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(imageVector = icon, contentDescription = null, tint = iconColor, modifier = Modifier.size(16.dp))
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = title,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.textPrimary
                )
            }
            content()
        }
    }
}

@Composable
private fun SettingsOptionRow(
    title: String,
    subtitle: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    colors: RastroPalette,
    onClick: () -> Unit
) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(colors.surfaceAccent)
            .bouncyClick(scaleDown = 0.97f) {
                DuolingoHaptics.playOptionSelected(context)
                onClick()
            }
            .padding(horizontal = 10.dp, vertical = 9.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = colors.accent,
                modifier = Modifier.size(17.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = title, fontSize = 12.sp, fontWeight = FontWeight.Bold, color = colors.textPrimary)
                Text(text = subtitle, fontSize = 10.sp, color = colors.textSecondary)
            }
        }
        Icon(
            imageVector = Icons.Rounded.ChevronRight,
            contentDescription = null,
            tint = colors.textSecondary,
            modifier = Modifier.size(18.dp)
        )
    }
}

@Composable
private fun SettingsSwitchRow(
    title: String,
    subtitle: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    checked: Boolean,
    colors: RastroPalette,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(colors.surfaceAccent)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = colors.accent,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = title, fontSize = 12.5.sp, fontWeight = FontWeight.Bold, color = colors.textPrimary)
                Text(text = subtitle, fontSize = 10.5.sp, color = colors.textSecondary)
            }
        }
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = colors.accent,
                uncheckedThumbColor = colors.textSecondary,
                uncheckedTrackColor = colors.surfaceBorder
            )
        )
    }
}

