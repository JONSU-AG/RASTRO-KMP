package com.jonsuapps.rastro.android.ui.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import com.jonsuapps.rastro.theme.RastroPalette

fun contrastingText(background: Color): Color =
    com.jonsuapps.rastro.theme.onColor(background)

fun RastroPalette.answerSurface(correct: Boolean): Color = when {
    correct && isDark -> Color(0xFF123B2C)
    correct -> Color(0xFFDCFCE7)
    isDark -> Color(0xFF4B2028)
    else -> Color(0xFFFEE2E2)
}
fun RastroPalette.answerText(correct: Boolean): Color = when {
    correct && isDark -> Color(0xFF86EFAC)
    correct -> Color(0xFF166534)
    isDark -> Color(0xFFFDA4AF)
    else -> Color(0xFF991B1B)
}
