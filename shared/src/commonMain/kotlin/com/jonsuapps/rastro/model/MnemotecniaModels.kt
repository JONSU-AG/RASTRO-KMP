package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
data class MnemotecniaBreakdown(
    val letter: String,
    val word: String,
    val concept: String,
    val unit: String
)

@Serializable
data class MnemotecniaTriangulo(
    val top: String,
    val bottomLeft: String,
    val bottomRight: String,
    val regla: String
)

@Serializable
data class MnemotecniaItem(
    val id: String,
    val subject: String,
    val topic: String,
    val phrase: String,
    val shortFormula: String,
    val importance: String,
    val category: String,
    val summary: String,
    val breakdown: List<MnemotecniaBreakdown> = emptyList(),
    val triangulo: MnemotecniaTriangulo? = null,
    val explicacion: String,
    val fijaExamen: String,
    val ejemplo: String,
    val tags: List<String> = emptyList(),
    val isFavorito: Boolean = false
)

@Serializable
data class FormulaVariable(
    val symbol: String,
    val name: String,
    val unit: String,
    val defaultValue: Double? = null
)

@Serializable
data class FormulaInteractive(
    val id: String,
    val subject: String,
    val category: String,
    val name: String,
    val latexFormula: String,
    val description: String,
    val variables: List<FormulaVariable>,
    val calculateFunctionId: String, // Identificador para la calculadora viva
    val tips: String = ""
)
