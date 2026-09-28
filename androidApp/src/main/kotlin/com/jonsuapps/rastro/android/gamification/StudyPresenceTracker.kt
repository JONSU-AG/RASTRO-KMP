package com.jonsuapps.rastro.android.gamification

import android.os.Handler
import android.os.Looper
import com.jonsuapps.rastro.android.data.GamificationRepository
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.gamification.GamificationManager

/** Counts only while the app is visibly in the foreground; background time never contributes. */
object StudyPresenceTracker {
    private val handler = Handler(Looper.getMainLooper())
    private var running = false
    private val tick = object : Runnable {
        override fun run() {
            if (!running) return
            GamificationManager.recordActiveStudySeconds(30)
            val user = UserManager.currentUser.value
            GamificationRepository.saveLocal(user.uid, GamificationManager.state.value)
            if (user.isAuthenticated && !user.isAnonymous) {
                GamificationRepository.save(user.uid, GamificationManager.state.value)
            }
            handler.postDelayed(this, 30_000L)
        }
    }

    fun start() {
        if (running) return
        running = true
        handler.postDelayed(tick, 30_000L)
    }

    fun stop() {
        running = false
        handler.removeCallbacks(tick)
    }
}
