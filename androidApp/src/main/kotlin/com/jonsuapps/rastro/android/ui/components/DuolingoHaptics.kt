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
 * - Error / Respuesta incorrecta: Dos toques breves y delicados.
 */
object DuolingoHaptics {

    /** Sparse, delicate ticks while a lesson reward counter advances. */
    fun playResultCountTick(context: Context) = playResultPulse(context, 10L, 24, false)

    /** A short accent for an earned star, stronger than counting without a long buzz. */
    fun playResultStarImpact(context: Context) = playResultPulse(context, 22L, 90, true)

    private fun playResultPulse(context: Context, milliseconds: Long, amplitude: Int, star: Boolean) {
        if (!areVibrationsEnabled(context)) return
        val vibrator = getVibrator(context) ?: return
        if (!vibrator.hasVibrator()) return
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(VibrationEffect.createOneShot(milliseconds, amplitude))
            } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                vibrator.vibrate(VibrationEffect.createPredefined(
                    if (star) VibrationEffect.EFFECT_CLICK else VibrationEffect.EFFECT_TICK))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(milliseconds)
            }
        } catch (_: Throwable) {}
    }

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
                vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(10L)
            }
        } catch (_: Throwable) {}
    }

    /**
     * Vibración breve y suave al acertar una pregunta (estilo Duolingo éxito)
     */
    fun playAnswerCorrect(context: Context) {
        if (!areVibrationsEnabled(context)) return
        val vibrator = getVibrator(context) ?: return
        if (!vibrator.hasVibrator()) return
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // Dos pulsos breves de baja amplitud, sin vibración prolongada.
                val timings = longArrayOf(0, 14, 48, 18)
                val amplitudes = intArrayOf(0, 45, 0, 60)
                vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(longArrayOf(0, 14, 48, 18), -1)
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
                // Error discreto: dos toques cortos con baja amplitud.
                val timings = longArrayOf(0, 16, 55, 16)
                val amplitudes = intArrayOf(0, 50, 0, 50)
                vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(longArrayOf(0, 16, 55, 16), -1)
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
