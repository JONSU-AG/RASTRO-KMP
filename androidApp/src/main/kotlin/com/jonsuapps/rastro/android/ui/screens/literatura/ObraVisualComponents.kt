package com.jonsuapps.rastro.android.ui.screens.literatura

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoStories
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.theme.RastroPalette

/**
 * Portada de Obra con proporción de libro (3:4) y fallback cartoon vectorial RASTRO.
 *
 * Jerarquía:
 * 1. Imagen remota personalizada si existe coverUrl.
 * 2. Fallback SVG/Vectorial cartoon si coverUrl está vacío o falla.
 */
@Composable
fun ObraCoverGraphic(
    obra: ObraLiteraria,
    modifier: Modifier = Modifier,
    width: Dp = 88.dp,
    height: Dp = 120.dp
) {
    val bookColor = runCatching {
        Color(android.graphics.Color.parseColor(obra.colorHex))
    }.getOrDefault(Color(0xFF2563EB))

    Box(
        modifier = modifier
            .size(width = width, height = height)
            .clip(RoundedCornerShape(12.dp))
            .background(bookColor)
            .border(2.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp)),
        contentAlignment = Alignment.Center
    ) {
        if (obra.coverUrl.isNotBlank()) {
            CachedRemoteImage(
                url = obra.coverUrl,
                contentDescription = "Portada de ${obra.titulo}",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        } else {
            // Fallback Vectorial Cartoon de Portada
            ObraCoverCartoonFallback(
                titulo = obra.titulo,
                categoria = obra.categoria,
                baseColor = bookColor,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

/**
 * Fallback visual cartoon estilo ilustración de libro con lomo, páginas y tipografía RASTRO.
 */
@Composable
private fun ObraCoverCartoonFallback(
    titulo: String,
    categoria: String,
    baseColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(baseColor)
            .padding(4.dp),
        contentAlignment = Alignment.Center
    ) {
        // Marco interior con diseño de libro cartoon
        Canvas(modifier = Modifier.fillMaxSize()) {
            val strokeW = 1.5.dp.toPx()
            // Lomo del libro a la izquierda
            drawRect(
                color = Color.Black.copy(alpha = 0.25f),
                topLeft = Offset(0f, 0f),
                size = Size(size.width * 0.16f, size.height)
            )
            // Línea divisoria del lomo
            drawLine(
                color = Color(0xFF1E293B).copy(alpha = 0.4f),
                start = Offset(size.width * 0.16f, 0f),
                end = Offset(size.width * 0.16f, size.height),
                strokeWidth = strokeW
            )
            // Borde interno estilizado
            drawRoundRect(
                color = Color.White.copy(alpha = 0.35f),
                topLeft = Offset(size.width * 0.22f, size.height * 0.08f),
                size = Size(size.width * 0.72f, size.height * 0.84f),
                cornerRadius = CornerRadius(6.dp.toPx(), 6.dp.toPx()),
                style = Stroke(width = strokeW)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 14.dp, end = 6.dp, top = 8.dp, bottom = 8.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Rounded.AutoStories,
                contentDescription = null,
                tint = Color.White.copy(alpha = 0.95f),
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = titulo,
                fontSize = 10.sp,
                fontWeight = FontWeight.Black,
                color = Color.White,
                textAlign = TextAlign.Center,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 12.sp
            )

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color.Black.copy(alpha = 0.35f))
                    .padding(horizontal = 4.dp, vertical = 2.dp)
            ) {
                Text(
                    text = if (categoria.contains("Peruana", ignoreCase = true)) "PERÚ" else "UNIV",
                    fontSize = 7.5.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    letterSpacing = 0.5.sp
                )
            }
        }
    }
}

/**
 * Banner superior opcional de la obra.
 * Si existe bannerUrl, se muestra con crop controlado (altura contenida de 120dp a 140dp).
 * Si no existe, se muestra una presentación cartoon suave sin estirar ni deformar.
 */
@Composable
fun ObraBannerGraphic(
    bannerUrl: String,
    themeColor: Color,
    modifier: Modifier = Modifier,
    height: Dp = 124.dp
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(themeColor)
    ) {
        if (bannerUrl.isNotBlank()) {
            CachedRemoteImage(
                url = bannerUrl,
                contentDescription = "Banner de la obra",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            // Sutil velo oscuro inferior para legibilidad
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.28f))
            )
        } else {
            // Fondo cartoon limpio con sutil textura RASTRO
            Canvas(modifier = Modifier.fillMaxSize()) {
                // Ilustración de ondas cartoon suaves
                val path = Path().apply {
                    moveTo(0f, size.height * 0.7f)
                    cubicTo(
                        size.width * 0.3f, size.height * 0.5f,
                        size.width * 0.7f, size.height * 0.9f,
                        size.width, size.height * 0.65f
                    )
                    lineTo(size.width, size.height)
                    lineTo(0f, size.height)
                    close()
                }
                drawPath(path, color = Color.Black.copy(alpha = 0.12f))
            }
        }
    }
}

/**
 * Avatar de Personaje Literario con fallback SVG cartoon.
 *
 * Jerarquía:
 * 1. Imagen personalizada remota si existe imageUrl.
 * 2. Avatar cartoon con inicial e icono del rol si no tiene imagen.
 */
@Composable
fun PersonajeAvatarGraphic(
    personaje: PersonajeLiterario,
    modifier: Modifier = Modifier,
    size: Dp = 56.dp
) {
    val roleColor = when {
        personaje.rol.contains("Protagonista", ignoreCase = true) -> Color(0xFF2563EB)
        personaje.rol.contains("Antagonista", ignoreCase = true) -> Color(0xFFDC2626)
        personaje.rol.contains("Rey", ignoreCase = true) || personaje.rol.contains("Dios", ignoreCase = true) -> Color(0xFFD97706)
        personaje.rol.contains("Aliado", ignoreCase = true) || personaje.rol.contains("Amigo", ignoreCase = true) -> Color(0xFF059669)
        else -> Color(0xFF7C3AED)
    }

    Box(
        modifier = modifier
            .size(size)
            .clip(RoundedCornerShape(14.dp))
            .background(roleColor.copy(alpha = 0.18f))
            .border(1.5.dp, Color(0xFF1E293B), RoundedCornerShape(14.dp)),
        contentAlignment = Alignment.Center
    ) {
        if (personaje.imageUrl.isNotBlank()) {
            CachedRemoteImage(
                url = personaje.imageUrl,
                contentDescription = "Foto de ${personaje.nombre}",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        } else {
            // Fallback Cartoon Vectorial con inicial del personaje
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = personaje.nombre.take(1).uppercase(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    color = roleColor
                )
            }
        }
    }
}

/**
 * Chip cartoon para seleccionar secciones dinámicas de la obra.
 */
@Composable
fun ObraSectionChip(
    title: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    theme: RastroPalette,
    modifier: Modifier = Modifier
) {
    val containerColor = if (isSelected) Color(0xFF1E293B) else theme.surface
    val contentColor = if (isSelected) Color.White else theme.textPrimary
    val borderColor = if (isSelected) Color(0xFF1E293B) else theme.strokeBorder.copy(alpha = 0.5f)

    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(containerColor)
            .border(1.5.dp, borderColor, RoundedCornerShape(12.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            fontSize = 12.5.sp,
            fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
            color = contentColor
        )
    }
}
