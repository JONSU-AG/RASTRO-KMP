package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Ed. Cívica (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-11 (22 LessonNodes civ_t01_s01..civ_t11_s02, 220 challenges).
 * Legacy civ_t* semanas 1-11 queda excluido (reemplazo total, igual que psi_).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - Los 22 nodos traen subjectId/semana/subtema vacíos o en 0;
 *   normalizados a ("civica", semana, "w.k") en la generación.
 * - Distribución correctIndex real: 55/55/55/55 exacto.
 */
class MapaCivicaRegressionTest {

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

    private fun mapaCivica(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("civica")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaCivica_nuevoSemanas1a11_sinLegacy() {
        val mapa = mapaCivica()
        // Reemplazo total: todo nodo tiene 10 challenges (legacy = 1 challenge).
        assertEquals(22, mapa.size, "Solo los 22 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 10 }, "Sin nodos legacy de 1 challenge")

        val nuevas = mapa.filter { it.id.startsWith("civ_t") }
        assertEquals(22, nuevas.size, "11 semanas nuevas = 22 LessonNodes")
        assertEquals(220, nuevas.sumOf { it.challenges.size }, "220 challenges staging")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..11).toList(), semanas, "Nuevo semanas 1-11: $semanas")
    }

    @Test
    fun mapaCivica_nuevasUnaVez_conTeoriaDeEstudio() {
        val mapa = mapaCivica()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..11).flatMap { w ->
            listOf("civ_t%02d_s01".format(w) to Triple(w, "$w.1", 10),
                "civ_t%02d_s02".format(w) to Triple(w, "$w.2", 10))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("civica", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "civica" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "La Persona Humana y la Dignidad Constitucional",
            mapa.first { it.id == "civ_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_civica_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("civ_t01_s01")
            assertTrue(nueva != null, "civ_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges staging")
            assertEquals("civica", nueva.subjectId)

            // Fallback legacy: civ_t01_s03 no tiene equivalente nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("civ_t01_s03")
            assertTrue(legacy != null, "civ_t01_s03 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("civica", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaCivica_sinContaminacion() {
        val mapa = mapaCivica()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Cívica")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Cívica")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Cívica")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Cívica")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Cívica")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Cívica")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Cívica")
        assertTrue(mapa.all { it.subjectId == "civica" }, "Todo el mapa es civica")
    }
}
