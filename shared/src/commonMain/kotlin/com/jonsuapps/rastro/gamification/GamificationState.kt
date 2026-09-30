package com.jonsuapps.rastro.gamification

import com.jonsuapps.rastro.model.LessonNode
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class LessonCompletion(
    val stars: Int,
    val completedAt: Long,
    val skipped: Boolean = false
)

@Serializable
data class GamificationState(
    val xp: Int = 50,
    val streak: Int = 1,
    val lastStudyDate: String = "",
    val streakFreeze: Int = 1,
    val hearts: Int = 200,
    val completedLessons: Map<String, LessonCompletion> = emptyMap(),
    val unlockedNodes: List<String> = listOf("node_0"),
    val achievements: List<String> = emptyList(),
    val claimedTopicRewards: List<String> = emptyList(),
    val activeLessonBySubject: Map<String, String> = emptyMap(),
    val activeStudyDate: String = "",
    val activeStudySeconds: Int = 0
) {
    fun learningPath(subjectId: String): List<com.jonsuapps.rastro.model.LessonNode> {
        val catalog = com.jonsuapps.rastro.data.AprenderRepository.getLessonsForSubjectSync(subjectId)
            .filterNot { it.challenges.isEmpty() && (it.title.startsWith("Cofre") || it.title.startsWith("Trofeo")) }
        fun completed(id: String) = completedLessons[id]?.skipped == false
        val playable = catalog.filter { it.challenges.isNotEmpty() }
        val current = playable.firstOrNull { it.id == activeLessonBySubject[subjectId] && !completed(it.id) }
            ?: playable.firstOrNull { !completed(it.id) }
        return catalog.map { lesson ->
            val index = playable.indexOfFirst { it.id == lesson.id }
            val available = index >= 0 && (index == 0 || lesson.id == current?.id ||
                lesson.id in unlockedNodes || completed(lesson.id) || completed(playable[index - 1].id))
            lesson.copy(isCompleted = completed(lesson.id),
                stars = if (completed(lesson.id)) completedLessons[lesson.id]?.stars ?: 0 else 0,
                isLocked = !available, isCurrent = lesson.id == current?.id)
        }
    }

    val level: Int get() = xp.coerceAtLeast(0) / 100 + 1
    val currentLevelProgress: Int get() = xp.coerceAtLeast(0) % 100
}

/** Shared serializer keeps Android local saves compatible with older state snapshots. */
object GamificationStateCodec {
    private val json = Json { ignoreUnknownKeys = true }
    fun encode(state: GamificationState): String = json.encodeToString(state)
    fun decode(raw: String): GamificationState = json.decodeFromString(raw)
}
