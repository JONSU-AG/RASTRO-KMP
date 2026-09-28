package com.jonsuapps.rastro.android

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.jonsuapps.rastro.android.ui.RastroApp
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroThemeId
import com.jonsuapps.rastro.theme.RastroThemeTokens
import com.jonsuapps.rastro.theme.ThemeManager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilita insets limpios de borde a borde para que no colapse con la barra de notificaciones
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val systemDark = isSystemInDarkTheme()
            val currentThemeId = ThemeManager.currentThemeId

            // Configurar soporte nativo de Google Material You (Android 12+ API 31+)
            LaunchedEffect(currentThemeId, systemDark) {
                if (currentThemeId == RastroThemeId.MATERIAL_YOU && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    val dynamicScheme = if (systemDark) dynamicDarkColorScheme(this@MainActivity) else dynamicLightColorScheme(this@MainActivity)
                    ThemeManager.dynamicPaletteOverride = RastroPalette(
                        background = dynamicScheme.background,
                        surface = dynamicScheme.surface,
                        surfaceAccent = dynamicScheme.surfaceVariant,
                        borderSubtle = dynamicScheme.outline.copy(alpha = 0.25f),
                        surfaceBorder = dynamicScheme.outline.copy(alpha = 0.25f),
                        textPrimary = dynamicScheme.onBackground,
                        textSecondary = dynamicScheme.onSurfaceVariant,
                        textMuted = dynamicScheme.outline,
                        accent = dynamicScheme.primary,
                        isLight = !systemDark,
                        strokeBorder = if (!systemDark) Color(0xFF1E293B) else dynamicScheme.outline,
                        cardBevel = if (!systemDark) dynamicScheme.surfaceVariant else dynamicScheme.surfaceContainerHighest,
                        accentBevel = dynamicScheme.primaryContainer
                    )
                } else {
                    ThemeManager.dynamicPaletteOverride = null
                }
            }

            val colors = ThemeManager.currentTheme

            // Sincronizar iconos de barra de estado y notificaciones
            SideEffect {
                val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
                windowInsetsController.isAppearanceLightStatusBars = colors.isLight
                windowInsetsController.isAppearanceLightNavigationBars = colors.isLight
                window.statusBarColor = android.graphics.Color.TRANSPARENT
                window.navigationBarColor = android.graphics.Color.TRANSPARENT
            }

            val accentLuminance = (0.299 * colors.accent.red + 0.587 * colors.accent.green + 0.114 * colors.accent.blue).toFloat()
            val highContrastOnAccent = if (accentLuminance > 0.5f) Color(0xFF0F172A) else Color.White

            val colorScheme = if (colors.isLight) {
                lightColorScheme(
                    primary = colors.accent,
                    onPrimary = highContrastOnAccent,
                    background = colors.background,
                    onBackground = colors.textPrimary,
                    surface = colors.surface,
                    onSurface = colors.textPrimary,
                    surfaceVariant = colors.surfaceAccent,
                    onSurfaceVariant = colors.textSecondary,
                    outline = colors.borderSubtle
                )
            } else {
                darkColorScheme(
                    primary = colors.accent,
                    onPrimary = highContrastOnAccent,
                    background = colors.background,
                    onBackground = colors.textPrimary,
                    surface = colors.surface,
                    onSurface = colors.textPrimary,
                    surfaceVariant = colors.surfaceAccent,
                    onSurfaceVariant = colors.textSecondary,
                    outline = colors.borderSubtle
                )
            }

            MaterialTheme(colorScheme = colorScheme) {
                CompositionLocalProvider(LocalContentColor provides colors.textPrimary) {
                    RastroApp(
                        currentThemeId = currentThemeId,
                        onThemeChange = { newTheme ->
                            ThemeManager.setTheme(newTheme)
                        }
                    )
                }
            }
        }
    }
}
