package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Raz. Lógico (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-9 (18 LessonNodes rl_t01_s01..rl_t09_s02, 198 preguntas revisadas).
 * Legacy rl_t* semanas 1-9 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - subjectId/semana/subtema vacíos o ausentes normalizados en la generación.
 * - Teorías 4509-6069 chars; umbral de teoría en 4000.
 */
class MapaRazLogicoRegressionTest {

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

    private fun mapaRazLogico(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("raz_logico")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaRazLogico_nuevoSemanas1a9_sinLegacy() {
        val mapa = mapaRazLogico()
        // Reemplazo total: todo nodo tiene 11 preguntas revisadas (legacy = 2 challenges).
        assertEquals(18, mapa.size, "Solo los 18 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 11 }, "Sin nodos legacy de 2 challenges")

        val nuevas = mapa.filter { it.id.startsWith("rl_t") }
        assertEquals(18, nuevas.size, "9 semanas nuevas = 18 LessonNodes")
        assertEquals(198, nuevas.sumOf { it.challenges.size }, "198 preguntas revisadas")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..9).toList(), semanas, "Nuevo semanas 1-9: $semanas")
    }

    @Test
    fun mapaRazLogico_nuevasUnaVez_conTeoria() {
        val mapa = mapaRazLogico()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..9).flatMap { w ->
            listOf("rl_t%02d_s01".format(w) to Triple(w, "$w.1", 11),
                "rl_t%02d_s02".format(w) to Triple(w, "$w.2", 11))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("raz_logico", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // Teoría breve por naturaleza del tema (ver nota: mínimo real 4509).
            assertTrue(
                lesson.theory.resumen.length >= 4000,
                "$id teoría presente (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "raz_logico" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "PROPOSICIONES Y ENUNCIADOS LÓGICOS - Fundamentos y Leyes Principales",
            mapa.first { it.id == "rl_t01_s01" && it.challenges.size == 11 }.title
        )
    }

    @Test
    fun repositorio_razLogico_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("rl_t01_s01")
            assertTrue(nueva != null, "rl_t01_s01 debe resolverse")
            assertEquals(11, nueva.challenges.size, "Nuevo con 11 preguntas revisadas")
            assertEquals("raz_logico", nueva.subjectId)

            // Fallback legacy: rl_t01_s03 no tiene equivalente nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("rl_t01_s03")
            assertTrue(legacy != null, "rl_t01_s03 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("raz_logico", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaRazLogico_sinContaminacion() {
        val mapa = mapaRazLogico()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("geo_") }, "Sin Geografía en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("rv_") }, "Sin Raz. Verbal en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("ing_") }, "Sin Inglés en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Raz. Lógico")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Raz. Lógico")
        assertTrue(mapa.all { it.subjectId == "raz_logico" }, "Todo el mapa es raz_logico")
    }
}
