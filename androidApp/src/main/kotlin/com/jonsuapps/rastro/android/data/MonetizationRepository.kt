package com.jonsuapps.rastro.android.data

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.monetization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString

object MonetizationRepository {
    // One Android store adapter; combines verified paid access with the existing manual Firestore grant.
    private var playBilling: PlayBillingRepository? = null
    @Synchronized fun playBilling(context: android.content.Context): PlayBillingRepository =
        playBilling ?: PlayBillingRepository(context.applicationContext).also { playBilling = it }
    @Synchronized fun closePlayBilling() { playBilling?.close(); playBilling = null }
    fun billingChecked(uid: String) = !PlayBillingConfig.checkoutEnabled || playBilling?.checkedUid == uid
    private val db get() = FirebaseFirestore.getInstance()
    private val json = Json { ignoreUnknownKeys = true }
    var serverCheckedProUid: String? = null
        private set
    fun observe(uid: String): com.google.firebase.firestore.ListenerRegistration {
      serverCheckedProUid = null
      return db.collection("rastro_pro").document(uid).addSnapshotListener { doc, error ->
        if (FirebaseAuth.getInstance().currentUser?.uid != uid || com.jonsuapps.rastro.auth.UserManager.currentUser.value.uid != uid) return@addSnapshotListener
        // Never carry a previous account's grant or trust a cached grant after a server error.
        if (error != null || doc == null) { serverCheckedProUid = null; ProAccess.update(ProGrant()); return@addSnapshotListener }
        if (!doc.metadata.isFromCache && !doc.metadata.hasPendingWrites()) serverCheckedProUid = uid
        ProAccess.update(ProGrant(doc.getString("plan").orEmpty(), doc.getLong("startsAt") ?: 0,
            doc.getLong("endsAt"), doc.getBoolean("enabled") == true, doc.getString("grantId").orEmpty()))
    }
    }
    fun grant(uid: String, plan: String, start: Long, end: Long?, callback: (Result<Unit>) -> Unit) {
        val admin = FirebaseAuth.getInstance().currentUser
        if (admin == null || !com.jonsuapps.rastro.auth.AdminConfig.isAdmin(admin.email)) { callback(Result.failure(IllegalStateException("Inicia sesión como administrador."))); return }
        if (uid.isBlank() || uid.contains('/') || (end != null && end <= start)) { callback(Result.failure(IllegalArgumentException("Revisa el usuario y las fechas."))); return }
        db.collection("rastro_pro").document(uid).set(mapOf("plan" to plan, "startsAt" to start, "endsAt" to end,
            "enabled" to true, "grantId" to java.util.UUID.randomUUID().toString(),
            "grantedBy" to admin.uid), SetOptions.merge())
            .addOnSuccessListener { callback(Result.success(Unit)) }.addOnFailureListener { callback(Result.failure(it)) }
    }
    fun revoke(uid: String, callback: (Result<Unit>) -> Unit) {
        db.collection("rastro_pro").document(uid).update("enabled", false)
            .addOnSuccessListener { callback(Result.success(Unit)) }.addOnFailureListener { callback(Result.failure(it)) }
    }
    fun observeEconomy() = db.collection("site_settings").document("global").addSnapshotListener { doc, error ->
        if (error != null) return@addSnapshotListener
        val config = runCatching { json.decodeFromString<EconomyConfig>(doc?.getString("economyJson") ?: return@runCatching EconomyConfig()) }.getOrNull() ?: return@addSnapshotListener
        val configured = doc?.getString("economyJson") != null
        val existingMinutes = doc?.takeIf { configured }?.getLong("lifeRecoveryAmount")?.let { amount ->
            val unit = com.jonsuapps.rastro.gamification.LifeRecoveryUnit.fromString(doc.getString("lifeRecoveryUnit") ?: "MINUTOS")
            (amount * unit.secondsMultiplier / 60).coerceAtLeast(1)
        } ?: config.recoveryMinutes
        val effective = config.copy(maxLives = (doc?.takeIf { configured }?.getLong("maxLives")?.toInt() ?: config.maxLives).coerceIn(1,100), recoveryMinutes = existingMinutes)
        EconomySettings.update(effective)
        com.jonsuapps.rastro.gamification.GamificationManager.setMaxHearts(effective.maxLives.coerceIn(1,100))
        com.jonsuapps.rastro.gamification.GamificationManager.setRecoveryConfig(effective.recoveryMinutes.coerceIn(1,1440), com.jonsuapps.rastro.gamification.LifeRecoveryUnit.MINUTOS)
    }
    fun saveEconomy(config: EconomyConfig, callback: (Result<Unit>) -> Unit) {
        db.collection("site_settings").document("global").set(mapOf("economyJson" to json.encodeToString(config), "maxLives" to config.maxLives, "lifeRecoveryAmount" to config.recoveryMinutes, "lifeRecoveryUnit" to "MINUTOS"), SetOptions.merge())
            .addOnSuccessListener { callback(Result.success(Unit)) }.addOnFailureListener { callback(Result.failure(it)) }
    }
    fun persistWallet() {
        val uid = com.jonsuapps.rastro.auth.UserManager.currentUser.value.uid
        val state = com.jonsuapps.rastro.gamification.GamificationManager.state.value
        GamificationRepository.saveLocal(uid, state)
        if (uid.isNotBlank()) GamificationRepository.save(uid, state)
    }
}

