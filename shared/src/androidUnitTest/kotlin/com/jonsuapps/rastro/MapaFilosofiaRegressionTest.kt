package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Filosofía (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-13 (26 LessonNodes filo_t01_s01..filo_t13_s02, 260 challenges).
 * Legacy fil_t* semanas 1-13 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Distribución correctIndex real: 65/65/65/65 exacto.
 */
class MapaFilosofiaRegressionTest {

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

    private fun mapaFilosofia(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("filosofia")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaFilosofia_nuevoSemanas1a13_sinLegacy() {
        val mapa = mapaFilosofia()
        // Reemplazo total: todo nodo tiene 10 challenges (legacy = 2 challenges).
        assertEquals(26, mapa.size, "Solo los 26 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 10 }, "Sin nodos legacy de 2 challenges")

        val nuevas = mapa.filter { it.id.startsWith("filo_t") }
        assertEquals(26, nuevas.size, "13 semanas nuevas = 26 LessonNodes")
        assertEquals(260, nuevas.sumOf { it.challenges.size }, "260 challenges staging")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..13).toList(), semanas, "Nuevo semanas 1-13: $semanas")
    }

    @Test
    fun mapaFilosofia_nuevasUnaVez_conTeoriaDeEstudio() {
        val mapa = mapaFilosofia()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..13).flatMap { w ->
            listOf("filo_t%02d_s01".format(w) to Triple(w, "$w.1", 10),
                "filo_t%02d_s02".format(w) to Triple(w, "$w.2", 10))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("filosofia", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "filosofia" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "3.1. Etimología y Definición de la Filosofía",
            mapa.first { it.id == "filo_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_filosofia_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("filo_t01_s01")
            assertTrue(nueva != null, "filo_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges staging")
            assertEquals("filosofia", nueva.subjectId)

            // Fallback legacy: fil_t01_s03 no tiene equivalente nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("fil_t01_s03")
            assertTrue(legacy != null, "fil_t01_s03 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("filosofia", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaFilosofia_sinContaminacion() {
        val mapa = mapaFilosofia()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Filosofía")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Filosofía")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Filosofía")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Filosofía")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Filosofía")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Filosofía")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Filosofía")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Filosofía")
        assertTrue(mapa.all { it.subjectId == "filosofia" }, "Todo el mapa es filosofia")
    }
}
