package com.jonsuapps.rastro.android.data

import android.net.Uri
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.SetOptions
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.firestore.DocumentSnapshot
import com.google.android.gms.tasks.Tasks
import com.google.firebase.Timestamp

data class ProfileConnection(val uid: String, val displayName: String, val photoUrl: String?)

object UserProfileRepository {
    fun loadConnections(uid: String, followers: Boolean, onComplete: (List<ProfileConnection>) -> Unit) {
        val db = FirebaseFirestore.getInstance()
        val field = if (followers) "followedUid" else "followerUid"
        val memberField = if (followers) "followerUid" else "followedUid"
        db.collection("siguiendo").whereEqualTo(field, uid).get()
            .addOnSuccessListener { snapshot ->
                val memberIds = snapshot.documents.mapNotNull { it.getString(memberField) }.distinct()
                if (memberIds.isEmpty()) {
                    onComplete(emptyList())
                    return@addOnSuccessListener
                }
                val profileTasks = memberIds.map { db.collection("usuarios").document(it).get() }
                Tasks.whenAllSuccess<DocumentSnapshot>(profileTasks)
                    .addOnSuccessListener { profiles ->
                        onComplete(profiles.mapNotNull { profile ->
                            if (!profile.exists()) return@mapNotNull null
                            ProfileConnection(
                                uid = profile.id,
                                displayName = profile.getString("displayName") ?: "Estudiante RASTRO",
                                photoUrl = profile.getString("photoURL")
                            )
                        })
                    }
                    .addOnFailureListener { onComplete(emptyList()) }
            }
            .addOnFailureListener { onComplete(emptyList()) }
    }

    fun observeConnections(uid: String, onCounts: (Int, Int) -> Unit): Pair<ListenerRegistration, ListenerRegistration> {
        var followers = 0
        var following = 0
        val db = FirebaseFirestore.getInstance()
        val followersListener = db.collection("siguiendo").whereEqualTo("followedUid", uid)
            .addSnapshotListener { snapshot, error ->
                if (error == null && snapshot != null) {
                    followers = snapshot.size()
                    onCounts(followers, following)
                }
            }
        val followingListener = db.collection("siguiendo").whereEqualTo("followerUid", uid)
            .addSnapshotListener { snapshot, error ->
                if (error == null && snapshot != null) {
                    following = snapshot.size()
                    onCounts(followers, following)
                }
            }
        return followersListener to followingListener
    }

    fun observe(uid: String, onProfile: (Map<String, Any?>) -> Unit): ListenerRegistration =
        FirebaseFirestore.getInstance().collection("usuarios").document(uid)
            .addSnapshotListener { snapshot, error ->
                if (error == null && snapshot?.exists() == true) {
                    onProfile(snapshot.data.orEmpty())
                }
            }

    fun save(uid: String, fields: Map<String, Any>, onComplete: (Result<Unit>) -> Unit) {
        FirebaseFirestore.getInstance().collection("usuarios").document(uid)
            .set(fields, SetOptions.merge())
            .addOnSuccessListener {
                val newName = fields["displayName"] as? String
                val authUser = FirebaseAuth.getInstance().currentUser
                if (!newName.isNullOrBlank() && authUser?.uid == uid) {
                    val request = UserProfileChangeRequest.Builder().setDisplayName(newName).build()
                    authUser.updateProfile(request).addOnCompleteListener { onComplete(Result.success(Unit)) }
                } else {
                    onComplete(Result.success(Unit))
                }
            }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun uploadCover(uid: String, image: Uri, onComplete: (Result<String>) -> Unit) {
        val fileName = "${uid}_cover_${System.currentTimeMillis()}.jpg"
        val reference = FirebaseStorage.getInstance().reference.child("avatars/$fileName")
        val metadata = com.google.firebase.storage.StorageMetadata.Builder()
            .setContentType("image/jpeg")
            .build()
        reference.putFile(image, metadata)
            .continueWithTask { task ->
                if (!task.isSuccessful) throw task.exception ?: IllegalStateException("Falló la subida de portada")
                reference.downloadUrl
            }
            .addOnSuccessListener { uri ->
                val url = uri.toString()
                FirebaseFirestore.getInstance().collection("usuarios").document(uid)
                    .set(mapOf("coverUrl" to url), SetOptions.merge())
                    .addOnSuccessListener { onComplete(Result.success(url)) }
                    .addOnFailureListener { onComplete(Result.failure(it)) }
            }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun uploadAvatar(uid: String, image: Uri, onComplete: (Result<String>) -> Unit) {
        val fileName = "${uid}_profile_${System.currentTimeMillis()}.jpg"
        val reference = FirebaseStorage.getInstance().reference.child("avatars/$fileName")
        val metadata = com.google.firebase.storage.StorageMetadata.Builder()
            .setContentType("image/jpeg")
            .build()
        reference.putFile(image, metadata)
            .continueWithTask { task ->
                if (!task.isSuccessful) throw task.exception ?: IllegalStateException("Falló la subida de la foto")
                reference.downloadUrl
            }
            .addOnSuccessListener { uri ->
                val url = uri.toString()
                val authUser = FirebaseAuth.getInstance().currentUser
                val updateAuthPhoto = if (authUser?.uid == uid) {
                    authUser.updateProfile(UserProfileChangeRequest.Builder().setPhotoUri(uri).build())
                } else null
                FirebaseFirestore.getInstance().collection("usuarios").document(uid)
                    .set(mapOf("photoURL" to url), SetOptions.merge())
                    .addOnSuccessListener {
                        if (updateAuthPhoto == null) onComplete(Result.success(url))
                        else updateAuthPhoto.addOnCompleteListener { task ->
                            if (task.isSuccessful) onComplete(Result.success(url))
                            else onComplete(Result.failure(task.exception ?: IllegalStateException("No se pudo guardar la foto")))
                        }
                    }
                    .addOnFailureListener { onComplete(Result.failure(it)) }
            }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun toggleFollow(followerUid: String, followedUid: String, follow: Boolean, onComplete: (Boolean) -> Unit = {}) {
        if (followerUid.isBlank() || followedUid.isBlank() || followerUid == followedUid) return
        val db = FirebaseFirestore.getInstance()
        val docId = "${followerUid}_${followedUid}"
        if (follow) {
            db.collection("siguiendo").document(docId).set(
                mapOf(
                    "followerUid" to followerUid,
                    "followedUid" to followedUid,
                    "timestamp" to com.google.firebase.Timestamp.now()
                )
            ).addOnSuccessListener { onComplete(true) }
             .addOnFailureListener { onComplete(false) }
        } else {
            db.collection("siguiendo").document(docId).delete()
                .addOnSuccessListener { onComplete(true) }
                .addOnFailureListener { onComplete(false) }
        }
    }

    fun observeIsFollowing(followerUid: String, followedUid: String, onResult: (Boolean) -> Unit): ListenerRegistration? {
        if (followerUid.isBlank() || followedUid.isBlank() || followerUid == followedUid) {
            onResult(false)
            return null
        }
        val db = FirebaseFirestore.getInstance()
        val docId = "${followerUid}_${followedUid}"
        return db.collection("siguiendo").document(docId).addSnapshotListener { snapshot, error ->
            onResult(error == null && snapshot?.exists() == true)
        }
    }

    // ──────────────── RACHA DUAL & AMIGOS ────────────────
    fun inviteDualStreak(senderUid: String, friendUid: String, senderName: String, onComplete: (Boolean) -> Unit) {
        if (senderUid.isBlank() || friendUid.isBlank() || senderUid == friendUid) return onComplete(false)
        val db = FirebaseFirestore.getInstance()
        val streakId = if (senderUid < friendUid) "${senderUid}_${friendUid}" else "${friendUid}_${senderUid}"
        val data = mapOf(
            "id" to streakId,
            "user1Uid" to senderUid,
            "user2Uid" to friendUid,
            "senderName" to senderName,
            "status" to "pending",
            "streakDays" to 1,
            "updatedAt" to Timestamp.now()
        )
        db.collection("racha_dual").document(streakId).set(data, SetOptions.merge())
            .addOnSuccessListener { onComplete(true) }
            .addOnFailureListener { onComplete(false) }
    }

    fun observeDualStreaks(uid: String, onStreaks: (List<Map<String, Any>>) -> Unit): ListenerRegistration {
        val db = FirebaseFirestore.getInstance()
        return db.collection("racha_dual").whereArrayContains("participants", uid)
            .addSnapshotListener { snap, _ ->
                if (snap != null) {
                    onStreaks(snap.documents.map { doc -> doc.data.orEmpty() + ("id" to doc.id) })
                }
            }
    }

    fun acceptDualStreak(streakId: String, onComplete: (Boolean) -> Unit) {
        FirebaseFirestore.getInstance().collection("racha_dual").document(streakId)
            .set(mapOf("status" to "active"), SetOptions.merge())
            .addOnSuccessListener { onComplete(true) }
            .addOnFailureListener { onComplete(false) }
    }

    fun searchUsers(query: String, onResult: (List<ProfileConnection>) -> Unit) {
        val clean = query.trim().lowercase()
        if (clean.isBlank()) return onResult(emptyList())
        FirebaseFirestore.getInstance().collection("usuarios").get()
            .addOnSuccessListener { snap ->
                val matches = snap.documents.mapNotNull { doc ->
                    val name = doc.getString("displayName").orEmpty()
                    val email = doc.getString("email").orEmpty()
                    val photo = doc.getString("photoURL")
                    if (name.lowercase().contains(clean) || email.lowercase().contains(clean) || doc.id.lowercase() == clean) {
                        ProfileConnection(doc.id, name.ifBlank { "Estudiante RASTRO" }, photo)
                    } else null
                }
                onResult(matches)
            }
            .addOnFailureListener { onResult(emptyList()) }
    }
}
