package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object FisicaCatalog {
    val lessons: List<LessonNode> = listOf(
        // ==========================================
        // SEMANA 1: ANÁLISIS DIMENSIONAL Y VECTORES
        // ==========================================
        LessonNode(
            id = "fis_t01_s01",
            subjectId = "fisica",
            semana = 1,
            subtema = "1.1 Magnitudes Fundamentales del SI y Ecuaciones Dimensionales",
            title = "Magnitudes del SI y Análisis Dimensional",
            theory = LessonTheory(
                id = "theory_fis_t01_s01",
                asignatura = "Física",
                semana = 1,
                titulo = "Magnitudes del SI y Análisis Dimensional",
                resumen = "El Sistema Internacional (SI) define 7 magnitudes fundamentales:\n1. Longitud [L] (metro, m)\n2. Masa [M] (kilogramo, kg)\n3. Tiempo [T] (segundo, s)\n4. Temperatura termodinámica [θ] (kelvin, K)\n5. Intensidad de corriente eléctrica [I] (ampere, A)\n6. Intensidad luminosa [J] (candela, cd)\n7. Cantidad de sustancia [N] (mol, mol).\n\n• Magnitudes Derivadas Clave de Admisión:\n- Área: [L²], Volumen: [L³]\n- Velocidad: [LT⁻¹], Aceleración: [LT⁻²]\n- Fuerza: [MLT⁻²] (Newton)\n- Trabajo, Energía y Calor: [ML²T⁻²] (Joule)\n- Potencia: [ML²T⁻³] (Watt)\n- Presión: [ML⁻¹T⁻²] (Pascal)\n- Frecuencia y Velocidad Angular: [T⁻¹] (Hz, rad/s)\n- Carga Eléctrica: [I T] (Coulomb)",
                conceptosClave = listOf(
                    "Siete dimensiones fundamentales del SI: L, M, T, θ, I, J, N",
                    "Fuerza [MLT⁻²], Energía [ML²T⁻²], Potencia [ML²T⁻³] y Presión [ML⁻¹T⁻²]",
                    "La carga eléctrica es magnitud derivada: [Q] = I · T"
                ),
                formulas = listOf(
                    "[F] = MLT^{-2}, \\quad [W] = ML^2 T^{-2}, \\quad [P] = ML^2 T^{-3}",
                    "[p] = ML^{-1} T^{-2}, \\quad [Q] = IT"
                ),
                formulaName = "Ecuaciones Dimensionales Notables",
                formulaLatex = "[Fuerza] = MLT^{-2}, \\quad [Energía] = ML^2 T^{-2}",
                formulaDescription = "Dimensiones mecánicas y electromagnéticas base en el análisis físico.",
                admissionTip = "Recuerda que magnitudes de distinta naturaleza física pueden tener la misma fórmula dimensional; por ejemplo: el Trabajo, la Energía y el Torque comparten [ML²T⁻²].",
                admissionExplanation = "• La masa no es peso: la masa es magnitud fundamental escalar [M], mientras que el peso es una fuerza vectorial gravitatoria de dimensión [MLT⁻²]."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el Sistema Internacional, la magnitud 'presión' se define como la fuerza normal por unidad de área. ¿Cuál es su fórmula dimensional correcta?",
                    options = listOf("MLT⁻²", "ML⁻¹T⁻²", "ML²T⁻²", "ML⁻²T⁻²", "ML⁻³"),
                    correctIndex = 1,
                    explanation = "[Presión] = [Fuerza] / [Área] = (MLT⁻²) / (L²) = ML⁻¹T⁻².",
                    subject = "Física",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "fis_t01_s02",
            subjectId = "fisica",
            semana = 1,
            subtema = "1.2 Principio de Homogeneidad de Fourier y Adimensionalidad",
            title = "Principio de Homogeneidad de Fourier",
            theory = LessonTheory(
                id = "theory_fis_t01_s02",
                asignatura = "Física",
                semana = 1,
                titulo = "Principio de Homogeneidad de Fourier",
                resumen = "• Principio de Homogeneidad (Fourier):\nEn toda ecuación física válida, los términos que se suman o restan deben tener la misma dimensión que el resultado final:\nSi A + B - C = D => [A] = [B] = [C] = [D].\n\n• Reglas de Adimensionalidad:\n- Los números reales puros, razones trigonométricas (sen, cos, tan), logaritmos y funciones exponenciales son adimensionales: [constante] = 1.\n- Los exponentes de potencias y los argumentos de funciones matemáticas deben ser siempre adimensionales: si e^(k·x) aparece en la fórmula, entonces [k·x] = 1 => [k] = [x]⁻¹.",
                conceptosClave = listOf(
                    "Principio de Fourier: suma y resta física exige igualdad dimensional estricta",
                    "Adimensionalidad de ángulos, números, razones trigonométricas y logaritmos ([k] = 1)",
                    "Los exponentes algebraicos son adimensionales por definición"
                ),
                formulas = listOf(
                    "A + B = C \\implies [A] = [B] = [C]",
                    "[\\text{sen}(\\alpha)] = 1, \\quad [\\log(x)] = 1, \\quad [e^{k t}] = 1 \\implies [k][t] = 1"
                ),
                formulaName = "Ley de Homogeneidad Dimensional",
                formulaLatex = "[A] = [B] = [C], \\quad [\\text{argumento}] = 1",
                formulaDescription = "Condición de consistencia física entre magnitudes que interactúan algebraicamente.",
                admissionTip = "Si en un problema te piden hallar [k] en la expresión sen(k·t), no necesitas conocer el resto de la fórmula: simplemente igualas el argumento a la unidad: [k·t] = 1 => [k] = T⁻¹.",
                admissionExplanation = "• No se pueden sumar 5 kilogramos con 3 metros; el principio de homogeneidad garantiza que cada miembro de la adición comparta idénticas unidades fundamentales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la ecuación física homogénea: d = v·t + (1/2)·a·t², donde 'd' es distancia y 't' es tiempo, la dimensión del término (1/2)·a·t² es:",
                    options = listOf("LT⁻¹", "LT⁻²", "L", "L²", "Adimensional"),
                    correctIndex = 2,
                    explanation = "Por el principio de homogeneidad de Fourier, cada sumando debe tener la misma dimensión que el primer miembro: [(1/2)·a·t²] = [d] = L.",
                    subject = "Física",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "fis_t01_s03",
            subjectId = "fisica",
            semana = 1,
            subtema = "1.3 Vectores: Operaciones Geométricas y Método del Paralelogramo",
            title = "Álgebra Vectorial y Método del Paralelogramo",
            theory = LessonTheory(
                id = "theory_fis_t01_s03",
                asignatura = "Física",
                semana = 1,
                titulo = "Álgebra Vectorial y Método del Paralelogramo",
                resumen = "Un vector es un ente matemático que posee magnitud (módulo), dirección (ángulo respecto al eje +X) y sentido.\n\n• Suma de dos vectores concurrentes (Método del Paralelogramo):\nR = √(A² + B² + 2AB cos θ)\n- Resultante Máxima (θ = 0°, vectores paralelos del mismo sentido): R_max = A + B.\n- Resultante Mínima (θ = 180°, vectores colineales opuestos): R_min = |A - B|.\n- Vectores Perpendiculares (θ = 90°): R = √(A² + B²).\n\n• Casos Notables con módulos iguales (|A| = |B| = k):\n- θ = 60° => R = k√3\n- θ = 90° => R = k√2\n- θ = 120° => R = k\n\n• Vector Diferencia:\nD = √(A² + B² - 2AB cos θ)",
                conceptosClave = listOf(
                    "Módulo de la resultante vectorial: R = √(A² + B² + 2AB cos θ)",
                    "Casos notables de módulos iguales: k√3 (60°), k√2 (90°), k (120°)",
                    "Resultante máxima R_max = A + B y mínima R_min = |A - B|"
                ),
                formulas = listOf(
                    "R = \\sqrt{A^2 + B^2 + 2AB\\cos(\\theta)}",
                    "D = \\sqrt{A^2 + B^2 - 2AB\\cos(\\theta)}"
                ),
                formulaName = "Ley del Paralelogramo de Vectores",
                formulaLatex = "R = \\sqrt{A^2 + B^2 + 2AB\\cos(\\theta)}",
                formulaDescription = "Determinación analítica de la resultante de dos vectores coplanares concurrentes.",
                admissionTip = "Si dos vectores de igual módulo forman 120°, la resultante tiene exactamente el mismo módulo que ellos y biseca el ángulo (60°). ¡Aparece con altísima frecuencia en CEPREUNSA!",
                admissionExplanation = "• Para tres o más vectores formando un polígono cerrado continuo cabeza con cola, la resultante total es el vector nulo: R = 0."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos vectores de igual módulo de 10 u forman entre sí un ángulo de 120°. El módulo del vector resultante es:",
                    options = listOf("10√3 u", "20 u", "10 u", "10√2 u", "5 u"),
                    correctIndex = 2,
                    explanation = "R = √(10² + 10² + 2(10)(10) cos 120°) = √(100 + 100 + 200(-1/2)) = √(200 - 100) = √100 = 10 u.",
                    subject = "Física",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "fis_t01_s04",
            subjectId = "fisica",
            semana = 1,
            subtema = "1.4 Descomposición Rectangular en 2D/3D y Producto Escalar",
            title = "Descomposición Rectangular y Producto Escalar",
            theory = LessonTheory(
                id = "theory_fis_t01_s04",
                asignatura = "Física",
                semana = 1,
                titulo = "Descomposición Rectangular y Producto Escalar",
                resumen = "• Descomposición Cartesiana Bidimensional:\nDado un vector A con ángulo de inclinación θ:\nA_x = A cos θ,   A_y = A sen θ\nVector cartesiano: A = A_x î + A_y ĵ = (A_x, A_y)\nMódulo: |A| = √(A_x² + A_y²)\nDirección: tan θ = A_y / A_x\n\n• Vector Unitario (û):\nVector de módulo 1 que indica la dirección: û = A / |A|.\n\n• Producto Escalar (Punto):\nA · B = |A| |B| cos θ = A_x B_x + A_y B_y + A_z B_z\nPropiedad fundamental: Si dos vectores no nulos son perpendiculares (ortogonales), su producto escalar es CERO: A · B = 0.",
                conceptosClave = listOf(
                    "Descomposición ortogonal cartesiana: A_x = A cos θ, A_y = A sen θ",
                    "Vector unitario û = A / |A| (módulo igual a la unidad)",
                    "Producto escalar nulo como criterio de ortogonalidad: A · B = 0"
                ),
                formulas = listOf(
                    "\\vec{A} = A_x \\hat{i} + A_y \\hat{j}, \\quad |\\vec{A}| = \\sqrt{A_x^2 + A_y^2}",
                    "\\vec{A} \\cdot \\vec{B} = |\\vec{A}||\\vec{B}|\\cos(\\theta) = A_x B_x + A_y B_y",
                    "\\vec{A} \\perp \\vec{B} \\iff \\vec{A} \\cdot \\vec{B} = 0"
                ),
                formulaName = "Producto Escalar y Ortogonalidad",
                formulaLatex = "\\vec{A} \\cdot \\vec{B} = A_x B_x + A_y B_y = |A||B|\\cos(\\theta)",
                formulaDescription = "Multiplicación escalar de vectores y condición geométrica de perpendicularidad.",
                admissionTip = "Para verificar si dos vectores son perpendiculares, multiplica sus componentes homólogas (x con x, y con y); si la suma algebraica es 0, el ángulo entre ellos es 90° exacto.",
                admissionExplanation = "• El producto escalar genera un número escalar (con signo), jamás un nuevo vector; para obtener un vector perpendicular se utiliza el producto vectorial."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dados los vectores A = (4, -2) y B = (3, k). Si se sabe que ambos vectores son perpendiculares entre sí, el valor del escalar 'k' es:",
                    options = listOf("6", "-6", "4", "-4", "12"),
                    correctIndex = 0,
                    explanation = "Por condición de perpendicularidad: A · B = 0 => (4)(3) + (-2)(k) = 0 => 12 - 2k = 0 => 2k = 12 => k = 6.",
                    subject = "Física",
                    semana = 1
                )
            )
        ),

        // ==========================================
        // SEMANA 2: CINEMÁTICA: MRU, MRUV Y GRÁFICAS
        // ==========================================
        LessonNode(
            id = "fis_t02_s01",
            subjectId = "fisica",
            semana = 2,
            subtema = "2.1 Movimiento Rectilíneo Uniforme (MRU) y Tiempos Simultáneos",
            title = "Movimiento Rectilíneo Uniforme (MRU)",
            theory = LessonTheory(
                id = "theory_fis_t02_s01",
                asignatura = "Física",
                semana = 2,
                titulo = "Movimiento Rectilíneo Uniforme (MRU)",
                resumen = "En el MRU la velocidad vectorial es rigurosamente constante (rapidez constante y trayectoria rectilínea sin cambio de dirección, aceleración nula a = 0).\n\n• Ecuación Escalar Fundamental:\nd = v · t\n(donde 'd' es distancia recorrida, 'v' rapidez y 't' tiempo).\nConversión de rapidez: 1 km/h = 5/18 m/s; 1 m/s = 18/5 km/h.\n\n• Tiempos Notables para dos móviles separados una distancia 'd':\n- Tiempo de Encuentro (movimiento en sentidos opuestos):\nt_e = d / (v₁ + v₂)\n- Tiempo de Alcance (movimiento en el mismo sentido con v₁ > v₂):\nt_a = d / (v₁ - v₂)\n\n• Cruce de Puentes o Túneles:\nDistancia total = Longitud del tren (L_tren) + Longitud del túnel (L_túnel): L_tren + L_túnel = v · t.",
                conceptosClave = listOf(
                    "Velocidad constante: vector invariable (rapidez y dirección constantes)",
                    "Factor de conversión de rapidez: multiplicar por 5/18 para pasar de km/h a m/s",
                    "Tiempos simultáneos: encuentro t_e = d/(v₁+v₂) y alcance t_a = d/(v₁-v₂)"
                ),
                formulas = listOf(
                    "d = v \\cdot t, \\quad t_e = \\frac{d}{v_1 + v_2}, \\quad t_a = \\frac{d}{v_1 - v_2}",
                    "1 \\text{ km/h} = \\frac{5}{18} \\text{ m/s}"
                ),
                formulaName = "Cinemática del MRU",
                formulaLatex = "d = v \\cdot t, \\quad t_e = \\frac{d}{v_1 + v_2}",
                formulaDescription = "Relación lineal espacio-tiempo en movimiento rectilíneo sin aceleración.",
                admissionTip = "Para calcular el tiempo que tarda un tren en cruzar completamente un túnel, la distancia que debe recorrer la trompa del tren es la suma de la longitud del tren más la del túnel.",
                admissionExplanation = "• En el tiempo de alcance, ambos móviles parten en el mismo instante y se desplazan en la misma dirección; el móvil perseguidor debe tener mayor rapidez (v₁ > v₂)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos autos separados 300 m parten simultáneamente al encuentro con rapideces constantes de 72 km/h y 108 km/h. ¿Al cabo de cuántos segundos se produce el encuentro?",
                    options = listOf("4 s", "6 s", "8 s", "10 s", "12 s"),
                    correctIndex = 1,
                    explanation = "Convertimos las rapideces: v₁ = 72 · (5/18) = 20 m/s; v₂ = 108 · (5/18) = 30 m/s.\nt_e = d / (v₁ + v₂) = 300 / (20 + 30) = 300 / 50 = 6 s.",
                    subject = "Física",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "fis_t02_s02",
            subjectId = "fisica",
            semana = 2,
            subtema = "2.2 Movimiento Rectilíneo Uniformemente Variado (MRUV)",
            title = "Movimiento Rectilíneo Uniformemente Variado",
            theory = LessonTheory(
                id = "theory_fis_t02_s02",
                asignatura = "Física",
                semana = 2,
                titulo = "Movimiento Rectilíneo Uniformemente Variado",
                resumen = "En el MRUV la aceleración es constante y colineal con la velocidad.\n\n• Cuatro Ecuaciones Escalares del MRUV:\n1. v_f = v_i ± a · t   (no interviene d)\n2. d = ((v_i + v_f) / 2) · t   (no interviene a)\n3. d = v_i · t ± (1/2) · a · t²   (no interviene v_f)\n4. v_f² = v_i² ± 2 · a · d   (no interviene t)\n\nCriterio de Signos:\n- Se usa '+' si el movimiento es acelerado (rapidez aumenta; velocidad y aceleración en el mismo sentido).\n- Se usa '-' si el movimiento es desacelerado o retardado (rapidez disminuye; frenado).",
                conceptosClave = listOf(
                    "Aceleración constante: cambio uniforme de rapidez por cada segundo de tiempo",
                    "Ecuaciones independientes de variables ausentes (sin d, sin a, sin v_f, sin t)",
                    "Signo positivo para aceleración y negativo para desaceleración o frenado"
                ),
                formulas = listOf(
                    "v_f = v_i \\pm a t, \\quad d = \\left(\\frac{v_i + v_f}{2}\\right) t",
                    "d = v_i t \\pm \\frac{1}{2} a t^2, \\quad v_f^2 = v_i^2 \\pm 2 a d"
                ),
                formulaName = "Cuarteto Fundamental del MRUV",
                formulaLatex = "v_f = v_i \\pm a t, \\quad d = v_i t \\pm \\frac{1}{2} a t^2",
                formulaDescription = "Ecuaciones cinemáticas con aceleración tangencial constante.",
                admissionTip = "Identifica qué variable NO te dan ni te piden en el problema: si no interviene el tiempo, usa de inmediato v_f² = v_i² ± 2ad; si no interviene la distancia, usa v_f = v_i ± at.",
                admissionExplanation = "• Cuando un móvil 'se detiene' o 'frena hasta parar', su rapidez final es cero (v_f = 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un móvil viaja con rapidez de 15 m/s y frena uniformemente deteniéndose luego de recorrer 45 m. ¿Cuál es el módulo de su desaceleración?",
                    options = listOf("1.5 m/s²", "2.5 m/s²", "3.0 m/s²", "4.0 m/s²", "5.0 m/s²"),
                    correctIndex = 1,
                    explanation = "Como frena hasta detenerse, v_f = 0.\nv_f² = v_i² - 2ad => 0 = 15² - 2·a·(45) => 90a = 225 => a = 225 / 90 = 2.5 m/s².",
                    subject = "Física",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "fis_t02_s03",
            subjectId = "fisica",
            semana = 2,
            subtema = "2.3 Números de Galileo y Distancia en el Enésimo Segundo",
            title = "Números de Galileo y el Enésimo Segundo",
            theory = LessonTheory(
                id = "theory_fis_t02_s03",
                asignatura = "Física",
                semana = 2,
                titulo = "Números de Galileo y el Enésimo Segundo",
                resumen = "• Distancia en el Enésimo Segundo (d_n):\nDistancia recorrida exclusivamente durante el segundo de orden 'n':\nd_n = v_i ± (a / 2) · (2n - 1)\n\n• Propiedad de Galileo Galilei (Partida del Reposo, v_i = 0):\nSi un cuerpo parte del reposo con aceleración constante 'a', las distancias recorridas en cada segundo consecutivo son proporcionales a los números impares consecutivos:\n1.° segundo: d₁ = (1/2) a (1) = k\n2.° segundo: d₂ = (1/2) a (3) = 3k\n3.° segundo: d₃ = (1/2) a (5) = 5k\n4.° segundo: d₄ = (1/2) a (7) = 7k\nEn general, para el enésimo segundo: d_n = (2n - 1) k.",
                conceptosClave = listOf(
                    "Fórmula del enésimo segundo: d_n = v_i ± (a/2)(2n - 1)",
                    "Proporción de Galileo para partida del reposo: k, 3k, 5k, 7k...",
                    "La distancia total acumulada tras n segundos es proporcional a n²"
                ),
                formulas = listOf(
                    "d_n = v_i \\pm \\frac{a}{2}(2n - 1)",
                    "\\text{Si } v_i = 0 \\implies d_1 : d_2 : d_3 : \\dots = 1 : 3 : 5 : (2n - 1)"
                ),
                formulaName = "Teorema de los Números de Galileo",
                formulaLatex = "d_n = v_i + \\frac{a}{2}(2n - 1), \\quad d_{\\text{consecutivos}} = k, 3k, 5k, \\dots",
                formulaDescription = "Cuantificación del espacio recorrido en intervalos unitarios discretos.",
                admissionTip = "Si un móvil parte del reposo y en el primer segundo recorre 4 metros (k = 4 m), en el 3.° segundo recorrerá 5k = 20 m, sin necesidad de aplicar complejas fórmulas.",
                admissionExplanation = "• No confundir la 'distancia en 4 segundos' (espacio acumulado total de 0 a 4 s: 16k) con la 'distancia en el 4.° segundo' (espacio entre t=3s y t=4s: 7k)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un ciclista parte del reposo con aceleración constante. Si en el primer segundo de su movimiento recorre 3 m, ¿cuántos metros recorre durante el cuarto segundo?",
                    options = listOf("9 m", "15 m", "21 m", "27 m", "48 m"),
                    correctIndex = 2,
                    explanation = "Por la regla de Galileo (v_i = 0), los espacios en cada segundo son k, 3k, 5k, 7k...\nSi d₁ = k = 3 m, entonces en el 4.° segundo recorre d₄ = 7k = 7(3) = 21 m.",
                    subject = "Física",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "fis_t02_s04",
            subjectId = "fisica",
            semana = 2,
            subtema = "2.4 Gráficas del Movimiento: x-t, v-t y a-t",
            title = "Análisis de Gráficas Cinemáticas",
            theory = LessonTheory(
                id = "theory_fis_t02_s04",
                asignatura = "Física",
                semana = 2,
                titulo = "Análisis de Gráficas Cinemáticas",
                resumen = "Las gráficas cinemáticas relacionan posición (x), velocidad (v) y aceleración (a) frente al tiempo (t):\n\n1. Gráfica Posición vs Tiempo (x - t):\n- La pendiente de la recta tangente representa la velocidad instantánea: v = tan α.\n- Línea recta inclinada => MRU (velocidad constante).\n- Parábola cóncava hacia arriba => MRUV acelerado (a > 0).\n- Parábola cóncava hacia abajo => MRUV retardado (a < 0).\n\n2. Gráfica Velocidad vs Tiempo (v - t):\n- La pendiente de la recta representa la aceleración: a = tan α.\n- El ÁREA bajo la curva entre dos instantes representa el desplazamiento (Δx = Área).\n\n3. Gráfica Aceleración vs Tiempo (a - t):\n- El ÁREA bajo la curva representa la variación de velocidad: Δv = v_f - v_i = Área.",
                conceptosClave = listOf(
                    "Gráfica x-t: pendiente = velocidad (v = tan α)",
                    "Gráfica v-t: pendiente = aceleración (a = tan α); área = desplazamiento (Δx)",
                    "Gráfica a-t: área = cambio de velocidad (Δv)"
                ),
                formulas = listOf(
                    "v = \\frac{dx}{dt} = \\tan(\\alpha) \\quad (\\text{en gráfica } x-t)",
                    "a = \\frac{dv}{dt} = \\tan(\\alpha) \\quad (\\text{en gráfica } v-t)",
                    "\\Delta x = \\text{Área}(v-t), \\quad \\Delta v = \\text{Área}(a-t)"
                ),
                formulaName = "Propiedades de Pendiente y Área Cinemática",
                formulaLatex = "v = \\tan(\\alpha)_{x-t}, \\quad a = \\tan(\\alpha)_{v-t}, \\quad \\Delta x = \\text{Área}_{v-t}",
                formulaDescription = "Interpretación geométrica del cálculo diferencial e integral aplicado al movimiento.",
                admissionTip = "En una gráfica v vs t, el área sobre el eje de tiempo suma como desplazamiento positivo (+), mientras que el área por debajo del eje resta como desplazamiento negativo (-).",
                admissionExplanation = "• Si en una gráfica x vs t la curva tiene pendiente horizontal (paralela al eje t), la velocidad es cero y el móvil se encuentra en reposo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una gráfica v vs t, un móvil parte desde el origen con v(0) = 0 y alcanza una rapidez de 20 m/s en t = 8 s en forma lineal. El desplazamiento total alcanzado en ese intervalo es:",
                    options = listOf("40 m", "80 m", "120 m", "160 m", "200 m"),
                    correctIndex = 1,
                    explanation = "El desplazamiento es el área bajo la gráfica v vs t (triángulo de base 8 s y altura 20 m/s):\nΔx = (base · altura) / 2 = (8 · 20) / 2 = 80 m.",
                    subject = "Física",
                    semana = 2
                )
            )
        ),

        // ==========================================
        // SEMANA 3: CAÍDA LIBRE Y TIRO PARABÓLICO
        // ==========================================
        LessonNode(
            id = "fis_t03_s01",
            subjectId = "fisica",
            semana = 3,
            subtema = "3.1 Movimiento Vertical de Caída Libre (MVCL)",
            title = "Movimiento Vertical de Caída Libre",
            theory = LessonTheory(
                id = "theory_fis_t03_s01",
                asignatura = "Física",
                semana = 3,
                titulo = "Movimiento Vertical de Caída Libre",
                resumen = "El MVCL es un caso de MRUV donde la única fuerza actuante es la gravedad terrestre (despreciando la resistencia del aire). Todos los cuerpos caen con la misma aceleración g ≈ 9.8 m/s² (se suele usar g = 10 m/s² en problemas preuniversitarios).\n\n• Fórmulas Escalares:\n1. v_f = v_i ± g · t\n2. h = ((v_i + v_f) / 2) · t\n3. h = v_i · t ± (1/2) · g · t²\n4. v_f² = v_i² ± 2 · g · h\n(Usar '+' si baja y '-' si sube).\n\n• Propiedades de Simetría en el Vacío:\n- A un mismo nivel horizontal: la rapidez de subida es exactamente igual a la de bajada (|v_subida| = |v_bajada|).\n- El tiempo que tarda en subir hasta la cima es igual al tiempo que tarda en bajar al mismo punto de lanzamiento (t_subida = t_bajada).",
                conceptosClave = listOf(
                    "Aceleración de gravedad g constante hacia el centro de la Tierra",
                    "Simetría temporal (t_subida = t_bajada) y de rapidez (|v_subida| = |v_bajada|)",
                    "En el punto más alto de la trayectoria vertical la rapidez es nula (v = 0)"
                ),
                formulas = listOf(
                    "v_f = v_i \\pm g t, \\quad h = v_i t \\pm \\frac{1}{2} g t^2",
                    "v_f^2 = v_i^2 \\pm 2 g h, \\quad t_{\\text{subida}} = \\frac{v_i}{g}"
                ),
                formulaName = "Ecuaciones del MVCL",
                formulaLatex = "v_f = v_i \\pm g t, \\quad h = v_i t \\pm \\frac{1}{2} g t^2",
                formulaDescription = "Dinámica unidimensional vertical bajo la aceleración gravitacional constante.",
                admissionTip = "Si se deja caer un cuerpo con g = 10 m/s², por cada segundo que transcurre su rapidez cambia en 10 m/s: 0 -> 10 -> 20 -> 30 m/s; y recorre 5 m, 15 m, 25 m, 35 m (números de Galileo multiplicados por 5).",
                admissionExplanation = "• En el punto de altura máxima la velocidad vertical se anula momentáneamente (v = 0), pero la aceleración NO es cero: sigue siendo g dirigida hacia abajo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se lanza verticalmente hacia arriba una piedra con rapidez de 40 m/s. Considerando g = 10 m/s², ¿qué rapidez tendrá al cabo de 3 segundos de movimiento?",
                    options = listOf("0 m/s", "10 m/s", "20 m/s", "30 m/s", "70 m/s"),
                    correctIndex = 1,
                    explanation = "Como va subiendo, desacelera: v_f = v_i - g·t = 40 - (10)(3) = 40 - 30 = 10 m/s.",
                    subject = "Física",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "fis_t03_s02",
            subjectId = "fisica",
            semana = 3,
            subtema = "3.2 Altura Máxima y Tiempo de Vuelo en Caída Libre",
            title = "Altura Máxima y Tiempo de Vuelo",
            theory = LessonTheory(
                id = "theory_fis_t03_s02",
                asignatura = "Física",
                semana = 3,
                titulo = "Altura Máxima y Tiempo de Vuelo",
                resumen = "Cuando un cuerpo es lanzado verticalmente hacia arriba con rapidez inicial v₀:\n\n• Tiempo de Subida (hasta que v_f = 0):\nt_s = v₀ / g\n\n• Tiempo de Vuelo (tiempo total en el aire retornando al mismo nivel):\nt_vuelo = 2 · t_s = (2 v₀) / g\n\n• Altura Máxima (H_max):\nH_max = v₀² / (2g)\n\n• Encuentro de dos móviles verticales:\nSe igualan las posiciones o se analiza la suma de sus distancias recorridas si parten en sentidos contrarios (uno soltado desde la cima y otro disparado desde la base): d_separación = v_relativa · t = v₀ · t.",
                conceptosClave = listOf(
                    "Tiempo de subida t_s = v₀ / g; tiempo de vuelo total t_vuelo = 2v₀ / g",
                    "Altura máxima H_max = v₀² / (2g)",
                    "Encuentro entre móvil que sube y móvil que cae: d = v₀ · t (las gravedades se cancelan en términos relativos)"
                ),
                formulas = listOf(
                    "t_s = \\frac{v_0}{g}, \\quad t_{\\text{vuelo}} = \\frac{2 v_0}{g}, \\quad H_{\\text{max}} = \\frac{v_0^2}{2g}"
                ),
                formulaName = "Fórmulas Extremas de Caída Libre",
                formulaLatex = "H_{\\text{max}} = \\frac{v_0^2}{2g}, \\quad t_{\\text{vuelo}} = \\frac{2v_0}{g}",
                formulaDescription = "Parámetros cinemáticos extremos alcanzados por proyectiles verticales simétricos.",
                admissionTip = "Si duplicas la rapidez de lanzamiento (de v₀ a 2v₀), el tiempo de vuelo se DUPLICA (2t), pero la altura máxima se CUADRUPLICA (4H_max), debido al exponente cuadrático v₀².",
                admissionExplanation = "• Cuando un móvil es soltado desde una altura H, tarda t = √(2H/g) en impactar el suelo con una rapidez de impacto v = √(2gH)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un proyectil lanzado verticalmente hacia arriba alcanza una altura máxima de 80 m. Considerando g = 10 m/s², ¿cuánto tiempo permanece en el aire hasta regresar al suelo?",
                    options = listOf("4 s", "6 s", "8 s", "10 s", "16 s"),
                    correctIndex = 2,
                    explanation = "H_max = v₀² / (2g) => 80 = v₀² / 20 => v₀² = 1600 => v₀ = 40 m/s.\nt_subida = 40 / 10 = 4 s.\nEl tiempo de vuelo total es t_vuelo = 2 · t_subida = 2(4) = 8 s.",
                    subject = "Física",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "fis_t03_s03",
            subjectId = "fisica",
            semana = 3,
            subtema = "3.3 Movimiento Parabólico: Principio de Independencia de Galileo",
            title = "Movimiento Parabólico de Caída Libre (MPCL)",
            theory = LessonTheory(
                id = "theory_fis_t03_s03",
                asignatura = "Física",
                semana = 3,
                titulo = "Movimiento Parabólico de Caída Libre (MPCL)",
                resumen = "El MPCL resulta de la superposición de dos movimientos independientes perpendiculares (Principio de Galileo Galilei):\n\n1. En el Eje Horizontal (X): MRU (aceleración a_x = 0).\n- Velocidad constante: v_x = v₀ cos θ\n- Posición horizontal: x = v_x · t = (v₀ cos θ) · t\n\n2. En el Eje Vertical (Y): MVCL (aceleración constante a_y = -g).\n- Velocidad inicial vertical: v_y0 = v₀ sen θ\n- Velocidad vertical en cualquier instante: v_y = v_y0 - g · t\n- Posición vertical: y = (v₀ sen θ) · t - (1/2) g t²\n\n• Vector Velocidad Total:\nv = √(v_x² + v_y²), con ángulo tan α = v_y / v_x.\nEn el punto más alto: v_y = 0, pero la velocidad NO es nula: v_cima = v_x = v₀ cos θ.",
                conceptosClave = listOf(
                    "Descomposición ortogonal: MRU en el eje X y MVCL en el eje Y",
                    "La componente horizontal v_x = v₀ cos θ permanece constante en todo el trayecto",
                    "En el vértice superior de la parábola la velocidad es mínima pero no nula: v = v_x"
                ),
                formulas = listOf(
                    "v_x = v_0 \\cos(\\theta), \\quad v_y = v_0 \\text{sen}(\\theta) - g t",
                    "x = (v_0 \\cos(\\theta)) t, \\quad y = (v_0 \\text{sen}(\\theta)) t - \\frac{1}{2} g t^2",
                    "v = \\sqrt{v_x^2 + v_y^2}"
                ),
                formulaName = "Principio de Independencia Galileana",
                formulaLatex = "v_x = v_0 \\cos(\\theta) = \\text{cte}, \\quad v_y = v_0 \\text{sen}(\\theta) - gt",
                formulaDescription = "Separación analítica del tiro oblicuo en componentes rectilíneas ortogonales.",
                admissionTip = "¡Cuidado en los exámenes! Cuando pregunten por la 'rapidez en el punto más alto', la respuesta NUNCA es cero; es exactamente igual a la rapidez horizontal v₀ cos θ.",
                admissionExplanation = "• El tiempo es el único parámetro escalar que conecta simultáneamente las ecuaciones del eje X y del eje Y."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un proyectil es disparado con una rapidez de 50 m/s bajo un ángulo de elevación de 37° (sen 37° = 0.6; cos 37° = 0.8). ¿Cuál es su rapidez al alcanzar la altura máxima?",
                    options = listOf("0 m/s", "30 m/s", "40 m/s", "50 m/s", "25 m/s"),
                    correctIndex = 2,
                    explanation = "En la altura máxima, v_y = 0. La rapidez total es solo la componente horizontal v_x:\nv_x = v₀ cos 37° = 50 · 0.8 = 40 m/s.",
                    subject = "Física",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "fis_t03_s04",
            subjectId = "fisica",
            semana = 3,
            subtema = "3.4 Alcance Horizontal Máximo y Ecuación de la Trayectoria",
            title = "Alcance Máximo y Trayectoria Parabólica",
            theory = LessonTheory(
                id = "theory_fis_t03_s04",
                asignatura = "Física",
                semana = 3,
                titulo = "Alcance Máximo y Trayectoria Parabólica",
                resumen = "• Tiempo de Vuelo en el MPCL:\nt_vuelo = (2 v₀ sen θ) / g\n\n• Altura Máxima (H_max):\nH_max = (v₀² sen² θ) / (2g)\n\n• Alcance Horizontal (R o D):\nR = v_x · t_vuelo = (v₀² sen 2θ) / g\n\n• Propiedades Notables de Admisión:\n1. Alcance Máximo: Para una misma rapidez de lanzamiento v₀, el alcance horizontal es MÁXIMO cuando el ángulo de tiro es θ = 45°:\nR_max = v₀² / g\n2. Ángulos Complementarios: Dos ángulos que suman 90° (ej. 30° y 60°, o 15° y 75°) logran exactamente el MISMO alcance horizontal (R_θ₁ = R_θ₂ si θ₁ + θ₂ = 90°).\n3. Relación de Proporción Clásica: tan θ = (4 H_max) / R.",
                conceptosClave = listOf(
                    "Alcance horizontal: R = (v₀² sen 2θ) / g; máximo con θ = 45°",
                    "Ángulos complementarios (θ₁ + θ₂ = 90°) producen el mismo alcance horizontal",
                    "Relación trigonométrica universal de la parábola: tan θ = 4 H_max / R"
                ),
                formulas = listOf(
                    "R = \\frac{v_0^2 \\text{sen}(2\\theta)}{g}, \\quad R_{\\text{max}} = \\frac{v_0^2}{g} \\; (\\theta = 45^\\circ)",
                    "\\tan(\\theta) = \\frac{4 H_{\\text{max}}}{R}, \\quad y = x\\tan(\\theta) - \\frac{g x^2}{2 v_0^2 \\cos^2(\\theta)}"
                ),
                formulaName = "Alcance y Ecuación de la Trayectoria",
                formulaLatex = "R = \\frac{v_0^2 \\text{sen}(2\\theta)}{g}, \\quad \\tan(\\theta) = \\frac{4 H_{\\text{max}}}{R}",
                formulaDescription = "Relaciones cinemáticas globales entre altura de elevación y alcance horizontal.",
                admissionTip = "Aprende de memoria la relación: tan θ = 4 H_max / R. Si un problema dice que la altura máxima es igual a la cuarta parte del alcance (H_max = R/4), entonces tan θ = 4(R/4)/R = 1 => θ = 45° al instante.",
                admissionExplanation = "• Si bien dos ángulos complementarios alcanzan la misma distancia horizontal, el tiro con mayor ángulo permanece más tiempo en el aire y alcanza mayor altura máxima."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un tiro parabólico, se observa que la altura máxima alcanzada es numéricamente igual al alcance horizontal (H_max = R). El ángulo de lanzamiento θ cumple que tan θ es:",
                    options = listOf("1", "2", "3", "4", "0.5"),
                    correctIndex = 3,
                    explanation = "Aplicando la relación fundamental: tan θ = (4 H_max) / R.\nComo H_max = R, reemplazamos: tan θ = 4 R / R = 4.",
                    subject = "Física",
                    semana = 3
                )
            )
        ),

        // ==========================================
        // SEMANA 4: MOVIMIENTO CIRCULAR (MCU Y MCUV)
        // ==========================================
        LessonNode(
            id = "fis_t04_s01",
            subjectId = "fisica",
            semana = 4,
            subtema = "4.1 Movimiento Circular Uniforme (MCU): Periodo, Frecuencia y Rapidez",
            title = "Cinemática Circular Uniforme (MCU)",
            theory = LessonTheory(
                id = "theory_fis_t04_s01",
                asignatura = "Física",
                semana = 4,
                titulo = "Cinemática Circular Uniforme (MCU)",
                resumen = "El MCU describe la trayectoria de una partícula sobre una circunferencia con rapidez constante (rapidez angular ω constante).\n\n• Parámetros Fundamentales:\n- Periodo (T): Tiempo que tarda el móvil en dar una vuelta completa (segundos, s).\n- Frecuencia (f): Número de vueltas por unidad de tiempo (Hz = 1/s o s⁻¹): f = 1 / T = n_vueltas / t.\n- Rapidez Angular (ω): Ángulo barrido por unidad de tiempo:\n  ω = θ / t = (2π rad) / T = 2π · f   (rad/s)\n- Rapidez Tangencial o Lineal (v): Longitud de arco recorrida por tiempo:\n  v = s / t = ω · R   (m/s)\n  (donde R es el radio de la trayectoria circular).",
                conceptosClave = listOf(
                    "Relación de periodo y frecuencia: f = 1/T (inversos)",
                    "Rapidez angular: ω = 2π / T = 2π f (en radianes por segundo)",
                    "Vínculo lineal-angular: v = ω · R (la rapidez tangencial crece con el radio)"
                ),
                formulas = listOf(
                    "f = \\frac{1}{T}, \\quad \\omega = \\frac{\\theta}{t} = \\frac{2\\pi}{T} = 2\\pi f",
                    "v = \\omega \\cdot R, \\quad s = \\theta \\cdot R"
                ),
                formulaName = "Relaciones Cinemáticas del MCU",
                formulaLatex = "\\omega = \\frac{2\\pi}{T} = 2\\pi f, \\quad v = \\omega R",
                formulaDescription = "Vínculo entre parámetros temporales, angulares y lineales en rotación.",
                admissionTip = "Para convertir RPM (revoluciones por minuto) a rad/s, multiplica por 2π y divide entre 60 (es decir, multiplica por π/30): 60 RPM = 2π rad/s.",
                admissionExplanation = "• En el MCU, aunque la rapidez (módulo de la velocidad) es constante, la VELOCIDAD VECTORIAL NO lo es, pues cambia continuamente de dirección."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una rueda de 0.5 m de radio gira a razón constante de 120 RPM. ¿Cuál es su rapidez tangencial en el borde?",
                    options = listOf("π m/s", "2π m/s", "3π m/s", "4π m/s", "8π m/s"),
                    correctIndex = 1,
                    explanation = "Convertimos ω: ω = 120 · (2π / 60) = 4π rad/s.\nRapidez tangencial: v = ω · R = (4π rad/s) · (0.5 m) = 2π m/s.",
                    subject = "Física",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "fis_t04_s02",
            subjectId = "fisica",
            semana = 4,
            subtema = "4.2 Aceleración Centrípeta en el Movimiento Curvilíneo",
            title = "Aceleración Centrípeta",
            theory = LessonTheory(
                id = "theory_fis_t04_s02",
                asignatura = "Física",
                semana = 4,
                titulo = "Aceleración Centrípeta",
                resumen = "• Aceleración Centrípeta o Radial (a_cp):\nEs la magnitud vectorial que mide la rapidez con que cambia la DIRECCIÓN del vector velocidad tangencial en una curva.\n- Siempre es perpendicular a la velocidad tangencial.\n- Apunta en todo instante hacia el CENTRO de la circunferencia.\n\n• Fórmulas de Cálculo:\na_cp = v² / R = ω² · R = v · ω\n\n• En el MCU:\n- No hay aceleración tangencial (a_t = 0), porque la rapidez no cambia.\n- La única aceleración que existe es la centrípeta: a_total = a_cp = constante en módulo (pero variable en dirección).",
                conceptosClave = listOf(
                    "La aceleración centrípeta cambia la dirección del vector velocidad, no su módulo",
                    "Fórmulas: a_cp = v²/R = ω²·R",
                    "Dirección estrictamente radial apuntando hacia el centro geométrico de giro"
                ),
                formulas = listOf(
                    "a_{\\text{cp}} = \\frac{v^2}{R} = \\omega^2 R = v \\cdot \\omega"
                ),
                formulaName = "Fórmula de la Aceleración Centrípeta",
                formulaLatex = "a_{\\text{cp}} = \\frac{v^2}{R} = \\omega^2 R",
                formulaDescription = "Aceleración debida exclusivamente al cambio continuo en la dirección del vector velocidad.",
                admissionTip = "Si la velocidad angular se duplica manteniendo el mismo radio, la aceleración centrípeta se CUADRUPLICA (a_cp ∝ ω²).",
                admissionExplanation = "• No existe movimiento circular sin aceleración centrípeta: si a_cp fuera cero, la partícula saldría disparada en línea recta por inercia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un cuerpo gira con MCU en una pista circular de 4 m de radio experimentando una rapidez tangencial de 6 m/s. El módulo de su aceleración centrípeta es:",
                    options = listOf("4.5 m/s²", "6.0 m/s²", "9.0 m/s²", "12.0 m/s²", "18.0 m/s²"),
                    correctIndex = 2,
                    explanation = "a_cp = v² / R = 6² / 4 = 36 / 4 = 9 m/s².",
                    subject = "Física",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "fis_t04_s03",
            subjectId = "fisica",
            semana = 4,
            subtema = "4.3 Movimiento Circular Uniformemente Variado (MCUV)",
            title = "Movimiento Circular Uniformemente Variado (MCUV)",
            theory = LessonTheory(
                id = "theory_fis_t04_s03",
                asignatura = "Física",
                semana = 4,
                titulo = "Movimiento Circular Uniformemente Variado (MCUV)",
                resumen = "En el MCUV la velocidad angular varía uniformemente en el tiempo debido a una aceleración angular constante (α = constante en rad/s²).\n\n• Ecuaciones Angulares del MCUV:\n1. ω_f = ω_i ± α · t\n2. θ = ((ω_i + ω_f) / 2) · t\n3. θ = ω_i · t ± (1/2) · α · t²\n4. ω_f² = ω_i² ± 2 · α · θ\n\n• Relaciones entre Magnitudes Angulares y Tangenciales:\n- s = θ · R   (arco recorrido)\n- v = ω · R   (rapidez tangencial)\n- a_t = α · R   (aceleración tangencial que altera el módulo de v)\n\n• Aceleración Lineal Total (a):\nComo a_t y a_cp son perpendiculares entre sí:\na_total = √(a_t² + a_cp²)",
                conceptosClave = listOf(
                    "Cuatro ecuaciones del MCUV análogas a las del MRUV pero en variables angulares (θ, ω, α)",
                    "Aceleración tangencial a_t = α·R (cambia el módulo de v)",
                    "Aceleración lineal total: a = √(a_t² + a_cp²)"
                ),
                formulas = listOf(
                    "\\omega_f = \\omega_i \\pm \\alpha t, \\quad \\theta = \\omega_i t \\pm \\frac{1}{2} \\alpha t^2",
                    "a_t = \\alpha R, \\quad a_{\\text{total}} = \\sqrt{a_t^2 + a_{\\text{cp}}^2}"
                ),
                formulaName = "Ecuaciones del MCUV y Aceleración Total",
                formulaLatex = "\\omega_f = \\omega_i \\pm \\alpha t, \\quad a = \\sqrt{a_t^2 + a_{\\text{cp}}^2}",
                formulaDescription = "Dinámica rotacional con aceleración angular constante y composición vectorial de aceleraciones.",
                admissionTip = "Para calcular el número de vueltas 'N' dadas por una rueda en un tiempo 't', calcula el ángulo total θ en radianes y divide entre 2π: N = θ / (2π).",
                admissionExplanation = "• En el MCUV existen simultáneamente dos aceleraciones: la tangencial a_t (tangente al círculo) y la centrípeta a_cp (hacia el centro)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un disco parte del reposo y acelera a razón constante de 4 rad/s². ¿Cuál es su rapidez angular al cabo de 5 segundos?",
                    options = listOf("10 rad/s", "15 rad/s", "20 rad/s", "25 rad/s", "50 rad/s"),
                    correctIndex = 2,
                    explanation = "Como parte del reposo, ω_i = 0.\nω_f = ω_i + α · t = 0 + (4 rad/s²) · (5 s) = 20 rad/s.",
                    subject = "Física",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "fis_t04_s04",
            subjectId = "fisica",
            semana = 4,
            subtema = "4.4 Transmisión de Movimiento Circular: Poleas y Engranajes",
            title = "Transmisión de Movimiento Circular",
            theory = LessonTheory(
                id = "theory_fis_t04_s04",
                asignatura = "Física",
                semana = 4,
                titulo = "Transmisión de Movimiento Circular",
                resumen = "Existen dos formas fundamentales de transmitir el movimiento entre dos ruedas A y B:\n\n1. Conexión Tangencial (Fajas, Correas o Engranajes de Dientes en Contacto):\n- Como no hay deslizamiento, comparten la misma rapidez tangencial:\nv_A = v_B => ω_A · R_A = ω_B · R_B\n- Las velocidades angulares son inversamente proporcionales a los radios o número de dientes (Z):\nω_A / ω_B = R_B / R_A = Z_B / Z_A\n- En engranajes en contacto: giran en sentidos opuestos.\n- Con faja abierta: giran en el mismo sentido; con faja cruzada: en sentidos opuestos.\n\n2. Conexión Concéntrica (Eje Común o Soldadas):\n- Ambas ruedas giran solidariamente en torno al mismo eje en el mismo tiempo:\nω_A = ω_B => v_A / R_A = v_B / R_B\n- La rueda de mayor radio tendrá mayor rapidez tangencial en su borde periférico.",
                conceptosClave = listOf(
                    "Ruedas unidas por faja o engranaje: misma rapidez tangencial (v_A = v_B => ω_A R_A = ω_B R_B)",
                    "Ruedas con eje común concéntrico: misma velocidad angular (ω_A = ω_B)",
                    "Relación de dientes en engranajes: ω_A Z_A = ω_B Z_B"
                ),
                formulas = listOf(
                    "\\text{Faja/Contacto}: \\; v_A = v_B \\implies \\omega_A R_A = \\omega_B R_B",
                    "\\text{Mismo Eje}: \\; \\omega_A = \\omega_B \\implies \\frac{v_A}{R_A} = \\frac{v_B}{R_B}"
                ),
                formulaName = "Leyes de Transmisión Rotacional",
                formulaLatex = "\\omega_A R_A = \\omega_B R_B \\; (\\text{faja}), \\quad \\omega_A = \\omega_B \\; (\\text{eje común})",
                formulaDescription = "Mecanismos cinemáticos de acoplamiento de ruedas en transmisiones mecánicas.",
                admissionTip = "Regla mnemotécnica rápida: Si están 'pegadas por el centro', tienen igual ω; si están 'tocándose por los bordes o con cadena', tienen igual v.",
                admissionExplanation = "• Una bicicleta transmite el movimiento de los pedales al piñón trasero mediante cadena (igual v), y del piñón a la rueda trasera por eje concéntrico (igual ω)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos poleas de radios R_A = 10 cm y R_B = 30 cm están conectadas mediante una faja inextensible sin resbalar. Si la polea menor A gira a 60 RPM, ¿a qué frecuencia gira la polea mayor B?",
                    options = listOf("10 RPM", "20 RPM", "30 RPM", "120 RPM", "180 RPM"),
                    correctIndex = 1,
                    explanation = "Por transmisión tangencial con faja: ω_A · R_A = ω_B · R_B.\n(60 RPM) · (10 cm) = ω_B · (30 cm) => 600 = 30 · ω_B => ω_B = 20 RPM.",
                    subject = "Física",
                    semana = 4
                )
            )
        ),

        // ==========================================
        // SEMANA 5: ESTÁTICA Y CONDICIONES DE EQUILIBRIO
        // ==========================================
        LessonNode(
            id = "fis_t05_s01",
            subjectId = "fisica",
            semana = 5,
            subtema = "5.1 Fuerzas Fundamentales, DCL y Ley de Hooke",
            title = "Fuerzas, DCL y Ley de Hooke",
            theory = LessonTheory(
                id = "theory_fis_t05_s01",
                asignatura = "Física",
                semana = 5,
                titulo = "Fuerzas, DCL y Ley de Hooke",
                resumen = "La fuerza es una magnitud vectorial que mide la interacción entre dos cuerpos.\n\n• Diagrama de Cuerpo Libre (DCL):\nAislar imaginariamente al cuerpo y graficar todas las fuerzas externas que actúan sobre él:\n1. Peso (F_g): Vertical hacia abajo, aplicada en el centro de gravedad: F_g = m · g.\n2. Tensión (T): Se dibuja a lo largo de una cuerda o cable saliendo del cuerpo analizado.\n3. Reacción Normal (N): Perpendicular a la superficie de contacto y empujando al cuerpo.\n4. Fuerza Elástica (F_e): En resortes deformados (Ley de Robert Hooke):\n   F_e = k · x\n   (donde k es la constante de rigidez en N/m y x la deformación longitudinal en metros). Se opone a la deformación.",
                conceptosClave = listOf(
                    "DCL riguroso: peso vertical, tensión saliente, normal perpendicular hacia el cuerpo",
                    "Ley de Hooke: F_e = k · x (fuerza recuperadora directamente proporcional a la deformación)",
                    "Tercera Ley de Newton: las fuerzas siempre ocurren en pares acción-reacción sobre cuerpos distintos"
                ),
                formulas = listOf(
                    "F_g = m \\cdot g, \\quad F_e = k \\cdot x \\quad (\\text{Ley de Hooke})"
                ),
                formulaName = "Fuerza Gravitatoria y Elástica",
                formulaLatex = "P = mg, \\quad F_e = k x",
                formulaDescription = "Cuantificación de las fuerzas mecánicas de contacto y gravitacionales.",
                admissionTip = "Al cortar imaginariamente una cuerda, la tensión SIEMPRE jala al cuerpo analizado; nunca empuja una cuerda flexible.",
                admissionExplanation = "• Si se unen dos resortes en serie: 1/k_eq = 1/k₁ + 1/k₂; si se unen en paralelo: k_eq = k₁ + k₂."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un resorte de constante de rigidez k = 200 N/m se estira 5 cm al colgarle una masa 'm'. Considerando g = 10 m/s², ¿cuál es el valor de la masa 'm' en equilibrio?",
                    options = listOf("0.5 kg", "1.0 kg", "2.0 kg", "5.0 kg", "10.0 kg"),
                    correctIndex = 1,
                    explanation = "Convertimos x = 5 cm = 0.05 m.\nEn equilibrio, la fuerza elástica compensa el peso: F_e = P => k · x = m · g => (200)(0.05) = m(10) => 10 = 10m => m = 1.0 kg.",
                    subject = "Física",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "fis_t05_s02",
            subjectId = "fisica",
            semana = 5,
            subtema = "5.2 Primera Condición de Equilibrio y Teorema de Lamy",
            title = "Primera Condición de Equilibrio",
            theory = LessonTheory(
                id = "theory_fis_t05_s02",
                asignatura = "Física",
                semana = 5,
                titulo = "Primera Condición de Equilibrio",
                resumen = "Un cuerpo se encuentra en equilibrio traslacional cuando su aceleración lineal es cero (reposo o MRU).\n\n• Primera Condición de Equilibrio:\nLa fuerza neta o resultante debe ser nula:\nΣ F = 0 => Σ F_x = 0  y  Σ F_y = 0\n(Fuerzas a la derecha = Fuerzas a la izquierda; Fuerzas hacia arriba = Fuerzas hacia abajo).\n\n• Tres Fuerzas Coplanares Concurrentes:\nSi sobre un cuerpo en equilibrio actúan solo 3 fuerzas coplanares no paralelas, estas deben ser concurrentes y forman un polígono cerrado (triángulo de fuerzas):\n- Teorema de Lamy (Ley de senos en estática):\nF₁ / sen α = F₂ / sen β = F₃ / sen γ\n(donde cada ángulo está opuesto a su respectiva fuerza).",
                conceptosClave = listOf(
                    "Equilibrio traslacional: Σ F = 0 (Σ F_x = 0, Σ F_y = 0)",
                    "Triángulo de fuerzas: tres fuerzas concurrentes forman un polígono vectorial cerrado",
                    "Teorema de Lamy: F₁/sen α = F₂/sen β = F₃/sen γ"
                ),
                formulas = listOf(
                    "\\sum \\vec{F} = 0 \\implies \\sum F_x = 0, \\quad \\sum F_y = 0",
                    "\\frac{F_1}{\\text{sen}(\\alpha)} = \\frac{F_2}{\\text{sen}(\\beta)} = \\frac{F_3}{\\text{sen}(\\gamma)} \\quad (\\text{Lamy})"
                ),
                formulaName = "Primera Condición de Equilibrio Mecánico",
                formulaLatex = "\\sum \\vec{F} = 0, \\quad \\frac{F_1}{\\text{sen}(\\alpha)} = \\frac{F_2}{\\text{sen}(\\beta)}",
                formulaDescription = "Equilibrio estático de traslación y resolución trigonométrica de fuerzas.",
                admissionTip = "Si en un problema hay tres fuerzas y dos de ellas son perpendiculares entre sí formando un ángulo notable de 37°/53° o 30°/60°, dibuja el triángulo de fuerzas y resuélvelo por razones trigonométricas directas en 10 segundos.",
                admissionExplanation = "• El equilibrio estático no significa necesariamente ausencia de fuerzas, sino compensación mutua de todas las acciones mecánicas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un bloque de 60 N de peso está suspendido por dos cuerdas simétricas que forman cada una un ángulo de 30° con el techo horizontal. ¿Cuál es la tensión en cada cuerda?",
                    options = listOf("30 N", "45 N", "60 N", "90 N", "120 N"),
                    correctIndex = 2,
                    explanation = "Por simetría, ambas cuerdas tienen la misma tensión T.\nEn el eje vertical: Σ F_y = 0 => 2 · T · sen 30° = 60 N => 2 · T · (1/2) = 60 => T = 60 N.",
                    subject = "Física",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "fis_t05_s03",
            subjectId = "fisica",
            semana = 5,
            subtema = "5.3 Fuerza de Rozamiento: Estático Máximo y Cinético",
            title = "Rozamiento Estático y Cinético",
            theory = LessonTheory(
                id = "theory_fis_t05_s03",
                asignatura = "Física",
                semana = 5,
                titulo = "Rozamiento Estático y Cinético",
                resumen = "La fuerza de rozamiento (f) se opone al deslizamiento relativo entre dos superficies rugosas en contacto.\n\n• Rozamiento Estático (f_s):\nActúa cuando los cuerpos están en reposo relativo. Varía desde cero hasta un valor límite máximo:\n0 ≤ f_s ≤ f_s_max\n- Fuerza de Rozamiento Estático Máximo:\nf_s_max = μ_s · N\n(donde μ_s es el coeficiente de rozamiento estático y N la fuerza normal). Se presenta cuando el cuerpo está a punto de deslizar (movimiento inminente).\n\n• Rozamiento Cinético (f_k):\nActúa una vez que el cuerpo ya se encuentra resbalando o en movimiento:\nf_k = μ_k · N\n- Propiedad fundamental: μ_s > μ_k (siempre es más difícil iniciar el movimiento que mantenerlo).",
                conceptosClave = listOf(
                    "Fuerza de rozamiento siempre paralela a la superficie y opuesta a la tendencia de deslizamiento",
                    "Rozamiento estático máximo en movimiento inminente: f_s_max = μ_s · N",
                    "Rozamiento cinético constante: f_k = μ_k · N (con μ_s > μ_k)"
                ),
                formulas = listOf(
                    "f_{s\\text{ máx}} = \\mu_s \\cdot N, \\quad f_k = \\mu_k \\cdot N, \\quad \\mu_s > \\mu_k"
                ),
                formulaName = "Leyes del Rozamiento Seco (Amontons-Coulomb)",
                formulaLatex = "f_{s\\text{ máx}} = \\mu_s N, \\quad f_k = \\mu_k N",
                formulaDescription = "Modelado de la fricción superficial en estados de reposo inminente y deslizamiento.",
                admissionTip = "Si un bloque está en reposo y se le aplica una fuerza horizontal de 10 N pero su f_s_max es 40 N, la fuerza de rozamiento real en ese instante es de exactamente 10 N (no 40 N), pues el cuerpo permanece en equilibrio.",
                admissionExplanation = "• Los coeficientes de rozamiento μ son números puros adimensionales que dependen exclusivamente del material y la rugosidad de las superficies en contacto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un bloque de 8 kg reposa sobre una mesa horizontal (μ_s = 0.5; μ_k = 0.3; g = 10 m/s²). Si se le aplica una fuerza horizontal de 20 N, ¿cuál es el módulo de la fuerza de rozamiento que actúa sobre el bloque?",
                    options = listOf("20 N", "24 N", "40 N", "80 N", "0 N"),
                    correctIndex = 0,
                    explanation = "Normal: N = mg = 8(10) = 80 N.\nRozamiento estático máximo: f_s_max = μ_s · N = 0.5(80) = 40 N.\nComo la fuerza aplicada (20 N) es menor que f_s_max (40 N), el bloque NO se mueve y permanece en equilibrio: f_s = F = 20 N.",
                    subject = "Física",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "fis_t05_s04",
            subjectId = "fisica",
            semana = 5,
            subtema = "5.4 Momento de una Fuerza (Torque) y Segunda Condición de Equilibrio",
            title = "Momento de una Fuerza y Segunda Condición de Equilibrio",
            theory = LessonTheory(
                id = "theory_fis_t05_s04",
                asignatura = "Física",
                semana = 5,
                titulo = "Momento de una Fuerza y Segunda Condición de Equilibrio",
                resumen = "El momento o torque mide la capacidad de una fuerza para producir rotación alrededor de un punto de apoyo O (centro de momentos).\n\n• Magnitud del Momento:\nM_O^F = ± F · d\n(donde 'd' es el brazo de palanca: distancia perpendicular trazada desde O hasta la línea de acción de la fuerza).\n- Convención de signos: Giro Antihorario (+) y Giro Horario (-).\n- Si la línea de acción de la fuerza pasa directamente por O: d = 0 => M_O = 0.\n\n• Segunda Condición de Equilibrio (Equilibrio Rotacional):\nLa suma algebraica de momentos respecto a cualquier punto arbitrario O debe ser nula:\nΣ M_O = 0 => Σ M_antihorario = Σ M_horario.",
                conceptosClave = listOf(
                    "Momento de una fuerza: M = ± F · d (brazo d estrictamente perpendicular)",
                    "Signo: antihorario positivo (+), horario negativo (-)",
                    "Segunda condición de equilibrio rotacional: Σ M_O = 0"
                ),
                formulas = listOf(
                    "M_O^F = \\pm F \\cdot d \\quad (d \\perp \\vec{F})",
                    "\\sum M_O = 0 \\implies \\sum M_{\\text{antihorarios}} = \\sum M_{\\text{horarios}}"
                ),
                formulaName = "Segunda Condición de Equilibrio",
                formulaLatex = "\\sum M_O = 0 \\implies \\sum F_i d_i = 0",
                formulaDescription = "Condición de ausencia de aceleración angular en sistemas rígidos articulados.",
                admissionTip = "Ubica siempre el centro de momentos 'O' en el punto de apoyo o articulación donde concurran fuerzas desconocidas: ¡al tener brazo cero, sus momentos se anulan y despejas la incógnita en una sola ecuación!",
                admissionExplanation = "• Para que un cuerpo rígido esté en equilibrio completo debe cumplir simultáneamente: Σ F = 0 (no traslada) y Σ M = 0 (no rota)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una barra homogénea de 6 m de largo y 40 N de peso está apoyada en su punto medio. En un extremo se aplica una fuerza hacia abajo de 20 N. ¿Qué fuerza vertical hacia abajo debe aplicarse en el otro extremo para mantener el equilibrio horizontal?",
                    options = listOf("10 N", "20 N", "40 N", "60 N", "80 N"),
                    correctIndex = 1,
                    explanation = "El peso actúa en el punto medio (brazo = 0). Ambos extremos están a 3 m del centro de giro.\nΣ M_O = 0 => (20 N)(3 m) = F · (3 m) => F = 20 N.",
                    subject = "Física",
                    semana = 5
                )
            )
        ),

        // ==========================================
        // SEMANA 6: DINÁMICA LINEAL Y CIRCULAR
        // ==========================================
        LessonNode(
            id = "fis_t06_s01",
            subjectId = "fisica",
            semana = 6,
            subtema = "6.1 Segunda Ley de Newton y Aceleración en Masas Conectadas",
            title = "Segunda Ley de Newton y Masas Conectadas",
            theory = LessonTheory(
                id = "theory_fis_t06_s01",
                asignatura = "Física",
                semana = 6,
                titulo = "Segunda Ley de Newton y Masas Conectadas",
                resumen = "• Segunda Ley del Movimiento de Newton:\nLa aceleración de un cuerpo es directamente proporcional a la fuerza resultante e inversamente proporcional a su masa inercial:\nF_R = m · a\n(Fuerza en Newtons [N], masa en kg y aceleración en m/s²).\n\n• Regla Práctica en la Línea de Movimiento:\nF_R = Σ F_a favor del movimiento - Σ F_en contra del movimiento = m · a\n\n• Método del Sistema para Masas Conectadas (Cuerdas y Poleas):\nPara hallar la aceleración global del conjunto, se considera todo el grupo de masas como un único cuerpo:\na = F_aceleradora neta / m_total = F_R / (m₁ + m₂ + ...)\nUna vez hallada 'a', se aísla una sola masa para hallar la tensión interna de la cuerda.",
                conceptosClave = listOf(
                    "Fórmula fundamental: F_R = m · a",
                    "Desglose escalar: Σ F_favor - Σ F_contra = m · a",
                    "Método del sistema continuo: a = F_neta / m_total"
                ),
                formulas = listOf(
                    "\\vec{F}_R = m \\vec{a} \\implies \\sum F_{\\text{favor}} - \\sum F_{\\text{contra}} = m \\cdot a",
                    "a_{\\text{sistema}} = \\frac{F_{\\text{externa neta}}}{\\sum m_i}"
                ),
                formulaName = "Segunda Ley de Newton",
                formulaLatex = "F_R = m \\cdot a, \\quad a = \\frac{F_{\\text{neta}}}{m_{\\text{total}}}",
                formulaDescription = "Ecuación diferencial básica de la dinámica clásica traslacional.",
                admissionTip = "Para calcular la aceleración de dos bloques unidos por una cuerda sobre una mesa lisa, no pierdas tiempo calculando la tensión: divide la fuerza externa entre la suma de ambas masas directamente.",
                admissionExplanation = "• Las fuerzas internas (como tensiones entre bloques o fuerzas de contacto mutuo) se cancelan algebraicamente al aplicar la segunda ley al sistema completo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos bloques de masas m₁ = 3 kg y m₂ = 2 kg están unidos por una cuerda sobre un plano horizontal liso. Si se jala a m₂ con una fuerza constante de 20 N, ¿cuál es la tensión en la cuerda que los une?",
                    options = listOf("6 N", "8 N", "10 N", "12 N", "16 N"),
                    correctIndex = 3,
                    explanation = "Aceleración del sistema: a = F / (m₁ + m₂) = 20 / (3 + 2) = 20 / 5 = 4 m/s².\nAislando el bloque m₁ (la única fuerza horizontal sobre él es la tensión T):\nT = m₁ · a = (3 kg) · (4 m/s²) = 12 N.",
                    subject = "Física",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "fis_t06_s02",
            subjectId = "fisica",
            semana = 6,
            subtema = "6.2 Dinámica en Planos Inclinados con y sin Fricción",
            title = "Dinámica en Planos Inclinados",
            theory = LessonTheory(
                id = "theory_fis_t06_s02",
                asignatura = "Física",
                semana = 6,
                titulo = "Dinámica en Planos Inclinados",
                resumen = "En un plano inclinado con ángulo de inclinación θ respecto a la horizontal, el peso del cuerpo (P = mg) se descompone en dos ejes ortogonales:\n\n1. Eje Perpendicular al Plano:\nN = m · g · cos θ\n(como no hay movimiento en este eje, la normal equilibra a esta componente).\n\n2. Eje Paralelo al Plano (Línea de Movimiento):\nComponente del peso a favor de la pendiente: P_x = m · g · sen θ.\n\n• Plano Inclinado Liso (sin fricción):\na = g · sen θ  (independiente de la masa del cuerpo).\n\n• Plano Inclinado Rugoso (con coeficiente cinético μ_k):\nFuerza de fricción: f_k = μ_k · N = μ_k · m · g · cos θ.\n- Si desciende acelerando: a = g (sen θ - μ_k cos θ)\n- Si asciende frenando: a = g (sen θ + μ_k cos θ).",
                conceptosClave = listOf(
                    "Descomposición del peso en plano inclinado: mg sen θ (paralelo) y mg cos θ (perpendicular)",
                    "Plano liso: la aceleración de caída es a = g sen θ (no depende de la masa)",
                    "Plano rugoso: a = g (sen θ ± μ_k cos θ)"
                ),
                formulas = listOf(
                    "N = m g \\cos(\\theta), \\quad P_{\\parallel} = m g \\text{ sen}(\\theta)",
                    "a_{\\text{liso}} = g \\text{ sen}(\\theta), \\quad a_{\\text{rugoso}} = g(\\text{sen}(\\theta) - \\mu_k \\cos(\\theta))"
                ),
                formulaName = "Dinámica en Plano Inclinado",
                formulaLatex = "a = g \\text{ sen}(\\theta) - \\mu_k g \\cos(\\theta)",
                formulaDescription = "Ecuación de movimiento de cuerpos sobre planos inclinados bajo gravedad y rozamiento.",
                admissionTip = "¡Dato veloz de examen! Una esfera de 1 kg y un bloque de 100 kg caen con exactamente la misma aceleración (a = g sen θ) sobre un plano inclinado liso.",
                admissionExplanation = "• El ángulo crítico de reposo es aquel para el cual tan θ = μ_s; a ese ángulo el cuerpo está a punto de resbalar por su propio peso."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un bloque se desliza hacia abajo sobre un plano inclinado liso que forma 30° con la horizontal. Considerando g = 10 m/s², ¿cuál es el módulo de su aceleración?",
                    options = listOf("2.5 m/s²", "5.0 m/s²", "8.6 m/s²", "10.0 m/s²", "12.0 m/s²"),
                    correctIndex = 1,
                    explanation = "En un plano inclinado liso: a = g · sen θ = 10 · sen 30° = 10 · (1/2) = 5.0 m/s².",
                    subject = "Física",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "fis_t06_s03",
            subjectId = "fisica",
            semana = 6,
            subtema = "6.3 Dinámica Circular y Fuerza Centrípeta Resultante",
            title = "Dinámica Circular y Fuerza Centrípeta",
            theory = LessonTheory(
                id = "theory_fis_t06_s03",
                asignatura = "Física",
                semana = 6,
                titulo = "Dinámica Circular y Fuerza Centrípeta",
                resumen = "En una trayectoria circular, la fuerza desbalanceada en el eje radial genera la aceleración centrípeta.\n\n• Fuerza Centrípeta (F_cp):\nNo es una fuerza real independiente de la naturaleza, sino la resultante de todas las fuerzas reales dirigidas a lo largo del radio hacia el centro de curvatura:\nF_cp = Σ F_hacia el centro - Σ F_hacia afuera = m · a_cp = m · (v² / R) = m · ω² · R\n\n• Casos Clásicos en Giro Vertical (Cuerpo atado a una cuerda):\n1. Punto más bajo de la trayectoria:\nT_max - m·g = m · (v² / R) => T_max = m·g + m · (v² / R)   (Tensión máxima).\n2. Punto más alto de la trayectoria:\nT_min + m·g = m · (v² / R) => T_min = m · (v² / R) - m·g   (Tensión mínima).\n- Rapidez crítica mínima en la cúspide para que la cuerda no se afloje (T = 0): v_crítica = √(g · R).",
                conceptosClave = listOf(
                    "Fuerza centrípeta como resultante radial: F_cp = Σ F_centro - Σ F_fuera",
                    "Tensión máxima en el punto más bajo (T = mg + mv²/R) y mínima en el más alto",
                    "Rapidez crítica mínima en la cima de un giro vertical: v_min = √(gR)"
                ),
                formulas = listOf(
                    "F_{\\text{cp}} = \\sum F_{\\text{centro}} - \\sum F_{\\text{fuera}} = m \\frac{v^2}{R} = m \\omega^2 R",
                    "v_{\\text{crítica}} = \\sqrt{g R} \\quad (\\text{en el punto más alto con } T=0)"
                ),
                formulaName = "Segunda Ley de Newton en Movimiento Circular",
                formulaLatex = "F_{\\text{cp}} = m \\frac{v^2}{R}, \\quad v_{\\text{mín}} = \\sqrt{g R}",
                formulaDescription = "Dinámica de rotación vertical y horizontal bajo vínculos tensiles o normales.",
                admissionTip = "En el punto más bajo del rizo vertical sientes que pesas más debido a que la normal (o tensión) debe soportar el peso y además suministrar la fuerza centrípeta.",
                admissionExplanation = "• Si la rapidez en la cumbre es menor que √(gR), el proyectil describe una parábola y no completa la circunferencia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una esfera de 1 kg gira en un plano vertical atada a una cuerda de 2 m de longitud. Si en el punto más bajo su rapidez es de 6 m/s y g = 10 m/s², ¿cuál es la tensión en la cuerda?",
                    options = listOf("18 N", "28 N", "38 N", "48 N", "58 N"),
                    correctIndex = 1,
                    explanation = "En el punto más bajo: T - mg = m(v² / R) => T = mg + m(v² / R) = (1)(10) + (1)(6² / 2) = 10 + 18 = 28 N.",
                    subject = "Física",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "fis_t06_s04",
            subjectId = "fisica",
            semana = 6,
            subtema = "6.4 Curvas Peraltadas y Péndulo Cónico",
            title = "Curvas Peraltadas y Péndulo Cónico",
            theory = LessonTheory(
                id = "theory_fis_t06_s04",
                asignatura = "Física",
                semana = 6,
                titulo = "Curvas Peraltadas y Péndulo Cónico",
                resumen = "• Curva Peraltada (Ángulo de Peralte θ):\nEn pistas de carreras y autopistas, las curvas se construyen con una inclinación transversal (peralte) para que la componente horizontal de la fuerza normal suministre la fuerza centrípeta necesaria para doblar sin depender del rozamiento.\n- Eje vertical: N cos θ = m · g\n- Eje radial (centrípeta): N sen θ = m · (v² / R)\nDividiendo ambas ecuaciones:\ntan θ = v² / (g · R) => v = √(g · R · tan θ)\n\n• Péndulo Cónico:\nEsfera de masa m suspendida de un hilo de longitud L que describe una trayectoria circular horizontal con rapidez angular constante:\n- Eje vertical: T cos θ = m · g\n- Eje radial: T sen θ = m · ω² · r = m · (v² / r)\n- Relación dinámica: tan θ = v² / (g · r) = (ω² · r) / g.",
                conceptosClave = listOf(
                    "Ángulo de peralte ideal sin fricción: tan θ = v² / (gR)",
                    "Péndulo cónico: la componente horizontal de la tensión actúa como fuerza centrípeta",
                    "Velocidad de diseño en peraltes no depende de la masa del automóvil"
                ),
                formulas = listOf(
                    "\\tan(\\theta) = \\frac{v^2}{g R} \\implies v_{\\text{diseño}} = \\sqrt{g R \\tan(\\theta)}"
                ),
                formulaName = "Ecuación del Ángulo de Peralte",
                formulaLatex = "\\tan(\\theta) = \\frac{v^2}{g R}",
                formulaDescription = "Condición de equilibrio radial en curvas inclinadas sin dependencia de adherencia.",
                admissionTip = "Fíjate que tanto para el peralte como para el péndulo cónico, la fórmula es idéntica: tan θ = v² / (gR).",
                admissionExplanation = "• A la velocidad de diseño de una curva peraltada, los neumáticos no sufren desgaste lateral porque no se requiere fuerza de rozamiento para girar."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una pista de carreras circular tiene un radio de 40 m. Si el ángulo de peralte es de 45° y g = 10 m/s², ¿a qué rapidez constante puede girar un vehículo sin depender del rozamiento?",
                    options = listOf("10 m/s", "15 m/s", "20 m/s", "25 m/s", "40 m/s"),
                    correctIndex = 2,
                    explanation = "tan θ = v² / (gR) => tan 45° = v² / (10 · 40) => 1 = v² / 400 => v² = 400 => v = 20 m/s.",
                    subject = "Física",
                    semana = 6
                )
            )
        ),

        // ==========================================
        // SEMANA 7: TRABAJO, ENERGÍA Y POTENCIA
        // ==========================================
        LessonNode(
            id = "fis_t07_s01",
            subjectId = "fisica",
            semana = 7,
            subtema = "7.1 Trabajo Mecánico de Fuerzas Constantes y Gráficas F vs x",
            title = "Trabajo Mecánico de Fuerzas Constantes",
            theory = LessonTheory(
                id = "theory_fis_t07_s01",
                asignatura = "Física",
                semana = 7,
                titulo = "Trabajo Mecánico de Fuerzas Constantes",
                resumen = "El trabajo mecánico (W) es una magnitud escalar que cuantifica la transferencia de energía provocada por una fuerza al producir desplazamiento.\n\n• Trabajo de una Fuerza Constante:\nW = F · d · cos θ = F_paralela · d\n(Fuerza en Newtons, distancia en metros, Trabajo en Joules [J] = N·m).\n- Trabajo Motor (0° ≤ θ < 90°): W > 0 (la fuerza favorece el movimiento).\n- Trabajo Resistente (90° < θ ≤ 180°): W < 0 (la fuerza se opone, ej. rozamiento: W_fr = - f_k · d).\n- Trabajo Nulo (θ = 90°): W = 0 (fuerzas perpendiculares al desplazamiento como la normal o el peso en movimiento horizontal NO realizan trabajo).\n\n• Trabajo de Fuerza Variable (Gráfica F vs x):\nEl trabajo es numéricamente igual al ÁREA bajo la curva de la gráfica fuerza versus posición:\nW = Área(F vs x).",
                conceptosClave = listOf(
                    "Fórmula escalar: W = F · d · cos θ (en Joules)",
                    "Trabajo positivo (fuerza a favor), negativo (fuerza en contra) y nulo (perpendicular, θ = 90°)",
                    "En gráficas F vs x: el trabajo es el área bajo la curva"
                ),
                formulas = listOf(
                    "W = F \\cdot d \\cdot \\cos(\\theta), \\quad W = \\text{Área}(F \\text{ vs } x)",
                    "W_{\\text{rozamiento}} = -f_k \\cdot d"
                ),
                formulaName = "Trabajo Mecánico Escalar",
                formulaLatex = "W = F d \\cos(\\theta), \\quad W = \\text{Área}_{F-x}",
                formulaDescription = "Integración lineal de la fuerza a lo largo de la trayectoria de desplazamiento.",
                admissionTip = "La fuerza centrípeta y la fuerza normal sobre superficies inmóviles NUNCA realizan trabajo mecánico (W = 0), porque son perpendiculares a la velocidad en todo instante.",
                admissionExplanation = "• Si cargas una maleta pesada y caminas horizontalmente a velocidad constante, el trabajo realizado por tus brazos sobre la maleta es cero porque la fuerza es vertical y el movimiento horizontal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un bloque es desplazado 10 m sobre un plano horizontal rugoso. Si la fuerza de rozamiento cinético constante es de 15 N, ¿cuál es el trabajo realizado por la fuerza de rozamiento?",
                    options = listOf("150 J", "-150 J", "0 J", "-75 J", "300 J"),
                    correctIndex = 1,
                    explanation = "Como la fricción actúa en sentido opuesto al desplazamiento (θ = 180°, cos 180° = -1):\nW_fr = -f_k · d = -(15 N)(10 m) = -150 J.",
                    subject = "Física",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "fis_t07_s02",
            subjectId = "fisica",
            semana = 7,
            subtema = "7.2 Teorema del Trabajo Neto y la Energía Cinética",
            title = "Teorema del Trabajo y la Energía Cinética",
            theory = LessonTheory(
                id = "theory_fis_t07_s02",
                asignatura = "Física",
                semana = 7,
                titulo = "Teorema del Trabajo y la Energía Cinética",
                resumen = "• Energía Cinética (E_k):\nEnergía que posee un cuerpo debido a su movimiento y velocidad:\nE_k = (1/2) · m · v²   (Joules)\n\n• Trabajo Neto o Total (W_neto):\nEs la suma escalar de los trabajos de todas las fuerzas que actúan sobre el cuerpo, equivalente al trabajo de la fuerza resultante:\nW_neto = Σ W_i = F_R · d\n\n• Teorema del Trabajo Neto y la Variación de la Energía Cinética:\nEl trabajo neto realizado sobre una partícula es igual a la variación de su energía cinética:\nW_neto = ΔE_k = E_k_final - E_k_inicial = (1/2) m v_f² - (1/2) m v_i²\n- Si W_neto > 0 => la rapidez aumenta (acelera).\n- Si W_neto < 0 => la rapidez disminuye (frena).\n- Si W_neto = 0 => la rapidez permanece constante.",
                conceptosClave = listOf(
                    "Energía cinética traslacional: E_k = (1/2) m v²",
                    "Teorema del Trabajo Neto: W_neto = ΔE_k = E_k_f - E_k_i",
                    "W_neto positivo incrementa la rapidez; negativo la disminuye"
                ),
                formulas = listOf(
                    "E_k = \\frac{1}{2} m v^2, \\quad W_{\\text{neto}} = \\Delta E_k = \\frac{1}{2} m v_f^2 - \\frac{1}{2} m v_i^2"
                ),
                formulaName = "Teorema de las Fuerzas Vivas (Trabajo-Energía)",
                formulaLatex = "W_{\\text{neto}} = \\Delta E_k = E_{k_f} - E_{k_i}",
                formulaDescription = "Equivalencia entre el trabajo de la fuerza resultante y la alteración de la energía cinética.",
                admissionTip = "Este teorema es poderosísimo en problemas con fuerzas no constantes o trayectorias curvas: ¡evita usar cinemática y resuelve el problema en una sola línea!",
                admissionExplanation = "• La energía cinética es siempre positiva o cero, jamás negativa, porque la masa es positiva y la rapidez está elevada al cuadrado."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un proyectil de 2 kg se desplaza en línea recta pasando de una rapidez de 4 m/s a 8 m/s. El trabajo neto desarrollado sobre el proyectil es:",
                    options = listOf("24 J", "48 J", "64 J", "96 J", "128 J"),
                    correctIndex = 1,
                    explanation = "W_neto = ΔE_k = (1/2) m (v_f² - v_i²) = (1/2)(2)(8² - 4²) = 1 · (64 - 16) = 48 J.",
                    subject = "Física",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "fis_t07_s03",
            subjectId = "fisica",
            semana = 7,
            subtema = "7.3 Energía Mecánica y Conservación de la Energía",
            title = "Energía Mecánica y su Conservación",
            theory = LessonTheory(
                id = "theory_fis_t07_s03",
                asignatura = "Física",
                semana = 7,
                titulo = "Energía Mecánica y su Conservación",
                resumen = "La Energía Mecánica Total (E_M) es la suma de la energía cinética y las energías potenciales:\nE_M = E_k + E_p\n\n• Formas de Energía Potencial (Asociadas a fuerzas conservativas):\n1. Energía Potencial Gravitatoria (E_pg):\n   E_pg = m · g · h   (respecto a un nivel de referencia N.R. elegido).\n2. Energía Potencial Elástica (E_pe):\n   E_pe = (1/2) · k · x²   (donde x es la deformación del resorte).\n\n• Principio de Conservación de la Energía Mecánica:\nSi sobre el sistema solo realizan trabajo FUERZAS CONSERVATIVAS (como el peso y la fuerza elástica), la energía mecánica total permanece constante en cualquier punto de la trayectoria:\nE_M_inicial = E_M_final => E_k_A + E_p_A = E_k_B + E_p_B.",
                conceptosClave = listOf(
                    "Energía mecánica total: E_M = E_k + E_pg + E_pe",
                    "Energías potenciales: gravitatoria (mgh) y elástica (1/2 k x²)",
                    "Ley de conservación: E_M_A = E_M_B si no actúan fuerzas disipativas"
                ),
                formulas = listOf(
                    "E_M = E_k + E_{pg} + E_{pe}",
                    "E_{pg} = m g h, \\quad E_{pe} = \\frac{1}{2} k x^2",
                    "E_{M_A} = E_{M_B} \\quad (\\text{Fuerzas conservativas exclusivas})"
                ),
                formulaName = "Conservación de la Energía Mecánica",
                formulaLatex = "E_{M_A} = E_{M_B} \\implies \\frac{1}{2} m v_A^2 + m g h_A = \\frac{1}{2} m v_B^2 + m g h_B",
                formulaDescription = "Invarianza de la energía mecánica total en campos conservativos cerrados.",
                admissionTip = "Establece siempre el Nivel de Referencia (N.R.) en el punto más bajo del problema; de este modo todas las alturas h serán positivas y en el fondo la energía potencial gravitatoria será cero.",
                admissionExplanation = "• Si se suelta un cuerpo desde el reposo a una altura H sin fricción, llega a la base con rapidez v = √(2gH), independientemente de la forma recta o curva de la pista."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se suelta una esfera desde el reposo desde lo alto de una rampa curva lisa de 5 m de altura. Considerando g = 10 m/s², ¿con qué rapidez llega a la base de la rampa?",
                    options = listOf("5 m/s", "10 m/s", "15 m/s", "20 m/s", "25 m/s"),
                    correctIndex = 1,
                    explanation = "Por conservación de la energía mecánica (E_M_cima = E_M_base):\nm g h = (1/2) m v² => v = √(2gh) = √(2 · 10 · 5) = √100 = 10 m/s.",
                    subject = "Física",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "fis_t07_s04",
            subjectId = "fisica",
            semana = 7,
            subtema = "7.4 Fuerzas No Conservativas, Potencia Mecánica y Eficiencia",
            title = "Fuerzas No Conservativas, Potencia y Eficiencia",
            theory = LessonTheory(
                id = "theory_fis_t07_s04",
                asignatura = "Física",
                semana = 7,
                titulo = "Fuerzas No Conservativas, Potencia y Eficiencia",
                resumen = "• Trabajo de Fuerzas No Conservativas (W_FNC):\nSi sobre un sistema actúan fuerzas disipativas (como la fricción o resistencia del aire) o fuerzas externas aplicadas:\nW_FNC = E_M_final - E_M_inicial = ΔE_M\n(La pérdida de energía mecánica se disipa habitualmente en forma de calor Q).\n\n• Potencia Mecánica (P):\nRapidez con la que se transfiere energía o se realiza trabajo mecánico:\nP = W / t = F · v   (en Watts [W] = Joule / segundo).\nEquivalencias: 1 HP (Caballo de Fuerza) ≈ 746 W; 1 kW = 1000 W.\n\n• Eficiencia o Rendimiento de una Máquina (η):\nRelación entre la potencia útil entregada y la potencia total consumida:\nη = (Potencia Útil / Potencia Consumida) × 100%\nPotencia Consumida = Potencia Útil + Potencia Perdida (disipada en calor o fricción).",
                conceptosClave = listOf(
                    "Teorema general: W_FNC = E_M_final - E_M_inicial",
                    "Potencia mecánica: P = W / t = F · v (en Watts)",
                    "Eficiencia de una máquina: η = (P_útil / P_consumida) × 100%"
                ),
                formulas = listOf(
                    "W_{\\text{FNC}} = E_{M_f} - E_{M_i}",
                    "P = \\frac{W}{t} = F \\cdot v, \\quad \\eta = \\frac{P_{\\text{útil}}}{P_{\\text{consumida}}} \\times 100\\%"
                ),
                formulaName = "Potencia Mecánica y Rendimiento Energético",
                formulaLatex = "P = F \\cdot v, \\quad \\eta = \\frac{P_{\\text{útil}}}{P_{\\text{entregada}}} \\times 100\\%",
                formulaDescription = "Tasa temporal de transferencia energética y rendimiento en máquinas térmicas y mecánicas.",
                admissionTip = "La eficiencia η es siempre menor al 100% (o menor a 1) en cualquier máquina real, de acuerdo con la Segunda Ley de la Termodinámica (no existe máquina con rendimiento perfecto).",
                admissionExplanation = "• Cuando un motor opera a velocidad constante contra una fuerza resistiva F, la potencia desarrollada es simplemente el producto P = F · v."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un motor consume una potencia eléctrica de 2000 W y logra elevar una carga de 150 kg a velocidad constante de 1 m/s (g = 10 m/s²). ¿Cuál es la eficiencia o rendimiento del motor?",
                    options = listOf("50%", "60%", "75%", "80%", "90%"),
                    correctIndex = 2,
                    explanation = "Fuerza para subir la carga: F = mg = 150 · 10 = 1500 N.\nPotencia útil: P_útil = F · v = 1500 N · 1 m/s = 1500 W.\nEficiencia: η = (P_útil / P_consumida) × 100% = (1500 / 2000) × 100% = 75%.",
                    subject = "Física",
                    semana = 7
                )
            )
        ),

        // ==========================================
        // SEMANA 8: CANTIDAD DE MOVIMIENTO, CHOQUES Y GRAVITACIÓN
        // ==========================================
        LessonNode(
            id = "fis_t08_s01",
            subjectId = "fisica",
            semana = 8,
            subtema = "8.1 Impulso y Cantidad de Movimiento Lineal",
            title = "Impulso y Cantidad de Movimiento",
            theory = LessonTheory(
                id = "theory_fis_t08_s01",
                asignatura = "Física",
                semana = 8,
                titulo = "Impulso y Cantidad de Movimiento",
                resumen = "• Cantidad de Movimiento o Momentum Lineal (p):\nMagnitud vectorial que mide la inercia en movimiento traslacional:\np = m · v   (kg·m/s, con la misma dirección que la velocidad).\n\n• Impulso (I):\nMagnitud vectorial que mide el efecto acumulado de una fuerza a lo largo del tiempo de aplicación:\nI = F · Δt   (N·s)\n- En gráficas Fuerza vs Tiempo: el Impulso es numéricamente igual al ÁREA bajo la curva: I = Área(F vs t).\n\n• Teorema del Impulso y la Cantidad de Movimiento:\nEl impulso recibido por una partícula es igual a la variación de su cantidad de movimiento:\nI = Δp = p_final - p_inicial = m · v_f - m · v_i.",
                conceptosClave = listOf(
                    "Cantidad de movimiento: p = m · v (vectorial, kg·m/s)",
                    "Impulso de una fuerza constante: I = F · Δt = Área(F vs t)",
                    "Teorema del Impulso: I = Δp = m v_f - m v_i"
                ),
                formulas = listOf(
                    "\\vec{p} = m \\vec{v}, \\quad \\vec{I} = \\vec{F} \\Delta t = \\text{Área}(F \\text{ vs } t)",
                    "\\vec{I} = \\Delta \\vec{p} = m \\vec{v}_f - m \\vec{v}_i"
                ),
                formulaName = "Teorema del Impulso y Cantidad de Movimiento",
                formulaLatex = "\\vec{I} = \\vec{F} \\Delta t = \\Delta \\vec{p} = m \\vec{v}_f - m \\vec{v}_i",
                formulaDescription = "Relación entre el estímulo de una fuerza externa y la variación de momento lineal.",
                admissionTip = "¡Cuidado con los signos vectoriales! Si una pelota de tenis de masa 'm' choca a +v contra una pared y rebota a -v, el cambio de momento es: Δp = -mv - (+mv) = -2mv (el módulo del cambio es 2mv, no cero).",
                admissionExplanation = "• Las zonas de deformación programada de los automóviles modernos aumentan el tiempo de colisión Δt, lo cual reduce drásticamente la fuerza promedio de impacto F = Δp / Δt que sufren los pasajeros."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una pelota de 0.5 kg viaja horizontalmente a 20 m/s y rebota en una pared regresando en sentido contrario a 10 m/s. ¿Cuál es la magnitud del impulso que la pared ejerció sobre la pelota?",
                    options = listOf("5 N·s", "10 N·s", "15 N·s", "20 N·s", "25 N·s"),
                    correctIndex = 2,
                    explanation = "Tomando la dirección inicial como positiva (+X):\nv_i = +20 m/s; v_f = -10 m/s.\nI = Δp = m (v_f - v_i) = 0.5 · (-10 - 20) = 0.5 · (-30) = -15 N·s.\nEl módulo del impulso es 15 N·s.",
                    subject = "Física",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "fis_t08_s02",
            subjectId = "fisica",
            semana = 8,
            subtema = "8.2 Principio de Conservación de la Cantidad de Movimiento",
            title = "Conservación del Momentum Lineal",
            theory = LessonTheory(
                id = "theory_fis_t08_s02",
                asignatura = "Física",
                semana = 8,
                titulo = "Conservación del Momentum Lineal",
                resumen = "• Principio de Conservación del Momentum Lineal:\nSi la fuerza externa resultante que actúa sobre un sistema es nula (Σ F_ext = 0, sistema aislado):\nLa cantidad de movimiento total del sistema permanece estrictamente CONSTANTE antes y después de cualquier interacción (choque, explosión o retroceso):\np_total_antes = p_total_después\nm₁ v₁_i + m₂ v₂_i = m₁ v₁_f + m₂ v₂_f\n\n• Aplicaciones Notables:\n- Retroceso de un arma: m_arma · v_retroceso + m_bala · v_bala = 0.\n- Propulsión por reacción de cohetes y calamares (expulsión de gases o agua hacia atrás produciendo avance hacia adelante).",
                conceptosClave = listOf(
                    "Conservación estricta de la cantidad de movimiento en sistemas aislados (Σ F_ext = 0)",
                    "Fórmula de colisión lineal: m₁ v₁_i + m₂ v₂_i = m₁ v₁_f + m₂ v₂_f",
                    "Fenómeno de retroceso: masas y velocidades tienen signos vectoriales opuestos"
                ),
                formulas = listOf(
                    "\\sum \\vec{p}_{\\text{antes}} = \\sum \\vec{p}_{\\text{después}}",
                    "m_1 \\vec{v}_{1i} + m_2 \\vec{v}_{2i} = m_1 \\vec{v}_{1f} + m_2 \\vec{v}_{2f}"
                ),
                formulaName = "Ley de Conservación del Momentum",
                formulaLatex = "\\sum \\vec{p}_{\\text{inicial}} = \\sum \\vec{p}_{\\text{final}}",
                formulaDescription = "Invarianza del momento lineal total en sistemas aislados de fuerzas externas.",
                admissionTip = "En explosiones o retrocesos, el sistema parte frecuentemente del reposo (p_inicial = 0); por ende, la suma de las cantidades de movimiento de los fragmentos dispersos debe sumar exactamente cero.",
                admissionExplanation = "• Las fuerzas internas gigantescas que actúan durante un choque o explosión no alteran el momentum total del sistema porque se anulan dos a dos por la tercera ley de Newton."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un cañón de 500 kg en reposo dispara horizontalmente un proyectil de 5 kg con una rapidez de 200 m/s. ¿Cuál es el módulo de la rapidez de retroceso del cañón?",
                    options = listOf("1 m/s", "2 m/s", "4 m/s", "10 m/s", "20 m/s"),
                    correctIndex = 1,
                    explanation = "El sistema cañón-proyectil parte del reposo (p_i = 0).\np_i = p_f => 0 = m_cañón · v_retroceso + m_proyectil · v_proyectil\n0 = 500 · v_r + 5 · (200) => 500 v_r = -1000 => v_r = -2 m/s.\nEl módulo de la rapidez de retroceso es 2 m/s.",
                    subject = "Física",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "fis_t08_s03",
            subjectId = "fisica",
            semana = 8,
            subtema = "8.3 Choques: Coeficiente de Restitución y Tipos de Colisión",
            title = "Colisiones y Coeficiente de Restitución",
            theory = LessonTheory(
                id = "theory_fis_t08_s03",
                asignatura = "Física",
                semana = 8,
                titulo = "Colisiones y Coeficiente de Restitución",
                resumen = "• Coeficiente de Restitución (e):\nMide la elasticidad de una colisión frontal entre dos cuerpos:\ne = (Rapidez relativa de separación) / (Rapidez relativa de acercamiento) = - (v₂_f - v₁_f) / (v₂_i - v₁_i)\n\n• Clasificación de los Choques:\n1. Choque Elástico (e = 1):\n- Se conserva la cantidad de movimiento total.\n- Se conserva la energía cinética total (no hay pérdida de energía en deformación o calor).\n2. Choque Inelástico (0 < e < 1):\n- Se conserva el momento lineal.\n- Se disipa parte de la energía cinética (E_k_f < E_k_i).\n3. Choque Plástico o Completamente Inelástico (e = 0):\n- Los cuerpos quedan PEGADOS o adheridos tras el impacto marchando con la misma velocidad común (v_común):\n  m₁ v₁_i + m₂ v₂_i = (m₁ + m₂) v_común\n- Se produce la máxima pérdida posible de energía cinética.",
                conceptosClave = listOf(
                    "Coeficiente de restitución e = |v_separación| / |v_acercamiento|",
                    "Choque elástico (e = 1, se conserva la energía cinética)",
                    "Choque plástico (e = 0, cuerpos se mueven unidos tras el choque con máxima disipación)"
                ),
                formulas = listOf(
                    "e = \\frac{v_{2f} - v_{1f}}{v_{1i} - v_{2i}} \\quad (0 \\le e \\le 1)",
                    "\\text{Choque plástico (}e=0\\text{)}: \\; m_1 v_1 + m_2 v_2 = (m_1 + m_2) v_{\\text{común}}"
                ),
                formulaName = "Leyes de las Colisiones Mecánicas",
                formulaLatex = "e = \\frac{v_{\\text{separación}}}{v_{\\text{acercamiento}}}, \\quad m_1 v_1 + m_2 v_2 = (m_1 + m_2) v_f",
                formulaDescription = "Grado de conservación energética y cinemática en colisiones de partículas.",
                admissionTip = "Si lees en el problema 'los cuerpos quedan unidos', 'quedan incrustados' o 'se mueven juntos', es un choque plástico (e = 0) directo: m₁ v₁ + m₂ v₂ = (m₁ + m₂) v.",
                admissionExplanation = "• Si una pelota se deja caer desde una altura H sobre un piso rígido y rebota hasta una altura h, el coeficiente de restitución es: e = √(h / H)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un bloque de 3 kg con rapidez de 8 m/s choca frontalmente contra otro de 5 kg que se encuentra en reposo. Si tras el impacto ambos quedan unidos, ¿cuál es su rapidez común?",
                    options = listOf("2 m/s", "3 m/s", "4 m/s", "5 m/s", "6 m/s"),
                    correctIndex = 1,
                    explanation = "Conservación del momentum (choque plástico): m₁ v₁ + m₂ v₂ = (m₁ + m₂) v_c\n(3 kg)(8 m/s) + (5 kg)(0) = (3 + 5) v_c => 24 = 8 v_c => v_c = 3 m/s.",
                    subject = "Física",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "fis_t08_s04",
            subjectId = "fisica",
            semana = 8,
            subtema = "8.4 Gravitación Universal y Tres Leyes de Kepler",
            title = "Gravitación Universal y Leyes de Kepler",
            theory = LessonTheory(
                id = "theory_fis_t08_s04",
                asignatura = "Física",
                semana = 8,
                titulo = "Gravitación Universal y Leyes de Kepler",
                resumen = "• Ley de Gravitación Universal de Isaac Newton (1687):\nDos masas puntuales m₁ y m₂ se atraen con una fuerza directamente proporcional al producto de sus masas e inversamente proporcional al cuadrado de la distancia que las separa:\nF_g = G · (m₁ · m₂) / r²\n(donde G = 6.67 × 10⁻¹¹ N·m²/kg² es la constante de gravitación universal).\n- Aceleración de la gravedad a una altura 'h' sobre la superficie terrestre (radio R_T):\ng = G · M_T / (R_T + h)²\n\n• Tres Leyes del Movimiento Planetario de Johannes Kepler:\n1. Primera Ley (Órbitas): Los planetas describen órbitas elípticas con el Sol situado en uno de los focos.\n2. Segunda Ley (Áreas): El radio vector Sol-planeta barre áreas iguales en tiempos iguales (la velocidad es máxima en el Perihelio y mínima en el Afelio).\n3. Tercera Ley (Periodos): El cuadrado del periodo orbital (T) es proporcional al cubo del semieje mayor (radio orbital medio R):\nT² / R³ = constante (idéntica para todos los planetas que orbitan el mismo cuerpo central).",
                conceptosClave = listOf(
                    "Ley de gravitación universal: F_g = G (M m) / r²",
                    "Aceleración gravitacional en superficie: g = G M / R²",
                    "Tercera ley de Kepler: T² / R³ = constante (T₁² / R₁³ = T₂² / R₂³)",
                    "Segunda ley de Kepler: mayor rapidez orbital en el perihelio que en el afelio"
                ),
                formulas = listOf(
                    "F_g = G \\frac{m_1 m_2}{r^2}, \\quad g = \\frac{G M}{R^2}",
                    "\\frac{T^2}{R^3} = \\text{constante} \\implies \\frac{T_1^2}{R_1^3} = \\frac{T_2^2}{R_2^3}"
                ),
                formulaName = "Gravitación Universal y Tercera Ley de Kepler",
                formulaLatex = "F_g = G \\frac{M m}{r^2}, \\quad \\frac{T^2}{R^3} = \\text{cte}",
                formulaDescription = "Mecánica celeste newtoniana y cinemática orbital kepleriana.",
                admissionTip = "Si te alejas a una distancia de 2 radios terrestres del centro de la Tierra (el doble de distancia r = 2R), la fuerza de gravedad se reduce a la CUARTA parte (F/4), y si te alejas a 3R, se reduce a la NOVENA parte (F/9).",
                admissionExplanation = "• La Segunda Ley de Kepler es una consecuencia directa del Principio de Conservación del Momento Angular (L = m r v = constante en un campo de fuerzas centrales)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si el radio medio de la órbita de un planeta alrededor del Sol es 4 veces el radio orbital de la Tierra (1 UA), ¿cuántos años terrestres tarda dicho planeta en completar una vuelta al Sol?",
                    options = listOf("2 años", "4 años", "8 años", "16 años", "64 años"),
                    correctIndex = 2,
                    explanation = "Por la Tercera Ley de Kepler: T² / R³ = constante.\n(T_planeta / T_Tierra)² = (R_planeta / R_Tierra)³ = (4 / 1)³ = 64.\nT_planeta = √64 = 8 años.",
                    subject = "Física",
                    semana = 8
                )
            )
        ),

        // ==========================================
        // SEMANA 9: FENÓMENOS TÉRMICOS Y CALORIMETRÍA
        // ==========================================
        LessonNode(
            id = "fis_t09_s01",
            subjectId = "fisica",
            semana = 9,
            subtema = "9.1 Temperatura, Escalas Termométricas y Dilatación Térmica",
            title = "Temperatura, Escalas y Dilatación",
            theory = LessonTheory(
                id = "theory_fis_t09_s01",
                asignatura = "Física",
                semana = 9,
                titulo = "Temperatura, Escalas y Dilatación",
                resumen = "La temperatura es la medida macroscópica de la energía cinética promedio de las moléculas de un cuerpo.\n\n• Conversión entre Escalas Termométricas:\nC / 5 = (F - 32) / 9 = (K - 273) / 5 = (R - 492) / 9\nVariaciones de temperatura: ΔC / 5 = ΔF / 9 = ΔK / 5 = ΔR / 9  =>  ΔC = ΔK  y  ΔF = ΔR.\nEl Cero Absoluto (0 K o -273.15 °C) es el límite inferior termodinámico donde cesa la agitación molecular.\n\n• Dilatación Térmica (Aumento de dimensiones por calentamiento):\n1. Dilatación Lineal: ΔL = L₀ · α · ΔT\n2. Dilatación Superficial: ΔA = A₀ · β · ΔT   (con β = 2α)\n3. Dilatación Volumétrica: ΔV = V₀ · γ · ΔT   (con γ = 3α)\n(donde α es el coeficiente de dilatación lineal del material en °C⁻¹).",
                conceptosClave = listOf(
                    "Fórmula universal de escalas: C/5 = (F - 32)/9 = (K - 273)/5",
                    "Una variación de 1 °C equivale exactamente a una variación de 1 K (ΔC = ΔK)",
                    "Dilatación térmica: ΔL = L₀ α ΔT, con relaciones geométricas β = 2α y γ = 3α"
                ),
                formulas = listOf(
                    "\\frac{C}{5} = \\frac{F - 32}{9} = \\frac{K - 273}{5}, \\quad \\Delta C = \\Delta K, \\quad \\frac{\\Delta C}{5} = \\frac{\\Delta F}{9}",
                    "\\Delta L = L_0 \\alpha \\Delta T, \\quad \\Delta V = V_0 \\gamma \\Delta T \\; (\\gamma = 3\\alpha)"
                ),
                formulaName = "Conversión de Escalas y Dilatación Térmica",
                formulaLatex = "\\frac{C}{5} = \\frac{F - 32}{9}, \\quad \\Delta L = L_0 \\alpha \\Delta T",
                formulaDescription = "Termometría de conversión absoluta/relativa y expansión geométrica térmica.",
                admissionTip = "¡Pregunta fija de admisión! ¿A qué temperatura la escala Celsius y Fahrenheit marcan el mismo valor numérico? A -40° (C = F = -40°).",
                admissionExplanation = "• El agua presenta un comportamiento anómalo entre 0 °C y 4 °C: al calentarse en ese intervalo, su volumen se contrae y su densidad aumenta, alcanzando su densidad máxima a 4 °C."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un termómetro graduado en grados Fahrenheit marca 77 °F. ¿A cuántos grados Celsius equivale dicha lectura?",
                    options = listOf("15 °C", "20 °C", "25 °C", "30 °C", "35 °C"),
                    correctIndex = 2,
                    explanation = "C / 5 = (F - 32) / 9 => C / 5 = (77 - 32) / 9 = 45 / 9 = 5 => C = 5 · 5 = 25 °C.",
                    subject = "Física",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "fis_t09_s02",
            subjectId = "fisica",
            semana = 9,
            subtema = "9.2 Calor Sensible, Capacidad Calorífica y Equilibrio Térmico",
            title = "Calorimetría y Equilibrio Térmico",
            theory = LessonTheory(
                id = "theory_fis_t09_s02",
                asignatura = "Física",
                semana = 9,
                titulo = "Calorimetría y Equilibrio Térmico",
                resumen = "El calor (Q) es la energía térmica en tránsito que fluye espontáneamente desde un cuerpo de mayor temperatura a otro de menor temperatura.\n\n• Calor Sensible (Produce cambio de temperatura sin cambio de fase):\nQ = m · c_e · ΔT\n(m en gramos o kg, c_e calor específico, ΔT = T_final - T_inicial).\n- Para el agua líquida: c_e(agua) = 1 cal/(g·°C) = 4186 J/(kg·K).\n- Para el hielo o vapor: c_e ≈ 0.5 cal/(g·°C).\n- Capacidad Calorífica (C): C = m · c_e = Q / ΔT.\n\n• Ley Cero y Principio Fundamental de la Calorimetría (Equilibrio Térmico):\nEn un sistema térmicamente aislado (calorímetro ideal), la suma algebraica de calores intercambiados es cero:\nΣ Q = 0  =>  Q_ganado = Q_perdido\nLos cuerpos alcanzan una temperatura final de equilibrio (T_e) intermedia entre las iniciales.",
                conceptosClave = listOf(
                    "Calor sensible: Q = m · c_e · ΔT (regla mnemotécnica: 'Q = Ce Ma Ta')",
                    "Calor específico del agua líquida: c_e = 1 cal/(g·°C)",
                    "Principio de equilibrio térmico: Q_ganado = Q_perdido"
                ),
                formulas = listOf(
                    "Q = m \\cdot c_e \\cdot \\Delta T = C \\cdot \\Delta T",
                    "\\sum Q = 0 \\implies Q_{\\text{ganado}} = Q_{\\text{perdido}}",
                    "1 \\text{ cal} \\approx 4.186 \\text{ J} \\quad (\\text{Equivalente mecánico de Joule})"
                ),
                formulaName = "Ecuación Fundamental de Calorimetría",
                formulaLatex = "Q = m \\cdot c_e \\cdot \\Delta T, \\quad Q_{\\text{ganado}} = Q_{\\text{perdido}}",
                formulaDescription = "Transferencia de energía térmica entre sustancias hasta alcanzar la temperatura de equilibrio.",
                admissionTip = "Si mezclas masas iguales de la misma sustancia (ej. agua a 20 °C y agua a 80 °C), la temperatura de equilibrio es simplemente el promedio aritmético: (20 + 80)/2 = 50 °C.",
                admissionExplanation = "• El calorímetro no es más que un recipiente térmicamente aislado (como un termo) diseñado para evitar pérdidas de calor con el ambiente exterior."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se mezclan 200 g de agua a 20 °C con 300 g de agua a 70 °C en un recipiente de capacidad calorífica despreciable. ¿Cuál es la temperatura de equilibrio térmico de la mezcla?",
                    options = listOf("40 °C", "45 °C", "50 °C", "55 °C", "60 °C"),
                    correctIndex = 2,
                    explanation = "Q_ganado = Q_perdido => m₁ · c_e · (T_e - 20) = m₂ · c_e · (70 - T_e)\n200 (T_e - 20) = 300 (70 - T_e) => 2 (T_e - 20) = 3 (70 - T_e)\n2T_e - 40 = 210 - 3T_e => 5T_e = 250 => T_e = 50 °C.",
                    subject = "Física",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "fis_t09_s03",
            subjectId = "fisica",
            semana = 9,
            subtema = "9.3 Cambio de Fase y Calor Latente de Fusión/Vaporización",
            title = "Cambio de Fase y Calor Latente",
            theory = LessonTheory(
                id = "theory_fis_t09_s03",
                asignatura = "Física",
                semana = 9,
                titulo = "Cambio de Fase y Calor Latente",
                resumen = "Durante un cambio de fase (estado físico), la sustancia absorbe o libera calor a TEMPERATURA CONSTANTE (la energía se utiliza para romper o formar enlaces intermoleculares, no para elevar la agitación cinética).\n\n• Calor Latente de Transformación (Q_L):\nQ = m · L\n(donde L es el calor latente específico de la sustancia).\n\n• Valores Notables para el Agua a 1 atm de presión:\n1. Fusión / Solidificación (a 0 °C):\n   L_F = 80 cal/g   (para fundir 1 g de hielo a 0 °C se requieren 80 cal).\n2. Vaporización / Condensación (a 100 °C):\n   L_V = 540 cal/g   (para evaporar 1 g de agua líquida a 100 °C se requieren 540 cal).\n\nPara transformar hielo a -10 °C en vapor a 100 °C se suman los tramos:\nQ_total = Q_sensible(hielo) + Q_latente(fusión) + Q_sensible(agua líquida) + Q_latente(vaporización).",
                conceptosClave = listOf(
                    "En todo cambio de fase de una sustancia pura, la temperatura permanece rigurosamente CONSTANTE",
                    "Calor de fusión del agua: L_F = 80 cal/g",
                    "Calor de vaporización del agua: L_V = 540 cal/g"
                ),
                formulas = listOf(
                    "Q_L = m \\cdot L",
                    "L_{\\text{fusión}}(\\text{H}_2\\text{O}) = 80 \\text{ cal/g}, \\quad L_{\\text{vaporización}}(\\text{H}_2\\text{O}) = 540 \\text{ cal/g}"
                ),
                formulaName = "Calor Latente de Cambio de Fase",
                formulaLatex = "Q = m \\cdot L_F, \\quad Q = m \\cdot L_V",
                formulaDescription = "Energía térmica involucrada en transiciones de fase a temperatura constante.",
                admissionTip = "¡Mucho cuidado! Para fundir hielo primero debes llevarlo a 0 °C usando calor sensible (Q = m · 0.5 · ΔT), y recién a 0 °C aplicas Q = m · 80 cal/g.",
                admissionExplanation = "• La ebullición del agua depende de la presión atmosférica: en Arequipa o Puno (menor presión atmosférica que a nivel del mar), el agua hierve a menos de 100 °C (aprox. 89-92 °C)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántas calorías se necesitan para fundir completamente 50 g de hielo que se encuentran ya en su punto de fusión a 0 °C?",
                    options = listOf("800 cal", "2000 cal", "4000 cal", "5400 cal", "27000 cal"),
                    correctIndex = 2,
                    explanation = "Como el hielo ya se encuentra a 0 °C, solo se requiere calor latente de fusión:\nQ = m · L_F = (50 g) · (80 cal/g) = 4000 cal.",
                    subject = "Física",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "fis_t09_s04",
            subjectId = "fisica",
            semana = 9,
            subtema = "9.4 Primera Ley de la Termodinámica y Procesos en Gases",
            title = "Primera Ley de la Termodinámica",
            theory = LessonTheory(
                id = "theory_fis_t09_s04",
                asignatura = "Física",
                semana = 9,
                titulo = "Primera Ley de la Termodinámica",
                resumen = "• Primera Ley de la Termodinámica (Conservación de la Energía en Sistemas Térmicos):\nEl calor suministrado a un sistema gaseoso se invierte en realizar trabajo mecánico sobre el entorno y en variar su energía interna:\nQ = W + ΔU   =>   ΔU = Q - W\n(Energía interna para gas monoatómico: ΔU = (3/2) n R ΔT).\n\n• Convención de Signos Termodinámicos (IUPAC / Admisión):\n- Calor suministrado al gas: Q > 0 (+); Calor cedido o liberado: Q < 0 (-).\n- Trabajo realizado por el gas (expansión, volumen aumenta): W > 0 (+).\n- Trabajo realizado sobre el gas (compresión, volumen disminuye): W < 0 (-).\n\n• Procesos Termodinámicos Notables:\n1. Isobárico (Presión constante P): W = P · ΔV = P (V_f - V_i).\n2. Isocórico o Isométrico (Volumen constante V): No hay desplazamiento de pistón => W = 0 => Q = ΔU.\n3. Isotérmico (Temperatura constante T): ΔT = 0 => ΔU = 0 => Q = W.\n4. Adiabático (Sin intercambio de calor con el entorno): Q = 0 => W = - ΔU.",
                conceptosClave = listOf(
                    "Primera Ley: Q = W + ΔU (Conservación de la energía)",
                    "Proceso isobárico (P constante): W = P · ΔV",
                    "Proceso isocórico (V constante): W = 0, el calor va todo a variar la energía interna (Q = ΔU)",
                    "Proceso adiabático (sin calor Q = 0): W = - ΔU"
                ),
                formulas = listOf(
                    "Q = W + \\Delta U, \\quad \\Delta U = \\frac{3}{2} n R \\Delta T \\; (\\text{monoatómico})",
                    "W_{\\text{isobárico}} = P \\cdot \\Delta V, \\quad W_{\\text{isocórico}} = 0"
                ),
                formulaName = "Primera Ley de la Termodinámica",
                formulaLatex = "Q = W + \\Delta U, \\quad W = P \\Delta V \\; (P = \\text{cte})",
                formulaDescription = "Balance de conservación de energía entre calor, trabajo y energía interna molecular.",
                admissionTip = "En un gráfico Presión vs Volumen (P - V), el trabajo de un ciclo cerrado es numéricamente igual al ÁREA encerrada por el ciclo; si el ciclo se recorre en sentido HORARIO, el trabajo neto es POSITIVO (+).",
                admissionExplanation = "• Un gas ideal que se expande adiabáticamente se enfría obligatoriamente porque realiza trabajo a expensas de disminuir su propia energía interna (W > 0 => ΔU < 0 => ΔT < 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t09_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un gas encerrado en un cilindro absorbe 500 J de calor mientras se expande realizando un trabajo de 300 J sobre el émbolo. ¿Cuál es la variación de su energía interna (ΔU)?",
                    options = listOf("100 J", "200 J", "300 J", "500 J", "800 J"),
                    correctIndex = 1,
                    explanation = "Por la Primera Ley de la Termodinámica: Q = W + ΔU => ΔU = Q - W = 500 J - 300 J = +200 J.",
                    subject = "Física",
                    semana = 9
                )
            )
        ),

        // ==========================================
        // SEMANA 10: MECÁNICA DE FLUIDOS
        // ==========================================
        LessonNode(
            id = "fis_t10_s01",
            subjectId = "fisica",
            semana = 10,
            subtema = "10.1 Densidad, Presión y Principio Fundamental de la Hidrostática",
            title = "Densidad y Presión Hidrostática",
            theory = LessonTheory(
                id = "theory_fis_t10_s01",
                asignatura = "Física",
                semana = 10,
                titulo = "Densidad y Presión Hidrostática",
                resumen = "• Densidad (ρ) y Peso Específico (γ):\nρ = m / V   (kg/m³ o g/cm³; para agua líquida: ρ = 1000 kg/m³ = 1 g/cm³).\nγ = P / V = ρ · g   (N/m³).\n\n• Presión (p):\nFuerza perpendicular normal aplicada por unidad de superficie: p = F_normal / A   (Pascal [Pa] = N/m²).\n\n• Presión Hidrostática (p_h):\nPresión generada exclusivamente por el peso de la columna de líquido en reposo sobre un punto situado a una profundidad 'h':\np_h = ρ_líquido · g · h\n\n• Presión Total o Absoluta (p_total):\nSuma de la presión atmosférica exterior y la presión hidrostática del fluido:\np_total = p_atm + p_h = p_atm + ρ · g · h\n(Presión atmosférica estándar a nivel del mar: 1 atm ≈ 101.3 kPa ≈ 10⁵ Pa = 760 mmHg).",
                conceptosClave = listOf(
                    "Presión hidrostática: p_h = ρ · g · h (depende de la profundidad, no del volumen total ni de la forma del recipiente)",
                    "Densidad del agua: 1000 kg/m³",
                    "Presión total o absoluta: p_total = p_atm + p_hidrostática"
                ),
                formulas = listOf(
                    "\\rho = \\frac{m}{V}, \\quad p = \\frac{F}{A}, \\quad p_h = \\rho_{\\text{líq}} \\cdot g \\cdot h",
                    "p_{\\text{absoluta}} = p_{\\text{atm}} + \\rho g h \\quad (p_{\\text{atm}} \\approx 10^5 \\text{ Pa})"
                ),
                formulaName = "Principio Fundamental de la Hidrostática",
                formulaLatex = "p_h = \\rho g h, \\quad p_{\\text{total}} = p_{\\text{atm}} + \\rho g h",
                formulaDescription = "Gradiente de presión estática en el seno de un fluido incompresible en reposo.",
                admissionTip = "Paradoja Hidrostática: La presión en el fondo de un recipiente depende únicamente de la PROFUNDIDAD 'h' y de la naturaleza del líquido, jamás de la forma ni del ancho del recipiente.",
                admissionExplanation = "• Por cada 10 metros de profundidad que desciendes en agua pura, la presión hidrostática aumenta aproximadamente en 1 atmósfera (10⁵ Pa)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un buzo se sumerge a 20 m de profundidad en un lago de agua dulce (ρ = 1000 kg/m³; g = 10 m/s²). ¿Cuál es la presión hidrostática que experimenta?",
                    options = listOf("20 kPa", "50 kPa", "100 kPa", "200 kPa", "300 kPa"),
                    correctIndex = 3,
                    explanation = "p_h = ρ · g · h = (1000 kg/m³) · (10 m/s²) · (20 m) = 200 000 Pa = 200 kPa.",
                    subject = "Física",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "fis_t10_s02",
            subjectId = "fisica",
            semana = 10,
            subtema = "10.2 Vasos Comunicantes y Principio de Pascal",
            title = "Vasos Comunicantes y Prensa Hidráulica",
            theory = LessonTheory(
                id = "theory_fis_t10_s02",
                asignatura = "Física",
                semana = 10,
                titulo = "Vasos Comunicantes y Prensa Hidráulica",
                resumen = "• Vasos Comunicantes y Tubos en U:\nEn un mismo líquido homogéneo y continuo en reposo, todos los puntos situados a la misma profundidad o nivel horizontal tienen exactamente la MISMA presión (superficies isobáricas):\np_A = p_B => ρ₁ · g · h₁ = ρ₂ · g · h₂ => ρ₁ · h₁ = ρ₂ · h₂\n(Las alturas de líquidos inmiscibles son inversamente proporcionales a sus densidades).\n\n• Principio de Blaise Pascal (1653):\nToda variación de presión ejercida sobre un fluido incompresible y en equilibrio encerrado en un recipiente de paredes indeformables se transmite íntegramente y con la misma intensidad en todas las direcciones y a todos los puntos del fluido.\n\n• Prensa Hidráulica:\nMultiplicador de fuerza mecánico:\nΔp₁ = Δp₂ => F₁ / A₁ = F₂ / A₂\n- Como el volumen de líquido desplazado es constante (V₁ = V₂ => A₁ · h₁ = A₂ · h₂):\nF₁ · h₁ = F₂ · h₂  (Trabajo W₁ = W₂, no hay ganancia de energía).",
                conceptosClave = listOf(
                    "Superficie isobárica en tubos en U: ρ₁ · h₁ = ρ₂ · h₂ para líquidos inmiscibles",
                    "Principio de Pascal: la presión se transmite por igual en todo el fluido",
                    "Prensa hidráulica: F₁ / A₁ = F₂ / A₂ (multiplicación de fuerza proporcional al área)"
                ),
                formulas = listOf(
                    "\\rho_1 h_1 = \\rho_2 h_2 \\quad (\\text{Tubo en U})",
                    "\\frac{F_1}{A_1} = \\frac{F_2}{A_2} = \\frac{F_1}{\\pi R_1^2} = \\frac{F_2}{\\pi R_2^2} \\quad (\\text{Pascal})"
                ),
                formulaName = "Principio de Pascal y Prensa Hidráulica",
                formulaLatex = "\\frac{F_1}{A_1} = \\frac{F_2}{A_2} \\implies F_2 = F_1 \\left(\\frac{R_2}{R_1}\\right)^2",
                formulaDescription = "Transmisión isótropa de presión hidráulica y multiplicación mecánica de fuerzas.",
                admissionTip = "Si el radio del émbolo mayor es el triple del menor (R₂ = 3 R₁), el área es 9 veces mayor (3² = 9), por lo que la fuerza se multiplica por 9 (F₂ = 9 F₁).",
                admissionExplanation = "• Los frenos hidráulicos de los automóviles y los sillones de dentista son aplicaciones prácticas directas del Principio de Pascal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una prensa hidráulica, los émbolos tienen áreas de 5 cm² y 250 cm². Si en el émbolo menor se aplica una fuerza de 40 N, ¿qué fuerza máxima se ejerce en el émbolo mayor?",
                    options = listOf("400 N", "1000 N", "2000 N", "4000 N", "5000 N"),
                    correctIndex = 2,
                    explanation = "F₁ / A₁ = F₂ / A₂ => 40 / 5 = F₂ / 250 => 8 = F₂ / 250 => F₂ = 8 · 250 = 2000 N.",
                    subject = "Física",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "fis_t10_s03",
            subjectId = "fisica",
            semana = 10,
            subtema = "10.3 Principio de Arquímedes, Empuje y Flotabilidad",
            title = "Principio de Arquímedes y Flotabilidad",
            theory = LessonTheory(
                id = "theory_fis_t10_s03",
                asignatura = "Física",
                semana = 10,
                titulo = "Principio de Arquímedes y Flotabilidad",
                resumen = "• Principio de Arquímedes de Siracusa:\nTodo cuerpo sumergido total o parcialmente en un fluido experimenta una fuerza vertical dirigida hacia arriba denominada EMPUJE HIDROSTÁTICO (E), cuyo valor es exactamente igual al peso del volumen de fluido desalojado:\nE = m_líquido_desalojado · g = ρ_líquido · g · V_sumergido\n(V_sumergido es la porción de volumen del cuerpo que se encuentra bajo el nivel del líquido).\n\n• Peso Aparente:\nCuando un cuerpo denso se sumerge en un fluido, parece pesar menos:\nPeso Aparente = Peso Real - Empuje  (P_ap = P_real - E).\n\n• Condiciones de Flotabilidad:\n1. Si ρ_cuerpo < ρ_líquido: El cuerpo flota parcialmente en equilibrio: E = P_real => V_sumergido / V_total = ρ_cuerpo / ρ_líquido.\n2. Si ρ_cuerpo = ρ_líquido: El cuerpo queda en equilibrio totalmente sumergido entre aguas.\n3. Si ρ_cuerpo > ρ_líquido: El cuerpo se hunde hasta el fondo.",
                conceptosClave = listOf(
                    "Fuerza de Empuje: E = ρ_líquido · g · V_sumergido (vertical hacia arriba)",
                    "El empuje depende de la densidad del LÍQUIDO, no de la densidad del cuerpo sumergido",
                    "Cuerpo flotando en equilibrio: V_sumergido / V_total = ρ_cuerpo / ρ_líquido"
                ),
                formulas = listOf(
                    "E = \\rho_{\\text{líq}} \\cdot g \\cdot V_{\\text{sumergido}}",
                    "P_{\\text{aparente}} = P_{\\text{real}} - E, \\quad \\frac{V_s}{V_T} = \\frac{\\rho_{\\text{cuerpo}}}{\\rho_{\\text{líquido}}}"
                ),
                formulaName = "Ley de Empuje Hidrostático de Arquímedes",
                formulaLatex = "E = \\rho_{\\text{líq}} g V_{\\text{sumergido}}, \\quad P_{\\text{ap}} = P - E",
                formulaDescription = "Fuerza boyante neta resultante generada por gradiente de presión sobre sólidos sumergidos.",
                admissionTip = "Si un iceberg de hielo (ρ = 900 kg/m³) flota en agua de mar (ρ = 1000 kg/m³), la fracción sumergida es V_s / V_T = 900 / 1000 = 0.9 = 90% (solo el 10% emerge a la vista).",
                admissionExplanation = "• El empuje surge de la diferencia de presiones hidrostáticas entre la base inferior del cuerpo (a mayor profundidad) y la cara superior (a menor profundidad)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t10_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un bloque cúbico de 0.02 m³ de volumen se encuentra totalmente sumergido en agua (ρ = 1000 kg/m³; g = 10 m/s²). ¿Cuál es la magnitud del empuje hidrostático que experimenta?",
                    options = listOf("20 N", "100 N", "200 N", "500 N", "2000 N"),
                    correctIndex = 2,
                    explanation = "E = ρ_líq · g · V_sumergido = (1000 kg/m³) · (10 m/s²) · (0.02 m³) = 200 N.",
                    subject = "Física",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "fis_t10_s04",
            subjectId = "fisica",
            semana = 10,
            subtema = "10.4 Hidrodinámica: Ecuación de Continuidad y Principio de Bernoulli",
            title = "Hidrodinámica: Continuidad y Bernoulli",
            theory = LessonTheory(
                id = "theory_fis_t10_s04",
                asignatura = "Física",
                semana = 10,
                titulo = "Hidrodinámica: Continuidad y Bernoulli",
                resumen = "La hidrodinámica estudia el flujo de fluidos ideales (incompresibles, no viscosos y en régimen laminar estacionario).\n\n• Caudal o Gasto Volumétrico (Q):\nVolumen de fluido que atraviesa una sección transversal por unidad de tiempo:\nQ = V / t = A · v   (m³/s)\n(donde A es el área de la tubería y v la rapidez del flujo).\n\n• Ecuación de Continuidad (Conservación de la Masa):\nEl caudal que entra por una sección estrecha es idéntico al que sale por una sección ancha:\nQ₁ = Q₂ => A₁ · v₁ = A₂ · v₂\n(A menor área transversal, mayor es la velocidad del fluido: un estrechamiento acelera el líquido).\n\n• Ecuación de Daniel Bernoulli (Conservación de la Energía Hidrodinámica):\np + (1/2) ρ v² + ρ g h = constante\n- Efecto Venturi: En una tubería horizontal a la misma altura, a mayor rapidez del fluido menor es su presión interna (y viceversa). Explica la sustentación de las alas de los aviones y el atomizador de perfume.",
                conceptosClave = listOf(
                    "Caudal o gasto: Q = A · v = constante a lo largo de una tubería continua",
                    "Ecuación de continuidad: A₁ v₁ = A₂ v₂ (a menor sección, mayor rapidez)",
                    "Principio de Bernoulli y Efecto Venturi: mayor velocidad implica menor presión lateral"
                ),
                formulas = listOf(
                    "Q = A \\cdot v = \\frac{V}{t}, \\quad A_1 v_1 = A_2 v_2 \\quad (\\text{Continuidad})",
                    "p_1 + \\frac{1}{2}\\rho v_1^2 + \\rho g h_1 = p_2 + \\frac{1}{2}\\rho v_2^2 + \\rho g h_2 \\quad (\\text{Bernoulli})"
                ),
                formulaName = "Ecuación de Continuidad y Ley de Bernoulli",
                formulaLatex = "A_1 v_1 = A_2 v_2, \\quad p + \\frac{1}{2}\\rho v^2 + \\rho gh = \\text{cte}",
                formulaDescription = "Conservación de la masa y energía en dinámica de fluidos ideales estacionarios.",
                admissionTip = "Cuando tapas parcialmente la salida de una manguera con el dedo reduces el área A a la mitad, por lo que la velocidad del chorro v se DUPLICA automáticamente (A₁ v₁ = A₂ v₂).",
                admissionExplanation = "• Teorema de Torricelli: La velocidad con que sale un líquido por un orificio practicado a una profundidad h bajo la superficie libre de un tanque abierto es v = √(2gh), idéntica a la de caída libre."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t10_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Por una tubería horizontal de sección A₁ = 12 cm² fluye agua con una rapidez de 2 m/s. Si la tubería se estrecha a una sección A₂ = 4 cm², ¿cuál es la rapidez del agua en el estrechamiento?",
                    options = listOf("3 m/s", "4 m/s", "6 m/s", "8 m/s", "12 m/s"),
                    correctIndex = 2,
                    explanation = "Por la ecuación de continuidad: A₁ · v₁ = A₂ · v₂ => (12 cm²) · (2 m/s) = (4 cm²) · v₂ => 24 = 4 v₂ => v₂ = 6 m/s.",
                    subject = "Física",
                    semana = 10
                )
            )
        ),

        // ==========================================
        // SEMANA 11: ELECTRICIDAD (ELECTROSTÁTICA Y ELECTRODINÁMICA)
        // ==========================================
        LessonNode(
            id = "fis_t11_s01",
            subjectId = "fisica",
            semana = 11,
            subtema = "11.1 Carga Eléctrica, Ley de Coulomb y Campo Eléctrico",
            title = "Carga Eléctrica, Ley de Coulomb y Campo",
            theory = LessonTheory(
                id = "theory_fis_t11_s01",
                asignatura = "Física",
                semana = 11,
                titulo = "Carga Eléctrica, Ley de Coulomb y Campo",
                resumen = "• Carga Eléctrica (q):\nPropiedad intrínseca de la materia. Carga elemental del electrón: e⁻ = -1.6 × 10⁻¹⁹ C. Cuantizada: q = ± n · e.\n\n• Ley de Charles Coulomb (Interacción Electrostática):\nLa fuerza electrostática entre dos cargas puntuales en reposo es directamente proporcional al producto de sus magnitudes e inversamente proporcional al cuadrado de la distancia que las separa:\nF_e = k · (|q₁| · |q₂|) / d²\n(Constante electrostática en el vacío: k = 9 × 10⁹ N·m²/C²).\n- Cargas del mismo signo se repelen; cargas de signo opuesto se atraen.\n\n• Campo Eléctrico (E):\nRegión del espacio modificada por la presencia de cargas eléctricas. Intensidad de campo eléctrico debido a una carga puntual Q:\nE = F_e / |q₀| = k · |Q| / d²   (N/C o V/m)\n- Las líneas de campo eléctrico SALEN de las cargas positivas (fuentes) y ENTRAN a las cargas negativas (sumideros).\n- Fuerza sobre una carga q colocada en un campo E: F = q · E.",
                conceptosClave = listOf(
                    "Cuantización de la carga: q = n · e (e = 1.6 × 10⁻¹⁹ C)",
                    "Ley de Coulomb: F = k |q₁ q₂| / d² (con k = 9 × 10⁹ N·m²/C²)",
                    "Campo eléctrico: E = k Q / d²; fuerza eléctrica F = q · E"
                ),
                formulas = listOf(
                    "F_e = k \\frac{|q_1 q_2|}{d^2} \\quad (k = 9 \\times 10^9 \\text{ N}\\cdot\\text{m}^2/\\text{C}^2)",
                    "\\vec{E} = \\frac{\\vec{F}}{q}, \\quad E = k \\frac{|Q|}{d^2}"
                ),
                formulaName = "Ley de Coulomb y Campo Eléctrico",
                formulaLatex = "F_e = k \\frac{|q_1 q_2|}{d^2}, \\quad E = k \\frac{|Q|}{d^2}, \\quad F = q E",
                formulaDescription = "Fuerza electrostática e intensidad vectorial de campo de cargas puntuales.",
                admissionTip = "Si duplicas la distancia entre dos cargas puntuales (de d a 2d), la fuerza electrostática se reduce a la CUARTA parte (F/4), pues depende inversamente de d².",
                admissionExplanation = "• En el interior de un conductor en equilibrio electrostático (jaula de Faraday), el campo eléctrico es exactamente CERO (E_interior = 0) y el exceso de carga reside en la superficie exterior."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos cargas puntuales de +2 μC y +8 μC se encuentran separadas 60 cm en el vacío. Considerando k = 9 × 10⁹ N·m²/C², la fuerza de repulsión entre ellas es:",
                    options = listOf("0.2 N", "0.4 N", "0.8 N", "1.2 N", "4.0 N"),
                    correctIndex = 1,
                    explanation = "q₁ = 2 × 10⁻⁶ C; q₂ = 8 × 10⁻⁶ C; d = 60 cm = 0.6 m.\nF = (9 × 10⁹) · (2 × 10⁻⁶) · (8 × 10⁻⁶) / (0.6)² = (9 · 16 · 10⁻³) / 0.36 = 144 × 10⁻³ / 0.36 = 0.4 N.",
                    subject = "Física",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "fis_t11_s02",
            subjectId = "fisica",
            semana = 11,
            subtema = "11.2 Potencial Eléctrico, Diferencia de Potencial y Condensadores",
            title = "Potencial Eléctrico y Capacidad",
            theory = LessonTheory(
                id = "theory_fis_t11_s02",
                asignatura = "Física",
                semana = 11,
                titulo = "Potencial Eléctrico y Capacidad",
                resumen = "• Potencial Eléctrico (V):\nMagnitud escalar que mide la energía potencial electrostática por unidad de carga testigo:\nV = k · Q / d   (Voltio [V] = Joule / Coulomb).\n(¡Lleva el signo real de la carga Q: positivo si Q > 0, negativo si Q < 0!).\n\n• Trabajo Eléctrico y Diferencia de Potencial (Voltaje ΔV = V_A - V_B):\nTrabajo necesario para trasladar una carga q desde un punto A hasta B:\nW_(A->B) = q · (V_A - V_B)   (en campo conservativo).\n\n• Campo Eléctrico Uniforme entre Placas Paralelas:\nE = V / d  =>  V = E · d.\n\n• Capacidad Eléctrica de un Condensador o Capacitor (C):\nC = Q / V   (Faradio [F] = C/V).\n- Condensador de placas planas y paralelas:\nC = ε₀ · (A / d)\n- Energía almacenada en un condensador:\nU = (1/2) C V² = (1/2) Q V = Q² / (2C).",
                conceptosClave = listOf(
                    "Potencial escalar: V = k Q / d (se sustituye la carga con su signo algebraico)",
                    "Trabajo de traslación de carga: W = q · (V_A - V_B)",
                    "Condensadores: C = Q / V = ε₀ A / d; Energía U = (1/2) C V²"
                ),
                formulas = listOf(
                    "V = k \\frac{Q}{d}, \\quad W_{A \\to B} = q (V_A - V_B), \\quad E = \\frac{V}{d}",
                    "C = \\frac{Q}{V} = \\varepsilon_0 \\frac{A}{d}, \\quad U = \\frac{1}{2} C V^2"
                ),
                formulaName = "Potencial y Capacidad Eléctrica",
                formulaLatex = "V = k \\frac{Q}{d}, \\quad C = \\frac{Q}{V}, \\quad U = \\frac{1}{2} C V^2",
                formulaDescription = "Tratamiento energético escalar del campo electrostático y acumulación de carga en capacitores.",
                admissionTip = "A diferencia del campo eléctrico (vectorial), el potencial eléctrico es ESCALAR: para hallar el potencial resultante en un punto simplemente sumas algebraicamente los potenciales con su signo (+ o -).",
                admissionExplanation = "• Si se conectan condensadores en paralelo: C_eq = C₁ + C₂; si se conectan en serie: 1/C_eq = 1/C₁ + 1/C₂ (justo al revés que las resistencias eléctricas)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un condensador almacena una carga de 40 μC cuando se le conecta a una diferencia de potencial de 20 V. ¿Cuál es su capacidad eléctrica?",
                    options = listOf("0.5 μF", "1.0 μF", "2.0 μF", "4.0 μF", "8.0 μF"),
                    correctIndex = 2,
                    explanation = "C = Q / V = (40 μC) / (20 V) = 2.0 μF.",
                    subject = "Física",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "fis_t11_s03",
            subjectId = "fisica",
            semana = 11,
            subtema = "11.3 Corriente Eléctrica, Ley de Ohm y Asociación de Resistencias",
            title = "Electrodinámica: Ley de Ohm y Resistencias",
            theory = LessonTheory(
                id = "theory_fis_t11_s03",
                asignatura = "Física",
                semana = 11,
                titulo = "Electrodinámica: Ley de Ohm y Resistencias",
                resumen = "• Intensidad de Corriente Eléctrica (I):\nCantidad neta de carga que atraviesa la sección de un conductor por unidad de tiempo:\nI = q / t   (Ampere [A] = Coulomb / segundo).\n\n• Resistencia de un Conductor (Segunda Ley de Ohm o Ley de Pouillet):\nR = ρ_resistividad · (L / A)\n(L longitud del cable en metros, A área transversal en m², ρ resistividad en Ω·m).\n\n• Primera Ley de Georg Simon Ohm:\nV = I · R\n(Voltaje en Voltios, I en Amperios y R en Ohmios [Ω]).\n\n• Asociación de Resistencias:\n1. En Serie (la misma corriente I atraviesa todas las resistencias):\nR_eq = R₁ + R₂ + R₃ + ...   (V_total = V₁ + V₂).\n2. En Paralelo (el mismo voltaje V actúa en todas las ramas):\n1 / R_eq = 1 / R₁ + 1 / R₂ + 1 / R₃  (I_total = I₁ + I₂).\n- Caso particular para dos resistencias en paralelo: R_eq = (R₁ · R₂) / (R₁ + R₂).",
                conceptosClave = listOf(
                    "Intensidad de corriente: I = q / t (flujo ordenado de electrones)",
                    "Ley de Ohm: V = I · R (regla mnemotécnica: 'Victoria Reina de Inglaterra')",
                    "Resistencias en serie (R_eq = Σ R_i) vs en paralelo (R_eq = producto / suma para dos)"
                ),
                formulas = listOf(
                    "I = \\frac{q}{t}, \\quad R = \\rho \\frac{L}{A} \\quad (\\text{Pouillet})",
                    "V = I \\cdot R \\quad (\\text{Ley de Ohm})",
                    "R_{\\text{serie}} = R_1 + R_2, \\quad R_{\\text{paralelo}} = \\frac{R_1 R_2}{R_1 + R_2}"
                ),
                formulaName = "Leyes de Ohm y Pouillet",
                formulaLatex = "V = I \\cdot R, \\quad R = \\rho \\frac{L}{A}, \\quad R_{\\text{eq}} = \\frac{R_1 R_2}{R_1 + R_2}",
                formulaDescription = "Modelos fundamentales de transporte de carga y disipación resistiva lineal.",
                admissionTip = "Si conectas 'n' resistencias idénticas de valor 'R' en paralelo, la resistencia equivalente resultante es simplemente R_eq = R / n.",
                admissionExplanation = "• El sentido convencional de la corriente eléctrica fluye del polo positivo (+) al negativo (-), aunque los electrones reales se muevan en sentido opuesto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t11_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos resistencias de 6 Ω y 12 Ω se conectan en paralelo y se conectan a una fuente de 24 V. ¿Cuál es la corriente total suministrada por la fuente?",
                    options = listOf("2 A", "4 A", "6 A", "8 A", "10 A"),
                    correctIndex = 2,
                    explanation = "Resistencia equivalente en paralelo: R_eq = (6 · 12) / (6 + 12) = 72 / 18 = 4 Ω.\nCorriente total por Ley de Ohm: I = V / R_eq = 24 V / 4 Ω = 6 A.",
                    subject = "Física",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "fis_t11_s04",
            subjectId = "fisica",
            semana = 11,
            subtema = "11.4 Leyes de Kirchhoff, Potencia Eléctrica y Efecto Joule",
            title = "Leyes de Kirchhoff y Potencia Eléctrica",
            theory = LessonTheory(
                id = "theory_fis_t11_s04",
                asignatura = "Física",
                semana = 11,
                titulo = "Leyes de Kirchhoff y Potencia Eléctrica",
                resumen = "• Potencia Eléctrica Disipada (Efecto Joule):\nTransformación de energía eléctrica en calor al pasar por una resistencia:\nP = V · I = I² · R = V² / R   (en Watts [W]).\nEnergía disipada o calor generado (Ley de Joule):\nQ = P · t = I² · R · t   (en Joules; en calorías: Q ≈ 0.24 · I² · R · t).\n\n• Reglas o Leyes de Gustav Kirchhoff para Circuitos Complejos:\n1. Primera Ley de Kirchhoff (Ley de Nudos / Conservación de la Carga):\nEn cualquier nudo de un circuito eléctrico, la suma de corrientes que entran es idéntica a la suma de corrientes que salen:\nΣ I_entran = Σ I_salen.\n\n2. Segunda Ley de Kirchhoff (Ley de Mallas / Conservación de la Energía):\nEn cualquier circuito cerrado o malla, la suma algebraica de fuerzas electromotrices (voltajes suministrados) es igual a la suma de caídas de tensión (I · R):\nΣ ε = Σ (I · R).",
                conceptosClave = listOf(
                    "Potencia eléctrica disipada: P = V · I = I² · R = V² / R",
                    "Ley de Joule: calor disipado Q = I² R t",
                    "Primera Ley de Kirchhoff: Σ I_entran = Σ I_salen (conservación de carga)",
                    "Segunda Ley de Kirchhoff: Σ ε = Σ (I R) en mallas cerradas (conservación de energía)"
                ),
                formulas = listOf(
                    "P = V \\cdot I = I^2 R = \\frac{V^2}{R}, \\quad Q_{\\text{Joule}} = I^2 R t",
                    "\\sum I_{\\text{nudo}} = 0, \\quad \\sum \\varepsilon = \\sum (I \\cdot R) \\quad (\\text{Kirchhoff})"
                ),
                formulaName = "Potencia Eléctrica y Leyes de Kirchhoff",
                formulaLatex = "P = I^2 R, \\quad \\sum I_{\\text{entran}} = \\sum I_{\\text{salen}}, \\quad \\sum \\varepsilon = \\sum IR",
                formulaDescription = "Resolución topológica de redes eléctricas y balance de potencia en mallas.",
                admissionTip = "Un foco de 100 W conectado a 220 V tiene MENOR resistencia eléctrica que un foco de 40 W (R = V² / P), por lo que por el foco de 100 W circula mayor corriente y brilla con más intensidad.",
                admissionExplanation = "• Los electrodomésticos de una casa se conectan siempre en PARALELO para que todos reciban la misma tensión estándar (220 V en el Perú) y puedan operar de forma independiente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t11_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Por un resistor de 10 Ω circula una corriente constante de 3 A durante 20 segundos. ¿Cuántos Joules de calor se disipan por efecto Joule?",
                    options = listOf("600 J", "900 J", "1800 J", "2400 J", "3600 J"),
                    correctIndex = 2,
                    explanation = "P = I² · R = (3 A)² · (10 Ω) = 9 · 10 = 90 W.\nCalor disipado: Q = P · t = (90 W) · (20 s) = 1800 J.",
                    subject = "Física",
                    semana = 11
                )
            )
        ),

        // ==========================================
        // SEMANA 12: ELECTROMAGNETISMO, ONDAS Y FÍSICA MODERNA
        // ==========================================
        LessonNode(
            id = "fis_t12_s01",
            subjectId = "fisica",
            semana = 12,
            subtema = "12.1 Campo Magnético, Ley de Biot-Savart y Fuerza de Lorentz",
            title = "Campo Magnético y Fuerza de Lorentz",
            theory = LessonTheory(
                id = "theory_fis_t12_s01",
                asignatura = "Física",
                semana = 12,
                titulo = "Campo Magnético y Fuerza de Lorentz",
                resumen = "• Experiencia de Oersted (1820): Una corriente eléctrica engendra a su alrededor un campo magnético.\n\n• Campo Magnético (B) generado por conductores (Biot-Savart):\n- Conductor rectilíneo infinito a distancia d:\n  B = (μ₀ · I) / (2π · d)   (en Teslas [T]; μ₀ = 4π × 10⁻⁷ T·m/A).\n- En el centro de una espira circular de radio R: B = (μ₀ · I) / (2 R).\n- Dirección: Regla de la mano derecha (pulgar en dirección de la corriente I, dedos curvos señalan las líneas de campo B).\n\n• Fuerza Magnética sobre Cargas en Movimiento (Fuerza de Lorentz):\nF_m = |q| · v · B · sen θ\n(θ es el ángulo entre la velocidad v y el campo magnético B).\n- Regla de la Palma Derecha: pulgar = v, dedos estirados = B, la palma empuja a cargas positivas (+) y el dorso a negativas (-).\n- Si θ = 0° o 180°: v paralelo a B => F_m = 0 (la partícula sigue en MRU).\n- Si entra perpendicular (θ = 90°): describe un Movimiento Circular Uniforme con radio:\nR = (m · v) / (|q| · B).",
                conceptosClave = listOf(
                    "Campo magnético de conductor rectilíneo: B = μ₀ I / (2π d)",
                    "Fuerza de Lorentz sobre carga: F_m = |q| v B sen θ",
                    "Trayectoria circular de carga en campo magnético perpendicular: R = m v / (q B)"
                ),
                formulas = listOf(
                    "B = \\frac{\\mu_0 I}{2\\pi d} \\quad (\\mu_0 = 4\\pi \\times 10^{-7} \\text{ T}\\cdot\\text{m/A})",
                    "F_m = |q| v B \\text{ sen}(\\theta), \\quad R = \\frac{m v}{|q| B}"
                ),
                formulaName = "Leyes de Biot-Savart y Fuerza de Lorentz",
                formulaLatex = "B = \\frac{\\mu_0 I}{2\\pi d}, \\quad F_m = q v B \\text{ sen}(\\theta)",
                formulaDescription = "Generación de campos magnéticos por corrientes e interacción con cargas móviles.",
                admissionTip = "La fuerza magnética NUNCA realiza trabajo mecánico sobre una partícula cargada (W = 0) porque es rigurosamente perpendicular a la velocidad en todo instante; solo curva su trayectoria.",
                admissionExplanation = "• La fuerza magnética sobre un conductor rectilíneo de longitud L por el que pasa corriente I es: F = I · L · B · sen θ."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t12_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un protón (q = 1.6 × 10⁻¹⁹ C) ingresa perpendicularmente a un campo magnético uniforme de 0.2 T con una rapidez de 5 × 10⁶ m/s. ¿Cuál es el módulo de la fuerza magnética que actúa sobre él?",
                    options = listOf("0.8 × 10⁻¹³ N", "1.6 × 10⁻¹³ N", "3.2 × 10⁻¹³ N", "6.4 × 10⁻¹³ N", "1.6 × 10⁻¹² N"),
                    correctIndex = 1,
                    explanation = "Como ingresa perpendicularmente, sen 90° = 1.\nF_m = q · v · B = (1.6 × 10⁻¹⁹ C) · (5 × 10⁶ m/s) · (0.2 T) = 1.6 × 10⁻¹³ N.",
                    subject = "Física",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "fis_t12_s02",
            subjectId = "fisica",
            semana = 12,
            subtema = "12.2 Inducción Electromagnética: Faraday-Lenz y Transformadores",
            title = "Inducción Electromagnética y Transformadores",
            theory = LessonTheory(
                id = "theory_fis_t12_s02",
                asignatura = "Física",
                semana = 12,
                titulo = "Inducción Electromagnética y Transformadores",
                resumen = "• Flujo Magnético (Φ):\nMedida del número de líneas de campo magnético que atraviesan una superficie de área A:\nΦ = B · A · cos θ   (Weber [Wb] = T·m²).\n\n• Ley de Inducción de Michael Faraday:\nToda variación temporal del flujo magnético a través de un circuito induce en él una fuerza electromotriz (voltaje o f.e.m. inducida ε):\nε = - N · (ΔΦ / Δt)   (Voltios [V]).\n\n• Ley de Heinrich Lenz:\nLa corriente inducida tiene un sentido tal que su propio campo magnético se opone siempre a la causa o variación de flujo que la produce (manifestación del principio de conservación de la energía).\n\n• Transformador Eléctrico Ideal:\nDispositivo que modifica voltajes alternos mediante dos bobinas acopladas magnéticamente en un núcleo de hierro:\nV_p / V_s = N_p / N_s = I_s / I_p\n(V_p voltaje primario, V_s secundario; N número de espiras; I corriente).",
                conceptosClave = listOf(
                    "Flujo magnético: Φ = B · A · cos θ (en Webers)",
                    "Ley de Faraday: f.e.m. inducida proporcional a la rapidez de cambio del flujo: ε = - ΔΦ / Δt",
                    "Ley de Lenz: oposición intrínseca a la variación de flujo magnético",
                    "Transformador ideal: V_p / V_s = N_p / N_s = I_s / I_p"
                ),
                formulas = listOf(
                    "\\Phi = B \\cdot A \\cdot \\cos(\\theta) \\quad (\\text{Weber})",
                    "\\varepsilon = -\\frac{\\Delta \\Phi}{\\Delta t}, \\quad \\frac{V_p}{V_s} = \\frac{N_p}{N_s} = \\frac{I_s}{I_p}"
                ),
                formulaName = "Leyes de Faraday-Lenz y Transformadores",
                formulaLatex = "\\varepsilon = -\\frac{\\Delta \\Phi}{\\Delta t}, \\quad \\frac{V_p}{V_s} = \\frac{N_p}{N_s}",
                formulaDescription = "Generación de potenciales inducidos por variación temporal de flujo magnético.",
                admissionTip = "Si el flujo magnético es constante en el tiempo (no cambia), la fuerza electromotriz inducida es CERO: solo se genera corriente inducida cuando el flujo AUMENTA o DISMINUYE.",
                admissionExplanation = "• Los transformadores solo funcionan con Corriente Alterna (CA), no con corriente continua (CC), pues requieren un flujo magnético permanentemente oscilante para inducir voltaje."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t12_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un transformador ideal tiene 1000 espiras en el primario y 200 espiras en el secundario. Si se conecta el primario a 220 V de corriente alterna, ¿cuál es el voltaje obtenido en el secundario?",
                    options = listOf("22 V", "44 V", "110 V", "440 V", "1100 V"),
                    correctIndex = 1,
                    explanation = "V_p / V_s = N_p / N_s => 220 / V_s = 1000 / 200 = 5 => V_s = 220 / 5 = 44 V.",
                    subject = "Física",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "fis_t12_s03",
            subjectId = "fisica",
            semana = 12,
            subtema = "12.3 Ondas Mecánicas, Acústica y Óptica Geométrica",
            title = "Ondas, Sonido y Óptica Geométrica",
            theory = LessonTheory(
                id = "theory_fis_t12_s03",
                asignatura = "Física",
                semana = 12,
                titulo = "Ondas, Sonido y Óptica Geométrica",
                resumen = "• Ecuación Fundamental de las Ondas:\nv = λ · f = λ / T\n(v rapidez de propagación determinada por el medio, λ longitud de onda, f frecuencia en Hz).\n- Ondas mecánicas (requieren medio material: sonido) vs Ondas electromagnéticas (se propagan en el vacío a c ≈ 3 × 10⁸ m/s: luz, rayos X, radio).\n\n• Acústica:\nEl sonido es una onda mecánica longitudinal. Rapidez en el aire a 20 °C: v ≈ 340 m/s (v_sólido > v_líquido > v_gas). No se propaga en el vacío.\n\n• Óptica Geométrica:\n1. Ley de la Refracción (Ley de Willebrord Snell):\nn₁ · sen θ₁ = n₂ · sen θ₂\n(donde n = c / v es el índice de refracción del medio, siempre n ≥ 1).\n2. Ecuación de los Focos (René Descartes para espejos y lentes delgadas):\n1 / f = 1 / d_o + 1 / d_i\n(f distancia focal, d_o distancia objeto, d_i distancia imagen).\nAumento lateral: M = - d_i / d_o.",
                conceptosClave = listOf(
                    "Ecuación universal de onda: v = λ · f",
                    "El sonido viaja más rápido en sólidos que en líquidos y gases (v_acero > v_agua > v_aire)",
                    "Ley de Snell: n₁ sen θ₁ = n₂ sen θ₂",
                    "Ecuación de Descartes: 1/f = 1/d_o + 1/d_i"
                ),
                formulas = listOf(
                    "v = \\lambda \\cdot f, \\quad n = \\frac{c}{v}, \\quad n_1 \\text{ sen}(\\theta_1) = n_2 \\text{ sen}(\\theta_2)",
                    "\\frac{1}{f} = \\frac{1}{d_o} + \\frac{1}{d_i}, \\quad M = -\\frac{d_i}{d_o}"
                ),
                formulaName = "Ecuación de Ondas, Ley de Snell y Descartes",
                formulaLatex = "v = \\lambda f, \\quad n_1 \\text{ sen}(\\theta_1) = n_2 \\text{ sen}(\\theta_2), \\quad \\frac{1}{f} = \\frac{1}{d_o} + \\frac{1}{d_i}",
                formulaDescription = "Comportamiento ondulatorio, refracción en interfaces y formación de imágenes ópticas.",
                admissionTip = "Cuando una onda luminosa o sonora pasa de un medio a otro (refracción), la FRECUENCIA 'f' permanece constante e invariable; lo que cambian son su velocidad y su longitud de onda.",
                admissionExplanation = "• Un espejo cóncavo (f > 0) puede formar imágenes reales e invertidas o virtuales y derechas; un espejo convexo (f < 0) siempre forma imágenes virtuales, derechas y más pequeñas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t12_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una emisora de radio transmite una onda electromagnética en el aire con una frecuencia de 100 MHz (10⁸ Hz). Sabiendo que la rapidez de la luz es c = 3 × 10⁸ m/s, ¿cuál es su longitud de onda?",
                    options = listOf("0.3 m", "1.0 m", "3.0 m", "30 m", "300 m"),
                    correctIndex = 2,
                    explanation = "v = λ · f => λ = v / f = (3 × 10⁸ m/s) / (10⁸ Hz) = 3.0 m.",
                    subject = "Física",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "fis_t12_s04",
            subjectId = "fisica",
            semana = 12,
            subtema = "12.4 Física Moderna: Fotones, Efecto Fotoeléctrico y Relatividad",
            title = "Física Moderna: Efecto Fotoeléctrico y Relatividad",
            theory = LessonTheory(
                id = "theory_fis_t12_s04",
                asignatura = "Física",
                semana = 12,
                titulo = "Física Moderna: Efecto Fotoeléctrico y Relatividad",
                resumen = "• Teoría Cuántica de Max Planck (1900):\nLa radiación electromagnética se emite en paquetes discretos de energía llamados fotones o cuantos:\nE = h · f = (h · c) / λ   (h = 6.63 × 10⁻³⁴ J·s).\n\n• Efecto Fotoeléctrico (Albert Einstein, 1905 - Premio Nobel 1921):\nEmisión de electrones de una superficie metálica al incidir luz de frecuencia superior a la umbral (f₀):\nE_fotón = Función Trabajo (φ) + Energía Cinética Máxima (E_k_max)\nh · f = h · f₀ + (1/2) m v_max²\n- Aumentar la FRECUENCIA eleva la energía cinética de los fotoelectrones emitidos.\n- Aumentar la INTENSIDAD solo incrementa el número de electrones expulsados por segundo, pero no su energía.\n\n• Relatividad Especial (Einstein):\n1. Constancia universal de la rapidez de la luz en el vacío: c ≈ 3 × 10⁸ m/s para todo observador inercial.\n2. Equivalencia Masa-Energía: E = m · c².\n- Dilatación del tiempo (los relojes en movimiento avanzan más despacio) y contracción de la longitud.",
                conceptosClave = listOf(
                    "Energía del fotón de Planck: E = h · f",
                    "Ecuación fotoeléctrica de Einstein: h f = φ + E_k_max",
                    "La intensidad de luz aumenta la cantidad de electrones emitidos, no su energía cinética",
                    "Equivalencia masa-energía de la relatividad: E = m c²"
                ),
                formulas = listOf(
                    "E = h f = \\frac{h c}{\\lambda} \\quad (h = 6.63 \\times 10^{-34} \\text{ J}\\cdot\\text{s})",
                    "h f = \\phi + E_{k\\text{ máx}} \\quad (\\phi = h f_0)",
                    "E = m c^2 \\quad (c = 3 \\times 10^8 \\text{ m/s})"
                ),
                formulaName = "Ecuación Fotoeléctrica y Masa-Energía",
                formulaLatex = "h f = \\phi + \\frac{1}{2} m v_{\\text{máx}}^2, \\quad E = m c^2",
                formulaDescription = "Cuantización del fotón en interacciones fotoeléctricas y equivalencia relativista.",
                admissionTip = "La función trabajo (φ = h · f₀) es la energía mínima necesaria para arrancar un electrón del metal y depende exclusivamente del material metálico utilizado.",
                admissionExplanation = "• Si la frecuencia de la luz incidente es menor que la frecuencia umbral (f < f₀), NO se produce emisión de electrones, sin importar cuán intensa sea la luz ni cuánto tiempo se ilumine."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fis_t12_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el efecto fotoeléctrico, sobre un metal con función trabajo φ = 2.5 eV inciden fotones de energía 4.0 eV. ¿Cuál es la energía cinética máxima de los fotoelectrones emitidos?",
                    options = listOf("0.5 eV", "1.5 eV", "2.5 eV", "4.0 eV", "6.5 eV"),
                    correctIndex = 1,
                    explanation = "E_fotón = φ + E_k_max => 4.0 eV = 2.5 eV + E_k_max => E_k_max = 4.0 - 2.5 = 1.5 eV.",
                    subject = "Física",
                    semana = 12
                )
            )
        )
    )
}
