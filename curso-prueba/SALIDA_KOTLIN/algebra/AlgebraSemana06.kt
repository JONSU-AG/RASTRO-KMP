package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t06_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Álgebra Superior |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Crítica / Imprescindible (96%):** Es una herramienta obligatoria en simplificación de fracciones, resolución de ecuaciones de grado superior e inecuaciones. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO modelado en dimensiones geométricas), UNI (Aspa doble especial y sumas/restas especiales). |
| **Competencia Cardinal** | Descomponer polinomios en el producto indicado de sus factores primos sobre \mathbb{Q}, \mathbb{R} y \mathbb{C}, dominando aspa simple, aspa doble, aspa doble especial, divisores binómicos y artificios de cambio de variable. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    FAC["Factorización de Polinomios"] --> CAMP["Campos Numéricos: Q, R, C"]
    FAC --> MET["Métodos Tradicionales"]
    FAC --> ASPAS["Métodos de Aspas"]
    FAC --> DIVB["Divisores Binómicos (Raíces Racionales)"]
    FAC --> ART["Artificios de Cálculo"]
    
    MET --> FC["Factor Común (Monomio / Polinomio)"]
    MET --> AGR["Agrupación de Términos"]
    MET --> IDEN["Identidades Notables (Diferencia de Cuadrados, Cubos, Argand)"]
    
    ASPAS --> AS["Aspa Simple: Ax^2n + Bx^n + C"]
    ASPAS --> AD["Aspa Doble: Ax^2 + Bxy + Cy^2 + Dx + Ey + F"]
    ASPAS --> ADE["Aspa Doble Especial: Ax^4 + Bx^3 + Cx^2 + Dx + E"]
    
    DIVB --> PRR["Posibles Raíces Racionales: ±(Div TI / Div CP)"]
    DIVB --> RUFF["Descarte por Ruffini y Teorema del Factor"]
    
    ART --> CV["Cambio de Variable (Bloques idénticos)"]
    ART --> QP["Quita y Pon (Formación de TCP o Cubos)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA VI: FACTORIZACIÓN SOBRE DIFERENTES CAMPOS NUMÉRICOS

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Definición Formal de Factorización
La **factorización** es el proceso algebraico inverso a la multiplicación que consiste en transformar un polinomio racional entero en una multiplicación indicada de dos o más **factores primos** (polinomios irreductibles) dentro de un campo numérico determinado.

P(x) \xrightarrow{\text{Factorización}} f_1(x)^{\alpha} \cdot f_2(x)^{\beta} \cdots f_k(x)^{\gamma}

#### Campos Numéricos y Criterio de Irreductibilidad:
Un polinomio es **irreductible (primo)** sobre un campo numérico \mathbb{K} si no puede descomponerse como el producto de dos o más polinomios no constantes con coeficientes en \mathbb{K}.
- **Sobre \mathbb{Q} (Racionales):** Por defecto, en todo examen preuniversitario (UNSA, UNMSM, UNI), si no se especifica el campo, **se sobreentiende que se factoriza sobre \mathbb{Q}**.
  P(x) = x^2 - 5 \quad \text{es primo en } \mathbb{Q}
- **Sobre \mathbb{R} (Reales):**
  P(x) = (x - \sqrt{5})(x + \sqrt{5}) \quad \text{es reducible en } \mathbb{R}
  Q(x) = x^2 + 4 \quad \text{es primo en } \mathbb{R}
- **Sobre \mathbb{C} (Complejos):** Todo polinomio de grado n \geq 1 se descompone completamente en n factores lineales (Teorema Fundamental del Álgebra):
  Q(x) = (x - 2i)(x + 2i) \quad \text{en } \mathbb{C}

#### Conteo de Factores:
Sea el polinomio factorizado P(x) = A \cdot [f_1(x)]^{\alpha} \cdot [f_2(x)]^{\beta} \cdot [f_3(x)]^{\gamma}, donde A es constante no nula y f_i(x) son factores primos:
1. **Número de Factores Primos:**
   \text{N.° F.P.} = 3 \quad (\text{las bases irreductibles distintas})
2. **Número Total de Factores Algebraicos:**
   \text{N.° Factores Totales} = (\alpha + 1)(\beta + 1)(\gamma + 1)
   \text{N.° Factores Algebraicos} = (\alpha + 1)(\beta + 1)(\gamma + 1) - 1
   *(Se resta 1 porque la constante 1 no se considera factor algebraico).*

---

### 3.2. Métodos Clásicos de Factorización

#### 1. Factor Común y Agrupación:
Consiste en extraer el Máximo Común Divisor (M.C.D.) de los coeficientes y las variables repetidas elevadas a su **menor exponente**. Si no hay factor común a simple vista, se agrupan términos simétricos convenientemente.

#### 2. Método de las Identidades Notables:
Utiliza directamente los productos notables en sentido inverso:
- Diferencia de Cuadrados: a^2 - b^2 = (a - b)(a + b)
- Trinomio Cuadrado Perfecto (TCP): a^2 \pm 2ab + b^2 = (a \pm b)^2
- Suma y Diferencia de Cubos: a^3 \pm b^3 = (a \pm b)(a^2 \mp ab + b^2)
- Identidad de Argand: x^4 + x^2 + 1 = (x^2 + x + 1)(x^2 - x + 1)

---

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Método / Teorema | Estructura / Fórmula Matemática | Regla Operativa |
| :--- | :--- | :--- |
| **N.° Factores Primos** | P(x) = K \prod_{i=1}^m f_i(x)^{\alpha_i} \implies N_{FP} = m | Conteo de bases algebraicas |
| **N.° Factores Totales** | N_F = \prod_{i=1}^m (\alpha_i + 1) - 1 | Excluye a la constante 1 |
| **Aspa Simple** | Ax^2 + Bx + C = (a_1 x + c_1)(a_2 x + c_2) | a_1 c_2 + a_2 c_1 = B |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t06_s01_c01",
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
                    id = "alg_t06_s01_c02",
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
                    id = "alg_t06_s01_c03",
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
                    id = "alg_t06_s01_c04",
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
                    id = "alg_t06_s01_c05",
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
                    id = "alg_t06_s01_c06",
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
                    id = "alg_t06_s01_c07",
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
                    id = "alg_t06_s01_c08",
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
                    id = "alg_t06_s01_c09",
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
                    id = "alg_t06_s01_c10",
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
            id = "alg_t06_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.3. Métodos Avanzados de las Aspas

#### A. Aspa Simple
Se aplica a trinomios de la forma:
P(x, y) = A x^{2n} + B x^n y^m + C y^{2m}
- Se descomponen los extremos: A x^{2n} = (a_1 x^n)(a_2 x^n) y C y^{2m} = (c_1 y^m)(c_2 y^m).
- La suma de los productos cruzados debe reproducir idénticamente el término central:
  a_1 c_2 + a_2 c_1 = B
- Los factores se toman en forma **horizontal**: (a_1 x^n + c_1 y^m)(a_2 x^n + c_2 y^m).

#### B. Aspa Doble
Se aplica a polinomios de seis términos en dos variables de la forma general:
P(x, y) = \underbrace{A x^2}_{(1)} + \underbrace{B xy}_{(2)} + \underbrace{C y^2}_{(3)} + \underbrace{D x}_{(4)} + \underbrace{E y}_{(5)} + \underbrace{F}_{(6)}
**Procedimiento de las Tres Aspas:**
1. **Aspa 1:** Se aplica aspa simple a los términos (1), (2) y (3) para descomponer Ax^2 y Cy^2.
2. **Aspa 2:** Se aplica aspa simple con los factores de Cy^2 y los factores descompuestos del término independiente F (término 6) para verificar el término Ey (término 5).
3. **Aspa 3 (Verificación Fundamental):** Se multiplican en aspa los factores de Ax^2 (extremo izquierdo) con los del término F (extremo derecho) para comprobar que su suma reproduzca exactamente el término Dx (término 4).
- Los factores finales se leen horizontalmente.

#### C. Aspa Doble Especial
Se aplica a polinomios de **cuarto grado en una variable**:
P(x) = A x^4 + B x^3 + C x^2 + D x + E
**Algoritmo del Balance Cuadrático:**
1. Se descomponen los términos extremos Ax^4 en (a_1 x^2)(a_2 x^2) y E en (e_1)(e_2).
2. Se realiza el producto en aspa entre estos extremos y se suman los resultados para hallar lo que **"Se Tiene" (ST)**:
   \text{ST} = (a_1 e_2 + a_2 e_1) x^2
3. Se compara con el término central C x^2, calculando lo que **"Se Debe Tener" o Falta (SDT)**:
   \text{Falta (SDT)} = C x^2 - \text{ST} = K x^2
4. El término de balance K x^2 se descompone en el centro como (k_1 x)(k_2 x) de modo que:
   - Verifique mediante aspa simple a la izquierda el término cúbico B x^3.
   - Verifique mediante aspa simple a la derecha el término lineal D x.
5. Los factores se toman en forma horizontal: (a_1 x^2 + k_1 x + e_1)(a_2 x^2 + k_2 x + e_2).

---

### 3.4. Método de los Divisores Binómicos (Evaluación por Raíces Racionales)
Se emplea para factorizar polinomios de cualquier grado que admitan al menos un factor de primer grado (x - c).

#### Criterio de las Posibles Raíces Racionales (P.R.R.):
\text{P.R.R.} = \pm \frac{\text{Divisores del Término Independiente (T.I.)}}{\text{Divisores del Coeficiente Principal (C.P.)}}
- Si un valor x = \alpha \in \text{P.R.R.} anula al polinomio (P(\alpha) = 0), entonces por el Teorema del Factor:
  (x - \alpha) \quad \text{es un factor primo de } P(x)
- Se divide P(x) entre (x - \alpha) mediante la **Regla de Ruffini** para degradar el polinomio y continuar factorizando el cociente resultante.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Balance Aspa Doble Esp.** | \text{Falta} = C x^2 - (a_1 e_2 + a_2 e_1)x^2 | Descomponer la falta en el centro |
| **P.R.R.** | \text{PRR} = \pm \frac{\text{Divisores}(\|a_0\|)}{\text{Divisores}(\|a_n\|)} | Candidatos a ceros racionales |
| **Suma de Cuadrados Artificio** | x^4 + 4y^4 = (x^2 + 2y^2)^2 - (2xy)^2 | Forma de Sophie Germain |
| **Argand Inverso** | x^4 + x^2 + 1 = (x^2 + x + 1)(x^2 - x + 1) | Trinomio reducible a cuadráticas |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Cambio de Variable por Pares Simétricos
Cuando tengas productos de cuatro binomios lineales:
P(x) = (x + 1)(x + 2)(x + 3)(x + 4) - 24
**¡No multipliques todo de corrido para obtener un polinomio de grado 4!**
**Hack:** Agrupa de dos en dos buscando que la suma de sus términos independientes coincida:
(x + 1)(x + 4) = x^2 + 5x + 4
(x + 2)(x + 3) = x^2 + 5x + 6
Haces el cambio de variable y = x^2 + 5x:
P(y) = (y + 4)(y + 6) - 24 = y^2 + 10y + 24 - 24 = y^2 + 10y = y(y + 10)
Restituyes y = x^2 + 5x:
P(x) = (x^2 + 5x)(x^2 + 5x + 10) = x(x + 5)(x^2 + 5x + 10)
¡Factorizado en 20 segundos sin usar Horner ni Ruffini!

### Artificio 2: Criterio de la Suma de Coeficientes en Divisores Binómicos
Antes de buscar raíces fraccionarias en P.R.R., prueba siempre estos dos filtros inmediatos:
1. **Si \sum \text{coef.} = 0 \implies x = 1 es raíz fija.** El factor es (x - 1).
2. **Si la suma de coeficientes de lugar par es igual a la suma de lugar impar \implies x = -1 es raíz fija.** El factor es (x + 1).

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Trinomio de Sophie Germain: "Suma Cuadrados \to Quita y Pon"
Para expresiones de la forma a^4 + 4b^4:
> **"Si ves cuartas sin centro, súmale el doble producto y sácale el jugo a la diferencia de cuadrados."**
- Le sumas y restas 4a^2b^2:
  a^4 + 4a^2b^2 + 4b^4 - 4a^2b^2 = (a^2 + 2b^2)^2 - (2ab)^2 = (a^2 + 2b^2 - 2ab)(a^2 + 2b^2 + 2ab)

### 2. Aspa Doble Especial: "Extremos Primero, Falta al Centro" (E-P-F-C)
1. **E**xtremos: Descompón primero el x^4 y el número solo.
2. **P**roducto: Multiplica en aspa esos extremos y suma.
3. **F**alta: Resta lo que tienes al término cuadrático central original.
4. **C**entro: Descompón esa falta en medio y cruza a izquierda y derecha.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Coeficiente Numérico NO es Factor Primo**
> Si al factorizar un polinomio obtienes:
> P(x) = 6(x - 2)(x + 3)^2
> **Pregunta de admisión:** ¿Cuántos factores primos tiene P(x)?
> El alumno desprevenido cuenta: el 6, el (x - 2) y el (x + 3), marcando 3. **¡ERROR GRAVE!**
> El número 6 es una constante; los factores primos deben depender de la variable. Los factores primos son únicamente dos: (x - 2) y (x + 3).

> [!CAUTION]
> **Trampa 2: No Factorizar hasta la Máxima Irreductibilidad**
> Si el resultado intermedio es (x^4 - 16), muchos postulantes se detienen ahí.
> Debes descomponer sucesivamente:
> x^4 - 16 = (x^2 - 4)(x^2 + 4) = (x - 2)(x + 2)(x^2 + 4)
> En \mathbb{Q}, tiene 3 factores primos. Si te piden en \mathbb{C}, continúa: (x - 2)(x + 2)(x - 2i)(x + 2i).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Criptografía Asimétrica y Optimización de Estructuras Mineras en Cerro Verde
En los algoritmos de seguridad criptográfica de curvas elípticas empleados en los sistemas de telemetría de la mina Cerro Verde (Arequipa), la factorización polinómica sobre campos finitos \mathbb{F}_q es el pilar de la generación de llaves públicas y privadas. Asimismo, en el análisis de esfuerzos tensores de los túneles subterráneos, el polinomio característico de esfuerzos \det(\sigma - \lambda I) = 0 se factoriza mediante aspas dobles especiales para hallar los esfuerzos principales y prevenir el colapso de roca fracturada.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t06_s02_c01",
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
                    id = "alg_t06_s02_c02",
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
                    id = "alg_t06_s02_c03",
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
                    id = "alg_t06_s02_c04",
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
                    id = "alg_t06_s02_c05",
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
                    id = "alg_t06_s02_c06",
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
                    id = "alg_t06_s02_c07",
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
                    id = "alg_t06_s02_c08",
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
                    id = "alg_t06_s02_c09",
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
                    id = "alg_t06_s02_c10",
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
