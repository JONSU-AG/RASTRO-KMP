package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class PhonologyRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana03/3.1")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun stableIdentityAndLocalValidation()=runBlocking {
        val l=loader().loadLesson("lenguaje",3,"3.1").lesson
        assertEquals("leng_t03_s01",l.id)
        assertEquals(listOf(3,0,2,0,0,1,1,2,3,3),l.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(l))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        l.challenges.forEachIndexed{i,q ->
            assertEquals("leng_t03_s01_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
            for(p in listOf("Criterio:","Aplicación:","Respuesta:")) assertTrue(q.id,q.explanation.contains(p))
        }
    }
    @Test fun questionsSeparateInventoryDigraphAndSyllable()=runBlocking {
        val q=loader().loadLesson("lenguaje",3,"3.1").lesson.challenges
        assertTrue(q[1].options[q[1].correctIndex].startsWith("Cinco:"))
        assertTrue(q[1].explanation.contains("no fija un total universal"))
        assertTrue(q[4].statement.contains("dígrafo qu"))
        assertTrue(q[5].options[q[5].correctIndex].contains("/a/"))
        assertTrue(q[6].explanation.contains("No se concluye"))
        assertTrue(q[9].explanation.contains("No significa"))
    }
    @Test fun syllableMapAndTablesAreStructurallyValid() {
        val t=File(root,"theory.md").readText()
        assertTrue(t.length>=8000)
        val maps=prepareAcademicTheory(t).diagrams
        assertEquals(1,maps.size)
        val map=maps.single();val ids=map.nodes.map{it.id}.toSet()
        assertEquals(12,ids.size);assertEquals(12,map.nodes.size);assertEquals(11,map.edges.size)
        assertTrue(map.edges.all{it.from in ids && it.to in ids})
        val reached=mutableSetOf("ROOT")
        repeat(ids.size){map.edges.filter{it.from in reached}.forEach{reached.add(it.to)}}
        assertEquals(ids,reached)
        val tables=extractAcademicTables(t.lines()).second
        assertEquals(3,tables.size)
        assertTrue(tables.all{table->table.rows.all{it.size==table.headers.size}})
        assertTrue(t.contains("## Propiedades del lenguaje y silabeo"))
        assertTrue(t.contains("pa no se describe como si contuviera solo una vocal"))
        assertFalse(t.contains("el número oficial es 24"))
        assertFalse(File(root,"lesson.json").readText().contains("h siempre muda"))
    }
    @Test fun threeResourcesMatchFixtures() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana03/3.1")
        for(n in listOf("questions.json","theory.md","lesson.json")) assertArrayEquals(n,File(root,n).readBytes(),File(f,n).readBytes())
    }
}
