package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.SimuladorRepository
import com.jonsuapps.rastro.model.AreaAdmision
import kotlin.test.*

class UnsaMatrix2027Test {
    @Test fun officialGroupsHaveEightyQuestionsAndHundredPoints() {
        val groupTotals = mapOf(
            AreaAdmision.INGENIERIAS to listOf(20.0,25.0,10.0,25.0,8.0,7.0,5.0),
            AreaAdmision.BIOMEDICAS to listOf(20.0,15.0,10.0,35.0,8.0,7.0,5.0),
            AreaAdmision.SOCIALES to listOf(20.0,10.0,23.0,10.0,10.0,22.0,5.0))
        for ((area, expected) in groupTotals) {
            val rules = SimuladorRepository.getPonderaciones(area)
            assertEquals(80, rules.sumOf { it.preguntas })
            val totals = rules.groupBy { it.curso }.values.map { group -> group.sumOf { it.preguntas * it.valor } }
            expected.zip(totals).forEach { (a,b) -> assertEquals(a,b,.000003) }
            assertEquals(100.0, SimuladorRepository.projectedScore(area,rules.associate { it.asignatura to it.preguntas }))
        }
    }
    @Test fun preciseSingleAndMixedAnswersRoundOnlyAfterSummation() {
        assertEquals(1.6995, SimuladorRepository.projectedScore(AreaAdmision.INGENIERIAS,mapOf("Trigonometría" to 1)))
        assertEquals(5.0984, SimuladorRepository.projectedScore(AreaAdmision.INGENIERIAS,mapOf("Trigonometría" to 3)))
        assertEquals(17.5063, SimuladorRepository.projectedScore(AreaAdmision.BIOMEDICAS,mapOf("Biología" to 9)))
        // 4*1.12415000 + 5*1.10068000 is the exact 10-point aptitude subtotal in the PDF.
        assertEquals(10.0, SimuladorRepository.projectedScore(AreaAdmision.SOCIALES,mapOf("Raz. Lógico" to 4,"Raz. Matemático" to 5)))
        assertEquals(0.0, SimuladorRepository.projectedScore(AreaAdmision.SOCIALES,mapOf("Historia" to -1,"unknown" to 80)))
    }
    @Test fun historicalReferencesAreDatedSourcedAndNamesRemainUnchanged() {
        val careers=SimuladorRepository.carrerasUNSACortes
        assertEquals(13,careers.size)
        assertEquals(73.498049,careers.single { it.name == "Medicina Humana" }.minScore)
        val psychology=careers.single { it.name == "Psicología" }
        assertEquals(54.124514,psychology.minScore)
        assertEquals(69.135360,psychology.maxScore)
        assertTrue(psychology.referenceUrl.endsWith("ord2025F2_psicoR.pdf"))
        assertTrue(careers.all { it.referenceProcess.endsWith("2025") && it.referenceUrl.startsWith("https://www.unsa.edu.pe/") && it.minScore <= it.maxScore && it.admittedCount > 0 && it.vacantCount == 0 })
    }
}
