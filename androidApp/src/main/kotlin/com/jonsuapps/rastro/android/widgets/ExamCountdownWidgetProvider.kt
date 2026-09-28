package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import com.jonsuapps.rastro.R

class ExamCountdownWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        updateWidgets(context, appWidgetManager, appWidgetIds)
    }

    companion object {
        fun updateWidgets(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
            val (examName, daysRemaining, career) = RastroWidgetManager.getExamDetails(context)
            val pendingIntent = RastroWidgetManager.createActivityPendingIntent(context, 103)

            for (appWidgetId in appWidgetIds) {
                val views = RemoteViews(context.packageName, R.layout.widget_exam_countdown).apply {
                    setTextViewText(R.id.widget_countdown_target, examName)
                    setTextViewText(R.id.widget_countdown_days, daysRemaining.toString())
                    setTextViewText(R.id.widget_countdown_label, if (daysRemaining == 1) "DÍA RESTANTE" else "DÍAS RESTANTES")
                    setTextViewText(R.id.widget_countdown_career, career)
                    setOnClickPendingIntent(R.id.widget_countdown_root, pendingIntent)
                }
                appWidgetManager.updateAppWidget(appWidgetId, views)
            }
        }
    }
}
