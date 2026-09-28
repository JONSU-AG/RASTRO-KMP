package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.model.OrsttyContextSource
import com.jonsuapps.rastro.model.OrsttyMessage

object OrsttyService {

    const val SYSTEM_PROMPT = """
Eres ORSTTY, la inteligencia artificial pedagógica de la app preuniversitaria RASTRO.
Tu misión es orientar con rigor académico, calidez y precisión metodológica a postulantes que se preparan para ingresar a la universidad (CEPREUNSA, Ordinario UNSA, San Marcos, UNI).

Directrices estrictas:
1. Responde siempre en español claro, analítico y motivador.
2. Explica paso a paso cualquier fórmula matemática, física o química, indicando unidades en el Sistema Internacional (S.I.).
3. En humanidades (Filosofía, Historia, Lenguaje, Literatura, Cívica), cita corrientes, autores, obras y contextos históricos precisos sin ambigüedades.
4. Cero emojis en tus explicaciones si distraen la atención. Usa viñetas limpias y formato estructurado.
5. Si el estudiante te consulta sobre un ejercicio, no le des solo la clave final: guíalo con el planteamiento, los datos y el despeje.
6. Mantén siempre una actitud de aliento preuniversitario: perseverancia, disciplina y confianza en el ingreso.
"""

    val defaultChips = listOf(
        "¿Cuáles son las fijas de Biología para Biomédicas?",
        "Explícame las leyes de Newton con ejemplos cotidianos",
        "¿Cómo resolver problemas de estequiometría paso a paso?",
        "Diferencia entre Hábeas Corpus y Acción de Amparo",
        "Técnica para mejorar mi velocidad en Razonamiento Verbal"
    )

    fun getChipsForSource(source: OrsttyContextSource, subject: String?): List<String> {
        return when (source) {
            OrsttyContextSource.SUBJECT_PATH -> listOf(
                "¿Qué temas de $subject vienen más en el examen?",
                "Dame una regla mnemotécnica para $subject",
                "Explícame la teoría de la semana actual de $subject"
            )
            OrsttyContextSource.BIBLIOTECA -> listOf(
                "¿Cuál es el conflicto central de esta obra?",
                "¿Qué simboliza el protagonista?",
                "Preguntas tipo examen sobre esta obra literaria"
            )
            OrsttyContextSource.POMODORO -> listOf(
                "¿Cómo organizar mis repasos de 25 minutos?",
                "Consejo para no distraerme mientras resuelvo simulacros",
                "Técnica de descanso activo entre bloques de estudio"
            )
            OrsttyContextSource.SIMULADOR -> listOf(
                "¿Cómo calcular mi puntaje ponderado de 80 preguntas?",
                "¿Qué orden me conviene seguir: letras o ciencias primero?",
                "¿Cuáles son los puntajes de corte de mi carrera?"
            )
            else -> defaultChips
        }
    }

    val sampleInitialMessages = listOf(
        OrsttyMessage(
            id = "msg_init_1",
            isFromOrstty = true,
            content = "¡Hola! Soy Orstty, tu compañero de preparación preuniversitaria en RASTRO. ¿Qué materia o ejercicio deseas que repasemos hoy?",
            timestamp = 1727350000000L,
            sourceContext = OrsttyContextSource.DIRECT,
            suggestions = defaultChips
        )
    )
}
