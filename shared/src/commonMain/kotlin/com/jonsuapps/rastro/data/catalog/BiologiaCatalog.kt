package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.LessonNode

/**
 * Catálogo Maestro de Biología para UNSA / CEPRUNSA.
 * 13 semanas oficiales desglosadas en 4 niveles interactivos cada una (52 lecciones completas).
 * Ensamblado modularmente desde BiologiaPart1 (Semanas 1-7, 28 niveles) y BiologiaPart2 (Semanas 8-13, 24 niveles).
 */
internal object BiologiaCatalog {
    val lessons: List<LessonNode> = BiologiaPart1.lessons + BiologiaPart2.lessons
}
