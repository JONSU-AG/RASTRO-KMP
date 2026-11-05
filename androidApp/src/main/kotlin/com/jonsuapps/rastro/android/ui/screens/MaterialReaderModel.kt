package com.jonsuapps.rastro.android.ui.screens

import com.jonsuapps.rastro.android.ui.components.*
import com.jonsuapps.rastro.model.*
import java.security.MessageDigest

internal enum class MaterialKind(val label: String) { BOTH("Teoría y preguntas"), THEORY("Solo teoría"), QUESTIONS("Solo preguntas") }
internal enum class MaterialNavigation(val label: String) { VERTICAL("Vertical continua"), HORIZONTAL("Horizontal por contenido") }
internal enum class MaterialReview(val label: String) { ALL("Todo"), PENDING("Pendiente"), REVIEWED("Revisado"), FLAGGED("Con errores") }
internal data class MaterialSelection(val kind: MaterialKind = MaterialKind.BOTH, val navigation: MaterialNavigation = MaterialNavigation.VERTICAL,
    val week: Int? = null, val lessonId: String? = null)
internal data class MaterialUnit(val id: String, val lesson: LessonNode, val title: String,
    val paragraph: String = "", val section: AcademicSection? = null, val diagram: AcademicSourceDiagram? = null,
    val table: AcademicTable? = null, val challenge: Challenge? = null, val fingerprint: String, val visual: EducationalVisual? = null)
internal data class MaterialMark(val fingerprint: String, val status: MaterialReview, val note: String)

// Adding placement metadata must not invalidate prior review marks for unchanged images.
internal fun materialVisualHash(visual:EducationalVisual)=materialHash(visual.toString().substringBeforeLast(", sectionKeywords=")+")")

internal fun materialHash(text: String) = MessageDigest.getInstance("SHA-256").digest(text.toByteArray()).joinToString("") {
    val byte=it.toInt() and 255
    "0123456789abcdef"[byte ushr 4].toString()+"0123456789abcdef"[byte and 15]
}

/** References point to the existing lesson/challenge. Never reads an exam bank or grants rewards. */
internal fun materialUnits(lessons: List<LessonNode>, selection: MaterialSelection, visuals: List<EducationalVisual> = emptyList()): List<MaterialUnit> = buildList {
    lessons.filter { (selection.week == null || it.semana == selection.week) && (selection.lessonId == null || it.id == selection.lessonId) }
        .sortedWith(compareBy<LessonNode> { it.semana }.thenComparator { a,b -> SubtemaCode.parse(a.subtema).compareTo(SubtemaCode.parse(b.subtema)) }.thenBy { it.id })
        .forEach { lesson ->
            fun addTheory(key: String, title: String, text: String = "", section: AcademicSection? = null,
                diagram: AcademicSourceDiagram? = null, table: AcademicTable? = null) {
                add(MaterialUnit("${lesson.id}/theory/$key", lesson, title, text, section, diagram, table,
                    fingerprint = materialHash(listOf(title,text,section,diagram,table).joinToString("|"))))
            }
            if (selection.kind != MaterialKind.QUESTIONS) {
                val parsed = parseAcademicContent(lesson.theory)
                val visualAnchors=educationalVisualsForLesson(visuals,lesson.subjectId,lesson.id).groupBy {educationalVisualAnchor(it,parsed.sections.map {s->s.title})}
                fun addVisual(visual:EducationalVisual) {
                    add(MaterialUnit("${lesson.id}/visual/${visual.id}",lesson,visual.title,visual=visual,fingerprint=materialVisualHash(visual)))
                }
                visualAnchors[-1].orEmpty().forEach(::addVisual)
                if (parsed.intro.isNotBlank()) addTheory("intro", lesson.title, parsed.intro)
                parsed.tables.forEachIndexed { i,t -> addTheory("table/$i", lesson.title, table=t) }
                parsed.diagrams.forEachIndexed { i,d -> addTheory("map/${materialHash(d.nodes.firstOrNull()?.label.orEmpty()).take(16)}/$i", lesson.title, diagram=d) }
                val occurrences = mutableMapOf<String,Int>()
                parsed.sections.forEachIndexed { sectionIndex,section ->
                    val key = materialHash(section.title).take(16)
                    val occurrence = occurrences.getOrDefault(key,0); occurrences[key] = occurrence+1
                    addTheory("section/$key/$occurrence",section.title,section=section)
                    visualAnchors[sectionIndex].orEmpty().forEach(::addVisual)
                }
                val formulas = (lesson.theory.formulas + listOfNotNull(lesson.theory.formulaLatex)).filter(String::isNotBlank).distinct()
                formulas.forEachIndexed { i,f -> if (!lesson.theory.resumen.contains(f)) addTheory("formula/$i", lesson.theory.formulaName ?: "Fórmula", "$$"+f+"$$") }
            }
            if (selection.kind != MaterialKind.THEORY) lesson.challenges.distinctBy { it.id }.forEach { question ->
                add(MaterialUnit("${lesson.id}/question/${question.id}",lesson,"Pregunta ${lesson.challenges.indexOf(question)+1}",
                    challenge=question,fingerprint=materialHash(question.toString())))
            }
        }
}

internal fun materialStatus(unit: MaterialUnit, mark: MaterialMark?): MaterialReview =
    mark?.takeIf { it.fingerprint == unit.fingerprint }?.status ?: MaterialReview.PENDING

internal fun materialRestoreIndex(units: List<MaterialUnit>, id: String?): Int = units.indexOfFirst { it.id == id }.coerceAtLeast(0)

internal fun materialAnswer(question: Challenge): List<String> = when(question.type) {
    ChallengeType.MULTIPLE_CHOICE -> listOfNotNull(question.options.getOrNull(question.correctIndex))
    ChallengeType.MATCH_PAIRS -> question.pairs.map { "${it.left} ↔ ${it.right}" }
    ChallengeType.FILL_BLANK -> if (question.blanks.isNotEmpty()) question.blanks.map { "${it.id}: ${it.correctText}" }
        else listOfNotNull(question.correctText)
}

/** Selection changes only references; parsing and content fingerprints belong to course preparation. */
internal fun filterMaterialUnits(course:List<MaterialUnit>,selection:MaterialSelection)=course.filter {unit ->
    (selection.week==null || unit.lesson.semana==selection.week) &&
    (selection.lessonId==null || unit.lesson.id==selection.lessonId) &&
    (selection.kind!=MaterialKind.THEORY || unit.challenge==null) &&
    (selection.kind!=MaterialKind.QUESTIONS || unit.challenge!=null)
}
internal fun materialCanDraw(unit:MaterialUnit?)=unit?.challenge!=null
