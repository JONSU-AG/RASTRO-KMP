package com.jonsuapps.rastro.vocational

/** Study areas to explore, not an O*NET occupation match or a diagnosis. */
object VocationalCareerExamples {
    fun forDimension(area: RiasecDimension): List<String> = when(area) {
        RiasecDimension.REALISTIC -> listOf("Ingeniería mecánica", "Ingeniería civil", "Agronomía")
        RiasecDimension.INVESTIGATIVE -> listOf("Biología", "Química", "Medicina")
        RiasecDimension.ARTISTIC -> listOf("Artes", "Arquitectura", "Literatura")
        RiasecDimension.SOCIAL -> listOf("Educación", "Psicología", "Trabajo social")
        RiasecDimension.ENTERPRISING -> listOf("Administración", "Derecho", "Marketing")
        RiasecDimension.CONVENTIONAL -> listOf("Contabilidad", "Economía", "Gestión de información")
    }
}
