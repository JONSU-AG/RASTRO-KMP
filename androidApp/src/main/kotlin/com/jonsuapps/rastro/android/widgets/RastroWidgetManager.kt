package com.jonsuapps.rastro.android.widgets

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.android.MainActivity
import com.jonsuapps.rastro.gamification.GamificationManager
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit

/**
 * Gestor y proveedores de Widgets de Inicio de Android para RASTRO.
 * 1. Racha Diaria (Streak)
 * 2. Racha Semanal (L-D con fuegos activos)
 * 3. Contador de Días para Examen Personalizado
 * 4. Mensajes Diarios de Motivación Preuniversitaria
 */
object RastroWidgetManager {

    private const val PREFS_NAME = "rastro_widget_prefs"
    private const val KEY_STREAK = "widget_streak_count"
    private const val KEY_LAST_DATE = "widget_last_study_date"
    private const val KEY_EXAM_NAME = "widget_exam_name"
    private const val KEY_EXAM_DATE = "widget_exam_date" // YYYY-MM-DD
    private const val KEY_EXAM_CAREER = "widget_exam_career"

    private val MOTIVATIONAL_QUOTES = listOf(
        Pair("Cada problema resuelto hoy es un punto más en tu examen de admisión.", "— Orstty (RASTRO)"),
        Pair("La disciplina vence al talento cuando el talento no se esfuerza. ¡Sigue con todo!", "— Artyon (RASTRO)"),
        Pair("Un error en el simulacro es una bendición: aprendes hoy para no fallar en la admisión.", "— RASTRO Preu"),
        Pair("Tu vacante universitaria no se negocia. ¡Protege tu racha diaria!", "— Orstty (RASTRO)"),
        Pair("15 minutos de fórmulas hoy te ahorran 6 meses de preparación extra.", "— Artyon (RASTRO)"),
        Pair("Enfócate en el proceso y el ingreso llegará como consecuencia natural.", "— RASTRO Preu"),
        Pair("Los postulantes que ingresan son aquellos que estudian incluso los días difíciles.", "— Orstty (RASTRO)")
    )

    fun updateStreakInWidgets(context: Context, streak: Int, lastActiveDate: String) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit()
            .putInt(KEY_STREAK, streak)
            .putString(KEY_LAST_DATE, lastActiveDate)
            .apply()
        updateAllWidgets(context)
    }

    fun setCustomExam(context: Context, examName: String, examDateYmd: String, career: String) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit()
            .putString(KEY_EXAM_NAME, examName)
            .putString(KEY_EXAM_DATE, examDateYmd)
            .putString(KEY_EXAM_CAREER, career)
            .apply()
        updateAllWidgets(context)
    }

    fun getStreak(context: Context): Int {
        val liveStreak = GamificationManager.streakState.value.currentStreak
        if (liveStreak > 0) return liveStreak
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getInt(KEY_STREAK, 1)
    }

    fun updateAllWidgets(context: Context) {
        val appWidgetManager = AppWidgetManager.getInstance(context)

        // 1. Racha
        val rachaComp = ComponentName(context, RachaWidgetProvider::class.java)
        val rachaIds = appWidgetManager.getAppWidgetIds(rachaComp)
        if (rachaIds.isNotEmpty()) {
            RachaWidgetProvider.updateWidgets(context, appWidgetManager, rachaIds)
        }

        // 2. Semanal
        val semanalComp = ComponentName(context, RachaSemanalWidgetProvider::class.java)
        val semanalIds = appWidgetManager.getAppWidgetIds(semanalComp)
        if (semanalIds.isNotEmpty()) {
            RachaSemanalWidgetProvider.updateWidgets(context, appWidgetManager, semanalIds)
        }

        // 3. Examen
        val examComp = ComponentName(context, ExamCountdownWidgetProvider::class.java)
        val examIds = appWidgetManager.getAppWidgetIds(examComp)
        if (examIds.isNotEmpty()) {
            ExamCountdownWidgetProvider.updateWidgets(context, appWidgetManager, examIds)
        }

        // 4. Motivación
        val motComp = ComponentName(context, MotivacionWidgetProvider::class.java)
        val motIds = appWidgetManager.getAppWidgetIds(motComp)
        if (motIds.isNotEmpty()) {
            MotivacionWidgetProvider.updateWidgets(context, appWidgetManager, motIds)
        }
    }

    fun getDailyQuote(): Pair<String, String> {
        val dayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        val index = (dayOfYear % MOTIVATIONAL_QUOTES.size).coerceIn(0, MOTIVATIONAL_QUOTES.lastIndex)
        return MOTIVATIONAL_QUOTES[index]
    }

    fun getExamDetails(context: Context): Triple<String, Int, String> {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val examName = prefs.getString(KEY_EXAM_NAME, "🎯 EXAMEN ADMISIÓN UNSA") ?: "🎯 EXAMEN ADMISIÓN UNSA"
        val career = prefs.getString(KEY_EXAM_CAREER, "¡Asegura tu vacante!") ?: "¡Asegura tu vacante!"
        val examDateStr = prefs.getString(KEY_EXAM_DATE, null)

        val daysRemaining: Int = if (!examDateStr.isNullOrBlank()) {
            runCatching {
                val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.US)
                val targetDate = sdf.parse(examDateStr) ?: Date()
                val diffMillis = targetDate.time - System.currentTimeMillis()
                (TimeUnit.MILLISECONDS.toDays(diffMillis)).toInt().coerceAtLeast(0)
            }.getOrDefault(38)
        } else {
            // Default dinámico aproximado para el próximo proceso CEPRUNSA/Ordinario
            val calendar = Calendar.getInstance()
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
            (45 - (dayOfMonth % 20)).coerceAtLeast(1)
        }

        return Triple(examName, daysRemaining, career)
    }

    fun createActivityPendingIntent(context: Context, requestCode: Int): PendingIntent {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        return PendingIntent.getActivity(
            context,
            requestCode,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }
}
