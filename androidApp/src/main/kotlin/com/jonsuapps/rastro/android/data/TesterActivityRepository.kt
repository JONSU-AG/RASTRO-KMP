package com.jonsuapps.rastro.android.data

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.android.RastroApplication
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.gamification.GamificationManager
import kotlinx.datetime.LocalDate

/**
 * Elemento de actividad diaria de un tester en un día calendario específico.
 */
data class DailyActivityItem(
    val date: String,             // Formato YYYY-MM-DD
    val formattedDate: String,    // Ej: "24 sep."
    val activeSeconds: Long,      // Segundos activos
    val appSeconds: Long = 0L,    // Segundos en App
    val webSeconds: Long = 0L,    // Segundos en Web
    val formattedTime: String,    // Ej: "25 min (App: 15 min · Web: 10 min)" o "Sin actividad"
    val isActive: Boolean,        // true si tuvo tiempo > 0 o actividad comprobada
    val isHistoricalOnly: Boolean = false, // true si proviene de historial gamificación sin minutos exactos
    val isNoHistoricalData: Boolean = false // true si es previo al inicio de la medición sin evidencia
)

/**
 * Resumen consolidado de actividad para un tester dentro del período observado.
 */
data class TesterSummary(
    val uid: String,
    val email: String,
    val displayName: String,
    val photoUrl: String? = null,
    val activeDaysCount: Int = 0,
    val inactiveDaysCount: Int = 0,
    val totalSeconds: Long = 0L,
    val formattedTotalTime: String = "0 min",
    val averageSecondsPerActiveDay: Long = 0L,
    val formattedAverage: String = "0 min",
    val lastActiveDate: String = "",
    val formattedLastActive: String = "Sin registro",
    val dailyItems: List<DailyActivityItem> = emptyList(),
    val historicalRecoveredDates: Set<String> = emptySet(),
    // Desglose APK/Web del período + histórico acumulado (totalTesterSeconds).
    val appPeriodSeconds: Long = 0L,
    val formattedAppPeriodTime: String = "0 min",
    val webPeriodSeconds: Long = 0L,
    val formattedWebPeriodTime: String = "0 min",
    val historicTotalSeconds: Long = 0L,
    val formattedHistoricTotalTime: String = "0 min",
    val formattedLastActiveDateTime: String = "Sin registro"
)

/**
 * Repositorio y Engine de Actividad de Testers en Prueba Cerrada.
 * - Registra tiempo activo en primer plano (foreground) exclusivamente para la APP.
 * - Acumula y sincroniza App/Web bajo el mismo UID técnico de Firebase Auth.
 * - Período de prueba configurable desde Panel Admin (Fecha Inicio / Fecha Fin).
 */
object TesterActivityRepository {

    private const val PREFS_NAME = "rastro_tester_activity_prefs"
    private const val DEFAULT_START_DATE = "2026-09-24"
    private const val DEFAULT_END_DATE = "2026-10-08"

    private val handler = Handler(Looper.getMainLooper())
    private var isTracking = false
    private var sessionStartTimeMs = 0L
    private var lastCheckpointTimeMs = 0L
    @Volatile
    private var isFlushInFlight = false

    // Ticker periódico cada 30 segundos mientras la app está en foreground
    private val periodicTicker = object : Runnable {
        override fun run() {
            if (!isTracking) return
            checkpointForegroundTime(forceFlush = false)
            handler.postDelayed(this, 30_000L)
        }
    }

    /**
     * Valida y retorna las credenciales reales del usuario autenticado.
     * Retorna null si es un usuario invitado, anónimo o con identificador local sin Auth.
     */
    private fun getAuthenticatedUser(): Pair<String, String?>? {
        val authUser = FirebaseAuth.getInstance().currentUser
        val user = UserManager.currentUser.value

        val uid = (authUser?.uid ?: user.uid).trim()
        val email = authUser?.email ?: user.email

        if (uid.isBlank() || uid == "guest" || uid == "local_student_1" || uid == "local_student_guest") {
            return null
        }
        if (authUser != null && authUser.isAnonymous) return null
        if (authUser == null && (!user.isAuthenticated || user.isAnonymous)) return null

        return uid to email
    }

    /**
     * Inicia la medición al pasar RASTRO al primer plano (foreground).
     */
    fun onForegroundStarted() {
        if (isTracking) return
        isTracking = true
        val now = System.currentTimeMillis()
        sessionStartTimeMs = now
        lastCheckpointTimeMs = now
        handler.removeCallbacks(periodicTicker)
        handler.postDelayed(periodicTicker, 30_000L)

        Log.d("TESTER_TRACKER", "TESTER_TRACKER foreground started")

        // Configuración segura de User ID en Firebase Analytics (UID únicamente, nunca correo)
        try {
            val authPair = getAuthenticatedUser()
            if (authPair != null) {
                val analytics = FirebaseAnalytics.getInstance(RastroApplication.instance)
                analytics.setUserId(authPair.first)
                analytics.setUserProperty("rastro_user_type", "closed_tester")
            }
        } catch (_: Exception) {}
    }

    /**
     * Detiene la medición al pasar a segundo plano (background).
     * Garantiza que el tiempo en background NO se contabilice jamás.
     */
    fun onForegroundStopped() {
        if (!isTracking) return
        isTracking = false
        handler.removeCallbacks(periodicTicker)
        checkpointForegroundTime(forceFlush = true)
        sessionStartTimeMs = 0L
        lastCheckpointTimeMs = 0L
        Log.d("TESTER_TRACKER", "TESTER_TRACKER foreground stopped")
    }

    /**
     * Acumula el intervalo de tiempo transcurrido en primer plano y persiste a Firestore si corresponde.
     */
    @Synchronized
    private fun checkpointForegroundTime(forceFlush: Boolean) {
        val now = System.currentTimeMillis()
        if (lastCheckpointTimeMs <= 0L) {
            lastCheckpointTimeMs = now
            return
        }

        val elapsedMs = now - lastCheckpointTimeMs
        val elapsedSeconds = elapsedMs / 1000L
        if (elapsedSeconds <= 0L) return

        lastCheckpointTimeMs = now

        val authPair = getAuthenticatedUser()
        val today = GamificationManager.getLocalDayString()

        if (authPair != null) {
            val (uid, email) = authPair
            val user = UserManager.currentUser.value
            val prefs = RastroApplication.instance.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

            // Contabilizar en SharedPreferences local para visualización instantánea
            val localKey = "daily_${uid}_$today"
            val currentLocal = prefs.getLong(localKey, 0L)
            prefs.edit().putLong(localKey, currentLocal + elapsedSeconds).apply()

            // Búfer acumulado para el flush
            val pendingKey = "pending_flush_${uid}_$today"
            val currentPending = prefs.getLong(pendingKey, 0L) + elapsedSeconds
            prefs.edit().putLong(pendingKey, currentPending).apply()

            Log.d("TESTER_TRACKER", "TESTER_TRACKER checkpoint uid=$uid elapsed=$elapsedSeconds pending=$currentPending forceFlush=$forceFlush")

            // Flush si acumula >=60s o si la app pasa a background (forceFlush)
            if ((forceFlush || currentPending >= 60L) && !isFlushInFlight) {
                flushSecondsToFirestore(uid, email, user.displayName, today, currentPending)
            }
        }
    }

    /**
     * Escritura atómica eficiente en Firestore usando FieldValue.increment.
     * Descuenta del búfer local ÚNICAMENTE tras confirmación de éxito en servidor.
     */
    @Synchronized
    private fun flushSecondsToFirestore(
        uid: String,
        email: String?,
        displayName: String?,
        date: String,
        secondsToSend: Long
    ) {
        if (secondsToSend <= 0L || isFlushInFlight) return
        isFlushInFlight = true

        Log.d("TESTER_TRACKER", "TESTER_TRACKER flush start uid=$uid seconds=$secondsToSend date=$date")

        try {
            val db = FirebaseFirestore.getInstance()
            val payload = mapOf(
                "uid" to uid,
                "email" to (email ?: ""),
                "displayName" to (displayName ?: "Estudiante"),
                "lastTesterActiveDate" to date,
                "lastTesterActiveTimestamp" to System.currentTimeMillis(),
                "testerDailySeconds.$date" to FieldValue.increment(secondsToSend),
                "testerDailyApp.$date" to FieldValue.increment(secondsToSend),
                "totalTesterSeconds" to FieldValue.increment(secondsToSend)
            )

            val docRef = db.collection("usuarios").document(uid)
            val subDocRef = db.collection("usuarios").document(uid)
                .collection("gamificacion").document("tester_activity")

            docRef.set(payload, SetOptions.merge())
                .addOnSuccessListener {
                    subDocRef.set(payload, SetOptions.merge())

                    // Descontar atómicamente los segundos confirmados del búfer local
                    val prefs = RastroApplication.instance.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                    val pendingKey = "pending_flush_${uid}_$date"
                    val currentPending = prefs.getLong(pendingKey, 0L)
                    val remaining = (currentPending - secondsToSend).coerceAtLeast(0L)
                    if (remaining > 0L) {
                        prefs.edit().putLong(pendingKey, remaining).apply()
                    } else {
                        prefs.edit().remove(pendingKey).apply()
                    }

                    isFlushInFlight = false
                    Log.d("TESTER_TRACKER", "TESTER_TRACKER flush SUCCESS uid=$uid seconds=$secondsToSend remainingPending=$remaining")
                }
                .addOnFailureListener { error ->
                    isFlushInFlight = false
                    Log.e("TESTER_TRACKER", "TESTER_TRACKER flush FAILURE uid=$uid seconds=$secondsToSend error=${error.localizedMessage}", error)
                }
        } catch (e: Exception) {
            isFlushInFlight = false
            Log.e("TESTER_TRACKER", "TESTER_TRACKER flush EXCEPTION uid=$uid seconds=$secondsToSend error=${e.localizedMessage}", e)
        }
    }

    /**
     * Guarda el período de prueba en Firestore (site_settings/global).
     */
    fun saveTesterPeriod(
        startDate: String,
        endDate: String,
        onComplete: (Result<Unit>) -> Unit = {}
    ) {
        try {
            FirebaseFirestore.getInstance().collection("site_settings").document("global")
                .set(
                    mapOf(
                        "testerPeriodStart" to startDate,
                        "testerPeriodEnd" to endDate
                    ),
                    SetOptions.merge()
                )
                .addOnSuccessListener { onComplete(Result.success(Unit)) }
                .addOnFailureListener { onComplete(Result.failure(it)) }
        } catch (e: Exception) {
            onComplete(Result.failure(e))
        }
    }

    /**
     * Escucha en tiempo real el período de prueba configurado por el Administrador.
     */
    fun observeTesterPeriod(
        onUpdate: (startDate: String, endDate: String) -> Unit
    ): ListenerRegistration {
        return FirebaseFirestore.getInstance().collection("site_settings").document("global")
            .addSnapshotListener { snapshot, _ ->
                val start = snapshot?.getString("testerPeriodStart") ?: DEFAULT_START_DATE
                val end = snapshot?.getString("testerPeriodEnd") ?: DEFAULT_END_DATE
                onUpdate(start, end)
            }
    }

    /**
     * Carga todos los usuarios y calcula las estadísticas de actividad dentro del período observado.
     * Unifica los mapas de `testerDailySeconds`, `testerDailyApp` y `testerDailyWeb`.
     */
    fun loadAllTestersActivity(
        startDate: String,
        endDate: String,
        onResult: (List<TesterSummary>) -> Unit
    ) {
        val db = FirebaseFirestore.getInstance()
        val today = GamificationManager.getLocalDayString()

        db.collection("usuarios").limit(200).get()
            .addOnSuccessListener { snapshot ->
                val summaries = snapshot.documents.map { doc ->
                    val uid = doc.id
                    val rawEmail = doc.getString("email").orEmpty().trim()
                    val email = if (rawEmail.isBlank() || rawEmail.equals("Sin correo", ignoreCase = true)) "Cuenta sin correo" else rawEmail
                    val displayName = doc.getString("displayName") ?: doc.getString("name") ?: "Tester"
                    val photoUrl = doc.getString("photoURL") ?: doc.getString("photoUrl")

                    // Extraer mapas de segundos diarios
                    @Suppress("UNCHECKED_CAST")
                    val rawDailyMap = doc.get("testerDailySeconds") as? Map<String, Any> ?: emptyMap()
                    @Suppress("UNCHECKED_CAST")
                    val rawAppMap = doc.get("testerDailyApp") as? Map<String, Any> ?: emptyMap()
                    @Suppress("UNCHECKED_CAST")
                    val rawWebMap = doc.get("testerDailyWeb") as? Map<String, Any> ?: emptyMap()

                    val appDailySeconds = rawAppMap.mapNotNull { (date, value) ->
                        val sec = (value as? Number)?.toLong() ?: return@mapNotNull null
                        date to sec
                    }.toMap()

                    val webDailySeconds = rawWebMap.mapNotNull { (date, value) ->
                        val sec = (value as? Number)?.toLong() ?: return@mapNotNull null
                        date to sec
                    }.toMap()

                    // ADMIN_ACTIVITY: diagnóstico temporal lectura Admin (NO borrar sin avisar).
                    Log.d("ADMIN_ACTIVITY", "ADMIN_ACTIVITY uid=$uid testerDailyApp RAW=$rawAppMap testerDailySeconds RAW=$rawDailyMap testerDailyWeb RAW=$rawWebMap totalTesterSeconds RAW=${doc.getLong("totalTesterSeconds")} lastTesterActiveDate RAW=${doc.getString("lastTesterActiveDate")} lastTesterActiveTimestamp RAW=${doc.getLong("lastTesterActiveTimestamp")} queryStart=$startDate queryEnd=$endDate")

                    // Unificar todas las fuentes de actividad
                    val allDates = (rawDailyMap.keys + rawAppMap.keys + rawWebMap.keys).distinct()
                    val dailySeconds = allDates.associateWith { date ->
                        val dSec = (rawDailyMap[date] as? Number)?.toLong() ?: 0L
                        val aSec = appDailySeconds[date] ?: 0L
                        val wSec = webDailySeconds[date] ?: 0L
                        maxOf(dSec, aSec + wSec)
                    }

                    // Extraer última fecha registrada + acumulados históricos
                    val lastActiveDate = doc.getString("lastTesterActiveDate")
                        ?: dailySeconds.keys.maxOrNull()
                        ?: ""
                    val historicTotalSeconds = doc.getLong("totalTesterSeconds") ?: 0L
                    val lastActiveTimestamp = doc.getLong("lastTesterActiveTimestamp") ?: 0L

                    buildTesterSummary(
                        uid = uid,
                        email = email,
                        displayName = displayName,
                        photoUrl = photoUrl,
                        dailySeconds = dailySeconds,
                        appDailySeconds = appDailySeconds,
                        webDailySeconds = webDailySeconds,
                        lastActiveDate = lastActiveDate,
                        startDate = startDate,
                        endDate = endDate,
                        today = today,
                        historicalDates = emptySet(),
                        trackingStartDate = startDate,
                        historicTotalSeconds = historicTotalSeconds,
                        lastActiveTimestamp = lastActiveTimestamp
                    )
                }

                // Ordenar por días activos descendente y luego tiempo total
                val sorted = summaries.sortedWith(
                    compareByDescending<TesterSummary> { it.activeDaysCount }
                        .thenByDescending { it.totalSeconds }
                )
                onResult(sorted)
            }
            .addOnFailureListener {
                onResult(emptyList())
            }
    }

    /**
     * Carga el detalle profundo de un tester individual, incluyendo posible histórico de gamificación previa.
     */
    fun loadTesterDetail(
        uid: String,
        email: String,
        displayName: String,
        photoUrl: String?,
        startDate: String,
        endDate: String,
        onResult: (TesterSummary) -> Unit
    ) {
        val db = FirebaseFirestore.getInstance()
        val today = GamificationManager.getLocalDayString()

        // 1. Obtener documento principal del usuario
        db.collection("usuarios").document(uid).get()
            .addOnSuccessListener { userDoc ->
                val rawEmail = userDoc.getString("email").orEmpty().ifBlank { email }.trim()
                val cleanEmail = if (rawEmail.isBlank() || rawEmail.equals("Sin correo", ignoreCase = true)) "Cuenta sin correo" else rawEmail

                @Suppress("UNCHECKED_CAST")
                val rawDailyMap = userDoc.get("testerDailySeconds") as? Map<String, Any> ?: emptyMap()
                @Suppress("UNCHECKED_CAST")
                val rawAppMap = userDoc.get("testerDailyApp") as? Map<String, Any> ?: emptyMap()
                @Suppress("UNCHECKED_CAST")
                val rawWebMap = userDoc.get("testerDailyWeb") as? Map<String, Any> ?: emptyMap()

                val appDailySeconds = rawAppMap.mapNotNull { (date, value) ->
                    val sec = (value as? Number)?.toLong() ?: return@mapNotNull null
                    date to sec
                }.toMap()

                val webDailySeconds = rawWebMap.mapNotNull { (date, value) ->
                    val sec = (value as? Number)?.toLong() ?: return@mapNotNull null
                    date to sec
                }.toMap()

                val allDates = (rawDailyMap.keys + rawAppMap.keys + rawWebMap.keys).distinct()
                val dailySeconds = allDates.associateWith { date ->
                    val dSec = (rawDailyMap[date] as? Number)?.toLong() ?: 0L
                    val aSec = appDailySeconds[date] ?: 0L
                    val wSec = webDailySeconds[date] ?: 0L
                    maxOf(dSec, aSec + wSec)
                }

                val lastActiveDate = userDoc.getString("lastTesterActiveDate") ?: ""
                val historicTotalSeconds = userDoc.getLong("totalTesterSeconds") ?: 0L
                val lastActiveTimestamp = userDoc.getLong("lastTesterActiveTimestamp") ?: 0L

                // 2. Intentar recuperar histórico anterior de usuarios/{uid}/gamificacion/rastro_progress
                db.collection("usuarios").document(uid)
                    .collection("gamificacion").document("rastro_progress").get()
                    .addOnSuccessListener { gamDoc ->
                        val historicalDates = mutableSetOf<String>()
                        if (gamDoc.exists()) {
                            @Suppress("UNCHECKED_CAST")
                            val activityDatesList = gamDoc.get("activityDates") as? List<String>
                            if (activityDatesList != null) {
                                historicalDates.addAll(activityDatesList)
                            }
                        }

                        val summary = buildTesterSummary(
                            uid = uid,
                            email = cleanEmail,
                            displayName = displayName,
                            photoUrl = photoUrl,
                            dailySeconds = dailySeconds,
                            appDailySeconds = appDailySeconds,
                            webDailySeconds = webDailySeconds,
                            lastActiveDate = lastActiveDate,
                            startDate = startDate,
                            endDate = endDate,
                            today = today,
                            historicalDates = historicalDates,
                            trackingStartDate = startDate,
                            historicTotalSeconds = historicTotalSeconds,
                            lastActiveTimestamp = lastActiveTimestamp
                        )
                        onResult(summary)
                    }
                    .addOnFailureListener {
                        val summary = buildTesterSummary(
                            uid = uid,
                            email = cleanEmail,
                            displayName = displayName,
                            photoUrl = photoUrl,
                            dailySeconds = dailySeconds,
                            appDailySeconds = appDailySeconds,
                            webDailySeconds = webDailySeconds,
                            lastActiveDate = lastActiveDate,
                            startDate = startDate,
                            endDate = endDate,
                            today = today,
                            historicalDates = emptySet(),
                            trackingStartDate = startDate
                        )
                        onResult(summary)
                    }
            }
            .addOnFailureListener {
                val cleanEmail = if (email.isBlank() || email.equals("Sin correo", ignoreCase = true)) "Cuenta sin correo" else email
                onResult(
                    buildTesterSummary(
                        uid = uid,
                        email = cleanEmail,
                        displayName = displayName,
                        photoUrl = photoUrl,
                        dailySeconds = emptyMap(),
                        appDailySeconds = emptyMap(),
                        webDailySeconds = emptyMap(),
                        lastActiveDate = "",
                        startDate = startDate,
                        endDate = endDate,
                        today = today,
                        historicalDates = emptySet(),
                        trackingStartDate = startDate
                    )
                )
            }
    }

    /**
     * Construye las estadísticas del tester dentro del período observado.
     * Respeta escrupulosamente los casos de prueba e histórico:
     * - Distingue entre 'Activo', 'Sin actividad', 'Activo (Histórico)' y 'Sin datos históricos'.
     * - Días futuros NO se evalúan.
     * - El promedio se calcula únicamente entre días activos.
     */
    fun buildTesterSummary(
        uid: String,
        email: String,
        displayName: String,
        photoUrl: String?,
        dailySeconds: Map<String, Long>,
        appDailySeconds: Map<String, Long> = emptyMap(),
        webDailySeconds: Map<String, Long> = emptyMap(),
        lastActiveDate: String,
        startDate: String,
        endDate: String,
        today: String = GamificationManager.getLocalDayString(),
        historicalDates: Set<String> = emptySet(),
        trackingStartDate: String = "2026-09-24",
        historicTotalSeconds: Long = 0L,
        lastActiveTimestamp: Long = 0L
    ): TesterSummary {
        val effectiveEnd = if (today < endDate) today else endDate
        val observedDates = getDaysBetween(startDate, effectiveEnd)

        var activeCount = 0
        var totalSecs = 0L
        var appPeriodSecs = 0L
        var webPeriodSecs = 0L
        var latestActiveDate = lastActiveDate

        val dailyItems = observedDates.map { date ->
            val recordedSeconds = dailySeconds[date] ?: 0L
            val appSecs = appDailySeconds[date] ?: 0L
            val webSecs = webDailySeconds[date] ?: 0L

            val isHistorical = historicalDates.contains(date) && recordedSeconds == 0L
            val isBeforeStart = date < trackingStartDate && !isHistorical && recordedSeconds == 0L
            val isActive = recordedSeconds > 0L || isHistorical

            if (isActive) {
                activeCount++
                totalSecs += recordedSeconds
                appPeriodSecs += appSecs
                webPeriodSecs += webSecs
                if (date > latestActiveDate) {
                    latestActiveDate = date
                }
            }

            val timeDisplay = when {
                recordedSeconds > 0L -> {
                    val totalStr = formatDuration(recordedSeconds)
                    val details = mutableListOf<String>()
                    if (appSecs > 0L) details.add("App: ${formatDuration(appSecs)}")
                    if (webSecs > 0L) details.add("Web: ${formatDuration(webSecs)}")
                    if (details.isNotEmpty()) "$totalStr (${details.joinToString(" · ")})" else totalStr
                }
                isHistorical -> "Activo · tiempo histórico no disponible"
                isBeforeStart -> "Sin datos históricos"
                else -> "Sin actividad"
            }

            DailyActivityItem(
                date = date,
                formattedDate = formatDateShort(date),
                activeSeconds = recordedSeconds,
                appSeconds = appSecs,
                webSeconds = webSecs,
                formattedTime = timeDisplay,
                isActive = isActive,
                isHistoricalOnly = isHistorical,
                isNoHistoricalData = isBeforeStart
            )
        }

        val inactiveCount = (observedDates.size - activeCount).coerceAtLeast(0)
        val avgSecs = if (activeCount > 0) totalSecs / activeCount else 0L

        // ADMIN_ACTIVITY: diagnóstico temporal cálculo Admin (NO borrar sin avisar).
        Log.d("ADMIN_ACTIVITY", "ADMIN_ACTIVITY uid=$uid observedDates=$observedDates appPeriodSeconds=$appPeriodSecs webPeriodSeconds=$webPeriodSecs totalPeriodSeconds=$totalSecs historicSeconds=$historicTotalSeconds activeDays=$activeCount")

        val cleanEmail = if (email.isBlank() || email.equals("Sin correo", ignoreCase = true)) "Cuenta sin correo" else email

        return TesterSummary(
            uid = uid,
            email = cleanEmail,
            displayName = displayName,
            photoUrl = photoUrl,
            activeDaysCount = activeCount,
            inactiveDaysCount = inactiveCount,
            totalSeconds = totalSecs,
            formattedTotalTime = formatDuration(totalSecs),
            averageSecondsPerActiveDay = avgSecs,
            formattedAverage = formatAverageMinutesAndSeconds(avgSecs),
            lastActiveDate = latestActiveDate,
            formattedLastActive = if (latestActiveDate.isNotBlank()) formatDateShort(latestActiveDate) else "Sin actividad",
            appPeriodSeconds = appPeriodSecs,
            formattedAppPeriodTime = formatDuration(appPeriodSecs),
            webPeriodSeconds = webPeriodSecs,
            formattedWebPeriodTime = formatDuration(webPeriodSecs),
            historicTotalSeconds = historicTotalSeconds,
            formattedHistoricTotalTime = formatDuration(historicTotalSeconds),
            formattedLastActiveDateTime = formatLastActiveDateTime(lastActiveTimestamp, today),
            dailyItems = dailyItems,
            historicalRecoveredDates = historicalDates
        )
    }

    /**
     * Genera la lista de fechas consecutivas YYYY-MM-DD entre startStr y endStr inclusive.
     */
    fun getDaysBetween(startStr: String, endStr: String): List<String> {
        return runCatching {
            val start = LocalDate.parse(startStr)
            val end = LocalDate.parse(endStr)
            if (start.toEpochDays() > end.toEpochDays()) return emptyList()
            (start.toEpochDays()..end.toEpochDays()).map { epochDay ->
                LocalDate.fromEpochDays(epochDay).toString()
            }
        }.getOrDefault(emptyList())
    }

    /**
     * Formatea última actividad como "Hoy 14:32" si es hoy, o "24 sep. 14:32".
     * Usa lastTesterActiveTimestamp (millis, hora local del dispositivo).
     */
    fun formatLastActiveDateTime(timestampMillis: Long, today: String): String {
        if (timestampMillis <= 0L) return "Sin registro"
        return runCatching {
            val cal = java.util.Calendar.getInstance()
            cal.timeInMillis = timestampMillis
            val hh = cal.get(java.util.Calendar.HOUR_OF_DAY).toString().padStart(2, '0')
            val mm = cal.get(java.util.Calendar.MINUTE).toString().padStart(2, '0')
            val y = cal.get(java.util.Calendar.YEAR)
            val mo = (cal.get(java.util.Calendar.MONTH) + 1).toString().padStart(2, '0')
            val d = cal.get(java.util.Calendar.DAY_OF_MONTH).toString().padStart(2, '0')
            val dateStr = "$y-$mo-$d"
            if (dateStr == today) "Hoy $hh:$mm" else "${formatDateShort(dateStr)} $hh:$mm"
        }.getOrDefault("Sin registro")
    }

    /**
     * Formatea fecha YYYY-MM-DD a formato legible: ej "24 sep." o "01 oct."
     */
    fun formatDateShort(dateStr: String): String {
        return runCatching {
            val date = LocalDate.parse(dateStr)
            val day = date.dayOfMonth.toString().padStart(2, '0')
            val month = when (date.monthNumber) {
                1 -> "ene."
                2 -> "feb."
                3 -> "mar."
                4 -> "abr."
                5 -> "may."
                6 -> "jun."
                7 -> "jul."
                8 -> "ago."
                9 -> "sep."
                10 -> "oct."
                11 -> "nov."
                12 -> "dic."
                else -> ""
            }
            "$day $month"
        }.getOrDefault(dateStr)
    }

    /**
     * Formatea duración total a minutos / horas (ej: "47 min", "1h 12m", "0 min").
     */
    fun formatDuration(seconds: Long): String {
        if (seconds <= 0L) return "0 min"
        val minutes = seconds / 60L
        if (minutes < 60L) {
            val s = seconds % 60L
            return if (minutes == 0L) "${s} s" else "${minutes} min"
        }
        val hours = minutes / 60L
        val remMinutes = minutes % 60L
        return if (remMinutes > 0L) "${hours}h ${remMinutes}m" else "${hours}h"
    }

    /**
     * Formatea promedio exacto por día activo a minutos y segundos (ej: "9 min 24 s").
     */
    fun formatAverageMinutesAndSeconds(seconds: Long): String {
        if (seconds <= 0L) return "0 min"
        val mins = seconds / 60L
        val secs = seconds % 60L
        return when {
            mins > 0L && secs > 0L -> "${mins} min ${secs} s"
            mins > 0L -> "${mins} min"
            else -> "${secs} s"
        }
    }
}
