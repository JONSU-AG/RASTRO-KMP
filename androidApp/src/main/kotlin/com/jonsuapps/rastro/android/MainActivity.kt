package com.jonsuapps.rastro.android

import android.content.Context
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
import com.jonsuapps.rastro.theme.MaterialYouIntensity
import com.jonsuapps.rastro.theme.onAccent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        com.jonsuapps.rastro.android.navigation.RastroAppLinks.accept(intent?.data)
        com.jonsuapps.rastro.android.navigation.RastroAppLinks.acceptShortcut(intent?.action)

        // Habilita insets limpios de borde a borde para que no colapse con la barra de notificaciones
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Inicializar gestor centralizado del logo dinámico de RASTRO
        com.jonsuapps.rastro.android.logo.RastroLogoManager.initialize(applicationContext)

        val prefs = getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE)
        ThemeManager.chooseMaterialYouIntensity(MaterialYouIntensity.fromId(prefs.getString("material_you_intensity", null)))
        ThemeManager.setAcademicBackground(prefs.getBoolean("academic_background", true))
        val savedThemeId = prefs.getString("selected_theme", RastroThemeId.MATERIAL_YOU.idName)
        val initialTheme = RastroThemeId.entries.firstOrNull { it.idName == savedThemeId } ?: RastroThemeId.MATERIAL_YOU
        if (initialTheme == RastroThemeId.CUSTOM) {
            val prim = prefs.getInt("custom_primary", -1)
            val sec = prefs.getInt("custom_secondary", -986896)
            val acc = prefs.getInt("custom_accent", -16744193)
            val high = prefs.getInt("custom_highlight", acc)
            ThemeManager.setCustomTheme(Color(prim), Color(sec), Color(acc), Color(high))
        } else {
            ThemeManager.setTheme(initialTheme)
        }

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

            val highContrastOnAccent = colors.onAccent

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
                    outline = colors.strokeBorder,
                    primaryContainer = colors.surfaceAccent,
                    onPrimaryContainer = colors.textPrimary,
                    secondary = colors.accent,
                    onSecondary = highContrastOnAccent,
                    secondaryContainer = colors.surfaceAccent,
                    onSecondaryContainer = colors.textPrimary,
                    tertiary = colors.accent,
                    onTertiary = highContrastOnAccent,
                    tertiaryContainer = colors.surfaceAccent,
                    onTertiaryContainer = colors.textPrimary
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
                    outline = colors.strokeBorder,
                    primaryContainer = colors.surfaceAccent,
                    onPrimaryContainer = colors.textPrimary,
                    secondary = colors.accent,
                    onSecondary = highContrastOnAccent,
                    secondaryContainer = colors.surfaceAccent,
                    onSecondaryContainer = colors.textPrimary,
                    tertiary = colors.accent,
                    onTertiary = highContrastOnAccent,
                    tertiaryContainer = colors.surfaceAccent,
                    onTertiaryContainer = colors.textPrimary
                )
            }

            MaterialTheme(colorScheme = colorScheme) {
                CompositionLocalProvider(LocalContentColor provides colors.textPrimary) {
                    RastroApp(
                        currentThemeId = currentThemeId,
                        onThemeChange = { newTheme ->
                            ThemeManager.setTheme(newTheme)
                            prefs.edit().putString("selected_theme", newTheme.idName).apply()
                        }
                    )
                }
            }
        }
    }

    override fun onNewIntent(intent: android.content.Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        com.jonsuapps.rastro.android.navigation.RastroAppLinks.accept(intent.data)
        com.jonsuapps.rastro.android.navigation.RastroAppLinks.acceptShortcut(intent.action)
    }

    override fun onResume() {
        super.onResume()
        // Al regresar a la app, actualiza estado de actividad del usuario (regreso a BASE si no hay racha perdida)
        com.jonsuapps.rastro.android.logo.RastroLogoManager.recordUserActive()
    }
}
