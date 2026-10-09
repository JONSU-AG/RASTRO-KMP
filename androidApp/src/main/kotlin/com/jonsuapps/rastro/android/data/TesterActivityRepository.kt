package com.jonsuapps.rastro.android.data

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.android.RastroApplication
import java.time.LocalDate
import java.util.UUID

/** Existing daily activity record: foreground only; persistent queue and idempotent sync. */
object TesterActivityRepository {
    private const val PREFS_NAME = "rastro_tester_activity_prefs"
    private val handler = Handler(Looper.getMainLooper())
    private val prefs get() = RastroApplication.instance.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    private var tracking = false
    private var trackedUid: String? = null
    private var checkpointElapsed = 0L
    private var flushing = false
    private var authListener: FirebaseAuth.AuthStateListener? = null
    private fun authenticatedUid() = FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }?.uid
    private val ticker = object : Runnable {
        override fun run() {
            if (!tracking) return
            checkpoint(false)
            handler.postDelayed(this, 30_000L)
        }
    }
    fun onForegroundStarted() {
        if (tracking) return
        tracking = true
        checkpointElapsed = SystemClock.elapsedRealtime()
        trackedUid = authenticatedUid()
        if (authListener == null) {
            authListener = FirebaseAuth.AuthStateListener {
                val newUid = authenticatedUid()
                if (trackedUid != newUid) {
                    if (tracking) checkpoint(false)
                    trackedUid = newUid
                    checkpointElapsed = SystemClock.elapsedRealtime()
                    if (tracking && newUid != null) { migratePending(newUid); recordOpening(newUid) }
                }
            }.also { FirebaseAuth.getInstance().addAuthStateListener(it) }
        }
        trackedUid?.let { migratePending(it); recordOpening(it) }
        // Preserve the existing Analytics identity setup; attendance does not read Analytics.
        try {
            trackedUid?.let { uid ->
                val analytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(RastroApplication.instance)
                analytics.setUserId(uid)
                analytics.setUserProperty("rastro_user_type", "closed_tester")
            }
        } catch (_: Exception) {}
        handler.removeCallbacks(ticker)
        handler.postDelayed(ticker, 30_000L)
    }
    fun onForegroundStopped() {
        if (!tracking) return
        checkpoint(true)
        tracking = false
        handler.removeCallbacks(ticker)
    }
    private fun recordOpening(uid: String) {
        val now = System.currentTimeMillis()
        val day = DailyActivityMath.dateAt(now)
        prefs.edit().putBoolean("opened_${uid}_$day", true).putLong("opened_at_${uid}_$day", now).putLong("active_at_${uid}_$day", now).commit()
        if (!prefs.getBoolean("reported_open_${uid}_$day", false)) flush(uid, force = true)
    }
    private fun migratePending(uid: String) {
        val prefix = "pending_flush_${uid}_"
        val edit = prefs.edit()
        prefs.all.filterKeys { it.startsWith(prefix) }.forEach { (key, value) ->
            val date = key.removePrefix(prefix)
            if (runCatching { LocalDate.parse(date) }.isSuccess) {
                val seconds = (value as? Number)?.toLong() ?: 0
                edit.putLong("pending_ms_${uid}_$date", prefs.getLong("pending_ms_${uid}_$date", 0) + seconds * 1000)
                    .putBoolean("opened_${uid}_$date", true).remove(key)
            }
        }
        edit.commit()
    }
    private fun checkpoint(force: Boolean) {
        val elapsed = SystemClock.elapsedRealtime()
        val duration = (elapsed - checkpointElapsed).coerceAtLeast(0)
        checkpointElapsed = elapsed
        val uid = trackedUid ?: return
        val now = System.currentTimeMillis()
        DailyActivityMath.splitInterval(now, duration).forEach { (date, millis) ->
            val key = "pending_ms_${uid}_$date"
            val edit = prefs.edit().putLong(key, prefs.getLong(key, 0) + millis)
            val dateEnd = LocalDate.parse(date).plusDays(1).atStartOfDay(java.time.ZoneId.systemDefault()).toInstant().toEpochMilli() - 1
            val activeAt = minOf(now, dateEnd)
            if (!prefs.contains("opened_${uid}_$date") && !prefs.getBoolean("reported_open_${uid}_$date", false)) edit.putBoolean("opened_${uid}_$date", true).putLong("opened_at_${uid}_$date", activeAt)
            edit.putLong("active_at_${uid}_$date", activeAt).commit()
        }
        // Do not write another account's pending data after an Auth switch.
        if (uid == authenticatedUid()) flush(uid, force = false)
    }
    private fun flush(uid: String, force: Boolean) {
        if (flushing || uid != authenticatedUid()) return
        val batchPrefix = "batch_${uid}_"
        var token = prefs.getString(batchPrefix + "token", null)
        var date = prefs.getString(batchPrefix + "date", null)
        var seconds = prefs.getLong(batchPrefix + "seconds", 0)
        var activeAt = prefs.getLong(batchPrefix + "at", 0)
        if (token == null || date == null) {
            val prefix = "opened_${uid}_"
            date = prefs.all.keys.filter { it.startsWith(prefix) }.map { it.removePrefix(prefix) }
                .filter { runCatching { LocalDate.parse(it) }.isSuccess }
                .sorted().firstOrNull { day ->
                    val ms = prefs.getLong("pending_ms_${uid}_$day", 0)
                    prefs.getBoolean("opened_${uid}_$day", false) || ((force || day < LocalDate.now().toString()) && ms >= 1000) || ms >= 15 * 60_000
                } ?: return
            seconds = prefs.getLong("pending_ms_${uid}_$date", 0) / 1000
            activeAt = prefs.getLong("active_at_${uid}_$date", System.currentTimeMillis())
            token = UUID.randomUUID().toString()
            // Journal before sending. A process restart reuses this token instead of duplicating increments.
            prefs.edit().putString(batchPrefix + "token", token).putString(batchPrefix + "date", date)
                .putLong(batchPrefix + "seconds", seconds).putLong(batchPrefix + "at", activeAt).commit()
        }
        val batchDate = date!!
        val batchToken = token!!
        val batchSeconds = seconds
        val batchAt = activeAt
        val device = prefs.getString("device_id", null) ?: UUID.randomUUID().toString().also { prefs.edit().putString("device_id", it).commit() }
        flushing = true
        val db = FirebaseFirestore.getInstance()
        val ref = db.collection("usuarios").document(uid)
        db.runTransaction { tx ->
            val doc = tx.get(ref)
            val receipts = doc.get("testerSyncReceipts") as? Map<*, *>
            if (receipts?.get(device) != batchToken) {
                val payload = mutableMapOf<String, Any>(
                    "testerDailySeconds" to mapOf(batchDate to FieldValue.increment(batchSeconds)),
                    "testerDailyApp" to mapOf(batchDate to FieldValue.increment(batchSeconds)),
                    "totalTesterSeconds" to FieldValue.increment(batchSeconds),
                    "testerSyncReceipts" to mapOf(device to batchToken))
                if (batchAt >= (doc.getLong("lastTesterActiveTimestamp") ?: 0L)) {
                    payload["lastTesterActiveDate"] = batchDate
                    payload["lastTesterActiveTimestamp"] = batchAt
                }
                tx.set(ref, payload, SetOptions.merge())
            }
        }.addOnSuccessListener {
            val key = "pending_ms_${uid}_$batchDate"
            prefs.edit().putBoolean("reported_open_${uid}_$batchDate", true).apply()
            val remaining = (prefs.getLong(key, 0) - batchSeconds * 1000).coerceAtLeast(0)
            prefs.edit().putLong(key, remaining).putBoolean("opened_${uid}_$batchDate", prefs.getLong("opened_at_${uid}_$batchDate", 0) > batchAt)
                .remove(batchPrefix + "token").remove(batchPrefix + "date").remove(batchPrefix + "seconds").remove(batchPrefix + "at").commit()
            flushing = false
            // Drain old-day/account buffers as well, not only today's pending seconds.
            authenticatedUid()?.let { flush(it, force = !tracking) }
        }.addOnFailureListener {
            flushing = false
            Log.w("TESTER_TRACKER", "No se sincronizó actividad; se conserva el lote para reintentar.", it)
        }
    }
    fun saveTesterPeriod(startDate: String, endDate: String, onComplete: (Result<Unit>) -> Unit = {}) {
        if (!DailyActivityMath.validRange(startDate, endDate)) return onComplete(Result.failure(IllegalArgumentException("Rango de fechas inválido")))
        FirebaseFirestore.getInstance().collection("site_settings").document("global")
            .set(mapOf("testerPeriodStart" to startDate, "testerPeriodEnd" to endDate), SetOptions.merge())
            .addOnSuccessListener { onComplete(Result.success(Unit)) }.addOnFailureListener { onComplete(Result.failure(it)) }
    }
    fun observeTesterPeriod(onUpdate: (String, String) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("site_settings").document("global").addSnapshotListener { snapshot, _ ->
            val today = LocalDate.now()
            val start = snapshot?.getString("testerPeriodStart") ?: today.minusDays(29).toString()
            val end = snapshot?.getString("testerPeriodEnd") ?: today.toString()
            onUpdate(start, end)
        }
    private fun fromDocument(doc: com.google.firebase.firestore.DocumentSnapshot, start: String, end: String): TesterSummary =
        DailyActivityMath.summary(doc.id, doc.getString("email").orEmpty(), doc.getString("displayName") ?: doc.getString("name") ?: "Estudiante",
            doc.getString("photoURL") ?: doc.getString("photoUrl"), doc.data.orEmpty(), start, end, LocalDate.now().toString())

    fun loadAllTestersActivity(startDate: String, endDate: String,
        onError: (String) -> Unit = {}, onResult: (List<TesterSummary>) -> Unit) {
        if (!DailyActivityMath.validRange(startDate, endDate)) return onError("Selecciona una fecha inicial anterior o igual a la final.")
        val users = mutableListOf<TesterSummary>()
        val collection = FirebaseFirestore.getInstance().collection("usuarios")
        fun page(after: com.google.firebase.firestore.DocumentSnapshot?) {
            val query = collection.orderBy(com.google.firebase.firestore.FieldPath.documentId()).limit(100)
            (if (after == null) query else query.startAfter(after)).get(com.google.firebase.firestore.Source.SERVER)
                .addOnSuccessListener { snapshot ->
                    users += snapshot.documents.map { fromDocument(it, startDate, endDate) }
                    if (snapshot.size() == 100) page(snapshot.documents.last())
                    else onResult(users.sortedWith(compareByDescending<TesterSummary> { it.activeDaysCount }.thenBy { it.displayName }))
                }.addOnFailureListener { onError("No se pudo cargar la actividad. Comprueba la conexión y vuelve a intentar.") }
        }
        page(null)
    }
    fun loadTesterDetail(uid: String, email: String, displayName: String, photoUrl: String?, startDate: String, endDate: String,
        onError: (String) -> Unit = {}, onResult: (TesterSummary) -> Unit) {
        FirebaseFirestore.getInstance().collection("usuarios").document(uid).get(com.google.firebase.firestore.Source.SERVER)
            .addOnSuccessListener { onResult(fromDocument(it, startDate, endDate)) }
            .addOnFailureListener { onError("No se pudo cargar el detalle. Inténtalo de nuevo.") }
    }
    fun getDaysBetween(startStr: String, endStr: String) = DailyActivityMath.dates(startStr, endStr)
    fun formatDateShort(dateStr: String) = DailyActivityMath.shortDate(dateStr)

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
