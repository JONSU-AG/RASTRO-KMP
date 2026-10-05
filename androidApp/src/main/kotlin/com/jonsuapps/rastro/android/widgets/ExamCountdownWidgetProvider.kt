package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.content.ComponentName
import android.app.AlarmManager
import android.app.PendingIntent

class ExamCountdownWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) = updateWidgets(context, manager, ids)

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)
        if (intent.action == ACTION_REFRESH || intent.action == Intent.ACTION_TIME_CHANGED || intent.action == Intent.ACTION_TIMEZONE_CHANGED) {
            val manager = AppWidgetManager.getInstance(context)
            updateWidgets(context, manager, manager.getAppWidgetIds(ComponentName(context, javaClass)))
        }
    }

    override fun onDisabled(context: Context) { cancelRefresh(context) }

    companion object {
        private const val ACTION_REFRESH = "com.jonsuapps.rastro.widget.COUNTDOWN_REFRESH"
        private fun refreshIntent(context: Context) = PendingIntent.getBroadcast(context, 105,
            Intent(context, ExamCountdownWidgetProvider::class.java).setAction(ACTION_REFRESH),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
        private fun cancelRefresh(context: Context) {
            (context.getSystemService(Context.ALARM_SERVICE) as AlarmManager).cancel(refreshIntent(context))
        }
        fun updateWidgets(context: Context, manager: AppWidgetManager, ids: IntArray) {
            RastroWidgetViews.update(context, manager, ids, RastroWidgetKind.COUNTDOWN)
            cancelRefresh(context)
            if (ids.isEmpty()) return
            val next = WidgetDates.nextRefresh(RastroWidgetManager.getExamDateYmd(context), System.currentTimeMillis()) ?: return
            // No exact-alarm permission, foreground service, polling loop or notification.
            runCatching {
                (context.getSystemService(Context.ALARM_SERVICE) as AlarmManager)
                    .setAndAllowWhileIdle(AlarmManager.RTC, next, refreshIntent(context))
            }.onFailure { android.util.Log.w("RastroWidget", "Programar refresco del contador", it) }
        }
    }
}
