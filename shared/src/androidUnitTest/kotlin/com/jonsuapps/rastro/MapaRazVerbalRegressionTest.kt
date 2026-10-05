package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Raz. Verbal (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-8 (16 LessonNodes rv_t01_s01..rv_t08_s02, 160 challenges).
 * Legacy rv_t* semanas 1-8 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Nota: el id de app es "raz_verbal" (directorio staging "razonamiento_verbal").
 * Distribución correctIndex real: 40/40/40/40 exacto.
 */
class MapaRazVerbalRegressionTest {

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

    private fun mapaRazVerbal(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("raz_verbal")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaRazVerbal_nuevoSemanas1a8_sinLegacy() {
        val mapa = mapaRazVerbal()
        // Reemplazo total: todo nodo tiene 10 challenges (legacy = 2 challenges).
        assertEquals(16, mapa.size, "Solo los 16 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 10 }, "Sin nodos legacy de 2 challenges")

        val nuevas = mapa.filter { it.id.startsWith("rv_t") }
        assertEquals(16, nuevas.size, "8 semanas nuevas = 16 LessonNodes")
        assertEquals(160, nuevas.sumOf { it.challenges.size }, "160 challenges staging")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..8).toList(), semanas, "Nuevo semanas 1-8: $semanas")
    }

    @Test
    fun mapaRazVerbal_nuevasUnaVez_conTeoriaDeEstudio() {
        val mapa = mapaRazVerbal()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..8).flatMap { w ->
            listOf("rv_t%02d_s01".format(w) to Triple(w, "$w.1", 10),
                "rv_t%02d_s02".format(w) to Triple(w, "$w.2", 10))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("raz_verbal", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "raz_verbal" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "3.1 La Sinonimia Contextual (Superación del Diccionario)",
            mapa.first { it.id == "rv_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_razVerbal_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("rv_t01_s01")
            assertTrue(nueva != null, "rv_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges staging")
            assertEquals("raz_verbal", nueva.subjectId)

            // Fallback legacy: rv_t01_s03 no tiene equivalente nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("rv_t01_s03")
            assertTrue(legacy != null, "rv_t01_s03 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("raz_verbal", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaRazVerbal_sinContaminacion() {
        val mapa = mapaRazVerbal()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("geo_") }, "Sin Geografía en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Raz. Verbal")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Raz. Verbal")
        assertTrue(mapa.all { it.subjectId == "raz_verbal" }, "Todo el mapa es raz_verbal")
    }
}
