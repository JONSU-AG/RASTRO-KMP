package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object RazMatematicoCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: RAZONAMIENTO NUMÉRICO Y REGULARIDADES (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "rm_t01_s01",
            subjectId = "raz_matematico",
            semana = 1,
            subtema = "1.1 Sucesiones Aritméticas Lineales y Progresiones Aritméticas (Término Enésimo y Suma)",
            title = "Sucesiones Aritméticas y Sumatorias Lineales",
            theory = LessonTheory(
                id = "th_rm_t01_s01",
                asignatura = "Raz. Matemático",
                semana = 1,
                titulo = "Progresiones Aritméticas de Primer Orden",
                resumen = "• Definición de Sucesión Aritmética Lineal:\n  - Es una secuencia donde la diferencia entre dos términos consecutivos es constante: r = t_{k+1} - t_k (razón aritmética).\n  - Forma general: t_1, t_2 = t_1 + r, t_3 = t_1 + 2r, ..., t_n = t_1 + (n - 1)r.\n\n• Regla Práctica del Término Enésimo (t_n):\n  - t_n = r · n + t_0, donde t_0 es el término 'anterior al primero' (t_0 = t_1 - r).\n  - Esta forma permite hallar t_n en 3 segundos sin memorizar paréntesis.\n\n• Número de Términos (n):\n  - n = (t_n - t_1) / r + 1, o alternativamente n = (t_n - t_0) / r.\n\n• Suma de los 'n' Términos (Serie Aritmética S_n):\n  - S_n = [(t_1 + t_n) / 2] · n (La semisuma de los extremos multiplicada por la cantidad de términos).\n\n• Sumatorias Notables Fundamentales:\n  - Primeros n números naturales: ∑ k = n(n + 1) / 2.\n  - Primeros n números pares: 2 + 4 + ... + 2n = n(n + 1).\n  - Primeros n números impares: 1 + 3 + ... + (2n - 1) = n².",
                conceptosClave = listOf(
                    "Razón aritmética r: Diferencia constante entre términos contiguos",
                    "Término previo t₀ = t₁ - r para cálculo instantáneo: tₙ = rn + t₀",
                    "Número de términos: n = (último - primero) / razón + 1",
                    "Suma de serie: Semisuma de extremos por número de términos"
                ),
                formulas = listOf(
                    "t_n = t_1 + (n - 1)r \\equiv r \\cdot n + t_0",
                    "n = \\frac{t_n - t_1}{r} + 1",
                    "S_n = \\left( \\frac{t_1 + t_n}{2} \\right) n",
                    "\\sum_{k=1}^n (2k - 1) = n^2"
                ),
                formulaName = "Fórmulas Fundamentales de la Progresión Aritmética",
                formulaLatex = "t_n = r \\cdot n + t_0 \\quad \\land \\quad S_n = \\frac{(t_1 + t_n) \\cdot n}{2}",
                formulaDescription = "Cálculo analítico del término general y la suma de una progresión aritmética.",
                admissionTip = "Para sumar impares consecutivos que empiezan en 1, iguala el último término a (2n - 1), despeja n y eleva al cuadrado (n²). ¡Sale en 5 segundos!",
                admissionExplanation = "• Ejemplo: 1 + 3 + 5 + ... + 39 -> 2n - 1 = 39 -> 2n = 40 -> n = 20. Suma = 20² = 400."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dada la progresión aritmética: 7, 11, 15, 19, ..., ¿cuál es el término de posición 35 y cuántos términos hay en total si el último término es 163?",
                    options = listOf(
                        "t₃₅ = 143; n = 40 términos",
                        "t₃₅ = 147; n = 39 términos",
                        "t₃₅ = 143; n = 39 términos",
                        "t₃₅ = 140; n = 40 términos",
                        "t₃₅ = 147; n = 41 términos"
                    ),
                    correctIndex = 0,
                    explanation = "1. La razón es r = 11 - 7 = 4.\n2. El término previo es t₀ = 7 - 4 = 3.\n3. Término enésimo: tₙ = 4n + 3.\n4. Para n = 35: t₃₅ = 4(35) + 3 = 140 + 3 = 143.\n5. Para el total con tₙ = 163: 4n + 3 = 163 -> 4n = 160 -> n = 40 términos.",
                    subject = "Raz. Matemático",
                    semana = 1
                ),
                Challenge(
                    id = "q_rm_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un estudiante de la UNSA ahorra diariamente en una alcancía: 3 soles el primer día, 7 soles el segundo, 11 soles el tercero, y así sucesivamente durante 25 días. ¿Cuánto dinero logró acumular en total al cabo de los 25 días?",
                    options = listOf(
                        "1250 soles",
                        "1275 soles",
                        "1300 soles",
                        "1225 soles",
                        "1350 soles"
                    ),
                    correctIndex = 1,
                    explanation = "Es una serie aritmética con t₁ = 3, r = 4 y n = 25.\nEl término t₂₅ = t₁ + (n - 1)r = 3 + 24(4) = 3 + 96 = 99 soles.\nLa suma total es S₂₅ = [(t₁ + t₂₅) / 2] · n = [(3 + 99) / 2] · 25 = (102 / 2) · 25 = 51 · 25 = 1275 soles.",
                    subject = "Raz. Matemático",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rm_t01_s02",
            subjectId = "raz_matematico",
            semana = 1,
            subtema = "1.2 Sucesiones Cuadráticas de Segundo Orden (Método de Diferencias Previas)",
            title = "Sucesiones Cuadráticas y Polinomiales",
            theory = LessonTheory(
                id = "th_rm_t01_s02",
                asignatura = "Raz. Matemático",
                semana = 1,
                titulo = "Algoritmo Analítico de Segundo Orden",
                resumen = "• Sucesión Cuadrática o de Segundo Orden:\n  - Es aquella donde la razón constante no aparece en la primera línea de diferencias, sino en la segunda fila.\n  - Término General: t_n = a·n² + b·n + c, donde a ≠ 0.\n\n• El Método Infalible de Diferencias Anteriores Imaginarias (n = 0):\n  - Dada la sucesión t_1, t_2, t_3, t_4...\n  - Fila 1 de diferencias: m_1, m_2, m_3...\n  - Fila 2 de diferencias (constante): r, r, r...\n  - Retrocedemos una posición imaginaria hacia n = 0:\n    * Segunda diferencia previa: r.\n    * Primera diferencia previa: m_0 = m_1 - r.\n    * Término previo inicial: t_0 = t_1 - m_0.\n  - Fórmulas de correspondencia de coeficientes:\n    1. 2a = r  =>  a = r / 2\n    2. a + b = m_0  =>  b = m_0 - a\n    3. c = t_0",
                conceptosClave = listOf(
                    "Sucesión de 2.° orden: Razón constante en la segunda diferencia (r)",
                    "Método de diferencias previas imaginarias (n = 0)",
                    "Sistema canónico: 2a = r; a + b = m₀; c = t₀",
                    "Cálculo del término general: tₙ = an² + bn + c"
                ),
                formulas = listOf(
                    "t_n = a n^2 + b n + c",
                    "2a = r \\implies a = \\frac{r}{2}",
                    "a + b = m_0 \\implies b = m_0 - a",
                    "c = t_0"
                ),
                formulaName = "Método de Diferencias de Segundo Orden",
                formulaLatex = "t_n = \\left(\\frac{r}{2}\\right)n^2 + (m_0 - a)n + t_0",
                formulaDescription = "Algoritmo de cálculo de coeficientes cuadráticos mediante la fila anterior imaginaria.",
                admissionTip = "¡No resuelvas sistemas de ecuaciones 3x3 en el examen! Halla la columna anterior imaginaria: t₀, m₀, r. Inmediatamente: 2a = r, a + b = m₀, c = t₀. ¡Ahorras 3 minutos!",
                admissionExplanation = "• Si la segunda diferencia es r = 6, entonces a = 3 de frente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dada la sucesión numérica cuadrática: 5, 12, 23, 38, 57, ... ¿cuál es el término de posición n = 20?",
                    options = listOf(
                        "802",
                        "812",
                        "822",
                        "832",
                        "842"
                    ),
                    correctIndex = 2,
                    explanation = "1. Calculamos diferencias sucesivas:\n   Sucesión: 5, 12, 23, 38, 57\n   1.ª diferencia: 7, 11, 15, 19 (van de 4 en 4)\n   2.ª diferencia: r = 4 (constante).\n2. Hallamos la columna anterior imaginaria (n = 0):\n   m₀ = 7 - 4 = 3.\n   t₀ = 5 - m₀ = 5 - 3 = 2.\n3. Calculamos a, b, c:\n   2a = 4 => a = 2.\n   a + b = m₀ => 2 + b = 3 => b = 1.\n   c = t₀ = 2.\n4. Regla general: tₙ = 2n² + n + 2.\n5. Para n = 20: t₂₀ = 2(20²) + 20 + 2 = 2(400) + 22 = 822.",
                    subject = "Raz. Matemático",
                    semana = 1
                ),
                Challenge(
                    id = "q_rm_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la sucesión cuadrática 2, 7, 16, 29, 46, ... determine la expresión del término enésimo tₙ:",
                    options = listOf(
                        "tₙ = 2n² + n - 1",
                        "tₙ = 2n² - n + 1",
                        "tₙ = n² + 3n - 2",
                        "tₙ = 2n² + 3n - 3",
                        "tₙ = 3n² - 2n + 1"
                    ),
                    correctIndex = 1,
                    explanation = "Diferencias de 2, 7, 16, 29, 46:\n1.ª diferencias: 5, 9, 13, 17.\n2.ª diferencia: r = 4.\nColumna previa: m₀ = 5 - 4 = 1; t₀ = 2 - 1 = 1.\nCoeficientes:\n2a = 4 => a = 2.\na + b = 1 => 2 + b = 1 => b = -1.\nc = t₀ = 1.\nPor tanto: tₙ = 2n² - n + 1. (Verificación: n=1 -> 2-1+1=2; n=2 -> 8-2+1=7; n=3 -> 18-3+1=16. Cumple perfectamente).",
                    subject = "Raz. Matemático",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rm_t01_s03",
            subjectId = "raz_matematico",
            semana = 1,
            subtema = "1.3 Progresiones Geométricas y Series Infinitas Convergentes (Suma Límite)",
            title = "Progresiones Geométricas y Suma Límite Infinita",
            theory = LessonTheory(
                id = "th_rm_t01_s03",
                asignatura = "Raz. Matemático",
                semana = 1,
                titulo = "Progresiones Geométricas y Series Convergentes",
                resumen = "• Progresión Geométrica (P.G.):\n  - Secuencia donde cada término se obtiene multiplicando el anterior por una constante fija llamada razón geométrica (q ≠ 0).\n  - Término General: t_n = t_1 · q^{n - 1}.\n\n• Suma de los 'n' Primeros Términos (S_n):\n  - S_n = t_1 · (q^n - 1) / (q - 1), para q ≠ 1.\n\n• Suma Límite de Series Geométricas Decrecientes Infinitas (|q| < 1):\n  - Cuando el número de términos tiende a infinito y la razón está en el intervalo abierto (-1, 1), los términos se vuelven infinitamente pequeños y la serie converge a un valor finito.\n  - Fórmula de la Suma Límite (S_L):\n    S_L = t_1 / (1 - q)\n    donde t_1 es el primer término de la serie y q es la razón (|q| < 1).\n\n• Aplicaciones Clásicas en Admisión:\n  - Problemas de rebote de pelotas: 'Una pelota se deja caer desde H metros y en cada rebote se eleva 2/3 de la altura anterior. ¿Qué distancia total recorre hasta detenerse?'.\n    Distancia = H + 2 · [H · (2/3) / (1 - 2/3)] = H · (1 + q) / (1 - q).",
                conceptosClave = listOf(
                    "Razón geométrica q: Cociente constante q = t_{k+1} / t_k",
                    "Término general: tₙ = t₁ · qⁿ⁻¹",
                    "Condición de convergencia: |q| < 1",
                    "Suma límite infinita: S = t₁ / (1 - q)",
                    "Fórmula de rebotes continuos de pelotas"
                ),
                formulas = listOf(
                    "t_n = t_1 \\cdot q^{n - 1}",
                    "S_n = t_1 \\frac{q^n - 1}{q - 1}",
                    "S_\\infty = \\frac{t_1}{1 - q} \\quad \\text{con } |q| < 1",
                    "D_{\\text{rebote}} = H \\left( \\frac{1 + q}{1 - q} \\right)"
                ),
                formulaName = "Fórmula de la Suma Límite Infinita",
                formulaLatex = "S_L = \\sum_{k=1}^\\infty t_1 q^{k-1} = \\frac{t_1}{1 - q} \\quad (|q| < 1)",
                formulaDescription = "Límite de la serie geométrica convergente sin fin.",
                admissionTip = "Para la distancia total recorrida por una pelota que cae de una altura H y rebota una fracción a/b de la altura previa: Distancia Total = H · [(b + a) / (b - a)]. ¡Fórmula mágica UNSA!",
                admissionExplanation = "• Si cae desde 100 m y rebota 3/4: Distancia = 100 · (4+3)/(4-3) = 100 · 7 = 700 m."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de la siguiente serie geométrica infinita convergente:\nS = 4 + 2 + 1 + 1/2 + 1/4 + 1/8 + ...",
                    options = listOf(
                        "6",
                        "7",
                        "8",
                        "9",
                        "10"
                    ),
                    correctIndex = 2,
                    explanation = "Es una progresión geométrica infinita decreciente con primer término t₁ = 4 y razón q = 2/4 = 1/2 (|1/2| < 1).\nAplicando la fórmula de la suma límite:\nS = t₁ / (1 - q) = 4 / (1 - 1/2) = 4 / (1/2) = 4 · 2 = 8.",
                    subject = "Raz. Matemático",
                    semana = 1
                ),
                Challenge(
                    id = "q_rm_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una pelota de básquet se deja caer desde una altura de 120 metros. Cada vez que toca el piso, rebota elevándose hasta los 2/5 de la altura desde la cual cayó. ¿Cuál es el espacio total recorrido por la pelota verticalmente hasta detenerse?",
                    options = listOf(
                        "240 m",
                        "280 m",
                        "300 m",
                        "320 m",
                        "200 m"
                    ),
                    correctIndex = 1,
                    explanation = "Aplicando la fórmula simplificada de rebotes: D = H · [(b + a) / (b - a)].\nAquí H = 120 m y q = a/b = 2/5 (a = 2, b = 5).\nD = 120 · [(5 + 2) / (5 - 2)] = 120 · (7 / 3) = 40 · 7 = 280 metros.",
                    subject = "Raz. Matemático",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rm_t01_s04",
            subjectId = "raz_matematico",
            semana = 1,
            subtema = "1.4 Distribuciones Numéricas, Arreglos Gráficos y Sucesiones Recurrentes Notables (Fibonacci)",
            title = "Distribuciones Gráficas y Sucesiones Especiales",
            theory = LessonTheory(
                id = "th_rm_t01_s04",
                asignatura = "Raz. Matemático",
                semana = 1,
                titulo = "Patrones Figurativos y Recursión Numérica",
                resumen = "• Distribuciones Numéricas y Gráficas:\n  - En las matrices numéricas (3x3), el patrón operativo suele darse por filas o por columnas (suma constante, producto de extremos igual al centro, operaciones con cuadrados).\n  - En las figuras geométricas (triángulos, círculos divididos, muñecos con extremidades), la misma regla operativa matemática debe cumplirse rigurosamente en las primeras dos figuras para aplicarla con certeza en la figura incógnita.\n\n• Sucesiones Recurrentes y Especiales Notables:\n  1. **Sucesión de Fibonacci:**\n     - 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...\n     - Regla: F_1 = 1, F_2 = 1, y para n ≥ 3: F_n = F_{n-1} + F_{n-2} (Cada término es la suma de los dos anteriores).\n  2. **Sucesión de Lucas:**\n     - 2, 1, 3, 4, 7, 11, 18, 29, ... (Misma regla que Fibonacci pero inicia en 2 y 1).\n  3. **Números Triangulares:**\n     - 1, 3, 6, 10, 15, 21, ... -> T_n = n(n + 1) / 2.\n  4. **Sucesión de Números Primos:**\n     - 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ... (No tiene fórmula polinómica; requiere reconocer primalidad).",
                conceptosClave = listOf(
                    "Homología operativa: La regla debe verificarse en las figuras 1 y 2",
                    "Análisis matricial: Probar suma de filas, suma de columnas o extremos",
                    "Fibonacci: Fₙ = F_{n-1} + F_{n-2}",
                    "Números triangulares: Tₙ = n(n+1)/2",
                    "Sucesión de primos: Único primo par es el 2"
                ),
                formulas = listOf(
                    "F_n = F_{n-1} + F_{n-2} \\quad (F_1 = 1, F_2 = 1)",
                    "T_n = \\frac{n(n + 1)}{2} \\quad (\\text{Números Triangulares})",
                    "\\text{Filas: } x_1 \\odot x_2 \\odot x_3 = k"
                ),
                formulaName = "Relación de Recurrencia de Fibonacci",
                formulaLatex = "F_n = \\frac{1}{\\sqrt{5}}\\left[\\left(\\frac{1+\\sqrt{5}}{2}\\right)^n - \\left(\\frac{1-\\sqrt{5}}{2}\\right)^n\\right]",
                formulaDescription = "Fórmula de Binet para el término general de la sucesión de Fibonacci.",
                admissionTip = "Si en una sucesión ves 2, 3, 5, 7, 11... ¡no busques diferencias!: es la sucesión de números primos. El siguiente es 13 (no 9).",
                admissionExplanation = "• En matrices numéricas, si ningún cálculo aritmético simple funciona, suma todos los números de cada fila; a menudo la suma de cada fila es constante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Encuentre el valor de 'x' en la siguiente distribución gráfica triangular:\nTriángulo 1: Vértices (3, 4, 5) -> Centro = 60\nTriángulo 2: Vértices (2, 6, 7) -> Centro = 84\nTriángulo 3: Vértices (4, 5, 8) -> Centro = x",
                    options = listOf(
                        "120",
                        "140",
                        "160",
                        "180",
                        "200"
                    ),
                    correctIndex = 2,
                    explanation = "Analicemos la regla operativa entre los vértices y el número central:\nTriángulo 1: (3 × 4 × 5) = 60.\nTriángulo 2: (2 × 6 × 7) = 84.\nLa regla matemática es el producto de los tres números ubicados en los vértices.\nTriángulo 3: x = (4 × 5 × 8) = 20 × 8 = 160.",
                    subject = "Raz. Matemático",
                    semana = 1
                ),
                Challenge(
                    id = "q_rm_t01_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el número que continúa en la siguiente secuencia de Fibonacci modificada: 2, 3, 5, 8, 13, 21, 34, ...?",
                    options = listOf(
                        "45",
                        "52",
                        "55",
                        "58",
                        "63"
                    ),
                    correctIndex = 2,
                    explanation = "Cada término a partir del tercero es la suma exacta de los dos términos inmediatamente anteriores:\n2 + 3 = 5\n3 + 5 = 8\n5 + 8 = 13\n8 + 13 = 21\n13 + 21 = 34\nEl término siguiente es: 21 + 34 = 55.",
                    subject = "Raz. Matemático",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: MAGNITUDES Y PROPORCIONALIDAD (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "rm_t02_s01",
            subjectId = "raz_matematico",
            semana = 2,
            subtema = "2.1 Razones y Proporciones: Aritméticas, Geométricas, Continuas y Discretas",
            title = "Razones y Proporciones Matemáticas",
            theory = LessonTheory(
                id = "th_rm_t02_s01",
                asignatura = "Raz. Matemático",
                semana = 2,
                titulo = "Teoría Fundamental de Proporciones",
                resumen = "• Razones:\n  - Razón Aritmética (r): Comparación por resta -> a - b = r.\n  - Razón Geométrica (k): Comparación por división -> a / b = k.\n  (a: antecedente, b: consecuente).\n\n• Proporción Aritmética (Equidiferencia: a - b = c - d):\n  - Discreta: Los 4 términos son distintos. 'd' es la cuarta diferencial.\n  - Continua: Términos medios iguales (a - b = b - c). 'b' es la media diferencial (b = (a + c)/2) y 'c' es la tercera diferencial.\n\n• Proporción Geométrica (Equicociente: a / b = c / d):\n  - Discreta: Los 4 términos son diferentes. 'd' es la cuarta proporcional (a·d = b·c).\n  - Continua: Términos medios iguales (a / b = b / c -> b² = a·c).\n    * 'b' es la media proporcional o geométrica: b = √(a·c).\n    * 'c' es la tercera proporcional: c = b² / a.",
                conceptosClave = listOf(
                    "Razón aritmética (sustracción) y geométrica (división)",
                    "Proporción discreta: 4 términos distintos (cuarta proporcional/diferencial)",
                    "Proporción continua: Medios iguales (media proporcional/geométrica)",
                    "Media proporcional: b = √(a·c); Tercera proporcional: c = b²/a"
                ),
                formulas = listOf(
                    "a - b = c - d \\implies a + d = b + c",
                    "\\frac{a}{b} = \\frac{c}{d} \\implies a \\cdot d = b \\cdot c",
                    "b = \\sqrt{a \\cdot c} \\quad (\\text{Media Proporcional})"
                ),
                formulaName = "Propiedad Fundamental de las Proporciones",
                formulaLatex = "a \\cdot d = b \\cdot c \\quad (\\text{Producto de extremos = Producto de medios})",
                formulaDescription = "Equivalencia algebraica de toda proporción geométrica.",
                admissionTip = "¡Cuidado con el vocabulario!: Si te piden 'la tercera proporcional de 4 y 8', es una proporción continua: 4/8 = 8/x -> 4x = 64 -> x = 16.",
                admissionExplanation = "• 'Media diferencial' es el promedio aritmético simple: (a + c)/2. 'Media proporcional' es la raíz cuadrada del producto: √(a·c)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle la suma de la media proporcional de 9 y 16 con la tercera proporcional de 4 y 12:",
                    options = listOf(
                        "42",
                        "48",
                        "52",
                        "36",
                        "40"
                    ),
                    correctIndex = 1,
                    explanation = "1. Media proporcional de 9 y 16:\n   b = √(9 × 16) = 3 × 4 = 12.\n2. Tercera proporcional de 4 y 12:\n   4 / 12 = 12 / c => 4c = 144 => c = 36.\n3. Suma solicitada: 12 + 36 = 48.",
                    subject = "Raz. Matemático",
                    semana = 2
                ),
                Challenge(
                    id = "q_rm_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una proporción geométrica continua, los términos extremos están en la relación de 4 a 9 y la suma de dichos extremos es 65. ¿Cuál es el valor de la media proporcional?",
                    options = listOf(
                        "24",
                        "30",
                        "36",
                        "28",
                        "32"
                    ),
                    correctIndex = 1,
                    explanation = "Sean los extremos a y c. Como están en relación de 4 a 9: a = 4k y c = 9k.\nSuma de extremos: 4k + 9k = 65 => 13k = 65 => k = 5.\nPor tanto: a = 4(5) = 20 y c = 9(5) = 45.\nLa media proporcional b es: b = √(a · c) = √(20 · 45) = √900 = 30.",
                    subject = "Raz. Matemático",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rm_t02_s02",
            subjectId = "raz_matematico",
            semana = 2,
            subtema = "2.2 Magnitudes Directa e Inversamente Proporcionales (D.P. e I.P.) y Reparto Proporcional",
            title = "Magnitudes Proporcionales (D.P. e I.P.) y Reparto",
            theory = LessonTheory(
                id = "th_rm_t02_s02",
                asignatura = "Raz. Matemático",
                semana = 2,
                titulo = "Relaciones Directas, Inversas y Reparto",
                resumen = "• Magnitudes Directamente Proporcionales (D.P.):\n  - Dos magnitudes A y B son D.P. si al aumentar (o disminuir) una de ellas en un factor, la otra aumenta (o disminuye) en el mismo factor.\n  - Criterio Matemático: Su COCIENTE es constante -> A / B = k.\n  - Gráfica cartesiana: Línea recta que pasa por el origen (0,0).\n\n• Magnitudes Inversamente Proporcionales (I.P.):\n  - Dos magnitudes A y B son I.P. si al aumentar una al doble, la otra se reduce a la mitad.\n  - Criterio Matemático: Su PRODUCTO es constante -> A · B = k.\n  - Gráfica cartesiana: Rama de hipérbola equilátera.\n\n• Reparto Proporcional:\n  - Directo: Se multiplica cada índice por una constante 'k' y se iguala a la cantidad total.\n  - Inverso: Se invierten los índices (1/a, 1/b, 1/c), se multiplican por el MCM para convertirlos a enteros, y se reparte directamente.",
                conceptosClave = listOf(
                    "D.P. -> Cociente constante (A / B = k)",
                    "I.P. -> Producto constante (A · B = k)",
                    "Gráfica D.P. = Recta por el origen; Gráfica I.P. = Hipérbola",
                    "Reparto I.P.: Invertir los índices y trabajar con el MCM de denominadores"
                ),
                formulas = listOf(
                    "A \\text{ es D.P. a } B \\iff \\frac{A}{B} = k",
                    "A \\text{ es I.P. a } B \\iff A \\cdot B = k",
                    "A \\text{ es D.P. a } B \\text{ y I.P. a } C \\implies \\frac{A \\cdot C}{B} = k"
                ),
                formulaName = "Ley Compuesta de Proporcionalidad",
                formulaLatex = "\\frac{A \\cdot C}{B} = k \\quad (A \\text{ D.P. a } B, \\, A \\text{ I.P. a } C)",
                formulaDescription = "Combinación analítica de magnitudes directas e inversas múltiples.",
                admissionTip = "Para repartir de forma I.P. a 2, 3 y 4: inviertes a 1/2, 1/3, 1/4. El MCM de (2, 3, 4) es 12. Multiplicas todo por 12: quedan 6k, 4k y 3k. ¡Rápido y sin fracciones!",
                admissionExplanation = "• En engranajes de ruedas dentadas: (Número de Dientes) es I.P. al (Número de Vueltas) -> D₁ · V₁ = D₂ · V₂."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se reparte una herencia de 3600 soles entre tres hermanos de forma inversamente proporcional a sus edades: 3, 4 y 6 años. ¿Cuánto dinero le corresponde al hermano menor?",
                    options = listOf(
                        "1200 soles",
                        "1400 soles",
                        "1600 soles",
                        "1800 soles",
                        "1500 soles"
                    ),
                    correctIndex = 2,
                    explanation = "1. Invertimos los índices: 1/3, 1/4, 1/6.\n2. MCM(3, 4, 6) = 12.\n3. Multiplicamos por 12: \n   Hermano 1 (3 años): (1/3) × 12 = 4k\n   Hermano 2 (4 años): (1/4) × 12 = 3k\n   Hermano 3 (6 años): (1/6) × 12 = 2k\n4. Suma total: 4k + 3k + 2k = 9k = 3600 => k = 400.\n5. Al hermano menor (3 años) le corresponde 4k = 4(400) = 1600 soles.",
                    subject = "Raz. Matemático",
                    semana = 2
                ),
                Challenge(
                    id = "q_rm_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una rueda A de 40 dientes está engranada con otra rueda B de 60 dientes. Si la rueda A da 120 vueltas en un minuto, ¿cuántas vueltas dará la rueda B en ese mismo lapso?",
                    options = listOf(
                        "60 vueltas",
                        "75 vueltas",
                        "80 vueltas",
                        "90 vueltas",
                        "100 vueltas"
                    ),
                    correctIndex = 2,
                    explanation = "En ruedas dentadas engranadas, el número de dientes es Inversamente Proporcional (I.P.) al número de vueltas:\nDientes_A × Vueltas_A = Dientes_B × Vueltas_B\n40 × 120 = 60 × Vueltas_B\n4800 = 60 × Vueltas_B => Vueltas_B = 4800 / 60 = 80 vueltas.",
                    subject = "Raz. Matemático",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rm_t02_s03",
            subjectId = "raz_matematico",
            semana = 2,
            subtema = "2.3 Regla de Tres Simple y Compuesta: Método Causa - Circunstancia - Efecto",
            title = "Regla de Tres Simple y Compuesta (Método C-C-E)",
            theory = LessonTheory(
                id = "th_rm_t02_s03",
                asignatura = "Raz. Matemático",
                semana = 2,
                titulo = "El Método Maestro Causa-Circunstancia-Efecto",
                resumen = "• Regla de Tres Simple:\n  - Directa (D.P.): Se multiplica en aspa (cruz): x = (b · c) / a.\n  - Inversa (I.P.): Se multiplica en línea horizontal: x = (a · b) / c.\n\n• Regla de Tres Compuesta: El Método Universal C-C-E:\n  Permite resolver cualquier problema de regla de tres compuesta en una sola línea sin analizar si cada par es D.P. o I.P.:\n  1. **Causa (¿Quién o qué hace el trabajo?):**\n     - Obreros, máquinas, animales, grifos, rendimiento, habilidad, eficiencia.\n  2. **Circunstancia (¿En qué condiciones de tiempo/esfuerzo trabajan?):**\n     - Días, horas por día (h/d), raciones, dificultad horaria.\n  3. **Efecto (¿Qué se produce, construye o desgasta?):**\n     - Metros de zanja, volumen de obra, área sembrada, paredes pintadas, dificultad del terreno.\n\n• Fórmula Maestra Universal:\n  [ (Causa) · (Circunstancia) ] / [ Efecto ] = Constante\n  [ Causa_1 · Días_1 · (h/d)_1 · Rend_1 ] / [ Obra_1 · Dif_1 ] = [ Causa_2 · Días_2 · (h/d)_2 · Rend_2 ] / [ Obra_2 · Dif_2 ]",
                conceptosClave = listOf(
                    "Causa: El sujeto que acciona y su eficiencia",
                    "Circunstancia: El tiempo y condiciones del esfuerzo (días, horas/día)",
                    "Efecto: El producto terminado o la obra realizada y su dificultad",
                    "Fórmula de oro: (Causa × Circunstancia) / Efecto = Constante"
                ),
                formulas = listOf(
                    "\\frac{\\text{Causa} \\cdot \\text{Circunstancia}}{\\text{Efecto}} = k",
                    "\\frac{O_1 \\cdot D_1 \\cdot H_1}{W_1} = \\frac{O_2 \\cdot D_2 \\cdot H_2}{W_2}"
                ),
                formulaName = "Fórmula General Causa-Circunstancia-Efecto",
                formulaLatex = "\\frac{\\text{Obreros} \\cdot \\text{Rendimiento} \\cdot \\text{Días} \\cdot \\text{Horas/día}}{\\text{Obra} \\cdot \\text{Dificultad}} = \\text{Cte.}",
                formulaDescription = "Ecuación invariable de conservación de proporcionalidad compuesta.",
                admissionTip = "¡Identifica siempre la OBRA (efecto)! Todo lo demás (obreros, días, horas/día) va arriba multiplicándose en el numerador. Solo la obra y su dificultad van abajo en el denominador.",
                admissionExplanation = "• Si cavan una zanja de 10 m de largo, 2 m de ancho y 3 m de profundidad, la obra es el VOLUMEN = 10 × 2 × 3 = 60 m³."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "15 obreros trabajando 8 horas diarias durante 12 días pueden construir una zanja de 60 metros de longitud. ¿Cuántos días necesitarán 10 obreros trabajando 6 horas diarias para construir una zanja de 40 metros de idéntica dificultad?",
                    options = listOf(
                        "12 días",
                        "16 días",
                        "18 días",
                        "20 días",
                        "15 días"
                    ),
                    correctIndex = 1,
                    explanation = "Aplicamos el método Causa-Circunstancia-Efecto:\nCausa: Obreros. Circunstancia: Horas/día × Días. Efecto: Metros de zanja.\n(15 × 8 × 12) / 60 = (10 × 6 × D) / 40\n1440 / 60 = 60D / 40\n24 = 1.5 D => D = 24 / 1.5 = 16 días.",
                    subject = "Raz. Matemático",
                    semana = 2
                ),
                Challenge(
                    id = "q_rm_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "8 agricultores siembran un terreno cuadrado de 20 metros de lado en 5 días. ¿Cuántos días tardarán 10 agricultores de igual rendimiento en sembrar otro terreno cuadrado de 30 metros de lado?",
                    options = listOf(
                        "6 días",
                        "8 días",
                        "9 días",
                        "10 días",
                        "12 días"
                    ),
                    correctIndex = 2,
                    explanation = "¡Cuidado con la trampa del terreno!: La obra sembrada es el ÁREA, no el lado.\nÁrea 1 = 20² = 400 m².\nÁrea 2 = 30² = 900 m².\nAplicamos (Causa × Días) / Efecto:\n(8 × 5) / 400 = (10 × D) / 900\n40 / 400 = 10D / 900\n1 / 10 = 10D / 900 => 100D = 900 => D = 9 días.",
                    subject = "Raz. Matemático",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rm_t02_s04",
            subjectId = "raz_matematico",
            semana = 2,
            subtema = "2.4 Tanto por Ciento: Variaciones Porcentuales, Descuentos/Aumentos Sucesivos y Aplicaciones Comerciales",
            title = "Tanto por Ciento y Aplicaciones Comerciales",
            theory = LessonTheory(
                id = "th_rm_t02_s04",
                asignatura = "Raz. Matemático",
                semana = 2,
                titulo = "Cálculo Porcentual y Comercio Formal",
                resumen = "• Fundamentos del Tanto por Ciento:\n  - P% de N = (P / 100) · N.\n  - Toda cantidad representa inicialmente el 100% de sí misma.\n\n• Descuentos Sucesivos y Aumentos Sucesivos:\n  - Dos descuentos sucesivos de d_1% y d_2% equivalen a un Descuento Único (D_u):\n    D_u = [ d_1 + d_2 - (d_1 · d_2) / 100 ] %\n  - Dos aumentos sucesivos de a_1% y a_2% equivalen a un Aumento Único (A_u):\n    A_u = [ a_1 + a_2 + (a_1 · a_2) / 100 ] %\n\n• Aplicaciones Comerciales:\n  1. Precio de Venta (P_v) con Ganancia:\n     P_v = P_c + G  (Por defecto, la ganancia G se calcula como un porcentaje del Precio de Costo P_c).\n  2. Precio de Venta con Pérdida:\n     P_v = P_c - P.\n  3. Precio Fijado o de Lista (P_F):\n     P_v = P_F - D  (El descuento D se aplica siempre sobre el Precio Fijado o de Lista).\n     Ganancia Neta = Ganancia Bruta - Gastos.",
                conceptosClave = listOf(
                    "Tanto por ciento: Fracción con denominador 100",
                    "Descuento único de dos descuentos: d₁ + d₂ - (d₁·d₂)/100",
                    "Aumento único de dos aumentos: a₁ + a₂ + (a₁·a₂)/100",
                    "Pv = Pc + G (Ganancia sobre el costo); Pv = Pf - Descuento (Descuento sobre lista)"
                ),
                formulas = listOf(
                    "D_u = \\left[ d_1 + d_2 - \\frac{d_1 \\cdot d_2}{100} \\right] \\%",
                    "A_u = \\left[ a_1 + a_2 + \\frac{a_1 \\cdot a_2}{100} \\right] \\%",
                    "P_v = P_c + G = P_F - D"
                ),
                formulaName = "Ecuación Maestra del Comercio Porcentual",
                formulaLatex = "P_v = P_c(1 + g\\%) = P_F(1 - d\\%)",
                formulaDescription = "Relación entre costo, ganancia comercial, precio de lista y descuento.",
                admissionTip = "Si el radio de un círculo aumenta en 20%, su área (proporcional a r²) será (120%)² = 144%, es decir, el área aumentó en 44%. ¡No sumes solo 20%!",
                admissionExplanation = "• Cuando un problema diga 'ganó el 20%', asume automáticamente que es 20% del PRECIO DE COSTO, a menos que diga expresamente 'del precio de venta'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una tienda comercial de Arequipa, se ofrece una laptop con dos descuentos sucesivos del 20% y del 30%. ¿A qué descuento único equivalente corresponde dicha promoción?",
                    options = listOf(
                        "50%",
                        "44%",
                        "46%",
                        "42%",
                        "48%"
                    ),
                    correctIndex = 1,
                    explanation = "Aplicamos la fórmula del descuento único:\nDu = [d₁ + d₂ - (d₁ · d₂) / 100]%\nDu = [20 + 30 - (20 · 30) / 100]%\nDu = [50 - 600 / 100]% = 50 - 6 = 44%.",
                    subject = "Raz. Matemático",
                    semana = 2
                ),
                Challenge(
                    id = "q_rm_t02_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un comerciante compra un televisor por 800 soles. ¿A qué precio debe fijarlo para la venta de modo que, haciendo un descuento del 20% al cliente, aún gane el 20% sobre el precio de costo?",
                    options = listOf(
                        "1000 soles",
                        "1100 soles",
                        "1200 soles",
                        "1250 soles",
                        "1150 soles"
                    ),
                    correctIndex = 2,
                    explanation = "1. Precio de costo Pc = 800.\n2. Ganancia G = 20% de 800 = 160 soles.\n3. Precio de venta requerido: Pv = Pc + G = 800 + 160 = 960 soles.\n4. Si hace un descuento del 20% sobre el precio de lista Pf: Pv = 80% de Pf.\n   960 = 0.80 · Pf => Pf = 960 / 0.80 = 1200 soles.",
                    subject = "Raz. Matemático",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: RAZONAMIENTO ALGEBRAICO INTUITIVO Y EDADES (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "rm_t03_s01",
            subjectId = "raz_matematico",
            semana = 3,
            subtema = "3.1 Planteo de Ecuaciones: Traducción Verbal a Expresiones Algebraicas y el Rol de la Coma",
            title = "Planteo de Ecuaciones y Traducción Rigurosa",
            theory = LessonTheory(
                id = "th_rm_t03_s01",
                asignatura = "Raz. Matemático",
                semana = 3,
                titulo = "El Arte de la Modelación Algebraica",
                resumen = "• Planteo de Ecuaciones:\n  - Traducir enunciados del lenguaje natural cotidiano al lenguaje formal matemático.\n\n• El Rol Crítico de la Coma en la Puntuación Matemática:\n  1. 'El triple de un número, aumentado en 5' -> Hay coma tras la operación: 3x + 5.\n  2. 'El triple de un número aumentado en 5' -> NO hay coma: 3(x + 5).\n\n• Términos Clave de Comparación:\n  - 'A es dos veces B' (el doble): A = 2B.\n  - 'A es dos veces más que B' (o dos veces mayor): A = B + 2B = 3B.\n  - 'A excede a B en k unidades': A - B = k.\n  - 'El exceso de A sobre B': A - B.\n  - 'A es a B como 3 es a 5': A/B = 3/5 => A = 3k, B = 5k.",
                conceptosClave = listOf(
                    "Puntuación gramatical: La coma delimita el agrupamiento de operaciones",
                    "'n veces más' = (n + 1) veces la cantidad base",
                    "Exceso: Diferencia algebraica (A - B)",
                    "Constante de proporcionalidad 'k' en razones de enunciados"
                ),
                formulas = listOf(
                    "\\text{El triple de } x, \\text{ más } 5 = 3x + 5",
                    "\\text{El triple de } (x + 5) = 3(x + 5)",
                    "A \\text{ es } n \\text{ veces más que } B \\implies A = (n + 1)B"
                ),
                formulaName = "Regla de Interpretación de Enunciados",
                formulaLatex = "\\text{Exceso de } A \\text{ sobre } B = A - B",
                formulaDescription = "Traducción formal de la diferencia cuantitativa de enunciados.",
                admissionTip = "¡Ojo con 'veces más' en la UNSA! 'Tres veces más' significa cuatro veces (A = 4B). 'Tres veces' a secas significa el triple (A = 3B).",
                admissionExplanation = "• Cuando tengas números consecutivos, si son 3 números consecutivos úsalos como: x - 1, x, x + 1. ¡La suma te dará 3x directamente eliminando los términos independientes!"
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El exceso del cuádruple de un número sobre 15 equivale al triple, del número aumentado en 5. ¿Cuál es dicho número?",
                    options = listOf(
                        "25",
                        "30",
                        "35",
                        "20",
                        "40"
                    ),
                    correctIndex = 1,
                    explanation = "1. 'El exceso del cuádruple de un número sobre 15': 4x - 15.\n2. 'el triple, del número aumentado en 5': 3(x + 5) = 3x + 15.\n3. Planteamos la ecuación:\n   4x - 15 = 3(x + 5)\n   4x - 15 = 3x + 15\n   4x - 3x = 15 + 15 => x = 30.",
                    subject = "Raz. Matemático",
                    semana = 3
                ),
                Challenge(
                    id = "q_rm_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un corral hay conejos y gallinas. Si se cuentan 35 cabezas y 110 patas en total, ¿cuántos conejos hay en el corral?",
                    options = listOf(
                        "15",
                        "18",
                        "20",
                        "22",
                        "25"
                    ),
                    correctIndex = 2,
                    explanation = "Sea c = número de conejos (4 patas) y g = número de gallinas (2 patas).\n1. Total cabezas: c + g = 35 => g = 35 - c.\n2. Total patas: 4c + 2g = 110.\n   4c + 2(35 - c) = 110\n   4c + 70 - 2c = 110\n   2c = 110 - 70 = 40 => c = 20 conejos.",
                    subject = "Raz. Matemático",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rm_t03_s02",
            subjectId = "raz_matematico",
            semana = 3,
            subtema = "3.2 Problemas de Edades para un Sujeto y para Varios Sujetos (Diferencia Constante de Edades)",
            title = "Problemas de Edades y Diferencia Temporal Constante",
            theory = LessonTheory(
                id = "th_rm_t03_s02",
                asignatura = "Raz. Matemático",
                semana = 3,
                titulo = "Modelado Temporal de Edades",
                resumen = "• Estructura Temporal:\n  - Pasado (hace 'x' años): Edad = Presente - x.\n  - Presente (edad actual): Edad = E.\n  - Futuro (dentro de 'y' años): Edad = Presente + y.\n\n• Principio Sagrado de las Edades para Dos o Más Sujetos:\n  1. **La diferencia de edades entre dos personas permanece rigurosamente CONSTANTE a lo largo de toda la vida**:\n     (Edad A - Edad B)_{\\text{pasado}} = (Edad A - Edad B)_{\\text{presente}} = (Edad A - Edad B)_{\\text{futuro}}.\n  2. **Propiedad de las Sumas Cruzadas en el Cuadro de Edades**:\n     Al construir una tabla de doble entrada con los sujetos en las filas y los tiempos (Pasado, Presente, Futuro) en las columnas, LA SUMA EN ASPA ENTRE DOS TIEMPOS CUALESQUIERA ES SIEMPRE IGUAL:\n     Pasado(A) + Presente(B) = Pasado(B) + Presente(A).",
                conceptosClave = listOf(
                    "Diferencia de edades constante en cualquier momento del tiempo",
                    "Propiedad de las sumas en aspa en la tabla de doble entrada",
                    "El tiempo transcurre igual para todos (suma de 'k' años constante)",
                    "Manejo riguroso de tiempos verbales: 'tengo', 'tenías', 'tendrás'"
                ),
                formulas = listOf(
                    "\\text{Edad}_A(t) - \\text{Edad}_B(t) = \\text{Constante}",
                    "A_{\\text{pas}} + B_{\\text{pres}} = B_{\\text{pas}} + A_{\\text{pres}}",
                    "A_{\\text{pres}} + B_{\\text{fut}} = B_{\\text{pres}} + A_{\\text{fut}}"
                ),
                formulaName = "Teorema de la Suma Cruzada en Edades",
                formulaLatex = "A_1 + B_2 = B_1 + A_2 \\quad (\\forall t_1 < t_2)",
                formulaDescription = "Invarianza algebraica de la suma diagonal en matrices temporales de edades.",
                admissionTip = "Construye siempre la tabla: columnas 'Pasado', 'Presente', 'Futuro'; filas 'Yo', 'Tú'. Usa la suma en aspa para igualar en un solo paso sin llenar de ecuaciones la hoja.",
                admissionExplanation = "• 'Tengo el doble de la edad que tú tenías': si tú tenías x, yo tengo 2x."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Yo tengo el doble de la edad que tú tenías cuando yo tenía la edad que tú tienes. Si la suma de nuestras edades actuales es 56 años, ¿cuántos años tengo yo actualmente?",
                    options = listOf(
                        "28 años",
                        "30 años",
                        "32 años",
                        "34 años",
                        "36 años"
                    ),
                    correctIndex = 2,
                    explanation = "Construimos el cuadro de edades:\n- Pasado: Tú tenías = x; Yo tenía = y.\n- Presente: Tú tienes = y; Yo tengo = 2x.\nPor la suma en aspa (Pasado y Presente):\nYo(pasado) + Tú(presente) = Tú(pasado) + Yo(presente)\ny + y = x + 2x => 2y = 3x => y = 1.5x.\nDato: Suma de edades actuales es 56:\nYo(presente) + Tú(presente) = 56\n2x + y = 56 => 2x + 1.5x = 56 => 3.5x = 56 => x = 56 / 3.5 = 16.\nPor lo tanto, mi edad actual es: Yo tengo = 2x = 2(16) = 32 años.",
                    subject = "Raz. Matemático",
                    semana = 3
                ),
                Challenge(
                    id = "q_rm_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dentro de 15 años, la edad de Carlos será el doble de la edad que tenía hace 5 años. ¿Qué edad tiene Carlos hoy?",
                    options = listOf(
                        "20 años",
                        "22 años",
                        "25 años",
                        "28 años",
                        "30 años"
                    ),
                    correctIndex = 2,
                    explanation = "Sea 'x' la edad actual de Carlos.\n- Dentro de 15 años: x + 15.\n- Hace 5 años: x - 5.\nPlanteamos:\nx + 15 = 2(x - 5)\nx + 15 = 2x - 10\n15 + 10 = 2x - x => x = 25 años.",
                    subject = "Raz. Matemático",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rm_t03_s03",
            subjectId = "raz_matematico",
            semana = 3,
            subtema = "3.3 Relación entre Año de Nacimiento, Año Actual y Cumpleaños",
            title = "Año de Nacimiento, Año Actual y Cumpleaños",
            theory = LessonTheory(
                id = "th_rm_t03_s03",
                asignatura = "Raz. Matemático",
                semana = 3,
                titulo = "Ecuaciones Cronológicas de Nacimiento",
                resumen = "• Fórmulas de Relación Calendaria:\n  1. Si la persona YA CUMPLIÓ AÑOS en el año de referencia:\n     Año de Nacimiento + Edad = Año Actual\n  2. Si la persona TODAVÍA NO CUMPLE AÑOS en el año de referencia:\n     Año de Nacimiento + Edad = Año Actual - 1\n\n• Suma de Años de Nacimiento y Edades de un Grupo de 'n' Personas:\n  - Si todas cumplieron años: ∑ (Año Nac.) + ∑ (Edades) = n · (Año Actual).\n  - Si algunas 'k' personas todavía no cumplieron años:\n    ∑ (Año Nac.) + ∑ (Edades) = n · (Año Actual) - k\n    (La cantidad de personas que no han cumplido años equivale exactamente a la diferencia entre el total teórico y la suma obtenida).",
                conceptosClave = listOf(
                    "Si ya cumplió años: Año Nac. + Edad = Año Actual",
                    "Si no cumplió años: Año Nac. + Edad = Año Actual - 1",
                    "Detección de personas que no cumplieron años por diferencia de sumas",
                    "Año bisiesto: Múltiplo de 4 (excepto seculares no divisibles por 400)"
                ),
                formulas = listOf(
                    "\\text{Año Nac.} + \\text{Edad} = \\text{Año Actual} \\quad (\\text{Si ya cumplió})",
                    "\\text{Año Nac.} + \\text{Edad} = \\text{Año Actual} - 1 \\quad (\\text{Si no cumplió})",
                    "\\sum \\text{Año Nac.} + \\sum \\text{Edades} = n \\cdot (\\text{Año Actual}) - k"
                ),
                formulaName = "Ecuación Fundamental de la Cronología",
                formulaLatex = "\\text{Nacimiento} + \\text{Edad} = \\text{Año Actual} - [\\text{Aún no cumple}]",
                formulaDescription = "Relación matemática entre fecha natal y edad cronológica.",
                admissionTip = "Si en un grupo de 10 personas en el año 2026 sumas sus años de nacimiento y sus edades y te da 20256 en vez de 20260 (que sería 10 × 2026), la diferencia 20260 - 20256 = 4 indica que exactamente 4 personas aún no cumplen años.",
                admissionExplanation = "• No te compliques resolviendo persona por persona; usa la fórmula de la suma colectiva."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el mes de agosto del año 2024, se suman los años de nacimiento de 8 postulantes de la UNSA y sus edades correspondientes a esa fecha, obteniéndose un resultado total de 16189. ¿Cuántos postulantes del grupo todavía no habían cumplido años en ese momento?",
                    options = listOf(
                        "2",
                        "3",
                        "4",
                        "5",
                        "6"
                    ),
                    correctIndex = 1,
                    explanation = "Si los 8 postulantes hubiesen cumplido años, la suma teórica exacta sería:\n8 × 2024 = 16192.\nComo la suma real obtenida fue 16189, la diferencia es:\n16192 - 16189 = 3.\nCada persona que aún no cumple años resta exactamente 1 a la suma teórica. Por tanto, 3 postulantes todavía no habían cumplido años.",
                    subject = "Raz. Matemático",
                    semana = 3
                ),
                Challenge(
                    id = "q_rm_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En 1993, la edad de un profesor universitario era igual a la suma de las cifras del año en que nació. ¿En qué año nació el docente?",
                    options = listOf(
                        "1970",
                        "1971",
                        "1972",
                        "1973",
                        "1974"
                    ),
                    correctIndex = 1,
                    explanation = "El año de nacimiento tiene la forma 19ab.\nAño Nacimiento + Edad = 1993\n1900 + 10a + b + (1 + 9 + a + b) = 1993\n1910 + 11a + 2b = 1993\n11a + 2b = 83.\nComo 'a' y 'b' son dígitos enteros (0 a 9) y 2b es par:\nSi a = 7: 11(7) + 2b = 83 => 77 + 2b = 83 => 2b = 6 => b = 3. (1973: 1+9+7+3 = 20 -> 1973+20 = 1993. ¡Cumple!).\nSi revisamos a = 7, b = 3 -> Nació en 1973. (Revisando las opciones: 1971 daría 1+9+7+1 = 18 -> 1971+18 = 1989 != 1993; para 1973: 1973 + 20 = 1993. Por tanto nació en 1973).",
                    subject = "Raz. Matemático",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rm_t03_s04",
            subjectId = "raz_matematico",
            semana = 3,
            subtema = "3.4 Métodos Operativos Prácticos: Regla Conjunta, Método del Rombo y Balanzas en Equilibrio",
            title = "Métodos Operativos: Regla Conjunta, Rombo y Balanzas",
            theory = LessonTheory(
                id = "th_rm_t03_s04",
                asignatura = "Raz. Matemático",
                semana = 3,
                titulo = "Métodos Prácticos de Resolución Aritmético-Algebraica",
                resumen = "• 1. Regla de la Conjunta (Equivalencias en Cadena):\n  - Se forman igualdades sucesivas de equivalencia cuidando que la unidad que aparece a la derecha en una fila, aparezca a la izquierda en la siguiente fila (no pueden repetirse en la misma columna).\n  - Se multiplican todos los términos de la columna izquierda y se igualan al producto de la columna derecha, despejando la incógnita.\n\n• 2. Método del Rombo (Falsa Suposición Estructurada):\n  - Se aplica en problemas con dos incógnitas donde se conocen: Total de elementos (izq.), Total recaudado (der.), Valor unitario mayor (arriba) y Valor unitario menor (abajo).\n  - Fórmula para hallar el número de elementos de la incógnita inferior:\n    N_{\\text{abajo}} = [ (Total \\cdot Mayor) - Recaudado ] / [ Mayor - Menor ]\n\n• 3. Balanzas en Equilibrio:\n  - Representan sistemas de ecuaciones lineales directos donde los platos equivalen a miembros algebraicos.\n  - Si se añade o quita la misma masa de ambos platos, el equilibrio se conserva.",
                conceptosClave = listOf(
                    "Regla conjunta: Alternancia estricta de especies en columnas opuestas",
                    "Método del rombo: Vértice superior (Mayor), inferior (Menor), izquierdo (Total elementos), derecho (Total recaudado)",
                    "Cálculo del elemento menor: N_menor = (Total * V_sup - V_der) / (V_sup - V_inf)",
                    "Balanzas: Principio de sustitución y eliminación directa"
                ),
                formulas = listOf(
                    "\\prod \\text{Columna Izquierda} = \\prod \\text{Columna Derecha}",
                    "N_{\\text{menor}} = \\frac{(\\text{Total} \\cdot V_{\\text{mayor}}) - \\text{Recaudado}}{V_{\\text{mayor}} - V_{\\text{menor}}}"
                ),
                formulaName = "Fórmula Operativa del Método del Rombo",
                formulaLatex = "n_{\\text{inf}} = \\frac{T \\cdot M - R}{M - m}",
                formulaDescription = "Resolución sin álgebra explícita de problemas de dos variables con restricciones lineales.",
                admissionTip = "El método del rombo siempre te da directamente la cantidad de elementos del VALOR MENOR (el del vértice inferior). Si te piden el mayor, solo resta del total de elementos.",
                admissionExplanation = "• En la regla de la conjunta, verifica que la primera especie del problema sea la última que cierres a la derecha."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un teatro se recaudó 1800 soles por la venta de 80 boletos. Si las entradas para adultos costaban 30 soles y las de niños 15 soles, ¿cuántos boletos para niños se vendieron?",
                    options = listOf(
                        "35",
                        "40",
                        "45",
                        "50",
                        "30"
                    ),
                    correctIndex = 1,
                    explanation = "Aplicando el método del rombo:\n- Total de elementos (izq.) = 80 boletos.\n- Total recaudado (der.) = 1800 soles.\n- Valor mayor (arriba) = 30 soles (adultos).\n- Valor menor (abajo) = 15 soles (niños).\nNúmero de niños = [(80 × 30) - 1800] / (30 - 15)\n= (2400 - 1800) / 15 = 600 / 15 = 40 boletos de niños.",
                    subject = "Raz. Matemático",
                    semana = 3
                ),
                Challenge(
                    id = "q_rm_t03_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Por 3 cuadernos dan 2 libros, y por 5 libros dan 4 carpetas. ¿Cuántos cuadernos darán por 8 carpetas?",
                    options = listOf(
                        "12",
                        "15",
                        "16",
                        "18",
                        "20"
                    ),
                    correctIndex = 1,
                    explanation = "Aplicamos la Regla de la Conjunta:\n3 cuadernos < > 2 libros\n5 libros < > 4 carpetas\n8 carpetas < > x cuadernos\nMultiplicamos columnas:\n3 × 5 × 8 = 2 × 4 × x\n120 = 8x => x = 120 / 8 = 15 cuadernos.",
                    subject = "Raz. Matemático",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: RAZONAMIENTO GEOMÉTRICO, ÁREAS Y PERÍMETROS (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "rm_t04_s01",
            subjectId = "raz_matematico",
            semana = 4,
            subtema = "4.1 Áreas de Regiones Sombreadas: Método de Traslación, Simetría y Diferencia de Áreas",
            title = "Áreas Sombreadas: Traslación y Simetría",
            theory = LessonTheory(
                id = "th_rm_t04_s01",
                asignatura = "Raz. Matemático",
                semana = 4,
                titulo = "Métodos Maestros de Áreas Sombreadas",
                resumen = "• 1. Método de Traslación de Regiones:\n  - Consiste en mover trozos o 'pétalos' de áreas sombreadas hacia huecos en blanco de forma idéntica (congruente) mediante simetrías o rotaciones.\n  - Transforma configuraciones complejas en figuras simples (medio cuadrado, un cuarto de círculo, etc.).\n\n• 2. Método por Diferencia de Áreas:\n  - Cuando la región sombreada no se puede trasladar directamente:\n    Área Sombreada = Área Total - Área No Sombreada.\n  - Ejemplo clásico: Área entre un círculo circunscrito y un cuadrado inscrito.\n\n• Áreas Fundamentales de Memoria:\n  - Cuadrado: A = L² = d² / 2.\n  - Triángulo: A = (b · h) / 2.\n  - Triángulo equilátero: A = (L² · √3) / 4.\n  - Círculo: A = π · r².\n  - Sector circular: A = (π · r² · θ) / 360°.\n  - Corona circular: A = π · (R² - r²).",
                conceptosClave = listOf(
                    "Traslación por congruencia: Reubicar regiones para armar fracciones de la figura total",
                    "Diferencia de áreas: Total menos regiones en blanco",
                    "Triángulo equilátero: A = (L²√3)/4",
                    "Área de corona circular: π(R² - r²)"
                ),
                formulas = listOf(
                    "A_{\\text{sombreada}} = A_{\\text{total}} - A_{\\text{no sombreada}}",
                    "A_{\\text{triáng. equil.}} = \\frac{L^2 \\sqrt{3}}{4}",
                    "A_{\\text{corona}} = \\pi (R^2 - r^2)"
                ),
                formulaName = "Principio de Conservación de Superficies",
                formulaLatex = "A_{\\text{sombreada}} = \\sum A_{\\text{piezas trasladadas}}",
                formulaDescription = "Invarianza del área bajo isometrías en el plano euclidiano.",
                admissionTip = "Si en un cuadrado con diagonales ves dos pétalos sombreados, traslada uno al espacio vacío adyacente: el 90% de las veces se forma exactamente la mitad o la cuarta parte del cuadrado (L²/2 o L²/4).",
                admissionExplanation = "• No calcules áreas parciales con curvas complejas si puedes trasladarlas para formar figuras rectilíneas conocidas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un cuadrado de lado L = 8 cm, se trazan sus dos diagonales y dos semicircunferencias cuyos diámetros son los lados opuestos. Mediante traslación de regiones sombreadas congruentes, se comprueba que el área sombreada ocupa exactamente la mitad del cuadrado. ¿Cuál es el valor del área sombreada?",
                    options = listOf(
                        "16 cm²",
                        "24 cm²",
                        "32 cm²",
                        "48 cm²",
                        "64 cm²"
                    ),
                    correctIndex = 2,
                    explanation = "El área total del cuadrado es A = L² = 8² = 64 cm².\nAl trasladar las regiones simétricas hacia los sectores vacíos correspondientes, se cubre exactamente la mitad del área del cuadrado:\nÁrea Sombreada = A / 2 = 64 / 2 = 32 cm².",
                    subject = "Raz. Matemático",
                    semana = 4
                ),
                Challenge(
                    id = "q_rm_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el área de un triángulo equilátero cuyo perímetro es de 18 cm:",
                    options = listOf(
                        "9√3 cm²",
                        "12√3 cm²",
                        "18√3 cm²",
                        "6√3 cm²",
                        "27√3 cm²"
                    ),
                    correctIndex = 0,
                    explanation = "1. Si el perímetro es 18 cm y los 3 lados son iguales: L = 18 / 3 = 6 cm.\n2. Área del triángulo equilátero: A = (L² · √3) / 4 = (6² · √3) / 4 = (36 · √3) / 4 = 9√3 cm².",
                    subject = "Raz. Matemático",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rm_t04_s02",
            subjectId = "raz_matematico",
            semana = 4,
            subtema = "4.2 Relaciones de Áreas en Triángulos, Medianas, Baricentro y Cuadriláteros",
            title = "Relaciones de Áreas, Medianas y Baricentro",
            theory = LessonTheory(
                id = "th_rm_t04_s02",
                asignatura = "Raz. Matemático",
                semana = 4,
                titulo = "Propiedades de Partición Geométrica",
                resumen = "• Propiedades de Áreas en Triángulos:\n  1. **Ceviana y Base:**\n     - Las áreas de dos triángulos que comparten la misma altura son proporcionales a las longitudes de sus respectivas bases.\n     - Si la base se divide en relación de 2 a 3 -> Las áreas están en relación de 2S a 3S.\n  2. **Mediana:**\n     - La mediana divide al triángulo en dos regiones de IGUAL ÁREA (S y S).\n  3. **Baricentro (G - Punto de corte de las 3 medianas):**\n     - Las 3 medianas dividen al triángulo en 6 triángulos de IGUAL ÁREA (cada uno vale S = Área Total / 6).\n     - Si se unen los tres vértices con el baricentro, se forman 3 triángulos de igual área (cada uno vale Área Total / 3).\n  4. **Triángulo Mediano:**\n     - Al unir los puntos medios de los tres lados, se forman 4 triángulos congruentes de igual área (S = Área Total / 4).\n\n• En Paralelogramos:\n  - La diagonal divide al paralelogramo en dos mitades de igual área.\n  - Si P es un punto cualquiera de un lado: Área del triángulo formado con el lado opuesto = Área Total / 2.",
                conceptosClave = listOf(
                    "Mediana: Bisectriz de área (divide en dos regiones de área idéntica)",
                    "Baricentro: Partición en 6 regiones triangulares de igual área (S = A_total / 6)",
                    "Triángulo mediano: Partición en 4 triángulos iguales (A_total / 4)",
                    "Área proporcional a las bases con altura común"
                ),
                formulas = listOf(
                    "\\text{Baricentro}: S_1 = S_2 = \\dots = S_6 = \\frac{A_{\\text{total}}}{6}",
                    "\\text{Triángulo Mediano} = \\frac{A_{\\text{total}}}{4}",
                    "\\frac{A_1}{A_2} = \\frac{b_1}{b_2} \\quad (\\text{misma altura})"
                ),
                formulaName = "Teorema de la Partición Baricéntrica",
                formulaLatex = "A(ABG) = A(BCG) = A(ACG) = \\frac{A(ABC)}{3}",
                formulaDescription = "Distribución equitativa de área del baricentro hacia los tres vértices.",
                admissionTip = "Apenas veas puntos medios en un triángulo, traza las medianas completas: el baricentro parte toda la figura en 6 trozos de igual área 'S'. ¡Resuelve problemas en segundos!",
                admissionExplanation = "• Recuerda que áreas iguales no significan figuras congruentes: dos triángulos pueden tener formas diferentes y la misma superficie numérica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC de área total igual a 72 cm², se trazan sus tres medianas, las cuales se cortan en el baricentro G. ¿Cuál es el área de la región cuadrangular que se forma al unir el baricentro con dos vértices y el punto medio del lado intermedio (equivalente a dos sectores baricéntricos contiguos)?",
                    options = listOf(
                        "12 cm²",
                        "18 cm²",
                        "24 cm²",
                        "36 cm²",
                        "16 cm²"
                    ),
                    correctIndex = 2,
                    explanation = "Las tres medianas de un triángulo dividen su superficie en 6 triángulos parciales de áreas exactamente iguales:\nÁrea de cada sector S = Área Total / 6 = 72 / 6 = 12 cm².\nLa región cuadrangular compuesta por dos de estos sectores equivale a:\n2S = 2(12) = 24 cm².",
                    subject = "Raz. Matemático",
                    semana = 4
                ),
                Challenge(
                    id = "q_rm_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, se traza la ceviana interior BD tal que AD = 4 cm y DC = 8 cm. Si el área del triángulo ABD es 20 cm², ¿cuál es el área del triángulo BDC?",
                    options = listOf(
                        "30 cm²",
                        "35 cm²",
                        "40 cm²",
                        "45 cm²",
                        "50 cm²"
                    ),
                    correctIndex = 2,
                    explanation = "Ambos triángulos (ABD y BDC) comparten el mismo vértice B y se encuentran sobre la misma línea de base AC, por lo que tienen idéntica altura.\nLa relación de sus áreas es directamente proporcional a sus bases:\nÁrea(BDC) / Área(ABD) = DC / AD\nÁrea(BDC) / 20 = 8 / 4 = 2\nÁrea(BDC) = 20 × 2 = 40 cm².",
                    subject = "Raz. Matemático",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rm_t04_s03",
            subjectId = "raz_matematico",
            semana = 4,
            subtema = "4.3 Perímetros y Contornos: Longitud de Curvas, Semicircunferencias y Proyección Ortogonal",
            title = "Perímetros, Curvas y Principio de Proyección",
            theory = LessonTheory(
                id = "th_rm_t04_s03",
                asignatura = "Raz. Matemático",
                semana = 4,
                titulo = "Cálculo de Perímetros y Longitudes de Contorno",
                resumen = "• Definición Rigurosa de Perímetro (2p):\n  - Es la longitud total de la línea frontera cerrada (contorno) que limita una región plana.\n  - ¡Atención!: En regiones sombreadas, el perímetro es la suma de los contornos EXTERIORES E INTERIORES que tocan la región sombreada.\n\n• Longitudes de Circunferencias y Curvas:\n  - Circunferencia completa: L = 2 · π · r = π · d.\n  - Semicircunferencia (solo el arco curvo): L_{arco} = π · r.\n  - Arco de sector circular: L = (2 · π · r · θ) / 360°.\n\n• Principio de Conservación de Perímetro por Proyección Ortogonal:\n  - En figuras escalonadas o con entrantes ortogonales en ángulo recto, la suma de las líneas horizontales proyectadas equivale a la base total, y la suma de las líneas verticales proyectadas equivale a la altura total.\n  - Perímetro de escalón = Perímetro del rectángulo circunscrito: 2p = 2(Base + Altura).",
                conceptosClave = listOf(
                    "Perímetro de región sombreada: Suma de todos los bordes límites (curvos y rectos)",
                    "Longitud de arco de circunferencia: L = θ·r (con θ en radianes)",
                    "Principio de proyección ortogonal para figuras escalonadas",
                    "Diferencia entre contorno perimétrico y área encerrada"
                ),
                formulas = listOf(
                    "L_{\\text{circunferencia}} = 2\\pi r = \\pi d",
                    "L_{\\text{arco semicírculo}} = \\pi r",
                    "2p_{\\text{escalonado}} = 2(\\text{Ancho} + \\text{Alto})"
                ),
                formulaName = "Fórmula del Perímetro Compuesto",
                formulaLatex = "2p = \\sum L_{\\text{rectas}} + \\sum L_{\\text{arcos}}",
                formulaDescription = "Suma analítica de todas las trayectorias de borde que confinan la región.",
                admissionTip = "Si te piden el perímetro de una figura con escalera o gradas en ángulo recto, ¡no midas cada gradita! Proyéctalas: el perímetro de la escalera es exactamente igual al de un rectángulo común: 2(base + altura).",
                admissionExplanation = "• No sumes las líneas punteadas que dividen la figura por dentro: el perímetro SOLO incluye los bordes frontera."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una región sombreada está limitada por tres semicircunferencias construidas sobre los lados de un triángulo equilátero de lado L = 6 cm (hacia el exterior). ¿Cuál es el perímetro total de dicha región sombreada?",
                    options = listOf(
                        "9π cm",
                        "12π cm",
                        "18π cm",
                        "6π cm",
                        "15π cm"
                    ),
                    correctIndex = 0,
                    explanation = "El contorno de la figura está formado por 3 arcos de semicircunferencias cuyos diámetros son los lados del triángulo (d = 6 cm -> radio r = 3 cm).\nLa longitud de cada arco de semicircunferencia es L_arco = π · r = π · 3 = 3π cm.\nComo son 3 arcos idénticos:\nPerímetro total = 3 × (3π) = 9π cm.",
                    subject = "Raz. Matemático",
                    semana = 4
                ),
                Challenge(
                    id = "q_rm_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una escalera de concreto tiene 8 escalones idénticos. Si la altura total que asciende la escalera es de 3 metros y el ancho total de avance horizontal es de 4 metros, ¿cuál es el perímetro exterior de su perfil lateral completo (incluyendo base y pared posterior)?",
                    options = listOf(
                        "12 metros",
                        "14 metros",
                        "16 metros",
                        "10 metros",
                        "18 metros"
                    ),
                    correctIndex = 1,
                    explanation = "Por el principio de proyección ortogonal:\n1. La suma de todas las huellas horizontales de los 8 escalones es exactamente igual a la base: 4 m.\n2. La suma de todos los contrahuellas verticales de los 8 escalones es exactamente igual a la altura: 3 m.\n3. La base inferior mide 4 m.\n4. La pared posterior vertical mide 3 m.\nPerímetro total = (Suma huellas) + (Suma contrahuellas) + Base + Altura = 4 + 3 + 4 + 3 = 14 metros.",
                    subject = "Raz. Matemático",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rm_t04_s04",
            subjectId = "raz_matematico",
            semana = 4,
            subtema = "4.4 Conteo Inductivo de Figuras (Segmentos, Triángulos, Cuadriláteros) y Visualización Espacial",
            title = "Conteo Inductivo de Figuras y Razonamiento Espacial",
            theory = LessonTheory(
                id = "th_rm_t04_s04",
                asignatura = "Raz. Matemático",
                semana = 4,
                titulo = "Métodos Combinatorios y Conteo Inductivo",
                resumen = "• Fórmulas Fundamentales de Conteo Inductivo (Gauss):\n  1. **Segmentos Alineados:**\n     - Para una recta dividida en 'n' espacios consecutivos: N = n(n + 1) / 2.\n  2. **Ángulos Consecutivos Agudos:**\n     - Para 'n' espacios angulares generados por rayos: N = n(n + 1) / 2.\n  3. **Triángulos con Vértice Común:**\n     - Si la base se divide en 'n' espacios y tiene una sola línea de base: N = n(n + 1) / 2.\n     - Si tiene 'h' pisos o líneas horizontales secantes: N = [ n(n + 1) / 2 ] · h.\n  4. **Cuadriláteros en una Malla (m x n):**\n     - Para una cuadrícula de m filas y n columnas de casilleros:\n       N = [ m(m + 1) / 2 ] · [ n(n + 1) / 2 ].\n  5. **Cuadrados en una Malla (m x n con m ≤ n):**\n     - N = (m · n) + (m - 1)(n - 1) + (m - 2)(n - 2) + ... hasta que un factor sea 1.",
                conceptosClave = listOf(
                    "Fórmula de Gauss n(n+1)/2 para conteo simple en un eje",
                    "Triángulos con pisos horizontales: [n(n+1)/2] * h",
                    "Cuadriláteros en cuadrículas: Producto de sumatorias de filas y columnas",
                    "Conteo de cuadrados perfectos: Suma de productos decrecientes"
                ),
                formulas = listOf(
                    "N_{\\text{segmentos}} = \\frac{n(n + 1)}{2}",
                    "N_{\\text{triángulos}} = \\frac{n(n + 1)}{2} \\cdot h",
                    "N_{\\text{cuadriláteros}} = \\left( \\frac{m(m + 1)}{2} \\right) \\left( \\frac{n(n + 1)}{2} \\right)",
                    "N_{\\text{cuadrados}} = \\sum_{k=0}^{m-1} (m - k)(n - k)"
                ),
                formulaName = "Fórmulas Inductivas de Conteo Geométrico",
                formulaLatex = "N = \\frac{n(n+1)}{2} \\cdot h",
                formulaDescription = "Algoritmo combinatorio para conteo sistemático de figuras regulares.",
                admissionTip = "Para contar cuadriláteros en una cuadrícula de 3 filas y 4 columnas: aplica Gauss a 3 (3×4/2 = 6), aplica Gauss a 4 (4×5/2 = 10) y multiplica los dos resultados: 6 × 10 = 60 cuadriláteros.",
                admissionExplanation = "• No confundas 'cuadriláteros' (que incluye rectángulos) con 'cuadrados': para cuadrados multiplica cruzado hacia abajo (3×4 + 2×3 + 1×2 = 20)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántos triángulos hay en total en una figura triangular donde la base está dividida en 6 espacios iguales y además cuenta con 4 líneas horizontales paralelas a la base (4 pisos en total)?",
                    options = listOf(
                        "63",
                        "72",
                        "84",
                        "90",
                        "105"
                    ),
                    correctIndex = 2,
                    explanation = "1. Número de espacios en la base: n = 6.\n2. Conteo en la base: n(n + 1) / 2 = 6(7) / 2 = 21 triángulos.\n3. Número de pisos horizontales: h = 4.\n4. Total de triángulos = 21 × 4 = 84 triángulos.",
                    subject = "Raz. Matemático",
                    semana = 4
                ),
                Challenge(
                    id = "q_rm_t04_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una cuadrícula rectangular de 4 casilleros de ancho por 5 casilleros de largo, ¿cuántos cuadrados se pueden contar en total?",
                    options = listOf(
                        "30",
                        "40",
                        "45",
                        "50",
                        "60"
                    ),
                    correctIndex = 1,
                    explanation = "Aplicamos la regla de productos decrecientes con m = 4 y n = 5:\nN = (4 × 5) + (3 × 4) + (2 × 3) + (1 × 2)\nN = 20 + 12 + 6 + 2 = 40 cuadrados en total.",
                    subject = "Raz. Matemático",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: ANÁLISIS COMBINATORIO INTUITIVO Y CONTEO (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "rm_t05_s01",
            subjectId = "raz_matematico",
            semana = 5,
            subtema = "5.1 Principios Fundamentales del Conteo: Principio de Adición (O) y de Multiplicación (Y)",
            title = "Principios de Adición y Multiplicación",
            theory = LessonTheory(
                id = "th_rm_t05_s01",
                asignatura = "Raz. Matemático",
                semana = 5,
                titulo = "Axiomas Fundamentales del Análisis Combinatorio",
                resumen = "• 1. Principio de Adición (El Conector 'O'):\n  - Se aplica cuando dos o más eventos son MUTUAMENTE EXCLUYENTES: si ocurre uno, no puede ocurrir el otro al mismo tiempo.\n  - Regla: Se SUMAN las maneras de ocurrir cada evento.\n  - Total = m + n.\n  - Ejemplo: Viajar de Arequipa a Lima por avión (3 aerolíneas) O por bus (5 empresas) -> 3 + 5 = 8 opciones.\n\n• 2. Principio de Multiplicación (El Conector 'Y'):\n  - Se aplica cuando dos o más decisiones se toman de manera SIMULTÁNEA O SECUENCIAL (una a continuación de la otra).\n  - Regla: Se MULTIPLICAN las maneras de ocurrir cada evento.\n  - Total = m · n.\n  - Ejemplo: Vestirse con un pantalón Y una camisa. Si tengo 4 pantalones y 6 camisas -> 4 × 6 = 24 tenidas diferentes.\n\n• Diagrama de Árbol:\n  - Método gráfico que ramifica las decisiones sucesivas para visualizar el espacio total de combinaciones.",
                conceptosClave = listOf(
                    "Principio de adición: Eventos excluyentes ('O') -> Se suma",
                    "Principio de multiplicación: Decisiones simultáneas o secuenciales ('Y') -> Se multiplica",
                    "Detección del conector lógico implícito en el enunciado",
                    "Regla de la vestimenta y menús de restaurante"
                ),
                formulas = listOf(
                    "\\text{Total}(A \\lor B) = n(A) + n(B) \\quad (A \\cap B = \\emptyset)",
                    "\\text{Total}(A \\land B) = n(A) \\cdot n(B)"
                ),
                formulaName = "Teorema Fundamental del Conteo Combinatorio",
                formulaLatex = "|A \\times B| = |A| \\cdot |B| \\quad \\land \\quad |A \\cup B| = |A| + |B|",
                formulaDescription = "Cardinalidad de productos cartesianos y uniones disjuntas.",
                admissionTip = "Pregúntate: ¿Puedo hacer las dos cosas a la vez? Si la respuesta es NO (ej. tomar un bus o un avión), SUMA. Si la respuesta es SÍ (ej. ponerme camisa y pantalón), MULTIPLICA.",
                admissionExplanation = "• Si una prenda está sucia o inutilizada, réstala antes de aplicar la multiplicación."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un estudiante dispone de 4 camisas distintas, 3 pantalones diferentes y 2 pares de zapatos. ¿De cuántas maneras diferentes puede vestirse para asistir a la universidad, utilizando una camisa, un pantalón y un par de zapatos?",
                    options = listOf(
                        "9 maneras",
                        "14 maneras",
                        "18 maneras",
                        "24 maneras",
                        "36 maneras"
                    ),
                    correctIndex = 3,
                    explanation = "La elección de vestimenta exige seleccionar una camisa Y un pantalón Y un par de zapatos de forma simultánea. Por el Principio de Multiplicación:\nTotal = 4 × 3 × 2 = 24 maneras diferentes.",
                    subject = "Raz. Matemático",
                    semana = 5
                ),
                Challenge(
                    id = "q_rm_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para viajar de la ciudad de Arequipa a la ciudad de Mollendo se dispone de 4 empresas de buses terrestres, 2 servicios de colectivos en automóvil y 3 vuelos chárter en avioneta. ¿De cuántas maneras distintas puede realizar el viaje una persona eligiendo un solo medio de transporte?",
                    options = listOf(
                        "9 maneras",
                        "24 maneras",
                        "12 maneras",
                        "16 maneras",
                        "18 maneras"
                    ),
                    correctIndex = 0,
                    explanation = "Los medios de transporte son mutuamente excluyentes: el viaje se realiza en bus O en colectivo O en avioneta. Por el Principio de Adición:\nTotal = 4 + 2 + 3 = 9 maneras distintas.",
                    subject = "Raz. Matemático",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rm_t05_s02",
            subjectId = "raz_matematico",
            semana = 5,
            subtema = "5.2 Problemas de Rutas, Caminos y Redes Viales (Método del Triángulo de Pascal)",
            title = "Rutas, Caminos y Principio de Pascal",
            theory = LessonTheory(
                id = "th_rm_t05_s02",
                asignatura = "Raz. Matemático",
                semana = 5,
                titulo = "Teoría de Rutas en Redes Viales y Cuadrículas",
                resumen = "• Problemas de Rutas y Caminos:\n  - Determinar de cuántas formas se puede ir de una ciudad A a una ciudad B pasando por ciudades intermedias, bajo la restricción estricta de NO RETROCEDER (moviéndose solo hacia adelante, a la derecha o hacia abajo).\n\n• Redes Viales Simples (Ciudades en Serie y Paralelo):\n  - Si para ir de A a B hay 'm' caminos y de B a C hay 'n' caminos: Total de A a C pasando por B = m · n.\n  - Si además hay un camino directo de A a C sin pasar por B: Total = (m · n) + 1.\n\n• Cuadrículas Urbanas y el Método del Triángulo de Pascal:\n  - En una red de calles cuadriculada, el número de maneras de llegar a cualquier vértice o esquina es la SUMA de las formas de llegar a las esquinas que desembocan en ella (arriba e izquierda).\n  - Se colocan unos (1) en todos los bordes externos superiores e izquierdos, y cada punto interno es la suma de los dos anteriores.",
                conceptosClave = listOf(
                    "Caminos en serie (se multiplican) y en paralelo (se suman)",
                    "Condición de no retroceso (movimientos monótonos)",
                    "Método de Pascal en cuadrículas: Suma en cada vértice",
                    "Rutas con paso obligatorio por una ciudad específica"
                ),
                formulas = listOf(
                    "\\text{Ruta}(A \\to B \\to C) = n(AB) \\cdot n(BC)",
                    "\\text{Vértice}(i, j) = \\text{Vértice}(i-1, j) + \\text{Vértice}(i, j-1)",
                    "\\text{Caminos en red } m \\times n = \\binom{m + n}{m}"
                ),
                formulaName = "Fórmula Combinatoria de Cuadrículas",
                formulaLatex = "N_{\\text{rutas}} = \\frac{(m + n)!}{m! \\, n!} = \\binom{m+n}{m}",
                formulaDescription = "Permutación con repetición de movimientos hacia la derecha (m) y hacia abajo (n).",
                admissionTip = "Si te piden ir de una esquina A a una esquina B de una cuadrícula de 3 manzanas por 4 manzanas sin retroceder, usa la combinatoria: C(3+4, 3) = C(7, 3) = (7×6×5)/(3×2×1) = 35 rutas.",
                admissionExplanation = "• Si hay una calle bloqueada o inundada, el método de Pascal vértice por vértice es el más seguro: pon un cero (0) en el punto bloqueado y continúa sumando."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para viajar de la ciudad A a la ciudad B hay 3 caminos diferentes, y para viajar de la ciudad B a la ciudad C hay 4 caminos diferentes. ¿De cuántas formas distintas puede una persona realizar el viaje de ida y vuelta de A hasta C (pasando siempre por B), con la condición de que en el viaje de regreso no utilice ningún camino empleado en la ida?",
                    options = listOf(
                        "144",
                        "72",
                        "96",
                        "84",
                        "108"
                    ),
                    correctIndex = 1,
                    explanation = "1. Viaje de ida (A -> B -> C):\n   Caminos de ida = 3 × 4 = 12 formas.\n2. Viaje de regreso (C -> B -> A):\n   Como no puede repetir ningún camino usado en la ida, de C a B le quedan 4 - 1 = 3 caminos disponibles; y de B a A le quedan 3 - 1 = 2 caminos disponibles.\n   Caminos de regreso = 3 × 2 = 6 formas.\n3. Total ida y vuelta = 12 × 6 = 72 formas distintas.",
                    subject = "Raz. Matemático",
                    semana = 5
                ),
                Challenge(
                    id = "q_rm_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una cuadrícula de calles de 2 cuadras de ancho por 3 cuadras de largo, ¿de cuántas maneras distintas se puede ir de la esquina superior izquierda a la esquina inferior derecha avanzando únicamente hacia el Este (derecha) o hacia el Sur (abajo)?",
                    options = listOf(
                        "8",
                        "10",
                        "12",
                        "15",
                        "20"
                    ),
                    correctIndex = 1,
                    explanation = "Para llegar al destino se deben realizar exactamente 3 pasos al Este y 2 pasos al Sur (total 5 pasos).\nEs una permutación con repetición:\nP = 5! / (3! × 2!) = (120) / (6 × 2) = 120 / 12 = 10 maneras distintas.\n(O aplicando Pascal en la cuadrícula de 2x3 se obtiene igualmente 10).",
                    subject = "Raz. Matemático",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rm_t05_s03",
            subjectId = "raz_matematico",
            semana = 5,
            subtema = "5.3 Agrupaciones donde SÍ Importa el Orden: Permutaciones Lineales, Circulares y con Repetición",
            title = "Permutaciones Lineales, Circulares y con Repetición",
            theory = LessonTheory(
                id = "th_rm_t05_s03",
                asignatura = "Raz. Matemático",
                semana = 5,
                titulo = "Técnicas de Conteo con Orden",
                resumen = "• ¿Cuándo Importa el Orden?:\n  - Cuando cambiar de posición a los elementos genera un resultado DISTINTO (ej. números telefónicos, podio de una carrera, contraseñas, directivas con cargos de Presidente, Secretario y Tesorero).\n\n• 1. Permutación Lineal Simple (P_n):\n  - Se ordenan todos los 'n' elementos en una línea recta.\n  - P_n = n! = n · (n - 1) · (n - 2) ... · 1.\n  - Elementos que deben estar 'juntos': Se consideran como un solo bloque y luego se multiplica por la permutación interna del bloque.\n\n• 2. Permutación Circular (P_c(n)):\n  - Se ordenan 'n' elementos simétricamente alrededor de un círculo (mesa redonda, fogata).\n  - Se fija un elemento de referencia para romper la simetría rotacional:\n    P_c(n) = (n - 1)!\n\n• 3. Permutación con Elementos Repetidos (PR):\n  - Cuando hay elementos indistinguibles:\n    PR_n^{a, b, c} = n! / (a! · b! · c!).",
                conceptosClave = listOf(
                    "Criterio de orden: Si al cambiar de lugar el resultado varía -> Importa el orden",
                    "Permutación lineal: Pₙ = n!",
                    "Técnica del bloque: Elementos juntos se cuentan como un solo ente",
                    "Permutación circular: P_c(n) = (n - 1)!",
                    "Permutación con repetición: División entre los factoriales de elementos repetidos"
                ),
                formulas = listOf(
                    "P_n = n!",
                    "P_c(n) = (n - 1)!",
                    "PR_n^{a, b, c} = \\frac{n!}{a! \\, b! \\, c!}",
                    "V(n, k) = \\frac{n!}{(n - k)!}"
                ),
                formulaName = "Fórmulas de Permutación y Ordenamiento",
                formulaLatex = "P_c(n) = (n - 1)! \\quad \\land \\quad PR_n^{k_1, \\dots, k_r} = \\frac{n!}{\\prod k_i!}",
                formulaDescription = "Modelos analíticos de ordenación lineal, cíclica y con elementos repetidos.",
                admissionTip = "Si 3 personas deben sentarse 'siempre juntas' en una fila de 6 personas: amarra a las 3 en un solo bloque. Ahora tienes 4 elementos (el bloque + las otras 3 personas) -> 4! = 24. Luego multiplica por la permutación dentro del bloque (3! = 6): 24 × 6 = 144.",
                admissionExplanation = "• En mesa circular, para 6 personas es (6 - 1)! = 5! = 120."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿De cuántas maneras diferentes se pueden sentar 5 personas alrededor de una mesa circular para cenar?",
                    options = listOf(
                        "120",
                        "24",
                        "60",
                        "48",
                        "72"
                    ),
                    correctIndex = 1,
                    explanation = "Para ordenar n personas en una distribución circular simétrica, se aplica la permutación circular:\nP_c(5) = (5 - 1)! = 4! = 4 × 3 × 2 × 1 = 24 maneras diferentes.",
                    subject = "Raz. Matemático",
                    semana = 5
                ),
                Challenge(
                    id = "q_rm_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántas palabras distintas de 8 letras (con o sin sentido) se pueden formar permutando todas las letras de la palabra «AREQUIPA» sabiendo que la letra 'A' se repite 2 veces y las demás son distintas?",
                    options = listOf(
                        "40320",
                        "20160",
                        "10080",
                        "5040",
                        "15120"
                    ),
                    correctIndex = 1,
                    explanation = "La palabra AREQUIPA tiene 8 letras en total (n = 8), con la letra 'A' repetida 2 veces (k₁ = 2) y las restantes (R, E, Q, U, I, P) una sola vez.\nAplicando permutación con repetición:\nPR = 8! / 2! = 40320 / 2 = 20160 palabras distintas.",
                    subject = "Raz. Matemático",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rm_t05_s04",
            subjectId = "raz_matematico",
            semana = 5,
            subtema = "5.4 Agrupaciones donde NO Importa el Orden: Combinaciones Simples y Equipos con Restricciones",
            title = "Combinaciones Simples y Selección de Equipos",
            theory = LessonTheory(
                id = "th_rm_t05_s04",
                asignatura = "Raz. Matemático",
                semana = 5,
                titulo = "Combinatoria sin Orden y Comisiones",
                resumen = "• ¿Cuándo NO Importa el Orden?:\n  - Cuando formar el grupo {Juan, Pedro} es exactamente lo mismo que formar el grupo {Pedro, Juan}.\n  - Ejemplos: Comisiones de trabajo, comités estudiantiles, apretones de manos, selección de cartas para una mano de juego, ensaladas de frutas con k ingredientes.\n\n• Fórmula de la Combinación Simple (C(n, k)):\n  - C(n, k) = n! / [ k! · (n - k)! ].\n  - Regla práctica del 'degradé' (método rápido):\n    C(10, 3) = (10 · 9 · 8) / (3 · 2 · 1) = 120.\n    (Se bajan tantos factores en el numerador y denominador como indica el índice inferior k).\n\n• Propiedades Notables de Combinaciones:\n  1. Combinaciones Complementarias: C(n, k) = C(n, n - k).\n     * Ejemplo: C(20, 18) = C(20, 2) = (20 · 19) / 2 = 190.\n  2. Número de Apretones de Manos o Saludos entre 'n' personas:\n     N = C(n, 2) = n(n - 1) / 2.",
                conceptosClave = listOf(
                    "Criterio: No importa el orden (elegir subconjuntos de personas o cosas)",
                    "Fórmula: C(n, k) = n! / [k!(n - k)!]",
                    "Método del degradé para cálculo mental veloz",
                    "Combinaciones complementarias: C(n, k) = C(n, n - k)",
                    "Saludos y partidos de ida: C(n, 2) = n(n - 1) / 2"
                ),
                formulas = listOf(
                    "C(n, k) = \\frac{n!}{k! (n - k)!}",
                    "C(n, k) = C(n, n - k)",
                    "N_{\\text{saludos}} = C(n, 2) = \\frac{n(n - 1)}{2}",
                    "\\sum_{k=0}^n C(n, k) = 2^n"
                ),
                formulaName = "Fórmula del Coeficiente Binomial",
                formulaLatex = "\\binom{n}{k} = \\frac{n(n-1)\\dots(n-k+1)}{k!}",
                formulaDescription = "Número de subconjuntos de k elementos a partir de un conjunto de n elementos.",
                admissionTip = "Para calcular C(12, 10): no hagas 10 factores; usa la complementaria C(12, 2) = (12 × 11) / 2 = 66. ¡En 3 segundos!",
                admissionExplanation = "• Si te piden formar un comité con 2 hombres y 3 mujeres, calcula las combinaciones de hombres y las de mujeres por separado y MULTIPLÍCALAS (Principio de multiplicación: 'hombres Y mujeres')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De un grupo de 7 ingenieros y 5 médicos, se desea conformar una comisión investigadora de 4 miembros integrada por exactamente 2 ingenieros y 2 médicos. ¿De cuántas formas distintas se puede constituir dicha comisión?",
                    options = listOf(
                        "105",
                        "210",
                        "350",
                        "420",
                        "140"
                    ),
                    correctIndex = 1,
                    explanation = "1. Elegimos 2 ingenieros de los 7 disponibles: C(7, 2) = (7 × 6) / (2 × 1) = 21 formas.\n2. Elegimos 2 médicos de los 5 disponibles: C(5, 2) = (5 × 4) / (2 × 1) = 10 formas.\n3. Como la comisión requiere ingenieros Y médicos simultáneamente, multiplicamos:\n   Total = C(7, 2) × C(5, 2) = 21 × 10 = 210 formas distintas.",
                    subject = "Raz. Matemático",
                    semana = 5
                ),
                Challenge(
                    id = "q_rm_t05_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al finalizar una reunión de directores de escuela en la UNSA, todos los asistentes se despidieron estrechándose la mano mutuamente una sola vez. Si en total se contabilizaron 66 apretones de manos, ¿cuántos directores asistieron a la reunión?",
                    options = listOf(
                        "10",
                        "11",
                        "12",
                        "13",
                        "14"
                    ),
                    correctIndex = 2,
                    explanation = "Cada saludo involucra a 2 personas sin importar el orden: N_saludos = C(n, 2) = n(n - 1) / 2.\nPlanteamos:\nn(n - 1) / 2 = 66\nn(n - 1) = 132\nBuscamos dos números enteros consecutivos cuyo producto sea 132: 12 × 11 = 132.\nPor tanto, n = 12 directores.",
                    subject = "Raz. Matemático",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: PROBABILIDAD INTUITIVA Y CONDICIONAL (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "rm_t06_s01",
            subjectId = "raz_matematico",
            semana = 6,
            subtema = "6.1 Conceptos Fundamentales: Experimento Aleatorio, Espacio Muestral y Sucesos (Seguro, Imposible)",
            title = "Fundamentos de la Probabilidad: Espacio Muestral y Sucesos",
            theory = LessonTheory(
                id = "th_rm_t06_s01",
                asignatura = "Raz. Matemático",
                semana = 6,
                titulo = "Axiomática y Espacios Muestrales Discretos",
                resumen = "• Conceptos Clave de Probabilidad:\n  1. **Experimento Aleatorio (ε):** Fenómeno cuyo resultado no puede preverse con certeza antes de realizarse (ej. lanzar dos dados).\n  2. **Espacio Muestral (Ω):** Conjunto universal de TODOS los resultados posibles del experimento.\n     * Lanzar 'n' monedas: n(Ω) = 2^n.\n     * Lanzar 'n' dados: n(Ω) = 6^n.\n     * Baraja inglesa: n(Ω) = 52 cartas (4 palos: 13 corazones, 13 diamantes, 13 tréboles, 13 espadas; 26 rojas y 26 negras).\n  3. **Suceso o Evento (A):** Cualquier subconjunto del espacio muestral (A ⊆ Ω).\n     * Suceso Seguro (A = Ω): Ocurre con 100% de certeza -> P(A) = 1.\n     * Suceso Imposible (A = ∅): No puede ocurrir jamás -> P(A) = 0.\n\n• Axiomas de Kolmogórov:\n  1. 0 ≤ P(A) ≤ 1 (La probabilidad es un número real entre 0 y 1, o entre 0% y 100%).\n  2. P(Ω) = 1.",
                conceptosClave = listOf(
                    "Espacio muestral Ω: Universo de casos posibles",
                    "Potencias del espacio muestral: Monedas (2ⁿ), Dados (6ⁿ)",
                    "Baraja de 52 cartas: 4 palos de 13 cartas (26 rojas y 26 negras)",
                    "Axioma de acotamiento: 0 ≤ P(A) ≤ 1"
                ),
                formulas = listOf(
                    "0 \\le P(A) \\le 1",
                    "P(\\Omega) = 1 \\quad \\land \\quad P(\\emptyset) = 0",
                    "n(\\Omega)_{\\text{monedas}} = 2^n, \\quad n(\\Omega)_{\\text{dados}} = 6^n"
                ),
                formulaName = "Axiomas de la Probabilidad Clásica",
                formulaLatex = "P(A) = \\frac{n(A)}{n(\\Omega)} \\in [0, 1]",
                formulaDescription = "Medida normalizada de certidumbre sobre un espacio muestral equiprobable.",
                admissionTip = "¡Cuidado con la baraja en admisión! Las cartas son 52 (no cuentan los comodines/jokers). En cada palo hay 3 figuras con rostro (J, Q, K), totalizando 12 figuras en toda la baraja.",
                admissionExplanation = "• Si te sale una probabilidad mayor a 1 o negativa, ¡revisa tus cuentas de inmediato porque has cometido un error!"
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al lanzar tres monedas normales al aire de forma simultánea, ¿cuál es el número total de elementos que componen el espacio muestral Ω?",
                    options = listOf(
                        "6",
                        "8",
                        "9",
                        "12",
                        "16"
                    ),
                    correctIndex = 1,
                    explanation = "Cada moneda tiene 2 resultados posibles (Cara o Sello). Para n = 3 monedas lanzadas simultáneamente:\nn(Ω) = 2^3 = 8 resultados posibles en el espacio muestral: {(CCC), (CCS), (CSC), (SCC), (CSS), (SCS), (SSC), (SSS)}.",
                    subject = "Raz. Matemático",
                    semana = 6
                ),
                Challenge(
                    id = "q_rm_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De una baraja estándar completa de 52 cartas se extrae una carta al azar. ¿Cuál es el número de casos favorables para el evento: «Obtener una carta que sea figura con rostro (J, Q o K) de color rojo»?",
                    options = listOf(
                        "3",
                        "6",
                        "12",
                        "8",
                        "4"
                    ),
                    correctIndex = 1,
                    explanation = "En la baraja hay dos palos rojos: Corazones y Diamantes.\nCada palo tiene 3 figuras (J, Q, K):\n- Figuras rojas de corazones: J♥, Q♥, K♥ (3 cartas).\n- Figuras rojas de diamantes: J♦, Q♦, K♦ (3 cartas).\nTotal de casos favorables = 3 + 3 = 6 cartas.",
                    subject = "Raz. Matemático",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rm_t06_s02",
            subjectId = "raz_matematico",
            semana = 6,
            subtema = "6.2 Regla Clásica de Laplace y Probabilidad del Suceso Contrario (Complemento)",
            title = "Regla de Laplace y Suceso Contrario",
            theory = LessonTheory(
                id = "th_rm_t06_s02",
                asignatura = "Raz. Matemático",
                semana = 6,
                titulo = "Cálculo Clásico y el Poder del Complemento",
                resumen = "• Regla Clásica de Laplace:\n  - Aplica cuando todos los resultados elementales del espacio muestral son EQUIPROBABLES (tienen la misma posibilidad de ocurrir).\n  - P(A) = [ Número de Casos Favorables de A ] / [ Número Total de Casos Posibles de Ω ]\n  - P(A) = n(A) / n(Ω).\n\n• Probabilidad del Suceso Contrario (Complemento A'):\n  - El suceso 'no ocurre A' es el complemento A'.\n  - P(A') = 1 - P(A).\n  - ¡Estrategia Maestra de Admisión!: Cuando una pregunta incluya expresiones como **«al menos uno»**, **«por lo menos uno»** o **«como mínimo uno»**, es infinitamente más rápido calcular la probabilidad de que 'ninguno ocurra' y restarla de 1:\n    P(\\text{al menos uno}) = 1 - P(\\text{ninguno}).",
                conceptosClave = listOf(
                    "Regla de Laplace: Casos Favorables / Casos Posibles",
                    "Equiprobabilidad de los eventos elementales",
                    "Suceso contrario: P(A') = 1 - P(A)",
                    "El truco de 'Al menos uno': 1 - P(ninguno)"
                ),
                formulas = listOf(
                    "P(A) = \\frac{n(A)}{n(\\Omega)}",
                    "P(A') = 1 - P(A)",
                    "P(\\text{al menos uno}) = 1 - P(\\text{ninguno})"
                ),
                formulaName = "Principio de Laplace y Regla del Complemento",
                formulaLatex = "P(\\text{Al menos un } X) = 1 - P(\\text{Cero } X)",
                formulaDescription = "Cálculo indirecto de alta eficiencia para problemas disyuntivos acumulados.",
                admissionTip = "Si lanzas 4 monedas y te piden 'la probabilidad de obtener al menos una cara', no calcules los casos de 1, 2, 3 y 4 caras. Solo hay un caso donde NO hay caras: (SSSS) -> 1/16. Respuesta: 1 - 1/16 = 15/16. ¡Sale al instante!",
                admissionExplanation = "• En dados: la suma más probable al lanzar dos dados es 7 (tiene 6 combinaciones de 36: 6/36 = 1/6)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al lanzar simultáneamente dos dados normales sobre una mesa, ¿cuál es la probabilidad de que la suma de los puntos obtenidos sea igual a 8?",
                    options = listOf(
                        "1/6",
                        "5/36",
                        "7/36",
                        "1/9",
                        "1/12"
                    ),
                    correctIndex = 1,
                    explanation = "1. Espacio muestral de dos dados: n(Ω) = 6 × 6 = 36 casos posibles.\n2. Casos favorables donde la suma es 8:\n   (2, 6), (3, 5), (4, 4), (5, 3), (6, 2) -> 5 casos favorables.\n3. Por Laplace: P(Suma = 8) = 5 / 36.",
                    subject = "Raz. Matemático",
                    semana = 6
                ),
                Challenge(
                    id = "q_rm_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se lanzan cuatro monedas al aire de manera simultánea. ¿Cuál es la probabilidad de obtener por lo menos (al menos) una cara?",
                    options = listOf(
                        "1/16",
                        "7/16",
                        "15/16",
                        "3/4",
                        "7/8"
                    ),
                    correctIndex = 2,
                    explanation = "Aplicamos el método del suceso contrario:\nP(al menos una cara) = 1 - P(ninguna cara).\nNinguna cara significa obtener solo sellos: (S, S, S, S) -> 1 solo caso favorable de un total de 2^4 = 16 casos posibles.\nP(ninguna cara) = 1 / 16.\nPor tanto: P(al menos una cara) = 1 - 1/16 = 15 / 16.",
                    subject = "Raz. Matemático",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rm_t06_s03",
            subjectId = "raz_matematico",
            semana = 6,
            subtema = "6.3 Álgebra de Eventos: Eventos Mutuamente Excluyentes, Independientes y Regla del Producto",
            title = "Eventos Excluyentes, Independientes y Regla del Producto",
            theory = LessonTheory(
                id = "th_rm_t06_s03",
                asignatura = "Raz. Matemático",
                semana = 6,
                titulo = "Operaciones con Probabilidades Compuestas",
                resumen = "• 1. Regla de la Adición (Probabilidad de la Unión P(A ∪ B) - Conector 'O'):\n  - Eventos Mutuamente Excluyentes (A ∩ B = ∅): No pueden ocurrir juntos.\n    P(A ∪ B) = P(A) + P(B).\n  - Eventos No Excluyentes (Compatibles: A ∩ B ≠ ∅): Pueden ocurrir juntos.\n    P(A ∪ B) = P(A) + P(B) - P(A ∩ B).\n\n• 2. Regla de la Multiplicación (Probabilidad de la Intersección P(A ∩ B) - Conector 'Y'):\n  - Eventos Independientes:\n    * La ocurrencia de uno NO altera ni condiciona en nada la probabilidad del otro (ej. lanzar una moneda y luego un dado).\n    * Regla del Producto: P(A ∩ B) = P(A) · P(B).\n  - Eventos Dependientes:\n    * La ocurrencia de A afecta la probabilidad de B (ej. extraer cartas o bolas sin reposición).\n    * P(A ∩ B) = P(A) · P(B | A).",
                conceptosClave = listOf(
                    "Eventos mutuamente excluyentes: P(A ∪ B) = P(A) + P(B)",
                    "Eventos no excluyentes: Se resta la intersección P(A ∩ B)",
                    "Eventos independientes: P(A ∩ B) = P(A) * P(B)",
                    "Eventos dependientes: Incorporan probabilidad condicional"
                ),
                formulas = listOf(
                    "P(A \\cup B) = P(A) + P(B) - P(A \\cap B)",
                    "P(A \\cap B) = P(A) \\cdot P(B) \\quad (\\text{Independientes})",
                    "P(A \\cap B) = P(A) \\cdot P(B \\mid A) \\quad (\\text{Dependientes})"
                ),
                formulaName = "Leyes de Adición y Multiplicación de Probabilidades",
                formulaLatex = "P(A \\land B) = P(A) \\cdot P(B) \\iff A \\perp B",
                formulaDescription = "Condición necesaria y suficiente para la independencia estocástica.",
                admissionTip = "Cuando un tirador tiene probabilidad 3/4 de acertar y otro 2/3, y ambos disparan de forma independiente al mismo blanco: son eventos independientes, se multiplican sus probabilidades individuales.",
                admissionExplanation = "• ¡No sumes probabilidades cuando los eventos ocurren uno después de otro! Se multiplican."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De una baraja estándar de 52 cartas, se extrae una carta al azar. ¿Cuál es la probabilidad de que la carta extraída sea un As o una carta de corazones?",
                    options = listOf(
                        "17/52",
                        "16/52 = 4/13",
                        "13/52 = 1/4",
                        "15/52",
                        "18/52"
                    ),
                    correctIndex = 1,
                    explanation = "Son eventos no excluyentes porque existe el As de corazones (A ∩ B ≠ ∅):\n- Evento A (ser As): 4 ases en la baraja -> P(A) = 4/52.\n- Evento B (ser corazones): 13 cartas de corazones -> P(B) = 13/52.\n- Intersección A ∩ B (As de corazones): 1 carta -> P(A ∩ B) = 1/52.\nAplicando la regla de adición:\nP(A ∪ B) = P(A) + P(B) - P(A ∩ B) = 4/52 + 13/52 - 1/52 = 16/52 = 4/13.",
                    subject = "Raz. Matemático",
                    semana = 6
                ),
                Challenge(
                    id = "q_rm_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos postulantes a la UNSA, Pedro y Rosa, rinden un examen en aulas separadas de forma independiente. La probabilidad de que Pedro apruebe es 3/5 y la probabilidad de que Rosa apruebe es 2/3. ¿Cuál es la probabilidad de que AMBOS aprueben el examen?",
                    options = listOf(
                        "2/5",
                        "19/15",
                        "1/2",
                        "3/10",
                        "4/15"
                    ),
                    correctIndex = 0,
                    explanation = "Al rendir el examen en aulas separadas de manera autónoma, los sucesos son estrictamente INDEPENDIENTES.\nPor la regla del producto:\nP(Pedro apruebe ∩ Rosa apruebe) = P(Pedro) × P(Rosa) = (3/5) × (2/3) = 6/15 = 2/5 (o 40%).",
                    subject = "Raz. Matemático",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rm_t06_s04",
            subjectId = "raz_matematico",
            semana = 6,
            subtema = "6.4 Probabilidad Condicional y Extracciones en Urnas (Con y Sin Reposición)",
            title = "Probabilidad Condicional y Extracciones en Urnas",
            theory = LessonTheory(
                id = "th_rm_t06_s04",
                asignatura = "Raz. Matemático",
                semana = 6,
                titulo = "Extracciones Sucesivas y Probabilidad Condicional",
                resumen = "• Probabilidad Condicional P(A | B):\n  - Probabilidad de que ocurra el suceso A sabiendo con certeza que YA OCURRIÓ el suceso B.\n  - El suceso B reduce el espacio muestral original únicamente a los elementos de B:\n    P(A | B) = P(A ∩ B) / P(B), con P(B) > 0.\n\n• Problemas Clásicos de Urnas con Bolas:\n  1. **Extracciones CON Reposición (Reemplazo):**\n     - La bola extraída se reintegra a la urna antes de la siguiente extracción.\n     - El espacio muestral total n(Ω) y la cantidad de cada color permanecen CONSTANTES.\n     - Los eventos son INDEPENDIENTES.\n  2. **Extracciones SIN Reposición:**\n     - La bola extraída NO se devuelve a la urna.\n     - En la segunda extracción, tanto el total de bolas del color extraído como el total general n(Ω) DISMINUYEN EN 1.\n     - Los eventos son DEPENDIENTES.",
                conceptosClave = listOf(
                    "Probabilidad condicional: Reducción del espacio muestral al evento condicionante",
                    "Extracción con reposición: Probabilidades idénticas e independientes",
                    "Extracción sin reposición: Reducción secuencial del denominador y numerador",
                    "Principio multiplicativo en extracciones sucesivas"
                ),
                formulas = listOf(
                    "P(A \\mid B) = \\frac{P(A \\cap B)}{P(B)}",
                    "P(B_1 \\cap B_2)_{\\text{sin rep.}} = \\frac{k}{N} \\cdot \\frac{k - 1}{N - 1}",
                    "P(B_1 \\cap B_2)_{\\text{con rep.}} = \\frac{k}{N} \\cdot \\frac{k}{N}"
                ),
                formulaName = "Fórmula de la Probabilidad Condicional",
                formulaLatex = "P(A \\mid B) = \\frac{n(A \\cap B)}{n(B)}",
                formulaDescription = "Razón de casos compartidos respecto al nuevo universo muestral restringido.",
                admissionTip = "En extracciones SIN reposición, recuerda descontar 1 tanto arriba (si repites color) como abajo (en el total de bolas). ¡El error más común es olvidar restar 1 en el total!",
                admissionExplanation = "• Si sacas 2 bolas a la vez, es exactamente equivalente a sacar una por una SIN reposición."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una urna hay 6 bolas rojas y 4 bolas azules (10 bolas en total). Se extraen dos bolas consecutivamente una tras otra SIN REPOSICIÓN. ¿Cuál es la probabilidad de que ambas bolas extraídas sean de color rojo?",
                    options = listOf(
                        "9/25",
                        "1/3",
                        "3/10",
                        "6/15",
                        "1/2"
                    ),
                    correctIndex = 1,
                    explanation = "1. Primera extracción: Hay 6 rojas de un total de 10 bolas -> P(R₁) = 6 / 10.\n2. Segunda extracción (sin reposición): Quedan 5 rojas de un total de 9 bolas -> P(R₂ | R₁) = 5 / 9.\n3. Probabilidad conjunta:\nP = (6 / 10) × (5 / 9) = (3 / 5) × (5 / 9) = 15 / 45 = 1 / 3.",
                    subject = "Raz. Matemático",
                    semana = 6
                ),
                Challenge(
                    id = "q_rm_t06_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una caja hay 5 focos buenos y 3 focos defectuosos (8 en total). Se extraen dos focos uno tras otro CON REPOSICIÓN. ¿Cuál es la probabilidad de que el primero sea defectuoso y el segundo sea bueno?",
                    options = listOf(
                        "15/64",
                        "15/56",
                        "3/8",
                        "5/8",
                        "9/64"
                    ),
                    correctIndex = 0,
                    explanation = "Al ser CON REPOSICIÓN, los eventos son totalmente independientes y el total de 8 focos se mantiene constante:\n- Probabilidad de defectuoso en la primera: 3 / 8.\n- Se repone el foco a la caja.\n- Probabilidad de bueno en la segunda: 5 / 8.\nProbabilidad conjunta = (3 / 8) × (5 / 8) = 15 / 64.",
                    subject = "Raz. Matemático",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: ESTADÍSTICA Y ANÁLISIS DE DATOS (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "rm_t07_s01",
            subjectId = "raz_matematico",
            semana = 7,
            subtema = "7.1 Tablas de Distribución de Frecuencias (Absoluta, Relativa y Acumuladas)",
            title = "Tablas de Distribución de Frecuencias",
            theory = LessonTheory(
                id = "th_rm_t07_s01",
                asignatura = "Raz. Matemático",
                semana = 7,
                titulo = "Estructura de la Tabla de Frecuencias",
                resumen = "• Componentes de una Tabla Estadística para Muestra de Tamaño 'n':\n  1. **Frecuencia Absoluta (f_i):** Número de veces que se repite la variable x_i.\n     - Suma total: ∑ f_i = n.\n  2. **Frecuencia Relativa (h_i):** Proporción del total que representa cada frecuencia absoluta.\n     - h_i = f_i / n.\n     - Propiedad: 0 ≤ h_i ≤ 1 y la suma total ∑ h_i = 1.\n  3. **Frecuencia Relativa Porcentual (h_i%):**\n     - h_i% = h_i · 100%.\n     - Suma total: ∑ h_i% = 100%.\n  4. **Frecuencia Absoluta Acumulada (F_i):**\n     - F_i = f_1 + f_2 + ... + f_i. (La última F_k = n).\n  5. **Frecuencia Relativa Acumulada (H_i):**\n     - H_i = h_1 + h_2 + ... + h_i = F_i / n. (La última H_k = 1.0).",
                conceptosClave = listOf(
                    "Frecuencia absoluta f_i: Conteo de repeticiones de la categoría",
                    "Frecuencia relativa h_i = f_i / n (suma siempre 1)",
                    "Frecuencias acumuladas F_i y H_i: Sumas progresivas diagonales",
                    "Reconstrucción de tablas incompletas en exámenes de admisión"
                ),
                formulas = listOf(
                    "\\sum_{i=1}^k f_i = n",
                    "h_i = \\frac{f_i}{n} \\quad \\land \\quad \\sum_{i=1}^k h_i = 1",
                    "F_i = F_{i-1} + f_i \\quad (F_k = n)"
                ),
                formulaName = "Identidades de Distribución de Frecuencias",
                formulaLatex = "h_i = \\frac{f_i}{n} \\iff f_i = n \\cdot h_i",
                formulaDescription = "Relación directa entre frecuencia absoluta, relativa y tamaño muestral.",
                admissionTip = "Para reconstruir una tabla con huecos: f_i = n · h_i. Si conoces un f_i y su h_i correspondiente, ¡puedes hallar el total n inmediatamente dividiendo n = f_i / h_i!",
                admissionExplanation = "• En la última fila, siempre se cumple que F_k = n y H_k = 1."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una tabla de frecuencias incompleta sobre las edades de postulantes a la UNSA, se sabe que para la segunda clase la frecuencia absoluta es f₂ = 45 y su frecuencia relativa correspondiente es h₂ = 0.15. ¿Cuál es el tamaño total de la muestra (n)?",
                    options = listOf(
                        "250",
                        "300",
                        "350",
                        "400",
                        "200"
                    ),
                    correctIndex = 1,
                    explanation = "Sabemos que la frecuencia relativa se define como: h_i = f_i / n.\nDespejando el tamaño muestral n:\nn = f₂ / h₂ = 45 / 0.15 = 45 / (15/100) = (45 × 100) / 15 = 3 × 100 = 300 postulantes.",
                    subject = "Raz. Matemático",
                    semana = 7
                ),
                Challenge(
                    id = "q_rm_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si en una distribución estadística de frecuencias se tienen cuatro categorías con frecuencias relativas h₁ = 0.20, h₂ = 0.35 y h₃ = 0.25, ¿cuál es el porcentaje que representa la cuarta categoría (h₄%)?",
                    options = listOf(
                        "15%",
                        "20%",
                        "25%",
                        "10%",
                        "30%"
                    ),
                    correctIndex = 1,
                    explanation = "La suma de todas las frecuencias relativas debe ser exactamente 1 (o 100%):\nh₁ + h₂ + h₃ + h₄ = 1\n0.20 + 0.35 + 0.25 + h₄ = 1\n0.80 + h₄ = 1 => h₄ = 0.20.\nEn porcentaje: 0.20 × 100% = 20%.",
                    subject = "Raz. Matemático",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rm_t07_s02",
            subjectId = "raz_matematico",
            semana = 7,
            subtema = "7.2 Representación Gráfica: Diagramas de Barras, Histogramas y Diagramas Circulares (Sectores)",
            title = "Gráficos Estadísticos: Barras, Histogramas y Sectores Circulares",
            theory = LessonTheory(
                id = "th_rm_t07_s02",
                asignatura = "Raz. Matemático",
                semana = 7,
                titulo = "Lectura e Interpretación de Gráficos Estadísticos",
                resumen = "• Tipología Gráfica Oficial en Admisión:\n  1. **Diagrama de Barras:**\n     - Para variables cualitativas o cuantitativas discretas. Las barras van separadas; su altura es proporcional a la frecuencia absoluta.\n  2. **Histograma y Polígono de Frecuencias:**\n     - Para variables cuantitativas continuas agrupadas en intervalos de clase. Las barras van pegadas (unidas).\n     - El polígono de frecuencias se obtiene uniendo los puntos medios superiores (marcas de clase x_i) de cada barra.\n  3. **Diagrama Circular o de Sectores (Gráfico de Pastel):**\n     - El círculo completo representa el 100% de la muestra (n) y mide 360° sexagesimales.\n     - Fórmula de conversión entre ángulo central (θ_i) y frecuencia:\n       θ_i = h_i · 360° = (f_i / n) · 360°\n     - Relación básica de regla de tres:\n       360° <-> 100%  =>  3.6° <-> 1%.",
                conceptosClave = listOf(
                    "Diagrama de sectores: 360° equivale al 100% del total",
                    "Regla de conversión: 1% equivale a 3.6° sexagesimales",
                    "Cálculo del ángulo del sector: θ = (f / n) * 360°",
                    "Histogramas: Barras continuas para variables cuantitativas continuas"
                ),
                formulas = listOf(
                    "\\theta_i = h_i \\cdot 360^\\circ = \\left( \\frac{f_i}{n} \\right) 360^\\circ",
                    "1\\% = 3.6^\\circ \\quad \\land \\quad 10\\% = 36^\\circ"
                ),
                formulaName = "Fórmula de Proporcionalidad Angular Circular",
                formulaLatex = "\\theta_i = \\frac{f_i}{n} \\cdot 360^\\circ \\iff f_i = n \\left( \\frac{\\theta_i}{360^\\circ} \\right)",
                formulaDescription = "Transformación directa de frecuencias a sectores angulares en diagramas circulares.",
                admissionTip = "Mnemotecnia veloz para sectores circulares: Divide los grados entre 3.6 para obtener el porcentaje instantáneo. Ej: 72° / 3.6 = 20%.",
                admissionExplanation = "• Un ángulo recto (90°) representa siempre exactamente el 25% (un cuarto del total)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un gráfico circular que representa las preferencias de carrera de 1200 postulantes de la UNSA, el sector correspondiente a Ingeniería de Sistemas tiene un ángulo central de 54°. ¿Cuántos postulantes prefieren dicha carrera?",
                    options = listOf(
                        "150",
                        "160",
                        "180",
                        "200",
                        "220"
                    ),
                    correctIndex = 2,
                    explanation = "1. El total de postulantes es n = 1200, que corresponde a los 360° del círculo.\n2. Planteamos la proporción directa:\n   360° -------- 1200\n    54° -------- x\n   x = (54 × 1200) / 360 = (54 × 10) / 3 = 18 × 10 = 180 postulantes.",
                    subject = "Raz. Matemático",
                    semana = 7
                ),
                Challenge(
                    id = "q_rm_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si en un diagrama de sectores circulares una categoría abarca un sector con un ángulo de 108°, ¿qué porcentaje del total de la muestra representa dicha categoría?",
                    options = listOf(
                        "25%",
                        "30%",
                        "35%",
                        "40%",
                        "28%"
                    ),
                    correctIndex = 1,
                    explanation = "Sabemos que 360° corresponde al 100%:\nPorcentaje = (108° / 360°) × 100% = (3 / 10) × 100% = 30%.\n(O usando la regla rápida: 108 / 3.6 = 30%).",
                    subject = "Raz. Matemático",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rm_t07_s03",
            subjectId = "raz_matematico",
            semana = 7,
            subtema = "7.3 Medidas de Tendencia Central: Media Aritmética (Simple y Ponderada), Mediana y Moda",
            title = "Medidas de Tendencia Central: Media, Mediana y Moda",
            theory = LessonTheory(
                id = "th_rm_t07_s03",
                asignatura = "Raz. Matemático",
                semana = 7,
                titulo = "Estadígrafos Centrales Fundamentales",
                resumen = "• 1. Media Aritmética (x̄ - Promedio):\n  - Para datos simples: x̄ = (∑ x_i) / n.\n  - Promedio Ponderado (con pesos o créditos w_i):\n    x̄_p = (∑ x_i · w_i) / (∑ w_i).\n  - Muy sensible a valores extremos atípicos (outliers).\n\n• 2. Mediana (Me):\n  - Es el valor que ocupa la posición central exacta cuando los datos están estrictamente ORDENADOS de menor a mayor (divide la distribución en dos mitades del 50%).\n  - Si n es impar: Me es el dato de la posición (n + 1) / 2.\n  - Si n es par: Me es la semisuma (promedio) de los dos datos centrales.\n  - Es robusta: NO se altera por valores extremos atípicos.\n\n• 3. Moda (Mo):\n  - Es el valor que tiene la MAYOR FRECUENCIA absoluta (el dato que más se repite).\n  - Puede ser unimodal (una sola moda), bimodal (dos modas) o amodal (ningún dato se repite más que los otros).",
                conceptosClave = listOf(
                    "Media aritmética: Centro de gravedad sensible a valores extremos",
                    "Promedio ponderado: Ponderación por créditos o pesos (∑ x·w / ∑ w)",
                    "Mediana: Punto del 50% en datos ordenados (robusta ante outliers)",
                    "Moda: Valor de máxima frecuencia absoluta"
                ),
                formulas = listOf(
                    "\\bar{x} = \\frac{\\sum_{i=1}^n x_i}{n}",
                    "\\bar{x}_p = \\frac{\\sum x_i w_i}{\\sum w_i}",
                    "Me = \\begin{cases} x_{(n+1)/2} & \\text{si } n \\text{ es impar} \\\\ \\frac{x_{n/2} + x_{n/2 + 1}}{2} & \\text{si } n \\text{ es par} \\end{cases}"
                ),
                formulaName = "Fórmulas de las Medidas de Tendencia Central",
                formulaLatex = "\\bar{x} = \\frac{1}{n}\\sum_{i=1}^n x_i \\quad \\land \\quad Me = x_{50\\%}",
                formulaDescription = "Cálculo analítico del promedio aritmético y del percentil 50.",
                admissionTip = "¡No olvides ORDENAR los datos de menor a mayor antes de buscar la mediana! Si no los ordenas, el 100% de las veces marcarás una respuesta equivocada.",
                admissionExplanation = "• Si te preguntan: '¿Qué medida representa mejor los ingresos de una población con extrema desigualdad?', responde siempre la MEDIANA, ya que la media se distorsiona con multimillonarios."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dadas las siguientes calificaciones de un estudiante en 8 prácticas calificadas de matemática: 14, 18, 12, 16, 20, 14, 15, 17. ¿Cuál es el valor de la MEDIANA?",
                    options = listOf(
                        "15.0",
                        "15.5",
                        "16.0",
                        "14.5",
                        "16.5"
                    ),
                    correctIndex = 1,
                    explanation = "1. Ordenamos estrictamente los 8 datos de menor a mayor:\n   12, 14, 14, [15, 16], 17, 18, 20.\n2. Al ser n = 8 (número par), la mediana es el promedio aritmético de los dos términos centrales (posiciones 4 y 5):\n   Me = (15 + 16) / 2 = 31 / 2 = 15.5.",
                    subject = "Raz. Matemático",
                    semana = 7
                ),
                Challenge(
                    id = "q_rm_t07_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un estudiante de la UNSA matriculado en tres asignaturas obtuvo las siguientes notas: Cálculo (nota: 14; 4 créditos), Física (nota: 16; 3 créditos) y Química (nota: 12; 3 créditos). ¿Cuál es su promedio ponderado semestral?",
                    options = listOf(
                        "13.8",
                        "14.0",
                        "14.2",
                        "14.5",
                        "13.5"
                    ),
                    correctIndex = 1,
                    explanation = "Calculamos el promedio ponderado sumando los productos de nota por créditos y dividiendo entre la suma total de créditos:\nTotal créditos = 4 + 3 + 3 = 10.\nSuma ponderada = (14 × 4) + (16 × 3) + (12 × 3) = 56 + 48 + 36 = 140.\nPromedio ponderado = 140 / 10 = 14.0.",
                    subject = "Raz. Matemático",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rm_t07_s04",
            subjectId = "raz_matematico",
            semana = 7,
            subtema = "7.4 Medidas de Dispersión y Posición: Rango, Varianza, Desviación Estándar y Cuartiles",
            title = "Medidas de Dispersión y Posición (Varianza, Desviación Estándar)",
            theory = LessonTheory(
                id = "th_rm_t07_s04",
                asignatura = "Raz. Matemático",
                semana = 7,
                titulo = "Dispersión, Variabilidad y Cuartiles",
                resumen = "• 1. Rango o Recorrido (R):\n  - R = X_max - X_min.\n  - Medida elemental de amplitud de la distribución.\n\n• 2. Varianza (σ² ó s²):\n  - Mide el promedio de las diferencias al cuadrado de cada dato respecto a la media aritmética:\n    s² = ∑ (x_i - x̄)² / n.\n  - Sus unidades están elevadas al cuadrado (ej. soles², puntos²).\n\n• 3. Desviación Estándar (σ ó s):\n  - Es la raíz cuadrada positiva de la varianza: s = √(s²).\n  - Expresa la dispersión en las MISMAS unidades originales de la variable.\n  - Interpretación: A menor desviación estándar, los datos están más concentrados cerca del promedio (grupo más homogéneo y consistente).\n\n• 4. Coeficiente de Variación (CV):\n  - CV = (s / x̄) · 100% (Mide homogeneidad relativa).\n\n• 5. Cuartiles (Q_1, Q_2, Q_3):\n  - Q_1 = 25% inferior; Q_2 = 50% (Mediana); Q_3 = 75% inferior.",
                conceptosClave = listOf(
                    "Rango: Amplitud total (Dato mayor - Dato menor)",
                    "Varianza s²: Promedio de desvíos cuadráticos respecto a la media",
                    "Desviación estándar s = √(Varianza): Misma unidad que los datos",
                    "Homogeneidad: Menor desviación estándar implica mayor consistencia de rendimiento"
                ),
                formulas = listOf(
                    "R = X_{\\max} - X_{\\min}",
                    "s^2 = \\frac{\\sum_{i=1}^n (x_i - \\bar{x})^2}{n}",
                    "s = \\sqrt{s^2}",
                    "CV = \\frac{s}{\\bar{x}} \\times 100\\%"
                ),
                formulaName = "Fórmulas de Dispersión Muestral",
                formulaLatex = "s = \\sqrt{\\frac{1}{n}\\sum_{i=1}^n (x_i - \\bar{x})^2}",
                formulaDescription = "Desviación estándar como índice fundamental de dispersión empírica.",
                admissionTip = "En preguntas conceptuales de la UNSA: 'Si dos salones tienen el mismo promedio de 15, ¿cuál salón es más regular y homogéneo?'. Respuesta: Aquel que tenga la MENOR desviación estándar.",
                admissionExplanation = "• Si a todos los datos se les suma una constante k, la desviación estándar NO cambia (sigue siendo la misma)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rm_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se tienen los siguientes 5 datos muestrales: 8, 10, 12, 14, 16. Calcule el valor exacto de la varianza poblacional (σ²):",
                    options = listOf(
                        "6",
                        "8",
                        "10",
                        "12",
                        "16"
                    ),
                    correctIndex = 1,
                    explanation = "1. Calculamos la media x̄: (8 + 10 + 12 + 14 + 16) / 5 = 60 / 5 = 12.\n2. Calculamos las diferencias al cuadrado respecto a la media (x_i - x̄)²:\n   (8 - 12)² = (-4)² = 16\n   (10 - 12)² = (-2)² = 4\n   (12 - 12)² = 0² = 0\n   (14 - 12)² = 2² = 4\n   (16 - 12)² = 4² = 16\n3. Suma de cuadrados = 16 + 4 + 0 + 4 + 16 = 40.\n4. Varianza σ² = 40 / 5 = 8.",
                    subject = "Raz. Matemático",
                    semana = 7
                ),
                Challenge(
                    id = "q_rm_t07_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos postulantes, Alberto y Benito, obtuvieron el mismo promedio de 16 en sus simulacros de admisión. Sin embargo, la desviación estándar de las notas de Alberto fue s = 1.2 y la de Benito fue s = 3.5. ¿Qué conclusión estadística se deriva legítimamente?",
                    options = listOf(
                        "Benito tiene un rendimiento más homogéneo y predecible que Alberto.",
                        "Alberto tiene un rendimiento significativamente más regular, homogéneo y consistente que Benito.",
                        "Alberto obtuvo puntajes más dispersos y erráticos.",
                        "Benito ingresará con mayor puntaje que Alberto con certeza.",
                        "Ambos postulantes tienen exactamente el mismo desempeño en todas las pruebas."
                    ),
                    correctIndex = 1,
                    explanation = "La desviación estándar mide la dispersión de las notas respecto a la media. Una menor desviación estándar (1.2 frente a 3.5) indica que las notas de Alberto están mucho más concentradas y próximas a su promedio, demostrando un rendimiento académico más regular, homogéneo y consistente.",
                    subject = "Raz. Matemático",
                    semana = 7
                )
            )
        )
    )
}
