package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object QuimicaPart1 {
    val lessons: List<LessonNode> = listOf(
        // ==========================================
        // SEMANA 1: LA QUÍMICA COMO CIENCIA
        // ==========================================
        LessonNode(
            id = "qui_t01_s01",
            subjectId = "quimica",
            semana = 1,
            subtema = "1.1 Objeto de Estudio de la Química y Ramas Principales",
            title = "La Química como Ciencia y sus Ramas",
            theory = LessonTheory(
                id = "theory_qui_t01_s01",
                asignatura = "Química",
                semana = 1,
                titulo = "La Química como Ciencia y sus Ramas",
                resumen = "La Química es la ciencia natural y fáctica que estudia la materia, su composición íntima, estructura molecular, propiedades y las transformaciones que experimenta con absorción o liberación de energía.\n\n• Ramas Fundamentales:\n1. Química General: Principios, leyes teóricas y conceptos universales aplicables a toda la materia.\n2. Química Inorgánica: Estudia los elementos y compuestos que no contienen cadenas carbono-hidrógeno (minerales, metales, óxidos, ácidos inorgánicos).\n3. Química Orgánica: Estudia los compuestos formados primordialmente por enlaces carbono-carbono y carbono-hidrógeno (hidrocarburos, biomoléculas, plásticos, fármacos).\n4. Fisicoquímica: Fundamentos termodinámicos, cinéticos, electroquímicos y cuánticos que rigen los fenómenos químicos.\n5. Química Analítica: Identificación cualitativa (qué componentes hay) y cuantificación (cuánto hay en masa o volumen) de sustancias en una muestra.\n6. Bioquímica: Procesos químicos moleculares que sustentan la vida en los seres vivos (metabolismo, enzimas, ácidos nucleicos).",
                conceptosClave = listOf(
                    "Química: ciencia central que estudia composición, propiedades y transformación de la materia",
                    "Química Orgánica (estudio del carbono) vs Inorgánica (minerales y elementos no carbonados)",
                    "Química Analítica Cualitativa (identificación) vs Cuantitativa (medición numérica)"
                ),
                formulas = listOf(
                    "\\text{Química Analítica} = \\text{Cualitativa (¿Qué hay?)} + \\text{Cuantitativa (¿Cuánto hay?)}"
                ),
                formulaName = "Ramas Principales de la Química",
                formulaLatex = "\\text{Materia} \\xrightarrow{\\Delta E} \\text{Transformaciones Químicas}",
                formulaDescription = "Clasificación taxonómica de las disciplinas químicas según el objeto material estudiado.",
                admissionTip = "Recuerda que el dióxido de carbono (CO₂), monóxido de carbono (CO), carbonatos (CaCO₃) y cianuros (KCN), a pesar de tener carbono, son estudiados tradicionalmente por la QUÍMICA INORGÁNICA por sus propiedades minerales.",
                admissionExplanation = "• Antoine Lavoisier es reconocido como el 'Padre de la Química Moderna' por introducir la balanza cuantitativa y refutar la teoría del flogisto formulando la Ley de Conservación de la Masa."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La rama de la química encargada de determinar la cantidad exacta en porcentaje de masa de cobre presente en una muestra de mineral extraído de Cerro Verde en Arequipa es la:",
                    options = listOf("Fisicoquímica", "Química Orgánica", "Química Analítica Cuantitativa", "Química Inorgánica Pura", "Bioquímica"),
                    correctIndex = 2,
                    explanation = "La Química Analítica Cuantitativa se dedica a medir con precisión la cantidad, concentración o porcentaje numérico de los componentes en una muestra material.",
                    subject = "Química",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "qui_t01_s02",
            subjectId = "quimica",
            semana = 1,
            subtema = "1.2 El Método Científico Experimental en Química",
            title = "El Método Científico en Química",
            theory = LessonTheory(
                id = "theory_qui_t01_s02",
                asignatura = "Química",
                semana = 1,
                titulo = "El Método Científico en Química",
                resumen = "La química es una ciencia estrictamente experimental que genera conocimientos siguiendo el método científico:\n\n1. Observación: Detección rigurosa de un fenómeno natural mediante instrumentos analíticos o sentidos (ej. cambio de color, desprendimiento de gas, liberación de calor).\n2. Planteamiento del Problema: Pregunta formulada en términos claros y verificables.\n3. Hipótesis: Suposición o explicación tentativa basada en principios teóricos que debe ser susceptible de ser contrastada experimentalmente.\n4. Experimentación: Reproducción deliberada y controlada del fenómeno en el laboratorio, manipulando una variable independiente y midiendo la dependiente mientras se controlan las demás variables.\n5. Análisis de Datos y Conclusión: Verificación de si la hipótesis es sustentada o refutada por los datos empíricos.\n6. Ley Científica vs Teoría Científica:\n- Ley Científica: Proposición concisa, usualmente matemática, que describe una regularidad invariable de la naturaleza sin explicar el porqué (ej. Ley de Boyle, Ley de Conservación de la Masa).\n- Teoría Científica: Modelo conceptual integral ampliamente comprobado que EXPLICA los mecanismos subyacentes de las leyes observadas (ej. Teoría Cinético-Molecular, Teoría Atómica de Dalton).",
                conceptosClave = listOf(
                    "Secuencia del método científico: Observación, Hipótesis, Experimentación y Conclusiones",
                    "Diferencia epistemológica: Ley (describe matemáticamente el qué) vs Teoría (explica el porqué a nivel molecular)",
                    "Variable independiente (manipulada por el investigador) vs dependiente (medida en el experimento)"
                ),
                formulas = listOf(
                    "\\text{Método Científico}: \\; \\text{Observación} \\to \\text{Hipótesis} \\to \\text{Experimento} \\to \\text{Ley / Teoría}"
                ),
                formulaName = "Secuencia Epistemológica Científica",
                formulaLatex = "\\text{Hipótesis verificada} \\implies \\text{Ley (descripción)} / \\text{Teoría (mecanismo causal)}",
                formulaDescription = "Estructura lógica de contrastación experimental del conocimiento químico.",
                admissionTip = "Una hipótesis jamás se 'demuestra' para siempre como verdad absoluta inmutable; se corrobora provisionalmente y puede ser refinada o reemplazada ante nueva evidencia experimental más precisa.",
                admissionExplanation = "• La Ley de Lavoisier dice QUE la masa se conserva en las reacciones; la Teoría Atómica de Dalton explica POR QUÉ se conserva (porque los átomos no se crean ni se destruyen, solo se reorganizan)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el método científico, un enunciado matemático o verbal conciso que describe una regularidad o comportamiento constante de la naturaleza, sin pretender explicar sus causas microscópicas íntimas, se denomina:",
                    options = listOf("Hipótesis", "Teoría científica", "Ley científica", "Experimento testigo", "Variable independiente"),
                    correctIndex = 2,
                    explanation = "Una Ley Científica resume y describe una relación invariable y generalizada observada en la naturaleza (como las leyes de los gases o de la gravitación).",
                    subject = "Química",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "qui_t01_s03",
            subjectId = "quimica",
            semana = 1,
            subtema = "1.3 Unidades del SI, Notación Científica y Cifras Significativas",
            title = "Unidades del SI y Medición Química",
            theory = LessonTheory(
                id = "theory_qui_t01_s03",
                asignatura = "Química",
                semana = 1,
                titulo = "Unidades del SI y Medición Química",
                resumen = "• Unidades Fundamentales del SI usadas en Química:\n- Masa: Kilogramo (kg) [en laboratorio: gramo, 1 kg = 1000 g].\n- Longitud: Metro (m) [en escala atómica: Angstrom, 1 Å = 10⁻¹⁰ m; nanómetro, 1 nm = 10⁻⁹ m; picómetro, 1 pm = 10⁻¹² m].\n- Tiempo: Segundo (s).\n- Temperatura: Kelvin (K), escala absoluta: K = °C + 273.15.\n- Cantidad de sustancia: Mol (mol) = 6.022 × 10²³ partículas (Número de Avogadro N_A).\n\n• Prefijos del SI:\nMega (M = 10⁶), Kilo (k = 10³), Deci (d = 10⁻¹), Centi (c = 10⁻²), Mili (m = 10⁻³), Micro (μ = 10⁻⁶), Nano (n = 10⁻⁹), Pico (p = 10⁻¹²).\n\n• Reglas de Cifras Significativas (C.S.):\n1. Cualquier dígito distinto de cero es significativo (123 -> 3 C.S.).\n2. Ceros entre dígitos no nulos son significativos (1005 -> 4 C.S.).\n3. Ceros a la izquierda del primer dígito no nulo NO son significativos (0.0025 -> 2 C.S.).\n4. Ceros a la derecha de una cifra decimal son significativos (2.500 -> 4 C.S.).",
                conceptosClave = listOf(
                    "Unidad de cantidad de sustancia: Mol (6.022 × 10²³ entidades elementales)",
                    "Temperatura absoluta en el SI: Kelvin (K = °C + 273)",
                    "Cifras significativas: ceros a la izquierda no cuentan, ceros a la derecha tras coma decimal sí cuentan"
                ),
                formulas = listOf(
                    "K = ^\\circ\\text{C} + 273.15, \\quad 1 \\text{ mol} = 6.022 \\times 10^{23} \\text{ partículas}",
                    "1 \\text{ Å} = 10^{-10} \\text{ m}, \\quad 1 \\text{ nm} = 10^{-9} \\text{ m}"
                ),
                formulaName = "Medición y Magnitudes del SI",
                formulaLatex = "1 \\text{ mol} = 6.022 \\times 10^{23} \\; (N_A), \\quad T(\\text{K}) = T(^\\circ\\text{C}) + 273",
                formulaDescription = "Estándares metrológicos universales de masa atómica y temperatura absoluta.",
                admissionTip = "En operaciones químicas, el número 0.050 tiene 2 cifras significativas (el 5 y el último cero; los dos primeros ceros son solo posición decimal).",
                admissionExplanation = "• La masa es invariante en cualquier lugar del universo; el peso depende del campo gravitatorio del planeta o satélite donde se mida (P = m·g)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántas cifras significativas tiene la medición de volumen 0.04080 litros?",
                    options = listOf("2", "3", "4", "5", "6"),
                    correctIndex = 2,
                    explanation = "Los dos ceros a la izquierda de la coma y del 4 no son significativos. Las cifras significativas son: 4, 0, 8, 0 (total: 4 cifras significativas).",
                    subject = "Química",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "qui_t01_s04",
            subjectId = "quimica",
            semana = 1,
            subtema = "1.4 Relación de la Química con la Tecnología y la Sociedad",
            title = "Química, Tecnología y Desarrollo Sostenible",
            theory = LessonTheory(
                id = "theory_qui_t01_s04",
                asignatura = "Química",
                semana = 1,
                titulo = "Química, Tecnología y Desarrollo Sostenible",
                resumen = "La química interactúa de forma transversal con la ingeniería, la medicina, la agricultura y el medio ambiente:\n\n• Aplicaciones de Impacto:\n1. Medicina y Farmacología: Síntesis de antibióticos, anestésicos, vacunas y marcadores radioactivos para diagnóstico por imágenes (Tecnecio-99m).\n2. Industria Minero-Metalúrgica (Clave en el sur del Perú): Lixiviación ácida del cobre (CuSO₄), flotación de sulfuros, electroobtención de cátodos de cobre de alta pureza (99.99%).\n3. Agricultura: Fertilizantes sintéticos nitrogenados (proceso Haber-Bosch para amoníaco NH₃ y urea CO(NH₂)₂), fosfatados y pesticidas.\n4. Energía y Nuevos Materiales: Baterías de ion-litio para vehículos eléctricos, semiconductores de silicio ultrapuro, nanotubos de carbono y grafeno.\n\n• Química Verde (Sostenible):\nDiseño de productos y procesos químicos que reducen o eliminan el uso y generación de sustancias peligrosas, optimizando la economía atómica y empleando catalizadores biodegradables.",
                conceptosClave = listOf(
                    "Minería en el Perú: lixiviación, flotación y electrorefinación de cobre",
                    "Proceso Haber-Bosch: fijación industrial de nitrógeno atmosférico para síntesis de fertilizantes",
                    "Principios de la Química Verde: prevención de residuos, economía atómica y catalizadores"
                ),
                formulas = listOf(
                    "\\text{Proceso Haber-Bosch}: \\; \\text{N}_2(g) + 3\\text{H}_2(g) \\rightleftharpoons 2\\text{NH}_3(g)",
                    "\\text{Economía Atómica} = \\frac{\\text{Masa de productos deseados}}{\\text{Masa total de reactivos}} \\times 100\\%"
                ),
                formulaName = "Síntesis Industrial de Amoníaco",
                formulaLatex = "\\text{N}_2 + 3\\text{H}_2 \\xrightarrow{\\text{Fe, } \\Delta, P} 2\\text{NH}_3",
                formulaDescription = "Reacción fundamental de la industria química de fertilizantes agrícolas globales.",
                admissionTip = "La síntesis de amoníaco por Haber-Bosch es exotérmica y ocurre a altas presiones (150-250 atm) y temperaturas moderadas (~450 °C) con catalizador de hierro.",
                admissionExplanation = "• La Química Verde postula 12 principios formulados por Anastas y Warner, entre los que destaca la prevención de residuos antes que su posterior tratamiento o limpieza."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El proceso industrial químico fundamental que permite sintetizar amoníaco a partir de nitrógeno e hidrógeno gaseoso para la fabricación masiva de fertilizantes se denomina proceso:",
                    options = listOf("Solvay", "Ostwald", "Haber-Bosch", "Bessemer", "Castner-Kellner"),
                    correctIndex = 2,
                    explanation = "El proceso Haber-Bosch sintetiza amoníaco (N₂ + 3H₂ ⇌ 2NH₃) y es la base de la fertilización agrícola moderna a nivel mundial.",
                    subject = "Química",
                    semana = 1
                )
            )
        ),

        // ==========================================
        // SEMANA 2: MATERIA Y TRANSFORMACIONES
        // ==========================================
        LessonNode(
            id = "qui_t02_s01",
            subjectId = "quimica",
            semana = 2,
            subtema = "2.1 Clasificación de la Materia: Sustancias Puras y Mezclas",
            title = "Sustancias Puras vs Mezclas",
            theory = LessonTheory(
                id = "theory_qui_t02_s01",
                asignatura = "Química",
                semana = 2,
                titulo = "Sustancias Puras vs Mezclas",
                resumen = "• Materia: Todo lo que posee masa, volumen (extensión) e inercia.\n\n• Clasificación Universal:\n1. Sustancias Puras (Composición fija y propiedades constantes):\n   - Elementos (Sustancias Simples): Formados por átomos de un mismo número atómico (Z). No se descomponen químicamente (Fe, Cu, Au, O₂, O₃, P₄, S₈).\n   - Compuestos (Sustancias Compuestas): Unión química de dos o más elementos distintos en proporciones ponderales fijas (Ley de Proust). Se descomponen por métodos químicos en sus elementos (H₂O, NaCl, CO₂, C₆H₁₂O₆).\n\n2. Mezclas (Unión física de sustancias en proporciones variables, sin enlaces nuevos):\n   - Mezclas Homogéneas (Soluciones): Una sola fase visible (monofásicas). Partículas de tamaño molecular o iónico (< 1 nm). Ejemplos: Aire filtrado, agua potable, salmuera, aleaciones metálicas (bronce = Cu + Sn; latón = Cu + Zn; acero = Fe + C).\n   - Mezclas Heterogéneas: Dos o más fases distinguibles (polifásicas). Suspensiones (jugos naturales, jarabes) y Coloides (leche, gelatina, niebla, mayonesa; presentan Efecto Tyndall y Movimiento Browniano).",
                conceptosClave = listOf(
                    "Sustancias puras: elementos (átomos de igual Z) vs compuestos (combinación fija de elementos)",
                    "Mezclas homogéneas (soluciones monofásicas: aire, bronce, latón, acero)",
                    "Mezclas heterogéneas: coloides (efecto Tyndall) y suspensiones"
                ),
                formulas = listOf(
                    "\\text{Bronce} = \\text{Cu} + \\text{Sn}, \\quad \\text{Latón} = \\text{Cu} + \\text{Zn}, \\quad \\text{Acero} = \\text{Fe} + \\text{C}"
                ),
                formulaName = "Clasificación General de la Materia",
                formulaLatex = "\\text{Materia} = \\begin{cases} \\text{Sustancias Puras} & (\\text{Elementos, Compuestos}) \\\\ \\text{Mezclas} & (\\text{Homogéneas, Heterogéneas}) \\end{cases}",
                formulaDescription = "División jerárquica de la materia según pureza química y fases constituyentes.",
                admissionTip = "El aire, el bronce, el latón, el acero y el vinagre NO son compuestos químicos: son MEZCLAS HOMOGÉNEAS (soluciones). ¡Pregunta clásica de admisión en la UNSA!",
                admissionExplanation = "• El agua destilada (H₂O pura) es una sustancia compuesta; el agua potable o de grifo es una mezcla homogénea (solución que contiene sales disueltas y cloro)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes alternativas corresponde a una mezcla homogénea?",
                    options = listOf("Leche de vaca fresca", "Gas ozono (O₃)", "Latón (aleación de cobre y zinc)", "Jugo de papaya con pulpa", "Cloruro de sodio puro (NaCl)"),
                    correctIndex = 2,
                    explanation = "El latón es una solución sólida homogénea (aleación monofásica) formada por cobre (Cu) y zinc (Zn).",
                    subject = "Química",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "qui_t02_s02",
            subjectId = "quimica",
            semana = 2,
            subtema = "2.2 Alotropía en Elementos Químicos Notables",
            title = "Fenómeno de Alotropía",
            theory = LessonTheory(
                id = "theory_qui_t02_s02",
                asignatura = "Química",
                semana = 2,
                titulo = "Fenómeno de Alotropía",
                resumen = "La alotropía es la propiedad exclusiva de ciertos elementos químicos de existir en el mismo estado físico con dos o más formas moleculares o estructuras cristalinas distintas, exhibiendo propiedades físicas y químicas diferentes.\n\n• Elementos Alotrópicos Principales:\n1. Carbono (C):\n   - Diamante: Estructura cristalina tetraédrica (hibridación sp³), material natural más duro (10 en escala Mohs), aislante eléctrico, transparente.\n   - Grafito: Capas hexagonales planas superpuestas (hibridación sp²), blando, lubricante sólido, excelente conductor eléctrico.\n   - Formas sintéticas: Fullerenos (C₆₀), nanotubos de carbono y grafeno (lámina monoatómica de alta resistencia mecánica y conductividad).\n2. Oxígeno (O):\n   - Oxígeno molecular o dioxígeno (O₂): Inodoro, incoloro, comburente indispensable para la respiración aerobia.\n   - Ozono (O₃): Gas azulado de olor picante, fuerte agente oxidante, absorbe la radiación ultravioleta nociva en la estratosfera.\n3. Fósforo (P):\n   - Fósforo blanco (P₄): Tetraédrico, extremadamente reactivo, pirofórico (arde espontáneamente al aire), venenoso.\n   - Fósforo rojo (P_n): Polímero amorfo no venenoso, más estable, usado en fósforos de seguridad.\n4. Azufre (S): Azufre rómbico (S_α) y monoclínico (S_β), ambos formados por anillos en corona S₈.",
                conceptosClave = listOf(
                    "Alotropía: un mismo elemento con estructuras distintas en el mismo estado físico",
                    "Carbono: Diamante (sp³, aislante, dureza 10) vs Grafito (sp², conductor de electricidad)",
                    "Oxígeno: O₂ (respiración) vs O₃ (ozono estratosférico)",
                    "Fósforo: P₄ blanco (tóxico, reactivo) vs P rojo (estable, cerillas)"
                ),
                formulas = listOf(
                    "\\text{Carbono}: \\; \\text{Diamante } (sp^3) \\; \\text{vs} \\; \\text{Grafito } (sp^2) \\; \\text{vs} \\; \\text{Grafeno}",
                    "\\text{Oxígeno}: \\; \\text{O}_2 \\; (\\text{dioxígeno}) \\; \\text{vs} \\; \\text{O}_3 \\; (\\text{ozono})"
                ),
                formulaName = "Formas Alotrópicas de Carbono y Oxígeno",
                formulaLatex = "\\text{C (diamante)} \\neq \\text{C (grafito)}, \\quad \\text{O}_2 \\neq \\text{O}_3",
                formulaDescription = "Polimorfismo estructural de sustancias simples en el mismo estado de agregación.",
                admissionTip = "El grafito conduce la electricidad gracias a que sus átomos con hibridación sp² dejan un electrón 'p' deslocalizado en forma de nubes π móviles entre las capas hexagonales.",
                admissionExplanation = "• No confundir alotropía (para elementos químicos simples) con polimorfismo (para compuestos químicos que presentan diferentes formas cristalinas, ej. CaCO₃ calcita vs aragonito)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El grafito y el diamante son formas alotrópicas del carbono. ¿Cuál de las siguientes afirmaciones describe correctamente su diferencia?",
                    options = listOf(
                        "El diamante es conductor eléctrico y el grafito es aislante",
                        "El diamante presenta hibridación sp³ en red tetraédrica y el grafito capas hexagonales sp²",
                        "El diamante está compuesto de carbono y el grafito de carbón fósil impuro",
                        "El grafito es más duro que el diamante según la escala de Mohs",
                        "Ambos poseen exactamente la misma estructura cristalina cúbica"
                    ),
                    correctIndex = 1,
                    explanation = "El diamante posee hibridación sp³ con geometría tetraédrica tridimensional (muy duro y aislante), mientras que el grafito posee láminas hexagonales planas con hibridación sp² (conductor).",
                    subject = "Química",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "qui_t02_s03",
            subjectId = "quimica",
            semana = 2,
            subtema = "2.3 Estados de Agregación y Cambios de Fase",
            title = "Estados de la Materia y Cambios de Fase",
            theory = LessonTheory(
                id = "theory_qui_t02_s03",
                asignatura = "Química",
                semana = 2,
                titulo = "Estados de la Materia y Cambios de Fase",
                resumen = "• Fuerzas Intermoleculares Determinantes:\n- Fuerzas de Cohesión o Atracción (F_a): Mantienen unidas a las moléculas.\n- Fuerzas de Repulsión (F_r): Asocian la agitación térmica y separación.\n\n• Tres Estados Fundamentales Clásicos:\n1. Sólido: F_a >> F_r. Forma y volumen definidos e invariables. Incompresibles. Movimiento molecular solo vibratorio.\n2. Líquido: F_a ≈ F_r. Volumen constante, pero forma variable (adopta la del recipiente). Prácticamente incompresibles. Movimiento de deslizamiento.\n3. Gaseoso: F_r >> F_a. Forma y volumen variables (se expanden indefinidamente). Altamente compresibles. Movimiento caótico al azar.\n4. Plasma: Gas fuertemente ionizado a temperaturas extremas (iones + electrones libres). Es el estado más abundante del universo visible (Sol, estrellas, auroras boreales).\n\n• Cambios de Fase (Procesos Físicos Reversibles):\n- Fusión: Sólido a Líquido (endotérmico: absorbe calor).\n- Solidificación: Líquido a Sólido (exotérmico: libera calor).\n- Vaporización / Ebullición: Líquido a Gas (endotérmico).\n- Condensación / Licuación: Gas o Vapor a Líquido (exotérmico).\n- Sublimación Progresiva (Directa): Sólido a Gas sin pasar por líquido (endotérmico: hielo seco CO₂, yodo I₂, naftalina).\n- Sublimación Regresiva (Inversa o Deposición): Gas a Sólido (exotérmico).",
                conceptosClave = listOf(
                    "Balance de fuerzas: Sólido (F_a >> F_r), Líquido (F_a ≈ F_r), Gas (F_r >> F_a)",
                    "Plasma: gas ionizado a altas temperaturas, el más abundante del universo",
                    "Cambios endotérmicos (absorben calor: fusión, vaporización, sublimación)",
                    "Sustancias con sublimación directa a temperatura ambiente: Hielo seco (CO₂), Yodo (I₂), Naftalina"
                ),
                formulas = listOf(
                    "\\text{Endotérmicos (ganan calor)}: \\; \\text{Sólido} \\xrightarrow{\\text{Fusión}} \\text{Líquido} \\xrightarrow{\\text{Vaporización}} \\text{Gas}",
                    "\\text{Sublimación Directa}: \\; \\text{Sólido} \\to \\text{Gas} \\quad (\\text{CO}_2, \\text{I}_2, \\text{Naftalina})"
                ),
                formulaName = "Ciclo Termodinámico de Cambios de Fase",
                formulaLatex = "\\text{Sólido} \\underset{\\text{Solidif.}}{\\overset{\\text{Fusión}}{\\rightleftharpoons}} \\text{Líquido} \\underset{\\text{Condens.}}{\\overset{\\text{Vaporiz.}}{\\rightleftharpoons}} \\text{Gas}",
                formulaDescription = "Transiciones físicas de estado regidas por temperatura y presión externa.",
                admissionTip = "Diferencia entre condensación y licuación: Se condensa un VAPOR (sustancia que a temperatura ambiente es líquida, ej. vapor de agua); se licúa un GAS real (sustancia que a temperatura ambiente es gas, ej. licuar oxígeno o nitrógeno por enfriamiento y compresión).",
                admissionExplanation = "• Durante cualquier cambio de fase de una sustancia pura, la temperatura permanece rigurosamente CONSTANTE mientras coexisten las dos fases."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El paso directo del estado sólido al gaseoso sin transitar por el estado líquido (como ocurre con el hielo seco o la naftalina) se denomina:",
                    options = listOf("Evaporación", "Sublimación directa", "Condensación", "Licuación", "Fusión"),
                    correctIndex = 1,
                    explanation = "La sublimación directa o progresiva es el cambio de sólido a gas sin pasar por el estado líquido intermedio.",
                    subject = "Química",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "qui_t02_s04",
            subjectId = "quimica",
            semana = 2,
            subtema = "2.4 Fenómenos Físicos, Químicos y Nucleares",
            title = "Fenómenos de Transformación de la Materia",
            theory = LessonTheory(
                id = "theory_qui_t02_s04",
                asignatura = "Química",
                semana = 2,
                titulo = "Fenómenos de Transformación de la Materia",
                resumen = "• Fenómeno Físico:\nTransformación reversible que NO altera la naturaleza íntima, estructura molecular ni enlaces químicos de la materia. Las sustancias iniciales siguen siendo las mismas después del cambio.\nEjemplos: Todos los cambios de estado (hervir agua, fundir cera), disolución de azúcar en agua, cortar papel, doblar un alambre, destilación.\n\n• Fenómeno Químico (Reacción Química):\nTransformación irreversible por métodos físicos que altera la composición íntima y enlaces de las sustancias, rompiendo enlaces y formando nuevas especies químicas con propiedades totalmente distintas.\nEjemplos: Combustión de gasolina, oxidación de un clavo de hierro, digestión de alimentos, fermentación de la chicha de jora, fotosíntesis, neutralización de un ácido.\n\n• Fenómeno Nuclear:\nAlteración profunda de los núcleos atómicos que modifica el número de protones y neutrones (transmutación de elementos), liberando gigantescas cantidades de energía según la ecuación de Einstein (E = mc²).\nEjemplos: Fisión nuclear del Uranio-235 en centrales nucleares y Fusión nuclear de núcleos de hidrógeno en el Sol.",
                conceptosClave = listOf(
                    "Fenómeno físico: no altera la composición química ni forma nuevas sustancias",
                    "Fenómeno químico: ruptura y formación de nuevos enlaces químicos con nuevas propiedades",
                    "Fenómeno nuclear: transmutación de elementos atómicos con enorme liberación de energía (E = mc²)"
                ),
                formulas = listOf(
                    "\\text{Fenómeno Químico}: \\; \\text{Reactivos} \\to \\text{Productos} \\quad (\\Delta H_{\\text{reacción}})",
                    "\\text{Fenómeno Nuclear (Einstein)}: \\; E = \\Delta m \\cdot c^2"
                ),
                formulaName = "Clasificación de Fenómenos Materiales",
                formulaLatex = "\\text{Físico (sin cambio de fórmula)} \\; \\text{vs} \\; \\text{Químico (nuevas fórmulas)} \\; \\text{vs} \\; \\text{Nuclear (nuevos núcleos)}",
                formulaDescription = "Niveles de alteración estructural de la materia: molecular, intramolecular y nuclear.",
                admissionTip = "La 'disolución de sal en agua' es un fenómeno FÍSICO porque al evaporar el agua se recupera íntegramente la sal sólida; pero la 'electrólisis del agua salada' es un fenómeno QUÍMICO porque destruye el agua generando H₂ y Cl₂.",
                admissionExplanation = "• Toda combustión es un fenómeno químico exotérmico irreversible: la madera quemada produce cenizas, CO₂ y vapor de agua, siendo imposible revertirla por métodos mecánicos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes procesos representa un fenómeno químico?",
                    options = listOf(
                        "Evaporación del alcohol medicinal",
                        "Trituración de una tableta de aspirina",
                        "Oxidación de una manzana expuesta al aire",
                        "Sublimación del yodo sólido",
                        "Fundición de lingotes de oro"
                    ),
                    correctIndex = 2,
                    explanation = "La oxidación de la manzana es una reacción bioquímica (fenómeno químico) donde las enzimas polifenol oxidasas reaccionan con el oxígeno del aire formando nuevas sustancias oscuras.",
                    subject = "Química",
                    semana = 2
                )
            )
        ),

        // ==========================================
        // SEMANA 3: ESTRUCTURA ATÓMICA Y NÚCLIDOS
        // ==========================================
        LessonNode(
            id = "qui_t03_s01",
            subjectId = "quimica",
            semana = 3,
            subtema = "3.1 Partículas Subatómicas Fundamentales y Estructura Nuclear",
            title = "Partículas Subatómicas Fundamentales",
            theory = LessonTheory(
                id = "theory_qui_t03_s01",
                asignatura = "Química",
                semana = 3,
                titulo = "Partículas Subatómicas Fundamentales",
                resumen = "El átomo moderno es un sistema energético en equilibrio dinámico constituido por dos regiones:\n\n1. Núcleo Atómico Central:\nConcentra más del 99.9% de la masa del átomo en un volumen diminuto (carga positiva). Contiene nucleones fundamentales:\n- Protones (p⁺): Descubiertos por Ernest Rutherford (1919). Carga relativa +1 (q = +1.6 × 10⁻¹⁹ C), masa m_p = 1.672 × 10⁻²⁷ kg.\n- Neutrones (n⁰): Descubiertos por James Chadwick (1932). Carga neutra 0, masa m_n = 1.675 × 10⁻²⁷ kg.\nRelación de masas: m_neutrón > m_protón >> m_electrón (el neutrón es la partícula fundamental más pesada).\n\n2. Zona Extranuclear o Nube Electrónica:\nEspacio inmenso que rodea al núcleo donde los electrones se mueven en orbitales:\n- Electrones (e⁻): Descubiertos por J.J. Thomson (1897). Carga relativa -1 (q = -1.6 × 10⁻¹⁹ C), masa m_e = 9.11 × 10⁻³¹ kg (aproximadamente 1836 veces más liviano que el protón). Determina el volumen y las propiedades químicas del átomo.",
                conceptosClave = listOf(
                    "Núcleo (alta densidad, carga positiva, casi toda la masa) vs Nube electrónica (volumen atómico)",
                    "Descubridores clave: Electrón (Thomson), Protón (Rutherford), Neutrón (Chadwick)",
                    "Orden de masas: masa(neutrón) > masa(protón) >> masa(electrón)"
                ),
                formulas = listOf(
                    "m_n > m_p \\gg m_e \\quad (m_p \\approx 1836 \\cdot m_e)",
                    "q_{e^-} = -1.6 \\times 10^{-19} \\text{ C}, \\quad q_{p^+} = +1.6 \\times 10^{-19} \\text{ C}"
                ),
                formulaName = "Partículas Subatómicas Fundamentales",
                formulaLatex = "\\text{Átomo} = \\text{Núcleo } (p^+, n^0) + \\text{Nube Electrónica } (e^-)",
                formulaDescription = "Componentes constitutivos elementales del sistema atómico neutro e ionizado.",
                admissionTip = "¡Pregunta frecuente en la UNSA! La partícula subatómica fundamental con mayor masa es el NEUTRÓN, y la más liviana es el ELECTRÓN.",
                admissionExplanation = "• Si el núcleo atómico tuviera el tamaño de una canica en el centro de un estadio de fútbol, la nube electrónica abarcaría las tribunas más altas (el átomo es casi puro espacio vacío)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De las tres partículas subatómicas fundamentales (protón, neutrón y electrón), la que posee mayor masa inercial y carece de carga eléctrica neta es el:",
                    options = listOf("Protón", "Neutrón", "Electrón", "Positrón", "Mesón"),
                    correctIndex = 1,
                    explanation = "El neutrón es la partícula fundamental más pesada (m_n = 1.675 × 10⁻²⁷ kg) y su carga eléctrica neta es estrictamente cero.",
                    subject = "Química",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "qui_t03_s02",
            subjectId = "quimica",
            semana = 3,
            subtema = "3.2 Notación de Núclidos, Número Atómico (Z) y Número de Masa (A)",
            title = "Notación Nuclear de Núclidos (A, Z, q)",
            theory = LessonTheory(
                id = "theory_qui_t03_s02",
                asignatura = "Química",
                semana = 3,
                titulo = "Notación Nuclear de Núclidos (A, Z, q)",
                resumen = "• Representación Estándar de un Núclido: ᴬ_Z E^q\n\n1. Número Atómico o Carga Nuclear (Z):\nIndica la cantidad de protones en el núcleo. Es el DNI químico del elemento (identifica al elemento en la Tabla Periódica):\nZ = #p⁺\n\n2. Número de Masa o Número Másico (A):\nIndica la cantidad total de nucleones fundamentales (protones + neutrones) en el núcleo:\nA = Z + n⁰  =>  n⁰ = A - Z\n\n3. Átomo Neutro (q = 0):\nNo posee carga neta, el número de protones es igual al de electrones:\n#p⁺ = #e⁻ = Z  (regla mnemotécnica: 'PEZZ').\n\n4. Iones (Átomos con carga eléctrica neta q):\n- Catión (+q): El átomo PIERDE electrones. #e⁻ = Z - q.\n- Anión (-q): El átomo GANA electrones. #e⁻ = Z + q.",
                conceptosClave = listOf(
                    "Fórmula del número de masa: A = Z + n (A = nucleones fundamentales)",
                    "Número atómico Z = número de protones (identidad del elemento químico)",
                    "Átomo neutro: #p = #e = Z ('PEZZ')",
                    "Iones: Catión (pierde electrones: #e = Z - q) vs Anión (gana electrones: #e = Z + |q|)"
                ),
                formulas = listOf(
                    "A = Z + n^0 \\implies n^0 = A - Z",
                    "\\text{Átomo neutro}: \\; #p^+ = #e^- = Z",
                    "\\text{Ión}: \\; #e^- = Z - q"
                ),
                formulaName = "Relaciones Fundamentales del Núclido",
                formulaLatex = "A = Z + n, \\quad #e^- = Z - (\\pm q)",
                formulaDescription = "Cuantificación de nucleones y electrones periféricos en especies neutras e iónicas.",
                admissionTip = "Cuando un átomo se ioniza, NUNCA cambia su número atómico Z ni su número de neutrones; lo ÚNICO que gana o pierde son ELECTRONES en su capa externa.",
                admissionExplanation = "• Ejemplo: El anión sulfuro ³²₁₆S²⁻ tiene Z = 16 protones, n = 32 - 16 = 16 neutrones y #e⁻ = 16 - (-2) = 18 electrones."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El ion hierro ⁵⁶₂₆Fe³⁺ posee respectivamente el siguiente número de protones, neutrones y electrones:",
                    options = listOf(
                        "26 p⁺, 30 n⁰, 26 e⁻",
                        "26 p⁺, 30 n⁰, 23 e⁻",
                        "26 p⁺, 56 n⁰, 23 e⁻",
                        "29 p⁺, 30 n⁰, 26 e⁻",
                        "26 p⁺, 26 n⁰, 23 e⁻"
                    ),
                    correctIndex = 1,
                    explanation = "Z = 26 protones; n⁰ = A - Z = 56 - 26 = 30 neutrones; como es catión trivalente (+3), perdió 3 electrones: #e⁻ = 26 - 3 = 23 electrones.",
                    subject = "Química",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "qui_t03_s03",
            subjectId = "qui_t03_s03",
            semana = 3,
            subtema = "3.3 Tipos de Núclidos: Isótopos, Isóbaros, Isótonos e Isoelectrónicos",
            title = "Familias de Núclidos: Isótopos, Isóbaros e Isótonos",
            theory = LessonTheory(
                id = "theory_qui_t03_s03",
                asignatura = "Química",
                semana = 3,
                titulo = "Familias de Núclidos: Isótopos, Isóbaros e Isótonos",
                resumen = "• Isótopos o Hítopos (Igual Z, igual número de protones):\nÁtomos del MISMO elemento químico con igual número atómico Z pero diferente número de masa A (diferente número de neutrones).\n- Tienen propiedades químicas IDÉNTICAS (mismo Z y configuración electrónica) y propiedades físicas distintas (diferente masa).\n- Isótopos del Hidrógeno:\n  1. Protio (¹₁H): 1 p⁺, 0 n⁰ (isótopo más abundante, 99.98%). Forma el agua común.\n  2. Deuterio (²₁H o D): 1 p⁺, 1 n⁰. Forma el agua pesada (D₂O) usada como moderador nuclear.\n  3. Tritio (³₁H o T): 1 p⁺, 2 n⁰. Isótopo radiactivo artificial.\n\n• Isóbaros (Igual A):\nÁtomos de ELEMENTOS DIFERENTES con igual número de masa (A₁ = A₂), pero diferente Z y diferente n⁰ (ej. ⁴⁰₁₉K y ⁴⁰₂₀Ca). Propiedades físicas y químicas diferentes.\n\n• Isótonos (Igual n⁰):\nÁtomos de ELEMENTOS DIFERENTES con igual número de neutrones: A₁ - Z₁ = A₂ - Z₂ (ej. ¹¹₅B y ¹²₆C, ambos con 6 neutrones).\n\n• Especies Isoelectrónicas:\nÁtomos o iones distintos que poseen la MISMA cantidad de electrones e idéntica configuración electrónica (ej. ₁₀Ne, ₁₁Na⁺, ₉F⁻, todos con 10 electrones).",
                conceptosClave = listOf(
                    "Isótopos: igual Z (mismo elemento, propiedades químicas iguales)",
                    "Isóbaros: igual A (número másico idéntico)",
                    "Isótonos: igual n (mismo número de neutrones)",
                    "Isoelectrónicos: misma cantidad de electrones e igual configuración electrónica"
                ),
                formulas = listOf(
                    "\\text{Isótopos}: Z_1 = Z_2, \\; A_1 \\neq A_2 \\quad (\\text{Protio } ^1_1\\text{H}, \\; \\text{Deuterio } ^2_1\\text{H}, \\; \\text{Tritio } ^3_1\\text{H})",
                    "\\text{Isóbaros}: A_1 = A_2, \\quad \\text{Isótonos}: n_1^0 = n_2^0",
                    "\\text{Isoelectrónicos}: #e_1^- = #e_2^-"
                ),
                formulaName = "Clasificación de Especies Nucleares",
                formulaLatex = "\\text{Isóto}\\mathbf{p}\\text{os } (p^+), \\quad \\text{Isó}\\mathbf{b}\\text{aros } (A), \\quad \\text{Isóto}\\mathbf{n}\\text{os } (n^0)",
                formulaDescription = "Relaciones comparativas de nucleones y electrones entre núclidos.",
                admissionTip = "Regla mnemotécnica de admisión:\n- IsótoPos -> igual P (protones Z)\n- IsóBaros -> igual A (masa A)\n- IsótoNos -> igual N (neutrones n)\n- Isoelectrónicos -> igual Electrones.",
                admissionExplanation = "• El deuterio (²₁H) es el único átomo en la naturaleza que tiene un protón y un neutrón; el protio (¹₁H) es el único átomo que carece de neutrones."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos núclidos que pertenecen a elementos químicos diferentes pero presentan el mismo número de masa atómica 'A' se denominan:",
                    options = listOf("Isótopos", "Isóbaros", "Isótonos", "Alótropos", "Isoelectrónicos"),
                    correctIndex = 1,
                    explanation = "Los isóbaros son núclidos de distintos elementos que comparten idéntico número de masa total A.",
                    subject = "Química",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "qui_t03_s04",
            subjectId = "qui_t03_s04",
            semana = 3,
            subtema = "3.4 Modelos Atómicos: De Dalton a la Mecánica Cuántica",
            title = "Evolución Histórica de los Modelos Atómicos",
            theory = LessonTheory(
                id = "theory_qui_t03_s04",
                asignatura = "Química",
                semana = 3,
                titulo = "Evolución Histórica de los Modelos Atómicos",
                resumen = "• John Dalton (1808):\nPrimer modelo científico. Átomo como esfera maciza, indivisible, indestructible y homogénea (bola de billar).\n\n• J.J. Thomson (1904):\nDescubre el electrón con tubos de rayos catódicos. Modelo del 'Budín con pasas': esfera maciza de carga positiva con electrones negativos incrustados.\n\n• Ernest Rutherford (1911):\nExperimento de la lámina de oro bombardeada con partículas alfa (⁴₂He²⁺). Descubre el núcleo atómico: la mayoría de partículas atraviesan sin desviarse (el átomo es casi vacío) y unas pocas rebotan. Modelo planetario: electrones giran alrededor del núcleo diminuto positivo.\n\n• Niels Bohr (1913):\nAplica la teoría cuántica de Planck al átomo de hidrógeno:\n- Los electrones giran en órbitas circulares estacionarias permitidas sin emitir energía.\n- Al saltar de un nivel superior a uno inferior, emite un fotón: E_fotón = h · f = E_superior - E_inferior.\n\n• Arnold Sommerfeld (1916): Introduce órbitas elípticas y subniveles de energía.\n\n• Modelo Mecánico-Cuántico Actual (Schrödinger, De Broglie, Heisenberg):\nEl electrón posee dualidad onda-partícula (De Broglie) y es imposible conocer simultáneamente su posición y velocidad (Principio de Incertidumbre de Heisenberg). El electrón se describe probabilísticamente en ORBITALES o REEMPE (Región Espacio-Energética de Mayor Probabilidad Electrónica).",
                conceptosClave = listOf(
                    "Dalton (esfera maciza indivisible) -> Thomson (budín de pasas con electrones)",
                    "Rutherford (núcleo atómico positivo y átomo mayoritariamente vacío)",
                    "Bohr (niveles cuantizados de energía y emisión de fotones en saltos cuánticos)",
                    "Modelo mecánico-cuántico: orbital atómico (REEMPE) y principio de incertidumbre de Heisenberg"
                ),
                formulas = listOf(
                    "E_{\\text{fotón}} = h \\cdot f = E_2 - E_1 \\quad (\\text{Postulado de Bohr})",
                    "\\Delta x \\cdot \\Delta p \\ge \\frac{h}{4\\pi} \\quad (\\text{Incertidumbre de Heisenberg})"
                ),
                formulaName = "Evolución de Modelos Atómicos",
                formulaLatex = "\\text{Dalton} \\to \\text{Thomson} \\to \\text{Rutherford} \\to \\text{Bohr} \\to \\text{Schrödinger (REEMPE)}",
                formulaDescription = "Cronología teórica del entendimiento de la estructura submicroscópica atómica.",
                admissionTip = "Un 'orbital' NO es una trayectoria definida o camino prefijado (eso era la órbita de Bohr); un orbital es una ZONA DE PROBABILIDAD espacial del 90-95% donde es más probable encontrar al electrón.",
                admissionExplanation = "• En el experimento de Rutherford, el hecho de que 1 de cada 20 000 partículas alfa rebotara demostró que la masa y la carga positiva estaban concentradas en un punto central microscópico: el núcleo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El físico que demostró experimentalmente la existencia del núcleo atómico central de carga positiva al bombardear una delgada lámina de oro con partículas alfa fue:",
                    options = listOf("John Dalton", "J.J. Thomson", "Ernest Rutherford", "Niels Bohr", "Erwin Schrödinger"),
                    correctIndex = 2,
                    explanation = "Ernest Rutherford descubrió en 1911 el núcleo atómico tras su célebre experimento de dispersión de partículas alfa en láminas de oro.",
                    subject = "Química",
                    semana = 3
                )
            )
        ),

        // ==========================================
        // SEMANA 4: ESTRUCTURA ELECTRÓNICA
        // ==========================================
        LessonNode(
            id = "qui_t04_s01",
            subjectId = "quimica",
            semana = 4,
            subtema = "4.1 Los Cuatro Números Cuánticos (n, l, m_l, m_s)",
            title = "Números Cuánticos y Orbitales Atómicos",
            theory = LessonTheory(
                id = "theory_qui_t04_s01",
                asignatura = "Química",
                semana = 4,
                titulo = "Números Cuánticos y Orbitales Atómicos",
                resumen = "Los cuatro números cuánticos describen de manera unívoca el estado energético y la ubicación probable del electrón en el átomo:\n\n1. Número Cuántico Principal (n):\nIndica el nivel de energía del electrón y el tamaño o volumen del orbital. Valores: n = 1, 2, 3, 4, 5, 6, 7... (capas K, L, M, N, O, P, Q).\n- Capacidad máxima de electrones por nivel: #e_max = 2n².\n\n2. Número Cuántico Secundario o Azimutal (l):\nIndica el subnivel de energía y la forma geométrica del orbital. Valores: l = 0, 1, 2, ... (n - 1).\n- l = 0 -> Subnivel 's' (sharp): Forma esférica (1 orbital, máx 2 e⁻).\n- l = 1 -> Subnivel 'p' (principal): Forma dilobular (3 orbitales, máx 6 e⁻).\n- l = 2 -> Subnivel 'd' (diffuse): Forma tetralobular (5 orbitales, máx 10 e⁻).\n- l = 3 -> Subnivel 'f' (fundamental): Forma compleja/octalobular (7 orbitales, máx 14 e⁻).\n(Regla mnemotécnica: 'Sopa De Fideos' -> l = 0, 1, 2, 3).\n\n3. Número Cuántico Magnético (m_l):\nIndica la orientación espacial del orbital en presencia de un campo magnético. Valores: m_l = -l, ..., 0, ..., +l (total de orbitales = 2l + 1).\n\n4. Número Cuántico de Espín Magnético (m_s):\nIndica el sentido de giro intrínseco del electrón sobre su propio eje. Valores: +1/2 (flecha hacia arriba ↑) o -1/2 (flecha hacia abajo ↓).",
                conceptosClave = listOf(
                    "Principal (n): nivel de energía y tamaño del orbital (1, 2, 3...)",
                    "Secundario (l): subnivel y forma geométrica: s (0, esférico), p (1, dilobular), d (2), f (3)",
                    "Magnético (m_l): orientación espacial del orbital (-l a +l)",
                    "Espín (m_s): sentido de giro magnético del electrón (+1/2 o -1/2)"
                ),
                formulas = listOf(
                    "\\#e^-_{\\text{máx por nivel}} = 2n^2, \\quad \\#\\text{orbitales por nivel} = n^2",
                    "l \\in \\{0, 1, 2, \\dots, n-1\\}, \\quad m_l \\in \\{-l, \\dots, 0, \\dots, +l\\}, \\quad m_s = \\pm 1/2"
                ),
                formulaName = "Juego de Cuatro Números Cuánticos",
                formulaLatex = "(n, l, m_l, m_s) \\quad \\text{con } l < n, \\; |m_l| \\le l",
                formulaDescription = "Soluciones matemáticas de la ecuación de onda de Schrödinger para el electrón.",
                admissionTip = "Para verificar si un juego de números cuánticos es VÁLIDO: siempre se debe cumplir estrictamente que l < n, y que m_l esté entre -l y +l. Por ejemplo, (3, 3, 0, +1/2) es INVÁLIDO porque l no puede ser igual a n.",
                admissionExplanation = "• Cada orbital individual puede albergar como máximo 2 electrones con espines opuestos o antiparalelos (Principio de Exclusión de Pauli)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes juegos de números cuánticos (n, l, m_l, m_s) es totalmente INVÁLIDO para un electrón?",
                    options = listOf(
                        "(3, 2, -1, +1/2)",
                        "(4, 0, 0, -1/2)",
                        "(2, 2, 0, +1/2)",
                        "(3, 1, +1, -1/2)",
                        "(5, 3, -2, +1/2)"
                    ),
                    correctIndex = 2,
                    explanation = "El juego (2, 2, 0, +1/2) es inválido porque el número cuántico secundario 'l' debe ser estrictamente menor que 'n' (l ≤ n - 1; para n = 2, 'l' solo puede ser 0 o 1, jamás 2).",
                    subject = "Química",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "qui_t04_s02",
            subjectId = "qui_t04_s02",
            semana = 4,
            subtema = "4.2 Principios de la Configuración Electrónica: Aufbau, Pauli y Hund",
            title = "Reglas de la Configuración Electrónica",
            theory = LessonTheory(
                id = "theory_qui_t04_s02",
                asignatura = "Química",
                semana = 4,
                titulo = "Reglas de la Configuración Electrónica",
                resumen = "La distribución de los electrones en los orbitales sigue tres principios rigurosos:\n\n1. Principio de Mínima Energía o Aufbau (Construcción):\nLos electrones se llenan progresivamente en orden creciente de su Energía Relativa (E_R):\nE_R = n + l\n- A menor E_R, mayor estabilidad (se llena primero).\n- Si dos subniveles tienen igual E_R (subniveles degenerados), se llena primero el que tiene MENOR 'n'.\n\n2. Principio de Exclusión de Wolfgang Pauli (1925):\nEn un mismo átomo no pueden existir dos electrones con los cuatro números cuánticos idénticos. Deben diferir al menos en el número cuántico de espín (m_s).\n- Consecuencia: En un orbital entran como máximo 2 electrones con espines apareados (↑↓).\n\n3. Regla de Máxima Multiplicidad de Friedrich Hund:\nAl llenar orbitales de igual energía (subniveles p, d o f), los electrones se distribuyen primero desapareados con espines paralelos (↑ ↑ ↑), y solo se aparean (↓) cuando todos los orbitales contienen al menos un electrón.",
                conceptosClave = listOf(
                    "Principio de Aufbau: llenado por energía relativa creciente (E_R = n + l)",
                    "Principio de Pauli: máximo 2 electrones por orbital con espines opuestos (↑↓)",
                    "Regla de Hund: llenado semiocupado de espines paralelos antes del apareamiento"
                ),
                formulas = listOf(
                    "E_R = n + l \\quad (\\text{Energía Relativa})",
                    "\\text{Si } E_R(A) = E_R(B) \\implies \\text{mayor estabilidad al menor } n"
                ),
                formulaName = "Energía Relativa de Subniveles",
                formulaLatex = "E_R = n + l, \\quad \\text{Orden: } 1s < 2s < 2p < 3s < 3p < 4s < 3d",
                formulaDescription = "Secuencia energética termodinámica de ocupación de capas electrónicas.",
                admissionTip = "Observa que el subnivel 4s (E_R = 4 + 0 = 4) tiene menor energía que el subnivel 3d (E_R = 3 + 2 = 5); por eso el 4s se llena ANTES que el 3d.",
                admissionExplanation = "• Un átomo con electrones desapareados es paramagnético (atraído débilmente por campos magnéticos); si todos sus electrones están apareados en pares es diamagnético (repelido débilmente)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El principio que establece que en un átomo no pueden existir dos electrones con sus cuatro números cuánticos exactamente idénticos corresponde a:",
                    options = listOf(
                        "Principio de Aufbau",
                        "Regla de Hund",
                        "Principio de Exclusión de Pauli",
                        "Principio de Incertidumbre de Heisenberg",
                        "Ley de Conservación de la Masa"
                    ),
                    correctIndex = 2,
                    explanation = "El Principio de Exclusión de Pauli prohíbe que dos electrones compartan los cuatro números cuánticos, limitando a dos electrones por orbital con espines opuestos.",
                    subject = "Química",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "qui_t04_s03",
            subjectId = "qui_t04_s03",
            semana = 4,
            subtema = "4.3 Regla del Serrucho y Configuración Simplificada (Kernel)",
            title = "Regla del Serrucho y Notación Kernel",
            theory = LessonTheory(
                id = "theory_qui_t04_s03",
                asignatura = "Química",
                semana = 4,
                titulo = "Regla del Serrucho y Notación Kernel",
                resumen = "• Regla de Moller o del Serrucho (Secuencia de Llenado):\n1s² 2s² 2p⁶ 3s² 3p⁶ 4s² 3d¹⁰ 4p⁶ 5s² 4d¹⁰ 5p⁶ 6s² 4f¹⁴ 5d¹⁰ 6p⁶ 7s² 5f¹⁴ 6d¹⁰ 7p⁶\n- Frase mnemotécnica clásica: 'Sí, Sopa, Sopa, Se Da Pensión, Se Da Pensión, Se Fue De Paseo, Se Fue De Paseo'.\n\n• Notación Abreviada de Kernel (Gases Nobles):\nSe reemplaza la configuración interna por el símbolo del gas noble precedente:\n- [₂He]: 1s²\n- [₁₀Ne]: 1s² 2s² 2p⁶\n- [₁₈Ar]: 1s² 2s² 2p⁶ 3s² 3p⁶\n- [₃₆Kr]: ... 4p⁶\n- [₅₄Xe]: ... 5p⁶\n- [₈₆Rn]: ... 6p⁶\n\nEjemplo: Sodio (₁₁Na) -> 1s² 2s² 2p⁶ 3s¹  =>  [₁₀Ne] 3s¹.\n• Electrones de Valencia: Electrones ubicados en el nivel de energía más externo (último nivel). En el sodio hay 1 electrón de valencia.",
                conceptosClave = listOf(
                    "Secuencia del serrucho: 1s 2s 2p 3s 3p 4s 3d 4p 5s 4d 5p 6s 4f 5d 6p 7s 5f 6d 7p",
                    "Kernel de gases nobles: [He]=2, [Ne]=10, [Ar]=18, [Kr]=36, [Xe]=54, [Rn]=86",
                    "Electrones de valencia: electrones del nivel más alto, responsables de los enlaces químicos"
                ),
                formulas = listOf(
                    "\\text{Kernel}: \\; [_{18}\\text{Ar}] 4s^2 3d^{10} 4p^x \\quad (\\text{para } Z = 19 \\text{ a } 36)"
                ),
                formulaName = "Configuración Electrónica por Kernel",
                formulaLatex = "1s^2 \\; 2s^2 \\; 2p^6 \\; 3s^2 \\; 3p^6 \\; 4s^2 \\; 3d^{10} \\dots",
                formulaDescription = "Esquema secuencial de llenado de orbitales atómicos multielectrónicos.",
                admissionTip = "Para hallar los electrones de valencia, busca el número de nivel MÁS ALTO (mayor n). En [Ar] 4s² 3d¹⁰ 4p³, el nivel mayor es n = 4, con 2 + 3 = 5 electrones de valencia.",
                admissionExplanation = "• Los electrones del subnivel 'd' o 'f' que están completamente llenos e internos no se consideran de valencia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La configuración electrónica abreviada por Kernel para el átomo de cloro (Z = 17) es:",
                    options = listOf(
                        "[₁₀Ne] 3s² 3p⁵",
                        "[₁₀Ne] 3s¹ 3p⁶",
                        "[₁₈Ar] 4s² 3d⁵",
                        "[₂He] 2s² 2p⁶ 3s⁷",
                        "[₁₀Ne] 3s² 3p⁴"
                    ),
                    correctIndex = 0,
                    explanation = "Z = 17: Se usa el gas noble anterior [₁₀Ne] (10 electrones), completando con 3s² 3p⁵ (10 + 2 + 5 = 17 electrones).",
                    subject = "Química",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "qui_t04_s04",
            subjectId = "qui_t04_s04",
            semana = 4,
            subtema = "4.4 Configuraciones Anómalas (Antisarrucho) y Configuración de Iones",
            title = "Excepciones Antisarrucho e Iones",
            theory = LessonTheory(
                id = "theory_qui_t04_s04",
                asignatura = "Química",
                semana = 4,
                titulo = "Excepciones Antisarrucho e Iones",
                resumen = "• Anomalías del Serrucho (Casos Antisarrucho):\nLos subniveles 'd' con 4 o 9 electrones (d⁴ y d⁹) son inestables. Para adquirir mayor estabilidad cuántica por simetría de orbitales semillenos o llenos, un electrón del subnivel 's' salta al subnivel 'd':\n- Caso d⁴ -> d⁵:\n  s² d⁴  =>  s¹ d⁵  (Estabilidad por orbitales semillenos).\n  Ejemplo: Cromo (₂₄Cr): [₁₈Ar] 4s¹ 3d⁵  (NO 4s² 3d⁴).\n  También Molibdeno (₄₂Mo): [₃₆Kr] 5s¹ 4d⁵.\n- Caso d⁹ -> d¹⁰:\n  s² d⁹  =>  s¹ d¹⁰  (Estabilidad por orbitales completamente llenos).\n  Ejemplo: Cobre (₂₉Cu): [₁₈Ar] 4s¹ 3d¹⁰  (NO 4s² 3d⁹).\n  También Plata (₄₇Ag): [₃₆Kr] 5s¹ 4d¹⁰; Oro (₇₉Au): [₅₄Xe] 6s¹ 4f¹⁴ 5d¹⁰.\n\n• Configuración Electrónica de Iones:\n1. Para Aniones (A⁻ⁿ): Se suman los electrones ganados al número atómico y se configura normalmente: #e⁻ = Z + n.\n2. Para Cationes (C⁺ⁿ): ¡REGLA DE ORO DE ADMISIÓN! Primero se hace la configuración del átomo NEUTRO (Z), y luego se retiran los electrones del NIVEL MÁS EXTERNO (mayor n), no del último subnivel escrito.",
                conceptosClave = listOf(
                    "Anomalía d⁴: s² d⁴ pasa a s¹ d⁵ (ejemplo: ₂₄Cr)",
                    "Anomalía d⁹: s² d⁹ pasa a s¹ d¹⁰ (ejemplo: ₂₉Cu, ₄₇Ag, ₇₉Au)",
                    "Configuración de cationes: los electrones perdidos salen SIEMPRE del nivel más externo (mayor n)"
                ),
                formulas = listOf(
                    "_{24}\\text{Cr}: [_{18}\\text{Ar}] 4s^1 3d^5 \\quad (\\text{Anomalía } d^4 \\to d^5)",
                    "_{29}\\text{Cu}: [_{18}\\text{Ar}] 4s^1 3d^{10} \\quad (\\text{Anomalía } d^9 \\to d^{10})"
                ),
                formulaName = "Regla de Estabilidad Cuántica Antisarrucho",
                formulaLatex = "s^2 d^4 \\to s^1 d^5, \\quad s^2 d^9 \\to s^1 d^{10}",
                formulaDescription = "Promoción electrónica para alcanzar simetría de subcapas semillenas o totalmente llenas.",
                admissionTip = "¡Trampa favorita de la UNSA! Para ₂₆Fe²⁺: el átomo neutro es [Ar] 4s² 3d⁶. Al perder 2 electrones, salen del nivel 4 (4s²), quedando [Ar] 3d⁶ (¡NO queda 4s² 3d⁴!).",
                admissionExplanation = "• Los elementos de los grupos 6 (VIB: Cr, Mo) y 11 (IB: Cu, Ag, Au) son los ejemplos prototípicos de estas excepciones de estabilidad."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La configuración electrónica correcta en el estado fundamental para el átomo de cobre (₂₉Cu) corresponde a:",
                    options = listOf(
                        "[₁₈Ar] 4s² 3d⁹",
                        "[₁₈Ar] 4s¹ 3d¹⁰",
                        "[₁₈Ar] 4s² 3d¹⁰",
                        "[₁₈Ar] 3d¹¹",
                        "[₁₀Ne] 3s² 3p⁶ 4s¹ 3d⁹"
                    ),
                    correctIndex = 1,
                    explanation = "Por la regla de estabilidad antisarrucho d⁹ -> d¹⁰, el cobre promueve un electrón del orbital 4s al 3d, resultando en [₁₈Ar] 4s¹ 3d¹⁰.",
                    subject = "Química",
                    semana = 4
                )
            )
        ),

        // ==========================================
        // SEMANA 5: TABLA PERIÓDICA MODERNA
        // ==========================================
        LessonNode(
            id = "qui_t05_s01",
            subjectId = "quimica",
            semana = 5,
            subtema = "5.1 Ley Periódica Moderna y Estructura (Períodos y Grupos)",
            title = "Ley Periódica y Organización de la Tabla",
            theory = LessonTheory(
                id = "theory_qui_t05_s01",
                asignatura = "Química",
                semana = 5,
                titulo = "Ley Periódica y Organización de la Tabla",
                resumen = "• Ley Periódica Moderna (Henry Moseley, 1913):\nLas propiedades físicas y químicas de los elementos químicos son funciones periódicas de sus NÚMEROS ATÓMICOS crecientes (Z), no de sus masas atómicas (corrigiendo la tabla de Dimitri Mendeléyev).\n- Diseñada en su forma larga actual por Alfred Werner.\n\n• Estructura General de la Tabla Periódica Moderna:\n1. 7 Períodos (Filas Horizontales):\nCorresponden al número de niveles de energía ocupados por los electrones (n = 1 al 7). Período = mayor nivel 'n'.\n- Período 1: 2 elementos (muy corto: H, He).\n- Períodos 2 y 3: 8 elementos (cortos).\n- Períodos 4 y 5: 18 elementos (largos).\n- Período 6: 32 elementos (muy largo, incluye lantánidos).\n- Período 7: incluye actínidos y elementos superpesados.\n\n2. 18 Columnas / 16 Grupos Tradicionales:\n- Elementos Representativos (Grupo A): Terminan su configuración en subniveles 's' o 'p'.\n- Elementos de Transición (Grupo B): Terminan en subnivel 'd'.\n- Transición Interna (Tierras Raras): Terminan en subnivel 'f' (Lantánidos y Actínidos).",
                conceptosClave = listOf(
                    "Ley de Moseley: ordenamiento según número atómico Z creciente mediante rayos X",
                    "7 períodos horizontales (igual al nivel cuántico máximo ocupado 'n')",
                    "18 columnas: Representativos (bloques s y p) y Transición (bloques d y f)"
                ),
                formulas = listOf(
                    "\\sqrt{\\nu} = a (Z - b) \\quad (\\text{Ley de Moseley para rayos X})",
                    "\\text{Período} = n_{\\text{máximo}}"
                ),
                formulaName = "Ley Periódica de Moseley",
                formulaLatex = "\\text{Propiedades} = f(Z \\text{ creciente})",
                formulaDescription = "Fundamento experimental de la periodicidad química basado en la carga nuclear.",
                admissionTip = "Mendeléyev ordenó su tabla por masas atómicas crecientes y dejó casilleros vacíos prediciendo elementos (eka-aluminio -> galio); Moseley demostró que la base real es el número de protones Z.",
                admissionExplanation = "• Todos los elementos de un mismo período tienen el mismo número de capas o niveles de energía electrónicos ocupados."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La Tabla Periódica moderna ordena a los elementos químicos en forma creciente de acuerdo a su:",
                    options = listOf("Masa atómica relativa", "Número atómico (Z)", "Número de neutrones", "Densidad", "Electronegatividad"),
                    correctIndex = 1,
                    explanation = "Henry Moseley demostró que las propiedades de los elementos dependen periódicamente de su número atómico creciente Z (número de protones).",
                    subject = "Química",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "qui_t05_s02",
            subjectId = "qui_t05_s02",
            semana = 5,
            subtema = "5.2 Familias Químicas Notables y Bloques s, p, d, f",
            title = "Familias Químicas y Bloques de la Tabla",
            theory = LessonTheory(
                id = "theory_qui_t05_s02",
                asignatura = "Química",
                semana = 5,
                titulo = "Familias Químicas y Bloques de la Tabla",
                resumen = "• Familias Notables del Grupo A (Representativos):\n- Grupo IA (ns¹): Metales Alcalinos (Li, Na, K, Rb, Cs, Fr). Muy reactivos, forman bases fuertes con agua desprendiendo H₂. (El H no es metal alcalino).\n- Grupo IIA (ns²): Metales Alcalinotérreos (Be, Mg, Ca, Sr, Ba, Ra).\n- Grupo IIIA (ns² np¹): Térreos o Boroides (B, Al, Ga, In, Tl).\n- Grupo IVA (ns² np²): Carbonoides (C, Si, Ge, Sn, Pb).\n- Grupo VA (ns² np³): Nitrogenoides (N, P, As, Sb, Bi).\n- Grupo VIA (ns² np⁴): Anfígenos o Calcógenos (O, S, Se, Te, Po). 'Formadores de minerales'.\n- Grupo VIIA (ns² np⁵): Halógenos (F, Cl, Br, I, At). 'Formadores de sales'. Muy electronegativos, no metales diatómicos.\n- Grupo VIIIA o 18 (ns² np⁶): Gases Nobles o Inertes (He, Ne, Ar, Kr, Xe, Rn). Octeto completo muy estable (salvo He con 2 e⁻).\n\n• Bloques Cuánticos:\n- Bloque s: Grupos IA y IIA (+ He).\n- Bloque p: Grupos IIIA al VIIIA.\n- Bloque d: Metales de transición (Grupos IB al VIIIB).\n- Bloque f: Tierras raras (Lantánidos 4f y Actínidos 5f).",
                conceptosClave = listOf(
                    "Alcalinos (IA: ns¹) y Alcalinotérreos (IIA: ns²)",
                    "Calcógenos/Anfígenos (VIA: ns² np⁴) y Halógenos (VIIA: ns² np⁵)",
                    "Gases Nobles (VIIIA: ns² np⁶, octeto cerrado de baja reactividad)",
                    "Bloques s, p, d, f según el último subnivel de su configuración electrónica"
                ),
                formulas = listOf(
                    "\\text{Grupo IA}: ns^1, \\quad \\text{Grupo VIIA}: ns^2 np^5, \\quad \\text{Grupo VIIIA}: ns^2 np^6"
                ),
                formulaName = "Configuración Terminal de Familias Representativas",
                formulaLatex = "\\text{Grupo A} = \\text{Número de electrones de valencia } (s + p)",
                formulaDescription = "Correlación entre configuración electrónica de valencia y grupo químico.",
                admissionTip = "El grupo VIIA son los HALÓGENOS (F, Cl, Br, I) y el grupo VIA son los ANFÍGENOS o calcógenos (O, S, Se, Te). ¡No los confundas en el examen!",
                admissionExplanation = "• Los metales alcalinos son tan reactivos con la humedad ambiental y el oxígeno que deben conservarse sumergidos en kerosene o aceite mineral."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El grupo de la tabla periódica conocido como la familia de los 'Halógenos' posee una configuración electrónica de valencia terminal de tipo:",
                    options = listOf("ns¹", "ns²", "ns² np³", "ns² np⁴", "ns² np⁵"),
                    correctIndex = 4,
                    explanation = "Los halógenos (Grupo VIIA o 17) poseen 7 electrones de valencia con terminación ns² np⁵.",
                    subject = "Química",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "qui_t05_s03",
            subjectId = "qui_t05_s03",
            semana = 5,
            subtema = "5.3 Ubicación de un Elemento en la Tabla Periódica por su Z",
            title = "Ubicación de Elementos en la Tabla Periódica",
            theory = LessonTheory(
                id = "theory_qui_t05_s03",
                asignatura = "Química",
                semana = 5,
                titulo = "Ubicación de Elementos en la Tabla Periódica",
                resumen = "Para determinar el período y grupo de un elemento conociendo su número atómico Z:\n\n1. Regla para el Período:\nPeríodo = Mayor nivel de energía 'n' en su configuración electrónica.\n\n2. Regla para el Grupo:\n- Elementos del Grupo A (terminan en s o p):\n  * Si termina en s^x => Grupo x A (ej. 4s¹ -> Grupo IA).\n  * Si termina en p^y => Grupo (2 + y) A (ej. 4s² 4p³ -> 2 + 3 = Grupo VA).\n\n- Elementos del Grupo B (terminan en d):\n  Se suma el subnivel 's' anterior + 'd': (s + d)\n  * Si s + d = 3 => Grupo IIIB\n  * Si s + d = 4 => Grupo IVB\n  * Si s + d = 5 => Grupo VB\n  * Si s + d = 6 => Grupo VIB\n  * Si s + d = 7 => Grupo VIIB\n  * Si s + d = 8, 9 o 10 => Grupo VIIIB (tríada ferromagnética: Fe, Co, Ni)\n  * Si s + d = 11 => Grupo IB (metales de acuñación: Cu, Ag, Au)\n  * Si s + d = 12 => Grupo IIB (elementos puente: Zn, Cd, Hg).",
                conceptosClave = listOf(
                    "Período = mayor 'n' de la configuración electrónica",
                    "Grupo A = electrones del último nivel (s + p)",
                    "Grupo B: s + d = 8, 9 o 10 -> VIIIB; s + d = 11 -> IB; s + d = 12 -> IIB"
                ),
                formulas = listOf(
                    "\\text{Grupo A} = (e^-_s + e^-_p)_{\\text{último nivel}}",
                    "\\text{Grupo B}: \\; s + d = \\begin{cases} 8, 9, 10 & \\to \\text{VIIIB} \\\\ 11 & \\to \\text{IB} \\\\ 12 & \\to \\text{IIB} \\end{cases}"
                ),
                formulaName = "Algoritmo de Ubicación Periódica",
                formulaLatex = "\\text{Período} = n_{\\text{máx}}, \\quad \\text{Grupo} = f(\\text{valencia})",
                formulaDescription = "Deducción de coordenadas en la tabla a partir de la configuración electrónica.",
                admissionTip = "Si la suma s + d da 8, 9 o 10, pertenece al Grupo VIIIB. Por ejemplo, ₂₆Fe: [Ar] 4s² 3d⁶ -> suma = 2 + 6 = 8 => Período 4, Grupo VIIIB.",
                admissionExplanation = "• Los elementos del Grupo IB (Cu, Ag, Au) son llamados históricamente 'metales de acuñación' debido a su uso tradicional en monedas de alta resistencia a la corrosión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un elemento químico posee número atómico Z = 35. ¿A qué período y grupo de la tabla periódica pertenece?",
                    options = listOf(
                        "Período 3, Grupo VA",
                        "Período 4, Grupo VA",
                        "Período 4, Grupo VIIA",
                        "Período 4, Grupo VIIB",
                        "Período 5, Grupo VIIA"
                    ),
                    correctIndex = 2,
                    explanation = "Z = 35: [₁₈Ar] 4s² 3d¹⁰ 4p⁵. Mayor nivel n = 4 (Período 4). Termina en p⁵, sumamos con 4s²: 2 + 5 = 7 (Grupo VIIA, halógeno: Bromo).",
                    subject = "Química",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "qui_t05_s04",
            subjectId = "qui_t05_s04",
            semana = 5,
            subtema = "5.4 Variación de Propiedades Periódicas",
            title = "Propiedades Periódicas (Radio, EN, EI y AE)",
            theory = LessonTheory(
                id = "theory_qui_t05_s04",
                asignatura = "Química",
                semana = 5,
                titulo = "Propiedades Periódicas (Radio, EN, EI y AE)",
                resumen = "• Radio Atómico (R.A.) y Radio Iónico (R.I.):\nDistancia promedio desde el núcleo hasta el electrón más externo.\n- En un Grupo: Aumenta hacia ABAJO (más niveles de energía).\n- En un Período: Aumenta hacia la IZQUIERDA (menor carga nuclear efectiva Z*, menor atracción nuclear).\n- Radio Iónico: R_anión > R_neutro > R_catión (al ganar electrones aumenta la repulsión y el radio se expande; al perderlos se contrae).\n\n• Electronegatividad (E.N.):\nCapacidad de un átomo para atraer electrones hacia sí en un enlace químico covalente (Escala de Linus Pauling: Fluor = 4.0, Francio = 0.7).\n- Aumenta hacia ARRIBA y hacia la DERECHA (el Flúor es el elemento más electronegativo).\n\n• Energía o Potencial de Ionización (E.I.):\nEnergía mínima necesaria para arrancar el electrón más externo de un átomo gaseoso en su estado basal, formando un catión.\n- Aumenta hacia ARRIBA y hacia la DERECHA (máxima en gases nobles como el Helio).\n\n• Afinidad Electrónica (A.E.):\nEnergía intercambiada cuando un átomo neutro gaseoso acepta un electrón formando un anión (el Cloro tiene la mayor afinidad electrónica liberadora).",
                conceptosClave = listOf(
                    "Radio atómico y Carácter Metálico: aumentan hacia la IZQUIERDA y hacia ABAJO (máximo en Francio)",
                    "Electronegatividad, Energía de Ionización y Afinidad Electrónica: aumentan hacia la DERECHA y hacia ARRIBA",
                    "Elemento más electronegativo: Flúor (4.0); elemento con mayor radio: Francio",
                    "Radio iónico: Catión < Neutro < Anión (R_Fe³⁺ < R_Fe²⁺ < R_Fe)"
                ),
                formulas = listOf(
                    "\\text{Aumentan hacia } \\nearrow : \\; \\text{Electronegatividad (EN)}, \\; \\text{Energía de Ionización (EI)}, \\; \\text{Afinidad (AE)}",
                    "\\text{Aumentan hacia } \\swarrow : \\; \\text{Radio Atómico (RA)}, \\; \\text{Carácter Metálico (CM)}",
                    "R_{\\text{catión}} < R_{\\text{neutro}} < R_{\\text{anión}}"
                ),
                formulaName = "Tendencias de Propiedades Periódicas",
                formulaLatex = "\\text{EN, EI} \\propto \\frac{1}{\\text{Radio Atómico}}",
                formulaDescription = "Variación espacial de parámetros físico-químicos atómicos a través de la tabla.",
                admissionTip = "Regla de oro: El Radio Atómico y el Carácter Metálico van hacia abajo a la izquierda (Fr); todas las demás propiedades importantes (EN, EI, AE) van hacia arriba a la derecha (F, He).",
                admissionExplanation = "• Los gases nobles no tienen valor de electronegatividad en la escala tradicional de Pauling porque no forman enlaces químicos estables compartiendo electrones."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes elementos químicos posee la mayor electronegatividad según la escala de Linus Pauling?",
                    options = listOf("Sodio (Na)", "Cloro (Cl)", "Flúor (F)", "Oxígeno (O)", "Francio (Fr)"),
                    correctIndex = 2,
                    explanation = "El Flúor (F) es el elemento más electronegativo de toda la tabla periódica con un valor máximo de 4.0 en la escala de Pauling.",
                    subject = "Química",
                    semana = 5
                )
            )
        ),

        // ==========================================
        // SEMANA 6: ENLACE QUÍMICO
        // ==========================================
        LessonNode(
            id = "qui_t06_s01",
            subjectId = "quimica",
            semana = 6,
            subtema = "6.1 Naturaleza del Enlace Químico, Notación de Lewis y Regla del Octeto",
            title = "Enlace Químico y Regla del Octeto",
            theory = LessonTheory(
                id = "theory_qui_t06_s01",
                asignatura = "Química",
                semana = 6,
                titulo = "Enlace Químico y Regla del Octeto",
                resumen = "El enlace químico es la fuerza de naturaleza electromagnética que mantiene unidos a átomos, iones o moléculas para formar sistemas más estables con MENOR contenido energético libre (se libera energía al formarse el enlace).\n\n• Notación de Lewis:\nRepresentación del símbolo del elemento rodeado por puntos o aspas (x) que representan exclusivamente sus ELECTRONES DE VALENCIA (último nivel).\n\n• Regla del Octeto (Gilbert N. Lewis):\nLos átomos ganan, pierden o comparten electrones hasta alcanzar 8 electrones en su capa de valencia, adquiriendo la configuración electrónica sumamente estable de un gas noble (ns² np⁶).\n- Excepciones al Octeto:\n  1. Octeto Incompleto: Berilio (BeCl₂, se estabiliza con 4 e⁻), Boro y Aluminio (BF₃, AlCl₃, se estabilizan con 6 e⁻).\n  2. Octeto Expandido (elementos del tercer período en adelante con orbitales d disponibles): Fósforo (PCl₅, rodeado de 10 e⁻), Azufre (SF₆, rodeado de 12 e⁻).\n  3. Dueto: Hidrógeno (H) y Litio (Li) se estabilizan con 2 electrones, imitando al Helio.",
                conceptosClave = listOf(
                    "Formación de enlace: proceso exotérmico que busca estabilidad y menor energía",
                    "Estructura de Lewis: muestra los electrones de valencia como puntos o aspas",
                    "Regla del octeto (8 electrones de valencia) y dueto (2 electrones para H y He)",
                    "Octeto incompleto (BF₃ con 6 e⁻) vs octeto expandido (SF₆ con 12 e⁻, PCl₅ con 10 e⁻)"
                ),
                formulas = listOf(
                    "\\text{Átomos libres (inestables)} \\to \\text{Molécula enlazada (estable)} + \\text{Energía de enlace}",
                    "\\text{Octeto Incompleto}: \\text{BF}_3 \\; (6 e^-), \\quad \\text{Octeto Expandido}: \\text{SF}_6 \\; (12 e^-)"
                ),
                formulaName = "Principio de Estabilidad del Enlace Químico",
                formulaLatex = "\\Delta H_{\\text{enlace}} < 0 \\quad (\\text{Proceso de enlace exotérmico})",
                formulaDescription = "Disminución de energía potencial intramolecular por compartición o transferencia electrónica.",
                admissionTip = "Al romper un enlace químico se ABSORBE energía (proceso endotérmico); al formar un nuevo enlace se LIBERA energía (proceso exotérmico).",
                admissionExplanation = "• Los elementos como el fósforo y el azufre pueden expandir su octeto porque pertenecen al período 3 y tienen orbitales '3d' vacíos accesibles energéticamente para albergar más de 8 electrones."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes moléculas constituye una excepción a la regla del octeto por presentar octeto incompleto con solo 6 electrones de valencia en su átomo central?",
                    options = listOf("CH₄", "NH₃", "H₂O", "BF₃", "CCl₄"),
                    correctIndex = 3,
                    explanation = "En el trifluoruro de boro (BF₃), el boro central comparte 3 pares de electrones con los átomos de flúor quedando rodeado de solo 6 electrones (octeto incompleto).",
                    subject = "Química",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "qui_t06_s02",
            subjectId = "quimica",
            semana = 6,
            subtema = "6.2 Enlace Iónico o Electrovalente: Propiedades y Formación",
            title = "Enlace Iónico y Redes Cristalinas",
            theory = LessonTheory(
                id = "theory_qui_t06_s02",
                asignatura = "Química",
                semana = 6,
                titulo = "Enlace Iónico y Redes Cristalinas",
                resumen = "• Enlace Iónico (Electrovalente):\nSe produce por la TRANSFERENCIA completa de uno o más electrones de valencia desde un metal (baja electronegatividad, electropositivo, forma cationes) hacia un no metal (alta electronegatividad, electronegativo, forma aniones).\n- Criterio de Pauling: Generalmente ocurre cuando la diferencia de electronegatividad es grande: ΔEN ≥ 1.7 (típicamente Metal IA o IIA + No Metal VIA o VIIA: NaCl, KBr, CaO, MgCl₂, LiF).\n- Se mantienen unidos por atracción electrostática mutua tridimensional formando redes cristalinas gigantes (no existen moléculas aisladas de NaCl).\n\n• Propiedades Generales de los Compuestos Iónicos:\n1. A temperatura ambiente son sólidos cristalinos duros pero quebradizos (los planos iónicos se repelen al deslizarse).\n2. Tienen altísimos puntos de fusión y ebullición (debido a la gran energía reticular de la red cristalina).\n3. En estado sólido NO conducen la electricidad (los iones están fijos en la red).\n4. Son excelentes conductores eléctricos FUNDIDOS (líquidos) o DISUELTOS en agua (electrolitos en solución acuosa).\n5. Generalmente son muy solubles en disolventes polares como el agua.",
                conceptosClave = listOf(
                    "Transferencia neta de electrones (Metal pierde -> No metal gana)",
                    "Diferencia de electronegatividad generalmente ΔEN ≥ 1.7",
                    "Estructura en red cristalina sólida con altos puntos de fusión",
                    "Conductividad eléctrica: NO conducen en estado sólido; SÍ conducen fundidos o disueltos en agua"
                ),
                formulas = listOf(
                    "\\text{Metal (catión } M^{n+}) + \\text{No Metal (anión } X^{m-}) \\to \\text{Red Cristalina Iónica}",
                    "\\Delta \\text{EN} \\ge 1.7 \\implies \\text{Predominio de carácter iónico}"
                ),
                formulaName = "Atracción Electrostática Iónica",
                formulaLatex = "F = k \\frac{|q^+ q^-|}{r^2}, \\quad \\Delta \\text{EN} \\ge 1.7",
                formulaDescription = "Fuerzas electrostáticas omnidireccionales en cristales iónicos.",
                admissionTip = "¡Pregunta trampa de admisión! 'El cloruro de sodio sólido conduce la electricidad' -> FALSO. Solo conduce cuando está FUNDIDO o DISUELTO en agua porque allí los iones tienen libertad de movimiento.",
                admissionExplanation = "• No todos los enlaces con metal son iónicos: el BeCl₂ y AlCl₃ tienen enlaces predominantemente covalentes debido a la alta densidad de carga del catión pequeño."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Respecto a las propiedades de los compuestos iónicos, señale la proposición correcta:",
                    options = listOf(
                        "Son líquidos volátiles a temperatura ambiente",
                        "Conducen la corriente eléctrica en estado sólido cristalino",
                        "Poseen bajos puntos de fusión y ebullición",
                        "Conducen la electricidad cuando se encuentran fundidos o disueltos en agua",
                        "Están formados por moléculas discretas independientes"
                    ),
                    correctIndex = 3,
                    explanation = "Los compuestos iónicos conducen la electricidad únicamente al fundirse o disolverse en agua, debido a que sus iones adquieren movilidad para transportar la carga.",
                    subject = "Química",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "qui_t06_s03",
            subjectId = "quimica",
            semana = 6,
            subtema = "6.3 Enlace Covalente: Normal, Coordinado, Polar, Apolar y Sigma/Pi",
            title = "Enlace Covalente y Enlaces Sigma / Pi",
            theory = LessonTheory(
                id = "theory_qui_t06_s03",
                asignatura = "Química",
                semana = 6,
                titulo = "Enlace Covalente y Enlaces Sigma / Pi",
                resumen = "• Enlace Covalente:\nSe produce por la COMPARTICIÓN de pares de electrones entre átomos de elementos NO METÁLICOS (diferencia de electronegatividad ΔEN < 1.7).\n\n• Clasificación del Enlace Covalente:\n1. Según el aporte de electrones:\n   - Covalente Normal: Cada átomo aporta un electrón al par compartido (A· + ·B -> A:B).\n   - Covalente Coordinado o Dativo (A -> B): Un solo átomo aporta el par completo de electrones y el otro átomo solo aporta el orbital vacío (ej. en el ion hidronio H₃O⁺, ion amonio NH₄⁺ o en el SO₂).\n2. Según la diferencia de electronegatividad:\n   - Covalente Apolar o Puro (ΔEN = 0): Compartición simétrica de electrones entre átomos iguales (H₂, O₂, N₂, Cl₂).\n   - Covalente Polar (0 < ΔEN < 1.7): Compartición asimétrica, generando dipolos con cargas parciales (δ+ y δ-): HCl, H₂O, NH₃.\n3. Según el número de pares compartidos:\n   - Simple: 1 par de electrones -> 1 enlace Sigma (σ).\n   - Doble: 2 pares de electrones -> 1 enlace Sigma (σ) y 1 enlace Pi (π).\n   - Triple: 3 pares de electrones -> 1 enlace Sigma (σ) y 2 enlaces Pi (π).",
                conceptosClave = listOf(
                    "Compartición de electrones entre no metales (ΔEN < 1.7)",
                    "Covalente normal (ambos aportan) vs Dativo/Coordinado (uno solo aporta el par)",
                    "Apolar (ΔEN = 0, átomos iguales) vs Polar (0 < ΔEN < 1.7)",
                    "Regla σ y π: Enlace simple = 1σ; Doble = 1σ + 1π; Triple = 1σ + 2π"
                ),
                formulas = listOf(
                    "\\text{Enlace Simple}: 1\\sigma, \\quad \\text{Enlace Doble}: 1\\sigma + 1\\pi, \\quad \\text{Enlace Triple}: 1\\sigma + 2\\pi",
                    "\\text{Covalente Apolar}: \\Delta \\text{EN} = 0, \\quad \\text{Covalente Polar}: 0 < \\Delta \\text{EN} < 1.7"
                ),
                formulaName = "Clasificación de Enlaces Covalentes",
                formulaLatex = "\\text{Simple } (\\sigma), \\; \\text{Doble } (\\sigma + \\pi), \\; \\text{Triple } (\\sigma + 2\\pi)",
                formulaDescription = "Solapamiento frontal (sigma) y lateral (pi) de orbitales atómicos moleculares.",
                admissionTip = "¡Conteo ultra veloz de admisión! En cualquier molécula: Enlace simple = 1 sigma; Enlace doble = 1 sigma y 1 pi; Enlace triple = 1 sigma y 2 pi.",
                admissionExplanation = "• El enlace sigma (σ) es frontal y más fuerte que el enlace pi (π), el cual es lateral y más reactivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la molécula de gas nitrógeno (N₂), los dos átomos de nitrógeno se unen mediante un enlace triple (N ≡ N). ¿Cuántos enlaces sigma (σ) y pi (π) contiene dicha molécula?",
                    options = listOf(
                        "3 enlaces sigma y 0 pi",
                        "1 enlace sigma y 2 enlaces pi",
                        "2 enlaces sigma y 1 enlace pi",
                        "0 enlaces sigma y 3 enlaces pi",
                        "1 enlace sigma y 1 enlace pi"
                    ),
                    correctIndex = 1,
                    explanation = "Todo enlace triple está constituido por un enlace frontal sigma (σ) y dos enlaces laterales pi (π): 1 sigma y 2 pi.",
                    subject = "Química",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "qui_t06_s04",
            subjectId = "qui_t06_s04",
            semana = 6,
            subtema = "6.4 Enlace Metálico y Fuerzas Intermoleculares",
            title = "Enlace Metálico y Fuerzas Intermoleculares",
            theory = LessonTheory(
                id = "theory_qui_t06_s04",
                asignatura = "Química",
                semana = 6,
                titulo = "Enlace Metálico y Fuerzas Intermoleculares",
                resumen = "• Enlace Metálico (Modelo del Mar de Electrones de Drude y Lorentz):\nLos átomos de los metales ceden sus electrones de valencia formando una red compacta de cationes sumergida en un 'mar o gas de electrones deslocalizados' que se mueven libremente por todo el cristal.\n- Explica las propiedades de los metales: excelente conductividad eléctrica y térmica, brillo metálico, maleabilidad (láminas) y ductilidad (hilos).\n\n• Fuerzas Intermoleculares (Fuerzas de Van der Waals):\nSon fuerzas de atracción entre moléculas completas neutras (mucho más débiles que los enlaces iónicos o covalentes):\n1. Enlace por Puente de Hidrógeno:\n   Atracción intermolecular excepcionalmente fuerte que ocurre cuando el Hidrógeno está unido covalentemente a átomos muy pequeños y fuertemente electronegativos: Flúor, Oxígeno o Nitrógeno (regla mnemotécnica: 'FON').\n   - Explica el anómalamente alto punto de ebullición del agua (100 °C), HF y NH₃, así como la estructura helicoidal del ADN.\n2. Fuerzas Dipolo-Dipolo (Keesom): Entre moléculas polares (HCl, SO₂).\n3. Fuerzas de Dispersión de London: Entre moléculas apolares (O₂, N₂, CH₄, gases nobles) por dipolos inducidos instantáneos. Aumentan con la masa molar.",
                conceptosClave = listOf(
                    "Enlace metálico: red de cationes inmersa en un mar de electrones móviles",
                    "Puente de hidrógeno: H unido covalentemente a F, O o N ('FON')",
                    "Fuerzas de London: presentes en todas las moléculas, únicas en moléculas apolares",
                    "Jerarquía de fuerza intermolecular: Puente de H > Dipolo-Dipolo > London"
                ),
                formulas = listOf(
                    "\\text{Puente de Hidrógeno}: \\; \\text{H unido covalentemente a F, O o N}",
                    "\\text{Fuerza Intermolecular}: \\text{Puente H} > \\text{Dipolo-Dipolo} > \\text{Dispersión de London}"
                ),
                formulaName = "Fuerzas Intermoleculares y Enlace Metálico",
                formulaLatex = "\\text{H}-\\text{F}, \\quad \\text{H}-\\text{O}-\\text{H}, \\quad \\text{H}-\\text{N} \\implies \\text{Puente de Hidrógeno}",
                formulaDescription = "Interacciones atractivas electrostáticas entre agregados moleculares.",
                admissionTip = "Para que exista puente de hidrógeno en una sustancia, debe haber átomos de H unidos directamente a Flúor, Oxígeno o Nitrógeno (FON). En el H₂S NO hay puente de hidrógeno (el azufre no es FON).",
                admissionExplanation = "• Si el agua no tuviera puentes de hidrógeno, herviría a aproximadamente -80 °C y sería un gas a temperatura ambiente, haciendo imposible la vida en la Tierra."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes sustancias presenta atracción intermolecular por puente de hidrógeno entre sus moléculas?",
                    options = listOf("CH₄ (metano)", "H₂S (sulfuro de hidrógeno)", "H₂O (agua)", "HCl (ácido clorhídrico)", "CO₂ (dióxido de carbono)"),
                    correctIndex = 2,
                    explanation = "El agua (H₂O) presenta puentes de hidrógeno debido a la unión directa del hidrógeno con el oxígeno, un elemento pequeño y altamente electronegativo (FON).",
                    subject = "Química",
                    semana = 6
                )
            )
        ),

        // ==========================================
        // SEMANA 7: NOMENCLATURA INORGÁNICA I
        // ==========================================
        LessonNode(
            id = "qui_t07_s01",
            subjectId = "qui_t07_s01",
            semana = 7,
            subtema = "7.1 Estados de Oxidación y Reglas de Asignación",
            title = "Estados de Oxidación y Reglas IUPAC",
            theory = LessonTheory(
                id = "theory_qui_t07_s01",
                asignatura = "Química",
                semana = 7,
                titulo = "Estados de Oxidación y Reglas IUPAC",
                resumen = "El Estado o Número de Oxidación (E.O.) es la carga aparente o real que adquiere un átomo al formar enlaces químicos, considerando la transferencia hipotética de electrones hacia el elemento más electronegativo.\n\n• Reglas Fundamentales de Asignación de E.O.:\n1. El E.O. de cualquier elemento en estado libre o no combinado es CERO: Fe⁰, Cu⁰, O₂⁰, N₂⁰, P₄⁰, S₈⁰ = 0.\n2. El Hidrógeno casi siempre actúa con E.O. = +1 (en hidruros metálicos actúa con -1: NaH⁻¹, CaH₂⁻¹).\n3. El Oxígeno casi siempre actúa con E.O. = -2 (en peróxidos con -1: H₂O₂; en OF₂ con +2).\n4. Los metales alcalinos (Grupo IA: Li, Na, K, Rb, Cs) actúan SIEMPRE con E.O. = +1.\n5. Los metales alcalinotérreos (Grupo IIA: Be, Mg, Ca, Ba) y el Zinc (Zn) actúan SIEMPRE con E.O. = +2; Aluminio (Al) con +3; Plata (Ag) con +1.\n6. En todo compuesto neutro, la suma algebraica de los números de oxidación es CERO: Σ E.O. = 0.\n7. En un ion poliatómico, la suma algebraica de los E.O. es igual a la carga neta del ion: Σ E.O. = q.",
                conceptosClave = listOf(
                    "Sustancias simples libres: E.O. = 0",
                    "Hidrógeno: +1 (salvo en hidruros metálicos: -1)",
                    "Oxígeno: -2 (salvo en peróxidos: -1 y OF₂: +2)",
                    "Suma en compuestos neutros: Σ E.O. = 0; en iones: Σ E.O. = carga del ion"
                ),
                formulas = listOf(
                    "\\sum \\text{E.O.}(\\text{compuesto neutro}) = 0, \\quad \\sum \\text{E.O.}(\\text{ion}) = q_{\\text{ion}}",
                    "\\text{H}: +1, \\quad \\text{O}: -2, \\quad \\text{Metales IA}: +1, \\quad \\text{Metales IIA}: +2"
                ),
                formulaName = "Reglas de Balance de Estados de Oxidación",
                formulaLatex = "\\sum n_i \\cdot (\\text{E.O.})_i = 0 \\; (\\text{neutro}) \\quad / \\quad = q \\; (\\text{ion})",
                formulaDescription = "Algoritmo de conservación de carga formal molecular.",
                admissionTip = "Para hallar el E.O. del manganeso en KMnO₄: K es +1, O es -2. Planteas: (+1) + Mn + 4(-2) = 0 => 1 + Mn - 8 = 0 => Mn = +7.",
                admissionExplanation = "• En el ion dicromato Cr₂O₇²⁻: 2(Cr) + 7(-2) = -2 => 2Cr - 14 = -2 => 2Cr = +12 => Cr = +6."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el estado de oxidación del azufre (S) en el ácido sulfúrico (H₂SO₄)?",
                    options = listOf("+2", "+4", "+6", "-2", "+7"),
                    correctIndex = 2,
                    explanation = "En H₂SO₄: 2(+1) + S + 4(-2) = 0 => +2 + S - 8 = 0 => S - 6 = 0 => S = +6.",
                    subject = "Química",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "qui_t07_s02",
            subjectId = "qui_t07_s02",
            semana = 7,
            subtema = "7.2 Función Óxidos: Óxidos Básicos y Óxidos Ácidos (Anhídridos)",
            title = "Función Óxidos: Básicos y Ácidos",
            theory = LessonTheory(
                id = "theory_qui_t07_s02",
                asignatura = "Química",
                semana = 7,
                titulo = "Función Óxidos: Básicos y Ácidos",
                resumen = "Los óxidos son compuestos binarios formados por la combinación del oxígeno (O⁻²) con otro elemento:\n\n1. Óxidos Básicos o Metálicos (Metal + Oxígeno):\nMetal⁺ᵐ + O⁻² -> M₂O_m\nAl reaccionar con agua forman bases o hidróxidos:\nNa₂O + H₂O -> 2 NaOH;  CaO + H₂O -> Ca(OH)₂ (cal apagada).\n\n2. Óxidos Ácidos o Anhídridos (No Metal + Oxígeno):\nNo Metal⁺ⁿ + O⁻² -> NM₂O_n\nAl reaccionar con agua forman oxácidos:\nSO₃ + H₂O -> H₂SO₄;  CO₂ + H₂O -> H₂CO₃.\n\n• Tres Sistemas de Nomenclatura Oficial:\n- Clásica o Tradicional: Prefijos y sufijos según valencias:\n  * 1 valencia: sufijo -ico (óxido de sodio o sódico).\n  * 2 valencias: menor -oso, mayor -ico (FeO óxido ferroso; Fe₂O₃ óxido férrico).\n  * 3 valencias: hipo-...-oso, -oso, -ico.\n  * 4 valencias (Halógenos Cl, Br, I: +1, +3, +5, +7): hipo-...-oso (+1), -oso (+3), -ico (+5), per-...-ico (+7).\n- Nomenclatura Stock: 'Óxido de [Metal] (valencia en números romanos)' -> Fe₂O₃: Óxido de hierro (III).\n- Nomenclatura Sistemática IUPAC: Prefijos de cantidad (mono, di, tri, tetra, penta...) -> Fe₂O₃: Trióxido de dihierro; CO: Monóxido de carbono.",
                conceptosClave = listOf(
                    "Óxido básico = Metal + Oxígeno (forma hidróxidos con agua)",
                    "Óxido ácido (anhídrido) = No metal + Oxígeno (forma oxácidos con agua)",
                    "Sistemas: Clásico (hipo-oso, oso, ico, per-ico), Stock (números romanos), IUPAC (mono, di, tri...)"
                ),
                formulas = listOf(
                    "\\text{Metal} + \\text{O}_2 \\to \\text{Óxido Básico} \\xrightarrow{+\\text{H}_2\\text{O}} \\text{Hidróxido}",
                    "\\text{No Metal} + \\text{O}_2 \\to \\text{Anhídrido (Óxido Ácido)} \\xrightarrow{+\\text{H}_2\\text{O}} \\text{Oxácido}"
                ),
                formulaName = "Formación de Óxidos Inorgánicos",
                formulaLatex = "M_2O_m \\; (\\text{Básico}), \\quad NM_2O_n \\; (\\text{Ácido})",
                formulaDescription = "Combinaciones binarias del ion óxido O²⁻ con cationes metálicos y no metálicos.",
                admissionTip = "Elementos de transición anfóteros como el Cromo (Cr) y Manganeso (Mn): con valencias bajas actúan como metales (Cr⁺², Cr⁺³ óxidos básicos), pero con valencias altas actúan como no metales (Cr⁺⁶ anhídrido crómico CrO₃; Mn⁺⁷ anhídrido permangánico Mn₂O₇).",
                admissionExplanation = "• El óxido de calcio (CaO) es conocido comercialmente como 'cal viva'; al añadirle agua se apaga violentamente liberando calor formando Ca(OH)₂ 'cal apagada'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El nombre del compuesto Cl₂O₇ según la nomenclatura clásica tradicional es:",
                    options = listOf(
                        "Óxido hipocloroso",
                        "Óxido cloroso",
                        "Óxido clórico",
                        "Anhídrido perclórico",
                        "Heptóxido de dicloro"
                    ),
                    correctIndex = 3,
                    explanation = "En Cl₂O₇, el cloro actúa con su máximo estado de oxidación (+7 de entre 1, 3, 5, 7), por lo que en la nomenclatura clásica lleva el prefijo 'per-' y sufijo '-ico': anhídrido perclórico.",
                    subject = "Química",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "qui_t07_s03",
            subjectId = "qui_t07_s03",
            semana = 7,
            subtema = "7.3 Función Hidruros: Metálicos y No Metálicos (Hidrácidos)",
            title = "Función Hidruros Metálicos y No Metálicos",
            theory = LessonTheory(
                id = "theory_qui_t07_s03",
                asignatura = "Química",
                semana = 7,
                titulo = "Función Hidruros Metálicos y No Metálicos",
                resumen = "Compuestos binarios formados por la combinación del hidrógeno con otro elemento químico:\n\n1. Hidruros Metálicos (Metal + Hidrógeno):\nEl hidrógeno actúa con su estado de oxidación EXCEPCIONAL de -1 (ion hidruro H⁻¹):\nMetal⁺ᵐ + H⁻¹ -> MH_m\nEjemplos: NaH (hidruro de sodio), CaH₂ (hidruro de calcio o hidrolita), AlH₃ (hidruro de aluminio).\n\n2. Hidruros No Metálicos (No Metal + Hidrógeno):\nEl hidrógeno actúa con E.O. = +1.\n- Grupo VIA (S⁻², Se⁻², Te⁻²) y Grupo VIIA (F⁻¹, Cl⁻¹, Br⁻¹, I⁻¹): Hidruros Hidrácidos.\n  En estado gaseoso puro terminan en '-uro de hidrógeno':\n  HCl(g) = Cloruro de hidrógeno; H₂S(g) = Sulfuro de hidrógeno.\n  Al disolverse en agua adquieren carácter ácido (Ácidos Hidrácidos):\n  HCl(ac) = Ácido clorhídrico; H₂S(ac) = Ácido sulfhídrico.\n\n- Grupos IIIA, IVA, VA (Hidruros Especiales Volátiles con nombres comunes IUPAC):\n  BH₃: Borano;  CH₄: Metano;  SiH₄: Silano;\n  NH₃: Amoníaco;  PH₃: Fosfina o fosfano;  AsH₃: Arsina;  SbH₃: Estibina.",
                conceptosClave = listOf(
                    "Hidruros metálicos: el hidrógeno actúa con E.O. = -1 (NaH, CaH₂)",
                    "Hidruros hidrácidos (VIA y VIIA): gas ('-uro de hidrógeno') vs en solución acuosa ('ácido -hídrico')",
                    "Nombres comunes indispensables: NH₃ (amoníaco), CH₄ (metano), PH₃ (fosfina)"
                ),
                formulas = listOf(
                    "\\text{Hidruro Metálico}: M^{+m} + H^{-1} \\to MH_m \\quad (\\text{H actúa con } -1)",
                    "\\text{Gas}: \\text{HCl}(g) \\; (\\text{cloruro de hidrógeno}) \\xrightarrow{+\\text{H}_2\\text{O}} \\text{HCl}(ac) \\; (\\text{ácido clorhídrico})"
                ),
                formulaName = "Formulación de Hidruros",
                formulaLatex = "MH_m \\; (\\text{metálico}), \\quad H_n NM \\; (\\text{no metálico})",
                formulaDescription = "Compuestos hidrogenados binarios con inversión de polaridad redox del protón.",
                admissionTip = "¡Diferencia vital en preguntas DECO! HCl(g) es gas cloruro de hidrógeno (no es ácido); HCl(ac) en solución acuosa es el ácido clorhídrico (ácido muriático comercial).",
                admissionExplanation = "• El amoníaco (NH₃) presenta carácter básico débil debido al par solitario de electrones del nitrógeno capaz de aceptar un protón H⁺."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En los hidruros metálicos como el hidruro de sodio (NaH) o hidruro de calcio (CaH₂), el estado de oxidación con el que actúa el hidrógeno es:",
                    options = listOf("+1", "-1", "+2", "-2", "0"),
                    correctIndex = 1,
                    explanation = "En los hidruros metálicos, al combinarse con metales muy electropositivos, el hidrógeno actúa con estado de oxidación -1 formando el ion hidruro (H⁻).",
                    subject = "Química",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "qui_t07_s04",
            subjectId = "qui_t07_s04",
            semana = 7,
            subtema = "7.4 Función Hidróxidos o Bases: Formación y Nomenclatura",
            title = "Función Hidróxidos (Bases)",
            theory = LessonTheory(
                id = "theory_qui_t07_s04",
                asignatura = "Química",
                semana = 7,
                titulo = "Función Hidróxidos (Bases)",
                resumen = "Los hidróxidos o bases son compuestos ternarios iónicos caracterizados por la presencia del ion oxidrilo o hidroxilo (OH)⁻¹ unido a un catión metálico:\n\n• Formación Química:\nÓxido Básico + Agua -> Hidróxido o Base\nMetal⁺ᵐ + m (OH)⁻¹ -> M(OH)_m\n(El número de grupos OH coincide numéricamente con el estado de oxidación del metal).\n\n• Propiedades Generales de los Hidróxidos:\n1. Tienen sabor amargo y tacto jabonoso al contacto con la piel.\n2. Vira el papel tornasol rojo a AZUL, y la solución incolora de fenolftaleína a color GROSELLA (fucsia intenso).\n3. Reaccionan con los ácidos en reacciones de neutralización formando sal y agua.\n4. Son electrolitos que liberan iones hidróxido (OH⁻) en solución acuosa.\n\n• Nomenclatura:\n- Clásica: Hidróxido ferroso Fe(OH)₂ / Hidróxido férrico Fe(OH)₃.\n- Stock: Hidróxido de hierro (II) / Hidróxido de hierro (III).\n- IUPAC: Dihidróxido de hierro / Trihidróxido de hierro.\n- Nombres Vulgares Notables: NaOH = soda cáustica; KOH = potasa cáustica; Ca(OH)₂ = cal apagada o lechada de cal; Mg(OH)₂ = leche de magnesia (antiácido estomacal).",
                conceptosClave = listOf(
                    "Grupo funcional: ion hidróxido o hidroxilo (OH)⁻¹",
                    "Formación: Óxido básico + H₂O -> M(OH)_m",
                    "Viraje con indicadores: tornasol a AZUL; fenolftaleína a color GROSELLA",
                    "Nombres comerciales: NaOH (soda cáustica), Mg(OH)₂ (leche de magnesia), Ca(OH)₂ (cal apagada)"
                ),
                formulas = listOf(
                    "M_2O_m + m \\text{H}_2\\text{O} \\to 2 M(\\text{OH})_m",
                    "\\text{Fenolftaleína en medio básico} \\to \\text{Color grosella intenso (fucsia)}"
                ),
                formulaName = "Formación de Hidróxidos Metálicos",
                formulaLatex = "M^{+m} + m (\\text{OH})^- \\to M(\\text{OH})_m",
                formulaDescription = "Generación de bases inorgánicas por hidratación de óxidos electrovalentes.",
                admissionTip = "Recuerda que la fenolftaleína es un indicador que en medio ÁCIDO o neutro es totalmente INCOLORA, pero en presencia de un HIDRÓXIDO (base) vira de golpe a color GROSELLA.",
                admissionExplanation = "• La leche de magnesia Mg(OH)₂ se emplea como antiácido estomacal porque reacciona con el ácido clorhídrico estomacal neutralizándolo: Mg(OH)₂ + 2HCl -> MgCl₂ + 2H₂O."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al agregar unas gotas de solución de fenolftaleína a una muestra acuosa desconocida, esta adquiere inmediatamente una coloración grosella (fucsia intensa). Esto indica con certeza que la sustancia analizada es:",
                    options = listOf("Un ácido oxácido", "Un hidróxido o base", "Un ácido hidrácido", "Agua destilada pura", "Un óxido ácido gaseoso"),
                    correctIndex = 1,
                    explanation = "La fenolftaleína vira a color grosella exclusivamente en presencia de sustancias de carácter básico o alcalino, tales como los hidróxidos.",
                    subject = "Química",
                    semana = 7
                )
            )
        ),

        // ==========================================
        // SEMANA 8: NOMENCLATURA INORGÁNICA II
        // ==========================================
        LessonNode(
            id = "qui_t08_s01",
            subjectId = "qui_t08_s01",
            semana = 8,
            subtema = "8.1 Ácidos Oxácidos: Simples, Polihidratados y Poliácidos",
            title = "Ácidos Oxácidos",
            theory = LessonTheory(
                id = "theory_qui_t08_s01",
                asignatura = "Química",
                semana = 8,
                titulo = "Ácidos Oxácidos",
                resumen = "Los ácidos oxácidos son compuestos ternarios hidrogenados oxigenados formados por la hidratación de un anhídrido:\nAnhídrido (Óxido Ácido) + H₂O -> Ácido Oxácido (H_a NM_b O_c)\n\n• Fórmulas Directas Prácticas para Oxácidos Simples (H_x NM O_y):\n1. Si el E.O. del no metal es IMPAR (1, 3, 5, 7):\n   Fórmula: H₁ NM O_((E.O. + 1) / 2)\n   Ejemplo Cl⁺⁵: H Cl O_((5+1)/2) = HClO₃ (Ácido clórico).\n2. Si el E.O. del no metal es PAR (2, 4, 6):\n   Fórmula: H₂ NM O_((E.O. + 2) / 2)\n   Ejemplo S⁺⁶: H₂ S O_((6+2)/2) = H₂SO₄ (Ácido sulfúrico).\n3. Si el no metal es Boro (B), Fósforo (P), Arsénico (As) o Antimonio (Sb) [Ácidos Especiales]:\n   Se hidratan por defecto con 3 moléculas de agua (forma 'orto'):\n   Fórmula: H₃ NM O_((E.O. + 3) / 2)\n   Ejemplo P⁺⁵: H₃ P O_((5+3)/2) = H₃PO₄ (Ácido ortofosfórico o simplemente ácido fosfórico).",
                conceptosClave = listOf(
                    "Oxácido = Anhídrido + H₂O (fórmula general H_a NM_b O_c)",
                    "Regla rápida E.O. impar: H NM O_((E.O.+1)/2)",
                    "Regla rápida E.O. par: H₂ NM O_((E.O.+2)/2)",
                    "Casos especiales P, As, Sb, B: H₃ NM O_((E.O.+3)/2) (H₃PO₄ ácido fosfórico)"
                ),
                formulas = listOf(
                    "\\text{E.O. impar}: \\text{HNM}\\text{O}_{\\frac{\\text{E.O.}+1}{2}}, \\quad \\text{E.O. par}: \\text{H}_2\\text{NM}\\text{O}_{\\frac{\\text{E.O.}+2}{2}}",
                    "\\text{Caso P, As, Sb, B}: \\text{H}_3\\text{NM}\\text{O}_{\\frac{\\text{E.O.}+3}{2}} \\quad (\\text{H}_3\\text{PO}_4, \\text{H}_3\\text{BO}_3)"
                ),
                formulaName = "Fórmulas Directas de Ácidos Oxácidos",
                formulaLatex = "\\text{H}_x \\text{NM} \\text{O}_y \\quad (y = \\frac{\\text{E.O.} + x}{2})",
                formulaDescription = "Algoritmo de formulación expedita de oxoácidos inorgánicos sin balanceo previo.",
                admissionTip = "Si te piden 'ácido fosfórico' a secas sin prefijo, SIEMPRE se refiere al ácido ortofosfórico H₃PO₄ (con 3 hidrógenos, no HPO₃).",
                admissionExplanation = "• El ácido sulfúrico (H₂SO₄) es la sustancia química más producida y consumida a nivel industrial en el mundo, considerado el termómetro del desarrollo fabril de un país."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la fórmula química del ácido nítrico, sabiendo que el nitrógeno actúa con estado de oxidación +5?",
                    options = listOf("HNO", "HNO₂", "HNO₃", "H₂NO₃", "H₃NO₄"),
                    correctIndex = 2,
                    explanation = "Como el nitrógeno actúa con E.O. impar (+5): H N O_((5+1)/2) = HNO₃ (Ácido nítrico).",
                    subject = "Química",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "qui_t08_s02",
            subjectId = "qui_t08_s02",
            semana = 8,
            subtema = "8.2 Radicales Aniónicos y Nomenclatura de Aniones",
            title = "Radicales Aniónicos Inorgánicos",
            theory = LessonTheory(
                id = "theory_qui_t08_s02",
                asignatura = "Química",
                semana = 8,
                titulo = "Radicales Aniónicos Inorgánicos",
                resumen = "Un anión o radical ácido se forma cuando un ácido pierde total o parcialmente sus átomos de hidrógeno ionizables (como protones H⁺). La carga negativa del radical es igual al número de hidrógenos perdidos.\n\n• Regla Mnemotécnica de Cambio de Sufijos (De Ácido a Anión):\n1. Si el ácido termina en '-oso' -> el anión termina en '-ito' ('Oso chiquito').\n2. Si el ácido termina en '-ico' -> el anión termina en '-ato' ('Pico de pato').\n3. Si el ácido termina en '-hídrico' -> el anión termina en '-uro' ('Pico de pato, oso chiquito, meter el pico en el plato y el oso al caballito').\n\n• Ejemplos Cruciales de Examen:\n- Del ácido clorhídrico HCl -> Cl⁻¹ : ion cloruro.\n- Del ácido sulfhídrico H₂S -> S⁻² : ion sulfuro.\n- Del ácido hipocloroso HClO -> ClO⁻¹ : ion hipoclorito.\n- Del ácido clórico HClO₃ -> ClO₃⁻¹ : ion clorato.\n- Del ácido nitroso HNO₂ -> NO₂⁻¹ : ion nitrito.\n- Del ácido nítrico HNO₃ -> NO₃⁻¹ : ion nitrato.\n- Del ácido sulfúrico H₂SO₄ -> SO₄⁻² : ion sulfato.\n- Del ácido fosfórico H₃PO₄ -> PO₄⁻³ : ion fosfato.",
                conceptosClave = listOf(
                    "Carga del anión = número de protones H⁺ liberados por el ácido",
                    "Cambio de sufijos: -hídrico -> -uro; -oso -> -ito; -ico -> -ato",
                    "Aniones comunes: ClO⁻ (hipoclorito), NO₃⁻ (nitrato), SO₄²⁻ (sulfato), PO₄³⁻ (fosfato)"
                ),
                formulas = listOf(
                    "\\text{Ácido } (-\\text{oso}) \\to \\text{Anión } (-\\text{ito})",
                    "\\text{Ácido } (-\\text{ico}) \\to \\text{Anión } (-\\text{ato})",
                    "\\text{Ácido } (-\\text{hídrico}) \\to \\text{Anión } (-\\text{uro})"
                ),
                formulaName = "Correspondencia de Sufijos Ácido-Anión",
                formulaLatex = "\\text{oso} \\to \\text{ito}, \\quad \\text{ico} \\to \\text{ato}, \\quad \\text{hídrico} \\to \\text{uro}",
                formulaDescription = "Transformación nominal de especies ácidas a bases conjugadas aniónicas.",
                admissionTip = "Aprende el verso mnemotécnico clásico de la academia:\n'Cuando el OSO toca el PITO, el mono toca el PATO; con el HÍDRICO en el CLORO, se forma el CLORURO'.",
                admissionExplanation = "• Los aniones ácidos conservan todavía hidrógenos en su estructura; por ejemplo, del H₂CO₃ al perder un solo H⁺ resulta el anión bicarbonato o hidrogenocarbonato (HCO₃⁻¹)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El anión sulfato (SO₄²⁻) se origina por la pérdida de los dos hidrógenos del ácido sulfúrico (H₂SO₄). Siguiendo la regla de correspondencia de sufijos, el anión formado a partir del ácido nitroso (HNO₂) es el:",
                    options = listOf("Nitrato (NO₃⁻)", "Nitrito (NO₂⁻)", "Nitruro (N³⁻)", "Hiponitrito (NO⁻)", "Pernitrato (NO₄⁻)"),
                    correctIndex = 1,
                    explanation = "Como el ácido termina en '-oso' (ácido nitroso HNO₂), el anión resultante al perder el hidrógeno cambia su terminación a '-ito': ion nitrito (NO₂⁻).",
                    subject = "Química",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "qui_t08_s03",
            subjectId = "qui_t08_s03",
            semana = 8,
            subtema = "8.3 Sales Haloideas: Neutras y Ácidas",
            title = "Sales Haloideas Neutras y Especiales",
            theory = LessonTheory(
                id = "theory_qui_t08_s03",
                asignatura = "Química",
                semana = 8,
                titulo = "Sales Haloideas Neutras y Especiales",
                resumen = "Las sales haloideas son compuestos iónicos binarios que NO contienen oxígeno en su estructura molecular.\n\n• Reacción de Formación:\nÁcido Hidrácido + Hidróxido -> Sal Haloidea + Agua\nCatión Metálico⁺ᵐ + Anión No Metálico (con terminación '-uro')⁻ⁿ -> M_n NM_m\n\n• Nomenclatura:\nSe nombra primero el anión terminado en '-uro' seguido del nombre del metal con su terminación clásica o Stock:\n- NaCl : Cloruro de sodio (sal común o sal de cocina).\n- CaCl₂ : Cloruro de calcio (agente desecante).\n- FeCl₂ : Cloruro ferroso o Cloruro de hierro (II).\n- FeCl₃ : Cloruro férrico o Cloruro de hierro (III).\n- KI : Yoduro de potasio (agregado a la sal yodada para prevenir el bocio).\n- Na₂S : Sulfuro de sodio.\n- AlF₃ : Fluoruro de aluminio.\n\n• Sales Haloideas Ácidas:\nConsiguen retener hidrógenos en el anión: NaHS (bisulfuro de sodio o hidrogenosulfuro de sodio).",
                conceptosClave = listOf(
                    "Sales haloideas: SIN oxígeno en su composición química (compuestos binarios)",
                    "Formación: Ácido hidrácido + Hidróxido -> Sal haloidea + H₂O",
                    "Terminación estricta del no metal: '-uro'",
                    "Ejemplos: NaCl (sal de mesa), KI (sal yodada), FeCl₃ (cloruro férrico)"
                ),
                formulas = listOf(
                    "\\text{Ácido Hidrácido} + \\text{Hidróxido} \\to \\text{Sal Haloidea} + \\text{H}_2\\text{O}",
                    "\\text{HCl}(ac) + \\text{NaOH}(ac) \\to \\text{NaCl}(s) + \\text{H}_2\\text{O}(l)"
                ),
                formulaName = "Neutralización Formadora de Sales Haloideas",
                formulaLatex = "HA \\; (\\text{hidrácido}) + M(\\text{OH})_m \\to M_a A_m + \\text{H}_2\\text{O}",
                formulaDescription = "Reacción ácido-base sin participación de ligandos de oxígeno.",
                admissionTip = "Para identificar una sal haloidea al instante en las alternativas: busca una sal que NO TENGA OXÍGENO en su fórmula (ej. CaF₂, KBr, Na₂S son haloideas; CaCO₃ o NaNO₃ son oxisales).",
                admissionExplanation = "• La sal común de mesa (NaCl) es extraída en el Perú de salineras marinas (como las de Huacho) o de salares andinos ancestrales (como las Salineras de Maras en Cusco)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes fórmulas químicas representa una sal haloidea neutra?",
                    options = listOf("KNO₃", "CaSO₄", "FeCl₃", "NaClO", "Na₂CO₃"),
                    correctIndex = 2,
                    explanation = "El cloruro férrico (FeCl₃) es una sal haloidea binaria formada por un metal y un no metal sin átomos de oxígeno.",
                    subject = "Química",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "qui_t08_s04",
            subjectId = "qui_t08_s04",
            semana = 8,
            subtema = "8.4 Sales Oxisales: Neutras, Ácidas y Nomenclatura",
            title = "Sales Oxisales Neutras y Complejas",
            theory = LessonTheory(
                id = "theory_qui_t08_s04",
                asignatura = "Química",
                semana = 8,
                titulo = "Sales Oxisales Neutras y Complejas",
                resumen = "Las sales oxisales son compuestos ternarios o cuaternarios que contienen oxígeno en su estructura, formadas por la neutralización entre un oxácido y una base:\nÁcido Oxácido + Hidróxido -> Sal Oxisal + Agua\nCatión Metálico⁺ᵐ + Oxianión (con terminación '-ito' o '-ato')⁻ⁿ -> M_n (Oxianión)_m\n\n• Nomenclatura y Ejemplos de Admisión:\n- CaCO₃ : Carbonato de calcio (componente principal de la piedra caliza, el mármol, las conchas marinas y el sillar arequipeño con matriz calcárea).\n- CaSO₄ · 2H₂O : Sulfato de calcio dihidratado (yeso para construcción y traumatología).\n- NaNO₃ : Nitrato de sodio (salitre de Chile/Tarapacá, fertilizante histórico).\n- NaClO : Hipoclorito de sodio (lejía doméstica, potente desinfectante clorado).\n- CuSO₄ : Sulfato cúprico o Sulfato de cobre (II) (piedra azul, fungicida y alguicida).\n- KMnO₄ : Permanganato de potasio (cristales morados, potente agente oxidante).\n\n• Sales Oxisales Ácidas (conservan H⁺):\n- NaHCO₃ : Bicarbonato de sodio o hidrogenocarbonato de sodio (antiácido y polvo para hornear).",
                conceptosClave = listOf(
                    "Sales oxisales: CON oxígeno en su estructura (ternarias o cuaternarias)",
                    "Formación: Ácido oxácido + Hidróxido -> Sal oxisal + H₂O",
                    "Nomenclatura: [Anión en -ito/-ato] de [Metal]",
                    "Compuestos clave: CaCO₃ (caliza/mármol), NaClO (lejía), NaHCO₃ (bicarbonato), CaSO₄·2H₂O (yeso)"
                ),
                formulas = listOf(
                    "\\text{Ácido Oxácido} + \\text{Hidróxido} \\to \\text{Sal Oxisal} + \\text{H}_2\\text{O}",
                    "\\text{H}_2\\text{SO}_4 + \\text{Ca}(\\text{OH})_2 \\to \\text{CaSO}_4 + 2\\text{H}_2\\text{O}"
                ),
                formulaName = "Formación de Sales Oxisales",
                formulaLatex = "H_x NM O_y + M(\\text{OH})_m \\to M_n (NM O_y)_m + \\text{H}_2\\text{O}",
                formulaDescription = "Reacción de neutralización completa entre oxoácidos y bases metálicas.",
                admissionTip = "El compuesto NaClO es el 'hipoclorito de sodio', sustancia activa de la LEJÍA comercial usada universalmente para desinfección y potabilización del agua.",
                admissionExplanation = "• El sillar, roca volcánica ignimbrita emblemática de Arequipa (la Ciudad Blanca), está compuesto fundamentalmente por piroclastos consolidados y feldespatos ricos en silicatos y carbonatos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_qui_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El carbonato de calcio, componente químico fundamental de las rocas calizas, el mármol y las conchas de moluscos, tiene por fórmula química:",
                    options = listOf("CaSO₄", "Ca(OH)₂", "CaCO₃", "CaCl₂", "Ca(HCO₃)₂"),
                    correctIndex = 2,
                    explanation = "El carbonato de calcio es una sal oxisal neutra formada por el ion calcio Ca²⁺ y el ion carbonato CO₃²⁻: CaCO₃.",
                    subject = "Química",
                    semana = 8
                )
            )
        )
    )
}
