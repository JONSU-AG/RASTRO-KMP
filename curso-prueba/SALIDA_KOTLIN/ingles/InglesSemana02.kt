package ingles

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object InglesSemana02 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "ing_t02_s01",
            title = "Pasado Simple (Regulares e Irregulares) y Formas de Futuro (Be going to vs. Will) - Core Rules & Foundations",
            theory = LessonTheory(
                title = "Pasado Simple (Regulares e Irregulares) y Formas de Futuro (Be going to vs. Will) - Core Rules & Foundations",
                content = """## 1. COURSE OVERVIEW & CONCEPTUAL FRAMEWORK
## 1. PORTADA Y METADATOS CURRICULARES

| Campo | Detalle |
| :--- | :--- |
| **Eje Temático** | Eje 07: Idioma Extranjero (Inglés) |
| **Materia** | Gramática y Sintaxis Inglesa (A2 - B1 CEFR) |
| **Nivel de Dificultad** | Preuniversitario Avanzado (UNSA / CEPRUNSA) |
| **Tiempo de Estudio Recomendado** | 4.5 horas |
| **Resolución Curricular** | R.C.U. N.° 0028-2026 (Admisión 2027) |
| **Prerrequisitos** | Tiempos de Presente y Auxiliares Básicos (Tema 01) |
| **Objetivo Pedagógico** | Dominar la flexión y sintaxis del **Past Simple** (reglas ortográficas de verbos regulares *-ed*, fonología de desinencias /t/, /d/, /ɪd/, catálogo de verbos irregulares clave y uso del auxiliar *did/didn't*); discriminar con precisión quirúrgica las formas de futuro: **Be going to** (planes premeditados y evidencia empírica presente) frente a **Will** (decisiones espontáneas, promesas y predicciones subjetivas). |

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Past & Future Systems in English] --> B[Past Simple Tense]
    B --> B1[Uses: Completed past events with definite time markers]
    B --> B2[Regular Verbs: Spelling rules for -ed suffixation]
    B --> B3[Pronunciation of -ed: /t/, /d/, /ɪd/ after /t, d/]
    B --> B4[Irregular Verbs: Supletive past forms went, saw, bought]
    B --> B5[Auxiliary Operator: DID / DIDN'T returns main verb to base form]

    A --> C[Future Tenses in Context]
    C --> C1[Be going to: Premeditated plans / Evidence-based predictions]
    C --> C2[Will: Spontaneous decisions / Promises / Subjective opinions with I think]
    C --> C3[Present Continuous for Future: Fixed arrangements with time/place]
```

---


## 2. FORMAL THEORETICAL FOUNDATIONS - PART I
## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA

### 3.1. The Past Simple Tense (Pasado Simple)
Se utiliza para expresar acciones, hechos o estados que **comenzaron y concluyeron definitivamente en el pasado**, acompañados o delimitados por marcadores temporales específicos (*yesterday, last night, two days ago, in 2020, when I was a child*).

#### A. Verbos Regulares: Reglas de Sufijación del Morfema *-ed*
1. **Regla General:** Añadir *-ed* a la forma base (*clean \rightarrow cleaned*, *work \rightarrow worked*, *open \rightarrow opened*).
2. **Terminados en 'e' muda:** Añadir únicamente *-d* (*live \rightarrow lived*, *arrive \rightarrow arrived*, *decide \rightarrow decided*).
3. **Consonante + 'y':** Cambiar la 'y' por **-ied** (*study \rightarrow studied*, *carry \rightarrow carried*, *try \rightarrow tried*).
4. **Vocal + 'y':** Solo añadir *-ed* (*play \rightarrow played*, *enjoy \rightarrow enjoyed*, *stay \rightarrow stayed*).
5. **Monosílabos CVC (Consonante-Vocal-Consonante):** Se duplica la consonante final (*stop \rightarrow stopped*, *plan \rightarrow planned*, *rob \rightarrow robbed*). (No aplica a terminaciones en *-w, -x*: *snow \rightarrow snowed*, *fix \rightarrow fixed*).
6. **Polisílabos con acento en la última sílaba:** Se duplica la consonante (*admit \rightarrow admitted*, *prefer \rightarrow preferred*). Si el acento va en la primera sílaba, no se duplica (*visit \rightarrow visited*, *listen \rightarrow listened*).

#### B. Fonología de la Terminación *-ed* (Reglas de Pronunciación)
En los exámenes de admisión y pruebas de suficiencia, la pronunciación de *-ed* responde a tres reglas fonéticas inviolables:

| Sonido Final del Verbo Base | Realización Fonética de *-ed* | Ejemplos |
| :--- | :--- | :--- |
| **Sonido /t/ o /d/** | **/ɪd/** (Añade una sílaba extra) | *wanted* (/ˈwɒntɪd/), *decided* (/dɪˈsaɪdɪd/), *started* |
| **Consonante Sorda (Voiceless):** /p, k, f, s, ʃ, tʃ, θ/ | **/t/** (Sin sílaba extra) | *worked* (/wɜːkt/), *watched* (/wɒtʃt/), *stopped* (/stɒpt/), *laughed* |
| **Consonante Sonora (Voiced) o Vocal:** /b, g, v, z, m, n, l, r/ y vocales | **/d/** (Sin sílaba extra) | *cleaned* (/kliːnd/), *lived* (/lɪvd/), *played* (/pleɪd/), *called* |

#### C. Catálogo de Verbos Irregulares Clave en Admisión
Los verbos irregulares no añaden *-ed*; modifican su raíz o adoptan formas supletivas:

\begin{array}{|l|l|l||l|l|l|}
\hline
\textbf{Base Form} & \textbf{Past Simple} & \textbf{Significado} & \textbf{Base Form} & \textbf{Past Simple} & \textbf{Significado} \\ \hline
\text{be} & \text{was / were} & \text{ser / estar} & \text{give} & \text{gave} & \text{dar} \\ \hline
\text{begin} & \text{began} & \text{empezar} & \text{go} & \text{went} & \text{ir} \\ \hline
\text{break} & \text{broke} & \text{romper} & \text{have} & \text{had} & \text{tener / haber} \\ \hline
\text{bring} & \text{brought} & \text{traer} & \text{know} & \text{knew} & \text{saber / conocer} \\ \hline
\text{buy} & \text{bought} & \text{comprar} & \text{make} & \text{made} & \text{hacer / fabricar} \\ \hline
\text{choose} & \text{chose} & \text{elegir} & \text{read} & \text{read (/red/)} & \text{leer} \\ \hline
\text{do} & \text{did} & \text{hacer} & \text{see} & \text{saw} & \text{ver} \\ \hline
\text{drive} & \text{drove} & \text{conducir} & \text{speak} & \text{spoke} & \text{hablar} \\ \hline

## 3. GRAMMAR PATTERNS & STRUCTURE TAXONOMY
## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES

### 4.1. Algoritmo de Decisión: ¿*Will* o *Be Going To*?


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t02_s01_c01",
                    question = "Choose the correct past form of the verbs in parentheses to complete the historical statement:",
                    options = listOf(
                        "traveled - bringed",
                        "travelled - brought",
                        "travel - brought",
                        "was traveling - brought"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. El primer verbo es *travel* (regular): al añadir *-ed*, en inglés británico se duplica la 'l' (*travelled*) y en americano se admite *traveled*. 2. El segundo verbo es *bring* (irregular): su pasado simple es una forma supletiva irregular indiscutible: **brought** (nunca *bringed* ni *brang*). La combinación formalmente válida es *travelled - brought*. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t02_s01_c02",
                    question = "In which of the following verbs is the past ending **\"-ed\"** pronounced as the distinct additional syllable **/ɪd/**?",
                    options = listOf(
                        "Played",
                        "Worked",
                        "Decided",
                        "Cleaned"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** La desinencia *-ed* solo se pronuncia como sílaba plena **/ɪd/** cuando el verbo base finaliza en los fonemas alveolares **/t/** o **/d/**: - *Play* termina en vocal \\rightarrow /d/ - *Work* termina en /k/ sorda \\rightarrow /t/ - *Clean* termina en /n/ sonora \\rightarrow /d/ - *Watch* termina en /tʃ/ sorda \\rightarrow /t/ - *Decide* termina en el sonido **/d/** (/dɪˈsaɪd/) \\rightarrow **decided** (/dɪˈsaɪdɪd/ = **/ɪd/**). **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t02_s01_c03",
                    question = "Identify the sentence that contains a **GRAMMATICAL ERROR**:",
                    options = listOf(
                        "Did you attend the university seminar on renewable energy last week?",
                        "They didn't find any relevant sources for their history essay.",
                        "Why did the professor postponed the laboratory examination?",
                        "She didn't have enough time to complete the geometry test."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** En la alternativa **C**, la oración formula una pregunta en Past Simple utilizando el auxiliar *did*: *\"Why did the professor postponed...\"*. La presencia del operador *did* exige que el verbo principal se mantenga en su **forma base**. Emplear *postponed* incurre en la trampa de la doble marca de pasado. La forma correcta es: *\"Why did the professor **postpone** the laboratory examination?\"*. **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t02_s01_c04",
                    question = "How do you pronounce *-ed* when the base verb ends in /t/ or /d/?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "As a separate extra syllable pronounced **/ɪd/** (*e.g., wanted, needed*)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: As a separate extra syllable pronounced **/ɪd/** (*e.g., wanted, needed*)."
                ),
                Challenge(
                    id = "ing_t02_s01_c05",
                    question = "What happens to the past verb when *didn't* is used?",
                    options = listOf(
                        "The verb **loses its past form** and returns to the **base infinitive** (*She didn't write, NOT: didn't wrote*).",
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 0,
                    explanation = "According to the lesson theory: The verb **loses its past form** and returns to the **base infinitive** (*She didn't write, NOT: didn't wrote*)."
                ),
                Challenge(
                    id = "ing_t02_s01_c06",
                    question = "When MUST you use *Be going to* instead of *Will*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "1. For **premeditated plans / intentions** made before speaking. 2. For predictions with **visible physical evidence** right now.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 1,
                    explanation = "According to the lesson theory: 1. For **premeditated plans / intentions** made before speaking. 2. For predictions with **visible physical evidence** right now."
                ),
                Challenge(
                    id = "ing_t02_s01_c07",
                    question = "*\"I _______ (see) a documentary about astronomy on television last night.\"*",
                    options = listOf(
                        "seed",
                        "saw",
                        "am seeing",
                        "have saw"
                    ),
                    correctIndex = 1,
                    explanation = "(Pasado simple irregular de *see*)."
                ),
                Challenge(
                    id = "ing_t02_s01_c08",
                    question = "Look at that glass on the edge of the desk! It _______ fall!",
                    options = listOf(
                        "will",
                        "is going to",
                        "did",
                        "would"
                    ),
                    correctIndex = 1,
                    explanation = "(Evidencia física inminente observable)."
                ),
                Challenge(
                    id = "ing_t02_s01_c09",
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
                    id = "ing_t02_s01_c10",
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
            id = "ing_t02_s02",
            title = "Pasado Simple (Regulares e Irregulares) y Formas de Futuro (Be going to vs. Will) - Applied Skills, Hacks & Reading Practice",
            theory = LessonTheory(
                title = "Pasado Simple (Regulares e Irregulares) y Formas de Futuro (Be going to vs. Will) - Applied Skills, Hacks & Reading Practice",
                content = """## 1. APPLIED GRAMMAR & ADVANCED STRUCTURES - PART II
\text{eat} & \text{ate} & \text{comer} & \text{take} & \text{took} & \text{tomar / llevar} \\ \hline
\text{find} & \text{found} & \text{encontrar} & \text{write} & \text{wrote} & \text{escribir} \\ \hline
\end{array}

#### D. Sintaxis del Pasado Simple con el Operador Auxiliar *DID*
- **Afirmativa:** \text{Subject} + \mathbf{Past \ Verb \ (-ed \ / \ irregular)} + \text{Complement}
  *Alexander Fleming **discovered** penicillin in 1928.*
- **Negativa:** \text{Subject} + \mathbf{did \ not \ (didn't)} + \mathbf{Base \ Verb} + \text{Complement}
  *The students **didn't understand** the mathematical theorem.*
- **Interrogativa:** \mathbf{Did} + \text{Subject} + \mathbf{Base \ Verb} + \text{Complement} + ?
  ***Did** you **finish** the laboratory report yesterday? \rightarrow Yes, I did. / No, I didn't.*
> **LECCIÓN DE ORO:** Tras el auxiliar *did* o *didn't*, el verbo principal **SIEMPRE VUELVE A SU FORMA BASE**. Está terminantemente prohibido duplicar el pasado: \times *Did you went?* \rightarrow \checkmark *Did you go?*.

---

### 3.2. Formas de Futuro en Inglés: *Be Going To* vs. *Will*

#### A. *Be Going To* (Futuro Intencional y Evidencial)
\text{Subject} + \mathbf{am \ / \ is \ / \ are \ + \ going \ to} + \mathbf{Base \ Verb} + \text{Complement}
Se utiliza preceptivamente en dos contextos semánticos:
1. **Planes, Intenciones y Decisiones Premeditadas:** Decisiones tomadas **antes** del momento de hablar (*prior plans*).
   *I **am going to study** Medicine at UNSA next year.* (Ya lo decidí, es mi plan firme).
2. **Predicciones basadas en Evidencia Presente Observable:** Hay señales físicas visibles en el entorno que garantizan el desenlace.
   *Look at those dark, heavy clouds over the Misti! It **is going to rain**.*

#### B. *Will* (Futuro Espontáneo, Volitivo y Especulativo)
\text{Subject} + \mathbf{will \ / \ won't} + \mathbf{Base \ Verb} + \text{Complement}
Se utiliza preceptivamente en:
1. **Decisiones Espontáneas e Improvisadas:** Tomadas en el **mismo instante** de la conversación (*on-the-spot decisions*).
   *— The telephone is ringing. — Don't worry, I **will answer** it.*
2. **Promesas, Ofertas, Amenazas y Rechazos:**
   *I **will always support** you.* / *I **will help** you with that heavy box.*
3. **Predicciones basadas en Creencias Subjetivas u Opiniones:** Introducidas comúnmente por *I think, I believe, I doubt, perhaps, probably*:
   *I think technology **will transform** higher education by 2030.*

---


## 2. PRE-UNIVERSITY HACKS & MNEMOTECHNICS
\text{¿Existe un plan previo o una evidencia física visible ahora?} \begin{cases} \text{SÍ} \longrightarrow \mathbf{BE \ GOING \ TO} \quad (\text{Plan previo o evidencia presente}) \\ \text{NO} \longrightarrow \begin{cases} \text{¿Decisión espontánea en el momento?} \longrightarrow \mathbf{WILL} \\ \text{¿Promesa u oferta de ayuda?} \longrightarrow \mathbf{WILL} \\ \text{¿Opinión personal subjetiva (I think)?} \longrightarrow \mathbf{WILL} \end{cases} \end{cases}

---


## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS

### 1. El Hack de la Pronunciación de *-ed*: "La Regla de la T y la D"
Únicamente si el verbo base termina en sonido **/t/** o **/d/**, la terminación *-ed* se pronuncia como una sílaba completa **/ɪd/**:
\text{Termina en T o D} \longrightarrow \mathbf{/ɪd/} \quad (\text{Wan\textbf{t}ed, Nee\textbf{d}ed, Star\textbf{t}ed, Deci\textbf{d}ed})
En todos los demás casos, NO se pronuncia la 'e'; se pega directamente como /t/ o /d/ monosilábico.

### 2. Mnemotécnia de las Tres P de "Will"
\mathbf{P}\text{romise} \quad | \quad \mathbf{P}\text{robably (I think)} \quad | \quad \mathbf{P}\text{rompt decision (Espontánea)}

---


## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS
## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **La Doble Marca de Pasado (Double Past Trap):**
   - *Error fatal de examen:* \times *She didn't ate lunch.* / \times *Did you went home?*
   - *Regla inviolable:* El auxiliar *didn't / did* absorbe el tiempo pretérito; el verbo acompañante va obligatoriamente en **forma base infinitiva**: \checkmark *She didn't **eat** lunch* / \checkmark *Did you **go** home?*.
2. **Confundir Predicción con Evidencia vs. Predicción Subjetiva:**
   - *Caso con evidencia visual:* *"The boy is running towards the cliff. He is going to fall!"* (Usar *will fall* aquí es error de admisión, pues hay evidencia empírica inminente).
3. **El Pasado del Verbo To Be (Was vs. Were):**
   - *I, He, She, It* \longrightarrow **WAS / WASN'T**
   - *You, We, They* \longrightarrow **WERE / WEREN'T**
   - (¡Cuidado con sustantivos colectivos o plurales irregulares!: *The children **were** playing*, no *was*).

---


## 4. REAL-WORLD CONTEXT & READING PASSAGES
## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL

### Caso 1: El Diálogo en la Cafetería Universitaria
- **Situación:** Dos postulantes conversan en la cafetería.
  - *Applicant A:* *"I didn't bring my wallet; I can't pay for the coffee."*
  - *Applicant B:* *"Don't worry, I **will lend** you some money."*
- **Análisis Gramatical:** El postulante B no tenía planeado desde su casa prestarle dinero; la decisión surge como una reacción espontánea y solidaria en el momento exacto del habla. El uso de *I am going to lend you* sería incorrecto en este contexto pragmático.
- Si luego el postulante B le cuenta a un tercero:
  - *"I **am going to buy** tickets for the science fair this afternoon; I already saved the money."*
  - **Uso Correcto:** *Be going to*, pues la compra es un plan premeditado previo con dinero apartado deliberadamente.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t02_s02_c01",
                    question = "Analyze the contextual dialogue:",
                    options = listOf(
                        "will",
                        "am going to",
                        "am to",
                        "would"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** David responde afirmativamente (*\"Yes...\"*) e indica que ya llenó la orden de compra (*\"I've already filled out the purchase requisition\"*). Esto demuestra irrefutablemente que la decisión fue meditada con anterioridad y constituye un plan previo firme (*premeditated plan*). La estructura canónica para planes previos es **be going to**: *I am going to purchase*. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t02_s02_c02",
                    question = "Read the text and fill in the three numbered blanks with the most precise sequence of grammatical forms:",
                    options = listOf(
                        "(1) will submit - (2) will overheat - (3) am going to fix",
                        "(1) are going to submit - (2) is going to overheat - (3) will fix",
                        "(1) submitted - (2) overheats - (3) am fixing",
                        "(1) were going to submit - (2) will overheat - (3) will fix"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Espacio (1):** En estilo directo o reporte de planes futuros acordados: *we are going to submit* expresa el plan previo anunciado por el líder. 2. **Espacio (2):** El conductor observa humo saliendo del motor (evidencia física presente observable directa); por tanto, la predicción de que el motor va a recalentarse/fallar se construye con **be going to**: *The engine is going to overheat!*. 3. **Espacio (3):** El mecánico ofrece su ayuda voluntaria inmediata y espontánea tras llegar al lugar (*\"Don't worry...\"*); las ofertas y decisiones de socorro en el acto se construyen preceptivamente con **will**: *I will fix it*. La combinación armónica y exacta es la alternativa **B**. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t02_s02_c03",
                    question = "When MUST you use *Will* instead of *Be going to*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "1. For **spontaneous decisions** made at the moment of speaking. 2. For **promises, offers, and subjective opinions** (*I think...*).",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 2,
                    explanation = "According to the lesson theory: 1. For **spontaneous decisions** made at the moment of speaking. 2. For **promises, offers, and subjective opinions** (*I think...*)."
                ),
                Challenge(
                    id = "ing_t02_s02_c04",
                    question = "What are the past simple forms of *be*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "***Was*** (for *I, he, she, it*) and ***Were*** (for *you, we, they*)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: ***Was*** (for *I, he, she, it*) and ***Were*** (for *you, we, they*)."
                ),
                Challenge(
                    id = "ing_t02_s02_c05",
                    question = "*\"Why _______ you call the emergency services after the car crash?\"*",
                    options = listOf(
                        "did",
                        "was",
                        "were",
                        "did you"
                    ),
                    correctIndex = 0,
                    explanation = "(Auxiliar de pregunta en pasado simple: *Why did you call...*)."
                ),
                Challenge(
                    id = "ing_t02_s02_c06",
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
                    id = "ing_t02_s02_c07",
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
                    id = "ing_t02_s02_c08",
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
                    id = "ing_t02_s02_c09",
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
                    id = "ing_t02_s02_c10",
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
