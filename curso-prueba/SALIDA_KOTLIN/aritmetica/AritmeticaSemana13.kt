package aritmetica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AritmeticaSemana13 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "arit_t13_s01",
            title = "Teoría de la Probabilidad, Probabilidad Condicional y Teorema de Bayes - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Teoría de la Probabilidad, Probabilidad Condicional y Teorema de Bayes - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE II: Matemática |
| **Asignatura / Componente** | Aritmética |
| **Tema Oficial N.°** | Tema XIII: Probabilidad: fenómeno aleatorio, espacio muestral, equiprobabilidad, sucesos independientes y probabilidad condicional |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 9, 44-45) |
| **Ponderación por Pregunta** | **Ingenierías:** 1.658267400 pts (4 preg. = 6.633070 pts)<br>**Biomédicas:** 1.265447400 pts (3 preg. = 3.796342 pts)<br>**Sociales:** 0.824134300 pts (3 preg. = 2.472403 pts) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Probabilístico, Inferencia Bayesiana y Modelación Estocástica |
| **Conexión Interuniversitaria** | **UNSA:** Probabilidad clásica laplaciana con combinatoria avanzada, independencia estocástica y teorema de Bayes en pruebas médicas.<br>**UNMSM (DECO):** Sensibilidad y especificidad de pruebas diagnósticas (ELISA, PCR), control de calidad de lotes y árboles de decisión financiera.<br>**UNI:** Variables aleatorias discretas, esperanza matemática, distribución binomial hipergeométrica y axiomas de medida de Kolmogorov. |

### Matriz de Indicadores de Logro Evaluados
1. **Espacio Muestral y Eventos:** Construir el espacio muestral (\Omega) de experimentos aleatorios y operar sucesos (unión, intersección, complemento, eventos mutuamente excluyentes).
2. **Definición Clásica de Laplace y Axiomas de Kolmogorov:** Calcular probabilidades en espacios muestrales equiprobables finitos aplicando técnicas combinatorias rigurosas.
3. **Probabilidad Condicional e Independencia Estocástica:** Discriminar sucesos dependientes e independientes aplicando la regla de multiplicación y la definición formal de probabilidad condicional.
4. **Teorema de la Probabilidad Total y Teorema de Bayes:** Modelar particiones del espacio muestral para calcular probabilidades a priori y actualizar probabilidades a posteriori.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["TEORÍA DE LA PROBABILIDAD"] --> B["Fundamentos y Axiomática"]
    A --> C["Cálculo de Probabilidades"]
    A --> D["Probabilidad Condicional e Inferencia"]

    B --> B1["Experimento Aleatorio: ℰ"]
    B --> B2["Espacio Muestral: Ω"]
    B --> B3["Axiomas de Kolmogorov: P(A) ≥ 0, P(Ω) = 1"]

    C --> C1["Regla Clásica de Laplace: P(A) = n(A) / n(Ω)"]
    C --> C2["Regla de la Adición: P(A ∪ B) = P(A) + P(B) - P(A ∩ B)"]
    C --> C3["Suceso Contrario o Complementario: P(Aᶜ) = 1 - P(A)"]

    D --> D1["Probabilidad Condicional: P(A|B) = P(A ∩ B) / P(B)"]
    D --> D2["Sucesos Independientes: P(A ∩ B) = P(A) · P(B)"]
    D --> D3["Teorema de la Probabilidad Total"]
    D --> D4["Teorema de Bayes: Probabilidad a Posteriori"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Experimentos, Espacios Muestrales y Eventos
* **Experimento Determinista:** Aquel cuyo resultado exacto puede predecirse con certeza antes de su ejecución si se mantienen idénticas las condiciones iniciales (ej.: soltar una piedra al vacío y calcular su tiempo de caída con la ley de gravedad).
* **Experimento Aleatorio (\mathcal{E}):** Aquel cuyo resultado no puede anticiparse con certeza antes de su realización, aun conociendo todas las posibilidades teóricas (ej.: lanzar dos dados, extraer una carta de una baraja).
* **Espacio Muestral (\Omega):** Conjunto universal no vacío constituido por la totalidad de los resultados elementales posibles del experimento aleatorio \mathcal{E}.
* **Evento o Suceso (A):** Cualquier subconjunto del espacio muestral (A \subseteq \Omega).
  - **Suceso Elemental:** Subconjunto unitario (\{w_i\} \subset \Omega).
  - **Suceso Seguro:** El propio espacio muestral \Omega (P(\Omega) = 1).
  - **Suceso Imposible:** El conjunto vacío \emptyset (P(\emptyset) = 0).
  - **Sucesos Mutuamente Excluyentes:** A \cap B = \emptyset (no pueden coexistir simultáneamente).
  - **Sucesos Colectivamente Exhaustivos:** A \cup B = \Omega.

---

### 3.2 Definición Clásica de Laplace (Espacios Equiprobables)
Si un experimento aleatorio posee un espacio muestral finito \Omega constituido por n resultados posibles **mutuamente excluyentes y con la misma probabilidad de ocurrencia (equiprobables)**, la probabilidad del evento A es:
P(A) = \frac{\text{Número de casos favorables a } A}{\text{Número total de casos posibles en } \Omega} = \frac{n(A)}{n(\Omega)}
donde 0 \le P(A) \le 1.

---

### 3.3 Axiomática de Kolmogorov y Teoremas Derivados
Sea \Omega un espacio muestral y \mathcal{F} un álgebra de eventos sobre \Omega. Una función de probabilidad P: \mathcal{F} \to \mathbb{R} satisface formalmente los **tres axiomas de Kolmogorov**:
1. **Axioma de No Negatividad:**
   P(A) \ge 0, \quad \forall A \in \mathcal{F}
2. **Axioma de Certidumbre:**
   P(\Omega) = 1
3. **Axioma de Aditividad:**
   Para cualquier secuencia de eventos mutuamente disjuntos dos a dos (A_i \cap A_j = \emptyset, \; \forall i \neq j):
   P\left( \bigcup_{i=1}^\infty A_i \right) = \sum_{i=1}^\infty P(A_i)

#### Teoremas Derivados Fundamentales:
1. P(\emptyset) = 0.
2. **Regla del Complemento:**
   P(A^c) = 1 - P(A)
3. **Acotamiento Universal:**
   0 \le P(A) \le 1, \quad \forall A
4. **Regla General de la Adición (Sucesos Compatibles):**
   P(A \cup B) = P(A) + P(B) - P(A \cap B)
5. **Para tres eventos cualesquiera:**
   P(A \cup B \cup C) = P(A) + P(B) + P(C) - P(A \cap B) - P(A \cap C) - P(B \cap C) + P(A \cap B \cap C)


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Ley / Teorema | Expresión Matemática Rigurosa |
| :--- | :--- |
| **Definición de Laplace** | P(A) = \frac{n(A)}{n(\Omega)} \quad (0 \le P(A) \le 1) |
| **Suceso Complementario** | P(A^c) = 1 - P(A) |
| **Regla de la Adición** | P(A \cup B) = P(A) + P(B) - P(A \cap B) |
| **Sucesos Excluyentes** | P(A \cup B) = P(A) + P(B) \quad (A \cap B = \emptyset) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t13_s01_c01",
                    question = "**Enunciado:** Al lanzar dos dados comunes equilibrados sobre una mesa, ¿cuál es la probabilidad de que la suma de los puntos obtenidos sea un número primo?",
                    options = listOf(
                        "\\frac{13}{36}",
                        "\\frac{5}{12}",
                        "\\frac{7}{18}",
                        "\\frac{1}{2}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Espacio muestral (\\Omega):** Al lanzar dos dados de 6 caras numeradas del 1 al 6: n(\\Omega) = 6 \\times 6 = 36 \\text{ resultados posibles equiprobables} 2. Las sumas posibles van desde 1+1 = 2 hasta 6+6 = 12. Los números primos en este rango son: \\{2, 3, 5, 7, 11\\}. 3. Identificamos los casos favorables para cada suma prima: - Suma = 2: (1, 1) \\implies 1 caso. - Suma = 3: (1, 2), (2, 1) \\implies 2 casos. - Suma = 5: (1, 4), (2, 3), (3, 2), (4, 1) \\implies 4 casos. - Suma = 7: (1, 6), (2, 5), (3, 4), (4, 3), (5, 2), (6, 1) \\implies 6 casos. - Suma = 11: (5, 6), (6, 5) \\implies 2 casos. 4. Total de casos favorables: n(A) = 1 + 2 + 4 + 6 + 2 = 15 \\text{ casos favorables} 5. Calculamos la probabilidad clásica de Laplace: P(A) = \\frac{n(A)}{n(\\Omega)} = \\frac{15}{36} = \\frac{5}{12} **Respuesta Correcta:** **B) \\frac{5}{12}** ---"
                ),
                Challenge(
                    id = "arit_t13_s01_c02",
                    question = "**Enunciado:** Una urna contiene 6 esferas rojas, 4 esferas azules y 5 esferas verdes. Si se extraen simultáneamente 3 esferas al azar, ¿cuál es la probabilidad de que exactamente dos de ellas sean de color rojo?",
                    options = listOf(
                        "\\frac{27}{91}",
                        "\\frac{30}{91}",
                        "\\frac{36}{91}",
                        "\\frac{45}{91}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Composición de la urna:** - Total de esferas: n = 6 + 4 + 5 = 15 esferas. - Esferas rojas: 6. - Esferas no rojas (azules o verdes): 4 + 5 = 9. 2. **Espacio muestral (n(\\Omega)):** Selección sin orden de 3 esferas de un total de 15: n(\\Omega) = C_3^{15} = \\frac{15 \\times 14 \\times 13}{3 \\times 2 \\times 1} = 5 \\times 7 \\times 13 = 455 3. **Casos favorables (n(A)):** Debemos extraer exactamente 2 rojas (de las 6) Y 1 no roja (de las 9): n(A) = C_2^6 \\times C_1^9 C_2^6 = \\frac{6 \\times 5}{2 \\times 1} = 15 C_1^9 = 9 n(A) = 15 \\times 9 = 135 4. **Cálculo de la probabilidad:** P(A) = \\frac{135}{455} Simplificamos sacando quinta a ambos términos: \\frac{135 \\div 5}{455 \\div 5} = \\frac{27}{91} **Respuesta Correcta:** **A) \\frac{27}{91}** ---"
                ),
                Challenge(
                    id = "arit_t13_s01_c03",
                    question = "**Enunciado:** La probabilidad de que un estudiante de Ingeniería de la UNSA apruebe un examen de Física es \\frac{3}{5}. Si el estudiante se presenta a rendir 4 exámenes independientes durante el ciclo, ¿cuál es la probabilidad de que apruebe al menos uno de ellos?",
                    options = listOf(
                        "\\frac{609}{625}",
                        "\\frac{616}{625}",
                        "\\frac{621}{625}",
                        "\\frac{623}{625}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Definimos las probabilidades para un examen individual: - Probabilidad de aprobar: P(\\text{aprobar}) = p = \\frac{3}{5}. - Probabilidad de desaprobar: P(\\text{desaprobar}) = q = 1 - \\frac{3}{5} = \\frac{2}{5}. 2. Aplicamos la regla mnemotécnica del suceso contrario: P(\\text{aprobar al menos uno}) = 1 - P(\\text{desaprobar los 4 exámenes}) 3. Dado que los exámenes son estocásticamente independientes: P(\\text{desaprobar los 4}) = \\left(\\frac{2}{5}\\right)^4 = \\frac{16}{625} 4. Restamos de la certeza total (1): P(\\text{al menos uno}) = 1 - \\frac{16}{625} = \\frac{625 - 16}{625} = \\frac{609}{625} **Respuesta Correcta:** **A) \\frac{609}{625}** ---"
                ),
                Challenge(
                    id = "arit_t13_s01_c04",
                    question = "¿Cuál es la condición indispensable para aplicar la fórmula clásica de probabilidad de Laplace (P(A) = \\frac{n(A)}{n(\\Omega)})?",
                    options = listOf(
                        "La suma simple de sus probabilidades individuales: P(A \\cup B) = P(A) + P(B).",
                        "P(\\text{al menos uno}) = 1 - P(\\text{ninguno}).",
                        "Valor o condición no aplicable al caso planteado",
                        "Que el espacio muestral sea finito y todos sus sucesos elementales sean estrictamente equiprobables."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Que el espacio muestral sea finito y todos sus sucesos elementales sean estrictamente equiprobables."
                ),
                Challenge(
                    id = "arit_t13_s01_c05",
                    question = "¿Qué valor adopta la probabilidad de la unión de dos sucesos mutuamente excluyentes?",
                    options = listOf(
                        "La suma simple de sus probabilidades individuales: P(A \\cup B) = P(A) + P(B).",
                        "Que el espacio muestral sea finito y todos sus sucesos elementales sean estrictamente equiprobables.",
                        "P(\\text{al menos uno}) = 1 - P(\\text{ninguno}).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: La suma simple de sus probabilidades individuales: P(A \\cup B) = P(A) + P(B)."
                ),
                Challenge(
                    id = "arit_t13_s01_c06",
                    question = "¿Cuál es la fórmula para calcular la probabilidad de que ocurra \"al menos uno\" de varios eventos independientes?",
                    options = listOf(
                        "Que el espacio muestral sea finito y todos sus sucesos elementales sean estrictamente equiprobables.",
                        "P(\\text{al menos uno}) = 1 - P(\\text{ninguno}).",
                        "La suma simple de sus probabilidades individuales: P(A \\cup B) = P(A) + P(B).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: P(\\text{al menos uno}) = 1 - P(\\text{ninguno})."
                ),
                Challenge(
                    id = "arit_t13_s01_c07",
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
                    id = "arit_t13_s01_c08",
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
                    id = "arit_t13_s01_c09",
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
                    id = "arit_t13_s01_c10",
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
            id = "arit_t13_s02",
            title = "Teoría de la Probabilidad, Probabilidad Condicional y Teorema de Bayes - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Teoría de la Probabilidad, Probabilidad Condicional y Teorema de Bayes - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
---

### 3.4 Probabilidad Condicional
La probabilidad condicional de que ocurra el evento A, dado que ya se ha verificado la ocurrencia previa del evento B (con P(B) > 0), se define formalmente como:
P(A \mid B) = \frac{P(A \cap B)}{P(B)}
* **Regla General del Producto:**
  P(A \cap B) = P(B) \cdot P(A \mid B) = P(A) \cdot P(B \mid A)

---

### 3.5 Sucesos Estocásticamente Independientes
Dos eventos A y B son estadísticamente independientes si la ocurrencia de uno no afecta en absoluto la probabilidad de ocurrencia del otro:
A \text{ y } B \text{ son independientes} \iff P(A \mid B) = P(A) \iff P(B \mid A) = P(B)
* **Regla Especial de la Multiplicación para Sucesos Independientes:**
  P(A \cap B) = P(A) \cdot P(B)
* Si los eventos A y B son independientes, entonces sus complementos también lo son:
  - A y B^c son independientes.
  - A^c y B son independientes.
  - A^c y B^c son independientes.

---

### 3.6 Teorema de la Probabilidad Total y Teorema de Bayes

#### 1. Partición de un Espacio Muestral
Una colección de eventos B_1, B_2, \dots, B_k constituye una partición de \Omega si:
1. Son disjuntos dos a dos: B_i \cap B_j = \emptyset \quad (\forall i \neq j).
2. Su unión abarca todo el espacio muestral: \bigcup_{i=1}^k B_i = \Omega.
3. P(B_i) > 0 \quad (\forall i).

#### 2. Teorema de la Probabilidad Total
Sea A cualquier evento definido sobre \Omega. Su probabilidad puede calcularse sumando las probabilidades conjuntas sobre la partición:
P(A) = \sum_{i=1}^k P(B_i) \cdot P(A \mid B_i) = P(B_1)P(A \mid B_1) + P(B_2)P(A \mid B_2) + \dots + P(B_k)P(A \mid B_k)

#### 3. Teorema de Bayes (Probabilidad a Posteriori)
Permite actualizar la probabilidad de una causa hipotética B_j habiendo observado el efecto o resultado A:
P(B_j \mid A) = \frac{P(B_j \cap A)}{P(A)} = \frac{P(B_j) \cdot P(A \mid B_j)}{\sum_{i=1}^k P(B_i) \cdot P(A \mid B_i)}
- P(B_j): Probabilidad *a priori* de la causa.
- P(A \mid B_j): Verosimilitud del evento bajo la causa B_j.
- P(B_j \mid A): Probabilidad *a posteriori* de la causa habiendo ocurrido A.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Probabilidad Condicional** | P(A \mid B) = \frac{P(A \cap B)}{P(B)} \quad (P(B) > 0) |
| **Regla del Producto** | P(A \cap B) = P(B) \cdot P(A \mid B) |
| **Sucesos Independientes** | P(A \cap B) = P(A) \cdot P(B) |
| **Probabilidad Total** | P(A) = \sum_{i=1}^k P(B_i) \cdot P(A \mid B_i) |
| **Teorema de Bayes** | P(B_j \mid A) = \frac{P(B_j) \cdot P(A \mid B_j)}{\sum_{i=1}^k P(B_i) \cdot P(A \mid B_i)} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Selección sin Reposición mediante Números Combinatorios
Al extraer simultáneamente k objetos de una urna con n objetos totales (donde hay b objetos blancos y n - b negros):
* **Espacio muestral total:** n(\Omega) = C_k^n.
* **Casos favorables a obtener r blancos y k - r negros:**
  n(A) = C_r^b \times C_{k - r}^{n - b}
* **Probabilidad Hipergeométrica Inmediata:**
  P(A) = \frac{C_r^b \cdot C_{k - r}^{n - b}}{C_k^n}
* ¡Elimina la necesidad de calcular fracciones encadenadas de producto en múltiples órdenes!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Truco del "Al Menos Uno": "Uno Menos Ninguno"
* En problemas de probabilidad con múltiples intentos o tiros donde se pregunte:
  *"¿Cuál es la probabilidad de obtener **al menos un** éxito?"*
* **Mnemotecnia:**
  P(\text{al menos uno}) = 1 - P(\text{ninguno})
* Calcular la probabilidad de que **ninguno** ocurra y restarla de 1 evita sumar laboriosamente decenas de casos combinatorios.

### 2. Teorema de Bayes: "La Rama Elegida sobre la Suma de Todas las Ramas"
* En un diagrama de árbol:
  P(\text{Causa } j \mid \text{Resultado}) = \frac{\text{Camino de la rama } j}{\text{Suma de todos los caminos que llegan a ese resultado}}

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Confundir Sucesos Mutuamente Excluyentes con Independientes
> - Dos eventos A y B de probabilidad no nula son **mutuamente excluyentes** si A \cap B = \emptyset \implies P(A \cap B) = 0.
> - Son **independientes** si P(A \cap B) = P(A) \cdot P(B) > 0.
> **Conclusión axiomática:** Dos eventos mutuamente excluyentes con probabilidad positiva **NUNCA pueden ser independientes** (si ocurre uno, la probabilidad de que ocurra el otro se vuelve cero instantáneamente).

> [!WARNING]
> ### Trampa 2: Modificación del Espacio Muestral en Extracciones Sucesivas
> Si se extraen dos cartas de una baraja de 52 naipes:
> - **Con reposición:** n(\Omega) = 52 \times 52.
> - **Sin reposición:** n(\Omega) = 52 \times 51.
> Omitir restar la unidad en el denominador para la segunda extracción es el error clásico de distracción en admisión.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Epidemiología Clínica: Falsos Positivos en Tamizajes de Salud
En la detección de enfermedades raras mediante pruebas serológicas en los centros de salud de Arequipa:
- Supongamos una enfermedad con prevalencia del 1\% (P(E) = 0.01).
- La prueba tiene una sensibilidad del 95\% (P(+ \mid E) = 0.95) y especificidad del 90\% (P(- \mid S) = 0.90 \implies P(+ \mid S) = 0.10).
Si una persona da positivo (+), la probabilidad real de que realmente esté enferma se calcula con el **Teorema de Bayes**:
P(E \mid +) = \frac{0.01 \times 0.95}{(0.01 \times 0.95) + (0.99 \times 0.10)} = \frac{0.0095}{0.0095 + 0.0990} = \frac{0.0095}{0.1085} \approx 8.76\%
¡A pesar de una prueba con 95\% de precisión, la probabilidad de enfermedad real es menor al 9\% debido a la baja prevalencia basal!

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t13_s02_c01",
                    question = "**Enunciado:** De una baraja estándar de 52 naipes, se extrae una carta y se comprueba que es de color negro. ¿Cuál es la probabilidad de que dicha carta sea un As o una figura (J, Q, K)?",
                    options = listOf(
                        "\\frac{2}{13}",
                        "\\frac{3}{13}",
                        "\\frac{4}{13}",
                        "\\frac{5}{13}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Definición de los eventos:** - Evento condición B: La carta extraída es de color negro (espadas \\spadesuit o tréboles \\clubsuit). - Evento de interés A: La carta es un As o una figura (J, Q, K). 2. **Reducción del espacio muestral condicional:** En una baraja de 52 naipes, exactamente la mitad son negras: n(B) = 26 \\text{ cartas negras} 3. **Casos favorables dentro del espacio reducido (A \\cap B):** Buscamos las cartas que son negras Y simultáneamente As o figura: - Ases negros: As de espadas, As de tréboles (2 cartas). - Figuras negras: J, Q, K de espadas y J, Q, K de tréboles (6 cartas). n(A \\cap B) = 2 + 6 = 8 \\text{ cartas favorables} 4. **Cálculo de la probabilidad condicional:** P(A \\mid B) = \\frac{n(A \\cap B)}{n(B)} = \\frac{8}{26} = \\frac{4}{13} **Respuesta Correcta:** **C) \\frac{4}{13}** ---"
                ),
                Challenge(
                    id = "arit_t13_s02_c02",
                    question = "**Enunciado:** En una fábrica textil de Arequipa, tres máquinas A, B y C producen el 45\\%, 30\\% y 25\\% del total de prendas de exportación, respectivamente. Los porcentajes históricos de prendas defectuosas que produce cada máquina son 4\\%, 3\\% y 2\\%, respectivamente. Si se selecciona al azar una prenda del almacén y resulta estar defectuosa, determine la probabilidad de que dicha prenda haya sido confeccionada por la máquina B.",
                    options = listOf(
                        "\\frac{9}{32}",
                        "\\frac{10}{32}",
                        "\\frac{9}{31}",
                        "\\frac{11}{32}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Definición de la partición y probabilidades a priori:** - Máquina A: P(A) = 0.45 - Máquina B: P(B) = 0.30 - Máquina C: P(C) = 0.25 2. **Verosimilitudes de defecto (D):** - P(D \\mid A) = 4\\% = 0.04 - P(D \\mid B) = 3\\% = 0.03 - P(D \\mid C) = 2\\% = 0.02 3. **Cálculo de la probabilidad total de defecto (P(D)):** P(D) = P(A)P(D \\mid A) + P(B)P(D \\mid B) + P(C)P(D \\mid C) P(D) = (0.45)(0.04) + (0.30)(0.03) + (0.25)(0.02) P(D) = 0.0180 + 0.0090 + 0.0050 = 0.0320 4. **Aplicación del Teorema de Bayes para la Máquina B:** P(B \\mid D) = \\frac{P(B) \\cdot P(D \\mid B)}{P(D)} P(B \\mid D) = \\frac{0.0090}{0.0320} = \\frac{9}{32} 5. Por lo tanto, la probabilidad de que la prenda defectuosa provenga de la máquina B es exactamente **\\frac{9}{32}** (aproximadamente 28.125\\%). **Respuesta Correcta:** **A) \\frac{9}{32}** ---"
                ),
                Challenge(
                    id = "arit_t13_s02_c03",
                    question = "¿Cómo se verifica matemáticamente que dos eventos A y B son estocásticamente independientes?",
                    options = listOf(
                        "Permite calcular la probabilidad de una causa B_j condicionada a la observación de un resultado o efecto A (P(B_j \\mid A)).",
                        "No, es imposible. Si son excluyentes P(A \\cap B) = 0, mientras que si son independientes P(A \\cap B) = P(A) \\cdot P(B) > 0.",
                        "Comprobando que P(A \\cap B) = P(A) \\cdot P(B).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Comprobando que P(A \\cap B) = P(A) \\cdot P(B)."
                ),
                Challenge(
                    id = "arit_t13_s02_c04",
                    question = "¿Qué establece el Teorema de Bayes?",
                    options = listOf(
                        "Comprobando que P(A \\cap B) = P(A) \\cdot P(B).",
                        "No, es imposible. Si son excluyentes P(A \\cap B) = 0, mientras que si son independientes P(A \\cap B) = P(A) \\cdot P(B) > 0.",
                        "Valor o condición no aplicable al caso planteado",
                        "Permite calcular la probabilidad de una causa B_j condicionada a la observación de un resultado o efecto A (P(B_j \\mid A))."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Permite calcular la probabilidad de una causa B_j condicionada a la observación de un resultado o efecto A (P(B_j \\mid A))."
                ),
                Challenge(
                    id = "arit_t13_s02_c05",
                    question = "¿Pueden dos eventos con probabilidad mayor que cero ser simultáneamente independientes y mutuamente excluyentes?",
                    options = listOf(
                        "No, es imposible. Si son excluyentes P(A \\cap B) = 0, mientras que si son independientes P(A \\cap B) = P(A) \\cdot P(B) > 0.",
                        "Comprobando que P(A \\cap B) = P(A) \\cdot P(B).",
                        "Permite calcular la probabilidad de una causa B_j condicionada a la observación de un resultado o efecto A (P(B_j \\mid A)).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: No, es imposible. Si son excluyentes P(A \\cap B) = 0, mientras que si son independientes P(A \\cap B) = P(A) \\cdot P(B) > 0."
                ),
                Challenge(
                    id = "arit_t13_s02_c06",
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
                    id = "arit_t13_s02_c07",
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
                    id = "arit_t13_s02_c08",
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
                    id = "arit_t13_s02_c09",
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
                    id = "arit_t13_s02_c10",
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
