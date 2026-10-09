package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.gamification.GamificationStateCodec
import com.jonsuapps.rastro.android.RastroApplication
import kotlinx.serialization.encodeToString
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.gamification.GamificationState
import com.jonsuapps.rastro.gamification.LessonCompletion

/** Android Firestore persistence for the shared, platform-independent learning state. */
object GamificationRepository {
    fun isVerifiedAdmin(uid: String): Boolean {
        val user = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser
        return user != null && user.uid == uid && !user.isAnonymous && user.isEmailVerified &&
            com.jonsuapps.rastro.auth.AdminConfig.isAdmin(user.email)
    }
    private var restoringUid: String? = null
    fun isRestoring(uid: String): Boolean = restoringUid == uid
    fun beginRestore(uid: String) { restoringUid = uid }
    fun finishRestore(uid: String) { if (restoringUid == uid) restoringUid = null }

    fun saveLocal(uid: String, state: GamificationState) {
        RastroApplication.instance.getSharedPreferences("rastro_learning", android.content.Context.MODE_PRIVATE)
            .edit().putString(uid.ifBlank { "guest" }, GamificationStateCodec.encode(state)).apply()
        val authUser = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser
        val today = com.jonsuapps.rastro.gamification.GamificationManager.getLocalDayString()
        if (authUser?.uid == uid && !authUser.isAnonymous && today in state.activityDates)
            UserProfileRepository.recordSharedStudyDay(uid, today)
    }

    fun loadLocal(uid: String): GamificationState? = runCatching {
        val raw = RastroApplication.instance.getSharedPreferences("rastro_learning", android.content.Context.MODE_PRIVATE)
            .getString(uid.ifBlank { "guest" }, null) ?: return@runCatching null
        StreakActivityMigration.reconstruct(GamificationStateCodec.decode(raw))
    }.getOrNull()

    fun load(uid: String, onComplete: (Result<GamificationState?>) -> Unit) {
        if (uid.isBlank()) {
            onComplete(Result.failure(IllegalArgumentException("uid vacío")))
            return
        }
        FirebaseFirestore.getInstance()
            .collection("usuarios").document(uid)
            .collection("gamificacion").document("rastro_progress")
            .get(com.google.firebase.firestore.Source.SERVER)
            .addOnSuccessListener { document ->
                CloudBackupRepository.rememberRevision(uid, document.getLong("syncRevision") ?: 0L)
                if (!document.exists()) {
                    onComplete(Result.success(null))
                    return@addOnSuccessListener
                }
                val rawLessons = document.get("completedLessons") as? Map<*, *> ?: emptyMap<Any, Any>()
                val lessons = rawLessons.mapNotNull { (id, value) ->
                    val fields = value as? Map<*, *> ?: return@mapNotNull null
                    val lessonId = id as? String ?: return@mapNotNull null
                    lessonId to LessonCompletion(
                        stars = (fields["stars"] as? Number)?.toInt() ?: 0,
                        completedAt = (fields["completedAt"] as? Number)?.toLong() ?: 0L,
                        skipped = fields["skipped"] as? Boolean ?: false,
                        earnedCoins = (fields["earnedCoins"] as? Number)?.toInt() ?: 0,
                        lastRewardAttemptId = fields["lastRewardAttemptId"] as? String ?: ""
                    )
                }.toMap()
                @Suppress("UNCHECKED_CAST")
                val activityDatesList = document.get("activityDates") as? List<String>
                val streakVal = (document.getLong("streak") ?: 1L).toInt()
                val bestStreakVal = (document.getLong("bestStreak") ?: streakVal.toLong()).toInt()

                val state = GamificationState(
                    xp = (document.getLong("xp") ?: 50L).toInt(),
                    coins = (document.getLong("coins") ?: 0L).toInt().coerceAtLeast(0),
                    streak = streakVal,
                    bestStreak = maxOf(bestStreakVal, streakVal),
                    lastStudyDate = document.getString("lastActiveDate").orEmpty(),
                    streakFreeze = (document.getLong("streakFreeze") ?: 1L).toInt(),
                    hearts = (document.getLong("hearts") ?: 5L).toInt(),
                    completedLessons = lessons,
                    unlockedNodes = document.get("unlockedNodes") as? List<String> ?: listOf("node_0"),
                    achievements = document.get("achievements") as? List<String> ?: emptyList(),
                    claimedTopicRewards = document.get("claimedTopicRewards") as? List<String> ?: emptyList(),
                    claimedExamRewards = document.get("claimedExamRewards") as? List<String> ?: emptyList(),
                    coinRewardReceipts = (document.get("coinRewardReceipts") as? List<*>)?.filterIsInstance<String>()?.toSet().orEmpty(),
                    activeLessonBySubject = (document.get("activeLessonBySubject") as? Map<*, *>)?.entries
                        ?.mapNotNull { (k, v) -> if (k is String && v is String) k to v else null }?.toMap() ?: emptyMap(),
                    activeStudyDate = document.getString("activeStudyDate").orEmpty(),
                    activeStudySeconds = (document.getLong("activeStudySeconds") ?: 0L).toInt(),
                    streakActivityVersion = (document.getLong("streakActivityVersion") ?: 0L).toInt(),
                    activityDates = activityDatesList?.toSet() ?: emptySet(),
                    rewardPacks = document.getString("rewardPacksJson")?.let { raw -> runCatching {
                        kotlinx.serialization.json.Json { ignoreUnknownKeys = true }.decodeFromString<Map<String,com.jonsuapps.rastro.monetization.RewardPackProgress>>(raw)
                    }.getOrNull() }.orEmpty(),
                    economyAttempts = (document.get("economyAttempts") as? List<*>)?.mapNotNull { item ->
                        val m = item as? Map<*, *> ?: return@mapNotNull null
                        val id = m["id"] as? String ?: return@mapNotNull null
                        com.jonsuapps.rastro.monetization.EconomyAttempt(id, m["kind"] as? String ?: "", (m["cost"] as? Number)?.toInt() ?: 0, m["proGrantId"] as? String ?: "")
                    }.orEmpty(),
                    maxHearts = (document.getLong("maxHearts") ?: 5L).toInt(),
                    lastHeartLostTimestamp = document.getLong("lastHeartLostTimestamp") ?: 0L,
                    lifeRecoveryAmount = document.getLong("lifeRecoveryAmount") ?: 3L,
                    lifeRecoveryUnit = document.getString("lifeRecoveryUnit") ?: "MINUTOS"
                )
                if (state.streakActivityVersion >= StreakActivityMigration.VERSION && !isVerifiedAdmin(uid)) onComplete(Result.success(StreakActivityMigration.reconstruct(state)))
                else document.reference.parent.parent?.get()?.addOnSuccessListener { profile ->
                    val recovered = StreakActivityMigration.recover(state, profile.data.orEmpty())
                    onComplete(Result.success(StreakActivityMigration.recoverAdminAccess(recovered, profile.data.orEmpty(), isVerifiedAdmin(uid))))
                }?.addOnFailureListener { onComplete(Result.success(state)) }
                    ?: onComplete(Result.success(state))
            }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    /** Two reads once per updated account; never replaces wallet, lessons or cloud backup. */
    fun recoverSavedStreak(uid: String, onComplete: (Result<GamificationState>) -> Unit) {
        val auth = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser
        if (auth?.uid != uid || auth.isAnonymous) return
        val profile = FirebaseFirestore.getInstance().collection("usuarios").document(uid)
        profile.collection("gamificacion").document("rastro_progress")
            .get(com.google.firebase.firestore.Source.SERVER).addOnSuccessListener { progress ->
                profile.get(com.google.firebase.firestore.Source.SERVER).addOnSuccessListener { data ->
                    if (com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.uid != uid ||
                        com.jonsuapps.rastro.auth.UserManager.currentUser.value.uid != uid) return@addOnSuccessListener
                    val current = com.jonsuapps.rastro.gamification.GamificationManager.state.value
                    val lessons = (progress.get("completedLessons") as? Map<*, *>)?.mapNotNull { (key,value) ->
                        val fields=value as? Map<*, *> ?: return@mapNotNull null
                        val id=key as? String ?: return@mapNotNull null
                        id to LessonCompletion(stars=0, completedAt=(fields["completedAt"] as? Number)?.toLong() ?: 0L,
                            skipped=fields["skipped"] as? Boolean ?: false)
                    }?.toMap().orEmpty()
                    val old = StreakActivityMigration.reconstruct(GamificationState(
                        streak = (progress.getLong("streak") ?: 0L).toInt().coerceAtLeast(0),
                        lastStudyDate = progress.getString("lastActiveDate").orEmpty(),
                        completedLessons = lessons,
                        activityDates = (progress.get("activityDates") as? List<*>)?.filterIsInstance<String>()?.toSet().orEmpty()))
                    val evidence = current.copy(activityDates = current.activityDates + old.activityDates,
                        bestStreak = maxOf(current.bestStreak, old.bestStreak))
                    val recovered = StreakActivityMigration.recover(evidence, data.data.orEmpty())
                    onComplete(Result.success(StreakActivityMigration.recoverAdminAccess(recovered, data.data.orEmpty(), isVerifiedAdmin(uid))))
                }.addOnFailureListener { onComplete(Result.failure(it)) }
            }.addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun save(uid: String, state: GamificationState, onComplete: (Result<Unit>) -> Unit = {}) {
        saveLocal(uid, state)
        onComplete(Result.success(Unit))
    }

    /** Explicit personal backup only. Social writes have their own repositories. */
    fun saveCloud(uid: String, state: GamificationState, onComplete: (Result<Unit>) -> Unit = {}) {
        saveLocal(uid, state)
        val authenticated = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser
        if (!CloudSyncPolicy.canWrite(uid, authenticated?.uid, authenticated?.isAnonymous != false)) {
            onComplete(Result.failure(IllegalStateException("Inicia sesión con tu cuenta para sincronizar.")))
            return
        }
        if (restoringUid == uid) {
            onComplete(Result.failure(IllegalStateException("Espera a que se recupere el progreso de tu cuenta.")))
            return
        }
        if (uid.isBlank()) {
            onComplete(Result.failure(IllegalArgumentException("uid vacío")))
            return
        }
        val lessonData = state.completedLessons.mapValues { (_, lesson) ->
            mapOf("stars" to lesson.stars, "completedAt" to lesson.completedAt, "skipped" to lesson.skipped, "earnedCoins" to lesson.earnedCoins, "lastRewardAttemptId" to lesson.lastRewardAttemptId)
        }
        val payload = mapOf(
            "streak" to state.streak,
            "bestStreak" to state.bestStreak,
            "lastActiveDate" to state.lastStudyDate,
            "streakFreeze" to state.streakFreeze,
            "xp" to state.xp,
            "coins" to state.coins,
            "rewardPacksJson" to kotlinx.serialization.json.Json.encodeToString(state.rewardPacks),
            "economyAttempts" to state.economyAttempts.map { mapOf("id" to it.id, "kind" to it.kind, "cost" to it.cost, "proGrantId" to it.proGrantId) },
            "hearts" to state.hearts,
            "maxHearts" to state.maxHearts,
            "lastHeartLostTimestamp" to state.lastHeartLostTimestamp,
            "lifeRecoveryAmount" to state.lifeRecoveryAmount,
            "lifeRecoveryUnit" to state.lifeRecoveryUnit,
            "completedLessons" to lessonData,
            "unlockedNodes" to state.unlockedNodes,
            "achievements" to state.achievements,
            "claimedTopicRewards" to state.claimedTopicRewards,
            "claimedExamRewards" to state.claimedExamRewards,
            "coinRewardReceipts" to state.coinRewardReceipts.toList(),
            "activeLessonBySubject" to state.activeLessonBySubject,
            "activeStudyDate" to state.activeStudyDate,
            "activeStudySeconds" to state.activeStudySeconds,
            "streakActivityVersion" to state.streakActivityVersion,
            "activityDates" to state.activityDates.toList()
        )
        val db = FirebaseFirestore.getInstance()
        val profile = db.collection("usuarios").document(uid)
        val progress = profile.collection("gamificacion").document("rastro_progress")
        val expectedRevision = CloudBackupRepository.revision(uid)
        val nextRevision = maxOf(System.currentTimeMillis(), expectedRevision + 1)
        db.runTransaction { tx ->
            val previous = tx.get(progress)
            check(!previous.exists() || CloudBackupRepository.hasRevision(uid)) {
                "Esta cuenta ya tiene un respaldo. Recupera la copia de la nube antes de sincronizar; el avance local se conserva."
            }
            check(!CloudSyncPolicy.conflict(expectedRevision, previous.getLong("syncRevision") ?: 0L)) {
                "El respaldo cambió en otro dispositivo. Recupera la copia de la nube antes de volver a sincronizar; no se sobrescribió tu avance."
            }
            val savedDate = previous.getString("lastActiveDate").orEmpty()
            val savedStreak = (previous.getLong("streak") ?: 0).toInt()
            val mergedPayload = payload.toMutableMap()
            mergedPayload["syncRevision"] = nextRevision
            mergedPayload["activityDates"] = ((previous.get("activityDates") as? List<*>)?.filterIsInstance<String>().orEmpty() + state.activityDates).distinct()
            mergedPayload["bestStreak"] = maxOf(state.bestStreak, (previous.getLong("bestStreak") ?: 0).toInt(), savedStreak)
            if(savedDate > state.lastStudyDate) {
                mergedPayload["lastActiveDate"] = savedDate; mergedPayload["streak"] = savedStreak
            } else if(savedDate == state.lastStudyDate) mergedPayload["streak"] = maxOf(savedStreak,state.streak)
            tx.set(progress, mergedPayload, SetOptions.merge())
        // Public ranking summary. Private lesson/answer maps remain in the existing progress document.
        val authUser = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser
        if (authUser?.uid == uid && !authUser.isAnonymous) tx.set(profile, mapOf(
            "leagueId" to com.jonsuapps.rastro.model.LeagueCatalog.current(state.xp).id,
            "leagueXp" to state.xp.coerceAtLeast(0), "leagueStreak" to (mergedPayload["streak"] as Int).coerceAtLeast(0)
        ), SetOptions.merge())
            Unit
        }.addOnSuccessListener {
                CloudBackupRepository.rememberRevision(uid, nextRevision)
                val today = com.jonsuapps.rastro.gamification.GamificationManager.getLocalDayString()
                if (today in state.activityDates) UserProfileRepository.recordSharedStudyDay(uid, today)
                onComplete(Result.success(Unit))
            }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }
}
