package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.auth.UserManager
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.monetization.CoinRewardPolicy
import kotlinx.coroutines.tasks.await

/** On-demand reads, no listeners or paid backend. Immutable receipts identify each grant. */
object CoinRewardsRepository {
    data class Promo(val code: String, val coins: Int, val enabled: Boolean, val singleUser: Boolean, val redeemedBy: String?)
    data class PromoPage(val codes: List<Promo>, val cursor: com.google.firebase.firestore.DocumentSnapshot?, val hasMore: Boolean)
    suspend fun codes(after: com.google.firebase.firestore.DocumentSnapshot?, active: Boolean?): PromoPage {
        check(admin() != null) { "Inicia sesión como administrador." }
        var query: com.google.firebase.firestore.Query = db.collection("coin_promos")
        if (active != null) query = query.whereEqualTo("enabled", active)
        query = query.orderBy(com.google.firebase.firestore.FieldPath.documentId()).limit(21)
        if (after != null) query = query.startAfter(after)
        val docs = query.get(com.google.firebase.firestore.Source.SERVER).await()
        val page = docs.documents.take(20)
        return PromoPage(page.map { Promo(it.id, (it.getLong("coins") ?: 0).toInt(), it.getBoolean("enabled") == true,
            it.getBoolean("singleUser") == true, it.getString("redeemedBy")) }, page.lastOrNull(), docs.size() > 20)
    }
    fun setCodeEnabled(code: String, enabled: Boolean, callback: (Result<Unit>) -> Unit) {
        if (admin() == null || !CoinRewardPolicy.validCode(code)) { callback(Result.failure(IllegalArgumentException("Revisa el código y tu sesión."))); return }
        db.collection("coin_promos").document(code).update("enabled", enabled)
            .addOnSuccessListener { callback(Result.success(Unit)) }.addOnFailureListener { callback(Result.failure(it)) }
    }
    private val db get() = FirebaseFirestore.getInstance()
    private fun account() = FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }
    private fun admin() = account()?.takeIf { it.isEmailVerified && AdminConfig.isAdmin(it.email) }
    private fun rewards(uid: String) = db.collection("usuarios").document(uid).collection("coin_rewards")

    fun gift(uid: String, coins: Int, callback: (Result<Unit>) -> Unit) {
        val sender = admin()
        if (sender == null || uid.isBlank() || '/' in uid || coins !in 1..com.jonsuapps.rastro.monetization.CoinRewardPolicy.MAX_REWARD) {
            callback(Result.failure(IllegalArgumentException("Elige una cuenta y entre 1 y 1000000 monedas."))); return
        }
        rewards(uid).document().set(mapOf("coins" to coins, "kind" to "GIFT", "code" to "",
            "createdAt" to FieldValue.serverTimestamp(), "grantedBy" to sender.uid))
            .addOnSuccessListener { callback(Result.success(Unit)) }.addOnFailureListener { callback(Result.failure(it)) }
    }

    fun saveCode(input: String, coins: Int, singleUser: Boolean, enabled: Boolean, callback: (Result<Unit>) -> Unit) {
        val sender = admin(); val code = CoinRewardPolicy.normalizeCode(input)
        if (sender == null || !CoinRewardPolicy.validCode(code) || coins !in 1..com.jonsuapps.rastro.monetization.CoinRewardPolicy.MAX_REWARD) {
            callback(Result.failure(IllegalArgumentException("Código: 3–32 letras, números, guion o _. Revisa las monedas."))); return
        }
        val ref = db.collection("coin_promos").document(code)
        db.runTransaction { tx ->
            val old = tx.get(ref)
            // Editing never silently releases a code already reserved for a recipient.
            tx.set(ref, mapOf("coins" to coins, "singleUser" to singleUser, "enabled" to enabled,
                "redeemedBy" to old.getString("redeemedBy"), "updatedAt" to FieldValue.serverTimestamp()))
        }.addOnSuccessListener { callback(Result.success(Unit)) }.addOnFailureListener { callback(Result.failure(it)) }
    }

    fun loadCode(input: String, callback: (Result<Triple<Int, Boolean, Boolean>>) -> Unit) {
        val code = CoinRewardPolicy.normalizeCode(input)
        if (admin() == null || !CoinRewardPolicy.validCode(code)) {
            callback(Result.failure(IllegalArgumentException("Revisa el código."))); return
        }
        db.collection("coin_promos").document(code).get(com.google.firebase.firestore.Source.SERVER)
            .addOnSuccessListener { doc ->
                val coins = doc.getLong("coins")?.takeIf { it in 1L..com.jonsuapps.rastro.monetization.CoinRewardPolicy.MAX_REWARD.toLong() }?.toInt()
                callback(if (doc.exists() && coins != null) Result.success(Triple(coins,
                    doc.getBoolean("singleUser") == true, doc.getBoolean("enabled") == true))
                else Result.failure(IllegalArgumentException("Este código aún no existe.")))
            }.addOnFailureListener { callback(Result.failure(it)) }
    }

    fun redeem(input: String, callback: (Result<Int>) -> Unit) {
        val user = account(); val code = CoinRewardPolicy.normalizeCode(input)
        if (user == null || !CoinRewardPolicy.validCode(code)) {
            callback(Result.failure(IllegalArgumentException("Inicia sesión y escribe un código válido."))); return
        }
        if (GamificationRepository.isRestoring(user.uid)) { callback(Result.failure(IllegalStateException("Espera a que termine de cargar tu progreso."))); return }
        val promo = db.collection("coin_promos").document(code)
        val receipt = rewards(user.uid).document("promo_$code")
        db.runTransaction { tx ->
            val previous = tx.get(receipt)
            val offer = tx.get(promo)
            if (previous.exists()) {
                val awarded = previous.getLong("coins") ?: 0L
                check(awarded in 1L..com.jonsuapps.rastro.monetization.CoinRewardPolicy.MAX_REWARD.toLong()) { "Recibo inválido. Contacta con el administrador." }
                return@runTransaction awarded.toInt()
            }
            val coins = offer.getLong("coins")?.toInt() ?: 0
            check(offer.getBoolean("enabled") == true && coins in 1..com.jonsuapps.rastro.monetization.CoinRewardPolicy.MAX_REWARD) { "Código inexistente o desactivado." }
            if (offer.getBoolean("singleUser") == true) {
                check(offer.getString("redeemedBy") == null) { "Este código ya fue utilizado." }
                tx.update(promo, "redeemedBy", user.uid)
            }
            tx.set(receipt, mapOf("coins" to coins, "kind" to "PROMO", "code" to code,
                "createdAt" to FieldValue.serverTimestamp(), "grantedBy" to ""))
            coins
        }.addOnSuccessListener { coins ->
            if (!sameAccount(user.uid)) { callback(Result.failure(IllegalStateException("Cambió la sesión. Actualiza regalos con la cuenta original."))); return@addOnSuccessListener }
            val awarded = GamificationManager.claimCoinGift(receipt.id, coins)
            MonetizationRepository.persistWallet()
            callback(Result.success(awarded))
        }.addOnFailureListener { callback(Result.failure(it)) }
    }

    private fun sameAccount(uid: String) = account()?.uid == uid && UserManager.currentUser.value.uid == uid && !GamificationRepository.isRestoring(uid)

    fun collect(callback: (Result<Int>) -> Unit) {
        val user = account() ?: run { callback(Result.failure(IllegalStateException("Inicia sesión para recibir regalos."))); return }
        if (GamificationRepository.isRestoring(user.uid)) { callback(Result.failure(IllegalStateException("Espera a que termine de cargar tu progreso."))); return }
        // Paged reads allow more than 100 gifts without repeatedly reading the entire ledger.
        var gained = 0
        fun page(after: com.google.firebase.firestore.DocumentSnapshot?) {
            val query = rewards(user.uid).orderBy(com.google.firebase.firestore.FieldPath.documentId()).limit(100)
            (if (after == null) query else query.startAfter(after)).get(com.google.firebase.firestore.Source.SERVER)
                .addOnSuccessListener { batch ->
                    if (!sameAccount(user.uid)) { callback(Result.failure(IllegalStateException("Cambió la sesión."))); return@addOnSuccessListener }
                    batch.documents.forEach { doc -> gained += GamificationManager.claimCoinGift(doc.id, doc.getLong("coins")?.toInt() ?: 0) }
                    MonetizationRepository.persistWallet()
                    if (batch.size() == 100) page(batch.documents.last()) else callback(Result.success(gained))
                }.addOnFailureListener { callback(Result.failure(it)) }
        }
        page(null)
    }
}

