package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import com.jonsuapps.rastro.R

class RachaWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        updateWidgets(context, appWidgetManager, appWidgetIds)
    }

    companion object {
        fun updateWidgets(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
            try {
                val streak = RastroWidgetManager.getStreak(context)
                val pendingIntent = RastroWidgetManager.createActivityPendingIntent(context, 101)

                for (appWidgetId in appWidgetIds) {
                    val views = RemoteViews(context.packageName, R.layout.widget_racha).apply {
                        setTextViewText(R.id.widget_racha_count, streak.toString())
                        setTextViewText(R.id.widget_racha_label, if (streak == 1) "DÍA DE RACHA" else "DÍAS DE RACHA")
                        setOnClickPendingIntent(R.id.widget_racha_root, pendingIntent)
                    }
                    appWidgetManager.updateAppWidget(appWidgetId, views)
                }
            } catch (t: Throwable) {
                android.util.Log.e("RachaWidget", "updateWidgets", t)
                val fallbackIntent = RastroWidgetManager.createActivityPendingIntent(context, 101)
                for (appWidgetId in appWidgetIds) {
                    val views = RemoteViews(context.packageName, R.layout.widget_racha_fallback).apply {
                        setOnClickPendingIntent(R.id.widget_racha_root, fallbackIntent)
                    }
                    appWidgetManager.updateAppWidget(appWidgetId, views)
                }
            }
        }
    }
}
