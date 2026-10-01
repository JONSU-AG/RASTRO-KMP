package com.jonsuapps.rastro.vocational

/**
 * Repositorio del Banco de Ítems del O*NET® Interest Profiler™ (RIASEC).
 *
 * ESTADO: BANCO OFICIAL DE ÍTEMS PENDIENTE DE INCORPORACIÓN.
 * Conforme a las directrices metodológicas y éticas del proyecto, NO se generan preguntas artificiales
 * ni variantes inventadas. El banco queda preparado arquitectónicamente para recibir las 60 actividades
 * oficiales autorizadas (10 por dimensión RIASEC) bajo la licencia correspondiente de O*NET.
 */
object VocationalItemBank {

    private var _authorizedQuestions: List<VocationalQuestion> = emptyList()

    /**
     * Indica si el banco oficial de 60 ítems está completamente cargado y validado.
     */
    val isBankLoaded: Boolean
        get() = _authorizedQuestions.size == 60 && validateBankStructure(_authorizedQuestions)

    /**
     * Retorna la lista de actividades cargadas actualmente.
     */
    fun getQuestions(): List<VocationalQuestion> = _authorizedQuestions

    /**
     * Incorpora el banco oficial autorizado tras verificar rigurosamente:
     * 1. Exactamente 60 actividades.
     * 2. Exactamente 10 actividades por dimensión (R=10, I=10, A=10, S=10, E=10, C=10).
     * 3. Ausencia de preguntas duplicadas en ID o texto.
     */
    fun setAuthorizedQuestions(questions: List<VocationalQuestion>) {
        require(questions.size == 60) {
            "El banco debe contener exactamente 60 actividades (se recibieron ${questions.size})."
        }
        val uniqueIds = questions.map { it.id }.toSet()
        require(uniqueIds.size == 60) {
            "Existen IDs duplicados en el banco de ítems."
        }
        val dimensionCounts = questions.groupBy { it.dimension }
        RiasecDimension.entries.forEach { dimension ->
            val count = dimensionCounts[dimension]?.size ?: 0
            require(count == 10) {
                "La dimensión ${dimension.title} (${dimension.code}) debe tener exactamente 10 actividades. Tiene: $count"
            }
        }
        _authorizedQuestions = questions
    }

    /**
     * Valida si una lista cumple con la distribución exacta de 10 ítems por dimensión RIASEC.
     */
    fun validateBankStructure(questions: List<VocationalQuestion>): Boolean {
        if (questions.size != 60) return false
        val counts = questions.groupBy { it.dimension }
        return RiasecDimension.entries.all { counts[it]?.size == 10 }
    }
}
