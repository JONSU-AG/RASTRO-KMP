package com.jonsuapps.rastro.android.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context

class RachaSemanalWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) = updateWidgets(context, manager, ids)

    companion object {
        fun updateWidgets(context: Context, manager: AppWidgetManager, ids: IntArray) =
            RastroWidgetViews.update(context, manager, ids, RastroWidgetKind.WEEKLY)
    }
}