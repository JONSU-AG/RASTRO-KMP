package com.jonsuapps.rastro.android.ui.components

import java.io.File
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class AcademicMapAndTouchTest {
    @Test fun divisionLessonRetainsValidQuestionsAndExplainsTheExactCase() = runBlocking {
        val root=File("../shared/src/commonMain/composeResources/files")
        val loader=JsonContentLoader(readBytesOverride={p->File(root,p.removePrefix("files/")).readBytes()})
        val lesson=loader.loadLesson("aritmetica",2,"2.2").lesson
        val validation=CatalogValidator.validateCatalog(listOf(lesson))
        assertEquals(validation.printSummary(),0,validation.errorCount)
        assertEquals(validation.printSummary(),0,validation.warningCount)
        lesson.challenges.forEach{assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Aritmética",it.statement))}
        val theory=File(root,"aprender/aritmetica/semana02/2.2/theory.md").readText()
        assertFalse(theory.contains("\\multicolumn"))
        assertTrue(theory.contains("división inexacta"))
        assertTrue(theory.contains("ambos residuos valen cero"))
        val table=extractAcademicTables(theory.lines()).second.first()
        assertEquals(3,table.headers.size)
        assertEquals(5,table.rows.size)
        assertTrue(table.rows.all{it.size==3})
    }

    @Test fun tapJitterDoesNotLockTheReader() {
        assertEquals(AcademicTouchAxis.UNDECIDED,academicTouchAxis(4f,-7f,8f))
        assertEquals(AcademicTouchAxis.UNDECIDED,academicTouchAxis(-8f,8f,8f))
    }

    @Test fun horizontalTableIntentWorksInBothDirections() {
        for(sign in listOf(-1f,1f))
            assertEquals(AcademicTouchAxis.HORIZONTAL,academicTouchAxis(40f*sign,9f,8f))
    }

    @Test fun VerticalAndDiagonalIntentBelongsToTheReader() {
        for(sign in listOf(-1f,1f)) {
            assertEquals(AcademicTouchAxis.VERTICAL,academicTouchAxis(9f,40f*sign,8f))
            assertEquals(AcademicTouchAxis.VERTICAL,academicTouchAxis(22f*sign,20f,8f))
        }
    }

    /** Export the real parsed maps so the browser check exercises production input. */
    @Test fun mapsRetainEveryParsedNodeAndTheirEdges() {
        val root=File("../shared/src/commonMain/composeResources/files/aprender")
        val maps=buildJsonArray {
            root.walkTopDown().filter{it.name=="theory.md"}.sortedBy{it.path}.forEach { file ->
                prepareAcademicTheory(file.readText()).diagrams.filter{it.nodes.isNotEmpty()}.forEachIndexed { index,diagram ->
                    val ids=diagram.nodes.map{it.id}.toSet()
                    assertEquals("Duplicate node in ${file.path}",ids.size,diagram.nodes.size)
                    assertTrue("Unknown edge in ${file.path}",diagram.edges.all{it.from in ids && it.to in ids})
                    add(buildJsonObject {
                        put("name",file.relativeTo(root).invariantSeparatorsPath+"#"+index)
                        put("nodes",JsonArray(diagram.nodes.map {buildJsonObject {
                            put("id",it.id);put("label",AcademicPresentationText.clean(it.label))
                        }}))
                        put("edges",JsonArray(diagram.edges.map {buildJsonObject {
                            put("from",it.from);put("to",it.to);put("label",it.label)
                        }}))
                    })
                }
            }
        }
        assertTrue("Expected real maps from the resource library",maps.size>200)
        File("../build/map-render-input.json").apply{parentFile?.mkdirs();writeText(maps.toString())}
    }

    @Test fun exportRealTablesForMobileRenderCheck() {
        val root=File("../shared/src/commonMain/composeResources/files/aprender")
        val tables=buildJsonArray {
            root.walkTopDown().filter{it.name=="theory.md"}.sortedBy{it.path}.forEach { file ->
                extractAcademicTables(prepareAcademicTheory(file.readText()).text.lines()).second.forEachIndexed { index,table ->
                    assertTrue(table.rows.all{it.size==table.headers.size})
                    add(buildJsonObject {
                        put("name",file.relativeTo(root).invariantSeparatorsPath+"#"+index)
                        put("headers",JsonArray(table.headers.map(::JsonPrimitive)))
                        put("rows",JsonArray(table.rows.map{JsonArray(it.map(::JsonPrimitive))}))
                    })
                }
            }
        }
        assertTrue("Expected tables from the real library",tables.size>200)
        File("../build/table-render-input.json").writeText(tables.toString())
    }
}
