package ingles

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object InglesSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "ing_t06_s01",
            title = "Reading Comprehension: Estrategias (Skimming & Scanning) y Tipologías Textuales Breves - Core Rules & Foundations",
            theory = LessonTheory(
                title = "Reading Comprehension: Estrategias (Skimming & Scanning) y Tipologías Textuales Breves - Core Rules & Foundations",
                content = """## 1. COURSE OVERVIEW & CONCEPTUAL FRAMEWORK
## 1. PORTADA Y METADATOS CURRICULARES

| Campo | Detalle |
| :--- | :--- |
| **Eje Temático** | Eje 07: Idioma Extranjero (Inglés) |
| **Materia** | Lectura y Comprensión de Textos en Inglés (A2 - B1 CEFR) |
| **Nivel de Dificultad** | Preuniversitario Avanzado (UNSA / CEPRUNSA) |
| **Tiempo de Estudio Recomendado** | 4.0 horas |
| **Resolución Curricular** | R.C.U. N.° 0028-2026 (Admisión 2027) |
| **Prerrequisitos** | Vocabulario básico en lengua inglesa, nociones de lectura global |
| **Objetivo Pedagógico** | Dominar las técnicas de lectura rápida (*Skimming* para la idea principal y *Scanning* para información puntual); reconocer tipologías textuales funcionales (notices, job advertisements, emails, personal profiles, brochures); e inferir significados contextuales con exactitud rigurosa para el examen de admisión UNSA. |

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Reading Comprehension in English] --> B[Core Reading Strategies]
    B --> B1[Skimming: Reading for Gist / Main Idea]
    B --> B2[Scanning: Reading for Specific Details / Keywords]
    B --> B3[Contextual Clues: Guessing Unknown Words]
    B --> B4[Inference: Reading Between the Lines]

    A --> C[Short Functional Text Types]
    C --> C1[Public Notices & Signs: Warnings, prohibitions, rules]
    C --> C2[Advertisements & Fliers: Prices, dates, requirements, job offers]
    C --> C3[Informal & Semi-Formal Emails: Greetings, purpose, requests, sign-offs]
    C --> C4[Descriptions: People appearance/personality, places, itineraries]

    A --> D[Evaluation Axes in UNSA Exam]
    D --> D1[Gist / Main Purpose Questions: What is the text about?]
    D --> D2[Specific Information: Who, When, Where, How much, Why?]
    D --> D3[Lexical Synonymy in Context: The word X is closest in meaning to...]
    D --> D4[True / False / Not Mentioned Statements]
```

---


## 2. FORMAL THEORETICAL FOUNDATIONS - PART I
## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA

### 3.1. Estrategias Cognitivas de Lectura en Inglés

#### A. Skimming (Lectura Veloz para la Idea Global / Gist)
- **Definición:** Técnica de lectura superficial rápida para captar la idea central, el propósito comunicativo o el tono general del texto sin detenerse en cada palabra.
- **Protocolo de Ejecución:**
  1. Leer el **título**, subtítulos y encabezados.
  2. Leer minuciosamente la **primera oración de cada párrafo** (*topic sentence*).
  3. Identificar palabras clave repetidas (*keywords*) y cognados verdaderos.
  4. Leer la oración de cierre o conclusión.
- **Preguntas Típicas en Admisión:**
  - *What is the main topic of the text?*
  - *What is the author's primary purpose?* (To inform, persuade, invite, warn).
  - *What is the best title for this passage?*

#### B. Scanning (Lectura de Barrido para Datos Específicos)
- **Definición:** Búsqueda rápida de una información puntual (fechas, cifras numéricas, nombres propios, lugares, horarios o requisitos específicos) sin leer el resto del contenido.
- **Protocolo de Ejecución:**
  1. Identificar en la pregunta la **palabra clave de búsqueda** (e.g., *price, deadline, salary, London, Dr. Harrison*).
  2. Desplazar la mirada en zig-zag sobre el texto buscando únicamente esa palabra o sus sinónimos directos.
  3. Una vez localizada la palabra clave, leer con detenimiento la oración completa circundante.
- **Preguntas Típicas en Admisión:**
  - *According to the text, when will the event take place?*
  - *How much does a student ticket cost?*
  - *Who is eligible for the discount?*

#### C. Context Clues (Deducción por Contexto)
Deducción del significado de términos desconocidos mediante:
1. *Sinonimia o paráfrasis en el texto:* *The manager was furious; he was extremely angry about the delay.*
2. *Contraste / Antónimos:* *Unlike his brother who was very cautious, Peter was reckless.*
3. *Causa y Efecto:* *Due to torrential rains, the flight was delayed.*

---

## 3. GRAMMAR PATTERNS & STRUCTURE TAXONOMY
## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES

### 4.1. Cuadro de Preguntas Clave y Estrategia de Resolución

\begin{array}{|l|l|l|}
\hline
\textbf{Tipo de Pregunta} & \textbf{Pregunta Modelo en Examen} & \textbf{Estrategia Cognitiva} \\ \hline

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t06_s01_c01",
                    question = "What is the primary purpose of this announcement?",
                    options = listOf(
                        "To describe the history of biotechnology in Latin America.",
                        "To invite people and provide key details about an upcoming scientific conference.",
                        "To warn students about laboratory safety regulations.",
                        "To announce the opening of a new hospital in Arequipa."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El texto informa sobre un evento académico futuro (*3rd Annual Biotech Summit*), detalla fechas, temas, tarifas de inscripción y canales de contacto. El propósito comunicativo fundamental es invitar y brindar información sobre dicha conferencia científica. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t06_s01_c02",
                    question = "According to the text, who is eligible to attend the summit free of charge?",
                    options = listOf(
                        "All international participants from Europe.",
                        "Professionals who submit their papers before September 30th.",
                        "UNSA students who hold a valid ID and register prior to October 15th.",
                        "Any student from Peruvian universities without prior registration."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** Buscando en la sección *Registration Fees*: *\"UNSA Students (with valid ID card): FREE (prior registration required before October 15th)\"*. La condición para la gratuidad es ser estudiante de la UNSA, poseer carné vigente e inscribirse antes del 15 de octubre. **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t06_s01_c03",
                    question = "In paragraph 2, the word **\"Renowned\"** in the sentence *\"Renowned speakers from Latin America and Europe will present their latest findings\"* is closest in meaning to:",
                    options = listOf(
                        "Unknown",
                        "Wealthy",
                        "Famous and respected",
                        "Inexperienced"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El término *renowned* es un adjetivo que califica a personalidades ilustres, célebres o de gran prestigio académico (*well-known, famous, highly regarded*). Por tanto, la opción equivalente es *Famous and respected*. **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t06_s01_c04",
                    question = "What is the difference between *Skimming* and *Scanning*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "**Skimming** is reading quickly for the **general idea (gist)**; **Scanning** is searching for a **specific keyword or datum** (numbers, names, dates)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: **Skimming** is reading quickly for the **general idea (gist)**; **Scanning** is searching for a **specific keyword or datum** (numbers, names, dates)."
                ),
                Challenge(
                    id = "ing_t06_s01_c05",
                    question = "What does the false cognate *\"Actually\"* mean?",
                    options = listOf(
                        "It means **in fact / really** (en realidad). It does NOT mean \"currently\" (actualmente).",
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 0,
                    explanation = "According to the lesson theory: It means **in fact / really** (en realidad). It does NOT mean \"currently\" (actualmente)."
                ),
                Challenge(
                    id = "ing_t06_s01_c06",
                    question = "What is a *\"Topic Sentence\"* in English reading?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "The sentence (usually the first one in a paragraph) that contains the **main idea** of that paragraph.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 1,
                    explanation = "According to the lesson theory: The sentence (usually the first one in a paragraph) that contains the **main idea** of that paragraph."
                ),
                Challenge(
                    id = "ing_t06_s01_c07",
                    question = "Which reading strategy would you use to find the phone number in a job ad?",
                    options = listOf(
                        "Intensive reading",
                        "Skimming",
                        "Scanning",
                        "Critical argumentation"
                    ),
                    correctIndex = 2,
                    explanation = "(Búsqueda veloz de dígitos numéricos)."
                ),
                Challenge(
                    id = "ing_t06_s01_c08",
                    question = "The sign *\"OUT OF ORDER\"* on an ATM machine means:",
                    options = listOf(
                        "The machine is working perfectly.",
                        "The machine is broken or not functioning.",
                        "You must enter your password immediately.",
                        "Only university staff can use the machine."
                    ),
                    correctIndex = 1,
                    explanation = "(*Out of order* = averiado / fuera de servicio)."
                ),
                Challenge(
                    id = "ing_t06_s01_c09",
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
                    id = "ing_t06_s01_c10",
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
            id = "ing_t06_s02",
            title = "Reading Comprehension: Estrategias (Skimming & Scanning) y Tipologías Textuales Breves - Applied Skills, Hacks & Reading Practice",
            theory = LessonTheory(
                title = "Reading Comprehension: Estrategias (Skimming & Scanning) y Tipologías Textuales Breves - Applied Skills, Hacks & Reading Practice",
                content = """## 1. APPLIED GRAMMAR & ADVANCED STRUCTURES - PART II

### 3.2. Tipologías Textuales Funcionales Breves

#### 1. Public Notices and Warnings (Avisos Públicos y Letreros)
- **Objetivo:** Comunicar mandatos, advertencias, prohibiciones o instrucciones inmediatas en espacios públicos (universidades, bibliotecas, aeropuertos, laboratorios).
- **Estructura Lingüística:** Oraciones imperativas (*Keep off the grass, Do not touch*), verbos modales de obligación o prohibición (*Must not, Passengers are required to...*), frases nominales cortas (*Staff only, Out of order*).

```
┌────────────────────────────────────────────────────────┐
│                   UNIVERSITY LIBRARY                   │
│          SILENCE MUST BE OBSERVED AT ALL TIMES         │
│   No food or sugary drinks allowed inside study rooms. │
│   Books may be borrowed for a maximum of 14 days.      │
│   Fines apply for late returns: 1.50 per day.         │
└────────────────────────────────────────────────────────┘
```

#### 2. Job Advertisements and Announcements (Anuncios Laborales y Ofertas)
- **Contenido Clave:** Cargo ofrecido (*Position / Role*), tareas (*Responsibilities*), requisitos indispensables (*Qualifications / Requirements*), salario (*Salary / Pay rate*), fecha límite (*Deadline*) y contacto (*How to apply*).
- **Términos Recurrentes:** *Full-time / Part-time, Experience required, Fluent in English, Degree in..., Send CV to...*.

#### 3. Short Emails and Messages (Correos y Notas Breves)
- **Estructura Canónica:**
  - *Salutation (Saludo):* *Dear Mr. Smith* (formal), *Hi Laura* (informal).
  - *Opening (Apertura):* *I am writing to inquire about... / Thanks for your email.*
  - *Body Paragraph (Cuerpo):* Exposición directa del propósito (petición, confirmación de cita, cambio de planes).
  - *Call to Action / Next Step:* *Please let me know if you are available.*
  - *Sign-off (Despedida):* *Sincerely / Best regards* (formal), *Cheers / See you* (informal).

#### 4. Descriptions of People, Places, and Itineraries (Descripciones e Itinerarios)
- **Descripciones Físicas y de Personalidad:** Uso de adjetivos calificativos (*tall, slim, cheerful, reliable, hard-working*), contrastes (*although, however*).
- **Itinerarios Turísticos y Agendas:** Uso de conectores de secuencia (*First, Then, After that, Finally*) y preposiciones temporales y de lugar (*at 8:00 AM, in the lobby, from Monday to Friday*).

---


## 2. PRE-UNIVERSITY HACKS & MNEMOTECHNICS
\text{Main Idea / Gist} & \textit{What is the main purpose of this email?} & \text{Skimming (Apertura, cierre y palabras repetidas)} \\ \hline
\text{Specific Detail} & \textit{What time does the conference start?} & \text{Scanning (Buscar números, horarios o símbolos \)} \\ \hline
\text{Vocabulary in Context} & \textit{In line 4, the word "vacant" is closest in meaning to...} & \text{Sustitución contextual por opciones sinónimas} \\ \hline
\text{Negative Fact} & \textit{Which of the following is NOT true according to the text?} & \text{Verificación cruzada de descarte de las 3 verdaderas} \\ \hline
\end{array}

---


## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS

### 1. El Hack de los "Wh- Words" para Scanning Inmediato
- **Who:** Buscar personas, nombres propios con mayúscula inicial (*Dr. Jenkins, Alice*).
- **When:** Buscar fechas, días, meses, años o expresiones temporales (*May 15th, 8:30 PM, next week*).
- **Where:** Buscar lugares, ciudades, edificios, preposiciones de lugar (*in Arequipa, Room 402, at the main hall*).
- **Why:** Buscar conectores de causa (*because, since, due to, in order to*).
- **How much / How many:** Buscar cifras numéricas, cantidades o precios (*25.00, three weeks, 150 participants*).

### 2. Mnemotécnia de Falsos Amigos (False Friends) en Inglés
- *Actually:* NO significa *actualmente*; significa **en realidad / de hecho**.
- *Current:* Significa **actual / presente**.
- *Attend:* NO significa *atender*; significa **asistir / estar presente**.
- *Assist:* Significa **ayudar / prestar auxilio**.
- *Realize:* NO significa *realizar*; significa **darse cuenta**.

---


## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS
## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **La Trampa de la Palabra Idéntica:**
   - *Error común:* Elegir la opción que repite exactamente las mismas palabras del texto.
   - *Realidad en UNSA/Admisión:* Con frecuencia, los distractores copian palabras literales del texto pero alteran el sentido o la negación. La respuesta correcta suele presentarse formulada con **paráfrasis o sinónimos**.
2. **Confundir "Not Mentioned" con "False":**
   - Una afirmación es **False** si el texto dice explícitamente lo contrario.
   - Una afirmación es **Not Mentioned** si la información no aparece en el texto, aunque sea lógicamente plausible en el mundo real. ¡No introduzcas conocimientos externos no verificados en el texto!
3. **Ignorar los calificadores absolutos:**
   - Palabras como *always, never, all, only, completely* en las alternativas suelen ser indicio de trampas. El texto en inglés suele usar matices (*often, some, generally, mostly*).

---


## 4. REAL-WORLD CONTEXT & READING PASSAGES
## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL

### Caso 1: Lectura de un Correo de Intercambio Universitario
> **From:** Academic Exchange Office `<exchange@unsa.edu.pe>`  
> **To:** International Applicants  
> **Subject:** Scholarship Interview Schedule  
> 
> *Dear Candidates,*  
> *Please be advised that the virtual interviews for the 2027 Global Mobility Grant have been rescheduled. Due to technical maintenance on the university server, all sessions originally planned for Friday, March 12th will now take place on Monday, March 15th at the same allocated hours.*  
> *Candidates must log in to the virtual platform at least 10 minutes prior to their appointment and present their valid passport or national ID card.*  
> *Failure to attend will result in immediate disqualification.*  
> *Best regards,*  
> *Admissions Board*

- **Análisis de Comprensión:**
  - *What happened to the interviews?* \rightarrow They were **postponed** (rescheduled to a later date: from Friday 12th to Monday 15th).
  - *Why were they rescheduled?* \rightarrow Because of **server maintenance**.
  - *What is an indispensable requirement?* \rightarrow To log in 10 minutes early and show an official ID.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t06_s02_c01",
                    question = "How much would a professional pay if they complete their registration on September 20th?",
                    options = listOf(
                        "60.00 USD",
                        "25.00 USD",
                        "48.00 USD",
                        "12.00 USD"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. La tarifa regular para *Professionals & Academics* es de **60.00 USD**. 2. El texto señala: *\"Early bird registration offers a 20% discount for general attendees who register before September 30th\"*. 3. El 20 de septiembre es antes del 30 de septiembre; por tanto, aplica el 20% de descuento: \\text{Descuento} = 0.20 \\times 60 = 12 \\ \\text{USD} \\text{Monto final a pagar} = 60 - 12 = 48 \\ \\text{USD} El participante pagará **48.00 USD**. **Respuesta:** **C** ---"
                ),
                Challenge(
                    id = "ing_t06_s02_c02",
                    question = "Based on the text, determine which of the following statements is **FALSE**:",
                    options = listOf(
                        "The conference will take place during the first week of November in Arequipa.",
                        "Participants can send abstracts and request information via email.",
                        "Laboratory workshops and certificates are included for all registered attendees.",
                        "General students will pay 20.00 USD if they register on October 1st."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** - **A (Verdadera):** Se llevará a cabo del 4 al 6 de noviembre (primera semana de noviembre). - **B (Verdadera):** Se indica el email `biotech.summit@unsa.edu.pe` para resúmenes e información. - **C (Verdadera):** *\"All registered participants will receive access to laboratory workshops... and an official accredited certificate\"*. - **E (Verdadera):** Se mencionan explícitamente *CRISPR gene editing* y *environmental remediation*. - **D (FALSA):** La tarifa para *General Students* es de **25.00 USD**. El descuento del 20% sólo aplica antes del **30 de septiembre**. El 1 de octubre ya caducó el descuento, por lo que pagarían la tarifa completa de 25.00 USD, no 20.00 USD. La afirmación comprobadamente falsa es la **D**. **Respuesta:** **D** ---"
                ),
                Challenge(
                    id = "ing_t06_s02_c03",
                    question = "If a question asks: *\"Why was the meeting postponed?\"*, what keyword signals the answer?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "Connectors of cause and reason: ***because, since, due to, as a result of***.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 2,
                    explanation = "According to the lesson theory: Connectors of cause and reason: ***because, since, due to, as a result of***."
                ),
                Challenge(
                    id = "ing_t06_s02_c04",
                    question = "In multiple-choice questions, why should you beware of exact word matching?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "Because test creators use exact words from the text in **distractor options** while the correct answer is usually **paraphrased**."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: Because test creators use exact words from the text in **distractor options** while the correct answer is usually **paraphrased**."
                ),
                Challenge(
                    id = "ing_t06_s02_c05",
                    question = "The word *\"deadline\"* in an academic email refers to:",
                    options = listOf(
                        "The room where an exam takes place.",
                        "The final date or time by which a task must be completed.",
                        "The teacher's personal phone number.",
                        "A passing grade on a test."
                    ),
                    correctIndex = 1,
                    explanation = "(Fecha límite o plazo final)."
                ),
                Challenge(
                    id = "ing_t06_s02_c06",
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
                    id = "ing_t06_s02_c07",
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
                    id = "ing_t06_s02_c08",
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
                    id = "ing_t06_s02_c09",
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
                    id = "ing_t06_s02_c10",
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
