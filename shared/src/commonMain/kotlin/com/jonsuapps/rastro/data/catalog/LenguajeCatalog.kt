package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object LenguajeCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: COMUNICACIÓN Y LENGUAJE (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "len_t01_s01",
            subjectId = "lenguaje",
            semana = 1,
            subtema = "1.1 Concepto, Fases y Tipos de Comunicación",
            title = "Fases y Tipología de la Comunicación Humana y No Humana",
            theory = LessonTheory(
                id = "th_len_t01_s01",
                asignatura = "Lenguaje",
                semana = 1,
                titulo = "Fases y Tipos de Comunicación",
                resumen = "La comunicación es un proceso social dinámico mediante el cual un emisor transmite intencionalmente un mensaje a un receptor a través de un canal utilizando un código común.\n\n• Tres Fases del Proceso:\n  1. Psíquica: Encodificación en el cerebro del emisor (selección de signos) y decodificación en el receptor (interpretación conceptual).\n  2. Fisiológica: Impulsos nerviosos y activación motora (órganos fonadores del emisor y órganos sensoriales auditivos/visuales del receptor).\n  3. Física: Propagación de ondas sonoras o luminosas a través del medio físico (canal).\n\n• Tipología Fundamental:\n  - Por el Código: Humana Verbal/Lingüística (oral o visuográfica) vs. Humana No Verbal (acústica, visual, gestual, táctil, proxémica) vs. No Humana (danza de abejas, feromonas animales).\n  - Por la Relación Emisor-Receptor: Intrapersonal (monólogo interior) vs. Interpersonal (diálogo o interacción entre dos o más).\n  - Por el Espacio: Directa/Próxima (mismo espacio-tiempo) vs. Indirecta/A distancia (separados en espacio o tiempo).\n  - Por la Dirección: Unidireccional (sin retroalimentación inmediata, ej. periódico) vs. Bidireccional/Recíproca (intercambio continuo de roles).",
                conceptosClave = listOf(
                    "Fases de la comunicación: Psíquica (cerebral), Fisiológica (orgánica) y Física (ambiental)",
                    "Comunicación lingüística (oral/escrita) vs. no lingüística (gestos, luces, colores, sonidos)",
                    "Relación: Intrapersonal (uno mismo) vs. Interpersonal (múltiples personas)",
                    "Direccionalidad: Unidireccional (emisor fijo) vs. Bidireccional (roles intercambiables)"
                ),
                formulas = listOf(
                    "\\text{Encodificación (Emisor)} \\to \\text{Canal (Físico)} \\to \\text{Decodificación (Receptor)}"
                ),
                formulaName = "Fases Psíquica, Fisiológica y Física",
                formulaLatex = "\\text{Acto Comunicativo} = \\text{Fase Psíquica} + \\text{Fase Fisiológica} + \\text{Fase Física}",
                formulaDescription = "Secuencia psicofisiológica y material para la transmisión e interpretación del mensaje.",
                admissionTip = "Si el emisor no recibe respuesta inmediata (como al leer un libro o escuchar la radio), la comunicación es UNIDIRECCIONAL e INDIRECTA.",
                admissionExplanation = "• No confundir lenguaje no verbal con no humano: un árbitro sacando tarjeta roja o una sirena de ambulancia es comunicación HUMANA no verbal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un estudiante lee en su habitación la obra 'Los ríos profundos' de José María Arguedas. Según los tipos de comunicación, este acto se clasifica como:",
                    options = listOf(
                        "Lingüística, directa, interpersonal y bidireccional",
                        "Lingüística, indirecta, interpersonal y unidireccional",
                        "No lingüística, intrapersonal, indirecta y recíproca",
                        "Lingüística, directa, intrapersonal y horizontal",
                        "No lingüística, indirecta, unilateral y próxima"
                    ),
                    correctIndex = 1,
                    explanation = "Es lingüística (emplea la palabra escrita), indirecta (emisor y receptor están separados en tiempo y espacio), interpersonal (Arguedas transmite al lector) y unidireccional (el autor no recibe retroalimentación inmediata).",
                    subject = "Lenguaje",
                    semana = 1
                ),
                Challenge(
                    id = "q_len_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La fase de la comunicación en la que el cerebro del emisor selecciona las palabras y estructura mentalmente el mensaje se denomina fase:",
                    options = listOf("Fisiológica", "Física", "Psíquica o encodificadora", "Acústica", "Articulatoria"),
                    correctIndex = 2,
                    explanation = "La encodificación ocurre en la mente/cerebro del emisor en la fase psíquica; luego los órganos fonadores ejecutan la fase fisiológica y el aire transporta las ondas en la fase física.",
                    subject = "Lenguaje",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "len_t01_s02",
            subjectId = "lenguaje",
            semana = 1,
            subtema = "1.2 Circuito y Elementos de la Comunicación",
            title = "Componentes del Circuito, Ruido, Redundancia y Feedback",
            theory = LessonTheory(
                id = "th_len_t01_s02",
                asignatura = "Lenguaje",
                semana = 1,
                titulo = "Elementos del Proceso Comunicativo",
                resumen = "El circuito comunicativo se compone de siete elementos interdependientes:\n\n1. Emisor (Encodificador): Sujeto o entidad que concibe, estructura y emite el mensaje codificado.\n2. Receptor (Decodificador): Destinatario que capta el mensaje por sus sentidos y descifra los signos.\n3. Mensaje: Contenido conceptual, afectivo o informativo transmitido.\n4. Código: Sistema estructurado y convencional de signos y reglas combinatorias compartido (ej. el idioma español, el código Morse, el sistema binario).\n5. Canal: Soporte físico y medio material por el que viaja la señal (natural: aire/ondas sonoras; artificial: papel impreso, fibra óptica, pantalla).\n6. Referente: Realidad objetiva o abstracta extralingüística a la que alude el mensaje.\n7. Contexto / Circunstancia: Entorno espacial, temporal y social que condiciona el significado exacto del mensaje.\n\n• Fenómenos Interferentes:\n- Ruido: Toda perturbación u obstáculo físico, semántico o técnico que degrada la señal.\n- Redundancia: Reiteración voluntaria o recursos enfáticos para neutralizar el ruido y asegurar la recepción fiel.",
                conceptosClave = listOf(
                    "Emisor (encodificador) vs. Receptor (decodificador)",
                    "Canal (soporte material físico) vs. Código (sistema convencional de signos)",
                    "Referente (la realidad aludida) vs. Contexto (el marco espacio-temporal del enunciado)",
                    "Ruido (interferencia distorsionadora) vs. Redundancia (refuerzo preventivo del mensaje)"
                ),
                formulas = listOf(
                    "\\text{Canal} = \\text{Medio Físico}, \\quad \\text{Código} = \\text{Sistema de Signos (Gramática)}"
                ),
                formulaName = "Mnemotecnia del Canal y Código",
                formulaLatex = "\\text{Circuito}: \\; [\\text{Emisor}] \\xrightarrow{\\text{Mensaje / Código / Canal}} [\\text{Receptor}] \\; [\\text{Contexto}]",
                formulaDescription = "El canal es el soporte material por donde viaja la onda o la tinta; el código es el idioma abstracto.",
                admissionTip = "La trampa clásica en exámenes de admisión es confundir el canal con el código. Si te preguntan por una carta, el canal es el papel y el código es el idioma castellano escrito.",
                admissionExplanation = "• Recuerda que el 'contexto' define el significado: la palabra 'banco' significa asiento en un parque o entidad financiera en una avenida según la circunstancia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante una transmisión en vivo por internet, la pantalla se congela y el sonido se entrecorta debido a la baja velocidad de conexión. Este fenómeno representa técnicamente:",
                    options = listOf("Una falla de encodificación", "Un cambio de código", "La presencia de ruido en el canal", "Una pérdida del referente", "Una redundancia técnica"),
                    correctIndex = 2,
                    explanation = "El ruido es cualquier perturbación técnica o física en el canal que dificulta o distorsiona la decodificación del mensaje por parte del receptor.",
                    subject = "Lenguaje",
                    semana = 1
                ),
                Challenge(
                    id = "q_len_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el enunciado 'Un policía de tránsito hace sonar su silbato para detener a un conductor', el canal y el código son respectivamente:",
                    options = listOf(
                        "El silbato y el aire",
                        "El aire (ondas sonoras) y el sistema de toques de silbato",
                        "El policía y las leyes de tránsito",
                        "La pista asfaltada y el sonido agudo",
                        "El conductor y la señal de pare"
                    ),
                    correctIndex = 1,
                    explanation = "El canal es el medio físico por donde viajan las ondas sonoras (el aire atmosférico) y el código es el sistema convencional de toques de silbato reglamentado por tránsito.",
                    subject = "Lenguaje",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "len_t01_s03",
            subjectId = "lenguaje",
            semana = 1,
            subtema = "1.3 Lenguaje, Lengua y Habla (Planos de Saussure)",
            title = "Planos del Lenguaje, Doble Articulación y Lingüística",
            theory = LessonTheory(
                id = "th_len_t01_s03",
                asignatura = "Lenguaje",
                semana = 1,
                titulo = "Lenguaje, Lengua y Habla",
                resumen = "Ferdinand de Saussure y la lingüística moderna distinguen con precisión tres conceptos jerárquicos:\n\n1. El Lenguaje: Facultad biológica y psicológica universal inherente a la especie humana (Chomsky: Gramática Universal innata). Rasgos: Inmutable, universal, racional y doblemente articulado.\n   - Doble Articulación (André Martinet):\n     * Primera articulación: Unidades mínimas con significado llamadas MONEMAS (morfemas: lexemas y afijos).\n     * Segunda articulación: Unidades mínimas distintivas carentes de significado propio llamadas FONEMAS.\n2. La Lengua: Sistema de signos o código abstracto socialmente adoptado por una comunidad lingüística (ej. el quechua, el español, el alemán). Rasgos: Social, psíquica (almacenada en la memoria colectiva), virtual, casi fija y perdurable.\n3. El Habla: El uso concreto, fáctico e individual que cada hablante hace de su lengua en un acto de emisión determinado. Rasgos: Individual, psicofísica (mente + aparato fonador), efímera y mutable.",
                conceptosClave = listOf(
                    "Lenguaje: facultad innata, universal, racional y doblemente articulada",
                    "Doble articulación de Martinet: 1.ª en monemas/morfemas (significado) y 2.ª en fonemas (distintivos)",
                    "Lengua (Social, Psíquica, Sistema, Teórica) vs. Habla (Individual, Psicofísica, Uso, Práctica)",
                    "Interdependencia: La lengua existe en el cerebro colectivo, pero se actualiza en el habla individual"
                ),
                formulas = listOf(
                    "\\text{1.ª Articulación} = \\text{Monemas (Significado)}, \\quad \\text{2.ª Articulación} = \\text{Fonemas (Sin significado)}",
                    "\\text{Lengua (Código Social)} \\leftrightarrow \\text{Habla (Uso Individual)}"
                ),
                formulaName = "Dicotomía Saussureana: Lengua vs. Habla",
                formulaLatex = "\\text{Lengua (Psíquica / Social)} \\quad \\text{vs} \\quad \\text{Habla (Psicofísica / Individual)}",
                formulaDescription = "Dos caras inseparables del fenómeno lingüístico humano.",
                admissionTip = "Recuerda: la 1.ª articulación se divide en unidades CON significado (morfemas); la 2.ª articulación se divide en unidades SIN significado pero con función distintiva (fonemas).",
                admissionExplanation = "• Noam Chomsky postuló el innatismo del lenguaje: los seres humanos nacemos con un Dispositivo de Adquisición del Lenguaje (LAD)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La característica del lenguaje que consiste en combinar un número finito de unidades sonoras sin significado para producir infinitas palabras y oraciones se denomina:",
                    options = listOf("Innatismo universal", "Doble articulación", "Arbitrariedad fonética", "Linealidad del discurso", "Diacronía semántica"),
                    correctIndex = 1,
                    explanation = "La doble articulación (teorizada por André Martinet) permite articular primero morfemas (con significado) y luego descomponerlos en fonemas (segunda articulación, sin significado pero distintivos).",
                    subject = "Lenguaje",
                    semana = 1
                ),
                Challenge(
                    id = "q_len_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Respecto a la dicotomía de Ferdinand de Saussure, señale la correlación correcta entre Lengua y Habla:",
                    options = listOf(
                        "Lengua: psicofísica e individual // Habla: puramente psíquica y social",
                        "Lengua: social y casi fija // Habla: individual y efímera",
                        "Lengua: momentánea y mutable // Habla: código perdurable",
                        "Lengua: acto concreto // Habla: sistema abstracto",
                        "Lengua: producto fisiológico // Habla: convención abstracta"
                    ),
                    correctIndex = 1,
                    explanation = "La lengua es social, psíquica y relativamente fija (código); mientras que el habla es individual, psicofísica y efímera (uso concreto).",
                    subject = "Lenguaje",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "len_t01_s04",
            subjectId = "lenguaje",
            semana = 1,
            subtema = "1.4 Las Seis Funciones del Lenguaje (Jakobson y Bühler)",
            title = "Funciones Referencial, Emotiva, Apelativa, Fática, Poética y Metalingüística",
            theory = LessonTheory(
                id = "th_len_t01_s04",
                asignatura = "Lenguaje",
                semana = 1,
                titulo = "Las Seis Funciones del Lenguaje",
                resumen = "A cada elemento del circuito comunicativo le corresponde una función del lenguaje predominante:\n\n1. Función Representativa / Referencial / Denotativa (Karl Bühler):\n   - Elemento focal: REFERENTE (realidad objetiva exterior).\n   - Propósito: Transmitir información neutra, científica, histórica y verificable (*'El punto de ebullición del agua es 100 °C'*).\n2. Función Expresiva / Emotiva / Sintomática (Karl Bühler):\n   - Elemento focal: EMISOR.\n   - Propósito: Exteriorizar estados anímicos, sentimientos y deseos (*'¡Qué felicidad inmensa verte ingresar!'*).\n3. Función Apelativa / Conativa (Karl Bühler):\n   - Elemento focal: RECEPTOR.\n   - Propósito: Influir, mandar, rogar, persuadir o llamar la atención (*'¡Abran sus libros en la página 20!'*).\n4. Función Fática / De Contacto (Roman Jakobson):\n   - Elemento focal: CANAL.\n   - Propósito: Iniciar, constatar, mantener o interrumpir el canal (*'¿Aló?, ¿me escuchas bien?'*).\n5. Función Poética / Estética (Roman Jakobson):\n   - Elemento focal: MENSAJE (en su forma artística y ritmo).\n   - Propósito: Producir goce estético mediante rimas y figuras literarias (*'Nuestras vidas son los ríos...'*).\n6. Función Metalingüística / De Glosa (Roman Jakobson):\n   - Elemento focal: CÓDIGO (el idioma mismo).\n   - Propósito: Reflexionar y explicar reglas ortográficas o gramaticales (*'Las agudas con tilde terminan en n, s o vocal'*).",
                conceptosClave = listOf(
                    "Referencial (Referente): Objetividad, textos científicos y noticias",
                    "Expresiva (Emisor): Subjetividad, emociones, interjecciones y deseos",
                    "Apelativa (Receptor): Mandatos, ruegos, preguntas y persuasión publicitaria",
                    "Fática (Canal): Saludos, despedidas y comprobación del medio ('¿me oyes?')",
                    "Poética (Mensaje): Figuras literarias, versos y valor estético formal",
                    "Metalingüística (Código): Clases de gramática, diccionarios y normas del idioma"
                ),
                formulas = listOf(
                    "\\text{RE-RE} (\\text{Referente - Referencial}), \\; \\text{EMI-EX} (\\text{Emisor - Expresiva})",
                    "\\text{RECEP-APE} (\\text{Receptor - Apelativa}), \\; \\text{CA-FA} (\\text{Canal - Fática})",
                    "\\text{MEN-POE} (\\text{Mensaje - Poética}), \\; \\text{CÓD-META} (\\text{Código - Metalingüística})"
                ),
                formulaName = "Mnemotecnia de Jakobson: RE-EMI-RECEP-CA-MEN-CÓD",
                formulaLatex = "\\text{Funciones}: \\; \\text{Referente}(Ref) + \\text{Emisor}(Exp) + \\text{Receptor}(Apel) + \\text{Canal}(Fát) + \\text{Mensaje}(Poét) + \\text{Código}(Meta)",
                formulaDescription = "Relación biunívoca entre los 6 elementos de la comunicación y las 6 funciones del lenguaje.",
                admissionTip = "Toda definición lingüística o corrección ortográfica cumple SIEMPRE función METALINGÜÍSTICA, aunque parezca una afirmación informativa objetiva.",
                admissionExplanation = "• En un solo enunciado pueden coincidir varias funciones, pero en admisión siempre se evalúa la función PREDOMINANTE o principal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la frase publicitaria: '¡Joven postulante, matricúlate hoy mismo y asegura tu ingreso a la UNSA!', la función predominante es la:",
                    options = listOf("Poética", "Metalingüística", "Apelativa o conativa", "Fática", "Referencial"),
                    correctIndex = 2,
                    explanation = "La función apelativa o conativa se centra en el receptor para incitarlo o persuadirlo a realizar una acción determinada mediante verbos en imperativo y vocativos.",
                    subject = "Lenguaje",
                    semana = 1
                ),
                Challenge(
                    id = "q_len_t01_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique el enunciado donde se manifiesta de forma exclusiva la función metalingüística del lenguaje:",
                    options = listOf(
                        "¡Ojalá el examen de admisión sea accesible para todos!",
                        "El volcán Misti tiene una altitud de 5822 metros sobre el nivel del mar.",
                        "En español, los sustantivos abstractos no designan objetos tangibles.",
                        "¿Aló? Uno, dos, tres... probando el volumen de los parlantes.",
                        "Juventud, divino tesoro, ¡ya te vas para no volver!"
                    ),
                    correctIndex = 2,
                    explanation = "La opción 3 reflexiona y conceptualiza sobre el propio código lingüístico (el idioma español y las propiedades del sustantivo), cumpliendo función metalingüística.",
                    subject = "Lenguaje",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: LENGUA, HABLA Y REALIDAD LINGÜÍSTICA DEL PERÚ (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "len_t02_s01",
            subjectId = "lenguaje",
            semana = 2,
            subtema = "2.1 Variaciones de la Lengua: Dialecto, Sociolecto e Idiolecto",
            title = "Variación Diatópica, Diastrática y Diafásica del Español",
            theory = LessonTheory(
                id = "th_len_t02_s01",
                asignatura = "Lenguaje",
                semana = 2,
                titulo = "Las Variaciones Lingüísticas",
                resumen = "Una lengua natural experimenta tres ejes de variación sistemática:\n\n1. El Dialecto o Variación Diatópica (Geográfica):\n   Variación regional de una lengua. No es inferior a ninguna otra variedad; todas tienen gramática completa. Se manifiesta en 5 niveles:\n   - Fonético: Entonación, seseo, aspiración de /s/ (*'loh amigoh'*).\n   - Léxico: Distintas palabras para el mismo objeto (*chaval* en España, *pibe* en Argentina, *churre* o *chibolo* en Perú).\n   - Semántico: Misma palabra con significado distinto (*guagua*: niño en Perú; autobús en Cuba).\n   - Morfológico: Formación de diminutivos (*ahorita* en Perú vs. *ahoritica* en Colombia/Venezuela).\n   - Sintáctico: Orden de palabras (*'De la María su casa'* en la Amazonía; *'Su casa de Juan'* en la sierra andina).\n\n2. El Sociolecto o Variación Diastrática (Social):\n   Variación según el estrato socioeducativo y cultural del hablante.\n\n3. El Idiolecto o Variación Diafásica (Registro Individual):\n   Uso personal según la edad, género, profesión (tecnolecto: médicos, abogados) y la situación comunicativa formal o coloquial.",
                conceptosClave = listOf(
                    "Dialecto (Diatópico): Variación regional/geográfica (fonética, léxica, morfológica, semántica, sintáctica)",
                    "Sociolecto (Diastrático): Variación por nivel socioeconómico e instrucción académica",
                    "Idiolecto (Diafásico): Registro personal según edad, profesión (tecnolecto) y contexto formal/informal",
                    "Gramaticalidad de los dialectos: Todo dialecto posee coherencia lingüística interna y plena legitimidad"
                ),
                formulas = listOf(
                    "\\text{Diatópica (Lugar)} = \\text{Dialecto}, \\quad \\text{Diastrática (Sociedad)} = \\text{Sociolecto}, \\quad \\text{Diafásica (Contexto/Edad)} = \\text{Idiolecto}"
                ),
                formulaName = "Tríada de Variaciones de Coseriu",
                formulaLatex = "\\text{Variación} = \\text{Diatópica (Espacio)} + \\text{Diastrática (Estrato)} + \\text{Diafásica (Situación)}",
                formulaDescription = "Clasificación de Eugenio Coseriu para los niveles de variación lingüística sincrónica.",
                admissionTip = "Si te presentan dos oraciones con palabras distintas para un mismo concepto según el país (*chaval* vs. *chibolo*), la variación es DIALECTAL a nivel LÉXICO.",
                admissionExplanation = "• El 'cantado' arequipeño o selvático es una variación diatópica a nivel fonético."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la costa norte del Perú se utiliza el término 'churre' para referirse a un niño, mientras que en Arequipa se le llama comúnmente 'guagua' o 'chiquillo'. Esta diferencia corresponde a una variación:",
                    options = listOf("Diafásica morfológica", "Diastrática sintáctica", "Diatópica a nivel léxico", "Diacrónica fonológica", "Acrolectal subestándar"),
                    correctIndex = 2,
                    explanation = "La variación diatópica o geográfica a nivel léxico se produce cuando diferentes regiones emplean palabras distintas para designar el mismo referente.",
                    subject = "Lenguaje",
                    semana = 2
                ),
                Challenge(
                    id = "q_len_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El empleo de términos especializados como 'litisconsorte', 'antijuridicidad' o 'dolo eventual' por parte de un juez constituye un:",
                    options = listOf("Sociolecto vulgar", "Dialecto amazónico", "Tecnolecto o idiolecto profesional", "Interlecto quechua", "Basilecto popular"),
                    correctIndex = 2,
                    explanation = "El tecnolecto es la jerga técnico-profesional propia de una especialidad o disciplina académica, comprendida dentro de la variación diafásica o de registro.",
                    subject = "Lenguaje",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "len_t02_s02",
            subjectId = "lenguaje",
            semana = 2,
            subtema = "2.2 Niveles de la Lengua: Superestándar, Estándar y Subestándar",
            title = "Estratos Sociolingüísticos: Norma Culta, Coloquial y Replana",
            theory = LessonTheory(
                id = "th_len_t02_s02",
                asignatura = "Lenguaje",
                semana = 2,
                titulo = "Niveles de Uso de la Lengua",
                resumen = "El sociolecto clasifica el uso lingüístico en tres niveles jerárquicos:\n\n1. Nivel Superestándar:\n   - Uso artístico, poético, literario y científico-filosófico de máxima elegancia y riqueza léxica.\n   - Giros retóricos cultos, precisión conceptual rigurosa (*'Aquel egregio prócer consagró su numen al bienestar patrio'*).\n\n2. Nivel Estándar:\n   - Modalidad idiomática general que sirve de modelo de corrección y cohesión para la comunidad de hablantes. Respeta la normativa oficial.\n   - Nivel Culto: Empleado en conferencias, debates formales, clases universitarias y documentos académicos formales.\n   - Nivel Coloquial o Familiar: Uso cotidiano espontáneo con familiares y amigos, con afectividad y corrección gramatical (*'Hola papá, ¿vamos a almorzar juntos?'*).\n\n3. Nivel Subestándar:\n   - Modalidad que transgrede la normativa gramatical por falta de instrucción o marginalidad:\n   - Nivel Popular: Errores morfosintácticos y barbarismos (*'haiga'*, *'nadies'*, *'fuistes'*, *'dijeron de que'*).\n   - Nivel Vulgar o Replana (Argot marginal): Jerga del hampa carcelaria o callejera degradada que encubre deliberadamente el sentido (*'los tombos'*, *'cana'*, *'choro'*).",
                conceptosClave = listOf(
                    "Nivel Superestándar: Lengua poética, literaria y filosófica de alta abstracción",
                    "Nivel Estándar Culto: Registro formal cuidado empleado en ámbitos institucionales y académicos",
                    "Nivel Estándar Coloquial: Comunicación diaria familiar espontánea con corrección gramatical",
                    "Nivel Subestándar Popular: Solecismos y barbarismos morfológicos ('haiga', 'fuistes')",
                    "Nivel Subestándar Vulgar / Replana: Jerga marginal carcelaria y delictiva"
                ),
                formulas = listOf(
                    "\\text{Superestándar (Culto Superior)} > \\text{Estándar (Culto / Coloquial)} > \\text{Subestándar (Popular / Replana)}"
                ),
                formulaName = "Escala de Niveles Sociolingüísticos",
                formulaLatex = "\\text{Lengua} = \\text{Superestándar} \\cup \\text{Estándar (Norma RAE)} \\cup \\text{Subestándar}",
                formulaDescription = "Gradación vertical del sociolecto según el grado de instrucción y contexto de uso.",
                admissionTip = "El nivel coloquial pertenece al nivel ESTÁNDAR, no al subestándar. Solo es subestándar si contiene errores gramaticales flagrantes ('haiga') o replana callejera.",
                admissionExplanation = "• No confundas jerga profesional (tecnolecto: medicina, derecho = nivel estándar) con la replana (lenguaje carcelario = subestándar)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la opción que se ubica plenamente en el nivel superestándar de la lengua:",
                    options = listOf(
                        "Ojalá haiga suficiente comida para los invitados a la fiesta.",
                        "Hermano, pásame la llanta de repuesto antes de salir a la carretera.",
                        "El silente piélago cobijaba los refulgentes destellos del ocaso crepuscular.",
                        "Ayer fuistes a la comisaría a denunciar a ese delincuente.",
                        "Los muchachos se fueron a 'latear' por las calles del centro."
                    ),
                    correctIndex = 2,
                    explanation = "La opción 3 emplea un vocabulario suntuoso, poético y literario ('silente piélago', 'refulgentes destellos') propio de la modalidad superestándar.",
                    subject = "Lenguaje",
                    semana = 2
                ),
                Challenge(
                    id = "q_len_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La expresión 'Ojalá no me caigan los tombos por andar sin documentos' pertenece al nivel lingüístico:",
                    options = listOf("Estándar coloquial", "Superestándar literario", "Subestándar vulgar o replana", "Estándar formal", "Subestándar popular culto"),
                    correctIndex = 2,
                    explanation = "El uso del vocablo 'tombos' es un término de replana o jerga carcelaria marginal, correspondiente al nivel subestándar vulgar.",
                    subject = "Lenguaje",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "len_t02_s03",
            subjectId = "lenguaje",
            semana = 2,
            subtema = "2.3 Lenguas Amerindias Andinas: Quechua y Familia Aru",
            title = "Multilingüismo Nacional: Familias Lingüísticas Quechua y Aru",
            theory = LessonTheory(
                id = "th_len_t02_s03",
                asignatura = "Lenguaje",
                semana = 2,
                titulo = "Las Lenguas Andinas del Perú",
                resumen = "El Perú es un país multilingüe y pluricultural con 48 lenguas originarias reconocidas constitucionalmente como oficiales donde predominen (Art. 48 de la Constitución de 1993).\n\n• Las Dos Grandes Familias Andinas:\n1. Familia Lingüística Quechua (Runa Simi):\n   - Es la lengua originaria más hablada de América del Sur (más de 3.5 millones en el Perú; hablada también en Bolivia, Ecuador, Colombia, Argentina).\n   - No es una lengua única, sino una familia dividida según Alfredo Torero en dos ramas:\n     * Quechua I o Central (Waywash): Áncash, Huánuco, Pasco, Junín y sierra de Lima. Es la rama más arcaica y conservadora.\n     * Quechua II o Periférico (Wampuy): Subdividido en Norteño (Cajamarca, Incahuasi-Cañaris, Chachapoyas), Sureño (Cuzco, Puno, Ayacucho, Arequipa, Apurímac - mayor cantidad de hablantes) y de la Selva (Lamas, San Martín).\n\n2. Familia Lingüística Aru:\n   - Familia andina ancestral compuesta por:\n     * El Aimara: Segunda lengua originaria más hablada del Perú. Concentrada en el altiplano de Puno, con presencia en Moquegua, Tacna y Arequipa.\n     * El Jacaru y el Cauqui: Hablados en la provincia de Yauyos (distrito de Tupe, Lima). El cauqui está virtualmente extinto y el jacaru en riesgo crítico.\n\n• El Fenómeno del Interlecto:\nInterferencia fonética y morfosintáctica sistemática en el español hablado por personas cuya lengua materna (L1) es el quechua o el aimara (ej. confusión de vocales /e/~/i/, /o/~/u/ por ser lenguas trivocálicas).",
                conceptosClave = listOf(
                    "Constitución Art. 48: El castellano y las lenguas originarias (quechua, aimara y amazónicas) son oficiales",
                    "Familia Quechua: Quechua I (Central o Waywash) y Quechua II (Periférico o Wampuy: Norte, Sur, Selva)",
                    "Familia Aru: Aimara (Puno/Altiplano), Jacaru y Cauqui (Yauyos - Lima)",
                    "Interlecto: Español hablado con interferencia de la lengua materna andina (sistema trivocálico a, i, u)"
                ),
                formulas = listOf(
                    "\\text{Fam. Quechua} = \\text{Quechua Central (I)} + \\text{Quechua Periférico (II)}",
                    "\\text{Fam. Aru} = \\text{Aimara} + \\text{Jacaru} + \\text{Cauqui (Yauyos, Lima)}"
                ),
                formulaName = "Mapa Lingüístico Andino",
                formulaLatex = "\\text{Lenguas Andinas} = \\text{Familia Quechua} \\cup \\text{Familia Aru}",
                formulaDescription = "Composición de las dos familias amerindias de la región andina peruana.",
                admissionTip = "El Jacaru y el Cauqui se hablan en el departamento de LIMA (provincia de Yauyos) y pertenecen a la familia ARU (no a la familia quechua).",
                admissionExplanation = "• El quechua y el aimara son lenguas originarias TRIVOCÁLICAS (poseen solo fonemas /a/, /i/, /u/). Por eso los quechuahablantes que aprenden español como L2 suelen cambiar 'mesa' por 'misa' (interlecto)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las lenguas originarias andinas 'aimara' y 'jacaru' pertenecen a la misma familia lingüística denominada:",
                    options = listOf("Quechua", "Arawak", "Aru", "Pano", "Cahuapana"),
                    correctIndex = 2,
                    explanation = "El aimara, el jacaru y el cauqui pertenecen a la familia lingüística Aru (o Jaqi). El quechua constituye una familia propia independiente.",
                    subject = "Lenguaje",
                    semana = 2
                ),
                Challenge(
                    id = "q_len_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según la clasificación del lingüista Alfredo Torero, la variedad más arcaica del quechua (Quechua I o Central) se habla principalmente en:",
                    options = listOf(
                        "Cuzco, Puno y Arequipa",
                        "Áncash, Huánuco, Pasco y Junín",
                        "Cajamarca, Lambayeque y Chachapoyas",
                        "San Martín y Loreto",
                        "Madre de Dios y Tacna"
                    ),
                    correctIndex = 1,
                    explanation = "El Quechua I o Waywash (Central) se extiende por los departamentos centrales de Áncash, Huánuco, Pasco, Junín y la serranía de Lima.",
                    subject = "Lenguaje",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "len_t02_s04",
            subjectId = "lenguaje",
            semana = 2,
            subtema = "2.4 Lenguas Amazónicas y Diglosia Nacional",
            title = "Familias Amazónicas (Arawak, Pano, Jíbaro) y Conflicto Diglósico",
            theory = LessonTheory(
                id = "th_len_t02_s04",
                asignatura = "Lenguaje",
                semana = 2,
                titulo = "Lenguas Amazónicas y Diglosia",
                resumen = "La Amazonía peruana es el territorio de mayor diversidad y complejidad etnolingüística del país, albergando a 44 lenguas vivas agrupadas en más de 17 familias lingüísticas:\n\n• Principales Familias Amazónicas:\n1. Familia Arawak: La más extensa geográficamente de América del Sur. Incluye al Asháninka (la lengua amazónica con mayor número de hablantes del Perú: Junín, Pasco, Ucayali, Cuzco), Machiguenga (Matsigenka), Yine, Nomatsigenga y Yanesha.\n2. Familia Pano: Segunda en importancia demográfica. Incluye al Shipibo-Konibo (cuenca del río Ucayali), Matsés y Kapanawa.\n3. Familia Jíbaro (Chicham): Comprende al Awajún (Aguaruna, segunda lengua amazónica más hablada: Amazonas, San Martín, Cajamarca, Loreto), Wampis (Huambisa) y Achuar.\n4. Otras Familias Amazónicas: Huitoto, Bora, Ticuna, Tupí-Guaraní (Kukama-Kukamiria), Harakbut, Záparo, Tucano, PeBa-Yagua.\n\n• Bilingüismo y Diglosia en el Perú:\n- Bilingüismo: Capacidad individual o social de manejar dos lenguas con fluidez comunicativa.\n- Diglosia: Situación de convivencia asimétrica de dos lenguas en una misma sociedad, donde una lengua goza de prestigio político, legal y educativo (el español) mientras que la otra (quechua, aimara o lenguas amazónicas) queda postergada a funciones domésticas o informales.",
                conceptosClave = listOf(
                    "Diversidad amazónica: 44 lenguas originarias vivas en más de 17 familias lingüísticas",
                    "Asháninka (Familia Arawak): La lengua amazónica con mayor cantidad de hablantes",
                    "Shipibo-Konibo (Familia Pano) y Awajún (Familia Jíbaro): Grandes lenguas de la selva peruana",
                    "Diglosia: Desigualdad social y política entre una lengua hegemónica (español) y lenguas subordinadas"
                ),
                formulas = listOf(
                    "\\text{Amazonía} = 44 \\text{ lenguas originarias} \\; (\\sim 17-19 \\text{ familias lingüísticas})",
                    "\\text{Diglosia} = \\text{Lengua A (Alto prestigio/Institucional)} \\; \\text{vs.} \\; \\text{Lengua B (Bajo prestigio/Doméstica)}"
                ),
                formulaName = "Matriz de Familias Amazónicas y Diglosia",
                formulaLatex = "\\text{Fam. Arawak (Asháninka)} \\quad \\text{Fam. Pano (Shipibo)} \\quad \\text{Fam. Jíbaro (Awajún)}",
                formulaDescription = "Las tres familias etnolingüísticas amazónicas de mayor peso demográfico en el Perú.",
                admissionTip = "La lengua amazónica más hablada del Perú es el ASHÁNINKA (Familia Arawak); la segunda es el AWAJÚN (Familia Jíbaro) y la tercera es el SHIPIBO-KONIBO (Familia Pano).",
                admissionExplanation = "• No confundir bilingüismo (hecho lingüístico de hablar dos lenguas) con diglosia (conflicto sociopolítico de valoración desigual entre ambas lenguas)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La lengua originaria amazónica con mayor número de hablantes en el Perú es el:",
                    options = listOf("Shipibo-Konibo", "Awajún", "Asháninka", "Machiguenga", "Ticuna"),
                    correctIndex = 2,
                    explanation = "El asháninka (perteneciente a la familia Arawak) es la lengua indígena amazónica demográficamente más numerosa del Perú.",
                    subject = "Lenguaje",
                    semana = 2
                ),
                Challenge(
                    id = "q_len_t02_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cuando en una sociedad dos lenguas coexisten pero una de ellas es favorecida en el sistema judicial, universitario y mediático mientras la otra queda relegada al ámbito familiar, se produce el fenómeno sociolingüístico de:",
                    options = listOf("Interlecto", "Diglosia", "Dialectización", "Monolingüismo", "Replana"),
                    correctIndex = 1,
                    explanation = "La diglosia es la situación de convivencia desigual y jerarquizada entre dos lenguas, donde una ejerce hegemonía institucional y la otra sufre marginación social.",
                    subject = "Lenguaje",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: FONOLOGÍA Y ORTOGRAFÍA (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "len_t03_s01",
            subjectId = "lenguaje",
            semana = 3,
            subtema = "3.1 Fonología y Fonética: Sistema de Fonemas y Grafemas",
            title = "Fonemas del Español, Alófonos y la Asimetría Grafemática",
            theory = LessonTheory(
                id = "th_len_t03_s01",
                asignatura = "Lenguaje",
                semana = 3,
                titulo = "Fonemas y Grafías en el Español",
                resumen = "• Fonología vs. Fonética:\n  - Fonología: Estudia los FONEMAS (unidades mínimas distintivas abstractas y psíquicas, representadas entre barras: /b/, /p/). Permiten diferenciar significados en pares mínimos (*pala* vs. *bala*).\n  - Fonética: Estudia los SONIDOS y ALÓFONOS (unidades acústicas y fisiológicas del habla, entre corchetes: [b]).\n\n• Sistema Fonológico del Español:\n  - Consta de 24 fonemas segmentales:\n    * 5 fonemas vocálicos: /a/ (abierta central), /e/, /o/ (semiabiertas anterior/posterior), /i/, /u/ (cerradas anterior/posterior).\n    * 19 fonemas consonánticos.\n\n• Asimetría Fonema-Grafía (Desajuste Ortográfico):\n  - El alfabeto tiene 27 letras y 5 dígrafos (ch, ll, rr, gu, qu).\n  - Poligrafía: Un mismo fonema se representa con varias letras (ej. el fonema /k/ se escribe con *c*, *k*, *qu* en *casa*, *kilo*, *queso*; el fonema /s/ con *s*, *c*, *z* en Latinoamérica por el seseo).\n  - Polifonía: Una misma letra representa varios fonemas (ej. la letra *c* representa /k/ en *copa* y /s/ en *cima*; la letra *g* representa /g/ en *gato* y /x/ en *gente*).\n  - Letra dígrafa sin sonido: La letra *h* es muda (no representa fonema alguno en español estándar).",
                conceptosClave = listOf(
                    "24 Fonemas (5 vocales + 19 consonantes) frente a 27 letras del alfabeto",
                    "Fonema: unidad mínima distintiva sin significado propio",
                    "Poligrafía: Un fonema escrito con múltiples letras (/k/ -> c, k, qu)",
                    "Polifonía: Una letra con múltiples valores sonoros (c -> /k/, /s/)",
                    "La 'h' no representa fonema; dígrafos: ch, ll, rr, gu, qu"
                ),
                formulas = listOf(
                    "24 \\text{ Fonemas Segmentales} \\neq 27 \\text{ Letras (Grafemas)} + 5 \\text{ Dígrafos}"
                ),
                formulaName = "Ecuación de Asimetría Fonema-Letra",
                formulaLatex = "\\text{Fonemas} = 5 \\text{ Vocálicos} + 19 \\text{ Consonánticos} = 24",
                formulaDescription = "El sistema fonológico español cuenta exactamente con 24 fonemas.",
                admissionTip = "Para contar fonemas en una palabra con 'h' muda o dígrafos 'qu'/'gu', resta las letras mudas. Por ejemplo, 'queso' tiene 5 letras pero solo 4 fonemas: /k - e - s - o/.",
                admissionExplanation = "• La letra 'x' representa dos fonemas juntos (/k/ + /s/) en posición intervocálica: 'éxito' = /e - k - s - i - t - o/ (6 fonemas para 5 letras)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántos fonemas segmentales diferentes contiene la palabra 'guitarra'?",
                    options = listOf("8", "7", "6", "5", "4"),
                    correctIndex = 2,
                    explanation = "La palabra 'guitarra' tiene 8 letras, pero la 'u' es muda después de 'g' y 'rr' es un solo dígrafo: fonemas /g - i - t - a - r̄ - a/ (la vocal 'a' se repite, pero en total de fonemas en la cadena son 6: /g/, /i/, /t/, /a/, /r̄/, /a/).",
                    subject = "Lenguaje",
                    semana = 3
                ),
                Challenge(
                    id = "q_len_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El fonema consonántico /k/ se puede representar en la escritura mediante las grafías:",
                    options = listOf("c, k, qu", "c, s, z", "g, j, x", "b, v, w", "ll, y, ch"),
                    correctIndex = 0,
                    explanation = "El fonema oclusivo velar sordo /k/ se representa con 'c' (delante de a, o, u: casa), 'k' (kilo) y el dígrafo 'qu' (delante de e, i: queso).",
                    subject = "Lenguaje",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "len_t03_s02",
            subjectId = "lenguaje",
            semana = 3,
            subtema = "3.2 Secuencias Vocálicas: Diptongos, Triptongos y Hiatos",
            title = "Grupos Vocálicos: Diptongo Creciente/Decreciente, Triptongo y Hiato",
            theory = LessonTheory(
                id = "th_len_t03_s02",
                asignatura = "Lenguaje",
                semana = 3,
                titulo = "Secuencias Vocálicas del Español",
                resumen = "Las vocales se dividen en Abiertas (VA: a, e, o) y Cerradas (VC: i, u):\n\n1. Diptongo (Homosilábico - unión en una misma sílaba):\n   - Creciente: VC átona + VA (ej. *via-je*, *puer-ta*, *co-me-dia*).\n   - Decreciente: VA + VC átona (ej. *cau-sa*, *pei-ne*, *hoy*).\n   - Homogéneo: VC + VC distinta (ej. *ciu-dad*, *cui-da-do*).\n   *Regla*: La 'h' intermedia no impide diptongo (*ahu-mar*, *prohi-bir*).\n\n2. Triptongo (Homosilábico - tres vocales en una misma sílaba):\n   - Estructura fija: VC átona + VA tónica + VC átona (ej. *a-ve-ri-güéis*, *Pa-ra-guay*, *hioi-des*).\n\n3. Hiato (Heterosilábico - separación en sílabas distintas):\n   - Hiato Simple: Dos vocales abiertas consecutivas (VA + VA: *po-e-ma*, *ca-o-ba*, *le-er*) o dos cerradas iguales (VC + VC igual: *chi-i-ta*, *ti-i-to*).\n   - Hiato Acentual o Robúrico: Vocal cerrada tónica obligatoria + vocal abierta átona (VĆ + VA o VA + VĆ). ¡Lleva tilde siempre sin importar las reglas generales! (ej. *ma-íz*, *ba-úl*, *rí-o*, *o-í-do*, *bú-ho*).",
                conceptosClave = listOf(
                    "Vocales Abiertas (a, e, o) vs. Vocales Cerradas (i, u)",
                    "Diptongo: Creciente (VC+VA), Decreciente (VA+VC), Homogéneo (iu, ui)",
                    "Triptongo: VC átona + VA tónica + VC átona (ej. Huayno, buey)",
                    "Hiato Simple: VA + VA (po-e-ta) o dos cerradas iguales (ti-i-ta)",
                    "Hiato Acentual / Robúrico: VC tónica que rompe el diptongo con tilde obligatoria (ca-í-da)"
                ),
                formulas = listOf(
                    "\\text{Diptongo}: \\; VC + VA \\quad \\text{o} \\quad VA + VC \\quad \\text{o} \\quad VC_1 + VC_2",
                    "\\text{Hiato Acentual}: \\; VA + VC' \\quad \\text{o} \\quad VC' + VA \\implies \\text{Tilde Obligatoria}"
                ),
                formulaName = "Leyes de Combinación Vocálica",
                formulaLatex = "\\text{Hiato Robúrico}: \\; \\text{Vocal Cerrada con Fuerza de Voz (í, ú)} \\implies \\text{Ruptura Silábica}",
                formulaDescription = "La tilde disolvente destruye la unión vocálica independientemente de las reglas generales de acentuación.",
                admissionTip = "La 'h' intermedia no rompe diptongo (*prohi-bi-ción* = diptongo), salvo que la vocal cerrada contigua sea tónica (*pro-hí-bo* = hiato acentual). La 'y' al final de sílaba suena como vocal /i/ y forma diptongo (*ley*, *rey*).",
                admissionExplanation = "• Palabras como 'guion', 'truhan', 'ion', 'fe' son monosílabos según la RAE 2010 y jamás llevan tilde."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántos diptongos y cuántos hiatos presenta la oración: 'El geólogo creía que la bahía guardaba un misterio'?",
                    options = listOf(
                        "1 diptongo y 3 hiatos",
                        "2 diptongos y 3 hiatos",
                        "2 diptongos y 4 hiatos",
                        "1 diptongo y 4 hiatos",
                        "3 diptongos y 2 hiatos"
                    ),
                    correctIndex = 2,
                    explanation = "Analicemos:\n• ge-ó-lo-go: hiato simple (e-o).\n• cre-í-a: dos hiatos sucesivos: cre-í (hiato acentual e-í) e í-a (hiato acentual í-a).\n• ba-hí-a: hiato acentual (hí-a).\n• guar-da-ba: diptongo creciente (ua).\n• mis-te-rio: diptongo creciente (io).\nTotal: 2 diptongos (guardaba, misterio) y 4 hiatos (ge-ó, cre-í, í-a, ba-hí-a).",
                    subject = "Lenguaje",
                    semana = 3
                ),
                Challenge(
                    id = "q_len_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la palabra que contiene un hiato simple por coincidencia de vocales cerradas iguales:",
                    options = listOf("Cuidado", "Construido", "Chiita", "Bebían", "Alcohol"),
                    correctIndex = 2,
                    explanation = "'Chiita' contiene dos vocales cerradas iguales (i-i), las cuales por regla silábica forman hiato simple (chi-i-ta). 'Cuidado' y 'construido' son diptongos homogéneos (ui, iu).",
                    subject = "Lenguaje",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "len_t03_s03",
            subjectId = "lenguaje",
            semana = 3,
            subtema = "3.3 Normativa de Acentuación General",
            title = "Acentuación General: Oxítonas, Paroxítonas, Esdrújulas y Sobresdrújulas",
            theory = LessonTheory(
                id = "th_len_t03_s03",
                asignatura = "Lenguaje",
                semana = 3,
                titulo = "Acentuación Gráfica General",
                resumen = "El acento es la mayor fuerza de voz con que se pronuncia una sílaba (sílaba tónica). Las palabras polisílabas se clasifican según la ubicación de la sílaba tónica:\n\n1. Agudas u Oxítonas (Sílaba tónica en la última posición):\n   - Se tildan cuando terminan en consonante 'n', 's' o vocal (*can-ción*, *com-pás*, *co-li-brí*).\n   - Excepción: Si termina en 's' precedida de otra consonante, NO se tilda (*ti-cacs*, *ro-bots*).\n\n2. Graves, Llanas o Paroxítonas (Sílaba tónica en la penúltima posición):\n   - Se tildan cuando terminan en cualquier consonante que NO sea 'n', 's' ni vocal (*ár-bol*, *cás-ped*, *tó-rax*, *fó-sil*).\n   - Excepción: Si terminan en 's' precedida de otra consonante, SÍ se tildan (*bí-ceps*, *cór-mics*, *fór-ceps*).\n\n3. Esdrújulas o Proparoxítonas (Sílaba tónica en la antepenúltima posición):\n   - ¡Se tildan TODAS sin excepción! (*mé-di-co*, *brú-ju-la*, *quí-mi-ca*).\n\n4. Sobresdrújulas o Preproparoxítonas (Sílaba tónica antes de la antepenúltima):\n   - Se forman con verbos más pronombres enclíticos (*en-tré-ga-se-lo*, *cóm-pra-te-las*). ¡Se tildan TODAS sin excepción!",
                conceptosClave = listOf(
                    "Agudas (Oxítonas): Tilde si terminan en n, s o vocal",
                    "Graves (Paroxítonas): Tilde si terminan en consonante que no sea n, s ni vocal",
                    "Excepción crucial: 'Bíceps', 'fórceps' llevan tilde por terminar en 's' compuesta",
                    "Esdrújulas y Sobresdrújulas: Se tildan el 100% de los casos sin excepción"
                ),
                formulas = listOf(
                    "\\text{Agudas} \\to \\text{Tilde si termina en } [N, S, \\text{Vocal}]",
                    "\\text{Graves} \\to \\text{Tilde si NO termina en } [N, S, \\text{Vocal}] \\quad (\\text{Salvo bíceps, cómics})"
                ),
                formulaName = "Cuadro Cardinal de Acentuación RAE",
                formulaLatex = "\\text{SEGA}: \\; \\text{Sobresdrújula} \\; | \\; \\text{Esdrújula} \\; | \\; \\text{Grave} \\; | \\; \\text{Aguda}",
                formulaDescription = "Mnemotecnia SEGA para ubicar de derecha a izquierda la posición de la sílaba tónica.",
                admissionTip = "Recuerda la palabra 'bíceps': es grave pero lleva tilde a pesar de terminar en 's', porque esa 's' está precedida de otra consonante ('p'). Pregunta fija de examen.",
                admissionExplanation = "• Los adverbios terminados en '-mente' conservan la tilde del adjetivo base si este la tenía: 'fácil' -> 'fácilmente'; 'suave' -> 'suavemente'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la alternativa que contiene únicamente palabras graves que deben tildarse obligatoriamente:",
                    options = listOf(
                        "Resumen, examen, dictamen",
                        "Torax, cesped, comic",
                        "Reloj, compas, menu",
                        "Musica, fabrica, calido",
                        "Sutil, crater, feliz"
                    ),
                    correctIndex = 1,
                    explanation = "'Tórax' (termina en x), 'césped' (termina en d) y 'cómic' (termina en c) son palabras graves que no terminan en n, s ni vocal, por lo que deben tildarse obligatoriamente.",
                    subject = "Lenguaje",
                    semana = 3
                ),
                Challenge(
                    id = "q_len_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Por qué la palabra 'tríceps' lleva tilde gráfica según la Ortografía de la RAE?",
                    options = listOf(
                        "Por ser palabra aguda terminada en consonante continua",
                        "Por ser palabra esdrújula compuesta",
                        "Por ser palabra grave terminada en 's' precedida de otra consonante",
                        "Por contener un hiato acentual en la penúltima sílaba",
                        "Por tener acento diacrítico diferencial"
                    ),
                    correctIndex = 2,
                    explanation = "La regla de la RAE establece que las palabras graves terminadas en grupo consonántico (donde la última es 's') se tildan: bíceps, tríceps, cómics, fórceps.",
                    subject = "Lenguaje",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "len_t03_s04",
            subjectId = "lenguaje",
            semana = 3,
            subtema = "3.4 Tildación Especial: Diacrítica, Enfática y Robúrica",
            title = "Los 8 Monosílabos Diacríticos, Tildación Enfática y Compuesta",
            theory = LessonTheory(
                id = "th_len_t03_s04",
                asignatura = "Lenguaje",
                semana = 3,
                titulo = "Tildación Diacrítica y Especial",
                resumen = "Los monosílabos, por regla general de la RAE, NUNCA se tildan (*fe, pan, ti, vi, dio, vio, fue, fui*). La tilde diacrítica se aplica de modo excepcional solo a 8 parejas de monosílabos para distinguir funciones gramaticales:\n\n1. ÉL (pronombre: *Él vendrá*) vs. EL (artículo: *El libro*).\n2. TÚ (pronombre: *Tú sabes*) vs. TU (posesivo: *Tu cuaderno*).\n3. MÍ (pronombre: *Para mí*) vs. MI (posesivo/nota: *Mi casa*, *nota mi*).\n4. SÍ (afirmación/pronombre: *Dijo que sí*, *volvió en sí*) vs. SI (condicional/nota: *Si estudias, ingresas*).\n5. TÉ (sustantivo infusión: *Tomó un té caliente*) vs. TE (pronombre: *Te quiero*).\n6. DÉ (verbo dar: *Ojalá le dé suerte*) vs. DE (preposición: *Viene de Puno*).\n7. SÉ (verbo ser o saber: *Sé prudente*, *Yo sé la verdad*) vs. SE (pronombre: *Se marchó ayer*).\n8. MÁS (adverbio/cantidad: *Quiero más agua*) vs. MAS (conjunción adversativa = pero: *Estudió, mas no aprobó*).\n\n• Casos Especiales:\n- 'Ti', 'dio', 'vio', 'fue', 'fui': ¡JAMÁS llevan tilde diacrítica!\n- Palabras interrogativas/exclamativas directas o indirectas llevan tilde enfática (*¿Qué?, ¿Quién?, ¿Cuál?, ¿Cómo?, ¿Dónde?*).\n- Palabras unidas por guion conservan sus tildes originales (*teórico-práctico*).",
                conceptosClave = listOf(
                    "Regla de oro: 'Ti', 'fe', 'dio', 'vio', 'fue' nunca se tildan",
                    "8 monosílabos: Él, Tú, Mí, Sí, Té, Dé, Sé, Más",
                    "Aun (incluso / siquiera) vs. Aún (todavía = lleva tilde)",
                    "Tilde enfática en pronombres interrogativos y exclamativos (¿Qué?, ¡Cómo!)",
                    "Palabras fusionadas: Pierde la primera tilde y mantiene la última (decimoséptimo)"
                ),
                formulas = listOf(
                    "\\text{Él / Tú / Mí / Sí / Té / Dé / Sé / Más} \\implies \\text{Llevan tilde diacrítica}",
                    "\\text{Aún} = \\text{Todavía (Con tilde)}, \\quad \\text{Aun} = \\text{Incluso / Siquiera (Sin tilde)}"
                ),
                formulaName = "Octeto Diacrítico de la RAE",
                formulaLatex = "\\text{Diacríticos}: \\; \\{él, tú, mí, sí, té, dé, sé, más\\}",
                formulaDescription = "Los únicos 8 monosílabos del español autorizados para recibir tilde diacrítica.",
                admissionTip = "'Solo' (adverbio o adjetivo) y los demostrativos 'este, ese, aquel' NO deben tildarse en ningún caso según las reformas ortográficas de la RAE 2010.",
                admissionExplanation = "• 'Mas' equivale a 'pero' (sin tilde); 'más' indica cantidad o incremento (con tilde)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete correctamente con tildes: '___ me dijo que ___ te de ___ tiempo para responder, ___ no aceptaste'.",
                    options = listOf(
                        "El / si / mas / mas",
                        "Él / sí / más / mas",
                        "Él / si / más / mas",
                        "El / sí / mas / más",
                        "Él / si / mas / más"
                    ),
                    correctIndex = 2,
                    explanation = "'Él' lleva tilde (pronombre), 'si' no lleva tilde (condicional), 'más' lleva tilde (adverbio de cantidad), y 'mas' no lleva tilde porque equivale a 'pero' (adversativa).",
                    subject = "Lenguaje",
                    semana = 3
                ),
                Challenge(
                    id = "q_len_t03_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes oraciones presenta una palabra con tildación incorrecta?",
                    options = listOf(
                        "A ti no te corresponde juzgar sus acciones.",
                        "Deseo que me dé una explicación convincente.",
                        "Aún no ha llegado el docente a la conferencia.",
                        "Esto fue para tí un gran desafío intelectual.",
                        "Sé prudente cuando tomes esa decisión tan delicada."
                    ),
                    correctIndex = 3,
                    explanation = "La palabra 'ti' es un monosílabo que no tiene pareja átona; por lo tanto, la RAE establece que NUNCA lleva tilde en ningún contexto ('para ti').",
                    subject = "Lenguaje",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: MORFOLOGÍA Y FORMACIÓN DE PALABRAS (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "len_t04_s01",
            subjectId = "lenguaje",
            semana = 4,
            subtema = "4.1 El Morfema y el Alomorfo",
            title = "Unidades Mínimas de Significado y Variantes Alomórficas",
            theory = LessonTheory(
                id = "th_len_t04_s01",
                asignatura = "Lenguaje",
                semana = 4,
                titulo = "El Morfema y el Alomorfo",
                resumen = "La morfología es la rama de la gramática que estudia la estructura interna de las palabras y los mecanismos de creación léxica:\n\n1. El Morfema: Es la unidad lingüística mínima con significación gramatical o léxica. A diferencia del fonema (que solo distingue), el morfema comunica significado.\n   - Ejemplo: *in-toc-a-ble-s* (5 morfemas: in- prefijo negativo, toc- lexema tocar, -a- vocal temática, -ble posibilidad pasiva, -s plural).\n\n2. El Alomorfo: Es la variante formal, fónica o gráfica de un mismo morfema en diferentes contextos morfológicos sin variar su significado:\n   - Alomorfos del plural en español: `-s` (tras vocal: *gato-s*), `-es` (tras consonante: *reloj-es*) y el morfo cero `-\\emptyset` (*las crisis*).\n   - Alomorfos del prefijo de negación: `in-` (*in-tolerable*), `im-` (*im-posible*, delante de b/p), `i-` (*i-lógico*, delante de l/r).\n   - Alomorfos de la raíz verbal: *dorm-* (*dormir*), *duerm-* (*duermo*), *durm-* (*durmió*).",
                conceptosClave = listOf(
                    "Morfema: unidad mínima de significado (lexical o gramatical)",
                    "Alomorfo: realizaciones formales distintas de un mismo morfema según el contexto fonológico",
                    "Alomorfos de plural: -s, -es, morfo cero",
                    "Alomorfos de negación: in-, im-, i-"
                ),
                formulas = listOf(
                    "\\text{Morfema Plural} \\to \\{-s, -es, -\\emptyset\\}",
                    "\\text{Morfema Negación} \\to \\{in-, im-, i-\\}"
                ),
                formulaName = "Morfema y sus Alomorfos",
                formulaLatex = "\\text{Morfema} \\implies [\\text{Alomorfo}_1, \\text{Alomorfo}_2, \\text{Alomorfo}_3]",
                formulaDescription = "Un único contenido gramatical que se materializa en distintas secuencias fónicas.",
                admissionTip = "En 'imposible', 'intolerable' e 'ilegal', los segmentos 'im-', 'in-' e 'i-' son ALOMORFOS del mismo prefijo de negación.",
                admissionExplanation = "• No confunda morfema (significado) con sílaba (golpe de voz fónico sin significado: la palabra 'sol' es una sílaba y a la vez un morfema lexical)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En las palabras 'inútil', 'imborrable' e 'irreal', las formas iniciales subrayadas representan:",
                    options = listOf("Morfemas flexivos amalgama", "Alomorfos de un mismo prefijo negativo", "Lexemas independientes", "Sufijos derivativos desinenciales", "Morfos libres invariables"),
                    correctIndex = 1,
                    explanation = "Son variantes de forma condicionadas por la consonante siguiente que expresan idéntico significado de negación o privación: son alomorfos.",
                    subject = "Lenguaje",
                    semana = 4
                ),
                Challenge(
                    id = "q_len_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántos morfemas contiene la palabra 'deslealtades'?",
                    options = listOf("3", "4", "5", "6", "2"),
                    correctIndex = 1,
                    explanation = "La descomposición morfológica es: 'des-' (prefijo derivativo) + 'leal' (morfema lexical) + '-tad' (sufijo derivativo abstracto) + '-es' (morfema flexivo de número plural). En total contiene 4 morfemas.",
                    subject = "Lenguaje",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "len_t04_s02",
            subjectId = "lenguaje",
            semana = 4,
            subtema = "4.2 Clasificación de Morfemas: Lexemas y Morfemas Gramaticales",
            title = "Morfemas Lexicales, Flexivos (Simples y Amalgama) y Derivativos",
            theory = LessonTheory(
                id = "th_len_t04_s02",
                asignatura = "Lenguaje",
                semana = 4,
                titulo = "Clasificación de los Morfemas",
                resumen = "Los morfemas se clasifican rigurosamente por su función:\n\n1. Morfema Lexical (Lexema o Raíz):\n   - Núcleo portador del significado básico, fundamental y de inventario abierto (*pan-*, *libr-*, *gat-*).\n\n2. Morfemas Gramaticales Flexivos (Desinencias de accidentes):\n   - No crean palabras nuevas, solo indican variaciones gramaticales de género, número o accidentes verbales:\n   - Flexivo Simple: Expresa un solo accidente de género o número en sustantivos y adjetivos (*alumn-o-s*: -o género masculino, -s número plural).\n   - Flexivo Amalgama (Exclusivo del verbo conjugado): Un solo morfema desinencial contiene simultáneamente cinco accidentes gramaticales: persona, número, tiempo, modo y aspecto (*cant-é*: 1.ª persona, singular, pretérito perfecto, indicativo, perfectivo).\n\n3. Morfemas Gramaticales Derivativos (Afijos):\n   - Se unen a la raíz para formar nuevas palabras con cambio de categoría o matiz semántico:\n   - Prefijos (antes de la raíz: *re-hacer*, *sub-suelo*).\n   - Sufijos (después de la raíz: *libr-ero*, *leal-tad*).\n   - Infijos o Interfijos (elementos de enlace átonos sin significado propio entre raíz y sufijo: *polv-ar-eda*, *pan-ec-illo*).",
                conceptosClave = listOf(
                    "Lexema (Raíz): Significado conceptual primario",
                    "Flexivo Simple: Expresa género o número por separado en nombres/adjetivos",
                    "Flexivo Amalgama: Exclusivo del verbo; fusiona persona, número, tiempo, modo y aspecto",
                    "Derivativos: Prefijos, sufijos e infijos (crean nuevas palabras o cambian la categoría)"
                ),
                formulas = listOf(
                    "\\text{Palabra} = \\text{Lexema} + \\text{Morfemas Derivativos (Afijos)} + \\text{Morfemas Flexivos}",
                    "\\text{Morfema Amalgama} = \\text{Tiempo} + \\text{Modo} + \\text{Aspecto} + \\text{Número} + \\text{Persona}"
                ),
                formulaName = "Arquitectura del Morfema Verbal Amalgama",
                formulaLatex = "\\text{Verbo}: \\; \\text{Lexema} + \\text{Vocal Temática} + \\text{Desinencia Amalgama (T-M-A-N-P)}",
                formulaDescription = "El morfema amalgama es exclusivo de la conjugación verbal.",
                admissionTip = "Pregunta clásica: '¿Qué palabra contiene morfema amalgama?' Busca SIEMPRE un verbo conjugado. Sustantivos y adjetivos nunca tienen amalgama.",
                admissionExplanation = "• Los infijos no tienen significado: sirven de puente fonético para evitar cacofonías (*café* + *t* + *era* = *cafetera*)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes palabras contiene obligatoriamente un morfema flexivo amalgama?",
                    options = listOf("Campesinos", "Escribieron", "Blancura", "Submarino", "Cocinero"),
                    correctIndex = 1,
                    explanation = "'Escribieron' es un verbo conjugado; su terminación '-ron' porta de manera fusionada o amalgamada los accidentes de 3.ª persona, plural, tiempo pretérito, modo indicativo y aspecto perfectivo.",
                    subject = "Lenguaje",
                    semana = 4
                ),
                Challenge(
                    id = "q_len_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la palabra 'niñitas', los morfemas gramaticales derivativo y flexivo de género son respectivamente:",
                    options = listOf("-it- y -a-", "-as y -it-", "-niñ- y -as", "-it- y -s", "-a- y -s"),
                    correctIndex = 0,
                    explanation = "La descomposición es: 'niñ-' (lexema) + '-it-' (sufijo derivativo diminutivo) + '-a-' (flexivo simple de género femenino) + '-s' (flexivo de número plural).",
                    subject = "Lenguaje",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "len_t04_s03",
            subjectId = "lenguaje",
            semana = 4,
            subtema = "4.3 Procesos Formativos: Derivación y Composición",
            title = "Mecanismos de Derivación y Composición Yuxtapuesta vs. Propiamente Dicha",
            theory = LessonTheory(
                id = "th_len_t04_s03",
                asignatura = "Lenguaje",
                semana = 4,
                titulo = "Derivación y Composición de Palabras",
                resumen = "La morfología léxica explica cómo se enriquecen los vocabularios de la lengua:\n\n1. Derivación (Lexema + Morfema Derivativo):\n   - Es el procedimiento más productivo del español.\n   - Prefijación: *in-mortal*, *pre-universitario*.\n   - Sufijación: *camp-esino*, *dulz-ura*, *amabil-idad*.\n   - Prefijación y sufijación no simultánea: *des-leal-dad* (existe la palabra intermedia *desleal* y *lealtad*).\n\n2. Composición (Unión de dos o más Lexemas: Raíz + Raíz):\n   - Composición por Yuxtaposición (Sin variación fonética):\n     Dos raíces se unen directamente sin que ninguna sufra cambio ortográfico ni alteración de sonido.\n     *Ejemplos*: *corta* + *uñas* = *cortauñas*; *guarda* + *bosque* = *guardabosque*; *lava* + *platos* = *lavaplatos*.\n   - Composición Propiamente Dicha (Con variación fonética):\n     Al unirse las raíces, al menos una de ellas sufre modificación fonética u ortográfica en su estructura.\n     *Ejemplos*: *blanco* + *rojo* = *blanquirrojo*; *mano* + *obra* = *maniobra*; *agrio* + *dulce* = *agridulce*; *pelo* + *rojo* = *pelirrojo*.",
                conceptosClave = listOf(
                    "Derivación: Lexema + Afijo derivativo (prefijo o sufijo)",
                    "Composición: Lexema + Lexema (mínimo dos bases léxicas)",
                    "Composición por Yuxtaposición: Raíces intactas sin alteración (corta-plumas, boca-calle)",
                    "Composición Propiamente Dicha: Variación fonética o gráfica en una raíz (blanqui-azul, alti-plano)"
                ),
                formulas = listOf(
                    "\\text{Derivación} = \\text{Raíz} + \\text{Sufijo / Prefijo}",
                    "\\text{Yuxtaposición} = \\text{Raíz}_1 + \\text{Raíz}_2 \\; (\\text{Sin cambios})",
                    "\\text{Comp. Propiamente Dicha} = \\text{Raíz}_1 + \\text{Raíz}_2 \\; (\\text{Con alteración fónica})"
                ),
                formulaName = "Fórmulas Morfológicas de Derivación y Composición",
                formulaLatex = "\\text{Palabra Compuesta} = \\text{Lexema}_1 + \\text{Lexema}_2",
                formulaDescription = "Dos lexemas con significado léxico propio integrados en una única palabra ortográfica.",
                admissionTip = "Para saber si es composición propiamente dicha, verifica si una raíz varió de vocal: *blanco* cambió a *blanqui-* en *blanquirrojo*; *mano* cambió a *mani-* en *maniobra*.",
                admissionExplanation = "• Palabras como 'sacacorchos' o 'abrelatas' son yuxtapuestas porque sus dos raíces permanecen 100% intactas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las palabras 'maniobra', 'agridulce' y 'pelirrojo' se han formado mediante el proceso de:",
                    options = listOf(
                        "Composición por yuxtaposición",
                        "Composición propiamente dicha",
                        "Parasíntesis clásica",
                        "Derivación por prefijación",
                        "Acronimia sincrónica"
                    ),
                    correctIndex = 1,
                    explanation = "En las tres palabras se unen dos raíces léxicas y la primera experimenta una modificación fonética (mano -> mani; agrio -> agri; pelo -> peli), lo que define a la composición propiamente dicha.",
                    subject = "Lenguaje",
                    semana = 4
                ),
                Challenge(
                    id = "q_len_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la alternativa que contiene únicamente palabras formadas por yuxtaposición:",
                    options = listOf(
                        "Picaflor, boquiabierto, paraguas",
                        "Rompeolas, girasol, guardacostas",
                        "Ciempiés, pelirrubio, sacapuntas",
                        "Desalmado, submarino, lustrabotas",
                        "Blanquiazul, camposanto, altavoz"
                    ),
                    correctIndex = 1,
                    explanation = "'Rompeolas' (rompe + olas), 'girasol' (gira + sol) y 'guardacostas' (guarda + costas) unen sus raíces sin alteración formal alguna.",
                    subject = "Lenguaje",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "len_t04_s04",
            subjectId = "lenguaje",
            semana = 4,
            subtema = "4.4 Parasíntesis y Otros Procesos Formativos",
            title = "Parasíntesis, Acronimia, Siglación, Acortamiento y Onomatopeya",
            theory = LessonTheory(
                id = "th_len_t04_s04",
                asignatura = "Lenguaje",
                semana = 4,
                titulo = "Parasíntesis y Otros Mecanismos Léxicos",
                resumen = "• La Parasíntesis:\n  Es el proceso morfológico donde intervienen de manera simultánea:\n  1. Composición + Derivación: Raíz + Raíz + Sufijo, con la condición indispensable de que no exista previamente en la lengua la palabra compuesta sola ni la derivada sola.\n     *Ejemplo*: *quince-añ-ero* (no existe *quinceaño* ni *añero*), *ropa-vej-ero*, *misa-cant-ano*.\n  2. Parasíntesis por Afijación Simultánea (Enmarcamiento): Prefijo + Raíz + Sufijo simultáneos, de modo que si quitamos el prefijo o el sufijo la palabra carece de existencia autónoma.\n     *Ejemplo*: *a-terr-izar* (no existe *aterro* ni *terrizar*), *des-alm-ado* (no existe *desalma* ni *almado*), *en-amor-ar*.\n\n• Otros Procesos Formativos de Palabras:\n  - Acronimia: Unión de fragmentos (sílabas o letras iniciales y finales) que se leen como una palabra corrida (*Sedapal*: Servicio de Agua Potable y Alcantarillado de Lima; *ofimática*: oficina + informática).\n  - Siglas: Formadas por las letras iniciales en mayúscula; se deletrean letra por letra (*DNI*, *UNSA*, *OEA*, *TLC*).\n  - Acortamiento o Apócope: Reducción fónica de un vocablo sin cambiar de categoría (*auto* por automóvil, *foto* por fotografía, *bici* por bicicleta).\n  - Onomatopeya: Imitación lingüística de sonidos de la naturaleza, ruidos o voces de animales (*miau*, *tictac*, *ulular* del viento, *croar* de la rana).",
                conceptosClave = listOf(
                    "Parasíntesis: Composición + Derivación simultánea (quinceañero, ropavejero)",
                    "Parasíntesis por enmarcamiento: Prefijo + Lexema + Sufijo sin existencia intermedia (desalmado, aterrizar)",
                    "Acronimia: Fusión silábica leída fluidamente (Sedapal, Mercosur, emoticono)",
                    "Siglas: Letras iniciales en mayúscula deletreadas (DNI, FMI, PNP)",
                    "Onomatopeyas: Voces y ruidos imitativos (croar, mugir, chasquido)"
                ),
                formulas = listOf(
                    "\\text{Parasíntesis} = \\text{Raíz}_1 + \\text{Raíz}_2 + \\text{Sufijo} \\; (\\text{Simultáneos})",
                    "\\text{Parasíntesis Afijal} = \\text{Prefijo} + \\text{Raíz} + \\text{Sufijo} \\; (\\text{Interdependientes})"
                ),
                formulaName = "Prueba del Descarte de Parasíntesis",
                formulaLatex = "\\text{Si existe palabra intermedia } (\\text{des-leal-dad}) \\implies \\text{Derivación, NO Parasíntesis}",
                formulaDescription = "Para ser parasintética no debe existir la forma intermedia con solo prefijo o solo sufijo.",
                admissionTip = "Prueba de oro: 'Desalmado' es parasintética porque no existe 'desalma' ni 'almado'. En cambio, 'deslealtad' NO es parasintética porque sí existe 'desleal' y 'lealtad' (es derivación).",
                admissionExplanation = "• Las siglas no llevan puntos entre sus letras (*DNI*, nunca *D.N.I.*) ni forman plural con 's' en la grafía (*los DNI*, nunca *los DNIs*)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes palabras ha sido creada mediante el proceso de parasíntesis?",
                    options = listOf("Deslealtad", "Ropavejero", "Submarino", "Inconmovible", "Lavalozas"),
                    correctIndex = 1,
                    explanation = "'Ropavejero' une dos raíces ('ropa' + 'viejo') y un sufijo derivativo ('-ero') simultáneamente; no existe en español *ropaviejo* como sustantivo único ni *vejero* solo.",
                    subject = "Lenguaje",
                    semana = 4
                ),
                Challenge(
                    id = "q_len_t04_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las palabras 'mininter' (Ministerio del Interior) y 'Sunat' (Superintendencia Nacional de Aduanas y de Administración Tributaria) son ejemplos de:",
                    options = listOf("Siglas deletreadas", "Acrónimos", "Onomatopeyas fonéticas", "Compuestos yuxtapuestos", "Apócopes derivativos"),
                    correctIndex = 1,
                    explanation = "Son acrónimos porque integran sílabas y letras iniciales pronunciándose como una palabra fonética continua y natural en el discurso.",
                    subject = "Lenguaje",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: SINTAXIS: CATEGORÍAS GRAMATICALES Y FRASES (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "len_t05_s01",
            subjectId = "lenguaje",
            semana = 5,
            subtema = "5.1 Categorías Gramaticales Variables: Sustantivo, Adjetivo, Determinante y Pronombre",
            title = "Clases de Palabras Variables y la Frase Nominal",
            theory = LessonTheory(
                id = "th_len_t05_s01",
                asignatura = "Lenguaje",
                semana = 5,
                titulo = "Categorías Nominales y Frase Nominal",
                resumen = "Las categorías variables cambian de forma para manifestar accidentes gramaticales:\n\n1. El Sustantivo (Nombre):\n   - Semántico: Nombra seres materiales o inmateriales (personas, cosas, ideas, cualidades).\n   - Morfológico: Posee accidentes de género y número.\n   - Sintáctico: Núcleo de la Frase Nominal (FN), del Sujeto, del Objeto Directo o Término de preposición.\n\n2. El Adjetivo Calificativo:\n   - Semántico: Expresa cualidades o estados del sustantivo.\n   - Sintáctico: Funciona como Modificador Directo (MD) dentro de la FN, o como Atributo / Predicativo en la Frase Verbal.\n\n3. Los Determinantes:\n   - Artículos (el, la, los, las, un, unos), Demostrativos (este, ese, aquel), Posesivos (mi, tu, su, nuestro), Cuantificadores (numerales e indefinidos).\n   - Sintáctico: Modificador Directo del sustantivo al que delimitan o actualizan.\n\n4. El Pronombre:\n   - Categoría de significado ocasional que sustituye al sustantivo o sintagma nominal para evitar repeticiones: Personales (yo, tú, él, me, te, se, nos), Demostrativos, Posesivos y Relativos (que, quien, cuyo).\n\n• La Frase Nominal (FN):\nEstructura sintáctica cuyo núcleo obligatorio es un sustantivo o pronombre, con Modificadores Directos (artículos, adjetivos) y Modificadores Indirectos (frases preposicionales, aposiciones).",
                conceptosClave = listOf(
                    "Sustantivo: Núcleo de la Frase Nominal (FN) con accidentes de género y número",
                    "Adjetivo: Modificador Directo (MD) o complemento predicativo/atributo",
                    "Determinante: Actualizador del sustantivo (artículo, demostrativo, posesivo, numeral)",
                    "Pronombre: Reemplaza a la FN; posee significado puramente contextual/ocasional",
                    "Estructura FN: (MD) + Núcleo + (MD) + (MI / Aposición)"
                ),
                formulas = listOf(
                    "\\text{FN} = [\\text{MD (Determinante)}] + \\mathbf{\\text{Núcleo (Sustantivo)}} + [\\text{MD (Adjetivo)}] + [\\text{MI (FPrep / Aposición)}]"
                ),
                formulaName = "Fórmula Canónica de la Frase Nominal",
                formulaLatex = "\\text{FN} = (\\text{Det}) + \\text{Nombre} + (\\text{Adj}) + (\\text{Prep} + \\text{Término})",
                formulaDescription = "Estructura jerárquica del sintagma nominal en el español estándar.",
                admissionTip = "Si la palabra acompaña al sustantivo, es determinante (*'este libro'*); si sustituye al sustantivo y va junto a un verbo, es pronombre (*'este llegó tarde'*).",
                admissionExplanation = "• La aposición es un modificador indirecto que aclara o renombra al núcleo nominal sin enlace preposicional: 'Arequipa, la Ciudad Blanca'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la oración: 'Aquel ilustre médico arequipeño donó valiosos equipos a su hospital', el núcleo del sujeto y sus modificadores directos son:",
                    options = listOf(
                        "Núcleo: hospital // MD: su",
                        "Núcleo: médico // MD: aquel, ilustre, arequipeño",
                        "Núcleo: equipos // MD: valiosos",
                        "Núcleo: médico // MD: aquel, donó",
                        "Núcleo: arequipeño // MD: aquel, ilustre"
                    ),
                    correctIndex = 1,
                    explanation = "El sujeto es 'Aquel ilustre médico arequipeño'. Su núcleo sustantivo es 'médico'; el demostrativo 'aquel' y los adjetivos 'ilustre' y 'arequipeño' son tres modificadores directos (MD).",
                    subject = "Lenguaje",
                    semana = 5
                ),
                Challenge(
                    id = "q_len_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿En cuál de las siguientes opciones la palabra 'pocos' funciona estrictamente como pronombre?",
                    options = listOf(
                        "Pocos estudiantes lograron resolver el problema.",
                        "Llegaron pocos postulantes a la primera hora.",
                        "Vimos pocas oportunidades de inversión este año.",
                        "Muchos postularon al examen, pero pocos ingresaron.",
                        "Compró pocos libros de matemática en la feria."
                    ),
                    correctIndex = 3,
                    explanation = "En la opción 4, 'pocos' no modifica a ningún sustantivo contiguo; reemplaza a 'estudiantes/postulantes' y ejerce función de núcleo de sujeto: es pronombre.",
                    subject = "Lenguaje",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "len_t05_s02",
            subjectId = "lenguaje",
            semana = 5,
            subtema = "5.2 El Verbo y las Perífrasis Verbales",
            title = "Estructura del Verbo, Formas No Personales y Perífrasis",
            theory = LessonTheory(
                id = "th_len_t05_s02",
                asignatura = "Lenguaje",
                semana = 5,
                titulo = "El Verbo y las Perífrasis Verbales",
                resumen = "El verbo es la categoría gramatical más compleja del idioma:\n\n1. Criterios de Definición:\n   - Semántico: Expresa acción, proceso, estado o existencia.\n   - Morfológico: Categoría variable por excelencia que posee 5 accidentes mediante el morfema amalgama: Persona, Número, Tiempo, Modo (Indicativo, Subjuntivo, Imperativo) y Aspecto (Perfectivo e Imperfectivo).\n   - Sintáctico: Funciona como Núcleo de la Frase Verbal (FV) y del Predicado.\n\n2. Formas No Personales (Verboides - Carecen de desinencia de persona):\n   - Infinitivo: Terminado en `-ar`, `-er`, `-ir` (funciona como sustantivo: *El cantar de las aves*).\n   - Participio: Terminado en `-ado`, `-ido`, `-to`, `-so`, `-cho` (funciona como adjetivo: *Libro leído*, o en tiempos compuestos con *haber*).\n   - Gerundio: Terminado en `-ando`, `-endo` (funciona como adverbio: *Llegó corriendo*).\n\n3. Las Perífrasis Verbales:\n   Estructura sintáctica unitaria compuesta por:\n   `[Verbo Auxiliar Conjugado] + (Nexo: que/de/a) + [Verboide Principal en Infinitivo, Gerundio o Participio]`\n   - Expresa un único significado verbal conjunto.\n   - Ejemplos: *Tiene que estudiar* (obligación), *Va a ingresar* (futuro), *Está leyendo* (durativo), *Suele madrugar* (frecuentativo).",
                conceptosClave = listOf(
                    "Verbo: Núcleo del predicado con amalgama de 5 accidentes",
                    "Modo: Indicativo (hechos reales), Subjuntivo (deseos/dudas), Imperativo (mandatos)",
                    "Aspecto: Perfectivo (acción concluida) vs. Imperfectivo (acción en curso)",
                    "Verboides: Infinitivo (sustantivo), Participio (adjetivo), Gerundio (adverbio)",
                    "Perífrasis Verbal: Verbo auxiliar conjugado + Verboide principal (un solo núcleo sintáctico)"
                ),
                formulas = listOf(
                    "\\text{Perífrasis Verbal} = \\text{Verbo Auxiliar Conjugado} + [\\text{Nexo: que/a/de}] + \\text{Verboide Principal}"
                ),
                formulaName = "Estructura Sintáctica de la Perífrasis Verbal",
                formulaLatex = "\\text{Núcleo FV} = V_{\\text{aux}} + (\\text{nexo}) + V_{\\text{inf/ger/part}}",
                formulaDescription = "Funciona como un solo verbo compuesto indivisible en el análisis sintáctico.",
                admissionTip = "Para verificar si es perífrasis verbal, comprueba si toda la estructura se puede reemplazar por un solo verbo conjugado: 'Tiene que estudiar' = 'Estudiará'.",
                admissionExplanation = "• Error frecuente en admisión: 'Quiero comer' NO es perífrasis verbal (equivale a 'Quiero eso' -> 'comer' es OD sustantivado)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que contiene una perífrasis verbal modal de obligación:",
                    options = listOf(
                        "Desea viajar a Lima durante las vacaciones.",
                        "El joven postulante tiene que repasar todas las noches.",
                        "Ellos prometieron regresar antes de la medianoche.",
                        "Los niños prefieren jugar en el parque.",
                        "Pensamos comprar los libros en la librería central."
                    ),
                    correctIndex = 1,
                    explanation = "'Tiene que repasar' es una perífrasis verbal de obligación formada por el auxiliar 'tener' + conjunción 'que' + infinitivo 'repasar'.",
                    subject = "Lenguaje",
                    semana = 5
                ),
                Challenge(
                    id = "q_len_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la oración: 'El candidato que fue elegido ayer asumirá funciones en julio', el verbo principal conjugado en modo indicativo y tiempo futuro es:",
                    options = listOf("Fue", "Elegido", "Asumirá", "Fue elegido", "Asumiría"),
                    correctIndex = 2,
                    explanation = "'Asumirá' es el verbo principal de la oración matriz, conjugado en tercera persona del singular, modo indicativo, tiempo futuro simple y aspecto imperfectivo.",
                    subject = "Lenguaje",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "len_t05_s03",
            subjectId = "lenguaje",
            semana = 5,
            subtema = "5.3 Categorías Invariables: Adverbio, Preposición y Conjunción",
            title = "Clases Invariables de Palabras y Conectores Lógicos",
            theory = LessonTheory(
                id = "th_len_t05_s03",
                asignatura = "Lenguaje",
                semana = 5,
                titulo = "Categorías Gramaticales Invariables",
                resumen = "Las categorías invariables carecen de accidentes gramaticales (no tienen género ni número; nunca cambian de desinencia):\n\n1. El Adverbio:\n   - Modificador de modificadores: Modifica a un Verbo (*corre rápidamente*), a un Adjetivo (*muy inteligente*) o a otro Adverbio (*bastante lejos*).\n   - Clases semánticas: Tiempo (ayer, hoy, pronto), Lugar (aquí, lejos, cerca), Modo (bien, mal, despacio, terminados en -mente), Cantidad (mucho, poco, nada), Afirmación (sí, ciertamente), Negación (no, nunca, jamás), Duda (quizá, acaso).\n\n2. La Preposición:\n   - Nexo subordinante por excelencia: Conecta una palabra principal con su término dependiente (Frase Preposicional: `Preposición + Término`).\n   - Inventario oficial de la RAE (23 preposiciones): *a, ante, bajo, cabe, con, contra, de, desde, durante, en, entre, hacia, hasta, mediante, para, por, según, sin, so, sobre, tras, versus, vía*.\n\n3. La Conjunción:\n   - Conector lógico coordinante o subordinante:\n   - Coordinantes: Copulativas (*y, e, ni, que*), Disyuntivas (*o, u*), Adversativas (*pero, mas, sino, sin embargo*), Distributivas (*ya... ya, bien... bien*), Explicativas (*es decir, o sea*), Ilativas (*luego, conque, por tanto*).\n   - Subordinantes: Causales (*porque, ya que*), Condicionales (*si, con tal que*), Concesivas (*aunque, a pesar de que*), Consecutivas (*tan... que*), Finales (*para que*).",
                conceptosClave = listOf(
                    "Adverbio: Invariable; modifica a verbo, adjetivo u otro adverbio",
                    "Preposiciones oficiales (23): a, ante, bajo, con, contra, de, desde, en, entre, hacia, hasta, para, por, según, sin, sobre, tras, etc.",
                    "Conjunciones Coordinantes: Unen elementos del mismo nivel sintáctico (copulativas, adversativas, ilativas)",
                    "Conjunciones Subordinantes: Introducen proposiciones subordinadas dependientes (causales, condicionales, concesivas)"
                ),
                formulas = listOf(
                    "\\text{Adverbio} \\to \\text{Modifica a } [\\text{Verbo} \\mid \\text{Adjetivo} \\mid \\text{Adverbio}]",
                    "\\text{Frase Preposicional} = \\text{Preposición (Enlace)} + \\text{Término (FN)}"
                ),
                formulaName = "Triángulo de Modificación del Adverbio",
                formulaLatex = "\\text{Adverbio} \\implies \\text{Modificador de: } V \\; / \\; Adj \\; / \\; Adv",
                formulaDescription = "El adverbio jamás modifica directamente a un sustantivo.",
                admissionTip = "La palabra 'medio' es adverbio cuando modifica a un adjetivo y es INVARIABLE: se dice 'Ella está medio loca', NUNCA 'media loca'. Error favorito de los exámenes de admisión.",
                admissionExplanation = "• Las preposiciones 'cabe' (junto a) y 'so' (bajo) son formas arcaicas en desuso, pero plenamente vigentes en la lista oficial de la RAE."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que presenta uso normativo correcto del adverbio:",
                    options = listOf(
                        "Las postulantes estaban medias nerviosas antes de la prueba.",
                        "Ella se encuentra medio preocupada por sus resultados.",
                        "Ellos llegaron bastantes cansados de su viaje.",
                        "Hablaron bastantes cosas interesantes en la reunión.",
                        "Ella es demasiada inteligente para cometer ese error."
                    ),
                    correctIndex = 1,
                    explanation = "'Medio' y 'demasiado' cuando modifican a un adjetivo ('preocupada', 'nerviosas', 'inteligente') funcionan como adverbios de cantidad, y al ser categorías invariables no deben concordar en género ni en número: 'medio preocupada'.",
                    subject = "Lenguaje",
                    semana = 5
                ),
                Challenge(
                    id = "q_len_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántas preposiciones distintas contiene el texto: 'Viajó desde Arequipa hacia Lima para postular con dedicación a la universidad'?",
                    options = listOf("3", "4", "5", "6", "2"),
                    correctIndex = 2,
                    explanation = "Las preposiciones son: 'desde', 'hacia', 'para', 'con', 'a'. En total hay 5 preposiciones distintas.",
                    subject = "Lenguaje",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "len_t05_s04",
            subjectId = "lenguaje",
            semana = 5,
            subtema = "5.4 Estructura de Sintagmas y Complementos de la Frase Verbal",
            title = "Complementos del Predicado: Objeto Directo, Indirecto, Atributo, Predicativo y Agente",
            theory = LessonTheory(
                id = "th_len_t05_s04",
                asignatura = "Lenguaje",
                semana = 5,
                titulo = "Estructura de la Frase Verbal y Complementos",
                resumen = "La Frase Verbal (FV) constituye el Predicado de la oración y se organiza alrededor de su núcleo verbal:\n\n1. Tipos de Predicado:\n   - Predicado Nominal: Construido con verbos copulativos (*ser, estar, parecer, permanecer*). Requiere obligatoriamente un **Atributo** (*'Mario es médico'*).\n   - Predicado Verbal: Construido con verbos no copulativos o predicativos (*trabajar, escribir, correr*).\n\n2. Complementos del Verbo:\n   - Objeto Directo (OD): Entidad sobre la que recae inmediatamente la acción verbal. Se reconoce porque se sustituye por los pronombres acusativos *lo, la, los, las* y se convierte en Sujeto Paciente en la voz pasiva (*'Compró flores'* -> *'Las compró'* / *'Las flores fueron compradas'*).\n   - Objeto Indirecto (OI): Destinatario, beneficiario o perjudicado por la acción. Se sustituye por *le, les* (*'Entregó el libro a su hermano'* -> *'Le entregó el libro'*).\n   - Complemento Atributo: Exclusivo de verbos copulativos; califica al sujeto y concuerda con él en género y número (*'Ella está feliz'*).\n   - Complemento Predicativo: Adjetivo que modifica simultáneamente al verbo no copulativo y al sujeto (*'El alumno respondió seguro'*).\n   - Complemento Agente: Exclusivo de la voz pasiva; encabeza con la preposición 'por' la entidad que ejecuta la acción (*'El cuadro fue pintado por Vinatea Reinoso'*).\n   - Complementos Circunstanciales: Señalan circunstancias de tiempo, lugar, modo, causa, finalidad, instrumento o compañía.",
                conceptosClave = listOf(
                    "Predicado Nominal: Verbo copulativo (ser, estar, parecer) + Atributo obligatorio",
                    "Objeto Directo (OD): Se reemplaza por lo, la, los, las y pasa a Sujeto en voz pasiva",
                    "Objeto Indirecto (OI): Se reemplaza por le, les (a / para + destinatario)",
                    "Predicativo: Modifica a verbo predicativo y concuerda con el sujeto (Llegó cansado)",
                    "Complemento Agente: En voz pasiva encabezado por la preposición 'por'"
                ),
                formulas = listOf(
                    "\\text{OD} \\implies [\\text{Pronominalización por: } lo, la, los, las] \\quad \\text{y} \\quad [\\text{Voz Pasiva: Sujeto Paciente}]",
                    "\\text{OI} \\implies [\\text{Pronominalización por: } le, les]"
                ),
                formulaName = "Pruebas Formales de Reconocimiento Sintáctico",
                formulaLatex = "\\text{Voz Activa}: \\; S + V + OD \\iff \\text{Voz Pasiva}: \\; S_{\\text{paciente}} + (\\text{ser} + \\text{participio}) + C.\\text{Agente}",
                formulaDescription = "Transformación pasiva para validar la presencia de un auténtico Objeto Directo.",
                admissionTip = "Si el verbo es copulativo (*ser, estar, parecer*), el adjetivo se llama ATRIBUTO. Si el verbo es de acción o no copulativo (*llegó, corrió*), el adjetivo se llama PREDICATIVO.",
                admissionExplanation = "• No todo sintagma encabezado por 'a' es OI: si se refiere a persona en función de OD, lleva 'a' personal: 'Vi a María' (La vi -> OD)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la oración: 'El rector entregó los diplomas a los egresados en el paraninfo', los complementos subrayados 'los diplomas' y 'a los egresados' funcionan como:",
                    options = listOf(
                        "Objeto Directo y Objeto Indirecto",
                        "Objeto Indirecto y Objeto Directo",
                        "Objeto Directo y Circunstancial de lugar",
                        "Atributo y Objeto Indirecto",
                        "Predicativo y Sujeto Paciente"
                    ),
                    correctIndex = 0,
                    explanation = "'Los diplomas' se sustituye por 'los' ('El rector los entregó') -> Objeto Directo. 'A los egresados' recibe el beneficio de la acción y se sustituye por 'les' ('El rector les entregó los diplomas') -> Objeto Indirecto.",
                    subject = "Lenguaje",
                    semana = 5
                ),
                Challenge(
                    id = "q_len_t05_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la oración que presenta un complemento predicativo subjetivo:",
                    options = listOf(
                        "Los postulantes estaban muy tranquilos.",
                        "El profesor explicó la clase con paciencia.",
                        "Los atletas llegaron exhaustos a la meta.",
                        "Arequipa es una ciudad hermosa del sur.",
                        "El examen fue corregido por la comisión."
                    ),
                    correctIndex = 2,
                    explanation = "En 'Los atletas llegaron exhaustos', el verbo 'llegaron' es predicativo (no copulativo) y el adjetivo 'exhaustos' califica al sujeto 'atletas' en concordancia de género y número: es predicativo.",
                    subject = "Lenguaje",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: LA ORACIÓN GRAMATICAL: SIMPLES Y COMPUESTAS (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "len_t06_s01",
            subjectId = "lenguaje",
            semana = 6,
            subtema = "6.1 La Oración Simple: Bimembres vs. Unimembres",
            title = "Clasificación Estructural y por la Actitud del Hablante",
            theory = LessonTheory(
                id = "th_len_t06_s01",
                asignatura = "Lenguaje",
                semana = 6,
                titulo = "La Oración Simple",
                resumen = "La oración es la unidad sintáctica mínima con autonomía sintáctica, sentido cabal y entonación propia:\n\n1. Clasificación por su Estructura:\n   - Oración Bimembre: Se divide en dos miembros interdependientes: Sujeto y Predicado (incluso con sujeto tácito: *'Ingresamos a Medicina'* [Sujeto: Nosotros]).\n   - Oración Unimembre: Carece de división entre sujeto y predicado; no admite sujeto gramatical ni lógico:\n     * Unimembres sin verbo (Frases oracionales): *'¡Buenos días!'*, *'¡Qué calor!'*, *'Silencio, por favor'*.\n     * Unimembres con verbo impersonal:\n       a) Fenómenos climáticos o meteorológicos: *'Llovió intensamente en Arequipa'*, *'Tronó en la cordillera'*.\n       b) Verbo *haber* en tercera persona singular: *'Hubo muchas vacantes'*, *'Habrá novedades'* (¡Nunca decir *hubieron vacantes*!).\n       c) Verbo *hacer* o *ser* climatológico o cronológico: *'Hace mucho frío'*, *'Es muy tarde'*.\n       d) Verbos con 'se' impersonal: *'Se vive bien aquí'*.\n\n2. Clasificación por la Actitud del Hablante:\n   - Enunciativas / Aseverativas (afirmativas o negativas): Informan hechos objetivos (*'El examen será el domingo'*).\n   - Interrogativas (directas e indirectas; totales y parciales): Preguntan (*'¿A qué hora empieza?'*).\n   - Exclamativas: Transmiten emoción vehemente (*'¡Qué alegría tan grande!'*).\n   - Imperativas / Exhortativas: Órdenes, mandatos, ruegos (*'Estudia a conciencia'*).\n   - Desiderativas / Optativas: Manifiestan deseos (*'Ojalá logre la vacante'*).\n   - Dubitativas: Expresan duda (*'Tal vez viaje mañana'*).",
                conceptosClave = listOf(
                    "Oración Bimembre: Posee Sujeto (expreso o tácito) y Predicado",
                    "Oración Unimembre: No admite sujeto (clima: llovió; haber impersonal: hubo vacantes; frases: ¡auxilio!)",
                    "Regla de oro de 'haber': En sentido impersonal siempre se conjuga en singular (Hubo problemas, NO hubieron)",
                    "Actitud del hablante: Enunciativas, Interrogativas, Exclamativas, Imperativas, Desiderativas, Dubitativas"
                ),
                formulas = listOf(
                    "\\text{Bimembre} = \\text{Sujeto (Expreso o Tácito)} + \\text{Predicado}",
                    "\\text{Unimembre} \\implies \\text{Impersonal (Sin sujeto): Llovió / Hubo / Hace frío / ¡Auxilio!}"
                ),
                formulaName = "Dicotomía de la Oración Simple",
                formulaLatex = "\\text{Oración Simple} = 1 \\text{ solo verbo conjugado principal}",
                formulaDescription = "Una sola predicación sintáctica frente a la oración compuesta.",
                admissionTip = "El verbo 'haber' cuando denota existencia solo se conjuga en tercera persona SINGULAR: se dice 'Habrá muchas vacantes', 'Hubo dos heridos'. Usar 'hubieron' o 'habrán' es un error gravísimo castigado en admisión.",
                admissionExplanation = "• En 'Se alquila habitaciones', el 'se' pasivo reflejo permite concordancia con el sujeto paciente ('Se alquilan habitaciones')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes oraciones es formalmente unimembre?",
                    options = listOf(
                        "Ellos llegaron puntuales a la ceremonia.",
                        "Hace demasiado frío en la ciudad de Juliaca.",
                        "Nosotros resolveremos el examen con serenidad.",
                        "El científico presentó su teoría ante el congreso.",
                        "Volveremos a encontrarnos muy pronto en la universidad."
                    ),
                    correctIndex = 1,
                    explanation = "'Hace demasiado frío en la ciudad de Juliaca' emplea el verbo 'hacer' en sentido meteorológico impersonal: carece de sujeto y no puede dividirse en sujeto y predicado (oración unimembre).",
                    subject = "Lenguaje",
                    semana = 6
                ),
                Challenge(
                    id = "q_len_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que manifiesta una actitud dubitativa del hablante:",
                    options = listOf(
                        "¡Ojalá apruebes todas tus asignaturas este ciclo!",
                        "Por favor, entrégame el documento antes de las cinco.",
                        "Quizás los resultados de admisión sean publicados hoy.",
                        "El volcán Sabancaya emitió gases volcánicos ayer.",
                        "¿Quién descubrió los restos arqueológicos de Caral?"
                    ),
                    correctIndex = 2,
                    explanation = "'Quizás los resultados de admisión sean publicados hoy' expresa incertidumbre, probabilidad o vacilación mediante el adverbio 'quizás', característico de la modalidad dubitativa.",
                    subject = "Lenguaje",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "len_t06_s02",
            subjectId = "lenguaje",
            semana = 6,
            subtema = "6.2 Oraciones Compuestas por Coordinación",
            title = "Coordinadas Yuxtapuestas y Conjuntivas (Copulativas, Adversativas, Ilativas)",
            theory = LessonTheory(
                id = "th_len_t06_s02",
                asignatura = "Lenguaje",
                semana = 6,
                titulo = "Oraciones Compuestas por Coordinación",
                resumen = "Una oración compuesta posee dos o más proposiciones con verbo conjugado propio. En la coordinación, las proposiciones tienen **el mismo nivel jerárquico sintáctico** e independencia gramatical mutua:\n\n1. Coordinadas Yuxtapuestas:\n   - Se unen directamente mediante signos de puntuación (coma, punto y coma, dos puntos) sin conjunción intermedia.\n   - *Ejemplo*: *'El docente explicaba el tema; los alumnos tomaban apuntes; todos guardaban silencio'*.\n\n2. Coordinadas Conjuntivas (Unidas por conjunciones coordinantes):\n   - Copulativas (*y, e, ni*): Suman o adicionan proposiciones (*'Él postuló a Medicina y ella eligió Derecho'*).\n   - Disyuntivas (*o, u*): Presentan opciones excluyentes (*'Estudias con disciplina o renuncias a tus sueños'*).\n   - Adversativas (*pero, mas, sino, sin embargo, no obstante*): Expresan oposición parcial o total entre las proposiciones (*'Se preparó durante un año, pero no alcanzó el puntaje'*).\n   - Ilativas o Consecutivas coordinadas (*luego, conque, por lo tanto, así que*): Indican deducción o consecuencia lógica natural (*'Pienso, luego existo'*, *'Estudió con ahínco, por lo tanto ingresará'*).\n   - Distributivas (*ya... ya, bien... bien, ora... ora*): Alternancia temporal o espacial (*'Ya ríe de alegría, ya llora de emoción'*).\n   - Explicativas (*es decir, o sea, esto es*): La segunda proposición aclara la primera (*'Tiene amnesia, es decir, no recuerda nada'*).",
                conceptosClave = listOf(
                    "Oración Compuesta: Dos o más proposiciones con verbo conjugado",
                    "Yuxtapuestas: Unión mediante signos de puntuación ( , ; : ) sin nexos",
                    "Copulativas (y, e, ni): Suma de proposiciones",
                    "Adversativas (pero, mas, sino, sin embargo): Oposición o contraste de ideas",
                    "Ilativas (luego, conque, por lo tanto): Deducción lógica inmediata"
                ),
                formulas = listOf(
                    "\\text{Yuxtapuesta} = P_1 \\; [, / ; / :] \\; P_2",
                    "\\text{Conjuntiva} = P_1 + [\\text{Conjunción Coordinante: y / pero / o / por tanto}] + P_2"
                ),
                formulaName = "Esquema de Coordinación Oracional",
                formulaLatex = "P_1 \\iff P_2 \\quad (\\text{Independencia sintáctica y jerarquía equivalente})",
                formulaDescription = "Ninguna proposición coordinada se encuentra subordinada o incrustada dentro de la otra.",
                admissionTip = "La conjunción 'luego' es ilativa de coordinación cuando equivale a 'por lo tanto' (*'Estudié, luego aprobaré'*). Si indica tiempo (*'Fui al cine y luego cené'*), es un adverbio.",
                admissionExplanation = "• Antes de las conjunciones adversativas 'pero', 'mas' y 'sino' se coloca obligatoriamente coma ortográfica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la oración: 'El postulante repasó intensamente todas las fórmulas, sin embargo, el examen incluyó preguntas de razonamiento analítico', la relación de coordinación es:",
                    options = listOf(
                        "Coordinada copulativa",
                        "Coordinada disyuntiva",
                        "Coordinada adversativa",
                        "Coordinada ilativa",
                        "Coordinada explicativa"
                    ),
                    correctIndex = 2,
                    explanation = "El conector 'sin embargo' es una locución conjuntiva adversativa que contrapone dos proposiciones independientes, indicando restricción u oposición.",
                    subject = "Lenguaje",
                    semana = 6
                ),
                Challenge(
                    id = "q_len_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes alternativas es una oración compuesta coordinada por yuxtaposición?",
                    options = listOf(
                        "El viento soplaba con fuerza, pero los barcos continuaron navegando.",
                        "Llegó temprano a la academia, abrió sus libros, comenzó a practicar.",
                        "Si terminas a tiempo tus tareas, iremos al concierto el fin de semana.",
                        "Dijo que regresaría después de culminar sus prácticas profesionales.",
                        "Aunque llovía copiosamente, los atletas no detuvieron la carrera."
                    ),
                    correctIndex = 1,
                    explanation = "'Llegó temprano a la academia, abrió sus libros, comenzó a practicar' contiene tres proposiciones con verbo propio unidas directamente por comas sin ninguna conjunción: es yuxtapuesta.",
                    subject = "Lenguaje",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "len_t06_s03",
            subjectId = "lenguaje",
            semana = 6,
            subtema = "6.3 Oraciones Compuestas por Subordinación Sustantiva y Adjetiva",
            title = "Subordinadas Sustantivas (Sujeto, OD, Término) y Adjetivas (Relativos)",
            theory = LessonTheory(
                id = "th_len_t06_s03",
                asignatura = "Lenguaje",
                semana = 6,
                titulo = "Subordinación Sustantiva y Adjetiva",
                resumen = "En la subordinación, una proposición dependiente (subordinada) queda incrustada dentro de una proposición principal ejerciendo una función sintáctica específica:\n\n1. Proposiciones Subordinadas Sustantivas (PS Sust):\n   - Cumplen las mismas funciones que un sustantivo o FN dentro de la oración principal.\n   - Nexos encabezadores: La conjunción completiva *que* o *si*, o pronombres interrogativos (*quién, qué, cómo*), o verbos en infinitivo.\n   - Prueba de oro: Toda proposición subordinada sustantiva se puede reemplazar íntegramente por el pronombre demostrativo neutro **'ESO'** (o *'esas cosas'*).\n   - Funciones principales:\n     * De Sujeto: *'Quien persevera alcanza el éxito'* / *'Que estudies a diario es necesario'* (*'ESO es necesario'*).\n     * De Objeto Directo (OD): *'El docente dijo que el examen es el domingo'* (*'El docente dijo ESO'* -> *'El docente LO dijo'*).\n     * De Término de Preposición (en OI o Suplemento): *'Tengo la certeza de que ingresarás'* (*'de ESO'*).\n\n2. Proposiciones Subordinadas Adjetivas (PS Adj):\n   - Cumplen la función de un adjetivo modificando a un sustantivo antecedente dentro de una FN.\n   - Encabezadas por pronombres relativos: *que* (= el cual, la cual), *quien*, *cuyo*, *donde* con antecedente.\n   - Tipos:\n     * Especificativa (sin comas, restringe el significado): *'Los alumnos que repasaron a conciencia ingresaron'*.\n     * Explicativa (entre comas, añade una aclaración accesoria): *'Los alumnos, que repasaron a conciencia, ingresaron'*.",
                conceptosClave = listOf(
                    "Subordinada Sustantiva: Reemplazable por 'ESO' (Sujeto, OD, Término)",
                    "Nexo sustantivo: Conjunción completiva 'que', 'si' o pronombres interrogativos",
                    "Subordinada Adjetiva: Modifica a un sustantivo antecedente (equivale a un adjetivo)",
                    "Nexo adjetivo: Pronombre relativo 'que' (sustituible por el cual/la cual), 'quien', 'cuyo'",
                    "Adjetiva Especificativa (sin comas) vs. Explicativa (entre comas)"
                ),
                formulas = listOf(
                    "\\text{PS Sustantiva} \\implies \\text{Reemplazo por: } [\\mathbf{ESO} / \\mathbf{ESAS\\ COSAS}]",
                    "\\text{PS Adjetiva} \\implies \\text{Sustantivo Antecedente} + [\\text{que} = \\text{el cual / la cual}]"
                ),
                formulaName = "Algoritmo de Detección de Subordinadas Sustantivas y Adjetivas",
                formulaLatex = "P_{\\text{principal}} [\\text{que } \\dots = \\text{ESO}] \\implies \\text{Sustantiva} \\quad \\mid \\quad \\text{Sustantivo} + [\\text{que } \\dots] \\implies \\text{Adjetiva}",
                formulaDescription = "El reemplazo por 'ESO' identifica de inmediato una subordinada sustantiva.",
                admissionTip = "Para diferenciar 'que' conjunción (sustantiva) de 'que' relativo (adjetiva): si antes de 'que' hay un sustantivo antecedente y puedes cambiar 'que' por 'el cual', es ADJETIVA. Si puedes cambiar toda la proposición por 'ESO', es SUSTANTIVA.",
                admissionExplanation = "• En 'El libro que compré es fascinante': 'que compré' modifica a 'libro' (El libro el cual compré) -> Subordinada Adjetiva."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el enunciado: 'El decano prometió a los estudiantes que inaugurará los laboratorios el próximo mes', la proposición subordinada funciona como:",
                    options = listOf(
                        "Sujeto de la oración",
                        "Objeto Directo del verbo prometer",
                        "Objeto Indirecto de los estudiantes",
                        "Complemento Circunstancial de tiempo",
                        "Proposición subordinada adjetiva explicativa"
                    ),
                    correctIndex = 1,
                    explanation = "La proposición 'que inaugurará los laboratorios el próximo mes' completa la acción directa del verbo transitorio 'prometió': 'El decano prometió ESO' -> 'El decano SE LO prometió' (Objeto Directo).",
                    subject = "Lenguaje",
                    semana = 6
                ),
                Challenge(
                    id = "q_len_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que contiene una proposición subordinada adjetiva especificativa:",
                    options = listOf(
                        "Deseo que todos logren alcanzar sus metas universitarias.",
                        "Los médicos que atendieron la emergencia recibieron un reconocimiento.",
                        "El presidente anunció que la inflación continuará a la baja.",
                        "Es indispensable que presentes tus certificados originales.",
                        "Ella dudaba de que él estuviera diciendo la verdad completa."
                    ),
                    correctIndex = 1,
                    explanation = "'Que atendieron la emergencia' modifica directamente al sustantivo antecedente 'médicos' sin comas intermedias delimitando su alcance (adjetiva especificativa).",
                    subject = "Lenguaje",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "len_t06_s04",
            subjectId = "lenguaje",
            semana = 6,
            subtema = "6.4 Oraciones Compuestas por Subordinación Adverbial",
            title = "Subordinadas Adverbiales Propias (Tiempo, Lugar, Modo) e Impropias (Causales, Condicionales, Concesivas)",
            theory = LessonTheory(
                id = "th_len_t06_s04",
                asignatura = "Lenguaje",
                semana = 6,
                titulo = "Subordinación Adverbial",
                resumen = "Las proposiciones subordinadas adverbiales funcionan como complementos circunstanciales de la proposición principal. Se dividen en dos grandes grupos:\n\n1. Subordinadas Adverbiales Propias (Sustituibles por un adverbio simple):\n   - De Lugar: Encabezadas por *donde* sin antecedente expreso (sustituible por *allí*): *'Nos reuniremos donde acordamos ayer'* (*allí*).\n   - De Tiempo: Encabezadas por *cuando, mientras, apenas, antes de que* (sustituible por *entonces / hoy*): *'Llegaron cuando la ceremonia comenzaba'* (*entonces*).\n   - De Modo: Encabezadas por *como, según, conforme* (sustituible por *así*): *'Resolvió los ejercicios como el profesor indicó'* (*así*).\n\n2. Subordinadas Adverbiales Impropias (Relaciones lógicas complejas no sustituibles por un adverbio):\n   - Causales: Expresan el motivo o causa originaria (*porque, ya que, puesto que*): *'No asistió a la prueba porque estuvo enfermo'*.\n   - Condicionales: Establecen un requisito hipotético (*si, siempre que, con tal que*): *'Si perseveras en tu estudio, alcanzarás la vacante'*.\n   - Concesivas: Expresan una dificultad u obstáculo que no impide la realización de la acción (*aunque, a pesar de que, por más que*): *'Aunque el examen fue riguroso, obtuvo el primer puesto'*.\n   - Consecutivas: Consecuencia de una intensidad (*tan... que, tanto... que*): *'Gritó tanto que perdió la voz'*.\n   - Finales: Expresan el propósito u objetivo perseguido (*para que, a fin de que*): *'Estudia con disciplina para que tus padres estén orgullosos'*.",
                conceptosClave = listOf(
                    "Adverbiales Propias: Lugar (donde = allí), Tiempo (cuando = entonces), Modo (como = así)",
                    "Causales: 'porque', 'ya que' (expresan la causa de la acción principal)",
                    "Condicionales: 'si' condicional, prótasis y apódosis",
                    "Concesivas: 'aunque', 'a pesar de que' (obstáculo superado)",
                    "Finales: 'para que', 'a fin de que' (propósito de la acción)"
                ),
                formulas = listOf(
                    "\\text{Lugar} \\implies \\text{donde} \\; (\\text{allí}), \\quad \\text{Tiempo} \\implies \\text{cuando} \\; (\\text{entonces}), \\quad \\text{Modo} \\implies \\text{como} \\; (\\text{así})",
                    "\\text{Concesiva}: \\; [\\text{Aunque} + \\text{Dificultad}] \\implies \\text{No impide la acción principal}"
                ),
                formulaName = "Clasificación de Adverbiales Propias e Impropias",
                formulaLatex = "\\text{PS Adverbial} = \\text{Propias (Lugar, Tiempo, Modo)} \\cup \\text{Impropias (Causa, Condición, Concesión, Fin)}",
                formulaDescription = "Mapeo completo de las relaciones de circunstancia y lógica proposicional en el predicado.",
                admissionTip = "Si la oración empieza con 'Si' condicional o 'Aunque' concesivo, la coma antes de la proposición principal es OBLIGATORIA por ser hipérbaton circunstancial: 'Si estudias a diario, ingresarás'.",
                admissionExplanation = "• No confunda 'porque' (conjunción causal subordinada: 'No vino porque llovió') con 'por qué' (interrogativo) o 'el porqué' (sustantivo causa)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la oración: 'Aunque las preguntas de física fueron sumamente complejas, el estudiante obtuvo el máximo puntaje', la proposición subordinada es de tipo:",
                    options = listOf(
                        "Adverbial causal",
                        "Adverbial condicional",
                        "Adverbial concesiva",
                        "Adverbial final",
                        "Adjetiva especificativa"
                    ),
                    correctIndex = 2,
                    explanation = "El conector 'aunque' introduce una proposición subordinada adverbial concesiva, señalando un obstáculo o dificultad que no impidió el cumplimiento del resultado de la proposición principal.",
                    subject = "Lenguaje",
                    semana = 6
                ),
                Challenge(
                    id = "q_len_t06_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la alternativa que contiene una proposición subordinada adverbial de modo:",
                    options = listOf(
                        "Redactó el ensayo conforme indicaban las bases del concurso literario.",
                        "Regresaremos a casa cuando caiga el atardecer en el valle.",
                        "Se construyó un nuevo laboratorio donde antes funcionaba el almacén.",
                        "No rindió la prueba porque no presentó su carné de postulante.",
                        "Ahorró dinero durante meses para que pudiera viajar a la convención."
                    ),
                    correctIndex = 0,
                    explanation = "'Conforme indicaban las bases' expresa la manera o modo como se realizó la acción verbal ('Redactó el ensayo ASÍ') -> subordinada adverbial de modo.",
                    subject = "Lenguaje",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: DISCURSO ESCRITO Y NORMATIVA (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "len_t07_s01",
            subjectId = "lenguaje",
            semana = 7,
            subtema = "7.1 Puntuación: Clases de Coma",
            title = "Normativa de la Coma: Enumerativa, Vocativa, Elíptica, Hiperbática e Incidental",
            theory = LessonTheory(
                id = "th_len_t07_s01",
                asignatura = "Lenguaje",
                semana = 7,
                titulo = "La Coma y sus Clases Normativas",
                resumen = "La coma delimita unidades menores dentro del enunciado para estructurar el sentido y evitar ambigüedades. La RAE clasifica las siguientes clases de comas obligatorias:\n\n1. Coma Enumerativa: Separa elementos análogos de una serie sintáctica (*'Compró lápices, cuadernos, borradores y reglas'*).\n2. Coma Vocativa: Aísla al interlocutor o destinatario a quien se dirige la palabra. Puede ir al inicio, al medio o al final (*'Jóvenes, estudien con rigor'*, *'Estudien, jóvenes, con rigor'*, *'Estudien con rigor, jóvenes'*).\n3. Coma Elíptica: Reemplaza a un verbo omitido que ya se mencionó antes o se sobreentiende por el contexto (*'Mario postula a Medicina; Carmen, a Derecho'* -> la coma tras Carmen sustituye a *postula*).\n4. Coma Hiperbática: Marca la alteración del orden lógico circunstancial canónico (Sujeto + Verbo + Complementos) cuando un circunstancial extenso se antepone al sujeto (*'Durante las vacaciones de verano en Arequipa, los estudiantes practicaron natación'*).\n5. Coma Incidental o Explicativa: Encierra aclaraciones, aposiciones o precisiones que pueden suprimirse sin alterar la estructura básica (*'Mariano Melgar, el poeta mártir, nació en Arequipa'*).\n6. Coma de Nexo Gramatical: Antes de conectores adversativos, ilativos o explicativos (*'Se preparó mucho, pero no ingresó'*, *'Es tarde, conque apúrate'*).\n\n• Regla de Oro: NUNCA se separa el Sujeto del Verbo con una sola coma (coma criminal o asesina).",
                conceptosClave = listOf(
                    "Coma Vocativa: Aísla al destinatario del mensaje (no confundir con el sujeto)",
                    "Coma Elíptica: Sustituye a un verbo ya mencionado o elidido",
                    "Coma Hiperbática: Marca la inversión de orden sintáctico (Circunstancial antepuesto)",
                    "Coma Incidental/Apositiva: Encierra frases explicativas entre dos comas",
                    "Prohibición absoluta: Jamás colocar coma entre sujeto y verbo principal ('Coma criminal')"
                ),
                formulas = listOf(
                    "\\text{Orden Lógico Canónico} = \\text{Sujeto} + \\text{Verbo} + \\text{Complementos} \\; (\\text{SIN coma intermedia})",
                    "\\text{Hiperbática} = \\text{Circunstancial Extenso}, + \\text{Sujeto} + \\text{Verbo}"
                ),
                formulaName = "Topología de la Coma Normativa",
                formulaLatex = "\\text{Sujeto} \\; \\mathbf{\\neq [,]} \\; \\text{Verbo} \\quad (\\text{Prohibida la coma entre sujeto y predicado})",
                formulaDescription = "Principio cardinal de cohesión oracional prescrito por la Real Academia Española.",
                admissionTip = "El vocativo NUNCA es sujeto. En 'Jóvenes, estudien a conciencia', 'jóvenes' lleva coma vocativa y el sujeto es tácito ('ustedes').",
                admissionExplanation = "• La coma elíptica es de altísima frecuencia en exámenes de admisión: fíjate si después de un punto y coma hay un sujeto seguido de coma y un complemento."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la expresión: 'La Universidad Nacional de San Agustín, alma máter de ilustres pensadores, celebró su aniversario institucional', las comas empleadas son:",
                    options = listOf("Enumerativas", "Vocativas", "Incidentales o apositivas", "Elípticas", "Hiperbáticas"),
                    correctIndex = 2,
                    explanation = "Encierran una aposición explicativa ('alma máter de ilustres pensadores') que precisa y describe al núcleo del sujeto 'Universidad Nacional de San Agustín'.",
                    subject = "Lenguaje",
                    semana = 7
                ),
                Challenge(
                    id = "q_len_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la opción donde se ha colocado correctamente la coma elíptica:",
                    options = listOf(
                        "Ella toca el piano; su hermano, el violín.",
                        "Ella, toca el piano y su hermano el violín.",
                        "Ella toca el piano, su hermano el violín.",
                        "Ella toca, el piano; su hermano, el violín.",
                        "Ella toca el piano; su hermano el violín,"
                    ),
                    correctIndex = 0,
                    explanation = "La coma después de 'su hermano' sustituye al verbo elidido 'toca', precedido adecuadamente de un punto y coma que separa las dos proposiciones coordinadas.",
                    subject = "Lenguaje",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "len_t07_s02",
            subjectId = "lenguaje",
            semana = 7,
            subtema = "7.2 El Punto, Punto y Coma, Dos Puntos y Puntos Suspensivos",
            title = "Jerarquía de Pausas Mayores: Punto y Coma, Dos Puntos y Citas",
            theory = LessonTheory(
                id = "th_len_t07_s02",
                asignatura = "Lenguaje",
                semana = 7,
                titulo = "Signos de Puntuación Mayores",
                resumen = "• El Punto y Coma ( ; ):\n  Indica una pausa mayor que la coma y menor que el punto:\n  1. Separa proposiciones yuxtapuestas extensas que tienen estrecha relación semántica (*'El río Chili creció considerablemente por las lluvias; los pobladores ribereños tomaron precauciones'*).\n  2. Separa elementos de una enumeración compleja que ya incluyen comas internas (*'Arequipa aportó poetas, como Melgar; Lima, narradores, como Ribeyro; Cusco, cronistas, como el Inca Garcilaso'*).\n  3. Delante de conectores adversativos o ilativos (*sin embargo, por lo tanto*) en enunciados de cierta longitud.\n\n• Los Dos Puntos ( : ):\n  Detienen el discurso para llamar la atención sobre lo que sigue:\n  1. Antes de una enumeración anunciada explícitamente (*'Compró tres materiales indispensables: regla, compás y transportador'*).\n  2. Antes de una cita textual entrecomillada (*'Mariano Melgar sentenció: \"Silvia, no te olvidaré jamás\"'*).\n  3. Tras el encabezamiento epistolar o de cartas (*'Estimado postulante:'*).\n  4. Relación de causa-efecto o explicación entre proposiciones sin conector (*'Se suspendió el partido: llovía torrencialmente'*).\n\n• Los Puntos Suspensivos ( ... ):\n  Son exactamente TRES puntos seguidos (nunca cuatro ni dos). Indican duda, temor, suspenso o final abierto.",
                conceptosClave = listOf(
                    "Punto y coma: Proposiciones complejas con comas internas o nexos largos",
                    "Dos puntos: Enumeración anunciada con anticipación, citas textuales y cartas",
                    "Puntos suspensivos: Exactamente tres puntos; denotan suspenso o elipsis",
                    "Error común: No usar dos puntos entre verbo y objeto directo ('Compró: pan' es incorrecto)"
                ),
                formulas = listOf(
                    "\\text{Enumeración anunciada} \\implies \\text{Elemento anticipador} + [ : ] + A, B, C",
                    "\\text{Cita Textual} \\implies \\text{Verbo de dicción} + [ : ] + \\text{\"Texto exacto\"}"
                ),
                formulaName = "Reglas de los Dos Puntos",
                formulaLatex = "[ : ] \\implies \\text{Cita Textual} \\; \\mid \\; \\text{Enumeración anunciada} \\; \\mid \\; \\text{Causa/Efecto sin nexo}",
                formulaDescription = "Uso de los dos puntos como signo de detención y apertura explicativa.",
                admissionTip = "Nunca uses dos puntos si la enumeración no está anticipada por un elemento anunciador. Es INCORRECTO escribir: 'Mis cursos favoritos son: Álgebra y Física'. Lo correcto es: 'Mis cursos favoritos son dos: Álgebra y Física'.",
                admissionExplanation = "• Después de los dos puntos en una cita textual o en el saludo de una carta, la palabra siguiente se escribe obligatoriamente con MAYÚSCULA inicial."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que presenta uso correcto de los dos puntos:",
                    options = listOf(
                        "Los requisitos para postular son: certificado de estudios y DNI.",
                        "Visitamos varias ciudades del sur peruano: Arequipa, Puno, Moquegua y Tacna.",
                        "El científico descubrió: una nueva especie de mariposa en el valle.",
                        "Ellos compraron: cuadernos, lapiceros y borradores para el ciclo.",
                        "Los días de la semana son: siete en el calendario solar."
                    ),
                    correctIndex = 1,
                    explanation = "La opción 2 anuncia previamente con un elemento generalizador ('varias ciudades del sur peruano') la enumeración que sigue, cumpliendo la normativa académica.",
                    subject = "Lenguaje",
                    semana = 7
                ),
                Challenge(
                    id = "q_len_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la alternativa donde se requiere obligatoriamente punto y coma:",
                    options = listOf(
                        "Ella estudia Medicina en la UNSA pero su primo en la UNI.",
                        "La delegación de Arequipa trajo sillar la de Puno artesanías en totora.",
                        "Llegaron temprano al aula rindieron el examen salieron sonrientes.",
                        "Ojalá tengamos tiempo de recorrer los claustros de la universidad.",
                        "El río Chili nace en las alturas de los Andes peruanos."
                    ),
                    correctIndex = 1,
                    explanation = "'La delegación de Arequipa trajo sillar; la de Puno, artesanías en totora' son dos proposiciones correlativas con comas elípticas internas que exigen un punto y coma separador.",
                    subject = "Lenguaje",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "len_t07_s03",
            subjectId = "lenguaje",
            semana = 7,
            subtema = "7.3 Normativa de Grafías de Escritura Dudosa (B/V, C/S/Z, G/J, H)",
            title = "Ortografía de Grafías Complejas, Homófonos y Prefijos",
            theory = LessonTheory(
                id = "th_len_t07_s03",
                asignatura = "Lenguaje",
                semana = 7,
                titulo = "Normativa de Grafías Dudosas",
                resumen = "La ortografía de grafías dudosas evalúa la distinción entre letras que comparten idéntico fonema en el español americano:\n\n• Uso de B vs. V:\n  - Se escriben con B: Terminaciones del pretérito imperfecto en *-aba* (*cantaba, caminaba*), verbos terminados en *-bir* (*escribir, recibir*; excepciones: *hervir, servir, vivir*), prefijos *bi-, bis-, sub-, bio-, bene-*.\n  - Se escriben con V: Terminaciones *-ívoro, -ívora* (*carnívoro*; excepción: *víbora*), adjetivos terminados en *-avo, -eve, -ivo* (*bravo, breve, activo*), tras las consonantes *n, d, b* (*enviar, advertir, obvio*).\n\n• Uso de C, S, Z:\n  - C: Terminaciones *-ción* derivadas de palabras en *-to, -tor, -do* (*canto* -> *canción*); diminutivos *-cito, -cillo* (*panecillo*).\n  - S: Terminaciones *-sión* derivadas de palabras en *-so, -sor, -sible* (*extenso* -> *extensión*); superlativos en *-ísimo* (*altísimo*).\n  - Z: Aumentativos en *-azo* (*golazo*); sustantivos abstractos en *-ez, -eza* (*vejez, belleza*).\n\n• Homófonos con Grafías Críticas:\n  - *Tubo* (cilindro hueco) vs. *Tuvo* (del verbo tener).\n  - *Basto* (tosco, naipe) vs. *Vasto* (amplio, extenso).\n  - *Cegar* (perder la vista) vs. *Segar* (cortar hierba con hoz).\n  - *Cima* (cumbre más alta) vs. *Sima* (abismo profundo).\n  - *Hecho* (del verbo hacer) vs. *Echo* (del verbo echar = arrojar).",
                conceptosClave = listOf(
                    "B vs V: -aba (cantaba) con B; enviar, advertir con V",
                    "C vs S: -ción (canto -> canción) vs. -sión (extenso -> extensión)",
                    "Z: abstractos en -ez, -eza (honradez, pereza) y aumentativos -azo",
                    "Homófonos cruciales: tubo/tuvo, basto/vasto, cima/sima, hecho/echo"
                ),
                formulas = listOf(
                    "\\text{Palabras en -to, -tor, -do} \\implies \\text{-ción (C)}",
                    "\\text{Palabras en -so, -sor, -sible} \\implies \\text{-sión (S)}"
                ),
                formulaName = "Regla de Derivación: -ción vs. -sión",
                formulaLatex = "\\text{Canto} \\to \\text{Canción (C)} \\quad \\mid \\quad \\text{Expreso} \\to \\text{Expresión (S)}",
                formulaDescription = "Criterio morfológico generador para resolver la ortografía de palabras abstractas terminadas en sonido /sión/.",
                admissionTip = "Recuerda: 'Vasto' con V significa inmenso, gigantesco ('un vasto territorio'). 'Basto' con B significa tosco, ordinario, o carta de la baraja.",
                admissionExplanation = "• El verbo 'echar' siempre va sin 'h' en todas sus conjugaciones: 'Yo echo la basura', 'Él echó a perder el plan'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete con las grafías adecuadas: 'El ex__cursionista contemplaba la __asta llanura desde la __ima de la cordillera nevada'.",
                    options = listOf(
                        "c / v / c",
                        "s / b / s",
                        "c / v / s",
                        "s / v / c",
                        "c / b / c"
                    ),
                    correctIndex = 0,
                    explanation = "'Excursionista' se escribe con c; 'vasta' con v significa extensa o amplia; 'cima' con c designa la cumbre o punto más alto de una montaña (a diferencia de 'sima' con s que es abismo).",
                    subject = "Lenguaje",
                    semana = 7
                ),
                Challenge(
                    id = "q_len_t07_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la palabra ortográficamente bien escrita:",
                    options = listOf("Herbívoro", "Extención", "Cigiloso", "Conduzcas", "Hojear (un libro con la vista)"),
                    correctIndex = 3,
                    explanation = "'Conduzcas' (del verbo conducir) se escribe con 'z' ante 'c'. 'Herbívoro' va con b (excepción de -ívoro es víbora, pero hierba va con b); 'extensión' va con s (de extenso); 'sigiloso' con s; para un libro con la vista es 'ojear' (sin h).",
                    subject = "Lenguaje",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "len_t07_s04",
            subjectId = "lenguaje",
            semana = 7,
            subtema = "7.4 Normativa de Letras Mayúsculas y Minúsculas",
            title = "Reglas Oficiales de la RAE: Mayúsculas Institucionales, Topónimos y Cargos",
            theory = LessonTheory(
                id = "th_len_t07_s04",
                asignatura = "Lenguaje",
                semana = 7,
                titulo = "Uso de Mayúsculas y Minúsculas",
                resumen = "La *Ortografía de la lengua española* (RAE 2010) prescribe reglas unificadas:\n\n1. Regla de Oro de la Tilde en Mayúsculas:\n   Las letras mayúsculas se tildan EXACTAMENTE igual que las minúsculas según las reglas generales (*África, ÁNGEL, PERÚ*). Nunca se omiten tildes en mayúsculas.\n\n2. Se Escriben con Mayúscula Inicial Obligatoria:\n   - Nombres propios de personas, animales y topónimos (*Arequipa, Misti, Chile*).\n   - Nombres de instituciones, entidades y organismos oficiales (*Universidad Nacional de San Agustín*, *Ministerio de Educación*, *Congreso de la República*).\n   - Edades históricas, períodos geológicos y movimientos culturales cuando definen época (*Edad Media*, *Renacimiento*, *Jurásico*; pero minúscula si se usa como adjetivo genérico: *'un templo renacentista'*).\n   - Fiestas patrias, cívicas y religiosas (*Navidad*, *Fiestas Patrias*, *Semana Santa*).\n   - Títulos de obras de creación artística (solo la primera letra lleva mayúscula: *'La ciudad y los perros'*, *'Cien años de soledad'*).\n\n3. Se Escriben con Minúscula Obligatoria (Casos Frecuentes de Error):\n   - Cargos públicos, títulos nobiliarios y dignidades religiosas (¡SIEMPRE con minúscula!): *presidente, papa, rey, juez, ministro, decano, rector* (*'El presidente viajará'*, *'El papa visitará Arequipa'*).\n   - Días de la semana, meses del año y estaciones (*lunes, diciembre, primavera*).\n   - Gentilicios y lenguas (*peruano, arequipeño, español, quechua*).\n   - Monedas del mundo (*sol, dólar, euro*).\n   - Puntos cardinales en su uso genérico (*viajó hacia el norte, el viento del sur*).",
                conceptosClave = listOf(
                    "Las mayúsculas SIEMPRE se tildan sin excepción (Álvarez, ÉXITO)",
                    "Cargos públicos eclesiásticos o civiles SIEMPRE con minúscula: papa, presidente, rey, rector",
                    "Días, meses y estaciones del año en minúscula (viernes, julio, verano)",
                    "Instituciones con mayúscula en sustantivos y adjetivos: Universidad Nacional de San Agustín",
                    "Títulos de libros o películas: solo la primera letra inicial (Cien años de soledad)"
                ),
                formulas = listOf(
                    "\\text{Cargos} \\implies \\text{presidente, rey, papa, ministro} \\; (\\mathbf{Minúscula})",
                    "\\text{Instituciones} \\implies \\text{Biblioteca Nacional del Perú} \\; (\\mathbf{Mayúscula})"
                ),
                formulaName = "Filtro de Mayúsculas RAE 2010",
                formulaLatex = "\\text{Cargos / Días / Meses / Gentilicios / Monedas} \\implies \\text{Minúscula obligatoria}",
                formulaDescription = "Eliminación de mayúsculas de cortesía en la norma académica oficial.",
                admissionTip = "Recuerda: la palabra 'presidente' o 'rector' se escribe SIEMPRE con minúscula, incluso si acompaña al nombre propio ('el presidente de la República', 'el rector de la UNSA').",
                admissionExplanation = "• Si el artículo forma parte inseparable del topónimo oficial, va con mayúscula: 'La Habana', 'El Cairo', 'La Libertad'. Si no lo es, va en minúscula: 'la ciudad de Arequipa'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la alternativa que presenta uso correcto de las letras mayúsculas y minúsculas:",
                    options = listOf(
                        "El Presidente de la República visitó la ciudad de Arequipa el Viernes pasado.",
                        "El papa Francisco recibió a los embajadores en la Ciudad del Vaticano.",
                        "En el mes de Julio, los Peruanos celebramos las Fiestas patrias.",
                        "El Rector de la Universidad Nacional de San Agustín inauguró el evento.",
                        "Leyó la célebre novela 'Los Ríos Profundos' del escritor José María Arguedas."
                    ),
                    correctIndex = 1,
                    explanation = "'papa' va con minúscula por ser cargo eclesiástico; 'Francisco' con mayúscula por ser nombre propio; 'Ciudad del Vaticano' con mayúscula por ser topónimo oficial del Estado.",
                    subject = "Lenguaje",
                    semana = 7
                ),
                Challenge(
                    id = "q_len_t07_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la opción donde el título de la obra artística está escrito respetando rigurosamente la norma de la RAE:",
                    options = listOf(
                        "Crónica De Una Muerte Anunciada",
                        "La Vida Es Sueño",
                        "Conversación en La catedral",
                        "Un mundo para Julius",
                        "El Ingenioso Hidalgo Don Quijote De La Mancha"
                    ),
                    correctIndex = 3,
                    explanation = "En los títulos de obras artísticas solo se escribe con mayúscula inicial la primera palabra y los nombres propios que contenga: 'Un mundo para Julius'.",
                    subject = "Lenguaje",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: SEMÁNTICA Y LEXICOLOGÍA (SEMANA 8)
        // =========================================================================
        LessonNode(
            id = "len_t08_s01",
            subjectId = "lenguaje",
            semana = 8,
            subtema = "8.1 El Signo Lingüístico: Características y Planos",
            title = "Teoría Saussureana del Signo: Significante, Significado y Principios",
            theory = LessonTheory(
                id = "th_len_t08_s01",
                asignatura = "Lenguaje",
                semana = 8,
                titulo = "El Signo Lingüístico",
                resumen = "Ferdinand de Saussure fundó la lingüística moderna concibiendo el lenguaje como un sistema de signos:\n\n1. Naturaleza Biplánica del Signo Lingüístico:\n   - El Significado (Concepto o Plano del Contenido): Es la imagen mental, idea abstracta o representación semántica que asociamos a un objeto o ser.\n   - El Significante (Imagen Acústica o Plano de la Expresión): Es la huella psíquica mental de la cadena de sonidos fónicos que componen la palabra (representada en fonemas: /m - e - s - a/).\n   - Ambas caras son inseparables como las dos caras de una misma hoja de papel.\n\n2. Principios Fundamentales del Signo:\n   - Arbitrariedad: La relación entre el significado y el significante es convencional y no motivada por la naturaleza de las cosas (el concepto de 'árbol' se dice *tree* en inglés, *arbor* en latín, *mallki* en quechua).\n   - Linealidad del Significante: Los sonidos se desenvuelven necesariamente en una línea temporal irreversible; no se pueden pronunciar dos fonemas a la vez.\n   - Mutabilidad (Diacronía): A lo largo de los siglos históricos, los signos sufren alteraciones fonéticas o semánticas (*ferro* -> *hierro*).\n   - Inmutabilidad (Sincronía): En un momento temporal dado, ningún hablante individual puede cambiar arbitrariamente el código establecido por la sociedad.",
                conceptosClave = listOf(
                    "Biplánico: Significado (concepto/contenido) + Significante (imagen acústica/expresión)",
                    "Arbitrariedad: Vínculo convencional y no motivado entre significado y significante",
                    "Linealidad: Los fonemas del significante se emiten de forma sucesiva en el tiempo",
                    "Mutabilidad en diacronía (cambia a través de los siglos)",
                    "Inmutabilidad en sincronía (fijo y estable en una época determinada)"
                ),
                formulas = listOf(
                    "\\text{Signo Lingüístico} = \\frac{\\text{Significado (Concepto)}}{\\text{Significante (Imagen Acústica)}}"
                ),
                formulaName = "Fórmula del Signo Saussureano",
                formulaLatex = "\\text{Signo} = \\frac{\\text{Plano del Contenido (Semas)}}{\\text{Plano de la Expresión (Fonemas)}}",
                formulaDescription = "Entidad psíquica de dos caras inseparables e interdependientes.",
                admissionTip = "Que un mismo animal se llame 'perro' en español, 'dog' en inglés y 'allqo' en quechua demuestra el principio de ARBITRARIEDAD del signo lingüístico.",
                admissionExplanation = "• La onomatopeya parece una excepción a la arbitrariedad, pero incluso los ruidos de animales varían según el idioma (gallo: 'kikirikí' en español, 'cock-a-doodle-doo' en inglés)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El hecho de que el concepto mental de 'agua' sea expresado mediante la secuencia sonora /u - n - u/ en quechua y /w - o - t - e - r/ en inglés evidencia primordialmente que el signo lingüístico es:",
                    options = listOf("Lineal", "Mutable en sincronía", "Arbitrario", "Articulado por monemas", "Psicofísico"),
                    correctIndex = 2,
                    explanation = "La arbitrariedad demuestra que no existe una relación necesaria ni natural entre el concepto (significado) y la cadena sonora que lo designa (significante), sino un pacto convencional social.",
                    subject = "Lenguaje",
                    semana = 8
                ),
                Challenge(
                    id = "q_len_t08_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La imposibilidad de pronunciar simultáneamente dos fonemas en una misma emisión de voz, obligando a encadenarlos uno tras otro en el tiempo, responde al principio de:",
                    options = listOf("Biplanidad", "Linealidad del significante", "Mutabilidad diacrónica", "Doble articulación", "Convencionalidad léxica"),
                    correctIndex = 1,
                    explanation = "El significante tiene carácter lineal porque se despliega en una dimensión temporal sucesiva e irreversible, formando una cadena continua de fonemas.",
                    subject = "Lenguaje",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "len_t08_s02",
            subjectId = "lenguaje",
            semana = 8,
            subtema = "8.2 Significado Denotativo y Connotativo",
            title = "Semántica Léxica: Semas, Denotación Objetiva y Connotación Expresiva",
            theory = LessonTheory(
                id = "th_len_t08_s02",
                asignatura = "Lenguaje",
                semana = 8,
                titulo = "Denotación y Connotación",
                resumen = "El significado de una palabra se descompone en unidades mínimas de significado llamadas SEMAS. El conjunto estructurado de semas conforma el SEMEMA:\n\n1. Significado Denotativo (Denotación):\n   - Es el significado primario, literal, objetivo, neutro y universal recogido formalmente en el diccionario.\n   - Es compartido de manera estable por todos los hablantes de la lengua sin depender de juicios emotivos o valorativos.\n   - Propio de textos científicos, jurídicos, periodísticos y enciclopédicos.\n   - *Ejemplos*: *'El cirujano operó el corazón del paciente'* (órgano muscular impulsor de la sangre); *'El león cazó una cebra en la sabana'* (mamífero carnívoro felino).\n\n2. Significado Connotativo (Connotación):\n   - Es el significado secundario, subjetivo, accesorio, figurado o metafórico que adquiere una palabra según el contexto, la cultura o la intención afectiva del hablante.\n   - Propio del lenguaje literario, coloquial, publicitario y poético.\n   - *Ejemplos*: *'Ese profesor tiene un corazón de oro'* (bondad y nobleza desinteresada); *'Ese muchacho peleó como un león en el debate'* (valentía y coraje indomable).",
                conceptosClave = listOf(
                    "Sema: Unidad mínima de significado; Semema: Conjunto total de semas de una palabra",
                    "Denotación: Significado literal, objetivo, primario y del diccionario",
                    "Connotación: Significado figurado, metafórico, subjetivo y contextual",
                    "La denotación es universal y neutra; la connotación depende de valoraciones culturales y emotivas"
                ),
                formulas = listOf(
                    "\\text{Significado Denotativo} = \\text{Semas Comunes Objetivos (Diccionario)}",
                    "\\text{Significado Connotativo} = \\text{Semas Afectivos / Metafóricos (Contexto)}"
                ),
                formulaName = "Ecuación Semántica: Denotación vs. Connotación",
                formulaLatex = "\\text{Significado Total} = \\text{Denotación (Literal)} + \\text{Connotación (Simbólica)}",
                formulaDescription = "Dos niveles de interpretación presentes en el discurso cotidiano y literario.",
                admissionTip = "Si la frase describe un hecho anatómico, botánico o factual demostrable, es DENOTACIÓN. Si usa comparaciones figuradas ('le rompieron el corazón', 'tiene mano dura'), es CONNOTACIÓN.",
                admissionExplanation = "• La denotación predomina en la función referencial; la connotación predomina en la función expresiva y poética del lenguaje."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración donde la palabra destacada se utiliza en sentido estrictamente denotativo:",
                    options = listOf(
                        "Aquel político tiene las manos limpias en su gestión.",
                        "El médico auscultó los pulmones y el corazón del infante.",
                        "Esa mujer es el pilar que sostiene a toda su familia.",
                        "Pintó un cuadro oscuro sobre el futuro económico del país.",
                        "Le dieron gato por liebre en la compra de ese automóvil."
                    ),
                    correctIndex = 1,
                    explanation = "En la opción 2, 'corazón' se utiliza en su acepción física, literal y anatómica de órgano biológico, correspondiente al significado denotativo.",
                    subject = "Lenguaje",
                    semana = 8
                ),
                Challenge(
                    id = "q_len_t08_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la expresión 'Ese juez dictó una sentencia fría y desalmada', la palabra 'fría' adquiere una significación:",
                    options = listOf("Denotativa térmica", "Connotativa afectiva o desprovista de piedad", "Etimológica latina", "Fonética articulada", "Homónima estricta"),
                    correctIndex = 1,
                    explanation = "'Fría' en este contexto no mide temperatura física, sino insensibilidad moral y falta de empatía, funcionando como un significado figurado o connotativo.",
                    subject = "Lenguaje",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "len_t08_s03",
            subjectId = "lenguaje",
            semana = 8,
            subtema = "8.3 Relaciones Léxicas: Homonimia, Polisemia y Paronimia",
            title = "Homonimia (Homófonas y Homógrafas), Polisemia y Paronimia",
            theory = LessonTheory(
                id = "th_len_t08_s03",
                asignatura = "Lenguaje",
                semana = 8,
                titulo = "Relaciones Léxicas de Forma y Significado",
                resumen = "Las palabras establecen múltiples relaciones formales y semánticas:\n\n1. Homonimia (Orígenes etimológicos distintos que coinciden por azar fonético):\n   - Homófonas: Igual sonido (/pronunciación/), pero diferente escritura y diferente significado (*tubo* / *tuvo*, *basto* / *vasto*, *ablando* / *hablando*).\n   - Homógrafas: Idéntica escritura y pronunciación, pero orígenes etimológicos totalmente independientes sin semas compartidos (*llama* animal / *llama* de fuego / *llama* del verbo llamar; *banco* asiento / *banco* financiero).\n\n2. Polisemia (Un solo origen que genera múltiples acepciones emparentadas):\n   - Una misma palabra (con una sola entrada en el diccionario) adquiere varias acepciones que comparten un sema o rasgo común por metáfora o metonimia.\n   - *Ejemplos*: *pata* de animal / *pata* de mesa / *pata* de silla (sema común: soporte inferior); *pico* de ave / *pico* de montaña (sema común: extremo puntiagudo superior); *ojo* humano / *ojo* de la cerradura (sema común: orificio circular).\n\n3. Paronimia (Semejanza fonética sin identidad):\n   - Palabras que se parecen en sonido o escritura, pero son distintas en significado y forma (*apto* / *acto*, *inminente* / *eminente*, *alcalde* / *alcaide*, *adoptar* / *adaptar*).",
                conceptosClave = listOf(
                    "Homonimia: Orígenes etimológicos distintos; coincidencia por evolución fónica casual",
                    "Homófonas: Igual sonido, distinta grafía (votar / botar)",
                    "Homógrafas: Idéntica escritura, significados 100% desconectados (lima fruta / lima herramienta)",
                    "Polisemia: Una sola palabra con varios sentidos emparentados por un sema común (copa de árbol / copa de cristal)",
                    "Paronimia: Parecido fonético que induce a confusión (inocuo / inicuo, aptitud / actitud)"
                ),
                formulas = listOf(
                    "\\text{Polisemia} = 1 \\text{ solo origen etimológico} \\implies \\text{Múltiples acepciones con sema común}",
                    "\\text{Homonimia} = \\text{Distintos orígenes etimológicos} \\implies \\text{Coincidencia gráfica casual}"
                ),
                formulaName = "Diferencia Clave: Polisemia vs. Homonimia",
                formulaLatex = "\\text{Polisemia (Sema común)} \\quad \\text{vs} \\quad \\text{Homonimia (Etimologías independientes)}",
                formulaDescription = "Criterio decisivo para resolver preguntas de semántica léxica en admisión.",
                admissionTip = "Si comparten un rasgo visual o funcional de analogía (*pata de mesa* y *pata de perro* sostienen el cuerpo), es POLISEMIA. Si no tienen absolutamente nada que ver (*banco* dinero y *banco* asiento), es HOMONIMIA.",
                admissionExplanation = "• Las palabras parónimas tienen significados totalmente distintos a pesar de su pronunciación similar (*prever* = anticipar; *proveer* = suministrar)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las palabras 'cima' (punto más elevado de un cerro) y 'sima' (abismo profundo en la tierra) guardan entre sí una relación de:",
                    options = listOf(
                        "Homonimia homógrafa",
                        "Homonimia homófona y antonimia",
                        "Polisemia contextual",
                        "Paronimia léxica",
                        "Hiperonimia recíproca"
                    ),
                    correctIndex = 1,
                    explanation = "Suenan exactamente igual en el español americano (/síma/), pero se escriben de manera distinta (homófonas); además, expresan significados opuestos de cumbre vs. abismo (antónimas).",
                    subject = "Lenguaje",
                    semana = 8
                ),
                Challenge(
                    id = "q_len_t08_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿En cuál de las siguientes expresiones se evidencia un fenómeno de polisemia?",
                    options = listOf(
                        "Compró una lima dulce para comer y una lima para afilar el cuchillo.",
                        "Se sentó en el banco del parque a contar el dinero del banco.",
                        "El carpintero reparó la pata de la silla tras acariciar la pata de su perro.",
                        "Ayer vino a la casa a degustar una botella de vino tinto.",
                        "Sobre la mesa dejó un sobre manila cerrado."
                    ),
                    correctIndex = 2,
                    explanation = "La palabra 'pata' (extremidad de animal vs. soporte de mueble) comparte un rasgo semántico de forma y función de sostén originado por metáfora: es un caso genuino de polisemia.",
                    subject = "Lenguaje",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "len_t08_s04",
            subjectId = "lenguaje",
            semana = 8,
            subtema = "8.4 Relaciones de Inclusión: Hiperonimia, Hiponimia y Cohiponimia",
            title = "Jerarquías Semánticas: Hiperónimos, Hipónimos, Cohipónimos y Holonimia",
            theory = LessonTheory(
                id = "th_len_t08_s04",
                asignatura = "Lenguaje",
                semana = 8,
                titulo = "Relaciones Semánticas de Inclusión",
                resumen = "Las redes de significado organizan el léxico en estructuras jerárquicas de inclusión conceptual:\n\n1. Hiperonimia (Término Englobante / Género):\n   - Es la palabra cuyo significado abarca y engloba semánticamente al de otros vocablos más específicos.\n   - *Ejemplo*: *'Flor'* es hiperónimo de *rosa, clavel, jazmín*; *'Cereal'* es hiperónimo de *trigo, arroz, avena*.\n\n2. Hiponimia (Término Específico / Especie):\n   - Es la palabra cuyo significado está contenido dentro de la amplitud de un hiperónimo.\n   - *Ejemplo*: *'Rosa'* y *'clavel'* son hipónimos de *flor*; *'Lápiz'* y *'borrador'* son hipónimos de *útil escolar*.\n\n3. Cohiponimia (Términos Hermanos / Misma Jerarquía):\n   - Es la relación que guardan entre sí dos o más hipónimos que comparten un mismo hiperónimo común.\n   - *Ejemplo*: *Rosa* y *clavel* son cohipónimos entre sí (ambos son flores); *Ceviche* y *rocoto relleno* son cohipónimos de *plato típico*.\n\n4. Holonimia y Meronimia (Relación Parte - Todo):\n   - Holónimo: El todo integral (*'Bicicleta'*, *'Cuerpo humano'*).\n   - Merónimo: Las partes que integran físicamente ese todo (*'Pedal, cadena, timón'* son merónimos de bicicleta; *'brazo, pierna, cabeza'* son merónimos de cuerpo).",
                conceptosClave = listOf(
                    "Hiperónimo: Término general englobante (género supremo)",
                    "Hipónimo: Término específico contenido en el hiperónimo (especie)",
                    "Cohipónimos: Hipónimos que pertenecen al mismo grupo y comparten hiperónimo",
                    "Holónimo (el todo) vs. Merónimo (la parte constituyente física)",
                    "Permiten mecanismos de cohesión textual para evitar repeticiones"
                ),
                formulas = listOf(
                    "\\text{Hiperónimo } [A] \\supset \\text{Hipónimos } [a_1, a_2, a_3]",
                    "\\text{Cohiponimia}: \\; a_1 \\sim a_2 \\quad (\\text{Hermandad semántica bajo el hiperónimo } A)",
                    "\\text{Holónimo (Todo)} \\supset \\text{Merónimos (Partes)}"
                ),
                formulaName = "Taxonomía de Inclusión Semántica",
                formulaLatex = "\\text{Hiperónimo (Género)} \\implies \\text{Hipónimos (Especies)} \\iff \\text{Cohipónimos}",
                formulaDescription = "Organización jerárquica de conjuntos semánticos de inclusión lógica.",
                admissionTip = "Diferencia bien hiponimia de meronimia: 'gato' es HIPÓNIMO de 'felino' (el gato ES un felino). Pero 'garra' es MERÓNIMO de 'gato' (la garra es PARTE del gato).",
                admissionExplanation = "• Los escritores utilizan hiperónimos para sustituir sustantivos ya mencionados y mantener la elegancia del discurso sin reiteraciones."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_len_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la serie de palabras: 'roble, cedro, caoba, pino', el término hiperónimo común que engloba a todas ellas es:",
                    options = listOf("Mueble", "Árbol", "Vegetal", "Bosque", "Selva"),
                    correctIndex = 1,
                    explanation = "'Árbol' es el hiperónimo inmediato de 'roble', 'cedro', 'caoba' y 'pino', los cuales guardan entre sí una relación de cohiponimia.",
                    subject = "Lenguaje",
                    semana = 8
                ),
                Challenge(
                    id = "q_len_t08_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la alternativa que contiene una relación de meronimia con respecto a la palabra 'computadora':",
                    options = listOf("Electrodoméstico", "Teclado", "Herramienta", "Dispositivo", "Internet"),
                    correctIndex = 1,
                    explanation = "El 'teclado' es una parte material constitutiva (merónimo) del todo integrado que es la 'computadora' (holónimo).",
                    subject = "Lenguaje",
                    semana = 8
                )
            )
        )
    )
}
