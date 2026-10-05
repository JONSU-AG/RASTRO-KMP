package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import com.jonsuapps.rastro.model.ChallengeInteraction
import com.jonsuapps.rastro.model.ChallengeType
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Historia del Perú (SALIDA_KOTLIN → RASTRO, mismo sistema
 * genérico que Biología/Lenguaje/Literatura/Psicología): convivencia
 * legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-5 (10 LessonNodes hper_t01_s01..hper_t05_s02, 100 challenges).
 * Legacy hp_t* semanas 1-5 queda excluido; legacy semanas 6-8 intacto (12 nodos).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 */
class MapaHistoriaPeruRegressionTest {

    private val fixtureRoot = "composeResources/rastro.shared.generated.resources/files/"

    private fun testLoader(): JsonContentLoader {
        val cl = Thread.currentThread().contextClassLoader
            ?: ClassLoader.getSystemClassLoader()
        return JsonContentLoader(
            json = Json { ignoreUnknownKeys = true; isLenient = true },
            readBytesOverride = { path ->
                cl.getResourceAsStream(fixtureRoot + path)?.readBytes()
                    ?: throw IllegalStateException("Recurso no encontrado: $path")
            }
        )
    }

    private fun mapaHistoriaPeru(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("historia_peru")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaHistoriaPeru_nuevoSemanas1a5_legacy6a8Intacto() {
        val mapa = mapaHistoriaPeru()
        // Legacy hp_ semanas 1-5 reemplazado por contenido nuevo.
        val legacyViejo = mapa.filter { it.id.startsWith("hp_") && it.semana in 1..5 }
        assertEquals(0, legacyViejo.size, "Legacy semanas 1-5 reemplazado por nuevo")

        // Legacy semanas 6-8 intacto (12 nodos de 1 challenge).
        val legacyRestante = mapa.filter { it.id.startsWith("hp_") }
        assertEquals(12, legacyRestante.size, "Legacy semanas 6-8 intacto")
        assertEquals(12, legacyRestante.sumOf { it.challenges.size }, "Legacy 12 challenges")

        // Nuevo: 10 nodos semanas 1-5 con 100 MC + 20 relacionar + 20 completar.
        val nuevas = mapa.filter { it.id.startsWith("hper_") }
        assertEquals(10, nuevas.size, "5 semanas nuevas = 10 LessonNodes")
        assertEquals(140, nuevas.sumOf { it.challenges.size }, "100 MC + 20 M + 20 F staging")
        val mc = nuevas.flatMap { it.challenges }.filter { it.type == ChallengeType.MULTIPLE_CHOICE }
        assertEquals(100, mc.size, "100 challenges MC staging")

        val semanasNuevas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..5).toList(), semanasNuevas, "Nuevo semanas 1-5: $semanasNuevas")
    }

    @Test
    fun mapaHistoriaPeru_nuevasUnaVez_conTeoriaDeEstudio() {
        val mapa = mapaHistoriaPeru()
        // (semana, subtema, challenges) por nodo.
        val esperadas = mapOf(
            "hper_t01_s01" to Triple(1, "1.1", 10),
            "hper_t01_s02" to Triple(1, "1.2", 10),
            "hper_t02_s01" to Triple(2, "2.1", 10),
            "hper_t02_s02" to Triple(2, "2.2", 10),
            "hper_t03_s01" to Triple(3, "3.1", 10),
            "hper_t03_s02" to Triple(3, "3.2", 10),
            "hper_t04_s01" to Triple(4, "4.1", 10),
            "hper_t04_s02" to Triple(4, "4.2", 10),
            "hper_t05_s01" to Triple(5, "5.1", 10),
            "hper_t05_s02" to Triple(5, "5.2", 10)
        )
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third + 4 }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("historia_peru", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            val mcs = lesson.challenges.filter { it.type == ChallengeType.MULTIPLE_CHOICE }
            assertEquals(esp.third, mcs.size, "$id mantiene sus ${esp.third} MC")
            assertTrue(mcs.all { it.subject == "historia_peru" && it.semana == esp.first })
            assertTrue(mcs.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(mcs.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(mcs.all { it.options.size == 4 }, "$id 4 opciones")
            // Nuevos tipos: 2 relacionar + 2 completar válidos por nodo.
            val rel = lesson.challenges.filter { it.type == ChallengeType.MATCH_PAIRS }
            val fil = lesson.challenges.filter { it.type == ChallengeType.FILL_BLANK }
            assertEquals(2, rel.size, "$id 2 relacionar")
            assertEquals(2, fil.size, "$id 2 completar")
            assertTrue((rel + fil).all { ChallengeInteraction.validationErrors(it).isEmpty() },
                "$id interactivos válidos")
            assertTrue((rel + fil).all { it.explanation.isNotBlank() }, "$id explicaciones presentes")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "3.1. Teorías Científicas sobre el Poblamiento Americano",
            mapa.first { it.id == "hper_t01_s01" && it.challenges.size == 14 }.title
        )
    }

    @Test
    fun repositorio_historiaPeru_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("hper_t01_s01")
            assertTrue(nueva != null, "hper_t01_s01 debe resolverse")
            assertEquals(14, nueva.challenges.size, "Nuevo con 10 MC + 2 M + 2 F")
            assertEquals("historia_peru", nueva.subjectId)

            // Fallback legacy: hp_t06_s01 no tiene equivalente nuevo → legacy (1 challenge).
            val legacy = AprenderRepository.getLessonByIdSync("hp_t06_s01")
            assertTrue(legacy != null, "hp_t06_s01 debe caer a legacy")
            assertEquals(1, legacy.challenges.size, "Legacy con 1 challenge")
            assertEquals("historia_peru", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaHistoriaPeru_sinContaminacion() {
        val mapa = mapaHistoriaPeru()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Historia")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Historia")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Historia")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Historia")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Historia")
        assertTrue(mapa.all { it.subjectId == "historia_peru" }, "Todo el mapa es historia_peru")
    }
}
