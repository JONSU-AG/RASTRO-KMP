package com.jonsuapps.rastro.android

import com.jonsuapps.rastro.data.SimuladorRepository
import com.jonsuapps.rastro.model.*
import kotlinx.serialization.json.*
import org.junit.Test
import org.junit.Assert.*
import java.io.File

/** Real source bank, without running Android or inserting synthetic academic content. */
class RankingBankTest {
    @Test fun eachAreaCanStartWithTheExistingRealBankAndKnownWeights() {
        val file = listOf(File("src/main/assets/bancoPreguntasCepreunsa.json"), File("androidApp/src/main/assets/bancoPreguntasCepreunsa.json"))
            .first { it.exists() }
        val bank = Json.parseToJsonElement(file.readText(Charsets.UTF_8)).jsonArray.mapNotNull { value ->
            val q = value.jsonObject
            fun text(key: String) = q[key]?.jsonPrimitive?.contentOrNull.orEmpty()
            if (text("estadoGrafico") == "REQUIERE_GRAFICO_FALTANTE" || q["aptoExamenRepaso"]?.jsonPrimitive?.booleanOrNull == false) return@mapNotNull null
            val options = q["options"]?.jsonArray?.map { it.jsonPrimitive.content }.orEmpty()
            if (options.size < 2) return@mapNotNull null
            ExamQuestion(text("id"), text("q"), options, q["answer"]?.jsonPrimitive?.intOrNull ?: 0,
                text("asignatura"), text("curso"), text("area"))
        }
        AreaAdmision.entries.forEach { area ->
            val paper = SimuladorRepository.generateRankingExam(bank, area, 0)
            assertEquals(80, paper.size)
            assertEquals(80, paper.map { it.id }.distinct().size)
            assertTrue(paper.all { it.valorPonderado != null && it.valorPonderado!! > 0 })
            assertTrue(paper.all { question -> bank.first { it.id == question.id }.asignatura == question.asignatura })
        }
    }
}
