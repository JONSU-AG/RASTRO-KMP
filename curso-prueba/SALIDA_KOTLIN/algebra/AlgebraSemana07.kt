package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana07 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t07_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Álgebra Superior y Cálculo Previo |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Alta (88%):** Preguntas directas de simplificación, cálculo de MCD/MCM de polinomios o descomposición en fracciones parciales (puente hacia integrales en la universidad). |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de razones de cambio y mezclas), UNI (Fracciones complejas y descomposición en fracciones parciales de casos cuadráticos). |
| **Competencia Cardinal** | Calcular el MCD y MCM de familias de polinomios mediante factorización, simplificar expresiones racionales complejas definiendo su conjunto de valores admisibles (CVA) y descomponer fracciones racionales propias en fracciones parciales. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    FA["Fracciones Algebraicas"] --> MCDM["M.C.D. y M.C.M. de Polinomios"]
    FA --> CVA["Conjunto de Valores Admisibles (CVA: Denominador ≠ 0)"]
    FA --> OP["Operaciones Racionales (Suma, Producto, Cociente)"]
    FA --> FP["Descomposición en Fracciones Parciales"]
    
    MCDM --> MCD["M.C.D. = Factores Comunes al Menor Exponente"]
    MCDM --> MCM["M.C.M. = Factores Comunes y No Comunes al Mayor Exponente"]
    MCDM --> REL["Propiedad: P(x) · Q(x) = MCD · MCM"]
    
    FP --> CASO1["Caso 1: Factores Lineales Distintos: A/(x-a) + B/(x-b)"]
    FP --> CASO2["Caso 2: Factores Lineales Repetidos: A/(x-a) + B/(x-a)²"]
    FP --> CASO3["Caso 3: Factor Cuadrático Irreductible: (Ax+B)/(ax²+bx+c)"]
    FP --> HEAV["Técnica de Cobertura de Heaviside (Cálculo Inmediato)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA VII: FRACCIONES ALGEBRAICAS, MCD, MCM Y FRACCIONES PARCIALES

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Definición Formal de Fracción Algebraica
Una **fracción algebraica** es el cociente indicado de dos polinomios racionales enteros P(x) y Q(x), donde el denominador Q(x) es no constante (de grado \geq 1):

F(x) = \frac{P(x)}{Q(x)}, \quad \text{con } \text{gr}(Q) \geq 1

#### Conjunto de Valores Admisibles (C.V.A.):
Es el subconjunto de números reales para los cuales la fracción algebraica está perfectamente definida. Quedan excluidos todos aquellos valores reales que anulan el denominador:

\text{C.V.A.} = \{x \in \mathbb{R} \mid Q(x) \neq 0\} = \mathbb{R} \setminus \{x \in \mathbb{R} \mid Q(x) = 0\}

#### Fracción Irreductible o Canónica:
Una fracción \frac{P(x)}{Q(x)} es **irreductible** si y solo si sus términos son polinomios primos entre sí (PESI), es decir:
\text{MCD}[P(x), Q(x)] = 1

---

### 3.2. M.C.D. y M.C.M. de Polinomios

Sean los polinomios factorizados completamente sobre un campo numérico determinado:

1. **Máximo Común Divisor (M.C.D.):**
   Es el polinomio de mayor grado que divide exactamente a cada uno de los polinomios dados.
   - **Regla Práctica:** Se factorizan los polinomios y el M.C.D. se forma multiplicando **únicamente los factores primos comunes elevados a su menor exponente**.

2. **Mínimo Común Múltiplo (M.C.M.):**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Concepto / Teorema | Expresión Matemática | Condición Operativa |
| :--- | :--- | :--- |
| **M.C.D. Polinómico** | \text{MCD} = \prod (f_{\text{comunes}})^{\min(\alpha_i)} | Factores comunes al menor exponente |
| **M.C.M. Polinómico** | \text{MCM} = \prod (f_{\text{todos}})^{\max(\beta_i)} | Factores comunes y no comunes al mayor |
| **Producto de Polinomios** | A(x) \cdot B(x) = \text{MCD} \cdot \text{MCM} | Válido para dos polinomios |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t07_s01_c01",
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
                    id = "alg_t07_s01_c02",
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
                    id = "alg_t07_s01_c03",
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
                    id = "alg_t07_s01_c04",
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
                    id = "alg_t07_s01_c05",
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
                    id = "alg_t07_s01_c06",
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
                    id = "alg_t07_s01_c07",
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
                    id = "alg_t07_s01_c08",
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
                    id = "alg_t07_s01_c09",
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
                    id = "alg_t07_s01_c10",
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
            id = "alg_t07_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   Es el polinomio de menor grado que es divisible exactamente entre cada uno de los polinomios dados.
   - **Regla Práctica:** El M.C.M. se forma multiplicando **todos los factores primos (comunes y no comunes) elevados a su mayor exponente**.

#### Propiedad Fundamental para dos polinomios:
\forall P(x), Q(x): \quad P(x) \cdot Q(x) \equiv \text{MCD}[P(x), Q(x)] \cdot \text{MCM}[P(x), Q(x)]

---

### 3.3. Descomposición en Fracciones Parciales
Es el proceso inverso a la adición de fracciones algebraicas: permite expresar una **fracción propia** (\text{gr}(P) < \text{gr}(Q)) como la suma de fracciones más elementales denominadas **fracciones parciales**.

> [!IMPORTANT]
> **Condición Previa Obligatoria:** Si la fracción es **impropia** (\text{gr}(P) \geq \text{gr}(Q)), primero se debe dividir P(x) entre Q(x) mediante el algoritmo de Euclides:
> \frac{P(x)}{Q(x)} = C(x) + \frac{R(x)}{Q(x)}
> y se descompone únicamente la fracción propia residual \frac{R(x)}{Q(x)}.

#### Casos Canónicos:

#### Caso 1: Denominador con factores lineales distintos no repetidos
Si Q(x) = (x - r_1)(x - r_2)\cdots(x - r_k):
\frac{P(x)}{Q(x)} = \frac{A_1}{x - r_1} + \frac{A_2}{x - r_2} + \dots + \frac{A_k}{x - r_k}

#### Caso 2: Denominador con factores lineales repetidos
Si Q(x) = (x - r)^k:
\frac{P(x)}{(x - r)^k} = \frac{A_1}{x - r} + \frac{A_2}{(x - r)^2} + \dots + \frac{A_k}{(x - r)^k}

#### Caso 3: Denominador con factores cuadráticos irreductibles no repetidos
Si Q(x) contiene un factor cuadrático primo a x^2 + b x + c (\Delta < 0):
\frac{P(x)}{(ax^2 + bx + c)\cdots} = \frac{Ax + B}{ax^2 + bx + c} + \dots

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **C.V.A.** | \text{CVA} = \mathbb{R} \setminus \{x \mid Q(x) = 0\} | Dominio de existencia real |
| **Fracción Propia** | \text{gr}(P) < \text{gr}(Q) | Requisito para fracciones parciales |
| **Método de Heaviside** | A_i = \lim_{x \to r_i} \left[(x - r_i) \frac{P(x)}{Q(x)}\right] | Factores lineales simples |
| **División Previa** | \frac{P(x)}{Q(x)} = q(x) + \frac{R(x)}{Q(x)} | Si \text{gr}(P) \geq \text{gr}(Q) (Fracción impropia) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Simplificación de Fracciones Complejas en Cascada
Cuando tengas una fracción continua (en escalera):
F(x) = 1 + \frac{1}{1 + \frac{1}{1 + \frac{1}{x}}}
**¡No operes algebraicamente desde abajo hacia arriba escribiendo cinco pasos con denominadores monstruosos!**
**Hack:** Multiplica numerador y denominador de la fracción más interna por x, luego por la siguiente expresión lineal, manteniendo un flujo de sumas horizontales directas.

### Artificio 2: Homogeneización de Denominadores Cíclicos
En fracciones de la forma:
\frac{1}{(a - b)(a - c)} + \frac{1}{(b - c)(b - a)} + \frac{1}{(c - a)(c - b)}
**Hack:** Observa los signos de los factores binómicos. El factor (b - a) = -(a - b), y (c - b) = -(b - c).
Cámbiale de signo al numerador y estandariza al orden cíclico canónico (a - b)(b - c)(c - a). El resultado de estas sumas cíclicas simétricas clásicas es casi siempre **0** o **1**.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Método del "Dedo Mágico" (Cobertura de Heaviside)
Para hallar los numeradores A y B de factores lineales simples:
> **"Tápale el hueco al que anulas y reemplaza en lo que queda."**
- Si tienes \frac{3x + 1}{(x - 2)(x + 5)} = \frac{A}{x - 2} + \frac{B}{x + 5}:
  - Para hallar A: la raíz de su denominador es x = 2.
  - Tapas (x - 2) en la fracción original y evalúas x = 2:
    A = \frac{3(2) + 1}{2 + 5} = \frac{7}{7} = 1
  - Para hallar B: la raíz es x = -5. Tapas (x + 5) y evalúas x = -5:
    B = \frac{3(-5) + 1}{-5 - 2} = \frac{-14}{-7} = 2
¡Resuelto en 5 segundos sin armar sistemas de ecuaciones!

### 2. M.C.D. vs. M.C.M.: "El M.C.D. es Exclusivo, el M.C.M. es Inclusivo"
- **M.C.D. (Exclusivo):** Solo acepta a los **comunes** y encima los minimiza al **menor exponente**.
- **M.C.M. (Inclusivo):** Acepta a **todos** (comunes y no comunes) y los maximiza al **mayor exponente**.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Simplificar sin Registrar el C.V.A. (Pérdida o Ganancia de Soluciones)**
> Si te piden simplificar y evaluar:
> f(x) = \frac{x^2 - 9}{x - 3}
> El postulante cancela (x - 3) y dice f(x) = x + 3. Luego le piden f(3) y responde 3 + 3 = 6.
> **¡CERO EN LA PREGUNTA!**
> Para x = 3, el denominador original es 3 - 3 = 0, lo cual es una indeterminación matemática. f(3) **NO EXISTE** (3 \notin \text{C.V.A.}).

> [!CAUTION]
> **Trampa 2: Descomponer en Fracciones Parciales una Fracción Impropia**
> Si el examen propone:
> \frac{x^2 + 5}{x^2 - 1}
> y el postulante escribe directamente \frac{A}{x - 1} + \frac{B}{x + 1}, el resultado será totalmente falso porque el grado del numerador es igual al del denominador.
> **Paso obligado:** Dividir primero:
> \frac{x^2 + 5}{x^2 - 1} = 1 + \frac{6}{x^2 - 1} = 1 + \frac{3}{x - 1} - \frac{3}{x + 1}

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Circuitos Eléctricos y Redes de Impedancia en Alta Tensión (Socabaya, Arequipa)
En la subestación eléctrica de Socabaya (nodo central del Sistema Eléctrico Interconectado Nacional en Arequipa), el cálculo de la impedancia equivalente Z_{eq}(s) en circuitos RLC en paralelo sometidos a corriente alterna se expresa mediante fracciones algebraicas racionales complejas en la variable compleja de Laplace s. La descomposición en fracciones parciales de la función de transferencia de voltaje H(s) = \frac{V_{out}(s)}{V_{in}(s)} es indispensable para antitransformar al dominio del tiempo y prevenir armónicos parásitos que puedan disparar los relés de protección térmica de los transformadores.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t07_s02_c01",
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
                    id = "alg_t07_s02_c02",
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
                    id = "alg_t07_s02_c03",
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
                    id = "alg_t07_s02_c04",
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
                    id = "alg_t07_s02_c05",
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
                    id = "alg_t07_s02_c06",
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
                    id = "alg_t07_s02_c07",
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
                    id = "alg_t07_s02_c08",
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
                    id = "alg_t07_s02_c09",
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
                    id = "alg_t07_s02_c10",
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
