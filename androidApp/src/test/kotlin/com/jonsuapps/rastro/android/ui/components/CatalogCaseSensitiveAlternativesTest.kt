package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class CatalogCaseSensitiveAlternativesTest {
    private suspend fun geneticsLesson() = JsonContentLoader(readBytesOverride = { path ->
        File("../shared/src/commonMain/composeResources/files", path.removePrefix("files/")).readBytes()
    }).loadLesson("biologia", 11, "11.1").lesson

    @Test fun genotypeCapitalizationCarriesMeaningAndIsNotADuplicate() = runBlocking {
        val lesson = geneticsLesson()
        val q = lesson.challenges.first().copy(options = listOf("100% AA", "100% Aa", "100% aa", "50% Aa y 50% AA"), correctIndex = 1)
        val report = CatalogValidator.validateLesson(lesson.copy(challenges = listOf(q)))
        assertFalse(report.issues.toString(), report.issues.any { it.code == "DUPLICATE_OPTIONS_IN_QUESTION" })
    }

    @Test fun repeatedAlternativesStillFailEvenWithSurroundingWhitespace() = runBlocking {
        val lesson = geneticsLesson()
        val q = lesson.challenges.first().copy(options = listOf("AA", " AA ", "Aa", "aa"), correctIndex = 0)
        val report = CatalogValidator.validateLesson(lesson.copy(challenges = listOf(q)))
        assertTrue(report.issues.toString(), report.issues.any { it.code == "DUPLICATE_OPTIONS_IN_QUESTION" })
    }
}
