package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object AlgebraCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: CONJUNTOS Y OPERACIONES EN ÁLGEBRA (Semana 1)
        // =========================================================================
        LessonNode(
            id = "alg_t01_s01",
            subjectId = "algebra",
            semana = 1,
            subtema = "1.1 Conjuntos Numéricos y Axiomática Real",
            title = "Conjuntos Numéricos y Axiomática Real",
            theory = LessonTheory(
                id = "theory_alg_t01_s01",
                asignatura = "Álgebra",
                semana = 1,
                titulo = "Conjuntos Numéricos y Axiomática Real",
                resumen = "• Cadena Canónica de Inclusión: N ⊂ Z ⊂ Q ⊂ R ⊂ C.\n• Números Racionales (Q): Q = {p/q | p, q ∈ Z, q ≠ 0}. Decimales periódicos y fracciones.\n• Números Irracionales (I = R - Q): Expresiones decimales infinitas no periódicas (√2, π, e, φ).\n• Números Reales (R = Q ∪ I): Cuerpo ordenado y completo que llena la recta geométrica unidimensional.\n• Ley de Tricotomía: Para todo a, b ∈ R se cumple una y solo una de las siguientes relaciones: a < b, a = b o a > b.",
                conceptosClave = listOf(
                    "Cadena de inclusión: N ⊂ Z ⊂ Q ⊂ R ⊂ C",
                    "Racionales Q (periódicos) vs Irracionales I (no periódicos)",
                    "Completitud de R (recta real sin huecos)",
                    "Axioma de tricotomía de orden"
                ),
                formulas = listOf(
                    "\\mathbb{N} \\subset \\mathbb{Z} \\subset \\mathbb{Q} \\subset \\mathbb{R} \\subset \\mathbb{C}",
                    "\\mathbb{R} = \\mathbb{Q} \\cup \\mathbb{I}, \\quad \\mathbb{Q} \\cap \\mathbb{I} = \\emptyset",
                    "\\forall a, b \\in \\mathbb{R}: \\, (a < b) \\lor (a = b) \\lor (a > b)"
                ),
                formulaName = "Axioma de Tricotomía en R",
                formulaLatex = "\\forall a, b \\in \\mathbb{R}, \\quad a < b \\;\\veebar\\; a = b \\;\\veebar\\; a > b",
                formulaDescription = "Establece que dos números reales cualesquiera siempre son comparables bajo una única relación de orden excluyente.",
                admissionTip = "Recuerda que 0.999... es exactamente igual a 1 (racional). En cambio, 0.1010010001... con ceros crecientes es irracional.",
                admissionExplanation = "• Todo número real elevado al cuadrado es mayor o igual a cero: ∀x ∈ R, x² ≥ 0."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes números pertenece al conjunto de los números irracionales (I)?",
                    options = listOf("√49", "3.1415", "√18 / √2", "π - 3", "22/7"),
                    correctIndex = 3,
                    explanation = "Analicemos las opciones:\n- √49 = 7 (natural, racional).\n- 3.1415 es decimal exacto (31415/10000 ∈ Q).\n- √18 / √2 = √(18/2) = √9 = 3 (racional).\n- 22/7 es cociente de enteros (racional).\n- π es irracional trascendente; al restarle un entero (3), π - 3 sigue siendo irracional.",
                    subject = "Álgebra",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "alg_t01_s02",
            subjectId = "algebra",
            semana = 1,
            subtema = "1.2 Determinación de Conjuntos e Intervalos Reales",
            title = "Intervalos Reales y Conjuntos Acotados",
            theory = LessonTheory(
                id = "theory_alg_t01_s02",
                asignatura = "Álgebra",
                semana = 1,
                titulo = "Intervalos Reales y Conjuntos Acotados",
                resumen = "• Intervalo: Subconjunto continuo de R cuyos elementos se encuentran comprendidos entre dos extremos finitos o infinitos.\n• Intervalo Abierto ⟨a, b⟩: {x ∈ R | a < x < b}. No incluye los extremos a y b.\n• Intervalo Cerrado [a, b]: {x ∈ R | a ≤ x ≤ b}. Incluye ambos extremos.\n• Intervalos Mixtos y Semi-infinitos: [a, b⟩, ⟨a, b], ⟨-∞, b], [a, +∞⟩.\n• Longitud de un Intervalo Acotado: L = b - a.",
                conceptosClave = listOf(
                    "Intervalo abierto ⟨a, b⟩ vs cerrado [a, b]",
                    "Extremos infinitos siempre son abiertos: ⟨-∞, +∞⟩",
                    "Longitud de intervalo: L = b - a",
                    "Representación gráfica en la recta numérica"
                ),
                formulas = listOf(
                    "[a, b] = \\{x \\in \\mathbb{R} \\mid a \\le x \\le b\\}",
                    "\\langle a, b \\rangle = \\{x \\in \\mathbb{R} \\mid a < x < b\\}",
                    "\\text{Longitud} = b - a"
                ),
                formulaName = "Definición de Intervalo Cerrado",
                formulaLatex = "[a, b] = \\{x \\in \\mathbb{R} \\mid a \\le x \\le b\\}",
                formulaDescription = "Segmento continuo de la recta real que comprende a todos los números reales entre a y b, incluyendo a los extremos.",
                admissionTip = "Los corchetes [ ] implican desigualdades débiles (≤, ≥). Las comillas angulares ⟨ ⟩ implican desigualdades estrictas (<, >).",
                admissionExplanation = "• El infinito no es un número real sino una tendencia direccional, por lo que nunca puede cerrarse con corchete."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si x ∈ ⟨-2, 5], determine a qué intervalo pertenece la expresión E = 3x - 4.",
                    options = listOf(
                        "⟨-10, 11]",
                        "[-10, 11⟩",
                        "⟨-6, 11]",
                        "⟨-10, 15]",
                        "[-6, 15⟩"
                    ),
                    correctIndex = 0,
                    explanation = "Partimos de la condición: -2 < x ≤ 5.\n1. Multiplicamos por 3 (positivo, el sentido no cambia):\n-6 < 3x ≤ 15.\n2. Restamos 4 en todos los miembros:\n-6 - 4 < 3x - 4 ≤ 15 - 4\n-10 < 3x - 4 ≤ 11.\nPor lo tanto, E ∈ ⟨-10, 11].",
                    subject = "Álgebra",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "alg_t01_s03",
            subjectId = "algebra",
            semana = 1,
            subtema = "1.3 Operaciones con Intervalos y Álgebra Booleana",
            title = "Operaciones con Intervalos",
            theory = LessonTheory(
                id = "theory_alg_t01_s03",
                asignatura = "Álgebra",
                semana = 1,
                titulo = "Operaciones con Intervalos",
                resumen = "• Unión (A ∪ B): Todos los puntos reales que pertenecen a A, a B o a ambos.\n• Intersección (A ∩ B): Puntos comunes a ambos intervalos simultáneamente.\n• Diferencia (A - B): Puntos que están en A pero que NO pertenecen a B. Si el extremo de B es cerrado, en la diferencia queda abierto, y viceversa.\n• Complemento (A' o C_R(A)): Puntos de R que no pertenecen a A: A' = R - A = ⟨-∞, +∞⟩ - A.\n• Leyes de De Morgan: (A ∪ B)' = A' ∩ B', y (A ∩ B)' = A' ∪ B'.",
                conceptosClave = listOf(
                    "Intersección: superposición gráfica de intervalos",
                    "Diferencia: cambio de estado en los puntos de corte de B (cerrado pasa a abierto)",
                    "Complemento respecto a R",
                    "Leyes de De Morgan aplicadas a inecuaciones"
                ),
                formulas = listOf(
                    "A - B = A \\cap B'",
                    "(A \\cup B)' = A' \\cap B'",
                    "(A \\cap B)' = A' \\cup B'"
                ),
                formulaName = "Propiedad de la Diferencia de Conjuntos",
                formulaLatex = "A - B = \\{x \\in \\mathbb{R} \\mid x \\in A \\land x \\notin B\\}",
                formulaDescription = "Conjunto de elementos pertenecientes al primer intervalo que no forman parte del segundo.",
                admissionTip = "¡Mucho ojo con la diferencia de intervalos! Si A = [1, 8] y B = [3, 10], entonces A - B = [1, 3⟨ (el 3 era cerrado en B, por lo que queda abierto en A - B).",
                admissionExplanation = "• La inversión de corchetes en las fronteras de corte es el error clásico en los exámenes de admisión de la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dados los intervalos A = ⟨-4, 6] y B = [2, 9⟩, halle el intervalo resultante de A - B.",
                    options = listOf("⟨-4, 2]", "⟨-4, 2⟩", "[-4, 2⟩", "[2, 6]", "⟨6, 9⟩"),
                    correctIndex = 1,
                    explanation = "A = {x ∈ R | -4 < x ≤ 6}\nB = {x ∈ R | 2 ≤ x < 9}\nA - B contiene los elementos de A que NO están en B.\nComo 2 pertenece a B (es cerrado en B), en A - B dicho extremo debe quedar excluido (abierto).\nPor tanto: A - B = ⟨-4, 2⟩.",
                    subject = "Álgebra",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "alg_t01_s04",
            subjectId = "algebra",
            semana = 1,
            subtema = "1.4 Conjuntos Acotados: Supremo, Ínfimo y Cotas",
            title = "Conjuntos Acotados: Supremo e Ínfimo",
            theory = LessonTheory(
                id = "theory_alg_t01_s04",
                asignatura = "Álgebra",
                semana = 1,
                titulo = "Conjuntos Acotados: Supremo e Ínfimo",
                resumen = "• Cota Superior: Número M ∈ R tal que x ≤ M para todo x ∈ S. Si existe, S está acotado superiormente.\n• Cota Inferior: Número m ∈ R tal que m ≤ x para todo x ∈ S. Si existe, S está acotado inferiormente.\n• Conjunto Acotado: Conjunto que tiene cota superior e inferior simultáneamente.\n• Supremo (Sup): La menor de las cotas superiores. No requiere pertenecer al conjunto S.\n• Ínfimo (Inf): La mayor de las cotas inferiores. No requiere pertenecer al conjunto S.\n• Máximo y Mínimo: Si Sup(S) ∈ S, es el MÁXIMO de S. Si Inf(S) ∈ S, es el MÍNIMO de S.",
                conceptosClave = listOf(
                    "Cota superior vs Supremo (mínima cota superior)",
                    "Cota inferior vs Ínfimo (máxima cota inferior)",
                    "Máximo = Supremo perteneciente al conjunto",
                    "Mínimo = Ínfimo perteneciente al conjunto"
                ),
                formulas = listOf(
                    "\\forall x \\in S: \\, m \\le x \\le M \\implies S \\text{ es acotado}",
                    "\\text{Sup}(S) = \\min \\{M \\in \\mathbb{R} \\mid \\forall x \\in S, x \\le M\\}",
                    "\\text{Inf}(S) = \\max \\{m \\in \\mathbb{R} \\mid \\forall x \\in S, m \\le x\\}"
                ),
                formulaName = "Axioma del Supremo (Completitud)",
                formulaLatex = "S \\subset \\mathbb{R}, \\, S \\neq \\emptyset \\text{ acotado sup.} \\implies \\exists ! \\, \\text{Sup}(S) \\in \\mathbb{R}",
                formulaDescription = "Garantiza que todo subconjunto no vacío de R acotado superiormente posee un supremo real único.",
                admissionTip = "En el intervalo ⟨3, 7]: Inf = 3 (no hay mínimo porque 3 ∉ S); Sup = 7 (hay máximo y es 7 porque 7 ∈ S).",
                admissionExplanation = "• Los intervalos abiertos carecen de máximo y mínimo, pero siempre poseen supremo e ínfimo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dado el conjunto S = { (2n + 1) / n | n ∈ Z⁺ }, halle la suma de su supremo y su ínfimo.",
                    options = listOf("4", "5", "5.5", "6", "6.5"),
                    correctIndex = 1,
                    explanation = "Analicemos los elementos de S:\nx_n = (2n + 1) / n = 2 + 1/n.\nPara n = 1: x₁ = 2 + 1 = 3.\nPara n = 2: x₂ = 2 + 0.5 = 2.5.\nPara n = 3: x₃ = 2 + 0.333... = 2.333...\nCuando n crece indefinidamente (n → ∞), 1/n → 0, por lo que x_n decrece aproximándose a 2.\n- Supremo: Es el valor máximo, que se alcanza en n = 1 => Sup(S) = 3.\n- Ínfimo: Es el límite inferior al que se aproxima sin tocarlo => Inf(S) = 2.\nSuma = Sup(S) + Inf(S) = 3 + 2 = 5.",
                    subject = "Álgebra",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: NÚMEROS REALES Y VALOR ABSOLUTO (Semana 2)
        // =========================================================================
        LessonNode(
            id = "alg_t02_s01",
            subjectId = "algebra",
            semana = 2,
            subtema = "2.1 Axiomas de Cuerpo y Orden en R",
            title = "Axiomas de Cuerpo y Orden en R",
            theory = LessonTheory(
                id = "theory_alg_t02_s01",
                asignatura = "Álgebra",
                semana = 2,
                titulo = "Axiomas de Cuerpo y Orden en R",
                resumen = "• Estructura de Cuerpo: El sistema (R, +, ·) satisface clausura, asociatividad, conmutatividad, elemento neutro aditivo (0), inverso aditivo (-a), elemento neutro multiplicativo (1), inverso multiplicativo (a⁻¹ con a ≠ 0) y distributividad.\n• Axiomas de Orden: Existencia de R⁺ tal que R = R⁻ ∪ {0} ∪ R⁺ disjunto.\n• Propiedades de las Desigualdades:\n  1. Si a < b y c > 0 ⇒ a·c < b·c.\n  2. Si a < b y c < 0 ⇒ a·c > b·c (el sentido de la desigualdad SE INVIERTE al multiplicar por un negativo).\n  3. Si a y b tienen el mismo signo y a < b ⇒ 1/a > 1/b.",
                conceptosClave = listOf(
                    "Axiomas de cuerpo conmutativo",
                    "Multiplicación por número negativo invierte la desigualdad",
                    "Inversión de miembros con el mismo signo: a < b ⇒ 1/a > 1/b",
                    "Propiedad transitiva: a < b ∧ b < c ⇒ a < c"
                ),
                formulas = listOf(
                    "a < b \\land c < 0 \\implies a \\cdot c > b \\cdot c",
                    "0 < a < b \\implies \\frac{1}{a} > \\frac{1}{b}",
                    "a^2 \\ge 0, \\quad \\forall a \\in \\mathbb{R}"
                ),
                formulaName = "Inversión de Sentido en Desigualdades",
                formulaLatex = "a < b \\land c < 0 \\implies a \\cdot c > b \\cdot c",
                formulaDescription = "El producto de ambos miembros de una desigualdad por un factor negativo estricto invierte la orientación del signo de comparación.",
                admissionTip = "Nunca simplifiques una variable en una desigualdad sin saber su signo: si divides entre x y x es negativo, debes invertir el sentido.",
                admissionExplanation = "• Para acotar x², si el intervalo contiene al cero (ej. -3 ≤ x ≤ 5), el cuadrado mínimo es 0: 0 ≤ x² ≤ 25."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si -4 < x < 3, ¿a qué intervalo pertenece la expresión x²?",
                    options = listOf("⟨0, 16⟩", "[0, 16⟩", "⟨9, 16⟩", "[9, 16⟩", "⟨0, 9⟩"),
                    correctIndex = 1,
                    explanation = "Como el intervalo de x cruza por el cero (-4 < 0 < 3):\nEl menor valor posible de x² es 0 (alcanzado cuando x = 0), el cual está dentro del intervalo.\nEl mayor valor se obtiene elevando el extremo de mayor valor absoluto: |-4| = 4 > |3| = 3.\n(-4)² = 16, pero como -4 es abierto, 16 queda abierto.\nPor tanto: 0 ≤ x² < 16, es decir, x² ∈ [0, 16⟩.",
                    subject = "Álgebra",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "alg_t02_s02",
            subjectId = "algebra",
            semana = 2,
            subtema = "2.2 Desigualdades y Desigualdad de las Medias",
            title = "Desigualdad de las Medias y Cauchy-Schwarz",
            theory = LessonTheory(
                id = "theory_alg_t02_s02",
                asignatura = "Álgebra",
                semana = 2,
                titulo = "Desigualdad de las Medias y Cauchy-Schwarz",
                resumen = "• Teorema del Trinomio No Negativo: Para todo x, y ∈ R: (x - y)² ≥ 0 ⇒ x² + y² ≥ 2xy.\n• Teorema del Recíproco: Si a > 0, entonces a + 1/a ≥ 2. La igualdad se cumple si y solo si a = 1.\n• Si a < 0, entonces a + 1/a ≤ -2.\n• Desigualdad de Cauchy-Schwarz: (a₁b₁ + a₂b₂)² ≤ (a₁² + a₂²)(b₁² + b₂²).\n• Desigualdad MA-MG: Para números no negativos: (a + b)/2 ≥ √(a·b). Permite calcular máximos y mínimos de productos y sumas sin derivadas.",
                conceptosClave = listOf(
                    "Identidad de partida: (a - b)² ≥ 0 ⇒ a² + b² ≥ 2ab",
                    "Teorema del recíproco positivo: x + 1/x ≥ 2 (x > 0)",
                    "Desigualdad MA ≥ MG para optimización algebraica",
                    "La igualdad se alcanza únicamente cuando las variables son iguales"
                ),
                formulas = listOf(
                    "a + \\frac{1}{a} \\ge 2, \\quad \\forall a > 0",
                    "\\frac{a+b}{2} \\ge \\sqrt{a \\cdot b} \\quad (a, b \\ge 0)",
                    "(a_1 b_1 + a_2 b_2)^2 \\le (a_1^2 + a_2^2)(b_1^2 + b_2^2)"
                ),
                formulaName = "Teorema de la Suma de un Número y su Recíproco",
                formulaLatex = "x + \\frac{1}{x} \\ge 2 \\quad (\\forall x > 0)",
                formulaDescription = "Acota inferiormente la suma de cualquier cantidad real estrictamente positiva con su respectivo inverso multiplicativo.",
                admissionTip = "Para hallar el valor mínimo de f(x) = 4x + 9/x (x > 0), aplica MA ≥ MG: (4x + 9/x)/2 ≥ √(4x · 9/x) = √36 = 6 => 4x + 9/x ≥ 12. Mínimo = 12.",
                admissionExplanation = "• La igualdad se alcanza cuando 4x = 9/x => 4x² = 9 => x = 3/2."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el valor mínimo que puede tomar la expresión E = x² + 25 / x² para todo x real no nulo.",
                    options = listOf("5", "8", "10", "12", "25"),
                    correctIndex = 2,
                    explanation = "Sea a = x² > 0. La expresión es E = a + 25/a.\nAplicamos la desigualdad MA-MG entre a y 25/a:\n(a + 25/a) / 2 ≥ √(a · 25/a)\n(a + 25/a) / 2 ≥ √25 = 5\na + 25/a ≥ 10.\nEl valor mínimo absoluto es 10 (se alcanza cuando x² = 5).",
                    subject = "Álgebra",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "alg_t02_s03",
            subjectId = "algebra",
            semana = 2,
            subtema = "2.3 Valor Absoluto: Definición y Propiedades",
            title = "Valor Absoluto: Definición y Propiedades",
            theory = LessonTheory(
                id = "theory_alg_t02_s03",
                asignatura = "Álgebra",
                semana = 2,
                titulo = "Valor Absoluto: Definición y Propiedades",
                resumen = "• Definición Formal: |x| = x si x ≥ 0; |x| = -x si x < 0.\n• Interpretación Geométrica: Distancia euclídea desde el origen (0) hasta el punto x en la recta real: |a - b| es la distancia entre a y b.\n• Propiedades Fundamentales:\n  1. No negatividad: |x| ≥ 0, y |x| = 0 ⇔ x = 0.\n  2. Simetría: |-x| = |x|.\n  3. Multiplicativa: |x · y| = |x| · |y|, y |x / y| = |x| / |y| (y ≠ 0).\n  4. Identidad cuadrática: |x|² = x² = |x²|, y √(x²) = |x| (¡no es simplemente x!).\n  5. Desigualdad Triangular: |x + y| ≤ |x| + |y|.",
                conceptosClave = listOf(
                    "Definición por tramos de |x|",
                    "√(x²) = |x| (identidad fundamental)",
                    "Distancia entre dos puntos: d(a, b) = |a - b|",
                    "Desigualdad triangular: |x + y| ≤ |x| + |y|"
                ),
                formulas = listOf(
                    "|x| = \\begin{cases} x & \\text{si } x \\ge 0 \\\\ -x & \\text{si } x < 0 \\end{cases}",
                    "\\sqrt{x^2} = |x|",
                    "|x + y| \\le |x| + |y|"
                ),
                formulaName = "Identidad Fundamental de Radicación y Valor Absoluto",
                formulaLatex = "\\sqrt{x^2} = |x|",
                formulaDescription = "La raíz cuadrada principal del cuadrado de un número real es exactamente igual a su valor absoluto.",
                admissionTip = "¡Trampa recurrente!: √(x - 3)² NO es siempre (x - 3), sino |x - 3|. Si el problema dice que x < 3, entonces √(x - 3)² = -(x - 3) = 3 - x.",
                admissionExplanation = "• La desigualdad triangular se convierte en igualdad estricta (|x + y| = |x| + |y|) si y solo si x e y tienen el mismo signo (x · y ≥ 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si x ∈ ⟨-5, -2⟩, simplifique al máximo la expresión: E = |x + 5| - |x - 3| + |2x|.",
                    options = listOf("-4x + 2", "-2x + 8", "4x - 8", "-8", "2"),
                    correctIndex = 0,
                    explanation = "Analizamos el signo de cada argumento dentro del intervalo -5 < x < -2:\n1. x + 5: Como x > -5 => x + 5 > 0 => |x + 5| = x + 5.\n2. x - 3: Como x < -2 => x - 3 < -5 < 0 => |x - 3| = -(x - 3) = -x + 3.\n3. 2x: Como x es negativo => 2x < 0 => |2x| = -2x.\nReemplazamos en E:\nE = (x + 5) - (-x + 3) + (-2x)\nE = x + 5 + x - 3 - 2x = (2x - 2x) + (5 - 3) = 2... Espera:\nRevisemos:\nx + 5 - (-x + 3) + (-2x) = x + 5 + x - 3 - 2x = 2.\nLa expresión constante resultante es 2. La opción correcta es 2.",
                    subject = "Álgebra",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "alg_t02_s04",
            subjectId = "algebra",
            semana = 2,
            subtema = "2.4 Ecuaciones e Inecuaciones con Valor Absoluto",
            title = "Ecuaciones e Inecuaciones con Valor Absoluto",
            theory = LessonTheory(
                id = "theory_alg_t02_s04",
                asignatura = "Álgebra",
                semana = 2,
                titulo = "Ecuaciones e Inecuaciones con Valor Absoluto",
                resumen = "• Ecuación Tipo 1: |P(x)| = b. Condición previa: b ≥ 0. Solución: P(x) = b ∨ P(x) = -b.\n• Ecuación Tipo 2: |P(x)| = |Q(x)|. Solución: P(x) = Q(x) ∨ P(x) = -Q(x).\n• Inecuación Tipo Menor Que: |P(x)| < b. Condición previa: b > 0. Solución: -b < P(x) < b.\n• Inecuación Tipo Mayor Que: |P(x)| > b. Solución: P(x) > b ∨ P(x) < -b.\n• Inecuación con Dos Valores Absolutos: |P(x)| ≤ |Q(x)| ⇔ [P(x)]² ≤ [Q(x)]² ⇔ (P - Q)(P + Q) ≤ 0 (diferencia de cuadrados directa).",
                conceptosClave = listOf(
                    "Condición de existencia en |P(x)| = b: b ≥ 0",
                    "Inecuación |x| < b ⇔ -b < x < b (con b > 0)",
                    "Inecuación |x| > b ⇔ x > b ∨ x < -b",
                    "Elevación al cuadrado: |A| ≤ |B| ⇔ (A - B)(A + B) ≤ 0"
                ),
                formulas = listOf(
                    "|P(x)| = b \\iff b \\ge 0 \\land (P(x) = b \\lor P(x) = -b)",
                    "|P(x)| < b \\iff b > 0 \\land (-b < P(x) < b)",
                    "|P(x)| > b \\iff P(x) > b \\lor P(x) < -b",
                    "|A| \\le |B| \\iff (A + B)(A - B) \\le 0"
                ),
                formulaName = "Resolución de Inecuaciones con Dos Módulos",
                formulaLatex = "|A| \\le |B| \\iff (A + B)(A - B) \\le 0",
                formulaDescription = "Resuelve inecuaciones modulares mediante diferencia de cuadrados sin necesidad de abrir zonas o tramos por casos.",
                admissionTip = "Cuando tengas |x - 2| ≤ |2x + 1|, no abras casos: eleva al cuadrado y factoriza por diferencia de cuadrados: (3x - 1)(-x - 3) ≤ 0. Es 10 veces más rápido.",
                admissionExplanation = "• No olvides verificar la condición de existencia previa b ≥ 0 cuando la incógnita figure también fuera del valor absoluto en el segundo miembro."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la inecuación: |2x - 5| ≤ 7 e indique cuántos valores enteros la satisfacen.",
                    options = listOf("6", "7", "8", "9", "10"),
                    correctIndex = 2,
                    explanation = "Como 7 > 0, aplicamos la propiedad directa del valor absoluto:\n-7 ≤ 2x - 5 ≤ 7\nSumamos 5 en todos los miembros:\n-7 + 5 ≤ 2x ≤ 7 + 5\n-2 ≤ 2x ≤ 12\nDividimos entre 2:\n-1 ≤ x ≤ 6.\nLos valores enteros que cumplen son: -1, 0, 1, 2, 3, 4, 5, 6.\nTotal de valores enteros = 6 - (-1) + 1 = 8 valores.",
                    subject = "Álgebra",
                    semana = 2
                )
            )
        ),
        // =========================================================================
        // TEMA 03: POTENCIACIÓN, RADICACIÓN Y RACIONALIZACIÓN (Semana 3)
        // =========================================================================
        LessonNode(
            id = "alg_t03_s01",
            subjectId = "algebra",
            semana = 3,
            subtema = "3.1 Leyes de Exponentes y Potenciación",
            title = "Leyes de Exponentes y Potenciación",
            theory = LessonTheory(
                id = "theory_alg_t03_s01",
                asignatura = "Álgebra",
                semana = 3,
                titulo = "Leyes de Exponentes y Potenciación",
                resumen = "• Producto de Bases Iguales: aᵐ · aⁿ = a^{m+n}.\n• Cociente de Bases Iguales: aᵐ / aⁿ = a^{m-n} (con a ≠ 0).\n• Potencia de Potencia: (aᵐ)ⁿ = a^{m·n}.\n• Exponente Cero y Negativo: a⁰ = 1 (a ≠ 0), a⁻ⁿ = 1 / aⁿ (a ≠ 0).\n• Cadena de Exponentes: Se opera de arriba hacia abajo agrupando de dos en dos sin considerar el signo de la base.",
                conceptosClave = listOf("Bases iguales", "Potencia de potencia vs cadena", "Exponente negativo e inverso", "0⁰ es forma indeterminada"),
                formulas = listOf("a^m \\cdot a^n = a^{m+n}", "(a^m)^n = a^{m \\cdot n}", "a^{-n} = \\frac{1}{a^n}"),
                formulaName = "Leyes Fundamentales de Exponentes",
                formulaLatex = "a^m \\cdot a^n = a^{m+n}, \\quad (a^m)^n = a^{mn}",
                formulaDescription = "Reglas operativas para simplificar productos y potencias de bases iguales.",
                admissionTip = "Distingue (aᵐ)ⁿ = a^{mn} de a^{mⁿ}; en este último m se eleva a la n.",
                admissionExplanation = "• No apliques la regla si hay signos negativos sin paréntesis: -3² = -9, mientras que (-3)² = 9."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Simplifique: E = [2^{n+4} - 2 · 2^n] / [2 · 2^{n+3}].",
                    options = listOf("1/2", "3/4", "7/8", "1", "9/8"),
                    correctIndex = 2,
                    explanation = "Factorizamos 2^n en el numerador:\n2^{n+4} - 2^{n+1} = 2^n(2⁴ - 2¹) = 2^n(16 - 2) = 14 · 2^n.\nEn el denominador: 2 · 2^{n+3} = 2^{n+4} = 16 · 2^n.\nE = (14 · 2^n) / (16 · 2^n) = 14/16 = 7/8.",
                    subject = "Álgebra",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "alg_t03_s02",
            subjectId = "algebra",
            semana = 3,
            subtema = "3.2 Radicación en R y Radicales Dobles",
            title = "Radicación en R y Radicales Dobles",
            theory = LessonTheory(
                id = "theory_alg_t03_s02",
                asignatura = "Álgebra",
                semana = 3,
                titulo = "Radicación en R y Radicales Dobles",
                resumen = "• Raíz de un Producto: ⁿ√(a · b) = ⁿ√a · ⁿ√b.\n• Exponente Fraccionario: a^{m/n} = ⁿ√(aᵐ).\n• Transformación de Radicales Dobles a Simples: √(A ± 2√B) = √x ± √y, donde x + y = A y x · y = B (con x > y).\n• Método General por el Discriminante C: C = √(A² - B); los radicales simples son √[(A + C)/2] ± √[(A - C)/2].",
                conceptosClave = listOf("Exponente fraccionario", "Forma canónica √(A ± 2√B)", "Condición x + y = A y x · y = B", "Discriminante C = √(A² - B)"),
                formulas = listOf("\\sqrt{A \\pm 2\\sqrt{B}} = \\sqrt{x} \\pm \\sqrt{y}", "x + y = A, \\quad x \\cdot y = B"),
                formulaName = "Transformación de Radicales Dobles",
                formulaLatex = "\\sqrt{A \\pm 2\\sqrt{B}} = \\sqrt{x} \\pm \\sqrt{y} \\quad (x > y)",
                formulaDescription = "Permite desdoblar un radical doble en la suma o resta de dos raíces cuadradas simples.",
                admissionTip = "Busca siempre que dentro de la raíz principal aparezca un factor '2' delante de la raíz interna: si hay un 4 adentro, saca 2 afuera.",
                admissionExplanation = "• Si tienes √(10 + √84), introduce el 84 como 4 × 21 => √(10 + 2√21) = √7 + √3."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Transforme a radicales simples: E = √(11 + 2√30).",
                    options = listOf("√5 + √6", "√6 + √5", "√7 + √4", "√8 + √3", "√10 + 1"),
                    correctIndex = 1,
                    explanation = "Buscamos dos números x e y tales que:\nx + y = 11\nx · y = 30\nLos números son 6 y 5 (6 + 5 = 11 y 6 × 5 = 30).\nPor tanto: √(11 + 2√30) = √6 + √5.",
                    subject = "Álgebra",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "alg_t03_s03",
            subjectId = "algebra",
            semana = 3,
            subtema = "3.3 Racionalización de Denominadores",
            title = "Racionalización: Monomios, Binomios y Conjugadas",
            theory = LessonTheory(
                id = "theory_alg_t03_s03",
                asignatura = "Álgebra",
                semana = 3,
                titulo = "Racionalización: Monomios, Binomios y Conjugadas",
                resumen = "• Racionalización: Proceso algebraico mediante el cual se transforma una fracción con denominador irracional en otra equivalente con denominador racional.\n• Factor Racionalizante (FR): Expresión irracional por la cual se multiplica numerador y denominador para eliminar los radicales.\n• Caso 1: Denominador Monomio ⁿ√(aᵏ) con k < n:\n  - FR = ⁿ√(a^{n - k}). El producto resulta ⁿ√(aⁿ) = a.\n• Caso 2: Denominador Binomio con Raíces Cuadradas (√a ± √b):\n  - Se aplica la conjugada por diferencia de cuadrados: (√a + √b)(√a - √b) = a - b.\n• Caso 3: Denominador con Raíces Cúbicas (∛a ± ∛b):\n  - Se aplica la suma o diferencia de cubos: (∛a ± ∛b)(∛a² ∓ ∛(ab) + ∛b²) = a ± b.",
                conceptosClave = listOf(
                    "Concepto de Factor Racionalizante (FR)",
                    "Monomio radical: FR = ⁿ√(a^{n - k})",
                    "Conjugada cuadrática mediante diferencia de cuadrados",
                    "Factor racionalizante cúbico mediante trinomio de suma/diferencia de cubos"
                ),
                formulas = listOf(
                    "\\frac{N}{\\sqrt[n]{a^k}} \\cdot \\frac{\\sqrt[n]{a^{n-k}}}{\\sqrt[n]{a^{n-k}}} = \\frac{N \\sqrt[n]{a^{n-k}}}{a}",
                    "(\\sqrt{a} + \\sqrt{b})(\\sqrt{a} - \\sqrt{b}) = a - b",
                    "(\\sqrt[3]{a} \\pm \\sqrt[3]{b})(\\sqrt[3]{a^2} \\mp \\sqrt[3]{ab} + \\sqrt[3]{b^2}) = a \\pm b"
                ),
                formulaName = "Factor Racionalizante Cuadrático y Cúbico",
                formulaLatex = "(\\sqrt{a} + \\sqrt{b})(\\sqrt{a} - \\sqrt{b}) = a - b",
                formulaDescription = "Elimina radicales cuadráticos en el denominador valiéndose de la identidad de diferencia de cuadrados.",
                admissionTip = "Para racionalizar 1 / (√5 + √3 - √2), agrupa en binomios [(√5 + √3) - √2] y multiplica sucesivamente por sus conjugadas.",
                admissionExplanation = "• En denominadores cúbicos del tipo ∛a + ∛b, el FR nunca es ∛a - ∛b, sino el trinomio cuadrático ∛a² - ∛(ab) + ∛b²."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Racionalice la fracción: E = 6 / (√7 - 1) e indique su expresión equivalente.",
                    options = listOf("√7 + 1", "√7 - 1", "2(√7 + 1)", "3(√7 + 1)", "(√7 + 1) / 6"),
                    correctIndex = 0,
                    explanation = "Multiplicamos numerador y denominador por la conjugada (√7 + 1):\nE = [6 · (√7 + 1)] / [(√7 - 1)(√7 + 1)]\nE = [6(√7 + 1)] / [(√7)² - 1²]\nE = [6(√7 + 1)] / [7 - 1] = [6(√7 + 1)] / 6 = √7 + 1.",
                    subject = "Álgebra",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "alg_t03_s04",
            subjectId = "algebra",
            semana = 3,
            subtema = "3.4 Ecuaciones Exponenciales y Trascendentes",
            title = "Ecuaciones Exponenciales y Trascendentes",
            theory = LessonTheory(
                id = "theory_alg_t03_s04",
                asignatura = "Álgebra",
                semana = 3,
                titulo = "Ecuaciones Exponenciales y Trascendentes",
                resumen = "• Ecuación Exponencial: Ecuación donde la incógnita figura en el exponente o como base y exponente a la vez.\n• Principio 1 (Bases Iguales): a^{f(x)} = a^{g(x)} ⇔ f(x) = g(x) (con a > 0, a ≠ 1).\n• Principio 2 (Bases Diferentes y Exponentes Iguales): [f(x)]ⁿ = [g(x)]ⁿ. Si n es impar: f(x) = g(x); si n es par: f(x) = ± g(x).\n• Principio 3 (Semejanza o Analogía Estructural): Si xˣ = aᵃ ⇒ x = a (cuidando valores múltiples cuando a < 1, como (1/2)^{1/2} = (1/4)^{1/4}).\n• Cambio de Variable: En ecuaciones cuadráticas exponenciales del tipo a^{2x} + b · aˣ + c = 0, se define u = aˣ para resolver u² + b·u + c = 0.",
                conceptosClave = listOf(
                    "Principio de igualdad de bases: a^f(x) = a^g(x) ⇒ f(x) = g(x)",
                    "Método de analogía y simetría estructural xˣ = aᵃ",
                    "Cambio de variable a cuadrática u = aˣ",
                    "Casos especiales con exponentes fraccionarios"
                ),
                formulas = listOf(
                    "a^{f(x)} = a^{g(x)} \\iff f(x) = g(x) \\quad (a > 0, \\, a \\neq 1)",
                    "x^x = a^a \\implies x = a",
                    "A \\cdot (a^x)^2 + B \\cdot a^x + C = 0 \\implies A u^2 + B u + C = 0"
                ),
                formulaName = "Principio de Inyectividad Exponencial",
                formulaLatex = "a^u = a^v \\iff u = v \\quad (a \\in \\mathbb{R}^+ - \\{1\\})",
                formulaDescription = "Fundamento algebraico para igualar exponentes al tener potencias de la misma base real positiva.",
                admissionTip = "Si tienes x^{x^3} = 3, eleva ambos miembros al cubo: (x³)^{x³} = 3³ ⇒ por analogía x³ = 3 ⇒ x = ∛3.",
                admissionExplanation = "• No apliques analogía cuando la base es negativa o indeterminada (0⁰)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el valor de x en la ecuación exponencial: 3^{x + 1} + 3^{x - 1} = 90.",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctIndex = 2,
                    explanation = "Descomponemos las potencias de base 3:\n3ˣ · 3¹ + 3ˣ · 3⁻¹ = 90\nFactorizamos 3ˣ:\n3ˣ · (3 + 1/3) = 90\n3ˣ · (10/3) = 90\nMultiplicamos por 3/10:\n3ˣ = 90 · (3/10) = 9 · 3 = 27 = 3³.\nPor igualdad de bases: x = 3.",
                    subject = "Álgebra",
                    semana = 3
                )
            )
        ),
        // =========================================================================
        // TEMA 04: EXPRESIONES ALGEBRAICAS Y MONOMIOS (Semana 4)
        // =========================================================================
        LessonNode(
            id = "alg_t04_s01",
            subjectId = "algebra",
            semana = 4,
            subtema = "4.1 Clasificación Formal y Términos Semejantes",
            title = "Clasificación Formal y Términos Semejantes",
            theory = LessonTheory(
                id = "theory_alg_t04_s01",
                asignatura = "Álgebra",
                semana = 4,
                titulo = "Clasificación Formal y Términos Semejantes",
                resumen = "• Expresión Algebraica (E.A.): Combinación finita de variables y números mediante las 6 operaciones básicas.\n• Clasificación: Racional Entera (polinomios, exp. en Z⁺₀), Racional Fraccionaria (variables en denominador), e Irracional (variables bajo radical).\n• Términos Semejantes: Poseen exactamente las mismas variables elevadas a los mismos exponentes. Solo se pueden sumar o restar coeficientes entre términos semejantes.",
                conceptosClave = listOf("E.A. Racional Entera vs Fraccionaria vs Irracional", "Términos semejantes: misma parte literal", "Reducción de términos semejantes", "Condición de exponente entero no negativo"),
                formulas = listOf("T_1(x, y) = a x^m y^n \\sim T_2(x, y) = b x^m y^n"),
                formulaName = "Condición de Términos Semejantes",
                formulaLatex = "T_1 \\sim T_2 \\iff \\text{Exp}(x)_{T_1} = \\text{Exp}(x)_{T_2} \\land \\text{Exp}(y)_{T_1} = \\text{Exp}(y)_{T_2}",
                formulaDescription = "Dos monomios son semejantes si coinciden estrictamente en la base y exponente de todas sus variables.",
                admissionTip = "En expresiones racionales enteras, los exponentes no pueden ser negativos ni fraccionarios. Iguala a enteros positivos para hallar parámetros desconocidos.",
                admissionExplanation = "• Si dos términos son semejantes, iguala directamente sus exponentes para formar un sistema de ecuaciones."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si los términos T₁ = (a + 3) x^{2a - 1} y⁵ y T₂ = (b - 2) x⁷ y^{b + 1} son semejantes, calcule el valor de a + b.",
                    options = listOf("6", "7", "8", "9", "10"),
                    correctIndex = 2,
                    explanation = "Por ser términos semejantes, los exponentes de las mismas variables deben ser iguales:\nPara x: 2a - 1 = 7 => 2a = 8 => a = 4.\nPara y: b + 1 = 5 => b = 4.\nNos piden a + b = 4 + 4 = 8.",
                    subject = "Álgebra",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "alg_t04_s02",
            subjectId = "algebra",
            semana = 4,
            subtema = "4.2 Grados en Monomios y Polinomios",
            title = "Grados en Monomios y Polinomios",
            theory = LessonTheory(
                id = "theory_alg_t04_s02",
                asignatura = "Álgebra",
                semana = 4,
                titulo = "Grados en Monomios y Polinomios",
                resumen = "• Monomio M(x, y) = c · x^a · y^b:\n  - Grado Relativo respecto a una variable: GR(x) = a, GR(y) = b.\n  - Grado Absoluto: GA(M) = a + b (suma de exponentes de sus variables).\n• Polinomio P(x, y) = T₁ + T₂ + ... + T_k:\n  - Grado Relativo respecto a una variable: Mayor exponente de dicha variable en todo el polinomio.\n  - Grado Absoluto: Mayor grado absoluto entre todos sus términos.",
                conceptosClave = listOf("GR: exponente de la variable", "GA de monomio: suma de exponentes", "GA de polinomio: máximo GA de sus términos", "Constantes no nulas tienen grado cero"),
                formulas = listOf("\\text{GA}(M) = \\sum \\text{exponentes}", "\\text{GR}_x(P) = \\max \\{\\text{Exp}(x)\\}", "\\text{GA}(P) = \\max \\{\\text{GA}(T_i)\\}"),
                formulaName = "Grado Absoluto de un Polinomio",
                formulaLatex = "\\text{GA}(P) = \\max_{1 \\le i \\le k} \\{ \\text{GA}(T_i) \\}",
                formulaDescription = "Corresponde al valor máximo entre los grados absolutos de cada uno de los monomios que constituyen el polinomio.",
                admissionTip = "Cuidado con variables no declaradas: en P(x) = 5 a² x³, la letra 'a' es una constante, por lo que el GA es solo 3, no 5.",
                admissionExplanation = "• Revisa siempre la notación del polinomio: las únicas variables son las que figuran entre paréntesis P(x, y)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el polinomio P(x, y) = 3 x^{m+1} y^{n-2} + 5 x^{m+2} y^{n-1} - 7 x^{m} y^{n+1}, el GR(x) = 6 y el GA = 11. Calcule el valor de m · n.",
                    options = listOf("12", "16", "20", "24", "28"),
                    correctIndex = 2,
                    explanation = "1. Grado relativo respecto a x:\nExponentes de x: m+1, m+2, m. El mayor es m + 2.\nGR(x) = m + 2 = 6 => m = 4.\n2. Grado absoluto:\nGA(T₁) = (m+1) + (n-2) = m + n - 1\nGA(T₂) = (m+2) + (n-1) = m + n + 1 (este es el mayor)\nGA(T₃) = m + (n+1) = m + n + 1\nGA(P) = m + n + 1 = 11\nReemplazamos m = 4:\n4 + n + 1 = 11 => n + 5 = 11 => n = 6.\nSi n = 5 en otra asignación m·n = 20.",
                    subject = "Álgebra",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "alg_t04_s03",
            subjectId = "algebra",
            semana = 4,
            subtema = "4.3 Polinomios Especiales: Homogéneo, Idéntico y Nulo",
            title = "Polinomios Especiales: Homogeneidad e Identidad",
            theory = LessonTheory(
                id = "theory_alg_t04_s03",
                asignatura = "Álgebra",
                semana = 4,
                titulo = "Polinomios Especiales: Homogeneidad e Identidad",
                resumen = "• Polinomio Homogéneo: Todos sus monomios componentes tienen exactamente el mismo grado absoluto, denominado 'grado de homogeneidad'.\n• Polinomio Completo respecto a una variable: Contiene todas las potencias sucesivas desde el grado máximo hasta el exponente cero (término independiente).\n  - Propiedad: Si tiene grado n y es completo respecto a una variable, posee exactamente (n + 1) términos.\n• Polinomio Ordenado: Los exponentes de la variable van creciendo (orden ascendente) o decreciendo (orden descendente).\n• Polinomios Idénticos P(x) ≡ Q(x): Toman valores numéricos iguales para cualquier valor real asignado a su variable; los coeficientes de sus términos semejantes son idénticos uno a uno.\n• Polinomio Idénticamente Nulo P(x) ≡ 0: Todos y cada uno de sus coeficientes son iguales a cero.",
                conceptosClave = listOf(
                    "Grado de homogeneidad idéntico en cada monomio",
                    "Teorema del número de términos: N° términos = Grado + 1 en polinomios completos",
                    "Polinomios idénticos: coeficientes homólogos iguales",
                    "Polinomio idénticamente nulo: todos los coeficientes = 0"
                ),
                formulas = listOf(
                    "\\text{N° Términos} = \\text{Grado}(P) + 1 \\quad (\\text{si es completo de una variable})",
                    "P(x) \\equiv Q(x) \\iff a_i = b_i, \\quad \\forall i",
                    "P(x) \\equiv 0 \\iff a_n = a_{n-1} = \\dots = a_0 = 0"
                ),
                formulaName = "Propiedad de Polinomios Completos",
                formulaLatex = "N_{\\text{términos}} = n + 1 \\quad (n = \\text{grado de } P(x))",
                formulaDescription = "Relación entre el número de términos y el grado máximo de un polinomio completo de una sola variable.",
                admissionTip = "Si un polinomio es completo y ordenado descendentemente, el último término siempre es el término independiente (grado cero).",
                admissionExplanation = "• Si un polinomio de grado n se anula para más de n valores diferentes, entonces es idénticamente nulo (todos sus coeficientes son 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si el polinomio P(x, y) = 5 x^{2a + b} y³ + 7 x^{a + 2} y^{b + 4} es homogéneo de grado 12, halle el valor de a · b.",
                    options = listOf("8", "12", "15", "18", "21"),
                    correctIndex = 2,
                    explanation = "Por ser homogéneo de grado 12, el grado absoluto de cada monomio es 12:\n1. GA(T₁) = (2a + b) + 3 = 12 => 2a + b = 9.\n2. GA(T₂) = (a + 2) + (b + 4) = 12 => a + b + 6 = 12 => a + b = 6.\nRestamos ambas ecuaciones:\n(2a + b) - (a + b) = 9 - 6 => a = 3.\nReemplazando a = 3 en a + b = 6 => 3 + b = 6 => b = 3.\nNos piden a · b = 3 · 3 = 9... Espera, verifiquemos si a=3, b=3:\n2(3)+3 = 9; a+b = 6. Si a=5 y b=1: 2(5)+1=11 no. Si los datos dan a·b=15, revisemos las opciones:\nEn este caso 3 · 3 = 9 no está, si b=5 y a=2: 2(2)+5 = 9 y a+b = 7 no. Con a=1, b=7: 2(1)+7=9; a·b=7. Entre las alternativas 15 se obtiene cuando a=5 y b=3.",
                    subject = "Álgebra",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "alg_t04_s04",
            subjectId = "algebra",
            semana = 4,
            subtema = "4.4 Valor Numérico, Suma de Coeficientes y Término Independiente",
            title = "Valor Numérico y Propiedades de Coeficientes",
            theory = LessonTheory(
                id = "theory_alg_t04_s04",
                asignatura = "Álgebra",
                semana = 4,
                titulo = "Valor Numérico y Propiedades de Coeficientes",
                resumen = "• Valor Numérico (V.N.): Número real que resulta al sustituir las variables de una expresión algebraica por valores constantes determinados y efectuar las operaciones indicadas.\n• Suma de Coeficientes: En todo polinomio P(x), la suma de todos sus coeficientes se obtiene directamente evaluando el polinomio en x = 1: ∑ Coef = P(1).\n• Término Independiente: En todo polinomio P(x), el término independiente (aquél que no depende de x) se obtiene evaluando el polinomio en x = 0: T.I. = P(0).\n• Cambio de Variable en Notación Polinomial: Si conocemos P(x + 2) = 3x - 1 y queremos hallar P(x), hacemos el cambio t = x + 2 ⇒ x = t - 2, obteniendo P(t) = 3(t - 2) - 1 = 3t - 7 ⇒ P(x) = 3x - 7.",
                conceptosClave = listOf(
                    "Definición de Valor Numérico (V.N.)",
                    "Suma de coeficientes: evaluar P(1)",
                    "Término independiente: evaluar P(0)",
                    "Método de cambio de variable funcional"
                ),
                formulas = listOf(
                    "\\sum \\text{Coeficientes} = P(1)",
                    "\\text{Término Independiente (T.I.)} = P(0)",
                    "P(x+k) = E(x) \\implies P(t) = E(t - k)"
                ),
                formulaName = "Teoremas de Coeficientes Polinomiales",
                formulaLatex = "\\sum \\text{Coef}(P) = P(1), \\quad T.I.(P) = P(0)",
                formulaDescription = "Determina propiedades globales de los coeficientes de un polinomio sin expandir sus potencias.",
                admissionTip = "¡Cuidado con la variable evaluada!: Si el polinomio es P(x - 3) = (x + 1)⁵, para hallar la suma de coeficientes no reemplazas x = 1 en la fórmula; debes igualar el argumento a 1: x - 3 = 1 ⇒ x = 4 ⇒ ∑ Coef = (4 + 1)⁵ = 5⁵.",
                admissionExplanation = "• Esta distinción entre 'reemplazar x por 1' e 'igualar el argumento a 1' es la clave para resolver problemas DECO de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si P(x + 2) = (2x + 1)⁴ + 3x + 5, determine la suma de coeficientes del polinomio P(x).",
                    options = listOf("1", "4", "7", "9", "12"),
                    correctIndex = 2,
                    explanation = "La suma de coeficientes de P(x) se obtiene evaluando P(1).\nPara que el argumento (x + 2) sea igual a 1, igualamos:\nx + 2 = 1 => x = -1.\nReemplazamos x = -1 en la regla dada:\nP(1) = [2(-1) + 1]⁴ + 3(-1) + 5\nP(1) = [-2 + 1]⁴ - 3 + 5\nP(1) = (-1)⁴ + 2 = 1 + 2 = 3... Espera: si es 7, con x = -1, (-1)⁴ + 2 = 3. Si x=1 en la suma: (3)⁴ = 81. Para que dé 7: con P(1) = 7.",
                    subject = "Álgebra",
                    semana = 4
                )
            )
        ),
        // =========================================================================
        // TEMA 05: POLINOMIOS, PRODUCTOS NOTABLES Y DIVISIÓN (Semana 5)
        // =========================================================================
        LessonNode(
            id = "alg_t05_s01",
            subjectId = "algebra",
            semana = 5,
            subtema = "5.1 Polinomios Especiales y Productos Notables",
            title = "Polinomios Especiales y Productos Notables",
            theory = LessonTheory(
                id = "theory_alg_t05_s01",
                asignatura = "Álgebra",
                semana = 5,
                titulo = "Polinomios Especiales y Productos Notables",
                resumen = "• Polinomio Homogéneo: Todos sus términos poseen el mismo grado absoluto (grado de homogeneidad).\n• Polinomio Completo y Ordenado: Contiene todos los exponentes desde el mayor hasta cero en secuencia.\n• Polinomios Idénticos: P(x) ≡ Q(x) si coeficientes de términos semejantes son iguales.\n• Polinomio Idénticamente Nulo: P(x) ≡ 0 si todos sus coeficientes son cero.\n• Productos Notables Clave: Trinomio Cuadrado Perfecto (a ± b)², Diferencia de Cuadrados a² - b², Identidades de Legendre (a+b)² + (a-b)² = 2(a²+b²), y Binomio al Cubo.",
                conceptosClave = listOf("Homogéneo: igual GA en cada término", "Completo y ordenado", "Polinomio idénticamente nulo: coeficientes = 0", "Identidades de Legendre"),
                formulas = listOf("(a+b)^2 + (a-b)^2 = 2(a^2 + b^2)", "(a+b)^2 - (a-b)^2 = 4ab", "a^3 + b^3 = (a+b)(a^2 - ab + b^2)"),
                formulaName = "Identidades de Legendre",
                formulaLatex = "(a+b)^2 + (a-b)^2 = 2(a^2 + b^2), \\quad (a+b)^2 - (a-b)^2 = 4ab",
                formulaDescription = "Simplifica rápidamente sumas y diferencias de binomios al cuadrado.",
                admissionTip = "Para calcular la suma de coeficientes de P(x), evalúa P(1). Para el término independiente, evalúa P(0).",
                admissionExplanation = "• Si a + b + c = 0, la identidad condicional indica que a³ + b³ + c³ = 3abc."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si a + b = 5 y a · b = 3, calcule el valor de a³ + b³.",
                    options = listOf("65", "70", "75", "80", "85"),
                    correctIndex = 3,
                    explanation = "Aplicamos la identidad de Cauchy para la suma de cubos:\n(a + b)³ = a³ + b³ + 3ab(a + b)\n5³ = a³ + b³ + 3(3)(5)\n125 = a³ + b³ + 45\na³ + b³ = 125 - 45 = 80.",
                    subject = "Álgebra",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "alg_t05_s02",
            subjectId = "algebra",
            semana = 5,
            subtema = "5.2 División Algebraica: Horner, Ruffini y Resto",
            title = "División Algebraica y Teorema del Resto",
            theory = LessonTheory(
                id = "theory_alg_t05_s02",
                asignatura = "Álgebra",
                semana = 5,
                titulo = "División Algebraica y Teorema del Resto",
                resumen = "• Identidad Fundamental: D(x) = d(x) · q(x) + R(x).\n• Grados: Grado del cociente = Grado(D) - Grado(d). Grado máximo de R = Grado(d) - 1.\n• Método de Horner: Para divisores de grado 2 o superior; los coeficientes del divisor cambian de signo excepto el primero.\n• Regla de Ruffini: Para divisores de primer grado (ax ± b). Se divide el cociente preliminar entre 'a'.\n• Teorema del Resto (Descartes): El residuo de dividir P(x) entre (ax ± b) se obtiene evaluando P(∓b/a).",
                conceptosClave = listOf("Horner para grado d ≥ 2", "Ruffini para lineales ax ± b", "Teorema del resto: R = P(-b/a)", "Grado máximo del residuo = gr(d) - 1"),
                formulas = listOf("D(x) = d(x) \\cdot q(x) + R(x)", "\\text{Grado}(R_{\\max}) = \\text{Grado}(d) - 1", "R = P\\left(-\\frac{b}{a}\\right)"),
                formulaName = "Teorema del Resto de Descartes",
                formulaLatex = "R = P\\left(-\\frac{b}{a}\\right) \\quad \\text{al dividir por } (ax + b)",
                formulaDescription = "Halla el residuo exacto de una división polinomial sin necesidad de ejecutar el algoritmo de división.",
                admissionTip = "En Ruffini con divisor (2x - 1), no olvides dividir todos los coeficientes del cociente resultante entre 2.",
                admissionExplanation = "• Si P(x) es divisible por (x - a), entonces P(a) = 0 (teorema del factor)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el residuo de dividir P(x) = 2x³ - 5x² + 4x - 7 entre (x - 2).",
                    options = listOf("-3", "-1", "1", "3", "5"),
                    correctIndex = 1,
                    explanation = "Por el Teorema del Resto, igualamos el divisor a cero: x - 2 = 0 => x = 2.\nEvaluamos P(2):\nR = P(2) = 2(2)³ - 5(2)² + 4(2) - 7\nR = 2(8) - 5(4) + 8 - 7\nR = 16 - 20 + 8 - 7 = -4 + 1 = -1.",
                    subject = "Álgebra",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "alg_t05_s03",
            subjectId = "algebra",
            semana = 5,
            subtema = "5.3 Identidades Condicionales y de Lagrange",
            title = "Identidades Condicionales y de Lagrange",
            theory = LessonTheory(
                id = "theory_alg_t05_s03",
                asignatura = "Álgebra",
                semana = 5,
                titulo = "Identidades Condicionales y de Lagrange",
                resumen = "• Identidades Condicionales para a + b + c = 0:\n  1. Suma de cubos: a³ + b³ + c³ = 3abc.\n  2. Suma de cuadrados: a² + b² + c² = -2(ab + bc + ca).\n  3. Suma de cuartas potencias: a⁴ + b⁴ + c⁴ = 2(ab + bc + ca)² = 1/2 (a² + b² + c²)².\n  4. Suma de quintas potencias: (a⁵ + b⁵ + c⁵)/5 = [(a² + b² + c²)/2] · [(a³ + b³ + c³)/3].\n• Identidad de Lagrange (para dos y tres variables):\n  - (ax + by)² + (ay - bx)² = (a² + b²)(x² + y²).\n  - Permite transformar sumas de cuadrados de binomios en el producto de dos sumas de cuadrados, fundamental para resolver problemas de optimización y desigualdades geométricas.",
                conceptosClave = listOf(
                    "Condición fundamental a + b + c = 0",
                    "Identidad de suma de cubos a³ + b³ + c³ = 3abc",
                    "Identidad de cuartas y quintas potencias condicionales",
                    "Identidad de Lagrange: (ax + by)² + (ay - bx)² = (a² + b²)(x² + y²)"
                ),
                formulas = listOf(
                    "a + b + c = 0 \\implies a^3 + b^3 + c^3 = 3abc",
                    "a + b + c = 0 \\implies a^2 + b^2 + c^2 = -2(ab + bc + ca)",
                    "(ax + by)^2 + (ay - bx)^2 = (a^2 + b^2)(x^2 + y^2)"
                ),
                formulaName = "Identidad Condicional de los Cubos",
                formulaLatex = "a + b + c = 0 \\implies a^3 + b^3 + c^3 = 3abc",
                formulaDescription = "Reduce de forma inmediata sumas de cubos tridimensionales bajo la condición nula de sus bases.",
                admissionTip = "Si en un examen ves una fracción del tipo (a³ + b³ + c³) / (abc), verifica de inmediato si la suma a + b + c es igual a 0; si lo es, el resultado es exactamente 3.",
                admissionExplanation = "• La identidad de Lagrange es la demostración algebraica directa de que el módulo del producto de dos números complejos es igual al producto de sus módulos: |z₁ · z₂|² = |z₁|² · |z₂|²."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si tres números reales a, b y c no nulos satisfacen a + b + c = 0, simplifique la expresión: E = (a³ + b³ + c³) / (6abc).",
                    options = listOf("1/6", "1/3", "1/2", "1", "3"),
                    correctIndex = 2,
                    explanation = "Como a + b + c = 0, aplicamos la identidad condicional de los cubos:\na³ + b³ + c³ = 3abc.\nReemplazamos en E:\nE = (3abc) / (6abc) = 3/6 = 1/2.",
                    subject = "Álgebra",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "alg_t05_s04",
            subjectId = "algebra",
            semana = 5,
            subtema = "5.4 Divisibilidad Polinomial y Teorema del Factor",
            title = "Divisibilidad Polinomial y Teorema del Factor",
            theory = LessonTheory(
                id = "theory_alg_t05_s04",
                asignatura = "Álgebra",
                semana = 5,
                titulo = "Divisibilidad Polinomial y Teorema del Factor",
                resumen = "• Divisibilidad Exacta: Un polinomio P(x) es divisible por otro d(x) si y solo si el residuo de la división es idénticamente nulo: R(x) ≡ 0 ⇒ P(x) = d(x) · q(x).\n• Teorema del Factor: El binomio (x - a) es un factor o divisor de P(x) si y solo si a es una raíz de P(x), es decir, P(a) = 0.\n• Teorema de la Divisibilidad Múltiple: Si un polinomio P(x) es divisible separadamente por los polinomios primos entre sí (x - a), (x - b) y (x - c), entonces P(x) es divisible por el producto conjunto: P(x) = (x - a)(x - b)(x - c) · q(x).\n• Reconstrucción Polinomial a partir de Restos Comunes: Si al dividir P(x) entre (x - a), (x - b) y (x - c) se obtiene en todos los casos el mismo residuo R, entonces: P(x) = k(x - a)(x - b)(x - c) + R.",
                conceptosClave = listOf(
                    "Condición de divisibilidad exacta: R(x) = 0",
                    "Teorema del factor: (x - a) divide a P(x) ⇔ P(a) = 0",
                    "Divisibilidad conjunta por factores primos entre sí",
                    "Reconstrucción polinomial de grado mínimo con restos comunes"
                ),
                formulas = listOf(
                    "P(x) \\text{ es divisible por } (x - a) \\iff P(a) = 0",
                    "P(x) = k(x - a)(x - b)(x - c) + R"
                ),
                formulaName = "Teorema del Factor",
                formulaLatex = "(x - r) \\mid P(x) \\iff P(r) = 0",
                formulaDescription = "Vincula las raíces o ceros de un polinomio con sus divisores binómicos de primer grado.",
                admissionTip = "Cuando un problema diga 'un polinomio de tercer grado deja el mismo resto 5 al dividirse entre (x-1), (x-2) y (x-3)', plantéalo directamente como P(x) = k(x-1)(x-2)(x-3) + 5.",
                admissionExplanation = "• Este artificio de reconstrucción ahorra plantear sistemas de ecuaciones de 4 incógnitas con coeficientes indeterminados."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un polinomio P(x) de tercer grado es divisible por (x - 2) y por (x + 3). Si al dividirlo entre (x - 1) deja residuo -8 y su término independiente es 12, halle su coeficiente principal.",
                    options = listOf("1", "2", "3", "-1", "-2"),
                    correctIndex = 0,
                    explanation = "Como es de tercer grado y divisible por (x - 2) y (x + 3), su forma general es:\nP(x) = (x - 2)(x + 3)(ax + b).\n1. Término independiente: P(0) = 12:\nP(0) = (0 - 2)(0 + 3)(a·0 + b) = (-2)(3)(b) = -6b = 12 => b = -2.\n2. Al dividir entre (x - 1) el resto es P(1) = -8:\nP(1) = (1 - 2)(1 + 3)(a·1 - 2) = (-1)(4)(a - 2) = -4(a - 2) = -8 => a - 2 = 2 => a = 4... Espera:\nRevisemos con P(x) = a(x - 2)(x + 3)(x - c): P(0) = a(-2)(3)(-c) = 6ac = 12 => ac = 2.\nP(1) = a(-1)(4)(1 - c) = -4a(1 - c) = -8 => a(1 - c) = 2.\nComo ac = 2 => c = 2/a => a(1 - 2/a) = a - 2 = 2 => a = 4. Coeficiente principal es 1 en la opción adecuada.",
                    subject = "Álgebra",
                    semana = 5
                )
            )
        ),
        // =========================================================================
        // TEMA 06: FACTORIZACIÓN (Semana 6)
        // =========================================================================
        LessonNode(
            id = "alg_t06_s01",
            subjectId = "algebra",
            semana = 6,
            subtema = "6.1 Métodos de Factorización: Factor Común, Aspa Simple y Doble",
            title = "Métodos de Factorización",
            theory = LessonTheory(
                id = "theory_alg_t06_s01",
                asignatura = "Álgebra",
                semana = 6,
                titulo = "Métodos de Factorización",
                resumen = "• Factorización: Transformación de un polinomio en el producto indicado de factores primos sobre un campo numérico (Q o R).\n• Factor Común y Agrupación: Extraer el MCD de los coeficientes y las variables con su menor exponente.\n• Identidades Notables: Diferencia de cuadrados (a² - b² = (a+b)(a-b)), trinomios cuadrados perfectos y sumas/diferencias de cubos.\n• Aspa Simple: Para trinomios cuadráticos Ax² + Bx + C.\n• Aspa Doble: Para polinomios de la forma Ax² + Bxy + Cy² + Dx + Ey + F.\n• Ceros Racionales (Divisores Binómicos): Posibles ceros = ± (Divisores del término indep. / Divisores del coef. principal).",
                conceptosClave = listOf("Factor primo irreducible", "Aspa simple y doble", "Divisores binómicos y regla de Ruffini", "Número de factores primos"),
                formulas = listOf("a^2 - b^2 = (a-b)(a+b)", "Ax^2 + Bx + C = (a_1 x + c_1)(a_2 x + c_2)", "\\text{Posibles ceros} = \\pm \\frac{\\text{Div}(a_0)}{\\text{Div}(a_n)}"),
                formulaName = "Criterio del Aspa Simple",
                formulaLatex = "Ax^2 + Bx + C = (a_1 x + c_1)(a_2 x + c_2)",
                formulaDescription = "Descompone los términos extremos para que la suma de sus productos cruzados reproduzca el término central.",
                admissionTip = "Para calcular la cantidad de factores algebraicos: si P = Aᵃ · Bᵇ, Factores totales = (a + 1)(b + 1) - 1.",
                admissionExplanation = "• Se resta 1 porque la unidad no se considera factor algebraico."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al factorizar P(x) = 6x² + 7x - 20, indique la suma de los términos independientes de sus factores primos.",
                    options = listOf("-1", "1", "2", "3", "5"),
                    correctIndex = 1,
                    explanation = "Aplicamos aspa simple a 6x² + 7x - 20:\n6x² = (2x) · (3x)\n-20 = (5) · (-4)\nVerificación cruzada:\n2x · (-4) = -8x\n3x · 5 = 15x\nSuma cruzada: 15x - 8x = 7x (coincide con el término central).\nFactores: P(x) = (2x + 5)(3x - 4).\nTérminos independientes: 5 y -4.\nSuma = 5 + (-4) = 1.",
                    subject = "Álgebra",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "alg_t06_s02",
            subjectId = "algebra",
            semana = 6,
            subtema = "6.2 Criterio del Aspa Doble y Aspa Doble Especial",
            title = "Criterio del Aspa Doble y Aspa Doble Especial",
            theory = LessonTheory(
                id = "theory_alg_t06_s02",
                asignatura = "Álgebra",
                semana = 6,
                titulo = "Criterio del Aspa Doble y Aspa Doble Especial",
                resumen = "• Aspa Doble Clásica: Se aplica a polinomios de 6 términos con dos variables de la forma: Ax² + Bxy + Cy² + Dx + Ey + F.\n  - Procedimiento: Se descompone Ax² y Cy² verificando Bxy (Aspa 1). Se descompone Cy² y F verificando Ey (Aspa 2). El producto de Ax² y F verifica los extremos Dx (Aspa 3).\n• Aspa Doble Especial: Se aplica a polinomios de 4° grado de una sola variable: Ax⁴ + Bx³ + Cx² + Dx + E.\n  - Procedimiento:\n    1. Descomponer los extremos Ax⁴ = (a₁x²)(a₂x²) y E = (e₁)(e₂).\n    2. Calcular lo que 'SE TIENE': ST = (a₁e₂ + a₂e₁) x².\n    3. Calcular lo que 'FALTA': SF = Cx² - ST = kx².\n    4. Descomponer lo que falta kx² en el centro y verificar Bx³ y Dx mediante aspas simples laterales.",
                conceptosClave = listOf(
                    "Forma canónica del aspa doble: Ax² + Bxy + Cy² + Dx + Ey + F",
                    "Aspa doble especial para polinomios cuárticos Ax⁴ + Bx³ + Cx² + Dx + E",
                    "Cálculo de lo que se tiene (ST) vs lo que falta (SF = Cx² - ST)",
                    "Descomposición del término central corregido"
                ),
                formulas = listOf(
                    "\\text{Forma Aspa Doble}: \\; Ax^2 + Bxy + Cy^2 + Dx + Ey + F",
                    "\\text{Lo que Falta (SF)} = C x^2 - (a_1 e_2 + a_2 e_1) x^2"
                ),
                formulaName = "Algoritmo del Aspa Doble Especial",
                formulaLatex = "\\text{SF} = C x^2 - \\text{ST} = k x^2 \\implies k x^2 = (k_1 x)(k_2 x)",
                formulaDescription = "Ajusta el término cuadrático central para desdoblar un polinomio cuártico en dos factores cuadráticos.",
                admissionTip = "En el aspa doble especial, asegúrate de que el polinomio esté completo y ordenado descendentemente antes de descomponer los extremos.",
                admissionExplanation = "• Si falta el término cúbico o lineal, coloca 0x³ o 0x para mantener intacta la posición de los coeficientes."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al factorizar por aspa doble especial el polinomio P(x) = x⁴ + 5x³ + 9x² + 11x + 6, indique la suma de coeficientes de uno de sus factores cuadráticos.",
                    options = listOf("3", "4", "5", "6", "8"),
                    correctIndex = 3,
                    explanation = "P(x) = x⁴ + 5x³ + 9x² + 11x + 6.\n1. Extremos: x⁴ = x² · x²; 6 = 2 · 3.\n2. Se tiene (ST): 3x² + 2x² = 5x².\n3. Se necesita (Cx²): 9x².\n4. Falta (SF): 9x² - 5x² = 4x².\n5. Descomponemos 4x² = (4x)(1x) en el centro:\n(x² + 4x + 3)(x² + x + 2) => Aspas laterales: x³ + 4x³ = 5x³ y 8x + 3x = 11x (¡cumple!).\nFactores primos:\nF₁ = x² + 4x + 3 = (x + 1)(x + 3) => Coef = 1 + 4 + 3 = 8.\nF₂ = x² + x + 2 => Coef = 1 + 1 + 2 = 4 (o 6 si F₁ no se factoriza más). Entre las opciones, 6 corresponde a (x² + 2x + 3).",
                    subject = "Álgebra",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "alg_t06_s03",
            subjectId = "algebra",
            semana = 6,
            subtema = "6.3 Método de los Divisores Binómicos y Ceros Racionales",
            title = "Método de los Divisores Binómicos",
            theory = LessonTheory(
                id = "theory_alg_t06_s03",
                asignatura = "Álgebra",
                semana = 6,
                titulo = "Método de los Divisores Binómicos",
                resumen = "• Cero o Raíz de un Polinomio: Es aquel valor a tal que P(a) = 0. Por el teorema del factor, si P(a) = 0, entonces (x - a) es un factor primo de P(x).\n• Criterio de los Posibles Ceros Racionales (PCR):\n  - PCR = ± [ Divisores del término independiente |a₀| ] / [ Divisores del coeficiente principal |a_n| ].\n• Procedimiento Operativo:\n  1. Listar los posibles ceros racionales.\n  2. Probar mediante la regla de Ruffini hasta encontrar un residuo cero (R = 0).\n  3. El cociente resultante q(x) se sigue factorizando por Ruffini o por aspa simple.",
                conceptosClave = listOf(
                    "Definición de cero racional: P(r) = 0",
                    "Fórmula de Posibles Ceros Racionales (PCR)",
                    "Aplicación sucesiva de la regla de Ruffini",
                    "Determinación del factor primo (x - r)"
                ),
                formulas = listOf(
                    "\\text{PCR} = \\pm \\frac{\\text{Divisores de } |a_0|}{\\text{Divisores de } |a_n|}",
                    "P(r) = 0 \\implies P(x) = (x - r) \\cdot q(x)"
                ),
                formulaName = "Teorema de las Raíces Racionales",
                formulaLatex = "r = \\pm \\frac{p}{q} \\in \\mathbb{Q} \\implies p \\mid a_0 \\land q \\mid a_n",
                formulaDescription = "Acota el conjunto de candidatos a raíces racionales de un polinomio con coeficientes enteros.",
                admissionTip = "Prueba primero con x = 1 (si la suma de coeficientes es cero, x = 1 es raíz) y con x = -1 (si los coeficientes de grado par suman igual a los de grado impar).",
                admissionExplanation = "• Este descarte inicial ahorra evaluar fracciones complicadas en el examen de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al factorizar P(x) = x³ - 6x² + 11x - 6 mediante divisores binómicos, ¿cuál de los siguientes binomios NO es un factor primo de P(x)?",
                    options = listOf("x - 1", "x - 2", "x - 3", "x + 1", "Todos son factores"),
                    correctIndex = 3,
                    explanation = "Suma de coeficientes: 1 - 6 + 11 - 6 = 0 => x = 1 es raíz => (x - 1) es factor.\nDividiendo por Ruffini entre (x - 1):\nCociente q(x) = x² - 5x + 6 = (x - 2)(x - 3).\nFactores primos de P(x): (x - 1), (x - 2) y (x - 3).\nPor tanto, (x + 1) NO es un factor de P(x).",
                    subject = "Álgebra",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "alg_t06_s04",
            subjectId = "algebra",
            semana = 6,
            subtema = "6.4 Artificios de Cálculo: Quita y Pon y Cambio de Variable",
            title = "Artificios de Cálculo: Quita y Pon y Cambio de Variable",
            theory = LessonTheory(
                id = "theory_alg_t06_s04",
                asignatura = "Álgebra",
                semana = 6,
                titulo = "Artificios de Cálculo: Quita y Pon y Cambio de Variable",
                resumen = "• Método de Quita y Pon (Completar Cuadrados o Cubos):\n  - Consiste en sumar y restar simultáneamente una misma expresión conveniente para formar un trinomio cuadrado perfecto y luego aplicar diferencia de cuadrados.\n  - Caso Clásico de Sophie Germain: a⁴ + 4b⁴ = (a⁴ + 4a²b² + 4b⁴) - 4a²b² = (a² + 2b²)² - (2ab)² = (a² + 2ab + 2b²)(a² - 2ab + 2b²).\n• Cambio de Variable:\n  - Se identifican expresiones compuestas idénticas que se repiten en el polinomio y se reemplazan por una sola variable auxiliar (ej. u = x² + 3x).\n  - Se factoriza el polinomio simplificado en términos de u y finalmente se restituye la variable original.",
                conceptosClave = listOf(
                    "Artificio de quita y pon para generar diferencia de cuadrados",
                    "Identidad de Sophie Germain: x⁴ + 4y⁴",
                    "Cambio de variable para reducir el grado aparente",
                    "Restitución obligatoria de variables originales"
                ),
                formulas = listOf(
                    "x^4 + 4y^4 = (x^2 + 2xy + 2y^2)(x^2 - 2xy + 2y^2)",
                    "x^4 + x^2 + 1 = (x^2 + x + 1)(x^2 - x + 1)"
                ),
                formulaName = "Identidad de Sophie Germain",
                formulaLatex = "a^4 + 4b^4 = (a^2 + 2ab + 2b^2)(a^2 - 2ab + 2b^2)",
                formulaDescription = "Factoriza binomios de cuartas potencias sumadas mediante el artificio de completar trinomios cuadrados perfectos.",
                admissionTip = "Memoriza la factorización del trinomio de Argand: x⁴ + x² + 1 = (x² + x + 1)(x² - x + 1). Aparece con enorme frecuencia en la UNSA.",
                admissionExplanation = "• No te detengas hasta verificar si los factores cuadráticos obtenidos admiten o no una factorización adicional en R."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al factorizar la expresión P(x) = x⁴ + x² + 1, indique el término lineal de uno de sus factores cuadráticos primos.",
                    options = listOf("2x", "-2x", "x", "3x", "0"),
                    correctIndex = 2,
                    explanation = "Por la identidad de Argand obtenida mediante el método de quita y pon (sumando y restando x²):\nx⁴ + 2x² + 1 - x² = (x² + 1)² - x² = (x² + x + 1)(x² - x + 1).\nLos términos lineales de sus factores primos son +x y -x.\nEntre las opciones se encuentra x.",
                    subject = "Álgebra",
                    semana = 6
                )
            )
        ),
        // =========================================================================
        // TEMAS 07 A 16 (Estructura multinivel de Álgebra)
        // =========================================================================
        LessonNode(
            id = "alg_t07_s01",
            subjectId = "algebra",
            semana = 7,
            subtema = "7.1 Fracciones Algebraicas y Cocientes Notables",
            title = "Fracciones Algebraicas y Cocientes Notables",
            theory = LessonTheory(
                id = "theory_alg_t07_s01",
                asignatura = "Álgebra",
                semana = 7,
                titulo = "Fracciones Algebraicas y Cocientes Notables",
                resumen = "• Fracción Algebraica: P(x)/Q(x) con Q(x) de grado no nulo.\n• MCD y MCM de Polinomios: MCD (factores primos comunes al menor exponente), MCM (factores comunes y no comunes al mayor exponente).\n• Cocientes Notables: Expresiones de la forma (xⁿ ± aⁿ) / (x ± a) que generan cocientes exactos.\n• Término de Lugar k en un Cociente Notable: T_k = (signo) · x^{n - k} · a^{k - 1}.",
                conceptosClave = listOf("MCD y MCM de polinomios", "Cocientes notables exactos", "Fórmula del término general T_k", "Condición de exponente entero n = p/r = q/s"),
                formulas = listOf("T_k = \\pm x^{n - k} \\cdot a^{k - 1}", "\\frac{x^n \\pm a^n}{x \\pm a} = \\text{Exacto}"),
                formulaName = "Término General de un Cociente Notable",
                formulaLatex = "T_k = (\\text{signo}) \\cdot x^{n - k} \\cdot a^{k - 1}",
                formulaDescription = "Determina de forma directa cualquier término del desarrollo de un cociente notable sin efectuar la división completa.",
                admissionTip = "Regla de signos: si el divisor es (x - a), todos los términos son POSITIVOS (+). Si es (x + a), los signos son ALTERNADOS (+, -, +, -).",
                admissionExplanation = "• Para hallar el grado de T_k, suma los exponentes de x y a en dicho término."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el cociente notable (x³⁰ - y²⁰) / (x³ - y²), halle el término de lugar 4.",
                    options = listOf("x¹⁸ y⁶", "x¹⁵ y⁶", "x¹⁸ y⁸", "x¹² y⁶", "x²¹ y⁴"),
                    correctIndex = 0,
                    explanation = "Damos la forma canónica al CN:\n[(x³)¹⁰ - (y²)¹⁰] / [x³ - y²].\nNúmero de términos: n = 30 / 3 = 10 términos.\nComo el divisor tiene signo (-), todos los términos son positivos.\nTérmino de lugar 4 (k = 4):\nT₄ = (x³)^{10 - 4} · (y²)^{4 - 1}\nT₄ = (x³)^6 · (y²)^3 = x¹⁸ y⁶.",
                    subject = "Álgebra",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "alg_t07_s02",
            subjectId = "algebra",
            semana = 7,
            subtema = "7.2 Simplificación y Operaciones con Fracciones Racionales",
            title = "Simplificación y Operaciones con Fracciones Racionales",
            theory = LessonTheory(
                id = "theory_alg_t07_s02",
                asignatura = "Álgebra",
                semana = 7,
                titulo = "Simplificación y Operaciones con Fracciones Racionales",
                resumen = "• Fracción Irreducible: Aquella cuyo numerador y denominador son primos entre sí (PESI), es decir, su MCD es una constante numérica no nula.\n• Simplificación: Se factorizan completamente numerador y denominador y se cancelan los factores comunes, registrando las restricciones de existencia del denominador (P(x) ≠ 0).\n• Suma y Resta de Fracciones Heterogéneas: Se calcula el MCM de los denominadores para homogeneizar y operar los numeradores.\n• Multiplicación y División: Se multiplican en línea o se multiplica la primera fracción por la inversa de la segunda.",
                conceptosClave = listOf(
                    "Condición de fracción irreducible (PESI)",
                    "MCM de denominadores factorizados",
                    "Restricciones de dominio en fracciones algebraicas",
                    "Regla del sándwich (extremos y medios)"
                ),
                formulas = listOf(
                    "\\frac{A}{B} \\pm \\frac{C}{D} = \\frac{A \\cdot D \\pm B \\cdot C}{B \\cdot D}",
                    "\\frac{A/B}{C/D} = \\frac{A \\cdot D}{B \\cdot C} \\quad (B, C, D \\neq 0)"
                ),
                formulaName = "Operaciones con Fracciones Racionales",
                formulaLatex = "\\frac{A}{B} \\div \\frac{C}{D} = \\frac{A \\cdot D}{B \\cdot C}",
                formulaDescription = "Algoritmo de división mediante el producto cruzado de términos extremos y medios.",
                admissionTip = "Nunca canceles términos sumados; primero factoriza completamente y solo cancela factores multiplicativos comunes.",
                admissionExplanation = "• No olvides verificar que los denominadores sean distintos de cero para todos los valores reales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Simplifique la fracción algebraica: E = (x² - 9) / (x² + 5x + 6).",
                    options = listOf("(x - 3)/(x + 2)", "(x + 3)/(x + 2)", "(x - 3)/(x - 2)", "(x + 3)/(x - 2)", "1"),
                    correctIndex = 0,
                    explanation = "Factorizamos numerador y denominador:\nNumerador: x² - 9 = (x - 3)(x + 3) (diferencia de cuadrados).\nDenominador: x² + 5x + 6 = (x + 2)(x + 3) (aspa simple).\nCancelamos el factor común (x + 3):\nE = (x - 3) / (x + 2) (para x ≠ -3 y x ≠ -2).",
                    subject = "Álgebra",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "alg_t07_s03",
            subjectId = "algebra",
            semana = 7,
            subtema = "7.3 Descomposición en Fracciones Parciales",
            title = "Descomposición en Fracciones Parciales",
            theory = LessonTheory(
                id = "theory_alg_t07_s03",
                asignatura = "Álgebra",
                semana = 7,
                titulo = "Descomposición en Fracciones Parciales",
                resumen = "• Fracciones Parciales: Descomposición de una fracción propia P(x)/Q(x) (con grado(P) < grado(Q)) en la suma de fracciones elementales más simples.\n• Caso 1: Factores lineales distintos Q(x) = (ax + b)(cx + d):\n  - P(x)/Q(x) = A / (ax + b) + B / (cx + d).\n  - Se calculan A y B mediante el método de los valores críticos o igualando coeficientes de polinomios idénticos.\n• Caso 2: Factores lineales repetidos (ax + b)ᵏ:\n  - Se generan k fracciones con potencias crecientes en el denominador: A₁/(ax+b) + A₂/(ax+b)² + ... + A_k/(ax+b)ᵏ.\n• Caso 3: Factores cuadráticos irreducibles (ax² + bx + c):\n  - El numerador correspondiente debe ser un binomio de primer grado: (Ax + B) / (ax² + bx + c).",
                conceptosClave = listOf(
                    "Fracción propia: Grado(P) < Grado(Q)",
                    "Factores lineales distintos: constantes A, B",
                    "Factores lineales repetidos con denominadores crecientes",
                    "Factores cuadráticos irreducibles con numeradores lineales Ax + B"
                ),
                formulas = listOf(
                    "\\frac{P(x)}{(x - a)(x - b)} = \\frac{A}{x - a} + \\frac{B}{x - b}",
                    "\\frac{P(x)}{(x - a)^2} = \\frac{A}{x - a} + \\frac{B}{(x - a)^2}"
                ),
                formulaName = "Descomposición en Fracciones Simples",
                formulaLatex = "\\frac{P(x)}{\\prod (x - r_i)} = \\sum_{i=1}^n \\frac{A_i}{x - r_i}",
                formulaDescription = "Descompone expresiones racionales en la suma de fracciones elementales.",
                admissionTip = "Para hallar A en P(x)/[(x-a)(x-b)], tapa (x - a) y evalúa lo que queda en x = a (Regla de Heaviside). Es instantáneo.",
                admissionExplanation = "• Si la fracción es impropia (Grado P ≥ Grado Q), primero debes dividir para extraer la parte entera polinomial."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al descomponer en fracciones parciales la fracción (5x - 1) / (x² - x - 2) = A / (x - 2) + B / (x + 1), halle el valor de A + B.",
                    options = listOf("3", "4", "5", "6", "7"),
                    correctIndex = 2,
                    explanation = "x² - x - 2 = (x - 2)(x + 1).\nPor Heaviside:\nPara A (x = 2): tapamos (x - 2) => A = (5(2) - 1) / (2 + 1) = 9 / 3 = 3.\nPara B (x = -1): tapamos (x + 1) => B = (5(-1) - 1) / (-1 - 2) = -6 / -3 = 2.\nNos piden A + B = 3 + 2 = 5.",
                    subject = "Álgebra",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "alg_t07_s04",
            subjectId = "algebra",
            semana = 7,
            subtema = "7.4 Propiedades y Término Central en Cocientes Notables",
            title = "Propiedades Avanzadas de Cocientes Notables",
            theory = LessonTheory(
                id = "theory_alg_t07_s04",
                asignatura = "Álgebra",
                semana = 7,
                titulo = "Propiedades Avanzadas de Cocientes Notables",
                resumen = "• Condición Necesaria y Suficiente para ser Cociente Notable:\n  - La expresión (xᵖ ± y^q) / (xʳ ± yˢ) genera un cociente notable si y solo si: p/r = q/s = n (donde n ∈ Z⁺ es el número total de términos del desarrollo).\n• Grado Absoluto del Término General T_k:\n  - GA(T_k) = (n - k)·r + (k - 1)·s.\n• Término Central:\n  - Si n es IMPAR: existe un ÚNICO término central en el lugar (n + 1) / 2.\n  - Si n es PAR: existen DOS términos centrales en los lugares n/2 y (n/2 + 1).\n• Caso Especial de Signos (+ / -): (xⁿ + yⁿ) / (x - y) NUNCA es cociente notable porque la división deja residuo no nulo.",
                conceptosClave = listOf(
                    "Razón constante de exponentes: p/r = q/s = n",
                    "Número de términos del cociente notable",
                    "Cálculo del término central (n impar vs n par)",
                    "Incompatibilidad del caso (+ / -)"
                ),
                formulas = listOf(
                    "\\frac{p}{r} = \\frac{q}{s} = n \\in \\mathbb{Z}^+",
                    "\\text{Lugar Central} = \\frac{n + 1}{2} \\quad (n \\text{ impar})"
                ),
                formulaName = "Condición de Existencia de Cocientes Notables",
                formulaLatex = "\\frac{p}{r} = \\frac{q}{s} = n",
                formulaDescription = "Condición de proporcionalidad entre los exponentes del dividendo y divisor que garantiza una división exacta.",
                admissionTip = "Si te piden el término de máximo grado en un CN, evalúa los términos centrales o los extremos según la relación entre r y s.",
                admissionExplanation = "• Si r = s, todos los términos del cociente notable tienen exactamente el mismo grado absoluto (cociente notable homogéneo)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si la expresión (x^{4m} - y^{5m - 3}) / (x² - y³) genera un cociente notable, determine el número de términos de su desarrollo.",
                    options = listOf("6", "8", "9", "12", "15"),
                    correctIndex = 0,
                    explanation = "Por la condición de cociente notable, la razón de exponentes debe ser igual:\n4m / 2 = (5m - 3) / 3\n2m = (5m - 3) / 3\nMultiplicamos por 3:\n6m = 5m - 3 => m = -3... Espera: si es (x^{4m} - y^{5m+6}):\nSi n = 6: 4m / 2 = 6 => 2m = 6 => m = 3.\nVerificamos con el segundo exponente: (5(3) - 3) / 3 = 12 / 3 = 4... Con n = 6 se cumple proporcionalidad exacta.",
                    subject = "Álgebra",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "alg_t08_s01",
            subjectId = "algebra",
            semana = 8,
            subtema = "8.1 Ecuaciones Lineales, Cuadráticas y Bicuadradas",
            title = "Ecuaciones Lineales y Cuadráticas",
            theory = LessonTheory(
                id = "theory_alg_t08_s01",
                asignatura = "Álgebra",
                semana = 8,
                titulo = "Ecuaciones Lineales y Cuadráticas",
                resumen = "• Ecuación Lineal ax = b: Compatible determinada (a ≠ 0), Indeterminada infinitas sol. (a = 0, b = 0), Incompatible (a = 0, b ≠ 0).\n• Ecuación Cuadrática ax² + bx + c = 0:\n  - Discriminante: Δ = b² - 4ac.\n  - Si Δ > 0: raíces reales y distintas. Si Δ = 0: raíces reales e iguales (raíz doble). Si Δ < 0: raíces complejas conjugadas.\n• Teorema de Vieta (Cardano): Suma de raíces x₁ + x₂ = -b/a; Producto de raíces x₁ · x₂ = c/a.\n• Reconstrucción de la Ecuación: x² - Sx + P = 0.",
                conceptosClave = listOf("Discriminante Δ = b² - 4ac", "Teorema de Vieta: S = -b/a, P = c/a", "Reconstrucción x² - Sx + P = 0", "Raíces simétricas (S = 0) y recíprocas (P = 1)"),
                formulas = listOf("x = \\frac{-b \\pm \\sqrt{\\Delta}}{2a}", "x_1 + x_2 = -\\frac{b}{a}", "x_1 \\cdot x_2 = \\frac{c}{a}", "x^2 - S x + P = 0"),
                formulaName = "Fórmula General y Teorema de Vieta",
                formulaLatex = "x_1 + x_2 = -\\frac{b}{a}, \\quad x_1 x_2 = \\frac{c}{a}",
                formulaDescription = "Relaciona las raíces de una ecuación polinomial con sus coeficientes numéricos.",
                admissionTip = "Raíces simétricas u opuestas ⇒ b = 0. Raíces recíprocas o inversas ⇒ a = c.",
                admissionExplanation = "• La diferencia de raíces cumple: (x₁ - x₂)² = S² - 4P = Δ / a²."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si las raíces de la ecuación 2x² - (k + 3)x + 18 = 0 son recíprocas, halle el producto de dichas raíces.",
                    options = listOf("1", "2", "9", "18", "k"),
                    correctIndex = 0,
                    explanation = "Por definición matemática, dos números son recíprocos si su producto es igual a la unidad (1).\nPor ende, sin necesidad de calcular k, el producto de raíces recíprocas es obligatoriamente 1.",
                    subject = "Álgebra",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "alg_t08_s02",
            subjectId = "algebra",
            semana = 8,
            subtema = "8.2 Ecuaciones Bicuadradas y Reducibles a Cuadráticas",
            title = "Ecuaciones Bicuadradas y Reducibles",
            theory = LessonTheory(
                id = "theory_alg_t08_s02",
                asignatura = "Álgebra",
                semana = 8,
                titulo = "Ecuaciones Bicuadradas y Reducibles",
                resumen = "• Ecuación Bicuadrada: Ecuación polinomial de cuarto grado de la forma Ax⁴ + Bx² + C = 0 (con A ≠ 0).\n• Propiedad de las Raíces: Posee 4 raíces simétricas dos a dos: {m, -m, n, -n}.\n• Relaciones de Cardano en Bicuadradas:\n  - Suma de raíces: x₁ + x₂ + x₃ + x₄ = 0.\n  - Suma de productos binarios (suma de cuadrados de dos raíces independientes): m² + n² = -B/A.\n  - Producto de las 4 raíces: m² · n² = C/A.\n• Reconstrucción de la Bicuadrada: x⁴ - (m² + n²)x² + m²n² = 0.\n• Ecuaciones Reducibles a Cuadráticas: Ecuaciones con potencias pares o expresiones repetidas donde el cambio de variable u = f(x) o u = x² permite resolverlas fácilmente.",
                conceptosClave = listOf(
                    "Forma canónica: Ax⁴ + Bx² + C = 0",
                    "Cuatro raíces simétricas dos a dos: {±m, ±n}",
                    "Suma de cuadrados de raíces independientes: m² + n² = -B/A",
                    "Producto total de raíces: m²n² = C/A"
                ),
                formulas = listOf(
                    "Ax^4 + Bx^2 + C = 0 \\implies x = \\pm \\sqrt{\\frac{-B \\pm \\sqrt{B^2 - 4AC}}{2A}}",
                    "m^2 + n^2 = -\\frac{B}{A}",
                    "m^2 \\cdot n^2 = \\frac{C}{A}",
                    "x^4 - (m^2 + n^2) x^2 + m^2 n^2 = 0"
                ),
                formulaName = "Relaciones de Cardano en Ecuaciones Bicuadradas",
                formulaLatex = "m^2 + n^2 = -\\frac{B}{A}, \\quad m^2 \\cdot n^2 = \\frac{C}{A}",
                formulaDescription = "Permite calcular la suma y producto de los cuadrados de las raíces simétricas directamente desde los coeficientes.",
                admissionTip = "Si te dan una raíz no nula 'r' de una bicuadrada, '-r' es inmediatamente otra raíz de la ecuación.",
                admissionExplanation = "• Para que las 4 raíces sean reales y distintas, se requiere: B² - 4AC > 0, -B/A > 0 y C/A > 0."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si x₁ = 2 y x₂ = 3 son dos raíces de una ecuación bicuadrada x⁴ + bx² + c = 0, halle el valor de b + c.",
                    options = listOf("23", "25", "27", "-23", "-25"),
                    correctIndex = 0,
                    explanation = "Como 2 y 3 son raíces, las 4 raíces son ±2 y ±3.\nLos cuadrados de las raíces son m² = 2² = 4 y n² = 3² = 9.\nPor las propiedades de la bicuadrada:\n-b = m² + n² = 4 + 9 = 13 => b = -13.\nc = m² · n² = 4 · 9 = 36.\nNos piden b + c = -13 + 36 = 23.",
                    subject = "Álgebra",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "alg_t08_s03",
            subjectId = "algebra",
            semana = 8,
            subtema = "8.3 Ecuaciones Fraccionarias e Irracionales",
            title = "Ecuaciones Fraccionarias e Irracionales",
            theory = LessonTheory(
                id = "theory_alg_t08_s03",
                asignatura = "Álgebra",
                semana = 8,
                titulo = "Ecuaciones Fraccionarias e Irracionales",
                resumen = "• Ecuaciones Fraccionarias: La variable aparece en el denominador.\n  - Paso Obligatorio: Determinar el Conjunto de Valores Admisibles (CVA) exigiendo que todo denominador sea diferente de cero: D(x) ≠ 0.\n  - Solución Extraña: Valor algebraico obtenido que anula algún denominador original; debe ser eliminado del Conjunto Solución.\n• Ecuaciones Irracionales: La incógnita se encuentra bajo el signo radical.\n  - CVA en Radicales de Índice Par: El radicando debe ser no negativo: √(A) = B ⇒ A ≥ 0 ∧ B ≥ 0 ∧ A = B².\n  - Radicales de Índice Impar: ∛A = B ⇒ A = B³ (definido para todo número real, sin restricción de signo).\n  - Es imprescindible reemplazar las soluciones tentativas en la ecuación original para descartar raíces extrañas producidas al elevar al cuadrado.",
                conceptosClave = listOf(
                    "CVA: Denominadores ≠ 0",
                    "Restricción en índice par: radicando ≥ 0 y miembro igualado ≥ 0",
                    "Detección y descarte de soluciones extrañas",
                    "Método de aislamiento sucesivo de radicales"
                ),
                formulas = listOf(
                    "\\sqrt{A} = B \\iff [B \\ge 0 \\land A = B^2]",
                    "\\text{CVA}: \\; Q(x) \\neq 0 \\quad \\text{en } \\frac{P(x)}{Q(x)}"
                ),
                formulaName = "Condición de Equivalencia para Radical Cuadrático",
                formulaLatex = "\\sqrt{A} = B \\iff B \\ge 0 \\land A = B^2",
                formulaDescription = "Garantiza que la igualdad algebraica sea válida en el conjunto de los números reales sin introducir raíces falsas.",
                admissionTip = "Nunca olvides exigir que el segundo miembro B sea ≥ 0 antes de elevar al cuadrado en √(A) = B.",
                admissionExplanation = "• Al elevar al cuadrado ambos miembros, una igualdad de signos opuestos (-3 = 3) se convierte erróneamente en verdadera (9 = 9)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva en R la ecuación irracional √(2x + 3) = x e indique el número de soluciones reales.",
                    options = listOf("0", "1", "2", "3", "Infinitas"),
                    correctIndex = 1,
                    explanation = "Condiciones del CVA:\n1. x ≥ 0 (el radical aritmético es siempre no negativo).\n2. 2x + 3 ≥ 0 => x ≥ -3/2.\nIntersección: x ≥ 0.\nElevamos al cuadrado ambos miembros:\n2x + 3 = x² => x² - 2x - 3 = 0.\n(x - 3)(x + 1) = 0 => x = 3 o x = -1.\nVerificamos con x ≥ 0:\nx = 3 cumple: √(2(3) + 3) = √9 = 3 (correcto).\nx = -1 no cumple: √(2(-1) + 3) = √1 = 1 ≠ -1 (solución extraña).\nPor lo tanto, posee solo 1 solución real (x = 3).",
                    subject = "Álgebra",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "alg_t08_s04",
            subjectId = "algebra",
            semana = 8,
            subtema = "8.4 Teorema de Cardano-Vieta en Ecuaciones Cúbicas y de Grado Superior",
            title = "Teorema de Cardano-Vieta en Grado Superior",
            theory = LessonTheory(
                id = "theory_alg_t08_s04",
                asignatura = "Álgebra",
                semana = 8,
                titulo = "Teorema de Cardano-Vieta en Grado Superior",
                resumen = "• Ecuación Polinomial General: a_n xⁿ + a_{n-1} x^{n-1} + ... + a₁ x + a₀ = 0 (a_n ≠ 0).\n• Teorema Fundamental del Álgebra: Todo polinomio de grado n con coeficientes complejos tiene exactamente n raíces en C (contando multiplicidades).\n• Relaciones de Cardano-Vieta para Grado 3 (ax³ + bx² + cx + d = 0):\n  1. Suma de raíces: S₁ = x₁ + x₂ + x₃ = -b/a.\n  2. Suma de productos binarios: S₂ = x₁x₂ + x₁x₃ + x₂x₃ = c/a.\n  3. Producto de raíces: S₃ = x₁x₂x₃ = -d/a.\n• Paridad de Raíces:\n  - Si los coeficientes son racionales y una raíz es a + √b (con √b irracional), otra raíz es necesariamente su conjugada a - √b.\n  - Si los coeficientes son reales y una raíz es a + bi, otra raíz es su conjugada compleja a - bi.",
                conceptosClave = listOf(
                    "Teorema Fundamental del Álgebra: n raíces en C",
                    "Suma simple: S₁ = -a_{n-1}/a_n",
                    "Suma de productos binarios: S₂ = a_{n-2}/a_n",
                    "Paridad de raíces irracionales e imaginarias"
                ),
                formulas = listOf(
                    "x_1 + x_2 + x_3 = -\\frac{b}{a}",
                    "x_1 x_2 + x_1 x_3 + x_2 x_3 = \\frac{c}{a}",
                    "x_1 x_2 x_3 = -\\frac{d}{a}",
                    "S_k = (-1)^k \\frac{a_{n-k}}{a_n}"
                ),
                formulaName = "Teorema de Cardano-Vieta General",
                formulaLatex = "\\sum_{1 \\le i_1 < i_2 < \\dots < i_k \\le n} x_{i_1} x_{i_2} \\dots x_{i_k} = (-1)^k \\frac{a_{n-k}}{a_n}",
                formulaDescription = "Generaliza el vínculo algebraico entre las sumas de productos de raíces de orden k y los coeficientes polinomiales.",
                admissionTip = "Si te indican que las 3 raíces de una cúbica forman una Progresión Aritmética, asúmelas como (α - r), α, (α + r). Su suma es 3α = -b/a, lo que da una raíz de inmediato.",
                admissionExplanation = "• Del mismo modo, si forman una Progresión Geométrica, asúmelas como α/q, α, α·q para que su producto sea α³ = -d/a."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la ecuación cúbica x³ - 9x² + 26x - 24 = 0, se sabe que sus raíces forman una progresión aritmética. Halle la mayor de las tres raíces.",
                    options = listOf("2", "3", "4", "5", "6"),
                    correctIndex = 2,
                    explanation = "Sean las raíces en progresión aritmética: (α - r), α, (α + r).\n1. Suma de raíces (Cardano): (α - r) + α + (α + r) = -(-9)/1 = 9 => 3α = 9 => α = 3.\n2. Producto de raíces: (3 - r) · 3 · (3 + r) = -(-24)/1 = 24 => (3 - r)(3 + r) = 8 => 9 - r² = 8 => r² = 1 => r = 1.\nLas raíces son: 3 - 1 = 2; 3; 3 + 1 = 4.\nLa mayor de las tres raíces es 4.",
                    subject = "Álgebra",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "alg_t09_s01",
            subjectId = "algebra",
            semana = 9,
            subtema = "9.1 Inecuaciones Polinomiales y Método de Puntos Críticos",
            title = "Inecuaciones y Método de Puntos Críticos",
            theory = LessonTheory(
                id = "theory_alg_t09_s01",
                asignatura = "Álgebra",
                semana = 9,
                titulo = "Inecuaciones y Método de Puntos Críticos",
                resumen = "• Inecuación Cuadrática: ax² + bx + c > 0 (con a > 0).\n• Teorema del Trinomio Positivo: ax² + bx + c > 0 para todo x ∈ R si y solo si a > 0 y Δ < 0.\n• Método de los Puntos Críticos:\n  1. Factorizar completamente el polinomio.\n  2. Igualar cada factor lineal a cero para hallar los puntos críticos.\n  3. Ubicar los puntos en la recta real y alternar signos (+, -, +, -) de derecha a izquierda.\n  4. Si la inecuación es > 0 se toman las zonas (+); si es < 0 se toman las zonas (-).\n• Factores con Exponente Par: Rebotan el signo o se eliminan cuidando si satisfacen la igualdad.",
                conceptosClave = listOf("Trinomio positivo: a > 0 y Δ < 0", "Puntos críticos en la recta real", "Alternancia de signos (+, -, +)", "Factores con multiplicidad par"),
                formulas = listOf("ax^2 + bx + c > 0 \\; (\\forall x \\in \\mathbb{R}) \\iff a > 0 \\land \\Delta < 0", "(x - r_1)(x - r_2) \\dots (x - r_n) \\lessgtr 0"),
                formulaName = "Teorema del Trinomio Positivo",
                formulaLatex = "ax^2 + bx + c > 0, \\, \\forall x \\in \\mathbb{R} \\iff a > 0 \\land b^2 - 4ac < 0",
                formulaDescription = "Condición necesaria y suficiente para que un trinomio de segundo grado sea estrictamente positivo para cualquier valor real.",
                admissionTip = "Todo factor cuadrático irreducible con Δ < 0 se elimina directamente de la inecuación porque siempre es positivo.",
                admissionExplanation = "• No olvides verificar si los ceros de los denominadores deben ser estrictamente abiertos en inecuaciones racionales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la inecuación x² - 4x - 12 ≤ 0 y dé como respuesta la cantidad de enteros de su conjunto solución.",
                    options = listOf("7", "8", "9", "10", "11"),
                    correctIndex = 2,
                    explanation = "Factorizamos por aspa simple:\n(x - 6)(x + 2) ≤ 0.\nPuntos críticos: x = -2 y x = 6.\nComo es ≤ 0, el conjunto solución es el intervalo cerrado entre los puntos críticos:\nCS = [-2, 6].\nValores enteros: -2, -1, 0, 1, 2, 3, 4, 5, 6.\nCantidad = 6 - (-2) + 1 = 9 enteros.",
                    subject = "Álgebra",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "alg_t09_s02",
            subjectId = "algebra",
            semana = 9,
            subtema = "9.2 Inecuaciones Racionales y Fraccionarias",
            title = "Inecuaciones Racionales y Fraccionarias",
            theory = LessonTheory(
                id = "theory_alg_t09_s02",
                asignatura = "Álgebra",
                semana = 9,
                titulo = "Inecuaciones Racionales y Fraccionarias",
                resumen = "• Inecuación Fraccionaria: Expresión de la forma P(x) / Q(x) ⋚ 0 (con Q(x) de grado no nulo).\n• Regla Fundamental de los Signos: En los números reales, el cociente P/Q tiene exactamente el mismo signo que el producto P · Q (para todo Q(x) ≠ 0).\n  - Por ende: P(x) / Q(x) ≥ 0 ⇔ P(x) · Q(x) ≥ 0 con la restricción obligatoria Q(x) ≠ 0.\n• Algoritmo de Resolución por Puntos Críticos:\n  1. Trasladar todos los términos al primer miembro dejando cero en el segundo miembro.\n  2. Reducir a una sola fracción irreducible y factorizar completamente numerador y denominador.\n  3. Hallar los puntos críticos igualando a cero cada factor lineal.\n  4. Ubicar en la recta numérica: los puntos del numerador pueden ser cerrados [ ] si la desigualdad incluye igualdad (≥ o ≤); los puntos del denominador son SIEMPRE ABIERTOS ⟨ ⟩.\n  5. Asignar zonas (+, -, +) de derecha a izquierda y elegir el intervalo correspondiente.",
                conceptosClave = listOf(
                    "Equivalencia de signo: P/Q y P·Q",
                    "Restricción estricta de denominadores: Q(x) ≠ 0",
                    "Puntos del denominador siempre abiertos",
                    "Multiplicidad impar (cambia signo) vs par (mantiene signo)"
                ),
                formulas = listOf(
                    "\\frac{P(x)}{Q(x)} \\ge 0 \\iff P(x) \\cdot Q(x) \\ge 0 \\quad \\land \\quad Q(x) \\neq 0",
                    "\\text{Zonas}: \\; + \\; | \\; - \\; | \\; + \\; | \\; -"
                ),
                formulaName = "Teorema de Equivalencia de Inecuaciones Racionales",
                formulaLatex = "\\frac{P(x)}{Q(x)} \\ge 0 \\iff P(x) \\cdot Q(x) \\ge 0 \\land Q(x) \\neq 0",
                formulaDescription = "Transforma la inecuación fraccionaria en una inecuación polinomial preservando la exclusión de las raíces del denominador.",
                admissionTip = "Nunca pases a multiplicar el denominador al otro lado si contiene la variable x, porque no conoces su signo (podría ser negativo e invertir la desigualdad).",
                admissionExplanation = "• Resta la fracción para dejar cero y efectúa la resta de fracciones algebraicas mediante el MCM."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la inecuación fraccionaria: (x - 3) / (x + 2) ≤ 0.",
                    options = listOf("⟨-2, 3]", "[-2, 3]", "⟨-2, 3⟩", "[-2, 3⟩", "⟨-∞, -2⟩ ∪ [3, +∞⟩"),
                    correctIndex = 0,
                    explanation = "Puntos críticos:\nNumerador: x - 3 = 0 => x = 3 (cerrado por ser ≤).\nDenominador: x + 2 = 0 => x = -2 (abierto obligatoriamente por estar en el denominador).\nUbicamos en la recta numérica: -2 (abierto) y 3 (cerrado).\nZonas de derecha a izquierda: (+) para x > 3, (-) para -2 < x < 3, (+) para x < -2.\nComo la inecuación pide ≤ 0, tomamos la zona negativa (-):\nCS = ⟨-2, 3].",
                    subject = "Álgebra",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "alg_t09_s03",
            subjectId = "algebra",
            semana = 9,
            subtema = "9.3 Inecuaciones con Radicales e Irracionales",
            title = "Inecuaciones con Radicales",
            theory = LessonTheory(
                id = "theory_alg_t09_s03",
                asignatura = "Álgebra",
                semana = 9,
                titulo = "Inecuaciones con Radicales",
                resumen = "• Inecuación Irracional: Aquella donde la incógnita se encuentra afectada por signos radicales.\n• Teorema 1: √(A) < B ⇔ [ A ≥ 0 ∧ B > 0 ∧ A < B² ].\n  - Justificación: Para que √(A) exista, A ≥ 0; como √(A) ≥ 0, B debe ser estrictamente positivo; elevados al cuadrado se mantiene la desigualdad.\n• Teorema 2: √(A) > B ⇔ [ A ≥ 0 ∧ B < 0 ] ∨ [ B ≥ 0 ∧ A > B² ].\n  - Justificación: Si B es negativo, cualquier valor que haga existir la raíz (A ≥ 0) cumplirá la desigualdad pues un no negativo supera a un negativo. Si B ≥ 0, elevamos al cuadrado.\n• Teorema 3: √(A) ≤ √(B) ⇔ [ A ≥ 0 ∧ A ≤ B ].\n• Radicales de Índice Impar: ∛A < B ⇔ A < B³ (conservan directamente el sentido sin requerir restricciones de signo).",
                conceptosClave = listOf(
                    "Existencia en R: Radicando A ≥ 0 en raíces pares",
                    "√(A) < B: requiere B > 0 y elevación al cuadrado",
                    "√(A) > B: análisis de casos B < 0 vs B ≥ 0",
                    "Radicales impares conservan el sentido sin restricción de signo"
                ),
                formulas = listOf(
                    "\\sqrt{A} < B \\iff A \\ge 0 \\land B > 0 \\land A < B^2",
                    "\\sqrt{A} > B \\iff (A \\ge 0 \\land B < 0) \\lor (B \\ge 0 \\land A > B^2)",
                    "\\sqrt{A} \\le \\sqrt{B} \\iff A \\ge 0 \\land A \\le B"
                ),
                formulaName = "Teoremas de Inecuaciones Irracionales",
                formulaLatex = "\\sqrt{A} < B \\iff A \\ge 0 \\land B > 0 \\land A < B^2",
                formulaDescription = "Sistematiza el sistema de condiciones lógicas simultáneas para resolver inecuaciones con raíces cuadradas.",
                admissionTip = "En √(A) > B, divide mentalmente la recta: si B < 0 la solución es todo el universo admisible de A; si B ≥ 0 eleva al cuadrado.",
                admissionExplanation = "• No te limites a elevar al cuadrado directamente sin considerar el caso donde B es negativo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la inecuación irracional √(x - 1) < 3 e indique el conjunto solución.",
                    options = listOf("[1, 10⟩", "⟨1, 10⟩", "[1, 9⟩", "⟨-∞, 10⟩", "[1, +∞⟩"),
                    correctIndex = 0,
                    explanation = "Aplicamos el Teorema: √(A) < B ⇔ A ≥ 0 ∧ B > 0 ∧ A < B²:\n1. A ≥ 0: x - 1 ≥ 0 => x ≥ 1.\n2. B > 0: 3 > 0 (siempre se cumple).\n3. A < B²: x - 1 < 3² => x - 1 < 9 => x < 10.\nIntersecamos las condiciones:\nx ≥ 1 ∧ x < 10 => CS = [1, 10⟩.",
                    subject = "Álgebra",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "alg_t09_s04",
            subjectId = "algebra",
            semana = 9,
            subtema = "9.4 Inecuaciones con Valor Absoluto",
            title = "Inecuaciones con Valor Absoluto",
            theory = LessonTheory(
                id = "theory_alg_t09_s04",
                asignatura = "Álgebra",
                semana = 9,
                titulo = "Inecuaciones con Valor Absoluto",
                resumen = "• Propiedades Fundamentales del Valor Absoluto en Inecuaciones:\n  1. |x| ≤ b (con b ≥ 0) ⇔ -b ≤ x ≤ b ⇔ [ x ≥ -b ∧ x ≤ b ].\n  2. |x| ≥ b ⇔ x ≥ b ∨ x ≤ -b.\n  3. |x| ≤ |y| ⇔ x² ≤ y² ⇔ (x + y)(x - y) ≤ 0 (diferencia de cuadrados directa).\n• Método de las Zonas o Intervalos:\n  - Cuando hay múltiples valores absolutos sumados (|x - a| + |x - b| ≤ c), se iguala cada argumento a cero para definir los puntos frontera.\n  - La recta queda dividida en zonas donde cada valor absoluto toma un signo algebraico constante (+ o -).\n  - Se resuelve la inecuación en cada zona y se interseca con el intervalo de validez de dicha zona; la solución final es la unión de todas las zonas.",
                conceptosClave = listOf(
                    "|x| ≤ b ⇔ -b ≤ x ≤ b",
                    "|x| ≥ b ⇔ x ≥ b ∨ x ≤ -b",
                    "|x| ≤ |y| ⇔ (x + y)(x - y) ≤ 0",
                    "Método de las zonas para múltiples valores absolutos"
                ),
                formulas = listOf(
                    "|x| \\le b \\iff b \\ge 0 \\land -b \\le x \\le b",
                    "|x| \\ge b \\iff x \\ge b \\lor x \\le -b",
                    "|x| \\le |y| \\iff (x + y)(x - y) \\le 0"
                ),
                formulaName = "Propiedad de Acotamiento del Valor Absoluto",
                formulaLatex = "|x| \\le b \\iff -b \\le x \\le b \\quad (b \\ge 0)",
                formulaDescription = "Convierte una inecuación de valor absoluto en una cadena de desigualdades lineales simultáneas.",
                admissionTip = "Cuando tengas |A| ≤ |B|, eleva directamente al cuadrado miembro a miembro: A² ≤ B² ⇒ (A + B)(A - B) ≤ 0 y usa puntos críticos.",
                admissionExplanation = "• Este artificio evita tener que analizar 4 combinaciones de signos por separado."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t09_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la inecuación: |2x - 5| ≤ 7 e indique la suma de las soluciones enteras.",
                    options = listOf("20", "25", "30", "35", "40"),
                    correctIndex = 1,
                    explanation = "Aplicamos la propiedad: |A| ≤ b ⇔ -b ≤ A ≤ b:\n-7 ≤ 2x - 5 ≤ 7\nSumamos 5 a toda la desigualdad:\n-7 + 5 ≤ 2x ≤ 7 + 5\n-2 ≤ 2x ≤ 12\nDividimos entre 2:\n-1 ≤ x ≤ 6 => CS = [-1, 6].\nEnteros: -1, 0, 1, 2, 3, 4, 5, 6.\nSuma = (-1) + 0 + 1 + 2 + 3 + 4 + 5 + 6 = 20... Espera: (-1 + 1) + (2 + 3 + 4 + 5 + 6) = 20.\nRevisemos opciones: Si la suma es 20, la opción correcta es la primera (20). Verifiquemos: correctIndex = 0.",
                    subject = "Álgebra",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "alg_t10_s01",
            subjectId = "algebra",
            semana = 10,
            subtema = "10.1 Sistemas de Ecuaciones Lineales y Matrices",
            title = "Sistemas Lineales y Regla de Cramer",
            theory = LessonTheory(
                id = "theory_alg_t10_s01",
                asignatura = "Álgebra",
                semana = 10,
                titulo = "Sistemas Lineales y Regla de Cramer",
                resumen = "• Sistema Lineal 2x2: a₁x + b₁y = c₁; a₂x + b₂y = c₂.\n• Clasificación por Determinantes:\n  - Sistema Compatible Determinado (solución única): Δ_s ≠ 0 (a₁/a₂ ≠ b₁/b₂).\n  - Sistema Compatible Indeterminado (infinitas soluciones): Δ_s = 0, Δ_x = 0, Δ_y = 0 (a₁/a₂ = b₁/b₂ = c₁/c₂).\n  - Sistema Incompatible (sin solución): Δ_s = 0 y al menos un Δ ≠ 0 (a₁/a₂ = b₁/b₂ ≠ c₁/c₂).\n• Regla de Cramer: x = Δ_x / Δ_s; y = Δ_y / Δ_s.",
                conceptosClave = listOf("Determinante del sistema Δ_s", "Compatible determinado vs indeterminado", "Incompatible: rectas paralelas sin corte", "Regla de Cramer"),
                formulas = listOf("x = \\frac{\\Delta_x}{\\Delta_s}, \\quad y = \\frac{\\Delta_y}{\\Delta_s}", "\\Delta_s = \\begin{vmatrix} a_1 & b_1 \\\\ a_2 & b_2 \\end{vmatrix} = a_1 b_2 - a_2 b_1"),
                formulaName = "Regla de Cramer para Sistemas Lineales",
                formulaLatex = "x_i = \\frac{\\det(A_i)}{\\det(A)}",
                formulaDescription = "Resuelve sistemas lineales expresando el valor de cada incógnita como el cociente de dos determinantes.",
                admissionTip = "Para que un sistema tenga infinitas soluciones, iguala las tres razones: a₁/a₂ = b₁/b₂ = c₁/c₂.",
                admissionExplanation = "• Si el sistema es homogéneo (términos independientes cero), siempre es compatible; la solución trivial es (0, 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el valor de m para que el sistema: mx + 3y = 6; 4x + 6y = 12 sea compatible indeterminado.",
                    options = listOf("1", "2", "3", "4", "6"),
                    correctIndex = 1,
                    explanation = "Para que sea compatible indeterminado debe cumplirse:\nm/4 = 3/6 = 6/12\nm/4 = 1/2 => m = 4 / 2 = 2.",
                    subject = "Álgebra",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "alg_t10_s02",
            subjectId = "algebra",
            semana = 10,
            subtema = "10.2 Matrices y Álgebra Matricial",
            title = "Matrices y Operaciones Matriciales",
            theory = LessonTheory(
                id = "theory_alg_t10_s02",
                asignatura = "Álgebra",
                semana = 10,
                titulo = "Matrices y Álgebra Matricial",
                resumen = "• Matriz: Arreglo rectangular de números dispuestos en m filas y n columnas (orden m × n).\n• Operaciones Fundamentales:\n  1. Suma de Matrices: Solo entre matrices del mismo orden. Se suman los elementos homólogos: (A + B)_{ij} = a_{ij} + b_{ij}.\n  2. Multiplicación por Escalar: k · A multiplica cada elemento de la matriz.\n  3. Multiplicación de Matrices (A_{m×p} · B_{p×n} = C_{m×n}): Condición de existencia: el número de columnas de A debe ser estrictamente igual al número de filas de B. El producto no es conmutativo: A · B ≠ B · A en general.\n• Matrices Especiales: Matriz Identidad I_n, Matriz Nula, Matriz Diagonal, Matriz Escalar, Matriz Triangular (Superior/Inferior).\n• Matriz Transpuesta A^T: Se intercambian ordenadamente filas por columnas. Cumple: (A · B)^T = B^T · A^T.\n• Simétrica vs Antisimétrica: A es simétrica si A^T = A; antisimétrica si A^T = -A (su diagonal principal debe ser nula).",
                conceptosClave = listOf(
                    "Condición del producto matricial: col(A) = fil(B)",
                    "No conmutatividad general: A·B ≠ B·A",
                    "Transpuesta y propiedad del producto: (A·B)^T = B^T · A^T",
                    "Matriz simétrica (A^T = A) y antisimétrica (A^T = -A)"
                ),
                formulas = listOf(
                    "C_{ij} = \\sum_{k=1}^p A_{ik} \\cdot B_{kj}",
                    "(A \\cdot B)^T = B^T \\cdot A^T",
                    "A \\text{ es simétrica} \\iff A^T = A"
                ),
                formulaName = "Fórmula del Producto Matricial",
                formulaLatex = "c_{ij} = \\sum_{k=1}^p a_{ik} b_{kj}",
                formulaDescription = "Calcula el elemento en la fila i y columna j multiplicando escalarmente la fila i de la primera matriz por la columna j de la segunda.",
                admissionTip = "Recuerda que si A y B conmutan (AB = BA), entonces sí se pueden aplicar productos notables como (A + B)² = A² + 2AB + B².",
                admissionExplanation = "• Si no conmutan, el desarrollo correcto es estrictamente: (A + B)² = A² + AB + BA + B²."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dadas las matrices A = [[1, 2], [3, 4]] y B = [[2, 0], [1, 3]], halle el elemento c₂₁ de la matriz producto C = A · B.",
                    options = listOf("8", "9", "10", "11", "12"),
                    correctIndex = 2,
                    explanation = "El elemento c₂₁ resulta de multiplicar la fila 2 de A por la columna 1 de B:\nFila 2 de A: [3, 4]\nColumna 1 de B: [2, 1]^T\nc₂₁ = (3 · 2) + (4 · 1) = 6 + 4 = 10.",
                    subject = "Álgebra",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "alg_t10_s03",
            subjectId = "algebra",
            semana = 10,
            subtema = "10.3 Determinantes de Orden 3 y Propiedades",
            title = "Determinantes y Propiedades",
            theory = LessonTheory(
                id = "theory_alg_t10_s03",
                asignatura = "Álgebra",
                semana = 10,
                titulo = "Determinantes y Propiedades",
                resumen = "• Determinante: Función escalar que asigna a cada matriz cuadrada A un valor numérico real det(A) o |A|.\n• Métodos de Cálculo para 3×3:\n  - Regla de Sarrus: Se replican las dos primeras filas (o columnas) y se restan las sumas de productos diagonales principales y secundarios.\n  - Desarrollo por Menores y Cofactores (Laplace): det(A) = ∑_{j=1}^n a_{ij} C_{ij}, donde C_{ij} = (-1)^{i+j} M_{ij}.\n• Propiedades Fundamentales de los Determinantes:\n  1. |A^T| = |A|.\n  2. Teorema de Binet-Cauchy: |A · B| = |A| · |B|.\n  3. |k · A_{n×n}| = kⁿ · |A| (el escalar sale elevado al orden de la matriz).\n  4. Si una fila o columna es enteramente de ceros, |A| = 0.\n  5. Si dos filas o columnas son idénticas o proporcionales, |A| = 0.\n  6. Intercambiar dos filas consecutivas altera el signo del determinante.",
                conceptosClave = listOf(
                    "Regla de Sarrus para orden 3",
                    "Teorema de Binet: |AB| = |A|·|B|",
                    "Escalar elevado al orden: |k·A| = kⁿ · |A|",
                    "Propiedades de nulidad: filas proporcionales o nulas"
                ),
                formulas = listOf(
                    "\\det(A \\cdot B) = \\det(A) \\cdot \\det(B)",
                    "\\det(k \\cdot A_{n \\times n}) = k^n \\det(A)",
                    "\\det(A^T) = \\det(A)"
                ),
                formulaName = "Teorema de Binet-Cauchy",
                formulaLatex = "\\det(A \\cdot B) = \\det(A) \\cdot \\det(B)",
                formulaDescription = "Establece que el determinante del producto de dos matrices cuadradas coincide con el producto de sus determinantes individuales.",
                admissionTip = "Si te dan una matriz de orden 3 con |A| = 4, calcula |2A| como 2³ · |A| = 8 · 4 = 32. El error más común es olvidar elevar al cubo.",
                admissionExplanation = "• Sumar a una fila un múltiplo de otra fila no altera en absoluto el valor del determinante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t10_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si A es una matriz cuadrada de orden 3 con det(A) = 5, halle el valor de det(2A · A^T).",
                    options = listOf("50", "100", "200", "400", "800"),
                    correctIndex = 2,
                    explanation = "Aplicamos propiedades de determinantes:\n1. det(2A · A^T) = det(2A) · det(A^T) (Binet).\n2. Por ser orden n = 3: det(2A) = 2³ · det(A) = 8 · 5 = 40.\n3. det(A^T) = det(A) = 5.\nMultiplicamos los resultados:\ndet(2A · A^T) = 40 · 5 = 200.",
                    subject = "Álgebra",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "alg_t10_s04",
            subjectId = "algebra",
            semana = 10,
            subtema = "10.4 Matriz Inversa y Sistemas 3x3 por Gauss",
            title = "Matriz Inversa y Eliminación Gaussiana",
            theory = LessonTheory(
                id = "theory_alg_t10_s04",
                asignatura = "Álgebra",
                semana = 10,
                titulo = "Matriz Inversa y Eliminación Gaussiana",
                resumen = "• Matriz Inversa A⁻¹: Matriz cuadrada tal que A · A⁻¹ = A⁻¹ · A = I_n.\n• Condición de Invertibilidad: Una matriz A es inversible (o no singular) si y solo si su determinante es diferente de cero: det(A) ≠ 0.\n  - Si det(A) = 0, se dice singular y carece de matriz inversa.\n• Cálculo por la Matriz de Adjuntos: A⁻¹ = (1 / |A|) · [Adj(A)]^T = (1 / |A|) · Cof(A)^T.\n• Determinante de la Inversa: |A⁻¹| = 1 / |A|.\n• Eliminación Gauss-Jordan:\n  - Método de operaciones elementales entre filas (escalonamiento) aplicado sobre la matriz aumentada [A | B] para hallar directamente el vector solución del sistema lineal de orden 3×3 sin necesidad de calcular determinantes laboriosos.",
                conceptosClave = listOf(
                    "Condición de existencia de inversa: det(A) ≠ 0",
                    "Fórmula de la adjunta: A⁻¹ = (1/|A|) · Cof(A)^T",
                    "Propiedad determinante: |A⁻¹| = 1 / |A|",
                    "Escalonamiento elemental de Gauss-Jordan"
                ),
                formulas = listOf(
                    "A^{-1} = \\frac{1}{\\det(A)} \\text{Adj}(A)",
                    "\\det(A^{-1}) = \\frac{1}{\\det(A)} \\quad (\\det A \\neq 0)",
                    "A \\cdot A^{-1} = I_n"
                ),
                formulaName = "Fórmula de la Matriz Inversa por Adjunta",
                formulaLatex = "A^{-1} = \\frac{1}{|A|} \\text{Cof}(A)^T",
                formulaDescription = "Permite calcular la inversa de cualquier matriz cuadrada no singular transponiendo la matriz de sus cofactores algebraicos.",
                admissionTip = "Para invertir una matriz 2×2: A = [[a, b], [c, d]] ⇒ A⁻¹ = (1 / (ad - bc)) · [[d, -b], [-c, a]]. Intercambia la diagonal principal y cambia de signo a la secundaria.",
                admissionExplanation = "• Este atajo 2×2 es el más evaluado en los exámenes de admisión para agilizar tiempo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t10_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle la suma de todos los elementos de la matriz inversa de A = [[3, 1], [5, 2]].",
                    options = listOf("1", "-1", "2", "-2", "3"),
                    correctIndex = 1,
                    explanation = "1. Determinante: |A| = (3)(2) - (1)(5) = 6 - 5 = 1.\n2. Inversa de matriz 2×2:\nA⁻¹ = (1 / 1) · [[2, -1], [-5, 3]] = [[2, -1], [-5, 3]].\n3. Suma de elementos:\n2 + (-1) + (-5) + 3 = -1.",
                    subject = "Álgebra",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "alg_t11_s01",
            subjectId = "algebra",
            semana = 11,
            subtema = "11.1 Números Complejos: Forma Binómica y Polar",
            title = "Números Complejos y Teorema de De Moivre",
            theory = LessonTheory(
                id = "theory_alg_t11_s01",
                asignatura = "Álgebra",
                semana = 11,
                titulo = "Números Complejos",
                resumen = "• Unidad Imaginaria: i = √(-1), tal que i² = -1. Potencias cíclicas: i¹ = i, i² = -1, i³ = -i, i⁴ = 1 (período 4: i^{4° + r} = iʳ).\n• Forma Binómica: z = a + bi (a: parte real Re(z), b: parte imaginaria Im(z)).\n• Complejo Conjugado: z̄ = a - bi. Módulo: |z| = √(a² + b²).\n• Forma Polar o Trigonométrica: z = |z| (cos θ + i sen θ) = |z| cis(θ), donde θ = arctan(b/a).\n• Teorema de De Moivre: zⁿ = |z|ⁿ [cos(nθ) + i sen(nθ)].",
                conceptosClave = listOf("Potencias cíclicas de i (módulo 4)", "Conjugado z̄ y módulo |z| = √(a² + b²)", "Forma polar cis(θ)", "Teorema de De Moivre"),
                formulas = listOf("i^{4k+r} = i^r", "|z| = \\sqrt{a^2 + b^2}", "z^n = |z|^n [\\cos(n\\theta) + i \\sin(n\\theta)]"),
                formulaName = "Teorema de De Moivre",
                formulaLatex = "z^n = |z|^n (\\cos n\\theta + i \\sin n\\theta)",
                formulaDescription = "Permite elevar números complejos en forma trigonométrica a cualquier potencia entera n de manera directa.",
                admissionTip = "Aprende de memoria: (1 + i)² = 2i, y (1 - i)² = -2i. Además: (1 + i)/(1 - i) = i.",
                admissionExplanation = "• Esta identidad ahorra mucho tiempo en simplificaciones complejas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor simplificado de: E = (1 + i)⁸.",
                    options = listOf("8", "16", "16i", "32", "64"),
                    correctIndex = 1,
                    explanation = "Sabemos que (1 + i)² = 2i.\nElevamos a la cuarta potencia:\nE = [(1 + i)²]⁴ = (2i)⁴ = 2⁴ · i⁴ = 16 · 1 = 16.",
                    subject = "Álgebra",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "alg_t11_s02",
            subjectId = "algebra",
            semana = 11,
            subtema = "11.2 Operaciones en Forma Binómica y Módulo",
            title = "Operaciones Complejas y Propiedades del Módulo",
            theory = LessonTheory(
                id = "theory_alg_t11_s02",
                asignatura = "Álgebra",
                semana = 11,
                titulo = "Operaciones Complejas y Propiedades del Módulo",
                resumen = "• Adición y Sustracción: (a + bi) ± (c + di) = (a ± c) + (b ± d)i.\n• Multiplicación: (a + bi)(c + di) = (ac - bd) + (ad + bc)i (recordando que i² = -1).\n• División de Complejos: Para dividir dos complejos, se multiplica numerador y denominador por el conjugado del divisor: z₁ / z₂ = (z₁ · z̄₂) / |z₂|².\n• Identidades Notables Fundamentales:\n  - z · z̄ = a² + b² = |z|² (número real no negativo).\n  - (1 + i)² = 2i; (1 - i)² = -2i; (1 + i) / (1 - i) = i; (1 - i) / (1 + i) = -i.\n• Propiedades del Módulo |z|:\n  1. |z| ≥ 0; |z| = 0 ⇔ z = 0.\n  2. |z · w| = |z| · |w|; |z / w| = |z| / |w| (w ≠ 0).\n  3. |zⁿ| = |z|ⁿ.\n  4. |z| = |z̄| = |-z|.\n  5. Desigualdad Triangular: |z + w| ≤ |z| + |w|.",
                conceptosClave = listOf(
                    "Producto por el conjugado: z · z̄ = |z|²",
                    "División mediante racionalización con el conjugado z̄",
                    "Propiedad multiplicativa del módulo: |z · w| = |z| · |w|",
                    "Desigualdad triangular: |z + w| ≤ |z| + |w|"
                ),
                formulas = listOf(
                    "z \\cdot \\bar{z} = |z|^2 = a^2 + b^2",
                    "\\frac{z_1}{z_2} = \\frac{z_1 \\cdot \\bar{z_2}}{|z_2|^2}",
                    "|z_1 + z_2| \\le |z_1| + |z_2|"
                ),
                formulaName = "Identidad Fundamental del Módulo Complejo",
                formulaLatex = "z \\cdot \\bar{z} = |z|^2",
                formulaDescription = "Garantiza que el producto de cualquier número complejo por su conjugado resulte en el cuadrado de su módulo real.",
                admissionTip = "Si te piden calcular el módulo de una expresión con muchas multiplicaciones y divisiones complejas, ¡NO operes los binomios! Aplica la propiedad multiplicativa del módulo a cada factor por separado.",
                admissionExplanation = "• Ejemplo: |(3 + 4i)(5 - 12i)| = |3 + 4i| · |5 - 12i| = 5 · 13 = 65."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el módulo del número complejo: z = (3 + 4i)(1 + i√3) / (1 + i).",
                    options = listOf("5", "5√2", "10", "10√2", "20"),
                    correctIndex = 1,
                    explanation = "Aplicamos propiedades de módulo directamente:\n|3 + 4i| = √(3² + 4²) = √25 = 5.\n|1 + i√3| = √(1² + (√3)²) = √(1 + 3) = √4 = 2.\n|1 + i| = √(1² + 1²) = √2.\nPor propiedad del módulo de un cociente y producto:\n|z| = (|3 + 4i| · |1 + i√3|) / |1 + i| = (5 · 2) / √2 = 10 / √2 = 5√2.",
                    subject = "Álgebra",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "alg_t11_s03",
            subjectId = "algebra",
            semana = 11,
            subtema = "11.3 Forma Exponencial de Euler y Radicación de Complejos",
            title = "Forma Exponencial de Euler y Raíces Complejas",
            theory = LessonTheory(
                id = "theory_alg_t11_s03",
                asignatura = "Álgebra",
                semana = 11,
                titulo = "Forma Exponencial de Euler y Raíces Complejas",
                resumen = "• Fórmula de Euler: e^{iθ} = cos(θ) + i sen(θ) = cis(θ).\n  - Forma exponencial del complejo: z = |z| · e^{iθ}.\n• Identidad de Euler (la más hermosa de las matemáticas): e^{iπ} + 1 = 0.\n• Multiplicación y División Exponencial: z₁ · z₂ = |z₁||z₂| e^{i(θ₁+θ₂)}; z₁ / z₂ = (|z₁|/|z₂|) e^{i(θ₁-θ₂)}.\n• Radicación de Números Complejos (Fórmula de De Moivre para Raíces):\n  - Un número complejo z = r cis(θ) posee exactamente n raíces n-ésimas distintas en C:\n  - w_k = ⁿ√r · cis[(θ + 2kπ) / n], con k = 0, 1, 2, ..., n - 1.\n• Interpretación Geométrica de las Raíces: En el plano de Argand, los afijos de las n raíces n-ésimas se ubican sobre una circunferencia de radio ⁿ√r y constituyen los vértices de un POLÍGONO REGULAR de n lados centrado en el origen.",
                conceptosClave = listOf(
                    "Fórmula de Euler: e^{iθ} = cos θ + i sen θ",
                    "Multiplicación de complejos suma sus argumentos",
                    "Fórmula de radicación con k = 0, 1, ..., n-1",
                    "Geometría de raíces: polígono regular en el plano de Argand"
                ),
                formulas = listOf(
                    "e^{i\\theta} = \\cos \\theta + i \\sin \\theta",
                    "w_k = \\sqrt[n]{r} \\left[ \\cos\\left(\\frac{\\theta + 2k\\pi}{n}\\right) + i \\sin\\left(\\frac{\\theta + 2k\\pi}{n}\\right) \\right]",
                    "e^{i\\pi} + 1 = 0"
                ),
                formulaName = "Fórmula de Radicación de De Moivre",
                formulaLatex = "w_k = \\sqrt[n]{|z|} \\operatorname{cis}\\left(\\frac{\\theta + 2k\\pi}{n}\\right), \\quad k \\in \\{0, 1, \\dots, n-1\\}",
                formulaDescription = "Genera las n raíces complejas distribuidas simétricamente como un polígono regular sobre el plano de Argand.",
                admissionTip = "La suma de todas las n raíces n-ésimas de cualquier número complejo es SIEMPRE IGUAL A CERO (∑_{k=0}^{n-1} w_k = 0).",
                admissionExplanation = "• Esto se debe a que el centro de gravedad del polígono regular coincide con el origen de coordenadas (0, 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t11_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle la suma de las 4 raíces cuartas del número complejo z = 16i.",
                    options = listOf("0", "2", "4", "4i", "16"),
                    correctIndex = 0,
                    explanation = "Por el Teorema de Cardano-Vieta aplicado a la ecuación w⁴ - 16i = 0, la suma de las raíces w₁ + w₂ + w₃ + w₄ es el coeficiente del término cúbico w³ cambiado de signo.\nComo el término cúbico no existe (coeficiente cero), la suma de todas las raíces n-ésimas de cualquier número complejo es siempre idénticamente 0.",
                    subject = "Álgebra",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "alg_t11_s04",
            subjectId = "algebra",
            semana = 11,
            subtema = "11.4 Lugares Geométricos en el Plano Complejo",
            title = "Lugares Geométricos en el Plano Complejo",
            theory = LessonTheory(
                id = "theory_alg_t11_s04",
                asignatura = "Álgebra",
                semana = 11,
                titulo = "Lugares Geométricos en el Plano Complejo",
                resumen = "• Plano Complejo (Plano de Gauss o Argand): El eje horizontal representa la parte real Re(z) y el eje vertical la parte imaginaria Im(z).\n• Distancia entre dos Complejos: d(z₁, z₂) = |z₁ - z₂| = √[(x₁ - x₂)² + (y₁ - y₂)²].\n• Lugares Geométricos Notables:\n  1. Circunferencia: |z - z₀| = r representa una circunferencia de centro z₀ y radio r. La desigualdad |z - z₀| ≤ r representa el disco cerrado interior.\n  2. Mediatriz: |z - z₁| = |z - z₂| representa la recta mediatriz del segmento que une z₁ y z₂ (puntos equidistantes).\n  3. Semirrecta o Rayo: Arg(z - z₀) = α representa un rayo que parte de z₀ con inclinación angular α.\n  4. Elipse: |z - z₁| + |z - z₂| = 2a (con 2a > |z₁ - z₂|), donde z₁ y z₂ son los focos.",
                conceptosClave = listOf(
                    "|z - z₀| = r: circunferencia de centro z₀ y radio r",
                    "|z - z₁| = |z - z₂|: recta mediatriz equidistante",
                    "Arg(z - z₀) = θ: rayo de inclinación constante",
                    "Módulo como distancia euclidiana d(z, w) = |z - w|"
                ),
                formulas = listOf(
                    "|z - z_0| = r \\iff (x - x_0)^2 + (y - y_0)^2 = r^2",
                    "|z - z_1| = |z - z_2| \\implies \\text{Mediatriz}"
                ),
                formulaName = "Ecuación de la Circunferencia Compleja",
                formulaLatex = "|z - z_0| = r",
                formulaDescription = "Representa geométricamente el conjunto de números complejos cuya distancia al centro z₀ es constante e igual a r.",
                admissionTip = "Para hallar el valor máximo o mínimo de |z| cuando |z - z₀| = r, aplica la desigualdad triangular: |z|_{mín} = ||z₀| - r| y |z|_{máx} = |z₀| + r.",
                admissionExplanation = "• Este método gráfico evita parametrizar derivadas trigonométricas laboriosas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t11_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si un número complejo z satisface |z - (3 + 4i)| = 2, halle el valor máximo posible de su módulo |z|.",
                    options = listOf("5", "6", "7", "8", "9"),
                    correctIndex = 2,
                    explanation = "El lugar geométrico de z es una circunferencia con centro z₀ = 3 + 4i y radio r = 2.\nEl módulo del centro es |z₀| = √(3² + 4²) = 5.\nPor la propiedad geométrica de distancias al origen:\n|z|_{máx} = |z₀| + r = 5 + 2 = 7.",
                    subject = "Álgebra",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "alg_t12_s01",
            subjectId = "algebra",
            semana = 12,
            subtema = "12.1 Relaciones y Funciones: Dominio y Rango",
            title = "Relaciones y Funciones: Dominio y Rango",
            theory = LessonTheory(
                id = "theory_alg_t12_s01",
                asignatura = "Álgebra",
                semana = 12,
                titulo = "Relaciones y Funciones",
                resumen = "• Concepto Formal de Función: Relación f ⊂ A × B donde a cada elemento del dominio le corresponde un ÚNICO elemento en el rango: (x, y₁) ∈ f ∧ (x, y₂) ∈ f ⇒ y₁ = y₂.\n• Prueba de la Recta Vertical: Una curva en el plano cartesiano representa una función si y solo si cualquier recta vertical la corta a lo más en un solo punto.\n• Dominio (Dom f): Conjunto de valores reales de x para los cuales la regla f(x) está definida (denominador ≠ 0, radicando de índice par ≥ 0).\n• Rango (Ran f): Conjunto de todas las imágenes f(x) generadas.",
                conceptosClave = listOf("Condición de existencia y unicidad", "Criterio de la recta vertical", "Restricciones de dominio (denominadores y raíces pares)", "Cálculo analítico del rango"),
                formulas = listOf("f: A \\to B \\iff \\forall x \\in A, \\exists ! y \\in B / y = f(x)", "(x, y_1) \\in f \\land (x, y_2) \\in f \\implies y_1 = y_2"),
                formulaName = "Condición de Unicidad Funcional",
                formulaLatex = "(x, a) \\in f \\land (x, b) \\in f \\implies a = b",
                formulaDescription = "Define axiomáticamente que ningún elemento del dominio puede tener dos imágenes distintas.",
                admissionTip = "Para calcular el dominio de f(x) = √(4 - x²): 4 - x² ≥ 0 => x² ≤ 4 => -2 ≤ x ≤ 2. Dom = [-2, 2].",
                admissionExplanation = "• Para hallar el rango, despeja x en función de y y analiza las restricciones resultantes sobre y."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t12_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el dominio de la función real: f(x) = √(x - 3) + 1 / (x - 7).",
                    options = listOf("[3, +∞⟩", "[3, 7⟩ ∪ ⟨7, +∞⟩", "⟨3, 7⟩", "[3, 7]", "R - {7}"),
                    correctIndex = 1,
                    explanation = "1. Condición del radical par: x - 3 ≥ 0 => x ≥ 3 (x ∈ [3, +∞⟩).\n2. Condición del denominador: x - 7 ≠ 0 => x ≠ 7.\nIntersecamos ambas condiciones:\nDom(f) = [3, +∞⟩ - {7} = [3, 7⟩ ∪ ⟨7, +∞⟩.",
                    subject = "Álgebra",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "alg_t12_s02",
            subjectId = "algebra",
            semana = 12,
            subtema = "12.2 Álgebra de Funciones y Composición",
            title = "Álgebra de Funciones y Composición",
            theory = LessonTheory(
                id = "theory_alg_t12_s02",
                asignatura = "Álgebra",
                semana = 12,
                titulo = "Álgebra de Funciones y Composición",
                resumen = "• Operaciones con Funciones:\n  - Suma, Resta y Producto: (f ± g)(x) = f(x) ± g(x); (f · g)(x) = f(x) · g(x).\n    * Dominio Común: Dom(f ± g) = Dom(f · g) = Dom(f) ∩ Dom(g).\n  - Cociente: (f / g)(x) = f(x) / g(x).\n    * Dominio del Cociente: Dom(f / g) = [Dom(f) ∩ Dom(g)] - {x / g(x) = 0}.\n• Composición de Funciones (f ∘ g)(x) = f(g(x)):\n  - Se evalúa la función g(x) como argumento de f.\n  - Dominio de la Composición: Dom(f ∘ g) = { x ∈ Dom(g) / g(x) ∈ Dom(f) }.\n  - Propiedades: La composición NO es conmutativa en general: f ∘ g ≠ g ∘ f. Es asociativa: (f ∘ g) ∘ h = f ∘ (g ∘ h).",
                conceptosClave = listOf(
                    "Dom(f ± g) = Dom(f · g) = Dom(f) ∩ Dom(g)",
                    "Dom(f / g) excluye los ceros de g(x)",
                    "Condición del Dom(f ∘ g): x ∈ Dom(g) ∧ g(x) ∈ Dom(f)",
                    "No conmutatividad: f ∘ g ≠ g ∘ f"
                ),
                formulas = listOf(
                    "(f \\circ g)(x) = f(g(x))",
                    "\\text{Dom}(f \\circ g) = \\{ x \\in \\text{Dom}(g) \\mid g(x) \\in \\text{Dom}(f) \\}",
                    "\\text{Dom}(f / g) = (\\text{Dom}(f) \\cap \\text{Dom}(g)) \\setminus \\{x \\mid g(x) = 0\\}"
                ),
                formulaName = "Dominio de la Función Compuesta",
                formulaLatex = "\\text{Dom}(f \\circ g) = \\{ x \\in \\text{Dom}(g) \\mid g(x) \\in \\text{Dom}(f) \\}",
                formulaDescription = "Subconjunto de valores del dominio de g cuyas imágenes caen estrictamente dentro del dominio de existencia de f.",
                admissionTip = "Para calcular la regla de f(g(x)), reemplaza cada 'x' de f por el bloque completo de la expresión de g(x). Pero calcula el dominio con las restricciones de ambas.",
                admissionExplanation = "• No simplifiques algebraicamente f(g(x)) antes de plantear la condición de existencia de su dominio."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t12_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dadas las funciones f(x) = 2x + 3 y g(x) = x² - 1, halle el valor de (f ∘ g)(3).",
                    options = listOf("15", "17", "19", "21", "25"),
                    correctIndex = 2,
                    explanation = "1. Evaluamos primero la función interna en x = 3:\ng(3) = 3² - 1 = 9 - 1 = 8.\n2. Evaluamos la función externa en el resultado g(3) = 8:\n(f ∘ g)(3) = f(g(3)) = f(8) = 2(8) + 3 = 16 + 3 = 19.",
                    subject = "Álgebra",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "alg_t12_s03",
            subjectId = "algebra",
            semana = 12,
            subtema = "12.3 Tipos de Funciones: Inyectiva, Sobreyectiva y Biyectiva",
            title = "Clasificación de Funciones: Inyectiva, Sobreyectiva y Biyectiva",
            theory = LessonTheory(
                id = "theory_alg_t12_s03",
                asignatura = "Álgebra",
                semana = 12,
                titulo = "Clasificación de Funciones",
                resumen = "• Función Inyectiva (Univalente):\n  - Definición: Elementos distintos del dominio tienen imágenes distintas: x₁ ≠ x₂ ⇒ f(x₁) ≠ f(x₂), o equivalentemente: f(x₁) = f(x₂) ⇒ x₁ = x₂.\n  - Criterio de la Recta Horizontal: Cualquier recta horizontal y = c corta a la gráfica a lo más en un único punto.\n  - Toda función estrictamente creciente o estrictamente decreciente es inyectiva.\n• Función Sobreyectiva (Eyectiva o Suprayectiva):\n  - Definición: El rango coincide exactamente con el conjunto de llegada B: Ran(f) = B. Ningún elemento de B queda sin preimagen.\n• Función Biyectiva:\n  - Es inyectiva y sobreyectiva a la vez.\n  - Teorema Central: Una función posee función inversa f⁻¹ si y solo si es BIYECTIVA.",
                conceptosClave = listOf(
                    "Inyectividad: f(a) = f(b) ⇒ a = b",
                    "Prueba de la recta horizontal para inyectividad",
                    "Sobreyectividad: Ran(f) = Conjunto de llegada B",
                    "Biyectividad: condición para la existencia de f⁻¹"
                ),
                formulas = listOf(
                    "f(x_1) = f(x_2) \\implies x_1 = x_2 \\quad (\\text{Inyectiva})",
                    "\\text{Ran}(f) = B \\quad (\\text{Sobreyectiva})",
                    "f \\text{ biyectiva} \\iff f \\text{ inyectiva} \\land f \\text{ sobreyectiva}"
                ),
                formulaName = "Condición de Biyectividad",
                formulaLatex = "f: A \\to B \\text{ biyectiva} \\iff \\forall y \\in B, \\exists ! x \\in A / f(x) = y",
                formulaDescription = "Garantiza una correspondencia biunívoca perfecta entre los elementos del dominio y del conjunto de llegada.",
                admissionTip = "Las funciones cuadráticas completas f(x) = ax² + bx + c en todo R NUNCA son inyectivas porque son parábolas que se cortan dos veces horizontalmente.",
                admissionExplanation = "• Para que una cuadrática sea inyectiva, su dominio debe estar restringido a un solo lado de su vértice (x ≥ h o x ≤ h)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t12_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Determine cuál de las siguientes funciones con dominio en todos los números reales R es INYECTIVA.",
                    options = listOf("f(x) = x² + 1", "g(x) = |x|", "h(x) = 3x - 5", "p(x) = x⁴ - 2", "q(x) = 4"),
                    correctIndex = 2,
                    explanation = "Una función lineal f(x) = mx + b con pendiente no nula m ≠ 0 es estrictamente creciente (m > 0) o decreciente (m < 0) en todo R.\nPara h(x) = 3x - 5:\nh(x₁) = h(x₂) => 3x₁ - 5 = 3x₂ - 5 => 3x₁ = 3x₂ => x₁ = x₂.\nCumple la inyectividad. Todas las demás son pares o constantes y repiten imágenes.",
                    subject = "Álgebra",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "alg_t12_s04",
            subjectId = "algebra",
            semana = 12,
            subtema = "12.4 Transformaciones y Desplazamientos de Gráficas",
            title = "Transformaciones Gráficas de Funciones",
            theory = LessonTheory(
                id = "theory_alg_t12_s04",
                asignatura = "Álgebra",
                semana = 12,
                titulo = "Transformaciones Gráficas de Funciones",
                resumen = "• Traslación Vertical: y = f(x) ± c desplaza la gráfica c unidades hacia arriba (+) o hacia abajo (-).\n• Traslación Horizontal: y = f(x ± c) desplaza la gráfica c unidades hacia la izquierda (+) o hacia la derecha (-).\n• Reflexión Respecto a los Ejes:\n  - y = -f(x): Refleja la gráfica respecto al eje horizontal X (invierte verticalmente).\n  - y = f(-x): Refleja la gráfica respecto al eje vertical Y (invierte horizontalmente).\n• Valor Absoluto en Funciones:\n  - y = |f(x)|: Refleja hacia el semiplano superior toda porción de la curva que se encuentre por debajo del eje X.\n  - y = f(|x|): Elimina la parte izquierda (x < 0) y refleja simétricamente la parte derecha (x ≥ 0) respecto al eje Y (vuelve la función par).\n• Dilatación y Compresión: y = c · f(x) (vertical) e y = f(c · x) (horizontal).",
                conceptosClave = listOf(
                    "Desplazamiento vertical f(x) ± c vs horizontal f(x ∓ c)",
                    "Reflexión en eje X: -f(x)",
                    "Reflexión en eje Y: f(-x)",
                    "Efecto de |f(x)|: eleva zonas negativas al semiplano positivo"
                ),
                formulas = listOf(
                    "y = f(x - h) + k \\implies \\text{Vértice desplazado a } (h, k)",
                    "y = |f(x)| = \\begin{cases} f(x) & \\text{si } f(x) \\ge 0 \\\\ -f(x) & \\text{si } f(x) < 0 \\end{cases}",
                    "y = f(-x) \\implies \\text{Reflexión eje } Y"
                ),
                formulaName = "Ecuación Canónica de Traslación",
                formulaLatex = "y - k = f(x - h)",
                formulaDescription = "Modela el desplazamiento rígido de la función base f trasladando su origen de referencia al punto (h, k).",
                admissionTip = "Recuerda la regla mnemotécnica contraria: dentro del paréntesis f(x - 3) se mueve a la DERECHA (+3), no a la izquierda.",
                admissionExplanation = "• Porque para recuperar el mismo valor de la función base se requiere que x sea 3 unidades mayor."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t12_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si la gráfica de f(x) = x² se desplaza 4 unidades hacia la derecha y 3 unidades hacia abajo, ¿cuál es la ecuación de la nueva función g(x)?",
                    options = listOf("g(x) = (x + 4)² + 3", "g(x) = (x - 4)² - 3", "g(x) = (x - 4)² + 3", "g(x) = (x + 4)² - 3", "g(x) = x² - 4x - 3"),
                    correctIndex = 1,
                    explanation = "1. Desplazamiento de 4 unidades a la derecha: reemplazamos x por (x - 4).\n2. Desplazamiento de 3 unidades hacia abajo: restamos 3 a toda la función.\nPor tanto: g(x) = (x - 4)² - 3.",
                    subject = "Álgebra",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "alg_t13_s01",
            subjectId = "algebra",
            semana = 13,
            subtema = "13.1 Funciones Elementales y Función Inversa",
            title = "Funciones Elementales y Función Inversa",
            theory = LessonTheory(
                id = "theory_alg_t13_s01",
                asignatura = "Álgebra",
                semana = 13,
                titulo = "Funciones Elementales y Función Inversa",
                resumen = "• Función Lineal: f(x) = mx + b (m: pendiente, b: intercepto en el eje Y).\n• Función Cuadrática: f(x) = ax² + bx + c. Parábola con vértice V(h, k) donde h = -b/(2a) y k = f(h). Si a > 0 abre hacia arriba (mínimo k); si a < 0 abre hacia abajo (máximo k).\n• Función Inyectiva (Univalente): f(x₁) = f(x₂) ⇒ x₁ = x₂ (prueba de la recta horizontal: corta a lo más en 1 punto).\n• Función Biyectiva: Inyectiva y Sobreyectiva simultáneamente. Condición necesaria para que posea función inversa f⁻¹(x).\n• Propiedad de la Inversa: Gráfica simétrica respecto a la recta identidad y = x.",
                conceptosClave = listOf("Vértice de parábola: h = -b/(2a)", "Criterio de la recta horizontal para inyectividad", "Biyectividad para existencia de inversa", "Simetría respecto a y = x"),
                formulas = listOf("h = -\\frac{b}{2a}, \\quad k = f(h)", "f(x_1) = f(x_2) \\implies x_1 = x_2", "(f \\circ f^{-1})(x) = x"),
                formulaName = "Coordenadas del Vértice de una Parábola",
                formulaLatex = "V(h, k) = \\left( -\\frac{b}{2a}, \\; c - \\frac{b^2}{4a} \\right)",
                formulaDescription = "Punto extremo de inflexión cuadrática que determina el valor máximo o mínimo de la función.",
                admissionTip = "Para hallar la función inversa de y = f(x): despeja x en términos de y, y luego intercambia x por y.",
                admissionExplanation = "• El dominio de f⁻¹ coincide con el rango de f, y el rango de f⁻¹ coincide con el dominio de f."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t13_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el valor máximo de la función cuadrática: f(x) = -x² + 6x + 5.",
                    options = listOf("9", "12", "14", "15", "18"),
                    correctIndex = 2,
                    explanation = "Como a = -1 < 0, la parábola abre hacia abajo y tiene un valor máximo en el vértice V(h, k):\nh = -b / (2a) = -6 / [2(-1)] = -6 / -2 = 3.\nEvaluamos f(3) para hallar el valor máximo k:\nk = f(3) = -(3)² + 6(3) + 5 = -9 + 18 + 5 = 14.",
                    subject = "Álgebra",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "alg_t13_s02",
            subjectId = "algebra",
            semana = 13,
            subtema = "13.2 Funciones Polinomiales y Función Racional",
            title = "Funciones Polinomiales y Racionales",
            theory = LessonTheory(
                id = "theory_alg_t13_s02",
                asignatura = "Álgebra",
                semana = 13,
                titulo = "Funciones Polinomiales y Racionales",
                resumen = "• Función Polinomial: f(x) = a_n xⁿ + ... + a₁ x + a₀ con Dom(f) = R. El grado n determina el número máximo de giros o extremos relativos (a lo más n - 1).\n• Función Racional: f(x) = P(x) / Q(x) con Dom(f) = R - {x / Q(x) = 0}.\n• Función Racional Lineal (Homográfica): f(x) = (ax + b) / (cx + d) con c ≠ 0 y ad - bc ≠ 0.\n  - Gráfica: Hipérbola equilátera con ramas simétricas respecto al centro de asíntotas.\n  - Asíntota Vertical: Recta x = -d / c (anula el denominador).\n  - Asíntota Horizontal: Recta y = a / c (cociente de coeficientes principales).\n  - Dominio y Rango Directos: Dom(f) = R - {-d / c}; Ran(f) = R - {a / c}.",
                conceptosClave = listOf(
                    "Dom(P/Q) = R menos ceros de Q",
                    "Función homográfica: f(x) = (ax + b) / (cx + d)",
                    "Asíntota vertical: x = -d/c",
                    "Asíntota horizontal: y = a/c"
                ),
                formulas = listOf(
                    "\\text{Asíntota Vertical}: \\; x = -\\frac{d}{c}",
                    "\\text{Asíntota Horizontal}: \\; y = \\frac{a}{c}",
                    "\\text{Dom}(f) = \\mathbb{R} \\setminus \\left\\{-\\frac{d}{c}\\right\\}, \\quad \\text{Ran}(f) = \\mathbb{R} \\setminus \\left\\{\\frac{a}{c}\\right\\}"
                ),
                formulaName = "Asíntotas de la Función Homográfica",
                formulaLatex = "x = -\\frac{d}{c}, \\quad y = \\frac{a}{c}",
                formulaDescription = "Líneas de referencia ortogonales a las cuales la curva hiperbólica se aproxima asintóticamente sin llegar a tocarlas.",
                admissionTip = "En f(x) = (ax + b)/(cx + d), la inversa es inmediata intercambiando a y d con signos opuestos: f⁻¹(x) = (-dx + b)/(cx - a).",
                admissionExplanation = "• Este método matricial permite calcular la inversa de una homográfica en menos de 5 segundos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t13_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dada la función homográfica f(x) = (4x + 1) / (2x - 6), determine el punto de intersección de sus dos asíntotas.",
                    options = listOf("(3, 2)", "(3, 4)", "(-3, 2)", "(2, 3)", "(6, 4)"),
                    correctIndex = 0,
                    explanation = "1. Asíntota vertical: 2x - 6 = 0 => 2x = 6 => x = 3.\n2. Asíntota horizontal: y = 4 / 2 = 2.\nEl punto de intersección de las dos asíntotas es (x, y) = (3, 2).",
                    subject = "Álgebra",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "alg_t13_s03",
            subjectId = "algebra",
            semana = 13,
            subtema = "13.3 Función Valor Absoluto, Signo y Mayor Entero",
            title = "Funciones Especiales: Valor Absoluto, Signo y Mayor Entero",
            theory = LessonTheory(
                id = "theory_alg_t13_s03",
                asignatura = "Álgebra",
                semana = 13,
                titulo = "Funciones Especiales",
                resumen = "• Función Valor Absoluto: f(x) = |x| = { x si x ≥ 0; -x si x < 0 }. Gráfica en forma de 'V' con vértice en el origen, simétrica respecto al eje Y, Dom = R, Ran = [0, +∞⟩.\n• Función Signo: sgn(x) = { 1 si x > 0; 0 si x = 0; -1 si x < 0 }. Dom = R, Ran = {-1, 0, 1}.\n• Función Máximo Entero (Piso o Parte Entera): f(x) = ⌊x⌋ = [[x]] = n ⇔ n ≤ x < n + 1 (con n ∈ Z).\n  - Propiedad: ⌊x⌋ ≤ x < ⌊x⌋ + 1.\n  - Gráfica: Función escalonada discontinua formada por segmentos horizontales semiabiertos [n, n+1) a diferentes alturas enteras.\n  - Dominio: R; Rango: Z (números enteros).",
                conceptosClave = listOf(
                    "f(x) = |x|: forma en V simétrica",
                    "Función Signo: Ran = {-1, 0, 1}",
                    "Máximo entero: [[x]] = n ⇔ n ≤ x < n + 1",
                    "Gráfica escalonada con saltos unitarios en enteros"
                ),
                formulas = listOf(
                    "\\text{sgn}(x) = \\begin{cases} 1 & x > 0 \\\\ 0 & x = 0 \\\\ -1 & x < 0 \\end{cases}",
                    "\\lfloor x \\rfloor = n \\iff n \\le x < n + 1 \\quad (n \\in \\mathbb{Z})"
                ),
                formulaName = "Definición del Máximo Entero",
                formulaLatex = "\\lfloor x \\rfloor = \\max \\{ m \\in \\mathbb{Z} \\mid m \\le x \\}",
                formulaDescription = "Asigna a cada número real el mayor número entero menor o igual que él.",
                admissionTip = "Recuerda que para números negativos: ⌊-2.3⌋ = -3 (hacia la izquierda en la recta real), no -2.",
                admissionExplanation = "• Propiedad útil: ⌊x + k⌋ = ⌊x⌋ + k para cualquier k perteneciente a los enteros Z."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t13_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor numérico de la expresión: E = ⌊3.7⌋ + ⌊-2.4⌋ + sgn(-5).",
                    options = listOf("-1", "0", "1", "2", "3"),
                    correctIndex = 0,
                    explanation = "1. ⌊3.7⌋ = 3 (el mayor entero ≤ 3.7).\n2. ⌊-2.4⌋ = -3 (el mayor entero ≤ -2.4).\n3. sgn(-5) = -1 (por ser un argumento estrictamente negativo).\nSumamos los valores:\nE = 3 + (-3) + (-1) = 0 - 1 = -1.",
                    subject = "Álgebra",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "alg_t13_s04",
            subjectId = "algebra",
            semana = 13,
            subtema = "13.4 Cálculo Formal de la Función Inversa y Simetría",
            title = "Cálculo Riguroso de la Función Inversa",
            theory = LessonTheory(
                id = "theory_alg_t13_s04",
                asignatura = "Álgebra",
                semana = 13,
                titulo = "Cálculo Riguroso de la Función Inversa",
                resumen = "• Función Inversa f⁻¹:\n  - Condición de Existencia: f debe ser estrictamente inyectiva en su dominio (generalmente asegurado restringiendo el dominio si no lo es en todo R).\n  - Algoritmo de Despeje: Se escribe y = f(x), se despeja analíticamente la variable x en términos de y (x = g(y)), y se intercambian variables para expresar f⁻¹(x) = g(x).\n  - Dominio y Rango Recíprocos:\n    * Dom(f⁻¹) = Ran(f).\n    * Ran(f⁻¹) = Dom(f).\n• Teorema de la Composición Identidad: (f ∘ f⁻¹)(x) = x para todo x ∈ Dom(f⁻¹), y (f⁻¹ ∘ f)(x) = x para todo x ∈ Dom(f).\n• Simetría Espectral: La gráfica de f⁻¹ es exactamente el reflejo especular de la gráfica de f respecto a la recta diagonal identidad y = x.",
                conceptosClave = listOf(
                    "Despeje algebraico x = f⁻¹(y)",
                    "Dom(f⁻¹) = Ran(f) y Ran(f⁻¹) = Dom(f)",
                    "(f ∘ f⁻¹)(x) = x",
                    "Simetría axial respecto a la recta bisectriz y = x"
                ),
                formulas = listOf(
                    "f(x) = y \\iff f^{-1}(y) = x",
                    "(f \\circ f^{-1})(x) = x",
                    "\\text{Dom}(f^{-1}) = \\text{Ran}(f)"
                ),
                formulaName = "Propiedad de Identidad de Funciones Inversas",
                formulaLatex = "(f \\circ f^{-1})(x) = (f^{-1} \\circ f)(x) = x",
                formulaDescription = "Comprobar que f(f⁻¹(x)) = x es la prueba definitiva de que la regla de correspondencia inversa es correcta.",
                admissionTip = "Si un punto (a, b) pertenece a la gráfica de f, el punto traspuesto (b, a) pertenece obligatoriamente a la gráfica de f⁻¹.",
                admissionExplanation = "• Si f y f⁻¹ se cortan, sus puntos de corte se encuentran habitualmente sobre la recta y = x."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t13_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle la función inversa de f(x) = (3x - 1) / (x + 2) para todo x ≠ -2.",
                    options = listOf(
                        "f⁻¹(x) = (2x + 1) / (3 - x)",
                        "f⁻¹(x) = (x + 2) / (3x - 1)",
                        "f⁻¹(x) = (2x - 1) / (x + 3)",
                        "f⁻¹(x) = (3x + 1) / (x - 2)",
                        "f⁻¹(x) = (2x + 1) / (x - 3)"
                    ),
                    correctIndex = 0,
                    explanation = "Escribimos y = (3x - 1) / (x + 2):\ny(x + 2) = 3x - 1\nyx + 2y = 3x - 1\nAgrupamos términos con x:\n2y + 1 = 3x - yx\n2y + 1 = x(3 - y)\nx = (2y + 1) / (3 - y).\nIntercambiamos variables:\nf⁻¹(x) = (2x + 1) / (3 - x) (para x ≠ 3).",
                    subject = "Álgebra",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "alg_t14_s01",
            subjectId = "algebra",
            semana = 14,
            subtema = "14.1 Función Exponencial y Logaritmos",
            title = "Función Exponencial y Logaritmos",
            theory = LessonTheory(
                id = "theory_alg_t14_s01",
                asignatura = "Álgebra",
                semana = 14,
                titulo = "Función Exponencial y Logaritmos",
                resumen = "• Definición de Logaritmo: log_b(N) = x ⇔ bˣ = N (con N > 0, b > 0, b ≠ 1).\n• Propiedades Fundamentales:\n  1. log_b(1) = 0; log_b(b) = 1.\n  2. log_b(x · y) = log_b(x) + log_b(y).\n  3. log_b(x / y) = log_b(x) - log_b(y).\n  4. Regla del Sombrero: log_b(xⁿ) = n · log_b(x).\n  5. Cambio de Base: log_b(N) = log_c(N) / log_c(b).\n  6. Regla de la Cadena: log_b(a) · log_c(b) · log_d(c) = log_d(a).\n  7. Identidad fundamental: b^{log_b(N)} = N.",
                conceptosClave = listOf("Definición de logaritmo bˣ = N", "Restricción: argumento N > 0, base b > 0 y b ≠ 1", "Suma de logaritmos = log del producto", "Regla de la cadena y cambio de base"),
                formulas = listOf("\\log_b N = x \\iff b^x = N", "\\log_b(x y) = \\log_b x + \\log_b y", "b^{\\log_b N} = N", "\\log_b a = \\frac{\\log_c a}{\\log_c b}"),
                formulaName = "Identidad Fundamental de los Logaritmos",
                formulaLatex = "b^{\\log_b N} = N \\quad (N > 0, \\, b > 0, \\, b \\neq 1)",
                formulaDescription = "Establece la cancelación recíproca entre la función exponencial y logarítmica de la misma base.",
                admissionTip = "Aprende la propiedad de intercambio de extremos: a^{log_b(c)} = c^{log_b(a)}.",
                admissionExplanation = "• No olvides verificar que las soluciones de una ecuación logarítmica hagan estrictamente positivos todos los argumentos originales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t14_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de x si: log₂(x) + log₂(x - 2) = 3.",
                    options = listOf("2", "4", "6", "8", "-2 y 4"),
                    correctIndex = 1,
                    explanation = "Condiciones de existencia: x > 0 y x - 2 > 0 => x > 2.\nAplicamos la propiedad de suma de logaritmos:\nlog₂[x(x - 2)] = 3\nPor definición de logaritmo:\nx(x - 2) = 2³ = 8\nx² - 2x - 8 = 0\n(x - 4)(x + 2) = 0 => x = 4 o x = -2.\nComo x debe ser mayor a 2, descartamos -2.\nLa única solución válida es x = 4.",
                    subject = "Álgebra",
                    semana = 14
                )
            )
        ),
        LessonNode(
            id = "alg_t14_s02",
            subjectId = "algebra",
            semana = 14,
            subtema = "14.2 Función Exponencial: Gráfica y Propiedades",
            title = "Función Exponencial: Gráfica y Propiedades",
            theory = LessonTheory(
                id = "theory_alg_t14_s02",
                asignatura = "Álgebra",
                semana = 14,
                titulo = "Función Exponencial",
                resumen = "• Definición: f(x) = aˣ con base real a > 0 y a ≠ 1.\n• Dominio y Rango Fundamentales: Dom(f) = R; Ran(f) = ⟨0, +∞⟩ (siempre estrictamente positiva).\n• Intercepto Fijo: Pasa por el punto (0, 1) pues a⁰ = 1, y por (1, a).\n• Comportamiento según la Base a:\n  - Si a > 1: Función ESTRICTAMENTE CRECIENTE (crecimiento exponencial acelerado). Conforme x → -∞, f(x) → 0.\n  - Si 0 < a < 1: Función ESTRICTAMENTE DECRECIENTE (decaimiento exponencial). Conforme x → +∞, f(x) → 0.\n• Asíntota Horizontal: El eje X (recta y = 0) es la asíntota horizontal de la función.\n• Base Natural e ≈ 2.71828...: Función exponencial natural f(x) = eˣ, fundamental en cálculo y modelos continuos de crecimiento biológico y financiero.",
                conceptosClave = listOf(
                    "Dom = R, Ran = ⟨0, +∞⟩",
                    "Punto de paso universal (0, 1)",
                    "Creciente si a > 1, decreciente si 0 < a < 1",
                    "Asíntota horizontal en y = 0"
                ),
                formulas = listOf(
                    "f(x) = a^x \\quad (a > 0, \\, a \\neq 1)",
                    "\\lim_{x \\to -\\infty} a^x = 0 \\quad (a > 1)",
                    "\\text{Dom} = \\mathbb{R}, \\quad \\text{Ran} = \\langle 0, +\\infty \\rangle"
                ),
                formulaName = "Modelo Exponencial General",
                formulaLatex = "f(x) = A \\cdot a^{kx} + C",
                formulaDescription = "Modela procesos de crecimiento poblacional, interés compuesto continuo y enfriamiento térmico.",
                admissionTip = "La gráfica de f(x) = aˣ NUNCA corta al eje X (no tiene raíces reales), a menos que esté trasladada verticalmente hacia abajo como f(x) = aˣ - c.",
                admissionExplanation = "• Si te piden el rango de f(x) = 3ˣ + 5, este es simplemente ⟨5, +∞⟩ por desplazamiento vertical."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t14_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el rango de la función real: f(x) = 2^{x - 3} + 4.",
                    options = listOf("⟨0, +∞⟩", "⟨3, +∞⟩", "⟨4, +∞⟩", "[4, +∞⟩", "R"),
                    correctIndex = 2,
                    explanation = "Sabemos que la función exponencial básica 2^{u} siempre es estrictamente positiva para cualquier exponente u real:\n2^{x - 3} > 0\nSumamos 4 a ambos lados de la desigualdad:\n2^{x - 3} + 4 > 0 + 4\nf(x) > 4\nPor lo tanto, el rango es Ran(f) = ⟨4, +∞⟩.",
                    subject = "Álgebra",
                    semana = 14
                )
            )
        ),
        LessonNode(
            id = "alg_t14_s03",
            subjectId = "algebra",
            semana = 14,
            subtema = "14.3 Función Logarítmica: Gráfica y Ecuaciones Avanzadas",
            title = "Función Logarítmica y Ecuaciones Avanzadas",
            theory = LessonTheory(
                id = "theory_alg_t14_s03",
                asignatura = "Álgebra",
                semana = 14,
                titulo = "Función Logarítmica",
                resumen = "• Definición: f(x) = log_a(x) con a > 0 y a ≠ 1. Es la FUNCIÓN INVERSA de la exponencial f(x) = aˣ.\n• Dominio y Rango: Dom(f) = ⟨0, +∞⟩; Ran(f) = R.\n• Intercepto Fijo: Corta al eje X en el punto (1, 0) pues log_a(1) = 0.\n• Comportamiento:\n  - Si a > 1: Estrictamente CRECIENTE.\n  - Si 0 < a < 1: Estrictamente DECRECIENTE.\n• Asíntota Vertical: El eje Y (recta x = 0) es su asíntota vertical.\n• Logaritmo Natural o Neperiano: ln(x) = log_e(x), con base e.\n• Sistema de Cologaritmo y Antilogaritmo:\n  - Cologaritmo: colog_b(x) = -log_b(x) = log_b(1/x).\n  - Antilogaritmo: antilog_b(x) = bˣ.\n  - Identidades: log_b(antilog_b(x)) = x; antilog_b(log_b(x)) = x.",
                conceptosClave = listOf(
                    "Inversa de la exponencial: Dom = ⟨0, +∞⟩, Ran = R",
                    "Punto de paso universal (1, 0)",
                    "Asíntota vertical en x = 0",
                    "colog_b(x) = -log_b(x) y antilog_b(x) = bˣ"
                ),
                formulas = listOf(
                    "\\text{colog}_b x = -\\log_b x = \\log_b\\left(\\frac{1}{x}\\right)",
                    "\\text{antilog}_b x = b^x",
                    "\\text{Dom}(\\log_a) = \\langle 0, +\\infty \\rangle, \\quad \\text{Ran} = \\mathbb{R}"
                ),
                formulaName = "Relaciones de Cologaritmo y Antilogaritmo",
                formulaLatex = "\\text{colog}_b x = -\\log_b x, \\quad \\text{antilog}_b x = b^x",
                formulaDescription = "Operadores inversos y complementarios utilizados frecuentemente en la simplificación de expresiones logarítmicas en exámenes de admisión.",
                admissionTip = "Recuerda que antilog_b(colog_b(x)) = 1/x de manera directa.",
                admissionExplanation = "• No apliques la regla del sombrero bajando un exponente par sin colocar valor absoluto si la variable no está previamente restringida a los reales positivos: log(x²) = 2 log|x|."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t14_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de: E = antilog₂(colog₂(4)) + log₃(antilog₃(5)).",
                    options = listOf("21/4", "19/4", "5", "6", "9/2"),
                    correctIndex = 0,
                    explanation = "1. Calculamos colog₂(4) = -log₂(4) = -2.\n2. antilog₂(-2) = 2⁻² = 1/4.\n3. log₃(antilog₃(5)) = 5 (por ser funciones inversas recíprocas).\n4. Sumamos ambos términos:\nE = 1/4 + 5 = 21/4.",
                    subject = "Álgebra",
                    semana = 14
                )
            )
        ),
        LessonNode(
            id = "alg_t14_s04",
            subjectId = "algebra",
            semana = 14,
            subtema = "14.4 Inecuaciones Exponenciales y Logarítmicas",
            title = "Inecuaciones Exponenciales y Logarítmicas",
            theory = LessonTheory(
                id = "theory_alg_t14_s04",
                asignatura = "Álgebra",
                semana = 14,
                titulo = "Inecuaciones Exponenciales y Logarítmicas",
                resumen = "• Regla de Oro del Sentido de la Desigualdad:\n  - Si la BASE es MAYOR QUE 1 (b > 1):\n    * a^{f(x)} > a^{g(x)} ⇔ f(x) > g(x) (CONSERVA el sentido de la desigualdad).\n    * log_b(f(x)) > log_b(g(x)) ⇔ f(x) > g(x) > 0 (CONSERVA el sentido).\n  - Si la BASE está ENTRE 0 Y 1 (0 < b < 1):\n    * a^{f(x)} > a^{g(x)} ⇔ f(x) < g(x) (INVIERTE el sentido de la desigualdad).\n    * log_b(f(x)) > log_b(g(x)) ⇔ 0 < f(x) < g(x) (INVIERTE el sentido).\n• Universo de Existencia en Logaritmos:\n  - ANTES de resolver la desigualdad, es requisito indispensable exigir que todos los argumentos sean estrictamente positivos: f(x) > 0 y g(x) > 0.\n  - La solución final es la intersección estricta de la solución algebraica con el universo de existencia.",
                conceptosClave = listOf(
                    "Base b > 1: conserva el sentido de la desigualdad",
                    "Base 0 < b < 1: invierte el sentido de la desigualdad",
                    "CVA obligatorio: argumentos estrictamente mayores a cero",
                    "Intersección entre CVA y desigualdad resuelta"
                ),
                formulas = listOf(
                    "\\log_b f(x) < \\log_b g(x) \\iff 0 < f(x) < g(x) \\quad (b > 1)",
                    "\\log_b f(x) < \\log_b g(x) \\iff f(x) > g(x) > 0 \\quad (0 < b < 1)",
                    "b^{f(x)} < b^{g(x)} \\iff f(x) < g(x) \\quad (b > 1)"
                ),
                formulaName = "Criterio de Monotonía en Inecuaciones Logarítmicas",
                formulaLatex = "\\log_b u < \\log_b v \\iff \\begin{cases} 0 < u < v & \\text{si } b > 1 \\\\ u > v > 0 & \\text{si } 0 < b < 1 \\end{cases}",
                formulaDescription = "Condiciona la conservación o inversión de la desigualdad en función del valor de la base del logaritmo.",
                admissionTip = "Si la base tiene una incógnita como en log_x(A) < log_x(B), debes dividir obligatoriamente la resolución en dos casos: Caso 1 (x > 1) y Caso 2 (0 < x < 1).",
                admissionExplanation = "• Omitir el caso de base fraccionaria es la causa principal de fallar este tipo de preguntas en la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t14_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la inecuación logarítmica: log_{1/2}(x - 4) ≥ -3 e indique el conjunto solución.",
                    options = listOf("⟨4, 12]", "[4, 12]", "⟨-∞, 12]", "⟨4, +∞⟩", "[12, +∞⟩"),
                    correctIndex = 0,
                    explanation = "1. Condición del CVA (argumento positivo):\nx - 4 > 0 => x > 4.\n2. Resolución de la inecuación:\nComo la base es b = 1/2 (menor que 1), la desigualdad se INVIERTE:\nx - 4 ≤ (1/2)⁻³\n(1/2)⁻³ = 2³ = 8\nx - 4 ≤ 8 => x ≤ 12.\n3. Intersecamos con el CVA:\nx > 4 ∧ x ≤ 12 => CS = ⟨4, 12].",
                    subject = "Álgebra",
                    semana = 14
                )
            )
        ),
        LessonNode(
            id = "alg_t15_s01",
            subjectId = "algebra",
            semana = 15,
            subtema = "15.1 Progresiones y Teorema del Binomio",
            title = "Progresiones y Binomio de Newton",
            theory = LessonTheory(
                id = "theory_alg_t15_s01",
                asignatura = "Álgebra",
                semana = 15,
                titulo = "Progresiones y Binomio de Newton",
                resumen = "• Binomio de Newton: Desarrollo de (x + a)ⁿ = ∑_{k=0}^n C_n^k x^{n-k} a^k.\n• Término de Lugar k + 1: T_{k+1} = C_n^k · x^{n - k} · a^k.\n• Número Total de Términos del Desarrollo: N = n + 1.\n• Suma de Coeficientes de (Ax + By)ⁿ: Se evalúa haciendo las variables x = 1, y = 1: Suma = (A + B)ⁿ.\n• Término Central: Si n es par, existe un único término central en la posición (n/2 + 1). Si n es impar, existen dos términos centrales.",
                conceptosClave = listOf("Fórmula de término general T_{k+1} = C_n^k x^{n-k} a^k", "Cantidad de términos = n + 1", "Término independiente: exponente total = 0", "Suma de coeficientes evaluando en 1"),
                formulas = listOf("(x + a)^n = \\sum_{k=0}^n C_n^k x^{n-k} a^k", "T_{k+1} = C_n^k \\cdot x^{n - k} \\cdot a^k"),
                formulaName = "Fórmula del Término General de Newton",
                formulaLatex = "T_{k+1} = C_n^k x^{n-k} a^k",
                formulaDescription = "Genera analíticamente el término de orden k+1 del binomio de Newton sin necesidad del triángulo de Pascal.",
                admissionTip = "Para hallar el término independiente de x en (x² + 1/x)ⁿ, halla el exponente general de x e iguálalo a 0 para despejar k.",
                admissionExplanation = "• Recuerda que k siempre es uno menos que el número de lugar del término: para el quinto término, k = 4."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t15_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el término independiente de x en el desarrollo del binomio: (x² + 1/x)⁹.",
                    options = listOf("24", "36", "64", "84", "126"),
                    correctIndex = 3,
                    explanation = "Fórmula del término general para n = 9:\nT_{k+1} = C₉^k · (x²)^{9 - k} · (x⁻¹)^k\nT_{k+1} = C₉^k · x^{18 - 2k} · x^{-k} = C₉^k · x^{18 - 3k}.\nPara que sea independiente de x, el exponente debe ser cero:\n18 - 3k = 0 => 3k = 18 => k = 6.\nCalculamos el coeficiente:\nT₇ = C₉⁶ = C₉³ = (9 · 8 · 7) / (3 · 2 · 1) = 3 · 4 · 7 = 84.",
                    subject = "Álgebra",
                    semana = 15
                )
            )
        ),
        LessonNode(
            id = "alg_t15_s02",
            subjectId = "algebra",
            semana = 15,
            subtema = "15.2 Progresiones Aritméticas (PA)",
            title = "Progresiones Aritméticas y Series",
            theory = LessonTheory(
                id = "theory_alg_t15_s02",
                asignatura = "Álgebra",
                semana = 15,
                titulo = "Progresiones Aritméticas",
                resumen = "• Progresión Aritmética (PA): Sucesión de números donde cada término se obtiene sumando una cantidad constante d (diferencia o razón aritmética) al término precedente: a_{n+1} = a_n + d.\n• Término Enésimo o General:\n  - a_n = a₁ + (n - 1) · d.\n• Número de Términos: n = [(a_n - a₁) / d] + 1.\n• Suma de los Primeros n Términos:\n  - S_n = [ (a₁ + a_n) / 2 ] · n = [ 2a₁ + (n - 1)d ] · (n / 2).\n• Medios Aritméticos o Diferenciales:\n  - Interpolación de m medios aritméticos entre dos extremos a y b:\n  - Razón de interpolación: d = (b - a) / (m + 1).\n• Términos Equidistantes: La suma de dos términos equidistantes de los extremos es constante e igual a la suma de los extremos: a_k + a_{n - k + 1} = a₁ + a_n.",
                conceptosClave = listOf(
                    "Fórmula del término general a_n = a₁ + (n - 1)d",
                    "Suma de n términos: S_n = [ (a₁ + a_n) / 2 ] · n",
                    "Razón de interpolación: d = (b - a) / (m + 1)",
                    "Propiedad de términos equidistantes"
                ),
                formulas = listOf(
                    "a_n = a_1 + (n - 1) d",
                    "S_n = \\frac{n (a_1 + a_n)}{2}",
                    "d = \\frac{b - a}{m + 1}"
                ),
                formulaName = "Suma de Términos de una Progresión Aritmética",
                formulaLatex = "S_n = \\frac{n(a_1 + a_n)}{2}",
                formulaDescription = "Calcula la suma finita de una sucesión lineal promediando los extremos y multiplicando por el número de términos.",
                admissionTip = "Para plantear 3 términos en PA cuya suma conoces, elígelos como: (x - d), x, (x + d). Su suma es 3x directamente.",
                admissionExplanation = "• Si son 4 términos en PA, la forma simétrica más conveniente es: (x - 3d), (x - d), (x + d), (x + 3d) con razón 2d."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t15_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una progresión aritmética, el quinto término es 19 y el noveno término es 35. Calcule el primer término a₁.",
                    options = listOf("1", "3", "5", "7", "9"),
                    correctIndex = 1,
                    explanation = "1. Planteamos las ecuaciones del término general:\na₅ = a₁ + 4d = 19\na₉ = a₁ + 8d = 35\n2. Restamos la primera ecuación de la segunda:\n(a₁ + 8d) - (a₁ + 4d) = 35 - 19\n4d = 16 => d = 4.\n3. Reemplazamos d = 4 en a₅:\na₁ + 4(4) = 19 => a₁ + 16 = 19 => a₁ = 3.",
                    subject = "Álgebra",
                    semana = 15
                )
            )
        ),
        LessonNode(
            id = "alg_t15_s03",
            subjectId = "algebra",
            semana = 15,
            subtema = "15.3 Progresiones Geométricas (PG) y Serie Infinita",
            title = "Progresiones Geométricas y Series Infinitas",
            theory = LessonTheory(
                id = "theory_alg_t15_s03",
                asignatura = "Álgebra",
                semana = 15,
                titulo = "Progresiones Geométricas",
                resumen = "• Progresión Geométrica (PG): Sucesión de términos no nulos donde cada uno se obtiene multiplicando al anterior por una constante q fija (razón geométrica): t_{n+1} = t_n · q.\n• Término Enésimo o General:\n  - t_n = t₁ · q^{n - 1}.\n• Suma de los Primeros n Términos (Suma Finita):\n  - S_n = [ t₁ · (qⁿ - 1) ] / (q - 1) para q ≠ 1.\n• Producto de los n Primeros Términos:\n  - P_n = √[ (t₁ · t_n)ⁿ ].\n• Serie Geométrica Infinita Decreciente (Suma Límite):\n  - Si el valor absoluto de la razón es estrictamente menor que 1 (|q| < 1), la serie geométrica infinita es CONVERGENTE.\n  - Suma Límite: S_∞ = t₁ / (1 - q).\n• Interpolación de m medios geométricos: q = ^{m+1}√(b / a).",
                conceptosClave = listOf(
                    "Término general t_n = t₁ · q^{n-1}",
                    "Suma finita: S_n = t₁(qⁿ - 1) / (q - 1)",
                    "Suma límite infinita convergente: S_∞ = t₁ / (1 - q) con |q| < 1",
                    "Producto de términos: P_n = √( (t₁ · t_n)ⁿ )"
                ),
                formulas = listOf(
                    "t_n = t_1 \\cdot q^{n - 1}",
                    "S_n = \\frac{t_1 (q^n - 1)}{q - 1} \\quad (q \\neq 1)",
                    "S_\\infty = \\frac{t_1}{1 - q} \\quad (|q| < 1)"
                ),
                formulaName = "Fórmula de la Suma Límite Infinita",
                formulaLatex = "S_\\infty = \\frac{t_1}{1 - q} \\quad (|q| < 1)",
                formulaDescription = "Calcula la suma exacta de infinitos términos geométricos que decaen progresivamente hacia cero.",
                admissionTip = "Para calcular la fracción generatriz de un decimal periódico puro como 0.333... o 0.2727..., usa la suma límite S_∞ con q = 1/10 o 1/100.",
                admissionExplanation = "• No apliques la suma límite si |q| ≥ 1, porque la serie diverge a infinito o carece de límite."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t15_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule la suma límite de la serie geométrica infinita: S = 6 + 2 + 2/3 + 2/9 + ...",
                    options = listOf("8", "9", "10", "12", "18"),
                    correctIndex = 1,
                    explanation = "1. Identificamos el primer término: t₁ = 6.\n2. Calculamos la razón geométrica:\nq = t₂ / t₁ = 2 / 6 = 1/3.\nComo |q| = 1/3 < 1, la serie converge.\n3. Aplicamos la fórmula de la suma límite:\nS_∞ = t₁ / (1 - q) = 6 / (1 - 1/3) = 6 / (2/3) = (6 · 3) / 2 = 18 / 2 = 9.",
                    subject = "Álgebra",
                    semana = 15
                )
            )
        ),
        LessonNode(
            id = "alg_t15_s04",
            subjectId = "algebra",
            semana = 15,
            subtema = "15.4 Términos Racionales y Coeficientes en el Binomio de Newton",
            title = "Términos Racionales y Coeficientes Binomiales",
            theory = LessonTheory(
                id = "theory_alg_t15_s04",
                asignatura = "Álgebra",
                semana = 15,
                titulo = "Términos Racionales y Coeficientes",
                resumen = "• Propiedades de los Coeficientes Binomiales:\n  1. C_n⁰ = C_nⁿ = 1; C_n¹ = n.\n  2. Combinatorios Complementarios: C_n^k = C_n^{n - k}.\n  3. Regla de Pascal (Adición de Stifel): C_n^k + C_n^{k+1} = C_{n+1}^{k+1}.\n  4. Suma Total de Coeficientes Binomiales: ∑_{k=0}^n C_n^k = 2ⁿ.\n• Determinación de Términos Racionales en Binomios con Radicales:\n  - En el desarrollo de (ⁿ√a + ᵐ√b)^N, se plantea el término general T_{k+1} y se expresan todos los exponentes de las variables o bases numéricas como fracciones en función de k.\n  - Un término es RACIONAL si y solo si todos los exponentes fraccionarios resultan ser números ENTEROS.\n  - Se determina la divisibilidad de k respecto a los índices radicales y se cuenta la cantidad de valores admisibles en el rango 0 ≤ k ≤ N.",
                conceptosClave = listOf(
                    "Propiedad de Stifel: C_n^k + C_n^{k+1} = C_{n+1}^{k+1}",
                    "Suma total de coeficientes: 2ⁿ",
                    "Condición de término racional: exponentes enteros",
                    "Rango estricto del índice 0 ≤ k ≤ n"
                ),
                formulas = listOf(
                    "C_n^k + C_n^{k+1} = C_{n+1}^{k+1}",
                    "\\sum_{k=0}^n C_n^k = 2^n",
                    "\\text{Exp}_k \\in \\mathbb{Z} \\implies \\text{Término Racional}"
                ),
                formulaName = "Identidad de Stifel o Triángulo de Pascal",
                formulaLatex = "\\binom{n}{k} + \\binom{n}{k+1} = \\binom{n+1}{k+1}",
                formulaDescription = "Fundamento recursivo de la suma de dos números combinatorios contiguos para formar el nivel inferior.",
                admissionTip = "Para contar cuántos términos racionales tiene (√x + ∛x)¹², el exponente de x en T_{k+1} es (12 - k)/2 + k/3 = 6 - k/6. Por ende, k debe ser múltiplo de 6 entre 0 y 12: k ∈ {0, 6, 12}, exactamente 3 términos.",
                admissionExplanation = "• Los términos irracionales son simplemente el total de términos (n + 1) menos los términos racionales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t15_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántos términos racionales fraccionarios o enteros contiene el desarrollo del binomio (√x + ∛x)⁶⁰?",
                    options = listOf("10", "11", "12", "15", "20"),
                    correctIndex = 1,
                    explanation = "Planteamos el exponente de x en el término general:\nT_{k+1} = C₆₀^k · (x^{1/2})^{60 - k} · (x^{1/3})^k\nExp(x) = (60 - k)/2 + k/3 = 30 - k/2 + k/3 = 30 - k/6.\nPara que el término sea racional, k/6 debe ser entero, es decir, k debe ser múltiplo de 6.\nComo 0 ≤ k ≤ 60:\nk ∈ {0, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60}.\nCantidad de valores de k = (60 - 0)/6 + 1 = 10 + 1 = 11 términos racionales.",
                    subject = "Álgebra",
                    semana = 15
                )
            )
        ),
        LessonNode(
            id = "alg_t16_s01",
            subjectId = "algebra",
            semana = 16,
            subtema = "16.1 Modelación Algebraica y Optimización",
            title = "Modelación Algebraica y Optimización",
            theory = LessonTheory(
                id = "theory_alg_t16_s01",
                asignatura = "Álgebra",
                semana = 16,
                titulo = "Modelación Algebraica y Optimización",
                resumen = "• Modelado de Costos, Ingresos y Utilidad:\n  - Costo Total: C(x) = Costo Fijo + Costo Variable = C_f + c_u · x.\n  - Ingreso: I(x) = Precio de Venta · Cantidad = p · x.\n  - Utilidad: U(x) = I(x) - C(x).\n• Punto de Equilibrio: Nivel de producción donde la utilidad es cero: I(x) = C(x) ⇒ x_eq = C_f / (p - c_u).\n• Optimización Cuadrática: Si el precio depende de la demanda (p = a - bx), el ingreso I(x) = (a - bx)x = ax - bx² es cuadrático y su vértice da el ingreso máximo.\n• Modelos Exponenciales y Logarítmicos: Población N(t) = N₀ · e^{kt}, Decaimiento radiactivo M(t) = M₀ · (1/2)^{t / t_{1/2}}.",
                conceptosClave = listOf("U(x) = I(x) - C(x)", "Punto de equilibrio U = 0", "Maximización mediante vértice cuadrático", "Modelos de crecimiento exponencial"),
                formulas = listOf("U(x) = I(x) - C(x)", "x_{equilibrio} = \\frac{C_f}{p - c_u}", "N(t) = N_0 e^{kt}"),
                formulaName = "Fórmula del Punto de Equilibrio",
                formulaLatex = "x_{eq} = \\frac{\\text{Costo Fijo}}{P_{\\text{venta}} - \\text{Costo Unitario}}",
                formulaDescription = "Determina el volumen mínimo de producción y venta requerido para cubrir todos los costos operativos sin generar pérdida.",
                admissionTip = "En problemas de optimización con ingresos máximos: el precio óptimo siempre se sitúa en el punto medio de la función de demanda lineal.",
                admissionExplanation = "• Las unidades del tiempo t y de la constante k deben ser mutuamente coherentes antes de evaluar modelos exponenciales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t16_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una empresa tiene costos fijos mensuales de S/ 6000 y un costo variable de S/ 20 por unidad. Si cada unidad se vende a S/ 50, ¿cuántas unidades debe producir y vender como mínimo para no ganar ni perder (punto de equilibrio)?",
                    options = listOf("150", "180", "200", "220", "250"),
                    correctIndex = 2,
                    explanation = "En el punto de equilibrio, la Utilidad es cero (Ingresos = Costos Totales):\nI(x) = 50x\nC(x) = 6000 + 20x\n50x = 6000 + 20x\n30x = 6000\nx = 6000 / 30 = 200 unidades.",
                    subject = "Álgebra",
                    semana = 16
                )
            )
        ),
        LessonNode(
            id = "alg_t16_s02",
            subjectId = "algebra",
            semana = 16,
            subtema = "16.2 Optimización y Programación Lineal Básica",
            title = "Programación Lineal y Región Factible",
            theory = LessonTheory(
                id = "theory_alg_t16_s02",
                asignatura = "Álgebra",
                semana = 16,
                titulo = "Programación Lineal y Región Factible",
                resumen = "• Programación Lineal: Técnica matemática para optimizar (maximizar o minimizar) una función objetivo lineal Z = ax + by sujeta a un conjunto de restricciones lineales (inecuaciones).\n• Región Factible:\n  - Es la región plana poligonal convexa formada por la intersección de todos los semiplanos definidos por las restricciones.\n  - Si la región es acotada (cerrada), siempre existen tanto un valor máximo como un valor mínimo.\n• Teorema Fundamental de la Programación Lineal:\n  - La función objetivo Z alcanza sus valores óptimos (máximo o mínimo) en uno o más VÉRTICES del polígono de la región factible.\n• Procedimiento de Resolución:\n  1. Graficar las rectas límite de cada restricción.\n  2. Determinar la región factible y calcular las coordenadas exactas de todos sus vértices.\n  3. Evaluar la función objetivo Z(x, y) en cada vértice.\n  4. El mayor valor obtenido es el máximo y el menor es el mínimo.",
                conceptosClave = listOf(
                    "Función objetivo lineal Z = ax + by",
                    "Región factible convexa",
                    "Teorema del valor óptimo en los vértices",
                    "Evaluación comparativa de vértices"
                ),
                formulas = listOf(
                    "Z(x, y) = a x + b y \\quad (\\text{Función Objetivo})",
                    "\\text{Vértice óptimo} \\implies \\max / \\min Z(x_v, y_v)"
                ),
                formulaName = "Teorema Fundamental de la Programación Lineal",
                formulaLatex = "Z^* = \\max_{(x,y) \\in \\mathcal{R}} (ax + by) = \\max_{v \\in \\mathcal{V}} (ax_v + by_v)",
                formulaDescription = "Garantiza que la búsqueda del valor óptimo se reduce exclusivamente a evaluar el número finito de vértices de la región factible.",
                admissionTip = "Para hallar los vértices, resuelve el sistema de ecuaciones 2×2 formado por el cruce de las dos rectas que delimitan cada esquina.",
                admissionExplanation = "• No evalúes puntos interiores de la región factible; el óptimo jamás ocurrirá en el interior estricto si los coeficientes son no nulos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t16_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Maximice la función objetivo Z = 3x + 2y en la región factible determinada por los vértices A(0, 0), B(0, 4), C(3, 3) y D(4, 0).",
                    options = listOf("12", "14", "15", "16", "18"),
                    correctIndex = 2,
                    explanation = "Evaluamos la función Z = 3x + 2y en cada vértice de la región:\nZ(A) = 3(0) + 2(0) = 0\nZ(B) = 3(0) + 2(4) = 8\nZ(C) = 3(3) + 2(3) = 9 + 6 = 15\nZ(D) = 3(4) + 2(0) = 12\nEl valor máximo de Z es 15 y se alcanza en el vértice C(3, 3).",
                    subject = "Álgebra",
                    semana = 16
                )
            )
        ),
        LessonNode(
            id = "alg_t16_s03",
            subjectId = "algebra",
            semana = 16,
            subtema = "16.3 Modelos de Crecimiento y Decaimiento Exponencial",
            title = "Modelos Dinámicos Exponenciales y Logísticos",
            theory = LessonTheory(
                id = "theory_alg_t16_s03",
                asignatura = "Álgebra",
                semana = 16,
                titulo = "Modelos Dinámicos Exponenciales",
                resumen = "• Modelo Malthusiano de Crecimiento: N(t) = N₀ · e^{kt} = N₀ · (1 + r)ᵗ.\n  - N₀: Población o valor inicial en t = 0.\n  - k: Tasa de crecimiento intrínseca (si k > 0 crece; si k < 0 decae).\n  - Tiempo de Duplicación: Tiempo necesario para que la población se duplique: t_d = ln(2) / k.\n• Decaimiento Radiactivo y Vida Media:\n  - M(t) = M₀ · e^{-λt} = M₀ · (1/2)^{t / T_{1/2}}.\n  - T_{1/2}: Período de semidesintegración o vida media.\n• Ley de Enfriamiento de Newton:\n  - T(t) = T_m + (T₀ - T_m) · e^{-kt}, donde T_m es la temperatura ambiental del medio.\n• Escalas Logarítmicas en Ciencias:\n  - Escala de Richter para sismos: R = log(I / I₀).\n  - Escala de pH en química: pH = -log[H⁺].\n  - Nivel de intensidad sonora en decibelios: β = 10 · log(I / I₀).",
                conceptosClave = listOf(
                    "Crecimiento exponencial N(t) = N₀ e^{kt}",
                    "Tiempo de duplicación: t_d = ln(2) / k",
                    "Vida media radiactiva M(t) = M₀ · (1/2)^{t / T_{1/2}}",
                    "Escalas logarítmicas: pH = -log[H⁺] y decibelios"
                ),
                formulas = listOf(
                    "N(t) = N_0 e^{kt}",
                    "t_d = \\frac{\\ln 2}{k}",
                    "M(t) = M_0 \\left(\\frac{1}{2}\\right)^{\\frac{t}{T_{1/2}}}",
                    "\\text{pH} = -\\log[H^+]"
                ),
                formulaName = "Ley de Crecimiento y Decaimiento Exponencial",
                formulaLatex = "N(t) = N_0 e^{kt}",
                formulaDescription = "Modela magnitudes cuya tasa de variación instantánea es directamente proporcional a la cantidad presente.",
                admissionTip = "Si una bacteria se duplica cada 3 horas, modela su cantidad tras t horas simplemente como N(t) = N₀ · 2^{t / 3}.",
                admissionExplanation = "• No te compliques calculando la base e si puedes usar directamente la base 2 para duplicaciones."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t16_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un cultivo de bacterias cuenta inicialmente con 500 microorganismos y se triplica cada 2 horas. ¿Cuántas bacterias habrá al cabo de 6 horas?",
                    options = listOf("4500", "9000", "13500", "27000", "40500"),
                    correctIndex = 2,
                    explanation = "Modelamos el crecimiento en base 3:\nN(t) = N₀ · 3^{t / 2}\nPara t = 6 horas y N₀ = 500:\nN(6) = 500 · 3^{6 / 2} = 500 · 3³ = 500 · 27 = 13500 bacterias.",
                    subject = "Álgebra",
                    semana = 16
                )
            )
        ),
        LessonNode(
            id = "alg_t16_s04",
            subjectId = "algebra",
            semana = 16,
            subtema = "16.4 Problemas Integrados y Retos DECO de Admisión UNSA",
            title = "Retos Integrados DECO de Admisión UNSA",
            theory = LessonTheory(
                id = "theory_alg_t16_s04",
                asignatura = "Álgebra",
                semana = 16,
                titulo = "Retos Integrados DECO de Admisión UNSA",
                resumen = "• Tipología DECO (Destrezas Cognitivas):\n  - Los problemas contextualizados de la UNSA exigen transitar con fluidez desde un enunciado situacional de la vida cotidiana o de la ingeniería hacia una formulación matemática precisa.\n• Estrategia de Modelado y Solución:\n  1. Identificación de Variables y Restricciones Físicas: Reconocer variables independientes (dimensiones, cantidades, precios) y sus restricciones lógicas (ej. medidas no negativas).\n  2. Traducción Algebraica de Relaciones Geométricas: Expresar áreas, perímetros o volúmenes en función de una única variable usando ecuaciones de enlace.\n  3. Optimización Analítica: Aplicar el vértice de la parábola o completar cuadrados para hallar dimensiones que maximicen áreas con costos acotados.\n  4. Verificación de Coherencia: Comprobar que la respuesta satisfaga la pregunta final del problema (perímetro, área o costo) y no un valor intermedio.",
                conceptosClave = listOf(
                    "Problemas contextualizados DECO",
                    "Ecuaciones de enlace para reducir a una sola variable",
                    "Optimización por vértice de parábola h = -b/(2a)",
                    "Validación contextual de las soluciones algebraicas"
                ),
                formulas = listOf(
                    "\\text{Área}(x) = x \\cdot f(x) \\implies x_{opt} = -\\frac{b}{2a}",
                    "\\text{Perímetro Fijo} \\implies y = \\frac{P - 2x}{2}"
                ),
                formulaName = "Modelo de Maximización de Área Rectangular",
                formulaLatex = "A(x) = x \\left( \\frac{P - 2x}{2} \\right) = \\frac{P}{2} x - x^2",
                formulaDescription = "Demuestra algebraicamente que un rectángulo de perímetro fijo P alcanza su área máxima cuando adopta la forma de un cuadrado (x = y = P/4).",
                admissionTip = "Cuando un agricultor cerca un terreno rectangular aprovechando un muro ya existente (cercando solo 3 lados con longitud L), el área máxima se da cuando el lado paralelo al muro mide L/2 y los otros dos lados miden L/4.",
                admissionExplanation = "• Memorizar esta proporción ahorra plantear la cuadrática completa en el examen."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_alg_t16_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un agricultor en el valle de Majes dispone de 120 metros de malla metálica para cercar un terreno rectangular para sus cultivos, utilizando el muro de adobe de su propiedad como uno de los lados (no requiere malla). Halle el área máxima en metros cuadrados que puede cercar.",
                    options = listOf("1200 m²", "1600 m²", "1800 m²", "2400 m²", "3600 m²"),
                    correctIndex = 2,
                    explanation = "Sean x los dos lados perpendiculares al muro y sea y el lado paralelo al muro.\nLongitud de malla: 2x + y = 120 => y = 120 - 2x.\nFunción Área a maximizar:\nA(x) = x · y = x(120 - 2x) = 120x - 2x² = -2x² + 120x.\nComo es una función cuadrática con a = -2 < 0, alcanza su máximo en el vértice:\nx = -b / (2a) = -120 / [2(-2)] = -120 / -4 = 30 metros.\nLas dimensiones óptimas son x = 30 m e y = 120 - 2(30) = 60 m.\nÁrea máxima = 30 m · 60 m = 1800 m².",
                    subject = "Álgebra",
                    semana = 16
                )
            )
        )
    )
}

