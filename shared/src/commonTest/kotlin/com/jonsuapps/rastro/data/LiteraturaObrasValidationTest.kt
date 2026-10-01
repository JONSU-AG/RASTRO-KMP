package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.data.obras.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LiteraturaObrasValidationTest {

    @Test
    fun testAll40ObrasArePresent() {
        val allObras = LiteraturaRepository.obras
        assertEquals(40, allObras.size, "Deben existir exactamente 40 obras literarias en LiteraturaRepository")
    }

    @Test
    fun testLaIliadaIntegrity() {
        val iliada = Obra01Iliada
        assertEquals("la-iliada", iliada.id)
        assertEquals("La Ilíada", iliada.titulo)
        assertEquals("Homero", iliada.autor)
        assertTrue(iliada.personajes.isNotEmpty(), "La Ilíada debe tener personajes reales")
        assertTrue(iliada.analisisTrama.isNotEmpty(), "La Ilíada debe tener escenas de trama reales")
        assertTrue(iliada.sinopsis.length > 500, "La sinopsis de La Ilíada no debe estar resumida")
        assertEquals("", iliada.bannerUrl, "bannerUrl por defecto debe ser vacío")
    }

    @Test
    fun testLaOdiseaIntegrity() {
        val odisea = Obra02Odisea
        assertEquals("la-odisea", odisea.id)
        assertEquals("La Odisea", odisea.titulo)
        assertEquals("Homero", odisea.autor)
        assertTrue(odisea.personajes.isNotEmpty(), "La Odisea debe tener personajes reales")
        assertTrue(odisea.analisisTrama.isNotEmpty(), "La Odisea debe tener escenas de trama reales")
        assertTrue(odisea.sinopsis.length > 500, "La sinopsis de La Odisea no debe estar resumida")
    }

    @Test
    fun testEdipoReyIntegrity() {
        val edipo = Obra03EdipoRey
        assertEquals("edipo-rey", edipo.id)
        assertEquals("Edipo rey", edipo.titulo)
        assertEquals("Sófocles", edipo.autor)
        assertTrue(edipo.personajes.isNotEmpty(), "Edipo Rey debe tener personajes reales")
        assertTrue(edipo.analisisTrama.isNotEmpty(), "Edipo Rey debe tener escenas de trama reales")
        assertTrue(edipo.sinopsis.length > 500, "La sinopsis de Edipo Rey no debe estar resumida")
    }

    @Test
    fun testPajinasLibresHasDistinctStructureWithoutFakeTrama() {
        val pajinas = Obra22PajinasLibres
        assertEquals("pajinas-libres", pajinas.id)
        assertEquals("Pájinas Libres", pajinas.titulo)
        assertEquals("Manuel González Prada", pajinas.autor)
        assertTrue(pajinas.analisisTrama.isNotEmpty(), "Pájinas Libres tiene análisis de discursos estructurado")
        assertTrue(pajinas.personajes.isNotEmpty(), "Pájinas Libres tiene figuras/personajes históricos")
        assertTrue(pajinas.sinopsis.isNotBlank(), "Pájinas Libres tiene sinopsis completa")
    }

    @Test
    fun testObraModelCompatibilityWithNewVisualProperties() {
        val obra = Obra01Iliada.copy(
            bannerUrl = "https://firebasestorage.googleapis.com/banner.png",
            coverUrl = "https://firebasestorage.googleapis.com/cover.png"
        )
        assertEquals("https://firebasestorage.googleapis.com/banner.png", obra.bannerUrl)
        assertEquals("https://firebasestorage.googleapis.com/cover.png", obra.coverUrl)

        val primerPersonaje = obra.personajes.first().copy(imageUrl = "https://firebasestorage.googleapis.com/aquiles.png")
        assertEquals("https://firebasestorage.googleapis.com/aquiles.png", primerPersonaje.imageUrl)
    }
}
