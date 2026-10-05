package com.jonsuapps.rastro.android.util

import android.content.Context
import android.content.Intent
import android.widget.Toast

/** Attempt resolution directly: package visibility may hide otherwise available handlers. */
fun Context.openExternalIntent(intent: Intent): Boolean = try {
    startActivity(intent)
    true
} catch (_: android.content.ActivityNotFoundException) {
    Toast.makeText(this, "No hay una aplicación disponible para abrir este enlace.", Toast.LENGTH_LONG).show()
    false
} catch (_: SecurityException) {
    Toast.makeText(this, "No se pudo abrir este enlace.", Toast.LENGTH_LONG).show()
    false
}
