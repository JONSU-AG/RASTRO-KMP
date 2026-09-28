package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.gamification.GamificationState
import com.jonsuapps.rastro.gamification.LessonCompletion
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class LearningRewardsTest {
    private fun isolated(block: () -> Unit) {
        val before = GamificationManager.state.value
        try {
            GamificationManager.restore(GamificationState(xp = 0))
            block()
        } finally {
            GamificationManager.restore(before)
        }
    }

    @Test fun chestRequiresRealCompletionsAndSurvivesRestore() = isolated {
        val lessons = AprenderRepository.getLessonsForSubject("biologia")
            .filter { it.semana == 1 && it.challenges.isNotEmpty() }
        assertEquals(0, GamificationManager.claimTopicReward("biologia", 1))
        GamificationManager.restore(GamificationState(xp = 0, completedLessons = lessons.associate {
            it.id to LessonCompletion(0, 1L, skipped = true)
        }))
        assertEquals(0, GamificationManager.claimTopicReward("biologia", 1))
        lessons.forEach { GamificationManager.recordLessonCompletion(it.id, 25, 2) }
        assertEquals(30, GamificationManager.claimTopicReward("biologia", 1))
        val saved = GamificationManager.state.value
        GamificationManager.restore(Json.decodeFromString<GamificationState>(Json.encodeToString(saved)))
        assertEquals(0, GamificationManager.claimTopicReward("biologia", 1))
        assertEquals(lessons.size * 25 + 30, GamificationManager.state.value.xp)
    }

    @Test fun replayImprovesStarsWithoutRepeatedXp() = isolated {
        GamificationManager.recordLessonCompletion("biologia_s1_p1", 25, 1)
        GamificationManager.recordLessonCompletion("biologia_s1_p1", 50, 3)
        assertEquals(25, GamificationManager.state.value.xp)
        assertEquals(3, GamificationManager.state.value.completedLessons["biologia_s1_p1"]?.stars)
        GamificationManager.recordLessonCompletion("biologia_s1_p1", 25, 1)
        assertEquals(3, GamificationManager.state.value.completedLessons["biologia_s1_p1"]?.stars)
    }

    @Test fun invalidTopicsCannotAwardXp() = isolated {
        assertEquals(0, GamificationManager.claimTopicReward("unknown", 1))
        assertEquals(0, GamificationManager.claimTopicReward("biologia", 999))
        assertEquals(0, GamificationManager.state.value.xp)
    }

    @Test fun olderSavedProgressGetsEmptyRewardHistory() {
        assertEquals(emptyList(), Json.decodeFromString<GamificationState>("{\"xp\":125}").claimedTopicRewards)
    }

    @Test fun jumpingOnlySelectsStartingPointAndThenAdvancesNormally() = isolated {
        val lessons = AprenderRepository.getLessonsForSubject("biologia").filter { it.challenges.isNotEmpty() }
        val target = lessons[20]
        kotlin.test.assertTrue(GamificationManager.jumpToLesson(target.id))
        var state = GamificationManager.state.value
        assertEquals(0, state.xp)
        assertEquals(emptyMap(), state.completedLessons)
        assertEquals(target.id, state.learningPath("biologia").single { it.isCurrent }.id)
        assertEquals(0, GamificationManager.claimTopicReward("biologia", 1))
        GamificationManager.restore(Json.decodeFromString<GamificationState>(Json.encodeToString(state)))
        assertEquals(target.id, GamificationManager.state.value.learningPath("biologia").single { it.isCurrent }.id)
        GamificationManager.recordLessonCompletion(target.id, 25, 2)
        state = GamificationManager.state.value
        assertEquals(25, state.xp)
        assertEquals(setOf(target.id), state.completedLessons.keys)
        assertEquals(lessons[21].id, state.learningPath("biologia").single { it.isCurrent }.id)
        kotlin.test.assertFalse(state.learningPath("biologia").first().isCompleted)
    }

    @Test fun legacySkippedLevelsRemainAccessibleButNotCompleted() = isolated {
        val lessons = AprenderRepository.getLessonsForSubject("fisica").filter { it.challenges.isNotEmpty() }
        GamificationManager.restore(GamificationState(xp = 75, completedLessons = mapOf(
            lessons[0].id to LessonCompletion(3, 1L),
            lessons[1].id to LessonCompletion(0, 1L, skipped = true),
            lessons[2].id to LessonCompletion(0, 1L, skipped = true)
        )))
        val state = GamificationManager.state.value
        val path = state.learningPath("fisica")
        assertEquals(75, state.xp)
        assertEquals(1, path.count { it.isCompleted })
        kotlin.test.assertFalse(path[1].isLocked)
        assertEquals(0, path[1].stars)
        assertEquals(lessons[3].id, path.single { it.isCurrent }.id)
        assertEquals(0, GamificationManager.claimTopicReward("fisica", 1))
    }

    @Test fun completedLevelsAndChestUseTheSameEvidence() = isolated {
        val lessons = AprenderRepository.getLessonsForSubject("fisica")
            .filter { it.semana == 1 && it.challenges.isNotEmpty() }
        GamificationManager.restore(GamificationState(completedLessons = lessons.associate {
            it.id to LessonCompletion(3, 1L)
        }))
        assertEquals(lessons.size, GamificationManager.state.value.learningPath("fisica")
            .count { it.semana == 1 && it.isCompleted })
        assertEquals(30, GamificationManager.claimTopicReward("fisica", 1))
        assertEquals(0, GamificationManager.claimTopicReward("fisica", 1))
    }

    @Test fun invalidJumpDoesNotChangeState() = isolated {
        val before = GamificationManager.state.value
        kotlin.test.assertFalse(GamificationManager.jumpToLesson("not-a-lesson"))
        assertEquals(before, GamificationManager.state.value)
    }
}
