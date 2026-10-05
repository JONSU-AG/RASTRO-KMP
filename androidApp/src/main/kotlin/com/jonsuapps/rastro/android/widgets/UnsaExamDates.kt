package com.jonsuapps.rastro.android.widgets

/** Dates supplied by the user, not automatically maintained by an UNSA service. */
internal data class ExamDateOption(val id: String, val title: String, val date: String, val preliminary: Boolean = false)
internal object UnsaExamDates {
    val options = listOf(
        ExamDateOption("quintos", "CEPRUNSA Ciclo Quintos · Conocimientos", "2026-11-01"),
        ExamDateOption("quintos-previa", "CEPRUNSA Ciclo Quintos · Previa", "2026-10-18", true),
        ExamDateOption("ceprunsa-ii", "CEPRUNSA II Fase · Conocimientos", "2027-01-24"),
        ExamDateOption("ceprunsa-ii-previa", "CEPRUNSA II Fase · Previa", "2027-01-10", true),
        ExamDateOption("extraordinario", "Extraordinario · Aptitudes académicas", "2027-02-21"),
        ExamDateOption("extraordinario-previa", "Extraordinario · Previa", "2027-02-14", true),
        ExamDateOption("ordinario-ii", "Ordinario II Fase · Conocimientos", "2027-03-14"),
        ExamDateOption("ordinario-ii-previa", "Ordinario II Fase · Previa", "2027-03-07", true),
        ExamDateOption("filiales", "Ordinario Filiales · Conocimientos", "2027-03-20")
    )
}
