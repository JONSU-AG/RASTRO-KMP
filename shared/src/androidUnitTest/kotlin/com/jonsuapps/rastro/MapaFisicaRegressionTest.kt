package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Física (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-12 (24 LessonNodes fis_t01_s01..fis_t12_s02, 264 preguntas revisadas).
 * Legacy fis_t* semanas 1-12 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - subjectId/semana/subtema vacíos o ausentes normalizados en la generación.
 * - Teorías 4057-13243 chars; umbral de teoría en 4000.
 */
class MapaFisicaRegressionTest {

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

    private fun mapaFisica(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("fisica")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaFisica_nuevoSemanas1a12_sinLegacy() {
        val mapa = mapaFisica()
        // Reemplazo total: todo nodo tiene 11 preguntas revisadas (legacy = 1 challenge).
        assertEquals(24, mapa.size, "Solo los 24 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 11 }, "Sin nodos legacy de 1 challenge")

        val nuevas = mapa.filter { it.id.startsWith("fis_t") }
        assertEquals(24, nuevas.size, "12 semanas nuevas = 24 LessonNodes")
        assertEquals(264, nuevas.sumOf { it.challenges.size }, "264 preguntas revisadas")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..12).toList(), semanas, "Nuevo semanas 1-12: $semanas")
    }

    @Test
    fun mapaFisica_nuevasUnaVez_conTeoria() {
        val mapa = mapaFisica()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..12).flatMap { w ->
            listOf("fis_t%02d_s01".format(w) to Triple(w, "$w.1", 11),
                "fis_t%02d_s02".format(w) to Triple(w, "$w.2", 11))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("fisica", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // Teoría breve por naturaleza del tema (ver nota: mínimo real 4057).
            assertTrue(
                lesson.theory.resumen.length >= 4000,
                "$id teoría presente (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "fisica" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "LA FÍSICA, MAGNITUDES Y VECTORES - Fundamentos y Leyes Principales",
            mapa.first { it.id == "fis_t01_s01" && it.challenges.size == 11 }.title
        )
    }

    @Test
    fun repositorio_fisica_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("fis_t01_s01")
            assertTrue(nueva != null, "fis_t01_s01 debe resolverse")
            assertEquals(11, nueva.challenges.size, "Nuevo con 11 preguntas revisadas")
            assertEquals("fisica", nueva.subjectId)

            // Fallback legacy: fis_t01_s03 no tiene equivalente nuevo → legacy (1 challenge).
            val legacy = AprenderRepository.getLessonByIdSync("fis_t01_s03")
            assertTrue(legacy != null, "fis_t01_s03 debe caer a legacy")
            assertEquals(1, legacy.challenges.size, "Legacy con 1 challenge")
            assertEquals("fisica", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaFisica_sinContaminacion() {
        val mapa = mapaFisica()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Física")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Física")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Física")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Física")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Física")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Física")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Física")
        assertTrue(mapa.none { it.id.startsWith("geo_") }, "Sin Geografía en Física")
        assertTrue(mapa.none { it.id.startsWith("rv_") }, "Sin Raz. Verbal en Física")
        assertTrue(mapa.none { it.id.startsWith("ing_") }, "Sin Inglés en Física")
        assertTrue(mapa.none { it.id.startsWith("rl_") }, "Sin Raz. Lógico en Física")
        assertTrue(mapa.none { it.id.startsWith("rm_") }, "Sin Raz. Matemático en Física")
        assertTrue(mapa.none { it.id.startsWith("quim_") }, "Sin Química en Física")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Física")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Física")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Física")
        assertTrue(mapa.all { it.subjectId == "fisica" }, "Todo el mapa es fisica")
    }
}
