package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Inglés (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-7 (14 LessonNodes ing_t01_s01..ing_t07_s02, 140 challenges).
 * Legacy ing_t* semanas 1-7 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - Sin CONTROL.md; subjectId/semana/subtema vacíos o ausentes normalizados
 *   a ("ingles", semana, "w.k") en la generación.
 * - Distribución correctIndex real: A=59, B=41, C=19, D=21 (sesgada a A).
 * - Teorías cortas (3420-6429 chars, temas de gramática/vocabulario);
 *   umbral de teoría en 3000.
 */
class MapaInglesRegressionTest {

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

    private fun mapaIngles(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("ingles")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaIngles_nuevoSemanas1a7_sinLegacy() {
        val mapa = mapaIngles()
        // Reemplazo total: todo nodo tiene 10 challenges (legacy = 2 challenges).
        assertEquals(14, mapa.size, "Solo los 14 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 10 }, "Sin nodos legacy de 2 challenges")

        val nuevas = mapa.filter { it.id.startsWith("ing_t") }
        assertEquals(14, nuevas.size, "7 semanas nuevas = 14 LessonNodes")
        assertEquals(140, nuevas.sumOf { it.challenges.size }, "140 challenges staging")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..7).toList(), semanas, "Nuevo semanas 1-7: $semanas")
    }

    @Test
    fun mapaIngles_nuevasUnaVez_conTeoria() {
        val mapa = mapaIngles()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..7).flatMap { w ->
            listOf("ing_t%02d_s01".format(w) to Triple(w, "$w.1", 10),
                "ing_t%02d_s02".format(w) to Triple(w, "$w.2", 10))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("ingles", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // Teoría breve por naturaleza del tema (ver nota: mínimo real 3420).
            assertTrue(
                lesson.theory.resumen.length >= 3000,
                "$id teoría presente (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "ingles" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "Tiempos Verbales de Presente: Present Simple vs. Present Continuous y Stative Verbs - Core Rules & Foundations",
            mapa.first { it.id == "ing_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_ingles_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("ing_t01_s01")
            assertTrue(nueva != null, "ing_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges staging")
            assertEquals("ingles", nueva.subjectId)

            // Fallback legacy: ing_t01_s03 no tiene equivalente nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("ing_t01_s03")
            assertTrue(legacy != null, "ing_t01_s03 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("ingles", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaIngles_sinContaminacion() {
        val mapa = mapaIngles()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Inglés")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Inglés")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Inglés")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Inglés")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Inglés")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Inglés")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Inglés")
        assertTrue(mapa.none { it.id.startsWith("geo_") }, "Sin Geografía en Inglés")
        assertTrue(mapa.none { it.id.startsWith("rv_") }, "Sin Raz. Verbal en Inglés")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Inglés")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Inglés")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Inglés")
        assertTrue(mapa.all { it.subjectId == "ingles" }, "Todo el mapa es ingles")
    }
}
