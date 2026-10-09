package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

/** Seen state is scoped to the account, not to the installation. No backlog after expiry. */
object EntryNoticeRepository {
    /** One transaction on the first shown ad of a day; same account across devices. */
    fun claimDailyAdSupport(uid: String, day: String, callback: (Boolean) -> Unit) {
        val user = FirebaseAuth.getInstance().currentUser
        if (user?.uid != uid) { callback(false); return }
        if (user.isAnonymous) { callback(true); return }
        val ref = FirebaseFirestore.getInstance().collection("usuarios").document(uid)
            .collection("gamificacion").document("entry_notices")
        FirebaseFirestore.getInstance().runTransaction { transaction ->
            if (transaction.get(ref).getString("lastAdSupportDay") == day) false
            else { transaction.set(ref, mapOf("lastAdSupportDay" to day), SetOptions.merge()); true }
        }.addOnSuccessListener { callback(it) }.addOnFailureListener { callback(false) }
    }
    fun seen(uid: String, callback: (Set<String>) -> Unit) = FirebaseFirestore.getInstance().collection("usuarios").document(uid)
        .collection("gamificacion").document("entry_notices").addSnapshotListener { doc, error ->
            if(error == null) callback((doc?.get("seen") as? List<*>)?.filterIsInstance<String>()?.toSet().orEmpty() +
                com.jonsuapps.rastro.android.RastroApplication.instance.getSharedPreferences("rastro_notice_seen",android.content.Context.MODE_PRIVATE).getStringSet(uid,emptySet()).orEmpty())
        }
    fun mark(uid: String, id: String) {
        if(uid.isBlank()) return
        val prefs = com.jonsuapps.rastro.android.RastroApplication.instance.getSharedPreferences("rastro_notice_seen",android.content.Context.MODE_PRIVATE)
        prefs.edit().putStringSet(uid,prefs.getStringSet(uid,emptySet()).orEmpty() + id).apply()
        FirebaseFirestore.getInstance().collection("usuarios").document(uid).collection("gamificacion").document("entry_notices")
            .set(mapOf("seen" to com.google.firebase.firestore.FieldValue.arrayUnion(id)), SetOptions.merge())
    }
    fun welcome(callback: (RastroNotification?) -> Unit) = FirebaseFirestore.getInstance().collection("site_settings").document("welcome")
        .addSnapshotListener { doc, error ->
            val user = FirebaseAuth.getInstance().currentUser
            val created = user?.metadata?.creationTimestamp ?: 0L
            val start = doc?.getLong("startsAt") ?: Long.MAX_VALUE
            val eligible = error == null && doc?.getBoolean("enabled") == true && user != null && !user.isAnonymous && created >= start
            callback(if(eligible) RastroNotification("welcome",doc?.getString("title") ?: "Bienvenido a RASTRO",doc?.getString("message").orEmpty(),"bienvenida","RASTRO",created,false,isBroadcast=true) else null)
        }
}
