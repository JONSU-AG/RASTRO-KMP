package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.util.LegalLinks
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun LegalScreen(
    title: String = "Legal y privacidad",
    onNavigateBack: () -> Unit = {},
    colors: RastroPalette = ThemeManager.currentTheme,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.background)
    ) {
        // Encabezado superior con botón de regreso
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = colors.surface,
            shadowElevation = 1.dp
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onNavigateBack,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surfaceAccent)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = "Regresar",
                        tint = colors.textPrimary,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Spacer(modifier = Modifier.width(14.dp))

                Column {
                    Text(
                        text = "Legal y privacidad",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black,
                        color = colors.textPrimary
                    )
                    Text(
                        text = "Marco legal, protección y normativas",
                        fontSize = 12.sp,
                        color = colors.textSecondary
                    )
                }
            }
        }

        // Contenido scrolleable
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = 600.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    LegalOptionCard(
                        title = "Política de Privacidad",
                        subtitle = "Recopilación de datos, almacenamiento seguro y cero venta a terceros",
                        icon = Icons.Rounded.Shield,
                        iconTint = Color(0xFF10B981),
                        colors = colors,
                        onClick = { LegalLinks.openUrl(context, LegalLinks.URL_PRIVACIDAD) }
                    )

                    LegalOptionCard(
                        title = "Términos y Condiciones",
                        subtitle = "Uso de la plataforma, contenido académico y deslinde de responsabilidad",
                        icon = Icons.Rounded.Description,
                        iconTint = Color(0xFF3B82F6),
                        colors = colors,
                        onClick = { LegalLinks.openUrl(context, LegalLinks.URL_TERMINOS) }
                    )

                    LegalOptionCard(
                        title = "Normas de la Comunidad",
                        subtitle = "Convivencia estudiantil, moderación y tolerancia cero a conductas dañinas",
                        icon = Icons.Rounded.Groups,
                        iconTint = Color(0xFFF59E0B),
                        colors = colors,
                        onClick = { LegalLinks.openUrl(context, LegalLinks.URL_COMUNIDAD) }
                    )

                    LegalOptionCard(
                        title = "Eliminar cuenta y datos",
                        subtitle = "Procedimiento oficial y derechos de supresión de datos (Google Play)",
                        icon = Icons.Rounded.DeleteForever,
                        iconTint = Color(0xFFEF4444),
                        colors = colors,
                        onClick = { LegalLinks.openUrl(context, LegalLinks.URL_ELIMINAR_CUENTA) }
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // Tarjeta inferior destacada: Centro Legal de RASTRO
                    Sticker3dCard(
                        onClick = { LegalLinks.openUrl(context, LegalLinks.URL_CENTRO_LEGAL) },
                        modifier = Modifier.fillMaxWidth(),
                        containerColor = colors.surface,
                        bottomBevelColor = colors.cardBevel,
                        strokeColor = colors.strokeBorder,
                        bevelHeight = 3.5.dp,
                        shape = RoundedCornerShape(18.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(14.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(42.dp)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(colors.accent.copy(alpha = 0.12f))
                                        .border(1.2.dp, colors.accent.copy(alpha = 0.3f), RoundedCornerShape(12.dp)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.Language,
                                        contentDescription = null,
                                        tint = colors.accent,
                                        modifier = Modifier.size(22.dp)
                                    )
                                }

                                Column {
                                    Text(
                                        text = "Centro Legal de RASTRO",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = colors.textPrimary
                                    )
                                    Text(
                                        text = "Portal oficial público • rumbo-jonsu.web.app",
                                        fontSize = 11.5.sp,
                                        color = colors.textSecondary
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "Última actualización: 30 septiembre 2026",
                                        fontSize = 10.5.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = colors.accent
                                    )
                                }
                            }

                            Icon(
                                imageVector = Icons.Rounded.OpenInNew,
                                contentDescription = "Abrir enlace web",
                                tint = colors.accent,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(40.dp))
                }
            }
        }
    }
}

@Composable
private fun LegalOptionCard(
    title: String,
    subtitle: String,
    icon: ImageVector,
    iconTint: Color,
    colors: RastroPalette,
    onClick: () -> Unit
) {
    Sticker3dCard(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        containerColor = colors.surface,
        bottomBevelColor = colors.cardBevel,
        strokeColor = colors.strokeBorder,
        bevelHeight = 3.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(iconTint.copy(alpha = 0.12f))
                        .border(1.dp, iconTint.copy(alpha = 0.25f), RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = iconTint,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Column {
                    Text(
                        text = title,
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textPrimary
                    )
                    Text(
                        text = subtitle,
                        fontSize = 11.sp,
                        color = colors.textSecondary,
                        lineHeight = 15.sp
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                imageVector = Icons.Rounded.ChevronRight,
                contentDescription = null,
                tint = colors.textSecondary,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}
