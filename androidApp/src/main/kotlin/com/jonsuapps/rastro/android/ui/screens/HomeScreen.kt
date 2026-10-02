package com.jonsuapps.rastro.android.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.ImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.data.UserUploadRepository
import androidx.compose.material.icons.filled.Groups
import androidx.compose.animation.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import java.util.Calendar
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.material.icons.outlined.Brush
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
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.CartoonAvatar
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
    onOpenVocationalTest: () -> Unit,
    onNavigateToProfile: (String) -> Unit = {},
    onNavigateToPublication: (authorUid: String, publicationId: String) -> Unit = { uid, pubId ->
        onNavigate(RastroScreen.UsuarioDetail.createRoute(uid, pubId))
    }
) {
    val currentUser by UserManager.currentUser.collectAsState()
    val streakState by GamificationManager.streakState.collectAsState()
    val progress by GamificationManager.state.collectAsState()
    val minutesRemaining = (GamificationManager.remainingStudySecondsToday() + 59) / 60

    // Carrusel Destacados: observa en tiempo real las publicaciones marcadas por el admin
    var featuredUploads by remember { mutableStateOf<List<UserUpload>>(emptyList()) }
    DisposableEffect(Unit) {
        val reg = UserUploadRepository.observeFeatured { featuredUploads = it }
        onDispose { reg.remove() }
    }

    val mottoPhrases = remember {
        listOf(
            "Futuro Cachimbo",
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
            // 1. Cabecera Oficial RASTRO (Chips y Saludo)
            item {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Chip Superior: ESPECIAL PARA UNIVERSIDADES NACIONALES
                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.CircularPill)
                            .background(colors.surfaceAccent)
                            .border(1.5.dp, colors.strokeBorder, RastroShapes.CircularPill)
                    ) {
                        Text(
                            text = "ESPECIAL PARA UNIVERSIDADES NACIONALES",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Black,
                            color = colors.accent,
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
                                    .background(colors.surfaceAccent)
                                    .border(1.5.dp, colors.strokeBorder, RastroShapes.CircularPill)
                            ) {
                                Text(
                                    text = phrase,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = colors.textPrimary,
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    // Hero Banner oficial con saludo dinámico (nombre real del usuario)
                    HomeHeroBanner(
                        colors = colors,
                        displayName = currentUser.displayName,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            // 1. Tarjeta Racha & Perseverancia Semanal (Compacta y visual)
            item {
                val calendar = remember { Calendar.getInstance() }
                val dayOfWeek = remember { calendar.get(Calendar.DAY_OF_WEEK) }
                val currentDayIndex = remember(dayOfWeek) {
                    when (dayOfWeek) {
                        Calendar.MONDAY -> 0
                        Calendar.TUESDAY -> 1
                        Calendar.WEDNESDAY -> 2
                        Calendar.THURSDAY -> 3
                        Calendar.FRIDAY -> 4
                        Calendar.SATURDAY -> 5
                        Calendar.SUNDAY -> 6
                        else -> 0
                    }
                }
                val weekDayLabels = listOf("L", "M", "M", "J", "V", "S", "D")

                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    strokeColor = colors.strokeBorder,
                    bevelColor = colors.cardBevel,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(22.dp),
                    onClick = { onNavigate(RastroScreen.DiasDeRacha.route) }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Fila Superior: Llama + Días activos + Botón flecha
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                val flamePulse by rememberBreathingPulse(minScale = 0.92f, maxScale = 1.15f, durationMillis = 1100)
                                Box(
                                    modifier = Modifier
                                        .size(34.dp)
                                        .clip(CircleShape)
                                        .background(colors.surfaceAccent)
                                        .border(1.5.dp, colors.strokeBorder, CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_flame_cartoon),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(20.dp)
                                            .graphicsLayer {
                                                scaleX = flamePulse
                                                scaleY = flamePulse
                                            }
                                    )
                                }
                                Text(
                                    text = if (streakState.currentStreak == 1) "1 día activo" else "${streakState.currentStreak} días activos",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Black,
                                    color = colors.accent,
                                    letterSpacing = (-0.3).sp
                                )
                            }

                            // Botón flecha derecha
                            Box(
                                modifier = Modifier
                                    .size(28.dp)
                                    .clip(CircleShape)
                                    .background(colors.surface)
                                    .border(1.5.dp, colors.strokeBorder, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                    contentDescription = "Ver días de racha",
                                    tint = colors.textPrimary,
                                    modifier = Modifier.size(13.dp)
                                )
                            }
                        }

                        // Fila Inferior: Días de la semana (L M M J V S D) + META box
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Contenedor días L M M J V S D
                            Box(
                                modifier = Modifier
                                    .weight(1.5f)
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(colors.surfaceAccent)
                                    .border(1.5.dp, colors.strokeBorder, RoundedCornerShape(16.dp))
                                    .padding(horizontal = 8.dp, vertical = 7.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    weekDayLabels.forEachIndexed { index, dayLetter ->
                                        val isDayActive = when {
                                            index < currentDayIndex -> streakState.currentStreak > (currentDayIndex - index)
                                            index == currentDayIndex -> minutesRemaining == 0 || streakState.currentStreak > 0
                                            else -> false
                                        }
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            verticalArrangement = Arrangement.spacedBy(4.dp)
                                        ) {
                                            Text(
                                                text = dayLetter,
                                                fontSize = 10.sp,
                                                fontWeight = FontWeight.Black,
                                                color = if (index == currentDayIndex) colors.accent else colors.textSecondary
                                            )
                                            DoodleDayCheckCircle(
                                                isActive = isDayActive,
                                                strokeColor = colors.strokeBorder
                                            )
                                        }
                                    }
                                }
                            }

                            // Contenedor META
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(colors.surfaceAccent)
                                    .border(1.5.dp, colors.strokeBorder, RoundedCornerShape(16.dp))
                                    .padding(horizontal = 8.dp, vertical = 7.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = "META:",
                                            fontSize = 8.5.sp,
                                            fontWeight = FontWeight.Black,
                                            color = colors.textSecondary,
                                            letterSpacing = 0.5.sp
                                        )
                                        Text(
                                            text = "Futuro\nCachimbo",
                                            fontSize = 10.5.sp,
                                            fontWeight = FontWeight.Black,
                                            color = colors.textPrimary,
                                            maxLines = 2,
                                            lineHeight = 12.sp
                                        )
                                    }
                                    Spacer(Modifier.width(4.dp))
                                    DoodleGraduationCap(
                                        modifier = Modifier.size(32.dp, 28.dp),
                                        capColor = colors.accent,
                                        strokeColor = colors.strokeBorder
                                    )
                                }
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
                    shape = RoundedCornerShape(22.dp),
                    onClick = { onNavigate(RastroScreen.Aprender.route) }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        // Fila 1: Ícono azul diana + Título + Subtítulo + Ilustración mapa con bandera
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(46.dp)
                                    .clip(RoundedCornerShape(15.dp))
                                    .background(Color(0xFF007AFF))
                                    .border(1.8.dp, colors.strokeBorder, RoundedCornerShape(15.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.TrackChanges,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(26.dp)
                                )
                            }

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Ruta de Preparación Activa",
                                    fontSize = 14.5.sp,
                                    fontWeight = FontWeight.Black,
                                    color = colors.textPrimary,
                                    letterSpacing = (-0.3).sp,
                                    lineHeight = 17.sp
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "Temarios oficiales, banco de preguntas y plan de estudio personalizado.",
                                    fontSize = 11.sp,
                                    color = colors.textSecondary,
                                    lineHeight = 14.sp
                                )
                            }

                            // Ilustración mapa con banderita
                            DoodleMapWithFlag(
                                modifier = Modifier.size(50.dp, 38.dp),
                                strokeColor = colors.strokeBorder
                            )
                        }

                        // Fila 2: Camino de estrellas punteado + Botón "Estudiar ahora →"
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            // Garabato curvado/tilde a la izquierda
                            DoodleSmallCurve(
                                modifier = Modifier.size(24.dp, 14.dp),
                                color = colors.strokeBorder
                            )

                            // Camino punteado con 2 estrellitas
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(24.dp)
                                    .padding(horizontal = 8.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                DoodleTrailWithStars(
                                    modifier = Modifier.fillMaxSize(),
                                    strokeColor = colors.strokeBorder
                                )
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    DoodleStar(
                                        modifier = Modifier.size(13.dp),
                                        strokeColor = colors.strokeBorder,
                                        strokeWidth = 1.4f
                                    )
                                    DoodleStar(
                                        modifier = Modifier.size(11.dp),
                                        strokeColor = colors.strokeBorder,
                                        strokeWidth = 1.2f
                                    )
                                }
                            }

                            // Botón naranja "Estudiar ahora →"
                            Sticker3dButton(
                                onClick = { onNavigate(RastroScreen.Aprender.route) },
                                containerColor = Color(0xFFEA580C),
                                bottomBevelColor = Color(0xFF9A3412),
                                strokeColor = colors.strokeBorder,
                                shape = RastroShapes.CircularPill,
                                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 7.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    Text(
                                        text = "Estudiar ahora",
                                        fontWeight = FontWeight.Black,
                                        fontSize = 12.5.sp,
                                        color = Color.White
                                    )
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(13.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 3. Carrusel Destacados (solo visible si hay publicaciones marcadas)
            if (featuredUploads.isNotEmpty()) {
                item {
                    DestacadosCarousel(
                        items = featuredUploads,
                        colors = colors,
                        onNavigateToBiblioteca = { onNavigate(RastroScreen.Biblioteca.route) },
                        onNavigateToProfile = onNavigateToProfile,
                        onNavigateToPublication = onNavigateToPublication
                    )
                }
            }

            // 4. Canal de WhatsApp Oficial (Franja Horizontal Compacta)
            item {
                val context = LocalContext.current
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = colors.surface,
                    strokeColor = colors.strokeBorder,
                    bevelColor = colors.cardBevel,
                    bevelHeight = 3.dp,
                    shape = RoundedCornerShape(20.dp),
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
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Squircle WhatsApp verde (compacto)
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFF22C55E))
                                .border(1.6.dp, colors.strokeBorder, RoundedCornerShape(12.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_whatsapp),
                                contentDescription = "WhatsApp Oficial",
                                tint = Color.White,
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        // Título + Badge Oficial + Subtítulo
                        Column(modifier = Modifier.weight(1f)) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Text(
                                    text = "Canal de WhatsApp",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Black,
                                    color = colors.textPrimary,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Box(
                                    modifier = Modifier
                                        .clip(RastroShapes.CircularPill)
                                        .background(Color(0xFFDCFCE7))
                                        .border(1.2.dp, Color(0xFF15803D), RastroShapes.CircularPill)
                                        .padding(horizontal = 5.dp, vertical = 1.dp)
                                ) {
                                    Text(
                                        text = "OFICIAL",
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight.Black,
                                        color = Color(0xFF15803D)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(1.dp))
                            Text(
                                text = "Comunidad pre-U y alertas en vivo",
                                fontSize = 10.5.sp,
                                color = colors.textSecondary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }

                        // Botón Entrar compacto a la derecha
                        Box(
                            modifier = Modifier
                                .clip(RastroShapes.CircularPill)
                                .background(Color(0xFF22C55E))
                                .border(1.4.dp, colors.strokeBorder, RastroShapes.CircularPill)
                                .padding(horizontal = 11.dp, vertical = 6.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(3.dp)
                            ) {
                                Text(
                                    text = "Entrar",
                                    fontWeight = FontWeight.Black,
                                    fontSize = 11.5.sp,
                                    color = Color.White
                                )
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(11.dp)
                                )
                            }
                        }
                    }
                }
            }

            // 5. Explora RASTRO / Herramientas (Grid 2 columnas compacto)
            item {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    // Encabezado Explora RASTRO
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        DoodleGridIcon(modifier = Modifier.size(20.dp), strokeColor = colors.strokeBorder)
                        Column {
                            Text(
                                text = "Explora RASTRO",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Black,
                                color = colors.textPrimary,
                                letterSpacing = (-0.3).sp
                            )
                            Text(
                                text = "Todo lo que necesitas en un solo lugar",
                                fontSize = 11.sp,
                                color = colors.textSecondary
                            )
                        }
                    }

                    // Cuadrícula 2 columnas de herramientas
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        // Fila 1: Obras Literarias & Test Vocacional
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            HomeToolCard(
                                title = "Obras Literarias",
                                subtitle = "Resúmenes Detallados",
                                subtitleColor = Color(0xFFEA580C),
                                icon = Icons.Outlined.MenuBook,
                                iconBg = Color(0xFFFFEDD5),
                                iconTint = Color(0xFFEA580C),
                                colors = colors,
                                modifier = Modifier.weight(1f),
                                onClick = { onNavigate(RastroScreen.BibliotecaObras.route) }
                            )

                            HomeToolCard(
                                title = "Test Vocacional",
                                subtitle = "Tu Carrera Ideal",
                                subtitleColor = Color(0xFF0D9488),
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
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            HomeToolCard(
                                title = "Fórmulas & Trucos",
                                subtitle = "Cara A & B Pre-U",
                                subtitleColor = Color(0xFF9333EA),
                                icon = Icons.Outlined.Calculate,
                                iconBg = Color(0xFFF3E8FF),
                                iconTint = Color(0xFF9333EA),
                                colors = colors,
                                modifier = Modifier.weight(1f),
                                onClick = { onNavigate(RastroScreen.Formulario.route) }
                            )

                            HomeToolCard(
                                title = "Aprender",
                                subtitle = "Rutas & Fichas",
                                subtitleColor = Color(0xFF2563EB),
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
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            HomeToolCard(
                                title = "Cursos",
                                subtitle = "Temarios & Módulos",
                                subtitleColor = Color(0xFF7C3AED),
                                icon = Icons.Outlined.Layers,
                                iconBg = Color(0xFFEDE9FE),
                                iconTint = Color(0xFF7C3AED),
                                colors = colors,
                                modifier = Modifier.weight(1f),
                                onClick = { onNavigate(RastroScreen.Cursos.route) }
                            )

                            HomeToolCard(
                                title = "Biblioteca",
                                subtitle = "PDFs & Materiales",
                                subtitleColor = Color(0xFF059669),
                                icon = Icons.Outlined.CollectionsBookmark,
                                iconBg = Color(0xFFD1FAE5),
                                iconTint = Color(0xFF059669),
                                colors = colors,
                                modifier = Modifier.weight(1f),
                                onClick = { onNavigate(RastroScreen.Biblioteca.route) }
                            )
                        }

                        // Fila 4: Simulador (columna izquierda)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            HomeToolCard(
                                title = "Simulador",
                                subtitle = "Examen & Ranking",
                                subtitleColor = Color(0xFFF97316),
                                icon = Icons.Filled.LocalFireDepartment,
                                iconBg = Color(0xFFFFEDD5),
                                iconTint = Color(0xFFF97316),
                                colors = colors,
                                modifier = Modifier.weight(1f),
                                onClick = { onNavigate(RastroScreen.Simulador.route) }
                            )

                            // FASE 3: Acceso principal de Pizarra / Dibujo en Explora RASTRO
                            HomeToolCard(
                                title = "Pizarra Doodle",
                                subtitle = "Dibuja & Relájate",
                                subtitleColor = Color(0xFF0284C7),
                                icon = Icons.Outlined.Brush,
                                iconBg = Color(0xFFE0F2FE),
                                iconTint = Color(0xFF0284C7),
                                colors = colors,
                                modifier = Modifier.weight(1f),
                                onClick = { onNavigate(RastroScreen.Pizarra.route) }
                            )
                        }
                    }
                }
            }
        }
    }
}

// ─────────────────────────────────────────────────────────────────
// Carrusel de Destacados
// ─────────────────────────────────────────────────────────────────

@Composable
private fun DestacadosCarousel(
    items: List<UserUpload>,
    colors: RastroColors,
    onNavigateToBiblioteca: () -> Unit,
    onNavigateToProfile: (String) -> Unit = {},
    onNavigateToPublication: (String, String) -> Unit = { uid, _ -> onNavigateToProfile(uid) }
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Encabezado de sección
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(7.dp)
            ) {
                DoodleStar(
                    modifier = Modifier.size(20.dp),
                    strokeColor = colors.strokeBorder,
                    strokeWidth = 1.8f
                )
                Text(
                    text = "Destacados",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.textPrimary,
                    letterSpacing = (-0.3).sp
                )
                Box(
                    modifier = Modifier
                        .clip(RastroShapes.CircularPill)
                        .background(Color.White)
                        .border(1.5.dp, colors.strokeBorder, RastroShapes.CircularPill)
                        .padding(horizontal = 8.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = "${items.size}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Black,
                        color = colors.textPrimary
                    )
                }
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(3.dp),
                modifier = Modifier
                    .bouncyClick(scaleDown = 0.92f, onClick = onNavigateToBiblioteca)
                    .padding(4.dp)
            ) {
                Text(
                    text = "Ver todo",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2563EB)
                )
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = null,
                    tint = Color(0xFF2563EB),
                    modifier = Modifier.size(12.dp)
                )
            }
        }

        val listState = rememberLazyListState()
        val activeIndex by remember {
            derivedStateOf {
                val first = listState.firstVisibleItemIndex
                val offset = listState.firstVisibleItemScrollOffset
                if (offset > 200 && first + 1 < items.size) first + 1 else first
            }
        }

        // Carrusel horizontal
        LazyRow(
            state = listState,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(start = 4.dp, end = 12.dp, top = 2.dp, bottom = 2.dp)
        ) {
            items(items, key = { it.id }) { upload ->
                DestacadoCard(
                    upload = upload,
                    colors = colors,
                    onClick = {
                        if (upload.ownerUid.isNotBlank()) {
                            onNavigateToPublication(upload.ownerUid, upload.id)
                        } else {
                            onNavigateToBiblioteca()
                        }
                    }
                )
            }
        }

        // Indicadores de puntos (dots de paginación) reactivos al scroll
        if (items.isNotEmpty()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val dotCount = items.size.coerceAtMost(5)
                val currentDot = activeIndex.coerceIn(0, dotCount - 1)
                for (i in 0 until dotCount) {
                    val isActive = i == currentDot
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 2.5.dp)
                            .size(if (isActive) 7.5.dp else 5.5.dp)
                            .clip(CircleShape)
                            .background(if (isActive) colors.accent else colors.cardBevel)
                            .border(1.2.dp, if (isActive) colors.strokeBorder else colors.strokeBorder.copy(alpha = 0.5f), CircleShape)
                    )
                }
            }
        }
    }
}

@Composable
private fun DestacadoCard(
    upload: UserUpload,
    colors: RastroColors,
    onClick: () -> Unit
) {
    val driveId = remember(upload.url) { driveFileId(upload.url) }
    val candidateUrls = remember(upload.url, driveId, upload.previewUrls) {
        buildList {
            addAll(upload.previewUrls)
            if (driveId != null) {
                add("https://drive.google.com/thumbnail?id=$driveId&sz=w400")
                add("https://lh3.googleusercontent.com/d/$driveId=w400")
            }
            if (upload.url.isNotBlank() && (upload.isImage || upload.url.contains("firebasestorage"))) {
                add(upload.url)
            }
        }.distinct()
    }

    val cachedBitmap = remember(candidateUrls) {
        candidateUrls.firstNotNullOfOrNull { ImagePreviewCache.get(it) }
    }

    val bitmap by produceState<ImageBitmap?>(initialValue = cachedBitmap, candidateUrls) {
        if (value == null) {
            value = withContext(Dispatchers.IO) {
                var result: ImageBitmap? = null
                for (url in candidateUrls) {
                    result = fetchBitmapSafe(url)
                    if (result != null) break
                }
                result
            }
        }
    }

    Sticker3dCard(
        modifier = Modifier.width(215.dp),
        containerColor = colors.surface,
        strokeColor = colors.strokeBorder,
        bevelColor = colors.cardBevel,
        bevelHeight = 3.dp,
        shape = RoundedCornerShape(18.dp),
        onClick = onClick
    ) {
        Column {
            // Imagen de vista previa o placeholder con ícono (proporción más equilibrada)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(106.dp)
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .background(colors.surfaceAccent),
                contentAlignment = Alignment.Center
            ) {
                if (bitmap != null) {
                    Image(
                        bitmap = bitmap!!,
                        contentDescription = upload.title,
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.TopCenter,
                        modifier = Modifier.fillMaxSize()
                    )
                } else if (candidateUrls.isNotEmpty() && bitmap == null) {
                    val (iconVec, iconTint) = when {
                        upload.isPdf -> Pair(Icons.Outlined.CollectionsBookmark, Color(0xFFDC2626))
                        upload.isFolder -> Pair(Icons.Outlined.Layers, Color(0xFFD97706))
                        upload.isImage -> Pair(Icons.Outlined.Explore, Color(0xFF0284C7))
                        else -> Pair(Icons.AutoMirrored.Outlined.MenuBook, Color(0xFF059669))
                    }
                    Icon(
                        imageVector = iconVec,
                        contentDescription = null,
                        tint = iconTint,
                        modifier = Modifier.size(34.dp)
                    )
                } else {
                    val (iconVec, iconTint) = when {
                        upload.isPdf -> Pair(Icons.Outlined.CollectionsBookmark, Color(0xFFDC2626))
                        upload.isFolder -> Pair(Icons.Outlined.Layers, Color(0xFFD97706))
                        else -> Pair(Icons.AutoMirrored.Outlined.MenuBook, Color(0xFF059669))
                    }
                    Icon(
                        imageVector = iconVec,
                        contentDescription = null,
                        tint = iconTint,
                        modifier = Modifier.size(34.dp)
                    )
                }

                // Destello doodle en la esquina superior izquierda
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(6.dp)
                ) {
                    DoodleSparkle(
                        modifier = Modifier.size(15.dp),
                        strokeColor = colors.strokeBorder
                    )
                }

                // Badge estrella en la esquina superior derecha
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(6.dp)
                        .size(20.dp)
                        .clip(CircleShape)
                        .background(colors.surface)
                        .border(1.4.dp, colors.strokeBorder, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    DoodleStar(
                        modifier = Modifier.size(12.dp),
                        strokeColor = colors.strokeBorder,
                        strokeWidth = 1.3f
                    )
                }
            }

            // Info de la tarjeta
            Column(
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 9.dp),
                verticalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                val categoryText = upload.category.ifBlank { "MATERIAL" }
                Text(
                    text = categoryText.uppercase(),
                    fontSize = 8.5.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.textSecondary,
                    letterSpacing = 0.5.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = upload.title,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colors.textPrimary,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    lineHeight = 14.5.sp
                )
                Spacer(Modifier.height(1.dp))
                // Fila con foto del usuario, nombre y botón de flecha circular
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    CartoonAvatar(
                        photoUrl = upload.ownerPhotoUrl,
                        size = 19.dp,
                        strokeColor = colors.strokeBorder,
                        strokeWidth = 1.2.dp,
                        bevelColor = colors.cardBevel,
                        bevelOffset = 1.dp,
                        contentDescription = "Foto de ${upload.author}"
                    )
                    Text(
                        text = upload.author.ifBlank { "Estudiante RASTRO" },
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = colors.textSecondary,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                    Box(
                        modifier = Modifier
                            .size(19.dp)
                            .clip(CircleShape)
                            .background(colors.surface)
                            .border(1.2.dp, colors.strokeBorder, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            tint = colors.textPrimary,
                            modifier = Modifier.size(9.dp)
                        )
                    }
                }
            }
        }
    }
}

/**
 * Tarjeta horizontal compacta para la sección de herramientas de Explora RASTRO
 */
@Composable
private fun HomeToolCard(
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
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 56.dp),
        containerColor = colors.surface,
        strokeColor = colors.strokeBorder,
        bevelColor = colors.cardBevel,
        bevelHeight = 2.5.dp,
        shape = RoundedCornerShape(16.dp),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 7.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(iconBg)
                    .border(1.2.dp, colors.strokeBorder.copy(alpha = 0.45f), RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = iconTint,
                    modifier = Modifier.size(17.dp)
                )
            }

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    fontSize = 11.5.sp,
                    fontWeight = FontWeight.Black,
                    color = colors.textPrimary,
                    maxLines = 2,
                    lineHeight = 13.5.sp,
                    softWrap = true,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(1.dp))
                Text(
                    text = subtitle,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold,
                    color = subtitleColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = null,
                tint = iconTint,
                modifier = Modifier.size(12.dp)
            )
        }
    }
}

/**
 * Tarjeta de Inicio estilo Cartoon / Sticker 3D cuadrada (mantenida para retrocompatibilidad)
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
    HomeToolCard(
        title = title,
        subtitle = subtitle,
        subtitleColor = subtitleColor,
        icon = icon,
        iconBg = iconBg,
        iconTint = iconTint,
        colors = colors,
        modifier = modifier,
        onClick = onClick
    )
}

// ─────────────────────────────────────────────────────────────────
// ELEMENTOS GRÁFICOS DOODLE / CARTOON (CANVAS / PATH)
// ─────────────────────────────────────────────────────────────────

@Composable
private fun DoodleDayCheckCircle(
    isActive: Boolean,
    strokeColor: Color,
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier.size(19.dp)) {
        val r = size.minDimension / 2f
        val center = Offset(size.width / 2f, size.height / 2f)
        if (isActive) {
            drawCircle(color = Color(0xFFF97316), radius = r - 1f, center = center)
            drawCircle(color = strokeColor, radius = r - 1f, center = center, style = Stroke(1.5f))
            val path = Path().apply {
                moveTo(size.width * 0.28f, size.height * 0.52f)
                lineTo(size.width * 0.44f, size.height * 0.68f)
                lineTo(size.width * 0.72f, size.height * 0.36f)
            }
            drawPath(
                path = path,
                color = Color.White,
                style = Stroke(width = 2.2f, cap = StrokeCap.Round, join = StrokeJoin.Round)
            )
        } else {
            drawCircle(color = Color(0xFFE2E8F0), radius = r - 1f, center = center)
            drawCircle(color = strokeColor.copy(alpha = 0.35f), radius = r - 1f, center = center, style = Stroke(1.2f))
        }
    }
}

@Composable
private fun HomeHeroBanner(
    colors: RastroColors,
    displayName: String,
    modifier: Modifier = Modifier
) {
    // Hero con el banner oficial: saludo dinámico superpuesto a la izquierda
    // sobre velo lateral para legibilidad; la ilustración nunca se estira.
    val name = displayName.trim()
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(22.dp))
            .background(colors.surfaceAccent)
            .border(1.5.dp, colors.strokeBorder, RoundedCornerShape(22.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.banner_inicio),
            contentDescription = "Banner de inicio RASTRO",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1944f / 809f)
                .clip(RoundedCornerShape(22.dp)),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center
        )
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    androidx.compose.ui.graphics.Brush.horizontalGradient(
                        0.0f to colors.surface.copy(alpha = 0.82f),
                        0.55f to colors.surface.copy(alpha = 0.35f),
                        1.0f to colors.surface.copy(alpha = 0.0f)
                    )
                )
        )
        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .fillMaxWidth(0.64f)
                .padding(start = 16.dp, top = 12.dp, bottom = 12.dp, end = 4.dp),
            verticalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            Text(
                text = "¡Hola,",
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                color = colors.textSecondary,
                maxLines = 1
            )
            Text(
                text = name.ifBlank { "Estudiante Invitado" },
                fontSize = 21.sp,
                fontWeight = FontWeight.Black,
                color = colors.textPrimary,
                letterSpacing = (-0.3).sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun DoodleStar(
    modifier: Modifier = Modifier,
    fillColor: Color = Color(0xFFFBBF24),
    strokeColor: Color = Color(0xFF1E293B),
    strokeWidth: Float = 1.8f
) {
    Canvas(modifier = modifier) {
        val path = Path()
        val centerX = size.width / 2f
        val centerY = size.height / 2f
        val outerRadius = size.minDimension / 2f * 0.95f
        val innerRadius = outerRadius * 0.45f
        val numPoints = 5
        val angleStep = Math.PI / numPoints
        var angle = -Math.PI / 2.0

        for (i in 0 until (numPoints * 2)) {
            val r = if (i % 2 == 0) outerRadius else innerRadius
            val x = (centerX + r * Math.cos(angle)).toFloat()
            val y = (centerY + r * Math.sin(angle)).toFloat()
            if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
            angle += angleStep
        }
        path.close()

        drawPath(path = path, color = fillColor, style = Fill)
        drawPath(
            path = path,
            color = strokeColor,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round)
        )
    }
}

@Composable
private fun DoodleSparkle(
    modifier: Modifier = Modifier,
    color: Color = Color(0xFFFBBF24),
    strokeColor: Color = Color(0xFF1E293B)
) {
    Canvas(modifier = modifier) {
        val path = Path()
        val cx = size.width / 2f
        val cy = size.height / 2f
        val w = size.width / 2f
        val h = size.height / 2f

        path.moveTo(cx, cy - h)
        path.quadraticTo(cx, cy, cx + w, cy)
        path.quadraticTo(cx, cy, cx, cy + h)
        path.quadraticTo(cx, cy, cx - w, cy)
        path.quadraticTo(cx, cy, cx, cy - h)
        path.close()

        drawPath(path = path, color = color, style = Fill)
        drawPath(
            path = path,
            color = strokeColor,
            style = Stroke(width = 1.4f, cap = StrokeCap.Round, join = StrokeJoin.Round)
        )
    }
}


@Composable
private fun DoodleSmallCurve(
    modifier: Modifier = Modifier,
    color: Color = Color(0xFF1E293B)
) {
    Canvas(modifier = modifier) {
        val path = Path().apply {
            moveTo(size.width * 0.1f, size.height * 0.6f)
            quadraticTo(size.width * 0.5f, size.height * 0.95f, size.width * 0.9f, size.height * 0.35f)
        }
        drawPath(
            path = path,
            color = color,
            style = Stroke(width = 2.2f, cap = StrokeCap.Round)
        )
    }
}

@Composable
private fun DoodleGraduationCap(
    modifier: Modifier = Modifier,
    capColor: Color = Color(0xFF3B82F6),
    tasselColor: Color = Color(0xFFF59E0B),
    strokeColor: Color = Color(0xFF1E293B)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        // Casquete inferior
        val skullCapPath = Path().apply {
            moveTo(w * 0.28f, h * 0.50f)
            quadraticTo(w * 0.50f, h * 0.85f, w * 0.72f, h * 0.50f)
            lineTo(w * 0.70f, h * 0.65f)
            quadraticTo(w * 0.50f, h * 0.95f, w * 0.30f, h * 0.65f)
            close()
        }
        drawPath(skullCapPath, color = capColor.copy(alpha = 0.85f), style = Fill)
        drawPath(skullCapPath, color = strokeColor, style = Stroke(width = 1.8f, cap = StrokeCap.Round))

        // Rombo superior del birrete
        val diamondPath = Path().apply {
            moveTo(w * 0.50f, h * 0.15f)
            lineTo(w * 0.92f, h * 0.38f)
            lineTo(w * 0.50f, h * 0.60f)
            lineTo(w * 0.08f, h * 0.38f)
            close()
        }
        drawPath(diamondPath, color = capColor, style = Fill)
        drawPath(diamondPath, color = strokeColor, style = Stroke(width = 2f, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Botón central del birrete
        drawCircle(color = tasselColor, radius = w * 0.045f, center = Offset(w * 0.50f, h * 0.38f))
        drawCircle(color = strokeColor, radius = w * 0.045f, center = Offset(w * 0.50f, h * 0.38f), style = Stroke(1.3f))

        // Borla colgante
        val tasselPath = Path().apply {
            moveTo(w * 0.50f, h * 0.38f)
            quadraticTo(w * 0.75f, h * 0.40f, w * 0.86f, h * 0.65f)
        }
        drawPath(tasselPath, color = strokeColor, style = Stroke(width = 1.6f, cap = StrokeCap.Round))
        drawCircle(color = tasselColor, radius = w * 0.04f, center = Offset(w * 0.86f, h * 0.65f))
        drawCircle(color = strokeColor, radius = w * 0.04f, center = Offset(w * 0.86f, h * 0.65f), style = Stroke(1.2f))
    }
}

@Composable
private fun DoodleMapWithFlag(
    modifier: Modifier = Modifier,
    mapColor: Color = Color(0xFFFEF3C7),
    flagColor: Color = Color(0xFF2563EB),
    strokeColor: Color = Color(0xFF1E293B)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        // Mapa plegado en 3 caras
        val foldPath = Path().apply {
            moveTo(w * 0.10f, h * 0.40f)
            lineTo(w * 0.38f, h * 0.30f)
            lineTo(w * 0.64f, h * 0.40f)
            lineTo(w * 0.90f, h * 0.32f)
            lineTo(w * 0.88f, h * 0.88f)
            lineTo(w * 0.63f, h * 0.96f)
            lineTo(w * 0.37f, h * 0.86f)
            lineTo(w * 0.10f, h * 0.94f)
            close()
        }
        drawPath(foldPath, color = mapColor, style = Fill)
        drawPath(foldPath, color = strokeColor, style = Stroke(width = 1.8f, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Líneas interiores de pliegue
        drawLine(
            color = strokeColor,
            start = Offset(w * 0.38f, h * 0.30f),
            end = Offset(w * 0.37f, h * 0.86f),
            strokeWidth = 1.4f
        )
        drawLine(
            color = strokeColor,
            start = Offset(w * 0.64f, h * 0.40f),
            end = Offset(w * 0.63f, h * 0.96f),
            strokeWidth = 1.4f
        )

        // Trazo de ruta punteada
        val trailPath = Path().apply {
            moveTo(w * 0.20f, h * 0.70f)
            quadraticTo(w * 0.45f, h * 0.50f, w * 0.60f, h * 0.65f)
        }
        drawPath(
            trailPath,
            color = Color(0xFFF97316),
            style = Stroke(
                width = 1.8f,
                cap = StrokeCap.Round,
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(5f, 4f), 0f)
            )
        )

        // Mástil de la bandera
        val poleX = w * 0.60f
        drawLine(
            color = strokeColor,
            start = Offset(poleX, h * 0.65f),
            end = Offset(poleX, h * 0.10f),
            strokeWidth = 2f,
            cap = StrokeCap.Round
        )

        // Banderita triangular
        val flagPath = Path().apply {
            moveTo(poleX, h * 0.12f)
            lineTo(poleX + w * 0.26f, h * 0.22f)
            lineTo(poleX, h * 0.32f)
            close()
        }
        drawPath(flagPath, color = flagColor, style = Fill)
        drawPath(flagPath, color = strokeColor, style = Stroke(width = 1.6f, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Composable
private fun DoodleTrailWithStars(
    modifier: Modifier = Modifier,
    trailColor: Color = Color(0xFF94A3B8),
    strokeColor: Color = Color(0xFF1E293B)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        val path = Path().apply {
            moveTo(0f, h * 0.5f)
            cubicTo(w * 0.35f, h * 0.9f, w * 0.65f, h * 0.1f, w, h * 0.5f)
        }
        drawPath(
            path = path,
            color = trailColor,
            style = Stroke(
                width = 1.8f,
                cap = StrokeCap.Round,
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)
            )
        )
    }
}

@Composable
private fun DoodleGridIcon(
    modifier: Modifier = Modifier,
    boxColor: Color = Color(0xFF2563EB),
    strokeColor: Color = Color(0xFF1E293B)
) {
    Canvas(modifier = modifier) {
        val pad = size.width * 0.15f
        val boxSize = (size.width - pad) / 2f
        val radius = CornerRadius(4f, 4f)
        val positions = listOf(
            Offset(0f, 0f),
            Offset(boxSize + pad, 0f),
            Offset(0f, boxSize + pad),
            Offset(boxSize + pad, boxSize + pad)
        )
        for (pos in positions) {
            drawRoundRect(
                color = boxColor,
                topLeft = pos,
                size = Size(boxSize, boxSize),
                cornerRadius = radius
            )
            drawRoundRect(
                color = strokeColor,
                topLeft = pos,
                size = Size(boxSize, boxSize),
                cornerRadius = radius,
                style = Stroke(width = 1.5f)
            )
        }
    }
}

