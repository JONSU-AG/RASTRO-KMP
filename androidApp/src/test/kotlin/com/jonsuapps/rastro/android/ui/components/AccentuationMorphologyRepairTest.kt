package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import java.io.File
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class AccentuationMorphologyRepairTest {
    private val production=File("../shared/src/commonMain/composeResources/files/aprender/lenguaje")
    private fun loader()=JsonContentLoader(readBytesOverride={File("../shared/src/commonMain/composeResources/files",it.removePrefix("files/")).readBytes()})
    private fun theory(week:Int,code:String)=File(production,"semana%02d/$code/theory.md".format(week)).readText()

    @Test fun reviewedLevelsKeepTheirIdentityKeysAndLocalValidation()=runBlocking {
        val expected=listOf(Triple(3,"3.3",listOf(1,0,2,3,3,0,2,1,3,1)),Triple(4,"4.1",listOf(3,1,0,0,1,3,3,0,2,0)),Triple(4,"4.2",listOf(1,3,2,2,2,3,0,2,1,1)))
        for((week,code,keys)in expected){
            val l=loader().loadLesson("lenguaje",week,code).lesson
            val suffix=code.substringAfter('.').toInt()
            assertEquals("leng_t%02d_s%02d".format(week,suffix),l.id)
            assertEquals(keys,l.challenges.map{it.correctIndex})
            val r=CatalogValidator.validateCatalog(listOf(l))
            assertEquals(r.printSummary(),0,r.errorCount)
            // The existing 10-question NORMAL levels retain their known shortfall warning.
            assertEquals(r.printSummary(),1,r.warningCount)
            assertTrue(r.reports.flatMap{it.issues}.all{it.code=="DEPTH_CHALLENGE_SHORTFALL"})
            val parsed=parseAcademicContent(l.theory)
            for(part in 1..4)assertTrue("Missing concept $code.$part",parsed.sections.any{it.title.startsWith("$code.$part")})
            l.challenges.forEachIndexed{i,q->
                assertEquals("${l.id}_c%02d".format(i+1),q.id)
                assertEquals(4,q.options.distinct().size)
                assertFalse(AcademicSanitizer.hasUnrelatedStemContamination("Lenguaje",q.statement))
                for(part in listOf("Criterio:","Aplicación:","Respuesta:"))assertTrue(q.id,q.explanation.contains(part))
            }
        }
    }

    @Test fun wordFormationDoesNotTeachMechanicalTestsOrExclusiveSiglaCategories()=runBlocking {
        val q=loader().loadLesson("lenguaje",4,"4.2").lesson.challenges
        assertTrue(q[2].statement.contains("ensombrecer"))
        assertTrue(q[3].options[q[3].correctIndex].contains("base pertinente"))
        assertTrue(q[4].statement.contains("Ofimática"))
        assertFalse(q[6].statement.contains("chasquido"))
        assertTrue(q[9].options[q[9].correctIndex].contains("deletreada o silábica"))
        val t=theory(4,"4.2")
        assertTrue(t.contains("ONU es sigla y también acrónimo"))
        assertTrue(t.contains("una prueba universal"))
        assertTrue(t.contains("se relaciona con chascar"))
        for(bad in listOf("prueba de supresión es infalible","camarógrafo","ONU que se deletrea","automovilista como bloque parasintético"))assertFalse(bad,t.contains(bad))
    }

    @Test fun interrogativeQuestionDoesNotOpposeSynonymousTildeNames()=runBlocking {
        val q=loader().loadLesson("lenguaje",3,"3.3").lesson.challenges[7]
        assertTrue(q.options[q.correctIndex].contains("interrogativa indirecta"))
        assertFalse(q.options.any{it=="Tildación diacrítica"||it=="Tildación enfática"})
        assertTrue(q.explanation.contains("no es una categoría incompatible"))
    }

    @Test fun accentuationSeparatesOrdinaryRulesHiatusAndComplexForms(){
        val t=theory(3,"3.3")
        for(term in listOf("e-xá-me-nes","grupo consonántico ps","adjetivo base","no tiene el mismo relieve","norma actual permite la tilde","Aún y aun"))
            assertTrue(term,t.contains(term))
        for(bad in listOf("exá-me-nes),","enfática, no diacrítica","incluso con ambigüedad","Párrafo de 8 tildes","24 fonemas"))assertFalse(bad,t.contains(bad))
        assertEquals(1,Regex("(?m)^## Importante$").findAll(t).count())
    }

    @Test fun morphologyDistinguishesTheInterfixAndDoesNotMakeAmalgamationUniversal()=runBlocking {
        val questions=loader().loadLesson("lenguaje",4,"4.1").lesson.challenges
        assertEquals("Interfijo",questions[4].options[questions[4].correctIndex])
        assertTrue(questions[4].statement.contains("cancion-c-ita"))
        val t=theory(4,"4.1")
        for(term in listOf("cant-á-ba-mos","des-arm-a-r","no en exigir siempre cinco valores","dentro de una base"))
            assertTrue(term,t.contains(term))
        assertFalse(t.contains("amalgama es exclusivo"))
        assertFalse(t.contains("-ar como vocal temática"))
        assertTrue(t.contains("## Flexión y formación de palabras"))
    }

    @Test fun reviewedTheoriesHaveConnectedMapsAndRectangularTables(){
        for((week,code)in listOf(3 to "3.3",4 to "4.1",4 to "4.2")){
            val raw=theory(week,code)
            assertTrue(raw.length>=8000)
            val doc=prepareAcademicTheory(raw)
            val map=doc.diagrams.single()
            assertEquals(if(code=="4.2")12 else 13,map.nodes.size)
            val reached=mutableSetOf("A")
            repeat(map.nodes.size){map.edges.filter{it.from in reached}.forEach{reached.add(it.to)}}
            assertEquals(map.nodes.map{it.id}.toSet(),reached)
            val tables=extractAcademicTables(doc.text.lines()).second
            assertEquals(4,tables.size)
            assertTrue(tables.all{table->table.rows.all{it.size==table.headers.size}})
        }
    }

    @Test fun productionAndFixturesRemainEquivalent(){
        val fixture=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje")
        for(rel in listOf("semana03/3.3","semana04/4.1","semana04/4.2"))for(name in listOf("questions.json","lesson.json","theory.md"))
            assertArrayEquals("$rel/$name",File(production,"$rel/$name").readBytes(),File(fixture,"$rel/$name").readBytes())
    }

    @Test fun exportRealParsedTextForLocalTypesettingCheck()=runBlocking {
        val preview=buildJsonArray {
            for((week,code)in listOf(3 to "3.3",4 to "4.1",4 to "4.2")){
                val lesson=loader().loadLesson("lenguaje",week,code).lesson
                val content=parseAcademicContent(lesson.theory)
                val text=buildList {
                    add(content.intro)
                    for(s in content.sections){
                        add(s.title);add(s.leadText);addAll(s.definitions);add(s.bodyText)
                        s.branchCards.forEach{add(it.name);add(it.subtitle);addAll(it.bullets)}
                    }
                }.filter{it.isNotBlank()}.joinToString("\n\n")
                assertTrue(text.length>6000)
                add(buildJsonObject {
                    put("id",lesson.id);put("subject","lenguaje");put("concept",code)
                    put("statement",text);put("options",JsonArray(emptyList()));put("explanation","")
                })
            }
        }
        File("../build/language-reviewed-theory-preview.json").writeText(preview.toString())
    }
}
