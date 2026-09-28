package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.automirrored.rounded.FormatListBulleted
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.ui.components.DualMascotDuo
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dPill
import com.jonsuapps.rastro.android.ui.components.Sticker3dCircleButton
import androidx.compose.material.icons.rounded.Bolt
import androidx.compose.material.icons.rounded.RocketLaunch

/**
 * Ruta de aprendizaje por temas con progreso real y recursos originales de Rastro.
 */
@Composable
fun AprenderScreen(
    onNavigateToSubjectDetail: (String) -> Unit,
    onNavigateToLesson: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val progression by GamificationManager.state.collectAsState()
    val streakState by GamificationManager.streakState.collectAsState()
    val dailyHearts by GamificationManager.hearts.collectAsState()
    val totalXp by GamificationManager.totalXp.collectAsState()

    var selectedSubjectId by rememberSaveable { mutableStateOf("biologia") }
    val subjects = remember { AprenderRepository.subjects }
    val subjectListState = rememberLazyListState()
    LaunchedEffect(selectedSubjectId) {
        subjectListState.animateScrollToItem(subjects.indexOfFirst { it.id == selectedSubjectId }.coerceAtLeast(0))
    }
    val currentSubject = remember(selectedSubjectId) {
        AprenderRepository.getSubjectById(selectedSubjectId) ?: subjects.first()
    }
    val currentLessons = remember(progression, selectedSubjectId) {
        progression.learningPath(selectedSubjectId)
    }
    val trailListState = rememberLazyListState()
    val journeyFrom by GamificationManager.journeyFrom.collectAsState()
    LaunchedEffect(journeyFrom) {
        val from = journeyFrom ?: return@LaunchedEffect
        val completed = AprenderRepository.getLessonById(from) ?: return@LaunchedEffect
        selectedSubjectId = completed.subjectId
    }
    val topicGroups = currentLessons.groupBy { it.semana }.entries.toList()
    var selectedTopic by rememberSaveable(selectedSubjectId) { mutableStateOf<Int?>(null) }
    val completedCount = currentLessons.count { it.isCompleted }
    val courseProgress = if (currentLessons.isEmpty()) 0f else completedCount.toFloat() / currentLessons.size
    LaunchedEffect(journeyFrom, selectedSubjectId) {
        val from = journeyFrom ?: return@LaunchedEffect
        if (AprenderRepository.getLessonById(from)?.subjectId != selectedSubjectId) return@LaunchedEffect
        selectedTopic = null
        withFrameNanos { }
        val target = currentLessons.firstOrNull { it.isCurrent }
        val topicIndex = topicGroups.indexOfFirst { it.key == (target?.semana ?: currentLessons.lastOrNull()?.semana) }
        if (topicIndex >= 0) trailListState.scrollToItem(4 + topicIndex * 3)
        kotlinx.coroutines.delay(2200)
        GamificationManager.finishJourney(from)
    }
    var showGuide by remember { mutableStateOf(false) }
    var showCourseFlashcards by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            state = trailListState,
            modifier = Modifier
                .fillMaxSize()
                .widthIn(max = 760.dp)
                .padding(horizontal = 16.dp),
            contentPadding = PaddingValues(top = 10.dp, bottom = 100.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // 1. Barra de Estado de Gamificación: [🔥 5d] [✨ Nv.8 (735 XP)] [❤️ 100] [💡 Truquitos]
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Racha
                    Surface(
                        shape = RastroShapes.CircularPill,
                        color = Color(0xFFFEE2E2),
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder),
                        modifier = Modifier.weight(1f)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.LocalFireDepartment,
                                contentDescription = null,
                                tint = Color(0xFFDC2626),
                                modifier = Modifier.size(15.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "${streakState.currentStreak}d",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Black,
                                color = Color(0xFFDC2626)
                            )
                        }
                    }

                    // Nivel y XP
                    Surface(
                        shape = RastroShapes.CircularPill,
                        color = Color(0xFFFEF3C7),
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder),
                        modifier = Modifier.weight(1.3f)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.AutoAwesome,
                                contentDescription = null,
                                tint = Color(0xFFD97706),
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Nv.${totalXp / 100 + 1} ($totalXp XP)",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black,
                                color = Color(0xFFB45309),
                                maxLines = 1
                            )
                        }
                    }

                    // Vidas (Corazones)
                    Surface(
                        shape = RastroShapes.CircularPill,
                        color = Color(0xFFFCE7F3),
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder),
                        modifier = Modifier.weight(1f)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Favorite,
                                contentDescription = null,
                                tint = Color(0xFFE11D48),
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "$dailyHearts",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Black,
                                color = Color(0xFFBE123C)
                            )
                        }
                    }

                    // Truquitos
                    Surface(
                        shape = RastroShapes.CircularPill,
                        color = Color(0xFFCCFBF1),
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder),
                        modifier = Modifier.weight(1.2f)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Lightbulb,
                                contentDescription = null,
                                tint = Color(0xFF0F766E),
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Truquitos",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF0F766E)
                            )
                        }
                    }
                }
            }

            // 2. Carrusel Horizontal de Asignaturas: < [ Biología 🟡 ] [ ⚡ Física ] >
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val currentSubjectIndex = subjects.indexOfFirst { it.id == selectedSubjectId }
                    Sticker3dCircleButton(
                        onClick = {
                            if (currentSubjectIndex > 0) selectedSubjectId = subjects[currentSubjectIndex - 1].id
                        },
                        size = 36.dp,
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        bevelHeight = 2.dp,
                        enabled = currentSubjectIndex > 0
                    ) {
                        Icon(
                            imageVector = Icons.Default.ChevronLeft,
                            contentDescription = "Anterior",
                            tint = if (currentSubjectIndex > 0) theme.textPrimary else theme.textSecondary.copy(alpha = 0.35f),
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    LazyRow(
                        state = subjectListState,
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        contentPadding = PaddingValues(horizontal = 4.dp)
                    ) {
                        items(subjects) { subject ->
                            val isSelected = subject.id == selectedSubjectId
                            Sticker3dPill(
                                selected = isSelected,
                                onClick = { selectedSubjectId = subject.id },
                                selectedColor = Color(0xFFEA580C),
                                unselectedColor = theme.surface,
                                selectedBevel = Color(0xFF9A3412),
                                unselectedBevel = theme.cardBevel,
                                strokeColor = theme.strokeBorder
                            ) {
                                CourseIcon(subject.id, Modifier.size(20.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    text = subject.name,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Black,
                                    color = if (isSelected) Color.White else theme.textPrimary
                                )
                                if (isSelected) {
                                    Spacer(Modifier.width(5.dp))
                                    Box(
                                        modifier = Modifier
                                            .size(7.dp)
                                            .clip(CircleShape)
                                            .background(Color(0xFFFDE047))
                                    )
                                }
                            }
                        }
                    }

                    Sticker3dCircleButton(
                        onClick = {
                            if (currentSubjectIndex < subjects.size - 1) selectedSubjectId = subjects[currentSubjectIndex + 1].id
                        },
                        size = 36.dp,
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        bevelHeight = 2.dp,
                        enabled = currentSubjectIndex < subjects.size - 1
                    ) {
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = "Siguiente",
                            tint = if (currentSubjectIndex < subjects.size - 1) theme.textPrimary else theme.textSecondary.copy(alpha = 0.35f),
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }

            // 3. Subject Hero Banner (Naranja con Orstty & Artyon, Título y 3 píldoras)
            item {
                Sticker3dCard(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = Color(0xFFEA580C),
                    strokeColor = theme.strokeBorder,
                    bevelColor = Color(0xFF9A3412),
                    bevelHeight = 5.dp,
                    shape = RoundedCornerShape(26.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(
                                Brush.verticalGradient(
                                    listOf(Color(0xFFC2410C), Color(0xFFEA580C))
                                )
                            )
                            .padding(horizontal = 12.dp, vertical = 9.dp)
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                            // Icono del curso y mascotas originales
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    CourseIcon(currentSubject.id, Modifier.size(28.dp))
                                    Text(
                                        text = currentSubject.name,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Black,
                                        color = Color.White
                                    )
                                }

                                DualMascotDuo(size = 36.dp)
                            }
                            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                    Text("$completedCount / ${currentLessons.size} lecciones · ${topicGroups.size} temas",
                                        color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                    Text("${kotlin.math.round(courseProgress * 100).toInt()}%", color = Color.White,
                                        fontSize = 12.sp, fontWeight = FontWeight.Black)
                                }
                                CourseProgressBar(courseProgress, Modifier.fillMaxWidth(), onBanner = true)
                            }

                            // Fila Inferior de 3 Píldoras de Acción
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                ActionPill(
                                    text = "Fichas",
                                    icon = Icons.Rounded.Bolt,
                                    modifier = Modifier.weight(1f),
                                    onClick = { showCourseFlashcards = true }
                                )
                                ActionPill(
                                    text = "Temas",
                                    icon = Icons.AutoMirrored.Rounded.FormatListBulleted,
                                    modifier = Modifier.weight(1f),
                                    onClick = { onNavigateToSubjectDetail(selectedSubjectId) }
                                )
                                ActionPill(
                                    text = "Guía",
                                    icon = Icons.AutoMirrored.Rounded.MenuBook,
                                    modifier = Modifier.weight(1f),
                                    onClick = { showGuide = true }
                                )
                            }
                        }
                    }
                }
            }

            item {
                LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    item {
                        TopicFilter("Todo", selectedTopic == null) { selectedTopic = null }
                    }
                    items(topicGroups.size) { index ->
                        TopicFilter("Tema ${index + 1}", selectedTopic == topicGroups[index].key) {
                            selectedTopic = topicGroups[index].key
                        }
                    }
                }
            }
            topicGroups.forEachIndexed { topicIndex, group ->
                if (selectedTopic == null || selectedTopic == group.key) {
                    item(key = "${selectedSubjectId}_topic_${group.key}") {
                        TopicHeading(topicIndex + 1, group.value)
                    }
                    item(key = "${selectedSubjectId}_trail_${group.key}") {
                        LearningTrail(group.value, onNavigateToLesson)
                    }
                    item(key = "${selectedSubjectId}_review_${group.key}") {
                        TopicReview(group.value)
                    }
                }
            }
        }
    }

    if (showGuide) {
        com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
            onDismissRequest = { showGuide = false },
            title = "Guía de ${currentSubject.name}",
            message = "${currentSubject.description}\n\nConsejo clave: ${currentSubject.mascotTip}",
            confirmText = "¡Entendido!",
            cancelText = "Cerrar",
            icon = Icons.AutoMirrored.Rounded.MenuBook,
            theme = theme,
            onConfirm = { showGuide = false }
        )
    }
    if (showCourseFlashcards) {
        CourseFlashcardsDialog(
            subject = currentSubject,
            onDismiss = { showCourseFlashcards = false }
        )
    }
}

@Composable
private fun ActionPill(
    text: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Surface(
        shape = RastroShapes.CircularPill,
        color = Color.White.copy(alpha = 0.22f),
        border = androidx.compose.foundation.BorderStroke(1.dp, Color.White.copy(alpha = 0.40f)),
        modifier = modifier
            .clip(RastroShapes.CircularPill)
            .bouncyClick(scaleDown = 0.92f, onClick = onClick)
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 4.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(13.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = text,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }
    }
}
