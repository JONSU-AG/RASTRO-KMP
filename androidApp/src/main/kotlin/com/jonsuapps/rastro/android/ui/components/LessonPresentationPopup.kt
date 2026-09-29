package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Extension
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Schedule
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

/**
 * LessonPresentationPopup: Popup modal oficial al tocar un nivel en Aprender (Captura 1).
 *
 * Características clave:
 * - El mapa queda visible de fondo, oscurecido.
 * - Fondo blanco puro con bordes muy redondeados (28.dp).
 * - Zona visual con el PNG original de ORSTTY (Mascots.kt) + doodle SVG de libros/plantas.
 * - Subtema pill lila ("Subtema 1.1").
 * - Título grande navy.
 * - Tarjeta suave con retos interactivos y tiempo estimado.
 * - Sección "Aprenderás:" con checks verdes.
 * - Banner suave amarillo "+25 XP Recompensa de expedición".
 * - Botón azul RASTRO con bisel 3D "▶ COMENZAR LECCIÓN".
 */
@Composable
fun LessonPresentationPopup(
    lesson: LessonNode,
    onDismiss: () -> Unit,
    onStartLesson: () -> Unit,
    modifier: Modifier = Modifier,
    theme: RastroPalette = ThemeManager.currentTheme
) {
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            dismissOnBackPress = true,
            dismissOnClickOutside = true
        )
    ) {
        // Fondo oscurecido con mapa visible detrás
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.55f))
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = onDismiss
                ),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = modifier
                    .fillMaxWidth(0.92f)
                    .widthIn(max = 420.dp)
                    .wrapContentHeight()
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                        onClick = { /* Evitar que el clic en la tarjeta cierre el popup */ }
                    ),
                shape = RoundedCornerShape(28.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, Color(0xFFE2E8F0)),
                elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp, vertical = 20.dp)
                ) {
                    // Header Superior: "MATERIA · SEMANA X" y Botón Cerrar (X)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${lesson.theory.asignatura.uppercase()} · SEMANA ${lesson.semana}",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Black,
                            color = Color(0xFF0284C7), // Azul cielo vivo
                            letterSpacing = 0.8.sp
                        )

                        IconButton(
                            onClick = onDismiss,
                            modifier = Modifier
                                .size(32.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFF1F5F9))
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Close,
                                contentDescription = "Cerrar",
                                tint = Color(0xFF64748B),
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // ZONA VISUAL: PNG de Orstty (Arte Original) + Ilustración SVG Doodle de libros y plantas
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // PNG Existente de Orstty con animación física de flotación
                            OrsttyMascot(
                                size = 88.dp,
                                mood = MascotMood.CHEERING,
                                modifier = Modifier.padding(end = 8.dp)
                            )

                            // Ilustración académica SVG estilizada según la materia/tema de la lección
                            val conceptKey = "${lesson.subjectId} ${lesson.title} ${lesson.subtema}"
                            AcademicIllustration(
                                concept = conceptKey,
                                size = 96.dp,
                                modifier = Modifier.padding(start = 4.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Pill del Subtema (Lila suave)
                    val subtemaFormatted = if (lesson.subtema.isNotBlank() && !lesson.subtema.startsWith("Semana", ignoreCase = true)) {
                        lesson.subtema
                    } else {
                        "Subtema ${lesson.semana}.1"
                    }

                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.Pill)
                            .background(Color(0xFFEDE9FE))
                            .padding(horizontal = 14.dp, vertical = 5.dp)
                    ) {
                        Text(
                            text = subtemaFormatted,
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF7C3AED)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Título Grande Navy
                    Text(
                        text = lesson.theory.titulo.ifBlank { lesson.title },
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF0F172A),
                        lineHeight = 27.sp
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // Tarjeta Suave de Retos y Tiempo
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        color = Color(0xFFF8FAFC),
                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0))
                    ) {
                        Column(
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Rounded.Extension,
                                    contentDescription = null,
                                    tint = Color(0xFF3B82F6),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                val retosCount = lesson.challenges.size.coerceAtLeast(1)
                                Text(
                                    text = "$retosCount reto${if (retosCount > 1) "s" else ""} interactivo${if (retosCount > 1) "s" else ""}",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color(0xFF1E293B)
                                )
                            }

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Rounded.Schedule,
                                    contentDescription = null,
                                    tint = Color(0xFF64748B),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "Tiempo estimado: 10 min",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Color(0xFF475569)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Sección "Aprenderás:" con checks verdes
                    Text(
                        text = "Aprenderás:",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF0284C7)
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    val learningPoints = remember(lesson.id) {
                        lesson.getEffectiveLearningObjectives()
                    }

                    Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                        learningPoints.forEach { point ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.Check,
                                    contentDescription = null,
                                    tint = Color(0xFF22C55E), // Verde check
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = point,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color(0xFF334155),
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Banner Amarillo Dorado: Recompensa de Expedición (+25 XP)
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        color = Color(0xFFFEF3C7), // Amarillo dorado suave
                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFFDE68A))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "⚡ +25 XP",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Black,
                                    color = Color(0xFFD97706)
                                )
                            }
                            Text(
                                text = "Recompensa de expedición",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color(0xFFB45309),
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Botón Azul RASTRO con bisel 3D inferior: "▶ COMENZAR LECCIÓN"
                    Sticker3dButton(
                        onClick = onStartLesson,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp),
                        containerColor = Color(0xFF1D84FE), // Azul RASTRO
                        bottomBevelColor = Color(0xFF145CB5), // Bisel 3D inferior azul oscuro
                        strokeColor = Color(0xFF145CB5).copy(alpha = 0.5f),
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(vertical = 12.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "COMENZAR LECCIÓN",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Black,
                            color = Color.White,
                            letterSpacing = 0.5.sp
                        )
                    }
                }
            }
        }
    }
}
