package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object InglesCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: READING COMPREHENSION & SHORT FUNCTIONAL TEXT TYPES (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "ing_t01_s01",
            subjectId = "ingles",
            semana = 1,
            subtema = "1.1 Skimming for Gist & Scanning for Specific Details",
            title = "Reading Strategies: Skimming and Scanning",
            theory = LessonTheory(
                id = "th_ing_t01_s01",
                asignatura = "Inglés",
                semana = 1,
                titulo = "Skimming and Scanning Strategies",
                resumen = "• Skimming (Lectura Veloz para la Idea Global / Gist):\n  - Técnica de lectura rápida orientada a captar la idea principal (main idea) y el propósito comunicativo del autor sin traducir palabra por palabra.\n  - Procedimiento: Leer el título, los subtítulos, la primera oración de cada párrafo (topic sentences) y las oraciones de conclusión.\n  - Preguntas UNSA: 'What is the passage mainly about?', 'The author's main purpose is to...'.\n\n• Scanning (Búsqueda de Datos Específicos):\n  - Lectura de barrido ocular rápido para localizar información puntual concreta (nombres propios, fechas, cifras, porcentajes, ciudades o palabras clave del enunciado).\n  - Procedimiento: Fijar la palabra clave de la pregunta en la mente y recorrer visualmente el texto en zig-zag hasta localizar el término o su sinónimo exacto.\n  - Preguntas UNSA: 'When did the event take place?', 'How much does the registration cost?'.",
                conceptosClave = listOf(
                    "Skimming: Captación del gist o tema central leyendo títulos y topic sentences",
                    "Scanning: Localización de datos puntuales (cifras, fechas, nombres) en barrido visual",
                    "Topic sentence: Oración inicial de párrafo que condensa la idea temática",
                    "Author's purpose: Informar (inform), persuadir (persuade) o explicar (explain)"
                ),
                formulas = listOf(
                    "\\text{Skimming} \\implies \\text{Topic Sentences} + \\text{Headings} \\to \\text{Gist / Main Idea}",
                    "\\text{Scanning} \\implies \\text{Keywords in Question} \\to \\text{Data / Fact (Dates, Numbers, Names)}",
                    "\\text{Reading Strategy} = \\text{Question Analysis} + \\text{Targeted Search (Zero Full Translation)}"
                ),
                formulaName = "Core Reading Search Protocols",
                formulaLatex = "\\text{Efficiency} = \\frac{\\text{Identified Target Keywords}}{\\text{Reading Time}}",
                formulaDescription = "Optimización del tiempo en pruebas de admisión mediante lectura estratégica selectiva.",
                admissionTip = "Nunca leas el texto completo primero si no sabes qué te preguntan. Lee primero las preguntas, subraya los sustantivos y números clave en el enunciado y luego haz scanning sobre el texto para ubicarlos de inmediato.",
                admissionExplanation = "• Cuando el texto sea extenso, recuerda que la idea principal (main idea) casi siempre se encuentra explícita o parafraseada en las dos primeras líneas del primer párrafo o en la conclusión final."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A student needs to find the exact founding year of the National University of San Agustín in a three-page historical document. Which cognitive reading technique should they employ?",
                    options = listOf(
                        "Skimming the entire conclusion word by word",
                        "Scanning the text for numbers and four-digit dates",
                        "Translating every adjective into Spanish",
                        "Writing a summary of the first chapter",
                        "Paraphrasing the bibliography"
                    ),
                    correctIndex = 1,
                    explanation = "Scanning is the designated search strategy to rapidly spot specific target information like numerical figures and dates without reading the entire narrative.",
                    subject = "Inglés",
                    semana = 1
                ),
                Challenge(
                    id = "q_ing_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Read the excerpt: 'Artificial intelligence is reshaping medicine by analyzing millions of medical images in seconds, allowing early detection of diseases.' The main topic of this passage is:",
                    options = listOf(
                        "The price of digital cameras in hospitals",
                        "How AI assists in rapid and early medical diagnostics",
                        "The history of medical universities in Europe",
                        "Why doctors prefer paper records over computers",
                        "The manufacturing process of microchips"
                    ),
                    correctIndex = 1,
                    explanation = "Skimming the sentence reveals that the central theme is the contribution of AI to healthcare through fast image analysis and early disease diagnosis.",
                    subject = "Inglés",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "ing_t01_s02",
            subjectId = "ingles",
            semana = 1,
            subtema = "1.2 Context Clues: Inferring Word Meaning and Synonyms",
            title = "Context Clues and Lexical Deduction",
            theory = LessonTheory(
                id = "th_ing_t01_s02",
                asignatura = "Inglés",
                semana = 1,
                titulo = "Context Clues and Lexical Deduction",
                resumen = "• Deducción Léxica por Pistas de Contexto (Context Clues):\n  - Cuando encuentras una palabra desconocida en el texto, no te detengas ni inventes; examina las oraciones contiguas.\n  - Mecanismos Clave:\n    1. Pistas de Definición o Reformulación: Uso de comas, guiones o expresiones como *that is, in other words, known as* ('The flora and fauna—that is, the plants and animals of the valley—are protected').\n    2. Pistas de Contraste y Antónimos: Palabras de oposición como *unlike, whereas, although, but, however* ('Unlike his cautious brother, Mario was daring and took huge risks').\n    3. Pistas de Causa y Efecto: Relaciones introducidas por *because, due to, consequently, therefore* ('Due to the arid climate, water was scarce').\n    4. Pistas de Ejemplificación: Uso de *such as, for instance, for example* ('Feline predators, such as pumas and jaguars, hunt at night').\n\n• Preguntas de Sinonimia Contextual UNSA:\n  - Estructura: 'The word X in line 4 is closest in meaning to...'.\n  - Método de comprobación: Reemplazar mentalmente cada alternativa en la oración original; la opción correcta no debe alterar la coherencia gramatical ni el sentido lógico.",
                conceptosClave = listOf(
                    "Context clues: Indicadores semánticos alrededor de una palabra desconocida",
                    "Contrast markers: Unlike, but, although, despite como generadores de antónimos",
                    "Cause-effect clues: Due to, because, so como determinantes lógicos de significado",
                    "Contextual substitution: Técnica de comprobación directa de alternativas"
                ),
                formulas = listOf(
                    "\\text{Unknown Word} + \\text{Contrast Linker (Unlike / Although)} \\implies \\text{Opposite Meaning (Antonym)}",
                    "\\text{Unknown Word} + \\text{Exemplification (Such as / For instance)} \\implies \\text{Category Member}",
                    "\\text{Correct Option} \\iff \\text{Preserves Syntax} \\land \\text{Preserves Logical Sense in Sentence}"
                ),
                formulaName = "Contextual Deduction Equation",
                formulaLatex = "\\text{Lexical Meaning} = \\text{Local Semantics} + \\text{Discourse Connectors}",
                formulaDescription = "Identificación inferencial de vocabulario sin necesidad de diccionario.",
                admissionTip = "En las preguntas 'closest in meaning to', ten cuidado con las palabras polisémicas. Por ejemplo, 'bank' puede ser entidad bancaria o 'orilla de un río'. Elige el significado que encaje con el tema de la oración, no la primera traducción que recuerdes.",
                admissionExplanation = "• Los conectores de contraste como 'unlike' señalan que la palabra desconocida significa exactamente lo opuesto al adjetivo conocido de la otra cláusula."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Read the sentence: 'Unlike his gregarious sister who loved attending crowded university parties, Paul was reclusive and preferred studying alone in his room.' The word 'reclusive' is closest in meaning to:",
                    options = listOf(
                        "Extroverted and noisy",
                        "Solitary and quiet",
                        "Careless and lazy",
                        "Generous and wealthy",
                        "Aggressive and violent"
                    ),
                    correctIndex = 1,
                    explanation = "The contrast linker 'Unlike' opposes Paul's nature to his 'gregarious' (sociable/party-loving) sister. Therefore, 'reclusive' means solitary, isolated, and fond of being alone.",
                    subject = "Inglés",
                    semana = 1
                ),
                Challenge(
                    id = "q_ing_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Read: 'The archeological team recovered several fragile ceramics; therefore, they handled each vessel with extreme caution.' The word 'vessel' refers in this context to:",
                    options = listOf(
                        "A modern high-speed submarine",
                        "A ceramic container or pot",
                        "A blood artery in the human brain",
                        "A legal university document",
                        "An optical astronomy instrument"
                    ),
                    correctIndex = 1,
                    explanation = "Contextual clue of cause and effect: the team recovered 'fragile ceramics', so 'vessel' refers to the ancient ceramic pots or containers found.",
                    subject = "Inglés",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "ing_t01_s03",
            subjectId = "ingles",
            semana = 1,
            subtema = "1.3 Functional Texts: Public Notices, Signs and Job Announcements",
            title = "Notices, Warnings, Signs and Job Advertisements",
            theory = LessonTheory(
                id = "th_ing_t01_s03",
                asignatura = "Inglés",
                semana = 1,
                titulo = "Public Notices, Signs and Job Advertisements",
                resumen = "• Public Notices & Safety Signs (Avisos Públicos y Letreros):\n  - Textos breves de carácter normativo en campus universitarios, laboratorios y transporte.\n  - Expresiones recurrentes:\n    * *Keep off / Keep out:* Manténgase alejado / Prohibido el paso.\n    * *Staff only / Authorized personnel only:* Solo para personal autorizado.\n    * *Out of order:* Fuera de servicio / Malogrado.\n    * *Silence must be observed:* Se exige silencio absoluto.\n    * *No food or drinks allowed:* Prohibido ingerir alimentos.\n\n• Job Advertisements & Vacancy Notices (Anuncios Laborales y Convocatorias):\n  - Componentes fundamentales:\n    1. *Position / Title:* Puesto ofrecido (e.g., 'Junior Software Developer').\n    2. *Requirements / Qualifications:* Grado académico, idiomas, experiencia laboral previa (e.g., 'Bachelor's degree in Engineering, fluent in English, 2 years of experience required').\n    3. *Duties / Key Responsibilities:* Tareas asignadas (e.g., 'Design algorithms, collaborate with researchers').\n    4. *Benefits & Compensation:* Salario, seguro médico, horario (e.g., 'Full-time, competitive salary, health insurance').\n    5. *Application Deadline:* Fecha y hora límite de postulación (e.g., 'Submit CV by Friday, October 15th at 5:00 PM').",
                conceptosClave = listOf(
                    "Notice & Warning signs: Textos normativos breves que imponen reglas o precauciones",
                    "Job vacancy: Anuncio de empleo con puesto, requisitos, responsabilidades y salario",
                    "Deadline: Fecha y hora improrrogable de entrega o postulación",
                    "Requirements: Calificaciones obligatorias para postular a una vacante"
                ),
                formulas = listOf(
                    "\\text{Notice Meaning} = \\text{Modal (Must / Must Not)} + \\text{Imperative Command} + \\text{Location Context}",
                    "\\text{Job Advert Analysis} = \\text{Role} + \\text{Required Qualifications} + \\text{Deadline (Date & Time)}"
                ),
                formulaName = "Functional Notice Decoding Rule",
                formulaLatex = "\\text{Public Sign} \\implies \\text{Obligation (Must)} \\lor \\text{Prohibition (Must not)} \\lor \\text{State (Out of order)}",
                formulaDescription = "Decodificación pragmática inmediata de letreros y carteles de uso cotidiano.",
                admissionTip = "En anuncios laborales, distingue 'required' (indispensable/obligatorio) de 'preferred' o 'desirable' (opcional o mérito complementario).",
                admissionExplanation = "• Si un aviso dice 'Out of order', significa que el aparato o ascensor no funciona; no intentes buscar explicaciones complejas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "You see this notice on the laboratory door: 'CHEMICAL EXPERIMENT IN PROGRESS. PROTECTIVE EYEWEAR MUST BE WORN AT ALL TIMES.' What does this sign indicate?",
                    options = listOf(
                        "Anyone entering must wear safety goggles",
                        "Eyeglasses are strictly forbidden inside the room",
                        "The laboratory is currently closed for cleaning",
                        "Students can choose whether to protect their eyes",
                        "Chemical experiments are only conducted on weekends"
                    ),
                    correctIndex = 0,
                    explanation = "'Must be worn' expresses a strict requirement: protective eyewear (safety goggles) is mandatory for everyone inside.",
                    subject = "Inglés",
                    semana = 1
                ),
                Challenge(
                    id = "q_ing_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A job announcement states: 'Applicants must submit their portfolio by Friday at 5:00 PM. Late submissions will not be considered.' What is the primary purpose of this sentence?",
                    options = listOf(
                        "To describe the salary range",
                        "To enforce a strict application deadline",
                        "To invite candidates to an informal interview",
                        "To offer free educational courses",
                        "To ask for student recommendations"
                    ),
                    correctIndex = 1,
                    explanation = "The sentence sets a rigorous 'deadline' and warns that late submissions will be rejected immediately.",
                    subject = "Inglés",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "ing_t01_s04",
            subjectId = "ingles",
            semana = 1,
            subtema = "1.4 Functional Texts: Emails, Messages and Travel Itineraries",
            title = "Emails, Direct Messages and Itineraries",
            theory = LessonTheory(
                id = "th_ing_t01_s04",
                asignatura = "Inglés",
                semana = 1,
                titulo = "Emails, Messages and Travel Itineraries",
                resumen = "• Estructura Canónica de Emails Universitarios y Formales:\n  1. Salutation (Saludo): *Dear Dr. Mendoza* (formal), *Dear Professor / Admissions Officer*, *Hi Diego* (informal).\n  2. Opening Statement (Propósito): *I am writing to inquire about the scholarship requirements... / I am writing to confirm our meeting...*.\n  3. Body Paragraphs (Detalles y Justificación): Explicación breve de la solicitud, cambio de fecha o entrega de archivos adjuntos (*Please find attached my academic record*).\n  4. Call to Action / Next Step: *I look forward to hearing from you / Please let me know your availability*.\n  5. Sign-off & Signature (Despedida y Firma): *Sincerely / Best regards* (formal), *Kind regards*, seguido del nombre y código del estudiante.\n\n• Travel Itineraries & Schedules (Agendas e Itinerarios):\n  - Textos que organizan eventos o desplazamientos en una línea temporal rígida.\n  - Conectores de Secuencia: *First, Then, Next, After that, Finally*.\n  - Preposiciones de Tiempo y Ubicación: *at 09:00 AM* (hora puntual), *on the second floor* (piso), *in Room 304* (aula cerrada).",
                conceptosClave = listOf(
                    "Formal salutations: Dear Mr./Ms./Dr. en contraste con saludos informales Hi/Hey",
                    "Opening statement: Oración de apertura que define la intención del remitente",
                    "Sign-off: Fórmulas de despedida formal (Sincerely, Best regards)",
                    "Itinerary markers: Conectores secuenciales (First, Next, Finally) y horas puntuales"
                ),
                formulas = listOf(
                    "\\text{Formal Email} = \\text{Salutation} + \\text{Reason for writing (Opening)} + \\text{Body Details} + \\text{Call to Action} + \\text{Sign-off}",
                    "\\text{Itinerary Sequencing} = \\text{Time Anchor (At ...)} + \\text{Sequence Marker (Then / Next)} + \\text{Activity}"
                ),
                formulaName = "Formal Email Structural Blueprint",
                formulaLatex = "\\text{Email Format} = \\text{Dear [Name]} \\to \\text{I am writing to...} \\to \\text{Details} \\to \\text{Sincerely}",
                formulaDescription = "Esquema jerárquico para el análisis y redacción de correspondencia formal.",
                admissionTip = "En emails, el motivo principal del mensaje casi siempre está formulado en la primera o segunda línea ('I am writing to inform/inquire/confirm'). Localiza esa frase para responder de inmediato la pregunta de idea principal.",
                admissionExplanation = "• 'Please find attached' indica que el mensaje incluye un archivo adjunto (documento PDF, CV, certificado o reporte)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Read the email opening: 'Dear Admissions Committee, I am writing to request an extension on the deadline for submitting my high school diploma due to an administrative delay.' Why did the applicant write this email?",
                    options = listOf(
                        "To ask for extra time to deliver a required document",
                        "To reject the university offer",
                        "To apply for a scholarship in mathematics",
                        "To complain about high tuition fees",
                        "To cancel their entrance examination"
                    ),
                    correctIndex = 0,
                    explanation = "'I am writing to request an extension on the deadline' clearly establishes that the candidate needs additional time to submit the graduation certificate.",
                    subject = "Inglés",
                    semana = 1
                ),
                Challenge(
                    id = "q_ing_t01_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "An itinerary states: '08:00 AM: Registration at the main hall. 09:30 AM: Keynote speech on Renewable Energy. 11:00 AM: Coffee break and networking.' When is the presentation on energy scheduled?",
                    options = listOf(
                        "At 08:00 AM",
                        "At 09:30 AM",
                        "At 11:00 AM",
                        "During the afternoon",
                        "At midnight"
                    ),
                    correctIndex = 1,
                    explanation = "Scanning the time table confirms that the keynote speech on Renewable Energy begins at 09:30 AM.",
                    subject = "Inglés",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: THEMATIC READING (PROFILES, STUDIES, SHOPPING & HEALTH) (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "ing_t02_s01",
            subjectId = "ingles",
            semana = 2,
            subtema = "2.1 Personal & Family Backgrounds, Biographies and Personality Traits",
            title = "Personal Information and Family Profiles",
            theory = LessonTheory(
                id = "th_ing_t02_s01",
                asignatura = "Inglés",
                semana = 2,
                titulo = "Personal Profiles and Character Traits",
                resumen = "• Personal and Family Profiles (Perfiles Personales y Familiares):\n  - Comprensión de textos biográficos, perfiles de postulantes a becas y presentaciones de científicos.\n  - Vocabulario de Origen y Familia: *Background* (origen/trasfondo), *upbringing* (crianza), *siblings* (hermanos/as), *relatives* (parientes), *marital status* (estado civil: single, married, widowed, divorced).\n\n• Describing Personality and Strengths (Rasgos de Personalidad y Virtudes Académicas):\n  - Adjetivos de Alto Rendimiento:\n    * *Conscientious / Diligent:* Meticuloso, trabajador y responsable.\n    * *Reliable / Trustworthy:* Confiable, de palabra.\n    * *Resourceful:* Ingenioso, capaz de resolver problemas complejos con lo que tiene.\n    * *Ambitious:* Ambicioso en el sentido positivo de superación constante.\n    * *Open-minded:* De mente abierta, tolerante y receptivo a nuevas ideas.\n    * *Perseverant / Resilient:* Tenaz, que supera las adversidades y frustraciones.",
                conceptosClave = listOf(
                    "Background: Origen social, familiar o académico de una persona",
                    "Siblings: Término inclusivo para hermanos y hermanas",
                    "Diligent / Conscientious: Esfuerzo minucioso y dedicación al estudio",
                    "Resilient: Capacidad de sobreponerse a dificultades y fallos"
                ),
                formulas = listOf(
                    "\\text{Personality Description} = \\text{Subject} + \\text{Verb to be} + \\text{Character Adjective} \\; (\\text{e.g., She is diligent})",
                    "\\text{Habitual Action} = \\text{Subject} + \\text{Action Verb} + \\text{Manner Adverb} \\; (\\text{e.g., He works conscientiously})"
                ),
                formulaName = "Character Profile Matrix",
                formulaLatex = "\\text{Profile} = \\text{Biographical Background} + \\text{Personality Traits} + \\text{Academic Ambitions}",
                formulaDescription = "Integración de datos personales y rasgos caracterológicos en textos biográficos.",
                admissionTip = "Recuerda que 'relatives' significa 'parientes o familiares' en general, no únicamente 'padres'. Para padres se usa exclusivamente 'parents'.",
                admissionExplanation = "• No confundas 'sympathetic' (comprensivo/empático) con 'friendly' o 'nice' (simpático). En inglés, 'sympathetic' denota compasión y solidaridad ante el dolor ajeno."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Read: 'Despite coming from an underprivileged background in rural Caylloma, Andrea was remarkably resilient and achieved top honors in her pre-engineering exams.' What does 'resilient' mean here?",
                    options = listOf(
                        "Easily discouraged by minor difficulties",
                        "Capable of overcoming hardship and succeeding",
                        "Extremely wealthy and powerful",
                        "Indifferent to her studies",
                        "Physically tall and athletic"
                    ),
                    correctIndex = 1,
                    explanation = "'Resilient' indicates the psychological strength to recover from hardship, adversity, or disadvantages and thrive.",
                    subject = "Inglés",
                    semana = 2
                ),
                Challenge(
                    id = "q_ing_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "In a family description, the word 'siblings' denotes:",
                    options = listOf(
                        "Only the applicant's parents",
                        "Uncles, aunts and distant cousins",
                        "Brothers and sisters",
                        "Close friends from high school",
                        "University academic tutors"
                    ),
                    correctIndex = 2,
                    explanation = "'Siblings' is the collective noun that encompasses both brothers and sisters.",
                    subject = "Inglés",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "ing_t02_s02",
            subjectId = "ingles",
            semana = 2,
            subtema = "2.2 University Life, Daily Routines & Study Habits (Key Phrasal Verbs)",
            title = "University Life, Routines and Academic Phrasal Verbs",
            theory = LessonTheory(
                id = "th_ing_t02_s02",
                asignatura = "Inglés",
                semana = 2,
                titulo = "University Life and Academic Phrasal Verbs",
                resumen = "• Daily Life and Academic Routines (Rutinas y Vida Universitaria):\n  - Hábitos cotidianos en el campus: horarios de clase (*schedules*), desplazamientos (*commute*), asistencia a cátedras (*attend lectures*) y sesiones de laboratorio (*lab sessions*).\n\n• Essential Academic Phrasal Verbs (Phrasal Verbs Clave en Exámenes):\n  - *Catch up on:* Ponerse al día con material pendiente (*catching up on biology readings*).\n  - *Hand in / Turn in:* Entregar trabajos, tareas o informes al profesor (*hand in the assignment by Friday*).\n  - *Drop out of:* Abandonar los estudios universitarios (*drop out of university due to financial issues*).\n  - *Look up:* Buscar una definición o dato en un diccionario o base de datos (*look up a technical term*).\n  - *Fall behind:* Quedarse rezagado respecto al avance del curso (*falling behind in mathematics*).\n  - *Run out of:* Quedarse sin existencias (*we ran out of printer paper*).\n  - *Figure out:* Comprender, resolver o descifrar un problema (*figure out the solution to the equation*).",
                conceptosClave = listOf(
                    "Commute: Tiempo y trayecto de viaje diario entre el hogar y la universidad",
                    "Hand in / Turn in: Acto formal de entrega de un trabajo o examen",
                    "Catch up on: Nivelarse o ponerse al día con tareas acumuladas",
                    "Figure out: Deducir, resolver o comprender un problema complejo"
                ),
                formulas = listOf(
                    "\\text{Hand in / Turn in} \\equiv \\text{Submit formally to an instructor}",
                    "\\text{Catch up on} \\equiv \\text{Reach the required level after a delay}",
                    "\\text{Figure out} \\equiv \\text{Solve / Understand by logical reasoning}"
                ),
                formulaName = "Academic Phrasal Verbs Equivalence",
                formulaLatex = "\\text{Verb} + \\text{Particle} \\implies \\text{Idiomatic Academic Meaning}",
                formulaDescription = "Traducción funcional de verbos compuestos en el contexto universitario.",
                admissionTip = "Los exámenes UNSA evalúan phrasal verbs mediante ejercicios de opción múltiple donde debes elegir la partícula correcta (up, in, out, on). Asocia siempre 'hand in' con 'submit' y 'figure out' con 'solve'.",
                admissionExplanation = "• 'Drop out' siempre va seguido de la preposición 'of' cuando se especifica la institución ('drop out of college')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "The chemistry professor reminded the class: 'You must ______ your lab reports before 4:00 PM today, or your score will be reduced.' Choose the correct phrasal verb:",
                    options = listOf(
                        "hand in",
                        "drop out",
                        "look after",
                        "run into",
                        "give up"
                    ),
                    correctIndex = 0,
                    explanation = "'Hand in' means to submit an assignment or report formally to an instructor.",
                    subject = "Inglés",
                    semana = 2
                ),
                Challenge(
                    id = "q_ing_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Because of severe illness, Miguel missed three weeks of lectures and struggled to ______ on his physics assignments.",
                    options = listOf(
                        "catch up",
                        "break down",
                        "turn down",
                        "get away",
                        "call off"
                    ),
                    correctIndex = 0,
                    explanation = "'Catch up (on)' means to reach the current standard after falling behind or missing classes.",
                    subject = "Inglés",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "ing_t02_s03",
            subjectId = "ingles",
            semana = 2,
            subtema = "2.3 Academic Careers, Majors & Professional Collocations",
            title = "University Majors, Degrees and Academic Collocations",
            theory = LessonTheory(
                id = "th_ing_t02_s03",
                asignatura = "Inglés",
                semana = 2,
                titulo = "Academic Careers and Collocations",
                resumen = "• University Majors & Academic Areas (Especialidades Universitarias):\n  - STEM (Science, Technology, Engineering, Mathematics): Civil, Mechanical, Systems Engineering, Biotechnology.\n  - Biomedical Sciences: Medicine, Nursing, Dentistry, Pharmacy, Nutrition.\n  - Humanities & Social Sciences: Law, Philosophy, Literature, Sociology, Economics.\n\n• Academic Collocations (Combinaciones Léxicas Fijas en Inglés):\n  - En inglés académico, ciertas palabras coexisten naturalmente y no pueden traducirse literalmente:\n    * *Pursue a degree:* Cursar una carrera universitaria (NUNCA: $\times$ *follow a career*).\n    * *Conduct an experiment / research:* Llevar a cabo un experimento o investigación (NUNCA: $\times$ *make a research*).\n    * *Take / Sit an exam:* Rendir un examen de admisión (NUNCA: $\times$ *give an exam* desde la óptica del estudiante).\n    * *Pass an exam:* Aprobar el examen (con éxito).\n    * *Fail an exam:* Desaprobar o reprobar el examen.\n    * *Tuition fees:* Pensiones o costos de enseñanza universitaria.\n    * *Undergraduate student:* Alumno de pregrado.\n    * *Graduate / Postgraduate:* Posgrado (maestría o doctorado).",
                conceptosClave = listOf(
                    "Pursue a degree: Matricularse y cursar estudios universitarios de pregrado",
                    "Conduct research: Realizar investigación científica de forma metódica",
                    "Take / Sit an exam: Rendir una prueba o examen académico",
                    "Undergraduate: Estudiante que cursa su primer título profesional universitario"
                ),
                formulas = listOf(
                    "\\text{Conduct} + \\text{Research / Experiment / Study} \\; (\\text{Correct})",
                    "\\text{Pursue} + \\text{a Degree / a Career / Studies} \\; (\\text{Correct})",
                    "\\text{Take / Sit} + \\text{an Exam / a Test} \\; (\\text{Correct})"
                ),
                formulaName = "Academic Collocation Collocation Rules",
                formulaLatex = "\\text{Natural English} = \\text{Verb} + \\text{Fixed Noun Collocate}",
                formulaDescription = "Uso de colocaciones fijas del inglés culto exigidas en los exámenes de suficiencia y admisión.",
                admissionTip = "¡Cuidado con el falso amigo de admisión! Los alumnos 'take' o 'sit' el examen, mientras que los profesores 'give' o preparan el examen. Si dices 'I gave an exam', en inglés significa que tú lo administraste a otros alumnos.",
                admissionExplanation = "• La palabra 'research' es incontable en inglés formal: nunca digas 'a research' ni 'researches'; se dice 'a piece of research' o 'conduct research'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Select the sentence that uses the correct academic collocation:",
                    options = listOf(
                        "The scientific team decided to make a research on geothermal energy in Arequipa.",
                        "The scientific team decided to conduct research on geothermal energy in Arequipa.",
                        "The scientific team decided to do an investigation on geothermal energy in Arequipa.",
                        "The scientific team decided to practice research on geothermal energy in Arequipa.",
                        "The scientific team decided to fabricate an experiment on geothermal energy in Arequipa."
                    ),
                    correctIndex = 1,
                    explanation = "In formal English, the established academic collocation is 'to conduct research' (or 'carry out research'), never 'make a research'.",
                    subject = "Inglés",
                    semana = 2
                ),
                Challenge(
                    id = "q_ing_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Lucia hopes to ______ a Bachelor's degree in Civil Engineering at UNSA next year.",
                    options = listOf(
                        "pursue",
                        "follow up",
                        "chase",
                        "fetch",
                        "provoke"
                    ),
                    correctIndex = 0,
                    explanation = "The standard collocations for completing an academic curriculum are 'to pursue a degree' or 'to pursue studies'.",
                    subject = "Inglés",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "ing_t02_s04",
            subjectId = "ingles",
            semana = 2,
            subtema = "2.4 Nutrition, Health, Illnesses & Healthy Lifestyles",
            title = "Food, Health, Common Ailments and Well-being",
            theory = LessonTheory(
                id = "th_ing_t02_s04",
                asignatura = "Inglés",
                semana = 2,
                titulo = "Nutrition and Healthcare",
                resumen = "• Health, Nutrition and Physical Well-being (Salud, Nutrición y Bienestar):\n  - Eje recurrente en textos de comprensión lectora de la UNSA (especialmente en el área biomédica).\n\n• Symptoms and Illnesses (Síntomas y Enfermedades Comunes):\n  - *Ailment / Illness / Disease:* Enfermedad o dolencia.\n  - *Sore throat:* Dolor e irritación de garganta.\n  - *Headache / Stomachache / Toothache:* Dolor de cabeza / estómago / muelas (sufijo *-ache* indica dolor sordo y continuo).\n  - *Fever / High temperature:* Fiebre.\n  - *Fatigue / Exhaustion:* Cansancio crónico y falta de energía.\n  - *Sprain:* Esguince o torcedura muscular.\n\n• Healthy Lifestyles & Prevention (Estilo de Vida Saludable):\n  - *Sedentary lifestyle:* Sedentarismo (asociado a problemas cardiovasculares).\n  - *Wholesome / Balanced diet:* Dieta equilibrada rica en nutrientes, fibra y proteínas magras.\n  - *Over-the-counter medicine:* Medicamentos de venta libre sin receta médica.\n  - *Prescription:* Receta médica emitida por un facultativo.\n  - *Work out:* Entrenar físicamente en el gimnasio o al aire libre.\n  - *Cut down on:* Reducir el consumo de azúcares y grasas saturadas (*cut down on sodium and fast food*).",
                conceptosClave = listOf(
                    "Sedentary lifestyle: Rutina inactiva que eleva riesgos cardiovasculares",
                    "Sufijo -ache: Dolor persistente (headache, backache, stomachache)",
                    "Cut down on: Reducir voluntariamente la ingesta de alimentos nocivos",
                    "Over-the-counter: Medicamentos dispensados sin prescripción obligatoria"
                ),
                formulas = listOf(
                    "\\text{Sedentary Habit} + \\text{Unhealthy Diet} \\implies \\text{Chronic Fatigue} + \\text{Health Risks}",
                    "\\text{Prevention} = \\text{Balanced Nutrition} + \\text{Regular Exercise (Workout)} + \\text{Adequate Sleep}"
                ),
                formulaName = "Wellness Equation",
                formulaLatex = "\\text{Health Score} = \\text{Hydration} + \\text{Nutrients} + \\text{Rest} - \\text{Stress}",
                formulaDescription = "Factores determinantes en la interpretación de lecturas divulgativas sobre salud.",
                admissionTip = "En textos de salud, presta atención al verbo 'lead to' (conducir a / causar) y 'prevent' (prevenir). Conectan directamente causas con síntomas o desenlaces clínicos.",
                admissionExplanation = "• No confundas 'prescription' (receta médica de fármacos) con 'recipe' (receta de cocina culinaria)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Read the health advice: 'To avoid high blood pressure, adults should cut down on salt and processed snacks.' What does 'cut down on' advise patients to do?",
                    options = listOf(
                        "Completely eliminate water intake",
                        "Increase the consumption significantly",
                        "Reduce the intake of salt and snacks",
                        "Ignore modern dietary warnings",
                        "Prepare food using industrial additives"
                    ),
                    correctIndex = 2,
                    explanation = "'Cut down on' means to decrease or consume a smaller amount of something harmful.",
                    subject = "Inglés",
                    semana = 2
                ),
                Challenge(
                    id = "q_ing_t02_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "After a medical check-up, the physician wrote a ______ for antibiotics to treat the lung infection.",
                    options = listOf(
                        "recipe",
                        "prescription",
                        "receipt",
                        "menu",
                        "bill of landing"
                    ),
                    correctIndex = 1,
                    explanation = "A medical doctor issues a 'prescription' for medicines. A 'recipe' is exclusively for preparing food, and a 'receipt' is a payment ticket.",
                    subject = "Inglés",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: PRESENT TENSES & STATIVE VERBS (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "ing_t03_s01",
            subjectId = "ingles",
            semana = 3,
            subtema = "3.1 Present Simple: Habits, Universal Facts, 3rd Person Rules & Syntax",
            title = "Present Simple Tense and Third-Person Spelling",
            theory = LessonTheory(
                id = "th_ing_t03_s01",
                asignatura = "Inglés",
                semana = 3,
                titulo = "Present Simple Tense and Morphology",
                resumen = "• Usos Fundamentales del Present Simple:\n  1. Hábitos y rutinas periódicas (*He studies every evening*).\n  2. Hechos universales y leyes científicas (*Water freezes at 0 °C*).\n  3. Estados y verdades permanentes (*San Agustín University is located in Arequipa*).\n  4. Horarios oficiales de transporte y eventos fijos (*The train leaves at 7:00 AM*).\n\n• Reglas Ortográficas de la Tercera Persona Singular (*He, She, It* en Afirmativo):\n  - Regla General: Añadir *-s* (*read $\\to$ reads, clean $\\to$ cleans*).\n  - Verbos terminados en *-s, -ss, -sh, -ch, -x, -z, -o*: Añadir *-es* (*watch $\\to$ watches, pass $\\to$ passes, fix $\\to$ fixes, go $\\to$ goes*).\n  - Consonante + 'y': Cambiar 'y' por *-ies* (*study $\\to$ studies, fly $\\to$ flies*). Pero vocal + 'y' solo añade *-s* (*play $\\to$ plays, buy $\\to$ buys*).\n  - Forma irregular: *have $\\to$ has*.\n\n• Operadores Auxiliares en Negación y Pregunta (*Do / Does*):\n  - Negación: Sujeto + *don't / doesn't* + **Verbo Base** (*She doesn't work on Sundays*).\n  - Pregunta: *Do / Does* + Sujeto + **Verbo Base** + ? (*Does he study Law?*).\n  - **REGLA DE ORO:** Al usar *does/doesn't*, el verbo principal pierde la desinencia *-s/-es* y regresa a su forma base.",
                conceptosClave = listOf(
                    "Present Simple: Rutinas, hechos científicos y horarios inmutables",
                    "3rd person singular: Añade -s, -es o -ies únicamente en oraciones afirmativas",
                    "Auxiliary Does/Doesn't: Neutraliza el verbo principal a su forma base infinitiva",
                    "Do vs. Does: Does se reserva exclusivamente para he, she e it"
                ),
                formulas = listOf(
                    "\\text{Affirmative (He/She/It)}: \\; \\text{Subject} + \\text{Verb}_{\\text{-s/-es/-ies}} + \\text{Complement}",
                    "\\text{Negative}: \\; \\text{Subject} + \\mathbf{doesn't / don't} + \\mathbf{Base \\ Verb} + \\text{Complement}",
                    "\\text{Interrogative}: \\; \\mathbf{Does / Do} + \\text{Subject} + \\mathbf{Base \\ Verb} + \\text{Complement} + ?"
                ),
                formulaName = "Present Simple Morphosyntax",
                formulaLatex = "\\text{Affirmative: } V_{\\text{base}} + \\text{(-s/-es)} \\iff \\text{Subject} \\in \\{he, she, it\\}",
                formulaDescription = "Regla de concordancia gramatical sujeto-verbo en tiempo presente.",
                admissionTip = "El error más frecuente en admisión es marcar alternativas donde el verbo mantiene la '-s' después de 'doesn't' (ejemplo: 'She doesn't works' es un disparate gramatical). Con auxiliar, ¡el verbo va siempre limpio!",
                admissionExplanation = "• 'Water boils at 100 degrees' es una verdad científica incuestionable; por eso se utiliza obligatoriamente el Present Simple y nunca el continuo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identify the grammatically correct sentence in the Present Simple:",
                    options = listOf(
                        "Dr. Gomez doesn't analyzes the blood samples on Saturdays.",
                        "Dr. Gomez doesn't analyze the blood samples on Saturdays.",
                        "Dr. Gomez not analyze the blood samples on Saturdays.",
                        "Dr. Gomez don't analyzes the blood samples on Saturdays.",
                        "Dr. Gomez isn't analyze the blood samples on Saturdays."
                    ),
                    correctIndex = 1,
                    explanation = "With the 3rd person negative auxiliary 'doesn't', the main verb must appear in its base form without '-s' ('doesn't analyze').",
                    subject = "Inglés",
                    semana = 3
                ),
                Challenge(
                    id = "q_ing_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Which verb correctly completes the scientific fact: 'The Earth ______ around the Sun every 365 days.'?",
                    options = listOf(
                        "revolves",
                        "is revolving",
                        "revolve",
                        "has revolving",
                        "are revolving"
                    ),
                    correctIndex = 0,
                    explanation = "Universal scientific truths require the Present Simple with 3rd person singular agreement: 'revolves'.",
                    subject = "Inglés",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "ing_t03_s02",
            subjectId = "ingles",
            semana = 3,
            subtema = "3.2 Adverbs of Frequency & Temporal Positioning Rules",
            title = "Adverbs of Frequency and Syntactic Placement",
            theory = LessonTheory(
                id = "th_ing_t03_s02",
                asignatura = "Inglés",
                semana = 3,
                titulo = "Adverbs of Frequency and Placement",
                resumen = "• Adverbs of Frequency (Escala Porcentual de Periodicidad):\n  - *Always* (100%): Siempre.\n  - *Usually / Normally* (80%): Usualmente / habitualmente.\n  - *Often / Frequently* (60%): Con frecuencia / a menudo.\n  - *Sometimes / Occasionally* (40%): A veces / de vez en cuando.\n  - *Hardly ever / Seldom / Rarely* (10%): Casi nunca / rara vez.\n  - *Never* (0%): Nunca.\n\n• Reglas Estrictas de Posicionamiento Sintáctico:\n  1. **Antes del Verbo Principal:** En oraciones con verbos léxicos comunes, el adverbio precede al verbo.\n     $$\\text{Subject} + \\mathbf{Adverb} + \\text{Main Verb} \\quad (\\text{e.g., Carlos } \\mathbf{always \\ arrives} \\text{ on time})$$\n  2. **Después del Verbo To Be:** Si la oración utiliza *am, is, are*, el adverbio se sitúa obligatoriamente después de dicha forma verbal.\n     $$\\text{Subject} + \\mathbf{To \\ Be} + \\mathbf{Adverb} \\quad (\\text{e.g., She } \\mathbf{is \\ never} \\text{ late for class})$$\n  3. **Entre el Auxiliar y el Verbo Principal:** En oraciones compuestas con auxiliares (*can, have, must, will*).\n     $$\\text{Subject} + \\text{Aux} + \\mathbf{Adverb} + \\text{Main Verb} \\quad (\\text{e.g., You } \\mathbf{can \\ always \\ ask} \\text{ for help})$$\n\n• Adverbios Negativos y Prohibición de Doble Negación:\n  - *Hardly ever, seldom* y *never* ya poseen carga semántica negativa; está prohibido combinarlos con *don't / doesn't* (decir: 'He hardly ever complains', NUNCA: $\times$ 'He doesn't hardly ever complain').",
                conceptosClave = listOf(
                    "Posición 1: Previo a verbos léxicos ordinarios (always studies)",
                    "Posición 2: Posterior a formas del verbo to be (is always punctual)",
                    "Prohibición de doble negación: Jamás usar never o hardly ever con don't/doesn't",
                    "Periodicidad porcentual: Desde always (100%) hasta never (0%)"
                ),
                formulas = listOf(
                    "\\text{Order 1}: \\; \\text{Subj} + \\mathbf{Adv}_{\\text{freq}} + \\text{Verb}_{\\text{lexical}} \\quad (\\text{e.g., They usually exercise})",
                    "\\text{Order 2}: \\; \\text{Subj} + \\mathbf{To \\ Be (am/is/are)} + \\mathbf{Adv}_{\\text{freq}} \\quad (\\text{e.g., He is often tired})",
                    "\\text{Double Negative Error}: \\; \\times \\; \\text{doesn't never} \\implies \\checkmark \\; \\text{never}"
                ),
                formulaName = "Adverb Placement Equation",
                formulaLatex = "\\text{Placement} = \\begin{cases} \\text{Before } V_{\\text{main}} & \\text{if } V \\neq \\text{'to be'} \\\\ \\text{After } V_{\\text{be}} & \\text{if } V = \\text{'to be'} \\end{cases}",
                formulaDescription = "Algoritmo sintáctico de colocación de adverbios de frecuencia en inglés.",
                admissionTip = "Para recordar la posición del verbo 'to be', usa la regla mnemotécnica: 'El verbo To Be es egoísta y quiere ir primero; los demás verbos dejan pasar al adverbio'.",
                admissionExplanation = "• 'Seldom' es un sinónimo culto de 'rarely' muy común en los textos de admisión de la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Which of the following sentences displays the correct placement of the adverb of frequency?",
                    options = listOf(
                        "Maria is usually patient with her laboratory partners.",
                        "Maria usually is patient with her laboratory partners.",
                        "Usually Maria is patient with her laboratory partners.",
                        "Maria is patient usually with her laboratory partners.",
                        "Patient Maria is usually with her laboratory partners."
                    ),
                    correctIndex = 0,
                    explanation = "Adverbs of frequency must be placed AFTER the verb 'to be' ('is usually patient').",
                    subject = "Inglés",
                    semana = 3
                ),
                Challenge(
                    id = "q_ing_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Choose the sentence that correctly avoids a double negative error:",
                    options = listOf(
                        "He doesn't hardly ever watch television during the exam week.",
                        "He hardly ever watches television during the exam week.",
                        "He doesn't never watch television during the exam week.",
                        "Hardly ever he doesn't watch television during the exam week.",
                        "He never doesn't watch television during the exam week."
                    ),
                    correctIndex = 1,
                    explanation = "'Hardly ever' is already negative. It takes an affirmative verb in the 3rd person ('watches') without 'doesn't'.",
                    subject = "Inglés",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "ing_t03_s03",
            subjectId = "ingles",
            semana = 3,
            subtema = "3.3 Present Continuous: Morphology, -ING Rules & Contexts of Use",
            title = "Present Continuous: Grammar, Spelling and Near Future",
            theory = LessonTheory(
                id = "th_ing_t03_s03",
                asignatura = "Inglés",
                semana = 3,
                titulo = "Present Continuous and -ING Spelling",
                resumen = "• Usos del Present Continuous (Aspecto Progresivo):\n  1. Acciones que están ocurriendo en el momento exacto del habla (*I am writing notes right now*).\n  2. Situaciones temporales que no son permanentes (*She is staying at a hotel this week*).\n  3. Procesos graduales de cambio o tendencias (*Air pollution is increasing in the city*).\n  4. Planes personales confirmados para el futuro próximo con hora/lugar fijado (*We are taking the exam tomorrow morning*).\n\n• Reglas Ortográficas de la Sufijación del Gerundio (*-ING*):\n  - Regla General: Añadir *-ing* a la forma base (*read $\\to$ reading, learn $\\to$ learning*).\n  - Verbos terminados en 'e' muda: Se elimina la 'e' y se añade *-ing* (*write $\\to$ writing, take $\\to$ taking*). Excepción: terminados en *-ee* mantienen ambas (*see $\\to$ seeing*).\n  - Monosílabos Consonante-Vocal-Consonante (CVC): Se duplica la consonante final (*run $\\to$ running, sit $\\to$ sitting, stop $\\to$ stopping*). No se duplica si termina en *-w, -x, -y* (*play $\\to$ playing, fix $\\to$ fixing*).\n  - Polisílabos CVC acentuados en la última sílaba: Se duplica la consonante (*beGIN $\\to$ beginning*). Si el acento cae en la primera sílaba, NO se duplica (*VI-sit $\\to$ visiting, LI-sten $\\to$ listening*).\n  - Terminados en '-ie': Cambian *-ie* por *-y* + *-ing* (*die $\\to$ dying, lie $\\to$ lying*).\n\n• Marcadores Temporales Típicos:\n  - *Now, right now, at the moment, currently, at present, nowadays, these days, Look!, Listen!*.",
                conceptosClave = listOf(
                    "Present Continuous: Acciones en desarrollo, situaciones temporales y planes cerrados",
                    "Regla CVC: Duplicación consonántica en monosílabos acentuados (run -> running)",
                    "Acento prosódico: Verbos como visitan no duplican consonante (visiting)",
                    "Transformación -ie: Verbos como lie y die pasan a lying y dying"
                ),
                formulas = listOf(
                    "\\text{Affirmative}: \\; \\text{Subj} + \\mathbf{am/is/are} + \\mathbf{Verb\\text{-}ING} + \\text{Complement}",
                    "\\text{Negative}: \\; \\text{Subj} + \\mathbf{am/is/are \\ not} + \\mathbf{Verb\\text{-}ING} + \\text{Complement}",
                    "\\text{CVC Doubling Rule}: \\; C_1 V C_2 \\implies C_1 V C_2 C_2 + \\text{ing} \\quad (\\text{e.g., stop } \\to \\text{ stopping})"
                ),
                formulaName = "Continuous Aspect Morphology",
                formulaLatex = "\\text{Present Continuous} = \\text{Subject} + \\text{BE}_{\\text{pres}} + \\text{Verb}_{\\text{-ing}}",
                formulaDescription = "Estructura analítica del aspecto progresivo con auxiliar copulativo.",
                admissionTip = "Marcadores imperativos sensoriales como 'Look!' o 'Listen!' siempre exigen Present Continuous en la oración siguiente, porque indican un fenómeno sensorial ocurriendo en tiempo real.",
                admissionExplanation = "• 'Listen! The professor is explaining the theorem' exige aspecto continuo por la llamada de atención en vivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete the sentence with the correct continuous form: 'Listen! Someone ______ on the laboratory door right now.'",
                    options = listOf(
                        "knocks",
                        "is knocking",
                        "are knocking",
                        "was knocking",
                        "knocked"
                    ),
                    correctIndex = 1,
                    explanation = "'Listen!' and 'right now' denote an action occurring at the exact moment of speaking with a singular indefinite subject ('someone' -> 'is knocking').",
                    subject = "Inglés",
                    semana = 3
                ),
                Challenge(
                    id = "q_ing_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Which verb correctly applies the spelling rules for adding '-ing'?",
                    options = listOf(
                        "runing",
                        "begining",
                        "dying",
                        "visitting",
                        "makeing"
                    ),
                    correctIndex = 2,
                    explanation = "Verbs ending in '-ie' like 'die' change to 'y' before '-ing' ('dying'). 'Running' and 'beginning' require double consonants, 'visiting' has only one 't', and 'make' drops the silent 'e' ('making').",
                    subject = "Inglés",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "ing_t03_s04",
            subjectId = "ingles",
            semana = 3,
            subtema = "3.4 Stative Verbs vs. Dynamic Verbs & Verbs with Dual Meaning",
            title = "Stative Verbs and Mixed Semantic Verbs",
            theory = LessonTheory(
                id = "th_ing_t03_s04",
                asignatura = "Inglés",
                semana = 3,
                titulo = "Stative Verbs and Semantic Shifts",
                resumen = "• Stative Verbs (Verbos de Estado):\n  - Verbos que expresan estados mentales, opiniones, emociones duraderas, percepciones sensoriales y relaciones de propiedad o medida.\n  - **Regla Fundamental:** NO admiten tiempos continuos (*-ing*) cuando describen un estado permanente.\n  - Clasificación Rigurosa:\n    * Pensamiento / Creencia: *know, believe, understand, recognize, remember, mean, doubt*.\n    * Emociones / Afecto: *like, love, hate, prefer, adore, need, want*.\n    * Posesión / Pertenencia: *have, own, belong to, possess*.\n    * Sentidos / Percepción: *taste, smell, hear, sound, seem, appear*.\n\n• Verbos Mixtos (Cambio de Significado: Stative vs. Dynamic):\n  1. **Think:**\n     - Estado (Opinar / Creer): *I think she is brilliant* (Present Simple).\n     - Dinámico (Proceso mental activo): *I am thinking about the math problem* (Continuous).\n  2. **Have:**\n     - Estado (Posesión): *He has three brothers* (Present Simple).\n     - Dinámico (Acción: comer, ducharse, pasarla bien): *He is having lunch / having a shower* (Continuous).\n  3. **Taste / Smell:**\n     - Estado (Propiedad intrínseca): *The soup tastes salty* (Present Simple).\n     - Dinámico (Acción voluntaria de oler o probar): *The chef is tasting the soup* (Continuous).\n  4. **See:**\n     - Estado (Percibir con la vista / entender): *I see what you mean*.\n     - Dinámico (Reunirse con alguien / consultar a un médico): *I am seeing my cardiologist this afternoon*.",
                conceptosClave = listOf(
                    "Stative Verbs: Verbos cognitivos y de posesión que rechazan el gerundio progresivo",
                    "Dual-meaning verbs: Verbos cuyo aspecto gramatical varía según su carga semántica",
                    "Have como posesión (estativo) vs. have como actividad alimenticia (dinámico)",
                    "Think como juicio de opinión (estativo) vs. deliberación consciente (dinámico)"
                ),
                formulas = listOf(
                    "\\text{Stative Meaning (Opinion / Possession)} \\implies \\text{Present Simple Only}",
                    "\\text{Dynamic Meaning (Active Process / Meal)} \\implies \\text{Present Continuous Allowed}",
                    "\\text{Example: } \\text{I think (opinion)} \\; \\text{vs.} \\; \\text{I am thinking (deliberation)}"
                ),
                formulaName = "Stative Semantic Filter",
                formulaLatex = "\\text{Aspect} = \\begin{cases} \\text{Simple} & \\text{if Stative (State / Emotion)} \\\\ \\text{Continuous} & \\text{if Dynamic (Action / Event)} \\end{cases}",
                formulaDescription = "Decisión aspectual en verbos sensoriales y cognitivos del inglés.",
                admissionTip = "Si en una pregunta de admisión ves 'understand', 'know', 'believe' o 'want' con terminación '-ing' (ejemplo: 'is knowing'), descarta esa alternativa de inmediato: son verbos puramente estativos.",
                admissionExplanation = "• 'I am understanding the lesson' es un error común; la forma correcta es 'I understand the lesson'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Choose the grammatically acceptable sentence involving a stative verb:",
                    options = listOf(
                        "Right now, Carlos is wanting a glass of water.",
                        "Carlos understands the mathematical proof completely.",
                        "The laboratory technician is knowing the results already.",
                        "They are owning an apartment near the university campus.",
                        "I am believing your scientific explanation."
                    ),
                    correctIndex = 1,
                    explanation = "'Understand' is a stative verb of cognition that is correctly conjugated in the Present Simple ('understands'). Verbs like want, know, own, and believe do not take continuous forms.",
                    subject = "Inglés",
                    semana = 3
                ),
                Challenge(
                    id = "q_ing_t03_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Analyze the two sentences: \n(I) 'Dr. Mendoza has a modern laboratory.' \n(II) 'Dr. Mendoza is having breakfast at the faculty canteen.' \nWhich statement is true?",
                    options = listOf(
                        "Sentence (II) is grammatically incorrect because 'have' can never use -ing.",
                        "Both sentences are correct because in (I) 'have' means possession and in (II) it denotes an action.",
                        "Sentence (I) is incorrect because possession requires continuous aspect.",
                        "Both sentences are incorrect due to auxiliary errors.",
                        "Sentence (I) describes a temporary action happening now."
                    ),
                    correctIndex = 1,
                    explanation = "In sentence (I), 'have' expresses permanent ownership/possession (stative -> simple). In sentence (II), 'having breakfast' describes the active process of eating a meal (dynamic -> continuous allowed).",
                    subject = "Inglés",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: PAST SIMPLE & FUTURE SYSTEMS (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "ing_t04_s01",
            subjectId = "ingles",
            semana = 4,
            subtema = "4.1 Past Simple: Regular Verbs Morphology (-ed) & Pronunciation (/t/, /d/, /ɪd/)",
            title = "Past Simple: Regular Morphology and Phonology of -ED",
            theory = LessonTheory(
                id = "th_ing_t04_s01",
                asignatura = "Inglés",
                semana = 4,
                titulo = "Regular Past Morphology and Phonetics",
                resumen = "• The Past Simple Tense (Usos Generales):\n  - Describe acciones, sucesos o estados que iniciaron y finalizaron completamente en el pasado en un momento definido (*yesterday, last month, in 2021, two weeks ago*).\n\n• Reglas Morfológicas de Sufijación del Morfema *-ed* en Verbos Regulares:\n  1. Regla General: Añadir *-ed* (*work $\\to$ worked, clean $\\to$ cleaned*).\n  2. Terminados en 'e' muda: Solo añadir *-d* (*live $\\to$ lived, decide $\\to$ decided*).\n  3. Consonante + 'y': Cambiar 'y' por **-ied** (*study $\\to$ studied, cry $\\to$ cried*). Pero vocal + 'y' solo añade *-ed* (*play $\\to$ played*).\n  4. Monosílabos CVC: Duplican la consonante final (*stop $\\to$ stopped, plan $\\to$ planned*).\n\n• Fonología de la Terminación *-ed* (Evaluada en Admisión y Exámenes Orales/Escritos):\n  - Regla 1: **/ɪd/** (añade una sílaba adicional al verbo). Aplica EXCLUSIVAMENTE cuando el verbo base termina en los sonidos dentales **/t/** o **/d/** (*wanted* /ˈwɒntɪd/, *needed* /ˈniːdɪd/, *started, decided*).\n  - Regla 2: **/t/** (sin sílaba extra). Aplica tras consonantes sordas (voiceless): /p, k, f, s, ʃ, tʃ, θ/ (*worked* /wɜːkt/, *watched* /wɒtʃt/, *stopped* /stɒpt/, *laughed* /lɑːft/).\n  - Regla 3: **/d/** (sin sílaba extra). Aplica tras consonantes sonoras (voiced: /b, g, v, z, m, n, l, r/) y todos los sonidos vocálicos (*cleaned* /kliːnd/, *lived* /lɪvd/, *played* /pleɪd/).",
                conceptosClave = listOf(
                    "Past Simple: Eventos concluidos en un marco temporal pretérito explícito",
                    "Terminación /ɪd/: Únicamente tras sonidos finales /t/ y /d/ (wanted, decided)",
                    "Terminación /t/: Tras consonantes sordas (worked, stopped, watched)",
                    "Terminación /d/: Tras consonantes sonoras y vocales (played, cleaned)"
                ),
                formulas = listOf(
                    "\\text{Base Verb ends in } /t/ \\lor /d/ \\implies \\text{-ed is pronounced as } /\\text{ɪd}/ \\quad (\\text{Extra Syllable})",
                    "\\text{Base Verb ends in Voiceless Consonant } \\implies \\text{-ed is pronounced as } /t/",
                    "\\text{Base Verb ends in Voiced Sound / Vowel } \\implies \\text{-ed is pronounced as } /d/"
                ),
                formulaName = "-ED Phonological Triad",
                formulaLatex = "\\text{Pronunciation}(-ed) = \\begin{cases} /\\text{ɪd}/ & \\text{after } /t/, /d/ \\\\ /t/ & \\text{after voiceless} \\\\ /d/ & \\text{after voiced / vowels} \\end{cases}",
                formulaDescription = "Reglas fonéticas universales de articulación del morfema de pasado regular.",
                admissionTip = "Para identificar rápidamente qué verbo añade una sílaba extra al pronunciar '-ed', busca los que terminen con la letra 't' o 'd' en su forma base (como start -> started, need -> needed).",
                admissionExplanation = "• En los verbos terminados en 'k', 'p', 'sh', 'ch', la terminación '-ed' suena como una 't' seca sin vocal intermedia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "In which of the following regular verbs is the '-ed' ending pronounced as an additional syllable (/ɪd/)?",
                    options = listOf(
                        "worked",
                        "played",
                        "decided",
                        "stopped",
                        "cleaned"
                    ),
                    correctIndex = 2,
                    explanation = "'Decide' ends in a /d/ sound, so adding '-ed' produces the /ɪd/ pronunciation with an extra syllable (de-ci-ded). The others end in /t/ (worked, stopped) or /d/ (played, cleaned).",
                    subject = "Inglés",
                    semana = 4
                ),
                Challenge(
                    id = "q_ing_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "What is the correct past simple spelling of the verb 'study'?",
                    options = listOf(
                        "studyed",
                        "studied",
                        "studdied",
                        "studyied",
                        "studid"
                    ),
                    correctIndex = 1,
                    explanation = "Verbs ending in consonant + 'y' change the 'y' to 'i' before adding '-ed' ('studied').",
                    subject = "Inglés",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "ing_t04_s02",
            subjectId = "ingles",
            semana = 4,
            subtema = "4.2 Past Simple: Irregular Verbs Mastery & Auxiliary Syntax (Did / Didn't)",
            title = "Irregular Verbs Catalog and the DID Operator",
            theory = LessonTheory(
                id = "th_ing_t04_s02",
                asignatura = "Inglés",
                semana = 4,
                titulo = "Irregular Past Verbs and Auxiliary DID",
                resumen = "• Verbos Irregulares Clave en Admisión UNSA:\n  - Modifican su raíz o adoptan formas supletivas en pasado:\n    * *Go $\\to$ went* (ir) | *See $\\to$ saw* (ver) | *Buy $\\to$ bought* (comprar)\n    * *Write $\\to$ wrote* (escribir) | *Give $\\to$ gave* (dar) | *Take $\\to$ took* (tomar)\n    * *Bring $\\to$ brought* (traer) | *Find $\\to$ found* (encontrar) | *Think $\\to$ thought* (pensar)\n    * *Make $\\to$ made* (hacer) | *Do $\\to$ did* (hacer) | *Have $\\to$ had* (tener)\n    * *Break $\\to$ broke* (romper) | *Begin $\\to$ began* (empezar) | *Read $\\to$ read* (/red/)\n\n• Sintaxis con el Operador Auxiliar de Pasado (*DID / DIDN'T*):\n  - En oraciones **afirmativas**, se usa el verbo en pasado (regular con *-ed* o irregular):\n    * *Alexander Fleming **discovered** penicillin in 1928.* / *Mario **went** to Cusco last year.*\n  - En oraciones **negativas**, se inserta *didn't* y el verbo principal **REGRESA OBLIGATORIAMENTE A SU FORMA BASE**:\n    * *He **didn't understand** the theorem.* (NUNCA: $\times$ *didn't understood*).\n  - En oraciones **interrogativas**, se antepone *Did* y el verbo principal **REGRESA A SU FORMA BASE**:\n    * ***Did** you **pass** the entrance exam?* (NUNCA: $\times$ *Did you passed?*).\n  - **LECCIÓN DE ORO:** Jamás dupliques la marca de pasado en la misma cláusula verbal.",
                conceptosClave = listOf(
                    "Irregular verbs: Flexiones supletivas que deben memorizarse con precisión",
                    "Auxiliar DID / DIDN'T: Asume la carga de tiempo pretérito de toda la cláusula",
                    "Neutralización verbal: El verbo principal tras did/didn't vuelve a infinitivo limpio",
                    "Prohibición de doble pasado: Incompatibilidad entre auxiliar did y verbo conjugado"
                ),
                formulas = listOf(
                    "\\text{Affirmative}: \\; \\text{Subj} + \\mathbf{Verb_{\\text{past}}} + \\text{Complement} \\quad (\\text{e.g., She wrote an essay})",
                    "\\text{Negative}: \\; \\text{Subj} + \\mathbf{didn't} + \\mathbf{Verb_{\\text{base}}} + \\text{Complement} \\quad (\\text{e.g., She didn't write})",
                    "\\text{Interrogative}: \\; \\mathbf{Did} + \\text{Subj} + \\mathbf{Verb_{\\text{base}}} + \\text{Complement} + ? \\quad (\\text{e.g., Did she write?})"
                ),
                formulaName = "Past Auxiliary Neutralization Law",
                formulaLatex = "\\mathbf{Did} + \\text{Subject} + \\mathbf{V_{\\text{base}}} \\iff \\text{Valid Past Interrogative}",
                formulaDescription = "Regla canónica de neutralización del verbo principal en presencia del auxiliar did.",
                admissionTip = "¡Cuidado con la trampa clásica! En oraciones con 'didn't', los distractores siempre incluyen el verbo en pasado (ejemplo: 'didn't went' o 'didn't saw'). Marca únicamente la opción que tenga el verbo en infinitivo base.",
                admissionExplanation = "• El verbo 'read' se escribe idéntico en presente y pasado ('read'), pero en pasado se pronuncia como el color rojo /red/."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Select the sentence that contains NO grammatical errors in the past simple:",
                    options = listOf(
                        "Did the engineering students went to the construction site yesterday?",
                        "Did the engineering students go to the construction site yesterday?",
                        "The engineering students didn't went to the construction site yesterday.",
                        "Did the engineering students gone to the construction site yesterday?",
                        "The engineering students not went to the construction site yesterday."
                    ),
                    correctIndex = 1,
                    explanation = "In interrogative past simple sentences with the auxiliary 'Did', the main verb must be in its base form ('go').",
                    subject = "Inglés",
                    semana = 4
                ),
                Challenge(
                    id = "q_ing_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Last semester, Professor Vargas ______ a remarkable research paper on renewable energies.",
                    options = listOf(
                        "wrote",
                        "writed",
                        "write",
                        "was wrote",
                        "has write"
                    ),
                    correctIndex = 0,
                    explanation = "'Write' is an irregular verb whose past simple form is 'wrote'. 'Writed' is non-existent.",
                    subject = "Inglés",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "ing_t04_s03",
            subjectId = "ingles",
            semana = 4,
            subtema = "4.3 Future with 'Be Going To': Prior Plans & Present Visual Evidence",
            title = "Future with 'Be Going To': Intentions and Evidence",
            theory = LessonTheory(
                id = "th_ing_t04_s03",
                asignatura = "Inglés",
                semana = 4,
                titulo = "Be Going To: Intentions and Evidence",
                resumen = "• Estructura Sintáctica de *Be Going To*:\n  $$\\text{Subject} + \\mathbf{am \\ / \\ is \\ / \\ are \\ + \\ going \\ to} + \\mathbf{Base \\ Verb} + \\text{Complement}$$\n\n• Dos Contextos Semánticos Obligatorios:\n  1. **Planes e Intenciones Premeditadas (Prior Plans & Intentions):**\n     - Decisiones tomadas **con anterioridad** al momento de hablar.\n     - Ya existe una determinación previa por parte del emisor.\n     - Ejemplo: *I am going to apply for the Medicine program at UNSA next February* (Ya lo analicé y decidí con anticipación).\n  2. **Predicciones Basadas en Evidencia Física Presente (Present Observable Evidence):**\n     - Existen señales observables en el entorno que anuncian el desenlace inminente como una certeza empírica.\n     - Ejemplo: *Look at those dark storm clouds gathering over Mount Misti! It is going to rain.* (La evidencia visual son las nubes oscuras).\n     - Ejemplo: *Be careful! That fragile chemical flask is going to fall off the bench!* (El frasco se está tambaleando en el borde).",
                conceptosClave = listOf(
                    "Be going to: Futuro intencional premeditado y futuro evidencial empírico",
                    "Prior intentions: Decisiones adoptadas con antelación a la charla",
                    "Observable evidence: Indicios sensoriales físicos en el entorno inmediato",
                    "Concordancia to be: am going to (I), is going to (he/she/it), are going to (we/they)"
                ),
                formulas = listOf(
                    "\\text{Prior Decision} \\implies \\text{Subject} + \\text{BE} + \\text{going to} + V_{\\text{base}}",
                    "\\text{Sensory Evidence in Environment} \\implies \\text{Subject} + \\text{BE} + \\text{going to} + V_{\\text{base}}",
                    "\\text{Form}: \\; \\text{Subj} + [am/is/are] + going \\ to + V_{\\text{base}}"
                ),
                formulaName = "Be Going To Decision Matrix",
                formulaLatex = "\\text{Be Going To} = \\text{Prior Decision} \\lor \\text{Observable Physical Evidence}",
                formulaDescription = "Condiciones semánticas necesarias para la elección de 'be going to' frente a 'will'.",
                admissionTip = "Cuando la oración empiece con frases de advertencia sensorial como 'Look at...', 'Watch out!' o 'Be careful!', la predicción exige casi siempre 'be going to' porque hay evidencia visible.",
                admissionExplanation = "• No digas 'It will rain' cuando ves el cielo cubierto de nubes negras cargadas; la evidencia exige 'It is going to rain'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Look at the young boy riding his bicycle too fast towards that deep ditch! He ______ crash!",
                    options = listOf(
                        "is going to",
                        "will",
                        "shall",
                        "might to",
                        "would"
                    ),
                    correctIndex = 0,
                    explanation = "There is clear, immediate visual evidence in the environment ('Look at...'), which requires 'is going to' for prediction based on present signs.",
                    subject = "Inglés",
                    semana = 4
                ),
                Challenge(
                    id = "q_ing_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "'Why did you buy all those laboratory chemicals?' — 'Because I ______ conduct an experiment with my team tomorrow.'",
                    options = listOf(
                        "will",
                        "am going to",
                        "might",
                        "could",
                        "would"
                    ),
                    correctIndex = 1,
                    explanation = "The speaker already bought the materials beforehand, showing a prior premeditated plan ('am going to').",
                    subject = "Inglés",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "ing_t04_s04",
            subjectId = "ingles",
            semana = 4,
            subtema = "4.4 Future with 'Will': Spontaneous Decisions, Promises & Subjective Predictions",
            title = "Future with 'Will': Spontaneous Choices and Opinions",
            theory = LessonTheory(
                id = "th_ing_t04_s04",
                asignatura = "Inglés",
                semana = 4,
                titulo = "Will: Spontaneous Decisions and Opinions",
                resumen = "• Estructura Sintáctica de *Will*:\n  $$\\text{Subject} + \\mathbf{will \\ / \\ won't} + \\mathbf{Base \\ Verb} + \\text{Complement}$$\n\n• Tres Contextos Semánticos Obligatorios:\n  1. **Decisiones Espontáneas e Improvisadas (On-the-spot Decisions):**\n     - El emisor decide actuar en el **mismo instante de la conversación**, sin plan previo.\n     - Ejemplo: *— The telephone is ringing. — I'll answer it!* (Decisión instantánea).\n     - Ejemplo: *I feel exhausted; I think I will take a short nap.* (Reacción al cansancio del momento).\n  2. **Promesas, Ofertas de Ayuda, Amenazas y Negativas:**\n     - Promesa: *I will never forget your assistance during my pre-university exams.*\n     - Oferta: *Those library books look heavy; I will carry them for you.*\n     - Negativa (*won't*): *The car engine won't start.*\n  3. **Predicciones Subjetivas y Especulaciones Personales:**\n     - Basadas en opiniones, esperanzas, creencias o intuición, NO en evidencia física presente.\n     - Marcadores introductorios típicos: *I think, I believe, I hope, I doubt, perhaps, probably*.\n     - Ejemplo: *I think autonomous vehicles will dominate urban traffic by 2040.*",
                conceptosClave = listOf(
                    "Will: Operador modal de futuro para decisiones inmediatas y opiniones personales",
                    "On-the-spot decisions: Acciones decididas en el preciso segundo de hablar",
                    "Subjective markers: I think, I believe, I hope, probably anuncian will",
                    "Contracciones: 'll para afirmación y won't (will not) para negación"
                ),
                formulas = listOf(
                    "\\text{Instant Reaction (At moment of speech)} \\implies \\text{Subject} + \\mathbf{will} + V_{\\text{base}}",
                    "\\text{I think / I hope / Probably} \\implies \\text{Subject} + \\mathbf{will} + V_{\\text{base}}",
                    "\\text{Promise / Offer of help} \\implies \\text{Subject} + \\mathbf{will} + V_{\\text{base}}"
                ),
                formulaName = "Will Pragmatic Functions",
                formulaLatex = "\\text{Will} = \\text{Spontaneous Decision} \\lor \\text{Promise / Offer} \\lor \\text{Subjective Belief}",
                formulaDescription = "Criterios semánticos de discriminación del modal will en contraste con planes de be going to.",
                admissionTip = "Si la oración empieza con 'I think...' o 'I hope...', marca de inmediato 'will'. Los autores de exámenes usan estos verbos de opinión para evaluar predicciones subjetivas.",
                admissionExplanation = "• 'Won't' es la contracción estándar de 'will not'. Nunca uses 'willn't' ni 'don't will'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "During a study group session, a classmate drops their heavy textbooks on the floor. You immediately react by saying: 'Don't worry, ______ pick them up for you.'",
                    options = listOf(
                        "I am going to",
                        "I will",
                        "I was",
                        "I have",
                        "I must to"
                    ),
                    correctIndex = 1,
                    explanation = "Offering immediate help and making a spontaneous decision on the spot requires 'will' ('I will / I'll').",
                    subject = "Inglés",
                    semana = 4
                ),
                Challenge(
                    id = "q_ing_t04_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Scientific essay: 'Many economists believe that artificial intelligence ______ create entirely new job categories in the next decade.'",
                    options = listOf(
                        "is going to",
                        "will",
                        "went to",
                        "did",
                        "has"
                    ),
                    correctIndex = 1,
                    explanation = "Predictions based on subjective beliefs, forecasts or opinions introduced by 'believe' or 'think' use 'will'.",
                    subject = "Inglés",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: MODALS, EXISTENTIALS & ADJECTIVE COMPARISON DEGREES (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "ing_t05_s01",
            subjectId = "ingles",
            semana = 5,
            subtema = "5.1 Modal Verbs: Can, Could (Ability & Requests) and Should (Advice)",
            title = "Modal Verbs: Can, Could and Should",
            theory = LessonTheory(
                id = "th_ing_t05_s01",
                asignatura = "Inglés",
                semana = 5,
                titulo = "Modals: Ability, Requests and Advice",
                resumen = "• Reglas Sintácticas Universales de los Verbos Modales Puros:\n  1. Van seguidos invariablemente de un **Bare Infinitive** (verbo base sin *to*): $\\text{Modal} + \\mathbf{V_{\\text{base}}}$. (NUNCA: $\\times$ *can to go*).\n  2. **No añaden '-s'** en la 3.ª persona singular (*He can*, jamás *He cans*).\n  3. Niegan e interrogan directamente sin auxiliares *do/does* (*Can she...? / You shouldn't...*).\n\n• Usos Específicos:\n  1. **Can:**\n     - Habilidad o capacidad en presente: *She can solve complex calculus equations*.\n     - Solicitud informal: *Can you open the door, please?*.\n  2. **Could:**\n     - Habilidad en tiempo pasado: *When I was six, I could already read English books*.\n     - Petición formal y muy cortés: *Could you explain this chemistry principle once more, professor?*.\n  3. **Should / Ought to:**\n     - Consejo, sugerencia o recomendación moral y médica: *You have a high fever; you should rest at home*.\n     - Conveniencia: *Candidates should review past admission exams before Sunday*.",
                conceptosClave = listOf(
                    "Bare infinitive: Los modales puros jamás llevan la partícula 'to' tras ellos",
                    "Can vs. Could: Habilidad presente vs. habilidad pretérita o petición cortés",
                    "Should: Consejo, recomendación médica y sugerencia de conveniencia moral",
                    "Inmutabilidad modal: No añaden -s en tercera persona ni usan do/does"
                ),
                formulas = listOf(
                    "\\text{Modal Syntax}: \\; \\text{Subj} + \\mathbf{Modal \\ (can/could/should)} + \\mathbf{Base \\ Verb} + \\text{Complement}",
                    "\\text{Past Ability}: \\; \\text{Subject} + \\mathbf{could} + \\text{Base Verb} \\quad (\\text{e.g., I could swim at age five})",
                    "\\text{Polite Request}: \\; \\mathbf{Could \\ you} + \\text{Base Verb...?}"
                ),
                formulaName = "Pure Modal Operator Formula",
                formulaLatex = "\\text{Sentence} = \\text{Subj} + [can \\mid could \\mid should] + V_{\\text{base}} \\quad (V_{\\text{base}} \\neq \\text{to } V)",
                formulaDescription = "Sintaxis estricta de operadores modales auxiliares.",
                admissionTip = "Jamás elijas una alternativa donde 'can' o 'should' vaya seguido de 'to' (ejemplo: 'You should to study' es falso). El verbo debe ir en infinitivo simple sin to.",
                admissionExplanation = "• 'Could you please...?' es la fórmula más cortés y formal para solicitar favores en contextos académicos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Choose the grammatically correct sentence giving medical advice:",
                    options = listOf(
                        "You should to drink plenty of fluids and rest.",
                        "You should drinks plenty of fluids and rest.",
                        "You should drink plenty of fluids and rest.",
                        "You should drinking plenty of fluids and rest.",
                        "You must to drink plenty of fluids and rest."
                    ),
                    correctIndex = 2,
                    explanation = "'Should' must be followed directly by a bare infinitive without 'to' and without inflection: 'You should drink...'.",
                    subject = "Inglés",
                    semana = 5
                ),
                Challenge(
                    id = "q_ing_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "When Dr. Sanchez was a university undergraduate, he ______ speak four languages fluently.",
                    options = listOf(
                        "can",
                        "could",
                        "should",
                        "must to",
                        "might to"
                    ),
                    correctIndex = 1,
                    explanation = "'Could' expresses general past ability in past biographical time frames ('When Dr. Sanchez was an undergraduate...').",
                    subject = "Inglés",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "ing_t05_s02",
            subjectId = "ingles",
            semana = 5,
            subtema = "5.2 Obligation vs. Prohibition: Must, Have to, Mustn't & Don't have to",
            title = "Obligation, Prohibition and Lack of Obligation",
            theory = LessonTheory(
                id = "th_ing_t05_s02",
                asignatura = "Inglés",
                semana = 5,
                titulo = "Obligation and Prohibition",
                resumen = "• Obligation: *Must* vs. *Have to*:\n  - **Must:** Expresa una **obligación interna, personal o moral** que nace del propio individuo (*I must study harder for the upcoming UNSA test*).\n  - **Have to:** Expresa una **obligación externa, institucional o legal** impuesta por reglamentos, leyes o terceros (*Students have to show their ID card to enter the campus*). En 3.ª persona singular: *He has to*.\n\n• La Gran Distinción de Examen: *Mustn't* vs. *Don't have to*:\n  - **Mustn't (Prohibición Estricta):**\n    * La acción está totalmente prohibida, es ilegal o peligrosa.\n    * Equivale a: *It is forbidden / You are not allowed to*.\n    * Ejemplo: *You **mustn't touch** the high-voltage electrical wires.* (Prohibición absoluta).\n    * Ejemplo: *Candidates **mustn't use** smartphones during the exam.* (Fraude prohibido).\n  - **Don't / Doesn't have to (Falta de Obligación / Opcionalidad):**\n    * La acción NO es obligatoria; no es necesario hacerla, pero el sujeto es libre de hacerla si lo desea.\n    * Equivale a: *It is not necessary / You don't need to*.\n    * Ejemplo: *Tomorrow is a national holiday; we **don't have to attend** classes.* (No hay obligación, puedes descansar).",
                conceptosClave = listOf(
                    "Must: Obligación moral e interna que surge del emisor",
                    "Have to: Obligación externa impuesta por leyes, normas o autoridades",
                    "Mustn't: Prohibición terminante e inviolable (está prohibido/es ilegal)",
                    "Don't have to: Ausencia de obligación; acción opcional o voluntaria"
                ),
                formulas = listOf(
                    "\\text{Mustn't} \\equiv \\text{Prohibition (It is forbidden / illegal)}",
                    "\\text{Don't have to} \\equiv \\text{Lack of Obligation (It is not necessary)}",
                    "\\text{Must} \\; (\\text{Internal}) \\quad \\text{vs.} \\quad \\text{Have to} \\; (\\text{External Rules})"
                ),
                formulaName = "Deontic Modality Matrix",
                formulaLatex = "\\begin{cases} \\text{Mustn't} & = \\text{Strict Prohibition} \\\\ \\text{Don't have to} & = \\text{Optionality (Zero Obligation)} \\end{cases}",
                formulaDescription = "Distinción funcional entre prohibición y falta de necesidad en pruebas de admisión.",
                admissionTip = "¡La pregunta clásica de la UNSA! Si ves un letrero de 'No smoking' o 'No parking', la respuesta es 'mustn't'. Si ves un cartel de 'Free admission' (entrada gratis), la respuesta es 'You don't have to pay'.",
                admissionExplanation = "• 'Don't have to' nunca significa 'prohibido'; solo significa que no tienes la obligación de hacerlo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "During the official university entrance examination, applicants ______ communicate with each other or look at other test sheets.",
                    options = listOf(
                        "don't have to",
                        "mustn't",
                        "should",
                        "have to",
                        "need to"
                    ),
                    correctIndex = 1,
                    explanation = "Communicating or cheating during an official exam is strictly forbidden by institutional rules, requiring 'mustn't' (prohibition).",
                    subject = "Inglés",
                    semana = 5
                ),
                Challenge(
                    id = "q_ing_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "'Admission to the university historical museum is completely free of charge on Sundays.' Therefore, visitors ______ buy a ticket.",
                    options = listOf(
                        "mustn't",
                        "don't have to",
                        "can't",
                        "shouldn't",
                        "ought not"
                    ),
                    correctIndex = 1,
                    explanation = "Because admission is free, buying a ticket is unnecessary (absence of obligation -> 'don't have to').",
                    subject = "Inglés",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "ing_t05_s03",
            subjectId = "ingles",
            semana = 5,
            subtema = "5.3 Existential Structures: There is / There are (Present & Past)",
            title = "Existential Structures: There is and There are",
            theory = LessonTheory(
                id = "th_ing_t05_s03",
                asignatura = "Inglés",
                semana = 5,
                titulo = "Existentials: There is and There are",
                resumen = "• Estructuras Existenciales en Presente:\n  - Equivalen al verbo impersonal español *«hay»*.\n  1. **There is / There's:** Se utiliza ante sustantivos **singulares contables** y sustantivos **incontables**.\n     * *There is a microscope on the laboratory table.* (Singular contable).\n     * *There is some water in the glass.* (Incontable).\n  2. **There are:** Se utiliza ante sustantivos **plurales contables**.\n     * *There are thirty candidates waiting in the auditorium.* (Plural).\n\n• Estructuras Existenciales en Pasado (*«hubo / había»*):\n  1. **There was:** Para singular contable e incontable (*There was a power outage yesterday*).\n  2. **There were:** Para plural contable (*There were many difficult problems in the exam*).\n\n• Interrogación y Cuantificadores (*Some / Any*):\n  - En preguntas y negaciones, se suele usar *any*:\n    * *Is there any milk in the fridge? $\\to$ No, there isn't any.*\n    * *Are there any questions about the syllabus? $\\to$ Yes, there are some questions.*",
                conceptosClave = listOf(
                    "There is: Existencia de entidades singulares contables y de elementos incontables",
                    "There are: Existencia de entidades contables plurales",
                    "There was / There were: Formas pretéritas de concordancia existencial",
                    "Some vs. Any: Some en afirmativas; Any en preguntas y oraciones negativas"
                ),
                formulas = listOf(
                    "\\text{There is} + \\text{Singular Countable Noun} \\lor \\text{Uncountable Noun}",
                    "\\text{There are} + \\text{Plural Countable Noun}",
                    "\\text{There was / There were} \\iff \\text{Past Existential (Singular vs Plural)}"
                ),
                formulaName = "Existential Concordance Rule",
                formulaLatex = "\\text{Existential} = \\begin{cases} \\text{There is / was} & \\text{if Noun is Singular or Uncountable} \\\\ \\text{There are / were} & \\text{if Noun is Plural Countable} \\end{cases}",
                formulaDescription = "Regla de concordancia gramatical entre la estructura existencial y el núcleo nominal posterior.",
                admissionTip = "Recuerda que sustantivos como 'information', 'equipment', 'traffic' y 'furniture' son incontables en inglés. Por lo tanto, SIEMPRE exigen 'There is', jamás 'There are'.",
                admissionExplanation = "• 'There is a lot of traffic' es correcto. Decir 'There are a lot of traffics' es un error grave de concordancia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete the sentence: 'At yesterday's conference, ______ several international researchers presenting their discoveries.'",
                    options = listOf(
                        "there was",
                        "there were",
                        "there is",
                        "there are",
                        "there have"
                    ),
                    correctIndex = 1,
                    explanation = "'Yesterday' requires the past tense, and 'several international researchers' is a plural countable noun, requiring 'there were'.",
                    subject = "Inglés",
                    semana = 5
                ),
                Challenge(
                    id = "q_ing_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Which sentence correctly accounts for uncountable nouns?",
                    options = listOf(
                        "There are much valuable informations in the university database.",
                        "There is a lot of valuable information in the university database.",
                        "There were many informations in the university database.",
                        "There are an information in the university database.",
                        "There is many information in the university database."
                    ),
                    correctIndex = 1,
                    explanation = "'Information' is an uncountable noun that takes a singular existential verb ('There is a lot of valuable information...').",
                    subject = "Inglés",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "ing_t05_s04",
            subjectId = "ingles",
            semana = 5,
            subtema = "5.4 Degrees of Comparison: Equative, Comparative & Superlative",
            title = "Adjective Comparison: Equative, Comparative and Superlative",
            theory = LessonTheory(
                id = "th_ing_t05_s04",
                asignatura = "Inglés",
                semana = 5,
                titulo = "Degrees of Comparison in Adjectives",
                resumen = "• Grado de Igualdad (Equative Degree):\n  $$\\mathbf{as} + \\mathbf{Adjective \\ (base)} + \\mathbf{as}$$\n  - *Arequipa is as beautiful as Cusco.* / *This test is not as difficult as the last one.* (En negativa también se admite *not so... as*).\n\n• Grado Comparativo de Superioridad:\n  1. **Adjetivos Cortos (1 sílaba o 2 terminados en -y):** Añaden el sufijo **-er than** (*tall $\\to$ taller than, happy $\\to$ happier than, big $\\to$ bigger than* [regla CVC]).\n  2. **Adjetivos Largos (2 o más sílabas):** Anteponen **more... than** (*modern $\\to$ more modern than, expensive $\\to$ more expensive than*).\n\n• Grado Superlativo:\n  1. **Adjetivos Cortos:** Anteponen el artículo y sufijan **the... -est** (*the tallest, the happiest, the biggest*).\n  2. **Adjetivos Largos:** Anteponen **the most...** (*the most expensive, the most intelligent*).\n\n• Formas Irregulares de Memorización Obligatoria:\n  - *good $\\to$ better than $\\to$ the best*\n  - *bad $\\to$ worse than $\\to$ the worst*\n  - *far $\\to$ farther / further than $\\to$ the farthest / furthest*\n  - *little $\\to$ less than $\\to$ the least*\n  - *many / much $\\to$ more than $\\to$ the most*",
                conceptosClave = listOf(
                    "Igualdad: as + adjetivo base + as (sin sufijos -er ni more)",
                    "Comparativo corto: Adjetivo + -er + than (nunca more tall)",
                    "Comparativo largo: more + adjetivo + than (nunca expensiver)",
                    "Irregulares de oro: good/better/best, bad/worse/worst"
                ),
                formulas = listOf(
                    "\\text{Equative}: \\; \\text{as} + \\text{Adjective} + \\text{as}",
                    "\\text{Comparative (Short)}: \\; \\text{Adj} + \\text{-er} + \\mathbf{than}",
                    "\\text{Comparative (Long)}: \\; \\mathbf{more} + \\text{Adj} + \\mathbf{than}",
                    "\\text{Superlative}: \\; \\mathbf{the} + \\text{Adj-est} \\quad \\lor \\quad \\mathbf{the \\ most} + \\text{Adj}"
                ),
                formulaName = "Degrees of Comparison Spectrum",
                formulaLatex = "\\text{Comparison} = \\begin{cases} \\text{Adj-er / more Adj } + \\mathbf{than} & (\\text{Between 2 entities}) \\\\ \\mathbf{the} \\text{ (Adj-est / most Adj)} & (\\text{Out of a whole group}) \\end{cases}",
                formulaDescription = "Matriz morfosintáctica de comparación entre entidades en inglés.",
                admissionTip = "Nunca mezcles ambos sistemas: 'more taller' o 'the most biggest' son errores gramaticales de redundancia inadmisibles. Si tiene '-er', no lleva 'more'.",
                admissionExplanation = "• 'Worse' es comparativo ('A is worse than B') y 'worst' es superlativo ('the worst in the world'). No confundas la terminación en -e con la terminación en -t."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Choose the sentence that correctly compares two elements:",
                    options = listOf(
                        "The new physics laboratory is more modern than the old one.",
                        "The new physics laboratory is modern than the old one.",
                        "The new physics laboratory is more moderner than the old one.",
                        "The new physics laboratory is as modern than the old one.",
                        "The new physics laboratory is the most modern than the old one."
                    ),
                    correctIndex = 0,
                    explanation = "'Modern' is a two-syllable adjective that forms its comparative with 'more... than' ('more modern than').",
                    subject = "Inglés",
                    semana = 5
                ),
                Challenge(
                    id = "q_ing_t05_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Yesterday's storm was bad, but today's weather is even ______.",
                    options = listOf(
                        "baddest",
                        "more bad",
                        "worse",
                        "worst",
                        "less badder"
                    ),
                    correctIndex = 2,
                    explanation = "The comparative of the irregular adjective 'bad' is 'worse' ('even worse').",
                    subject = "Inglés",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: COMMUNICATIVE FUNCTIONS & DISCOURSE CONNECTORS (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "ing_t06_s01",
            subjectId = "ingles",
            semana = 6,
            subtema = "6.1 Preferences: Like, Love, Enjoy, Hate + Gerund vs. Would Like To",
            title = "Likes, Dislikes, Preferences and Would Like",
            theory = LessonTheory(
                id = "th_ing_t06_s01",
                asignatura = "Inglés",
                semana = 6,
                titulo = "Preferences and Verb Complements",
                resumen = "• Verbos de Gustos y Aficiones Generales + Gerundio (*-ING*):\n  - Cuando expresamos hábitos, pasatiempos placenteros o aversiones permanentes, los verbos *like, love, enjoy, fancy, don't mind, dislike, hate, can't stand* van seguidos habitualmente de un **sustantivo** o de un **gerundio (-ING)**:\n    * *She **enjoys researching** cellular biology.* (NUNCA: $\times$ *enjoys to research*).\n    * *I **can't stand waiting** in long queues under the blazing sun.*\n    * *They **hate waking up** early on Saturdays.*\n\n• Deseos Hipotéticos o Específicos: *Would Like / Would Prefer* + *To-Infinitive*:\n  - Cuando se expresa una petición cortés o un **deseo puntual y específico en el presente o futuro**, se emplea la estructura modal *would like / would prefer*, la cual exige **To-Infinitive**:\n    $$\\text{Subject} + \\mathbf{would \\ like \\ ('d \\ like)} + \\mathbf{to \\ + \\ Base \\ Verb} + \\text{Complement}$$\n    * *I **like swimming**.* $\\to$ Me gusta nadar como deporte habitual.\n    * *I **would like to swim** this afternoon.* $\\to$ Deseo nadar hoy puntualmente.\n\n• Estructura Comparativa de Preferencia: *Prefer A to B*:\n  - Para comparar dos opciones: $\\mathbf{prefer} + \\text{Gerund / Noun A} + \\mathbf{to} + \\text{Gerund / Noun B}$.\n  - *She **prefers studying** at the library **to working** in her bedroom.* (NUNCA: $\times$ *prefer studying than working*).",
                conceptosClave = listOf(
                    "Enjoy / Can't stand: Exigen imperativamente gerundio (-ING) posterior",
                    "Would like: Exige imperativamente infinitivo con 'to' (to + base verb)",
                    "Prefer A to B: Utiliza la preposición 'to', jamás 'than'",
                    "General habit vs. Specific wish: like doing vs. would like to do"
                ),
                formulas = listOf(
                    "\\text{Enjoy / Can't stand / Don't mind} + \\mathbf{Verb\\text{-}ING}",
                    "\\text{Would like / Would love / Would prefer} + \\mathbf{to \\ + \\ Base \\ Verb}",
                    "\\mathbf{Prefer} + [Noun_A \\mid Verb\\text{-}ING_A] + \\mathbf{to} + [Noun_B \\mid Verb\\text{-}ING_B]"
                ),
                formulaName = "Verbal Preference Complementation",
                formulaLatex = "\\text{Complementation} = \\begin{cases} \\text{Verb-ING} & \\text{after } enjoy, like, hate, can't \\ stand \\\\ \\text{to } V_{\\text{base}} & \\text{after } would \\ like, would \\ prefer \\end{cases}",
                formulaDescription = "Régimen verbal obligatorio según el operador de gusto o preferencia.",
                admissionTip = "Recuerda esta regla infalible: 'Enjoy' NUNCA va con 'to' (decir 'I enjoy to study' es un error común en distractores). Asimismo, 'prefer A to B' usa 'to', nunca 'than'.",
                admissionExplanation = "• 'I would like to have lunch with you' es una invitación formal puntual, por eso lleva 'to have'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Choose the grammatically correct sentence:",
                    options = listOf(
                        "Andrea enjoys to read scientific journals in the university library.",
                        "Andrea enjoys reading scientific journals in the university library.",
                        "Andrea enjoys read scientific journals in the university library.",
                        "Andrea enjoys to reading scientific journals in the university library.",
                        "Andrea enjoy reads scientific journals in the university library."
                    ),
                    correctIndex = 1,
                    explanation = "The verb 'enjoy' must be followed by a gerund (-ING): 'enjoys reading'.",
                    subject = "Inglés",
                    semana = 6
                ),
                Challenge(
                    id = "q_ing_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Carlos ______ reading printed textbooks ______ using digital screens.",
                    options = listOf(
                        "prefers / than",
                        "prefers / to",
                        "would like / to",
                        "enjoys / than",
                        "can't stand / than"
                    ),
                    correctIndex = 1,
                    explanation = "The standard pattern for expressing preference between two items is 'prefer [A] to [B]' ('prefers reading... to using...').",
                    subject = "Inglés",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "ing_t06_s02",
            subjectId = "ingles",
            semana = 6,
            subtema = "6.2 Pragmatic Functions: Polite Requests, Permissions & Suggestions",
            title = "Pragmatic Social Formulas: Requests and Suggestions",
            theory = LessonTheory(
                id = "th_ing_t06_s02",
                asignatura = "Inglés",
                semana = 6,
                titulo = "Social Pragmatics: Requests and Suggestions",
                resumen = "• Polite Requests (Peticiones Cortésmente Formuladas):\n  1. **Could you (please)...?** Formal y estándar: *Could you please lend me your calculator?*.\n  2. **Would you mind + Verb-ING...?** Muy formal y de alta frecuencia en exámenes de admisión:\n     - Estructura: $\\mathbf{Would \\ you \\ mind} + \\mathbf{Verb\\text{-}ING} + ...?$\n     - *Would you mind **opening** the window?* (¿Le importaría abrir la ventana?).\n     - Respuesta de aceptación cortés: *No, not at all* / *Certainly not* (significa: 'No me molesta en absoluto, lo hago con gusto'). Responder 'Yes' significaría 'Sí, me molesta'.\n\n• Asking for Permission (Solicitar Permiso):\n  - **May I + Base Verb...?** Muy formal y protocolar: *May I ask a question, Professor?*.\n  - **Can I...?** Informal entre amigos: *Can I borrow your pen?*.\n\n• Suggestions and Invitations (Sugerencias e Invitaciones):\n  - **Why don't we + Base Verb...?** *Why don't we study together for the exam?*.\n  - **How about / What about + Verb-ING...?** *How about **taking** a 10-minute break?*.\n  - **Let's + Base Verb:** *Let's review the anatomy diagrams now.*.",
                conceptosClave = listOf(
                    "Would you mind: Exige gerundio (-ING) y su respuesta afirmativa es 'No, not at all'",
                    "May I: Solicitud formal de permiso en ámbitos académicos y profesionales",
                    "How about / What about: Introducen sugerencias informales seguidas de -ING",
                    "Let's: Forma exhortativa que incluye al hablante con verbo base limpio"
                ),
                formulas = listOf(
                    "\\mathbf{Would \\ you \\ mind} + \\mathbf{Verb\\text{-}ING} + ...?",
                    "\\mathbf{How \\ about / What \\ about} + \\mathbf{Verb\\text{-}ING} + ...?",
                    "\\mathbf{Why \\ don't \\ we} + \\mathbf{Base \\ Verb} + ...?",
                    "\\mathbf{May \\ I} + \\mathbf{Base \\ Verb} + ...?"
                ),
                formulaName = "Pragmatic Formula Catalog",
                formulaLatex = "\\text{Request Formula} = \\begin{cases} \\text{Would you mind} + V_{\\text{-ing}} & (\\text{Ultra-polite}) \\\\ \\text{Could you} + V_{\\text{base}} & (\\text{Polite}) \\\\ \\text{Why don't we} + V_{\\text{base}} & (\\text{Suggestion}) \\end{cases}",
                formulaDescription = "Catálogo pragmático para interacciones sociales en inglés.",
                admissionTip = "¡Pregunta trampa favorita de admisión! Ante 'Would you mind closing the door?', la respuesta educada para decir que 'sí cerrarás la puerta' es 'No, not at all' o 'Of course not' (no me importa). Si respondes 'Yes', estás diciendo que te molesta.",
                admissionExplanation = "• 'How about' y 'What about' siempre van seguidos de gerundio: 'How about having a coffee?'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "During a lecture, a student wants to ask the professor for a clarification politely. Choose the most appropriate formal question:",
                    options = listOf(
                        "Would you mind to repeat that last formula?",
                        "Would you mind repeating that last formula?",
                        "Why don't you to repeat that last formula?",
                        "Could you repeating that last formula?",
                        "How about you repeat that last formula?"
                    ),
                    correctIndex = 1,
                    explanation = "'Would you mind' requires a gerund (-ING): 'Would you mind repeating that last formula?'.",
                    subject = "Inglés",
                    semana = 6
                ),
                Challenge(
                    id = "q_ing_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A: 'Would you mind turning off the projector, please?' — B: '______, I will do it immediately.'",
                    options = listOf(
                        "Yes, certainly",
                        "No, not at all",
                        "Yes, I mind",
                        "Never I do",
                        "Of course I mind"
                    ),
                    correctIndex = 1,
                    explanation = "To agree politely to a 'Would you mind...?' request, you answer negatively ('No, not at all' = it doesn't bother me at all; I'll gladly do it).",
                    subject = "Inglés",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "ing_t06_s03",
            subjectId = "ingles",
            semana = 6,
            subtema = "6.3 Chronological Sequencing: Time Connectors & Prepositions with Gerund",
            title = "Chronological Sequencing and Prepositions with -ING",
            theory = LessonTheory(
                id = "th_ing_t06_s03",
                asignatura = "Inglés",
                semana = 6,
                titulo = "Chronological Sequencing and Prepositions",
                resumen = "• Marcadores de Secuencia Temporal (Process & Chronology Markers):\n  - Fundamentales para describir experimentos científicos, instrucciones técnicas y relatos históricos.\n  - *First / Firstly:* Introduce el punto inicial de partida (*First, sterilize all glass containers*).\n  - *Then / Next / After that:* Describen los pasos sucesivos intermedios (*Next, dilute the solution. Then, heat the mixture*).\n  - *Finally / Lastly:* Introduce la etapa de cierre o desenlace (*Finally, record the resulting temperature*).\n\n• Regla de Oro de las Preposiciones en Inglés:\n  - **TODA preposición seguida de un verbo exige obligatoriamente la forma de Gerundio (-ING):**\n    $$\\mathbf{Preposition} + \\mathbf{Verb\\text{-}ING}$$\n  - Preposiciones Temporales Clave:\n    * $\\mathbf{Before} + \\mathbf{Verb\\text{-}ING}$: *Check the test tube carefully **before mixing** the reactive agents*.\n    * $\\mathbf{After} + \\mathbf{Verb\\text{-}ING}$: ***After finishing** the examination, remain seated quietly*.\n    * $\\mathbf{While} + \\mathbf{Verb\\text{-}ING}$: *Take notes **while listening** to the academic lecture*.\n    * $\\mathbf{By} + \\mathbf{Verb\\text{-}ING}$ (medio/método): *You can master English **by practicing** every day*.\n    * $\\mathbf{Without} + \\mathbf{Verb\\text{-}ING}$: *Do not leave the laboratory **without washing** your hands*.",
                conceptosClave = listOf(
                    "Preposition + Verb-ING: Regla sintáctica universal inviolable del inglés",
                    "Sequence markers: First, Next, Then, After that, Finally ordenan procesos",
                    "Before / After + -ING: Cláusulas temporales abreviadas sin sujeto explícito",
                    "By + -ING: Expresa el medio instrumental o procedimiento para lograr un fin"
                ),
                formulas = listOf(
                    "\\text{Universal Rule}: \\; \\mathbf{Preposition \\ (in, on, at, by, for, before, after, without)} + \\mathbf{Verb\\text{-}ING}",
                    "\\text{Sequence}: \\; \\text{First} \\to \\text{Next / Then} \\to \\text{After that} \\to \\text{Finally}",
                    "\\text{Instrumental}: \\; \\mathbf{By} + \\mathbf{Verb\\text{-}ING} \\implies \\text{Method / Way of achieving a goal}"
                ),
                formulaName = "Prepositional Gerund Law",
                formulaLatex = "\\forall P \\in \\text{Prepositions}, \\quad P + V \\implies P + V_{\\text{-ing}}",
                formulaDescription = "Ley gramatical de sufijación de gerundio tras cualquier preposición.",
                admissionTip = "Si en el examen ves una preposición (of, for, about, without, before, after, by) seguida de un espacio en blanco, busca inmediatamente la opción que termine en '-ing'. ¡Nunca un infinitivo con to ni un verbo base!",
                admissionExplanation = "• 'Thank you for coming' o 'Instead of studying' demuestran la aplicación directa de esta regla."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Safety guideline: 'Students must turn off all Bunsen burners before ______ the chemistry laboratory.'",
                    options = listOf(
                        "leave",
                        "leaving",
                        "to leave",
                        "left",
                        "leaves"
                    ),
                    correctIndex = 1,
                    explanation = "'Before' is a preposition. When followed by a verb without an explicit subject, the verb must take the gerund form (-ING): 'before leaving'.",
                    subject = "Inglés",
                    semana = 6
                ),
                Challenge(
                    id = "q_ing_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "You cannot expect to pass the competitive admission examination without ______ consistently every single day.",
                    options = listOf(
                        "to study",
                        "study",
                        "studying",
                        "studied",
                        "studies"
                    ),
                    correctIndex = 2,
                    explanation = "Following the preposition 'without', verbs require the gerund form: 'without studying'.",
                    subject = "Inglés",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "ing_t06_s04",
            subjectId = "ingles",
            semana = 6,
            subtema = "6.4 Discourse Linkers: Contrast, Cause & Effect, Purpose",
            title = "Logical Connectors: Contrast, Cause and Purpose",
            theory = LessonTheory(
                id = "th_ing_t06_s04",
                asignatura = "Inglés",
                semana = 6,
                titulo = "Discourse Connectors and Logic",
                resumen = "• Conectores de Contraste y Objeción:\n  1. **Although / Even though + Cláusula Completa (Sujeto + Verbo):**\n     * *Although the exam was difficult, Juan scored high marks.* (Lleva oración completa).\n  2. **Despite / In spite of + Sustantivo o Gerundio (-ING):**\n     * *Despite the difficulty of the exam, Juan scored high marks.* (NUNCA lleva 'of' tras despite: $\\times$ *despite of* es un error grave).\n     * *In spite of studying hard, she felt nervous.*.\n  3. **However / Nevertheless:** Conectores parentéticos seguidos de coma (; however, / However,).\n\n• Conectores de Causa y Efecto:\n  1. **Because + Cláusula Completa (Sujeto + Verbo):** *Classes were suspended because it rained heavily*.\n  2. **Because of / Due to + Frase Nominal:** *Classes were suspended because of the heavy rain*.\n  3. **Therefore / Consequently / As a result:** Indican el efecto o consecuencia lógica (*He didn't study; therefore, he failed*).\n\n• Conectores de Finalidad y Propósito:\n  1. **To / In order to + Verbo Base:** *He enrolled in pre-university classes to improve his calculus*.\n  2. **So that + Cláusula con Modal (can/could/will/would):** *He studied diligently so that he could pass the admission exam*.",
                conceptosClave = listOf(
                    "Although vs. Despite: Although + oración completa vs. Despite + sustantivo/-ING",
                    "Because vs. Because of: Because + cláusula vs. Because of + frase nominal",
                    "In order to: Introduce propósito seguido de verbo base infinitivo",
                    "Therefore / However: Conectores oracionales precedidos de punto o punto y coma"
                ),
                formulas = listOf(
                    "\\mathbf{Although / Even \\ though} + \\text{Subject} + \\text{Verb} \\quad (\\text{Full Clause})",
                    "\\mathbf{Despite / In \\ spite \\ of} + [\\text{Noun Phrase} \\mid \\text{Verb\\text{-}ING}]",
                    "\\mathbf{Because} + \\text{Clause} \\quad \\text{vs.} \\quad \\mathbf{Because \\ of / Due \\ to} + \\text{Noun Phrase}",
                    "\\mathbf{In \\ order \\ to / To} + \\mathbf{Base \\ Verb} \\quad \\text{vs.} \\quad \\mathbf{So \\ that} + \\text{Subj} + \\text{modal}"
                ),
                formulaName = "Discourse Logic Architecture",
                formulaLatex = "\\text{Syntax} = \\begin{cases} \\text{Connector} + [S + V] & (Although, Because, So \\ that) \\\\ \\text{Connector} + \\text{Noun / ING} & (Despite, In \\ spite \\ of, Because \\ of) \\\\ \\text{Connector} + V_{\\text{base}} & (In \\ order \\ to, To) \\end{cases}",
                formulaDescription = "Selección sintáctica de conectores discursivos en el examen de admisión.",
                admissionTip = "¡El error más castigado en admisión es 'despite of'! 'Despite' NUNCA lleva 'of'. Si quieres usar 'of', debes escribir 'in spite of'.",
                admissionExplanation = "• Comprueba siempre si después del conector hay un verbo conjugado: si lo hay, usa 'because' o 'although'; si solo hay un sustantivo, usa 'because of' o 'despite'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete the sentence with the appropriate contrast connector: '______ the heavy rainfall in Arequipa, the geological expedition proceeded as scheduled.'",
                    options = listOf(
                        "Although",
                        "Despite",
                        "Even though",
                        "Because",
                        "In spite"
                    ),
                    correctIndex = 1,
                    explanation = "'The heavy rainfall' is a noun phrase without a conjugated verb. 'Despite' connects directly to a noun phrase. ('In spite' requires 'of', and 'Although' requires a full clause).",
                    subject = "Inglés",
                    semana = 6
                ),
                Challenge(
                    id = "q_ing_t06_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "The laboratory researchers worked overnight ______ they could calibrate the new electron microscope before the morning seminar.",
                    options = listOf(
                        "in order to",
                        "so that",
                        "because of",
                        "despite",
                        "due to"
                    ),
                    correctIndex = 1,
                    explanation = "'They could calibrate...' is a full clause containing a modal verb ('could'), which requires the purpose connector 'so that'. 'In order to' would require a direct base verb.",
                    subject = "Inglés",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: PRONOUNS, PREPOSITIONS & ENGLISH SYNTAX (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "ing_t07_s01",
            subjectId = "ingles",
            semana = 7,
            subtema = "7.1 Pronominal System: Subject, Object & Reflexive Pronouns",
            title = "Pronouns: Subject, Object and Reflexive Forms",
            theory = LessonTheory(
                id = "th_ing_t07_s01",
                asignatura = "Inglés",
                semana = 7,
                titulo = "Subject, Object and Reflexive Pronouns",
                resumen = "• Arquitectura del Sistema Pronominal Inglés:\n  1. **Subject Pronouns (Pronombres de Sujeto):**\n     - *I, you, he, she, it, we, they*.\n     - Ejecutan la acción y se sitúan antes del verbo conjugado (*She conducts the experiment*).\n  2. **Object Pronouns (Pronombres de Objeto Directo / Indirecto):**\n     - *me, you, him, her, it, us, them*.\n     - Reciben la acción verbal o van situados inmediatamente después de preposiciones (*The professor called **them** / Listen to **her** / Talk with **us**; NUNCA: $\\times$ *with we*).\n  3. **Reflexive Pronouns (Pronombres Reflexivos y Enfáticos):**\n     - *myself, yourself, himself, herself, itself, ourselves, yourselves, themselves*.\n     - Uso Reflexivo: El sujeto y el objeto de la acción son idénticos (*He accidentally cut **himself** with glass*).\n     - Uso Enfático: Resaltan que el sujeto realizó la acción por sí mismo sin intermediarios (*The Dean **himself** signed the diploma*).\n     - Expresión 'By oneself': Significa 'completamente solo / sin ayuda' (*She prepared the research by **herself***).",
                conceptosClave = listOf(
                    "Subject pronouns: Ocupan la posición de sujeto preverbal (I, he, she, they)",
                    "Object pronouns: Se colocan tras verbos transitivos y preposiciones (me, him, them)",
                    "Reflexive pronouns: Acción co-referencial sujeto=objeto (himself, themselves)",
                    "By + reflexive: Expresa soledad o autonomía operativa (by myself, by himself)"
                ),
                formulas = listOf(
                    "\\text{Subject Position}: \\; \\mathbf{Subject \\ Pronoun} + \\text{Verb} \\quad (\\text{e.g., They graduated})",
                    "\\text{Prepositional Object}: \\; \\text{Preposition} + \\mathbf{Object \\ Pronoun} \\quad (\\text{e.g., between you and me})",
                    "\\text{Reflexive Action}: \\; \\text{Subj}_i + \\text{Verb} + \\mathbf{Reflexive}_i \\quad (\\text{e.g., He hurt himself})"
                ),
                formulaName = "Pronoun Functional Distribution",
                formulaLatex = "\\text{Pronoun Form} = \\begin{cases} \\text{Subject} & \\text{before main verb} \\\\ \\text{Object} & \\text{after verb or preposition} \\\\ \\text{Reflexive} & \\text{when Subject} \\equiv \\text{Object} \\end{cases}",
                formulaDescription = "Distribución sintáctica de pronombres según función gramatical oracional.",
                admissionTip = "Tras cualquier preposición, usa SIEMPRE un object pronoun. Por ejemplo, en 'between you and me', decir 'between you and I' es un error gramatical muy común en hablantes descuidados.",
                admissionExplanation = "• 'Themselves' es la forma correcta plural; 'theirselves' es una palabra inexistente en el estándar académico."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "The university dean congratulated my lab partner and ______ on our outstanding performance in the national physics olympiad.",
                    options = listOf(
                        "I",
                        "me",
                        "myself",
                        "mine",
                        "my"
                    ),
                    correctIndex = 1,
                    explanation = "'Congratulated' is a transitive verb that requires an object pronoun ('congratulated my partner and me').",
                    subject = "Inglés",
                    semana = 7
                ),
                Challenge(
                    id = "q_ing_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "The software engineering students built the entire mobile application ______ without hiring outside programmers.",
                    options = listOf(
                        "themselves",
                        "theirselves",
                        "them",
                        "theirs",
                        "himself"
                    ),
                    correctIndex = 0,
                    explanation = "The plural subject 'The students' requires the emphatic reflexive pronoun 'themselves'. 'Theirselves' is incorrect.",
                    subject = "Inglés",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "ing_t07_s02",
            subjectId = "ingles",
            semana = 7,
            subtema = "7.2 Possessives: Possessive Adjectives vs. Possessive Pronouns ('Its' vs. 'It's')",
            title = "Possessives: Adjectives, Pronouns and the Its/It's Contrast",
            theory = LessonTheory(
                id = "th_ing_t07_s02",
                asignatura = "Inglés",
                semana = 7,
                titulo = "Possessive Determiners and Pronouns",
                resumen = "• Possessive Adjectives (Determinantes Posesivos):\n  - *my, your, his, her, its, our, your, their*.\n  - **Regla Estricta:** Acompañan OBLIGATORIAMENTE a un sustantivo (Adj + N):\n    * *This is **my laptop**.* / *They parked **their car** outside*.\n\n• Possessive Pronouns (Pronombres Posesivos Independientes):\n  - *mine, yours, his, hers, [its - desaconsejado], ours, yours, theirs*.\n  - **Regla Estricta:** Sustituyen por completo al sintagma nominal y **JAMÁS van seguidos de un sustantivo**:\n    * *This laptop is **mine**.* (NUNCA: $\times$ *mine laptop*).\n    * *Their laboratory is modern, but **ours** is bigger.*\n\n• La Distinción Ortográfica Vital: *Its* vs. *It's*:\n  1. **Its (Posesivo sin apóstrofo):** Adjetivo posesivo neutro correspondiente a cosas, animales o conceptos (*The university celebrated **its** bicentennial* / *The cat licked **its** paw*).\n  2. **It's (Con apóstrofo):** Contracción obligatoria de *it is* o *it has* (*It's a beautiful day* / *It's been raining*).",
                conceptosClave = listOf(
                    "Possessive Adjective: Va siempre seguido de un sustantivo (my car, their campus)",
                    "Possessive Pronoun: Reemplaza al sustantivo y va solo (It is mine, That is ours)",
                    "Its (sin apóstrofo): Posesivo de tercera persona neutro",
                    "It's (con apóstrofo): Contracción de 'it is' o 'it has'"
                ),
                formulas = listOf(
                    "\\text{Possessive Adjective} + \\mathbf{Noun} \\quad (\\text{e.g., her thesis})",
                    "\\text{Possessive Pronoun} \\implies \\mathbf{NO \\ Noun} \\quad (\\text{e.g., The thesis is hers})",
                    "\\mathbf{Its} = \\text{Possessive Determiner} \\; \\text{vs.} \\; \\mathbf{It's} = \\text{Contraction of [It is / It has]}"
                ),
                formulaName = "Possessive Structural Equation",
                formulaLatex = "\\text{Possessive} = \\begin{cases} \\text{Adj} + N & (my, your, his, her, its, our, their) \\\\ \\text{Pronoun (Solo)} & (mine, yours, his, hers, ours, theirs) \\end{cases}",
                formulaDescription = "Diferenciación sintáctica entre adjetivo posesivo y pronombre sustitutivo.",
                admissionTip = "¡Trampa visual de ortografía! Si puedes reemplazar la palabra por 'it is', lleva apóstrofo ('it's'). Si no tiene sentido decir 'it is' (ejemplo: 'The dog wagged it is tail' no tiene sentido), entonces es posesivo y se escribe sin apóstrofo: 'its'.",
                admissionExplanation = "• Nunca pongas apóstrofo a los pronombres posesivos: 'ours', 'yours', 'theirs', 'hers' se escriben sin apóstrofo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Choose the sentence that correctly uses 'its' or 'it's':",
                    options = listOf(
                        "The medical research institute published it's annual findings on cancer prevention.",
                        "The medical research institute published its annual findings on cancer prevention.",
                        "The medical research institute published its' annual findings on cancer prevention.",
                        "The medical research institute published it is annual findings on cancer prevention.",
                        "The medical research institute published their's annual findings on cancer prevention."
                    ),
                    correctIndex = 1,
                    explanation = "'Its' is the possessive adjective modifying 'annual findings'. It must be written without an apostrophe.",
                    subject = "Inglés",
                    semana = 7
                ),
                Challenge(
                    id = "q_ing_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "'I forgot to bring my dictionary today. Could you please lend me ______?'",
                    options = listOf(
                        "your",
                        "yours",
                        "you",
                        "your's",
                        "yourself"
                    ),
                    correctIndex = 1,
                    explanation = "The blank stands alone at the end of the sentence replacing 'your dictionary', which requires the possessive pronoun 'yours'.",
                    subject = "Inglés",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "ing_t07_s03",
            subjectId = "ingles",
            semana = 7,
            subtema = "7.3 Prepositions Matrix: Specificity Pyramid (At, On, In) & Movement Prepositions",
            title = "The Prepositional Matrix: Time, Place and Movement",
            theory = LessonTheory(
                id = "th_ing_t07_s03",
                asignatura = "Inglés",
                semana = 7,
                titulo = "Prepositions: AT, ON, IN and Movement",
                resumen = "• La Pirámide de Especificidad Preposicional (*AT, ON, IN*):\n  1. **IN (Lo más general / Mayor escala):**\n     - Tiempo: Siglos, años, meses, estaciones, partes del día (*in the 21st century, in 2027, in July, in winter, in the morning/afternoon/evening*).\n     - Lugar: Países, ciudades, continentes, espacios cerrados tridimensionales (*in Peru, in Arequipa, in South America, in the classroom, in the box*).\n  2. **ON (Escala intermedia / Superficies y fechas):**\n     - Tiempo: Días de la semana, fechas exactas con día, días festivos con 'day' (*on Monday, on October 12th, on Christmas Day, on my birthday*).\n     - Lugar: Superficies planas, pisos de edificios, nombres de calles o avenidas (*on the table, on the wall, on the second floor, on Independencia Avenue*).\n  3. **AT (Punto exacto / Máxima precisión):**\n     - Tiempo: Horas puntuales exactas, momentos concretos (*at 8:30 AM, at noon, at midnight, at dawn, at night*).\n     - Lugar: Direcciones con número exacto, puntos de encuentro concretos, instituciones funcionales (*at 124 San Agustín Street, at the bus stop, at the door, at home, at university*).\n\n• Preposiciones de Movimiento y Trayectoria:\n  - *Into:* Movimiento hacia el **interior** (*He walked into the chemistry lab*).\n  - *Out of:* Movimiento hacia el **exterior** (*She ran out of the building*).\n  - *Across:* Cruzar de un lado a otro sobre una superficie (*walking across the bridge*).\n  - *Through:* Atravesar un volumen tridimensional cerrado (*driving through the tunnel / forest*).\n  - *Towards:* En dirección o rumbo hacia un destino (*walking towards the campus*).",
                conceptosClave = listOf(
                    "Pirámide In-On-At: In (amplio/meses/ciudades), On (días/calles), At (horas/direcciones exactas)",
                    "Excepción temporal: At night vs. In the morning/afternoon/evening",
                    "Through vs. Across: Through en volúmenes tridimensionales; Across sobre superficies bidimensionales",
                    "Into vs. In: Into denota movimiento de entrada hacia adentro; In denota posición fija estática"
                ),
                formulas = listOf(
                    "\\mathbf{AT}: \\; \\text{Exact Hours (at 7:00)} + \\text{Numbered Addresses (at 402 Bolivar St.)} + \\text{At night}",
                    "\\mathbf{ON}: \\; \\text{Days of Week (on Friday)} + \\text{Full Dates (on March 15th)} + \\text{Streets (on Lima St.)}",
                    "\\mathbf{IN}: \\; \\text{Years / Months (in 2027 / in May)} + \\text{Cities / Countries (in Arequipa / in Peru)}"
                ),
                formulaName = "Prepositional Specificity Pyramid",
                formulaLatex = "\\text{Preposition} = \\begin{cases} \\mathbf{IN} & (\\text{Broad: Years, Months, Cities}) \\\\ \\mathbf{ON} & (\\text{Medium: Days, Dates, Streets}) \\\\ \\mathbf{AT} & (\\text{Specific: Hours, Exact Address}) \\end{cases}",
                formulaDescription = "Jerarquía geométrica de especificidad espacio-temporal en la lengua inglesa.",
                admissionTip = "Fíjate si la fecha incluye el día numérico: si solo dice el mes ('in May'), lleva IN; pero si dice el mes y el día ('on May 15th'), ¡automáticamente se convierte en ON!",
                admissionExplanation = "• 'At night' es una excepción fija que no lleva 'in' (a diferencia de 'in the morning')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "The inaugural session of the medical conference will take place ______ 08:30 AM ______ Monday, October 14th.",
                    options = listOf(
                        "in / on",
                        "at / on",
                        "on / at",
                        "at / in",
                        "in / at"
                    ),
                    correctIndex = 1,
                    explanation = "Exact hours require 'at' ('at 08:30 AM'), while specific calendar dates with days require 'on' ('on Monday, October 14th').",
                    subject = "Inglés",
                    semana = 7
                ),
                Challenge(
                    id = "q_ing_t07_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "The hikers had to walk ______ a dense bamboo forest before reaching the mountain summit.",
                    options = listOf(
                        "through",
                        "across",
                        "over",
                        "at",
                        "into"
                    ),
                    correctIndex = 0,
                    explanation = "'Through' is used for movement within and surrounded by a three-dimensional volume or dense area, such as a forest or tunnel.",
                    subject = "Inglés",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "ing_t07_s04",
            subjectId = "ingles",
            semana = 7,
            subtema = "7.4 English Sentence Syntax: SVOPT Canonical Order & OSASCOMP Adjectives",
            title = "English Syntax: Word Order and the OSASCOMP Rule",
            theory = LessonTheory(
                id = "th_ing_t07_s04",
                asignatura = "Inglés",
                semana = 7,
                titulo = "Canonical Order and OSASCOMP Rule",
                resumen = "• Orden Sintáctico Canónico en Inglés (S-V-O-M-P-T):\n  - A diferencia del español (que es flexible), el inglés tiene un ordenamiento posicional rígido:\n    $$\\mathbf{Subject} + \\mathbf{Verb} + \\mathbf{Object} + (\\mathbf{Manner}) + \\mathbf{Place} + \\mathbf{Time}$$\n    * Incorrecto: $\\times$ *Yesterday bought John in Arequipa a new computer.*\n    * Correcto: $\\checkmark$ *John **[S]** bought **[V]** a new computer **[O]** in Arequipa **[Place]** yesterday **[Time]**.*\n\n• Regla Jerárquica del Orden de Adjetivos Múltiples (Mnemotécnica OSASCOMP):\n  - Cuando dos o más adjetivos califican a un mismo sustantivo, deben anteponerse siguiendo un orden inviolable:\n    1. **O - Opinion:** *beautiful, modern, delicious, ugly, useful*.\n    2. **S - Size:** *large, small, tiny, huge*.\n    3. **A - Age:** *old, ancient, new, young*.\n    4. **S - Shape:** *round, square, rectangular, triangular*.\n    5. **C - Color:** *blue, dark, crimson, green*.\n    6. **O - Origin:** *Peruvian, German, Japanese, European*.\n    7. **M - Material:** *wooden, metallic, plastic, cotton, silk*.\n    8. **P - Purpose:** *sleeping (bag), running (shoes), cooking (oil)*.\n  - Ejemplo Canónico: *A beautiful **[O]** large **[S]** ancient **[A]** Peruvian **[O]** ceramic **[M]** vessel.*",
                conceptosClave = listOf(
                    "SVOPT: Sujeto, Verbo, Objeto, Manera, Lugar y Tiempo al final",
                    "Regla OSASCOMP: Jerarquía obligatoria de adjetivos antepuestos al sustantivo",
                    "Opinion precede a Size: Primero cómo lo juzgas y luego sus dimensiones físicas",
                    "Origin y Material: Se sitúan inmediatamente antes del sustantivo nuclear"
                ),
                formulas = listOf(
                    "\\text{Canonical Sentence}: \\; \\mathbf{Subject} + \\mathbf{Verb} + \\mathbf{Object} + \\mathbf{Manner} + \\mathbf{Place} + \\mathbf{Time}",
                    "\\text{OSASCOMP Sequence}: \\; \\text{Opinion} \\to \\text{Size} \\to \\text{Age} \\to \\text{Shape} \\to \\text{Color} \\to \\text{Origin} \\to \\text{Material} \\to \\text{Purpose} + \\mathbf{Noun}"
                ),
                formulaName = "OSASCOMP Adjective Hierarchy",
                formulaLatex = "\\text{Adj Order} = [\\text{Opinion}] \\prec [\\text{Size}] \\prec [\\text{Age}] \\prec [\\text{Shape}] \\prec [\\text{Color}] \\prec [\\text{Origin}] \\prec [\\text{Material}] \\prec [\\text{Purpose}]",
                formulaDescription = "Secuenciación algorítmica de adjetivos atributivos en inglés.",
                admissionTip = "En preguntas de ordenamiento de adjetivos, fíjate en el material y el origen: SIEMPRE van al final, pegados al sustantivo (ejemplo: 'wooden desk', 'German car'). La opinión siempre va primera.",
                admissionExplanation = "• Las expresiones de tiempo puntual (yesterday, last week) van preferentemente al final de la oración en inglés."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_ing_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Choose the sentence that complies with the canonical OSASCOMP adjective order:",
                    options = listOf(
                        "The museum acquired an ancient beautiful Peruvian textile.",
                        "The museum acquired a beautiful ancient Peruvian textile.",
                        "The museum acquired a Peruvian beautiful ancient textile.",
                        "The museum acquired an ancient Peruvian beautiful textile.",
                        "The museum acquired a textile beautiful ancient Peruvian."
                    ),
                    correctIndex = 1,
                    explanation = "According to OSASCOMP: Opinion ('beautiful') comes first, followed by Age ('ancient'), followed by Origin ('Peruvian') before the noun ('textile').",
                    subject = "Inglés",
                    semana = 7
                ),
                Challenge(
                    id = "q_ing_t07_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Which sentence demonstrates the correct canonical word order (SVOPT)?",
                    options = listOf(
                        "Dr. Salas delivered in the auditorium yesterday an inspiring lecture.",
                        "Yesterday delivered Dr. Salas an inspiring lecture in the auditorium.",
                        "Dr. Salas delivered an inspiring lecture in the auditorium yesterday.",
                        "Dr. Salas in the auditorium delivered an inspiring lecture yesterday.",
                        "An inspiring lecture delivered Dr. Salas yesterday in the auditorium."
                    ),
                    correctIndex = 2,
                    explanation = "The standard canonical sentence order is Subject ('Dr. Salas') + Verb ('delivered') + Object ('an inspiring lecture') + Place ('in the auditorium') + Time ('yesterday').",
                    subject = "Inglés",
                    semana = 7
                )
            )
        )
    )
}
