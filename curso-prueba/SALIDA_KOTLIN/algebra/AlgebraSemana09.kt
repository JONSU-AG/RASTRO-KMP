package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana09 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t09_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Análisis de Desigualdades e Intervalos |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Crítica / Alta (95%):** Presente de manera directa en inecuaciones fraccionarias/irracionales y como fundamento del dominio de funciones. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de optimización de costos y restricciones operativas), UNI (Inecuaciones con multiplicidad par y radicales anidados). |
| **Competencia Cardinal** | Determinar el conjunto solución de desigualdades algebraicas mediante el método de los puntos críticos, el Teorema del Trinomio Positivo, la restricción del universo en expresiones fraccionarias e irracionales, y el análisis de valor absoluto. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    INEC["Teoría de Inecuaciones"] --> LIN["Inecuaciones Lineales (ax + b > 0)"]
    INEC --> CUAD["Inecuaciones Cuadráticas"]
    INEC --> POL["Inecuaciones Polinomiales de Grado Superior"]
    INEC --> FRAC["Inecuaciones Fraccionarias: P(x)/Q(x) ≥ 0"]
    INEC --> IRR["Inecuaciones Irracionales: √(A) ≤ B  |  √(A) ≥ B"]
    INEC --> VA["Inecuaciones con Valor Absoluto"]
    
    CUAD --> TTP["Teorema del Trinomio Positivo: a > 0 ∧ Δ < 0"]
    CUAD --> MPC["Método de los Puntos Críticos"]
    
    POL --> MULT["Regla de Multiplicidad (Par rebota / Impar cruza)"]
    
    FRAC --> DENOM["Restricción Obligatoria: Q(x) ≠ 0 (Puntos Abiertos)"]
    
    IRR --> CVA["Universo de Existencia (Radicando ≥ 0)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA IX: INECUACIONES LINEALES, POLINOMIALES, FRACCIONARIAS E IRRACIONALES

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Axiomas de Orden y Definición de Inecuación
Una **inecuación** es una desigualdad algebraica condicional entre dos expresiones que solo es válida para un conjunto de valores reales, denominado **Conjunto Solución (C.S.)**, el cual generalmente se expresa en forma de intervalos continuos o uniones de ellos.

#### Axiomas Cardinales de la Desigualdad:
1. **Ley de Tricotomía:** Dados a, b \in \mathbb{R}, se cumple una y solo una: a < b, a = b, o a > b.
2. **Monotonía de la Adición:** Si a < b \implies a + c < b + c, \ \forall c \in \mathbb{R}.
3. **Monotonía de la Multiplicación:**
   - Si c > 0 \land a < b \implies a \cdot c < b \cdot c (El sentido se conserva).
   - Si c < 0 \land a < b \implies a \cdot c > b \cdot c (**¡El sentido de la desigualdad se invierte!**).

---

### 3.2. Inecuaciones Cuadráticas y el Teorema del Trinomio Positivo
Forma general canónica:
a x^2 + b x + c \gtrless 0, \quad \text{con } a > 0

#### Teorema del Trinomio Positivo (Teorema Fundamental del Álgebra Real):
Sea el trinomio cuadrático P(x) = ax^2 + bx + c con coeficientes reales:
a x^2 + b x + c > 0, \quad \forall x \in \mathbb{R} \iff a > 0 \quad \land \quad \Delta = b^2 - 4ac < 0
- **Consecuencia:** Si un factor cuadrático tiene a > 0 y \Delta < 0, su valor numérico es siempre estrictamente positivo para cualquier x \in \mathbb{R}. Por ende, **se puede eliminar de cualquier inecuación sin alterar el conjunto solución ni el sentido**.

#### Teorema del Trinomio No Negativo:
a x^2 + b x + c \geq 0, \quad \forall x \in \mathbb{R} \iff a > 0 \quad \land \quad \Delta \leq 0

---

### 3.3. Método de los Puntos Críticos (Inecuaciones Polinomiales y Fraccionarias)
Se emplea para resolver inecuaciones de cualquier grado:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Teorema / Inecuación | Formulación Matemática | Condición / Observación |
| :--- | :--- | :--- |
| **Trinomio Positivo** | ax^2 + bx + c > 0, \ \forall x \in \mathbb{R} \iff a > 0 \land \Delta < 0 | Se cancela directamente |
| **Fraccionaria** | \frac{P(x)}{Q(x)} \geq 0 \iff P(x) \cdot Q(x) \geq 0 \land Q(x) \neq 0 | Puntos del denominador abiertos |
| **Multiplicidad Par** | (x - a)^{2n} P(x) \geq 0 \implies P(x) \geq 0 \lor x = a | No cambia signo en la recta |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t09_s01_c01",
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
                    id = "alg_t09_s01_c02",
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
                    id = "alg_t09_s01_c03",
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
                    id = "alg_t09_s01_c04",
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
                    id = "alg_t09_s01_c05",
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
                    id = "alg_t09_s01_c06",
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
                    id = "alg_t09_s01_c07",
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
                    id = "alg_t09_s01_c08",
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
                    id = "alg_t09_s01_c09",
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
                    id = "alg_t09_s01_c10",
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
            id = "alg_t09_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
P(x) = a_n (x - r_1)^{\alpha_1} (x - r_2)^{\alpha_2} \cdots (x - r_k)^{\alpha_k} \gtrless 0

#### Algoritmo Canónico:
1. **Coeficiente Principal Positivo:** Garantizar que todos los factores lineales tengan el coeficiente de x positivo (+1x).
2. **Cálculo de Puntos Críticos:** Igualar cada factor lineal a cero: x = r_1, r_2, \dots, r_k.
3. **Ubicación en la Recta Real:** Ordenar los puntos críticos en la recta numérica en orden creciente.
4. **Regla de los Signos (Multiplicidad de Raíces):**
   - Se comienza desde la extrema derecha con el signo **+**.
   - Al pasar por un punto crítico de **multiplicidad impar** (\alpha = 1, 3, 5, \dots), el signo **cambia** (+ \to - o - \to +).
   - Al pasar por un punto crítico de **multiplicidad par** (\alpha = 2, 4, 6, \dots), el signo **se repite (rebota)** (+ \to + o - \to -).
5. **Selección de la Zona Solución:**
   - Si la inecuación reducida es > 0 o \geq 0, el C.S. está formado por las zonas con signo **+**.
   - Si es < 0 o \leq 0, el C.S. lo forman las zonas con signo **-**.
   - En inecuaciones con \geq o \leq, los puntos críticos del numerador son cerrados, pero **los puntos críticos provenientes del denominador siempre son rigurosamente abiertos**.

---

### 3.4. Inecuaciones Irracionales (Radicales de Índice Par)
Sean A y B expresiones algebraicas reales:

#### Caso 1: \sqrt{A} \leq B
\sqrt{A} \leq B \iff A \geq 0 \quad \land \quad B \geq 0 \quad \land \quad A \leq B^2

#### Caso 2: \sqrt{A} \geq B
\sqrt{A} \geq B \iff \left[ A \geq 0 \ \land \ B < 0 \right] \quad \lor \quad \left[ B \geq 0 \ \land \ A \geq B^2 \right]

---

### 3.5. Inecuaciones con Valor Absoluto
1. |x| \leq b \iff b \geq 0 \quad \land \quad -b \leq x \leq b
2. |x| \geq b \iff x \geq b \quad \lor \quad x \leq -b
3. |x| \leq |y| \iff x^2 \leq y^2 \iff (x - y)(x + y) \leq 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Multiplicidad Impar** | (x - a)^{2n+1} P(x) \geq 0 \iff (x - a) P(x) \geq 0 | Cambia de signo normalmente |
| **Radical Menor** | \sqrt{A} \leq B \iff A \geq 0 \land B \geq 0 \land A \leq B^2 | Tres condiciones simultáneas |
| **Radical Mayor** | \sqrt{A} \geq B \iff (A \geq 0 \land B < 0) \lor (B \geq 0 \land A \geq B^2) | Unión de dos universos |
| **Valores Absolutos** | \|A\| \leq \|B\| \iff (A - B)(A + B) \leq 0 | Diferencia de cuadrados directa |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Cancelación Inmediata de Expresiones Estrictamente Positivas
En inecuaciones racionales complejas como:
\frac{(x^2 + 4)(x^2 + x + 5)(x - 3)^3}{(x^2 - 16)(e^x + 1)} \leq 0
**¡No ubiques x^2 + 4 ni x^2 + x + 5 en la recta numérica!**
**Hack:**
- x^2 + 4 > 0, \forall x.
- x^2 + x + 5 tiene a=1>0 y \Delta = 1 - 20 = -19 < 0 \implies Es siempre positivo por el Teorema del Trinomio Positivo.
- e^x + 1 > 0, \forall x.
**Táchalos todos de inmediato sin alterar el sentido:**
La inecuación se reduce al instante a:
\frac{(x - 3)^3}{(x - 4)(x + 4)} \leq 0 \implies \frac{x - 3}{(x - 4)(x + 4)} \leq 0
Puntos críticos: -4 (abierto), 3 (cerrado), 4 (abierto). Tiempo de resolución: 15 segundos.

### Artificio 2: Elevación al Cuadrado Segura con Valor Absoluto
Si tienes |2x - 5| \leq |x + 4|:
**¡Jamás abras la inecuación en 4 zonas con la definición modular de intervalos!**
**Hack:** Como ambos miembros son no negativos, eleva directamente al cuadrado y aplica diferencia de cuadrados:
(2x - 5)^2 - (x + 4)^2 \leq 0
[(2x - 5) - (x + 4)][(2x - 5) + (x + 4)] \leq 0
(x - 9)(3x - 1) \leq 0 \implies x \in \left[\frac{1}{3}, \ 9\right]

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Ley del Rebote en Puntos Críticos: "Par no pasa, Impar impacta"
- **Exponente Par (2, 4, 6...):** Como una pelota que choca en la pared, el signo **rebota** y se queda igual (+ \to +).
- **Exponente Impar (1, 3, 5...):** Como una bala que atraviesa un cristal, el signo **cambia** (+ \to -).

### 2. Radicales con Mayor: "Si la derecha es negativa, la raíz siempre le gana"
En \sqrt{A} \geq B:
- Si B < 0, ¡no necesitas elevar al cuadrado! Como la raíz siempre es \geq 0, una cantidad no negativa **siempre es mayor que cualquier negativo**. Solo asegúrate de que el radicando exista: A \geq 0.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Punto Crítico de Multiplicidad Par en Desigualdades Estrictas**
> Resuelve: (x - 3)^2 (x + 5) > 0.
> El postulante cancela (x - 3)^2 y pone x + 5 > 0 \implies x > -5.
> **¡ERROR!** Si x = 3, la expresión da (0)^2(8) = 0, pero 0 > 0 es falso.
> El C.S. correcto es: \langle -5, \infty\rangle \setminus \{3\}.

> [!CAUTION]
> **Trampa 2: Cerrar los Puntos del Denominador**
> En la inecuación \frac{x - 2}{x - 7} \leq 0:
> Muchos alumnos ven el signo \leq y marcan C.S. = [2, 7].
> **¡GRAVÍSIMO!** En x = 7 el denominador se hace cero. La solución correcta es C.S. = [2, 7\rangle.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Dimensionamiento de Franja de Amortiguamiento Ambiental en la Quebrada de Añashuayco
En el plan de ordenamiento territorial metropolitano de Arequipa, las canteras de sillar de Añashuayco deben mantener un radio de seguridad x en kilómetros respecto a las urbanizaciones adyacentes para mitigar la contaminación por polvo en suspensión. El índice de dispersión atmosférica se modela mediante la inecuación racional \frac{x^2 - 10x + 16}{x - 1} \leq 0. Resolver esta desigualdad permite a los ingenieros ambientales de la UNSA delimitar con rigor legal las cotas territoriales donde está terminantemente prohibido autorizar licencias de construcción urbana.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t09_s02_c01",
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
                    id = "alg_t09_s02_c02",
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
                    id = "alg_t09_s02_c03",
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
                    id = "alg_t09_s02_c04",
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
                    id = "alg_t09_s02_c05",
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
                    id = "alg_t09_s02_c06",
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
                    id = "alg_t09_s02_c07",
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
                    id = "alg_t09_s02_c08",
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
                    id = "alg_t09_s02_c09",
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
                    id = "alg_t09_s02_c10",
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
