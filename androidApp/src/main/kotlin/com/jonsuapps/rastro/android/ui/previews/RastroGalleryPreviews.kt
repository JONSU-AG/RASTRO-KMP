package com.jonsuapps.rastro.android.ui.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.android.data.RastroNotification
import com.jonsuapps.rastro.android.ui.components.MoreActionsDialog
import com.jonsuapps.rastro.android.ui.components.NotificationsDialog
import com.jonsuapps.rastro.android.ui.components.ProfileSettingsDialog
import com.jonsuapps.rastro.android.ui.components.RastroStickerDialog
import com.jonsuapps.rastro.android.ui.components.TermsAndPrivacyDialog
import com.jonsuapps.rastro.android.ui.components.ThemeSelectorDialog
import com.jonsuapps.rastro.android.ui.components.UploadMaterialDialog
import com.jonsuapps.rastro.android.ui.components.VocationalTestDialog
import com.jonsuapps.rastro.android.ui.components.WelcomeOnboardingDialog
import com.jonsuapps.rastro.android.ui.screens.CreateExamQuestionDialog
import com.jonsuapps.rastro.android.ui.screens.DirectChatThreadDialog
import com.jonsuapps.rastro.android.ui.screens.ReportExamQuestionDialog
import com.jonsuapps.rastro.model.DirectChatConversation
import com.jonsuapps.rastro.model.ExamQuestion
import com.jonsuapps.rastro.model.UserData
import com.jonsuapps.rastro.theme.RastroThemeId
import com.jonsuapps.rastro.theme.RastroThemeTokens

/**
 * Catálogo Oficial de Vistas Previas (Compose Preview Gallery)
 * Permite a Android Studio renderizar todas las secciones y popups de RASTRO
 * en modo Split/Design en cuadrícula y exportar capturas PNG instantáneas.
 */

// ── 1. POPUP DE CONFIRMACIÓN ÉXITO / ADVERTENCIA (3D) ──────────────────────────
@Preview(name = "1. Popup Sticker 3D - Éxito", showBackground = true)
@Composable
fun PreviewRastroStickerDialogSuccess() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        RastroStickerDialog(
            onDismissRequest = {},
            title = "¡Logro Desbloqueado!",
            message = "Has completado 5 lecciones consecutivas. Tu racha aumentó a 7 días de fuego.",
            confirmText = "¡Excelente!",
            cancelText = "Cerrar",
            icon = Icons.Rounded.CheckCircle,
            theme = theme,
            onConfirm = {}
        )
    }
}

@Preview(name = "2. Popup Sticker 3D - Destructivo / Salir", showBackground = true)
@Composable
fun PreviewRastroStickerDialogDestructive() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        RastroStickerDialog(
            onDismissRequest = {},
            title = "¿Seguro que deseas salir?",
            message = "Si sales de la lección ahora perderás el puntaje acumulado en este intento.",
            confirmText = "Salir",
            cancelText = "Continuar estudiando",
            isDestructive = true,
            icon = Icons.Rounded.Warning,
            theme = theme,
            onConfirm = {}
        )
    }
}

// ── 2. POPUP ONBOARDING PERMISOS DE NOTIFICACIÓN ──────────────────────────────
@Preview(name = "3. Onboarding Notificaciones 3D", showBackground = true)
@Composable
fun PreviewWelcomeOnboardingDialog() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        WelcomeOnboardingDialog(
            isOpen = true,
            onDismiss = {},
            theme = theme
        )
    }
}

// ── 3. MODAL SELECTOR DE LOS 9 TEMAS ──────────────────────────────────────────
@Preview(name = "4. Selector de Temas 3D", showBackground = true)
@Composable
fun PreviewThemeSelectorDialog() {
    Box(Modifier.fillMaxSize().background(androidx.compose.ui.graphics.Color(0xFFE2E8F0)).padding(16.dp)) {
        ThemeSelectorDialog(
            currentThemeId = RastroThemeId.LIGHT,
            onSelectTheme = {},
            onDismiss = {}
        )
    }
}

// ── 4. INFORME PSICOMÉTRICO VOCACIONAL ─────────────────────────────────────────
@Preview(name = "5. Informe Vocacional Psicométrico 3D", showBackground = true)
@Composable
fun PreviewVocationalTestDialog() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        VocationalTestDialog(
            colors = theme,
            onDismiss = {},
            onCompleteRuta = {}
        )
    }
}

// ── 5. SUBIR APORTE DE MATERIAL A LA COMUNIDAD ────────────────────────────────
@Preview(name = "6. Subir Aporte de Material 3D", showBackground = true)
@Composable
fun PreviewUploadMaterialDialog() {
    Box(Modifier.fillMaxSize().background(androidx.compose.ui.graphics.Color(0xFF0F172A)).padding(16.dp)) {
        UploadMaterialDialog(
            isOpen = true,
            onClose = {},
            onUploadSuccess = {}
        )
    }
}

// ── 6. AJUSTES DE PERFIL, TEMAS Y PLAY STORE ──────────────────────────────────
@Preview(name = "7. Ajustes de Perfil y Temas 3D", showBackground = true)
@Composable
fun PreviewProfileSettingsDialog() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        ProfileSettingsDialog(
            currentThemeId = RastroThemeId.LIGHT,
            colors = theme,
            onSelectTheme = {},
            onDismiss = {},
            onOpenTermsAndPrivacy = {},
            onLogout = {},
            onAccountDeleted = {}
        )
    }
}

// ── 7. TÉRMINOS, POLÍTICAS Y BORRADO DE CUENTA GOOGLE PLAY ────────────────────
@Preview(name = "8. Términos y Privacidad (Play Store)", showBackground = true)
@Composable
fun PreviewTermsAndPrivacyDialog() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        TermsAndPrivacyDialog(
            colors = theme,
            initialTab = 0,
            onDismiss = {},
            onAccountDeleted = {}
        )
    }
}

// ── 8. APORTAR PREGUNTA DE EXAMEN MCQ (A-E) ───────────────────────────────────
@Preview(name = "9. Aportar Pregunta de Examen 3D", showBackground = true)
@Composable
fun PreviewCreateExamQuestionDialog() {
    Box(Modifier.fillMaxSize().background(androidx.compose.ui.graphics.Color(0xFF1E293B)).padding(16.dp)) {
        CreateExamQuestionDialog(onDismiss = {})
    }
}

// ── 9. REPORTAR PREGUNTA DE EXAMEN / CONTENIDO INAPROPIADO ────────────────────
@Preview(name = "10. Reportar Pregunta (Normas UGC)", showBackground = true)
@Composable
fun PreviewReportExamQuestionDialog() {
    Box(Modifier.fillMaxSize().background(androidx.compose.ui.graphics.Color(0xFF1E293B)).padding(16.dp)) {
        ReportExamQuestionDialog(
            question = ExamQuestion(
                id = "mock_1",
                q = "¿Qué organelo celular se encarga de la respiración celular y producción de ATP?",
                options = listOf("Mitocondria", "Ribosoma", "Lisosoma", "Peroxisoma", "Vacuola"),
                answer = 0,
                asignatura = "Biología",
                curso = "Biología",
                area = "Biomédicas",
                explanation = "Las mitocondrias son los centros de producción de ATP por respiración celular."
            ),
            onDismiss = {}
        )
    }
}

// ── 10. CENTRO DE NOTIFICACIONES ──────────────────────────────────────────────
@Preview(name = "11. Centro de Notificaciones 3D", showBackground = true)
@Composable
fun PreviewNotificationsDialog() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        NotificationsDialog(
            notifications = listOf(
                RastroNotification(
                    id = "1",
                    title = "¡Nuevo Banco de Preguntas Cepre!",
                    message = "Se agregaron 50 ejercicios de Razonamiento Matemático.",
                    type = "academic",
                    senderName = "Equipo RASTRO",
                    timestamp = System.currentTimeMillis() - 1000 * 60 * 30,
                    read = false
                ),
                RastroNotification(
                    id = "2",
                    title = "Racha de 3 días",
                    message = "Sigue practicando hoy para no perder tu racha de fuego.",
                    type = "streak",
                    senderName = "Mascota Artyon",
                    timestamp = System.currentTimeMillis() - 1000 * 60 * 120,
                    read = true
                )
            ),
            theme = theme,
            onClose = {},
            onRead = {},
            onReadAll = {},
            onDelete = {},
            onSelect = {}
        )
    }
}

// ── 11. MENÚ MÁS ACCIONES ─────────────────────────────────────────────────────
@Preview(name = "12. Menú Más Acciones 3D", showBackground = true)
@Composable
fun PreviewMoreActionsDialog() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        MoreActionsDialog(
            colors = theme,
            signedIn = true,
            isAdmin = true,
            onDismiss = {},
            onAction = {}
        )
    }
}

// ── 12. CHAT DIRECTO DE AYUDA ACADÉMICA ───────────────────────────────────────
@Preview(name = "13. Chat Directo de Estudio 3D", showBackground = true)
@Composable
fun PreviewDirectChatThreadDialog() {
    val theme = RastroThemeTokens.getColors(RastroThemeId.LIGHT)
    Box(Modifier.fillMaxSize().background(theme.background).padding(16.dp)) {
        DirectChatThreadDialog(
            conversation = DirectChatConversation(
                id = "chat_mock_1",
                participantUids = listOf("me", "peer_1"),
                otherUid = "peer_1",
                otherName = "Valeria (Medicina)",
                otherAcademicStatus = "Postulante a Medicina Humana (UNSA)",
                lastMessageText = "¿Tienes los apuntes del último seminario de Anatomía?",
                lastMessageTime = System.currentTimeMillis() - 1000 * 60 * 10,
                unreadCount = 1
            ),
            currentUser = UserData(uid = "me", displayName = "Estudiante RASTRO"),
            theme = theme,
            onDismiss = {}
        )
    }
}
