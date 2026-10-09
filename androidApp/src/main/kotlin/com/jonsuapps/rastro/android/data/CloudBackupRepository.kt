package com.jonsuapps.rastro.android.data

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.android.RastroApplication
import com.jonsuapps.rastro.gamification.GamificationManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

object CloudBackupRepository {
    private val prefs get() = RastroApplication.instance.getSharedPreferences("rastro_cloud_backup", Context.MODE_PRIVATE)
    private val busyState = MutableStateFlow(false)
    val busy = busyState.asStateFlow()
    private val messageState = MutableStateFlow("")
    val message = messageState.asStateFlow()
    fun weekly(uid: String) = prefs.getBoolean("weekly:$uid", false)
    fun setWeekly(uid: String, enabled: Boolean) { prefs.edit().putBoolean("weekly:$uid", enabled).apply() }
    fun lastSuccess(uid: String) = prefs.getLong("success:$uid", 0L)
    fun revision(uid: String) = prefs.getLong("revision:$uid", 0L)
    fun hasRevision(uid: String) = prefs.contains("revision:$uid")
    /** A guest snapshot is transferred once, never added repeatedly or copied across accounts. */
    fun claimGuest(uid: String): Boolean {
        val claimed = prefs.getString("guest_transferred_to", null)
        if (claimed != null) return false
        prefs.edit().putString("guest_transferred_to", uid).commit()
        return true
    }
    fun rememberRevision(uid: String, revision: Long) { prefs.edit().putLong("revision:$uid", revision).apply() }
    fun maybeBackup(uid: String) {
        if (CloudSyncPolicy.due(weekly(uid), lastSuccess(uid), System.currentTimeMillis())) sync()
    }
    fun sync() {
        val user = FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }
        if (user == null) { messageState.value = "Inicia sesión para respaldar tu progreso."; return }
        if (busyState.value) return
        val uid = user.uid
        val snapshot = GamificationManager.state.value
        busyState.value = true
        messageState.value = "Guardando respaldo…"
        GamificationRepository.saveCloud(uid, snapshot) { result ->
            if (FirebaseAuth.getInstance().currentUser?.uid != uid) {
                busyState.value = false
                messageState.value = "La sesión cambió. Revisa el respaldo desde tu cuenta."
                return@saveCloud
            }
            if (result.isFailure) {
                busyState.value = false
                messageState.value = result.exceptionOrNull()?.message ?: "No se pudo respaldar. Tu avance sigue en este dispositivo."
            } else ErrorBankRepository.syncBackup { errors ->
                busyState.value = false
                if (errors.isSuccess) {
                    prefs.edit().putLong("success:$uid", System.currentTimeMillis()).apply()
                    messageState.value = "Respaldo actualizado."
                } else messageState.value = "Progreso respaldado; errores pendientes. Puedes volver a sincronizar."
            }
        }
    }
}
