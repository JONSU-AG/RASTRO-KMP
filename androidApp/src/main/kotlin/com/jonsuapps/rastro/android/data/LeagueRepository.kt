package com.jonsuapps.rastro.android.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.*
import com.jonsuapps.rastro.model.*

data class LeagueMember(val uid: String, val name: String, val photo: String?, val xp: Int, val streak: Int, val examScore: Double?)
data class LeaguePage(val members: List<LeagueMember>, val cursor: DocumentSnapshot?, val hasMore: Boolean)
data class PersonalLeaguePosition(val member: LeagueMember, val position: Long)

/** Bounded pages and exact personal position, never fabricated competitors. */
object LeagueRepository {
    private val db get() = FirebaseFirestore.getInstance()
    private fun query(leagueId: String, metric: LeagueMetric) = db.collection("usuarios")
        .whereEqualTo("leagueId", leagueId).orderBy(metric.field, Query.Direction.DESCENDING)
        .orderBy(FieldPath.documentId(), Query.Direction.ASCENDING)
    private fun member(doc: DocumentSnapshot): LeagueMember = LeagueMember(doc.id,
        doc.getString("displayName") ?: doc.getString("name") ?: "Estudiante",
        doc.getString("photoURL"), (doc.getLong("leagueXp") ?: 0).toInt(),
        (doc.getLong("leagueStreak") ?: 0).toInt(), doc.getDouble("lastRankingScore"))
    fun page(leagueId: String, metric: LeagueMetric, cursor: DocumentSnapshot? = null, callback: (Result<LeaguePage>) -> Unit) {
        val query = query(leagueId, metric).let { if (cursor != null) it.startAfter(cursor) else it }.limit(25)
        query.get().addOnSuccessListener { result ->
            callback(Result.success(LeaguePage(result.documents.map(::member), result.documents.lastOrNull(), result.size() == 25)))
        }.addOnFailureListener { callback(Result.failure(it)) }
    }
    fun personal(leagueId: String, metric: LeagueMetric, uid: String, callback: (Result<PersonalLeaguePosition?>) -> Unit) {
        if (uid.isBlank()) { callback(Result.success(null)); return }
        db.collection("usuarios").document(uid).get().addOnSuccessListener { doc ->
            if (!doc.exists() || doc.getString("leagueId") != leagueId) { callback(Result.success(null)); return@addOnSuccessListener }
            // Same deterministic ordering as pages, including tied scores (document ID).
            query(leagueId, metric).endBefore(doc).count().get(AggregateSource.SERVER)
                .addOnSuccessListener { callback(Result.success(PersonalLeaguePosition(member(doc), it.count + 1))) }
                .addOnFailureListener { callback(Result.failure(it)) }
        }.addOnFailureListener { callback(Result.failure(it)) }
    }
}

/** Attempts are consumed atomically before starting and results saved once by attempt ID. */
object RankingExamRepository {
    private val db get() = FirebaseFirestore.getInstance()
    private fun uid(): String = FirebaseAuth.getInstance().currentUser?.takeUnless { it.isAnonymous }?.uid
        ?: error("Inicia sesión con una cuenta para participar en Examen Ranking.")
    private fun ledger(uid: String, config: RankingExamConfig) = db.collection("ranking_simulacros").document("${uid}_${config.key}")
    private fun configurationRef(area: AreaAdmision) = db.collection("oficiales").document("ranking_${area.name.lowercase()}")
    private fun configuration(doc: DocumentSnapshot, area: AreaAdmision): RankingExamConfig {
        val base = RankingExamCatalog.forArea(area)
        if (!doc.exists()) return base
        return base.copy(title = doc.getString("title") ?: base.title,
            maxAttempts = doc.getLong("maxAttempts")?.toInt(),
            audience = ExamAudience.valueOf(doc.getString("audience") ?: "EVERYONE"),
            eligibleUids = (doc.get("eligibleUids") as? List<*>)?.filterIsInstance<String>()?.toSet().orEmpty(),
            minimumLevel = (doc.getLong("minimumLevel") ?: 1).toInt(), version = (doc.getLong("version") ?: 1).toInt())
    }
    /** Editorial collection already has public reads and author-only writes in existing rules. */
    fun config(area: AreaAdmision, callback: (Result<RankingExamConfig>) -> Unit) {
        configurationRef(area).get().addOnSuccessListener { doc -> callback(runCatching { configuration(doc, area) }) }
            .addOnFailureListener { callback(Result.failure(it)) }
    }
    fun reserve(config: RankingExamConfig, level: Int, attemptId: String, callback: (Result<String>) -> Unit) {
        val uid = runCatching { uid() }.getOrElse { callback(Result.failure(it)); return }
        val ledger = ledger(uid, config)
        val attempt = db.collection("ranking_simulacros").document(attemptId)
        db.runTransaction { tx ->
            val authoritative = configuration(tx.get(configurationRef(config.area)), config.area)
            val previous = tx.get(attempt)
            val summary = tx.get(ledger)
            val used = (summary.getLong("attemptsUsed") ?: 0).toInt()
            val extra = (summary.getLong("extraAttempts") ?: 0).toInt()
            if (previous.exists()) {
                check(previous.getString("uid") == uid && previous.getString("examKey") == config.key)
            } else {
                check(authoritative.key == config.key) { "El examen cambió de versión; vuelve a cargar su configuración." }
                check(authoritative.canAttempt(uid, level, used, extra)) { "No eres elegible o ya utilizaste todos los intentos disponibles." }
                tx.set(ledger, mapOf("uid" to uid, "examKey" to config.key, "attemptsUsed" to used + 1,
                    "extraAttempts" to extra, "updatedAt" to FieldValue.serverTimestamp()), SetOptions.merge())
                tx.set(attempt, mapOf("uid" to uid, "examKey" to config.key, "area" to config.area.name,
                    "kind" to "RANKING_ATTEMPT", "status" to "STARTED", "startedAt" to FieldValue.serverTimestamp()))
            }
            attemptId
        }.addOnSuccessListener { callback(Result.success(it)) }.addOnFailureListener { callback(Result.failure(it)) }
    }
    fun usage(config: RankingExamConfig, callback: (Result<Pair<Int, Int>>) -> Unit) {
        val uid = runCatching { uid() }.getOrElse { callback(Result.failure(it)); return }
        ledger(uid, config).get().addOnSuccessListener {
            callback(Result.success((it.getLong("attemptsUsed") ?: 0).toInt() to (it.getLong("extraAttempts") ?: 0).toInt()))
        }.addOnFailureListener { callback(Result.failure(it)) }
    }
    fun complete(config: RankingExamConfig, attemptId: String, result: ExamEvaluationResult, callback: (Result<Unit>) -> Unit) {
        val uid = runCatching { uid() }.getOrElse { callback(Result.failure(it)); return }
        val attempt = db.collection("ranking_simulacros").document(attemptId)
        val ledger = ledger(uid, config)
        db.runTransaction { tx ->
            val record = tx.get(attempt)
            val summary = tx.get(ledger)
            check(record.exists() && record.getString("uid") == uid && record.getString("examKey") == config.key) { "Intento no registrado para esta cuenta." }
            if (record.getString("status") != "COMPLETED") {
                val score = com.jonsuapps.rastro.data.SimuladorRepository.rankingScore(result)
                val best = maxOf(summary.getDouble("bestScore") ?: 0.0, score)
                tx.update(attempt, mapOf("status" to "COMPLETED", "score" to score,
                    "correctCount" to result.correctCount, "completedAt" to FieldValue.serverTimestamp()))
                tx.set(ledger, mapOf("bestScore" to best, "lastScore" to score), SetOptions.merge())
                tx.set(db.collection("usuarios").document(uid), mapOf("lastRankingScore" to score,
                    "lastRankingArea" to config.area.name), SetOptions.merge())
            }
            Unit
        }.addOnSuccessListener { callback(Result.success(Unit)) }.addOnFailureListener { callback(Result.failure(it)) }
    }
}
