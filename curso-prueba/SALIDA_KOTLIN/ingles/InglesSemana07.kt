package ingles

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object InglesSemana07 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "ing_t07_s01",
            title = "Lectura Temática: Información Personal, Rutinas Diarias, Estudios, Nutrición y Salud - Core Rules & Foundations",
            theory = LessonTheory(
                title = "Lectura Temática: Información Personal, Rutinas Diarias, Estudios, Nutrición y Salud - Core Rules & Foundations",
                content = """## 1. COURSE OVERVIEW & CONCEPTUAL FRAMEWORK
## 1. PORTADA Y METADATOS CURRICULARES

| Campo | Detalle |
| :--- | :--- |
| **Eje Temático** | Eje 07: Idioma Extranjero (Inglés) |
| **Materia** | Lectura y Comprensión Temática (A2 - B1 CEFR) |
| **Nivel de Dificultad** | Preuniversitario Avanzado (UNSA / CEPRUNSA) |
| **Tiempo de Estudio Recomendado** | 4.0 horas |
| **Resolución Curricular** | R.C.U. N.° 0028-2026 (Admisión 2027) |
| **Prerrequisitos** | Estrategias de Lectura: Skimming & Scanning (Tema 01) |
| **Objetivo Pedagógico** | Interpretar textos informativos, descriptivos y expositivos breves centrados en los 5 ejes temáticos obligatorios del prospecto de admisión UNSA: datos personales y perfiles familiares, rutinas de vida y hábitos de estudio, carreras y profesiones universitarias, compras y alimentos balanceados, y prevención en salud básica y bienestar físico. |

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Thematic Reading Domains UNSA] --> B[Domain 1: Personal & Family Profiles]
    B --> B1[Biographies, backgrounds, origins, relationships, hobbies]

    A --> C[Domain 2: Daily Routines & Study Habits]
    C --> C1[Time management, university life, schedules, frequency adverbs]

    A --> D[Domain 3: Academic Fields & Professions]
    D --> D1[STEM careers, Humanities, Medicine, job responsibilities, skills]

    A --> E[Domain 4: Shopping, Consumerism & Food]
    E --> E1[Prices, ingredients, healthy diets, nutritional facts, sustainability]

    A --> F[Domain 5: Basic Healthcare & Well-being]
    F --> F1[Common illnesses, prevention, physical exercise, mental health, hygiene]
```

---


## 2. FORMAL THEORETICAL FOUNDATIONS - PART I
## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA

### 3.1. Ejes Temáticos del Prospecto UNSA y su Vocabulario Clave

#### Eje 1: Personal & Family Information (Perfiles Personales y Familiares)
- **Campos Léxicos:** *Origin, nationality, marital status, siblings, relatives, upbringing, personal background, leisure activities, personality traits (reliable, ambitious, easy-going, conscientious).*
- **Estructuras Textuales Típicas:** Textos autobiográficos breves, perfiles de postulantes a becas internacionales, entrevistas de presentación.

#### Eje 2: Daily Routines and Academic Life (Rutinas y Vida Universitaria)
- **Campos Léxicos:** *Schedule, commute, attend lectures, submit assignments, revise notes, cram for exams, library resources, campus facilities, extracurricular activities.*
- **Phrasal Verbs Clave:**
  - *Wake up / Get up:* Despertar / Levantarse de la cama.
  - *Head to:* Dirigirse hacia (*He heads to campus at 7:00 AM*).
  - *Catch up on:* Ponerse al día con los estudios (*catching up on readings*).
  - *Drop out:* Abandonar los estudios (*drop out of university*).
  - *Hand in / Turn in:* Entregar trabajos académicos (*hand in the lab report*).

#### Eje 3: Studies, University Careers and Occupations (Carreras y Profesiones)
- **Campos Léxicos:** *Undergraduate degree, syllabus, major, internship, tuition fees, faculty, career prospects, vocational training, engineering, biomedical sciences, law.*

## 3. GRAMMAR PATTERNS & STRUCTURE TAXONOMY
## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES

### 4.1. Cuadro de Conectores Discursivos en Textos Temáticos

\begin{array}{|l|l|l|}
\hline
\textbf{Función Textual} & \textbf{Conectores en Inglés} & \textbf{Significado y Uso} \\ \hline

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t07_s01_c01",
                    question = "What is the primary topic of the passage?",
                    options = listOf(
                        "The economic cost of organic agriculture in developing nations.",
                        "The growing popularity of plant-based diets, their health benefits, and the need for nutritional balance.",
                        "How to treat severe cases of type 2 diabetes through surgical interventions.",
                        "The daily laboratory routine of medical students in university hospitals."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El texto aborda cómo las dietas basadas en plantas se han popularizado entre jóvenes, enumera sus beneficios clínicos comprobados (menor riesgo cardiovascular, fibra, antioxidantes) y advierte sobre los cuidados necesarios para evitar deficiencias (vitamina B12). La opción que sintetiza cabalmente todo el texto es la **B**. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t07_s01_c02",
                    question = "According to paragraph 2, which of the following is a proven benefit of plant-based diets?",
                    options = listOf(
                        "Permanent immunity against viral infections.",
                        "A lower likelihood of suffering from cardiovascular diseases and high blood pressure.",
                        "Instant weight loss without any physical exercise.",
                        "Higher levels of animal protein in the bloodstream."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** Localizando en el párrafo 2: *\"It is associated with a significantly reduced risk of cardiovascular disease, lower blood pressure, and better management of type 2 diabetes\"*. Esto coincide textualmente con la opción B. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t07_s01_c03",
                    question = "In paragraph 1, the word **\"fringe\"** in the phrase *\"are no longer considered a fringe trend; they have entered mainstream lifestyle culture\"* is closest in meaning to:",
                    options = listOf(
                        "Marginal or non-traditional",
                        "Very expensive",
                        "Ancient and forgotten",
                        "Mandatory for all citizens"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El autor contrasta *fringe trend* con *mainstream culture* (cultura mayoritaria y aceptada). *Fringe* alude a algo secundario, periférico, marginal o que solo sigue un grupo muy reducido de personas. La palabra equivalente es *Marginal or non-traditional*. **Respuesta:** **A** ---"
                ),
                Challenge(
                    id = "ing_t07_s01_c04",
                    question = "What does the phrasal verb *\"cut down on\"* mean?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "It means to **reduce the quantity or consumption** of something (*e.g., cut down on sugar*)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: It means to **reduce the quantity or consumption** of something (*e.g., cut down on sugar*)."
                ),
                Challenge(
                    id = "ing_t07_s01_c05",
                    question = "What is the difference between *\"career\"* and *\"degree\"* in English?",
                    options = listOf(
                        "A **degree** is the university qualification/major you study; a **career** is your entire professional working life.",
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 0,
                    explanation = "According to the lesson theory: A **degree** is the university qualification/major you study; a **career** is your entire professional working life."
                ),
                Challenge(
                    id = "ing_t07_s01_c06",
                    question = "Why is vitamin B12 critical in plant-based diets?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "Because it is **essential for red blood cells and nerve function**, but naturally absent in unfortified plant foods.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 1,
                    explanation = "According to the lesson theory: Because it is **essential for red blood cells and nerve function**, but naturally absent in unfortified plant foods."
                ),
                Challenge(
                    id = "ing_t07_s01_c07",
                    question = "If a doctor tells a patient to *\"work out three times a week\"*, the doctor is recommending:",
                    options = listOf(
                        "To study longer hours in the library",
                        "To engage in physical exercise",
                        "To take extra sleeping pills",
                        "To stop eating vegetables"
                    ),
                    correctIndex = 1,
                    explanation = "(*Work out* = ejercitarse físicamente)."
                ),
                Challenge(
                    id = "ing_t07_s01_c08",
                    question = "The word *\"afford\"* in *\"Students cannot afford expensive meals\"* means:",
                    options = listOf(
                        "To have enough money to pay for something",
                        "To cook fresh ingredients",
                        "To dislike certain tastes",
                        "To forget where a restaurant is"
                    ),
                    correctIndex = 0,
                    explanation = "(Tener capacidad económica para costear algo)."
                ),
                Challenge(
                    id = "ing_t07_s01_c09",
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
                    id = "ing_t07_s01_c10",
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
            id = "ing_t07_s02",
            title = "Lectura Temática: Información Personal, Rutinas Diarias, Estudios, Nutrición y Salud - Applied Skills, Hacks & Reading Practice",
            theory = LessonTheory(
                title = "Lectura Temática: Información Personal, Rutinas Diarias, Estudios, Nutrición y Salud - Applied Skills, Hacks & Reading Practice",
                content = """## 1. APPLIED GRAMMAR & ADVANCED STRUCTURES - PART II
- **Collocations Académicas:**
  - *Pursue a degree:* Cursar una carrera universitaria.
  - *Conduct research:* Realizar investigaciones científicas.
  - *Gain hands-on experience:* Adquirir experiencia práctica real.
  - *Meet requirements:* Cumplir con los requisitos exigidos.

#### Eje 4: Shopping, Food and Nutrition (Compras, Alimentos y Nutrición)
- **Campos Léxicos:** *Budget, discount, receipt, afford, wholesome food, organic produce, nutrients, carbohydrates, proteins, balanced diet, processed food, eating habits.*
- **Términos de Consumo:** *Bargain (ganga/oferta), Refund (reembolso), Cash/Credit card, Expiry date (fecha de vencimiento).*

#### Eje 5: Basic Health and Healthy Lifestyles (Salud Básica y Bienestar)
- **Campos Léxicos:** *Symptoms (fever, headache, fatigue, sore throat), diagnosis, prescription, over-the-counter medicine, immune system, mental well-being, sedentary lifestyle, physical fitness.*
- **Expresiones Médicas Cotidianas:**
  - *Come down with:* Contraer una enfermedad leve (*come down with the flu*).
  - *Work out:* Hacer ejercicio físico en el gimnasio.
  - *Cut down on:* Reducir el consumo de algo (*cut down on sugar and fats*).
  - *Recover from:* Recuperarse de una afección.

---


## 2. PRE-UNIVERSITY HACKS & MNEMOTECHNICS
\text{Adición} & \textit{Furthermore, In addition, Moreover, Besides} & \text{Agregar un argumento o dato suplementario} \\ \hline
\text{Contraste} & \textit{However, Nevertheless, On the other hand, Whereas} & \text{Introducir una objeción o contraposición} \\ \hline
\text{Causa y Razón} & \textit{Due to, Because of, Owing to, Since, As} & \text{Explicar el origen o motivo de un fenómeno} \\ \hline
\text{Consecuencia} & \textit{Therefore, Consequently, As a result, Thus} & \text{Señalar el efecto lógico o desenlace} \\ \hline
\end{array}

---


## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS

### 1. El Hack de los Prefijos Negativos en Inglés
Muchas preguntas de vocabulario se resuelven deduciendo el significado a través de sus prefijos morfológicos:
- **un- / in- / im- / il- / ir- = Negación o privación:**
  - *Healthy* \rightarrow *Unhealthy* (no saludable).
  - *Sufficient* \rightarrow *Insufficient* (insuficiente).
  - *Balanced* \rightarrow *Imbalanced* (desequilibrado).
  - *Literate* \rightarrow *Illiterate* (analfabeto).
  - *Regular* \rightarrow *Irregular* (anormal).

### 2. Mnemotécnia de Phrasal Verbs de Salud: "C-W-C"
- **C**ome down with \longrightarrow Caer enfermo / contraer un resfriado.
- **W**ork out \longrightarrow Entrenar / hacer ejercicio.
- **C**ut down on \longrightarrow Cortar / reducir el consumo (e.g., sal, azúcar).

---


## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS
## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **Confundir "Diet" con "Régimen para adelgazar":**
   - En inglés, *diet* se refiere primariamente al **conjunto habitual de alimentos que consume un ser vivo** (*a Mediterranean diet*, *a healthy diet*), no exclusivamente a un régimen restrictivo para bajar de peso.
2. **Confundir "Career" con "University Degree":**
   - *Career:* Trayectoria profesional a lo largo de la vida laboral (*He had a successful career in banking*).
   - *Degree / Major:* La carrera universitaria académica que se estudia (*She is studying for an Engineering degree*).
3. **Mala interpretación de "Prevent" frente a "Avoid":**
   - *To prevent:* Prevenir o evitar que un mal o enfermedad suceda (*prevent disease*).
   - *To avoid:* Esquivar o eludir una situación (*avoid junk food*).

---


## 4. REAL-WORLD CONTEXT & READING PASSAGES
## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL

### Caso 1: Lectura Comprensiva de Salud Pública Universitaria
> **TEXT:**
> *A recent survey conducted at San Agustín National University revealed that more than 65% of first-year engineering students experience high levels of sleep deprivation. Due to demanding course loads and extensive laboratory reports, many undergraduates sleep fewer than five hours per night. Nutritionists at the University Health Center warn that chronic lack of rest, combined with the excessive intake of energy drinks and instant noodles, severely impairs cognitive performance, memory consolidation, and immune defense. The health board recommends that students establish regular sleep schedules, engage in at least 30 minutes of aerobic exercise daily, and substitute sugary snacks with fresh fruit and nuts to enhance academic productivity.*

- **Eje Temático:** Salud y Vida Académica Universitaria.
- **Análisis de Comprensión:**
  - *What is the root cause of students' sleep deprivation?* \rightarrow The demanding academic workload and laboratory assignments.
  - *What are the physiological consequences mentioned?* \rightarrow Impaired memory, lower cognitive performance, and weakened immunity.
  - *What is the medical recommendation?* \rightarrow Regular sleep schedules, daily aerobic exercise, and a wholesome diet.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "ing_t07_s02_c01",
                    question = "Based on paragraph 3, what can be inferred about vitamin B12?",
                    options = listOf(
                        "It is produced in large quantities by green leafy vegetables like spinach.",
                        "Strict vegans must consume fortified foods or dietary supplements to avoid deficiency.",
                        "It is completely unnecessary for neurological health and cognitive performance.",
                        "It can be easily synthesized by human cells exposed to sunlight."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** El párrafo 3 afirma: *\"Vitamin B12... is virtually absent in unfortified plant foods. Consequently, doctors strongly advise... proper supplementation\"*. Si los alimentos vegetales no la contienen de forma natural, una persona con dieta estrictamente vegetal debe necesariamente recurrir a alimentos fortificados o suplementos para no enfermar. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t07_s02_c02",
                    question = "Evaluate the following statements based on the entire reading passage:",
                    options = listOf(
                        "I and III",
                        "II and IV",
                        "I, II and IV",
                        "II, III and IV"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** - **I (Falsa):** El texto dice exactamente lo opuesto: *\"emphasize vegetables, legumes, whole grains, nuts, and seeds\"*. - **II (Verdadera):** Párrafo 2: *\"rich in dietary fiber and essential antioxidants, which help reduce cellular inflammation\"*. - **III (Falsa):** El texto advierte que sin planificación puede haber carencias graves y aconseja consultar a un nutricionista certificado. - **IV (Verdadera):** Párrafo 3: *\"individuals may develop deficiencies in micronutrients such as vitamin B12, iron, zinc, and omega-3\"*. Las proposiciones rigurosamente ciertas son **II y IV**. **Respuesta:** **B** ---"
                ),
                Challenge(
                    id = "ing_t07_s02_c03",
                    question = "What does the prefix *\"un-\"* do to words like *\"healthy\"* or *\"planned\"*?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It adds a **negative or opposite meaning** (*unhealthy = not healthy; unplanned = without planning*).",
                        "It follows an inverted word order with obligatory double negation."
                    ),
                    correctIndex = 2,
                    explanation = "According to the lesson theory: It adds a **negative or opposite meaning** (*unhealthy = not healthy; unplanned = without planning*)."
                ),
                Challenge(
                    id = "ing_t07_s02_c04",
                    question = "What does the transition word *\"Consequently\"* indicate?",
                    options = listOf(
                        "It requires an irregular past participle form without auxiliary verbs.",
                        "It is only used in colloquial informal contexts with plural nouns.",
                        "It follows an inverted word order with obligatory double negation.",
                        "It indicates a **logical result, consequence, or effect** (*therefore, as a result*)."
                    ),
                    correctIndex = 3,
                    explanation = "According to the lesson theory: It indicates a **logical result, consequence, or effect** (*therefore, as a result*)."
                ),
                Challenge(
                    id = "ing_t07_s02_c05",
                    question = "Which of the following is considered an undergraduate degree?",
                    options = listOf(
                        "A primary school diploma",
                        "A Bachelor's degree in Civil Engineering",
                        "A certificate of attendance at a workshop",
                        "A receipt for university tuition fees"
                    ),
                    correctIndex = 1,
                    explanation = "(Título universitario de pregrado)."
                ),
                Challenge(
                    id = "ing_t07_s02_c06",
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
                    id = "ing_t07_s02_c07",
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
                    id = "ing_t07_s02_c08",
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
                    id = "ing_t07_s02_c09",
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
                    id = "ing_t07_s02_c10",
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
