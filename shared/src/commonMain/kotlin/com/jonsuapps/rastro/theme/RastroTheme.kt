package com.jonsuapps.rastro.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

/**
 * Paleta de diseño basada en tokens exactos de RASTRO (§4.5 y §6 del mapa).
 * Soporta los 9 temas del ecosistema.
 */
enum class RastroThemeId(val idName: String, val displayName: String, val bgHex: String) {
    LIGHT("light", "Blanco Puro", "#F2F2F7"),
    LIGHT_WARM("light-warm", "Cálido Suave", "#F6F3EC"),
    DARK("dark", "Oscuro Noche", "#000000"),
    GUINDA("guinda", "Guinda Nocturno", "#2D060D"),
    GUINDA_LIGHT("guinda-light", "Guinda Claro", "#FDF2F4"),
    CORAJE("coraje", "Coraje Cálido", "#F4EBE1"),
    CORAJE_DARK("coraje-dark", "Coraje Oscuro", "#120919"),
    BEIGE_CARMESI("beige-carmesi", "Beige Carmesí", "#E8DFD8"),
    GOOGLE_VIBRANT("google-vibrant", "Google Vibrant", "#F0F4F9"),
    MATERIAL_YOU("material-you", "Material You (Google Dinámico)", "#6750A4")
}

data class RastroPalette(
    val background: Color,
    val surface: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textMuted: Color,
    val accent: Color,
    val isLight: Boolean = true,
    val isDark: Boolean = !isLight,
    val surfaceAccent: Color = if (isLight) Color(0xFFF1F5F9) else Color(0xFF1E293B),
    val borderSubtle: Color = Color(0x2E787880),
    val surfaceBorder: Color = borderSubtle,
    val strokeBorder: Color = if (isLight) Color(0xFF1E293B) else Color(0xFF475569),
    val cardBevel: Color = if (isLight) Color(0xFFCBD5E1) else Color(0xFF0F172A),
    val accentBevel: Color = if (isLight) Color(0xFF0056B3) else Color(0xFF0284C7)
)

typealias RastroColors = RastroPalette

// Baldosas pastel de Inicio (§2.1 y §6 del mapa): Material-You + iOS Control Center
object RastroPastelTiles {
    val MenthaBg = Color(0xFFE0F2F1)
    val MenthaIcon = Color(0xFF00796B)

    val LavenderBg = Color(0xFFF3E8FD)
    val LavenderIcon = Color(0xFF7E22CE)

    val GoogleBlueBg = Color(0xFFE8F0FE)
    val GoogleBlueIcon = Color(0xFF1A73E8)

    val AmberBg = Color(0xFFFEF7E0)
    val AmberIcon = Color(0xFFD97706)

    val GreenBg = Color(0xFFE6F4EA)
    val GreenIcon = Color(0xFF16A34A)

    val IndigoBg = Color(0xFFEDE7F6)
    val IndigoIcon = Color(0xFF6366F1)

    val OrangeBg = Color(0xFFFFEDD5)
    val OrangeIcon = Color(0xFFEA580C)
}

object RastroThemeTokens {
    fun getColors(themeId: RastroThemeId): RastroPalette {
        return when (themeId) {
            RastroThemeId.LIGHT -> RastroPalette(
                background = Color(0xFFF2F2F7),
                surface = Color(0xFFFFFFFF),
                surfaceAccent = Color(0xFFF1F5F9),
                borderSubtle = Color(0x2E787880),
                surfaceBorder = Color(0x2E787880),
                strokeBorder = Color(0xFF1E293B),
                cardBevel = Color(0xFFCBD5E1),
                accentBevel = Color(0xFF0056B3),
                textPrimary = Color(0xFF0F172A),
                textSecondary = Color(0xFF64748B),
                textMuted = Color(0xFF94A3B8),
                accent = Color(0xFF007AFF),
                isLight = true
            )
            RastroThemeId.LIGHT_WARM -> RastroPalette(
                background = Color(0xFFF6F3EC),
                surface = Color(0xFFFFFFFF),
                surfaceAccent = Color(0xFFF0ECE4),
                borderSubtle = Color(0x33D1C7BD),
                surfaceBorder = Color(0x33D1C7BD),
                strokeBorder = Color(0xFF292524),
                cardBevel = Color(0xFFD6D3D1),
                accentBevel = Color(0xFFB45309),
                textPrimary = Color(0xFF1C1917),
                textSecondary = Color(0xFF78716C),
                textMuted = Color(0xFFA8A29E),
                accent = Color(0xFFD97706),
                isLight = true
            )
            RastroThemeId.DARK -> RastroPalette(
                background = Color(0xFF000000),
                surface = Color(0xFF161618),
                surfaceAccent = Color(0xFF262629),
                borderSubtle = Color(0x33FFFFFF),
                surfaceBorder = Color(0x33FFFFFF),
                strokeBorder = Color(0xFF334155),
                cardBevel = Color(0xFF090D16),
                accentBevel = Color(0xFF0284C7),
                textPrimary = Color(0xFFF8FAFC),
                textSecondary = Color(0xFF94A3B8),
                textMuted = Color(0xFF64748B),
                accent = Color(0xFF38BDF8),
                isLight = false
            )
            RastroThemeId.GUINDA -> RastroPalette(
                background = Color(0xFF2D060D),
                surface = Color(0xFF3F0B15),
                surfaceAccent = Color(0xFF52111E),
                borderSubtle = Color(0x40BE123C),
                surfaceBorder = Color(0x40BE123C),
                strokeBorder = Color(0xFF881337),
                cardBevel = Color(0xFF1A0207),
                accentBevel = Color(0xFFBE123C),
                textPrimary = Color(0xFFFFF1F2),
                textSecondary = Color(0xFFFDA4AF),
                textMuted = Color(0xFFF43F5E),
                accent = Color(0xFFFB7185),
                isLight = false
            )
            RastroThemeId.GUINDA_LIGHT -> RastroPalette(
                background = Color(0xFFFDF2F4),
                surface = Color(0xFFFFFFFF),
                surfaceAccent = Color(0xFFFBE4E8),
                borderSubtle = Color(0x33BE123C),
                surfaceBorder = Color(0x33BE123C),
                strokeBorder = Color(0xFF4C0519),
                cardBevel = Color(0xFFFECDD3),
                accentBevel = Color(0xFF9F1239),
                textPrimary = Color(0xFF4C0519),
                textSecondary = Color(0xFF881337),
                textMuted = Color(0xFFBE123C),
                accent = Color(0xFFE11D48),
                isLight = true
            )
            RastroThemeId.CORAJE -> RastroPalette(
                background = Color(0xFFF4EBE1),
                surface = Color(0xFFFAF5EF),
                surfaceAccent = Color(0xFFEDE2D4),
                borderSubtle = Color(0x33A16207),
                surfaceBorder = Color(0x33A16207),
                strokeBorder = Color(0xFF451A03),
                cardBevel = Color(0xFFFDE68A),
                accentBevel = Color(0xFF92400E),
                textPrimary = Color(0xFF292524),
                textSecondary = Color(0xFF78350F),
                textMuted = Color(0xFFB45309),
                accent = Color(0xFFD97706),
                isLight = true
            )
            RastroThemeId.CORAJE_DARK -> RastroPalette(
                background = Color(0xFF120919),
                surface = Color(0xFF20102B),
                surfaceAccent = Color(0xFF321943),
                borderSubtle = Color(0x40A855F7),
                surfaceBorder = Color(0x40A855F7),
                strokeBorder = Color(0xFF7E22CE),
                cardBevel = Color(0xFF0B0410),
                accentBevel = Color(0xFF6B21A8),
                textPrimary = Color(0xFFFDF4FF),
                textSecondary = Color(0xFFE9D5FF),
                textMuted = Color(0xFFC084FC),
                accent = Color(0xFFA855F7),
                isLight = false
            )
            RastroThemeId.BEIGE_CARMESI -> RastroPalette(
                background = Color(0xFFE8DFD8),
                surface = Color(0xFFF5EFEA),
                surfaceAccent = Color(0xFFE0D4CB),
                borderSubtle = Color(0x33991B1B),
                surfaceBorder = Color(0x33991B1B),
                strokeBorder = Color(0xFF450A0A),
                cardBevel = Color(0xFFFECACA),
                accentBevel = Color(0xFF991B1B),
                textPrimary = Color(0xFF1C1917),
                textSecondary = Color(0xFF7F1D1D),
                textMuted = Color(0xFF991B1B),
                accent = Color(0xFFDC2626),
                isLight = true
            )
            RastroThemeId.GOOGLE_VIBRANT -> RastroPalette(
                background = Color(0xFFF0F4F9),
                surface = Color(0xFFFFFFFF),
                surfaceAccent = Color(0xFFE2EDF9),
                borderSubtle = Color(0x2E1A73E8),
                surfaceBorder = Color(0x2E1A73E8),
                strokeBorder = Color(0xFF1E293B),
                cardBevel = Color(0xFFD3E3FD),
                accentBevel = Color(0xFF1557B0),
                textPrimary = Color(0xFF1F1F1F),
                textSecondary = Color(0xFF444746),
                textMuted = Color(0xFF747775),
                accent = Color(0xFF1A73E8),
                isLight = true
            )
            RastroThemeId.MATERIAL_YOU -> RastroPalette(
                background = Color(0xFFFEF7FF),
                surface = Color(0xFFFFFFFF),
                surfaceAccent = Color(0xFFF3EDF7),
                borderSubtle = Color(0x336750A4),
                surfaceBorder = Color(0x336750A4),
                strokeBorder = Color(0xFF381E72),
                cardBevel = Color(0xFFE8DEF8),
                accentBevel = Color(0xFF4F378B),
                textPrimary = Color(0xFF1D1B20),
                textSecondary = Color(0xFF49454F),
                textMuted = Color(0xFF79747E),
                accent = Color(0xFF6750A4),
                isLight = true
            )
        }
    }
}

object ThemeManager {
    var currentThemeId by mutableStateOf(RastroThemeId.LIGHT)
        private set

    var dynamicPaletteOverride by mutableStateOf<RastroPalette?>(null)

    val currentTheme: RastroPalette
        get() = if (currentThemeId == RastroThemeId.MATERIAL_YOU && dynamicPaletteOverride != null) {
            dynamicPaletteOverride!!
        } else {
            RastroThemeTokens.getColors(currentThemeId)
        }

    fun setTheme(themeId: RastroThemeId) {
        currentThemeId = themeId
    }

    val availableThemes: List<RastroThemeId> = RastroThemeId.entries
}
