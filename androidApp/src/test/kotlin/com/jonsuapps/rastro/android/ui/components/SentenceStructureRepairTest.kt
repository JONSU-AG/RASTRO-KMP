package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import java.io.File
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class SentenceStructureRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana06")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    private fun theory(code:String)=File(root,"$code/theory.md").readText()

    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val expected=mapOf("6.1" to listOf(1,0,2,3,1,3,3,0,0,2),"6.2" to listOf(1,2,2,3,3,0,1,2,0,1))
        for((code,keys)in expected){
            val l=loader().loadLesson("lenguaje",6,code).lesson
            assertEquals("leng_t06_s%02d".format(code.substringAfter('.').toInt()),l.id)
            assertEquals(keys,l.challenges.map{it.correctIndex})
            val r=CatalogValidator.validateCatalog(listOf(l))
            assertEquals(r.printSummary(),0,r.errorCount)
            assertEquals(r.printSummary(),1,r.warningCount)
            assertTrue(r.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
            l.challenges.forEachIndexed{i,q->
                assertEquals("${l.id}_c%02d".format(i+1),q.id)
                assertEquals(4,q.options.distinct().size)
                assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
                for(label in listOf("Criterio:","Aplicación:","Respuesta:"))assertTrue(q.id,q.explanation.contains(label))
            }
            val parsed=parseAcademicContent(l.theory)
            for(part in 1..if(code=="6.1")3 else 4)assertTrue("Missing $code.$part",parsed.sections.any{it.title.startsWith("$code.$part")})
        }
    }

    @Test fun indirectInterrogativeAndNullSubjectQuestionsStateTheirScope()=runBlocking {
        val q=loader().loadLesson("lenguaje",6,"6.1").lesson.challenges
        assertTrue(q[4].statement.contains("únicamente la subordinada"))
        assertTrue(q[4].explanation.contains("La oración completa declara"))
        assertTrue(q[6].statement.contains("los excursionistas"))
        assertTrue(q[6].explanation.contains("llaman a la puerta"))
        assertTrue(q[9].statement.contains("valor de existencia"))
        assertTrue(q[9].explanation.contains("como auxiliar"))
        assertTrue(theory("6.1").contains("Se venden libros"))
        assertTrue(theory("6.1").contains("Llovieron mensajes de apoyo"))
        assertFalse(theory("6.1").contains("error vulgar"))
    }

    @Test fun compoundAndRelativeExamplesDoNotRepeatPriorFalseAlgorithms()=runBlocking {
        val q=loader().loadLesson("lenguaje",6,"6.2").lesson.challenges
        assertTrue(q[3].statement.contains("los postulantes mantuvieron"))
        assertTrue(q[1].explanation.contains("relativa libre"))
        assertEquals("Me preocupa que llegues tarde.",q[8].options[q[8].correctIndex])
        assertTrue(q[9].statement.contains("clasificación escolar tradicional"))
        val t=theory("6.2")
        assertTrue(t.contains("El equipo ha terminado"))
        assertTrue(t.contains("El equipo tiene que terminar"))
        assertTrue(t.contains("Trajo libros y cuadernos"))
        assertTrue(t.contains("Estudió y, sin embargo, no terminó"))
        assertFalse(t.contains("Sin intensificador no hay consecutiva"))
        assertFalse(t.contains("La simple tiene un verbo y la compuesta tiene dos"))
    }

    @Test fun mapsAndTablesKeepTheirContentRelationships(){
        for(code in listOf("6.1","6.2")){
            val text=theory(code)
            assertTrue(text.length>=8000)
            val document=prepareAcademicTheory(text)
            val map=document.diagrams.single()
            assertEquals(13,map.nodes.size);assertEquals(12,map.edges.size)
            val reached=mutableSetOf("A")
            repeat(map.nodes.size){map.edges.filter{it.from in reached}.forEach{reached.add(it.to)}}
            assertEquals(map.nodes.map{it.id}.toSet(),reached)
            val tables=extractAcademicTables(document.text.lines()).second
            assertEquals(if(code=="6.1")5 else 4,tables.size)
            assertTrue(tables.all{table->table.rows.all{it.size==table.headers.size}})
            assertEquals(1,Regex("(?m)^## Importante$").findAll(text).count())
        }
    }

    @Test fun fixturesAndProductionAgree(){
        val f=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana06")
        for(code in listOf("6.1","6.2"))for(name in listOf("lesson.json","theory.md","questions.json"))
            assertArrayEquals("$code/$name",File(root,"$code/$name").readBytes(),File(f,"$code/$name").readBytes())
    }

    @Test fun exportActualParsedTheoryForTypesettingCheck()=runBlocking {
        val preview=buildJsonArray {
            for(code in listOf("6.1","6.2")){
                val lesson=loader().loadLesson("lenguaje",6,code).lesson
                val c=parseAcademicContent(lesson.theory)
                val text=buildList {
                    add(c.intro)
                    c.sections.forEach{s->
                        add(s.title);add(s.leadText);addAll(s.definitions);add(s.bodyText)
                        s.branchCards.forEach{add(it.name);add(it.subtitle);addAll(it.bullets)}
                    }
                }.filter{it.isNotBlank()}.joinToString("\n\n")
                assertTrue(text.length>8000)
                add(buildJsonObject {
                    put("id",lesson.id);put("subject","lenguaje");put("concept",code)
                    put("statement",text);put("options",JsonArray(emptyList()));put("explanation","")
                })
            }
        }
        File("../build/language-61-62-theory-preview.json").writeText(preview.toString())
    }
}
