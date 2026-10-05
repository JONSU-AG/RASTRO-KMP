package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.serialization.json.Json
import kotlin.test.*

class LessonSpecialCatalogTest {
    @Test fun allRealSubjectsKeepLocalContentAndValidSpecialExercises() {
        val cl = Thread.currentThread().contextClassLoader ?: ClassLoader.getSystemClassLoader()
        AprenderRepository.testLoaderOverride = JsonContentLoader(
            json = Json { ignoreUnknownKeys = true; isLenient = true }, readBytesOverride = { path ->
                cl.getResourceAsStream("composeResources/rastro.shared.generated.resources/files/$path")?.readBytes()
                    ?: error("Missing real catalog fixture: $path")
            })
        try {
            AprenderRepository.subjects.forEach { subject ->
                val lessons = AprenderRepository.getLessonsForSubjectSync(subject.id)
                var fills = 0; var matches = 0; var four = 0; var two = 0
                lessons.forEach { original ->
                    val prepared = LessonSpecialActivities.prepare(original)
                    assertEquals(original.challenges.filter { it.type == ChallengeType.MULTIPLE_CHOICE },
                        prepared.challenges.filter { it.type == ChallengeType.MULTIPLE_CHOICE }, original.id)
                    assertEquals(prepared, LessonSpecialActivities.prepare(prepared), original.id)
                    assertEquals(prepared.challenges.size, prepared.challenges.map { it.id }.distinct().size, original.id)
                    val special = prepared.challenges.filter { it.type != ChallengeType.MULTIPLE_CHOICE }
                    special.forEach { q ->
                        if (q.type == ChallengeType.MATCH_PAIRS) assertTrue(q.pairs.size in 4..6,
                            "${q.id}: ${q.pairs.size} relaciones; se necesitan 4..6 asociaciones académicas locales")
                        assertTrue(ChallengeInteraction.validationErrors(q).isEmpty(), "${q.id}: ${ChallengeInteraction.validationErrors(q)}")
                        val localText = q.textTemplate.orEmpty() + q.pairs.joinToString { it.left + it.right }
                        assertFalse(AcademicSanitizer.hasUnrelatedStemContamination(subject.name, localText), q.id)
                    }
                    if (special.any { it.type == ChallengeType.FILL_BLANK }) fills++
                    if (special.any { it.type == ChallengeType.MATCH_PAIRS }) matches++
                    if (special.size >= 4) four++
                    if (special.size >= 2) two++
                }
                println("SPECIAL_COVERAGE ${subject.id}: levels=${lessons.size} fill=$fills match=$matches four=$four atLeastTwo=$two")
            }
        } finally { AprenderRepository.testLoaderOverride = null }
    }
}
