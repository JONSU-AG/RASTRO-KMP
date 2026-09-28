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
        val limaCalendar = Calendar.getInstance(TimeZone.getTimeZone("America/Lima"))
        val currentHour = limaCalendar.get(Calendar.HOUR_OF_DAY)

        // Comprobar inactividad desde preferencias
        val prefs = context.getSharedPreferences("rastro_activity_prefs", Context.MODE_PRIVATE)
        val lastActiveTimestamp = prefs.getLong("last_active_time", System.currentTimeMillis())
        val hoursInactive = (System.currentTimeMillis() - lastActiveTimestamp) / (1000 * 60 * 60)

        val notificationContent = when {
            hoursInactive >= 24 && currentHour in 9..21 -> NotificationContent(
                title = "🎯 ¡Te extrañamos en RASTRO!",
                body = "Tu meta preuniversitaria no se detiene. Vuelve hoy para mantener encendida tu racha de estudio."
            )
            currentHour in 7..11 -> NotificationContent(
                title = "☀️ ¡Buen día, futuro cachimbo!",
                body = "Un repaso matutino de 15 minutos en Fórmulas duplica tu retención para el examen."
            )
            currentHour in 15..18 -> NotificationContent(
                title = "🎯 Momento de avance preuniversitario",
                body = "Completa 1 lección en el Camino de Aprendizaje y asegura tu racha de hoy."
            )
            currentHour in 19..23 -> NotificationContent(
                title = "🔥 ¡Protege tu racha antes de medianoche!",
                body = "Solo te faltan 3 retos rápidos para mantener encendida tu llama de preparación."
            )
            else -> null
        }

        if (notificationContent != null) {
            sendNotification(notificationContent.title, notificationContent.body)
        }

        return Result.success()
    }

    private fun sendNotification(title: String, body: String) {
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
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()

        try {
            NotificationManagerCompat.from(context).notify(NOTIFICATION_ID, notification)
        } catch (_: SecurityException) {
            // Ignorar si el usuario denegó permisos de POST_NOTIFICATIONS en Android 13+
        }
    }

    private data class NotificationContent(val title: String, val body: String)
}
