package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.gamification.GamificationState
import java.time.LocalDate

/** One-time compatibility with the previous five-minute rule. Never manufacture missing days. */
object StreakActivityMigration {
    fun merge(local: GamificationState?, remote: GamificationState): GamificationState {
        if (local == null) return remote
        val recent = if (local.lastStudyDate > remote.lastStudyDate) local else remote
        val completions = (local.completedLessons.keys + remote.completedLessons.keys).associateWith { id ->
            listOfNotNull(local.completedLessons[id], remote.completedLessons[id]).maxBy { it.completedAt }
        }
        return remote.copy(xp = maxOf(local.xp, remote.xp),
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
        if (state.streakActivityVersion >= 1) return state
        val total = DailyActivityMath.readSeconds(profile, "testerDailySeconds")
        val app = DailyActivityMath.readSeconds(profile, "testerDailyApp")
        val web = DailyActivityMath.readSeconds(profile, "testerDailyWeb")
        val recovered = (total.keys + app.keys + web.keys).filter { day ->
            day < today.toString() && maxOf(total[day] ?: 0, (app[day] ?: 0) + (web[day] ?: 0)) >= 300
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
        return state.copy(streakActivityVersion = 1, streak = streak, bestStreak = maxOf(state.bestStreak, streak),
            lastStudyDate = last, activityDates = state.activityDates + recovered)
    }
}
