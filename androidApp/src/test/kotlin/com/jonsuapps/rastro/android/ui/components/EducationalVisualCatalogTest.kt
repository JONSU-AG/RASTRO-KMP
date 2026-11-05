package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.*
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.security.MessageDigest

class EducationalVisualCatalogTest {
    @Test fun localDocumentHasAnInterceptableHttpsUrlInsteadOfBlockedDataUrl() {
        catalog().resources.forEach { r ->
            listOf(false,true).forEach { threeD ->
                val url=educationalDocumentUrl(r,threeD)
                assertTrue(url.startsWith("https://appassets.androidplatform.net/assets/educational-visuals/"))
                assertEquals("${r.id}-${if(threeD) "3d" else "2d"}.html",educationalAssetPath(url))
            }
        }
        assertNull(educationalAssetPath("data:text/html;base64,abc"))
        assertNull(educationalAssetPath("https://evil.test/assets/educational-visuals/a.svg"))
        assertNull(educationalAssetPath("https://appassets.androidplatform.net/assets/educational-visuals/../secret"))
        assertNull(educationalAssetPath("https://appassets.androidplatform.net/assets/educational-visuals/%2e%2e/secret"))
        assertEquals("runtime/model-viewer.min.js",educationalAssetPath("https://appassets.androidplatform.net/assets/educational-visuals/runtime/model-viewer.min.js"))
    }
    @Test fun sameScientificAssociationIsAvailableInLessonTheoryAndMaterialWithoutCrossCourseFallback() {
        val resources=catalog().resources
        assertEquals(listOf("human-heart"),educationalVisualsForLesson(resources,"biologia","bio_t08_s03").map {it.id})
        assertTrue(educationalVisualsForLesson(resources,"biologia","bio_t08_s01").isEmpty())
        assertTrue(educationalVisualsForLesson(resources,"quimica","bio_t08_s03").isEmpty())
    }
    private val root=File("src/main/assets/educational-visuals")
    private fun catalog()=Json.decodeFromString<EducationalVisualCatalog>(File(root,"catalog.json").readText())
    private fun hash(bytes: ByteArray)=MessageDigest.getInstance("SHA-256").digest(bytes).joinToString(""){"%02x".format(it)}

    @Test fun everyAssetHasIndividualProvenanceAndMatchesItsRecordedBytes() {
        val c=catalog();assertEquals(1,c.schemaVersion);assertEquals(7,c.resources.size)
        c.resources.forEach { r ->
            assertTrue(r.id,validEducationalVisual(r))
            val bytes=File(root,r.poster).readBytes()
            assertEquals(r.bytes,bytes.size.toLong());assertEquals(r.sha256,hash(bytes))
            assertTrue(r.source.startsWith("https://raw.githubusercontent.com/") || r.source.startsWith("https://www.metmuseum.org/art/collection/search/"))
            assertFalse(r.license.contains("NC"))
            assertTrue(r.lessonIds.all {it.startsWith(when(r.subjectId){"biologia"->"bio_";"historia_peru"->"hper_";else->"geo_"})})
            r.model?.let { m -> val b=File(root,m).readBytes();assertEquals(r.modelBytes,b.size.toLong());assertEquals(r.modelSha256,hash(b)) }
        }
        assertTrue(File(root,"licenses/bioicons-CC0.txt").isFile)
        assertTrue(File(root,"licenses/bodyparts-source-headers.txt").readText().contains("Share Alike 2.1 Japan"))
    }
    @Test fun localPathsAndLicensesRejectUnreviewedOrRemoteFiles() {
        val r=catalog().resources.first()
        assertFalse(validEducationalVisual(r.copy(poster="../private.svg")))
        assertFalse(validEducationalVisual(r.copy(poster="https://example.com/a.svg")))
        assertFalse(validEducationalVisual(r.copy(license="CC-BY-NC-4.0")))
        assertFalse(validEducationalVisual(r.copy(model="x.glb",modelBytes=20_000_000)))
        assertFalse(safeEducationalAsset("/absolute.svg"))
    }
    @Test fun glbHasAllOfficialHeartComponentsAndEmbeddedGeometryOnly() {
        val heart=catalog().resources.single {it.id=="human-heart"}
        val bytes=File(root,heart.model!!).readBytes()
        val b=ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
        assertEquals(0x46546c67,b.int);assertEquals(2,b.int);assertEquals(bytes.size,b.int)
        val jsonLength=b.int;assertEquals(0x4e4f534a,b.int)
        val jsonBytes=ByteArray(jsonLength);b.get(jsonBytes)
        val gltf=Json.parseToJsonElement(String(jsonBytes)).jsonObject
        assertEquals(83,gltf.getValue("meshes").jsonArray.size)
        assertTrue(gltf.getValue("buffers").jsonArray.all {"uri" !in it.jsonObject})
        assertTrue("images" !in gltf)
        val nodes=gltf.getValue("nodes").jsonArray.map {it.jsonObject.getValue("name").jsonPrimitive.content}
        val source=Json.parseToJsonElement(File(root,"licenses/bodyparts-heart-components.json").readText()).jsonObject
        assertEquals(source.getValue("components").jsonArray.map {it.jsonPrimitive.content}.toSet(),nodes.toSet())
        assertEquals("CC-BY-SA-2.1-JP",heart.modelLicense)
    }
    @Test fun documentsDefaultToSvgAndExportTheActualViewerForBrowserVerification() {
        val out=File("../build/educational-visuals-preview").apply {mkdirs()}
        catalog().resources.forEach { r ->
            val flat=educationalVisualDocument(r,false)
            assertFalse(flat.contains("<model-viewer"))
            assertFalse(flat.contains("runtime/model-viewer"))
            assertTrue(flat.contains(r.poster))
            File(out,"${r.id}-2d.html").writeText(flat)
            r.model?.let {
                val doc=educationalVisualDocument(r,true)
                assertTrue(doc.contains("camera-controls"));assertTrue(doc.contains("runtime/model-viewer.min.js"))
                assertFalse(doc.contains("https://cdn"))
                File(out,"${r.id}-3d.html").writeText(doc)
            }
        }
    }
}
