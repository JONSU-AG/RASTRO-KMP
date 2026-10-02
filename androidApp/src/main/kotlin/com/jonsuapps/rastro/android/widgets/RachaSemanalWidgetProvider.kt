package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import com.jonsuapps.rastro.R

class RachaSemanalWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        updateWidgets(context, appWidgetManager, appWidgetIds)
    }

    companion object {
        fun updateWidgets(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
            try {
                // Estados REALES de la semana (Lun..Dom) desde activityDates de GamificationManager.
                val weekActive = RastroWidgetManager.getWeeklyActiveDates(context)
                val activeCount = weekActive.count { it }
                val pendingIntent = RastroWidgetManager.createActivityPendingIntent(context, 102)
                val marks = weekActive.map { if (it) "✓" else "○" }.joinToString(" ")

                for (appWidgetId in appWidgetIds) {
                    val views = RemoteViews(context.packageName, R.layout.widget_racha_semanal).apply {
                        setTextViewText(R.id.widget_semanal_ratio, "$activeCount/7")
                        setTextViewText(R.id.widget_semanal_days_marks, marks)
                        setTextViewText(R.id.widget_semanal_days_letters, "L M M J V S D")
                        setOnClickPendingIntent(R.id.widget_semanal_root, pendingIntent)
                    }
                    appWidgetManager.updateAppWidget(appWidgetId, views)
                }
            } catch (t: Throwable) {
                android.util.Log.e("SemanalWidget", "updateWidgets", t)
                val fallbackIntent = RastroWidgetManager.createActivityPendingIntent(context, 102)
                for (appWidgetId in appWidgetIds) {
                    val views = RemoteViews(context.packageName, R.layout.widget_racha_semanal).apply {
                        setOnClickPendingIntent(R.id.widget_semanal_root, fallbackIntent)
                    }
                    appWidgetManager.updateAppWidget(appWidgetId, views)
                }
            }
        }
    }
}
