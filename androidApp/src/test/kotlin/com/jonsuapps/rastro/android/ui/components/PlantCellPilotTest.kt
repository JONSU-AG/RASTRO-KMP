package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.*
import kotlinx.serialization.json.*
import java.io.File
import org.junit.Assert.*
import org.junit.Test

class PlantCellPilotTest {
    private val root=File("src/main/assets/educational-visuals")
    private fun catalog()=Json.decodeFromString<EducationalVisualCatalog>(File(root,"catalog.json").readText())
    @Test fun modelBelongsOnlyToThePlantComparisonLessonAndKeepsCardiovascularPilotSeparate() {
        val cell=catalog().resources.single(::isPlantCellPilot)
        assertEquals(listOf("bio_t05_s04"),cell.lessonIds)
        assertEquals(listOf(cell),educationalVisualsForLesson(catalog().resources,"biologia","bio_t05_s04"))
        assertFalse(educationalVisualsForLesson(catalog().resources,"biologia","bio_t08_s03").contains(cell))
        assertFalse(isPlantCellPilot(cell.copy(lessonIds=listOf("bio_t05_s01"))))
        assertEquals("MIT",cell.modelLicense)
    }
    @Test fun optimizedModelPreservesColorTextureAndUvsAndIsSmallEnoughForOnDemandAndroidUse() {
        val mesh=decodePlantCellMesh(File(root,"cellforge-plant.glb").readBytes())
        assertEquals(58868*3,mesh.vertexCount);assertEquals(32,mesh.vertexStride)
        assertNotNull(mesh.colorTexture);assertTrue(mesh.colorTexture!!.size>1000)
        assertEquals(0xFF,mesh.colorTexture[0].toInt() and 255);assertEquals(0xD8,mesh.colorTexture[1].toInt() and 255)
        val values=mesh.vertices.asFloatBuffer();val row=FloatArray(8)
        repeat(mesh.vertexCount){values.get(row);assertTrue(row.all {it.isFinite()});assertTrue(row.take(3).all {kotlin.math.abs(it)<=1.01f})}
        val out=File("../build/plant-cell-pilot").apply {mkdirs()}
        val bytes=ByteArray(mesh.vertices.capacity());mesh.vertices.position(0);mesh.vertices.get(bytes)
        File(out,"vertices.bin").writeBytes(bytes);File(out,"texture.jpg").writeBytes(mesh.colorTexture)
        File(out,"vertex.glsl").writeText(PLANT_VERTEX_SHADER);File(out,"fragment.glsl").writeText(PLANT_FRAGMENT_SHADER)
        File(out,"mesh.json").writeText("{\"vertices\":${mesh.vertexCount},\"stride\":32}")
        assertTrue(File(root,"cellforge-plant.glb").length()<2_000_000)
    }
    @Test fun corruptedCellModelFailsLocallyAndSourceLicenseTravelsWithIt() {
        val bytes=File(root,"cellforge-plant.glb").readBytes();bytes[0]=0
        assertTrue(runCatching {decodePlantCellMesh(bytes)}.isFailure)
        assertTrue(File(root,"licenses/cellforge-MIT.txt").readText().contains("Copyright (c) 2026 huangserva"))
        assertTrue(File(root,"licenses/cellforge-plant-source.json").readText().contains("a7d1dbc0825a5b0c71dd789a6c314f092321774a480ddd356315fa72e4759000"))
    }
}
