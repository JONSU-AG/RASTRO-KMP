package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.platform.LocalDensity
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.android.data.GamificationRepository
import com.jonsuapps.rastro.auth.UserManager
import kotlin.math.roundToInt
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.foundation.border
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
internal fun CourseIcon(subjectId: String, modifier: Modifier = Modifier) {
    val drawable = when (subjectId) {
        "biologia" -> R.drawable.ic_course_biologia
        "fisica" -> R.drawable.ic_course_fisica
        "quimica" -> R.drawable.ic_course_quimica
        "matematica" -> R.drawable.ic_course_matematica
        "filosofia" -> R.drawable.ic_course_filosofia
        "historia" -> R.drawable.ic_course_historia
        "lenguaje" -> R.drawable.ic_course_lenguaje
        "literatura" -> R.drawable.ic_course_literatura
        "civica" -> R.drawable.ic_course_civica
        "geografia" -> R.drawable.ic_course_geografia
        "psicologia" -> R.drawable.ic_course_psicologia
        "raz_matematico" -> R.drawable.ic_course_raz_matematico
        "raz_logico" -> R.drawable.ic_course_raz_logico
        "raz_verbal" -> R.drawable.ic_course_raz_verbal
        else -> R.drawable.ic_course_ingles
    }
    Image(painterResource(drawable), contentDescription = null, modifier = modifier)
}

@Composable
internal fun CourseProgressBar(progress: Float, modifier: Modifier = Modifier, onBanner: Boolean = false) {
    LinearProgressIndicator(
        progress = { progress.coerceIn(0f, 1f) },
        modifier = modifier.height(6.dp).clip(CircleShape),
        color = if (onBanner) Color(0xFF86EFAC) else Color(0xFF10B981),
        trackColor = if (onBanner) Color.White.copy(alpha = 0.3f) else ThemeManager.currentTheme.surfaceAccent,
        strokeCap = StrokeCap.Round,
        gapSize = 0.dp,
        drawStopIndicator = {}
    )
}

@Composable
internal fun TopicFilter(
    label: String,
    selected: Boolean,
    selectedColor: Color = Color(0xFF0284C7),
    selectedBevel: Color = Color(0xFF0369A1),
    onClick: () -> Unit
) {
    val theme = ThemeManager.currentTheme
    Sticker3dPill(
        selected = selected,
        onClick = onClick,
        selectedColor = selectedColor,
        selectedBevel = selectedBevel,
        unselectedColor = theme.surface,
        unselectedBevel = theme.cardBevel,
        strokeColor = theme.strokeBorder
    ) {
        Text(
            label,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = if (selected) Color.White else theme.textPrimary
        )
    }
}

@Composable
internal fun TopicHeading(number: Int, lessons: List<LessonNode>) {
    val theme = ThemeManager.currentTheme
    val completed = lessons.count { it.isCompleted }
    Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = theme.surface,
        bevelColor = theme.cardBevel, strokeColor = theme.strokeBorder, shape = RoundedCornerShape(18.dp)) {
        Row(Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(9.dp)) {
            Text("Tema $number", fontSize = 11.sp, color = theme.accent, fontWeight = FontWeight.Black)
            val topicTitle = lessons.firstOrNull()?.theory?.titulo?.ifBlank { null }
                ?: lessons.first().title.replace(Regex("^\\d+(?:\\.\\d+)*\\s*"), "")
            Text(topicTitle,
                modifier = Modifier.weight(1f), fontSize = 12.sp, maxLines = 2,
                overflow = TextOverflow.Ellipsis, fontWeight = FontWeight.ExtraBold, color = theme.textPrimary)
            Column(Modifier.width(48.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("$completed/${lessons.size}", fontSize = 10.sp, color = theme.textSecondary,
                    modifier = Modifier.align(Alignment.End))
                CourseProgressBar(completed.toFloat() / lessons.size, Modifier.fillMaxWidth())
            }
        }
    }
}

/** One continuous path per topic, anchored to the actual measured row heights. */
@Composable
internal fun LearningTrail(lessons: List<LessonNode>, onNavigate: (String) -> Unit) {
    val theme = ThemeManager.currentTheme
    val heights = remember(lessons.map { it.id }) { mutableStateMapOf<Int, Int>() }
    var trailWidth by remember { mutableIntStateOf(0) }
    val journeyFrom by GamificationManager.journeyFrom.collectAsState()
    val activeIndex = lessons.indexOfFirst { it.isCurrent }
    var jumpTarget by remember { mutableStateOf<LessonNode?>(null) }
    jumpTarget?.let { target ->
        JumpToLessonDialog(target, onDismiss = { jumpTarget = null }, onContinue = {
            jumpTarget = null
            onNavigate(target.id)
        })
    }
    Box(Modifier.fillMaxWidth().onSizeChanged { trailWidth = it.width }) {
        Canvas(Modifier.matchParentSize()) {
            var top = 0f
            for (index in 0 until lessons.lastIndex) {
                val height = heights[index]?.toFloat() ?: break
                val nextHeight = heights[index + 1]?.toFloat() ?: break
                val x = size.width / 2 + (if (index % 2 == 0) -6.dp.toPx() else 6.dp.toPx())
                val nextX = size.width - x
                val y = top + height / 2
                val nextY = top + height + nextHeight / 2
                val bend = if (index % 2 == 0) -42.dp.toPx() else 42.dp.toPx()
                val path = Path().apply {
                    moveTo(x, y)
                    cubicTo(x + bend, y + (nextY - y) * 0.45f,
                        nextX + bend, y + (nextY - y) * 0.65f, nextX, nextY)
                }
                drawPath(path, Color(0xFFB8CDDE).copy(alpha = 0.5f), style = Stroke(11.dp.toPx(), cap = StrokeCap.Round))
                drawPath(path, theme.surface, style = Stroke(8.dp.toPx(), cap = StrokeCap.Round))
                drawPath(path, if (lessons[index].isCompleted) Color(0xFF55BFAE) else Color(0xFF8AAAC4),
                    style = Stroke(2.dp.toPx(), cap = StrokeCap.Round,
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(3.dp.toPx(), 5.dp.toPx()))))
                top += height
            }
        }
        Column {
            lessons.forEachIndexed { index, lesson ->
                LearningTrailRow(lesson, index, Modifier.onSizeChanged { heights[index] = it.height }) {
                    if (!lesson.isCompleted && !lesson.isCurrent) jumpTarget = lesson
                    else onNavigate(lesson.id)
                }
            }
        }
        if (activeIndex >= 0 && trailWidth > 0 && (0..activeIndex).all { heights[it] != null }) {
            val density = LocalDensity.current
            val mascotSize = with(density) { 46.dp.toPx() }
            fun position(index: Int): Offset {
                val y = (0 until index).sumOf { heights[it] ?: 0 } + (heights[index] ?: 0) / 2f
                val x = trailWidth * if (index % 2 == 0) 0.19f else 0.81f
                return Offset(x - mascotSize / 2, y - mascotSize / 2)
            }
            val target = position(activeIndex)
            val previous = lessons.indexOfFirst { it.id == journeyFrom }
            val movement = remember(lessons.first().id) {
                Animatable(if (journeyFrom == null) target else if (previous >= 0) position(previous)
                    else target.copy(y = -mascotSize), Offset.VectorConverter)
            }
            LaunchedEffect(target) {
                movement.animateTo(target, tween(1000, easing = FastOutSlowInEasing))
            }
            Box(Modifier.offset { IntOffset(movement.value.x.roundToInt(), movement.value.y.roundToInt()) }
                .size(46.dp).semantics { contentDescription = "Orstty te acompaña en ${lessons[activeIndex].title}" }) {
                OrsttyMascot(size = 46.dp, mood = MascotMood.CHEERING)
            }
        }
    }
}

@Composable
internal fun LearningTrailRow(lesson: LessonNode, index: Int, modifier: Modifier = Modifier, onClick: () -> Unit) {
    val theme = ThemeManager.currentTheme
    val active = lesson.isCurrent
    val rightSide = index % 2 == 0
    val palette = when (index % 4) {
        0 -> Color(0xFF22CDA2) to Color(0xFF078665)
        1 -> Color(0xFFFFBE46) to Color(0xFFC77812)
        2 -> Color(0xFF80C8FA) to Color(0xFF4387C0)
        else -> Color(0xFFB58AFF) to Color(0xFF7750BE)
    }
    val accent = if (active) Color(0xFFFFB52E) else palette.first
    val bevel = if (active) Color(0xFFCB7310) else palette.second
    val status = when {
        lesson.isCompleted -> "Completado"
        lesson.challenges.isEmpty() -> "Próximamente"
        lesson.isCurrent -> "Empezar"
        lesson.isLocked -> "Saltar aquí"
        else -> "Pendiente"
    }
    val emblem = lessonEmblem(lesson)
    val detail = if (active) "${lesson.challenges.size} retos" else ""
    Box(modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 5.dp)
            .offset(x = if (rightSide) (-6).dp else 6.dp).heightIn(min = 72.dp),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Box(Modifier.weight(1f), contentAlignment = Alignment.CenterEnd) {
                if (!rightSide) TrailLessonLabel(lesson, status, detail, active, palette.second, onClick)
            }
            Box(Modifier.size(62.dp, 68.dp), contentAlignment = Alignment.Center) {
                if (active) Canvas(Modifier.matchParentSize()) {
                    drawCircle(Color(0xFFFFC65C).copy(alpha = 0.28f), radius = size.width / 2)
                    drawLine(Color(0xFFFFB52E), androidx.compose.ui.geometry.Offset(0f, 9.dp.toPx()),
                        androidx.compose.ui.geometry.Offset(5.dp.toPx(), 13.dp.toPx()), 3.dp.toPx(), StrokeCap.Round)
                    drawLine(Color(0xFFFFB52E), androidx.compose.ui.geometry.Offset(9.dp.toPx(), 1.dp.toPx()),
                        androidx.compose.ui.geometry.Offset(12.dp.toPx(), 7.dp.toPx()), 3.dp.toPx(), StrokeCap.Round)
                }
                Sticker3dCard(
                    modifier = Modifier.size(54.dp, 60.dp), shape = CircleShape,
                    containerColor = accent, bevelColor = bevel,
                    strokeColor = Color(0xFF243D58), bevelHeight = 4.dp,
                    onClick = if (lesson.challenges.isEmpty()) null else onClick
                ) {
                    // Reset inherited minimum constraints: the icon and badge must stay small.
                    Box(Modifier.fillMaxSize()) {
                        Box(Modifier.matchParentSize().padding(4.dp).border(1.dp,
                            Color.White.copy(alpha = 0.6f), CircleShape))
                        Column(Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
                            when {
                                active -> Icon(Icons.Rounded.PlayArrow, null, Modifier.size(32.dp), tint = Color.White)
                                emblem != null -> Icon(emblem, null, Modifier.size(27.dp), tint = Color(0xFF254C59))
                                else -> CourseIcon(lesson.subjectId, Modifier.size(29.dp))
                            }
                            if (lesson.isCompleted) Row(horizontalArrangement = Arrangement.spacedBy(1.dp)) {
                                repeat(3) { star ->
                                    Icon(Icons.Rounded.Star, null, Modifier.size(12.dp),
                                        tint = if (star < lesson.stars) Color(0xFFFFF2A6) else Color.White.copy(alpha = 0.4f))
                                }
                            }
                        }
                    }
                }
                if (!active) Box(Modifier.align(Alignment.BottomEnd).size(18.dp).clip(CircleShape)
                    .background(if (lesson.isCompleted) Color(0xFF079C76) else theme.surface)
                    .border(1.dp, Color(0xFF243D58), CircleShape), contentAlignment = Alignment.Center) {
                    Icon(if (lesson.isCompleted) Icons.Rounded.Check else Icons.Rounded.Lock,
                        null, Modifier.size(12.dp), tint = if (lesson.isCompleted) Color.White else theme.textSecondary)
                }
            }
            Box(Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                if (rightSide) TrailLessonLabel(lesson, status, detail, active, palette.second, onClick)
            }
        }
    }
}

@Composable
private fun TrailLessonLabel(lesson: LessonNode, status: String, detail: String, active: Boolean, tint: Color, onClick: () -> Unit) {
    val theme = ThemeManager.currentTheme
    Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = theme.surface,
        bevelColor = theme.cardBevel, strokeColor = if (active) Color(0xFFF59E0B) else tint.copy(alpha = 0.45f),
        shape = RoundedCornerShape(15.dp), onClick = if (lesson.challenges.isEmpty()) null else onClick) {
        Column(Modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(3.dp)) {
            // Número de subtema: "1.1", "1.2", etc.
            Text(
                text = if (lesson.subtema.isNotBlank()) "Subtema ${lesson.subtema}" else "Lección",
                fontSize = 9.sp,
                fontWeight = FontWeight.Black,
                color = tint.copy(alpha = 0.80f)
            )
            Text(lesson.title, color = theme.textPrimary, fontSize = 11.sp,
                lineHeight = 15.sp, fontWeight = FontWeight.ExtraBold)
            Text(status, color = if (active) Color(0xFF965005) else tint,
                modifier = Modifier.clip(CircleShape).background(tint.copy(alpha = 0.12f))
                    .padding(horizontal = 6.dp, vertical = 2.dp),
                fontSize = 10.sp, lineHeight = 13.sp, fontWeight = FontWeight.Bold)
            if (detail.isNotEmpty()) Text(detail, color = theme.textSecondary, fontSize = 9.sp, lineHeight = 12.sp)
        }
    }
}

@Composable
internal fun TopicReview(lessons: List<LessonNode>) {
    val theme = ThemeManager.currentTheme
    val progress by GamificationManager.state.collectAsState()
    val subjectId = lessons.first().subjectId
    val topic = lessons.first().semana
    val playable = lessons.filter { it.challenges.isNotEmpty() }
    val completed = playable.count { progress.completedLessons[it.id]?.skipped == false }
    val ready = playable.isNotEmpty() && completed == playable.size
    val claimed = "$subjectId:$topic" in progress.claimedTopicRewards
    var awarded by remember { mutableIntStateOf(0) }
    Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = theme.surface,
        bevelColor = Color(0xFFD8A142), strokeColor = if (ready) Color(0xFFE2A324) else theme.borderSubtle,
        shape = RoundedCornerShape(20.dp),
        onClick = if (ready && !claimed) ({
            awarded = GamificationManager.claimTopicReward(subjectId, topic)
            GamificationRepository.saveLocal(UserManager.currentUser.value.uid, GamificationManager.state.value)
            val user = UserManager.currentUser.value
            if (user.isAuthenticated && !user.isAnonymous) {
                GamificationRepository.save(user.uid, GamificationManager.state.value)
            }
        }) else null) {
        Row(Modifier.padding(horizontal = 10.dp, vertical = 6.dp), verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            RewardChest(open = claimed, modifier = Modifier.size(52.dp))
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(when {
                    awarded > 0 -> "¡+$awarded XP!"
                    claimed -> "Cofre abierto"
                    ready -> "Abrir cofre · +${GamificationManager.TOPIC_REWARD_XP} XP"
                    else -> "Cofre del tema · +${GamificationManager.TOPIC_REWARD_XP} XP"
                }, color = theme.textPrimary, fontSize = 13.sp, fontWeight = FontWeight.Black)
                Text(when {
                    claimed -> "Recompensa recibida por completar el tema"
                    ready -> "¡Completaste el tema! Toca para reclamar"
                    else -> "$completed/${playable.size} lecciones · Completa el tema"
                }, color = theme.textSecondary, fontSize = 11.sp, lineHeight = 15.sp)
            }
            Icon(if (claimed) Icons.Rounded.CheckCircle else if (ready) Icons.Rounded.AutoAwesome else Icons.Rounded.Lock,
                null, tint = Color(0xFFCF8C13), modifier = Modifier.size(22.dp))
        }
    }
}

@Composable
internal fun JumpToLessonDialog(lesson: LessonNode, onDismiss: () -> Unit, onContinue: () -> Unit) {
    RastroStickerDialog(
        onDismissRequest = onDismiss,
        title = "Continuar desde aquí",
        message = "${lesson.title}\n\nLas lecciones anteriores quedarán pendientes. Saltar no da XP ni estrellas; los cofres se abren al resolver todas las lecciones de su tema.",
        confirmText = "Continuar desde aquí",
        cancelText = "Volver",
        icon = Icons.Rounded.PlayArrow,
        theme = ThemeManager.currentTheme,
        onConfirm = {
            if (GamificationManager.jumpToLesson(lesson.id)) {
                val user = UserManager.currentUser.value
                GamificationRepository.saveLocal(user.uid, GamificationManager.state.value)
                if (user.isAuthenticated && !user.isAnonymous) {
                    GamificationRepository.save(user.uid, GamificationManager.state.value)
                }
                onContinue()
            }
        }
    )
}
