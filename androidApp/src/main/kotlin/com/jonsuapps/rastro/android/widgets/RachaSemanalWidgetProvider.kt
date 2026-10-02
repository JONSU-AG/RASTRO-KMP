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

                val daysMap = listOf(
                    Pair(R.id.day_lun, "L"),
                    Pair(R.id.day_mar, "M"),
                    Pair(R.id.day_mie, "M"),
                    Pair(R.id.day_jue, "J"),
                    Pair(R.id.day_vie, "V"),
                    Pair(R.id.day_sab, "S"),
                    Pair(R.id.day_dom, "D")
                )

                for (appWidgetId in appWidgetIds) {
                    val views = RemoteViews(context.packageName, R.layout.widget_racha_semanal).apply {
                        setTextViewText(R.id.widget_semanal_ratio, "$activeCount/7")
                        setOnClickPendingIntent(R.id.widget_semanal_root, pendingIntent)

                        daysMap.forEachIndexed { index, pair ->
                            val isActive = weekActive.getOrElse(index) { false }
                            val symbol = if (isActive) "✓" else "○"
                            setTextViewText(pair.first, "$symbol\n${pair.second}")
                            setTextColor(
                                pair.first,
                                if (isActive) android.graphics.Color.parseColor("#6D28D9")
                                else android.graphics.Color.parseColor("#B6B0C6")
                            )
                        }
                    }
                    appWidgetManager.updateAppWidget(appWidgetId, views)
                }
            } catch (t: Throwable) {
                android.util.Log.e("SemanalWidget", "updateWidgets falló, usando valores por defecto", t)
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
