package com.jonsuapps.rastro.android.ui.screens
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.onAccent

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.mutableLongStateOf
import com.jonsuapps.rastro.model.LessonComboState
import com.jonsuapps.rastro.model.ComboEvent
import com.jonsuapps.rastro.android.ui.components.LessonComboSaver
import com.jonsuapps.rastro.android.ui.components.LessonComboIndicator
import com.jonsuapps.rastro.android.ui.components.ComboMilestoneEffect
import com.jonsuapps.rastro.android.ui.components.resolveComboEffect
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
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
import androidx.compose.runtime.LaunchedEffect
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
import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.android.ui.components.MascotMood
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.android.data.GamificationRepository
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.ChallengeInteraction
import com.jonsuapps.rastro.model.MatchAnswerState
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
    var retry by remember(lessonId) { mutableIntStateOf(0) }
    val loaded by androidx.compose.runtime.produceState<Result<LessonNode>?>(null, lessonId, retry) {
        value = null
        value = try {
            kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                val node = AprenderRepository.getLessonById(lessonId)
                    ?: error("No se encontró esta lección.")
                Result.success(com.jonsuapps.rastro.model.LessonSpecialActivities.prepare(node))
            }
        } catch (cancelled: kotlinx.coroutines.CancellationException) {
            throw cancelled
        } catch (error: Exception) {
            Result.failure(error)
        }
    }
    val lesson = loaded?.getOrNull()
    if (lesson != null) {
        LoadedLessonEngineScreen(lessonId, lesson, onFinishLesson, modifier)
    } else {
        val theme = ThemeManager.currentTheme
        androidx.activity.compose.BackHandler { onFinishLesson() }
        Column(modifier.fillMaxSize().background(theme.background).padding(24.dp),
            verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(if (loaded == null) "Cargando lección…" else "No se pudo cargar esta lección.", color = theme.textPrimary)
            if (loaded != null) TextButton(onClick = { retry++ }) { Text("Reintentar", color = theme.accentText) }
            TextButton(onClick = onFinishLesson) { Text("Volver", color = theme.textPrimary) }
        }
    }
}

@Composable
private fun LoadedLessonEngineScreen(
    lessonId: String,
    lesson: LessonNode,
    onFinishLesson: () -> Unit,
    modifier: Modifier
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val audio = rememberLearningAudio()
    var completedTopic by remember(lessonId) { mutableStateOf<String?>(null) }
    var topicLevelUp by remember(lessonId) { mutableStateOf(false) }
    var pendingTopicXp by remember(lessonId) { mutableIntStateOf(0) }
    val hearts by GamificationManager.hearts.collectAsState()
    val currentUser by UserManager.currentUser.collectAsState()
    val isAdmin = remember(currentUser.email) { AdminConfig.isAdmin(currentUser.email) }
    var isAutoModeEnabled by remember(lessonId) { mutableStateOf(false) }

    // Las preguntas falladas vuelven una vez en la fase Fénix, después del bloque original.
    val missedChallenges = remember(lessonId) { mutableStateListOf<Challenge>() }

    var currentStep by remember(lessonId) { mutableIntStateOf(0) } // 0: Teoría, 1..N: Retos
    var selectedOptionIndex by remember(lessonId) { mutableStateOf<Int?>(null) }
    var blankAnswers by remember(lessonId) { mutableStateOf<Map<String, String>>(emptyMap()) }
    var selectedLeftIndex by remember(lessonId) { mutableStateOf<Int?>(null) }
    var selectedRightIndex by remember(lessonId) { mutableStateOf<Int?>(null) }
    var matchState by remember(lessonId) { mutableStateOf(MatchAnswerState()) }
    var isAnswerChecked by remember(lessonId) { mutableStateOf(false) }
    var isCorrectAnswer by remember(lessonId) { mutableStateOf(false) }
    var correctAnswers by remember(lessonId) { mutableIntStateOf(0) }
    var combo by rememberSaveable(lessonId, stateSaver = LessonComboSaver) { mutableStateOf(LessonComboState()) }
    // Transient visual events are intentionally not saved/replayed on recreation.
    var comboPopEvent by remember(lessonId) { mutableIntStateOf(0) }
    var comboEffect by remember(lessonId) { mutableStateOf<ComboMilestoneEffect?>(null) }
    var comboEffectUntil by remember(lessonId) { mutableLongStateOf(0L) }
    LaunchedEffect(comboEffectUntil) {
        if (comboEffectUntil > 0L) {
            kotlinx.coroutines.delay((comboEffectUntil - android.os.SystemClock.elapsedRealtime()).coerceAtLeast(0L))
            comboEffect = null
            comboEffectUntil = 0L
        }
    }

    var showExitConfirmDialog by remember(lessonId) { mutableStateOf(false) }
    var firstPassCorrect by remember(lessonId) { mutableIntStateOf(0) }
    val previouslyCompleted = remember(lessonId) {
        GamificationManager.state.value.completedLessons[lessonId]?.skipped == false
    }
    val earnedStars = when {
        firstPassCorrect >= lesson.challenges.size -> 3
        firstPassCorrect * 2 >= lesson.challenges.size -> 2
        else -> 1
    }
    val rewardAttemptId = androidx.compose.runtime.saveable.rememberSaveable(lessonId) { java.util.UUID.randomUUID().toString() }
    var rewardDelivered by remember(lessonId) { mutableStateOf(false) }
    val fullLessonXp = 25 + correctAnswers * 5
    val lessonReward = com.jonsuapps.rastro.gamification.LessonRewardPolicy.quote(
        GamificationManager.state.value.completedLessons[lessonId], fullLessonXp, earnedStars)
    val earnedXp = lessonReward.xp
    var isLessonCompleted by remember(lessonId) { mutableStateOf(false) }
    var isRedemptionPhase by remember(lessonId) { mutableStateOf(false) }
    var showRedemptionModal by remember(lessonId) { mutableStateOf(false) }
    androidx.activity.compose.BackHandler {
        when {
            showExitConfirmDialog -> showExitConfirmDialog = false
            showRedemptionModal -> showRedemptionModal = false
            currentStep <= 0 -> onFinishLesson()
            else -> showExitConfirmDialog = true
        }
    }

    val challengeSource = if (currentStep > 0) {
        if (isRedemptionPhase) {
            missedChallenges.getOrNull(currentStep - lesson.challenges.size - 1)
        } else {
            lesson.challenges.getOrNull(currentStep - 1)
        }
    } else null

    val currentChallenge = remember(challengeSource, currentStep) {
        challengeSource?.let { challenge ->
            if (challenge.type == ChallengeType.MATCH_PAIRS) challenge.copy(
                rightOptions = ChallengeInteraction.rightOptions(challenge).shuffled()) else challenge
        }
    }
    fun attemptPair(left: Int, right: Int) {
        val challenge = currentChallenge ?: return
        val next = ChallengeInteraction.match(challenge, matchState, left, right)
        if (next != matchState) {
            audio.play(if (next.links.size > matchState.links.size) LearningSound.CORRECTA else LearningSound.INCORRECTA)
            matchState = next
        }
        selectedLeftIndex = null
        selectedRightIndex = null
    }

    // Auto-selección rápida exclusiva para ADMIN en modo prueba (sin auto-avance ni alteración de flujo)
    LaunchedEffect(currentStep, isRedemptionPhase, isAutoModeEnabled) {
        if (isAdmin && isAutoModeEnabled && currentChallenge != null && !isAnswerChecked) {
            when (currentChallenge.type) {
                ChallengeType.MULTIPLE_CHOICE -> {
                    selectedOptionIndex = currentChallenge.correctIndex
                }
                ChallengeType.FILL_BLANK -> {
                    blankAnswers = ChallengeInteraction.blanks(currentChallenge).associate { it.id to it.correctText }
                }
                ChallengeType.MATCH_PAIRS -> {
                    val autoMatches = mutableMapOf<Int, Int>()
                    currentChallenge.pairs.forEachIndexed { leftIdx, pair ->
                        val rightIdx = currentChallenge.rightOptions.indexOfFirst { it.id == pair.id }
                        if (rightIdx >= 0) {
                            autoMatches[leftIdx] = rightIdx
                        }
                    }
                    if (autoMatches.isNotEmpty()) {
                        matchState = MatchAnswerState(links = autoMatches)
                    }
                }
            }
        }
    }

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
                ClassicArtwork(ClassicAppearance.LEAVE, Modifier.size(140.dp))
            },
            theme = theme,
            onConfirm = {
                showExitConfirmDialog = false
                onFinishLesson()
            }
        )
    }

    completedTopic?.let { title ->
        LearningCelebrationDialog("¡TEMA COMPLETADO!", title, onContinue = {
            completedTopic = null
            com.jonsuapps.rastro.android.ui.components.XpDelivery.show(pendingTopicXp)
            pendingTopicXp = 0
            if (topicLevelUp) audio.play(LearningSound.LEVELUP, "lesson-level:${lesson.id}")
            else audio.play(LearningSound.OPCIONES)
            onFinishLesson()
        }) {
            PreparedAnimation("TROFEO", Modifier.size(180.dp), onProgress = { progress ->
                if (progress > 0f) audio.play(LearningSound.COMPLETADO, "topic:${lesson.subjectId}:${lesson.semana}")
            })
        }
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
                onClick = {
                    if (currentStep <= 0) {
                        onFinishLesson()
                    } else {
                        showExitConfirmDialog = true
                    }
                },
                modifier = Modifier
                    .size(36.dp)
                    .clip(RastroShapes.Pill)
                    .background(theme.surface)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                    contentDescription = "Volver",
                    tint = theme.textPrimary,
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
                color = theme.accentText,
                trackColor = theme.surfaceAccent
            )

            if (combo.value >= 2) {
                Spacer(Modifier.width(8.dp))
                LessonComboIndicator(combo.value, comboPopEvent, theme)
            }

            // Chip exclusivo para ADMIN: Auto-seleccionar respuesta correcta
            if (isAdmin) {
                Spacer(modifier = Modifier.width(10.dp))
                AdminAutoTestChip(
                    isAuto = isAutoModeEnabled,
                    onToggle = { isAutoModeEnabled = !isAutoModeEnabled }
                )
            }

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
                    if (completedTopic == null) LessonVictoryView(
                        lessonTitle = lesson.title,
                        stars = earnedStars,
                        earnedXp = earnedXp,
                        earnedCoins = lessonReward.coins,
                        answers = correctAnswers,
                        theme = theme,
                        onContinue = {
                            if (completedTopic != null || rewardDelivered) return@LessonVictoryView
                            rewardDelivered = true
                            val beforeXp = GamificationManager.state.value.xp
                            val beforeLevel = GamificationManager.state.value.level
                            val topicLessons = AprenderRepository.getLessonsForSubjectSync(lesson.subjectId)
                                .filter { it.semana == lesson.semana && it.challenges.isNotEmpty() }
                            val wasComplete = topicLessons.isNotEmpty() && topicLessons.all {
                                GamificationManager.state.value.completedLessons[it.id]?.skipped == false
                            }
                            GamificationManager.recordLessonCompletion(
                                lessonId = lesson.id,
                                earnedXp = fullLessonXp,
                                stars = earnedStars,
                                attemptId = rewardAttemptId
                            )
                            val awardedXp = GamificationManager.state.value.xp - beforeXp
                            GamificationRepository.saveLocal(currentUser.uid, GamificationManager.state.value)
                            if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
                                GamificationRepository.save(currentUser.uid, GamificationManager.state.value)
                            }
                            val leveledUp = GamificationManager.state.value.level > beforeLevel
                            val nowComplete = topicLessons.isNotEmpty() && topicLessons.all {
                                GamificationManager.state.value.completedLessons[it.id]?.skipped == false
                            }
                            if (!wasComplete && nowComplete) {
                                pendingTopicXp = awardedXp
                                topicLevelUp = leveledUp
                                completedTopic = "Completaste el Tema ${lesson.semana} de ${lesson.theory.asignatura}."
                            } else {
                                com.jonsuapps.rastro.android.ui.components.XpDelivery.show(awardedXp)
                                if (leveledUp) audio.play(LearningSound.LEVELUP, "lesson-level:${lesson.id}")
                                else audio.play(LearningSound.OPCIONES)
                                onFinishLesson()
                            }
                        }
                    )
                }

                // Paso 0: Teoría explicativa previa (Capturas 2 y 3)
                currentStep <= 0 -> {
                    LessonTheoryScreen(
                        lesson = lesson,
                        theme = theme,
                        onStartChallenges = {
                            audio.play(LearningSound.OPCIONES)
                            currentStep = 1
                            selectedOptionIndex = null
                            blankAnswers = emptyMap()
                            matchState = MatchAnswerState()
                            isAnswerChecked = false
                        }
                    )
                }

                // Pasos 1..N: Reto interactivo de opción múltiple
                currentChallenge != null -> {
                    androidx.compose.runtime.key(currentStep, isRedemptionPhase) {
                    ChallengeQuestionView(
                        challenge = currentChallenge,
                        stepNumber = if (isRedemptionPhase) currentStep - lesson.challenges.size else currentStep,
                        totalChallenges = if (isRedemptionPhase) missedChallenges.size else lesson.challenges.size,
                        isRedemptionPhase = isRedemptionPhase,
                        answerXp = if (previouslyCompleted) 1 else 5,
                        selectedOptionIndex = selectedOptionIndex,
                        blankAnswers = blankAnswers,
                        matchState = matchState,
                        isAnswerChecked = isAnswerChecked,
                        isCorrectAnswer = isCorrectAnswer,
                        theme = theme,
                        onOptionSelected = { idx ->
                            if (!isAnswerChecked) {
                                audio.play(LearningSound.OPCIONES)
                                selectedOptionIndex = idx
                            }
                        },
                        onBlankSelected = { id, value ->
                            if (!isAnswerChecked && value in ChallengeInteraction.blanks(currentChallenge).firstOrNull { it.id == id }?.options.orEmpty()) {
                                audio.play(LearningSound.OPCIONES)
                                blankAnswers = blankAnswers + (id to value)
                            }
                        },
                        onMatchLeftSelected = { idx ->
                            if (!isAnswerChecked && idx !in matchState.links) {
                                val right = selectedRightIndex
                                if (right != null) attemptPair(idx, right)
                                else { audio.play(LearningSound.OPCIONES); selectedLeftIndex = idx }
                            }
                        },
                        onMatchRightSelected = { idx ->
                            if (!isAnswerChecked && idx !in matchState.links.values) {
                                val left = selectedLeftIndex
                                if (left != null) attemptPair(left, idx)
                                else { audio.play(LearningSound.OPCIONES); selectedRightIndex = idx }
                            }
                        },
                        selectedLeftIndex = selectedLeftIndex,
                        selectedRightIndex = selectedRightIndex,
                        comboEffect = comboEffect,
                        onCheckAnswer = {
                            if (isAnswerChecked) return@ChallengeQuestionView
                            val correct = when (currentChallenge.type) {
                                ChallengeType.MULTIPLE_CHOICE -> selectedOptionIndex == currentChallenge.correctIndex
                                ChallengeType.FILL_BLANK -> ChallengeInteraction.fillingCorrect(currentChallenge, blankAnswers)
                                ChallengeType.MATCH_PAIRS -> ChallengeInteraction.matchingComplete(currentChallenge, matchState) && matchState.mistakes == 0
                            }
                            audio.play(if (correct) LearningSound.CORRECTA else LearningSound.INCORRECTA, "answer:${currentChallenge.id}:$isRedemptionPhase")
                            isCorrectAnswer = correct
                            isAnswerChecked = true
                            val comboUpdate = combo.answer("$isRedemptionPhase:$currentStep:${currentChallenge.id}", correct)
                            combo = comboUpdate.state
                            comboUpdate.events.forEach { event ->
                                when (event) {
                                    is ComboEvent.Reached -> {
                                        comboPopEvent += 1
                                        if (event.value == LessonComboState.MAX) {
                                            comboEffect = ComboMilestoneEffect.MAX_COMBO
                                            comboEffectUntil = android.os.SystemClock.elapsedRealtime() + resolveComboEffect(ComboMilestoneEffect.MAX_COMBO).durationMillis
                                        }
                                    }
                                    is ComboEvent.Broken -> { comboEffect = null; comboEffectUntil = 0L }
                                }
                            }

                            if (correct) {
                                correctAnswers += 1
                                if (!isRedemptionPhase) firstPassCorrect += 1
                                DuolingoHaptics.playAnswerCorrect(context)
                            } else {
                                DuolingoHaptics.playAnswerIncorrect(context)
                                if (currentChallenge.type == ChallengeType.MULTIPLE_CHOICE && currentChallenge.correctIndex in currentChallenge.options.indices) {
                                    com.jonsuapps.rastro.android.data.ErrorBankRepository.addFailedQuestion(
                                        com.jonsuapps.rastro.android.data.FailedQuestion(
                                            id = "Aprender:${lesson.id}:${currentChallenge.id}", subject = lesson.theory.asignatura,
                                            subtema = lesson.title, question = currentChallenge.statement,
                                            options = currentChallenge.options, correctAnswerIndex = currentChallenge.correctIndex,
                                            explanation = currentChallenge.explanation, selectedAnswerIndex = selectedOptionIndex))
                                }
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
                            comboEffect = null; comboEffectUntil = 0L
                            audio.play(LearningSound.OPCIONES)
                            if (!isRedemptionPhase && currentStep < lesson.challenges.size) {
                                currentStep++
                                selectedOptionIndex = null
                                blankAnswers = emptyMap()
                                selectedLeftIndex = null
                                selectedRightIndex = null
                                matchState = MatchAnswerState()
                                isAnswerChecked = false
                            } else if (!isRedemptionPhase && missedChallenges.isNotEmpty()) {
                                isRedemptionPhase = true
                                showRedemptionModal = true
                                currentStep = lesson.challenges.size + 1
                                selectedOptionIndex = null
                                blankAnswers = emptyMap()
                                selectedLeftIndex = null
                                selectedRightIndex = null
                                matchState = MatchAnswerState()
                                isAnswerChecked = false
                            } else if (isRedemptionPhase && currentStep < lesson.challenges.size + missedChallenges.size) {
                                currentStep++
                                selectedOptionIndex = null
                                blankAnswers = emptyMap()
                                selectedLeftIndex = null
                                selectedRightIndex = null
                                matchState = MatchAnswerState()
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
}

@Composable
fun LessonTheoryScreen(
    lesson: LessonNode,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onStartChallenges: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 18.dp, vertical = 14.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Existing theory step owns the lesson-start sequence; course banner is independent.
        ClassicArtwork(ClassicAppearance.NEW_IDEA, Modifier.align(Alignment.CenterHorizontally).size(110.dp))
        Text("Idea nueva", color = theme.accentText, fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally))
        // Badge Subheader: 📘 Paso 0 · Teoría Esencial
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Rounded.MenuBook,
                contentDescription = null,
                tint = theme.accentText,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Paso 0 · Teoría Esencial",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = theme.accentText
            )
        }

        // Título del tema en navy grande
        Text(
            text = lesson.theory.titulo.ifBlank { lesson.title },
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = theme.textPrimary,
            lineHeight = 30.sp
        )

        // Contenido estructurado enriquecido (sin markdown crudo)
        com.jonsuapps.rastro.android.ui.components.LessonContentRenderer(
            lesson = lesson,
            theme = theme
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Botón azul RASTRO con bisel 3D: [ 📖 Entendido, ¡a practicar! → ]
        Sticker3dButton(
            onClick = onStartChallenges,
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            containerColor = Color(0xFF1D84FE),
            bottomBevelColor = Color(0xFF145CB5),
            strokeColor = Color(0xFF145CB5).copy(alpha = 0.5f),
            shape = RastroShapes.Pill,
            contentPadding = PaddingValues(vertical = 12.dp)
        ) {
            Text(
                text = "Entendido, ¡a practicar! →",
                fontSize = 15.sp,
                fontWeight = FontWeight.Black,
                color = Color.White,
                letterSpacing = 0.4.sp
            )
        }

        Spacer(modifier = Modifier.height(28.dp))
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
    blankAnswers: Map<String, String>,
    matchState: MatchAnswerState,
    selectedLeftIndex: Int?,
    selectedRightIndex: Int?,
    isAnswerChecked: Boolean,
    isCorrectAnswer: Boolean,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onOptionSelected: (Int) -> Unit,
    onBlankSelected: (String, String) -> Unit,
    onMatchLeftSelected: (Int) -> Unit,
    onMatchRightSelected: (Int) -> Unit,
    onCheckAnswer: () -> Unit,
    onNextStep: () -> Unit,
    answerXp: Int = 5,
    comboEffect: ComboMilestoneEffect? = null
) {
    val context = LocalContext.current
    var showExplanationModal by remember { mutableStateOf(false) }
    var showReportModal by remember { mutableStateOf(false) }
    var reportSent by remember(challenge.id) { mutableStateOf(false) }
    var reportSending by remember(challenge.id) { mutableStateOf(false) }
    var reportError by remember(challenge.id) { mutableStateOf<String?>(null) }

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
                        tint = if (isRedemptionPhase) Color(0xFFEF4444) else theme.accentText,
                        modifier = Modifier.size(14.dp)
                    )
                    Text(
                        text = if (isRedemptionPhase) "MODO FÉNIX • REDENCIÓN" else "PRÁCTICA OFICIAL • ${challenge.subject.uppercase()}",
                        style = MaterialTheme.typography.labelSmall,
                        color = if (isRedemptionPhase) Color(0xFFEF4444) else theme.accentText,
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
                androidx.compose.runtime.key(challenge.id, isRedemptionPhase, isAnswerChecked) {
                    val appearance = remember {
                        if (isAnswerChecked && !isCorrectAnswer) ClassicAppearance.KNOCKED_OUT
                        else LearningArtworkResolver.appearance(if (challenge.type == ChallengeType.MULTIPLE_CHOICE)
                            listOf(ClassicAppearance.STUDY, ClassicAppearance.RETRY)
                            else listOf(ClassicAppearance.STUDY, ClassicAppearance.RETRY, ClassicAppearance.SLEEP))
                    }
                    val character = remember { LearningArtworkResolver.character() }
                    val effect = comboEffect?.let(::resolveComboEffect)
                    ClassicArtwork(effect?.appearance ?: appearance, Modifier.size(64.dp),
                        character = effect?.character ?: character, speed = effect?.speed ?: 1f)
                }
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
                Text(tier, color = theme.accentText, fontSize = 10.sp, fontWeight = FontWeight.Bold)
            }

            Text(
                text = challenge.statement,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = theme.textPrimary,
                lineHeight = 22.sp
            )

            val activityErrors = ChallengeInteraction.validationErrors(challenge)
            if (activityErrors.isNotEmpty()) {
                Text("Actividad no disponible (${challenge.id}): ${activityErrors.joinToString()}\nPuedes reportar este contenido para que lo corrijamos.",
                    color = theme.answerText(false), fontWeight = FontWeight.Bold)
                TextButton(onClick = { showReportModal = true }) { Text("Reportar actividad") }
            } else when (challenge.type) {
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
                        isAnswerChecked && isCorrectChoice -> theme.answerSurface(true)
                        isAnswerChecked && isSelected && !isCorrectAnswer -> theme.answerSurface(false)
                        isSelected -> theme.accent.copy(alpha = 0.12f)
                        else -> theme.surface
                    }

                    val bevelColor = when {
                        isAnswerChecked && isCorrectChoice -> theme.answerText(true)
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
                                    color = if (isSelected) contrastingText(theme.accent) else theme.textPrimary
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
                ChallengeType.FILL_BLANK -> FillTheoryChallengeView(challenge, blankAnswers, isAnswerChecked, theme, onBlankSelected)
                ChallengeType.MATCH_PAIRS -> MatchingChallengeView(challenge, matchState, selectedLeftIndex,
                    selectedRightIndex, isAnswerChecked, theme, onMatchLeftSelected, onMatchRightSelected)
            }
        }

        // 2. Barrita Fija Inferior Estilo Duolingo
        val responseComplete = when (challenge.type) {
            ChallengeType.MULTIPLE_CHOICE -> selectedOptionIndex != null
            ChallengeType.FILL_BLANK -> ChallengeInteraction.fillingComplete(challenge, blankAnswers)
            ChallengeType.MATCH_PAIRS -> ChallengeInteraction.matchingComplete(challenge, matchState)
        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            color = when {
                isAnswerChecked && isCorrectAnswer -> theme.answerSurface(true)
                isAnswerChecked && !isCorrectAnswer -> theme.answerSurface(false)
                else -> theme.surface
            },
            shadowElevation = 18.dp,
            border = androidx.compose.foundation.BorderStroke(
                2.dp,
                when {
                    isAnswerChecked && isCorrectAnswer -> theme.answerText(true)
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
                            color = if (responseComplete) contrastingText(theme.accent) else theme.textSecondary
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
                                ClassicArtwork(ClassicAppearance.ACHIEVEMENT, Modifier.size(52.dp))
                                Column {
                                    Text("¡Excelente!", fontWeight = FontWeight.Black, fontSize = 16.sp, color = theme.answerText(true))
                                    Text(if (answerXp > 0) "Respuesta correcta • +$answerXp XP" else "Respuesta correcta • Repaso", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.answerText(true))
                                }
                            } else {
                                Column {
                                    Text("¡Vamos a repasarlo!", fontWeight = FontWeight.Black, fontSize = 15.sp, color = theme.answerText(false))
                                    Text("Abre la explicación para repasar", fontSize = 11.sp, fontWeight = FontWeight.Medium, color = theme.answerText(false))
                                }
                            }
                        }

                        // Botones auxiliares: Reportar y Ayuda
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
                                    tint = if (isCorrectAnswer) theme.answerText(true) else theme.answerText(false),
                                    modifier = Modifier.size(20.dp)
                                )
                            }


                        }
                    }

                            if (!isCorrectAnswer) {
                                Sticker3dButton(
                                    onClick = { showExplanationModal = true },
                                    modifier = Modifier.fillMaxWidth().heightIn(min = 48.dp),
                                    containerColor = Color(0xFF7C3AED),
                                    bottomBevelColor = Color(0xFF4C1D95),
                                    strokeColor = theme.strokeBorder,
                                    shape = RoundedCornerShape(12.dp),
                                    bevelHeight = 2.5.dp,
                                    contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp)
                                ) {
                                    Icon(Icons.Rounded.Lightbulb, contentDescription = null, tint = Color.White, modifier = Modifier.size(20.dp))
                                    Spacer(Modifier.width(4.dp))
                                    Text("Explicación", fontSize = 13.sp, fontWeight = FontWeight.Black, color = Color.White)
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
                        bottomBevelColor = if (isCorrectAnswer) theme.answerText(true) else theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        shape = RastroShapes.Pill,
                        contentPadding = PaddingValues(vertical = 12.dp)
                    ) {
                        Text(
                            text = if (isCorrectAnswer) "¡CONTINUAR! →" else "ENTENDIDO, CONTINUAR →",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Black,
                            color = contrastingText(if (isCorrectAnswer) Color(0xFF22C55E) else theme.accent)
                        )
                    }
                }
            }
        }

        // Ayuda: animación centrada y una sola acción
        if (showExplanationModal) {
            LearningCelebrationDialog(
                title = "Explicación",
                message = if (challenge.explanation.isNotBlank()) challenge.explanation else "Esta pregunta volverá al final en el Modo Fénix para que la domines sin perder racha.",
                onContinue = { showExplanationModal = false }
            ) {
                ClassicArtwork(ClassicAppearance.ACHIEVEMENT, Modifier.size(140.dp))
            }
        }

        // Modal de Reportar Pregunta
        if (showReportModal) {
            com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
                onDismissRequest = { showReportModal = false },
                title = if (reportSent) "Reporte Enviado" else "Reportar Pregunta",
                message = if (reportSent) "Tu reporte se guardó para revisión en el panel admin." else reportError ?: "¿Notaste algún error ortográfico o clave incorrecta en este reto preuniversitario?",
                confirmText = if (reportSent) "Aceptar" else if (reportSending) "Enviando…" else "Enviar Reporte",
                cancelText = "Cancelar",
                icon = Icons.Rounded.Warning,
                theme = theme,
                onConfirm = {
                    if (!reportSent && !reportSending) {
                        reportSending = true
                        reportError = null
                        com.jonsuapps.rastro.android.data.AcademicReportRepository.send(
                            challenge.id, challenge.statement, "Aprender · ${challenge.subject} · Semana ${challenge.semana}",
                            "Opciones: ${challenge.options.joinToString()}\nClave: ${challenge.correctIndex}\nExplicación: ${challenge.explanation}") { result ->
                            reportSending = false
                            result.fold(onSuccess = { reportSent = true },
                                onFailure = { reportError = it.localizedMessage ?: "No se pudo enviar. Intenta nuevamente." })
                        }
                    } else if (reportSent) {
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
    onContinue: () -> Unit,
    answers: Int = 0,
    earnedCoins: Int = 0
) {
    BoxWithConstraints(Modifier.fillMaxSize().padding(horizontal = 16.dp, vertical = 8.dp)) {
        val compact = maxHeight < 430.dp
        val sideBySide = maxWidth > 560.dp && compact
        val audio = rememberLearningAudio()
        val character = remember { LearningArtworkResolver.character() }
        val celebration = remember { LearningArtworkResolver.victoryAppearance(stars) }
        val progressState by GamificationManager.state.collectAsState()
        val resultTotalXp = remember(earnedXp) { GamificationManager.state.value.xp + earnedXp }
        @Composable fun mascot(modifier: Modifier) {
            ClassicArtwork(celebration, modifier, character) { audio.play(LearningSound.EXPLOSION, "explosion") }
        }
        @Composable fun details(modifier: Modifier) {
            LearningResultsArtwork(stars, answers, earnedXp, resultTotalXp, modifier, compact = true, earnedCoins = earnedCoins)
        }
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(if (compact) 4.dp else 8.dp)) {
            Text(when { stars >= 3 -> "¡Perfecto!"; stars == 2 -> "¡Lección superada!"; else -> "Repasemos lo aprendido" },
                fontSize = if(compact) 20.sp else 24.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
            Text(lessonTitle, fontSize = 12.sp, color = theme.textSecondary, maxLines = 2,
                overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center)
            if (sideBySide) {
                Row(Modifier.weight(1f).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    mascot(Modifier.weight(1f).fillMaxHeight())
                    details(Modifier.weight(1f).fillMaxHeight())
                }
            } else {
                mascot(Modifier.weight(.55f).fillMaxWidth())
                details(Modifier.weight(.45f).fillMaxWidth())
            }
            Text("Racha: ${progressState.streak} días", color = theme.textSecondary, fontSize = 11.sp)
            Sticker3dButton(onClick = onContinue, modifier = Modifier.fillMaxWidth().height(48.dp),
                containerColor = theme.accent, bottomBevelColor = theme.accentBevel,
                strokeColor = theme.strokeBorder, shape = RastroShapes.Pill,
                contentPadding = PaddingValues(vertical = 8.dp)) {
                Text("CONTINUAR", fontSize = 14.sp, fontWeight = FontWeight.Black, color = contrastingText(theme.accent))
            }
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
                ClassicArtwork(ClassicAppearance.KNOCKED_OUT, Modifier.size(140.dp))

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

/**
 * Chip de prueba rápida exclusivo para Administrador.
 * Permite conmutar la auto-selección de respuestas correctas para validar lecciones con alta densidad de preguntas.
 */
@Composable
private fun AdminAutoTestChip(
    isAuto: Boolean,
    onToggle: () -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor = if (isAuto) Color(0xFF0284C7) else Color(0xFFF1F5F9)
    val contentColor = if (isAuto) Color.White else Color(0xFF64748B)
    val borderColor = if (isAuto) Color(0xFF0369A1) else Color(0xFFCBD5E1)

    Surface(
        modifier = modifier
            .height(28.dp)
            .bouncyClick(onClick = onToggle),
        shape = RastroShapes.Pill,
        color = backgroundColor,
        border = androidx.compose.foundation.BorderStroke(1.dp, borderColor)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = if (isAuto) "⚡ Auto: ON" else "⚡ Auto: OFF",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = contentColor
            )
        }
    }
}
