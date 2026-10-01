package ingles

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object InglesSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "ing_t03_s01",
            title = "Verbos Modales (Can, Must, Should), Estructuras Existenciales y Grados del Adjetivo - Core Rules & Foundations",
            theory = LessonTheory(
                title = "Verbos Modales (Can, Must, Should), Estructuras Existenciales y Grados del Adjetivo - Core Rules & Foundations",
                content = """## 1. COURSE OVERVIEW & CONCEPTUAL FRAMEWORK
## 1. PORTADA Y METADATOS CURRICULARES

| Campo | Detalle |
| :--- | :--- |
| **Eje Temático** | Eje 07: Idioma Extranjero (Inglés) |
| **Materia** | Gramática y Sintaxis Inglesa (A2 - B1 CEFR) |
| **Nivel de Dificultad** | Preuniversitario Avanzado (UNSA / CEPRUNSA) |
| **Tiempo de Estudio Recomendado** | 4.5 horas |
| **Resolución Curricular** | R.C.U. N.° 0028-2026 (Admisión 2027) |
| **Prerrequisitos** | Tiempos Verbales Presente y Pasado (Temas 01 y 02) |
| **Objetivo Pedagógico** | Dominar el valor funcional de los verbos modales (*can/could* para habilidad y permiso, *must/have to* para obligación y prohibición *mustn't*, *should* para consejo); aplicar con precisión rigurosa las estructuras existenciales (*there is/are, there was/were*) con sustantivos contables e incontables; y estructurar adjetivos en grado comparativo y superlativo regular e irregular. |

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Modals, Existentials & Adjective Degrees] --> B[Modal Verbs Auxiliary Operators]
    B --> B1[Can / Could: Ability, possibility, polite requests]
    B --> B2[Must vs Have to: Strong internal obligation vs External rules]
    B --> B3[Mustn't vs Don't have to: Prohibition vs Absence of obligation]
    B --> B4[Should / Ought to: Advice and recommendations]

    A --> C[Existential Structures]
    C --> C1[Present: There is singular/uncountable vs There are plural]
    C --> C2[Past: There was vs There were]
    C --> C3[Questions & Negations: Is/Are there any...? There isn't/aren't any...]

    A --> D[Degrees of Comparison]
    D --> D1[Equality: as + adjective + as]
    D --> D2[Comparative: Short -er than vs Long more... than]
    D --> D3[Superlative: Short the...-est vs Long the most...]
    D --> D4[Irregulars: good/better/best, bad/worse/worst, far/further/furthest]
```

---


## 2. FORMAL THEORETICAL FOUNDATIONS - PART I
## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA

### 3.1. Modal Auxiliary Verbs (Verbos Modales)
Los verbos modales son operadores que modifican el significado del verbo principal para expresar nociones de habilidad, deber, prohibición, permiso o recomendación.
- **Reglas Sintácticas Universales de los Modales Puros:**
  1. Van seguidos invariablemente de un **Bare Infinitive** (verbo base sin *to*):
     \text{Subject} + \mathbf{Modal} + \mathbf{Base \ Verb} + \text{Complement}
  2. **No añaden '-s'** en la tercera persona singular (*He can, She must*, NUNCA *He cans*).
  3. No utilizan los auxiliares *do/does/did* para negar o preguntar (*Can you...?*, *You must not...*).

#### A. Can / Could
- **Habilidad o Capacidad:**
  - *Presente:* *She **can speak** three languages fluently.*
  - *Pasado:* *When I was five, I **could swim** very well.*
- **Permiso y Solicitudes:**
  - Informal: *Can I borrow your pencil?*
  - Formal / Cortés: *Could you explain this exercise again, professor?*

#### B. Must vs. Have To (Obligación)
- **Must:** Expresa una **obligación interna, personal o moral** que emana del propio emisor:
  *I **must study** harder if I want to pass the admission test.*
- **Have to:** Expresa una **obligación externa objetiva**, impuesta por leyes, reglamentos institucionales o autoridades:
  *Students **have to wear** an identification badge on campus.* (Reglamento universitario).
  *(Tercera persona: He **has to** submit the form).*

#### C. Mustn't vs. Don't Have To (La Gran Distinción de Examen)
- **Mustn't (Prohibición Absoluta):** Está terminantemente vedado; es ilegal o contra las reglas:
  *You **mustn't use** mobile phones during the entrance exam.* (Prohibición estricta).
- **Don't / Doesn't have to (Falta de Obligación / Opcionalidad):** No es necesario, pero si el sujeto lo desea, puede hacerlo:
  *Tomorrow is Sunday; we **don't have to get up** early.* (No hay obligación).

#### D. Should (Consejo o Sugerencia)
Se utiliza para dar o pedir consejos, recomendaciones médicas o juicios de conveniencia moral:
- *You have a severe cough; you **should see** a doctor.*
- *Applicants **should read** the instructions carefully before answering.*

---

### 3.2. Existential Structures: *There is / There are*
Expresan la existencia o presencia de entidades físicas o conceptuales en un lugar determinado (equivalente al español impersonal *«hay»*).

| Estructura Existencial | Tipo de Sustantivo Acompañante | Ejemplos Canónicos |
| :--- | :--- | :--- |
| **There is / There's** | Sustantivo **singular contable** o **incontable** | *There is a microscope on the desk.*<br>*There is some water in the flask.* |

## 3. GRAMMAR PATTERNS & STRUCTURE TAXONOMY
## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES

### 4.1. Ecuación de Doble Grado Prohibida
Está terminantemente prohibido utilizar el adverbio *more* junto con el sufijo *-er*, o *most* con *-est*:
\times \ \text{more taller than} \quad \implies \quad \checkmark \ \mathbf{taller \ than}
\times \ \text{the most easiest} \quad \implies \quad \checkmark \ \mathbf{the \ easiest}


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t03_s01_c01",
                    question = "Choose the correct modal verb to complete the dialogue:",
                    options = listOf(
                        "can",
                        "should",
                        "couldn't",
                        "shouldn't"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El contexto describe a un médico brindando una recomendación o consejo de salud (*\"I will follow your advice\"*). El verbo modal por excelencia para aconsejar o sugerir un curso de acción beneficioso es **should** (+ bare infinitive *reduce*). **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t03_s01_c02",
                    question = "In a public museum, which sentence correctly expresses a strict prohibition?",
                    options = listOf(
                        "Visitors don't have to pay with cash; credit cards are accepted.",
                        "Visitors must to take photos of all paintings.",
                        "Visitors mustn't touch the historical sculptures on display.",
                        "Visitors should to touch the fragile ceramic exhibits."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** - En A: *don't have to* expresa falta de obligación, no prohibición. - En B y D: el uso de *must to* o *should to* es agramatical (los modales no llevan *to*). - En E: *haven't to* es incorrecto (debe ser *don't have to*). - En C: *mustn't touch* expresa con rigurosa exactitud normativa una **prohibición categórica** (*You are not allowed to touch*). **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t03_s01_c03",
                    question = "Complete the scientific sentence correctly:",
                    options = listOf(
                        "there are",
                        "there is",
                        "are there",
                        "is there"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El sustantivo nuclear es *rainfall* (precipitación pluvial), el cual es un sustantivo **incontable** (acompañado por el cuantificador *very little*). Los sustantivos incontables concuerdan preceptivamente con la forma existencial singular en presente: **there is**. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t03_s01_c04",
                    question = "What is the fundamental difference between *Mustn't* and *Don't have to*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "***Mustn't*** means **PROHIBITION** (it is forbidden / illegal). ***Don't have to*** means **NO OBLIGATION** (it is optional / not necessary)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: ***Mustn't*** means **PROHIBITION** (it is forbidden / illegal). ***Don't have to*** means **NO OBLIGATION** (it is optional / not necessary)."
                ),
                Challenge(
                    id = "ing_t03_s01_c05",
                    question = "Do modal verbs like *can, must, should* take *-s* in third person?",
                    options = listOf(
                        "**NO**, modal verbs never take *-s* and never take *to* (*He can speak, NOT: He cans to speak*).",
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 0,
                    explanation = "According to the lesson theory: **NO**, modal verbs never take *-s* and never take *to* (*He can speak, NOT: He cans to speak*)."
                ),
                Challenge(
                    id = "ing_t03_s01_c06",
                    question = "When do you use *There is* vs. *There are*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "Use ***There is*** for singular countable nouns and **uncountable nouns**; use ***There are*** for plural countable nouns.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 1,
                    explanation = "According to the lesson theory: Use ***There is*** for singular countable nouns and **uncountable nouns**; use ***There are*** for plural countable nouns."
                ),
                Challenge(
                    id = "ing_t03_s01_c07",
                    question = "*\"You _______ smoke inside the petrol station. It is extremely dangerous!\"*",
                    options = listOf(
                        "don't have to",
                        "shouldn't to",
                        "mustn't",
                        "can to"
                    ),
                    correctIndex = 2,
                    explanation = "(Prohibición estricta de seguridad vital)."
                ),
                Challenge(
                    id = "ing_t03_s01_c08",
                    question = "*\"Yesterday, _______ many applicants waiting outside the admission office.\"*",
                    options = listOf(
                        "there was",
                        "there were",
                        "there is",
                        "there are"
                    ),
                    correctIndex = 1,
                    explanation = "(Estructura existencial en pasado para sustantivo plural contable *applicants*)."
                ),
                Challenge(
                    id = "ing_t03_s01_c09",
                    question = "Which of the following statements is analytically and grammatically correct regarding the lesson theory?",
                    options = listOf(
                        "The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson.",
                        "The sentence violates subject-verb agreement in standard English.",
                        "The tense used is incompatible with the stated adverbial time marker.",
                        "The word order incorrectly positions the modifier after the direct object."
                    ),
                    correctIndex = 0,
                    explanation = "Directly deduced from the theoretical foundations and rules presented in this lesson."
                ),
                Challenge(
                    id = "ing_t03_s01_c10",
                    question = "Which of the following statements is analytically and grammatically correct regarding the lesson theory?",
                    options = listOf(
                        "The sentence violates subject-verb agreement in standard English.",
                        "The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson.",
                        "The tense used is incompatible with the stated adverbial time marker.",
                        "The word order incorrectly positions the modifier after the direct object."
                    ),
                    correctIndex = 1,
                    explanation = "Directly deduced from the theoretical foundations and rules presented in this lesson."
                )
            )
        ),
        LessonNode(
            id = "ing_t03_s02",
            title = "Verbos Modales (Can, Must, Should), Estructuras Existenciales y Grados del Adjetivo - Applied Skills, Hacks & Reading Practice",
            theory = LessonTheory(
                title = "Verbos Modales (Can, Must, Should), Estructuras Existenciales y Grados del Adjetivo - Applied Skills, Hacks & Reading Practice",
                content = """## 1. APPLIED GRAMMAR & ADVANCED STRUCTURES - PART II
| **There are** | Sustantivo **plural contable** | *There are thirty candidates in the auditorium.* |
| **There was** | Pasado de singular o incontable (*«hubo/había»*) | *There was a power outage yesterday evening.* |
| **There were** | Pasado de plural contable (*«hubo/habían»*) | *There were many difficult questions in the test.* |

- **Negación e Interrogación:**
  - *Is there any milk in the fridge? \rightarrow No, there isn't any.*
  - *Are there any vacant seats in row four? \rightarrow Yes, there are.*

---

### 3.3. Degrees of Adjectives: Comparatives and Superlatives

#### A. Comparativos de Igualdad e Inferioridad
- **Igualdad:** \mathbf{as} + \text{Adjective (base)} + \mathbf{as}
  *Arequipa is **as beautiful as** Cusco.*
- **Inferioridad:** \mathbf{not \ as} + \text{Adjective} + \mathbf{as} \quad / \quad \mathbf{less} + \text{Adjective} + \mathbf{than}
  *This tablet is **not as expensive as** that laptop.*

#### B. Morfología de Comparativos y Superlativos de Superioridad

\begin{array}{|l|l|l|l|}
\hline
\textbf{Tipo de Adjetivo} & \textbf{Forma Positiva} & \textbf{Grado Comparativo} & \textbf{Grado Superlativo} \\ \hline
\text{1 sílaba regular} & \text{tall, clean} & \text{taller than} & \text{the tallest} \\ \hline
\text{1 sílaba CVC (duplica)} & \text{big, hot} & \text{bigger than, hotter than} & \text{the biggest, the hottest} \\ \hline
\text{2 sílabas en '-y'} & \text{happy, easy} & \text{happier than, easier than} & \text{the happiest, the easiest} \\ \hline
\text{2 o más sílabas (largos)} & \text{difficult, modern} & \text{more difficult than} & \text{the most difficult} \\ \hline
\end{array}

#### C. Formas Irregulares Esenciales en Admisión
Los adjetivos irregulares cambian su raíz morfológica por completo:

\begin{array}{|l|l|l|}
\hline
\textbf{Forma Base} & \textbf{Comparativo (+ than)} & \textbf{Superlativo (the + ...)} \\ \hline
\text{good (bueno)} & \text{better} & \text{the best} \\ \hline
\text{bad (malo)} & \text{worse} & \text{the worst} \\ \hline
\text{far (lejos)} & \text{further / farther} & \text{the furthest / farthest} \\ \hline
\text{little (poco)} & \text{less} & \text{the least} \\ \hline
\text{many / much (mucho)} & \text{more} & \text{the most} \\ \hline
\end{array}

---


## 2. PRE-UNIVERSITY HACKS & MNEMOTECHNICS
### 4.2. Ecuación Prohibición vs. No Obligación

\mathbf{MUSTN'T} = \text{Prohibición Legal/Estricta} \ (0\% \ \text{permitido})
\mathbf{DON'T \ HAVE \ TO} = \text{Falta de Necesidad} \ (\text{Voluntario / Opcional})

---


## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS

### 1. El Hack de "Mustn't vs. Don't have to": "La Señal de Tránsito"
- **Mustn't:** Semáforo en rojo o señal de "Prohibido el paso" (¡Si lo haces, cometes delito o sanción grave!).
- **Don't have to:** Entrada libre o peaje gratuito (¡No tienes que pagar, pero puedes pasar si quieres!).

### 2. Mnemotécnia de Irregulares: "B-W-F"
\mathbf{B}\text{etter / Best (Good)} \quad | \quad \mathbf{W}\text{orse / Worst (Bad)} \quad | \quad \mathbf{F}\text{urther / Furthest (Far)}

---


## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS
## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **Colocar 'to' después de un modal puro:**
   - *Error:* \times *She can to speak English.* / \times *You must to go.*
   - *Norma:* Los modales puros rigen **bare infinitive** (sin *to*): \checkmark *She can speak* / \checkmark *You must go*. (Solo *have to* y *ought to* llevan *to* incorporado).
2. **Confundir *There is* con sustantivos incontables:**
   - *Error:* \times *There are a lot of information.*
   - *Norma:* La palabra *information* en inglés es **incontable**; requiere el verbo en singular: \checkmark *There **is** a lot of information*.
3. **Confundir *Worse* con *Worst*:**
   - *Worse* es comparativo para **dos** elementos (*This test is worse than the last one*).
   - *Worst* es superlativo absoluto precedido de *the* (*This is the worst test of the year*).

---


## 4. REAL-WORLD CONTEXT & READING PASSAGES
## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL

### Caso 1: Seguridad en el Laboratorio de Ingeniería Química
En el manual de seguridad de la UNSA leemos:
> *"1. Students **must wear** safety goggles at all times inside the laboratory."*  
> *"2. You **mustn't ingest** any chemical substance or remove equipment without authorization."*  
> *"3. You **don't have to bring** your own microscope; the university provides them."*

- **Análisis Semántico-Pragmático:**
  - En la regla 1: *Must* expresa un mandato de seguridad perentorio obligatorio.
  - En la regla 2: *Mustn't* prohíbe taxativamente comer químicos o robar instrumental (peligro de muerte o expulsión).
  - En la regla 3: *Don't have to* indica ausencia de obligación: el estudiante no está forzado a gastar en un microscopio propio, pues el laboratorio los provee gratis.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t03_s02_c01",
                    question = "Select the sentence that is **GRAMMATICALLY ACCURATE**:",
                    options = listOf(
                        "Mount Everest is more higher than any other mountain on Earth.",
                        "This year's economic crisis is far more worse than the previous one.",
                        "Renewable solar energy is considered one of the most efficient alternatives today.",
                        "That was the baddest performance the orchestra has ever delivered."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** - En A: *more higher* es un doble comparativo prohibido (*higher than*). - En B: *more worse* es un error gravísimo (*worse* ya es comparativo; debe decirse *far worse*). - En D: *baddest* no existe en inglés estándar; la forma irregular es *the worst*. - En E: *expensive* es adjetivo largo de tres sílabas; su comparativo es *more expensive than*, nunca *expensiver*. - En C: *the most efficient* es el superlativo regular intachable de un adjetivo largo (*efficient*). **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t03_s02_c02",
                    question = "Evaluate the following five sentences and identify the option that correctly states which ones are **FREE OF GRAMMATICAL ERRORS**:",
                    options = listOf(
                        "Sentences 1, 3 and 5",
                        "Sentences 1, 2 and 4",
                        "Sentences 3, 4 and 5",
                        "Sentences 2 and 5"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** - **Oración 1 (CORRECTA):** *Don't have to* expresa correctamente ausencia de obligación (no es obligatorio llevar pasaporte en vuelos nacionales). - **Oración 2 (INCORRECTA):** El sujeto es plural (*several international workshops*); por tanto, la forma existencial en pasado debió ser en plural: *there **were** several workshops*, no *was*. - **Oración 3 (CORRECTA):** Utiliza el comparativo irregular de *good* \\rightarrow *better than*, intensificado legítimamente por el adverbio de grado *much* (*much better at solving...*). - **Oración 4 (INCORRECTA):** El modal *must not* no puede ir seguido de *to* (*must not to carry* es un error fatal; debe ser *must not carry*). - **Oración 5 (CORRECTA):** Estructura canónica impecable del comparativo de igualdad: *as quiet as* (adjetivo base entre *as... as*). Por consiguiente, las oraciones estrictamente correctas son la **1, la 3 y la 5**. **Respuesta:** **A** ---"
                ),
                Challenge(
                    id = "ing_t03_s02_c03",
                    question = "What are the comparative and superlative of the adjective *Bad*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "Comparative: ***worse than***. Superlative: ***the worst***.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 2,
                    explanation = "According to the lesson theory: Comparative: ***worse than***. Superlative: ***the worst***."
                ),
                Challenge(
                    id = "ing_t03_s02_c04",
                    question = "How do you form the comparative of a short one-syllable CVC adjective like *Hot*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "Double the final consonant and add *-er*: ***hotter than*** (Superlative: ***the hottest***)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: Double the final consonant and add *-er*: ***hotter than*** (Superlative: ***the hottest***)."
                ),
                Challenge(
                    id = "ing_t03_s02_c05",
                    question = "The comparative form of the adjective *\"far\"* is:",
                    options = listOf(
                        "farer",
                        "more far",
                        "further / farther",
                        "the furthest"
                    ),
                    correctIndex = 2,
                    explanation = "(Forma comparativa irregular)."
                ),
                Challenge(
                    id = "ing_t03_s02_c06",
                    question = "Which of the following statements is analytically and grammatically correct regarding the lesson theory?",
                    options = listOf(
                        "The sentence violates subject-verb agreement in standard English.",
                        "The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson.",
                        "The tense used is incompatible with the stated adverbial time marker.",
                        "The word order incorrectly positions the modifier after the direct object."
                    ),
                    correctIndex = 1,
                    explanation = "Directly deduced from the theoretical foundations and rules presented in this lesson."
                ),
                Challenge(
                    id = "ing_t03_s02_c07",
                    question = "Which of the following statements is analytically and grammatically correct regarding the lesson theory?",
                    options = listOf(
                        "The sentence violates subject-verb agreement in standard English.",
                        "The tense used is incompatible with the stated adverbial time marker.",
                        "The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson.",
                        "The word order incorrectly positions the modifier after the direct object."
                    ),
                    correctIndex = 2,
                    explanation = "Directly deduced from the theoretical foundations and rules presented in this lesson."
                ),
                Challenge(
                    id = "ing_t03_s02_c08",
                    question = "Which of the following statements is analytically and grammatically correct regarding the lesson theory?",
                    options = listOf(
                        "The sentence violates subject-verb agreement in standard English.",
                        "The tense used is incompatible with the stated adverbial time marker.",
                        "The word order incorrectly positions the modifier after the direct object.",
                        "The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson."
                    ),
                    correctIndex = 3,
                    explanation = "Directly deduced from the theoretical foundations and rules presented in this lesson."
                ),
                Challenge(
                    id = "ing_t03_s02_c09",
                    question = "Which of the following statements is analytically and grammatically correct regarding the lesson theory?",
                    options = listOf(
                        "The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson.",
                        "The sentence violates subject-verb agreement in standard English.",
                        "The tense used is incompatible with the stated adverbial time marker.",
                        "The word order incorrectly positions the modifier after the direct object."
                    ),
                    correctIndex = 0,
                    explanation = "Directly deduced from the theoretical foundations and rules presented in this lesson."
                ),
                Challenge(
                    id = "ing_t03_s02_c10",
                    question = "Which of the following statements is analytically and grammatically correct regarding the lesson theory?",
                    options = listOf(
                        "The sentence violates subject-verb agreement in standard English.",
                        "The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson.",
                        "The tense used is incompatible with the stated adverbial time marker.",
                        "The word order incorrectly positions the modifier after the direct object."
                    ),
                    correctIndex = 1,
                    explanation = "Directly deduced from the theoretical foundations and rules presented in this lesson."
                )
            )
        )
    )
}
