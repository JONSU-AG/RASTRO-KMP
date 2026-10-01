package com.jonsuapps.rastro.android

import android.app.Application
import android.app.Activity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.firestore.PersistentCacheSettings
import com.jonsuapps.rastro.android.notifications.LimaStudyReminderWorker

class RastroApplication : Application() {

    companion object {
        lateinit var instance: RastroApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        com.jonsuapps.rastro.android.data.FavoritesRepository.init(this)
        FirebaseApp.initializeApp(this)
        try {
            val firestore = FirebaseFirestore.getInstance()
            val settings = FirebaseFirestoreSettings.Builder()
                .setLocalCacheSettings(
                    PersistentCacheSettings.newBuilder()
                        .setSizeBytes(100L * 1024L * 1024L)
                        .build()
                )
                .build()
            firestore.firestoreSettings = settings
        } catch (_: Exception) {
            // Ignorar si ya fue inicializado por otro componente
        }
        LimaStudyReminderWorker.enqueuePeriodicWork(this)
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            private var visibleActivities = 0
            override fun onActivityResumed(activity: Activity) {
                visibleActivities++
                com.jonsuapps.rastro.android.gamification.StudyPresenceTracker.start()
                com.jonsuapps.rastro.android.data.TesterActivityRepository.onForegroundStarted()
            }
            override fun onActivityPaused(activity: Activity) {
                visibleActivities = (visibleActivities - 1).coerceAtLeast(0)
                if (visibleActivities == 0) {
                    com.jonsuapps.rastro.android.gamification.StudyPresenceTracker.stop()
                    com.jonsuapps.rastro.android.data.TesterActivityRepository.onForegroundStopped()
                }
            }
            override fun onActivityCreated(activity: Activity, state: Bundle?) = Unit
            override fun onActivityStarted(activity: Activity) = Unit
            override fun onActivityStopped(activity: Activity) = Unit
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) = Unit
            override fun onActivityDestroyed(activity: Activity) = Unit
        })

        // Registrar timestamp de actividad para detección de inactividad
        try {
            getSharedPreferences("rastro_activity_prefs", MODE_PRIVATE).edit()
                .putLong("last_active_time", System.currentTimeMillis())
                .apply()
        } catch (_: Exception) {}
    }
}
