package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.android.data.ExamSessionCodec
import com.jonsuapps.rastro.android.data.SavedExamSession
import com.jonsuapps.rastro.model.*
import org.junit.Assert.*
import org.junit.Test

class ExamSessionCodecTest {
    private fun session(tab: Int): SavedExamSession {
        val questions = (0 until 80).map {
            ExamQuestion("q$it", "¿Pregunta $it?", listOf("α", "β", "γ", "δ"), it % 4,
                "Física", "Ciencia", "Biomédicas", explanation = "Explicación\ncon símbolos ×",
                valorPonderado = 1.25, semana = 3)
        }
        return SavedExamSession("user", tab, AreaAdmision.BIOMEDICAS, "attempt", questions,
            mapOf("q0" to 2, "q12" to 3), 12,
            if (tab == 4) RankingExamConfig("ranking", "Ranking", AreaAdmision.BIOMEDICAS,
                maxAttempts = 3, eligibleUids = setOf("user"), audience = ExamAudience.SELECTED_USERS) else null)
    }
    @Test fun allThreeExamModesSerializeAndRecoverQuestionsAnswersAndRanking() {
        for (tab in listOf(0, 1, 4)) {
            val original = session(tab)
            assertEquals(original, ExamSessionCodec.decode(ExamSessionCodec.encode(original)))
        }
    }
    @Test fun emptyAnswersAtStartSerializeWithoutRuntimeSerializerLookup() {
        val start = session(0).copy(answers = emptyMap(), index = 0)
        assertEquals(start, ExamSessionCodec.decode(ExamSessionCodec.encode(start)))
    }
    @Test fun forwardCompatibleFieldsDoNotPreventRecovery() {
        val original = session(1)
        val encoded = ExamSessionCodec.encode(original).dropLast(1) + ",\"futureField\":true}"
        assertEquals(original, ExamSessionCodec.decode(encoded))
    }
    @Test fun malformedCheckpointIsRejectedRatherThanInventingQuestions() {
        assertTrue(runCatching { ExamSessionCodec.decode("{invalid}") }.isFailure)
    }
}
