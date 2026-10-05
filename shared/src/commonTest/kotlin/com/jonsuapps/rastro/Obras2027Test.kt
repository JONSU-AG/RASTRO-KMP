package com.jonsuapps.rastro

import com.jonsuapps.rastro.data.LiteraturaRepository
import kotlin.test.*

class Obras2027Test {
    @Test fun separateCollectionsAndPreserveSavedIds() {
        val works = LiteraturaRepository.obras
        assertEquals(48, works.size)
        assertEquals(works.size, works.map { it.id }.distinct().size)
        val split = mapOf("rimas-y-leyendas" to "Rimas", "leyendas-becquer" to "Leyendas",
            "ficciones-y-el-aleph" to "Ficciones", "el-aleph" to "El Aleph",
            "trilce-poemas-humanos" to "Trilce", "poemas-humanos" to "Poemas humanos",
            "yaravies-y-fabulas" to "Yaravíes", "fabulas-melgar" to "Fábulas")
        split.forEach { (id, title) ->
            val work = assertNotNull(LiteraturaRepository.getById(id))
            assertEquals(title, work.titulo)
            assertTrue(work.sinopsis.length > 600)
            assertTrue(work.analisisTrama.isNotEmpty())
        }
    }
    @Test fun officialMissingTitleAndVerifiedRegionalWorksArePresent() {
        assertEquals("Los heraldos negros", LiteraturaRepository.getById("los-heraldos-negros")?.titulo)
        assertNotNull(LiteraturaRepository.getById("discurso-en-el-politeama"))
        assertNotNull(LiteraturaRepository.getById("los-gallinazos-sin-plumas"))
        assertNotNull(LiteraturaRepository.getById("espana-aparta-de-mi-este-caliz"))
        assertTrue(LiteraturaRepository.obras.any { it.titulo == "Canto villano" })
        assertEquals("Jornada heroica", LiteraturaRepository.getById("percy-gibson-poesia")?.titulo)
        assertEquals("Jake Aru", LiteraturaRepository.getById("jose-luis-ayala")?.titulo)
        assertFalse(LiteraturaRepository.obras.any { "Quipus" in it.titulo || "Wanq" in it.titulo })
    }
}
