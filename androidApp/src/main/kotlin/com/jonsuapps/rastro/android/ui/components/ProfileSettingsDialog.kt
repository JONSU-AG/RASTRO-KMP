package com.jonsuapps.rastro.android.ui.components
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.onAccent

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
import kotlinx.coroutines.launch
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
    onOpenThemeSelector: () -> Unit = {},
    onOpenLegal: () -> Unit = {}
) {
    val context = LocalContext.current
    val currentUser by UserManager.currentUser.collectAsState()
    var showDeleteConfirmDialog by remember { mutableStateOf(false) }
    var showBlockedUsersDialog by remember { mutableStateOf(false) }
    var showProDialog by remember { mutableStateOf(false) }
    var showCoinsDialog by remember { mutableStateOf(false) }
    val proGrant by com.jonsuapps.rastro.monetization.ProAccess.grant.collectAsState()
    val backupBusy by com.jonsuapps.rastro.android.data.CloudBackupRepository.busy.collectAsState()
    val backupMessage by com.jonsuapps.rastro.android.data.CloudBackupRepository.message.collectAsState()
    var weeklyBackup by remember(currentUser.uid) { mutableStateOf(com.jonsuapps.rastro.android.data.CloudBackupRepository.weekly(currentUser.uid)) }
    var savingHomeCover by remember { mutableStateOf(false) }
    var homeCoverMessage by remember { mutableStateOf("") }
    var showRestoreBackup by remember { mutableStateOf(false) }
    var restoringBackup by remember { mutableStateOf(false) }
    var restoreMessage by remember { mutableStateOf("") }
    val backupScope = rememberCoroutineScope()
    var showWidgetsDialog by remember { mutableStateOf(false) }
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



    if(showProDialog) RastroProDialog { showProDialog = false }
    if(showCoinsDialog) CoinAndLivesDialog { showCoinsDialog = false }
    if (showRestoreBackup) RastroStickerDialog(onDismissRequest = { showRestoreBackup = false },
        title = "¿Recuperar el respaldo?", message = "El avance de este dispositivo se reemplazará por el respaldo de tu cuenta. Sincroniza primero si quieres conservar cambios locales.",
        confirmText = "Recuperar", cancelText = "Cancelar", isDestructive = true, icon = Icons.Rounded.CloudDownload,
        theme = colors, onConfirm = {
            showRestoreBackup = false
            restoringBackup = true
            val uid = currentUser.uid
            com.jonsuapps.rastro.android.data.GamificationRepository.load(uid) { result ->
                backupScope.launch {
                    val remote = result.getOrNull()
                    if (remote != null && UserManager.currentUser.value.uid == uid) {
                        val prepared = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                            com.jonsuapps.rastro.gamification.GamificationManager.prepareRestore(remote)
                        }
                        if (UserManager.currentUser.value.uid == uid) {
                            com.jonsuapps.rastro.android.data.GamificationRepository.saveLocal("$uid:before_restore", com.jonsuapps.rastro.gamification.GamificationManager.state.value)
                            com.jonsuapps.rastro.gamification.GamificationManager.applyRestored(prepared)
                            com.jonsuapps.rastro.android.data.GamificationRepository.saveLocal(uid, prepared)
                            restoreMessage = "Respaldo recuperado."
                        }
                    } else restoreMessage = "No se pudo recuperar un respaldo. Tu avance local se conserva."
                    restoringBackup = false
                }
            }
        })
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
                                tint = colors.accentText,
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
                    if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
                        SettingsSectionCard(title = "Portada en Inicio", icon = Icons.Rounded.Image,
                            iconColor = colors.accent, colors = colors) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Usar mi portada del perfil", Modifier.weight(1f), color = colors.textPrimary)
                                Switch(checked = currentUser.homeUseProfileCover, enabled = !savingHomeCover,
                                    onCheckedChange = { enabled ->
                                        val uid = currentUser.uid
                                        savingHomeCover = true
                                        com.jonsuapps.rastro.android.data.UserProfileRepository.save(uid, mapOf("homeUseProfileCover" to enabled)) { result ->
                                            savingHomeCover = false
                                            if (UserManager.currentUser.value.uid == uid) {
                                                result.onSuccess { UserManager.applyProfileFields(homeUseProfileCover = enabled) }
                                                homeCoverMessage = result.exceptionOrNull()?.message.orEmpty()
                                            }
                                        }
                                    })
                            }
                            Text("Mueve y amplía la imagen desde Editar perfil → Portada. Al desactivarlo vuelve el banner de RASTRO.",
                                color = colors.textSecondary, fontSize = 12.sp)
                            if (homeCoverMessage.isNotBlank()) Text(homeCoverMessage, color = colors.textPrimary, fontSize = 12.sp)
                        }
                    }
                    SettingsSectionCard(title = "Respaldo en la nube", icon = Icons.Rounded.Cloud,
                        iconColor = colors.accent, colors = colors) {
                        if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
                            Text("Tu avance se guarda en este dispositivo. Playlists, mensajes y publicaciones se guardan al realizar la acción.", color = colors.textSecondary, fontSize = 12.sp)
                            val lastBackup = com.jonsuapps.rastro.android.data.CloudBackupRepository.lastSuccess(currentUser.uid)
                            Text(if (lastBackup == 0L) "Todavía sin respaldo personal" else "Último respaldo: " + java.text.SimpleDateFormat("dd/MM/yyyy HH:mm", java.util.Locale.getDefault()).format(java.util.Date(lastBackup)), color = colors.textSecondary, fontSize = 12.sp)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Respaldo cada 3 días al abrir la app", Modifier.weight(1f), color = colors.textPrimary)
                                Switch(checked = weeklyBackup, onCheckedChange = {
                                    weeklyBackup = it
                                    com.jonsuapps.rastro.android.data.CloudBackupRepository.setWeekly(currentUser.uid, it)
                                })
                            }
                            Sticker3dButton(onClick = { com.jonsuapps.rastro.android.data.CloudBackupRepository.sync() },
                                enabled = !backupBusy && !restoringBackup, modifier = Modifier.fillMaxWidth(), containerColor = colors.accent,
                                bottomBevelColor = colors.cardBevel, strokeColor = colors.strokeBorder) {
                                Text(if (backupBusy) "Sincronizando…" else "Sincronizar con la nube", color = colors.onAccent, fontWeight = FontWeight.Bold)
                            }
                            if (backupMessage.isNotBlank()) Text(backupMessage, color = colors.textSecondary, fontSize = 12.sp)
                            TextButton(enabled = !backupBusy && !restoringBackup, onClick = { showRestoreBackup = true }) { Text("Recuperar respaldo de la nube") }
                            if (restoreMessage.isNotBlank()) Text(restoreMessage, color = colors.textSecondary, fontSize = 12.sp)
                            Text("Sin respaldo, desinstalar la app o perder el celular puede hacer perder el avance local.", color = colors.textSecondary, fontSize = 12.sp)
                        } else Text("Estudias sin cuenta. Inicia sesión para respaldar y recuperar tu avance en otro dispositivo.", color = colors.textSecondary)
                    }
                    SettingsSectionCard(title = if (!com.jonsuapps.rastro.monetization.PresentationMode.enabled && proGrant.active(System.currentTimeMillis())) "RASTRO Pro" else "Monedas y vidas", icon = Icons.Rounded.Star,
                        iconColor = colors.accent, colors = colors) {
                        Text(if (com.jonsuapps.rastro.monetization.PresentationMode.enabled) "Consulta tu saldo y recupera vidas con tus monedas." else if (proGrant.active(System.currentTimeMillis())) "Pro activo" else "Recupera vidas y completa misiones de monedas", color = colors.textPrimary)
                        if (!com.jonsuapps.rastro.monetization.PresentationMode.enabled && (proGrant.active(System.currentTimeMillis()) || com.jonsuapps.rastro.android.data.PlayBillingConfig.checkoutEnabled))
                            TextButton(onClick = { showProDialog = true }) { Text("Ver beneficios Pro") }
                        TextButton(onClick = { showCoinsDialog = true }) { Text("Monedas y vidas") }
                    }
                    // ── 1. SECCIÓN PERSONALIZACIÓN VISUAL (Separado a su propio selector) ──
                    SettingsSectionCard(title = "Widgets de inicio", icon = Icons.Rounded.Widgets,
                        iconColor = colors.accent, colors = colors) {
                        Text("Racha, calendario semanal, contador y frase del día.",
                            color = colors.textSecondary, fontSize = 12.sp)
                        Sticker3dButton(onClick = { showWidgetsDialog = true }, modifier = Modifier.fillMaxWidth(),
                            containerColor = colors.surfaceAccent, bottomBevelColor = colors.cardBevel,
                            strokeColor = colors.strokeBorder) {
                            Text("Ver vistas previas y agregar", color = colors.textPrimary, fontWeight = FontWeight.Bold)
                        }
                    }
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
                                    val currentThemeTokens = ThemeManager.currentTheme
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
                                            color = colors.accentText
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
                        title = "Legal y privacidad",
                        icon = Icons.Rounded.Policy,
                        iconColor = Color(0xFF10B981),
                        colors = colors
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            val adPrivacyRequired by com.jonsuapps.rastro.android.data.AdMobProvider.privacyRequired.collectAsState()
                            if (adPrivacyRequired) SettingsOptionRow(
                                title = "Privacidad de los anuncios",
                                subtitle = "Revisar tus opciones de consentimiento",
                                icon = Icons.Rounded.Shield,
                                colors = colors,
                                onClick = { com.jonsuapps.rastro.android.data.AdMobProvider.showPrivacyOptions() }
                            )
                            SettingsOptionRow(
                                title = "Legal y privacidad (Centro Oficial)",
                                subtitle = "Política, Términos, Normas y Eliminación de datos",
                                icon = Icons.Rounded.Policy,
                                colors = colors,
                                onClick = {
                                    onDismiss()
                                    onOpenLegal()
                                }
                            )

                            SettingsOptionRow(
                                title = "Términos y Condiciones",
                                subtitle = "Uso de la plataforma, normas académicas y deslinde",
                                icon = Icons.Rounded.Description,
                                colors = colors,
                                onClick = {
                                    com.jonsuapps.rastro.android.util.LegalLinks.openUrl(context, com.jonsuapps.rastro.android.util.LegalLinks.URL_TERMINOS)
                                }
                            )

                            SettingsOptionRow(
                                title = "Política de Privacidad",
                                subtitle = "Cero venta de datos, retención segura y Firebase",
                                icon = Icons.Rounded.Shield,
                                colors = colors,
                                onClick = {
                                    com.jonsuapps.rastro.android.util.LegalLinks.openUrl(context, com.jonsuapps.rastro.android.util.LegalLinks.URL_PRIVACIDAD)
                                }
                            )

                            SettingsOptionRow(
                                title = "Normas de la Comunidad",
                                subtitle = "Convivencia estudiantil y tolerancia cero a conductas dañinas",
                                icon = Icons.Rounded.Groups,
                                colors = colors,
                                onClick = {
                                    com.jonsuapps.rastro.android.util.LegalLinks.openUrl(context, com.jonsuapps.rastro.android.util.LegalLinks.URL_COMUNIDAD)
                                }
                            )

                            SettingsOptionRow(
                                title = "Eliminación de Cuenta y Datos",
                                subtitle = "Portal web de solicitud de borrado de datos (Google Play)",
                                icon = Icons.Rounded.DeleteForever,
                                colors = colors,
                                onClick = {
                                    com.jonsuapps.rastro.android.util.LegalLinks.openUrl(context, com.jonsuapps.rastro.android.util.LegalLinks.URL_ELIMINAR_CUENTA)
                                }
                            )

                            SettingsOptionRow(
                                title = "Usuarios Bloqueados (${currentUser.blockedUsers.size})",
                                subtitle = "Gestiona y desbloquea usuarios de la comunidad",
                                icon = Icons.Rounded.Block,
                                colors = colors,
                                onClick = { showBlockedUsersDialog = true }
                            )
                        }
                    }

                    // ── 4. ZONA DE PELIGRO: ELIMINAR CUENTA (GOOGLE PLAY) ────
                    SettingsSectionCard(
                        title = "Eliminar cuenta y datos",
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
                        text = "Se eliminarán tu perfil, progreso y contenido publicado en RASTRO. Esta acción no se puede deshacer. Los archivos de tu Drive personal permanecen bajo tu control. Eliminar la cuenta no cancela una suscripción de Google Play.",
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
                                if (isDeleting) return@Sticker3dButton
                                isDeleting = true
                                deletionError = null
                                com.jonsuapps.rastro.android.data.AccountDeletionRepository.deleteCurrentAccount(context) { result ->
                                    isDeleting = false
                                    result.onSuccess {
                                        UserManager.clearUser()
                                        showDeleteConfirmDialog = false
                                        onAccountDeleted()
                                        onDismiss()
                                    }.onFailure { deletionError = it.localizedMessage }
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

    if (showBlockedUsersDialog) {
        BlockedUsersDialog(
            currentUser = currentUser,
            onDismiss = { showBlockedUsersDialog = false }
        )
    }
    if (showWidgetsDialog) WidgetsAndShortcutsDialog(colors) { showWidgetsDialog = false }
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
                tint = colors.accentText,
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
                tint = colors.accentText,
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
