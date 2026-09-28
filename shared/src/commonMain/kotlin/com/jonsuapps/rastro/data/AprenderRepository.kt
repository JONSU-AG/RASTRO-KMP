package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import com.jonsuapps.rastro.model.SubjectConfig

/**
 * Calcula el número de subtema en formato "N.X" (ej. "1.1", "2.3") en runtime.
 * Agrupa por semana y asigna índice relativo dentro del grupo.
 * De esta forma NO hay que editar los catálogos — el subtema se genera automáticamente.
 */
fun List<LessonNode>.withSubtemaIndex(): List<LessonNode> {
    val grouped = this.groupBy { it.semana }
    return this.map { lesson ->
        val posicion = (grouped[lesson.semana]?.indexOf(lesson) ?: 0) + 1
        lesson.copy(subtema = "${lesson.semana}.$posicion")
    }
}

object AprenderRepository {

    val subjects = listOf(
        SubjectConfig(
            id = "raz_matematico",
            name = "Raz. Matemático",
            area = "Aptitud Académica",
            colorHex = "#0284C7",
            description = "Patrones numéricos, magnitudes, razonamiento algebraico intuitivo, geometría intuitiva, combinatoria y probabilidad.",
            asigBanco = "Raz. Matemático",
            mascotTip = "¡Aplica deducción lógica y regularidades antes de operar algebraicamente!"
        ),
        SubjectConfig(
            id = "raz_logico",
            name = "Raz. Lógico",
            area = "Aptitud Académica",
            colorHex = "#0EA5E9",
            description = "Proposiciones, conectores lógicos, inferencias, silogismos categóricos, consistencia y detección de falacias simples.",
            asigBanco = "Raz. Lógico",
            mascotTip = "¡Construye tablas rápidas y busca contradicciones para descartar opciones falsas!"
        ),
        SubjectConfig(
            id = "raz_verbal",
            name = "Raz. Verbal",
            area = "Aptitud Académica",
            colorHex = "#D946EF",
            description = "Relaciones semánticas, analogías, series verbales, lógica de enunciados, pragmática y razonamiento argumentativo.",
            asigBanco = "Raz. Verbal",
            mascotTip = "¡Identifica la relación base en las analogías y el campo semántico dominante!"
        ),
        SubjectConfig(
            id = "comprension_lectora",
            name = "Comp. Lectora",
            area = "Aptitud Académica",
            colorHex = "#A21CAF",
            description = "Comprensión literal, inferencial, global y crítica; intención comunicativa, coherencia y tipologías textuales.",
            asigBanco = "Comp. Lectora",
            mascotTip = "¡Diferencia siempre la idea principal explícita de las inferencias obligatorias del autor!"
        ),
        SubjectConfig(
            id = "aritmetica",
            name = "Aritmética",
            area = "Matemática",
            colorHex = "#2563EB",
            description = "Conjuntos, divisibilidad en N, números primos, MCD/MCM, Z, Q, razones, magnitudes, porcentajes, combinatoria y probabilidad.",
            asigBanco = "Aritmética",
            mascotTip = "¡El algoritmo de Euclides para MCD y los criterios de divisibilidad te ahorrarán minutos clave!"
        ),
        SubjectConfig(
            id = "algebra",
            name = "Álgebra",
            area = "Matemática",
            colorHex = "#3B82F6",
            description = "Números reales, polinomios, productos notables, división algebraica, factorización, ecuaciones, inecuaciones, sistemas y funciones.",
            asigBanco = "Álgebra",
            mascotTip = "¡Recuerda el teorema del residuo y las propiedades del discriminante en ecuaciones cuadráticas!"
        ),
        SubjectConfig(
            id = "geometria",
            name = "Geometría",
            area = "Matemática",
            colorHex = "#0D9488",
            description = "Ángulos, triángulos, congruencia, semejanza, teoremas fundamentales, polígonos, circunferencias, áreas, geometría espacial y analítica.",
            asigBanco = "Geometría",
            mascotTip = "¡Traza líneas auxiliares (alturas, bisectrices o medianas) para formar triángulos rectángulos notables!"
        ),
        SubjectConfig(
            id = "trigonometria",
            name = "Trigonometría",
            area = "Matemática",
            colorHex = "#06B6D4",
            description = "Sistemas angulares, razones trigonométricas en triángulos rectángulos, posición normal, identidades, compuestos, ecuaciones y oblicuángulos.",
            asigBanco = "Trigonometría",
            mascotTip = "¡Domina la circunferencia trigonométrica y la ley de senos/cosenos para cualquier triángulo oblicuángulo!"
        ),
        SubjectConfig(
            id = "historia_universal",
            name = "Historia Universal",
            area = "Ciencias Sociales",
            colorHex = "#EA580C",
            description = "Hominización, primeras civilizaciones fluviales, antigüedad clásica (Grecia y Roma), Edad Media, Edad Moderna y contemporaneidad.",
            asigBanco = "Historia Universal",
            mascotTip = "¡Ubica siempre los procesos históricos en sus coordenadas de causa estructural y consecuencia directa!"
        ),
        SubjectConfig(
            id = "historia_peru",
            name = "Historia del Perú",
            area = "Ciencias Sociales",
            colorHex = "#F97316",
            description = "Poblamiento americano, altas culturas preíncas, Tahuantinsuyo, Conquista, Virreinato, Emancipación y República de los siglos XIX al XXI.",
            asigBanco = "Historia del Perú",
            mascotTip = "¡Ten clara la secuencia de horizontes e intermedios de John Rowe y las reformas borbónicas del siglo XVIII!"
        ),
        SubjectConfig(
            id = "geografia",
            name = "Geografía",
            area = "Ciencias Sociales",
            colorHex = "#84CC16",
            description = "Geodesia, cartografía, geósfera, 8 regiones naturales, 11 ecorregiones, hidrografía, clima, demografía y desarrollo sostenible.",
            asigBanco = "Geografía",
            mascotTip = "¡Aprende las 8 regiones de Javier Pulgar Vidal con sus altitudes, climas y toponimias características!"
        ),
        SubjectConfig(
            id = "quimica",
            name = "Química",
            area = "Ciencia y Tecnología",
            colorHex = "#14B8A6",
            description = "Estructura atómica, tabla periódica, enlace químico, nomenclatura inorgánica, estequiometría, gases, soluciones, equilibrio, pH y química orgánica.",
            asigBanco = "Química",
            mascotTip = "¡Enlace iónico vs covalente por diferencia de electronegatividad, y balance de masa en estequiometría!"
        ),
        SubjectConfig(
            id = "biologia",
            name = "Biología",
            area = "Ciencia y Tecnología",
            colorHex = "#10B981",
            description = "Bioquímica, citología celular, metabolismo (fotosíntesis/respiración), histología, anatomía humana, genética y ecología.",
            asigBanco = "Biología",
            mascotTip = "¡Citología y genética mendeliana representan los puntos más disputados en el examen de admisión!"
        ),
        SubjectConfig(
            id = "fisica",
            name = "Física",
            area = "Ciencia y Tecnología",
            colorHex = "#EAB308",
            description = "Vectores, cinemática, dinámica, estática, trabajo, energía, termología, fluidos, electricidad, electromagnetismo y física moderna.",
            asigBanco = "Física",
            mascotTip = "¡Dibuja siempre tu Diagrama de Cuerpo Libre (DCL) antes de aplicar las Leyes de Newton o condiciones de equilibrio!"
        ),
        SubjectConfig(
            id = "psicologia",
            name = "Psicología",
            area = "Persona y Familia",
            colorHex = "#6366F1",
            description = "Proyecto de vida, procesos cognitivos (memoria, percepción, pensamiento), afectividad, personalidad, aprendizaje y desarrollo humano.",
            asigBanco = "Psicología",
            mascotTip = "¡Identifica si la pregunta aborda memoria episódica, semántica o procedimental, y las teorías del aprendizaje!"
        ),
        SubjectConfig(
            id = "filosofia",
            name = "Filosofía",
            area = "Persona y Familia",
            colorHex = "#8B5CF6",
            description = "Disciplinas filosóficas, gnoseología, epistemología, ética, historia del pensamiento antiguo, moderno, contemporáneo y peruano.",
            asigBanco = "Filosofía",
            mascotTip = "¡Distingue con claridad Gnoseología (conocimiento general) de Epistemología (conocimiento científico)!"
        ),
        SubjectConfig(
            id = "civica",
            name = "Ed. Cívica",
            area = "Persona y Familia",
            colorHex = "#EC4899",
            description = "Derechos humanos, Constitución de 1993, garantías constitucionales, poderes del Estado, organismos autónomos y derecho universitario.",
            asigBanco = "Ed. Cívica",
            mascotTip = "¡Garantías constitucionales (Habeas Corpus, Amparo, Habeas Data) e instituciones del sistema electoral (JNE, ONPE, RENIEC)!"
        ),
        SubjectConfig(
            id = "lenguaje",
            name = "Lenguaje",
            area = "Comunicación",
            colorHex = "#F43F5E",
            description = "Funciones del lenguaje, realidad lingüística, fonología, acentuación, morfología, sintaxis oracional, normativa y semántica.",
            asigBanco = "Lenguaje",
            mascotTip = "¡Atención a la tildación diacrítica (el, tu, mi, te, se, si, de, mas) y a la concordancia entre sujeto y núcleo verbal!"
        ),
        SubjectConfig(
            id = "literatura",
            name = "Literatura",
            area = "Comunicación",
            colorHex = "#9333EA",
            description = "Géneros y figuras retóricas, literatura universal, española, hispanoamericana, peruana, regional y análisis monográfico de obras cumbres.",
            asigBanco = "Literatura",
            mascotTip = "¡Relaciona cada autor y obra con su corriente estética, contexto social y conflicto argumental central!"
        ),
        SubjectConfig(
            id = "ingles",
            name = "Inglés",
            area = "Comunicación",
            colorHex = "#3B82F6",
            description = "Reading comprehension en contextos cotidianos, tiempos verbales simples y continuos, modales, preposiciones y conectores.",
            asigBanco = "Inglés",
            mascotTip = "¡Busca palabras clave y conectores lógicos (because, however, although) para anticipar el sentido del texto!"
        )
    )

    fun getSubjectById(id: String): SubjectConfig? {
        val normalized = normalizeSubjectId(id)
        return subjects.firstOrNull { it.id.equals(normalized, ignoreCase = true) }
            ?: subjects.firstOrNull { it.id.equals(id, ignoreCase = true) }
    }

    fun getSampleLessonsForSubject(subjectId: String): List<LessonNode> =
        LearningPathCatalog.forSubject(normalizeSubjectId(subjectId))
            .sortedWith(compareBy({ it.semana }, { it.id }))
            .withSubtemaIndex()

    fun getLessonsForSubject(subjectId: String): List<LessonNode> = getSampleLessonsForSubject(subjectId)

    val totalLessonsCount: Int get() = LearningPathCatalog.lessons.size
    val totalChallengesCount: Int get() = LearningPathCatalog.lessons.sumOf { it.challenges.size }

    fun getLessonById(lessonId: String): LessonNode? = LearningPathCatalog.byId(lessonId)

    fun normalizeSubjectId(subjectId: String): String = when (subjectId.lowercase().trim()) {
        "civica", "cívica", "ed. cívica y ciudadanía", "ed. cívica" -> "civica"
        "raz. lógico", "raz_logico", "razonamiento lógico" -> "raz_logico"
        "raz. matemático", "raz_matematico", "razonamiento matemático" -> "raz_matematico"
        "raz. verbal", "raz_verbal", "razonamiento verbal" -> "raz_verbal"
        "comp. lectora", "comprension_lectora", "comprensión lectora" -> "comprension_lectora"
        "aritmetica", "aritmética" -> "aritmetica"
        "algebra", "álgebra" -> "algebra"
        "geometria", "geometría" -> "geometria"
        "trigonometria", "trigonometría" -> "trigonometria"
        "historia universal", "historia_universal" -> "historia_universal"
        "historia del perú", "historia del peru", "historia_peru" -> "historia_peru"
        "historia" -> "historia_universal" // Alias por compatibilidad
        "matematica", "matemática" -> "algebra" // Alias por compatibilidad
        "inglés", "ingles" -> "ingles"
        else -> subjectId.lowercase().trim().replace(" ", "_")
    }
}
