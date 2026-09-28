package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import com.jonsuapps.rastro.R
import java.util.Calendar

class RachaSemanalWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        updateWidgets(context, appWidgetManager, appWidgetIds)
    }

    companion object {
        fun updateWidgets(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
            val streak = RastroWidgetManager.getStreak(context)
            val pendingIntent = RastroWidgetManager.createActivityPendingIntent(context, 102)

            // Determinar día de la semana actual (Lunes = 1 .. Domingo = 7)
            val cal = Calendar.getInstance()
            val dayOfWeek = when (cal.get(Calendar.DAY_OF_WEEK)) {
                Calendar.MONDAY -> 1
                Calendar.TUESDAY -> 2
                Calendar.WEDNESDAY -> 3
                Calendar.THURSDAY -> 4
                Calendar.FRIDAY -> 5
                Calendar.SATURDAY -> 6
                Calendar.SUNDAY -> 7
                else -> 1
            }

            // Los últimos `min(streak, dayOfWeek)` días de la semana actual se marcan con fuego
            val activeThisWeek = streak.coerceAtMost(dayOfWeek).coerceAtLeast(1)

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
                    setTextViewText(R.id.widget_semanal_ratio, "$activeThisWeek/7 Días")
                    setOnClickPendingIntent(R.id.widget_semanal_root, pendingIntent)

                    daysMap.forEachIndexed { index, pair ->
                        val dayIndex = index + 1
                        val isActive = dayIndex <= activeThisWeek
                        val symbol = if (isActive) "🔥" else "⚪"
                        setTextViewText(pair.first, "${pair.second}\n$symbol")
                    }
                }
                appWidgetManager.updateAppWidget(appWidgetId, views)
            }
        }
    }
}
