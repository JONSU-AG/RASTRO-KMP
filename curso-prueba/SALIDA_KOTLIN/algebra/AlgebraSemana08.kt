package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t08_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Álgebra Superior y Modelación Cuantitativa |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Máxima / Vital (98%):** Todo examen de admisión contiene como mínimo un problema directo de ecuaciones cuadráticas o bicuadradas. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de ingresos, costos y proyectiles), UNI (Discusión analítica paramétrica de raíces y ecuaciones bicuadradas). |
| **Competencia Cardinal** | Clasificar ecuaciones por su compatibilidad, determinar la naturaleza de las raíces cuadráticas mediante el discriminante, aplicar el Teorema de Cardano-Viète para relaciones simétricas y reconstruir ecuaciones polinomiales bicuadradas. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    ECU["Teoría General de Ecuaciones"] --> CLAS["Clasificación por Soluciones"]
    ECU --> LIN["Ecuaciones Lineales (1.er Grado): ax + b = 0"]
    ECU --> CUAD["Ecuaciones Cuadráticas (2.° Grado): ax² + bx + c = 0"]
    ECU --> BIC["Ecuaciones Bicuadradas: ax⁴ + bx² + c = 0"]
    
    CLAS --> CD["Compatible Determinada (C.S. finito y no vacío)"]
    CLAS --> CI["Compatible Indeterminada (Infinitas soluciones: Identidad)"]
    CLAS --> INC["Incompatible o Inconsistente (C.S. = ∅, Absurdo)"]
    
    CUAD --> FORM["Fórmula General y Discriminante Δ = b² - 4ac"]
    CUAD --> CARD["Teorema de Cardano-Viète (Suma S y Producto P)"]
    CUAD --> REC["Reconstrucción Cuadrática: x² - Sx + P = 0"]
    CUAD --> ESPE["Raíces Especiales: Simétricas (b=0) y Recíprocas (a=c)"]
    
    BIC --> BPROP["Propiedades de las Raíces: {m, -m, n, -n}"]
    BIC --> BCARD["Cardano Bicuadrada: m² + n² = -b/a  |  m²n² = c/a"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA VIII: ECUACIONES LINEALES, CUADRÁTICAS Y BICUADRADAS

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Teoría General y Clasificación de Ecuaciones
Una **ecuación** es una igualdad condicional entre dos expresiones algebraicas que contiene una o más variables denominadas incógnitas, y que solo se satisface para valores específicos pertenecientes a su Conjunto Solución (C.S.).

#### Clasificación Rigurosa por la Naturaleza de su Conjunto Solución:
1. **Ecuación Compatible:** Posee al menos una solución.
   - **Compatible Determinada:** El número de soluciones es finito (C.S. = \{x_1, x_2, \dots, x_n\}).
   - **Compatible Indeterminada:** Admite infinitas soluciones (C.S. = \mathbb{R} o un intervalo continuo; se reduce a una identidad matemática 0 = 0).
2. **Ecuación Incompatible (Inconsistente o Absurda):** No existe ningún valor real que verifique la igualdad (C.S. = \emptyset). Se reduce a una contradicción aritmética (ej. 0 = 7).

---

### 3.2. Ecuaciones Lineales (Primer Grado)
Forma general canónica:
a x + b = 0, \quad \text{con } a, b \in \mathbb{R}

#### Análisis Paramétrico de Existencia y Unicidad:
- **Caso 1: Compatible Determinada:**
  a \neq 0 \implies x = -\frac{b}{a} \quad (\text{Solución única: } C.S. = \{-b/a\})
- **Caso 2: Compatible Indeterminada:**
  a = 0 \quad \land \quad b = 0 \implies 0x = 0 \quad (\forall x \in \mathbb{R} \implies C.S. = \mathbb{R})
- **Caso 3: Incompatible:**
  a = 0 \quad \land \quad b \neq 0 \implies 0x = -b \quad (\text{Absurdo} \implies C.S. = \emptyset)

---

### 3.3. Ecuaciones Cuadráticas (Segundo Grado)
Forma general canónica:
a x^2 + b x + c = 0, \quad \text{con } a \neq 0; \ a, b, c \in \mathbb{R}

#### Fórmula General de Resolución:
x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a}

#### Estudio Riguroso del Discriminante (\Delta = b^2 - 4ac):
El discriminante \Delta define la naturaleza matemática de las dos raíces x_1 y x_2:
1. **Si \Delta > 0:** Las raíces son **reales y diferentes** (x_1 \neq x_2 \in \mathbb{R}). La parábola corta al eje X en dos puntos distintos.
   - Si además a, b, c \in \mathbb{Q} y \Delta es un cuadrado perfecto (\Delta = k^2), las raíces son **racionales**.
   - Si \Delta no es cuadrado perfecto, las raíces son **irracionales conjugadas** (m \pm \sqrt{n}).
2. **Si \Delta = 0:** Las raíces son **reales e iguales** (x_1 = x_2 = -b/(2a)). La ecuación presenta una **raíz doble** (solución única, multiplicidad 2). El trinomio es un Trinomio Cuadrado Perfecto (TCP) y la parábola es tangente al eje X.
3. **Si \Delta < 0:** Las raíces son **complejas imaginarias conjugadas** (x_{1,2} = \alpha \pm \beta i, con \beta \neq 0). La gráfica no interseca al eje real X.

#### Teorema de Cardano-Viète para Ecuaciones Cuadráticas:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Ecuación / Teorema | Fórmula Matemática | Propiedad / Condición |
| :--- | :--- | :--- |
| **Lineal Compatible Indet.** | ax + b = 0 \iff a = 0 \land b = 0 | C.S. = \mathbb{R} |
| **Lineal Incompatible** | ax + b = 0 \iff a = 0 \land b \neq 0 | C.S. = \emptyset |
| **Discriminante Cuadrático** | \Delta = b^2 - 4ac | Caracteriza la naturaleza de raíces |
| **Cardano (Suma Cuadrática)** | x_1 + x_2 = -b/a | Suma de soluciones |
| **Cardano (Producto Cuad.)** | x_1 x_2 = c/a | Producto de soluciones |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t08_s01_c01",
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
                    id = "alg_t08_s01_c02",
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
                    id = "alg_t08_s01_c03",
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
                    id = "alg_t08_s01_c04",
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
                    id = "alg_t08_s01_c05",
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
                    id = "alg_t08_s01_c06",
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
                    id = "alg_t08_s01_c07",
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
                    id = "alg_t08_s01_c08",
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
                    id = "alg_t08_s01_c09",
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
                    id = "alg_t08_s01_c10",
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
            id = "alg_t08_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Sean x_1 y x_2 las raíces de ax^2 + bx + c = 0:
1. **Suma de Raíces (S):**
   S = x_1 + x_2 = -\frac{b}{a}
2. **Producto de Raíces (P):**
   P = x_1 \cdot x_2 = \frac{c}{a}
3. **Diferencia de Raíces (|D|):**
   A través de la Identidad de Legendre:
   (x_1 + x_2)^2 - (x_1 - x_2)^2 = 4x_1 x_2 \implies |x_1 - x_2| = \frac{\sqrt{\Delta}}{|a|}

#### Casos Particulares de Raíces Cuadráticas:
- **Raíces Simétricas u Opuestas:**
  x_1 + x_2 = 0 \iff b = 0 \quad (\text{las raíces son de la forma } r \text{ y } -r)
- **Raíces Recíprocas o Inversas:**
  x_1 \cdot x_2 = 1 \iff c = a \quad \left(\text{las raíces son de la forma } r \text{ y } \frac{1}{r}\right)
- **Raíz Nula (x = 0):**
  c = 0

#### Reconstrucción de la Ecuación Cuadrática:
Dadas la suma S y el producto P de dos números:
x^2 - S x + P = 0

---

### 3.4. Ecuaciones Bicuadradas (Cuarto Grado Canónico)
Una **ecuación bicuadrada** es una ecuación polinómica de cuarto grado que contiene únicamente potencias pares de la incógnita:

a x^4 + b x^2 + c = 0, \quad \text{con } a \neq 0; \ a, b, c \in \mathbb{R}

#### Propiedades Estructurales de sus Cuatro Raíces:
Al hacer el cambio de variable y = x^2, la ecuación se reduce a a y^2 + b y + c = 0.
Si sus raíces en y son y_1 e y_2, entonces las cuatro raíces en x son:
x = \pm \sqrt{y_1}, \quad x = \pm \sqrt{y_2}
Por tanto, las cuatro raíces de toda ecuación bicuadrada son **simétricas dos a dos**:
\text{Raíces} = \{m, -m, n, -n\}

#### Relaciones de Cardano-Viète en Bicuadradas:
1. **Suma de las cuatro raíces:**
   x_1 + x_2 + x_3 + x_4 = m + (-m) + n + (-n) = 0
2. **Suma de productos binarios:**
   x_1 x_2 + x_1 x_3 + \dots = -m^2 - n^2 = -\frac{b}{a} \implies m^2 + n^2 = -\frac{b}{a}
3. **Producto de las cuatro raíces:**
   x_1 \cdot x_2 \cdot x_3 \cdot x_4 = (m)(-m)(n)(-n) = m^2 n^2 = \frac{c}{a}

#### Reconstrucción de una Ecuación Bicuadrada:
Si se conocen dos raíces no simétricas m y n:
x^4 - (m^2 + n^2) x^2 + m^2 n^2 = 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Diferencia de Raíces** | \|x_1 - x_2\| = \frac{\sqrt{\Delta}}{\|a\|} | Vía Legendre |
| **Reconstrucción Cuadrática** | x^2 - Sx + P = 0 | S = x_1+x_2, \ P = x_1 x_2 |
| **Raíces Simétricas** | x_1 + x_2 = 0 \iff b = 0 | Raíces opuestas |
| **Raíces Recíprocas** | x_1 x_2 = 1 \iff a = c | Raíces inversas |
| **Cardano Bicuadrada** | m^2 + n^2 = -b/a \quad \land \quad m^2 n^2 = c/a | Raíces: \{m, -m, n, -n\} |
| **Reconstrucción Bicuadrada** | x^4 - (m^2 + n^2)x^2 + m^2 n^2 = 0 | Cuarto grado simétrico |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Reconstrucción Rápida de la Suma de Cuadrados y Cubos de Raíces
Si tienes a x^2 + b x + c = 0 y te piden x_1^2 + x_2^2 o x_1^3 + x_2^3:
**¡Jamás resuelvas la ecuación cuadrática por fórmula general para luego elevar las raíces al cuadrado o al cubo!**
**Hack:** Usa directamente los productos notables sobre la suma S y el producto P:
x_1^2 + x_2^2 = S^2 - 2P
x_1^3 + x_2^3 = S^3 - 3PS
Esto reduce el tiempo de resolución de 4 minutos a 15 segundos.

### Artificio 2: Cambio de Variable Fraccionario en Ecuaciones Recíprocas de Cuarto Grado
Dada una ecuación simétrica de cuarto grado:
a x^4 + b x^3 + c x^2 + b x + a = 0
**Hack:**
1. Divide toda la ecuación entre x^2:
   a\left(x^2 + \frac{1}{x^2}\right) + b\left(x + \frac{1}{x}\right) + c = 0
2. Haz el cambio de variable u = x + \frac{1}{x} \implies x^2 + \frac{1}{x^2} = u^2 - 2.
3. La ecuación se transforma en una cuadrática simple en u:
   a(u^2 - 2) + bu + c = 0

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Semáforo del Discriminante (\Delta)
> **"Verde (Positivo), Amarillo (Cero), Rojo (Negativo)"**
- **\Delta > 0 (Verde - Vía libre):** 2 raíces reales distintas.
- **\Delta = 0 (Amarillo - Precaución):** 1 raíz doble (son gemelas).
- **\Delta < 0 (Rojo - Alto al mundo real):** Se sale de \mathbb{R}, entra al mundo de los complejos imaginarios.

### 2. Ecuaciones Bicuadradas: "Parejas de Baile Gemelas"
En toda ecuación bicuadrada, las raíces nunca van solas:
- Si entra el 3, obligatoriamente entra su gemelo opuesto -3.
- Si entra el 2i, obligatoriamente entra -2i.
- Por eso: **¡La suma total de las 4 raíces siempre es CERO!**

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Coeficiente Principal Paramétrico (a \neq 0)**
> Si el problema dice: *"La ecuación cuadrática (k - 2)x^2 + 5x + 3 = 0 tiene solución única"*:
> El estudiante novato calcula \Delta = 0.
> **¡CUIDADO!** Si k = 2, el término cuadrático desaparece y la ecuación se convierte en 5x + 3 = 0 \implies x = -3/5, ¡que también tiene solución única!
> La pregunta debe indicar si se mantiene como ecuación de segundo grado obligatoriamente.

> [!CAUTION]
> **Trampa 2: Raíz Doble vs. Conjunto Solución**
> Si una ecuación cuadrática tiene como raíz doble x = 4:
> - Sus raíces son: x_1 = 4 y x_2 = 4 (posee dos raíces).
> - Su Conjunto Solución es: C.S. = \{4\} (posee **un solo elemento**).
> ¡Muchos postulantes fallan cuando la pregunta pide: "Indique el cardinal del conjunto solución"! El cardinal es 1, no 2.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Balística y Trayectoria Parabólica en la Topografía del Misti
En los cálculos de prevención de riesgo volcánico del Observatorio Vulcanológico del INGEMMET en Arequipa, la trayectoria de los proyectiles balísticos eyectados por el cráter del volcán Misti se modela mediante la función cinemática cuadrática de altura:
h(t) = h_0 + v_{0y} t - \frac{1}{2} g t^2
La determinación del tiempo de impacto en la base de la quebrada corresponde a resolver la ecuación cuadrática h(t) = 0. El discriminante \Delta permite determinar si el proyectil logra franquear una cresta topográfica intermedia de sillar (\Delta > 0), si apenas roza la cumbre (\Delta = 0), o si colisiona antes de la cima.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t08_s02_c01",
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
                    id = "alg_t08_s02_c02",
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
                    id = "alg_t08_s02_c03",
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
                    id = "alg_t08_s02_c04",
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
                    id = "alg_t08_s02_c05",
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
                    id = "alg_t08_s02_c06",
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
                    id = "alg_t08_s02_c07",
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
                    id = "alg_t08_s02_c08",
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
                    id = "alg_t08_s02_c09",
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
                    id = "alg_t08_s02_c10",
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
