package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión de Geometría (SALIDA_KOTLIN → RASTRO, mismo sistema genérico
 * que las demás materias): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Nuevo = semanas 1-11 (22 LessonNodes geom_t01_s01..geom_t11_s02, 242 preguntas revisadas).
 * Legacy geo_t* semanas 1-11 queda excluido (reemplazo total).
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 *
 * Notas (no se modifica curso-prueba ni otras materias):
 * - subjectId/semana/subtema vacíos o ausentes normalizados en la generación.
 * - Teorías 4255-8458 chars; umbral de teoría en 4000.
 * - geo_t* también existe en geografía-nuevo, con distinto subjectId:
 *   sin contaminación (cada mapa filtra por subjectId).
 */
class MapaGeometriaRegressionTest {

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

    private fun mapaGeometria(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("geometria")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaGeometria_nuevoSemanas1a11_sinLegacy() {
        val mapa = mapaGeometria()
        // Reemplazo total: todo nodo tiene 11 preguntas revisadas (legacy = 1 challenge).
        assertEquals(22, mapa.size, "Solo los 22 nodos nuevos, sin legacy")
        assertTrue(mapa.all { it.challenges.size == 11 }, "Sin nodos legacy de 1 challenge")

        val nuevas = mapa.filter { it.id.startsWith("geom_t") }
        assertEquals(22, nuevas.size, "11 semanas nuevas = 22 LessonNodes")
        assertEquals(242, nuevas.sumOf { it.challenges.size }, "242 preguntas revisadas")

        val semanas = nuevas.map { it.semana }.distinct().sorted()
        assertEquals((1..11).toList(), semanas, "Nuevo semanas 1-11: $semanas")
    }

    @Test
    fun mapaGeometria_nuevasUnaVez_conTeoria() {
        val mapa = mapaGeometria()
        // (semana, subtema, challenges) por nodo.
        val esperadas = (1..11).flatMap { w ->
            listOf("geom_t%02d_s01".format(w) to Triple(w, "$w.1", 11),
                "geom_t%02d_s02".format(w) to Triple(w, "$w.2", 11))
        }.toMap()
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("geometria", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // Teoría breve por naturaleza del tema (ver nota: mínimo real 4255).
            assertTrue(
                lesson.theory.resumen.length >= 4000,
                "$id teoría presente (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "geometria" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título staging verbatim.
        assertEquals(
            "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            mapa.first { it.id == "geom_t01_s01" && it.challenges.size == 11 }.title
        )
    }

    @Test
    fun repositorio_geometria_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("geom_t01_s01")
            assertTrue(nueva != null, "geom_t01_s01 debe resolverse")
            assertEquals(11, nueva.challenges.size, "Nuevo con 11 preguntas revisadas")
            assertEquals("geometria", nueva.subjectId)

            // Fallback legacy: geo_t01_s03 no tiene equivalente nuevo → legacy (1 challenge).
            val legacy = AprenderRepository.getLessonByIdSync("geo_t01_s03")
            assertTrue(legacy != null, "geo_t01_s03 debe caer a legacy")
            assertEquals(1, legacy.challenges.size, "Legacy con 1 challenge")
            assertEquals("geometria", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaGeometria_sinContaminacion() {
        val mapa = mapaGeometria()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Geometría")
        assertTrue(mapa.none { it.id.startsWith("psi_") }, "Sin Psicología en Geometría")
        assertTrue(mapa.none { it.id.startsWith("hper_") }, "Sin Hist. Perú en Geometría")
        assertTrue(mapa.none { it.id.startsWith("huni_") }, "Sin Hist. Universal en Geometría")
        assertTrue(mapa.none { it.id.startsWith("civ_") }, "Sin Cívica en Geometría")
        assertTrue(mapa.none { it.id.startsWith("filo_") }, "Sin Filosofía en Geometría")
        assertTrue(mapa.none { it.id.startsWith("cl_") }, "Sin C. Lectora en Geometría")
        assertTrue(mapa.none { it.id.startsWith("rv_") }, "Sin Raz. Verbal en Geometría")
        assertTrue(mapa.none { it.id.startsWith("ing_") }, "Sin Inglés en Geometría")
        assertTrue(mapa.none { it.id.startsWith("rl_") }, "Sin Raz. Lógico en Geometría")
        assertTrue(mapa.none { it.id.startsWith("rm_") }, "Sin Raz. Matemático en Geometría")
        assertTrue(mapa.none { it.id.startsWith("quim_") }, "Sin Química en Geometría")
        assertTrue(mapa.none { it.id.startsWith("fis_") }, "Sin Física en Geometría")
        assertTrue(mapa.none { it.id.startsWith("trig_t") }, "Sin Trigonometría en Geometría")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Geometría")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Geometría")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Geometría")
        // geo_t* es legacy propio (no geografía: distinto subjectId, filtrado arriba).
        assertTrue(mapa.none { it.id.startsWith("geo_t") }, "Sin legacy geo_ en Geometría")
        assertTrue(mapa.all { it.subjectId == "geometria" }, "Todo el mapa es geometria")
    }
}
