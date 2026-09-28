package com.jonsuapps.rastro.android.ui.screens

import android.content.Context
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.layout.ContentScale
import com.jonsuapps.rastro.android.data.FavoritesRepository
import com.jonsuapps.rastro.android.data.FavoriteType
import com.jonsuapps.rastro.android.data.FlashcardRepository
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.SimuladorRepository
import com.jonsuapps.rastro.model.FlashcardItem
import com.jonsuapps.rastro.model.SubjectConfig
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager
import kotlin.random.Random

private data class CourseStudyCard(
    val id: String,
    val question: String,
    val answer: String,
    val explanation: String,
    val week: Int?,
    val topicId: String?,
    val topicTitle: String,
    val author: String,
    val type: String,
    val reportCard: FlashcardItem,
    val imageUrl: String? = null
)

@Composable
fun CourseFlashcardsDialog(
    subject: SubjectConfig,
    onDismiss: () -> Unit
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val lessons = remember(subject.id) { AprenderRepository.getLessonsForSubject(subject.id) }
    var communityCards by remember(subject.id) { mutableStateOf(emptyList<FlashcardItem>()) }
    var selectedWeek by remember(subject.id) { mutableStateOf<Int?>(null) }
    var selectedTopicId by remember(subject.id) { mutableStateOf<String?>(null) }
    var currentIndex by remember(subject.id) { mutableIntStateOf(0) }
    var isFlipped by remember(subject.id) { mutableStateOf(false) }
    var showCreate by remember { mutableStateOf(false) }
    var showReport by remember { mutableStateOf(false) }
    var statusMessage by remember { mutableStateOf<String?>(null) }
    val masteredKey = "mastered_${subject.id}"
    var masteredIds by remember(subject.id) {
        mutableStateOf(
            context.getSharedPreferences("rastro_course_flashcards", android.content.Context.MODE_PRIVATE)
                .getStringSet(masteredKey, emptySet())?.toSet().orEmpty()
        )
    }

    DisposableEffect(subject.name) {
        val listener = FlashcardRepository.observeCommunity { cards ->
            communityCards = cards.filter { it.subject.equals(subject.name, ignoreCase = true) }
        }
        onDispose { listener.remove() }
    }

    val builtInCards = remember(lessons) {
        buildList {
            lessons.forEach { lesson ->
                val theory = lesson.theory
                val formulaSource = theory.formulaLatex?.takeIf(String::isNotBlank)
                    ?: theory.formulas.firstOrNull()?.takeIf(String::isNotBlank)
                val formula = formulaSource?.let(::readableFormula)
                if (formula != null) {
                    val question = "¿Cuál es la fórmula o teorema clave de ${theory.formulaName?.takeIf(String::isNotBlank) ?: theory.titulo}?"
                    val source = FlashcardItem(
                        id = "theory_formula_${lesson.id}", q = question,
                        a = formula, subject = subject.name, authorName = "Matriz Oficial",
                        semana = lesson.semana, subtemaCode = lesson.subtema, subtemaTitle = lesson.title
                    )
                    add(CourseStudyCard(source.id, question, formula,
                        theory.formulaDescription.orEmpty(), lesson.semana, lesson.id,
                        lesson.title, "Matriz Oficial", "Fórmula", source, source.imageUrl))
                }
                val tip = theory.admissionTip?.takeIf(String::isNotBlank)
                if (tip != null) {
                    val question = "Dato Fijo de Admisión: ${lesson.title}"
                    val source = FlashcardItem(
                        id = "theory_tip_${lesson.id}", q = question, a = tip,
                        subject = subject.name, authorName = "Claves de Admisión",
                        semana = lesson.semana, subtemaCode = lesson.subtema, subtemaTitle = lesson.title
                    )
                    add(CourseStudyCard(source.id, question, tip,
                        theory.admissionExplanation.orEmpty(), lesson.semana, lesson.id,
                        lesson.title, "Claves de Admisión", "Clave", source, source.imageUrl))
                }
            }
        }
    }
    val defaultCards = remember(subject.name) {
        SimuladorRepository.defaultFlashcards
            .filter { it.subject.equals(subject.name, ignoreCase = true) }
            .map { card ->
                CourseStudyCard(card.id, card.q, card.a, "", card.semana, null,
                    card.subtemaTitle ?: "Conceptos clave", card.authorName, "Repaso", card, card.imageUrl)
            }
    }
    val allCards = remember(builtInCards, defaultCards, communityCards) {
        (builtInCards + defaultCards + communityCards.map { card ->
            CourseStudyCard(card.id, card.q, card.a, "", card.semana, null,
                card.subtemaTitle ?: "Aporte de la comunidad", card.authorName, "Comunidad", card, card.imageUrl)
        }).distinctBy { it.id }
    }
    val weeks = remember(lessons) { lessons.map { it.semana }.distinct().sorted() }
    val topics = remember(lessons, selectedWeek) {
        lessons.filter { selectedWeek == null || it.semana == selectedWeek }
    }
    val filteredCards = remember(allCards, selectedWeek, selectedTopicId) {
        allCards.filter { card ->
            (selectedWeek == null || card.week == null || card.week == selectedWeek) &&
                (selectedTopicId == null || card.topicId == null || card.topicId == selectedTopicId)
        }
    }
    LaunchedEffect(selectedWeek, selectedTopicId, filteredCards.size) {
        currentIndex = 0
        isFlipped = false
    }
    val currentCard = filteredCards.getOrNull(currentIndex)

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            modifier = Modifier.fillMaxWidth(0.96f).fillMaxHeight(0.92f),
            shape = RoundedCornerShape(28.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 6.dp
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(horizontal = 14.dp, vertical = 14.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(shape = RastroShapes.Squircle, color = Color(0xFFE7F8F3)) {
                        Text("▤", modifier = Modifier.padding(horizontal = 11.dp, vertical = 8.dp), color = Color(0xFF07966D), fontSize = 20.sp)
                    }
                    Spacer(Modifier.width(10.dp))
                    Column(Modifier.weight(1f)) {
                        Text("Flashcards • ${subject.name}", color = theme.textPrimary, fontWeight = FontWeight.Bold, fontSize = 17.sp, maxLines = 1)
                        Text("Repaso activo por temas y subtemas", color = theme.textSecondary, fontSize = 11.sp, maxLines = 1)
                    }
                    Surface(shape = RastroShapes.CircularPill, color = Color(0xFFEDE9FE)) {
                        Text("${filteredCards.size} fichas", modifier = Modifier.padding(horizontal = 9.dp, vertical = 5.dp), color = Color(0xFF7C3AED), fontWeight = FontWeight.Bold, fontSize = 10.sp)
                    }
                    IconButton(onClick = onDismiss, modifier = Modifier.size(34.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar fichas", tint = theme.textSecondary)
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    FilterMenu(
                        label = selectedWeek?.let { "Tema $it" } ?: "Todos los temas",
                        options = listOf(null to "Todos los temas") + weeks.map { it to "Tema $it" },
                        onSelect = { selectedWeek = it; selectedTopicId = null }
                    , modifier = Modifier.weight(1f))
                    FilterMenu(
                        label = selectedTopicId?.let { id -> topics.firstOrNull { it.id == id }?.subtema ?: "Tema" } ?: "Todos los subtemas",
                        options = listOf(null to "Todos los subtemas") + topics.map { it.id to it.subtema.ifBlank { it.title } },
                        onSelect = { selectedTopicId = it }
                    , modifier = Modifier.weight(1f))
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Ficha ${if (currentCard == null) 0 else currentIndex + 1} de ${filteredCards.size}", color = theme.textSecondary, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, modifier = Modifier.weight(1f))
                    TextButton(onClick = {
                        if (filteredCards.isNotEmpty()) currentIndex = Random.nextInt(filteredCards.size)
                        isFlipped = false
                        DuolingoHaptics.playOptionSelected(context)
                    }, enabled = filteredCards.isNotEmpty()) {
                        Icon(Icons.Rounded.Shuffle, contentDescription = null, modifier = Modifier.size(14.dp))
                        Spacer(Modifier.width(4.dp)); Text("Aleatorio", fontSize = 11.sp)
                    }
                    if (currentCard != null) {
                        Text("• ${currentCard.author}", fontSize = 10.sp, color = theme.textSecondary, maxLines = 1)
                    }
                }

                if (currentCard == null) {
                    Column(
                        modifier = Modifier.weight(1f).fillMaxWidth().clip(RoundedCornerShape(22.dp)).background(theme.surfaceAccent).padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text("Aún no hay fichas para este tema", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                        Text("Puedes agregar una ficha para ${subject.name}.", color = theme.textSecondary, fontSize = 12.sp)
                    }
                } else {
                    val rotationAnim by animateFloatAsState(
                        targetValue = if (isFlipped) 180f else 0f,
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessLow
                        ),
                        label = "cardFlip"
                    )

                    Sticker3dCard(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .graphicsLayer {
                                rotationY = rotationAnim
                                cameraDistance = 12f * density
                            }
                            .clickable {
                                isFlipped = !isFlipped
                                DuolingoHaptics.playOptionSelected(context)
                            },
                        shape = RoundedCornerShape(22.dp),
                        containerColor = if (isFlipped) theme.surfaceAccent else theme.surface,
                        strokeColor = theme.strokeBorder,
                        bevelColor = theme.cardBevel,
                        bevelHeight = 4.dp
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .graphicsLayer {
                                    if (rotationAnim > 90f) rotationY = 180f
                                }
                                .padding(18.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Surface(shape = RastroShapes.CircularPill, color = if (isFlipped) Color(0xFFEDE9FE) else Color(0xFFE8F7F1)) {
                                Text(
                                    "${currentCard.type.uppercase()} • ${currentCard.topicTitle}",
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                                    color = if (isFlipped) Color(0xFF7C3AED) else Color(0xFF059669),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp,
                                    maxLines = 1
                                )
                            }
                            Text(if (isFlipped) "RESPUESTA" else "PREGUNTA", color = theme.textSecondary, fontSize = 10.sp, fontWeight = FontWeight.Black)
                            Text(
                                text = if (isFlipped) currentCard.answer else currentCard.question,
                                modifier = Modifier.weight(1f).fillMaxWidth().verticalScroll(rememberScrollState()),
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Bold,
                                fontSize = if (isFlipped) 18.sp else 19.sp,
                                lineHeight = 26.sp
                            )
                            if (!currentCard.imageUrl.isNullOrBlank()) {
                                CachedRemoteImage(
                                    url = currentCard.imageUrl,
                                    contentDescription = "Imagen de la ficha",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(130.dp)
                                        .clip(RoundedCornerShape(12.dp))
                                        .border(1.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(12.dp)),
                                    contentScale = ContentScale.Fit
                                )
                            }
                            if (isFlipped && currentCard.explanation.isNotBlank()) {
                                Text(
                                    currentCard.explanation,
                                    modifier = Modifier.heightIn(max = 90.dp).verticalScroll(rememberScrollState()),
                                    color = theme.textSecondary,
                                    fontSize = 12.sp,
                                    lineHeight = 17.sp
                                )
                            }
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                Icon(Icons.Rounded.TouchApp, contentDescription = null, tint = theme.accent, modifier = Modifier.size(15.dp))
                                Text(
                                    if (isFlipped) "Toca para volver a la pregunta" else "Toca la ficha para revelar la respuesta",
                                    color = theme.accent,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 11.sp
                                )
                            }
                        }
                    }
                }

                val allFavorites by FavoritesRepository.favoritesFlow.collectAsState()
                val isCurrentFav = currentCard?.let { card ->
                    allFavorites.any { it.itemId == card.id && it.type == FavoriteType.FLASHCARD }
                } ?: false

                // Fila 1 de Controles: Navegación y Estado
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                    Sticker3dButton(
                        onClick = {
                            if (filteredCards.isNotEmpty()) {
                                currentIndex = (currentIndex - 1 + filteredCards.size) % filteredCards.size
                                isFlipped = false
                                DuolingoHaptics.playOptionSelected(context)
                            }
                        },
                        enabled = filteredCards.isNotEmpty(),
                        modifier = Modifier.weight(1f).height(46.dp),
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = null, tint = theme.textPrimary, modifier = Modifier.size(15.dp))
                            Text("Anterior", fontSize = 12.sp, color = theme.textPrimary, fontWeight = FontWeight.Bold)
                        }
                    }

                    val isMastered = currentCard?.id in masteredIds
                    Sticker3dButton(
                        onClick = {
                            currentCard?.let { card ->
                                val next = masteredIds.toMutableSet().apply { if (!add(card.id)) remove(card.id) }
                                masteredIds = next
                                context.getSharedPreferences("rastro_course_flashcards", Context.MODE_PRIVATE)
                                    .edit().putStringSet(masteredKey, next).apply()
                                DuolingoHaptics.playAnswerCorrect(context)
                            }
                        },
                        enabled = currentCard != null,
                        modifier = Modifier.weight(1.2f).height(46.dp),
                        containerColor = if (isMastered) Color(0xFF059669) else Color(0xFF10B981),
                        bottomBevelColor = Color(0xFF047857),
                        strokeColor = theme.strokeBorder
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(Icons.Rounded.Check, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                            Text(if (isMastered) "Dominada" else "Aprendida", fontSize = 12.sp, color = Color.White, fontWeight = FontWeight.Black)
                        }
                    }

                    Sticker3dButton(
                        onClick = {
                            if (filteredCards.isNotEmpty()) {
                                currentIndex = (currentIndex + 1) % filteredCards.size
                                isFlipped = false
                                DuolingoHaptics.playOptionSelected(context)
                            }
                        },
                        enabled = filteredCards.isNotEmpty(),
                        modifier = Modifier.weight(1f).height(46.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text("Siguiente", fontSize = 12.sp, color = Color.White, fontWeight = FontWeight.Bold)
                            Icon(Icons.AutoMirrored.Rounded.ArrowForward, contentDescription = null, tint = Color.White, modifier = Modifier.size(15.dp))
                        }
                    }
                }

                // Fila 2 de Controles: Acciones secundarias
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                    Sticker3dButton(
                        onClick = {
                            currentCard?.let { card ->
                                FavoritesRepository.toggle(
                                    type = FavoriteType.FLASHCARD,
                                    itemId = card.id,
                                    title = card.question,
                                    subtitle = card.answer,
                                    subject = subject.name,
                                    imageUrl = card.imageUrl
                                )
                                DuolingoHaptics.playOptionSelected(context)
                            }
                        },
                        enabled = currentCard != null,
                        modifier = Modifier.weight(1f).height(42.dp),
                        containerColor = if (isCurrentFav) Color(0xFFFEF3C7) else theme.surface,
                        bottomBevelColor = if (isCurrentFav) Color(0xFFF59E0B) else theme.cardBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(
                                imageVector = if (isCurrentFav) Icons.Rounded.Star else Icons.Rounded.StarOutline,
                                contentDescription = null,
                                tint = if (isCurrentFav) Color(0xFFD97706) else theme.textPrimary,
                                modifier = Modifier.size(15.dp)
                            )
                            Text(
                                text = "Favorita",
                                fontSize = 11.5.sp,
                                color = if (isCurrentFav) Color(0xFFD97706) else theme.textPrimary,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Sticker3dButton(
                        onClick = { showReport = true },
                        enabled = currentCard != null,
                        modifier = Modifier.weight(1f).height(42.dp),
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(Icons.Rounded.Flag, contentDescription = null, tint = theme.textSecondary, modifier = Modifier.size(15.dp))
                            Text("Reportar", fontSize = 11.5.sp, color = theme.textSecondary, fontWeight = FontWeight.Bold)
                        }
                    }

                    Sticker3dButton(
                        onClick = { showCreate = true },
                        modifier = Modifier.weight(1.2f).height(42.dp),
                        containerColor = Color(0xFF7C3AED),
                        bottomBevelColor = Color(0xFF6D28D9),
                        strokeColor = theme.strokeBorder
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(Icons.Rounded.Add, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                            Text("Nueva ficha", fontSize = 11.5.sp, color = Color.White, fontWeight = FontWeight.Black)
                        }
                    }
                }

                statusMessage?.let { Text(it, color = theme.textSecondary, fontSize = 11.sp) }
            }
        }
    }

    if (showCreate) {
        CreateCourseFlashcardDialog(
            subject = subject,
            selectedWeek = selectedWeek,
            selectedTopic = topics.firstOrNull { it.id == selectedTopicId },
            onDismiss = { showCreate = false },
            onSave = { question, answer, week, topic, imageUrl ->
                FlashcardRepository.create(
                    question = question,
                    answer = answer,
                    subject = subject.name,
                    semana = week,
                    subtemaCode = topic?.subtema,
                    subtemaTitle = topic?.title,
                    imageUrl = imageUrl?.trim()?.ifBlank { null }
                ) { result ->
                    if (result.isSuccess) {
                        statusMessage = "Ficha publicada para ${subject.name}."
                        showCreate = false
                    } else statusMessage = result.exceptionOrNull()?.localizedMessage ?: "No se pudo guardar la ficha."
                }
            }
        )
    }
    if (showReport && currentCard != null) {
        ReportCourseFlashcardDialog(
            card = currentCard.reportCard,
            onDismiss = { showReport = false },
            onReported = { result ->
                statusMessage = if (result.isSuccess) "Reporte enviado." else "No se pudo enviar el reporte."
                showReport = false
            }
        )
    }
}

private fun readableFormula(value: String): String = value
    .replace("\\times", "×")
    .replace("\\implies", "⇒")
    .replace("\\rightarrow", "→")
    .replace("\\to", "→")
    .replace("\\cdot", "·")
    .replace("\\quad", "   ")
    .replace("\\,", " ")
    .replace("\\;", " ")
    .replace("\\text{", "")
    .replace("\\mathrm{", "")
    .replace("\\left", "")
    .replace("\\right", "")
    .replace("{", "")
    .replace("}", "")
    .replace("_", "")
    .replace("\\", "")

@Composable
private fun <T> FilterMenu(
    label: String,
    options: List<Pair<T, String>>,
    onSelect: (T) -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier) {
        OutlinedButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth(), shape = RastroShapes.Pill, contentPadding = PaddingValues(horizontal = 9.dp, vertical = 7.dp)) {
            Text(label, maxLines = 1, fontSize = 10.sp, modifier = Modifier.weight(1f))
            Text("⌄", fontWeight = FontWeight.Bold)
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            options.forEach { (value, text) ->
                DropdownMenuItem(text = { Text(text, fontSize = 12.sp) }, onClick = { onSelect(value); expanded = false })
            }
        }
    }
}

@Composable
private fun CreateCourseFlashcardDialog(
    subject: SubjectConfig,
    selectedWeek: Int?,
    selectedTopic: com.jonsuapps.rastro.model.LessonNode?,
    onDismiss: () -> Unit,
    onSave: (String, String, Int?, com.jonsuapps.rastro.model.LessonNode?, String?) -> Unit
) {
    val theme = ThemeManager.currentTheme
    var question by remember { mutableStateOf("") }
    var answer by remember { mutableStateOf("") }
    var imageUrl by remember { mutableStateOf("") }

    androidx.compose.ui.window.Dialog(onDismissRequest = onDismiss) {
        com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
            modifier = Modifier.fillMaxWidth(0.95f),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Nueva Ficha • ${subject.name}",
                        color = theme.textPrimary,
                        fontWeight = FontWeight.Black,
                        fontSize = 17.sp
                    )
                    IconButton(onClick = onDismiss, modifier = Modifier.size(28.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                Text(
                    text = "${selectedTopic?.subtema ?: "Todos los subtemas"} • Semana ${selectedWeek ?: 1}",
                    fontSize = 11.5.sp,
                    color = theme.accent,
                    fontWeight = FontWeight.Bold
                )

                OutlinedTextField(
                    value = question,
                    onValueChange = { question = it },
                    label = { Text("Pregunta o concepto") },
                    minLines = 2,
                    maxLines = 4,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = imageUrl,
                    onValueChange = { imageUrl = it },
                    label = { Text("URL de Imagen ilustrativa (opcional)") },
                    placeholder = { Text("https://ejemplo.com/grafico.png") },
                    singleLine = true,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth()
                )

                if (imageUrl.isNotBlank()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(theme.surfaceAccent)
                            .border(1.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(12.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        CachedRemoteImage(
                            url = imageUrl.trim(),
                            contentDescription = "Vista previa de imagen",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Fit
                        )
                    }
                }

                OutlinedTextField(
                    value = answer,
                    onValueChange = { answer = it },
                    label = { Text("Respuesta explicativa") },
                    minLines = 3,
                    maxLines = 5,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth()
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.weight(1f).height(44.dp),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.Bold)
                    }

                    val canPublish = question.isNotBlank() && answer.isNotBlank()
                    com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                        onClick = {
                            if (canPublish) onSave(question.trim(), answer.trim(), selectedWeek ?: 1, selectedTopic, imageUrl.ifBlank { null })
                        },
                        enabled = canPublish,
                        modifier = Modifier.weight(1.3f).height(44.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Text("Publicar Ficha", color = Color.White, fontWeight = FontWeight.Black, fontSize = 13.sp)
                    }
                }
            }
        }
    }
}

@Composable
private fun ReportCourseFlashcardDialog(
    card: FlashcardItem,
    onDismiss: () -> Unit,
    onReported: (Result<Unit>) -> Unit
) {
    val theme = ThemeManager.currentTheme
    var reason by remember { mutableStateOf("contenido_incorrecto") }
    var isSubmitting by remember { mutableStateOf(false) }

    androidx.compose.ui.window.Dialog(onDismissRequest = { if (!isSubmitting) onDismiss() }) {
        com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
            modifier = Modifier.fillMaxWidth(0.92f),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Reportar Ficha",
                        color = theme.textPrimary,
                        fontWeight = FontWeight.Black,
                        fontSize = 17.sp
                    )
                    IconButton(onClick = onDismiss, modifier = Modifier.size(28.dp), enabled = !isSubmitting) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                val options = listOf(
                    "contenido_incorrecto" to "La respuesta es incorrecta",
                    "contenido_inapropiado" to "Contenido inapropiado u ofensivo",
                    "duplicada" to "Ficha duplicada o redundante"
                )

                options.forEach { (value, label) ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .clickable { reason = value }
                            .padding(vertical = 4.dp, horizontal = 4.dp)
                    ) {
                        RadioButton(
                            selected = reason == value,
                            onClick = { reason = value },
                            colors = RadioButtonDefaults.colors(selectedColor = Color(0xFFEF4444))
                        )
                        Spacer(Modifier.width(6.dp))
                        Text(label, color = theme.textPrimary, fontSize = 13.sp, fontWeight = if (reason == value) FontWeight.Bold else FontWeight.Normal)
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.weight(1f).height(44.dp),
                        shape = RoundedCornerShape(14.dp),
                        enabled = !isSubmitting
                    ) {
                        Text("Cancelar", color = theme.textSecondary, fontWeight = FontWeight.Bold)
                    }

                    com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                        onClick = {
                            isSubmitting = true
                            FlashcardRepository.report(card, reason, "") { result ->
                                isSubmitting = false
                                onReported(result)
                            }
                        },
                        enabled = !isSubmitting,
                        modifier = Modifier.weight(1.3f).height(44.dp),
                        containerColor = Color(0xFFEF4444),
                        bottomBevelColor = Color(0xFFB91C1C),
                        strokeColor = Color(0xFF7F1D1D)
                    ) {
                        Text(if (isSubmitting) "Enviando..." else "Enviar Reporte", color = Color.White, fontWeight = FontWeight.Black, fontSize = 13.sp)
                    }
                }
            }
        }
    }
}

@Composable
private fun FlashcardAction(label: String, modifier: Modifier, enabled: Boolean,
    color: Color = Color(0xFF0369A1), onClick: () -> Unit) {
    com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
        onClick = onClick, modifier = modifier.heightIn(min = 46.dp), enabled = enabled,
        containerColor = color, strokeColor = ThemeManager.currentTheme.strokeBorder,
        contentPadding = PaddingValues(horizontal = 4.dp, vertical = 10.dp)
    ) { Text(label, fontSize = 11.sp, maxLines = 1, color = Color.White, fontWeight = FontWeight.Bold) }
}
