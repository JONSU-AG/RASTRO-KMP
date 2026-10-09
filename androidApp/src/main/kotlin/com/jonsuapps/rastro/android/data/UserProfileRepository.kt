package com.jonsuapps.rastro.android.data
import com.jonsuapps.rastro.android.util.awaitResult

import android.net.Uri
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.DocumentSnapshot
import com.google.android.gms.tasks.Tasks
import com.google.firebase.Timestamp

data class ProfileConnection(val uid: String, val displayName: String, val photoUrl: String?)

object UserProfileRepository {
    /** Fill only identity needed for discovery; preserve the student's chosen name/profile. */
    suspend fun ensureAccountIdentity(user: com.google.firebase.auth.FirebaseUser) {
        if (user.isAnonymous) return
        val db = FirebaseFirestore.getInstance()
        val ref = db.collection("usuarios").document(user.uid)
        db.runTransaction { tx ->
            val existing = tx.get(ref)
            val missing = AdminUserDirectory.missingIdentity(existing.data.orEmpty(), user.email, user.displayName)
            if (missing.isNotEmpty()) tx.set(ref, missing, com.google.firebase.firestore.SetOptions.merge())
        }.let { task ->
            // Await the transaction without blocking the main thread.
            task.awaitResult()
        }
    }
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
                PublicProfileCache.update(uid, fields)
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

    fun uploadCover(uid: String, image: Uri, context: android.content.Context? = null, onComplete: (Result<String>) -> Unit) {
        val ctx = context
        if (ctx == null) {
            onComplete(Result.failure(IllegalStateException("No se pudo subir la portada.")))
            return
        }
        val bytes = try {
            ctx.contentResolver.openInputStream(image)?.use { it.readBytes() }
        } catch (_: Exception) { null }
        if (bytes == null || bytes.isEmpty()) {
            onComplete(Result.failure(IllegalStateException("No se pudo leer la imagen seleccionada.")))
            return
        }
        // La portada se sube al Drive del usuario (carpeta RASTRO), igual que Aportar.
        DriveUploadRepository.uploadUserFile(
            context = ctx,
            bytes = bytes,
            displayName = "${uid}_cover_${System.currentTimeMillis()}.jpg",
            mimeType = "image/jpeg",
            makePublic = true,
            onResult = { result ->
                result.onSuccess { file ->
                    val url = file.directUrl
                    FirebaseFirestore.getInstance().collection("usuarios").document(uid)
                        .set(mapOf("coverUrl" to url), SetOptions.merge())
                        .addOnSuccessListener { onComplete(Result.success(url)) }
                        .addOnFailureListener { onComplete(Result.failure(it)) }
                }.onFailure { onComplete(Result.failure(it)) }
            }
        )
    }

    fun uploadAvatar(uid: String, image: Uri, context: android.content.Context? = null, onComplete: (Result<String>) -> Unit) {
        val ctx = context
        if (ctx == null) {
            onComplete(Result.failure(IllegalStateException("No se pudo subir la foto.")))
            return
        }
        val bytes = try {
            ctx.contentResolver.openInputStream(image)?.use { it.readBytes() }
        } catch (_: Exception) { null }
        if (bytes == null || bytes.isEmpty()) {
            onComplete(Result.failure(IllegalStateException("No se pudo leer la imagen seleccionada.")))
            return
        }
        // La foto se sube al Drive del usuario (carpeta RASTRO), igual que Aportar.
        DriveUploadRepository.uploadUserFile(
            context = ctx,
            bytes = bytes,
            displayName = "${uid}_profile_${System.currentTimeMillis()}.jpg",
            mimeType = "image/jpeg",
            makePublic = true,
            onResult = { result ->
                result.onSuccess { file ->
                    val url = file.directUrl
                    val authUser = FirebaseAuth.getInstance().currentUser
                    val updateAuthPhoto = if (authUser?.uid == uid) {
                        authUser.updateProfile(
                            UserProfileChangeRequest.Builder()
                                .setPhotoUri(android.net.Uri.parse(url)).build()
                        )
                    } else null
                    FirebaseFirestore.getInstance().collection("usuarios").document(uid)
                        .set(mapOf("photoURL" to url), SetOptions.merge())
                        .addOnSuccessListener {
                            com.jonsuapps.rastro.auth.UserManager.applyProfileFields(photoURL = url)
                            PublicProfileCache.update(uid, mapOf("photoURL" to url, "displayName" to authUser?.displayName))
                            if (updateAuthPhoto == null) onComplete(Result.success(url))
                            else updateAuthPhoto.addOnCompleteListener { task ->
                                if (task.isSuccessful) onComplete(Result.success(url))
                                else onComplete(Result.failure(task.exception ?: IllegalStateException("No se pudo guardar la foto")))
                            }
                        }
                        .addOnFailureListener { onComplete(Result.failure(it)) }
                }.onFailure { onComplete(Result.failure(it)) }
            }
        )
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

    fun blockUser(currentUid: String, targetUid: String, block: Boolean, onComplete: (Boolean) -> Unit = {}) {
        if (currentUid.isBlank() || targetUid.isBlank() || currentUid == targetUid) {
            onComplete(false)
            return
        }
        val db = FirebaseFirestore.getInstance()
        val value = if (block) com.google.firebase.firestore.FieldValue.arrayUnion(targetUid)
                    else com.google.firebase.firestore.FieldValue.arrayRemove(targetUid)
        if (block) {
            toggleFollow(currentUid, targetUid, follow = false)
        }
        db.collection("usuarios").document(currentUid)
            .set(mapOf("blockedUsers" to value), SetOptions.merge())
            .addOnSuccessListener { onComplete(true) }
            .addOnFailureListener { onComplete(false) }
    }

    // ──────────────── RACHA DUAL & AMIGOS ────────────────
    fun inviteDualStreak(senderUid: String, friendUid: String, senderName: String, onComplete: (Boolean) -> Unit) {
        if (senderUid.isBlank() || friendUid.isBlank() || senderUid == friendUid || FirebaseAuth.getInstance().currentUser?.uid != senderUid) return onComplete(false)
        val db = FirebaseFirestore.getInstance()
        val streakId = listOf(senderUid, friendUid).sorted().joinToString("_")
        val ref = db.collection("racha_dual").document(streakId)
        db.runTransaction { tx ->
            val existing = tx.get(ref)
            check(existing.getString("status") != "active") { "Ya son amigos." }
            if (existing.getString("status") == "pending") {
                check(existing.getString("user1Uid") == senderUid) { "Acepta la solicitud recibida en Mis Amigos." }
                return@runTransaction Unit
            }
            val sender = tx.get(db.collection("usuarios").document(senderUid))
            val friend = tx.get(db.collection("usuarios").document(friendUid))
            val name = sender.getString("displayName")?.takeIf { it.isNotBlank() } ?: senderName
            val friendName = friend.getString("displayName")?.takeIf { it.isNotBlank() } ?: "Estudiante RASTRO"
            tx.set(ref, mapOf("id" to streakId, "user1Uid" to senderUid, "user2Uid" to friendUid,
                "participants" to listOf(senderUid, friendUid), "senderName" to name, "recipientName" to friendName,
                "status" to "pending", "streakDays" to 0, "updatedAt" to com.google.firebase.firestore.FieldValue.serverTimestamp()), SetOptions.merge())
            tx.set(db.collection("notificaciones").document("friend_request_$streakId"),
                friendNotification(senderUid, friendUid, name, "Solicitud de amistad", "$name te envió una solicitud de amistad.", "friend_request", streakId))
        }.addOnSuccessListener { onComplete(true) }.addOnFailureListener { onComplete(false) }
    }

    // Two bounded participant queries also include invitations saved before 'participants' existed.
    fun observeDualStreaks(uid: String, onStreaks: (List<Map<String, Any>>) -> Unit,
        onError: (String) -> Unit = {}): List<ListenerRegistration> {
        val sides = mutableMapOf<String, List<Map<String, Any>>>()
        return listOf("user1Uid", "user2Uid", "participants").map { field ->
            val collection = FirebaseFirestore.getInstance().collection("racha_dual")
            val query = if (field == "participants") collection.whereArrayContains(field, uid) else collection.whereEqualTo(field, uid)
            query.limit(100)
                .addSnapshotListener { snap, error ->
                    if (error != null) { onError("No se pudieron cargar las solicitudes. Inténtalo de nuevo."); return@addSnapshotListener }
                    sides[field] = snap?.documents.orEmpty().map { it.data.orEmpty() + ("id" to it.id) }
                    onStreaks(sides.values.flatten().distinctBy { it["id"] })
                }
        }
    }

    fun acceptDualStreak(streakId: String, onComplete: (Boolean) -> Unit) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return onComplete(false)
        val db = FirebaseFirestore.getInstance()
        val ref = db.collection("racha_dual").document(streakId)
        db.runTransaction { tx ->
            val data = tx.get(ref)
            check(data.getString("user2Uid") == uid) { "Solo el destinatario puede aceptar." }
            if (data.getString("status") == "active") return@runTransaction Unit
            check(data.getString("status") == "pending") { "La solicitud ya no está pendiente." }
            val senderUid = data.getString("user1Uid") ?: error("Solicitud incompleta")
            val sender = tx.get(db.collection("usuarios").document(senderUid))
            val recipient = tx.get(db.collection("usuarios").document(uid))
            val senderName = sender.getString("displayName") ?: data.getString("senderName") ?: "Estudiante RASTRO"
            val recipientName = recipient.getString("displayName") ?: data.getString("recipientName") ?: "Estudiante RASTRO"
            tx.update(ref, mapOf("status" to "active", "senderName" to senderName, "recipientName" to recipientName,
                "participants" to listOf(senderUid, uid), "updatedAt" to com.google.firebase.firestore.FieldValue.serverTimestamp()))
            tx.set(db.collection("notificaciones").document("friend_active_${streakId}_$senderUid"),
                friendNotification(uid, senderUid, recipientName, "Amistad activa", "$recipientName aceptó tu solicitud. Racha de amigos activa con $recipientName.", "friend_active", streakId))
            tx.set(db.collection("notificaciones").document("friend_active_${streakId}_$uid"),
                friendNotification(uid, uid, senderName, "Amistad activa", "Racha de amigos activa con $senderName.", "friend_active", streakId))
        }.addOnSuccessListener { refreshOwnSharedDay(uid); onComplete(true) }.addOnFailureListener { onComplete(false) }
    }

    fun rejectDualStreak(streakId: String, onComplete: (Boolean) -> Unit) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return onComplete(false)
        val db = FirebaseFirestore.getInstance()
        val ref = db.collection("racha_dual").document(streakId)
        db.runTransaction { tx ->
            val data = tx.get(ref)
            check(data.getString("user2Uid") == uid && data.getString("status") == "pending")
            tx.update(ref, "status", "rejected")
            val senderUid = data.getString("user1Uid") ?: error("Solicitud incompleta")
            val name = data.getString("recipientName") ?: "Estudiante RASTRO"
            tx.set(db.collection("notificaciones").document("friend_rejected_$streakId"),
                friendNotification(uid, senderUid, name, "Solicitud respondida", "$name no aceptó la solicitud de amistad.", "friend_rejected", streakId))
        }.addOnSuccessListener { onComplete(true) }.addOnFailureListener { onComplete(false) }
    }

    /** Groups extend the existing streak collection and accepted friendship records. */
    fun createGroupStreak(friendUids: Set<String>, onComplete: (Boolean) -> Unit) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return onComplete(false)
        val members = (friendUids + uid).sorted()
        if (members.size !in 2..10) return onComplete(false)
        val db = FirebaseFirestore.getInstance()
        val ref = db.collection("racha_dual").document()
        db.runTransaction { tx ->
            val people = members.associateWith { tx.get(db.collection("usuarios").document(it)) }
            friendUids.forEach { other ->
                val friendship = tx.get(db.collection("racha_dual").document(listOf(uid, other).sorted().joinToString("_")))
                check(friendship.getString("status") == "active") { "Elige amigos que hayan aceptado." }
            }
            val name = people[uid]?.getString("displayName") ?: "Estudiante RASTRO"
            tx.set(ref, mapOf("id" to ref.id, "type" to "group", "user1Uid" to uid, "user2Uid" to members.first { it != uid },
                "participants" to members, "accepted" to mapOf(uid to true), "dailyActivity" to emptyMap<String, Any>(),
                "memberNames" to people.mapValues { it.value.getString("displayName") ?: "Estudiante RASTRO" },
                "status" to "pending", "streakDays" to 0))
            friendUids.forEach { other -> tx.set(db.collection("notificaciones").document("group_request_${ref.id}_$other"),
                friendNotification(uid, other, name, "Invitación a racha grupal", "$name te invitó a una racha de ${members.size} amigos.", "group_request", ref.id)) }
        }.addOnSuccessListener { onComplete(true) }.addOnFailureListener { onComplete(false) }
    }

    fun respondGroupStreak(id: String, accept: Boolean, onComplete: (Boolean) -> Unit) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return onComplete(false)
        val db = FirebaseFirestore.getInstance()
        val ref = db.collection("racha_dual").document(id)
        db.runTransaction { tx ->
            val data = tx.get(ref)
            val members = data.get("participants") as? List<*> ?: error("Grupo incompleto")
            check(uid in members && data.getString("type") == "group")
            val accepted = (data.get("accepted") as? Map<*, *>).orEmpty().entries.associate { it.key.toString() to it.value }.toMutableMap()
            check(accepted[uid] != true)
            accepted[uid] = accept
            val status = if (!accept) "rejected" else if (members.all { accepted[it] == true }) "active" else "pending"
            tx.update(ref, mapOf("accepted" to accepted, "status" to status))
            if (status == "active") {
                val names = (data.get("memberNames") as? Map<*, *>).orEmpty()
                members.filterIsInstance<String>().forEach { member ->
                    tx.set(db.collection("notificaciones").document("group_active_${id}_$member"), friendNotification(uid, member,
                        names[uid]?.toString() ?: "Estudiante RASTRO", "Racha grupal activa",
                        "Tu racha grupal con ${members.filter { it != member }.joinToString { names[it]?.toString() ?: "Estudiante RASTRO" }} está activa.", "group_active", id))
                }
            }
        }.addOnSuccessListener { refreshOwnSharedDay(uid); onComplete(true) }.addOnFailureListener { onComplete(false) }
    }

    private val sharedCheckpoints = mutableMapOf<String, Long>()
    private fun refreshOwnSharedDay(uid: String) {
        val day = java.time.LocalDate.now().toString()
        if (day in com.jonsuapps.rastro.gamification.GamificationManager.state.value.activityDates) {
            sharedCheckpoints.remove("$uid:$day")
            recordSharedStudyDay(uid, day)
        }
    }
    fun recordSharedStudyDay(uid: String, day: String) {
        if (FirebaseAuth.getInstance().currentUser?.uid != uid) return
        val key = "$uid:$day"
        val now = android.os.SystemClock.elapsedRealtime()
        if (sharedCheckpoints[key]?.let { now - it < 24 * 60 * 60_000L } == true) return
        sharedCheckpoints[key] = now
        val collection = FirebaseFirestore.getInstance().collection("racha_dual")
        val queries = listOf(collection.whereArrayContains("participants", uid),
            collection.whereEqualTo("user1Uid", uid), collection.whereEqualTo("user2Uid", uid))
        com.google.android.gms.tasks.Tasks.whenAllSuccess<com.google.firebase.firestore.QuerySnapshot>(
            queries.map { it.limit(100).get() })
            .addOnFailureListener { sharedCheckpoints.remove(key) }
            .addOnSuccessListener { snapshots -> snapshots.flatMap { it.documents }.distinctBy { it.id }
                .filter { it.getString("status") == "active" &&
                    ((it.get("dailyActivity") as? Map<*, *>)?.get(uid) as? Map<*, *>)?.get(day) != true }.forEach { doc ->
                doc.reference.update(com.google.firebase.firestore.FieldPath.of("dailyActivity", uid, day), true)
                    .addOnFailureListener { sharedCheckpoints.remove(key) }
            } }

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
