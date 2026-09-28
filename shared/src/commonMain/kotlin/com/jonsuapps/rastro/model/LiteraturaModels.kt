package com.jonsuapps.rastro.model

import kotlinx.serialization.Serializable

@Serializable
data class EscenaTrama(
    val titulo: String,
    val detalle: String
)

@Serializable
data class PersonajeLiterario(
    val nombre: String,
    val rol: String,
    val descripcion: String
)

@Serializable
data class PreguntaClaveObra(
    val pregunta: String,
    val respuesta: String
)

@Serializable
data class ObraLiteraria(
    val id: String,
    val titulo: String,
    val autor: String,
    val anio: String,
    val pais: String,
    val genero: String,
    val especie: String,
    val corriente: String,
    val temaPrincipal: String,
    val colorHex: String,
    val categoria: String, // "Literatura Peruana", "Literatura Universal", "Literatura Hispanoamericana"
    val sinopsis: String,
    val contextoHistorico: String,
    val analisisTrama: List<EscenaTrama> = emptyList(),
    val personajes: List<PersonajeLiterario> = emptyList(),
    val simbolosClave: List<String> = emptyList(),
    val preguntasClave: List<PreguntaClaveObra> = emptyList(),
    val isFavorito: Boolean = false,
    val coverUrl: String = ""
) {
    val ano: String get() = anio
}
