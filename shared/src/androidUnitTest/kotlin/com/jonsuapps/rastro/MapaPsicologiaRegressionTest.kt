package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión del piloto Psicología (Google AI Studio → RASTRO, mismo sistema
 * genérico que Biología/Lenguaje/Literatura): convivencia legacy+nuevo sin
 * duplicar ni contaminar.
 *
 * Piloto = solo semana01 nueva (2 LessonNodes psi_t01_s01/s02, 20 challenges).
 * Legacy psi_t01_* (semana 1) queda excluido; legacy semanas 2-15 intacto.
 * Usa fixtures espejo de `src/androidUnitTest/resources` (patrón existente).
 */
class MapaPsicologiaRegressionTest {

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

    private fun mapaPsicologia(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            return GamificationState().learningPath("psicologia")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaPsicologia_completo_29nuevas_sinLegacy() {
        val mapa = mapaPsicologia()
        // Nuevo cubre semanas 1-15 (S05 con 1 nodo): legacy psi_* totalmente excluido.
        val legacy = mapa.filter { it.id.startsWith("psi_t") && it.challenges.size == 2 }
        assertEquals(0, legacy.size, "Legacy reemplazado por contenido nuevo 1-15")

        val nuevas = mapa.filter { it.id.startsWith("psi_t") }
        assertEquals(29, nuevas.size, "15 semanas nuevas = 29 LessonNodes")
        assertEquals(290, nuevas.sumOf { it.challenges.size }, "290 challenges Google")

        val semanas = mapa.map { it.semana }.distinct().sorted()
        assertEquals((1..15).toList(), semanas, "Semanas 1-15 en orden: $semanas")
    }

    @Test
    fun mapaPsicologia_nuevas_unaVez_conTeoriaDeEstudio() {
        val mapa = mapaPsicologia()
        // (semana, subtema, challenges) por nodo; S05 solo s01.
        val esperadas = mapOf(
            "psi_t01_s01" to Triple(1, "1.1", 10),
            "psi_t01_s02" to Triple(1, "1.2", 10),
            "psi_t02_s01" to Triple(2, "2.1", 10),
            "psi_t02_s02" to Triple(2, "2.2", 10),
            "psi_t03_s01" to Triple(3, "3.1", 10),
            "psi_t03_s02" to Triple(3, "3.2", 10),
            "psi_t04_s01" to Triple(4, "4.1", 10),
            "psi_t04_s02" to Triple(4, "4.2", 10),
            "psi_t05_s01" to Triple(5, "5.1", 10),
            "psi_t06_s01" to Triple(6, "6.1", 10),
            "psi_t06_s02" to Triple(6, "6.2", 10),
            "psi_t07_s01" to Triple(7, "7.1", 10),
            "psi_t07_s02" to Triple(7, "7.2", 10),
            "psi_t08_s01" to Triple(8, "8.1", 10),
            "psi_t08_s02" to Triple(8, "8.2", 10),
            "psi_t09_s01" to Triple(9, "9.1", 10),
            "psi_t09_s02" to Triple(9, "9.2", 10),
            "psi_t10_s01" to Triple(10, "10.1", 10),
            "psi_t10_s02" to Triple(10, "10.2", 10),
            "psi_t11_s01" to Triple(11, "11.1", 10),
            "psi_t11_s02" to Triple(11, "11.2", 10),
            "psi_t12_s01" to Triple(12, "12.1", 10),
            "psi_t12_s02" to Triple(12, "12.2", 10),
            "psi_t13_s01" to Triple(13, "13.1", 10),
            "psi_t13_s02" to Triple(13, "13.2", 10),
            "psi_t14_s01" to Triple(14, "14.1", 10),
            "psi_t14_s02" to Triple(14, "14.2", 10),
            "psi_t15_s01" to Triple(15, "15.1", 10),
            "psi_t15_s02" to Triple(15, "15.2", 10)
        )
        for ((id, esp) in esperadas) {
            val l = mapa.filter { it.id == id && it.challenges.size == esp.third }
            assertEquals(1, l.size, "$id nuevo exactamente una vez")
            val lesson = l.first()
            assertEquals("psicologia", lesson.subjectId)
            assertEquals(esp.first, lesson.semana)
            assertEquals(esp.second, lesson.subtema)
            assertTrue(lesson.title.isNotBlank(), "$id con título")
            assertTrue(lesson.theory.resumen.isNotBlank(), "$id con teoría transportada")
            // MATERIAL DE ESTUDIO, no ficha de repaso.
            assertTrue(
                lesson.theory.resumen.length >= 8000,
                "$id teoría desarrollada (resumen=${lesson.theory.resumen.length} chars)"
            )
            assertTrue(lesson.challenges.all { it.subject == "psicologia" && it.semana == esp.first })
            assertTrue(lesson.challenges.all { it.correctIndex in 0..3 }, "$id correctIndex válido")
            assertTrue(lesson.challenges.all { it.explanation.isNotBlank() }, "$id explanations presentes")
            assertTrue(lesson.challenges.all { it.options.size == 4 }, "$id 4 opciones")
        }
        // Spot-check anti-corrupción: título piloto verbatim Google.
        assertEquals(
            "3.1. Definición, Etimología y Evolución Epistemológica",
            mapa.first { it.id == "psi_t01_s01" && it.challenges.size == 10 }.title
        )
    }

    @Test
    fun repositorio_psicologia_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            val nueva = AprenderRepository.getLessonByIdSync("psi_t01_s01")
            assertTrue(nueva != null, "psi_t01_s01 debe resolverse")
            assertEquals(10, nueva.challenges.size, "Nuevo con 10 challenges Google")
            assertEquals("psicologia", nueva.subjectId)

            // Fallback legacy: psi_t05_s02 no tiene subtopic 5.2 nuevo → legacy (2 challenges).
            val legacy = AprenderRepository.getLessonByIdSync("psi_t05_s02")
            assertTrue(legacy != null, "psi_t05_s02 debe caer a legacy")
            assertEquals(2, legacy.challenges.size, "Legacy con 2 challenges")
            assertEquals("psicologia", legacy.subjectId)
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaPsicologia_sinContaminacion() {
        val mapa = mapaPsicologia()
        assertTrue(mapa.none { it.id.startsWith("bio_") }, "Sin Biología en Psicología")
        assertTrue(mapa.none { it.id.startsWith("leng_") }, "Sin Lenguaje en Psicología")
        assertTrue(mapa.none { it.id.startsWith("len_t") }, "Sin legacy Lenguaje en Psicología")
        assertTrue(mapa.none { it.id.startsWith("lit_t") }, "Sin Literatura en Psicología")
        assertTrue(mapa.all { it.subjectId == "psicologia" }, "Todo el mapa es psicología")
    }
}
