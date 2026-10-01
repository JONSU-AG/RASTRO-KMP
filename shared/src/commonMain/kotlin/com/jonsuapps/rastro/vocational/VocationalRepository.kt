package com.jonsuapps.rastro.vocational

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Gestor del almacenamiento privado del resultado vocacional.
 *
 * PRIVACIDAD Y SEGURIDAD:
 * Los resultados son de uso estrictamente íntimo y formativo del estudiante.
 * NO se publican en el perfil público, NO se comparten con amigos ni comunidades
 * y NO se utilizan con fines publicitarios.
 */
object VocationalRepository {

    private val _currentResult = MutableStateFlow<VocationalResult?>(null)
    val currentResult: StateFlow<VocationalResult?> = _currentResult.asStateFlow()

    fun saveResult(result: VocationalResult) {
        _currentResult.value = result
    }

    fun clearResult() {
        _currentResult.value = null
    }

    fun hasResult(): Boolean = _currentResult.value != null
}
