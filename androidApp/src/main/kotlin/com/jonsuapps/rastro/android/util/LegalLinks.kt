package com.jonsuapps.rastro.android.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

/**
 * URLs canónicas y oficiales del Centro Legal de RASTRO alojadas en Firebase Hosting.
 * Proporciona apertura segura de URLs sin dependencias externas pesadas y con tolerancia a fallos.
 */
object LegalLinks {
    const val URL_PRIVACIDAD = "https://rumbo-jonsu.web.app/privacidad"
    const val URL_TERMINOS = "https://rumbo-jonsu.web.app/terminos"
    const val URL_COMUNIDAD = "https://rumbo-jonsu.web.app/comunidad"
    const val URL_ELIMINAR_CUENTA = "https://rumbo-jonsu.web.app/eliminar-cuenta"
    const val URL_CENTRO_LEGAL = "https://rumbo-jonsu.web.app/"

    fun openUrl(context: Context, url: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (_: Exception) {
            Toast.makeText(
                context,
                "No se pudo abrir el navegador. Comprueba tu conexión a internet.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
