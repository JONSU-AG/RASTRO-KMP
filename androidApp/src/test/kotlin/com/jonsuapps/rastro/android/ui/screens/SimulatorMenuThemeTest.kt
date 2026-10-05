package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.ui.graphics.luminance
import com.jonsuapps.rastro.theme.RastroThemeId
import com.jonsuapps.rastro.theme.RastroThemeTokens
import org.junit.Assert.assertTrue
import org.junit.Test

class SimulatorMenuThemeTest {
    @Test fun mainCardsStayReadableAndDarkThemesStayDark() {
        RastroThemeId.entries.forEach { id ->
            val theme = RastroThemeTokens.getColors(id)
            listOf(0, 4, 3).forEach { card ->
                val surface = simulatorMenuSurface(theme, card)
                fun contrast(a: Float, b: Float) = (maxOf(a,b)+.05f)/(minOf(a,b)+.05f)
                assertTrue("$id/$card title", contrast(simulatorMenuText(theme, card, false).luminance(), surface.luminance()) >= 4.5f)
                assertTrue("$id/$card description", contrast(simulatorMenuText(theme, card, true).luminance(), surface.luminance()) >= 4.5f)
                if(theme.isDark) assertTrue("$id/$card dark surface", surface.luminance() < .25f)
            }
        }
    }
}
