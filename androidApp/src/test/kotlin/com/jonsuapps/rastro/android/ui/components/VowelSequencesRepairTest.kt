package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class VowelSequencesRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana03/3.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun stableIdentityAndLocalValidation()=runBlocking {
        val l=loader().loadLesson("lenguaje",3,"3.2").lesson
        assertEquals("leng_t03_s02",l.id)
        assertEquals(listOf(0,0,2,2,0,3,1,1,1,2),l.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(l))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(1,report.warningCount)
        assertTrue(report.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
        l.challenges.forEachIndexed{i,q ->
            assertEquals("leng_t03_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
            for(p in listOf("Criterio:","Aplicación:","Respuesta:")) assertTrue(q.id,q.explanation.contains(p))
        }
    }
    @Test fun questionsKeepOrthographyAndCountingScopeExplicit()=runBlocking {
        val q=loader().loadLesson("lenguaje",3,"3.2").lesson.challenges
        assertTrue(q[1].options[q[1].correctIndex].contains("h no causa"))
        assertTrue(q[3].options[q[3].correctIndex]=="País")
        assertTrue(q[6].explanation.contains("como en cuídate"))
        assertTrue(q[8].statement.contains("sin unir vocales entre palabras"))
        assertTrue(q[9].explanation.contains("no obliga por sí sola"))
    }
    @Test fun diagramAndTablesPreserveTheirRelationships() {
        val t=File(root,"theory.md").readText()
        assertTrue(t.length>=8000)
        val maps=prepareAcademicTheory(t).diagrams
        assertEquals(1,maps.size)
        val map=maps.single();val ids=map.nodes.map{it.id}.toSet()
        assertEquals(11,ids.size);assertEquals(11,map.nodes.size);assertEquals(10,map.edges.size)
        assertTrue(map.edges.all{it.from in ids && it.to in ids})
        val reached=mutableSetOf("ROOT")
        repeat(ids.size){map.edges.filter{it.from in reached}.forEach{reached.add(it.to)}}
        assertEquals(ids,reached)
        val tables=extractAcademicTables(t.lines()).second
        assertEquals(3,tables.size)
        assertTrue(tables.all{table->table.rows.all{it.size==table.headers.size}})
        assertFalse(t.contains("8 tildes omitidas"))
        assertFalse(t.contains("24 fonemas"))
        assertTrue(t.contains("**cuídate**"))
        assertFalse(File(root,"lesson.json").readText().contains("homogéneo que no se tilda"))
    }
    @Test fun productionAndFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana03/3.2")
        for(n in listOf("questions.json","theory.md","lesson.json")) assertArrayEquals(n,File(root,n).readBytes(),File(f,n).readBytes())
    }
}
