package com.jonsuapps.rastro.android.ui

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.media.AudioManager
import android.media.ToneGenerator
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.*
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.jonsuapps.rastro.android.data.GamificationRepository
import com.jonsuapps.rastro.android.data.NotificationRepository
import com.jonsuapps.rastro.android.data.RastroNotification
import com.jonsuapps.rastro.android.data.UserProfileRepository
import com.jonsuapps.rastro.gamification.GamificationManager
import kotlinx.coroutines.delay
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import com.jonsuapps.rastro.android.ui.components.LiquidNavbar
import com.jonsuapps.rastro.android.ui.components.TopHeaderActions
import com.jonsuapps.rastro.android.ui.components.PomodoroFloatingPillOverlay
import com.jonsuapps.rastro.android.ui.components.NotificationsDialog
import com.jonsuapps.rastro.android.ui.components.PomodoroFullModal
import com.jonsuapps.rastro.android.ui.components.MoreActionsDialog
import com.jonsuapps.rastro.android.ui.components.MoreAction
import com.jonsuapps.rastro.android.ui.components.ThemeSelectorDialog
import com.jonsuapps.rastro.android.ui.components.ProfileSettingsDialog
import com.jonsuapps.rastro.android.ui.components.TermsAndPrivacyDialog
import com.jonsuapps.rastro.android.ui.components.TermsConsentDialog
import com.jonsuapps.rastro.android.ui.components.EntryAnnouncementDialog
import com.jonsuapps.rastro.android.ui.components.ExitStreakPromptDialog
import com.jonsuapps.rastro.android.ui.components.MascotMood
import com.jonsuapps.rastro.android.ui.mascots.loki.LokiLabDialog
import com.jonsuapps.rastro.android.ui.components.VocationalTestDialog
import com.jonsuapps.rastro.android.ui.components.WelcomeOnboardingDialog
import com.jonsuapps.rastro.android.ui.components.WidgetsAndShortcutsDialog
import com.jonsuapps.rastro.android.widgets.RastroWidgetManager
import com.jonsuapps.rastro.android.ui.screens.*
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.navigation.RastroScreen
import com.jonsuapps.rastro.pomodoro.PomodoroState
import com.jonsuapps.rastro.pomodoro.PomodoroMode
import com.jonsuapps.rastro.pomodoro.PomodoroAlertSound
import com.jonsuapps.rastro.pomodoro.PomodoroViewState
import com.jonsuapps.rastro.theme.*

@Composable
fun RastroApp(
    currentThemeId: RastroThemeId = ThemeManager.currentThemeId,
    onThemeChange: (RastroThemeId) -> Unit = { ThemeManager.setTheme(it) }
) {
    val context = LocalContext.current
    val theme = remember(currentThemeId) { RastroThemeTokens.getColors(currentThemeId) }
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: RastroScreen.Home.route
    val currentUser by UserManager.currentUser.collectAsState()
    var authStateResolved by remember { mutableStateOf(false) }
    var showNotificationPrompt by remember { mutableStateOf(false) }
    var showNotifications by remember { mutableStateOf(false) }
    var showMoreActions by remember { mutableStateOf(false) }
    val canOpenLokiLab = currentUser.isAuthenticated && !currentUser.isAnonymous && AdminConfig.isAdmin(currentUser.email)
    var showLokiLab by remember(currentUser.uid, canOpenLokiLab) { mutableStateOf(false) }
    var notifications by remember(currentUser.uid) { mutableStateOf(emptyList<RastroNotification>()) }

    val rastroPrefs = remember(context) {
        context.getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE)
    }
    var showTermsConsent by remember {
        mutableStateOf(!rastroPrefs.getBoolean("terms_accepted", false))
    }
    var activeEntryAnnouncement by remember { mutableStateOf<RastroNotification?>(null) }

    LaunchedEffect(notifications) {
        val latestBroadcast = notifications.firstOrNull { it.isBroadcast }
        if (latestBroadcast != null) {
            val lastSeenPopupId = rastroPrefs.getString("last_seen_popup_id", null)
            if (latestBroadcast.id != lastSeenPopupId) {
                activeEntryAnnouncement = latestBroadcast
            }
        }
    }

    DisposableEffect(Unit) {
        val settingsListener = FirebaseFirestore.getInstance().collection("site_settings").document("global")
            .addSnapshotListener { snapshot, _ ->
                if (snapshot != null && snapshot.exists()) {
                    val maxLives = snapshot.getLong("maxLives")?.toInt() ?: GamificationManager.DEFAULT_MAX_HEARTS
                    GamificationManager.setMaxHearts(maxLives)
                    val recAmount = snapshot.getLong("lifeRecoveryAmount") ?: 3L
                    val recUnitStr = snapshot.getString("lifeRecoveryUnit") ?: "MINUTOS"
                    val recUnit = com.jonsuapps.rastro.gamification.LifeRecoveryUnit.fromString(recUnitStr)
                    GamificationManager.setRecoveryConfig(recAmount, recUnit)
                }
            }
        onDispose { settingsListener.remove() }
    }

    // Ticker ligero de regeneración periódica mientras la app está abierta
    LaunchedEffect(Unit) {
        while (true) {
            GamificationManager.updateHeartRegeneration()
            kotlinx.coroutines.delay(1000L)
        }
    }

    DisposableEffect(currentUser.uid) {
        val listeners = NotificationRepository.observe(currentUser.uid, context) { notifications = it }
        val profileListener = if (currentUser.uid.isNotBlank()) {
            UserProfileRepository.observe(currentUser.uid) { data ->
                @Suppress("UNCHECKED_CAST")
                val blocked = data["blockedUsers"] as? List<String>
                UserManager.applyProfileFields(
                    displayName = data["displayName"] as? String,
                    photoURL = data["photoURL"] as? String,
                    bio = data["bio"] as? String,
                    coverUrl = data["coverUrl"] as? String,
                    coverGradient = data["coverGradient"] as? String,
                    whatsappChannel = data["whatsappChannel"] as? String,
                    tiktokUrl = data["tiktokUrl"] as? String,
                    instagramUrl = data["instagramUrl"] as? String,
                    uploadCount = (data["uploadCount"] as? Number)?.toInt(),
                    blockedUsers = blocked
                )
            }
        } else null
        onDispose {
            listeners.forEach { it.remove() }
            profileListener?.remove()
        }
    }

    LaunchedEffect(Unit) {
        GamificationManager.checkStreak()
        FirebaseAuth.getInstance().currentUser?.let { user ->
            UserManager.updateUserFromFirebase(
                uid = user.uid,
                displayName = user.displayName,
                email = user.email,
                photoUrl = user.photoUrl?.toString()
                    ?: user.providerData.firstOrNull { it.providerId == "google.com" }?.photoUrl?.toString(),
                isAnonymous = user.isAnonymous
            )
        }
        authStateResolved = true
    }
    LaunchedEffect(authStateResolved, currentUser.uid, currentUser.isAuthenticated, currentUser.isAnonymous) {
        val eligible = authStateResolved && currentUser.uid.isNotBlank() &&
            currentUser.isAuthenticated && !currentUser.isAnonymous &&
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            androidx.core.content.ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED
        val prefs = context.getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE)
        if (eligible && !prefs.getBoolean("notifications_prompted_${currentUser.uid}", false)) {
            showNotificationPrompt = true
        }
    }
    LaunchedEffect(Unit) {
        RastroWidgetManager.updateAllWidgets(context)
    }

    LaunchedEffect(currentUser.uid, currentUser.isAuthenticated, currentUser.isAnonymous) {
        GamificationManager.restore(GamificationRepository.loadLocal(currentUser.uid)
            ?: com.jonsuapps.rastro.gamification.GamificationState())
        GamificationManager.checkStreak()
        if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
            val loadingUid = currentUser.uid
            GamificationRepository.load(loadingUid) { result ->
                if (UserManager.currentUser.value.uid != loadingUid) return@load
                result.getOrNull()?.let { savedState ->
                    GamificationManager.restore(savedState)
                    GamificationManager.checkStreak()
                    GamificationRepository.save(currentUser.uid, GamificationManager.state.value)
                    RastroWidgetManager.updateStreakInWidgets(
                        context,
                        GamificationManager.streakState.value.currentStreak,
                        GamificationManager.streakState.value.lastActiveDate
                    )
                }
            }
        }
    }

    // Las preferencias del Pomodoro se conservan al cerrar y volver a abrir la app.
    val pomodoroPreferences = remember(context) {
        context.getSharedPreferences("rastro_pomodoro", Context.MODE_PRIVATE)
    }
    var pomodoroState by remember(pomodoroPreferences) {
        val studyMinutes = pomodoroPreferences.getInt("study_minutes", 25).coerceIn(1, 120)
        mutableStateOf(
            PomodoroState(
                timeLeftSeconds = studyMinutes * 60,
                customStudyMinutes = studyMinutes,
                customShortBreakMinutes = pomodoroPreferences.getInt("short_break_minutes", 5).coerceIn(1, 120),
                customLongBreakMinutes = pomodoroPreferences.getInt("long_break_minutes", 15).coerceIn(1, 120),
                customCyclesBeforeLongBreak = pomodoroPreferences.getInt("cycles_before_long", 4).coerceIn(1, 12),
                autoCycle = pomodoroPreferences.getBoolean("auto_cycle", true),
                soundEnabled = pomodoroPreferences.getBoolean("sound_enabled", true),
                studyAlertSound = PomodoroAlertSound.values().firstOrNull { it.id == pomodoroPreferences.getString("study_alert", "beep") }
                    ?: PomodoroAlertSound.BEEP,
                shortBreakAlertSound = PomodoroAlertSound.values().firstOrNull { it.id == pomodoroPreferences.getString("short_break_alert", "confirm") }
                    ?: PomodoroAlertSound.CONFIRM,
                longBreakAlertSound = PomodoroAlertSound.values().firstOrNull { it.id == pomodoroPreferences.getString("long_break_alert", "double") }
                    ?: PomodoroAlertSound.DOUBLE_BEEP
            )
        )
    }
    LaunchedEffect(
        pomodoroState.customStudyMinutes,
        pomodoroState.customShortBreakMinutes,
        pomodoroState.customLongBreakMinutes,
        pomodoroState.customCyclesBeforeLongBreak,
        pomodoroState.autoCycle,
        pomodoroState.soundEnabled,
        pomodoroState.studyAlertSound,
        pomodoroState.shortBreakAlertSound,
        pomodoroState.longBreakAlertSound
    ) {
        pomodoroPreferences.edit()
            .putInt("study_minutes", pomodoroState.customStudyMinutes)
            .putInt("short_break_minutes", pomodoroState.customShortBreakMinutes)
            .putInt("long_break_minutes", pomodoroState.customLongBreakMinutes)
            .putInt("cycles_before_long", pomodoroState.customCyclesBeforeLongBreak)
            .putBoolean("auto_cycle", pomodoroState.autoCycle)
            .putBoolean("sound_enabled", pomodoroState.soundEnabled)
            .putString("study_alert", pomodoroState.studyAlertSound.id)
            .putString("short_break_alert", pomodoroState.shortBreakAlertSound.id)
            .putString("long_break_alert", pomodoroState.longBreakAlertSound.id)
            .apply()
    }
    val pomodoroTone = remember { ToneGenerator(AudioManager.STREAM_ALARM, 75) }
    DisposableEffect(pomodoroTone) { onDispose { pomodoroTone.release() } }
    var isThemeDialogVisible by remember { mutableStateOf(false) }
    var isProfileSettingsVisible by remember { mutableStateOf(false) }
    var termsDialogInitialTab by remember { mutableStateOf<Int?>(null) }
    var isVocationalDialogVisible by remember { mutableStateOf(false) }
    var isPeriodicTableVisible by remember { mutableStateOf(false) }
    var showWidgetsHub by remember { mutableStateOf(false) }
    var showExitStreakPrompt by remember { mutableStateOf(false) }
    val currentStreakState by GamificationManager.streakState.collectAsState()

    // ── Countdown real del Pomodoro (tick cada segundo) ──────────────────────
    LaunchedEffect(pomodoroState.isRunning, pomodoroState.timeLeftSeconds) {
        if (pomodoroState.isRunning && pomodoroState.timeLeftSeconds > 0) {
            delay(1_000L)
            pomodoroState = pomodoroState.copy(
                timeLeftSeconds = pomodoroState.timeLeftSeconds - 1
            )
        } else if (pomodoroState.isRunning && pomodoroState.timeLeftSeconds <= 0) {
            val alert = pomodoroState.alertSound()
            if (pomodoroState.soundEnabled && alert != PomodoroAlertSound.SILENT) {
                val tone = when (alert) {
                    PomodoroAlertSound.BEEP -> ToneGenerator.TONE_PROP_BEEP
                    PomodoroAlertSound.DOUBLE_BEEP -> ToneGenerator.TONE_PROP_BEEP2
                    PomodoroAlertSound.CONFIRM -> ToneGenerator.TONE_PROP_ACK
                    PomodoroAlertSound.SILENT -> ToneGenerator.TONE_PROP_BEEP
                }
                pomodoroTone.startTone(tone, 700)
            }
            // Auto-ciclo: Estudio → Descanso Corto (cada 4 ciclos → Largo)
            val nextMode = when (pomodoroState.mode) {
                com.jonsuapps.rastro.pomodoro.PomodoroMode.STUDY,
                com.jonsuapps.rastro.pomodoro.PomodoroMode.CUSTOM ->
                    if ((pomodoroState.completedCycles + 1) % pomodoroState.customCyclesBeforeLongBreak.coerceAtLeast(1) == 0)
                        com.jonsuapps.rastro.pomodoro.PomodoroMode.LONG_BREAK
                    else
                        com.jonsuapps.rastro.pomodoro.PomodoroMode.SHORT_BREAK
                else -> com.jonsuapps.rastro.pomodoro.PomodoroMode.STUDY
            }
            val isStudyMode = pomodoroState.mode == com.jonsuapps.rastro.pomodoro.PomodoroMode.STUDY ||
                pomodoroState.mode == com.jonsuapps.rastro.pomodoro.PomodoroMode.CUSTOM
            val newCycles = if (isStudyMode)
                pomodoroState.completedCycles + 1 else pomodoroState.completedCycles
            val updatedTodayMinutes = pomodoroState.todayStudiedMinutes +
                if (isStudyMode) pomodoroState.durationMinutes() else 0
            pomodoroState = if (pomodoroState.autoCycle) {
                pomodoroState.copy(
                    mode = nextMode,
                    timeLeftSeconds = pomodoroState.durationMinutes(nextMode) * 60,
                    isRunning = true, // Bloques seguidos automáticos
                    completedCycles = newCycles,
                    todayStudiedMinutes = updatedTodayMinutes
                )
            } else {
                pomodoroState.copy(
                    mode = nextMode,
                    timeLeftSeconds = pomodoroState.durationMinutes(nextMode) * 60,
                    isRunning = false,
                    completedCycles = newCycles,
                    todayStudiedMinutes = updatedTodayMinutes
                )
            }
        }
    }

    // Manejo de BackHandler nativo: navega hacia atrás antes de salir o minimizar
    val canGoBack = navController.previousBackStackEntry != null
    BackHandler(enabled = canGoBack || activeEntryAnnouncement != null || showLokiLab) {
        if (activeEntryAnnouncement != null) {
            activeEntryAnnouncement = null
        } else if (pomodoroState.viewState == PomodoroViewState.FULL_MODAL) {
            pomodoroState = pomodoroState.copy(viewState = if (pomodoroState.isRunning) PomodoroViewState.MINI_PILL else PomodoroViewState.HIDDEN)
        } else if (termsDialogInitialTab != null) {
            termsDialogInitialTab = null
        } else if (isProfileSettingsVisible) {
            isProfileSettingsVisible = false
        } else if (isVocationalDialogVisible) {
            isVocationalDialogVisible = false
        } else if (isPeriodicTableVisible) {
            isPeriodicTableVisible = false
        } else if (showMoreActions) {
            showMoreActions = false
        } else if (showLokiLab) {
            showLokiLab = false
        } else if (isThemeDialogVisible) {
            isThemeDialogVisible = false
        } else {
            navController.popBackStack()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(theme.background)
    ) {
        Scaffold(
            containerColor = theme.background,
            topBar = {
                if (currentRoute != RastroScreen.DiasDeRacha.route) {
                    // Barra superior limpia con micro-botones (36px) del §3.16 del mapa
                    TopHeaderActions(
                        colors = theme,
                        userPhotoUrl = currentUser.photoURL,
                        onOpenProfile = {
                            if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
                                navController.navigate(RastroScreen.Perfil.route)
                            } else {
                                navController.navigate(RastroScreen.Auth.route)
                            }
                        },
                        onOpenNotifications = { showNotifications = true },
                        unreadNotifications = notifications.count { !it.read },
                        onOpenPomodoro = {
                            pomodoroState = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL)
                        },
                        onOpenFormulas = { navController.navigate(RastroScreen.Formulario.route) },
                        onOpenThemeSelector = { isThemeDialogVisible = true }
                    )
                }
            },
            bottomBar = {
                if (currentRoute != RastroScreen.DiasDeRacha.route) {
                    // LiquidNavbar inferior compacto
                    LiquidNavbar(
                        currentRoute = if (showMoreActions) RastroScreen.Legal.route else currentRoute,
                        colors = theme,
                        onNavigate = { screen ->
                            showMoreActions = false
                            if (screen == RastroScreen.Home) {
                                // Al tocar Inicio, siempre desapilar de regreso al Home raíz de forma instantánea
                                navController.popBackStack(navController.graph.findStartDestination().id, inclusive = false)
                                if (navController.currentDestination?.route != RastroScreen.Home.route) {
                                    navController.navigate(RastroScreen.Home.route) {
                                        popUpTo(navController.graph.findStartDestination().id) {
                                            inclusive = false
                                        }
                                        launchSingleTop = true
                                    }
                                }
                            } else {
                                navController.navigate(screen.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        inclusive = false
                                    }
                                    launchSingleTop = true
                                }
                            }
                        },
                        onMoreClick = { showMoreActions = true }
                    )
                }
            }
        ) { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = RastroScreen.Home.route,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                enterTransition = { EnterTransition.None },
                exitTransition = { ExitTransition.None },
                popEnterTransition = { EnterTransition.None },
                popExitTransition = { ExitTransition.None }
            ) {
                // 1. Inicio
                composable(RastroScreen.Home.route) {
                    HomeScreen(
                        colors = theme,
                        onNavigate = { route -> navController.navigate(route) },
                        onOpenVocationalTest = { isVocationalDialogVisible = true },
                        onNavigateToProfile = { uid -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid)) },
                        onNavigateToPublication = { uid, pubId -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid, pubId)) }
                    )
                }
                // 1b. Días de Racha Oficial
                composable(RastroScreen.DiasDeRacha.route) {
                    DiasDeRachaScreen(
                        onBack = { navController.popBackStack() },
                        onNavigateToAprender = {
                            navController.navigate(RastroScreen.Aprender.route) {
                                popUpTo(RastroScreen.Home.route) { inclusive = false }
                            }
                        }
                    )
                }

                // 2. Aprender
                composable(RastroScreen.Aprender.route) {
                    AprenderScreen(
                        onNavigateToSubjectDetail = { subjectId ->
                            navController.navigate(RastroScreen.AprenderSubject.createRoute(subjectId))
                        },
                        onNavigateToLesson = { lessonId ->
                            navController.navigate(RastroScreen.LessonEngine.createRoute(lessonId))
                        }
                    )
                }
                composable(RastroScreen.AprenderSubject.route) { backStack ->
                    val subjectId = backStack.arguments?.getString("subject") ?: "biologia"
                    AprenderSubjectDetailScreen(
                        subjectId = subjectId,
                        onNavigateBack = { navController.popBackStack() },
                        onNavigateToLesson = { lessonId ->
                            navController.navigate(RastroScreen.LessonEngine.createRoute(lessonId))
                        }
                    )
                }
                composable(RastroScreen.LessonEngine.route) { backStack ->
                    val lessonId = backStack.arguments?.getString("lessonId") ?: ""
                    LessonEngineScreen(
                        lessonId = lessonId,
                        onFinishLesson = { navController.popBackStack() }
                    )
                }

                // 3. Cursos
                composable(RastroScreen.Cursos.route) {
                    CursosScreen(
                        onOpenCourseDetail = { id ->
                            navController.navigate(RastroScreen.AcademyDetail.createRoute(id))
                        },
                        onOpenVocationalTest = { isVocationalDialogVisible = true },
                        onOpenPeriodicTable = { isPeriodicTableVisible = true }
                    )
                }
                composable(RastroScreen.AcademyDetail.route) { backStack ->
                    val id = backStack.arguments?.getString("id") ?: ""
                    AcademyDetailScreen(
                        courseId = id,
                        colors = theme,
                        onBack = { navController.popBackStack() }
                    )
                }

                // 4. Biblioteca
                composable(RastroScreen.Biblioteca.route) {
                    BibliotecaScreen(
                        onNavigateToAuth = { navController.navigate(RastroScreen.Auth.route) },
                        onNavigateToProfile = { uid -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid)) }
                    )
                }
                // 4b. Biblioteca → pestaña Aportes directamente (desde carrusel Destacados)
                composable(RastroScreen.BibliotecaAportes.route) {
                    BibliotecaScreen(
                        onNavigateToAuth = { navController.navigate(RastroScreen.Auth.route) },
                        onNavigateToProfile = { uid -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid)) },
                        initialTab = 1
                    )
                }
                // 4c. Biblioteca → pestaña Obras Literarias directamente
                composable(RastroScreen.BibliotecaObras.route) {
                    BibliotecaScreen(
                        onNavigateToAuth = { navController.navigate(RastroScreen.Auth.route) },
                        onNavigateToProfile = { uid -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid)) },
                        initialTab = 2
                    )
                }

                // 5. Formulario
                composable(RastroScreen.Formulario.route) {
                    FormularioScreen()
                }
                composable(RastroScreen.Flashcards.route) {
                    FormularioScreen(initialFaceIndex = 2)
                }

                // 6. Simulador
                composable(RastroScreen.Simulador.route) {
                    SimuladorScreen()
                }

                // 7. Pizarra de Dibujo / Relajo (Doodle Canvas)
                composable(RastroScreen.Pizarra.route) {
                    PizarraScreen(
                        onBack = { navController.popBackStack() }
                    )
                }

                // 9. Perfil Propio y Público
                composable(RastroScreen.Perfil.route) {
                    UserProfileScreen(
                        onOpenSettings = { isProfileSettingsVisible = true },
                        onNavigate = { route -> navController.navigate(route) },
                        onOpenPomodoro = { pomodoroState = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL) }
                    )
                }
                composable(RastroScreen.UsuarioDetail.route) { backStackEntry ->
                    val targetUid = backStackEntry.arguments?.getString("uid")
                    val targetPubId = backStackEntry.arguments?.getString("pubId")
                    UserProfileScreen(
                        targetUid = targetUid,
                        targetPublicationId = targetPubId,
                        onOpenSettings = { isProfileSettingsVisible = true },
                        onNavigate = { route -> navController.navigate(route) },
                        onOpenPomodoro = { pomodoroState = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL) }
                    )
                }

                // 10. Auth
                composable(RastroScreen.Auth.route) {
                    AuthScreen(
                        onAuthSuccess = { navController.navigate(RastroScreen.Home.route) },
                        onContinueAsGuest = { navController.navigate(RastroScreen.Home.route) }
                    )
                }

                // 11. Admin (Panel seguro autor)
                composable(RastroScreen.Admin.route) {
                    AdminScreen(
                        currentUserEmail = currentUser.email,
                        onNavigateHome = { navController.navigate(RastroScreen.Home.route) }
                    )
                }

                // 12. Páginas Legales
                composable(RastroScreen.Legal.route) { LegalScreen(onNavigateBack = { navController.popBackStack() }, colors = theme) }
                composable(RastroScreen.Politicas.route) { LegalScreen(title = "Políticas", onNavigateBack = { navController.popBackStack() }, colors = theme) }
                composable(RastroScreen.Privacidad.route) { LegalScreen(title = "Privacidad", onNavigateBack = { navController.popBackStack() }, colors = theme) }
                composable(RastroScreen.Terminos.route) { LegalScreen(title = "Términos de Servicio", onNavigateBack = { navController.popBackStack() }, colors = theme) }
                composable(RastroScreen.EliminarCuenta.route) { LegalScreen(title = "Eliminar Cuenta", onNavigateBack = { navController.popBackStack() }, colors = theme) }
            }
        }

        // Píldora flotante Pomodoro con fijación magnética (siempre visible en primer plano)
        if (pomodoroState.viewState != PomodoroViewState.FULL_MODAL && pomodoroState.viewState != PomodoroViewState.HIDDEN) {
            PomodoroFloatingPillOverlay(
                state = pomodoroState,
                colors = theme,
                onTogglePlay = {
                    pomodoroState = pomodoroState.copy(isRunning = !pomodoroState.isRunning)
                },
                onExpandChange = { isExpanded ->
                    pomodoroState = pomodoroState.copy(
                        viewState = if (isExpanded) PomodoroViewState.EXPANDED_PILL else PomodoroViewState.MINI_PILL
                    )
                },
                onOpenFullModal = {
                    pomodoroState = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL)
                },
                onAddFiveMinutes = {
                    pomodoroState = pomodoroState.copy(timeLeftSeconds = pomodoroState.timeLeftSeconds + 300)
                }
            )
        }

        // Modal Extendido Pomodoro (92vh)
        if (pomodoroState.viewState == PomodoroViewState.FULL_MODAL) {
            PomodoroFullModal(
                state = pomodoroState,
                colors = theme,
                onDismiss = {
                    pomodoroState = pomodoroState.copy(viewState = if (pomodoroState.isRunning) PomodoroViewState.MINI_PILL else PomodoroViewState.HIDDEN)
                },
                onMinimize = { pomodoroState = pomodoroState.copy(viewState = PomodoroViewState.MINI_PILL) },
                onToggleSound = { pomodoroState = pomodoroState.copy(soundEnabled = !pomodoroState.soundEnabled) },
                onAddFiveMinutes = { pomodoroState = pomodoroState.copy(timeLeftSeconds = pomodoroState.timeLeftSeconds + 300) },
                onSetCyclesBeforeLongBreak = { count -> pomodoroState = pomodoroState.copy(customCyclesBeforeLongBreak = count) },
                onSetDuration = { mode, minutes ->
                    val safeMinutes = minutes.coerceIn(1, 120)
                    val isCurrentMode = pomodoroState.mode == mode ||
                        (mode == PomodoroMode.STUDY && pomodoroState.mode == PomodoroMode.CUSTOM)
                    pomodoroState = when (mode) {
                        PomodoroMode.STUDY, PomodoroMode.CUSTOM -> pomodoroState.copy(
                            customStudyMinutes = safeMinutes,
                            timeLeftSeconds = if (isCurrentMode && !pomodoroState.isRunning) safeMinutes * 60 else pomodoroState.timeLeftSeconds
                        )
                        PomodoroMode.SHORT_BREAK -> pomodoroState.copy(
                            customShortBreakMinutes = safeMinutes,
                            timeLeftSeconds = if (isCurrentMode && !pomodoroState.isRunning) safeMinutes * 60 else pomodoroState.timeLeftSeconds
                        )
                        PomodoroMode.LONG_BREAK -> pomodoroState.copy(
                            customLongBreakMinutes = safeMinutes,
                            timeLeftSeconds = if (isCurrentMode && !pomodoroState.isRunning) safeMinutes * 60 else pomodoroState.timeLeftSeconds
                        )
                    }
                },
                onSetAlertSound = { mode, sound ->
                    pomodoroState = when (mode) {
                        PomodoroMode.STUDY, PomodoroMode.CUSTOM -> pomodoroState.copy(studyAlertSound = sound)
                        PomodoroMode.SHORT_BREAK -> pomodoroState.copy(shortBreakAlertSound = sound)
                        PomodoroMode.LONG_BREAK -> pomodoroState.copy(longBreakAlertSound = sound)
                    }
                },
                onTogglePlay = {
                    pomodoroState = pomodoroState.copy(isRunning = !pomodoroState.isRunning)
                },
                onReset = {
                    val defaultSecs = pomodoroState.durationMinutes() * 60
                    pomodoroState = pomodoroState.copy(timeLeftSeconds = defaultSecs, isRunning = false)
                },
                onSelectMode = { newMode ->
                    pomodoroState = pomodoroState.copy(
                        mode = newMode,
                        timeLeftSeconds = pomodoroState.durationMinutes(newMode) * 60,
                        isRunning = false
                    )
                },
                onApplyPreset = { minutes ->
                    pomodoroState = pomodoroState.copy(
                        mode = com.jonsuapps.rastro.pomodoro.PomodoroMode.CUSTOM,
                        customStudyMinutes = minutes.coerceIn(1, 120),
                        timeLeftSeconds = minutes.coerceIn(1, 120) * 60,
                        isRunning = false
                    )
                },
                onToggleAutoCycle = { enabled ->
                    pomodoroState = pomodoroState.copy(autoCycle = enabled)
                }
            )
        }

        if (isPeriodicTableVisible) {
            PeriodicTableDialog(theme = theme, onDismiss = { isPeriodicTableVisible = false })
        }

        // Modal de Ajustes Completos de Perfil y Temas
        if (isProfileSettingsVisible) {
            ProfileSettingsDialog(
                currentThemeId = currentThemeId,
                colors = theme,
                onSelectTheme = { chosen ->
                    ThemeManager.setTheme(chosen)
                    onThemeChange(chosen)
                },
                onDismiss = { isProfileSettingsVisible = false },
                onOpenTermsAndPrivacy = { initialTab ->
                    isProfileSettingsVisible = false
                    termsDialogInitialTab = initialTab
                },
                onLogout = {
                    isProfileSettingsVisible = false
                    UserManager.clearUser()
                    try {
                        com.google.firebase.analytics.FirebaseAnalytics.getInstance(context).setUserId(null)
                    } catch (_: Exception) {}
                    FirebaseAuth.getInstance().signOut()
                    navController.navigate(RastroScreen.Home.route)
                },
                onAccountDeleted = {
                    isProfileSettingsVisible = false
                    navController.navigate(RastroScreen.Home.route)
                },
                onOpenThemeSelector = {
                    isThemeDialogVisible = true
                },
                onOpenLegal = {
                    isProfileSettingsVisible = false
                    navController.navigate(RastroScreen.Legal.route)
                }
            )
        }

        // Modal Oficial Google Play de Términos, Privacidad y Eliminación de Cuenta
        termsDialogInitialTab?.let { initialTab ->
            TermsAndPrivacyDialog(
                colors = theme,
                initialTab = initialTab,
                onDismiss = { termsDialogInitialTab = null },
                onAccountDeleted = {
                    termsDialogInitialTab = null
                    navController.navigate(RastroScreen.Home.route)
                }
            )
        }

        // Selector Modal de Temas
        if (isThemeDialogVisible) {
            ThemeSelectorDialog(
                currentThemeId = currentThemeId,
                onSelectTheme = { chosen ->
                    ThemeManager.setTheme(chosen)
                    onThemeChange(chosen)
                    isThemeDialogVisible = false
                },
                onDismiss = { isThemeDialogVisible = false }
            )
        }

        if (showMoreActions) {
            val isAdminUser = canOpenLokiLab
            MoreActionsDialog(
                colors = theme,
                signedIn = currentUser.isAuthenticated && !currentUser.isAnonymous,
                isAdmin = isAdminUser,
                isAdminViewMode = !AdminConfig.isUserViewModeEnabled,
                onDismiss = { showMoreActions = false },
                onAction = { action ->
                    when (action) {
                        MoreAction.SETTINGS -> isProfileSettingsVisible = true
                        MoreAction.WIDGETS -> showWidgetsHub = true
                        MoreAction.PIZARRA -> navController.navigate(RastroScreen.Pizarra.route)
                        MoreAction.LOGIN -> navController.navigate(RastroScreen.Auth.route)
                        MoreAction.LOGOUT -> {
                            isProfileSettingsVisible = false
                            showMoreActions = false
                            UserManager.clearUser()
                            try {
                                com.google.firebase.analytics.FirebaseAnalytics.getInstance(context).setUserId(null)
                            } catch (_: Exception) {}
                            FirebaseAuth.getInstance().signOut()
                            AdminConfig.isUserViewModeEnabled = false
                            navController.navigate(RastroScreen.Home.route)
                        }
                        MoreAction.ADMIN -> navController.navigate(RastroScreen.Admin.route)
                        MoreAction.LOKI_LAB -> if (canOpenLokiLab) { showLokiLab = true }
                        MoreAction.TOGGLE_ADMIN_VIEW -> {
                            AdminConfig.isUserViewModeEnabled = !AdminConfig.isUserViewModeEnabled
                        }
                    }
                }
            )
        }

        if (showWidgetsHub) {
            WidgetsAndShortcutsDialog(
                theme = theme,
                onDismiss = { showWidgetsHub = false }
            )
        }

        if (showExitStreakPrompt) {
            ExitStreakPromptDialog(
                theme = theme,
                currentStreak = currentStreakState.currentStreak.coerceAtLeast(1),
                onStartQuickQuiz = {
                    showExitStreakPrompt = false
                    navController.navigate(RastroScreen.Aprender.route)
                },
                onExitApp = {
                    showExitStreakPrompt = false
                    (context as? Activity)?.finish()
                },
                onDismiss = { showExitStreakPrompt = false }
            )
        }

        if (showLokiLab && canOpenLokiLab) {
            LokiLabDialog(theme = theme, onDismiss = { showLokiLab = false })
        }

        // Test Vocacional Modal
        if (isVocationalDialogVisible) {
            VocationalTestDialog(
                colors = theme,
                onDismiss = { isVocationalDialogVisible = false },
                onCompleteRuta = { _ ->
                    // Comportamiento correcto: solo cerrar el modal, NO navegar.
                    // En React, el test vocacional cierra con setIsVocationalModalOpen(false) sin navegar.
                    isVocationalDialogVisible = false
                }
            )
        }

        WelcomeOnboardingDialog(
            isOpen = showNotificationPrompt,
            onDismiss = {
                context.getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE)
                    .edit().putBoolean("notifications_prompted_${currentUser.uid}", true).apply()
                showNotificationPrompt = false
            },
            theme = theme
        )
        if (showNotifications) NotificationsDialog(
            notifications = notifications,
            theme = theme,
            onClose = { showNotifications = false },
            onRead = { runCatching { NotificationRepository.markRead(it) } },
            onReadAll = { NotificationRepository.markAllRead(notifications.filterNot { it.isBroadcast }) },
            onDelete = { id ->
                val item = notifications.firstOrNull { it.id == id }
                if (item?.isBroadcast == true) {
                    NotificationRepository.dismissBroadcastForUser(context, id)
                    notifications = notifications.filterNot { it.id == id }
                } else {
                    runCatching { NotificationRepository.delete(id) }
                }
            },
            onDeleteNotification = { item ->
                if (item.isBroadcast) {
                    NotificationRepository.dismissBroadcastForUser(context, item.id)
                    notifications = notifications.filterNot { it.id == item.id }
                } else {
                    runCatching { NotificationRepository.delete(item.id) }
                }
            },
            onClearAllAvisos = {
                val avisoIds = notifications.filter { it.isBroadcast }.map { it.id }
                NotificationRepository.dismissAllBroadcastsForUser(context, avisoIds)
                notifications = notifications.filterNot { it.isBroadcast }
            },
            onClearAllPersonal = {
                val personal = notifications.filterNot { it.isBroadcast }
                personal.forEach { runCatching { NotificationRepository.delete(it.id) } }
            },
            onSelect = { item ->
                showNotifications = false
                when {
                    item.type in setOf("chat", "mensaje", "direct_message") -> {
                        val targetUid = item.targetUid.ifBlank { FirebaseAuth.getInstance().currentUser?.uid.orEmpty() }
                        if (targetUid.isNotBlank()) navController.navigate(RastroScreen.UsuarioDetail.createRoute(targetUid))
                    }
                    item.type in setOf("material", "nuevo_material") -> navController.navigate(RastroScreen.Biblioteca.route)
                    item.type in setOf("comment", "reaction", "wall_post", "post") && !item.id.isBlank() -> {
                        val targetUid = item.targetUid.ifBlank { FirebaseAuth.getInstance().currentUser?.uid.orEmpty() }
                        if (targetUid.isNotBlank()) navController.navigate(RastroScreen.UsuarioDetail.createRoute(targetUid))
                    }
                }
            }
        )

        TermsConsentDialog(
            isOpen = showTermsConsent,
            onAccept = {
                rastroPrefs.edit().putBoolean("terms_accepted", true).apply()
                showTermsConsent = false
            },
            onViewTerms = {
                termsDialogInitialTab = 1
            },
            theme = theme
        )

        activeEntryAnnouncement?.let { announcement ->
            val mood = when {
                announcement.title.contains("Feliz", ignoreCase = true) ||
                announcement.title.contains("Día", ignoreCase = true) ||
                announcement.type == "felicitacion" -> MascotMood.CELEBRATING
                announcement.type == "mantenimiento" ||
                announcement.title.contains("Mantenimiento", ignoreCase = true) -> MascotMood.STUDYING
                else -> MascotMood.HAPPY
            }
            EntryAnnouncementDialog(
                isOpen = true,
                title = announcement.title,
                message = announcement.message,
                tag = if (announcement.type.isNotBlank()) announcement.type.uppercase() else "AVISO OFICIAL",
                mood = mood,
                onDismiss = {
                    rastroPrefs.edit().putString("last_seen_popup_id", announcement.id).apply()
                    activeEntryAnnouncement = null
                },
                theme = theme
            )
        }
    }
}
