package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.android.ui.screens.*
import java.io.File
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import org.junit.Assert.*
import org.junit.Test

class StudyVisualIntegrationTest {
    private val assets = File("src/main/assets/educational-visuals")
    private fun catalog() = Json.decodeFromString<EducationalVisualCatalog>(assets.resolve("catalog.json").readText()).resources

    @Test fun bothModelsBelongToRealPlayableLessonsAndTheSameMaterialTheory() = runBlocking {
        val resources = catalog()
        val expected = mapOf("cellforge-plant" to "bio_t05_s04", "human-heart" to "bio_t08_s03")
        expected.forEach { (id, lessonId) ->
            val resource = resources.single { it.id == id }
            val lesson = AprenderRepository.getLessonById(lessonId) ?: error("Missing playable lesson $lessonId")
            assertEquals("biologia", lesson.subjectId)
            assertTrue(lesson.theory.resumen.isNotBlank())
            assertEquals(listOf(resource), educationalVisualsForLesson(resources, lesson.subjectId, lesson.id))
            val parsed = parseAcademicContent(lesson.theory)
            assertEquals(-1, educationalVisualAnchor(resource, parsed.sections.map { it.title }))
            val units = materialUnits(listOf(lesson), MaterialSelection(kind=MaterialKind.THEORY), resources)
            assertEquals(1, units.count { it.visual?.id == id })
            assertEquals(resource, units.first().visual)
            assertTrue(materialUnits(listOf(lesson), MaterialSelection(kind=MaterialKind.QUESTIONS), resources).none { it.visual != null })
            assertTrue(educationalVisualsForLesson(resources, "quimica", lesson.id).isEmpty())
        }
    }

    @Test fun userFacingCatalogAndPartNamesKeepSpanishAccentsWithoutBrokenEncoding() {
        val resources = catalog()
        assertEquals("Corazón humano", resources.single { it.id == "human-heart" }.title)
        assertEquals("Célula procariota", resources.single { it.id == "prokaryote" }.title)
        assertEquals("Perú: contorno general", resources.single { it.id == "peru-outline" }.title)
        for (name in listOf("catalog.json", "cellforge-plant-parts.json")) {
            val text = assets.resolve(name).readText()
            assertFalse(name, Regex("[ÃÂ�]").containsMatchIn(text))
        }
        assertTrue(resources.all(::validEducationalVisual))
    }

    @Test fun allEightPlantPartsRemainAvailableAndCompleteModelCanRestoreThem() {
        val bytes = assets.resolve("cellforge-plant.glb").readBytes()
        val mesh = attachPlantCellParts(decodePlantCellMesh(bytes),
            assets.resolve("cellforge-plant-parts.json").readText(),
            assets.resolve("cellforge-plant-parts.bin").readBytes(), bytes)
        assertEquals(8, mesh.parts.size)
        assertTrue(mesh.parts.all { it.name.isNotBlank() && it.description.isNotBlank() && it.vertexCount > 0 })
        assertEquals(mesh.parts, visibleStudyParts(mesh.parts, null, false))
        assertEquals(mesh.parts, visibleStudyParts(mesh.parts, null, true))
        assertEquals(setOf("nucleus", "nucleolus"), visibleStudyParts(mesh.parts, "nucleus", true).map { it.id }.toSet())
    }
}
