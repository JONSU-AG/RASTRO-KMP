package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.LessonTheory
import org.junit.Assert.*
import org.junit.Test
import java.io.File

class TheoryClarityTest {
    private val root=File("../shared/src/commonMain/composeResources/files/aprender")
    @Test fun aMultilineMatrixIsNotSplitBetweenLeadAndBodyText() {
        val matrix="\\begin{pmatrix}\n1 & 2 \\\\\n3 & 4\n\\end{pmatrix}"
        val theory=LessonTheory("test","Física",1,"Matrices","## Ejemplo\n$matrix")
        val section=parseAcademicContent(theory).sections.single()
        assertEquals(matrix,section.leadText)
        assertTrue(section.bodyText.isEmpty())
        val broken=LessonTheory("test","Física",1,"Prueba","## Ejemplo\n\\begin{cases}\nx=1\n## Otro tema\nExplicación independiente")
        assertEquals(2,parseAcademicContent(broken).sections.size)
        assertTrue(parseAcademicContent(broken).sections.last().leadText.contains("Explicación independiente"))
    }
    @Test fun administrativeBlocksDisappearButScientificScoresAndTheoryRemain() {
        val raw="""
            ## Ficha técnica del tema
            | Parámetro | Detalle |
            |---|---|
            | Ponderación UNSA | 1.6583 puntos |
            ### Competencias del prospecto
            Texto administrativo
            ## Probabilidad
            En un juego, una persona obtiene un puntaje de 10.
            - **Ponderación oficial:** 3 puntos por pregunta.
            Calcula la probabilidad de ese resultado.
            Ponderación de la media: cada dato tiene un peso distinto.
        """.trimIndent()
        val result=prepareAcademicTheory(raw).text
        assertFalse(result.contains("1.6583"));assertFalse(result.contains("Texto administrativo"))
        assertFalse(result.contains("3 puntos por pregunta"))
        assertTrue(result.contains("un puntaje de 10"));assertTrue(result.contains("Calcula la probabilidad"))
        assertTrue(result.contains("Ponderación de la media"))
    }
    @Test fun realPhysicsCoverDoesNotBecomeAnUnsupportedMap() {
        val raw=File(root,"fisica/semana11/11.1/theory.md").readText()
        assertTrue(raw.contains("SISTEMA DE EVALUACIÓN"))
        val result=prepareAcademicTheory(raw)
        assertFalse(result.text.contains("SISTEMA DE EVALUACIÓN"))
        assertFalse(result.text.contains("DURACIÓN ESTIMADA"))
        assertTrue(result.diagrams.none{it.source.contains("SISTEMA DE EVALUACIÓN")})
        assertTrue(result.diagrams.any{it.nodes.any{n->n.label=="OSCILACIONES Y ONDAS"}})
        assertTrue(result.text.contains("Movimiento Armónico Simple"))
    }
    @Test fun mapIsRenderedFromItsActualNodesAndDirectedEdges() {
        val source="graph TD\n A[Concepto principal] --> B[Primera rama]\n B --> C[Segundo nivel]"
        val map=parseAcademicSourceDiagram(source)!!
        assertEquals(3,map.nodes.size)
        assertEquals("Primera rama",map.nodes.single {it.id=="B"}.label)
        assertEquals(listOf(AcademicMapEdge("A","B"),AcademicMapEdge("B","C")),map.edges)
        val prepared=prepareAcademicTheory("## Mapa\n```mermaid\n$source\n```\n## Teoría\nExplicación real")
        assertEquals(1,prepared.diagrams.size);assertFalse(prepared.text.contains("-->"))
        assertTrue(prepared.text.contains("Explicación real"))
    }
    @Test fun chainedArrowsAndNestedBracketsKeepTheirLabels() {
        val map=parseAcademicSourceDiagram("graph LR\n A[Intervalo [0, 1]] --> B[Resultado] --> C[Fin]")!!
        assertEquals("Intervalo [0, 1]",map.nodes.first().label)
        assertEquals(2,map.edges.size)
        assertEquals("C",map.edges.last().to)
        val interval=parseAcademicSourceDiagram("graph TD\n A[\"Intervalo [a, b)\"] --> B[\"Mediana\"]")!!
        assertEquals("Intervalo [a, b)",interval.nodes.first().label)
        val unicode=parseAcademicSourceDiagram("graph TD\n SIERRA[Sierra] --> CAÑ[Cañones]")!!
        assertEquals("CAÑ",unicode.edges.single().to)
    }
    @Test fun unsupportedSyntaxIsPreservedWithoutInventingAnEdge() {
        val source="mindmap\n root((Tema))\n  Concepto"
        val document=prepareAcademicTheory("```mermaid\n$source\n```")
        assertTrue(document.diagrams.single().nodes.isEmpty())
        assertEquals(source,document.diagrams.single().source)
    }
    @Test fun vectorCoordinatesAndMathCommandsAreNeverSplitIntoBulletItems() {
        val raw="## Vectores\n- **Componentes:** Un vector es \\(\\vec A=(3,2)\\) en \\(\\mathbb{R}^2\\)."
        val parsed=parseAcademicContent(LessonTheory("test","Física",1,"Vectores",raw))
        val branch=parsed.sections.single().branchCards.single()
        assertTrue(branch.bullets.isEmpty())
        assertEquals("Componentes",branch.name)
        assertTrue(branch.subtitle.contains("\\vec A=(3,2)"))
        assertTrue(branch.subtitle.contains("\\mathbb{R}^2"))
    }
    @Test fun realChemistryAndTrigMapsAreAvailableAndMetadataIsNotShown() {
        val chem=prepareAcademicTheory(File(root,"quimica/semana01/1.1/theory.md").readText())
        val matter = chem.diagrams.single { it.nodes.any { n -> n.id == "ROOT" && n.label == "Materia: composición y fases" } }
        assertTrue(matter.nodes.any { it.label == "Sustancias puras" })
        assertTrue(matter.nodes.any { it.label == "Mezclas" })
        assertFalse(chem.text.contains("1.425411425"))
        val trig=prepareAcademicTheory(File(root,"trigonometria/semana01/1.1/theory.md").readText())
        assertTrue(trig.diagrams.any {it.nodes.any {n->n.label.contains("Sistemas de Medición")}})
        assertFalse(trig.text.contains("1.6583"))
    }
    @Test fun allSourceMapsKeepValidEndpointsAndFallbackBlocks() {
        var graphs=0
        val fallback=mutableListOf<String>()
        val unsupported=mutableListOf<String>()
        root.walkTopDown().filter {it.name=="theory.md"}.forEach { file ->
            val result=prepareAcademicTheory(file.readText())
            result.diagrams.forEach {map ->
                if(map.nodes.isNotEmpty()) {
                    val ids=map.nodes.map {it.id}.toSet()
                    assertTrue(file.path,map.edges.all {it.from in ids && it.to in ids})
                    assertTrue(file.path,map.nodes.all {it.label.isNotBlank()})
                    graphs++
                } else {
                    assertTrue(file.path,map.source.isNotBlank())
                    fallback.add(file.relativeTo(root).path)
                    if(Regex("^(graph|flowchart|mindmap)\\b").containsMatchIn(map.source.trimStart())) unsupported.add(file.relativeTo(root).path+"\n"+map.source)
                }
            }
        }
        assertTrue("Expected diagrams across the real resource tree",graphs>20)
        File("../build/theory-map-coverage.txt").writeText("Maps rendered: $graphs\nFallback blocks: ${fallback.size}\n"+fallback.joinToString("\n"))
        File("../build/theory-unsupported-mermaid.txt").writeText(unsupported.joinToString("\n---\n"))
        assertTrue("Unsupported source Mermaid maps: ${unsupported.joinToString()}",unsupported.isEmpty())
    }
}
