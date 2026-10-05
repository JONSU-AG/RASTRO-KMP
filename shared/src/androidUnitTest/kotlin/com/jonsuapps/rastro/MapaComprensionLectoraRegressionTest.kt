package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Comp. Lectora (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-8 (16 LessonNodes cl_t01_s01..cl_t08_s02, 160 challenges).
 * Legacy cl_t* semanas 1-8 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - Los 16 nodos traen subjectId/semana/subtema vacíos o ausentes;
 *   normalizados a ("comprension_lectora", semana, "w.k") en la generación.
 * - Distribución correctIndex real: 40/40/40/40 exacto.
 */
class MapaComprensionLectoraRegressionTest {

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

    private fun mapaComprensionLectora(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("comprension_lectora")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaComprensionLectora_nuevoSemanas1a8_sinLegacy() {
        val mapa = mapaComprensionLectora()
        // Reemplazo total: todo nodo tiene 10 challenges (legacy = 2 challenges).
        assertEquals(16, mapa.size, "Solo los 16 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 10 }, "Sin nodos legacy de 2 challenges")

        val nuevas = mapa.filter { it.id.startsWith("cl_t") }
        assertEquals(16, nuevas.size, "8 semanas nuevas = 16 LessonNodes")
        assertEquals(160, nuevas.sumOf { it.challenges.size }, "160 challenges staging")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..8).toList(), semanas, "Nuevo semanas 1-8: $semanas")
    }

    @Test
    fun mapaComprensionLectora_nuevasUnaVez_conTeoriaDeEstudio() {
        val mapa = mapaComprensionLectora()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..8).flatMap { w ->
            listOf("cl_t%02d_s01".format(w) to Triple(w, "$w.1", 10),
                "cl_t%02d_s02".format(w) to Triple(w, "$w.2", 10))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("comprension_lectora", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "comprension_lectora" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "Comprensión Literal: Fundamentos y Conceptos Clave",
            mapa.first { it.id == "cl_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_comprensionLectora_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("cl_t01_s01")
            assertTrue(nueva != null, "cl_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges staging")
            assertEquals("comprension_lectora", nueva.subjectId)

            // Fallback legacy: cl_t01_s03 no tiene equivalente nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("cl_t01_s03")
            assertTrue(legacy != null, "cl_t01_s03 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("comprension_lectora", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaComprensionLectora_sinContaminacion() {
        val mapa = mapaComprensionLectora()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en C. Lectora")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en C. Lectora")
        assertTrue(mapa.all { it.subjectId == "comprension_lectora" }, "Todo el mapa es comprension_lectora")
    }
}
