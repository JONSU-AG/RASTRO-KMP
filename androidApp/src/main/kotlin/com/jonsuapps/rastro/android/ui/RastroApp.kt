package com.jonsuapps.rastro.android.ui
import kotlinx.coroutines.launch

import android.Manifest
import android.app.Activity
import androidx.compose.ui.geometry.Offset
import com.jonsuapps.rastro.android.ui.components.LearningProgressHud
import com.jonsuapps.rastro.android.ui.components.XpDeliveryOverlay
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
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
    val restoreScope = rememberCoroutineScope()
    LaunchedEffect(Unit) { com.jonsuapps.rastro.android.data.OptionalAppUpdateRepository.check(context) }
    // Fuente única y reactiva del Theme: incluye override dinámico (Tema adaptable)
    // y paleta personalizada (Mi tema). NO usar getColors directo (omite el override).
    val theme = ThemeManager.currentTheme
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: RastroScreen.Home.route
    SideEffect { com.jonsuapps.rastro.android.data.AdsPlacementController.adminSurfaceActive = currentRoute == RastroScreen.Admin.route }
    var openStreakCalendar by remember { mutableStateOf(false) }
    var xpTarget by remember { mutableStateOf<Offset?>(null) }
    val hasLearningHud = currentRoute == RastroScreen.Aprender.route || currentRoute == RastroScreen.AprenderSubject.route
    val linkedRoute by com.jonsuapps.rastro.android.navigation.RastroAppLinks.route.collectAsState()
    LaunchedEffect(linkedRoute) {
        linkedRoute?.let { navController.navigate(it) { launchSingleTop = true } }
        com.jonsuapps.rastro.android.navigation.RastroAppLinks.consume()
    }
    val currentUser by UserManager.currentUser.collectAsState()
    val adminUserMode by AdminConfig.userViewMode.collectAsState()
    LaunchedEffect(adminUserMode, currentUser.uid) {
        com.jonsuapps.rastro.android.data.AdMobProvider.preload()
    }

    var authStateResolved by remember { mutableStateOf(false) }
    var showNotificationPrompt by remember { mutableStateOf(false) }
    var showFriendNotifications by remember { mutableStateOf(false) }
    var showNotifications by remember { mutableStateOf(false) }
    var showMoreActions by remember { mutableStateOf(false) }
    val canOpenLokiLab = currentUser.isAuthenticated && !currentUser.isAnonymous && AdminConfig.isAdmin(currentUser.email)
    var showLokiLab by remember(currentUser.uid, canOpenLokiLab) { mutableStateOf(false) }
    var notifications by remember(currentUser.uid) { mutableStateOf(emptyList<RastroNotification>()) }

    val rastroPrefs = remember(context) {
        context.getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE)
    }
    var entryChoiceCompleted by remember { mutableStateOf(rastroPrefs.getBoolean("entry_choice_completed", false)) }
    LaunchedEffect(authStateResolved, entryChoiceCompleted) {
        if (authStateResolved && !entryChoiceCompleted && !currentUser.isAuthenticated) {
            navController.navigate(RastroScreen.Auth.route) { launchSingleTop = true }
        }
    }
    var activeEntryAnnouncement by remember { mutableStateOf<RastroNotification?>(null) }

    var seenEntryNotices by remember(currentUser.uid) { mutableStateOf<Set<String>?>(null) }
    var welcomeNotice by remember(currentUser.uid) { mutableStateOf<RastroNotification?>(null) }
    var noticeClock by remember { mutableLongStateOf(System.currentTimeMillis()) }
    DisposableEffect(currentUser.uid) {
        activeEntryAnnouncement = null
        val seen = if(currentUser.isAuthenticated && !currentUser.isAnonymous) com.jonsuapps.rastro.android.data.EntryNoticeRepository.seen(currentUser.uid) { seenEntryNotices = it } else null
        val welcome = if (currentUser.isAuthenticated && !currentUser.isAnonymous) com.jonsuapps.rastro.android.data.EntryNoticeRepository.welcome { welcomeNotice = it } else null
        onDispose { seen?.remove(); welcome?.remove() }
    }
    LaunchedEffect(Unit) { while(true) { noticeClock = System.currentTimeMillis(); kotlinx.coroutines.delay(30_000) } }
    LaunchedEffect(notifications, seenEntryNotices, welcomeNotice, noticeClock) {
        val seen = seenEntryNotices ?: return@LaunchedEffect
        if(activeEntryAnnouncement == null) {
        activeEntryAnnouncement = (listOfNotNull(welcomeNotice) + notifications.filter { it.isBroadcast })
            .firstOrNull { notice -> notice.id !in seen && (notice.id == "welcome" ||
                (notice.endsAt > notice.startsAt && notice.startsAt <= noticeClock && noticeClock < notice.endsAt)) }
        activeEntryAnnouncement?.let { notice ->
            seenEntryNotices = seen + notice.id
            com.jonsuapps.rastro.android.data.EntryNoticeRepository.mark(currentUser.uid,notice.id)
        }
        }
    }

    var showLivesShop by remember { mutableStateOf(false) }
    var showProOffer by remember { mutableStateOf(false) }
    val showAdSupport by com.jonsuapps.rastro.android.data.AdsPlacementController.showSupport.collectAsState()
    if(showAdSupport) com.jonsuapps.rastro.android.ui.components.AdSupportDialog(
        onDismiss = { com.jonsuapps.rastro.android.data.AdsPlacementController.dismissSupport() },
        onPro = { com.jonsuapps.rastro.android.data.AdsPlacementController.dismissSupport(); showProOffer = true })
    if(showProOffer) com.jonsuapps.rastro.android.ui.components.RastroProDialog { showProOffer = false }

    if(showLivesShop) com.jonsuapps.rastro.android.ui.components.CoinAndLivesDialog { showLivesShop = false }
    DisposableEffect(currentUser.uid) {
        com.jonsuapps.rastro.monetization.ProAccess.clear()
        val registration = if(currentUser.isAuthenticated && currentUser.uid.isNotBlank() && !currentUser.isAnonymous) com.jonsuapps.rastro.android.data.MonetizationRepository.observe(currentUser.uid) else null
        com.jonsuapps.rastro.android.data.MonetizationRepository.playBilling(context).refreshEntitlement()
        onDispose { registration?.remove() }
    }
    DisposableEffect(currentUser.isAuthenticated, currentUser.isAnonymous) {
        val registration = if (currentUser.isAuthenticated && !currentUser.isAnonymous) com.jonsuapps.rastro.android.data.MonetizationRepository.observeEconomy() else null
        onDispose { registration?.remove() }
    }
    // Ticker ligero de regeneración periódica mientras la app está abierta
    LaunchedEffect(Unit) {
        while (true) {
            com.jonsuapps.rastro.monetization.ProAccess.refresh()
            GamificationManager.updateHeartRegeneration()
            kotlinx.coroutines.delay(1000L)
        }
    }

    DisposableEffect(currentUser.uid) {
        val listeners = if (currentUser.isAuthenticated && !currentUser.isAnonymous) NotificationRepository.observe(currentUser.uid, context) { notifications = it } else emptyList()
        val profileUid = currentUser.uid
        val profileListener = if (currentUser.isAuthenticated && !currentUser.isAnonymous && currentUser.uid.isNotBlank()) {
            UserProfileRepository.observe(currentUser.uid) { data ->
                if (UserManager.currentUser.value.uid != profileUid || FirebaseAuth.getInstance().currentUser?.uid != profileUid) return@observe
                com.jonsuapps.rastro.android.data.ErrorBankRepository.applyProfile(currentUser.uid, data)
                com.jonsuapps.rastro.android.data.PublicProfileCache.update(currentUser.uid, data)
                @Suppress("UNCHECKED_CAST")
                val blocked = data["blockedUsers"] as? List<String>
                UserManager.applyProfileFields(
                    displayName = data["displayName"] as? String,
                    photoURL = data["photoURL"] as? String,
                    bio = data["bio"] as? String,
                    coverUrl = data["coverUrl"] as? String,
                    coverGradient = data["coverGradient"] as? String,
                    homeUseProfileCover = data["homeUseProfileCover"] as? Boolean,
                    coverZoom = (data["coverZoom"] as? Number)?.toFloat(),
                    coverX = (data["coverX"] as? Number)?.toFloat(),
                    coverY = (data["coverY"] as? Number)?.toFloat(),
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

    LaunchedEffect(currentUser.uid, currentUser.isAuthenticated) {
        val firebaseUser = FirebaseAuth.getInstance().currentUser
        if (currentUser.isAuthenticated && firebaseUser?.uid == currentUser.uid && !firebaseUser.isAnonymous) {
            try {
                UserProfileRepository.ensureAccountIdentity(firebaseUser)
            } catch (cancelled: kotlinx.coroutines.CancellationException) { throw cancelled
            } catch (_: Exception) {
                android.util.Log.w("RASTRO_SESSION", "No se pudo completar la identidad del perfil; se reintentará al ingresar.")
            }
        }
    }

    LaunchedEffect(Unit) {
        GamificationManager.checkStreakStatusOnLaunch()
        FirebaseAuth.getInstance().currentUser?.let { user ->
            if (user.isAnonymous) {
                GamificationRepository.loadLocal(user.uid)?.let { GamificationRepository.saveLocal("local_student_guest", it) }
                FirebaseAuth.getInstance().signOut()
                UserManager.logout()
                return@let
            }
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
        kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) { RastroWidgetManager.updateAllWidgets(context) }
    }

    LaunchedEffect(currentUser.uid, currentUser.isAuthenticated, currentUser.isAnonymous) {
        val loadingUid = currentUser.uid

        val localSaved = GamificationRepository.loadLocal(loadingUid)
            ?: if (loadingUid == "local_student_guest") GamificationRepository.loadLocal("local_student_1") else null
        val prepared = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            GamificationManager.prepareRestore(localSaved
                ?: com.jonsuapps.rastro.gamification.GamificationState())
        }
        if (UserManager.currentUser.value.uid != loadingUid) return@LaunchedEffect
        GamificationManager.applyRestored(prepared)
        val configuredEconomy = com.jonsuapps.rastro.monetization.EconomySettings.config.value
        GamificationManager.setMaxHearts(configuredEconomy.maxLives)
        GamificationManager.setRecoveryConfig(configuredEconomy.recoveryMinutes, com.jonsuapps.rastro.gamification.LifeRecoveryUnit.MINUTOS)
        GamificationManager.checkStreakStatusOnLaunch()
        val adminAccess = GamificationRepository.isVerifiedAdmin(loadingUid)
        if (adminAccess) GamificationManager.markDailyStreakEarned()
        GamificationRepository.saveLocal(currentUser.uid, GamificationManager.state.value)
        val accessPrefs = context.getSharedPreferences("rastro_admin_access_recovery", Context.MODE_PRIVATE)
        val accessDay = GamificationManager.getLocalDayString()
        if (currentUser.isAuthenticated && !currentUser.isAnonymous && localSaved != null &&
            (localSaved.streakActivityVersion < com.jonsuapps.rastro.android.data.StreakActivityMigration.VERSION ||
                (adminAccess && accessPrefs.getString(loadingUid, "") != accessDay))) {
            GamificationRepository.recoverSavedStreak(loadingUid) { result ->
                if (UserManager.currentUser.value.uid == loadingUid) result.getOrNull()?.let { repaired ->
                    GamificationManager.applyRestored(repaired)
                    GamificationRepository.saveLocal(loadingUid, GamificationManager.state.value)
                    if (GamificationRepository.isVerifiedAdmin(loadingUid)) accessPrefs.edit().putString(loadingUid, accessDay).apply()
                }
            }
        }
        if (currentUser.isAuthenticated && !currentUser.isAnonymous && localSaved == null) {
            GamificationRepository.beginRestore(loadingUid)
            GamificationRepository.load(loadingUid) { result ->
                if (UserManager.currentUser.value.uid != loadingUid) return@load
                if (result.getOrNull() == null) {
                    GamificationRepository.finishRestore(loadingUid)
                    if (result.isSuccess) {
                        GamificationRepository.loadLocal("local_student_guest")?.takeIf { com.jonsuapps.rastro.android.data.CloudBackupRepository.claimGuest(loadingUid) }?.let { guest ->
                            restoreScope.launch {
                                val preparedGuest = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) { GamificationManager.prepareRestore(guest) }
                                if (UserManager.currentUser.value.uid == loadingUid) {
                                    GamificationManager.applyRestored(preparedGuest)
                                    GamificationRepository.saveLocal(loadingUid, preparedGuest)
                                }
                            }
                        }
                    }
                }
                result.getOrNull()?.let { savedState ->
                    restoreScope.launch {
                    val remotePrepared = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                        GamificationManager.prepareRestore(com.jonsuapps.rastro.android.data.StreakActivityMigration.merge(localSaved, savedState))
                    }
                    if (UserManager.currentUser.value.uid != loadingUid) return@launch
                    GamificationManager.applyRestored(remotePrepared)
                    val economy = com.jonsuapps.rastro.monetization.EconomySettings.config.value
                    GamificationManager.setMaxHearts(economy.maxLives)
                    GamificationManager.setRecoveryConfig(economy.recoveryMinutes, com.jonsuapps.rastro.gamification.LifeRecoveryUnit.MINUTOS)
                    GamificationRepository.finishRestore(loadingUid)
                    GamificationManager.checkStreakStatusOnLaunch()
                    if (GamificationRepository.isVerifiedAdmin(loadingUid)) GamificationManager.markDailyStreakEarned()
                    GamificationRepository.saveLocal(currentUser.uid, GamificationManager.state.value)
                    RastroWidgetManager.updateStreakInWidgets(
                        context,
                        GamificationManager.streakState.value.currentStreak,
                        GamificationManager.streakState.value.lastActiveDate,
                        GamificationManager.streakState.value.activityDates
                    )
                    }
                }
            }
        } else if (currentUser.isAuthenticated && !currentUser.isAnonymous) {
            com.jonsuapps.rastro.android.data.CloudBackupRepository.maybeBackup(loadingUid)
        }
    }

    val pomodoroController = remember(context) {
        com.jonsuapps.rastro.android.pomodoro.PomodoroTimer.get(context)
    }
    val pomodoroState = pomodoroController.state
    // Solo refresca la vista; la alarma y la fecha límite viven fuera de Compose.
    val pomodoroLifecycle = LocalLifecycleOwner.current.lifecycle
    LaunchedEffect(pomodoroController, pomodoroLifecycle) {
        pomodoroLifecycle.repeatOnLifecycle(androidx.lifecycle.Lifecycle.State.STARTED) {
            pomodoroController.refresh()
            pomodoroController.schedule()
            while (true) {
                pomodoroController.refresh()
                delay(250L)
            }
        }
    }
    var isThemeDialogVisible by remember { mutableStateOf(false) }
    var isProfileSettingsVisible by remember { mutableStateOf(false) }
    var termsDialogInitialTab by remember { mutableStateOf<Int?>(null) }
    var isVocationalDialogVisible by remember { mutableStateOf(false) }
    var isPeriodicTableVisible by remember { mutableStateOf(false) }
    var showWidgetsHub by remember { mutableStateOf(false) }
    var showExitStreakPrompt by remember { mutableStateOf(false) }
    val currentStreakState by GamificationManager.streakState.collectAsState()

    // Manejo de BackHandler nativo: navega hacia atrás antes de salir o minimizar
    val canGoBack = navController.previousBackStackEntry != null
    BackHandler(enabled = canGoBack || activeEntryAnnouncement != null || showLokiLab ||
        pomodoroState.viewState == PomodoroViewState.FULL_MODAL || termsDialogInitialTab != null ||
        isProfileSettingsVisible || isVocationalDialogVisible || isPeriodicTableVisible ||
        showMoreActions || isThemeDialogVisible) {
        if (activeEntryAnnouncement != null) {
            activeEntryAnnouncement = null
        } else if (pomodoroState.viewState == PomodoroViewState.FULL_MODAL) {
            pomodoroController.state = pomodoroState.copy(viewState = if (pomodoroState.isRunning) PomodoroViewState.MINI_PILL else PomodoroViewState.HIDDEN)
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
                if (!QuestionFocusRegistry.focused && currentRoute != RastroScreen.LessonEngine.route && currentRoute != RastroScreen.DiasDeRacha.route && currentRoute != RastroScreen.Auth.route) {
                    // Barra superior limpia con micro-botones (36px) del §3.16 del mapa
                    Column {
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
                            pomodoroController.state = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL)
                        },
                        onOpenFormulas = { navController.navigate(RastroScreen.Formulario.route) },
                        onOpenThemeSelector = { isThemeDialogVisible = true }
                    )
                    if (hasLearningHud) LearningProgressHud(
                        onStreak = { openStreakCalendar = true; navController.navigate(RastroScreen.DiasDeRacha.route) },
                        onTricks = { navController.navigate(RastroScreen.Flashcards.route) },
                        onTarget = { xpTarget = it })
                    }
                }
            },
            bottomBar = {
                if (!QuestionFocusRegistry.focused && currentRoute != RastroScreen.DiasDeRacha.route && currentRoute != RastroScreen.Auth.route &&
                    currentRoute != RastroScreen.LessonEngine.route) {
                    Column {
                    if (currentRoute in listOf(RastroScreen.Home.route, RastroScreen.Aprender.route,
                        RastroScreen.Cursos.route, RastroScreen.Biblioteca.route, RastroScreen.Perfil.route)) {
                        com.jonsuapps.rastro.android.ui.components.OptionalAppUpdateBanner()
                    }
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
            }
        ) { paddingValues ->
            CompositionLocalProvider(
                com.jonsuapps.rastro.android.ui.components.LocalAcademicBackgroundPilot provides
                    ThemeManager.academicBackgroundEnabled,
                com.jonsuapps.rastro.android.ui.components.LocalMainPage provides
                (currentRoute in listOf(RastroScreen.Home.route, RastroScreen.Aprender.route, RastroScreen.Cursos.route,
                    RastroScreen.Biblioteca.route, RastroScreen.BibliotecaAportes.route, RastroScreen.BibliotecaObras.route,
                    RastroScreen.Simulador.route, RastroScreen.Perfil.route))) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
            NavHost(
                navController = navController,
                startDestination = RastroScreen.Home.route,
                modifier = Modifier
                    .widthIn(max = 1440.dp)
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
                        allowStudyGoalPrompt = authStateResolved && (entryChoiceCompleted || currentUser.isAuthenticated) &&
                            !showNotificationPrompt && activeEntryAnnouncement == null &&
                            !showNotifications && !showMoreActions && !isProfileSettingsVisible &&
                            !isThemeDialogVisible && !isVocationalDialogVisible,
                        onNavigate = { route -> navController.navigate(route) },
                        onOpenVocationalTest = { isVocationalDialogVisible = true },
                        onOpenPeriodicTable = { isPeriodicTableVisible = true },
                        onNavigateToProfile = { uid -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid)) },
                        onNavigateToPublication = { uid, pubId -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid, pubId)) }
                    )
                }
                // 1b. Días de Racha Oficial
                composable(RastroScreen.DiasDeRacha.route) {
                    DiasDeRachaScreen(
                        startAtCalendar = openStreakCalendar,
                        onBack = { openStreakCalendar = false; navController.popBackStack() },
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
                            GamificationManager.updateHeartRegeneration()
                            if (GamificationManager.hearts.value > 0 || com.jonsuapps.rastro.monetization.PresentationMode.unlimitedLives()) {
                                navController.navigate(RastroScreen.LessonEngine.createRoute(lessonId)) { launchSingleTop = true }
                            } else showLivesShop = true
                        }
                    )
                }
                composable(RastroScreen.AprenderSubject.route) { backStack ->
                    val subjectId = backStack.arguments?.getString("subject") ?: "biologia"
                    AprenderSubjectDetailScreen(
                        subjectId = subjectId,
                        onNavigateBack = { navController.popBackStack() },
                        onNavigateToLesson = { lessonId ->
                            GamificationManager.updateHeartRegeneration()
                            if (GamificationManager.hearts.value > 0 || com.jonsuapps.rastro.monetization.PresentationMode.unlimitedLives()) {
                                navController.navigate(RastroScreen.LessonEngine.createRoute(lessonId)) { launchSingleTop = true }
                            } else showLivesShop = true
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
                        onSignIn = { navController.navigate(RastroScreen.Auth.route) { launchSingleTop = true } },
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
                    SimuladorScreen(initialTab = 3, onOpenLeagues = { navController.navigate(RastroScreen.Ligas.route) })
                }

                // 6. Simulador
                composable(RastroScreen.Simulador.route) {
                    SimuladorScreen(onOpenLeagues = { navController.navigate(RastroScreen.Ligas.route) })
                }
                composable(RastroScreen.RankingExam.route) {
                    SimuladorScreen(initialTab = 4, onOpenLeagues = { navController.navigate(RastroScreen.Ligas.route) })
                }
                composable(RastroScreen.Ligas.route) {
                    LeaguesScreen(onProfile = { uid -> navController.navigate(RastroScreen.UsuarioDetail.createRoute(uid)) },
                        onExams = { navController.navigate(RastroScreen.RankingExam.route) })
                }

                // 7. Pizarra de Dibujo / Relajo (Doodle Canvas)
                composable(RastroScreen.Pizarra.route) {
                    PizarraScreen(
                        onBack = { navController.popBackStack() }
                    )
                }

                // 9. Perfil Propio y Público
                composable(RastroScreen.Perfil.route) {
                    if (!currentUser.isAuthenticated || currentUser.isAnonymous) {
                        LaunchedEffect(Unit) {
                            navController.navigate(RastroScreen.Auth.route) {
                                popUpTo(RastroScreen.Perfil.route) { inclusive = true }
                                launchSingleTop = true
                            }
                        }
                    } else {
                    UserProfileScreen(
                        onOpenSettings = { isProfileSettingsVisible = true },
                        onNavigate = { route ->
                            if (route == RastroScreen.DiasDeRacha.route) openStreakCalendar = true
                            navController.navigate(route)
                        },
                        onOpenPomodoro = { pomodoroController.state = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL) }
                    )
                    }
                }
                composable(RastroScreen.UsuarioDetail.route) { backStackEntry ->
                    val targetUid = backStackEntry.arguments?.getString("uid")
                    val targetPubId = backStackEntry.arguments?.getString("pubId")
                    UserProfileScreen(
                        targetUid = targetUid,
                        targetPublicationId = targetPubId,
                        onOpenSettings = { isProfileSettingsVisible = true },
                        onNavigate = { route -> navController.navigate(route) },
                        onOpenPomodoro = { pomodoroController.state = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL) }
                    )
                }

                // 10. Auth
                composable(RastroScreen.Auth.route) {
                    AuthScreen(
                        onAuthSuccess = {
                            rastroPrefs.edit().putBoolean("entry_choice_completed", true)
                                .putBoolean("terms_accepted", true).apply()
                            entryChoiceCompleted = true
                            navController.navigate(RastroScreen.Home.route) {
                            popUpTo(RastroScreen.Auth.route) { inclusive = true }
                            launchSingleTop = true
                        } },
                        onContinueAsGuest = {
                            rastroPrefs.edit().putBoolean("entry_choice_completed", true)
                                .putBoolean("terms_accepted", true).apply()
                            entryChoiceCompleted = true
                            navController.navigate(RastroScreen.Home.route) {
                            popUpTo(RastroScreen.Auth.route) { inclusive = true }; launchSingleTop = true
                        } }
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
        }
        }

        XpDeliveryOverlay(if (hasLearningHud) xpTarget else null)

        // Píldora flotante Pomodoro con fijación magnética (siempre visible en primer plano)
        if (pomodoroState.viewState != PomodoroViewState.FULL_MODAL && pomodoroState.viewState != PomodoroViewState.HIDDEN) {
            PomodoroFloatingPillOverlay(
                state = pomodoroState,
                colors = theme,
                onTogglePlay = {
                    pomodoroController.state = pomodoroState.copy(isRunning = !pomodoroState.isRunning)
                },
                onExpandChange = { isExpanded ->
                    pomodoroController.state = pomodoroState.copy(
                        viewState = if (isExpanded) PomodoroViewState.EXPANDED_PILL else PomodoroViewState.MINI_PILL
                    )
                },
                onOpenFullModal = {
                    pomodoroController.state = pomodoroState.copy(viewState = PomodoroViewState.FULL_MODAL)
                },
                onAddFiveMinutes = {
                    pomodoroController.state = pomodoroState.copy(timeLeftSeconds = pomodoroState.timeLeftSeconds + 300)
                }
            )
        }

        // Modal Extendido Pomodoro (92vh)
        if (pomodoroState.viewState == PomodoroViewState.FULL_MODAL) {
            PomodoroFullModal(
                state = pomodoroState,
                colors = theme,
                onDismiss = {
                    pomodoroController.state = pomodoroState.copy(viewState = if (pomodoroState.isRunning) PomodoroViewState.MINI_PILL else PomodoroViewState.HIDDEN)
                },
                onMinimize = { pomodoroController.state = pomodoroState.copy(viewState = PomodoroViewState.MINI_PILL) },
                onToggleSound = { pomodoroController.state = pomodoroState.copy(soundEnabled = !pomodoroState.soundEnabled) },
                onAddFiveMinutes = { pomodoroController.state = pomodoroState.copy(timeLeftSeconds = pomodoroState.timeLeftSeconds + 300) },
                onSetCyclesBeforeLongBreak = { count -> pomodoroController.state = pomodoroState.copy(customCyclesBeforeLongBreak = count) },
                onSetDuration = { mode, minutes ->
                    val safeMinutes = minutes.coerceIn(1, 120)
                    val isCurrentMode = pomodoroState.mode == mode ||
                        (mode == PomodoroMode.STUDY && pomodoroState.mode == PomodoroMode.CUSTOM)
                    pomodoroController.state = when (mode) {
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
                    pomodoroController.state = when (mode) {
                        PomodoroMode.STUDY, PomodoroMode.CUSTOM -> pomodoroState.copy(studyAlertSound = sound)
                        PomodoroMode.SHORT_BREAK -> pomodoroState.copy(shortBreakAlertSound = sound)
                        PomodoroMode.LONG_BREAK -> pomodoroState.copy(longBreakAlertSound = sound)
                    }
                },
                onTogglePlay = {
                    pomodoroController.state = pomodoroState.copy(isRunning = !pomodoroState.isRunning)
                },
                onReset = {
                    val defaultSecs = pomodoroState.durationMinutes() * 60
                    pomodoroController.state = pomodoroState.copy(timeLeftSeconds = defaultSecs, isRunning = false)
                },
                onSelectMode = { newMode ->
                    pomodoroController.state = pomodoroState.copy(
                        mode = newMode,
                        timeLeftSeconds = pomodoroState.durationMinutes(newMode) * 60,
                        isRunning = false
                    )
                },
                onApplyPreset = { minutes ->
                    pomodoroController.state = pomodoroState.copy(
                        mode = com.jonsuapps.rastro.pomodoro.PomodoroMode.CUSTOM,
                        customStudyMinutes = minutes.coerceIn(1, 120),
                        timeLeftSeconds = minutes.coerceIn(1, 120) * 60,
                        isRunning = false
                    )
                },
                onToggleAutoCycle = { enabled ->
                    pomodoroController.state = pomodoroState.copy(autoCycle = enabled)
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
                    FirebaseAuth.getInstance().signOut()
                    UserManager.clearUser()
                    AdminConfig.isUserViewModeEnabled = false
                    try {
                        com.google.firebase.analytics.FirebaseAnalytics.getInstance(context).setUserId(null)
                    } catch (_: Exception) {}
                    navController.navigate(RastroScreen.Home.route) {
                        popUpTo(navController.graph.id) { inclusive = false }
                        launchSingleTop = true
                    }
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
                showAcademicBackgroundPilot = true,
                academicBackgroundEnabled = ThemeManager.academicBackgroundEnabled,
                onAcademicBackgroundChange = { enabled ->
                    ThemeManager.setAcademicBackground(enabled)
                    context.getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE).edit().putBoolean("academic_background", enabled).apply()
                },
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
                        MoreAction.PRO -> showProOffer = true
                        MoreAction.WIDGETS -> showWidgetsHub = true
                        MoreAction.PIZARRA -> navController.navigate(RastroScreen.Pizarra.route)
                        MoreAction.LOGIN -> navController.navigate(RastroScreen.Auth.route)
                        MoreAction.LOGOUT -> {
                            isProfileSettingsVisible = false
                            showMoreActions = false
                            FirebaseAuth.getInstance().signOut()
                            UserManager.clearUser()
                            try {
                                com.google.firebase.analytics.FirebaseAnalytics.getInstance(context).setUserId(null)
                            } catch (_: Exception) {}
                            AdminConfig.isUserViewModeEnabled = false
                            navController.navigate(RastroScreen.Home.route) {
                                popUpTo(navController.graph.id) { inclusive = false }
                                launchSingleTop = true
                            }
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
                    item.type in setOf("friend_request", "friend_active") -> showFriendNotifications = true
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

        if (showFriendNotifications && currentUser.uid.isNotBlank()) {
            com.jonsuapps.rastro.android.ui.screens.FriendsAndStreaksDialog(
                currentUserUid = currentUser.uid, currentUserName = currentUser.displayName,
                theme = theme, onDismiss = { showFriendNotifications = false })
        }

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
                    seenEntryNotices = seenEntryNotices.orEmpty() + announcement.id
                    com.jonsuapps.rastro.android.data.EntryNoticeRepository.mark(currentUser.uid, announcement.id)
                    activeEntryAnnouncement = null
                },
                theme = theme
            )
        }
    }
}
