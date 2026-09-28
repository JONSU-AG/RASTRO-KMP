package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object QuimicaPart2 {
    val lessons: List<LessonNode> = listOf(
        // ==========================================
        // SEMANA 9: REACCIONES QUÍMICAS Y BALANCE REDOX
        // ==========================================
        LessonNode(
            id = "qui_t09_s01",
            subjectId = "quimica",
            semana = 9,
            subtema = "9.1 Clasificación General de Reacciones Químicas",
            title = "Clasificación de Reacciones Químicas",
            theory = LessonTheory(
                id = "theory_qui_t09_s01",
                asignatura = "Química",
                semana = 9,
                titulo = "Clasificación de Reacciones Químicas",
                resumen = "Una reacción química es un proceso termodinámico en el cual una o más sustancias (reactivos) se transforman en nuevas sustancias (productos) mediante la ruptura y formación de enlaces.\n\n• Clasificación según el Mecanismo de Reacción:\n1. Síntesis, Adición o Combinación: Dos o más reactivos se unen para formar un solo producto: A + B -> AB (ej. 2 H₂ + O₂ -> 2 H₂O; N₂ + 3 H₂ -> 2 NH₃).\n2. Descomposición: Un solo reactivo se divide en dos o más sustancias más simples por aporte de energía: AB -> A + B (por calor: Pirólisis; por luz: Fotólisis; por electricidad: Electrólisis; ej. 2 KClO₃ -> 2 KCl + 3 O₂).\n3. Desplazamiento Simple o Sustitución: Un elemento más activo desplaza a otro en un compuesto: A + BC -> AC + B (ej. Zn + 2 HCl -> ZnCl₂ + H₂↑).\n4. Doble Desplazamiento o Metátesis: Intercambio mutuo de iones entre dos compuestos sin cambio en los estados de oxidación: AB + CD -> AD + CB (ej. neutralizaciones ácido-base y precipitaciones: AgNO₃ + NaCl -> AgCl↓ + NaNO₃).\n\n• Clasificación según la Variación de Entalpía (ΔH):\n- Exotérmica (ΔH < 0): Libera calor al entorno (combustión, neutralización).\n- Endotérmica (ΔH > 0): Absorbe calor del entorno (fotosíntesis, descomposición térmica).",
                conceptosClave = listOf(
                    "Síntesis (A + B -> AB), Descomposición (AB -> A + B)",
                    "Desplazamiento simple (A + BC -> AC + B) vs Doble desplazamiento / Metátesis (AB + CD -> AD + CB)",
                    "Reacción exotérmica (libera calor, ΔH < 0) vs endotérmica (absorbe calor, ΔH > 0)"
                ),
                formulas = listOf(
                    "\\text{Síntesis}: A + B \\to AB, \\quad \\text{Descomposición}: AB \\to A + B",
                    "\\text{Metátesis}: AB + CD \\to AD + CB, \\quad \\Delta H = H_{\\text{productos}} - H_{\\text{reactivos}}"
                ),
                formulaName = "Tipología de Reacciones Químicas",
                formulaLatex = "A + BC \\to AC + B \\; (\\text{simple}), \\quad AB + CD \\to AD + CB \\; (\\text{doble})",
                formulaDescription = "Modelos formales de reordenamiento de enlaces y átomos.",
                admissionTip = "Las reacciones de doble desplazamiento o metátesis (como AgNO₃ + NaCl -> AgCl + NaNO₃) NUNCA son reacciones redox: ningún elemento cambia de estado de oxidación.",
                admissionExplanation = "• En un desplazamiento simple, un metal solo puede desplazar al hidrógeno o a otro metal si está por encima de él en la 'Serie de Actividad Química'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La reacción química representada por la ecuación: CaCO₃(s) + calor -> CaO(s) + CO₂(g) corresponde por su mecanismo a una reacción de:",
                    options = listOf("Síntesis o adición", "Descomposición térmica (pirólisis)", "Desplazamiento simple", "Doble sustitución", "Combustión completa"),
                    correctIndex = 1,
                    explanation = "Un único reactivo (carbonato de calcio) se fragmenta por acción del calor en dos productos más simples (CaO y CO₂), lo cual define una reacción de descomposición térmica o pirólisis.",
                    subject = "Química",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "qui_t09_s02",
            subjectId = "qui_t09_s02",
            semana = 9,
            subtema = "9.2 Balance de Ecuaciones por el Método de Tanteo o Simple Inspección",
            title = "Balanceo por Tanteo (Inspección Simple)",
            theory = LessonTheory(
                id = "theory_qui_t09_s02",
                asignatura = "Química",
                semana = 9,
                titulo = "Balanceo por Tanteo (Inspección Simple)",
                resumen = "El balanceo de ecuaciones químicas es la aplicación directa de la Ley de Conservación de la Masa de Lavoisier: el número de átomos de cada elemento debe ser exactamente igual en los reactivos y en los productos.\n\n• Regla de Secuencia Recomendada para el Tanteo:\n1.° Balancear METALES.\n2.° Balancear NO METALES (distintos de H y O, como C, N, S, P, Cl).\n3.° Balancear HIDRÓGENOS (H).\n4.° Balancear OXÍGENOS (O) [sirve de verificación y autocontrol final].\n(Regla mnemotécnica: 'Me - No - H - O' -> Metal, No metal, Hidrógeno, Oxígeno).\n\n• Reglas Clave:\n- Los subíndices de las fórmulas químicas NUNCA se alteran (cambiaría la identidad de la sustancia).\n- Solo se pueden modificar los COEFICIENTES ESTEQUIOMÉTRICOS enteros colocados delante de cada fórmula.",
                conceptosClave = listOf(
                    "Conservación de la masa: átomos en reactivos = átomos en productos",
                    "Orden recomendado de balanceo: 1° Metal -> 2° No metal -> 3° Hidrógeno -> 4° Oxígeno",
                    "Solo se modifican los coeficientes estequiométricos enteros, jamás los subíndices atómicos"
                ),
                formulas = listOf(
                    "\\sum \\text{Átomos de reactivos} = \\sum \\text{Átomos de productos} \\quad (\\text{Lavoisier})",
                    "\\text{Secuencia}: \\; \\text{Metal} \\to \\text{No Metal} \\to \\text{Hidrógeno (H)} \\to \\text{Oxígeno (O)}"
                ),
                formulaName = "Ley de Conservación de la Masa y Balanceo",
                formulaLatex = "a A + b B \\to c C + d D \\quad (\\sum m_{\\text{reactivos}} = \\sum m_{\\text{productos}})",
                formulaDescription = "Igualación estequiométrica del número de núcleos atómicos en ambos miembros.",
                admissionTip = "Al balancear una reacción de combustión de hidrocarburos C_xH_y + O₂ -> CO₂ + H₂O: balancea primero el Carbono, luego el Hidrógeno dividiendo su subíndice entre 2 para el agua, y finalmente ajusta el Oxígeno.",
                admissionExplanation = "• Si al balancear un coeficiente del O₂ resulta una fracción (ej. 13/2 O₂), multiplica TODA la ecuación por 2 para obtener coeficientes enteros mínimos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al balancear por tanteo la siguiente ecuación química: C₃H₈ + O₂ -> CO₂ + H₂O, ¿cuál es el coeficiente estequiométrico del oxígeno (O₂)?",
                    options = listOf("3", "4", "5", "7", "10"),
                    correctIndex = 2,
                    explanation = "1 C₃H₈: hay 3 C -> ponemos 3 CO₂. Hay 8 H -> ponemos 4 H₂O.\nOxígenos a la derecha: 3(2) + 4(1) = 6 + 4 = 10 átomos de O.\nPor tanto, se necesitan 10/2 = 5 moléculas de O₂: C₃H₈ + 5 O₂ -> 3 CO₂ + 4 H₂O.",
                    subject = "Química",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "qui_t09_s03",
            subjectId = "qui_t09_s03",
            semana = 9,
            subtema = "9.3 Reacciones Redox: Oxidación, Reducción, Agente Oxidante y Reductor",
            title = "Reacciones de Óxido-Reducción (Redox)",
            theory = LessonTheory(
                id = "theory_qui_t09_s03",
                asignatura = "Química",
                semana = 9,
                titulo = "Reacciones de Óxido-Reducción (Redox)",
                resumen = "Las reacciones redox implican la transferencia de electrones entre reactivos, modificando los estados de oxidación (E.O.):\n\n• Conceptos Fundamentales Opuestos:\n1. Oxidación:\n- Pérdida de electrones (e⁻).\n- El estado de oxidación AUMENTA algebraicamente hacia la derecha en la recta numérica (ej. Fe⁺² -> Fe⁺³ + 1e⁻; 2 Cl⁻¹ -> Cl₂⁰ + 2e⁻).\n- La sustancia que se oxida actúa como AGENTE REDUCTOR (porque reduce a la otra sustancia).\n- El producto formado tras la oxidación es la FORMA OXIDADA.\n\n2. Reducción:\n- Ganancia de electrones (e⁻).\n- El estado de oxidación DISMINUYE algebraicamente hacia la izquierda en la recta numérica (ej. Cu⁺² + 2e⁻ -> Cu⁰; Mn⁺⁷ + 5e⁻ -> Mn⁺²).\n- La sustancia que se reduce actúa como AGENTE OXIDANTE (porque oxida a la otra sustancia).\n- El producto formado tras la reducción es la FORMA REDUCIDA.\n\n• Principio de Conservación Electrónica:\nNúmero de electrones cedidos por el agente reductor = Número de electrones ganados por el agente oxidante.",
                conceptosClave = listOf(
                    "Oxidación: pierde electrones, su E.O. aumenta (actúa como AGENTE REDUCTOR)",
                    "Reducción: gana electrones, su E.O. disminuye (actúa como AGENTE OXIDANTE)",
                    "Forma oxidada (producto de la oxidación) vs Forma reducida (producto de la reducción)",
                    "Electrones transferidos totales: e⁻ perdidos = e⁻ ganados"
                ),
                formulas = listOf(
                    "\\text{Oxidación}: A \\to A^{n+} + n e^- \\quad (\\text{A es el Agente Reductor})",
                    "\\text{Reducción}: B^{m+} + m e^- \\to B \\quad (B^{m+} \\text{ es el Agente Oxidante})"
                ),
                formulaName = "Definición Formal de Procesos Redox",
                formulaLatex = "\\text{Oxidación (pierde } e^-) \\iff \\text{Reducción (gana } e^-)",
                formulaDescription = "Transferencia intermolecular coordinada de electrones de valencia.",
                admissionTip = "Regla de oro para no confundirse jamás en el examen:\n- El que SE OXIDA es el AGENTE REDUCTOR.\n- El que SE REDUCE es el AGENTE OXIDANTE.",
                admissionExplanation = "• En la reacción Zn + CuSO₄ -> ZnSO₄ + Cu: El Zn pasa de 0 a +2 (se oxida, es el agente reductor); el Cu pasa de +2 a 0 (se reduce, el CuSO₄ es el agente oxidante)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la reacción redox: Zn⁰ + 2 HCl⁺¹ -> Zn⁺²Cl₂ + H₂⁰, la sustancia que actúa como 'agente reductor' es:",
                    options = listOf("HCl", "Zn", "ZnCl₂", "H₂", "Cl₂"),
                    correctIndex = 1,
                    explanation = "El zinc metálico (Zn) pasa de E.O. 0 a +2, perdiendo 2 electrones (se oxida). Por lo tanto, el Zn actúa como el agente reductor de la reacción.",
                    subject = "Química",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "qui_t09_s04",
            subjectId = "qui_t09_s04",
            semana = 9,
            subtema = "9.4 Método de Balanceo Redox por Estados de Oxidación",
            title = "Método del Estado de Oxidación (Balance Redox)",
            theory = LessonTheory(
                id = "theory_qui_t09_s04",
                asignatura = "Química",
                semana = 9,
                titulo = "Método del Estado de Oxidación (Balance Redox)",
                resumen = "Algoritmo sistemático para balancear ecuaciones redox complejas:\n\n1. Asignar el estado de oxidación (E.O.) a todos los átomos de la ecuación.\n2. Identificar qué elemento se oxida y qué elemento se reduce.\n3. Escribir las dos semirreacciones y balancear los átomos que cambian de E.O. (balance de masa en la semirreacción).\n4. Calcular el número de electrones transferidos en cada semirreacción.\n5. Multiplicar las semirreacciones por números enteros cruzados (mínimo común múltiplo) para igualar los electrones ganados con los electrones perdidos.\n6. Sumar miembro a miembro y transferir los coeficientes calculados a la ecuación general.\n7. Culminar el balanceo de los elementos que no cambiaron de E.O. por el método de tanteo final (metales, no metales, H y verificación con O).\n\n• Reacciones de Desproporción o Dismutación:\nOcurre cuando el MISMO elemento químico actúa simultáneamente como agente oxidante y agente reductor (se oxida y se reduce a la vez, ej. Cl₂ + NaOH -> NaCl + NaClO + H₂O).",
                conceptosClave = listOf(
                    "Algoritmo de balance redox: igualar electrones perdidos y ganados por factores cruzados",
                    "Transferencia de coeficientes a la ecuación principal y tanteo final de H y O",
                    "Dismutación o desproporción: el mismo reactivo se oxida y se reduce simultáneamente"
                ),
                formulas = listOf(
                    "\\#e^-_{\\text{ganados}} = \\#e^-_{\\text{perdidos}} = \\text{M.C.M.}",
                    "\\text{Dismutación}: \\; \\text{Cl}_2^0 \\to \\text{Cl}^{-1} + \\text{Cl}^{+1}"
                ),
                formulaName = "Método de Transferencia Electrónica Redox",
                formulaLatex = "n_1 (\\text{Semirreacción Ox.}) + n_2 (\\text{Semirreacción Red.}) \\to \\text{Balance Total}",
                formulaDescription = "Eliminación del flujo neto de carga eléctrica en sistemas químicos cerrados.",
                admissionTip = "Si en una semirreacción aparece una molécula diatómica como Cl₂ o Cr₂O₇²⁻, ¡recuerda balancear primero el número de átomos antes de calcular los electrones! (Cr₂⁺⁶ + 6e⁻ -> 2 Cr⁺³).",
                admissionExplanation = "• El método ion-electrón se reserva principalmente para soluciones acuosas ácidas (añadiendo H⁺ y H₂O) o básicas (añadiendo OH⁻ y H₂O)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t09_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una reacción química en la que un mismo elemento se oxida y se reduce simultáneamente (como en la descomposición del peróxido de hidrógeno: 2 H₂O₂ -> 2 H₂O + O₂), el fenómeno se conoce específicamente como:",
                    options = listOf("Neutralización", "Dismutación o desproporción", "Electrólisis", "Precipitación", "Sustitución simple"),
                    correctIndex = 1,
                    explanation = "La dismutación o desproporción es la reacción redox en la que una misma especie química experimenta simultáneamente oxidación y reducción.",
                    subject = "Química",
                    semana = 9
                )
            )
        ),

        // ==========================================
        // SEMANA 10: ESTEQUIOMETRÍA Y CÁLCULOS QUÍMICOS
        // ==========================================
        LessonNode(
            id = "qui_t10_s01",
            subjectId = "quimica",
            semana = 10,
            subtema = "10.1 Magnitudes Atómico-Moleculares: u.m.a., Mol y Masa Molar",
            title = "Unidades Químicas de Masa (Mol y Masa Molar)",
            theory = LessonTheory(
                id = "theory_qui_t10_s01",
                asignatura = "Química",
                semana = 10,
                titulo = "Unidades Químicas de Masa (Mol y Masa Molar)",
                resumen = "• Unidad de Masa Atómica (u o u.m.a.):\nDefinida exactamente como la doceava parte (1/12) de la masa de un átomo neutro de Carbono-12 (¹²₆C):\n1 u ≈ 1.66 × 10⁻²⁴ g.\nMasas atómicas notables de examen: H = 1 u; C = 12 u; N = 14 u; O = 16 u; Na = 23 u; S = 32 u; Cl = 35.5 u; Ca = 40 u; Fe = 56 u.\n\n• Mol (Cantidad de Sustancia del SI):\nCantidad de materia que contiene exactamente tantas entidades elementales (átomos, moléculas, iones) como átomos hay en 12 g de Carbono-12:\n1 mol = 6.022 × 10²³ partículas (Número de Avogadro N_A).\n\n• Masa Molar (M̄ en g/mol):\nMasa en gramos de un mol de sustancia, numéricamente igual a su peso atómico o masa molecular en u:\n- Para H₂O: M̄ = 2(1) + 16 = 18 g/mol.\n- Para H₂SO₄: M̄ = 2(1) + 32 + 4(16) = 98 g/mol.\n- Para CaCO₃: M̄ = 40 + 12 + 3(16) = 100 g/mol.\n\n• Número de Moles (n):\nn = masa (g) / Masa Molar (M̄) = #partículas / N_A.",
                conceptosClave = listOf(
                    "1 u.m.a. = 1/12 de la masa del átomo de Carbono-12",
                    "1 mol = 6.022 × 10²³ entidades elementales (Número de Avogadro N_A)",
                    "Masa molar M̄: masa en gramos de 1 mol de partículas (H₂O = 18 g/mol; CaCO₃ = 100 g/mol)",
                    "Fórmula universal: n = m / M̄ = #moléculas / N_A"
                ),
                formulas = listOf(
                    "n = \\frac{m}{\\bar{M}} = \\frac{\\#\\text{partículas}}{N_A}, \\quad N_A = 6.022 \\times 10^{23} \\text{ mol}^{-1}",
                    "\\bar{M}_{\\text{CaCO}_3} = 100 \\text{ g/mol}, \\quad \\bar{M}_{\\text{H}_2\\text{O}} = 18 \\text{ g/mol}"
                ),
                formulaName = "Relaciones Fundamentales del Mol",
                formulaLatex = "n = \\frac{m}{\\bar{M}} = \\frac{N}{N_A}",
                formulaDescription = "Conversión cuantitativa entre masa macroscópica y número microscópico de entidades.",
                admissionTip = "Aprende de memoria estas tres masas molares típicas de examen: H₂O = 18 g/mol, CO₂ = 44 g/mol, H₂SO₄ = 98 g/mol y CaCO₃ = 100 g/mol. ¡Te ahorrarán valiosos minutos!",
                admissionExplanation = "• En 1 mol de H₂O hay 6.022 × 10²³ moléculas de agua, que contienen 2 moles de átomos de H (1.2 × 10²⁴ átomos de H) y 1 mol de átomos de O."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántos moles de agua (H₂O) están contenidos en una muestra de 90 gramos de agua pura? (Masas atómicas: H = 1; O = 16).",
                    options = listOf("2.5 mol", "3.0 mol", "4.5 mol", "5.0 mol", "10.0 mol"),
                    correctIndex = 3,
                    explanation = "Masa molar del H₂O: M̄ = 2(1) + 16 = 18 g/mol.\nNúmero de moles: n = m / M̄ = 90 g / (18 g/mol) = 5.0 mol.",
                    subject = "Química",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "qui_t10_s02",
            subjectId = "qui_t10_s02",
            semana = 10,
            subtema = "10.2 Leyes Ponderales: Lavoisier, Proust, Dalton y Richter",
            title = "Leyes Ponderales de la Química",
            theory = LessonTheory(
                id = "theory_qui_t10_s02",
                asignatura = "Química",
                semana = 10,
                titulo = "Leyes Ponderales de la Química",
                resumen = "Las leyes ponderales rigen las proporciones fijas en masa con las que se combinan las sustancias:\n\n1. Ley de Conservación de la Masa (Antoine Lavoisier, 1789):\nEn toda reacción química ordinaria, la masa total de los reactivos es exactamente igual a la masa total de los productos: Σ m_reactivos = Σ m_productos ('La materia no se crea ni se destruye, solo se transforma').\n\n2. Ley de las Proporciones Definidas o Constantes (Joseph Proust, 1799):\nCuando dos o más elementos se combinan para formar un compuesto determinado, lo hacen siempre en una relación de masas fija, constante e invariable.\n- En el agua pura (H₂O): la relación de masa H : O es siempre 2 g : 16 g = 1 g de H por cada 8 g de O (1 : 8). Cualquier exceso de un reactivo no reacciona y sobra.\n\n3. Ley de las Proporciones Múltiples (John Dalton, 1803):\nSi dos elementos forman más de un compuesto, las masas de uno de ellos que se combinan con una masa fija del otro están en relación de números enteros sencillos (ej. CO y CO₂: 12 g C con 16 g y 32 g de O -> relación 1 : 2).\n\n4. Ley de Volúmenes de Combinación (Joseph Louis Gay-Lussac, 1808):\nA presión y temperatura constantes, los volúmenes de los gases que reaccionan y se producen están en una relación de números enteros sencillos idéntica a sus coeficientes estequiométricos.",
                conceptosClave = listOf(
                    "Lavoisier: masa de reactivos = masa de productos",
                    "Proust: relación fija e invariable de masas en un compuesto (H : O = 1 : 8 en H₂O)",
                    "Dalton: proporciones múltiples de números enteros sencillos (CO vs CO₂)",
                    "Gay-Lussac: relación volumétrica de gases proporcional a coeficientes estequiométricos"
                ),
                formulas = listOf(
                    "\\sum m_{\\text{reactivos}} = \\sum m_{\\text{productos}} \\quad (\\text{Lavoisier})",
                    "\\frac{m_A}{m_B} = \\text{constante} \\quad (\\text{Proust})"
                ),
                formulaName = "Leyes Gravimétricas Fundamentales",
                formulaLatex = "\\sum m_R = \\sum m_P, \\quad \\frac{m_A}{m_B} = k",
                formulaDescription = "Bases estequiométricas empíricas de las combinaciones moleculares ponderales.",
                admissionTip = "Si 1 g de H reacciona con 8 g de O para dar 9 g de H₂O: si te dan 5 g de H y 32 g de O, solo reaccionan 4 g de H con los 32 g de O (relación 1:8) produciendo 36 g de agua, y sobra 1 g de H.",
                admissionExplanation = "• Las leyes ponderales permitieron a John Dalton formular la primera teoría atómica científica de la historia basada en átomos discretos de masas características."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La ley que establece que 'cuando dos elementos se combinan para formar un compuesto determinado, lo hacen siempre en una relación de masas fija, constante e invariable' fue postulada por:",
                    options = listOf("Antoine Lavoisier", "Joseph Proust", "John Dalton", "Amedeo Avogadro", "Jöns Jacob Berzelius"),
                    correctIndex = 1,
                    explanation = "Joseph Louis Proust enunció en 1799 la Ley de las Proporciones Definidas o Constantes.",
                    subject = "Química",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "qui_t10_s03",
            subjectId = "qui_t10_s03",
            semana = 10,
            subtema = "10.3 Reactivo Limitante, Reactivo en Exceso y Porcentaje de Rendimiento",
            title = "Reactivo Limitante y Rendimiento",
            theory = LessonTheory(
                id = "theory_qui_t10_s03",
                asignatura = "Química",
                semana = 10,
                titulo = "Reactivo Limitante y Rendimiento",
                resumen = "En las reacciones reales los reactivos rara vez se mezclan en proporciones estequiométricas exactas:\n\n• Reactivo Limitante (R.L.):\nEs el reactivo que se consume TOTALMENTE primero en la reacción. Determina y LIMITA la cantidad máxima de productos que pueden formarse.\n\n• Reactivo en Exceso (R.E.):\nEs el reactivo que sobra o no se consume por completo una vez que el reactivo limitante se agota.\n\n• Regla Práctica para Identificar el R.L.:\nPara cada reactivo, divide las moles dadas en el problema entre su respectivo coeficiente estequiométrico en la ecuación balanceada:\nCociente = Moles dadas / Coeficiente estequiométrico\n- El reactivo que tenga el MENOR cociente es el REACTIVO LIMITANTE (todos los cálculos posteriores se realizan obligatoriamente con él).\n\n• Porcentaje de Rendimiento (%R):\n% Rendimiento = (Rendimiento Real / Rendimiento Teórico) × 100%\n- Rendimiento Teórico: Cantidad máxima calculada por estequiometría asumiendo reacción al 100%.\n- Rendimiento Real: Cantidad real de producto obtenida en la práctica en el laboratorio (siempre menor o igual al teórico debido a impurezas, pérdidas mecánicas o reacciones secundarias).",
                conceptosClave = listOf(
                    "Reactivo limitante: se consume totalmente y rige la cantidad de producto formado",
                    "Regla del cociente: menor valor de (moles / coeficiente) identifica al R.L.",
                    "Reactivo en exceso: permanece sobrante al culminar la reacción",
                    "Rendimiento porcentual: %R = (Masa real / Masa teórica) × 100%"
                ),
                formulas = listOf(
                    "\\text{Cociente} = \\frac{n_{\\text{dato}}}{\\text{coeficiente estequiométrico}} \\implies \\text{Menor cociente} = \\text{R.L.}",
                    "\\%\\text{Rendimiento} = \\frac{\\text{Cantidad Real}}{\\text{Cantidad Teórica}} \\times 100\\%"
                ),
                formulaName = "Reactivo Limitante y Eficiencia de Reacción",
                formulaLatex = "\\%R = \\frac{m_{\\text{real}}}{m_{\\text{teórica}}} \\times 100\\%, \\quad \\text{R.L.} = \\min\\left(\\frac{n_i}{c_i}\\right)",
                formulaDescription = "Restricciones estequiométricas reales en procesos químicos industriales.",
                admissionTip = "¡Atención! Nunca hagas los cálculos con el reactivo en exceso; una vez identificado el Reactivo Limitante, tacha el reactivo en exceso y calcula todo con el R.L.",
                admissionExplanation = "• Si una reacción química tiene un rendimiento del 80%, la masa real obtenida será el 80% de lo que predijo la estequiometría teórica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t10_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para la reacción: 2 H₂ + O₂ -> 2 H₂O, se mezclan 6 moles de H₂ con 4 moles de O₂. ¿Cuál es el reactivo limitante y cuántas moles de agua se forman como máximo?",
                    options = listOf(
                        "R.L. es O₂; se forman 4 moles de H₂O",
                        "R.L. es H₂; se forman 6 moles de H₂O",
                        "R.L. es O₂; se forman 8 moles de H₂O",
                        "R.L. es H₂; se forman 3 moles de H₂O",
                        "Ambos reactivos se consumen por completo"
                    ),
                    correctIndex = 1,
                    explanation = "Cociente H₂: 6 / 2 = 3. Cociente O₂: 4 / 1 = 4.\nEl menor cociente es 3 (H₂), por lo que el reactivo limitante es el H₂.\nPor estequiometría: 2 mol H₂ producen 2 mol H₂O => 6 mol H₂ producen 6 mol H₂O.",
                    subject = "Química",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "qui_t10_s04",
            subjectId = "qui_t10_s04",
            semana = 10,
            subtema = "10.4 Volumen Molar a Condiciones Normales y Cálculos Masa-Volumen",
            title = "Volumen Molar a Condiciones Normales (C.N.)",
            theory = LessonTheory(
                id = "theory_qui_t10_s04",
                asignatura = "Química",
                semana = 10,
                titulo = "Volumen Molar a Condiciones Normales (C.N.)",
                resumen = "• Condiciones Normales (C.N. o T.P.N.):\nCorresponden a los estándares clásicos de gases:\n- Temperatura: T = 0 °C = 273.15 K.\n- Presión: P = 1 atm = 760 mmHg = 101.3 kPa.\n\n• Hipótesis y Volumen Molar de Avogadro:\nUn mol de CUALQUIER gas ideal a Condiciones Normales ocupa un volumen constante e invariable de exactamente:\nV_molar = 22.4 litros / mol   (22.4 L/mol)\n\n• Fórmula de Conversión a C.N.:\nV_gas(C.N.) = n · 22.4 L = (m / M̄) · 22.4 L\n\n• Densidad de un Gas a C.N.:\nρ_gas(C.N.) = Masa Molar (M̄) / 22.4 L/mol   (g/L)\n- Para el aire (M̄_aire ≈ 28.9 g/mol): ρ_aire ≈ 1.29 g/L.\n- Un gas es más denso que el aire si su masa molar M̄ > 28.9 g/mol (ej. CO₂ con 44 g/mol baja al suelo); es más liviano si M̄ < 28.9 g/mol (ej. He con 4 g/mol o CH₄ con 16 g/mol suben a la atmósfera).",
                conceptosClave = listOf(
                    "Condiciones Normales (C.N.): T = 0 °C (273 K) y P = 1 atm (760 mmHg)",
                    "Volumen molar de cualquier gas ideal a C.N.: 22.4 L / mol",
                    "Fórmula de volumen a C.N.: V = n · 22.4 L",
                    "Densidad a C.N.: ρ = M̄ / 22.4 L (g/L)"
                ),
                formulas = listOf(
                    "V_{\\text{C.N.}} = n \\times 22.4 \\text{ L/mol} = \\frac{m}{\\bar{M}} \\times 22.4 \\text{ L}",
                    "\\rho_{\\text{gas (C.N.)}} = \\frac{\\bar{M}}{22.4 \\text{ L/mol}}"
                ),
                formulaName = "Ley del Volumen Molar de Avogadro",
                formulaLatex = "V_{\\text{molar (C.N.)}} = 22.4 \\text{ L/mol}, \\quad n = \\frac{V}{22.4}",
                formulaDescription = "Volumen estándar ocupado por un mol de gas ideal a 0 °C y 1 atm.",
                admissionTip = "El factor 22.4 L solo se puede utilizar si el enunciado indica explícitamente 'a Condiciones Normales (C.N.)' y la sustancia es un GAS (¡nunca lo uses para agua líquida ni sólidos!).",
                admissionExplanation = "• 44 gramos de CO₂ (1 mol) a C.N. ocupan 22.4 L; 32 gramos de O₂ (1 mol) a C.N. también ocupan exactamente 22.4 L."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t10_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué volumen en litros ocupan 3.2 gramos de gas oxígeno (O₂) medidos a Condiciones Normales de presión y temperatura? (Masa molar del O₂ = 32 g/mol).",
                    options = listOf("1.12 L", "2.24 L", "4.48 L", "11.2 L", "22.4 L"),
                    correctIndex = 1,
                    explanation = "n = m / M̄ = 3.2 g / (32 g/mol) = 0.1 mol de O₂.\nVolumen a C.N.: V = n · 22.4 L/mol = (0.1 mol) · (22.4 L/mol) = 2.24 litros.",
                    subject = "Química",
                    semana = 10
                )
            )
        ),

        // ==========================================
        // SEMANA 11: ESTADO GASEOSO Y LEYES DE GASES
        // ==========================================
        LessonNode(
            id = "qui_t11_s01",
            subjectId = "qui_t11_s01",
            semana = 11,
            subtema = "11.1 Teoría Cinético-Molecular y Variables de Estado",
            title = "Teoría Cinético-Molecular de los Gases",
            theory = LessonTheory(
                id = "theory_qui_t11_s01",
                asignatura = "Química",
                semana = 11,
                titulo = "Teoría Cinético-Molecular de los Gases",
                resumen = "• Postulados del Gas Ideal (Clausius, Maxwell, Boltzmann):\n1. Los gases están formados por partículas diminutas (moléculas o átomos) muy separadas entre sí. El volumen de las moléculas individuales es despreciable frente al volumen total del recipiente (volumen propio ≈ 0).\n2. Las moléculas se mueven en línea recta, de forma caótica y al azar en todas direcciones.\n3. Las fuerzas de atracción o repulsión intermolecular son prácticamente nulas (F_intermolecular ≈ 0).\n4. Los choques entre moléculas y contra las paredes del recipiente son perfectamente elásticos (no hay pérdida de energía cinética en la colisión).\n5. La energía cinética media de las moléculas es directamente proporcional a la TEMPERATURA ABSOLUTA (E_k ∝ T en Kelvin).\n\n• Comportamiento Ideal vs Real:\nUn gas real se comporta aproximadamente como un gas ideal a BAJAS PRESIONES y ALTAS TEMPERATURAS (las moléculas están muy separadas y se mueven rápidamente, minimizando interacciones mutuas).",
                conceptosClave = listOf(
                    "Volumen de moléculas despreciable e inexistencia de fuerzas intermoleculares en el gas ideal",
                    "Choques perfectamente elásticos (conservación de energía cinética)",
                    "Energía cinética media proporcional a la temperatura absoluta (T en Kelvin)",
                    "Condiciones para aproximarse a gas ideal: BAJA presión y ALTA temperatura"
                ),
                formulas = listOf(
                    "\\bar{E}_k = \\frac{3}{2} k_B T \\quad (k_B = \\text{Constante de Boltzmann})",
                    "\\text{Gas Real} \\to \\text{Gas Ideal a: } \\; P \\downarrow \\text{ (Baja)} \\; \\text{y} \\; T \\uparrow \\text{ (Alta)}"
                ),
                formulaName = "Postulados de la Teoría Cinética",
                formulaLatex = "\\bar{E}_k \\propto T(\\text{K}), \\quad P \\to 0, \\; T \\to \\infty \\implies \\text{Comportamiento Ideal}",
                formulaDescription = "Modelo microscópico estadístico de partículas puntuales elásticas sin cohesión.",
                admissionTip = "¡Pregunta clásica de admisión en la UNSA! ¿Cuándo un gas real se desvía más de la idealidad? A ALTAS presiones y BAJAS temperaturas (donde las moléculas se juntan y surgen fuerzas intermoleculares).",
                admissionExplanation = "• La presión de un gas surge del choque incesante de miles de millones de moléculas contra la superficie interna de las paredes del recipiente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un gas real se aproxima de mejor manera al comportamiento de un gas ideal cuando se encuentra sometido a condiciones de:",
                    options = listOf(
                        "Alta presión y baja temperatura",
                        "Alta presión y alta temperatura",
                        "Baja presión y alta temperatura",
                        "Baja presión y baja temperatura",
                        "Presión normal y cero absoluto"
                    ),
                    correctIndex = 2,
                    explanation = "A baja presión (moléculas muy separadas) y alta temperatura (alta energía cinética que vence atracciones), los gases reales minimizan sus fuerzas intermoleculares y se comportan como ideales.",
                    subject = "Química",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "qui_t11_s02",
            subjectId = "qui_t11_s02",
            semana = 11,
            subtema = "11.2 Leyes de los Gases Ideales: Boyle, Charles y Gay-Lussac",
            title = "Leyes Empíricas de los Gases Ideales",
            theory = LessonTheory(
                id = "theory_qui_t11_s02",
                asignatura = "Química",
                semana = 11,
                titulo = "Leyes Empíricas de los Gases Ideales",
                resumen = "Para una masa fija de gas confinado (moles n constantes):\n\n1. Ley de Robert Boyle y Edme Mariotte (Proceso Isotérmico, T = constante):\nA temperatura constante, la presión de un gas es inversamente proporcional a su volumen:\nP₁ · V₁ = P₂ · V₂  =>  P · V = constante\n(Si la presión se duplica, el volumen se reduce a la mitad. Gráfica P vs V: hipérbola equilátera o isoterma).\n\n2. Ley de Jacques Charles (Proceso Isobárico, P = constante):\nA presión constante, el volumen de un gas es directamente proporcional a su temperatura absoluta (en Kelvin):\nV₁ / T₁ = V₂ / T₂  =>  V / T = constante\n(Si la temperatura en Kelvin se duplica, el gas se expande al doble de volumen).\n\n3. Ley de Joseph Gay-Lussac (Proceso Isocórico o Isométrico, V = constante):\nA volumen constante, la presión de un gas es directamente proporcional a su temperatura absoluta:\nP₁ / T₁ = P₂ / T₂  =>  P / T = constante\n\n• Ecuación Combinada de los Gases:\n(P₁ · V₁) / T₁ = (P₂ · V₂) / T₂\n(¡La temperatura SIEMPRE debe estar en Kelvin: T = °C + 273!).",
                conceptosClave = listOf(
                    "Boyle (Isotérmico, T cte): P₁ V₁ = P₂ V₂ (inversamente proporcionales)",
                    "Charles (Isobárico, P cte): V₁ / T₁ = V₂ / T₂ (directamente proporcionales)",
                    "Gay-Lussac (Isocórico, V cte): P₁ / T₁ = P₂ / T₂",
                    "Ecuación combinada general: (P₁ V₁) / T₁ = (P₂ V₂) / T₂ (con T en Kelvin obligatorio)"
                ),
                formulas = listOf(
                    "P_1 V_1 = P_2 V_2 \\quad (T = \\text{cte, Boyle})",
                    "\\frac{V_1}{T_1} = \\frac{V_2}{T_2} \\quad (P = \\text{cte, Charles}), \\quad \\frac{P_1}{T_1} = \\frac{P_2}{T_2} \\quad (V = \\text{cte, Gay-Lussac})",
                    "\\frac{P_1 V_1}{T_1} = \\frac{P_2 V_2}{T_2} \\quad (\\text{Ecuación Combinada})"
                ),
                formulaName = "Ecuación Combinada de los Gases Ideales",
                formulaLatex = "\\frac{P_1 V_1}{T_1} = \\frac{P_2 V_2}{T_2} \\quad (T \\text{ en Kelvin})",
                formulaDescription = "Comportamiento cinemático de masa confinada de gas bajo cambios de P, V y T.",
                admissionTip = "¡El error más común en los exámenes es usar °C en lugar de Kelvin! Suma SIEMPRE 273 a la temperatura en grados Celsius antes de aplicar cualquier fórmula de gases.",
                admissionExplanation = "• Si calientas una olla a presión cerrada herméticamente (volumen constante), la presión del vapor interior se dispara por la Ley de Gay-Lussac (P ∝ T)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un gas confinado ocupa un volumen de 4 litros a una presión de 1.5 atm y temperatura constante. Si la presión se incrementa isotérmicamente a 3.0 atm, ¿cuál será el nuevo volumen del gas?",
                    options = listOf("1.0 L", "2.0 L", "3.0 L", "6.0 L", "8.0 L"),
                    correctIndex = 1,
                    explanation = "Por la Ley de Boyle (temperatura constante): P₁ · V₁ = P₂ · V₂ => (1.5 atm) · (4 L) = (3.0 atm) · V₂ => 6 = 3 V₂ => V₂ = 2.0 litros.",
                    subject = "Química",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "qui_t11_s03",
            subjectId = "qui_t11_s03",
            semana = 11,
            subtema = "11.3 Ecuación Universal de los Gases Ideales (P·V = n·R·T)",
            title = "Ecuación Universal de los Gases Ideales",
            theory = LessonTheory(
                id = "theory_qui_t11_s03",
                asignatura = "Química",
                semana = 11,
                titulo = "Ecuación Universal de los Gases Ideales",
                resumen = "La Ecuación de Estado de un Gas Ideal relaciona simultáneamente las cuatro variables de estado (Presión, Volumen, Temperatura y Moles):\nP · V = n · R · T\n(Regla mnemotécnica popular: 'Pavo = Ratón').\n\n• Constante Universal de los Gases Ideales (R):\n1. Si la presión P está en atmósferas (atm) y el volumen V en litros (L):\n   R = 0.082 atm·L / (mol·K)\n2. Si la presión P está en milímetros de mercurio (mmHg) o Torr:\n   R = 62.4 mmHg·L / (mol·K)\n3. En unidades del Sistema Internacional (P en Pascales y V en m³):\n   R = 8.314 J / (mol·K) = 8.314 kPa·L / (mol·K).\n\n• Formas Derivadas Fundamentales:\nComo n = m / M̄:\n- P · V = (m / M̄) · R · T\n- Masa Molar: M̄ = (m · R · T) / (P · V)\n- Densidad del Gas (ρ = m / V):\nP · M̄ = ρ · R · T  =>  ρ = (P · M̄) / (R · T)  (regla mnemotécnica: 'Puma = Ratón con Densidad').",
                conceptosClave = listOf(
                    "Ecuación Universal: P · V = n · R · T ('Pavo = Ratón')",
                    "Constante R: 0.082 atm·L/(mol·K) o 62.4 mmHg·L/(mol·K)",
                    "Ecuación con densidad del gas: P · M̄ = ρ · R · T ('Puma = Ratón')",
                    "La temperatura T debe estar obligatoriamente en escala Kelvin (K)"
                ),
                formulas = listOf(
                    "P \\cdot V = n \\cdot R \\cdot T, \\quad P \\cdot \\bar{M} = \\rho \\cdot R \\cdot T",
                    "R = 0.082 \\frac{\\text{atm}\\cdot\\text{L}}{\\text{mol}\\cdot\\text{K}} = 62.4 \\frac{\\text{mmHg}\\cdot\\text{L}}{\\text{mol}\\cdot\\text{K}}"
                ),
                formulaName = "Ecuación de Estado del Gas Ideal",
                formulaLatex = "P V = n R T, \\quad P \\bar{M} = \\rho R T",
                formulaDescription = "Relación unificada de variables termodinámicas de estado para sistemas gaseosos.",
                admissionTip = "Fíjate en las unidades de la presión en el enunciado: si te dan la presión en mmHg, usa R = 62.4 para no tener que convertir la presión a atmósferas.",
                admissionExplanation = "• La densidad de un gas aumenta al aumentar la presión o la masa molar, pero disminuye al aumentar la temperatura (el aire caliente es menos denso y asciende, permitiendo volar a los globos aerostáticos)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t11_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el volumen ocupado por 2 moles de un gas ideal sometido a una presión de 0.82 atm y a una temperatura de 127 °C? (R = 0.082 atm·L/mol·K).",
                    options = listOf("20 L", "40 L", "60 L", "80 L", "100 L"),
                    correctIndex = 3,
                    explanation = "T = 127 °C + 273 = 400 K.\nP · V = n · R · T => (0.82) · V = (2) · (0.082) · (400)\n0.82 V = 65.6 => V = 65.6 / 0.82 = 80 litros.",
                    subject = "Química",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "qui_t11_s04",
            subjectId = "qui_t11_s04",
            semana = 11,
            subtema = "11.4 Mezclas Gaseosas: Presiones Parciales de Dalton y Masa Molar Media",
            title = "Mezclas Gaseosas y Ley de Dalton",
            theory = LessonTheory(
                id = "theory_qui_t11_s04",
                asignatura = "Química",
                semana = 11,
                titulo = "Mezclas Gaseosas y Ley de Dalton",
                resumen = "Una mezcla gaseosa es una solución homogénea de varios gases que no reaccionan químicamente entre sí:\n\n• Fracción Molar de un Componente (x_i):\nRelación entre las moles de un componente 'i' y las moles totales de la mezcla:\nx_i = n_i / n_total\nPropiedad fundamental: La suma de todas las fracciones molares es igual a la unidad:\nΣ x_i = x₁ + x₂ + x₃ + ... = 1.\n\n• Ley de las Presiones Parciales de John Dalton (1801):\nLa presión total que ejerce una mezcla de gases es igual a la suma de las presiones parciales que cada gas ejercería si ocupase él solo todo el volumen del recipiente a la misma temperatura:\nP_total = P₁ + P₂ + P₃ + ...\n- Presión Parcial de un Gas (P_i):\nP_i = x_i · P_total = (n_i / n_total) · P_total\n\n• Masa Molar Aparente o Promedio de la Mezcla (M̄_mezcla):\nM̄_mezcla = x₁ · M̄₁ + x₂ · M̄₂ + x₃ · M̄₃ + ...\nEjemplo: Para el aire (≈ 80% N₂ con M̄ = 28 y 20% O₂ con M̄ = 32):\nM̄_aire ≈ 0.80(28) + 0.20(32) = 22.4 + 6.4 = 28.8 g/mol.",
                conceptosClave = listOf(
                    "Fracción molar: x_i = n_i / n_total (adimensional, suma Σ x_i = 1)",
                    "Ley de Dalton de presiones parciales: P_total = Σ P_i",
                    "Presión parcial proporcional a la fracción molar: P_i = x_i · P_total",
                    "Masa molar promedio de una mezcla: M̄_mezcla = Σ (x_i · M̄_i)"
                ),
                formulas = listOf(
                    "x_i = \\frac{n_i}{n_{\\text{total}}}, \\quad \\sum x_i = 1",
                    "P_i = x_i \\cdot P_{\\text{total}}, \\quad P_{\\text{total}} = P_1 + P_2 + P_3 + \\dots",
                    "\\bar{M}_{\\text{mezcla}} = x_1 \\bar{M}_1 + x_2 \\bar{M}_2 + \\dots"
                ),
                formulaName = "Ley de las Presiones Parciales de Dalton",
                formulaLatex = "P_i = x_i P_{\\text{total}}, \\quad P_{\\text{total}} = \\sum P_i",
                formulaDescription = "Comportamiento aditivo de las presiones parciales en mezclas multicomponentes.",
                admissionTip = "Para mezclas gaseosas, el porcentaje en volumen (%V), el porcentaje en moles (%n) y el porcentaje de presión parcial (%P) son exactamente IDÉNTICOS: %V = %n = %P.",
                admissionExplanation = "• Si el aire a 1 atm contiene aproximadamente 21% de O₂, la presión parcial del oxígeno es P_O₂ = 0.21 × 1 atm = 0.21 atm."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t11_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un recipiente cerrado se mezclan 3 moles de gas nitrógeno (N₂) y 1 mol de gas oxígeno (O₂) alcanzando una presión total de 8 atmósferas. ¿Cuál es la presión parcial del gas nitrógeno?",
                    options = listOf("2 atm", "4 atm", "5 atm", "6 atm", "8 atm"),
                    correctIndex = 3,
                    explanation = "Moles totales: n_total = 3 + 1 = 4 mol.\nFracción molar del N₂: x_N₂ = 3 / 4 = 0.75.\nPresión parcial del N₂: P_N₂ = x_N₂ · P_total = 0.75 · 8 atm = 6 atm.",
                    subject = "Química",
                    semana = 11
                )
            )
        ),

        // ==========================================
        // SEMANA 12: SOLUCIONES QUÍMICAS
        // ==========================================
        LessonNode(
            id = "qui_t12_s01",
            subjectId = "qui_t12_s01",
            semana = 12,
            subtema = "12.1 Componentes de una Solución y Curvas de Solubilidad",
            title = "Soluciones Químicas y Solubilidad",
            theory = LessonTheory(
                id = "theory_qui_t12_s01",
                asignatura = "Química",
                semana = 12,
                titulo = "Soluciones Químicas y Solubilidad",
                resumen = "Una solución es una mezcla homogénea monofásica formada por dos o más sustancias que no reaccionan entre sí:\nSolución = Soluto (St) + Solvente (Ste)\n- Soluto: Sustancia que se dispersa a nivel iónico o molecular; suele estar en menor proporción.\n- Solvente o Disolvente: Medio dispersante que disuelve al soluto; determina el estado físico de la solución (el solvente universal es el agua líquida H₂O).\n\n• Solubilidad (S):\nCantidad máxima de soluto que puede disolverse en 100 gramos de solvente a una temperatura determinada:\nS = (g de soluto máx) / (100 g de solvente)\n\n• Clasificación según la Concentración de Soluto:\n1. Solución Insaturada o Diluida: Contiene menos soluto que el límite de saturación.\n2. Solución Saturada: Contiene exactamente la máxima cantidad de soluto en equilibrio dinámico con soluto no disuelto.\n3. Solución Sobresaturada: Contiene más soluto del que puede disolver normalmente a esa temperatura (sistema inestable que precipita al perturbarlo).\n- Factores que Afectan la Solubilidad:\n* Sólidos en Líquidos: Generalmente la solubilidad aumenta con la TEMPERATURA.\n* Gases en Líquidos (Ley de William Henry): La solubilidad de un gas aumenta al elevar la PRESIÓN y al DISMINUIR la temperatura (por eso una gaseosa fría retiene más CO₂ gaseoso disuelto).",
                conceptosClave = listOf(
                    "Componentes: Soluto (menor proporción) + Solvente (medio dispersante, ej. agua)",
                    "Solubilidad S: gramos máximos de soluto disueltos en 100 g de agua",
                    "Solución Insaturada vs Saturada vs Sobresaturada (inestable con precipitación)",
                    "Ley de Henry: la solubilidad de un gas en líquido aumenta con la presión y baja con la temperatura"
                ),
                formulas = listOf(
                    "m_{\\text{solución}} = m_{\\text{soluto}} + m_{\\text{solvente}}",
                    "S = \\frac{m_{\\text{soluto máx}}}{100 \\text{ g H}_2\\text{O}} \\quad (\\text{a } T \\text{ constante})"
                ),
                formulaName = "Definición de Solubilidad",
                formulaLatex = "S = \\frac{m_{\\text{st (máx)}}}{100 \\text{ g Ste}}, \\quad m_{\\text{sol}} = m_{\\text{st}} + m_{\\text{ste}}",
                formulaDescription = "Límite termodinámico de disolución homogénea a temperatura constante.",
                admissionTip = "¡Principio de la Ley de Henry! Si destapas una botella de gaseosa caliente, el gas escapa violentamente porque a mayor temperatura el CO₂ es mucho menos soluble en el agua.",
                admissionExplanation = "• 'Lo semejante disuelve a lo semejante': solventes polares como el agua disuelven solutos polares o iónicos (sal, azúcar); solventes apolares como el benceno disuelven sustancias apolares (grasas, aceites)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t12_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La solubilidad de una sal a 20 °C es de 35 g de sal por cada 100 g de agua. Si se agregan 45 g de dicha sal en 100 g de agua a 20 °C con agitación constante, la cantidad de sal que queda en el fondo como precipitado no disuelto es:",
                    options = listOf("0 g", "5 g", "10 g", "35 g", "45 g"),
                    correctIndex = 2,
                    explanation = "A 20 °C solo pueden disolverse como máximo 35 g de sal en 100 g de agua. Al agregar 45 g, se disuelven 35 g y el exceso precipita: 45 g - 35 g = 10 g de precipitado.",
                    subject = "Química",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "qui_t12_s02",
            subjectId = "qui_t12_s02",
            semana = 12,
            subtema = "12.2 Unidades Físicas de Concentración: % m/m, % v/v, % m/v y ppm",
            title = "Unidades Físicas de Concentración",
            theory = LessonTheory(
                id = "theory_qui_t12_s02",
                asignatura = "Química",
                semana = 12,
                titulo = "Unidades Físicas de Concentración",
                resumen = "Expresan cuantitativamente la relación soluto/solución en unidades métricas de masa o volumen:\n\n1. Porcentaje en Masa o Peso (% m/m o % p/p):\n% m/m = (masa de soluto / masa de solución) × 100%\n(masa de solución = masa de soluto + masa de solvente).\n\n2. Porcentaje en Volumen (% v/v):\n% v/v = (volumen de soluto / volumen de solución) × 100%\n(Uso común: Grado alcohólico de bebidas. Un vino de 12° GL tiene 12% v/v de etanol: 12 mL de alcohol por cada 100 mL de vino).\n\n3. Porcentaje Masa-Volumen (% m/v):\n% m/v = (masa de soluto en gramos / volumen de solución en mL) × 100%\n(Uso médico común: suero fisiológico con 0.9% m/v de NaCl = 0.9 g de NaCl por cada 100 mL de solución acuosa).\n\n4. Partes por Millón (ppm):\nUsada para soluciones sumamente diluidas o contaminantes en agua:\nppm = (mg de soluto) / (kg de solución) ≈ (mg de soluto) / (Litro de solución acuosa).",
                conceptosClave = listOf(
                    "% m/m = (masa soluto / masa solución) × 100%",
                    "% v/v = (volumen soluto / volumen solución) × 100% (Grado Gay-Lussac °GL)",
                    "% m/v = (gramos de soluto / mL de solución) × 100%",
                    "ppm = miligramos de soluto por litro de solución (mg/L)"
                ),
                formulas = listOf(
                    "\\% m/m = \\frac{m_{\\text{soluto}}}{m_{\\text{solución}}} \\times 100\\%",
                    "\\% v/v = \\frac{V_{\\text{soluto}}}{V_{\\text{solución}}} \\times 100\\%, \\quad \\text{ppm} = \\frac{\\text{mg soluto}}{\\text{L solución}}"
                ),
                formulaName = "Unidades Físicas de Concentración",
                formulaLatex = "\\% m/m = \\frac{m_{\\text{st}}}{m_{\\text{sol}}} \\times 100, \\quad \\text{ppm} = \\frac{\\text{mg}}{\\text{L}}",
                formulaDescription = "Fracciones porcentuales y gravimétricas de soluto en sistemas dispersos.",
                admissionTip = "¡Cuidado en el denominador! La fórmula usa siempre MASA DE SOLUCIÓN (soluto + solvente). Si te dicen 'se disuelven 20 g de sal en 80 g de agua', la masa de solución es 20 + 80 = 100 g, resultando un 20% m/m.",
                admissionExplanation = "• El alcohol medicinal de 70° (70% v/v) es más efectivo como desinfectante y bactericida que el de 96° porque el agua facilita la penetración a través de la membrana bacteriana retardando la evaporación."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t12_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se disuelven 25 g de azúcar en 225 g de agua destilada. ¿Cuál es la concentración de la solución expresada en porcentaje en masa (% m/m)?",
                    options = listOf("5%", "10%", "11.1%", "20%", "25%"),
                    correctIndex = 1,
                    explanation = "m_solución = m_soluto + m_solvente = 25 g + 225 g = 250 g.\n% m/m = (25 g / 250 g) × 100% = (1 / 10) × 100% = 10%.",
                    subject = "Química",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "qui_t12_s03",
            subjectId = "qui_t12_s03",
            semana = 12,
            subtema = "12.3 Unidades Químicas: Molaridad (M), Normalidad (N) y Parámetro Teta (θ)",
            title = "Molaridad, Normalidad y Factor θ",
            theory = LessonTheory(
                id = "theory_qui_t12_s03",
                asignatura = "Química",
                semana = 12,
                titulo = "Molaridad, Normalidad y Factor θ",
                resumen = "Expresan la concentración en términos de moles y equivalentes-gramo:\n\n1. Molaridad (M):\nNúmero de moles de soluto disueltos en un litro de solución:\nM = n_soluto / V_solución (Litros) = m_soluto / (M̄ · V_L)   (mol/L o Molar).\n- Fórmula rápida práctica a partir de % m/m y densidad de solución (ρ_sol en g/mL):\nM = (10 · % m/m · ρ_sol) / M̄\n\n2. Normalidad (N):\nNúmero de equivalentes-gramo de soluto por litro de solución:\nN = #Eq-g / V_solución (L)\n\n• Relación Fundamental entre Normalidad y Molaridad:\nN = M · θ\n(Regla mnemotécnica: 'NeMo' -> N = M · θ).\n\n• Cálculo del Parámetro Teta (θ):\n- En Ácidos: θ = Número de hidrógenos ionizables (H⁺) [HCl -> θ = 1; H₂SO₄ -> θ = 2; H₃PO₄ -> θ = 3].\n- En Hidróxidos o Bases: θ = Número de iones oxidrilo (OH⁻) [NaOH -> θ = 1; Ca(OH)₂ -> θ = 2; Al(OH)₃ -> θ = 3].\n- En Sales: θ = Carga total del catión metálico [NaCl (Na⁺¹) -> θ = 1; CaSO₄ (Ca⁺²) -> θ = 2; Al₂(SO₄)₃ (2 Al⁺³) -> θ = 6].",
                conceptosClave = listOf(
                    "Molaridad: M = n / V_L = m / (M̄ · V_L) (en moles por litro)",
                    "Relación maestra: N = M · θ ('NeMo')",
                    "Parámetro θ: H⁺ en ácidos, OH⁻ en bases, carga del catión en sales",
                    "Fórmula de densidad: M = (10 · %m · ρ) / M̄"
                ),
                formulas = listOf(
                    "M = \\frac{n_{\\text{st}}}{V_{\\text{sol (L)}}} = \\frac{m_{\\text{st}}}{\\bar{M} \\cdot V_{\\text{L}}}",
                    "N = M \\cdot \\theta, \\quad M = \\frac{10 \\cdot (\\% m/m) \\cdot \\rho_{\\text{sol}}}{\\bar{M}}"
                ),
                formulaName = "Molaridad y Normalidad Química",
                formulaLatex = "M = \\frac{m}{\\bar{M} V_{\\text{L}}}, \\quad N = M \\cdot \\theta",
                formulaDescription = "Concentración molar y normal de solutos electrolíticos en disolución.",
                admissionTip = "Para el ácido sulfúrico H₂SO₄ (θ = 2), una solución 3 Molar (3 M) es automáticamente 6 Normal (N = 3 × 2 = 6 N) sin necesidad de recalcular nada.",
                admissionExplanation = "• El peso equivalente gramo de una sustancia se calcula como: P.Eq = M̄ / θ."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t12_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la molaridad de una solución que contiene 40 g de hidróxido de sodio (NaOH) disueltos en 500 mL de solución acuosa? (Masa molar del NaOH = 40 g/mol).",
                    options = listOf("0.5 M", "1.0 M", "2.0 M", "4.0 M", "8.0 M"),
                    correctIndex = 2,
                    explanation = "Moles de soluto: n = m / M̄ = 40 g / (40 g/mol) = 1 mol.\nVolumen en litros: V = 500 mL = 0.5 L.\nMolaridad: M = n / V = 1 mol / 0.5 L = 2.0 M.",
                    subject = "Química",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "qui_t12_s04",
            subjectId = "qui_t12_s04",
            semana = 12,
            subtema = "12.4 Dilución de Soluciones y Mezcla de Soluciones Comunes",
            title = "Dilución y Mezcla de Soluciones",
            theory = LessonTheory(
                id = "theory_qui_t12_s04",
                asignatura = "Química",
                semana = 12,
                titulo = "Dilución y Mezcla de Soluciones",
                resumen = "• Proceso de Dilución:\nConsiste en disminuir la concentración de una solución agregándole más solvente (agua). Como solo se añade agua, la cantidad de SOLUTO (en moles o masa) permanece estrictamente CONSTANTE:\nn_soluto_inicial = n_soluto_final\nC₁ · V₁ = C₂ · V₂\n(donde C puede ser Molaridad M o Normalidad N):\nM₁ · V₁ = M₂ · V₂\n(El volumen final es la suma: V₂ = V₁ + V_agua_añadida).\n\n• Mezcla de Soluciones del Mismo Soluto:\nAl mezclar dos soluciones A y B que contienen el mismo soluto a diferentes concentraciones:\nMoles totales = Moles de A + Moles de B\nC_final · V_final = C₁ · V₁ + C₂ · V₂\nM_final · V_final = M₁ · V₁ + M₂ · V₂\n(asumiendo volúmenes aditivos: V_final = V₁ + V₂).\nLa concentración final resultante es un promedio ponderado que siempre estará comprendida entre las concentraciones iniciales (M₁ < M_final < M₂).",
                conceptosClave = listOf(
                    "Dilución: adición de agua manteniendo constante la masa de soluto",
                    "Ecuación de dilución: C₁ · V₁ = C₂ · V₂ (M₁ V₁ = M₂ V₂)",
                    "Mezcla del mismo soluto: M_f · V_f = M₁ V₁ + M₂ V₂",
                    "La concentración de la mezcla final siempre es intermedia entre las iniciales"
                ),
                formulas = listOf(
                    "C_1 V_1 = C_2 V_2 \\quad (\\text{Dilución})",
                    "C_{\\text{final}} V_{\\text{total}} = C_1 V_1 + C_2 V_2 \\quad (\\text{Mezcla de soluciones})"
                ),
                formulaName = "Ecuación de Dilución y Mezcla",
                formulaLatex = "M_1 V_1 = M_2 V_2, \\quad M_f (V_1 + V_2) = M_1 V_1 + M_2 V_2",
                formulaDescription = "Conservación estequiométrica del soluto en procesos de adición de solvente y combinación.",
                admissionTip = "Si a un volumen V de solución se le triplica el volumen agregando agua hasta alcanzar 3V, la concentración se reduce a la TERCERA parte (C₂ = C₁ / 3).",
                admissionExplanation = "• Para neutralizar una solución ácida con una básica en una titulación se cumple la Ley de Equivalentes: N_ácido · V_ácido = N_base · V_base."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t12_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A 200 mL de una solución de HCl 6 M se le añade agua destilada hasta alcanzar un volumen final de 600 mL. ¿Cuál es la nueva molaridad de la solución diluida?",
                    options = listOf("1 M", "2 M", "3 M", "4 M", "5 M"),
                    correctIndex = 1,
                    explanation = "Aplicando la fórmula de dilución: M₁ · V₁ = M₂ · V₂\n(6 M) · (200 mL) = M₂ · (600 mL) => 1200 = 600 M₂ => M₂ = 1200 / 600 = 2 M.",
                    subject = "Química",
                    semana = 12
                )
            )
        ),

        // ==========================================
        // SEMANA 13: CINÉTICA Y EQUILIBRIO QUÍMICO
        // ==========================================
        LessonNode(
            id = "qui_t13_s01",
            subjectId = "qui_t13_s01",
            semana = 13,
            subtema = "13.1 Velocidad de Reacción, Teoría de Colisiones y Factores",
            title = "Cinética Química y Factores de Velocidad",
            theory = LessonTheory(
                id = "theory_qui_t13_s01",
                asignatura = "Química",
                semana = 13,
                titulo = "Cinética Química y Factores de Velocidad",
                resumen = "La cinética química estudia la rapidez de las reacciones químicas y los mecanismos moleculares por los cuales ocurren.\n\n• Teoría de las Colisiones Efectivas (Lewis):\nPara que una reacción química ocurra entre dos moléculas:\n1. Deben chocar con la ORIENTACIÓN geométrica espacial adecuada.\n2. Deben poseer una energía cinética igual o superior a la ENERGÍA DE ACTIVACIÓN (E_a).\n\n• Energía de Activación (E_a) y Complejo Activado:\nLa E_a es la barrera energética mínima indispensable para iniciar la reacción y formar el 'Complejo Activado' (estado de transición inestable de máxima energía potencial).\n\n• Factores que Aumentan la Rapidez de Reacción:\n1. Naturaleza de los Reactivos: Reacciones iónicas en solución son casi instantáneas; reacciones con enlaces covalentes son más lentas.\n2. Concentración de Reactivos: A mayor concentración, mayor número de moléculas por unidad de volumen y mayor frecuencia de choques.\n3. Temperatura: Al elevar la temperatura aumenta la energía cinética de las moléculas; una regla aproximada indica que por cada 10 °C de incremento, la velocidad se duplica.\n4. Grado de División (Superficie de Contacto): Un sólido pulverizado reacciona mucho más rápido que un trozo compacto (mayor área expuesta).\n5. Catalizadores: Sustancias que AUMENTAN la velocidad de reacción DISMINUYENDO la energía de activación (E_a), sin consumirse ni alterar el equilibrio termodinámico (los catalizadores biológicos son las Enzimas).",
                conceptosClave = listOf(
                    "Condiciones de choque efectivo: orientación espacial adecuada y energía ≥ Energía de Activación (E_a)",
                    "Complejo activado: estado de transición intermedio de máxima energía",
                    "Factores de velocidad: concentración, temperatura, superficie de contacto y catalizadores",
                    "Un catalizador acelera la reacción disminuyendo la Energía de Activación (E_a)"
                ),
                formulas = listOf(
                    "v = -\\frac{\\Delta[\\text{Reactivo}]}{\\Delta t} = +\\frac{\\Delta[\\text{Producto}]}{\\Delta t}",
                    "\\text{Catalizador} \\implies \\downarrow E_a \\implies \\uparrow \\text{Velocidad de reacción}"
                ),
                formulaName = "Factores Cinéticos de Reacción",
                formulaLatex = "v = k [A]^m [B]^n \\quad (\\text{Ley de Velocidad})",
                formulaDescription = "Dependencia experimental de la rapidez respecto a concentraciones y energía de activación.",
                admissionTip = "¡Pregunta frecuente en la UNSA! Un catalizador positivo altera la VELOCIDAD de la reacción bajando la E_a, pero NUNCA altera la entalpía de reacción (ΔH) ni desplaza la posición del equilibrio químico.",
                admissionExplanation = "• Las astillas de madera arden casi instantáneamente mientras que un tronco macizo tarda horas en quemarse, debido a la gran superficie de contacto expuesta al oxígeno."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t13_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La acción primordial de un catalizador positivo para acelerar una reacción química consiste en:",
                    options = listOf(
                        "Aumentar la temperatura del sistema",
                        "Disminuir la energía de activación (E_a)",
                        "Aumentar el calor de reacción (ΔH)",
                        "Aumentar el número total de colisiones sin energía suficiente",
                        "Desplazar el equilibrio químico hacia los reactivos"
                    ),
                    correctIndex = 1,
                    explanation = "Un catalizador proporciona una ruta o mecanismo alternativo con una menor energía de activación (E_a), incrementando la fracción de colisiones efectivas por segundo.",
                    subject = "Química",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "qui_t13_s02",
            subjectId = "qui_t13_s02",
            semana = 13,
            subtema = "13.2 Equilibrio Químico y Ley de Acción de Masas (Kc y Kp)",
            title = "Equilibrio Químico y Constantes Kc / Kp",
            theory = LessonTheory(
                id = "theory_qui_t13_s02",
                asignatura = "Química",
                semana = 13,
                titulo = "Equilibrio Químico y Constantes Kc / Kp",
                resumen = "El equilibrio químico es un estado dinámico que se alcanza en reacciones químicas REVERSIBLES en sistemas cerrados cuando la velocidad de la reacción directa (v_d) se iguala exactamente a la velocidad de la reacción inversa (v_i):\nv_directa = v_inversa\n(A nivel macroscópico las concentraciones de reactivos y productos permanecen constantes en el tiempo, aunque a nivel microscópico la reacción continúa produciéndose en ambos sentidos).\n\n• Ley de Acción de Masas (Guldberg y Waage):\nPara la reacción reversible: a A + b B ⇌ c C + d D\n\n1. Constante de Equilibrio en Concentraciones (K_c):\nK_c = ([C]^c · [D]^d) / ([A]^a · [B]^b)\n(¡REGLA FUNDAMENTAL! En la expresión de K_c solo participan sustancias en estado GASEOSO (g) y ACUOSO (ac); los sólidos puros (s) y líquidos puros (l) tienen actividad constante y NO se incluyen en la fórmula).\n\n2. Constante en Presiones Parciales (K_p):\nK_p = (P_C^c · P_D^d) / (P_A^a · P_B^b)   (exclusivo para gases).\n\n• Relación entre K_p y K_c:\nK_p = K_c · (R · T)^(Δn)\n(donde Δn = Σ coeficientes gaseosos de productos - Σ coeficientes gaseosos de reactivos = (c + d) - (a + b)). Si Δn = 0 => K_p = K_c.",
                conceptosClave = listOf(
                    "Equilibrio químico dinámico: v_directa = v_inversa; concentraciones constantes",
                    "Expresión de Kc: [Productos] / [Reactivos] elevados a sus coeficientes",
                    "Los sólidos puros (s) y líquidos puros (l) NO entran en la expresión de Kc ni Kp",
                    "Relación: Kp = Kc · (R T)^(Δn)"
                ),
                formulas = listOf(
                    "K_c = \\frac{[C]^c [D]^d}{[A]^a [B]^b} \\quad (\\text{solo especies gaseosas y acuosas})",
                    "K_p = K_c (R T)^{\\Delta n}, \\quad \\Delta n = (c + d) - (a + b)"
                ),
                formulaName = "Ley de Acción de Masas y Equilibrio Químico",
                formulaLatex = "K_c = \\frac{[\\text{Productos}]^p}{[\\text{Reactivos}]^r}, \\quad K_p = K_c (RT)^{\\Delta n}",
                formulaDescription = "Cociente termodinámico de concentraciones y presiones en equilibrio dinámico.",
                admissionTip = "Para la reacción de calcinación CaCO₃(s) ⇌ CaO(s) + CO₂(g): como CaCO₃ y CaO son sólidos puros, NO se escriben en la constante, quedando simplemente K_c = [CO₂] y K_p = P_CO₂.",
                admissionExplanation = "• Si K_c >> 1 (muy grande), el equilibrio está fuertemente desplazado hacia los productos; si K_c << 1, la reacción casi no progresa y predominan los reactivos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t13_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para la reacción en equilibrio heterogéneo: C(s) + CO₂(g) ⇌ 2 CO(g), la expresión correcta de la constante de equilibrio K_c es:",
                    options = listOf(
                        "K_c = [CO]² / ([C] · [CO₂])",
                        "K_c = [CO]² / [CO₂]",
                        "K_c = [CO₂] / [CO]²",
                        "K_c = (2 [CO]) / [CO₂]",
                        "K_c = [CO] / [CO₂]"
                    ),
                    correctIndex = 1,
                    explanation = "El carbono sólido C(s) es un sólido puro y su concentración no se incluye en la constante de equilibrio; por lo tanto: K_c = [CO]² / [CO₂].",
                    subject = "Química",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "qui_t13_s03",
            subjectId = "qui_t13_s03",
            semana = 13,
            subtema = "13.3 Principio de Le Châtelier: Factores de Perturbación del Equilibrio",
            title = "Principio de Le Châtelier",
            theory = LessonTheory(
                id = "theory_qui_t13_s03",
                asignatura = "Química",
                semana = 13,
                titulo = "Principio de Le Châtelier",
                resumen = "• Principio de Henri Le Châtelier (1884):\nSi sobre un sistema químico en equilibrio se ejerce una perturbación externa (cambio en la concentración, temperatura o presión), el sistema evoluciona espontáneamente en el sentido que contrarreste dicha perturbación, restableciendo un nuevo estado de equilibrio.\n\n• Efecto de las Perturbaciones:\n1. Variación de la Concentración:\n- Si se AÑADE un reactivo: el equilibrio se desplaza hacia la DERECHA (hacia los productos para consumirlo).\n- Si se RETIRA un producto: el equilibrio se desplaza hacia la DERECHA (para reponerlo).\n\n2. Variación de la Presión y Volumen (solo afecta si hay gases con Δn ≠ 0):\n- Al AUMENTAR la presión (o disminuir volumen): el equilibrio se desplaza hacia el lado con MENOR número de moles gaseosas (menor volumen).\n- Al DISMINUIR la presión: se desplaza hacia el lado con MAYOR número de moles gaseosas.\n\n3. Variación de la Temperatura (¡ÚNICO factor que altera el valor numérico de K_c!):\n- Al AUMENTAR la temperatura: favorece el sentido ENDOTÉRMICO (absorbe calor).\n- Al DISMINUIR la temperatura (enfriamiento): favorece el sentido EXOTÉRMICO (libera calor).",
                conceptosClave = listOf(
                    "Principio de Le Châtelier: el sistema se opone al cambio externo",
                    "Añadir sustancia desplaza en sentido opuesto; retirar sustancia desplaza hacia el mismo lado",
                    "Aumento de presión desplaza hacia donde hay MENOS moles de gas",
                    "La TEMPERATURA es el único factor que cambia el valor numérico de la constante K_c"
                ),
                formulas = listOf(
                    "\\uparrow P \\implies \\text{desplazamiento hacia menor } \\sum n_{\\text{gas}}",
                    "\\uparrow T \\implies \\text{favorece reacción endotérmica } (\\Delta H > 0)"
                ),
                formulaName = "Principio de Respuesta de Le Châtelier",
                formulaLatex = "\\text{Perturbación Externa} \\implies \\text{Respuesta contraria del sistema}",
                formulaDescription = "Homeostasis termodinámica en reacciones químicas reversibles.",
                admissionTip = "¡Pregunta trampa de admisión! La adición de un catalizador o de un gas inerte a volumen constante NO desplaza la posición del equilibrio químico.",
                admissionExplanation = "• Para la síntesis de Haber-Bosch: N₂(g) + 3 H₂(g) ⇌ 2 NH₃(g) (4 moles de gas a la izquierda y 2 a la derecha): aumentar la presión favorece la producción de amoníaco NH₃."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t13_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el equilibrio gaseoso exotérmico: N₂(g) + 3 H₂(g) ⇌ 2 NH₃(g) + calor. ¿Cuál de las siguientes acciones provocará un desplazamiento del equilibrio hacia la derecha aumentando la producción de amoníaco?",
                    options = listOf(
                        "Aumentar la temperatura",
                        "Disminuir la presión del sistema",
                        "Aumentar la presión del sistema",
                        "Retirar gas nitrógeno (N₂)",
                        "Agregar un catalizador sólido"
                    ),
                    correctIndex = 2,
                    explanation = "A la izquierda hay 1 + 3 = 4 moles de gas y a la derecha solo 2 moles de gas. Al aumentar la presión, el sistema se desplaza hacia el lado con menor número de moles gaseosas (hacia la derecha, produciendo más NH₃).",
                    subject = "Química",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "qui_t13_s04",
            subjectId = "qui_t13_s04",
            semana = 13,
            subtema = "13.4 Cociente de Reacción (Qc) y Pronóstico de Desplazamiento",
            title = "Cociente de Reacción (Qc)",
            theory = LessonTheory(
                id = "theory_qui_t13_s04",
                asignatura = "Química",
                semana = 13,
                titulo = "Cociente de Reacción (Qc)",
                resumen = "El Cociente de Reacción (Q_c) tiene la misma expresión matemática que la constante de equilibrio K_c, pero se calcula con las concentraciones de las sustancias en un instante CUALQUIERA fuera del equilibrio:\n\n• Comparación entre Q_c y K_c para Predecir el Sentido Espontáneo:\n1. Si Q_c < K_c:\nLa relación [Productos] / [Reactivos] es menor que en el equilibrio. Hay exceso de reactivos y defecto de productos.\n- La reacción neta se desplaza hacia la DERECHA (->, directa) para formar más productos hasta alcanzar el equilibrio.\n\n2. Si Q_c = K_c:\nEl sistema se encuentra exactamente en EQUILIBRIO QUÍMICO DINÁMICO. No hay cambio neto visible.\n\n3. Si Q_c > K_c:\nLa relación [Productos] / [Reactivos] es mayor que en el equilibrio. Hay exceso de productos.\n- La reacción neta se desplaza hacia la IZQUIERDA (<-, inversa) para consumir productos y regenerar reactivos hasta que Q_c = K_c.",
                conceptosClave = listOf(
                    "Cociente Qc: calculado en cualquier instante fuera del equilibrio",
                    "Qc < Kc: se desplaza a la DERECHA (hacia productos)",
                    "Qc = Kc: sistema en equilibrio químico dinámico",
                    "Qc > Kc: se desplaza a la IZQUIERDA (hacia reactivos)"
                ),
                formulas = listOf(
                    "Q_c = \\frac{[C]^c_{\\text{actual}} [D]^d_{\\text{actual}}}{[A]^a_{\\text{actual}} [B]^b_{\\text{actual}}}",
                    "Q_c < K_c \\implies \\to (\\text{directa}), \\quad Q_c > K_c \\implies \\leftarrow (\\text{inversa})"
                ),
                formulaName = "Criterio de Evolución del Cociente de Reacción",
                formulaLatex = "Q_c < K_c \\implies \\text{desplazamiento a la derecha } (\\to)",
                formulaDescription = "Comparación adimensional indicadora de la espontaneidad hacia el estado de equilibrio.",
                admissionTip = "Regla de flecha nemotécnica rápida: Si colocas Q y K en orden alfabético (Q ... K), el signo menor (<) apunta como una flecha hacia la derecha (Q < K => -> a productos).",
                admissionExplanation = "• Cuando se mezclan reactivos puros sin nada de productos inicialmente, [Productos] = 0, por lo que Q_c = 0 y necesariamente Q_c < K_c, desplazándose obligatoriamente a la derecha."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t13_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para una reacción reversible cuya constante de equilibrio es K_c = 50, se determinan las concentraciones en un instante dado y se calcula un cociente de reacción Q_c = 120. ¿Hacia dónde evolucionará el sistema para alcanzar el equilibrio?",
                    options = listOf(
                        "Hacia la derecha, formando más productos",
                        "Hacia la izquierda, formando más reactivos",
                        "Permanecerá inmóvil porque ya está en equilibrio",
                        "Se detendrán ambas reacciones directa e inversa",
                        "Aumentará la constante K_c a 120"
                    ),
                    correctIndex = 1,
                    explanation = "Como Q_c (120) > K_c (50), hay exceso de productos respecto al equilibrio. El sistema debe consumir productos y formar más reactivos, desplazándose hacia la izquierda (<-).",
                    subject = "Química",
                    semana = 13
                )
            )
        ),

        // ==========================================
        // SEMANA 14: ÁCIDOS, BASES Y PH
        // ==========================================
        LessonNode(
            id = "qui_t14_s01",
            subjectId = "qui_t14_s01",
            semana = 14,
            subtema = "14.1 Teorías Ácido-Base: Arrhenius, Brønsted-Lowry y Lewis",
            title = "Teorías Ácido-Base",
            theory = LessonTheory(
                id = "theory_qui_t14_s01",
                asignatura = "Química",
                semana = 14,
                titulo = "Teorías Ácido-Base",
                resumen = "Existen tres teorías complementarias que definen el comportamiento de ácidos y bases:\n\n1. Teoría de Svante Arrhenius (1884, limitada a disoluciones acuosas):\n- Ácido: Sustancia que en solución acuosa se disocia liberando iones hidrógeno o protones (H⁺ o H₃O⁺). Ej: HCl -> H⁺ + Cl⁻.\n- Base: Sustancia que en solución acuosa se disocia liberando iones hidróxido u oxidrilo (OH⁻). Ej: NaOH -> Na⁺ + OH⁻.\n\n2. Teoría de Johannes Brønsted y Thomas Lowry (1923, transferencia de protones):\n- Ácido: Especie química (molécula o ion) capaz de CEDER o donar un protón (H⁺).\n- Base: Especie química capaz de ACEPTAR o recibir un protón (H⁺).\n- Pares Conjugados Ácido-Base: Difieren exactamente en un solo protón (H⁺):\n  Ácido₁ + Base₂ ⇌ Base Conjugada₁ + Ácido Conjugado₂\n  Ejemplo: NH₃ + H₂O ⇌ NH₄⁺ + OH⁻ (NH₃ es base, NH₄⁺ es su ácido conjugado; H₂O es ácido, OH⁻ su base conjugada).\n- Especie Anfótera o Anfolito: Sustancia que puede actuar como ácido o como base según con quién reaccione (el Agua H₂O es el solvente anfótero por excelencia).\n\n3. Teoría de Gilbert N. Lewis (1923, transferencia de pares de electrones):\n- Ácido: Especie deficiente en electrones capaz de ACEPTAR un par de electrones (orbital vacío, ej. BF₃, AlCl₃, cationes metálicos Cu²⁺).\n- Base: Especie con pares de electrones libres capaz de DONAR o compartir un par de electrones (ej. NH₃, H₂O).",
                conceptosClave = listOf(
                    "Arrhenius (solo en agua): Ácido libera H⁺, Base libera OH⁻",
                    "Brønsted-Lowry: Ácido CEDE protón H⁺, Base ACEPTA protón H⁺",
                    "Pares conjugados difieren exactamente en un protón (H⁺)",
                    "Lewis: Ácido ACEPTA par de electrones (electrófilo, BF₃), Base DONA par de electrones (nucleófilo, NH₃)"
                ),
                formulas = listOf(
                    "\\text{Brønsted-Lowry}: \\; \\text{Ácido} \\rightleftharpoons \\text{Base Conjugada} + \\text{H}^+",
                    "\\text{Lewis}: \\; \\text{Base (:)} + \\text{Ácido (}\\square\\text{)} \\to \\text{Enlace Covalente Coordinado}"
                ),
                formulaName = "Modelos Teóricos Ácido-Base",
                formulaLatex = "\\text{Arrhenius } (\\text{H}^+, \\text{OH}^-), \\; \\text{Brønsted } (\\text{dona/acepta H}^+), \\; \\text{Lewis } (\\text{acepta/dona } e^-)",
                formulaDescription = "Evolución conceptual del comportamiento de donación protónica y electrónica.",
                admissionTip = "En la teoría de Brønsted-Lowry, para hallar la base conjugada de un ácido, simplemente QUÍTALE un protón H⁺ (del H₂SO₄ su base conjugada es HSO₄⁻); para hallar el ácido conjugado de una base, AGRÉGALE un protón H⁺ (del H₂O su ácido conjugado es H₃O⁺).",
                admissionExplanation = "• Toda sustancia ácida según Arrhenius lo es también según Brønsted-Lowry y Lewis; la teoría de Lewis es la más amplia y universal de las tres."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t14_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la reacción según la teoría de Brønsted-Lowry: HSO₄⁻ + H₂O ⇌ SO₄²⁻ + H₃O⁺, la base conjugada del ácido HSO₄⁻ es:",
                    options = listOf("H₂O", "SO₄²⁻", "H₃O⁺", "H₂SO₄", "OH⁻"),
                    correctIndex = 1,
                    explanation = "El ácido HSO₄⁻ cede un protón (H⁺) transformándose en el ion sulfato SO₄²⁻, el cual constituye su base conjugada correspondiente.",
                    subject = "Química",
                    semana = 14
                )
            )
        ),
        LessonNode(
            id = "qui_t14_s02",
            subjectId = "qui_t14_s02",
            semana = 14,
            subtema = "14.2 Autoionización del Agua (Kw) y Escala de pH y pOH",
            title = "Autoionización del Agua y Escala de pH",
            theory = LessonTheory(
                id = "theory_qui_t14_s02",
                asignatura = "Química",
                semana = 14,
                titulo = "Autoionización del Agua y Escala de pH",
                resumen = "• Producto Iónico del Agua (K_w):\nEl agua pura se autoioniza en grado mínimo en equilibrio:\n2 H₂O ⇌ H₃O⁺ + OH⁻  (o H₂O ⇌ H⁺ + OH⁻)\nA 25 °C, el producto iónico del agua es una constante:\nK_w = [H⁺] · [OH⁻] = 1.0 × 10⁻¹⁴\n- En agua pura neutra: [H⁺] = [OH⁻] = 10⁻⁷ M.\n- En medio ácido: [H⁺] > 10⁻⁷ M  y  [OH⁻] < 10⁻⁷ M.\n- En medio básico o alcalino: [H⁺] < 10⁻⁷ M  y  [OH⁻] > 10⁻⁷ M.\n\n• Escala de Potencial de Hidrógeno (pH de Sørensen, 1909):\npH = - log [H⁺]\npOH = - log [OH⁻]\nRelación fundamental a 25 °C:\npH + pOH = 14\n\n• Clasificación a 25 °C:\n- pH < 7 : Solución Ácida (más protones H⁺).\n- pH = 7 : Solución Neutra.\n- pH > 7 : Solución Básica o Alcalina (más iones OH⁻).\n- Regla de Potencias de 10: Si [H⁺] = 10⁻ⁿ M, entonces pH = n directamente (ej. si [H⁺] = 10⁻³ M => pH = 3).",
                conceptosClave = listOf(
                    "Producto iónico del agua a 25 °C: Kw = [H⁺][OH⁻] = 10⁻¹⁴",
                    "Definición logarítmica: pH = - log [H⁺]; pOH = - log [OH⁻]",
                    "Suma constante: pH + pOH = 14 a 25 °C",
                    "Escala: pH < 7 (Ácido), pH = 7 (Neutro), pH > 7 (Básico o Alcalino)"
                ),
                formulas = listOf(
                    "K_w = [\\text{H}^+][\\text{OH}^-] = 10^{-14} \\quad (\\text{a } 25^\\circ\\text{C})",
                    "\\text{pH} = -\\log[\\text{H}^+], \\quad \\text{pOH} = -\\log[\\text{OH}^-], \\quad \\text{pH} + \\text{pOH} = 14"
                ),
                formulaName = "Escala Logarítmica de pH de Sørensen",
                formulaLatex = "\\text{pH} = -\\log[\\text{H}^+], \\quad [\\text{H}^+] = 10^{-\\text{pH}}",
                formulaDescription = "Cuantificación logarítmica de la acidez y basicidad en disoluciones acuosas.",
                admissionTip = "¡Cuidado con las bases! Si te dan una solución de NaOH 0.01 M, [OH⁻] = 10⁻² M, su pOH es 2, y por lo tanto su pH es 14 - 2 = 12 (no vayas a marcar 2 en las alternativas).",
                admissionExplanation = "• Cada unidad entera de cambio en la escala de pH representa una variación de 10 veces en la concentración de protones (un ácido de pH = 2 es diez veces más concentrado en H⁺ que uno de pH = 3 y 100 veces más que uno de pH = 4)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t14_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se prepara una solución acuosa en la que la concentración de iones hidrógeno es [H⁺] = 1.0 × 10⁻⁴ M a 25 °C. El valor del pOH de dicha solución es:",
                    options = listOf("4", "7", "8", "10", "14"),
                    correctIndex = 3,
                    explanation = "pH = - log [H⁺] = - log (10⁻⁴) = 4.\nComo pH + pOH = 14 => pOH = 14 - pH = 14 - 4 = 10.",
                    subject = "Química",
                    semana = 14
                )
            )
        ),
        LessonNode(
            id = "qui_t14_s03",
            subjectId = "qui_t14_s03",
            semana = 14,
            subtema = "14.3 Ácidos Fuertes, Bases Fuertes y Cálculo Directo de pH",
            title = "Ácidos Fuertes y Cálculo de pH",
            theory = LessonTheory(
                id = "theory_qui_t14_s03",
                asignatura = "Química",
                semana = 14,
                titulo = "Ácidos Fuertes y Cálculo de pH",
                resumen = "• Electrolitos Fuertes (Disociación al 100%, irreversible ->):\nSe ionizan completamente en agua; no existe equilibrio químico y [H⁺] o [OH⁻] se calcula directamente de la estequiometría:\n\n1. Ácidos Fuertes Monopróticos Típicos de Admisión:\n- Ácido clorhídrico (HCl), bromhídrico (HBr), yodhídrico (HI).\n- Ácido nítrico (HNO₃), perclórico (HClO₄).\nEn estos ácidos: [H⁺] = Molaridad del ácido (M_a) => pH = - log (M_a).\n\n2. Bases Fuertes Típicas de Admisión:\n- Hidróxidos de metales alcalinos (Grupo IA): LiOH, NaOH, KOH.\n- Hidróxidos de metales alcalinotérreos solubles (Grupo IIA): Ca(OH)₂, Ba(OH)₂.\nPara bases de grupo IA: [OH⁻] = Molaridad de la base (M_b) => pOH = - log (M_b).\nPara bases dipróticas como Ca(OH)₂: [OH⁻] = 2 · M_b.\n\n• Electrolitos Débiles (Ácidos y Bases Débiles):\nSe ionizan solo parcialmente en agua (< 5%), estableciendo un equilibrio químico regido por la constante de acidez K_a o constante de basicidad K_b:\nHA ⇌ H⁺ + A⁻   =>   K_a = ([H⁺][A⁻]) / [HA]\nPara ácidos débiles diluidos: [H⁺] ≈ √(K_a · C_ácido).",
                conceptosClave = listOf(
                    "Ácidos fuertes (HCl, HNO₃, HClO₄): disociación total al 100%, [H⁺] = Molaridad",
                    "Bases fuertes (NaOH, KOH): [OH⁻] = Molaridad",
                    "Bases dipróticas como Ca(OH)₂: liberan 2 OH⁻, [OH⁻] = 2 · M_base",
                    "Ácidos débiles (CH₃COOH, HF, HCN): ionización parcial regida por K_a"
                ),
                formulas = listOf(
                    "\\text{Ácido Fuerte Monoprótico}: [\\text{H}^+] = M_{\\text{ácido}} \\implies \\text{pH} = -\\log(M)",
                    "\\text{Base Fuerte (NaOH)}: [\\text{OH}^-] = M_{\\text{base}} \\implies \\text{pOH} = -\\log(M)",
                    "\\text{Ácido Débil}: [\\text{H}^+] = \\sqrt{K_a \\cdot C_a}"
                ),
                formulaName = "Cálculo de pH en Electrolitos Fuertes",
                formulaLatex = "[\\text{H}^+] = M_a \\implies \\text{pH} = -\\log(M_a)",
                formulaDescription = "Ionización completa irreversible estequiométrica de solutos electrolíticos fuertes.",
                admissionTip = "Si te dan una solución de HCl 0.001 M (10⁻³ M), al ser ácido fuerte monoprótico, [H⁺] = 10⁻³ M y su pH es 3 al instante sin fórmulas complejas.",
                admissionExplanation = "• El ácido acético del vinagre doméstico (CH₃COOH) es un ácido débil orgánico (K_a ≈ 1.8 × 10⁻⁵); no te quema la boca porque casi todas sus moléculas permanecen sin ionizar."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t14_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el pH de una solución acuosa de ácido clorhídrico (HCl) 0.01 M, sabiendo que el HCl es un ácido fuerte que se disocia al 100%?",
                    options = listOf("1", "2", "3", "7", "12"),
                    correctIndex = 1,
                    explanation = "Al ser electrolito fuerte monoprótico: [H⁺] = M = 0.01 M = 10⁻² M.\npH = - log [H⁺] = - log (10⁻²) = 2.",
                    subject = "Química",
                    semana = 14
                )
            )
        ),
        LessonNode(
            id = "qui_t14_s04",
            subjectId = "qui_t14_s04",
            semana = 14,
            subtema = "14.4 Reacciones de Neutralización y Titulación Ácido-Base",
            title = "Neutralización y Titulación Ácido-Base",
            theory = LessonTheory(
                id = "theory_qui_t14_s04",
                asignatura = "Química",
                semana = 14,
                titulo = "Neutralización y Titulación Ácido-Base",
                resumen = "• Reacción de Neutralización:\nReacción entre un ácido y una base para formar una sal y agua. La reacción iónica neta es la combinación del ion hidrógeno con el ion hidróxido:\nH⁺(ac) + OH⁻(ac) -> H₂O(l)   (proceso exotérmico neto).\n\n• Punto de Equivalencia en una Titulación o Valoración Ácido-Base:\nMomento estequiométrico exacto en el que el número de equivalentes-gramo de ácido iguala al número de equivalentes-gramo de base:\n#Eq-g(ácido) = #Eq-g(base)\nN_ácido · V_ácido = N_base · V_base\n(donde N es la Normalidad y V el volumen consumido de cada solución).\nUsando la relación N = M · θ:\nM_ácido · θ_ácido · V_ácido = M_base · θ_base · V_base\n\n• Punto Final e Indicadores Ácido-Base:\n- El punto final se detecta visualmente en el matraz Erlenmeyer mediante el viraje de color de un indicador químico.\n- Fenolftaleína: Incolora en medio ácido y neutro; vira a color grosella (fucsia) en el punto de equivalencia con bases (pH ≈ 8.2 - 10).\n- Rojo de metilo: Vira de rojo a amarillo (pH ≈ 4.4 - 6.2).",
                conceptosClave = listOf(
                    "Reacción iónica neta de neutralización: H⁺ + OH⁻ -> H₂O",
                    "Punto de equivalencia: #Eq-g(ácido) = #Eq-g(base)",
                    "Ley de titulación volumétrica: N_ácido · V_ácido = N_base · V_base",
                    "Indicadores: fenolftaleína (incolora a fucsia grosella al pasar a medio básico)"
                ),
                formulas = listOf(
                    "N_a \\cdot V_a = N_b \\cdot V_b \\quad (\\text{Punto de Equivalencia})",
                    "M_a \\cdot \\theta_a \\cdot V_a = M_b \\cdot \\theta_b \\cdot V_b"
                ),
                formulaName = "Ley de Neutralización Volumétrica",
                formulaLatex = "N_a V_a = N_b V_b \\iff M_a \\theta_a V_a = M_b \\theta_b V_b",
                formulaDescription = "Condición de paridad estequiométrica en valoraciones volumétricas.",
                admissionTip = "Si el ácido es monoprótico (HCl, θ=1) y la base tiene un solo OH (NaOH, θ=1), la fórmula se simplifica a la conocida M_a · V_a = M_b · V_b.",
                admissionExplanation = "• Al neutralizar un ácido fuerte con una base fuerte (ej. HCl + NaOH), la sal formada (NaCl) no sufre hidrólisis y el pH en el punto de equivalencia es neutro exacto (pH = 7 a 25 °C)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t14_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué volumen de solución de NaOH 0.2 N se necesita para neutralizar exactamente 40 mL de una solución de HCl 0.1 N?",
                    options = listOf("10 mL", "20 mL", "40 mL", "60 mL", "80 mL"),
                    correctIndex = 1,
                    explanation = "N_ácido · V_ácido = N_base · V_base\n(0.1 N) · (40 mL) = (0.2 N) · V_base => 4 = 0.2 V_base => V_base = 4 / 0.2 = 20 mL.",
                    subject = "Química",
                    semana = 14
                )
            )
        ),

        // ==========================================
        // SEMANA 15: ELECTROQUÍMICA
        // ==========================================
        LessonNode(
            id = "qui_t15_s01",
            subjectId = "qui_t15_s01",
            semana = 15,
            subtema = "15.1 Celdas Galvánicas o Voltaicas: Pila de Daniell y Potenciales Estándar",
            title = "Celdas Galvánicas y Pila de Daniell",
            theory = LessonTheory(
                id = "theory_qui_t15_s01",
                asignatura = "Química",
                semana = 15,
                titulo = "Celdas Galvánicas y Pila de Daniell",
                resumen = "La electroquímica estudia la interconversión entre energía química y energía eléctrica:\n\n• Celdas Galvánicas o Voltaicas (Pilas y Baterías):\nDispositivos que transforman la energía química de una reacción redox ESPONTÁNEA (ΔG < 0) en energía eléctrica continua (fuerza electromotriz):\n\n1. Ánodo (Electrodo Negativo -):\n- Ocurre la OXIDACIÓN (regla mnemotécnica: 'AnOx' -> Ánodo Oxidación).\n- Libera electrones que viajan por el circuito externo hacia el cátodo. El electrodo se corroe o disuelve perdiendo masa.\n\n2. Cátodo (Electrodo Positivo +):\n- Ocurre la REDUCCIÓN (regla mnemotécnica: 'RedCat' -> Reducción Cátodo).\n- Recibe electrones; los cationes de la solución se depositan ganando masa.\n\n3. Puente Salino (Tubo en U con gel conductor, ej. KCl o Na₂SO₄):\nMantiene la neutralidad eléctrica de las semiceldas permitiendo la migración de aniones hacia el ánodo y de cationes hacia el cátodo, cerrando el circuito.\n\n• Pila de Daniell Clásica:\nZn(s) | Zn²⁺(1M) || Cu²⁺(1M) | Cu(s)\n- Ánodo: Zn(s) -> Zn²⁺(ac) + 2e⁻ (E° = +0.76 V)\n- Cátodo: Cu²⁺(ac) + 2e⁻ -> Cu(s) (E° = +0.34 V)\n- Potencial Estándar de la Celda: E°_celda = E°_cátodo - E°_ánodo = 0.34 - (-0.76) = +1.10 V.",
                conceptosClave = listOf(
                    "Pila galvánica: reacción química espontánea genera corriente eléctrica",
                    "Regla mnemotécnica universal: 'AnOx' (Ánodo Oxidación) y 'RedCat' (Reducción Cátodo)",
                    "Signos en celdas galvánicas: Ánodo (-) y Cátodo (+)",
                    "Potencial de celda Daniell: E°_celda = E°_reducción(cátodo) - E°_reducción(ánodo) = +1.10 V"
                ),
                formulas = listOf(
                    "E^\\circ_{\\text{celda}} = E^\\circ_{\\text{reducción (cátodo)}} - E^\\circ_{\\text{reducción (ánodo)}}",
                    "\\text{Pila Daniell}: \\; E^\\circ = +0.34 - (-0.76) = +1.10 \\text{ V}"
                ),
                formulaName = "Fuerza Electromotriz Estándar de Celda",
                formulaLatex = "E^\\circ_{\\text{celda}} = E^\\circ_{\\text{cátodo}} - E^\\circ_{\\text{ánodo}} > 0 \\quad (\\text{espontáneo})",
                formulaDescription = "Diferencia de potencial termodinámico redox en condiciones estándar.",
                admissionTip = "¡Nunca olvides la regla mnemotécnica 'AnOx - RedCat'! Ánodo = Oxidación (empiezan con vocales: A y O); Cátodo = Reducción (empiezan con consonantes: C y R). ¡Válido para celdas galvánicas y electrolíticas!",
                admissionExplanation = "• Una reacción redox es termodinámicamente espontánea si y solo si el potencial estándar resultante de la celda es positivo (E°_celda > 0)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t15_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una celda galvánica o pila voltaica, el electrodo donde ocurre el proceso de oxidación y que actúa como polo negativo se denomina:",
                    options = listOf("Cátodo", "Ánodo", "Puente salino", "Voltímetro", "Electrolito inerte"),
                    correctIndex = 1,
                    explanation = "Por la regla 'AnOx', en el ánodo ocurre siempre la oxidación, el cual en las celdas galvánicas actúa como el polo negativo de la pila.",
                    subject = "Química",
                    semana = 15
                )
            )
        ),
        LessonNode(
            id = "qui_t15_s02",
            subjectId = "qui_t15_s02",
            semana = 15,
            subtema = "15.2 Celdas Electrolíticas y Electrólisis de Sales Fundidas y Acuosas",
            title = "Celdas Electrolíticas y Electrólisis",
            theory = LessonTheory(
                id = "theory_qui_t15_s02",
                asignatura = "Química",
                semana = 15,
                titulo = "Celdas Electrolíticas y Electrólisis",
                resumen = "• Electrólisis:\nProceso NO ESPONTÁNEO (ΔG > 0) forzado mediante el suministro de energía eléctrica continua desde una fuente externa (batería) para descomponer un electrolito líquido fundido o en solución acuosa.\n\n• Polaridad de Electrodos en Celdas Electrolíticas (¡Inversa a las pilas!):\n- Ánodo (Polo POSITIVO + conectado al borne positivo de la fuente):\n  Sigue ocurriendo la OXIDACIÓN ('AnOx'). Los aniones negativos (Cl⁻, Br⁻) migran hacia él cediendo electrones (ej. 2 Cl⁻ -> Cl₂↑ + 2e⁻).\n- Cátodo (Polo NEGATIVO - conectado al borne negativo de la fuente):\n  Sigue ocurriendo la REDUCCIÓN ('RedCat'). Los cationes positivos (Na⁺, Cu²⁺) migran hacia él captando electrones y depositándose como metal (ej. Na⁺ + 1e⁻ -> Na⁰).\n\n• Electrólisis del NaCl Fundido (Celda Downs):\n- Ánodo (+): 2 Cl⁻ -> Cl₂(g) + 2e⁻ (se obtiene gas cloro).\n- Cátodo (-): 2 Na⁺ + 2e⁻ -> 2 Na(l) (se obtiene sodio metálico puro).\n\n• Aplicaciones Industriales:\nElectrodeposición metálica (galvanoplastia: cromado, niquelado, dorado), refinación electrolítica del cobre (cátodos de Cu 99.99%) y obtención de aluminio por el proceso Hall-Héroult.",
                conceptosClave = listOf(
                    "Electrólisis: proceso no espontáneo que utiliza energía eléctrica continua",
                    "Polaridad en electrólisis: Ánodo es POSITIVO (+) y Cátodo es NEGATIVO (-)",
                    "Mantiene regla 'AnOx' (Ánodo = Oxidación) y 'RedCat' (Cátodo = Reducción)",
                    "Aplicaciones: refinación electrolítica del cobre, galvanoplastia y obtención de metales alcalinos"
                ),
                formulas = listOf(
                    "\\text{Energía Eléctrica} \\xrightarrow{\\text{Electrólisis}} \\text{Reacción Química No Espontánea}",
                    "\\text{Ánodo (+)}: 2\\text{Cl}^- \\to \\text{Cl}_2(g) + 2e^-, \\quad \\text{Cátodo (-)}: \\text{Na}^+ + e^- \\to \\text{Na}(s)"
                ),
                formulaName = "Mecanismo de la Celda Electrolítica",
                formulaLatex = "\\text{Cátodo (-): Reducción}, \\quad \\text{Ánodo (+): Oxidación}",
                formulaDescription = "Migración forzada de iones bajo gradiente de potencial electroquímico externo.",
                admissionTip = "En AMBOS tipos de celdas (galvánicas o electrolíticas) la regla se mantiene idéntica: en el Ánodo SIEMPRE hay Oxidación y en el Cátodo SIEMPRE hay Reducción. Lo único que se invierte es el signo de polaridad (+ o -).",
                admissionExplanation = "• En la electrólisis del agua acidulada (con gotas de H₂SO₄), en el cátodo se desprende gas H₂ y en el ánodo gas O₂, en una relación volumétrica de 2 volúmenes de H₂ por 1 volumen de O₂."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t15_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una celda electrolítica utilizada para el electrorefinado de metales, el electrodo donde se produce la reducción catódica de los iones metálicos corresponde al polo:",
                    options = listOf(
                        "Positivo de la celda",
                        "Negativo de la celda",
                        "Neutro de la celda",
                        "Puente salino",
                        "Borne alterno"
                    ),
                    correctIndex = 1,
                    explanation = "En las celdas electrolíticas, el cátodo está conectado al polo negativo de la fuente eléctrica continua (polo negativo de la celda) y es allí donde ocurre la reducción.",
                    subject = "Química",
                    semana = 15
                )
            )
        ),
        LessonNode(
            id = "qui_t15_s03",
            subjectId = "qui_t15_s03",
            semana = 15,
            subtema = "15.3 Leyes de la Electrólisis de Michael Faraday",
            title = "Leyes de la Electrólisis de Faraday",
            theory = LessonTheory(
                id = "theory_qui_t15_s03",
                asignatura = "Química",
                semana = 15,
                titulo = "Leyes de la Electrólisis de Faraday",
                resumen = "Michael Faraday formuló en 1834 las dos leyes cuantitativas de la electroquímica:\n\n• Constante de Faraday (1 F):\nEs la carga eléctrica transportada por exactamente UN MOL DE ELECTRONES:\n1 F = N_A · e⁻ = (6.022 × 10²³ e⁻) · (1.602 × 10⁻¹⁹ C) ≈ 96 500 Coulombs (C).\n(1 Faraday libera o deposita exactamente 1 equivalente-gramo de cualquier sustancia en un electrodo).\n\n• Primera Ley de Faraday:\nLa masa de sustancia depositada o liberada en un electrodo es directamente proporcional a la cantidad de carga eléctrica (Q = I · t) que atraviesa la celda:\nm = P.Eq · Q / 96 500 = (P.Eq · I · t) / 96 500\n(donde m es la masa en gramos, I la intensidad de corriente en Amperios, t el tiempo en SEGUNDOS y P.Eq = M̄ / θ el peso equivalente del elemento).\n\n• Segunda Ley de Faraday:\nSi se conectan varias celdas electrolíticas EN SERIE cruzadas por la misma cantidad de corriente eléctrica (misma carga Q), las masas depositadas en los distintos electrodos son proporcionales a sus respectivos pesos equivalentes:\nm₁ / P.Eq₁ = m₂ / P.Eq₂ = m₃ / P.Eq₃ = #Eq-g.",
                conceptosClave = listOf(
                    "1 Faraday (1 F) = 96 500 Coulombs = carga de 1 mol de electrones",
                    "1 F deposita exactamente 1 equivalente-gramo de cualquier sustancia",
                    "Primera Ley: m = (P.Eq · I · t) / 96 500 (con t en segundos obligatorio)",
                    "Segunda Ley: celdas en serie depositan igual número de equivalentes-gramo (#Eq-g₁ = #Eq-g₂)"
                ),
                formulas = listOf(
                    "1 \\text{ Faraday (F)} = 96\\,500 \\text{ C} \\approx 1 \\text{ mol } e^-",
                    "m = \\frac{\\text{P.Eq} \\cdot I \\cdot t}{96\\,500} = \\frac{\\bar{M} \\cdot I \\cdot t}{\\theta \\cdot 96\\,500}",
                    "\\frac{m_1}{\\text{P.Eq}_1} = \\frac{m_2}{\\text{P.Eq}_2} \\quad (\\text{Celdas en serie})"
                ),
                formulaName = "Ecuación Cuantitativa de Faraday",
                formulaLatex = "m = \\frac{\\text{P.Eq} \\cdot I \\cdot t}{96\\,500}, \\quad 1 \\text{ F} = 96\\,500 \\text{ C}",
                formulaDescription = "Estequiometría electrónica de electrodeposición y electrólisis cuantitativa.",
                admissionTip = "¡El tiempo 't' en la fórmula de Faraday DEBE estar estrictamente en SEGUNDOS! Si te dan el tiempo en minutos, multiplica por 60; si te lo dan en horas, multiplica por 3600.",
                admissionExplanation = "• Para depositar 1 mol de plata Ag⁺ (θ = 1) se requiere 1 F (96 500 C); para depositar 1 mol de cobre Cu²⁺ (θ = 2) se requieren 2 F (2 × 96 500 C)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t15_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué masa de plata metálica (Ag) se deposita en el cátodo de una celda electrolítica al hacer pasar una corriente de 9.65 A durante 1000 segundos por una solución de nitrato de plata (AgNO₃)? (P.Eq de la plata = 108 g/eq).",
                    options = listOf("1.08 g", "10.8 g", "54.0 g", "108 g", "216 g"),
                    correctIndex = 1,
                    explanation = "Carga eléctrica: Q = I · t = (9.65 A) · (1000 s) = 9650 Coulombs.\nm = (P.Eq · Q) / 96 500 = (108 · 9650) / 96 500 = 108 / 10 = 10.8 gramos.",
                    subject = "Química",
                    semana = 15
                )
            )
        ),
        LessonNode(
            id = "qui_t15_s04",
            subjectId = "qui_t15_s04",
            semana = 15,
            subtema = "15.4 Corrosión Metálica y Métodos de Protección Galvánica",
            title = "Corrosión y Protección Anticorrosiva",
            theory = LessonTheory(
                id = "theory_qui_t15_s04",
                asignatura = "Química",
                semana = 15,
                titulo = "Corrosión y Protección Anticorrosiva",
                resumen = "La corrosión es el deterioro electroquímico espontáneo y destructivo de un metal por reacción redox con agentes de su entorno ambiental (oxígeno y humedad):\n\n• Mecanismo Electroquímico de Oxidación del Hierro (Herrumbre):\n- Zona Anódica (se corroe): Fe(s) -> Fe²⁺(ac) + 2e⁻ (E°_ox = +0.44 V).\n- Zona Catódica: O₂(g) + 2 H₂O(l) + 4e⁻ -> 4 OH⁻(ac).\n- Formación de Herrumbre: El Fe²⁺ se sigue oxidando a Fe³⁺ formando el óxido férrico hidratado rojizo Fe₂O₃ · xH₂O (poroso y quebradizo, no protege al metal interior).\n\n• Métodos de Prevención y Protección contra la Corrosión:\n1. Recubrimientos Superficiales Pasivos: Pinturas anticorrosivas, barnices, esmaltes y grasas protectoras.\n2. Galvanizado: Recubrimiento de láminas de hierro con una delgada capa de Zinc (Zn). Si la capa se raya, el Zinc (más reactivo) se oxida antes que el hierro protegiéndolo galvánicamente.\n3. Protección Catódica con Ánodo de Sacrificio:\n   Se conecta eléctricamente el metal a proteger (ej. tuberías subterráneas de acero o cascos de barcos de hierro) a un metal con menor potencial de reducción (más fácilmente oxidable, como bloques de Magnesio Mg o Zinc Zn). El ánodo de sacrificio se corroe deliberadamente salvando la estructura de hierro.",
                conceptosClave = listOf(
                    "Corrosión del hierro: celda electroquímica natural que produce Fe₂O₃ · xH₂O (herrumbre)",
                    "Galvanizado: recubrimiento de hierro con zinc para protección superficial",
                    "Protección catódica: uso de ánodos de sacrificio (Mg o Zn) más reactivos que el hierro"
                ),
                formulas = listOf(
                    "\\text{Ánodo}: \\text{Fe}(s) \\to \\text{Fe}^{2+} + 2e^-, \\quad \\text{Cátodo}: \\text{O}_2 + 2\\text{H}_2\\text{O} + 4e^- \\to 4\\text{OH}^-",
                    "\\text{Herrumbre}: 2\\text{Fe}^{3+} + 3\\text{O}^{2-} + x\\text{H}_2\\text{O} \\to \\text{Fe}_2\\text{O}_3 \\cdot x\\text{H}_2\\text{O}"
                ),
                formulaName = "Mecanismo Electroquímico de la Herrumbre",
                formulaLatex = "4\\text{Fe} + 3\\text{O}_2 + 2x\\text{H}_2\\text{O} \\to 2\\text{Fe}_2\\text{O}_3 \\cdot x\\text{H}_2\\text{O}",
                formulaDescription = "Degradación espontánea de metales por ataque atmosférico redox.",
                admissionTip = "El Magnesio (Mg) y el Zinc (Zn) son excelentes ánodos de sacrificio porque tienen un potencial de oxidación mayor que el hierro (son más electropositivos), obligando al hierro a actuar como cátodo protegido.",
                admissionExplanation = "• Metales como el aluminio y el cromo forman de manera natural una película de óxido superficial transparente y compacta (pasivación) que sella el metal e impide que la corrosión continúe hacia el interior."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t15_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El método de protección contra la corrosión en el cual se conecta eléctricamente una tubería de acero enterrada a bloques de magnesio o zinc para que estos se oxiden preferentemente en su lugar se denomina:",
                    options = listOf(
                        "Electrólisis de salmuera",
                        "Protección catódica con ánodo de sacrificio",
                        "Lixiviación ácida",
                        "Pirólisis catódica",
                        "Pasivación por cromado"
                    ),
                    correctIndex = 1,
                    explanation = "La protección catódica con ánodo de sacrificio emplea metales más activos (como el zinc o magnesio) que ceden electrones y se consumen protegiendo la estructura principal.",
                    subject = "Química",
                    semana = 15
                )
            )
        ),

        // ==========================================
        // SEMANA 16: QUÍMICA ORGÁNICA Y AMBIENTAL
        // ==========================================
        LessonNode(
            id = "qui_t16_s01",
            subjectId = "qui_t16_s01",
            semana = 16,
            subtema = "16.1 El Átomo de Carbono: Tetravalencia, Concatenación e Hibridación",
            title = "Propiedades del Átomo de Carbono",
            theory = LessonTheory(
                id = "theory_qui_t16_s01",
                asignatura = "Química",
                semana = 16,
                titulo = "Propiedades del Átomo de Carbono",
                resumen = "La química orgánica gira en torno a las singulares propiedades químicas del átomo de carbono (₆C):\n\n• Propiedades Fundamentales del Carbono:\n1. Tetravalencia: El carbono siempre comparte 4 pares de electrones de valencia formando 4 enlaces covalentes.\n2. Concatenación: Capacidad extraordinaria para unirse a otros átomos de carbono formando cadenas estables lineales, ramificadas y cíclicas.\n3. Covalencia: Se une mediante enlaces covalentes con otros no metales (H, O, N, S, halógenos).\n4. Autosaturación: Capacidad de formar enlaces simples (-), dobles (=) o triples (≡) entre átomos de carbono.\n\n• Tipos de Hibridación del Carbono:\n1. Hibridación sp³ (Enlaces Simples):\n   - Geometría: Tetraédrica tridimensional.\n   - Ángulo de enlace: 109.5° (109°28').\n   - Enlaces: 4 enlaces sigma (σ). Presente en alcanos.\n2. Hibridación sp² (Enlace Doble):\n   - Geometría: Trigonal plana.\n   - Ángulo de enlace: 120°.\n   - Enlaces: 3 enlaces sigma (σ) y 1 enlace pi (π). Presente en alquenos y anillos aromáticos.\n3. Hibridación sp (Enlace Triple o Dos Dobles Acumulados):\n   - Geometría: Lineal.\n   - Ángulo de enlace: 180°.\n   - Enlaces: 2 enlaces sigma (σ) y 2 enlaces pi (π). Presente en alquinos.",
                conceptosClave = listOf(
                    "Propiedades únicas: Tetravalencia (4 enlaces) y Concatenación (cadenas de carbono)",
                    "sp³: 4 enlaces simples, geometría tetraédrica (109.5°)",
                    "sp²: 1 enlace doble, geometría trigonal plana (120°)",
                    "sp: 1 enlace triple o dos dobles acumulados, geometría lineal (180°)"
                ),
                formulas = listOf(
                    "sp^3 \\implies \\text{Tetraédrico (109.5}^\\circ\\text{, 4}\\sigma), \\quad sp^2 \\implies \\text{Trigonal plano (120}^\\circ\\text{, 1}\\pi)",
                    "sp \\implies \\text{Lineal (180}^\\circ\\text{, 2}\\pi)"
                ),
                formulaName = "Hibridación del Átomo de Carbono",
                formulaLatex = "sp^3 \\; (109.5^\\circ), \\quad sp^2 \\; (120^\\circ), \\quad sp \\; (180^\\circ)",
                formulaDescription = "Reorganización mecano-cuántica de orbitales atómicos s y p en enlaces carbonados.",
                admissionTip = "Regla visual instantánea: si el carbono solo tiene enlaces simples, es sp³; si tiene un enlace doble (=), es sp²; si tiene un enlace triple (≡), es sp.",
                admissionExplanation = "• Clasificación de carbonos según vecinos unidos: Primario (unido a 1 carbono), Secundario (a 2 carbonos), Terciario (a 3 carbonos) y Cuaternario (a 4 carbonos)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t16_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El tipo de hibridación que presenta un átomo de carbono que forma un enlace doble y dos enlaces simples, con geometría trigonal plana y ángulos de enlace de 120°, corresponde a:",
                    options = listOf("sp", "sp²", "sp³", "sp³d", "sp³d²"),
                    correctIndex = 1,
                    explanation = "La hibridación sp² combina un orbital 's' con dos orbitales 'p', generando 3 orbitales híbridos sp² coplanares orientados a 120° característicos de los carbonos con enlace doble.",
                    subject = "Química",
                    semana = 16
                )
            )
        ),
        LessonNode(
            id = "qui_t16_s02",
            subjectId = "qui_t16_s02",
            semana = 16,
            subtema = "16.2 Hidrocarburos: Alcanos, Alquenos, Alquinos y Aromáticos",
            title = "Hidrocarburos Alifáticos y Aromáticos",
            theory = LessonTheory(
                id = "theory_qui_t16_s02",
                asignatura = "Química",
                semana = 16,
                titulo = "Hidrocarburos Alifáticos y Aromáticos",
                resumen = "Compuestos orgánicos binarios formados exclusivamente por carbono e hidrógeno:\n\n1. Alcanos o Parafinas (Saturados):\n- Enlaces covalentes simples C - C (hibridación sp³).\n- Fórmula Global: C_n H_(2n+2)\n- Sufijo IUPAC: -ano (metano CH₄, etano C₂H₆, propano C₃H₈, butano C₄H₁₀).\n- Muy poco reactivos químicamente a temperatura ambiente; su reacción principal es la Combustión.\n\n2. Alquenos u Olefinas (Insaturados):\n- Contienen al menos un enlace doble C = C (hibridación sp²).\n- Fórmula Global (con 1 doble enlace): C_n H_2n\n- Sufijo: -eno (eteno o etileno C₂H₄: hormona vegetal de maduración de frutos).\n\n3. Alquinos o Acetilénicos (Insaturados):\n- Contienen al menos un enlace triple C ≡ C (hibridación sp).\n- Fórmula Global (con 1 triple enlace): C_n H_(2n-2)\n- Sufijo: -ino (etino o acetileno C₂H₂: gas de soldadura autógena a alta temperatura).\n\n4. Hidrocarburos Aromáticos (Derivados del Benceno C₆H₆):\n- Anillo hexagonal de 6 carbonos con 3 dobles enlaces conjugados resonantes deslocalizados (híbrido de resonancia de Kekulé, hibridación sp², gran estabilidad).\n- Ejemplos: Tolueno (metilbenceno), fenol (hidroxibenceno), naftaleno (dos anillos fusionados).",
                conceptosClave = listOf(
                    "Fórmulas globales: Alcanos C_n H_(2n+2), Alquenos C_n H_2n, Alquinos C_n H_(2n-2)",
                    "Alcanos = saturados (enlace simple); Alquenos y Alquinos = insaturados",
                    "Eteno/Etileno: maduración de frutos; Etino/Acetileno: soldadura",
                    "Benceno (C₆H₆): anillo aromático plano con electrones π resonantes deslocalizados"
                ),
                formulas = listOf(
                    "\\text{Alcanos}: \\text{C}_n\\text{H}_{2n+2}, \\quad \\text{Alquenos}: \\text{C}_n\\text{H}_{2n}, \\quad \\text{Alquinos}: \\text{C}_n\\text{H}_{2n-2}",
                    "\\text{Benceno}: \\text{C}_6\\text{H}_6 \\; (\\text{Anillo aromático con resonancia})"
                ),
                formulaName = "Fórmulas Globales de Hidrocarburos",
                formulaLatex = "\\text{C}_n \\text{H}_{2n+2} \\; (\\text{alcano}), \\quad \\text{C}_n \\text{H}_{2n} \\; (\\text{alqueno}), \\quad \\text{C}_n \\text{H}_{2n-2} \\; (\\text{alquino})",
                formulaDescription = "Series homólogas acíclicas de hidrocarburos según grado de instauración.",
                admissionTip = "Si te dan un hidrocarburo con 5 carbonos: si tiene 12 hidrógenos (2n+2 = 12), es un alcano (pentano); si tiene 10 hidrógenos (2n = 10), es un alqueno (penteno); si tiene 8 hidrógenos (2n-2 = 8), es un alquino (pentino).",
                admissionExplanation = "• El gas doméstico GLP (Gas Licuado de Petróleo) es una mezcla presurizada de propano (C₃H₈) y butano (C₄H₁₀); el Gas Natural de Camisea es primordialmente metano (CH₄, más del 90%)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t16_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la fórmula global del alcano lineal que posee 8 átomos de carbono en su estructura molecular?",
                    options = listOf("C₈H₁₄", "C₈H₁₆", "C₈H₁₈", "C₈H₂₀", "C₈H₁₀"),
                    correctIndex = 2,
                    explanation = "La fórmula general de los alcanos es C_n H_(2n+2). Para n = 8: C₈ H_(2·8 + 2) = C₈ H₁₈ (octano).",
                    subject = "Química",
                    semana = 16
                )
            )
        ),
        LessonNode(
            id = "qui_t16_s03",
            subjectId = "qui_t16_s03",
            semana = 16,
            subtema = "16.3 Funciones Orgánicas Oxigenadas y Nitrogenadas Notables",
            title = "Funciones Orgánicas Oxigenadas y Nitrogenadas",
            theory = LessonTheory(
                id = "theory_qui_t16_s03",
                asignatura = "Química",
                semana = 16,
                titulo = "Funciones Orgánicas Oxigenadas y Nitrogenadas",
                resumen = "Los compuestos oxigenados y nitrogenados presentan grupos funcionales específicos:\n\n• Funciones Oxigenadas:\n1. Alcoholes (R - OH): Grupo hidroxilo. Sufijo -ol (metanol CH₃OH o alcohol de madera, tóxico; etanol CH₃CH₂OH o alcohol etílico de bebidas).\n2. Éteres (R - O - R'): Grupo alcoxi u oxi (ej. éter etílico usado como anestésico histórico).\n3. Aldehídos (R - CHO): Grupo carbonilo terminal. Sufijo -al (metanal HCHO o formaldehído/formol para conservar tejidos; etanal CH₃CHO o acetaldehído).\n4. Cetonas (R - CO - R'): Grupo carbonilo intermedio. Sufijo -ona (propanona CH₃COCH₃ o acetona para disolver esmaltes).\n5. Ácidos Carboxílicos (R - COOH): Grupo carboxilo terminal. Sufijo -oico (ácido metanoico HCOOH o fórmico en hormigas; ácido etanoico CH₃COOH o acético del vinagre).\n6. Ésteres (R - COO - R'): Reacción de Esterificación de Fischer:\n   Ácido Carboxílico + Alcohol -> Éster + H₂O\n   Responsables de aromas y fragancias de frutas y flores (sufijo -oato de -ilo).\n\n• Funciones Nitrogenadas:\n1. Aminas (R - NH₂): Derivados del amoníaco (NH₃), carácter básico.\n2. Amidas (R - CONH₂): Grupo carbonilo unido a grupo amino (constituyen el enlace peptídico en las proteínas).\n3. Nitrilos (R - C≡N): Grupo ciano.",
                conceptosClave = listOf(
                    "Grupos oxigenados: Alcohol (-OH), Aldehído (-CHO), Cetona (-CO-), Ácido (-COOH), Éster (-COO-)",
                    "Esterificación: Ácido carboxílico + Alcohol -> Éster + Agua (aromas frutales)",
                    "Grupos nitrogenados: Aminas (-NH₂, básicas) y Amidas (-CONH₂, enlaces peptídicos)",
                    "Nombres comunes: Formaldehído (metanal), Acetona (propanona), Ácido fórmico (metanoico), Ácido acético (etanoico)"
                ),
                formulas = listOf(
                    "\\text{Alcohol}: R-\\text{OH}, \\quad \\text{Aldehído}: R-\\text{CHO}, \\quad \\text{Cetona}: R-\\text{CO}-R'",
                    "\\text{Ácido Carboxílico}: R-\\text{COOH}, \\quad \\text{Éster}: R-\\text{COO}-R'",
                    "\\text{Esterificación}: R-\\text{COOH} + R'-\\text{OH} \\xrightarrow{\\text{H}^+} R-\\text{COO}-R' + \\text{H}_2\\text{O}"
                ),
                formulaName = "Familias Funcionales Oxigenadas y Nitrogenadas",
                formulaLatex = "-OH, \\; -CHO, \\; -CO-, \\; -COOH, \\; -COO-, \\; -NH_2, \\; -CONH_2",
                formulaDescription = "Arquitectura de grupos funcionales en síntesis orgánica y bioquímica.",
                admissionTip = "No confundas: el aldehído tiene el carbonilo en posición TERMINAL (-CHO), mientras que la cetona tiene el carbonilo en posición INTERMEDIA (-CO-) entre dos carbonos.",
                admissionExplanation = "• La saponificación es la reacción inversa de un éster graso (triglicérido) con una base fuerte (NaOH o KOH) para producir jabón y glicerina."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t16_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El grupo funcional característico que define a la familia de los 'Aldehídos' corresponde a:",
                    options = listOf("-OH", "-CHO", "-CO-", "-COOH", "-NH₂"),
                    correctIndex = 1,
                    explanation = "El grupo funcional de los aldehídos es el grupo carbonilo terminal -CHO (formilo).",
                    subject = "Química",
                    semana = 16
                )
            )
        ),
        LessonNode(
            id = "qui_t16_s04",
            subjectId = "qui_t16_s04",
            semana = 16,
            subtema = "16.4 Química Ambiental: Capa de Ozono, Lluvia Ácida y Efecto Invernadero",
            title = "Química Ambiental y Contaminación Global",
            theory = LessonTheory(
                id = "theory_qui_t16_s04",
                asignatura = "Química",
                semana = 16,
                titulo = "Química Ambiental y Contaminación Global",
                resumen = "• Principales Problemas de Contaminación Química Atmosférica:\n\n1. Efecto Invernadero Antropogénico y Calentamiento Global:\nRetención excesiva de radiación infrarroja térmica emitida por la Tierra debido a la acumulación de Gases de Efecto Invernadero (GEI):\n- Dióxido de carbono (CO₂): Principal gas por quema de combustibles fósiles (carbón, petróleo, gas natural) y deforestación.\n- Metano (CH₄): Proveniente de ganadería, arrozales y descomposición anaerobia (25 veces más potente que el CO₂).\n- Vapor de agua (H₂O), Óxido nitroso (N₂O) y Clorofluorocarbonos (CFCs).\n\n2. Destrucción de la Capa de Ozono Estratosférico (O₃):\nLos Clorofluorocarbonos (CFCs o freones de aerosoles y refrigerantes) ascienden a la estratosfera; la radiación UV rompe los enlaces liberando radicales libres de cloro (Cl•):\nCl• + O₃ -> ClO• + O₂\nClO• + O -> Cl• + O₂\n(Un solo átomo de cloro puede destruir hasta 100 000 moléculas de ozono en un ciclo catalítico continuo).\n\n3. Lluvia Ácida (pH < 5.6):\nCausada por emisiones industriales de dióxido de azufre (SO₂) y óxidos de nitrógeno (NO_x) provenientes de la quema de carbón y motores de combustión:\n- SO₃ + H₂O -> H₂SO₄ (ácido sulfúrico)\n- 2 NO₂ + H₂O -> HNO₃ + HNO₂ (ácido nítrico y nitroso)\nProduce acidificación de lagos y suelos, daño a bosques y corrosión de monumentos calcáreos y sillar (CaCO₃ + H₂SO₄ -> CaSO₄ + CO₂ + H₂O).\n\n4. Smog Fotoquímico: Ozono troposférico a nivel del suelo, PAN (nitrato de peroxiacetilo) y partículas en suspensión generados por luz solar sobre hidrocarburos y NO_x.",
                conceptosClave = listOf(
                    "Efecto invernadero: gases CO₂, CH₄, N₂O atrapan radiación infrarroja térmica",
                    "Destrucción de la capa de ozono: radicales de cloro (Cl•) de los CFCs destruyen O₃ catalíticamente",
                    "Lluvia ácida (pH < 5.6): producida por SO₂ (forma H₂SO₄) y NO_x (forma HNO₃)",
                    "Deterioro de rocas calcáreas y sillar por ácido sulfúrico"
                ),
                formulas = listOf(
                    "\\text{Destrucción de O}_3: \\; \\text{Cl}^\\bullet + \\text{O}_3 \\to \\text{ClO}^\\bullet + \\text{O}_2",
                    "\\text{Lluvia Ácida}: \\; \\text{SO}_3 + \\text{H}_2\\text{O} \\to \\text{H}_2\\text{SO}_4, \\quad \\text{CaCO}_3 + \\text{H}_2\\text{SO}_4 \\to \\text{CaSO}_4 + \\text{CO}_2 + \\text{H}_2\\text{O}"
                ),
                formulaName = "Mecanismos Químicos de Polución Atmosférica",
                formulaLatex = "\\text{SO}_x, \\text{NO}_x \\xrightarrow{+\\text{H}_2\\text{O}} \\text{Lluvia Ácida}, \\quad \\text{CFC} \\xrightarrow{\\text{UV}} \\text{Destrucción de } \\text{O}_3",
                formulaDescription = "Reacciones atmosféricas de degradación ecosistémica global.",
                admissionTip = "El ozono en la ESTRATOSFERA (capa de ozono alta) es benéfico porque nos protege de la radiación UV; pero el ozono en la TROPOSFERA (a nivel del suelo, en el smog) es un contaminante secundario irritante muy dañino.",
                admissionExplanation = "• El Protocolo de Montreal (1987) es el tratado ambiental más exitoso de la historia, logrando prohibir a nivel mundial la producción de CFCs para permitir la regeneración de la capa de ozono."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t16_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Los principales gases contaminantes industriales precursores de la formación de la 'lluvia ácida' al reaccionar con el vapor de agua atmosférico son:",
                    options = listOf(
                        "Oxígeno (O₂) y Nitrógeno (N₂)",
                        "Dióxido de azufre (SO₂) y Óxidos de nitrógeno (NO_x)",
                        "Metano (CH₄) y Cloro (Cl₂)",
                        "Monóxido de carbono (CO) y Helio (He)",
                        "Argón (Ar) y Ozono (O₃)"
                    ),
                    correctIndex = 1,
                    explanation = "El dióxido de azufre (SO₂) y los óxidos de nitrógeno (NO_x) reaccionan con el agua de las nubes formando ácido sulfúrico (H₂SO₄) y ácido nítrico (HNO₃), originando la lluvia ácida.",
                    subject = "Química",
                    semana = 16
                )
            )
        )
    )
}
