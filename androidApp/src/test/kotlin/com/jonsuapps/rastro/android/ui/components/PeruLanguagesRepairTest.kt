package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class PeruLanguagesRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana02/2.2")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val l=loader().loadLesson("lenguaje",2,"2.2").lesson
        assertEquals("leng_t02_s02",l.id)
        assertEquals(listOf(3,3,0,1,3,1,1,3,0,0,2,1),l.challenges.map{it.correctIndex})
        val report=CatalogValidator.validateCatalog(listOf(l))
        assertEquals(report.printSummary(),0,report.errorCount)
        assertEquals(report.printSummary(),0,report.warningCount)
        l.challenges.forEachIndexed{i,q ->
            assertEquals("leng_t02_s02_c%02d".format(i+1),q.id)
            assertEquals(4,q.options.distinct().size)
            assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
            for(p in listOf("Criterio:","Aplicación:","Respuesta:")) assertTrue(q.id,q.explanation.contains(p))
        }
    }
    @Test fun questionsDoNotConfuseStatisticsPronunciationAndIdentity()=runBlocking {
        val q=loader().loadLesson("lenguaje",2,"2.2").lesson.challenges
        assertTrue(q[2].statement.contains("Según ese inventario"))
        assertTrue(q[3].options[q[3].correctIndex]=="Arawak")
        assertTrue(q[5].options[q[5].correctIndex].contains("no determina"))
        assertTrue(q[8].explanation.contains("no demuestra por sí solo"))
        assertTrue(q[11].statement.contains("revitalización"))
        assertTrue(q[11].explanation.contains("no todos los estudiantes"))
    }
    @Test fun familyTreeHasSixteenConnectedNodesAndUsableTables() {
        val t=File(root,"theory.md").readText()
        assertTrue(t.length>=8000)
        val maps=prepareAcademicTheory(t).diagrams
        assertEquals(1,maps.size)
        val map=maps.single()
        val ids=map.nodes.map{it.id}.toSet()
        assertEquals(16,ids.size)
        assertEquals(16,map.nodes.size)
        assertEquals(15,map.edges.size)
        assertTrue(map.edges.all{it.from in ids && it.to in ids})
        val reached=mutableSetOf("ROOT")
        repeat(ids.size){map.edges.filter{it.from in reached}.forEach{reached.add(it.to)}}
        assertEquals(ids,reached)
        val tables=extractAcademicTables(t.lines()).second
        assertEquals(3,tables.size)
        assertTrue(tables.all{table->table.rows.all{it.size==table.headers.size}})
        assertTrue(t.contains("pueden coexistir"))
        assertFalse(t.contains("ASH-SHI-AWA"))
        assertFalse(t.contains("Rama arcaica"))
        assertFalse(File(root,"lesson.json").readText().contains("ASH-SHI-AWA"))
    }
    @Test fun productionAndThreePackagedFixturesAgree() {
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana02/2.2")
        for(n in listOf("questions.json","theory.md","lesson.json")) assertArrayEquals(n,File(root,n).readBytes(),File(f,n).readBytes())
    }
}
