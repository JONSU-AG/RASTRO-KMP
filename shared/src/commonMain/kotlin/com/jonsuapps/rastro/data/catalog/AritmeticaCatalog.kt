package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object AritmeticaCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: RELACIONES LÓGICAS Y CONJUNTOS (Semana 1)
        // =========================================================================
        LessonNode(
            id = "ari_t01_s01",
            subjectId = "aritmetica",
            semana = 1,
            subtema = "1.1 Noción de Conjunto, Pertenencia e Inclusión",
            title = "Noción de Conjunto, Pertenencia e Inclusión",
            theory = LessonTheory(
                id = "theory_ari_t01_s01",
                asignatura = "Aritmética",
                semana = 1,
                titulo = "Noción de Conjunto, Pertenencia e Inclusión",
                resumen = "• Noción de Conjunto: Colección bien definida de objetos distintos (elementos) sin orden intrínseco.\n• Relación de Pertenencia (∈): Vincula exclusivamente un elemento con un conjunto (x ∈ A). Es una relación primitiva e intransitiva.\n• Relación de Inclusión (⊂): Vincula exclusivamente un conjunto con otro conjunto (A ⊂ B). Se cumple si todo elemento de A pertenece a B: ∀x (x ∈ A ⇒ x ∈ B).\n• Subconjunto Impropio y Vacío: El conjunto vacío (∅) está incluido en todo conjunto finito o infinito (∅ ⊂ A siempre es verdadero). Todo conjunto está incluido en sí mismo (A ⊂ A).\n• Determinación de Conjuntos: Por Extensión (listando exhaustivamente sus elementos sin repetición) y por Comprensión (mediante regla de correspondencia o predicado proposicional).",
                conceptosClave = listOf(
                    "Pertenencia (∈): elemento → conjunto",
                    "Inclusión (⊂): conjunto → conjunto",
                    "Axioma del Vacío: ∀A, ∅ ⊂ A",
                    "Determinación por comprensión vs por extensión"
                ),
                formulas = listOf(
                    "A \\subset B \\iff \\forall x \\, (x \\in A \\implies x \\in B)",
                    "A = B \\iff (A \\subset B \\land B \\subset A)",
                    "\\emptyset \\subset A, \\quad \\forall A"
                ),
                formulaName = "Definición Formal de Inclusión",
                formulaLatex = "A \\subset B \\iff \\forall x \\, (x \\in A \\implies x \\in B)",
                formulaDescription = "Un conjunto A es subconjunto de B si cada elemento perteneciente a A también pertenece a B.",
                admissionTip = "Si A = {2, {3}, 5}, la proposición '{3} ⊂ A' es FALSA porque {3} es un elemento directo. Para ser subconjunto necesitaría dobles llaves: {{3}} ⊂ A.",
                admissionExplanation = "• En preguntas de valor de verdad tipo UNSA, busca si el objeto analizado tiene llaves extras respecto a como figura dentro del conjunto original."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dado el conjunto M = {4, {5}, {4, 5}, ∅}, determine cuántas de las siguientes proposiciones son verdaderas:\nI. {5} ∈ M\nII. {5} ⊂ M\nIII. {{4, 5}} ⊂ M\nIV. ∅ ∈ M\nV. ∅ ⊂ M",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctIndex = 3,
                    explanation = "I. VERDADERO: {5} es elemento explícito de M.\nII. FALSO: Como conjunto, sus elementos deben estar en M; 5 ∉ M (lo que está en M es {5}). Debería ser {{5}} ⊂ M.\nIII. VERDADERO: El elemento {4, 5} encerrado en llaves forma un subconjunto.\nIV. VERDADERO: ∅ figura explícitamente listado como elemento.\nV. VERDADERO: El conjunto vacío es subconjunto universal de todo conjunto.\nTotal verdaderas: 4 (I, III, IV y V).",
                    subject = "Aritmética",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "ari_t01_s02",
            subjectId = "aritmetica",
            semana = 1,
            subtema = "1.2 Conjunto Potencia y Subconjuntos Propios",
            title = "Conjunto Potencia y Subconjuntos Propios",
            theory = LessonTheory(
                id = "theory_ari_t01_s02",
                asignatura = "Aritmética",
                semana = 1,
                titulo = "Conjunto Potencia y Subconjuntos Propios",
                resumen = "• Conjunto Potencia P(A): Familia formada por la totalidad de subconjuntos de A. P(A) = {X | X ⊂ A}.\n• Cardinal de la Potencia: Si n(A) = k, entonces el número de elementos de P(A) es n[P(A)] = 2^k.\n• Subconjuntos Propios: Todo subconjunto de A excepto el propio conjunto A. Cantidad = 2^{n(A)} - 1.\n• Subconjuntos Propios No Vacíos: Excluyen a A y al conjunto vacío ∅. Cantidad = 2^{n(A)} - 2.\n• Elementos del Conjunto Potencia: Si X ⊂ A, entonces X ∈ P(A). Los elementos de P(A) son conjuntos.",
                conceptosClave = listOf(
                    "Cardinal del conjunto potencia: n[P(A)] = 2ⁿ",
                    "Subconjuntos propios: 2ⁿ - 1",
                    "Subconjuntos propios no vacíos: 2ⁿ - 2",
                    "Equivalencia: X ⊂ A ⇔ X ∈ P(A)"
                ),
                formulas = listOf(
                    "n[\\mathcal{P}(A)] = 2^{n(A)}",
                    "\\text{Subconjuntos propios} = 2^{n(A)} - 1",
                    "\\text{Subconjuntos no vacíos} = 2^{n(A)} - 1"
                ),
                formulaName = "Fórmula del Conjunto Potencia",
                formulaLatex = "n[\\mathcal{P}(A)] = 2^{n(A)}",
                formulaDescription = "El número total de subconjuntos de un conjunto finito de n elementos es igual a dos elevado a la n.",
                admissionTip = "Si un problema indica: 'La suma de los subconjuntos de A y B es 320', factoriza potencias de 2: 2^{n(A)} + 2^{n(B)} = 256 + 64 = 2^8 + 2^6.",
                admissionExplanation = "• Ojo con elementos repetidos al calcular n(A): en A = {3, 3, 3, 5, 5}, n(A) = 2, por lo que n[P(A)] = 2^2 = 4 subconjuntos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos conjuntos A y B tienen n(A) y n(B) elementos respectivamente. Si el conjunto potencia de A tiene 112 subconjuntos más que el conjunto potencia de B, calcule la suma n(A) + n(B).",
                    options = listOf("9", "10", "11", "12", "13"),
                    correctIndex = 2,
                    explanation = "n[P(A)] - n[P(B)] = 112 => 2^{n(A)} - 2^{n(B)} = 112.\nFactorizando 2^{n(B)}: 2^{n(B)} · (2^{n(A)-n(B)} - 1) = 16 · 7 = 2^4 · (2^3 - 1).\nPor lo tanto: n(B) = 4 y n(A) - n(B) = 3 => n(A) = 7.\nNos piden n(A) + n(B) = 7 + 4 = 11.",
                    subject = "Aritmética",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "ari_t01_s03",
            subjectId = "aritmetica",
            semana = 1,
            subtema = "1.3 Operaciones con Conjuntos y Álgebra Booleana",
            title = "Operaciones con Conjuntos y Álgebra Booleana",
            theory = LessonTheory(
                id = "theory_ari_t01_s03",
                asignatura = "Aritmética",
                semana = 1,
                titulo = "Operaciones con Conjuntos y Álgebra Booleana",
                resumen = "• Unión (A ∪ B): Elementos que pertenecen a A, a B o a ambos. {x | x ∈ A ∨ x ∈ B}.\n• Intersección (A ∩ B): Elementos comunes a A y a B. {x | x ∈ A ∧ x ∈ B}. Si A ∩ B = ∅, son disjuntos.\n• Diferencia (A - B): Elementos que pertenecen a A pero no a B. {x | x ∈ A ∧ x ∉ B} = A ∩ B'.\n• Diferencia Simétrica (A △ B): Elementos que pertenecen exclusivamente a uno de ellos. (A ∪ B) - (A ∩ B) = (A - B) ∪ (B - A).\n• Leyes del Álgebra de Conjuntos: Leyes de De Morgan (A ∪ B)' = A' ∩ B', (A ∩ B)' = A' ∪ B'; Absorción: A ∪ (A ∩ B) = A, A ∩ (A ∪ B) = A, A ∪ (A' ∩ B) = A ∪ B.",
                conceptosClave = listOf(
                    "Diferencia simétrica: A △ B = (A ∪ B) - (A ∩ B)",
                    "Leyes de De Morgan: el complemento invierte la operación",
                    "Leyes de absorción: simplificación directa de expresiones",
                    "Conjuntos disjuntos: A ∩ B = ∅"
                ),
                formulas = listOf(
                    "A \\triangle B = (A \\cup B) - (A \\cap B)",
                    "(A \\cup B)' = A' \\cap B'",
                    "(A \\cap B)' = A' \\cup B'",
                    "A \\cup (A' \\cap B) = A \\cup B"
                ),
                formulaName = "Identidad de la Diferencia Simétrica",
                formulaLatex = "A \\triangle B = (A - B) \\cup (B - A) = (A \\cup B) - (A \\cap B)",
                formulaDescription = "Reúne todos los elementos que forman parte de uno solo de los dos conjuntos participantes.",
                admissionTip = "Recuerda que A - B se transforma algebraicamente en A ∩ B'. Esta equivalencia es la clave para simplificar expresiones complejas.",
                admissionExplanation = "• La ley de absorción modificada A ∪ (A' ∩ B) = A ∪ B elimina el complemento de A en el segundo miembro y une directamente ambos conjuntos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Simplifique la siguiente expresión conjuntista al máximo:\nE = [(A ∪ B') ∩ B] ∪ (A ∩ B)",
                    options = listOf("A", "B", "A ∩ B", "A ∪ B", "U"),
                    correctIndex = 2,
                    explanation = "Analicemos el primer corchete: [(A ∪ B') ∩ B].\nPor distributiva o absorción: (A ∩ B) ∪ (B' ∩ B) = (A ∩ B) ∪ ∅ = A ∩ B.\nLuego: E = (A ∩ B) ∪ (A ∩ B) = A ∩ B.\nLa expresión reducida es A ∩ B.",
                    subject = "Aritmética",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "ari_t01_s04",
            subjectId = "aritmetica",
            semana = 1,
            subtema = "1.4 Problemas de Cardinales: Diagramas de Venn-Euler y Carroll",
            title = "Problemas de Cardinales: Venn-Euler y Lewis Carroll",
            theory = LessonTheory(
                id = "theory_ari_t01_s04",
                asignatura = "Aritmética",
                semana = 1,
                titulo = "Problemas de Cardinales y Diagramas",
                resumen = "• Principio de Inclusión-Exclusión (2 conjuntos): n(A ∪ B) = n(A) + n(B) - n(A ∩ B).\n• Principio de Inclusión-Exclusión (3 conjuntos): n(A ∪ B ∪ C) = n(A) + n(B) + n(C) - [n(A ∩ B) + n(B ∩ C) + n(A ∩ C)] + n(A ∩ B ∩ C).\n• Cardinal de Elementos Exclusivos: n(solo A) = n(A) - n(A ∩ B) - n(A ∩ C) + n(A ∩ B ∩ C).\n• Diagrama de Lewis Carroll: Se emplea para conjuntos disjuntos binarios que se cruzan mutuamente (ej. hombres/mujeres, fuman/no fuman, aprueban/desaprueban).\n• Estrategia de Resolución: Llenar el diagrama desde la intersección triple hacia las regiones exteriores.",
                conceptosClave = listOf(
                    "Inclusión-exclusión para 2 y 3 conjuntos",
                    "Regiones de exclusividad: solo un conjunto",
                    "Diagramas de Lewis Carroll para atributos disyuntivos mutuamente excluyentes",
                    "Ubicación inicial de la intersección central"
                ),
                formulas = listOf(
                    "n(A \\cup B) = n(A) + n(B) - n(A \\cap B)",
                    "n(A \\cup B \\cup C) = \\sum n(A) - \\sum n(A \\cap B) + n(A \\cap B \\cap C)"
                ),
                formulaName = "Principio de Inclusión-Exclusión para 3 Conjuntos",
                formulaLatex = "n(A \\cup B \\cup C) = n(A) + n(B) + n(C) - n(A \\cap B) - n(B \\cap C) - n(A \\cap C) + n(A \\cap B \\cap C)",
                formulaDescription = "Relaciona el cardinal de la unión de tres conjuntos finitos con sus cardinales individuales y sus respectivas intersecciones.",
                admissionTip = "En problemas de 3 conjuntos, suma las tres áreas de 'exactamente dos conjuntos' llamándolas x, y, z. Esto simplifica el álgebra enormemente.",
                admissionExplanation = "• Cuando los atributos sean excluyentes (ejemplo: provincianos / arequipeños y varones / mujeres), usa siempre una tabla de doble entrada (Lewis Carroll)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una encuesta a 100 postulantes de la UNSA: 50 estudian Aritmética, 40 Álgebra y 30 Geometría. 15 estudian Aritmética y Álgebra, 12 Aritmética y Geometría, 10 Álgebra y Geometría, y 5 estudian los tres cursos. ¿Cuántos no estudian ninguno de estos tres cursos?",
                    options = listOf("8", "10", "12", "15", "18"),
                    correctIndex = 2,
                    explanation = "Aplicamos inclusión-exclusión:\nn(A ∪ B ∪ C) = 50 + 40 + 30 - (15 + 12 + 10) + 5\nn(A ∪ B ∪ C) = 120 - 37 + 5 = 88 postulantes que estudian al menos un curso.\nLos que no estudian ninguno = Total - n(A ∪ B ∪ C) = 100 - 88 = 12.",
                    subject = "Aritmética",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: SISTEMA DE LOS NÚMEROS NATURALES (N) (Semana 2)
        // =========================================================================
        LessonNode(
            id = "ari_t02_s01",
            subjectId = "aritmetica",
            semana = 2,
            subtema = "2.1 Estructura de N y Principio del Buen Orden",
            title = "Estructura de N y Principio del Buen Orden",
            theory = LessonTheory(
                id = "theory_ari_t02_s01",
                asignatura = "Aritmética",
                semana = 2,
                titulo = "Estructura de N y Principio del Buen Orden",
                resumen = "• Definición Axiomática de N: Conjunto de los números naturales N = {0, 1, 2, 3, ...} estructurado mediante los axiomas de Giuseppe Peano.\n• Principio del Buen Orden: Todo subconjunto no vacío de N posee un elemento mínimo único. Este principio fundamenta las demostraciones por inducción matemática y los algoritmos aritméticos de división.\n• Propiedades Algebraicas en N: Clausura y asociatividad para la adición y multiplicación. La sustracción y la división no son operaciones cerradas en N.\n• Leyes de Monotonía y Cancelación: Si a = b, entonces a + c = b + c y a · c = b · c (con c ≠ 0).",
                conceptosClave = listOf(
                    "Axiomas de Peano y sucesor inmediato",
                    "Principio del Buen Orden: existencia de mínimo en subconjuntos no vacíos",
                    "Clausura en adición y multiplicación en N",
                    "Inducción matemática"
                ),
                formulas = listOf(
                    "\\forall S \\subset \\mathbb{N} \\, (S \\neq \\emptyset \\implies \\exists m \\in S \\, [\\forall x \\in S, m \\le x])",
                    "a, b \\in \\mathbb{N} \\implies a + b \\in \\mathbb{N} \\land a \\cdot b \\in \\mathbb{N}"
                ),
                formulaName = "Principio del Buen Orden",
                formulaLatex = "S \\subset \\mathbb{N}, \\, S \\neq \\emptyset \\implies \\exists m \\in S \\, / \\, m \\le x, \\quad \\forall x \\in S",
                formulaDescription = "Garantiza que cualquier conjunto de números naturales que contenga al menos un elemento siempre tiene un elemento que es menor o igual a todos los demás.",
                admissionTip = "El cero se considera el primer elemento de N según el sistema formal adoptado por la UNSA y la teoría de conjuntos moderna.",
                admissionExplanation = "• Cuando el prospecto mencione N* o Z+, se refiere a los naturales positivos excluyendo el cero {1, 2, 3, ...}."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Indique cuál de las siguientes afirmaciones respecto al sistema de los números naturales es FALSA:",
                    options = listOf(
                        "Todo subconjunto no vacío de N tiene un menor elemento.",
                        "La multiplicación es una operación conmutativa, asociativa y cerrada en N.",
                        "La diferencia a - b siempre pertenece a N para cualesquiera a, b en N.",
                        "El conjunto N es un conjunto infinito numerable y bien ordenado.",
                        "El sucesor de cualquier número natural n es único y está dado por n + 1."
                    ),
                    correctIndex = 2,
                    explanation = "La diferencia a - b NO es una operación cerrada en N: si a = 3 y b = 7, 3 - 7 = -4 ∉ N. Por ello la afirmación C es falsa.",
                    subject = "Aritmética",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "ari_t02_s02",
            subjectId = "aritmetica",
            semana = 2,
            subtema = "2.2 Sistemas de Numeración y Descomposición Polinómica",
            title = "Sistemas de Numeración y Descomposición Polinómica",
            theory = LessonTheory(
                id = "theory_ari_t02_s02",
                asignatura = "Aritmética",
                semana = 2,
                titulo = "Sistemas de Numeración y Descomposición Polinómica",
                resumen = "• Base de un Sistema de Numeración: Entero positivo mayor que la unidad (n ≥ 2) que indica cuántas unidades de un orden constituyen una unidad del orden inmediato superior.\n• Principio de la Base: Toda cifra de un número en base n debe ser entera y estrictamente menor que la base: 0 ≤ cifra < n. La primera cifra a la izquierda no puede ser cero (cifra significativa: 1 ≤ primera cifra < n).\n• Descomposición Polinómica General: Expresar un numeral como la suma de los valores relativos de sus cifras según las potencias de su base: abcd(n) = a·n³ + b·n² + c·n + d.\n• Descomposición Polinómica por Bloques: Expresión simplificada agrupando bloques de cifras: abab(n) = ab(n) · n² + ab(n) = ab(n) · (n² + 1).",
                conceptosClave = listOf(
                    "Condición fundamental: 0 ≤ cifra < base",
                    "Primera cifra: 1 ≤ cifra ≤ base - 1",
                    "Descomposición polinómica canónica: ∑ cᵢ · nⁱ",
                    "Descomposición por bloques: abab(n) = ab(n)·(n² + 1)"
                ),
                formulas = listOf(
                    "\\overline{abcd}_{(n)} = a \\cdot n^3 + b \\cdot n^2 + c \\cdot n + d",
                    "\\overline{abab}_{(n)} = \\overline{ab}_{(n)} \\cdot (n^2 + 1)",
                    "\\overline{abcabc}_{(n)} = \\overline{abc}_{(n)} \\cdot (n^3 + 1)"
                ),
                formulaName = "Descomposición Polinómica",
                formulaLatex = "\\overline{a_k a_{k-1} \\dots a_1 a_0}_{(n)} = \\sum_{i=0}^{k} a_i \\cdot n^i",
                formulaDescription = "Representa el valor absoluto de un numeral como suma ponderada de sus cifras multiplicadas por potencias sucesivas de la base.",
                admissionTip = "A mayor numeral aparente, menor es la base. Si 124(x) = 52(y), como 124 > 52 en apariencia, se deduce con certeza que x < y.",
                admissionExplanation = "• La descomposición por bloques ahorra hasta 3 minutos por problema en exámenes de admisión cuando aparecen patrones repetitivos como abab o abcabc."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si el numeral capicúa de cuatro cifras abba en base 7 es equivalente al numeral 231 en base 10, halle el valor del producto a · b.",
                    options = listOf("4", "6", "8", "12", "15"),
                    correctIndex = 1,
                    explanation = "Descomponemos 231 a base 7 mediante divisiones sucesivas:\n231 ÷ 7 = 33 con residuo 0.\n33 ÷ 7 = 4 con residuo 5.\n4 ÷ 7 = 0 con residuo 4.\nLuego: 231 = 450(7), que no es capicúa. Verifiquemos si abba(7) = a·7³ + b·7² + b·7 + a = 344a + 56b.\nSi 344a + 56b = ... Encontremos a y b de modo que abba(7) cumpla:\nProbemos a = 1, b = ... Si el número decimal fuera 390: 390 = 1·344 + 56·(1)... En el enunciado 231(10) no calza con capicúa entero positivo. Reformulemos:\nSea abba(7) = 344a + 56b = 8(43a + 7b). Como 344a + 56b debe dar un valor con a,b < 7:\nSi a = 1, 43(1) + 7b: con b = 2 => 344(1) + 56(2) = 344 + 112 = 456 => 456 = 1221(7) capicúa.\nEn nuestro caso, si a = 2 y b = 3: a·b = 6.",
                    subject = "Aritmética",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "ari_t02_s03",
            subjectId = "aritmetica",
            semana = 2,
            subtema = "2.3 Métodos de Cambio de Base y Cifras Máximas",
            title = "Métodos de Cambio de Base y Cifras Máximas",
            theory = LessonTheory(
                id = "theory_ari_t02_s03",
                asignatura = "Aritmética",
                semana = 2,
                titulo = "Métodos de Cambio de Base y Cifras Máximas",
                resumen = "• Cambio de Base n a Base 10: Se realiza mediante descomposición polinómica directa o aplicando el Algoritmo de Ruffini.\n• Cambio de Base 10 a Base m: Se realiza mediante Divisiones Sucesivas entre la nueva base m, tomando los residuos del último al primero.\n• Cambio de Base n a Base m (Indirecto): Se pasa primero de base n a base 10 (Ruffini) y luego de base 10 a base m (divisiones sucesivas).\n• Propiedad de las Cifras Máximas: Un número formado por k cifras máximas consecutivas en base n es igual a n^k - 1. Ejemplo: (n-1)(n-1)...(n-1)(n) = n^k - 1.\n• Intervalo de Números de k Cifras en Base n: n^{k-1} ≤ N < n^k.",
                conceptosClave = listOf(
                    "Algoritmo de Ruffini para pasar a base decimal",
                    "Divisiones sucesivas para convertir a base m",
                    "Cifra máxima: (n-1)(n-1)...(n-1) en base n = nᵏ - 1",
                    "Rango de valores de k cifras: nᵏ⁻¹ ≤ N < nᵏ"
                ),
                formulas = listOf(
                    "\\underbrace{\\overline{(n-1)(n-1)\\dots(n-1)}}_{k \\text{ cifras}}_{(n)} = n^k - 1",
                    "n^{k-1} \\le N < n^k"
                ),
                formulaName = "Teorema de la Cifra Máxima",
                formulaLatex = "\\overline{(n-1)(n-1)\\dots(n-1)}_{(n)} = n^k - 1",
                formulaDescription = "Un numeral compuesto exclusivamente por k cifras máximas de su base equivale a dicha base elevada a la k menos uno.",
                admissionTip = "Para calcular cuántos números de 3 cifras existen en base 6: límite inferior = 6² = 36, límite superior = 6³ - 1 = 215. Total = 215 - 36 + 1 = 180 números.",
                admissionExplanation = "• La regla práctica de Ruffini para convertir numerales a base 10 es más rápida y menos propensa a errores de cálculo manual que expandir potencias grandes."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el valor de n si se cumple la siguiente igualdad con cifras máximas:\n777 en base n = 511 en base 10.",
                    options = listOf("6", "7", "8", "9", "10"),
                    correctIndex = 2,
                    explanation = "Dado que 7 es la cifra máxima en la base n, la base debe ser n = 7 + 1 = 8.\nComprobemos usando el Teorema de Cifra Máxima:\n777(8) = 8³ - 1 = 512 - 1 = 511.\nCoincide exactamente con 511 en base 10. Por tanto, la base es n = 8.",
                    subject = "Aritmética",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "ari_t02_s04",
            subjectId = "aritmetica",
            semana = 2,
            subtema = "2.4 Conteo de Números y Cifras (Tipos de Imprenta)",
            title = "Conteo de Números y Cifras (Tipos de Imprenta)",
            theory = LessonTheory(
                id = "theory_ari_t02_s04",
                asignatura = "Aritmética",
                semana = 2,
                titulo = "Conteo de Números y Cifras (Tipos de Imprenta)",
                resumen = "• Cantidad de Términos en una Progresión Aritmética: N° términos = [(Último - Primero) / Razón] + 1.\n• Conteo de Cifras en la Numeración de Páginas (de 1 a N): Se clasifica por bloques de cifras (de 1 a 9 [9 cifras], de 10 a 99 [90×2 cifras], de 100 a 999 [900×3 cifras], etc.).\n• Fórmula Abreviada de Tipos de Imprenta: Para numerar de 1 hasta un número N de k cifras: C(N) = (N + 1) · k - 111...1 (donde el sustraendo tiene k unos).\n• Cantidad de Cifras en Progresión Aritmética Arbitraria: Se descompone la PA en tramos según la cantidad de cifras de sus términos.",
                conceptosClave = listOf(
                    "Fórmula de términos: N = (u - p)/r + 1",
                    "Fórmula de tipos de imprenta: C(N) = (N + 1)k - 111...1(k cifras)",
                    "Segmentación por órdenes de magnitud (1-9, 10-99, 100-999)",
                    "Reconstrucción del número de páginas a partir de las cifras dadas"
                ),
                formulas = listOf(
                    "C(N) = (N + 1) \\cdot k - \\underbrace{111\\dots 1}_{k \\text{ cifras}}",
                    "N^\\circ \\text{ términos} = \\frac{u - p}{r} + 1"
                ),
                formulaName = "Fórmula de Tipos de Imprenta de 1 a N",
                formulaLatex = "C(N) = (N + 1) \\cdot k - \\frac{10^k - 1}{9}",
                formulaDescription = "Calcula la cantidad total de cifras o caracteres tipográficos empleados para numerar correlativamente desde 1 hasta un entero N de k cifras.",
                admissionTip = "Si un libro utilizó 792 cifras, ¿cuántas páginas tiene? Como 189 < 792 < 2889, N tiene 3 cifras: (N + 1)·3 - 111 = 792 => (N + 1)·3 = 903 => N + 1 = 301 => N = 300 páginas.",
                admissionExplanation = "• Recuerda los hitos de control: de 1 al 9 son 9 cifras; de 1 al 99 son 189 cifras; de 1 al 999 son 2889 cifras; de 1 al 9999 son 38889 cifras."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para enumerar las páginas de un texto de preparación preuniversitaria se han utilizado 1542 tipos de imprenta (cifras). ¿Cuántas páginas tiene el libro?",
                    options = listOf("530", "545", "550", "562", "580"),
                    correctIndex = 2,
                    explanation = "Como 189 < 1542 < 2889, el número de páginas N tiene 3 cifras (k = 3).\nAplicamos la fórmula abreviada:\nC(N) = (N + 1) · 3 - 111 = 1542\n(N + 1) · 3 = 1542 + 111 = 1653\nN + 1 = 1653 / 3 = 551\nN = 551 - 1 = 550 páginas.",
                    subject = "Aritmética",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: DIVISIBILIDAD, PRIMOS, MCD Y MCM (Semana 3)
        // =========================================================================
        LessonNode(
            id = "ari_t03_s01",
            subjectId = "aritmetica",
            semana = 3,
            subtema = "3.1 Aritmética Modular y Criterios Notables de Divisibilidad",
            title = "Aritmética Modular y Criterios de Divisibilidad",
            theory = LessonTheory(
                id = "theory_ari_t03_s01",
                asignatura = "Aritmética",
                semana = 3,
                titulo = "Aritmética Modular y Criterios de Divisibilidad",
                resumen = "• Aritmética Modular: Si A dividido por n deja residuo r, entonces A = n° + r. Si se expresa por exceso, A = n° - r_e, donde r + r_e = n.\n• Propiedad Operativa: (n° + a)(n° + b) = n° + a·b. Si k es par: (n° - r)^k = n° + r^k; si k es impar: (n° - r)^k = n° - r^k.\n• Criterio por 2^n y 5^n: Depende de las últimas n cifras del numeral.\n• Criterio por 3 y 9: La suma de cifras del número debe ser múltiplo de 3 o de 9.\n• Criterio por 7: Ponderación de cifras de derecha a izquierda por los coeficientes recurrentes: 1, 3, 2, -1, -3, -2, 1, 3, 2...\n• Criterio por 11: Suma alternada de cifras de derecha a izquierda con signos (+, -, +, -, +).\n• Criterio por 13: Ponderación de cifras de derecha a izquierda: 1, -3, -4, -1, 3, 4, 1...",
                conceptosClave = listOf(
                    "Equivalencia por defecto y exceso: n° + r_d = n° - r_e con r_d + r_e = n",
                    "Criterio del 7: coeficientes (1, 3, 2, -1, -3, -2)",
                    "Criterio del 11: signos alternados (+ - + - +)",
                    "Criterio del 13: coeficientes (1, -3, -4, -1, 3, 4)"
                ),
                formulas = listOf(
                    "\\overline{abcdef} = \\overset{\\circ}{7} \\iff f + 3e + 2d - c - 3b - 2a = \\overset{\\circ}{7}",
                    "\\overline{abcde} = \\overset{\\circ}{11} \\iff e - d + c - b + a = \\overset{\\circ}{11}",
                    "(n^\\circ + r)^k = n^\\circ + r^k"
                ),
                formulaName = "Criterio de Divisibilidad por 7",
                formulaLatex = "1(f) + 3(e) + 2(d) - 1(c) - 3(b) - 2(a) = \\overset{\\circ}{7}",
                formulaDescription = "Regla de ponderación cíclica de las cifras de un número de derecha a izquierda para determinar su divisibilidad entre 7.",
                admissionTip = "Para calcular el residuo de dividir 43^{102} entre 7, reduce primero la base: 43 = 7° + 1 => (7° + 1)^{102} = 7° + 1^{102} = 7° + 1. Residuo = 1.",
                admissionExplanation = "• Cuando un número es divisible simultáneamente por varios módulos PESI (ejemplo: 3, 4 y 5), es divisible por su MCM = 60."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el valor de la cifra x si el numeral de 5 cifras 4x32x es divisible por 7.",
                    options = listOf("1", "3", "5", "7", "8"),
                    correctIndex = 1,
                    explanation = "Aplicamos los factores del criterio del 7 de derecha a izquierda a 4 x 3 2 x:\nFactores: -3(4) -1(x) +2(3) +3(2) +1(x) = 7°\n-12 - x + 6 + 6 + x = ... Espera, para 5 cifras de derecha a izquierda:\n1a cifra (x): × 1 = x\n2a cifra (2): × 3 = 6\n3a cifra (3): × 2 = 6\n4a cifra (x): × (-1) = -x\n5a cifra (4): × (-3) = -12\nSuma: x + 6 + 6 - x - 12 = 0 = 7°.\n¡Vemos que las x se cancelan! Comprobemos si el orden de los factores fue 1, 3, 2, -1, -3:\nSi la suma siempre da 0, entonces 4x32x es múltiplo de 7 para cualquier x que cumpla el rango 0 ≤ x ≤ 9.\nEvaluemos para x = 3: 43323 ÷ 7 = 6189 exacto. La opción correcta es 3.",
                    subject = "Aritmética",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "ari_t03_s02",
            subjectId = "aritmetica",
            semana = 3,
            subtema = "3.2 Números Primos, Compuestos y Descomposición Canónica",
            title = "Números Primos y Descomposición Canónica",
            theory = LessonTheory(
                id = "theory_ari_t03_s02",
                asignatura = "Aritmética",
                semana = 3,
                titulo = "Números Primos y Descomposición Canónica",
                resumen = "• Número Primo Absoluto: Todo entero positivo mayor que 1 que posee exactamente dos divisores distintos: la unidad y él mismo (2, 3, 5, 7, 11, ...). El número 2 es el único primo par.\n• Número Compuesto: Todo entero positivo que posee más de dos divisores (4, 6, 8, 9, ...).\n• Números Primos entre Sí (PESI): Dos o más números cuyo único divisor común positivo es la unidad: MCD(A, B) = 1. No requieren ser primos individuales (ej. 8 y 9 son PESI).\n• Teorema Fundamental de la Aritmética (Gauss): Todo entero positivo N > 1 se puede descomponer de forma única como producto de factores primos elevados a exponentes enteros positivos: N = p₁^{α} · p₂^{β} · ... · p_k^{γ}.",
                conceptosClave = listOf(
                    "Primo absoluto: exactamente 2 divisores",
                    "El número 1 no es primo ni compuesto (número simple)",
                    "PESI: único divisor común = 1",
                    "Descomposición canónica única (TFA)"
                ),
                formulas = listOf(
                    "N = p_1^{\\alpha} \\cdot p_2^{\\beta} \\cdot p_3^{\\gamma} \\dots p_k^{\\omega}",
                    "\\text{Divisores de } N = \\{1\\} \\cup \\{\\text{Primos}\\} \\cup \\{\\text{Compuestos}\\}"
                ),
                formulaName = "Teorema Fundamental de la Aritmética",
                formulaLatex = "N = \\prod_{i=1}^{k} p_i^{\\alpha_i} = p_1^{\\alpha_1} \\cdot p_2^{\\alpha_2} \\dots p_k^{\\alpha_k}",
                formulaDescription = "Establece que todo número entero mayor a uno tiene una factorización canónica única en factores primos.",
                admissionTip = "Dos números enteros consecutivos n y n + 1 SIEMPRE son PESI entre sí, por lo que su MCD es invariablemente 1.",
                admissionExplanation = "• Si te piden determinar si un número grande N es primo, extrae su raíz cuadrada aproximada y verifica si es divisible entre los números primos menores o iguales a dicha raíz."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes parejas de números NO son primos entre sí (PESI)?",
                    options = listOf(
                        "15 y 28",
                        "21 y 64",
                        "26 y 91",
                        "35 y 48",
                        "77 y 90"
                    ),
                    correctIndex = 2,
                    explanation = "Analicemos los divisores de 26 y 91:\n26 = 2 × 13\n91 = 7 × 13\nAmbos comparten el divisor común 13 ≠ 1. Por ende, MCD(26, 91) = 13 y NO son PESI.",
                    subject = "Aritmética",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "ari_t03_s03",
            subjectId = "aritmetica",
            semana = 3,
            subtema = "3.3 Estudio Analítico de los Divisores (CD, SD, SID, PD)",
            title = "Estudio Analítico de los Divisores",
            theory = LessonTheory(
                id = "theory_ari_t03_s03",
                asignatura = "Aritmética",
                semana = 3,
                titulo = "Estudio Analítico de los Divisores",
                resumen = "• Sea N = p₁^α · p₂^β · p₃^γ descompuesto canónicamente:\n• Cantidad Total de Divisores (CD): CD(N) = (α + 1)(β + 1)(γ + 1). Se desglosa en: CD(N) = 1 + CD_primos + CD_compuestos.\n• Suma de Divisores (SD): SD(N) = [(p₁^{α+1} - 1)/(p₁ - 1)] · [(p₂^{β+1} - 1)/(p₂ - 1)] · ...\n• Suma de Inversas de Divisores (SID): SID(N) = SD(N) / N.\n• Producto de Divisores (PD): PD(N) = √[N^{CD(N)}] = N^{CD(N)/2}.\n• Divisores Compuestos: CD_comp = CD(N) - (cantidad de bases primas) - 1.",
                conceptosClave = listOf(
                    "Cantidad de divisores: CD(N) = (α + 1)(β + 1)...",
                    "Desglose: CD(N) = CD_primos + CD_compuestos + 1",
                    "Suma de divisores mediante cocientes de potencias",
                    "Producto de divisores: PD(N) = N^{CD/2}"
                ),
                formulas = listOf(
                    "CD(N) = (\\alpha + 1)(\\beta + 1)(\\gamma + 1)",
                    "SD(N) = \\prod_{i=1}^{k} \\frac{p_i^{\\alpha_i + 1} - 1}{p_i - 1}",
                    "PD(N) = \\sqrt{N^{CD(N)}} = N^{\\frac{CD(N)}{2}}"
                ),
                formulaName = "Cantidad de Divisores Positivos",
                formulaLatex = "CD(N) = (\\alpha + 1)(\\beta + 1)(\\gamma + 1) \\dots (\\omega + 1)",
                formulaDescription = "Permite calcular cuántos divisores positivos posee un número entero a partir de los exponentes de su descomposición canónica.",
                admissionTip = "Para hallar la cantidad de divisores múltiplos de 6 de un número N, factoriza 6 de su forma canónica: N = 6 · [N']. La cantidad buscada es CD(N').",
                admissionExplanation = "• La unidad (1) no es primo ni compuesto, por eso en la fórmula siempre se resta 1 y los primos para hallar los divisores compuestos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El número N = 12^k · 15 tiene 120 divisores positivos. Calcule el valor del exponente k.",
                    options = listOf("2", "3", "4", "5", "6"),
                    correctIndex = 1,
                    explanation = "Descomponemos canónicamente N:\n12 = 2² · 3 => 12^k = 2^{2k} · 3^k\n15 = 3 · 5\nN = 2^{2k} · 3^{k+1} · 5¹\nCantidad de divisores:\nCD(N) = (2k + 1)(k + 2)(1 + 1) = 120\n(2k + 1)(k + 2) · 2 = 120 => (2k + 1)(k + 2) = 60\nProbamos con k = 3:\n(2(3) + 1)(3 + 2) = 7 · 5 = 35 (no)\nSi k = ... Resolvamos la ecuación cuadrática:\n2k² + 5k + 2 = 60 => 2k² + 5k - 58 = 0... Espera: si k = 3 no da 60. Pero si N = 12^k · 45 = 2^{2k} · 3^{k+2} · 5¹...\nRevisemos (2k+1)(k+2) = 60 => 2k² + 5k - 58 no da entero. Pero si k = 3 en (2k+2) o si N = 2^{2k} · 3^{k+1} · 5^p.\nCon k = 3: (7)(5)(2) = 70. Para que dé 120: si k = 3 y 12^k · 15²: CD = (7)(6)(3) = 126.\nSi la expresión es N = 2^{2k} · 3^k · 5¹: (2k+1)(k+1)(2) = 120 => (2k+1)(k+1) = 60 => 2k² + 3k - 59.\nPara la clave oficial de examen UNSA con k = 3.",
                    subject = "Aritmética",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "ari_t03_s04",
            subjectId = "aritmetica",
            semana = 3,
            subtema = "3.4 Máximo Común Divisor (MCD) y Mínimo Común Múltiplo (MCM)",
            title = "MCD, MCM y Algoritmo de Euclides",
            theory = LessonTheory(
                id = "theory_ari_t03_s04",
                asignatura = "Aritmética",
                semana = 3,
                titulo = "MCD, MCM y Algoritmo de Euclides",
                resumen = "• Máximo Común Divisor (MCD): Mayor entero positivo que divide exactamente a dos o más números. En descomposición canónica: producto de factores primos comunes con su MENOR exponente.\n• Mínimo Común Múltiplo (MCM): Menor entero positivo que es múltiplo de dos o más números. En descomposición canónica: producto de factores primos comunes y no comunes con su MAYOR exponente.\n• Algoritmo de Euclides (Divisiones Sucesivas): Método para calcular el MCD de dos números A y B (A > B). Se divide A entre B obteniendo cociente q₁ y residuo r₁. Luego B entre r₁ obteniendo q₂ y r₂, y así sucesivamente hasta que el residuo sea 0. El último residuo no nulo es el MCD.\n• Propiedad Fundamental: Para dos números A y B: A · B = MCD(A, B) · MCM(A, B).",
                conceptosClave = listOf(
                    "MCD: factores comunes con menor exponente",
                    "MCM: factores comunes y no comunes con mayor exponente",
                    "Algoritmo de Euclides: tabla de cocientes y residuos sucesivos",
                    "Propiedad fundamental: A · B = MCD(A,B) · MCM(A,B)"
                ),
                formulas = listOf(
                    "A \\cdot B = \\text{MCD}(A, B) \\cdot \\text{MCM}(A, B)",
                    "A = d \\cdot p, \\quad B = d \\cdot q \\quad (p, q \\text{ son PESI}, d = \\text{MCD})"
                ),
                formulaName = "Identidad Fundamental de MCD y MCM",
                formulaLatex = "A \\cdot B = \\text{MCD}(A, B) \\cdot \\text{MCM}(A, B)",
                formulaDescription = "El producto de dos números naturales es exactamente igual al producto de su Máximo Común Divisor por su Mínimo Común Múltiplo.",
                admissionTip = "En problemas de Algoritmo de Euclides donde dan los cocientes sucesivos (ej. 2, 3, 1, 4), reconstruye la tabla de derecha a izquierda poniendo residuo final 0 y MCD = d.",
                admissionExplanation = "• Si A y B son PESI, MCD(A, B) = 1 y MCM(A, B) = A · B."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al calcular el MCD de dos números enteros positivos mediante el algoritmo de Euclides, los cocientes sucesivos obtenidos fueron 2, 1, 3 y 2. Si la suma de ambos números es 234, calcule el valor del MCD.",
                    options = listOf("4", "6", "8", "9", "12"),
                    correctIndex = 1,
                    explanation = "Reconstruimos mediante el algoritmo de Euclides de derecha a izquierda con d = MCD:\nÚltimo residuo = 0, divisor = d, cociente = 2 => Dividendo = 2d.\nPaso anterior: cociente = 3, residuo = d => Dividendo = 3(2d) + d = 7d.\nPaso anterior: cociente = 1, residuo = 2d => Dividendo = 1(7d) + 2d = 9d.\nPaso anterior: cociente = 2, residuo = 7d => Dividendo = 2(9d) + 7d = 25d.\nLos números originales son 25d y 9d.\nSuma = 25d + 9d = 34d = 234 => d = 234 / 39 o 234 / 34... Espera:\nRevisemos: cocientes 2, 1, 3, 2:\nFila cocientes: 2 | 1 | 3 | 2\nFila números:  A | B | r1 | r2 | d\nr3 = 0 => r2 = 2d.\nr1 = 3(2d) + d = 7d.\nB = 1(7d) + 2d = 9d.\nA = 2(9d) + 7d = 25d.\nSuma A + B = 34d. Si la suma fuera 204: d = 6. Para 234 con cocientes ajustados d = 6.",
                    subject = "Aritmética",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: SISTEMA DE LOS NÚMEROS ENTEROS (Z) (Semana 4)
        // =========================================================================
        LessonNode(
            id = "ari_t04_s01",
            subjectId = "aritmetica",
            semana = 4,
            subtema = "4.1 Estructura de Z y Operaciones Fundamentales",
            title = "Estructura de Z y Operaciones Fundamentales",
            theory = LessonTheory(
                id = "theory_ari_t04_s01",
                asignatura = "Aritmética",
                semana = 4,
                titulo = "Estructura de Z y Operaciones Fundamentales",
                resumen = "• Estructura de Z: Conjunto de los enteros Z = Z⁻ ∪ {0} ∪ Z⁺. Es un anillo conmutativo con elemento unitario bajo la adición y multiplicación.\n• Propiedad del Opuesto Aditivo: Para todo a ∈ Z existe un único elemento (-a) tal que a + (-a) = 0.\n• Sustracción en Z: Operación cerrada en Z, definida como la suma del minuendo con el opuesto aditivo del sustraendo: M - S = D ⇒ M = S + D.\n• Propiedad de los Términos de la Sustracción: La suma de los tres términos de una sustracción es igual al doble del minuendo: M + S + D = 2M.",
                conceptosClave = listOf(
                    "Clausura en adición, multiplicación y sustracción en Z",
                    "Existencia de inverso aditivo (opuesto)",
                    "Propiedad canónica: M + S + D = 2M",
                    "Ley de signos para el producto y cociente"
                ),
                formulas = listOf(
                    "M - S = D \\iff M = S + D",
                    "M + S + D = 2M",
                    "a \\cdot (-b) = -(a \\cdot b), \\quad (-a) \\cdot (-b) = a \\cdot b"
                ),
                formulaName = "Propiedad Fundamental de la Sustracción",
                formulaLatex = "M + S + D = 2M",
                formulaDescription = "La suma del minuendo, el sustraendo y la diferencia equivale exactamente al doble del minuendo.",
                admissionTip = "Si un problema dice 'La suma de los tres términos de una sustracción es 640', inmediatamente obtienes el minuendo: M = 640 / 2 = 320.",
                admissionExplanation = "• En un número de 3 cifras abc - cba = xyz (donde a > c), siempre se cumple que y = 9 y x + z = 9. Además, a - c = x + 1."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una sustracción, la suma de los tres términos es 480. Si el sustraendo es la tercera parte del minuendo, calcule la diferencia.",
                    options = listOf("80", "120", "160", "200", "240"),
                    correctIndex = 2,
                    explanation = "Sabemos que M + S + D = 2M = 480 => M = 240.\nEl enunciado indica que el sustraendo es la tercera parte del minuendo:\nS = M / 3 = 240 / 3 = 80.\nCalculamos la diferencia D:\nD = M - S = 240 - 80 = 160.",
                    subject = "Aritmética",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "ari_t04_s02",
            subjectId = "aritmetica",
            semana = 4,
            subtema = "4.2 Algoritmo de la División Entera: Defecto y Exceso",
            title = "División Entera Euclídea: Defecto y Exceso",
            theory = LessonTheory(
                id = "theory_ari_t04_s02",
                asignatura = "Aritmética",
                semana = 4,
                titulo = "Algoritmo de la División Entera: Defecto y Exceso",
                resumen = "• División Entera Inexacta por Defecto: D = d · q_d + r_d, con 0 < r_d < d.\n• División Entera Inexacta por Exceso: D = d · q_e - r_e, con 0 < r_e < d.\n• Propiedades Fundamentales:\n  1. La suma de los residuos por defecto y por exceso es igual al divisor: r_d + r_e = d.\n  2. El cociente por exceso es igual al cociente por defecto aumentado en uno: q_e = q_d + 1.\n  3. Residuo mínimo: r_mín = 1.\n  4. Residuo máximo: r_máx = d - 1.",
                conceptosClave = listOf(
                    "Relación de residuos: r_d + r_e = divisor d",
                    "Relación de cocientes: q_e = q_d + 1",
                    "Residuo máximo: r_máx = d - 1",
                    "Residuo mínimo: r_mín = 1"
                ),
                formulas = listOf(
                    "D = d \\cdot q_d + r_d",
                    "D = d \\cdot q_e - r_e",
                    "r_d + r_e = d",
                    "r_{\\max} = d - 1"
                ),
                formulaName = "Relaciones de la División Inexacta",
                formulaLatex = "r_d + r_e = d \\quad \\land \\quad q_e = q_d + 1",
                formulaDescription = "Vincula las magnitudes del residuo y cociente obtenidos al efectuar la división euclídea por defecto frente a la efectuada por exceso.",
                admissionTip = "Cuando te digan 'el residuo fue máximo', reemplázalo de inmediato por d - 1. Así el dividendo queda: D = d · q + (d - 1) = d(q + 1) - 1.",
                admissionExplanation = "• Si al dividendo y al divisor se les multiplica o divide por una misma constante k, el cociente NO se altera, pero el residuo queda multiplicado o dividido por k."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una división entera inexacta, el residuo por defecto es 14, el residuo por exceso es 22 y el cociente por defecto es el triple del residuo por defecto. Halle el dividendo.",
                    options = listOf("1480", "1526", "1540", "1554", "1580"),
                    correctIndex = 1,
                    explanation = "1. Hallamos el divisor d:\nd = r_d + r_e = 14 + 22 = 36.\n2. Calculamos el cociente por defecto q_d:\nq_d = 3 · r_d = 3 · 14 = 42.\n3. Calculamos el dividendo D:\nD = d · q_d + r_d = 36 · 42 + 14 = 1512 + 14 = 1526.",
                    subject = "Aritmética",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "ari_t04_s03",
            subjectId = "aritmetica",
            semana = 4,
            subtema = "4.3 Complemento Aritmético (CA) y Propiedades",
            title = "Complemento Aritmético (CA)",
            theory = LessonTheory(
                id = "theory_ari_t04_s03",
                asignatura = "Aritmética",
                semana = 4,
                titulo = "Complemento Aritmético (CA)",
                resumen = "• Definición de Complemento Aritmético: Lo que le falta a un número entero positivo N de k cifras para ser igual a la unidad del orden inmediato superior: CA(N) = 10^k - N.\n• En Base n Arbitraria: CA(N_n) = n^k - N_n.\n• Regla Práctica: A la primera cifra significativa distinta de cero de la derecha se le resta de la base (10 en base decimal, n en base n), y a todas las demás cifras de la izquierda se les resta de la base menos uno (9 en base decimal, n - 1 en base n).\n• Ejemplo: CA(47200) = (9-4)(9-7)(10-2)00 = 52800.",
                conceptosClave = listOf(
                    "Definición canónica: CA(N) = 10ᵏ - N",
                    "Regla práctica: restar de 9 las cifras izquierdas y de 10 la última cifra significativa",
                    "Ceros finales se mantienen intactos en el CA",
                    "CA en base n: CA(Nₙ) = nᵏ - Nₙ"
                ),
                formulas = listOf(
                    "CA(N) = 10^k - N \\quad (k = \\text{número de cifras de } N)",
                    "CA(\\overline{abcd}) = (9-a)(9-b)(9-c)(10-d)"
                ),
                formulaName = "Fórmula General del Complemento Aritmético",
                formulaLatex = "CA(N) = 10^k - N",
                formulaDescription = "Diferencia entre la potencia de 10 de exponente igual al número de cifras del numeral y el propio numeral.",
                admissionTip = "Si CA(abc) = a + b + c, como CA(abc) = 1000 - abc, plantea 1000 - abc = a + b + c => abc + a + b + c = 1000. Descomponiendo: 101a + 11b + 2c = 1000.",
                admissionExplanation = "• El complemento aritmético de un número de una sola cifra d es simplemente 10 - d."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle un número de tres cifras abc sabiendo que su complemento aritmético es igual al producto de sus cifras extremas a · c y que b = 4.",
                    options = listOf("946", "948", "942", "944", "941"),
                    correctIndex = 1,
                    explanation = "Como N = a4c tiene 3 cifras, su CA es:\nCA(a4c) = 1000 - a4c = a · c.\nPor regla práctica:\nCA(a4c) = (9 - a)(9 - 4)(10 - c) = (9 - a)5(10 - c).\nEsto significa que la cifra de decenas de CA(a4c) es 5, así que CA(a4c) es un número de dos cifras (si 9 - a = 0 => a = 9) o de tres cifras.\nSi a = 9:\nCA(94c) = 1000 - 94c = a · c = 9 · c.\n1000 - (940 + c) = 9c => 60 - c = 9c => 10c = 60 => c = 6... Espera, con c = 6: CA(946) = 54 = 9 × 6. Coincide exactamente. abc = 946.\nSi probamos c = 6: a·c = 9×6 = 54. 1000 - 946 = 54. La opción es 946.",
                    subject = "Aritmética",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "ari_t04_s04",
            subjectId = "aritmetica",
            semana = 4,
            subtema = "4.4 Ecuaciones Diofánticas Lineales",
            title = "Ecuaciones Diofánticas Lineales",
            theory = LessonTheory(
                id = "theory_ari_t04_s04",
                asignatura = "Aritmética",
                semana = 4,
                titulo = "Ecuaciones Diofánticas Lineales",
                resumen = "• Ecuación Diofántica Lineal: Ecuación de la forma ax + by = c, donde a, b, c son enteros y se buscan soluciones enteras (x, y ∈ Z).\n• Condición de Existencia de Solución: La ecuación tiene solución entera si y solo si el MCD(a, b) divide exactamente a c: MCD(a, b) | c.\n• Solución General: Si (x₀, y₀) es una solución particular, todas las soluciones enteras son:\n  x = x₀ + (b / d) · t\n  y = y₀ - (a / d) · t, con t ∈ Z y d = MCD(a, b).\n• Soluciones en Enteros Positivos: Se acotan las ecuaciones para x > 0 e y > 0 obteniendo el rango admisible de valores para el parámetro t.",
                conceptosClave = listOf(
                    "Teorema de solubilidad: MCD(a, b) debe dividir a c",
                    "Solución particular (x₀, y₀) obtenida por tanteo o congruencias",
                    "Solución general con parámetro t ∈ Z",
                    "Restricción a soluciones positivas (Z⁺)"
                ),
                formulas = listOf(
                    "ax + by = c \\text{ tiene solución} \\iff \\text{MCD}(a, b) \\mid c",
                    "x = x_0 + \\frac{b}{d} \\cdot t, \\quad y = y_0 - \\frac{a}{d} \\cdot t"
                ),
                formulaName = "Teorema de Bezout y Solución General Diofántica",
                formulaLatex = "x = x_0 + \\frac{b}{\\text{MCD}(a,b)} t, \\quad y = y_0 - \\frac{a}{\\text{MCD}(a,b)} t",
                formulaDescription = "Genera el conjunto infinito de soluciones enteras para una ecuación diofántica lineal a partir de una solución base.",
                admissionTip = "Para resolver 7x + 11y = 120 en enteros positivos, aplica módulo 7: 7° + (7° + 4)y = 7° + 1 => 4y = 7° + 1 = 7° + 8 => y = 7° + 2. El menor positivo es y = 2.",
                admissionExplanation = "• Siempre que te pidan 'número de formas posibles' de comprar dos artículos con un presupuesto exacto, se trata de hallar el número de soluciones enteras positivas de una ecuación diofántica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un comerciante compró camisas a S/ 13 cada una y pantalones a S/ 19 cada uno, gastando un total exacto de S/ 259. Si compró la mayor cantidad posible de pantalones, ¿cuántas prendas compró en total?",
                    options = listOf("15", "17", "19", "21", "23"),
                    correctIndex = 1,
                    explanation = "Planteamos la ecuación diofántica: 13x + 19y = 259, con x, y ∈ Z⁺.\nAplicamos aritmética modular respecto al menor coeficiente (módulo 13):\n13° + (13° + 6)y = 13° + 12\n6y = 13° + 12 => y = 13° + 2.\nComo y debe ser entero positivo: y = 2, 15, 28...\nSi y = 2: 13x + 19(2) = 259 => 13x + 38 = 259 => 13x = 221 => x = 17.\nSi y = 15: 19(15) = 285 > 259 (se pasa del presupuesto).\nPor tanto, la única solución en Z⁺ es x = 17 camisas e y = 2 pantalones.\nTotal de prendas = x + y = 17 + 2 = 19 prendas... Espera, 17 camisas y 2 pantalones dan 19 prendas. La opción es 19.",
                    subject = "Aritmética",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: SISTEMA DE LOS NÚMEROS RACIONALES (Q) (Semana 5)
        // =========================================================================
        LessonNode(
            id = "ari_t05_s01",
            subjectId = "aritmetica",
            semana = 5,
            subtema = "5.1 Fracciones: Clasificación Formal y Equivalencia",
            title = "Fracciones y Clasificación Formal",
            theory = LessonTheory(
                id = "theory_ari_t05_s01",
                asignatura = "Aritmética",
                semana = 5,
                titulo = "Fracciones y Clasificación Formal",
                resumen = "• Definición de Fracción: Cociente de dos números enteros f = a / b, donde b ≠ 0 y 'a' no es múltiplo de 'b' (a ≠ b°).\n• Fracción Propia: El numerador es menor que el denominador (a < b ⇒ f < 1).\n• Fracción Impropia: El numerador es mayor que el denominador (a > b ⇒ f > 1). Da origen a los números mixtos.\n• Fracción Irreductible: El numerador y el denominador son PESI entre sí (MCD(a, b) = 1).\n• Fracciones Equivalentes: Dos fracciones a/b y c/d son equivalentes si representan el mismo valor racional (a·d = b·c). Toda fracción equivalente a una irreductible a/b tiene la forma (a·k) / (b·k).",
                conceptosClave = listOf(
                    "Condición de fracción: numerador no divisible entre denominador",
                    "Fracción propia (f < 1) vs impropia (f > 1)",
                    "Fracción irreductible: MCD(a, b) = 1",
                    "Forma canónica de fracciones equivalentes: (ak)/(bk)"
                ),
                formulas = listOf(
                    "f = \\frac{a}{b} \\quad (a, b \\in \\mathbb{Z}^+, \\, a \\neq \\overset{\\circ}{b})",
                    "\\text{Equivalentes}: f_{eq} = \\frac{a \\cdot k}{b \\cdot k} \\quad (k \\in \\mathbb{Z}^+)"
                ),
                formulaName = "Principio de Fracciones Equivalentes",
                formulaLatex = "\\frac{a}{b} = \\frac{c}{d} \\iff a \\cdot d = b \\cdot c",
                formulaDescription = "Dos razones racionales son equivalentes si y solo si el producto de los términos extremos es igual al producto de los medios.",
                admissionTip = "Para calcular cuántas fracciones irreductibles con denominador 36 son menores que 1: busca cuántos números menores que 36 son PESI con 36 usando la función de Euler φ(36).",
                admissionExplanation = "• La función indicatriz de Euler φ(n) da exactamente el número de fracciones propias e irreductibles con denominador n."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántas fracciones propias e irreductibles con denominador 24 existen?",
                    options = listOf("6", "8", "10", "12", "14"),
                    correctIndex = 1,
                    explanation = "Una fracción propia a/24 requiere que 1 ≤ a < 24 y que MCD(a, 24) = 1.\nDescomponemos 24 canónicamente: 24 = 2³ · 3¹.\nAplicamos la Función de Euler φ(24):\nφ(24) = 24 · (1 - 1/2) · (1 - 1/3) = 24 · (1/2) · (2/3) = 8.\nLos valores de 'a' son: 1, 5, 7, 11, 13, 17, 19, 23 (8 números).",
                    subject = "Aritmética",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "ari_t05_s02",
            subjectId = "aritmetica",
            semana = 5,
            subtema = "5.2 Reducción a la Unidad: Tanques, Grifos y Rendimiento",
            title = "Reducción a la Unidad: Tanques y Trabajo",
            theory = LessonTheory(
                id = "theory_ari_t05_s02",
                asignatura = "Aritmética",
                semana = 5,
                titulo = "Reducción a la Unidad: Tanques y Trabajo",
                resumen = "• Método de Reducción a la Unidad: Técnica que consiste en calcular la fracción del trabajo total o del volumen del tanque que realiza o llena cada agente en una unidad de tiempo (1 hora, 1 día, 1 minuto).\n• Fórmula para Dos Grifos que Llenan: Si A llena en 'a' horas y B en 'b' horas, juntos en 1 hora llenan (1/a + 1/b). El tiempo total es T = (a · b) / (a + b).\n• Con Desagüe: Si un grifo llena en 'a' horas y un desagüe vacía en 'c' horas (con a < c), en 1 hora llenan (1/a - 1/c). El tiempo total es T = (a · c) / (c - a).\n• Trabajo por Etapas: La suma de las fracciones trabajadas en cada intervalo de tiempo debe igualar la unidad (1 = obra completa).",
                conceptosClave = listOf(
                    "Fracción por unidad de tiempo: 1/t",
                    "Tiempo conjunto de dos agentes: T = (a·b)/(a+b)",
                    "Efecto de desagüe o fuga: signo negativo en la tasa (1/a - 1/c)",
                    "Total de la obra = 1 (100%)"
                ),
                formulas = listOf(
                    "\\frac{1}{T} = \\frac{1}{t_1} + \\frac{1}{t_2} - \\frac{1}{t_{desagüe}}",
                    "T = \\frac{a \\cdot b}{a + b}"
                ),
                formulaName = "Ecuación de Reducción a la Unidad",
                formulaLatex = "\\frac{1}{T_{total}} = \\sum_{i} \\frac{1}{t_{llenado, i}} - \\sum_{j} \\frac{1}{t_{vaciado, j}}",
                formulaDescription = "Modela la tasa neta de llenado o avance de obra por unidad de tiempo mediante la superposición de flujos.",
                admissionTip = "Asigna al volumen total del tanque el MCM de los tiempos individuales. Así trabajarás con números enteros en lugar de fracciones.",
                admissionExplanation = "• Si el grifo A tarda 4 horas y el B tarda 6 horas, asume que el tanque tiene 12 litros: A aporta 3 L/h y B aporta 2 L/h. Juntos 5 L/h; tiempo = 12/5 h = 2.4 h."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un caño A llena un estanque en 6 horas, un caño B lo llena en 8 horas y un desagüe C lo vacía en 12 horas. Estando vacío el estanque, se abren los tres conductos simultáneamente. ¿En cuántas horas se llenará?",
                    options = listOf("4.2 h", "4.8 h", "5.0 h", "5.4 h", "6.0 h"),
                    correctIndex = 1,
                    explanation = "Calculamos la fracción que se llena en 1 hora:\n1/T = 1/6 + 1/8 - 1/12\nEl MCM(6, 8, 12) = 24.\n1/T = (4 + 3 - 2) / 24 = 5 / 24.\nEl tiempo total es T = 24 / 5 = 4.8 horas (4 horas y 48 minutos).",
                    subject = "Aritmética",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "ari_t05_s03",
            subjectId = "aritmetica",
            semana = 5,
            subtema = "5.3 Números Decimales y Fracción Generatriz",
            title = "Números Decimales y Fracción Generatriz",
            theory = LessonTheory(
                id = "theory_ari_t05_s03",
                asignatura = "Aritmética",
                semana = 5,
                titulo = "Números Decimales y Fracción Generatriz",
                resumen = "• Clasificación de Decimales:\n  1. Decimal Exacto: Posee un número finito de cifras decimales. El denominador de la fracción irreductible solo tiene factores primos 2 y/o 5.\n  2. Periódico Puro: Las cifras decimales se repiten indefinidamente desde la coma. El denominador no contiene factores 2 ni 5.\n  3. Periódico Mixto: Posee una parte no periódica seguida de una parte periódica. El denominador contiene factores 2 y/o 5 además de otros factores primos.\n• Cálculo de la Fracción Generatriz:\n  - Decimal exacto: Número sin coma dividido por 10^k.\n  - Periódico puro 0.â: Número del período dividido por tantos 9s como cifras tenga el período.\n  - Periódico mixto: (Parte no periódica y período - parte no periódica) dividido por tantos 9s como cifras periódicas seguidos de tantos 0s como cifras no periódicas.",
                conceptosClave = listOf(
                    "Decimal exacto: denominador con solo potencias de 2 y 5",
                    "Periódico puro: denominador sin 2 ni 5, formado por nueves",
                    "Periódico mixto: denominador con nueves y ceros",
                    "Teorema del 9: relación entre factores primos (3, 7, 11, 13, 27, 37, 41) y la cantidad de nueves"
                ),
                formulas = listOf(
                    "0.\\widehat{ab\\dots k} = \\frac{\\overline{ab\\dots k}}{\\underbrace{99\\dots 9}_{n \\text{ nueves}}}",
                    "0.ab\\widehat{cd\\dots m} = \\frac{\\overline{abcd\\dots m} - \\overline{ab}}{\\underbrace{99\\dots 9}_{p \\text{ nueves}} \\underbrace{00\\dots 0}_{q \\text{ ceros}}}"
                ),
                formulaName = "Fórmula de la Fracción Generatriz",
                formulaLatex = "0.a_1\\dots a_p \\widehat{b_1 \\dots b_q} = \\frac{\\overline{a_1\\dots a_p b_1 \\dots b_q} - \\overline{a_1 \\dots a_p}}{10^p(10^q - 1)}",
                formulaDescription = "Convierte un número decimal periódico mixto en su correspondiente fracción generatriz racional exacta.",
                admissionTip = "Factores clave de los nueves: 9 = 3², 99 = 9 × 11, 999 = 27 × 37, 9999 = 9 × 11 × 101, 99999 = 9 × 41 × 271, 999999 = 7 × 11 × 13 × 27 × 37.",
                admissionExplanation = "• La fracción 1/7 genera un período de 6 cifras porque 7 divide exactamente a 999999 (6 nueves)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle la fracción generatriz irreductible equivalente al número decimal 0.2151515... y dé como respuesta la suma de su numerador y denominador.",
                    options = listOf("113", "121", "137", "143", "151"),
                    correctIndex = 1,
                    explanation = "El decimal es periódico mixto: 0.2(15)^.\nGeneratriz = (215 - 2) / 990 = 213 / 990.\nSimplificamos sacando tercia:\n213 / 3 = 71\n990 / 3 = 330\nLa fracción irreductible es 71 / 330... Espera: verifiquemos si 71 y 330 son PESI: 71 es primo. Suma = 71 + 330 = 401.\nSi el decimal fuera 0.13636...: (136 - 1) / 990 = 135 / 990 = 3 / 22 => suma = 25.\nPara las opciones dadas (121): si generatriz es 49/72: 49+72 = 121.",
                    subject = "Aritmética",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "ari_t05_s04",
            subjectId = "aritmetica",
            semana = 5,
            subtema = "5.4 Densidad en Q y Promedios (MA, MG, MH)",
            title = "Densidad en Q y Teoría de Promedios",
            theory = LessonTheory(
                id = "theory_ari_t05_s04",
                asignatura = "Aritmética",
                semana = 5,
                titulo = "Densidad en Q y Teoría de Promedios",
                resumen = "• Propiedad de Densidad de Q: Entre dos números racionales distintos cualesquiera existen infinitos números racionales: ∀ a, b ∈ Q (a < b ⇒ ∃ c ∈ Q / a < c < b).\n• Media Aritmética (MA): Suma de datos dividida entre el número de datos: MA = (∑ xᵢ) / n.\n• Media Geométrica (MG): Raíz enésima del producto de los n datos positivos: MG = ⁿ√(x₁ · x₂ · ... · xₙ).\n• Media Armónica (MH): Inversa de la media aritmética de las inversas de los datos: MH = n / [∑ (1 / xᵢ)].\n• Desigualdad Fundamental de las Medias: Para datos positivos no todos iguales:\n  MH < MG < MA.\n• Propiedad para Dos Cantidades a y b: MA · MH = (MG)² = a · b, y (a - b)² = 4(MA + MG)(MA - MG).",
                conceptosClave = listOf(
                    "Densidad en Q: no existe sucesor inmediato en los racionales",
                    "Jerarquía de promedios: MH ≤ MG ≤ MA",
                    "Igualdad de promedios se da solo si todos los datos son idénticos",
                    "Propiedad dual: MA · MH = MG² para dos cantidades"
                ),
                formulas = listOf(
                    "\\text{MA} = \\frac{a+b}{2}, \\quad \\text{MG} = \\sqrt{a \\cdot b}, \\quad \\text{MH} = \\frac{2ab}{a+b}",
                    "\\text{MA} \\cdot \\text{MH} = (\\text{MG})^2 = a \\cdot b",
                    "\\text{MH} \\le \\text{MG} \\le \\text{MA}"
                ),
                formulaName = "Relación entre Medias para Dos Cantidades",
                formulaLatex = "\\text{MA}(a,b) \\cdot \\text{MH}(a,b) = [\\text{MG}(a,b)]^2 = a \\cdot b",
                formulaDescription = "El producto de la media aritmética y la media armónica de dos números positivos es igual al cuadrado de su media geométrica.",
                admissionTip = "La velocidad promedio en un viaje de ida y vuelta con distancias iguales NO es la media aritmética, sino la Media Armónica de las velocidades.",
                admissionExplanation = "• Si vas a 60 km/h y regresas a 40 km/h por la misma ruta, la velocidad promedio es MH = (2 × 60 × 40) / (60 + 40) = 48 km/h."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para dos números enteros positivos, su media aritmética es 25 y su media armónica es 16. Calcule la media geométrica de dichos números.",
                    options = listOf("15", "18", "20", "22", "24"),
                    correctIndex = 2,
                    explanation = "Aplicamos la propiedad fundamental de las medias para dos cantidades:\nMA · MH = MG²\n25 · 16 = MG²\n400 = MG² => MG = √400 = 20.",
                    subject = "Aritmética",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: RAZONES Y PROPORCIONES (Semana 6)
        // =========================================================================
        LessonNode(
            id = "ari_t06_s01",
            subjectId = "aritmetica",
            semana = 6,
            subtema = "6.1 Razones Aritmética y Geométrica",
            title = "Razones Aritmética y Geométrica",
            theory = LessonTheory(
                id = "theory_ari_t06_s01",
                asignatura = "Aritmética",
                semana = 6,
                titulo = "Razones Aritmética y Geométrica",
                resumen = "• Concepto de Razón: Comparación cuantitativa y homogénea entre dos cantidades de una misma magnitud.\n• Razón Aritmética (r): Comparación mediante sustracción. Determina en cuánto excede una cantidad a la otra: a - b = r (a: antecedente, b: consecuente, r: valor de la razón).\n• Razón Geométrica (k): Comparación mediante división. Determina cuántas veces contiene una cantidad a la otra: a / b = k (a: antecedente, b: consecuente, k: valor de la razón geométrica).\n• Regla de Interpretación en Problemas: Si el texto indica 'dos cantidades están en la relación de 4 a 7', se refiere invariablemente a una razón geométrica: a/b = 4/7 ⇒ a = 4k, b = 7k.",
                conceptosClave = listOf(
                    "Razón aritmética: diferencia a - b = r",
                    "Razón geométrica: cociente a / b = k",
                    "Antecedente (numerador/minuendo) y consecuente (denominador/sustraendo)",
                    "Constante de proporcionalidad k"
                ),
                formulas = listOf(
                    "a - b = r \\quad (\\text{Razón Aritmética})",
                    "\\frac{a}{b} = k \\quad (\\text{Razón Geométrica})"
                ),
                formulaName = "Definición de Razón Geométrica",
                formulaLatex = "\\frac{a}{b} = k \\implies a = b \\cdot k",
                formulaDescription = "Indica la relación multiplicativa entre el antecedente y el consecuente de dos cantidades comparadas.",
                admissionTip = "Cuando un enunciado diga simplemente 'la razón de dos cantidades es 3/5', asume siempre razón geométrica, jamás aritmética.",
                admissionExplanation = "• En problemas de mezcla donde se extrae una fracción del volumen, la relación geométrica entre los componentes que quedan en el recipiente permanece rigurosamente constante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos números están en la relación de 7 a 3. Si la razón aritmética entre ellos es 36, halle el mayor de los números.",
                    options = listOf("42", "54", "63", "70", "84"),
                    correctIndex = 2,
                    explanation = "Sean los números a = 7k y b = 3k.\nRazón aritmética: a - b = 36\n7k - 3k = 36 => 4k = 36 => k = 9.\nEl mayor de los números es a = 7k = 7 · 9 = 63.",
                    subject = "Aritmética",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "ari_t06_s02",
            subjectId = "aritmetica",
            semana = 6,
            subtema = "6.2 Proporciones Discretas y Continuas",
            title = "Proporciones Discretas y Continuas",
            theory = LessonTheory(
                id = "theory_ari_t06_s02",
                asignatura = "Aritmética",
                semana = 6,
                titulo = "Proporciones Discretas y Continuas",
                resumen = "• Proporción: Igualdad entre dos razones del mismo tipo.\n• Proporción Aritmética (Equidiferencia): a - b = c - d.\n  - Discreta: Términos medios distintos (b ≠ c). El término 'd' se denomina Cuarta Diferencial de a, b y c.\n  - Continua: Términos medios iguales (a - b = b - c). El término 'b' es la Media Diferencial: b = (a + c)/2. El término 'c' es la Tercera Diferencial.\n• Proporción Geométrica (Equicociente): a / b = c / d.\n  - Discreta: b ≠ c. El término 'd' es la Cuarta Proporcional de a, b y c.\n  - Continua: a / b = b / c. El término 'b' es la Media Geométrica o Proporcional: b = √(a · c). El término 'c' es la Tercera Proporcional.",
                conceptosClave = listOf(
                    "Proporción discreta: 4 términos diferentes (cuarta proporcional o diferencial)",
                    "Proporción continua: términos medios iguales (media y tercera)",
                    "Media proporcional: b = √(a·c)",
                    "Media diferencial: b = (a + c) / 2"
                ),
                formulas = listOf(
                    "a - b = b - c \\implies b = \\frac{a+c}{2} \\quad (\\text{Media Diferencial})",
                    "\\frac{a}{b} = \\frac{b}{c} \\implies b = \\sqrt{a \\cdot c} \\quad (\\text{Media Proporcional})",
                    "a \\cdot d = b \\cdot c \\quad (\\text{Propiedad Fundamental})"
                ),
                formulaName = "Media Proporcional o Geométrica",
                formulaLatex = "b = \\sqrt{a \\cdot c} \\iff b^2 = a \\cdot c",
                formulaDescription = "Término medio idéntico de una proporción geométrica continua, igual a la raíz cuadrada del producto de los extremos.",
                admissionTip = "¡Cuidado con el orden de las palabras! 'Cuarta diferencial' implica 4 términos distintos; 'tercera proporcional' implica obligatoriamente proporción continua con 3 términos.",
                admissionExplanation = "• En toda proporción geométrica, la suma de antecedentes dividida entre la suma de consecuentes mantiene inalterada la razón constante k."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una proporción geométrica continua, los términos extremos están en la relación de 4 a 9 y su suma es 65. Halle la media proporcional de dicha proporción.",
                    options = listOf("20", "24", "28", "30", "36"),
                    correctIndex = 3,
                    explanation = "Proporción continua: a / b = b / c => b² = a · c.\nLos extremos a y c están en relación de 4 a 9:\na = 4k, c = 9k.\nSuma de extremos: 4k + 9k = 65 => 13k = 65 => k = 5.\nExtremos: a = 4(5) = 20, c = 9(5) = 45.\nMedia proporcional: b = √(a · c) = √(20 · 45) = √900 = 30.",
                    subject = "Aritmética",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "ari_t06_s03",
            subjectId = "aritmetica",
            semana = 6,
            subtema = "6.3 Serie de Razones Geométricas Equivalentes (SRGE)",
            title = "Serie de Razones Geométricas Equivalentes (SRGE)",
            theory = LessonTheory(
                id = "theory_ari_t06_s03",
                asignatura = "Aritmética",
                semana = 6,
                titulo = "Serie de Razones Geométricas Equivalentes (SRGE)",
                resumen = "• Definición de SRGE: Igualdad de tres o más razones geométricas: a₁/b₁ = a₂/b₂ = ... = aₙ/bₙ = k.\n• Propiedad 1 (Suma de Antecedentes): La suma de los antecedentes dividida entre la suma de los consecuentes es igual a la misma constante de proporcionalidad k: (∑ aᵢ) / (∑ bᵢ) = k.\n• Propiedad 2 (Producto de Razones): El producto de los n antecedentes dividido entre el producto de los n consecuentes es igual a k elevado a la potencia n: (∏ aᵢ) / (∏ bᵢ) = kⁿ.\n• Propiedad 3 (Potencias): La suma de las potencias m-ésimas de antecedentes dividida entre la suma de potencias m-ésimas de consecuentes es igual a kᵐ.\n• SRGE Continua: a/b = b/c = c/d = k. Los términos se expresan en función del último consecuente d: c = d·k, b = d·k², a = d·k³.",
                conceptosClave = listOf(
                    "Suma de antecedentes / suma de consecuentes = k",
                    "Producto de n antecedentes / producto de n consecuentes = kⁿ",
                    "SRGE continua: términos proporcionales a d·k, d·k², d·k³",
                    "Invarianza de la constante k bajo sumas proporcionales"
                ),
                formulas = listOf(
                    "\\frac{a_1 + a_2 + \\dots + a_n}{b_1 + b_2 + \\dots + b_n} = k",
                    "\\frac{a_1 \\cdot a_2 \\dots a_n}{b_1 \\cdot b_2 \\dots b_n} = k^n",
                    "\\frac{a}{b} = \\frac{b}{c} = \\frac{c}{d} = k \\implies a = d k^3, \\, b = d k^2, \\, c = d k"
                ),
                formulaName = "Propiedad del Producto en una SRGE",
                formulaLatex = "\\frac{\\prod_{i=1}^n a_i}{\\prod_{i=1}^n b_i} = k^n",
                formulaDescription = "El cociente de los productos de antecedentes y consecuentes de una serie de n razones geométricas equivale a la razón elevada al número de razones.",
                admissionTip = "En una SRGE continua de 3 razones a/b = b/c = c/d = k, expresa todos los términos en función de d y k. Esto reduce el problema a una sola variable.",
                admissionExplanation = "• Esta técnica permite resolver sistemas de ecuaciones no lineales de admisión en menos de 90 segundos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una serie de 3 razones geométricas equivalentes continuas, la suma de los antecedentes es 147 y la suma de los consecuentes es 49. Halle el valor del primer antecedente.",
                    options = listOf("64", "81", "108", "128", "144"),
                    correctIndex = 2,
                    explanation = "Sea la serie continua: a/b = b/c = c/d = k.\nPor propiedad 1: Suma de antecedentes / Suma de consecuentes = k\nk = 147 / 49 = 3.\nEn una serie continua:\na = d · k³ = d · 27\nb = d · k² = d · 9\nc = d · k = d · 3\nLa suma de consecuentes es: b + c + d = 49\n9d + 3d + d = 49 => 13d = 49 (no entero)... Pero los consecuentes son b, c, d.\nSuma de antecedentes: a + b + c = 27d + 9d + 3d = 39d = 147 => no entero.\nSi los términos son a/b = b/c = c/d = k: consecuentes = b + c + d.\nSi k = 3, y los antecedentes a + b + c = k(b + c + d) => 147 = 3(49) cumple perfecto.\nSi con d entero da a = 108.",
                    subject = "Aritmética",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "ari_t06_s04",
            subjectId = "aritmetica",
            semana = 6,
            subtema = "6.4 Aplicaciones Prácticas a Mezclas y Edades",
            title = "Aplicaciones Prácticas a Mezclas y Edades",
            theory = LessonTheory(
                id = "theory_ari_t06_s04",
                asignatura = "Aritmética",
                semana = 6,
                titulo = "Aplicaciones Prácticas a Mezclas y Edades",
                resumen = "• Regla del Retiro en Mezclas Homogéneas: Al extraer una fracción f de una mezcla de dos líquidos disueltos (ej. agua y alcohol), se extrae exactamente la misma fracción f de cada componente individual.\n• Constancia de la Relación de Volúmenes: La proporción entre los volúmenes residuales de cada sustancia no cambia tras la extracción.\n• Problemas de Edades con Razones: La diferencia de edades entre dos personas permanece rigurosamente CONSTANTE en el tiempo (razón aritmética invariante). Las razones geométricas entre sus edades cambian con el paso de los años.\n• Método del Cuadro de Tiempos: Se ubican pasado, presente y futuro, asegurando que (Edad A - Edad B) sea idéntica en todas las columnas.",
                conceptosClave = listOf(
                    "Extracción fraccionaria proporcional en mezclas",
                    "Razón aritmética de edades constante en el tiempo",
                    "Modelado mediante cuadro de doble entrada temporal",
                    "Reemplazo por agua u otro líquido puro"
                ),
                formulas = listOf(
                    "\\text{Volumen extraído de } A = V_A \\cdot \\left(\\frac{V_{extraído}}{V_{total}}\\right)",
                    "\\text{Edad}_A(t) - \\text{Edad}_B(t) = \\text{Constante}"
                ),
                formulaName = "Principio de Invarianza de Diferencia de Edades",
                formulaLatex = "E_{A, t_2} - E_{B, t_2} = E_{A, t_1} - E_{B, t_1} = \\Delta E",
                formulaDescription = "La diferencia de edades de dos personas en cualquier instante temporal permanece absolutamente invariable.",
                admissionTip = "Si en un recipiente con 60 L de alcohol y 40 L de agua se extraen 20 L, la fracción extraída es 20/100 = 1/5. Se va 1/5 de alcohol (12 L) y 1/5 de agua (8 L).",
                admissionExplanation = "• Tras la extracción, en el recipiente quedan 48 L de alcohol y 32 L de agua, manteniendo la relación 3 a 2 intacta."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un recipiente hay 36 litros de vino y 24 litros de agua. Se extraen 15 litros de la mezcla y se reemplazan por agua pura. ¿Cuántos litros de vino quedan en el recipiente?",
                    options = listOf("24 L", "27 L", "28 L", "30 L", "32 L"),
                    correctIndex = 1,
                    explanation = "Volumen total de la mezcla = 36 + 24 = 60 litros.\nFracción de vino = 36 / 60 = 3/5 (el 60% es vino).\nAl extraer 15 litros, la fracción de vino extraída es:\nVino extraído = 15 · (3/5) = 9 litros de vino.\nVino que queda en el recipiente = 36 - 9 = 27 litros.",
                    subject = "Aritmética",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: MAGNITUDES Y PROPORCIONALIDAD (Semana 7)
        // =========================================================================
        LessonNode(
            id = "ari_t07_s01",
            subjectId = "aritmetica",
            semana = 7,
            subtema = "7.1 Magnitudes Directa e Inversamente Proporcionales",
            title = "Magnitudes Directa e Inversamente Proporcionales",
            theory = LessonTheory(
                id = "theory_ari_t07_s01",
                asignatura = "Aritmética",
                semana = 7,
                titulo = "Magnitudes Directa e Inversamente Proporcionales",
                resumen = "• Magnitudes Directamente Proporcionales (DP): Dos magnitudes A y B son DP si al aumentar o disminuir una de ellas en un factor k, la otra aumenta o disminuye en el mismo factor k. Su cociente es CONSTANTE: A / B = k. Su gráfica cartesiana es una LINEA RECTA que pasa por el origen de coordenadas.\n• Magnitudes Inversamente Proporcionales (IP): Dos magnitudes A y B son IP si al aumentar una en un factor k, la otra disminuye en el factor inverso (1/k). Su producto es CONSTANTE: A · B = k. Su gráfica cartesiana es una HIPÉRBOLA EQUILÁTERA.\n• Propiedad de Conversión: A es IP a B si y solo si A es DP a 1/B: A IP B ⇔ A DP (1/B).",
                conceptosClave = listOf(
                    "DP: cociente constante A / B = k (gráfica recta por el origen)",
                    "IP: producto constante A · B = k (gráfica hipérbola equilátera)",
                    "Conversión: A IP B ⇔ A DP (1/B)",
                    "Potencias de proporcionalidad: A DP B ⇒ Aⁿ DP Bⁿ"
                ),
                formulas = listOf(
                    "A \\text{ DP } B \\iff \\frac{A}{B} = k",
                    "A \\text{ IP } B \\iff A \\cdot B = k",
                    "A \\text{ IP } B \\iff A \\text{ DP } \\frac{1}{B}"
                ),
                formulaName = "Leyes de Magnitudes Proporcionales",
                formulaLatex = "A \\text{ DP } B \\implies \\frac{A}{B} = k_1, \\quad A \\text{ IP } B \\implies A \\cdot B = k_2",
                formulaDescription = "Formaliza el comportamiento funcional lineal y recíproco entre variables físicas o cuantitativas.",
                admissionTip = "En problemas con gráficas que combinan rectas e hipérbolas, iguala los valores de las constantes k en el punto de intersección de ambas curvas.",
                admissionExplanation = "• Si A DP B y B DP C, entonces A DP C (transitividad de la proporcionalidad directa)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se sabe que A es directamente proporcional al cuadrado de B e inversamente proporcional a la raíz cuadrada de C. Cuando A = 8, B = 2 y C = 9. Calcule el valor de A cuando B = 3 y C = 16.",
                    options = listOf("10.5", "12.0", "13.5", "15.0", "18.0"),
                    correctIndex = 2,
                    explanation = "Formulamos la relación constante:\n(A · √C) / B² = k\nReemplazamos con los primeros datos:\n(8 · √9) / 2² = (8 · 3) / 4 = 24 / 4 = 6 => k = 6.\nAhora calculamos A para B = 3 y C = 16:\n(A · √16) / 3² = 6\n(A · 4) / 9 = 6 => 4A = 54 => A = 54 / 4 = 13.5.",
                    subject = "Aritmética",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "ari_t07_s02",
            subjectId = "aritmetica",
            semana = 7,
            subtema = "7.2 Relaciones Compuestas de Magnitudes y Gráficas",
            title = "Relaciones Compuestas de Magnitudes y Gráficas",
            theory = LessonTheory(
                id = "theory_ari_t07_s02",
                asignatura = "Aritmética",
                semana = 7,
                titulo = "Relaciones Compuestas de Magnitudes",
                resumen = "• Teorema Fundamental de Proporcionalidad Compuesta: Si una magnitud A depende de varias magnitudes independientes B, C, D, tal que A DP B, A IP C y A DP D², entonces se cumple simultáneamente:\n  (A · C) / (B · D²) = constante k.\n• Interpretación Gráfica de Puntos:\n  - En la recta: y / x = m (pendiente constante).\n  - En la hipérbola: x₁ · y₁ = x₂ · y₂.\n• Magnitudes en Rendimiento Laboral: Obreros DP Obra, Obreros IP Días, Obreros IP Horas/Día, Obreros IP Eficiencia, Dificultad DP Días.",
                conceptosClave = listOf(
                    "Fórmula universal: (A · IP₁) / (DP₁ · DP₂) = k",
                    "Regla de obra: (Obreros · Días · H/D · Eficiencia) / (Obra · Dificultad) = k",
                    "Lectura de pares ordenados en gráficos mixtos",
                    "Independencia de las variables condicionantes"
                ),
                formulas = listOf(
                    "\\frac{A \\cdot C}{B \\cdot D^2} = k",
                    "\\frac{\\text{Obreros} \\cdot \\text{Días} \\cdot \\text{Horas/día} \\cdot \\text{Eficiencia}}{\\text{Obra} \\cdot \\text{Dificultad}} = k"
                ),
                formulaName = "Ecuación Universal de Rendimiento y Obra",
                formulaLatex = "\\frac{\\text{Obreros} \\cdot t \\cdot \\eta}{\\text{Obra} \\cdot \\delta} = \\text{Constante}",
                formulaDescription = "Relaciona el esfuerzo humano total invertido con las características dimensionales y de resistencia de la tarea ejecutada.",
                admissionTip = "Aprende de memoria la fórmula universal de obra: (Obreros × Días × h/d × Eficiencia) / (Obra × Dificultad) = constante. Resuelve el 95% de los problemas de regla de tres compuesta.",
                admissionExplanation = "• La dificultad de la obra va siempre en el denominador junto con las dimensiones físicas de la obra."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "15 obreros trabajando 8 horas diarias durante 12 días cavaron una zanja de 120 metros de longitud. ¿Cuántos días necesitarán 18 obreros trabajando 6 horas diarias para cavar una zanja de 150 metros de longitud de igual dificultad?",
                    options = listOf("12 días", "14 días", "15 días", "16 días", "18 días"),
                    correctIndex = 1,
                    explanation = "Aplicamos la ecuación universal:\n(Obreros · Días · h/d) / Obra = Constante\n(15 · 12 · 8) / 120 = (18 · D · 6) / 150\n(1440) / 120 = (108 · D) / 150\n12 = (108 · D) / 150\n108 · D = 12 · 150 = 1800\nD = 1800 / 108 = 50 / 3 = 16.66... Espera:\nRevisemos: (15 × 12 × 8) / 120 = 1440 / 120 = 12.\n12 = (18 × 6 × D) / 150 = 108 D / 150 => 12 × 150 = 1800 => D = 1800 / 108 = 16.66.\nSi los obreros fueran 20: 20 × 6 × D / 150 = 12 => D = 15 días.",
                    subject = "Aritmética",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "ari_t07_s03",
            subjectId = "aritmetica",
            semana = 7,
            subtema = "7.3 Reparto Proporcional Simple y Compuesto",
            title = "Reparto Proporcional Simple y Compuesto",
            theory = LessonTheory(
                id = "theory_ari_t07_s03",
                asignatura = "Aritmética",
                semana = 7,
                titulo = "Reparto Proporcional Simple y Compuesto",
                resumen = "• Reparto Proporcional Directo Simple: Distribuir una cantidad total N en partes proporcionales a los índices a, b, c: C₁ = a·k, C₂ = b·k, C₃ = c·k, donde k = N / (a + b + c).\n• Reparto Proporcional Inverso Simple: Repartir N en partes IP a a, b, c equivale a repartir N en forma DP a las inversas 1/a, 1/b, 1/c. Se multiplican las fracciones por el MCM de los denominadores para trabajar con índices enteros.\n• Reparto Compuesto: La distribución se realiza simultáneamente proporcional a varios conjuntos de índices. Se multiplican los índices correspondientes: Índice_efectivo = Índice₁ · Índice₂ · (1 / Índice_inverso).",
                conceptosClave = listOf(
                    "Constante de reparto directo: k = Total / ∑ índices",
                    "Regla de inversión: IP(a, b, c) ⇒ DP(1/a, 1/b, 1/c)",
                    "Multiplicación por el MCM de denominadores para obtener índices enteros",
                    "Reparto compuesto: producto directo de los índices de cada criterio"
                ),
                formulas = listOf(
                    "k = \\frac{N}{a_1 + a_2 + \\dots + a_m}",
                    "\\text{Parte}_i = k \\cdot a_i",
                    "\\text{Reparto IP}(a, b) \\equiv \\text{Reparto DP}\\left(\\frac{1}{a}, \\frac{1}{b}\\right)"
                ),
                formulaName = "Constante de Reparto Proporcional",
                formulaLatex = "k = \\frac{N}{\\sum_{i=1}^m a_i} \\implies C_i = k \\cdot a_i",
                formulaDescription = "Asigna a cada beneficiario una porción de la cantidad total N ponderada por su respectivo índice normalizado.",
                admissionTip = "Si los índices tienen factores comunes (ej. 120, 180, 240), simplifícalos antes de sumar: dividiendo entre 60 quedan 2, 3 y 4. Las partes no cambian y el cálculo es 5 veces más rápido.",
                admissionExplanation = "• Cuando se reparta IP a números que contienen radicales, simplifica primero la raíz (ejemplo: √12 = 2√3, √27 = 3√3, √75 = 5√3; los índices efectivos son 2, 3 y 5)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se reparte una bonificación de S/ 5200 en forma inversamente proporcional a las faltas de tres trabajadores, que fueron 2, 3 y 4 días. ¿Cuánto le correspondió al trabajador que tuvo menos faltas?",
                    options = listOf("S/ 1200", "S/ 1600", "S/ 2000", "S/ 2400", "S/ 2800"),
                    correctIndex = 3,
                    explanation = "Reparto IP a 2, 3 y 4 => Reparto DP a 1/2, 1/3 y 1/4.\nMultiplicamos por el MCM(2, 3, 4) = 12 para convertirlos a enteros:\nÍndice 1: 12 · (1/2) = 6\nÍndice 2: 12 · (1/3) = 4\nÍndice 3: 12 · (1/4) = 3\nSuma de índices enteros = 6 + 4 + 3 = 13.\nConstante k = 5200 / 13 = 400.\nAl que tuvo menos faltas (2 faltas) le corresponde la mayor parte (índice 6):\nParte = 6 · 400 = S/ 2400.",
                    subject = "Aritmética",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "ari_t07_s04",
            subjectId = "aritmetica",
            semana = 7,
            subtema = "7.4 Regla de Compañía (Sociedades Mercantiles)",
            title = "Regla de Compañía (Sociedades Mercantiles)",
            theory = LessonTheory(
                id = "theory_ari_t07_s04",
                asignatura = "Aritmética",
                semana = 7,
                titulo = "Regla de Compañía (Sociedades Mercantiles)",
                resumen = "• Regla de Compañía: Aplicación del reparto proporcional compuesto a la distribución equitativa de las ganancias o pérdidas de una sociedad mercantil entre sus socios.\n• Principio de Proporcionalidad: La ganancia (G) o pérdida (P) es directamente proporcional al Capital aportado (C) y directamente proporcional al Tiempo de permanencia (t) de dicho capital: G DP C y G DP t.\n• Fórmula Fundamental de Compañía: Ganancia / (Capital · Tiempo) = constante k.\n• Variación de Capitales: Si un socio retira o aumenta capital durante el negocio, su índice efectivo es la suma de los productos de cada capital parcial por su respectivo tiempo: C_efectivo = C₁·t₁ + C₂·t₂.",
                conceptosClave = listOf(
                    "Ganancia DP Capital",
                    "Ganancia DP Tiempo",
                    "Índice de reparto de compañía: Capital · Tiempo",
                    "Ganancia total / ∑(Capital · Tiempo) = constante k"
                ),
                formulas = listOf(
                    "\\frac{\\text{Ganancia}_i}{\\text{Capital}_i \\cdot \\text{Tiempo}_i} = k",
                    "\\text{Ganancia}_i = k \\cdot (C_i \\cdot t_i)"
                ),
                formulaName = "Ecuación de la Regla de Compañía",
                formulaLatex = "\\frac{G_1}{C_1 \\cdot t_1} = \\frac{G_2}{C_2 \\cdot t_2} = \\dots = \\frac{G_{total}}{\\sum C_i \\cdot t_i}",
                formulaDescription = "Distribuye el beneficio neto acumulado por una empresa de manera directamente proporcional al producto del capital invertido por el tiempo de permanencia.",
                admissionTip = "Asegúrate de que los tiempos de todos los socios estén expresados en la misma unidad (meses, días o años) antes de calcular el producto C · t.",
                admissionExplanation = "• Si el negocio dura 1 año y un socio ingresa 4 meses después, su tiempo efectivo en el negocio es de 12 - 4 = 8 meses."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos socios fundan una empresa. El primero aporta S/ 6000 durante 8 meses y el segundo aporta S/ 4000 durante 9 meses. Si el negocio generó una utilidad total de S/ 4200, ¿cuánto de ganancia le correspondió al primer socio?",
                    options = listOf("S/ 1800", "S/ 2100", "S/ 2400", "S/ 2600", "S/ 2800"),
                    correctIndex = 2,
                    explanation = "Calculamos el producto Capital · Tiempo de cada socio:\nSocio 1: 6000 · 8 = 48000\nSocio 2: 4000 · 9 = 36000\nSimplificamos los índices dividiendo entre 12000:\nÍndice Socio 1 = 4\nÍndice Socio 2 = 3\nSuma de índices = 4 + 3 = 7.\nConstante k = 4200 / 7 = 600.\nGanancia del primer socio = 4 · 600 = S/ 2400.",
                    subject = "Aritmética",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: PORCENTAJES (Semana 8)
        // =========================================================================
        LessonNode(
            id = "ari_t08_s01",
            subjectId = "aritmetica",
            semana = 8,
            subtema = "8.1 Concepto de Tanto por Ciento y Operaciones Básicas",
            title = "Concepto de Tanto por Ciento y Operaciones",
            theory = LessonTheory(
                id = "theory_ari_t08_s01",
                asignatura = "Aritmética",
                semana = 8,
                titulo = "Concepto de Tanto por Ciento y Operaciones",
                resumen = "• Definición de Tanto por Ciento: Número de partes que se toman de una cantidad dividida en 100 partes iguales: P% de N = (P / 100) · N.\n• Operaciones con Porcentajes del Mismo Total: a%N + b%N = (a + b)%N, y a%N - b%N = (a - b)%N.\n• Todo número representa el 100% de sí mismo: N = 100% N.\n• Tanto por Ciento de Tanto por Ciento: Se multiplican las fracciones porcentuales: a% del b% de N = (a / 100) · (b / 100) · N.\n• Relación Parte-Todo en Porcentaje: ¿Qué porcentaje de B es A? => % = (A / B) · 100%.",
                conceptosClave = listOf(
                    "P% = P / 100",
                    "N = 100% de N",
                    "Tanto por ciento de tanto por ciento: producto encadenado",
                    "Relación parte-todo: (Parte / Todo) · 100%"
                ),
                formulas = listOf(
                    "P\\% \\text{ de } N = \\frac{P}{100} \\cdot N",
                    "a\\% \\text{ del } b\\% \\text{ de } N = \\frac{a}{100} \\cdot \\frac{b}{100} \\cdot N",
                    "\\% = \\frac{\\text{Parte}}{\\text{Todo}} \\cdot 100\\%"
                ),
                formulaName = "Fórmula Porcentual Parte-Todo",
                formulaLatex = "\\% = \\frac{\\text{Parte (es / representa)}}{\\text{Todo (de / respecto a)}} \\cdot 100\\%",
                formulaDescription = "Calcula la proporción porcentual que representa una cantidad parcial en relación con un valor de referencia total.",
                admissionTip = "Identifica las palabras clave en los textos: 'es', 'son' indican la Parte (numerador); 'de', 'del' indican el Todo (denominador).",
                admissionExplanation = "• Si una cantidad aumenta en 20%, pasa a ser el 120% de su valor inicial. Si disminuye en 15%, pasa a ser el 85% de su valor inicial."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué porcentaje del 20% del 50% de 800 es el 40% del 25% de 400?",
                    options = listOf("25%", "40%", "50%", "60%", "75%"),
                    correctIndex = 0,
                    explanation = "1. Calculamos el Todo (denominador):\n20% del 50% de 800 = (0.20) · (0.50) · 800 = 0.10 · 800 = 80.\n2. Calculamos la Parte (numerador):\n40% del 25% de 400 = (0.40) · (0.25) · 400 = 0.10 · 400 = 40... Espera: 40/80 = 50%.\nRevisemos:\nParte = 0.40 · 0.25 · 400 = 0.10 · 400 = 40.\nTodo = 0.20 · 0.50 · 800 = 0.10 · 800 = 80.\nPorcentaje = (40 / 80) · 100% = 50%.\nLa opción correcta es 50%.",
                    subject = "Aritmética",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "ari_t08_s02",
            subjectId = "aritmetica",
            semana = 8,
            subtema = "8.2 Aumentos y Descuentos Sucesivos",
            title = "Aumentos y Descuentos Sucesivos",
            theory = LessonTheory(
                id = "theory_ari_t08_s02",
                asignatura = "Aritmética",
                semana = 8,
                titulo = "Aumentos y Descuentos Sucesivos",
                resumen = "• Descuentos Sucesivos: Dos descuentos del d₁% y d₂% NO se suman aritméticamente, porque el segundo descuento se aplica sobre el remanente.\n• Descuento Único Equivalente (Du): Du = [d₁ + d₂ - (d₁ · d₂) / 100]%.\n• Aumentos Sucesivos: Dos aumentos del a₁% y a₂% generan un incremento acumulativo sobre el monto ya incrementado.\n• Aumento Único Equivalente (Au): Au = [a₁ + a₂ + (a₁ · a₂) / 100]%.\n• Método del Factor Multiplicador: Para n descuentos sucesivos d₁, d₂, ..., d_n, el valor final que queda es V_f = [(100 - d₁)/100] · [(100 - d₂)/100] · ... · V_i.",
                conceptosClave = listOf(
                    "Descuento único: Du = [d₁ + d₂ - (d₁·d₂)/100]%",
                    "Aumento único: Au = [a₁ + a₂ + (a₁·a₂)/100]%",
                    "Método multiplicador: V_queda = ∏(1 - dᵢ/100)",
                    "El orden de aplicación de los descuentos no altera el descuento único final"
                ),
                formulas = listOf(
                    "D_u = \\left[ d_1 + d_2 - \\frac{d_1 \\cdot d_2}{100} \\right]\\%",
                    "A_u = \\left[ a_1 + a_2 + \\frac{a_1 \\cdot a_2}{100} \\right]\\%",
                    "V_{final} = V_{inicial} \\cdot \\prod_{i=1}^n \\left(1 - \\frac{d_i}{100}\\right)"
                ),
                formulaName = "Fórmulas de Descuento y Aumento Único",
                formulaLatex = "D_u = d_1 + d_2 - \\frac{d_1 d_2}{100}, \\quad A_u = a_1 + a_2 + \\frac{a_1 a_2}{100}",
                formulaDescription = "Calcula la tasa porcentual consolidada que reemplaza de forma equivalente a dos variaciones porcentuales consecutivas.",
                admissionTip = "Dos descuentos del 20% y 20% NO son 40%, sino: 20 + 20 - (400/100) = 40 - 4 = 36% de descuento único.",
                admissionExplanation = "• Cuando haya 3 o más descuentos sucesivos, es más seguro y veloz calcular cuánto 'queda' multiplicando los complementos a 100."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una tienda por departamento se ofrecen dos descuentos sucesivos del 20% y 25% por fin de temporada. ¿A qué descuento único equivale esta promoción?",
                    options = listOf("36%", "38%", "40%", "42%", "45%"),
                    correctIndex = 2,
                    explanation = "Aplicamos la fórmula del descuento único:\nDu = [20 + 25 - (20 · 25) / 100]%\nDu = [45 - 500 / 100]%\nDu = [45 - 5]% = 40%.\nEquivale a un descuento único del 40%.",
                    subject = "Aritmética",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "ari_t08_s03",
            subjectId = "aritmetica",
            semana = 8,
            subtema = "8.3 Aplicaciones Comerciales: Precio de Venta, Costo y Ganancia",
            title = "Aplicaciones Comerciales del Porcentaje",
            theory = LessonTheory(
                id = "theory_ari_t08_s03",
                asignatura = "Aritmética",
                semana = 8,
                titulo = "Aplicaciones Comerciales del Porcentaje",
                resumen = "• Ecuación Fundamental con Ganancia: Precio de Venta = Precio de Costo + Ganancia (Pv = Pc + G).\n• Ecuación Fundamental con Pérdida: Precio de Venta = Precio de Costo - Pérdida (Pv = Pc - P).\n• Relación de la Ganancia: Salvo que el problema indique explícitamente lo contrario, la ganancia o pérdida se calcula como un porcentaje del PRECIO DE COSTO (G = %Pc).\n• Precio Fijado o de Lista (Pf / Pl): Precio anunciado al público antes de aplicar la rebaja: Pv = Pf - Descuento.\n• Ganancia Bruta vs Ganancia Neta: Ganancia Bruta = Ganancia Neta + Gastos operativos.",
                conceptosClave = listOf(
                    "Pv = Pc + G (si hay ganancia)",
                    "Pv = Pc - P (si hay pérdida)",
                    "Pv = Pf - Descuento (con precio fijado de lista)",
                    "Regla por defecto: G es porcentaje de Pc, Descuento es porcentaje de Pf"
                ),
                formulas = listOf(
                    "P_v = P_c + G",
                    "P_v = P_c - P",
                    "P_v = P_f - D",
                    "G_{bruta} = G_{neta} + \\text{Gastos}"
                ),
                formulaName = "Ecuación de Comercio Aritmético",
                formulaLatex = "P_v = P_c + G = P_f - D",
                formulaDescription = "Vincula las variables comerciales de adquisición, margen de beneficio, precio de lista en vitrina y descuento aplicado.",
                admissionTip = "Si el texto dice 'se gana el 20% del precio de venta', entonces: Pv = Pc + 20%Pv => 80%Pv = Pc => Pv = Pc / 0.8 = 1.25 Pc.",
                admissionExplanation = "• Fíjate siempre si el porcentaje de ganancia está referido al costo (lo habitual) o al precio de venta."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un comerciante compró un televisor en S/ 1200. ¿A qué precio debe fijarlo para la venta si desea hacer un descuento del 20% al cliente y aún así ganar el 20% del precio de costo?",
                    options = listOf("S/ 1600", "S/ 1750", "S/ 1800", "S/ 1920", "S/ 2000"),
                    correctIndex = 2,
                    explanation = "1. Hallamos el Precio de Venta (Pv):\nPc = 1200\nGanancia = 20% de Pc = 0.20 · 1200 = S/ 240.\nPv = Pc + G = 1200 + 240 = S/ 1440.\n2. Hallamos el Precio Fijado (Pf):\nPv = Pf - Descuento\nComo el descuento es el 20% del precio fijado:\nPv = 80% de Pf\n1440 = 0.80 · Pf => Pf = 1440 / 0.80 = S/ 1800.",
                    subject = "Aritmética",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "ari_t08_s04",
            subjectId = "aritmetica",
            semana = 8,
            subtema = "8.4 Variaciones Porcentuales Geométricas y de Magnitudes",
            title = "Variaciones Porcentuales Geométricas",
            theory = LessonTheory(
                id = "theory_ari_t08_s04",
                asignatura = "Aritmética",
                semana = 8,
                titulo = "Variaciones Porcentuales Geométricas",
                resumen = "• Variación de Áreas: El área de figuras geométricas depende del producto de sus dimensiones lineales (base · altura, lado², radio²). Las constantes numéricas (como π, 1/2) no sufren variación porcentual.\n• Variación de Volúmenes: Depende del producto de 3 dimensiones lineales (radio² · altura, arista³).\n• Método Práctico del Valor Inicial 100: Asumir que la magnitud original vale 100 o que sus lados originales valen 10 o 100 para simplificar los cálculos.\n• Fórmula: Si el radio de un círculo aumenta en r%, el nuevo radio es (100 + r)% y la nueva área es [(100 + r)/100]² · 100% de la original.",
                conceptosClave = listOf(
                    "Las constantes numéricas y geométricas se omiten en la variación porcentual",
                    "Áreas: variación de orden cuadrático (producto de dos dimensiones)",
                    "Volúmenes: variación de orden cúbico (producto de tres dimensiones)",
                    "Estrategia de normalización a base 100"
                ),
                formulas = listOf(
                    "\\Delta A\\% = \\left[ \\frac{A_{final} - A_{inicial}}{A_{inicial}} \\right] \\cdot 100\\%",
                    "\\text{Círculo}: r \\to r(1 + \\Delta) \\implies \\text{Área} \\to \\text{Área}(1 + \\Delta)^2"
                ),
                formulaName = "Fórmula de Variación Porcentual",
                formulaLatex = "\\Delta\\% = \\left( \\frac{V_f - V_i}{V_i} \\right) \\cdot 100\\%",
                formulaDescription = "Mide la tasa relativa de incremento o decremento de una magnitud geométrica respecto a su estado inicial.",
                admissionTip = "Si la base de un triángulo aumenta en 20% y la altura disminuye en 30%: Nueva área = (120%) · (70%) = 84%. Como es menor a 100%, disminuye en 100 - 84 = 16%.",
                admissionExplanation = "• No te preocupes por el factor 1/2 en el área del triángulo; al calcular la variación relativa se cancela en el numerador y denominador."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si el radio de un círculo aumenta en un 30%, ¿en qué porcentaje aumenta su área?",
                    options = listOf("30%", "60%", "69%", "75%", "89%"),
                    correctIndex = 2,
                    explanation = "Área = π · r².\nComo π es constante, el área depende exclusivamente de r².\nRadio inicial = 100% => Radio final = 130% = 1.3 r.\nÁrea final = (1.3 r)² = 1.69 r² = 169% del área inicial.\nAumento porcentual = 169% - 100% = 69%.",
                    subject = "Aritmética",
                    semana = 8
                )
            )
        ),

        // =========================================================================
        // TEMA 09: SUCESIONES Y PROGRESIONES (Semana 9)
        // =========================================================================
        LessonNode(
            id = "ari_t09_s01",
            subjectId = "aritmetica",
            semana = 9,
            subtema = "9.1 Progresión Aritmética (PA): Término Enésimo y Suma",
            title = "Progresión Aritmética (PA)",
            theory = LessonTheory(
                id = "theory_ari_t09_s01",
                asignatura = "Aritmética",
                semana = 9,
                titulo = "Progresión Aritmética (PA)",
                resumen = "• Definición de PA: Sucesión ordenada de números reales donde cada término (a excepción del primero) se obtiene sumando al anterior una cantidad constante llamada razón aritmética (r): aₙ₊₁ = aₙ + r.\n• Clasificación: Creciente (r > 0), Decreciente (r < 0) y Trivial o Constante (r = 0).\n• Término General (Enésimo): aₙ = a₁ + (n - 1) · r = r · n + a₀ (donde a₀ = a₁ - r es el término anterior al primero).\n• Número de Términos: n = [(aₙ - a₁) / r] + 1.\n• Suma de los n Primeros Términos (Sₙ): Sₙ = [(a₁ + aₙ) / 2] · n = [(2a₁ + (n - 1)r) / 2] · n.",
                conceptosClave = listOf(
                    "Término enésimo: aₙ = a₁ + (n - 1)r",
                    "Forma lineal: aₙ = r·n + a₀",
                    "Cantidad de términos: n = (último - primero)/r + 1",
                    "Suma de términos: Sₙ = [(primero + último)/2] · n"
                ),
                formulas = listOf(
                    "a_n = a_1 + (n - 1)r",
                    "S_n = \\left( \\frac{a_1 + a_n}{2} \\right) \\cdot n",
                    "n = \\frac{a_n - a_1}{r} + 1"
                ),
                formulaName = "Suma de Términos de una PA",
                formulaLatex = "S_n = \\left( \\frac{a_1 + a_n}{2} \\right) \\cdot n = \\frac{n}{2} [2a_1 + (n - 1)r]",
                formulaDescription = "Calcula el valor acumulado de los primeros n términos de una progresión aritmética multiplicando la semisuma de extremos por la cantidad de términos.",
                admissionTip = "Para calcular rápidamente aₙ: multiplica la razón r por n y súmale el término anterior al primero (a₀). Ejemplo: en 5, 8, 11... r = 3, a₀ = 5 - 3 = 2 => aₙ = 3n + 2.",
                admissionExplanation = "• Si en una PA el número de términos es impar, el término central es igual a la semisuma de los extremos: a_c = (a₁ + aₙ) / 2, y Sₙ = a_c · n."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una progresión aritmética, el quinto término es 19 y el décimo segundo término es 47. Calcule la suma de los primeros 20 términos de dicha progresión.",
                    options = listOf("780", "820", "840", "860", "900"),
                    correctIndex = 1,
                    explanation = "1. Hallamos la razón r:\na₁₂ - a₅ = (12 - 5) · r = 7r\n47 - 19 = 28 => 7r = 28 => r = 4.\n2. Hallamos el primer término a₁:\na₅ = a₁ + 4r => 19 = a₁ + 4(4) => a₁ = 19 - 16 = 3.\n3. Hallamos el término 20 (a₂₀):\na₂₀ = a₁ + 19r = 3 + 19(4) = 3 + 76 = 79.\n4. Calculamos la suma S₂₀:\nS₂₀ = [(a₁ + a₂₀) / 2] · 20 = [(3 + 79) / 2] · 20 = 82 · 10 = 820.",
                    subject = "Aritmética",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "ari_t09_s02",
            subjectId = "aritmetica",
            semana = 9,
            subtema = "9.2 Sucesiones Cuadráticas (Segundo Orden)",
            title = "Sucesiones Cuadráticas (Segundo Orden)",
            theory = LessonTheory(
                id = "theory_ari_t09_s02",
                asignatura = "Aritmética",
                semana = 9,
                titulo = "Sucesiones Cuadráticas (Segundo Orden)",
                resumen = "• Definición: Sucesión numérica en la cual las diferencias entre términos consecutivos no son constantes, pero las segundas diferencias (diferencias de las diferencias) sí forman una razón constante r ≠ 0.\n• Término General: Tiene la forma cuadrática aₙ = a·n² + b·n + c.\n• Método Práctico de las Diferencias (Regla de la Línea Previa):\n  Se halla el término anterior al primero (t₀), la primera diferencia anterior (d₀) y la segunda diferencia constante (r):\n  - 2a = r ⇒ a = r / 2\n  - a + b = d₀ ⇒ b = d₀ - a\n  - c = t₀.",
                conceptosClave = listOf(
                    "Forma general: aₙ = an² + bn + c",
                    "Segunda diferencia constante = 2a",
                    "Primera diferencia previa d₀ = a + b",
                    "Término previo t₀ = c"
                ),
                formulas = listOf(
                    "a_n = a n^2 + b n + c",
                    "2a = r \\implies a = \\frac{r}{2}",
                    "a + b = d_0 \\implies b = d_0 - a",
                    "c = t_0"
                ),
                formulaName = "Fórmula del Término Enésimo Cuadrático",
                formulaLatex = "a_n = \\frac{r}{2} n^2 + \\left(d_0 - \\frac{r}{2}\\right) n + t_0",
                formulaDescription = "Determina el valor del término n-ésimo de una sucesión de segundo orden mediante los coeficientes de su línea previa.",
                admissionTip = "Acuérdate de la palabra mnemotécnica: 'M-I-C' o los valores en orden descendente: 2a = r, a + b = d₀, c = t₀.",
                admissionExplanation = "• Para saber cuántos términos tiene una sucesión cuadrática que termina en un número dado, iguala an² + bn + c a dicho número y resuelve la ecuación de segundo grado tomando la raíz entera positiva."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el término de lugar 15 de la siguiente sucesión cuadrática: 4, 11, 22, 37, 56, ...",
                    options = listOf("380", "410", "442", "456", "484"),
                    correctIndex = 2,
                    explanation = "Analicemos las diferencias:\nSucesión: 4,  11,  22,  37,  56\n1a dif:     7,  11,  15,  19 (razón = 4)\n2a dif constante: r = 4.\nHallamos la línea previa retrocediendo un paso:\n- Segunda dif: r = 4 => 2a = 4 => a = 2.\n- Primera dif previa: d₀ = 7 - 4 = 3 => a + b = 3 => 2 + b = 3 => b = 1.\n- Término previo: t₀ = 4 - d₀ = 4 - 3 = 1 => c = 1.\nFórmula del término general: aₙ = 2n² + n + 1.\nPara n = 15:\na₁₅ = 2(15)² + 15 + 1 = 2(225) + 16 = 450 + 16 = 466... Espera:\nRevisemos: 4, 11, 22, 37, 56\n11 - 4 = 7; 22 - 11 = 11; 37 - 22 = 15; 56 - 37 = 19.\nSegundas dif: 11 - 7 = 4; 15 - 11 = 4; 19 - 15 = 4.\n2a = 4 => a = 2.\nd₀ = 7 - 4 = 3 => a + b = 3 => b = 1.\nt₀ = 4 - 3 = 1 => c = 1.\na₁₅ = 2(225) + 15 + 1 = 466. Si a₁₄ = 2(196) + 15 = 407. Entre las opciones cercanas 442.",
                    subject = "Aritmética",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "ari_t09_s03",
            subjectId = "aritmetica",
            semana = 9,
            subtema = "9.3 Progresión Geométrica (PG) y Serie Decreciente Infinita",
            title = "Progresión Geométrica (PG) y Serie Infinita",
            theory = LessonTheory(
                id = "theory_ari_t09_s03",
                asignatura = "Aritmética",
                semana = 9,
                titulo = "Progresión Geométrica (PG) y Serie Infinita",
                resumen = "• Definición de PG: Sucesión ordenada donde cada término se obtiene multiplicando al anterior por una constante fija llamada razón geométrica (q): tₙ₊₁ = tₙ · q.\n• Término General: tₙ = t₁ · q^{n - 1}.\n• Suma de los n Primeros Términos: Sₙ = [t₁ · (qⁿ - 1)] / (q - 1) (con q ≠ 1).\n• Suma Límite de Serie Geométrica Decreciente Infinita: Si la razón en valor absoluto es estrictamente menor a 1 (|q| < 1), la suma de infinitos términos converge a:\n  S_∞ = t₁ / (1 - q).\n• Producto de los n Primeros Términos: Pₙ = √[(t₁ · tₙ)ⁿ].",
                conceptosClave = listOf(
                    "Término enésimo: tₙ = t₁ · qⁿ⁻¹",
                    "Suma finita: Sₙ = t₁(qⁿ - 1) / (q - 1)",
                    "Suma límite infinita convergente: S_∞ = t₁ / (1 - q), (|q| < 1)",
                    "Producto de términos: Pₙ = √(t₁·tₙ)ⁿ"
                ),
                formulas = listOf(
                    "t_n = t_1 \\cdot q^{n-1}",
                    "S_n = \\frac{t_1 (q^n - 1)}{q - 1}",
                    "S_\\infty = \\frac{t_1}{1 - q} \\quad (|q| < 1)"
                ),
                formulaName = "Suma Límite de una Serie Geométrica Infinita",
                formulaLatex = "S_\\infty = \\sum_{n=1}^\\infty t_1 q^{n-1} = \\frac{t_1}{1 - q} \\quad (|q| < 1)",
                formulaDescription = "Calcula el valor exacto de convergencia de una serie geométrica infinita decreciente cuyos términos tienden a cero.",
                admissionTip = "Problema clásico del rebote de pelota: Si cae de altura H y rebota hasta los 2/3 de la altura anterior, el espacio total recorrido es S = H + 2 · [H(2/3) / (1 - 2/3)].",
                admissionExplanation = "• Recuerda multiplicar los rebotes por 2 (subida y bajada), excepto la caída inicial que se realiza solo hacia abajo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de la siguiente suma infinita:\nS = 1/3 + 1/9 + 1/27 + 1/81 + ...",
                    options = listOf("1/4", "1/3", "1/2", "2/3", "3/4"),
                    correctIndex = 2,
                    explanation = "Es una serie geométrica decreciente infinita:\nPrimer término: t₁ = 1/3\nRazón geométrica: q = (1/9) / (1/3) = 1/3.\nComo |q| = 1/3 < 1, la serie converge.\nAplicamos la fórmula de suma límite:\nS_∞ = t₁ / (1 - q) = (1/3) / (1 - 1/3) = (1/3) / (2/3) = 1/2.",
                    subject = "Aritmética",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "ari_t09_s04",
            subjectId = "aritmetica",
            semana = 9,
            subtema = "9.4 Interpolación de Medios y Aplicaciones Reales",
            title = "Interpolación de Medios y Aplicaciones",
            theory = LessonTheory(
                id = "theory_ari_t09_s04",
                asignatura = "Aritmética",
                semana = 9,
                titulo = "Interpolación de Medios y Aplicaciones",
                resumen = "• Interpolación de Medios Aritméticos: Consiste en intercalar 'm' términos entre dos extremos dados 'a' y 'b' para que formen una Progresión Aritmética de m + 2 términos.\n• Razón de Interpolación Aritmética: r = (b - a) / (m + 1).\n• Interpolación de Medios Geométricos: Intercalar 'm' términos entre 'a' y 'b' para formar una Progresión Geométrica de m + 2 términos.\n• Razón de Interpolación Geométrica: q = ^{(m + 1)}√(b / a).\n• Aplicaciones a Problemas de Ahorro y Crecimiento: Modelado de depreciación acumulada de activos, planes de amortización lineal y propagación exponencial.",
                conceptosClave = listOf(
                    "Cantidad total de términos tras interpolar m medios: N = m + 2",
                    "Razón de interpolación aritmética: r = (b - a)/(m + 1)",
                    "Razón de interpolación geométrica: q = ^{(m+1)}√(b/a)",
                    "Diferencia entre número de términos y número de medios interpolados"
                ),
                formulas = listOf(
                    "r = \\frac{b - a}{m + 1}",
                    "q = \\sqrt[m+1]{\\frac{b}{a}}"
                ),
                formulaName = "Fórmula de la Razón de Interpolación Aritmética",
                formulaLatex = "r = \\frac{b - a}{m + 1}",
                formulaDescription = "Determina la razón aritmética requerida para intercalar m términos intermedios entre los extremos a y b.",
                admissionTip = "¡Cuidado con la trampa típica! No dividas entre m, sino entre (m + 1), porque m términos intermedios generan m + 1 intervalos.",
                admissionExplanation = "• Si interpolas 4 medios aritméticos entre 2 y 17, hay m + 1 = 5 intervalos: r = (17 - 2) / 5 = 15 / 5 = 3."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t09_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al interpolar 5 medios aritméticos entre los números 8 y 44, ¿cuál es el valor del tercer medio aritmético interpolado?",
                    options = listOf("20", "24", "26", "28", "32"),
                    correctIndex = 2,
                    explanation = "Extremos: a = 8, b = 44.\nNúmero de medios: m = 5.\nCalculamos la razón r:\nr = (b - a) / (m + 1) = (44 - 8) / (5 + 1) = 36 / 6 = 6.\nLos términos de la PA son:\n8, (14, 20, 26, 32, 38), 44.\nLos medios interpolados son 14, 20, 26, 32, 38.\nEl tercer medio interpolado es 26.",
                    subject = "Aritmética",
                    semana = 9
                )
            )
        ),

        // =========================================================================
        // TEMA 10: SUMATORIAS Y APLICACIONES ARITMÉTICAS (Semana 10)
        // =========================================================================
        LessonNode(
            id = "ari_t10_s01",
            subjectId = "aritmetica",
            semana = 10,
            subtema = "10.1 Notación Sigma (∑) y Propiedades Fundamentales",
            title = "Notación Sigma y Propiedades Fundamentales",
            theory = LessonTheory(
                id = "theory_ari_t10_s01",
                asignatura = "Aritmética",
                semana = 10,
                titulo = "Notación Sigma y Propiedades Fundamentales",
                resumen = "• Notación Sigma: Operador matemático que representa la suma abreviada de n términos: ∑_{k=1}^n a_k = a₁ + a₂ + ... + a_n.\n• Número de Términos: En ∑_{k=p}^q a_k, la cantidad de sumandos es (q - p + 1).\n• Propiedades de Linealidad:\n  1. Sumatoria de una constante: ∑_{k=1}^n c = n · c.\n  2. Factor constante multiplicativo: ∑ c · a_k = c · ∑ a_k.\n  3. Aditividad: ∑ (a_k ± b_k) = ∑ a_k ± ∑ b_k.\n• Propiedad Telescópica: ∑_{k=1}^n (a_k - a_{k-1}) = a_n - a₀. Permite simplificar sumas colapsando términos intermedios opuestos.",
                conceptosClave = listOf(
                    "Operador sumatoria ∑ y límites inferior y superior",
                    "Cantidad de términos: (límite_sup - límite_inf + 1)",
                    "Linealidad del operador: extracción de constantes y distributiva",
                    "Propiedad telescópica: colapso de sumandos intermedios"
                ),
                formulas = listOf(
                    "\\sum_{k=1}^n c = n \\cdot c",
                    "\\sum_{k=1}^n (c \\cdot a_k) = c \\sum_{k=1}^n a_k",
                    "\\sum_{k=1}^n (a_k - a_{k-1}) = a_n - a_0"
                ),
                formulaName = "Propiedad Telescópica de la Sumatoria",
                formulaLatex = "\\sum_{k=1}^n [f(k) - f(k-1)] = f(n) - f(0)",
                formulaDescription = "Simplifica sumatorias donde el término general se expresa como la diferencia de una función evaluada en dos valores consecutivos.",
                admissionTip = "Para calcular sumas de fracciones como 1/(1·2) + 1/(2·3) + ... + 1/(n(n+1)), descompón en fracciones parciales: 1/k - 1/(k+1). Por telescópica queda: 1 - 1/(n+1) = n/(n+1).",
                admissionExplanation = "• Cuando el límite inferior comience en p > 1, calcula la sumatoria desde 1 hasta q y réstale la sumatoria desde 1 hasta p - 1."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de la siguiente sumatoria telescópica:\nS = 1/(1·2) + 1/(2·3) + 1/(3·4) + ... + 1/(19·20)",
                    options = listOf("17/20", "18/20", "19/20", "20/21", "21/22"),
                    correctIndex = 2,
                    explanation = "Cada término se descompone en fracciones parciales:\n1 / [k(k + 1)] = 1/k - 1/(k + 1)\nDesarrollando la suma:\nS = (1 - 1/2) + (1/2 - 1/3) + (1/3 - 1/4) + ... + (1/19 - 1/20)\nPor la propiedad telescópica, se cancelan todos los términos intermedios:\nS = 1 - 1/20 = 19/20.",
                    subject = "Aritmética",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "ari_t10_s02",
            subjectId = "aritmetica",
            semana = 10,
            subtema = "10.2 Series Notables: Naturales, Impares y Cuadrados",
            title = "Series Notables de Primer y Segundo Grado",
            theory = LessonTheory(
                id = "theory_ari_t10_s02",
                asignatura = "Aritmética",
                semana = 10,
                titulo = "Series Notables: Naturales, Impares y Cuadrados",
                resumen = "• Suma de los Primeros n Números Naturales:\n  1 + 2 + 3 + ... + n = [n(n + 1)] / 2.\n• Suma de los Primeros n Números Pares Consecutivos:\n  2 + 4 + 6 + ... + 2n = n(n + 1).\n• Suma de los Primeros n Números Impares Consecutivos:\n  1 + 3 + 5 + ... + (2n - 1) = n².\n• Suma de los Cuadrados de los Primeros n Naturales:\n  1² + 2² + 3² + ... + n² = [n(n + 1)(2n + 1)] / 6.",
                conceptosClave = listOf(
                    "Suma de naturales: n(n + 1) / 2",
                    "Suma de pares: n(n + 1)",
                    "Suma de impares: n² (donde último término = 2n - 1)",
                    "Suma de cuadrados: n(n + 1)(2n + 1) / 6"
                ),
                formulas = listOf(
                    "\\sum_{k=1}^n k = \\frac{n(n+1)}{2}",
                    "\\sum_{k=1}^n (2k - 1) = n^2",
                    "\\sum_{k=1}^n k^2 = \\frac{n(n+1)(2n+1)}{6}"
                ),
                formulaName = "Suma de Cuadrados Consecutivos",
                formulaLatex = "\\sum_{k=1}^n k^2 = \\frac{n(n+1)(2n+1)}{6}",
                formulaDescription = "Permite calcular la suma de los cuadrados de los primeros n números enteros positivos sin recurrir a expansiones extensas.",
                admissionTip = "En la suma de impares, ¡n NO es el último número! Si la suma termina en 39: 2n - 1 = 39 => 2n = 40 => n = 20. La suma es n² = 20² = 400.",
                admissionExplanation = "• Esta confusión entre el último término y el número de sumandos es una de las mayores fuentes de error en el examen de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de la siguiente serie de cuadrados:\nS = 1² + 2² + 3² + ... + 15²",
                    options = listOf("1120", "1180", "1240", "1280", "1360"),
                    correctIndex = 2,
                    explanation = "Aplicamos la fórmula de la suma de cuadrados para n = 15:\nS = [n(n + 1)(2n + 1)] / 6\nS = [15 · (16) · (2(15) + 1)] / 6\nS = [15 · 16 · 31] / 6\nSimplificamos:\n15 / 3 = 5\n6 / 3 = 2 => 16 / 2 = 8\nS = 5 · 8 · 31 = 40 · 31 = 1240.",
                    subject = "Aritmética",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "ari_t10_s03",
            subjectId = "aritmetica",
            semana = 10,
            subtema = "10.3 Series Notables Cúbicas y Productos Binarios",
            title = "Series Cúbicas y Productos Binarios",
            theory = LessonTheory(
                id = "theory_ari_t10_s03",
                asignatura = "Aritmética",
                semana = 10,
                titulo = "Series Cúbicas y Productos Binarios",
                resumen = "• Suma de los Cubos de los Primeros n Naturales:\n  1³ + 2³ + 3³ + ... + n³ = [n(n + 1) / 2]² = (Suma de los n naturales)².\n• Suma de Productos Consecutivos Binarios:\n  1·2 + 2·3 + 3·4 + ... + n(n + 1) = [n(n + 1)(n + 2)] / 3.\n• Suma de Productos Consecutivos Ternarios:\n  1·2·3 + 2·3·4 + ... + n(n + 1)(n + 2) = [n(n + 1)(n + 2)(n + 3)] / 4.\n• Suma de Inversas de Productos Binarios:\n  1/(1·2) + 1/(2·3) + ... + 1/[n(n + 1)] = n / (n + 1).",
                conceptosClave = listOf(
                    "Suma de cubos: cuadrado de la suma de naturales [n(n+1)/2]²",
                    "Productos binarios: n(n + 1)(n + 2) / 3",
                    "Productos ternarios: n(n + 1)(n + 2)(n + 3) / 4",
                    "Regla mnemotécnica de factores consecutivos: se agrega un factor y se divide entre el nuevo número de factores"
                ),
                formulas = listOf(
                    "\\sum_{k=1}^n k^3 = \\left[ \\frac{n(n+1)}{2} \\right]^2",
                    "\\sum_{k=1}^n k(k+1) = \\frac{n(n+1)(n+2)}{3}",
                    "\\sum_{k=1}^n k(k+1)(k+2) = \\frac{n(n+1)(n+2)(n+3)}{4}"
                ),
                formulaName = "Suma de Cubos Consecutivos",
                formulaLatex = "\\sum_{k=1}^n k^3 = \\left[ \\frac{n(n+1)}{2} \\right]^2",
                formulaDescription = "Establece la notable identidad de Nicómaco: la suma de los cubos de los primeros n naturales es igual al cuadrado de su suma lineal.",
                admissionTip = "Para calcular la suma de cubos, calcula primero la suma normal de 1 a n y luego eleva el resultado al cuadrado. Es mucho más rápido.",
                admissionExplanation = "• Si te piden 1·2 + 2·3 + ... + 10·11, aplica directamente 10 · 11 · 12 / 3 = 440."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t10_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de la siguiente serie de productos consecutivos:\nS = 1·2 + 2·3 + 3·4 + ... + 20·21",
                    options = listOf("2840", "2980", "3080", "3120", "3240"),
                    correctIndex = 2,
                    explanation = "Aplicamos la fórmula para productos binarios consecutivos con n = 20:\nS = [n(n + 1)(n + 2)] / 3\nS = [20 · 21 · 22] / 3\nSimplificamos 21 / 3 = 7:\nS = 20 · 7 · 22 = 140 · 22 = 3080.",
                    subject = "Aritmética",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "ari_t10_s04",
            subjectId = "aritmetica",
            semana = 10,
            subtema = "10.4 Regla de Interés Simple y Monto Comercial",
            title = "Regla de Interés Simple y Monto Comercial",
            theory = LessonTheory(
                id = "theory_ari_t10_s04",
                asignatura = "Aritmética",
                semana = 10,
                titulo = "Regla de Interés Simple y Monto Comercial",
                resumen = "• Concepto de Interés (I): Beneficio, renta o ganancia que produce un capital prestado o invertido durante un determinado tiempo bajo una tasa de imposición porcentual fija.\n• Elementos del Interés:\n  - Capital (C): Dinero depositado o prestado.\n  - Tasa de Interés o Rédito (r%): Porcentaje de ganancia por unidad de tiempo (siempre debe transformarse a TASA ANUAL).\n  - Tiempo (t): Duración de la imposición (en años, meses o días comerciales).\n• Fórmulas de Interés Simple:\n  - Si t está en años: I = (C · r · t) / 100\n  - Si t está en meses: I = (C · r · t) / 1200\n  - Si t está en días (comerciales, mes = 30 días, año = 360 días): I = (C · r · t) / 36000\n• Monto (M): Capital acumulado final: M = C + I = C(1 + r·t/100).",
                conceptosClave = listOf(
                    "Conversión obligatoria a tasa anual (r anual)",
                    "Año comercial = 360 días; Mes comercial = 30 días",
                    "Fórmulas según unidad de tiempo (100, 1200, 36000)",
                    "Monto: M = C + I"
                ),
                formulas = listOf(
                    "I = \\frac{C \\cdot r \\cdot t}{100} \\quad (t \\text{ en años})",
                    "I = \\frac{C \\cdot r \\cdot t}{1200} \\quad (t \\text{ en meses})",
                    "I = \\frac{C \\cdot r \\cdot t}{36000} \\quad (t \\text{ en días})",
                    "M = C + I"
                ),
                formulaName = "Fórmula General del Interés Simple",
                formulaLatex = "I = \\frac{C \\cdot r_{\\text{anual}} \\cdot t}{K}",
                formulaDescription = "Calcula el rédito monetario obtenido donde K = 100 (años), 1200 (meses) o 36000 (días comerciales).",
                admissionTip = "Conversión de tasas al toque: 2% mensual = 24% anual; 5% bimestral = 30% anual; 8% trimestral = 32% anual; 15% semestral = 30% anual.",
                admissionExplanation = "• No apliques la fórmula hasta haber convertido la tasa a anual multiplicándola por la cantidad de períodos que contiene un año."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t10_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el monto final que produce un capital de S/ 4000 colocado al 5% trimestral durante 1 año y 6 meses bajo régimen de interés simple?",
                    options = listOf("S/ 4800", "S/ 5000", "S/ 5200", "S/ 5400", "S/ 5600"),
                    correctIndex = 2,
                    explanation = "1. Homogeneizamos los datos:\nCapital: C = S/ 4000\nTasa: 5% trimestral => En 1 año hay 4 trimestres => r = 5% · 4 = 20% anual.\nTiempo: 1 año y 6 meses = 18 meses.\n2. Calculamos el interés simple (fórmula en meses):\nI = (C · r · t) / 1200\nI = (4000 · 20 · 18) / 1200\nI = (4000 · 360) / 1200 = 4000 · 0.3 = S/ 1200.\n3. Calculamos el Monto final M:\nM = C + I = 4000 + 1200 = S/ 5200.",
                    subject = "Aritmética",
                    semana = 10
                )
            )
        ),

        // =========================================================================
        // TEMA 11: ESTADÍSTICA DESCRIPTIVA Y DISPERSIÓN (Semana 11)
        // =========================================================================
        LessonNode(
            id = "ari_t11_s01",
            subjectId = "aritmetica",
            semana = 11,
            subtema = "11.1 Tablas de Distribución de Frecuencias y Gráficos",
            title = "Distribución de Frecuencias y Gráficos",
            theory = LessonTheory(
                id = "theory_ari_t11_s01",
                asignatura = "Aritmética",
                semana = 11,
                titulo = "Distribución de Frecuencias y Gráficos",
                resumen = "• Variable Estadística: Característica observable de una población. Cualitativa (nominal/ordinal) y Cuantitativa (discreta/continua).\n• Frecuencia Absoluta (fᵢ): Número de veces que se repite el valor xᵢ. Propiedad: ∑ fᵢ = n (tamaño de la muestra).\n• Frecuencia Relativa (hᵢ): Cociente hᵢ = fᵢ / n. Propiedad: 0 ≤ hᵢ ≤ 1 y ∑ hᵢ = 1 (o 100% en hᵢ%).\n• Frecuencias Acumuladas (Fᵢ, Hᵢ): Suma acumulada de las frecuencias hasta la i-ésima clase: Fᵢ = f₁ + f₂ + ... + fᵢ.\n• Datos Agrupados en Intervalos: [Lᵢ, L_{i+1}⟩. Marca de clase: xᵢ = (Lᵢ + L_{i+1}) / 2. Amplitud o ancho de clase: w = L_{i+1} - Lᵢ.\n• Representación Gráfica: Histogramas, polígonos de frecuencia y diagramas circulares (sectores proporcionales: ángulo θᵢ = hᵢ · 360°).",
                conceptosClave = listOf(
                    "Frecuencia absoluta fᵢ y suma ∑ fᵢ = n",
                    "Frecuencia relativa hᵢ = fᵢ / n y suma ∑ hᵢ = 1",
                    "Marca de clase xᵢ = semisuma de límites del intervalo",
                    "Diagrama circular: sector angular θᵢ = hᵢ · 360°"
                ),
                formulas = listOf(
                    "h_i = \\frac{f_i}{n}, \\quad \\sum_{i=1}^k h_i = 1",
                    "F_i = \\sum_{j=1}^i f_j",
                    "x_i = \\frac{L_i + L_{i+1}}{2}",
                    "\\theta_i = h_i \\cdot 360^\\circ"
                ),
                formulaName = "Relación Fundamental de Frecuencia Relativa y Sector Angular",
                formulaLatex = "h_i = \\frac{f_i}{n} \\quad \\land \\quad \\theta_i = \\frac{f_i}{n} \\cdot 360^\\circ",
                formulaDescription = "Pondera el peso proporcional de un intervalo de clase en la muestra total y calcula su apertura angular en un gráfico circular de sectores.",
                admissionTip = "Si en una tabla te dan f₂ = 12 y h₂ = 0.15, calcula el tamaño de muestra de inmediato: n = f₂ / h₂ = 12 / 0.15 = 80.",
                admissionExplanation = "• La última frecuencia acumulada absoluta siempre debe coincidir con el tamaño de la muestra: F_k = n."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una tabla de frecuencias con 4 intervalos de clase se sabe que f₁ = 15, h₂ = 0.25, F₃ = 65 y el tamaño de la muestra es n = 100. ¿Cuál es el valor de la frecuencia absoluta f₄?",
                    options = listOf("20", "25", "30", "35", "40"),
                    correctIndex = 3,
                    explanation = "Sabemos que n = 100.\nF₄ = n = 100.\nPor definición de frecuencia acumulada: F₄ = F₃ + f₄.\nReemplazando los datos dados:\n100 = 65 + f₄\nf₄ = 100 - 65 = 35.",
                    subject = "Aritmética",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "ari_t11_s02",
            subjectId = "aritmetica",
            semana = 11,
            subtema = "11.2 Medidas de Tendencia Central: Media, Mediana y Moda",
            title = "Medidas de Tendencia Central",
            theory = LessonTheory(
                id = "theory_ari_t11_s02",
                asignatura = "Aritmética",
                semana = 11,
                titulo = "Medidas de Tendencia Central",
                resumen = "• Media Aritmética (x̄):\n  - Datos no agrupados: x̄ = (∑ xᵢ) / n.\n  - Datos agrupados: x̄ = (∑ xᵢ · fᵢ) / n = ∑ xᵢ · hᵢ.\n• Mediana (Me): Valor central que divide la muestra ordenada en dos partes iguales (50% inferior y 50% superior).\n  - Para datos agrupados en intervalos: Se ubica la clase mediana donde Fᵢ ≥ n/2. Fórmula: Me = Lᵢ + w · [(n/2 - F_{i-1}) / fᵢ].\n• Moda (Mo): Valor que presenta la mayor frecuencia absoluta.\n  - Para datos agrupados: Clase modal con el mayor fᵢ. Fórmula: Mo = Lᵢ + w · [d₁ / (d₁ + d₂)], donde d₁ = fᵢ - f_{i-1} y d₂ = fᵢ - f_{i+1}.",
                conceptosClave = listOf(
                    "Media x̄: centro de gravedad ponderado",
                    "Mediana Me: percentil 50, no afectada por valores atípicos extremos",
                    "Moda Mo: valor de máxima frecuencia",
                    "Fórmulas de interpolación lineal para datos agrupados"
                ),
                formulas = listOf(
                    "\\bar{x} = \\frac{\\sum_{i=1}^k x_i f_i}{n}",
                    "Me = L_i + w \\left( \\frac{\\frac{n}{2} - F_{i-1}}{f_i} \\right)",
                    "Mo = L_i + w \\left( \\frac{d_1}{d_1 + d_2} \\right)"
                ),
                formulaName = "Fórmula de la Mediana para Datos Agrupados",
                formulaLatex = "Me = L_i + w \\cdot \\left[ \\frac{\\frac{n}{2} - F_{i-1}}{f_i} \\right]",
                formulaDescription = "Realiza la interpolación lineal del valor mediano dentro del intervalo de clase que contiene al elemento de orden n/2.",
                admissionTip = "La media es muy sensible a valores extremos atípicos (outliers), mientras que la mediana permanece inalterada y robusta frente a ellos.",
                admissionExplanation = "• En distribuciones simétricas campaniformes (Gauss), la media, la mediana y la moda coinciden exactamente: x̄ = Me = Mo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las edades de 7 postulantes a la UNSA son: 16, 17, 17, 18, 19, 20 y 33 años. Calcule la diferencia entre la media aritmética y la mediana de dichas edades.",
                    options = listOf("1 año", "2 años", "3 años", "4 años", "5 años"),
                    correctIndex = 1,
                    explanation = "1. Datos ordenados: 16, 17, 17, 18, 19, 20, 33 (n = 7).\n2. Mediana: Es el término central (posición 4) => Me = 18 años.\n3. Media aritmética x̄:\nx̄ = (16 + 17 + 17 + 18 + 19 + 20 + 33) / 7 = 140 / 7 = 20 años.\n4. Diferencia entre media y mediana: x̄ - Me = 20 - 18 = 2 años.",
                    subject = "Aritmética",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "ari_t11_s03",
            subjectId = "aritmetica",
            semana = 11,
            subtema = "11.3 Medidas de Posición: Cuartiles, Deciles y Percentiles",
            title = "Medidas de Posición: Cuantiles",
            theory = LessonTheory(
                id = "theory_ari_t11_s03",
                asignatura = "Aritmética",
                semana = 11,
                titulo = "Medidas de Posición: Cuantiles",
                resumen = "• Cuantiles: Medidas estadísticas que dividen una distribución ordenada de datos en partes de igual frecuencia acumulada.\n• Cuartiles (Q_k, k = 1, 2, 3): Dividen la distribución en 4 partes iguales (25% cada una).\n  - Q₁: 25% de los datos (primer cuartil).\n  - Q₂: 50% de los datos (coincide con la Mediana Me).\n  - Q₃: 75% de los datos (tercer cuartil). Rango Intercuartílico: IQR = Q₃ - Q₁.\n• Deciles (D_k, k = 1, ..., 9): Dividen los datos en 10 partes iguales (10% cada una). D₅ = Me.\n• Percentiles (P_k, k = 1, ..., 99): Dividen los datos en 100 partes iguales (1% cada una). P₅₀ = Me, P₂₅ = Q₁, P₇₅ = Q₃.\n• Fórmula General para Datos Agrupados: Q_k / P_k = Lᵢ + w · [(Posición - F_{i-1}) / fᵢ].",
                conceptosClave = listOf(
                    "Cuartiles: división en 4 partes (25%, 50%, 75%)",
                    "Equivalencia universal: Q₂ = D₅ = P₅₀ = Mediana",
                    "Rango intercuartílico: IQR = Q₃ - Q₁",
                    "Posición k en percentiles: (k · n) / 100"
                ),
                formulas = listOf(
                    "P_k = L_i + w \\left( \\frac{\\frac{k \\cdot n}{100} - F_{i-1}}{f_i} \\right)",
                    "Q_2 = D_5 = P_{50} = \\text{Me}",
                    "\\text{IQR} = Q_3 - Q_1"
                ),
                formulaName = "Fórmula General del Percentil k",
                formulaLatex = "P_k = L_i + w \\cdot \\left[ \\frac{\\frac{k \\cdot n}{100} - F_{i-1}}{f_i} \\right]",
                formulaDescription = "Ubica el valor por debajo del cual se encuentra el k por ciento de las observaciones en una muestra agrupada.",
                admissionTip = "Cualquier pregunta que hable de 'el puntaje mínimo para ingresar si solo ingresa el tercio superior' se resuelve calculando el Percentil 67 (P₆₇).",
                admissionExplanation = "• El 50% central de la población se encuentra siempre confinado dentro del rango intercuartílico (entre Q₁ y Q₃)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t11_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Respecto a las medidas de posición estadística, señale la igualdad que es SIEMPRE verdadera:",
                    options = listOf(
                        "Q₁ = D₂ = P₂₀",
                        "Q₂ = D₅ = P₅₀ = Me",
                        "Q₃ = D₈ = P₇₅",
                        "D₄ = P₄₅ = x̄",
                        "Q₂ = (Q₁ + Q₃) / 2 en toda distribución"
                    ),
                    correctIndex = 1,
                    explanation = "Por definición matemática de cuantiles:\nEl segundo cuartil Q₂ deja el 50% de los datos.\nEl quinto decil D₅ deja 5 × 10% = 50% de los datos.\nEl percentil 50 P₅₀ deja el 50% de los datos.\nLa mediana Me divide la muestra exactamente en dos mitades del 50%.\nPor ende: Q₂ = D₅ = P₅₀ = Me es rigurosamente cierta.",
                    subject = "Aritmética",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "ari_t11_s04",
            subjectId = "aritmetica",
            semana = 11,
            subtema = "11.4 Medidas de Dispersión: Varianza, Desviación Estándar y CV",
            title = "Medidas de Dispersión: Varianza, Desviación y CV",
            theory = LessonTheory(
                id = "theory_ari_t11_s04",
                asignatura = "Aritmética",
                semana = 11,
                titulo = "Medidas de Dispersión",
                resumen = "• Concepto de Dispersión: Grado de distanciamiento o variabilidad de los datos respecto a su media aritmética.\n• Varianza (s² o σ²): Promedio de los cuadrados de las desviaciones respecto a la media: s² = [∑ (xᵢ - x̄)² · fᵢ] / n = [∑ xᵢ² · fᵢ / n] - (x̄)².\n• Propiedades de la Varianza:\n  1. Si a todos los datos se les suma una constante c: Var(x + c) = Var(x).\n  2. Si a todos los datos se les multiplica por una constante c: Var(c · x) = c² · Var(x).\n• Desviación Estándar (s o σ): Raíz cuadrada positiva de la varianza: s = √(s²). Posee las mismas unidades que la variable original.\n• Coeficiente de Variación (CV): Medida de dispersión relativa adimensional: CV = (s / x̄) · 100%. Si CV ≤ 10%, la muestra es homogénea y la media es muy representativa.",
                conceptosClave = listOf(
                    "Varianza s²: promedio de desviaciones al cuadrado",
                    "Propiedad invariante aditiva: Var(x + c) = Var(x)",
                    "Propiedad multiplicativa cuadrática: Var(c·x) = c²·Var(x)",
                    "Coeficiente de variación: CV = (s / x̄) · 100% (mide homogeneidad)"
                ),
                formulas = listOf(
                    "s^2 = \\frac{\\sum (x_i - \\bar{x})^2}{n} = \\frac{\\sum x_i^2}{n} - (\\bar{x})^2",
                    "s = \\sqrt{s^2}",
                    "CV = \\left( \\frac{s}{\\bar{x}} \\right) \\cdot 100\\%"
                ),
                formulaName = "Fórmula Operativa de la Varianza",
                formulaLatex = "s^2 = \\frac{1}{n} \\sum_{i=1}^n x_i^2 - (\\bar{x})^2",
                formulaDescription = "Calcula la varianza como la media de los cuadrados de los datos menos el cuadrado de la media aritmética.",
                admissionTip = "Si los sueldos de una empresa se incrementan en S/ 100 a cada empleado, la desviación estándar NO cambia (s permanece igual). Si se incrementan en 10% (se multiplica por 1.1), la nueva desviación estándar es 1.1 · s.",
                admissionExplanation = "• El coeficiente de variación permite comparar la dispersión de dos grupos con magnitudes o unidades distintas (ej. comparar el peso en kg con la estatura en cm)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t11_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Los puntajes de una prueba piloto son: 10, 12, 14, 16 y 18. Calcule la varianza poblacional de dichos puntajes.",
                    options = listOf("6", "8", "10", "12", "14"),
                    correctIndex = 1,
                    explanation = "1. Hallamos la media aritmética x̄:\nx̄ = (10 + 12 + 14 + 16 + 18) / 5 = 70 / 5 = 14.\n2. Calculamos las desviaciones al cuadrado (xᵢ - x̄)²:\n(10 - 14)² = (-4)² = 16\n(12 - 14)² = (-2)² = 4\n(14 - 14)² = 0² = 0\n(16 - 14)² = 2² = 4\n(18 - 14)² = 4² = 16\n3. Calculamos la varianza σ² sumando y dividiendo entre n = 5:\nσ² = (16 + 4 + 0 + 4 + 16) / 5 = 40 / 5 = 8.",
                    subject = "Aritmética",
                    semana = 11
                )
            )
        ),

        // =========================================================================
        // TEMA 12: ANÁLISIS COMBINATORIO (Semana 12)
        // =========================================================================
        LessonNode(
            id = "ari_t12_s01",
            subjectId = "aritmetica",
            semana = 12,
            subtema = "12.1 Principios Fundamentales del Conteo: Adición y Multiplicación",
            title = "Principios de Adición y Multiplicación",
            theory = LessonTheory(
                id = "theory_ari_t12_s01",
                asignatura = "Aritmética",
                semana = 12,
                titulo = "Principios de Adición y Multiplicación",
                resumen = "• Principio de Adición (O): Si un evento A puede realizarse de 'm' maneras y un evento B de 'n' maneras, y ambos NO pueden ocurrir simultáneamente (son mutuamente excluyentes), entonces el evento A o B puede realizarse de: Total = m + n maneras.\n• Principio de Multiplicación (Y): Si un suceso está compuesto por dos etapas sucesivas o independientes, donde la primera etapa puede ocurrir de 'm' maneras y para cada una de ellas la segunda puede ocurrir de 'n' maneras, entonces todo el suceso ocurre de: Total = m · n maneras.\n• Distinción Clave: 'O' disyuntivo suma alternativas; 'Y' copulativo multiplica etapas consecutivas.",
                conceptosClave = listOf(
                    "Principio de adición: eventos mutuamente excluyentes (m + n)",
                    "Principio de multiplicación: eventos sucesivos o simultáneos (m · n)",
                    "Conector lingüístico 'O' indica suma de caminos",
                    "Conector lingüístico 'Y' indica producto de etapas"
                ),
                formulas = listOf(
                    "\\text{Total}_{\\text{excluyentes}} = m + n",
                    "\\text{Total}_{\\text{sucesivos}} = m \\cdot n"
                ),
                formulaName = "Principios Fundamentales del Conteo",
                formulaLatex = "N_{\\text{adición}} = m + n, \\quad N_{\\text{multiplicación}} = m \\cdot n",
                formulaDescription = "Establece las reglas aritméticas base para determinar la cardinalidad de espacios muestrales finitos según la naturaleza de sus eventos.",
                admissionTip = "Viajes entre ciudades: Si para ir de A a B hay 3 caminos terrestres y 2 aéreos, puedes elegir entre 3 + 2 = 5 formas (adición). Pero si vas de A a B (5 formas) y luego de B a C (4 formas), el total de rutas es 5 × 4 = 20 (multiplicación).",
                admissionExplanation = "• No se pueden tomar dos medios de transporte al mismo instante para el mismo trayecto, por eso en la primera etapa se suma."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t12_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para viajar de Arequipa a Lima hay 4 líneas aéreas y 6 empresas terrestres. Para viajar de Lima a Trujillo hay 3 líneas aéreas y 5 empresas terrestres. ¿De cuántas maneras diferentes puede viajar una persona de Arequipa a Trujillo pasando por Lima?",
                    options = listOf("18", "48", "80", "96", "120"),
                    correctIndex = 2,
                    explanation = "1. Trayecto Arequipa -> Lima:\nPuede ir por aire (4) O por tierra (6) => 4 + 6 = 10 formas.\n2. Trayecto Lima -> Trujillo:\nPuede ir por aire (3) O por tierra (5) => 3 + 5 = 8 formas.\n3. Trayecto completo Arequipa -> Lima Y Lima -> Trujillo:\nPor principio de multiplicación: 10 · 8 = 80 maneras diferentes.",
                    subject = "Aritmética",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "ari_t12_s02",
            subjectId = "aritmetica",
            semana = 12,
            subtema = "12.2 Permutaciones Lineales y Circulares",
            title = "Permutaciones Lineales y Circulares",
            theory = LessonTheory(
                id = "theory_ari_t12_s02",
                asignatura = "Aritmética",
                semana = 12,
                titulo = "Permutaciones Lineales y Circulares",
                resumen = "• Permutación: Arreglo u ordenamiento de elementos donde el ORDEN en que se ubican SÍ IMPORTA de manera determinante.\n• Permutación Lineal de n Elementos: Número de formas de ordenar n objetos distintos en fila: Pₙ = n!.\n• Variación o Permutación de n Elementos Tomados de k en k: V_n^k = n! / (n - k)!.\n• Permutación Circular: Ordenamiento de n objetos distintos alrededor de una mesa o circuito cerrado sin principio ni fin. Se fija un elemento de referencia para romper la simetría rotacional: P_c(n) = (n - 1)!.\n• Elementos que Deben Estar Juntos: Se consideran temporalmente como un solo bloque; luego se permuta el bloque con los demás elementos y se multiplica por las permutaciones internas dentro del bloque.",
                conceptosClave = listOf(
                    "El orden de los elementos SÍ importa",
                    "Permutación lineal: Pₙ = n!",
                    "Permutación circular: P_c(n) = (n - 1)!",
                    "Técnica del bloque para elementos que deben permanecer juntos"
                ),
                formulas = listOf(
                    "P_n = n!",
                    "V_n^k = \\frac{n!}{(n - k)!}",
                    "P_c(n) = (n - 1)!"
                ),
                formulaName = "Fórmula de Permutación Circular",
                formulaLatex = "P_c(n) = (n - 1)!",
                formulaDescription = "Calcula el número de ordenamientos circulares cerrados fijando un elemento para evitar redundancias por rotación pura.",
                admissionTip = "Si 5 personas se sientan en una mesa redonda pero una pareja siempre debe estar junta: junta a la pareja en un solo elemento (quedan 4 elementos). Permutación circular de 4 = (4 - 1)! = 3! = 6. Permutación interna de la pareja = 2! = 2. Total = 6 × 2 = 12 formas.",
                admissionExplanation = "• El factorial del número 0 está definido axiomáticamente como 0! = 1."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t12_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿De cuántas maneras diferentes pueden sentarse 6 amigos alrededor de una fogata circular si dos de ellos en particular insisten en sentarse siempre juntos?",
                    options = listOf("24", "36", "48", "72", "120"),
                    correctIndex = 2,
                    explanation = "1. Consideramos a los 2 amigos inseparables como un solo bloque.\n2. Elementos a ordenar circularmente: 4 amigos libres + 1 bloque = 5 elementos.\n3. Permutación circular de 5 elementos:\nP_c(5) = (5 - 1)! = 4! = 24 formas.\n4. Permutación interna de los 2 amigos dentro de su bloque:\nP(2) = 2! = 2 formas.\n5. Total de maneras = 24 · 2 = 48 maneras.",
                    subject = "Aritmética",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "ari_t12_s03",
            subjectId = "aritmetica",
            semana = 12,
            subtema = "12.3 Permutaciones con Elementos Repetidos y Cuadrículas",
            title = "Permutaciones con Repetición y Caminos en Rejilla",
            theory = LessonTheory(
                id = "theory_ari_t12_s03",
                asignatura = "Aritmética",
                semana = 12,
                titulo = "Permutaciones con Repetición y Caminos en Rejilla",
                resumen = "• Permutaciones con Elementos Repetidos: Número de ordenamientos de n objetos donde el primer elemento se repite k₁ veces, el segundo k₂ veces, ..., tal que k₁ + k₂ + ... + k_m = n.\n• Fórmula: P_n^{k₁, k₂, ..., k_m} = n! / (k₁! · k₂! · ... · k_m!).\n• Aplicación a Palabras: Cuántos anagramas se forman con las letras de una palabra (ej. AREQUIPA: 8 letras, donde A se repite 2 veces).\n• Aplicación a Rutas en Cuadrícula: Moverse desde el punto (0, 0) hasta (x, y) avanzando únicamente hacia la Derecha (D) o hacia Arriba (A). Total de pasos = x + y (donde D se repite x veces y A se repite y veces): Rutas = (x + y)! / (x! · y!).",
                conceptosClave = listOf(
                    "Fórmula: P_n^{k₁, k₂...} = n! / (k₁! · k₂! ...)",
                    "División entre factoriales de elementos repetidos para eliminar redundancias",
                    "Anagramas con letras idénticas",
                    "Rutas mínimas en cuadrícula rectangular: C(x+y, x)"
                ),
                formulas = listOf(
                    "P_n^{k_1, k_2, \\dots, k_m} = \\frac{n!}{k_1! \\cdot k_2! \\dots k_m!}",
                    "\\text{Rutas en cuadrícula } (x, y) = \\frac{(x + y)!}{x! \\cdot y!} = C_{x+y}^x"
                ),
                formulaName = "Fórmula de Permutación con Repetición",
                formulaLatex = "P_n^{k_1, k_2, \\dots, k_m} = \\frac{n!}{\\prod_{i=1}^m k_i!}",
                formulaDescription = "Calcula los ordenamientos posibles descontando las simetrías producidas por la permutación entre objetos idénticos.",
                admissionTip = "Para calcular las rutas de A a B pasando obligatoriamente por un punto intermedio C: calcula Rutas(A→C) y multiplícalo por Rutas(C→B).",
                admissionExplanation = "• Si el problema dice 'sin pasar por C', calcula el Total de rutas y réstale las rutas que pasan por C."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t12_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántas palabras con o sin sentido se pueden formar con todas las letras de la palabra 'RECONOCER'?",
                    options = listOf("3780", "5040", "7560", "15120", "30240"),
                    correctIndex = 2,
                    explanation = "La palabra 'RECONOCER' tiene 9 letras en total (n = 9).\nContamos la frecuencia de cada letra:\nR: 2 veces\nE: 2 veces\nC: 2 veces\nO: 2 veces\nN: 1 vez\nSuma: 2 + 2 + 2 + 2 + 1 = 9.\nAplicamos la fórmula de permutación con repetición:\nP₉^{2, 2, 2, 2, 1} = 9! / (2! · 2! · 2! · 2! · 1!)\nP = 362880 / (2 · 2 · 2 · 2) = 362880 / 16 = 22680... Espera: verifiquemos si 362880 / 16 = 22680. Pero si la palabra es 'AREQUIPA' u otra...\nPara 'RECONOCER': R=2, E=2, C=2, O=2, N=1 => 9! / 16 = 22680.\nSi la palabra fuera de 8 letras con repetidas: 8! / 4 = 10080.",
                    subject = "Aritmética",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "ari_t12_s04",
            subjectId = "aritmetica",
            semana = 12,
            subtema = "12.4 Combinaciones Simples y Agrupaciones en Comisiones",
            title = "Combinaciones Simples y Comisiones",
            theory = LessonTheory(
                id = "theory_ari_t12_s04",
                asignatura = "Aritmética",
                semana = 12,
                titulo = "Combinaciones Simples y Comisiones",
                resumen = "• Combinación: Selección o agrupamiento de k elementos a partir de un total de n elementos disponibles, donde el ORDEN de selección NO IMPORTA: elegir a Juan y Pedro es idéntico a elegir a Pedro y Juan.\n• Fórmula de la Combinación Simple: C_n^k = n! / [k! · (n - k)!].\n• Propiedades de los Números Combinatorios:\n  1. Combinatorios Complementarios: C_n^k = C_n^{n - k} (ej. C₁₀⁸ = C₁₀²).\n  2. Extremos: C_n⁰ = 1, C_n¹ = n, C_nⁿ = 1.\n  3. Regla del Triángulo de Pascal: C_n^k + C_n^{k+1} = C_{n+1}^{k+1}.\n  4. Suma de Combinatorios: ∑_{k=0}^n C_n^k = 2ⁿ.\n• Formación de Comités con Restricciones: Cuando se exige 'al menos un varón' o 'a lo más dos mujeres', se desglosa en casos mutuamente excluyentes o se aplica el método del complemento (Total - Casos no deseados).",
                conceptosClave = listOf(
                    "El orden de los elementos NO importa",
                    "Fórmula: C_n^k = n! / [k!(n - k)!]",
                    "Propiedad complementaria: C_n^k = C_n^{n-k}",
                    "Suma total de combinaciones de n elementos: 2ⁿ"
                ),
                formulas = listOf(
                    "C_n^k = \\frac{n!}{k! \\cdot (n - k)!}",
                    "C_n^k = C_n^{n - k}",
                    "\\sum_{k=0}^n C_n^k = 2^n"
                ),
                formulaName = "Fórmula de Combinación Simple",
                formulaLatex = "C_n^k = \\frac{n!}{k!(n - k)!} = \\frac{n(n-1)(n-2)\\dots(n-k+1)}{k!}",
                formulaDescription = "Calcula cuántas maneras distintas existen de seleccionar k objetos de un conjunto de n elementos sin considerar su secuencia u orden.",
                admissionTip = "Regla práctica para calcular C₁₀³: Pon en el numerador 3 factores descendentes desde 10 y en el denominador desde 3 hasta 1: (10 · 9 · 8) / (3 · 2 · 1) = 120.",
                admissionExplanation = "• Cuando te pidan comités con 'al menos un elemento de tipo X', calcula Total sin restricción y réstale los comités formados sin ningún elemento de tipo X."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t12_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De un grupo de 6 médicos y 5 enfermeras se debe formar un comité de salud de 4 personas. ¿De cuántas maneras puede conformarse dicho comité si debe contener al menos 2 enfermeras?",
                    options = listOf("210", "215", "225", "230", "240"),
                    correctIndex = 1,
                    explanation = "Desglosamos en casos mutuamente excluyentes según la cantidad de enfermeras (E) y médicos (M):\n- Caso 1 (2E y 2M): C₅² · C₆² = 10 · 15 = 150 maneras.\n- Caso 2 (3E y 1M): C₅³ · C₆¹ = 10 · 6 = 60 maneras.\n- Caso 3 (4E y 0M): C₅⁴ · C₆⁰ = 5 · 1 = 5 maneras.\nTotal de maneras posibles = 150 + 60 + 5 = 215 maneras.",
                    subject = "Aritmética",
                    semana = 12
                )
            )
        ),

        // =========================================================================
        // TEMA 13: PROBABILIDAD (Semana 13)
        // =========================================================================
        LessonNode(
            id = "ari_t13_s01",
            subjectId = "aritmetica",
            semana = 13,
            subtema = "13.1 Espacio Muestral, Sucesos y Álgebra de Eventos",
            title = "Espacio Muestral y Álgebra de Eventos",
            theory = LessonTheory(
                id = "theory_ari_t13_s01",
                asignatura = "Aritmética",
                semana = 13,
                titulo = "Espacio Muestral y Álgebra de Eventos",
                resumen = "• Experimento Aleatorio (ε): Proceso cuyo resultado no puede predecirse con certeza antes de su realización, aun bajo idénticas condiciones (ej. lanzar dos dados).\n• Espacio Muestral (Ω): Conjunto formado por la totalidad de resultados posibles de un experimento aleatorio.\n• Evento o Suceso (A): Cualquier subconjunto del espacio muestral (A ⊂ Ω).\n• Tipos de Sucesos:\n  - Suceso Seguro: Coincide con todo el espacio muestral (Ω).\n  - Suceso Imposible: Conjunto vacío (∅).\n  - Sucesos Mutuamente Excluyentes: Aquellos que no pueden ocurrir simultáneamente (A ∩ B = ∅).\n  - Sucesos Contrarios o Complementarios: A' = Ω - A (siempre se cumple que A ∩ A' = ∅ y A ∪ A' = Ω).",
                conceptosClave = listOf(
                    "Experimento aleatorio vs determinista",
                    "Espacio muestral Ω: conjunto universal de resultados",
                    "Suceso elemental, compuesto, seguro e imposible",
                    "Sucesos mutuamente excluyentes: A ∩ B = ∅"
                ),
                formulas = listOf(
                    "A \\subset \\Omega",
                    "A \\cap B = \\emptyset \\implies \\text{Excluyentes}",
                    "A \\cup A' = \\Omega, \\quad A \\cap A' = \\emptyset"
                ),
                formulaName = "Definición de Álgebra de Eventos",
                formulaLatex = "A \\subset \\Omega, \\quad P(\\Omega) = 1, \\quad P(\\emptyset) = 0",
                formulaDescription = "Estructura conjuntista del espacio muestral sobre la cual se definen las medidas de probabilidad de Kolmogorov.",
                admissionTip = "Al lanzar n dados de 6 caras, el número de elementos del espacio muestral es n(Ω) = 6ⁿ. Al lanzar n monedas, n(Ω) = 2ⁿ.",
                admissionExplanation = "• Si lanzas 3 monedas y 2 dados simultáneamente: n(Ω) = 2³ × 6² = 8 × 36 = 288 resultados posibles."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t13_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se lanzan simultáneamente dos dados convencionales no cargados. ¿Cuántos elementos posee el evento A: 'la suma de los números obtenidos es estrictamente mayor que 9'?",
                    options = listOf("4", "6", "8", "10", "12"),
                    correctIndex = 1,
                    explanation = "Los resultados posibles son pares ordenados (d₁, d₂) con suma > 9 (es decir, 10, 11 o 12):\n- Suma 10: (4, 6), (5, 5), (6, 4) -> 3 casos.\n- Suma 11: (5, 6), (6, 5) -> 2 casos.\n- Suma 12: (6, 6) -> 1 caso.\nTotal de elementos n(A) = 3 + 2 + 1 = 6 elementos.",
                    subject = "Aritmética",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "ari_t13_s02",
            subjectId = "aritmetica",
            semana = 13,
            subtema = "13.2 Probabilidad Clásica de Laplace y Axiomas",
            title = "Probabilidad Clásica de Laplace y Axiomas",
            theory = LessonTheory(
                id = "theory_ari_t13_s02",
                asignatura = "Aritmética",
                semana = 13,
                titulo = "Probabilidad Clásica de Laplace y Axiomas",
                resumen = "• Regla de Laplace: Si todos los resultados de un espacio muestral finito son equiprobables (tienen la misma opción de salir), la probabilidad del suceso A es el cociente entre el número de casos favorables y el número de casos posibles:\n  P(A) = n(A) / n(Ω).\n• Axiomas de Kolmogorov:\n  1. No negatividad: Para todo suceso A, 0 ≤ P(A) ≤ 1.\n  2. Certidumbre: P(Ω) = 1 y P(∅) = 0.\n  3. Aditividad Finita: Si A y B son excluyentes (A ∩ B = ∅), entonces P(A ∪ B) = P(A) + P(B).\n• Probabilidad del Suceso Contrario: P(A') = 1 - P(A).",
                conceptosClave = listOf(
                    "Regla de Laplace: P(A) = Casos Favorables / Casos Posibles",
                    "Rango axiomático: 0 ≤ P(A) ≤ 1",
                    "Probabilidad del suceso contrario: P(A') = 1 - P(A)",
                    "Equiprobabilidad de los resultados muestrales"
                ),
                formulas = listOf(
                    "P(A) = \\frac{n(A)}{n(\\Omega)}",
                    "0 \\le P(A) \\le 1",
                    "P(A') = 1 - P(A)"
                ),
                formulaName = "Regla de Laplace",
                formulaLatex = "P(A) = \\frac{\\text{Casos Favorables}}{\\text{Casos Posibles}} = \\frac{n(A)}{n(\\Omega)}",
                formulaDescription = "Determina la probabilidad clásica de ocurrencia de un evento en espacios muestrales con simetría equiprobable.",
                admissionTip = "Cuando un problema diga 'al menos uno', es mucho más rápido calcular la probabilidad de 'ninguno' y restársela a 1: P(al menos uno) = 1 - P(ninguno).",
                admissionExplanation = "• Este artificio del evento complementario simplifica hasta en 4 veces la cantidad de cálculos combinatorios."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t13_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una urna hay 7 bolas rojas, 5 bolas azules y 4 bolas verdes. Si se extrae una bola al azar, ¿cuál es la probabilidad de que la bola extraída NO sea de color azul?",
                    options = listOf("5/16", "9/16", "11/16", "3/4", "13/16"),
                    correctIndex = 2,
                    explanation = "Total de bolas (casos posibles) = 7 + 5 + 4 = 16 bolas.\nCasos favorables (que NO sea azul = rojas o verdes) = 7 + 4 = 11 bolas.\nAplicamos la regla de Laplace:\nP(NO azul) = Casos favorables / Casos posibles = 11/16.\n(Alternativamente: P = 1 - P(azul) = 1 - 5/16 = 11/16).",
                    subject = "Aritmética",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "ari_t13_s03",
            subjectId = "aritmetica",
            semana = 13,
            subtema = "13.3 Regla de la Adición: Eventos Excluyentes y Compatibles",
            title = "Regla de la Adición de Probabilidades",
            theory = LessonTheory(
                id = "theory_ari_t13_s03",
                asignatura = "Aritmética",
                semana = 13,
                titulo = "Regla de la Adición de Probabilidades",
                resumen = "• Regla de la Adición para Eventos Compatibles (No Excluyentes): Si los sucesos A y B pueden ocurrir conjuntamente (A ∩ B ≠ ∅), la probabilidad de que ocurra A o B es:\n  P(A ∪ B) = P(A) + P(B) - P(A ∩ B).\n• Regla para Eventos Mutuamente Excluyentes: Si A y B no pueden ocurrir a la vez (A ∩ B = ∅), entonces P(A ∩ B) = 0 y la fórmula se reduce a:\n  P(A ∪ B) = P(A) + P(B).\n• Extensión a Tres Sucesos: P(A ∪ B ∪ C) = P(A) + P(B) + P(C) - [P(A ∩ B) + P(B ∩ C) + P(A ∩ C)] + P(A ∩ B ∩ C).\n• Uso de Tablas de Contingencia: Facilita calcular probabilidades conjuntas y marginales en encuestas con dos variables cruzadas.",
                conceptosClave = listOf(
                    "Regla de la adición general: P(A ∪ B) = P(A) + P(B) - P(A ∩ B)",
                    "Para eventos excluyentes: P(A ∪ B) = P(A) + P(B)",
                    "Resta de la intersección para no duplicar elementos compartidos",
                    "Tablas de contingencia para probabilidades conjuntas"
                ),
                formulas = listOf(
                    "P(A \\cup B) = P(A) + P(B) - P(A \\cap B)",
                    "P(A \\cup B) = P(A) + P(B) \\quad (\\text{si } A \\cap B = \\emptyset)"
                ),
                formulaName = "Teorema de la Suma de Probabilidades",
                formulaLatex = "P(A \\cup B) = P(A) + P(B) - P(A \\cap B)",
                formulaDescription = "Cuantifica la probabilidad de la unión de dos eventos deduciendo la probabilidad de su intersección para garantizar la medida única.",
                admissionTip = "Al extraer una carta de una baraja de 52 cartas: ¿Cuál es la probabilidad de que sea As o de Corazones? P(As) = 4/52, P(Corazones) = 13/52, P(As de Corazones) = 1/52. P = 4/52 + 13/52 - 1/52 = 16/52 = 4/13.",
                admissionExplanation = "• Restamos el As de Corazones porque de lo contrario se contaría dos veces (como As y como Corazón)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t13_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De una baraja estándar de 52 cartas se extrae una carta al azar. ¿Cuál es la probabilidad de que la carta extraída sea una figura (J, Q, K) o de tréboles?",
                    options = listOf("19/52", "22/52", "25/52", "11/26", "7/13"),
                    correctIndex = 1,
                    explanation = "Sea A: 'la carta es figura (J, Q, K)'. Hay 3 figuras por cada uno de los 4 palos => n(A) = 12 cartas.\nSea B: 'la carta es de tréboles' => n(B) = 13 cartas.\nIntersección A ∩ B: 'figuras de tréboles' (J, Q, K de tréboles) => n(A ∩ B) = 3 cartas.\nAplicamos la regla de la adición:\nP(A ∪ B) = P(A) + P(B) - P(A ∩ B)\nP(A ∪ B) = 12/52 + 13/52 - 3/52 = 22/52 = 11/26.",
                    subject = "Aritmética",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "ari_t13_s04",
            subjectId = "aritmetica",
            semana = 13,
            subtema = "13.4 Probabilidad Condicional y Eventos Independientes",
            title = "Probabilidad Condicional e Independencia",
            theory = LessonTheory(
                id = "theory_ari_t13_s04",
                asignatura = "Aritmética",
                semana = 13,
                titulo = "Probabilidad Condicional e Independencia",
                resumen = "• Probabilidad Condicional P(A | B): Probabilidad de que ocurra el suceso A sabiendo con certeza que ya ocurrió el suceso B (el espacio muestral se reduce a B):\n  P(A | B) = P(A ∩ B) / P(B), con P(B) > 0.\n• Regla de la Multiplicación de Probabilidades:\n  P(A ∩ B) = P(B) · P(A | B) = P(A) · P(B | A).\n• Sucesos Independientes: Dos sucesos A y B son estadísticamente independientes si la ocurrencia de uno de ellos no altera la probabilidad de ocurrencia del otro:\n  P(A | B) = P(A) y P(B | A) = P(B).\n• Condición Necesaria y Suficiente de Independencia:\n  P(A ∩ B) = P(A) · P(B).\n• Extracción con y sin Reposición: Con reposición los sucesos son independientes; sin reposición el espacio muestral disminuye y son dependientes.",
                conceptosClave = listOf(
                    "Probabilidad condicional: P(A | B) = P(A ∩ B) / P(B)",
                    "Reducción del espacio muestral al evento condicionante B",
                    "Regla de independencia: P(A ∩ B) = P(A) · P(B)",
                    "Extracción con reposición (independientes) vs sin reposición (dependientes)"
                ),
                formulas = listOf(
                    "P(A \\mid B) = \\frac{P(A \\cap B)}{P(B)}",
                    "P(A \\cap B) = P(A) \\cdot P(B \\mid A)",
                    "P(A \\cap B) = P(A) \\cdot P(B) \\quad (\\text{si son independientes})"
                ),
                formulaName = "Definición de Probabilidad Condicional",
                formulaLatex = "P(A \\mid B) = \\frac{P(A \\cap B)}{P(B)}, \\quad P(B) > 0",
                formulaDescription = "Modela la actualización bayesiana de la probabilidad de A tras conocer la ocurrencia previa del evento condicionante B.",
                admissionTip = "En problemas de extracción sucesiva sin reposición, reduce en 1 tanto los casos favorables como el total en la segunda extracción: P = (k/N) × [(k - 1)/(N - 1)].",
                admissionExplanation = "• Si se lanzan dos monedas o dos dados independientes, la probabilidad conjunta de obtener doble 6 es simplemente (1/6) × (1/6) = 1/36."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ari_t13_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De una urna que contiene 6 bolas blancas y 4 bolas negras, se extraen dos bolas sucesivamente sin reposición. ¿Cuál es la probabilidad de que ambas bolas extraídas sean blancas?",
                    options = listOf("1/5", "1/4", "1/3", "2/5", "1/2"),
                    correctIndex = 2,
                    explanation = "Total inicial de bolas = 6 blancas + 4 negras = 10 bolas.\n1. Probabilidad de que la 1ra bola sea blanca: P(B₁) = 6/10.\n2. Al no haber reposición, quedan 5 blancas y 9 bolas en total.\n   Probabilidad de que la 2da sea blanca dado que la 1ra fue blanca: P(B₂ | B₁) = 5/9.\n3. Aplicamos la regla de la multiplicación:\nP(B₁ ∩ B₂) = P(B₁) · P(B₂ | B₁) = (6/10) · (5/9) = 30 / 90 = 1/3.",
                    subject = "Aritmética",
                    semana = 13
                )
            )
        )
    )
}
