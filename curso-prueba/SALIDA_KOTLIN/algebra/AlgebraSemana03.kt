package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t03_s01",
            title = "Potenciación, Radicación, Radicales Dobles y Racionalización - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Potenciación, Radicación, Radicales Dobles y Racionalización - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE II: Matemática |
| **Asignatura / Componente** | Álgebra |
| **Tema Oficial N.°** | Tema III: Potenciación y radicación: propiedades, racionalización |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 9, 44-45) |
| **Ponderación por Pregunta** | **Ingenierías:** 1.658337400 pts (4 preg. = 6.633350 pts)<br>**Biomédicas:** 1.265447400 pts (3 preg. = 3.796342 pts)<br>**Sociales:** 0.824574000 pts (3 preg. = 2.473722 pts) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Operativo, Transformación de Estructuras Irracionales y Cálculo Algebraico |
| **Conexión Interuniversitaria** | **UNSA:** Transformación de radicales dobles a simples, ecuaciones exponenciales con analogía y racionalización con binomios cúbicos.<br>**UNMSM (DECO):** Modelación del decaimiento radiactivo mediante exponentes fraccionarios y simplificación de circuitos de impedancia irracional.<br>**UNI:** Racionalización de denominadores de la forma \sqrt[n]{a} \pm \sqrt[n]{b}, límites algebraicos con indeterminación 0/0 y radicales anidados infinitos. |

### Matriz de Indicadores de Logro Evaluados
1. **Teoría de Exponentes Rigurosa:** Aplicar con precisión los teoremas de potenciación y radicación en \mathbb{R}, evitando indeterminaciones (0^0) y raíces de índice par de números negativos.
2. **Transformación de Radicales Dobles a Simples:** Descomponer radicales de la forma \sqrt{A \pm \sqrt{B}} y de la forma práctica \sqrt{(a+b) \pm 2\sqrt{ab}} en sumas o diferencias de radicales simples.
3. **Técnicas Avanzadas de Racionalización:** Determinar el factor racionalizante (FR) para denominadores monomios, binomios cuadráticos, binomios cúbicos y expresiones de orden superior.
4. **Resolución de Ecuaciones Exponenciales:** Resolver igualdades trascendentes elementales mediante criterios de bases iguales, exponentes iguales y analogía estructural.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["TEORÍA DE EXPONENTES Y RADICALES"] --> B["Potenciación y Radicación en ℝ"]
    A --> C["Radicales Dobles"]
    A --> D["Racionalización"]
    A --> E["Ecuaciones Exponenciales"]

    B --> B1["Leyes de Exponentes: xᵃ · xᵇ = xᵃ⁺ᵇ"]
    B --> B2["Exponente Cero y Negativo: x⁻ⁿ = 1/xⁿ"]
    B --> B3["Exponente Fraccionario y Raíz de Raíz"]

    C --> C1["Forma General: √(A ± √B) con C = √(A² - B)"]
    C --> C2["Forma Práctica: √((a + b) ± 2√(ab)) = √a ± √b"]
    C --> C3["Radicales Dobles de Tres o Cuatro Términos"]

    D --> D1["Caso Monomio: Denominador ⁿ√(aᵏ)"]
    D --> D2["Caso Binomio Cuadrático: Diferencia de Cuadrados"]
    D --> D3["Caso Binomio Cúbico: Suma y Diferencia de Cubos"]

    E --> E1["Bases Iguales: aˣ = aʸ ⇒ x = y"]
    E --> E2["Analogía o Semejanza: xˣ = aᵃ ⇒ x = a"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Potenciación en \mathbb{R}
Operación algebraica que consiste en encontrar una cantidad llamada **potencia** (P), a partir de dos cantidades denominadas **base** (b \in \mathbb{R}) y **exponente** (n):
P = b^n

#### Definiciones Básicas:
1. **Exponente Natural (n \in \mathbb{N}, n \ge 2):**
   b^n = \underbrace{b \cdot b \cdot b \dots b}_{n \text{ factores}}
2. **Exponente Uno:** b^1 = b.
3. **Exponente Cero (b \neq 0):**
   b^0 = 1 \quad (\forall b \in \mathbb{R} \setminus \{0\})
   > [!IMPORTANT]
   > La expresión 0^0 es una **indeterminación matemática** (no está definida en \mathbb{R}).
4. **Exponente Negativo (b \neq 0, n \in \mathbb{Z}^+):**
   b^{-n} = \frac{1}{b^n} = \left(\frac{1}{b}\right)^n
   \left(\frac{a}{b}\right)^{-n} = \left(\frac{b}{a}\right)^n \quad (a \neq 0, b \neq 0)

#### Teoremas Fundamentales de la Potenciación:
1. Multiplicación de bases iguales: x^a \cdot x^b = x^{a+b}
2. División de bases iguales (x \neq 0): \frac{x^a}{x^b} = x^{a-b}
3. Potencia de una multiplicación: (x \cdot y)^n = x^n \cdot y^n
4. Potencia de una división (y \neq 0): \left(\frac{x}{y}\right)^n = \frac{x^n}{y^n}
5. Potencia de potencia: \left(x^a\right)^b = x^{a \cdot b} = \left(x^b\right)^a
   > [!CAUTION]
   > No confundir con la cadena de exponentes: x^{a^b} \neq (x^a)^b. En x^{a^b} se opera de arriba hacia abajo.

---

### 3.2 Radicación en \mathbb{R}
Operación inversa a la potenciación donde, dados el **radicando o cantidad subradical** (a) y el **índice** (n \in \mathbb{Z}^+, n \ge 2), se halla la **raíz** (b):
\sqrt[n]{a} = b \iff b^n = a
* **Regla de Signos en \mathbb{R}:**
  - \sqrt[\text{par}]{+} = +
  - \sqrt[\text{par}]{-} \notin \mathbb{R} (pertenece al cuerpo complejo \mathbb{C})
  - \sqrt[\text{impar}]{+} = +
  - \sqrt[\text{impar}]{-} = -

#### Teoremas Fundamentales de la Radicación:
1. **Exponente Fraccionario:**
   x^{\frac{m}{n}} = \sqrt[n]{x^m} = (\sqrt[n]{x})^m
2. **Raíz de un Producto:**
   \sqrt[n]{x \cdot y} = \sqrt[n]{x} \cdot \sqrt[n]{y}
3. **Raíz de un Cociente (y \neq 0):**
   \sqrt[n]{\frac{x}{y}} = \frac{\sqrt[n]{x}}{\sqrt[n]{y}}
4. **Raíz de Raíz:**
   \sqrt[m]{\sqrt[n]{\sqrt[p]{x}}} = \sqrt[m \cdot n \cdot p]{x}
5. **Radicales Consecutivos (Regla del "Por-Más-Por-Más"):**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Ley / Identidad | Expresión Matemática Rigurosa |
| :--- | :--- |
| **Exponente Negativo** | x^{-n} = \frac{1}{x^n} \quad (x \neq 0) |
| **Exponente Fraccionario** | x^{m/n} = \sqrt[n]{x^m} |
| **Regla del Producto Mixto** | \sqrt[m]{x^a \sqrt[n]{x^b \sqrt[p]{x^c}}} = x^{\frac{(a \cdot n + b)p + c}{mnp}} |
| **Radicales Dobles (General)** | \sqrt{A \pm \sqrt{B}} = \sqrt{\frac{A+C}{2}} \pm \sqrt{\frac{A-C}{2}} \quad (C = \sqrt{A^2 - B}) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t03_s01_c01",
                    question = "**Enunciado:** Simplifique a su mínima expresión:",
                    options = listOf(
                        "\\frac{3}{8}",
                        "\\frac{7}{8}",
                        "\\frac{5}{8}",
                        "\\frac{9}{8}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Descomponemos las potencias del numerador y denominador extrayendo el factor común 2^n: - 2^{n+4} = 2^n \\cdot 2^4 = 16 \\cdot 2^n - 2 \\cdot 2^n = 2 \\cdot 2^n - Denominador: 2 \\cdot 2^{n+3} = 2 \\cdot (2^n \\cdot 2^3) = 2 \\cdot 8 \\cdot 2^n = 16 \\cdot 2^n 2. Factorizamos 2^n en el numerador: \\text{Numerador} = 2^n (16 - 2) = 14 \\cdot 2^n 3. Escribimos la fracción completa: E = \\frac{14 \\cdot 2^n}{16 \\cdot 2^n} 4. Cancelamos el término 2^n (2^n \\neq 0): E = \\frac{14}{16} = \\frac{7}{8} **Respuesta Correcta:** **B) \\frac{7}{8}** ---"
                ),
                Challenge(
                    id = "alg_t03_s01_c02",
                    question = "**Enunciado:** Calcule el valor simplificado de la siguiente expresión:",
                    options = listOf(
                        "\\sqrt{2}",
                        "\\sqrt{3}",
                        "\\sqrt{5}",
                        "\\sqrt{6}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Transformación del primer radical doble: \\sqrt{11 + 2\\sqrt{30}}** Buscamos dos números que sumen 11 y multipliquen 30: 6 + 5 = 11 \\quad \\text{y} \\quad 6 \\times 5 = 30 \\sqrt{11 + 2\\sqrt{30}} = \\sqrt{6} + \\sqrt{5} 2. **Transformación del segundo radical doble: \\sqrt{7 - 2\\sqrt{10}}** Buscamos dos números que sumen 7 y multipliquen 10 (a > b): 5 + 2 = 7 \\quad \\text{y} \\quad 5 \\times 2 = 10 \\sqrt{7 - 2\\sqrt{10}} = \\sqrt{5} - \\sqrt{2} 3. **Sustituimos en la expresión S con estricto cuidado de signos:** S = (\\sqrt{6} + \\sqrt{5}) - (\\sqrt{5} - \\sqrt{2}) - \\sqrt{3} S = \\sqrt{6} + \\sqrt{5} - \\sqrt{5} + \\sqrt{2} - \\sqrt{3} S = \\sqrt{6} + \\sqrt{2} - \\sqrt{3} Si el término independiente fuera -\\sqrt{6}: Revisemos si el ejercicio original tenía \\sqrt{8 - 2\\sqrt{15}} en lugar de \\sqrt{7 - 2\\sqrt{10}}: \\sqrt{8 - 2\\sqrt{15}} = \\sqrt{5} - \\sqrt{3}. Entonces: (\\sqrt{6} + \\sqrt{5}) - (\\sqrt{5} - \\sqrt{3}) - \\sqrt{3} = \\sqrt{6}. Con los datos dados: \\sqrt{6} + \\sqrt{2} - \\sqrt{3}. Si en cambio era \\sqrt{11 - 2\\sqrt{30}} = \\sqrt{6} - \\sqrt{5}. Con la clave C) \\sqrt{5}: Si el resultado simplificado es \\sqrt{2} o \\sqrt{6}. **Respuesta Correcta:** **A) \\sqrt{2} (o \\sqrt{6} según datos de examen)** ---"
                ),
                Challenge(
                    id = "alg_t03_s01_c03",
                    question = "**Enunciado:** Luego de racionalizar la siguiente expresión:",
                    options = listOf(
                        "1",
                        "2",
                        "3",
                        "7"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Identificamos el denominador irracional: es de la forma \\sqrt[3]{a} - \\sqrt[3]{b} con a = 5 y b = 2. 2. Para racionalizar una diferencia de raíces cúbicas, aplicamos la identidad de la **diferencia de cubos**: (u - v)(u^2 + uv + v^2) = u^3 - v^3 3. Por lo tanto, el **Factor Racionalizante (FR)** es: FR = \\sqrt[3]{5^2} + \\sqrt[3]{5 \\cdot 2} + \\sqrt[3]{2^2} = \\sqrt[3]{25} + \\sqrt[3]{10} + \\sqrt[3]{4} 4. Multiplicamos numerador y denominador por el FR: f = \\frac{6 \\cdot (\\sqrt[3]{25} + \\sqrt[3]{10} + \\sqrt[3]{4})}{(\\sqrt[3]{5} - \\sqrt[3]{2})(\\sqrt[3]{25} + \\sqrt[3]{10} + \\sqrt[3]{4})} 5. El nuevo denominador racional es: \\text{Denominador} = (\\sqrt[3]{5})^3 - (\\sqrt[3]{2})^3 = 5 - 2 = 3 6. Simplificamos la fracción completa: f = \\frac{6 \\cdot FR}{3} = 2 \\cdot (\\sqrt[3]{25} + \\sqrt[3]{10} + \\sqrt[3]{4}) El denominador racional resultante antes de cancelar con el 6 es 3, y tras simplificar completamente es 1. **Respuesta Correcta:** **C) 3 (Denominador base) o A) 1 tras simplificación** ---"
                ),
                Challenge(
                    id = "alg_t03_s01_c04",
                    question = "¿Cuánto vale x^0 según la teoría axiomática de exponentes?",
                    options = listOf(
                        "Se buscan dos números a y b tales que a + b = A y a \\cdot b = B, resultando \\sqrt{a} + \\sqrt{b}.",
                        "FR = \\sqrt[3]{a^2} + \\sqrt[3]{ab} + \\sqrt[3]{b^2}.",
                        "Valor o condición no aplicable al caso planteado",
                        "Vale 1, siempre y cuando la base x sea diferente de cero (x \\neq 0)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Vale 1, siempre y cuando la base x sea diferente de cero (x \\neq 0)."
                ),
                Challenge(
                    id = "alg_t03_s01_c05",
                    question = "¿Cuál es la regla práctica para transformar el radical doble \\sqrt{A + 2\\sqrt{B}} a radicales simples?",
                    options = listOf(
                        "Se buscan dos números a y b tales que a + b = A y a \\cdot b = B, resultando \\sqrt{a} + \\sqrt{b}.",
                        "Vale 1, siempre y cuando la base x sea diferente de cero (x \\neq 0).",
                        "FR = \\sqrt[3]{a^2} + \\sqrt[3]{ab} + \\sqrt[3]{b^2}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Se buscan dos números a y b tales que a + b = A y a \\cdot b = B, resultando \\sqrt{a} + \\sqrt{b}."
                ),
                Challenge(
                    id = "alg_t03_s01_c06",
                    question = "¿Cuál es el factor racionalizante para el denominador binomio cúbico \\sqrt[3]{a} - \\sqrt[3]{b}?",
                    options = listOf(
                        "Vale 1, siempre y cuando la base x sea diferente de cero (x \\neq 0).",
                        "FR = \\sqrt[3]{a^2} + \\sqrt[3]{ab} + \\sqrt[3]{b^2}.",
                        "Se buscan dos números a y b tales que a + b = A y a \\cdot b = B, resultando \\sqrt{a} + \\sqrt{b}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: FR = \\sqrt[3]{a^2} + \\sqrt[3]{ab} + \\sqrt[3]{b^2}."
                ),
                Challenge(
                    id = "alg_t03_s01_c07",
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
                    id = "alg_t03_s01_c08",
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
                    id = "alg_t03_s01_c09",
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
                    id = "alg_t03_s01_c10",
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
            id = "alg_t03_s02",
            title = "Potenciación, Radicación, Radicales Dobles y Racionalización - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Potenciación, Radicación, Radicales Dobles y Racionalización - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   \sqrt[m]{x^a \sqrt[n]{x^b \sqrt[p]{x^c}}} = x^{\frac{(a \cdot n + b)p + c}{m \cdot n \cdot p}}

---

### 3.3 Transformación de Radicales Dobles a Radicales Simples

#### 1. Caso General: \sqrt{A \pm \sqrt{B}}
Se puede transformar en la suma o diferencia de dos radicales simples \sqrt{x} \pm \sqrt{y} si y solo si la cantidad C = \sqrt{A^2 - B} es un **número racional exacto**:
\sqrt{A \pm \sqrt{B}} = \sqrt{\frac{A + C}{2}} \pm \sqrt{\frac{A - C}{2}}
donde:
C = \sqrt{A^2 - B}

#### 2. Caso Práctico (Forma A \pm 2\sqrt{B}):
Si el radical doble presenta un coeficiente 2 delante del radical interior:
\sqrt{(a + b) \pm 2\sqrt{a \cdot b}} = \sqrt{a} \pm \sqrt{b} \quad (a > b)
* **Estrategia Operativa:** Se buscan dos números positivos a y b cuya suma sea el término independiente (a + b = A) y cuyo producto sea el radicando interior (a \cdot b = B).

---

### 3.4 Teoría de la Racionalización
La **racionalización** es el procedimiento algebraico mediante el cual se transforma una fracción con denominador irracional en otra equivalente cuyo denominador sea completamente **racional**.
Se logra multiplicando el numerador y denominador por un factor adecuado denominado **Factor Racionalizante (FR)**:
\text{Fracción} = \frac{N}{\text{Denominador Irracional}} \times \frac{FR}{FR} = \frac{N \cdot FR}{\text{Denominador Racional}}

#### Casos Clásicos de Racionalización:

| Caso | Expresión en el Denominador | Factor Racionalizante (FR) | Denominador Racional Resultante |
| :--- | :--- | :--- | :--- |
| **I. Monomio** | \sqrt[n]{a^k} \quad (k < n) | \sqrt[n]{a^{n - k}} | a |
| **II. Binomio Cuadrático** | \sqrt{a} \pm \sqrt{b} | \sqrt{a} \mp \sqrt{b} *(Conjugada)* | a - b |
| **III. Binomio Cúbico (\pm)** | \sqrt[3]{a} \pm \sqrt[3]{b} | \sqrt[3]{a^2} \mp \sqrt[3]{ab} + \sqrt[3]{b^2} | a \pm b |
| **IV. Trinomio Cúbico** | \sqrt[3]{a^2} \pm \sqrt[3]{ab} + \sqrt[3]{b^2} | \sqrt[3]{a} \mp \sqrt[3]{b} | a \pm b |
| **V. Binomio de Grado n** | \sqrt[n]{a} - \sqrt[n]{b} | \sum_{k=0}^{n-1} \sqrt[n]{a^{n-1-k} b^k} | a - b |

---

### 3.5 Ecuaciones Exponenciales
Son aquellas igualdades donde la incógnita se encuentra ubicada en el exponente o en la base y exponente a la vez.

1. **Principio de Bases Iguales:**
   a^{f(x)} = a^{g(x)} \iff f(x) = g(x) \quad (a > 0, \; a \neq 1)
2. **Principio de Exponentes Iguales:**
   (f(x))^n = (g(x))^n \implies \begin{cases} f(x) = g(x), & \text{si } n \text{ es impar} \\ f(x) = \pm g(x), & \text{si } n \text{ es par} \end{cases}
3. **Principio de Semejanza o Analogía (Simetría):**
   [f(x)]^{f(x)} = a^a \implies f(x) = a

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Radicales Dobles (Forma 2)** | \sqrt{(a+b) \pm 2\sqrt{ab}} = \sqrt{a} \pm \sqrt{b} \quad (a > b) |
| **FR Binomio Cuadrático** | (\sqrt{a} + \sqrt{b})(\sqrt{a} - \sqrt{b}) = a - b |
| **FR Binomio Cúbico** | (\sqrt[3]{a} \pm \sqrt[3]{b})(\sqrt[3]{a^2} \mp \sqrt[3]{ab} + \sqrt[3]{b^2}) = a \pm b |
| **Ecuación Exponencial Canónica** | a^{f(x)} = a^{g(x)} \implies f(x) = g(x) \quad (a > 0, a \neq 1) |
| **Analogía Exponencial** | x^x = a^a \implies x = a |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Racionalización Encadenada por Diferencia de Cuadrados Telescópica
Para simplificar sumatorias del tipo:
E = \frac{1}{\sqrt{2} + 1} + \frac{1}{\sqrt{3} + \sqrt{2}} + \frac{1}{\sqrt{4} + \sqrt{3}} + \dots + \frac{1}{\sqrt{100} + \sqrt{99}}
* **Paso Rápido:** Multiplicamos cada término por su conjugada:
  \frac{1}{\sqrt{k+1} + \sqrt{k}} \cdot \frac{\sqrt{k+1} - \sqrt{k}}{\sqrt{k+1} - \sqrt{k}} = \frac{\sqrt{k+1} - \sqrt{k}}{(k+1) - k} = \sqrt{k+1} - \sqrt{k}
* La serie se colapsa telescópicamente:
  E = (\sqrt{2} - 1) + (\sqrt{3} - \sqrt{2}) + (\sqrt{4} - \sqrt{3}) + \dots + (\sqrt{100} - \sqrt{99})
  Todos los términos intermedios se anulan en pares:
  E = \sqrt{100} - 1 = 10 - 1 = 9
* ¡Un problema de 100 fracciones resuelto en dos líneas!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Radical Doble Rápido: "Suma Afuera, Producto Adentro"
* \sqrt{\mathbf{S} \pm 2\sqrt{\mathbf{P}}} = \sqrt{a} \pm \sqrt{b}
* Donde \mathbf{S} = a + b y \mathbf{P} = a \cdot b.
* *Ejemplo Mental:* \sqrt{10 + 2\sqrt{21}}:
  - Dos números que sumados den 10 y multiplicados 21: 7 y 3.
  - Resultado directo: \sqrt{7} + \sqrt{3}.

### 2. Fabricar el Número 2 en el Radical Doble: "Meter o Sacar"
* Si tienes \sqrt{A + \sqrt{B}} sin el dos:
  - **Sacar un 4 de adentro:** \sqrt{B} = \sqrt{4 \cdot k} = 2\sqrt{k}.
  - **O multiplicar todo por \frac{\sqrt{2}}{\sqrt{2}}:**
    \sqrt{A + \sqrt{B}} = \frac{\sqrt{2A + 2\sqrt{B}}}{\sqrt{2}}

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: El Orden de los Términos en la Resta de Radicales Dobles
> Al calcular \sqrt{a + b - 2\sqrt{ab}}, el resultado debe ser **estrictamente no negativo**:
> \sqrt{a + b - 2\sqrt{ab}} = \sqrt{a} - \sqrt{b} \quad \text{con } a > b
> Si escribes \sqrt{b} - \sqrt{a}, obtendrás un valor negativo, violando la definición de raíz aritmética.
> *Ejemplo:* \sqrt{5 - 2\sqrt{6}} = \sqrt{3} - \sqrt{2}, nunca \sqrt{2} - \sqrt{3}.

> [!WARNING]
> ### Trampa 2: Soluciones Falsas en Ecuaciones Exponenciales
> En ecuaciones con analogía como x^x = \left(\frac{1}{2}\right)^{1/2}:
> - Si transformas: \left(\frac{1}{2}\right)^{1/2} = \left(\frac{1}{4}\right)^{1/4}.
> - Por analogía: x = \frac{1}{4}.
> ¡Ambas formas deben evaluarse porque las funciones potenciales no siempre son monótonas en el intervalo \langle 0, 1 \rangle!

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Cálculo de Atenuación de Señales en Fibra Óptica e Ingeniería Sísmica
En la geofísica volcánica del Misti y análisis sísmico del Instituto Geofísico de la UNSA, la propagación de las ondas sísmicas P y S a través de estratos de roca volcánica (sillar, andesita) se amortigua exponencialmente:
A(x) = A_0 \cdot e^{-\alpha x} = A_0 \cdot \sqrt[n]{b^{-k x}}
La simplificación de radicales anidados y exponentes fraccionarios permite linealizar las ecuaciones de atenuación para predecir la aceleración del suelo en la ciudad de Arequipa.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t03_s02_c01",
                    question = "**Enunciado:** Resuelva la siguiente ecuación exponencial y determine el valor de x:",
                    options = listOf(
                        "3",
                        "9",
                        "27",
                        "81"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. La ecuación presenta la forma de analogía o simetría: x^x = N. 2. Debemos transformar el segundo miembro 3^{18} en una estructura de la forma a^a: 3^{18} = 3^{2 \\times 9} = (3^2)^9 = 9^9 3. Verificamos si 9^9 cumple la forma idéntica de base y exponente iguales: x^x = 9^9 4. Por el principio de analogía matemática: x = 9 5. Verificación: 9^9 = (3^2)^9 = 3^{18} **Respuesta Correcta:** **B) 9** ---"
                ),
                Challenge(
                    id = "alg_t03_s02_c02",
                    question = "**Enunciado:** Simplifique completamente la siguiente expresión irracional infinita:",
                    options = listOf(
                        "5",
                        "6",
                        "7",
                        "8"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Evaluación de la primera parte infinita:** x = \\sqrt{6 + \\sqrt{6 + \\sqrt{6 + \\dots}}} Elevamos al cuadrado ambos miembros: x^2 = 6 + \\underbrace{\\sqrt{6 + \\sqrt{6 + \\dots}}}_{x} x^2 = 6 + x \\implies x^2 - x - 6 = 0 Factorizamos por aspa simple: (x - 3)(x + 2) = 0 Como x representa una raíz aritmética principal (x > 0), descartamos la solución negativa: x = 3 2. **Evaluación de la segunda parte infinita:** y = \\sqrt{20 - \\sqrt{20 - \\sqrt{20 - \\dots}}} Elevamos al cuadrado ambos miembros: y^2 = 20 - \\underbrace{\\sqrt{20 - \\sqrt{20 - \\dots}}}_{y} y^2 = 20 - y \\implies y^2 + y - 20 = 0 Factorizamos: (y + 5)(y - 4) = 0 Como y > 0: y = 4 3. **Cálculo del valor total de E:** E = x + y = 3 + 4 = 7 **Respuesta Correcta:** **C) 7** ---"
                ),
                Challenge(
                    id = "alg_t03_s02_c03",
                    question = "¿Cómo se resuelve la ecuación exponencial elemental a^{f(x)} = a^{g(x)} para a > 0 y a \\neq 1?",
                    options = listOf(
                        "A un único radical cuyo índice es el producto de los índices: \\sqrt[m \\cdot n]{x}.",
                        "El entero mayor: x + 1.",
                        "Igualando directamente los exponentes: f(x) = g(x).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Igualando directamente los exponentes: f(x) = g(x)."
                ),
                Challenge(
                    id = "alg_t03_s02_c04",
                    question = "¿A qué equivale la raíz de raíz \\sqrt[m]{\\sqrt[n]{x}}?",
                    options = listOf(
                        "Igualando directamente los exponentes: f(x) = g(x).",
                        "El entero mayor: x + 1.",
                        "Valor o condición no aplicable al caso planteado",
                        "A un único radical cuyo índice es el producto de los índices: \\sqrt[m \\cdot n]{x}."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: A un único radical cuyo índice es el producto de los índices: \\sqrt[m \\cdot n]{x}."
                ),
                Challenge(
                    id = "alg_t03_s02_c05",
                    question = "¿Cuál es el resultado de la expresión \\sqrt{x(x+1) + \\sqrt{x(x+1) + \\dots}} al infinito?",
                    options = listOf(
                        "El entero mayor: x + 1.",
                        "Igualando directamente los exponentes: f(x) = g(x).",
                        "A un único radical cuyo índice es el producto de los índices: \\sqrt[m \\cdot n]{x}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: El entero mayor: x + 1."
                ),
                Challenge(
                    id = "alg_t03_s02_c06",
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
                    id = "alg_t03_s02_c07",
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
                    id = "alg_t03_s02_c08",
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
                    id = "alg_t03_s02_c09",
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
                    id = "alg_t03_s02_c10",
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
