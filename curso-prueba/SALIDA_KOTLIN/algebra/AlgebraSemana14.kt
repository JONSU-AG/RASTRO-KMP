package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana14 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t14_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Funciones Trascendentes y Álgebra de Logaritmos |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Crítica / Alta (95%):** Es una de las preguntas fijas en el examen de Admisión UNSA y CEPREUNSA, tanto en cálculo analítico de logaritmos como en problemas DECO de pH, decibeles o desintegración radiactiva. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de escala de Richter, bacterias y capitalización compuesta), UNI (Inecuaciones logarítmicas con base variable). |
| **Competencia Cardinal** | Dominar los teoremas y propiedades del operador logarítmico, resolver ecuaciones e inecuaciones exponenciales y logarítmicas con restricción estricta de valores admisibles, y graficar funciones exponenciales y logarítmicas analizando su naturaleza inversa y sus asíntotas. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    FT["Funciones Trascendentes"] --> FEXP["Función Exponencial: f(x) = bˣ"]
    FT --> LOG["Teoría de Logaritmos"]
    FT --> FLOG["Función Logarítmica: g(x) = log_b(x)"]
    
    FEXP --> PROB["Base b > 1: Creciente  |  0 < b < 1: Decreciente"]
    FEXP --> ASINTH["Asíntota Horizontal y = 0  |  Dom = ℝ, Ran = ⟨0, +∞⟩"]
    
    LOG --> DEF["Definición: log_b N = x ⇔ bˣ = N"]
    LOG --> REST["Restricciones CVA: N > 0, b > 0, b ≠ 1"]
    LOG --> PROPS["Propiedades: Producto, Cociente, Sombrero, Cambio de Base"]
    LOG --> OPESP["Cologaritmo y Antilogaritmo"]
    
    FLOG --> ASINTV["Asíntota Vertical x = 0  |  Dom = ⟨0, +∞⟩, Ran = ℝ"]
    FLOG --> INVERSA["Relación de Inversas: f y g simétricas respecto a y = x"]
    
    LOG --> INEC["Inecuaciones Logarítmicas (Cuidado con base 0 < b < 1)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA XIV: FUNCIÓN EXPONENCIAL, TEORÍA DE LOGARITMOS Y FUNCIÓN LOGARÍTMICA

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Función Exponencial
Sea b una constante real tal que b > 0 y b \neq 1. La **función exponencial** con base b se define como:

f(x) = b^x, \quad x \in \mathbb{R}

#### Propiedades Analíticas:
1. **Dominio y Rango:**
   \text{Dom}(f) = \mathbb{R}, \qquad \text{Ran}(f) = \mathbb{R}^+ = \langle 0, \ +\infty\rangle
2. **Punto de Paso Obligatorio:** Toda curva exponencial corta al eje Y en el punto (0, 1), ya que b^0 = 1.
3. **Asíntota Horizontal:** La recta y = 0 (eje X) es su asíntota horizontal.
4. **Monotonía según la Base:**
   - **Si b > 1:** La función es **estrictamente creciente**:
     x_1 < x_2 \iff b^{x_1} < b^{x_2}
   - **Si 0 < b < 1:** La función es **estrictamente decreciente**:
     x_1 < x_2 \iff b^{x_1} > b^{x_2}
5. **Función Exponencial Natural:** Base e \approx 2.718281828\dots:
   f(x) = e^x

---

### 3.2. Definición Formal de Logaritmo
El **logaritmo** de un número real positivo N en una base real positiva y diferente de la unidad b, es el exponente x al cual se debe elevar la base b para reproducir dicho número N:

\mathbf{\log_b N = x \iff b^x = N}

#### Condiciones de Existencia (C.V.A. Obligatorio):
Para que \log_b N exista en \mathbb{R}, deben cumplirse simultáneamente:
1. **Argumento estrictamente positivo:** N > 0.
2. **Base estrictamente positiva:** b > 0.
3. **Base diferente de la unidad:** b \neq 1.

#### Identidades Fundamentales:
b^{\log_b N} = N, \qquad \log_b(b^x) = x
\log_b 1 = 0, \qquad \log_b b = 1

---

### 3.3. Propiedades Cardinales de los Logaritmos
Sean x, y \in \mathbb{R}^+, b > 0, b \neq 1:

1. **Logaritmo de un Producto:**
   \log_b(x \cdot y) = \log_b x + \log_b y
2. **Logaritmo de un Cociente:**
   \log_b\left(\frac{x}{y}\right) = \log_b x - \log_b y
3. **Regla del Sombrero (Exponente en el Argumento):**
   \log_b(x^n) = n \cdot \log_b x
4. **Exponente en la Base y en el Argumento:**
   \log_{b^m}(x^n) = \frac{n}{m} \cdot \log_b x

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Propiedad / Teorema | Fórmula Matemática | Restricción / Aplicación |
| :--- | :--- | :--- |
| **Definición Logaritmo** | \log_b N = x \iff b^x = N | N > 0, \ b > 0, \ b \neq 1 |
| **Identidad Fundamental** | b^{\log_b N} = N | Base idéntica se cancela |
| **Regla del Sombrero** | \log_{b^m}(x^n) = \frac{n}{m} \log_b x | Exponentes salen como fracción |
| **Cambio de Base** | \log_b a = \frac{\ln a}{\ln b} | Conversión a base natural e |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t14_s01_c01",
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
                    id = "alg_t14_s01_c02",
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
                    id = "alg_t14_s01_c03",
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
                    id = "alg_t14_s01_c04",
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
                    id = "alg_t14_s01_c05",
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
                    id = "alg_t14_s01_c06",
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
                    id = "alg_t14_s01_c07",
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
                    id = "alg_t14_s01_c08",
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
                    id = "alg_t14_s01_c09",
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
                    id = "alg_t14_s01_c10",
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
            id = "alg_t14_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
5. **Regla de la Cadena (Producto Cíclico):**
   \log_a b \cdot \log_b c \cdot \log_c d = \log_a d
6. **Inversión de Base y Argumento:**
   \log_b a = \frac{1}{\log_a b}
7. **Fórmula del Cambio de Base (hacia base c > 0, c \neq 1):**
   \log_b x = \frac{\log_c x}{\log_c b} = \frac{\ln x}{\ln b}
8. **Permutación de Extremos (Intercambio Base-Argumento en Exponentes):**
   x^{\log_b y} = y^{\log_b x}

---

### 3.4. Operadores Especiales: Cologaritmo y Antilogaritmo

#### 1. Cologaritmo (\text{colog}):
Es el logaritmo del inverso multiplicativo del argumento:
\text{colog}_b x = \log_b\left(\frac{1}{x}\right) = -\log_b x

#### 2. Antilogaritmo (\text{antilog}):
Es la función exponencial inversa:
\text{antilog}_b x = b^x

#### Propiedades Combinadas:
\log_b(\text{antilog}_b x) = x
\text{antilog}_b(\log_b x) = x, \quad (\text{para } x > 0)
\text{antilog}_b(\text{colog}_b x) = \frac{1}{x}

---

### 3.5. Función Logarítmica y su Gráfica
Es la función inversa de la función exponencial:
g(x) = \log_b x, \quad \text{con } b > 0, b \neq 1
- \text{Dom}(g) = \mathbb{R}^+ = \langle 0, \ +\infty\rangle
- \text{Ran}(g) = \mathbb{R}
- Corta al eje X en (1, 0).
- Posee una **asíntota vertical** en la recta x = 0 (eje Y).
- **Monotonía:**
  - Si b > 1: Estrictamente **creciente**.
  - Si 0 < b < 1: Estrictamente **decreciente**.

---

### 3.6. Inecuaciones Logarítmicas
Para resolver \log_b A \gtrless \log_b B:

> [!IMPORTANT]
> **Paso 0 Obligatorio:** Establecer el Universo de Existencia: A > 0 \land B > 0.

1. **Si la base es mayor que la unidad (b > 1):**
   La función es creciente y **se preserva el sentido de la desigualdad**:
   \log_b A < \log_b B \iff 0 < A < B
2. **Si la base está entre cero y uno (0 < b < 1):**
   La función es decreciente y **el sentido de la desigualdad se invierte obligatoriamente**:
   \log_b A < \log_b B \iff A > B > 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Permutación Exponencial** | a^{\log_b c} = c^{\log_b a} | Intercambio de extremos |
| **Cologaritmo** | \text{colog}_b x = -\log_b x | Inverso aditivo del logaritmo |
| **Antilogaritmo** | \text{antilog}_b x = b^x | Operador exponencial puro |
| **Inecuación (b > 1)** | \log_b A < \log_b B \iff 0 < A < B | Sentido se conserva |
| **Inecuación (0 < b < 1)** | \log_b A < \log_b B \iff A > B > 0 | Sentido se invierte |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Truco de la Base Decimal y Potencias de 2
Si en un examen te dan \log 2 \approx 0.30103 y te piden hallar \log 5:
**¡No intentes inventar aproximaciones!**
**Hack:** Usa la identidad del cociente con la base decimal 10:
\log 5 = \log\left(\frac{10}{2}\right) = \log 10 - \log 2 = 1 - 0.30103 = 0.69897
De igual modo: \log 20 = \log(2 \cdot 10) = 1 + \log 2 = 1.30103.

### Artificio 2: Permutación de Extremos para Bajar la Incógnita
Si tienes una ecuación con la variable en el exponente y la base:
x^{\log_3 5} + 5^{\log_3 x} = 50
**Hack:** Por la propiedad de permutación a^{\log_b c} = c^{\log_b a}, el término x^{\log_3 5} es exactamente igual a 5^{\log_3 x}.
Por tanto:
5^{\log_3 x} + 5^{\log_3 x} = 50 \implies 2 \cdot 5^{\log_3 x} = 50 \implies 5^{\log_3 x} = 25 = 5^2
Igualando exponentes:
\log_3 x = 2 \implies x = 3^2 = 9
¡Resuelto en 15 segundos sin usar logaritmos neperianos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Ley del Sombrero Fraccionario: "Arriba sale arriba, abajo sale abajo"
\log_{b^{\mathbf{m}}}(x^{\mathbf{n}}) = \frac{\mathbf{n}}{\mathbf{m}} \log_b x
- El exponente del argumento (n) está ARRIBA \to pasa al **numerador**.
- El exponente de la base (m) está ABAJO \to pasa al **denominador**.

### 2. Inecuación con Base Chiquita (0 < b < 1): "El Espejo Loco"
- Si la base es menor a 1 (fracción entre 0 y 1 como 1/2, 1/3, 0.5):
> **"Base enana le da la vuelta a la campana."**
- Si la inecuación decía <, ¡se da la vuelta a >! Pero jamás olvides que el menor de ellos debe ser estrictamente > 0.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso C.V.A. al Aplicar la Regla del Sombrero**
> Resuelve: 2\log x = \log(3x + 4).
> El estudiante pasa el 2 como exponente: \log(x^2) = \log(3x + 4) \implies x^2 - 3x - 4 = 0 \implies (x - 4)(x + 1) = 0.
> Da como respuesta: x = 4 y x = -1.
> **¡GRAVE ERROR!** Para x = -1, el término original 2\log(-1) **no existe en los reales**.
> El único valor válido es x = 4. Siempre restringe el dominio en la **ecuación original**, nunca en la modificada.

> [!CAUTION]
> **Trampa 2: La Base Variable en Inecuaciones**
> Si resuelves \log_x(x + 2) < 2:
> No puedes simplemente elevar x^2 manteniendo el signo. Como no conoces si x > 1 o 0 < x < 1, **debes abrir dos casos analíticos independientes**.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Geofísica y Medición Sísmica en el Cinturón de Fuego de Arequipa
En el monitoreo telúrico del Instituto Geofísico de la Universidad Nacional de San Agustín (UNSA), la magnitud M de los terremotos en la escala sismológica de Richter se define mediante una función logarítmica decimal:
M = \log\left(\frac{I}{I_0}\right)
donde I es la intensidad de la onda sísmica registrada y I_0 es la intensidad umbral de referencia. Como la escala es logarítmica, un incremento de solo 2 unidades de magnitud (por ejemplo, del sismo de Arequipa del 2001 con M = 8.4 comparado con un sismo moderado de M = 6.4) no significa un aumento del doble de violencia, sino que la energía sísmica liberada por la fractura de la placa de Nazca es:
10^{8.4 - 6.4} = 10^2 = 100 \text{ veces mayor en amplitud de onda (y más de 1000 veces mayor en energía pura)}.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t14_s02_c01",
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
                    id = "alg_t14_s02_c02",
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
                    id = "alg_t14_s02_c03",
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
                    id = "alg_t14_s02_c04",
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
                    id = "alg_t14_s02_c05",
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
                    id = "alg_t14_s02_c06",
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
                    id = "alg_t14_s02_c07",
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
                    id = "alg_t14_s02_c08",
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
                    id = "alg_t14_s02_c09",
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
                    id = "alg_t14_s02_c10",
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
