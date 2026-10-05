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
 * Regresión de Historia Universal (SALIDA_KOTLIN → RASTRO, mismo sistema
 * genérico que Biología/Lenguaje/Literatura/Psicología/Historia del Perú):
 * convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-6 (12 LessonNodes huni_t01_s01..huni_t06_s02, 120 challenges).
 * Legacy hu_t* semanas 1-6 queda excluido; legacy semanas 7-8 intacto (8 nodos).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - Sem05 trae `subtema = Int`; normalizado a "5.1"/"5.2" en la generación.
 * - Distribución correctIndex real: A=29, B=38, C=28, D=25 (no 25% exacto).
 * - Nodo más corto: huni_t05_s01 (5993 chars); umbral de teoría en 5000.
 */
class MapaHistoriaUniversalRegressionTest {

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

    private fun mapaHistoriaUniversal(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("historia_universal")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaHistoriaUniversal_nuevoSemanas1a6_legacy7a8Intacto() {
        val mapa = mapaHistoriaUniversal()
        // Legacy hu_ semanas 1-6 reemplazado por contenido nuevo.
        val legacyViejo = mapa.filter { it.id.startsWith("hu_") && it.semana in 1..6 }
        assertEquals(0, legacyViejo.size, "Legacy semanas 1-6 reemplazado por nuevo")

        // Legacy semanas 7-8 intacto (8 nodos de 1 challenge).
        val legacyRestante = mapa.filter { it.id.startsWith("hu_") }
        assertEquals(8, legacyRestante.size, "Legacy semanas 7-8 intacto")
        assertEquals(8, legacyRestante.sumOf { it.challenges.size }, "Legacy 8 challenges")

        // Nuevo: 12 nodos semanas 1-6 con 120 MC + 24 relacionar + 24 completar.
        val nuevas = mapa.filter { it.id.startsWith("huni_") }
        assertEquals(12, nuevas.size, "6 semanas nuevas = 12 LessonNodes")
        assertEquals(168, nuevas.sumOf { it.challenges.size }, "120 MC + 24 M + 24 F")
        val mc = nuevas.flatMap { it.challenges }.filter { it.type == ChallengeType.MULTIPLE_CHOICE }
        assertEquals(120, mc.size, "120 challenges MC staging")

        val semanasNuevas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..6).toList(), semanasNuevas, "Nuevo semanas 1-6: $semanasNuevas")
    }

    @Test
    fun mapaHistoriaUniversal_nuevasUnaVez_conTeoriaDeEstudio() {
        val mapa = mapaHistoriaUniversal()
        // (semana, subtema, challenges) por nodo.
        val esperadas = mapOf(
            "huni_t01_s01" to Triple(1, "1.1", 10),
            "huni_t01_s02" to Triple(1, "1.2", 10),
            "huni_t02_s01" to Triple(2, "2.1", 10),
            "huni_t02_s02" to Triple(2, "2.2", 10),
            "huni_t03_s01" to Triple(3, "3.1", 10),
            "huni_t03_s02" to Triple(3, "3.2", 10),
            "huni_t04_s01" to Triple(4, "4.1", 10),
            "huni_t04_s02" to Triple(4, "4.2", 10),
            "huni_t05_s01" to Triple(5, "5.1", 10),
            "huni_t05_s02" to Triple(5, "5.2", 10),
            "huni_t06_s01" to Triple(6, "6.1", 10),
            "huni_t06_s02" to Triple(6, "6.2", 10)
        )
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third + 4 }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("historia_universal", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso (ver nota: mínimo real 5993).
            assertTrue(
                lesson.theory.resumen.length >= 5000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            val mcs = lesson.challenges.filter { it.type == ChallengeType.MULTIPLE_CHOICE }
            assertEquals(esp.third, mcs.size, "$id mantiene sus ${esp.third} MC")
            assertTrue(mcs.all { it.subject == "historia_universal" && it.semana == esp.first })
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
            "3.1. El Concepto y los Motores de la Hominización",
            mapa.first { it.id == "huni_t01_s01" && it.challenges.size == 14 }.title
        )
    }

    @Test
    fun repositorio_historiaUniversal_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("huni_t01_s01")
            assertTrue(nueva != null, "huni_t01_s01 debe resolverse")
            assertEquals(14, nueva.challenges.size, "Nuevo con 10 MC + 2 M + 2 F")
            assertEquals("historia_universal", nueva.subjectId)

            // Fallback legacy: hu_t07_s01 no tiene equivalente nuevo → legacy (1 challenge).
            val legacy = AprenderRepository.getLessonByIdSync("hu_t07_s01")
            assertTrue(legacy != null, "hu_t07_s01 debe caer a legacy")
            assertEquals(1, legacy.challenges.size, "Legacy con 1 challenge")
            assertEquals("historia_universal", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaHistoriaUniversal_sinContaminacion() {
        val mapa = mapaHistoriaUniversal()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Historia")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Historia")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Hist. Universal")
        assertTrue(mapa.none { it.id.startsWith("hp_") }, "Sin legacy Perú en Hist. Universal")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Historia")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Historia")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Historia")
        assertTrue(mapa.all { it.subjectId == "historia_universal" }, "Todo el mapa es historia_universal")
    }
}
