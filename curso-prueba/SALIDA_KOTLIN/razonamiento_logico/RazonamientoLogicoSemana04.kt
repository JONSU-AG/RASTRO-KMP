package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t04_s01",
            title = "INFERENCIAS LÓGICAS Y REGLAS DE INFERENCIA - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "INFERENCIAS LÓGICAS Y REGLAS DE INFERENCIA - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Deducción lógica de conclusiones a partir de premisas, identificación de inferencias válidas (Modus Ponens, Modus Tollens, Silogismo Disyuntivo) y descarte de opiniones. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de validez formal en textos argumentativos, distinción entre verdad fáctica de las premisas y validez estructural de la conclusión. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Deducción natural formal, prueba formal de validez paso a paso citando reglas clásicas (Exportación, Dilemas constructivos/destructivos, Reducción al absurdo). | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Deducir rigurosamente conclusiones válidas a partir de un conjunto de premisas dadas.
2. Reconocer y clasificar inferencias en válidas (tautológicas) e inválidas (falacias formales).
3. Identificar conclusiones que se desprenden **necesaria y forzosamente** de las premisas, descartando conclusiones meramente probables.
4. Distinguir con precisión epistemológica entre una **inferencia lógica formal** y una **opinión o juicio subjetivo**.
5. Aplicar con soltura las reglas canónicas de inferencia: Modus Ponendo Ponens, Modus Tollendo Tollens, Silogismo Hipotético y Silogismo Disyuntivo.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Inferencia Inductiva (De lo particular a lo general: Probable)
        ┌─ 1. Tipos de ────────┼─ Inferencia Deductiva (De lo general a lo particular: Necesaria)
        │      Inferencias     └─ Inferencia Abductiva (La mejor explicación causal disponible)
        │
INFERENCIAS                    ┌─ Premisas (Enunciados que sirven de fundamento lógico)
LÓGICAS ────────┼─ 2. Estructura de ───┼─ Conclusión (Enunciado que se deriva de las premisas)
        │      un Razonamiento └─ Validez Formal vs. Verdad Fáctica (La validez es de la forma)
        │
        │                      ┌─ Modus Ponendo Ponens (MPP: Afirmando el antecedente)
        ├─ 3. Reglas ──────────┼─ Modus Tollendo Tollens (MTT: Negando el consecuente)
        │      Clásicas de     ├─ Silogismo Hipotético Puro (SHP: Transitividad de causas)
        │      Inferencia      ├─ Silogismo Disyuntivo (SD: Modus Tollendo Ponens)
        │                      └─ Dilemas Constructivo y Destructivo
        │
        └─ 4. Falacias ────────┌─ Falacia de Afirmación del Consecuente (Inferencia inválida)
               Formales de     └─ Falacia de Negación del Antecedente (Inferencia inválida)
               Inferencia
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Estructura Epistemológica de una Inferencia
Una inferencia o razonamiento es una **estructura de proposiciones** en la cual, a partir de una o más proposiciones llamadas **premisas** (P_1, P_2, \dots, P_k), se deriva y fundamenta otra proposición llamada **conclusión** (C):
P_1, P_2, P_3, \dots, P_k \models C
* En lenguaje condicional formal:
  (P_1 \land P_2 \land \dots \land P_k) \to C

#### Criterio Fundamental de Validez:
Una inferencia es **VÁLIDA** si y solo si la forma condicional asociada es una **TAUTOLOGÍA**:
\text{Validez} \iff \text{Es absolutamente imposible que las premisas sean Verdaderas y la conclusión sea Falsa}
*(Si las premisas son verdaderas, la conclusión DEBE ser necesariamente verdadera).*

---

### 3.2 Distinción Crucial: Validez Formal vs. Verdad Fáctica
* **La Verdad:** Es una propiedad de las **proposiciones aisladas** cuando concuerdan con la realidad empírica (ej. "La nieve es blanca").
* **La Validez:** Es una propiedad exclusiva de la **estructura del razonamiento**, no de su contenido fáctico.
  * Un razonamiento puede tener premisas falsas y ser formalmente válido:
    - *Premisa 1:* Todos los peces vuelan. (F)
    - *Premisa 2:* El tiburón es un pez. (V)
    - *Conclusión:* El tiburón vuela. (F)
    👉 **Estructura 100% VÁLIDA** (Silogismo perfecto), aunque la conclusión sea fácticamente falsa.

---

### 3.3 Reglas Canónicas de Inferencia Lógica (Deducción Natural)

#### 1. Modus Ponendo Ponens (MPP - "Afirmando afirmo")
Si se tiene un condicional y se afirma su antecedente, se concluye necesariamente su consecuente:
\begin{array}{rl}
p \to q & (\text{Premisa 1}) \\
p & (\text{Premisa 2}) \\
\hline
\therefore \mathbf{q} & (\text{Conclusión})
\end{array}

#### 2. Modus Tollendo Tollens (MTT - "Negando niego")
Si se tiene un condicional y se niega su consecuente, se concluye necesariamente la negación de su antecedente:
\begin{array}{rl}
p \to q & (\text{Premisa 1}) \\
\sim q & (\text{Premisa 2}) \\
\hline
\therefore \mathbf{\sim p} & (\text{Conclusión})

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE VALIDEZ Y FALACIAS FORMALES

| Regla Válida de Inferencia | Falacia Formal Inválida (Distractor Típico) | Estructura de la Falacia |
| :--- | :--- | :---: |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t04_s01_c01",
                    question = "Dadas las siguientes premisas:",
                    options = listOf(
                        "Carlos estudió poco para el examen.",
                        "Carlos no alcanzó el puntaje reglamentario.",
                        "Carlos postulará en el siguiente proceso Ordinario.",
                        "Carlos eligió una carrera con muy pocas vacantes."
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t04_s01_c02",
                    question = "Considere el siguiente razonamiento:",
                    options = listOf(
                        "Todos los escolares arequipeños ingresarán a la universidad.",
                        "Se elevará el rendimiento académico escolar.",
                        "No habrá conflictos sociales en la región.",
                        "El canon minero será el más alto del país."
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t04_s01_c03",
                    question = "Un fiscal presenta el siguiente argumento en un tribunal:",
                    options = listOf(
                        "Válido por Modus Ponens.",
                        "Válido por Modus Tollens.",
                        "Inválido, incurre en la Falacia de Afirmación del Consecuente.",
                        "Inválido, incurre en la Falacia de Negación del Antecedente."
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t04_s01_c04",
                    question = "¿Cuál es la regla del Modus Ponendo Ponens (MPP)?",
                    options = listOf(
                        "Dado p \\to q, si se niega q (\\sim q), se concluye necesariamente \\sim p.",
                        "En creer erróneamente que a partir de p \\to q y sabiendo que ocurrió q, se puede concluir p (inválido).",
                        "Valor o condición no aplicable al caso planteado",
                        "Dado p \\to q, si se afirma p, se concluye necesariamente q."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Dado p \\to q, si se afirma p, se concluye necesariamente q."
                ),
                Challenge(
                    id = "rl_t04_s01_c05",
                    question = "¿Cuál es la regla del Modus Tollendo Tollens (MTT)?",
                    options = listOf(
                        "Dado p \\to q, si se niega q (\\sim q), se concluye necesariamente \\sim p.",
                        "Dado p \\to q, si se afirma p, se concluye necesariamente q.",
                        "En creer erróneamente que a partir de p \\to q y sabiendo que ocurrió q, se puede concluir p (inválido).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Dado p \\to q, si se niega q (\\sim q), se concluye necesariamente \\sim p."
                ),
                Challenge(
                    id = "rl_t04_s01_c06",
                    question = "¿En qué consiste la Falacia de Afirmación del Consecuente?",
                    options = listOf(
                        "Dado p \\to q, si se afirma p, se concluye necesariamente q.",
                        "En creer erróneamente que a partir de p \\to q y sabiendo que ocurrió q, se puede concluir p (inválido).",
                        "Dado p \\to q, si se niega q (\\sim q), se concluye necesariamente \\sim p.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: En creer erróneamente que a partir de p \\to q y sabiendo que ocurrió q, se puede concluir p (inválido)."
                ),
                Challenge(
                    id = "rl_t04_s01_c07",
                    question = "Premisas: Si llueve, la pista se moja. La pista no está mojada. ¿Qué conclusión se deriva necesariamente?",
                    options = listOf(
                        "Llovió poco",
                        "No ha llovido",
                        "La pista se secó rápido",
                        "Está nublado"
                    ),
                    correctIndex = 1,
                    explanation = "Por Modus Tollendo Tollens: p -> q y ~q concluye necesariamente ~p ('No ha llovido')."
                ),
                Challenge(
                    id = "rl_t04_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t04_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t04_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "rl_t04_s02",
            title = "INFERENCIAS LÓGICAS Y REGLAS DE INFERENCIA - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "INFERENCIAS LÓGICAS Y REGLAS DE INFERENCIA - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
\end{array}

#### 3. Silogismo Hipotético Puro (SHP - Transitividad)
Si una causa genera un efecto intermedio, y ese efecto intermedio es causa de un resultado final:
\begin{array}{rl}
p \to q & (\text{Premisa 1}) \\
q \to r & (\text{Premisa 2}) \\
\hline
\therefore \mathbf{p \to r} & (\text{Conclusión})
\end{array}

#### 4. Silogismo Disyuntivo (SD / Modus Tollendo Ponens - "Negando afirmo")
Si se tiene una disyunción y se niega una de las alternativas, se afirma forzosamente la otra:
\begin{array}{rl|rl}
p \lor q & & p \lor q & \\
\sim p & & \sim q & \\
\hline
\therefore \mathbf{q} & & \therefore \mathbf{p} &
\end{array}

#### 5. Dilema Constructivo (DC)
\begin{array}{rl}
(p \to q) \land (r \to s) & (\text{Dos implicaciones}) \\
p \lor r & (\text{Se afirma al menos un antecedente}) \\
\hline
\therefore \mathbf{q \lor s} & (\text{Se concluye la disyunción de sus consecuentes})
\end{array}

#### 6. Ley de Simplificación y Conjunción
* **Simplificación:** De p \land q se puede concluir válidamente p (o también q).
* **Conjunción:** Si se tiene p demostrado y q demostrado, se concluye válidamente p \land q.
* **Adición:** Si se tiene p, se puede concluir válidamente p \lor q (para cualquier q).

---

### 3.4 Inferencia vs. Opinión (Criterio Prospecto UNSA)
* **Inferencia Lógica:** Derivación forzosa basada en reglas sintácticas y semánticas de deducción objetiva. No depende de las creencias del observador.
* **Opinión o Creencia:** Juicio de valor subjetivo, conjetura verosímil, estimación o extrapolación no demostrada formalmente por las premisas.
  * *Premisa:* "El postulante Juan obtuvo 98 puntos de 100 en el examen CEPREUNSA".
  * *Inferencia lógica:* Juan obtuvo un puntaje aprobatorio y superó los 90 puntos.
  * *Opinión (No deducible lógicamente):* Juan será un excelente médico cirujano en el futuro. (Es un deseo u opinión, no una consecuencia lógica de la premisa).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Modus Ponens (Válido)** <br> p \to q, \quad p \implies \mathbf{q} | **Falacia de Afirmación del Consecuente** <br> *(Afirmar el consecuente NO permite deducir el antecedente)* | \begin{array}{c} p \to q \\ q \\ \hline \therefore p \text{ (¡INVÁLIDO!)} \end{array} |
| **Modus Tollens (Válido)** <br> p \to q, \quad \sim q \implies \mathbf{\sim p} | **Falacia de Negación del Antecedente** <br> *(Negar el antecedente NO permite deducir la negación del consecuente)* | \begin{array}{c} p \to q \\ \sim p \\ \hline \therefore \sim q \text{ (¡INVÁLIDO!)} \end{array} |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Diagrama de Euler para Inferencias Inmediatas
Cuando un problema de inferencia use cuantificadores ("Todos", "Ningún", "Algunos"):
1. Dibuja círculos de conjuntos (diagramas de Venn-Euler).
2. Superpón las premisas.
3. Lo que quede **sombreado o intersecado obligatoriamente en todos los dibujos posibles** es la **CONCLUSIÓN VÁLIDA**.
4. Cualquier alternativa que no se cumpla en al menos un diagrama posible se descarta inmediatamente como simple opinión o conjetura.

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL PONENS PONE, EL TOLLENS QUITA"
> * **Ponens (Pone):** Pone (afirma) el antecedente \implies Pone (obtiene) el consecuente (p \implies q).
> * **Tollens (Toma/Quita):** Quita (niega) el consecuente \implies Quita (niega) el antecedente (\sim q \implies \sim p).

### Mnemotecnia 2: La Trampa de la Lluvia y el Piso Mojado
> "Si llueve, la pista se moja (p \to q)".
> 1. *Caso Válido (MPP):* Está lloviendo \implies Conclusión forzosa: La pista está mojada.
> 2. *Caso Válido (MTT):* La pista está seca (\sim q) \implies Conclusión forzosa: No ha llovido (\sim p).
> 3. *Falacia 1:* La pista está mojada (q) \implies ¿Llovió? **¡NO NECESARIAMENTE!** (Pudieron haber regado la pista o roto una tubería).
> 4. *Falacia 2:* No llueve (\sim p) \implies ¿La pista no está mojada? **¡NO NECESARIAMENTE!**

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La falacia de la inversión condicional:**
   * Premisa: "Todos los ingenieros civiles colegiados estudiaron en la universidad".
   * Pregunta trampa: "¿Qué se concluye válidamente si Pedro estudió en la universidad?"
   * **El error común:** Marcar "Pedro es ingeniero civil".
   * **Lo correcto:** No se puede concluir que sea ingeniero civil; pudo haber estudiado Derecho, Medicina o Filosofía.
2. ⚠️ **El conector disyuntivo y la negación:**
   * Para aplicar el Silogismo Disyuntivo (p \lor q), debes **NEGAR** una de las dos partes para quedarte con la otra.
   * Si te dan p \lor q y luego te afirman p, **NO puedes deducir \sim q** (salvo que el enunciado diga explícitamente que es una disyunción fuerte o exclusiva).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Diagnóstico Clínico Asistido por Algoritmos (Biomédicas UNSA)
En el departamento de infectología del Hospital Regional de Arequipa, se programa un sistema experto de triaje con la siguiente regla de inferencia médica:
1. *Regla 1:* Si un paciente presenta fiebre alta continua (p) y plaquetopenia severa (q), y reside en zona endémica (r), se concluye sospecha confirmada de Dengue grave (s):
   (p \land q \land r) \to s
2. *Registro de Triaje:* El paciente llega con fiebre alta (p = V), plaquetopenia severa (q = V), y vive en Camaná (zona endémica, r = V).
3. *Ejecución de la Inferencia (Modus Ponens):*
   (V \land V \land V) \equiv V \implies \mathbf{s = V}
4. El sistema emite la orden de hospitalización inmediata. Una inferencia lógica salva vidas al erradicar dudas humanas subjetivas en emergencias.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t04_s02_c01",
                    question = "Dadas las premisas formales:",
                    options = listOf(
                        "p \\land r",
                        "\\sim s",
                        "s",
                        "\\sim p \\land \\sim r"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t04_s02_c02",
                    question = "Se propone demostrar la validez del siguiente argumento con tres premisas:",
                    options = listOf(
                        "Se concluye q \\lor r válidamente",
                        "Se concluye \\sim q de forma consistente",
                        "El conjunto de premisas es formalmente inconsistente (conduce a una contradicción r \\land \\sim r)",
                        "Se deduce que p debe ser falso"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t04_s02_c03",
                    question = "¿Cuál es la diferencia entre la verdad de una proposición y la validez de una inferencia?",
                    options = listOf(
                        "Se concluye necesariamente q.",
                        "Valor o condición no aplicable al caso planteado",
                        "La verdad compara la proposición con la realidad fáctica; la validez es una propiedad formal de la estructura del razonamiento.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: La verdad compara la proposición con la realidad fáctica; la validez es una propiedad formal de la estructura del razonamiento."
                ),
                Challenge(
                    id = "rl_t04_s02_c04",
                    question = "Si tienes p \\lor q y se confirma que ocurre \\sim p, ¿qué concluyes por Silogismo Disyuntivo?",
                    options = listOf(
                        "La verdad compara la proposición con la realidad fáctica; la validez es una propiedad formal de la estructura del razonamiento.",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Se concluye necesariamente q."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Se concluye necesariamente q."
                ),
                Challenge(
                    id = "rl_t04_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t04_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t04_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t04_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t04_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t04_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
