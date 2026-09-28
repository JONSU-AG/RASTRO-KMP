package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
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
    modifier: Modifier = Modifier
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
    var activeSimulatorTab by remember { mutableIntStateOf(2) }
    var quickQuestionCount by remember { mutableIntStateOf(15) }
    var quickSearch by remember { mutableStateOf("") }
    var quickSubjectFilter by remember { mutableStateOf("todas") }
    var quickWeekFilter by remember { mutableStateOf("todas") }
    var quickAuthorFilter by remember { mutableStateOf("todos") }
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    val userAnswers = remember { mutableStateMapOf<String, Int>() }
    var examResult by remember { mutableStateOf<ExamEvaluationResult?>(null) }
    var showFinishConfirmationDialog by remember { mutableStateOf(false) }
    var showCreateQuestionDialog by remember { mutableStateOf(false) }

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
    val examQuestions = remember(activeSimulatorTab, allExamQuestions, quickFilteredQuestions, quickQuestionCount, selectedArea, selectedOrderPreference, questionShuffleSeed) {
        when (activeSimulatorTab) {
            0 -> SimuladorRepository.generateOfficialSimulacro80(allExamQuestions, selectedArea, selectedOrderPreference, questionShuffleSeed)
            1 -> if (quickQuestionCount < 0) quickFilteredQuestions else quickFilteredQuestions.take(quickQuestionCount.coerceAtLeast(1))
            else -> allExamQuestions
        }
    }

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
                isExamRunning = false
                examResult = SimuladorRepository.calculateScore(
                    questions = examQuestions,
                    userAnswers = examQuestions.mapIndexedNotNull { index, question ->
                        userAnswers[question.id]?.let { index to it }
                    }.toMap(),
                    area = selectedArea
                )
            }
        )
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentAlignment = Alignment.TopCenter
    ) {
        when {
            // Pantalla de Resultados Ponderados Oficiales
            examResult != null -> {
                ExamResultView(
                    result = examResult!!,
                    area = selectedArea,
                    theme = theme,
                    onRetry = {
                        examResult = null
                        userAnswers.clear()
                        currentQuestionIndex = 0
                    }
                )
            }

            // Examen en Curso
            isExamRunning -> {
                ExamActiveView(
                    questions = examQuestions,
                    currentIndex = currentQuestionIndex,
                    userAnswers = userAnswers,
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
                    onSelectTab = { activeSimulatorTab = it },
                    selectedArea = selectedArea,
                    onSelectArea = { selectedArea = it },
                    selectedOrder = selectedOrderPreference,
                    onSelectOrder = { selectedOrderPreference = it },
                    orderOptions = orderOptions,
                    theme = theme,
                    canStartOfficial = allExamQuestions.isNotEmpty(),
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
                    onStartExam = {
                        userAnswers.clear()
                        currentQuestionIndex = 0
                        isExamRunning = true
                    }
                )
            }
        }
    }
    if (showCreateQuestionDialog) CreateExamQuestionDialog(onDismiss = { showCreateQuestionDialog = false })
}

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
    val simulatorTabs = listOf(
        Pair("Simulacro (80)", Icons.Rounded.TrackChanges),
        Pair("Examen Rápido", Icons.Rounded.Bolt),
        Pair("Calculadora", Icons.Rounded.Calculate),
        Pair("Flashcards", Icons.Rounded.CollectionsBookmark)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .widthIn(max = 760.dp),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // ──────────────── 1. TÍTULO Y SUBTÍTULO CENTRADO (Foto 5) ────────────────
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Simulador Académico",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Black,
                    color = theme.textPrimary,
                    textAlign = TextAlign.Center,
                    letterSpacing = (-0.5).sp
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Calcula con precisión tu puntaje ponderado oficial y pon a prueba tu preparación.",
                    fontSize = 14.sp,
                    color = theme.textSecondary,
                    textAlign = TextAlign.Center,
                    lineHeight = 19.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
        }

        // ──────────────── 2. CARRUSEL CON FLECHITAS < Y > ────────────────
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                // Flecha Izquierda con micro-rebote 3D
                Sticker3dCircleButton(
                    onClick = { if (activeTab > 0) onSelectTab(activeTab - 1) },
                    enabled = activeTab > 0,
                    size = 38.dp,
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    strokeWidth = 1.5.dp,
                    bevelHeight = 2.5.dp
                ) {
                    Icon(
                        Icons.Rounded.ChevronLeft,
                        contentDescription = "Anterior",
                        tint = if (activeTab > 0) Color(0xFF007AFF) else theme.textSecondary.copy(alpha = 0.4f),
                        modifier = Modifier.size(20.dp)
                    )
                }

                // Pestañas horizontales con estilo Apple Glass y micro-rebote Duolingo
                LazyRow(
                    modifier = Modifier
                        .weight(1f)
                        .appleGlass(
                            cornerRadius = 22.dp,
                            isDark = !theme.isLight,
                            tintColor = theme.surface,
                            alpha = if (theme.isLight) 0.88f else 0.70f
                        )
                        .border(1.8.dp, theme.strokeBorder, RoundedCornerShape(22.dp))
                        .padding(5.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    items(simulatorTabs.size) { index ->
                        val isSelected = activeTab == index
                        val (tabTitle, tabIcon) = simulatorTabs[index]
                        val bgBrush = when (index) {
                            0 -> if (isSelected) Brush.horizontalGradient(listOf(Color(0xFF10B981), Color(0xFF059669))) else null
                            1 -> if (isSelected) Brush.horizontalGradient(listOf(Color(0xFFEC4899), Color(0xFFF43F5E))) else null
                            2 -> if (isSelected) Brush.horizontalGradient(listOf(Color(0xFF007AFF), Color(0xFF00C6FF))) else null
                            else -> if (isSelected) Brush.horizontalGradient(listOf(Color(0xFF6366F1), Color(0xFF8B5CF6))) else null
                        }

                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = Color.Transparent,
                            modifier = Modifier
                                .then(
                                    if (bgBrush != null) Modifier.background(bgBrush, RoundedCornerShape(14.dp))
                                    else Modifier
                                )
                                .bouncyClick(scaleDown = 0.92f) { onSelectTab(index) }
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp),
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                            ) {
                                Icon(
                                    imageVector = tabIcon,
                                    contentDescription = null,
                                    tint = if (isSelected) Color.White else theme.textSecondary,
                                    modifier = Modifier.size(15.dp)
                                )
                                Text(
                                    text = tabTitle,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = if (isSelected) Color.White else theme.textSecondary
                                )
                            }
                        }
                    }
                }

                // Flecha Derecha con micro-rebote 3D
                Sticker3dCircleButton(
                    onClick = { if (activeTab < simulatorTabs.size - 1) onSelectTab(activeTab + 1) },
                    enabled = activeTab < simulatorTabs.size - 1,
                    size = 38.dp,
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    strokeWidth = 1.5.dp,
                    bevelHeight = 2.5.dp
                ) {
                    Icon(
                        Icons.Rounded.ChevronRight,
                        contentDescription = "Siguiente",
                        tint = if (activeTab < simulatorTabs.size - 1) Color(0xFF007AFF) else theme.textSecondary.copy(alpha = 0.4f),
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }

        // ──────────────── 3. BANNER AZUL INFORMATIVO (Foto 5) ────────────────
        item {
            Sticker3dCard(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                containerColor = Color(0xFF007AFF).copy(alpha = 0.08f),
                bottomBevelColor = Color(0xFF007AFF).copy(alpha = 0.22f),
                strokeColor = theme.strokeBorder,
                bevelHeight = 2.5.dp,
                strokeWidth = 1.5.dp
            ) {
                Row(
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 14.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "‹ ↔ Desliza horizontalmente para ver las 4 secciones ↔ ›",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Black,
                        color = Color(0xFF007AFF),
                        textAlign = TextAlign.Center
                    )
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
                Column(modifier = Modifier.padding(20.dp)) {
                    // Chip Verde Menta: MODALIDAD OFICIAL UNSA
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = Color(0xFF10B981).copy(alpha = 0.12f),
                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF10B981).copy(alpha = 0.3f))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Rounded.Bookmark, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "MODALIDAD OFICIAL UNSA",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black,
                                color = Color(0xFF059669),
                                letterSpacing = 0.5.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Título y Descripción del Simulacro
                    Text(
                        text = "Simulacro de Admisión (80 Preguntas)",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary,
                        letterSpacing = (-0.4).sp
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Preguntas oficiales extraídas directamente de los solucionarios CEPREUNSA con ponderación oficial sobre 100.0000 pts.",
                        fontSize = 13.sp,
                        color = theme.textSecondary,
                        lineHeight = 18.sp
                    )

                    Spacer(modifier = Modifier.height(18.dp))

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
                                selectedBgColor = Color(0xFFF59E0B),
                                selectedContentColor = Color.White,
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
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Estructura de Preguntas (${selectedArea.label})",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = theme.textPrimary
                                )
                                Text(
                                    text = "Total: 80 preg. (100.0000 pts)",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Black,
                                    color = Color(0xFF059669)
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            val distribution = when (selectedArea) {
                                AreaAdmision.SOCIALES -> listOf(
                                    "Habilidad Verbal (12)" to "18.0000 pts",
                                    "Habilidad Lógica (10)" to "15.0000 pts",
                                    "Historia & Geografía (14)" to "20.0000 pts",
                                    "Filosofía, Psicología & Cívica (14)" to "18.0000 pts",
                                    "Matemáticas (12)" to "14.0000 pts",
                                    "Ciencias Naturales (18)" to "15.0000 pts"
                                )
                                AreaAdmision.INGENIERIAS -> listOf(
                                    "Matemáticas (Álgebra, Geom., Trig.) (24)" to "35.0000 pts",
                                    "Física & Química (18)" to "25.0000 pts",
                                    "Habilidad Lógica & Verbal (20)" to "25.0000 pts",
                                    "Humanidades & Sociales (18)" to "15.0000 pts"
                                )
                                AreaAdmision.BIOMEDICAS -> listOf(
                                    "Biología & Anatomía (22)" to "32.0000 pts",
                                    "Química & Física (18)" to "26.0000 pts",
                                    "Habilidad Verbal & Lógica (20)" to "25.0000 pts",
                                    "Matemáticas & Sociales (20)" to "17.0000 pts"
                                )
                            }

                            distribution.forEach { (materia, puntos) ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 3.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(text = "• $materia", fontSize = 11.sp, color = theme.textSecondary)
                                    Text(text = puntos, fontSize = 11.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
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
                        selectedContentColor = Color.White,
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
                Icon(Icons.Rounded.Add, null, modifier = Modifier.size(16.dp), tint = theme.accent)
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

@Composable
private fun ProjectedScoreCalculator(
    theme: com.jonsuapps.rastro.theme.RastroPalette,
    selectedArea: AreaAdmision,
    onSelectArea: (AreaAdmision) -> Unit
) {
    val scores = remember(selectedArea) { mutableStateMapOf<String, Int>() }
    val subjects = SimuladorRepository.getPonderaciones(selectedArea)
    val projected = subjects.sumOf { item ->
        (scores[item.asignatura] ?: 0).coerceIn(0, item.preguntas) * item.valor
    }.coerceAtMost(100.0)
    Sticker3dCard(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(22.dp),
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 4.dp
    ) {
        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Text("Puntaje Oficial Proyectado", fontSize = 19.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                listOf(
                    Triple(AreaAdmision.SOCIALES, "Sociales", Color(0xFFEC4899) to Color(0xFFBE185D)),
                    Triple(AreaAdmision.INGENIERIAS, "Ingenierías", Color(0xFFF59E0B) to Color(0xFFB45309)),
                    Triple(AreaAdmision.BIOMEDICAS, "Biomédicas", Color(0xFF007AFF) to Color(0xFF0051A8))
                ).forEach { (area, label, colors) ->
                    val isSelected = selectedArea == area
                    Sticker3dPill(
                        selected = isSelected,
                        onClick = { onSelectArea(area) },
                        modifier = Modifier.weight(1f),
                        selectedColor = colors.first,
                        unselectedColor = theme.surface,
                        selectedBevel = colors.second,
                        unselectedBevel = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        strokeWidth = 1.5.dp,
                        bevelHeight = 2.5.dp
                    ) {
                        Text(
                            text = label,
                            maxLines = 1,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Black,
                            color = if (isSelected) Color.White else theme.textSecondary
                        )
                    }
                }
            }
            Sticker3dCard(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                containerColor = Color(0xFF007AFF).copy(alpha = 0.08f),
                bottomBevelColor = Color(0xFF007AFF).copy(alpha = 0.22f),
                strokeColor = theme.strokeBorder,
                bevelHeight = 3.dp,
                strokeWidth = 1.5.dp
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = String.format("%.2f", projected),
                        color = Color(0xFF007AFF),
                        fontSize = 36.sp,
                        fontWeight = FontWeight.Black,
                        letterSpacing = (-1).sp
                    )
                    Spacer(Modifier.height(2.dp))
                    Text(
                        text = "PUNTOS / 100.00  ·  ${scores.values.sum()} aciertos",
                        color = theme.textSecondary,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
            Text("Ajusta tus aciertos por asignatura", color = theme.textPrimary, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            subjects.forEach { subject ->
                val correct = (scores[subject.asignatura] ?: 0).coerceIn(0, subject.preguntas)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(theme.surfaceAccent)
                        .border(1.2.dp, theme.strokeBorder.copy(alpha = 0.22f), RoundedCornerShape(14.dp))
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(Modifier.weight(1f)) {
                        Text(
                            text = subject.asignatura,
                            fontSize = 12.sp,
                            color = theme.textPrimary,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "$correct de ${subject.preguntas} · ${String.format("%.4f", subject.valor)} pts/acierto",
                            fontSize = 10.sp,
                            color = theme.textSecondary
                        )
                    }

                    // Botón Restar (-) 3D
                    Sticker3dCounterButton(
                        onClick = { scores[subject.asignatura] = (correct - 1).coerceAtLeast(0) },
                        enabled = correct > 0,
                        size = 32.dp,
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        strokeWidth = 1.3.dp,
                        bevelHeight = 2.dp
                    ) {
                        Icon(
                            Icons.Rounded.Remove,
                            contentDescription = "Restar acierto",
                            tint = if (correct > 0) theme.accent else theme.textSecondary.copy(alpha = 0.35f),
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    Text(
                        text = correct.toString(),
                        fontSize = 14.sp,
                        color = theme.textPrimary,
                        fontWeight = FontWeight.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.widthIn(min = 28.dp)
                    )

                    // Botón Sumar (+) 3D
                    Sticker3dCounterButton(
                        onClick = { scores[subject.asignatura] = (correct + 1).coerceAtMost(subject.preguntas) },
                        enabled = correct < subject.preguntas,
                        size = 32.dp,
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        strokeWidth = 1.3.dp,
                        bevelHeight = 2.dp
                    ) {
                        Icon(
                            Icons.Rounded.Add,
                            contentDescription = "Sumar acierto",
                            tint = if (correct < subject.preguntas) theme.accent else theme.textSecondary.copy(alpha = 0.35f),
                            modifier = Modifier.size(16.dp)
                        )
                    }
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
                Icon(Icons.Rounded.Add, contentDescription = null, modifier = Modifier.size(17.dp), tint = theme.accent)
                Spacer(Modifier.width(6.dp))
                Text("Crear tarjeta", fontWeight = FontWeight.Bold, color = theme.textPrimary, fontSize = 13.sp)
            }
            if (card != null) {
                val currentUid = FirebaseAuth.getInstance().currentUser?.uid
                val canManage = currentUid != null && card.authorUid == currentUid
                Row(
                    Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    TextButton(onClick = { showReportDialog = true }) {
                        Icon(Icons.Rounded.Flag, contentDescription = null, modifier = Modifier.size(15.dp), tint = Color(0xFFEF4444))
                        Text("Reportar", color = Color(0xFFEF4444), fontSize = 11.sp)
                    }
                    if (canManage) {
                        TextButton(onClick = { showCreateDialog = true }) {
                            Icon(Icons.Rounded.Edit, contentDescription = null, modifier = Modifier.size(15.dp))
                            Text("Editar", fontSize = 11.sp)
                        }
                        TextButton(onClick = { showDeleteDialog = true }) {
                            Icon(Icons.Rounded.DeleteOutline, contentDescription = null, modifier = Modifier.size(15.dp), tint = Color(0xFFEF4444))
                            Text("Eliminar", color = Color(0xFFEF4444), fontSize = 11.sp)
                        }
                    }
                }
                val density = androidx.compose.ui.platform.LocalDensity.current.density
                val rotation by androidx.compose.animation.core.animateFloatAsState(
                    targetValue = if (showingAnswer) 180f else 0f,
                    animationSpec = androidx.compose.animation.core.spring(
                        dampingRatio = androidx.compose.animation.core.Spring.DampingRatioMediumBouncy,
                        stiffness = androidx.compose.animation.core.Spring.StiffnessMediumLow
                    ),
                    label = "FlashcardFlipAnim"
                )
                val isBack = rotation > 90f

                Sticker3dCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 250.dp)
                        .graphicsLayer {
                            rotationY = rotation
                            cameraDistance = 14f * density
                        },
                    onClick = { showingAnswer = !showingAnswer },
                    shape = RoundedCornerShape(22.dp),
                    containerColor = if (isBack) Color(0xFFEEF2FF) else theme.surface,
                    bottomBevelColor = if (isBack) Color(0xFFC7D2FE) else theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 4.dp
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .then(if (isBack) Modifier.graphicsLayer { rotationY = 180f } else Modifier),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            Modifier.fillMaxWidth().padding(22.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = if (isBack) "RESPUESTA" else card.subject.uppercase(),
                                fontSize = 11.sp,
                                color = Color(0xFF6366F1),
                                fontWeight = FontWeight.Black
                            )
                            Text(card.authorName, fontSize = 10.sp, color = theme.textSecondary)
                            Spacer(Modifier.height(16.dp))
                            Text(
                                text = if (isBack) card.a else card.q,
                                fontSize = 18.sp,
                                lineHeight = 26.sp,
                                color = theme.textPrimary,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center
                            )
                            Spacer(Modifier.height(18.dp))
                            Text(
                                text = if (isBack) "Toca para ver la pregunta 🔄" else "Toca para mostrar la respuesta 🔄",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = theme.textSecondary
                            )
                        }
                    }
                }
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick = { currentIndex = (currentIndex - 1).coerceAtLeast(0); showingAnswer = false }, enabled = currentIndex > 0) {
                        Text("Anterior")
                    }
                    Text("${currentIndex + 1} / ${filtered.size}", color = theme.textSecondary, fontSize = 11.sp)
                    TextButton(onClick = { currentIndex = (currentIndex + 1).coerceAtMost(filtered.lastIndex); showingAnswer = false },
                        enabled = currentIndex < filtered.lastIndex) { Text("Siguiente") }
                }
            } else Text("No hay tarjetas para esta materia.", color = theme.textSecondary)
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
                        Text("Cerrar", color = Color.White, fontWeight = FontWeight.Bold)
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
                        Text("Aceptar", color = Color.White, fontWeight = FontWeight.Bold)
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
                                color = Color.White,
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
            Modifier.fillMaxSize().widthIn(max = 760.dp).padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("No hay preguntas con estos filtros", color = theme.textPrimary, fontWeight = FontWeight.Bold)
            Text("Cambia o limpia la búsqueda para continuar.", color = theme.textSecondary)
            Button(onClick = onExitNoQuestions, colors = ButtonDefaults.buttonColors(containerColor = theme.accent)) {
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
                    color = theme.accent
                )

                Button(
                    onClick = onFinishExam,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444)),
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
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = q.asignatura,
                            style = MaterialTheme.typography.labelSmall,
                            color = theme.accent,
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
                            Text("Reportar", color = Color(0xFFEF4444), fontSize = 11.sp)
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
                            color = if (isSelected) theme.surface else theme.textPrimary
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
            Button(
                onClick = { onNavigateQuestion(safeIndex - 1) },
                enabled = safeIndex > 0,
                colors = ButtonDefaults.buttonColors(containerColor = theme.surfaceAccent),
                shape = RastroShapes.Pill
            ) {
                Text("Anterior", color = theme.textPrimary)
            }

            if (safeIndex < questions.size - 1) {
                Button(
                    onClick = { onNavigateQuestion(safeIndex + 1) },
                    colors = ButtonDefaults.buttonColors(containerColor = theme.accent),
                    shape = RastroShapes.Pill
                ) {
                    Text("Siguiente", color = theme.surface)
                }
            } else {
                Button(
                    onClick = onFinishExam,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF10B981)),
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
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RastroShapes.Squircle,
            colors = CardDefaults.cardColors(containerColor = theme.surface),
            border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Dúo Oficial de Mascotas celebrando el simulacro
                DualMascotDuo(size = 72.dp)

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Puntaje Ponderado Oficial UNSA",
                    style = MaterialTheme.typography.labelMedium,
                    color = theme.textSecondary
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "${result.unsaWeightedScore}",
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold,
                    color = theme.accent
                )
                Text(
                    text = "sobre 100.0000 puntos",
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
                            color = Color(0xFF10B981)
                        )
                        Text("Correctas", style = MaterialTheme.typography.labelSmall, color = theme.textSecondary)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "${result.wrongCount}",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFEF4444)
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
            text = "Comparativa con Puntajes de Corte UNSA",
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = theme.textPrimary
        )

        val relevantCareers = remember(area) {
            SimuladorRepository.carrerasUNSACortes.filter { it.area == area }
        }

        relevantCareers.forEach { carrera ->
            val hasPassed = result.unsaWeightedScore >= carrera.minScore
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RastroShapes.Squircle,
                colors = CardDefaults.cardColors(containerColor = theme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, theme.borderSubtle)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = carrera.name,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "Corte: ${carrera.minScore} - ${carrera.maxScore} pts",
                            style = MaterialTheme.typography.bodySmall,
                            color = theme.textSecondary
                        )
                    }

                    Box(
                        modifier = Modifier
                            .clip(RastroShapes.Pill)
                            .background(if (hasPassed) Color(0xFFD1FAE5) else Color(0xFFFEE2E2))
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = if (hasPassed) "Puntaje Apto" else "Requiere Refuerzo",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = if (hasPassed) Color(0xFF047857) else Color(0xFFB91C1C)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onRetry,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = theme.accent),
            shape = RastroShapes.Pill
        ) {
            Text("Realizar Otro Simulacro", color = theme.surface, fontWeight = FontWeight.Bold)
        }
    }
}
