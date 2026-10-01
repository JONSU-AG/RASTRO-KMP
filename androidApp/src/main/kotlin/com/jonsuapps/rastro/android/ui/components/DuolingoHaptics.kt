package com.jonsuapps.rastro.android.ui.components

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager

/**
 * Sistema de vibración y feedback háptico táctil con la firma de respuesta de Duolingo:
 * - Selección de opción / click en ficha: Toque nítido y ligero (tick instantáneo).
 * - Acierto / Respuesta correcta: Secuencia triunfal y alegre de doble pulso elástico.
 * - Error / Respuesta incorrecta: Doble buzz firme de advertencia.
 */
object DuolingoHaptics {

    @Volatile
    private var cachedVibrator: Vibrator? = null
    @Volatile
    private var isVibratorInitialized = false

    private fun getVibrator(context: Context): Vibrator? {
        if (!isVibratorInitialized) {
            synchronized(this) {
                if (!isVibratorInitialized) {
                    cachedVibrator = try {
                        val appCtx = context.applicationContext ?: context
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                            val vibratorManager = appCtx.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as? VibratorManager
                            vibratorManager?.defaultVibrator
                        } else {
                            @Suppress("DEPRECATION")
                            appCtx.getSystemService(Context.VIBRATOR_SERVICE) as? Vibrator
                        }
                    } catch (_: Throwable) {
                        null
                    }
                    isVibratorInitialized = true
                }
            }
        }
        return cachedVibrator
    }

    fun areVibrationsEnabled(context: Context?): Boolean {
        if (context == null) return true
        val prefs = context.getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE)
        return prefs.getBoolean("vibrations_enabled", true)
    }

    /**
     * Tock ligero al pulsar cualquier opción o botón de respuesta
     */
    fun playOptionSelected(context: Context) {
        if (!areVibrationsEnabled(context)) return
        val vibrator = getVibrator(context) ?: return
        if (!vibrator.hasVibrator()) return
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(18L)
            }
        } catch (_: Throwable) {}
    }

    /**
     * Vibración festiva y enérgica al acertar una pregunta (estilo Duolingo éxito)
     */
    fun playAnswerCorrect(context: Context) {
        if (!areVibrationsEnabled(context)) return
        val vibrator = getVibrator(context) ?: return
        if (!vibrator.hasVibrator()) return
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // Doble pulso rítmico ascendente: espera 0ms, pulso 45ms (suave), pausa 60ms, pulso 80ms (fuerte)
                val timings = longArrayOf(0, 45, 60, 80)
                val amplitudes = intArrayOf(0, 160, 0, 255)
                vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(longArrayOf(0, 45, 60, 80), -1)
            }
        } catch (_: Throwable) {}
    }

    /**
     * Vibración de advertencia al cometer un error (estilo Duolingo fallo)
     */
    fun playAnswerIncorrect(context: Context) {
        if (!areVibrationsEnabled(context)) return
        val vibrator = getVibrator(context) ?: return
        if (!vibrator.hasVibrator()) return
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // Doble buzz más prolongado y grave: espera 0ms, vibra 70ms, pausa 70ms, vibra 130ms
                val timings = longArrayOf(0, 70, 70, 130)
                val amplitudes = intArrayOf(0, 210, 0, 240)
                vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(longArrayOf(0, 70, 70, 130), -1)
            }
        } catch (_: Throwable) {}
    }

    /**
     * Vibración festiva para celebraciones de logros y difusión
     */
    fun playCelebration(context: Context? = null) {
        if (!areVibrationsEnabled(context)) return
        val vibrator = (if (context != null) getVibrator(context) else cachedVibrator) ?: return
        if (!vibrator.hasVibrator()) return
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val timings = longArrayOf(0, 45, 60, 80, 50, 100)
                val amplitudes = intArrayOf(0, 160, 0, 255, 0, 255)
                vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(longArrayOf(0, 45, 60, 80, 50, 100), -1)
            }
        } catch (_: Throwable) {}
    }

    /**
     * Feedback háptico al completar una lección o resolver un item
     */
    fun playLessonComplete(context: Context) {
        playCelebration(context)
    }
}
