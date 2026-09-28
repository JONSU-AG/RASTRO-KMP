package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.SmartToy
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun AprenderSubjectDetailScreen(
    subjectId: String,
    onNavigateBack: () -> Unit,
    onNavigateToLesson: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val progression by GamificationManager.state.collectAsState()
    val subject = remember(subjectId) {
        AprenderRepository.getSubjectById(subjectId) ?: AprenderRepository.subjects.first()
    }
    val lessons = remember(progression, subjectId) { progression.learningPath(subjectId) }
    var jumpTarget by remember { mutableStateOf<LessonNode?>(null) }
    jumpTarget?.let { target ->
        JumpToLessonDialog(target, onDismiss = { jumpTarget = null }, onContinue = {
            jumpTarget = null
            onNavigateToLesson(target.id)
        })
    }

    val subjectColor = remember(subject.colorHex) {
        try {
            Color(android.graphics.Color.parseColor(subject.colorHex))
        } catch (e: Exception) {
            theme.accent
        }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Barra Superior de Navegación
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onNavigateBack,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RastroShapes.Pill)
                        .background(theme.surface)
                        .border(1.dp, theme.borderSubtle, RastroShapes.Pill)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = "Volver a Aprender",
                        tint = theme.textPrimary
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                CourseIcon(subject.id, Modifier.size(32.dp))
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(
                        text = subject.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Text(
                        text = subject.area,
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.textSecondary
                    )
                }
            }
        }

        // Tarjeta Informativa de la Materia con Consejo de Orstty
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = subject.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = theme.textSecondary,
                        lineHeight = 18.sp
                    )

                    if (subject.mascotTip.isNotBlank()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RastroShapes.Squircle)
                                .background(subjectColor.copy(alpha = 0.10f))
                                .padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.SmartToy,
                                contentDescription = "Orstty Tip",
                                tint = subjectColor,
                                modifier = Modifier.size(22.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = subject.mascotTip,
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium,
                                color = theme.textPrimary,
                                lineHeight = 16.sp
                            )
                        }
                    }
                }
            }
        }

        // Título de la Ruta de Lecciones
        item {
            Text(
                text = "Ruta de aprendizaje por temas",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = theme.textPrimary
            )
        }

        lessons.groupBy { it.semana }.entries.forEachIndexed { index, topic ->
            item(key = "topic_${topic.key}") { TopicHeading(index + 1, topic.value) }
            items(topic.value, key = { it.id }) { lesson ->
                LessonRoadmapNode(
                    lesson = lesson,
                    accentColor = subjectColor,
                    theme = theme,
                    onClick = {
                        if (!lesson.isCompleted && !lesson.isCurrent) jumpTarget = lesson
                        else onNavigateToLesson(lesson.id)
                    }
                )
            }
        }
    }
}

@Composable
fun LessonRoadmapNode(
    lesson: LessonNode,
    accentColor: Color,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onClick: () -> Unit
) {
    val isAvailable = lesson.challenges.isNotEmpty()

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = isAvailable, onClick = onClick),
        shape = RastroShapes.Squircle,
        colors = CardDefaults.cardColors(
            containerColor = if (isAvailable) theme.surface else theme.surface.copy(alpha = 0.6f)
        ),
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            if (lesson.isCompleted) accentColor.copy(alpha = 0.4f) else theme.borderSubtle
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icono de Estado (Check, Play o Candado)
            Box(
                modifier = Modifier
                    .size(46.dp)
                    .clip(RastroShapes.Pill)
                    .background(
                        when {
                            lesson.isCompleted -> accentColor.copy(alpha = 0.15f)
                            isAvailable -> theme.surfaceAccent
                            else -> theme.borderSubtle.copy(alpha = 0.3f)
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = when {
                        lesson.isCompleted -> Icons.Rounded.CheckCircle
                        isAvailable -> Icons.Rounded.PlayArrow
                        else -> Icons.Rounded.Lock
                    },
                    contentDescription = null,
                    tint = when {
                        lesson.isCompleted -> accentColor
                        isAvailable -> theme.accent
                        else -> theme.textSecondary.copy(alpha = 0.5f)
                    },
                    modifier = Modifier.size(24.dp)
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (lesson.subtema.isNotBlank()) {
                        Text(
                            text = "Subtema ${lesson.subtema}",
                            style = MaterialTheme.typography.labelSmall,
                            color = accentColor,
                            fontWeight = FontWeight.Black
                        )
                        Text(
                            text = " • ",
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.textSecondary
                        )
                    }
                    Text(
                        text = if (lesson.isLocked) "Continuar desde aquí" else "${lesson.challenges.size} retos",
                        style = MaterialTheme.typography.labelSmall,
                        color = if (isAvailable) accentColor else theme.textSecondary,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Text(
                    text = lesson.title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = if (isAvailable) theme.textPrimary else theme.textSecondary
                )
                Text(
                    text = "${lesson.challenges.size} retos interactivos + Teoría",
                    style = MaterialTheme.typography.bodySmall,
                    color = theme.textSecondary
                )
            }

            // Estrellas de Maestría
            if (lesson.isCompleted) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    repeat(3) { starIndex ->
                        Icon(
                            imageVector = Icons.Rounded.Star,
                            contentDescription = null,
                            tint = if (starIndex < lesson.stars) Color(0xFFF59E0B) else theme.borderSubtle,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
    }
}
