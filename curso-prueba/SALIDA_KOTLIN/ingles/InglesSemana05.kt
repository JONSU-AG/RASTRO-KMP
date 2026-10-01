package ingles

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object InglesSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "ing_t05_s01",
            title = "Sistema Pronominal, Preposiciones (Tiempo, Lugar, Movimiento) y Sintaxis de la Oración - Core Rules & Foundations",
            theory = LessonTheory(
                title = "Sistema Pronominal, Preposiciones (Tiempo, Lugar, Movimiento) y Sintaxis de la Oración - Core Rules & Foundations",
                content = """## 1. COURSE OVERVIEW & CONCEPTUAL FRAMEWORK
## 1. PORTADA Y METADATOS CURRICULARES

| Campo | Detalle |
| :--- | :--- |
| **Eje Temático** | Eje 07: Idioma Extranjero (Inglés) |
| **Materia** | Gramática, Sintaxis y Morfosintaxis Inglesa (A2 - B1 CEFR) |
| **Nivel de Dificultad** | Preuniversitario Avanzado (UNSA / CEPRUNSA) |
| **Tiempo de Estudio Recomendado** | 4.5 horas |
| **Resolución Curricular** | R.C.U. N.° 0028-2026 (Admisión 2027) |
| **Prerrequisitos** | Tiempos Verbales, Modales y Conectores Lógicos (Temas 01 al 04) |
| **Objetivo Pedagógico** | Dominar el sistema pronominal completo (subject, object, possessive adjectives/pronouns, reflexive pronouns); aplicar con exactitud matemática las preposiciones esenciales (*at, on, in* de tiempo y lugar, y preposiciones de movimiento); internalizar el orden sintáctico canónico de la oración inglesa (SVO y orden de adjetivos OSASCOMP); y resolver ejercicios de transformación de enunciados, paráfrasis y detección de errores de admisión. |

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Pronouns, Prepositions & English Syntax] --> B[Pronominal Architecture]
    B --> B1[Subject Pronouns: I, you, he, she, it, we, they - Syntactic subjects]
    B --> B2[Object Pronouns: me, you, him, her, it, us, them - Direct/Indirect objects]
    B --> B3[Possessive Adjectives my, your + NOUN vs Possessive Pronouns mine, yours NO NOUN]
    B --> B4[Reflexive Pronouns: myself, himself, themselves - Coreferential / Emphatic]

    A --> C[Prepositional Matrix]
    C --> C1[Time Pyramid: AT specific hour / ON days & dates / IN months, years, parts of day]
    C --> C2[Place Pyramid: AT specific point / ON surface or street / IN enclosed space or city]
    C --> C3[Movement: to, into, out of, across, through, towards]

    A --> D[English Sentence Syntax]
    D --> D1[Canonical Order: Subject + Verb + Object + Place + Time S-V-O-P-T]
    D --> D2[Adjective Pre-modification: Adjectives precede nouns - OSASCOMP order]
    D --> D3[Sentence Transformation: Paraphrase, active/passive, error identification]
```

---


## 2. FORMAL THEORETICAL FOUNDATIONS - PART I
## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA

### 3.1. El Sistema Pronominal del Inglés
En la gramática inglesa, los pronombres y determinantes se articulan en un sistema jerárquico estricto según su función sintáctica oracional:

| Persona y Número | Subject Pronoun (Sujeto) | Object Pronoun (Objeto) | Possessive Adjective (+ Noun) | Possessive Pronoun (Solo) | Reflexive Pronoun |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **1.ª sing.** | **I** | **me** | **my** (*my book*) | **mine** (*It is mine*) | **myself** |
| **2.ª sing.** | **you** | **you** | **your** (*your car*) | **yours** (*It is yours*) | **yourself** |
| **3.ª sing. masc.** | **he** | **him** | **his** (*his phone*) | **his** (*It is his*) | **himself** |
| **3.ª sing. fem.** | **she** | **her** | **her** (*her bag*) | **hers** (*It is hers*) | **herself** |
| **3.ª neutro** | **it** | **it** | **its** (*its color*) | — | **itself** |
| **1.ª plural** | **we** | **us** | **our** (*our class*) | **ours** (*It is ours*) | **ourselves** |
| **2.ª plural** | **you** | **you** | **your** (*your tasks*) | **yours** (*They are yours*) | **yourselves** |
| **3.ª plural** | **they** | **them** | **their** (*their lab*) | **theirs** (*It is theirs*) | **themselves** |

#### Reglas de Oro Pronominales:
1. **Possessive Adjective vs. Possessive Pronoun:**
   - El *Possessive Adjective* acompaña **obligatoriamente** a un sustantivo (Adj + N): *This is **my laptop**.*
   - El *Possessive Pronoun* sustituye al sustantivo y **NUNCA** va seguido de un nombre: *This laptop is **mine**.* (NUNCA: \times *This is mine laptop*).
2. **Cuidado con "Its" vs. "It's":**
   - *Its:* Adjetivo posesivo neutro sin apóstrofo (*The cat licked **its** paw*).
   - *It's:* Contracción de *it is* o *it has* (*It's raining* / *It's been a long time*).
3. **Reflexive Pronouns:** Indican que el sujeto y el objeto de la acción verbal son idénticos (*He cut **himself** while slicing fruit*) o añaden énfasis enfático (*The dean **himself** signed the diplomas*).

---

### 3.2. La Matriz Preposicional: Preposiciones de Tiempo, Lugar y Movimiento

#### A. La Pirámide de Especificidad: *AT, ON, IN*
Tanto para el tiempo como para el espacio, el inglés opera mediante una pirámide conceptual de lo más general a lo más específico:

```
                  ▲
                 / \
                /   \     AT (Muy específico: Horas puntuales / Puntos exactos)
               /  AT \    Time: at 8:30 AM, at noon, at midnight, at night.
              /───────\   Place: at the bus stop, at the door, at home.

## 3. GRAMMAR PATTERNS & STRUCTURE TAXONOMY
## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES

### 4.1. Reglas Mnemotécnicas de Selección Preposicional

\begin{array}{|l|l|l|}
\hline
\textbf{Categoría} & \textbf{Preposición} & \textbf{Ejemplos Obligatorios} \\ \hline

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t05_s01_c01",
                    question = "Fill in the blanks with the correct pair of possessive forms:",
                    options = listOf(
                        "your - my",
                        "yours - mine",
                        "your - mine",
                        "yours - my"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** En ambos espacios los elementos se encuentran al final de la cláusula y carecen de un sustantivo expreso acompañante. Por lo tanto, la sintaxis exige el uso de **Possessive Pronouns** (pronombres posesivos independientes): *yours* (el tuyo) y *mine* (el mío). La oración correcta es: *\"is this blue backpack yours or is it mine?\"*. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t05_s01_c02",
                    question = "Choose the correct prepositions to complete the academic announcement:",
                    options = listOf(
                        "in - on - at",
                        "on - at - in",
                        "at - on - in",
                        "on - in - at"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. *Sunday* es un día de la semana \\rightarrow Requiere la preposición **on**. 2. *8:00 AM* es una hora puntual precisa \\rightarrow Requiere la preposición **at**. 3. *March 2027* es una fecha compuesta por mes y año sin día específico \\rightarrow Requiere la preposición **in**. La secuencia correcta es: **on - at - in**. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t05_s01_c03",
                    question = "Select the phrase that shows the grammatically correct adjective order:",
                    options = listOf(
                        "A leather black Italian luxury jacket.",
                        "A luxury Italian black leather jacket.",
                        "A black luxury Italian leather jacket.",
                        "An Italian luxury black leather jacket."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** Aplicando la jerarquía OSASCOMP: 1. *Opinion / Value:* **luxury** (lujosa). 2. *Color:* **black** (negra). 3. *Origin:* **Italian** (italiana). 4. *Material:* **leather** (de cuero). 5. *Noun:* **jacket** (chaqueta). La combinación correcta es: *A luxury black Italian leather jacket* (o *A luxury Italian black leather jacket* según el matiz de opinión inicial, siendo B la que sitúa la cualidad de opinión/clasificación *luxury* antes del origen y material). **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t05_s01_c04",
                    question = "What is the difference between *Its* and *It's*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "***Its*** is the neutral possessive adjective (*The cat licked its paw*). ***It's*** is the contraction of *it is* or *it has* (*It's cold*)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: ***Its*** is the neutral possessive adjective (*The cat licked its paw*). ***It's*** is the contraction of *it is* or *it has* (*It's cold*)."
                ),
                Challenge(
                    id = "ing_t05_s01_c05",
                    question = "What preposition of time do you use for days and dates (*e.g., Monday, July 28th*)?",
                    options = listOf(
                        "Preposition ***ON*** (*on Monday, on July 28th*).",
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 0,
                    explanation = "According to the lesson theory: Preposition ***ON*** (*on Monday, on July 28th*)."
                ),
                Challenge(
                    id = "ing_t05_s01_c06",
                    question = "What preposition do you use for exact hours (*e.g., 7:00 AM, midnight*)?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "Preposition ***AT*** (*at 7:00 AM, at midnight*).",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 1,
                    explanation = "According to the lesson theory: Preposition ***AT*** (*at 7:00 AM, at midnight*)."
                ),
                Challenge(
                    id = "ing_t05_s01_c07",
                    question = "*\"We traveled to Cusco _______ bus and stayed _______ a cozy hotel _______ the city center.\"*",
                    options = listOf(
                        "in - on - at",
                        "by - in - in",
                        "on - at - on",
                        "with - in - at"
                    ),
                    correctIndex = 1,
                    explanation = "(*By bus* para medios de transporte general; *in a hotel* e *in the city center* para recintos y áreas urbanas)."
                ),
                Challenge(
                    id = "ing_t05_s01_c08",
                    question = "*\"Is that new sports car _______?\"*",
                    options = listOf(
                        "their",
                        "they",
                        "theirs",
                        "them"
                    ),
                    correctIndex = 2,
                    explanation = "(Pronombre posesivo independiente sin sustantivo: *theirs*)."
                ),
                Challenge(
                    id = "ing_t05_s01_c09",
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
                    id = "ing_t05_s01_c10",
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
            id = "ing_t05_s02",
            title = "Sistema Pronominal, Preposiciones (Tiempo, Lugar, Movimiento) y Sintaxis de la Oración - Applied Skills, Hacks & Reading Practice",
            theory = LessonTheory(
                title = "Sistema Pronominal, Preposiciones (Tiempo, Lugar, Movimiento) y Sintaxis de la Oración - Applied Skills, Hacks & Reading Practice",
                content = """## 1. APPLIED GRAMMAR & ADVANCED STRUCTURES - PART II
             /         \
            /    ON     \ ON (Mediana escala: Días, fechas / Superficies, calles)
           /─────────────\Time: on Monday, on May 15th, on my birthday.
          /               \Place: on the table, on the floor, on San Jerónimo Street.
         /       IN        \
        /                   \ IN (Gran escala: Siglos, años, meses / Espacios cerrados, ciudades, países)
       /─────────────────────\Time: in 2027, in July, in winter, in the morning.
      Place: in the classroom, in Arequipa, in Peru, in Europe.
```

#### B. Preposiciones de Movimiento y Dirección
Indican desplazamiento o trayectoria hacia un destino:
- **To:** Dirección general hacia un punto (*She walked to the faculty*).
- **Into:** Movimiento hacia el **interior** de un espacio cerrado (*He ran into the laboratory*).
- **Out of:** Movimiento hacia el **exterior** de un recinto (*They came out of the lecture hall*).
- **Across:** Cruce de un lado a otro sobre una superficie o línea (*walking across the street*).
- **Through:** Atravesar un volumen tridimensional (*walking through the tunnel / forest*).
- **Towards:** Desplazamiento en dirección o rumbo a (*He is heading towards the library*).

---

### 3.3. Sintaxis Canónica de la Oración Inglesa
El idioma inglés es una lengua de ordenamiento sintáctico rígido donde la posición de los elementos determina su función gramatical.

#### A. Orden Canónico Oracional: S-V-O-P-T
\mathbf{Subject} + \mathbf{Verb} + \mathbf{Object} + (\mathbf{Manner}) + \mathbf{Place} + \mathbf{Time}
- *Incorrecto en inglés:* \times *Yesterday bought John in Arequipa a new computer.*
- *Correcto en inglés:* \checkmark *John **[S]** bought **[V]** a new computer **[O]** in Arequipa **[Place]** yesterday **[Time]**.*

#### B. Orden Canónico de los Adjetivos Antepuestos (Regla OSASCOMP)
Cuando dos o más adjetivos calificativos modifican a un mismo sustantivo, deben anteponerse siguiendo un orden jerárquico riguroso:

\mathbf{Opinion} \rightarrow \mathbf{Size} \rightarrow \mathbf{Age} \rightarrow \mathbf{Shape} \rightarrow \mathbf{Color} \rightarrow \mathbf{Origin} \rightarrow \mathbf{Material} \rightarrow \mathbf{Purpose} \rightarrow \mathbf{NOUN}

- *Ejemplo canónico:* *A **beautiful** (opinion) **small** (size) **ancient** (age) **round** (shape) **brown** (color) **Peruvian** (origin) **wooden** (material) table.*

---


## 2. PRE-UNIVERSITY HACKS & MNEMOTECHNICS
\text{Hora exacta / Momento preciso} & \mathbf{AT} & \textit{at 7:00 AM, at midday, at dawn, at sunset, at night} \\ \hline
\text{Día de la semana / Fechas con día} & \mathbf{ON} & \textit{on Tuesday, on Friday afternoon, on July 28th} \\ \hline
\text{Mes / Año / Estación / Década} & \mathbf{IN} & \textit{in December, in 2027, in spring, in the 21st century} \\ \hline
\text{Partes del día (con artículo)} & \mathbf{IN} & \textit{in the morning, in the afternoon, in the evening} \\ \hline
\end{array}

---


## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS

### 1. El Hack de las Preposiciones de Transporte Público
- Si puedes **estar de pie o caminar adentro** del transporte \longrightarrow usa **ON**:
  - *On the bus, on the train, on the plane, on the ship.* (También: *on a bicycle, on a motorcycle*).
- Si tienes que **agacharte para entrar** y solo puedes sentarte \longrightarrow usa **IN**:
  - *In a car, in a taxi, in a helicopter.*

### 2. Mnemotécnia de la Pirámide: "IN - ON - AT"
\mathbf{IN} \ (\text{Grande / Meses / Países}) \quad \longrightarrow \quad \mathbf{ON} \ (\text{Medio / Días / Calles}) \quad \longrightarrow \quad \mathbf{AT} \ (\text{Puntual / Horas / Direcciones exactas})

---


## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS
## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **Posponer el adjetivo por calco del español:**
   - *Error:* \times *He is a student brilliant.*
   - *Norma:* El adjetivo calificativo se antepone obligatoriamente al sustantivo que modifica: \checkmark *He is a **brilliant student***.
2. **Confundir "at night" con "in the night":**
   - La expresión canónica habitual en inglés es **at night** (*He studies at night*).
   - En cambio, las demás partes del día llevan *in the*: *in the morning, in the afternoon, in the evening*.
3. **Usar pronombre sujeto después de preposiciones:**
   - *Error:* \times *She sat between John and I.*
   - *Norma:* Tras una preposición (*between*), los pronombres deben adoptar la forma de **Object Pronoun**: \checkmark *She sat between John and **me***.

---


## 4. REAL-WORLD CONTEXT & READING PASSAGES
## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL

### Caso 1: Detección y Corrección Forense de Errores Sintácticos (Error Analysis)
En la redacción de una carta de postulación académica de un estudiante hispanohablante:
> *"I write this letter for to explain you my situation. In the last year, I worked very hard with my professors for improve mine laboratory skills. Yesterday arrived the notification from the university."*

- **Análisis de Incorrecciones Gramaticales:**
  1. *for to explain you:* En inglés, la finalidad se expresa con *to-infinitive* (*to explain*); además, *explain* exige la preposición *to* para personas (*to explain my situation to you*).
  2. *In the last year:* Las expresiones con *last* o *next* no llevan preposición (*Last year*, no *In the last year*).
  3. *for improve:* Las preposiciones exigen gerundio o infinitivo de finalidad (*to improve*).
  4. *mine laboratory skills:* *Mine* es pronombre posesivo y no puede llevar un sustantivo detrás; debe ser el adjetivo posesivo **my** (*my laboratory skills*).
  5. *Yesterday arrived the notification:* Inversión sintáctica indebida calco del español. El orden canónico exige Sujeto + Verbo: *The notification arrived yesterday*.
- **Versión Impecable Corregida:**
  > *"I am writing this letter to explain my situation to you. Last year, I worked very hard with my professors to improve my laboratory skills. The notification arrived yesterday."*

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t05_s02_c01",
                    question = "Complete the narrative sentence correctly:",
                    options = listOf(
                        "into - on",
                        "out of - on",
                        "across - in",
                        "towards - at"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. El contexto de una evacuación de emergencia (*emergency drill*) implica salir del recinto interior de la clase hacia afuera: **out of** the classroom. 2. Reunirse en el espacio abierto de la cancha deportiva (superficie): **on** the soccer field. La combinación congruente es **out of - on**. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t05_s02_c02",
                    question = "Identify the sentence that is **100% GRAMMATICALLY FLAWLESS**:",
                    options = listOf(
                        "Between you and I, I think that their new proposal is not as viable as ours.",
                        "The dog wagged it's tail enthusiastically when John arrived at home yesterday night.",
                        "Professor Ramirez, whom teaches organic chemistry, published an exceptional scientific paper last month.",
                        "She gave him the keys because he had forgotten his at the office."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** Examinemos minuciosamente las alternativas: - **A (Incorrecta):** La locución preposicional *Between...* exige pronombres de objeto: debe decirse *Between you and **me***, no *I*. - **B (Incorrecta):** *it's* es la contracción de *it is*; el posesivo animal sin apóstrofo es **its tail**. Además, se dice *last night*, no *yesterday night*, y *arrived home* no lleva *at*. - **C (Incorrecta):** *whom* solo se usa como pronombre objeto; al actuar como sujeto del verbo *teaches*, debe emplearse el pronombre relativo sujeto **who**. - **D (Incorrecta):** *his* como pronombre posesivo es correcto, pero la oración E es estructuralmente más sólida y canónica en sintaxis S-V-O-M-P-T. No obstante, en D falta el complemento directo explícito o genera ambigüedad de posesivo. - **E (CORRECTA E IMPECABLE):** - *Subject:* The students. - *Verb:* presented. - *Object:* their research results. - *Manner:* clearly. - *Place:* in the auditorium. - *Time:* on Friday afternoon (preposición *on* correcta para día de la semana con parte del día). Cumple con estricta perfección matemática el orden oracional canónico en inglés (S-V-O-M-P-T) y las reglas preposicionales. **Respuesta:** **E** ---"
                ),
                Challenge(
                    id = "ing_t05_s02_c03",
                    question = "What is the correct order of adjectives before a noun (OSASCOMP)?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "**O**pinion \\rightarrow **S**ize \\rightarrow **A**ge \\rightarrow **S**hape \\rightarrow **C**olor \\rightarrow **O**rigin \\rightarrow **M**aterial \\rightarrow **P**urpose.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 2,
                    explanation = "According to the lesson theory: **O**pinion \\rightarrow **S**ize \\rightarrow **A**ge \\rightarrow **S**hape \\rightarrow **C**olor \\rightarrow **O**rigin \\rightarrow **M**aterial \\rightarrow **P**urpose."
                ),
                Challenge(
                    id = "ing_t05_s02_c04",
                    question = "Why is *\"She sat between my brother and I\"* incorrect?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "Because after prepositions (*between*), you must use **Object Pronouns**: *between my brother and **me***."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: Because after prepositions (*between*), you must use **Object Pronouns**: *between my brother and **me***."
                ),
                Challenge(
                    id = "ing_t05_s02_c05",
                    question = "Complete with the appropriate preposition of movement: *\"The train passed _______ the long mountain tunnel.\"*",
                    options = listOf(
                        "across",
                        "through",
                        "over",
                        "onto"
                    ),
                    correctIndex = 1,
                    explanation = "(*Through* se usa para atravesar volúmenes tridimensionales huecos como túneles o bosques)."
                ),
                Challenge(
                    id = "ing_t05_s02_c06",
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
                    id = "ing_t05_s02_c07",
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
                    id = "ing_t05_s02_c08",
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
                    id = "ing_t05_s02_c09",
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
                    id = "ing_t05_s02_c10",
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
