package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana15 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t15_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Sucesiones Polinomiales y Series Finitas e Infinitas |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Alta (89%):** Evaluado intensivamente con incógnitas algebraicas en raíces de polinomios (Cardano), interpolación y suma límite infinita. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de depreciación geométrica y cuotas de crédito), UNI (Sucesiones de orden superior y sumas límite dobles). |
| **Competencia Cardinal** | Formular y resolver problemas que involucran progresiones aritméticas, geométricas y armónicas mediante parametrizaciones simétricas, deduciendo términos enésimos, sumas finitas y sumas límites infinitas convergentes. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    PROG["Progresiones Algebraicas"] --> PA["Progresión Aritmética (P.A.)"]
    PROG --> PG["Progresión Geométrica (P.G.)"]
    PROG --> PH["Progresión Armónica (P.H.)"]
    PROG --> SUP["Sucesiones Polinomiales de Orden Superior"]
    
    PA --> PATEN["Término Enésimo: a_n = a_1 + (n - 1)r"]
    PA --> PASUM["Suma de n términos: S_n = n(a_1 + a_n)/2"]
    PA --> PASIM["Parametrización Simétrica: (x - r), x, (x + r)"]
    
    PG --> PGTEN["Término Enésimo: t_n = t_1 · qⁿ⁻¹"]
    PG --> PGSUM["Suma Finita: S_n = t_1(qⁿ - 1)/(q - 1)"]
    PG --> PGLIM["Suma Límite Infinita (|q| < 1): S_∞ = t_1 / (1 - q)"]
    
    PH --> PHREC["Recíprocos forman una P.A.: 1/a_n"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA XV: PROGRESIONES ARITMÉTICAS, GEOMÉTRICAS Y ARMÓNICAS EN CONTEXTO ALGEBRAICO

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Progresión Aritmética (P.A.) en Álgebra
Una **Progresión Aritmética** (o sucesión por diferencias) es una sucesión de términos donde cada término consecutivo se obtiene sumando una cantidad constante r \in \mathbb{R} denominada **razón aritmética**:

\div a_1 \cdot a_2 \cdot a_3 \cdot \dots \cdot a_n \iff a_{k+1} - a_k = r, \quad \forall k \geq 1

#### Teoremas Fundamentales de la P.A.:
1. **Término General o Enésimo (a_n):**
   a_n = a_1 + (n - 1)r
2. **Propiedad de la Media Aritmética (Tres términos consecutivos):**
   Si a, b, c están en P.A.:
   b - a = c - b \implies 2b = a + c \iff b = \frac{a + c}{2}
3. **Suma de los n Primeros Términos (S_n):**
   S_n = \frac{n(a_1 + a_n)}{2} = \frac{n[2a_1 + (n - 1)r]}{2}
4. **Términos Equidistantes:**
   En toda P.A. finita, la suma de dos términos equidistantes de los extremos es constante:
   a_k + a_{n - k + 1} = a_1 + a_n
5. **Interpolación de m Medios Aritméticos:**
   Para intercalar m términos entre los extremos a y b, el número total de términos es n = m + 2. La razón de interpolación es:
   r = \frac{b - a}{m + 1}

#### Artificio de la Notación Simétrica para Incógnitas en P.A.:
- **Para 3 términos:**
  (x - r), \quad x, \quad (x + r) \implies \text{Suma} = 3x \quad (\text{se cancela la razón } r)
- **Para 4 términos (con razón 2r):**
  (x - 3r), \quad (x - r), \quad (x + r), \quad (x + 3r) \implies \text{Suma} = 4x
- **Para 5 términos:**
  (x - 2r), \quad (x - r), \quad x, \quad (x + r), \quad (x + 2r) \implies \text{Suma} = 5x


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Tipo de Progresión | Término Enésimo | Suma de Términos | Propiedad Central |
| :--- | :--- | :--- | :--- |
| **P.A. (Aritmética)** | a_n = a_1 + (n - 1)r | S_n = \frac{n(a_1 + a_n)}{2} | b = \frac{a + c}{2} |
| **P.A. Interpolación** | r = \frac{b - a}{m + 1} | — | a_k + a_{n-k+1} = a_1 + a_n |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t15_s01_c01",
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
                    id = "alg_t15_s01_c02",
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
                    id = "alg_t15_s01_c03",
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
                    id = "alg_t15_s01_c04",
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
                    id = "alg_t15_s01_c05",
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
                    id = "alg_t15_s01_c06",
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
                    id = "alg_t15_s01_c07",
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
                    id = "alg_t15_s01_c08",
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
                    id = "alg_t15_s01_c09",
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
                    id = "alg_t15_s01_c10",
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
            id = "alg_t15_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
---

### 3.2. Progresión Geométrica (P.G.) en Álgebra
Una **Progresión Geométrica** (o sucesión por cocientes) es una sucesión de términos donde cada término consecutivo se obtiene multiplicando el anterior por una constante no nula q \in \mathbb{R} \setminus \{0\} denominada **razón geométrica**:

\div\div t_1 : t_2 : t_3 : \dots : t_n \iff \frac{t_{k+1}}{t_k} = q, \quad \forall k \geq 1

#### Teoremas Fundamentales de la P.G.:
1. **Término General o Enésimo (t_n):**
   t_n = t_1 \cdot q^{n - 1}
2. **Propiedad de la Media Geométrica (Tres términos consecutivos):**
   Si a, b, c están en P.G.:
   \frac{b}{a} = \frac{c}{b} \implies b^2 = a \cdot c \iff b = \sqrt{ac}
3. **Producto de los n Primeros Términos (P_n):**
   P_n = \sqrt{(t_1 \cdot t_n)^n}
4. **Suma de los n Primeros Términos (S_n con q \neq 1):**
   S_n = \frac{t_1(q^n - 1)}{q - 1} = \frac{t_n q - t_1}{q - 1}
5. **Suma Límite de una P.G. Decreciente e Infinita (S_\infty):**
   Si la razón geométrica en valor absoluto es estrictamente menor a la unidad (|q| < 1, es decir, -1 < q < 1), cuando n \to \infty, q^n \to 0:
   \mathbf{S_\infty = \lim_{n \to \infty} S_n = \frac{t_1}{1 - q}}
6. **Interpolación de m Medios Geométricos:**
   Para intercalar m términos entre los extremos a y b:
   q = \sqrt[m + 1]{\frac{b}{a}}

---

### 3.3. Progresión Armónica (P.H.)
Una sucesión de números reales no nulos h_1, h_2, \dots, h_n forma una **Progresión Armónica** si y solo si los recíprocos de sus términos forman una Progresión Aritmética:

\frac{1}{h_1}, \ \frac{1}{h_2}, \ \frac{1}{h_3}, \ \dots, \ \frac{1}{h_n} \quad \text{están en P.A.}
- **Término medio armónico entre a y c:**
  b = \frac{2ac}{a + c} \quad (\text{Media Armónica})

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **P.G. (Geométrica)** | t_n = t_1 q^{n - 1} | S_n = \frac{t_1(q^n - 1)}{q - 1} | b^2 = ac |
| **P.G. Suma Límite** | — | S_\infty = \frac{t_1}{1 - q} | Válida si \|q\| < 1 |
| **P.G. Producto** | P_n = \sqrt{(t_1 t_n)^n} | — | t_k \cdot t_{n-k+1} = t_1 \cdot t_n |
| **P.H. (Armónica)** | h_n = \frac{1}{\frac{1}{h_1} + (n - 1)r_{\text{rec}}} | — | b = \frac{2ac}{a + c} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Cardano y Raíces Polinómicas en P.A.
Si te dicen: *"Las tres raíces de la ecuación x^3 - 12x^2 + 47x - 60 = 0 están en progresión aritmética"*:
**¡Jamás uses Cardano con x_1, x_2, x_3 independientes!**
**Hack:** Escribe las raíces como:
x_1 = x - r, \quad x_2 = x, \quad x_3 = x + r
Por Cardano, la suma de raíces es:
(x - r) + x + (x + r) = -\frac{-12}{1} = 12
3x = 12 \implies x = 4
¡Ya tienes una raíz del polinomio en 5 segundos! Ahora divides el polinomio entre (x - 4) por Ruffini y hallas las otras dos raíces al instante.

### Artificio 2: Descomposición de Fracciones Decimales Periódicas como Suma Límite
Si tienes que calcular la fracción generatriz de 0.777\dots o un rebote de pelota:
S = \frac{7}{10} + \frac{7}{100} + \frac{7}{1000} + \dots
Es una P.G. infinita con t_1 = 7/10 y q = 1/10:
S_\infty = \frac{\frac{7}{10}}{1 - \frac{1}{10}} = \frac{\frac{7}{10}}{\frac{9}{10}} = \frac{7}{9}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Parametrización de Tres Incógnitas: "El Centro Neutro"
- En P.A. de 3 términos: **(x - r), x, (x + r)**. Al sumarlos, ¡la r se esfuma y despejas x al instante!
- En P.G. de 3 términos: **\frac{x}{q}, x, xq**. Al multiplicarlos, ¡la q se cancela y obtienes x^3 = \text{Producto} de inmediato!

### 2. Suma Límite Infinita: "Primero sobre Uno Menos Razón" (P-U-M-R)
S_\infty = \frac{\text{Primero}}{1 - \text{Razón}} = \frac{t_1}{1 - q}
Recuerda: solo sirve si la razón es una fracción propia (está achicando la serie).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Aplicar Suma Límite con Razón Divergente (|q| \geq 1)**
> Si la serie es: 2 + 6 + 18 + 54 + \dots
> El estudiante ve la fórmula y reemplaza t_1 = 2, q = 3:
> S_\infty = \frac{2}{1 - 3} = \frac{2}{-2} = -1 \quad \text{¡ABSURDO TOTAL!}
> La suma de números positivos no puede ser negativa. La fórmula S_\infty = \frac{t_1}{1 - q} es **exclusiva para razones convergentes |q| < 1**. Si |q| \geq 1, la suma diverge a infinito (\infty).

> [!CAUTION]
> **Trampa 2: La Razón en la Parametrización de 4 Términos**
> Si escribes 4 términos en P.A. como (x - 3r), (x - r), (x + r), (x + 3r):
> ¡Cuidado! La razón de esta progresión **NO es r, es 2r** (la distancia entre (x - r) y (x + r) es 2r).
> Si luego el problema te pide la razón, debes responder 2r, no r.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Amortización Financiera y Rebote de Partículas en Balística Volcánica
En el cálculo de ingeniería de materiales para mitigar impactos de bombas volcánicas en las laderas del volcán Ubinas, se modela el rebote elástico de fragmentos de roca andesítica. Si una roca se desprende desde una altura inicial de H = 100 metros y en cada impacto rebota exactamente hasta las tres cuartas partes (q = 3/4) de la altura precedente, la distancia vertical total recorrida por la roca hasta detenerse teóricamente se modela mediante una suma límite geométrica infinita:
D_{\text{total}} = H_{\text{bajada}} + 2 \sum_{k=1}^{\infty} H_k = 100 + 2\left(\frac{100 \cdot \frac{3}{4}}{1 - \frac{3}{4}}\right) = 100 + 2\left(\frac{75}{1/4}\right) = 100 + 2(300) = 700 \text{ metros}.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t15_s02_c01",
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
                    id = "alg_t15_s02_c02",
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
                    id = "alg_t15_s02_c03",
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
                    id = "alg_t15_s02_c04",
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
                    id = "alg_t15_s02_c05",
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
                    id = "alg_t15_s02_c06",
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
                    id = "alg_t15_s02_c07",
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
                    id = "alg_t15_s02_c08",
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
                    id = "alg_t15_s02_c09",
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
                    id = "alg_t15_s02_c10",
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
