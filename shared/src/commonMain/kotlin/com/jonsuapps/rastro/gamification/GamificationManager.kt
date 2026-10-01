package com.jonsuapps.rastro.gamification

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.datetime.Clock
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.minus
import kotlinx.datetime.toLocalDateTime

/**
 * Gestor de gamificación de RASTRO (§4.2 del mapa).
 * Regla de oro: Fechas LOCALES (nunca UTC). En Perú (UTC-5) las sesiones nocturnas
 * de 7pm a 12am se registraban como el día siguiente si se usaba UTC, rompiendo la racha.
 */
object GamificationManager {

    data class StreakState(
        val currentStreak: Int = 1,
        val bestStreak: Int = 1,
        val lastActiveDate: String = getLocalDayString(),
        val streakFreezeCount: Int = 1,
        val activityDates: Set<String> = emptySet()
    )

    private val _streakState = MutableStateFlow(StreakState())
    val streakState: StateFlow<StreakState> = _streakState.asStateFlow()

    const val DEFAULT_MAX_HEARTS = 5

    private val _maxHearts = MutableStateFlow(DEFAULT_MAX_HEARTS)
    val maxHearts: StateFlow<Int> = _maxHearts.asStateFlow()

    private val _hearts = MutableStateFlow(DEFAULT_MAX_HEARTS)
    val hearts: StateFlow<Int> = _hearts.asStateFlow()

    private val _recoveryAmount = MutableStateFlow(3L)
    val recoveryAmount: StateFlow<Long> = _recoveryAmount.asStateFlow()

    private val _recoveryUnit = MutableStateFlow(LifeRecoveryUnit.MINUTOS)
    val recoveryUnit: StateFlow<LifeRecoveryUnit> = _recoveryUnit.asStateFlow()

    private val _lastHeartLostTimestamp = MutableStateFlow(0L)
    val lastHeartLostTimestamp: StateFlow<Long> = _lastHeartLostTimestamp.asStateFlow()

    fun calculateIntervalMillis(amount: Long, unit: LifeRecoveryUnit): Long {
        val safeAmount = amount.coerceAtLeast(1L)
        val unitMillis = unit.secondsMultiplier * 1000L
        val maxSafeAmount = Long.MAX_VALUE / unitMillis
        val boundedAmount = safeAmount.coerceAtMost(maxSafeAmount)
        return boundedAmount * unitMillis
    }

    fun getRecoveryIntervalMillis(): Long {
        return calculateIntervalMillis(_recoveryAmount.value, _recoveryUnit.value)
    }

    fun setMaxHearts(newMax: Int, nowMillis: Long = Clock.System.now().toEpochMilliseconds()) {
        val safeMax = newMax.coerceIn(1, 1_000_000)
        val oldMax = _maxHearts.value
        if (safeMax == oldMax) return

        _maxHearts.value = safeMax
        if (safeMax > oldMax) {
            val diff = safeMax - oldMax
            _hearts.value = (_hearts.value + diff).coerceIn(0, safeMax)
        } else {
            _hearts.value = _hearts.value.coerceIn(0, safeMax)
        }

        if (_hearts.value >= safeMax) {
            _lastHeartLostTimestamp.value = 0L
        } else if (_lastHeartLostTimestamp.value <= 0L) {
            _lastHeartLostTimestamp.value = nowMillis
        }
        syncState()
    }

    fun setRecoveryConfig(
        amount: Long,
        unit: LifeRecoveryUnit,
        nowMillis: Long? = null
    ) {
        val safeAmount = amount.coerceAtLeast(1L)
        _recoveryAmount.value = safeAmount
        _recoveryUnit.value = unit

        if (nowMillis != null && _hearts.value < _maxHearts.value && _lastHeartLostTimestamp.value > 0L) {
            updateHeartRegeneration(nowMillis)
        }
        syncState()
    }

    fun updateHeartRegeneration(nowMillis: Long = Clock.System.now().toEpochMilliseconds()): Int {
        if (_hearts.value >= _maxHearts.value) {
            if (_lastHeartLostTimestamp.value != 0L) {
                _lastHeartLostTimestamp.value = 0L
                syncState()
            }
            return 0
        }

        val timestamp = _lastHeartLostTimestamp.value
        if (timestamp <= 0L) {
            _lastHeartLostTimestamp.value = nowMillis
            syncState()
            return 0
        }

        val interval = getRecoveryIntervalMillis()
        if (interval <= 0L) return 0

        val elapsed = (nowMillis - timestamp).coerceAtLeast(0L)
        if (elapsed < interval) {
            return 0
        }

        val recovered = elapsed / interval
        val missing = (_maxHearts.value - _hearts.value).toLong()
        val toAdd = recovered.coerceAtMost(missing).toInt()

        if (toAdd > 0) {
            _hearts.value = (_hearts.value + toAdd).coerceIn(0, _maxHearts.value)
            if (_hearts.value >= _maxHearts.value) {
                _lastHeartLostTimestamp.value = 0L
            } else {
                _lastHeartLostTimestamp.value = timestamp + (recovered * interval)
            }
            syncState()
        }
        return toAdd
    }

    fun millisUntilNextHeart(nowMillis: Long = Clock.System.now().toEpochMilliseconds()): Long {
        if (_hearts.value >= _maxHearts.value) return 0L
        val timestamp = _lastHeartLostTimestamp.value
        if (timestamp <= 0L) return 0L
        val interval = getRecoveryIntervalMillis()
        if (interval <= 0L) return 0L
        val elapsed = (nowMillis - timestamp).coerceAtLeast(0L)
        val remainder = elapsed % interval
        return (interval - remainder).coerceAtLeast(0L)
    }

    private val _totalXp = MutableStateFlow(50)
    val totalXp: StateFlow<Int> = _totalXp.asStateFlow()

    private val _state = MutableStateFlow(
        GamificationState(lastStudyDate = getLocalDayString())
    )
    val state: StateFlow<GamificationState> = _state.asStateFlow()

    fun recordLessonCompleted(earnedXp: Int = 25) {
        _totalXp.value += earnedXp.coerceAtLeast(0)
        _hearts.value = _maxHearts.value
        _lastHeartLostTimestamp.value = 0L
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
        val lessons = com.jonsuapps.rastro.data.AprenderRepository.getLessonsForSubjectSync(subjectId)
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
        _hearts.value = _maxHearts.value
        _lastHeartLostTimestamp.value = 0L
        checkStreak()
        val achievements = (_state.value.achievements + buildList {
            if (completed.size >= 1) add("first_lesson")
            if (completed.size >= 10) add("ten_lessons")
            if (_totalXp.value >= 1000) add("xp_1000")
        }).distinct()
        _state.value = _state.value.copy(
            xp = _totalXp.value,
            streak = _streakState.value.currentStreak,
            bestStreak = _streakState.value.bestStreak,
            lastStudyDate = _streakState.value.lastActiveDate,
            streakFreeze = _streakState.value.streakFreezeCount,
            hearts = _hearts.value,
            completedLessons = completed,
            activeLessonBySubject = nextLessonPointer(lessonId, completed),
            achievements = achievements,
            activityDates = _streakState.value.activityDates
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
        val lesson = com.jonsuapps.rastro.data.AprenderRepository.getLessonByIdSync(lessonId) ?: return _state.value.activeLessonBySubject
        val catalog = com.jonsuapps.rastro.data.AprenderRepository.getLessonsForSubjectSync(lesson.subjectId)
            .filter { it.challenges.isNotEmpty() }
        val next = catalog.drop(catalog.indexOfFirst { it.id == lessonId } + 1)
            .firstOrNull { completed[it.id]?.skipped != false }
            ?: catalog.firstOrNull { completed[it.id]?.skipped != false }
        return if (next == null) _state.value.activeLessonBySubject - lesson.subjectId
            else _state.value.activeLessonBySubject + (lesson.subjectId to next.id)
    }

    /** Selects a starting point without modifying completions, stars or XP. */
    fun jumpToLesson(lessonId: String): Boolean {
        val lesson = com.jonsuapps.rastro.data.AprenderRepository.getLessonByIdSync(lessonId) ?: return false
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
            com.jonsuapps.rastro.data.AprenderRepository.getLessonByIdSync(it)
        }.groupBy { it.subjectId }.mapValues { (subject, skipped) ->
            val catalog = com.jonsuapps.rastro.data.AprenderRepository.getLessonsForSubjectSync(subject)
                .filter { it.challenges.isNotEmpty() }
            val last = catalog.indexOfLast { node -> skipped.any { it.id == node.id } }
            catalog.getOrNull(last + 1)?.id ?: catalog.getOrNull(last)?.id.orEmpty()
        }.filterValues { it.isNotBlank() }
        _state.value = state.copy(completedLessons = state.completedLessons.filterValues { !it.skipped },
            unlockedNodes = (state.unlockedNodes + skippedIds + migratedTargets.values).distinct(),
            activeLessonBySubject = migratedTargets + state.activeLessonBySubject)
        _totalXp.value = state.xp.coerceAtLeast(0)
        val restoredMax = state.maxHearts.coerceIn(1, 1_000_000)
        _maxHearts.value = restoredMax
        _hearts.value = state.hearts.coerceIn(0, restoredMax)
        _lastHeartLostTimestamp.value = state.lastHeartLostTimestamp
        _recoveryAmount.value = state.lifeRecoveryAmount.coerceAtLeast(1L)
        _recoveryUnit.value = LifeRecoveryUnit.fromString(state.lifeRecoveryUnit)
        updateHeartRegeneration()

        val derivedActivity = buildSet {
            addAll(state.activityDates)
            state.completedLessons.values.forEach { completion ->
                runCatching {
                    val instant = kotlinx.datetime.Instant.fromEpochMilliseconds(completion.completedAt)
                    val local = instant.toLocalDateTime(TimeZone.currentSystemDefault())
                    add("${local.year}-${local.monthNumber.toString().padStart(2, '0')}-${local.dayOfMonth.toString().padStart(2, '0')}")
                }
            }
            val last = state.lastStudyDate.ifBlank { getLocalDayString() }
            val streakCount = state.streak.coerceAtLeast(1)
            runCatching {
                val lastDate = LocalDate.parse(last)
                for (i in 0 until streakCount) {
                    val d = lastDate.minus(i, DateTimeUnit.DAY)
                    add(d.toString())
                }
            }
        }
        val initialBestStreak = maxOf(state.bestStreak, state.streak.coerceAtLeast(1))

        _streakState.value = StreakState(
            currentStreak = state.streak.coerceAtLeast(1),
            bestStreak = initialBestStreak,
            lastActiveDate = state.lastStudyDate.ifBlank { getLocalDayString() },
            streakFreezeCount = state.streakFreeze.coerceAtLeast(0),
            activityDates = derivedActivity
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
        val newBestStreak = maxOf(current.bestStreak, newStreak)
        val newActivity = current.activityDates + today
        _streakState.value = current.copy(
            currentStreak = newStreak,
            bestStreak = newBestStreak,
            lastActiveDate = today,
            activityDates = newActivity
        )
        syncState()
    }

    /** Alias por compatibilidad */
    fun checkStreak() {
        markDailyStreakEarned()
    }

    fun loseHeart(nowMillis: Long = Clock.System.now().toEpochMilliseconds()) {
        if (_hearts.value > 0) {
            val wasFull = _hearts.value >= _maxHearts.value
            _hearts.value -= 1
            if (wasFull || _lastHeartLostTimestamp.value <= 0L) {
                _lastHeartLostTimestamp.value = nowMillis
            }
        } else {
            _lastHeartLostTimestamp.value = nowMillis
        }
        syncState()
    }

    fun refillHearts(amount: Int = _maxHearts.value) {
        _hearts.value = amount.coerceIn(0, _maxHearts.value)
        if (_hearts.value >= _maxHearts.value) {
            _lastHeartLostTimestamp.value = 0L
        }
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

    // Max hearts is now dynamic via _maxHearts StateFlow

    private fun syncState() {
        _state.value = _state.value.copy(
            xp = _totalXp.value,
            streak = _streakState.value.currentStreak,
            bestStreak = _streakState.value.bestStreak,
            lastStudyDate = _streakState.value.lastActiveDate,
            streakFreeze = _streakState.value.streakFreezeCount,
            hearts = _hearts.value,
            maxHearts = _maxHearts.value,
            lastHeartLostTimestamp = _lastHeartLostTimestamp.value,
            lifeRecoveryAmount = _recoveryAmount.value,
            lifeRecoveryUnit = _recoveryUnit.value.name,
            activityDates = _streakState.value.activityDates
        )
    }
}
