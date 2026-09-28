package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.window.Dialog
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Error
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Lightbulb
import androidx.compose.material.icons.rounded.LocalFireDepartment
import androidx.compose.material.icons.rounded.MenuBook
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.TrackChanges
import androidx.compose.material.icons.rounded.Warning
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.android.ui.components.ArtyonMascot
import com.jonsuapps.rastro.android.ui.components.DualMascotDuo
import com.jonsuapps.rastro.android.ui.components.MascotMood
import com.jonsuapps.rastro.android.ui.components.OrsttyMascot
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.android.data.GamificationRepository
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun LessonEngineScreen(
    lessonId: String,
    onFinishLesson: () -> Unit,
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val hearts by GamificationManager.hearts.collectAsState()
    val currentUser by UserManager.currentUser.collectAsState()

    // Cargar lección
    val lesson = remember(lessonId) {
        AprenderRepository.getLessonById(lessonId)
            ?: AprenderRepository.getSampleLessonsForSubject("biologia").first()
    }

    // Las preguntas falladas vuelven una vez en la fase Fénix, después del bloque original.
    val missedChallenges = remember { mutableStateListOf<Challenge>() }

    var currentStep by remember { mutableIntStateOf(-1) } // -1: Inicio, 0: Teoría, 1..N: Retos
    var selectedOptionIndex by remember { mutableStateOf<Int?>(null) }
    var selectedBlankAnswer by remember { mutableStateOf<String?>(null) }
    var selectedLeftIndex by remember { mutableStateOf<Int?>(null) }
    var selectedRightIndex by remember { mutableStateOf<Int?>(null) }
    var matchedPairIndices by remember { mutableStateOf<Map<Int, Int>>(emptyMap()) }
    var isAnswerChecked by remember { mutableStateOf(false) }
    var isCorrectAnswer by remember { mutableStateOf(false) }
    var correctAnswers by remember { mutableIntStateOf(0) }
    var showExitConfirmDialog by remember { mutableStateOf(false) }
    var firstPassCorrect by remember { mutableIntStateOf(0) }
    val previouslyCompleted = remember(lessonId) {
        GamificationManager.state.value.completedLessons[lessonId]?.skipped == false
    }
    val earnedStars = when {
        firstPassCorrect >= lesson.challenges.size -> 3
        firstPassCorrect * 2 >= lesson.challenges.size -> 2
        else -> 1
    }
    val earnedXp = if (previouslyCompleted) 0 else 25 + correctAnswers * 5
    var isLessonCompleted by remember { mutableStateOf(false) }
    var isRedemptionPhase by remember { mutableStateOf(false) }
    var showRedemptionModal by remember { mutableStateOf(false) }

    val currentChallenge = if (currentStep > 0) {
        if (isRedemptionPhase) {
            missedChallenges.getOrNull(currentStep - lesson.challenges.size - 1)
        } else {
            lesson.challenges.getOrNull(currentStep - 1)
        }
    } else null

    val totalSteps = lesson.challenges.size + missedChallenges.size + 2
    val progress = ((currentStep + 1).coerceAtLeast(0).toFloat() / totalSteps.coerceAtLeast(1)).coerceIn(0f, 1f)

    // Diálogo Modo Fénix / Redención 3D Cartoon
    if (showRedemptionModal) {
        RedemptionPhoenixDialog(
            missedCount = missedChallenges.size,
            onDismiss = { showRedemptionModal = false }
        )
    }

    // Diálogo "¿Ya te vas?" con estilo 3D Cartoon y Mascota
    if (showExitConfirmDialog) {
        com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
            onDismissRequest = { showExitConfirmDialog = false },
            title = "¿Ya te vas?",
            message = "Si sales ahora, perderás el avance acumulado en esta lección y tendrás que iniciarla nuevamente.",
            confirmText = "Salir de la Lección",
            cancelText = "¡Continuar Estudiando!",
            isDestructive = true,
            stackButtons = true,
            headerContent = {
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFFEF2F2))
                        .border(2.dp, Color(0xFFFCA5A5), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    ArtyonMascot(size = 64.dp, mood = MascotMood.SAD)
                }
            },
            theme = theme,
            onConfirm = {
                showExitConfirmDialog = false
                onFinishLesson()
            }
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background)
    ) {
        // Cabecera Superior: Salir (X), Barra de Progreso y Vidas
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { showExitConfirmDialog = true },
                modifier = Modifier
                    .size(36.dp)
                    .clip(RastroShapes.Pill)
                    .background(theme.surface)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Close,
                    contentDescription = "Salir de la lección",
                    tint = theme.textSecondary,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .weight(1f)
                    .height(8.dp)
                    .clip(RastroShapes.Pill),
                color = theme.accent,
                trackColor = theme.surfaceAccent
            )

            Spacer(modifier = Modifier.width(12.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Rounded.Favorite,
                    contentDescription = "Vidas",
                    tint = Color(0xFFEF4444),
                    modifier = Modifier.size(22.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "$hearts",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = theme.textPrimary
                )
            }
        }

        // Cuerpo Principal
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            when {
                // Pantalla de Victoria / Finalización
                isLessonCompleted -> {
                    LessonVictoryView(
                        lessonTitle = lesson.title,
                        stars = earnedStars,
                        earnedXp = earnedXp,
                        theme = theme,
                        onContinue = {
                            GamificationManager.recordLessonCompletion(
                                lessonId = lesson.id,
                                earnedXp = earnedXp,
                                stars = earnedStars
                            )
                            GamificationRepository.saveLocal(currentUser.uid, GamificationManager.state.value)
                            if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
                                GamificationRepository.save(currentUser.uid, GamificationManager.state.value)
                            }
                            onFinishLesson()
                        }
                    )
                }

                // Paso 0: Teoría explicativa previa obligatoria
                currentStep == -1 -> {
                    LessonStartCard(
                        lesson = lesson,
                        theme = theme,
                        onStart = { currentStep = 0 }
                    )
                }

                currentStep == 0 -> {
                    GoodNotesTheoryCard(
                        theory = lesson.theory,
                        theme = theme,
                        onStartChallenges = {
                            currentStep = 1
                            selectedOptionIndex = null
                            selectedBlankAnswer = null
                            matchedPairIndices = emptyMap()
                            isAnswerChecked = false
                        }
                    )
                }

                // Pasos 1..N: Reto interactivo de opción múltiple
                currentChallenge != null -> {
                    ChallengeQuestionView(
                        challenge = currentChallenge,
                        stepNumber = if (isRedemptionPhase) currentStep - lesson.challenges.size else currentStep,
                        totalChallenges = if (isRedemptionPhase) missedChallenges.size else lesson.challenges.size,
                        isRedemptionPhase = isRedemptionPhase,
                        selectedOptionIndex = selectedOptionIndex,
                        selectedBlankAnswer = selectedBlankAnswer,
                        matchedPairIndices = matchedPairIndices,
                        isAnswerChecked = isAnswerChecked,
                        isCorrectAnswer = isCorrectAnswer,
                        theme = theme,
                        onOptionSelected = { idx ->
                            if (!isAnswerChecked) {
                                selectedOptionIndex = idx
                            }
                        },
                        onBlankSelected = { value -> if (!isAnswerChecked) selectedBlankAnswer = value },
                        onMatchLeftSelected = { idx ->
                            if (!isAnswerChecked) {
                                val selectedRight = selectedRightIndex
                                if (selectedRight != null) {
                                    matchedPairIndices = matchedPairIndices + (idx to selectedRight)
                                    selectedLeftIndex = null
                                    selectedRightIndex = null
                                } else if (matchedPairIndices.containsKey(idx)) {
                                    matchedPairIndices = matchedPairIndices - idx
                                    selectedLeftIndex = idx
                                } else selectedLeftIndex = idx
                            }
                        },
                        onMatchRightSelected = { idx ->
                            if (!isAnswerChecked) {
                                val selectedLeft = selectedLeftIndex
                                if (selectedLeft != null) {
                                    matchedPairIndices = matchedPairIndices + (selectedLeft to idx)
                                    selectedLeftIndex = null
                                    selectedRightIndex = null
                                } else selectedRightIndex = idx
                            }
                        },
                        selectedLeftIndex = selectedLeftIndex,
                        selectedRightIndex = selectedRightIndex,
                        onCheckAnswer = {
                            val correct = when (currentChallenge.type) {
                                ChallengeType.MULTIPLE_CHOICE -> selectedOptionIndex == currentChallenge.correctIndex
                                ChallengeType.FILL_BLANK -> selectedBlankAnswer.equals(currentChallenge.correctText, ignoreCase = true)
                                ChallengeType.MATCH_PAIRS -> currentChallenge.pairs.indices.all { leftIndex ->
                                    val rightIndex = matchedPairIndices[leftIndex]
                                    rightIndex != null && currentChallenge.rightOptions.getOrNull(rightIndex)?.id == currentChallenge.pairs[leftIndex].id
                                }
                            }
                            isCorrectAnswer = correct
                            isAnswerChecked = true
                            if (correct) {
                                correctAnswers += 1
                                if (!isRedemptionPhase) firstPassCorrect += 1
                                DuolingoHaptics.playAnswerCorrect(context)
                            } else {
                                DuolingoHaptics.playAnswerIncorrect(context)
                                GamificationManager.loseHeart()
                                if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
                                    GamificationRepository.save(currentUser.uid, GamificationManager.state.value)
                                }
                                // No se duplica una pregunta fallada ni se vuelve a encolar en la revancha.
                                if (!isRedemptionPhase && missedChallenges.none { it.id == currentChallenge.id }) {
                                    missedChallenges.add(currentChallenge)
                                }
                            }
                        },
                        onNextStep = {
                            if (!isRedemptionPhase && currentStep < lesson.challenges.size) {
                                currentStep++
                                selectedOptionIndex = null
                                selectedBlankAnswer = null
                                selectedLeftIndex = null
                                selectedRightIndex = null
                                matchedPairIndices = emptyMap()
                                isAnswerChecked = false
                            } else if (!isRedemptionPhase && missedChallenges.isNotEmpty()) {
                                isRedemptionPhase = true
                                showRedemptionModal = true
                                currentStep = lesson.challenges.size + 1
                                selectedOptionIndex = null
                                selectedBlankAnswer = null
                                selectedLeftIndex = null
                                selectedRightIndex = null
                                matchedPairIndices = emptyMap()
                                isAnswerChecked = false
                            } else if (isRedemptionPhase && currentStep < lesson.challenges.size + missedChallenges.size) {
                                currentStep++
                                selectedOptionIndex = null
                                selectedBlankAnswer = null
                                selectedLeftIndex = null
                                selectedRightIndex = null
                                matchedPairIndices = emptyMap()
                                isAnswerChecked = false
                            } else {
                                isLessonCompleted = true
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun LessonStartCard(
    lesson: LessonNode,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onStart: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(18.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RastroShapes.Squircle,
            colors = CardDefaults.cardColors(containerColor = theme.surface),
            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
        ) {
            Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(13.dp)) {
                val subtemaTag = if (lesson.subtema.isNotBlank()) " • SUBTEMA ${lesson.subtema}" else ""
                Text("${lesson.theory.asignatura.uppercase()} • SEMANA ${lesson.semana}$subtemaTag", color = theme.accent, fontSize = 11.sp, fontWeight = FontWeight.Black)
                Text(lesson.theory.titulo, color = theme.textPrimary, fontSize = 23.sp, lineHeight = 28.sp, fontWeight = FontWeight.Bold)
                val topicLabel = if (lesson.subtema.isNotBlank()) "Subtema ${lesson.subtema} • ${lesson.title}" else "Temario oficial • ${lesson.title}"
                Text(topicLabel, color = theme.accent, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Surface(shape = RastroShapes.Squircle, color = theme.surfaceAccent) {
                    val retosLabel = if (lesson.subtema.isNotBlank()) "◎  Subtema ${lesson.subtema} (${lesson.challenges.size} retos interactivos)" else "◎  ${lesson.challenges.size} retos interactivos"
                    Text(retosLabel, modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp), color = theme.textPrimary, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                }
                Text(
                    "Domina este tema del prospecto y practica con preguntas oficiales.",
                    color = theme.textSecondary,
                    fontSize = 13.sp,
                    lineHeight = 19.sp
                )
                Surface(shape = RastroShapes.Squircle, color = theme.surfaceAccent) {
                    Row(modifier = Modifier.fillMaxWidth().padding(12.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("Recompensa de expedición", color = theme.textSecondary, fontSize = 12.sp)
                        Text("+25 XP ⚡", color = theme.accent, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                    }
                }
                Sticker3dButton(
                    onClick = onStart,
                    modifier = Modifier.fillMaxWidth().height(52.dp),
                    containerColor = theme.accent,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill,
                    contentPadding = PaddingValues(vertical = 12.dp)
                ) {
                    Icon(Icons.Rounded.PlayArrow, contentDescription = null, tint = Color.White)
                    Spacer(Modifier.width(6.dp))
                    Text("COMENZAR LECCIÓN (+25 XP)", fontWeight = FontWeight.Black, color = Color.White)
                }
            }
        }
    }
}

@Composable
fun GoodNotesTheoryCard(
    theory: LessonTheory,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onStartChallenges: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Título de Teoría
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Rounded.MenuBook,
                contentDescription = null,
                tint = theme.accent,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Paso 0: Teoría Esencial",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = theme.accent
            )
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RastroShapes.Squircle,
            colors = CardDefaults.cardColors(containerColor = theme.surface),
            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = theory.titulo,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = theme.textPrimary
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = theory.resumen,
                    style = MaterialTheme.typography.bodyMedium,
                    color = theme.textSecondary,
                    lineHeight = 20.sp
                )

                theory.formulaLatex?.takeIf(String::isNotBlank)?.let { formulaLatex ->
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(theory.formulaName ?: "Fórmula fundamental", style = MaterialTheme.typography.labelLarge, fontWeight = FontWeight.Bold, color = theme.accent)
                    Box(
                        modifier = Modifier.fillMaxWidth().clip(RastroShapes.Squircle).background(theme.surfaceAccent).padding(12.dp)
                    ) {
                        Text(readableLessonFormula(formulaLatex), style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = theme.accent, lineHeight = 22.sp)
                    }
                    theory.formulaDescription?.takeIf(String::isNotBlank)?.let { formulaDescription ->
                        Text(formulaDescription, style = MaterialTheme.typography.bodySmall, color = theme.textSecondary, lineHeight = 17.sp)
                    }
                }

                if (theory.conceptosClave.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = "Conceptos Clave de Admisión",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    theory.conceptosClave.forEach { concepto ->
                        Row(
                            modifier = Modifier.padding(vertical = 3.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Text(
                                text = "• ",
                                color = theme.accent,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = concepto,
                                style = MaterialTheme.typography.bodySmall,
                                color = theme.textPrimary,
                                lineHeight = 16.sp
                            )
                        }
                    }
                }

                if (theory.formulas.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = "Fórmulas Fundamentales",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    theory.formulas.forEach { formula ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clip(RastroShapes.Squircle)
                                .background(theme.surfaceAccent)
                                .padding(10.dp)
                        ) {
                            Text(
                                text = readableLessonFormula(formula),
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.SemiBold,
                                color = theme.accent
                            )
                        }
                    }
                }

                if (!theory.admissionTip.isNullOrBlank()) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth().clip(RastroShapes.Squircle).background(Color(0xFFFFE4E6)).padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.LocalFireDepartment,
                                contentDescription = null,
                                tint = Color(0xFFBE123C),
                                modifier = Modifier.size(13.dp)
                            )
                            Text("CLAVE FIJA DE ADMISIÓN", color = Color(0xFFBE123C), fontSize = 10.sp, fontWeight = FontWeight.ExtraBold)
                        }
                        Text(theory.admissionTip!!, color = Color(0xFF991B1B), fontSize = 12.sp, lineHeight = 17.sp)
                        theory.admissionExplanation?.takeIf(String::isNotBlank)?.let {
                            Text(it, color = Color(0xFF7F1D1D), fontSize = 11.sp, lineHeight = 16.sp)
                        }
                    }
                }

                if (theory.advertenciasErroresComunes.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(14.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RastroShapes.Squircle)
                            .background(Color(0xFFFEF3C7))
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Warning,
                            contentDescription = "Advertencia",
                            tint = Color(0xFFD97706),
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            theory.advertenciasErroresComunes.forEach { adv ->
                                Text(
                                    text = adv,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color(0xFF78350F),
                                    lineHeight = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f, fill = false))

        Sticker3dButton(
            onClick = onStartChallenges,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            containerColor = theme.accent,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            shape = RastroShapes.Pill,
            contentPadding = PaddingValues(vertical = 12.dp)
        ) {
            Text(
                text = "ENTENDIDO, ¡PONER A PRUEBA!  →",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Color.White
            )
        }
    }
}

private fun readableLessonFormula(value: String): String = value
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
fun ChallengeQuestionView(
    challenge: Challenge,
    stepNumber: Int,
    totalChallenges: Int,
    isRedemptionPhase: Boolean,
    selectedOptionIndex: Int?,
    selectedBlankAnswer: String?,
    matchedPairIndices: Map<Int, Int>,
    selectedLeftIndex: Int?,
    selectedRightIndex: Int?,
    isAnswerChecked: Boolean,
    isCorrectAnswer: Boolean,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onOptionSelected: (Int) -> Unit,
    onBlankSelected: (String) -> Unit,
    onMatchLeftSelected: (Int) -> Unit,
    onMatchRightSelected: (Int) -> Unit,
    onCheckAnswer: () -> Unit,
    onNextStep: () -> Unit
) {
    val context = LocalContext.current
    var showExplanationModal by remember { mutableStateOf(false) }
    var showReportModal by remember { mutableStateOf(false) }
    var reportSent by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .padding(bottom = 140.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                    Icon(
                        imageVector = if (isRedemptionPhase) Icons.Rounded.LocalFireDepartment else Icons.Rounded.TrackChanges,
                        contentDescription = null,
                        tint = if (isRedemptionPhase) Color(0xFFEF4444) else theme.accent,
                        modifier = Modifier.size(14.dp)
                    )
                    Text(
                        text = if (isRedemptionPhase) "MODO FÉNIX • REDENCIÓN" else "PRÁCTICA OFICIAL • ${challenge.subject.uppercase()}",
                        style = MaterialTheme.typography.labelSmall,
                        color = if (isRedemptionPhase) Color(0xFFEF4444) else theme.accent,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
                Text("Reto $stepNumber de $totalChallenges • Semana ${challenge.semana}", fontSize = 10.sp, color = theme.textSecondary, fontWeight = FontWeight.Bold)
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                if (stepNumber % 2 == 0) OrsttyMascot(size = 46.dp, mood = MascotMood.STUDYING)
                else ArtyonMascot(size = 46.dp, mood = MascotMood.STUDYING)
                Text(
                    text = challenge.instruction?.takeIf(String::isNotBlank)
                        ?: if (isRedemptionPhase) "Revisa la explicación oficial y responde con seguridad." else "Aplica el principio general estudiado para deducir la solución correcta:",
                    modifier = Modifier.weight(1f).clip(RastroShapes.Squircle).background(theme.surface).border(1.dp, theme.borderSubtle, RastroShapes.Squircle).padding(12.dp),
                    color = theme.textPrimary,
                    fontSize = 12.sp,
                    lineHeight = 17.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            challenge.pedagogicalTier?.takeIf(String::isNotBlank)?.let { tier ->
                Text(tier, color = theme.accent, fontSize = 10.sp, fontWeight = FontWeight.Bold)
            }

            Text(
                text = challenge.statement,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = theme.textPrimary,
                lineHeight = 22.sp
            )

            when (challenge.type) {
                ChallengeType.MULTIPLE_CHOICE -> challenge.options.forEachIndexed { index, optionText ->
                    val isSelected = selectedOptionIndex == index
                    val isCorrectChoice = index == challenge.correctIndex

                    val strokeColor = when {
                        isAnswerChecked && isCorrectChoice -> Color(0xFF10B981)
                        isAnswerChecked && isSelected && !isCorrectAnswer -> Color(0xFFEF4444)
                        isSelected -> theme.accent
                        else -> theme.strokeBorder
                    }

                    val containerColor = when {
                        isAnswerChecked && isCorrectChoice -> Color(0xFFDCFCE7)
                        isAnswerChecked && isSelected && !isCorrectAnswer -> Color(0xFFFEE2E2)
                        isSelected -> theme.accent.copy(alpha = 0.12f)
                        else -> theme.surface
                    }

                    val bevelColor = when {
                        isAnswerChecked && isCorrectChoice -> Color(0xFF16A34A)
                        isAnswerChecked && isSelected && !isCorrectAnswer -> Color(0xFFDC2626)
                        isSelected -> theme.cardBevel
                        else -> theme.cardBevel
                    }

                    Sticker3dCard(
                        onClick = if (!isAnswerChecked) {
                            {
                                DuolingoHaptics.playOptionSelected(context)
                                onOptionSelected(index)
                            }
                        } else null,
                        containerColor = containerColor,
                        bottomBevelColor = bevelColor,
                        strokeColor = strokeColor,
                        strokeWidth = 2.dp,
                        bevelHeight = 4.dp,
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val optionLetter = ('A' + index).toString()
                            Box(
                                modifier = Modifier
                                    .size(34.dp)
                                    .clip(CircleShape)
                                    .background(if (isSelected) theme.accent else theme.surfaceAccent)
                                    .border(1.5.dp, theme.strokeBorder, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = optionLetter,
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Black,
                                    color = if (isSelected) Color.White else theme.textPrimary
                                )
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            Text(
                                text = optionText,
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.SemiBold,
                                color = theme.textPrimary,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
                ChallengeType.FILL_BLANK -> {
                    val before = challenge.sentenceBefore ?: challenge.statement.substringBefore("___", "")
                    val after = challenge.sentenceAfter ?: challenge.statement.substringAfter("___", "")
                    Surface(shape = RastroShapes.Squircle, color = theme.surface, border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)) {
                        Column(Modifier.fillMaxWidth().padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(before, color = theme.textPrimary, fontWeight = FontWeight.SemiBold, lineHeight = 22.sp, modifier = Modifier.weight(1f, fill = false))
                                Spacer(Modifier.width(5.dp))
                                Text(selectedBlankAnswer ?: "________", color = theme.accent, fontWeight = FontWeight.ExtraBold, modifier = Modifier.clip(RoundedCornerShape(8.dp)).background(theme.surfaceAccent).padding(horizontal = 8.dp, vertical = 4.dp))
                                Spacer(Modifier.width(5.dp))
                                Text(after, color = theme.textPrimary, fontWeight = FontWeight.SemiBold, lineHeight = 22.sp, modifier = Modifier.weight(1f, fill = false))
                            }
                            Text("Toca la palabra que completa la proposición:", fontSize = 11.sp, color = theme.textSecondary)
                        }
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                        challenge.chips.forEach { chip ->
                            val selected = selectedBlankAnswer == chip
                            Sticker3dButton(
                                onClick = {
                                    if (!isAnswerChecked) {
                                        DuolingoHaptics.playOptionSelected(context)
                                        onBlankSelected(chip)
                                    }
                                },
                                containerColor = if (selected) theme.accent else theme.surface,
                                bottomBevelColor = if (selected) theme.cardBevel else Color(0xFFCBD5E1),
                                strokeColor = theme.strokeBorder,
                                shape = RoundedCornerShape(14.dp),
                                bevelHeight = 3.dp,
                                contentPadding = PaddingValues(horizontal = 6.dp, vertical = 10.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = chip,
                                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                                    color = if (selected) Color.White else theme.textPrimary,
                                    fontWeight = FontWeight.Black,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
                ChallengeType.MATCH_PAIRS -> {
                    val matchedCount = matchedPairIndices.size
                    Surface(shape = RastroShapes.Squircle, color = theme.surfaceAccent) {
                        Row(modifier = Modifier.fillMaxWidth().padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                            Text(if (selectedLeftIndex != null) "Elige su definición a la derecha" else if (selectedRightIndex != null) "Elige el concepto correspondiente" else "Toca un concepto y su definición", color = theme.textSecondary, fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                            Text("$matchedCount / ${challenge.pairs.size}", color = Color(0xFF10B981), fontWeight = FontWeight.Bold, fontSize = 11.sp)
                        }
                    }
                    val rightOptions = challenge.rightOptions.ifEmpty {
                        challenge.pairs.map { com.jonsuapps.rastro.model.ChallengeMatchOption(it.id, it.right) }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.Top) {
                        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            challenge.pairs.forEachIndexed { index, pair ->
                                val linked = matchedPairIndices[index]
                                val isPairCorrect = linked != null && rightOptions.getOrNull(linked)?.id == pair.id
                                val borderColor = when {
                                    isAnswerChecked && isPairCorrect -> Color(0xFF10B981)
                                    isAnswerChecked && !isPairCorrect -> Color(0xFFEF4444)
                                    selectedLeftIndex == index -> theme.accent
                                    else -> theme.borderSubtle
                                }
                                Surface(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .bouncyClick(scaleDown = 0.95f) {
                                            if (!isAnswerChecked) {
                                                DuolingoHaptics.playOptionSelected(context)
                                                onMatchLeftSelected(index)
                                            }
                                        },
                                    shape = RastroShapes.Squircle,
                                    color = when { isAnswerChecked && isPairCorrect -> Color(0xFFD1FAE5); isAnswerChecked && !isPairCorrect -> Color(0xFFFEE2E2); selectedLeftIndex == index -> theme.accent.copy(alpha = 0.10f); else -> theme.surface },
                                    border = androidx.compose.foundation.BorderStroke(1.5.dp, borderColor)
                                ) {
                                    Text(pair.left, modifier = Modifier.padding(9.dp), color = theme.textPrimary, fontWeight = FontWeight.SemiBold, fontSize = 11.sp, lineHeight = 15.sp)
                                }
                            }
                        }
                        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            rightOptions.forEachIndexed { index, option ->
                                val isUsed = matchedPairIndices.values.contains(index)
                                val linkedLeft = matchedPairIndices.entries.firstOrNull { it.value == index }?.key
                                val isRightCorrect = linkedLeft?.let { left -> challenge.pairs.getOrNull(left)?.id == option.id } == true
                                val borderColor = when {
                                    isAnswerChecked && isRightCorrect -> Color(0xFF10B981)
                                    isAnswerChecked && linkedLeft != null -> Color(0xFFEF4444)
                                    selectedRightIndex == index -> theme.accent
                                    else -> theme.borderSubtle
                                }
                                Surface(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .bouncyClick(scaleDown = 0.95f) {
                                            if (!isAnswerChecked && !isUsed) {
                                                DuolingoHaptics.playOptionSelected(context)
                                                onMatchRightSelected(index)
                                            }
                                        },
                                    shape = RastroShapes.Squircle,
                                    color = when { isAnswerChecked && isRightCorrect -> Color(0xFFD1FAE5); isAnswerChecked && linkedLeft != null -> Color(0xFFFEE2E2); selectedRightIndex == index -> theme.accent.copy(alpha = 0.10f); else -> theme.surface },
                                    border = androidx.compose.foundation.BorderStroke(1.5.dp, borderColor)
                                ) {
                                    Text(option.text, modifier = Modifier.padding(9.dp), color = theme.textPrimary, fontWeight = FontWeight.Medium, fontSize = 10.sp, lineHeight = 14.sp)
                                }
                            }
                        }
                    }
                }
            }
        }

        // 2. Barrita Fija Inferior Estilo Duolingo
        val responseComplete = when (challenge.type) {
            ChallengeType.MULTIPLE_CHOICE -> selectedOptionIndex != null
            ChallengeType.FILL_BLANK -> selectedBlankAnswer != null
            ChallengeType.MATCH_PAIRS -> challenge.pairs.isNotEmpty() && matchedPairIndices.size == challenge.pairs.size
        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            color = when {
                isAnswerChecked && isCorrectAnswer -> Color(0xFFDCFCE7)
                isAnswerChecked && !isCorrectAnswer -> Color(0xFFFEE2E2)
                else -> theme.surface
            },
            shadowElevation = 18.dp,
            border = androidx.compose.foundation.BorderStroke(
                2.dp,
                when {
                    isAnswerChecked && isCorrectAnswer -> Color(0xFF16A34A)
                    isAnswerChecked && !isCorrectAnswer -> Color(0xFFDC2626)
                    else -> theme.strokeBorder
                }
            ),
            shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 14.dp)
            ) {
                if (!isAnswerChecked) {
                    // Botón COMPROBAR fijo
                    Sticker3dButton(
                        onClick = onCheckAnswer,
                        enabled = responseComplete,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp),
                        containerColor = if (responseComplete) theme.accent else Color(0xFFCBD5E1),
                        bottomBevelColor = if (responseComplete) theme.cardBevel else Color(0xFF94A3B8),
                        strokeColor = theme.strokeBorder,
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(vertical = 12.dp)
                    ) {
                        Text(
                            text = "COMPROBAR RESPUESTA",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Black,
                            color = if (responseComplete) Color.White else Color(0xFF64748B)
                        )
                    }
                } else {
                    // Banner Duolingo
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            if (isCorrectAnswer) {
                                OrsttyMascot(size = 46.dp, mood = MascotMood.CHEERING)
                                Column {
                                    Text("¡Excelente!", fontWeight = FontWeight.Black, fontSize = 16.sp, color = Color(0xFF15803D))
                                    Text("Respuesta correcta • +5 XP 🎯", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color(0xFF16A34A))
                                }
                            } else {
                                ArtyonMascot(size = 46.dp, mood = MascotMood.STUDYING)
                                Column {
                                    Text("¡Vamos a repasarlo!", fontWeight = FontWeight.Black, fontSize = 15.sp, color = Color(0xFFB91C1C))
                                    Text("Toca '💡 Truquito' para ver la clave", fontSize = 11.sp, fontWeight = FontWeight.Medium, color = Color(0xFF7F1D1D))
                                }
                            }
                        }

                        // Botones auxiliares: Reportar y Truquito
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            IconButton(
                                onClick = { showReportModal = true },
                                modifier = Modifier.size(36.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.Warning,
                                    contentDescription = "Reportar pregunta",
                                    tint = if (isCorrectAnswer) Color(0xFF15803D) else Color(0xFFB91C1C),
                                    modifier = Modifier.size(20.dp)
                                )
                            }

                            if (!isCorrectAnswer) {
                                Sticker3dButton(
                                    onClick = { showExplanationModal = true },
                                    containerColor = Color(0xFFFEF08A),
                                    bottomBevelColor = Color(0xFFCA8A04),
                                    strokeColor = theme.strokeBorder,
                                    shape = RoundedCornerShape(12.dp),
                                    bevelHeight = 2.5.dp,
                                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp)
                                ) {
                                    Icon(Icons.Rounded.Lightbulb, contentDescription = null, tint = Color(0xFF854D0E), modifier = Modifier.size(15.dp))
                                    Spacer(Modifier.width(4.dp))
                                    Text("💡 Truquito", fontSize = 11.sp, fontWeight = FontWeight.Black, color = Color(0xFF854D0E))
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(10.dp))

                    // Botón CONTINUAR fijo
                    Sticker3dButton(
                        onClick = onNextStep,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        containerColor = if (isCorrectAnswer) Color(0xFF22C55E) else theme.accent,
                        bottomBevelColor = if (isCorrectAnswer) Color(0xFF15803D) else theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(vertical = 12.dp)
                    ) {
                        Text(
                            text = if (isCorrectAnswer) "¡CONTINUAR! →" else "ENTENDIDO, CONTINUAR →",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Black,
                            color = Color.White
                        )
                    }
                }
            }
        }

        // Modal de Truquito y Explicación
        if (showExplanationModal) {
            com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
                onDismissRequest = { showExplanationModal = false },
                title = "💡 Truquito y Explicación Oficial",
                message = if (challenge.explanation.isNotBlank()) challenge.explanation else "Esta pregunta volverá al final en el Modo Fénix para que la domines sin perder racha.",
                confirmText = "¡Entendido!",
                cancelText = "Cerrar",
                icon = Icons.Rounded.Lightbulb,
                theme = theme,
                onConfirm = { showExplanationModal = false }
            )
        }

        // Modal de Reportar Pregunta
        if (showReportModal) {
            com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
                onDismissRequest = { showReportModal = false },
                title = if (reportSent) "Reporte Enviado" else "Reportar Pregunta",
                message = if (reportSent) "¡Muchas gracias! Nuestro equipo revisará esta pregunta a la brevedad." else "¿Notaste algún error ortográfico o clave incorrecta en este reto preuniversitario?",
                confirmText = if (reportSent) "Aceptar" else "Enviar Reporte",
                cancelText = "Cancelar",
                icon = Icons.Rounded.Warning,
                theme = theme,
                onConfirm = {
                    if (!reportSent) {
                        reportSent = true
                    } else {
                        showReportModal = false
                        reportSent = false
                    }
                }
            )
        }
    }
}

@Composable
fun LessonVictoryView(
    lessonTitle: String,
    stars: Int,
    earnedXp: Int,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onContinue: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Dúo Oficial Orstty + Artyon Celebrando en Pantalla de Victoria (Estilo Duolingo)
        DualMascotDuo(size = 84.dp)
        Spacer(Modifier.height(14.dp))
        EarnedStars(stars)

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "¡Lección Superada!",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = theme.textPrimary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = lessonTitle,
            style = MaterialTheme.typography.bodyMedium,
            color = theme.textSecondary
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Recompensas: XP y Racha con estilo 3D Sticker
        Sticker3dCard(
            shape = RoundedCornerShape(20.dp),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            strokeWidth = 2.dp,
            bevelHeight = 4.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = if (earnedXp > 0) "+$earnedXp XP" else "Repaso",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Black,
                        color = Color(0xFFF59E0B)
                    )
                    Text(
                        text = if (earnedXp > 0) "Puntos ganados" else "Mejora tus estrellas",
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.textSecondary
                    )
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Rounded.LocalFireDepartment,
                            contentDescription = null,
                            tint = Color(0xFFF97316),
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Activa",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Black,
                            color = Color(0xFFF97316)
                        )
                    }
                    Text(
                        text = "Racha de Hoy",
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.textSecondary
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Sticker3dButton(
            onClick = onContinue,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            containerColor = Color(0xFF22C55E),
            bottomBevelColor = Color(0xFF15803D),
            strokeColor = theme.strokeBorder,
            shape = RastroShapes.Pill,
            contentPadding = PaddingValues(vertical = 12.dp)
        ) {
            Text(
                text = "CONTINUAR",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Color.White
            )
        }
    }
}

/**
 * Diálogo 3D Cartoon para la fase de Redención / Modo Fénix.
 * Estimula al estudiante a recuperar las preguntas falladas con estética de fuego y renacimiento.
 */
@Composable
private fun RedemptionPhoenixDialog(
    missedCount: Int,
    onDismiss: () -> Unit
) {
    val theme = com.jonsuapps.rastro.theme.ThemeManager.currentTheme
    Dialog(
        onDismissRequest = onDismiss,
        properties = androidx.compose.ui.window.DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Sticker3dCard(
            shape = RoundedCornerShape(26.dp),
            containerColor = theme.surface,
            bottomBevelColor = Color(0xFFC2410C),
            strokeColor = theme.strokeBorder,
            bevelHeight = 5.dp,
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .padding(horizontal = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Flame icon in 3D badge
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xFFFFEDD5))
                        .border(2.dp, Color(0xFFF97316), RoundedCornerShape(20.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Rounded.LocalFireDepartment,
                        contentDescription = null,
                        tint = Color(0xFFEA580C),
                        modifier = Modifier.size(36.dp)
                    )
                }

                Spacer(Modifier.height(14.dp))

                Text(
                    text = "🔥 ¡ACTIVANDO MODO FÉNIX!",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Black,
                    color = Color(0xFFEA580C),
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center
                )

                Spacer(Modifier.height(8.dp))

                Text(
                    text = "¡Es tu momento de renacer! Tienes $missedCount reto(s) donde tuviste dudas. Vamos a reforzarlos ahora mismo para que ningún tema quede flojo para tu examen de admisión.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = theme.textSecondary,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                    lineHeight = 20.sp
                )

                Spacer(Modifier.height(22.dp))

                Sticker3dButton(
                    onClick = onDismiss,
                    containerColor = Color(0xFFF97316),
                    bottomBevelColor = Color(0xFFC2410C),
                    strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    contentPadding = PaddingValues(vertical = 12.dp)
                ) {
                    Text(
                        text = "¡ESTOY LISTO PARA LA REDENCIÓN! 🔥",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Black,
                        color = Color.White
                    )
                }
            }
        }
    }
}
