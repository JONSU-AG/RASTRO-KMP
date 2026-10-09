package com.jonsuapps.rastro.android.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.jonsuapps.rastro.android.MainActivity
import java.util.Calendar
import java.util.TimeZone

/**
 * Worker programado con WorkManager para notificaciones en ventanas de hora de Lima (UTC-5)
 * Cumple estrictamente con las políticas de Google Play (no requiere permiso exacto de alarma).
 * Los emojis solo están permitidos en los textos de notificaciones del sistema (§5 y §7 del mapa).
 */
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class LimaStudyReminderWorker(
    private val context: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    companion object {
        const val CHANNEL_ID = "rastro_estudio_notificaciones"
        const val CHANNEL_NAME = "Recordatorios de Estudio RASTRO"
        const val NOTIFICATION_ID = 1001
        const val WORK_NAME = "rastro_lima_study_reminders"

        fun createNotificationChannel(context: Context) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val channel = NotificationChannel(
                    CHANNEL_ID,
                    CHANNEL_NAME,
                    NotificationManager.IMPORTANCE_DEFAULT
                ).apply {
                    description = "Alertas de racha diaria y repaso preuniversitario"
                }
                val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager.createNotificationChannel(channel)
            }
        }

        fun enqueuePeriodicWork(context: Context) {
            createNotificationChannel(context)
            val workRequest = PeriodicWorkRequestBuilder<LimaStudyReminderWorker>(3, TimeUnit.HOURS)
                .build()
            WorkManager.getInstance(context).enqueueUniquePeriodicWork(
                WORK_NAME,
                ExistingPeriodicWorkPolicy.KEEP,
                workRequest
            )
        }
    }

    override suspend fun doWork(): Result {
        com.jonsuapps.rastro.android.logo.RastroLogoManager.refreshLauncherInBackground(context)
        val limaCalendar = Calendar.getInstance(TimeZone.getTimeZone("America/Lima"))
        val currentHour = limaCalendar.get(Calendar.HOUR_OF_DAY)

        val zone = java.time.ZoneId.of("America/Lima")
        val today = java.time.LocalDate.now(zone)
        val uid = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.uid.orEmpty()
        val state = com.jonsuapps.rastro.android.data.GamificationRepository.loadLocal(uid)
        val completedToday = state?.completedLessons?.values?.any {
            !it.skipped && java.time.Instant.ofEpochMilli(it.completedAt).atZone(zone).toLocalDate() == today
        } == true
        val activity = reminderActivity(today, completedToday, state?.lastStudyDate.orEmpty(), state?.streakFreeze ?: 1)
        val prefs = context.getSharedPreferences("rastro_reminder_delivery", Context.MODE_PRIVATE)
        val key = "${uid.ifBlank { "guest" }}:${activity.name}"
        if (prefs.getString(key, null) == today.toString()) return Result.success()
        val candidates = StudyReminderTemplates.load().filter { it.enabled && it.activity == activity && currentHour in it.startHour..it.endHour }
        val content = candidates.getOrNull(if (candidates.isEmpty()) 0 else today.dayOfYear % candidates.size)
        if (content != null && sendNotification(content.title, content.body)) {
            prefs.edit().putString(key, today.toString()).apply()
        }

        return Result.success()
    }

    private fun sendNotification(title: String, body: String): Boolean {
        createNotificationChannel(context)

        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setLargeIcon(android.graphics.BitmapFactory.decodeResource(context.resources, com.jonsuapps.rastro.R.drawable.rastro_logo_base))
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()

        try {
            NotificationManagerCompat.from(context).notify(NOTIFICATION_ID, notification)
            return true
        } catch (_: SecurityException) {
            return false // Permiso de notificaciones denegado.
        }
    }

}
