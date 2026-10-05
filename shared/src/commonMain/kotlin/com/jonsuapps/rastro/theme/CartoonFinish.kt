package com.jonsuapps.rastro.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/** Shared physical finish; dark/custom palettes retain their own surfaces and accents. */
object CartoonFinish {
    val outline = 2.dp
    val depth = 4.dp
    val compactDepth = 3.dp
    val cardRadius = 24.dp
    val compactRadius = 18.dp
    val green = Color(0xFF128664)
    val gold = Color(0xFFDA800E)
    val coral = Color(0xFFE94E46)
    fun ink(theme: RastroPalette) = if (theme.isLight) Color(0xFF292524) else theme.strokeBorder
    fun gold(theme: RastroPalette) = if (theme.isLight) gold else Color(0xFFFFBF59)
    fun coral(theme: RastroPalette) = if (theme.isLight) coral else Color(0xFFFF817A)
}
