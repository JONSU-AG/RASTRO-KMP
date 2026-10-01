package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión del piloto Literatura (Google AI Studio → RASTRO, mismo sistema
 * genérico que Biología/Lenguaje): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Piloto = solo semana01 nueva (2 LessonNodes lit_t01_s01/s02, 20 challenges).
 * Legacy lit_t01_* (semana 1) queda excluido; legacy semanas 2-6 intacto y
 * direccionable (lit_t01_s03/s04 caen a legacy: sin subtopic 1.3/1.4 nuevo).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón Biología/Lenguaje).
 */
class MapaLiteraturaRegressionTest {

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

    private fun mapaLiteratura(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("literatura")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaLiteratura_completo_12nuevas_sinLegacy() {
        val mapa = mapaLiteratura()
        // Nuevo cubre semanas 1-6: legacy lit_* totalmente excluido (sin duplicar).
        val legacy = mapa.filter { it.id.startsWith("lit_t") && it.challenges.size == 2 }
        assertEquals(0, legacy.size, "Legacy reemplazado por contenido nuevo 1-6")

        val nuevas = mapa.filter { it.id.startsWith("lit_t") }
        assertEquals(12, nuevas.size, "6 semanas nuevas = 12 LessonNodes")
        assertEquals(120, nuevas.sumOf { it.challenges.size }, "120 challenges Google")

        val semanas = mapa.map { it.semana }.distinct().sorted()
        assertEquals((1..6).toList(), semanas, "Semanas 1-6 en orden: $semanas")
    }

    @Test
    fun mapaLiteratura_nuevas_unaVez_conTeoriaDeEstudio() {
        val mapa = mapaLiteratura()
        val esperadas = mapOf(
            "lit_t01_s01" to Triple(1, "1.1", 10),
            "lit_t01_s02" to Triple(1, "1.2", 10),
            "lit_t02_s01" to Triple(2, "2.1", 10),
            "lit_t02_s02" to Triple(2, "2.2", 10),
            "lit_t03_s01" to Triple(3, "3.1", 10),
            "lit_t03_s02" to Triple(3, "3.2", 10),
            "lit_t04_s01" to Triple(4, "4.1", 10),
            "lit_t04_s02" to Triple(4, "4.2", 10),
            "lit_t05_s01" to Triple(5, "5.1", 10),
            "lit_t05_s02" to Triple(5, "5.2", 10),
            "lit_t06_s01" to Triple(6, "6.1", 10),
            "lit_t06_s02" to Triple(6, "6.2", 10)
        )
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("literatura", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "literatura" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título piloto verbatim Google.
        assertEquals(
            "3.1. La Literatura y la Función Poética",
            mapa.first { it.id == "lit_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_literatura_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            // Nuevo primero: lit_t01_s01 resuelve al contenido nuevo (10 challenges Google).
            val nueva = AprenderRepository.getLessonByIdSync("lit_t01_s01")
            assertTrue(nueva != null, "lit_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges Google")

            // Fallback legacy: lit_t01_s03 no tiene subtopic 1.3 nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("lit_t01_s03")
            assertTrue(legacy != null, "lit_t01_s03 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("literatura", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaLiteratura_sinContaminacion() {
        val mapa = mapaLiteratura()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Literatura")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Literatura")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Literatura")
        assertTrue(mapa.all { it.subjectId == "literatura" }, "Todo el mapa es literatura")
    }
}
