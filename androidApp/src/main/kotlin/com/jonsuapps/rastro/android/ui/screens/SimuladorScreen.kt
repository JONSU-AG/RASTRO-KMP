package com.jonsuapps.rastro.android.ui.screens
import com.jonsuapps.rastro.android.util.openExternalIntent
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.onAccent
import com.jonsuapps.rastro.android.ui.components.rastroAcademicBackground

import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import com.jonsuapps.rastro.model.RankingExamCatalog
import com.jonsuapps.rastro.android.data.RankingExamRepository
import com.jonsuapps.rastro.android.ui.components.contrastingText
import com.jonsuapps.rastro.android.ui.components.answerText
import com.jonsuapps.rastro.android.ui.components.answerSurface
import com.jonsuapps.rastro.android.ui.components.ClassicArtwork
import com.jonsuapps.rastro.android.ui.components.ClassicAppearance
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ChevronLeft
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.random.Random
import com.google.firebase.auth.FirebaseAuth
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.layout.ContentScale
import com.jonsuapps.rastro.android.data.FavoritesRepository
import com.jonsuapps.rastro.android.data.FavoriteType
import com.jonsuapps.rastro.android.ui.components.CachedRemoteImage
import com.jonsuapps.rastro.android.data.ExamQuestionRepository
import com.jonsuapps.rastro.android.data.FlashcardRepository
import com.jonsuapps.rastro.android.ui.components.appleGlass
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.Sticker3dPill
import com.jonsuapps.rastro.android.ui.components.Sticker3dCircleButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCounterButton
import com.jonsuapps.rastro.android.ui.components.DualMascotDuo
import com.jonsuapps.rastro.android.ui.components.MascotDialogueBubble
import com.jonsuapps.rastro.android.ui.components.MascotMood
import com.jonsuapps.rastro.data.SimuladorRepository
import com.jonsuapps.rastro.model.AreaAdmision
import com.jonsuapps.rastro.model.ExamEvaluationResult
import com.jonsuapps.rastro.theme.RastroShapes
import com.jonsuapps.rastro.theme.ThemeManager

@Composable
fun SimuladorScreen(
    modifier: Modifier = Modifier,
    initialTab: Int = 0,
    onOpenLeagues: () -> Unit = {}
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current

    var selectedArea by remember { mutableStateOf(AreaAdmision.BIOMEDICAS) }
    var selectedOrderPreference by remember { mutableStateOf("Oficial UNSA") }
    var officialQuestionBank by remember { mutableStateOf(emptyList<com.jonsuapps.rastro.model.ExamQuestion>()) }
    var communityQuestionBank by remember { mutableStateOf(emptyList<com.jonsuapps.rastro.model.ExamQuestion>()) }
    var communityFlashcards by remember { mutableStateOf(emptyList<com.jonsuapps.rastro.model.FlashcardItem>()) }
    var questionShuffleSeed by remember { mutableIntStateOf(0) }
    val orderOptions = listOf("Oficial UNSA", "Letras primero", "Ciencias primero", "Aleatorio")

    var isExamRunning by remember { mutableStateOf(false) }
    var activeSimulatorTab by remember { mutableIntStateOf(initialTab) }
    var quickQuestionCount by remember { mutableIntStateOf(15) }
    var quickSearch by remember { mutableStateOf("") }
    var quickSubjectFilter by remember { mutableStateOf("todas") }
    var quickWeekFilter by remember { mutableStateOf("todas") }
    var quickAuthorFilter by remember { mutableStateOf("todos") }
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    val userAnswers = remember { mutableStateMapOf<String, Int>() }
    var examAttemptId by remember { mutableStateOf("") }
    var examResult by remember { mutableStateOf<ExamEvaluationResult?>(null) }
    var showFinishConfirmationDialog by remember { mutableStateOf(false) }
    var showCreateQuestionDialog by remember { mutableStateOf(false) }
    var frozenQuestions by remember { mutableStateOf(emptyList<com.jonsuapps.rastro.model.ExamQuestion>()) }
    var activeRankingConfig by remember { mutableStateOf<com.jonsuapps.rastro.model.RankingExamConfig?>(null) }
    var competitionMessage by remember { mutableStateOf<String?>(null) }
    var reserving by remember { mutableStateOf(false) }
    var rankingUsed by remember { mutableIntStateOf(0) }
    var rankingBonus by remember { mutableIntStateOf(0) }
    var usageReady by remember { mutableStateOf(false) }
    var rankingRetry by remember { mutableIntStateOf(0) }
    val screenActive = remember { java.util.concurrent.atomic.AtomicBoolean(true) }
    DisposableEffect(Unit) { onDispose { screenActive.set(false) } }
    var rankingConfig by remember(selectedArea) { mutableStateOf(RankingExamCatalog.forArea(selectedArea)) }
    val latestRankingConfig by androidx.compose.runtime.rememberUpdatedState(rankingConfig)
    LaunchedEffect(selectedArea, activeSimulatorTab, isExamRunning, rankingRetry) {
        if (activeSimulatorTab == 4 && !isExamRunning) {
            usageReady = false
            val area = selectedArea
            var requestActive = true
            try {
            RankingExamRepository.config(area) { result ->
                if (requestActive && screenActive.get() && latestRankingConfig.area == area) result.onSuccess { loaded ->
                    rankingConfig = loaded
                    RankingExamRepository.usage(loaded) { usage ->
                        if (requestActive && screenActive.get() && latestRankingConfig == loaded) usage.onSuccess { rankingUsed = it.first; rankingBonus = it.second; usageReady = true; competitionMessage = null }
                            .onFailure { competitionMessage = it.localizedMessage }
                    }
                }.onFailure { competitionMessage = "No se pudo cargar la configuración: ${it.localizedMessage}" }
            }
            kotlinx.coroutines.awaitCancellation()
            } finally { requestActive = false }
        }
    }


    LaunchedEffect(context) {
        officialQuestionBank = withContext(Dispatchers.IO) { ExamQuestionRepository.loadOfficialBank(context) }
    }
    DisposableEffect(Unit) {
        val listener = ExamQuestionRepository.observeCommunity { communityQuestionBank = it }
        val flashcardListener = FlashcardRepository.observeCommunity { communityFlashcards = it }
        onDispose {
            listener.remove()
            flashcardListener.remove()
        }
    }
    val allExamQuestions = remember(officialQuestionBank, communityQuestionBank, questionShuffleSeed) {
        val filteredOfficial = ExamQuestionRepository.getQuestionsForSimulacro(officialQuestionBank)
        val combined = (communityQuestionBank + filteredOfficial + SimuladorRepository.sampleExamQuestions)
            .distinctBy { it.id }
        if (questionShuffleSeed == 0) combined else combined.shuffled(Random(questionShuffleSeed))
    }
    val availableSubjects = remember(allExamQuestions) { allExamQuestions.map { it.asignatura }.filter(String::isNotBlank).distinct().sorted() }
    val availableAuthors = remember(allExamQuestions) { allExamQuestions.map { it.authorName }.filter(String::isNotBlank).distinct().sorted() }
    val quickFilteredQuestions = remember(allExamQuestions, quickSearch, quickSubjectFilter, quickWeekFilter, quickAuthorFilter) {
        val query = quickSearch.trim().lowercase()
        allExamQuestions.filter { question ->
            val subjectMatches = quickSubjectFilter == "todas" || question.asignatura.equals(quickSubjectFilter, ignoreCase = true)
            val weekMatches = quickWeekFilter == "todas" || question.semana?.toString() == quickWeekFilter
            val authorMatches = quickAuthorFilter == "todos" || question.authorName == quickAuthorFilter
            val searchMatches = query.isBlank() || question.q.contains(query, ignoreCase = true) ||
                question.options.any { it.contains(query, ignoreCase = true) } || question.authorName.contains(query, ignoreCase = true)
            subjectMatches && weekMatches && authorMatches && searchMatches
        }
    }
    val preparedQuestions by produceState(
        initialValue = emptyList<com.jonsuapps.rastro.model.ExamQuestion>(),
        activeSimulatorTab, allExamQuestions, quickFilteredQuestions, quickQuestionCount, selectedArea, selectedOrderPreference, questionShuffleSeed
    ) {
        value = withContext(Dispatchers.Default) {
            when (activeSimulatorTab) {
                0 -> if (allExamQuestions.isNotEmpty()) SimuladorRepository.generateOfficialSimulacro80(allExamQuestions, selectedArea, selectedOrderPreference, questionShuffleSeed) else emptyList()
                4 -> runCatching { SimuladorRepository.generateRankingExam(
                    ExamQuestionRepository.getQuestionsForSimulacro(officialQuestionBank), selectedArea, questionShuffleSeed)
                }.getOrElse { emptyList() }
                1 -> if (quickQuestionCount < 0) quickFilteredQuestions else quickFilteredQuestions.take(quickQuestionCount.coerceAtLeast(1))
                else -> allExamQuestions
            }
        }
    }

    val examQuestions = if ((isExamRunning && activeSimulatorTab != 1) || examResult != null) frozenQuestions else preparedQuestions
    val rankingBankError = if (activeSimulatorTab == 4 && preparedQuestions.isEmpty())
        "El banco todavía no tiene 80 preguntas reales con peso conocido disponibles para este examen." else null

    if (showFinishConfirmationDialog) {
        val answeredCount = examQuestions.count { it.id in userAnswers }
        com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
            onDismissRequest = { showFinishConfirmationDialog = false },
            title = "¿Finalizar Simulacro?",
            message = "Has respondido $answeredCount de ${examQuestions.size} preguntas. ¿Deseas calificar tu examen con la ponderación oficial UNSA?",
            confirmText = "Calificar Examen",
            cancelText = "Seguir Resolviendo",
            icon = Icons.Rounded.Assessment,
            theme = theme,
            onConfirm = {
                showFinishConfirmationDialog = false
                frozenQuestions = examQuestions.toList()
                isExamRunning = false
                examResult = SimuladorRepository.calculateScore(
                    questions = examQuestions,
                    userAnswers = examQuestions.mapIndexedNotNull { index, question ->
                        userAnswers[question.id]?.let { index to it }
                    }.toMap(),
                    area = selectedArea
                )
                com.jonsuapps.rastro.android.data.ErrorBankRepository.recordExam(frozenQuestions, userAnswers.toMap(),
                    when { activeRankingConfig != null -> com.jonsuapps.rastro.android.data.ErrorBankOrigins.RANKING
                        activeSimulatorTab == 1 -> com.jonsuapps.rastro.android.data.ErrorBankOrigins.EXAMEN_RAPIDO
                        else -> com.jonsuapps.rastro.android.data.ErrorBankOrigins.SIMULACRO })
                activeRankingConfig?.let { config ->
                    competitionMessage = "Guardando puntaje Ranking…"
                    RankingExamRepository.complete(config, examAttemptId, examResult!!) { result ->
                        result.onSuccess { competitionMessage = "Puntaje Ranking registrado: ${examResult?.let { SimuladorRepository.rankingScore(it) }}" }
                            .onFailure { competitionMessage = "No se pudo guardar el puntaje. Reintenta el envío: ${it.localizedMessage}" }
                    }
                }
                val awarded = com.jonsuapps.rastro.gamification.GamificationManager.claimExamReward(
                    examAttemptId, examResult!!.correctCount)
                if (awarded > 0) {
                    val uid = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.uid.orEmpty()
                    com.jonsuapps.rastro.android.data.GamificationRepository.saveLocal(uid,
                        com.jonsuapps.rastro.gamification.GamificationManager.state.value)
                    if (uid.isNotBlank()) com.jonsuapps.rastro.android.data.GamificationRepository.save(uid,
                        com.jonsuapps.rastro.gamification.GamificationManager.state.value)
                    com.jonsuapps.rastro.android.ui.components.XpDelivery.show(awarded)
                }
            }
        )
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .rastroAcademicBackground(theme),
        contentAlignment = Alignment.TopCenter
    ) {
        when {
            // Pantalla de Resultados Ponderados Oficiales
            examResult != null -> {
                Column(Modifier.fillMaxSize()) {
                if (activeRankingConfig != null) {
                    Text(competitionMessage.orEmpty(), color = theme.textPrimary, modifier = Modifier.padding(16.dp))
                    Row {
                        TextButton(onClick = onOpenLeagues) { Text("Ver Ligas") }
                        TextButton(onClick = { activeRankingConfig?.let { config ->
                            RankingExamRepository.complete(config, examAttemptId, examResult!!) { result ->
                                competitionMessage = if (result.isSuccess) "Puntaje Ranking registrado" else "Error: ${result.exceptionOrNull()?.localizedMessage}"
                            }
                        } }) { Text("Sincronizar puntaje") }
                    }
                }
                ExamResultView(
                    result = examResult!!,
                    allowReview = activeSimulatorTab != 1,
                    reviewQuestions = frozenQuestions,
                    isRanking = activeRankingConfig != null,
                    area = activeRankingConfig?.area ?: selectedArea,
                    theme = theme,
                    onRetry = {
                        examResult = null
                        activeRankingConfig = null
                        userAnswers.clear()
                        currentQuestionIndex = 0
                    }
                )
                }
            }

            // Examen en Curso
            isExamRunning -> {
                ExamActiveView(
                    questions = examQuestions,
                    currentIndex = currentQuestionIndex,
                    userAnswers = userAnswers.toMap(),
                    theme = theme,
                    isQuickExam = activeSimulatorTab == 1,
                    search = quickSearch,
                    onSearchChange = { quickSearch = it; currentQuestionIndex = 0 },
                    subjectOptions = availableSubjects,
                    selectedSubject = quickSubjectFilter,
                    onSubjectChange = { quickSubjectFilter = it; currentQuestionIndex = 0 },
                    selectedWeek = quickWeekFilter,
                    onWeekChange = { quickWeekFilter = it; currentQuestionIndex = 0 },
                    authorOptions = availableAuthors,
                    selectedAuthor = quickAuthorFilter,
                    onAuthorChange = { quickAuthorFilter = it; currentQuestionIndex = 0 },
                    onSelectAnswer = { questionId, optIdx ->
                        if (userAnswers[questionId] != optIdx) com.jonsuapps.rastro.android.ui.components.DuolingoHaptics.playOptionSelected(context)
                        userAnswers[questionId] = optIdx
                    },
                    onNavigateQuestion = { nextIdx ->
                        if (nextIdx in examQuestions.indices) {
                            currentQuestionIndex = nextIdx
                        }
                    },
                    onExitNoQuestions = { isExamRunning = false },
                    onFinishExam = { showFinishConfirmationDialog = true }
                )
            }

            // Vista Previa y Configuración del Examen
            else -> {
                ExamSetupView(
                    activeTab = activeSimulatorTab,
                    onSelectTab = { if (!reserving) activeSimulatorTab = it },
                    selectedArea = selectedArea,
                    onSelectArea = { if (!reserving) selectedArea = it },
                    selectedOrder = selectedOrderPreference,
                    onSelectOrder = { selectedOrderPreference = it },
                    orderOptions = orderOptions,
                    theme = theme,
                    canStartOfficial = preparedQuestions.isNotEmpty() && !reserving,
                    rankingConfig = rankingConfig,
                    rankingUsage = rankingConfig.remaining(rankingUsed, rankingBonus),
                    rankingCanStart = usageReady && !reserving && rankingConfig.canAttempt(
                        FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }?.uid.orEmpty(),
                        com.jonsuapps.rastro.gamification.GamificationManager.state.value.level, rankingUsed, rankingBonus),
                    rankingMessage = rankingBankError ?: competitionMessage,
                    onRetryRanking = { if (!reserving) rankingRetry++ },
                    onOpenLeagues = onOpenLeagues,
                    quickQuestionCount = quickQuestionCount,
                    onQuickQuestionCountChange = { quickQuestionCount = it },
                    availableQuestionCount = quickFilteredQuestions.size,
                    quickSearch = quickSearch,
                    onQuickSearchChange = { quickSearch = it },
                    subjectOptions = availableSubjects,
                    selectedSubject = quickSubjectFilter,
                    onSubjectChange = { quickSubjectFilter = it },
                    selectedWeek = quickWeekFilter,
                    onWeekChange = { quickWeekFilter = it },
                    authorOptions = availableAuthors,
                    selectedAuthor = quickAuthorFilter,
                    onAuthorChange = { quickAuthorFilter = it },
                    communityFlashcards = remember(communityFlashcards, officialQuestionBank) {
                        (communityFlashcards + ExamQuestionRepository.getQuestionsForFlashcards(officialQuestionBank)).distinctBy { it.id }
                    },
                    onShuffleQuestions = { questionShuffleSeed++ },
                    onCreateQuestion = { showCreateQuestionDialog = true },
                    onStartExam = startExam@{
                        if (reserving || isExamRunning) return@startExam
                        val snapshot = preparedQuestions.toList()
                        val attemptId = java.util.UUID.randomUUID().toString()
                        fun start() {
                            frozenQuestions = snapshot
                            userAnswers.clear(); currentQuestionIndex = 0
                            examAttemptId = attemptId
                            isExamRunning = true
                        }
                        if (activeSimulatorTab == 4 && snapshot.isNotEmpty()) {
                            val config = rankingConfig
                            val reservingUid = FirebaseAuth.getInstance().currentUser?.uid
                            reserving = true; competitionMessage = "Registrando intento…"
                            RankingExamRepository.reserve(config, com.jonsuapps.rastro.gamification.GamificationManager.state.value.level, attemptId) { result ->
                                if (!screenActive.get() || FirebaseAuth.getInstance().currentUser?.uid != reservingUid) return@reserve
                                reserving = false
                                result.onSuccess { activeRankingConfig = config; competitionMessage = null; start() }
                                    .onFailure { competitionMessage = it.localizedMessage }
                            }
                        } else if (snapshot.isNotEmpty()) { activeRankingConfig = null; start() }
                    }
                )
            }
        }
    }
    if (showCreateQuestionDialog) CreateExamQuestionDialog(onDismiss = { showCreateQuestionDialog = false })
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ExamSetupView(
    activeTab: Int,
    onSelectTab: (Int) -> Unit,
    selectedArea: AreaAdmision,
    onSelectArea: (AreaAdmision) -> Unit,
    selectedOrder: String,
    onSelectOrder: (String) -> Unit,
    orderOptions: List<String>,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    canStartOfficial: Boolean,
    rankingConfig: com.jonsuapps.rastro.model.RankingExamConfig,
    rankingUsage: Int?,
    rankingCanStart: Boolean,
    rankingMessage: String?,
    onRetryRanking: () -> Unit,
    onOpenLeagues: () -> Unit,
    quickQuestionCount: Int,
    onQuickQuestionCountChange: (Int) -> Unit,
    availableQuestionCount: Int,
    quickSearch: String,
    onQuickSearchChange: (String) -> Unit,
    subjectOptions: List<String>,
    selectedSubject: String,
    onSubjectChange: (String) -> Unit,
    selectedWeek: String,
    onWeekChange: (String) -> Unit,
    authorOptions: List<String>,
    selectedAuthor: String,
    onAuthorChange: (String) -> Unit,
    communityFlashcards: List<com.jonsuapps.rastro.model.FlashcardItem>,
    onShuffleQuestions: () -> Unit,
    onCreateQuestion: () -> Unit,
    onStartExam: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .widthIn(max = 760.dp)
            .fillMaxSize(),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Column(Modifier.fillMaxWidth()) {
                Text("Simulador Académico", fontSize = 25.sp, lineHeight = 29.sp,
                    fontWeight = FontWeight.Black, color = theme.textPrimary, letterSpacing = (-.5).sp)
                Box(Modifier.width(36.dp).height(3.dp).background(theme.answerText(false).copy(alpha = .55f), RoundedCornerShape(3.dp)))
                Spacer(Modifier.height(3.dp))
                Text("Practica, repasa y calcula tu puntaje.", fontSize = 13.sp, lineHeight = 18.sp, color = theme.textSecondary)
            }
        }
        item { SimulatorMenu(theme, activeTab, onSelectTab) }
        if (activeTab == 4) item {
            Sticker3dCard(containerColor = theme.surfaceAccent, strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel) {
                Column(Modifier.fillMaxWidth().padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text("Examen Ranking", color = theme.textPrimary, fontSize = 26.sp, fontWeight = FontWeight.Black)
                    Text("80 preguntas reales del banco · Puntaje competitivo de 0 a 100 con pesos existentes. El simulacro normal continúa disponible para practicar.", color = theme.textSecondary)
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        AreaAdmision.entries.forEach { area -> FilterChip(selected = selectedArea == area, onClick = { onSelectArea(area) }, label = { Text(area.label) }) }
                    }
                    Text(if (rankingUsage == null) "Intentos ilimitados" else "$rankingUsage intentos disponibles", color = theme.textPrimary, fontWeight = FontWeight.Bold)
                    Text(if (rankingConfig.audience == com.jonsuapps.rastro.model.ExamAudience.EVERYONE) "Participación: cualquier cuenta registrada" else "Participación: usuarios elegibles", color = theme.textSecondary)
                    rankingMessage?.let {
                        Text(it, color = theme.textPrimary)
                        if (it != "Registrando intento…") TextButton(onClick = onRetryRanking) { Text("Reintentar", color = theme.accentText) }
                    }
                    Sticker3dButton(onClick = onStartExam, enabled = canStartOfficial && rankingCanStart,
                        modifier = Modifier.fillMaxWidth(), containerColor = theme.accent, bottomBevelColor = theme.accentBevel) {
                        Text("COMENZAR EXAMEN RANKING", color = contrastingText(theme.accent), fontWeight = FontWeight.Black)
                    }
                    TextButton(onClick = onOpenLeagues) { Text("Ver mi liga y clasificación", color = theme.accentText) }
                }
            }
        }
        // ──────────────── 4. TARJETA OFICIAL DE ADMISIÓN (Foto 5) ────────────────
        if (activeTab == 0) item {
            Sticker3dCard(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(22.dp),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 4.dp
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    // Chip Verde Menta: MODALIDAD OFICIAL UNSA
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = theme.answerText(true).copy(alpha = 0.12f),
                        border = androidx.compose.foundation.BorderStroke(1.dp, theme.answerText(true).copy(alpha = 0.3f))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Rounded.Bookmark, contentDescription = null, tint = theme.answerText(true), modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "MODALIDAD OFICIAL UNSA",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black,
                                color = theme.answerText(true),
                                letterSpacing = 0.5.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Same Classic rig and existing New Idea sequence, confined to the illustration slot.
                    BoxWithConstraints(Modifier.fillMaxWidth()) {
                        val visualWidth = (maxWidth * .28f).coerceIn(72.dp, 126.dp)
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            Column(Modifier.weight(1f)) {
                                Text("Simulacro de Admisión\n(80 Preguntas)", fontSize = 19.sp, lineHeight = 23.sp,
                                    fontWeight = FontWeight.Black, color = theme.textPrimary, letterSpacing = (-.4).sp)
                                Spacer(Modifier.height(5.dp))
                                Text("Preguntas oficiales extraídas directamente de los solucionarios CEPREUNSA con ponderación oficial sobre 100.0000 pts.",
                                    fontSize = 12.sp, lineHeight = 17.sp, color = theme.textSecondary)
                            }
                            ClassicArtwork(ClassicAppearance.NEW_IDEA, Modifier.size(visualWidth),
                                character = com.jonsuapps.rastro.android.ui.components.ClassicCharacter.LOKI)
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                    // Subsección: 1. Selecciona tu Área de Postulación:
                    Text(
                        text = "1. Selecciona tu Área de Postulación:",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // Fila de 3 Chips Horizontales (Sociales, Ingenierías, Biomédicas)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        val areas = listOf(
                            Triple(AreaAdmision.SOCIALES, "Sociales", "Derecho, Psicología, Educación, Contabilidad, Administración y afines."),
                            Triple(AreaAdmision.INGENIERIAS, "Ingenierías", "Ing. Civil, Ing. de Sistemas, Minas, Industrial, Mecánica y afines."),
                            Triple(AreaAdmision.BIOMEDICAS, "Biomédicas", "Medicina Humana, Enfermería, Biología, Nutrición y afines.")
                        )

                        areas.forEach { (areaEnum, label, _) ->
                            val isSelected = selectedArea == areaEnum
                            Sticker3dPill(
                                text = label,
                                isSelected = isSelected,
                                selectedBgColor = theme.accent,
                                selectedContentColor = contrastingText(theme.accent),
                                unselectedBgColor = theme.surface,
                                unselectedContentColor = theme.textSecondary,
                                strokeColor = theme.strokeBorder,
                                onClick = { onSelectArea(areaEnum) },
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Leyenda de carreras del área seleccionada
                    val currentDesc = when (selectedArea) {
                        AreaAdmision.SOCIALES -> "Derecho, Psicología, Educación, Contabilidad, Administración y afines."
                        AreaAdmision.INGENIERIAS -> "Ing. Civil, Ing. de Sistemas, Minas, Industrial, Mecánica y afines."
                        AreaAdmision.BIOMEDICAS -> "Medicina Humana, Enfermería, Biología, Nutrición y afines."
                    }
                    Text(
                        text = currentDesc,
                        fontSize = 12.sp,
                        color = theme.textSecondary,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))
                    Text("Orden de las preguntas", fontSize = 12.sp, color = theme.textPrimary, fontWeight = FontWeight.Bold)
                    SimulatorFilterDropdown(
                        modifier = Modifier.fillMaxWidth(),
                        selected = selectedOrder,
                        options = orderOptions.map { it to it },
                        onSelect = onSelectOrder,
                        theme = theme
                    )

                    Spacer(modifier = Modifier.height(18.dp))

                    // ─── Estructura de Preguntas y Ponderación Oficial ───
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        color = theme.background,
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, theme.strokeBorder)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text("Estructura · ${selectedArea.label}", fontSize = 13.sp,
                                fontWeight = FontWeight.Bold, color = theme.textPrimary)
                            Text("80 preguntas · 100 puntos", fontSize = 12.sp,
                                color = theme.accentText, modifier = Modifier.padding(top = 4.dp, bottom = 10.dp))
                            val distribution = SimuladorRepository.getPonderaciones(selectedArea).groupBy { it.curso }
                            distribution.entries.forEachIndexed { index, (course, rules) ->
                                Row(Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp))
                                    .background(if (index % 2 == 0) theme.surfaceAccent else Color.Transparent)
                                    .padding(horizontal = 10.dp, vertical = 8.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Column(Modifier.weight(1f)) {
                                        Text(course, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = theme.textPrimary)
                                        Text("${rules.sumOf { it.preguntas }} preguntas", fontSize = 10.sp, color = theme.textSecondary)
                                    }
                                    Text(String.format(java.util.Locale.US, "%.2f pts", rules.sumOf { it.preguntas * it.valor }),
                                        fontSize = 12.sp, fontWeight = FontWeight.Bold, color = theme.accentText)
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Botón Grande de Inicio de Simulacro
                    Sticker3dButton(
                        onClick = onStartExam,
                        enabled = canStartOfficial,
                        modifier = Modifier.fillMaxWidth(),
                        containerColor = Color(0xFF10B981),
                        bottomBevelColor = Color(0xFF047857),
                        strokeColor = Color(0xFF064E3B),
                        bevelHeight = 4.dp,
                        contentPadding = PaddingValues(vertical = 14.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Rounded.PlayArrow, contentDescription = null, tint = Color.White, modifier = Modifier.size(20.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Iniciar Simulacro Oficial (80 Preguntas)",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Black,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }

        if (activeTab == 1) item {
            QuickExamSetupCard(
                theme = theme,
                selectedArea = selectedArea,
                onSelectArea = onSelectArea,
                questionCount = quickQuestionCount,
                availableCount = availableQuestionCount,
                onQuestionCountChange = onQuickQuestionCountChange,
                search = quickSearch,
                onSearchChange = onQuickSearchChange,
                subjectOptions = subjectOptions,
                selectedSubject = selectedSubject,
                onSubjectChange = onSubjectChange,
                selectedWeek = selectedWeek,
                onWeekChange = onWeekChange,
                authorOptions = authorOptions,
                selectedAuthor = selectedAuthor,
                onAuthorChange = onAuthorChange,
                onShuffleQuestions = onShuffleQuestions,
                onCreateQuestion = onCreateQuestion,
                onStartExam = onStartExam
            )
        }

        if (activeTab == 2) item {
            ProjectedScoreCalculator(
                theme = theme,
                selectedArea = selectedArea,
                onSelectArea = onSelectArea
            )
        }

        if (activeTab == 3) item {
            FlashcardsQuickDeck(theme = theme, communityCards = communityFlashcards)
        }

            item { com.jonsuapps.rastro.android.ui.components.MainPageEnd() }
}
}

@Composable
private fun QuickExamSetupCard(
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    selectedArea: AreaAdmision,
    onSelectArea: (AreaAdmision) -> Unit,
    questionCount: Int,
    availableCount: Int,
    onQuestionCountChange: (Int) -> Unit,
    search: String,
    onSearchChange: (String) -> Unit,
    subjectOptions: List<String>,
    selectedSubject: String,
    onSubjectChange: (String) -> Unit,
    selectedWeek: String,
    onWeekChange: (String) -> Unit,
    authorOptions: List<String>,
    selectedAuthor: String,
    onAuthorChange: (String) -> Unit,
    onShuffleQuestions: () -> Unit,
    onCreateQuestion: () -> Unit,
    onStartExam: () -> Unit
) {
    val actualCount = if (questionCount < 0) availableCount else minOf(questionCount, availableCount)
    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(22.dp),
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 4.dp
    ) {
        Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text("Examen Rápido", fontSize = 21.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
            Text("Practica con un lote corto de preguntas y revisa tu puntaje ponderado al terminar.",
                fontSize = 13.sp, color = theme.textSecondary, lineHeight = 18.sp)
            Text("Área de postulación", fontSize = 12.sp, color = theme.textPrimary, fontWeight = FontWeight.Bold)
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                listOf(AreaAdmision.SOCIALES, AreaAdmision.INGENIERIAS, AreaAdmision.BIOMEDICAS).forEach { area ->
                    FilterChip(
                        selected = selectedArea == area,
                        onClick = { onSelectArea(area) },
                        label = { Text(area.label, maxLines = 1, fontSize = 10.sp) },
                        modifier = Modifier.weight(1f),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFFEC4899),
                            selectedLabelColor = Color.White,
                            containerColor = theme.surfaceAccent,
                            labelColor = theme.textSecondary
                        )
                    )
                }
            }
            OutlinedTextField(
                value = search,
                onValueChange = onSearchChange,
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                placeholder = { Text("Buscar pregunta...", fontSize = 13.sp) },
                leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
                shape = RoundedCornerShape(14.dp)
            )
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                SimulatorFilterDropdown(
                    modifier = Modifier.weight(1f),
                    selected = selectedSubject,
                    options = listOf("todas" to "Todas las asignaturas") + subjectOptions.map { it to it },
                    onSelect = onSubjectChange,
                    theme = theme
                )
                SimulatorFilterDropdown(
                    modifier = Modifier.weight(1f),
                    selected = selectedWeek,
                    options = listOf("todas" to "Todas las semanas") + (1..10).map { it.toString() to "Semana $it" },
                    onSelect = onWeekChange,
                    theme = theme
                )
            }
            SimulatorFilterDropdown(
                modifier = Modifier.fillMaxWidth(),
                selected = selectedAuthor,
                options = listOf("todos" to "Todos los autores") + authorOptions.map { it to it },
                onSelect = onAuthorChange,
                theme = theme
            )
            Text("Cantidad de preguntas", fontSize = 12.sp, color = theme.textPrimary, fontWeight = FontWeight.Bold)
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                listOf(10, 15, 30, 60, -1).forEach { count ->
                    val isSelected = questionCount == count
                    val label = if (count < 0) "Todas" else "$count"
                    com.jonsuapps.rastro.android.ui.components.Sticker3dPill(
                        text = label,
                        isSelected = isSelected,
                        onClick = { onQuestionCountChange(count) },
                        selectedBgColor = Color(0xFFEC4899),
                        selectedBevel = Color(0xFFBE185D),
                        unselectedBgColor = theme.surface,
                        unselectedBevel = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        selectedContentColor = contrastingText(theme.accent),
                        unselectedContentColor = theme.textSecondary,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
            Text("Preguntas disponibles ahora: $availableCount", fontSize = 11.sp, color = theme.textSecondary)
            Sticker3dButton(
                onClick = onShuffleQuestions,
                modifier = Modifier.fillMaxWidth(),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 3.dp,
                shape = RoundedCornerShape(14.dp),
                contentPadding = PaddingValues(vertical = 10.dp)
            ) {
                Icon(Icons.Rounded.Shuffle, null, modifier = Modifier.size(16.dp), tint = theme.textPrimary)
                Spacer(Modifier.width(6.dp))
                Text("Reordenar lote de preguntas", fontWeight = FontWeight.Bold, color = theme.textPrimary, fontSize = 13.sp)
            }
            Sticker3dButton(
                onClick = onCreateQuestion,
                modifier = Modifier.fillMaxWidth(),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 3.dp,
                shape = RoundedCornerShape(14.dp),
                contentPadding = PaddingValues(vertical = 10.dp)
            ) {
                Icon(Icons.Rounded.Add, null, modifier = Modifier.size(16.dp), tint = theme.accentText)
                Spacer(Modifier.width(6.dp))
                Text("Crear pregunta", fontWeight = FontWeight.Bold, color = theme.textPrimary, fontSize = 13.sp)
            }
            Sticker3dButton(
                onClick = onStartExam,
                enabled = availableCount > 0,
                modifier = Modifier.fillMaxWidth(),
                containerColor = Color(0xFFEC4899),
                bottomBevelColor = Color(0xFFBE185D),
                strokeColor = Color(0xFF831843),
                bevelHeight = 4.dp,
                contentPadding = PaddingValues(vertical = 12.dp)
            ) {
                Icon(Icons.Rounded.PlayArrow, null, tint = Color.White)
                Spacer(Modifier.width(6.dp))
                Text("Iniciar examen rápido ($actualCount)", fontWeight = FontWeight.Black, color = Color.White)
            }
        }
    }
}

@Composable
private fun SimulatorFilterDropdown(
    modifier: Modifier = Modifier,
    selected: String,
    options: List<Pair<String, String>>,
    onSelect: (String) -> Unit,
    theme: com.jonsuapps.rastro.theme.RastroPalette
) {
    var expanded by remember { mutableStateOf(false) }
    val selectedLabel = options.firstOrNull { it.first == selected }?.second ?: selected
    Box(modifier) {
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(13.dp),
            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 8.dp)
        ) {
            Text(selectedLabel, maxLines = 1, fontSize = 11.sp, color = theme.textPrimary, modifier = Modifier.weight(1f))
            Icon(Icons.Rounded.ExpandMore, contentDescription = "Mostrar opciones", tint = theme.textSecondary, modifier = Modifier.size(17.dp))
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            options.forEach { (value, label) ->
                DropdownMenuItem(
                    text = { Text(label, fontSize = 13.sp) },
                    onClick = {
                        onSelect(value)
                        expanded = false
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ProjectedScoreCalculator(theme: com.jonsuapps.rastro.theme.RastroPalette,
    selectedArea: AreaAdmision, onSelectArea: (AreaAdmision) -> Unit) {
    val rules = remember(selectedArea) { SimuladorRepository.getPonderaciones(selectedArea) }
    val context = androidx.compose.ui.platform.LocalContext.current
    val scores = androidx.compose.runtime.saveable.rememberSaveable(
        saver = androidx.compose.runtime.saveable.mapSaver(
            save = { it.toMap() },
            restore = { saved -> mutableStateMapOf<String, String>().apply { saved.forEach { (key, value) -> put(key, value as String) } } }
        )
    ) { mutableStateMapOf<String, String>() }
    fun key(subject: String) = "${selectedArea.name}|$subject"
    val correct = rules.associate { it.asignatura to (scores[key(it.asignatura)]?.toIntOrNull() ?: 0) }
    val projected = SimuladorRepository.projectedScore(selectedArea, correct)
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Sticker3dCard(containerColor = theme.surfaceAccent, strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel) {
            Column(Modifier.fillMaxWidth().padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("Calculadora de puntaje", color = theme.textPrimary, fontSize = 19.sp, fontWeight = FontWeight.Black)
                FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    AreaAdmision.entries.forEach { area -> FilterChip(selected = selectedArea == area, onClick = { onSelectArea(area) }, label = { Text(area.label) }) }
                }
                Text(String.format("%.4f / 100", projected), color = theme.textPrimary, fontSize = 25.sp, fontWeight = FontWeight.Black)
                Text("${correct.values.sum()} aciertos / ${rules.sumOf { it.preguntas }} · Matriz UNSA 2027", color = theme.textSecondary, fontSize = 12.sp)
                Text("Aciertos × peso oficial. Errores y blancas no suman.", color = theme.textSecondary, fontSize = 12.sp)
                FlowRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    TextButton(onClick = { context.openExternalIntent(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(SimuladorRepository.MATRIX_SOURCE_URL))) }) {
                        Text("Ver matriz oficial", color = theme.accentText)
                    }
                    TextButton(onClick = { rules.forEach { scores.remove(key(it.asignatura)) } }) { Text("Limpiar", color = theme.accentText) }
                    TextButton(onClick = { rules.forEach { scores[key(it.asignatura)] = it.preguntas.toString() } }) { Text("Todos correctos", color = theme.accentText) }
                }
            }
        }
        BoxWithConstraints(Modifier.fillMaxWidth()) {
            val columns = if (maxWidth >= 850.dp) 3 else if (maxWidth >= 550.dp) 2 else 1
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                rules.chunked(columns).forEach { group ->
                    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        group.forEach { rule ->
                            val count = correct[rule.asignatura] ?: 0
                            Sticker3dCard(modifier = Modifier.weight(1f), containerColor = theme.surface, strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel) {
                                Row(Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 6.dp),
                                    verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    Column(Modifier.weight(1f)) {
                                        Text(rule.asignatura, color = theme.textPrimary, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                                        Text("${rule.preguntas} preg. · ${String.format(java.util.Locale.US, "%.4f", rule.valor)} pts", color = theme.textSecondary, fontSize = 10.sp)
                                    }
                                    IconButton(onClick = { scores[key(rule.asignatura)] = (count - 1).coerceAtLeast(0).toString() }, enabled = count > 0,
                                        modifier = Modifier.size(40.dp)) { Icon(Icons.Rounded.Remove, "Restar acierto", tint = theme.textPrimary.copy(alpha = if (count > 0) 1f else .35f)) }
                                    androidx.compose.foundation.text.BasicTextField(
                                        value = scores[key(rule.asignatura)] ?: "0",
                                        onValueChange = { value ->
                                            if (value.isEmpty() || (value.length <= 2 && value.all(Char::isDigit) && value.toIntOrNull() in 0..rule.preguntas))
                                                scores[key(rule.asignatura)] = value
                                        }, singleLine = true,
                                        keyboardOptions = androidx.compose.foundation.text.KeyboardOptions(keyboardType = androidx.compose.ui.text.input.KeyboardType.Number),
                                        textStyle = androidx.compose.ui.text.TextStyle(color = theme.textPrimary, fontSize = 15.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold),
                                        cursorBrush = androidx.compose.ui.graphics.SolidColor(theme.accentText),
                                        modifier = Modifier.width(44.dp).height(44.dp).semantics { contentDescription = "Aciertos de ${rule.asignatura}; máximo ${rule.preguntas}" }.clip(RoundedCornerShape(10.dp))
                                            .background(theme.surfaceAccent).border(1.dp, theme.strokeBorder, RoundedCornerShape(10.dp)),
                                        decorationBox = { inner -> Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { inner() } }
                                    )
                                    IconButton(onClick = { scores[key(rule.asignatura)] = (count + 1).coerceAtMost(rule.preguntas).toString() }, enabled = count < rule.preguntas,
                                        modifier = Modifier.size(40.dp)) { Icon(Icons.Rounded.Add, "Sumar acierto", tint = theme.textPrimary.copy(alpha = if (count < rule.preguntas) 1f else .35f)) }
                                }
                            }
                        }
                        repeat(columns - group.size) { Spacer(Modifier.weight(1f)) }
                    }
                }
            }
        }
        CareerReferenceComparison(theme, projected, selectedArea)
    }
}

@Composable
private fun CareerReferenceComparison(theme: com.jonsuapps.rastro.theme.RastroPalette, score: Double, area: AreaAdmision) {
    val context = androidx.compose.ui.platform.LocalContext.current
    Text("Referencias: Ordinario II Fase 2025 · ingreso normal", color = theme.textPrimary, fontWeight = FontWeight.Bold)
    Text("Rangos observados entre ingresantes; no aseguran admisión en 2027. Vacantes, competencia y proceso pueden cambiar.", color = theme.textSecondary, fontSize = 12.sp)
    SimuladorRepository.carrerasUNSACortes.filter { it.area == area }.forEach { career ->
        Sticker3dCard(modifier = Modifier.fillMaxWidth(), containerColor = theme.surface,
            strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel) {
            Column(Modifier.fillMaxWidth().padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Text(career.name, color = theme.textPrimary, fontWeight = FontWeight.Bold)
                Text(String.format(java.util.Locale.US, "Rango histórico: %.4f – %.4f pts", career.minScore, career.maxScore), color = theme.textSecondary, fontSize = 12.sp)
                Text(if (score >= career.minScore) "Alcanzas el mínimo histórico de referencia" else "Por debajo del mínimo histórico de referencia", color = theme.textPrimary, fontSize = 12.sp)
                TextButton(onClick = { context.openExternalIntent(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(career.referenceUrl))) }) {
                    Text("Ver reporte oficial · ${career.referenceProcess}", color = theme.accentText, fontSize = 11.sp)
                }
            }
        }
    }
}

@Composable
private fun FlashcardsQuickDeck(
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    communityCards: List<com.jonsuapps.rastro.model.FlashcardItem>
) {
    val cards = remember(communityCards) {
        (communityCards + SimuladorRepository.defaultFlashcards).distinctBy { it.id }
    }
    val subjects = listOf("Todas") + cards.map { it.subject }.filter(String::isNotBlank).distinct().sorted()
    val authors = listOf("todos") + cards.map { it.authorName }.filter(String::isNotBlank).distinct().sorted()
    var selectedSubject by remember { mutableStateOf("Todas") }
    var selectedAuthor by remember { mutableStateOf("todos") }
    var search by remember { mutableStateOf("") }
    var currentIndex by remember { mutableIntStateOf(0) }
    var showingAnswer by remember { mutableStateOf(false) }
    var showStudyDialog by remember { mutableStateOf(false) }
    var showCreateDialog by remember { mutableStateOf(false) }
    var showReportDialog by remember { mutableStateOf(false) }
    var showDeleteDialog by remember { mutableStateOf(false) }
    var deleteError by remember { mutableStateOf<String?>(null) }
    val filtered = remember(cards, selectedSubject, selectedAuthor, search) {
        val query = search.trim()
        cards.filter { card ->
            (selectedSubject == "Todas" || card.subject == selectedSubject) &&
                (selectedAuthor == "todos" || card.authorName == selectedAuthor) &&
                (query.isBlank() || card.q.contains(query, ignoreCase = true) || card.a.contains(query, ignoreCase = true) || card.authorName.contains(query, ignoreCase = true))
        }
    }
    LaunchedEffect(selectedSubject, selectedAuthor, search, filtered.size) { currentIndex = 0; showingAnswer = false }
    val card = filtered.getOrNull(currentIndex)

    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(22.dp),
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 4.dp
    ) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text("Flashcards", fontSize = 20.sp, color = theme.textPrimary, fontWeight = FontWeight.Black)
            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                placeholder = { Text("Buscar tema, concepto o autor...", fontSize = 13.sp) },
                leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
                shape = RoundedCornerShape(14.dp)
            )
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                SimulatorFilterDropdown(
                    modifier = Modifier.weight(1f), selected = selectedSubject,
                    options = subjects.map { it to it }, onSelect = { selectedSubject = it }, theme = theme
                )
                SimulatorFilterDropdown(
                    modifier = Modifier.weight(1f), selected = selectedAuthor,
                    options = listOf("todos" to "Todos los autores") + authors.filter { it != "todos" }.map { it to it },
                    onSelect = { selectedAuthor = it }, theme = theme
                )
            }
            Sticker3dButton(
                onClick = { showCreateDialog = true },
                modifier = Modifier.fillMaxWidth(),
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 3.dp,
                shape = RoundedCornerShape(14.dp),
                contentPadding = PaddingValues(vertical = 10.dp)
            ) {
                Icon(Icons.Rounded.Add, contentDescription = null, modifier = Modifier.size(17.dp), tint = theme.accentText)
                Spacer(Modifier.width(6.dp))
                Text("Crear tarjeta", fontWeight = FontWeight.Bold, color = theme.textPrimary, fontSize = 13.sp)
            }
            if (card != null) {
                Sticker3dButton(onClick = { showStudyDialog = true }, modifier = Modifier.fillMaxWidth(),
                    containerColor = theme.accent, bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder) {
                    Text("Estudiar ${filtered.size} tarjetas", color = theme.onAccent, fontWeight = FontWeight.Bold)
                }
            } else Text("No hay tarjetas para esta materia.", color = theme.textSecondary)
        }
    }
    if (showStudyDialog && card != null) {
        Dialog(onDismissRequest = { showStudyDialog = false }, properties = DialogProperties(usePlatformDefaultWidth = false)) {
            Sticker3dCard(Modifier.widthIn(max = 640.dp).fillMaxWidth(.94f).fillMaxHeight(.9f),
                containerColor = theme.surface, strokeColor = theme.strokeBorder, bottomBevelColor = theme.cardBevel) {
                Column(Modifier.fillMaxSize().padding(14.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        Text("Flashcards", color = theme.textPrimary, fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f))
                        IconButton(onClick = { showStudyDialog = false }) { Icon(Icons.Rounded.Close, "Cerrar", tint = theme.textPrimary) }
                    }

                val currentUid = FirebaseAuth.getInstance().currentUser?.uid
                val canManage = currentUid != null && card.authorUid == currentUid
                Row(
                    Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    TextButton(onClick = { showReportDialog = true }) {
                        Icon(Icons.Rounded.Flag, contentDescription = null, modifier = Modifier.size(15.dp), tint = Color(0xFFEF4444))
                        Text("Reportar", color = theme.answerText(false), fontSize = 11.sp)
                    }
                    if (canManage) {
                        TextButton(onClick = { showCreateDialog = true }) {
                            Icon(Icons.Rounded.Edit, contentDescription = null, modifier = Modifier.size(15.dp))
                            Text("Editar", fontSize = 11.sp)
                        }
                        TextButton(onClick = { showDeleteDialog = true }) {
                            Icon(Icons.Rounded.DeleteOutline, contentDescription = null, modifier = Modifier.size(15.dp), tint = Color(0xFFEF4444))
                            Text("Eliminar", color = theme.answerText(false), fontSize = 11.sp)
                        }
                    }
                }
                val density = androidx.compose.ui.platform.LocalDensity.current.density
                val rotation by androidx.compose.animation.core.animateFloatAsState(
                    targetValue = if (showingAnswer) 180f else 0f,
                    animationSpec = androidx.compose.animation.core.spring(
                        dampingRatio = androidx.compose.animation.core.Spring.DampingRatioNoBouncy,
                        stiffness = androidx.compose.animation.core.Spring.StiffnessMedium
                    ),
                    label = "FlashcardFlipAnim"
                )
                val isBack = rotation > 90f

                Sticker3dCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .graphicsLayer {
                            rotationY = rotation
                            cameraDistance = 14f * density
                        },
                    onClick = { showingAnswer = !showingAnswer },
                    shape = RoundedCornerShape(22.dp),
                    containerColor = if (isBack) theme.surfaceAccent else theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 4.dp
                ) {
                    Column(
                        Modifier.fillMaxSize().then(if (isBack) Modifier.graphicsLayer { rotationY = 180f } else Modifier).padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            Icon(androidx.compose.ui.res.painterResource(if (isBack) com.jonsuapps.rastro.R.drawable.trail_lightbulb else com.jonsuapps.rastro.R.drawable.trail_book_open),
                                null, tint = Color.Unspecified, modifier = Modifier.size(23.dp))
                            Text(if (isBack) "Respuesta" else card.subject.ifBlank { "Pregunta" }, fontSize = 12.sp,
                                color = theme.accentText, fontWeight = FontWeight.Bold)
                        }
                        val parts = remember(card.id, card.a) { flashcardAnswerParts(card.a) }
                        key(card.id, isBack) {
                            BoxWithConstraints(Modifier.weight(1f).fillMaxWidth()) {
                            val bodyHeight = maxHeight
                            Column(Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).heightIn(min = bodyHeight),
                                verticalArrangement = if (isBack && parts.explanation != null) Arrangement.spacedBy(14.dp) else Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(if (isBack) parts.answer else card.q, color = theme.textPrimary,
                                    fontSize = if (isBack) 16.sp else 17.sp, lineHeight = 24.sp,
                                    fontWeight = FontWeight.SemiBold, textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxWidth())
                                if (isBack && parts.explanation != null) {
                                    Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                            Icon(androidx.compose.ui.res.painterResource(com.jonsuapps.rastro.R.drawable.trail_notebook_pen),
                                                null, tint = Color.Unspecified, modifier = Modifier.size(20.dp))
                                            Text(parts.heading.orEmpty(), color = theme.accentText, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                        }
                                        Text(parts.explanation, fontSize = 14.sp, lineHeight = 21.sp, fontWeight = FontWeight.Normal,
                                            color = theme.textPrimary, textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth())
                                    }
                                }
                            }
                        }
                            }
                        Text(if (isBack) "Toca para ver la pregunta" else "Toca para ver la respuesta",
                            fontSize = 11.sp, color = theme.textSecondary, textAlign = TextAlign.Center)
                    }
                }
                if (card.authorName.isNotBlank()) Text(card.authorName, color = theme.textSecondary,
                    fontSize = 10.sp, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                    maxLines = 1, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis)

                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick = { currentIndex = (currentIndex - 1).coerceAtLeast(0); showingAnswer = false }, enabled = currentIndex > 0) {
                        Text("Anterior")
                    }
                    Text("${currentIndex + 1} / ${filtered.size}", color = theme.textSecondary, fontSize = 11.sp)
                    TextButton(onClick = { currentIndex = (currentIndex + 1).coerceAtMost(filtered.lastIndex); showingAnswer = false },
                        enabled = currentIndex < filtered.lastIndex) { Text("Siguiente") }
                }

                }
            }
        }
    }
    if (showCreateDialog) CreateFlashcardDialog(
        theme = theme,
        initialCard = card.takeIf { it != null && FirebaseAuth.getInstance().currentUser?.uid != null && it.authorUid == FirebaseAuth.getInstance().currentUser?.uid },
        onDismiss = { showCreateDialog = false }
    )
    if (showReportDialog && card != null) ReportFlashcardDialog(card, theme, onDismiss = { showReportDialog = false })
    if (showDeleteDialog && card != null) {
        com.jonsuapps.rastro.android.ui.components.RastroStickerDialog(
            onDismissRequest = { showDeleteDialog = false },
            title = "Eliminar tarjeta",
            message = "Se eliminará esta tarjeta de la comunidad de forma definitiva.${if (deleteError != null) "\n\nError: $deleteError" else ""}",
            confirmText = "Eliminar",
            cancelText = "Cancelar",
            icon = Icons.Rounded.DeleteForever,
            isDestructive = true,
            theme = theme,
            onConfirm = {
                deleteError = null
                FlashcardRepository.delete(card.id) { result ->
                    result.fold(
                        onSuccess = { showDeleteDialog = false },
                        onFailure = { deleteError = it.localizedMessage ?: "No se pudo eliminar la tarjeta." }
                    )
                }
            }
        )
    }
}

@Composable
private fun ReportFlashcardDialog(
    card: com.jonsuapps.rastro.model.FlashcardItem,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onDismiss: () -> Unit
) {
    val reasons = listOf("Respuesta incorrecta", "Falta contexto", "Contenido duplicado", "Otro problema")
    var reason by remember(card.id) { mutableStateOf(reasons.first()) }
    var details by remember(card.id) { mutableStateOf("") }
    var submitting by remember { mutableStateOf(false) }
    var submitted by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }

    androidx.compose.ui.window.Dialog(onDismissRequest = { if (!submitting) onDismiss() }) {
        com.jonsuapps.rastro.android.ui.components.Sticker3dCard(
            modifier = Modifier.fillMaxWidth(0.94f),
            containerColor = theme.surface,
            bottomBevelColor = theme.cardBevel,
            strokeColor = theme.strokeBorder,
            bevelHeight = 4.dp,
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if (submitted) "Reporte enviado" else "Reportar tarjeta",
                        color = theme.textPrimary,
                        fontWeight = FontWeight.Black,
                        fontSize = 17.sp
                    )
                    IconButton(onClick = onDismiss, modifier = Modifier.size(28.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                if (submitted) {
                    Text("Gracias por ayudar a mantener la calidad de las tarjetas comunitarias.", color = theme.textSecondary, fontSize = 13.sp)
                    Spacer(Modifier.height(8.dp))
                    com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                        onClick = onDismiss,
                        modifier = Modifier.fillMaxWidth().height(42.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Text("Cerrar", color = theme.onAccent, fontWeight = FontWeight.Bold)
                    }
                } else {
                    Text(card.q, color = theme.textSecondary, maxLines = 3, fontSize = 12.5.sp)
                    reasons.forEach { option ->
                        Row(
                            Modifier.fillMaxWidth().clickable { reason = option },
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            androidx.compose.material3.RadioButton(selected = reason == option, onClick = { reason = option })
                            Text(option, color = theme.textPrimary, fontSize = 13.sp)
                        }
                    }
                    OutlinedTextField(
                        value = details,
                        onValueChange = { details = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("Detalles (opcional)") },
                        minLines = 2,
                        maxLines = 3,
                        shape = RoundedCornerShape(12.dp)
                    )
                    error?.let { Text(it, color = MaterialTheme.colorScheme.error, fontSize = 12.sp) }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedButton(
                            onClick = onDismiss,
                            modifier = Modifier.weight(1f).height(42.dp),
                            shape = RoundedCornerShape(12.dp),
                            enabled = !submitting
                        ) {
                            Text("Cancelar", color = theme.textSecondary)
                        }
                        com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                            onClick = {
                                submitting = true
                                error = null
                                FlashcardRepository.report(card, reason, details) { result ->
                                    submitting = false
                                    result.fold(
                                        onSuccess = { submitted = true },
                                        onFailure = { error = it.localizedMessage ?: "No se pudo enviar el reporte." }
                                    )
                                }
                            },
                            enabled = !submitting,
                            modifier = Modifier.weight(1.3f).height(42.dp),
                            containerColor = Color(0xFFEF4444),
                            bottomBevelColor = Color(0xFFB91C1C),
                            strokeColor = Color(0xFF7F1D1D)
                        ) {
                            Text(if (submitting) "Enviando..." else "Enviar Reporte", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CreateFlashcardDialog(
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    initialCard: com.jonsuapps.rastro.model.FlashcardItem? = null,
    onDismiss: () -> Unit
) {
    val subjects = listOf("Biología", "Anatomía", "Química", "Física", "Historia", "Geografía", "Lenguaje", "Literatura", "Filosofía", "Psicología", "Ed. Cívica")
    var question by remember(initialCard?.id) { mutableStateOf(initialCard?.q.orEmpty()) }
    var answer by remember(initialCard?.id) { mutableStateOf(initialCard?.a.orEmpty()) }
    var subject by remember(initialCard?.id) { mutableStateOf(initialCard?.subject ?: "Biología") }
    var imageUrl by remember(initialCard?.id) { mutableStateOf(initialCard?.imageUrl.orEmpty()) }
    var submitting by remember { mutableStateOf(false) }
    var submitted by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }

    androidx.compose.ui.window.Dialog(onDismissRequest = { if (!submitting) onDismiss() }) {
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
                        text = if (submitted) "Tarjeta guardada" else if (initialCard == null) "Nueva Tarjeta 3D" else "Editar Tarjeta",
                        color = theme.textPrimary,
                        fontWeight = FontWeight.Black,
                        fontSize = 17.sp
                    )
                    IconButton(onClick = onDismiss, modifier = Modifier.size(28.dp)) {
                        Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                    }
                }

                if (submitted) {
                    Text(
                        text = if (initialCard == null) "La tarjeta se agregó a los aportes de la comunidad." else "Los cambios quedaron guardados con éxito.",
                        color = theme.textSecondary,
                        fontSize = 13.sp
                    )
                    Spacer(Modifier.height(8.dp))
                    com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                        onClick = onDismiss,
                        modifier = Modifier.fillMaxWidth().height(42.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Text("Aceptar", color = theme.onAccent, fontWeight = FontWeight.Bold)
                    }
                } else {
                    OutlinedTextField(
                        value = question,
                        onValueChange = { question = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("Pregunta o concepto clave") },
                        minLines = 2,
                        maxLines = 3,
                        shape = RoundedCornerShape(12.dp)
                    )
                    OutlinedTextField(
                        value = imageUrl,
                        onValueChange = { imageUrl = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("URL de Imagen ilustrativa (opcional)") },
                        placeholder = { Text("https://ejemplo.com/grafico.png") },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp)
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
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("Respuesta explicativa") },
                        minLines = 2,
                        maxLines = 3,
                        shape = RoundedCornerShape(12.dp)
                    )
                    SimulatorFilterDropdown(
                        modifier = Modifier.fillMaxWidth(),
                        selected = subject,
                        options = subjects.map { it to it },
                        onSelect = { subject = it },
                        theme = theme
                    )
                    error?.let { Text(it, color = MaterialTheme.colorScheme.error, fontSize = 12.sp) }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedButton(
                            onClick = onDismiss,
                            modifier = Modifier.weight(1f).height(42.dp),
                            shape = RoundedCornerShape(12.dp),
                            enabled = !submitting
                        ) {
                            Text("Cancelar", color = theme.textSecondary)
                        }

                        com.jonsuapps.rastro.android.ui.components.Sticker3dButton(
                            onClick = {
                                submitting = true
                                error = null
                                val save: (Result<Unit>) -> Unit = { result ->
                                    submitting = false
                                    result.fold(
                                        onSuccess = { submitted = true },
                                        onFailure = { error = it.localizedMessage ?: "No se pudo guardar la tarjeta." }
                                    )
                                }
                                if (initialCard == null) FlashcardRepository.create(question, answer, subject, imageUrl = imageUrl.trim().ifBlank { null }, onComplete = save)
                                else FlashcardRepository.update(initialCard.id, question, answer, subject, save)
                            },
                            enabled = !submitting && question.isNotBlank() && answer.isNotBlank(),
                            modifier = Modifier.weight(1.3f).height(42.dp),
                            containerColor = theme.accent,
                            bottomBevelColor = theme.accentBevel,
                            strokeColor = theme.strokeBorder
                        ) {
                            Text(
                                text = if (submitting) "Guardando..." else if (initialCard == null) "Publicar" else "Guardar",
                                color = theme.onAccent,
                                fontWeight = FontWeight.Black,
                                fontSize = 13.sp
                            )
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun ExamActiveView(
    questions: List<com.jonsuapps.rastro.model.ExamQuestion>,
    currentIndex: Int,
    userAnswers: Map<String, Int>,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    isQuickExam: Boolean,
    search: String,
    onSearchChange: (String) -> Unit,
    subjectOptions: List<String>,
    selectedSubject: String,
    onSubjectChange: (String) -> Unit,
    selectedWeek: String,
    onWeekChange: (String) -> Unit,
    authorOptions: List<String>,
    selectedAuthor: String,
    onAuthorChange: (String) -> Unit,
    onSelectAnswer: (String, Int) -> Unit,
    onNavigateQuestion: (Int) -> Unit,
    onExitNoQuestions: () -> Unit,
    onFinishExam: () -> Unit
) {
    val safeIndex = currentIndex.coerceIn(0, (questions.size - 1).coerceAtLeast(0))
    val q = questions.getOrNull(safeIndex)
    val selectedChoice = q?.let { userAnswers[it.id] }
    var showReportDialog by remember { mutableStateOf(false) }

    if (showReportDialog && q != null) {
        ReportExamQuestionDialog(question = q, onDismiss = { showReportDialog = false })
    }

    if (q == null) {
        Column(
            Modifier.widthIn(max = 760.dp).fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("No hay preguntas con estos filtros", color = theme.textPrimary, fontWeight = FontWeight.Bold)
            Text("Cambia o limpia la búsqueda para continuar.", color = theme.textSecondary)
            Sticker3dButton(onClick = onExitNoQuestions, containerColor = theme.accent, bottomBevelColor = theme.accentBevel, strokeColor = theme.strokeBorder) {
                Text("Volver a la configuración", color = theme.surface)
            }
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .widthIn(max = 760.dp)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(Modifier.weight(1f).verticalScroll(rememberScrollState())) {
            // Barra Superior de Examen
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Pregunta ${currentIndex + 1} de ${questions.size}",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = theme.accentText
                )

                Sticker3dButton(
                    onClick = onFinishExam,
                    containerColor = Color(0xFFEF4444), bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill,
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text("Finalizar", style = MaterialTheme.typography.labelSmall, color = Color.White)
                }
            }

            Text(
                text = "Respondidas: ${questions.count { it.id in userAnswers }} de ${questions.size}  ·  En blanco: ${questions.count { it.id !in userAnswers }}",
                style = MaterialTheme.typography.labelSmall,
                color = theme.textSecondary,
                modifier = Modifier.padding(top = 6.dp)
            )

            if (isQuickExam) {
                OutlinedTextField(
                    value = search,
                    onValueChange = onSearchChange,
                    modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                    singleLine = true,
                    placeholder = { Text("Buscar pregunta...", fontSize = 13.sp) },
                    leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
                    shape = RoundedCornerShape(13.dp)
                )
                Row(Modifier.fillMaxWidth().padding(top = 6.dp), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    SimulatorFilterDropdown(
                        modifier = Modifier.weight(1f), selected = selectedSubject,
                        options = listOf("todas" to "Todas las asignaturas") + subjectOptions.map { it to it },
                        onSelect = onSubjectChange, theme = theme
                    )
                    SimulatorFilterDropdown(
                        modifier = Modifier.weight(1f), selected = selectedWeek,
                        options = listOf("todas" to "Todas las semanas") + (1..10).map { it.toString() to "Semana $it" },
                        onSelect = onWeekChange, theme = theme
                    )
                }
                SimulatorFilterDropdown(
                    modifier = Modifier.fillMaxWidth().padding(top = 6.dp), selected = selectedAuthor,
                    options = listOf("todos" to "Todos los autores") + authorOptions.map { it to it },
                    onSelect = onAuthorChange, theme = theme
                )
            }

            LazyRow(
                modifier = Modifier.fillMaxWidth().padding(top = 12.dp, bottom = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(questions.size) { index ->
                    val current = index == safeIndex
                    val answered = questions[index].id in userAnswers
                    Surface(
                        modifier = Modifier.size(width = 38.dp, height = 36.dp).clickable { onNavigateQuestion(index) },
                        shape = RoundedCornerShape(10.dp),
                        color = when {
                            current -> Color(0xFFEC4899)
                            answered -> Color(0xFF10B981).copy(alpha = 0.15f)
                            else -> theme.surfaceAccent
                        },
                        border = androidx.compose.foundation.BorderStroke(
                            if (current) 2.dp else 1.dp,
                            if (current) Color(0xFFEC4899) else theme.borderSubtle
                        )
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = (index + 1).toString(),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (current) Color.White else theme.textPrimary
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Tarjeta de Enunciado
            Sticker3dCard(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                containerColor = theme.surface, strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = q.asignatura,
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.accentText,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f)
                        )
                        q.semana?.let { week ->
                            Text("S$week", style = MaterialTheme.typography.labelSmall, color = theme.textSecondary)
                        }
                        val allFavorites by FavoritesRepository.favoritesFlow.collectAsState()
                        val isFavQuestion = allFavorites.any { it.itemId == q.id && it.type == FavoriteType.QUESTION }

                        IconButton(
                            onClick = {
                                FavoritesRepository.toggle(
                                    type = FavoriteType.QUESTION,
                                    itemId = q.id,
                                    title = q.q,
                                    subtitle = "${q.asignatura} • ${q.options.getOrNull(q.answer) ?: ""}",
                                    subject = q.asignatura,
                                    area = q.area ?: "General",
                                    imageUrl = q.imageUrl
                                )
                            },
                            modifier = Modifier.size(28.dp)
                        ) {
                            Icon(
                                imageVector = if (isFavQuestion) Icons.Rounded.Star else Icons.Rounded.StarOutline,
                                contentDescription = "Favorito",
                                tint = if (isFavQuestion) Color(0xFFF59E0B) else theme.textSecondary,
                                modifier = Modifier.size(19.dp)
                            )
                        }

                        TextButton(onClick = { showReportDialog = true }) {
                            Icon(Icons.Rounded.Flag, contentDescription = null, modifier = Modifier.size(15.dp), tint = Color(0xFFEF4444))
                            Text("Reportar", color = theme.answerText(false), fontSize = 11.sp)
                        }
                    }
                    Text(
                        text = "${q.curso} · ${q.authorName}${if (q.area != null && q.area != "General") " · Área ${q.area}" else ""}",
                        style = MaterialTheme.typography.labelSmall,
                        color = theme.textSecondary
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = q.q,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = theme.textPrimary,
                        lineHeight = 22.sp
                    )
                    if (!q.imageUrl.isNullOrBlank()) {
                        Spacer(modifier = Modifier.height(10.dp))
                        CachedRemoteImage(
                            url = q.imageUrl,
                            contentDescription = "Imagen de la pregunta",
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = 120.dp, max = 220.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .border(1.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Fit
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Alternativas
            q.options.forEachIndexed { optIdx, optText ->
                val isSelected = selectedChoice == optIdx
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 5.dp)
                        .clip(RastroShapes.Squircle)
                        .background(if (isSelected) theme.accent.copy(alpha = 0.12f) else theme.surface)
                        .border(
                            1.5.dp,
                            if (isSelected) theme.accent else theme.borderSubtle,
                            RastroShapes.Squircle
                        )
                        .clickable { onSelectAnswer(q.id, optIdx) }
                        .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val letter = ('A' + optIdx).toString()
                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .clip(RastroShapes.Pill)
                            .background(if (isSelected) theme.accent else theme.surfaceAccent),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = letter,
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = if (isSelected) contrastingText(theme.accent) else theme.textPrimary
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = optText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = theme.textPrimary
                    )
                }
            }
        }

        // Navegación Anterior / Siguiente
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Sticker3dButton(
                onClick = { onNavigateQuestion(safeIndex - 1) },
                enabled = safeIndex > 0,
                containerColor = theme.surfaceAccent, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder,
                shape = RastroShapes.Pill
            ) {
                Text("Anterior", color = theme.textPrimary)
            }

            if (safeIndex < questions.size - 1) {
                Sticker3dButton(
                    onClick = { onNavigateQuestion(safeIndex + 1) },
                    containerColor = theme.accent, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill
                ) {
                    Text("Siguiente", color = contrastingText(theme.accent))
                }
            } else {
                Sticker3dButton(
                    onClick = onFinishExam,
                    containerColor = Color(0xFF10B981), bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder,
                    shape = RastroShapes.Pill
                ) {
                    Text("Calificar", color = Color.White)
                }
            }
        }
    }
}

@Composable
fun ExamResultView(
    result: ExamEvaluationResult,
    allowReview: Boolean = false,
    reviewQuestions: List<com.jonsuapps.rastro.model.ExamQuestion> = emptyList(),
    isRanking: Boolean = false,
    area: AreaAdmision,
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    onRetry: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .widthIn(max = 760.dp)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Tarjeta de Puntaje Ponderado
        Sticker3dCard(
            modifier = Modifier.fillMaxWidth(),
            shape = RastroShapes.Squircle,
            containerColor = theme.surface, strokeColor = theme.strokeBorder, bevelColor = theme.cardBevel
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Dúo Oficial de Mascotas celebrando el simulacro
                ClassicArtwork(when {
                    result.percentage == 100 -> ClassicAppearance.HAPPY
                    result.percentage >= 60 -> ClassicAppearance.IN_LOVE
                    else -> ClassicAppearance.SAD
                }, Modifier.size(130.dp))

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = if (isRanking) "Puntaje Examen Ranking" else "Puntaje Ponderado Oficial UNSA",
                    style = MaterialTheme.typography.labelMedium,
                    color = theme.textSecondary
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "${if (isRanking) SimuladorRepository.rankingScore(result) else result.unsaWeightedScore}",
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold,
                    color = theme.accentText
                )
                Text(
                    text = "sobre 100.0000 puntos · ${result.correctCount * com.jonsuapps.rastro.gamification.GamificationManager.EXAM_CORRECT_XP} EXP por aciertos",
                    style = MaterialTheme.typography.labelSmall,
                    color = theme.textSecondary
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "${result.correctCount}",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = theme.answerText(true)
                        )
                        Text("Correctas", style = MaterialTheme.typography.labelSmall, color = theme.textSecondary)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "${result.wrongCount}",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = theme.answerText(false)
                        )
                        Text("Incorrectas", style = MaterialTheme.typography.labelSmall, color = theme.textSecondary)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "${result.blankCount}",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = theme.textSecondary
                        )
                        Text("En blanco", style = MaterialTheme.typography.labelSmall, color = theme.textSecondary)
                    }
                }
            }
        }

        // Puntajes de Corte de Carreras de la UNSA
        Text(
            text = if (isRanking) "Tu EXP se suma a Aprender y Ligas" else "Referencia histórica UNSA",
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = theme.textPrimary
        )

        if (!isRanking) CareerReferenceComparison(theme, result.unsaWeightedScore, area)

        Spacer(modifier = Modifier.height(8.dp))

        if (allowReview) {
            var showReview by remember { mutableStateOf(false) }
            Sticker3dButton(onClick = { showReview = !showReview }, containerColor = theme.surfaceAccent,
                bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder, modifier = Modifier.fillMaxWidth()) {
                Text(if (showReview) "Ocultar revisión" else "Revisar mis respuestas", color = theme.textPrimary)
            }
            if (showReview) result.details.forEachIndexed { index, detail ->
                QuestionReviewCard(com.jonsuapps.rastro.android.data.FailedQuestion(
                    id = "review:$index", subject = detail.asignatura, subtema = "Pregunta ${index + 1}",
                    question = detail.question, options = detail.options, correctAnswerIndex = detail.correctChoice,
                    explanation = detail.explanation, selectedAnswerIndex = detail.userChoice,
                    imageUrl = reviewQuestions.getOrNull(index)?.imageUrl,
                    origin = if (isRanking) "Ranking" else "Simulacro"), theme,
                    status = when { detail.isBlank -> "Sin responder"; detail.isCorrect -> "Correcta"; else -> "Incorrecta" })
            }
        }

        Sticker3dButton(
            onClick = onRetry,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            containerColor = theme.accent, bottomBevelColor = theme.cardBevel, strokeColor = theme.strokeBorder,
            shape = RastroShapes.Pill
        ) {
            Text("Realizar Otro Simulacro", color = contrastingText(theme.accent), fontWeight = FontWeight.Bold)
        }
    }
}
