package com.jonsuapps.rastro.android.data

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object ErrorBankOrigins {
    const val APRENDER = "Aprender"
    const val SIMULACRO = "Simulacro"
    const val EXAMEN_RAPIDO = "Examen Rápido"
}

data class FailedQuestion(
    val id: String,
    val subject: String,
    val subtema: String,
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanation: String,
    val dateAdded: Long = System.currentTimeMillis(),
    val isSolved: Boolean = false,
    val origin: String = ErrorBankOrigins.APRENDER
)

object ErrorBankRepository {
    private val defaultCuratedErrors = listOf(
        FailedQuestion(
            id = "err_fis_01",
            subject = "Física",
            subtema = "Análisis Dimensional",
            question = "En la ecuación homogénea E = A · v² + B · F, donde E es energía, v es velocidad y F es fuerza, determine la dimensión de [A/B].",
            options = listOf("M L⁻¹", "M L T⁻¹", "L⁻¹", "M⁰ L⁰ T⁰", "M L"),
            correctAnswerIndex = 0,
            explanation = "Por el principio de homogeneidad: [E] = [A][v]² ⟹ M L² T⁻² = [A] (L T⁻¹)² ⟹ [A] = M. Además [E] = [B][F] ⟹ M L² T⁻² = [B] (M L T⁻²) ⟹ [B] = L. Por lo tanto [A/B] = M / L = M L⁻¹.",
            origin = ErrorBankOrigins.APRENDER
        ),
        FailedQuestion(
            id = "err_bio_02",
            subject = "Biología",
            subtema = "Genética Clásica",
            question = "Al cruzar dos individuos heterocigotos para un solo carácter con dominancia completa (Aa × Aa), ¿cuál es la probabilidad genotípica de obtener un individuo homocigoto?",
            options = listOf("25%", "50%", "75%", "100%", "33%"),
            correctAnswerIndex = 1,
            explanation = "El cruce Aa × Aa produce genotipos: 1/4 AA (homocigoto dominante), 2/4 Aa (heterocigoto) y 1/4 aa (homocigoto recesivo). Los homocigotos son AA + aa = 1/4 + 1/4 = 2/4 = 50%.",
            origin = ErrorBankOrigins.APRENDER
        ),
        FailedQuestion(
            id = "err_rv_03",
            subject = "Razonamiento Verbal",
            subtema = "Sinónimos Contextuales",
            question = "Identifique el antónimo contextual de la palabra destacada: 'El orador pronunció un discurso lacónico ante la asamblea.'",
            options = listOf("Breve", "Conciso", "Elocuente", "Locuaz", "Sentencioso"),
            correctAnswerIndex = 3,
            explanation = "Lacónico significa breve, conciso o parco en palabras. Su antónimo directo en el contexto de hablar extensamente es 'locuaz' o 'prolijo'.",
            origin = ErrorBankOrigins.SIMULACRO
        ),
        FailedQuestion(
            id = "err_alg_05",
            subject = "Álgebra",
            subtema = "Funciones Cuadráticas",
            question = "Determine el rango de la función real f(x) = -2x² + 4x + 5.",
            options = listOf("⟨-∞, 7]", "[7, +∞⟩", "⟨-∞, 5]", "[5, +∞⟩", "ℝ"),
            correctAnswerIndex = 0,
            explanation = "Como a = -2 < 0, la parábola abre hacia abajo. El vértice es h = -b / (2a) = -4 / (2(-2)) = 1. Evaluando: k = f(1) = -2(1)² + 4(1) + 5 = 7. Por ende, el rango es ⟨-∞, 7].",
            origin = ErrorBankOrigins.SIMULACRO
        ),
        FailedQuestion(
            id = "err_qui_04",
            subject = "Química",
            subtema = "Tabla Periódica",
            question = "¿Cuál de los siguientes elementos presenta la mayor electronegatividad según la escala de Pauling?",
            options = listOf("Cloro", "Oxígeno", "Flúor", "Nitrógeno", "Bromo"),
            correctAnswerIndex = 2,
            explanation = "El flúor (F) es el elemento más electronegativo de la tabla periódica con un valor aproximado de 4.0 en la escala de Pauling.",
            origin = ErrorBankOrigins.EXAMEN_RAPIDO
        ),
        FailedQuestion(
            id = "err_hist_06",
            subject = "Historia",
            subtema = "Horizonte Temprano",
            question = "¿Cuál fue la cultura matriz del formativo andino destacada por su arte lítico (Lanzón Monolítico, Cabezas Clavas)?",
            options = listOf("Paracas", "Chavín", "Moche", "Tiahuanaco", "Chimú"),
            correctAnswerIndex = 1,
            explanation = "La cultura Chavín, descubierta por Julio C. Tello (considerada por él como la cultura matriz andina), destacó por su arquitectura y litoescultura en Chavín de Huántar.",
            origin = ErrorBankOrigins.EXAMEN_RAPIDO
        )
    )

    private val _errors = MutableStateFlow<List<FailedQuestion>>(defaultCuratedErrors)
    val errors: StateFlow<List<FailedQuestion>> = _errors.asStateFlow()

    fun addFailedQuestion(failedQuestion: FailedQuestion) {
        val current = _errors.value.toMutableList()
        if (current.none { it.id == failedQuestion.id || it.question == failedQuestion.question }) {
            current.add(0, failedQuestion)
            _errors.value = current
        }
    }

    fun markAsSolved(id: String) {
        _errors.value = _errors.value.map {
            if (it.id == id) it.copy(isSolved = true) else it
        }
    }

    fun deleteError(id: String) {
        _errors.value = _errors.value.filterNot { it.id == id }
    }

    fun getUnsolvedCount(): Int = _errors.value.count { !it.isSolved }

    fun getUnsolvedCountByOrigin(origin: String): Int = _errors.value.count { !it.isSolved && it.origin == origin }
}
