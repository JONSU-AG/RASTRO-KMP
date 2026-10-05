package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
data class League(val id: String, val title: String, val fromLevel: Int, val badgeAsset: String) {
    val minXp: Int get() = com.jonsuapps.rastro.gamification.XpProgression.minimumXp(fromLevel)
}

/** One membership, regardless of the ranking criterion. Reuses the existing XP thresholds. */
object LeagueCatalog {
    val all = listOf(
        League("wawita", "Wawita", 1, "league_wawita.svg"),
        League("kinder", "Kinder", 5, "league_kinder.svg"),
        League("prefosil", "Prefósil", 10, "league_prefosil.svg"),
        League("fosil", "Fósil", 20, "league_fosil.svg"),
        League("cachimbo", "Futuro Cachimbo", 30, "league_cachimbo.svg")
    )
    fun current(xp: Int): League = all.last { xp.coerceAtLeast(0) >= it.minXp }
    fun next(xp: Int): League? = all.getOrNull(all.indexOf(current(xp)) + 1)
    fun previous(xp: Int): League? = all.getOrNull(all.indexOf(current(xp)) - 1)
    fun progress(xp: Int): Float {
        val current = current(xp)
        val next = next(xp) ?: return 1f
        return ((xp - current.minXp).toFloat() / (next.minXp - current.minXp)).coerceIn(0f, 1f)
    }
    fun movement(previousLeagueId: String, xp: Int): LeagueMovement {
        val before = all.indexOfFirst { it.id == previousLeagueId }
        val after = all.indexOf(current(xp))
        return if (before < 0 || before == after) LeagueMovement.STAY else if (after > before) LeagueMovement.PROMOTION else LeagueMovement.RELEGATION
    }
}

enum class LeagueMovement { STAY, PROMOTION, RELEGATION }
enum class LeagueMetric(val field: String, val label: String) { XP("leagueXp", "EXP"), STREAK("leagueStreak", "RACHA") }

@Serializable
enum class ExamAudience { EVERYONE, SELECTED_USERS }

@Serializable
data class RankingExamConfig(
    val id: String,
    val title: String,
    val area: AreaAdmision,
    val maxAttempts: Int? = null,
    val audience: ExamAudience = ExamAudience.EVERYONE,
    val eligibleUids: Set<String> = emptySet(),
    val minimumLevel: Int = 1,
    val version: Int = 1
) {
    init { require(maxAttempts == null || maxAttempts > 0); require(minimumLevel >= 1); require(version >= 1); require(id.matches(Regex("[a-zA-Z0-9_-]+"))) }
    fun eligible(uid: String, level: Int): Boolean = uid.isNotBlank() && level >= minimumLevel &&
        (audience == ExamAudience.EVERYONE || uid in eligibleUids)
    fun remaining(used: Int, bonus: Int = 0): Int? = maxAttempts?.let { (it + bonus.coerceAtLeast(0) - used.coerceAtLeast(0)).coerceAtLeast(0) }
    fun canAttempt(uid: String, level: Int, used: Int, bonus: Int = 0) = eligible(uid, level) && (remaining(used, bonus)?.let { it > 0 } ?: true)
    val key: String get() = "${id}_v$version"
}

object RankingExamCatalog {
    /** Change these configurations to limit attempts or eligibility; never change UI constants. */
    fun forArea(area: AreaAdmision) = RankingExamConfig("unsa_${area.name.lowercase()}", "Examen Ranking · ${area.label}", area)
}

/** Future server-verified video reward. No implementation, ad SDK or fake button today. */
interface ExtraAttemptUnlocker {
    suspend fun unlock(config: RankingExamConfig, uid: String): Result<Unit>
}
