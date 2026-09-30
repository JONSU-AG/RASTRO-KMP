package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.gamification.GamificationState
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Regresión del bug real "mapa de Biología termina en Semana 7".
 * Cubre la COLECCIÓN que alimenta el mapa (la que usa la UI), no solo getLessonById:
 * si Semana 8 vuelve a desaparecer del listado, este test falla aunque el build esté verde.
 *
 * Vive en androidUnitTest (JVM con java.io/ClassLoader) porque en unit tests no hay
 * Context Android y `Res` no resuelve; el loader recibe un lector respaldado por los
 * fixtures de `src/androidUnitTest/resources` (espejo de composeResources). En la app
 * real se usa `Res` (verificado: archivos empaquetados en el APK).
 */
class MapaBiologiaRegressionTest {

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

    private fun mapaBiologia(): List<com.jonsuapps.rastro.model.LessonNode> {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            // Colección REAL del mapa: GamificationState.learningPath usa getLessonsForSubjectSync.
            return GamificationState().learningPath("biologia")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun mapaBiologia_contieneLegacy17_mas81_exactamenteUnaVez() {
        val mapa = mapaBiologia()

        val legacy17 = mapa.filter { it.semana in 1..7 }
        assertTrue(legacy17.isNotEmpty(), "El mapa debe incluir legacy Semanas 1-7")

        val de81 = mapa.filter { it.id == "bio_t08_s01" }
        assertEquals(1, de81.size, "8.1 debe aparecer EXACTAMENTE una vez en el mapa")

        val lesson81 = de81.first()
        assertEquals("biologia", lesson81.subjectId)
        assertEquals(8, lesson81.semana)
        assertEquals("8.1", lesson81.subtema)
        assertEquals("Sistema Digestivo Humano", lesson81.title)
        assertEquals(15, lesson81.challenges.size, "8.1 debe traer sus 15 preguntas")
        assertTrue(lesson81.challenges.all { it.subject == "biologia" && it.semana == 8 })
    }

    @Test
    fun mapaBiologia_semana8DespuesDeSemana7() {
        val semanas = mapaBiologia().map { it.semana }.distinct()
        assertTrue(7 in semanas && 8 in semanas, "Semanas 7 y 8 presentes: $semanas")
        assertTrue(
            semanas.indexOf(8) == semanas.indexOf(7) + 1,
            "Semana 8 inmediatamente después de Semana 7: $semanas"
        )
    }

    @Test
    fun mapaBiologia_completa_28legacy_mas24nuevas() {
        val mapa = mapaBiologia()
        assertEquals(52, mapa.size, "28 legacy (1-7) + 24 nuevas (8-13) = 52 lecciones")

        val nuevas = mapOf(
            "bio_t09_s01" to Triple(9, "9.1", "Sistema Excretor y Fisiología Renal"),
            "bio_t09_s02" to Triple(9, "9.2", "Sistema Nervioso Central y Arco Reflejo"),
            "bio_t09_s03" to Triple(9, "9.3", "Sistema Nervioso Autónomo"),
            "bio_t09_s04" to Triple(9, "9.4", "Sistema Endocrino Humano"),
            "bio_t10_s01" to Triple(10, "10.1", "Ciclo Celular y Puntos de Control"),
            "bio_t10_s02" to Triple(10, "10.2", "Mitosis y División Celular"),
            "bio_t10_s03" to Triple(10, "10.3", "Meiosis y Recombinación Genética"),
            "bio_t10_s04" to Triple(10, "10.4", "Gametogénesis y Ciclo Menstrual Humano"),
            "bio_t11_s01" to Triple(11, "11.1", "Leyes de Mendel y Monohibridismo"),
            "bio_t11_s02" to Triple(11, "11.2", "Herencia No Mendeliana y Grupos Sanguíneos"),
            "bio_t11_s03" to Triple(11, "11.3", "Herencia Ligada al Sexo"),
            "bio_t11_s04" to Triple(11, "11.4", "Mutaciones y Anomalías Cromosómicas"),
            "bio_t12_s01" to Triple(12, "12.1", "Teorías del Origen de la Vida"),
            "bio_t12_s02" to Triple(12, "12.2", "Teorías de la Evolución Biológica"),
            "bio_t12_s03" to Triple(12, "12.3", "Pruebas de la Evolución"),
            "bio_t12_s04" to Triple(12, "12.4", "Taxonomía y Dominios Biológicos"),
            "bio_t13_s01" to Triple(13, "13.1", "Ecosistema, Hábitat y Redes Tróficas"),
            "bio_t13_s02" to Triple(13, "13.2", "Ciclos Biogeoquímicos"),
            "bio_t13_s03" to Triple(13, "13.3", "Relaciones Biológicas Interespecíficas"),
            "bio_t13_s04" to Triple(13, "13.4", "Contaminación y Áreas Protegidas del Perú")
        )
        for ((id, esp) in nuevas) {
            val matches = mapa.filter { it.id == id }
            assertEquals(1, matches.size, "$id exactamente una vez")
            val l = matches.first()
            assertEquals("biologia", l.subjectId)
            assertEquals(esp.first, l.semana)
            assertEquals(esp.second, l.subtema)
            assertEquals(esp.third, l.title)
            assertTrue(l.challenges.isNotEmpty(), "$id con preguntas")
            assertTrue(l.theory.resumen.isNotBlank(), "$id con teoría transportada")
            assertTrue(l.challenges.all { it.subject == "biologia" && it.semana == esp.first })
            // Regla ESTUDIO-no-REPASO: teoría desarrollada, no ficha (mínimo pedagógico).
            assertTrue(
                l.theory.resumen.length >= 1500,
                "$id teoría desarrollada (resumen=${l.theory.resumen.length} chars)"
            )
        }

        // Orden natural por semana en la colección del mapa.
        val semanas = mapa.map { it.semana }.distinct()
        assertEquals((1..13).toList(), semanas, "Semanas 1-13 en orden: $semanas")
    }

    @Test
    fun repositorio_resuelveCadaLeccionNuevaSinCruce() {
        val esperados = mapOf(
            "bio_t09_s01" to "Sistema Excretor y Fisiología Renal",
            "bio_t10_s03" to "Meiosis y Recombinación Genética",
            "bio_t11_s02" to "Herencia No Mendeliana y Grupos Sanguíneos",
            "bio_t12_s04" to "Taxonomía y Dominios Biológicos",
            "bio_t13_s02" to "Ciclos Biogeoquímicos"
        )
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            for ((id, titulo) in esperados) {
                val l = AprenderRepository.getLessonByIdSync(id)
                assertTrue(l != null, "$id debe resolverse")
                assertEquals(titulo, l.title, "$id título propio (sin cruce)")
                assertTrue(l.theory.resumen.isNotBlank(), "$id teoría propia")
            }
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }

    @Test
    fun repositorio_81_nuevoPrimero_legacyComoRespaldo() {
        AprenderRepository.testLoaderOverride = testLoader()
        try {
            // 8.1 debe resolverse del sistema nuevo (15 preguntas), no del legacy (1).
            val lesson = AprenderRepository.getLessonByIdSync("bio_t08_s01")
            assertTrue(lesson != null, "bio_t08_s01 debe resolverse")
            assertEquals(15, lesson.challenges.size, "Debe venir del sistema nuevo (15), no del legacy (1)")
        } finally {
            AprenderRepository.testLoaderOverride = null
        }
    }
}
