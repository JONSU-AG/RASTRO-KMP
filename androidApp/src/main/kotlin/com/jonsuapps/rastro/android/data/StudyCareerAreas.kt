package com.jonsuapps.rastro.android.data

import com.jonsuapps.rastro.model.AreaAdmision
import java.text.Normalizer
import java.util.Locale

/** RASTRO's three preparation groups; not a university's official admission channels. */
object StudyCareerAreas {
    fun classify(goal: StudyGoal): AreaAdmision? {
        if (!goal.valid || !goal.catalogCareer) return null
        val career = Normalizer.normalize(goal.career, Normalizer.Form.NFD)
            .replace(Regex("\\p{M}+"), "").lowercase(Locale.ROOT).substringBefore(" - ").trim()
        val biomedical = listOf("medicina", "enfermeria", "obstetricia", "odontologia", "estomatologia",
            "nutricion", "ciencias de la nutricion", "biologia", "ciencias biologicas", "genetica",
            "farmacia", "microbiologia", "toxicologia", "zootecnia", "agronomia", "ingenieria agronom",
            "ingenieria pesquera")
        if (biomedical.any { career == it || career.startsWith("$it ") || career.startsWith("$it:") }) return AreaAdmision.BIOMEDICAS
        val social = listOf("administracion", "antropologia", "arqueologia", "arte", "artes", "bibliotecologia",
            "ciencia politica", "ciencias de la comunicacion", "comunicacion social", "conservacion y restauracion",
            "contabilidad", "ciencias contables", "ciencias administrativas", "danza", "derecho", "economia",
            "educacion", "filosofia", "finanzas", "gestion", "banca y seguros", "geografia", "historia",
            "linguistica", "literatura", "marketing", "psicologia", "relaciones industriales", "sociologia",
            "trabajo social", "turismo")
        if (social.any { career == it || career.startsWith("$it ") || career.startsWith("$it:") }) return AreaAdmision.SOCIALES
        val engineering = listOf("ingenieria", "arquitectura", "urbanismo", "fisica", "matematica", "matematicas",
            "quimica", "estadistica", "ciencia de la computacion", "computacion cientifica", "ciencias de los alimentos",
            "ciencias fisico matematicas")
        if (engineering.any { career == it || career.startsWith("$it ") || career.startsWith("$it:") }) return AreaAdmision.INGENIERIAS
        return null // Unknown/custom careers never receive an invented default.
    }
}
