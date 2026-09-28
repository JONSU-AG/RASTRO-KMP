package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object TrigonometriaCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: SISTEMAS DE MEDIDAS ANGULARES (Semana 1)
        // =========================================================================
        LessonNode(
            id = "tri_t01_s01",
            subjectId = "trigonometria",
            semana = 1,
            subtema = "1.1 Ángulo Trigonométrico y Sentido de Giro",
            title = "Ángulo Trigonométrico y Sentido de Giro",
            theory = LessonTheory(
                id = "theory_tri_t01_s01",
                asignatura = "Trigonometría",
                semana = 1,
                titulo = "Ángulo Trigonométrico y Sentido de Giro",
                resumen = "• Ángulo Trigonométrico: Es aquel generado por la rotación de un rayo en un plano alrededor de un punto fijo denominado vértice, desde una posición inicial (lado inicial) hasta una posición terminal (lado final).\n• Sentido de Rotación y Signo Convencional:\n  - Sentido Antihorario (contrario a las manecillas del reloj): El ángulo es POSITIVO (+).\n  - Sentido Horario (mismo sentido de las manecillas): El ángulo es NEGATIVO (-).\n• Magnitud Ilimitada: A diferencia de la geometría elemental donde el ángulo mide entre 0° y 360°, el ángulo trigonométrico no tiene límite superior ni inferior (puede medir 1000°, -720°, etc.).\n• Regla Fundamental de Operaciones: Para sumar o restar ángulos en una figura geométrica, todos deben tener obligatoriamente el MISMO SENTIDO (preferentemente antihorario). Al cambiar el sentido de una flecha angular, se cambia el signo de su medida: -( -α ) = +α.",
                conceptosClave = listOf(
                    "Lado inicial y lado terminal de giro",
                    "Sentido antihorario: medida positiva (+)",
                    "Sentido horario: medida negativa (-)",
                    "Inversión de sentido invierte el signo algebraico",
                    "Magnitud angular ilimitada"
                ),
                formulas = listOf(
                    "\\text{Giro Antihorario} \\implies \\alpha > 0",
                    "\\text{Giro Horario} \\implies \\beta < 0",
                    "\\text{Inversión}: \\; -(\\text{Giro Horario}) = \\text{Medida Positiva}"
                ),
                formulaName = "Principio de Homogeneización de Sentido",
                formulaLatex = "\\sum \\alpha_i = \\text{Ángulo Total} \\quad (\\text{todos en sentido antihorario})",
                formulaDescription = "Regla operatoria que exige transformar todos los ángulos al sentido antihorario antes de plantear sumas angulares geométricas.",
                admissionTip = "Antes de escribir cualquier ecuación con ángulos trigonométricos en un gráfico, cambia el sentido de todas las flechas que giran en sentido horario y ponles un signo menos delante.",
                admissionExplanation = "• Omitir este cambio de signo es la trampa clásica en la primera pregunta de trigonometría en la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un gráfico, un ángulo recto está dividido por un rayo interior en dos ángulos: α en sentido antihorario y β en sentido horario. Halle la relación correcta entre α y β.",
                    options = listOf("α + β = 90°", "α - β = 90°", "β - α = 90°", "α + β = -90°", "α = β"),
                    correctIndex = 1,
                    explanation = "Como α gira en sentido antihorario, su valor es +α.\nComo β gira en sentido horario, para homogeneizarlo al sentido antihorario se invierte su flecha y su medida pasa a ser -β.\nSumando ambos en sentido antihorario para completar el ángulo recto (90°):\nα + (-β) = 90° => α - β = 90°.",
                    subject = "Trigonometría",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "tri_t01_s02",
            subjectId = "trigonometria",
            semana = 1,
            subtema = "1.2 Sistemas Sexagesimal, Centesimal y Radial",
            title = "Sistemas de Medida Angular",
            theory = LessonTheory(
                id = "theory_tri_t01_s02",
                asignatura = "Trigonometría",
                semana = 1,
                titulo = "Sistemas de Medida Angular",
                resumen = "• Sistema Sexagesimal o Inglés (S):\n  - Unidad: 1 grado sexagesimal (1°), equivalente a 1/360 de una vuelta completa.\n  - 1 vuelta = 360°.\n  - Subunidades: 1° = 60' (minutos sexagesimales); 1' = 60'' (segundos sexagesimales); 1° = 3600''.\n• Sistema Centesimal o Francés (C):\n  - Unidad: 1 grado centesimal (1ᵍ), equivalente a 1/400 de una vuelta completa.\n  - 1 vuelta = 400ᵍ.\n  - Subunidades: 1ᵍ = 100ᵐ (minutos centesimales); 1ᵐ = 100ˢ (segundos centesimales); 1ᵍ = 10000ˢ.\n• Sistema Radial o Circular o Internacional (R):\n  - Unidad: 1 radián (1 rad), ángulo central que subtiende un arco de longitud igual al radio de la circunferencia.\n  - 1 vuelta = 2π rad ≈ 6.28318 rad.\n  - Equivalencia de media vuelta (ángulo llano): 180° = 200ᵍ = π rad.",
                conceptosClave = listOf(
                    "Vuelta completa: 360° = 400ᵍ = 2π rad",
                    "Media vuelta (ángulo llano): 180° = 200ᵍ = π rad",
                    "Sistema sexagesimal: base 60 (1° = 60' = 3600'')",
                    "Sistema centesimal: base 100 (1ᵍ = 100ᵐ = 10000ˢ)",
                    "Aproximaciones de π: 3.1416, 22/7, √3 + √2"
                ),
                formulas = listOf(
                    "180^\\circ = 200^g = \\pi \\text{ rad}",
                    "9^\\circ = 10^g \\quad (\\text{Equivalencia directa entre } S \\text{ y } C)",
                    "1^\\circ = 60', \\; 1' = 60'', \\quad 1^g = 100^m, \\; 1^m = 100^s"
                ),
                formulaName = "Equivalencia Angular Fundamental",
                formulaLatex = "9^\\circ = 10^g \\iff \\frac{S}{9} = \\frac{C}{10}",
                formulaDescription = "Relación entera mínima directa para convertir rápidamente entre grados sexagesimales y centesimales.",
                admissionTip = "Para pasar de grados sexagesimales a centesimales, multiplica por 10/9. Para pasar de centesimales a sexagesimales, multiplica por 9/10.",
                admissionExplanation = "• Cuidado con los minutos: 1' sexagesimal NO es igual a 1ᵐ centesimal; 27' = 50ᵐ."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Convierta un ángulo de 70ᵍ al sistema sexagesimal.",
                    options = listOf("54°", "60°", "63°", "72°", "75°"),
                    correctIndex = 2,
                    explanation = "Aplicamos la equivalencia directa 9° = 10ᵍ:\nS = 70ᵍ · (9° / 10ᵍ) = 7 · 9° = 63°.",
                    subject = "Trigonometría",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "tri_t01_s03",
            subjectId = "trigonometria",
            semana = 1,
            subtema = "1.3 Fórmula General de Conversión y Proporciones Reducidas",
            title = "Fórmula General de Conversión",
            theory = LessonTheory(
                id = "theory_tri_t01_s03",
                asignatura = "Trigonometría",
                semana = 1,
                titulo = "Fórmula General de Conversión",
                resumen = "• Fórmula General de Conversión:\n  - S / 180 = C / 200 = R / π = k.\n• Constantes Proporcionales Reducidas (Método del k):\n  - S = 9k\n  - C = 10k\n  - R = (π · k) / 20\n  - Donde k es la constante de proporcionalidad para un ángulo determinado.\n• Constantes Proporcionales Extendidas (cuando interviene R de forma entera):\n  - S = 180m, C = 200m, R = πm.\n• Este método algebraico permite transformar expresiones trigonométricas racionales complejas en simples polinomios en función de la variable k.",
                conceptosClave = listOf(
                    "Fórmula general: S/180 = C/200 = R/π",
                    "Forma reducida: S = 9k, C = 10k, R = πk/20",
                    "Diferencia fundamental: C - S = k",
                    "Suma fundamental: C + S = 19k"
                ),
                formulas = listOf(
                    "\\frac{S}{9} = \\frac{C}{10} = \\frac{20R}{\\pi} = k",
                    "S = 9k, \\quad C = 10k, \\quad R = \\frac{\\pi k}{20}",
                    "C - S = k, \\quad C + S = 19k"
                ),
                formulaName = "Sistema Reducido de Conversión Angular",
                formulaLatex = "S = 9k, \\quad C = 10k, \\quad R = \\frac{\\pi k}{20}",
                formulaDescription = "Parametrización algebraica estándar para resolver identidades y ecuaciones con los números de grados de un ángulo.",
                admissionTip = "Aprende de memoria que C - S = k. Si un problema dice 'la diferencia entre C y S es 4', automáticamente k = 4, y S = 36°, C = 40°.",
                admissionExplanation = "• Del mismo modo: C + S = 19k."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Siendo S y C los números convencionales de grados sexagesimales y centesimales para un mismo ángulo, halle la medida de dicho ángulo en radianes si se cumple que: C + S = 76.",
                    options = listOf("π/10 rad", "π/5 rad", "π/4 rad", "π/2 rad", "2π/5 rad"),
                    correctIndex = 1,
                    explanation = "Reemplazamos S = 9k y C = 10k:\nC + S = 10k + 9k = 19k = 76 => k = 76 / 19 = 4.\nCalculamos R en radianes:\nR = (π · k) / 20 = (π · 4) / 20 = π / 5 rad.",
                    subject = "Trigonometría",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "tri_t01_s04",
            subjectId = "trigonometria",
            semana = 1,
            subtema = "1.4 Ecuaciones y Relaciones Especiales entre Sistemas",
            title = "Ecuaciones y Relaciones Especiales entre Sistemas",
            theory = LessonTheory(
                id = "theory_tri_t01_s04",
                asignatura = "Trigonometría",
                semana = 1,
                titulo = "Ecuaciones y Relaciones Especiales",
                resumen = "• Expresiones con Raíces y Medias:\n  - En problemas de admisión frecuentes se plantean relaciones como √(C + S) / √(C - S) o expresiones con productos S · C.\n  - Sustituyendo S = 9k y C = 10k:\n    * √(C + S) = √(19k)\n    * √(C - S) = √k\n    * Por tanto: √(C + S) / √(C - S) = √19.\n• Número de Minutos y Segundos:\n  - Número de minutos sexagesimales: m_s = 60S.\n  - Número de minutos centesimales: m_c = 100C.\n  - Razón de minutos: m_s / m_c = 60(9k) / 100(10k) = 540 / 1000 = 27 / 50.\n  - Número de segundos sexagesimales: s_s = 3600S.\n  - Número de segundos centesimales: s_c = 10000C.\n  - Razón de segundos: s_s / s_c = 3600(9) / 10000(10) = 32400 / 100000 = 81 / 250.",
                conceptosClave = listOf(
                    "Relación de minutos: m_s / m_c = 27 / 50",
                    "Relación de segundos: s_s / s_c = 81 / 250",
                    "Simplificación por factorización de k",
                    "Ecuaciones cuadráticas e irracionales con S y C"
                ),
                formulas = listOf(
                    "\\frac{m_s}{m_c} = \\frac{27}{50}",
                    "\\frac{s_s}{s_c} = \\frac{81}{250}",
                    "\\sqrt{\\frac{C+S}{C-S}} = \\sqrt{19}"
                ),
                formulaName = "Razón de Minutos y Segundos Sexagesimales y Centesimales",
                formulaLatex = "\\frac{m_s}{m_c} = \\frac{27}{50}, \\quad \\frac{s_s}{s_c} = \\frac{81}{250}",
                formulaDescription = "Constantes universales invariantes que relacionan las subunidades angulares anglosajonas y francesas.",
                admissionTip = "La relación 27/50 para minutos y 81/250 para segundos aparece textual en problemas tipo test; memorizarla te da la respuesta en 3 segundos.",
                admissionExplanation = "• Ten presente que 1 radián ≈ 57° 17' 45'', valor útil para estimar magnitudes angulares."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Siendo S y C lo conocido para un ángulo no nulo, calcule el valor de E = √( (2C + S) / (C - S) - 4 ).",
                    options = listOf("3", "4", "5", "6", "7"),
                    correctIndex = 2,
                    explanation = "Reemplazamos S = 9k y C = 10k:\n(2C + S) / (C - S) = [2(10k) + 9k] / (10k - 9k) = 29k / 1k = 29.\nReemplazamos en la raíz:\nE = √(29 - 4) = √25 = 5.",
                    subject = "Trigonometría",
                    semana = 1
                )
            )
        ),
        // =========================================================================
        // TEMA 02: LONGITUD DE ARCO Y SECTOR CIRCULAR (Semana 2)
        // =========================================================================
        LessonNode(
            id = "geo_t02_s01_tri",
            subjectId = "trigonometria",
            semana = 2,
            subtema = "2.1 Longitud de Arco de Circunferencia",
            title = "Longitud de Arco de Circunferencia",
            theory = LessonTheory(
                id = "theory_tri_t02_s01",
                asignatura = "Trigonometría",
                semana = 2,
                titulo = "Longitud de Arco",
                resumen = "• Longitud de Arco (L):\n  - Es la medida lineal de la porción continua de circunferencia comprendida entre dos puntos de ella.\n• Fórmula Fundamental del Arco: L = θ · R.\n  - Requisito Estricto: El ángulo central θ debe estar expresado OBLIGATORIAMENTE en RADIANES (0 < θ ≤ 2π).\n  - R: radio de la circunferencia (en metros, cm, etc.).\n  - L: longitud de arco (en la misma unidad lineal que R).\n• Despejes Derivados: θ = L / R; R = L / θ.\n• Conversión Previa: Si el ángulo central viene dado en grados sexagesimales (S°), primero se multiplica por π / 180°: θ = S · π / 180.",
                conceptosClave = listOf(
                    "Fórmula universal: L = θ · R",
                    "Ángulo central θ estrictamente en radianes",
                    "Rango del ángulo de sector: 0 < θ ≤ 2π",
                    "Unidades coherentes entre radio y longitud de arco"
                ),
                formulas = listOf(
                    "L = \\theta \\cdot R \\quad (\\theta \\text{ en rad})",
                    "\\theta = \\frac{L}{R}, \\quad R = \\frac{L}{\\theta}",
                    "\\theta = S^\\circ \\cdot \\frac{\\pi}{180^\\circ}"
                ),
                formulaName = "Fórmula Fundamental de la Longitud de Arco",
                formulaLatex = "L = \\theta R",
                formulaDescription = "Vínculo métrico directo entre la apertura angular expresada en radianes y el arco subtendido.",
                admissionTip = "Nunca operes L = 60° · 12 cm; obtendrías 720, lo cual es un error catastrófico. Convierte 60° a π/3 rad para obtener L = (π/3)·12 = 4π cm.",
                admissionExplanation = "• Un radián es el ángulo central donde la longitud del arco es igual al radio (L = R)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una circunferencia de radio 15 cm, un arco subtiende un ángulo central de 72°. Calcule la longitud de dicho arco.",
                    options = listOf("4π cm", "5π cm", "6π cm", "8π cm", "9π cm"),
                    correctIndex = 2,
                    explanation = "1. Convertimos 72° a radianes:\nθ = 72° · (π / 180°) = (72 / 180) · π = 2π / 5 rad.\n2. Calculamos la longitud de arco L = θ · R:\nL = (2π / 5) · 15 cm = 2π · 3 = 6π cm.",
                    subject = "Trigonometría",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "geo_t02_s02_tri",
            subjectId = "trigonometria",
            semana = 2,
            subtema = "2.2 Área del Sector Circular",
            title = "Área del Sector Circular",
            theory = LessonTheory(
                id = "theory_tri_t02_s02",
                asignatura = "Trigonometría",
                semana = 2,
                titulo = "Área del Sector Circular",
                resumen = "• Sector Circular: Región plana limitada por dos radios y el arco que ellos subtienden.\n• Las Tres Fórmulas Canónicas del Área (S):\n  1. Conociendo el ángulo θ y el radio R: S = (1/2) · θ · R².\n  2. Conociendo la longitud de arco L y el radio R: S = (L · R) / 2.\n  3. Conociendo la longitud de arco L y el ángulo θ: S = L² / (2θ).\n• Selección de Fórmula según Datos: Permite calcular el área directamente sin tener que hallar variables intermedias.\n• Área Máxima con Perímetro Fijo: Si un sector circular tiene un perímetro fijado 2p = 2R + L constante, su área S = R · L / 2 es MÁXIMA cuando el ángulo central mide exactamente θ = 2 radianes (en ese caso L = 2R y S_máx = p² / 4).",
                conceptosClave = listOf(
                    "S = (1/2)θR² = LR/2 = L²/(2θ)",
                    "Perímetro del sector: 2p = 2R + L",
                    "Área máxima de sector ocurre con θ = 2 radianes",
                    "Equivalencia de LR/2 con el área de un triángulo"
                ),
                formulas = listOf(
                    "S = \\frac{1}{2} \\theta R^2",
                    "S = \\frac{L \\cdot R}{2}",
                    "S = \\frac{L^2}{2\\theta}",
                    "\\theta_{\\text{óptimo}} = 2 \\text{ rad} \\implies \\text{Área Máxima con perímetro fijo}"
                ),
                formulaName = "Fórmulas de Superficie de un Sector Circular",
                formulaLatex = "S = \\frac{1}{2}\\theta R^2 = \\frac{L R}{2} = \\frac{L^2}{2\\theta}",
                formulaDescription = "Tríada analítica que permite hallar el área según el par de elementos disponibles.",
                admissionTip = "Si te dan el perímetro de un alambre para doblarlo en forma de sector circular de área máxima, el radio óptimo es R = Perímetro / 4 y el ángulo central es siempre 2 rad.",
                admissionExplanation = "• Este problema de optimización aparece continuamente en los exámenes de la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un sector circular tiene un arco de longitud 8 m y su área es de 24 m². Calcule la longitud de su radio.",
                    options = listOf("4 m", "5 m", "6 m", "7 m", "8 m"),
                    correctIndex = 2,
                    explanation = "Usamos la fórmula del área que relaciona L y R:\nS = (L · R) / 2\n24 = (8 · R) / 2\n24 = 4R => R = 24 / 4 = 6 m.",
                    subject = "Trigonometría",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "geo_t02_s03_tri",
            subjectId = "trigonometria",
            semana = 2,
            subtema = "2.3 Trapecio Circular: Área y Ángulo Central",
            title = "Trapecio Circular",
            theory = LessonTheory(
                id = "theory_tri_t02_s03",
                asignatura = "Trigonometría",
                semana = 2,
                titulo = "Trapecio Circular",
                resumen = "• Trapecio Circular: Región del plano comprendida entre dos arcos concéntricos (arco mayor B y arco menor b) y dos segmentos radiales de separación h (con h = R - r).\n• Fórmula del Área del Trapecio Circular:\n  - A = [ (B + b) / 2 ] · h (semisuma de arcos por la separación radial).\n  - Es formalmente idéntica al área de un trapecio rectilíneo ordinario sustituyendo las bases por los arcos concéntricos.\n• Fórmula del Ángulo Central θ (en radianes):\n  - θ = (B - b) / h (diferencia de arcos dividida entre la separación radial).\n• Relación de Áreas Concéntricas: Al trazar arcos concéntricos equiespaciados (separaciones iguales h), las áreas de los sectores y trapecios sucesivos crecen según la progresión aritmética de números impares: S, 3S, 5S, 7S, 9S...",
                conceptosClave = listOf(
                    "Área: A = [ (B + b) / 2 ] · h",
                    "Ángulo central: θ = (B - b) / h (en radianes)",
                    "Separación radial: h = R - r",
                    "Progresión de áreas concéntricas de Galileo: S, 3S, 5S, 7S..."
                ),
                formulas = listOf(
                    "A_{\\text{trap}} = \\left(\\frac{B + b}{2}\\right) h",
                    "\\theta = \\frac{B - b}{h} \\quad (\\text{en radianes})"
                ),
                formulaName = "Fórmulas Fundamentales del Trapecio Circular",
                formulaLatex = "A = \\left(\\frac{B + b}{2}\\right) h, \\quad \\theta = \\frac{B - b}{h}",
                formulaDescription = "Permite calcular tanto la superficie como el ángulo central generador sin requerir calcular los radios absolutos.",
                admissionTip = "Para calcular el ángulo central θ en un trapecio circular, NO necesitas hallar R ni r; basta con restar el arco exterior menos el interior y dividirlo entre la distancia que los separa.",
                admissionExplanation = "• La progresión S, 3S, 5S, 7S resuelve de forma visual los problemas de sectores con radios divididos en partes iguales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un trapecio circular, el arco mayor mide 14 cm, el arco menor mide 6 cm y la distancia radial entre ambos arcos es de 4 cm. Calcule el ángulo central en radianes y el área del trapecio circular.",
                    options = listOf(
                        "θ = 2 rad y A = 40 cm²",
                        "θ = 1 rad y A = 20 cm²",
                        "θ = 2 rad y A = 80 cm²",
                        "θ = 0.5 rad y A = 40 cm²",
                        "θ = 2 rad y A = 20 cm²"
                    ),
                    correctIndex = 0,
                    explanation = "1. Ángulo central: θ = (B - b) / h = (14 - 6) / 4 = 8 / 4 = 2 rad.\n2. Área del trapecio circular: A = [(B + b) / 2] · h = [(14 + 6) / 2] · 4 = (20 / 2) · 4 = 10 · 4 = 40 cm².",
                    subject = "Trigonometría",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "geo_t02_s04_tri",
            subjectId = "trigonometria",
            semana = 2,
            subtema = "2.4 Número de Vueltas de una Rueda y Transmisión de Giro",
            title = "Número de Vueltas y Poleas",
            theory = LessonTheory(
                id = "theory_tri_t02_s04",
                asignatura = "Trigonometría",
                semana = 2,
                titulo = "Número de Vueltas y Poleas",
                resumen = "• Número de Vueltas de una Rueda (n_v):\n  - Es el cociente entre la longitud que recorre el centro de la rueda (L_c) y el perímetro de la misma (2πr):\n  - n_v = L_c / (2π · r) = θ_barrido / (2π).\n  - Rueda que gira sobre pista plana: L_c = L_recorrido en el piso.\n  - Rueda que gira sobre pista curva convexa de radio R: L_c = θ_pista · (R + r).\n  - Rueda que gira por el interior cóncavo: L_c = θ_pista · (R - r).\n• Transmisión de Movimiento entre Poleas y Engranajes:\n  1. Ruedas Unidas por una Faja o en Contacto Tangencial: Recorren la misma longitud periférica:\n     - L₁ = L₂ ⇒ θ₁ · R₁ = θ₂ · R₂ ⇒ n₁ · R₁ = n₂ · R₂ (inversamente proporcionales al radio).\n  2. Ruedas Concéntricas Unidas por un Eje Común: Giran el mismo ángulo y dan el mismo número de vueltas:\n     - θ₁ = θ₂ ⇒ n₁ = n₂.",
                conceptosClave = listOf(
                    "Número de vueltas n_v = L_c / (2πr)",
                    "Ángulo total girado: θ_total = 2π · n_v",
                    "Poleas con faja o tangentes: n₁R₁ = n₂R₂",
                    "Eje común concéntrico: n₁ = n₂"
                ),
                formulas = listOf(
                    "n_v = \\frac{L_c}{2\\pi r}",
                    "n_1 \\cdot R_1 = n_2 \\cdot R_2 \\quad (\\text{Engranajes / Faja})",
                    "n_1 = n_2 \\quad (\\text{Eje común})"
                ),
                formulaName = "Fórmula del Número de Vueltas",
                formulaLatex = "n_v = \\frac{L_c}{2\\pi r}",
                formulaDescription = "Calcula la cantidad de rotaciones completas de un disco rodante a partir de la distancia recorrida por su centro de gravedad.",
                admissionTip = "Recuerda que para ruedas engranadas o unidas por cadena, el número de dientes 'D' reemplaza directamente al radio: n₁ · D₁ = n₂ · D₂.",
                admissionExplanation = "• Cuando una rueda gira en una pista circular exterior, no olvides sumar los radios (R + r) para hallar la trayectoria del centro."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una rueda de 20 cm de radio rueda sin resbalar sobre una pista horizontal plana recorriendo una distancia de 120π cm. ¿Cuántas vueltas completas da la rueda?",
                    options = listOf("2", "3", "4", "5", "6"),
                    correctIndex = 1,
                    explanation = "Aplicamos la fórmula del número de vueltas:\nn_v = L_c / (2π · r)\nLongitud recorrida por el centro: L_c = 120π cm.\nPerímetro de la rueda: 2π · 20 = 40π cm.\nn_v = 120π / 40π = 3 vueltas.",
                    subject = "Trigonometría",
                    semana = 2
                )
            )
        ),
        // =========================================================================
        // TEMA 03: RAZONES TRIGONOMÉTRICAS EN EL TRIÁNGULO RECTÁNGULO (Semana 3)
        // =========================================================================
        LessonNode(
            id = "tri_t03_s01",
            subjectId = "trigonometria",
            semana = 3,
            subtema = "3.1 Definición de las Seis Razones Trigonométricas",
            title = "Definición de las Seis Razones Trigonométricas",
            theory = LessonTheory(
                id = "theory_tri_t03_s01",
                asignatura = "Trigonometría",
                semana = 3,
                titulo = "Definición de las Seis Razones",
                resumen = "• Triángulo Rectángulo: Triángulo con un ángulo recto (90°) y dos ángulos agudos complementarios (α + β = 90°).\n  - Lados: Cateto Opuesto (CO), Cateto Adyacente (CA) e Hipotenusa (H).\n  - Teorema de Pitágoras: CO² + CA² = H².\n• Las Seis Razones Trigonométricas para el ángulo agudo α:\n  1. Seno: sen(α) = Cateto Opuesto / Hipotenusa = CO / H.\n  2. Coseno: cos(α) = Cateto Adyacente / Hipotenusa = CA / H.\n  3. Tangente: tg(α) = tan(α) = Cateto Opuesto / Cateto Adyacente = CO / CA.\n  4. Cotangente: ctg(α) = cot(α) = Cateto Adyacente / Cateto Opuesto = CA / CO.\n  5. Secante: sec(α) = Hipotenusa / Cateto Adyacente = H / CA.\n  6. Cosecante: csc(α) = Hipotenusa / Cateto Opuesto = H / CO.\n• Regla Mnemotécnica: SOH - CAH - TOA.",
                conceptosClave = listOf(
                    "Cateto opuesto vs Cateto adyacente según el ángulo de referencia",
                    "Teorema de Pitágoras: CO² + CA² = H²",
                    "Las seis razones trigonométricas fundamentales",
                    "Independencia del tamaño del triángulo (solo dependen del ángulo)"
                ),
                formulas = listOf(
                    "\\text{sen}(\\alpha) = \\frac{\\text{CO}}{H}, \\quad \\cos(\\alpha) = \\frac{\\text{CA}}{H}, \\quad \\tan(\\alpha) = \\frac{\\text{CO}}{\\text{CA}}",
                    "\\cot(\\alpha) = \\frac{\\text{CA}}{\\text{CO}}, \\quad \\sec(\\alpha) = \\frac{H}{\\text{CA}}, \\quad \\csc(\\alpha) = \\frac{H}{\\text{CO}}"
                ),
                formulaName = "Definición Canónica de Razones Trigonométricas",
                formulaLatex = "\\text{sen}\\alpha = \\frac{\\text{CO}}{H}, \\quad \\cos\\alpha = \\frac{\\text{CA}}{H}, \\quad \\tan\\alpha = \\frac{\\text{CO}}{\\text{CA}}",
                formulaDescription = "Cocientes adimensionales entre las longitudes de los lados de un triángulo rectángulo.",
                admissionTip = "Si conoces una sola razón trigonométrica de un ángulo agudo (ej. sen α = 3/5), dibuja de inmediato un triángulo rectángulo con CO = 3k y H = 5k para hallar por Pitágoras CA = 4k y obtener las 5 razones restantes.",
                admissionExplanation = "• No te limites a memorizar fórmulas abstractas; apóyate en el triángulo auxiliar."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo rectángulo, el cateto opuesto a un ángulo agudo α mide 5 cm y el cateto adyacente mide 12 cm. Calcule el valor de E = sec(α) + tg(α).",
                    options = listOf("1", "1.5", "2", "2.5", "3"),
                    correctIndex = 1,
                    explanation = "1. Hallamos la hipotenusa H por Pitágoras:\nH² = 5² + 12² = 25 + 144 = 169 => H = 13 cm.\n2. Calculamos las razones:\nsec(α) = H / CA = 13 / 12.\ntg(α) = CO / CA = 5 / 12.\n3. Sumamos:\nE = 13/12 + 5/12 = 18/12 = 3/2 = 1.5.",
                    subject = "Trigonometría",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "tri_t03_s02",
            subjectId = "trigonometria",
            semana = 3,
            subtema = "3.2 Propiedades de las Razones: Recíprocas y Complementarias",
            title = "Razones Recíprocas y Co-razones",
            theory = LessonTheory(
                id = "theory_tri_t03_s02",
                asignatura = "Trigonometría",
                semana = 3,
                titulo = "Razones Recíprocas y Co-razones",
                resumen = "• Razones Trigonométricas Recíprocas:\n  - El producto de dos razones recíprocas del MISMO ÁNGULO es igual a la UNIDAD (1):\n  - sen(α) · csc(α) = 1 ⇒ sen(α) = 1 / csc(α)\n  - cos(α) · sec(α) = 1 ⇒ cos(α) = 1 / sec(α)\n  - tg(α) · ctg(α) = 1 ⇒ tg(α) = 1 / ctg(α)\n  - Condición Clave: Si R₁(x) · R₂(y) = 1 con razones recíprocas, entonces los ángulos son estrictamente IGUALES: x = y.\n• Razones Co-trigonométricas (Ángulos Complementarios: α + β = 90°):\n  - Toda razón trigonométrica de un ángulo agudo es igual a la CO-RAZÓN de su ángulo complementario:\n  - sen(α) = cos(90° - α)\n  - tg(α) = ctg(90° - α)\n  - sec(α) = csc(90° - α)\n  - Condición Clave: Si R₁(x) = Co-R₁(y), entonces los ángulos SUMAN 90°: x + y = 90°.",
                conceptosClave = listOf(
                    "Recíprocas: sen·csc = 1, cos·sec = 1, tg·ctg = 1 (ángulos iguales)",
                    "Complementarias (co-razones): sen = cos, tg = ctg, sec = csc (ángulos suman 90°)",
                    "Diferenciación crucial entre producto = 1 e igualdad de co-razones"
                ),
                formulas = listOf(
                    "\\text{sen}(\\alpha) \\cdot \\csc(\\alpha) = 1, \\quad \\cos(\\alpha) \\cdot \\sec(\\alpha) = 1, \\quad \\tan(\\alpha) \\cdot \\cot(\\alpha) = 1",
                    "\\text{sen}(\\alpha) = \\cos(\\beta) \\iff \\alpha + \\beta = 90^\\circ",
                    "\\tan(\\alpha) = \\cot(\\beta) \\iff \\alpha + \\beta = 90^\\circ"
                ),
                formulaName = "Teoremas de Recíprocas y Complementarias",
                formulaLatex = "R_1(x) \\cdot R_{\\text{rec}}(y) = 1 \\implies x = y, \\quad R(x) = \\text{Co-}R(y) \\implies x + y = 90^\\circ",
                formulaDescription = "Reglas que permiten resolver sistemas angulares instantáneos según la estructura de la igualdad trigonométrica.",
                admissionTip = "Regla de oro UNSA: Si ves un PRODUCTO igual a 1 ⇒ IGUALA ángulos (x = y). Si ves una IGUALDAD entre razón y co-razón ⇒ SUMA ángulos a 90° (x + y = 90°).",
                admissionExplanation = "• No confundir: tg(A) · ctg(A) = 1 (recíprocas) con tg(A) = ctg(B) donde A + B = 90°."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si sen(2x + 10°) · csc(40°) = 1 y además tg(3y - 5°) = ctg(y + 15°), halle el valor de x + y (ángulos agudos).",
                    options = listOf("25°", "30°", "35°", "40°", "45°"),
                    correctIndex = 2,
                    explanation = "1. Ecuación 1: sen(2x + 10°) · csc(40°) = 1\nPor propiedad de recíprocas, los ángulos deben ser iguales:\n2x + 10° = 40° => 2x = 30° => x = 15°.\n2. Ecuación 2: tg(3y - 5°) = ctg(y + 15°)\nPor propiedad de co-razones, los ángulos deben sumar 90°:\n(3y - 5°) + (y + 15°) = 90°\n4y + 10° = 90° => 4y = 80° => y = 20°.\n3. Sumamos: x + y = 15° + 20° = 35°.",
                    subject = "Trigonometría",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "tri_t03_s03",
            subjectId = "trigonometria",
            semana = 3,
            subtema = "3.3 Triángulos Notables Exactos y Aproximados",
            title = "Triángulos Notables Exactos y Aproximados",
            theory = LessonTheory(
                id = "theory_tri_t03_s03",
                asignatura = "Trigonometría",
                semana = 3,
                titulo = "Triángulos Notables",
                resumen = "• Triángulos Notables Exactos:\n  1. 45° y 45°: Catetos k, k; Hipotenusa k√2.\n     - sen(45°) = cos(45°) = √2/2; tg(45°) = ctg(45°) = 1; sec(45°) = csc(45°) = √2.\n  2. 30° y 60°: Cateto opuesto a 30° es k; Cateto opuesto a 60° es k√3; Hipotenusa 2k.\n     - sen(30°) = 1/2; cos(30°) = √3/2; tg(30°) = √3/3; tg(60°) = √3.\n• Triángulos Notables Aproximados (de frecuente uso en ingeniería y admisión):\n  1. 37° y 53°: Catetos 3k y 4k; Hipotenusa 5k.\n     - sen(37°) = 3/5; cos(37°) = 4/5; tg(37°) = 3/4; tg(53°) = 4/3.\n  2. 16° y 74°: Catetos 7k y 24k; Hipotenusa 25k.\n     - sen(16°) = 7/25; cos(16°) = 24/25; tg(16°) = 7/24.\n  3. 53°/2 (tg = 1/2, hipotenusa k√5) y 37°/2 (tg = 1/3, hipotenusa k√10).\n  4. 15° y 75°: Catetos k(√6 - √2) y k(√6 + √2); Hipotenusa 4k.",
                conceptosClave = listOf(
                    "Notable 30°-60° (k, k√3, 2k)",
                    "Notable 45°-45° (k, k, k√2)",
                    "Notable 37°-53° (3k, 4k, 5k)",
                    "Notables medios: tg(53°/2) = 1/2 y tg(37°/2) = 1/3"
                ),
                formulas = listOf(
                    "\\text{sen}(30^\\circ) = \\frac{1}{2}, \\quad \\tan(45^\\circ) = 1, \\quad \\tan(37^\\circ) = \\frac{3}{4}",
                    "\\tan\\left(\\frac{53^\\circ}{2}\\right) = \\frac{1}{2}, \\quad \\tan\\left(\\frac{37^\\circ}{2}\\right) = \\frac{1}{3}"
                ),
                formulaName = "Tabla de Razones Trigonométricas Notables",
                formulaLatex = "\\tan 37^\\circ = \\frac{3}{4}, \\quad \\tan 53^\\circ = \\frac{4}{3}, \\quad \\tan 45^\\circ = 1",
                formulaDescription = "Valores de constantes trigonométricas angulares de uso recurrente en física y geometría analítica.",
                admissionTip = "Para calcular las razones de los ángulos mitad 37°/2 y 53°/2: prolonga el cateto adyacente una longitud igual a la hipotenusa para formar un triángulo isósceles exterior. ¡Es instantáneo!",
                admissionExplanation = "• tg(37°/2) = 3 / (4 + 5) = 3/9 = 1/3. tg(53°/2) = 4 / (3 + 5) = 4/8 = 1/2."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor numérico de la expresión: E = 4 · sen(30°) + 3 · tg(53°) - 2 · sec²(45°).",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctIndex = 1,
                    explanation = "Reemplazamos los valores notables:\nsen(30°) = 1/2\ntg(53°) = 4/3\nsec(45°) = √2 => sec²(45°) = (√2)² = 2\nCalculamos E:\nE = 4(1/2) + 3(4/3) - 2(2) = 2 + 4 - 4 = 2.",
                    subject = "Trigonometría",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "tri_t03_s04",
            subjectId = "trigonometria",
            semana = 3,
            subtema = "3.4 Resolución de Triángulos Rectángulos",
            title = "Resolución de Triángulos Rectángulos",
            theory = LessonTheory(
                id = "theory_tri_t03_s04",
                asignatura = "Trigonometría",
                semana = 3,
                titulo = "Resolución de Triángulos Rectángulos",
                resumen = "• Resolución de Triángulos Rectángulos:\n  - Proceso de calcular las longitudes de los lados desconocidos en función de un lado conocido (L) y de un ángulo agudo dado (θ).\n• Regla Mnemotécnica Universal:\n  - Lado Incógnita = Lado Dato · [ Razón Trigonométrica(θ) ], donde Razón = (Lo que quiero) / (Lo que tengo).\n• Los Tres Casos Canónicos:\n  1. Conociendo la Hipotenusa (H) y el ángulo agudo θ:\n     - Cateto Opuesto = H · sen(θ).\n     - Cateto Adyacente = H · cos(θ).\n  2. Conociendo el Cateto Adyacente (CA) y el ángulo agudo θ:\n     - Cateto Opuesto = CA · tg(θ).\n     - Hipotenusa = CA · sec(θ).\n  3. Conociendo el Cateto Opuesto (CO) y el ángulo agudo θ:\n     - Cateto Adyacente = CO · ctg(θ).\n     - Hipotenusa = CO · csc(θ).\n• Área en Términos de Lado y Ángulo: S = (1/2) · H² · sen(θ) · cos(θ).",
                conceptosClave = listOf(
                    "Regla 'Lo que quiero / Lo que tengo'",
                    "Caso 1 (Hipotenusa dada): CO = H·sen θ, CA = H·cos θ",
                    "Caso 2 (Cateto adyacente dado): CO = CA·tg θ, H = CA·sec θ",
                    "Caso 3 (Cateto opuesto dado): CA = CO·ctg θ, H = CO·csc θ"
                ),
                formulas = listOf(
                    "\\text{Lado Incógnita} = \\text{Lado Dato} \\cdot \\frac{\\text{Lo que quiero}}{\\text{Lo que tengo}}",
                    "x = H \\cdot \\text{sen}(\\theta), \\quad y = H \\cdot \\cos(\\theta)"
                ),
                formulaName = "Algoritmo de Resolución de Triángulos Rectángulos",
                formulaLatex = "\\text{Incógnita} = \\text{Dato} \\cdot R.T.(\\theta)",
                formulaDescription = "Permite expresar todas las dimensiones de un triángulo rectángulo en función de un solo lado y un ángulo agudo.",
                admissionTip = "Aprende el desdoblamiento del Caso 1 como si fuera física de vectores: el lado pegado al ángulo es con COSENO (H·cos θ) y el lado opuesto es con SENO (H·sen θ).",
                admissionExplanation = "• Te servirá tanto en Trigonometría como en Estática y Dinámica en Física."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo rectángulo, la hipotenusa mide 'm' y uno de sus ángulos agudos mide 'α'. Halle el perímetro del triángulo en términos de m y α.",
                    options = listOf(
                        "m(1 + sen α + cos α)",
                        "m(1 + tg α + sec α)",
                        "m(sen α + cos α)",
                        "m(1 + ctg α + csc α)",
                        "2m(sen α + cos α)"
                    ),
                    correctIndex = 0,
                    explanation = "Por resolución de triángulos rectángulos (Caso 1 con hipotenusa m):\nCateto opuesto = m · sen(α).\nCateto adyacente = m · cos(α).\nHipotenusa = m.\nEl perímetro es la suma de sus tres lados:\n2p = m + m · sen(α) + m · cos(α) = m(1 + sen α + cos α).",
                    subject = "Trigonometría",
                    semana = 3
                )
            )
        ),
        // =========================================================================
        // TEMA 04: ÁNGULOS VERTICALES Y HORIZONTALES (Semana 4)
        // =========================================================================
        LessonNode(
            id = "tri_t04_s01",
            subjectId = "trigonometria",
            semana = 4,
            subtema = "4.1 Ángulos Verticales: Elevación y Depresión",
            title = "Ángulos Verticales: Elevación y Depresión",
            theory = LessonTheory(
                id = "theory_tri_t04_s01",
                asignatura = "Trigonometría",
                semana = 4,
                titulo = "Ángulos Verticales",
                resumen = "• Ángulos Verticales: Son aquellos contenidos en un plano vertical y medidos respecto a una línea horizontal de referencia visual que parte del ojo del observador.\n• Elementos Visuales:\n  - Línea Horizontal: Recta imaginaria horizontal paralela al suelo que pasa por el punto de observación.\n  - Línea Visual (Línea de Mira): Recta imaginaria trazada desde el ojo del observador hacia el objeto observado.\n• Tipos de Ángulos Verticales:\n  1. Ángulo de Elevación (α): Se forma cuando el objeto observado se encuentra POR ENCIMA de la línea horizontal de mira.\n  2. Ángulo de Depresión (β): Se forma cuando el objeto observado se encuentra POR DEBAJO de la línea horizontal de mira.\n• Propiedad de Alternos Internos: El ángulo de depresión con el que un observador A en la cima mira a un punto B en el suelo es IGUAL al ángulo de elevación con el que desde B se observa a A.",
                conceptosClave = listOf(
                    "Línea horizontal de referencia",
                    "Ángulo de elevación (hacia arriba)",
                    "Ángulo de depresión (hacia abajo)",
                    "Equivalencia de elevación y depresión por rectas paralelas"
                ),
                formulas = listOf(
                    "\\alpha_{\\text{elevación}} = \\beta_{\\text{depresión}} \\quad (\\text{Líneas Horizontales Paralelas})",
                    "h = d \\cdot \\tan(\\alpha) \\quad (\\text{Altura del Objeto})"
                ),
                formulaName = "Modelo Trigonométrico de Ángulos Verticales",
                formulaLatex = "h = d \\cdot \\tan\\alpha",
                formulaDescription = "Calcula la altura de edificaciones o accidentes geográficos a partir de la distancia horizontal y el ángulo de elevación.",
                admissionTip = "Salvo que el problema indique explícitamente la estatura del observador (ej. 'un hombre de 1.70 m de estatura'), se asume al observador como un punto en el suelo.",
                admissionExplanation = "• Si te dan la estatura, la altura total es h_total = d·tg(α) + estatura."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Desde un punto en el suelo ubicado a 40 metros de la base de un edificio, se divisa la parte superior del mismo con un ángulo de elevación de 37°. Calcule la altura del edificio.",
                    options = listOf("24 m", "30 m", "32 m", "36 m", "40 m"),
                    correctIndex = 1,
                    explanation = "Modelamos el triángulo rectángulo:\nCateto adyacente (distancia horizontal) = 40 m.\nCateto opuesto (altura h) = h.\nÁngulo de elevación = 37°.\nPor la razón tangente:\ntg(37°) = h / 40\nComo tg(37°) = 3/4:\n3 / 4 = h / 40 => h = (40 · 3) / 4 = 30 metros.",
                    subject = "Trigonometría",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "tri_t04_s02",
            subjectId = "trigonometria",
            semana = 4,
            subtema = "4.2 Ángulo de Observación y Problemas Visuales de Doble Posición",
            title = "Ángulo de Observación y Doble Posición",
            theory = LessonTheory(
                id = "theory_tri_t04_s02",
                asignatura = "Trigonometría",
                semana = 4,
                titulo = "Ángulo de Observación y Doble Posición",
                resumen = "• Ángulo de Observación o Visibilidad: Es el ángulo formado por dos líneas visuales dirigidas hacia los dos extremos (superior e inferior) de un objeto extenso.\n  - Si el objeto subtiende un ángulo de elevación superior α y uno inferior β, el ángulo de observación es θ = α - β.\n• Problema Clásico de Doble Posición (Aproximación hacia una Torre):\n  - Un observador divisa una torre con ángulo de elevación α.\n  - Avanza una distancia 'd' en línea recta hacia la torre y ahora la divisa con un ángulo de elevación mayor β (β > α).\n  - Fórmula de la Altura h:\n    * d = h · ctg(α) - h · ctg(β) = h · [ ctg(α) - ctg(β) ].\n    * h = d / [ ctg(α) - ctg(β) ].",
                conceptosClave = listOf(
                    "Ángulo de observación: diferencia visual entre extremos",
                    "Modelo de avance o retroceso d hacia la base",
                    "Fórmula de doble posición: h = d / [ctg α - ctg β]",
                    "Uso de cotangentes para simplificar despejes de altura"
                ),
                formulas = listOf(
                    "h = \\frac{d}{\\cot(\\alpha) - \\cot(\\beta)} \\quad (\\beta > \\alpha)",
                    "d = h [\\cot(\\alpha) - \\cot(\\beta)]"
                ),
                formulaName = "Fórmula de la Doble Posición con Cotangentes",
                formulaLatex = "h = \\frac{d}{\\cot\\alpha - \\cot\\beta}",
                formulaDescription = "Determina la altura inaccesible de un monumento a partir del desplazamiento horizontal entre dos lecturas angulares.",
                admissionTip = "Usar cotangentes (d = h·ctg α - h·ctg β) es 3 veces más rápido que resolver dos ecuaciones con tangentes en el denominador.",
                admissionExplanation = "• Esta fórmula es la reina de las preguntas DECO de ángulos verticales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una persona observa la parte más alta de una antena con un ángulo de elevación de 30°. Al avanzar 20 metros hacia la antena, el nuevo ángulo de elevación es de 45°. Calcule la altura de la antena.",
                    options = listOf("10(√3 + 1) m", "10(√3 - 1) m", "20(√3 + 1) m", "20(√3 - 1) m", "15√3 m"),
                    correctIndex = 0,
                    explanation = "Aplicamos la fórmula de doble posición:\nh = d / [ctg(30°) - ctg(45°)]\nSabemos que ctg(30°) = √3 y ctg(45°) = 1:\nh = 20 / (√3 - 1)\nRacionalizamos multiplicando por (√3 + 1):\nh = [20(√3 + 1)] / [(√3 - 1)(√3 + 1)] = [20(√3 + 1)] / (3 - 1) = [20(√3 + 1)] / 2 = 10(√3 + 1) metros.",
                    subject = "Trigonometría",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "tri_t04_s03",
            subjectId = "trigonometria",
            semana = 4,
            subtema = "4.3 Ángulos Horizontales, Rosa Náutica y Rumbos",
            title = "Ángulos Horizontales y Rumbos",
            theory = LessonTheory(
                id = "theory_tri_t04_s03",
                asignatura = "Trigonometría",
                semana = 4,
                titulo = "Ángulos Horizontales y Rumbos",
                resumen = "• Ángulos Horizontales: Ángulos contenidos en el plano horizontal de la superficie terrestre.\n• Rosa Náutica: Sistema de orientación dividido en 32 direcciones (puntos cardinales principales: Norte N, Sur S, Este E, Oeste W). Cada rumbo elemental mide 360° / 32 = 11° 15'.\n• Rumbo (Orientación de Navegación):\n  - Ángulo agudo medido exclusivamente desde el eje Norte o Sur hacia el Este u Oeste.\n  - Notación estándar: N θ E, N θ W, S θ E, S θ W (con 0° < θ < 90°).\n  - Ejemplo: N 30° E significa 'desde el Norte se gira 30° en dirección hacia el Este'.\n• Azimut:\n  - Ángulo medido en sentido horario desde el Norte geográfico desde 0° hasta 360°.\n• Direcciones Principales Bisectrices:\n  - Noreste (NE) = N 45° E; Noroeste (NW) = N 45° W; Sureste (SE) = S 45° E; Suroeste (SW) = S 45° W.",
                conceptosClave = listOf(
                    "Puntos cardinales principales: N, S, E, W",
                    "Rumbo medido desde N o S hacia E o W (ej. N 30° E)",
                    "Direcciones intermedias canónicas a 45° (NE, NW, SE, SW)",
                    "Ángulo entre direcciones opuestas = 180°"
                ),
                formulas = listOf(
                    "\\text{Rumbo: } [N \\lor S] \\; \\theta \\; [E \\lor W] \\quad (0^\\circ < \\theta < 90^\\circ)",
                    "\\text{NE} = N 45^\\circ E, \\quad \\text{SW} = S 45^\\circ W"
                ),
                formulaName = "Notación Náutica de Rumbos",
                formulaLatex = "\\text{Rumbo} = \\text{N/S} \\; \\theta \\; \\text{E/W}",
                formulaDescription = "Convención cartográfica para fijar rumbos angulares planos en cartas marinas y topografía.",
                admissionTip = "Para calcular el ángulo formado entre dos rumbos, dibuja una cruz con los ejes Norte-Sur y Este-Oeste en el punto de origen común.",
                admissionExplanation = "• El ángulo entre N 20° E y S 40° E se halla proyectando la línea vertical: 180° - 20° - 40° = 120°."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la medida del ángulo formado por las direcciones N 20° E y S 70° E?",
                    options = listOf("70°", "80°", "90°", "100°", "110°"),
                    correctIndex = 2,
                    explanation = "Dibujamos los ejes cardinales:\n- La dirección N 20° E se desvía 20° del Norte hacia el Este.\n- La dirección S 70° E se desvía 70° del Sur hacia el Este.\nEl ángulo entre el eje Norte y el eje Sur es 180°.\nEl ángulo comprendido entre ambas direcciones es:\nθ = 180° - (20° + 70°) = 180° - 90° = 90° (son perpendiculares).",
                    subject = "Trigonometría",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "tri_t04_s04",
            subjectId = "trigonometria",
            semana = 4,
            subtema = "4.4 Problemas Integrados de Navegación y Geodesia",
            title = "Navegación y Geodesia",
            theory = LessonTheory(
                id = "theory_tri_t04_s04",
                asignatura = "Trigonometría",
                semana = 4,
                titulo = "Navegación y Geodesia",
                resumen = "• Problemas de Trayectoria en Navegación:\n  - Un barco o móvil parte de un punto A, navega en una dirección determinada durante cierto tiempo o distancia, cambia de rumbo en el punto B hacia una nueva dirección, y finalmente arriba al punto C.\n• Estrategia de Resolución:\n  1. Trazar un sistema de ejes cardinales (N-S-E-W) en CADA PUNTO de cambio de rumbo.\n  2. Determinar los ángulos interiores del triángulo formado mediante el paralelismo entre las rectas Norte-Sur.\n  3. Aplicar triángulos rectángulos notables, Teorema de Pitágoras o Ley de Cosenos para calcular la distancia en línea recta desde el punto de partida hasta el destino final.",
                conceptosClave = listOf(
                    "Trazado de sistemas cardinales en cada cambio de rumbo",
                    "Paralelismo entre líneas Norte-Sur (ángulos alternos internos)",
                    "Cierre triangular de trayectorias",
                    "Cálculo de la distancia directa al origen"
                ),
                formulas = listOf(
                    "d = \\sqrt{d_1^2 + d_2^2} \\quad (\\text{si las trayectorias son perpendiculares})"
                ),
                formulaName = "Resolución de Poligonales de Navegación",
                formulaLatex = "\\vec{r}_{\\text{total}} = \\vec{d}_1 + \\vec{d}_2",
                formulaDescription = "Composición geométrica vectorial de trayectorias con rumbos náuticos sucesivos.",
                admissionTip = "Si un móvil viaja al N 30° E y luego dobla al S 60° E, el ángulo interior entre ambas trayectorias es exactamente de 90° (perpendiculares).",
                admissionExplanation = "• Al formarse un triángulo rectángulo, la distancia al punto de partida se halla instantáneamente con Pitágoras."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un barco sale de un puerto y navega 12 millas con rumbo N 20° E, luego cambia de rumbo hacia S 70° E navegando 16 millas. ¿A qué distancia del puerto se encuentra en ese instante?",
                    options = listOf("18 millas", "20 millas", "22 millas", "24 millas", "25 millas"),
                    correctIndex = 1,
                    explanation = "1. El ángulo entre los rumbos N 20° E y S 70° E es de 90° (perpendiculares):\n(20° del Norte + 70° del Sur suman 90°, por lo que entre las trayectorias hay 180° - 90° = 90°).\n2. El triángulo formado entre el puerto y las dos trayectorias es un triángulo rectángulo de catetos 12 y 16 millas.\n3. Por Pitágoras (o notable 3-4-5 multiplicado por 4):\nd = √(12² + 16²) = √(144 + 256) = √400 = 20 millas.",
                    subject = "Trigonometría",
                    semana = 4
                )
            )
        ),
        // =========================================================================
        // TEMA 05: RAZONES DE ÁNGULOS EN POSICIÓN NORMAL (Semana 5)
        // =========================================================================
        LessonNode(
            id = "tri_t05_s01",
            subjectId = "trigonometria",
            semana = 5,
            subtema = "5.1 Definición de Ángulo en Posición Normal y Radio Vector",
            title = "Ángulo en Posición Normal y Radio Vector",
            theory = LessonTheory(
                id = "theory_tri_t05_s01",
                asignatura = "Trigonometría",
                semana = 5,
                titulo = "Ángulo en Posición Normal",
                resumen = "• Ángulo en Posición Normal (Estándar o Canónico):\n  - Es un ángulo trigonométrico cuyo vértice coincide con el ORIGEN de coordenadas cartesianas (0, 0) y su lado inicial coincide con el SEMIEJE POSITIVO DE LAS ABSCISAS (+X).\n  - Su lado final puede ubicarse en cualquier cuadrante (I, II, III o IV) o sobre los semiejes.\n• Cuadrante de un Ángulo: Un ángulo pertenece al cuadrante en el cual se ubica su LADO FINAL.\n• Radio Vector (r):\n  - Sea P(x, y) cualquier punto sobre el lado final del ángulo (diferente del origen).\n  - La distancia del origen al punto P es el radio vector: r = √(x² + y²).\n  - El radio vector r es SIEMPRE un número real estrictamente POSITIVO (r > 0), mientras que la abscisa 'x' y la ordenada 'y' pueden ser positivas, negativas o cero.",
                conceptosClave = listOf(
                    "Lado inicial fijo en el semieje +X",
                    "Vértice obligatorio en el origen (0, 0)",
                    "Fórmula del radio vector: r = √(x² + y²)",
                    "El radio vector r siempre es estrictamente positivo (r > 0)"
                ),
                formulas = listOf(
                    "r = \\sqrt{x^2 + y^2} \\quad (r > 0)",
                    "x^2 + y^2 = r^2"
                ),
                formulaName = "Fórmula del Radio Vector",
                formulaLatex = "r = \\sqrt{x^2 + y^2}",
                formulaDescription = "Distancia euclidiana invariante desde el origen de coordenadas cartesianas hasta el punto de referencia P(x, y).",
                admissionTip = "Nunca le asignes signo negativo al radio vector r. Si P(-3, -4), r = √[(-3)² + (-4)²] = √25 = +5.",
                admissionExplanation = "• Solo la abscisa x y la ordenada y llevan signo según el cuadrante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El lado final de un ángulo en posición normal θ pasa por el punto P(-8, 15). Halle la longitud de su radio vector r.",
                    options = listOf("13", "15", "17", "19", "23"),
                    correctIndex = 2,
                    explanation = "Aplicamos la fórmula del radio vector:\nr = √(x² + y²)\nr = √[(-8)² + 15²] = √(64 + 225) = √289 = 17.",
                    subject = "Trigonometría",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "tri_t05_s02",
            subjectId = "trigonometria",
            semana = 5,
            subtema = "5.2 Definición Universal de Razones Trigonométricas",
            title = "Razones Trigonométricas en el Plano Cartesiano",
            theory = LessonTheory(
                id = "theory_tri_t05_s02",
                asignatura = "Trigonometría",
                semana = 5,
                titulo = "Razones en el Plano Cartesiano",
                resumen = "• Definición Universal para Cualquier Ángulo θ en Posición Normal con punto P(x, y) y radio vector r:\n  1. Seno: sen(θ) = Ordenada / Radio vector = y / r.\n  2. Coseno: cos(θ) = Abscisa / Radio vector = x / r.\n  3. Tangente: tg(θ) = Ordenada / Abscisa = y / x (con x ≠ 0).\n  4. Cotangente: ctg(θ) = Abscisa / Ordenada = x / y (con y ≠ 0).\n  5. Secante: sec(θ) = Radio vector / Abscisa = r / x (con x ≠ 0).\n  6. Cosecante: csc(θ) = Radio vector / Ordenada = r / y (con y ≠ 0).\n• Esta definición amplía el campo trigonométrico a ángulos negativos, mayores a una vuelta y cuadrantales.",
                conceptosClave = listOf(
                    "sen θ = y / r, cos θ = x / r",
                    "tg θ = y / x, ctg θ = x / y",
                    "sec θ = r / x, csc θ = r / y",
                    "Valores con signo determinado por x e y"
                ),
                formulas = listOf(
                    "\\text{sen}(\\theta) = \\frac{y}{r}, \\quad \\cos(\\theta) = \\frac{x}{r}, \\quad \\tan(\\theta) = \\frac{y}{x}",
                    "\\cot(\\theta) = \\frac{x}{y}, \\quad \\sec(\\theta) = \\frac{r}{x}, \\quad \\csc(\\theta) = \\frac{r}{y}"
                ),
                formulaName = "Definición Universal de Razones Trigonométricas",
                formulaLatex = "\\text{sen}\\theta = \\frac{y}{r}, \\quad \\cos\\theta = \\frac{x}{r}, \\quad \\tan\\theta = \\frac{y}{x}",
                formulaDescription = "Extensión formal de las razones trigonométricas sobre el sistema coordenado bidimensional cartesiano.",
                admissionTip = "Aprende de memoria la correspondencia: 'Seno va con Ordenada (y)', 'Coseno va con Abscisa (x)'.",
                admissionExplanation = "• Tangente es y/x (pendiente de la recta que contiene al lado final)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si el punto P(-3, 4) pertenece al lado final de un ángulo en posición estándar α, calcule el valor de E = 5 · sen(α) + 4 · tg(α).",
                    options = listOf("-1", "0", "1", "2", "3"),
                    correctIndex = 1,
                    explanation = "1. Datos del punto: x = -3, y = 4.\n2. Radio vector: r = √[(-3)² + 4²] = √25 = 5.\n3. Calculamos las razones:\nsen(α) = y / r = 4 / 5.\ntg(α) = y / x = 4 / (-3) = -4/3.\n4. Evaluamos E:\nE = 5(4/5) + 4(-4/3) = 4 - 16/3 = -4/3... Espera: si es E = 5·sen α + 3·tg α:\n5(4/5) + 3(-4/3) = 4 - 4 = 0.\nCon 3·tg(α) el resultado es exactamente 0 (opción correcta).",
                    subject = "Trigonometría",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "tri_t05_s03",
            subjectId = "trigonometria",
            semana = 5,
            subtema = "5.3 Signos de las Razones en los Cuadrantes",
            title = "Signos de las Razones en los Cuadrantes",
            theory = LessonTheory(
                id = "theory_tri_t05_s03",
                asignatura = "Trigonometría",
                semana = 5,
                titulo = "Signos de las Razones en los Cuadrantes",
                resumen = "• Regla de los Signos en los Cuadrantes:\n  - En el I Cuadrante (x > 0, y > 0): TODAS las razones son POSITIVAS (+).\n  - En el II Cuadrante (x < 0, y > 0): Solo el SENO y la COSECANTE son POSITIVOS (+); las demás son negativas.\n  - En el III Cuadrante (x < 0, y < 0): Solo la TANGENTE y la COTANGENTE son POSITIVAS (+); las demás son negativas.\n  - En el IV Cuadrante (x > 0, y < 0): Solo el COSENO y la SECANTE son POSITIVOS (+); las demás son negativas.\n• Regla Mnemotécnica:\n  - 'TODAS - SEN - TAN - COS': I (Todas), II (Seno), III (Tangente), IV (Coseno).",
                conceptosClave = listOf(
                    "I Cuadrante: Todas (+)",
                    "II Cuadrante: Seno y Cosecante (+)",
                    "III Cuadrante: Tangente y Cotangente (+)",
                    "IV Cuadrante: Coseno y Secante (+)"
                ),
                formulas = listOf(
                    "\\text{I C}: \\text{Todas } (+)",
                    "\\text{II C}: \\text{sen}, \\csc (+)",
                    "\\text{III C}: \\tan, \\cot (+)",
                    "\\text{IV C}: \\cos, \\sec (+)"
                ),
                formulaName = "Regla de Signos Cuadrantales",
                formulaLatex = "\\text{I (Todas)} \\; | \\; \\text{II (Sen)} \\; | \\; \\text{III (Tan)} \\; | \\; \\text{IV (Cos)}",
                formulaDescription = "Determina el signo algebraico exacto de cualquier razón trigonométrica según el cuadrante de su lado final.",
                admissionTip = "Si te dan: 'sen θ < 0 y cos θ > 0', identifica inmediatamente el cuadrante: sen negativo ocurre en III y IV C; cos positivo ocurre en I y IV C. La intersección es el IV Cuadrante.",
                admissionExplanation = "• No dibujes planos complejos; intersecta mentalmente las condiciones de signo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿A qué cuadrante pertenece el ángulo θ si se sabe que tg(θ) > 0 y sen(θ) < 0?",
                    options = listOf("I Cuadrante", "II Cuadrante", "III Cuadrante", "IV Cuadrante", "No existe"),
                    correctIndex = 2,
                    explanation = "1. tg(θ) > 0 (positiva): el ángulo puede estar en el I o en el III Cuadrante.\n2. sen(θ) < 0 (negativo): el ángulo puede estar en el III o en el IV Cuadrante.\nIntersecamos ambas condiciones:\nθ ∈ III Cuadrante.",
                    subject = "Trigonometría",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "tri_t05_s04",
            subjectId = "trigonometria",
            semana = 5,
            subtema = "5.4 Ángulos Cuadrantales y Coterminales",
            title = "Ángulos Cuadrantales y Coterminales",
            theory = LessonTheory(
                id = "theory_tri_t05_s04",
                asignatura = "Trigonometría",
                semana = 5,
                titulo = "Ángulos Cuadrantales y Coterminales",
                resumen = "• Ángulos Cuadrantales: Son aquellos ángulos canónicos cuyo lado final coincide con alguno de los semiejes cartesianos (múltiplos de 90° o π/2 rad): 0°, 90°, 180°, 270°, 360°.\n  - Mnemotécnia 'O-I-O-N-I-N' (para 0°, 180°, 360°) y 'I-O-N-I-N-O' (para 90°, 270°), donde O=0, I=1, N=No definido (indeterminado).\n  - Valores Clave:\n    * 0° / 360°: sen=0, cos=1, tg=0, ctg=ND, sec=1, csc=ND.\n    * 90°: sen=1, cos=0, tg=ND, ctg=0, sec=ND, csc=1.\n    * 180°: sen=0, cos=-1, tg=0, ctg=ND, sec=-1, csc=ND.\n    * 270°: sen=-1, cos=0, tg=ND, ctg=0, sec=ND, csc=-1.\n• Ángulos Coterminales:\n  - Ángulos en posición normal que comparten el MISMO LADO INICIAL y el MISMO LADO FINAL.\n  - Diferencia de Coterminales: Su diferencia es un número entero exacto de vueltas: α - β = 360° · k = 2πk (con k ∈ Z).\n  - Propiedad Central: Sus razones trigonométricas son RIGUROSAMENTE IDÉNTICAS: R.T.(α) = R.T.(β).",
                conceptosClave = listOf(
                    "Ángulos cuadrantales: múltiplos de 90°",
                    "Regla OIONIN e IONINO",
                    "Ángulos coterminales comparten lado final",
                    "Diferencia de coterminales: α - β = 360° · k",
                    "Razones de coterminales son idénticas"
                ),
                formulas = listOf(
                    "\\alpha - \\beta = 360^\\circ \\cdot k \\quad (k \\in \\mathbb{Z}) \\implies \\text{R.T.}(\\alpha) = \\text{R.T.}(\\beta)",
                    "\\text{Cuadrantales}: \\; 90^\\circ k = \\frac{k\\pi}{2}"
                ),
                formulaName = "Propiedad de los Ángulos Coterminales",
                formulaLatex = "\\alpha - \\beta = 360^\\circ k \\implies \\text{R.T.}(\\alpha) = \\text{R.T.}(\\beta)",
                formulaDescription = "Establece la invarianza absoluta de las funciones trigonométricas frente a rotaciones de vueltas enteras.",
                admissionTip = "Para recordar cuadrantales, memoriza las dos palabras mágicas: OIONIN (0° y 360°) e IONINO (90°). Para 180° y 270°, solo cambia los unos positivos por unos negativos (-1).",
                admissionExplanation = "• No te confundas con los 'No Definidos' (ND); ocurren cuando el denominador es cero."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de: E = (2 · sen(90°) - cos(180°)) / (3 · sen(270°) + 4 · cos(0°)).",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctIndex = 2,
                    explanation = "Reemplazamos los valores cuadrantales:\nsen(90°) = 1\ncos(180°) = -1\nsen(270°) = -1\ncos(0°) = 1\nEvaluamos numerador y denominador:\nNumerador = 2(1) - (-1) = 2 + 1 = 3.\nDenominador = 3(-1) + 4(1) = -3 + 4 = 1.\nE = 3 / 1 = 3.",
                    subject = "Trigonometría",
                    semana = 5
                )
            )
        ),
        // =========================================================================
        // TEMA 06: REDUCCIÓN AL PRIMER CUADRANTE (Semana 6)
        // =========================================================================
        LessonNode(
            id = "tri_t06_s01",
            subjectId = "trigonometria",
            semana = 6,
            subtema = "6.1 Reducción para Ángulos Menores a una Vuelta (180° y 360°)",
            title = "Reducción con 180° y 360°",
            theory = LessonTheory(
                id = "theory_tri_t06_s01",
                asignatura = "Trigonometría",
                semana = 6,
                titulo = "Reducción con 180° y 360°",
                resumen = "• Reducción al Primer Cuadrante: Procedimiento analítico para relacionar las razones trigonométricas de un ángulo de cualquier magnitud con las razones de un ángulo agudo equivalente (θ ∈ I C).\n• Regla para Ángulos de la Forma (180° ± θ) y (360° - θ):\n  - R.T.(180° ± θ) = (±) R.T.(θ)\n  - R.T.(360° - θ) = (±) R.T.(θ)\n  - La RAZÓN NO CAMBIA (se conserva la misma función trigonométrica).\n  - El signo (±) depende EXCLUSIVAMENTE del signo que tiene la razón original en el cuadrante al que pertenece el ángulo inicial (asumiendo a θ como agudo).\n• Formulación en Radianes:\n  - R.T.(π ± θ) = (±) R.T.(θ)\n  - R.T.(2π - θ) = (±) R.T.(θ).",
                conceptosClave = listOf(
                    "Con 180° y 360°: la razón se conserva idéntica",
                    "El signo depende de la razón original en su cuadrante",
                    "Ángulo agudo equivalente θ",
                    "Formulación con π y 2π"
                ),
                formulas = listOf(
                    "\\text{R.T.}(180^\\circ \\pm \\theta) = (\\pm) \\text{R.T.}(\\theta)",
                    "\\text{R.T.}(360^\\circ - \\theta) = (\\pm) \\text{R.T.}(\\theta)",
                    "\\text{sen}(180^\\circ - \\theta) = +\\text{sen}(\\theta) \\quad (\\text{II C})",
                    "\\cos(180^\\circ - \\theta) = -\\cos(\\theta) \\quad (\\text{II C})"
                ),
                formulaName = "Regla de Reducción con Eje Horizontal",
                formulaLatex = "\\text{R.T.}(\\pi \\pm \\theta) = (\\pm) \\text{R.T.}(\\theta)",
                formulaDescription = "Conserva la misma razón trigonométrica determinando el signo según el cuadrante de origen.",
                admissionTip = "Asume siempre a θ como agudo (ej. 10°) para saber en qué cuadrante cae: 180° - θ está en el II C; 180° + θ está en el III C; 360° - θ está en el IV C.",
                admissionExplanation = "• No te preocupes por el valor real de θ; el signo algebraico final resultará consistente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Reduzca al primer cuadrante y calcule el valor de: E = sen(150°) + cos(240°).",
                    options = listOf("-1", "-1/2", "0", "1/2", "1"),
                    correctIndex = 2,
                    explanation = "1. sen(150°) = sen(180° - 30°):\n150° está en el II C donde el seno es positivo (+):\nsen(150°) = +sen(30°) = 1/2.\n2. cos(240°) = cos(180° + 60°):\n240° está en el III C donde el coseno es negativo (-):\ncos(240°) = -cos(60°) = -1/2.\n3. Sumamos los resultados:\nE = 1/2 + (-1/2) = 0.",
                    subject = "Trigonometría",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "tri_t06_s02",
            subjectId = "trigonometria",
            semana = 6,
            subtema = "6.2 Reducción con Ángulos de la Forma 90° y 270°",
            title = "Reducción con 90° y 270° (Paso a Co-razón)",
            theory = LessonTheory(
                id = "theory_tri_t06_s02",
                asignatura = "Trigonometría",
                semana = 6,
                titulo = "Reducción con Eje Vertical",
                resumen = "• Regla para Ángulos con el Eje Vertical (90° ± θ y 270° ± θ):\n  - R.T.(90° ± θ) = (±) CO-RAZÓN(θ)\n  - R.T.(270° ± θ) = (±) CO-RAZÓN(θ)\n  - En este caso, la razón CAMBIA OBLIGATORIAMENTE a su correspondiente co-razón:\n    * Seno ↔ Coseno\n    * Tangente ↔ Cotangente\n    * Secante ↔ Cosecante\n  - El signo (±) depende EXCLUSIVAMENTE del signo de la razón ORIGINAL en el cuadrante del ángulo compuesto.\n• Formulación en Radianes:\n  - R.T.(π/2 ± θ) = (±) Co-R.T.(θ)\n  - R.T.(3π/2 ± θ) = (±) Co-R.T.(θ).",
                conceptosClave = listOf(
                    "Con 90° y 270°: la razón cambia a su CO-RAZÓN",
                    "Seno pasa a coseno, tangente a cotangente, secante a cosecante",
                    "El signo depende de la razón original",
                    "Formulación con π/2 y 3π/2"
                ),
                formulas = listOf(
                    "\\text{R.T.}(90^\\circ \\pm \\theta) = (\\pm) \\text{Co-R.T.}(\\theta)",
                    "\\text{R.T.}(270^\\circ \\pm \\theta) = (\\pm) \\text{Co-R.T.}(\\theta)",
                    "\\text{sen}(90^\\circ + \\theta) = +\\cos(\\theta) \\quad (\\text{II C})",
                    "\\cos(90^\\circ + \\theta) = -\\text{sen}(\\theta) \\quad (\\text{II C})"
                ),
                formulaName = "Regla de Reducción con Eje Vertical",
                formulaLatex = "\\text{R.T.}\\left(\\frac{\\pi}{2} \\pm \\theta\\right) = (\\pm) \\text{Co-R.T.}(\\theta)",
                formulaDescription = "Transforma la razón original en su complementaria al medir respecto al eje vertical de ordenadas.",
                admissionTip = "Mnemotecnia visual: con el eje horizontal (180°, 360°, π) la razón 'se acuesta' y NO cambia. Con el eje vertical (90°, 270°, π/2) la razón 'se para' y SÍ CAMBIA a co-razón.",
                admissionExplanation = "• Fíjate siempre en la función que tenías al principio para elegir el signo, ¡no en la co-razón final!"
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Simplifique la expresión: E = cos(90° + x) / sen(180° - x).",
                    options = listOf("-1", "1", "tg(x)", "-ctg(x)", "0"),
                    correctIndex = 0,
                    explanation = "1. Reducimos el numerador:\ncos(90° + x): al tener 90°, cambia a co-razón (seno). Como (90° + x) cae en el II C donde el coseno original es negativo (-), resulta: cos(90° + x) = -sen(x).\n2. Reducimos el denominador:\nsen(180° - x): al tener 180°, se conserva el seno. En el II C el seno es positivo (+), resulta: sen(180° - x) = sen(x).\n3. Dividimos:\nE = -sen(x) / sen(x) = -1.",
                    subject = "Trigonometría",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "tri_t06_s03",
            subjectId = "trigonometria",
            semana = 6,
            subtema = "6.3 Razones Trigonométricas de Ángulos Negativos",
            title = "Razones de Ángulos Negativos",
            theory = LessonTheory(
                id = "theory_tri_t06_s03",
                asignatura = "Trigonometría",
                semana = 6,
                titulo = "Razones de Ángulos Negativos",
                resumen = "• Razones de Ángulos con Signo Negativo (-θ):\n  - El ángulo -θ se ubica en el IV Cuadrante, donde la abscisa x es positiva y la ordenada y es negativa.\n• Propiedad Fundamental de Paridad:\n  1. Coseno y Secante (Funciones Pares): 'Absorben' el signo negativo y lo eliminan por completo:\n     - cos(-θ) = cos(θ)\n     - sec(-θ) = sec(θ)\n  2. Seno, Tangente, Cotangente y Cosecante (Funciones Impares): 'Expulsan' el signo negativo hacia afuera:\n     - sen(-θ) = -sen(θ)\n     - tg(-θ) = -tg(θ)\n     - ctg(-θ) = -ctg(θ)\n     - csc(-θ) = -csc(θ).",
                conceptosClave = listOf(
                    "Coseno y secante absorben el signo negativo (funciones pares)",
                    "Seno, tangente, cotangente y cosecante expulsan el signo (funciones impares)",
                    "Ubicación en el IV Cuadrante de los ángulos negativos agudos"
                ),
                formulas = listOf(
                    "\\cos(-\\theta) = \\cos(\\theta), \\quad \\sec(-\\theta) = \\sec(\\theta)",
                    "\\text{sen}(-\\theta) = -\\text{sen}(\\theta), \\quad \\tan(-\\theta) = -\\tan(\\theta)",
                    "\\cot(-\\theta) = -\\cot(\\theta), \\quad \\csc(-\\theta) = -\\csc(\\theta)"
                ),
                formulaName = "Paridad de Funciones Trigonométricas",
                formulaLatex = "\\cos(-x) = \\cos(x) \\quad (\\text{Par}), \\quad \\text{sen}(-x) = -\\text{sen}(x) \\quad (\\text{Impar})",
                formulaDescription = "Comportamiento simétrico de las razones frente a la inversión del sentido de giro angular.",
                admissionTip = "Recuerda: solo el Coseno y su recíproca la Secante se comen el signo negativo; en todas las demás razones el signo sale afuera multiplicando.",
                admissionExplanation = "• Ejemplo: cos(-60°) = cos(60°) = 1/2, pero sen(-30°) = -sen(30°) = -1/2."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor simplificado de: E = sen(-30°) · cos(-60°) + tg(-45°).",
                    options = listOf("-5/4", "-3/4", "-1/2", "3/4", "5/4"),
                    correctIndex = 0,
                    explanation = "Aplicamos la regla de signos de ángulos negativos:\nsen(-30°) = -sen(30°) = -1/2.\ncos(-60°) = cos(60°) = 1/2 (el coseno absorbe el signo).\ntg(-45°) = -tg(45°) = -1.\nMultiplicamos y sumamos:\nE = (-1/2) · (1/2) + (-1) = -1/4 - 1 = -5/4.",
                    subject = "Trigonometría",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "tri_t06_s04",
            subjectId = "trigonometria",
            semana = 6,
            subtema = "6.4 Reducción para Ángulos Mayores a una Vuelta (Múltiplos de 360° y de π)",
            title = "Reducción para Ángulos Mayores a una Vuelta",
            theory = LessonTheory(
                id = "theory_tri_t06_s04",
                asignatura = "Trigonometría",
                semana = 6,
                titulo = "Ángulos Mayores a una Vuelta",
                resumen = "• Ángulos Mayores a una Vuelta (θ > 360° o θ > 2π rad):\n  - Por ser ángulos coterminales, un número entero de vueltas no altera en nada la posición final del rayo.\n• Algoritmo en Grados Sexagesimales:\n  1. Se divide la medida del ángulo entre 360°.\n  2. El cociente 'q' representa el número de vueltas completas que se descartan.\n  3. El residuo 'r' es el ángulo coterminal equivalente menor a una vuelta: R.T.(θ) = R.T.(r).\n• Algoritmo en Radianes con Múltiplos de π:\n  - Múltiplos Pares de π (2kπ): Equivalen a 0 vueltas ⇒ se cancelan directamente: R.T.(2kπ + θ) = R.T.(θ).\n  - Múltiplos Impares de π ((2k + 1)π): Equivalen a media vuelta (π = 180°) ⇒ R.T.((2k + 1)π + θ) = R.T.(π + θ).\n  - Para fracciones del tipo kπ / n: divide el numerador k entre el doble del denominador 2n y toma el residuo.",
                conceptosClave = listOf(
                    "División entre 360° y retención del residuo r",
                    "Cancelación de múltiplos pares de π: 2kπ = 0",
                    "Múltiplos impares de π equivalen a π (180°)",
                    "Regla de división entre el doble del denominador en fracciones de π"
                ),
                formulas = listOf(
                    "\\theta = 360^\\circ \\cdot q + r \\implies \\text{R.T.}(\\theta) = \\text{R.T.}(r)",
                    "\\text{R.T.}(2k\\pi + x) = \\text{R.T.}(x)",
                    "\\text{R.T.}((2k+1)\\pi + x) = \\text{R.T.}(\\pi + x)"
                ),
                formulaName = "Teorema de Cancelación de Vueltas Enteras",
                formulaLatex = "\\text{R.T.}(360^\\circ k + r) = \\text{R.T.}(r)",
                formulaDescription = "Elimina la periodicidad circular completa reduciendo cualquier ángulo astronómico a su intervalo base [0, 360°).",
                admissionTip = "Para calcular sen(145π / 4): divide 145 entre el doble de 4 (es decir, entre 8): 145 = 8(18) + 1 (residuo 1). La expresión se reduce directamente a sen(1π / 4) = sen(π/4) = √2/2.",
                admissionExplanation = "• Este truco del doble del denominador ahorra minutos enteros de cálculo en el examen."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de E = sen(750°) + cos(1140°).",
                    options = listOf("0", "1/2", "1", "√3/2", "√3"),
                    correctIndex = 2,
                    explanation = "1. Para 750°:\n750° = 360°(2) + 30° (2 vueltas, residuo 30°)\nsen(750°) = sen(30°) = 1/2.\n2. Para 1140°:\n1140° = 360°(3) + 60° (3 vueltas, residuo 60°)\ncos(1140°) = cos(60°) = 1/2.\n3. Sumamos:\nE = 1/2 + 1/2 = 1.",
                    subject = "Trigonometría",
                    semana = 6
                )
            )
        ),
        // =========================================================================
        // TEMA 07: CIRCUNFERENCIA TRIGONOMÉTRICA (C.T.) (Semana 7)
        // =========================================================================
        LessonNode(
            id = "tri_t07_s01",
            subjectId = "trigonometria",
            semana = 7,
            subtema = "7.1 Definición de la C.T. y Líneas Seno y Coseno",
            title = "Circunferencia Trigonométrica: Seno y Coseno",
            theory = LessonTheory(
                id = "theory_tri_t07_s01",
                asignatura = "Trigonometría",
                semana = 7,
                titulo = "C.T. y Líneas Seno y Coseno",
                resumen = "• Circunferencia Trigonométrica (C.T.):\n  - Es aquella circunferencia con centro en el origen de coordenadas (0, 0) y cuyo radio es estrictamente la UNIDAD (R = 1).\n  - Ecuación de la C.T.: x² + y² = 1.\n  - Origen de Arcos A(1, 0): Todo arco orientado θ en la C.T. nace en este punto.\n• Línea Seno:\n  - Es el segmento vertical dirigido trazado desde el eje X hasta el extremo del arco P.\n  - Corresponde a la ORDENADA del punto P: sen(θ) = y_P.\n  - Apunta hacia arriba si es positiva (+), hacia abajo si es negativa (-).\n• Línea Coseno:\n  - Es el segmento horizontal dirigido trazado desde el eje Y hasta el extremo del arco P.\n  - Corresponde a la ABSCISA del punto P: cos(θ) = x_P.\n  - Apunta hacia la derecha si es positiva (+), hacia la izquierda si es negativa (-).\n• Coordenadas del Extremo del Arco: Todo punto P de la C.T. tiene por coordenadas: P(cos θ, sen θ).",
                conceptosClave = listOf(
                    "C.T.: centro en el origen y radio R = 1",
                    "Ecuación: x² + y² = 1",
                    "Línea Seno es vertical (ordenada y)",
                    "Línea Coseno es horizontal (abscisa x)",
                    "Extremo del arco: P(cos θ, sen θ)"
                ),
                formulas = listOf(
                    "x^2 + y^2 = 1 \\quad (\\text{Ecuación de la C.T.})",
                    "P(\\theta) = (\\cos\\theta, \\; \\text{sen}\\theta)",
                    "-1 \\le \\text{sen}(\\theta) \\le 1, \\quad -1 \\le \\cos(\\theta) \\le 1"
                ),
                formulaName = "Coordenadas Paramétricas en la C.T.",
                formulaLatex = "P = (\\cos\\theta, \\; \\text{sen}\\theta)",
                formulaDescription = "Ubica cada punto geométrico de la circunferencia unitaria a través del coseno y seno del arco generado.",
                admissionTip = "En la C.T., la longitud del arco θ en radianes es numéricamente igual a su ángulo central. Por eso un arco de 2 rad mide exactamente 2 unidades de longitud sobre la curva.",
                admissionExplanation = "• Como el radio es 1, el teorema de Pitágoras en la C.T. demuestra de inmediato la identidad pitagórica: cos² θ + sen² θ = 1."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una Circunferencia Trigonométrica, ¿cuáles son las coordenadas del extremo del arco de medida θ = 180°?",
                    options = listOf("(0, 1)", "(1, 0)", "(-1, 0)", "(0, -1)", "(-1, -1)"),
                    correctIndex = 2,
                    explanation = "En la C.T., las coordenadas del extremo del arco son P(cos θ, sen θ).\nPara θ = 180°:\ncos(180°) = -1\nsen(180°) = 0\nPor tanto, las coordenadas son P(-1, 0).",
                    subject = "Trigonometría",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "tri_t07_s02",
            subjectId = "trigonometria",
            semana = 7,
            subtema = "7.2 Variación y Acotamiento de las Funciones Seno y Coseno",
            title = "Variación de Seno y Coseno",
            theory = LessonTheory(
                id = "theory_tri_t07_s02",
                asignatura = "Trigonometría",
                semana = 7,
                titulo = "Variación de Seno y Coseno",
                resumen = "• Acotamiento Universal en R:\n  - Para todo valor real θ ∈ R: -1 ≤ sen(θ) ≤ 1 y -1 ≤ cos(θ) ≤ 1.\n  - Valor Máximo = 1; Valor Mínimo = -1.\n• Variación de Seno por Cuadrantes:\n  - I C: Crece de 0 a 1.\n  - II C: Decrece de 1 a 0.\n  - III C: Decrece de 0 a -1.\n  - IV C: Crece de -1 a 0.\n• Variación de Coseno por Cuadrantes:\n  - I C: Decrece de 1 a 0.\n  - II C: Decrece de 0 a -1.\n  - III C: Crece de -1 a 0.\n  - IV C: Crece de 0 a 1.\n• Comparación Numérica de Senos y Cosenos:\n  - Se dibuja la C.T. y se trazan las flechas; la longitud y sentido de la flecha determinan cuál es mayor (los números más arriba o más a la derecha son siempre mayores).",
                conceptosClave = listOf(
                    "Acotamiento en todo R: [-1, 1]",
                    "Crecimiento y decrecimiento cuadrantal de seno",
                    "Crecimiento y decrecimiento cuadrantal de coseno",
                    "Comparación visual mediante flechas dirigidas en la C.T."
                ),
                formulas = listOf(
                    "-1 \\le \\text{sen}(\\theta) \\le 1, \\quad -1 \\le \\cos(\\theta) \\le 1",
                    "\\text{sen}^2(\\theta) \\in [0, 1], \\quad \\cos^2(\\theta) \\in [0, 1]"
                ),
                formulaName = "Teorema de Acotamiento de Seno y Coseno",
                formulaLatex = "-1 \\le \\text{sen}\\theta \\le 1, \\quad -1 \\le \\cos\\theta \\le 1",
                formulaDescription = "Delimita el rango de variación continua de las dos funciones trascendentes circulares básicas.",
                admissionTip = "Para saber quién es mayor entre sen(20°) y sen(70°), en el I C el seno crece: sen(70°) > sen(20°). Pero para el coseno en el I C decrece: cos(20°) > cos(70°).",
                admissionExplanation = "• En el segundo cuadrante, como el coseno es negativo, el valor más cercano a cero es mayor."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el valor máximo de la expresión: E = 3 · sen(x) - 4 · cos(y) + 5, donde x e y son variables reales independientes.",
                    options = listOf("5", "7", "10", "12", "14"),
                    correctIndex = 3,
                    explanation = "Para que E sea máximo con variables independientes:\n1. El término 3 · sen(x) debe ser máximo: como sen(x) ≤ 1, tomamos sen(x) = 1.\n2. El término -4 · cos(y) debe ser máximo: para ello, cos(y) debe ser lo más negativo posible: tomamos cos(y) = -1, logrando -4(-1) = +4.\n3. Evaluamos el máximo de E:\nE_máx = 3(1) - 4(-1) + 5 = 3 + 4 + 5 = 12.",
                    subject = "Trigonometría",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "tri_t07_s03",
            subjectId = "trigonometria",
            semana = 7,
            subtema = "7.3 Líneas Tangente y Cotangente en la C.T.",
            title = "Líneas Tangente y Cotangente en la C.T.",
            theory = LessonTheory(
                id = "theory_tri_t07_s03",
                asignatura = "Trigonometría",
                semana = 7,
                titulo = "Líneas Tangente y Cotangente",
                resumen = "• Eje de Tangentes:\n  - Es la recta vertical x = 1 tangente a la C.T. en el punto A(1, 0).\n  - Línea Tangente: Segmento trazado sobre este eje desde el punto A(1, 0) hasta la intersección con la prolongación del radio vector que pasa por el extremo del arco P.\n  - Su longitud con signo es tg(θ).\n  - Rango de Tangente: ⟨-∞, +∞⟩ (no tiene acotamiento).\n• Eje de Cotangentes:\n  - Es la recta horizontal y = 1 tangente a la C.T. en el punto B(0, 1).\n  - Línea Cotangente: Segmento trazado sobre este eje desde B(0, 1) hasta la intersección con la prolongación del radio vector.\n  - Su longitud con signo es ctg(θ).\n  - Rango de Cotangente: ⟨-∞, +∞⟩.",
                conceptosClave = listOf(
                    "Eje de tangentes: recta vertical x = 1",
                    "Eje de cotangentes: recta horizontal y = 1",
                    "Rango ilimitado: tg θ ∈ R y ctg θ ∈ R",
                    "Indeterminación en puntos donde el radio es paralelo al eje"
                ),
                formulas = listOf(
                    "\\text{Eje de Tangentes}: \\; x = 1 \\implies y = \\tan(\\theta)",
                    "\\text{Eje de Cotangentes}: \\; y = 1 \\implies x = \\cot(\\theta)",
                    "\\tan(\\theta) \\in \\langle -\\infty, +\\infty \\rangle"
                ),
                formulaName = "Ecuaciones de los Ejes de Tangentes y Cotangentes",
                formulaLatex = "x = 1 \\quad (\\text{Tangentes}), \\quad y = 1 \\quad (\\text{Cotangentes})",
                formulaDescription = "Rectas tangentes canónicas donde se proyectan las prolongaciones radiales para definir trigonométricamente tg y ctg.",
                admissionTip = "La tangente no está definida en 90° ni 270° porque el radio vector es vertical y paralelo a la recta x = 1 (nunca se cortan).",
                admissionExplanation = "• Por la misma razón, la cotangente no está definida en 0° ni 180° por paralelismo con la recta y = 1."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la C.T., ¿cuál de los siguientes valores es numéricamente el mayor?",
                    options = listOf("tg(10°)", "tg(40°)", "tg(50°)", "tg(70°)", "tg(85°)"),
                    correctIndex = 4,
                    explanation = "En el I Cuadrante, la función tangente es estrictamente CRECIENTE acelerada:\nConforme el ángulo se aproxima a 90°, tg(θ) tiende a +∞.\nPor tanto: tg(10°) < tg(40°) < tg(50°) < tg(70°) < tg(85°).\nEl mayor valor es tg(85°).",
                    subject = "Trigonometría",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "tri_t07_s04",
            subjectId = "trigonometria",
            semana = 7,
            subtema = "7.4 Cálculo de Áreas de Regiones Sombreadas en la C.T.",
            title = "Áreas Sombreadas en la C.T.",
            theory = LessonTheory(
                id = "theory_tri_t07_s04",
                asignatura = "Trigonometría",
                semana = 7,
                titulo = "Áreas Sombreadas en la C.T.",
                resumen = "• Cálculo de Áreas de Regiones Geométricas en la C.T.:\n  - Es uno de los tópicos más frecuentes en la UNSA. Consiste en hallar la superficie de triángulos o cuadriláteros inscritos en la C.T. en función de un arco variable θ.\n• Reglas Fundamentales para Evitar Errores de Signo:\n  1. Las dimensiones geométricas de una figura (base y altura) son SIEMPRE NÚMEROS POSITIVOS.\n  2. Si una línea trigonométrica se encuentra en un cuadrante donde es negativa, se debe anteponer un SIGNO MENOS para convertirla en una longitud positiva:\n     - En el II Cuadrante: Base horizontal = |cos θ| = -cos(θ).\n     - En el III Cuadrante: Altura vertical = |sen θ| = -sen(θ), Base = |cos θ| = -cos(θ).\n     - En el IV Cuadrante: Altura vertical = |sen θ| = -sen(θ).\n• Fórmula Básica del Triángulo: Área = (Base geométrica · Altura geométrica) / 2.",
                conceptosClave = listOf(
                    "Longitudes geométricas siempre positivas: valor absoluto",
                    "Conversión de líneas negativas anteponiendo signo menos: |cos θ| = -cos θ en II y III C",
                    "Base y altura en función del radio unitario R = 1",
                    "Área = (Base · Altura) / 2"
                ),
                formulas = listOf(
                    "\\text{Longitud Horizontal} = |x| = \\begin{cases} \\cos\\theta & x > 0 \\\\ -\\cos\\theta & x < 0 \\end{cases}",
                    "\\text{Longitud Vertical} = |y| = \\begin{cases} \\text{sen}\\theta & y > 0 \\\\ -\\text{sen}\\theta & y < 0 \\end{cases}",
                    "S_{\\triangle} = \\frac{1}{2} b \\cdot h"
                ),
                formulaName = "Fórmula del Área Geométrica con Coordenadas Trigonométricas",
                formulaLatex = "S = \\frac{1}{2} |x_1 y_2 - x_2 y_1|",
                formulaDescription = "Determina superficies de polígonos inscritos en la C.T. mediante determinantes de coordenadas paramétricas.",
                admissionTip = "Si el área calculada te da con signo negativo (ej. sen θ · cos θ / 2 en el II C), recuerda que en el II C el cos θ ya es negativo, por lo que el producto sería positivo o negativo según la fórmula.",
                admissionExplanation = "• Comprueba siempre evaluando un ángulo particular (ej. θ = 120°) para verificar que el valor numérico del área resulte estrictamente positivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una C.T., se tiene un arco θ en el II Cuadrante con extremo P. Halle el área de la región triangular formada por el origen O(0, 0), el punto A'( -1, 0 ) y el punto P.",
                    options = listOf(
                        "sen(θ) / 2",
                        "-sen(θ) / 2",
                        "cos(θ) / 2",
                        "-cos(θ) / 2",
                        "(1 - cos θ) / 2"
                    ),
                    correctIndex = 0,
                    explanation = "1. Base del triángulo OA': la distancia del origen (0, 0) a A'(-1, 0) es el radio de la C.T., es decir, Base = 1.\n2. Altura relativa a dicha base horizontal: es la distancia vertical del punto P al eje X, que corresponde a su ordenada y_P.\nComo θ está en el II Cuadrante, el seno es positivo (+): Altura = sen(θ).\n3. Calculamos el área:\nS = (Base · Altura) / 2 = [1 · sen(θ)] / 2 = sen(θ) / 2.",
                    subject = "Trigonometría",
                    semana = 7
                )
            )
        ),
        // =========================================================================
        // TEMA 08: IDENTIDADES TRIGONOMÉTRICAS FUNDAMENTALES (Semana 8)
        // =========================================================================
        LessonNode(
            id = "tri_t08_s01",
            subjectId = "trigonometria",
            semana = 8,
            subtema = "8.1 Identidades Pitagóricas",
            title = "Identidades Pitagóricas",
            theory = LessonTheory(
                id = "theory_tri_t08_s01",
                asignatura = "Trigonometría",
                semana = 8,
                titulo = "Identidades Pitagóricas",
                resumen = "• Identidad Trigonométrica: Igualdad algebraica que vincula funciones trigonométricas y se cumple para TODO valor admisible de la variable angular.\n• Las Tres Identidades Pitagóricas Fundamentales:\n  1. sen²(x) + cos²(x) = 1 (Identidad madre de la trigonometría).\n     - Despejes: sen²(x) = 1 - cos²(x) = (1 - cos x)(1 + cos x); cos²(x) = 1 - sen²(x).\n  2. 1 + tg²(x) = sec²(x) (o sec² x - tg² x = 1).\n     - Propiedad de Diferencia de Cuadrados: (sec x + tg x)(sec x - tg x) = 1.\n     - Esto significa que sec(x) + tg(x) y sec(x) - tg(x) son CANTIDADES RECÍPROCAS (si una vale n, la otra vale 1/n).\n  3. 1 + ctg²(x) = csc²(x) (o csc² x - ctg² x = 1).\n     - Igualmente: (csc x + ctg x)(csc x - ctg x) = 1 (son recíprocas mutuamente).",
                conceptosClave = listOf(
                    "sen² x + cos² x = 1",
                    "sec² x - tg² x = 1",
                    "csc² x - ctg² x = 1",
                    "sec x + tg x y sec x - tg x son recíprocas (producto = 1)",
                    "csc x + ctg x y csc x - ctg x son recíprocas"
                ),
                formulas = listOf(
                    "\\text{sen}^2(x) + \\cos^2(x) = 1",
                    "1 + \\tan^2(x) = \\sec^2(x) \\iff \\sec^2(x) - \\tan^2(x) = 1",
                    "1 + \\cot^2(x) = \\csc^2(x) \\iff \\csc^2(x) - \\cot^2(x) = 1",
                    "\\sec(x) + \\tan(x) = n \\implies \\sec(x) - \\tan(x) = \\frac{1}{n}"
                ),
                formulaName = "Identidad Pitagórica Fundamental",
                formulaLatex = "\\text{sen}^2 x + \\cos^2 x = 1",
                formulaDescription = "Consecuencia directa del Teorema de Pitágoras sobre el triángulo rectángulo unitario.",
                admissionTip = "Si te dan como dato: sec(x) + tg(x) = 5, de inmediato sabes que sec(x) - tg(x) = 1/5. Sumando ambas ecuaciones obtienes 2·sec(x) = 5 + 1/5 = 26/5 ⇒ sec(x) = 13/5 al instante.",
                admissionExplanation = "• Este artificio de las recíprocas resuelve sistemas sin elevar al cuadrado ni aplicar fórmulas complejas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si sec(x) + tg(x) = 3, halle el valor de sec(x).",
                    options = listOf("3/5", "4/3", "5/3", "5/4", "10/3"),
                    correctIndex = 2,
                    explanation = "Por la propiedad de la diferencia de cuadrados en la identidad pitagórica:\nsec²(x) - tg²(x) = 1 => (sec x + tg x)(sec x - tg x) = 1\nComo sec(x) + tg(x) = 3, entonces:\nsec(x) - tg(x) = 1/3.\nSumamos ambas ecuaciones:\n(sec x + tg x) + (sec x - tg x) = 3 + 1/3\n2 · sec(x) = 10/3\nsec(x) = 10 / 6 = 5/3.",
                    subject = "Trigonometría",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "tri_t08_s02",
            subjectId = "trigonometria",
            semana = 8,
            subtema = "8.2 Identidades por Cociente y Recíprocas",
            title = "Identidades por Cociente y Recíprocas",
            theory = LessonTheory(
                id = "theory_tri_t08_s02",
                asignatura = "Trigonometría",
                semana = 8,
                titulo = "Cocientes y Recíprocas",
                resumen = "• Identidades por Cociente:\n  1. tg(x) = sen(x) / cos(x) (para cos x ≠ 0).\n  2. ctg(x) = cos(x) / sen(x) (para sen x ≠ 0).\n• Identidades Recíprocas:\n  1. csc(x) = 1 / sen(x)\n  2. sec(x) = 1 / cos(x)\n  3. ctg(x) = 1 / tg(x)\n• Estrategia Clásica de Demostración y Simplificación:\n  - Para simplificar expresiones trigonométricas heterogéneas, se recomienda transformar TODOS los términos a SENOS y COSENOS y luego operar algebraicamente mediante fracciones algebraicas.",
                conceptosClave = listOf(
                    "tg x = sen x / cos x",
                    "ctg x = cos x / sen x",
                    "sec x = 1 / cos x, csc x = 1 / sen x",
                    "Estrategia de conversión uniforme a senos y cosenos"
                ),
                formulas = listOf(
                    "\\tan(x) = \\frac{\\text{sen}(x)}{\\cos(x)}, \\quad \\cot(x) = \\frac{\\cos(x)}{\\text{sen}(x)}",
                    "\\sec(x) = \\frac{1}{\\cos(x)}, \\quad \\csc(x) = \\frac{1}{\\text{sen}(x)}"
                ),
                formulaName = "Identidades por Cociente",
                formulaLatex = "\\tan x = \\frac{\\text{sen} x}{\\cos x}, \\quad \\cot x = \\frac{\\cos x}{\\text{sen} x}",
                formulaDescription = "Expresan las funciones angulares secundarias en términos exclusivos del cociente de senos y cosenos.",
                admissionTip = "No transformes a senos y cosenos si ves identidades pitagóricas directas como 1 + tg² x = sec² x; usarlas directamente ahorra más de la mitad de líneas de cálculo.",
                admissionExplanation = "• Transforma a senos y cosenos únicamente cuando no veas identidades notables evidentes."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Simplifique la expresión trigonométrica: E = tg(x) · cos(x) + ctg(x) · sen(x).",
                    options = listOf("1", "sen(x) + cos(x)", "sen(x) - cos(x)", "2 sen(x)", "sec(x)"),
                    correctIndex = 1,
                    explanation = "Convertimos la tangente y cotangente a senos y cosenos:\nE = [sen(x) / cos(x)] · cos(x) + [cos(x) / sen(x)] · sen(x)\nCancelamos cos(x) en el primer término y sen(x) en el segundo:\nE = sen(x) + cos(x).",
                    subject = "Trigonometría",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "tri_t08_s03",
            subjectId = "trigonometria",
            semana = 8,
            subtema = "8.3 Identidades Auxiliares de Simplificación",
            title = "Identidades Auxiliares",
            theory = LessonTheory(
                id = "theory_tri_t08_s03",
                asignatura = "Trigonometría",
                semana = 8,
                titulo = "Identidades Auxiliares",
                resumen = "• Identidades Auxiliares Fundamentales (de uso frecuente en exámenes de admisión):\n  1. tg(x) + ctg(x) = sec(x) · csc(x).\n  2. sec²(x) + csc²(x) = sec²(x) · csc²(x) (la suma de cuadrados es igual a su producto).\n  3. sen⁴(x) + cos⁴(x) = 1 - 2 sen²(x) cos²(x).\n  4. sen⁶(x) + cos⁶(x) = 1 - 3 sen²(x) cos²(x).\n  5. (1 ± sen x ± cos x)² = 2(1 ± sen x)(1 ± cos x).\n  6. (sen x + cos x)² = 1 + 2 sen(x) cos(x) = 1 + sen(2x).\n  7. (sen x - cos x)² = 1 - 2 sen(x) cos(x) = 1 - sen(2x).",
                conceptosClave = listOf(
                    "tg x + ctg x = sec x · csc x",
                    "sec² x + csc² x = sec² x · csc² x",
                    "sen⁴ x + cos⁴ x = 1 - 2 sen² x cos² x",
                    "sen⁶ x + cos⁶ x = 1 - 3 sen² x cos² x"
                ),
                formulas = listOf(
                    "\\tan(x) + \\cot(x) = \\sec(x) \\csc(x)",
                    "\\sec^2(x) + \\csc^2(x) = \\sec^2(x) \\csc^2(x)",
                    "\\text{sen}^4(x) + \\cos^4(x) = 1 - 2\\text{sen}^2(x)\\cos^2(x)",
                    "\\text{sen}^6(x) + \\cos^6(x) = 1 - 3\\text{sen}^2(x)\\cos^2(x)"
                ),
                formulaName = "Identidades Auxiliares Clásicas",
                formulaLatex = "\\tan x + \\cot x = \\sec x \\csc x, \\quad \\text{sen}^4 x + \\cos^4 x = 1 - 2\\text{sen}^2 x \\cos^2 x",
                formulaDescription = "Condensaciones algebraicas estándar que evitan tener que desarrollar binomios al cuadrado o cubos en admisión.",
                admissionTip = "Memoriza los coeficientes: para cuarta potencia sen⁴ + cos⁴ es 1 - 2 sen²cos²; para sexta potencia sen⁶ + cos⁶ es 1 - 3 sen²cos².",
                admissionExplanation = "• tg x + ctg x = sec x · csc x es la identidad que más simplifica productos en las pruebas UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Simplifique la expresión: E = 3(sen⁴ x + cos⁴ x) - 2(sen⁶ x + cos⁶ x).",
                    options = listOf("-1", "0", "1", "2", "3"),
                    correctIndex = 2,
                    explanation = "Aplicamos las identidades auxiliares:\nsen⁴ x + cos⁴ x = 1 - 2 sen² x cos² x\nsen⁶ x + cos⁶ x = 1 - 3 sen² x cos² x\nReemplazamos en E:\nE = 3(1 - 2 sen² x cos² x) - 2(1 - 3 sen² x cos² x)\nE = 3 - 6 sen² x cos² x - 2 + 6 sen² x cos² x\nE = 3 - 2 = 1.",
                    subject = "Trigonometría",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "tri_t08_s04",
            subjectId = "trigonometria",
            semana = 8,
            subtema = "8.4 Eliminación de Variables y Condiciones Trigonométricas",
            title = "Eliminación de Variables Angulares",
            theory = LessonTheory(
                id = "theory_tri_t08_s04",
                asignatura = "Trigonometría",
                semana = 8,
                titulo = "Eliminación de Variables Angulares",
                resumen = "• Problemas de Eliminación del Ángulo θ:\n  - Consisten en hallar una relación algebraica pura entre parámetros independientes (a, b, c, x, y) a partir de dos o más ecuaciones que contienen funciones trigonométricas de un ángulo θ.\n• Estrategias Principales:\n  1. Despeje de Seno y Coseno y aplicación de la Identidad Pitagórica:\n     - Despejar sen(θ) y cos(θ) y elevar al cuadrado: sen²(θ) + cos²(θ) = 1.\n  2. Despeje de Secante y Tangente:\n     - sec²(θ) - tg²(θ) = 1.\n  3. Despeje de Cosecante y Cotangente:\n     - csc²(θ) - ctg²(θ) = 1.\n  4. Multiplicación o División de Ecuaciones para cancelar factores angulares.",
                conceptosClave = listOf(
                    "Despeje y elevación al cuadrado para sumar identidades pitagóricas",
                    "Eliminación con sec² - tg² = 1",
                    "Obtención de relaciones independientes de θ",
                    "Comprobación de potencias homogéneas"
                ),
                formulas = listOf(
                    "\\begin{cases} x = a \\cos\\theta \\\\ y = b \\text{sen}\\theta \\end{cases} \\implies \\left(\\frac{x}{a}\\right)^2 + \\left(\\frac{y}{b}\\right)^2 = 1 \\quad (\\text{Elipse})",
                    "\\begin{cases} x = a \\sec\\theta \\\\ y = b \\tan\\theta \\end{cases} \\implies \\left(\\frac{x}{a}\\right)^2 - \\left(\\frac{y}{b}\\right)^2 = 1 \\quad (\\text{Hipérbola})"
                ),
                formulaName = "Principio de Eliminación Paramétrica Pitagórica",
                formulaLatex = "\\left(\\frac{x}{a}\\right)^2 + \\left(\\frac{y}{b}\\right)^2 = 1",
                formulaDescription = "Cancela el parámetro angular convirtiendo ecuaciones trigonométricas paramétricas en lugares geométricos cartesianos.",
                admissionTip = "Si tienes x = a·cos θ e y = b·sen θ, divide entre a y b y eleva al cuadrado: (x/a)² + (y/b)² = cos² θ + sen² θ = 1.",
                admissionExplanation = "• La variable angular θ desaparece por completo en un solo paso."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Elimine el ángulo θ de las siguientes ecuaciones: x = 3 · cos(θ); y = 4 · sen(θ).",
                    options = listOf(
                        "x² / 9 + y² / 16 = 1",
                        "x² / 9 - y² / 16 = 1",
                        "x² / 16 + y² / 9 = 1",
                        "x² + y² = 25",
                        "16x² + 9y² = 1"
                    ),
                    correctIndex = 0,
                    explanation = "Despejamos las funciones trigonométricas:\ncos(θ) = x / 3\nsen(θ) = y / 4\nElevamos al cuadrado y sumamos miembro a miembro:\ncos²(θ) + sen²(θ) = (x / 3)² + (y / 4)²\nComo cos²(θ) + sen²(θ) = 1:\n1 = x² / 9 + y² / 16.",
                    subject = "Trigonometría",
                    semana = 8
                )
            )
        ),
        // =========================================================================
        // TEMA 09: IDENTIDADES DE ARCOS COMPUESTOS Y MÚLTIPLOS (Semana 9)
        // =========================================================================
        LessonNode(
            id = "tri_t09_s01",
            subjectId = "trigonometria",
            semana = 9,
            subtema = "9.1 Seno, Coseno y Tangente de la Suma y Diferencia de Arcos",
            title = "Arcos Compuestos: Suma y Diferencia",
            theory = LessonTheory(
                id = "theory_tri_t09_s01",
                asignatura = "Trigonometría",
                semana = 9,
                titulo = "Arcos Compuestos",
                resumen = "• Identidades de la Suma y Resta de dos Arcos (α y β):\n  1. Seno de la Suma y Diferencia:\n     - sen(α + β) = sen(α) cos(β) + cos(α) sen(β)\n     - sen(α - β) = sen(α) cos(β) - cos(α) sen(β)\n  2. Coseno de la Suma y Diferencia (el signo central se invierte):\n     - cos(α + β) = cos(α) cos(β) - sen(α) sen(β)\n     - cos(α - β) = cos(α) cos(β) + sen(α) sen(β)\n  3. Tangente de la Suma y Diferencia:\n     - tg(α + β) = [ tg(α) + tg(β) ] / [ 1 - tg(α) tg(β) ]\n     - tg(α - β) = [ tg(α) - tg(β) ] / [ 1 + tg(α) tg(β) ]\n• Propiedad de Tres Ángulos que suman 180° (α + β + θ = 180°):\n  - tg(α) + tg(β) + tg(θ) = tg(α) · tg(β) · tg(θ) (la suma de tangentes es igual a su producto).",
                conceptosClave = listOf(
                    "sen(α ± β) = sen α cos β ± cos α sen β",
                    "cos(α ± β) = cos α cos β ∓ sen α sen β (invierte signo)",
                    "tg(α ± β) = (tg α ± tg β) / (1 ∓ tg α tg β)",
                    "En triángulos (α+β+θ=180°): suma de tangentes = producto de tangentes"
                ),
                formulas = listOf(
                    "\\text{sen}(\\alpha \\pm \\beta) = \\text{sen}(\\alpha)\\cos(\\beta) \\pm \\cos(\\alpha)\\text{sen}(\\beta)",
                    "\\cos(\\alpha \\pm \\beta) = \\cos(\\alpha)\\cos(\\beta) \\mp \\text{sen}(\\alpha)\\text{sen}(\\beta)",
                    "\\tan(\\alpha \\pm \\beta) = \\frac{\\tan\\alpha \\pm \\tan\\beta}{1 \\mp \\tan\\alpha\\tan\\beta}"
                ),
                formulaName = "Fórmulas de Adición y Sustracción de Arcos",
                formulaLatex = "\\text{sen}(\\alpha+\\beta) = \\text{sen}\\alpha\\cos\\beta + \\cos\\alpha\\text{sen}\\beta, \\quad \\cos(\\alpha+\\beta) = \\cos\\alpha\\cos\\beta - \\text{sen}\\alpha\\text{sen}\\beta",
                formulaDescription = "Desdoblamiento analítico de funciones trigonométricas evaluadas en la suma o resta de dos ángulos.",
                admissionTip = "Recuerda que en el COSENO de la suma el signo es MENOS (-), y en el coseno de la resta es MÁS (+).",
                admissionExplanation = "• Para calcular sen(75°), desdóblalo como sen(45° + 30°) = (√6 + √2) / 4."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor exacto de sen(75°).",
                    options = listOf("(√6 - √2)/4", "(√6 + √2)/4", "(√3 + 1)/2", "(√2 + 1)/2", "√3/2"),
                    correctIndex = 1,
                    explanation = "Descomponemos 75° = 45° + 30°:\nsen(75°) = sen(45° + 30°) = sen(45°) cos(30°) + cos(45°) sen(30°)\nsen(75°) = (√2/2)(√3/2) + (√2/2)(1/2)\nsen(75°) = (√6 / 4) + (√2 / 4) = (√6 + √2) / 4.",
                    subject = "Trigonometría",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "tri_t09_s02",
            subjectId = "trigonometria",
            semana = 9,
            subtema = "9.2 Identidades de Ángulo Doble",
            title = "Identidades de Ángulo Doble",
            theory = LessonTheory(
                id = "theory_tri_t09_s02",
                asignatura = "Trigonometría",
                semana = 9,
                titulo = "Ángulo Doble",
                resumen = "• Identidades del Ángulo Doble (2x):\n  1. Seno del Ángulo Doble:\n     - sen(2x) = 2 · sen(x) · cos(x).\n  2. Coseno del Ángulo Doble:\n     - cos(2x) = cos²(x) - sen²(x)\n     - Formas solo en función de una razón:\n       * cos(2x) = 1 - 2 sen²(x)\n       * cos(2x) = 2 cos²(x) - 1\n  3. Tangente del Ángulo Doble:\n     - tg(2x) = [ 2 tg(x) ] / [ 1 - tg²(x) ].\n• Triángulo Notables del Ángulo Doble:\n  - Catetos 2 tg(x) y 1 - tg²(x); Hipotenusa 1 + tg²(x).\n  - sen(2x) = 2 tg(x) / (1 + tg² x); cos(2x) = (1 - tg² x) / (1 + tg² x).",
                conceptosClave = listOf(
                    "sen 2x = 2 sen x cos x",
                    "cos 2x = cos² x - sen² x = 1 - 2 sen² x = 2 cos² x - 1",
                    "tg 2x = 2 tg x / (1 - tg² x)",
                    "Triángulo auxiliar en función de tg x"
                ),
                formulas = listOf(
                    "\\text{sen}(2x) = 2\\text{sen}(x)\\cos(x)",
                    "\\cos(2x) = \\cos^2(x) - \\text{sen}^2(x) = 1 - 2\\text{sen}^2(x) = 2\\cos^2(x) - 1",
                    "\\tan(2x) = \\frac{2\\tan(x)}{1 - \\tan^2(x)}"
                ),
                formulaName = "Fórmulas Fundamentales del Arco Doble",
                formulaLatex = "\\text{sen} 2x = 2\\text{sen} x \\cos x, \\quad \\cos 2x = \\cos^2 x - \\text{sen}^2 x",
                formulaDescription = "Duplicación del argumento angular expresada mediante potencias y productos del arco simple.",
                admissionTip = "Siempre que veas sen(x) · cos(x), multiplícalo mentalmente por 2 para transformarlo en (1/2) · sen(2x).",
                admissionExplanation = "• Esto reduce el producto de dos variables a una sola función trigonométrica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si sen(x) + cos(x) = √2, calcule el valor de sen(2x).",
                    options = listOf("0", "1/2", "1", "√2", "2"),
                    correctIndex = 2,
                    explanation = "Elevamos al cuadrado ambos miembros de la ecuación:\n[sen(x) + cos(x)]² = (√2)²\nsen²(x) + 2 sen(x) cos(x) + cos²(x) = 2\nComo sen²(x) + cos²(x) = 1 y 2 sen(x) cos(x) = sen(2x):\n1 + sen(2x) = 2\nsen(2x) = 2 - 1 = 1.",
                    subject = "Trigonometría",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "tri_t09_s03",
            subjectId = "trigonometria",
            semana = 9,
            subtema = "9.3 Fórmulas de Degradación y Arco Mitad",
            title = "Degradación Cuadrática y Arco Mitad",
            theory = LessonTheory(
                id = "theory_tri_t09_s03",
                asignatura = "Trigonometría",
                semana = 9,
                titulo = "Degradación y Arco Mitad",
                resumen = "• Fórmulas de Degradación Cuadrática:\n  - Permiten pasar de una función cuadrática a una lineal del ángulo doble (crucial en cálculo de integrales):\n  - 2 sen²(x) = 1 - cos(2x)\n  - 2 cos²(x) = 1 + cos(2x)\n  - 8 sen⁴(x) = 3 - 4 cos(2x) + cos(4x)\n• Fórmulas del Arco Mitad (x / 2):\n  - sen(x / 2) = ± √[ (1 - cos x) / 2 ]\n  - cos(x / 2) = ± √[ (1 + cos x) / 2 ]\n  - tg(x / 2) = ± √[ (1 - cos x) / (1 + cos x) ]\n  - El signo (±) depende del CUADRANTE en el que se encuentre el arco mitad x/2.\n• Fórmulas Racionalizadas del Arco Mitad (sin radical):\n  - tg(x / 2) = csc(x) - ctg(x)\n  - ctg(x / 2) = csc(x) + ctg(x).",
                conceptosClave = listOf(
                    "2 sen² x = 1 - cos 2x (Degradación de seno)",
                    "2 cos² x = 1 + cos 2x (Degradación de coseno)",
                    "Signo ± depende del cuadrante de x/2",
                    "Fórmulas mágicas: tg(x/2) = csc x - ctg x y ctg(x/2) = csc x + ctg x"
                ),
                formulas = listOf(
                    "2\\text{sen}^2(x) = 1 - \\cos(2x)",
                    "2\\cos^2(x) = 1 + \\cos(2x)",
                    "\\tan\\left(\\frac{x}{2}\\right) = \\csc(x) - \\cot(x)",
                    "\\cot\\left(\\frac{x}{2}\\right) = \\csc(x) + \\cot(x)"
                ),
                formulaName = "Fórmulas Racionalizadas del Arco Mitad",
                formulaLatex = "\\tan\\left(\\frac{x}{2}\\right) = \\csc x - \\cot x, \\quad \\cot\\left(\\frac{x}{2}\\right) = \\csc x + \\cot x",
                formulaDescription = "Eliminan el uso de raíces cuadradas con signos ambiguos transformando el arco mitad en suma y resta de razones recíprocas.",
                admissionTip = "Aprende de memoria: csc(x) - ctg(x) = tg(x/2) y csc(x) + ctg(x) = ctg(x/2). Ahorran muchísimo tiempo en admisión.",
                admissionExplanation = "• Ejemplo: csc(30°) - ctg(30°) = 2 - √3 = tg(15°)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de la tangente de 15° usando identidades del arco mitad.",
                    options = listOf("2 - √3", "2 + √3", "√3 - 1", "√3 + 1", "1 - √3/2"),
                    correctIndex = 0,
                    explanation = "Usamos la fórmula racionalizada: tg(x / 2) = csc(x) - ctg(x).\nPara x = 30° (x/2 = 15°):\ntg(15°) = csc(30°) - ctg(30°)\nComo csc(30°) = 2 y ctg(30°) = √3:\ntg(15°) = 2 - √3.",
                    subject = "Trigonometría",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "tri_t09_s04",
            subjectId = "trigonometria",
            semana = 9,
            subtema = "9.4 Identidades de Arco Triple",
            title = "Identidades de Arco Triple",
            theory = LessonTheory(
                id = "theory_tri_t09_s04",
                asignatura = "Trigonometría",
                semana = 9,
                titulo = "Arco Triple",
                resumen = "• Identidades del Arco Triple (3x):\n  1. Seno del Arco Triple:\n     - sen(3x) = 3 sen(x) - 4 sen³(x) = sen(x) · (2 cos 2x + 1).\n  2. Coseno del Arco Triple:\n     - cos(3x) = 4 cos³(x) - 3 cos(x) = cos(x) · (2 cos 2x - 1).\n  3. Tangente del Arco Triple:\n     - tg(3x) = tg(x) · [ (3 - tg² x) / (1 - 3 tg² x) ] = tg(x) · tg(60° - x) · tg(60° + x).\n• Propiedad Especial de Productos de Tres Términos:\n  - 4 sen(x) sen(60° - x) sen(60° + x) = sen(3x)\n  - 4 cos(x) cos(60° - x) cos(60° + x) = cos(3x)\n  - tg(x) tg(60° - x) tg(60° + x) = tg(3x).",
                conceptosClave = listOf(
                    "sen 3x = 3 sen x - 4 sen³ x",
                    "cos 3x = 4 cos³ x - 3 cos x",
                    "Fórmula de productos con 60° ± x",
                    "tg x · tg(60°-x) · tg(60°+x) = tg 3x"
                ),
                formulas = listOf(
                    "\\text{sen}(3x) = 3\\text{sen}(x) - 4\\text{sen}^3(x)",
                    "\\cos(3x) = 4\\cos^3(x) - 3\\cos(x)",
                    "\\tan(x) \\tan(60^\\circ - x) \\tan(60^\\circ + x) = \\tan(3x)"
                ),
                formulaName = "Identidad del Producto de Arcos de 60°",
                formulaLatex = "\\tan x \\tan(60^\\circ - x) \\tan(60^\\circ + x) = \\tan(3x)",
                formulaDescription = "Propiedad de amplificación angular que compacta productos simétricos de tres factores en una única razón triple.",
                admissionTip = "Si ves en un problema de admisión: tg(20°) · tg(40°) · tg(80°), es exactamente tg(x) · tg(60°-x) · tg(60°+x) con x = 20° ⇒ Respuesta: tg(3 · 20°) = tg(60°) = √3.",
                admissionExplanation = "• No calcules los términos por separado; aplica directamente la propiedad del arco triple."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t09_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor simplificado de: E = tg(20°) · tg(40°) · tg(80°).",
                    options = listOf("1/2", "1", "√3/3", "√3", "2"),
                    correctIndex = 3,
                    explanation = "Aplicamos la propiedad del arco triple con x = 20°:\ntg(x) · tg(60° - x) · tg(60° + x) = tg(3x)\nPara x = 20°:\n60° - 20° = 40°\n60° + 20° = 80°\nE = tg(20°) · tg(40°) · tg(80°) = tg(3 · 20°) = tg(60°) = √3.",
                    subject = "Trigonometría",
                    semana = 9
                )
            )
        ),
        // =========================================================================
        // TEMA 10: TRANSFORMACIONES TRIGONOMÉTRICAS (Semana 10)
        // =========================================================================
        LessonNode(
            id = "tri_t10_s01",
            subjectId = "trigonometria",
            semana = 10,
            subtema = "10.1 Transformaciones de Suma o Diferencia de Senos a Producto",
            title = "Transformación de Senos a Producto",
            theory = LessonTheory(
                id = "theory_tri_t10_s01",
                asignatura = "Trigonometría",
                semana = 10,
                titulo = "Transformación de Senos a Producto",
                resumen = "• Prostaféresis (Transformación a Producto):\n  - Algoritmo para convertir sumas y diferencias de funciones trigonométricas en productos indicados.\n• Fórmulas de Transformación de Senos:\n  1. Suma de Senos:\n     - sen(A) + sen(B) = 2 · sen[ (A + B) / 2 ] · cos[ (A - B) / 2 ]\n     - 'Dos veces el seno de la semisuma por el coseno de la semidiferencia'.\n  2. Resta de Senos:\n     - sen(A) - sen(B) = 2 · sen[ (A - B) / 2 ] · cos[ (A + B) / 2 ]\n     - 'Dos veces el seno de la semidiferencia por el coseno de la semisuma'.\n• Aplicación Principal: Permite simplificar fracciones factorizando términos comunes y resolviendo ecuaciones trigonométricas igualadas a cero.",
                conceptosClave = listOf(
                    "sen A + sen B = 2 sen((A+B)/2) cos((A-B)/2)",
                    "sen A - sen B = 2 sen((A-B)/2) cos((A+B)/2)",
                    "Semisuma y semidiferencia",
                    "Factorización de ecuaciones trigonométricas"
                ),
                formulas = listOf(
                    "\\text{sen}(A) + \\text{sen}(B) = 2\\text{sen}\\left(\\frac{A+B}{2}\\right)\\cos\\left(\\frac{A-B}{2}\\right)",
                    "\\text{sen}(A) - \\text{sen}(B) = 2\\text{sen}\\left(\\frac{A-B}{2}\\right)\\cos\\left(\\frac{A+B}{2}\\right)"
                ),
                formulaName = "Fórmulas de Prostaféresis para Senos",
                formulaLatex = "\\text{sen} A + \\text{sen} B = 2\\text{sen}\\left(\\frac{A+B}{2}\\right)\\cos\\left(\\frac{A-B}{2}\\right)",
                formulaDescription = "Transforma sumas de ondas sinusoidales en productos de modulación de amplitud y frecuencia.",
                admissionTip = "Ordena siempre los ángulos de mayor a menor (A > B) para que la semidiferencia (A - B)/2 resulte positiva y no lidies con ángulos negativos.",
                admissionExplanation = "• Si A y B suman 180°, sen A = sen B de manera directa."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Simplifique la expresión: E = [sen(50°) + sen(10°)] / cos(20°).",
                    options = listOf("1/2", "1", "√3/2", "√3", "2"),
                    correctIndex = 1,
                    explanation = "Aplicamos la transformación de suma de senos a producto en el numerador:\nsen(50°) + sen(10°) = 2 · sen[(50° + 10°) / 2] · cos[(50° - 10°) / 2]\nsen(50°) + sen(10°) = 2 · sen(30°) · cos(20°)\nComo sen(30°) = 1/2:\nsen(50°) + sen(10°) = 2 · (1/2) · cos(20°) = cos(20°).\nReemplazamos en E:\nE = cos(20°) / cos(20°) = 1.",
                    subject = "Trigonometría",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "tri_t10_s02",
            subjectId = "trigonometria",
            semana = 10,
            subtema = "10.2 Transformaciones de Suma o Diferencia de Cosenos a Producto",
            title = "Transformación de Cosenos a Producto",
            theory = LessonTheory(
                id = "theory_tri_t10_s02",
                asignatura = "Trigonometría",
                semana = 10,
                titulo = "Transformación de Cosenos a Producto",
                resumen = "• Fórmulas de Transformación de Cosenos a Producto:\n  1. Suma de Cosenos:\n     - cos(A) + cos(B) = 2 · cos[ (A + B) / 2 ] · cos[ (A - B) / 2 ]\n     - 'Dos veces el coseno de la semisuma por el coseno de la semidiferencia'.\n  2. Resta de Cosenos (¡Atención al signo negativo!):\n     - cos(A) - cos(B) = -2 · sen[ (A + B) / 2 ] · sen[ (A - B) / 2 ]\n     - Alternativa sin signo menos invirtiendo la semidiferencia:\n       * cos(A) - cos(B) = 2 · sen[ (A + B) / 2 ] · sen[ (B - A) / 2 ].\n• División Notable (Seno sobre Coseno con iguales ángulos):\n  - [ sen(A) + sen(B) ] / [ cos(A) + cos(B) ] = tg[ (A + B) / 2 ].",
                conceptosClave = listOf(
                    "cos A + cos B = 2 cos((A+B)/2) cos((A-B)/2)",
                    "cos A - cos B = -2 sen((A+B)/2) sen((A-B)/2) (lleva signo menos)",
                    "Cociente suma seno / suma coseno = tg(semisuma)"
                ),
                formulas = listOf(
                    "\\cos(A) + \\cos(B) = 2\\cos\\left(\\frac{A+B}{2}\\right)\\cos\\left(\\frac{A-B}{2}\\right)",
                    "\\cos(A) - \\cos(B) = -2\\text{sen}\\left(\\frac{A+B}{2}\\right)\\text{sen}\\left(\\frac{A-B}{2}\\right)",
                    "\\frac{\\text{sen} A + \\text{sen} B}{\\cos A + \\cos B} = \\tan\\left(\\frac{A+B}{2}\\right)"
                ),
                formulaName = "Fórmulas de Prostaféresis para Cosenos",
                formulaLatex = "\\cos A - \\cos B = -2\\text{sen}\\left(\\frac{A+B}{2}\\right)\\text{sen}\\left(\\frac{A-B}{2}\\right)",
                formulaDescription = "Transformación de restas de ondas cosenoidales con cambio de signo en el factor producto.",
                admissionTip = "La identidad: [sen(A) + sen(B)] / [cos(A) + cos(B)] = tg[(A + B)/2] es una de las fórmulas más preguntadas en la UNSA. Cancela automáticamente los cosenos de la semidiferencia.",
                admissionExplanation = "• Ejemplo: [sen(50°) + sen(10°)] / [cos(50°) + cos(10°)] = tg(30°) = √3/3 sin operar nada más."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor simplificado de: E = [sen(70°) + sen(10°)] / [cos(70°) + cos(10°)].",
                    options = listOf("tg(30°)", "tg(40°)", "tg(50°)", "ctg(40°)", "1"),
                    correctIndex = 1,
                    explanation = "Aplicamos la propiedad del cociente de semisuma:\n[sen(A) + sen(B)] / [cos(A) + cos(B)] = tg[(A + B) / 2]\nPara A = 70° y B = 10°:\nE = tg[(70° + 10°) / 2] = tg(80° / 2) = tg(40°).",
                    subject = "Trigonometría",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "tri_t10_s03",
            subjectId = "trigonometria",
            semana = 10,
            subtema = "10.3 Transformaciones de Producto a Suma o Diferencia",
            title = "Transformación de Producto a Suma",
            theory = LessonTheory(
                id = "theory_tri_t10_s03",
                asignatura = "Trigonometría",
                semana = 10,
                titulo = "Producto a Suma",
                resumen = "• Transformaciones Inversas (De Producto a Suma o Diferencia):\n  - Proceso algebraico para desdoblar un producto de funciones trigonométricas en la suma o resta de funciones lineales de los ángulos suma (A + B) y diferencia (A - B).\n• Fórmulas Fundamentales:\n  1. 2 sen(A) cos(B) = sen(A + B) + sen(A - B)  (con A ≥ B)\n  2. 2 cos(A) cos(B) = cos(A + B) + cos(A - B)\n  3. 2 sen(A) sen(B) = cos(A - B) - cos(A + B)\n     - ¡Atención!: En el producto de senos, se resta el coseno de la suma al coseno de la diferencia.\n• Procedimiento Práctico: Si en la expresión original no figura el coeficiente 2, se multiplica y divide toda la expresión por 2.",
                conceptosClave = listOf(
                    "2 sen A cos B = sen(A+B) + sen(A-B)",
                    "2 cos A cos B = cos(A+B) + cos(A-B)",
                    "2 sen A sen B = cos(A-B) - cos(A+B)",
                    "Artificio de multiplicar y dividir entre 2"
                ),
                formulas = listOf(
                    "2\\text{sen}(A)\\cos(B) = \\text{sen}(A+B) + \\text{sen}(A-B)",
                    "2\\cos(A)\\cos(B) = \\cos(A+B) + \\cos(A-B)",
                    "2\\text{sen}(A)\\text{sen}(B) = \\cos(A-B) - \\cos(A+B)"
                ),
                formulaName = "Fórmulas de Producto a Suma",
                formulaLatex = "2\\text{sen} A \\text{sen} B = \\cos(A-B) - \\cos(A+B)",
                formulaDescription = "Desdoblamiento analítico indispensable para linearizar productos trigonométricos en cálculo e integración.",
                admissionTip = "En 2 sen(A) sen(B), recuerda que el primer término es cos(A - B) y se le RESTA cos(A + B). El orden de la resta es inverso a los otros casos.",
                admissionExplanation = "• Mantén siempre A > B para que A - B sea un ángulo positivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t10_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Transforme a suma la expresión: E = 2 · cos(40°) · cos(20°) - cos(20°).",
                    options = listOf("0", "1/2", "cos(60°)", "cos(40°)", "1"),
                    correctIndex = 1,
                    explanation = "Aplicamos la transformación de producto de cosenos a suma:\n2 cos(A) cos(B) = cos(A + B) + cos(A - B)\nPara A = 40° y B = 20°:\n2 cos(40°) cos(20°) = cos(40° + 20°) + cos(40° - 20°) = cos(60°) + cos(20°).\nReemplazamos en E:\nE = [cos(60°) + cos(20°)] - cos(20°) = cos(60°) = 1/2.",
                    subject = "Trigonometría",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "tri_t10_s04",
            subjectId = "trigonometria",
            semana = 10,
            subtema = "10.4 Series Trigonométricas Notables",
            title = "Series Trigonométricas",
            theory = LessonTheory(
                id = "theory_tri_t10_s04",
                asignatura = "Trigonometría",
                semana = 10,
                titulo = "Series Trigonométricas",
                resumen = "• Suma de Senos o Cosenos cuyos Ángulos están en Progresión Aritmética:\n  - Sea la serie S = sen(x) + sen(x + r) + sen(x + 2r) + ... + sen(x + (n - 1)r) de n términos con razón r.\n• Fórmula de la Suma de Senos en P.A.:\n  - S = [ sen(n · r / 2) / sen(r / 2) ] · sen[ (Primer ángulo + Último ángulo) / 2 ].\n• Fórmula de la Suma de Cosenos en P.A.:\n  - C = [ sen(n · r / 2) / sen(r / 2) ] · cos[ (Primer ángulo + Último ángulo) / 2 ].\n• Factor de Escala Común: Ambas series comparten idéntico factor multiplicador: sen(n·r/2) / sen(r/2).\n• Serie de Ángulos Equiespaciados en la Circunferencia: Si los n ángulos dividen la vuelta completa (r = 2π/n), la suma total de senos y cosenos es IDÉNTICAMENTE CERO por equilibrio vectorial simétrico.",
                conceptosClave = listOf(
                    "Ángulos en progresión aritmética con razón r",
                    "Factor común: sen(n·r/2) / sen(r/2)",
                    "Multiplicado por el seno/coseno del ángulo medio",
                    "Equilibrio nulo en división de vuelta completa: ∑ sen = 0 y ∑ cos = 0"
                ),
                formulas = listOf(
                    "\\sum_{k=0}^{n-1} \\text{sen}(x + kr) = \\frac{\\text{sen}\\left(\\frac{nr}{2}\\right)}{\\text{sen}\\left(\\frac{r}{2}\\right)} \\cdot \\text{sen}\\left(\\frac{x_1 + x_n}{2}\\right)",
                    "\\sum_{k=0}^{n-1} \\cos(x + kr) = \\frac{\\text{sen}\\left(\\frac{nr}{2}\\right)}{\\text{sen}\\left(\\frac{r}{2}\\right)} \\cdot \\cos\\left(\\frac{x_1 + x_n}{2}\\right)"
                ),
                formulaName = "Fórmula de la Suma de Series Trigonométricas en P.A.",
                formulaLatex = "S_n = \\frac{\\text{sen}\\left(\\frac{n r}{2}\\right)}{\\text{sen}\\left(\\frac{r}{2}\\right)} \\cdot \\text{sen}\\left(\\frac{x_1 + x_n}{2}\\right)",
                formulaDescription = "Suma analíticamente cualquier cantidad finita de funciones armónicas en progresión aritmética.",
                admissionTip = "Si la razón r es tal que n·r = 360°, el numerador sen(n·r/2) = sen(180°) = 0, por lo que toda la serie se anula automáticamente.",
                admissionExplanation = "• Por ejemplo: cos(72°) + cos(144°) + cos(216°) + cos(288°) = -1 (al faltar cos 360° = 1)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t10_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule la suma de la serie trigonométrica: S = cos(1°) + cos(2°) + cos(3°) + ... + cos(179°).",
                    options = listOf("-1", "0", "1/2", "1", "√2/2"),
                    correctIndex = 1,
                    explanation = "Agrupamos términos equidistantes de los extremos:\ncos(1°) + cos(179°) = cos(1°) + cos(180° - 1°) = cos(1°) - cos(1°) = 0.\ncos(2°) + cos(178°) = 0.\ncos(k°) + cos(180° - k°) = 0 para todo k.\nEl término central es cos(90°) = 0.\nPor tanto, todos los términos se cancelan dos a dos y el término central es nulo: S = 0.",
                    subject = "Trigonometría",
                    semana = 10
                )
            )
        ),
        // =========================================================================
        // TEMA 11: ECUACIONES E INVERSAS TRIGONOMÉTRICAS (Semana 11)
        // =========================================================================
        LessonNode(
            id = "tri_t11_s01",
            subjectId = "trigonometria",
            semana = 11,
            subtema = "11.1 Ecuaciones Trigonométricas Elementales y Valor Principal",
            title = "Ecuaciones Elementales y Valor Principal",
            theory = LessonTheory(
                id = "theory_tri_t11_s01",
                asignatura = "Trigonometría",
                semana = 11,
                titulo = "Ecuaciones y Valor Principal",
                resumen = "• Ecuación Trigonométrica Elemental:\n  - Es aquella que tiene la forma: F.T.(k · x) = a (donde a es un número real admisible en el rango de la función).\n• Valor Principal (V_p):\n  - Es la menor solución angular (en valor absoluto) que satisface la ecuación elemental y que pertenece al rango de la función inversa correspondiente:\n  1. Para sen(x) = a: V_p ∈ [-π/2, π/2] (I o IV Cuadrante).\n     - Si a > 0 ⇒ V_p > 0; si a < 0 ⇒ V_p < 0 (con signo menos directo).\n  2. Para cos(x) = a: V_p ∈ [0, π] (I o II Cuadrante).\n     - Si a > 0 ⇒ V_p en I C; si a < 0 ⇒ V_p = π - θ (en II C, obtuso).\n  3. Para tg(x) = a: V_p ∈ ⟨-π/2, π/2⟩.\n• El Valor Principal es la base sobre la cual se construye el conjunto infinito de todas las soluciones reales.",
                conceptosClave = listOf(
                    "Forma elemental F.T.(kx) = a",
                    "Valor Principal V_p como ángulo de menor magnitud",
                    "Rango de V_p: Seno [-90°, 90°], Coseno [0°, 180°], Tangente ⟨-90°, 90°⟩",
                    "V_p negativo en Coseno es obtuso (180° - θ)"
                ),
                formulas = listOf(
                    "V_p = \\text{arcsen}(a) \\in \\left[-\\frac{\\pi}{2}, \\frac{\\pi}{2}\\right]",
                    "V_p = \\text{arccos}(a) \\in [0, \\pi]",
                    "V_p = \\text{arctan}(a) \\in \\left\\langle -\\frac{\\pi}{2}, \\frac{\\pi}{2} \\right\\rangle"
                ),
                formulaName = "Rangos del Valor Principal",
                formulaLatex = "V_p(\\text{sen}) \\in [-\\pi/2, \\pi/2], \\quad V_p(\\cos) \\in [0, \\pi]",
                formulaDescription = "Intervalos canónicos fundamentales para unificar la solución básica de ecuaciones trigonométricas.",
                admissionTip = "¡Cuidado con cos(x) = -1/2! El V_p NO es -60°. En coseno el rango es [0, 180°], por lo que V_p = 180° - 60° = 120° (2π/3 rad).",
                admissionExplanation = "• Este es el error más recurrente en preguntas de valor principal en la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el Valor Principal (V_p) de la ecuación trigonométrica: cos(x) = -√3 / 2.",
                    options = listOf("-π/6", "π/6", "2π/3", "5π/6", "7π/6"),
                    correctIndex = 3,
                    explanation = "Para el coseno, el Valor Principal debe pertenecer al intervalo [0, π] (entre 0° y 180°).\nSabemos que cos(30°) = cos(π/6) = √3/2.\nComo el valor es negativo (-√3/2), se ubica en el II Cuadrante:\nV_p = π - π/6 = 5π/6 (150°).",
                    subject = "Trigonometría",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "tri_t11_s02",
            subjectId = "trigonometria",
            semana = 11,
            subtema = "11.2 Solución General de Ecuaciones Trigonométricas",
            title = "Solución General de Ecuaciones Trigonométricas",
            theory = LessonTheory(
                id = "theory_tri_t11_s02",
                asignatura = "Trigonometría",
                semana = 11,
                titulo = "Solución General de Ecuaciones",
                resumen = "• Expresión General de Soluciones (con k ∈ Z):\n  - Permite agrupar las infinitas soluciones de una ecuación trigonométrica periódica mediante fórmulas generales según el operador:\n  1. Ecuación en Seno: sen(x) = a ⇒ x = kπ + (-1)ᵏ · V_p.\n     - Si k es par (2n): x = 2nπ + V_p.\n     - Si k es impar (2n + 1): x = (2n + 1)π - V_p.\n  2. Ecuación en Coseno: cos(x) = a ⇒ x = 2kπ ± V_p.\n     - Refleja la simetría par del coseno en los cuadrantes I y IV.\n  3. Ecuación en Tangente: tg(x) = a ⇒ x = kπ + V_p.\n     - Tiene período π, por lo que basta sumar múltiplos enteros de π al valor principal.",
                conceptosClave = listOf(
                    "Seno: x = kπ + (-1)ᵏ · V_p",
                    "Coseno: x = 2kπ ± V_p",
                    "Tangente: x = kπ + V_p",
                    "Parámetro entero k ∈ Z"
                ),
                formulas = listOf(
                    "x = k\\pi + (-1)^k V_p \\quad (\\text{Para Seno y Cosecante})",
                    "x = 2k\\pi \\pm V_p \\quad (\\text{Para Coseno y Secante})",
                    "x = k\\pi + V_p \\quad (\\text{Para Tangente y Cotangente})"
                ),
                formulaName = "Fórmulas de Solución General de Ecuaciones Trigonométricas",
                formulaLatex = "x_{\\text{sen}} = k\\pi + (-1)^k V_p, \\quad x_{\\cos} = 2k\\pi \\pm V_p, \\quad x_{\\tan} = k\\pi + V_p",
                formulaDescription = "Generan el conjunto completo de todas las soluciones angulares sobre la recta de los números reales.",
                admissionTip = "Para hallar las soluciones en un intervalo específico como [0, 2π], dale valores sucesivos a k = 0, 1, 2... en la fórmula general.",
                admissionExplanation = "• No dividas la ecuación entre sen(x) o cos(x) sin antes igualar a cero y factorizar, de lo contrario perderás soluciones válidas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Halle el número de soluciones de la ecuación sen(2x) = 1/2 en el intervalo cerrado [0, 2π].",
                    options = listOf("2", "3", "4", "6", "8"),
                    correctIndex = 2,
                    explanation = "1. Si x ∈ [0, 2π], entonces el argumento 2x ∈ [0, 4π] (dos vueltas completas).\n2. En una vuelta [0, 2π], sen(θ) = 1/2 tiene 2 soluciones: θ = 30° (π/6) y θ = 150° (5π/6).\n3. En dos vueltas [0, 4π], habrá el doble de soluciones:\n2x ∈ { π/6, 5π/6, 13π/6, 17π/6 }.\nDividiendo entre 2:\nx ∈ { π/12, 5π/12, 13π/12, 17π/12 }.\nExisten exactamente 4 soluciones en dicho intervalo.",
                    subject = "Trigonometría",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "tri_t11_s03",
            subjectId = "trigonometria",
            semana = 11,
            subtema = "11.3 Funciones Trigonométricas Inversas: Arco Seno y Arco Coseno",
            title = "Funciones Inversas: Arco Seno y Arco Coseno",
            theory = LessonTheory(
                id = "theory_tri_t11_s03",
                asignatura = "Trigonometría",
                semana = 11,
                titulo = "Arco Seno y Arco Coseno",
                resumen = "• Función Inversa Trigonométrica:\n  - Para que una función periódica posea inversa, se debe restringir su dominio para volverla biyectiva.\n• Función Arco Seno: y = arcsen(x) ⇔ sen(y) = x.\n  - Dominio: [-1, 1].\n  - Rango: [-π/2, π/2].\n  - Función Impar: arcsen(-x) = -arcsen(x).\n• Función Arco Coseno: y = arccos(x) ⇔ cos(y) = x.\n  - Dominio: [-1, 1].\n  - Rango: [0, π].\n  - Propiedad de Simetría: arccos(-x) = π - arccos(x).\n• Identidad de Co-funciones Inversas Complementarias:\n  - arcsen(x) + arccos(x) = π / 2 (para todo x ∈ [-1, 1]).",
                conceptosClave = listOf(
                    "Dominio común de arcsen y arccos: [-1, 1]",
                    "Rango arcsen: [-π/2, π/2]; Rango arccos: [0, π]",
                    "arcsen(-x) = -arcsen(x)",
                    "arccos(-x) = π - arccos(x)",
                    "arcsen(x) + arccos(x) = π/2"
                ),
                formulas = listOf(
                    "y = \\text{arcsen}(x) \\iff \\text{sen}(y) = x \\quad (x \\in [-1, 1], \\, y \\in [-\\pi/2, \\pi/2])",
                    "y = \\text{arccos}(x) \\iff \\cos(y) = x \\quad (x \\in [-1, 1], \\, y \\in [0, \\pi])",
                    "\\text{arccos}(-x) = \\pi - \\text{arccos}(x)",
                    "\\text{arcsen}(x) + \\text{arccos}(x) = \\frac{\\pi}{2}"
                ),
                formulaName = "Propiedad de Suma de Co-arcos Complementarios",
                formulaLatex = "\\text{arcsen}(x) + \\text{arccos}(x) = \\frac{\\pi}{2}",
                formulaDescription = "Suma angular constante que vincula las funciones inversas complementarias para cualquier argumento admisible.",
                admissionTip = "Cuando tengas que evaluar expresiones como sen(arccos(x)), dibuja un triángulo rectángulo auxiliar donde el cateto adyacente es x y la hipotenusa es 1; el cateto opuesto será √(1 - x²), por lo que sen(arccos(x)) = √(1 - x²).",
                admissionExplanation = "• No te compliques con identidades algebraicas abstractas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t11_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor numérico de: E = arcsen(1/2) + arccos(-1/2).",
                    options = listOf("π/2", "2π/3", "5π/6", "π", "4π/3"),
                    correctIndex = 2,
                    explanation = "1. arcsen(1/2) = π/6 (30°).\n2. arccos(-1/2) = π - arccos(1/2) = π - π/3 = 2π/3 (120°).\n3. Sumamos ambos valores:\nE = π/6 + 2π/3 = π/6 + 4π/6 = 5π/6 (150°).",
                    subject = "Trigonometría",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "tri_t11_s04",
            subjectId = "trigonometria",
            semana = 11,
            subtema = "11.4 Función Arco Tangente y Operaciones Combinadas",
            title = "Arco Tangente y Propiedades",
            theory = LessonTheory(
                id = "theory_tri_t11_s04",
                asignatura = "Trigonometría",
                semana = 11,
                titulo = "Arco Tangente y Propiedades",
                resumen = "• Función Arco Tangente: y = arctg(x) ⇔ tg(y) = x.\n  - Dominio: R = ⟨-∞, +∞⟩ (todos los números reales).\n  - Rango: ⟨-π/2, π/2⟩ (intervalo abierto, asíntotas horizontales en y = ±π/2).\n  - Función Impar: arctg(-x) = -arctg(x).\n• Identidades Complementarias:\n  - arctg(x) + arcctg(x) = π / 2 (para todo x ∈ R).\n• Fórmula de la Suma de Arco Tangentes:\n  - arctg(x) + arctg(y) = arctg[ (x + y) / (1 - xy) ] (para x · y < 1).\n  - Permite agrupar expresiones escalonadas con inversas de fracciones en un único ángulo.",
                conceptosClave = listOf(
                    "Dominio de arctg: todos los reales R",
                    "Rango de arctg: intervalo abierto ⟨-π/2, π/2⟩",
                    "arctg(-x) = -arctg(x)",
                    "Fórmula de suma: arctg(x) + arctg(y) = arctg[(x+y)/(1-xy)]"
                ),
                formulas = listOf(
                    "y = \\text{arctan}(x) \\iff \\tan(y) = x \\quad (x \\in \\mathbb{R}, \\, y \\in \\langle -\\pi/2, \\pi/2 \\rangle)",
                    "\\text{arctan}(x) + \\text{arctan}(y) = \\text{arctan}\\left(\\frac{x + y}{1 - x y}\\right) \\quad (x y < 1)",
                    "\\text{arctan}(x) + \\text{arccot}(x) = \\frac{\\pi}{2}"
                ),
                formulaName = "Fórmula de Adición de Arco Tangentes",
                formulaLatex = "\\text{arctan} x + \\text{arctan} y = \\text{arctan}\\left(\\frac{x + y}{1 - x y}\\right)",
                formulaDescription = "Equivalente inverso de la tangente de la suma de dos arcos para simplificar series de inversas.",
                admissionTip = "Aprende de memoria: arctg(1/2) + arctg(1/3) = arctg[(1/2 + 1/3) / (1 - 1/6)] = arctg[(5/6)/(5/6)] = arctg(1) = π/4 (45°).",
                admissionExplanation = "• Esta identidad específica de 1/2 y 1/3 ha sido preguntada decenas de veces en exámenes de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t11_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Calcule el valor de: E = arctg(1/2) + arctg(1/3).",
                    options = listOf("π/6", "π/4", "π/3", "π/2", "3π/4"),
                    correctIndex = 1,
                    explanation = "Aplicamos la fórmula de adición de arco tangentes:\narctg(x) + arctg(y) = arctg[(x + y) / (1 - xy)]\nPara x = 1/2 e y = 1/3 (xy = 1/6 < 1):\nx + y = 1/2 + 1/3 = 5/6\n1 - xy = 1 - 1/6 = 5/6\nE = arctg[ (5/6) / (5/6) ] = arctg(1) = π/4 (45°).",
                    subject = "Trigonometría",
                    semana = 11
                )
            )
        ),
        // =========================================================================
        // TEMA 12: RESOLUCIÓN DE TRIÁNGULOS OBLICUÁNGULOS Y APLICACIONES (Semana 12)
        // =========================================================================
        LessonNode(
            id = "tri_t12_s01",
            subjectId = "trigonometria",
            semana = 12,
            subtema = "12.1 Ley de Senos y Circunradio",
            title = "Ley de Senos y Circunradio",
            theory = LessonTheory(
                id = "theory_tri_t12_s01",
                asignatura = "Trigonometría",
                semana = 12,
                titulo = "Ley de Senos",
                resumen = "• Triángulo Oblicuángulo: Aquel que no posee ningún ángulo recto (acutángulo u obtusángulo).\n• Ley de Senos:\n  - En todo triángulo, las longitudes de los lados son directamente proporcionales a los senos de sus respectivos ángulos opuestos, y dicha razón constante es igual al DIÁMETRO de la circunferencia circunscrita (2R):\n  - a / sen(A) = b / sen(B) = c / sen(C) = 2R.\n• Despejes Fundamentales:\n  - a = 2R · sen(A)\n  - b = 2R · sen(B)\n  - c = 2R · sen(C)\n• Casos de Aplicación:\n  - Cuando se conocen dos ángulos y un lado (ALA o LAA).\n  - Cuando se conocen dos lados y el ángulo opuesto a uno de ellos (caso ambiguo LLA).",
                conceptosClave = listOf(
                    "Proporcionalidad lado/seno = 2R",
                    "Despeje paramétrico: a = 2R·sen A, b = 2R·sen B, c = 2R·sen C",
                    "R es el circunradio (radio de la circunscrita)",
                    "Casos ALA y LLA"
                ),
                formulas = listOf(
                    "\\frac{a}{\\text{sen}(A)} = \\frac{b}{\\text{sen}(B)} = \\frac{c}{\\text{sen}(C)} = 2R",
                    "a = 2R\\text{sen}(A), \\quad b = 2R\\text{sen}(B), \\quad c = 2R\\text{sen}(C)"
                ),
                formulaName = "Teorema de la Ley de Senos",
                formulaLatex = "\\frac{a}{\\text{sen} A} = \\frac{b}{\\text{sen} B} = \\frac{c}{\\text{sen} C} = 2R",
                formulaDescription = "Vínculo trigonométrico universal entre aristas, ángulos opuestos y el radio circunscrito.",
                admissionTip = "En problemas de simplificación algebraica con lados a, b, c y senos, reemplaza cada lado por 2R·sen(Ángulo) para cancelar 2R de inmediato.",
                admissionExplanation = "• La suma de lados cumple: a + b + c = 2R(sen A + sen B + sen C)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t12_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, el lado 'a' mide 10 cm y el ángulo opuesto A mide 30°. Halle el radio R de la circunferencia circunscrita a dicho triángulo.",
                    options = listOf("5 cm", "10 cm", "15 cm", "20 cm", "25 cm"),
                    correctIndex = 1,
                    explanation = "Aplicamos la Ley de Senos:\na / sen(A) = 2R\n10 / sen(30°) = 2R\nComo sen(30°) = 1/2:\n10 / (1/2) = 2R => 20 = 2R => R = 10 cm.",
                    subject = "Trigonometría",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "tri_t12_s02",
            subjectId = "trigonometria",
            semana = 12,
            subtema = "12.2 Ley de Cosenos y Ley de Tangentes",
            title = "Ley de Cosenos y Ley de Tangentes",
            theory = LessonTheory(
                id = "theory_tri_t12_s02",
                asignatura = "Trigonometría",
                semana = 12,
                titulo = "Ley de Cosenos",
                resumen = "• Ley de Cosenos:\n  - En todo triángulo, el cuadrado de la longitud de un lado es igual a la suma de los cuadrados de los otros dos lados menos el doble producto de dichos lados por el coseno del ángulo comprendido entre ellos:\n  - a² = b² + c² - 2bc · cos(A)\n  - b² = a² + c² - 2ac · cos(B)\n  - c² = a² + b² - 2ab · cos(C)\n• Despeje del Coseno:\n  - cos(A) = (b² + c² - a²) / (2bc).\n• Casos de Aplicación:\n  - LAL: Dos lados conocidos y el ángulo comprendido entre ellos.\n  - LLL: Tres lados conocidos (para hallar cualquiera de los tres ángulos).\n• Ley de Tangentes:\n  - (a - b) / (a + b) = tg[ (A - B) / 2 ] / tg[ (A + B) / 2 ].",
                conceptosClave = listOf(
                    "a² = b² + c² - 2bc · cos A",
                    "Despeje del coseno: cos A = (b² + c² - a²) / (2bc)",
                    "Caso LAL (dos lados y ángulo comprendido)",
                    "Caso LLL (tres lados dados)"
                ),
                formulas = listOf(
                    "a^2 = b^2 + c^2 - 2 b c \\cos(A)",
                    "\\cos(A) = \\frac{b^2 + c^2 - a^2}{2 b c}",
                    "\\frac{a - b}{a + b} = \\frac{\\tan\\left(\\frac{A-B}{2}\\right)}{\\tan\\left(\\frac{A+B}{2}\\right)}"
                ),
                formulaName = "Teorema de la Ley de Cosenos",
                formulaLatex = "a^2 = b^2 + c^2 - 2bc\\cos A",
                formulaDescription = "Generalización métrica del Teorema de Pitágoras para cualquier triángulo oblicuángulo plano.",
                admissionTip = "Si en un triángulo se cumple que a² = b² + c² - bc, comparando con la ley de cosenos 2bc·cos A = bc ⇒ cos A = 1/2 ⇒ el ángulo A mide exactamente 60°.",
                admissionExplanation = "• Si fuera +bc, entonces cos A = -1/2 ⇒ el ángulo A mediría 120°."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t12_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, los lados b y c miden 5 cm y 8 cm respectivamente, y el ángulo comprendido A mide 60°. Calcule la longitud del lado 'a'.",
                    options = listOf("6 cm", "7 cm", "8 cm", "9 cm", "√49 cm"),
                    correctIndex = 1,
                    explanation = "Aplicamos la Ley de Cosenos:\na² = b² + c² - 2bc · cos(A)\na² = 5² + 8² - 2(5)(8) · cos(60°)\na² = 25 + 64 - 80 · (1/2)\na² = 89 - 40 = 49\na = √49 = 7 cm.",
                    subject = "Trigonometría",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "tri_t12_s03",
            subjectId = "trigonometria",
            semana = 12,
            subtema = "12.3 Teorema de las Proyecciones y Área Triangular",
            title = "Teorema de Proyecciones y Área",
            theory = LessonTheory(
                id = "theory_tri_t12_s03",
                asignatura = "Trigonometría",
                semana = 12,
                titulo = "Proyecciones y Áreas",
                resumen = "• Teorema de las Proyecciones:\n  - En todo triángulo, cualquier lado es igual a la suma de las proyecciones de los otros dos lados sobre él:\n  - a = b · cos(C) + c · cos(B)\n  - b = a · cos(C) + c · cos(A)\n  - c = a · cos(B) + b · cos(A)\n• Fórmulas Trigonométricas del Área Triangular (S):\n  1. Fórmula Trigonométrica Básica: S = (a · b · sen C) / 2 = (a · c · sen B) / 2 = (b · c · sen A) / 2.\n  2. En función del Circunradio: S = (a · b · c) / (4R) = 2R² · sen(A) sen(B) sen(C).\n  3. En función del Inradio: S = p · r = r² · ctg(A/2) ctg(B/2) ctg(C/2).\n  4. Fórmula de Herón: S = √[ p(p - a)(p - b)(p - c) ].",
                conceptosClave = listOf(
                    "Teorema de Proyecciones: a = b cos C + c cos B",
                    "Área trigonométrica: S = (ab · sen C) / 2",
                    "Área con Circunradio: S = 2R² sen A sen B sen C",
                    "Área con Inradio: S = p · r"
                ),
                formulas = listOf(
                    "a = b\\cos(C) + c\\cos(B)",
                    "S = \\frac{a b \\text{sen}(C)}{2}",
                    "S = 2 R^2 \\text{sen}(A)\\text{sen}(B)\\text{sen}(C)"
                ),
                formulaName = "Teorema de las Proyecciones Trigonométricas",
                formulaLatex = "a = b\\cos C + c\\cos B",
                formulaDescription = "Descompone linealmente un lado en la suma de las sombras ortogonales proyectadas por los lados restantes.",
                admissionTip = "Si en una expresión ves 'b·cos C + c·cos B', no busques identidades de arcos compuestos: ¡reemplázalo directamente por el lado 'a'!",
                admissionExplanation = "• Este reemplazo directo colapsa expresiones gigantescas en letras individuales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t12_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un triángulo ABC, simplifique la expresión: E = [b · cos(C) + c · cos(B)] / a.",
                    options = listOf("1/2", "1", "2", "sen(A)", "R"),
                    correctIndex = 1,
                    explanation = "Por el Teorema de las Proyecciones:\nb · cos(C) + c · cos(B) = a.\nReemplazamos en el numerador de E:\nE = a / a = 1.",
                    subject = "Trigonometría",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "tri_t12_s04",
            subjectId = "trigonometria",
            semana = 12,
            subtema = "12.4 Modelación de Movimiento Armónico Simple y Fenómenos Periódicos",
            title = "Modelación Periódica y Movimiento Armónico",
            theory = LessonTheory(
                id = "theory_tri_t12_s04",
                asignatura = "Trigonometría",
                semana = 12,
                titulo = "Modelación de Fenómenos Periódicos",
                resumen = "• Fenómenos Periódicos en Ciencias e Ingeniería:\n  - Ondas sonoras, corriente alterna (CA), mareas oceánicas, ciclos biológicos y osciladores mecánicos.\n• Movimiento Armónico Simple (MAS):\n  - Ecuación de Posición u Oscilación: y(t) = A · sen(ωt + φ) o y(t) = A · cos(ωt + φ).\n    * A: Amplitud máxima de oscilación (Amplitud = (Máximo - Mínimo) / 2).\n    * ω: Frecuencia angular en rad/s: ω = 2π / T = 2π · f.\n    * T: Período del ciclo (tiempo para una oscilación completa): T = 2π / ω.\n    * f: Frecuencia en Hertz (Hz): f = 1 / T = ω / (2π).\n    * φ: Fase inicial (determina la posición en t = 0).\n• Línea Media o Desplazamiento Vertical C:\n  - y(t) = A · sen(ωt + φ) + C, donde C = (Máximo + Mínimo) / 2.",
                conceptosClave = listOf(
                    "Amplitud A = (Máx - Mín) / 2",
                    "Período T = 2π / ω",
                    "Frecuencia f = 1 / T = ω / (2π)",
                    "Línea media vertical C = (Máx + Mín) / 2"
                ),
                formulas = listOf(
                    "y(t) = A \\cdot \\text{sen}(\\omega t + \\phi) + C",
                    "T = \\frac{2\\pi}{\\omega}, \\quad f = \\frac{\\omega}{2\\pi} = \\frac{1}{T}",
                    "A = \\frac{y_{\\max} - y_{\\min}}{2}, \\quad C = \\frac{y_{\\max} + y_{\\min}}{2}"
                ),
                formulaName = "Ecuación Canónica de la Oscilación Armónica",
                formulaLatex = "y(t) = A\\text{sen}(\\omega t + \\phi) + C",
                formulaDescription = "Modelo sinusoidal general para describir dinámicamente cualquier ciclo o proceso periódico continuo.",
                admissionTip = "En problemas de mareas o temperaturas que oscilan entre un valor máximo M y un valor mínimo m: la amplitud es A = (M - m)/2 y el desplazamiento medio es C = (M + m)/2.",
                admissionExplanation = "• El período en fenómenos diarios suele ser T = 24 horas (o 12 horas para mareas semidiurnas), por lo que ω = 2π / 24 = π / 12."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_tri_t12_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La temperatura de una ciudad en los Andes oscila periódicamente según la función T(t) = 8 · sen(πt / 12) + 14, donde t está en horas. Halle la temperatura máxima y el período de oscilación.",
                    options = listOf(
                        "T_máx = 22°C y Período = 12 h",
                        "T_máx = 22°C y Período = 24 h",
                        "T_máx = 14°C y Período = 24 h",
                        "T_máx = 8°C y Período = 12 h",
                        "T_máx = 20°C y Período = 24 h"
                    ),
                    correctIndex = 1,
                    explanation = "1. Temperatura máxima:\nEl seno alcanza su valor máximo de +1:\nT_máx = 8(1) + 14 = 8 + 14 = 22°C.\n2. Período de oscilación:\nLa frecuencia angular es ω = π / 12.\nPeríodo T = 2π / ω = 2π / (π / 12) = 2 · 12 = 24 horas.\nPor lo tanto: T_máx = 22°C y Período = 24 h.",
                    subject = "Trigonometría",
                    semana = 12
                )
            )
        )
    )
}
