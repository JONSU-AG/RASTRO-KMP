package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.android.ui.screens.*
import com.jonsuapps.rastro.data.content.JsonContentLoader
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

class HistoryVisualResourcesTest {
    private val root=File("src/main/assets/educational-visuals")
    private fun resources()=Json.decodeFromString<EducationalVisualCatalog>(File(root,"catalog.json").readText()).resources
    @Test fun historyArtworkFollowsTheTopicWithoutCrossingSubjects() {
        assertEquals(AcademicArtwork.POTTERY,academicArtworkFor("Historia del Perú","Cerámica Moche"))
        assertEquals(AcademicArtwork.TEXTILE,academicArtworkFor("historia_peru","Mantos y tejidos de Paracas"))
        assertEquals(AcademicArtwork.TEMPLE,academicArtworkFor("historia_peru","Arquitectura Chavín"))
        assertEquals(AcademicArtwork.QUIPU,academicArtworkFor("historia_peru","Quipus: registro"))
        assertEquals(AcademicArtwork.SCROLL,academicArtworkFor("Historia Universal","Arquitectura romana"))
        assertEquals(AcademicArtwork.SCROLL,academicArtworkFor("Historia Universal","Pirámides de Egipto"))
        assertFalse(academicCompanionMatches(AcademicArtwork.QUIPU,"Independencia del Perú"))
        assertFalse(academicCompanionMatches(AcademicArtwork.POTTERY,"Conquista española"))
        assertEquals(AcademicArtwork.CELL,academicArtworkFor("Biología","Cerámica Moche"))
    }
    @Test fun illustrationsAreLightweightLocalPathsWithoutExternalContent() {
        val factory=DocumentBuilderFactory.newInstance()
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl",true)
        listOf("pottery","weaving","andes-temple","quipu").forEach {name->
            val file=File("src/main/assets/academic-history/$name.svg")
            assertTrue(file.length() in 1..4000)
            val doc=factory.newDocumentBuilder().parse(file)
            assertEquals("svg",doc.documentElement.nodeName)
            assertTrue(doc.getElementsByTagName("path").length>0)
            assertEquals(0,doc.getElementsByTagName("image").length)
            assertEquals(0,doc.getElementsByTagName("script").length)
            assertFalse(file.readText().contains("href="))
            val native=File("src/main/res/drawable/academic_history_${name.replace('-','_')}.xml")
            assertEquals(doc.getElementsByTagName("path").length,factory.newDocumentBuilder().parse(native).getElementsByTagName("path").length)
        }
    }
    @Test fun museumImagesHaveIndividualPublicDomainEvidenceAndSmallPayloads() {
        val history=resources().filter {it.subjectId=="historia_peru"}
        assertEquals(2,history.size)
        assertTrue(history.sumOf {it.bytes}<30000)
        history.forEach {resource->
            assertEquals("CC0-1.0",resource.license)
            val evidence=Json.parseToJsonElement(File(root,"licenses/${resource.id}-source.json").readText()).jsonObject
            assertTrue(evidence.getValue("isPublicDomain").jsonPrimitive.boolean)
            assertEquals(resource.source,evidence.getValue("objectURL").jsonPrimitive.content)
            assertTrue(File(root,resource.poster).isFile)
        }
    }
    @Test fun missingAnchorDoesNotSendTheResourceToAnotherTopic() {
        val resource=resources().single {it.id=="moche-geometric-bottle"}
        assertEquals(-2,educationalVisualAnchor(resource,listOf("Independencia","Tawantinsuyu")))
        assertEquals(1,educationalVisualAnchor(resource,listOf("Introducción","A. Cultura Moche o Mochica")))
        assertEquals(-1,educationalVisualAnchor(resource.copy(sectionKeywords=emptyList()),emptyList()))
    }
    @Test fun realMaterialAndLevelTheoryAnchorEachPieceAfterItsCultureExactlyOnce()=runBlocking {
        val files=File("../shared/src/commonMain/composeResources/files")
        val lesson=JsonContentLoader(readBytesOverride={File(files,it.removePrefix("files/")).readBytes()})
            .loadLesson("historia_peru",2,"2.1").lesson
        val parsed=parseAcademicContent(lesson.theory)
        val history=resources().filter {it.subjectId=="historia_peru"}
        val units=materialUnits(listOf(lesson),MaterialSelection(kind=MaterialKind.THEORY),resources())
        history.forEach {resource->
            val anchor=educationalVisualAnchor(resource,parsed.sections.map {it.title})
            assertTrue(resource.id,anchor>=0)
            val index=units.indexOfFirst {it.visual?.id==resource.id}
            assertTrue(index>0)
            assertEquals(parsed.sections[anchor].title,units[index-1].section?.title)
            assertEquals(1,units.count {it.visual?.id==resource.id})
        }
        assertTrue(materialUnits(listOf(lesson),MaterialSelection(kind=MaterialKind.QUESTIONS),resources()).none {it.visual!=null})
    }
    @Test fun changingPlacementDoesNotInvalidateTheReviewOfTheSameImage() {
        val visual=resources().first()
        assertEquals(materialVisualHash(visual),materialVisualHash(visual.copy(sectionKeywords=listOf("Nueva ubicación"))))
        assertNotEquals(materialVisualHash(visual),materialVisualHash(visual.copy(sha256="0".repeat(64))))
    }
}
