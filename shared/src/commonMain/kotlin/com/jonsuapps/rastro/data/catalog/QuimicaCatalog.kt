package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.LessonNode

/**
 * Catálogo Maestro de Química para UNSA / CEPRUNSA.
 * 16 semanas oficiales desglosadas en 4 niveles interactivos cada una (64 lecciones completas).
 * Ensamblado modularmente desde QuimicaPart1 (Semanas 1-8) y QuimicaPart2 (Semanas 9-16).
 */
internal object QuimicaCatalog {
    val lessons: List<LessonNode> = QuimicaPart1.lessons + QuimicaPart2.lessons
}
