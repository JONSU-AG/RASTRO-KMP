package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.EducationalVisualCatalog
import kotlinx.serialization.json.*
import java.io.File
import java.nio.ByteOrder
import java.security.MessageDigest
import org.junit.Assert.*
import org.junit.Test

class CardiovascularPilotTest {
    private val root=File("src/main/assets/educational-visuals")
    @Test fun pilotIsRestrictedToBiology83AndOtherResourcesKeepTheirImplementation() {
        val catalog=Json.decodeFromString<EducationalVisualCatalog>(File(root,"catalog.json").readText())
        assertEquals(listOf("human-heart"),catalog.resources.filter(::isCardiovascularPilot).map {it.id})
        val heart=catalog.resources.single(::isCardiovascularPilot)
        assertFalse(isCardiovascularPilot(heart.copy(subjectId="quimica")))
        assertFalse(isCardiovascularPilot(heart.copy(lessonIds=listOf("bio_t08_s01"))))
    }
    @Test fun nativePosterIsAnIntactLicensedDerivativeOfTheOriginalSvg() {
        val folder=File(root,"pilots/cardiovascular83")
        val info=Json.parseToJsonElement(File(folder,"source.json").readText()).jsonObject
        fun hash(file:File)=MessageDigest.getInstance("SHA-256").digest(file.readBytes()).joinToString(""){"%02x".format(it)}
        val image=File(folder,"heart-poster.png")
        assertEquals("89504e470d0a1a0a",image.readBytes().take(8).joinToString(""){"%02x".format(it)})
        assertEquals(info.getValue("posterSha256").jsonPrimitive.content,hash(image))
        assertEquals(info.getValue("sourceSha256").jsonPrimitive.content,hash(File(root,"human-heart.svg")))
        assertEquals("CC0-1.0",info.getValue("license").jsonPrimitive.content)
    }
    @Test fun actualHeartDecodesAll83ComponentsAndAll102802TrianglesWithoutInventedGeometry() {
        val mesh=decodeCardiovascularMesh(File(root,"heart-bodyparts.glb").readBytes())
        assertEquals(83,mesh.componentCount)
        assertEquals(102802*3,mesh.vertexCount)
        assertEquals(mesh.vertexCount*24,mesh.vertices.capacity())
        val floats=mesh.vertices.asFloatBuffer()
        val values=FloatArray(6)
        repeat(mesh.vertexCount) {floats.get(values);assertTrue(values.all {it.isFinite()});assertTrue(values.take(3).all {kotlin.math.abs(it)<=2f})}
        val out=File("../build/cardio83-pilot").apply {mkdirs()}
        val bytes=ByteArray(mesh.vertices.capacity());mesh.vertices.position(0);mesh.vertices.get(bytes)
        File(out,"vertices.bin").writeBytes(bytes)
        File(out,"vertex.glsl").writeText(CARDIO_VERTEX_SHADER)
        File(out,"fragment.glsl").writeText(CARDIO_FRAGMENT_SHADER)
        File(out,"mesh.json").writeText("{\"vertices\":${mesh.vertexCount},\"components\":83,\"littleEndian\":${ByteOrder.nativeOrder()==ByteOrder.LITTLE_ENDIAN}}")
    }
    @Test fun corruptOrEmptyModelsFailLocallyInsteadOfOpeningABlankViewer() {
        assertTrue(runCatching {decodeCardiovascularMesh(byteArrayOf())}.isFailure)
        val bytes=File(root,"heart-bodyparts.glb").readBytes();bytes[0]=0
        assertTrue(runCatching {decodeCardiovascularMesh(bytes)}.isFailure)
    }
    @Test fun nativeCameraCanRotateZoomAndResetWithinSafeBounds() {
        val camera=CardiovascularCamera()
        assertNotEquals(camera.yaw,camera.rotate(100f,20f).yaw)
        assertEquals(80f,camera.rotate(0f,10000f).pitch,0f)
        assertEquals(2.6f,camera.zoom(100f).distance,0f)
        assertEquals(7f,camera.zoom(.01f).distance,0f)
        assertEquals(camera,camera.zoom(Float.NaN))
    }
}
