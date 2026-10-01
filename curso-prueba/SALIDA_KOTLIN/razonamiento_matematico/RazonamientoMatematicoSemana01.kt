package razonamiento_matematico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoMatematicoSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rm_t01_s01",
            title = "RAZONAMIENTO NUMÉRICO Y REGULARIDADES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "RAZONAMIENTO NUMÉRICO Y REGULARIDADES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Series alfanuméricas, matrices numéricas con figuras, distribuciones gráficas y sucesiones aritméticas/geométricas. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: problemas contextualizados en finanzas, crecimiento poblacional, secuencias de producción industrial. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Sucesiones de segundo orden (cuadráticas), sucesiones recurrentes tipo Fibonacci generalizado y sumatorias polinómicas. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Analizar e identificar patrones, regularidades y leyes de correspondencia numérica.
2. Inferir la regla de formación analítica en series numéricas lineales, cuadráticas, figurativas y mixtas.
3. Establecer relaciones operativas entre números para modelar situaciones problemáticas.
4. Aplicar propiedades básicas de la teoría de números (paridad, divisibilidad, primalidad) como herramienta de deducción rápida.
5. Emplear la estimación, acotación y aproximación de resultados como filtro de validación y descarte veloz de alternativas.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Lineal o de 1.er Orden (Razón constante)
                               ├─ Cuadrática o de 2.° Orden (Método de diferencias)
        ┌─ 1. Sucesiones ─────┼─ Geométrica (Cociente constante)
        │      Numéricas       ├─ Polinomial de Orden Superior
        │                      ├─ Especiales (Fibonacci, Lucas, Tribonacci, Números Primos)
        │                      └─ Mixtas / Alternadas
        │
RAZONAMIENTO                   ┌─ Distribuciones Numéricas Lineales
NUMÉRICO ───┼─ 2. Arreglos y ──────┼─ Matrices y Cuadros Numéricos (Fila vs. Columna)
        │      Distribuciones  └─ Distribuciones Gráficas y Figurativas (Homología operativa)
        │
        │                      ┌─ Sumatorias Notables (Gauss, pares, impares, cuadrados)
        └─ 3. Series y Sumas ──┼─ Series Aritméticas y Geométricas Infinitas (Convergentes)
                               └─ Estimación y Acotamiento Rápido de Resultados
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Concepto Formal de Sucesión Numérica
Una sucesión numérica es una **función matemática discreta** cuyo dominio es el conjunto de los números enteros positivos \mathbb{Z}^+ = \{1, 2, 3, \dots, n\} y cuyo codominio es el conjunto de los números reales \mathbb{R}:
f: \mathbb{Z}^+ \to \mathbb{R}, \quad f(n) = t_n
Donde t_n representa el **término enésimo** o término general de la sucesión.

---

### 3.2 Sucesión Aritmética de Primer Orden (Lineal o Progresión Aritmética)
Es aquella en la que la diferencia entre dos términos consecutivos cualesquiera es una constante denominada **razón aritmética** (r).

**Forma general:**
t_1, \quad t_2 = t_1 + r, \quad t_3 = t_1 + 2r, \quad \dots, \quad t_n = t_1 + (n - 1)r

* **Fórmula canónica del término enésimo:**
  t_n = r \cdot n + t_0
  Donde t_0 es el **término anterior al primero** (t_0 = t_1 - r).
* **Número de términos (n):**
  n = \frac{t_n - t_1}{r} + 1 = \frac{t_n - t_0}{r}

---

### 3.3 Sucesión de Segundo Orden (Sucesión Cuadrática)
Es aquella cuya razón se vuelve constante recién en el **segundo nivel de diferencias sucesivas**.

**Estructura:**
\begin{array}{ccccccccc}
t_0 & & t_1 & & t_2 & & t_3 & & t_4 \\
 & m_0 & & d_1 & & d_2 & & d_3 & \\
 & & 2a & & 2a & & 2a & &
\end{array}


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE SERIES Y SUMATORIAS

### 4.1 Sumatorias Fundamentales

| Nombre de la Serie | Expresión Matemática | Fórmula Cerrada |
| :--- | :--- | :---: |
| **Primeros n naturales** | \sum_{k=1}^n k = 1 + 2 + 3 + \dots + n | \frac{n(n + 1)}{2} |
| **Primeros n números pares** | \sum_{k=1}^n 2k = 2 + 4 + 6 + \dots + 2n | n(n + 1) |
| **Primeros n números impares** | \sum_{k=1}^n (2k - 1) = 1 + 3 + 5 + \dots + (2n - 1) | n^2 |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t01_s01_c01",
                    question = "Halle el término que continúa en la sucesión:",
                    options = listOf(
                        "37",
                        "39",
                        "41",
                        "38"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t01_s01_c02",
                    question = "Determine el valor de x en el siguiente arreglo:",
                    options = listOf(
                        "33",
                        "35",
                        "39",
                        "40"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t01_s01_c03",
                    question = "Un laboratorio farmacéutico en Cayma evalúa la proliferación de un cultivo celular de control. El primer día se registran 6 colonias, el segundo día 15, el tercer día 28, el cuarto día 45, y así sucesivamente. ¿Cuántas colonias se registrarán exactamente en el vigésimo (20.°) día?",
                    options = listOf(
                        "840",
                        "861",
                        "825",
                        "900"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t01_s01_c04",
                    question = "¿Cuál es la fórmula para la suma de los primeros n números impares consecutivos?",
                    options = listOf(
                        "Equivale exactamente a 2a, por lo que a = \\frac{\\text{segunda diferencia}}{2}.",
                        "S = \\frac{t_1}{1 - q}.",
                        "Valor o condición no aplicable al caso planteado",
                        "S_n = n^2, donde n es la cantidad de términos (obtenida igualando el último término a 2n - 1)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: S_n = n^2, donde n es la cantidad de términos (obtenida igualando el último término a 2n - 1)."
                ),
                Challenge(
                    id = "rm_t01_s01_c05",
                    question = "En una sucesión cuadrática t_n = an^2 + bn + c, ¿a qué equivale la segunda diferencia constante?",
                    options = listOf(
                        "Equivale exactamente a 2a, por lo que a = \\frac{\\text{segunda diferencia}}{2}.",
                        "S_n = n^2, donde n es la cantidad de términos (obtenida igualando el último término a 2n - 1).",
                        "S = \\frac{t_1}{1 - q}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Equivale exactamente a 2a, por lo que a = \\frac{\\text{segunda diferencia}}{2}."
                ),
                Challenge(
                    id = "rm_t01_s01_c06",
                    question = "¿A qué equivale la suma límite de una serie geométrica decreciente infinita (|q| < 1)?",
                    options = listOf(
                        "S_n = n^2, donde n es la cantidad de términos (obtenida igualando el último término a 2n - 1).",
                        "S = \\frac{t_1}{1 - q}.",
                        "Equivale exactamente a 2a, por lo que a = \\frac{\\text{segunda diferencia}}{2}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: S = \\frac{t_1}{1 - q}."
                ),
                Challenge(
                    id = "rm_t01_s01_c07",
                    question = "Dada la sucesión an+1 = sqrt(6 + an) con a1 = sqrt(6), ¿cuál es el valor del límite L?",
                    options = listOf(
                        "sqrt(6)",
                        "2",
                        "3",
                        "6"
                    ),
                    correctIndex = 2,
                    explanation = "Al resolver L = sqrt(6 + L) elevando al cuadrado se obtiene L^2 - L - 6 = 0, cuya solución positiva es L = 3."
                ),
                Challenge(
                    id = "rm_t01_s01_c08",
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
                    id = "rm_t01_s01_c09",
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
                    id = "rm_t01_s01_c10",
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
            id = "rm_t01_s02",
            title = "RAZONAMIENTO NUMÉRICO Y REGULARIDADES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "RAZONAMIENTO NUMÉRICO Y REGULARIDADES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
El término general es un polinomio cuadrático:
t_n = a n^2 + b n + c

#### 📐 Deducción del Método Práctico de las Diferencias (Cuzcano / Lumbreras):
Tomando las diferencias previas imaginarias a la posición 1 (fila cero):
1. **Coeficiente cuadrático (a):**
   2a = \text{segunda diferencia} \implies a = \frac{\text{segunda diferencia}}{2}
2. **Coeficiente lineal (b):**
   a + b = d_1 \quad \text{o equivalentemente} \quad m_0 = a + b \implies b = m_0 - a
3. **Término independiente (c):**
   c = t_0 \quad (\text{el término anterior al primero})

---

### 3.4 Sucesión Geométrica (Progresión Geométrica)
Aquella en la que el cociente entre cualquier término y su predecesor inmediato es una constante llamada **razón geométrica** (q).
t_1, \quad t_1 \cdot q, \quad t_1 \cdot q^2, \quad \dots, \quad t_n = t_1 \cdot q^{n-1}

---

### 3.5 Sucesiones Especiales de Alta Frecuencia en Exámenes

1. **Sucesión de Fibonacci:** Cada término a partir del tercero es la suma de los dos anteriores:
   1, 1, 2, 3, 5, 8, 13, 21, 34, 55, \dots \quad \implies \quad F_n = F_{n-1} + F_{n-2}, \quad F_1 = 1, F_2 = 1
2. **Sucesión de Lucas:**
   2, 1, 3, 4, 7, 11, 18, 29, 47, \dots \quad \implies \quad L_n = L_{n-1} + L_{n-2}, \quad L_1 = 2, L_2 = 1
3. **Sucesión de Números Primos (Trampa típica):**
   2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, \dots
   *(No tiene fórmula polinomial simple; se identifica por la propiedad de indivisibilidad).*
4. **Sucesión de Números Triangulares:**
   1, 3, 6, 10, 15, 21, 28, \dots \quad \implies \quad T_n = \frac{n(n+1)}{2}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Primeros n cuadrados** | \sum_{k=1}^n k^2 = 1^2 + 2^2 + 3^2 + \dots + n^2 | \frac{n(n + 1)(2n + 1)}{6} |
| **Primeros n cubos** | \sum_{k=1}^n k^3 = 1^3 + 2^3 + 3^3 + \dots + n^3 | \left[ \frac{n(n + 1)}{2} \right]^2 |
| **Productos consecutivos binarios** | \sum_{k=1}^n k(k + 1) = 1\cdot 2 + 2\cdot 3 + \dots + n(n + 1) | \frac{n(n + 1)(n + 2)}{3} |

### 4.2 Suma Límite de Serie Geométrica Decreciente e Infinita (Convergente)
Para una serie geométrica infinita con razón |q| < 1:
S = t_1 + t_1 q + t_1 q^2 + t_1 q^3 + \dots = \frac{t_1}{1 - q}

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del "Término Cero" (t_0)
Para hallar el término enésimo de una progresión aritmética sin usar la fórmula larga t_n = t_1 + (n-1)r:
1. Identifica la razón r.
2. Multiplica r por n \to (r \cdot n).
3. Retrocede un paso antes de t_1 restando la razón: t_0 = t_1 - r.
4. **Escribe directo:** t_n = r\cdot n + t_0.
*Ejemplo:* Para 7, 11, 15, 19, \dots (r = 4):  
El término anterior al 7 es 7 - 4 = +3.  
👉 **t_n = 4n + 3** (Sin hojas de cálculo ni despejes).

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: Para la Sucesión Cuadrática
> **"MIRE A CERO"** \to Regla **a, b, c**:
> * **2a** = abajo (la segunda diferencia).
> * **a + b** = al medio (la primera diferencia antes del primer término).
> * **c** = arriba (el término cero t_0).

### Mnemotecnia 2: Suma de Impares Consecutivos
> **"El Último se Iguala a 2n - 1 y se Eleva al Cuadrado"**  
> Si te piden: 1 + 3 + 5 + \dots + 39:
> 1. Haces 2n - 1 = 39 \implies 2n = 40 \implies n = 20.
> 2. Respuesta instantánea: S = n^2 = 20^2 = \mathbf{400}. (Tiempo de resolución: 4 segundos).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Confundir el Último Término (t_n) con el Número de Términos (n):**
   * En sumatorias de impares: 1 + 3 + 5 + \dots + 19.
   * **El error típico:** Elevar 19^2 = 361 (¡MAL!).
   * **Lo correcto:** El último término es 2n - 1 = 19 \implies n = 10 \implies 10^2 = 100.
2. ⚠️ **La trampa del número primo "2" y el número "1":**
   * El número **1 NO es primo**.
   * El número **2 es el ÚNICO primo par**. En sucesiones de primos, si ves 2, 3, 5, 7, 11, \dots muchos marcan 9 pensando en impares.
3. ⚠️ **Figuras rotadas en distribuciones gráficas:**
   * En la UNSA, si una distribución gráfica usa triángulos o círculos, la operación matemática siempre respeta la posición homóloga (arriba con arriba, bases con bases). No mezcles vértices en figuras distintas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización en Almacenes Logísticos (Enfoque San Marcos / UNSA)
Una empresa de distribución en el Parque Industrial de Arequipa apila sacos de grano en forma trapezoidal. La primera fila sobre el piso tiene 40 sacos, y cada fila superior tiene 2 sacos menos que la anterior. Si la fila superior tiene 12 sacos:
* Se modela como una Progresión Aritmética decreciente con r = -2, t_1 = 40, t_n = 12.
* Número de filas: n = \frac{12 - 40}{-2} + 1 = 15 \text{ filas}.
* Total de sacos almacenados: S = \left(\frac{40 + 12}{2}\right) \cdot 15 = 26 \cdot 15 = \mathbf{390 \text{ sacos}}.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t01_s02_c01",
                    question = "Calcule el valor de la siguiente suma infinita:",
                    options = listOf(
                        "1",
                        "\\frac{3}{2}",
                        "2",
                        "\\frac{5}{2}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t01_s02_c02",
                    question = "Se define la sucesión recurrente:",
                    options = listOf(
                        "\\sqrt{6}",
                        "2",
                        "3",
                        "6"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t01_s02_c03",
                    question = "¿Cuál es la suma de los n primeros números naturales?",
                    options = listOf(
                        "No, el 1 es una unidad simple; el primer número primo y único par es el 2.",
                        "Valor o condición no aplicable al caso planteado",
                        "S_n = \\frac{n(n + 1)}{2}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: S_n = \\frac{n(n + 1)}{2}."
                ),
                Challenge(
                    id = "rm_t01_s02_c04",
                    question = "¿El número 1 es clasificado como número primo?",
                    options = listOf(
                        "S_n = \\frac{n(n + 1)}{2}.",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "No, el 1 es una unidad simple; el primer número primo y único par es el 2."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: No, el 1 es una unidad simple; el primer número primo y único par es el 2."
                ),
                Challenge(
                    id = "rm_t01_s02_c05",
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
                    id = "rm_t01_s02_c06",
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
                    id = "rm_t01_s02_c07",
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
                    id = "rm_t01_s02_c08",
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
                    id = "rm_t01_s02_c09",
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
                    id = "rm_t01_s02_c10",
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
