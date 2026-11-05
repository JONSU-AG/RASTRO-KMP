package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.android.ui.screens.*
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.model.LessonTheory
import java.io.File
import java.security.MessageDigest
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class ReaderPresentationRegressionTest {
    private val root=File("../shared/src/commonMain/composeResources/files")
    @Test fun headingsStayWithTheirEquationsAndNeverBecomeEmptyCards() {
        val text="## MAS\n- **Ecuaciones:**\nx(t) = A \\sin(\\omega t)\n- **Energía:**\nE = k A^2 / 2"
        val parsed=parseAcademicContent(LessonTheory("test","Física",1,"MAS",text))
        val section=parsed.sections.first()
        assertTrue(section.branchCards.none {it.subtitle.isBlank() && it.bullets.isEmpty()})
        assertTrue(section.flowText.contains("x(t) = A"))
        assertTrue(section.flowText.indexOf("Ecuaciones")<section.flowText.indexOf("x(t)"))
        assertTrue(section.flowText.indexOf("Energía")<section.flowText.indexOf("E ="))
        assertSame(parsed,parseAcademicContent(LessonTheory("test","Física",1,"MAS",text)))
        assertNotEquals(parsed,parseAcademicContent(LessonTheory("test","Física",1,"MAS",text+"\nTexto corregido.")))
    }
    @Test fun everyRealMapHasFiniteSeparateBoxesAndForwardTreeBranches() {
        val exported=buildJsonArray {
            root.resolve("aprender").walkTopDown().filter {it.name=="theory.md"}.forEach {file ->
                prepareAcademicTheory(file.readText()).diagrams.filter {it.nodes.isNotEmpty()}.forEachIndexed {index,diagram ->
                    diagram.nodes.forEach {node -> academicMapMathAsset(node.label)?.let {asset ->
                        val png=File("src/main/assets",asset)
                        assertTrue("Missing local notation for ${node.label}",png.isFile)
                        assertTrue(png.length()>100)
                    } }
                    val heights=diagram.nodes.associate {it.id to (80f+it.label.length/25*30f)}
                    val layout=layoutAcademicMap(diagram,heights)
                    assertEquals(file.path,diagram.nodes.map {it.id}.toSet(),layout.boxes.keys)
                    assertTrue(layout.width.isFinite() && layout.height.isFinite())
                    val boxes=layout.boxes.values.toList()
                    boxes.forEachIndexed {i,a -> boxes.drop(i+1).forEach {b ->
                        assertFalse("Overlap ${file.path}: $a $b",a.left<b.right && b.left<a.right && a.top<b.bottom && b.top<a.bottom)
                    } }
                    layout.treeEdges.forEach {(from,to)-> assertTrue(layout.boxes.getValue(from).right<layout.boxes.getValue(to).left)}
                    add(buildJsonObject {
                        put("name",file.relativeTo(root).invariantSeparatorsPath+"#"+index)
                        put("width",layout.width);put("height",layout.height)
                        put("nodes",JsonArray(diagram.nodes.map {node->buildJsonObject {
                            val box=layout.boxes.getValue(node.id)
                            put("id",node.id);put("label",node.label);put("x",box.left);put("y",box.top);put("width",box.width);put("height",box.height)
                        }}))
                        put("edges",JsonArray(diagram.edges.map {edge->buildJsonObject {put("from",edge.from);put("to",edge.to)}}))
                    })
                }
            }
        }
        assertTrue(exported.size>200)
        File("../build/native-map-layout-proof.json").writeText(exported.toString())
        val cyclic=AcademicSourceDiagram(listOf(AcademicMapNode("a","A"),AcademicMapNode("b","B"),AcademicMapNode("c","C")),
            listOf(AcademicMapEdge("a","b"),AcademicMapEdge("b","a")),"")
        assertEquals(3,layoutAcademicMap(cyclic,emptyMap()).boxes.size)
    }
    @Test fun cachedCourseFilteringMatchesOriginalSelectionsAndDrawingOnlyBelongsToQuestions()=runBlocking {
        val loader=JsonContentLoader(readBytesOverride={File(root,it.removePrefix("files/")).readBytes()})
        val lessons=root.resolve("aprender/fisica").walkTopDown().filter {it.name=="theory.md"}.toList().map {file ->
            val code=file.parentFile.name
            loader.loadLesson("fisica",code.substringBefore('.').toInt(),code).lesson
        }.toList()
        val coldStart=System.nanoTime()
        val course=materialUnits(lessons,MaterialSelection())
        val coldMs=(System.nanoTime()-coldStart)/1_000_000.0
        val warmStart=System.nanoTime()
        for(kind in MaterialKind.entries)for(navigation in MaterialNavigation.entries)for(week in listOf(null,1,11)) {
            val selection=MaterialSelection(kind,navigation,week)
            val filtered=filterMaterialUnits(course,selection)
            assertEquals(materialUnits(lessons,selection),filtered)
            filtered.forEach {assertEquals(it.challenge!=null,materialCanDraw(it))}
        }
        val checksMs=(System.nanoTime()-warmStart)/1_000_000.0
        assertFalse(materialCanDraw(null))
        val sample="Física: café, α, ondas, \n内容"
        val old=MessageDigest.getInstance("SHA-256").digest(sample.toByteArray()).joinToString(""){"%02x".format(it)}
        assertEquals(old,materialHash(sample))
        val repetitions=System.nanoTime()
        repeat(1000) {filterMaterialUnits(course,MaterialSelection(MaterialKind.THEORY,week=11))}
        File("../build/reader-preparation-timing.json").writeText(buildJsonObject {
            put("environment","JVM unit test, not an Android device")
            put("units",course.size);put("courseLessons",lessons.size);put("coursePreparationMs",coldMs);put("selectionEquivalenceChecksMs",checksMs)
            put("thousandReferenceFiltersMs",(System.nanoTime()-repetitions)/1_000_000.0)
        }.toString())
    }
}
