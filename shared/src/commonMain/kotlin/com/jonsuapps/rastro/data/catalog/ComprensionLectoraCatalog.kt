package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object ComprensionLectoraCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: COMPRENSIÓN LITERAL (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "cl_t01_s01",
            subjectId = "comprension_lectora",
            semana = 1,
            subtema = "1.1 Información Explícita Directa y Localización de Datos (Scanning)",
            title = "Comprensión Literal: Localización de Datos Explícitos",
            theory = LessonTheory(
                id = "th_cl_t01_s01",
                asignatura = "Comp. Lectora",
                semana = 1,
                titulo = "Información Explícita y Rastreo Textual",
                resumen = "• El Nivel de Comprensión Literal:\n  - Es el primer nivel de procesamiento textual evaluado en admisión. Mide la capacidad del postulante para identificar, localizar y recuperar información que el autor ha formulado expresamente en las líneas del texto.\n  - En este nivel no se admiten suposiciones, deducciones ni valoraciones subjetivas personales: la verdad se verifica mediante cotejo visual directo.\n\n• Operaciones Cognitivas Clave:\n  1. **Recuperación de Datos Puntuales:** Nombres propios, fechas exactas, cifras numéricas, porcentajes, fórmulas y topónimos.\n  2. **Técnica del Scanning (Barrido Visual Selectivo):** Fijar mentalmente la palabra clave de la pregunta y recorrer el texto en zig-zag para ubicar el dato en segundos.\n  3. **Identificación de Relaciones Fácticas:** Quién realizó la acción, cuándo ocurrió, dónde se llevó a cabo y qué instrumental se empleó.\n\n• Formulación Canónica de Preguntas UNSA:\n  - *«Según el texto, el descubrimiento del sillar ocurrió en...»*\n  - *«En el segundo párrafo, el autor afirma expresamente que...»*\n  - *«De acuerdo con la lectura, ¿cuál de los siguientes datos es exacto?»*",
                conceptosClave = listOf(
                    "Información explícita: Contenido manifiesto formulado directamente con signos lingüísticos",
                    "Scanning: Rastreo visual rápido para localizar términos clave, cifras o fechas",
                    "Fidelidad al texto: La respuesta se convalida exclusivamente con lo escrito por el autor",
                    "Cero especulación: Prohibición de inyectar conocimientos previos al nivel literal"
                ),
                formulas = listOf(
                    "\\text{Respuesta Literal Válida} \\subseteq \\text{Enunciados Explícitos del Texto}",
                    "\\text{Scanning} \\implies \\text{Palabra Clave de Pregunta} \\to \\text{Línea Exacta del Texto}"
                ),
                formulaName = "Principio de Evidencia Textual Manifiesta",
                formulaLatex = "R_{\\text{literal}} = \\{x \\mid x \\in T_{\\text{explícito}}\\}",
                formulaDescription = "Condición de pertenencia directa de la respuesta al corpus textual.",
                admissionTip = "No respondas por lo que tú sabes de biología, historia o física por cultura general. Responde estrictamente 'SEGÚN EL TEXTO'. Si el texto afirma que un meteorito cayó en 1908, esa es la respuesta correcta para el examen.",
                admissionExplanation = "• Subraya las palabras clave de la pregunta antes de volver al texto; eso te evitará releer párrafos enteros innecesariamente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «En 1928, el bacteriólogo británico Alexander Fleming descubrió por azar la penicilina al observar que una colonia del hongo Penicillium notatum había contaminado una placa de Petri y destruido las bacterias estafilococos circundantes». \nPregunta: Según el texto, ¿en qué año y bajo qué circunstancia específica se descubrió la penicilina?",
                    options = listOf(
                        "En 1938, tras una investigación industrial planificada.",
                        "En 1928, de manera accidental por la contaminación de una placa de cultivo con un hongo.",
                        "En 1918, durante el tratamiento de soldados en la Primera Guerra Mundial.",
                        "En 1928, mediante síntesis molecular artificial en un laboratorio químico.",
                        "En 1945, al finalizar la Segunda Guerra Mundial."
                    ),
                    correctIndex = 1,
                    explanation = "La respuesta reproduce con exactitud literal los datos explícitos del texto: el año 1928 y la circunstancia accidental de contaminación por el hongo Penicillium notatum.",
                    subject = "Comp. Lectora",
                    semana = 1
                ),
                Challenge(
                    id = "q_cl_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El volcán Misti, ubicado a solo 17 kilómetros del centro histórico de Arequipa, se eleva a 5822 metros sobre el nivel del mar y es monitoreado permanentemente por el Instituto Geofísico del Perú». \n¿A qué altitud se sitúa la cumbre del Misti según el autor?",
                    options = listOf(
                        "5822 metros sobre el nivel del mar",
                        "17 kilómetros sobre el nivel del mar",
                        "6000 metros exactos",
                        "2325 metros en el centro histórico",
                        "5500 metros sobre el valle del Chili"
                    ),
                    correctIndex = 0,
                    explanation = "Localización literal directa: el texto consigna de forma explícita que la altitud del Misti es de 5822 metros sobre el nivel del mar.",
                    subject = "Comp. Lectora",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "cl_t01_s02",
            subjectId = "comprension_lectora",
            semana = 1,
            subtema = "1.2 Paráfrasis Fiel y Equivalencia Textual",
            title = "Paráfrasis Fiel: Decir lo Mismo con Otras Palabras",
            theory = LessonTheory(
                id = "th_cl_t01_s02",
                asignatura = "Comp. Lectora",
                semana = 1,
                titulo = "La Paráfrasis Fiel en la Comprensión Literal",
                resumen = "• La Paráfrasis Fiel:\n  - En las preguntas literales de mayor complejidad en la UNSA, la alternativa correcta casi nunca es una copia idéntica palabra por palabra del texto original.\n  - La clave suele presentarse como una **paráfrasis fiel**: una reformulación que expresa con exactitud el mismo contenido semántico pero utilizando sinónimos contextuales o variaciones de estructura sintáctica (como transformar voz activa en pasiva).\n\n• Mecanismos de Paráfrasis Rigurosa:\n  1. **Sustitución Sinonímica Contextual:** *«El monarca abdicó debido a presiones populares»* $\\to$ *«El soberano renunció a la corona forzado por la multitud»*.\n  2. **Inversión Sintáctica:** *«El calor del verano evaporó el agua de la laguna»* $\\to$ *«Las aguas del lago fueron evaporadas por las altas temperaturas estivales»*.\n  3. **Condensación Semántica:** Resumir una explicación detallada en una frase equivalente sin alterar el significado nuclear.\n\n• Criterio de Verificación:\n  - Una paráfrasis es fiel si y solo si la proposición resultante conserva el mismo valor de verdad y no añade valoraciones morales o conclusiones que el autor no mencionó.",
                conceptosClave = listOf(
                    "Paráfrasis fiel: Conservación estricta de la carga semántica original con léxico sinónimo",
                    "Transformación sintáctica: Cambios de orden de palabras o de voz activa a pasiva",
                    "Equivalencia veritativa: La proposición parafraseada mantiene el mismo valor de verdad",
                    "Prohibición de añadidos: La paráfrasis no debe agregar supuestos ajenos al texto"
                ),
                formulas = listOf(
                    "\\text{Paráfrasis}(O) \\iff \\text{Sentido}(O') = \\text{Sentido}(O) \\land \\text{Forma}(O') \\neq \\text{Forma}(O)",
                    "\\text{Criterio}: \\; \\text{Verdad}(O') = \\text{Verdad}(O) \\quad (\\text{Equivalencia Lógica})"
                ),
                formulaName = "Ecuación de Equivalencia Proposicional",
                formulaLatex = "O \\equiv O' \\iff \\forall s \\in \\text{Semas Nucleares}, \\; s \\in O \\iff s \\in O'",
                formulaDescription = "Condición de preservación semémica total entre el enunciado fuente y la paráfrasis.",
                admissionTip = "Ten cuidado con las opciones que usan las mismas palabras del texto pero desordenadas para alterar la relación de causa y efecto. Muchas veces la alternativa correcta usa sinónimos elegantes pero conserva la verdad intacta.",
                admissionExplanation = "• Si una alternativa cambia 'algunos' por 'todos', ya no es una paráfrasis fiel; es una falsedad por generalización indebida."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Enunciado del texto: «La tala indiscriminada de los bosques nublados de la vertiente oriental andina ha provocado la merma acelerada de especies endémicas de aves». \n¿Cuál de las siguientes alternativas constituye una PARÁFRASIS FIEL del enunciado?",
                    options = listOf(
                        "Las aves andinas migraron pacíficamente hacia la costa peruana.",
                        "La deforestación descontrolada en los bosques de niebla orientales redujo vertiginosamente la población de aves exclusivas de la zona.",
                        "Los campesinos protegen a las aves endémicas de los taladores furtivos.",
                        "La vertiente oriental andina ha recuperado su bioma vegetal gracias a las aves.",
                        "Todas las aves del planeta están en inminente peligro de extinción."
                    ),
                    correctIndex = 1,
                    explanation = "La opción sustituye con exactitud sinonímica: 'tala indiscriminada' por 'deforestación descontrolada', 'bosques nublados' por 'bosques de niebla', 'merma acelerada' por 'redujo vertiginosamente' y 'especies endémicas' por 'aves exclusivas de la zona', preservando el 100% de la verdad proposicional.",
                    subject = "Comp. Lectora",
                    semana = 1
                ),
                Challenge(
                    id = "q_cl_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El célebre matemático griego Arquímedes postuló que todo cuerpo sumergido en un fluido experimenta un empuje vertical hacia arriba igual al peso del fluido desalojado». \nUna formulación equivalente y fiel a la idea del texto es:",
                    options = listOf(
                        "Arquímedes demostró que todos los cuerpos flotan en el agua.",
                        "La fuerza ascensional que recibe un objeto sumergido equivale al peso del volumen líquido que dicho cuerpo desplazó.",
                        "El peso de los fluidos depende exclusivamente de la profundidad submarina.",
                        "Arquímedes rechazaba el principio de flotabilidad de los barcos.",
                        "Los cuerpos pesados desalojan más aire que líquido."
                    ),
                    correctIndex = 1,
                    explanation = "'Fuerza ascensional' parafrasea fielmente a 'empuje vertical hacia arriba' y 'volumen líquido que dicho cuerpo desplazó' a 'peso del fluido desalojado'.",
                    subject = "Comp. Lectora",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "cl_t01_s03",
            subjectId = "comprension_lectora",
            semana = 1,
            subtema = "1.3 Preguntas de Compatibilidad e Incompatibilidad Literal",
            title = "Compatibilidad e Incompatibilidad en el Texto",
            theory = LessonTheory(
                id = "th_cl_t01_s03",
                asignatura = "Comp. Lectora",
                semana = 1,
                titulo = "Compatibilidad e Incompatibilidad Literal",
                resumen = "• Preguntas de Compatibilidad e Incompatibilidad (Clásicos de Examen UNSA / DECO):\n  1. **Enunciado Compatible (Conforme al texto):**\n     - Proposición que concuerda plenamente con lo expresado en la lectura, ya sea de forma literal directa o mediante una deducción lógica inmediata e incuestionable.\n     - Formulación: *«Resulta compatible con el texto afirmar que...»*, *«Es concordante con lo sostenido por el autor que...»*.\n  2. **Enunciado Incompatible (Disconforme / Falso respecto al texto):**\n     - Proposición que **contradice, tergiversa, niega o discrepa** frontalmente con las afirmaciones del autor.\n     - Formulación: *«Resulta incompatible con el texto aseverar que...»*, *«Es falso respecto a la lectura señalar que...»*.\n\n• Protocolo Metodológico de Descarte Cruzado:\n  - Ante una pregunta de incompatibilidad, lee las cinco alternativas y busca las cuatro que sean verdaderas (compatibles) según el texto para tacharlas.\n  - La única alternativa que contradiga un dato explícito o invierta el sentido de una afirmación es la clave incompatible.",
                conceptosClave = listOf(
                    "Compatibilidad: Coherencia y correspondencia estricta con las afirmaciones del texto",
                    "Incompatibilidad: Contradicción, negación o tergiversación de los postulados del autor",
                    "Método de descarte de cuatro compatibles: Estrategia de seguridad en el examen",
                    "Tergiversación sutil: Alteración de un adjetivo o modificador para falsear la verdad"
                ),
                formulas = listOf(
                    "\\text{Compatible} \\iff T \\vdash P \\quad (P \\text{ es deducible o literal del texto})",
                    "\\text{Incompatible} \\iff T \\vdash \\neg P \\quad (P \\text{ contradice formalmente al texto})"
                ),
                formulaName = "Lógica de Consistencia Textual",
                formulaLatex = "\\text{Estado}(P) = \\begin{cases} \\text{Compatible} & \\text{si } T \\cup \\{P\\} \\text{ es consistente} \\\\ \\text{Incompatible} & \\text{si } T \\cup \\{P\\} \\vdash \\bot \\; (\\text{contradicción}) \\end{cases}",
                formulaDescription = "Validación lógica de enunciados respecto al marco teórico del texto.",
                admissionTip = "¡Lee con lupa el enunciado de la pregunta! Es muy frecuente que el postulante lea apurado, busque una opción que sí está en el texto y marque una compatible cuando la pregunta decía claramente 'Es INCOMPATIBLE'.",
                admissionExplanation = "• Una afirmación puede ser científicamente verdadera en la realidad, pero si el texto dice lo contrario, en el examen es INCOMPATIBLE."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El telescopio James Webb opera en el espectro infrarrojo y se encuentra orbitando en el punto de Lagrange L2, a 1.5 millones de kilómetros de la Tierra. A diferencia del telescopio Hubble, el Webb no fue diseñado para recibir mantenimiento tripulado en el espacio». \nPregunta: Resulta INCOMPATIBLE con el texto afirmar que el telescopio James Webb:",
                    options = listOf(
                        "Captura radiación perteneciente al espectro infrarrojo.",
                        "Se ubica en una órbita localizada en el punto de Lagrange L2.",
                        "Dista aproximadamente un millón y medio de kilómetros de nuestro planeta.",
                        "Puede ser reparado y actualizado periódicamente en el espacio por astronautas.",
                        "Difiere en diseño operativo respecto al veterano telescopio Hubble."
                    ),
                    correctIndex = 3,
                    explanation = "El texto afirma expresamente: 'el Webb no fue diseñado para recibir mantenimiento tripulado en el espacio'. Por ende, sostener que puede ser reparado en el espacio por astronautas contradice abiertamente al autor, siendo la afirmación incompatible.",
                    subject = "Comp. Lectora",
                    semana = 1
                ),
                Challenge(
                    id = "q_cl_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «La vicuña posee la fibra animal más fina y cotizada del mundo; por ello, los antiguos incas organizaban el chaccu para esquilarla periódicamente sin causarle la muerte». \nEs COMPATIBLE con el texto señalar que:",
                    options = listOf(
                        "Los incas cazaban a las vicuñas para comercializar su carne en los tambos.",
                        "El chaccu era una práctica incaica que preservaba la vida del camélido.",
                        "La alpaca produce una fibra más fina y cara que la de la vicuña.",
                        "La vicuña se extinguió durante el Tahuantinsuyo por el exceso de esquila.",
                        "Los incas esquilaban a las vicuñas una sola vez en toda su existencia."
                    ),
                    correctIndex = 1,
                    explanation = "El texto indica que organizaban el chaccu para esquilarla 'sin causarle la muerte', lo que hace plenamente compatible la afirmación de que preservaban la vida del animal.",
                    subject = "Comp. Lectora",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "cl_t01_s04",
            subjectId = "comprension_lectora",
            semana = 1,
            subtema = "1.4 Distractores Clásicos en Lectura Literal: Generalización Indebida y Distorsión",
            title = "Trampas y Distractores en Comprensión Literal",
            theory = LessonTheory(
                id = "th_cl_t01_s04",
                asignatura = "Comp. Lectora",
                semana = 1,
                titulo = "Distractores Típicos en Preguntas Literales",
                resumen = "• Anatomía de los Distractores en Exámenes de Admisión:\n  - Los diseñadores de reactivos de la UNSA y UNMSM crean alternativas incorrectas siguiendo patrones psicológicos sistemáticos para inducir al error al postulante confiado.\n\n• Los Cuatro Distractores Literales Clásicos:\n  1. **Generalización Indebida (Cuantificador Falso):**\n     - El texto utiliza un cuantificador particular (*algunos, muchos, casi todos, frecuentemente*), pero la alternativa emplea un cuantificador universal categórico (*todos, siempre, invariablemente, en ningún caso*).\n     - Si el texto dice: *«Muchos pacientes mejoraron con el fármaco»*, la opción que dice *«Todos los pacientes se curaron»* es FALSA.\n  2. **Distorsión o Inversión de Términos:**\n     - Utiliza las mismas palabras del texto pero invierte el sujeto y el predicado o la relación causa-efecto.\n     - Si el texto dice: *«La inflación deterioró el salario real»*, la opción dice: *«El salario deterioró la inflación»*.\n  3. **Extrapolación No Sustentada:**\n     - La alternativa expone una idea verosímil y razonable en el mundo real, pero que **no figura en ninguna línea del texto**.\n  4. **Restricción Excesiva o Enfático-Absoluta:**\n     - Emplea adverbios excluyentes como *«únicamente», «solamente», «exclusivamente»* donde el texto era amplio y abierto.",
                conceptosClave = listOf(
                    "Generalización indebida: Paso arbitrario de 'algunos' o 'muchos' a 'todos'",
                    "Distorsión de polaridad: Inversión de la causalidad o del orden sujeto-objeto",
                    "Conocimiento previo ajeno: Afirmaciones verdaderas en la realidad pero ausentes en el texto",
                    "Palabras absolutistas de alerta: Siempre, nunca, jamás, totalmente, únicamente"
                ),
                formulas = listOf(
                    "\\text{Error}: \\; \\exists x \\; P(x) \\implies \\forall x \\; P(x) \\quad (\\text{Falacia de Generalización})",
                    "\\text{Alerta Absolutista}: \\; \\{siempre, todos, nunca, únicamente\\} \\implies P(\\text{Distractor}) > 0.85"
                ),
                formulaName = "Filtro de Desactivación de Distractores",
                formulaLatex = "\\text{Opción Válida} = \\text{Fiel}(\\text{Cuantificadores}) \\land \\text{Fiel}(\\text{Causalidad}) \\land \\text{Contenida en } T",
                formulaDescription = "Condiciones lógicas para eludir trampas de cuantificación y atribución.",
                admissionTip = "¡Regla de oro de admisión! Desconfía de inmediato de alternativas que contengan las palabras 'TODOS', 'SIEMPRE', 'NUNCA' o 'ÚNICAMENTE'. En textos académicos, los científicos casi nunca usan términos absolutos.",
                admissionExplanation = "• Coteja los cuantificadores: si el texto dice 'la mayoría', una opción que diga 'la totalidad' es automáticamente un distractor."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Diversas investigaciones preliminares sugieren que el consumo habitual de frutos rojos podría reducir el riesgo de padecer ciertas enfermedades neurodegenerativas en adultos mayores». \n¿Cuál de las siguientes afirmaciones constituye una GENERALIZACIÓN INDEBIDA del texto?",
                    options = listOf(
                        "Existen estudios previos sobre los beneficios de los frutos rojos.",
                        "El consumo de frutos rojos garantiza la inmunidad total y cura todas las enfermedades cerebrales.",
                        "Los frutos rojos podrían favorecer la salud de adultos mayores.",
                        "Las investigaciones citadas tienen carácter preliminar.",
                        "El consumo habitual de ciertos alimentos se asocia a la prevención de dolencias."
                    ),
                    correctIndex = 1,
                    explanation = "El texto habla con prudencia científica ('sugieren', 'podría reducir', 'ciertas enfermedades'). La opción (B) generaliza de manera absoluta y desmedida ('garantiza inmunidad total', 'cura todas las enfermedades'), constituyendo el distractor prototípico.",
                    subject = "Comp. Lectora",
                    semana = 1
                ),
                Challenge(
                    id = "q_cl_t01_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si un texto indica que «muchos estudiantes de secundaria presentan dificultades para comprender problemas de física mecánica», ¿qué opción representa una distorsión absolutista?",
                    options = listOf(
                        "La física mecánica resulta compleja para numerosos escolares.",
                        "No todos los alumnos asimilan con facilidad la física mecánica.",
                        "Absolutamente ningún estudiante de secundaria es capaz de entender la física mecánica.",
                        "Ciertos conceptos de la física mecánica demandan mayor esfuerzo cognitivo.",
                        "El aprendizaje de las ciencias plantea retos pedagógicos."
                    ),
                    correctIndex = 2,
                    explanation = "Transformar 'muchos estudiantes presentan dificultades' en 'absolutamente ningún estudiante es capaz de entender' es una distorsión absolutista extrema que anula la verdad del texto original.",
                    subject = "Comp. Lectora",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: COMPRENSIÓN INFERENCIAL (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "cl_t02_s01",
            subjectId = "comprension_lectora",
            semana = 2,
            subtema = "2.1 La Inferencia Lógica: Deducción, Inducción y Rastro Textual",
            title = "Comprensión Inferencial: Mecanismos de Deducción e Inducción",
            theory = LessonTheory(
                id = "th_cl_t02_s01",
                asignatura = "Comp. Lectora",
                semana = 2,
                titulo = "La Inferencia Lógica en la Lectura",
                resumen = "• El Nivel de Comprensión Inferencial:\n  - Consiste en obtener conclusiones no explícitas pero válidas y necesarias a partir de las premisas, indicios y datos factuales declarados en el texto (*«leer entre líneas»*).\n  - La inferencia no es adivinar ni imaginar: es una derivación lógica rigurosa amparada en pistas textuales incontrovertibles.\n\n• Mecanismos Lógicos de Inferencia:\n  1. **Inferencia Deductiva (De la regla general al caso particular):**\n     - Si el texto afirma una ley universal o generalidad, se infiere su cumplimiento inexorable en un caso particular mencionado.\n     - Texto: *«Todos los metales son conductores de electricidad. El tungsteno se utilizó en los filamentos de bombillas clásicas»*.\n     - Inferencia válida: *El tungsteno es un conductor de electricidad*.\n  2. **Inferencia Inductiva (De indicios particulares a una pauta general):**\n     - Se integran varias observaciones empíricas aisladas para inferir una tendencia, motivación o conclusión englobante.\n\n• Formulación Canónica de Preguntas UNSA:\n  - *«Del texto se deduce / se colige / se infiere / se desprende que...»*\n  - *«Se puede concluir lógicamente que...»*",
                conceptosClave = listOf(
                    "Inferencia: Conclusión implícita derivada necesariamente de las premisas del texto",
                    "Deducción textual: Aplicación de verdades generales a instancias particulares",
                    "Inducción textual: Generalización válida a partir de la suma de indicios explícitos",
                    "Rastro textual: Pista indispensable en el texto que fundamenta la inferencia"
                ),
                formulas = listOf(
                    "\\text{Inferencia Válida} = \\text{Premisas Explícitas del Texto} + \\text{Reglas de Deducción Lógica}",
                    "\\text{Condición}: \\; T \\vdash I \\quad \\land \\quad I \\notin T_{\\text{literal}} \\quad (\\text{Verdad Implícita})"
                ),
                formulaName = "Ley de Derivación Inferencial",
                formulaLatex = "I \\text{ es inferible de } T \\iff (T \\implies I) \\land (I \\text{ no es copia literal de } T)",
                formulaDescription = "Condición de necesidad deductiva y novedad no explícita.",
                admissionTip = "¡El error más común en preguntas inferenciales es marcar una opción que copia literalmente lo que dice el texto! Si está escrito con las mismas palabras en el texto, NO es inferencia, es un dato literal.",
                admissionExplanation = "• Los verbos 'se desprende', 'se colige' y 'se deduce' son sinónimos técnicos de 'se infiere'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Durante el periodo glacial pleistocénico, los ancestros de los camélidos sudamericanos cruzaron el puente terrestre de Beringia desde América del Norte hacia Eurasia y Sudamérica. Más tarde, los camélidos originarios de Norteamérica se extinguieron por completo». \nSe deduce necesariamente del texto que:",
                    options = listOf(
                        "En la actualidad no existen camélidos salvajes nativos en América del Norte.",
                        "Los camélidos sudamericanos surgieron exclusivamente en los Andes peruanos.",
                        "Beringia se encuentra congelada en el presente año.",
                        "Los camélidos euroasiáticos nunca llegaron a domesticarse.",
                        "La extinción de los camélidos fue provocada por cazadores humanos."
                    ),
                    correctIndex = 0,
                    explanation = "Si el texto afirma que 'los camélidos originarios de Norteamérica se extinguieron por completo', se deduce con rigor que hoy en día no subsisten camélidos nativos salvajes en dicho subcontinente.",
                    subject = "Comp. Lectora",
                    semana = 2
                ),
                Challenge(
                    id = "q_cl_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El paciente acudió a consulta médica con una saturación de oxígeno del 82% y estertores crepitantes bilaterales en los pulmones. Tras la auscultación, el médico ordenó de inmediato su traslado a la unidad de cuidados intensivos y ventilación asistida». \nSe infiere del texto que el estado del paciente era:",
                    options = listOf(
                        "Leve y apto para tratamiento ambulatorio en su domicilio.",
                        "De suma gravedad con inminente compromiso vital respiratorio.",
                        "Infectado por una dolencia exclusivamente gástrica.",
                        "Completamente asintomático y saludable.",
                        "Un caso rutinario de chequeo anual preventivo."
                    ),
                    correctIndex = 1,
                    explanation = "La combinación de saturación críticamente baja (82%), ruidos patológicos pulmonares y la orden inmediata de UCI con ventilación asistida permite inferir de forma incontrovertible una extrema gravedad con compromiso vital.",
                    subject = "Comp. Lectora",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "cl_t02_s02",
            subjectId = "comprension_lectora",
            semana = 2,
            subtema = "2.2 Tipología de Inferencias: Prospectiva, Causal y Taxonómica",
            title = "Clasificación de Inferencias en Comprensión Lectora",
            theory = LessonTheory(
                id = "th_cl_t02_s02",
                asignatura = "Comp. Lectora",
                semana = 2,
                titulo = "Tipología de Inferencias Textuales",
                resumen = "• Clasificación de las Inferencias según su Dirección Lógica:\n  1. **Inferencia Prospectiva (Proyección hacia el futuro o desenlace):**\n     - Consiste en deducir lo que ocurrirá lógicamente a continuación a partir de los antecedentes expuestos en el relato o informe.\n     - Ejemplo: Si el texto expone que una represa sobrepasó su capacidad máxima y las grietas en el muro de contención se ensanchan a cada hora, se infiere prospectivamente que **la presa colapsará e inundará el valle inferior**.\n  2. **Inferencia Retrospectiva o Causal (Deducción del origen o motivo):**\n     - Consiste en deducir la causa que originó un estado o hecho observable que el autor no explicitó directamente.\n     - Ejemplo: Al hallar ceniza volcánica compactada en estratos geológicos antiguos, se infiere retrospectivamente **una erupción violenta en épocas pretéritas**.\n  3. **Inferencia Taxonómica o Categorial:**\n     - Permite clasificar una entidad descrita dentro de una categoría o especie científica basándose en sus propiedades anatómicas o funcionales.\n     - Ejemplo: Si un fósil presenta plumas, pico desdentado, alas y huesos neumáticos, se infiere taxonómicamente que **se trata de un ave**.\n  4. **Inferencia de Intencionalidad o Actitud:**\n     - Deducir la verdadera postura ideológica del autor a través de su selección léxica.",
                conceptosClave = listOf(
                    "Inferencia prospectiva: Anticipación lógica de desenlaces o consecuencias futuras",
                    "Inferencia retrospectiva: Reconstrucción de la causa originaria de un fenómeno presente",
                    "Inferencia taxonómica: Clasificación de una entidad a partir de sus rasgos distintivos",
                    "Coherencia causal: La inferencia debe articularse sin quiebres con la evidencia previa"
                ),
                formulas = listOf(
                    "\\text{Prospectiva}: \\; \\text{Estado}(t_0) + \\text{Dinámica} \\implies \\text{Desenlace}(t_1)",
                    "\\text{Retrospectiva}: \\; \\text{Efecto Observable}(t_0) \\implies \\text{Causa Previa}(t_{-1})",
                    "\\text{Taxonómica}: \\; \\text{Propiedades}(x) \\subseteq \\text{Rasgos}(K) \\implies x \\in K"
                ),
                formulaName = "Direccionalidad Inferencial",
                formulaLatex = "\\text{Inferencia} = \\begin{cases} \\text{Prospectiva} & (t_0 \\to t_1) \\\\ \\text{Retrospectiva} & (t_0 \\to t_{-1}) \\\\ \\text{Taxonómica} & (x \\in \\text{Clase } K) \\end{cases}",
                formulaDescription = "Modelización temporal y categorial de la inferencia en lectura crítica.",
                admissionTip = "En inferencias causales, comprueba que la causa deducida sea la más directa y natural. No inventes conspiraciones ni sucesos fantásticos si una explicación física simple satisface las premisas.",
                admissionExplanation = "• Las inferencias prospectivas evalúan tu capacidad de previsión ante tendencias matemáticas o científicas descritas en el texto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Los arqueólogos descubrieron en las capas más profundas de Caral una serie de flautas tubulares fabricadas exclusivamente con huesos de ala de pelícano y cóndor, decoradas con incisiones de serpientes y monos». \nSe infiere taxonómica y geográficamente del texto que:",
                    options = listOf(
                        "Los habitantes de Caral desconocían la música ceremonial.",
                        "Existían redes de intercambio comercial o desplazamiento entre la costa y la selva amazónica.",
                        "El cóndor es un ave marina nativa del litoral pacífico.",
                        "Caral fue fundada por exploradores europeos en el siglo XVI.",
                        "Las flautas eran armas de guerra utilizadas para cazar pelícanos."
                    ),
                    correctIndex = 1,
                    explanation = "La presencia de huesos de pelícano (costa) decorados con motivos de monos (fauna amazónica) en Caral permite inferir necesariamente la existencia de contacto, desplazamiento o intercambio entre el litoral costero y las regiones selváticas.",
                    subject = "Comp. Lectora",
                    semana = 2
                ),
                Challenge(
                    id = "q_cl_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «A pesar de las continuas advertencias de los vulcanólogos sobre la reactivación del domo de lava, las autoridades municipales autorizaron la urbanización de las faldas bajas del volcán». \n¿Qué inferencia prospectiva se desprende de esta situación?",
                    options = listOf(
                        "El volcán se apagará para siempre gracias a las nuevas casas.",
                        "Ante una eventual erupción volcánica, la población urbana asentada sufrirá graves catástrofes humanas y materiales.",
                        "Los vulcanólogos serán despedidos por emitir alertas falsas.",
                        "Las viviendas urbanizadas actuarán como barrera para detener la lava.",
                        "El domo de lava descenderá pacíficamente por los desagües de la ciudad."
                    ),
                    correctIndex = 1,
                    explanation = "Construir sobre las faldas de un volcán en reactivación conduce prospectivamente al riesgo inminente de severas pérdidas humanas y desastres materiales en caso de erupción.",
                    subject = "Comp. Lectora",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "cl_t02_s03",
            subjectId = "comprension_lectora",
            semana = 2,
            subtema = "2.3 Extrapolación Textual: Cognitiva, Condicional y Opositiva",
            title = "Extrapolación Textual: Escenarios Hipotéticos y Nuevos Marcos",
            theory = LessonTheory(
                id = "th_cl_t02_s03",
                asignatura = "Comp. Lectora",
                semana = 2,
                titulo = "La Extrapolación Textual",
                resumen = "• La Extrapolación Textual (Nivel Superior de Comprensión):\n  - Consiste en transferir las ideas del texto a un escenario hipotético nuevo o plantear la inversión de una de las premisas fundamentales del autor para deducir qué desenlace se produciría.\n  - Exige un dominio absoluto de la lógica interna del texto para predecir cómo se comportaría la teoría ante condiciones modificadas.\n\n• Tipos de Extrapolación en Admisión:\n  1. **Extrapolación Condicional u Opositiva (Cambio contrafáctico de premisa):**\n     - Se altera o invierte una condición esencial del texto mediante la fórmula *«Si hubiera ocurrido X en lugar de Y...»*.\n     - Ejemplo: Si el texto explica que la penicilina salvó millones de vidas en la Segunda Guerra Mundial, la pregunta formula: *«Si Fleming no hubiera descubierto la penicilina, probablemente...»* $\\to$ *«Las infecciones bacterianas habrían causado una mortandad infinitamente mayor en los frentes de combate»*.\n  2. **Extrapolación Cognitiva o de Dominio (Transferencia a otra disciplina):**\n     - Aplicar los principios descubiertos en un campo a otra realidad análoga.\n     - Ejemplo: Extrapolar la teoría de la selección natural de Darwin a la competencia entre empresas en el mercado económico capitalista.",
                conceptosClave = listOf(
                    "Extrapolación: Razonamiento contrafáctico sobre escenarios hipotéticos alternativos",
                    "Inversión de premisa: Modificación deliberada de un hecho fundacional del texto",
                    "Transferencia de dominio: Aplicación de leyes de una ciencia a un campo análogo",
                    "Coherencia contrafáctica: El desenlace hipotético debe derivar de las leyes del texto"
                ),
                formulas = listOf(
                    "\\text{Extrapolación Opositiva}: \\; T \\vdash (A \\implies B) \\implies (\\neg A \\implies \\neg B \\lor C)",
                    "\\text{Condicional Contrafáctico}: \\; \\text{Si } P_{\\text{opuesto}} \\implies \\text{Efecto Modificado}"
                ),
                formulaName = "Operador de Extrapolación Contrafáctica",
                formulaLatex = "\\text{Extrapolar}(T, \\neg p) = \\{q \\mid (T \\setminus \\{p\\}) \\cup \\{\\neg p\\} \\vdash q\\}",
                formulaDescription = "Deducción de consecuencias lógicas en un mundo posible contrafáctico.",
                admissionTip = "La pregunta de extrapolación siempre comienza con un condicional: 'Si...', 'En el supuesto de que...', 'Si se demostrara que...'. Para resolverla, invierte la causa original del texto y busca su consecuencia lógica contraria.",
                admissionExplanation = "• No te limites a lo que ocurrió en la historia real: limítate al marco condicional que te impone la pregunta hipotética."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El descubrimiento de la estructura en doble hélice del ADN por Watson, Crick y Rosalind Franklin en 1953 permitió descifrar el código genético e impulsó el nacimiento de la biotecnología moderna y la terapia génica». \nSi los investigadores no hubieran descubierto la estructura molecular del ADN en la década de 1950, probablemente:",
                    options = listOf(
                        "La química orgánica habría dejado de existir para siempre.",
                        "El desarrollo de terapias génicas y edición molecular se habría retrasado sustancialmente en la historia médica.",
                        "Las bacterias no habrían podido reproducirse en el siglo XX.",
                        "Los seres vivos habrían modificado su material hereditario espontáneamente.",
                        "La medicina del siglo XX habría erradicado todas las enfermedades humanas."
                    ),
                    correctIndex = 1,
                    explanation = "Si el descubrimiento fue el motor que impulsó el nacimiento de la terapia génica y biotecnología moderna, la anulación contrafáctica de dicho hallazgo habría postergado o retrasado significativamente tales avances médicos.",
                    subject = "Comp. Lectora",
                    semana = 2
                ),
                Challenge(
                    id = "q_cl_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Los árboles de queñua protegen las cuencas altoandinas reteniendo el agua de lluvia y regulando el caudal de los ríos que abastecen a la ciudad de Arequipa». \nSi se talaran indiscriminadamente todos los bosques de queñua en las cabeceras de cuenca:",
                    options = listOf(
                        "El agua potable en Arequipa aumentaría ilimitadamente.",
                        "Se alteraría negativamente el régimen hídrico y se agravaría la escasez de agua en temporadas secas.",
                        "Las lluvias en la cordillera desaparecerían por completo de la atmósfera.",
                        "El río Chili se secaría en menos de veinticuatro horas de forma irreversible.",
                        "La temperatura del volcán Misti descendería al cero absoluto."
                    ),
                    correctIndex = 1,
                    explanation = "Dado que la queñua cumple la función hidrológica de retener agua y regular el caudal, su tala total causaría lógicamente un grave desequilibrio hídrico y sequías estacionales agudas en la ciudad.",
                    subject = "Comp. Lectora",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "cl_t02_s04",
            subjectId = "comprension_lectora",
            semana = 2,
            subtema = "2.4 Distractores en Inferencia: La Sobreinterpretación y la Especulación",
            title = "Trampas en la Inferencia: Sobreinterpretación y Juicios Ajenos",
            theory = LessonTheory(
                id = "th_cl_t02_s04",
                asignatura = "Comp. Lectora",
                semana = 2,
                titulo = "Distractores en Preguntas Inferenciales",
                resumen = "• Trampas Frecuentes en el Nivel Inferencial:\n  - La inferencia es el terreno favorito de los exámenes de admisión para colocar distractores sutiles que atrapen al postulante intuitivo.\n\n• Los Tres Grandes Errores Inferenciales:\n  1. **La Sobreinterpretación (Extrapolación Desmedida):**\n     - Consiste en llevar una deducción legítima mucho más allá de lo que las premisas del texto autorizan lógicamente.\n     - Si el texto dice: *«El fármaco redujo el dolor articular en un grupo de ancianos»*, sobreinterpretar sería marcar: *«El fármaco rejuvenece integralmente el cuerpo humano»*.\n  2. **La Especulación Subjetiva (Fantasía del lector):**\n     - Marcar una opción que resulta simpática, deseable o plausible en la vida cotidiana, pero que carece por completo de anclaje probatorio en el texto.\n  3. **La Falsa Inferencia Literal:**\n     - Elegir una alternativa que no es una inferencia, sino una repetición textual literal de lo que ya estaba escrito de forma explícita.",
                conceptosClave = listOf(
                    "Sobreinterpretación: Exceso inductivo que rebasa los límites lógicos de las premisas",
                    "Especulación: Afirmación verosímil pero carente de sustento en las pistas textuales",
                    "Falso inferencial literal: Opción explícita que no entraña proceso deductivo",
                    "Control de evidencia: Toda inferencia válida debe resistir la prueba del rastro textual"
                ),
                formulas = listOf(
                    "\\text{Sobreinterpretación} = I_{\\text{válida}} + \\text{Exceso Especulativo} \\implies \\text{Falsa}",
                    "\\text{Falso Inferencial} = P \\in T_{\\text{literal}} \\implies \\text{No es Inferencia (es Dato Literal)}"
                ),
                formulaName = "Filtro de Contención Inferencial",
                formulaLatex = "\\text{Inferencia Válida} \\iff T \\vdash I \\; \\land \\; I \\notin T_{\\text{explícito}} \\; \\land \\; \\neg \\text{Sobreinterpretación}(I)",
                formulaDescription = "Condiciones de validez estricta para respuestas de nivel inferencial.",
                admissionTip = "Comprueba si la opción deduce un hecho o si está 'adivinando intenciones'. Si la alternativa afirma cosas sobre los sentimientos secretos del autor o generaliza al mundo entero sin pruebas, ¡es una sobreinterpretación!",
                admissionExplanation = "• Una deducción válida es sobria, mesurada y matemáticamente congruente con los datos del párrafo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Un estudio universitario comprobó que los estudiantes que duermen menos de seis horas diarias obtienen calificaciones un 15% menores en los exámenes de razonamiento matemático». \n¿Cuál de las siguientes afirmaciones constituye una SOBREINTERPRETACIÓN inválida?",
                    options = listOf(
                        "El descanso nocturno influye en el rendimiento cognitivo matemático.",
                        "Dormir poco puede mermar la capacidad de concentración en pruebas complejas.",
                        "Cualquier estudiante que duerma diez horas diarias ingresará automáticamente en el primer puesto a la universidad.",
                        "El sueño insuficiente guarda correlación estadística con menores puntajes en matemática.",
                        "Los estudiantes evaluados que durmieron más de seis horas lograron mejores promedios en esa materia."
                    ),
                    correctIndex = 2,
                    explanation = "Afirmar que dormir diez horas garantiza automáticamente el primer puesto de ingreso es una sobreinterpretación absurda y desmedida: el texto solo constata una merma del 15% asociada al déficit de sueño, no una garantía de éxito académico total.",
                    subject = "Comp. Lectora",
                    semana = 2
                ),
                Challenge(
                    id = "q_cl_t02_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si una pregunta de examen dice: «Del segundo párrafo se infiere que...», ¿por qué razón debe descartarse una alternativa que cite textualmente las mismas palabras del autor?",
                    options = listOf(
                        "Porque es una falsedad científica.",
                        "Porque reproducir información explícita no constituye un acto de deducción inferencial sino de mera retención literal.",
                        "Porque las citas textuales están prohibidas en los exámenes.",
                        "Porque el autor utilizó figuras retóricas.",
                        "Porque las palabras del autor siempre contienen errores sintácticos."
                    ),
                    correctIndex = 1,
                    explanation = "Una inferencia exige un proceso cognoscitivo de deducción lógica a partir de premisas implícitas; si la opción copia lo que ya estaba dicho de forma explícita, se trata de una respuesta literal y no de una inferencia.",
                    subject = "Comp. Lectora",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: COMPRENSIÓN GLOBAL (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "cl_t03_s01",
            subjectId = "comprension_lectora",
            semana = 3,
            subtema = "3.1 Determinación del Tema Central y Eje Monográfico",
            title = "Comprensión Global: Determinación del Tema Central",
            theory = LessonTheory(
                id = "th_cl_t03_s01",
                asignatura = "Comp. Lectora",
                semana = 3,
                titulo = "El Tema Central y la Macroestructura",
                resumen = "• El Tema Central (Asunto Nuclear del Texto):\n  - Es el asunto general o motivo monográfico en torno al cual giran todas las oraciones del texto.\n  - Se expresa invariablemente mediante una **FRASE NOMINAL** (sin verbo conjugado) neutra, objetiva y precisa.\n  - Pregunta clave para hallarlo: *¿De qué o de quién trata el texto?*\n\n• Diferencias Cruciales para Admisión:\n  1. **El Tema:** Frase nominal descriptiva y abstracta (*«La fotosíntesis en las plantas acuáticas»*).\n  2. **La Idea Principal:** Oración completa bimembre que afirma o niega una tesis sobre el tema (*«La fotosíntesis en las plantas acuáticas depende fundamentalmente de la penetración de luz ultravioleta»*).\n  3. **El Título:** Frase nominal atractiva que incluye el tema central y su delimitación o aspecto específico (*«Importancia y fases de la fotosíntesis en las plantas acuáticas»*).\n\n• Regla de Cobertura Macroestructural:\n  - El tema central debe abarcar la **totalidad** del texto; no puede ser demasiado estrecho (enfocado solo en un párrafo secundario) ni excesivamente amplio y genérico.",
                conceptosClave = listOf(
                    "Tema central: Eje monográfico expresado mediante una frase nominal sin verbo conjugado",
                    "Pregunta orientadora: ¿De qué asunto trata globalmente la lectura?",
                    "Cobertura macroestructural: Abarca el texto en su totalidad sin exclusiones ni excesos",
                    "Diferenciación con idea principal: El tema plantea el asunto; la idea principal emite un juicio"
                ),
                formulas = listOf(
                    "\\text{Tema Central} = \\text{Frase Nominal Neutra} \\quad (\\text{Sin Verbo Conjugado})",
                    "\\text{Tema} = \\text{Sujeto Temático Global del Párrafo}",
                    "\\text{Cobertura}: \\; \\text{Texto} = \\bigcup_{i=1}^n \\text{Párrafo}_i \\implies \\text{Tema} = \\bigcap_{i=1}^n \\text{Asunto}(P_i)"
                ),
                formulaName = "Fórmula del Eje Monográfico",
                formulaLatex = "\\text{Tema}(T) = \\arg\\max_A \\left[ \\text{Cobertura}(A, T) \\cdot \\text{Especificidad}(A, T) \\right]",
                formulaDescription = "Punto de equilibrio óptimo entre cobertura total del texto y especificidad conceptual.",
                admissionTip = "Si una alternativa tiene verbo conjugado, ¡esa NO es el tema! El tema es siempre una frase nominal (ejemplo: 'La evolución de los cetáceos', no 'Los cetáceos evolucionaron').",
                admissionExplanation = "• Descarta alternativas que solo traten de un detalle del primer o segundo párrafo: el tema central debe abrazar todo el texto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El grafeno, una lámina de átomos de carbono de un átomo de espesor, exhibe propiedades asombrosas: es doscientas veces más resistente que el acero, excelente conductor térmico y sumamente flexible. Estas características han revolucionado la ingeniería electrónica y prometen transformar la fabricación de baterías ultrarrápidas y dispositivos biomédicos». \n¿Cuál es el TEMA CENTRAL del texto?",
                    options = listOf(
                        "El acero y sus aplicaciones industriales en la historia moderna",
                        "Las propiedades físicas extraordinarias del grafeno y su potencial tecnológico",
                        "El grafeno supera al acero en resistencia y tenacidad",
                        "La fabricación de baterías para teléfonos móviles inteligentes",
                        "Los dispositivos biomédicos utilizados en hospitales"
                    ),
                    correctIndex = 1,
                    explanation = "El tema central abarca todo el texto formulado como frase nominal: las propiedades físicas extraordinarias del grafeno y su prometedor impacto tecnológico. La opción (C) es una idea principal (oración con verbo), y las demás son detalles accesorios.",
                    subject = "Comp. Lectora",
                    semana = 3
                ),
                Challenge(
                    id = "q_cl_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes alternativas está formulada correctamente como TEMA de un texto?",
                    options = listOf(
                        "La deforestación destruye los ecosistemas tropicales rápidamente",
                        "Impacto ecológico de la deforestación en los bosques tropicales",
                        "¿Por qué se talan los árboles en la Amazonía?",
                        "Los bosques tropicales albergan miles de especies en peligro",
                        "Debemos reforestar las cuencas de los ríos peruanos"
                    ),
                    correctIndex = 1,
                    explanation = "El tema debe expresarse formalmente como una frase nominal sintética sin verbo conjugado: 'Impacto ecológico de la deforestación en los bosques tropicales'. Las demás son oraciones declarativas, preguntas o exhortaciones.",
                    subject = "Comp. Lectora",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "cl_t03_s02",
            subjectId = "comprension_lectora",
            semana = 3,
            subtema = "3.2 Identificación de la Idea Principal (Tesis Textual)",
            title = "Identificación de la Idea Principal y Jerarquía Textual",
            theory = LessonTheory(
                id = "th_cl_t03_s02",
                asignatura = "Comp. Lectora",
                semana = 3,
                titulo = "La Idea Principal y su Jerarquía",
                resumen = "• La Idea Principal (Macroproposición Textual):\n  - Es la proposición más importante que condensa la tesis central o el mensaje sustantivo del autor sobre el tema.\n  - Se estructura obligatoriamente como una **ORACIÓN GRAMATICAL COMPLETA** (con sujeto y verbo conjugado).\n  - Si se suprime la idea principal, el resto del texto pierde coherencia y queda desarticulado.\n\n• Ideas Secundarias:\n  - Enunciados subordinados que cumplen funciones de ejemplificación, detalle, explicación, fundamentación causal o comparación para dar soporte a la idea principal.\n\n• Protocolo para Identificar la Idea Principal:\n  1. Primero halla el **Tema** (*¿De qué trata el texto?*).\n  2. Pregúntate: *¿Qué es lo más importante que el autor sostiene o afirma sobre ese tema?*\n  3. Aplica la **prueba de supresión**: Elimina mentalmente la oración candidata. Si los demás párrafos quedan vacíos de sentido, ¡has localizado la idea principal!",
                conceptosClave = listOf(
                    "Idea principal: Proposición nuclear estructurada como oración bimembre completa",
                    "Prueba de supresión: Al eliminar la idea principal, el texto pierde su sentido rector",
                    "Ideas secundarias: Argumentos, datos, ejemplos o especificaciones subordinadas",
                    "Condensación: La idea principal sintetiza la macroestructura global del escrito"
                ),
                formulas = listOf(
                    "\\text{Idea Principal} = \\text{Tema Central} + \\text{Juicio Predicativo o Tesis Central}",
                    "\\text{Texto} = \\text{Idea Principal} + \\sum_{i=1}^k \\text{Ideas Secundarias}_i"
                ),
                formulaName = "Ecuación de la Macroproposición Nuclear",
                formulaLatex = "\\text{IP} = S(\\text{Tema}) + V_{\\text{conjugado}} + \\text{Predicado}_{\\text{tesis}}",
                formulaDescription = "Estructura oracional obligatoria de la idea principal.",
                admissionTip = "Si la pregunta pide 'La idea principal', ¡descarta de inmediato cualquier alternativa que sea una frase nominal sin verbo! La idea principal DEBE ser una oración completa.",
                admissionExplanation = "• Recuerda que en textos analizantes la idea principal está al inicio; en textos sintetizantes, al final."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El descubrimiento del sillar blanco en las canteras de Arequipa no solo transformó la arquitectura colonial, sino que confirió a la ciudad una identidad estética única en el continente. Los alarifes mestizos aprendieron a tallar la ignimbrita volcánica con destreza asombrosa, levantando templos, claustros y casonas que han resistido terremotos devastadores a lo largo de cuatro siglos». \n¿Cuál es la IDEA PRINCIPAL del texto?",
                    options = listOf(
                        "La ignimbrita volcánica y sus características geológicas.",
                        "El sillar transformó la arquitectura arequipeña dotándola de una identidad estética y resistencia sísmica perdurable.",
                        "Los alarifes mestizos tallaron templos en el siglo XVII.",
                        "Arequipa ha soportado terremotos devastadores.",
                        "Las canteras de Añashuayco en la época colonial."
                    ),
                    correctIndex = 1,
                    explanation = "La opción (B) es una oración completa que sintetiza de forma armónica el tema (el sillar) y el juicio central del autor: su papel transformador en la arquitectura, identidad y resistencia sísmica histórica de la ciudad.",
                    subject = "Comp. Lectora",
                    semana = 3
                ),
                Challenge(
                    id = "q_cl_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la arquitectura de un texto expositivo, las ideas secundarias tienen como función primordial:",
                    options = listOf(
                        "Contradecir la tesis postulada por el autor.",
                        "Sustentar, ejemplificar y detallar el contenido de la idea principal.",
                        "Reemplazar por completo al tema central.",
                        "Desviar la atención hacia temas anecdóticos.",
                        "Servir de título comercial al artículo."
                    ),
                    correctIndex = 1,
                    explanation = "Las ideas secundarias dependen jerárquicamente de la idea principal y su propósito es argumentar, ilustrar, ejemplificar y detallar el núcleo informativo.",
                    subject = "Comp. Lectora",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "cl_t03_s03",
            subjectId = "comprension_lectora",
            semana = 3,
            subtema = "3.3 El Mejor Título para el Texto: Concisión y Cobertura",
            title = "El Mejor Título: Equilibrio entre Síntesis y Precisión",
            theory = LessonTheory(
                id = "th_cl_t03_s03",
                asignatura = "Comp. Lectora",
                semana = 3,
                titulo = "Determinación del Mejor Título",
                resumen = "• El Mejor Título de un Texto Académico:\n  - Es la frase nominal más adecuada, atractiva y concisa que resume con exactitud el tema central y su enfoque particular.\n  - Un buen título debe actuar como la 'tarjeta de presentación' de la lectura.\n\n• Requisitos de un Título Válido en Exámenes UNSA:\n  1. **Concisión:** No debe ser un párrafo ni una oración farragosa (habitualmente de 4 a 8 palabras).\n  2. **Frase Nominal:** Se formula sin verbo principal conjugado (*«Etiología y prevención de la diabetes mellitus»*).\n  3. **Cobertura Integral:** No debe pecar por defecto (enfocarse en un solo aspecto aislado) ni por exceso (abarcar más de lo que el autor trató).\n  4. **Inclusión del Enfoque Específico:** Debe contener el tema y el aspecto particular analizado (*Tema: La vicuña* + *Aspecto: Métodos incaicos de conservación* $\\to$ Título: *«La conservación de la vicuña en el Tahuantinsuyo»*).",
                conceptosClave = listOf(
                    "Mejor título: Frase nominal condensada que identifica el tema y su delimitación",
                    "Regla del no exceso: No titular sobre toda la astronomía si el texto habla solo de Marte",
                    "Regla del no defecto: No titular sobre una bacteria si el texto trata de toda la flora intestinal",
                    "Atractivo formal: Brevedad y rigor académico sin caer en el sensacionalismo"
                ),
                formulas = listOf(
                    "\\text{Mejor Título} = \\text{Tema Central} + \\text{Aspecto Específico o Delimitación}",
                    "\\text{Fórmula}: \\; \\text{Título} = \\text{Frase Nominal (Sin Verbo)}"
                ),
                formulaName = "Algoritmo de Titulación Académica",
                formulaLatex = "\\text{Título}^*(T) = \\arg\\max_t \\left[ \\text{Exactitud}(t, \\text{Tema}) - \\lambda \\cdot \\text{Longitud}(t) \\right]",
                formulaDescription = "Optimización entre precisión semántica monográfica y economía expresiva.",
                admissionTip = "Prueba de los extremos para títulos: Si una opción dice 'Los planetas' (demasiado amplia) y otra dice 'La gravedad en Júpiter' (demasiado estrecha), elige la intermedia equilibrada: 'Características físicas del planeta Júpiter'.",
                admissionExplanation = "• El título sintetiza el tema y el ángulo de tratamiento que le dio el autor."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El deshielo acelerado de los glaciares en la Cordillera Blanca debido al calentamiento global amenaza el abastecimiento de agua dulce en la costa peruana. Diversos modelos climáticos pronostican que para el año 2040 las reservas hídricas estivales se reducirán en un 50%, lo que exige la urgente construcción de represas y sistemas de desalinización marina». \n¿Cuál es el MEJOR TÍTULO para la lectura?",
                    options = listOf(
                        "El calentamiento global y sus consecuencias en el planeta Tierra",
                        "Impacto del deshielo en la Cordillera Blanca sobre el abastecimiento hídrico en el Perú",
                        "Los glaciares más hermosos del mundo andino",
                        "La construcción de plantas desalinizadoras en la costa de Lima",
                        "Las reservas de agua dulce en el siglo XXI"
                    ),
                    correctIndex = 1,
                    explanation = "La opción (B) sintetiza a la perfección el tema (deshielo en la Cordillera Blanca) y su delimitación causal específica (impacto sobre el abastecimiento de agua en el Perú), respetando el formato de frase nominal equilibrada.",
                    subject = "Comp. Lectora",
                    semana = 3
                ),
                Challenge(
                    id = "q_cl_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un título que solo recoge un dato anecdótico citado en las dos últimas líneas del texto peca del error de:",
                    options = listOf(
                        "Generalización indebida",
                        "Restricción excesiva o defecto de cobertura",
                        "Anfibología léxica",
                        "Incompatibilidad temporal",
                        "Pleonasmo estilístico"
                    ),
                    correctIndex = 1,
                    explanation = "Peca de restricción excesiva o defecto de cobertura, ya que no representa la totalidad de la macroestructura del texto, sino únicamente un fragmento secundario marginal.",
                    subject = "Comp. Lectora",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "cl_t03_s04",
            subjectId = "comprension_lectora",
            semana = 3,
            subtema = "3.4 Tipología de Párrafos: Analizante, Sintetizante, Encuadrado y Paralelo",
            title = "Estructura del Párrafo: Analizante, Sintetizante y Encuadrado",
            theory = LessonTheory(
                id = "th_cl_t03_s04",
                asignatura = "Comp. Lectora",
                semana = 3,
                titulo = "Tipología de Párrafos según la Idea Principal",
                resumen = "• Clasificación de Párrafos y Textos según la Ubicación de la Idea Principal:\n  1. **Texto o Párrafo Analizante (Deductivo):**\n     - La **Idea Principal se ubica al INICIO** del texto.\n     - Luego, los enunciados siguientes desarrollan, explican o ejemplifican dicha tesis mediante ideas secundarias.\n     - Esquema: $[\\mathbf{IP}] \\to [IS_1] \\to [IS_2] \\to [IS_3]$.\n  2. **Texto o Párrafo Sintetizante (Inductivo):**\n     - Inicia con explicaciones, datos, evidencias o casos particulares secundarios.\n     - La **Idea Principal se ubica al FINAL**, como conclusión o síntesis definitiva.\n     - Esquema: $[IS_1] \\to [IS_2] \\to [IS_3] \\to [\\mathbf{IP}]$.\n  3. **Texto o Párrafo Encuadrado (Analizante-Sintetizante):**\n     - Plantea la Idea Principal al inicio, la desglosa con argumentos y detalles en el centro, y al cierre **vuelve a formular la Idea Principal** con otras palabras a modo de conclusión reforzada.\n     - Esquema: $[\\mathbf{IP}] \\to [IS_1] \\to [IS_2] \\to [\\mathbf{IP}']$.\n  4. **Texto o Párrafo Paralelo:**\n     - Todas las ideas tienen el mismo nivel jerárquico; ninguna sobresale como rectora.\n     - La Idea Principal no está explícita en ninguna línea particular y debe ser elaborada e inferida por el lector mediante síntesis inductiva.",
                conceptosClave = listOf(
                    "Párrafo analizante: Idea principal explícita al principio del texto (deductivo)",
                    "Párrafo sintetizante: Idea principal explícita al final del texto a modo de cierre",
                    "Párrafo encuadrado: Idea principal al inicio y reiterada en la conclusión",
                    "Párrafo paralelo: Ideas de idéntico rango; la idea principal es implícita"
                ),
                formulas = listOf(
                    "\\text{Analizante}: \\; \\mathbf{IP} \\to IS_1 \\to IS_2 \\to IS_3",
                    "\\text{Sintetizante}: \\; IS_1 \\to IS_2 \\to IS_3 \\to \\mathbf{IP}",
                    "\\text{Encuadrado}: \\; \\mathbf{IP} \\to IS_1 \\to IS_2 \\to \\mathbf{IP}_{\\text{conclusión}}"
                ),
                formulaName = "Topología de la Idea Principal",
                formulaLatex = "\\text{Tipo} = \\begin{cases} \\text{Analizante} & \\text{si } \\arg\\max(\\text{Jerarquía}) = 1 \\\\ \\text{Sintetizante} & \\text{si } \\arg\\max(\\text{Jerarquía}) = n \\\\ \\text{Encuadrado} & \\text{si } \\{1, n\\} \\subset \\text{Núcleos} \\\\ \\text{Paralelo} & \\text{si } \\forall i, \\text{Jerarquía}(i) = k \\end{cases}",
                formulaDescription = "Clasificación topológica de la jerarquía de oraciones en un texto.",
                admissionTip = "Para saber el tipo de texto, lee con cuidado la primera y la última oración: si la primera afirma la tesis contundente, es analizante; si la tesis conclusiva está en la última oración, es sintetizante.",
                admissionExplanation = "• Si ambas oraciones dicen lo mismo con palabras distintas abrazando al texto, es encuadrado."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El ejercicio aeróbico regular es el método preventivo más eficaz contra el envejecimiento cardiovascular. Al bombear sangre con mayor vigor, las arterias preservan su elasticidad original, disminuye la presión arterial y se optimiza el intercambio de oxígeno en los tejidos. Asimismo, la liberación de endorfinas mitiga el estrés oxidativo celular». \nPor la ubicación de su idea principal, el texto es:",
                    options = listOf(
                        "Sintetizante",
                        "Analizante",
                        "Paralelo",
                        "Encuadrado",
                        "Alternante"
                    ),
                    correctIndex = 1,
                    explanation = "La idea principal y tesis rectora se formula en la primera línea («El ejercicio aeróbico regular es el método preventivo más eficaz...»), y los enunciados posteriores detallan los mecanismos biológicos secundarios que justifican la afirmación inicial; por ende, es un texto analizante.",
                    subject = "Comp. Lectora",
                    semana = 3
                ),
                Challenge(
                    id = "q_cl_t03_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un texto que inicia afirmando que «La inteligencia artificial revolucionará la medicina moderna», desarrolla ejemplos hospitalarios en el cuerpo central y concluye afirmando que «En suma, la tecnología artificial marcará un antes y un después en la atención sanitaria», corresponde a la estructura:",
                    options = listOf(
                        "Analizante",
                        "Sintetizante",
                        "Encuadrada",
                        "Paralela",
                        "Inductiva pura"
                    ),
                    correctIndex = 2,
                    explanation = "Al postular la idea principal en la introducción y reiterarla reforzada en la conclusión tras el desglose argumentativo, se configura con precisión la estructura encuadrada.",
                    subject = "Comp. Lectora",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: INTENCIÓN Y PROPÓSITO DEL TEXTO (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "cl_t04_s01",
            subjectId = "comprension_lectora",
            semana = 4,
            subtema = "4.1 El Propósito Comunicativo del Autor (Informar, Persuadir, Polemizar)",
            title = "Propósito Comunicativo e Intención del Autor",
            theory = LessonTheory(
                id = "th_cl_t04_s01",
                asignatura = "Comp. Lectora",
                semana = 4,
                titulo = "El Propósito Comunicativo del Texto",
                resumen = "• El Propósito Comunicativo (Intención Global del Autor):\n  - Todo texto es un acto intencional que busca provocar un efecto específico en el lector o en la comunidad de especialistas.\n  - En el examen se formula mediante preguntas orientadas al objetivo teleológico del texto.\n\n• Clasificación Canónica de Propósitos Comunicativos:\n  1. **Informar / Explicar / Describir (Textos Expositivos y Científicos):**\n     - Transmitir conocimientos objetivos sobre un fenómeno, descubrimiento o proceso histórico sin emitir juicios de valor ni buscar adhesión política.\n     - Verbos clave de alternativas: *dar a conocer, explicar, exponer, describir, pormenorizar*.\n  2. **Persuadir / Convencer / Exhortar (Textos Argumentativos y Ensayos):**\n     - Defender una postura polémica o inducir al lector a cambiar de opinión o actuar de determinado modo.\n     - Verbos clave: *persuadir, convencer, instar, exhortar, defender, fundamentar*.\n  3. **Polemizar / Refutar / Cuestionar (Textos Críticos y Dialécticos):**\n     - Desvirtuar o rebatir una tesis opuesta demostrando sus inconsistencias o falacias.\n     - Verbos clave: *refutar, cuestionar, impugnar, criticar, desmentir*.\n  4. **Conmover / Recrear (Textos Literarios y Humanísticos):**\n     - Despertar emociones estéticas, deleitar o sensibilizar sobre la condición humana.",
                conceptosClave = listOf(
                    "Propósito comunicativo: Meta o finalidad teleológica que persigue el autor con su escrito",
                    "Informar vs. Persuadir: Divulgación objetiva frente a defensa apasionada de una tesis",
                    "Polemizar: Rebatimiento deliberado de posturas asumidas por otros autores",
                    "Verbo rector de la opción: El infinitivo inicial define la intención pragmática"
                ),
                formulas = listOf(
                    "\\text{Propósito} = \\mathbf{Verbo \\ en \\ Infinitivo} + \\text{Tema Central} + \\text{Enfoque Específico}",
                    "\\text{Ejemplo}: \\; \\mathbf{Refutar} + \\text{la teoría del terraplanismo} + \\text{mediante pruebas ópticas}"
                ),
                formulaName = "Fórmula del Objetivo Discursivo",
                formulaLatex = "\\text{Intención}(T) = \\arg\\max_{\\iota \\in \\mathcal{I}} P(\\iota \\mid \\text{Léxico, Tono y Conectores de } T)",
                formulaDescription = "Identificación de la fuerza ilocutiva macroestructural del texto.",
                admissionTip = "Observa el primer verbo de cada alternativa (explicar, demostrar, refutar, sugerir): si el texto es puramente científico y neutral, descarta verbos como 'persuadir' o 'criticar'; elige 'explicar' o 'informar'.",
                admissionExplanation = "• Si el texto polemiza contra otra teoría, la opción correcta debe contener un verbo de confrontación dialéctica como 'cuestionar' o 'refutar'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Es inadmisible que las autoridades continúen postergando la descontaminación de la cuenca del río Chili. Mientras los informes técnicos alertan sobre niveles alarmantes de bacterias coliformes y metales, la inacción municipal condena a miles de agricultores y ciudadanos a graves riesgos sanitarios. Es urgente que el Ministerio del Ambiente intervenga de inmediato». \nEl propósito principal del autor es:",
                    options = listOf(
                        "Describir la composición química del río Chili en épocas de estiaje.",
                        "Denunciar la inacción de las autoridades y exigir la urgente intervención ambiental en el río Chili.",
                        "Elogiar los esfuerzos agrícolas en el valle de Arequipa.",
                        "Explicar la historia geológica de la cuenca del Chili.",
                        "Comparar los ríos de la costa con los de la Amazonía."
                    ),
                    correctIndex = 1,
                    explanation = "El texto utiliza un lenguaje enfático y valorativo ('es inadmisible', 'condena a miles de agricultores', 'es urgente') con la intención directa de denunciar y exigir medidas inmediatas al Estado, lo que define la opción (B).",
                    subject = "Comp. Lectora",
                    semana = 4
                ),
                Challenge(
                    id = "q_cl_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un artículo de divulgación que detalla paso a paso las fases del ciclo del nitrógeno sin emitir juicios de valor tiene como propósito predominante:",
                    options = listOf(
                        "Cuestionar",
                        "Persuadir",
                        "Informar",
                        "Ironizar",
                        "Criticar"
                    ),
                    correctIndex = 2,
                    explanation = "Al carecer de adjetivos valorativos y centrarse en la exposición objetiva de un proceso biológico, su propósito rector es meramente informativo o explicativo.",
                    subject = "Comp. Lectora",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "cl_t04_s02",
            subjectId = "comprension_lectora",
            semana = 4,
            subtema = "4.2 Tono del Texto y Postura Subjetiva del Emisor",
            title = "El Tono del Texto: Actitud y Matiz Subjetivo del Autor",
            theory = LessonTheory(
                id = "th_cl_t04_s02",
                asignatura = "Comp. Lectora",
                semana = 4,
                titulo = "El Tono y la Subjetividad Textual",
                resumen = "• El Tono del Texto (La Voz y el Ánimo del Autor):\n  - Revela la emoción, temple anímico o postura ética que el emisor adopta respecto a la materia que comunica.\n  - No se declara casi nunca explícitamente: se deduce del léxico valorativo (adjetivos, adverbios), signos expresivos y figuras retóricas empleadas.\n\n• Glosario de Tonos Recurrentes en Preguntas UNSA:\n  1. **Tono Irónico o Sarcástico:** El autor utiliza la burla fina o mordaz para ridiculizar una conducta o idea errónea.\n  2. **Tono Laudatorio o Encomiástico:** El texto ensalza, alaba o rinde homenaje ferviente a un personaje o acontecimiento histórico.\n  3. **Tono Escéptico o Dudoso:** Manifiesta desconfianza o reserva ante afirmaciones que carecen de demostración concluyente.\n  4. **Tono Moralista o Didáctico:** Busca instruir éticamente al lector mediante sentencias morales o consejos de conducta.\n  5. **Tono Beligerante o Polémico:** Agresivo, vehemente, dispuesto a la confrontación abierta.\n  6. **Tono Elegíaco o Melancólico:** Teñido de tristeza profunda, nostalgia o duelo por una pérdida irreparable.",
                conceptosClave = listOf(
                    "Tono del texto: Matiz emocional y valorativo de la voz discursiva",
                    "Adjetivación connotativa: Pista fundamental para desentrañar la actitud subjetiva",
                    "Sarcasmo e ironía: Burla mordaz implícita bajo una aparente seriedad",
                    "Ecuanimidad científica: Tono objetivo desprovisto de emotividad valorativa"
                ),
                formulas = listOf(
                    "\\text{Tono} = \\text{Actitud Dominante} \\quad (\\text{Crítico, Irónico, Laudatorio, Objetivo})",
                    "\\text{Detección}: \\; \\text{Subrayar Adjetivos de Juicio} \\to \\text{Interpolar Matiz Emotivo}"
                ),
                formulaName = "Vector de Carga Afectiva Discursiva",
                formulaLatex = "\\text{Tono} = \\text{Signo}\\left( \\sum \\text{Léxico}_{\\text{positivo}} - \\sum \\text{Léxico}_{\\text{negativo}} \\right) \\times \\text{Intensidad}",
                formulaDescription = "Orientación escalar de la carga emotiva en el análisis del discurso.",
                admissionTip = "Si el autor califica una postura como 'ridícula', 'descabellada' o 'absurda', el tono es crítico o mordaz. Si se limita a decir 'según los datos del censo', el tono es estrictamente neutral u objetivo.",
                admissionExplanation = "• No te confundas con el estado de ánimo de los personajes citados: la pregunta se refiere a la voz del AUTOR del texto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Fragmento: «¡Qué prodigio de la ciencia moderna! Una empresa nos promete la inmortalidad cibernética por la módica suma de medio millón de dólares, mientras en sus instalaciones ni siquiera son capaces de garantizar que sus servidores no colapsen los fines de semana». \nEl tono del autor es marcadamente:",
                    options = listOf(
                        "Admirativo y entusiasta",
                        "Irónico y mordaz",
                        "Triste y apesadumbrado",
                        "Neutro y desapasionado",
                        "Científico y objetivo"
                    ),
                    correctIndex = 1,
                    explanation = "El autor aparenta elogiar ('¡Qué prodigio de la ciencia moderna!') para luego burlarse de la incongruencia de la empresa que promete inmortalidad pero colapsa sus servidores, lo que constituye un tono puramente irónico y mordaz.",
                    subject = "Comp. Lectora",
                    semana = 4
                ),
                Challenge(
                    id = "q_cl_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Mariano Melgar encarnó el heroísmo más puro y desinteresado que recuerda la patria. Su lira juvenil templó los corazones arequipeños y su sangre derramada en Umachiri selló la aurora de nuestra libertad». \n¿Qué tono discursivo se aprecia en el fragmento?",
                    options = listOf(
                        "Crítico",
                        "Sarcástico",
                        "Laudatorio o encomiástico",
                        "Escéptico",
                        "Pesimista"
                    ),
                    correctIndex = 2,
                    explanation = "El texto ensalza las virtudes heroicas y poéticas de Mariano Melgar con adjetivos superlativos de admiración ('heroísmo más puro', 'sangre derramada selló la aurora'), lo que define al tono laudatorio o encomiástico (de alabanza).",
                    subject = "Comp. Lectora",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "cl_t04_s03",
            subjectId = "comprension_lectora",
            semana = 4,
            subtema = "4.3 El Destinatario y la Situación Comunicativa Pragmática",
            title = "El Destinatario, el Registro y el Contexto Pragmático",
            theory = LessonTheory(
                id = "th_cl_t04_s03",
                asignatura = "Comp. Lectora",
                semana = 4,
                titulo = "El Destinatario y el Contexto Pragmático",
                resumen = "• El Lector Modelo o Destinatario Ideal:\n  - Todo autor escribe configurando en su mente un perfil de lector (destinatario previsto), lo cual determina el léxico, la complejidad sintáctica y la densidad de explicaciones previas del texto.\n\n• Clasificación de Textos según el Destinatario:\n  1. **Texto Especializado (Para expertos):**\n     - Dirigido a la comunidad científica o académica de una disciplina.\n     - Abunda en tecnolectos y fórmulas sin explicaciones introductorias; presupone conocimientos previos sólidos (*artículos de investigación indexados, papers*).\n  2. **Texto Divulgativo (Para público general culto):**\n     - Dirigido a lectores no especialistas interesados en la ciencia, la historia o la cultura.\n     - Traduce conceptos complejos mediante analogías, ejemplos cotidianos y glosas pedagógicas (*revistas como National Geographic o suplementos dominicales*).\n  3. **Texto Académico-Formativo:**\n     - Dirigido a estudiantes universitarios o preuniversitarios (*manuales, tratados y prospectos*).\n\n• Preguntas de Admisión:\n  - *«Por su nivel de tratamiento léxico y temático, el texto está dirigido primordialmente a...»*",
                conceptosClave = listOf(
                    "Destinatario previsto: Perfil cognitivo y social del público objetivo del autor",
                    "Texto especializado: Exige marco teórico previo y lenguaje críptico o técnico",
                    "Texto de divulgación: Acerca la ciencia a la sociedad con claridad y metáforas",
                    "Registro lingüístico: Formal, culto, estándar o coloquial"
                ),
                formulas = listOf(
                    "\\text{Densidad Técnica Alta} + \\text{Cero Glosas} \\implies \\text{Lector Especialista}",
                    "\\text{Analogías Didácticas} + \\text{Definiciones Claras} \\implies \\text{Público General (Divulgación)}"
                ),
                formulaName = "Ecuación de Adecuación Pragmática",
                formulaLatex = "\\text{Destinatario} = f(\\text{Vocabulario Técnico}, \\; \\text{Densidad Conceptual}, \\; \\text{Supuestos Previos})",
                formulaDescription = "Deducción del público meta a partir de los marcadores estilísticos del texto.",
                admissionTip = "Si el texto explica qué significa cada término difícil con ejemplos y comparaciones sencillas, está dirigido al 'público general interesado en la ciencia' (divulgación). Si no explica los términos y usa jerga pura, va dirigido a 'especialistas'.",
                admissionExplanation = "• No confundas un texto infantil con uno de divulgación científica para adultos no expertos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Imaginemos que el núcleo atómico es como el sol en el centro de un vecindario diminuto, y los electrones son pequeños planetas que bailan a su alrededor en órbitas invisibles. Aunque esta analogía tiene límites, nos ayuda a comprender por qué la materia sólida está, en realidad, casi completamente vacía». \nPor su tono y recursos expositivos, el texto fue redactado para:",
                    options = listOf(
                        "Físicos teóricos especializados en mecánica cuántica.",
                        "Un público general o estudiantil interesado en la divulgación científica básica.",
                        "Filósofos medievales que estudian la metafísica.",
                        "Ingenieros nucleares que diseñan reactores de uranio.",
                        "Fabricantes industriales de microprocesadores."
                    ),
                    correctIndex = 1,
                    explanation = "El uso explícito de analogías pedagógicas familiares ('como el sol en el centro de un vecindario', 'pequeños planetas que bailan') evidencia un propósito formativo propio de la divulgación científica para público no especializado.",
                    subject = "Comp. Lectora",
                    semana = 4
                ),
                Challenge(
                    id = "q_cl_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un artículo médico plagado de siglas como ARNm, interferón gamma, apoptosis celular y que prescinde de toda definición básica se clasifica como:",
                    options = listOf(
                        "Texto narrativo infantil",
                        "Texto especializado para profesionales de la salud",
                        "Texto lírico alegórico",
                        "Crónica periodística de sucesos",
                        "Ensayo humorístico"
                    ),
                    correctIndex = 1,
                    explanation = "El empleo de tecnolectos rigurosos sin glosas introductorias confirma que el destinatario previsto es la comunidad médica o biomédica especializada.",
                    subject = "Comp. Lectora",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "cl_t04_s04",
            subjectId = "comprension_lectora",
            semana = 4,
            subtema = "4.4 Actos Ilocutivos en la Argumentación Textual",
            title = "Fuerza Ilocutiva y Estrategias Persuasivas",
            theory = LessonTheory(
                id = "th_cl_t04_s04",
                asignatura = "Comp. Lectora",
                semana = 4,
                titulo = "Fuerza Ilocutiva en la Argumentación",
                resumen = "• La Fuerza Ilocutiva en el Discurso Argumentativo:\n  - En los textos ensayísticos y de opinión, cada párrafo cumple una función ilocutiva precisa en la estrategia global de persuasión del autor.\n\n• Principales Funciones Ilocutivas del Discurso:\n  1. **Aseverar / Constatar:** Afirmar una realidad objetiva como punto de partida (*«Es un hecho incontrovertible que el sillar abunda en Arequipa»*).\n  2. **Conceder (Concesión retórica dialéctica):** Reconocer la validez parcial de un punto del oponente para ganar credibilidad antes de destruirlo (*«Es verdad que la energía solar requiere inversión inicial; sin embargo,...»*).\n  3. **Descalificar / Impugnar:** Restar legitimidad técnica o ética a los argumentos del bando contrario.\n  4. **Exhortar / Reclamar:** Llamar a la acción ética o cívica del lector al cierre del artículo (*«¡No podemos permanecer de brazos cruzados ante la destrucción de nuestro patrimonio!»*).\n\n• Análisis de la Dinámica Argumentativa:\n  - Comprender cómo el autor organiza sus movimientos dialécticos (concesión $\\to$ contraataque $\\to$ demostración $\\to$ exhortación final).",
                conceptosClave = listOf(
                    "Fuerza ilocutiva textual: Función pragmática de cada movimiento argumentativo",
                    "Concesión dialéctica: Aceptar un hecho menor del rival para afianzar la propia refutación",
                    "Estrategia persuasiva: Disposición calculada de argumentos lógicos y emocionales",
                    "Movimiento de exhortación: Llamado a la movilización o cambio de conducta del lector"
                ),
                formulas = listOf(
                    "\\text{Concesión Dialéctica} = \\text{Reconocer } A \\to \\text{Contraatacar con } \\mathbf{Sin \\ embargo} \\to \\text{Imponer } B",
                    "\\text{Fuerza Persuasiva} = \\text{Solidez Lógica (Logos)} + \\text{Credibilidad (Ethos)} + \\text{Emoción (Pathos)}"
                ),
                formulaName = "Esquema Dialéctico de Concesión y Refutación",
                formulaLatex = "\\text{Estrategia} = \\text{Acepta}(p) \\wedge (p \\implies q) \\wedge (r \\implies \\neg q) \\implies \\text{Rechaza}(q)",
                formulaDescription = "Estructura formal de la refutación dialéctica por contraejemplo.",
                admissionTip = "Cuando el autor dice 'Es cierto que...' o 'Si bien es verdad que...', está haciendo una CONCESIÓN RETÓRICA. Prepárate porque en la línea siguiente vendrá un 'pero' o 'sin embargo' con su argumento demoledor.",
                admissionExplanation = "• La concesión no significa que el autor cambie de opinión: es una trampa dialéctica para ganarse al lector indeciso."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Enunciado: «Es verdad que los vehículos eléctricos son más costosos al momento de la compra; no obstante, su bajo costo de mantenimiento y el ahorro de combustible en cinco años superan ampliamente esa diferencia inicial». \nEn este fragmento, la primera cláusula cumple la función de:",
                    options = listOf(
                        "Refutación definitiva",
                        "Concesión dialéctica",
                        "Conclusión irrevocable",
                        "Ejemplificación accesoria",
                        "Pregunta retórica"
                    ),
                    correctIndex = 1,
                    explanation = "Al admitir que los vehículos son más caros ('Es verdad que...') para luego contraargumentar con los ahorros a largo plazo ('no obstante...'), el autor realiza una concesión retórica dialéctica clásica.",
                    subject = "Comp. Lectora",
                    semana = 4
                ),
                Challenge(
                    id = "q_cl_t04_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La oración final de un ensayo que concluye con la frase: «¡Exijamos a nuestras autoridades una ley estricta de protección de glaciares antes de que sea demasiado tarde!», tiene una fuerza ilocutiva primordialmente:",
                    options = listOf(
                        "Descriptiva",
                        "Exhortativa o de incitación a la acción",
                        "Metalingüística",
                        "Dubitativa",
                        "Poética pura"
                    ),
                    correctIndex = 1,
                    explanation = "El uso del imperativo inclusivo ('Exijamos') y la exclamación de urgencia evidencian una fuerza ilocutiva eminentemente exhortativa que apela a la acción del lector.",
                    subject = "Comp. Lectora",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: EVALUACIÓN DE LA INFORMACIÓN (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "cl_t05_s01",
            subjectId = "comprension_lectora",
            semana = 5,
            subtema = "5.1 Hechos vs. Opiniones y Juicios de Valor",
            title = "Evaluación Crítica: Distinción entre Hechos y Opiniones",
            theory = LessonTheory(
                id = "th_cl_t05_s01",
                asignatura = "Comp. Lectora",
                semana = 5,
                titulo = "Distinción entre Hechos y Opiniones",
                resumen = "• Evaluación Crítica de la Información:\n  - En la lectura universitaria es imperativo separar las afirmaciones factuales objetivas de las apreciaciones subjetivas u opiniones del autor.\n\n• Criterios de Demarcación Epistemológica:\n  1. **Hecho Objetivo (Factual / Comprobable):**\n     - Suceso, fenómeno o dato empírico observable y verificable en la realidad mediante métodos científicos o testimonios documentales irrefutables.\n     - Es independiente de los deseos, gustos o ideologías de quien lo expresa.\n     - Ejemplo: *«La temperatura de ebullición del agua a nivel del mar es de 100 °C»* / *«Mariano Melgar fue fusilado en 1815»*.\n  2. **Opinión o Juicio de Valor (Subjetivo / Discutible):**\n     - Creencia, valoración moral, gusto estético o postura política de un individuo.\n     - No puede calificarse de verdadero o falso de manera empírica concluyente; admite discrepancia razonada.\n     - Ejemplo: *«La literatura arequipeña del siglo XIX es la más hermosa del Perú»* / *«El actual sistema tributario es profundamente injusto»*.",
                conceptosClave = listOf(
                    "Hecho: Afirmación objetiva, universal y verificable independientemente del sujeto",
                    "Opinión: Apreciación subjetiva, valorativa y discutible sobre una realidad",
                    "Marcadores de opinión: Adjetivos calificativos valorativos (hermoso, repudiable, nefasto)",
                    "Verificabilidad empírica: Prueba determinante para convalidar un hecho"
                ),
                formulas = listOf(
                    "\\text{Hecho} \\implies \\text{Comprobable empíricamente} \\quad (\\text{V} \\lor \\text{F})",
                    "\\text{Opinión} \\implies \\text{Juicio de Valor Subjetivo} \\quad (\\text{Discutible / No Fáctico})"
                ),
                formulaName = "Criterio de Demarcación Factual",
                formulaLatex = "\\text{Enunciado} = \\begin{cases} \\text{Hecho} & \\text{si } \\exists \\text{ protocolo de verificación objetiva} \\\\ \\text{Opinión} & \\text{si depende de axiología o estética subjetiva} \\end{cases}",
                formulaDescription = "Discriminación epistemológica entre aserciones empíricas y juicios axiológicos.",
                admissionTip = "Busca adjetivos de carga emotiva: palabras como 'maravilloso', 'horrible', 'injusto', 'excelente' delatan de inmediato una OPINIÓN. Frases con números, fechas y medidas científicas señalan HECHOS.",
                admissionExplanation = "• Un hecho puede ser falso (si se demuestra que ocurrió otra cosa); pero sigue siendo un intento de enunciado fáctico, no una simple opinión personal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique cuál de los siguientes enunciados constituye un HECHO y no una opinión:",
                    options = listOf(
                        "La comida tradicional de Arequipa es la más sabrosa de toda América del Sur.",
                        "El volcán Misti registró su última erupción de ceniza de importancia histórica en el siglo XV.",
                        "Mariano Melgar es el poeta más talentoso que ha nacido en tierras peruanas.",
                        "Vivir cerca de la campiña arequipeña es la experiencia más relajante del mundo.",
                        "La arquitectura en sillar es insuperable en belleza colonial."
                    ),
                    correctIndex = 1,
                    explanation = "La última erupción histórica del Misti en el siglo XV es un dato geológico e histórico documentado y comprobable científicamente, lo que define a un hecho. Las otras opciones expresan gustos o juicios de valor subjetivos ('la más sabrosa', 'el más talentoso').",
                    subject = "Comp. Lectora",
                    semana = 5
                ),
                Challenge(
                    id = "q_cl_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el texto: «El presidente promulgó la ley de reforma agraria; sin embargo, dicha medida fue profundamente nefasta para la economía nacional». La segunda cláusula representa:",
                    options = listOf(
                        "Un hecho científicamente medible en laboratorio",
                        "Un juicio de valor u opinión del autor",
                        "Una tautología circular",
                        "Una definición lexicográfica",
                        "Una paráfrasis de la ley"
                    ),
                    correctIndex = 1,
                    explanation = "El empleo del calificativo 'profundamente nefasta' traduce una postura ideológica y valorativa del analista, constituyendo una opinión o juicio de valor sobre el impacto de la medida.",
                    subject = "Comp. Lectora",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "cl_t05_s02",
            subjectId = "comprension_lectora",
            semana = 5,
            subtema = "5.2 Validez, Solidez y Confiabilidad de las Fuentes de Información",
            title = "Evaluación de Fuentes: Autoridad, Rigor y Evidencia",
            theory = LessonTheory(
                id = "th_cl_t05_s02",
                asignatura = "Comp. Lectora",
                semana = 5,
                titulo = "Confiabilidad de Fuentes y Validez",
                resumen = "• La Confiabilidad Epistemológica de un Texto:\n  - Mide el grado de certidumbre y respaldo metodológico que fundamenta las afirmaciones de una lectura.\n\n• Criterios de Evaluación Crítica de Fuentes:\n  1. **Autoridad y Filiación Académica:**\n     - ¿Quién firma la investigación? ¿Pertenece a una universidad licenciada, instituto científico (e.g., IGP, CONCYTEC) o entidad internacional de arbitraje por pares?\n  2. **Actualidad y Relevancia Temporal:**\n     - En ciencias duras y tecnología, las fuentes deben responder al estado del arte contemporáneo (publicaciones de los últimos años).\n  3. **Rigor Metodológico y Muestreo:**\n     - Las conclusiones se apoyan en muestras estadísticamente significativas con grupos de control y no en anécdotas individuales aisladas.\n  4. **Triangulación y Contrastación de Fuentes:**\n     - Los datos expuestos deben ser corroborables mediante otras investigaciones independientes.",
                conceptosClave = listOf(
                    "Confiabilidad de la fuente: Respaldo institucional y arbitraje de pares académicos",
                    "Rigor metodológico: Presencia de grupo de control, muestras amplias y reproducibilidad",
                    "Sesgo de actualidad: Vigencia temporal frente a teorías científicas obsoletas",
                    "Triangulación: Convalidación de conclusiones mediante múltiples estudios cruzados"
                ),
                formulas = listOf(
                    "\\text{Solidez Argumentativa} = \\text{Validez Lógica} + \\text{Verdad Fáctica de las Fuentes}",
                    "\\text{Confiabilidad} \\propto \\frac{\\text{Páginas Arbitradas (Peer-reviewed)}}{\\text{Testimonios Anecdóticos Anónimos}}"
                ),
                formulaName = "Índice de Confiabilidad Epistémica",
                formulaLatex = "\\text{Criterio}(F) = \\text{Arbitraje}(F) \\land \\text{Metodología}(F) \\land \\text{Vigencia}(F)",
                formulaDescription = "Requisitos mínimos de idoneidad en la selección de fuentes para el trabajo académico.",
                admissionTip = "En preguntas donde dos textos debaten, evalúa cuál de los dos autores cita datos estadísticos con muestras representativas y cuál apela a historias personales: el que use datos de estudios científicos arbitrados es la fuente confiable.",
                admissionExplanation = "• Una anécdota personal jamás equivale a una prueba estadística en el método científico."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un debate sobre la eficacia de un nuevo fármaco, el Autor A cita un ensayo clínico a doble ciego con 10,000 pacientes publicado en 'The Lancet'; el Autor B afirma que el fármaco es peligroso porque su vecino sufrió alergia al consumirlo. Desde el punto de vista del razonamiento crítico:",
                    options = listOf(
                        "Ambos argumentos poseen idéntica validez científica.",
                        "El Autor B aporta la prueba más contundente por ser un caso cercano y real.",
                        "El Autor A fundamenta su postura en una fuente rigurosa y con respaldo metodológico estadístico representativo.",
                        "El ensayo clínico carece de valor frente a la experiencia cotidiana.",
                        "Ambos autores incurren en falacias de generalización."
                    ),
                    correctIndex = 2,
                    explanation = "El Autor A emplea una fuente arbitrada con ensayo a doble ciego y muestra masiva (10,000 sujetos), lo que otorga máxima confiabilidad científica frente al testimonio anecdótico e individual del Autor B.",
                    subject = "Comp. Lectora",
                    semana = 5
                ),
                Challenge(
                    id = "q_cl_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes criterios invalida directamente la solidez de una fuente en un artículo sobre vacunas?",
                    options = listOf(
                        "Que fue publicada en una revista científica de microbiología.",
                        "Que fue financiada y redactada en secreto por una empresa que comercializa un producto competidor.",
                        "Que incluye gráficos con intervalos de confianza matemática.",
                        "Que fue revisada por tres especialistas independientes.",
                        "Que cita bibliografía de los últimos cinco años."
                    ),
                    correctIndex = 1,
                    explanation = "El conflicto de interés no declarado y la redacción secreta por parte de un competidor comercial destruye de inmediato la neutralidad, ética y solidez epistemológica de la fuente.",
                    subject = "Comp. Lectora",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "cl_t05_s03",
            subjectId = "comprension_lectora",
            semana = 5,
            subtema = "5.3 Detección de Sesgos Ideológicos y Manipulación Argumentativa",
            title = "Detección de Sesgos Ideológicos y Manipulación en Textos",
            theory = LessonTheory(
                id = "th_cl_t05_s03",
                asignatura = "Comp. Lectora",
                semana = 5,
                titulo = "Sesgos Ideológicos y Manipulación en la Lectura",
                resumen = "• El Lector Crítico ante la Manipulación Informativa:\n  - La lectura crítica exige detectar cuándo un autor presenta una visión sesgada, tendenciosa o manipulada de la realidad aparentando ser neutral.\n\n• Principales Mecanismos de Sesgo y Manipulación Textual:\n  1. **Sesgo de Confirmación del Autor:**\n     - El autor selecciona únicamente los datos y cifras que favorecen su hipótesis previa, ocultando u omitiendo deliberadamente la evidencia que la contradice (*cherry-picking*).\n  2. **Uso de Léxico Marcadamente Connotativo:**\n     - Reemplazar palabras denotativas neutras por términos de fuerte carga emocional para predisponer al lector (*«horda de manifestantes»* en vez de *«grupo de ciudadanos»*).\n  3. **Falacia del Hombre de Paja (Caricaturización):**\n     - Distorsionar o exagerar la postura del oponente para hacerla parecer ridícula y fácil de refutar.\n  4. **Falsa Dicotomía:**\n     - Presentar una problemática compleja como si solo existieran dos alternativas extremas: *«O apoyas incondicionalmente este proyecto o estás en contra del progreso de la región»*.",
                conceptosClave = listOf(
                    "Sesgo de confirmación: Selección interesada de datos favorables con ocultamiento de pruebas en contra",
                    "Léxico sesgado: Manipulación ideológica mediante la elección de adjetivos denigrantes o encomiásticos",
                    "Hombre de paja: Deformación burda del argumento rival para atacarlo fácilmente",
                    "Falsa dicotomía: Reducción maniquea de una cuestión a dos polos excluyentes"
                ),
                formulas = listOf(
                    "\\text{Manipulación} = \\text{Selección Parcial de Datos (Cherry-picking)} + \\text{Léxico Connotativo Polarizado}",
                    "\\text{Falsa Dicotomía}: \\; A \\lor B \\quad (\\text{Ocultando deliberadamente alternativas } C, D, E)"
                ),
                formulaName = "Filtro de Detección de Tendenciosidad",
                formulaLatex = "\\text{Sesgo}(T) = \\frac{\\text{Datos Favorables}}{\\text{Total de Datos Relevantes Existentes}} - 0.5",
                formulaDescription = "Medición del grado de asimetría informativa en textos polémicos.",
                admissionTip = "Observa los sustantivos y adjetivos que utiliza el autor para describir a las dos partes en conflicto: si para un bando usa términos heroicos y para el otro términos despectivos o criminalizantes, estás ante un texto con sesgo ideológico evidente.",
                admissionExplanation = "• En los textos dialécticos de admisión de la UNSA, identificar el sesgo te ayuda a responder con exactitud la pregunta de posición del autor."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un editorial de prensa titula: «O construimos la nueva autopista por el valle o condenaremos a Arequipa a vivir en la Edad de Piedra sin desarrollo económico». ¿Qué estrategia de manipulación discursiva se emplea?",
                    options = listOf(
                        "Falsa dicotomía maniquea",
                        "Inferencia prospectiva rigurosa",
                        "Paráfrasis sintética",
                        "Definición lexicográfica objetiva",
                        "Deducción matemática estricta"
                    ),
                    correctIndex = 0,
                    explanation = "El editorialista fuerza al lector a elegir entre dos únicas opciones extremas (hacer la autopista o volver a la Edad de Piedra), ignorando alternativas intermedias de transporte sustentable, lo que constituye una 'falsa dicotomía'.",
                    subject = "Comp. Lectora",
                    semana = 5
                ),
                Challenge(
                    id = "q_cl_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si un columnista afirma: «Los defensores del medio ambiente pretenden que todos apaguemos la luz y volvamos a vivir dentro de cavernas oscuras», ¿en qué falacia incurre?",
                    options = listOf(
                        "Falacia del hombre de paja",
                        "Argumentum ad verecundiam",
                        "Petición de principio",
                        "Causa falsa",
                        "Anfibología"
                    ),
                    correctIndex = 0,
                    explanation = "Caricaturiza y deforma de forma ridícula la postura ecologista (afirmando que quieren hacernos vivir en cavernas) para descalificarla sin debatir sus argumentos reales, cometiendo la falacia del 'hombre de paja'.",
                    subject = "Comp. Lectora",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "cl_t05_s04",
            subjectId = "comprension_lectora",
            semana = 5,
            subtema = "5.4 Análisis Crítico de Tablas, Infografías y Textos Mixtos",
            title = "Comprensión de Textos Mixtos, Gráficos e Infografías",
            theory = LessonTheory(
                id = "th_cl_t05_s04",
                asignatura = "Comp. Lectora",
                semana = 5,
                titulo = "Lectura de Textos Discontinuos y Mixtos",
                resumen = "• Textos Mixtos y Discontinuos en Admisión (UNSA / DECO):\n  - Un texto mixto combina un fragmento en prosa continua con uno o varios elementos visuales discontinuos (tablas estadísticas, gráficos de barras, gráficos circulares, diagramas de flujo o infografías).\n\n• Metodología de Decodificación de Gráficos e Infografías:\n  1. **Lectura de Ejes y Leyendas:** Identificar la variable independiente (habitualmente en el eje horizontal X: tiempo, años) y la variable dependiente (eje vertical Y: porcentaje, miles de personas, toneladas).\n  2. **Identificación de Picos, Valles y Tendencias:** Detectar el año de máxima producción (*pico*), el año de caída más drástica (*valle*) y la tendencia global (ascendente, descendente o estancada).\n  3. **Cruce de Información Texto-Imagen:**\n     - Contrastar lo que sostiene el texto en prosa con los números reales consignados en el gráfico estadístico.\n     - Comprobar si el gráfico confirma la tesis del autor o si, por el contrario, expone datos que relativizan o contradicen sus conclusiones.\n\n• Errores Frecuentes:\n  - Confundir cifras absolutas (ej. número total de habitantes) con porcentajes relativos (ej. tasa por cada 100 mil habitantes).",
                conceptosClave = listOf(
                    "Texto mixto: Integración de prosa argumentativa/expositiva con tablas o infografías",
                    "Ejes cartesianos: Eje X (temporal o categorial) y Eje Y (magnitud numérica)",
                    "Cifras absolutas vs. porcentajes: Distinción crucial para no caer en trampas numéricas",
                    "Cotejo intermodal: Validación de la coherencia entre el texto verbal y el gráfico visual"
                ),
                formulas = listOf(
                    "\\text{Lectura Mixta} = \\text{Prosa Continua} \\cap \\text{Gráfico Discontinuo}",
                    "\\text{Tendencia} = \\frac{\\Delta Y}{\\Delta X} \\quad (\\text{Positiva: Crecimiento} \\;; \\; \\text{Negativa: Caída})"
                ),
                formulaName = "Protocolo de Integración Intermodal",
                formulaLatex = "\\text{Consistencia}(T_{\\text{mixto}}) \\iff \\forall d \\in \\text{Gráfico}, \\; d \\text{ es compatible con } T_{\\text{verbal}}",
                formulaDescription = "Criterio de concordancia entre datos gráficos y argumentación textual.",
                admissionTip = "Fíjate bien en la unidad de medida del gráfico: mira si los números están en 'millones', en 'miles' o en 'porcentajes (%)'. Una opción que confunda 10 millones con 10% es un distractor matemático clásico.",
                admissionExplanation = "• No te limites a mirar el dibujo de la infografía; lee los rótulos y la fuente pequeña al pie del gráfico."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un gráfico de barras sobre la exportación de cobre peruano entre 2018 y 2024, la barra del año 2020 presenta la altura más baja de todo el periodo, cayendo de 2.4 a 1.8 millones de toneladas métricas. El texto complementario indica que la pandemia paralizó faenas mineras. Se infiere válidamente del gráfico y del texto que:",
                    options = listOf(
                        "El Perú dejó de producir cobre de manera definitiva en el año 2020.",
                        "El año 2020 representó el punto de inflexión con menor volumen de exportación cuprífera atribuible al confinamiento.",
                        "En 2024 no se extrajo cobre en ninguna región del país.",
                        "El precio internacional del cobre cayó a cero dólares en 2020.",
                        "Las minas peruanas exportaron más cobre en 2020 que en 2018."
                    ),
                    correctIndex = 1,
                    explanation = "La combinación de la barra más reducida en 2020 con la explicación en prosa de la paralización por la pandemia confirma que dicho año constituyó el punto de menor exportación del periodo.",
                    subject = "Comp. Lectora",
                    semana = 5
                ),
                Challenge(
                    id = "q_cl_t05_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si una infografía expone que el 60% de los accidentes de tránsito en Arequipa ocurre por imprudencia peatonal y un 40% por exceso de velocidad, ¿qué afirmación es compatible?",
                    options = listOf(
                        "El exceso de velocidad es la causa mayoritaria absoluta de los accidentes viales.",
                        "La imprudencia de los transeúntes explica la mayor proporción de los siniestros registrados.",
                        "Ningún conductor comete infracciones de tránsito en la ciudad.",
                        "Los peatones arequipeños jamás respetan los semáforos.",
                        "Todos los accidentes vehiculares ocurren en la avenida Ejército."
                    ),
                    correctIndex = 1,
                    explanation = "Al representar el 60% frente al 40%, la imprudencia peatonal constituye la causa de mayor proporción porcentual registrada en la infografía.",
                    subject = "Comp. Lectora",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: VOCABULARIO EN CONTEXTO (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "cl_t06_s01",
            subjectId = "comprension_lectora",
            semana = 6,
            subtema = "6.1 Sentido Denotativo vs. Sentido Connotativo en Textos",
            title = "Vocabulario en Contexto: Denotación y Connotación",
            theory = LessonTheory(
                id = "th_cl_t06_s01",
                asignatura = "Comp. Lectora",
                semana = 6,
                titulo = "Sentido Denotativo y Connotativo",
                resumen = "• El Vocabulario en el Contexto de la Lectura:\n  - En la prueba de admisión de la UNSA, el significado de las palabras no se evalúa de manera aislada como en un glosario, sino plenamente contextualizado en el flujo del discurso.\n\n• Los Dos Planos del Significado:\n  1. **Sentido Denotativo (Literal / Objetivo / Estable):**\n     - Significado primario, formal y estandarizado registrado en el diccionario académico de la RAE.\n     - Coincide con la realidad empírica referencial sin añadir emociones ni metáforas.\n     - Predomina en textos científicos, leyes, manuales técnicos y reportes académicos.\n     - Ejemplo: *«El corazón bombea sangre oxigenada a los tejidos»* (Órgano muscular cardíaco).\n  2. **Sentido Connotativo (Figurado / Metafórico / Expresivo):**\n     - Significado secundario o añadido por el contexto cultural, emotivo, literario o ideológico.\n     - Se aparta del sentido literal para sugerir sensaciones, valoraciones o simbolismos.\n     - Predomina en poesía, ensayos de opinión, literatura y lenguaje coloquial.\n     - Ejemplo: *«Arequipa es el corazón del sur andino»* (Centro neurálgico, motor cultural y económico).",
                conceptosClave = listOf(
                    "Sentido denotativo: Significado literal primario, universal y objetivo de la palabra",
                    "Sentido connotativo: Significado figurado, contextual, poético o valorativo",
                    "Polisemia contextual: Activación de semas específicos según el entorno oracional",
                    "Decodificación pragmática: Comprensión del valor metafórico en textos de opinión"
                ),
                formulas = listOf(
                    "\\text{Significado Total} = \\text{Semas Denotativos (Objetivos)} + \\text{Semas Connotativos (Contextuales)}",
                    "\\text{Denotación}: \\; \\text{Término} \\to \\text{Referente Físico Directo}",
                    "\\text{Connotación}: \\; \\text{Término} \\to \\text{Símbolo / Metáfora / Carga Afectiva}"
                ),
                formulaName = "Dualidad Semántica de Hjelmslev",
                formulaLatex = "\\text{Semema} = \\text{Denotativo} \\oplus \\text{Connotativo}_{\\text{contexto}}",
                formulaDescription = "Composición semántica del término según el género discursivo.",
                admissionTip = "Pregúntate: '¿La palabra está cumpliendo su función física del diccionario o está usada como metáfora?'. Si dice 'El invierno de su vida', no habla de la estación del año, sino connotativamente de la vejez o senectud.",
                admissionExplanation = "• En textos científicos predomina el valor denotativo; en textos de humanidades y literatura abunda la connotación."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el texto histórico: «Tras la caída del Imperio romano, Europa quedó sumergida en una profunda NOCHE donde el comercio languideció y las ciudades se despoblaron». El término en mayúsculas se utiliza en sentido:",
                    options = listOf(
                        "Denotativo astronómico",
                        "Connotativo de declive cultural y oscurantismo",
                        "Literal meteorológico",
                        "Paronímico estricto",
                        "Científico exacto"
                    ),
                    correctIndex = 1,
                    explanation = "La palabra 'noche' no alude al ciclo diario de rotación de la Tierra sin luz solar, sino que se emplea connotativamente como metáfora de decadencia, crisis y oscurantismo cultural.",
                    subject = "Comp. Lectora",
                    semana = 6
                ),
                Challenge(
                    id = "q_cl_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración en la que la palabra CORAZÓN presenta significado estrictamente DENOTATIVO:",
                    options = listOf(
                        "El Misti es el corazón palpitante de la identidad arequipeña.",
                        "La madre abrazó a su hijo con todo el corazón.",
                        "El cirujano realizó un trasplante de corazón que duró seis horas.",
                        "Aquel funcionario corrupto tiene un corazón de piedra.",
                        "Llegamos al corazón de la selva tras cinco días de navegación."
                    ),
                    correctIndex = 2,
                    explanation = "En la opción (C), 'corazón' se utiliza con su sentido físico literal anatómico primario (órgano del cuerpo humano trasplantado por el cirujano). En las otras opciones funciona como metáfora connotativa.",
                    subject = "Comp. Lectora",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "cl_t06_s02",
            subjectId = "comprension_lectora",
            semana = 6,
            subtema = "6.2 Sinonimia y Antonimia Contextual en la Lectura",
            title = "Equivalencia Léxica en el Texto: Sinónimos y Antónimos",
            theory = LessonTheory(
                id = "th_cl_t06_s02",
                asignatura = "Comp. Lectora",
                semana = 6,
                titulo = "Sinonimia y Antonimia en Contexto Textual",
                resumen = "• Preguntas de Léxico en Contexto en Textos de Admisión:\n  - La UNSA formula recurrentemente: *«En el texto, el vocablo X adquiere el sentido de...»* o *«El antónimo contextual de la palabra Y es...»*.\n  - El objetivo es comprobar si el estudiante es capaz de aislar el significado específico con el que el autor utilizó el término en esa oración particular, descartando acepciones de diccionario que no cuadran con el argumento.\n\n• Protocolo de Resolución en Tres Pasos:\n  1. **Ubicación en el Párrafo:** Releer las dos oraciones que rodean a la palabra evaluada para captar la dirección del pensamiento del autor.\n  2. **Prueba de Sustitución:** Reemplazar mentalmente la palabra por cada una de las alternativas propuestas.\n  3. **Control de Registro y Coherencia:** La opción elegida no debe alterar el tono formal ni crear un sin sentido lógico con la idea principal.",
                conceptosClave = listOf(
                    "Sentido contextual: Valor semántico efectivo que la palabra adquiere en el párrafo",
                    "Prueba de sustitución: Inserción directa de las opciones para verificar la coherencia",
                    "Descarte de acepciones irrelevantes: Evitar definiciones de diccionario desalineadas",
                    "Preservación de la categoría gramatical: El reemplazo debe respetar la morfología original"
                ),
                formulas = listOf(
                    "\\text{Sinónimo Contextual}(w) = w^* \\iff \\text{Sentido}(T[w]) = \\text{Sentido}(T[w^*])",
                    "\\text{Antónimo Contextual}(w) = w' \\iff \\text{Sentido}(T[w']) = \\neg \\text{Sentido}(T[w])"
                ),
                formulaName = "Fórmula de Conmutación Textual",
                formulaLatex = "w^* = \\arg\\max_{v \\in \\text{Opciones}} \\left[ \\text{Coherencia}(T[w \\to v]) \\right]",
                formulaDescription = "Selección del vocablo que maximiza la coherencia semántica en la sustitución.",
                admissionTip = "¡Cuidado con las palabras polisémicas como 'revolución', 'marco', 'carrera' o 'capital'! En un texto de biología, 'célula madre' no tiene nada que ver con maternidad humana; lee siempre la frase entera.",
                admissionExplanation = "• No te limites a elegir la palabra más difícil o pomposa: elige la que encaje con naturalidad en el sentido del texto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El filósofo presentó un argumento DEMOLEDOR que pulverizó las tesis de sus oponentes durante la asamblea universitaria». \nEn el contexto de la lectura, el vocablo DEMOLEDOR adquiere el sentido de:",
                    options = listOf(
                        "Constructivo",
                        "Contundente",
                        "Pesado",
                        "Mecánico",
                        "Ruidoso"
                    ),
                    correctIndex = 1,
                    explanation = "En una argumentación dialéctica, un argumento 'demoledor' no destruye paredes físicas con maquinaria, sino que es irrefutable, tajante y 'contundente', anulando las premisas rivales.",
                    subject = "Comp. Lectora",
                    semana = 6
                ),
                Challenge(
                    id = "q_cl_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El informe meteorológico alertó sobre la presencia de vientos HURACANADOS en la costa sur del país». \n¿Cuál es el antónimo contextual más adecuado para el término en mayúsculas?",
                    options = listOf(
                        "Torrenciales",
                        "Violentos",
                        "Calmos",
                        "Fríos",
                        "Marinos"
                    ),
                    correctIndex = 2,
                    explanation = "'Huracanados' describe vientos de violencia e intensidad extrema. Su antónimo contextual opuesto es 'calmos' o 'apacibles' (ausencia de turbulencia o agitación).",
                    subject = "Comp. Lectora",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "cl_t06_s03",
            subjectId = "comprension_lectora",
            semana = 6,
            subtema = "6.3 Sentido Figurado, Metáforas y Lenguaje Alegórico",
            title = "Lenguaje Figurado, Tropos y Metáforas en la Lectura",
            theory = LessonTheory(
                id = "th_cl_t06_s03",
                asignatura = "Comp. Lectora",
                semana = 6,
                titulo = "El Lenguaje Figurado y las Metáforas",
                resumen = "• El Sentido Figurado en la Comprensión Lectora:\n  - Se produce cuando el autor traslada el significado propio de una palabra a otra significación imaginaria mediante relaciones de semejanza, contigüidad o comparación implícita (tropos).\n  - Es frecuente en ensayos de divulgación humanística, artículos de opinión y textos literarios.\n\n• Principales Tropos y su Decodificación:\n  1. **La Metáfora:**\n     - Identificación poética de dos objetos distintos basada en un sema común analógico.\n     - Ejemplo: *«El cerebro es un bosque de neuronas entrelazadas»* $\\to$ Sema común: ramificación intrincada, densidad y conexiones orgánicas.\n  2. **La Metonimia:**\n     - Sustitución de un término por otro basada en relaciones de causa-efecto, continente-contenido, autor-obra o instrumento-agente.\n     - Ejemplo: *«Arequipa leyó con fervor a Melgar»* $\\to$ Metonimia del autor por sus poemas/yaravíes.\n  3. **La Hipérbole (Exageración desmedida):**\n     - Aumento o disminución deliberada de una magnitud para enfatizar una idea (*«Lloró ríos de lágrimas»*).\n  4. **La Alegoría:**\n     - Sistema continuo de metáforas encadenadas a lo largo de todo un texto (como el mito de la caverna de Platón).",
                conceptosClave = listOf(
                    "Sentido figurado: Traslación semántica imaginaria amparada en semejanzas conceptuales",
                    "Metáfora: Fusión analógica de dos planos de la realidad (término real y término imaginario)",
                    "Metonimia: Desplazamiento por contigüidad espacial, causal o instrumental",
                    "Alegoría: Estructura narrativa extendida donde cada elemento simboliza un concepto"
                ),
                formulas = listOf(
                    "\\text{Metáfora}: \\; A \\text{ es } B \\iff \\text{Semas}(A) \\cap \\text{Semas}(B) = \\text{Rasgo Análogo}",
                    "\\text{Decodificación}: \\; \\text{Término Metafórico} \\xrightarrow{\\text{traducción}} \\text{Idea Conceptual Real}"
                ),
                formulaName = "Mapeo de Analogía Metafórica",
                formulaLatex = "\\text{Significado Figurado} = \\text{Proyección}(\\text{Dominio Origen} \\to \\text{Dominio Destino})",
                formulaDescription = "Teoría cognitiva de la metáfora conceptual de Lakoff y Johnson.",
                admissionTip = "Cuando en una pregunta te pidan explicar una metáfora (como 'El río de la memoria'), identifica qué tienen en común el término de origen y el término de destino: el río fluye continuamente y a veces se estanca o se desborda, igual que los recuerdos humanos.",
                admissionExplanation = "• No interpretes las metáforas en sentido literal; busca la abstracción conceptual que encierran."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «La memoria histórica de los pueblos no es un archivo petrificado en mármol, sino un río caudaloso que se transforma con cada nueva generación que lo navega». \nLa metáfora del 'río caudaloso' sugiere que la memoria histórica:",
                    options = listOf(
                        "Es inmutable, rígida e indestructible.",
                        "Es dinámica, viva y sufre reinterpretaciones constantes a lo largo del tiempo.",
                        "Se encuentra sumergida en el fondo de los océanos.",
                        "Es exclusiva de las civilizaciones que habitaron valles fluviales.",
                        "Carece de todo valor científico para los historiadores."
                    ),
                    correctIndex = 1,
                    explanation = "La metáfora del río que fluye y se transforma frente al mármol estático denota que la memoria histórica es un proceso dinámico, vivo y sujeto a constantes relecturas por parte de las sociedades.",
                    subject = "Comp. Lectora",
                    semana = 6
                ),
                Challenge(
                    id = "q_cl_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la frase: «El joven violinista era la mejor BATUTA de toda la orquesta sinfónica juvenil», la figura retórica empleada es:",
                    options = listOf(
                        "Metonimia de instrumento por agente",
                        "Hipérbole astronómica",
                        "Pleonasmo vicioso",
                        "Anfibología sintáctica",
                        "Paronimia léxica"
                    ),
                    correctIndex = 0,
                    explanation = "Designar al director o músico por el instrumento de mando ('batuta') constituye un caso canónico de metonimia de instrumento por la persona que lo ejecuta.",
                    subject = "Comp. Lectora",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "cl_t06_s04",
            subjectId = "comprension_lectora",
            semana = 6,
            subtema = "6.4 Términos Técnicos, Neologismos y Tecnolectos Científicos",
            title = "Tecnolectos, Vocabulario Científico y Neologismos",
            theory = LessonTheory(
                id = "th_cl_t06_s04",
                asignatura = "Comp. Lectora",
                semana = 6,
                titulo = "Tecnolectos y Vocabulario Científico",
                resumen = "• El Lenguaje Científico-Técnico en Admisión:\n  - Las lecturas de las áreas de Ingenierías y Biomédicas de la UNSA incorporan frecuentemente tecnolectos (términos especializados de una ciencia) y neologismos tecnológicos.\n\n• Características del Léxico Científico:\n  1. **Monosemia Estricta:** Un término técnico busca poseer un único significado unívoco dentro de su disciplina para evitar cualquier ambigüedad interpretativa (*mitocondria, entropía, isótopo, epigenética*).\n  2. **Raíces Grecolatinas Transparentes:** La gran mayoría de tecnicismos biomédicos y físicos se componen de prefijos y sufijos griegos y latinos:\n     - *Bio-* (vida), *Geo-* (tierra), *Crono-* (tiempo), *Termo-* (calor).\n     - *-itis* (inflamación: *gastritis, dermatitis*).\n     - *-oma* (tumor o masa: *carcinoma, lipoma*).\n     - *-ectomía* (extirpación quirúrgica: *apendicectomía*).\n     - *-scopía* (observación visual: *endoscopía*).\n  3. **Neologismos Tecnológicos y Préstamos Lingüísticos:** Incorporación de nuevos conceptos surgidos de la informática y telecomunicaciones (*algoritmo, ciberseguridad, computación cuántica*).",
                conceptosClave = listOf(
                    "Tecnolecto: Variedad lingüística técnica propia de un campo científico profesional",
                    "Monosemia: Cualidad por la cual un vocablo técnico posee una sola acepción exacta",
                    "Prefijos y sufijos grecolatinos: Clave etimológica para descifrar términos desconocidos",
                    "Neologismo: Palabra de reciente creación adaptada a las nuevas realidades técnicas"
                ),
                formulas = listOf(
                    "\\text{Tecnicismo Médico} = \\text{Raíz Grecolatina} + \\text{Sufijo Patológico / Quirúrgico}",
                    "\\text{Ejemplo}: \\; \\text{Gastro} (\\text{estómago}) + \\text{-itis} (\\text{inflamación}) = \\text{Gastritis}"
                ),
                formulaName = "Morfología Analítica de Tecnolectos",
                formulaLatex = "\\text{Significado}(W_{\\text{técnico}}) = \\sum_{i} \\text{Semas}(\\text{Morfema}_i)",
                formulaDescription = "Decodificación composicional a partir de étimos clásicos.",
                admissionTip = "Aprende los sufijos médicos básicos: '-itis' significa inflamación (otitis = oído inflamado); '-algia' significa dolor (neuralgia = dolor de nervios); '-fobia' es aversión patológica; '-filia' es afinidad o amor.",
                admissionExplanation = "• Si encuentras un término técnico desconocido en el examen, descompónlo en sus raíces griegas para deducir su significado sin titubear."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un artículo biomédico se describe que un paciente fue sometido a una COLECISTECTOMÍA de urgencia debido a una infección aguda. Atendiendo a la etimología técnica grecolatina (colecisto = vesícula biliar; -ectomía = extirpación quirúrgica), el procedimiento consistió en:",
                    options = listOf(
                        "La observación visual del estómago con microcámara.",
                        "La extirpación quirúrgica de la vesícula biliar.",
                        "La inflamación dolorosa del hígado.",
                        "El trasplante de riñón mediante cirugía robótica.",
                        "La sutura de una herida en el colon."
                    ),
                    correctIndex = 1,
                    explanation = "Etimológicamente, 'colecisto' refiere a la vesícula biliar y el sufijo técnico '-ectomía' designa la ablación o extirpación quirúrgica de un órgano; por ende, consistió en la extirpación de la vesícula biliar.",
                    subject = "Comp. Lectora",
                    semana = 6
                ),
                Challenge(
                    id = "q_cl_t06_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la característica semántica definitoria del vocabulario científico técnico frente al lenguaje cotidiano?",
                    options = listOf(
                        "Su carácter altamente ambiguo y poético",
                        "Su monosemia estricta orientada a erradicar la ambigüedad conceptual",
                        "La constante invención de palabras sin reglas gramaticales",
                        "El predominio absoluto del sentido connotativo",
                        "Su dependencia del dialecto regional local"
                    ),
                    correctIndex = 1,
                    explanation = "El lenguaje científico se caracteriza por la monosemia y la precisión unívoca, garantizando que cada término posea una definición técnica única compartida por la comunidad científica.",
                    subject = "Comp. Lectora",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: COHERENCIA Y COHESIÓN TEXTUAL EN LA LECTURA (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "cl_t07_s01",
            subjectId = "comprension_lectora",
            semana = 7,
            subtema = "7.1 Mecanismos de Cohesión: Anáforas, Catáforas y Sustitución Léxica",
            title = "Cohesión Textual: Referencia Endofórica y Sinonimia Referencial",
            theory = LessonTheory(
                id = "th_cl_t07_s01",
                asignatura = "Comp. Lectora",
                semana = 7,
                titulo = "Mecanismos de Cohesión y Referencia",
                resumen = "• La Cohesión como Guía de la Lectura Eficaz:\n  - La cohesión es la red de enlaces lingüísticos visibles que conectan oraciones contiguas en el texto, guiando la atención del lector a través de los referentes.\n\n• Mecanismos Cohesivos Evaluados en Comprensión:\n  1. **Anáfora Pronominal y Demostrativa:**\n     - Remite a un referente mencionado previamente.\n     - Pregunta típica: *«En la línea 8, el pronombre 'este' alude a...»*.\n     - Regla: Buscar el sustantivo más próximo que concuerde en género y número sin forzar el sentido.\n  2. **Sustitución Léxica por Hiperónimo o Perífrasis:**\n     - Para no repetir el nombre del protagonista, el autor usa una frase descriptiva o hiperonímica (*Mariano Melgar $\\to$ el bardo arequipeño $\\to$ el prócer mártir $\\to$ el poeta*).\n  3. **Catáfora Textual:**\n     - Elemento que anticipa información que se desplegará a continuación mediante dos puntos o enumeraciones.\n  4. **Elipsis Cohesiva:**\n     - Supresión voluntaria de una palabra ya dicha que el lector debe reponer mentalmente para entender la proposición.",
                conceptosClave = listOf(
                    "Cohesión: Enlaces gramaticales explícitos que encadenan las frases del texto",
                    "Anáfora: Enlace retroactivo hacia un sustantivo o idea previa",
                    "Catáfora: Enlace prospectivo que prepara la llegada de datos nuevos",
                    "Sustitución perifrástica: Empleo de epítetos o descripciones que sustituyen al nombre"
                ),
                formulas = listOf(
                    "\\text{Anáfora}: \\; X_i \\dots \\to \\dots \\text{Pronombre}_i \\quad (\\text{Concordancia Género/Número})",
                    "\\text{Perífrasis}: \\; \\text{Arequipa} \\to \\text{La Ciudad Blanca} \\to \\text{La urbe del Misti}"
                ),
                formulaName = "Red de Continuidad Referencial",
                formulaLatex = "\\text{Cohesión}(T) \\implies \\forall p \\in \\text{Pronombres}, \\; \\exists! \\text{Antecedente}(p) \\in T",
                formulaDescription = "Condición de unicidad del referente en la decodificación del texto.",
                admissionTip = "Cuando te pregunten a qué se refiere 'este', 'aquel', 'la cual' o 'ello', regresa a la oración anterior y reemplaza mentalmente cada candidato en lugar del pronombre. El que devuelva la coherencia perfecta es la clave.",
                admissionExplanation = "• El pronombre neutro 'ello' o 'esto' suele referirse a toda una idea u oración completa previa, no a una sola palabra."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «Albert Einstein postuló en 1915 la Teoría de la Relatividad General, superando la mecánica clásica de Newton. ESTA revolucionó la física al demostrar que la gravedad es la curvatura del espaciotiempo provocada por la masa». \nEn el texto, la palabra en mayúsculas alude a:",
                    options = listOf(
                        "La física clásica",
                        "La masa molecular",
                        "La Teoría de la Relatividad General",
                        "La ciudad natal de Einstein",
                        "La ley de gravitación de Newton"
                    ),
                    correctIndex = 2,
                    explanation = "El pronombre demostrativo femenino singular 'ESTA' remite anafóricamente a la entidad conceptual femenina inmediata: 'la Teoría de la Relatividad General'.",
                    subject = "Comp. Lectora",
                    semana = 7
                ),
                Challenge(
                    id = "q_cl_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El río Chili atraviesa el valle de Arequipa suministrando agua para el regadío y el consumo humano. La milenaria cuenca, sin embargo, padece hoy la contaminación por efluentes urbanos». \nLa expresión 'LA MILENARIA CUENCA' constituye un caso de cohesión por:",
                    options = listOf(
                        "Elipsis verbal",
                        "Sustitución léxica perifrástica",
                        "Catáfora modal",
                        "Ambigüedad anfibológica",
                        "Paronimia de sentido"
                    ),
                    correctIndex = 1,
                    explanation = "Constituye una sustitución léxica perifrástica (o hiperonímica descriptiva) que retoma al río Chili sin repetir mecánicamente su nombre propio.",
                    subject = "Comp. Lectora",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "cl_t07_s02",
            subjectId = "comprension_lectora",
            semana = 7,
            subtema = "7.2 Conectores Lógicos y Marcadores del Discurso en la Comprensión",
            title = "Marcadores Discursivos y la Lógica de los Conectores",
            theory = LessonTheory(
                id = "th_cl_t07_s02",
                asignatura = "Comp. Lectora",
                semana = 7,
                titulo = "Conectores Lógicos y Marcadores Discursivos",
                resumen = "• Los Marcadores del Discurso como Semáforos de Lectura:\n  - Los conectores lógicos señalan al lector cómo debe interpretar la oración siguiente en relación con la anterior (¿es una causa? ¿es una objeción? ¿es un ejemplo? ¿es la conclusión final?).\n\n• Mapa de Marcadores Discursivos Fundamentales:\n  1. **Marcadores de Oposición / Contraste (*pero, sin embargo, no obstante, por el contrario*):**\n     - Anuncian un cambio de dirección en el pensamiento. Generalmente, la idea **más importante** para el autor se encuentra DESPUÉS del conector adversativo.\n  2. **Marcadores de Causa y Efecto (*porque, ya que / por lo tanto, en consecuencia*):**\n     - Establecen la cadena lógica de justificación científica o histórica.\n  3. **Marcadores de Reformulación o Aclaración (*es decir, en otras palabras, o sea*):**\n     - Advierten que se explicará con palabras más sencillas una idea abstracta previa.\n  4. **Marcadores de Ejemplificación (*por ejemplo, a modo de ilustración, verbigracia*):**\n     - Introducen casos particulares de menor jerarquía teórica.\n  5. **Marcadores de Conclusión (*en suma, en conclusión, en síntesis, finalmente*):**\n     - Anuncian el desenlace o la formulación de la Idea Principal en textos sintetizantes.",
                conceptosClave = listOf(
                    "Marcador discursivo: Enlace sintáctico que regula la interpretación lógica entre párrafos",
                    "Regla del adversativo: La tesis del autor suele colocarse inmediatamente después de 'sin embargo'",
                    "Reformuladores: Señales pedagógicas que aclaran conceptos abstractos previos",
                    "Conclusivos: Disparadores de síntesis macroestructural final"
                ),
                formulas = listOf(
                    "\\text{Lectura Estratégica}: \\; A + \\mathbf{sin \\ embargo} + \\mathbf{B} \\implies \\text{Énfasis Semántico en } B",
                    "\\text{Reformulación}: \\; \\text{Concepto Abstracto} + \\mathbf{es \\ decir} + \\text{Explicación Sencilla}"
                ),
                formulaName = "Álgebra de Señalización Discursiva",
                formulaLatex = "\\text{Dirección Lógica} = \\begin{cases} \\text{Contraste} & (\\text{sin embargo, empero}) \\\\ \\text{Causalidad} & (\\text{debido a, por ende}) \\\\ \\text{Cierre} & (\\text{en suma, finalmente}) \\end{cases}",
                formulaDescription = "Guía algorítmica para rastrear la intención argumentativa del autor.",
                admissionTip = "¡Hack de examen! Cuando leas un texto difícil y encuentres la locución 'es decir' o 'en otras palabras', lee con el doble de atención lo que viene a continuación: ¡ahí está la explicación fácil y clara que necesitas para responder!",
                admissionExplanation = "• Lo que está antes de 'pero' suele ser una concesión secundaria; lo que está después de 'pero' es lo que el autor realmente defiende."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el texto: «Muchos teóricos afirmaron que la mente humana al nacer es una tábula rasa vacía; SIN EMBARGO, los hallazgos contemporáneos de la neurobiología demuestran la existencia de estructuras cognitivas e instintos innatos preconfigurados». \nEl conector en mayúsculas cumple la función de:",
                    options = listOf(
                        "Introducir un ejemplo ilustrativo de la tábula rasa",
                        "Señalar la causa por la que la mente está vacía",
                        "Oponer una objeción sustentada en la neurobiología moderna contra la teoría clásica",
                        "Reiterar con idénticas palabras la postura de los teóricos antiguos",
                        "Concluir que la neurobiología es una ciencia obsoleta"
                    ),
                    correctIndex = 2,
                    explanation = "'Sin embargo' es un conector adversativo que introduce una objeción o contraargumento científico moderno para refutar la teoría clásica de la tábula rasa.",
                    subject = "Comp. Lectora",
                    semana = 7
                ),
                Challenge(
                    id = "q_cl_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "«La materia orgánica sufrió un proceso de pirólisis; EN OTRAS PALABRAS, se descompuso químicamente por la acción exclusiva del calor en ausencia de oxígeno». \nEl conector subrayado opera como un marcador de:",
                    options = listOf(
                        "Concesión",
                        "Causa",
                        "Reformulación explicativa",
                        "Disyunción exclusiva",
                        "Finalidad teleológica"
                    ),
                    correctIndex = 2,
                    explanation = "'En otras palabras' es un conector de reformulación explicativa o paráfrasis que traduce el tecnolecto 'pirólisis' a una definición sencilla y accesible.",
                    subject = "Comp. Lectora",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "cl_t07_s03",
            subjectId = "comprension_lectora",
            semana = 7,
            subtema = "7.3 Progresión Temática: Modelos de Tema Constante, Lineal y Derivado",
            title = "Modelos de Progresión Temática en el Texto",
            theory = LessonTheory(
                id = "th_cl_t07_s03",
                asignatura = "Comp. Lectora",
                semana = 7,
                titulo = "Modelos de Progresión Temática",
                resumen = "• La Progresión Temática:\n  - Es el mecanismo mediante el cual un texto dosifica la información conocida (*Tema o T*) e incorpora de forma armónica información nueva (*Rema o R*), asegurando que el escrito avance sin atascarse.\n\n• Los Tres Modelos Clásicos de Progresión Temática:\n  1. **Progresión de Tema Constante:**\n     - A un mismo y único tema se le van asignando sucesivamente distintos remas a lo largo de varias oraciones.\n     - Esquema: \$T_1 \\to \$R_1 ; \$T_1 \\to \$R_2 ; \$T_1 \\to \$R_3.\n     - Ejemplo: *«Mariano Melgar nació en Arequipa (\$R_1\$). Fue un notable poeta romántico (\$R_2\$). Murió fusilado en Umachiri (\$R_3\$)»*.\n  2. **Progresión Lineal (En cadena o en escalera):**\n     - El rema (información nueva) de una oración se convierte automáticamente en el tema (información conocida) de la siguiente oración.\n     - Esquema: \$T_1 \\to \$R_1 ; \$R_1 (\$T_2) \\to \$R_2 ; \$R_2 (\$T_3) \\to \$R_3.\n     - Ejemplo: *«La célula posee un núcleo (\$R_1\$). Este núcleo alberga los cromosomas (\$R_2\$). Los cromosomas están formados por ADN (\$R_3\$)»*.\n  3. **Progresión con Hipertema (Temas derivados):**\n     - Existe un hipertema general que se subdivide en varios subtemas coordinados.\n     - Ejemplo: *«Los camélidos andinos son valiosos (\$HT\$). La vicuña posee fibra fina (\$T_A\$). La llama sirve como animal de carga (\$T_B\$)»*.",
                conceptosClave = listOf(
                    "Tema: Información consabida o punto de partida referencial de la oración",
                    "Rema: Información nueva y sustantiva aportada sobre el tema",
                    "Tema constante: Mismo sujeto recibe sucesivos predicados a lo largo del párrafo",
                    "Progresión lineal: El rema precedente se transforma en el tema de la siguiente fase",
                    "Hipertema: Concepto sombrilla que se bifurca en subtemas independientes"
                ),
                formulas = listOf(
                    "\\text{Tema Constante}: \\; T_1 + R_1 \\;; \\; T_1 + R_2 \\;; \\; T_1 + R_3",
                    "\\text{Lineal en Cadena}: \\; T_1 + R_1 \\to R_1 + R_2 \\to R_2 + R_3",
                    "\\text{Derivada}: \\; \\text{Hipertema } H \\implies \\{T_A, T_B, T_C\\}"
                ),
                formulaName = "Modelización de Progresión Textual de Danes",
                formulaLatex = "\\text{Flujo}(T) = \\prod_{i=1}^n \\left( \\text{Tema}_i \\xrightarrow{+\\Delta I} \\text{Rema}_i \\right)",
                formulaDescription = "Dinámica de distribución informativa entre lo conocido y lo novedoso.",
                admissionTip = "Identifica la estructura de 'cadena': si la última palabra de la primera frase se convierte en el sujeto de la segunda, estás ante una 'progresión lineal' de manual.",
                admissionExplanation = "• Los textos científicos pedagógicos utilizan prioritariamente la progresión lineal para construir conceptos paso a paso."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Analice la secuencia: «El volcán Misti domina el paisaje de Arequipa. Esta cumbre andina alcanza los 5822 metros de altitud. Dicho macizo volcánico se originó hace miles de años por erupciones piroclásticas». \n¿Qué modelo de progresión temática se ha empleado?",
                    options = listOf(
                        "Progresión lineal en cadena",
                        "Progresión de tema constante",
                        "Progresión con temas derivados",
                        "Incoherencia por digresión",
                        "Progresión paralelística inconexa"
                    ),
                    correctIndex = 1,
                    explanation = "El sujeto referencial es invariablemente el mismo a lo largo de las tres oraciones (el volcán Misti), al cual se le van sumando nuevos remas o informaciones (su altura, su origen geológico), configurando una progresión de tema constante.",
                    subject = "Comp. Lectora",
                    semana = 7
                ),
                Challenge(
                    id = "q_cl_t07_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Secuencia: «La energía solar es captada por paneles fotovoltaicos. Estos paneles transforman los fotones en corriente eléctrica continua. Dicha corriente es procesada por un inversor para alimentar los electrodomésticos». \nEste fragmento responde al modelo de:",
                    options = listOf(
                        "Tema constante",
                        "Progresión lineal",
                        "Hipertema disyuntivo",
                        "Elipsis retardada",
                        "Catáfora múltiple"
                    ),
                    correctIndex = 1,
                    explanation = "El rema de la primera oración ('paneles fotovoltaicos') se convierte en el tema de la segunda ('Estos paneles...'), y el rema de la segunda ('corriente continua') se convierte en el tema de la tercera ('Dicha corriente...'), lo que constituye una progresión lineal en cadena.",
                    subject = "Comp. Lectora",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "cl_t07_s04",
            subjectId = "comprension_lectora",
            semana = 7,
            subtema = "7.4 Detección de Rupturas de Coherencia y Saltos Lógicos",
            title = "Rupturas de Coherencia, Saltos Lógicos y Digresiones",
            theory = LessonTheory(
                id = "th_cl_t07_s04",
                asignatura = "Comp. Lectora",
                semana = 7,
                titulo = "Rupturas de Coherencia y Saltos Lógicos",
                resumen = "• Las Rupturas de Coherencia en la Lectura Crítica:\n  - Un texto universitario defectuoso o una pregunta trampa en admisión puede presentar fracturas en la consistencia semántica global.\n\n• Modalidades de Fractura Textual:\n  1. **Salto Lógico (Non sequitur):**\n     - La conclusión o siguiente enunciado no se deduce ni guarda relación lógica fundada con las premisas precedentes.\n     - Ejemplo: *«El silicio es un elemento semiconductor abundante en la corteza terrestre. Por consiguiente, los ingenieros deben estudiar historia del arte medieval»* (Salto lógico injustificado).\n  2. **Contradicción Oculta:**\n     - El texto afirma una tesis en el primer párrafo y hacia el final asume como verdadera una premisa que anula formalmente a la primera.\n  3. **Digresión Temática Impertinente:**\n     - El autor se desvía del hilo conductor para relatar anécdotas personales o detalles accesorios irrelevantes que entorpecen la progresión temática.",
                conceptosClave = listOf(
                    "Salto lógico (Non sequitur): Inferencia o paso oracional sin fundamentación en las premisas",
                    "Ruptura de coherencia: Desconexión semántica que anula el sentido de unidad global",
                    "Contradicción subrepticia: Incompatibilidad entre dos proposiciones del mismo texto",
                    "Digresión: Desviación o extravío voluntario del eje temático central"
                ),
                formulas = listOf(
                    "\\text{Non Sequitur}: \\; P_1 \\land P_2 \\dots \\not\\vdash C \\quad (\\text{Invalidez deductiva})",
                    "\\text{Fractura}: \\; \\text{Tema}(O_{k}) \\cap \\text{Tema Global} = \\emptyset"
                ),
                formulaName = "Filtro de Consistencia Secuencial",
                formulaLatex = "\\text{Texto Válido} \\iff \\forall i, \\; O_i \\xrightarrow{\\text{coherencia}} O_{i+1} \\quad (\\text{Cadena Continua})",
                formulaDescription = "Condición de encadenamiento armónico sin quiebres interpretativos.",
                admissionTip = "Si al leer un párrafo sientes que 'falta una explicación' o que 'la conclusión no tiene nada que ver con lo que venían diciendo', has localizado un salto lógico o una ruptura de coherencia.",
                admissionExplanation = "• En preguntas de corrección de textos, identificar el salto lógico te permite detectar la oración que debe ser eliminada o modificada."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Lea atentamente: «(I) La desnutrición infantil crónica frena el desarrollo neurológico de los niños en sus primeros años de vida. (II) La carencia de hierro y proteínas impide la adecuada mielinización de las neuronas. (III) Por lo tanto, los gobiernos deben aumentar los impuestos a la importación de automóviles deportivos». ¿Qué anomalía textual se evidencia en la oración (III)?",
                    options = listOf(
                        "Anfibología léxica",
                        "Salto lógico injustificado (non sequitur)",
                        "Paronimia de términos",
                        "Pleonasmo vicioso",
                        "Catáfora incompleta"
                    ),
                    correctIndex = 1,
                    explanation = "La oración (III) concluye de manera inconexa e injustificada sobre impuestos a automóviles deportivos a partir de premisas médicas sobre la desnutrición infantil, configurando un evidente salto lógico o non sequitur.",
                    subject = "Comp. Lectora",
                    semana = 7
                ),
                Challenge(
                    id = "q_cl_t07_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el efecto de una digresión temática no controlada en un texto expositivo?",
                    options = listOf(
                        "Mejora la precisión terminológica de los conceptos científicos.",
                        "Vulnera la coherencia global y entorpece la progresión temática del escrito.",
                        "Aumenta la fuerza argumentativa de la tesis.",
                        "Garantiza la monosemia de los tecnolectos.",
                        "Convierte al texto en un ensayo poético de vanguardia."
                    ),
                    correctIndex = 1,
                    explanation = "La digresión aparta al lector del asunto central, diluyendo el foco monográfico y vulnerando tanto la coherencia global como la progresión armónica de la información.",
                    subject = "Comp. Lectora",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: TIPOS DE TEXTO SEGÚN SU FORMATO Y MODALIDAD (SEMANA 8)
        // =========================================================================
        LessonNode(
            id = "cl_t08_s01",
            subjectId = "comprension_lectora",
            semana = 8,
            subtema = "8.1 Textos Expositivos y Científicos: Estructura y Divulgación",
            title = "El Texto Expositivo y Científico",
            theory = LessonTheory(
                id = "th_cl_t08_s01",
                asignatura = "Comp. Lectora",
                semana = 8,
                titulo = "Textos Expositivos y Científicos",
                resumen = "• El Texto Expositivo-Científico:\n  - Modalidad discursiva cuyo propósito esencial es transmitir información objetiva, rigurosa y verificable sobre fenómenos naturales, descubrimientos tecnológicos o procesos formales.\n  - Se caracteriza por la objetividad, la monosemia, el uso de verbos en modo indicativo y la ausencia de apreciaciones emocionales subjetivas.\n\n• Estructura Canónica:\n  1. **Introducción:** Presentación del objeto de estudio, marco conceptual o definición inicial.\n  2. **Desarrollo:** Análisis sistemático de las propiedades, fases, leyes, causas o clasificaciones del fenómeno.\n  3. **Conclusión / Resumen:** Síntesis de los resultados observados o perspectivas de investigación futura.\n\n• Formatos Típicos en Admisión UNSA:\n  - Artículos de divulgación médica, avances astronómicos, descubrimientos biológicos o informes vulcanológicos sobre la cordillera andina.",
                conceptosClave = listOf(
                    "Texto expositivo: Transmisión neutra y estructurada de conocimientos científicos",
                    "Monosemia y denotación: Ausencia de figuras retóricas ambiguas o dobles sentidos",
                    "Estructura tripartita: Introducción definitoria, desarrollo analítico y conclusión síntesis",
                    "Modo indicativo: Predominio de oraciones aseverativas objetivas"
                ),
                formulas = listOf(
                    "\\text{Texto Expositivo} = \\text{Definición} + \\text{Explicación Causal / Clasificación} + \\text{Síntesis}",
                    "\\text{Registro} = \\text{Formal / Científico} \\quad (\\text{Cero Valoraciones Emocionales})"
                ),
                formulaName = "Arquitectura del Discurso Científico",
                formulaLatex = "\\text{Exposición} = \\text{Objetividad}(1.0) \\land \\text{Denotación}(1.0) \\land \\text{Estructura Tripartita}",
                formulaDescription = "Parámetros canónicos de la textualidad expositiva pura.",
                admissionTip = "En textos expositivos científicos, las preguntas de idea principal suelen coincidir con la definición del fenómeno o con la ley biológica/física explicada a lo largo del desarrollo.",
                admissionExplanation = "• No busques polémica ni bandos contrarios en un texto expositivo puro: su único fin es explicar la realidad."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un texto que expone de forma objetiva la estructura molecular del ADN, detalla los enlaces de hidrógeno entre bases nitrogenadas y concluye resumiendo la replicación celular, se clasifica como:",
                    options = listOf(
                        "Texto argumentativo de opinión",
                        "Texto expositivo científico",
                        "Texto narrativo de ficción",
                        "Texto dramático teatral",
                        "Ensayo lírico subjetivo"
                    ),
                    correctIndex = 1,
                    explanation = "La objetividad denotativa, la ausencia de juicios de valor y la explicación rigurosa de un fenómeno biológico definen inequívocamente al texto expositivo científico.",
                    subject = "Comp. Lectora",
                    semana = 8
                ),
                Challenge(
                    id = "q_cl_t08_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el rasgo lingüístico distintivo que predomina en un texto expositivo de divulgación astronómica?",
                    options = listOf(
                        "Uso abundante de metáforas oscuras e hipérboles poéticas",
                        "Empleo del modo indicativo y lenguaje denotativo preciso",
                        "Uso constante de oraciones imperativas de mandato",
                        "Presencia de adjetivos denigrantes y polémicos",
                        "Escritura en versos rimados de arte mayor"
                    ),
                    correctIndex = 1,
                    explanation = "El texto expositivo científico descansa sobre la denotación y el modo indicativo para describir la realidad con objetividad y exactitud.",
                    subject = "Comp. Lectora",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "cl_t08_s02",
            subjectId = "comprension_lectora",
            semana = 8,
            subtema = "8.2 Textos Argumentativos y Ensayísticos: Tesis y Controversia Dialéctica",
            title = "El Texto Argumentativo y la Controversia Dialéctica",
            theory = LessonTheory(
                id = "th_cl_t08_s02",
                asignatura = "Comp. Lectora",
                semana = 8,
                titulo = "El Texto Argumentativo y Dialéctico",
                resumen = "• El Texto Argumentativo y Ensayístico:\n  - Modalidad discursiva orientada a fundamentar una postura (tesis) ante un problema controvertido que admite diversas interpretaciones opuestas.\n  - Su objetivo primordial es persuadir, convencer o refutar.\n\n• Los Textos Dialécticos en Admisión (Texto A vs. Texto B):\n  - Formato estelar del prospecto UNSA / DECO: Se presentan dos textos breves firmados por autores distintos que abordan la misma problemática desde posturas antagónicas.\n  - Preguntas Clave en Textos Dialécticos:\n    1. **La Discrepancia Central (Punto de Conflicto):** ¿Sobre qué cuestión específica están en desacuerdo ambos autores? (Debe ser la pregunta polémica exacta que divide a los textos).\n    2. **La Coincidencia o Punto de Contacto:** ¿En qué dato, principio ético o antecedente fáctico están de acuerdo ambos autores a pesar de sus discrepancias de fondo?\n    3. **Los Argumentos Específicos:** ¿Con qué razones sostiene su postura el autor A y cómo lo refuta el autor B?",
                conceptosClave = listOf(
                    "Texto argumentativo: Defensa fundada de una tesis controvertida ante un auditorio",
                    "Textos dialécticos (Texto A vs. B): Confrontación explícita de dos posturas antagónicas",
                    "Punto de discrepancia: Cuestión nodal controvertida sobre la cual discrepan los autores",
                    "Punto de coincidencia: Premisa compartida por ambos bandos a pesar de la disputa"
                ),
                formulas = listOf(
                    "\\text{Discrepancia Central} = \\text{Pregunta Polémica} \\implies \\text{Texto A dice SÍ} \\; \\land \\; \\text{Texto B dice NO}",
                    "\\text{Punto de Contacto} = T_A \\cap T_B \\quad (\\text{Aceptado por ambos autores})"
                ),
                formulaName = "Ecuación de la Controversia Dialéctica",
                formulaLatex = "\\text{Discrepancia} = \\arg\\min_Q |\\text{Respuesta}_A(Q) - \\text{Respuesta}_B(Q)|_{\\text{opuestos}}",
                formulaDescription = "Identificación matemática del núcleo de incompatibilidad entre dos posturas.",
                admissionTip = "En preguntas de 'El punto de discrepancia entre ambos textos es...', formula la alternativa como una pregunta: si el Texto A responde 'SÍ' y el Texto B responde 'NO' a esa pregunta exacta, ¡has hallado la discrepancia central!",
                admissionExplanation = "• No elijas como discrepancia un tema donde un autor opina y el otro guarda silencio; ambos deben haberse pronunciado en sentidos contrarios."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un examen de admisión se confrontan dos lecturas: el Texto A sostiene que la energía nuclear es imprescindible para frenar el cambio climático por sus bajas emisiones; el Texto B afirma que la energía nuclear debe ser prohibida por el riesgo de catástrofes atómicas y los desechos radiactivos. ¿Cuál es el PUNTO DE DISCREPANCIA central?",
                    options = listOf(
                        "Si el cambio climático es real o ficticio.",
                        "Si la energía nuclear debe emplearse o rechazarse como fuente energética contemporánea.",
                        "El costo económico del uranio en los mercados internacionales.",
                        "La fórmula de equivalencia masa-energía de Einstein.",
                        "El número exacto de reactores nucleares en Europa."
                    ),
                    correctIndex = 1,
                    explanation = "La discrepancia gira con exactitud en torno a si la energía nuclear debe adoptarse como solución energética (Texto A: Sí) o si debe ser rechazada y prohibida por sus riesgos (Texto B: No).",
                    subject = "Comp. Lectora",
                    semana = 8
                ),
                Challenge(
                    id = "q_cl_t08_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En los textos del caso anterior, ¿cuál podría ser un PUNTO DE COINCIDENCIA entre el Texto A y el Texto B?",
                    options = listOf(
                        "Que los residuos radiactivos son completamente inofensivos para la salud.",
                        "Que las plantas atómicas jamás sufren fallas técnicas.",
                        "Que el cambio climático y la crisis energética representan problemas globales reales.",
                        "Que la energía nuclear debe prohibirse en todos los continentes.",
                        "Que el carbón y el petróleo son las mejores fuentes de energía del futuro."
                    ),
                    correctIndex = 2,
                    explanation = "Ambos autores coinciden en la premisa fáctica de fondo: el cambio climático y la crisis energética son problemas reales y urgentes; lo que disputan es si la energía nuclear es el medio idóneo para resolverlos.",
                    subject = "Comp. Lectora",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "cl_t08_s03",
            subjectId = "comprension_lectora",
            semana = 8,
            subtema = "8.3 Textos Narrativos y Biográficos: Trama, Conflicto y Cronología",
            title = "El Texto Narrativo y Biográfico: Trama y Conflicto",
            theory = LessonTheory(
                id = "th_cl_t08_s03",
                asignatura = "Comp. Lectora",
                semana = 8,
                titulo = "Textos Narrativos y Biográficos",
                resumen = "• El Texto Narrativo:\n  - Modalidad discursiva que relata una sucesión temporal de acontecimientos reales o ficticios protagonizados por personajes en un espacio y tiempo determinados.\n\n• Elementos Estructurales Fundamentales:\n  1. **El Conflicto Central:** Problema, tensión o nudo dramático que quiebra el equilibrio inicial y moviliza las acciones de los personajes.\n  2. **La Secuencia Narrativa Canónica:**\n     - *Inicio / Planteamiento:* Presentación de personajes, época y ambiente.\n     - *Nudo / Clímax:* Punto de máxima tensión dramática donde el conflicto alcanza su momento culminante.\n     - *Desenlace:* Resolución del conflicto (favorable, trágico o abierto).\n  3. **El Narrador:**\n     - En primera persona (*narrador protagonista o testigo*).\n     - En tercera persona (*narrador omnisciente* que conoce pensamientos íntimos, o *narrador objetivo/cámara*).\n\n• Los Textos Biográficos en Admisión:\n  - Relatan la trayectoria vital e intelectual de científicos, escritores o líderes sociales, enfatizando los obstáculos superados y el legado perdurable a la humanidad.",
                conceptosClave = listOf(
                    "Texto narrativo: Relato cronológico de sucesos encadenados por causas y efectos",
                    "Conflicto dramático: Núcleo de tensión que impulsa la acción del protagonista",
                    "Clímax: Momento de máxima tensión emotiva y decisiva de la narración",
                    "Narrador omnisciente: Voz que conoce los pensamientos y motivaciones íntimas de los personajes"
                ),
                formulas = listOf(
                    "\\text{Estructura Narrativa} = \\text{Planteamiento} \\to \\text{Conflicto / Nudo} \\to \\text{Clímax} \\to \\text{Desenlace}",
                    "\\text{Texto Biográfico} = \\text{Contexto} + \\text{Formación} + \\text{Crisis / Logro Cumbre} + \\text{Trascendencia}"
                ),
                formulaName = "Morfología de la Trama Narrativa",
                formulaLatex = "\\text{Narración} = \\int_{t_0}^{t_f} \\left( \\text{Acciones}(\\text{Personaje}) \\times \\text{Conflicto} \\right) dt",
                formulaDescription = "Desarrollo temporal de las acciones bajo la dinámica del conflicto narrativo.",
                admissionTip = "Identifica el CLÍMAX: es el momento exacto donde el personaje toma la decisión crucial o donde ocurre el giro definitivo de la historia antes del final.",
                admissionExplanation = "• En textos biográficos, no te quedes en el anecdotario; la pregunta suele apuntar a la importancia histórica o científica del personaje."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un relato sobre la batalla de Umachiri, el momento exacto en que Mariano Melgar es capturado en el campo de combate y puesto frente al pelotón de fusilamiento tras rechazar el indulto representa:",
                    options = listOf(
                        "El inicio expositivo del texto",
                        "El clímax dramático de la narración",
                        "Una digresión inatingente secundaria",
                        "El epílogo cronológico póstumo",
                        "Una paráfrasis lexicográfica"
                    ),
                    correctIndex = 1,
                    explanation = "La captura, el rechazo heroico del indulto y el encaramiento al pelotón constituyen el punto de máxima tensión emotiva y trascendencia del relato, lo que define al clímax narrativo.",
                    subject = "Comp. Lectora",
                    semana = 8
                ),
                Challenge(
                    id = "q_cl_t08_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un narrador que describe: «Juan sentía una angustia devoradora mientras miraba el reloj, recordando el juramento secreto que había hecho a su madre en su lecho de muerte», se clasifica como:",
                    options = listOf(
                        "Narrador testigo externo",
                        "Narrador omnisciente",
                        "Narrador protagonista en segunda persona",
                        "Narrador cinematográfico objetivo",
                        "Narrador epistolar"
                    ),
                    correctIndex = 1,
                    explanation = "Al conocer los sentimientos íntimos ('angustia devoradora') y los recuerdos secretos del personaje, el narrador evidencia una perspectiva omnisciente en tercera persona.",
                    subject = "Comp. Lectora",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "cl_t08_s04",
            subjectId = "comprension_lectora",
            semana = 8,
            subtema = "8.4 Textos Filosóficos y Humanísticos: Densidad Conceptual y Problematización",
            title = "El Texto Filosófico: Problematización Ontológica y Ética",
            theory = LessonTheory(
                id = "th_cl_t08_s04",
                asignatura = "Comp. Lectora",
                semana = 8,
                titulo = "Textos Filosóficos y Humanísticos",
                resumen = "• El Texto Filosófico en Admisión (El Mayor Reto Cognitivo):\n  - Modalidad discursiva que somete a examen crítico radical los fundamentos de la realidad (*ontología*), los límites del conocimiento (*gnoseología/epistemología*), el sentido de la existencia (*antropología filosófica*) o el deber moral (*ética*).\n  - Se caracteriza por una elevadísima densidad conceptual, abstracción teórica y constante problematización dialéctica.\n\n• Estrategia de Decodificación de Textos Filosóficos:\n  1. **Identificar el Problema Filosófico Matriz:**\n     - ¿Qué pregunta fundamental se está planteando el filósofo? (*¿Es posible el conocimiento verdadero? ¿Qué es la justicia? ¿Tiene el hombre libre albedrío?*).\n  2. **Definir los Conceptos Nucleares en el Sistema del Autor:**\n     - Las palabras comunes adquieren sentidos filosóficos técnicos muy precisos (*ser, devenir, fenómeno, noúmeno, substancia, alienación*).\n  3. **Rastrear la Argumentación Crítica:**\n     - Observar contra qué corriente filosófica anterior está debatiendo el autor (e.g., el empirismo criticando al racionalismo dogmático).\n\n• Tipos de Preguntas Frecuentes:\n  - *«La tesis central del filósofo postula que...»*\n  - *«Para el autor, la libertad consiste fundamentalmente en...»*",
                conceptosClave = listOf(
                    "Texto filosófico: Problematización crítica y radical de los fundamentos de la existencia",
                    "Densidad conceptual: Uso riguroso de nociones abstractas (ontología, gnoseología)",
                    "Pregunta filosófica rectora: Problema matriz que articula toda la reflexión teórica",
                    "Contexto del debate: Confrontación de escuelas filosóficas (idealismo vs. materialismo)"
                ),
                formulas = listOf(
                    "\\text{Texto Filosófico} = \\text{Pregunta Radical} + \\text{Crítica a Paradigmas Previos} + \\text{Sistema Conceptual}",
                    "\\text{Decodificación} = \\text{Desentrañar el Sentido Privativo de los Conceptos Abstractos}"
                ),
                formulaName = "Matriz Hermenéutica Filosófica",
                formulaLatex = "\\text{Filosofía}(T) = \\arg\\max_{\\Phi} \\left[ \\text{Problematización}(\\Phi, T) \\cdot \\text{Abstracción}(\\Phi) \\right]",
                formulaDescription = "Decodificación hermenéutica de textos de alta densidad especulativa.",
                admissionTip = "No te asustes por el lenguaje abstracto de autores como Kant, Platón, Nietzsche o Heidegger. Tómate 10 segundos adicionales para identificar la PREGUNTA que el filósofo intenta responder; una vez que descubres la pregunta, todo el texto se aclara como agua cristalina.",
                admissionExplanation = "• En preguntas sobre textos filosóficos, las alternativas suelen reformular las tesis densas con palabras del español estándar; busca la equivalencia lógica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_cl_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Texto: «El hombre nace libre, pero en todas partes se halla encadenado. Hay quien se cree dueño de los demás y no por ello deja de ser menos esclavo que ellos. ¿Cómo se ha producido este cambio? Lo ignoro. ¿Qué puede hacerlo legítimo? Creo poder resolver esta cuestión: el pacto social mediante el cual cada individuo enajena sus derechos a la comunidad para ganar la libertad civil». (Rousseau). \nLa cuestión filosófica medular que el autor se propone resolver es:",
                    options = listOf(
                        "Las causas biológicas del nacimiento humano.",
                        "El fundamento ético y político que otorga legitimidad al orden social y a la libertad civil.",
                        "La superioridad de los amos sobre los esclavos en la Antigüedad.",
                        "La fabricación de cadenas de hierro en Europa.",
                        "La inutilidad absoluta de todo gobierno republicano."
                    ),
                    correctIndex = 1,
                    explanation = "Rousseau formula explícitamente la pregunta que se propone resolver: '¿Qué puede hacerlo legítimo?', concluyendo que es el pacto social el que legitima la convivencia civil y la libertad política.",
                    subject = "Comp. Lectora",
                    semana = 8
                ),
                Challenge(
                    id = "q_cl_t08_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el texto anterior, la célebre paradoja: «Hay quien se cree dueño de los demás y no por ello deja de ser menos esclavo que ellos», significa filosóficamente que:",
                    options = listOf(
                        "Los esclavos ganan más salario que sus amos.",
                        "Quien tiraniza a sus semejantes se vuelve prisionero de su propia tiranía y dependiente de la opresión.",
                        "La esclavitud es un fenómeno exclusivamente económico moderno.",
                        "Los amos y los esclavos son físicamente idénticos.",
                        "Nadie puede gobernar sin el permiso de los esclavos."
                    ),
                    correctIndex = 1,
                    explanation = "La paradoja ética revela que el opresor o tirano que pretende poseer a otros queda atrapado en un sistema ilegítimo de dominación que lo priva de su propia condición de hombre moral libre.",
                    subject = "Comp. Lectora",
                    semana = 8
                )
            )
        )
    )
}
