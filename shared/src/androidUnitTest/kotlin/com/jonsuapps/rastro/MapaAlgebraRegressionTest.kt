package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Álgebra (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-16 (32 LessonNodes alg_t01_s01..alg_t16_s02, 352 preguntas revisadas).
 * Legacy alg_t* semanas 1-16 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - subjectId/semana/subtema vacíos o ausentes normalizados en la generación.
 * - Teorías 3987-8524 chars; umbral de teoría en 3500.
 */
class MapaAlgebraRegressionTest {

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

    private fun mapaAlgebra(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("algebra")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaAlgebra_nuevoSemanas1a16_sinLegacy() {
        val mapa = mapaAlgebra()
        // Reemplazo total: todo nodo tiene 11 preguntas revisadas (legacy = 1 challenge).
        assertEquals(32, mapa.size, "Solo los 32 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 11 }, "Sin nodos legacy de 1 challenge")

        val nuevas = mapa.filter { it.id.startsWith("alg_t") }
        assertEquals(32, nuevas.size, "16 semanas nuevas = 32 LessonNodes")
        assertEquals(352, nuevas.sumOf { it.challenges.size }, "352 preguntas revisadas")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..16).toList(), semanas, "Nuevo semanas 1-16: $semanas")
    }

    @Test
    fun mapaAlgebra_nuevasUnaVez_conTeoria() {
        val mapa = mapaAlgebra()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..16).flatMap { w ->
            listOf("alg_t%02d_s01".format(w) to Triple(w, "$w.1", 11),
                "alg_t%02d_s02".format(w) to Triple(w, "$w.2", 11))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("algebra", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // Teoría breve por naturaleza del tema (ver nota: mínimo real 3987).
            assertTrue(
                lesson.theory.resumen.length >= 3500,
                "$id teoría presente (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "algebra" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "Álgebra de Conjuntos, Cuantificadores y Operaciones - Fundamentos y Leyes Principales",
            mapa.first { it.id == "alg_t01_s01" && it.challenges.size == 11 }.title
        )
    }

    @Test
    fun repositorio_algebra_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("alg_t01_s01")
            assertTrue(nueva != null, "alg_t01_s01 debe resolverse")
            assertEquals(11, nueva.challenges.size, "Nuevo con 11 preguntas revisadas")
            assertEquals("algebra", nueva.subjectId)

            // Fallback legacy: alg_t01_s03 no tiene equivalente nuevo → legacy (1 challenge).
            val legacy = AprenderRepository.getLessonByIdSync("alg_t01_s03")
            assertTrue(legacy != null, "alg_t01_s03 debe caer a legacy")
            assertEquals(1, legacy.challenges.size, "Legacy con 1 challenge")
            assertEquals("algebra", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaAlgebra_sinContaminacion() {
        val mapa = mapaAlgebra()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("geo_") }, "Sin Geografía en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("rv_") }, "Sin Raz. Verbal en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("ing_") }, "Sin Inglés en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("rl_") }, "Sin Raz. Lógico en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("rm_") }, "Sin Raz. Matemático en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("quim_") }, "Sin Química en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("fis_") }, "Sin Física en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("trig_t") }, "Sin Trigonometría en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("geom_t") }, "Sin Geometría en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("arit_") }, "Sin Aritmética en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Álgebra")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Álgebra")
        assertTrue(mapa.all { it.subjectId == "algebra" }, "Todo el mapa es algebra")
    }
}
