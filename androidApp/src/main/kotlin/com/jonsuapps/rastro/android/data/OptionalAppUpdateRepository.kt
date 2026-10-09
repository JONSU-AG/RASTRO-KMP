package com.jonsuapps.rastro.android.data

import android.content.Context
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.UpdateAvailability
import com.jonsuapps.rastro.BuildConfig
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

internal object OptionalUpdatePolicy {
    const val DAY = 86_400_000L
    fun shouldOffer(installed: Int, available: Int, dismissed: Int, dismissedAt: Long, now: Long): Boolean =
        available > installed && (available != dismissed || now - dismissedAt !in 0 until DAY)
}

/** Google Play decides whether an update is available for this account and release track. */
object OptionalAppUpdateRepository {
    private val candidate = MutableStateFlow<Int?>(null)
    val availableVersion = candidate.asStateFlow()
    private var checking = false
    private var lastChecked = 0L
    private const val CACHE = 6 * 3_600_000L
    private fun prefs(context: Context) = context.getSharedPreferences("rastro_optional_update", Context.MODE_PRIVATE)

    fun check(context: Context) {
        val now = System.currentTimeMillis()
        if (checking || (lastChecked != 0L && now - lastChecked in 0 until CACHE)) return
        checking = true
        lastChecked = now
        try {
            AppUpdateManagerFactory.create(context.applicationContext).appUpdateInfo
                .addOnSuccessListener { info ->
                    checking = false
                    val settings = prefs(context)
                    val code = info.availableVersionCode()
                    candidate.value = code.takeIf {
                        info.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE &&
                            OptionalUpdatePolicy.shouldOffer(BuildConfig.VERSION_CODE, code,
                                settings.getInt("dismissedVersion", 0), settings.getLong("dismissedAt", 0L),
                                System.currentTimeMillis())
                    }
                }.addOnFailureListener { checking = false; candidate.value = null }
        } catch (_: RuntimeException) { checking = false; candidate.value = null }
    }

    fun dismiss(context: Context) {
        candidate.value?.let { version -> prefs(context).edit().putInt("dismissedVersion", version)
            .putLong("dismissedAt", System.currentTimeMillis()).apply() }
        candidate.value = null
    }
}
