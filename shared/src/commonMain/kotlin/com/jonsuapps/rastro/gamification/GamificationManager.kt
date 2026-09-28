package com.jonsuapps.rastro.gamification

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.datetime.Clock
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 * Gestor de gamificación de RASTRO (§4.2 del mapa).
 * Regla de oro: Fechas LOCALES (nunca UTC). En Perú (UTC-5) las sesiones nocturnas
 * de 7pm a 12am se registraban como el día siguiente si se usaba UTC, rompiendo la racha.
 */
object GamificationManager {

    data class StreakState(
        val currentStreak: Int = 1,
        val lastActiveDate: String = getLocalDayString(),
        val streakFreezeCount: Int = 1
    )

    private val _streakState = MutableStateFlow(StreakState())
    val streakState: StateFlow<StreakState> = _streakState.asStateFlow()

    private val _hearts = MutableStateFlow(200)
    val hearts: StateFlow<Int> = _hearts.asStateFlow()

    private val _totalXp = MutableStateFlow(50)
    val totalXp: StateFlow<Int> = _totalXp.asStateFlow()

    private val _state = MutableStateFlow(
        GamificationState(lastStudyDate = getLocalDayString())
    )
    val state: StateFlow<GamificationState> = _state.asStateFlow()

    fun recordLessonCompleted(earnedXp: Int = 25) {
        _totalXp.value += earnedXp.coerceAtLeast(0)
        _hearts.value = MAX_HEARTS
        checkStreak()
        syncState()
    }

    /** A day also counts after five real foreground-study minutes: fichas, apuntes or lecciones. */
    fun recordActiveStudySeconds(seconds: Int) {
        if (seconds <= 0) return
        val today = getLocalDayString()
        val current = _state.value
        val accumulated = (if (current.activeStudyDate == today) current.activeStudySeconds else 0) + seconds
        _state.value = current.copy(activeStudyDate = today, activeStudySeconds = accumulated)
        if (accumulated >= DAILY_STUDY_SECONDS && _streakState.value.lastActiveDate != today) {
            checkStreak()
        }
        syncState()
    }

    const val DAILY_STUDY_SECONDS = 5 * 60

    fun remainingStudySecondsToday(): Int {
        val current = _state.value
        val seconds = if (current.activeStudyDate == getLocalDayString()) current.activeStudySeconds else 0
        return (DAILY_STUDY_SECONDS - seconds).coerceAtLeast(0)
    }

    private val _journeyFrom = MutableStateFlow<String?>(null)
    val journeyFrom = _journeyFrom.asStateFlow()

    fun finishJourney(lessonId: String) {
        if (_journeyFrom.value == lessonId) _journeyFrom.value = null
    }

    /** Fixed reward, derived from the catalog and granted once per completed topic. */
    fun claimTopicReward(subjectId: String, topic: Int): Int {
        val key = "$subjectId:$topic"
        val lessons = com.jonsuapps.rastro.data.AprenderRepository.getLessonsForSubject(subjectId)
            .filter { it.semana == topic && it.challenges.isNotEmpty() }
        if (key in _state.value.claimedTopicRewards || lessons.isEmpty() || lessons.any {
            _state.value.completedLessons[it.id]?.skipped != false
        }) return 0
        _totalXp.value += TOPIC_REWARD_XP
        _state.value = _state.value.copy(xp = _totalXp.value,
            claimedTopicRewards = _state.value.claimedTopicRewards + key)
        return TOPIC_REWARD_XP
    }

    const val TOPIC_REWARD_XP = 30

    fun recordLessonCompletion(lessonId: String, earnedXp: Int, stars: Int) {
        if (lessonId.isBlank()) return
        val previous = _state.value.completedLessons[lessonId]
        if (previous != null && !previous.skipped) {
            if (stars > previous.stars) _state.value = _state.value.copy(
                completedLessons = _state.value.completedLessons + (lessonId to previous.copy(stars = stars.coerceIn(0, 3))))
            return
        }
        _journeyFrom.value = lessonId
        val safeXp = earnedXp.coerceAtLeast(0)
        val completed = _state.value.completedLessons + (
            lessonId to LessonCompletion(stars = stars.coerceIn(0, 3), completedAt = Clock.System.now().toEpochMilliseconds())
        )
        _totalXp.value += safeXp
        _hearts.value = MAX_HEARTS
        checkStreak()
        val achievements = (_state.value.achievements + buildList {
            if (completed.size >= 1) add("first_lesson")
            if (completed.size >= 10) add("ten_lessons")
            if (_totalXp.value >= 1000) add("xp_1000")
        }).distinct()
        _state.value = _state.value.copy(
            xp = _totalXp.value,
            streak = _streakState.value.currentStreak,
            lastStudyDate = _streakState.value.lastActiveDate,
            streakFreeze = _streakState.value.streakFreezeCount,
            hearts = _hearts.value,
            completedLessons = completed,
            activeLessonBySubject = nextLessonPointer(lessonId, completed),
            achievements = achievements
        )
    }

    fun addXp(amount: Int) {
        if (amount <= 0) return
        _totalXp.value += amount
        syncState()
    }

    fun unlockNode(nodeId: String) {
        if (nodeId.isBlank()) return
        _state.value = _state.value.copy(unlockedNodes = (_state.value.unlockedNodes + nodeId).distinct())
    }

    private fun nextLessonPointer(lessonId: String, completed: Map<String, LessonCompletion>): Map<String, String> {
        val lesson = com.jonsuapps.rastro.data.AprenderRepository.getLessonById(lessonId) ?: return _state.value.activeLessonBySubject
        val catalog = com.jonsuapps.rastro.data.AprenderRepository.getLessonsForSubject(lesson.subjectId)
            .filter { it.challenges.isNotEmpty() }
        val next = catalog.drop(catalog.indexOfFirst { it.id == lessonId } + 1)
            .firstOrNull { completed[it.id]?.skipped != false }
            ?: catalog.firstOrNull { completed[it.id]?.skipped != false }
        return if (next == null) _state.value.activeLessonBySubject - lesson.subjectId
            else _state.value.activeLessonBySubject + (lesson.subjectId to next.id)
    }

    /** Selects a starting point without modifying completions, stars or XP. */
    fun jumpToLesson(lessonId: String): Boolean {
        val lesson = com.jonsuapps.rastro.data.AprenderRepository.getLessonById(lessonId) ?: return false
        if (lesson.challenges.isEmpty()) return false
        _state.value = _state.value.copy(
            unlockedNodes = (_state.value.unlockedNodes + lessonId).distinct(),
            activeLessonBySubject = _state.value.activeLessonBySubject + (lesson.subjectId to lessonId))
        return true
    }

    fun restore(state: GamificationState) {
        _journeyFrom.value = null
        // Older versions stored skipped lessons in the completion map. Keep their access,
        // but remove the false completion so counters and chest eligibility agree.
        val skippedIds = state.completedLessons.filterValues { it.skipped }.keys
        val migratedTargets = skippedIds.mapNotNull {
            com.jonsuapps.rastro.data.AprenderRepository.getLessonById(it)
        }.groupBy { it.subjectId }.mapValues { (subject, skipped) ->
            val catalog = com.jonsuapps.rastro.data.AprenderRepository.getLessonsForSubject(subject)
                .filter { it.challenges.isNotEmpty() }
            val last = catalog.indexOfLast { node -> skipped.any { it.id == node.id } }
            catalog.getOrNull(last + 1)?.id ?: catalog.getOrNull(last)?.id.orEmpty()
        }.filterValues { it.isNotBlank() }
        _state.value = state.copy(completedLessons = state.completedLessons.filterValues { !it.skipped },
            unlockedNodes = (state.unlockedNodes + skippedIds + migratedTargets.values).distinct(),
            activeLessonBySubject = migratedTargets + state.activeLessonBySubject)
        _totalXp.value = state.xp.coerceAtLeast(0)
        _hearts.value = state.hearts.coerceIn(0, MAX_HEARTS)
        _streakState.value = StreakState(
            currentStreak = state.streak.coerceAtLeast(1),
            lastActiveDate = state.lastStudyDate.ifBlank { getLocalDayString() },
            streakFreezeCount = state.streakFreeze.coerceAtLeast(0)
        )
        checkStreakStatusOnLaunch()
    }

    private var todayActiveStudySeconds = 0

    /** Suma tiempo activo de estudio (en segundos) en la app (flashcards, lectura, ejercicios) */
    fun recordActiveStudyTime(seconds: Int) {
        if (seconds <= 0) return
        todayActiveStudySeconds += seconds
        if (todayActiveStudySeconds >= 300) { // 5 minutos de estudio activo
            markDailyStreakEarned()
        }
    }

    /** Revisa si la racha expiró por días sin estudiar, sin incrementarla automáticamente por abrir la app */
    fun checkStreakStatusOnLaunch() {
        val today = getLocalDayString()
        val current = _streakState.value
        if (current.lastActiveDate.isBlank() || current.lastActiveDate == today) return
        val previous = runCatching { LocalDate.parse(current.lastActiveDate) }.getOrNull()
        val currentLocal = runCatching { LocalDate.parse(today) }.getOrNull()
        if (previous != null && currentLocal != null) {
            val days = currentLocal.toEpochDays() - previous.toEpochDays()
            if (days > 1) {
                if (current.streakFreezeCount > 0) {
                    _streakState.value = current.copy(
                        lastActiveDate = today,
                        streakFreezeCount = current.streakFreezeCount - 1
                    )
                } else {
                    _streakState.value = current.copy(currentStreak = 1)
                }
                syncState()
            }
        }
    }

    /** Marca la racha diaria como ganada por haber estudiado 5 min o completado 1 lección hoy */
    fun markDailyStreakEarned() {
        val today = getLocalDayString()
        val current = _streakState.value
        if (current.lastActiveDate == today) return // Ya fue ganada hoy
        val previous = runCatching { LocalDate.parse(current.lastActiveDate) }.getOrNull()
        val currentLocal = runCatching { LocalDate.parse(today) }.getOrNull()
        val daysDiff = if (previous != null && currentLocal != null) (currentLocal.toEpochDays() - previous.toEpochDays()) else 1
        val newStreak = if (daysDiff <= 1) (current.currentStreak + 1).coerceAtLeast(1) else 1
        _streakState.value = current.copy(
            currentStreak = newStreak,
            lastActiveDate = today
        )
        syncState()
    }

    /** Alias por compatibilidad */
    fun checkStreak() {
        markDailyStreakEarned()
    }

    fun loseHeart() {
        if (_hearts.value > 0) {
            _hearts.value -= 1
            syncState()
        }
    }

    fun refillHearts(amount: Int = MAX_HEARTS) {
        _hearts.value = amount.coerceIn(0, MAX_HEARTS)
        syncState()
    }

    /**
     * Retorna la fecha local en formato YYYY-MM-DD.
     */
    fun getLocalDayString(timeZone: TimeZone = TimeZone.currentSystemDefault()): String {
        val now = Clock.System.now()
        val local = now.toLocalDateTime(timeZone)
        val y = local.year
        val m = local.monthNumber.toString().padStart(2, '0')
        val d = local.dayOfMonth.toString().padStart(2, '0')
        return "$y-$m-$d"
    }

    data class StreakAdvanceResult(
        val newStreak: Int,
        val newLastActiveDate: String,
        val remainingFreezeCount: Int
    )

    /**
     * Calcula el nuevo estado de racha al registrar actividad o abrir la app.
     * Retorna null si hoy ya fue contabilizado.
     */
    fun advanceStreak(
        currentStreak: Int,
        lastActiveDate: String?,
        streakFreeze: Int,
        today: String = getLocalDayString()
    ): StreakAdvanceResult? {
        if (lastActiveDate == null) {
            return StreakAdvanceResult(1, today, streakFreeze.coerceAtLeast(0))
        }
        if (lastActiveDate == today) {
            return null // Ya contó hoy
        }

        val previous = runCatching { kotlinx.datetime.LocalDate.parse(lastActiveDate) }.getOrNull()
        val current = runCatching { kotlinx.datetime.LocalDate.parse(today) }.getOrNull()
        val dayDifference = if (previous != null && current != null) (current.toEpochDays() - previous.toEpochDays()) else Int.MAX_VALUE
        return when {
            dayDifference == 1 -> StreakAdvanceResult((currentStreak + 1).coerceAtLeast(1), today, streakFreeze.coerceAtLeast(0))
            dayDifference > 1 && streakFreeze > 0 -> StreakAdvanceResult(currentStreak.coerceAtLeast(1), today, streakFreeze - 1)
            else -> StreakAdvanceResult(1, today, streakFreeze.coerceAtLeast(0))
        }
    }

    private const val MAX_HEARTS = 200

    private fun syncState() {
        _state.value = _state.value.copy(
            xp = _totalXp.value,
            streak = _streakState.value.currentStreak,
            lastStudyDate = _streakState.value.lastActiveDate,
            streakFreeze = _streakState.value.streakFreezeCount,
            hearts = _hearts.value
        )
    }
}
