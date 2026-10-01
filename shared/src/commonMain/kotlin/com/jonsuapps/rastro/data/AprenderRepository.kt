package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory
import com.jonsuapps.rastro.model.SubjectConfig
import com.jonsuapps.rastro.data.content.JsonContentLoader
import com.jonsuapps.rastro.data.content.ContentLoader
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json

/**
 * Asigna el número de subtema en formato "N.X" (ej. "1.1", "2.3") en runtime
 * ÚNICAMENTE si la lección no posee ya una numeración jerárquica explícita (ej. "1.1.1", "1.1.2", "1.1").
 * Preserva intacta cualquier numeración personalizada definida en los catálogos.
 */
fun List<LessonNode>.withSubtemaIndex(): List<LessonNode> {
    val grouped = this.groupBy { it.semana }
    return this.map { lesson ->
        val raw = lesson.subtema.trim()
        val hasExplicitSubtema = raw.isNotBlank() &&
            !raw.startsWith("Semana", ignoreCase = true) &&
            raw.contains(Regex("""\d+\.\d+"""))

        if (hasExplicitSubtema) {
            lesson
        } else {
            val posicion = (grouped[lesson.semana]?.indexOf(lesson) ?: 0) + 1
            lesson.copy(subtema = "${lesson.semana}.$posicion")
        }
    }
}

object AprenderRepository {

    // Loader para contenido nuevo (JSON + Markdown en resources).
    private val defaultLoader: ContentLoader = JsonContentLoader(
        json = Json { ignoreUnknownKeys = true; isLenient = true }
    )

    /** Solo tests: permite inyectar un loader con otra fuente de bytes. */
    internal var testLoaderOverride: ContentLoader? = null

    private val contentLoader: ContentLoader get() = testLoaderOverride ?: defaultLoader

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

    val totalLessonsCount: Int get() = LearningPathCatalog.lessons.size
    val totalChallengesCount: Int get() = LearningPathCatalog.lessons.sumOf { it.challenges.size }

    fun getSubjectById(id: String): SubjectConfig? {
        val normalized = normalizeSubjectId(id)
        return subjects.firstOrNull { it.id.equals(normalized, ignoreCase = true) }
            ?: subjects.firstOrNull { it.id.equals(id, ignoreCase = true) }
    }

    suspend fun getSampleLessonsForSubject(subjectId: String): List<LessonNode> {
        if (subjectId == "biologia") {
            // Para Biología: contenido nuevo (semana 8+) + legacy (semanas 1-7)
            val legacy = LearningPathCatalog.forSubject(normalizeSubjectId(subjectId))
                .filter { it.semana <= 7 }
            val nuevo = contentLoader.loadSubjectLessons(subjectId)
                .filter { it.semana >= 8 }
            return (legacy + nuevo).sortedWith(compareBy({ it.semana }, { it.id })).withSubtemaIndex()
        } else if (subjectId == "lenguaje" || subjectId == "literatura" || subjectId == "psicologia") {
            // Google (mismo sistema genérico que Biología): legacy solo en las semanas
            // aún no cubiertas por el contenido nuevo; al completar todas las semanas
            // el legacy queda excluido sin duplicar. Sin cross-subject fallback.
            // NOTA §15: se mantiene lista explícita por materia (sin refactor genérico
            // global) para no alterar el comportamiento de las 17 materias legacy.
            val nuevo = contentLoader.loadSubjectLessons(subjectId)
            val nuevoWeeks = nuevo.map { it.semana }.toSet()
            val legacy = LearningPathCatalog.forSubject(normalizeSubjectId(subjectId))
                .filter { it.semana !in nuevoWeeks }
            return (legacy + nuevo).sortedWith(compareBy({ it.semana }, { it.id })).withSubtemaIndex()
        } else {
            return LearningPathCatalog.forSubject(normalizeSubjectId(subjectId))
                .sortedWith(compareBy({ it.semana }, { it.id }))
                .withSubtemaIndex()
        }
    }

    fun getLessonsForSubjectSync(subjectId: String): List<LessonNode> = runBlocking {
        getSampleLessonsForSubject(subjectId)
    }

    suspend fun getLessonsForSubject(subjectId: String): List<LessonNode> = getSampleLessonsForSubject(subjectId)

    suspend fun getLessonById(lessonId: String): LessonNode? {
        // Contenido nuevo primero para Biología semana 8+ (reemplaza al legacy 8.x);
        // si el loader falla, cae al catálogo legacy (FAIL LOCAL, sin contaminar).
        Regex("""bio_t(\d+)_s(\d+)""").matchEntire(lessonId)?.let { m ->
            val week = m.groupValues[1].toIntOrNull() ?: 0
            if (week >= 8) {
                val subtopic = "$week.${m.groupValues[2].toIntOrNull() ?: 0}"
                try {
                    return contentLoader.loadLesson("biologia", week, subtopic).lesson
                } catch (_: Exception) {
                    // cae a legacy abajo
                }
            }
        }
        // Contenido nuevo primero para Lenguaje (IDs leng_tWW_sNN del piloto Google);
        // si el loader falla, cae al catálogo legacy (FAIL LOCAL, sin contaminar).
        // Los IDs legacy (len_tWW_sSS) no coinciden con este regex: sin colisión.
        Regex("""leng_t(\d+)_s(\d+)""").matchEntire(lessonId)?.let { m ->
            val week = m.groupValues[1].toIntOrNull() ?: 0
            val subtopic = "$week.${m.groupValues[2].toIntOrNull() ?: 0}"
            try {
                return contentLoader.loadLesson("lenguaje", week, subtopic).lesson
            } catch (_: Exception) {
                // cae a legacy abajo
            }
        }
        // Contenido nuevo primero para Literatura Google (IDs lit_tWW_sNN);
        // si el loader falla, cae al catálogo legacy (FAIL LOCAL, sin contaminar).
        // Legacy comparte prefijo lit_: lit_t01_s01/s02 resuelven al nuevo (reemplazo
        // intencional, igual que bio 8.1); lit_t01_s03/s04 caen a legacy (sin 1.3/1.4 nuevo).
        Regex("""lit_t(\d+)_s(\d+)""").matchEntire(lessonId)?.let { m ->
            val week = m.groupValues[1].toIntOrNull() ?: 0
            val subtopic = "$week.${m.groupValues[2].toIntOrNull() ?: 0}"
            try {
                return contentLoader.loadLesson("literatura", week, subtopic).lesson
            } catch (_: Exception) {
                // cae a legacy abajo
            }
        }
        // Contenido nuevo primero para Psicología Google (IDs psi_tWW_sNN);
        // si el loader falla, cae al catálogo legacy (FAIL LOCAL, sin contaminar).
        // Legacy comparte prefijo psi_: reemplazo intencional igual que bio 8.1/lit_.
        Regex("""psi_t(\d+)_s(\d+)""").matchEntire(lessonId)?.let { m ->
            val week = m.groupValues[1].toIntOrNull() ?: 0
            val subtopic = "$week.${m.groupValues[2].toIntOrNull() ?: 0}"
            try {
                return contentLoader.loadLesson("psicologia", week, subtopic).lesson
            } catch (_: Exception) {
                // cae a legacy abajo
            }
        }
        return LearningPathCatalog.byId(lessonId)
    }

    fun getLessonByIdSync(lessonId: String): LessonNode? = runBlocking {
        getLessonById(lessonId)
    }
}
