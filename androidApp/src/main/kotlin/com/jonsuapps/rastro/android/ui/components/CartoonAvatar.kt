package com.jonsuapps.rastro.android.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.util.ImageCacheManager
import com.jonsuapps.rastro.theme.ThemeManager

/**
 * CartoonAvatar: Avatar oficial estilo Cartoon / Sticker 3D de RASTRO.
 * 
 * Regla de diseño: Los usuarios SIEMPRE tienen un contorno visible (borde de trazo grueso 1.8dp - 2.2dp)
 * y una base física con bisel 3D para que jamás se vean planos o desconectados del estilo de la app.
 * Incorpora ImageCacheManager para que nunca parpadee ni vuelva a recargarse al navegar.
 */
@Composable
fun CartoonAvatar(
    photoUrl: String?,
    size: Dp = 40.dp,
    strokeColor: Color = ThemeManager.currentTheme.strokeBorder,
    strokeWidth: Dp = 1.8.dp,
    bevelColor: Color = ThemeManager.currentTheme.cardBevel,
    bevelOffset: Dp = 2.dp,
    modifier: Modifier = Modifier,
    contentDescription: String = "Avatar de usuario"
) {
    val context = LocalContext.current
    val normalizedUrl = photoUrl?.trim().orEmpty()

    // Consulta inmediata a memoria RAM: si ya existe, se dibuja en el fotograma 0
    var imageBitmap by remember(normalizedUrl) {
        mutableStateOf(ImageCacheManager.getFromMemory(normalizedUrl))
    }

    LaunchedEffect(normalizedUrl) {
        if (normalizedUrl.isNotBlank() && imageBitmap == null) {
            imageBitmap = ImageCacheManager.loadImage(context, normalizedUrl)
        }
    }

    Box(
        modifier = modifier.size(size)
    ) {
        // 1. Bisel 3D físico inferior (Sombra dura estilo Sticker 3D)
        if (bevelOffset > 0.dp) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .offset(y = bevelOffset)
                    .clip(CircleShape)
                    .background(bevelColor)
            )
        }

        // 2. Cara frontal del Avatar con contorno sólido
        Box(
            modifier = Modifier
                .matchParentSize()
                .clip(CircleShape)
                .background(Color.White)
                .border(strokeWidth, strokeColor, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            val bitmap = imageBitmap
            if (bitmap != null) {
                Image(
                    bitmap = bitmap,
                    contentDescription = contentDescription,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            } else if (normalizedUrl.isNotBlank()) {
                // Mientras se descarga por primera vez
                Image(
                    painter = painterResource(id = R.drawable.avatar_maneki_neko),
                    contentDescription = contentDescription,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            } else {
                // Usuario sin foto: Mascota oficial o silueta limpia
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(ThemeManager.currentTheme.accent.copy(alpha = 0.15f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Person,
                        contentDescription = null,
                        tint = ThemeManager.currentTheme.accent,
                        modifier = Modifier.size(size * 0.55f)
                    )
                }
            }
        }
    }
}

/**
 * CachedRemoteImage: Componente de imagen remota con caché en memoria y disco
 * para portadas, banners y recursos sin recargas innecesarias.
 */
@Composable
fun CachedRemoteImage(
    url: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
    contentDescription: String = "Imagen remota",
    placeholderColor: Color = Color(0xFF334155)
) {
    val context = LocalContext.current
    val normalizedUrl = url?.trim().orEmpty()

    var imageBitmap by remember(normalizedUrl) {
        mutableStateOf(ImageCacheManager.getFromMemory(normalizedUrl))
    }

    LaunchedEffect(normalizedUrl) {
        if (normalizedUrl.isNotBlank() && imageBitmap == null) {
            imageBitmap = ImageCacheManager.loadImage(context, normalizedUrl)
        }
    }

    val bitmap = imageBitmap
    if (bitmap != null) {
        Image(
            bitmap = bitmap,
            contentDescription = contentDescription,
            modifier = modifier,
            contentScale = contentScale
        )
    } else {
        Box(
            modifier = modifier.background(placeholderColor)
        )
    }
}
