package com.jonsuapps.rastro.android.ui.components

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.NotificationsActive
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun WelcomeOnboardingDialog(
    isOpen: Boolean,
    onDismiss: () -> Unit,
    theme: RastroPalette = ThemeManager.currentTheme
) {
    if (!isOpen) return
    val context = LocalContext.current
    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { onDismiss() }

    RastroStickerDialog(
        onDismissRequest = onDismiss,
        title = "¿Permitir Notificaciones?",
        message = "Activa los avisos para recibir recordatorios diarios de estudio, avances en tu racha y nuevo material en RASTRO.",
        confirmText = "Permitir avisos",
        cancelText = "Ahora no",
        confirmColor = theme.accent,
        icon = Icons.Rounded.NotificationsActive,
        theme = theme,
        onConfirm = {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
                androidx.core.content.ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED
            ) {
                permissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            } else {
                onDismiss()
            }
        }
    )
}
