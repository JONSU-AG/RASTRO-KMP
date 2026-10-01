package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión del piloto Lenguaje (Google AI Studio → RASTRO, mismo sistema
 * genérico que Biología): convivencia legacy+nuevo sin duplicar ni contaminar.
 *
 * Lenguaje completo: 8 semanas nuevas (19 LessonNodes leng_t01_s01..leng_t08_s02,
 * 194 challenges Google). El contenido nuevo cubre las semanas 1-8, por lo que el
 * legacy len_* queda totalmente excluido del mapa (mismo reemplazo que Biología
 * 8.x). Usa fixtures espejo de `src/androidUnitTest/resources` (igual que Biología).
 */
class MapaLenguajeRegressionTest {

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

    private fun mapaLenguaje(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("lenguaje")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaLenguaje_completo_19nuevas_sinLegacy() {
        val mapa = mapaLenguaje()
        // Nuevo cubre semanas 1-8: legacy len_* totalmente excluido (sin duplicar).
        val legacy = mapa.filter { it.id.startsWith("len_t") }
        assertEquals(0, legacy.size, "Legacy reemplazado por contenido nuevo 1-8")

        val nuevas = mapa.filter { it.id.startsWith("leng_t") }
        assertEquals(19, nuevas.size, "8 semanas nuevas = 19 LessonNodes")
        assertEquals(194, nuevas.sumOf { it.challenges.size }, "194 challenges Google")

        val semanas = mapa.map { it.semana }.distinct().sorted()
        assertEquals((1..8).toList(), semanas, "Semanas 1-8 en orden: $semanas")
    }

    @Test
    fun mapaLenguaje_nuevas_unaVez_conTeoriaDeEstudio() {
        val mapa = mapaLenguaje()
        // Challenges Google por nodo: s01x10 (salvo t01_s03=12 y t02_s02=12).
        val esperados = mapOf(
            "leng_t01_s01" to Triple(1, "1.1", 10),
            "leng_t01_s02" to Triple(1, "1.2", 10),
            "leng_t01_s03" to Triple(1, "1.3", 12),
            "leng_t02_s01" to Triple(2, "2.1", 10),
            "leng_t02_s02" to Triple(2, "2.2", 12),
            "leng_t03_s01" to Triple(3, "3.1", 10),
            "leng_t03_s02" to Triple(3, "3.2", 10),
            "leng_t03_s03" to Triple(3, "3.3", 10),
            "leng_t04_s01" to Triple(4, "4.1", 10),
            "leng_t04_s02" to Triple(4, "4.2", 10),
            "leng_t05_s01" to Triple(5, "5.1", 10),
            "leng_t05_s02" to Triple(5, "5.2", 10),
            "leng_t06_s01" to Triple(6, "6.1", 10),
            "leng_t06_s02" to Triple(6, "6.2", 10),
            "leng_t07_s01" to Triple(7, "7.1", 10),
            "leng_t07_s02" to Triple(7, "7.2", 10),
            "leng_t07_s03" to Triple(7, "7.3", 10),
            "leng_t08_s01" to Triple(8, "8.1", 10),
            "leng_t08_s02" to Triple(8, "8.2", 10)
        )
        for ((id, esp) in esperados) {
            val matches = mapa.filter { it.id == id }
            assertEquals(1, matches.size, "$id exactamente una vez")
            val l = matches.first()
            assertEquals("lenguaje", l.subjectId)
            assertEquals(esp.first, l.semana)
            assertEquals(esp.second, l.subtema)
            assertTrue(l.title.isNotBlank(), "$id con título")
            assertEquals(esp.third, l.challenges.size, "$id con sus challenges Google")
            assertTrue(l.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                l.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${l.theory.resumen.length} chars)"
            )
            assertTrue(l.challenges.all { it.subject == "lenguaje" && it.semana == esp.first })
            assertTrue(l.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(l.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(l.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Títulos piloto verbatim Google (spot-check anti-corrupción).
        assertEquals(
            "El Circuito Comunicativo: Fases, Elementos y Fenómenos Interferentes",
            mapa.first { it.id == "leng_t01_s01" }.title
        )
    }

    @Test
    fun repositorio_lenguaje_nuevoPrimero_legacySinCruce() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("leng_t01_s01")
            assertTrue(nueva != null, "leng_t01_s01 debe resolverse del sistema nuevo")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges Google")

            // Legacy intacto y direccionable por sus propios IDs (sin cruce de namespaces).
            val legacy = AprenderRepository.getLessonByIdSync("len_t02_s01")
            assertTrue(legacy != null, "len_t02_s01 legacy debe seguir resolviéndose")
            assertEquals("lenguaje", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaLenguaje_sinContaminacionBiologia() {
        val mapa = mapaLenguaje()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin lecciones de Biología en Lenguaje")
        assertTrue(mapa.none { it.subjectId != "lenguaje" }, "Todo el mapa es lenguaje")
        val semanas = mapa.map { it.semana }.distinct().sorted()
        assertEquals((1..8).toList(), semanas, "Semanas 1-8 presentes: $semanas")
    }
}
