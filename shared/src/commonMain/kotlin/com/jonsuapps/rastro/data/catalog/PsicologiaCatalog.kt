package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object PsicologiaCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: LA PSICOLOGÍA COMO CIENCIA (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "psi_t01_s01",
            subjectId = "psicologia",
            semana = 1,
            subtema = "1.1 Definición, Objeto de Estudio y Métodos de Investigación",
            title = "La Psicología como Ciencia: Objeto y Métodos de Investigación",
            theory = LessonTheory(
                id = "th_psi_t01_s01",
                asignatura = "Psicología",
                semana = 1,
                titulo = "La Psicología como Ciencia y sus Métodos",
                resumen = "• Etimología y Definición:\n  - Proviene de las voces griegas psykhe (alma, mente) y logos (tratado, estudio).\n  - Es la **ciencia fáctica social y natural** que describe, explica, predice y modifica la **conducta humana** (comportamiento observable) y los **procesos mentales** cognitivos, afectivos y volitivos en interacción con el entorno.\n\n• Hito Fundacional de la Psicología Científica:\n  - En **1879**, Wilhelm Wundt funda el **Primer Laboratorio de Psicología Experimental** en la Universidad de Leipzig (Alemania), emancipando a la psicología de la tutela filosófica.\n\n• Métodos de Investigación en Psicología:\n  1. **Método Descriptivo / Observacional**:\n     - Observación naturalista y observación de laboratorio; describe fenómenos sin manipular variables.\n  2. **Método Correlacional**:\n     - Mide el grado de relación estadística entre dos o más variables sin establecer relaciones de causa-efecto directas (coeficiente de correlación de Pearson r de -1 a +1).\n  3. **Método Experimental (El más riguroso)**:\n     - Determina relaciones de **causa y efecto** mediante la manipulación deliberada de variables:\n       * **Variable Independiente (VI)**: La causa manipulada por el experimentador.\n       * **Variable Dependiente (VD)**: El efecto o conducta medida.\n       * **Variables Extrañas**: Factores interferentes que deben ser controlados o neutralizados mediante grupos experimentales y grupos de control.\n  4. **Método Clínico y Genético**: Estudio de casos longitudinales y transversales.",
                conceptosClave = listOf(
                    "Fundación científica por Wilhelm Wundt en Leipzig (1879)",
                    "Doble objeto: Conducta observable y procesos mentales subyacentes",
                    "Método Experimental: Determina causa y efecto (Variable Independiente vs Dependiente)",
                    "Método Correlacional: Evalúa el grado de asociación estadística (no demuestra causalidad)"
                ),
                formulas = listOf(
                    "\\text{Método Experimental}: \\; \\text{Variable Independiente (Causa)} \\xrightarrow{\\text{Manipulación}} \\text{Variable Dependiente (Efecto)}",
                    "\\text{Correlación} \\neq \\text{Causalidad}"
                ),
                formulaName = "Ecuación de la Causalidad Experimental",
                formulaLatex = "\\text{Psicología Científica} = \\text{Conducta (Observable)} \\oplus \\text{Procesos Mentales (Cognición, Afecto, Volición)}",
                formulaDescription = "Paradigma metodológico de la ciencia psicológica contemporánea.",
                admissionTip = "¡Fecha clave!: 1879 en Leipzig, Alemania, Wilhelm Wundt funda el primer laboratorio experimental, naciendo la psicología científica.",
                admissionExplanation = "• Una correlación positiva alta entre dos variables no prueba que una sea causa de la otra; pueden estar asociadas por un tercer factor común no observado."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El nacimiento oficial de la psicología como disciplina científica autónoma e independiente de la filosofía ocurrió en 1879 cuando se creó el primer laboratorio experimental en:",
                    options = listOf("Viena por Sigmund Freud", "Leipzig por Wilhelm Wundt", "Harvard por William James", "Ginebra por Jean Piaget", "Moscú por Iván Pavlov"),
                    correctIndex = 1,
                    explanation = "Wilhelm Wundt inauguró en 1879 en la Universidad de Leipzig el primer laboratorio de psicología experimental del mundo.",
                    subject = "Psicología",
                    semana = 1
                ),
                Challenge(
                    id = "q_psi_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una investigación experimental para evaluar si el consumo de cafeína mejora la memoria de trabajo en estudiantes, la variable manipulada directamente por el investigador (cafeína) es la:",
                    options = listOf("Variable dependiente", "Variable independiente", "Variable interviniente", "Variable nula", "Variable de control pasivo"),
                    correctIndex = 1,
                    explanation = "La Variable Independiente (VI) es la causa manipulada por el experimentador para observar su efecto en la Variable Dependiente (VD).",
                    subject = "Psicología",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "psi_t01_s02",
            subjectId = "psicologia",
            semana = 1,
            subtema = "1.2 Escuelas Psicológicas Clásicas y Enfoques Contemporáneos",
            title = "Escuelas Psicológicas Clásicas: Estructuralismo, Conductismo y Gestalt",
            theory = LessonTheory(
                id = "th_psi_t01_s02",
                asignatura = "Psicología",
                semana = 1,
                titulo = "Escuelas y Enfoques de la Psicología",
                resumen = "• Escuelas Psicológicas Clásicas:\n  1. **Estructuralismo (Wundt y Edward Titchener)**:\n     - Objeto: La estructura de la conciencia inmediata elemental (sensaciones, imágenes y sentimientos).\n     - Método: Introspección analítica experimental controlada en laboratorio.\n  2. **Funcionalismo (William James y John Dewey)**:\n     - Objeto: El funcionamiento de la mente y su utilidad adaptativa y pragmática al medio ambiente biológico y social.\n  3. **Psicoanálisis (Sigmund Freud, Viena)**:\n     - Objeto: El **Inconsciente dinámico** reprimido y los impulsos sexuales (libido).\n     - Método: Asociación libre, análisis de los actos fallidos y la interpretación de los sueños.\n  4. **Conductismo o Reflexología (John B. Watson y B.F. Skinner)**:\n     - Objeto: La **conducta objetivamente observable y medible** (E -> R: Estímulo-Respuesta).\n     - Rechaza la introspección y el estudio de la mente subjetiva por considerarla una 'caja negra' acientífica.\n  5. **Gestalt o Psicología de la Forma (Max Wertheimer, Köhler y Koffka)**:\n     - Objeto: La percepción holística e integradora.\n     - Principio: *'El todo es más que la suma de sus partes'*. Aprendizaje por insight (comprensión súbita).\n\n• Enfoques Contemporáneos:\n  - **Humanismo (Carl Rogers y Abraham Maslow)**: El ser humano posee libre albedrío, bondad intrínseca y tendencia hacia la autorrealización.\n  - **Cognitivismo (Ulric Neisser y Jean Piaget)**: Metáfora del ordenador; estudia los procesos internos de almacenamiento y recuperación de información.",
                conceptosClave = listOf(
                    "Estructuralismo (Wundt/Titchener): Estructura atómica de la conciencia por introspección",
                    "Funcionalismo (William James): Utilidad adaptativa de la mente al entorno",
                    "Psicoanálisis (Freud): El inconsciente reprimido y la asociación libre",
                    "Conductismo (Watson/Skinner): Estudio empírico exclusivo de la conducta observable (E-R)",
                    "Gestalt: Percepción global ('el todo es más que la suma de sus partes')"
                ),
                formulas = listOf(
                    "\\text{Conductismo Clásico} = \\text{Estímulo (E)} \\longrightarrow \\text{Respuesta Observable (R)}",
                    "\\text{Principio Gestáltico} \\to \\text{Percepción Totalitaria (El Todo)} > \\sum \\text{Partes Aisladas}"
                ),
                formulaName = "Paradigmas Psicológicos Clásicos",
                formulaLatex = "\\text{Evolución}: \\; \\text{Conciencia (Wundt)} \\to \\text{Inconsciente (Freud)} \\to \\text{Conducta (Watson)} \\to \\text{Cognición (Piaget)}",
                formulaDescription = "Secuencia de cambios de objeto de estudio a lo largo del siglo XX.",
                admissionTip = "La escuela de la GESTALT postula que el cerebro no percibe sensaciones fragmentadas, sino figuras globales y organizadas ('el todo es más que la suma de las partes').",
                admissionExplanation = "• John B. Watson publicó en 1913 el 'Manifiesto Conductista', sentando las bases para convertir a la psicología en una ciencia puramente empírica de laboratorio animal y humano."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La escuela psicológica clásica que rechazó el método de la introspección subjetiva y propuso estudiar exclusivamente la conducta observable en términos de Estímulo-Respuesta fue:",
                    options = listOf("El Estructuralismo", "El Psicoanálisis", "El Conductismo", "La Gestalt", "El Funcionalismo"),
                    correctIndex = 2,
                    explanation = "El Conductismo (fundado por John B. Watson) limitó el objeto de estudio de la psicología a la conducta medible y observable.",
                    subject = "Psicología",
                    semana = 1
                ),
                Challenge(
                    id = "q_psi_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes escuelas postuló que la mente humana capta configuraciones globales organizadas y acuñó el principio de que 'el todo es más que la suma de sus partes'?",
                    options = listOf("El Estructuralismo", "La Gestalt", "El Psicoanálisis", "El Cognitivismo", "El Neoconductismo"),
                    correctIndex = 1,
                    explanation = "La escuela de la Gestalt investigó la percepción visual demostrando que percibimos formas estructuradas holísticas y no elementos aislados.",
                    subject = "Psicología",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: PROYECTO DE VIDA (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "psi_t02_s01",
            subjectId = "psicologia",
            semana = 2,
            subtema = "2.1 El Proyecto de Vida: Visión, Misión y la Matriz FODA",
            title = "Proyecto de Vida: Visión, Misión y Diagnóstico Estratégico (FODA)",
            theory = LessonTheory(
                id = "th_psi_t02_s01",
                asignatura = "Psicología",
                semana = 2,
                titulo = "Estructura y Planeamiento del Proyecto de Vida",
                resumen = "• Concepto de Proyecto de Vida:\n  Es el plan personal estructurado a mediano y largo plazo que una persona diseña conscientemente para orientar sus decisiones, esfuerzos y metas, otorgando sentido existencial a su desarrollo integral y autorrealización.\n\n• Visión y Misión Personal:\n  - **Visión Personal**: Imagen meta proyectada a futuro; define qué aspira a ser y lograr la persona a largo plazo (el horizonte de autorrealización).\n  - **Misión Personal**: Declaración del propósito presente; concreta las acciones, principios éticos y valores cotidianos con los que la persona trabaja hoy para alcanzar su visión.\n\n• Diagnóstico Estratégico: Matriz FODA Personal:\n  1. **Factores Internos (Dependen de la propia persona y son controlables)**:\n     - **Fortalezas**: Capacidades, talentos, disciplina, resiliencia y valores que facilitan el logro de objetivos.\n     - **Debilidades**: Limitaciones, defectos, malos hábitos, procrastinación y falta de constancia que obstaculizan el avance.\n  2. **Factores Externos (Provienen del entorno y no dependen de la voluntad del individuo)**:\n     - **Oportunidades**: Circunstancias favorables del medio (apoyo familiar, becas de estudio, demanda laboral).\n     - **Amenazas**: Factores adversos del entorno que representan riesgos (crisis económica, inseguridad, desempleo).",
                conceptosClave = listOf(
                    "Proyecto de vida como eje director de la autorrealización personal y académica",
                    "Visión (futuro proyectado) vs Misión (compromiso y acción en el presente)",
                    "Matriz FODA: Factores internos controlables (Fortalezas y Debilidades)",
                    "Matriz FODA: Factores externos contextuales (Oportunidades y Amenazas)"
                ),
                formulas = listOf(
                    "\\text{FODA Interno} = \\text{Fortalezas (Positivas)} + \\text{Debilidades (Negativas)} \\; (\\text{Controlables})",
                    "\\text{FODA Externo} = \\text{Oportunidades (Favorables)} + \\text{Amenazas (Riesgos)} \\; (\\text{Entorno})"
                ),
                formulaName = "Matriz Estratégica FODA Personal",
                formulaLatex = "\\text{Éxito Personal} = \\text{Visión Clara} + \\text{Misión Cotidiana} + \\text{Mitigación de Debilidades}",
                formulaDescription = "Herramienta de autodiagnóstico y planeamiento existencial para postulantes preuniversitarios.",
                admissionTip = "¡Clave en preguntas de admisión UNSA!: Las Fortalezas y Debilidades son INTERNAS (dependen de ti); las Oportunidades y Amenazas son EXTERNAS (provienen del entorno social o familiar).",
                admissionExplanation = "• Un estudiante disciplinado que pierde su beca por la quiebra de la empresa patrocinadora enfrenta una AMENAZA (factor externo), no una debilidad propia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la matriz FODA personal elaborada por un estudiante preuniversitario, el hábito constante de posponer las tareas para el último momento (procrastinación) clasifica como una:",
                    options = listOf("Amenaza", "Debilidad", "Oportunidad", "Fortaleza", "Meta prospectiva"),
                    correctIndex = 1,
                    explanation = "La procrastinación es una debilidad, ya que es un rasgo interno desfavorable que depende de la conducta y hábitos del individuo.",
                    subject = "Psicología",
                    semana = 2
                ),
                Challenge(
                    id = "q_psi_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el diseño de un proyecto de vida, la formulación de la imagen meta que describe lo que una persona aspira a ser y lograr en el futuro a largo plazo constituye su:",
                    options = listOf("Misión", "Visión", "Aptitud operativa", "Estilo de atribución", "Refuerzo secundario"),
                    correctIndex = 1,
                    explanation = "La visión define el horizonte y la meta futura a largo plazo de autorrealización existencial del individuo.",
                    subject = "Psicología",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: ORIENTACIÓN VOCACIONAL (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "psi_t03_s01",
            subjectId = "psicologia",
            semana = 3,
            subtema = "3.1 Orientación Vocacional: Intereses, Aptitudes y Mercado Laboral",
            title = "Orientación Vocacional: Intereses Vocacionales vs. Aptitudes",
            theory = LessonTheory(
                id = "th_psi_t03_s01",
                asignatura = "Psicología",
                semana = 3,
                titulo = "La Elección Vocacional: Factores Internos y Externos",
                resumen = "• La Vocación y la Orientación Vocacional:\n  - La vocación no es un destino mágico predeterminado al nacer; es un proceso paulatino de construcción de identidad profesional que articula las motivaciones personales con el entorno social.\n\n• Factores Internos de la Elección Vocacional:\n  1. **Intereses Vocacionales**:\n     - Gustos, preferencias e inclinaciones afectivas hacia determinadas actividades profesionales (*lo que a la persona le gusta o apasiona hacer*).\n     - Tipología de Holland (RIASEC): Realista, Investigador, Artístico, Social, Emprendedor y Convencional.\n  2. **Aptitudes o Habilidades Reales**:\n     - Capacidades potenciales y destrezas cognitivas, psicomotoras o sociales que facilitan el aprendizaje y desempeño con excelencia (*lo que la persona puede hacer eficientemente*).\n  3. **Rasgos de Personalidad**:\n     - Estilo de afrontamiento, extroversión o introversión, estabilidad emocional y tolerancia al estrés afines a la carrera elegida.\n  4. **Valores Personales**: Priorización de la vocación de servicio, la autonomía, la remuneración o el prestigio.\n\n• Factores Externos de la Elección Vocacional:\n  - Campo ocupacional y demanda del mercado laboral.\n  - Oferta formativa de las universidades y centros superiores.\n  - Realidad económica familiar y duración de la carrera.",
                conceptosClave = listOf(
                    "Diferencia crucial: Interés (lo que te gusta) vs Aptitud (lo que eres capaz de hacer con destreza)",
                    "Tipología de Holland (RIASEC): Ajuste entre personalidad y ambiente laboral",
                    "Factores internos (aptitudes, intereses, personalidad) vs Factores externos (mercado laboral, costos)",
                    "Madurez vocacional y prevención de la deserción universitaria"
                ),
                formulas = listOf(
                    "\\text{Interés Vocacional} = \\text{Preferencia Afectiva (Lo que me gusta)}",
                    "\\text{Aptitud Real} = \\text{Capacidad / Destreza Cognitiva o Práctica (Lo que puedo hacer)}",
                    "\\text{Elección Vocacional Óptima} = \\text{Intereses} \\cap \\text{Aptitudes} \\cap \\text{Mercado Laboral}"
                ),
                formulaName = "Trípode de la Elección Vocacional",
                formulaLatex = "\\text{Madurez Vocacional} = f(\\text{Autoconocimiento}, \\; \\text{Información Profesional}, \\; \\text{Toma de Decisiones})",
                formulaDescription = "Armonización de aptitudes subjetivas con el perfil profesional de la carrera.",
                admissionTip = "¡Trampa de examen!: Un estudiante puede tener mucho INTERÉS en ser médico cirujano (le apasiona la medicina), pero carecer de la APTITUD psicomotora o tolerancia a la sangre requerida.",
                admissionExplanation = "• John Holland demostró que la satisfacción laboral depende de la congruencia entre el tipo de personalidad del sujeto y el ambiente de trabajo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el proceso de orientación vocacional, la disposición innata o aprendida que permite a una persona ejecutar con facilidad, rapidez y precisión una tarea específica se denomina:",
                    options = listOf("Interés vocacional", "Aptitud", "Motivación de afiliación", "Proyección", "Sensibilidad"),
                    correctIndex = 1,
                    explanation = "La aptitud es la habilidad o suficiencia demostrada para realizar una actividad con eficacia y destreza.",
                    subject = "Psicología",
                    semana = 3
                ),
                Challenge(
                    id = "q_psi_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según la teoría de John Holland, una persona que prefiere trabajar con ideas abstractas, analizar datos, resolver problemas teóricos e investigar fenómenos científicos corresponde al tipo:",
                    options = listOf("Convencional", "Emprendedor", "Investigador", "Realista", "Artístico"),
                    correctIndex = 2,
                    explanation = "El tipo Investigador en el modelo de Holland se orienta al análisis racional de problemas científicos y actividades intelectuales.",
                    subject = "Psicología",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: HÁBITOS DE ESTUDIO (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "psi_t04_s01",
            subjectId = "psicologia",
            semana = 4,
            subtema = "4.1 Hábitos de Estudio, Gestión del Tiempo y Métodos de Aprendizaje",
            title = "Hábitos de Estudio, Técnicas de Aprendizaje (EPLERR) y Gestión del Tiempo",
            theory = LessonTheory(
                id = "th_psi_t04_s01",
                asignatura = "Psicología",
                semana = 4,
                titulo = "Estrategias de Aprendizaje y Hábitos de Estudio",
                resumen = "• Hábitos de Estudio:\n  Pautas de conducta automatizadas y regulares adquiridas mediante la repetición constante que optimizan la asimilación, organización y retención de información académica.\n\n• Factores que Condicionan el Estudio Eficaz:\n  1. **Condiciones Ambientales**: Lugar fijo, libre de distractores acústicos y visuales, ventilado y con iluminación adecuada.\n  2. **Condiciones Fisiológicas**: Descanso reparador (mínimo 7-8 horas de sueño para consolidar memoria en el hipocampo) y alimentación balanceada.\n  3. **Condiciones Psicológicas**: Motivación intrínseca, actitud positiva y autorregulación emocional.\n\n• El Método de Estudio EPLERR (Robinson):\n  1. **E (Examinar)**: Lectura panorámica rápida inicial de títulos y subtítulos.\n  2. **P (Preguntar)**: Formular preguntas cognitivas sobre lo que se espera aprender.\n  3. **L (Leer)**: Lectura comprensiva activa y analítica subrayando ideas clave.\n  4. **E (Esquematizar)**: Elaborar mapas conceptuales, cuadros sinópticos o resúmenes.\n  5. **R (Recitar / Repetir)**: Evocar en voz propia las ideas principales sin mirar el texto.\n  6. **R (Repasar)**: Repasos periódicos espaciados para evitar la curva del olvido de Ebbinghaus.\n\n• Gestión del Tiempo y Procrastinación:\n  - Matriz de Eisenhower (Urgente vs. Importante).\n  - Técnica Pomodoro: Bloques de 25 minutos de estudio concentrado con 5 minutos de descanso activo.",
                conceptosClave = listOf(
                    "Hábitos de estudio: Conductas aprendidas y regularizadas que optimizan el rendimiento académico",
                    "Método EPLERR: Examinar, Preguntar, Leer, Esquematizar, Recitar y Repasar",
                    "Curva del olvido de Hermann Ebbinghaus y la importancia del repaso espaciado",
                    "Matriz de Eisenhower y técnica Pomodoro para combatir la procrastinación"
                ),
                formulas = listOf(
                    "\\text{Método EPLERR} = \\text{Examinar} \\to \\text{Preguntar} \\to \\text{Leer} \\to \\text{Esquematizar} \\to \\text{Recitar} \\to \\text{Repasar}",
                    "\\text{Técnica Pomodoro} = 25 \\text{ min (Enfoque Total)} + 5 \\text{ min (Descanso)}"
                ),
                formulaName = "Algoritmo de Aprendizaje Estratégico",
                formulaLatex = "\\text{Retención a Largo Plazo} = \\text{Comprensión Profunda} \\times \\text{Repaso Espaciado}",
                formulaDescription = "Consolidación mnemónica frente a la curva del olvido.",
                admissionTip = "Para Ebbinghaus, la mayor pérdida de información ocurre en las primeras 24 horas tras estudiar si no se realiza un repaso activo.",
                admissionExplanation = "• Elaborar esquemas propios (mapas conceptuales) activa un procesamiento cognitivo profundo significativamente superior a la lectura pasiva."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el método de estudio de lectura comprensiva EPLERR, la fase en la cual el estudiante sintetiza la información organizándola en mapas mentales o cuadros sinópticos se denomina:",
                    options = listOf("Examinar", "Preguntar", "Esquematizar", "Recitar", "Repasar"),
                    correctIndex = 2,
                    explanation = "La fase 'Esquematizar' consiste en estructurar gráficamente las ideas principales y secundarias en esquemas jerarquizados.",
                    subject = "Psicología",
                    semana = 4
                ),
                Challenge(
                    id = "q_psi_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La técnica de gestión del tiempo que propone estudiar en intervalos de alta concentración de 25 minutos intercalados con 5 minutos de pausa breve se denomina:",
                    options = listOf("Método Cornell", "Técnica Pomodoro", "Matriz de Deming", "Heurística de disponibilidad", "Escala de Likert"),
                    correctIndex = 1,
                    explanation = "La técnica Pomodoro divide el trabajo en intervalos de 25 minutos seguidos de pausas de 5 minutos para mantener la frescura mental.",
                    subject = "Psicología",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: BÚSQUEDA DE IDENTIDAD Y AUTOESTIMA (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "psi_t05_s01",
            subjectId = "psicologia",
            semana = 5,
            subtema = "5.1 Identidad en la Adolescencia, Autoestima y Estilos de Comunicación",
            title = "Búsqueda de la Identidad, Autoestima y Comunicación Asertiva",
            theory = LessonTheory(
                id = "th_psi_t05_s01",
                asignatura = "Psicología",
                semana = 5,
                titulo = "La Identidad, la Autoestima y la Asertividad",
                resumen = "• La Identidad en la Adolescencia (Erik Erikson):\n  - Crisis psicosocial característica: **Identidad vs. Confusión de Roles**.\n  - El adolescente busca responder a la pregunta ontológica *¿Quién soy yo?*, consolidando un autoconcepto integrado frente a la influencia del grupo de pares.\n  - Estados de Identidad (James Marcia): Identidad Difusa, Identidad Moratoria (en búsqueda activa), Identidad Hipotecada (adopta imposiciones familiares) e Identidad Lograda (compromiso maduro autónomo).\n\n• La Autoestima y sus Dimensiones:\n  - Valoración afectiva global y juicio evaluativo positivo o negativo que una persona hace de sí misma.\n  - **La Escalera de la Autoestima**:\n    1. Autoconocimiento (conocer virtudes y defectos).\n    2. Autoconcepto (creencias sobre la propia imagen).\n    3. Autoevaluación (juicio ético interno sobre lo que beneficia o daña).\n    4. Autoaceptación (admitir la realidad propia sin culpas desmedidas).\n    5. Autorespeto (hacer valer los propios derechos y necesidades).\n    6. **Autoestima** (síntesis de amor propio y autoeficacia).\n\n• Estilos de Comunicación Interpersonal:\n  1. **Pasivo**: Sumiso; no expresa sus opiniones ni defiende sus derechos por miedo al conflicto.\n  2. **Agresivo**: Impone sus deseos mediante violencia verbal, desprecio y atropello de los demás.\n  3. **Asertivo**: Expresa sus ideas, sentimientos y derechos con claridad, firmeza y serenidad, respetando siempre los derechos y opiniones ajenas.",
                conceptosClave = listOf(
                    "Erik Erikson: Crisis de Identidad vs Confusión de Roles en la adolescencia",
                    "James Marcia: Moratoria vocacional e Identidad lograda",
                    "Escalera de la autoestima: Autoconocimiento -> Autoconcepto -> Autoaceptación -> Autoestima",
                    "Estilo Asertivo: Defensa clara de los propios derechos con respeto mutuo irrestricto"
                ),
                formulas = listOf(
                    "\\text{Autoestima} = \\text{Autoconocimiento} + \\text{Autoaceptación} + \\text{Sentido de Autoeficacia}",
                    "\\text{Asertividad} = \\text{Firmeza en la propia opinión} \\cap \\text{Respeto innegociable al interlocutor}"
                ),
                formulaName = "Ecuación de la Madurez Socioemocional",
                formulaLatex = "\\text{Comunicación Asertiva} \\implies \\text{No Pasividad (Sumisión)} \\; \\& \\; \\text{No Agresividad (Violencia)}",
                formulaDescription = "Punto de equilibrio conductual e interpersonal.",
                admissionTip = "La persona ASERTIVA no es aquella que 'siempre gana' discusiones, sino aquella que sabe decir 'no' y comunicar sus posturas sin agredir ni someterse.",
                admissionExplanation = "• La identidad hipotecada ocurre cuando el joven asume una carrera universitaria solo por satisfacer el mandato de sus padres sin reflexionar por sí mismo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la teoría del desarrollo psicosocial de Erik Erikson, la crisis central que enfrenta el ser humano durante la etapa de la adolescencia es:",
                    options = listOf(
                        "Confianza vs. Desconfianza",
                        "Iniciativa vs. Culpa",
                        "Identidad vs. Confusión de roles",
                        "Intimidad vs. Aislamiento",
                        "Generatividad vs. Estancamiento"
                    ),
                    correctIndex = 2,
                    explanation = "La crisis propia de la adolescencia según Erikson es la consolidación de la Identidad personal frente a la Confusión de roles.",
                    subject = "Psicología",
                    semana = 5
                ),
                Challenge(
                    id = "q_psi_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un estudiante universitario que expresa su desacuerdo ante una injusticia de manera serena, firme y respetuosa, sin alzar la voz ni ofender a sus compañeros, demuestra un estilo de comunicación:",
                    options = listOf("Agresivo", "Pasivo", "Asertivo", "Manipulador", "Inhibido"),
                    correctIndex = 2,
                    explanation = "El estilo asertivo defiende las propias posturas con claridad y firmeza sin agredir al interlocutor.",
                    subject = "Psicología",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: MOTIVACIÓN Y AFECTIVIDAD HUMANA (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "psi_t06_s01",
            subjectId = "psicologia",
            semana = 6,
            subtema = "6.1 Procesos Afectivos, Ciclo Motivacional y Jerarquía de Maslow",
            title = "Afectividad Humana y Teorías de la Motivación (Pirámide de Maslow)",
            theory = LessonTheory(
                id = "th_psi_t06_s01",
                asignatura = "Psicología",
                semana = 6,
                titulo = "La Vida Afectiva y los Procesos Motivacionales",
                resumen = "• Procesos Afectivos:\n  Conjunto de vivencias subjetivas que reflejan el agrado o desagrado del individuo ante los estímulos del medio interno o externo.\n  - **Emociones**: Respuestas afectivas súbitas, breves e intensas acompañadas de marcados cambios fisiológicos vegetativos (miedo, ira, alegría, asco, sorpresa, tristeza).\n  - **Sentimientos**: Procesos afectivos más estables, profundos y duraderos de base sociocultural, con escasa alteración fisiológica (amor, gratitud, patriotismo).\n  - **Pasiones**: Estados afectivos intensos y absorbentes que polarizan la energía de la persona hacia un objetivo único (pasiones superiores como el arte o la ciencia; inferiores como el juego).\n  - **Estados de Ánimo**: Fondo afectivo generalizado y prolongado que matiza la experiencia cotidiana.\n\n• La Motivación Humana:\n  Proceso dinámico que impulsa, orienta y mantiene la conducta orientada a un fin o meta.\n  - **Ciclo Motivacional**: Estado de equilibrio -> Estímulo -> Necesidad -> Estado de tensión -> Comportamiento motivado -> Satisfacción (Homeostasis).\n  - **Motivación Intrínseca vs. Extrínseca**:\n    * *Intrínseca*: El motor de la conducta es la satisfacción interna, curiosidad y disfrute de la tarea misma.\n    * *Extrínseca*: La conducta busca recompensas externas o evitar castigos (premios, dinero, notas).\n\n• La Jerarquía de Necesidades de Abraham Maslow:\n  1. Necesidades Fisiológicas (respirar, comer, dormir).\n  2. Necesidades de Seguridad (física, económica, salud).\n  3. Necesidades de Pertenencia y Amor / Afiliación (amigos, familia, pareja).\n  4. Necesidades de Estima / Reconocimiento (autoestima, respeto, prestigio).\n  5. Necesidad de **Autorrealización** (cúspide del desarrollo del potencial humano).",
                conceptosClave = listOf(
                    "Diferencia afectiva: Emoción (corta, intensa, biológica) vs Sentimiento (estable, duradero, social)",
                    "Motivación Intrínseca (por satisfacción interna) vs Extrínseca (por recompensa o castigo exterior)",
                    "Pirámide de Maslow: 1. Fisiológicas -> 2. Seguridad -> 3. Afiliación -> 4. Estima -> 5. Autorrealización",
                    "Homeostasis: Restablecimiento del equilibrio tras la satisfacción de la necesidad"
                ),
                formulas = listOf(
                    "\\text{Pirámide de Maslow}: \\; \\text{Fisiología} \\to \\text{Seguridad} \\to \\text{Afiliación} \\to \\text{Estima} \\to \\text{Autorrealización}",
                    "\\text{Motivación Intrínseca} \\implies \\text{Autonomía} + \\text{Competencia} + \\text{Sentido Propio}"
                ),
                formulaName = "Jerarquía Piramidal de Maslow",
                formulaLatex = "\\text{Conducta Motivada} = \\text{Necesidad (Déficit)} \\xrightarrow{\\text{Tensión}} \\text{Acción} \\xrightarrow{\\text{Logro}} \\text{Homeostasis}",
                formulaDescription = "Secuencia del ciclo homeostático motivacional.",
                admissionTip = "Para Maslow, las necesidades superiores (autorrealización) solo pueden emerger y orientar la conducta cuando las necesidades básicas inferiores (fisiológicas y de seguridad) están suficientemente satisfechas.",
                admissionExplanation = "• Las seis emociones básicas universales identificadas por Paul Ekman en todas las culturas son: alegría, tristeza, miedo, ira, asco y sorpresa."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la cúspide de la pirámide de la jerarquía de necesidades humanas formulada por Abraham Maslow se encuentra la necesidad de:",
                    options = listOf("Seguridad física", "Afiliación y afecto", "Estima y reputación", "Autorrealización", "Homeostasis biológica"),
                    correctIndex = 3,
                    explanation = "La autorrealización (desarrollo pleno de los potenciales y talentos individuales) corona la cima de la pirámide de Maslow.",
                    subject = "Psicología",
                    semana = 6
                ),
                Challenge(
                    id = "q_psi_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un estudiante resuelve complejos problemas matemáticos durante horas por puro placer intelectual y curiosidad científica, sin esperar premios ni notas adicionales. Su conducta responde a una motivación:",
                    options = listOf("Extrínseca", "Intrínseca", "Fisiológica primaria", "De evitación de castigo", "Inconsciente reprimida"),
                    correctIndex = 1,
                    explanation = "La motivación intrínseca proviene del disfrute inherente y la satisfacción interna que genera la propia actividad.",
                    subject = "Psicología",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: INTELIGENCIA EMOCIONAL (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "psi_t07_s01",
            subjectId = "psicologia",
            semana = 7,
            subtema = "7.1 La Inteligencia Emocional de Daniel Goleman y Habilidades Sociales",
            title = "Inteligencia Emocional (Daniel Goleman): Autorregulación y Empatía",
            theory = LessonTheory(
                id = "th_psi_t07_s01",
                asignatura = "Psicología",
                semana = 7,
                titulo = "La Teoría de la Inteligencia Emocional",
                resumen = "• Inteligencia Emocional (Daniel Goleman, 1995):\n  Capacidad humana de reconocer nuestros propios sentimientos y los ajenos, motivarnos a nosotros mismos y manejar adecuadamente las relaciones interpersonales.\n\n• Los Cinco Componentes Canónicos (Goleman):\n  1. **Autoconciencia Emocional**: Capacidad de reconocer una emoción en el instante en que surge y comprender su impacto en nuestras decisiones.\n  2. **Autorregulación o Autocontrol**: Capacidad de modular y canalizar las emociones perturbadoras e impulsos sin dejarse arrastrar por ellos (tolerancia a la frustración y resiliencia).\n  3. **Automotivación**: Orientar las emociones hacia el cumplimiento de objetivos vitales postergando las gratificaciones inmediatas.\n  4. **Empatía**: Capacidad de sintonizar y ponerse en el lugar psicológico del otro, captando sus estados anímicos y necesidades afectivas.\n  5. **Habilidades Sociales**: Manejo asertivo de relaciones humanas, liderazgo, cooperación y resolución dialógica de conflictos.\n\n• Neurobiología de las Emociones:\n  - La **Amígdala** (sistema límbico): Centro de las respuestas automáticas de alerta y miedo; puede producir el 'secuestro amigdalino' ante una emoción desbordante.\n  - La **Corteza Prefrontal**: Frena y modula racionalmente la respuesta impulsiva de la amígdala.",
                conceptosClave = listOf(
                    "Daniel Goleman: Popularización de la Inteligencia Emocional (1995)",
                    "Cinco pilares: Autoconciencia, Autorregulación, Automotivación, Empatía y Habilidades Sociales",
                    "Secuestro amigdalino: Respuesta emocional instintiva que anula temporalmente la corteza prefrontal",
                    "Empatía: Ponerse en el lugar cognitivo y afectivo del semejante"
                ),
                formulas = listOf(
                    "\\text{Inteligencia Emocional} = \\text{Competencias Intrapersonales} + \\text{Competencias Interpersonales}",
                    "\\text{Freno Racional} \\to \\text{Corteza Prefrontal} \\longleftrightarrow \\text{Amígdala (Impulso Límbico)}"
                ),
                formulaName = "Modelo Pentagonal de Daniel Goleman",
                formulaLatex = "\\text{IE} = \\text{Autoconciencia} \\oplus \\text{Autocontrol} \\oplus \\text{Automotivación} \\oplus \\text{Empatía} \\oplus \\text{Habilidades Sociales}",
                formulaDescription = "Integración de destrezas afectivas para el éxito adaptativo.",
                admissionTip = "La EMPATÍA consiste en entender lo que siente otra persona DESDE su perspectiva, sin juzgarla; no es sentir lástima ni estar necesariamente de acuerdo con ella.",
                admissionExplanation = "• Daniel Goleman demostró que el Coeficiente Emocional (CE) predice mejor el éxito en la vida y el liderazgo que el tradicional Coeficiente Intelectual (CI)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la teoría de la inteligencia emocional formulada por Daniel Goleman, la habilidad de reconocer y comprender las emociones y sentimientos de los demás se denomina:",
                    options = listOf("Autorregulación", "Automotivación", "Empatía", "Autoconocimiento", "Resiliencia"),
                    correctIndex = 2,
                    explanation = "La empatía es la capacidad interpersonal para ponerse en el lugar del otro y comprender sus emociones.",
                    subject = "Psicología",
                    semana = 7
                ),
                Challenge(
                    id = "q_psi_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La estructura subcortical del sistema límbico que actúa como centro del procesamiento y detonante de las emociones intensas como el miedo y la ira es:",
                    options = listOf("El cuerpo calloso", "La amígdala cerebral", "El lóbulo occipital", "El cerebelo", "La corteza somatosensorial"),
                    correctIndex = 1,
                    explanation = "La amígdala cerebral es la estructura neurobiológica clave para el procesamiento de las respuestas emocionales de miedo, ira y supervivencia.",
                    subject = "Psicología",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: PERSONALIDAD, TEMPERAMENTO Y CARÁCTER (SEMANA 8)
        // =========================================================================
        LessonNode(
            id = "psi_t08_s01",
            subjectId = "psicologia",
            semana = 8,
            subtema = "8.1 Personalidad: Temperamento, Carácter y Teorías Tipológicas",
            title = "Estructura de la Personalidad: Temperamento vs. Carácter y Teorías de la Personalidad",
            theory = LessonTheory(
                id = "th_psi_t08_s01",
                asignatura = "Psicología",
                semana = 8,
                titulo = "La Personalidad: Bases Biológicas y Psicosociales",
                resumen = "• Definición de Personalidad:\n  Organización dinámica interna de los sistemas psicofísicos que determina el patrón de pensamientos, emociones y conductas característico y distintivo de una persona.\n\n• Componentes de la Personalidad:\n  1. **Temperamento (Biológico e Inédito)**:\n     - Base hereditaria, genética y neurofisiológica de la personalidad (reactividad del sistema nervioso y sistema endocrino).\n     - Es innato, difícilmente modificable y se manifiesta desde el nacimiento.\n  2. **Carácter (Social y Adquirido)**:\n     - Conjunto de rasgos morales y conductuales adquiridos mediante la socialización, la educación y el aprendizaje en la familia y la escuela.\n     - Es moldeable, consciente y regulado por la voluntad moral.\n\n• Teorías Clásicas de la Personalidad:\n  - **Tipología de los Humores (Hipócrates y Galeno)**: Sanguíneo (sangre / sociable), Colérico (bilis amarilla / irritable), Melancólico (bilis negra / triste) y Flemático (flema / apático).\n  - **Teoría de los Rasgos de Carl Jung**: Introversión (orientado al mundo interior) vs. Extroversión (orientado al mundo exterior).\n  - **Los Cinco Grandes (Big Five - Goldberg / McCrae & Costa)**:\n    1. Apertura a la experiencia.\n    2. Responsabilidad (Escrupulosidad).\n    3. Extraversión.\n    4. Amabilidad (Afabilidad).\n    5. Neuroticismo (Inestabilidad emocional).\n\n• Teoría Psicoanalítica de Freud (El Aparato Psíquico):\n  - **Ello (Id)**: Polo biológico inconsciente; principio del placer inmediato.\n  - **Yo (Ego)**: Instancia consciente ejecutiva; principio de realidad; equilibra los impulsos del Ello con las exigencias del Superyó mediante **mecanismos de defensa** (represión, sublimación, proyección, racionalización).\n  - **Superyó (Superego)**: Polo moral y normativo; el ideal del yo y la conciencia moral introyectada.",
                conceptosClave = listOf(
                    "Temperamento: Componente hereditario, biológico e innato",
                    "Carácter: Componente adquirido, social, educativo y moral",
                    "Big Five (Cinco Grandes): Apertura, Responsabilidad, Extraversión, Amabilidad y Neuroticismo",
                    "Aparato psíquico freudiano: Ello (placer), Yo (realidad) y Superyó (moral)"
                ),
                formulas = listOf(
                    "\\text{Personalidad} = \\text{Temperamento (Biológico/Innato)} + \\text{Carácter (Social/Adquirido)}",
                    "\\text{Aparato Psíquico} \\to \\text{Ello (Pulsión)} \\; \\longleftrightarrow \\; \\text{Yo (Mediador)} \\; \\longleftrightarrow \\; \\text{Superyó (Deber)}"
                ),
                formulaName = "Fórmula Estructural de la Personalidad",
                formulaLatex = "\\text{Yo (Ego)} = \\text{Principio de Realidad} \\; (\\text{Aplica Mecanismos de Defensa})",
                formulaDescription = "Organización psicológica según el psicoanálisis y la teoría de rasgos.",
                admissionTip = "Diferencia clásica de admisión: El TEMPERAMENTO no se aprende ni se enseña (es genético); el CARÁCTER se forma a lo largo de la vida con la educación y las normas morales.",
                admissionExplanation = "• En los mecanismos de defensa de Freud, la 'sublimación' es la canalización productiva de un impulso inaceptable hacia fines socialmente nobles (ej. arte, ciencia o deporte)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El componente de la personalidad determinado genéticamente por factores neuroendocrinos y hereditarios que no depende de la educación ni del aprendizaje se denomina:",
                    options = listOf("Carácter", "Temperamento", "Superyó", "Autoconcepto", "Identidad moratoria"),
                    correctIndex = 1,
                    explanation = "El temperamento es la base biológica e innata de la personalidad, regulada por el sistema nervioso y el sistema hormonal.",
                    subject = "Psicología",
                    semana = 8
                ),
                Challenge(
                    id = "q_psi_t08_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el modelo psicoanalítico de Sigmund Freud, la instancia psíquica que se rige por el 'principio de realidad' y busca armonizar los impulsos del Ello con las censuras morales del Superyó es:",
                    options = listOf("El Inconsciente colectivo", "El Yo (Ego)", "La Libido", "El Arquetipo", "El Complejo de Edipo"),
                    correctIndex = 1,
                    explanation = "El Yo (Ego) opera bajo el principio de realidad, actuando como mediador consciente entre las pulsiones instintivas y las normas morales.",
                    subject = "Psicología",
                    semana = 8
                )
            )
        ),

        // =========================================================================
        // TEMA 09: APRENDIZAJE: TEORÍAS Y ESTILOS (SEMANA 9)
        // =========================================================================
        LessonNode(
            id = "psi_t09_s01",
            subjectId = "psicologia",
            semana = 9,
            subtema = "9.1 Teorías del Aprendizaje: Condicionamiento Clásico, Operante y Aprendizaje Social",
            title = "Teorías del Aprendizaje: Pavlov, Skinner, Bandura y Ausubel",
            theory = LessonTheory(
                id = "th_psi_t09_s01",
                asignatura = "Psicología",
                semana = 9,
                titulo = "El Aprendizaje: Procesos y Modelos Teóricos",
                resumen = "• Definición de Aprendizaje:\n  Cambio relativamente estable en la conducta o en los esquemas cognitivos como resultado de la práctica, la experiencia o la interacción con el entorno.\n\n• Principales Modelos Teóricos:\n\n1. **Condicionamiento Clásico o Respondiente (Iván Pavlov y John Watson)**:\n   - Aprendizaje por **asociación contigua de estímulos**:\n     * **Estímulo Incondicionado (EI)**: Desencadena una respuesta refleja natural (ej. la comida).\n     * **Respuesta Incondicionada (RI)**: Reacción refleja automática (ej. la salivación ante la comida).\n     * **Estímulo Neutro (EN)**: Inicialmente no provoca la respuesta (ej. el sonido de la campana).\n     * **Estímulo Condicionado (EC)**: El estímulo neutro tras asociarse repetidamente al EI provoca la respuesta.\n     * **Respuesta Condicionada (RC)**: Conducta aprendida provocada por el EC (salivación solo al oír la campana).\n\n2. **Condicionamiento Operante o Instrumental (B.F. Skinner)**:\n   - La conducta se aprende y modifica en función de sus **consecuencias**:\n     * **Refuerzo Positivo**: Se entrega un estímulo gratificante para **aumentar** la conducta.\n     * **Refuerzo Negativo**: Se elimina un estímulo aversivo o desagradable para **aumentar** la conducta.\n     * **Castigo Positivo**: Se aplica un estímulo desagradable para **disminuir o extinguir** la conducta.\n     * **Castigo Negativo (Costo de respuesta)**: Se retira un estímulo placentero para **disminuir** la conducta.\n\n3. **Aprendizaje Social o Vicario (Albert Bandura)**:\n   - Aprendizaje por **observación e imitación de modelos** (experimento del muñeco Bobo). Procesos: Atención, Retención, Reproducción motora y Motivación.\n\n4. **Aprendizaje Significativo (David Ausubel)**:\n   - El nuevo conocimiento se ancla de forma sustantiva en los conocimientos previos (saberes previos o subsunsores).",
                conceptosClave = listOf(
                    "Condicionamiento Clásico (Pavlov): Asociación de estímulos (EI -> RI; EC -> RC)",
                    "Condicionamiento Operante (Skinner): Refuerzo (aumenta conducta) vs Castigo (disminuye conducta)",
                    "Refuerzo negativo: AUMENTA la conducta al retirar un estímulo desagradable",
                    "Aprendizaje Vicario (Bandura): Imitación de modelos observados",
                    "Aprendizaje Significativo (Ausubel): Vinculación lógica con los saberes previos"
                ),
                formulas = listOf(
                    "\\text{Cond. Clásico}: \\; \\text{EC (Campana)} + \\text{EI (Comida)} \\longrightarrow \\text{RC (Salivación)}",
                    "\\text{Refuerzo} \\implies \\text{Aumenta la Frecuencia}",
                    "\\text{Castigo} \\implies \\text{Disminuye o Extingue la Frecuencia}"
                ),
                formulaName = "Fórmulas de Modificación de Conducta",
                formulaLatex = "\\text{Operante}: \\; \\text{Estímulo Discriminativo} \\to \\text{Conducta} \\to \\text{Consecuencia (Refuerzo / Castigo)}",
                formulaDescription = "Esquema funcional de la contingencia triple skinneriana.",
                admissionTip = "¡El error más común en admisión!: El REFUERZO NEGATIVO NO es un castigo; es un refuerzo y por lo tanto AUMENTA la conducta (ej. tomar una pastilla para quitarse un dolor de cabeza aumenta la conducta de tomar pastillas).",
                admissionExplanation = "• En el condicionamiento clásico, la extinción ocurre cuando se presenta repetidamente el estímulo condicionado sin el estímulo incondicionado hasta que la respuesta condicionada desaparece."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un padre le retira a su hijo el teléfono móvil durante el fin de semana por haber obtenido bajas calificaciones, logrando que el estudiante reduzca sus horas de juego. Este procedimiento corresponde a un:",
                    options = listOf("Refuerzo positivo", "Refuerzo negativo", "Castigo negativo o costo de respuesta", "Castigo positivo", "Condicionamiento vicario"),
                    correctIndex = 2,
                    explanation = "El castigo negativo consiste en retirar un estímulo placentero (el celular) con el fin de disminuir una conducta indeseada.",
                    subject = "Psicología",
                    semana = 9
                ),
                Challenge(
                    id = "q_psi_t09_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En los experimentos de Iván Pavlov, la salivación natural de un perro hambriento provocada de forma automática por la presencia de carne fresca constituye una:",
                    options = listOf("Respuesta condicionada", "Respuesta incondicionada", "Respuesta operante", "Respuesta vicaria", "Respuesta contingente"),
                    correctIndex = 1,
                    explanation = "La salivación provocada directamente por la comida sin previo aprendizaje es una Respuesta Incondicionada (RI) refleja.",
                    subject = "Psicología",
                    semana = 9
                )
            )
        ),

        // =========================================================================
        // TEMA 10: PROCESOS PSICOLÓGICOS BÁSICOS (SEMANA 10)
        // =========================================================================
        LessonNode(
            id = "psi_t10_s01",
            subjectId = "psicologia",
            semana = 10,
            subtema = "10.1 Sensación, Percepción (Leyes de la Gestalt), Memoria y Atención",
            title = "Procesos Cognitivos Básicos: Sensación, Percepción, Memoria y Atención",
            theory = LessonTheory(
                id = "th_psi_t10_s01",
                asignatura = "Psicología",
                semana = 10,
                titulo = "La Cognición Básica: De la Sensación a la Memoria",
                resumen = "• La Sensación:\n  Proceso neurofisiológico de captación y transducción de estímulos físicos, químicos o mecánicos por los receptores sensoriales.\n  - Umbrales Sensoriales (Weber y Fechner):\n    * **Umbral Absoluto (Mínimo)**: Intensidad mínima requerida de un estímulo para ser detectado por los sentidos el 50% de las veces.\n    * **Umbral Diferencial (DMP)**: Diferencia mínima requerida entre dos estímulos para percibir que son distintos.\n\n• La Percepción:\n  Proceso cognitivo de integración, discriminación e interpretación consciente de las sensaciones en el cerebro.\n  - Leyes de la Percepción (Gestalt):\n    * **Ley de Figura y Fondo**: El cerebro discrimina un objeto central nítido (figura) del contexto difuso que lo rodea (fondo).\n    * **Ley de Cierre o Clausura**: Tendencia a completar visualmente los contornos discontinuos de figuras incompletas.\n    * **Ley de Proximidad**: Los elementos cercanos en el espacio tienden a percibirse como un solo grupo.\n    * **Ley de Semejanza**: Los elementos parecidos en forma, color o tamaño se perciben como un conjunto.\n  - Alteraciones Perceptivas:\n    * **Ilusión**: Percepción falseada o distorsionada de un estímulo real (objetiva o subjetiva).\n    * **Alucinación (Pseudopercepción)**: Percepción de un objeto inexistente sin estímulo real (típica en psicosis y consumo de drogas).\n\n• La Memoria (Modelo Multialmacén de Atkinson y Shiffrin):\n  1. **Memoria Sensorial (MS)**: Capacidad ilimitada pero fugaz (milisegundos: icónica y ecoica).\n  2. **Memoria a Corto Plazo (MCP / Operativa)**: Capacidad limitada (7 ± 2 elementos de Miller) y duración breve (20 a 30 segundos).\n  3. **Memoria a Largo Plazo (MLP)**: Almacenamiento duradero e ilimitado:\n     - *Explícita / Declarativa*: Semántica (conocimientos generales) y Episódica (biográfica con fecha y lugar).\n     - *Implícita / No declarativa*: Procedimental (hábitos motores como manejar o nadar).",
                conceptosClave = listOf(
                    "Sensación (transducción receptora) vs Percepción (interpretación cerebral consciente)",
                    "Umbral Absoluto (mínimo detectable) vs Umbral Diferencial (diferencia mínima perceptible)",
                    "Leyes Gestalt: Figura-fondo, Cierre, Proximidad y Semejanza",
                    "Ilusión (con estímulo real) vs Alucinación (sin estímulo real objetivo)",
                    "Memoria MLP: Declarativa (Semántica y Episódica) vs Procedimental (hábitos)"
                ),
                formulas = listOf(
                    "\\text{Atkinson y Shiffrin}: \\; \\text{Memoria Sensorial} \\to \\text{Memoria a Corto Plazo (7 \\pm 2)} \\to \\text{Memoria a Largo Plazo}",
                    "\\text{Ilusión} \\to \\text{Estímulo Real Presente}, \\quad \\text{Alucinación} \\to \\text{Estímulo Real Ausente}"
                ),
                formulaName = "Arquitectura del Procesamiento Cognitivo",
                formulaLatex = "\\text{Cognición} = \\text{Sensación (Receptores)} \\to \\text{Percepción (Cortex)} \\to \\text{Memoria (Consolidación)}",
                formulaDescription = "Ruta de procesamiento de la información en el sistema nervioso humano.",
                admissionTip = "¡Diferencia clave en admisión!: La ILUSIÓN tiene objeto real pero se percibe distorsionado (ej. confundir un abrigo colgado con un ladrón en la penumbra); la ALUCINACIÓN no tiene objeto real (escuchar voces cuando nadie ha hablado).",
                admissionExplanation = "• El hipocampo es la estructura del sistema límbico indispensable para consolidar los recuerdos de la memoria a corto plazo hacia la memoria a largo plazo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un transeúnte camina de noche por un callejón solitario y, al observar una sombra proyectada por ramas secas, se asusta creyendo que es una persona armada. Esta anomalía perceptiva con presencia de un estímulo real distorsionado es una:",
                    options = listOf("Alucinación auditiva", "Ilusión subjetiva", "Afasia de Wernicke", "Agnosia táctil", "Paramnesia"),
                    correctIndex = 1,
                    explanation = "La ilusión es una percepción errónea o deformada de un objeto o estímulo externo que sí existe en la realidad.",
                    subject = "Psicología",
                    semana = 10
                ),
                Challenge(
                    id = "q_psi_t10_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El recuerdo autobiográfico que tiene un estudiante sobre el día de su fiesta de promoción de colegio secundario, con fecha y lugar específicos, se almacena en la:",
                    options = listOf(
                        "Memoria episódica",
                        "Memoria semántica",
                        "Memoria sensorial ecoica",
                        "Memoria procedimental motora",
                        "Memoria implícita subliminal"
                    ),
                    correctIndex = 0,
                    explanation = "La memoria episódica almacena vivencias personales y autobiográficas contextualizadas en un tiempo y espacio concretos.",
                    subject = "Psicología",
                    semana = 10
                )
            )
        ),

        // =========================================================================
        // TEMA 11: INTELIGENCIA Y TEORÍAS MÚLTIPLES (SEMANA 11)
        // =========================================================================
        LessonNode(
            id = "psi_t11_s01",
            subjectId = "psicologia",
            semana = 11,
            subtema = "11.1 Inteligencia: Teorías Factoriales, Inteligencias Múltiples y Triárquica",
            title = "La Inteligencia: Teorías Factoriales, Gardner y Sternberg",
            theory = LessonTheory(
                id = "th_psi_t11_s01",
                asignatura = "Psicología",
                semana = 11,
                titulo = "Modelos Teóricos de la Inteligencia",
                resumen = "• Definición de Inteligencia:\n  Capacidad cognitiva global de un individuo para actuar con propósito determinado, pensar de forma abstracta, resolver problemas nuevos y adaptarse eficazmente al medio ambiente.\n\n• Medición Tradicional: El Coeficiente Intelectual (CI):\n  - William Stern formula el CI en 1912: CI = \\frac{EM}{EC} \\times 100, donde EM es la Edad Mental evaluada por el test y EC es la Edad Cronológica real.\n  - Clasificación normal: 90 - 109 (Promedio normal).\n\n• Teorías Factoriales Clásicas:\n  - **Teoría Bifactorial (Charles Spearman)**: Postula un **Factor G** (inteligencia general hereditaria transversal) y **Factores S** (habilidades específicas para tareas concretas).\n  - **Teoría de las Habilidades Mentales Primarias (Louis Thurstone)**: Rechaza el factor G; propone 7 aptitudes independientes (fluidez verbal, comprensión verbal, espacial, numérica, etc.).\n\n• Teorías Contemporáneas:\n  1. **Teoría de las Inteligencias Múltiples (Howard Gardner)**:\n     - La mente humana no es unitaria; propone **8 inteligencias autónomas**:\n       * Lingüística, Lógico-Matemática, Espacial, Musical, Corporal-Cinestésica, Intrapersonal, Interpersonal y Naturalista.\n  2. **Teoría Triárquica de la Inteligencia (Robert Sternberg)**:\n     - Propone tres subtipos fundamentales de inteligencia:\n       * **Inteligencia Analítica o Componencial**: Capacidad académica para descomponer problemas y evaluar soluciones.\n       * **Inteligencia Creativa o Experiencial**: Capacidad de generar ideas novedosas e innovar ante situaciones inéditas.\n       * **Inteligencia Práctica o Contextual**: Habilidad para adaptarse con éxito a las exigencias cotidianas de la vida real (*'inteligencia de la calle'*).",
                conceptosClave = listOf(
                    "Coeficiente Intelectual (CI) de Stern: (Edad Mental / Edad Cronológica) * 100",
                    "Charles Spearman: Factor General (G) y Factores Específicos (S)",
                    "Howard Gardner: Teoría de las 8 Inteligencias Múltiples autónomas",
                    "Robert Sternberg: Teoría Triárquica (Analítica, Creativa y Práctica)"
                ),
                formulas = listOf(
                    "\\text{Fórmula del CI (William Stern)}: \\; CI = \\frac{EM}{EC} \\times 100",
                    "\\text{Triárquica de Sternberg} = \\text{Analítica (Académica)} + \\text{Creativa (Novedad)} + \\text{Práctica (Contexto)}"
                ),
                formulaName = "Métricas y Modelos de Inteligencia",
                formulaLatex = "\\text{Gardner (8 Inteligencias)} \\implies \\text{Lingüística} \\; \\mid \\; \\text{Lógico-Mat} \\; \\mid \\; \\text{Espacial} \\; \\mid \\; \\dots \\; \\mid \\; \\text{Naturalista}",
                formulaDescription = "Descentralización del concepto de inteligencia más allá de las habilidades lógico-matemáticas.",
                admissionTip = "Si un niño de 10 años (EC = 10) rinde un test y obtiene una edad mental de 12 años (EM = 12), su CI es: (12 / 10) * 100 = 120 (Inteligencia superior).",
                admissionExplanation = "• Howard Gardner demostró que los atletas y bailarines desarrollan una alta inteligencia corporal-cinestésica, la cual es tan válida biológicamente como la inteligencia matemática."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la Teoría Triárquica de la Inteligencia propuesta por Robert Sternberg, la habilidad para resolver problemas prácticos del entorno cotidiano y adaptarse eficazmente al contexto real corresponde a la inteligencia:",
                    options = listOf("Analítica", "Creativa", "Práctica", "Espacial", "Factorial G"),
                    correctIndex = 2,
                    explanation = "La inteligencia práctica o contextual en el modelo triárquico de Sternberg permite resolver dilemas de la vida cotidiana.",
                    subject = "Psicología",
                    semana = 11
                ),
                Challenge(
                    id = "q_psi_t11_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El psicólogo estadounidense que revolucionó el campo educativo al formular la Teoría de las Inteligencias Múltiples (lingüística, cinestésica, espacial, etc.) fue:",
                    options = listOf("Charles Spearman", "Louis Thurstone", "Howard Gardner", "Alfred Binet", "David Wechsler"),
                    correctIndex = 2,
                    explanation = "Howard Gardner postuló en 1983 que no existe una única inteligencia general sino ocho inteligencias independientes.",
                    subject = "Psicología",
                    semana = 11
                )
            )
        ),

        // =========================================================================
        // TEMA 12: FACTORES DE PROTECCIÓN (SEMANA 12)
        // =========================================================================
        LessonNode(
            id = "psi_t12_s01",
            subjectId = "psicologia",
            semana = 12,
            subtema = "12.1 Factores de Protección, Resiliencia y Vínculos Familiares",
            title = "Factores de Protección en la Adolescencia y Desarrollo de la Resiliencia",
            theory = LessonTheory(
                id = "th_psi_t12_s01",
                asignatura = "Psicología",
                semana = 12,
                titulo = "Factores Protectores y Resiliencia Psicológica",
                resumen = "• Factores de Protección:\n  Condiciones individuales, familiares o del entorno social que reducen la probabilidad de emitir conductas de riesgo, amortiguan el impacto de situaciones adversas y promueven un desarrollo psicosocial saludable.\n\n• Niveles de Factores Protectores:\n  1. **Factores Individuales**:\n     - Buena autoestima y autoeficacia.\n     - Inteligencia emocional y habilidades de afrontamiento reflexivo.\n     - Proyecto de vida claro con metas académicas y personales.\n     - Valores éticos y espirituales.\n     - **Resiliencia**: Capacidad psicológica de sobreponerse a traumas, situaciones de dolor o adversidad extrema, saliendo fortalecido y transformado positivamente de la experiencia.\n  2. **Factores Familiares**:\n     - Estilo de crianza **Democrático / Autoritativo** (afecto, comunicación fluida y normas claras con límites consistentes).\n     - Apego seguro y cohesión familiar.\n     - Supervisión y acompañamiento parental positivo.\n  3. **Factores Escolares y Comunitarios**:\n     - Clima escolar inclusivo y motivador; profesores orientadores.\n     - Acceso a actividades deportivas, artísticas y recreativas sanas.\n     - Redes de apoyo comunal y amistades prosociales.",
                conceptosClave = listOf(
                    "Factores de protección: Escudo psicológico que mitiga las conductas de riesgo",
                    "Resiliencia: Capacidad de sobreponerse a la adversidad y salir fortalecido",
                    "Estilo de crianza democrático: Combinación óptima de afecto, diálogo y normas firmes",
                    "Redes de apoyo social e institucional en la comunidad"
                ),
                formulas = listOf(
                    "\\text{Resiliencia} = \\text{Adversidad / Trauma} \\xrightarrow{\\text{Recursos Psicológicos}} \\text{Superación y Crecimiento Personal}",
                    "\\text{Crianza Democrática} = \\text{Alto Afecto y Comunicación} + \\text{Límites y Normas Claras}"
                ),
                formulaName = "Mecanismo de Inmunidad Psicosocial",
                formulaLatex = "\\text{Bienestar Adolescente} = \\text{Factores Protectores} - \\text{Factores de Riesgo}",
                formulaDescription = "Balance adaptativo del desarrollo humano saludable.",
                admissionTip = "El estilo de crianza DEMOCRÁTICO (o autoritativo) es el más saludable: combina afecto y comunicación abierta con normas firmes; se diferencia del 'autoritario' (solo castigo y sin afecto) y del 'permisivo' (solo afecto sin normas).",
                admissionExplanation = "• La resiliencia no es la ausencia de dolor ante la pérdida, sino la capacidad para reconstruir el sentido de la vida pese a las dificultades."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t12_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La capacidad psicológica que posee una persona para superar eventos traumáticos, crisis graves o ambientes desfavorables, saliendo fortalecida de la experiencia, se denomina:",
                    options = listOf("Sublimación", "Resiliencia", "Empatía", "Compensación", "Introyección"),
                    correctIndex = 1,
                    explanation = "La resiliencia es la facultad humana de afrontar la adversidad y adaptarse positivamente reconstruyendo su equilibrio.",
                    subject = "Psicología",
                    semana = 12
                ),
                Challenge(
                    id = "q_psi_t12_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El estilo de crianza familiar considerado el factor protector más eficaz, caracterizado por una alta comunicación, afecto recíproco y establecimiento de normas claras y coherentes, es el:",
                    options = listOf("Estilo autoritario punitivo", "Estilo permisivo indulgente", "Estilo democrático o autoritativo", "Estilo negligente o desapegado", "Estilo sobreprotector dependiente"),
                    correctIndex = 2,
                    explanation = "El estilo democrático equilibra el afecto y la calidez parental con límites claros, fomentando la autonomía y seguridad del adolescente.",
                    subject = "Psicología",
                    semana = 12
                )
            )
        ),

        // =========================================================================
        // TEMA 13: FACTORES DE RIESGO (SEMANA 13)
        // =========================================================================
        LessonNode(
            id = "psi_t13_s01",
            subjectId = "psicologia",
            semana = 13,
            subtema = "13.1 Factores de Riesgo: Adicciones, Trastornos Alimentarios y Ciberadicción",
            title = "Conductas de Riesgo: Drogodependencia, Anorexia, Bulimia y Ludopatía",
            theory = LessonTheory(
                id = "th_psi_t13_s01",
                asignatura = "Psicología",
                semana = 13,
                titulo = "Factores de Riesgo y Conductas Problemáticas",
                resumen = "• Factores de Riesgo en la Adolescencia:\n  Condiciones biológicas, psicológicas o sociales que incrementan la vulnerabilidad de un individuo para involucrarse en conductas dañinas para su salud física, mental o su entorno social.\n\n• Principales Conductas de Riesgo:\n\n1. **Consumo de Sustancias Psicoactivas (Drogodependencia)**:\n   - Drogas Legales (Alcohol y Tabaco) e Ilegales (Marihuana, Cocaína, Sintéticas).\n   - **Tolerancia**: Necesidad de consumir dosis cada vez mayores de la sustancia para lograr el mismo efecto inicial.\n   - **Síndrome de Abstinencia**: Conjunto de síntomas físicos y psicológicos sumamente angustiantes que aparecen al interrumpir bruscamente el consumo.\n   - Dependencia física (fisiológica) y psicológica (ansiedad por consumir).\n\n2. **Trastornos de la Conducta Alimentaria (TCA)**:\n   - **Anorexia Nerviosa**: Distorsión grave de la imagen corporal (dismorfofobia: se ve obeso a pesar de su extrema delgadez), restricción alimentaria severa voluntaria, miedo mórbido a subir de peso y amenorrea en mujeres.\n   - **Bulimia Nerviosa**: Episodios recurrentes de atracones compulsivos incontrolados de comida seguidos de conductas compensatorias purgativas inapropiadas (vómitos autoinducidos, laxantes, ayuno o ejercicio extenuante).\n\n3. **Ciberadicciones y Ludopatía**:\n   - Uso compulsivo y descontrolado de redes sociales, videojuegos o apuestas en línea (ludopatía) que interfiere con los estudios, relaciones familiares y el sueño.",
                conceptosClave = listOf(
                    "Tolerancia (necesidad de mayor dosis) vs Síndrome de abstinencia (malestar por cese del consumo)",
                    "Anorexia nerviosa: Restricción voluntaria extrema y distorsión de la imagen corporal",
                    "Bulimia nerviosa: Atracón compulsivo seguido de conductas purgativas compensatorias (vómitos)",
                    "Ludopatía: Adicción psicológica incontrolada a los juegos de azar o apuestas"
                ),
                formulas = listOf(
                    "\\text{Adicción} = \\text{Dependencia Física / Psicológica} + \\text{Tolerancia} + \\text{Síndrome de Abstinencia}",
                    "\\text{Bulimia Nerviosa} = \\text{Atracón Compulsivo} + \\text{Conducta Purgativa (Vómito)}"
                ),
                formulaName = "Patología de las Conductas de Riesgo",
                formulaLatex = "\\text{Tolerancia} \\implies \\Delta \\text{Dosis para Idéntico Efecto} \\; \\& \\; \\text{Abstinencia} \\implies \\text{Privación}",
                formulaDescription = "Manifestaciones clínicas de los procesos adictivos y trastornos alimentarios.",
                admissionTip = "Diferencia básica en admisión: En la ANOREXIA el paciente se niega a comer por distorsión de su imagen corporal; en la BULIMIA el paciente sí come descontroladamente (atracón) y luego se purga por culpa.",
                admissionExplanation = "• El alcohol es la droga social legal más consumida y es el principal factor de riesgo asociado a accidentes de tránsito y violencia juvenil en el Perú."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t13_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El fenómeno fisiológico y psicológico por el cual una persona con adicción a sustancias requiere dosis progresivamente más elevadas de droga para alcanzar el efecto que antes lograba con dosis menores se denomina:",
                    options = listOf("Dependencia psicológica", "Tolerancia", "Síndrome de abstinencia", "Resiliencia", "Intoxicación aguda"),
                    correctIndex = 1,
                    explanation = "La tolerancia es la adaptación biológica del organismo que exige aumentar la dosis de la sustancia para experimentar los mismos efectos.",
                    subject = "Psicología",
                    semana = 13
                ),
                Challenge(
                    id = "q_psi_t13_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una adolescente presenta una marcada delgadez pero insiste obsesivamente en que tiene sobrepeso, restringiendo drásticamente su ingesta diaria de alimentos. Este cuadro clínico corresponde a:",
                    options = listOf("Bulimia nerviosa", "Anorexia nerviosa", "Ludopatía compulsiva", "Disfuncionalidad somática", "Trastorno de pánico"),
                    correctIndex = 1,
                    explanation = "La anorexia nerviosa se caracteriza por la restricción extrema de comida impulsada por una alteración distorsionada de la propia imagen corporal.",
                    subject = "Psicología",
                    semana = 13
                )
            )
        ),

        // =========================================================================
        // TEMA 14: SALUD SEXUAL Y REPRODUCTIVA (SEMANA 14)
        // =========================================================================
        LessonNode(
            id = "psi_t14_s01",
            subjectId = "psicologia",
            semana = 14,
            subtema = "14.1 Sexualidad Humana: Dimensiones, Identidad y Prevención de ITS",
            title = "Salud Sexual y Reproductiva: Dimensiones, Género y Prevención de ITS",
            theory = LessonTheory(
                id = "th_psi_t14_s01",
                asignatura = "Psicología",
                semana = 14,
                titulo = "La Sexualidad Integral y la Salud Reproductiva",
                resumen = "• La Sexualidad Humana Integral:\n  Dimensión fundamental de la personalidad que abarca el sexo biológico, las identidades, los roles de género, el erotismo, el placer, la intimidad y la reproducción a lo largo de toda la vida.\n\n• Las Cuatro Dimensiones de la Sexualidad:\n  1. **Biológica**: Anatomía genital, sistema hormonal, cromosomas y fisiología de la reproducción.\n  2. **Psicológica**: Afectos, sentimientos, autoconcepto, vivencia del placer e identidad sexual.\n  3. **Sociocultural**: Creencias, normas familiares, valores morales, mitos y roles de género.\n  4. **Ética**: Responsabilidad, consentimiento mutuo y respeto a la dignidad de la pareja.\n\n• Conceptos Clave de la Identidad Sexual:\n  - **Sexo Biológico**: Características genéticas y anatómicas (macho / hembra / intersexual).\n  - **Identidad de Género**: Vivencia interna e individual del género tal como cada persona la siente (hombre / mujer / no binario).\n  - **Rol de Género**: Pautas de conducta, vestimenta y expectativas asignadas por la cultura a cada género.\n  - **Orientación Sexual**: Atracción emocional, afectiva y sexual hacia personas de diferente género (heterosexualidad), del mismo género (homosexualidad) o de más de un género (bisexualidad).\n\n• Infecciones de Transmisión Sexual (ITS) y Prevención:\n  - Infecciones transmitidas principalmente por contacto sexual desprotegido (VIH/SIDA, VPH, Sífilis, Gonorrea, Herpes genital).\n  - El **preservativo o condón** es el único método anticonceptivo de barrera que previene simultáneamente los embarazos no planificados y las Infecciones de Transmisión Sexual (doble protección).",
                conceptosClave = listOf(
                    "Cuatro dimensiones: Biológica (cuerpo), Psicológica (afectos), Sociocultural (normas) y Ética",
                    "Diferenciación: Sexo biológico vs Identidad de género vs Orientación sexual vs Rol de género",
                    "Preservativo: Único método que brinda doble protección (embarazo e ITS/VIH)",
                    "Consentimiento libre, informado y maduro en las relaciones de pareja"
                ),
                formulas = listOf(
                    "\\text{Sexualidad Integral} = \\text{Biológica} + \\text{Psicológica} + \\text{Sociocultural} + \\text{Ética}",
                    "\\text{Doble Protección} = \\text{Prevención de Embarazo No Planificado} + \\text{Prevención de ITS / VIH (Preservativo)}"
                ),
                formulaName = "Dimensiones de la Sexualidad Humana",
                formulaLatex = "\\text{Identidad de Género} \\neq \\text{Orientación Sexual} \\; (\\text{Vivencia del ser} \\neq \\text{Dirección de la atracción})",
                formulaDescription = "Distinciones conceptuales fundamentales de la salud sexual contemporánea.",
                admissionTip = "¡No confundir Identidad de Género con Orientación Sexual!: La Identidad de Género responde a '¿Quién soy yo?' (cómo me percibo a mí mismo); la Orientación Sexual responde a '¿Hacia quién siento atracción afectiva y sexual?'.",
                admissionExplanation = "• El Virus del Papiloma Humano (VPH) es el principal factor etiológico del cáncer de cuello uterino, prevenible mediante la vacuna administrada en la infancia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t14_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La vivencia interna y subjetiva que tiene una persona sobre su propio género, la cual puede o no corresponder con el sexo asignado al nacer, se denomina:",
                    options = listOf("Orientación sexual", "Identidad de género", "Rol biológico", "Estereotipo de género", "Apetito sexual"),
                    correctIndex = 1,
                    explanation = "La identidad de género es la autopercepción íntima e individual que tiene cada ser humano sobre su propio género.",
                    subject = "Psicología",
                    semana = 14
                ),
                Challenge(
                    id = "q_psi_t14_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el único método anticonceptivo que proporciona 'doble protección', evitando simultáneamente el embarazo no planificado y el contagio de ITS como el VIH?",
                    options = listOf(
                        "Las píldoras anticonceptivas orales",
                        "El dispositivo intrauterino (DIU de cobre)",
                        "El preservativo o condón de barrera",
                        "El método del ritmo o calendario",
                        "El implante subdérmico hormonal"
                    ),
                    correctIndex = 2,
                    explanation = "El preservativo (masculino o femenino) es el único método de barrera física capaz de prevenir el contagio de ITS y evitar el embarazo.",
                    subject = "Psicología",
                    semana = 14
                )
            )
        ),

        // =========================================================================
        // TEMA 15: DESARROLLO HUMANO Y ETAPAS (SEMANA 15)
        // =========================================================================
        LessonNode(
            id = "psi_t15_s01",
            subjectId = "psicologia",
            semana = 15,
            subtema = "15.1 Etapas del Desarrollo Humano y Teoría Psicogenética de Piaget",
            title = "Desarrollo Humano: Ciclo Vital y Etapas Cognitivas de Jean Piaget",
            theory = LessonTheory(
                id = "th_psi_t15_s01",
                asignatura = "Psicología",
                semana = 15,
                titulo = "El Ciclo Vital Humano y el Desarrollo Cognitivo",
                resumen = "• El Desarrollo Humano:\n  Proceso de cambios cuantitativos (crecimiento) y cualitativos (maduración y aprendizaje) que experimenta el ser humano a lo largo de su ciclo vital.\n  - Factores Determinantes: **Herencia genética**, **Maduración biológica** y **Medio sociocultural**.\n\n• Etapas del Ciclo Vital:\n  1. **Etapa Prenatal**: Fecundación, período cigótico, embrionario (organogénesis) y fetal.\n  2. **Infancia (0 a 2 años)**: Desarrollo sensoriomotor, apego primario y primeros pasos.\n  3. **Niñez Temprana (2 a 6 años)**: Lenguaje simbólico, juego egocéntrico y fantasía.\n  4. **Niñez Intermedia (6 a 12 años)**: Escolarización, operaciones concretas, juego reglado y socialización.\n  5. **Adolescencia (12 a 18 años)**: Pubertad (maduración sexual), pensamiento formal abstracto, búsqueda de identidad y autonomía.\n  6. **Adultez Temprana / Joven (18 a 40 años)**: Plenitud física, inserción laboral, consolidación de pareja y familia.\n  7. **Adultez Intermedia (40 a 65 años)**: Consolidación profesional, climaterio y crisis de la mitad de la vida.\n  8. **Adultez Tardía o Senectud (65 años a más)**: Disminución biológica sensorial, sabiduría reflexiva e integridad del yo.\n\n• Estadios del Desarrollo Cognitivo de Jean Piaget:\n  1. **Sensorio-motriz (0 a 2 años)**: Reflejos innatos y logro cardinal de la **permanencia del objeto** (sabe que un objeto existe aunque esté oculto a la vista).\n  2. **Preoperacional (2 a 7 años)**: Función simbólica (lenguaje y dibujo), **egocentrismo infantil**, animismo (dar vida a objetos) y centración.\n  3. **Operaciones Concretas (7 a 12 años)**: Razonamiento lógico sobre objetos palpables reales, reversibilidad del pensamiento y noción de **conservación** (volumen, materia y peso).\n  4. **Operaciones Formales (12 años a más)**: Pensamiento hipotético-deductivo, razonamiento abstracto, proposicional y proyectivo.",
                conceptosClave = listOf(
                    "Jean Piaget: 1. Sensoriomotriz -> 2. Preoperacional -> 3. Operaciones Concretas -> 4. Operaciones Formales",
                    "Permanencia del objeto: Logro fundamental del estadio sensoriomotor (alrededor de los 8 meses)",
                    "Egocentrismo y animismo: Típicos del estadio preoperacional (incapacidad de adoptar perspectiva ajena)",
                    "Noción de conservación y reversibilidad: Logro central de las operaciones concretas",
                    "Pensamiento hipotético-deductivo: Característico del estadio de operaciones formales en adolescentes"
                ),
                formulas = listOf(
                    "\\text{Estadio Sensoriomotriz (0-2 años)} \\to \\text{Permanencia del Objeto}",
                    "\\text{Estadio Preoperacional (2-7 años)} \\to \\text{Función Simbólica} + \\text{Egocentrismo}",
                    "\\text{Operaciones Concretas (7-12 años)} \\to \\text{Reversibilidad} + \\text{Conservación de la Materia}",
                    "\\text{Operaciones Formales (12+ años)} \\to \\text{Pensamiento Hipotético-Deductivo (Abstracto)}"
                ),
                formulaName = "Estadios del Desarrollo Cognitivo de Piaget",
                formulaLatex = "\\text{Piaget}: \\; \\text{Sensoriomotor (0-2)} \\to \\text{Preoperacional (2-7)} \\to \\text{Op. Concretas (7-12)} \\to \\text{Op. Formales (12+)}",
                formulaDescription = "Progresión de las estructuras cognitivas desde la acción física hasta la abstracción lógica pura.",
                admissionTip = "En admisión UNSA: Si el niño comprende que dos bolas de plastilina idénticas siguen teniendo la misma cantidad de masa aunque una se aplane en forma de salchicha, ha alcanzado la NOCIÓN DE CONSERVACIÓN (Operaciones Concretas).",
                admissionExplanation = "• El animismo preoperacional se evidencia cuando un niño de 4 años tropieza con una mesa y le grita '¡Mesa mala, por qué me pegaste!' atribuyéndole vida e intención al mueble."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_psi_t15_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según la teoría del desarrollo cognitivo de Jean Piaget, el estadio en el que el ser humano adquiere la capacidad de razonar de manera hipotético-deductiva y formular hipótesis abstractas es el:",
                    options = listOf(
                        "Estadio preoperacional",
                        "Estadio de las operaciones formales",
                        "Estadio sensoriomotor",
                        "Estadio de las operaciones concretas",
                        "Estadio preconceptual intuitivo"
                    ),
                    correctIndex = 1,
                    explanation = "El estadio de las operaciones formales (desde los 12 años en adelante) inaugura el pensamiento abstracto e hipotético-deductivo.",
                    subject = "Psicología",
                    semana = 15
                ),
                Challenge(
                    id = "q_psi_t15_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un bebé de 9 meses busca activamente su juguete favorito debajo de una manta que lo cubre por completo, demostrando que comprende que los objetos continúan existiendo aun cuando no los ve. Ha alcanzado el logro de:",
                    options = listOf("Reversibilidad mental", "Permanencia del objeto", "Razonamiento transductivo", "Centración visual", "Egocentrismo cognitivo"),
                    correctIndex = 1,
                    explanation = "La permanencia del objeto es el hito cognoscitivo del período sensoriomotor en el cual el infante entiende que los objetos existen independientemente de su percepción inmediata.",
                    subject = "Psicología",
                    semana = 15
                )
            )
        )
    )
}
