package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Aritmética (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-13 (26 LessonNodes arit_t01_s01..arit_t13_s02, 286 preguntas revisadas).
 * Legacy ari_t* semanas 1-13 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - subjectId/semana/subtema vacíos o ausentes normalizados en la generación.
 * - Teorías 5173-6888 chars; umbral de teoría en 5000.
 */
class MapaAritmeticaRegressionTest {

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

    private fun mapaAritmetica(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("aritmetica")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaAritmetica_nuevoSemanas1a13_sinLegacy() {
        val mapa = mapaAritmetica()
        // Reemplazo total: todo nodo tiene 11 preguntas revisadas (legacy = 1 challenge).
        assertEquals(26, mapa.size, "Solo los 26 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 11 }, "Sin nodos legacy de 1 challenge")

        val nuevas = mapa.filter { it.id.startsWith("arit_t") }
        assertEquals(26, nuevas.size, "13 semanas nuevas = 26 LessonNodes")
        assertEquals(286, nuevas.sumOf { it.challenges.size }, "286 preguntas revisadas")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..13).toList(), semanas, "Nuevo semanas 1-13: $semanas")
    }

    @Test
    fun mapaAritmetica_nuevasUnaVez_conTeoria() {
        val mapa = mapaAritmetica()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..13).flatMap { w ->
            listOf("arit_t%02d_s01".format(w) to Triple(w, "$w.1", 11),
                "arit_t%02d_s02".format(w) to Triple(w, "$w.2", 11))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("aritmetica", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // Teoría desarrollada (ver nota: mínimo real 5173).
            assertTrue(
                lesson.theory.resumen.length >= 5000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "aritmetica" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "Relaciones Lógicas y Conjuntos - Fundamentos y Leyes Principales",
            mapa.first { it.id == "arit_t01_s01" && it.challenges.size == 11 }.title
        )
    }

    @Test
    fun repositorio_aritmetica_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("arit_t01_s01")
            assertTrue(nueva != null, "arit_t01_s01 debe resolverse")
            assertEquals(11, nueva.challenges.size, "Nuevo con 11 preguntas revisadas")
            assertEquals("aritmetica", nueva.subjectId)

            // Fallback legacy: ari_t01_s03 no tiene equivalente nuevo → legacy (1 challenge).
            val legacy = AprenderRepository.getLessonByIdSync("ari_t01_s03")
            assertTrue(legacy != null, "ari_t01_s03 debe caer a legacy")
            assertEquals(1, legacy.challenges.size, "Legacy con 1 challenge")
            assertEquals("aritmetica", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaAritmetica_sinContaminacion() {
        val mapa = mapaAritmetica()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("geo_") }, "Sin Geografía en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("rv_") }, "Sin Raz. Verbal en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("ing_") }, "Sin Inglés en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("rl_") }, "Sin Raz. Lógico en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("rm_") }, "Sin Raz. Matemático en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("quim_") }, "Sin Química en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("fis_") }, "Sin Física en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("trig_t") }, "Sin Trigonometría en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("geom_t") }, "Sin Geometría en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Aritmética")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Aritmética")
        assertTrue(mapa.all { it.subjectId == "aritmetica" }, "Todo el mapa es aritmetica")
    }
}
