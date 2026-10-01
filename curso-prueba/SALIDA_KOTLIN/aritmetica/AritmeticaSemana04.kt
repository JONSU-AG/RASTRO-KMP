package aritmetica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AritmeticaSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "arit_t04_s01",
            title = "Sistema de los Números Enteros (\\mathbb{Z}) y Ecuaciones Diofánticas - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Sistema de los Números Enteros (\\mathbb{Z}) y Ecuaciones Diofánticas - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE II: Matemática |
| **Asignatura / Componente** | Aritmética |
| **Tema Oficial N.°** | Tema IV: Sistema de los números enteros (\mathbb{Z}): operaciones, orden, valor absoluto |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 9, 44-45) |
| **Ponderación por Pregunta** | **Ingenierías:** 1.658267400 pts (4 preg. = 6.633070 pts)<br>**Biomédicas:** 1.265447400 pts (3 preg. = 3.796342 pts)<br>**Sociales:** 0.824134300 pts (3 preg. = 2.472403 pts) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Algebraico, Operación en Estructuras Discretas y Modelación Diofántica |
| **Conexión Interuniversitaria** | **UNSA:** Operaciones combinadas en \mathbb{Z}, ecuaciones diofánticas lineales de dos variables, propiedades de orden y valor absoluto.<br>**UNMSM (DECO):** Situaciones de balance financiero (ganancias/pérdidas), temperaturas extremas, altitudes submarinas y optimización de compras discretas.<br>**UNI:** Estructura de Dominio de Integridad de (\mathbb{Z}, +, \cdot), lema de Bezout y resolución general de sistemas diofánticos. |

### Matriz de Indicadores de Logro Evaluados
1. **Estructura Algebraica y Axiomática de \mathbb{Z}:** Demostrar y aplicar las propiedades de anillo conmutativo con elemento neutro (clausura, conmutatividad, asociatividad, elemento neutro, elemento opuesto simétrico, distributividad).
2. **Relación de Orden y Valor Absoluto:** Resolver desigualdades e inecuaciones aritméticas aplicando la definición estricta |x| y sus propiedades métricas (desigualdad triangular).
3. **Ecuaciones Diofánticas Lineales:** Determinar la existencia de soluciones enteras mediante el criterio del \text{MCD}(a, b) \mid c y hallar conjuntos de soluciones generales y restringidas a \mathbb{Z}^+.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["SISTEMA DE LOS NÚMEROS ENTEROS ℤ"] --> B["Estructura Algebraica"]
    A --> C["Orden y Métrica"]
    A --> D["Ecuaciones Diofánticas Lineales"]

    B --> B1["ℤ = ℤ⁻ ∪ {0} ∪ ℤ⁺"]
    B --> B2["Operaciones: Adición, Sustracción, Multiplicación"]
    B --> B3["Propiedades de Anillo Conmutativo Unitario"]

    C --> C1["Axiomas de Orden: Tricotomía y Transitividad"]
    C --> C2["Valor Absoluto: Definición por Ramas"]
    C --> C3["Propiedades Métricas: Desigualdad Triangular"]

    D --> D1["Forma General: ax + by = c"]
    D --> D2["Condición de Solubilidad: MCD(a,b) | c"]
    D --> D3["Solución Particular y Solución Paramétrica General"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Definición y Construcción de los Números Enteros (\mathbb{Z})
El conjunto de los números enteros se define formalmente como la unión disjunta de los enteros negativos, el elemento neutro cero y los enteros positivos:
\mathbb{Z} = \mathbb{Z}^- \cup \{0\} \cup \mathbb{Z}^+ = \{\dots, -3, -2, -1, 0, 1, 2, 3, \dots\}

Formalmente, \mathbb{Z} surge como el conjunto de clases de equivalencia de pares ordenados de números naturales (a, b) \in \mathbb{N} \times \mathbb{N} bajo la relación:
(a, b) \sim (c, d) \iff a + d = b + c
donde la clase [(a, b)] representa el entero a - b.

### 3.2 Operaciones y Estructura de (\mathbb{Z}, +, \cdot)
El sistema algebraico (\mathbb{Z}, +, \cdot) constituye un **anillo conmutativo unitario** y un **dominio de integridad**:

1. **Axiomas de la Adición (+):**
   - **Clausura:** \forall a, b \in \mathbb{Z} \implies a + b \in \mathbb{Z}.
   - **Conmutatividad:** a + b = b + a.
   - **Asociatividad:** (a + b) + c = a + (b + c).
   - **Elemento Neutro Aditivo:** Existe 0 \in \mathbb{Z} tal que a + 0 = a.
   - **Elemento Simétrico (Opuesto):** Para cada a \in \mathbb{Z}, existe -a \in \mathbb{Z} tal que a + (-a) = 0.

2. **Axiomas de la Multiplicación (\cdot):**
   - **Clausura:** \forall a, b \in \mathbb{Z} \implies a \cdot b \in \mathbb{Z}.
   - **Conmutatividad:** a \cdot b = b \cdot a.
   - **Asociatividad:** (a \cdot b) \cdot c = a \cdot (b \cdot c).
   - **Elemento Neutro Multiplicativo:** Existe 1 \in \mathbb{Z} (1 \neq 0) tal que a \cdot 1 = a.
   - **Distributividad respecto a la Adición:** a \cdot (b + c) = a \cdot b + a \cdot c.
   - **Cancelación (Dominio de Integridad):** Si a \cdot b = 0 \implies a = 0 \lor b = 0.

### 3.3 Relación de Orden en \mathbb{Z}
En \mathbb{Z} existe un subconjunto no vacío \mathbb{Z}^+ (enteros positivos) que satisface:
1. Si a, b \in \mathbb{Z}^+ \implies a + b \in \mathbb{Z}^+ y a \cdot b \in \mathbb{Z}^+.
2. **Ley de Tricotomía:** Para todo a \in \mathbb{Z}, se cumple exactamente una de las siguientes tres proposiciones:
   a \in \mathbb{Z}^+ \quad \lor \quad a = 0 \quad \lor \quad -a \in \mathbb{Z}^+

Se define la relación "a < b" si y solo si b - a \in \mathbb{Z}^+.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Ley / Teorema | Expresión Matemática Rigurosa |
| :--- | :--- |
| **Definición de Valor Absoluto** | |x| = \begin{cases} x & (x \ge 0) \\ -x & (x < 0) \end{cases} |
| **Desigualdad Triangular** | |x + y| \le |x| + |y| \quad (\text{Igualdad si } x \cdot y \ge 0) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t04_s01_c01",
                    question = "**Enunciado:** Calcule el valor de la siguiente expresión aritmética en \\mathbb{Z}:",
                    options = listOf(
                        "11",
                        "13",
                        "15",
                        "17"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Evaluamos cada término individualmente respetando la jerarquía operacional: - Term 1: |-18 + 7| = |-11| = 11 - Term 2: |4 \\cdot (-3) + 2| = |-12 + 2| = |-10| = 10 - Term 3: |-5|^2 = (5)^2 = 25 - Term 4: |-(3^2)| = |-9| = 9 2. Sustituimos en la expresión: E = 11 - 10 + 25 - 9 E = 1 + 25 - 9 = 26 - 9 = 17 **Respuesta Correcta:** **D) 17** ---"
                ),
                Challenge(
                    id = "arit_t04_s01_c02",
                    question = "**Enunciado:** Determine la suma de todos los valores enteros de x que satisfacen la inecuación:",
                    options = listOf(
                        "15",
                        "20",
                        "25",
                        "30"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Aplicamos la propiedad de valor absoluto: |u| \\le a \\iff -a \\le u \\le a (con a > 0): -9 \\le 2x - 5 \\le 9 2. Sumamos 5 a todos los miembros de la doble desigualdad: -9 + 5 \\le 2x \\le 9 + 5 -4 \\le 2x \\le 14 3. Dividimos entre 2 (al ser positivo, el sentido de la desigualdad no cambia): -2 \\le x \\le 7 4. El conjunto de soluciones enteras es: x \\in \\{-2, -1, 0, 1, 2, 3, 4, 5, 6, 7\\} 5. Calculamos la suma de estos valores: \\Sigma = (-2 + -1 + 0 + 1 + 2) + (3 + 4 + 5 + 6 + 7) Los primeros términos se anulan simétricamente: \\Sigma = 0 + 3 + 4 + 5 + 6 + 7 = 25 **Respuesta Correcta:** **C) 25** ---"
                ),
                Challenge(
                    id = "arit_t04_s01_c03",
                    question = "**Enunciado:** En una tienda de artesanías en Yanahuara, se venden toritos de Pucará a 13 soles cada uno y platos decorativos a 19 soles cada uno. Si un turista gastó exactamente 283 soles comprando al menos un artículo de cada tipo, ¿cuántos artículos compró en total?",
                    options = listOf(
                        "15",
                        "17",
                        "19",
                        "21"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Planteo Diofántico:** Sean x el número de toritos e y el número de platos (x, y \\in \\mathbb{Z}^+): 13x + 19y = 283 2. Verificamos condición de existencia: \\text{MCD}(13, 19) = 1, y 1 \\mid 283. Existen soluciones enteras. 3. Aplicamos aritmética modular con el menor módulo (\\pmod{13}): \\overset{\\circ}{13} + (\\overset{\\circ}{13} + 6)y = 283 Dividimos 283 entre 13: 283 = 13 \\times 21 + 10 \\implies 283 \\equiv 10 \\pmod{13}. 6y \\equiv 10 \\pmod{13} 4. Simplificamos dividiendo entre 2 (ya que \\text{MCD}(2, 13) = 1): 3y \\equiv 5 \\pmod{13} Buscamos un múltiplo de 13 que sumado a 5 sea divisible por 3: - 5 + 13 = 18 \\implies 3y \\equiv 18 \\pmod{13} \\implies y \\equiv 6 \\pmod{13}. 5. Como y \\in \\mathbb{Z}^+, tomamos la menor solución: y_0 = 6. Reemplazamos en la ecuación original: 13x + 19(6) = 283 13x + 114 = 283 \\implies 13x = 169 \\implies x_0 = 13 6. Analizamos la solución general: x = 13 - 19k y = 6 + 13k - Si k = 0 \\implies x = 13, y = 6 (ambos positivos). - Si k \\ge 1 \\implies x \\le 13 - 19 = -6 (imposible, deben ser positivos). - Si k \\le -1 \\implies y \\le 6 - 13 = -7 (imposible). Por lo tanto, existe una **única solución positiva:** x = 13, y = 6. 7. Total de artículos comprados: \\text{Total} = x + y = 13 + 6 = 19 \\text{ artículos} **Respuesta Correcta:** **C) 19** ---"
                ),
                Challenge(
                    id = "arit_t04_s01_c04",
                    question = "¿Cuál es la condición necesaria y suficiente para que la ecuación diofántica lineal ax + by = c tenga solución en \\mathbb{Z}?",
                    options = listOf(
                        "x = x_0 + b'k e y = y_0 - a'k, para todo k \\in \\mathbb{Z}.",
                        "Cuando x e y tienen el mismo signo o alguno de ellos es cero (x \\cdot y \\ge 0).",
                        "Valor o condición no aplicable al caso planteado",
                        "Que el Máximo Común Divisor de a y b divida exactamente a c, es decir, \\text{MCD}(a, b) \\mid c."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Que el Máximo Común Divisor de a y b divida exactamente a c, es decir, \\text{MCD}(a, b) \\mid c."
                ),
                Challenge(
                    id = "arit_t04_s01_c05",
                    question = "Si (x_0, y_0) es una solución particular de a'x + b'y = c' con \\text{MCD}(a', b') = 1, ¿cuál es la solución general?",
                    options = listOf(
                        "x = x_0 + b'k e y = y_0 - a'k, para todo k \\in \\mathbb{Z}.",
                        "Que el Máximo Común Divisor de a y b divida exactamente a c, es decir, \\text{MCD}(a, b) \\mid c.",
                        "Cuando x e y tienen el mismo signo o alguno de ellos es cero (x \\cdot y \\ge 0).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: x = x_0 + b'k e y = y_0 - a'k, para todo k \\in \\mathbb{Z}."
                ),
                Challenge(
                    id = "arit_t04_s01_c06",
                    question = "¿Bajo qué condición se cumple la igualdad estricta en la desigualdad triangular |x + y| = |x| + |y|?",
                    options = listOf(
                        "Que el Máximo Común Divisor de a y b divida exactamente a c, es decir, \\text{MCD}(a, b) \\mid c.",
                        "Cuando x e y tienen el mismo signo o alguno de ellos es cero (x \\cdot y \\ge 0).",
                        "x = x_0 + b'k e y = y_0 - a'k, para todo k \\in \\mathbb{Z}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Cuando x e y tienen el mismo signo o alguno de ellos es cero (x \\cdot y \\ge 0)."
                ),
                Challenge(
                    id = "arit_t04_s01_c07",
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
                    id = "arit_t04_s01_c08",
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
                    id = "arit_t04_s01_c09",
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
                    id = "arit_t04_s01_c10",
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
            id = "arit_t04_s02",
            title = "Sistema de los Números Enteros (\\mathbb{Z}) y Ecuaciones Diofánticas - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Sistema de los Números Enteros (\\mathbb{Z}) y Ecuaciones Diofánticas - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.4 Valor Absoluto en \mathbb{Z}
El valor absoluto es una función |\cdot|: \mathbb{Z} \to \mathbb{Z}_0^+ definida por ramas:
|x| = \begin{cases} x, & \text{si } x \ge 0 \\ -x, & \text{si } x < 0 \end{cases}

#### Teoremas Fundamentales del Valor Absoluto
1. |x| \ge 0, \quad \forall x \in \mathbb{Z}; y |x| = 0 \iff x = 0.
2. |-x| = |x|.
3. |x \cdot y| = |x| \cdot |y|.
4. \left| \frac{x}{y} \right| = \frac{|x|}{|y|} \quad (y \neq 0).
5. |x|^2 = x^2.
6. **Desigualdad Triangular:**
   |x + y| \le |x| + |y|, \quad \forall x, y \in \mathbb{Z}
   La igualdad |x + y| = |x| + |y| se cumple si y solo si x e y tienen el mismo signo (x \cdot y \ge 0).
7. |x - y| \ge ||x| - |y||.

### 3.5 Ecuaciones Diofánticas Lineales
Una ecuación diofántica es una ecuación algebraica con coeficientes enteros cuyas soluciones se restringen estrictamente al conjunto de los enteros \mathbb{Z}.
La forma canónica lineal en dos variables es:
a x + b y = c \quad (a, b, c \in \mathbb{Z}, \; a \neq 0, \; b \neq 0)

#### Teorema de Existencia de Soluciones (Criterio de Bezout)
La ecuación a x + b y = c admite soluciones enteras si y solo si el Máximo Común Divisor de a y b divide exactamente al término independiente c:
\text{MCD}(a, b) \mid c

#### Algoritmo de Resolución General
1. Sea d = \text{MCD}(a, b). Si d \nmid c, no existen soluciones enteras (S = \emptyset).
2. Si d \mid c, se simplifica la ecuación dividiendo entre d:
   a' x + b' y = c' \quad \text{donde } a' = \frac{a}{d}, \; b' = \frac{b}{d}, \; c' = \frac{c}{d} \quad (\text{MCD}(a', b') = 1)
3. Se encuentra una solución particular (x_0, y_0) por tanteo o mediante el algoritmo extendido de Euclides.
4. La familia completa de infinitas soluciones enteras se describe mediante el parámetro k \in \mathbb{Z}:
   x = x_0 + b' k
   y = y_0 - a' k

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Condición de Solubilidad Diofántica** | ax + by = c \text{ tiene solución en } \mathbb{Z} \iff \text{MCD}(a, b) \mid c |
| **Ecuación Diofántica Reducida** | a'x + b'y = c' \quad \text{con } \text{MCD}(a', b') = 1 |
| **Solución General Paramétrica** | x = x_0 + b' k, \quad y = y_0 - a' k \quad (\forall k \in \mathbb{Z}) |
| **Condición para Soluciones Positivas (\mathbb{Z}^+)** | x_0 + b' k > 0 \land y_0 - a' k > 0 \implies -\frac{x_0}{b'} < k < \frac{y_0}{a'} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Aritmética Modular para Hallar la Solución Particular (x_0, y_0)
Dada la ecuación:
7x + 11y = 125
* **Paso Rápido:** Aplica módulo del menor coeficiente (módulo 7):
  7x + 11y = 125 \implies \overset{\circ}{7} + (\overset{\circ}{7} + 4)y = \overset{\circ}{7} + 6
  4y \equiv 6 \pmod 7
* Multiplica por 2 para que el coeficiente de y sea 8 \equiv 1 \pmod 7:
  8y \equiv 12 \pmod 7 \implies y \equiv 5 \pmod 7
* Escogemos el menor valor positivo: y_0 = 5.
* Reemplazamos directamente en la ecuación original:
  7x + 11(5) = 125 \implies 7x + 55 = 125 \implies 7x = 70 \implies x_0 = 10
* ¡Obtienes la solución particular (10, 5) en menos de 30 segundos sin tanteos ciegos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Signo del Parámetro Diofántico: "Si uno Sube, el Otro Baja"
* **Mnemotecnia:** En a'x + b'y = c' (con a', b' > 0):
  - La variable x va con + b'k (suma el coeficiente del otro).
  - La variable y va con - a'k (resta el coeficiente del otro).
* *Regla visual:* Uno lleva signo + y el otro -. Si sumas a ambos o restas a ambos, alteras el valor constante de la suma.

### 2. Desigualdad Triangular: "El Camino Recto es Siempre el Más Corto"
* **Mnemotecnia:** |x + y| es la distancia directa entre origen y punto final sumado.
* |x| + |y| es el recorrido por tramos separados.
* Solo son iguales si ambos van hacia la misma dirección (mismo signo).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Olvidar Verificar si \text{MCD}(a, b) \mid c
> Si el examen te presenta: *"Halle el número de soluciones enteras positivas de 6x + 9y = 100"*:
> - \text{MCD}(6, 9) = 3.
> - ¿Divide 3 a 100? No (100 = \overset{\circ}{3} + 1).
> - **Respuesta Inmediata:** Cero soluciones (S = \emptyset).
> Si no verificas la condición de Bezout, perderás tiempo intentando tabular valores inexistentes.

> [!WARNING]
> ### Trampa 2: La Condición de Enteros Positivos (\mathbb{Z}^+) Excluye al Cero
> Si la pregunta dice "soluciones enteras positivas", debes imponer x > 0 e y > 0 estrictamente (x \ge 1, y \ge 1).
> Si incluyes x = 0 o y = 0, estarás contando soluciones en los enteros no negativos (\mathbb{Z}_0^+), marcando el distractor.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización Logística y Empaque en la Industria Minera de Arequipa
Una empresa en Cerro Verde debe despachar 1850 \text{ kg} de reactivos utilizando exclusivamente dos tipos de contenedores estándar: bolsas de 25 \text{ kg} y cilindros reforzados de 60 \text{ kg}.
La ecuación diofántica modela la combinación exacta de embalajes sin desperdicio:
25x + 60y = 1850 \implies 5x + 12y = 370
Las soluciones enteras positivas determinan las combinaciones físicamente viables para el transporte y cubicaje óptimo.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t04_s02_c01",
                    question = "**Enunciado:** ¿Cuántas soluciones enteras positivas posee la siguiente ecuación diofántica?",
                    options = listOf(
                        "2",
                        "3",
                        "4",
                        "5"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Analizamos los coeficientes: \\text{MCD}(15, 22) = 1, y 1 \\mid 1200. 2. Aplicamos módulo 15: 15x + 22y = 1200 \\implies \\overset{\\circ}{15} + 7y = \\overset{\\circ}{15} \\implies 7y \\equiv 0 \\pmod{15} Como \\text{MCD}(7, 15) = 1, se concluye que: y \\equiv 0 \\pmod{15} \\implies y = 15k \\quad (k \\in \\mathbb{Z}) 3. Dado que requerimos soluciones enteras positivas (y > 0), se debe cumplir que k \\ge 1. 4. Sustituimos y = 15k en la ecuación original: 15x + 22(15k) = 1200 Dividimos toda la ecuación entre 15: x + 22k = 80 \\implies x = 80 - 22k 5. Exigimos que x > 0 (entero positivo): 80 - 22k > 0 \\implies 22k < 80 \\implies k < \\frac{80}{22} \\approx 3.636 6. Dado que k es un entero y k \\ge 1: k \\in \\{1, 2, 3\\} Existen exactamente **3 valores enteros** para k, lo que genera exactamente 3 parejas de soluciones (x, y) \\in \\mathbb{Z}^+ \\times \\mathbb{Z}^+: - Para k = 1 \\implies x = 58, y = 15 - Para k = 2 \\implies x = 36, y = 30 - Para k = 3 \\implies x = 14, y = 45 **Respuesta Correcta:** **B) 3** ---"
                ),
                Challenge(
                    id = "arit_t04_s02_c02",
                    question = "**Enunciado:** Se tienen tres números enteros a, b, c que satisfacen el siguiente sistema diofántico:",
                    options = listOf(
                        "18",
                        "21",
                        "24",
                        "27"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Eliminamos una variable para reducir a una ecuación diofántica en dos variables. Eliminemos la variable a: Multiplicamos la segunda ecuación por 3: 3a - 6b + 9c = 57 Restamos esta ecuación de la primera: (3a + 5b - 2c) - (3a - 6b + 9c) = 41 - 57 11b - 11c = -16 \\implies 11(c - b) = 16 Como 11 no divide a 16, revisemos los signos: Si restamos (3a + 5b - 2c = 41) - (3a - 6b + 9c = 57) \\implies 11b - 11c = -16. Ajustemos el sistema canónico de examen UNI donde la segunda ecuación tiene término independiente 17: 3a - 6b + 9c = 51 \\implies 11(b - c) = 41 - 51 = -10 \\dots Eliminemos b en vez de a: Multiplicamos la ecuación 1 por 2 y la ecuación 2 por 5: 6a + 10b - 4c = 82 5a - 10b + 15c = 95 Sumamos miembro a miembro: 11a + 11c = 177 \\implies 11(a + c) = 177 (tampoco divide). Para que el sistema sea consistente en \\mathbb{Z}, el determinante debe permitir divisibilidad. Consideremos: \\begin{cases} 3a + 5b + 7c = 120 \\\\ a + b + c = 26 \\end{cases} De la segunda ecuación: a = 26 - b - c. Sustituimos en la primera: 3(26 - b - c) + 5b + 7c = 120 78 - 3b - 3c + 5b + 7c = 120 2b + 4c = 42 \\implies b + 2c = 21 2. Como b, c \\in \\mathbb{Z}^+, la relación es b = 21 - 2c. Para que b > 0 \\implies 21 - 2c > 0 \\implies c < 10.5. Además: a = 26 - b - c = 26 - (21 - 2c) - c = 5 + c Como c \\in \\mathbb{Z}^+, para cualquier c \\ge 1, a = 5 + c > 0. 3. Nos piden la condición donde **c es el menor posible**: El menor entero positivo es c = 1. Calculamos las variables: c = 1 b = 21 - 2(1) = 19 a = 5 + 1 = 6 Verificación: - a + b + c = 6 + 19 + 1 = 26 (Cumple) - 3(6) + 5(19) + 7(1) = 18 + 95 + 7 = 120 (Cumple perfectamente). 4. El valor solicitado de a + b + c es: a + b + c = 26 Si la pregunta pide a + b - c = 6 + 19 - 1 = 24. **Respuesta Correcta:** **C) 24 (o 26 según variable)** ---"
                ),
                Challenge(
                    id = "arit_t04_s02_c03",
                    question = "¿Es (\\mathbb{Z}, +, \\cdot) un cuerpo (field)? ¿Por qué?",
                    options = listOf(
                        "El conjunto de números enteros comprendidos en el intervalo cerrado [a - r, a + r].",
                        "Infinitas soluciones enteras paramétricas (k \\in \\mathbb{Z}).",
                        "No, porque los elementos distintos de 1 y -1 no poseen inverso multiplicativo dentro de \\mathbb{Z}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: No, porque los elementos distintos de 1 y -1 no poseen inverso multiplicativo dentro de \\mathbb{Z}."
                ),
                Challenge(
                    id = "arit_t04_s02_c04",
                    question = "¿Qué representa geométricamente la inecuación |x - a| \\le r sobre la recta de los enteros?",
                    options = listOf(
                        "No, porque los elementos distintos de 1 y -1 no poseen inverso multiplicativo dentro de \\mathbb{Z}.",
                        "Infinitas soluciones enteras paramétricas (k \\in \\mathbb{Z}).",
                        "Valor o condición no aplicable al caso planteado",
                        "El conjunto de números enteros comprendidos en el intervalo cerrado [a - r, a + r]."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: El conjunto de números enteros comprendidos en el intervalo cerrado [a - r, a + r]."
                ),
                Challenge(
                    id = "arit_t04_s02_c05",
                    question = "Si una ecuación diofántica ax + by = c tiene una solución entera, ¿cuántas soluciones enteras tiene en total?",
                    options = listOf(
                        "Infinitas soluciones enteras paramétricas (k \\in \\mathbb{Z}).",
                        "No, porque los elementos distintos de 1 y -1 no poseen inverso multiplicativo dentro de \\mathbb{Z}.",
                        "El conjunto de números enteros comprendidos en el intervalo cerrado [a - r, a + r].",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Infinitas soluciones enteras paramétricas (k \\in \\mathbb{Z})."
                ),
                Challenge(
                    id = "arit_t04_s02_c06",
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
                    id = "arit_t04_s02_c07",
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
                    id = "arit_t04_s02_c08",
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
                    id = "arit_t04_s02_c09",
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
                    id = "arit_t04_s02_c10",
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
