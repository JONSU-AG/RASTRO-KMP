package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.model.AreaAdmision
import com.jonsuapps.rastro.model.CareerCutoff
import com.jonsuapps.rastro.model.ExamEvaluationResult
import com.jonsuapps.rastro.model.ExamQuestion
import com.jonsuapps.rastro.model.FlashcardItem
import com.jonsuapps.rastro.model.PonderacionAsignatura
import com.jonsuapps.rastro.model.QuestionEvaluationDetail
import kotlin.math.roundToInt
import kotlin.random.Random

object SimuladorRepository {

    val ponderacionesSociales = listOf(
        PonderacionAsignatura("Aptitud Académica", "Raz. Lógico", 4, 1.1242),
        PonderacionAsignatura("Aptitud Académica", "Raz. Matemático", 5, 1.1007),
        PonderacionAsignatura("Aptitud Académica", "Raz. Verbal", 4, 1.1242),
        PonderacionAsignatura("Aptitud Académica", "Comp. Lectora", 5, 1.1007),
        PonderacionAsignatura("Matemática", "Álgebra", 3, 0.8246),
        PonderacionAsignatura("Matemática", "Aritmética", 3, 0.8241),
        PonderacionAsignatura("Matemática", "Geometría", 3, 0.8250),
        PonderacionAsignatura("Matemática", "Trigonometría", 3, 0.8596),
        PonderacionAsignatura("Ciencias Sociales", "Historia", 8, 1.7747),
        PonderacionAsignatura("Ciencias Sociales", "Geografía", 5, 1.7604),
        PonderacionAsignatura("Ciencia y Tecnología", "Química", 3, 1.1093),
        PonderacionAsignatura("Ciencia y Tecnología", "Biología", 3, 1.1469),
        PonderacionAsignatura("Ciencia y Tecnología", "Física", 3, 1.0771),
        PonderacionAsignatura("Persona y Familia", "Filosofía", 3, 0.8879),
        PonderacionAsignatura("Persona y Familia", "Psicología", 5, 0.9345),
        PonderacionAsignatura("Persona y Familia", "Ed. Cívica", 3, 0.8879),
        PonderacionAsignatura("Comunicación", "Lenguaje", 8, 1.7015),
        PonderacionAsignatura("Comunicación", "Literatura", 5, 1.6775),
        PonderacionAsignatura("Idioma Extranjero", "Lectura", 2, 1.2587),
        PonderacionAsignatura("Idioma Extranjero", "Gramática", 2, 1.2413)
    )

    val ponderacionesIngenierias = listOf(
        PonderacionAsignatura("Aptitud Académica", "Raz. Lógico", 4, 1.1242),
        PonderacionAsignatura("Aptitud Académica", "Raz. Matemático", 5, 1.1007),
        PonderacionAsignatura("Aptitud Académica", "Raz. Verbal", 4, 1.1242),
        PonderacionAsignatura("Aptitud Académica", "Comp. Lectora", 5, 1.1007),
        PonderacionAsignatura("Matemática", "Álgebra", 4, 1.6583),
        PonderacionAsignatura("Matemática", "Aritmética", 4, 1.6583),
        PonderacionAsignatura("Matemática", "Geometría", 4, 1.6588),
        PonderacionAsignatura("Matemática", "Trigonometría", 3, 1.6995),
        PonderacionAsignatura("Ciencias Sociales", "Historia", 4, 1.2899),
        PonderacionAsignatura("Ciencias Sociales", "Geografía", 4, 1.2101),
        PonderacionAsignatura("Ciencia y Tecnología", "Química", 6, 1.4254),
        PonderacionAsignatura("Ciencia y Tecnología", "Biología", 5, 1.1547),
        PonderacionAsignatura("Ciencia y Tecnología", "Física", 7, 1.5248),
        PonderacionAsignatura("Persona y Familia", "Filosofía", 3, 0.7987),
        PonderacionAsignatura("Persona y Familia", "Psicología", 4, 0.8019),
        PonderacionAsignatura("Persona y Familia", "Ed. Cívica", 3, 0.7987),
        PonderacionAsignatura("Comunicación", "Lenguaje", 4, 1.0214),
        PonderacionAsignatura("Comunicación", "Literatura", 3, 0.9714),
        PonderacionAsignatura("Idioma Extranjero", "Lectura", 2, 1.2587),
        PonderacionAsignatura("Idioma Extranjero", "Gramática", 2, 1.2413)
    )

    val ponderacionesBiomedicas = listOf(
        PonderacionAsignatura("Aptitud Académica", "Raz. Lógico", 4, 1.1242),
        PonderacionAsignatura("Aptitud Académica", "Raz. Matemático", 5, 1.1007),
        PonderacionAsignatura("Aptitud Académica", "Raz. Verbal", 4, 1.1242),
        PonderacionAsignatura("Aptitud Académica", "Comp. Lectora", 5, 1.1007),
        PonderacionAsignatura("Matemática", "Álgebra", 3, 1.2654),
        PonderacionAsignatura("Matemática", "Aritmética", 3, 1.2654),
        PonderacionAsignatura("Matemática", "Geometría", 3, 1.2654),
        PonderacionAsignatura("Matemática", "Trigonometría", 3, 1.2037),
        PonderacionAsignatura("Ciencias Sociales", "Historia", 5, 1.1235),
        PonderacionAsignatura("Ciencias Sociales", "Geografía", 4, 1.0956),
        PonderacionAsignatura("Ciencia y Tecnología", "Química", 6, 1.6847),
        PonderacionAsignatura("Ciencia y Tecnología", "Biología", 9, 1.9451),
        PonderacionAsignatura("Ciencia y Tecnología", "Física", 5, 1.4771),
        PonderacionAsignatura("Persona y Familia", "Filosofía", 3, 0.7987),
        PonderacionAsignatura("Persona y Familia", "Psicología", 4, 0.8019),
        PonderacionAsignatura("Persona y Familia", "Ed. Cívica", 3, 0.7987),
        PonderacionAsignatura("Comunicación", "Lenguaje", 4, 1.0214),
        PonderacionAsignatura("Comunicación", "Literatura", 3, 0.9714),
        PonderacionAsignatura("Idioma Extranjero", "Lectura", 2, 1.2587),
        PonderacionAsignatura("Idioma Extranjero", "Gramática", 2, 1.2413)
    )

    fun getPonderaciones(area: AreaAdmision): List<PonderacionAsignatura> {
        return when (area) {
            AreaAdmision.BIOMEDICAS -> ponderacionesBiomedicas
            AreaAdmision.INGENIERIAS -> ponderacionesIngenierias
            AreaAdmision.SOCIALES -> ponderacionesSociales
        }
    }

    fun generateOfficialSimulacro80(
        questionBank: List<ExamQuestion>,
        area: AreaAdmision,
        orderPreference: String,
        seed: Int
    ): List<ExamQuestion> {
        val random = Random(seed)
        val usedIds = mutableSetOf<String>()
        val selected = mutableListOf<ExamQuestion>()

        getPonderaciones(area).forEach { rule ->
            val target = normalizeExamSubject(rule.asignatura)
            val primary = questionBank.filter { normalizeExamSubject(it.asignatura.ifBlank { it.curso }) == target }
            val aliases = when (target) {
                "aritmetica", "geometria", "trigonometria" -> listOf("algebra", "raz matematico")
                "comp lectora" -> listOf("raz verbal", "lectura")
                "gramatica" -> listOf("lenguaje", "lectura")
                "lectura" -> listOf("gramatica", "lenguaje")
                else -> emptyList()
            }
            val expanded = (primary + aliases.flatMap { alias ->
                questionBank.filter { normalizeExamSubject(it.asignatura.ifBlank { it.curso }) == alias }
            }).distinctBy { it.id }
            val available = (expanded.filterNot { it.id in usedIds } + questionBank.filterNot { it.id in usedIds })
                .distinctBy { it.id }
            val picked = available.shuffled(random).take(rule.preguntas)
            picked.forEach { question ->
                usedIds += question.id
                selected += question.copy(
                    asignatura = rule.asignatura,
                    curso = rule.curso,
                    area = area.label,
                    valorPonderado = rule.valor
                )
            }
        }

        val ordered = when (orderPreference.lowercase()) {
            "letras primero" -> selected.sortedBy { question ->
                when {
                    question.curso.contains("comunicación", true) || question.curso.contains("sociales", true) || question.curso.contains("persona", true) -> 1
                    question.curso.contains("aptitud", true) -> 2
                    question.curso.contains("ciencia", true) -> 3
                    question.curso.contains("matemática", true) -> 4
                    else -> 5
                }
            }
            "ciencias primero" -> selected.sortedBy { question ->
                when {
                    question.curso.contains("ciencia", true) || question.curso.contains("matemática", true) -> 1
                    question.curso.contains("aptitud", true) -> 2
                    question.curso.contains("comunicación", true) || question.curso.contains("sociales", true) || question.curso.contains("persona", true) -> 3
                    else -> 4
                }
            }
            "aleatorio" -> selected.shuffled(random)
            else -> selected
        }
        return ordered
    }

    private fun normalizeExamSubject(value: String): String = buildString {
        value.trim().lowercase().forEach { character ->
            append(when (character) {
                'á' -> 'a'; 'é' -> 'e'; 'í' -> 'i'; 'ó' -> 'o'; 'ú' -> 'u'; 'ü' -> 'u'
                '.' -> ' '; else -> character
            })
        }
    }.replace(Regex("\\s+"), " ").trim()

    val carrerasUNSACortes = listOf(
        CareerCutoff("Medicina Humana", AreaAdmision.BIOMEDICAS, 87.5420, 96.8200, 32),
        CareerCutoff("Enfermería", AreaAdmision.BIOMEDICAS, 72.1100, 81.4500, 50),
        CareerCutoff("Biología", AreaAdmision.BIOMEDICAS, 68.3200, 76.8000, 45),
        CareerCutoff("Nutrición Humana", AreaAdmision.BIOMEDICAS, 69.4500, 78.2000, 40),
        CareerCutoff("Ingeniería de Sistemas", AreaAdmision.INGENIERIAS, 82.1500, 92.4000, 40),
        CareerCutoff("Ingeniería Civil", AreaAdmision.INGENIERIAS, 84.3000, 94.1000, 45),
        CareerCutoff("Ingeniería Mecánica", AreaAdmision.INGENIERIAS, 75.8000, 85.2000, 40),
        CareerCutoff("Ingeniería Industrial", AreaAdmision.INGENIERIAS, 81.2000, 89.9000, 50),
        CareerCutoff("Derecho", AreaAdmision.SOCIALES, 83.4500, 93.1200, 60),
        CareerCutoff("Psicología", AreaAdmision.SOCIALES, 76.5000, 84.9000, 45),
        CareerCutoff("Administración", AreaAdmision.SOCIALES, 74.2000, 82.6000, 65),
        CareerCutoff("Contabilidad", AreaAdmision.SOCIALES, 72.9000, 80.5000, 70),
        CareerCutoff("Ciencias de la Comunicación", AreaAdmision.SOCIALES, 71.1000, 79.4000, 40)
    )

    fun calculateScore(
        questions: List<ExamQuestion>,
        userAnswers: Map<Int, Int>,
        area: AreaAdmision
    ): ExamEvaluationResult {
        var correctCount = 0
        var wrongCount = 0
        var blankCount = 0

        val aciertosPorAsignatura = mutableMapOf<String, Int>()
        val totalPorAsignatura = mutableMapOf<String, Int>()
        val details = mutableListOf<QuestionEvaluationDetail>()

        val ponderaciones = getPonderaciones(area).associateBy { it.asignatura }

        questions.forEachIndexed { idx, q ->
            val userChoice = userAnswers[idx]
            val isBlank = userChoice == null
            val isCorrect = !isBlank && userChoice == q.answer

            val asig = q.asignatura
            totalPorAsignatura[asig] = (totalPorAsignatura[asig] ?: 0) + 1

            if (isCorrect) {
                aciertosPorAsignatura[asig] = (aciertosPorAsignatura[asig] ?: 0) + 1
                correctCount++
            } else if (isBlank) {
                blankCount++
            } else {
                wrongCount++
            }

            val peso = q.valorPonderado ?: ponderaciones[asig]?.valor ?: (100.0 / questions.size)

            details.add(
                QuestionEvaluationDetail(
                    question = q.q,
                    options = q.options,
                    userChoice = userChoice,
                    correctChoice = q.answer,
                    isCorrect = isCorrect,
                    isBlank = isBlank,
                    explanation = q.explanation,
                    asignatura = asig,
                    valorPonderado = peso
                )
            )
        }

        var unsaWeightedScore = 0.0
        details.forEach { d ->
            if (d.isCorrect) {
                unsaWeightedScore += d.valorPonderado
            }
        }

        if (unsaWeightedScore > 100.0) unsaWeightedScore = 100.0
        // Redondear a 4 decimales exactos según el estándar oficial UNSA
        unsaWeightedScore = (unsaWeightedScore * 10000.0).roundToInt() / 10000.0

        val percentage = if (questions.isNotEmpty()) (correctCount * 100) / questions.size else 0

        return ExamEvaluationResult(
            totalPreguntas = questions.size,
            correctCount = correctCount,
            wrongCount = wrongCount,
            blankCount = blankCount,
            unsaWeightedScore = unsaWeightedScore,
            percentage = percentage,
            aciertosPorAsignatura = aciertosPorAsignatura,
            totalPorAsignatura = totalPorAsignatura,
            details = details
        )
    }

    val defaultFlashcards = listOf(
        FlashcardItem("1", "¿En qué organelo celular se produce la mayor cantidad de ATP?", "Mitocondria (respiración celular y fosforilación oxidativa)", "Biología"),
        FlashcardItem("2", "¿Quién formuló la Teoría de la Relatividad Especial (1905) y General (1915)?", "Albert Einstein", "Física"),
        FlashcardItem("3", "¿Cuál era la capital y sede sagrada central del Imperio Incaico?", "Cusco (ombligo del mundo)", "Historia"),
        FlashcardItem("4", "¿Cuál es el gas más abundante en la atmósfera terrestre (~78%)?", "Nitrógeno (N₂)", "Química"),
        FlashcardItem("5", "¿Quién escribió el célebre poemario 'Los Heraldos Negros' (1918)?", "César Vallejo", "Literatura"),
        FlashcardItem("6", "¿Cuál es la unidad anatómica y funcional del riñón?", "Nefrona", "Biología"),
        FlashcardItem("7", "¿Quién es considerado el padre del Racionalismo moderno ('Pienso, luego existo')?", "René Descartes", "Filosofía"),
        FlashcardItem("8", "¿En qué capa de la atmósfera se producen los fenómenos climáticos y meteorológicos?", "Troposfera (hasta ~12 km)", "Geografía"),
        FlashcardItem("9", "¿Cuál es la unidad estructural y funcional del sistema nervioso?", "Neurona", "Biología"),
        FlashcardItem("10", "¿Qué filósofo propuso el método inductivo y la crítica a los ídolos en el 'Novum Organum'?", "Francis Bacon", "Filosofía"),
        FlashcardItem("11", "¿Cuál es el símbolo químico oficial y número atómico del oro?", "Au (Z = 79)", "Química"),
        FlashcardItem("12", "¿Cómo se llama la división celular que reduce los cromosomas a la mitad para formar gametos?", "Meiosis (fases I y II)", "Biología"),
        FlashcardItem("13", "¿Cuál es la fuerza universal de atracción entre cuerpos debida a sus masas?", "Gravedad (Ley de Gravitación Universal de Newton)", "Física"),
        FlashcardItem("14", "¿Qué cultura preínca destacó por las trepanaciones craneanas y los mantos funerarios polícromos?", "Cultura Paracas (Paracas Cavernas y Necrópolis)", "Historia"),
        FlashcardItem("15", "¿Cuál es el lago navegable más alto del mundo ubicado en la meseta del Collao?", "Lago Titicaca (3812 m s.n.m.)", "Geografía")
    )

    val sampleExamQuestions = listOf(
        ExamQuestion(
            id = "pre_bio_1",
            q = "En la anatomía humana, ¿cuál es el hueso más largo y resistente del cuerpo?",
            options = listOf("Fémur", "Tibia", "Húmero", "Peroné", "Radio"),
            answer = 0,
            asignatura = "Biología",
            curso = "Ciencia y Tecnología",
            area = "Biomédicas",
            explanation = "El fémur es el hueso del muslo, siendo el más largo, fuerte y voluminoso del cuerpo humano."
        ),
        ExamQuestion(
            id = "pre_lit_2",
            q = "¿Cuál es la obra cumbre vanguardista del poeta peruano César Vallejo publicada en 1922?",
            options = listOf("Los Heraldos Negros", "Trilce", "Poemas Humanos", "España, aparta de mí este cáliz", "Tungsteno"),
            answer = 1,
            asignatura = "Literatura",
            curso = "Comunicación",
            area = "Sociales",
            explanation = "Trilce (1922) quebranta la sintaxis tradicional y es la cumbre vanguardista hispanoamericana."
        ),
        ExamQuestion(
            id = "pre_fis_3",
            q = "Un móvil parte del reposo y acelera a razón constante de 4 m/s² durante 5 segundos. Calcule la distancia recorrida.",
            options = listOf("20 m", "40 m", "50 m", "80 m", "100 m"),
            answer = 2,
            asignatura = "Física",
            curso = "Ciencia y Tecnología",
            area = "Ingenierías",
            explanation = "d = v0 · t + 1/2 · a · t² = 0 + 1/2 · 4 · (5)² = 2 · 25 = 50 m."
        ),
        ExamQuestion(
            id = "pre_qui_4",
            q = "¿Cuál es el número de oxidación del azufre en el ácido sulfúrico (H₂SO₄)?",
            options = listOf("+2", "+4", "+6", "-2", "0"),
            answer = 2,
            asignatura = "Química",
            curso = "Ciencia y Tecnología",
            area = "Biomédicas",
            explanation = "2(+1) + S + 4(-2) = 0 -> +2 + S - 8 = 0 -> S = +6."
        ),
        ExamQuestion(
            id = "pre_civ_5",
            q = "Según la Constitución Política del Perú de 1993, ¿qué garantía protege la libertad individual y derechos conexos?",
            options = listOf("Acción de Amparo", "Habeas Data", "Habeas Corpus", "Acción Popular", "Acción de Cumplimiento"),
            answer = 2,
            asignatura = "Ed. Cívica",
            curso = "Persona y Familia",
            area = "Sociales",
            explanation = "El Hábeas Corpus protege la libertad personal frente a detenciones arbitrarias."
        ),
        ExamQuestion(
            id = "pre_his_6",
            q = "¿Qué inca organizó el Tahuantinsuyo dividiéndolo en cuatro suyos tras vencer a los chancas en 1438?",
            options = listOf("Manco Cápac", "Pachacútec", "Túpac Yupanqui", "Huayna Cápac", "Atahualpa"),
            answer = 1,
            asignatura = "Historia",
            curso = "Ciencias Sociales",
            area = "Sociales",
            explanation = "Pachacútec (Cusi Yupanqui) venció a los chancas e inició la expansión imperial del Tahuantinsuyo."
        ),
        ExamQuestion(
            id = "pre_geo_7",
            q = "¿Qué científico peruano propuso la tesis de las 8 Regiones Naturales del Perú fundamentada en pisos altitudinales?",
            options = listOf("Antonio Brack Egg", "Javier Pulgar Vidal", "Carlos Peñaherrera", "Alexander von Humboldt", "Julio C. Tello"),
            answer = 1,
            asignatura = "Geografía",
            curso = "Ciencias Sociales",
            area = "Sociales",
            explanation = "Javier Pulgar Vidal planteó en 1940 la división en Chala, Yunga, Quechua, Suni, Puna, Janca, Rupa Rupa y Omagua."
        ),
        ExamQuestion(
            id = "pre_fil_8",
            q = "¿Qué disciplina filosófica estudia la naturaleza, origen y límites del conocimiento en general?",
            options = listOf("Ontología", "Axiología", "Gnoseología", "Epistemología", "Ética"),
            answer = 2,
            asignatura = "Filosofía",
            curso = "Persona y Familia",
            area = "Sociales",
            explanation = "La Gnoseología estudia el conocimiento humano general; la Epistemología se enfoca específicamente en el conocimiento científico."
        ),
        ExamQuestion(
            id = "pre_psi_9",
            q = "¿Qué proceso cognitivo permite almacenar, codificar y evocar información y vivencias pasadas?",
            options = listOf("Percepción", "Atención", "Memoria", "Motivación", "Aprendizaje"),
            answer = 2,
            asignatura = "Psicología",
            curso = "Persona y Familia",
            area = "Sociales",
            explanation = "La memoria comprende los procesos de fijación, conservación, evocación, reconocimiento y localización."
        ),
        ExamQuestion(
            id = "pre_len_10",
            q = "En la oración 'Ellas están medio preocupadas por el simulacro', ¿qué función sintáctica cumple la palabra 'medio'?",
            options = listOf("Adjetivo determinativo", "Sustantivo común", "Adverbio de cantidad", "Pronombre indefinido", "Preposición"),
            answer = 2,
            asignatura = "Lenguaje",
            curso = "Comunicación",
            area = "Sociales",
            explanation = "'Medio' modifica al adjetivo 'preocupadas'; al ser adverbio es invariable en género y número (no cambia a media)."
        ),
        ExamQuestion(
            id = "pre_alg_11",
            q = "Si las raíces de la ecuación cuadrática x² - 7x + 12 = 0 son x₁ y x₂, ¿cuál es el valor de x₁ · x₂?",
            options = listOf("7", "-7", "12", "-12", "1"),
            answer = 2,
            asignatura = "Álgebra",
            curso = "Matemática",
            area = "Ingenierías",
            explanation = "Por el Teorema de Cardano-Vieta: suma x1 + x2 = -b/a = 7; producto x1 · x2 = c/a = 12/1 = 12."
        ),
        ExamQuestion(
            id = "pre_ari_12",
            q = "¿Qué tanto por ciento de 80 representa el número 20?",
            options = listOf("15%", "20%", "25%", "30%", "40%"),
            answer = 2,
            asignatura = "Aritmética",
            curso = "Matemática",
            area = "Ingenierías",
            explanation = "Regla 'ES sobre DE': (20 / 80) · 100% = 1/4 · 100% = 25%."
        ),
        ExamQuestion(
            id = "pre_geo_13",
            q = "¿Cuánto suma la medida de los ángulos internos de un hexágono convexo?",
            options = listOf("360°", "540°", "720°", "900°", "1080°"),
            answer = 2,
            asignatura = "Geometría",
            curso = "Matemática",
            area = "Ingenierías",
            explanation = "S_i = 180° · (n - 2). Para hexágono n = 6: S_i = 180° · (6 - 2) = 180° · 4 = 720°."
        ),
        ExamQuestion(
            id = "pre_tri_14",
            q = "En un triángulo rectángulo donde el cateto opuesto mide 3 y el cateto adyacente 4, ¿cuál es el valor del Coseno?",
            options = listOf("3/5", "4/5", "3/4", "4/3", "5/4"),
            answer = 1,
            asignatura = "Trigonometría",
            curso = "Matemática",
            area = "Ingenierías",
            explanation = "Por Pitágoras, la hipotenusa H = √(3² + 4²) = 5. Cos = CA / H = 4 / 5."
        ),
        ExamQuestion(
            id = "pre_ing_15",
            q = "Choose the correct verb form: 'She ________ studying for her university entrance exam right now.'",
            options = listOf("is", "are", "were", "has", "be"),
            answer = 0,
            asignatura = "Gramática",
            curso = "Idioma Extranjero",
            area = "Sociales",
            explanation = "Con tercera persona singular (She) y presente continuo ('right now'), se usa 'is' + verbo en -ing."
        ),
        ExamQuestion(
            id = "pre_rm_16",
            q = "Un reloj da 4 campanadas en 6 segundos. ¿Cuántos segundos demorará en dar 8 campanadas?",
            options = listOf("12 s", "14 s", "16 s", "10 s", "18 s"),
            answer = 1,
            asignatura = "Raz. Matemático",
            curso = "Aptitud Académica",
            area = "Ingenierías",
            explanation = "4 campanadas = 3 intervalos de 2 s cada uno. 8 campanadas = 7 intervalos -> 7 · 2 s = 14 segundos."
        ),
        ExamQuestion(
            id = "pre_rv_17",
            q = "Identifique el término excluido del campo semántico de 'Altruista':",
            options = listOf("Generoso", "Filántropo", "Desprendido", "Egoísta", "Dadivoso"),
            answer = 3,
            asignatura = "Raz. Verbal",
            curso = "Aptitud Académica",
            area = "Sociales",
            explanation = "'Egoísta' es el antónimo del grupo de palabras que comparten el rasgo de generosidad y entrega al prójimo."
        )
    )
}
