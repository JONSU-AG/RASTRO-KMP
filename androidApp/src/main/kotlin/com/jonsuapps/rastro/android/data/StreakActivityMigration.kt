package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.gamification.GamificationState
import java.time.LocalDate

/** One-time compatibility with the previous five-minute rule. Never manufacture missing days. */
object StreakActivityMigration {
    const val VERSION = 2
    private val newRuleDate = LocalDate.parse("2026-10-08")

    /** Login-only exception. Caller must validate the actual Firebase administrator identity. */
    fun recoverAdminAccess(state: GamificationState, profile: Map<String, Any>, verifiedAdmin: Boolean,
                           today: LocalDate = LocalDate.now()): GamificationState {
        if (!verifiedAdmin) return state
        val access = listOf("testerDailySeconds", "testerDailyApp", "testerDailyWeb")
            .flatMap { DailyActivityMath.readSeconds(profile, it).keys }.toMutableSet()
        (profile["lastTesterActiveDate"] as? String)?.let { access += it }
        // This function is called only during the administrator's authenticated session.
        access += today.toString()
        val valid = access.filter { day -> runCatching { LocalDate.parse(day) }.getOrNull()
            ?.let { !it.isAfter(today) } == true }.toSet()
        return reconstruct(state.copy(activityDates = state.activityDates + valid), today)
    }

    /** Recover only the recent continuous chain; bestStreak alone is never evidence. */
    fun reconstruct(state: GamificationState, today: LocalDate = LocalDate.now()): GamificationState {
        val dates = state.activityDates.mapNotNull { runCatching { LocalDate.parse(it) }.getOrNull() }
            .filter { !it.isAfter(today) }.toMutableSet()
        state.completedLessons.values.filter { !it.skipped && it.completedAt > 0 }.forEach {
            dates += java.time.Instant.ofEpochMilli(it.completedAt).atZone(java.time.ZoneId.systemDefault()).toLocalDate()
        }
        // A saved streak and its endpoint are existing evidence, not the historical maximum.
        runCatching { LocalDate.parse(state.lastStudyDate) }.getOrNull()?.takeUnless { it.isAfter(today) }?.let { end ->
            repeat(state.streak.coerceIn(0, 100_000)) { dates += end.minusDays(it.toLong()) }
        }
        val latest = dates.filter { !it.isAfter(today) }.maxOrNull() ?: return state
        var day = latest
        var count = 0
        while (day in dates) { count++; day = day.minusDays(1) }
        val repair = !latest.isBefore(today.minusDays(1)) && count > state.streak
        val current = if (repair) count else state.streak
        return state.copy(streak = current, bestStreak = maxOf(state.bestStreak, current),
            lastStudyDate = if (repair) maxOf(state.lastStudyDate, latest.toString()) else state.lastStudyDate,
            activityDates = state.activityDates + dates.filter { !it.isAfter(today) }.map { it.toString() })
    }
    fun merge(local: GamificationState?, remote: GamificationState): GamificationState {
        if (local == null) return remote
        val recent = if (local.lastStudyDate > remote.lastStudyDate) local else remote
        val completions = (local.completedLessons.keys + remote.completedLessons.keys).associateWith { id ->
            listOfNotNull(local.completedLessons[id], remote.completedLessons[id]).maxBy { it.completedAt }
        }
        return remote.copy(economyAttempts = (remote.economyAttempts + local.economyAttempts).distinctBy { it.id }, xp = maxOf(local.xp, remote.xp),
            streak = if (local.lastStudyDate == remote.lastStudyDate) maxOf(local.streak, remote.streak) else recent.streak,
            lastStudyDate = recent.lastStudyDate, bestStreak = maxOf(local.bestStreak, remote.bestStreak),
            completedLessons = completions, unlockedNodes = (local.unlockedNodes + remote.unlockedNodes).distinct(),
            activityDates = local.activityDates + remote.activityDates,
            claimedTopicRewards = (local.claimedTopicRewards + remote.claimedTopicRewards).distinct(),
            claimedExamRewards = (local.claimedExamRewards + remote.claimedExamRewards).distinct(),
            activeLessonBySubject = remote.activeLessonBySubject + local.activeLessonBySubject,
            activeStudyDate = maxOf(local.activeStudyDate, remote.activeStudyDate),
            activeStudySeconds = if (local.activeStudyDate == remote.activeStudyDate) maxOf(local.activeStudySeconds, remote.activeStudySeconds)
                else if (local.activeStudyDate > remote.activeStudyDate) local.activeStudySeconds else remote.activeStudySeconds)
    }
    fun recover(state: GamificationState, profile: Map<String, Any>, today: LocalDate = LocalDate.now()): GamificationState {
        if (state.streakActivityVersion >= VERSION) return reconstruct(state, today)
        val total = DailyActivityMath.readSeconds(profile, "testerDailySeconds")
        val app = DailyActivityMath.readSeconds(profile, "testerDailyApp")
        val web = DailyActivityMath.readSeconds(profile, "testerDailyWeb")
        val recovered = (total.keys + app.keys + web.keys).filter { day ->
            val date = runCatching { LocalDate.parse(day) }.getOrNull()
            date != null && !date.isAfter(today) && maxOf(total[day] ?: 0, (app[day] ?: 0) + (web[day] ?: 0)) >=
                if (date.isBefore(newRuleDate) && date.isBefore(today)) 300 else 900
        }.toSet()
        val original = runCatching { LocalDate.parse(state.lastStudyDate) }.getOrNull()
        val latest = recovered.maxOrNull()?.let(LocalDate::parse)
        var streak = state.streak
        var last = state.lastStudyDate
        if (latest != null && original != null && latest.isAfter(original)) {
            val gap = java.time.temporal.ChronoUnit.DAYS.between(original, latest)
            val bridged = (1..gap).all { original.plusDays(it).toString() in recovered }
            if (bridged) { streak += gap.toInt(); last = latest.toString() }
        }
        return reconstruct(state.copy(streakActivityVersion = VERSION, streak = streak, bestStreak = maxOf(state.bestStreak, streak),
            lastStudyDate = last, activityDates = state.activityDates + recovered), today)
    }
}
