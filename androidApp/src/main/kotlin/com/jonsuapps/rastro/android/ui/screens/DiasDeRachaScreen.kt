package com.jonsuapps.rastro.android.ui.screens

import android.content.Intent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.ThemeManager
import java.util.Calendar

/**
 * Pantalla oficial "Días de racha" de RASTRO.
 * Muestra el estado real de la racha del usuario, estadísticas, Orstty oficial
 * y un calendario perpetuo dinámico basado en actividad académica real.
 * CERO emojis, CERO destellos falsos ("//"), estética cartoon sticker 3D.
 */
@OptIn(androidx.compose.foundation.ExperimentalFoundationApi::class)
@Composable
fun DiasDeRachaScreen(
    onBack: () -> Unit,
    onNavigateToAprender: () -> Unit,
    startAtCalendar: Boolean = false
) {
    val calendarTarget = remember { BringIntoViewRequester() }
    LaunchedEffect(startAtCalendar) {
        if (startAtCalendar) {
            kotlinx.coroutines.delay(150)
            calendarTarget.bringIntoView()
        }
    }
    val theme = ThemeManager.currentTheme
    val streakState by GamificationManager.streakState.collectAsState()
    val context = LocalContext.current
    val todayString = GamificationManager.getLocalDayString()
    val remainingStudy = remember(streakState) { GamificationManager.remainingStudySecondsToday() }

    val isTodayProtected = remember(streakState, todayString, remainingStudy) {
        streakState.lastActiveDate == todayString ||
            remainingStudy == 0 ||
            todayString in streakState.activityDates
    }

    // Calendario: parte del mes y año REAL actual del sistema
    val initialCal = remember { Calendar.getInstance(java.util.TimeZone.getTimeZone("America/Lima")) }
    var viewingYear by remember { mutableIntStateOf(initialCal.get(Calendar.YEAR)) }
    var viewingMonth by remember { mutableIntStateOf(initialCal.get(Calendar.MONTH) + 1) } // 1 a 12

    // Scaffold already supplies status/navigation insets to this destination.
    BoxWithConstraints(Modifier.fillMaxSize().background(theme.background)) {
    val dense = maxHeight < 740.dp
    val needsScroll = maxHeight < 680.dp || androidx.compose.ui.platform.LocalDensity.current.fontScale > 1.25f
    Column(Modifier.fillMaxSize()) {
        // ── 1. HEADER LIMPIO [volver]  Días de racha  [compartir] ─────────
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Botón Volver
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(theme.surface)
                    .border(1.6.dp, theme.strokeBorder, RoundedCornerShape(14.dp))
                    .bouncyClick(scaleDown = 0.88f, onClick = onBack),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                    contentDescription = "Volver",
                    tint = theme.textPrimary,
                    modifier = Modifier.size(20.dp)
                )
            }

            Text(
                text = "Días de racha",
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                color = theme.textPrimary,
                letterSpacing = (-0.3).sp
            )

            // Botón Compartir
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(theme.surface)
                    .border(1.6.dp, theme.strokeBorder, RoundedCornerShape(14.dp))
                    .bouncyClick(scaleDown = 0.88f) {
                        val text = "¡Llevo una racha de ${streakState.currentStreak} ${if (streakState.currentStreak == 1) "día" else "días"} estudiando en RASTRO! 🚀 Prepárate para el examen UNSA."
                        val sendIntent = Intent(Intent.ACTION_SEND).apply {
                            putExtra(Intent.EXTRA_TEXT, text)
                            type = "text/plain"
                        }
                        context.startActivity(Intent.createChooser(sendIntent, "Compartir racha"))
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = "Compartir",
                    tint = theme.textPrimary,
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        // ── CONTENIDO PRINCIPAL SCROLLEABLE ───────────────────────────────
        Column(
            modifier = Modifier
                .fillMaxSize()
                .then(if (needsScroll) Modifier.verticalScroll(rememberScrollState()) else Modifier)
                .padding(horizontal = 16.dp, vertical = 4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Sticker3dCard(Modifier.fillMaxWidth(), containerColor = theme.surface,
                strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel, bevelHeight = 3.dp,
                shape = RoundedCornerShape(22.dp)) {
                Column(Modifier.fillMaxWidth().padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        PreparedAnimation("R-MEDIO", Modifier.size(88.dp), loop = true)
                        Column(Modifier.weight(1f)) {
                            Text("${streakState.currentStreak}", fontSize = 36.sp, lineHeight = 38.sp,
                                fontWeight = FontWeight.Black, color = Color(0xFFEA580C))
                            Text(if (streakState.currentStreak == 1) "día de racha" else "días de racha",
                                color = theme.textPrimary, fontWeight = FontWeight.Black, fontSize = 14.sp)
                        }
                        ClassicArtwork(ClassicAppearance.STREAK, Modifier.size(76.dp), speed = 2f)
                    }
                    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        if (isTodayProtected) StreakCheckVector(Modifier.size(24.dp), theme.strokeBorder)
                        else StreakTargetVector(Modifier.size(24.dp), theme.strokeBorder)
                        Column(Modifier.weight(1f)) {
                            Text(if (isTodayProtected) "¡Hoy ya cumpliste!" else "Tu siguiente paso es hoy",
                                color = if (isTodayProtected) theme.answerText(true) else theme.textPrimary,
                                fontSize = 13.sp, fontWeight = FontWeight.Bold)
                            Text(if (isTodayProtected) "Tu actividad de hoy ya está registrada." else
                                "Completa una lección o estudia ${(remainingStudy + 59) / 60} min más.",
                                color = theme.textSecondary, fontSize = 11.sp, lineHeight = 15.sp)
                        }
                        if (!isTodayProtected) androidx.compose.material3.TextButton(onClick = onNavigateToAprender) {
                            Text("Estudiar", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                        }
                    }
                    androidx.compose.material3.HorizontalDivider(color = theme.borderSubtle)
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("Mejor racha: ${streakState.bestStreak} d", color = theme.textSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        Text("Días registrados: ${streakState.activityDates.size}", color = theme.textSecondary, fontSize = 11.sp)
                    }
                }
            }

            // ── 5. CALENDARIO REAL DE RACHA (Dinámico, sin emojis) ─────────
            Box(Modifier.fillMaxWidth().bringIntoViewRequester(calendarTarget)) {
            StreakCalendarCard(
                viewingYear = viewingYear,
                viewingMonth = viewingMonth,
                dayHeight = if (dense) 30.dp else 34.dp,
                todayString = todayString,
                activityDates = streakState.activityDates,
                isTodayProtected = isTodayProtected,
                strokeColor = theme.strokeBorder,
                theme = theme,
                onPreviousMonth = {
                    if (viewingMonth == 1) {
                        viewingMonth = 12
                        viewingYear--
                    } else {
                        viewingMonth--
                    }
                },
                onNextMonth = {
                    if (viewingMonth == 12) {
                        viewingMonth = 1
                        viewingYear++
                    } else {
                        viewingMonth++
                    }
                }
            )
            }

            // ── 6. TARJETA "CADA DÍA CUENTA" ──────────────────────────────
            Sticker3dCard(
                modifier = Modifier.fillMaxWidth(),
                containerColor = theme.surface,
                strokeColor = theme.strokeBorder,
                bevelColor = theme.cardBevel,
                bevelHeight = 2.5.dp,
                shape = RoundedCornerShape(20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    StreakBookVector(
                        modifier = Modifier.size(32.dp),
                        strokeColor = theme.strokeBorder
                    )

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Cada día cuenta",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Black,
                            color = theme.textPrimary
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Estudia un poco cada día y acércate a tu meta.",
                            fontSize = 11.5.sp,
                            color = theme.textSecondary,
                            lineHeight = 16.sp
                        )
                    }
                }
            }

        }
    }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
// COMPONENTE: CALENDARIO DE RACHA PERPETUO DINÁMICO
// ─────────────────────────────────────────────────────────────────────────────

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun StreakCalendarCard(
    viewingYear: Int,
    viewingMonth: Int,
    dayHeight: androidx.compose.ui.unit.Dp,
    todayString: String,
    activityDates: Set<String>,
    isTodayProtected: Boolean,
    strokeColor: Color,
    theme: RastroPalette,
    onPreviousMonth: () -> Unit,
    onNextMonth: () -> Unit
) {
    val monthNames = remember {
        listOf(
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        )
    }
    val monthTitle = remember(viewingMonth, viewingYear) {
        "${monthNames.getOrElse(viewingMonth - 1) { "" }.replaceFirstChar { it.titlecase() }} $viewingYear"
    }

    // Cálculos dinámicos reales de días del mes, día de inicio y año bisiesto
    val daysData = remember(viewingYear, viewingMonth) {
        val cal = Calendar.getInstance(java.util.TimeZone.getTimeZone("America/Lima")).apply {
            set(Calendar.YEAR, viewingYear)
            set(Calendar.MONTH, viewingMonth - 1)
            set(Calendar.DAY_OF_MONTH, 1)
        }
        val daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH)
        val firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK) // Calendar.SUNDAY = 1, MONDAY = 2, etc.
        val startOffset = (firstDayOfWeek - Calendar.MONDAY + 7) % 7 // 0 para Domingo, 1 para Lunes

        val prevCal = (cal.clone() as Calendar).apply { add(Calendar.MONTH, -1) }
        val daysInPrevMonth = prevCal.getActualMaximum(Calendar.DAY_OF_MONTH)

        val totalCells = ((startOffset + daysInMonth + 6) / 7) * 7
        val rows = totalCells / 7

        Triple(startOffset, daysInMonth, daysInPrevMonth) to rows
    }

    val (metrics, numRows) = daysData
    val (startOffset, daysInMonth, daysInPrevMonth) = metrics
    val dayLabels = remember { listOf("L", "Ma", "Mi", "J", "V", "S", "D") }

    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        containerColor = theme.surface,
        strokeColor = strokeColor,
        bevelColor = theme.cardBevel,
        bevelHeight = 3.dp,
        shape = RoundedCornerShape(22.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            // El selector pasa a otra línea si no cabe junto al título.
            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(7.dp)
                ) {
                    StreakCalendarIcon(
                        modifier = Modifier.size(20.dp),
                        strokeColor = strokeColor
                    )
                    Text(
                        text = "Calendario de racha",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )
                }

                // Selector de mes interactivo < septiembre de 2026 >
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(theme.surfaceAccent)
                        .border(1.2.dp, strokeColor, RoundedCornerShape(12.dp))
                        .padding(horizontal = 4.dp, vertical = 2.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .bouncyClick(scaleDown = 0.85f, onClick = onPreviousMonth),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                                contentDescription = "Mes anterior",
                                tint = theme.textPrimary,
                                modifier = Modifier.size(18.dp)
                            )
                        }

                        Text(
                            text = monthTitle,
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Center,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = theme.textPrimary
                        )

                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .bouncyClick(scaleDown = 0.85f, onClick = onNextMonth),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                                contentDescription = "Mes siguiente",
                                tint = theme.textPrimary,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }
            }

            // Fila de encabezado de días (D L Ma Mi J V S)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                dayLabels.forEach { label ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .padding(vertical = 4.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = label,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Black,
                            color = theme.textMuted
                        )
                    }
                }
            }

            // Cuadrícula de días calculada dinámicamente
            Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                for (rowIndex in 0 until numRows) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        for (colIndex in 0 until 7) {
                            val cellIndex = rowIndex * 7 + colIndex
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(dayHeight)
                                    .padding(horizontal = 2.dp, vertical = 2.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                when {
                                    // Días del mes anterior
                                    cellIndex < startOffset -> {
                                        val dayNum = daysInPrevMonth - startOffset + 1 + cellIndex
                                        Text(
                                            text = "$dayNum",
                                            fontSize = 11.5.sp,
                                            fontWeight = FontWeight.Normal,
                                            color = theme.textMuted
                                        )
                                    }
                                    // Días del mes actual
                                    cellIndex < startOffset + daysInMonth -> {
                                        val dayNum = cellIndex - startOffset + 1
                                        val dateString = "$viewingYear-${viewingMonth.toString().padStart(2, '0')}-${dayNum.toString().padStart(2, '0')}"
                                        val isToday = dateString == todayString
                                        val isCompleted = dateString in activityDates || (isToday && isTodayProtected)
                                        val isFuture = dateString > todayString

                                        when {
                                            isCompleted -> {
                                                // Día completado: Fondo naranja/ámbar cálido + pequeña llama vectorial (NO emoji)
                                                Box(
                                                    modifier = Modifier
                                                        .fillMaxSize()
                                                        .clip(RoundedCornerShape(9.dp))
                                                        .background(Color(0xFFFED7AA))
                                                        .border(1.3.dp, Color(0xFFEA580C), RoundedCornerShape(9.dp)),
                                                    contentAlignment = Alignment.Center
                                                ) {
                                                    Row(
                                                        verticalAlignment = Alignment.CenterVertically,
                                                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                                                    ) {
                                                        Text(
                                                            text = "$dayNum",
                                                            fontSize = 11.5.sp,
                                                            fontWeight = FontWeight.Black,
                                                            color = Color(0xFF7C2D12)
                                                        )
                                                        PreparedAnimation("R-MINI", Modifier.size(22.dp), loop = true)
                                                    }
                                                }
                                            }
                                            isToday -> {
                                                // Día de hoy pero sin completar aún
                                                Box(
                                                    modifier = Modifier
                                                        .fillMaxSize()
                                                        .clip(RoundedCornerShape(9.dp))
                                                        .background(Color(0xFFFFF7ED))
                                                        .border(1.5.dp, Color(0xFFF97316), RoundedCornerShape(9.dp)),
                                                    contentAlignment = Alignment.Center
                                                ) {
                                                    Text(
                                                        text = "$dayNum",
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.Black,
                                                        color = Color(0xFFEA580C)
                                                    )
                                                }
                                            }
                                            isFuture -> {
                                                // Día futuro neutro
                                                Text(
                                                    text = "$dayNum",
                                                    fontSize = 11.5.sp,
                                                    fontWeight = FontWeight.Medium,
                                                    color = theme.textMuted
                                                )
                                            }
                                            else -> {
                                                // Día pasado sin actividad
                                                Text(
                                                    text = "$dayNum",
                                                    fontSize = 11.5.sp,
                                                    fontWeight = FontWeight.SemiBold,
                                                    color = theme.textSecondary
                                                )
                                            }
                                        }
                                    }
                                    // Días del mes siguiente
                                    else -> {
                                        val dayNum = cellIndex - (startOffset + daysInMonth) + 1
                                        Text(
                                            text = "$dayNum",
                                            fontSize = 11.5.sp,
                                            fontWeight = FontWeight.Normal,
                                            color = theme.textMuted
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
// RECURSOS VECTORIALES ESTILO RASTRO (SVG / Canvas, SIN EMOJIS, SIN CARAS)
// ─────────────────────────────────────────────────────────────────────────────

/**
 * Llama grande de celebración estilo Cartoon Sticker.
 * REGLA ESTRICTA: SIN CARA, SIN OJOS, SIN BOCA.
 */
@Composable
private fun StreakBigFlameVector(
    modifier: Modifier = Modifier,
    strokeColor: Color = Color(0xFF0F172A)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        // Trazo exterior de la llama
        val outerPath = Path().apply {
            moveTo(w * 0.50f, h * 0.04f)
            cubicTo(w * 0.58f, h * 0.22f, w * 0.88f, h * 0.38f, w * 0.88f, h * 0.65f)
            cubicTo(w * 0.88f, h * 0.86f, w * 0.72f, h * 0.98f, w * 0.50f, h * 0.98f)
            cubicTo(w * 0.28f, h * 0.98f, w * 0.12f, h * 0.86f, w * 0.12f, h * 0.65f)
            cubicTo(w * 0.12f, h * 0.46f, w * 0.26f, h * 0.30f, w * 0.38f, h * 0.20f)
            cubicTo(w * 0.36f, h * 0.32f, w * 0.44f, h * 0.42f, w * 0.48f, h * 0.34f)
            cubicTo(w * 0.52f, h * 0.24f, w * 0.46f, h * 0.14f, w * 0.50f, h * 0.04f)
            close()
        }

        // Relleno degradado cálido
        val outerGradient = Brush.verticalGradient(
            colors = listOf(Color(0xFFFBBF24), Color(0xFFF97316), Color(0xFFEA580C)),
            startY = 0f,
            endY = h
        )
        drawPath(path = outerPath, brush = outerGradient, style = Fill)
        drawPath(path = outerPath, color = strokeColor, style = Stroke(width = 3.5.dp.toPx()))

        // Núcleo interno dorado brillante
        val innerPath = Path().apply {
            moveTo(w * 0.50f, h * 0.48f)
            cubicTo(w * 0.62f, h * 0.58f, w * 0.70f, h * 0.70f, w * 0.66f, h * 0.84f)
            cubicTo(w * 0.62f, h * 0.92f, w * 0.56f, h * 0.94f, w * 0.50f, h * 0.94f)
            cubicTo(w * 0.44f, h * 0.94f, w * 0.38f, h * 0.92f, w * 0.34f, h * 0.84f)
            cubicTo(w * 0.30f, h * 0.70f, w * 0.40f, h * 0.58f, w * 0.50f, h * 0.48f)
            close()
        }
        drawPath(path = innerPath, color = Color(0xFFFEF08A), style = Fill)
    }
}

/**
 * Pequeña llama vectorial para las celdas del calendario.
 */
@Composable
private fun StreakMiniFlameVector(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val path = Path().apply {
            moveTo(w * 0.50f, 0f)
            cubicTo(w * 0.75f, h * 0.30f, w * 0.95f, h * 0.55f, w * 0.85f, h * 0.88f)
            cubicTo(w * 0.75f, h * 1.00f, w * 0.25f, h * 1.00f, w * 0.15f, h * 0.88f)
            cubicTo(w * 0.05f, h * 0.55f, w * 0.30f, h * 0.35f, w * 0.40f, h * 0.20f)
            close()
        }
        drawPath(path = path, color = Color(0xFFEA580C), style = Fill)
    }
}

/**
 * Icono de trofeo de oro con contorno dark para "Mejor racha".
 */
@Composable
private fun StreakTrophyVector(
    modifier: Modifier = Modifier,
    strokeColor: Color = Color(0xFF0F172A)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        // Copa central
        val cupPath = Path().apply {
            moveTo(w * 0.28f, h * 0.20f)
            lineTo(w * 0.72f, h * 0.20f)
            lineTo(w * 0.68f, h * 0.56f)
            cubicTo(w * 0.66f, h * 0.70f, w * 0.34f, h * 0.70f, w * 0.32f, h * 0.56f)
            close()
        }
        drawPath(path = cupPath, color = Color(0xFFFBBF24), style = Fill)
        drawPath(path = cupPath, color = strokeColor, style = Stroke(width = 2.dp.toPx()))

        // Asas laterales
        val leftHandle = Path().apply {
            moveTo(w * 0.28f, h * 0.26f)
            cubicTo(w * 0.12f, h * 0.26f, w * 0.12f, h * 0.50f, w * 0.32f, h * 0.50f)
        }
        drawPath(path = leftHandle, color = strokeColor, style = Stroke(width = 2.dp.toPx()))

        val rightHandle = Path().apply {
            moveTo(w * 0.72f, h * 0.26f)
            cubicTo(w * 0.88f, h * 0.26f, w * 0.88f, h * 0.50f, w * 0.68f, h * 0.50f)
        }
        drawPath(path = rightHandle, color = strokeColor, style = Stroke(width = 2.dp.toPx()))

        // Pedestal y Base
        drawLine(
            color = strokeColor,
            start = Offset(w * 0.50f, h * 0.68f),
            end = Offset(w * 0.50f, h * 0.82f),
            strokeWidth = 3.dp.toPx()
        )
        val basePath = Path().apply {
            addRoundRect(
                androidx.compose.ui.geometry.RoundRect(
                    left = w * 0.28f,
                    top = h * 0.82f,
                    right = w * 0.72f,
                    bottom = h * 0.94f,
                    radiusX = 4.dp.toPx(),
                    radiusY = 4.dp.toPx()
                )
            )
        }
        drawPath(path = basePath, color = Color(0xFFF59E0B), style = Fill)
        drawPath(path = basePath, color = strokeColor, style = Stroke(width = 2.dp.toPx()))
    }
}

/**
 * Gráfico de barras ascendente para "Racha actual".
 */
@Composable
private fun StreakBarChartVector(
    modifier: Modifier = Modifier,
    strokeColor: Color = Color(0xFF0F172A)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        // Barra 1 (baja)
        val bar1 = Path().apply {
            addRoundRect(
                androidx.compose.ui.geometry.RoundRect(
                    left = w * 0.14f,
                    top = h * 0.55f,
                    right = w * 0.34f,
                    bottom = h * 0.90f,
                    radiusX = 4.dp.toPx(),
                    radiusY = 4.dp.toPx()
                )
            )
        }
        drawPath(bar1, color = Color(0xFFC7D2FE), style = Fill)
        drawPath(bar1, color = strokeColor, style = Stroke(2.dp.toPx()))

        // Barra 2 (media)
        val bar2 = Path().apply {
            addRoundRect(
                androidx.compose.ui.geometry.RoundRect(
                    left = w * 0.40f,
                    top = h * 0.35f,
                    right = w * 0.60f,
                    bottom = h * 0.90f,
                    radiusX = 4.dp.toPx(),
                    radiusY = 4.dp.toPx()
                )
            )
        }
        drawPath(bar2, color = Color(0xFF818CF8), style = Fill)
        drawPath(bar2, color = strokeColor, style = Stroke(2.dp.toPx()))

        // Barra 3 (alta)
        val bar3 = Path().apply {
            addRoundRect(
                androidx.compose.ui.geometry.RoundRect(
                    left = w * 0.66f,
                    top = h * 0.15f,
                    right = w * 0.86f,
                    bottom = h * 0.90f,
                    radiusX = 4.dp.toPx(),
                    radiusY = 4.dp.toPx()
                )
            )
        }
        drawPath(bar3, color = Color(0xFF4F46E5), style = Fill)
        drawPath(bar3, color = strokeColor, style = Stroke(2.dp.toPx()))
    }
}

/**
 * Diana / Objetivo con dardo para "Mantén viva tu racha".
 */
@Composable
private fun StreakTargetVector(
    modifier: Modifier = Modifier,
    strokeColor: Color = Color(0xFF0F172A)
) {
    Canvas(modifier = modifier) {
        val center = Offset(size.width * 0.46f, size.height * 0.52f)
        val radius = size.minDimension * 0.40f

        // Anillo exterior rojo
        drawCircle(color = Color(0xFFEF4444), radius = radius, center = center)
        drawCircle(color = strokeColor, radius = radius, center = center, style = Stroke(2.dp.toPx()))

        // Anillo medio blanco
        drawCircle(color = Color.White, radius = radius * 0.66f, center = center)
        drawCircle(color = strokeColor, radius = radius * 0.66f, center = center, style = Stroke(1.5.dp.toPx()))

        // Centro rojo
        drawCircle(color = Color(0xFFDC2626), radius = radius * 0.33f, center = center)
        drawCircle(color = strokeColor, radius = radius * 0.33f, center = center, style = Stroke(1.2.dp.toPx()))

        // Flecha / Dardo
        val dartPath = Path().apply {
            moveTo(center.x, center.y)
            lineTo(size.width * 0.88f, size.height * 0.14f)
        }
        drawPath(dartPath, color = strokeColor, style = Stroke(2.5.dp.toPx()))
    }
}

/**
 * Check verde esmeralda para "Racha protegida por hoy".
 */
@Composable
private fun StreakCheckVector(
    modifier: Modifier = Modifier,
    strokeColor: Color = Color(0xFF0F172A)
) {
    Canvas(modifier = modifier) {
        val center = Offset(size.width / 2, size.height / 2)
        val radius = size.minDimension * 0.44f

        drawCircle(color = Color(0xFF22C55E), radius = radius, center = center)
        drawCircle(color = strokeColor, radius = radius, center = center, style = Stroke(2.dp.toPx()))

        // Checkmark blanco
        val checkPath = Path().apply {
            moveTo(size.width * 0.32f, size.height * 0.50f)
            lineTo(size.width * 0.46f, size.height * 0.65f)
            lineTo(size.width * 0.70f, size.height * 0.36f)
        }
        drawPath(checkPath, color = Color.White, style = Stroke(3.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

/**
 * Icono de Libro abierto para "Cada día cuenta".
 */
@Composable
private fun StreakBookVector(
    modifier: Modifier = Modifier,
    strokeColor: Color = Color(0xFF0F172A)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        val bookPath = Path().apply {
            moveTo(w * 0.50f, h * 0.80f)
            cubicTo(w * 0.32f, h * 0.75f, w * 0.14f, h * 0.82f, w * 0.10f, h * 0.82f)
            lineTo(w * 0.10f, h * 0.28f)
            cubicTo(w * 0.20f, h * 0.28f, w * 0.38f, h * 0.22f, w * 0.50f, h * 0.30f)
            cubicTo(w * 0.62f, h * 0.22f, w * 0.80f, h * 0.28f, w * 0.90f, h * 0.28f)
            lineTo(w * 0.90f, h * 0.82f)
            cubicTo(w * 0.86f, h * 0.82f, w * 0.68f, h * 0.75f, w * 0.50f, h * 0.80f)
            close()
        }
        drawPath(path = bookPath, color = Color(0xFFE0F2FE), style = Fill)
        drawPath(path = bookPath, color = strokeColor, style = Stroke(width = 2.2.dp.toPx()))

        // Lomo central
        drawLine(
            color = strokeColor,
            start = Offset(w * 0.50f, h * 0.30f),
            end = Offset(w * 0.50f, h * 0.80f),
            strokeWidth = 2.dp.toPx()
        )
    }
}

/**
 * Icono de calendario squircle para la tarjeta de calendario.
 */
@Composable
private fun StreakCalendarIcon(
    modifier: Modifier = Modifier,
    strokeColor: Color = Color(0xFF0F172A)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        val body = Path().apply {
            addRoundRect(
                androidx.compose.ui.geometry.RoundRect(
                    left = w * 0.10f,
                    top = h * 0.20f,
                    right = w * 0.90f,
                    bottom = h * 0.92f,
                    radiusX = 4.dp.toPx(),
                    radiusY = 4.dp.toPx()
                )
            )
        }
        drawPath(body, color = Color.White, style = Fill)
        drawPath(body, color = strokeColor, style = Stroke(1.8.dp.toPx()))

        // Franja superior colorida
        val topBanner = Path().apply {
            moveTo(w * 0.10f, h * 0.40f)
            lineTo(w * 0.90f, h * 0.40f)
            lineTo(w * 0.90f, h * 0.20f)
            lineTo(w * 0.10f, h * 0.20f)
            close()
        }
        drawPath(topBanner, color = Color(0xFF2DD4BF), style = Fill)
        drawLine(strokeColor, Offset(w * 0.10f, h * 0.40f), Offset(w * 0.90f, h * 0.40f), 1.8.dp.toPx())

        // Anillas superiores
        drawLine(strokeColor, Offset(w * 0.32f, h * 0.10f), Offset(w * 0.32f, h * 0.24f), 2.dp.toPx(), cap = StrokeCap.Round)
        drawLine(strokeColor, Offset(w * 0.68f, h * 0.10f), Offset(w * 0.68f, h * 0.24f), 2.dp.toPx(), cap = StrokeCap.Round)

        // Puntos de fechas interiores
        drawCircle(Color(0xFFEA580C), 1.5.dp.toPx(), Offset(w * 0.34f, h * 0.60f))
        drawCircle(Color(0xFFEA580C), 1.5.dp.toPx(), Offset(w * 0.50f, h * 0.60f))
        drawCircle(Color(0xFFEA580C), 1.5.dp.toPx(), Offset(w * 0.66f, h * 0.60f))
        drawCircle(Color(0xFFEA580C), 1.5.dp.toPx(), Offset(w * 0.34f, h * 0.76f))
        drawCircle(Color(0xFFEA580C), 1.5.dp.toPx(), Offset(w * 0.50f, h * 0.76f))
    }
}
