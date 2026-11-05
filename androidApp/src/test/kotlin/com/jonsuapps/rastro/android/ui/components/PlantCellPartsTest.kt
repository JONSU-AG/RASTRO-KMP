package com.jonsuapps.rastro.android.ui.components

import java.io.File
import org.junit.Assert.*
import org.junit.Test
import kotlinx.serialization.json.*

class PlantCellPartsTest {
    private val root=File("src/main/assets/educational-visuals")
    private fun mesh():CardiovascularMesh {
        val bytes=File(root,"cellforge-plant.glb").readBytes()
        return attachPlantCellParts(decodePlantCellMesh(bytes),File(root,"cellforge-plant-parts.json").readText(),File(root,"cellforge-plant-parts.bin").readBytes(),bytes)
    }
    @Test fun partsPartitionAllOriginalTrianglesAndPreserveNamedFunctions() {
        val original=decodePlantCellMesh(File(root,"cellforge-plant.glb").readBytes());val model=mesh()
        assertEquals(original.vertexCount,model.vertexCount);assertEquals(8,model.parts.size)
        assertEquals(model.vertexCount,model.parts.sumOf {it.vertexCount})
        assertEquals(listOf("Nucléolo","Núcleo","Vacuola central","Cloroplastos","Mitocondrias","Aparato de Golgi","Pared celular","Resto de la célula"),model.parts.map {it.name})
        assertTrue(model.parts.all {it.description.isNotBlank() && it.vertexCount>0})
        assertEquals(0,model.parts.first().firstVertex)
        model.parts.zipWithNext().forEach {(a,b)->assertEquals(a.firstVertex+a.vertexCount,b.firstVertex)}
        // Byte-level multiset of triangles: grouping never creates or drops geometry/UVs.
        fun triangles(m:CardiovascularMesh):List<String> {
            val copy=m.vertices.duplicate();val face=ByteArray(96);val digest=java.security.MessageDigest.getInstance("SHA-256")
            return (0 until m.vertexCount/3).map {copy.get(face);java.util.Base64.getEncoder().encodeToString(digest.digest(face))}.sorted()
        }
        assertEquals(triangles(original),triangles(model))
        val out=File("../build/plant-cell-pilot").apply {mkdirs()};val bytes=ByteArray(model.vertices.capacity());model.vertices.position(0);model.vertices.get(bytes)
        File(out,"parts-vertices.bin").writeBytes(bytes)
        File(out,"parts-preview.json").writeText(buildJsonArray {model.parts.forEach {p->add(buildJsonObject{
            put("id",p.id);put("name",p.name);put("firstVertex",p.firstVertex);put("vertexCount",p.vertexCount)
            put("offset",JsonArray(p.offset.map {JsonPrimitive(it)}));put("min",JsonArray(p.min.map {JsonPrimitive(it)}));put("max",JsonArray(p.max.map {JsonPrimitive(it)}))
            p.parentId?.let {put("parentId",it)}
        })}}.toString())
    }
    @Test fun isolationOfNucleusIncludesItsNucleolusAndAssignmentsCannotSilentlyDrift() {
        val model=mesh()
        assertEquals(setOf("nucleus","nucleolus"),visibleStudyParts(model.parts,"nucleus",true).map {it.id}.toSet())
        assertEquals(1,visibleStudyParts(model.parts,"vacuole",true).size)
        assertEquals(8,visibleStudyParts(model.parts,null,true).size)
        val bytes=File(root,"cellforge-plant.glb").readBytes();val groups=File(root,"cellforge-plant-parts.bin").readBytes();groups[0]=127
        assertTrue(runCatching {attachPlantCellParts(decodePlantCellMesh(bytes),File(root,"cellforge-plant-parts.json").readText(),groups,bytes)}.isFailure)
    }
    @Test fun tappingActualSurfaceRaysReturnsNucleusAndVacuoleAndIgnoresEmptySpace() {
        val model=mesh()
        // Default front camera looks along the source X axis. Points come from visible source regions.
        fun ray(px:Float,py:Float):String? {
            val direction=floatArrayOf(-1f,(300-py)/724.264f,(200-px)/724.264f)
            return pickPlantPart(model,floatArrayOf(4f,0f,0f),direction,null,false,0f)
        }
        assertEquals("nucleolus",ray(265f,254f))
        assertEquals("vacuole",ray(160f,310f))
        assertEquals("mitochondria",ray(82f,318f))
        assertNull(ray(5f,5f))
    }
}
