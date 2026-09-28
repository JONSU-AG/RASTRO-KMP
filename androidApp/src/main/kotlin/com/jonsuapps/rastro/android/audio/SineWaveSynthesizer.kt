package com.jonsuapps.rastro.android.audio

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.sin

/**
 * Sintetizador senoidal puro para Pomodoro Bimodal RASTRO
 * Frecuencias armónicas: 432 Hz (Enfoque / Claridad) y 528 Hz (Concentración profunda / Solfeggio)
 * Generado matemáticamente en tiempo real sin requerir archivos de audio MP3 externos (Costo $0, 0 KB de assets).
 */
class SineWaveSynthesizer {

    private var audioTrack: AudioTrack? = null
    private var playbackJob: Job? = null
    private val scope = CoroutineScope(Dispatchers.Default)

    private val sampleRate = 44100
    private var isPlaying = false

    fun playTone(frequencyHz: Double = 432.0, volume: Float = 0.35f) {
        stop()

        val minBufferSize = AudioTrack.getMinBufferSize(
            sampleRate,
            AudioFormat.CHANNEL_OUT_MONO,
            AudioFormat.ENCODING_PCM_16BIT
        )
        val bufferSize = minBufferSize * 2

        audioTrack = AudioTrack.Builder()
            .setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build()
            )
            .setAudioFormat(
                AudioFormat.Builder()
                    .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                    .setSampleRate(sampleRate)
                    .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                    .build()
            )
            .setBufferSizeInBytes(bufferSize)
            .setTransferMode(AudioTrack.MODE_STREAM)
            .build()

        audioTrack?.setVolume(volume)
        audioTrack?.play()
        isPlaying = true

        playbackJob = scope.launch {
            val buffer = ShortArray(bufferSize / 2)
            var phase = 0.0
            val phaseIncrement = (2.0 * PI * frequencyHz) / sampleRate

            while (isActive && isPlaying) {
                for (i in buffer.indices) {
                    val sample = sin(phase) * Short.MAX_VALUE * 0.9
                    buffer[i] = sample.toInt().toShort()
                    phase += phaseIncrement
                    if (phase > 2.0 * PI) {
                        phase -= 2.0 * PI
                    }
                }
                audioTrack?.write(buffer, 0, buffer.size)
            }
        }
    }

    fun stop() {
        isPlaying = false
        playbackJob?.cancel()
        playbackJob = null
        try {
            audioTrack?.stop()
            audioTrack?.release()
        } catch (_: Exception) {}
        audioTrack = null
    }

    fun isAudioActive(): Boolean = isPlaying
}
