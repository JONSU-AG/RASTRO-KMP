package com.jonsuapps.rastro.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

/**
 * Geometría y formas de diseño para RASTRO (§6 del mapa).
 * Squircle suave de 20dp y píldoras 999dp.
 */
object RastroShapes {
    // Formas primarias estándar utilizadas transversalmente en UI
    val Squircle = RoundedCornerShape(20.dp)
    val Pill = RoundedCornerShape(999.dp)

    // Formas especializadas / semánticas
    val SquircleCard = RoundedCornerShape(20.dp)
    val TileSquircle = RoundedCornerShape(18.dp)
    val ButtonSquircle = RoundedCornerShape(14.dp)
    val CircularPill = RoundedCornerShape(999.dp)
    val ModalTopRounded = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp)

    // Variantes escalonadas de Squircle
    val SquircleSmall = RoundedCornerShape(12.dp)
    val SquircleMedium = RoundedCornerShape(16.dp)
    val SquircleLarge = RoundedCornerShape(24.dp)
}
