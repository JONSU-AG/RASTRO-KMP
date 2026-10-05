package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Geografía (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-13 (26 LessonNodes geo_t01_s01..geo_t13_s02, 260 challenges).
 * Legacy geog_t* semanas 1-13 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - subjectId/semana/subtema vacíos o ausentes normalizados en la generación.
 * - Distribución correctIndex real: 65/65/65/65 exacto.
 * - Staging trae 10 parejo por nodo (no variable 10-20).
 */
class MapaGeografiaRegressionTest {

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

    private fun mapaGeografia(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("geografia")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaGeografia_nuevoSemanas1a13_sinLegacy() {
        val mapa = mapaGeografia()
        // Reemplazo total: todo nodo tiene 10 challenges (legacy = 2 challenges).
        assertEquals(26, mapa.size, "Solo los 26 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 10 }, "Sin nodos legacy de 2 challenges")

        val nuevas = mapa.filter { it.id.startsWith("geo_t") }
        assertEquals(26, nuevas.size, "13 semanas nuevas = 26 LessonNodes")
        assertEquals(260, nuevas.sumOf { it.challenges.size }, "260 challenges staging")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..13).toList(), semanas, "Nuevo semanas 1-13: $semanas")
    }

    @Test
    fun mapaGeografia_nuevasUnaVez_conTeoriaDeEstudio() {
        val mapa = mapaGeografia()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..13).flatMap { w ->
            listOf("geo_t%02d_s01".format(w) to Triple(w, "$w.1", 10),
                "geo_t%02d_s02".format(w) to Triple(w, "$w.2", 10))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("geografia", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "geografia" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "3.1. Definición y Etimología de la Geografía",
            mapa.first { it.id == "geo_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_geografia_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("geo_t01_s01")
            assertTrue(nueva != null, "geo_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges staging")
            assertEquals("geografia", nueva.subjectId)

            // Fallback legacy: geog_t01 no tiene equivalente nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("geog_t01")
            assertTrue(legacy != null, "geog_t01 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("geografia", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaGeografia_sinContaminacion() {
        val mapa = mapaGeografia()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Geografía")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Geografía")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Geografía")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Geografía")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Geografía")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Geografía")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Geografía")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Geografía")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Geografía")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Geografía")
        assertTrue(mapa.all { it.subjectId == "geografia" }, "Todo el mapa es geografia")
    }
}
