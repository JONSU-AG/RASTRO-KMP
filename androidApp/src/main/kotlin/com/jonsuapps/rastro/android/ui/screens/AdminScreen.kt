package com.jonsuapps.rastro.android.ui.screens

import android.app.DatePickerDialog
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.google.firebase.firestore.AggregateSource
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.android.MainActivity
import com.jonsuapps.rastro.android.data.ExamQuestionRepository
import com.jonsuapps.rastro.android.data.OfficialMaterialRepository
import com.jonsuapps.rastro.android.data.UgcReport
import com.jonsuapps.rastro.android.data.UserUpload
import com.jonsuapps.rastro.android.data.UserUploadRepository
import com.jonsuapps.rastro.android.notifications.LimaStudyReminderWorker
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.gamification.LifeRecoveryUnit
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.jonsuapps.rastro.android.data.DailyActivityItem
import com.jonsuapps.rastro.android.data.TesterActivityRepository
import com.jonsuapps.rastro.android.data.TesterSummary
import com.jonsuapps.rastro.model.ExamQuestion
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.datetime.LocalDate
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.minus
import com.jonsuapps.rastro.android.ui.components.CartoonAvatar
import com.jonsuapps.rastro.android.ui.components.DuolingoHaptics
import com.jonsuapps.rastro.android.ui.components.RastroStickerDialog
import com.jonsuapps.rastro.android.ui.components.Sticker3dButton
import com.jonsuapps.rastro.android.ui.components.Sticker3dCard
import com.jonsuapps.rastro.android.ui.components.bouncyClick
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.model.UserData
import com.jonsuapps.rastro.theme.RastroPalette
import com.jonsuapps.rastro.theme.ThemeManager
import java.util.Calendar

/**
 * Panel de Administración Maestro RASTRO:
 * Conectado 100% a Firestore en tiempo real (datos reales de producción):
 * - Ajustes del Sitio y Mantenimiento sincronizados con Firestore `site_settings/global`
 * - Gestión y Moderación de Usuarios en vivo de la colección `usuarios`
 * - Moderación de Contenido UGC y Reportes reales de `reportes_ugc` y `uploads`
 * - Control maestro para ocultar, restaurar o borrar cualquier aporte de la comunidad
 * - Envío de Notificaciones Push / Difusión a todos los postulantes
 * - Métricas del Banco de Preguntas
 */
fun launchDatePicker(context: Context, initialDate: String, onSelected: (String) -> Unit) {
    val cal = Calendar.getInstance()
    runCatching {
        val parsed = LocalDate.parse(initialDate)
        cal.set(parsed.year, parsed.monthNumber - 1, parsed.dayOfMonth)
    }
    DatePickerDialog(
        context,
        { _, year, month, dayOfMonth ->
            val formatted = "${year}-${(month + 1).toString().padStart(2, '0')}-${dayOfMonth.toString().padStart(2, '0')}"
            onSelected(formatted)
        },
        cal.get(Calendar.YEAR),
        cal.get(Calendar.MONTH),
        cal.get(Calendar.DAY_OF_MONTH)
    ).show()
}

@Composable
fun AdminScreen(
    currentUserEmail: String?,
    onNavigateHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    val theme = ThemeManager.currentTheme
    val context = LocalContext.current
    val isAdmin = remember(currentUserEmail) {
        currentUserEmail != null && AdminConfig.isAdmin(currentUserEmail)
    }

    if (!isAdmin) {
        // Pantalla de Acceso Denegado (Seguridad estricta)
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(theme.background)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Sticker3dCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = 420.dp),
                containerColor = theme.surface,
                bottomBevelColor = Color(0xFFB91C1C),
                strokeColor = Color(0xFFEF4444),
                bevelHeight = 5.dp,
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFEF4444).copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Security,
                            contentDescription = "Seguridad",
                            tint = Color(0xFFEF4444),
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Acceso Restringido",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "El panel de administración está reservado estrictamente para los correos autorizados del autor de RASTRO.",
                        fontSize = 12.sp,
                        color = theme.textSecondary,
                        lineHeight = 18.sp,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Sticker3dButton(
                        onClick = onNavigateHome,
                        modifier = Modifier.fillMaxWidth().height(46.dp),
                        containerColor = theme.accent,
                        bottomBevelColor = theme.accentBevel,
                        strokeColor = theme.strokeBorder
                    ) {
                        Icon(Icons.Rounded.Home, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Regresar al Inicio", color = Color.White, fontWeight = FontWeight.Black, fontSize = 14.sp)
                    }
                }
            }
        }
        return
    }

    val coroutineScope = rememberCoroutineScope()

    // Estado de pestañas administrativas
    var selectedTab by remember { mutableIntStateOf(0) } // 0: Ajustes Sitio, 1: Actividad Testers, 2: Usuarios, 3: Contenido UGC, 4: Notificaciones, 5: Banco
    val tabs = listOf("Ajustes Sitio", "Actividad Testers", "Usuarios", "Contenido UGC", "Notificaciones", "Banco")

    // ── 0. ACTIVIDAD DE TESTERS / PRUEBA CERRADA ─────────────────────────────
    var testerPeriodStart by remember { mutableStateOf("2026-09-24") }
    var testerPeriodEnd by remember { mutableStateOf("2026-10-08") }
    var testerPeriodStartInput by remember { mutableStateOf("2026-09-24") }
    var testerPeriodEndInput by remember { mutableStateOf("2026-10-08") }
    var isSavingPeriod by remember { mutableStateOf(false) }

    var testersList by remember { mutableStateOf(emptyList<TesterSummary>()) }
    var isLoadingTesters by remember { mutableStateOf(false) }
    var testerSearchQuery by remember { mutableStateOf("") }
    var selectedTesterForDetail by remember { mutableStateOf<TesterSummary?>(null) }
    var detailFilter by remember { mutableStateOf("TODOS") } // "TODOS", "ACTIVOS", "SIN_ACTIVIDAD"
    var isLoadingDetail by remember { mutableStateOf(false) }

    var activityRangePreset by remember { mutableStateOf("ESTA_SEMANA") } // "HOY", "ESTA_SEMANA", "ULTIMOS_7_DIAS", "ESTE_MES", "PERIODO_CERRADO", "PERSONALIZADO"
    var activityStatusFilter by remember { mutableStateOf("TODOS") } // "TODOS", "ACTIVOS", "SIN_ACTIVIDAD"
    var customStartDateInput by remember { mutableStateOf(GamificationManager.getLocalDayString()) }
    var customEndDateInput by remember { mutableStateOf(GamificationManager.getLocalDayString()) }

    val todayStr = remember { GamificationManager.getLocalDayString() }
    val (queryStart, queryEnd) = remember(activityRangePreset, customStartDateInput, customEndDateInput, testerPeriodStart, testerPeriodEnd, todayStr) {
        when (activityRangePreset) {
            "HOY" -> todayStr to todayStr
            "ULTIMOS_7_DIAS" -> {
                val start7 = runCatching { LocalDate.parse(todayStr).minus(6, DateTimeUnit.DAY).toString() }.getOrDefault(todayStr)
                start7 to todayStr
            }
            "ESTA_SEMANA" -> {
                val date = runCatching { LocalDate.parse(todayStr) }.getOrNull()
                if (date != null) {
                    val dayOfWeekNum = date.dayOfWeek.ordinal
                    val monday = date.minus(dayOfWeekNum, DateTimeUnit.DAY).toString()
                    monday to todayStr
                } else {
                    todayStr to todayStr
                }
            }
            "ESTE_MES" -> {
                val date = runCatching { LocalDate.parse(todayStr) }.getOrNull()
                if (date != null) {
                    val firstOfMonth = "${date.year}-${date.monthNumber.toString().padStart(2, '0')}-01"
                    firstOfMonth to todayStr
                } else {
                    todayStr to todayStr
                }
            }
            "PERSONALIZADO" -> customStartDateInput to customEndDateInput
            else -> testerPeriodStart to testerPeriodEnd
        }
    }

    DisposableEffect(Unit) {
        val listener = TesterActivityRepository.observeTesterPeriod { start, end ->
            testerPeriodStart = start
            testerPeriodEnd = end
            testerPeriodStartInput = start
            testerPeriodEndInput = end
        }
        onDispose { listener.remove() }
    }

    LaunchedEffect(selectedTab, queryStart, queryEnd) {
        if (selectedTab == 1) {
            isLoadingTesters = true
            TesterActivityRepository.loadAllTestersActivity(queryStart, queryEnd) { list ->
                testersList = list
                isLoadingTesters = false
            }
        }
    }

    // ── 1. DATOS REALES DE FIRESTORE ─────────────────────────────────────────
    // Ajustes de Sitio desde Firestore
    var maintenanceMode by remember { mutableStateOf(false) }
    var globalBannerActive by remember { mutableStateOf(false) }
    var globalBannerText by remember { mutableStateOf("¡Simulacro General UNSA este domingo 8:00 AM!") }
    var youtubeIsolationActive by remember { mutableStateOf(true) }
    var communityWallEnabled by remember { mutableStateOf(true) }
    var maxLives by remember { mutableIntStateOf(5) }
    var lifeRecoveryAmount by remember { mutableLongStateOf(3L) }
    var lifeRecoveryUnit by remember { mutableStateOf("MINUTOS") }
    var hideAllOfficialMaterials by remember { mutableStateOf(false) }
    var hiddenOfficialMaterialIds by remember { mutableStateOf(listOf<String>()) }

    DisposableEffect(Unit) {
        val listener = FirebaseFirestore.getInstance().collection("site_settings").document("global")
            .addSnapshotListener { snapshot, _ ->
                if (snapshot != null && snapshot.exists()) {
                    maintenanceMode = snapshot.getBoolean("maintenanceMode") ?: false
                    globalBannerActive = snapshot.getBoolean("globalBannerActive") ?: false
                    globalBannerText = snapshot.getString("globalBannerText") ?: globalBannerText
                    youtubeIsolationActive = snapshot.getBoolean("youtubeIsolationActive") ?: true
                    communityWallEnabled = snapshot.getBoolean("communityWallEnabled") ?: true
                    maxLives = snapshot.getLong("maxLives")?.toInt() ?: 5
                    lifeRecoveryAmount = snapshot.getLong("lifeRecoveryAmount") ?: 3L
                    lifeRecoveryUnit = snapshot.getString("lifeRecoveryUnit") ?: "MINUTOS"
                    hideAllOfficialMaterials = snapshot.getBoolean("hideAllOfficialMaterials") ?: false
                    val hidden = snapshot.get("hiddenOfficialMaterialIds") as? List<*>
                    hiddenOfficialMaterialIds = hidden?.filterIsInstance<String>() ?: emptyList()
                }
            }
        onDispose { listener.remove() }
    }

    // Usuarios Reales de Firestore
    var userSearchQuery by remember { mutableStateOf("") }
    var realUsers by remember { mutableStateOf(emptyList<UserData>()) }

    DisposableEffect(Unit) {
        val listener = FirebaseFirestore.getInstance().collection("usuarios")
            .limit(100)
            .addSnapshotListener { snapshot, error ->
                if (error != null || snapshot == null) return@addSnapshotListener
                val list = snapshot.documents.map { doc ->
                    UserData(
                        uid = doc.id,
                        email = doc.getString("email"),
                        displayName = doc.getString("displayName") ?: doc.getString("name") ?: "Estudiante",
                        photoURL = doc.getString("photoURL") ?: doc.getString("photoUrl"),
                        targetCareer = doc.getString("targetCareer") ?: "",
                        targetUniversity = doc.getString("targetUniversity") ?: "Universidad Nacional",
                        isAlly = doc.getBoolean("isAlly") ?: false,
                        hasWarning = doc.getBoolean("hasWarning") ?: false,
                        warningMessage = doc.getString("warningMessage") ?: "",
                        banned = doc.getBoolean("banned") ?: false
                    )
                }
                realUsers = list
            }
        onDispose { listener.remove() }
    }

    // Reportes Reales de Contenido UGC desde Firestore
    var reportedItems by remember { mutableStateOf(emptyList<UgcReport>()) }
    DisposableEffect(Unit) {
        val listener = UserUploadRepository.observeReports { reportedItems = it }
        onDispose { listener.remove() }
    }

    // Todas las Publicaciones de Firestore para Gestión Total del Administrador
    var allUploads by remember { mutableStateOf(emptyList<UserUpload>()) }
    DisposableEffect(Unit) {
        val listener = UserUploadRepository.observeAllUploadsForAdmin { allUploads = it }
        onDispose { listener.remove() }
    }

    // Estado de Notificación Masiva
    var notifTitle by remember { mutableStateOf("") }
    var notifBody by remember { mutableStateOf("") }
    var sendingNotif by remember { mutableStateOf(false) }

    // Estadísticas Reales Agregadas de Firestore y Banco Académico
    var totalStudentsCount by remember { mutableIntStateOf(0) }
    var officialQuestions by remember { mutableStateOf(emptyList<ExamQuestion>()) }
    var communityQuestionsCount by remember { mutableIntStateOf(0) }
    var flashcardsCount by remember { mutableIntStateOf(0) }
    var isIndexingBank by remember { mutableStateOf(false) }

    // 1. Conteo Real de Estudiantes Registrados en Firestore
    LaunchedEffect(Unit) {
        FirebaseFirestore.getInstance().collection("usuarios")
            .count()
            .get(AggregateSource.SERVER)
            .addOnSuccessListener { snapshot ->
                totalStudentsCount = snapshot.count.toInt()
            }
            .addOnFailureListener {
                totalStudentsCount = realUsers.size
            }
    }

    // 2. Carga del Banco Oficial de Preguntas (CEPREUNSA) en segundo plano
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            val loaded = ExamQuestionRepository.loadOfficialBank(context)
            withContext(Dispatchers.Main) {
                officialQuestions = loaded
            }
        }
    }

    // 3. Conteo Real de Preguntas Comunitarias en Firestore
    LaunchedEffect(Unit) {
        FirebaseFirestore.getInstance().collection("preguntas_examen")
            .count()
            .get(AggregateSource.SERVER)
            .addOnSuccessListener { snapshot ->
                communityQuestionsCount = snapshot.count.toInt()
            }
            .addOnFailureListener { }
    }

    // 4. Conteo Real de Tarjetas de Memoria en Firestore
    LaunchedEffect(Unit) {
        FirebaseFirestore.getInstance().collection("flashcards")
            .count()
            .get(AggregateSource.SERVER)
            .addOnSuccessListener { snapshot ->
                flashcardsCount = snapshot.count.toInt()
            }
            .addOnFailureListener { }
    }

    // Diálogos de Confirmación
    var itemToDelete by remember { mutableStateOf<String?>(null) }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(theme.background),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Cabecera Administrativa
        item {
            Sticker3dCard(
                containerColor = theme.surface,
                bottomBevelColor = theme.cardBevel,
                strokeColor = theme.strokeBorder,
                bevelHeight = 4.dp,
                shape = RoundedCornerShape(20.dp)
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(46.dp)
                            .clip(RoundedCornerShape(14.dp))
                            .background(Color(0xFFE11D48).copy(alpha = 0.14f))
                            .border(1.5.dp, Color(0xFFE11D48).copy(alpha = 0.35f), RoundedCornerShape(14.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.AdminPanelSettings,
                            contentDescription = null,
                            tint = Color(0xFFE11D48),
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Panel de Control Master RASTRO",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Black,
                            color = theme.textPrimary
                        )
                        Text(
                            text = "Admin Activo: $currentUserEmail",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF10B981)
                        )
                    }
                }
            }
        }

        // Métricas Rápidas en Tiempo Real de Firebase
        item {
            val studentDisplayCount = maxOf(totalStudentsCount, realUsers.size)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                AdminQuickMetric(if (studentDisplayCount > 0) "$studentDisplayCount" else "${realUsers.size}", "Estudiantes", Icons.Rounded.People, Color(0xFF3B82F6), theme, Modifier.weight(1f))
                AdminQuickMetric("${allUploads.size}", "Publicaciones", Icons.Rounded.MenuBook, Color(0xFF10B981), theme, Modifier.weight(1f))
                AdminQuickMetric("${reportedItems.size}", "Reportes UGC", Icons.Rounded.Flag, if (reportedItems.any { it.urgent }) Color(0xFFEF4444) else Color(0xFFF59E0B), theme, Modifier.weight(1f))
            }
        }

        // Pestañas de Gestión 3D
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(theme.surfaceAccent)
                    .border(1.2.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(14.dp))
                    .padding(3.dp)
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                tabs.forEachIndexed { index, label ->
                    val isSelected = selectedTab == index
                    Box(
                        modifier = Modifier
                            .height(38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (isSelected) theme.accent else Color.Transparent)
                            .padding(horizontal = 12.dp)
                            .bouncyClick(scaleDown = 0.94f) {
                                DuolingoHaptics.playOptionSelected(context)
                                selectedTab = index
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = label,
                            fontSize = 11.sp,
                            fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                            color = if (isSelected) Color.White else theme.textSecondary,
                            maxLines = 1
                        )
                    }
                }
            }
        }

        // ── CONTENIDO POR PESTAÑAS ──────────────────────────────────────────
        when (selectedTab) {
            0 -> {
                // 1. AJUSTES DEL SITIO (SITE SETTINGS) - Sincronizado en Firestore
                item {
                    AdminSectionCard(title = "Interruptores Maestros del Sistema (Firestore)", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            AdminSwitchRow(
                                title = "Modo Mantenimiento",
                                subtitle = "Muestra pantalla de pausa técnica temporal a postulantes",
                                checked = maintenanceMode,
                                onCheckedChange = { active ->
                                    DuolingoHaptics.playOptionSelected(context)
                                    maintenanceMode = active
                                    FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                        .set(mapOf("maintenanceMode" to active), SetOptions.merge())
                                    Toast.makeText(context, "Mantenimiento: ${if (active) "ACTIVADO" else "DESACTIVADO"}", Toast.LENGTH_SHORT).show()
                                },
                                theme = theme
                            )

                            AdminSwitchRow(
                                title = "Banner Global de Anuncios",
                                subtitle = "Despliega anuncio en cabecera de todas las pantallas",
                                checked = globalBannerActive,
                                onCheckedChange = { active ->
                                    DuolingoHaptics.playOptionSelected(context)
                                    globalBannerActive = active
                                    FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                        .set(mapOf("globalBannerActive" to active), SetOptions.merge())
                                },
                                theme = theme
                            )

                            if (globalBannerActive) {
                                OutlinedTextField(
                                    value = globalBannerText,
                                    onValueChange = {
                                        globalBannerText = it
                                        FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                            .set(mapOf("globalBannerText" to it), SetOptions.merge())
                                    },
                                    label = { Text("Texto del anuncio global") },
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    singleLine = true
                                )
                            }

                            AdminSwitchRow(
                                title = "Modo YouTube Oficial (Costo $0)",
                                subtitle = "Aísla y protege ancho de banda en streaming",
                                checked = youtubeIsolationActive,
                                onCheckedChange = { active ->
                                    DuolingoHaptics.playOptionSelected(context)
                                    youtubeIsolationActive = active
                                    FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                        .set(mapOf("youtubeIsolationActive" to active), SetOptions.merge())
                                },
                                theme = theme
                            )

                            AdminSwitchRow(
                                title = "Muro Comunitario Habilitado",
                                subtitle = "Permite a los usuarios publicar y comentar libremente",
                                checked = communityWallEnabled,
                                onCheckedChange = { active ->
                                    DuolingoHaptics.playOptionSelected(context)
                                    communityWallEnabled = active
                                    FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                        .set(mapOf("communityWallEnabled" to active), SetOptions.merge())
                                },
                                theme = theme
                            )
                        }
                    }
                }

                // 1.1 CONFIGURACIÓN DE VIDAS (CONTROL TOTAL DESDE PANEL ADMIN)
                item {
                    var customLivesText by remember(maxLives) { mutableStateOf(maxLives.toString()) }
                    var recoveryAmountText by remember(lifeRecoveryAmount) { mutableStateOf(lifeRecoveryAmount.toString()) }
                    var selectedUnit by remember(lifeRecoveryUnit) { mutableStateOf(LifeRecoveryUnit.fromString(lifeRecoveryUnit)) }
                    var unitDropdownExpanded by remember { mutableStateOf(false) }

                    AdminSectionCard(title = "Sistema de Vidas — Control Total", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(14.dp)) {
                            // ── SECCIÓN 1: MÁXIMO DE VIDAS ──────────────────────────────
                            Text(
                                text = "1. MÁXIMO DE VIDAS",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Black,
                                color = theme.textPrimary
                            )
                            Text(
                                text = "El administrador puede escribir cualquier entero positivo (ej: 1, 3, 10, 50, 600, 1000000). Al aumentar el máximo, la diferencia se suma a los estudiantes. Límite actual: $maxLives vidas.",
                                fontSize = 12.sp,
                                color = theme.textSecondary,
                                lineHeight = 16.sp
                            )

                            // Campo de texto numérico libre para Máximo de Vidas
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                OutlinedTextField(
                                    value = customLivesText,
                                    onValueChange = { input ->
                                        customLivesText = input.filter { it.isDigit() }.take(8)
                                    },
                                    placeholder = { Text("Ej: 10, 600, 1000000", fontSize = 13.sp) },
                                    leadingIcon = {
                                        Icon(
                                            Icons.Rounded.Favorite,
                                            contentDescription = null,
                                            tint = Color(0xFFE11D48),
                                            modifier = Modifier.size(20.dp)
                                        )
                                    },
                                    modifier = Modifier.weight(1f),
                                    shape = RoundedCornerShape(12.dp),
                                    singleLine = true,
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedBorderColor = Color(0xFFE11D48),
                                        unfocusedBorderColor = theme.borderSubtle
                                    )
                                )

                                Sticker3dButton(
                                    onClick = {
                                        val parsed = customLivesText.toIntOrNull()
                                        if (parsed == null || parsed < 1) {
                                            DuolingoHaptics.playAnswerIncorrect(context)
                                            Toast.makeText(context, "Ingresa un número entero válido mayor o igual a 1", Toast.LENGTH_SHORT).show()
                                        } else {
                                            DuolingoHaptics.playAnswerCorrect(context)
                                            maxLives = parsed
                                            FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                                .set(mapOf("maxLives" to parsed), SetOptions.merge())
                                            GamificationManager.setMaxHearts(parsed)
                                            Toast.makeText(context, "Vidas máximas configuradas a $parsed", Toast.LENGTH_SHORT).show()
                                        }
                                    },
                                    containerColor = Color(0xFFE11D48),
                                    bottomBevelColor = Color(0xFFBE123C),
                                    strokeColor = theme.strokeBorder,
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier.height(50.dp),
                                    contentPadding = PaddingValues(horizontal = 14.dp)
                                ) {
                                    Text("Guardar Máximo", color = Color.White, fontWeight = FontWeight.Black, fontSize = 12.sp)
                                }
                            }

                            // Atajos rápidos para máximo de vidas
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf(1, 3, 10, 50, 600, 1000000).forEach { preset ->
                                    val isSelected = maxLives == preset
                                    val label = if (preset >= 1000000) "1M" else "$preset"
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(32.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(if (isSelected) Color(0xFFE11D48) else theme.surfaceAccent)
                                            .border(
                                                1.dp,
                                                if (isSelected) Color(0xFFBE123C) else theme.strokeBorder.copy(alpha = 0.35f),
                                                RoundedCornerShape(8.dp)
                                            )
                                            .bouncyClick(scaleDown = 0.92f) {
                                                DuolingoHaptics.playOptionSelected(context)
                                                customLivesText = preset.toString()
                                                maxLives = preset
                                                FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                                    .set(mapOf("maxLives" to preset), SetOptions.merge())
                                                GamificationManager.setMaxHearts(preset)
                                                Toast.makeText(context, "Vidas máximas: $preset", Toast.LENGTH_SHORT).show()
                                            },
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = label,
                                            fontWeight = FontWeight.Black,
                                            fontSize = 11.sp,
                                            color = if (isSelected) Color.White else theme.textPrimary
                                        )
                                    }
                                }
                            }

                            HorizontalDivider(color = theme.borderSubtle.copy(alpha = 0.5f), thickness = 1.dp)

                            // ── SECCIÓN 2: TIEMPO DE RECUPERACIÓN DE UNA VIDA ───────────
                            Text(
                                text = "2. RECUPERAR 1 VIDA CADA:",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Black,
                                color = theme.textPrimary
                            )
                            Text(
                                text = "Entrada numérica libre + Selector de unidad temporal (Segundos, Minutos, Horas, Días, Años). El cálculo temporal es puramente matemático sin timers permanentes ni desbordamiento.",
                                fontSize = 12.sp,
                                color = theme.textSecondary,
                                lineHeight = 16.sp
                            )

                            // [ CANTIDAD ] [ UNIDAD ▼ ] + [ Guardar ]
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                // Cantidad libre
                                OutlinedTextField(
                                    value = recoveryAmountText,
                                    onValueChange = { input ->
                                        recoveryAmountText = input.filter { it.isDigit() }.take(8)
                                    },
                                    placeholder = { Text("Ej: 3", fontSize = 13.sp) },
                                    leadingIcon = {
                                        Icon(
                                            Icons.Rounded.Timer,
                                            contentDescription = null,
                                            tint = Color(0xFF3B82F6),
                                            modifier = Modifier.size(20.dp)
                                        )
                                    },
                                    modifier = Modifier.weight(1.2f),
                                    shape = RoundedCornerShape(12.dp),
                                    singleLine = true,
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedBorderColor = Color(0xFF3B82F6),
                                        unfocusedBorderColor = theme.borderSubtle
                                    )
                                )

                                // Selector de unidad desplegable
                                Box(modifier = Modifier.weight(1.4f)) {
                                    Surface(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(50.dp)
                                            .clip(RoundedCornerShape(12.dp))
                                            .border(1.5.dp, theme.borderSubtle, RoundedCornerShape(12.dp))
                                            .clickable { unitDropdownExpanded = true },
                                        color = theme.surfaceAccent,
                                        shape = RoundedCornerShape(12.dp)
                                    ) {
                                        Row(
                                            modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                            Text(
                                                text = selectedUnit.title,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 12.sp,
                                                color = theme.textPrimary
                                            )
                                            Icon(
                                                Icons.Rounded.ArrowDropDown,
                                                contentDescription = "Desplegar",
                                                tint = theme.textSecondary
                                            )
                                        }
                                    }

                                    DropdownMenu(
                                        expanded = unitDropdownExpanded,
                                        onDismissRequest = { unitDropdownExpanded = false }
                                    ) {
                                        LifeRecoveryUnit.entries.forEach { unit ->
                                            DropdownMenuItem(
                                                text = {
                                                    Text(
                                                        unit.title,
                                                        fontWeight = if (unit == selectedUnit) FontWeight.Black else FontWeight.Normal,
                                                        color = if (unit == selectedUnit) Color(0xFF3B82F6) else theme.textPrimary
                                                    )
                                                },
                                                onClick = {
                                                    selectedUnit = unit
                                                    unitDropdownExpanded = false
                                                }
                                            )
                                        }
                                    }
                                }

                                // Botón guardar recuperación
                                Sticker3dButton(
                                    onClick = {
                                        val parsedAmount = recoveryAmountText.toLongOrNull()
                                        if (parsedAmount == null || parsedAmount < 1L) {
                                            DuolingoHaptics.playAnswerIncorrect(context)
                                            Toast.makeText(context, "Ingresa una cantidad mayor o igual a 1", Toast.LENGTH_SHORT).show()
                                        } else {
                                            DuolingoHaptics.playAnswerCorrect(context)
                                            lifeRecoveryAmount = parsedAmount
                                            lifeRecoveryUnit = selectedUnit.name
                                            FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                                .set(
                                                    mapOf(
                                                        "lifeRecoveryAmount" to parsedAmount,
                                                        "lifeRecoveryUnit" to selectedUnit.name
                                                    ),
                                                    SetOptions.merge()
                                                )
                                            GamificationManager.setRecoveryConfig(parsedAmount, selectedUnit)
                                            Toast.makeText(
                                                context,
                                                "Recuperación: 1 vida cada $parsedAmount ${selectedUnit.title.lowercase()}",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    },
                                    containerColor = Color(0xFF2563EB),
                                    bottomBevelColor = Color(0xFF1D4ED8),
                                    strokeColor = theme.strokeBorder,
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier.height(50.dp),
                                    contentPadding = PaddingValues(horizontal = 12.dp)
                                ) {
                                    Text("Guardar Tiempo", color = Color.White, fontWeight = FontWeight.Black, fontSize = 11.sp)
                                }
                            }

                            // Atajos rápidos para tiempos representativos
                            Text(
                                text = "Atajos de tiempo representativos:",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = theme.textSecondary
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                val timePresets = listOf(
                                    Triple("1s", 1L, LifeRecoveryUnit.SEGUNDOS),
                                    Triple("30s", 30L, LifeRecoveryUnit.SEGUNDOS),
                                    Triple("3m", 3L, LifeRecoveryUnit.MINUTOS),
                                    Triple("2h", 2L, LifeRecoveryUnit.HORAS),
                                    Triple("7d", 7L, LifeRecoveryUnit.DIAS),
                                    Triple("1a", 1L, LifeRecoveryUnit.ANIOS),
                                    Triple("30a", 30L, LifeRecoveryUnit.ANIOS)
                                )
                                timePresets.forEach { (label, amount, unit) ->
                                    val isSelected = lifeRecoveryAmount == amount && lifeRecoveryUnit == unit.name
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(30.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(if (isSelected) Color(0xFF2563EB) else theme.surfaceAccent)
                                            .border(
                                                1.dp,
                                                if (isSelected) Color(0xFF1D4ED8) else theme.strokeBorder.copy(alpha = 0.35f),
                                                RoundedCornerShape(8.dp)
                                            )
                                            .bouncyClick(scaleDown = 0.92f) {
                                                DuolingoHaptics.playOptionSelected(context)
                                                recoveryAmountText = amount.toString()
                                                selectedUnit = unit
                                                lifeRecoveryAmount = amount
                                                lifeRecoveryUnit = unit.name
                                                FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                                    .set(
                                                        mapOf(
                                                            "lifeRecoveryAmount" to amount,
                                                            "lifeRecoveryUnit" to unit.name
                                                        ),
                                                        SetOptions.merge()
                                                    )
                                                GamificationManager.setRecoveryConfig(amount, unit)
                                                Toast.makeText(context, "Tiempo fijado: $amount ${unit.title.lowercase()}", Toast.LENGTH_SHORT).show()
                                            },
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = label,
                                            fontWeight = FontWeight.Black,
                                            fontSize = 10.sp,
                                            color = if (isSelected) Color.White else theme.textPrimary
                                        )
                                    }
                                }
                            }

                            // Tarjeta de estado de configuración activa
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = Color(0xFF10B981).copy(alpha = 0.1f),
                                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF10B981).copy(alpha = 0.35f)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    modifier = Modifier.padding(10.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Icon(
                                        Icons.Rounded.CheckCircle,
                                        contentDescription = null,
                                        tint = Color(0xFF059669),
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Column {
                                        Text(
                                            text = "Configuración activa en tiempo real:",
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.Black,
                                            color = Color(0xFF059669)
                                        )
                                        Text(
                                            text = "Máximo $maxLives vidas • Recupera 1 vida cada $lifeRecoveryAmount ${LifeRecoveryUnit.fromString(lifeRecoveryUnit).title.lowercase()}",
                                            fontSize = 11.sp,
                                            color = theme.textPrimary
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                // 1.2 CONTROL DE MATERIAL OFICIAL (FASE 10)
                item {
                    val defaultOfficialMaterials = remember { OfficialMaterialRepository.getDefaults() }
                    AdminSectionCard(title = "Control de Material Oficial (Biblioteca)", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Text(
                                text = "Oculta temporalmente recursos oficiales sin borrarlos ni afectar las publicaciones de los estudiantes.",
                                fontSize = 12.sp,
                                color = theme.textSecondary,
                                lineHeight = 16.sp
                            )

                            AdminSwitchRow(
                                title = "Ocultar TODO el Material Oficial",
                                subtitle = "Desactiva todos los tomos y prácticas oficiales en Biblioteca",
                                checked = hideAllOfficialMaterials,
                                onCheckedChange = { active ->
                                    DuolingoHaptics.playOptionSelected(context)
                                    hideAllOfficialMaterials = active
                                    FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                        .set(mapOf("hideAllOfficialMaterials" to active), SetOptions.merge())
                                },
                                theme = theme
                            )

                            if (!hideAllOfficialMaterials) {
                                HorizontalDivider(color = theme.strokeBorder.copy(alpha = 0.3f), thickness = 1.dp)
                                Text(
                                    text = "Visibilidad por recurso oficial:",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = theme.accent
                                )

                                defaultOfficialMaterials.forEach { item ->
                                    val isHidden = hiddenOfficialMaterialIds.contains(item.id)
                                    AdminSwitchRow(
                                        title = item.title,
                                        subtitle = if (isHidden) "Oculto para los postulantes" else "Visible para todos",
                                        checked = !isHidden,
                                        onCheckedChange = { visible ->
                                            DuolingoHaptics.playOptionSelected(context)
                                            val updated = if (visible) {
                                                hiddenOfficialMaterialIds - item.id
                                            } else {
                                                hiddenOfficialMaterialIds + item.id
                                            }
                                            hiddenOfficialMaterialIds = updated
                                            FirebaseFirestore.getInstance().collection("site_settings").document("global")
                                                .set(mapOf("hiddenOfficialMaterialIds" to updated), SetOptions.merge())
                                        },
                                        theme = theme
                                    )
                                }
                            }
                        }
                    }
                }
            }

            1 -> {
                // 1. ACTIVIDAD DE TESTERS / PRUEBA CERRADA
                item {
                    AdminSectionCard(title = "Período de Prueba Cerrada", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Text(
                                text = "Define la vigencia oficial de la prueba. Los días futuros no se marcan sin actividad. Finalizar la prueba no borra los datos.",
                                fontSize = 11.5.sp,
                                color = theme.textSecondary,
                                lineHeight = 16.sp
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clickable {
                                            launchDatePicker(context, testerPeriodStartInput) { testerPeriodStartInput = it }
                                        }
                                ) {
                                    OutlinedTextField(
                                        value = testerPeriodStartInput,
                                        onValueChange = {},
                                        readOnly = true,
                                        enabled = false,
                                        label = { Text("Fecha Inicio", fontSize = 11.sp) },
                                        trailingIcon = { Icon(Icons.Rounded.CalendarToday, null, tint = theme.accent, modifier = Modifier.size(16.dp)) },
                                        modifier = Modifier.fillMaxWidth(),
                                        shape = RoundedCornerShape(12.dp),
                                        colors = OutlinedTextFieldDefaults.colors(
                                            disabledTextColor = theme.textPrimary,
                                            disabledBorderColor = theme.strokeBorder,
                                            disabledLabelColor = theme.textSecondary
                                        ),
                                        singleLine = true
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clickable {
                                            launchDatePicker(context, testerPeriodEndInput) { testerPeriodEndInput = it }
                                        }
                                ) {
                                    OutlinedTextField(
                                        value = testerPeriodEndInput,
                                        onValueChange = {},
                                        readOnly = true,
                                        enabled = false,
                                        label = { Text("Fecha Fin", fontSize = 11.sp) },
                                        trailingIcon = { Icon(Icons.Rounded.CalendarToday, null, tint = theme.accent, modifier = Modifier.size(16.dp)) },
                                        modifier = Modifier.fillMaxWidth(),
                                        shape = RoundedCornerShape(12.dp),
                                        colors = OutlinedTextFieldDefaults.colors(
                                            disabledTextColor = theme.textPrimary,
                                            disabledBorderColor = theme.strokeBorder,
                                            disabledLabelColor = theme.textSecondary
                                        ),
                                        singleLine = true
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                val isOngoing = todayStr <= testerPeriodEnd
                                val statusText = if (isOngoing) "Prueba en curso" else "Prueba culminada"
                                val statusColor = if (isOngoing) Color(0xFF10B981) else Color(0xFF3B82F6)

                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Box(
                                        modifier = Modifier
                                            .size(8.dp)
                                            .clip(CircleShape)
                                            .background(statusColor)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = statusText,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = statusColor
                                    )
                                }

                                Sticker3dButton(
                                    onClick = {
                                        DuolingoHaptics.playOptionSelected(context)
                                        isSavingPeriod = true
                                        TesterActivityRepository.saveTesterPeriod(
                                            testerPeriodStartInput.trim(),
                                            testerPeriodEndInput.trim()
                                        ) { res ->
                                            isSavingPeriod = false
                                            if (res.isSuccess) {
                                                testerPeriodStart = testerPeriodStartInput.trim()
                                                testerPeriodEnd = testerPeriodEndInput.trim()
                                                DuolingoHaptics.playCelebration(context)
                                                Toast.makeText(context, "Período de prueba guardado", Toast.LENGTH_SHORT).show()
                                            } else {
                                                Toast.makeText(context, "Error guardando período", Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    },
                                    containerColor = theme.accent,
                                    bottomBevelColor = theme.accentBevel,
                                    strokeColor = theme.strokeBorder,
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier.height(40.dp),
                                    contentPadding = PaddingValues(horizontal = 14.dp),
                                    enabled = !isSavingPeriod
                                ) {
                                    if (isSavingPeriod) {
                                        CircularProgressIndicator(color = Color.White, modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                                    } else {
                                        Text("Guardar", color = Color.White, fontWeight = FontWeight.Black, fontSize = 11.5.sp)
                                    }
                                }
                            }
                        }
                    }
                }

                // Selector de Rango de Consulta de Actividad
                item {
                    Sticker3dCard(
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        bevelHeight = 3.dp,
                        shape = RoundedCornerShape(18.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Text(
                                text = "Consultar Actividad por Rango",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Black,
                                color = theme.textPrimary
                            )

                            // Fila de Presets de Rango (Scrollable)
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf(
                                    "HOY" to "Hoy",
                                    "ESTA_SEMANA" to "Esta semana",
                                    "ULTIMOS_7_DIAS" to "Últimos 7 días",
                                    "ESTE_MES" to "Este mes",
                                    "PERIODO_CERRADO" to "Prueba cerrada",
                                    "PERSONALIZADO" to "Personalizado"
                                ).forEach { (presetKey, presetLabel) ->
                                    val isSelected = activityRangePreset == presetKey
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(10.dp))
                                            .background(if (isSelected) theme.accent else theme.surfaceAccent)
                                            .border(1.dp, if (isSelected) theme.accent else theme.strokeBorder.copy(alpha = 0.3f), RoundedCornerShape(10.dp))
                                            .bouncyClick(scaleDown = 0.95f) {
                                                DuolingoHaptics.playOptionSelected(context)
                                                activityRangePreset = presetKey
                                            }
                                            .padding(horizontal = 10.dp, vertical = 6.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = presetLabel,
                                            fontSize = 11.sp,
                                            fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                            color = if (isSelected) Color.White else theme.textPrimary
                                        )
                                    }
                                }
                            }

                            // Rango Personalizado: Desde / Hasta con DatePicker
                            if (activityRangePreset == "PERSONALIZADO") {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .clickable {
                                                launchDatePicker(context, customStartDateInput) { customStartDateInput = it }
                                            }
                                    ) {
                                        OutlinedTextField(
                                            value = customStartDateInput,
                                            onValueChange = {},
                                            readOnly = true,
                                            enabled = false,
                                            label = { Text("Desde", fontSize = 11.sp) },
                                            trailingIcon = { Icon(Icons.Rounded.CalendarToday, null, tint = theme.accent, modifier = Modifier.size(16.dp)) },
                                            modifier = Modifier.fillMaxWidth(),
                                            shape = RoundedCornerShape(12.dp),
                                            colors = OutlinedTextFieldDefaults.colors(
                                                disabledTextColor = theme.textPrimary,
                                                disabledBorderColor = theme.strokeBorder,
                                                disabledLabelColor = theme.textSecondary
                                            ),
                                            singleLine = true
                                        )
                                    }

                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .clickable {
                                                launchDatePicker(context, customEndDateInput) { customEndDateInput = it }
                                            }
                                    ) {
                                        OutlinedTextField(
                                            value = customEndDateInput,
                                            onValueChange = {},
                                            readOnly = true,
                                            enabled = false,
                                            label = { Text("Hasta", fontSize = 11.sp) },
                                            trailingIcon = { Icon(Icons.Rounded.CalendarToday, null, tint = theme.accent, modifier = Modifier.size(16.dp)) },
                                            modifier = Modifier.fillMaxWidth(),
                                            shape = RoundedCornerShape(12.dp),
                                            colors = OutlinedTextFieldDefaults.colors(
                                                disabledTextColor = theme.textPrimary,
                                                disabledBorderColor = theme.strokeBorder,
                                                disabledLabelColor = theme.textSecondary
                                            ),
                                            singleLine = true
                                        )
                                    }
                                }
                            }

                            Text(
                                text = "Rango consultado: ${TesterActivityRepository.formatDateShort(queryStart)} → ${TesterActivityRepository.formatDateShort(queryEnd)}",
                                fontSize = 10.5.sp,
                                fontWeight = FontWeight.Bold,
                                color = theme.accent
                            )

                            Divider(color = theme.strokeBorder.copy(alpha = 0.2f), thickness = 0.8.dp)

                            // Sub-filtro de Participación: TODOS | ACTIVOS | SIN ACTIVIDAD
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(theme.surfaceAccent)
                                    .padding(3.dp),
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                listOf(
                                    "TODOS" to "TODOS",
                                    "ACTIVOS" to "ACTIVOS",
                                    "SIN_ACTIVIDAD" to "SIN ACTIVIDAD"
                                ).forEach { (key, label) ->
                                    val isSelected = activityStatusFilter == key
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(34.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(if (isSelected) theme.accent else Color.Transparent)
                                            .bouncyClick(scaleDown = 0.94f) {
                                                DuolingoHaptics.playOptionSelected(context)
                                                activityStatusFilter = key
                                            },
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = label,
                                            fontSize = 10.sp,
                                            fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                            color = if (isSelected) Color.White else theme.textSecondary
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                // Resumen Global de Participación (Recalculado según Rango)
                item {
                    val searchFiltered = testersList.filter {
                        it.email.contains(testerSearchQuery, ignoreCase = true) ||
                        it.displayName.contains(testerSearchQuery, ignoreCase = true) ||
                        it.uid.contains(testerSearchQuery, ignoreCase = true)
                    }

                    val totalTesters = searchFiltered.size
                    val activeTestersCount = searchFiltered.count { it.activeDaysCount > 0 }
                    val totalSecs = searchFiltered.sumOf { it.totalSeconds }
                    val totalTimeFormatted = TesterActivityRepository.formatDuration(totalSecs)
                    val globalAvgSecs = if (activeTestersCount > 0) totalSecs / activeTestersCount else 0L
                    val globalAvgFormatted = TesterActivityRepository.formatAverageMinutesAndSeconds(globalAvgSecs)

                    Sticker3dCard(
                        containerColor = theme.surface,
                        bottomBevelColor = theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        bevelHeight = 3.dp,
                        shape = RoundedCornerShape(18.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                text = "Métricas del Rango Seleccionado",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Black,
                                color = theme.textPrimary
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(theme.surfaceAccent)
                                        .padding(10.dp)
                                ) {
                                    Column {
                                        Text("Testers con Uso", fontSize = 10.sp, color = theme.textSecondary)
                                        Text("$activeTestersCount / $totalTesters", fontSize = 15.sp, fontWeight = FontWeight.Black, color = Color(0xFF10B981))
                                    }
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(theme.surfaceAccent)
                                        .padding(10.dp)
                                ) {
                                    Column {
                                        Text("Tiempo Total", fontSize = 10.sp, color = theme.textSecondary)
                                        Text(totalTimeFormatted, fontSize = 15.sp, fontWeight = FontWeight.Black, color = Color(0xFF2563EB))
                                    }
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(theme.surfaceAccent)
                                        .padding(10.dp)
                                ) {
                                    Column {
                                        Text("Promedio / Activo", fontSize = 10.sp, color = theme.textSecondary)
                                        Text(globalAvgFormatted, fontSize = 13.5.sp, fontWeight = FontWeight.Black, color = Color(0xFFF59E0B))
                                    }
                                }
                            }
                        }
                    }
                }

                // Buscador y Botón Recargar
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = testerSearchQuery,
                            onValueChange = { testerSearchQuery = it },
                            placeholder = { Text("Buscar tester por correo o nombre...", fontSize = 12.sp) },
                            leadingIcon = { Icon(Icons.Rounded.Search, null, tint = theme.textSecondary) },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(14.dp),
                            singleLine = true
                        )

                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                isLoadingTesters = true
                                TesterActivityRepository.loadAllTestersActivity(queryStart, queryEnd) { list ->
                                    testersList = list
                                    isLoadingTesters = false
                                }
                            },
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.height(52.dp),
                            contentPadding = PaddingValues(horizontal = 12.dp)
                        ) {
                            Icon(Icons.Rounded.Refresh, contentDescription = "Recargar", tint = theme.textPrimary, modifier = Modifier.size(20.dp))
                        }
                    }
                }

                if (isLoadingTesters) {
                    item {
                        Box(Modifier.fillMaxWidth().padding(32.dp), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(color = theme.accent)
                        }
                    }
                } else {
                    val searchFiltered = testersList.filter {
                        it.email.contains(testerSearchQuery, ignoreCase = true) ||
                        it.displayName.contains(testerSearchQuery, ignoreCase = true) ||
                        it.uid.contains(testerSearchQuery, ignoreCase = true)
                    }

                    val finalFilteredTesters = when (activityStatusFilter) {
                        "ACTIVOS" -> searchFiltered.filter { it.activeDaysCount > 0 }
                        "SIN_ACTIVIDAD" -> searchFiltered.filter { it.activeDaysCount == 0 }
                        else -> searchFiltered
                    }

                    if (finalFilteredTesters.isEmpty()) {
                        item {
                            Box(Modifier.fillMaxWidth().padding(32.dp), contentAlignment = Alignment.Center) {
                                Text(
                                    text = if (activityStatusFilter == "ACTIVOS") "No hay testers con actividad en este rango."
                                    else if (activityStatusFilter == "SIN_ACTIVIDAD") "No hay testers sin actividad en este rango."
                                    else "No se encontraron testers registrados.",
                                    color = theme.textSecondary,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    } else {
                        items(finalFilteredTesters, key = { it.uid }) { tester ->
                            Sticker3dCard(
                                containerColor = theme.surface,
                                bottomBevelColor = theme.cardBevel,
                                strokeColor = theme.strokeBorder,
                                bevelHeight = 3.dp,
                                shape = RoundedCornerShape(16.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .bouncyClick(scaleDown = 0.98f) {
                                        DuolingoHaptics.playOptionSelected(context)
                                        isLoadingDetail = true
                                        selectedTesterForDetail = tester
                                        detailFilter = "TODOS"
                                        TesterActivityRepository.loadTesterDetail(
                                            uid = tester.uid,
                                            email = tester.email,
                                            displayName = tester.displayName,
                                            photoUrl = tester.photoUrl,
                                            startDate = queryStart,
                                            endDate = queryEnd
                                        ) { detailed ->
                                            selectedTesterForDetail = detailed
                                            isLoadingDetail = false
                                        }
                                    }
                            ) {
                                Column(
                                    modifier = Modifier.padding(14.dp),
                                    verticalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    // Cabecera: Avatar + Nombre + Correo
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier.weight(1f)
                                        ) {
                                            CartoonAvatar(tester.photoUrl, size = 38.dp, strokeWidth = 1.8.dp, bevelOffset = 2.dp)
                                            Spacer(modifier = Modifier.width(10.dp))
                                            Column {
                                                Text(
                                                    text = tester.displayName,
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 13.5.sp,
                                                    color = theme.textPrimary
                                                )
                                                Text(
                                                    text = tester.email,
                                                    fontSize = 11.5.sp,
                                                    fontWeight = FontWeight.Medium,
                                                    color = theme.accent
                                                )
                                            }
                                        }

                                        val isActiveUser = tester.activeDaysCount > 0
                                        Box(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(8.dp))
                                                .background(
                                                    if (isActiveUser) Color(0xFF10B981).copy(alpha = 0.15f)
                                                    else Color(0xFF6B7280).copy(alpha = 0.15f)
                                                )
                                                .padding(horizontal = 8.dp, vertical = 3.dp)
                                        ) {
                                            Text(
                                                text = if (isActiveUser) "Participante" else "Sin actividad",
                                                fontSize = 10.sp,
                                                fontWeight = FontWeight.Black,
                                                color = if (isActiveUser) Color(0xFF10B981) else Color(0xFF6B7280)
                                            )
                                        }
                                    }

                                    Divider(color = theme.strokeBorder.copy(alpha = 0.2f), thickness = 0.8.dp)

                                    // Grid 2x2 para métricas del tester (adaptado a móvil)
                                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                            Column(modifier = Modifier.weight(1f)) {
                                                Text("Asistencia", fontSize = 10.sp, color = theme.textSecondary)
                                                Text(
                                                    text = "${tester.activeDaysCount}/${tester.activeDaysCount + tester.inactiveDaysCount} días",
                                                    fontSize = 13.sp,
                                                    fontWeight = FontWeight.Black,
                                                    color = if (tester.activeDaysCount > 0) Color(0xFF10B981) else theme.textSecondary
                                                )
                                            }

                                            Column(modifier = Modifier.weight(1f)) {
                                                Text("Días sin actividad", fontSize = 10.sp, color = theme.textSecondary)
                                                Text(
                                                    text = "${tester.inactiveDaysCount}",
                                                    fontSize = 13.sp,
                                                    fontWeight = FontWeight.Black,
                                                    color = theme.textSecondary
                                                )
                                            }
                                        }

                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                            Column(modifier = Modifier.weight(1f)) {
                                                Text("Total período", fontSize = 10.sp, color = theme.textSecondary)
                                                Text(
                                                    text = tester.formattedTotalTime,
                                                    fontSize = 13.sp,
                                                    fontWeight = FontWeight.Black,
                                                    color = theme.textPrimary
                                                )
                                            }

                                            Column(modifier = Modifier.weight(1f)) {
                                                Text("Promedio/día activo", fontSize = 10.sp, color = theme.textSecondary)
                                                Text(
                                                    text = tester.formattedAverage,
                                                    fontSize = 13.sp,
                                                    fontWeight = FontWeight.Black,
                                                    color = Color(0xFF2563EB)
                                                )
                                            }
                                        }

                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                            Column(modifier = Modifier.weight(1f)) {
                                                Text("APK período", fontSize = 10.sp, color = theme.textSecondary)
                                                Text(
                                                    text = tester.formattedAppPeriodTime,
                                                    fontSize = 13.sp,
                                                    fontWeight = FontWeight.Black,
                                                    color = theme.textPrimary
                                                )
                                            }

                                            Column(modifier = Modifier.weight(1f)) {
                                                Text("Web período", fontSize = 10.sp, color = theme.textSecondary)
                                                Text(
                                                    text = tester.formattedWebPeriodTime,
                                                    fontSize = 13.sp,
                                                    fontWeight = FontWeight.Black,
                                                    color = theme.textPrimary
                                                )
                                            }
                                        }

                                        Text(
                                            text = "Total histórico: ${tester.formattedHistoricTotalTime}",
                                            fontSize = 10.5.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.textSecondary
                                        )
                                    }

                                    // Fila de Última Actividad
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                Icons.Rounded.Schedule,
                                                contentDescription = null,
                                                tint = theme.textSecondary,
                                                modifier = Modifier.size(14.dp)
                                            )
                                            Spacer(modifier = Modifier.width(4.dp))
                                            Text(
                                                text = "Última actividad: ${tester.formattedLastActiveDateTime}",
                                                fontSize = 10.5.sp,
                                                color = theme.textSecondary,
                                                fontWeight = FontWeight.Medium
                                            )
                                        }

                                        Text(
                                            text = "Tocar para ver detalle →",
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.accent
                                        )
                                    }

                                        Column {
                                            Text("Promedio/día activo", fontSize = 10.sp, color = theme.textSecondary)
                                            Text(
                                                text = tester.formattedAverage,
                                                fontSize = 13.sp,
                                                fontWeight = FontWeight.Black,
                                                color = Color(0xFF2563EB)
                                            )
                                        }
                                    }

                                    // Fila de Última Actividad
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                Icons.Rounded.Schedule,
                                                contentDescription = null,
                                                tint = theme.textSecondary,
                                                modifier = Modifier.size(14.dp)
                                            )
                                            Spacer(modifier = Modifier.width(4.dp))
                                            Text(
                                                text = "Última actividad: ${tester.formattedLastActiveDateTime}",
                                                fontSize = 10.5.sp,
                                                color = theme.textSecondary,
                                                fontWeight = FontWeight.Medium
                                            )
                                        }

                                        Text(
                                            text = "Tocar para ver detalle →",
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = theme.accent
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

            2 -> {
                // 2. GESTIÓN Y MODERACIÓN DE USUARIOS REALES (FIRESTORE)
                item {
                    OutlinedTextField(
                        value = userSearchQuery,
                        onValueChange = { userSearchQuery = it },
                        placeholder = { Text("Buscar estudiante por nombre, correo o carrera...", fontSize = 12.sp) },
                        leadingIcon = { Icon(Icons.Rounded.Search, null, tint = theme.textSecondary) },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        singleLine = true
                    )
                }

                val filteredUsers = realUsers.filter {
                    it.displayName.contains(userSearchQuery, ignoreCase = true) ||
                    (it.email?.contains(userSearchQuery, ignoreCase = true) == true) ||
                    it.targetCareer.contains(userSearchQuery, ignoreCase = true)
                }

                if (filteredUsers.isEmpty()) {
                    item {
                        Box(Modifier.fillMaxWidth().padding(32.dp), contentAlignment = Alignment.Center) {
                            Text("No se encontraron estudiantes registrados con ese criterio.", color = theme.textSecondary, fontSize = 12.sp)
                        }
                    }
                } else {
                    items(filteredUsers, key = { it.uid }) { user ->
                        Sticker3dCard(
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        CartoonAvatar(user.photoURL, size = 36.dp, strokeWidth = 1.8.dp, bevelOffset = 2.dp)
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Column {
                                            Text(user.displayName, fontWeight = FontWeight.Bold, fontSize = 13.5.sp, color = theme.textPrimary)
                                            Text(user.email ?: "Sin correo registrado", fontSize = 11.sp, color = theme.textSecondary)
                                            if (user.targetCareer.isNotBlank()) {
                                                Text(user.targetCareer, fontSize = 10.sp, color = theme.accent, fontWeight = FontWeight.Bold)
                                            }
                                        }
                                    }

                                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                        if (user.isAlly) {
                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(8.dp))
                                                    .background(Color(0xFFF59E0B).copy(alpha = 0.15f))
                                                    .padding(horizontal = 7.dp, vertical = 2.dp)
                                            ) {
                                                Text("🌟 Aliado", fontSize = 9.5.sp, fontWeight = FontWeight.Black, color = Color(0xFFD97706))
                                            }
                                        }
                                        if (user.banned) {
                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(8.dp))
                                                    .background(Color(0xFFEF4444).copy(alpha = 0.15f))
                                                    .padding(horizontal = 7.dp, vertical = 2.dp)
                                            ) {
                                                Text("🚫 Bloqueado", fontSize = 9.5.sp, fontWeight = FontWeight.Black, color = Color(0xFFEF4444))
                                            }
                                        }
                                    }
                                }

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    OutlinedButton(
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            val newAlly = !user.isAlly
                                            FirebaseFirestore.getInstance().collection("usuarios").document(user.uid)
                                                .update("isAlly", newAlly)
                                            Toast.makeText(context, if (newAlly) "Distinción de Aliado otorgada" else "Aliado retirado", Toast.LENGTH_SHORT).show()
                                        },
                                        modifier = Modifier.weight(1f).height(36.dp),
                                        shape = RoundedCornerShape(10.dp)
                                    ) {
                                        Text(if (user.isAlly) "Quitar Aliado" else "Hacer Aliado", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                    }

                                    OutlinedButton(
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            val newWarn = !user.hasWarning
                                            val warnMsg = if (newWarn) "Aviso oficial: Por favor revisa las normas de aporte comunitario." else ""
                                            FirebaseFirestore.getInstance().collection("usuarios").document(user.uid)
                                                .update(mapOf("hasWarning" to newWarn, "warningMessage" to warnMsg))
                                            if (newWarn) {
                                                FirebaseFirestore.getInstance().collection("notificaciones").add(mapOf(
                                                    "recipientUid" to user.uid,
                                                    "type" to "warning",
                                                    "message" to "⚠️ Aviso de Moderación: Asegúrate de que tus materiales cumplan las directrices de RASTRO.",
                                                    "read" to false,
                                                    "createdAt" to FieldValue.serverTimestamp(),
                                                    "timestamp" to System.currentTimeMillis()
                                                ))
                                            }
                                            Toast.makeText(context, if (newWarn) "Advertencia enviada al usuario" else "Aviso retirado", Toast.LENGTH_SHORT).show()
                                        },
                                        modifier = Modifier.weight(1f).height(36.dp),
                                        shape = RoundedCornerShape(10.dp)
                                    ) {
                                        Text(if (user.hasWarning) "Quitar Aviso" else "⚠️ Advertir", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                    }

                                    Button(
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            val newBanned = !user.banned
                                            FirebaseFirestore.getInstance().collection("usuarios").document(user.uid)
                                                .update("banned", newBanned)
                                            Toast.makeText(context, if (newBanned) "Usuario bloqueado del sistema" else "Usuario desbloqueado", Toast.LENGTH_SHORT).show()
                                        },
                                        modifier = Modifier.weight(1f).height(36.dp),
                                        shape = RoundedCornerShape(10.dp),
                                        colors = ButtonDefaults.buttonColors(containerColor = if (user.banned) Color(0xFF10B981) else Color(0xFFEF4444))
                                    ) {
                                        Text(if (user.banned) "Desbloquear" else "🚫 Bloquear", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                    }
                                }
                            }
                        }
                    }
                }
            }

            3 -> {
                // 3. CONTENIDO UGC: REPORTES Y TODAS LAS PUBLICACIONES
                // Sub-sección 1: Reportes Pendientes
                item {
                    Text(
                        text = "🚨 Reportes de Moderación Pendientes (${reportedItems.size})",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )
                }

                if (reportedItems.isEmpty()) {
                    item {
                        Sticker3dCard(
                            containerColor = theme.surface,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder,
                            bevelHeight = 3.dp,
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Rounded.CheckCircle, null, tint = Color(0xFF10B981), modifier = Modifier.size(36.dp))
                                Spacer(modifier = Modifier.width(12.dp))
                                Column {
                                    Text("¡Comunidad limpia y ordenada!", fontWeight = FontWeight.Bold, fontSize = 13.5.sp, color = theme.textPrimary)
                                    Text("No hay reportes de usuarios pendientes de revisión.", fontSize = 11.sp, color = theme.textSecondary)
                                }
                            }
                        }
                    }
                } else {
                    items(reportedItems, key = { it.id }) { report ->
                        Sticker3dCard(
                            containerColor = theme.surface,
                            bottomBevelColor = if (report.urgent) Color(0xFFB91C1C) else theme.cardBevel,
                            strokeColor = if (report.urgent) Color(0xFFEF4444) else theme.strokeBorder,
                            bevelHeight = 4.dp,
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Column(modifier = Modifier.padding(14.dp)) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(report.postTitle.take(35), fontWeight = FontWeight.Black, fontSize = 14.sp, color = theme.textPrimary)
                                    if (report.urgent) {
                                        Box(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(6.dp))
                                                .background(Color(0xFFEF4444))
                                                .padding(horizontal = 7.dp, vertical = 2.dp)
                                        ) {
                                            Text("🚨 URGENTE (3+ REPORTES)", fontSize = 9.sp, fontWeight = FontWeight.Black, color = Color.White)
                                        }
                                    }
                                }

                                Spacer(modifier = Modifier.height(4.dp))
                                Text("Motivo: ${report.reason}", fontSize = 11.5.sp, fontWeight = FontWeight.Bold, color = Color(0xFFEF4444))
                                if (report.details.isNotBlank()) {
                                    Text("Detalles: \"${report.details}\"", fontSize = 11.sp, color = theme.textSecondary)
                                }
                                Text("Autor: ${report.authorName}  •  Reportado por: ${report.reporterName}", fontSize = 10.sp, color = theme.textSecondary)

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    OutlinedButton(
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            UserUploadRepository.resolveReport(report.id)
                                            Toast.makeText(context, "Reporte descartado/resuelto", Toast.LENGTH_SHORT).show()
                                        },
                                        modifier = Modifier.weight(1f).height(36.dp),
                                        shape = RoundedCornerShape(10.dp)
                                    ) {
                                        Text("Descartar Reporte", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                    }

                                    Button(
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            UserUploadRepository.setUploadHidden(report.postId, hidden = true)
                                            UserUploadRepository.resolveReport(report.id)
                                            Toast.makeText(context, "Publicación oculta para todos", Toast.LENGTH_SHORT).show()
                                        },
                                        modifier = Modifier.weight(1f).height(36.dp),
                                        shape = RoundedCornerShape(10.dp),
                                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF59E0B))
                                    ) {
                                        Text("Ocultar Post", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                    }

                                    Button(
                                        onClick = {
                                            DuolingoHaptics.playOptionSelected(context)
                                            UserUploadRepository.deleteUpload(report.postId) {
                                                UserUploadRepository.resolveReport(report.id)
                                                Toast.makeText(context, "Publicación eliminada definitivamente", Toast.LENGTH_SHORT).show()
                                            }
                                        },
                                        modifier = Modifier.weight(1f).height(36.dp),
                                        shape = RoundedCornerShape(10.dp),
                                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444))
                                    ) {
                                        Text("Eliminar Post", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                    }
                                }
                            }
                        }
                    }
                }

                // Sub-sección 2: Todas las Publicaciones de la Comunidad
                item {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "📚 Explorador de Todas las Publicaciones (${allUploads.size})",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Black,
                        color = theme.textPrimary
                    )
                }

                items(allUploads, key = { it.id }) { upload ->
                    Sticker3dCard(
                        containerColor = theme.surface,
                        bottomBevelColor = if (upload.isHidden) Color(0xFF94A3B8) else theme.cardBevel,
                        strokeColor = theme.strokeBorder,
                        bevelHeight = 3.dp,
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(upload.title, fontWeight = FontWeight.Bold, fontSize = 13.sp, color = theme.textPrimary)
                                    Text("Por: ${upload.author} • Cat: ${upload.category}", fontSize = 10.5.sp, color = theme.textSecondary)
                                }

                                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    if (upload.isHidden) {
                                        Box(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(6.dp))
                                                .background(Color(0xFF64748B))
                                                .padding(horizontal = 6.dp, vertical = 2.dp)
                                        ) {
                                            Text("Oculto", fontSize = 9.sp, fontWeight = FontWeight.Black, color = Color.White)
                                        }
                                    }
                                    if (upload.reportsCount > 0) {
                                        Box(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(6.dp))
                                                .background(Color(0xFFEF4444).copy(alpha = 0.15f))
                                                .padding(horizontal = 6.dp, vertical = 2.dp)
                                        ) {
                                            Text("⚠️ ${upload.reportsCount} reportes", fontSize = 9.sp, fontWeight = FontWeight.Black, color = Color(0xFFEF4444))
                                        }
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                OutlinedButton(
                                    onClick = {
                                        DuolingoHaptics.playOptionSelected(context)
                                        UserUploadRepository.setUploadHidden(upload.id, !upload.isHidden)
                                        Toast.makeText(context, if (upload.isHidden) "Publicación visible" else "Publicación oculta", Toast.LENGTH_SHORT).show()
                                    },
                                    modifier = Modifier.weight(1f).height(34.dp),
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(if (upload.isHidden) "Restaurar" else "Ocultar", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                }

                                Button(
                                    onClick = {
                                        itemToDelete = upload.id
                                    },
                                    modifier = Modifier.weight(1f).height(34.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444))
                                ) {
                                    Text("Eliminar", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                }
                            }
                        }
                    }
                }
            }

            4 -> {
                // 4. NOTIFICACIONES PUSH & DIFUSIÓN
                item {
                    AdminSectionCard(title = "Envío de Notificación Masiva (Difusión a Postulantes)", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                            Text(
                                text = "Envía una alerta instantánea a todos los estudiantes registrados para recordar repasos, simulacros o anuncios de último minuto.",
                                fontSize = 11.5.sp,
                                color = theme.textSecondary,
                                lineHeight = 16.sp
                            )

                            OutlinedTextField(
                                value = notifTitle,
                                onValueChange = { notifTitle = it },
                                label = { Text("Título de la notificación") },
                                placeholder = { Text("Ej: ¡Simulacro General UNSA este domingo!") },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                singleLine = true
                            )

                            OutlinedTextField(
                                value = notifBody,
                                onValueChange = { notifBody = it },
                                label = { Text("Mensaje de la notificación") },
                                placeholder = { Text("Ej: Ingresa a RASTRO para asegurar tu racha y medir tu puntaje...") },
                                modifier = Modifier.fillMaxWidth().height(100.dp),
                                shape = RoundedCornerShape(12.dp)
                            )

                            Sticker3dButton(
                                onClick = {
                                    if (notifTitle.isBlank() || notifBody.isBlank()) {
                                        Toast.makeText(context, "Ingresa un título y mensaje para enviar", Toast.LENGTH_SHORT).show()
                                        return@Sticker3dButton
                                    }
                                    sendingNotif = true
                                    DuolingoHaptics.playOptionSelected(context)

                                    // 1. Guardar en Firestore colección notificaciones para que aparezca en el panel de todos
                                    FirebaseFirestore.getInstance().collection("notificaciones").add(mapOf(
                                        "recipientUid" to "ALL_STUDENTS",
                                        "type" to "broadcast",
                                        "title" to notifTitle.trim(),
                                        "message" to notifBody.trim(),
                                        "read" to false,
                                        "createdAt" to FieldValue.serverTimestamp(),
                                        "timestamp" to System.currentTimeMillis()
                                    )).addOnCompleteListener {
                                        sendingNotif = false
                                        // 2. Disparar notificación local en el dispositivo del admin como prueba de visualización
                                        sendLocalBroadcastNotification(context, notifTitle.trim(), notifBody.trim())
                                        DuolingoHaptics.playCelebration(context)
                                        Toast.makeText(context, "¡Notificación de difusión enviada con éxito!", Toast.LENGTH_LONG).show()
                                        notifTitle = ""
                                        notifBody = ""
                                    }
                                },
                                modifier = Modifier.fillMaxWidth().height(48.dp),
                                containerColor = theme.accent,
                                bottomBevelColor = theme.accentBevel,
                                strokeColor = theme.strokeBorder,
                                enabled = !sendingNotif
                            ) {
                                if (sendingNotif) {
                                    CircularProgressIndicator(color = Color.White, modifier = Modifier.size(20.dp), strokeWidth = 2.dp)
                                } else {
                                    Icon(Icons.Rounded.NotificationsActive, null, tint = Color.White, modifier = Modifier.size(18.dp))
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text("Emitir Notificación a Todos", color = Color.White, fontWeight = FontWeight.Black, fontSize = 13.5.sp)
                                }
                            }
                        }
                    }
                }
            }

            5 -> {
                // 5. BANCO DE PREGUNTAS Y ESTADÍSTICAS REALES
                val officialTotal = officialQuestions.size
                val biomedicasIngCount = officialQuestions.count { q ->
                    q.area.contains("Biom", ignoreCase = true) || q.area.contains("Ing", ignoreCase = true) ||
                    q.asignatura in listOf("Biología", "Física", "Química", "Matemática", "Álgebra", "Geometría", "Trigonometría")
                }
                val socialesHumanidadesCount = officialQuestions.count { q ->
                    q.area.contains("Soc", ignoreCase = true) ||
                    q.asignatura in listOf("Historia", "Geografía", "Filosofía", "Psicología", "Literatura", "Ed. Cívica")
                }
                val aptitudCount = officialQuestions.count { q ->
                    q.asignatura in listOf("Raz. Lógico", "Raz. Matemático", "Raz. Verbal", "Comp. Lectora")
                }
                val withExplanationsCount = officialQuestions.count { it.explanation.isNotBlank() }
                val explanationPercent = if (officialTotal > 0) (withExplanationsCount * 100) / officialTotal else 100

                val syllabusNodesCount = AprenderRepository.totalLessonsCount
                val syllabusChallengesCount = AprenderRepository.totalChallengesCount

                item {
                    AdminSectionCard(title = "Banco Oficial CEPREUNSA (Exámenes Reales)", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            StatRow("Banco Oficial Cargado", if (officialTotal > 0) "$officialTotal preguntas" else "Cargando preguntas...", Color(0xFF10B981), theme)
                            StatRow("Biomédicas & Ingenierías", "$biomedicasIngCount preguntas", theme.accent, theme)
                            StatRow("Sociales y Humanidades", "$socialesHumanidadesCount preguntas", Color(0xFF8B5CF6), theme)
                            StatRow("Aptitud Académica", "$aptitudCount preguntas", Color(0xFF0284C7), theme)
                            StatRow("Solucionarios Verificados", "$withExplanationsCount con explicación ($explanationPercent%)", Color(0xFFF59E0B), theme)
                        }
                    }
                }

                item {
                    AdminSectionCard(title = "Ruta de Aprendizaje y Retos (Temario Oficial)", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            StatRow("Subtemas en Matriz Oficial", "$syllabusNodesCount nodos curriculares", theme.accent, theme)
                            StatRow("Retos Interactivos (Stickers/Quiz)", "$syllabusChallengesCount retos pedagógicos", Color(0xFF10B981), theme)
                        }
                    }
                }

                item {
                    AdminSectionCard(title = "Aportes Comunitarios en Firestore", theme = theme) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            StatRow("Preguntas Creadas por Alumnos", "$communityQuestionsCount preguntas en vivo", Color(0xFF3B82F6), theme)
                            StatRow("Tarjetas de Estudio (Flashcards)", "$flashcardsCount tarjetas activas", Color(0xFFD946EF), theme)

                            Spacer(modifier = Modifier.height(6.dp))

                            Sticker3dButton(
                                onClick = {
                                    isIndexingBank = true
                                    DuolingoHaptics.playOptionSelected(context)
                                    val loaded = ExamQuestionRepository.loadOfficialBank(context)
                                    officialQuestions = loaded
                                    FirebaseFirestore.getInstance().collection("usuarios").count().get(AggregateSource.SERVER).addOnSuccessListener {
                                        totalStudentsCount = it.count.toInt()
                                    }
                                    FirebaseFirestore.getInstance().collection("preguntas_examen").count().get(AggregateSource.SERVER).addOnSuccessListener {
                                        communityQuestionsCount = it.count.toInt()
                                    }
                                    FirebaseFirestore.getInstance().collection("flashcards").count().get(AggregateSource.SERVER).addOnSuccessListener {
                                        flashcardsCount = it.count.toInt()
                                    }
                                    isIndexingBank = false
                                    DuolingoHaptics.playCelebration(context)
                                    Toast.makeText(context, "¡Banco verificado: ${loaded.size} oficiales + $syllabusChallengesCount retos!", Toast.LENGTH_LONG).show()
                                },
                                modifier = Modifier.fillMaxWidth().height(42.dp),
                                containerColor = theme.accent,
                                bottomBevelColor = theme.accentBevel,
                                strokeColor = theme.strokeBorder,
                                enabled = !isIndexingBank
                            ) {
                                if (isIndexingBank) {
                                    CircularProgressIndicator(color = Color.White, modifier = Modifier.size(18.dp), strokeWidth = 2.dp)
                                } else {
                                    Icon(Icons.Rounded.Refresh, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text("Reindexar y Verificar Integridad", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Diálogo Detallado de Actividad por Tester
    val detail = selectedTesterForDetail
    if (detail != null) {
        Dialog(
            onDismissRequest = { selectedTesterForDetail = null },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.55f))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Sticker3dCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.85f),
                    containerColor = theme.surface,
                    bottomBevelColor = theme.cardBevel,
                    strokeColor = theme.strokeBorder,
                    bevelHeight = 4.dp,
                    shape = RoundedCornerShape(22.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        // Cabecera del diálogo
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                                CartoonAvatar(detail.photoUrl, size = 36.dp, strokeWidth = 1.8.dp, bevelOffset = 2.dp)
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(
                                        text = detail.displayName,
                                        fontWeight = FontWeight.Black,
                                        fontSize = 14.sp,
                                        color = theme.textPrimary
                                    )
                                    Text(
                                        text = detail.email,
                                        fontSize = 11.sp,
                                        color = theme.accent,
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }
                            IconButton(onClick = { selectedTesterForDetail = null }) {
                                Icon(Icons.Rounded.Close, contentDescription = "Cerrar", tint = theme.textSecondary)
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        // Tarjeta de Resumen del Período
                        Sticker3dCard(
                            containerColor = theme.surfaceAccent,
                            bottomBevelColor = theme.cardBevel,
                            strokeColor = theme.strokeBorder.copy(alpha = 0.4f),
                            bevelHeight = 2.dp,
                            shape = RoundedCornerShape(14.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(12.dp),
                                verticalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Período observado:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text("$testerPeriodStart → $testerPeriodEnd", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                                }
                                Divider(color = theme.strokeBorder.copy(alpha = 0.2f), thickness = 0.8.dp)
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Días activos:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text("${detail.activeDaysCount} días", fontSize = 11.sp, fontWeight = FontWeight.Black, color = Color(0xFF10B981))
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Días sin actividad:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text("${detail.inactiveDaysCount} días", fontSize = 11.sp, fontWeight = FontWeight.Black, color = theme.textSecondary)
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("APK período:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text(detail.formattedAppPeriodTime, fontSize = 11.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Web período:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text(detail.formattedWebPeriodTime, fontSize = 11.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Total período:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text(detail.formattedTotalTime, fontSize = 11.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Total histórico:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text(detail.formattedHistoricTotalTime, fontSize = 11.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Promedio por día activo:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text(detail.formattedAverage, fontSize = 11.sp, fontWeight = FontWeight.Black, color = Color(0xFF2563EB))
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Última actividad:", fontSize = 11.sp, color = theme.textSecondary)
                                    Text(detail.formattedLastActiveDateTime, fontSize = 11.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
                                }

                                if (detail.historicalRecoveredDates.isNotEmpty()) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(Color(0xFF3B82F6).copy(alpha = 0.12f))
                                            .padding(6.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "Histórico previo de gamificación vinculado (${detail.historicalRecoveredDates.size} días)",
                                            fontSize = 9.5.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color(0xFF2563EB)
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        // Filtros Segmentados: TODOS | ACTIVOS | SIN ACTIVIDAD
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(theme.surfaceAccent)
                                .border(1.dp, theme.strokeBorder.copy(alpha = 0.35f), RoundedCornerShape(12.dp))
                                .padding(3.dp),
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            listOf(
                                Triple("TODOS", "TODOS (${detail.dailyItems.size})", "TODOS"),
                                Triple("ACTIVOS", "ACTIVOS (${detail.activeDaysCount})", "ACTIVOS"),
                                Triple("SIN_ACTIVIDAD", "SIN ACTIVIDAD (${detail.inactiveDaysCount})", "SIN_ACTIVIDAD")
                            ).forEach { (key, label, _) ->
                                val isSelected = detailFilter == key
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .height(34.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(if (isSelected) theme.accent else Color.Transparent)
                                        .bouncyClick(scaleDown = 0.94f) {
                                            DuolingoHaptics.playOptionSelected(context)
                                            detailFilter = key
                                        },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = label,
                                        fontSize = 10.sp,
                                        fontWeight = if (isSelected) FontWeight.Black else FontWeight.Bold,
                                        color = if (isSelected) Color.White else theme.textSecondary
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        // Lista Filtrada de Días
                        val filteredDays = when (detailFilter) {
                            "ACTIVOS" -> detail.dailyItems.filter { it.isActive }
                            "SIN_ACTIVIDAD" -> detail.dailyItems.filter { !it.isActive }
                            else -> detail.dailyItems
                        }

                        if (isLoadingDetail) {
                            Box(modifier = Modifier.weight(1f).fillMaxWidth(), contentAlignment = Alignment.Center) {
                                CircularProgressIndicator(color = theme.accent)
                            }
                        } else if (filteredDays.isEmpty()) {
                            Box(modifier = Modifier.weight(1f).fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Text(
                                    text = if (detailFilter == "ACTIVOS") "No hay días con actividad en el período." else "No hay días sin actividad registrados.",
                                    fontSize = 12.sp,
                                    color = theme.textSecondary
                                )
                            }
                        } else {
                            LazyColumn(
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth(),
                                verticalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                items(filteredDays, key = { it.date }) { dayItem ->
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(10.dp))
                                            .background(theme.surfaceAccent)
                                            .border(1.dp, theme.strokeBorder.copy(alpha = 0.2f), RoundedCornerShape(10.dp))
                                            .padding(horizontal = 12.dp, vertical = 10.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Box(
                                                modifier = Modifier
                                                    .size(8.dp)
                                                    .clip(CircleShape)
                                                    .background(if (dayItem.isActive) Color(0xFF10B981) else Color(0xFF9CA3AF))
                                            )
                                            Spacer(modifier = Modifier.width(8.dp))
                                            Text(
                                                text = dayItem.formattedDate + if (dayItem.isActive) " ✓" else " ✗",
                                                fontSize = 12.5.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = theme.textPrimary
                                            )
                                        }

                                        Text(
                                            text = dayItem.formattedTime,
                                            fontSize = 12.sp,
                                            fontWeight = if (dayItem.isActive) FontWeight.Black else FontWeight.Normal,
                                            color = if (dayItem.isActive) Color(0xFF10B981) else theme.textSecondary
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Sticker3dButton(
                            onClick = {
                                DuolingoHaptics.playOptionSelected(context)
                                selectedTesterForDetail = null
                            },
                            modifier = Modifier.fillMaxWidth().height(44.dp),
                            containerColor = theme.accent,
                            bottomBevelColor = theme.accentBevel,
                            strokeColor = theme.strokeBorder,
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text("Cerrar Detalle", color = Color.White, fontWeight = FontWeight.Black, fontSize = 13.sp)
                        }
                    }
                }
            }
        }
    }

    if (itemToDelete != null) {
        RastroStickerDialog(
            onDismissRequest = { itemToDelete = null },
            title = "Eliminar de raíz",
            message = "¿Deseas eliminar definitivamente este aporte de la base de datos de Firebase?",
            confirmText = "Eliminar Definitivamente",
            cancelText = "Cancelar",
            isDestructive = true,
            icon = Icons.Rounded.DeleteForever,
            onConfirm = {
                val id = itemToDelete ?: return@RastroStickerDialog
                itemToDelete = null
                UserUploadRepository.deleteUpload(id) {
                    Toast.makeText(context, "Publicación eliminada por el administrador", Toast.LENGTH_SHORT).show()
                }
            },
            theme = theme
        )
    }
}

private fun sendLocalBroadcastNotification(context: android.content.Context, title: String, body: String) {
    LimaStudyReminderWorker.createNotificationChannel(context)
    val intent = Intent(context, MainActivity::class.java).apply {
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
    }
    val pendingIntent = PendingIntent.getActivity(
        context,
        0,
        intent,
        PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
    )

    val notification = NotificationCompat.Builder(context, LimaStudyReminderWorker.CHANNEL_ID)
        .setSmallIcon(android.R.drawable.ic_dialog_info)
        .setContentTitle(title)
        .setContentText(body)
        .setStyle(NotificationCompat.BigTextStyle().bigText(body))
        .setPriority(NotificationCompat.PRIORITY_HIGH)
        .setContentIntent(pendingIntent)
        .setAutoCancel(true)
        .build()

    try {
        NotificationManagerCompat.from(context).notify(2001, notification)
    } catch (_: SecurityException) { }
}

@Composable
private fun AdminQuickMetric(
    count: String,
    label: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    color: Color,
    theme: RastroPalette,
    modifier: Modifier = Modifier
) {
    Sticker3dCard(
        modifier = modifier,
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 3.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Icon(icon, null, tint = color, modifier = Modifier.size(18.dp))
            Spacer(modifier = Modifier.height(6.dp))
            Text(count, fontSize = 15.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
            Text(label, fontSize = 9.5.sp, color = theme.textSecondary, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
private fun AdminSectionCard(
    title: String,
    theme: RastroPalette,
    content: @Composable ColumnScope.() -> Unit
) {
    Sticker3dCard(
        containerColor = theme.surface,
        bottomBevelColor = theme.cardBevel,
        strokeColor = theme.strokeBorder,
        bevelHeight = 4.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(title, fontSize = 14.sp, fontWeight = FontWeight.Black, color = theme.textPrimary)
            content()
        }
    }
}

@Composable
private fun AdminSwitchRow(
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    theme: RastroPalette
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(theme.surfaceAccent)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(title, fontSize = 12.5.sp, fontWeight = FontWeight.Bold, color = theme.textPrimary)
            Text(subtitle, fontSize = 10.sp, color = theme.textSecondary)
        }
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = Color(0xFF10B981)
            )
        )
    }
}

@Composable
private fun StatRow(label: String, value: String, valueColor: Color, theme: RastroPalette) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, fontSize = 11.5.sp, color = theme.textSecondary)
        Text(value, fontSize = 11.5.sp, fontWeight = FontWeight.Black, color = valueColor)
    }
}
