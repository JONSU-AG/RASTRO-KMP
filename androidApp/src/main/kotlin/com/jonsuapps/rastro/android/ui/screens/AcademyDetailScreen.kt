package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.data.CourseLesson
import com.jonsuapps.rastro.data.CursosRepository
import com.jonsuapps.rastro.data.PlaylistLessonStatus
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

/**
 * AcademyDetailScreen: Pantalla de consumo de Playlist en Cursos (Captura 4).
 *
 * Características clave:
 * - Header: ← Título del curso (ej. "Física desde cero") + contador "4/15".
 * - Reproductor de YouTube integrado.
 * - Debajo del video: Título de la clase ("Cinemática"), subtítulo ("Semana 2 · Lección 4"),
 *   y bookmark clásico (outline = no guardado, filled = guardado). Sin botones invasivos.
 * - Recursos de la clase (opcionales y condicionales):
 *   [ Preguntas del tema ] y [ Resumen PDF ]. Si no existen, la sección no se muestra.
 * - Lista de clases numerada con estados (✓ completada, ▶ actual, ○ disponible, 🔒 bloqueada)
 *   y duración. La clase actual usa fondo azul muy claro, borde azul y texto azul.
 * - Navegación final: [ ← Anterior ] y [ Siguiente → ] con bisel 3D RASTRO.
 */
@Composable
fun AcademyDetailScreen(
    courseId: String,
    colors: RastroPalette = ThemeManager.currentTheme,
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val theme = colors
    val playlist = remember(courseId) {
        CursosRepository.playlists.firstOrNull { it.id == courseId }
            ?: CursosRepository.playlists.first()
    }

    // Lecciones efectivas (si la playlist no tiene lecciones explícitas, generamos el temario oficial)
    val lessons = remember(playlist) {
        if (playlist.lessons.isNotEmpty()) {
            playlist.lessons
        } else {
            List(playlist.videoCount.coerceAtLeast(15)) { idx ->
                val num = idx + 1
                val isDone = num < 4
                val isCur = num == 4
                val isLock = num > 4
                val status = when {
                    isDone -> PlaylistLessonStatus.COMPLETED
                    isCur -> PlaylistLessonStatus.CURRENT
                    isLock -> PlaylistLessonStatus.LOCKED
                    else -> PlaylistLessonStatus.AVAILABLE
                }
                CourseLesson(
                    id = "${playlist.id}_c$num",
                    number = num,
                    title = when (num) {
                        1 -> "Vectores"
                        2 -> "Análisis dimensional"
                        3 -> "Descomposición rectangular"
                        4 -> "Cinemática"
                        5 -> "Movimiento Rectilíneo Uniforme"
                        6 -> "MRUV"
                        7 -> "Caída libre"
                        else -> "Tema ${num}: Fundamentos y Problemas"
                    },
                    semana = if (num <= 2) "Semana 1" else if (num <= 6) "Semana 2" else "Semana 3",
                    duration = when (num % 5) {
                        0 -> "28:15"
                        1 -> "35:42"
                        2 -> "32:10"
                        3 -> "45:10"
                        else -> "41:05"
                    },
                    status = status,
                    hasQuestions = (num == 4 || num == 1),
                    pdfUrl = if (num == 4 || num == 3) "pdf_ref" else null
                )
            }
        }
    }

    // Índice de la clase actualmente seleccionada para reproducir
    var currentClassIndex by remember(playlist) {
        mutableIntStateOf(
            lessons.indexOfFirst { it.status == PlaylistLessonStatus.CURRENT }
                .coerceAtLeast(3) // Clase 4 por defecto como en la captura
                .coerceIn(0, lessons.lastIndex.coerceAtLeast(0))
        )
    }

    // Bookmark clásico (guardado/favorito)
    var isBookmarked by remember(courseId) { mutableStateOf(false) }

    val currentLesson = lessons.getOrNull(currentClassIndex)

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF8FAFC)), // Fondo blanco/gris muy claro
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 1. Cabecera Superior: ← [Título]                        4/15
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier
                            .size(38.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                            .border(1.dp, Color(0xFFE2E8F0), CircleShape)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                            contentDescription = "Volver a Cursos",
                            tint = Color(0xFF0F172A),
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = playlist.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF0F172A),
                        maxLines = 1
                    )
                }

                Text(
                    text = "${currentClassIndex + 1}/${lessons.size}",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF475569)
                )
            }
        }

        // 2. Reproductor de YouTube Integrado
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(215.dp),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, Color(0xFFE2E8F0))
            ) {
                YouTubePlaylistWebView(playlistId = playlist.playlistId)
            }
        }

        // 3. Info de la Clase Actual + Bookmark clásico (outline / filled)
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = currentLesson?.title ?: "Cinemática",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF0F172A)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "${currentLesson?.semana ?: "Semana 2"} · Lección ${currentClassIndex + 1}",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color(0xFF64748B),
                        fontWeight = FontWeight.Medium
                    )
                }

                // Bookmark clásico: outline si no guardado, filled si guardado
                IconButton(
                    onClick = { isBookmarked = !isBookmarked },
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(if (isBookmarked) Color(0xFFEFF6FF) else Color.White)
                        .border(1.dp, if (isBookmarked) Color(0xFF93C5FD) else Color(0xFFE2E8F0), CircleShape)
                ) {
                    Icon(
                        imageVector = if (isBookmarked) Icons.Rounded.Bookmark else Icons.Rounded.BookmarkBorder,
                        contentDescription = if (isBookmarked) "Guardado" else "Guardar clase",
                        tint = if (isBookmarked) Color(0xFF0284C7) else Color(0xFF64748B),
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }

        // 4. Recursos de la Clase (Opcionales y Condicionales)
        val hasQuestions = currentLesson?.hasQuestions == true
        val hasPdf = !currentLesson?.pdfUrl.isNullOrBlank()

        if (hasQuestions || hasPdf) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    if (hasQuestions) {
                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .clickable { /* Ir a preguntas del tema */ },
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0))
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Rounded.Psychology,
                                        contentDescription = null,
                                        tint = Color(0xFF8B5CF6), // Púrpura cerebro
                                        modifier = Modifier.size(28.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Column {
                                        Text(
                                            text = "Preguntas\ndel tema",
                                            style = MaterialTheme.typography.labelMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = Color(0xFF0F172A),
                                            lineHeight = 14.sp
                                        )
                                        Text(
                                            text = "Practica lo aprendido",
                                            style = MaterialTheme.typography.labelSmall,
                                            color = Color(0xFF64748B),
                                            fontSize = 9.sp
                                        )
                                    }
                                }
                                Icon(
                                    imageVector = Icons.Rounded.ChevronRight,
                                    contentDescription = null,
                                    tint = Color(0xFF94A3B8),
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }

                    if (hasPdf) {
                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .clickable { /* Abrir PDF del tema */ },
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0))
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Rounded.PictureAsPdf,
                                        contentDescription = null,
                                        tint = Color(0xFFEF4444), // Rojo PDF
                                        modifier = Modifier.size(28.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Column {
                                        Text(
                                            text = "Resumen PDF",
                                            style = MaterialTheme.typography.labelMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = Color(0xFF0F172A)
                                        )
                                        Text(
                                            text = "Material de\nestudio",
                                            style = MaterialTheme.typography.labelSmall,
                                            color = Color(0xFF64748B),
                                            fontSize = 9.sp,
                                            lineHeight = 11.sp
                                        )
                                    }
                                }
                                Icon(
                                    imageVector = Icons.Rounded.ChevronRight,
                                    contentDescription = null,
                                    tint = Color(0xFF94A3B8),
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        // 5. Encabezado de Lista de Clases: Lista de clases (15)
        item {
            Text(
                text = "Lista de clases (${lessons.size})",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0F172A)
            )
        }

        // 6. Filas de Clases
        itemsIndexed(lessons) { index, lesson ->
            val isSelected = index == currentClassIndex

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { currentClassIndex = index },
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isSelected) Color(0xFFEFF6FF) else Color.White
                ),
                border = androidx.compose.foundation.BorderStroke(
                    width = if (isSelected) 1.5.dp else 1.dp,
                    color = if (isSelected) Color(0xFF3B82F6) else Color(0xFFE2E8F0)
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Icono de Estado (✓ completada, ▶ actual, ○ disponible, 🔒 bloqueada)
                    Box(
                        modifier = Modifier.size(24.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        when {
                            isSelected -> {
                                Box(
                                    modifier = Modifier
                                        .size(24.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF0284C7)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.PlayArrow,
                                        contentDescription = "Actual",
                                        tint = Color.White,
                                        modifier = Modifier.size(15.dp)
                                    )
                                }
                            }
                            lesson.status == PlaylistLessonStatus.COMPLETED -> {
                                Icon(
                                    imageVector = Icons.Rounded.Check,
                                    contentDescription = "Completada",
                                    tint = Color(0xFF22C55E), // Verde check
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                            lesson.status == PlaylistLessonStatus.LOCKED -> {
                                Icon(
                                    imageVector = Icons.Rounded.Lock,
                                    contentDescription = "Bloqueada",
                                    tint = Color(0xFF94A3B8), // Candado gris
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                            else -> {
                                Icon(
                                    imageVector = Icons.Rounded.RadioButtonUnchecked,
                                    contentDescription = "Disponible",
                                    tint = Color(0xFF94A3B8),
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    // Número de Clase
                    Text(
                        text = "${lesson.number}",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        color = if (isSelected) Color(0xFF1D4ED8) else Color(0xFF64748B),
                        modifier = Modifier.width(20.dp)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    // Título y Semana de la Clase
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = lesson.title,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                            color = if (isSelected) Color(0xFF1D4ED8) else Color(0xFF0F172A),
                            maxLines = 1
                        )
                        Text(
                            text = lesson.semana,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFF64748B)
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    // Botón rojo YouTube
                    Box(
                        modifier = Modifier
                            .width(26.dp)
                            .height(18.dp)
                            .clip(RoundedCornerShape(4.dp))
                            .background(Color(0xFFEF4444)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Duración
                    Text(
                        text = lesson.duration,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF64748B)
                    )
                }
            }
        }

        // 7. Botones de Navegación: [ ← Anterior ]       [ Siguiente → ]
        item {
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Anterior (Claro con borde)
                OutlinedButton(
                    onClick = {
                        if (currentClassIndex > 0) currentClassIndex--
                    },
                    enabled = currentClassIndex > 0,
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.White,
                        contentColor = Color(0xFF0F172A)
                    ),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFCBD5E1))
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Anterior",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                // Siguiente (Azul con profundidad inferior RASTRO)
                com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                    onClick = {
                        if (currentClassIndex < lessons.lastIndex) currentClassIndex++
                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    containerColor = Color(0xFF1D84FE),
                    bottomBevelColor = Color(0xFF145CB5),
                    strokeColor = Color(0xFF145CB5).copy(alpha = 0.5f),
                    shape = RoundedCornerShape(14.dp),
                    contentPadding = PaddingValues(vertical = 10.dp)
                ) {
                    Text(
                        text = "Siguiente",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Icon(
                        imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }
}
