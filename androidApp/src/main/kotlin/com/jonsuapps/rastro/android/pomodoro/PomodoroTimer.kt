package com.jonsuapps.rastro.android.pomodoro

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.PowerManager
import android.os.SystemClock
import android.provider.Settings
import androidx.compose.runtime.mutableStateOf
import androidx.core.app.NotificationCompat
import com.jonsuapps.rastro.android.MainActivity
import com.jonsuapps.rastro.pomodoro.*
import org.json.JSONObject

/** Un propietario para UI y alarma. Las escrituras ocurren al actuar o cambiar de bloque, no cada segundo. */
class PomodoroTimer private constructor(private val context: Context) {
    private val prefs = context.getSharedPreferences("rastro_pomodoro", Context.MODE_PRIVATE)
    private val alarm = context.getSystemService(AlarmManager::class.java)
    private var deadline = prefs.getLong("deadline_elapsed", 0L)
    private val observable = mutableStateOf(restore())
    var state: PomodoroState
        get() = observable.value
        set(value) {
            val previous = observable.value
            // Cambiar volumen, vista o duración de otro bloque no reinicia el reloj activo.
            val edit = PomodoroClock.edit(previous, value, deadline, SystemClock.elapsedRealtime())
            deadline = edit.deadlineMillis
            observable.value = edit.state
            persist()
            schedule()
        }

    fun exactAlarmsAllowed(): Boolean = Build.VERSION.SDK_INT < 31 || alarm.canScheduleExactAlarms()

    fun refresh() {
        if (!state.isRunning) return
        val remaining = PomodoroClock.remainingSeconds(deadline, SystemClock.elapsedRealtime())
        if (remaining > 0) {
            observable.value = state.copy(timeLeftSeconds = remaining)
            return
        }
        val finished = state
        val next = PomodoroClock.completed(finished)
        deadline = if (next.isRunning) SystemClock.elapsedRealtime() + next.timeLeftSeconds * 1000L else 0L
        observable.value = next
        // Consumir el bloque antes de avisar: UI y receiver no pueden concederlo dos veces.
        persist()
        schedule()
        notifyFinished(finished)
    }

    fun schedule() {
        val pending = PendingIntent.getBroadcast(context, REQUEST, Intent(context, PomodoroAlarmReceiver::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
        alarm.cancel(pending)
        if (!state.isRunning) return
        val remaining = (deadline - SystemClock.elapsedRealtime()).coerceAtLeast(1L)
        try {
            if (exactAlarmsAllowed()) {
                // Alarma de temporizador visible para Android; también funciona con descansos cortos en Doze.
                alarm.setAlarmClock(AlarmManager.AlarmClockInfo(System.currentTimeMillis() + remaining, openIntent()), pending)
            } else {
                alarm.setAndAllowWhileIdle(AlarmManager.ELAPSED_REALTIME_WAKEUP, deadline, pending)
            }
        } catch (_: SecurityException) {
            alarm.setAndAllowWhileIdle(AlarmManager.ELAPSED_REALTIME_WAKEUP, deadline, pending)
        }
    }

    private fun openIntent() = PendingIntent.getActivity(context, REQUEST,
        Intent(context, MainActivity::class.java), PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)

    private fun notifyFinished(finished: PomodoroState) {
        val notifications = context.getSystemService(NotificationManager::class.java)
        notifications.createNotificationChannel(NotificationChannel(CHANNEL, "Pomodoro", NotificationManager.IMPORTANCE_DEFAULT).apply {
            description = "Fin de los bloques de estudio y descanso"
            setSound(null, null) // El tono elegido se reproduce una sola vez, abajo.
        })
        try {
            notifications.notify(REQUEST, NotificationCompat.Builder(context, CHANNEL)
                .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                .setContentTitle("Pomodoro: bloque completado")
                .setContentText("Terminó ${finished.mode.title.lowercase()}. ${if (state.isRunning) "Comienza ${state.mode.title.lowercase()}." else "Puedes iniciar el siguiente bloque."}")
                .setContentIntent(openIntent()).setAutoCancel(true).build())
        } catch (_: SecurityException) { /* El usuario puede denegar notificaciones. */ }
        if (!finished.soundEnabled || finished.alertSound() == PomodoroAlertSound.SILENT) return
        // Respetar No molestar; no solicitar acceso para saltarlo.
        if (notifications.currentInterruptionFilter == NotificationManager.INTERRUPTION_FILTER_NONE ||
            notifications.currentInterruptionFilter == NotificationManager.INTERRUPTION_FILTER_PRIORITY) return
        val tone = runCatching { ToneGenerator(AudioManager.STREAM_ALARM, 75) }.getOrNull() ?: return
        val wakeLock = context.getSystemService(PowerManager::class.java)
            .newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "rastro:PomodoroTone")
        wakeLock.acquire(2500L)
        try {
            tone.startTone(when (finished.alertSound()) {
                PomodoroAlertSound.BEEP -> ToneGenerator.TONE_PROP_BEEP
                PomodoroAlertSound.DOUBLE_BEEP -> ToneGenerator.TONE_PROP_BEEP2
                else -> ToneGenerator.TONE_PROP_ACK
            }, 700)
            Handler(Looper.getMainLooper()).postDelayed({
                tone.release()
                if (wakeLock.isHeld) wakeLock.release()
            }, 1000L)
        } catch (_: RuntimeException) {
            tone.release()
            if (wakeLock.isHeld) wakeLock.release()
        }
    }

    private fun bootCount() = Settings.Global.getInt(context.contentResolver, Settings.Global.BOOT_COUNT, -1)

    private fun restore(): PomodoroState {
        val study = prefs.getInt("study_minutes", 25).coerceIn(1, 120)
        val saved = runCatching { JSONObject(prefs.getString("runtime", "{}") ?: "{}") }.getOrDefault(JSONObject())
        fun sound(key: String, fallback: PomodoroAlertSound) = PomodoroAlertSound.values().firstOrNull {
            it.id == prefs.getString(key, fallback.id)
        } ?: fallback
        // Un reinicio cancela las alarmas del sistema: conservar tiempo, pero dejarlo pausado.
        val running = saved.optBoolean("running") && prefs.getInt("boot_count", -2) == bootCount() && deadline > 0L
        return PomodoroState(
            mode = PomodoroMode.values().firstOrNull { it.id == saved.optString("mode") } ?: PomodoroMode.STUDY,
            timeLeftSeconds = saved.optInt("seconds", study * 60).coerceAtLeast(0), isRunning = running,
            completedCycles = saved.optInt("cycles").coerceAtLeast(0),
            todayStudiedMinutes = if (saved.optString("day") == today()) saved.optInt("minutes").coerceAtLeast(0) else 0,
            customStudyMinutes = study,
            customShortBreakMinutes = prefs.getInt("short_break_minutes", 5).coerceIn(1, 120),
            customLongBreakMinutes = prefs.getInt("long_break_minutes", 15).coerceIn(1, 120),
            customCyclesBeforeLongBreak = prefs.getInt("cycles_before_long", 4).coerceIn(1, 12),
            autoCycle = prefs.getBoolean("auto_cycle", true), soundEnabled = prefs.getBoolean("sound_enabled", true),
            studyAlertSound = sound("study_alert", PomodoroAlertSound.BEEP),
            shortBreakAlertSound = sound("short_break_alert", PomodoroAlertSound.CONFIRM),
            longBreakAlertSound = sound("long_break_alert", PomodoroAlertSound.DOUBLE_BEEP),
            viewState = if (running) PomodoroViewState.MINI_PILL else PomodoroViewState.HIDDEN
        )
    }

    private fun today() = java.time.LocalDate.now().toString()

    private fun persist() {
        val s = state
        val runtime = JSONObject().put("mode", s.mode.id).put("seconds", s.timeLeftSeconds)
            .put("running", s.isRunning).put("cycles", s.completedCycles)
            .put("minutes", s.todayStudiedMinutes).put("day", today())
        prefs.edit().putString("runtime", runtime.toString()).putLong("deadline_elapsed", deadline)
            .putInt("boot_count", bootCount()).putInt("study_minutes", s.customStudyMinutes)
            .putInt("short_break_minutes", s.customShortBreakMinutes).putInt("long_break_minutes", s.customLongBreakMinutes)
            .putInt("cycles_before_long", s.customCyclesBeforeLongBreak).putBoolean("auto_cycle", s.autoCycle)
            .putBoolean("sound_enabled", s.soundEnabled).putString("study_alert", s.studyAlertSound.id)
            .putString("short_break_alert", s.shortBreakAlertSound.id).putString("long_break_alert", s.longBreakAlertSound.id)
            .commit()
    }

    companion object {
        private const val REQUEST = 4307
        private const val CHANNEL = "pomodoro_completion"
        @Volatile private var instance: PomodoroTimer? = null
        fun get(context: Context): PomodoroTimer = instance ?: synchronized(this) {
            instance ?: PomodoroTimer(context.applicationContext).also { instance = it }
        }
    }
}

class PomodoroAlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val pending = goAsync()
        try {
            val timer = PomodoroTimer.get(context)
            timer.refresh()
            timer.schedule()
            // Mantener vivo el receiver hasta liberar el tono corto.
            Handler(Looper.getMainLooper()).postDelayed({ pending.finish() }, 1200L)
        } catch (error: RuntimeException) {
            android.util.Log.e("Pomodoro", "No se pudo procesar la alarma", error)
            pending.finish()
        }
    }
}
