package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.jonsuapps.rastro.R

class RachaWidgetProvider : AppWidgetProvider() {

    override fun onReceive(context: Context, intent: Intent) {
        android.util.Log.e("RachaWidget", "RECEIVER action=" + intent.action)
        super.onReceive(context, intent)
        android.util.Log.e("RachaWidget", "RECEIVER fin action=" + intent.action)
    }

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        android.util.Log.e("RachaWidget", "onUpdate ids=" + appWidgetIds.joinToString())
        updateWidgets(context, appWidgetManager, appWidgetIds)
        android.util.Log.e("RachaWidget", "onUpdate fin")
    }

    companion object {
        // TEMPORAL PRUEBA-C5: sin pesos. Ancho fijo + gravedad, textos ESTÁTICOS.
        fun updateWidgets(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
            try {
                android.util.Log.e("RachaWidget", "PRUEBA-C5 render iniciado (sin pesos)")
                for (appWidgetId in appWidgetIds) {
                    val views = RemoteViews(context.packageName, R.layout.widget_racha_testc5)
                    android.util.Log.e("RachaWidget", "PRUEBA-C5 update solicitado id=$appWidgetId")
                    appWidgetManager.updateAppWidget(appWidgetId, views)
                }
                android.util.Log.e("RachaWidget", "PRUEBA-C5 update terminado")
            } catch (t: Throwable) {
                android.util.Log.e("RachaWidget", "PRUEBA-C5 excepción (stacktrace completo)", t)
                throw t
            }
        }
    }
}
