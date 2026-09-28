package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.data.catalog.*
import com.jonsuapps.rastro.model.LessonNode

internal object LearningPathCatalog {
    val lessons: List<LessonNode> by lazy {
        val raw = buildList {
            addAll(RazMatematicoCatalog.lessons)
            addAll(RazLogicoCatalog.lessons)
            addAll(RazVerbalCatalog.lessons)
            addAll(ComprensionLectoraCatalog.lessons)
            addAll(AritmeticaCatalog.lessons)
            addAll(AlgebraCatalog.lessons)
            addAll(GeometriaCatalog.lessons)
            addAll(TrigonometriaCatalog.lessons)
            addAll(HistoriaUniversalCatalog.lessons)
            addAll(HistoriaPeruCatalog.lessons)
            addAll(GeografiaCatalog.lessons)
            addAll(QuimicaCatalog.lessons)
            addAll(BiologiaCatalog.lessons)
            addAll(FisicaCatalog.lessons)
            addAll(PsicologiaCatalog.lessons)
            addAll(FilosofiaCatalog.lessons)
            addAll(CivicaCatalog.lessons)
            addAll(LenguajeCatalog.lessons)
            addAll(LiteraturaCatalog.lessons)
            addAll(InglesCatalog.lessons)
        }
        raw.groupBy { it.subjectId.lowercase() }
            .flatMap { (_, subjectLessons) ->
                subjectLessons.sortedWith(compareBy({ it.semana }, { it.id })).withSubtemaIndex()
            }
    }

    fun forSubject(subjectId: String): List<LessonNode> =
        lessons.filter { it.subjectId.equals(subjectId, ignoreCase = true) }

    fun byId(lessonId: String): LessonNode? =
        lessons.firstOrNull { it.id == lessonId }
}
