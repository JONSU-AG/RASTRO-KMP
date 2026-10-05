package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.gamification.GamificationStateCodec
import com.jonsuapps.rastro.android.RastroApplication
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.jonsuapps.rastro.gamification.GamificationState
import com.jonsuapps.rastro.gamification.LessonCompletion

/** Android Firestore persistence for the shared, platform-independent learning state. */
object GamificationRepository {
    private var restoringUid: String? = null
    fun beginRestore(uid: String) { restoringUid = uid }
    fun finishRestore(uid: String) { if (restoringUid == uid) restoringUid = null }

    fun saveLocal(uid: String, state: GamificationState) {
        RastroApplication.instance.getSharedPreferences("rastro_learning", android.content.Context.MODE_PRIVATE)
            .edit().putString(uid.ifBlank { "guest" }, GamificationStateCodec.encode(state)).apply()
    }

    fun loadLocal(uid: String): GamificationState? = runCatching {
        val raw = RastroApplication.instance.getSharedPreferences("rastro_learning", android.content.Context.MODE_PRIVATE)
            .getString(uid.ifBlank { "guest" }, null) ?: return@runCatching null
        GamificationStateCodec.decode(raw)
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
                    activeLessonBySubject = (document.get("activeLessonBySubject") as? Map<*, *>)?.entries
                        ?.mapNotNull { (k, v) -> if (k is String && v is String) k to v else null }?.toMap() ?: emptyMap(),
                    activeStudyDate = document.getString("activeStudyDate").orEmpty(),
                    activeStudySeconds = (document.getLong("activeStudySeconds") ?: 0L).toInt(),
                    streakActivityVersion = (document.getLong("streakActivityVersion") ?: 0L).toInt(),
                    activityDates = activityDatesList?.toSet() ?: emptySet(),
                    maxHearts = (document.getLong("maxHearts") ?: 5L).toInt(),
                    lastHeartLostTimestamp = document.getLong("lastHeartLostTimestamp") ?: 0L,
                    lifeRecoveryAmount = document.getLong("lifeRecoveryAmount") ?: 3L,
                    lifeRecoveryUnit = document.getString("lifeRecoveryUnit") ?: "MINUTOS"
                )
                if (state.streakActivityVersion >= 1) onComplete(Result.success(state))
                else document.reference.parent.parent?.get()?.addOnSuccessListener { profile ->
                    onComplete(Result.success(StreakActivityMigration.recover(state, profile.data.orEmpty())))
                }?.addOnFailureListener { onComplete(Result.success(state)) }
                    ?: onComplete(Result.success(state))
            }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }

    fun save(uid: String, state: GamificationState, onComplete: (Result<Unit>) -> Unit = {}) {
        saveLocal(uid, state)
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
            "activeLessonBySubject" to state.activeLessonBySubject,
            "activeStudyDate" to state.activeStudyDate,
            "activeStudySeconds" to state.activeStudySeconds,
            "streakActivityVersion" to state.streakActivityVersion,
            "activityDates" to state.activityDates.toList()
        )
        val db = FirebaseFirestore.getInstance()
        val profile = db.collection("usuarios").document(uid)
        val batch = db.batch().set(profile.collection("gamificacion").document("rastro_progress"), payload, SetOptions.merge())
        // Public ranking summary. Private lesson/answer maps remain in the existing progress document.
        val authUser = com.google.firebase.auth.FirebaseAuth.getInstance().currentUser
        if (authUser?.uid == uid && !authUser.isAnonymous) batch.set(profile, mapOf(
            "leagueId" to com.jonsuapps.rastro.model.LeagueCatalog.current(state.xp).id,
            "leagueXp" to state.xp.coerceAtLeast(0), "leagueStreak" to state.streak.coerceAtLeast(0)
        ), SetOptions.merge())
        batch.commit()
            .addOnSuccessListener {
                val today = com.jonsuapps.rastro.gamification.GamificationManager.getLocalDayString()
                if (today in state.activityDates) UserProfileRepository.recordSharedStudyDay(uid, today)
                onComplete(Result.success(Unit))
            }
            .addOnFailureListener { onComplete(Result.failure(it)) }
    }
}
