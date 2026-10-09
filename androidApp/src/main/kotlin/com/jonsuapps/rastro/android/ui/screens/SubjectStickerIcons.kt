package com.jonsuapps.rastro.android.ui.screens

import com.jonsuapps.rastro.R

/** Banner/selector art only: the lesson trail keeps its original illustrations. */
internal fun subjectStickerDrawable(subjectId: String): Int = when (subjectId) {
    "biologia" -> R.drawable.ic_course_biology_sticker
    "fisica" -> R.drawable.ic_course_physics_sticker
    "quimica" -> R.drawable.ic_course_quimica
    "filosofia" -> R.drawable.ic_course_filosofia
    "historia", "historia_universal" -> R.drawable.ic_course_history_sticker
    "historia_peru" -> R.drawable.ic_course_peru_sticker
    "lenguaje" -> R.drawable.ic_course_lenguaje
    "literatura" -> R.drawable.ic_course_literatura
    "comprension_lectora" -> R.drawable.ic_course_reading_sticker
    "civica" -> R.drawable.ic_course_civica
    "geografia" -> R.drawable.ic_course_geografia
    "psicologia" -> R.drawable.ic_course_psicologia
    "raz_matematico" -> R.drawable.ic_course_raz_matematico
    "raz_logico" -> R.drawable.ic_course_raz_logico
    "raz_verbal" -> R.drawable.ic_course_raz_verbal
    "aritmetica", "matematica" -> R.drawable.ic_course_matematica
    "algebra" -> R.drawable.ic_course_algebra_sticker
    "geometria" -> R.drawable.ic_course_geometry_sticker
    "trigonometria" -> R.drawable.ic_course_trig_sticker
    else -> R.drawable.ic_course_ingles
}
