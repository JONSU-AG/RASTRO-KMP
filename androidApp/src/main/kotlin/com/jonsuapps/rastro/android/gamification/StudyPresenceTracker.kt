package com.jonsuapps.rastro.android.gamification

import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import com.jonsuapps.rastro.android.data.GamificationRepository
import com.jonsuapps.rastro.android.data.DailyActivityMath
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.gamification.GamificationManager

/** Counts only while the app is visibly in the foreground; background time never contributes. */
object StudyPresenceTracker {
    private val handler = Handler(Looper.getMainLooper())
    private var running = false
    private var lastElapsed = 0L
    private var trackedUid = ""
    private fun checkpoint() {
        val now = SystemClock.elapsedRealtime()
        val user = UserManager.currentUser.value
        if (user.uid != trackedUid) {
            trackedUid = user.uid
            lastElapsed = now
            return
        }
        val elapsedSeconds = ((now - lastElapsed).coerceAtLeast(0) / 1000).toInt()
        val wallNow = System.currentTimeMillis()
        val seconds = (DailyActivityMath.splitInterval(wallNow, elapsedSeconds * 1000L)
            [DailyActivityMath.dateAt(wallNow)] ?: 0L).div(1000).toInt()
        lastElapsed += elapsedSeconds * 1000L
        if (seconds == 0) return
        GamificationManager.recordActiveStudySeconds(seconds)
        GamificationRepository.saveLocal(user.uid, GamificationManager.state.value)
        if (user.isAuthenticated && !user.isAnonymous) GamificationRepository.save(user.uid, GamificationManager.state.value)
    }
    private val tick = object : Runnable {
        override fun run() {
            if (!running) return
            checkpoint()
            handler.postDelayed(this, 30_000L)
        }
    }

    fun start() {
        if (running) return
        running = true
        lastElapsed = SystemClock.elapsedRealtime()
        trackedUid = UserManager.currentUser.value.uid
        handler.postDelayed(tick, 30_000L)
    }

    fun stop() {
        if (running) checkpoint()
        running = false
        handler.removeCallbacks(tick)
    }
}
