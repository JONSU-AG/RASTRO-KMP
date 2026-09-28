package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Calculate
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Login
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material.icons.rounded.Policy
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Timer
import androidx.compose.material.icons.rounded.AdminPanelSettings
import androidx.compose.material.icons.rounded.Widgets
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.theme.RastroPalette

enum class MoreAction { FORMULAS, POMODORO, WIDGETS, SETTINGS, POLICIES, ACCOUNT, ADMIN, LOKI_LAB, TOGGLE_ADMIN_VIEW }

@Composable
fun MoreActionsDialog(
    colors: RastroPalette,
    signedIn: Boolean,
    isAdmin: Boolean = false,
    isAdminViewMode: Boolean = true,
    onDismiss: () -> Unit,
    onAction: (MoreAction) -> Unit
) {
    val actions = mutableListOf(
        Triple(MoreAction.FORMULAS, Icons.Rounded.Calculate, "Fórmulas y Truquitos Pre-U"),
        Triple(MoreAction.POMODORO, Icons.Rounded.Timer, "Temporizador Pomodoro"),
        Triple(MoreAction.WIDGETS, Icons.Rounded.Widgets, "Widgets y Atajos de Inicio"),
        Triple(MoreAction.SETTINGS, Icons.Rounded.Settings, "Configuración"),
        Triple(MoreAction.POLICIES, Icons.Rounded.Policy, "Políticas y Privacidad"),
        Triple(MoreAction.ACCOUNT, Icons.Rounded.Login, if (signedIn) "Mi perfil" else "Iniciar sesión")
    ).apply {
        if (isAdmin && signedIn) {
            add(Triple(MoreAction.ADMIN, Icons.Rounded.AdminPanelSettings, "Panel de Administrador"))
            add(Triple(MoreAction.LOKI_LAB, Icons.Rounded.AutoAwesome, "Laboratorio de Loki"))
            add(Triple(
                MoreAction.TOGGLE_ADMIN_VIEW,
                Icons.Rounded.AdminPanelSettings,
                if (isAdminViewMode) "Cambiar a Modo Usuario" else "Cambiar a Modo Admin"
            ))
        }
    }
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .widthIn(max = 360.dp),
            containerColor = colors.surface,
            bottomBevelColor = colors.cardBevel,
            strokeColor = colors.strokeBorder,
            bevelHeight = 4.dp,
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier.padding(14.dp).verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Más Opciones",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Black,
                        color = colors.textPrimary
                    )
                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Cerrar",
                            tint = colors.textSecondary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                actions.forEachIndexed { index, (action, icon, label) ->
                    val accent = when (action) {
                        MoreAction.FORMULAS -> Color(0xFF8B5CF6)
                        MoreAction.POMODORO -> Color(0xFFEF4444)
                        MoreAction.WIDGETS -> Color(0xFFF59E0B)
                        MoreAction.SETTINGS -> Color(0xFF0EA5E9)
                        MoreAction.POLICIES -> Color(0xFF64748B)
                        MoreAction.ADMIN -> Color(0xFFE11D48)
                        MoreAction.LOKI_LAB -> colors.textPrimary
                        MoreAction.TOGGLE_ADMIN_VIEW -> Color(0xFF10B981)
                        MoreAction.ACCOUNT -> colors.accent
                    }
                    MoreActionRow(label, icon, accent, colors, action == MoreAction.ADMIN || action == MoreAction.TOGGLE_ADMIN_VIEW || index == actions.lastIndex) {
                        onDismiss()
                        onAction(action)
                    }
                }
            }
        }
    }
}

@Composable
private fun MoreActionRow(
    label: String,
    icon: ImageVector,
    accent: Color,
    colors: RastroPalette,
    emphasized: Boolean,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(14.dp)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
            .bouncyClick(scaleDown = 0.94f, onClick = onClick)
    ) {
        // Bisel 3D inferior
        Box(
            modifier = Modifier
                .matchParentSize()
                .offset(y = 2.5.dp)
                .clip(shape)
                .background(accent.copy(alpha = 0.35f))
        )
        // Cara frontal táctil
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape)
                .background(accent.copy(alpha = 0.10f))
                .border(1.5.dp, accent.copy(alpha = 0.55f), shape)
                .padding(horizontal = 12.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .background(accent.copy(alpha = 0.18f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(icon, null, tint = accent, modifier = Modifier.size(16.dp))
                }
                Spacer(Modifier.width(10.dp))
                Text(
                    text = label,
                    fontSize = 12.sp,
                    fontWeight = if (emphasized) FontWeight.Black else FontWeight.Bold,
                    color = colors.textPrimary,
                    maxLines = 1
                )
            }
        }
    }
}
