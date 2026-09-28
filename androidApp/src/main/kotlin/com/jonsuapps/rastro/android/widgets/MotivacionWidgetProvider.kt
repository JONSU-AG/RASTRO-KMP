package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import com.jonsuapps.rastro.R

class MotivacionWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        updateWidgets(context, appWidgetManager, appWidgetIds)
    }

    companion object {
        fun updateWidgets(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
            val (quote, author) = RastroWidgetManager.getDailyQuote()
            val pendingIntent = RastroWidgetManager.createActivityPendingIntent(context, 104)

            for (appWidgetId in appWidgetIds) {
                val views = RemoteViews(context.packageName, R.layout.widget_motivacion).apply {
                    setTextViewText(R.id.widget_motivacion_quote, "\"$quote\"")
                    setTextViewText(R.id.widget_motivacion_author, author)
                    setOnClickPendingIntent(R.id.widget_motivacion_root, pendingIntent)
                }
                appWidgetManager.updateAppWidget(appWidgetId, views)
            }
        }
    }
}
