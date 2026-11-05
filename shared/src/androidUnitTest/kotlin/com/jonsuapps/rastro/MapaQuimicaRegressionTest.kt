package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Química (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-15 (30 LessonNodes quim_t01_s01..quim_t15_s02, 300 challenges).
 * Legacy con subjectId "quimica" (semanas 1-15) queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas de staging (no se modifica curso-prueba):
 * - subjectId/semana/subtema vacíos o ausentes normalizados en la generación.
 * - Teorías 3355-7317 chars; umbral de teoría en 3000.
 */
class MapaQuimicaRegressionTest {

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

    private fun mapaQuimica(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("quimica")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaQuimica_nuevoSemanas1a16_sinLegacy() {
        val mapa = mapaQuimica()
        // 28 nodos revisados con 11 + 4 nodos con 12 (legacy = 1).
        assertEquals(32, mapa.size, "Solo los 32 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 11 || it.challenges.size == 12 },
            "Nodos revisados de 11 o complementados de 12")
        assertEquals(4, mapa.count { it.challenges.size == 12 }, "4 nodos complementados")

        val nuevas = mapa.filter { it.id.startsWith("quim_t") }
        assertEquals(32, nuevas.size, "16 semanas nuevas = 32 LessonNodes")
        assertEquals(356, nuevas.sumOf { it.challenges.size }, "28 por 11 y 4 por 12")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..16).toList(), semanas, "Nuevo semanas 1-16: $semanas")
    }

    @Test
    fun mapaQuimica_nuevasUnaVez_conTeoria() {
        val mapa = mapaQuimica()
        // Conteos revisados por nivel; cuatro bancos conservan doce preguntas.
        val esperadas = ((1..16).flatMap { w ->
            listOf("quim_t%02d_s01".format(w) to Triple(w, "$w.1", 11),
                "quim_t%02d_s02".format(w) to Triple(w, "$w.2", 11))
        }.toMap() + mapOf(
            "quim_t07_s02" to Triple(7, "7.2", 12),
            "quim_t10_s01" to Triple(10, "10.1", 12),
            "quim_t16_s01" to Triple(16, "16.1", 12),
            "quim_t16_s02" to Triple(16, "16.2", 12)
        ))
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("quimica", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // Teoría breve por naturaleza del tema (ver nota: mínimo real 3355).
            assertTrue(
                lesson.theory.resumen.length >= 3000,
                "$id teoría presente (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "quimica" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "Química, Materia, Sustancias y Transformaciones - Fundamentos y Leyes Principales",
            mapa.first { it.id == "quim_t01_s01" && it.challenges.size == 11 }.title
        )
    }

    @Test
    fun repositorio_quimica_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("quim_t01_s01")
            assertTrue(nueva != null, "quim_t01_s01 debe resolverse")
            assertEquals(11, nueva.challenges.size, "Nuevo con 11 preguntas revisadas")
            assertEquals("quimica", nueva.subjectId)

            // Fallback legacy: qui_t01_s03 no tiene equivalente nuevo → legacy (1 challenge).
            val legacy = AprenderRepository.getLessonByIdSync("qui_t01_s03")
            assertTrue(legacy != null, "qui_t01_s03 debe caer a legacy")
            assertEquals(1, legacy.challenges.size, "Legacy con 1 challenge")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaQuimica_sinContaminacion() {
        val mapa = mapaQuimica()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Química")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Química")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Química")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Química")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Química")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Química")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Química")
        assertTrue(mapa.none { it.id.startsWith("geo_") }, "Sin Geografía en Química")
        assertTrue(mapa.none { it.id.startsWith("rv_") }, "Sin Raz. Verbal en Química")
        assertTrue(mapa.none { it.id.startsWith("ing_") }, "Sin Inglés en Química")
        assertTrue(mapa.none { it.id.startsWith("rl_") }, "Sin Raz. Lógico en Química")
        assertTrue(mapa.none { it.id.startsWith("rm_") }, "Sin Raz. Matemático en Química")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Química")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Química")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Química")
        assertTrue(mapa.all { it.subjectId == "quimica" }, "Todo el mapa es quimica")
    }
}
