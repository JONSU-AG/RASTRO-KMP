package com.jonsuapps.rastro.android.widgets

import android.content.Context
import android.widget.RemoteViews
import com.jonsuapps.rastro.R

enum class RastroWidgetKind(val layout: Int, val root: Int, val cells: Int, val title: String,
    val provider: Class<*>, val requestCode: Int) {
    DAILY(R.layout.widget_racha, R.id.widget_racha_root, 2, "Racha diaria",
        RachaWidgetProvider::class.java, 101),
    WEEKLY(R.layout.widget_racha_semanal, R.id.widget_semanal_root, 4, "Racha semanal",
        RachaSemanalWidgetProvider::class.java, 102),
    COUNTDOWN(R.layout.widget_exam_countdown, R.id.widget_countdown_root, 2, "Contador de examen",
        ExamCountdownWidgetProvider::class.java, 103),
    QUOTE(R.layout.widget_motivacion, R.id.widget_motivacion_root, 4, "Frase del día",
        MotivacionWidgetProvider::class.java, 104)
}

/** Same RemoteViews for the launcher, pin dialog and in-app previews. */
object RastroWidgetViews {
    fun update(context: Context, manager: android.appwidget.AppWidgetManager, ids: IntArray, kind: RastroWidgetKind) {
        RastroWidgetManager.updatePickerPreviews(context, manager, kind)
        ids.forEach { id ->
            runCatching { manager.updateAppWidget(id, create(context, kind)) }.onFailure { failure ->
                android.util.Log.e("RastroWidget", "Actualizar ${kind.name}: $id", failure)
                // A data/preview failure must not crash the provider or retry the failing getter.
                runCatching {
                    val fallback = if (kind == RastroWidgetKind.DAILY) R.layout.widget_racha_fallback else kind.layout
                    manager.updateAppWidget(id, RemoteViews(context.packageName, fallback).apply {
                        setOnClickPendingIntent(kind.root, RastroWidgetManager.createActivityPendingIntent(context, kind.requestCode))
                    })
                }.onFailure { android.util.Log.e("RastroWidget", "Fallback ${kind.name}: $id", it) }
            }
        }
    }

    fun create(context: Context, kind: RastroWidgetKind): RemoteViews = RemoteViews(context.packageName, kind.layout).apply {
        when (kind) {
            RastroWidgetKind.DAILY -> {
                val streak = RastroWidgetManager.getStreak(context)
                setTextViewText(R.id.widget_racha_count, streak.toString())
                setTextViewText(R.id.widget_racha_label, if (streak == 1) "DÍA DE RACHA" else "DÍAS DE RACHA")
                setContentDescription(kind.root, "$streak días de racha")
            }
            RastroWidgetKind.WEEKLY -> {
                val days = RastroWidgetManager.getWeeklyActiveDates(context)
                setTextViewText(R.id.widget_semanal_ratio, "${days.count { it }}/7")
                setTextViewText(R.id.widget_semanal_days_marks, days.joinToString(" ") { if (it) "✓" else "○" })
                setTextViewText(R.id.widget_semanal_days_letters, "L M M J V S D")
                setContentDescription(kind.root, "Racha semanal: ${days.count { it }} de 7 días")
            }
            RastroWidgetKind.COUNTDOWN -> {
                val (name, _, _) = RastroWidgetManager.getExamDetails(context)
                val display = WidgetDates.display(RastroWidgetManager.getExamDateYmd(context), System.currentTimeMillis())
                setTextViewText(R.id.widget_countdown_target, name)
                setTextViewText(R.id.widget_countdown_days, display.value)
                setTextViewText(R.id.widget_countdown_label, display.label)
                setContentDescription(kind.root, "$name: ${display.value} ${display.label}")
            }
            RastroWidgetKind.QUOTE -> {
                val quote = RastroWidgetManager.getDailyQuote().first
                setTextViewText(R.id.widget_motivacion_quote, quote)
                setTextViewText(R.id.widget_motivacion_author, "— RASTRO")
                setContentDescription(kind.root, quote)
            }
        }
        setImageViewBitmap(R.id.widget_artwork, RastroWidgetIllustration.draw(context, kind))
        setViewVisibility(R.id.widget_data_overlay, android.view.View.GONE)
        setOnClickPendingIntent(kind.root, RastroWidgetManager.createActivityPendingIntent(context, kind.requestCode))
    }
}
