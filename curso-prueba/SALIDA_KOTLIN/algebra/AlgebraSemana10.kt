package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana10 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t10_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Álgebra Lineal y Modelos Multivariables |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Crítica / Alta (93%):** Preguntas recurrentes de discusión paramétrica de compatibilidad (solución única, infinitas soluciones o inconsistente) y problemas de planteo DECO. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de optimización logística y costos de mezclas), UNI (Sistemas homogéneos y determinantes de orden 3x3). |
| **Competencia Cardinal** | Resolver sistemas de ecuaciones lineales y no lineales mediante métodos analíticos y determinantes (Regla de Cramer), analizando rigurosamente las condiciones algebraicas y geométricas de compatibilidad e incompatibilidad. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    SE["Sistemas de Ecuaciones"] --> SEL["Sistemas Lineales (SEL)"]
    SE --> SNL["Sistemas No Lineales"]
    
    SEL --> CLAS["Clasificación Geométrica y Analítica"]
    SEL --> MET["Métodos de Resolución"]
    
    CLAS --> SCD["Compatible Determinado: Rectas secantes (Δs ≠ 0)"]
    CLAS --> SCI["Compatible Indeterminado: Rectas coincidentes (a1/a2 = b1/b2 = c1/c2)"]
    CLAS --> SI["Incompatible: Rectas paralelas (a1/a2 = b1/b2 ≠ c1/c2)"]
    
    MET --> ELEM["Métodos Elementales: Reducción, Igualación, Sustitución"]
    MET --> CRAMER["Regla de Cramer (Determinantes Δs, Δx, Δy)"]
    MET --> GAUSS["Eliminación Gaussiana (Escalonamiento 3x3)"]
    
    SNL --> SIM["Sistemas Simétricos (Cambio u = x + y, v = xy)"]
    SNL --> CL["Sistemas Cuadrático-Lineales"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA X: SISTEMAS DE ECUACIONES LINEALES Y NO LINEALES

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Definición Formal de un Sistema de Ecuaciones
Un **sistema de ecuaciones** es un conjunto de dos o más ecuaciones con dos o más incógnitas que deben verificarse simultáneamente para una misma colección de valores numéricos, denominada **Solución del Sistema**.

\begin{cases} f_1(x_1, x_2, \dots, x_n) = 0 \\ f_2(x_1, x_2, \dots, x_n) = 0 \\ \quad \vdots \\ f_m(x_1, x_2, \dots, x_n) = 0 \end{cases}

El **Conjunto Solución (C.S.)** está formado por las n-tuplas ordenadas (x_1, x_2, \dots, x_n) que satisfacen todas las ecuaciones a la vez.

---

### 3.2. Sistemas de Ecuaciones Lineales de 2x2
Forma canónica de dos ecuaciones con dos incógnitas:
\begin{cases} a_1 x + b_1 y = c_1 \\ a_2 x + b_2 y = c_2 \end{cases}

#### A. Clasificación Analítica y Geométrica:

| Tipo de Sistema | Condición de Coeficientes | Determinantes | Interpretación Geométrica |
| :--- | :--- | :--- | :--- |
| **Compatible Determinado (SCD)** | \frac{a_1}{a_2} \neq \frac{b_1}{b_2} | \Delta_s \neq 0 | Dos rectas secantes que se cortan en un **único punto** (x_0, y_0). |
| **Compatible Indeterminado (SCI)** | \frac{a_1}{a_2} = \frac{b_1}{b_2} = \frac{c_1}{c_2} | \Delta_s = \Delta_x = \Delta_y = 0 | Dos rectas **coincidentes** (la misma recta); infinitos puntos comunes. |
| **Incompatible / Inconsistente (SI)** | \frac{a_1}{a_2} = \frac{b_1}{b_2} \neq \frac{c_1}{c_2} | \Delta_s = 0 \ \land \ (\Delta_x \neq 0 \lor \Delta_y \neq 0) | Dos rectas **paralelas y distintas**; jamás se intersecan (C.S. = \emptyset). |

---

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Concepto / Teorema | Fórmula Matemática | Condición Operativa |
| :--- | :--- | :--- |
| **SCD (Solución Única)** | \frac{a_1}{a_2} \neq \frac{b_1}{b_2} \iff \Delta_s \neq 0 | Rectas secantes |
| **SCI (Infinitas Soluciones)** | \frac{a_1}{a_2} = \frac{b_1}{b_2} = \frac{c_1}{c_2} | Rectas idénticas |
| **Incompatible (Sin Solución)** | \frac{a_1}{a_2} = \frac{b_1}{b_2} \neq \frac{c_1}{c_2} | Rectas paralelas |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t10_s01_c01",
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
                    id = "alg_t10_s01_c02",
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
                    id = "alg_t10_s01_c03",
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
                    id = "alg_t10_s01_c04",
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
                    id = "alg_t10_s01_c05",
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
                    id = "alg_t10_s01_c06",
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
                    id = "alg_t10_s01_c07",
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
                    id = "alg_t10_s01_c08",
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
                    id = "alg_t10_s01_c09",
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
                    id = "alg_t10_s01_c10",
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
            id = "alg_t10_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.3. Resolución por Determinantes (Regla de Gabriel Cramer)
Para el sistema 2 \times 2:
\Delta_s = \begin{vmatrix} a_1 & b_1 \\ a_2 & b_2 \end{vmatrix} = a_1 b_2 - a_2 b_1 \quad (\text{Determinante del Sistema})
\Delta_x = \begin{vmatrix} c_1 & b_1 \\ c_2 & b_2 \end{vmatrix} = c_1 b_2 - c_2 b_1 \quad (\text{Determinante de } x)
\Delta_y = \begin{vmatrix} a_1 & c_1 \\ a_2 & c_2 \end{vmatrix} = a_1 c_2 - a_2 c_1 \quad (\text{Determinante de } y)

Si \Delta_s \neq 0, la solución única está dada por:
x = \frac{\Delta_x}{\Delta_s}, \quad y = \frac{\Delta_y}{\Delta_s}

---

### 3.4. Sistemas Lineales de 3x3 y Regla de Sarrus
Para un sistema de tres ecuaciones con tres incógnitas:
\begin{cases} a_1 x + b_1 y + c_1 z = d_1 \\ a_2 x + b_2 y + c_2 z = d_2 \\ a_3 x + b_3 y + c_3 z = d_3 \end{cases}

El determinante del sistema se calcula mediante la **Regla de Pierre Sarrus** (o desarrollo por menores complementarios de Laplace):
\Delta_s = \begin{vmatrix} a_1 & b_1 & c_1 \\ a_2 & b_2 & c_2 \\ a_3 & b_3 & c_3 \end{vmatrix} = (a_1 b_2 c_3 + b_1 c_2 a_3 + c_1 a_2 b_3) - (a_3 b_2 c_1 + b_3 c_2 a_1 + c_3 a_2 b_1)
Las soluciones vienen dadas por:
x = \frac{\Delta_x}{\Delta_s}, \quad y = \frac{\Delta_y}{\Delta_s}, \quad z = \frac{\Delta_z}{\Delta_s}

#### Sistemas Homogéneos:
Son aquellos donde todos los términos independientes son ceros (d_1 = d_2 = d_3 = 0).
- Siempre admiten la **solución trivial**: (x, y, z) = (0, 0, 0).
- Admiten **soluciones distintas de la trivial (infinitas soluciones)** si y solo si el determinante del sistema es nulo:
  \Delta_s = 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cramer 2x2** | x = \frac{\Delta_x}{\Delta_s}, \ y = \frac{\Delta_y}{\Delta_s} | \Delta_s \neq 0 |
| **Cramer 3x3** | z = \frac{\Delta_z}{\Delta_s} | \Delta_s \neq 0 |
| **Sistema Homogéneo No Trivial** | \Delta_s = 0 | Infinitas soluciones para d_i = 0 |
| **Transformación Simétrica** | u = x + y, \ v = xy | Simplificación de sistemas no lineales |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Suma o Resta Global en Sistemas Cíclicos 3x3
Cuando tengas un sistema cíclico de la forma:
\begin{cases} x + y = 14 \\ y + z = 18 \\ z + x = 20 \end{cases}
**¡No despejes x para reemplazar en las otras dos!**
**Hack:** Suma las tres ecuaciones miembro a miembro:
2x + 2y + 2z = 14 + 18 + 20 = 52 \implies x + y + z = 26
Ahora resta cada ecuación original:
- (x + y + z) - (x + y) = 26 - 14 \implies z = 12
- (x + y + z) - (y + z) = 26 - 18 \implies x = 8
- (x + y + z) - (z + x) = 26 - 20 \implies y = 6
¡Resuelto mentalmente en 10 segundos!

### Artificio 2: Cambio de Variable Elemental en Sistemas Simétricos No Lineales
En sistemas de la forma:
\begin{cases} x + y + xy = 11 \\ x^2 + y^2 = 13 \end{cases}
**Hack:** Haz u = x + y y v = xy:
- La primera ecuación es: u + v = 11 \implies v = 11 - u.
- La segunda es: x^2 + y^2 = (x + y)^2 - 2xy = u^2 - 2v = 13.
Sustituyes v: u^2 - 2(11 - u) = 13 \implies u^2 + 2u - 35 = 0 \implies (u + 7)(u - 5) = 0.
Calculas u y v y luego reconstruyes la cuadrática t^2 - ut + v = 0.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Tres Proporciones de Compatibilidad: "Diferente, Triple Igual, Final Roto"
- **Diferente \to Determinado:** Si \frac{a_1}{a_2} \neq \frac{b_1}{b_2}, hay solución única (se cortan).
- **Triple Igual \to Infinitas:** Si todo es igual (\frac{a_1}{a_2} = \frac{b_1}{b_2} = \frac{c_1}{c_2}), son la misma recta disfrazada.
- **Final Roto \to Incompatible:** Si las x e y son proporcionales pero el término independiente se rompe (\neq \frac{c_1}{c_2}), las rectas corren paralelas y nunca se tocan.

### 2. Solución Trivial en Homogéneos: "El Trío Cero"
Todo sistema homogéneo tiene asegurado el (0, 0, 0). Para que tenga "vida propia" más allá del cero, su determinante debe colapsar a cero (\Delta_s = 0).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Sistema Incompatible cuando \Delta_s = 0**
> Muchos textos simplistas afirman: *"Si \Delta_s = 0, el sistema es incompatible"*.
> **¡FALSO!** Si \Delta_s = 0, el sistema puede ser **Incompatible** (\Delta_x \neq 0) o **Compatible Indeterminado** (\Delta_x = 0 y \Delta_y = 0).
> Debes verificar siempre las proporciones completas con los términos independientes.

> [!CAUTION]
> **Trampa 2: Despejar y Dividir entre Variables que Pueden ser Cero**
> En sistemas no lineales como:
> \begin{cases} x^2 y = 4 \\ x y^2 = 2 \end{cases}
> Al dividir miembro a miembro, asegúrate de constatar que x \neq 0 e y \neq 0. Como los términos independientes son no nulos (4 y 2), ninguna variable puede valer cero, lo que valida la división: \frac{x}{y} = 2 \implies x = 2y.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Distribución de Cargas Logísticas en el Parque Industrial de Río Seco
En el centro logístico de Río Seco en Arequipa, tres empresas de transporte distribuyen insumos agrícolas combinando tres tipos de camiones de distinta capacidad de carga (x: 5 tn, y: 10 tn, z: 25 tn). El requerimiento simultáneo de combustible, tonelaje transportado y peajes genera un sistema de ecuaciones lineales 3 \times 3. Si el determinante del sistema fuera nulo (\Delta_s = 0), las rutas de transporte resultarían redundantes o incompatibles, provocando la paralización del despacho de hortalizas hacia los mercados de abastos de la plataforma Avelino Cáceres.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t10_s02_c01",
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
                    id = "alg_t10_s02_c02",
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
                    id = "alg_t10_s02_c03",
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
                    id = "alg_t10_s02_c04",
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
                    id = "alg_t10_s02_c05",
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
                    id = "alg_t10_s02_c06",
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
                    id = "alg_t10_s02_c07",
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
                    id = "alg_t10_s02_c08",
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
                    id = "alg_t10_s02_c09",
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
                    id = "alg_t10_s02_c10",
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
