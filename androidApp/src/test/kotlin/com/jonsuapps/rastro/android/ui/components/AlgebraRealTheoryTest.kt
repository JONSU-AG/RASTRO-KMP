package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.validation.CatalogValidator
import com.jonsuapps.rastro.utils.AcademicSanitizer
import java.io.File
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class AlgebraRealTheoryTest {
    private val codes=listOf("2.1","2.2","3.1","3.2")
    private val root=File("../shared/src/commonMain/composeResources/files")
    private fun path(code:String)="aprender/algebra/semana%02d/$code".format(code.substringBefore('.').toInt())
    private fun theory(code:String)=File(root,path(code)+"/theory.md").readText()
    private fun loader()=JsonContentLoader(readBytesOverride={File(root,it.removePrefix("files/")).readBytes()})

    @Test fun intervalDrawingDataMatchesTheDefinitionForAllRelationsAndBoundaryCases() {
        for(a in -4..4)for(r in -2..4)for(within in listOf(false,true))for(inclusive in listOf(false,true)) {
            val result=absoluteDistanceIntervals(a.toDouble(),r.toDouble(),within,inclusive)
            for(step in -48..48) {
                val x=step/4.0;val distance=abs(x-a)
                val expected=if(within){if(inclusive)distance<=r else distance<r}else{if(inclusive)distance>=r else distance>r}
                assertEquals("a=$a r=$r within=$within inclusive=$inclusive x=$x",expected,result.any {it.contains(x)})
            }
        }
        assertEquals("\\varnothing",studyIntervalsTex(absoluteDistanceIntervals(2.0,0.0,true,false)))
        assertEquals("\\{2\\}",studyIntervalsTex(absoluteDistanceIntervals(2.0,0.0,true,true)))
        assertEquals("\\mathbb{R}",studyIntervalsTex(absoluteDistanceIntervals(2.0,0.0,false,true)))
        assertEquals("(-\\infty,2) \\cup (2,+\\infty)",studyIntervalsTex(absoluteDistanceIntervals(2.0,0.0,false,false)))
        assertTrue(runCatching {absoluteDistanceIntervals(Double.NaN,1.0,true,true)}.isFailure)
        assertTrue(runCatching {absoluteDistanceIntervals(0.0,Double.POSITIVE_INFINITY,true,true)}.isFailure)
    }

    @Test fun realLessonAnchorsActivateOnlyInTheRightAlgebraSectionsForBothReaders()=runBlocking {
        val expected=mapOf("2.1" to AlgebraStudyGraphic.DISTANCE,"2.2" to AlgebraStudyGraphic.DISTANCE,"3.1" to AlgebraStudyGraphic.PRINCIPAL_ROOT)
        for(code in codes){
            val lesson=loader().loadLesson("algebra",code.substringBefore('.').toInt(),code).lesson
            val parsed=parseAcademicContent(lesson.theory)
            val selected=parsed.sections.mapNotNull {algebraStudyGraphic(lesson.subjectId,it.title)}
            assertEquals(code,expected[code]?.let {listOf(it)} ?: emptyList<AlgebraStudyGraphic>(),selected)
            assertTrue(parsed.sections.all {algebraStudyGraphic("fisica",it.title)==null})
            val units=com.jonsuapps.rastro.android.ui.screens.materialUnits(listOf(lesson),
                com.jonsuapps.rastro.android.ui.screens.MaterialSelection(kind=com.jonsuapps.rastro.android.ui.screens.MaterialKind.THEORY))
            assertEquals(selected,units.mapNotNull {unit->unit.section?.let {algebraStudyGraphic(unit.lesson.subjectId,it.title)}})
        }
        assertNull(algebraStudyGraphic("algebra","Valor absoluto"))
        assertNull(algebraStudyGraphic("algebra","2.1.4 · Otro contenido"))
    }

    @Test fun fourRealLessonsKeepAllFortyFourQuestionsAndHaveNoCatalogOrSanitizerIssues()=runBlocking {
        for(code in codes){
            val week=code.substringBefore('.').toInt();val part=code.substringAfter('.').toInt()
            val lesson=loader().loadLesson("algebra",week,code).lesson
            assertEquals("alg_t%02d_s%02d".format(week,part),lesson.id)
            assertEquals(11,lesson.challenges.size)
            val report=CatalogValidator.validateCatalog(listOf(lesson))
            assertEquals(report.printSummary(),0,report.errorCount);assertEquals(report.printSummary(),0,report.warningCount)
            lesson.challenges.forEach {assertFalse(it.id,AcademicSanitizer.hasUnrelatedStemContamination("Álgebra",it.statement))}
            val parsed=parseAcademicContent(lesson.theory)
            for(section in 1..4)assertTrue("Missing $code.$section",parsed.sections.any {it.title.startsWith("$code.$section")})
        }
    }

    @Test fun counterexamplesAndCorrectedSignsRemainExplicitInTheActualTheory() {
        val exponentCounterexample=sqrt((-1.0).pow(2))
        assertEquals(1.0,exponentCounterexample,0.0)
        assertNotEquals((-1.0).pow(2*.5),exponentCounterexample,0.0)
        assertEquals(.25.pow(.25),.5.pow(.5),1e-12)
        val a=2.0;val b=2.0;val c=sqrt(a*a-b)
        assertEquals(sqrt(a+sqrt(b)),sqrt((a+c)/2)+sqrt((a-c)/2),1e-12)
        assertEquals(0.0,sqrt(4+4-2*sqrt(16.0)),0.0)
        assertTrue(theory("3.1").contains("fracción **reducida**"))
        assertTrue(theory("3.2").contains("No se exige que $"+"C$ sea racional"))
        assertTrue(theory("3.2").contains("**99 términos**"))
        assertTrue(theory("3.2").contains("(1/4)^{1/4}=(1/2)^{1/2}"))
        assertTrue(theory("2.2").contains("r=0"))
        assertTrue(theory("2.2").contains("r<0"))
    }

    @Test fun everyMapHasValidRelationshipsAndNoAdministrativeTablesRemain() {
        for(code in codes){
            val text=theory(code);assertTrue(text.length>8000)
            val doc=prepareAcademicTheory(text)
            val graph=doc.diagrams.single();assertEquals(13,graph.nodes.size);assertEquals(12,graph.edges.size)
            val reached=mutableSetOf("A")
            repeat(graph.nodes.size){graph.edges.filter {it.from in reached}.forEach {reached.add(it.to)}}
            assertEquals(graph.nodes.map {it.id}.toSet(),reached)
            val tables=extractAcademicTables(doc.text.lines()).second
            assertEquals(code,4,tables.size)
            assertTrue(tables.all {table->table.rows.all {it.size==table.headers.size}})
            assertFalse(text.contains("Ponderación"));assertFalse(text.contains("HACKING"));assertFalse(text.contains("Cerro Verde"))
            assertEquals(1,Regex("(?m)^## Importante$").findAll(text).count())
        }
    }

    @Test fun productionAndFixturesRemainIdentical() {
        val fixtures=File("../shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files")
        for(code in codes)for(name in listOf("lesson.json","theory.md","questions.json")) {
            val relative=path(code)+"/$name"
            assertArrayEquals(relative,File(root,relative).readBytes(),File(fixtures,relative).readBytes())
        }
    }

    @Test fun exportActualParsedTheoryForTypesettingChecks()=runBlocking {
        val output=buildJsonArray {
            for(code in codes){
                val lesson=loader().loadLesson("algebra",code.substringBefore('.').toInt(),code).lesson
                val doc=parseAcademicContent(lesson.theory)
                val text=buildList {
                    add(doc.intro)
                    doc.sections.forEach {s->add(s.title);add(s.leadText);addAll(s.definitions);add(s.bodyText)
                        s.branchCards.forEach {add(it.name);add(it.subtitle);addAll(it.bullets)}}
                }.filter {it.isNotBlank()}.joinToString("\n\n")
                assertTrue(code,text.length>5000)
                add(buildJsonObject {put("id",lesson.id);put("subject","algebra");put("concept",code)
                    put("statement",text);put("options",JsonArray(emptyList()));put("explanation","")})
            }
        }
        File("../build/algebra-21-32-theory-preview.json").writeText(output.toString())
    }
}
