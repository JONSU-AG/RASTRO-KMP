package com.jonsuapps.rastro.android.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.jonsuapps.rastro.R
import androidx.compose.material.icons.filled.Groups
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.material.icons.outlined.Calculate
import androidx.compose.material.icons.outlined.CollectionsBookmark
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Layers
import androidx.compose.material.icons.outlined.MenuBook
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.ui.components.DualMascotDuo
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.android.ui.components.rememberBreathingPulse
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.navigation.RastroScreen
import com.jonsuapps.rastro.theme.RastroColors
import com.jonsuapps.rastro.theme.RastroShapes
import kotlinx.coroutines.delay

/**
 * Pantalla de Inicio (Home.jsx) — Réplica 100% fiel al layout, tipografía y tarjetas de RASTRO.
 */
@Composable
fun HomeScreen(
    colors: RastroColors,
    onNavigate: (String) -> Unit,
    onOpenVocationalTest: () -> Unit
) {
    val currentUser by UserManager.currentUser.collectAsState()
    val streakState by GamificationManager.streakState.collectAsState()
    val progress by GamificationManager.state.collectAsState()
    val minutesRemaining = (GamificationManager.remainingStudySecondsToday() + 59) / 60

    val mottoPhrases = remember {
        listOf(
            "Tu Futuro Cachimbo",
            "Tu Vacante Directa",
            "Tu Ingreso Universitario",
            "Máximo Puntaje",
            "Tu Carrera Soñada"
        )
    }

    var mottoIndex by remember { mutableIntStateOf(0) }
    LaunchedEffect(Unit) {
        while (true) {
            delay(2600)
            mottoIndex = (mottoIndex + 1) % mottoPhrases.size
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .widthIn(max = 760.dp)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp),
            contentPadding = PaddingValues(top = 10.dp, bottom = 100.dp)
        ) {
            // 1. Cabecera Oficial RASTRO (Chips, Mascotas y Saludo)
            item {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Chip Superior: ESPECIAL PARA UNIVERSIDADES NACIONALES
                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.CircularPill)
                            .background(Color(0xFFEFF6FF))
                            .border(1.5.dp, colors.strokeBorder, RastroShapes.CircularPill)
                    ) {
                        Text(
                            text = "ESPECIAL PARA UNIVERSIDADES NACIONALES",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Black,
                            color = Color(0xFF1D4ED8),
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                            letterSpacing = 0.5.sp
                        )
                    }

                    // Fila META: [ Tu Futuro Cachimbo ]
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "META:",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = colors.textSecondary
                        )

                        AnimatedContent(
                            targetState = mottoPhrases[mottoIndex],
                            label = "mottoAnimation"
                        ) { phrase ->
                            Box(
                                modifier = Modifier
                                    .clip(RastroShapes.CircularPill)
                                    .background(Color(0xFFFDF2F8))
                                    .border(1.5.dp, colors.strokeBorder, RastroShapes.CircularPill)
                            ) {
                                Text(
                                    text = phrase,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color(0xFFDB2777),
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    // Saludo con Dúo Oficial de Mascotas (Orstty + Artyon) a la izquierda
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        DualMascotDuo(size = 56.dp)

                        Column {
                            Text(
                                text = "Hola,",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = colors.textSecondary
                            )
                            Text(
                                text = currentUser.displayName.ifBlank { "TU BUEN AMIGO JONSU..." },
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Black,
                                color = colors.textPrimary,
                                letterSpacing = (-0.5).sp,
                                maxLines = 1
                            )
                        }
                    }

                    // Chip Racha activa con llama pulsante y micro-rebote
                    val flamePulse by rememberBreathingPulse(minScale = 0.88f, maxScale = 1.18f, durationMillis = 1100)
                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.CircularPill)
                            .background(Color(0xFFFEF3C7))
                            .border(1.8.dp, colors.strokeBorder, RastroShapes.CircularPill)
                            .bouncyClick(scaleDown = 0.93f) { onNavigate(RastroScreen.Simulador.route) }
                            .padding(horizontal = 12.dp, vertical = 5.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.LocalFireDepartment,
                                contentDescription = null,
                                tint = Color(0xFFD97706),
                                modifier = Modifier
                                    .size(16.dp)
                                    .graphicsLayer {
                                        scaleX = flamePulse
                                        scaleY = flamePulse
                                    }
                            )
                            Text(
                                text = "${streakState.currentStreak} días activos",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color(0xFFB45309)
                            )
                        }
                    }

                    // Banner Informativo: Regla de Racha por Perseverancia
                    Sticker3dCard(
                        modifier = Modifier.fillMaxWidth(),
                        containerColor = Color(0xFFFFF7ED),
                        bottomBevelColor = Color(0xFFFFEDD5),
                        strokeColor = colors.strokeBorder,
                        bevelHeight = 3.dp,
                        shape = RoundedCornerShape(18.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Icon(
                                Icons.Filled.LocalFireDepartment,
                                contentDescription = null,
                                tint = Color(0xFFF97316),
                                modifier = Modifier.size(36.dp)
                            )

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Racha Diaria por Perseverancia",
                                    fontSize = 12.5.sp,
                                    fontWeight = FontWeight.Black,
                                    color = Color(0xFFC2410C)
                                )
                                Spacer(Modifier.height(2.dp))
                                Text(
                                    text = if (minutesRemaining == 0) "Racha de hoy activa. Gracias por prepararte y ayudar a la comunidad."
                                    else "Completa 1 lección o estudia $minutesRemaining min en fichas, apuntes o preguntas. Cuenta tu perseverancia, no solo abrir la app.",
                                    fontSize = 11.sp,
                                    color = Color(0xFF9A3412),
                                    lineHeight = 15.sp
                                )
                            }
                        }
                    }
                }
            }

            // 2. Tarjeta: Ruta de Preparación Activa
            item {
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    strokeColor = colors.strokeBorder,
                    bevelColor = colors.cardBevel,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(20.dp),
                    onClick = { onNavigate(RastroScreen.Aprender.route) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(46.dp)
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(Color(0xFF007AFF))
                                    .border(1.5.dp, colors.strokeBorder, RoundedCornerShape(14.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.TrackChanges,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(24.dp)
                                )
                            }

                            Column {
                                Text(
                                    text = "Ruta de\nPreparación\nActiva",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = colors.textPrimary,
                                    lineHeight = 18.sp
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "Temarios oficiales y banco...",
                                    fontSize = 11.sp,
                                    color = colors.textSecondary
                                )
                            }
                        }

                        Sticker3dButton(
                            onClick = { onNavigate(RastroScreen.Aprender.route) },
                            containerColor = Color(0xFFEA580C),
                            bottomBevelColor = Color(0xFF9A3412),
                            strokeColor = colors.strokeBorder,
                            shape = RastroShapes.CircularPill,
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 7.dp)
                        ) {
                            Text(
                                text = "Estudiar",
                                fontWeight = FontWeight.Black,
                                fontSize = 13.sp,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                    }
                }
            }

            // Sugerencia: Canal & Comunidad de Postulantes
            item {
                val context = LocalContext.current
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    strokeColor = colors.strokeBorder,
                    bevelColor = colors.cardBevel,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(42.dp)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(Color(0xFF25D366).copy(alpha = 0.15f))
                                        .border(1.5.dp, colors.strokeBorder, RoundedCornerShape(12.dp)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_whatsapp),
                                        contentDescription = "WhatsApp Oficial",
                                        tint = Color(0xFF25D366),
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                                Column {
                                    Text(
                                        text = "Canal de WhatsApp Oficial",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = colors.textPrimary
                                    )
                                    Text(
                                        text = "Comunidad pre-U y alertas en vivo",
                                        fontSize = 11.sp,
                                        color = colors.textSecondary
                                    )
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .clip(RastroShapes.CircularPill)
                                    .background(Color(0xFFDCFCE7))
                                    .border(1.5.dp, colors.strokeBorder, RastroShapes.CircularPill)
                                    .padding(horizontal = 8.dp, vertical = 3.dp)
                            ) {
                                Text(
                                    text = "OFICIAL",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Black,
                                    color = Color(0xFF15803D)
                                )
                            }
                        }

                        Text(
                            text = "Únete a nuestro canal oficial de WhatsApp para debatir preguntas con otros postulantes, recibir alertas de exámenes y acceder a material compartido.",
                            fontSize = 12.sp,
                            color = colors.textSecondary,
                            lineHeight = 16.sp
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Sticker3dButton(
                                onClick = { onNavigate(RastroScreen.Biblioteca.route) },
                                containerColor = colors.surfaceAccent,
                                bottomBevelColor = colors.cardBevel,
                                strokeColor = colors.strokeBorder,
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier.weight(1f),
                                contentPadding = PaddingValues(vertical = 9.dp)
                            ) {
                                Text(
                                    text = "Muro Comunitario",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = colors.textPrimary,
                                    maxLines = 1
                                )
                            }

                            Sticker3dButton(
                                onClick = {
                                    val waChannel = currentUser.whatsappChannel.trim()
                                    val waUrl = if (waChannel.isNotBlank()) {
                                        if (waChannel.startsWith("http://") || waChannel.startsWith("https://")) waChannel
                                        else "https://whatsapp.com/channel/$waChannel"
                                    } else {
                                        "https://whatsapp.com/channel/0029VaJonsuRastro"
                                    }
                                    runCatching {
                                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(waUrl))
                                        context.startActivity(intent)
                                    }
                                },
                                containerColor = Color(0xFF25D366),
                                bottomBevelColor = Color(0xFF1EBE5D),
                                strokeColor = colors.strokeBorder,
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier.weight(1f),
                                contentPadding = PaddingValues(vertical = 9.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_whatsapp),
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(15.dp)
                                    )
                                    Text(
                                        text = "Canal WhatsApp",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White,
                                        maxLines = 1
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 3. Cuadrícula 2x3 de Tarjetas Blancas (Obras Literarias, Test Vocacional, Fórmulas, Aprender, Cursos, Biblioteca)
            item {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    // Fila 1: Obras Literarias & Test Vocacional
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        HomeSquareCard(
                            title = "Obras Literarias",
                            subtitle = "Resúmenes Detallados",
                            subtitleColor = Color(0xFFEA580C),
                            icon = Icons.Outlined.MenuBook,
                            iconBg = Color(0xFFFFEDD5),
                            iconTint = Color(0xFFEA580C),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate(RastroScreen.Biblioteca.route) }
                        )

                        HomeSquareCard(
                            title = "Test Vocacional",
                            subtitle = "Tu Carrera Ideal",
                            subtitleColor = colors.textSecondary,
                            icon = Icons.Outlined.Explore,
                            iconBg = Color(0xFFCCFBF1),
                            iconTint = Color(0xFF0D9488),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                            onClick = onOpenVocationalTest
                        )
                    }

                    // Fila 2: Fórmulas & Trucos & Aprender
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        HomeSquareCard(
                            title = "Fórmulas & Trucos",
                            subtitle = "Cara A & B Pre-U",
                            subtitleColor = colors.textSecondary,
                            icon = Icons.Outlined.Calculate,
                            iconBg = Color(0xFFF3E8FF),
                            iconTint = Color(0xFF9333EA),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate(RastroScreen.Formulario.route) }
                        )

                        HomeSquareCard(
                            title = "Aprender",
                            subtitle = "Rutas & Fichas",
                            subtitleColor = colors.textSecondary,
                            icon = Icons.AutoMirrored.Outlined.MenuBook,
                            iconBg = Color(0xFFDBEAFE),
                            iconTint = Color(0xFF2563EB),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate(RastroScreen.Aprender.route) }
                        )
                    }

                    // Fila 3: Cursos & Biblioteca
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        HomeSquareCard(
                            title = "Cursos",
                            subtitle = "Temarios & Módulos",
                            subtitleColor = colors.textSecondary,
                            icon = Icons.Outlined.Layers,
                            iconBg = Color(0xFFEDE9FE),
                            iconTint = Color(0xFF7C3AED),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate(RastroScreen.Cursos.route) }
                        )

                        HomeSquareCard(
                            title = "Biblioteca",
                            subtitle = "PDFs & Materiales",
                            subtitleColor = colors.textSecondary,
                            icon = Icons.Outlined.CollectionsBookmark,
                            iconBg = Color(0xFFD1FAE5),
                            iconTint = Color(0xFF059669),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate(RastroScreen.Biblioteca.route) }
                        )
                    }

                    // Fila 4: Simulador (con media anchura, alineado a la izquierda)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        HomeSquareCard(
                            title = "Simulador",
                            subtitle = "Examen & Ranking",
                            subtitleColor = colors.textSecondary,
                            icon = Icons.Filled.LocalFireDepartment,
                            iconBg = Color(0xFFFFEDD5),
                            iconTint = Color(0xFFF97316),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigate(RastroScreen.Simulador.route) }
                        )
                        // Espacio vacío para mantener la grid de 2 columnas
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

/**
 * Tarjeta de Inicio estilo Cartoon / Sticker 3D con relieve físico táctil y contorno visible
 */
@Composable
private fun HomeSquareCard(
    title: String,
    subtitle: String,
    subtitleColor: Color,
    icon: ImageVector,
    iconBg: Color,
    iconTint: Color,
    colors: RastroColors,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Sticker3dCard(
        modifier = modifier.fillMaxWidth(),
        containerColor = colors.surface,
        strokeColor = colors.strokeBorder,
        bevelColor = colors.cardBevel,
        bevelHeight = 3.dp,
        shape = RoundedCornerShape(20.dp),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(iconBg)
                    .border(1.5.dp, colors.strokeBorder.copy(alpha = 0.45f), RoundedCornerShape(14.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = iconTint,
                    modifier = Modifier.size(22.dp)
                )
            }

            Column {
                Text(
                    text = title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.textPrimary,
                    lineHeight = 17.sp
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = subtitle,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = subtitleColor
                )
            }
        }
    }
}
