package ingles

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object InglesSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "ing_t04_s01",
            title = "Funciones Comunicativas (Gustos, Preferencias, Solicitudes) y Conectores Lógicos Discursivos - Core Rules & Foundations",
            theory = LessonTheory(
                title = "Funciones Comunicativas (Gustos, Preferencias, Solicitudes) y Conectores Lógicos Discursivos - Core Rules & Foundations",
                content = """## 1. COURSE OVERVIEW & CONCEPTUAL FRAMEWORK
## 1. PORTADA Y METADATOS CURRICULARES

| Campo | Detalle |
| :--- | :--- |
| **Eje Temático** | Eje 07: Idioma Extranjero (Inglés) |
| **Materia** | Gramática y Funciones Comunicativas (A2 - B1 CEFR) |
| **Nivel de Dificultad** | Preuniversitario Avanzado (UNSA / CEPRUNSA) |
| **Tiempo de Estudio Recomendado** | 4.0 horas |
| **Resolución Curricular** | R.C.U. N.° 0028-2026 (Admisión 2027) |
| **Prerrequisitos** | Tiempos de Presente, Pasado y Verbos Modales (Temas 01 al 03) |
| **Objetivo Pedagógico** | Expresar gustos y preferencias (*like, love, enjoy, prefer, hate + gerund / would like to + infinitive*); formular solicitudes, permisos e invitaciones formales e informales (*Could you, Would you mind, May I, How about*); ordenar procesos con secuencias temporales (*First, Then, Finally, before/after + -ing*); y articular párrafos con conectores lógicos de adición, contraste, causa, consecuencia y finalidad. |

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Communicative Functions & Connectors] --> B[Likes, Dislikes & Preferences]
    B --> B1[Verbs of feeling: like, love, enjoy, hate + Gerund -ING]
    B --> B2[Hypothetical preference: would like / would prefer + to-Infinitive]
    B --> B3[Prefer X to Y: Gerund to Gerund / Noun to Noun]

    A --> C[Social Formulae & Pragmatic Interactions]
    C --> C1[Polite Requests: Could you please...? Would you mind + -ING...?]
    C --> C2[Permissions: May I...? Can I...? Is it okay if...?]
    C --> C3[Suggestions & Invites: Why don't we...? How about + -ING...? Let's...]

    A --> D[Time Sequence & Process Markers]
    D --> D1[Chrono-markers: First, Secondly, Next, After that, Finally]
    D --> D2[Prepositional time clauses: Before + -ING, After + -ING, While...]

    A --> E[Logical Connectors Linking Words]
    E --> E1[Addition: and, furthermore, moreover, in addition]
    E --> E2[Contrast: but, however, although/even though, despite + noun]
    E --> E3[Cause & Effect: because vs because of, so, therefore, consequently]
    E --> E4[Purpose: to, in order to, so that + clause]
```

---


## 2. FORMAL THEORETICAL FOUNDATIONS - PART I
## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA

### 3.1. Expresión de Gustos, Preferencias y Aversiones

#### A. Verbos de Sentimiento General + Gerundio (*-ING*)
Cuando expresamos aficiones, hábitos placenteros o aversiones generales permanentes, verbos como *like, love, enjoy, fancy, don't mind, dislike, hate, can't stand* van seguidos preceptivamente de un **sustantivo** o de un **gerundio (-ING)**:
- *She **enjoys reading** scientific articles on biophysics.* (NUNCA: \times *enjoys to read*).
- *They **hate waiting** in long queues under the sun.*
- *I **don't mind helping** you with your mathematics assignment.*

#### B. *Would like / Would prefer* + *To-Infinitive*
Cuando se expresa un **deseo puntual, específico o hipotético en el presente o futuro**, se utiliza la estructura modal condicional *would like / would love / would prefer*, la cual exige **To-Infinitive**:
\text{Subject} + \mathbf{would \ like \ / \ 'd \ like} + \mathbf{to \ + \ Base \ Verb} + \text{Complement}
- *I **like swimming**.* \rightarrow Me gusta nadar como deporte o afición habitual.
- *I **would like to swim** this afternoon.* \rightarrow Deseo nadar hoy puntualmente.

#### C. Estructura de Preferencia: *Prefer A to B*
Para comparar dos actividades o entidades preferidas:
\mathbf{prefer} + \text{Noun / Gerund A} + \mathbf{to} + \text{Noun / Gerund B}
- *She **prefers studying** in the library **to working** at home.* (NUNCA: \times *than working*).

---

### 3.2. Solicitudes, Permisos, Sugerencias e Invitaciones

| Función Pragmática | Estructura Canónica | Grado de Cortesía | Ejemplo Ilustrativo |
| :--- | :--- | :--- | :--- |
| **Petición Cortés (Polite Request)** | \mathbf{Could \ you \ (please)} + \text{Base Verb...?} | Formal | *Could you please lend me your calculator?* |
| **Petición con "Mind"** | \mathbf{Would \ you \ mind} + \mathbf{Verb\text{-}ING...?} | Muy formal | *Would you mind **opening** the window?* (Respuesta afirmativa cortés: *No, not at all*). |
| **Petición Informal** | \mathbf{Can \ you} + \text{Base Verb...?} | Coloquial / Amigos | *Can you pass the salt, please?* |
| **Permiso Formal** | \mathbf{May \ I} + \text{Base Verb...?} | Muy formal e institucional | *May I ask a question, Professor?* |
| **Sugerencia / Invitación 1** | \mathbf{Why \ don't \ we} + \text{Base Verb...?} | Neutro | *Why don't we study together for the test?* |
| **Sugerencia / Invitación 2** | \mathbf{How \ about \ / \ What \ about} + \mathbf{Verb\text{-}ING...?} | Informal | *How about **having** lunch at the campus canteen?* |
| **Mandato Exhortativo** | \mathbf{Let's} + \text{Base Verb} | Inclusivo | *Let's review the biology notes now.* |

---

### 3.3. Secuencias Temporales y Marcadores de Proceso
Para describir instrucciones de laboratorio, recetas, algoritmos o itinerarios cronológicos:
1. **Marcadores de Orden:**
   - *First / Firstly:* Introduce el punto de partida (*First, wash the test tubes*).
   - *Next / Then / After that:* Describen los pasos intermedios (*Next, add 5 ml of acid. Then, stir gently*).
   - *Finally / Lastly:* Concluye el proceso (*Finally, record the temperature*).
2. **Preposiciones de Tiempo con Gerundio:**
   Cuando las preposiciones *before* y *after* van seguidas de un verbo sin sujeto explícito, este adopta obligatoriamente la forma de **gerundio (-ING)**:

## 3. GRAMMAR PATTERNS & STRUCTURE TAXONOMY
## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES

### 4.1. Ecuaciones Sintácticas de Selección Conectiva

\begin{array}{|l|l|}
\hline
\textbf{Estructura Gramatical Conectiva} & \textbf{Patrón Sintáctico Exigido} \\ \hline
\text{Although / Even though} & \mathbf{+ \ \text{Subject} + \text{Verb}} \ (\text{Cláusula completa}) \\ \hline

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t04_s01_c01",
                    question = "Complete the sentence correctly:",
                    options = listOf(
                        "design",
                        "to design",
                        "designing",
                        "designed"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El verbo *enjoy* (disfrutar) pertenece a la clase de verbos de sentimiento que rigen obligatoriamente un complemento en forma de **gerundio (-ING)**. Por lo tanto, la forma requerida es *designing*. **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t04_s01_c02",
                    question = "Choose the grammatically correct option to fill in the blank:",
                    options = listOf(
                        "explain",
                        "to explain",
                        "explaining",
                        "explained"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** La fórmula de cortesía epistémica *Would you mind...?* exige preceptivamente que el verbo que le sigue adopte la terminación de gerundio **-ING**: *Would you mind explaining...?*. **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t04_s01_c03",
                    question = "Select the option that correctly completes the sentence:",
                    options = listOf(
                        "Although",
                        "In spite",
                        "Even though",
                        "Despite"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El elemento que sigue al conector es un sintagma nominal sin verbo conjugado: *\"the severe storm warnings issued by the meteorology center\"*. - *Although* y *Even though* requieren una cláusula con sujeto y verbo conjugado (S+V). - *In spite* carece de la preposición obligatoria *of*. - *Because* denota causa, lo cual contradice el sentido adversativo de la oración. - **Despite** va seguido de un sintagma nominal para expresar concesión o contraste. **Respuesta:** **D** ---"
                ),
                Challenge(
                    id = "ing_t04_s01_c04",
                    question = "What form of the verb follows *\"enjoy\"*, *\"hate\"*, and *\"don't mind\"*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "The **Gerund (-ING form)**: *She enjoys studying; I don't mind helping*."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: The **Gerund (-ING form)**: *She enjoys studying; I don't mind helping*."
                ),
                Challenge(
                    id = "ing_t04_s01_c05",
                    question = "What is the syntactic difference between *Although* and *Despite*?",
                    options = listOf(
                        "***Although*** is followed by a **Clause (Subject + Verb)**; ***Despite*** is followed by a **Noun Phrase or Gerund** (*Despite the rain*).",
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 0,
                    explanation = "According to the lesson theory: ***Although*** is followed by a **Clause (Subject + Verb)**; ***Despite*** is followed by a **Noun Phrase or Gerund** (*Despite the rain*)."
                ),
                Challenge(
                    id = "ing_t04_s01_c06",
                    question = "What verb form MUST follow *\"Would you mind...?\"*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "The **Gerund (-ING)**: *Would you mind **closing** the door?*.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 1,
                    explanation = "According to the lesson theory: The **Gerund (-ING)**: *Would you mind **closing** the door?*."
                ),
                Challenge(
                    id = "ing_t04_s01_c07",
                    question = "*\"Would you like _______ to the cinema with us tonight?\"*",
                    options = listOf(
                        "go",
                        "going",
                        "to go",
                        "for going"
                    ),
                    correctIndex = 2,
                    explanation = "(*Would like* exige *to-infinitive*: *to go*)."
                ),
                Challenge(
                    id = "ing_t04_s01_c08",
                    question = "*\"I prefer drinking green tea _______ drinking black coffee.\"*",
                    options = listOf(
                        "than",
                        "to",
                        "from",
                        "over than"
                    ),
                    correctIndex = 1,
                    explanation = "(La estructura fija de preferencia es *prefer X to Y*)."
                ),
                Challenge(
                    id = "ing_t04_s01_c09",
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
                    id = "ing_t04_s01_c10",
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
            id = "ing_t04_s02",
            title = "Funciones Comunicativas (Gustos, Preferencias, Solicitudes) y Conectores Lógicos Discursivos - Applied Skills, Hacks & Reading Practice",
            theory = LessonTheory(
                title = "Funciones Comunicativas (Gustos, Preferencias, Solicitudes) y Conectores Lógicos Discursivos - Applied Skills, Hacks & Reading Practice",
                content = """## 1. APPLIED GRAMMAR & ADVANCED STRUCTURES - PART II
   - \mathbf{Before} + \mathbf{Verb\text{-}ING}: *Turn off the computer **before leaving** the room.*
   - \mathbf{After} + \mathbf{Verb\text{-}ING}: ***After finishing** the exam, submit your test sheet.*

---

### 3.4. Conectores Lógicos de Cohesión (Linking Words)

```
┌─────────────────────────────────────────────────────────────────┐
│                    LOGICAL LINKING CONNECTORS                   │
└────────────────────────────────┬────────────────────────────────┘
        ┌────────────────────────┼────────────────────────┐
        ▼                        ▼                        ▼
 ┌─────────────┐          ┌─────────────┐          ┌─────────────┐
 │  Contrast   │          │Cause & Eff. │          │   Purpose   │
 └──────┬──────┘          └──────┬──────┘          └──────┬──────┘
        ├─ But (coordinante)     ├─ Because (oración)     ├─ To + verb
        ├─ However (; however,)  ├─ Because of (+ sust)   ├─ In order to
        ├─ Although (+ oración)  ├─ So (consecuencia)     └─ So that (+ orac)
        └─ Despite (+ sustantivo)└─ Therefore / As a result
```

#### A. Conectores de Contraste: *Although* vs. *Despite / In spite of*
- **Although / Even though + Cláusula (Sujeto + Verbo):**
  *He passed the entrance examination **although he was** very nervous.*
- **Despite / In spite of + Sintagma Nominal o Gerundio (-ING):**
  *He passed the entrance examination **despite his nervousness**.*
  *He passed the entrance examination **in spite of being** very nervous.* (NUNCA: \times *despite of*).

#### B. Conectores de Causa: *Because* vs. *Because of*
- **Because + Cláusula completa (S + V):**
  *The university cancelled classes **because the heavy rain flooded** the campus.*
- **Because of + Sintagma Nominal (Noun \ Phrase):**
  *The university cancelled classes **because of the heavy rain**.*

#### C. Conectores de Consecuencia: *So* vs. *Therefore*
- **So (Coordinante informal):** *She studied day and night, **so** she obtained the highest score.*
- **Therefore / Consequently (Formal con punto y coma):** *She studied day and night**; therefore,** she obtained the highest score.*

#### D. Conectores de Finalidad (Purpose)
- \mathbf{To \ / \ In \ order \ to} + \mathbf{Base \ Verb}: *He woke up early **in order to arrive** on time.*
- \mathbf{So \ that} + \mathbf{Subject} + \mathbf{can \ / \ could \ / \ will} + \mathbf{Verb}: *He woke up early **so that he could catch** the bus.*

---


## 2. PRE-UNIVERSITY HACKS & MNEMOTECHNICS
\text{Despite / In spite of} & \mathbf{+ \ \text{Noun Phrase \ / \ Verb-ING}} \ (\text{Sin verbo conjugado}) \\ \hline
\text{Because} & \mathbf{+ \ \text{Subject} + \text{Verb}} \\ \hline
\text{Because of / Due to} & \mathbf{+ \ \text{Noun Phrase \ / \ Pronoun}} \\ \hline
\text{In order to / So as to} & \mathbf{+ \ \text{Base Verb}} \\ \hline
\text{So that} & \mathbf{+ \ \text{Subject} + \text{Modal (can/could)} + \text{Verb}} \\ \hline
\end{array}

---


## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS

### 1. El Hack de "Would you mind": Siempre pide -ING
\mathbf{Would \ you \ mind} + \mathbf{VERB\text{-}ING} \quad (\text{NO:} \ \times \text{Would you mind open the door?})
- *Correcto:* \checkmark *Would you mind **opening** the door?*
- *Dato clave:* Si respondes cortésmente que NO te molesta abrir la puerta, debes decir: **"No, not at all"** o **"Of course not"**. (Decir "Yes" significa que SÍ te molesta).

### 2. Mnemotécnia de Contraste: "A-C" vs. "D-S"
- **A**lthough \longrightarrow **C**láusula (Sujeto + Verbo).
- **D**espite \longrightarrow **S**ustantivo / **S**intagma nominal.

---


## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS
## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **La Trampa de "Despite of":**
   - *Error común:* Escribir \times *despite of the rain*.
   - *Regla inviolable:* O se usa **despite** solo, o se usa **in spite of**:
     - \checkmark *despite the rain*
     - \checkmark *in spite of the rain*
     - \times *despite of the rain* (¡Inexistente en inglés culto!).
2. **Confundir "Enjoy to do" con "Enjoy doing":**
   - El verbo *enjoy* exige **gerundio (-ING)** en el 100% de los casos: \checkmark *I enjoy studying*, NUNCA \times *I enjoy to study*.
3. **Usar "prefer than" en lugar de "prefer to":**
   - *Error:* \times *I prefer tea than coffee.*
   - *Correcto:* \checkmark *I prefer tea **to** coffee.*

---


## 4. REAL-WORLD CONTEXT & READING PASSAGES
## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL

### Caso 1: Redacción de Ensayos Académicos Universitarios
En un párrafo expositivo sobre cambio climático:
> *"Global temperatures continue to rise rapidly; **furthermore**, sea levels are threatening coastal cities. **Although** governments have signed international climate treaties, carbon emissions remain alarmingly high. **Because of** severe industrial pollution, urgent policies are required **so that** future generations can survive."*

- **Análisis de Cohesión:**
  - *Furthermore:* Conector de adición formal que suma un segundo impacto ecológico.
  - *Although:* Introduce una cláusula subordinada concesiva (S+V: *governments have signed*).
  - *Because of:* Introduce la causa mediante un sintagma nominal (*severe industrial pollution*).
  - *So that:* Conecta con la finalidad del propósito introduciendo un sujeto y modal (*future generations can survive*).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t04_s02_c01",
                    question = "Which of the following sentences correctly expresses **PURPOSE**?",
                    options = listOf(
                        "She registered early in order that she avoid long lines.",
                        "She registered early so that to avoid long lines.",
                        "She registered early in order to avoid long lines.",
                        "She registered early because of avoiding long lines."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** - En A: *in order that* exige un modal (*in order that she might avoid*). - En B: *so that to* es una mezcla agramatical. - En D: *because of* indica causa, no finalidad. - En E: *so as* exige infinitivo con *to* (*so as to avoid*), no gerundio. - En C: **in order to** seguido de la forma base del verbo (*avoid*) es la estructura canónica y formal de finalidad. **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t04_s02_c02",
                    question = "Analyze the following paragraph and determine the exact sequence of connectors that correctly fills blanks (1), (2), and (3):",
                    options = listOf(
                        "(1) because - (2) Despite - (3) so",
                        "(1) because of - (2) Although - (3) because",
                        "(1) due to - (2) In spite of - (3) therefore",
                        "(1) because of - (2) Even though - (3) so that"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Espacio (1):** Va seguido del sintagma nominal *\"the massive traffic congestion on the main bridge\"* (sin verbo conjugado). Requiere un conector preposicional de causa: **because of** (o *due to*). 2. **Espacio (2):** Va seguido de una cláusula completa con sujeto y verbo (*he had missed the introductory explanation*), expresando contraste u obstáculo superado. Requiere una conjunción subordinante concesiva: **Although** (o *Even though*). 3. **Espacio (3):** Introduce la razón o causa explicativa con cláusula completa (S+V: *he had thoroughly studied the manual*): requiere **because** (o *since*). La terna armónica que cumple todas las restricciones sintácticas es: **because of - Although - because** (Alternativa B). **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t04_s02_c03",
                    question = "Why is *\"despite of the difficulty\"* a fatal grammar error?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "Because *despite* **never takes 'of'**. Use either ***despite the difficulty*** or ***in spite of the difficulty***.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 2,
                    explanation = "According to the lesson theory: Because *despite* **never takes 'of'**. Use either ***despite the difficulty*** or ***in spite of the difficulty***."
                ),
                Challenge(
                    id = "ing_t04_s02_c04",
                    question = "What is the difference between *Because* and *Because of*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "***Because*** + **Subject + Verb** (*because it was raining*); ***Because of*** + **Noun Phrase** (*because of the rain*)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: ***Because*** + **Subject + Verb** (*because it was raining*); ***Because of*** + **Noun Phrase** (*because of the rain*)."
                ),
                Challenge(
                    id = "ing_t04_s02_c05",
                    question = "*\"They installed solar panels on the roof _______ reduce their electricity bill.\"*",
                    options = listOf(
                        "in order to",
                        "so that",
                        "because of",
                        "despite"
                    ),
                    correctIndex = 0,
                    explanation = "(Finalidad seguida de verbo base *reduce*)."
                ),
                Challenge(
                    id = "ing_t04_s02_c06",
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
                    id = "ing_t04_s02_c07",
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
                    id = "ing_t04_s02_c08",
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
                    id = "ing_t04_s02_c09",
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
                    id = "ing_t04_s02_c10",
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
