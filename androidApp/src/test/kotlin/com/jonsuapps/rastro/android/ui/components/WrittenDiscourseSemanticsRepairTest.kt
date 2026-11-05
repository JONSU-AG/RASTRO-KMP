package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import java.io.File
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class WrittenDiscourseSemanticsRepairTest {
    private val codes=listOf("7.1","7.2","7.3","8.1","8.2")
    private val root=File("../shared/src/commonMain/composeResources/files")
    private fun loader()=JsonContentLoader(readBytesOverride={File(root,it.removePrefix("files/")).readBytes()})
    private fun folder(code:String)="aprender/lenguaje/semana%02d/$code".format(code.substringBefore('.').toInt())
    private fun theory(code:String)=File(root,folder(code)+"/theory.md").readText()

    @Test fun allFiftyQuestionsKeepTheirIdentityKeysAndPassLocalValidation()=runBlocking {
        val keys=listOf(listOf(0,0,3,2,2,3,0,1,0,0),listOf(1,0,3,2,1,3,1,1,3,2),
            listOf(1,0,2,3,0,1,2,1,3,2),listOf(2,0,2,3,3,2,2,3,3,2),listOf(3,1,0,0,0,1,1,0,1,1))
        codes.forEachIndexed { index,code ->
            val week=code.substringBefore('.').toInt()
            val lesson=loader().loadLesson("lenguaje",week,code).lesson
            assertEquals("leng_t%02d_s%02d".format(week,code.substringAfter('.').toInt()),lesson.id)
            assertEquals(keys[index],lesson.challenges.map {it.correctIndex})
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount)
            assertEquals(report.printSummary(),1,report.warningCount)
            assertTrue(report.reports.flatMap {it.issues}.all {it.code=="DEPTH_CHALLENGE_SHORTFALL"})
            lesson.challenges.forEachIndexed { i,q ->
                assertEquals(lesson.id+"_c%02d".format(i+1),q.id)
                assertEquals(4,q.options.distinct().size)
                assertFalse(q.id,AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
                listOf("Criterio:","Aplicación:","Respuesta:").forEach { assertTrue(q.id,q.explanation.contains(it)) }
            }
            val parsed=parseAcademicContent(lesson.theory)
            for(part in 1..4)assertTrue("$code.$part",parsed.sections.any {it.title.startsWith("$code.$part")})
        }
    }

    @Test fun punctuationDoesNotConvertOptionalOrContextualChoicesIntoAbsoluteRules()=runBlocking {
        val questions=loader().loadLesson("lenguaje",7,"7.2").lesson.challenges
        assertTrue(questions[2].statement.contains("sin que exista un inciso"))
        assertTrue(questions[3].explanation.contains("no demuestra"))
        assertTrue(questions[5].explanation.contains("punto y seguido"))
        assertEquals("La tutora indicó: «Revisen las fechas».",questions[6].options[1])
        assertTrue(questions[8].statement.contains("oración seguida"))
        assertTrue(theory("7.2").contains("Hoy revisamos los registros"))
        assertTrue(theory("7.2").contains("Libros, cuadernos, lápices, etc., estaban"))
        assertTrue(theory("7.2").contains("lista vertical"))
    }

    @Test fun capitalsQuestionsHaveOneExplicitContextAndTheWarGenericStaysLowercase()=runBlocking {
        val questions=loader().loadLesson("lenguaje",7,"7.3").lesson.challenges
        assertEquals("La alcaldesa visitará Arequipa el próximo lunes.",questions[1].options[0])
        assertTrue(questions[0].statement.contains("posición inicial"))
        assertTrue(questions[6].options[2].contains("plaza del Dos de Mayo"))
        assertEquals("El grupo estudia la guerra del Pacífico.",questions[8].options[3])
        assertTrue(theory("7.3").contains("Revolución francesa"))
        assertTrue(theory("7.3").contains("nombre curricular"))
    }

    @Test fun referenceAndMeaningQuestionsAvoidTheFormerAmbiguousClaims()=runBlocking {
        val discourse=loader().loadLesson("lenguaje",7,"7.1").lesson.challenges
        assertTrue(discourse[2].options[3].contains("expresión descriptiva"))
        assertTrue(discourse[6].explanation.contains("no exige que todo tema"))
        val signs=loader().loadLesson("lenguaje",8,"8.1").lesson.challenges
        assertFalse(signs[1].statement.contains("/p-e-r-r-o/"))
        assertEquals("Monemas o unidades significativas",signs[7].options[3])
        assertTrue(signs[6].explanation.contains("innovación"))
        assertTrue(theory("8.1").contains("coarticulación"))
        val semantic=loader().loadLesson("lenguaje",8,"8.2").lesson.challenges
        assertTrue(semantic[7].statement.contains("la herramienta"))
        assertFalse(semantic[7].statement.contains("capital"))
        assertTrue(semantic[9].statement.contains("formación"))
        assertTrue(theory("8.2").contains("variedades seseantes"))
        assertTrue(theory("8.2").contains("histórica y la clasificación lexicográfica requieren consulta"))
    }

    @Test fun everyMapRetainsItsRelationshipsAndEveryTableIsRectangular() {
        for(code in codes){
            val text=theory(code)
            assertTrue(code,text.length>=8000)
            val document=prepareAcademicTheory(text)
            val graph=document.diagrams.single()
            assertEquals(13,graph.nodes.size);assertEquals(12,graph.edges.size)
            val reached=mutableSetOf("A")
            repeat(graph.nodes.size){graph.edges.filter {it.from in reached}.forEach {reached.add(it.to)}}
            assertEquals(graph.nodes.map {it.id}.toSet(),reached)
            val tables=extractAcademicTables(document.text.lines()).second
            assertEquals(code,4,tables.size)
            assertTrue(tables.all {table->table.rows.all {it.size==table.headers.size}})
            assertEquals(1,Regex("(?m)^## Importante$").findAll(text).count())
            assertFalse(text.contains("reto titán",ignoreCase=true))
            assertFalse(text.contains("clave de admisión",ignoreCase=true))
        }
    }

    @Test fun fixturesAreIdenticalAndThePreviousSignContextSupplementIsPreserved() {
        val fixtures=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files")
        for(code in codes)for(name in listOf("lesson.json","questions.json","theory.md")){
            val path=folder(code)+"/$name"
            assertArrayEquals(path,File(root,path).readBytes(),File(fixtures,path).readBytes())
        }
        val signs=theory("8.1")
        assertTrue(signs.contains("## Clases de signo, significado y contexto"))
        assertTrue(signs.contains("Un indicio mantiene una relación de conexión"))
        assertTrue(signs.contains("El contexto verbal son los enunciados"))
        assertTrue(signs.contains("Un texto puede usar ambas."))
    }

    @Test fun exportActualParsedTheoryForMobileTypesettingCheck()=runBlocking {
        val output=buildJsonArray {
            for(code in codes){
                val lesson=loader().loadLesson("lenguaje",code.substringBefore('.').toInt(),code).lesson
                val document=parseAcademicContent(lesson.theory)
                val text=buildList {
                    add(document.intro)
                    document.sections.forEach {s->
                        add(s.title);add(s.leadText);addAll(s.definitions);add(s.bodyText)
                        s.branchCards.forEach {add(it.name);add(it.subtitle);addAll(it.bullets)}
                    }
                }.filter {it.isNotBlank()}.joinToString("\n\n")
                assertTrue(code,text.length>8000)
                add(buildJsonObject {
                    put("id",lesson.id);put("subject","lenguaje");put("concept",code)
                    put("statement",text);put("options",JsonArray(emptyList()));put("explanation","")
                })
            }
        }
        File("../build/language-71-82-theory-preview.json").writeText(output.toString())
    }
}
