package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import java.io.File
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class SyntaxPhraseRepairTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje/semana05")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    private fun theory(code:String)=File(root,"$code/theory.md").readText()

    @Test fun identityKeysAndLocalValidationRemainStable()=runBlocking {
        val expected=mapOf("5.1" to listOf(0,1,3,2,2,0,2,0,1,1),"5.2" to listOf(3,1,0,3,2,3,2,3,0,1))
        for((code,keys)in expected){
            val lesson=loader().loadLesson("lenguaje",5,code).lesson
            assertEquals("leng_t05_s%02d".format(code.substringAfter('.').toInt()),lesson.id)
            assertEquals(keys,lesson.challenges.map{it.correctIndex})
            val r=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(r.printSummary(),0,r.errorCount)
            assertEquals(r.printSummary(),1,r.warningCount)
            assertTrue(r.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
            lesson.challenges.forEachIndexed {i,q->
                assertEquals("${lesson.id}_c%02d".format(i+1),q.id)
                assertEquals(4,q.options.distinct().size)
                assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
                for(label in listOf("Criterio:","Aplicación:","Respuesta:"))assertTrue(q.id,q.explanation.contains(label))
            }
            val parsed=parseAcademicContent(lesson.theory)
            for(part in 1..4)assertTrue("Missing $code.$part",parsed.sections.any{it.title.startsWith("$code.$part")})
        }
    }

    @Test fun nonPersonalFormsDoNotEraseParticipleAgreement()=runBlocking {
        val q=loader().loadLesson("lenguaje",5,"5.1").lesson.challenges
        assertTrue(q[1].options[q[1].correctIndex].contains("pronombre personal"))
        assertTrue(q[3].options[q[3].correctIndex].contains("persona"))
        assertFalse(q[3].options[q[3].correctIndex].contains("número y tiempo"))
        val t=theory("5.1")
        assertTrue(t.contains("las lecciones estudiadas"))
        assertTrue(t.contains("ha estudiado las lecciones"))
        assertTrue(t.contains("no constituye una prueba automática"))
        assertFalse(t.contains("Si lo rechaza es perífrasis"))
        assertFalse(t.contains("colectivo en singular exige"))
    }

    @Test fun directObjectTestsAreTiedToAnActualConstruction()=runBlocking {
        val q=loader().loadLesson("lenguaje",5,"5.2").lesson.challenges
        assertTrue(q[1].statement.contains("La investigadora redactó el informe"))
        assertTrue(q[1].explanation.contains("No se exige que todo complemento directo"))
        assertTrue(theory("5.2").contains("Tengo dos hermanos"))
        assertTrue(theory("5.2").contains("Lo también puede sustituir un atributo"))
        assertFalse(theory("5.2").contains("doble prueba es infalible"))
    }

    @Test fun indirectDuplicationIsNotCoordinationAndParaIsNotAutomatic()=runBlocking {
        val q=loader().loadLesson("lenguaje",5,"5.2").lesson.challenges
        assertTrue(q[9].options[q[9].correctIndex].contains("duplica"))
        assertFalse(q[9].options[q[9].correctIndex].contains("coordinado"))
        assertTrue(q[6].statement.contains("pertenece al abuelo"))
        val t=theory("5.2")
        assertTrue(t.contains("Entregó a Ana un paquete para Luis"))
        assertTrue(t.contains("no de coordinación"))
        assertTrue(t.contains("complemento agente puede omitirse"))
        assertFalse(t.contains("agente es obligatorio"))
    }

    @Test fun mapsAndTablesHaveActualCoherentStructure(){
        for(code in listOf("5.1","5.2")){
            val t=theory(code)
            assertTrue(t.length>=8000)
            val doc=prepareAcademicTheory(t)
            val map=doc.diagrams.single()
            assertEquals(13,map.nodes.size)
            assertEquals(12,map.edges.size)
            val reached=mutableSetOf("A")
            repeat(map.nodes.size){map.edges.filter{it.from in reached}.forEach{reached.add(it.to)}}
            assertEquals(map.nodes.map{it.id}.toSet(),reached)
            val tables=extractAcademicTables(doc.text.lines()).second
            assertEquals(4,tables.size)
            assertTrue(tables.all{table->table.rows.all{it.size==table.headers.size}})
            assertEquals(1,Regex("(?m)^## Importante$").findAll(t).count())
        }
    }

    @Test fun fixturesAndExistingComplementArePreserved(){
        val fixture=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje/semana05")
        for(code in listOf("5.1","5.2"))for(name in listOf("lesson.json","theory.md","questions.json"))
            assertArrayEquals("$code/$name",File(root,"$code/$name").readBytes(),File(fixture,"$code/$name").readBytes())
        assertTrue(theory("5.2").trimEnd().endsWith("Las pruebas de concordancia y sustitución son más confiables que una pregunta mecánica aislada."))
    }

    @Test fun exportParsedTheoryForMobileTypesettingCheck()=runBlocking {
        val preview=buildJsonArray {
            for(code in listOf("5.1","5.2")){
                val lesson=loader().loadLesson("lenguaje",5,code).lesson
                val content=parseAcademicContent(lesson.theory)
                val text=buildList {
                    add(content.intro)
                    for(s in content.sections){
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
        File("../build/language-51-52-theory-preview.json").writeText(preview.toString())
    }
}
