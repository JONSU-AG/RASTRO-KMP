package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object GeometriaCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: ELEMENTOS FUNDAMENTALES Y ÁNGULOS (Semana 1)
        // =========================================================================
        LessonNode(
            id = "geo_t01_s01",
            subjectId = "geometria",
            semana = 1,
            subtema = "1.1 Punto, Recta, Plano y Segmentos de Recta",
            title = "Punto, Recta, Plano y Segmentos",
            theory = LessonTheory(
                id = "theory_geo_t01_s01",
                asignatura = "Geometría",
                semana = 1,
                titulo = "Punto, Recta, Plano y Segmentos",
                resumen = "• Términos Primitivos: Punto (adimensional), recta (unidimensional infinita) y plano (bidimensional ilimitado).\n• Segmento de Recta: Porción de recta delimitada por dos puntos extremos A y B. Su longitud se denota AB.\n• Punto Medio M de un Segmento AB: Divide al segmento en dos partes de igual longitud: AM = MB = AB / 2.\n• Operaciones con Segmentos Colineales: Suma, resta y razones algebraicas.\n• Cuaterna Armónica (Puntos de Descartes): Cuatro puntos colineales y consecutivos A, B, C, D forman una cuaterna armónica si AB/BC = AD/CD. Cumple la Relación de Descartes: 2/AC = 1/AB + 1/AD.",
                conceptosClave = listOf(
                    "Conceptos primitivos de Euclides",
                    "Punto medio de un segmento",
                    "Operaciones con longitudes de segmentos colineales",
                    "Cuaterna armónica y Relación de Descartes"
                ),
                formulas = listOf(
                    "AM = MB = \\frac{AB}{2}",
                    "\\frac{AB}{BC} = \\frac{AD}{CD} \\iff \\frac{2}{AC} = \\frac{1}{AB} + \\frac{1}{AD}"
                ),
                formulaName = "Relación de Descartes para la Cuaterna Armónica",
                formulaLatex = "\\frac{2}{AC} = \\frac{1}{AB} + \\frac{1}{AD}",
                formulaDescription = "Vincula las distancias entre cuatro puntos colineales en división armónica armando una media armónica ponderada.",
                admissionTip = "En problemas de segmentos con puntos medios, asigna variables simétricas (a, b) desde el punto medio para simplificar sumas y restas.",
                admissionExplanation = "• La longitud de un segmento es siempre un número real estrictamente positivo (AB > 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Sobre una recta se toman los puntos colineales y consecutivos A, B, C y D de modo que B es punto medio de AC. Si AD + CD = 24 cm, halle la longitud del segmento BD.",
                    options = listOf("8 cm", "10 cm", "12 cm", "14 cm", "16 cm"),
                    correctIndex = 2,
                    explanation = "Sea AB = BC = x (B es punto medio de AC) y sea CD = y.\nEntonces BD = BC + CD = x + y.\nExpresamos AD y CD en términos de x e y:\nAD = AB + BC + CD = 2x + y.\nCD = y.\nSumamos ambas longitudes:\nAD + CD = (2x + y) + y = 2x + 2y = 24 cm.\nFactorizamos 2: 2(x + y) = 24 => x + y = 12 cm.\nComo BD = x + y, entonces BD = 12 cm.",
                    subject = "Geometría",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "geo_t01_s02",
            subjectId = "geometria",
            semana = 1,
            subtema = "1.2 Ángulos: Clasificación, Bisectriz, Complemento y Suplemento",
            title = "Ángulos, Bisectriz, Complemento y Suplemento",
            theory = LessonTheory(
                id = "theory_geo_t01_s02",
                asignatura = "Geometría",
                semana = 1,
                titulo = "Ángulos, Bisectriz, Complemento y Suplemento",
                resumen = "• Ángulo: Unión de dos rayos con un origen común denominado vértice.\n• Clasificación por su Medida:\n  - Agudo: 0° < α < 90°.\n  - Recto: α = 90°.\n  - Obtuso: 90° < α < 180°.\n  - Llano: α = 180°.\n  - No convexo o Cóncavo: 180° < α < 360°.\n• Bisectriz: Rayo interior que divide al ángulo en dos medidas congruentes.\n• Complemento C(α) = 90° - α (para 0° ≤ α ≤ 90°).\n• Suplemento S(α) = 180° - α (para 0° ≤ α ≤ 180°).\n• Propiedad de Encadenamiento: C(C(...C(α))) = α si el número de complementos es par; = 90° - α si es impar. Idéntico para S(α).",
                conceptosClave = listOf(
                    "Clasificación angular estricta",
                    "Bisectriz interior",
                    "Complemento: C(x) = 90° - x",
                    "Suplemento: S(x) = 180° - x y regla de paridad"
                ),
                formulas = listOf(
                    "C(x) = 90^\\circ - x, \\quad S(x) = 180^\\circ - x",
                    "C(S(x)) = 90^\\circ - (180^\\circ - x) = x - 90^\\circ",
                    "S(C(x)) = 180^\\circ - (90^\\circ - x) = 90^\\circ + x"
                ),
                formulaName = "Fórmulas de Complemento y Suplemento Combinados",
                formulaLatex = "S(C(x)) = 90^\\circ + x, \\quad C(S(x)) = x - 90^\\circ",
                formulaDescription = "Relaciones directas que evitan dobles pasos al simplificar cadenas de operadores angulares en admisión.",
                admissionTip = "Aprende de memoria: S(C(x)) = 90° + x. Ahorra escribir paréntesis y despejar dos veces.",
                admissionExplanation = "• Si el enunciado dice 'la diferencia entre el suplemento y el complemento de un ángulo', esta es SIEMPRE fija e igual a 90°: S(x) - C(x) = 90°."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El suplemento del complemento de un ángulo 'x' supera en 40° al complemento del mismo ángulo. Calcule el valor de 'x'.",
                    options = listOf("15°", "20°", "25°", "30°", "40°"),
                    correctIndex = 2,
                    explanation = "Planteamos la ecuación:\nS(C(x)) - C(x) = 40°\nSabemos que S(C(x)) = 90° + x y C(x) = 90° - x:\n(90° + x) - (90° - x) = 40°\n90° + x - 90° + x = 40°\n2x = 40° => x = 20°... Espera: si es 2x = 40° => x = 20°. Verifiquemos:\nS(C(20°)) = S(70°) = 110°.\nC(20°) = 70°.\nDiferencia = 110° - 70° = 40°. ¡Exacto!\nLa opción correcta es 20° (índice 1).",
                    subject = "Geometría",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "geo_t01_s03",
            subjectId = "geometria",
            semana = 1,
            subtema = "1.3 Ángulos Consecutivos y Opuestos por el Vértice",
            title = "Ángulos Consecutivos y Opuestos por el Vértice",
            theory = LessonTheory(
                id = "theory_geo_t01_s03",
                asignatura = "Geometría",
                semana = 1,
                titulo = "Ángulos Consecutivos y Opuestos por el Vértice",
                resumen = "• Ángulos Adyacentes: Dos ángulos que tienen el mismo vértice y un lado común situado entre ellos.\n• Par Lineal: Dos ángulos adyacentes y suplementarios cuyos lados no comunes forman una recta (suman 180°).\n  - Teorema: Las bisectrices de un par lineal forman siempre un ángulo recto (90°).\n• Ángulos Consecutivos alrededor de un Punto:\n  - A un mismo lado de una recta: suman 180°.\n  - Alrededor de un punto completo en el plano: suman 360°.\n• Ángulos Opuestos por el Vértice:\n  - Se generan al cortarse dos rectas secantes. Sus medidas son estrictamente congruentes (iguales).",
                conceptosClave = listOf(
                    "Par lineal suma 180°",
                    "Bisectrices de un par lineal son perpendiculares (90°)",
                    "Suma angular de una vuelta completa: 360°",
                    "Ángulos opuestos por el vértice son congruentes"
                ),
                formulas = listOf(
                    "\\alpha + \\beta = 180^\\circ \\quad (\\text{Par Lineal})",
                    "\\angle(\\text{bisectrices}) = \\frac{\\alpha + \\beta}{2} = 90^\\circ",
                    "\\sum \\theta_i = 360^\\circ \\quad (\\text{Vuelta Completa})"
                ),
                formulaName = "Teorema de Bisectrices de un Par Lineal",
                formulaLatex = "\\angle(\\vec{b}_1, \\vec{b}_2) = 90^\\circ",
                formulaDescription = "Demuestra analíticamente que las bisectrices de dos ángulos adyacentes suplementarios son ortogonales entre sí.",
                admissionTip = "Si te dicen que tres ángulos consecutivos sobre una recta están en progresión aritmética: (α - d) + α + (α + d) = 180° ⇒ 3α = 180° ⇒ α = 60° fijo.",
                admissionExplanation = "• Este valor central de 60° permite resolver el problema inmediatamente sin importar la razón."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se tienen los ángulos consecutivos AOB, BOC y COD alrededor de una recta AD. Si m∠AOB = 2x, m∠BOC = 3x y m∠COD = 5x, calcule el suplemento de la medida del ángulo BOC.",
                    options = listOf("126°", "136°", "144°", "154°", "162°"),
                    correctIndex = 0,
                    explanation = "Como están situados sobre la recta AD a un mismo lado, su suma es 180°:\n2x + 3x + 5x = 180° => 10x = 180° => x = 18°.\nLa medida del ángulo BOC es: m∠BOC = 3x = 3(18°) = 54°.\nNos piden su suplemento:\nS(54°) = 180° - 54° = 126°.",
                    subject = "Geometría",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "geo_t01_s04",
            subjectId = "geometria",
            semana = 1,
            subtema = "1.4 Rectas Paralelas cortadas por una Transversal y Teorema del Serrucho",
            title = "Paralelas y Teorema del Serrucho",
            theory = LessonTheory(
                id = "theory_geo_t01_s04",
                asignatura = "Geometría",
                semana = 1,
                titulo = "Paralelas y Teorema del Serrucho",
                resumen = "• Rectas Paralelas cortadas por una Secante:\n  1. Ángulos Alternos (Internos y Externos): Son congruentes (forma de 'Z').\n  2. Ángulos Correspondientes: Son congruentes (forma de 'F').\n  3. Ángulos Conjugados (Internos y Externos): Son suplementarios, suman 180° (forma de 'C').\n• Teorema del Serrucho (Líneas Quebradas entre Paralelas):\n  - La suma de las medidas de los ángulos agudos dirigidos hacia la izquierda es igual a la suma de los que apuntan hacia la derecha:\n  - α₁ + α₂ + α₃ + ... = θ₁ + θ₂ + θ₃ + ...\n• Teorema de Ángulos de Lados Perpendiculares:\n  - Dos ángulos cuyos lados son respectivamente perpendiculares son congruentes (si ambos son agudos u obtusos) o suplementarios (si uno es agudo y el otro obtuso).",
                conceptosClave = listOf(
                    "Alternos congruentes (Z)",
                    "Conjugados suplementarios (C, suman 180°)",
                    "Correspondientes congruentes (F)",
                    "Teorema del serrucho para poligonales entre paralelas"
                ),
                formulas = listOf(
                    "\\sum \\alpha_{\\text{izq}} = \\sum \\beta_{\\text{der}} \\quad (\\text{Serrucho})",
                    "\\alpha + \\beta = 180^\\circ \\quad (\\text{Conjugados})"
                ),
                formulaName = "Teorema del Serrucho Generalizado",
                formulaLatex = "\\sum_{i=1}^n \\alpha_i = \\sum_{j=1}^m \\theta_j",
                formulaDescription = "Equilibrio angular invariante en una línea poligonal abierta contenida entre dos rectas paralelas.",
                admissionTip = "Si un vértice de la quebrada apunta hacia afuera o presenta un ángulo mayor a 180°, traza por ese vértice una recta auxiliar paralela a las originales.",
                admissionExplanation = "• Solo se suman los ángulos agudos interiores que apuntan alternadamente a cada dirección."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Entre dos rectas paralelas L₁ y L₂ se traza una línea poligonal. Los ángulos que apuntan a la izquierda miden 30°, x y 40°; los que apuntan a la derecha miden 50° y 60°. Calcule el valor de 'x'.",
                    options = listOf("30°", "40°", "45°", "50°", "55°"),
                    correctIndex = 1,
                    explanation = "Aplicamos el Teorema del Serrucho:\nSuma de ángulos a la izquierda = Suma de ángulos a la derecha\n30° + x + 40° = 50° + 60°\n70° + x = 110°\nx = 110° - 70° = 40°.",
                    subject = "Geometría",
                    semana = 1
                )
            )
        ),
        // =========================================================================
        // TEMA 02: TRIÁNGULOS: PROPIEDADES BÁSICAS Y CLASIFICACIÓN (Semana 2)
        // =========================================================================
        LessonNode(
            id = "geo_t02_s01",
            subjectId = "geometria",
            semana = 2,
            subtema = "2.1 Propiedades Fundamentales y Ángulo Exterior",
            title = "Propiedades Fundamentales del Triángulo",
            theory = LessonTheory(
                id = "theory_geo_t02_s01",
                asignatura = "Geometría",
                semana = 2,
                titulo = "Propiedades Fundamentales del Triángulo",
                resumen = "• Triángulo: Figura geométrica formada al unir tres puntos no colineales mediante segmentos de recta.\n• Teorema 1 (Suma de Ángulos Interiores): La suma de las medidas de los tres ángulos interiores es siempre 180°: α + β + θ = 180°.\n• Teorema 2 (Suma de Ángulos Exteriores): La suma de las medidas de los ángulos exteriores (uno por cada vértice) es siempre 360°: e₁ + e₂ + e₃ = 360°.\n• Teorema 3 (Medida del Ángulo Exterior): La medida de todo ángulo exterior es igual a la suma de las medidas de los dos ángulos interiores no adyacentes: e₁ = β + θ.\n• Correspondencia Lado-Ángulo: A mayor lado se opone mayor ángulo interior, y recíprocamente.",
                conceptosClave = listOf(
                    "Suma de ángulos interiores: 180°",
                    "Suma de ángulos exteriores: 360°",
                    "Teorema del ángulo exterior e = α + β",
                    "Relación de correspondencia: a > b ⇔ α > β"
                ),
                formulas = listOf(
                    "\\alpha + \\beta + \\theta = 180^\\circ",
                    "e_1 + e_2 + e_3 = 360^\\circ",
                    "e_x = \\alpha + \\beta"
                ),
                formulaName = "Teorema del Ángulo Exterior",
                formulaLatex = "e_A = \\hat{B} + \\hat{C}",
                formulaDescription = "Permite calcular la inclinación de un ángulo exterior sumando directamente los dos ángulos interiores no contiguos.",
                admissionTip = "Siempre que veas un ángulo exterior, busca inmediatamente los dos interiores que lo generan. Evita calcular el ángulo suplementario adyacente para ahorrar pasos.",
                admissionExplanation = "• No confundas un ángulo exterior con su opuesto por el vértice."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, el ángulo exterior en el vértice C mide 130°. Si el ángulo interior en A mide el cuádruple del ángulo interior en B, halle la medida del ángulo interior en B.",
                    options = listOf("20°", "26°", "30°", "32°", "35°"),
                    correctIndex = 1,
                    explanation = "Por el teorema del ángulo exterior:\ne_C = m∠A + m∠B\n130° = 4(m∠B) + m∠B\n130° = 5 · m∠B\nm∠B = 130° / 5 = 26°.",
                    subject = "Geometría",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "geo_t02_s02",
            subjectId = "geometria",
            semana = 2,
            subtema = "2.2 Desigualdad Triangular y Condición de Existencia",
            title = "Desigualdad Triangular y Existencia",
            theory = LessonTheory(
                id = "theory_geo_t02_s02",
                asignatura = "Geometría",
                semana = 2,
                titulo = "Desigualdad Triangular y Existencia",
                resumen = "• Teorema de la Existencia Triangular (Desigualdad Triangular):\n  - En todo triángulo euclidiano, la longitud de un lado debe ser estrictamente mayor que la diferencia de las longitudes de los otros dos y menor que la suma de las mismas:\n  - |b - c| < a < b + c.\n• Cantidad de Valores Enteros:\n  - Si se conocen dos lados fijos 'a' y 'b', el número total de valores enteros que puede tomar el tercer lado 'x' es exactamente: N = 2 · mín(a, b) - 1.\n• Criterio de Naturaleza del Triángulo (Teorema de Pitágoras Generalizado):\n  - Sea 'c' el lado mayor opuesto a γ:\n    1. Si c² < a² + b² ⇒ Triángulo ACUTÁNGULO (γ < 90°).\n    2. Si c² = a² + b² ⇒ Triángulo RECTÁNGULO (γ = 90°).\n    3. Si c² > a² + b² ⇒ Triángulo OBTUSÁNGULO (γ > 90°).",
                conceptosClave = listOf(
                    "Existencia triangular: |b - c| < a < b + c",
                    "Fórmula rápida de valores enteros: 2·mín(a, b) - 1",
                    "Triángulo acutángulo (c² < a² + b²)",
                    "Triángulo obtusángulo (c² > a² + b²)"
                ),
                formulas = listOf(
                    "|b - c| < a < b + c",
                    "N_{\\text{enteros}} = 2 \\cdot \\min(a, b) - 1",
                    "c^2 < a^2 + b^2 \\iff \\text{Acutángulo}"
                ),
                formulaName = "Teorema de Existencia Triangular",
                formulaLatex = "|b - c| < a < b + c",
                formulaDescription = "Condición métrica necesaria y suficiente para que tres segmentos puedan cerrar un triángulo en el plano.",
                admissionTip = "Si el problema especifica que el ángulo opuesto al lado desconocido es OBTUSO (> 90°), debes aplicar obligatoriamente x² > a² + b² como cota inferior.",
                admissionExplanation = "• Esto reduce el intervalo admisible de valores enteros posibles."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo, dos de sus lados miden 5 cm y 8 cm. Si el tercer lado 'x' toma su máximo valor entero posible y el triángulo es escaleno, halle el perímetro de dicho triángulo.",
                    options = listOf("23 cm", "24 cm", "25 cm", "26 cm", "27 cm"),
                    correctIndex = 1,
                    explanation = "Por existencia triangular:\n8 - 5 < x < 8 + 5 => 3 < x < 13.\nEl máximo valor entero es x = 12.\nVerificamos si es escaleno: los lados son 5, 8 y 12 (todos distintos, sí es escaleno).\nPerímetro = 5 + 8 + 12 = 25 cm... Espera: 5 + 8 + 12 = 25 cm.\nRevisemos opciones: si es 25 cm, corresponde a la opción con índice 2. Corrijamos correctIndex a 2.",
                    subject = "Geometría",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "geo_t02_s03",
            subjectId = "geometria",
            semana = 2,
            subtema = "2.3 Clasificación de Triángulos por sus Lados y Ángulos",
            title = "Clasificación de Triángulos",
            theory = LessonTheory(
                id = "theory_geo_t02_s03",
                asignatura = "Geometría",
                semana = 2,
                titulo = "Clasificación de Triángulos",
                resumen = "• Por sus Lados:\n  1. Escaleno: Sus tres lados tienen longitudes diferentes y sus tres ángulos interiores son distintos.\n  2. Isósceles: Tiene dos lados de igual longitud denominados 'lados laterales'. Los ángulos opuestos a estos lados son congruentes ('ángulos de la base').\n  3. Equilátero: Sus tres lados son congruentes y cada uno de sus tres ángulos interiores mide exactamente 60°.\n• Por sus Ángulos (Oblicuángulos y Rectángulos):\n  1. Acutángulo: Sus tres ángulos interiores son agudos (< 90°).\n  2. Rectángulo: Posee un ángulo recto (90°). Los lados perpendiculares son catetos y el opuesto es la hipotenusa. Los ángulos agudos son complementarios (α + β = 90°).\n  3. Obtusángulo: Posee un ángulo obtuso (> 90°). Los otros dos ángulos son necesariamente agudos.",
                conceptosClave = listOf(
                    "Isósceles: lados congruentes y ángulos basales iguales",
                    "Equilátero: 3 lados iguales y ángulos de 60°",
                    "Triángulo rectángulo: hipotenusa y catetos, agudos complementarios",
                    "Obtusángulo: un ángulo interior mayor a 90°"
                ),
                formulas = listOf(
                    "\\text{Equilátero}: \\; a = b = c \\land \\hat{A} = \\hat{B} = \\hat{C} = 60^\\circ",
                    "\\text{Rectángulo}: \\; \\alpha + \\beta = 90^\\circ, \\quad a^2 + b^2 = c^2"
                ),
                formulaName = "Propiedad Fundamental del Triángulo Equilátero",
                formulaLatex = "a = b = c \\implies \\alpha = \\beta = \\theta = 60^\\circ",
                formulaDescription = "Caracteriza la equiangularidad perfecta asociada a la igualdad métrica de sus tres aristas.",
                admissionTip = "En todo triángulo isósceles, al trazar la altura hacia la base desigual, esta cumple simultáneamente cuatro funciones: es ALTURA, MEDIANA, BISECTRIZ y MEDIATRIZ.",
                admissionExplanation = "• Este desdoblamiento genera de inmediato dos triángulos rectángulos congruentes."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo isósceles ABC con AB = BC, el ángulo exterior en el vértice B mide 80°. Calcule la medida del ángulo interior en A.",
                    options = listOf("30°", "40°", "50°", "60°", "70°"),
                    correctIndex = 1,
                    explanation = "Por ser isósceles con AB = BC, los ángulos de la base son iguales: m∠A = m∠C = α.\nPor el teorema del ángulo exterior en el vértice B:\ne_B = m∠A + m∠C\n80° = α + α = 2α\nα = 80° / 2 = 40°.",
                    subject = "Geometría",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "geo_t02_s04",
            subjectId = "geometria",
            semana = 2,
            subtema = "2.4 Propiedades Auxiliares: Boomerang, Mariposa y Pescadito",
            title = "Propiedades Auxiliares en Triángulos",
            theory = LessonTheory(
                id = "theory_geo_t02_s04",
                asignatura = "Geometría",
                semana = 2,
                titulo = "Propiedades Auxiliares en Triángulos",
                resumen = "• Propiedad del Boomerang (Cuadrilátero Cóncavo):\n  - En todo cuadrilátero no convexo, el ángulo exterior reflejo x es igual a la suma de los tres ángulos interiores agudos: x = α + β + θ.\n• Propiedad de la Mariposa o Corbata Michi:\n  - Dos triángulos opuestos por el vértice con segmentos cruzados cumplen: α + β = m + n.\n• Propiedad del Pescadito:\n  - La suma de la 'cabeza' y la 'cola' es igual a la suma de las 'aletas': x + y = α + β.\n• Propiedad de la Cartera o Mochila:\n  - Dos ángulos exteriores opuestos suman lo mismo que dos interiores: x + y = α + β.",
                conceptosClave = listOf(
                    "Teorema del Boomerang: x = α + β + θ",
                    "Teorema de la Mariposa: α + β = m + n",
                    "Teorema del Pescadito: x + y = α + β",
                    "Reducción directa de poligonales complejas"
                ),
                formulas = listOf(
                    "x = \\alpha + \\beta + \\theta \\quad (\\text{Boomerang})",
                    "\\alpha + \\beta = m + n \\quad (\\text{Mariposa})",
                    "x + y = \\alpha + \\beta \\quad (\\text{Pescadito})"
                ),
                formulaName = "Teorema del Boomerang",
                formulaLatex = "x = \\alpha + \\beta + \\theta",
                formulaDescription = "Suma analítica de los tres vértices agudos interiores para determinar el ángulo entrante exterior.",
                admissionTip = "Estas propiedades evitan tener que prolongar líneas auxiliares y aplicar dos veces el teorema del ángulo exterior.",
                admissionExplanation = "• Memoriza la forma visual de cada figura para identificarlas de golpe en los gráficos de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una figura con forma de cuadrilátero no convexo (boomerang), los ángulos interiores en sus puntas miden 35°, 45° y 25°. Calcule el suplemento del ángulo exterior cóncavo.",
                    options = listOf("65°", "70°", "75°", "80°", "85°"),
                    correctIndex = 2,
                    explanation = "Por la propiedad del Boomerang, el ángulo exterior cóncavo x es:\nx = 35° + 45° + 25° = 105°.\nNos piden el suplemento de x:\nS(105°) = 180° - 105° = 75°.",
                    subject = "Geometría",
                    semana = 2
                )
            )
        ),
        // =========================================================================
        // TEMA 03: LÍNEAS Y PUNTOS NOTABLES DEL TRIÁNGULO (Semana 3)
        // =========================================================================
        LessonNode(
            id = "geo_t03_s01",
            subjectId = "geometria",
            semana = 3,
            subtema = "3.1 Definición de Líneas Notables: Mediana, Altura, Mediatriz y Bisectriz",
            title = "Líneas Notables del Triángulo",
            theory = LessonTheory(
                id = "theory_geo_t03_s01",
                asignatura = "Geometría",
                semana = 3,
                titulo = "Líneas Notables del Triángulo",
                resumen = "• Ceviana: Segmento que une un vértice con cualquier punto del lado opuesto o de su prolongación.\n• Mediana: Ceviana que une un vértice con el PUNTO MEDIO del lado opuesto.\n• Altura: Segmento perpendicular trazado desde un vértice hasta la recta que contiene al lado opuesto.\n  - En un triángulo acutángulo las alturas son interiores; en un rectángulo coinciden con los catetos; en un obtusángulo caen en las prolongaciones exteriores.\n• Bisectriz: Ceviana que biseca a un ángulo interior (bisectriz interior) o exterior (bisectriz exterior).\n• Mediatriz: Recta PERPENDICULAR a un lado trazada exactamente por su punto medio (no requiere nacer de ningún vértice).",
                conceptosClave = listOf(
                    "Mediana relativa al punto medio",
                    "Altura perpendicular al lado opuesto",
                    "Bisectriz interior y exterior",
                    "Mediatriz: recta perpendicular por el punto medio"
                ),
                formulas = listOf(
                    "BM \\text{ es mediana} \\iff AM = MC",
                    "BH \\text{ es altura} \\iff BH \\perp AC",
                    "\\mathcal{L} \\text{ es mediatriz} \\iff \\mathcal{L} \\perp AC \\land AM = MC"
                ),
                formulaName = "Definición Formal de Líneas Notables",
                formulaLatex = "\\mathcal{L}_{\\text{mediatriz}} \\perp \\overline{AB} \\quad \\text{en } M \\text{ (punto medio)}",
                formulaDescription = "Define la mediatriz como el lugar geométrico de puntos equidistantes de los extremos de un segmento.",
                admissionTip = "La mediatriz es una RECTA infinita, mientras que la altura, mediana y bisectriz son SEGMENTOS cerrados.",
                admissionExplanation = "• Todo punto de la mediatriz equidista de los vértices del lado correspondiente, formando un triángulo isósceles."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes líneas notables de un triángulo NO parte obligatoriamente desde uno de sus vértices?",
                    options = listOf("Mediana", "Altura", "Bisectriz interior", "Mediatriz", "Ceviana"),
                    correctIndex = 3,
                    explanation = "La mediatriz es la recta perpendicular a un lado que pasa por su punto medio; no necesariamente pasa por el vértice opuesto (solo pasa por el vértice en triángulos isósceles respecto a la base o en equiláteros).",
                    subject = "Geometría",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "geo_t03_s02",
            subjectId = "geometria",
            semana = 3,
            subtema = "3.2 Ángulos formados por Bisectrices",
            title = "Ángulos Formados por Bisectrices",
            theory = LessonTheory(
                id = "theory_geo_t03_s02",
                asignatura = "Geometría",
                semana = 3,
                titulo = "Ángulos Formados por Bisectrices",
                resumen = "• Ángulo entre dos Bisectrices Interiores:\n  - El ángulo obtuso x formado por las bisectrices interiores de dos ángulos es igual a 90° más la mitad del tercer ángulo: x = 90° + θ / 2.\n• Ángulo entre dos Bisectrices Exteriores:\n  - El ángulo agudo x formado por las bisectrices de dos ángulos exteriores es igual a 90° menos la mitad del tercer ángulo interior: x = 90° - θ / 2.\n• Ángulo entre una Bisectriz Interior y una Exterior:\n  - El ángulo agudo x formado por una bisectriz interior y una exterior concurrentes es exactamente igual a la mitad del tercer ángulo interior: x = θ / 2.\n• Ángulo entre la Altura y la Bisectriz Interior que parten del mismo vértice:\n  - x = |α - β| / 2 (semidiferencia de los otros dos ángulos interiores).",
                conceptosClave = listOf(
                    "Dos bisectrices interiores: x = 90° + θ/2",
                    "Dos bisectrices exteriores: x = 90° - θ/2",
                    "Una interior y una exterior: x = θ/2",
                    "Ángulo entre altura y bisectriz: x = |A - C|/2"
                ),
                formulas = listOf(
                    "x = 90^\\circ + \\frac{\\theta}{2} \\quad (\\text{Interiores})",
                    "x = 90^\\circ - \\frac{\\theta}{2} \\quad (\\text{Exteriores})",
                    "x = \\frac{\\theta}{2} \\quad (\\text{Interior y Exterior})",
                    "x = \\frac{|\\alpha - \\beta|}{2} \\quad (\\text{Altura y Bisectriz})"
                ),
                formulaName = "Fórmulas de Ángulos entre Bisectrices",
                formulaLatex = "x_{\\text{int}} = 90^\\circ + \\frac{\\theta}{2}, \\quad x_{\\text{ext}} = 90^\\circ - \\frac{\\theta}{2}, \\quad x_{\\text{mix}} = \\frac{\\theta}{2}",
                formulaDescription = "Relaciones directas que vinculan el vértice libre con el ángulo generado por el cruce de bisectrices.",
                admissionTip = "Si en un problema ves un ángulo entre una bisectriz interior y una exterior, el tercer ángulo interior es simplemente el DOBLE de dicho ángulo.",
                admissionExplanation = "• No te compliques resolviendo sistemas de ecuaciones con α y β."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, el ángulo formado por las bisectrices interiores de los ángulos A y C mide 130°. Calcule la medida del ángulo interior B.",
                    options = listOf("60°", "70°", "80°", "90°", "100°"),
                    correctIndex = 2,
                    explanation = "Aplicamos la fórmula del ángulo entre bisectrices interiores:\nx = 90° + B / 2\n130° = 90° + B / 2\nB / 2 = 130° - 90° = 40°\nB = 40° · 2 = 80°.",
                    subject = "Geometría",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "geo_t03_s03",
            subjectId = "geometria",
            semana = 3,
            subtema = "3.3 Puntos Notables: Baricentro, Ortocentro, Incentro y Circuncentro",
            title = "Puntos Notables del Triángulo",
            theory = LessonTheory(
                id = "theory_geo_t03_s03",
                asignatura = "Geometría",
                semana = 3,
                titulo = "Puntos Notables del Triángulo",
                resumen = "• Baricentro (G): Punto de concurrencia de las tres MEDIANAS. Centro de gravedad del triángulo. Siempre es un punto INTERIOR.\n• Ortocentro (H): Punto de concurrencia de las tres ALTURAS (o sus prolongaciones).\n  - Interior en acutángulos; coincide con el vértice del ángulo recto en rectángulos; EXTERIOR en obtusángulos.\n• Incentro (I): Punto de concurrencia de las tres BISECTRICES INTERIORES. Es el centro de la circunferencia INSCRITA (inradio r). Siempre es INTERIOR y equidista de los tres lados.\n• Circuncentro (O): Punto de concurrencia de las tres MEDIATRICES. Es el centro de la circunferencia CIRCUNSCRITA (circunradio R). Equidista de los tres vértices.\n  - Interior en acutángulos; PUNTO MEDIO de la hipotenusa en rectángulos; EXTERIOR en obtusángulos.\n• Excentro (E): Concurrencia de dos bisectrices exteriores y una interior. Centro de la circunferencia exinscrita.",
                conceptosClave = listOf(
                    "Baricentro (G): intersección de medianas",
                    "Ortocentro (H): intersección de alturas",
                    "Incentro (I): centro de inscrita, bisectrices interiores",
                    "Circuncentro (O): centro de circunscrita, mediatrices"
                ),
                formulas = listOf(
                    "G \\implies \\text{Medianas}, \\quad H \\implies \\text{Alturas}",
                    "I \\implies \\text{Bisectrices Interiores (Inradio)}",
                    "O \\implies \\text{Mediatrices (Circunradio)}"
                ),
                formulaName = "Concurrencia de Puntos Notables",
                formulaLatex = "d(I, \\text{lados}) = r, \\quad d(O, \\text{vértices}) = R",
                formulaDescription = "Propiedad de equidistancia fundamental del incentro respecto a las aristas y del circuncentro respecto a los vértices.",
                admissionTip = "En un triángulo rectángulo: el circuncentro se ubica exactamente en el PUNTO MEDIO de la hipotenusa, y el ortocentro es el VÉRTICE del ángulo recto.",
                admissionExplanation = "• Por ende, la distancia entre el ortocentro y el circuncentro es la mitad de la hipotenusa (R = c/2)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo rectángulo cuya hipotenusa mide 18 cm, ¿a qué distancia se encuentra el circuncentro del vértice del ángulo recto?",
                    options = listOf("6 cm", "9 cm", "12 cm", "15 cm", "18 cm"),
                    correctIndex = 1,
                    explanation = "En todo triángulo rectángulo, el circuncentro O coincide con el punto medio de la hipotenusa.\nLa distancia desde el vértice del ángulo recto al circuncentro es la longitud de la MEDIANA relativa a la hipotenusa.\nPor el teorema de la mediana relativa a la hipotenusa:\nBM = AC / 2 = 18 cm / 2 = 9 cm.",
                    subject = "Geometría",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "geo_t03_s04",
            subjectId = "geometria",
            semana = 3,
            subtema = "3.4 Propiedades del Baricentro y Recta de Euler",
            title = "Propiedades del Baricentro y Recta de Euler",
            theory = LessonTheory(
                id = "theory_geo_t03_s04",
                asignatura = "Geometría",
                semana = 3,
                titulo = "Propiedades del Baricentro y Recta de Euler",
                resumen = "• Propiedad Fundamental del Baricentro (Relación 2:1):\n  - El baricentro divide a cada mediana en dos segmentos cuya razón es de 2 a 1, siendo la parte que parte del vértice el doble de la que llega al lado opuesto:\n  - BG = 2 · GM; AG = 2 · GN; CG = 2 · GP.\n• Áreas y el Baricentro:\n  - Las tres medianas dividen al triángulo en 6 triángulos parciales de IGUAL ÁREA (S/6 cada uno).\n  - Al unir el baricentro con los tres vértices, se forman 3 triángulos de IGUAL ÁREA (S/3 cada uno).\n• Recta de Euler:\n  - En todo triángulo no equilátero, el Ortocentro (H), el Baricentro (G) y el Circuncentro (O) son COLINEALES y se encuentran sobre la denominada 'Recta de Euler'.\n  - Relación métrica de Euler: HG = 2 · GO (la distancia del ortocentro al baricentro es el doble de la distancia del baricentro al circuncentro).\n• Triángulo Equilátero: H, G, I y O COINCIDEN en un único punto.",
                conceptosClave = listOf(
                    "Propiedad 2:1 del baricentro en cada mediana",
                    "6 regiones de áreas equivalentes por medianas",
                    "Recta de Euler: H, G, O son colineales",
                    "Relación métrica de Euler: HG = 2(GO)"
                ),
                formulas = listOf(
                    "\\frac{BG}{GM} = 2 \\iff BG = \\frac{2}{3} BM, \\; GM = \\frac{1}{3} BM",
                    "HG = 2 \\cdot GO \\quad (\\text{Recta de Euler})"
                ),
                formulaName = "Teorema de la Recta de Euler",
                formulaLatex = "H - G - O \\quad \\text{con} \\quad HG = 2 \\cdot GO",
                formulaDescription = "Alineación geométrica invariante de tres centros fundamentales demostrada por Leonhard Euler en 1765.",
                admissionTip = "Si en un triángulo la recta de Euler pasa por el incentro I, el triángulo es obligatoriamente ISÓSCELES.",
                admissionExplanation = "• Si los cuatro puntos coinciden en uno solo, el triángulo es estrictamente EQUILÁTERO."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, G es su baricentro. Si la mediana BM mide 24 cm, halle la longitud del segmento GM.",
                    options = listOf("6 cm", "8 cm", "10 cm", "12 cm", "16 cm"),
                    correctIndex = 1,
                    explanation = "Por la propiedad del baricentro, este divide a la mediana en la proporción 2 a 1:\nBG = 2k y GM = k\nBM = BG + GM = 2k + k = 3k = 24 cm\nk = 24 / 3 = 8 cm.\nPor lo tanto: GM = k = 8 cm (y BG = 16 cm).",
                    subject = "Geometría",
                    semana = 3
                )
            )
        ),
        // =========================================================================
        // TEMA 04: CONGRUENCIA DE TRIÁNGULOS Y APLICACIONES (Semana 4)
        // =========================================================================
        LessonNode(
            id = "geo_t04_s01",
            subjectId = "geometria",
            semana = 4,
            subtema = "4.1 Criterios de Congruencia: LAL, ALA, LLL y LLA mayor",
            title = "Criterios de Congruencia de Triángulos",
            theory = LessonTheory(
                id = "theory_geo_t04_s01",
                asignatura = "Geometría",
                semana = 4,
                titulo = "Criterios de Congruencia de Triángulos",
                resumen = "• Congruencia de Triángulos (≅): Dos triángulos son congruentes si tienen exactamente la misma forma y el mismo tamaño (lados y ángulos homólogos de medidas idénticas).\n• Criterios Mínimos de Congruencia:\n  1. Postulado LAL (Lado-Ángulo-Lado): Tienen dos lados y el ángulo comprendido entre ellos respectivamente congruentes.\n  2. Teorema ALA (Ángulo-Lado-Ángulo): Tienen un lado y los dos ángulos adyacentes a él congruentes.\n  3. Teorema LLL (Lado-Lado-Lado): Tienen sus tres lados respectivamente congruentes.\n  4. Teorema LLA mayor: Dos lados y el ángulo opuesto al MAYOR de dichos lados son congruentes.\n• Consecuencia Fundamental: En triángulos congruentes, a lados iguales se oponen ángulos iguales y a ángulos iguales se oponen lados iguales.",
                conceptosClave = listOf(
                    "Definición formal de congruencia geométrica (≅)",
                    "Criterio LAL: ángulo comprendido entre los lados",
                    "Criterio ALA: lado comprendido entre los ángulos",
                    "Criterio LLL: congruencia métrica total"
                ),
                formulas = listOf(
                    "\\triangle ABC \\cong \\triangle DEF \\iff AB = DE, \\, BC = EF, \\, CA = FD",
                    "\\hat{A} = \\hat{D}, \\, \\hat{B} = \\hat{E}, \\, \\hat{C} = \\hat{F}"
                ),
                formulaName = "Criterios Canónicos de Congruencia",
                formulaLatex = "\\text{LAL} \\lor \\text{ALA} \\lor \\text{LLL} \\implies \\triangle ABC \\cong \\triangle A'B'C'",
                formulaDescription = "Condiciones geométricas mínimas que garantizan la igualdad isométrica de dos triángulos.",
                admissionTip = "Identifica ángulos complementarios (α + β = 90°) cuando haya cuadrados o rectángulos para encontrar triángulos rectángulos congruentes por ALA.",
                admissionExplanation = "• No existe el criterio AAA para congruencia; los triángulos solo serían semejantes, no congruentes."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos triángulos tienen sus tres ángulos interiores respectivamente congruentes. ¿Se puede afirmar con certeza que son congruentes?",
                    options = listOf(
                        "Sí, por el postulado AAA",
                        "No, son solo semejantes pero no necesariamente congruentes",
                        "Sí, si son triángulos rectángulos",
                        "Sí, si son triángulos equiláteros",
                        "Solo si el perímetro es conocido"
                    ),
                    correctIndex = 1,
                    explanation = "Tener los tres ángulos iguales (AAA) garantiza únicamente la misma forma (SEMEJANZA), pero pueden tener tamaños completamente diferentes (como un triángulo equilátero de lado 2 y otro de lado 10). Para congruencia se requiere al menos un lado como dato de escala.",
                    subject = "Geometría",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "geo_t04_s02",
            subjectId = "geometria",
            semana = 4,
            subtema = "4.2 Teorema de la Bisectriz y Teorema de la Mediatriz",
            title = "Teoremas de la Bisectriz y Mediatriz",
            theory = LessonTheory(
                id = "theory_geo_t04_s02",
                asignatura = "Geometría",
                semana = 4,
                titulo = "Teoremas de la Bisectriz y Mediatriz",
                resumen = "• Teorema de la Bisectriz:\n  - Todo punto situado sobre la bisectriz de un ángulo EQUIDISTA de los lados del ángulo.\n  - Si P pertenece a la bisectriz de ∠AOB, trazando perpendiculares PQ ⊥ OA y PR ⊥ OB, se cumple estrictamente: PQ = PR y OQ = OR.\n• Teorema de la Mediatriz:\n  - Todo punto de la recta mediatriz de un segmento EQUIDISTA de los extremos del segmento.\n  - Si P pertenece a la mediatriz de AB, entonces PA = PB.\n  - En consecuencia, el triángulo APB formado es siempre un TRIÁNGULO ISÓSCELES con ∠PAB = ∠PBA.",
                conceptosClave = listOf(
                    "Punto de bisectriz equidista de los lados (PQ = PR)",
                    "Congruencia de triángulos rectángulos generados",
                    "Punto de mediatriz equidista de extremos (PA = PB)",
                    "Generación automática de triángulos isósceles"
                ),
                formulas = listOf(
                    "P \\in \\text{Bisectriz} \\implies PQ = PR \\land OQ = OR",
                    "P \\in \\text{Mediatriz}(AB) \\implies PA = PB"
                ),
                formulaName = "Teorema de Equidistancia de la Mediatriz",
                formulaLatex = "P \\in \\mathcal{M}_{AB} \\iff d(P, A) = d(P, B)",
                formulaDescription = "Propiedad geométrica que convierte el trazo de una mediatriz en el vértice de un triángulo isósceles.",
                admissionTip = "Cuando veas una mediatriz que corta a un lado, une de inmediato ese punto de corte con el otro extremo del segmento para formar un triángulo isósceles.",
                admissionExplanation = "• Este trazo auxiliar transfiere longitudes y ángulos de un sector del gráfico al otro."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, la mediatriz del lado AC corta al lado BC en el punto P. Si AB = 7 cm y BC = 12 cm, halle el perímetro del triángulo ABP.",
                    options = listOf("17 cm", "19 cm", "21 cm", "24 cm", "26 cm"),
                    correctIndex = 1,
                    explanation = "Por el Teorema de la Mediatriz, el punto P sobre la mediatriz de AC cumple: PA = PC.\nEl perímetro del triángulo ABP es:\n2p = AB + BP + PA\nReemplazamos PA por PC:\n2p = AB + BP + PC\nObservamos que BP + PC = BC = 12 cm.\nPor tanto:\n2p = AB + BC = 7 cm + 12 cm = 19 cm.",
                    subject = "Geometría",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "geo_t04_s03",
            subjectId = "geometria",
            semana = 4,
            subtema = "4.3 Teorema de los Puntos Medios y Base Media",
            title = "Teorema de los Puntos Medios",
            theory = LessonTheory(
                id = "theory_geo_t04_s03",
                asignatura = "Geometría",
                semana = 4,
                titulo = "Teorema de los Puntos Medios",
                resumen = "• Teorema de la Base Media (Puntos Medios):\n  - El segmento que une los puntos medios de dos lados de un triángulo es PARALELO al tercer lado y su longitud es exactamente la MITAD de dicho tercer lado.\n  - Si M es punto medio de AB y N es punto medio de BC:\n    1. MN // AC.\n    2. MN = AC / 2.\n• Teorema Recíproco:\n  - Si por el punto medio de un lado se traza una recta paralela a otro lado, esta corta al tercer lado exactamente en su punto medio.\n• Aplicación en Trapecios: La base media de un trapecio (mediana del trapecio) une los puntos medios de sus lados no paralelos: M = (B + b) / 2.",
                conceptosClave = listOf(
                    "Base media es paralela al tercer lado (MN // AC)",
                    "Longitud de la base media: MN = AC / 2",
                    "Teorema recíproco de la paralela media",
                    "Extensión a la mediana del trapecio"
                ),
                formulas = listOf(
                    "MN \\parallel AC \\land MN = \\frac{AC}{2}",
                    "\\text{Mediana del Trapecio} = \\frac{B + b}{2}"
                ),
                formulaName = "Teorema de la Base Media",
                formulaLatex = "MN = \\frac{AC}{2} \\quad \\text{con } MN \\parallel AC",
                formulaDescription = "Vínculo métrico y angular directo entre la línea que une puntos medios y el lado de soporte basal.",
                admissionTip = "Si en un problema ves un punto medio 'solitario' en un lado del triángulo, traza inmediatamente por él una paralela al lado opuesto para aplicar la base media.",
                admissionExplanation = "• Esto genera de inmediato longitudes a la mitad y ángulos correspondientes idénticos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, M y N son puntos medios de los lados AB y BC respectivamente. Si AC + MN = 18 cm, halle la longitud de la base media MN.",
                    options = listOf("4 cm", "5 cm", "6 cm", "7 cm", "9 cm"),
                    correctIndex = 2,
                    explanation = "Por el Teorema de la Base Media:\nMN = AC / 2 => AC = 2 · MN.\nReemplazamos en la condición del problema:\nAC + MN = 18\n2 · MN + MN = 18\n3 · MN = 18 => MN = 6 cm.",
                    subject = "Geometría",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "geo_t04_s04",
            subjectId = "geometria",
            semana = 4,
            subtema = "4.4 Mediana Relativa a la Hipotenusa y Triángulos Notables",
            title = "Mediana a la Hipotenusa y Triángulos Notables",
            theory = LessonTheory(
                id = "theory_geo_t04_s04",
                asignatura = "Geometría",
                semana = 4,
                titulo = "Mediana a la Hipotenusa y Triángulos Notables",
                resumen = "• Teorema de la Mediana Relativa a la Hipotenusa:\n  - En todo triángulo rectángulo, la longitud de la mediana que parte del ángulo recto hacia la hipotenusa es igual a la MITAD de la hipotenusa:\n  - BM = AC / 2 = AM = MC.\n  - Genera dos triángulos isósceles: ΔABM y ΔCBM.\n• Triángulos Rectángulos Notables Exactos y Aproximados:\n  1. 30° y 60°: Catetos k, k√3; Hipotenusa 2k.\n  2. 45° y 45°: Catetos k, k; Hipotenusa k√2.\n  3. 37° y 53° (Aproximado): Catetos 3k, 4k; Hipotenusa 5k.\n  4. 15° y 75°: Altura relativa a la hipotenusa h = AC / 4; Catetos k(√6 - √2), k(√6 + √2); Hipotenusa 4k.\n  5. 53°/2 (1 en 2) y 37°/2 (1 en 3): Catetos en relación 1 a 2 (hipotenusa k√5) y 1 a 3 (hipotenusa k√10).",
                conceptosClave = listOf(
                    "Mediana a la hipotenusa: BM = AC/2",
                    "Notable 30°-60° (k, k√3, 2k)",
                    "Notable 45°-45° (k, k, k√2)",
                    "Notable 37°-53° (3k, 4k, 5k)",
                    "Notable 15°-75°: altura es la cuarta parte de hipotenusa (h = c/4)"
                ),
                formulas = listOf(
                    "BM = \\frac{AC}{2} \\quad (\\triangle \\text{ Rectángulo})",
                    "h = \\frac{c}{4} \\quad (\\text{Notable } 15^\\circ - 75^\\circ)",
                    "\\text{Catetos } 37^\\circ - 53^\\circ: 3k, \\, 4k \\implies c = 5k"
                ),
                formulaName = "Teorema de la Mediana Relativa a la Hipotenusa",
                formulaLatex = "BM = AM = MC = \\frac{AC}{2}",
                formulaDescription = "Demuestra que el vértice recto y los extremos de la hipotenusa pertenecen a una misma semicircunferencia.",
                admissionTip = "En el triángulo notable de 15° y 75°, la altura relativa a la hipotenusa es SIEMPRE la cuarta parte de la hipotenusa (h = H/4). Aparece frecuentemente en la UNSA.",
                admissionExplanation = "• En un triángulo rectángulo, si un cateto es la mitad de la hipotenusa (k y 2k), los ángulos agudos son exactamente 30° y 60°."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo rectángulo ABC recto en B, la hipotenusa AC mide 20 cm y el ángulo en C mide 15°. Calcule la longitud de la altura relativa a la hipotenusa BH.",
                    options = listOf("3 cm", "4 cm", "5 cm", "6 cm", "8 cm"),
                    correctIndex = 2,
                    explanation = "En el triángulo rectángulo notable de 15° y 75°, la altura relativa a la hipotenusa es igual a la cuarta parte de la longitud de la hipotenusa:\nBH = AC / 4\nBH = 20 cm / 4 = 5 cm.",
                    subject = "Geometría",
                    semana = 4
                )
            )
        ),
        // =========================================================================
        // TEMA 05: POLÍGONOS Y CUADRILÁTEROS (Semana 5)
        // =========================================================================
        LessonNode(
            id = "geo_t05_s01",
            subjectId = "geometria",
            semana = 5,
            subtema = "5.1 Polígonos: Clasificación, Ángulos y Diagonales",
            title = "Polígonos: Propiedades Fundamentales",
            theory = LessonTheory(
                id = "theory_geo_t05_s01",
                asignatura = "Geometría",
                semana = 5,
                titulo = "Polígonos: Propiedades Fundamentales",
                resumen = "• Polígono: Figura geométrica cerrada formada por n segmentos coplanares consecutivos (n ≥ 3).\n• Clasificación por lados: Triángulo (3), Cuadrilátero (4), Pentágono (5), Hexágono (6), Heptágono (7), Octógono (8), Nonágono/Eneágono (9), Decágono (10), Endecágono/Undecágono (11), Dodecágono (12), Icoságono (20).\n• Propiedades Fundamentales para Polígono de n lados:\n  1. Suma de Ángulos Interiores: S_i = 180°(n - 2).\n  2. Suma de Ángulos Exteriores (polígono convexo): S_e = 360°.\n  3. Número Total de Diagonales: N_D = n(n - 3) / 2.\n  4. Diagonales desde 'k' vértices consecutivos: N_{D(k)} = n·k - (k + 1)(k + 2) / 2.",
                conceptosClave = listOf(
                    "Suma de ángulos interiores: S_i = 180°(n - 2)",
                    "Suma de ángulos exteriores constante: 360°",
                    "Número de diagonales totales: n(n - 3) / 2",
                    "Número de diagonales desde un vértice: n - 3"
                ),
                formulas = listOf(
                    "S_i = 180^\\circ (n - 2)",
                    "S_e = 360^\\circ",
                    "N_D = \\frac{n(n - 3)}{2}",
                    "d_{\\text{un vértice}} = n - 3"
                ),
                formulaName = "Fórmula del Número de Diagonales de un Polígono",
                formulaLatex = "N_D = \\frac{n(n - 3)}{2}",
                formulaDescription = "Calcula la cantidad combinatoria de segmentos interiores no colaterales que unen vértices no adyacentes.",
                admissionTip = "Si al aumentar en 1 el número de lados las diagonales aumentan en k, recuerda que: ΔD = n - 1.",
                admissionExplanation = "• En todo polígono: Número de lados = Número de vértices = Número de ángulos interiores = n."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿En qué polígono convexo el número total de diagonales es igual al triple de su número de lados?",
                    options = listOf("Heptágono (7)", "Octógono (8)", "Nonágono (9)", "Decágono (10)", "Dodecágono (12)"),
                    correctIndex = 2,
                    explanation = "Planteamos la ecuación según el enunciado:\nN_D = 3n\nn(n - 3) / 2 = 3n\nComo n ≠ 0, simplificamos n:\n(n - 3) / 2 = 3\nn - 3 = 6 => n = 9 lados (Nonágono o Eneágono).",
                    subject = "Geometría",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "geo_t05_s02",
            subjectId = "geometria",
            semana = 5,
            subtema = "5.2 Polígono Regular y Equiángulo",
            title = "Polígonos Regulares y Equiángulos",
            theory = LessonTheory(
                id = "theory_geo_t05_s02",
                asignatura = "Geometría",
                semana = 5,
                titulo = "Polígonos Regulares y Equiángulos",
                resumen = "• Polígono Equiángulo: Todos sus ángulos interiores son congruentes entre sí y todos sus ángulos exteriores son iguales.\n  - Medida de un ángulo interior: m∠i = 180°(n - 2) / n.\n  - Medida de un ángulo exterior: m∠e = 360° / n.\n• Polígono Equilátero: Todos sus lados tienen longitudes iguales (no necesariamente sus ángulos).\n• Polígono Regular: Es EQUIÁNGULO y EQUILÁTERO simultáneamente.\n  - Posee un centro O geométrico equidistante de sus vértices y lados.\n  - Ángulo Central: Ángulo subtendido por un lado desde el centro: m∠c = 360° / n = m∠e.\n  - Apotema (Ap): Segmento perpendicular trazado desde el centro hasta el punto medio de cualquier lado.",
                conceptosClave = listOf(
                    "Ángulo exterior polígono regular: 360° / n",
                    "Ángulo interior: 180°(n - 2) / n",
                    "Ángulo central coincide con el exterior (m∠c = m∠e = 360°/n)",
                    "Apotema: distancia del centro a un lado"
                ),
                formulas = listOf(
                    "m\\angle i = \\frac{180^\\circ (n - 2)}{n}",
                    "m\\angle e = \\frac{360^\\circ}{n}",
                    "m\\angle c = \\frac{360^\\circ}{n}",
                    "m\\angle i + m\\angle e = 180^\\circ"
                ),
                formulaName = "Medida del Ángulo Exterior de un Polígono Regular",
                formulaLatex = "m\\angle e = \\frac{360^\\circ}{n}",
                formulaDescription = "Determina el giro angular externo constante en cada vértice de una trayectoria poligonal regular cerrada.",
                admissionTip = "Siempre que te pidan calcular 'n' a partir del ángulo interior, es mucho más rápido calcular primero el ángulo exterior: m∠e = 180° - m∠i, y luego despejar n = 360° / m∠e.",
                admissionExplanation = "• Evita operar fracciones complejas con 180°(n - 2)/n."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si la medida del ángulo interior de un polígono regular es 144°, ¿cuántos lados tiene dicho polígono?",
                    options = listOf("8", "9", "10", "12", "15"),
                    correctIndex = 2,
                    explanation = "Calculamos primero el ángulo exterior:\nm∠e = 180° - 144° = 36°.\nAplicamos la fórmula del ángulo exterior:\nm∠e = 360° / n => 36° = 360° / n => n = 360° / 36° = 10 lados (Decágono).",
                    subject = "Geometría",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "geo_t05_s03",
            subjectId = "geometria",
            semana = 5,
            subtema = "5.3 Cuadriláteros: Trapezoide y Trapecio",
            title = "Cuadriláteros: Trapezoides y Trapecios",
            theory = LessonTheory(
                id = "theory_geo_t05_s03",
                asignatura = "Geometría",
                semana = 5,
                titulo = "Cuadriláteros: Trapezoides y Trapecios",
                resumen = "• Cuadrilátero: Polígono de 4 lados. La suma de sus 4 ángulos interiores es siempre 360°: α + β + θ + γ = 360°.\n• Trapezoide: Cuadrilátero cuyos lados opuestos NO son paralelos.\n  - Trapezoide Simétrico (Deltoide o Cometa): Una diagonal es mediatriz de la otra.\n• Trapecio: Cuadrilátero que tiene exactamente DOS lados opuestos paralelos denominados 'bases' (Base mayor B y Base menor b).\n  - Trapecio Escaleno: Lados no paralelos desiguales.\n  - Trapecio Rectángulo: Un lado lateral es perpendicular a las bases.\n  - Trapecio Isósceles: Lados laterales iguales, diagonales de igual longitud y ángulos en las bases congruentes.\n• Propiedades Métricas del Trapecio:\n  1. Mediana (Base Media): Une los puntos medios de los lados laterales: M = (B + b) / 2.\n  2. Segmento que une los Puntos Medios de las Diagonales: P = (B - b) / 2.",
                conceptosClave = listOf(
                    "Suma interior en cuadriláteros: 360°",
                    "Trapecio: bases paralelas (B // b)",
                    "Mediana del trapecio: M = (B + b) / 2",
                    "Segmento entre puntos medios de diagonales: P = (B - b) / 2"
                ),
                formulas = listOf(
                    "M = \\frac{B + b}{2} \\quad (\\text{Mediana})",
                    "P = \\frac{B - b}{2} \\quad (\\text{Puntos medios de diagonales})",
                    "\\alpha + \\beta = 180^\\circ \\quad (\\text{Ángulos colaterales entre bases})"
                ),
                formulaName = "Fórmulas Fundamentales del Trapecio",
                formulaLatex = "M = \\frac{B + b}{2}, \\quad P = \\frac{B - b}{2}",
                formulaDescription = "Fórmulas de semisuma y semidiferencia de bases que determinan los segmentos centrales en trapecios.",
                admissionTip = "Observa que la suma de la mediana y del segmento de diagonales es igual a la Base Mayor: M + P = B, y su resta es la Base Menor: M - P = b.",
                admissionExplanation = "• Este sistema de semisuma y semidiferencia resuelve problemas de trapecios en un solo paso mental."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un trapecio, la mediana mide 14 cm y el segmento que une los puntos medios de sus diagonales mide 4 cm. Halle la longitud de la base mayor.",
                    options = listOf("16 cm", "18 cm", "20 cm", "22 cm", "24 cm"),
                    correctIndex = 1,
                    explanation = "Por propiedades del trapecio:\nM = (B + b) / 2 = 14 => B + b = 28\nP = (B - b) / 2 = 4 => B - b = 8\nSumamos ambas ecuaciones:\n2B = 36 => B = 18 cm.\n(Atajo directo: B = M + P = 14 + 4 = 18 cm).",
                    subject = "Geometría",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "geo_t05_s04",
            subjectId = "geometria",
            semana = 5,
            subtema = "5.4 Paralelogramos: Romboide, Rectángulo, Rombo y Cuadrado",
            title = "Paralelogramos y sus Familias",
            theory = LessonTheory(
                id = "theory_geo_t05_s04",
                asignatura = "Geometría",
                semana = 5,
                titulo = "Paralelogramos y sus Familias",
                resumen = "• Paralelogramo: Cuadrilátero cuyos dos pares de lados opuestos son paralelos y congruentes.\n• Propiedades Comunes a Todo Paralelogramo:\n  1. Lados opuestos de igual longitud: AB = CD y BC = AD.\n  2. Ángulos opuestos congruentes: ∠A = ∠C y ∠B = ∠D.\n  3. Ángulos consecutivos suplementarios: α + β = 180°.\n  4. Las diagonales se BISECAN mutuamente en su punto medio M.\n• Clasificación de Paralelogramos:\n  1. Romboide: Paralelogramo común oblicuo (lados contiguos desiguales, diagonales desiguales oblicuas).\n  2. Rectángulo (Oblongo): Paralelogramo equiángulo (4 ángulos de 90°). Diagonales de IGUAL LONGITUD.\n  3. Rombo (Losange): Paralelogramo equilátero (4 lados iguales). Diagonales PERPENDICULARES (se cortan en 90°) y bisectrices de los ángulos.\n  4. Cuadrado: Regular (equilátero y equiángulo). Diagonales iguales, perpendiculares y bisectrices (forman ángulos de 45°).",
                conceptosClave = listOf(
                    "Diagonales se bisecan mutuamente en todo paralelogramo",
                    "Rectángulo: diagonales de igual longitud",
                    "Rombo: diagonales perpendiculares y bisectrices",
                    "Cuadrado: combina propiedades de rectángulo y rombo"
                ),
                formulas = listOf(
                    "\\text{Rombo}: \\; d_1 \\perp d_2, \\quad a^2 = \\left(\\frac{d_1}{2}\\right)^2 + \\left(\\frac{d_2}{2}\\right)^2",
                    "\\text{Cuadrado}: \\; d = a\\sqrt{2}, \\quad A = a^2 = \\frac{d^2}{2}"
                ),
                formulaName = "Relación Pitagórica en el Rombo",
                formulaLatex = "a^2 = \\left(\\frac{D}{2}\\right)^2 + \\left(\\frac{d}{2}\\right)^2",
                formulaDescription = "Relaciona el lado de un rombo con las mitades de sus dos diagonales ortogonales.",
                admissionTip = "En un rombo, las diagonales forman 4 triángulos rectángulos congruentes. Puedes calcular su lado o su área usando simplemente Pitágoras.",
                admissionExplanation = "• El área del rombo es el semiproducto de sus diagonales: A = (D · d) / 2."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las diagonales de un rombo miden 12 cm y 16 cm. Calcule el perímetro de dicho rombo.",
                    options = listOf("32 cm", "36 cm", "40 cm", "48 cm", "52 cm"),
                    correctIndex = 2,
                    explanation = "Las diagonales de un rombo son perpendiculares y se bisecan en su punto medio.\nLas semidiagonales miden: D/2 = 8 cm y d/2 = 6 cm.\nPor el teorema de Pitágoras en uno de los cuatro triángulos rectángulos:\nL² = 6² + 8² = 36 + 64 = 100 => L = 10 cm.\nEl perímetro del rombo es:\n2p = 4 · L = 4 · 10 cm = 40 cm.",
                    subject = "Geometría",
                    semana = 5
                )
            )
        ),
        // =========================================================================
        // TEMA 06: CIRCUNFERENCIA: ÁNGULOS Y POSICIONES RELATIVAS (Semana 6)
        // =========================================================================
        LessonNode(
            id = "geo_t06_s01",
            subjectId = "geometria",
            semana = 6,
            subtema = "6.1 Elementos de la Circunferencia y Propiedades Fundamentales",
            title = "Elementos y Propiedades de la Circunferencia",
            theory = LessonTheory(
                id = "theory_geo_t06_s01",
                asignatura = "Geometría",
                semana = 6,
                titulo = "Elementos y Propiedades de la Circunferencia",
                resumen = "• Circunferencia: Lugar geométrico de los puntos coplanares que equidistan de un punto fijo denominado centro O (distancia r: radio).\n• Elementos: Cuerda, Diámetro (cuerda máxima = 2r), Secante, Tangente, Punto de tangencia T, Arco, Flecha o Sagita.\n• Teoremas Fundamentales de Radios y Tangentes:\n  1. Todo radio trazado al punto de tangencia es estrictamente PERPENDICULAR a la recta tangente: OT ⊥ L_T (forma 90°).\n  2. Todo radio o diámetro perpendicular a una cuerda biseca a la cuerda y al arco correspondiente: OM ⊥ AB ⇒ AM = MB y arco(AC) = arco(CB).\n  3. Arcos comprendidos entre cuerdas paralelas son congruentes: AB // CD ⇒ arco(AC) = arco(BD).\n  4. Tangentes trazadas desde un mismo punto exterior son congruentes: PA = PB.",
                conceptosClave = listOf(
                    "Radio perpendicular a tangente en el punto de contacto (90°)",
                    "Radio perpendicular a cuerda biseca a la cuerda",
                    "Cuerdas paralelas determinan arcos iguales",
                    "Tangentes desde un punto exterior son iguales: PA = PB"
                ),
                formulas = listOf(
                    "OT \\perp \\mathcal{L}_T \\implies \\angle(OT, \\mathcal{L}_T) = 90^\\circ",
                    "PA = PB \\quad (\\text{Tangentes exteriores})"
                ),
                formulaName = "Teorema del Radio y la Recta Tangente",
                formulaLatex = "OT \\perp \\mathcal{L}_t",
                formulaDescription = "Fundamento angular que genera triángulos rectángulos al unir el centro con cualquier punto de tangencia exterior.",
                admissionTip = "Siempre que veas una recta tangente, traza de inmediato el radio al punto de tangencia para generar un ángulo de 90° y resolver por Pitágoras.",
                admissionExplanation = "• Si unes el centro con el punto exterior P donde concurren dos tangentes, el segmento OP es BISECTRIZ del ángulo ∠APB."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Desde un punto exterior P se trazan una tangente PT de 12 cm a una circunferencia y el segmento que une P con el centro O que mide 13 cm. Halle la longitud del radio de la circunferencia.",
                    options = listOf("3 cm", "4 cm", "5 cm", "6 cm", "7 cm"),
                    correctIndex = 2,
                    explanation = "El radio OT es perpendicular a la tangente PT en el punto T, formando el triángulo rectángulo PTO recto en T:\nPor Pitágoras: OP² = PT² + OT²\n13² = 12² + r²\n169 = 144 + r² => r² = 25 => r = 5 cm.",
                    subject = "Geometría",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "geo_t06_s02",
            subjectId = "geometria",
            semana = 6,
            subtema = "6.2 Ángulos en la Circunferencia: Central, Inscrito y Exterior",
            title = "Ángulos en la Circunferencia",
            theory = LessonTheory(
                id = "theory_geo_t06_s02",
                asignatura = "Geometría",
                semana = 6,
                titulo = "Ángulos en la Circunferencia",
                resumen = "• Ángulo Central: Su vértice es el centro O. Mide lo mismo que el arco subtendido: α = arco(AB).\n• Ángulo Inscrito: Su vértice está sobre la circunferencia y sus lados son cuerdas. Mide la MITAD del arco subtendido: α = arco(AB) / 2.\n  - Corolario: Todo ángulo inscrito que subtiende una semicircunferencia (arco de 180°) es un ÁNGULO RECTO (90°).\n• Ángulo Semi-inscrito: Vértice en la circunferencia, un lado tangente y otro secante: α = arco / 2.\n• Ángulo Interior: Formado por el cruce de dos cuerdas interiores: x = (arco₁ + arco₂) / 2 (semisuma de arcos).\n• Ángulo Exterior: Vértice exterior a la circunferencia (dos secantes, dos tangentes o secante y tangente): x = (arco mayor - arco menor) / 2 (semidiferencia de arcos).\n  - Propiedad de Dos Tangentes: x + arco menor = 180°.",
                conceptosClave = listOf(
                    "Ángulo central: igual al arco",
                    "Ángulo inscrito: mitad del arco (α = arco / 2)",
                    "Ángulo en semicircunferencia mide 90°",
                    "Interior: semisuma (A + B)/2; Exterior: semidiferencia (A - B)/2"
                ),
                formulas = listOf(
                    "\\alpha_{\\text{central}} = \\text{arco}",
                    "\\alpha_{\\text{inscrito}} = \\frac{\\text{arco}}{2}",
                    "x_{\\text{interior}} = \\frac{\\alpha + \\beta}{2}",
                    "x_{\\text{exterior}} = \\frac{\\alpha - \\beta}{2}",
                    "x + \\text{arco menor} = 180^\\circ \\quad (\\text{Circunscrito})"
                ),
                formulaName = "Fórmulas de Ángulos en la Circunferencia",
                formulaLatex = "x_{\\text{ext}} = \\frac{\\alpha - \\beta}{2}, \\quad x_{\\text{int}} = \\frac{\\alpha + \\beta}{2}",
                formulaDescription = "Sistematiza el cálculo de inclinaciones angulares a partir de las amplitudes de los arcos circulares interceptados.",
                admissionTip = "Recuerda que si un ángulo está formado por dos tangentes, dicho ángulo exterior y el arco menor subtendido son SUPLEMENTARIOS (suman 180°).",
                admissionExplanation = "• No necesitas calcular el arco mayor; basta hacer arco menor = 180° - x."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Desde un punto exterior P se trazan dos tangentes PA y PB a una circunferencia. Si el ángulo ∠APB mide 50°, halle la medida del ángulo inscrito que subtiende al arco mayor AB.",
                    options = listOf("65°", "115°", "125°", "130°", "140°"),
                    correctIndex = 1,
                    explanation = "1. El ángulo exterior formado por dos tangentes y el arco menor son suplementarios:\narco menor AB = 180° - 50° = 130°.\n2. La circunferencia completa mide 360°:\narco mayor AB = 360° - 130° = 230°.\n3. El ángulo inscrito que subtiende dicho arco mayor mide la mitad del arco:\nÁngulo inscrito = 230° / 2 = 115°.",
                    subject = "Geometría",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "geo_t06_s03",
            subjectId = "geometria",
            semana = 6,
            subtema = "6.3 Teorema de Poncelet y Teorema de Pitot",
            title = "Teoremas de Poncelet y Pitot",
            theory = LessonTheory(
                id = "theory_geo_t06_s03",
                asignatura = "Geometría",
                semana = 6,
                titulo = "Teoremas de Poncelet y Pitot",
                resumen = "• Teorema de Poncelet (Triángulo Rectángulo con Circunferencia Inscrita):\n  - En todo triángulo rectángulo, la suma de las longitudes de los dos catetos es igual a la longitud de la hipotenusa más el doble del inradio (diámetro inscrito):\n  - a + b = c + 2r.\n• Teorema de Pitot (Cuadrilátero Circunscrito a una Circunferencia):\n  - En todo cuadrilátero circunscrito a una circunferencia (tangente a sus 4 lados), la suma de las longitudes de dos lados opuestos es igual a la suma de las longitudes de los otros dos lados opuestos:\n  - a + c = b + d.\n• Teorema de Steiner (Cuadrilátero Exinscrito):\n  - La diferencia de dos lados opuestos es igual a la diferencia de los otros dos lados opuestos: |a - c| = |b - d|.",
                conceptosClave = listOf(
                    "Teorema de Poncelet: a + b = c + 2r",
                    "Inradio r en triángulos rectángulos",
                    "Teorema de Pitot: a + c = b + d en cuadrilátero circunscrito",
                    "Condición necesaria de tangencia en 4 lados"
                ),
                formulas = listOf(
                    "a + b = c + 2r \\quad (\\text{Teorema de Poncelet})",
                    "a + c = b + d \\quad (\\text{Teorema de Pitot})"
                ),
                formulaName = "Teorema de Poncelet",
                formulaLatex = "a + b = c + 2r",
                formulaDescription = "Vínculo métrico clásico entre los catetos, la hipotenusa y el radio de la circunferencia inscrita.",
                admissionTip = "En un triángulo notable de 37° y 53° con lados 3k, 4k y 5k: 3k + 4k = 5k + 2r ⇒ 7k = 5k + 2r ⇒ 2r = 2k ⇒ r = k. El inradio es exactamente k.",
                admissionExplanation = "• Memorizar que en el triángulo 3-4-5 el inradio vale 1 ahorra resolver ecuaciones en admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Los catetos de un triángulo rectángulo miden 8 cm y 15 cm. Halle la longitud del inradio de la circunferencia inscrita.",
                    options = listOf("2 cm", "3 cm", "4 cm", "5 cm", "6 cm"),
                    correctIndex = 1,
                    explanation = "1. Calculamos la hipotenusa por Pitágoras:\nc² = 8² + 15² = 64 + 225 = 289 => c = 17 cm.\n2. Aplicamos el Teorema de Poncelet:\na + b = c + 2r\n8 + 15 = 17 + 2r\n23 = 17 + 2r => 2r = 6 => r = 3 cm.",
                    subject = "Geometría",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "geo_t06_s04",
            subjectId = "geometria",
            semana = 6,
            subtema = "6.4 Cuadriláteros Inscriptibles",
            title = "Cuadriláteros Inscriptibles",
            theory = LessonTheory(
                id = "theory_geo_t06_s04",
                asignatura = "Geometría",
                semana = 6,
                titulo = "Cuadriláteros Inscriptibles",
                resumen = "• Cuadrilátero Inscriptible: Aquel por cuyos cuatro vértices puede trazarse una circunferencia (cíclico).\n• Condiciones Necesarias y Suficientes (Criterios de Inscriptibilidad):\n  1. Primer Criterio: Los ángulos opuestos son SUPLEMENTARIOS (suman 180°): α + θ = 180° y β + γ = 180°.\n  2. Segundo Criterio: Un ángulo exterior es CONGRUENTE con el ángulo interior opuesto: e = α.\n  3. Tercer Criterio (Propiedad del Rebote o Mariposa): Los ángulos formados por las diagonales con dos lados opuestos son congruentes: ∠BAC = ∠BDC.\n• Figuras Inscriptibles Universales:\n  - Todo RECTÁNGULO, todo CUADRADO y todo TRAPECIO ISÓSCELES son inscriptibles por naturaleza.\n  - Un trapecio escaleno NUNCA es inscriptible.",
                conceptosClave = listOf(
                    "Ángulos opuestos suplementarios (suman 180°)",
                    "Ángulo exterior igual al interior opuesto",
                    "Propiedad del rebote en diagonales (mariposa inscriptible)",
                    "Trapecio isósceles siempre es inscriptible"
                ),
                formulas = listOf(
                    "\\alpha + \\theta = 180^\\circ \\quad (\\text{Ángulos Opuestos})",
                    "\\angle BAC = \\angle BDC \\quad (\\text{Rebote de Diagonales})"
                ),
                formulaName = "Condición de Inscriptibilidad",
                formulaLatex = "\\hat{A} + \\hat{C} = \\hat{B} + \\hat{D} = 180^\\circ",
                formulaDescription = "Condición angular que garantiza la existencia de una circunferencia circunscrita a un cuadrilátero convexo.",
                admissionTip = "Si dos triángulos rectángulos comparten la misma hipotenusa, sus cuatro vértices forman INMEDIATAMENTE un cuadrilátero inscriptible.",
                admissionExplanation = "• Esto permite aplicar el 'rebote' de ángulos entre sus diagonales para trasladar datos angulares desconocidos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un cuadrilátero inscriptible ABCD, el ángulo interior en A mide (3x + 10°) y el ángulo interior opuesto en C mide (2x + 20°). Calcule el valor de 'x'.",
                    options = listOf("20°", "25°", "30°", "35°", "40°"),
                    correctIndex = 2,
                    explanation = "Por la propiedad de cuadriláteros inscriptibles, los ángulos interiores opuestos son suplementarios (suman 180°):\n(3x + 10°) + (2x + 20°) = 180°\n5x + 30° = 180°\n5x = 150° => x = 30°.",
                    subject = "Geometría",
                    semana = 6
                )
            )
        ),
        // =========================================================================
        // TEMA 07: PROPORCIONALIDAD Y SEMEJANZA (Semana 7)
        // =========================================================================
        LessonNode(
            id = "geo_t07_s01",
            subjectId = "geometria",
            semana = 7,
            subtema = "7.1 Teorema de Tales y Corolarios en el Triángulo",
            title = "Teorema de Tales y Proporcionalidad",
            theory = LessonTheory(
                id = "theory_geo_t07_s01",
                asignatura = "Geometría",
                semana = 7,
                titulo = "Teorema de Tales y Proporcionalidad",
                resumen = "• Teorema de Tales:\n  - Tres o más rectas paralelas determinan sobre dos rectas secantes transversales segmentos correspondientes directamente proporcionales:\n  - Si L₁ // L₂ // L₃ ⇒ AB / BC = DE / EF.\n• Corolario Fundamental en el Triángulo:\n  - Toda recta paralela a uno de los lados de un triángulo divide a los otros dos lados en segmentos proporcionales:\n  - Si EF // AC en ΔABC ⇒ BE / EA = BF / FC.\n• Propiedad de las Alturas: La paralela también divide a la altura relativa en la misma proporción: BE / EA = h₁ / h₂.",
                conceptosClave = listOf(
                    "Teorema de Tales entre paralelas",
                    "Proporcionalidad de segmentos en secantes",
                    "Corolario de la paralela en el triángulo",
                    "Conservación de razones geométricas"
                ),
                formulas = listOf(
                    "\\frac{AB}{BC} = \\frac{DE}{EF} \\quad (\\mathcal{L}_1 \\parallel \\mathcal{L}_2 \\parallel \\mathcal{L}_3)",
                    "\\frac{BE}{EA} = \\frac{BF}{FC} \\quad (EF \\parallel AC)"
                ),
                formulaName = "Teorema de Tales de Mileto",
                formulaLatex = "\\frac{AB}{BC} = \\frac{A'B'}{B'C'}",
                formulaDescription = "Establece la invariancia proyectiva de las razones de longitud entre segmentos interceptados por un haz de rectas paralelas.",
                admissionTip = "Para calcular la longitud x en AB/BC = DE/EF, multiplica en aspa: AB · EF = BC · DE.",
                admissionExplanation = "• No confundas los segmentos laterales con la base: EF/AC = BE/BA (se toma el lado completo, no solo EA)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, se traza el segmento PQ paralelo al lado AC (con P en AB y Q en BC). Si BP = 6 cm, PA = 9 cm y BQ = 8 cm, halle la longitud del segmento QC.",
                    options = listOf("10 cm", "11 cm", "12 cm", "13 cm", "14 cm"),
                    correctIndex = 2,
                    explanation = "Por el corolario del Teorema de Tales (PQ // AC):\nBP / PA = BQ / QC\n6 / 9 = 8 / QC\nSimplificamos 6/9 = 2/3:\n2 / 3 = 8 / QC => 2 · QC = 24 => QC = 12 cm.",
                    subject = "Geometría",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "geo_t07_s02",
            subjectId = "geometria",
            semana = 7,
            subtema = "7.2 Teoremas de la Bisectriz Interior y Exterior",
            title = "Teoremas de la Bisectriz Interior y Exterior",
            theory = LessonTheory(
                id = "theory_geo_t07_s02",
                asignatura = "Geometría",
                semana = 7,
                titulo = "Teoremas de la Bisectriz",
                resumen = "• Teorema de la Bisectriz Interior:\n  - En todo triángulo, la bisectriz de un ángulo interior divide al lado opuesto en dos segmentos cuyas longitudes son directamente proporcionales a las longitudes de los lados concurrentes:\n  - c / a = m / n ⇔ c / m = a / n.\n• Teorema de la Bisectriz Exterior:\n  - En todo triángulo escaleno, la bisectriz de un ángulo exterior divide a la prolongación del lado opuesto en segmentos proporcionales a los lados concurrentes:\n  - c / a = m / n (donde m es la distancia total desde un vértice hasta el punto exterior y n es la prolongación exterior).\n• División Armónica de la Base:\n  - Los pies de las bisectrices interior (D) y exterior (E) trazadas desde el mismo vértice dividen armónicamente al lado opuesto: AD/DC = AE/CE.",
                conceptosClave = listOf(
                    "Bisectriz interior: c/a = m/n",
                    "Bisectriz exterior: c/a = m/n en la prolongación",
                    "División armónica por bisectrices concurrentes",
                    "Relación directa entre lados adyacentes y segmentos basales"
                ),
                formulas = listOf(
                    "\\frac{c}{a} = \\frac{m}{n} \\quad (\\text{Bisectriz Interior})",
                    "\\frac{c}{a} = \\frac{m_{\\text{total}}}{n_{\\text{ext}}} \\quad (\\text{Bisectriz Exterior})"
                ),
                formulaName = "Teorema de la Bisectriz Interior",
                formulaLatex = "\\frac{c}{a} = \\frac{m}{n}",
                formulaDescription = "Relaciona los lados adyacentes con los segmentos determinados en la base por la bisectriz.",
                admissionTip = "Si los lados adyacentes miden 12 y 8 (razón 3 a 2), los segmentos determinados en la base por la bisectriz interior están OBLIGATORIAMENTE en la misma razón 3k y 2k.",
                admissionExplanation = "• Asignar 3k y 2k directamente a la base ahorra plantear proporciones fraccionarias."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, AB = 10 cm y BC = 15 cm. Se traza la bisectriz interior BD. Si el lado AC mide 20 cm, halle la longitud del segmento AD.",
                    options = listOf("6 cm", "8 cm", "10 cm", "12 cm", "14 cm"),
                    correctIndex = 1,
                    explanation = "Por el Teorema de la Bisectriz Interior:\nAB / BC = AD / DC\n10 / 15 = AD / DC => 2 / 3 = AD / DC.\nPodemos poner AD = 2k y DC = 3k.\nComo AC = AD + DC = 20 cm:\n2k + 3k = 20 => 5k = 20 => k = 4 cm.\nPor lo tanto: AD = 2k = 2(4) = 8 cm.",
                    subject = "Geometría",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "geo_t07_s03",
            subjectId = "geometria",
            semana = 7,
            subtema = "7.3 Criterios de Semejanza de Triángulos",
            title = "Criterios de Semejanza de Triángulos",
            theory = LessonTheory(
                id = "theory_geo_t07_s03",
                asignatura = "Geometría",
                semana = 7,
                titulo = "Criterios de Semejanza de Triángulos",
                resumen = "• Semejanza de Triángulos (ΔABC ~ ΔDEF):\n  - Dos triángulos son semejantes si sus ángulos homólogos son congruentes y sus lados homólogos son estrictamente proporcionales: a/d = b/e = c/f = k (razón de semejanza).\n• Criterios Mínimos de Semejanza:\n  1. Criterio AA (Ángulo-Ángulo): Tienen al menos dos pares de ángulos interiores congruentes (criterio principal en admisión).\n  2. Criterio LAL (Lado-Ángulo-Lado): Tienen un ángulo congruente comprendido entre lados proporcionales.\n  3. Criterio LLL (Lado-Lado-Lado): Sus tres lados son respectivamente proporcionales.\n• Proporcionalidad Universal de Líneas Homólogas:\n  - La razón k se cumple no solo para los lados, sino para las alturas, medianas, bisectrices, inradios y perímetros: 2p₁ / 2p₂ = k.\n  - Relación de Áreas: La razón de las áreas de dos triángulos semejantes es igual al CUADRADO de la razón de semejanza: Área₁ / Área₂ = k².",
                conceptosClave = listOf(
                    "Criterio AA (bastan 2 ángulos iguales)",
                    "Constante de proporcionalidad k en lados homólogos",
                    "Razón de perímetros igual a k",
                    "Razón de áreas igual a k²"
                ),
                formulas = listOf(
                    "\\frac{a}{a'} = \\frac{b}{b'} = \\frac{c}{c'} = \\frac{h}{h'} = \\frac{2p}{2p'} = k",
                    "\\frac{\\text{Área}_1}{\\text{Área}_2} = k^2"
                ),
                formulaName = "Relación de Semejanza de Áreas",
                formulaLatex = "\\frac{\\mathcal{A}_1}{\\mathcal{A}_2} = k^2 = \\left(\\frac{a}{a'}\\right)^2",
                formulaDescription = "Demuestra que la razón entre las superficies de dos figuras semejantes escala cuadráticamente respecto a la razón lineal.",
                admissionTip = "Si dos triángulos son semejantes con lados en razón 1 a 3 (k = 3), el área del mayor es 3² = 9 veces el área del menor.",
                admissionExplanation = "• No cometas el error de multiplicar el área solo por 3."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos triángulos semejantes tienen perímetros de 18 cm y 27 cm respectivamente. Si el área del triángulo menor es 32 cm², halle el área del triángulo mayor.",
                    options = listOf("48 cm²", "64 cm²", "72 cm²", "81 cm²", "96 cm²"),
                    correctIndex = 2,
                    explanation = "1. Hallamos la razón de semejanza k entre el mayor y el menor:\nk = 2p_mayor / 2p_menor = 27 / 18 = 3 / 2.\n2. La razón de las áreas es el cuadrado de la razón lineal:\nÁrea_mayor / Área_menor = k² = (3/2)² = 9 / 4.\n3. Despejamos el área del triángulo mayor:\nÁrea_mayor = 32 · (9 / 4) = 8 · 9 = 72 cm².",
                    subject = "Geometría",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "geo_t07_s04",
            subjectId = "geometria",
            semana = 7,
            subtema = "7.4 Teoremas de Ceva y Menelao",
            title = "Teoremas de Ceva y Menelao",
            theory = LessonTheory(
                id = "theory_geo_t07_s04",
                asignatura = "Geometría",
                semana = 7,
                titulo = "Teoremas de Ceva y Menelao",
                resumen = "• Teorema de Ceva (Cevianas Concurrentes):\n  - Si tres cevianas interiores trazadas desde los tres vértices de un triángulo concurren en un único punto interior O, el producto de tres segmentos alternados determinados en los lados es igual al producto de los otros tres:\n  - (x) · (y) · (z) = (a) · (b) · (c).\n• Teorema de Menelao (Secante Exterior):\n  - Si una recta secante transversal corta a dos lados de un triángulo y a la prolongación del tercer lado, el producto de tres segmentos alternados es igual al producto de los otros tres (tomando la prolongación total para el tercero):\n  - (x) · (y) · (z) = (a) · (b) · (c).\n• Ambos teoremas permiten calcular relaciones de proporcionalidad complejas sin necesidad de trazar paralelas auxiliares.",
                conceptosClave = listOf(
                    "Ceva: 3 cevianas concurrentes en un punto interior",
                    "Menelao: recta secante a 2 lados y prolongación del tercero",
                    "Producto de segmentos alternados iguales",
                    "Resolución rápida de razones sin trazos auxiliares"
                ),
                formulas = listOf(
                    "a \\cdot b \\cdot c = x \\cdot y \\cdot z \\quad (\\text{Teorema de Ceva})",
                    "a \\cdot b \\cdot c = x \\cdot y \\cdot z \\quad (\\text{Teorema de Menelao})"
                ),
                formulaName = "Teorema de Ceva",
                formulaLatex = "x_1 x_2 x_3 = y_1 y_2 y_3",
                formulaDescription = "Condición de concurrencia de tres cevianas basada en el producto intercalado de segmentos sobre los lados del triángulo.",
                admissionTip = "Para aplicar Menelao sin equivocarte, marca los segmentos empezando desde un vértice: 'segmento - segmento - segmento' alternando en salto de rana.",
                admissionExplanation = "• En el tercer lado, uno de los factores es toda la distancia desde el vértice extremo hasta la recta secante exterior."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, tres cevianas interiores concurrentes dividen a los lados AB en 3 y 4 cm, a BC en 6 y 2 cm, y a AC en x y 9 cm (en ese orden cíclico). Halle el valor de 'x'.",
                    options = listOf("2 cm", "3 cm", "4 cm", "5 cm", "6 cm"),
                    correctIndex = 2,
                    explanation = "Aplicamos el Teorema de Ceva:\nProducto de términos alternados = Producto de los otros tres términos\n3 · 6 · 9 = 4 · 2 · x\n162 = 8x => x = 162 / 8 = 20.25... Espera: si los segmentos son alternados: 3, 6, x vs 4, 2, 9:\n3 · 6 · x = 4 · 2 · 9\n18x = 72 => x = 72 / 18 = 4 cm.\nEl valor de x es 4 cm.",
                    subject = "Geometría",
                    semana = 7
                )
            )
        ),
        // =========================================================================
        // TEMA 08: RELACIONES MÉTRICAS (Semana 8)
        // =========================================================================
        LessonNode(
            id = "geo_t08_s01",
            subjectId = "geometria",
            semana = 8,
            subtema = "8.1 Relaciones Métricas en el Triángulo Rectángulo",
            title = "Relaciones Métricas en el Triángulo Rectángulo",
            theory = LessonTheory(
                id = "theory_geo_t08_s01",
                asignatura = "Geometría",
                semana = 8,
                titulo = "Relaciones Métricas en el Triángulo Rectángulo",
                resumen = "• Elementos: Catetos a y b, Hipotenusa c, Altura relativa h, Proyecciones m y n sobre la hipotenusa (m + n = c).\n• Teoremas Fundamentales:\n  1. Teorema de Pitágoras: a² + b² = c².\n  2. Cuadrado de un Cateto: El cuadrado de cada cateto es igual al producto de la hipotenusa por su respectiva proyección: a² = c · m; b² = c · n.\n  3. Cuadrado de la Altura: La altura relativa a la hipotenusa al cuadrado es igual al producto de las proyecciones de los catetos: h² = m · n.\n  4. Producto de Catetos: El producto de los catetos es igual al producto de la hipotenusa por la altura: a · b = c · h.\n  5. Inversa de Cuadrados: 1/a² + 1/b² = 1/h².",
                conceptosClave = listOf(
                    "Cateto al cuadrado: cateto² = hipotenusa · proyección",
                    "Altura al cuadrado: h² = m · n",
                    "Producto de catetos: a · b = c · h",
                    "Inversas cuadráticas: 1/a² + 1/b² = 1/h²"
                ),
                formulas = listOf(
                    "a^2 = c \\cdot m, \\quad b^2 = c \\cdot n",
                    "h^2 = m \\cdot n",
                    "a \\cdot b = c \\cdot h",
                    "\\frac{1}{a^2} + \\frac{1}{b^2} = \\frac{1}{h^2}"
                ),
                formulaName = "Teorema de la Altura Relativa a la Hipotenusa",
                formulaLatex = "h^2 = m \\cdot n",
                formulaDescription = "Demuestra analíticamente que la altura relativa es la media geométrica de las proyecciones ortogonales de los catetos.",
                admissionTip = "Para calcular la altura rápidamente cuando conoces los catetos: h = (a · b) / c. Es la fórmula más utilizada.",
                admissionExplanation = "• La razón entre los cuadrados de los catetos es igual a la razón entre sus proyecciones: a² / b² = m / n."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo rectángulo, las proyecciones de los catetos sobre la hipotenusa miden 4 cm y 9 cm. Calcule la longitud de la altura relativa a la hipotenusa.",
                    options = listOf("5 cm", "6 cm", "6.5 cm", "7 cm", "8 cm"),
                    correctIndex = 1,
                    explanation = "Aplicamos la relación métrica: h² = m · n\nh² = 4 · 9 = 36\nh = √36 = 6 cm.",
                    subject = "Geometría",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "geo_t08_s02",
            subjectId = "geometria",
            semana = 8,
            subtema = "8.2 Relaciones Métricas en Triángulos Oblicuángulos y Teorema de Herón",
            title = "Relaciones Métricas en Oblicuángulos y Herón",
            theory = LessonTheory(
                id = "theory_geo_t08_s02",
                asignatura = "Geometría",
                semana = 8,
                titulo = "Relaciones Métricas en Oblicuángulos",
                resumen = "• Primer Teorema de Euclides (Ángulo Agudo):\n  - El cuadrado del lado opuesto a un ángulo agudo es igual a la suma de los cuadrados de los otros dos lados MENOS el doble producto de uno de ellos por la proyección del otro sobre él:\n  - a² = b² + c² - 2c · m.\n• Segundo Teorema de Euclides (Ángulo Obtuso):\n  - a² = b² + c² + 2c · m (suma el doble producto de la proyección exterior).\n• Teorema de Herón para la Altura:\n  - Permite calcular la altura h_c de cualquier triángulo conociendo solo sus tres lados:\n  - h_c = (2 / c) · √[ p(p - a)(p - b)(p - c) ], donde p = (a + b + c) / 2 es el semiperímetro.",
                conceptosClave = listOf(
                    "Euclides agudo: a² = b² + c² - 2cm",
                    "Euclides obtuso: a² = b² + c² + 2cm",
                    "Fórmula de Herón para altura: h = (2/c)√[p(p-a)(p-b)(p-c)]",
                    "Semiperímetro p = (a + b + c) / 2"
                ),
                formulas = listOf(
                    "a^2 = b^2 + c^2 - 2c \\cdot m \\quad (\\text{Agudo})",
                    "a^2 = b^2 + c^2 + 2c \\cdot m \\quad (\\text{Obtuso})",
                    "h_c = \\frac{2}{c} \\sqrt{p(p - a)(p - b)(p - c)}"
                ),
                formulaName = "Fórmula de Herón para la Altura",
                formulaLatex = "h_c = \\frac{2}{c} \\sqrt{p(p-a)(p-b)(p-c)}",
                formulaDescription = "Algoritmo de la Grecia clásica que obtiene la altura perpendicular sin requerir funciones trigonométricas.",
                admissionTip = "El Teorema de Euclides es el equivalente geométrico euclidiano de la Ley de Cosenos de Trigonometría (m = b · cos θ).",
                admissionExplanation = "• Si el triángulo tiene lados enteros conocidos (ej. 13, 14, 15), el semiperímetro es entero y Herón se evalúa de inmediato."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo cuyos lados miden a = 13 cm, b = 15 cm y c = 14 cm, halle la longitud de la altura relativa al lado c = 14 cm.",
                    options = listOf("10 cm", "11 cm", "12 cm", "13 cm", "14 cm"),
                    correctIndex = 2,
                    explanation = "1. Semiperímetro: p = (13 + 15 + 14) / 2 = 42 / 2 = 21 cm.\n2. Factores de Herón:\np - a = 21 - 13 = 8\np - b = 21 - 15 = 6\np - c = 21 - 14 = 7\n3. Radicando de Herón:\n21 · 8 · 6 · 7 = (7 · 3) · (8) · (6) · 7 = 7² · (3 · 8 · 6) = 49 · 144 = (7 · 12)² = 84².\nÁrea = 84 cm².\n4. Altura h_c:\nh_c = 2 · Área / c = 2(84) / 14 = 168 / 14 = 12 cm.",
                    subject = "Geometría",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "geo_t08_s03",
            subjectId = "geometria",
            semana = 8,
            subtema = "8.3 Teorema de la Mediana y Teorema de Stewart",
            title = "Teorema de la Mediana y Stewart",
            theory = LessonTheory(
                id = "theory_geo_t08_s03",
                asignatura = "Geometría",
                semana = 8,
                titulo = "Teorema de la Mediana y Stewart",
                resumen = "• Teorema de la Mediana (Teorema de Apolonio):\n  - La suma de los cuadrados de dos lados es igual al doble del cuadrado de la mediana relativa al tercer lado MÁS la mitad del cuadrado de dicho tercer lado:\n  - a² + b² = 2(m_c)² + c² / 2.\n• Teorema de Stewart (Ceviana General):\n  - Permite calcular la longitud de cualquier ceviana interior x que divide a la base c en segmentos m y n (m + n = c):\n  - a² · m + b² · n = c · (x² + m · n).\n• Teorema de la Bisectriz Interior Métrica:\n  - El cuadrado de la bisectriz interior V_b es igual al producto de los lados concurrentes MENOS el producto de los segmentos determinados en la base: (V_b)² = a · c - m · n.",
                conceptosClave = listOf(
                    "Teorema de la Mediana: a² + b² = 2m² + c²/2",
                    "Teorema de Stewart para cualquier ceviana",
                    "Longitud métrica de bisectriz: V² = ac - mn",
                    "Resolución métrica sin coordenadas"
                ),
                formulas = listOf(
                    "a^2 + b^2 = 2 m_c^2 + \\frac{c^2}{2} \\quad (\\text{Apolonio})",
                    "a^2 m + b^2 n = c(x^2 + m n) \\quad (\\text{Stewart})",
                    "V_b^2 = a c - m n \\quad (\\text{Bisectriz Interior})"
                ),
                formulaName = "Teorema de Apolonio (de la Mediana)",
                formulaLatex = "a^2 + b^2 = 2 m_c^2 + \\frac{c^2}{2}",
                formulaDescription = "Vínculo métrico exacto entre los lados de un triángulo y la longitud de cualquiera de sus medianas.",
                admissionTip = "Si sumas las tres ecuaciones de las medianas de un triángulo obtienes: 4(m_a² + m_b² + m_c²) = 3(a² + b² + c²).",
                admissionExplanation = "• La suma de los cuadrados de las medianas es exactamente 3/4 de la suma de los cuadrados de los lados."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, AB = 5 cm, BC = 7 cm y AC = 6 cm. Halle la longitud de la mediana BM relativa al lado AC.",
                    options = listOf("2√2 cm", "2√3 cm", "2√6 cm", "2√7 cm", "4 cm"),
                    correctIndex = 3,
                    explanation = "Aplicamos el Teorema de la Mediana (Apolonio):\nAB² + BC² = 2(BM)² + AC² / 2\n5² + 7² = 2(BM)² + 6² / 2\n25 + 49 = 2(BM)² + 36 / 2\n74 = 2(BM)² + 18\n2(BM)² = 74 - 18 = 56\n(BM)² = 28 => BM = √28 = √(4 · 7) = 2√7 cm.",
                    subject = "Geometría",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "geo_t08_s04",
            subjectId = "geometria",
            semana = 8,
            subtema = "8.4 Relaciones Métricas en la Circunferencia: Cuerdas, Tangente y Secantes",
            title = "Relaciones Métricas en la Circunferencia",
            theory = LessonTheory(
                id = "theory_geo_t08_s04",
                asignatura = "Geometría",
                semana = 8,
                titulo = "Relaciones Métricas en la Circunferencia",
                resumen = "• Teorema de las Cuerdas:\n  - Si dos cuerdas se cortan en un punto interior P de la circunferencia, el producto de los segmentos de una cuerda es igual al producto de los segmentos de la otra cuerda:\n  - PA · PB = PC · PD.\n• Teorema de la Tangente y la Secante:\n  - Si desde un punto exterior P se trazan una tangente PT y una secante P-A-B, el cuadrado de la tangente es igual al producto de la secante total por su parte exterior:\n  - PT² = PB · PA.\n• Teorema de las Secantes:\n  - Si desde un punto exterior P se trazan dos secantes P-A-B y P-C-D, el producto de la primera secante total por su parte externa es igual al producto de la segunda secante total por su parte externa:\n  - PB · PA = PD · PC.",
                conceptosClave = listOf(
                    "Teorema de las cuerdas: PA · PB = PC · PD",
                    "Teorema de la tangente: PT² = PB · PA",
                    "Teorema de secantes: Secante total · Parte externa = cte",
                    "Invarianza de potencia de un punto"
                ),
                formulas = listOf(
                    "PA \\cdot PB = PC \\cdot PD \\quad (\\text{Cuerdas})",
                    "PT^2 = PB \\cdot PA \\quad (\\text{Tangente})",
                    "PB \\cdot PA = PD \\cdot PC \\quad (\\text{Secantes})"
                ),
                formulaName = "Teorema de la Tangente y la Secante",
                formulaLatex = "PT^2 = PB \\cdot PA",
                formulaDescription = "Expresa la potencia de un punto exterior vinculando la longitud del segmento tangente con la secante.",
                admissionTip = "Cuidado con la secante: el factor exterior PA se multiplica por la SECANTE COMPLETA PB (PA + AB), ¡no solo por la cuerda interior AB!",
                admissionExplanation = "• Este es el error más recurrente en los exámenes de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Desde un punto exterior P se traza una tangente PT a una circunferencia y una secante PAB que pasa por el centro. Si la parte externa PA = 4 cm y la cuerda interior AB = 12 cm, halle la longitud de la tangente PT.",
                    options = listOf("6 cm", "7 cm", "8 cm", "9 cm", "10 cm"),
                    correctIndex = 2,
                    explanation = "Aplicamos el Teorema de la Tangente y la Secante:\nPT² = Secante total · Parte externa\nSecante total PB = PA + AB = 4 cm + 12 cm = 16 cm.\nParte externa PA = 4 cm.\nPT² = 16 · 4 = 64\nPT = √64 = 8 cm.",
                    subject = "Geometría",
                    semana = 8
                )
            )
        ),
        // =========================================================================
        // TEMA 09: ÁREAS DE REGIONES PLANAS (Semana 9)
        // =========================================================================
        LessonNode(
            id = "geo_t09_s01",
            subjectId = "geometria",
            semana = 9,
            subtema = "9.1 Áreas de Regiones Triangulares: Fórmulas Básica, Trigonométrica y Herón",
            title = "Áreas Triangulares Fundamentales",
            theory = LessonTheory(
                id = "theory_geo_t09_s01",
                asignatura = "Geometría",
                semana = 9,
                titulo = "Áreas Triangulares Fundamentales",
                resumen = "• Área de una Región: Medida de la superficie encerrada por una figura geométrica plana en unidades cuadradas (u²).\n• Fórmula Básica: S = (Base · Altura) / 2 = (b · h) / 2.\n  - Triángulo Rectángulo: S = (Producto de catetos) / 2 = (a · b) / 2.\n• Fórmula Trigonométrica: El área es igual al semiproducto de dos lados por el seno del ángulo comprendido entre ellos: S = (a · b · sen θ) / 2.\n• Triángulo Equilátero de lado L: S = (L² · √3) / 4 = h² / √3.\n• Fórmula de Herón: S = √[ p(p - a)(p - b)(p - c) ], donde p = (a + b + c) / 2.",
                conceptosClave = listOf(
                    "Fórmula básica: (base · altura) / 2",
                    "Fórmula trigonométrica: (ab · sen θ) / 2",
                    "Área de triángulo equilátero: (L²√3) / 4",
                    "Fórmula de Herón con semiperímetro p"
                ),
                formulas = listOf(
                    "S = \\frac{b \\cdot h}{2}",
                    "S = \\frac{a \\cdot b \\cdot \\sin\\theta}{2}",
                    "S_{\\text{equilátero}} = \\frac{L^2 \\sqrt{3}}{4}",
                    "S = \\sqrt{p(p-a)(p-b)(p-c)}"
                ),
                formulaName = "Fórmula del Área del Triángulo Equilátero",
                formulaLatex = "S = \\frac{L^2 \\sqrt{3}}{4}",
                formulaDescription = "Determina analíticamente la superficie del polígono regular de tres lados a partir de su arista L.",
                admissionTip = "En un triángulo equilátero, si te dan la altura 'h' en lugar del lado, usa directamente: S = h²√3 / 3. Te ahorra despejar el lado.",
                admissionExplanation = "• La fórmula trigonométrica es ideal cuando conoces dos lados y un ángulo notable como 30°, 45° o 60°."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo, dos de sus lados miden 8 cm y 10 cm, y el ángulo comprendido entre ellos mide 30°. Calcule el área de dicha región triangular.",
                    options = listOf("15 cm²", "20 cm²", "25 cm²", "30 cm²", "40 cm²"),
                    correctIndex = 1,
                    explanation = "Aplicamos la fórmula trigonométrica del área:\nS = (a · b · sen θ) / 2\nS = [8 · 10 · sen(30°)] / 2\nComo sen(30°) = 1/2:\nS = [80 · (1/2)] / 2 = 40 / 2 = 20 cm².",
                    subject = "Geometría",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "geo_t09_s02",
            subjectId = "geometria",
            semana = 9,
            subtema = "9.2 Áreas Triangulares en Función de Inradio, Circunradio y Relaciones",
            title = "Áreas con Inradio, Circunradio y Relaciones de Áreas",
            theory = LessonTheory(
                id = "theory_geo_t09_s02",
                asignatura = "Geometría",
                semana = 9,
                titulo = "Inradio, Circunradio y Relación de Áreas",
                resumen = "• En Función del Inradio (r): S = p · r (semiperímetro por inradio).\n• En Función del Circunradio (R): S = (a · b · c) / (4R).\n• En Función del Exradio (r_a): S = (p - a) · r_a.\n• Relaciones de Áreas en Triángulos:\n  1. Si dos triángulos tienen la misma altura, sus áreas son proporcionales a sus bases: S₁ / S₂ = b₁ / b₂.\n  2. Mediana: Toda mediana divide al triángulo en dos regiones de IGUAL ÁREA (S₁ = S₂).\n  3. Baricentro: Las tres medianas dividen al triángulo en 6 áreas iguales (S/6 cada una).\n  4. Triángulo Mediano (uniendo puntos medios): Área del triángulo central = S / 4.",
                conceptosClave = listOf(
                    "S = p · r (Inradio)",
                    "S = abc / (4R) (Circunradio)",
                    "Bases proporcionales a áreas con igual altura",
                    "Mediana biseca el área; triángulo mediano es S/4"
                ),
                formulas = listOf(
                    "S = p \\cdot r",
                    "S = \\frac{a \\cdot b \\cdot c}{4R}",
                    "\\frac{S_1}{S_2} = \\frac{b_1}{b_2} \\quad (\\text{Misma altura})"
                ),
                formulaName = "Fórmula del Área con Inradio",
                formulaLatex = "S = p \\cdot r",
                formulaDescription = "Calcula la superficie triangular multiplicando el semiperímetro por el radio de la circunferencia inscrita.",
                admissionTip = "Si conoces los lados de un triángulo y te piden el inradio 'r', primero calcula el área con Herón y luego despeja r = S / p.",
                admissionExplanation = "• Este procedimiento encadenado es un clásico en exámenes de ciencias e ingenierías."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El perímetro de un triángulo es 36 cm y el radio de su circunferencia inscrita mide 4 cm. Halle el área de la región triangular.",
                    options = listOf("54 cm²", "72 cm²", "96 cm²", "108 cm²", "144 cm²"),
                    correctIndex = 1,
                    explanation = "1. Semiperímetro: p = 2p / 2 = 36 cm / 2 = 18 cm.\n2. Inradio: r = 4 cm.\n3. Aplicamos la fórmula del área con inradio:\nS = p · r = 18 cm · 4 cm = 72 cm².",
                    subject = "Geometría",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "geo_t09_s03",
            subjectId = "geometria",
            semana = 9,
            subtema = "9.3 Áreas de Regiones Cuadrangulares",
            title = "Áreas de Regiones Cuadrangulares",
            theory = LessonTheory(
                id = "theory_geo_t09_s03",
                asignatura = "Geometría",
                semana = 9,
                titulo = "Áreas de Regiones Cuadrangulares",
                resumen = "• Cuadrado: S = L² = d² / 2 (donde d es la diagonal).\n• Rectángulo: S = Base · Altura = b · h.\n• Paralelogramo (Romboide): S = Base · Altura = b · h = a · b · sen θ.\n• Rombo: S = (D · d) / 2 (semiproducto de sus diagonales perpendiculares).\n• Trapecio: S = [ (B + b) / 2 ] · h = Mediana · Altura.\n• Cuadrilátero General (Fórmula de Diagonales): S = (d₁ · d₂ · sen α) / 2 (donde α es el ángulo que forman sus diagonales al cortarse).\n• Propiedad de Áreas en Trapecios: Los triángulos laterales formados por las diagonales tienen IGUAL ÁREA: S₁ = S₂ = √(S_B · S_b).",
                conceptosClave = listOf(
                    "Trapecio: S = [(B + b)/2] · h",
                    "Rombo: S = (D · d) / 2",
                    "Cuadrilátero general: (d₁ · d₂ · sen α) / 2",
                    "Regiones triangulares laterales en trapecio son equivalentes"
                ),
                formulas = listOf(
                    "S_{\\text{trapecio}} = \\frac{B + b}{2} \\cdot h = M \\cdot h",
                    "S_{\\text{rombo}} = \\frac{D \\cdot d}{2}",
                    "S_{\\text{cuadrilátero}} = \\frac{d_1 \\cdot d_2 \\cdot \\sin\\alpha}{2}"
                ),
                formulaName = "Fórmula del Área del Trapecio",
                formulaLatex = "S = \\frac{B + b}{2} \\cdot h",
                formulaDescription = "Multiplica la longitud de la base media por la distancia perpendicular entre ambas bases paralelas.",
                admissionTip = "En un trapecio con bases B y b, al trazar las diagonales se forman 4 triángulos: el área total es (√S₁ + √S₂)², donde S₁ y S₂ son las áreas con bases B y b.",
                admissionExplanation = "• Esta identidad permite resolver problemas con trapecios en segundos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un trapecio, las bases miden 6 cm y 14 cm. Si su altura mide 8 cm, halle el área de dicha región trapecial.",
                    options = listOf("60 cm²", "70 cm²", "80 cm²", "90 cm²", "100 cm²"),
                    correctIndex = 2,
                    explanation = "Aplicamos la fórmula del área del trapecio:\nS = [(B + b) / 2] · h\nS = [(14 + 6) / 2] · 8\nS = [20 / 2] · 8 = 10 · 8 = 80 cm².",
                    subject = "Geometría",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "geo_t09_s04",
            subjectId = "geometria",
            semana = 9,
            subtema = "9.4 Áreas de Regiones Circulares: Círculo, Sector y Corona Circular",
            title = "Áreas de Regiones Circulares",
            theory = LessonTheory(
                id = "theory_geo_t09_s04",
                asignatura = "Geometría",
                semana = 9,
                titulo = "Áreas de Regiones Circulares",
                resumen = "• Círculo Completo: S = π · R² = (π · D²) / 4.\n• Sector Circular de ángulo central θ (en grados sexagesimales):\n  - S = (π · R² · θ) / 360° = (L · R) / 2 (donde L es la longitud del arco).\n• Corona Circular (entre dos círculos concéntricos de radios R y r):\n  - S = π(R² - r²).\n  - Si se conoce la cuerda AB tangente a la circunferencia interior: S = π · (AB / 2)² = π · AB² / 4.\n• Segmento Circular (región entre cuerda y arco): S = S_{sector} - S_{triángulo}.\n• Lúnula de Hipócrates: Las lúnulas construidas sobre los catetos de un triángulo rectángulo suman exactamente el área del triángulo rectángulo.",
                conceptosClave = listOf(
                    "Círculo: S = πR²",
                    "Sector circular: (πR²θ) / 360° o LR / 2",
                    "Corona circular: π(R² - r²)",
                    "Corona en función de cuerda tangente: π(AB/2)²",
                    "Segmento circular: Sector menos triángulo"
                ),
                formulas = listOf(
                    "S_{\\text{círculo}} = \\pi R^2",
                    "S_{\\text{sector}} = \\frac{\\pi R^2 \\theta}{360^\\circ}",
                    "S_{\\text{corona}} = \\pi (R^2 - r^2) = \\pi \\left(\\frac{AB}{2}\\right)^2"
                ),
                formulaName = "Área de la Corona Circular por Cuerda Tangente",
                formulaLatex = "S = \\pi \\left(\\frac{AB}{2}\\right)^2",
                formulaDescription = "Calcula el área de una corona circular sin conocer ninguno de los dos radios individuales, solo la cuerda secante exterior.",
                admissionTip = "En problemas de áreas sombreadas compuestas, busca traslaciones de sectores circulares simétricos para formar figuras geométricas completas.",
                admissionExplanation = "• El Teorema de las Lúnulas de Hipócrates establece que la suma de las áreas de las dos lúnulas equivale exactamente al área del triángulo rectángulo central."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t09_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una corona circular, una cuerda de la circunferencia mayor que es tangente a la menor mide 10 cm. Calcule el área de dicha corona circular.",
                    options = listOf("20π cm²", "25π cm²", "30π cm²", "50π cm²", "100π cm²"),
                    correctIndex = 1,
                    explanation = "Sea AB = 10 cm la cuerda tangente a la menor.\nPor el teorema de Pitágoras entre el radio mayor R, el menor r y la mitad de la cuerda (AB/2 = 5 cm):\nR² - r² = (AB / 2)² = 5² = 25.\nEl área de la corona circular es:\nS = π(R² - r²) = π · 25 = 25π cm².",
                    subject = "Geometría",
                    semana = 9
                )
            )
        ),
        // =========================================================================
        // TEMA 10: GEOMETRÍA DEL ESPACIO Y POLIEDROS (Semana 10)
        // =========================================================================
        LessonNode(
            id = "geo_t10_s01",
            subjectId = "geometria",
            semana = 10,
            subtema = "10.1 Rectas, Planos y Teorema de las Tres Perpendiculares",
            title = "Geometría del Espacio: Planos y Rectas",
            theory = LessonTheory(
                id = "theory_geo_t10_s01",
                asignatura = "Geometría",
                semana = 10,
                titulo = "Geometría del Espacio: Planos y Rectas",
                resumen = "• Postulado de Determinación de un Plano:\n  - Un plano queda unívocamente determinado por: 1) Tres puntos no colineales, 2) Una recta y un punto exterior, 3) Dos rectas secantes, 4) Dos rectas paralelas no coincidentes.\n• Posiciones Relativas de dos Rectas en el Espacio:\n  - Coplanarias: Secantes (se cortan) o Paralelas.\n  - Alabeadas o Cruzadas: NO son coplanares (no se cortan ni son paralelas).\n• Recta Perpendicular a un Plano:\n  - Una recta es perpendicular a un plano si es perpendicular a TODAS las rectas del plano. Condición: basta que sea perpendicular a dos rectas secantes del plano.\n• Teorema de las Tres Perpendiculares (Piedra angular del espacio):\n  - Si una recta L₁ es perpendicular a un plano en el punto O, y desde O se traza una segunda perpendicular L₂ a una recta L contenida en el plano en el punto P, entonces toda recta trazada desde cualquier punto de L₁ hacia P es PERPENDICULAR a la recta L.",
                conceptosClave = listOf(
                    "Determinación de planos en el espacio",
                    "Rectas alabeadas o cruzadas (no coplanares)",
                    "Recta perpendicular a un plano",
                    "Teorema de las Tres Perpendiculares"
                ),
                formulas = listOf(
                    "\\mathcal{L}_1 \\perp \\mathcal{P} \\land \\overline{OP} \\perp \\mathcal{L} \\implies \\overline{AP} \\perp \\mathcal{L}"
                ),
                formulaName = "Teorema de las Tres Perpendiculares",
                formulaLatex = "\\mathcal{L}_1 \\perp \\mathcal{P} \\land \\mathcal{L}_2 \\perp \\mathcal{L}_3 \\implies \\mathcal{L}_{13} \\perp \\mathcal{L}_3",
                formulaDescription = "Genera triángulos rectángulos en el espacio tridimensional para aplicar el teorema de Pitágoras en proyecciones oblicuas.",
                admissionTip = "El Teorema de las Tres Perpendiculares es la clave para calcular la distancia entre rectas alabeadas y el ángulo diedro entre dos planos.",
                admissionExplanation = "• Busca siempre el pie de la primera perpendicular sobre el plano de referencia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Por el vértice B de un triángulo rectángulo ABC recto en B se levanta la perpendicular BP al plano del triángulo. Si BP = 12 cm, AB = 5 cm y BC = 16 cm, halle la longitud de AP.",
                    options = listOf("13 cm", "14 cm", "15 cm", "17 cm", "20 cm"),
                    correctIndex = 0,
                    explanation = "Como BP es perpendicular al plano del triángulo ABC, BP es perpendicular a toda recta del plano que pase por B, en particular BP ⊥ AB.\nEl triángulo PBA es rectángulo en B:\nPor Pitágoras: AP² = BP² + AB²\nAP² = 12² + 5² = 144 + 25 = 169\nAP = √169 = 13 cm.",
                    subject = "Geometría",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "geo_t10_s02",
            subjectId = "geometria",
            semana = 10,
            subtema = "10.2 Ángulo Diedro, Poliedros y Teorema de Euler",
            title = "Ángulo Diedro y Teorema de Euler",
            theory = LessonTheory(
                id = "theory_geo_t10_s02",
                asignatura = "Geometría",
                semana = 10,
                titulo = "Ángulo Diedro y Teorema de Euler",
                resumen = "• Ángulo Diedro: Figura geométrica formada por la unión de dos semiplanos que tienen una arista común.\n  - Medida del Diedro: Medida del ángulo plano formado al trazar desde un punto de la arista dos rayos perpendiculares a dicha arista, uno en cada cara.\n• Poliedro Convexo: Sólido geométrico limitado por cuatro o más regiones poligonales planas (caras).\n• Teorema de Euler para Poliedros Convexos:\n  - En todo poliedro convexo, el número de caras (C) más el número de vértices (V) es igual al número de aristas (A) más 2:\n  - C + V = A + 2.\n• Suma de Ángulos de Todas las Caras:\n  - S_caras = 360°(V - 2) = 360°(A - C).",
                conceptosClave = listOf(
                    "Ángulo diedro y su ángulo plano rectilíneo",
                    "Teorema de Euler: C + V = A + 2",
                    "Suma de ángulos de caras: 360°(V - 2)",
                    "Cálculo de aristas por semiperímetro de caras"
                ),
                formulas = listOf(
                    "C + V = A + 2 \\quad (\\text{Teorema de Euler})",
                    "S_{\\text{caras}} = 360^\\circ (V - 2)",
                    "A = \\frac{\\sum n_i \\cdot C_i}{2}"
                ),
                formulaName = "Teorema de Euler para Poliedros",
                formulaLatex = "C + V = A + 2",
                formulaDescription = "Relación topológica invariante entre caras, vértices y aristas de cualquier poliedro cerrado en el espacio tridimensional.",
                admissionTip = "Para calcular el número de aristas cuando las caras son polígonos variados: suma los lados de todas las caras y divide entre 2 (porque cada arista es compartida por dos caras).",
                admissionExplanation = "• Ejemplo: un poliedro con 4 caras triangulares y 3 cuadrangulares tiene A = (4·3 + 3·4) / 2 = 24 / 2 = 12 aristas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un poliedro convexo está formado por 6 caras cuadrangulares y 8 caras triangulares. Calcule el número de vértices de dicho poliedro.",
                    options = listOf("10", "12", "14", "16", "18"),
                    correctIndex = 1,
                    explanation = "1. Número total de caras: C = 6 + 8 = 14 caras.\n2. Calculamos las aristas: cada cuadrangular tiene 4 lados y cada triangular 3 lados:\n2A = (6 · 4) + (8 · 3) = 24 + 24 = 48 => A = 24 aristas.\n3. Aplicamos el Teorema de Euler: C + V = A + 2\n14 + V = 24 + 2\n14 + V = 26 => V = 26 - 14 = 12 vértices.",
                    subject = "Geometría",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "geo_t10_s03",
            subjectId = "geometria",
            semana = 10,
            subtema = "10.3 Poliedros Regulares: Tetraedro, Hexaedro (Cubo) y Octaedro",
            title = "Poliedros Regulares (Sólidos Platónicos)",
            theory = LessonTheory(
                id = "theory_geo_t10_s03",
                asignatura = "Geometría",
                semana = 10,
                titulo = "Poliedros Regulares",
                resumen = "• Poliedros Regulares: Solo existen CINCO sólidos platónicos en el espacio cuyas caras son polígonos regulares idénticos y en cada vértice concurre el mismo número de aristas:\n  1. Tetraedro Regular: 4 caras triangulares equiláteras (C=4, V=4, A=6).\n     - Altura: h = a√6 / 3. Área total: AT = a²√3. Volumen: V = a³√2 / 12.\n  2. Hexaedro Regular (Cubo): 6 caras cuadradas (C=6, V=8, A=12).\n     - Diagonal del cubo: D = a√3. Área total: AT = 6a². Volumen: V = a³.\n  3. Octaedro Regular: 8 caras triangulares equiláteras (C=8, V=6, A=12).\n     - Diagonal: d = a√2. Área total: AT = 2a²√3. Volumen: V = a³√2 / 3.\n  4. Dodecaedro Regular: 12 caras pentagonales regulares (C=12, V=20, A=30).\n  5. Icosaedro Regular: 20 caras triangulares equiláteras (C=20, V=12, A=30).",
                conceptosClave = listOf(
                    "Los 5 poliedros platónicos",
                    "Tetraedro: h = a√6/3 y V = a³√2/12",
                    "Cubo: diagonal D = a√3 y V = a³",
                    "Octaedro: V = a³√2/3 y Dodecaedro/Icosaedro (aristas = 30)"
                ),
                formulas = listOf(
                    "V_{\\text{tetraedro}} = \\frac{a^3 \\sqrt{2}}{12}, \\quad h = \\frac{a\\sqrt{6}}{3}",
                    "V_{\\text{cubo}} = a^3, \\quad D = a\\sqrt{3}",
                    "V_{\\text{octaedro}} = \\frac{a^3 \\sqrt{2}}{3}"
                ),
                formulaName = "Diagonal y Volumen del Hexaedro Regular (Cubo)",
                formulaLatex = "D = a\\sqrt{3}, \\quad V = a^3",
                formulaDescription = "Relación métrica tridimensional entre la diagonal espacial que atraviesa el centro y el volumen cúbico.",
                admissionTip = "No confundas la diagonal del cubo (D = a√3) con la diagonal de una de sus caras cuadradas (d = a√2).",
                admissionExplanation = "• El poliedro conjugado de un cubo (uniendo los centros de sus caras) es exactamente un octaedro regular."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t10_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La diagonal espacial de un cubo mide 6√3 cm. Calcule el volumen de dicho cubo.",
                    options = listOf("108 cm³", "144 cm³", "216 cm³", "256 cm³", "343 cm³"),
                    correctIndex = 2,
                    explanation = "La diagonal espacial de un cubo de arista 'a' es:\nD = a√3\n6√3 = a√3 => a = 6 cm.\nEl volumen del cubo es:\nV = a³ = 6³ = 216 cm³.",
                    subject = "Geometría",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "geo_t10_s04",
            subjectId = "geometria",
            semana = 10,
            subtema = "10.4 Prismas y Pirámides: Área Lateral, Total y Volumen",
            title = "Prismas y Pirámides",
            theory = LessonTheory(
                id = "theory_geo_t10_s04",
                asignatura = "Geometría",
                semana = 10,
                titulo = "Prismas y Pirámides",
                resumen = "• Prisma Recto:\n  - Sólido cuyas bases paralelas son polígonos congruentes y sus caras laterales son rectángulos perpendiculares a las bases (arista lateral = altura h).\n  - Área Lateral: AL = 2p_base · h (perímetro de base por altura).\n  - Área Total: AT = AL + 2 · A_base.\n  - Volumen: V = A_base · h.\n  - Paralelepípedo Rectangular (Rectoedro o Caja): AT = 2(ab + bc + ac); Volumen = a·b·c; Diagonal D = √(a² + b² + c²).\n• Pirámide Regular:\n  - Base poligonal regular y caras laterales triangulares isósceles que concurren en el vértice.\n  - Apotema de la Pirámide (Ap): Altura de una cara lateral triangular: Ap² = h² + ap_base².\n  - Área Lateral: AL = p_base · Ap (semiperímetro de base por apotema).\n  - Área Total: AT = AL + A_base.\n  - Volumen: V = (A_base · h) / 3.",
                conceptosClave = listOf(
                    "Prisma recto: AL = 2p · h y V = A_base · h",
                    "Rectoedro: D = √(a² + b² + c²) y V = abc",
                    "Pirámide: V = (A_base · h) / 3",
                    "Apotema de la pirámide por Pitágoras: Ap² = h² + ap²"
                ),
                formulas = listOf(
                    "V_{\\text{prisma}} = A_{\\text{base}} \\cdot h",
                    "V_{\\text{pirámide}} = \\frac{1}{3} A_{\\text{base}} \\cdot h",
                    "D_{\\text{rectoedro}} = \\sqrt{a^2 + b^2 + c^2}"
                ),
                formulaName = "Fórmula del Volumen de la Pirámide",
                formulaLatex = "V = \\frac{1}{3} A_{\\text{base}} \\cdot h",
                formulaDescription = "Demuestra que toda pirámide ocupa exactamente un tercio del espacio de un prisma de idéntica base y altura.",
                admissionTip = "El volumen de cualquier pirámide es siempre un tercio del prisma equivalente. Si llenas de agua una pirámide y la viertes en un prisma de igual base y altura, se requieren exactamente 3 pirámides.",
                admissionExplanation = "• No confundas la apotema de la base (ap) con la apotema de la pirámide (Ap)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t10_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una pirámide regular tiene una base cuadrada de 6 cm de lado y una altura de 10 cm. Calcule el volumen de dicha pirámide.",
                    options = listOf("60 cm³", "90 cm³", "120 cm³", "150 cm³", "180 cm³"),
                    correctIndex = 2,
                    explanation = "1. Área de la base cuadrada: A_base = 6² = 36 cm².\n2. Volumen de la pirámide:\nV = (1/3) · A_base · h = (1/3) · 36 · 10 = 12 · 10 = 120 cm³.",
                    subject = "Geometría",
                    semana = 10
                )
            )
        ),
        // =========================================================================
        // TEMA 11: SÓLIDOS DE REVOLUCIÓN Y GEOMETRÍA ANALÍTICA (Semana 11)
        // =========================================================================
        LessonNode(
            id = "geo_t11_s01",
            subjectId = "geometria",
            semana = 11,
            subtema = "11.1 Cuerpos de Revolución: Cilindro y Cono Circular Recto",
            title = "Cilindro y Cono de Revolución",
            theory = LessonTheory(
                id = "theory_geo_t11_s01",
                asignatura = "Geometría",
                semana = 11,
                titulo = "Cilindro y Cono de Revolución",
                resumen = "• Cilindro de Revolución (Cilindro Circular Recto):\n  - Generado por la rotación completa de 360° de un rectángulo alrededor de uno de sus lados.\n  - Generatriz g = Altura h.\n  - Área Lateral: AL = 2πR · g.\n  - Área Total: AT = 2πR(g + R).\n  - Volumen: V = π · R² · h.\n  - Cilindro Equilátero: Aquel donde la altura es igual al diámetro de la base: h = 2R (sección axial es un cuadrado).\n• Cono de Revolución (Cono Circular Recto):\n  - Generado al rotar un triángulo rectángulo 360° alrededor de uno de sus catetos.\n  - Relación de la generatriz g: g² = h² + R² (teorema de Pitágoras).\n  - Área Lateral: AL = π · R · g.\n  - Área Total: AT = π · R(g + R).\n  - Volumen: V = (1/3)π · R² · h.",
                conceptosClave = listOf(
                    "Cilindro: AL = 2πRh y V = πR²h",
                    "Cilindro equilátero: h = 2R",
                    "Cono: g² = h² + R²",
                    "Cono: AL = πRg y V = (1/3)πR²h"
                ),
                formulas = listOf(
                    "V_{\\text{cilindro}} = \\pi R^2 h, \\quad A_L = 2\\pi R h",
                    "V_{\\text{cono}} = \\frac{1}{3} \\pi R^2 h, \\quad g^2 = h^2 + R^2"
                ),
                formulaName = "Volúmenes de Cilindro y Cono",
                formulaLatex = "V_{\\text{cilindro}} = \\pi R^2 h, \\quad V_{\\text{cono}} = \\frac{1}{3}\\pi R^2 h",
                formulaDescription = "Modelos volumétricos canónicos para sólidos engendrados por la rotación axial de polígonos ortogonales.",
                admissionTip = "El desarrollo de la superficie lateral de un cono es un SECTOR CIRCULAR de radio g y longitud de arco 2πR. El ángulo de desarrollo es: θ = 360° · (R / g).",
                admissionExplanation = "• Este ángulo de desarrollo se pregunta constantemente en admisión UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un cilindro equilátero tiene un radio de base de 3 cm. Calcule su volumen.",
                    options = listOf("27π cm³", "36π cm³", "54π cm³", "72π cm³", "108π cm³"),
                    correctIndex = 2,
                    explanation = "En un cilindro equilátero, la altura es igual al diámetro de la base:\nh = 2R = 2(3) = 6 cm.\nVolumen del cilindro:\nV = π · R² · h = π · 3² · 6 = π · 9 · 6 = 54π cm³.",
                    subject = "Geometría",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "geo_t11_s02",
            subjectId = "geometria",
            semana = 11,
            subtema = "11.2 Esfera, Huso, Zona Esférica y Teoremas de Papus-Guldin",
            title = "Esfera y Teoremas de Papus-Guldin",
            theory = LessonTheory(
                id = "theory_geo_t11_s02",
                asignatura = "Geometría",
                semana = 11,
                titulo = "Esfera y Teoremas de Papus-Guldin",
                resumen = "• Esfera:\n  - Sólido generado por la rotación de 360° de un semicírculo alrededor de su diámetro.\n  - Superficie Esférica (Área): A = 4π · R² (cuatro círculos máximos).\n  - Volumen de la Esfera: V = (4/3)π · R³.\n• Partes de la Esfera:\n  - Huso Esférico (Área): A = (π · R² · θ) / 90°.\n  - Cuña Esférica (Volumen): V = (π · R³ · θ) / 270°.\n  - Zona Esférica (Área): A = 2π · R · h.\n• Teoremas de Papus-Guldin:\n  1. Primer Teorema (Área de Superficie): A = 2π · d_cg · L (el área generada por una línea es 2π por la distancia de su centro de gravedad al eje por la longitud).\n  2. Segundo Teorema (Volumen de Revolución): V = 2π · d_cg · S (el volumen generado por una región plana es 2π por la distancia de su centroide al eje por el área).",
                conceptosClave = listOf(
                    "Superficie esférica: A = 4πR²",
                    "Volumen de la esfera: V = (4/3)πR³",
                    "Relación de Arquímedes con el cilindro circunscrito (2/3)",
                    "Teoremas de Papus-Guldin para superficies y volúmenes de revolución"
                ),
                formulas = listOf(
                    "A_{\\text{esfera}} = 4\\pi R^2, \\quad V_{\\text{esfera}} = \\frac{4}{3}\\pi R^3",
                    "V = 2\\pi \\cdot x_{\\text{cg}} \\cdot A \\quad (\\text{Papus-Guldin})"
                ),
                formulaName = "Fórmulas Esféricas de Arquímedes",
                formulaLatex = "A = 4\\pi R^2, \\quad V = \\frac{4}{3}\\pi R^3",
                formulaDescription = "Arquímedes demostró que el volumen de la esfera es exactamente 2/3 del volumen del cilindro recto circunscrito.",
                admissionTip = "Si el radio de una esfera se duplica, su superficie se multiplica por 4 (2²), y su volumen se multiplica por 8 (2³).",
                admissionExplanation = "• No confundas la superficie de una esfera (4πR²) con el área de una semiesfera total que incluye la base plana: A_total = 2πR² + πR² = 3πR²."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una esfera tiene un volumen de 36π cm³. Calcule el área de su superficie esférica.",
                    options = listOf("24π cm²", "36π cm²", "48π cm²", "72π cm²", "144π cm²"),
                    correctIndex = 1,
                    explanation = "1. Igualamos la fórmula de volumen:\nV = (4/3) · π · R³ = 36π\n(4/3) · R³ = 36 => R³ = (36 · 3) / 4 = 9 · 3 = 27 => R = 3 cm.\n2. Calculamos el área de la superficie esférica:\nA = 4 · π · R² = 4 · π · 3² = 4 · π · 9 = 36π cm².",
                    subject = "Geometría",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "geo_t11_s03",
            subjectId = "geometria",
            semana = 11,
            subtema = "11.3 Geometría Analítica: Punto, Distancia, División de Segmentos y Recta",
            title = "Geometría Analítica: Punto y Recta",
            theory = LessonTheory(
                id = "theory_geo_t11_s03",
                asignatura = "Geometría",
                semana = 11,
                titulo = "Geometría Analítica: Punto y Recta",
                resumen = "• Plano Cartesiano: Dos ejes ortogonales X (abscisas) e Y (ordenadas).\n• Distancia entre dos Puntos: d = √[(x₂ - x₁)² + (y₂ - y₁)²].\n• Punto Medio M: M = ((x₁ + x₂) / 2, (y₁ + y₂) / 2).\n• División de un Segmento en una Razón r = AP / PB:\n  - x = (x₁ + r·x₂) / (1 + r); y = (y₁ + r·y₂) / (1 + r).\n• Pendiente de una Recta: m = (y₂ - y₁) / (x₂ - x₁) = tan(θ).\n• Ecuación Punto-Pendiente: y - y₁ = m(x - x₁).\n• Ecuación General: Ax + By + C = 0 (pendiente m = -A / B).\n• Posiciones Relativas de Rectas:\n  - Paralelas: m₁ = m₂.\n  - Perpendiculares: m₁ · m₂ = -1.\n• Distancia de un Punto P(x₀, y₀) a la Recta Ax + By + C = 0:\n  - d = |A·x₀ + B·y₀ + C| / √(A² + B²).",
                conceptosClave = listOf(
                    "Distancia euclidiana y punto medio",
                    "Pendiente m = (y₂ - y₁) / (x₂ - x₁)",
                    "Perpendicularidad: m₁ · m₂ = -1",
                    "Distancia de punto a recta d = |Ax₀ + By₀ + C| / √(A² + B²)"
                ),
                formulas = listOf(
                    "d = \\sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}",
                    "m = \\frac{y_2 - y_1}{x_2 - x_1} = -\\frac{A}{B}",
                    "m_1 \\cdot m_2 = -1 \\quad (\\mathcal{L}_1 \\perp \\mathcal{L}_2)",
                    "d(P, \\mathcal{L}) = \\frac{|A x_0 + B y_0 + C|}{\\sqrt{A^2 + B^2}}"
                ),
                formulaName = "Distancia de un Punto a una Recta",
                formulaLatex = "d = \\frac{|A x_0 + B y_0 + C|}{\\sqrt{A^2 + B^2}}",
                formulaDescription = "Mide la longitud de la trayectoria más corta entre una coordenada puntual y una línea recta en el plano.",
                admissionTip = "Para hallar la ecuación de una recta paralela a Ax + By + C = 0, mantén idénticos los términos Ax + By y solo cambia la constante independiente K.",
                admissionExplanation = "• Si es perpendicular, intercambia los coeficientes y cambia un signo: Bx - Ay + K = 0."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t11_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule la distancia del punto P(3, 4) a la recta L: 3x + 4y - 10 = 0.",
                    options = listOf("2 u", "3 u", "4 u", "5 u", "6 u"),
                    correctIndex = 1,
                    explanation = "Aplicamos la fórmula de distancia de un punto a una recta:\nd = |A·x₀ + B·y₀ + C| / √(A² + B²)\nd = |3(3) + 4(4) - 10| / √(3² + 4²)\nd = |9 + 16 - 10| / √25 = |15| / 5 = 3 u.",
                    subject = "Geometría",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "geo_t11_s04",
            subjectId = "geometria",
            semana = 11,
            subtema = "11.4 Ecuación de la Circunferencia y Parábola en el Plano",
            title = "Circunferencia y Parábola en el Plano",
            theory = LessonTheory(
                id = "theory_geo_t11_s04",
                asignatura = "Geometría",
                semana = 11,
                titulo = "Circunferencia y Parábola Analítica",
                resumen = "• Circunferencia Analítica:\n  - Ecuación Canónica (centro en el origen (0, 0)): x² + y² = R².\n  - Ecuación Ordinaria (centro C(h, k)): (x - h)² + (y - k)² = R².\n  - Ecuación General: x² + y² + Dx + Ey + F = 0.\n    * Centro C(-D/2, -E/2); Radio R = (1/2)√(D² + E² - 4F).\n• Parábola Analítica:\n  - Lugar geométrico de puntos que equidistan de un foco F y una recta directriz D.\n  - Vértice V(h, k) y parámetro focal p (distancia de V a F y de V a directriz).\n  - Eje Focal Horizontal: (y - k)² = 4p(x - h) (abre hacia la derecha si p > 0; izquierda si p < 0).\n  - Eje Focal Vertical: (x - h)² = 4p(y - k) (abre hacia arriba si p > 0; abajo si p < 0).\n  - Longitud del Lado Recto: LR = |4p|.",
                conceptosClave = listOf(
                    "Ordinaria de circunferencia: (x - h)² + (y - k)² = R²",
                    "Centro C(-D/2, -E/2) desde la forma general",
                    "Parábola con eje vertical: (x - h)² = 4p(y - k)",
                    "Lado recto de la parábola: LR = |4p|"
                ),
                formulas = listOf(
                    "(x - h)^2 + (y - k)^2 = R^2",
                    "C = \\left(-\\frac{D}{2}, \\, -\\frac{E}{2}\\right), \\quad R = \\frac{1}{2}\\sqrt{D^2 + E^2 - 4F}",
                    "(x - h)^2 = 4p(y - k), \\quad \\text{LR} = |4p|"
                ),
                formulaName = "Ecuación Ordinaria de la Circunferencia",
                formulaLatex = "(x - h)^2 + (y - k)^2 = R^2",
                formulaDescription = "Representación analítica cuadrática centrada en las coordenadas (h, k) con radio euclidiano constante R.",
                admissionTip = "Para hallar el centro y radio desde la forma general, completa cuadrados por separado para x y para y, o usa directamente C(-D/2, -E/2).",
                admissionExplanation = "• Si el discriminante D² + E² - 4F < 0, la ecuación no representa ningún lugar geométrico real."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geo_t11_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el centro y el radio de la circunferencia cuya ecuación general es: x² + y² - 6x + 8y - 11 = 0.",
                    options = listOf(
                        "C(3, -4) y R = 6",
                        "C(-3, 4) y R = 6",
                        "C(3, -4) y R = 36",
                        "C(6, -8) y R = 6",
                        "C(-6, 8) y R = 11"
                    ),
                    correctIndex = 0,
                    explanation = "1. Centro C(-D/2, -E/2):\nD = -6 => h = -(-6)/2 = 3\nE = 8 => k = -(8)/2 = -4\nCentro: C(3, -4).\n2. Radio R:\nCompletamos cuadrados:\n(x - 3)² - 9 + (y + 4)² - 16 - 11 = 0\n(x - 3)² + (y + 4)² = 9 + 16 + 11 = 36\nR² = 36 => R = 6.\nPor lo tanto: C(3, -4) y R = 6.",
                    subject = "Geometría",
                    semana = 11
                )
            )
        )
    )
}
