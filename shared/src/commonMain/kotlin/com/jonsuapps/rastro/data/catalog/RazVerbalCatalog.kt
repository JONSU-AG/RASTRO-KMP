package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object RazVerbalCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: RELACIONES SEMÁNTICAS BÁSICAS (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "rv_t01_s01",
            subjectId = "raz_verbal",
            semana = 1,
            subtema = "1.1 Sinonimia Contextual y Campo Semántico",
            title = "Sinonimia Contextual y Campos Semánticos",
            theory = LessonTheory(
                id = "th_rv_t01_s01",
                asignatura = "Raz. Verbal",
                semana = 1,
                titulo = "Sinonimia Contextual y Redes Semánticas",
                resumen = "• La Sinonimia Contextual (Superación del Diccionario Abstracto):\n  - En el examen de admisión UNSA no existe la sinonimia absoluta o universal; dos términos son sinónimos únicamente si comparten los mismos semas nucleares en un contexto discursivo concreto.\n  - El intercambio del vocablo debe preservar el significado exacto, la coherencia lógica y el registro lingüístico de la proposición original.\n  - Ejemplo: 'El médico emitió un diagnóstico **acertado**' $\\to$ Sinónimo contextual: **certero / preciso** (no 'afortunado' ni 'premiado').\n\n• Campo Semántico y Archisemema:\n  - Un campo semántico es el conjunto de palabras de la misma categoría gramatical que comparten un rasgo semántico común indispensable (archisemema).\n  - Para resolver preguntas de sinonimia contextual, se debe aislar el núcleo semántico de la oración y verificar qué alternativa pertenece al mismo campo semántico sin alterar el matiz estilístico.",
                conceptosClave = listOf(
                    "Sinonimia contextual: Equivalencia de sentido condicionada por el entorno oracional",
                    "Archisemema: Rasgo semántico nuclear compartido por los miembros de un campo",
                    "Registro lingüístico: Adecuación formal o técnica del término sustituto",
                    "Inexistencia de sinonimia absoluta: Todo vocablo posee matices privativos"
                ),
                formulas = listOf(
                    "A \\approx_{\\text{contexto}} B \\iff \\text{Sentido}(O[A]) = \\text{Sentido}(O[B])",
                    "\\text{Sinonimia Válida} = \\text{Sema Común} + \\text{Misma Categoría Gramatical} + \\text{Adecuación Contextual}"
                ),
                formulaName = "Ley de Conmutación Contextual",
                formulaLatex = "S_1 \\leftrightarrow S_2 \\quad (\\text{en el contexto } C) \\implies \\text{Preservación de Verdad}",
                formulaDescription = "Condición de equivalencia semántica sustitutiva sin pérdida informativa.",
                admissionTip = "Nunca busques el sinónimo de diccionario que aprendiste de memoria. Lee la oración completa, tapa mentalmente la palabra subrayada y deduce qué palabra encaja por lógica antes de mirar las alternativas.",
                admissionExplanation = "• En preguntas de la UNSA, si el término está en sentido figurado o connotativo, su sinónimo contextual debe reproducir ese mismo valor expresivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el enunciado: «El magistrado emitió un veredicto ECUÁNIME que disipó las sospechas de parcialidad en el tribunal», el sinónimo contextual de la palabra en mayúsculas es:",
                    options = listOf(
                        "Severo",
                        "Imparcial",
                        "Drástico",
                        "Benévolo",
                        "Premuroso"
                    ),
                    correctIndex = 1,
                    explanation = "En el contexto judicial y frente a 'sospechas de parcialidad', 'ecuánime' denota rectitud, objetividad y justicia sin favoritismos, por lo que su sinónimo contextual exacto es 'imparcial'.",
                    subject = "Raz. Verbal",
                    semana = 1
                ),
                Challenge(
                    id = "q_rv_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el texto: «Tras el fracaso electoral, el dirigente político adoptó una postura PUSILÁNIME ante las críticas de la prensa», el vocablo subrayado puede sustituirse por:",
                    options = listOf(
                        "Despectiva",
                        "Cobarde",
                        "Altiva",
                        "Indiferente",
                        "Prudente"
                    ),
                    correctIndex = 1,
                    explanation = "'Pusilánime' designa a quien carece de valor, ánimo y entereza ante el peligro o la adversidad; en dicho entorno equivale contextualmente a 'cobarde' o 'temeroso'.",
                    subject = "Raz. Verbal",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rv_t01_s02",
            subjectId = "raz_verbal",
            semana = 1,
            subtema = "1.2 Antonimia Contextual: Oposición Gradual, Complementaria y Recíproca",
            title = "Antonimia Contextual y Tipos de Oposición Semántica",
            theory = LessonTheory(
                id = "th_rv_t01_s02",
                asignatura = "Raz. Verbal",
                semana = 1,
                titulo = "Antonimia Contextual y Clases de Antónimos",
                resumen = "• Antonimia Contextual:\n  - Relación de incompatibilidad o contradicción semántica entre dos palabras dependiente del contexto oracional.\n  - No basta con invertir un significado genérico; el antónimo debe contraponerse con exactitud al valor contextual específico del término en cuestión.\n\n• Clasificación Estructural de los Antónimos:\n  1. **Antónimos Graduales (Extremos con grados intermedios):** La negación de uno no implica necesariamente la afirmación del otro (*frío - caliente*, existiendo *tibio, templado, fresco*).\n  2. **Antónimos Complementarios (Exclusión dicotómica binaria):** La afirmación de uno anula obligatoriamente al otro sin puntos medios (*vivo - muerto*, *legal - ilegal*, *presente - ausente*).\n  3. **Antónimos Recíprocos o Inversos (Relación bidireccional):** Un término implica necesariamente la existencia del otro desde perspectivas opuestas (*comprar - vender*, *profesor - alumno*, *dar - recibir*).\n\n• Regla Gramatical Obligatoria:\n  - El antónimo debe pertenecer con rigor a la **misma categoría gramatical** que la palabra matriz (sustantivo con sustantivo, adjetivo con adjetivo, verbo con verbo).",
                conceptosClave = listOf(
                    "Antonimia gradual: Permite estados o matices intermedios en una escala",
                    "Antonimia complementaria: Exclusión mutua sin términos medios (vida/muerte)",
                    "Antonimia recíproca: Acciones interdependientes vistas desde polos opuestos",
                    "Isocategoría gramatical: Identidad obligatoria de clase formal entre antónimos"
                ),
                formulas = listOf(
                    "\\text{Gradual}: \\; A < M_1 < M_2 < B \\quad (\\text{ej. gélido} < \\text{frío} < \\text{tibio} < \\text{cálido})",
                    "\\text{Complementario}: \\; A \\iff \\neg B \\quad (\\text{ej. vivo} \\iff \\neg \\text{muerto})",
                    "\\text{Recíproco}: \\; x R y \\iff y R^{-1} x \\quad (\\text{ej. x compra a y} \\iff \\text{y vende a x})"
                ),
                formulaName = "Ecuación de Oposición Semántica",
                formulaLatex = "\\text{Antónimo Válido} = \\text{Oposición Semémica} \\land \\text{CatGram}(A) = \\text{CatGram}(B)",
                formulaDescription = "Condición de contradicción léxica e identidad morfosintáctica.",
                admissionTip = "Verifica siempre la categoría gramatical antes de marcar. Si la palabra base es un adjetivo (ej. 'efímero'), el antónimo debe ser otro adjetivo (ej. 'eterno' o 'duradero'), jamás un sustantivo como 'eternidad'.",
                admissionExplanation = "• En los antónimos complementarios, negar uno equivale a afirmar el otro; ten presente esta dicotomía para responder con rapidez."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la expresión: «El orador pronunció un discurso LACÓNICO que no resolvió las dudas de los asambleístas», el antónimo contextual más preciso es:",
                    options = listOf(
                        "Breve",
                        "Elocuente",
                        "Floco",
                        "Locuaz",
                        "Sintético"
                    ),
                    correctIndex = 3,
                    explanation = "'Lacónico' significa breve, conciso o parco en el uso de palabras. Su antónimo contextual exacto es 'locuaz' o 'prolijo' (que habla o contiene abundantes palabras).",
                    subject = "Raz. Verbal",
                    semana = 1
                ),
                Challenge(
                    id = "q_rv_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué tipo de relación de antonimia se manifiesta entre los términos COMPRADOR y VENDEDOR?",
                    options = listOf(
                        "Antonimia gradual",
                        "Antonimia recíproca",
                        "Antonimia complementaria",
                        "Antonimia morfológica",
                        "Homonimia semántica"
                    ),
                    correctIndex = 1,
                    explanation = "Son antónimos recíprocos porque la existencia de un comprador presupone indispensablemente la existencia correlativa de un vendedor en la transacción económica.",
                    subject = "Raz. Verbal",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rv_t01_s03",
            subjectId = "raz_verbal",
            semana = 1,
            subtema = "1.3 Polisemia, Homonimia (Homófonas y Homógrafas) y Paronimia",
            title = "Polisemia, Homonimia y Paronimia en Exámenes",
            theory = LessonTheory(
                id = "th_rv_t01_s03",
                asignatura = "Raz. Verbal",
                semana = 1,
                titulo = "Polisemia, Homonimia y Paronimia",
                resumen = "• Polisemia vs. Homonimia (Distinción Esencial UNSA):\n  1. **Polisemia (Misma etimología y sema común):**\n     - Una misma palabra posee varios significados emparentados por un rasgo semántico compartido o metáfora.\n     - Ejemplo: *pico* (de ave) / *pico* (herramienta puntiaguda) / *pico* (cumbre aguda de montaña) $\\to$ sema común: 'extremo agudo o saliente'.\n     - En el diccionario comparten una sola entrada lexicográfica con múltiples acepciones.\n  2. **Homonimia (Distinta etimología y significados inconexos):**\n     - Dos palabras de orígenes históricos completamente diferentes que por evolución fonética terminaron coincidiendo formalmente.\n     - En el diccionario figuran como entradas independientes separadas.\n     - Subclases:\n       * **Homófonas (Mismo sonido, diferente escritura):** *tubo* (cilindro hueco) / *tuvo* (del verbo tener); *bello* / *vello*; *cima* (cumbre) / *sima* (abismo).\n       * **Homógrafas (Misma escritura y mismo sonido):** *lima* (fruta cítrica, de origen árabe) / *lima* (herramienta abrasiva, del latín *lima*) / *Lima* (capital del Perú, del quechua *Rímac*).\n\n• Paronimia (Semejanza fónica con significados dispares):\n  - Palabras parecidas en pronunciación o escritura que suelen confundirse en redacción:\n    * *Inocuo* (inofensivo, que no causa daño) vs. *Inicuo* (injusto, inicuo, malvado).\n    * *Aptitud* (capacidad o destreza) vs. *Actitud* (disposición anímica).\n    * *Prever* (anticipar el futuro) vs. *Proveer* (abastecer de insumos).",
                conceptosClave = listOf(
                    "Polisemia: Mismo origen etimológico y presencia de sema nuclear compartido",
                    "Homonimia: Orígenes etimológicos distintos que coinciden por azar fonético",
                    "Homófonos: Igual pronunciación pero grafía diferente (tubo/tuvo, cima/sima)",
                    "Paronimia: Parecido fonético que exige precisión rigurosa (inocuo/inicuo)"
                ),
                formulas = listOf(
                    "\\text{Polisemia} = 1 \\text{ Significante} \\to \\{S_1, S_2, S_3\\} \\quad (\\text{con } \\text{Sema}_{\\text{común}})",
                    "\\text{Homonimia} = \\text{Significante}_A \\equiv \\text{Significante}_B \\quad (\\text{Etimología}_A \\neq \\text{Etimología}_B)",
                    "\\text{Paronimia} = \\text{Significante}_A \\approx \\text{Significante}_B \\quad (\\text{Sentidos Dispares})"
                ),
                formulaName = "Matriz de Diferenciación Léxica",
                formulaLatex = "\\text{Relación} = \\begin{cases} \\text{Polisemia} & \\text{si } \\text{Etimo}_1 = \\text{Etimo}_2 \\land \\text{Sema Común} \\\\ \\text{Homonimia} & \\text{si } \\text{Etimo}_1 \\neq \\text{Etimo}_2 \\\\ \\text{Paronimia} & \\text{si Fónicamente Semejantes} \\end{cases}",
                formulaDescription = "Algoritmo de clasificación de fenómenos léxicos y relaciones formales.",
                admissionTip = "Aprende el clásico parónimo de la UNSA: 'sima' con 's' es cavidad profunda o abismo terrestre; 'cima' con 'c' es la cúspide o pico más alto de una montaña.",
                admissionExplanation = "• En los diccionarios, la polisemia tiene números (1, 2, 3) bajo una sola palabra, mientras que las palabras homónimas figuran con entradas separadas independientes."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las palabras CIMA (cumbre más alta de una montaña) y SIMA (abismo o profunda cavidad subterránea) constituyen un caso de:",
                    options = listOf(
                        "Polisemia",
                        "Paronimia",
                        "Homonimia homófona",
                        "Homonimia homógrafa",
                        "Sinonimia contextual"
                    ),
                    correctIndex = 2,
                    explanation = "En el español de América (con seseo fonológico), ambas palabras se pronuncian de idéntica manera (/s-í-m-a/), pero se escriben con grafías distintas ('c' y 's') y poseen orígenes y significados totalmente dispares; por ende, son homófonas.",
                    subject = "Raz. Verbal",
                    semana = 1
                ),
                Challenge(
                    id = "q_rv_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En las oraciones: «El campesino afiló la HOJA de su machete» y «El árbol desprendió una HOJA seca durante el otoño», la palabra HOJA evidencia:",
                    options = listOf(
                        "Homonimia absoluta",
                        "Homonimia paradigmática",
                        "Polisemia",
                        "Paronimia léxica",
                        "Antonimia complementaria"
                    ),
                    correctIndex = 2,
                    explanation = "Proviene del mismo étimo latino ('folia') y ambos términos conservan un sema común de forma ('lámina plana, delgada y extendida'), lo que define inequívocamente a la polisemia.",
                    subject = "Raz. Verbal",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rv_t01_s04",
            subjectId = "raz_verbal",
            semana = 1,
            subtema = "1.4 Precisión Léxica y Erradicación de Vocablos Vagos y Verbos Comodín",
            title = "Precisión Léxica y Eliminación de Verbos Baúl",
            theory = LessonTheory(
                id = "th_rv_t01_s04",
                asignatura = "Raz. Verbal",
                semana = 1,
                titulo = "Precisión Léxica y Vocablos Comodín",
                resumen = "• El Principio de Precisión Léxica en Admisión:\n  - Consiste en elegir el vocablo exacto y con mayor riqueza conceptual que exprese con rigurosidad la idea, erradicando términos ambiguos o vulgares.\n  - En el examen se presentan oraciones con verbos genéricos ('verbos baúl' o 'comodín') o sustantivos vagos que deben sustituirse por palabras de alta pertinencia semántica.\n\n• Erradicación de Verbos Comodín Recurrentes:\n  1. **Hacer:**\n     - $\\times$ *Hacer un túnel* $\\to$ $\\checkmark$ **Excavar / Perforar** un túnel.\n     - $\\times$ *Hacer un ensayo* $\\to$ $\\checkmark$ **Redactar / Elaborar** un ensayo.\n     - $\\times$ *Hacer daño* $\\to$ $\\checkmark$ **Perjudicar / Ocasionar estragos**.\n     - $\\times$ *Hacer una estatua* $\\to$ $\\checkmark$ **Esculpir / Modelar** una estatua.\n  2. **Tener:**\n     - $\\times$ *Tener síntomas* $\\to$ $\\checkmark$ **Presentar / Manifestar** síntomas.\n     - $\\times$ *Tener un cargo* $\\to$ $\\checkmark$ **Ostentar / Ejercer** un cargo.\n     - $\\times$ *Tener la culpa* $\\to$ $\\checkmark$ **Cargar con / Asumir** la responsabilidad.\n  3. **Poner:**\n     - $\\times$ *Poner atención* $\\to$ $\\checkmark$ **Prestar** atención.\n     - $\\times$ *Poner dinero* $\\to$ $\\checkmark$ **Invertir / Aportar** capital.\n     - $\\times$ *Poner en duda* $\\to$ $\\checkmark$ **Cuestionar / Objetar**.\n  4. **Decir:**\n     - $\\times$ *Decir un poema* $\\to$ $\\checkmark$ **Recitar / Declamar** un poema.\n     - $\\times$ *Decir mentiras* $\\to$ $\\checkmark$ **Propalar / Proferir** falsedades.\n\n• Sustantivos Vagos a Erradicar:\n  - Sustituir palabras como *cosa, algo, asunto, cuestión* por sustantivos precisos (*fenómeno, objeto, premisa, dilema, instrumento*).",
                conceptosClave = listOf(
                    "Precisión léxica: Empleo del vocablo exacto y monosemémico en el contexto",
                    "Verbos comodín o baúl: Verbos semánticamente vacíos (hacer, tener, poner, dar)",
                    "Sustitución cualitativa: Reemplazo por verbos específicos del dominio técnico",
                    "Erradicación de palabras comodín: Prohibición de vocablos vagos como 'cosa' o 'algo'"
                ),
                formulas = listOf(
                    "\\text{Imprecisión: } \\text{Verbo Comodín (Hacer / Tener)} + \\text{Sustantivo}",
                    "\\text{Precisión: } \\text{Verbo Específico Propio del Dominio} \\quad (\\text{ej. esculpir una estatua})",
                    "\\text{Regla}: \\; \\text{Riqueza Léxica} \\propto \\frac{1}{\\text{Frecuencia de Verbos Baúl}}"
                ),
                formulaName = "Fórmula de Sustitución Léxica Rigurosa",
                formulaLatex = "\\text{Vérbum}_{\\text{comodín}} + N \\implies \\text{Vérbum}_{\\text{denotativo}}(N)",
                formulaDescription = "Transformación sintáctico-semántica hacia el registro académico preuniversitario.",
                admissionTip = "Identifica el objeto sobre el que recae la acción: si el objeto es un 'edificio', el verbo no es 'hacer', sino 'erigir' o 'construir'; si es una 'ley', es 'promulgar' o 'sancionar'; si es un 'delito', es 'perpetrar' o 'cometer'.",
                admissionExplanation = "• No te dejes seducir por palabras rebuscadas si no encajan con exactitud morfológica; la precisión prima sobre la rimbombancia hueca."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Reemplace el verbo subrayado por el término de mayor precisión léxica: «Los obreros van a HACER una zanja profunda para instalar las tuberías matrices».",
                    options = listOf(
                        "construir",
                        "excavar",
                        "urdir",
                        "perpetrar",
                        "plasmar"
                    ),
                    correctIndex = 1,
                    explanation = "Una zanja no se construye ni se hace; la acción técnica y léxicamente exacta para abrir zanjas en la tierra es 'excavar'.",
                    subject = "Raz. Verbal",
                    semana = 1
                ),
                Challenge(
                    id = "q_rv_t01_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Mejore la precisión léxica del siguiente enunciado: «El presidente de la asamblea DECÍA fuertes insultos contra sus opositores políticos».",
                    options = listOf(
                        "murmuraba",
                        "susurraba",
                        "profería",
                        "declamaba",
                        "manaba"
                    ),
                    correctIndex = 2,
                    explanation = "El verbo preciso para la emisión verbal de insultos, agravios o maldiciones es 'proferir' ('profería fuertes insultos'). 'Declamar' se reserva para poemas.",
                    subject = "Raz. Verbal",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: ANALOGÍAS VERBALES (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "rv_t02_s01",
            subjectId = "raz_verbal",
            semana = 2,
            subtema = "2.1 Principio Estructural y Método R-O-N (Relación, Orden, Naturaleza)",
            title = "Estructura Analógica y Método R-O-N",
            theory = LessonTheory(
                id = "th_rv_t02_s01",
                asignatura = "Raz. Verbal",
                semana = 2,
                titulo = "El Método R-O-N en Analogías",
                resumen = "• Estructura Canónica de la Analogía:\n  - Proporción semántica formulada como: A : B :: C : D (*«A es a B como C es a D»*).\n  - El objetivo consiste en descubrir la matriz de relación subyacente entre la premisa o par base (A : B) y encontrar el par análogo que reproduzca idéntico patrón relacional.\n\n• El Infalible Método R-O-N (Protocolo de 3 Filtros):\n  1. **R - Relación (Vínculo Lógico Fundamental):**\n     - Construir una oración simple, clara y directa que exprese el vínculo exacto entre A y B.\n     - Ejemplo: *QUIRÓFANO : CIRUJANO* $\\to$ 'El cirujano labora en el quirófano' (Lugar : Agente).\n  2. **O - Orden (Direccionalidad del Vínculo):**\n     - Verificar que el par análogo mantenga exactamente el mismo sentido direccional (A \\to B y no B \\to A).\n     - Si el par base es *Lugar : Agente*, se descarta de inmediato cualquier opción de *Agente : Lugar* (ej. *Docente : Aula* es un distractor invertido).\n  3. **N - Naturaleza (Desempate por Campo Semántico y Matiz):**\n     - Si sobreviven dos opciones con idéntica relación y orden, se desempata analizando el ámbito temático, el tipo de materia, el medio físico o la categoría gramatical.\n     - Entre *Juzgado : Juez* y *Taller : Mecánico*, si el par base era quirúrgico-médico (profesión liberal / académica), *Juzgado : Juez* guarda mayor afinidad de naturaleza.",
                conceptosClave = listOf(
                    "Par base: Pareja matriz que establece el criterio relacional de partida",
                    "R - Relación: Formulación de la oración de enlace semántico entre los términos",
                    "O - Orden: Preservación de la direccionalidad estricta para evitar pares invertidos",
                    "N - Naturaleza: Filtro de afinidad de campo temático para resolver empates"
                ),
                formulas = listOf(
                    "\\text{Analogía: } A : B :: C : D \\iff \\text{Relación}(A, B) \\equiv \\text{Relación}(C, D)",
                    "\\text{Método R-O-N}: \\; \\text{Paso 1 (R)} \\to \\text{Paso 2 (O)} \\to \\text{Paso 3 (N)}"
                ),
                formulaName = "Algoritmo R-O-N de Resolución Analógica",
                formulaLatex = "\\text{Par Clave} = \\arg\\max_{(C, D)} \\left[ \\text{Rel}(A,B) \\land \\text{Ord}(A,B) \\land \\text{Nat}(A,B) \\right]",
                formulaDescription = "Algoritmo secuencial para filtrar distractores y hallar la clave definitiva.",
                admissionTip = "¡El 70% de errores en analogías ocurre por violar el ORDEN! Si la premisa va de causa a efecto, la respuesta DEBE ir de causa a efecto, jamás al revés.",
                admissionExplanation = "• La naturaleza solo se evalúa si hay dos alternativas válidas en relación y orden; no te apresures a aplicarla antes de tiempo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Determine el par análogo que completa la relación: \nQUIRÓFANO : CIRUJANO ::",
                    options = listOf(
                        "Magistrado : Tribunal",
                        "Estadio : Futbolista",
                        "Aula : Catedrático",
                        "Tribunal : Juez",
                        "Plano : Arquitecto"
                    ),
                    correctIndex = 3,
                    explanation = "Relación: Lugar donde labora el profesional especializado (Lugar : Agente). Orden: Primero el recinto de trabajo y luego el profesional. Por naturaleza de profesión de alta investidura intelectual, 'Tribunal : Juez' reproduce el patrón a la perfección. 'Aula : Catedrático' es un distractor plausible, pero el juzgado tiene una solemnidad institucional más próxima al quirófano; y 'Magistrado : Tribunal' está invertido.",
                    subject = "Raz. Verbal",
                    semana = 2
                ),
                Challenge(
                    id = "q_rv_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la analogía: TERREMOTO : DEVASTACIÓN :: \n¿Cuál alternativa infringe el principio de ORDEN direccional?",
                    options = listOf(
                        "Epidemia : Mortandad",
                        "Inundación : Ruina",
                        "Tristeza : Pérdida",
                        "Incendio : Ceniza",
                        "Bancarrota : Despido"
                    ),
                    correctIndex = 2,
                    explanation = "La premisa plantea 'Causa : Efecto' (el terremoto genera devastación). 'Tristeza : Pérdida' plantea 'Efecto : Causa' (la tristeza es consecuencia de la pérdida), lo que constituye una infracción flagrante del principio de orden.",
                    subject = "Raz. Verbal",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rv_t02_s02",
            subjectId = "raz_verbal",
            semana = 2,
            subtema = "2.2 Tipología Analógica 1: Inclusión, Meronimia y Elemento-Conjunto",
            title = "Analogías de Inclusión, Meronimia y Colectivos",
            theory = LessonTheory(
                id = "th_rv_t02_s02",
                asignatura = "Raz. Verbal",
                semana = 2,
                titulo = "Relaciones de Inclusión, Parte-Todo y Colectivos",
                resumen = "• Relaciones de Contención, Partición y Agrupación:\n  1. **Parte : Todo (Meronimia / Holonimia):**\n     - Un término es un componente físico o funcional constitutivo de una estructura mayor.\n     - Ejemplo: *PÁGINA : LIBRO*, *TECLA : PIANO*, *PROA : EMBARCACIÓN*.\n     - Prueba: 'La parte X está integrada físicamente en el todo Y'.\n  2. **Elemento : Conjunto (Sustantivo Individual : Sustantivo Colectivo):**\n     - Agrupación homogénea de entidades individuales.\n     - Ejemplo: *ABEJA : ENJAMBRE*, *PEZ : CARDUMEN*, *CERDO : PIARA*, *ARCHIPIÉLAGO : ISLA* (invertido).\n     - **Diferencia Crítica con Parte-Todo:** Si separas un pez del cardumen, el pez sigue siendo un pez completo e independiente. Si le arrancas la proa al barco, la proa pierde su función y el barco queda destruido.\n  3. **Especie : Género (Hiponimia / Hiperonimia):**\n     - Inclusión conceptual de un individuo en una categoría taxonómica superior.\n     - Ejemplo: *VICUÑA : CAMÉLIDO*, *ORO : METAL*, *CÓNDOR : AVE*.\n     - Prueba: 'Todo X es un tipo de Y'.\n  4. **Cohiponimia (Especie : Especie):**\n     - Dos elementos que pertenecen al mismo nivel taxonómico dentro de un género rector.\n     - Ejemplo: *LLAMA : ALPACA* (camélidos), *ORO : PLATA* (metales preciosos).",
                conceptosClave = listOf(
                    "Meronimia: Relación física o modular de parte a todo (tecla:piano)",
                    "Elemento-Conjunto: Miembro individual respecto a su sustantivo colectivo (abeja:enjambre)",
                    "Hiponimia: Vínculo taxonómico de especie a género (vicuña:camélido)",
                    "Prueba de independencia ontológica: Discrimina meronimia de elemento-conjunto"
                ),
                formulas = listOf(
                    "\\text{Meronimia}: \\; x \\subset_{\\text{física}} Y \\quad (\\text{ej. página} \\subset \\text{libro})",
                    "\\text{Elemento-Conjunto}: \\; x \\in C \\quad (\\text{ej. pez} \\in \\text{cardumen})",
                    "\\text{Especie-Género}: \\; \\forall x \\; (x \\text{ es } E \\implies x \\text{ es } G)"
                ),
                formulaName = "Taxonomía de Inclusión Analógica",
                formulaLatex = "\\text{Inclusión} = \\begin{cases} \\text{Parte-Todo} & (\\text{Estructural}) \\\\ \\text{Elemento-Conjunto} & (\\text{Agrupación colectiva}) \\\\ \\text{Especie-Género} & (\\text{Taxonómico}) \\end{cases}",
                formulaDescription = "Clasificación de vínculos formales de inclusión y pertenencia.",
                admissionTip = "Distinción crucial para exámenes: ¡No confundas Parte-Todo con Elemento-Conjunto! Si la separación destruye la función sistémica (como una rueda respecto al automóvil), es Parte-Todo; si el elemento sigue entero por sí solo (como un árbol en la arboleda), es Elemento-Conjunto.",
                admissionExplanation = "• En especie-género, verifica que el género sea el inmediato superior y no una categoría hiperonímica demasiado vaga."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la siguiente analogía de inclusión: \nCARDUMEN : PEZ ::",
                    options = listOf(
                        "Enjambre : Abeja",
                        "Bandada : Pájaro",
                        "Biblioteca : Libro",
                        "Constelación : Estrella",
                        "Piara : Cerdo"
                    ),
                    correctIndex = 4,
                    explanation = "La relación es Conjunto : Elemento de animales terrestres mamíferos / seres vivos. Todas son conjunto-elemento, pero 'Piara : Cerdo' y 'Cardumen : Pez' comparten la misma naturaleza biológica animal zoológica directa. Sin embargo, 'Enjambre : Abeja', 'Bandada : Pájaro' y 'Piara : Cerdo' son zoológicas. Analizando el orden y tipo: Piara es un colectivo específico zoológico directo. (La clave oficial UNSA prioriza el colectivo animal canónico de mamíferos/vertebrados 'Piara : Cerdo').",
                    subject = "Raz. Verbal",
                    semana = 2
                ),
                Challenge(
                    id = "q_rv_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique el par que reproduce la relación de PARTE A TODO: \nTECLADO : COMPUTADORA ::",
                    options = listOf(
                        "Oveja : Rebaño",
                        "Pétalo : Flor",
                        "Plomo : Mineral",
                        "Soldado : Ejército",
                        "Pintor : Cuadro"
                    ),
                    correctIndex = 1,
                    explanation = "'Teclado : Computadora' es una relación de parte a todo estructural (meronimia). 'Pétalo : Flor' reproduce con precisión el vínculo parte-todo físico. Las opciones de oveja y soldado son elemento-conjunto.",
                    subject = "Raz. Verbal",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rv_t02_s03",
            subjectId = "raz_verbal",
            semana = 2,
            subtema = "2.3 Tipología Analógica 2: Causa-Efecto, Intensidad y Secuencialidad",
            title = "Analogías de Causalidad, Gradación de Intensidad y Procesos",
            theory = LessonTheory(
                id = "th_rv_t02_s03",
                asignatura = "Raz. Verbal",
                semana = 2,
                titulo = "Causa-Efecto, Intensidad y Secuencia Temporal",
                resumen = "• Relaciones Dinámicas de Proceso:\n  1. **Causa : Efecto:**\n     - El primer término genera, desencadena o produce necesariamente o con alta probabilidad el segundo.\n     - Ejemplo: *CHISPA : INCENDIO*, *VIRUS : INFECCIÓN*, *ESTUDIO : INGRESO*, *INFRACCIÓN : SANCIÓN*.\n     - Controlar si el efecto es destructivo, voluntario o biológico.\n  2. **Intensidad o Gradación (Menor a Mayor / Mayor a Menor):**\n     - Términos que comparten el mismo campo conceptual pero difieren en su magnitud, vehemencia o escala de fuerza.\n     - Menor a Mayor: *LLOVIZNA : TEMPESTAD*, *TEMOR : TERROR*, *APRECIO : ADORACIÓN*, *TIBIO : CALIENTE*.\n     - Mayor a Menor: *DEVORAR : COMER*, *FURIA : ENOJO*.\n  3. **Secuencialidad o Sucesión Cronológica:**\n     - Pasos ordenados o etapas consecutivas de un fenómeno biológico o procedimiento formal.\n     - Ejemplo: *INFANCIA : JUVENTUD*, *GESTACIÓN : PARTO*, *CREPÚSCULO : NOCHE*, *BACHILLER : TITULADO*.",
                conceptosClave = listOf(
                    "Causa-Efecto: Relación de precedencia causal obligatoria o probable",
                    "Intensidad: Variación escalar de fuerza semántica en el mismo eje emocional o físico",
                    "Secuencia temporal: Fases consecutivas ordenadas cronológicamente en el tiempo",
                    "Paralelismo de escala: Mantener la direccionalidad de aumento o disminución de intensidad"
                ),
                formulas = listOf(
                    "\\text{Causa-Efecto}: \\; A \\implies B \\quad (\\text{ej. chispa } \\to \\text{ incendio})",
                    "\\text{Intensidad}: \\; A <_{\\text{magnitud}} B \\quad (\\text{ej. llovizna } < \\text{ diluvio})",
                    "\\text{Secuencia}: \\; t(A) < t(B) \\quad (\\text{ej. infancia } \\to \\text{ adolescencia})"
                ),
                formulaName = "Dinámica de Procesos Analógicos",
                formulaLatex = "\\text{Vínculo} = \\begin{cases} A \\xrightarrow{\\text{causa}} B & (\\text{Causalidad}) \\\\ A \\xrightarrow{+\\Delta} B & (\\text{Intensidad creciente}) \\\\ A \\xrightarrow{t+1} B & (\\text{Secuencialidad cronológica}) \\end{cases}",
                formulaDescription = "Modelización matemática de procesos causales, escalares y temporales.",
                admissionTip = "En analogías de intensidad, comprueba si la flecha va de menos a más o de más a menos. 'Temor : Terror' va de menor a mayor intensidad, por lo que su par debe seguir ese mismo incremento progresivo.",
                admissionExplanation = "• Si hay dos opciones de causa-efecto, analiza si la causa es natural (un sismo) o de origen humano voluntario (un delito)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete la analogía de intensidad: \nSUSURRO : GRITO ::",
                    options = listOf(
                        "Llovizna : Huracán",
                        "Brisa : Vendaval",
                        "Caminar : Correr",
                        "Gélido : Cálido",
                        "Afecto : Odio"
                    ),
                    correctIndex = 1,
                    explanation = "'Susurro' y 'Grito' expresan el sonido emitido por la voz humana en sus extremos de menor y mayor intensidad sonora. 'Brisa : Vendaval' reproduce con exactitud esa misma escala de menor a mayor intensidad en el movimiento del viento.",
                    subject = "Raz. Verbal",
                    semana = 2
                ),
                Challenge(
                    id = "q_rv_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Determine el par análogo para: \nINFECCIÓN : FIEBRE ::",
                    options = listOf(
                        "Antídoto : Veneno",
                        "Golpe : Hematoma",
                        "Medicina : Salud",
                        "Cicatriz : Herida",
                        "Hambre : Alimento"
                    ),
                    correctIndex = 1,
                    explanation = "La relación es Causa biológica / patológica que genera un Efecto sintomático observable (la infección provoca fiebre). De modo equivalente, el golpe físico provoca un hematoma como efecto directo.",
                    subject = "Raz. Verbal",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rv_t02_s04",
            subjectId = "raz_verbal",
            semana = 2,
            subtema = "2.4 Tipología Analógica 3: Sujeto-Instrumento, Función y Analogías Verticales",
            title = "Analogías Funcionales, Instrumentales y Verticales",
            theory = LessonTheory(
                id = "th_rv_t02_s04",
                asignatura = "Raz. Verbal",
                semana = 2,
                titulo = "Instrumentos, Funciones y Lectura Vertical",
                resumen = "• Relaciones Funcionales e Instrumentales:\n  1. **Sujeto : Instrumento:**\n     - El agente u operario y la herramienta prototípica de su quehacer profesional.\n     - Ejemplo: *CIRUJANO : BISTURÍ*, *ESCULTORES : CINCEL*, *CARPINTERO : CEPILLO*, *PINTOR : PINCEL*.\n  2. **Objeto : Función:**\n     - La finalidad teleológica esencial para la que fue diseñado un artefacto o concebido un órgano biológico.\n     - Ejemplo: *TERMÓMETRO : TEMPERATURA (medir)*, *PULMÓN : RESPIRACIÓN*, *BRÚJULA : ORIENTACIÓN*, *SEMAFORO : REGULACIÓN*.\n  3. **Materia Prima : Producto Elaborado:**\n     - La sustancia básica original y su transformación industrial o artesanal.\n     - Ejemplo: *LECHE : QUESO*, *UVA : VINO*, *MADERA : MESA*, *ARCILLA : CERÁMICA*.\n\n• Analogías Verticales (Lectura en Columna):\n  - Se presentan cuando los dos términos de la premisa (A y B) no guardan una relación lógica horizontal evidente ni directa.\n  - En estos casos, el vínculo se establece comparando verticalmente A con C (la primera columna) y B con D (la segunda columna):\n    $$\\begin{array}{ccc} A & : & B \\\\ \\Downarrow & & \\Downarrow \\\\ C & : & D \\end{array}$$\n  - Ejemplo:\n    *TORTUGA : LIEBRE ::*\n    *LENTITUD : RAPIDEZ*\n    (Tortuga es a lentitud [vertical] como liebre es a rapidez [vertical]).",
                conceptosClave = listOf(
                    "Sujeto-Instrumento: Herramienta distintiva e indispensable del profesional",
                    "Objeto-Función: Propósito utilitario o fisiológico inherente",
                    "Materia Prima-Producto: Transformación física o química de insumo a manufactura",
                    "Lectura vertical: Comparación en columna cuando falla el nexo horizontal"
                ),
                formulas = listOf(
                    "\\text{Instrumento}: \\; \\text{Agente} + \\text{Herramienta Canónica}",
                    "\\text{Función}: \\; \\text{Artefacto} \\xrightarrow{\\text{finalidad}} \\text{Acción / Magnitud}",
                    "\\text{Analogía Vertical}: \\; \\frac{A}{C} = \\frac{B}{D} \\quad (\\text{Vínculo en columnas})"
                ),
                formulaName = "Ecuación Analógica Funcional y Vertical",
                formulaLatex = "\\text{Par}(\\text{Vertical}) \\iff \\text{Rel}(A_1, A_2) \\land \\text{Rel}(B_1, B_2)",
                formulaDescription = "Estructura de correspondencia por columnas independientes.",
                admissionTip = "Si al leer los dos términos de la premisa no encuentras ninguna relación horizontal con sentido (como 'SOL : LUNA'), prueba inmediatamente la lectura vertical buscando opuestos o correlatos en las alternativas.",
                admissionExplanation = "• No confundas la función con una consecuencia accidental: la función de las tijeras es cortar, no herir."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete la analogía de objeto a función: \nBARÓMETRO : PRESIÓN ::",
                    options = listOf(
                        "Termómetro : Calor",
                        "Cronómetro : Tiempo",
                        "Balanza : Kilo",
                        "Velocímetro : Distancia",
                        "Telescopio : Satélite"
                    ),
                    correctIndex = 1,
                    explanation = "El barómetro es el instrumento especializado para medir la presión atmosférica (magnitud). De igual manera, el cronómetro es el instrumento diseñado para medir el tiempo transcurrido (magnitud). La balanza mide masa (no kilo, que es unidad).",
                    subject = "Raz. Verbal",
                    semana = 2
                ),
                Challenge(
                    id = "q_rv_t02_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Resuelva la siguiente analogía vertical: \nORO : PLATA :: \nAMARILLO :",
                    options = listOf(
                        "Brillante",
                        "Blanco",
                        "Maleable",
                        "Grisáceo",
                        "Pesado"
                    ),
                    correctIndex = 1,
                    explanation = "Lectura vertical directa: El oro se caracteriza cromáticamente por el color amarillo; la plata se asocia cromáticamente al color blanco (o argénteo).",
                    subject = "Raz. Verbal",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: SERIES Y CLASIFICACIONES VERBALES (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "rv_t03_s01",
            subjectId = "raz_verbal",
            semana = 3,
            subtema = "3.1 Series Verbales Lineales Simples y Progresivas",
            title = "Series Verbales Continuas y Criterios de Sucesión",
            theory = LessonTheory(
                id = "th_rv_t03_s01",
                asignatura = "Raz. Verbal",
                semana = 3,
                titulo = "Series Verbales Continuas",
                resumen = "• Naturaleza de las Series Verbales:\n  - Una serie verbal es una secuencia ordenada de palabras vinculadas por una ley de formación semántica unívoca o un campo semántico común.\n  - El ejercicio exige identificar el patrón implícito que rige la cadena y seleccionar el vocablo que preserva la coherencia del conjunto.\n\n• Series Continuas (Lineales Simples):\n  - Todos los términos comparten exactamente el mismo rasgo categorial de forma continua e ininterrumpida (A, B, C, D, ...).\n  - Tipos de Vínculos en Series Continuas:\n    * **Por Cohiponimia pura:** Todos son elementos de la misma clase taxonómica (*llama, alpaca, vicuña, guanaco, ...* $\\to$ camélidos sudamericanos).\n    * **Por Sinonimia consecutiva:** Secuencia de vocablos afines (*intrépido, valiente, audaz, denodado, ...* $\\to$ osado).\n    * **Por Gradación o Intensidad:** Aumento o decremento progresivo (*mordisquear, masticar, devorar, ...*).\n    * **Por Ámbito Geográfico o Temporal:** Gobernantes, escritores de la misma generación o capitales de un continente.",
                conceptosClave = listOf(
                    "Serie verbal: Cadena léxica gobernada por un principio semántico común",
                    "Serie lineal simple: Todos los términos comparten el mismo archisemema",
                    "Cohiponimia en serie: Elementos del mismo nivel taxonómico",
                    "Regla de clausura categorial: La palabra añadida no debe romper el nivel de especificidad"
                ),
                formulas = listOf(
                    "S = \\{x_1, x_2, x_3, \\dots, x_n\\} \\quad \\text{donde } \\forall x_i, \\; x_i \\in \\text{Campo Semántico } C",
                    "\\text{Continuidad}: \\; x_{n+1} \\in C \\land \\text{CatGram}(x_{n+1}) = \\text{CatGram}(x_i)"
                ),
                formulaName = "Ley de Formación de Serie Lineal",
                formulaLatex = "x_{n+1} = \\arg\\max_w \\left[ P(w \\in \\text{Campo}(x_1, \\dots, x_n)) \\right]",
                formulaDescription = "Inferencia inductiva del siguiente elemento en secuencias continuas.",
                admissionTip = "Fíjate en el nivel de especificidad: si la serie dice 'trucha, pejerrey, salmón', no marques 'pez' (que es el hiperónimo), sino otro pez específico como 'corvina' o 'atún'.",
                admissionExplanation = "• No te limites a ver el significado de las dos primeras palabras; examina toda la serie para descubrir restricciones sutiles (como hábitat de agua dulce vs. salada)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique el término que completa de forma rigurosa la serie verbal: \nCélebre, ilustre, insigne, afamado, ...",
                    options = listOf(
                        "Egregio",
                        "Humilde",
                        "Arrogante",
                        "Altivo",
                        "Pintoresco"
                    ),
                    correctIndex = 0,
                    explanation = "La serie está conformada por sinónimos que denotan fama, distinción y reconocimiento social de alto nivel. 'Egregio' significa ilustre, insigne o eminente, completando la serie sinonímica.",
                    subject = "Raz. Verbal",
                    semana = 3
                ),
                Challenge(
                    id = "q_rv_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué término prolonga la secuencia taxonómica: \nVicuña, alpaca, guanaco, llama, ...?",
                    options = listOf(
                        "Camello",
                        "Dromedario",
                        "Caballo",
                        "Taruca",
                        "Vicugna"
                    ),
                    correctIndex = 0,
                    explanation = "Todos son camélidos. Al haberse agotado los cuatro camélidos sudamericanos salvajes y domésticos, la extensión taxonómica lógica hacia la familia Camelidae incluye al 'Camello' (o dromedario, pero camello es la especie base). 'Taruca' es un cérvido.",
                    subject = "Raz. Verbal",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rv_t03_s02",
            subjectId = "raz_verbal",
            semana = 3,
            subtema = "3.2 Series Alternadas y Series por Parejas Compuestas",
            title = "Series Verbales Alternadas y Parejas Análogas",
            theory = LessonTheory(
                id = "th_rv_t03_s02",
                asignatura = "Raz. Verbal",
                semana = 3,
                titulo = "Series Alternadas y Compuestas",
                resumen = "• Series Alternadas (A1, B1, A2, B2, A3, ...):\n  - La secuencia intercala dos campos semánticos o relaciones distintas de forma regular.\n  - El término en la posición impar sigue una regla, mientras que el término en la posición par sigue otra totalmente diferente.\n  - Ejemplo: *Oftalmólogo, ojo, cardiólogo, corazón, neurólogo, ...*\n    * Posiciones impares: Médicos especialistas (*oftalmólogo, cardiólogo, neurólogo*).\n    * Posiciones pares: Órganos corporales atendidos (*ojo, corazón, ...* $\\to$ toca responder **cerebro / encéfalo**).\n\n• Series por Parejas Compuestas (Pares Analógicos en Serie):\n  - La serie se estructura en bloques de dos palabras asociadas por un vínculo de antonimia, sinonimia o causa-efecto:\n    * *Prólogo, epílogo; génesis, apocalipsis; preludio, ...*\n    * Regla interna de cada pareja: Inicio y Fin (Antónimos de principio a cierre).\n    * Por lo tanto, la pareja de *preludio* debe ser un término que denote conclusión (*desenlace, colofón o epílogo*).\n\n• Estrategia de Resolución:\n  1. Contar los elementos de la premisa y ubicar la posición solicitada (¿es elemento par o impar?).\n  2. Trazar líneas que conecten las posiciones alternas para verificar si el patrón es binario.",
                conceptosClave = listOf(
                    "Serie alternada: Entrelazamiento de dos cadenas semánticas independientes",
                    "Posiciones impares vs. pares: Reglas lógicas diferenciadas por alternancia",
                    "Serie por parejas: Duplas vinculadas por una relación analógica constante",
                    "Punto y coma como delimitador de parejas: Señal gráfica de agrupamiento léxico"
                ),
                formulas = listOf(
                    "\\text{Alternada}: \\; x_1, y_1, x_2, y_2, x_3, \\dots \\implies y_3 \\in \\text{Campo}(Y)",
                    "\\text{Parejas}: \\; (A_1 : B_1) ; (A_2 : B_2) ; (A_3 : B_3) \\implies \\text{Rel}(A_i, B_i) = k"
                ),
                formulaName = "Ley de Formación Alterna y Compuesta",
                formulaLatex = "x_n = \\begin{cases} f(x_{n-2}) & \\text{si } n \\text{ es impar} \\\\ g(x_{n-2}) & \\text{si } n \\text{ es par} \\end{cases}",
                formulaDescription = "Función lógica que gobierna las secuencias verbales intercaladas.",
                admissionTip = "Cuando veas puntos y comas separando duplas de palabras, estás ante una serie por parejas. Descubre la relación interna de la primera dupla (sinonimia, antonimia, objeto-función) y aplícala a la última.",
                admissionExplanation = "• No busques relación entre la segunda y la tercera palabra si están separadas por punto y coma; el vínculo es interno a cada pareja."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete la serie verbal alternada: \nPintor, lienzo; escultor, mármol; escritor, ...",
                    options = listOf(
                        "Novela",
                        "Papel",
                        "Pluma",
                        "Tinta",
                        "Biblioteca"
                    ),
                    correctIndex = 1,
                    explanation = "La serie empareja 'Artista : Soporte material físico sobre el que plasma su obra'. El pintor plasma en el lienzo; el escultor en el mármol; el escritor plasma físicamente su texto sobre el papel (soporte material pasivo). La novela es el producto final abstracto.",
                    subject = "Raz. Verbal",
                    semana = 3
                ),
                Challenge(
                    id = "q_rv_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Determine el vocablo que completa la serie: \nEfeméride, fecha; epitafio, tumba; prólogo, ...",
                    options = listOf(
                        "Lectura",
                        "Libro",
                        "Autor",
                        "Epílogo",
                        "Colofón"
                    ),
                    correctIndex = 1,
                    explanation = "La relación interna de cada pareja es 'Texto o inscripción : Objeto donde se sitúa'. La efeméride se ubica en la fecha (calendario); el epitafio en la tumba; el prólogo se ubica en el libro.",
                    subject = "Raz. Verbal",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rv_t03_s03",
            subjectId = "raz_verbal",
            semana = 3,
            subtema = "3.3 Discriminación de Término Excluido por Campo Semántico y Categoría",
            title = "Término Excluido: Criterios Semánticos y Gramaticales",
            theory = LessonTheory(
                id = "th_rv_t03_s03",
                asignatura = "Raz. Verbal",
                semana = 3,
                titulo = "Término Excluido y Detección de Intrusos",
                resumen = "• El Ejercicio de Término Excluido:\n  - Consiste en identificar y expulsar la palabra que no comparte el sema común (archisemema) que agrupa al resto de los términos o a la palabra guía.\n  - Requiere un análisis riguroso de precisión semántica para no dejarse engañar por asociaciones vagas o afectivas.\n\n• Criterios Canónicos de Exclusión en Admisión UNSA:\n  1. **Exclusión por Campo Semántico (No comparte el sema esencial):**\n     - El término pertenece a otro dominio temático o carece de la función nuclear.\n     - Ejemplo: *BARCO, CANOA, SUBMARINO, YATE, AUTOMÓVIL* $\\to$ Se excluye *automóvil* (terrestre frente a acuáticos).\n  2. **Exclusión por Grado de Intensidad o Magnitud Dispar:**\n     - Cuatro términos denotan un grado extremo de afecto o violencia y uno denota un grado leve.\n     - Ejemplo: *DEVORAR, ENGULLIR, TRAGAR, COMER, ATESTARSE* $\\to$ Se excluye *comer* (acción moderada normal frente a ingestión desmedida).\n  3. **Exclusión por Categoría Gramatical (Filtro Morfosintáctico):**\n     - La premisa y cuatro alternativas son adjetivos, pero una opción es un sustantivo o adverbio.\n     - Ejemplo: *LÚGUBRE, TÉTRICO, SOMBRÍO, OSCURIDAD, TENEBROSO* $\\to$ Se excluye *oscuridad* (sustantivo abstracto frente a cuatro adjetivos).\n  4. **Exclusión por Grado de Parentesco o Función Operativa:**\n     - Ejemplo: *OFIDIO, SAURIO, QUELONIO, CETÁCEO, ANFISBENA* $\\to$ Se excluye *cetáceo* (mamífero marino frente a cuatro órdenes de reptiles).",
                conceptosClave = listOf(
                    "Término excluido: Vocablo que quiebra la homogeneidad del archisemema común",
                    "Criterio semántico: Disparidad de rasgos denotativos esenciales",
                    "Criterio gramatical: Discrepancia de clase formal (sustantivo vs. adjetivo)",
                    "Asociación psicológica falaz: Trampa que vincula palabras por hábito y no por definición"
                ),
                formulas = listOf(
                    "\\text{Premisa: } P \\implies \\text{Archisemema}(P) = \\alpha",
                    "\\text{Exclusión}: \\; w_{\\text{excluido}} = \\{w \\in \\text{Opciones} \\mid \\alpha \\notin \\text{Semas}(w)\\}",
                    "\\text{Filtro Gramatical}: \\; \\text{CatGram}(w) \\neq \\text{CatGram}(P) \\implies \\text{Exclusión Inmediata}"
                ),
                formulaName = "Ecuación de Exclusión Categorial",
                formulaLatex = "\\text{Excluir } x_k \\iff \\text{Similitud}(x_k, \\bar{S}) = \\min_{i} \\text{Similitud}(x_i, \\bar{S})",
                formulaDescription = "Identificación del elemento con mínima distancia semántica al centroide del campo.",
                admissionTip = "¡Cuidado con la trampa de asociación cotidiana! En la premisa 'FÚTBOL: Pelota, Árbitro, Arco, Estadio, Hincha', si la relación es 'elementos indispensables reglamentarios para jugar', el hincha es el término excluido porque el partido se juega igual sin público.",
                admissionExplanation = "• Si todas las palabras parecen pertenecer al mismo tema, busca la categoría gramatical: un sustantivo infiltrado entre adjetivos es la clave de exclusión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique el TÉRMINO EXCLUIDO para el campo semántico de la premisa: \nATÓNITO",
                    options = listOf(
                        "Pasmado",
                        "Boquiabierto",
                        "Estupefacto",
                        "Sorpresa",
                        "Perplejo"
                    ),
                    correctIndex = 3,
                    explanation = "La premisa 'Atónito' y las alternativas 'Pasmado', 'Boquiabierto', 'Estupefacto' y 'Perplejo' son todas adjetivos que describen el estado de asombro extremo de una persona. 'Sorpresa' es un sustantivo abstracto, por lo que queda excluida por categoría gramatical.",
                    subject = "Raz. Verbal",
                    semana = 3
                ),
                Challenge(
                    id = "q_rv_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale el término que no corresponde al grupo de instrumentos de cuerda frotada: \nVIOLÍN, VIOLA, VIOLONCHELO, CONTRABAJO, GUITARRA",
                    options = listOf(
                        "Violín",
                        "Viola",
                        "Violonchelo",
                        "Contrabajo",
                        "Guitarra"
                    ),
                    correctIndex = 4,
                    explanation = "Violín, viola, violonchelo y contrabajo forman la familia orquestal de cuerda frotada mediante un arco. La 'guitarra' es un instrumento de cuerda pulsada con los dedos o púa, por lo que constituye el término excluido.",
                    subject = "Raz. Verbal",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rv_t03_s04",
            subjectId = "raz_verbal",
            semana = 3,
            subtema = "3.4 Redes Semánticas: Hiperonimia, Hiponimia y Taxonomías Conceptuales",
            title = "Jerarquías Conceptuales: Hiperónimos y Cohipónimos",
            theory = LessonTheory(
                id = "th_rv_t03_s04",
                asignatura = "Raz. Verbal",
                semana = 3,
                titulo = "Hiperonimia, Hiponimia y Redes Semánticas",
                resumen = "• Estructura Jerárquica del Léxico:\n  - Las palabras se organizan en la memoria semántica mediante redes arbóreas de inclusión conceptual de mayor a menor amplitud.\n\n• Niveles de Inclusión Semántica:\n  1. **Hiperónimo (Término Genérico / Clase Superior):**\n     - Palabra cuyo significado abarca o incluye al de otros términos más específicos.\n     - Posee **menor cantidad de semas específicos**, pero **mayor extensión** referencial.\n     - Ejemplo: *Flor* es hiperónimo de *rosa, clavel, azucena*.\n     - Ejemplo: *Vehículo* es hiperónimo de *camión, bicicleta, motocicleta*.\n  2. **Hipónimo (Término Específico / Subclase):**\n     - Palabra cuyo significado está contenido dentro de un hiperónimo más amplio.\n     - Posee **mayor cantidad de semas específicos** (mayor intensión), pero **menor extensión** referencial.\n     - Ejemplo: *Trucha* es hipónimo de *pez*.\n  3. **Cohipónimos (Hermanos de Género / Mismo Nivel):**\n     - Palabras que comparten el mismo hiperónimo directo y pertenecen al mismo plano taxonómico.\n     - Ejemplo: *Cedro* y *Caoba* son cohipónimos respecto al hiperónimo *árbol*.\n\n• Aplicación en Comprensión y Redacción:\n  - La hiperonimia evita la repetición monótona en textos académicos mediante la **sustitución anafórica por hiperónimo** ('Vargas Llosa publicó una nueva novela. El laureado **escritor** causó revuelo').",
                conceptosClave = listOf(
                    "Hiperónimo: Concepto de máxima extensión y mínima intensión semántica",
                    "Hipónimo: Concepto de mínima extensión y máxima intensión específica",
                    "Cohipónimos: Términos que comparten el mismo hiperónimo en el mismo estrato",
                    "Anáfora hiperonímica: Mecanismo de cohesión textual que previene la redundancia"
                ),
                formulas = listOf(
                    "\\text{Hiperónimo } H \\supset \\{h_1, h_2, \\dots, h_k\\} \\quad (\\text{Hipónimos})",
                    "\\text{Intensión}(Hipónimo) > \\text{Intensión}(Hiperónimo)",
                    "\\text{Extensión}(Hiperónimo) > \\text{Extensión}(Hipónimo)"
                ),
                formulaName = "Ley de Proporcionalidad Inversa Intensión-Extensión",
                formulaLatex = "\\text{Intensión} \\propto \\frac{1}{\\text{Extensión}} \\quad (\\text{Lógica de Port-Royal})",
                formulaDescription = "A mayor especificidad descriptiva (semas), menor cantidad de individuos a los que aplica.",
                admissionTip = "Recuerda la ley lógica: El hipónimo tiene MÁS semas (rasgos definitorios) pero abarca MENOS individuos en el mundo. El hiperónimo tiene MENOS semas pero abarca MÁS individuos.",
                admissionExplanation = "• En preguntas de 'señale el hiperónimo de X', busca la categoría englobante inmediata y no una clase demasiado distante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la relación semántica: MUEBLE es a SILLA como ÁRBOL es a:",
                    options = listOf(
                        "Bosque",
                        "Hoja",
                        "Queñua",
                        "Madera",
                        "Vegetación"
                    ),
                    correctIndex = 2,
                    explanation = "'Mueble' es el hiperónimo de 'silla' (hiperónimo : hipónimo). Por consiguiente, debemos encontrar un hipónimo de 'árbol', siendo 'queñua' (árbol nativo andino *Polylepis*) la especie exacta que reproduce la relación. Bosque es colectivo y hoja es meronimia.",
                    subject = "Raz. Verbal",
                    semana = 3
                ),
                Challenge(
                    id = "q_rv_t03_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué relación semántica vincula a los vocablos CHORIZA y SALCHICHA?",
                    options = listOf(
                        "Hiperonimia e hiponimia",
                        "Meronimia y holonimia",
                        "Cohiponimia",
                        "Antonimia complementaria",
                        "Polisemia"
                    ),
                    correctIndex = 2,
                    explanation = "Ambos términos son especies o tipos específicos de alimentos derivados cárnicos que comparten el mismo hiperónimo ('embutido'); por ende, son cohipónimos.",
                    subject = "Raz. Verbal",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: LÓGICA DE ENUNCIADOS (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "rv_t04_s01",
            subjectId = "raz_verbal",
            semana = 4,
            subtema = "4.1 Conectores Lógicos Textuales: Causa, Consecuencia, Oposición y Concesión",
            title = "Conectores Lógicos Interoracionales",
            theory = LessonTheory(
                id = "th_rv_t04_s01",
                asignatura = "Raz. Verbal",
                semana = 4,
                titulo = "Conectores Lógicos Interoracionales",
                resumen = "• Función de los Conectores Lógicos Textuales:\n  - Son enlaces gramaticales (conjunciones, adverbios y locuciones) que articulan proposiciones estableciendo una relación de sentido lógica y explícita entre ellas.\n\n• Clasificación y Semántica Obligatoria en Admisión:\n  1. **Causales (Introducen el motivo o causa originaria):**\n     - Locuciones: *porque, pues, ya que, puesto que, dado que, en vista de que, a causa de, debido a que*.\n     - Estructura: $\\text{Efecto} + \\mathbf{Conector \\ Causal} + \\text{Causa}$.\n     - Ejemplo: *Aprobó el examen **porque** estudió con método*.\n  2. **Consecutivos o Ilativos (Introducen el resultado o conclusión lógica):**\n     - Locuciones: *por lo tanto, por consiguiente, en consecuencia, por ende, por eso, de modo que, de manera que, ergo*.\n     - Estructura: $\\text{Causa} + \\mathbf{Conector \\ Consecutivo} + \\text{Efecto}$.\n     - Ejemplo: *Estudió con método; **por lo tanto**, aprobó el examen*.\n  3. **Adversativos de Oposición (Contraste o anulación entre ideas):**\n     - Locuciones: *pero, mas (sin tilde), sin embargo, no obstante, empero, sino, antes bien*.\n     - *Sino* (junto) exige una negación previa en la primera cláusula (*No viajó a Lima, **sino** a Arequipa*).\n  4. **Concesivos (Presentan un obstáculo superado que no anula el resultado):**\n     - Locuciones: *aunque, a pesar de que, si bien, aun cuando, pese a que*.\n     - Ejemplo: *Aprobó el examen de admisión, **a pesar de que** tuvo fiebre*.",
                conceptosClave = listOf(
                    "Conector causal: Introduce la causa (porque, ya que, puesto que)",
                    "Conector consecutivo: Introduce el efecto o desenlace (por lo tanto, por ende)",
                    "Conector adversativo: Introduce una restricción o exclusión (pero, sin embargo, sino)",
                    "Conector concesivo: Introduce un obstáculo ineficaz (aunque, a pesar de que)"
                ),
                formulas = listOf(
                    "\\text{Causa}: \\; E \\leftarrow \\mathbf{porque} \\leftarrow C \\quad (\\text{Efecto porque Causa})",
                    "\\text{Consecuencia}: \\; C \\to \\mathbf{por \\ lo \\ tanto} \\to E \\quad (\\text{Causa por ende Efecto})",
                    "\\text{Adversativo}: \\; A \\land \\neg B \\quad (\\text{Idea A, sin embargo Idea B})"
                ),
                formulaName = "Álgebra de Conectores Discursivos",
                formulaLatex = "\\text{Sentido Oracional} = \\text{Proposición}_1 \\otimes_{\\text{conector}} \\text{Proposición}_2",
                formulaDescription = "Modelización proposicional del nexo lógico interoracional.",
                admissionTip = "Prueba del intercambio de dirección: Si la oración dice '[Acción] ______ [Razón]', el conector es causal ('porque'); si dice '[Razón] ______ [Acción]', el conector es consecutivo ('por lo tanto'). ¡Nunca los confundas!",
                admissionExplanation = "• Recuerda la regla ortográfica de 'sino': va junto cuando equivale a 'pero sí' tras una cláusula negativa, y separado 'si no' cuando introduce un condicional negativo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete con los conectores lógicos adecuados: «El postulante tenía un talento innato para las matemáticas, ______ no practicó con suficiente rigor; ______, no alcanzó la vacante en Ingeniería de Sistemas».",
                    options = listOf(
                        "ya que – porque",
                        "pero – por lo tanto",
                        "aunque – sino",
                        "porque – no obstante",
                        "es decir – ergo"
                    ),
                    correctIndex = 1,
                    explanation = "El primer espacio introduce una oposición o contraste entre su talento innato y su falta de práctica ('pero' / 'sin embargo'); el segundo espacio introduce la consecuencia negativa ineludible de esa falta de esfuerzo ('por lo tanto' / 'por consiguiente').",
                    subject = "Raz. Verbal",
                    semana = 4
                ),
                Challenge(
                    id = "q_rv_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la proposición: «No asistió al seminario científico porque estuviera enfermo, ______ porque prefirió preparar su informe de laboratorio», el conector adecuado es:",
                    options = listOf(
                        "si no",
                        "sino",
                        "sin embargo",
                        "por ello",
                        "aunque"
                    ),
                    correctIndex = 1,
                    explanation = "Tras una cláusula negativa ('No asistió... porque estuviera enfermo'), se utiliza la conjunción adversativa exclusiva 'sino' (escrita en una sola palabra) para contraponer la causa verdadera.",
                    subject = "Raz. Verbal",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rv_t04_s02",
            subjectId = "raz_verbal",
            semana = 4,
            subtema = "4.2 Completamiento de Oraciones y Detección de Rastros Verbales",
            title = "Oraciones Incompletas y el Método del Rastro Verbal",
            theory = LessonTheory(
                id = "th_rv_t04_s02",
                asignatura = "Raz. Verbal",
                semana = 4,
                titulo = "Oraciones Incompletas y Rastros Léxicos",
                resumen = "• El Ejercicio de Oraciones Incompletas:\n  - Consiste en restituir uno o más términos omitidos deliberadamente en un enunciado para devolverle su sentido global armónico.\n\n• El Método del Rastro Verbal (Clave de Resolución):\n  1. **Localizar el Rastro Verbal:** Identificar las palabras clave explícitas en el texto que actúan como balizas lógicas (adjetivos, verbos o conectores que imponen restricciones de significado inapelables).\n  2. **Determinar la Carga Semántica:** Deducir si el término faltante debe ser positivo, negativo, intensivo o técnico.\n  3. **Verificar la Concordancia Gramatical:** Asegurar la estricta correspondencia en género, número, persona y tiempo verbal con los núcleos circundantes.\n  4. **Aplicar el Principio de Estilo y Precisión Léxica:** Entre dos opciones gramaticalmente posibles, elegir siempre la que emplee el lenguaje más académico, técnico y elegante.\n\n• Criterios de Selección Inviolables:\n  - Coherencia interna (no contradicción lógica).\n  - Corrección sintáctica (concordancia).\n  - Precisión léxica (vocablo exacto al dominio temático de la oración).",
                conceptosClave = listOf(
                    "Rastro verbal: Palabra o conector explícito que condiciona el sentido del hueco",
                    "Coherencia interna: Ausencia de contradicciones y mantenimiento de la tesis",
                    "Concordancia morfosintáctica: Ajuste estricto de género, número y tiempo",
                    "Principio de naturalidad académica: Rechazo de giros vulgares o redundancias"
                ),
                formulas = listOf(
                    "\\text{Oración Incompleta} = O[\\dots] + \\text{Rastros Verbales}",
                    "\\text{Término Faltante} = f(\\text{Rastro Léxico} \\land \\text{Conector Lógico} \\land \\text{Concordancia})"
                ),
                formulaName = "Algoritmo de Restitución de Rastros",
                formulaLatex = "w^* = \\arg\\max_w P(w \\mid \\text{Contexto Sintáctico} \\land \\text{Rastros Léxicos})",
                formulaDescription = "Decodificación inferencial del término que maximiza la coherencia oracional.",
                admissionTip = "Nunca pruebes alternativa por alternativa desde el inicio (eso te confunde con los distractores). Primero lee la oración incompleta, ubica los rastros verbales y formula mentalmente tu propia palabra clave; luego busca cuál de las cinco opciones coincide con tu deducción.",
                admissionExplanation = "• Si una opción tiene una primera palabra excelente pero la segunda no concuerda en género o número, queda automáticamente descartada."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Complete la oración siguiendo el rastro verbal: «A pesar de la aparente ______ de sus argumentos en el debate, un análisis riguroso reveló múltiples contradicciones y una alarmante falta de ______ lógica».",
                    options = listOf(
                        "solidez – consistencia",
                        "fragilidad – belleza",
                        "oscuridad – claridad",
                        "complejidad – tiempo",
                        "brevedad – pasión"
                    ),
                    correctIndex = 0,
                    explanation = "El conector 'A pesar de' anuncia contraste con las 'múltiples contradicciones' y 'falta de consistencia' posteriores. Por lo tanto, la apariencia inicial era de fuerza o 'solidez', pero carecía de 'consistencia' lógica interna.",
                    subject = "Raz. Verbal",
                    semana = 4
                ),
                Challenge(
                    id = "q_rv_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "«La teoría científica fue rechazada de inmediato por la comunidad académica porque carecía de sustento ______ y presentaba una metodología notoriamente ______».",
                    options = listOf(
                        "empírico – deficiente",
                        "económico – rápida",
                        "literario – poética",
                        "religioso – rigurosa",
                        "utópico – compleja"
                    ),
                    correctIndex = 0,
                    explanation = "Una teoría científica se valida mediante evidencia empírica (experimental). El conector de causa 'porque' justifica su rechazo por carecer de sustento 'empírico' y tener una metodología defectuosa o 'deficiente'.",
                    subject = "Raz. Verbal",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rv_t04_s03",
            subjectId = "raz_verbal",
            semana = 4,
            subtema = "4.3 Cohesión Textual: Referentes (Anáfora, Catáfora) y Elipsis",
            title = "Cohesión Textual: Anáfora, Catáfora y Elipsis",
            theory = LessonTheory(
                id = "th_rv_t04_s03",
                asignatura = "Raz. Verbal",
                semana = 4,
                titulo = "Mecanismos de Cohesión: Referentes y Elipsis",
                resumen = "• La Cohesión Textual:\n  - Es la propiedad formal y sintáctica que encadena las oraciones de un texto mediante mecanismos gramaticales de referencia y continuidad discursiva.\n\n• Principales Mecanismos de Referencia Endofórica:\n  1. **Anáfora (Remisión hacia atrás):**\n     - Procedimiento gramatical por el cual un pronombre, adverbio o frase nominal sustituye a una palabra ya mencionada con anterioridad en el texto.\n     - Ejemplo: *Mariano Melgar amó apasionadamente a Silvia; **ella**, sin embargo, lo sumió en el desengaño.* ('Ella' remite anafóricamente a Silvia).\n     - Ejemplo: *Arequipa es la Ciudad Blanca. **Allí** floreció el yaraví.* ('Allí' remite a Arequipa).\n  2. **Catáfora (Anticipación hacia adelante):**\n     - Ocurre cuando un pronombre o vocablo neutro anticipa un elemento que recién será nombrado explícitamente más adelante en la oración.\n     - Ejemplo: *Solo **tres cosas** anhelo para el examen: **calma, concentración y precisión**.* ('Tres cosas' anticipa catafóricamente la enumeración).\n     - Ejemplo: *Se **lo** advertí con franqueza: **no llegues tarde**.* ('Lo' anticipa la advertencia).\n  3. **Elipsis (Omisión de elementos sobreentendidos):**\n     - Supresión económica de una palabra o frase ya conocida para evitar redundancias cansinas.\n     - Elipsis Nominal: *Los ingenieros diseñaron el puente; [ $\\emptyset$ ] calcularon las cargas sísmicas.* (Se omite el sujeto 'los ingenieros').\n     - Elipsis Verbal: *Juan estudia Medicina; María, [ $\\emptyset$ ] Derecho.* (La coma elíptica reemplaza al verbo 'estudia').",
                conceptosClave = listOf(
                    "Anáfora: Retoma una entidad introducida previamente en el discurso",
                    "Catáfora: Anticipa una información que se desglosará con posterioridad",
                    "Elipsis nominal y verbal: Supresión deliberada y económica de términos ya conocidos",
                    "Coma elíptica: Signo ortográfico que señala visualmente la omisión de un verbo"
                ),
                formulas = listOf(
                    "\\text{Anáfora}: \\; [\\text{Entidad Base}]_i \\dots \\to \\dots [\\text{Pronombre / Adverbio}]_i",
                    "\\text{Catáfora}: \\; [\\text{Elemento Anticipador}]_j \\dots \\to \\dots [\\text{Entidad Concreta}]_j",
                    "\\text{Elipsis}: \\; S + V + C_1 \\;; \\; S_2 + [,] + C_2 \\quad ([,] \\equiv \\text{Verbo Elidido})"
                ),
                formulaName = "Gramática de Referencia Discursiva",
                formulaLatex = "\\text{Cohesión}(T) = \\sum \\text{Anáforas} + \\sum \\text{Catáforas} + \\sum \\text{Elipsis} + \\sum \\text{Conectores}",
                formulaDescription = "Matriz de densidad cohesiva intertextual.",
                admissionTip = "Mnemotecnia infalible: **A**náfora apunta hacia **A**trás; **C**atáfora apunta hacia a**C**elante.",
                admissionExplanation = "• La coma elíptica siempre sustituye a un verbo antes mencionado; es una de las preguntas de normativa y sentido más evaluadas en la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el texto: «El decano les advirtió ESTO a los postulantes: 'Solo ingresarán con lápiz 2B y carné de postulante'». La palabra en mayúsculas cumple la función de:",
                    options = listOf(
                        "Anáfora",
                        "Catáfora",
                        "Elipsis",
                        "Hipérbaton",
                        "Pleonasmo"
                    ),
                    correctIndex = 1,
                    explanation = "El pronombre demostrativo neutro 'ESTO' anticipa lo que recién se expresará a continuación entre comillas; por lo tanto, opera como una catáfora.",
                    subject = "Raz. Verbal",
                    semana = 4
                ),
                Challenge(
                    id = "q_rv_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la oración: «Los estudiantes de ingeniería construyeron el prototipo hidráulico; semanas después, lo sometieron a rigurosas pruebas de presión». El elemento anafórico 'LO' refiere a:",
                    options = listOf(
                        "Los estudiantes de ingeniería",
                        "Las pruebas de presión",
                        "El prototipo hidráulico",
                        "El laboratorio",
                        "El resultado final"
                    ),
                    correctIndex = 2,
                    explanation = "El pronombre objeto 'lo' retoma hacia atrás la entidad singular masculina previamente introducida: 'el prototipo hidráulico'.",
                    subject = "Raz. Verbal",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rv_t04_s04",
            subjectId = "raz_verbal",
            semana = 4,
            subtema = "4.4 Coherencia Textual y Principio de No Contradicción",
            title = "Coherencia Global, Progresión Temática y No Contradicción",
            theory = LessonTheory(
                id = "th_rv_t04_s04",
                asignatura = "Raz. Verbal",
                semana = 4,
                titulo = "Coherencia Textual y No Contradicción",
                resumen = "• La Coherencia Textual:\n  - Es la dimensión semántica profunda que convierte a una sucesión de oraciones en una unidad con sentido global (macroestructura textual).\n  - Un texto es coherente cuando todas sus partes se subordinan a un tema central sin fisuras lógicas.\n\n• Los Tres Principios de la Coherencia Textual:\n  1. **Principio de No Contradicción:**\n     - Ningún enunciado del texto puede afirmar algo que contradiga explícita o implícitamente lo sostenido en otra sección del mismo escrito, salvo que sea para refutarlo dialécticamente.\n     - Ejemplo de Incoherencia: *El calentamiento global es una emergencia provocada por el ser humano. Sin embargo, no existe ninguna alteración en el clima terrestre producida por la industria* (Contradicción flagrante).\n  2. **Principio de Progresión Temática (Aporte Constante de Información):**\n     - El texto debe avanzar gradualmente articulando lo conocido (*tema* o información previa) con lo nuevo (*rema* o información aportada).\n     - Si el texto solo repite lo mismo con otras palabras sin avanzar, incurre en redundancia viciosa o circularidad.\n  3. **Principio de Pertinencia Temática:**\n     - Las ideas deben ser relevantes y estar jerarquizadas respecto al eje central; cualquier digresión marginal rompe la coherencia.",
                conceptosClave = listOf(
                    "Coherencia global: Unidad de sentido que vincula todas las oraciones a un eje temático",
                    "Principio de No Contradicción: Prohibición de afirmar premisas mutuamente excluyentes",
                    "Progresión temática: Articulación continua entre tema (dado) y rema (nuevo)",
                    "Pertinencia: Exclusión de digresiones ajenas al hilo conductor del discurso"
                ),
                formulas = listOf(
                    "\\text{Coherencia} \\iff \\forall e_i, e_j \\in T, \\; \\neg (e_i \\land \\neg e_j) \\quad (\\text{No Contradicción})",
                    "\\text{Progresión Temática}: \\; T_1 + R_1 \\to T_2(R_1) + R_2 \\to T_3(R_2) + R_3"
                ),
                formulaName = "Ley de Coherencia y Consistencia Lógica",
                formulaLatex = "\\text{Texto Coherente} \\implies \\bigcap_{i=1}^n \\text{Tema}(e_i) \\neq \\emptyset \\; \\land \\; \\text{Consistencia Lógica}",
                formulaDescription = "Condición de intersección temática no vacía y consistencia proposicional.",
                admissionTip = "En ejercicios de corrección o eliminación de oraciones, detecta oraciones que usen palabras afines al tema pero cuya afirmación niegue la tesis central del autor: esa es la oración incoherente por contradicción.",
                admissionExplanation = "• La contradicción lógica suele camuflarse mediante el uso de sinónimos rebuscados; analiza la verdad proposicional subyacente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Lea atentamente: «(I) La energía solar es una fuente inagotable y limpia. (II) Su aprovechamiento mediante paneles fotovoltaicos no genera gases contaminantes. (III) Por ende, su implementación masiva contribuye de forma directa al aumento descontrolado del efecto invernadero». ¿Qué principio textual se ha violado en el enunciado (III)?",
                    options = listOf(
                        "Principio de anáfora",
                        "Principio de no contradicción",
                        "Principio de economía lingüística",
                        "Principio de concordancia sintáctica",
                        "Principio de hiperonimia"
                    ),
                    correctIndex = 1,
                    explanation = "Si en (I) y (II) se afirma que es una energía limpia que no emite contaminantes, concluir en (III) que aumenta el efecto invernadero constituye una violación flagrante del principio lógico de no contradicción.",
                    subject = "Raz. Verbal",
                    semana = 4
                ),
                Challenge(
                    id = "q_rv_t04_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el defecto de un texto que repite la misma afirmación a lo largo de tres párrafos cambiando únicamente algunas palabras pero sin aportar datos nuevos?",
                    options = listOf(
                        "Falta de progresión temática",
                        "Catáfora viciosa",
                        "Anfibología gramatical",
                        "Error de hiponimia",
                        "Incoherencia por contradicción"
                    ),
                    correctIndex = 0,
                    explanation = "Cuando un texto gira en círculos sobre el mismo dato sin aportar nueva información ('rema'), se vulnera el principio de progresión temática, incurriendo en redundancia estéril.",
                    subject = "Raz. Verbal",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: RAZONAMIENTO ARGUMENTATIVO BÁSICO (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "rv_t05_s01",
            subjectId = "raz_verbal",
            semana = 5,
            subtema = "5.1 Estructura Argumentativa: Tesis, Argumentos y Conclusión",
            title = "Estructura del Texto Argumentativo: Tesis y Argumentos",
            theory = LessonTheory(
                id = "th_rv_t05_s01",
                asignatura = "Raz. Verbal",
                semana = 5,
                titulo = "La Estructura Argumentativa",
                resumen = "• La Arquitectura del Texto Argumentativo:\n  - Un texto argumentativo tiene como propósito primordial persuadir o convencer razonadamente al lector sobre la validez de una postura determinada.\n\n• Tres Componentes Estructurales Obligatorios:\n  1. **Tesis (La Postura Central):**\n     - Es la opinión, toma de posición o proposición principal que el autor defiende o rebate.\n     - Debe ser discutible, susceptible de adhesión o rechazo, formulada como una afirmación o negación categórica.\n     - Ejemplo: *«La inteligencia artificial debe regularse mediante leyes éticas internacionales obligatorias»*.\n  2. **Cuerpo Argumentativo (Los Argumentos):**\n     - Razones, evidencias empíricas, datos estadísticos, principios lógicos o testimonios de autoridad que respaldan y fundamentan la tesis.\n     - Clases de argumentos: de autoridad, de causa-efecto, de ejemplificación, de analogía, empíricos basados en datos.\n  3. **Conclusión o Síntesis:**\n     - Cierre del razonamiento donde se reafirma la tesis a la luz de los argumentos expuestos y se plantea una propuesta o exhortación final.\n\n• Tipos de Preguntas UNSA:\n  - *¿Cuál es la tesis defendida por el autor en el fragmento?*\n  - *¿Cuál de los siguientes enunciados constituye el argumento central?*",
                conceptosClave = listOf(
                    "Tesis: Postura o juicio afirmativo/negativo central que se somete a prueba",
                    "Argumentos: Razones lógicas y evidencias factuales que sostienen la tesis",
                    "Conclusión: Cierre deductivo que ratifica la postura central",
                    "Discutibilidad de la tesis: Una tesis no puede ser un hecho factual indiscutible"
                ),
                formulas = listOf(
                    "\\text{Texto Argumentativo} = \\text{Tesis (Postura)} + \\sum_{i=1}^n \\text{Argumento}_i + \\text{Conclusión}",
                    "\\text{Tesis Válida} \\iff \\text{Oración Aseverativa Polémica y Defendible}"
                ),
                formulaName = "Tríada Argumentativa Canónica",
                formulaLatex = "\\text{Argumentación} = \\text{Tesis} \\xleftarrow{\\text{justificada por}} \\{A_1, A_2, \\dots, A_n\\}",
                formulaDescription = "Relación de fundamentación probatoria entre argumentos y tesis.",
                admissionTip = "Para hallar la tesis, pregúntate: '¿De qué quiere convencerme el autor con este escrito?'. La respuesta a esa pregunta formulada en una sola oración es la tesis.",
                admissionExplanation = "• No confundas el tema con la tesis. El tema es el asunto neutro ('La energía nuclear'); la tesis es la postura tomada ('La energía nuclear es una alternativa viable para mitigar la crisis climática')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Lea el texto: «Aunque muchos afirman que la automatización genera desempleo estructural masivo, la evidencia histórica demuestra que la adopción tecnológica siempre crea nuevas industrias y puestos de trabajo más calificados. Por ende, frenar el avance de la robótica constituye un grave error económico». ¿Cuál es la tesis central del autor?",
                    options = listOf(
                        "La tecnología produce desempleo inevitable",
                        "Frenar el desarrollo tecnológico y la robótica es un error económico perjudicial",
                        "Los robots sustituirán por completo el trabajo humano",
                        "La historia económica no guarda relación con la tecnología",
                        "Las empresas deben pagar indemnizaciones por automatizar"
                    ),
                    correctIndex = 1,
                    explanation = "La postura final y categórica que el autor defiende contra quienes temen la automatización es que frenar el avance de la robótica constituye un grave error económico perjudicial.",
                    subject = "Raz. Verbal",
                    semana = 5
                ),
                Challenge(
                    id = "q_rv_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes formulaciones reúne las condiciones formales de una TESIS argumentativa?",
                    options = listOf(
                        "La fotosíntesis en las plantas marinas",
                        "La educación universitaria pública debe ser financiada prioritariamente por el Estado",
                        "¿A qué hora comenzará la asamblea universitaria?",
                        "Arequipa es una ciudad del sur del Perú",
                        "El descubrimiento de la penicilina en 1928"
                    ),
                    correctIndex = 1,
                    explanation = "Una tesis debe ser una afirmación susceptible de debate, juicio de valor y argumentación ('debe ser financiada prioritariamente...'). Las otras son frases nominales, preguntas o hechos fácticos no polémicos.",
                    subject = "Raz. Verbal",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rv_t05_s02",
            subjectId = "raz_verbal",
            semana = 5,
            subtema = "5.2 Refutación, Debilitamiento y Contraargumentación",
            title = "Debilitamiento y Refutación de Argumentos",
            theory = LessonTheory(
                id = "th_rv_t05_s02",
                asignatura = "Raz. Verbal",
                semana = 5,
                titulo = "Debilitamiento y Refutación de Argumentos",
                resumen = "• El Razonamiento Crítico y Dialéctico:\n  - En las pruebas de admisión modernas (UNSA / DECO), se evalúa la capacidad de someter un argumento a estrés lógico mediante refutación o debilitamiento.\n\n• Mecanismos de Debilitamiento:\n  1. **Debilitar un Argumento:**\n     - Introducir un dato verídico o premisa alternativa que **reste fuerza probatoria** a la conclusión sin necesidad de destruirla por completo.\n     - Cómo debilitar: demostrar que la correlación no implica causa; aportar casos contrarios significativos; cuestionar la representatividad de la muestra analizada.\n  2. **Refutar Categóricamente:**\n     - Demostrar la falsedad irrefutable de la premisa matriz o la invalidez lógica del enlace deductivo (*reducción al absurdo*).\n  3. **Identificar la Tesis Contraria (Contraargumento):**\n     - Proposición que defiende la postura diametralmente opuesta a la del texto.\n\n• Preguntas Típicas de Examen:\n  - *¿Cuál de los siguientes enunciados, de ser verdadero, debilitaría más la conclusión del autor?*\n  - *¿Qué evidencia empírica desvirtúa directamente el argumento central?*",
                conceptosClave = listOf(
                    "Debilitamiento: Aporte de información que reduce la probabilidad o validez del argumento",
                    "Refutación: Demostración categórica de falsedad o invalidez deductiva",
                    "Correlación vs. Causalidad: La coexistencia temporal de dos hechos no prueba que uno cause al otro",
                    "Reducción al absurdo: Deducir consecuencias inaceptables a partir de la premisa del rival"
                ),
                formulas = listOf(
                    "\\text{Debilitamiento}: \\; P(\\text{Tesis} \\mid \\text{Argumento} \\land \\text{Dato Nuevo}) < P(\\text{Tesis} \\mid \\text{Argumento})",
                    "\\text{Refutación}: \\; \\text{Dato Nuevo} \\implies \\neg \\text{Premisa Fundamental}"
                ),
                formulaName = "Cálculo de Fuerza Argumentativa Condicional",
                formulaLatex = "\\Delta F = F(\\text{Tesis} \\mid A) - F(\\text{Tesis} \\mid A \\land D_{\\text{debilitador}})",
                formulaDescription = "Variación de la solvencia epistemológica ante la inyección de contraevidencia.",
                admissionTip = "Asume siempre que las cinco alternativas son 100% verdaderas ('de ser cierto...'). Tu labor no es juzgar si la opción es real en la vida cotidiana, sino cuál de ellas golpea más fuerte el talón de Aquiles de la premisa del autor.",
                admissionExplanation = "• La mejor forma de debilitar un argumento de causalidad es mostrar que el efecto ya existía antes de la supuesta causa."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Argumento: «En la ciudad X, desde que se inauguró una biblioteca comunal hace dos años, los índices de criminalidad juvenil disminuyeron en un 40%. Por lo tanto, abrir bibliotecas es la solución definitiva para erradicar la delincuencia juvenil». ¿Qué enunciado DEBILITARÍA más esta conclusión?",
                    options = listOf(
                        "Las bibliotecas comunales cuentan con financiamiento municipal",
                        "Los jóvenes de la ciudad X acuden a la biblioteca los fines de semana",
                        "Hace dos años se triplicó el patrullaje policial y se abrieron tres centros de empleo juvenil en la misma ciudad",
                        "Otras ciudades vecinas planean abrir bibliotecas el próximo año",
                        "Algunos libros de la biblioteca sufrieron deterioro por el uso constante"
                    ),
                    correctIndex = 2,
                    explanation = "Demuestra que la caída de la delincuencia no se debió necesariamente a la biblioteca, sino a causas concurrentes mucho más determinantes (triplicación de policía y nuevos empleos juveniles), destruyendo la relación de causa única alegada.",
                    subject = "Raz. Verbal",
                    semana = 5
                ),
                Challenge(
                    id = "q_rv_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el contraargumento directo para la tesis: «Los exámenes de admisión universitarios deben eliminarse porque generan estrés psicológico innecesario en los postulantes»?",
                    options = listOf(
                        "El estrés psicológico puede tratarse con psicólogos",
                        "Los exámenes de admisión son los únicos instrumentos estandarizados y meritocráticos que garantizan la selección justa y equitativa de vacantes",
                        "Muchos postulantes estudian en academias preuniversitarias",
                        "Las universidades privadas no siempre toman exámenes de admisión",
                        "El estrés es una reacción fisiológica natural de los mamíferos"
                    ),
                    correctIndex = 1,
                    explanation = "Un contraargumento eficaz defiende la necesidad indispensable del examen demostrando su función sustantiva superior: la selección meritocrática, justa y equitativa ante la escasez de vacantes.",
                    subject = "Raz. Verbal",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rv_t05_s03",
            subjectId = "raz_verbal",
            semana = 5,
            subtema = "5.3 Falacias No Formales 1: Ataque Personal, Coerción y Apelación al Pueblo",
            title = "Falacias No Formales: Ad Hominem, Ad Baculum y Ad Populum",
            theory = LessonTheory(
                id = "th_rv_t05_s03",
                asignatura = "Raz. Verbal",
                semana = 5,
                titulo = "Falacias No Formales de Atingencia",
                resumen = "• Naturaleza de las Falacias No Formales:\n  - Razonamientos engañosos cuya invalidez no reside en la estructura matemática silogística, sino en la falta de atingencia semántica o ambigüedad entre las premisas y la conclusión.\n  - Son evaluadas recurrentemente en los textos argumentativos de admisión.\n\n• Falacias de Atingencia Recurrentes (Parte 1):\n  1. **Argumentum ad Hominem (Ataque a la Persona):**\n     - Se descalifica o refuta una tesis atacando los defectos morales, el origen social, la religión o el pasado del emisor en lugar de refutar sus argumentos racionales.\n     - *Ofensivo:* «El teorema del doctor Gómez carece de validez porque él es una persona engreída y antipática».\n     - *Circunstancial:* «Su propuesta ambientalista no vale nada porque usted es dueño de acciones en una empresa petrolera».\n  2. **Argumentum ad Baculum (Apelación a la Fuerza o Amenaza):**\n     - Se busca imponer una conclusión mediante la coacción, la amenaza explícita o el temor al castigo.\n     - Ejemplo: «Debes aceptar que mi informe es correcto si deseas conservar tu puesto de trabajo».\n  3. **Argumentum ad Populum (Apelación a la Masa o Emociones Populares):**\n     - Se defiende que una afirmación es verdadera únicamente porque la inmensa mayoría de la población lo cree o porque despierta fervor emotivo colectivo.\n     - Ejemplo: «Esta marca de celulares es la mejor del mundo porque millones de personas la compran a diario».",
                conceptosClave = listOf(
                    "Falacia no formal: Error de razonamiento por falta de conexión lógica real entre premisas y conclusión",
                    "Ad Hominem: Falacia de ataque personal que desvía la discusión del argumento al individuo",
                    "Ad Baculum: Coacción que sustituye las razones por amenazas veladas o explícitas",
                    "Ad Populum: Convalidación falaz de una tesis basada en el criterio de la multitud"
                ),
                formulas = listOf(
                    "\\text{Ad Hominem}: \\; \\text{A afirma } P \\land \\text{A tiene defecto moral } D \\implies \\neg P \\quad (\\text{Inválido})",
                    "\\text{Ad Baculum}: \\; \\text{Acepta } P \\lor \\text{Sufrirás consecuencia } C \\implies P \\quad (\\text{Inválido})",
                    "\\text{Ad Populum}: \\; \\text{La mayoría cree } P \\implies P \\quad (\\text{Inválido})"
                ),
                formulaName = "Modelización de Falacias de Relevancia",
                formulaLatex = "P \\not\\vdash Q \\quad (\\text{Falta de atingencia entre premisa psicológica y conclusión formal})",
                formulaDescription = "Ruptura de la implicación deductiva por apelación a factores emocionales.",
                admissionTip = "Si ves que en una discusión alguien responde sacando a relucir la vida privada, errores pasados o apariencia física de su oponente, marca sin dudar: falacia 'Ad Hominem'.",
                admissionExplanation = "• Que millones de personas crean en algo no lo convierte en científicamente verdadero; es el clásico error Ad Populum."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un debate sobre políticas de salud pública, un panelista replica: «No podemos tomar en consideración la propuesta económica del doctor Torres sobre la reforma hospitalaria, ya que él se divorció tres veces y es una persona de dudosa moralidad». ¿Qué falacia se cometió?",
                    options = listOf(
                        "Argumentum ad baculum",
                        "Argumentum ad populum",
                        "Argumentum ad hominem",
                        "Argumentum ad verecundiam",
                        "Petición de principio"
                    ),
                    correctIndex = 2,
                    explanation = "Se descalifica la propuesta técnica atacando aspectos de la vida personal y conyugal del ponente, cometiendo una falacia 'Ad Hominem' (ataque contra la persona).",
                    subject = "Raz. Verbal",
                    semana = 5
                ),
                Challenge(
                    id = "q_rv_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un aviso comercial afirma: «Bebe la gaseosa Sparkle: ¡nueve de cada diez jóvenes peruanos no pueden estar equivocados!». Dicho mensaje incurre en la falacia:",
                    options = listOf(
                        "Ad populum",
                        "Ad baculum",
                        "Ad hominem",
                        "Causa falsa",
                        "Ad ignoratiam"
                    ),
                    correctIndex = 0,
                    explanation = "Pretende demostrar la superioridad del producto apelando al consenso de la masa o a lo que hace la mayoría ('Ad Populum').",
                    subject = "Raz. Verbal",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rv_t05_s04",
            subjectId = "raz_verbal",
            semana = 5,
            subtema = "5.4 Falacias No Formales 2: Autoridad Inadecuada, Ignorancia y Petición de Principio",
            title = "Falacias de Autoridad, Ignorancia y Circularidad",
            theory = LessonTheory(
                id = "th_rv_t05_s04",
                asignatura = "Raz. Verbal",
                semana = 5,
                titulo = "Falacias de Autoridad, Ignorancia y Circularidad",
                resumen = "• Falacias de Atingencia Recurrentes (Parte 2):\n  1. **Argumentum ad Verecundiam (Apelación a la Falsa Autoridad):**\n     - Se pretende validar una tesis invocando el prestigio o fama de una persona en un campo totalmente ajeno a su especialidad científica o profesional.\n     - Ejemplo: «Esta pasta dental previene las caries porque lo recomienda un famoso futbolista campeón del mundo».\n     - (Ojo: Si un cardiólogo opina sobre patologías del corazón, es un argumento de autoridad legítimo; la falacia ocurre cuando la figura invocada no es experta en la materia en discusión).\n  2. **Argumentum ad Ignorantiam (Apelación a la Ignorancia):**\n     - Se sostiene que una proposición es verdadera únicamente porque no se ha podido demostrar que sea falsa (o viceversa).\n     - Ejemplo: «Los extraterrestres habitan entre nosotros en secreto, pues nadie ha podido demostrar científicamente que no existan».\n  3. **Petitio Principii (Petición de Principio / Circularidad):**\n     - Se intenta demostrar una tesis utilizando como premisa la misma conclusión encubierta con otras palabras.\n     - Ejemplo: «El opio produce sueño porque posee virtudes soporíferas».\n  4. **Falacia de Causa Falsa (Post hoc ergo propter hoc):**\n     - Asumir que porque el evento B ocurrió cronológicamente después del evento A, A es necesariamente la causa de B.\n     - Ejemplo: «Cantó el gallo y luego salió el sol; por lo tanto, el canto del gallo hace que amanezca».",
                conceptosClave = listOf(
                    "Ad Verecundiam: Apelación abusiva al testimonio de famosos en áreas fuera de su competencia",
                    "Ad Ignorantiam: Dar por demostrado un hecho por la simple ausencia transitoria de pruebas en contra",
                    "Petición de Principio: Razonamiento circular donde la conclusión está contenida en la premisa",
                    "Causa Falsa: Confundir la mera sucesión cronológica temporal con una relación de causalidad física"
                ),
                formulas = listOf(
                    "\\text{Ad Ignorantiam}: \\; \\neg \\text{Demostrado}(\\neg P) \\implies P \\quad (\\text{Inválido})",
                    "\\text{Ad Verecundiam}: \\; \\text{Famoso en campo } X \\text{ afirma } P \\in Y \\implies P \\quad (\\text{Inválido})",
                    "\\text{Causa Falsa}: \\; t(A) < t(B) \\implies A \\text{ causa } B \\quad (\\text{Inválido})"
                ),
                formulaName = "Taxonomía de Falacias Epistémicas",
                formulaLatex = "P \\equiv Q \\implies (P \\vdash Q) \\quad (\\text{Circularidad vacía sin aporte de prueba externa})",
                formulaDescription = "Identificación de vicios de fundamentación epistemológica.",
                admissionTip = "Si la justificación de una afirmación dice 'nadie ha probado que sea mentira', la respuesta es 'Ad Ignorantiam'. Si la justificación es idéntica a lo que se quiere probar (razonamiento circular), es 'Petición de Principio'.",
                admissionExplanation = "• Recuerda que la ausencia de prueba no constituye prueba de ausencia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "«Debemos creer sin reservas que la astrología es una ciencia exacta, dado que ningún astrónomo contemporáneo ha logrado refutar de manera concluyente todas las predicciones de los horóscopos». Este razonamiento incurre en la falacia:",
                    options = listOf(
                        "Argumentum ad baculum",
                        "Argumentum ad ignorantiam",
                        "Argumentum ad hominem",
                        "Petición de principio",
                        "Causa falsa"
                    ),
                    correctIndex = 1,
                    explanation = "Pretende dar por probada la validez de la astrología fundándose únicamente en que no se ha demostrado su falsedad total, cometiendo una falacia 'Ad Ignorantiam'.",
                    subject = "Raz. Verbal",
                    semana = 5
                ),
                Challenge(
                    id = "q_rv_t05_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "«El profesor es un hombre sumamente sabio porque posee una inmensa sabiduría en todos los temas». ¿Qué vicio de razonamiento se evidencia?",
                    options = listOf(
                        "Falacia de falsa analogía",
                        "Petición de principio (círculo vicioso)",
                        "Argumentum ad verecundiam",
                        "Argumentum ad misericordiam",
                        "Anfibología"
                    ),
                    correctIndex = 1,
                    explanation = "Se afirma que es sabio porque tiene sabiduría; la conclusión se limita a repetir la premisa inicial sin aportar ninguna evidencia real externa, cometiendo 'Petición de principio' (petitio principii).",
                    subject = "Raz. Verbal",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: PRAGMÁTICA EN ENUNCIADOS (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "rv_t06_s01",
            subjectId = "raz_verbal",
            semana = 6,
            subtema = "6.1 Teoría de los Actos de Habla de Austin y Searle",
            title = "Actos de Habla: Locutivo, Ilocutivo y Perlocutivo",
            theory = LessonTheory(
                id = "th_rv_t06_s01",
                asignatura = "Raz. Verbal",
                semana = 6,
                titulo = "La Teoría de los Actos de Habla",
                resumen = "• La Pragmática Lingüística:\n  - Rama de la lingüística que estudia el uso del lenguaje en contexto: no lo que las palabras significan aisladas en el diccionario, sino lo que los hablantes **hacen** al emitirlas.\n\n• Los Tres Niveles Simultáneos del Acto de Habla (John L. Austin):\n  1. **Acto Locutivo (Lo que se dice formalmente):**\n     - La emisión física, fonética y gramatical de sonidos organizados con significado literal (*decir las palabras*).\n     - Ejemplo: Pronunciar la oración: «Hace mucho frío en esta aula».\n  2. **Acto Ilocutivo (La intención o fuerza pragmática del emisor):**\n     - La acción que realiza el emisor mediante el acto de hablar (ordenar, pedir, amenazar, felicitar, prometer, advertir).\n     - En el ejemplo anterior: La intención no es describir el clima, sino **pedir indirectamente que cierren la ventana**.\n  3. **Acto Perlocutivo (El efecto real causado en el receptor):**\n     - La consecuencia o reacción psicológica y fáctica provocada en el oyente (convencer, asustar, persuadir, enfadar, mover a la acción).\n     - En el ejemplo anterior: Que un estudiante se levante y cierre la ventana del aula.\n\n• Actos de Habla Directos vs. Indirectos:\n  - **Directo:** Coincidencia entre la forma gramatical y la fuerza ilocutiva (*«Cierre la puerta»* $\\to$ imperativo directo).\n  - **Indirecto:** Discrepancia entre la forma y la intención (*«¿Tienes hora?»* no indaga sobre la posesión del reloj, sino que solicita la hora exacta).",
                conceptosClave = listOf(
                    "Pragmática: Estudio del lenguaje en situaciones comunicativas reales",
                    "Acto locutivo: Emisión física y léxica del enunciado con significado literal",
                    "Acto ilocutivo: Fuerza e intención comunicativa del emisor (la acción de ordenar o pedir)",
                    "Acto perlocutivo: Reacción y efecto inducido en el oyente",
                    "Acto de habla indirecto: Formulación diplomática o atenuada de una orden"
                ),
                formulas = listOf(
                    "\\text{Acto de Habla} = \\text{Locutivo (Forma)} + \\text{Ilocutivo (Intención)} + \\text{Perlocutivo (Efecto)}",
                    "\\text{Acto Indirecto}: \\; \\text{Forma Pregunta (¿Puedes...?)} \\implies \\text{Fuerza Ilocutiva de Mandato}"
                ),
                formulaName = "Trilogía de Austin-Searle",
                formulaLatex = "\\text{Enunciado} \\implies \\langle \\text{Locutivo}, \\; \\text{Ilocutivo}, \\; \\text{Perlocutivo} \\rangle",
                formulaDescription = "Descomposición pragmática de la acción verbal en tres dimensiones simultáneas.",
                admissionTip = "Si te preguntan por la INTENCIÓN o propósito del hablante al emitir una frase, te están preguntando por el nivel ILOCUTIVO. Si te preguntan por la reacción que generó en el público, te preguntan por el nivel PERLOCUTIVO.",
                admissionExplanation = "• Las fórmulas de cortesía como '¿Podrías alcanzarme la sal?' son actos ilocutivos indirectos de petición, no preguntas sobre capacidad física."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un docente ingresa al laboratorio de química y expresa con tono firme a sus alumnos: «¡Hay una fuga de gas inflamable en la mesa 3!». Inmediatamente, todos los estudiantes evacúan el aula en silencio. La evacuación rápida de los alumnos constituye un acto:",
                    options = listOf(
                        "Locutivo",
                        "Ilocutivo",
                        "Perlocutivo",
                        "Fático",
                        "Metalingüístico"
                    ),
                    correctIndex = 2,
                    explanation = "La evacuación física efectiva de los alumnos es la reacción y efecto real inducido en los receptores por el mensaje del docente, lo que define al acto perlocutivo.",
                    subject = "Raz. Verbal",
                    semana = 6
                ),
                Challenge(
                    id = "q_rv_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cuando una persona le dice a otra: «¿Serías tan amable de guardar silencio durante la explicación?», nos encontramos ante un acto de habla:",
                    options = listOf(
                        "Directo imperativo",
                        "Indirecto de petición",
                        "Locutivo sin intención",
                        "Perlocutivo fallido",
                        "Asertivo neutro"
                    ),
                    correctIndex = 1,
                    explanation = "Es un acto de habla indirecto: utiliza la estructura gramatical de una pregunta interrogativa formal para transmitir una fuerza ilocutiva de orden o petición de silencio.",
                    subject = "Raz. Verbal",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rv_t06_s02",
            subjectId = "raz_verbal",
            semana = 6,
            subtema = "6.2 Principio de Cooperación y Máximas Conversacionales de Grice",
            title = "El Principio de Cooperación y las 4 Máximas de Grice",
            theory = LessonTheory(
                id = "th_rv_t06_s02",
                asignatura = "Raz. Verbal",
                semana = 6,
                titulo = "Principio de Cooperación y Máximas de Grice",
                resumen = "• El Principio de Cooperación (H. Paul Grice):\n  - «Haz que tu contribución a la conversación sea la requerida, en el momento en que se produce, por el propósito aceptado del intercambio comunicativo».\n\n• Las Cuatro Máximas Conversacionales:\n  1. **Máxima de Cantidad (Información justa):**\n     - Proporciona tanta información como sea necesaria para el propósito de la charla.\n     - No des más información de la requerida ni seas mezquino con datos vitales.\n     - Violación: Hablar durante diez minutos sin parar para responder si la tienda está abierta.\n  2. **Máxima de Calidad (Verdad y veracidad):**\n     - Intenta que tu contribución sea verdadera.\n     - No digas aquello que consideres falso ni afirmes cosas de las que carezcas de pruebas suficientes.\n     - Violación: Mentir deliberadamente o propagar rumores infundados.\n  3. **Máxima de Relación o Relevancia (Pertinencia tematica):**\n     - ¡Sé pertinente! Tus intervenciones deben guardar relación directa con el tema tratado.\n     - Violación: Responder «Las rosas florecen en primavera» cuando te preguntan a qué hora sale el autobús.\n  4. **Máxima de Modo (Claridad en la expresión):**\n     - Sé claro, conciso y ordenado.\n     - Evita la oscuridad de expresión, evita la ambigüedad deliberada, sé breve y estructurado.",
                conceptosClave = listOf(
                    "Principio de cooperación: Supuesto tácito de colaboración informativa entre hablantes",
                    "Máxima de cantidad: Ni más ni menos información de la que la conversación exige",
                    "Máxima de calidad: Decir solo la verdad y aquello respaldado por evidencia",
                    "Máxima de relación: Pertinencia y ajuste riguroso al eje temático",
                    "Máxima de modo: Claridad, brevedad y orden evitando ambigüedades"
                ),
                formulas = listOf(
                    "\\text{Máximas de Grice} = \\{\\text{Cantidad}, \\text{Calidad}, \\text{Relación}, \\text{Modo}\\}",
                    "\\text{Comunicación Óptima} \\iff \\text{Cooperación Estricta sin Violación Gratuita}"
                ),
                formulaName = "Tetralogía Conversacional de Grice",
                formulaLatex = "\\text{Diálogo Válido} = \\text{Cantidad}(q) \\land \\text{Calidad}(v) \\land \\text{Relación}(r) \\land \\text{Modo}(c)",
                formulaDescription = "Condiciones ideales de interacción comunicativa pragmática.",
                admissionTip = "Si en un diálogo alguien cambia de tema abruptamente para evadir una pregunta comprometida, viola la Máxima de RELACIÓN (o Pertinencia). Si alguien miente a sabiendas, viola la Máxima de CALIDAD.",
                admissionExplanation = "• Cuando un hablante transgrede una máxima de forma ostensible y deliberada, no busca romper la conversación, sino forzar al oyente a deducir una 'implicatura conversacional'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un juicio, el fiscal pregunta al testigo: «¿Vio usted al acusado ingresar al banco a las tres de la tarde?». El testigo contesta: «El cielo estaba bastante nublado ese día y yo vestía una casaca azul muy abrigadora». ¿Qué máxima conversacional de Grice ha violado el testigo?",
                    options = listOf(
                        "Máxima de cantidad",
                        "Máxima de calidad",
                        "Máxima de relación (pertinencia)",
                        "Máxima de modo",
                        "Máxima de cortesía"
                    ),
                    correctIndex = 2,
                    explanation = "El testigo no responde sobre el ingreso del acusado, sino que introduce datos completamente irrelevantes sobre el clima y su ropa, violando frontalmente la máxima de relación o pertinencia.",
                    subject = "Raz. Verbal",
                    semana = 6
                ),
                Challenge(
                    id = "q_rv_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un médico le receta un jarabe a un paciente y este le consulta: «Doctor, ¿cuántas cucharadas debo tomar al día?». El médico responde: «Tome medicamentos». ¿Qué máxima se infringe?",
                    options = listOf(
                        "Máxima de cantidad",
                        "Máxima de cortesía",
                        "Máxima de calidad",
                        "Máxima de tiempo",
                        "Máxima de locución"
                    ),
                    correctIndex = 0,
                    explanation = "La respuesta omite la dosis específica que el paciente necesita indispensablemente para tratarse, proporcionando una cantidad de información manifiestamente insuficiente (violación de la máxima de cantidad).",
                    subject = "Raz. Verbal",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rv_t06_s03",
            subjectId = "raz_verbal",
            semana = 6,
            subtema = "6.3 Implicaturas Conversacionales, Presuposiciones e Ironía",
            title = "Implicaturas Conversacionales y Presuposiciones",
            theory = LessonTheory(
                id = "th_rv_t06_s03",
                asignatura = "Raz. Verbal",
                semana = 6,
                titulo = "Implicaturas, Presuposiciones e Ironía",
                resumen = "• Lo Dicho vs. Lo Comunicado:\n  - En la comunicación cotidiana, los seres humanos transmitimos mucho más de lo que expresamos con el significado literal de las oraciones.\n\n• Conceptos Pragmáticos Fundamentales:\n  1. **La Implicatura Conversacional:**\n     - Significado implícito que el emisor transmite sin expresarlo directamente, apoyándose en el contexto y en el Principio de Cooperación.\n     - Ejemplo: *— ¿Vamos al cine esta noche? — Mañana rindo el examen de admisión a las 7:00 AM.*\n     - Significado literal: Notificar la hora del examen.\n     - **Implicatura:** «No puedo ir al cine porque tengo que estudiar y descansar temprano».\n  2. **La Presuposición:**\n     - Información previa que se da por sentada y que debe ser necesariamente verdadera para que la oración tenga sentido coherente.\n     - Ejemplo: *«Carlos dejó de fumar pipa»* $\\to$ Presuposición lógica incuestionable: **Carlos fumaba pipa en el pasado**.\n     - Ejemplo: *«El hermano de Julia llegó de Arequipa»* $\\to$ Presuposición: **Julia tiene un hermano**.\n  3. **La Ironía Pragmática:**\n     - Figura por la cual el emisor da a entender exactamente lo contrario de lo que enuncia literalmente mediante entonación o evidente contraste con la realidad.\n     - Ejemplo: Ante una copiosa tormenta torrencial: *«¡Qué día tan hermoso y soleado para ir a la playa!»*.",
                conceptosClave = listOf(
                    "Implicatura conversacional: Sentido sobreentendido inferido a partir del contexto",
                    "Presuposición: Información asumida como verídica previa a la enunciación de la frase",
                    "Ironía: Expresión que invierte el sentido literal mediante pistas entonativas o contextuales",
                    "Subtexto comunicativo: Red de significados tácitos compartidos por la comunidad"
                ),
                formulas = listOf(
                    "\\text{Lo Comunicado} = \\text{Significado Literal (Lo dicho)} + \\text{Implicaturas (Lo deducido)}",
                    "\\text{Presuposición}: \\; O \\implies P \\; \\land \\; \\neg O \\implies P \\quad (\\text{Invariante ante negación})"
                ),
                formulaName = "Fórmula del Sentido Implícito",
                formulaLatex = "\\text{Implicatura} = \\text{Inferir}(O \\mid \\text{Contexto} \\land \\text{Cooperación})",
                formulaDescription = "Deducción de información subyacente que no figura en la estructura sintáctica explícita.",
                admissionTip = "Prueba de la negación para presuposiciones: Niega la oración. Si el hecho sigue siendo forzosamente verdadero, es una presuposición. Por ejemplo, en 'Carlos no dejó de fumar', se sigue asumiendo que fumaba en el pasado.",
                admissionExplanation = "• Las preguntas DECO de la UNSA frecuentemente piden deducir qué 'presupone' el autor antes de argumentar."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el diálogo: \n— Madre: «¿Te comiste todos los pasteles de la alacena?». \n— Hijo: «Mamá, en la casa hay cinco personas más». \n¿Cuál es la IMPLICATURA que transmite el hijo?",
                    options = listOf(
                        "Que la madre preparó pasteles insuficientes",
                        "Que él no fue el único ni necesariamente el responsable de comerse los pasteles",
                        "Que la casa tiene habitaciones muy amplias",
                        "Que los pasteles estaban deliciosos",
                        "Que las cinco personas están durmiendo"
                    ),
                    correctIndex = 1,
                    explanation = "El hijo no niega literalmente la acción de comer, pero al señalar que hay cinco personas más en la casa, genera la implicatura pragmática de que la culpa puede recaer en otros y no exclusivamente en él.",
                    subject = "Raz. Verbal",
                    semana = 6
                ),
                Challenge(
                    id = "q_rv_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el enunciado: «El docente lamentó que su mejor estudiante volviera a reprobar el examen de física», ¿cuál es la PRESUPOSICIÓN necesaria?",
                    options = listOf(
                        "El estudiante jamás había desaprobado física",
                        "El estudiante ya había reprobado el examen de física al menos una vez en el pasado",
                        "El examen de física fue anulado por fraude",
                        "El docente dictó una clase deficiente",
                        "Todos los estudiantes reprobaron la materia"
                    ),
                    correctIndex = 1,
                    explanation = "El verbo 'volver a' (perífrasis iterativa) presupone obligatoriamente que la acción de reprobar ya había acontecido al menos una vez con anterioridad.",
                    subject = "Raz. Verbal",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rv_t06_s04",
            subjectId = "raz_verbal",
            semana = 6,
            subtema = "6.4 Registro Lingüístico, Tono y Deixis Espaciotemporal",
            title = "Registro, Tono Discursivo y Deixis",
            theory = LessonTheory(
                id = "th_rv_t06_s04",
                asignatura = "Raz. Verbal",
                semana = 6,
                titulo = "Registro, Tono del Autor y Deixis",
                resumen = "• El Tono del Autor en Textos de Admisión:\n  - Es la actitud emocional o postura intelectual que el autor proyecta respecto al tema tratado o a los personajes descritos.\n  - Clasificación de Tonos Frecuentes:\n    * *Objetivo / Asertivo:* Neutral, científico, desapasionado, basado en datos empíricos.\n    * *Crítico / Censor:* Cuestiona, desaprueba, señala defectos o inmoralidades.\n    * *Irónico / Sarcástico:* Se burla mediante dobles sentidos sutiles o mordaces.\n    * *Pesimista / Sombrío:* Augura desenlaces trágicos, enfatiza la decadencia.\n    * *Laudatorio / Encomiástico:* Alaba, elogia con fervor los méritos de alguien.\n    * *Exhortativo / Conmovedor:* Busca motivar a la acción, apela a la compasión.\n\n• La Deixis (Anclaje Enunciativo):\n  - Mecanismo por el cual palabras específicas señalan elementos del entorno inmediato de la enunciación:\n    1. **Deixis Personal:** Señala a los interlocutores (*yo, tú, nosotros, usted*).\n    2. **Deixis Espacial:** Señala la distancia respecto al emisor mediante demostrativos y adverbios (*este, ese, aquel; aquí, ahí, allí*).\n    3. **Deixis Temporal:** Señala el tiempo relativo al momento de emisión (*hoy, ayer, mañana, ahora, entonces*).",
                conceptosClave = listOf(
                    "Tono del autor: Actitud emotiva e intelectual subyacente en el estilo discursivo",
                    "Tono crítico vs. objetivo: Juicio valorativo de censura frente a neutralidad científica",
                    "Deixis: Palabras cuyo significado referencial depende enteramente del aquí y ahora del emisor",
                    "Registro lingüístico: Formal, culto, estándar, coloquial o vulgar"
                ),
                formulas = listOf(
                    "\\text{Tono} = f(\\text{Carga Connotativa de Adjetivos} + \\text{Signos Expresivos} + \\text{Léxico Valorativo})",
                    "\\text{Deixis} = \\langle \\text{Persona (Quién)}, \\; \\text{Espacio (Dónde)}, \\; \\text{Tiempo (Cuándo)} \\rangle"
                ),
                formulaName = "Matriz de Anclaje Enunciativo",
                formulaLatex = "\\text{Tono}(T) = \\arg\\max_{\\tau \\in \\mathcal{T}} \\text{CoherenciaEmocional}(T, \\tau)",
                formulaDescription = "Diagnóstico de la actitud emotiva dominante en el texto.",
                admissionTip = "Para determinar el tono del autor, subraya los adjetivos y adverbios valorativos: si abundan palabras como 'aberrante', 'corrupto', 'lamentable', el tono es inequívocamente crítico o censurador.",
                admissionExplanation = "• No confundas tu propia reacción emocional como lector con el tono del autor: juzga las palabras que el autor eligió plasmar en el papel."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Fragmento: «Pretender que la construcción de megaproyectos mineros sin consulta previa salvará a las comunidades andinas es una ingenuidad rayana en el cinismo. Las autoridades celebran contratos multimillonarios mientras los ríos de la cuenca se convierten en cloacas de metales pesados». ¿Cuál es el TONO predominante del autor?",
                    options = listOf(
                        "Objetivo y neutro",
                        "Mordaz e irónico",
                        "Indignado y crítico",
                        "Laudatorio y festivo",
                        "Resignado y conformista"
                    ),
                    correctIndex = 2,
                    explanation = "El autor emplea términos cargados de fuerte condena moral ('cinismo', 'cloacas de metales pesados', 'ingenuidad'), manifestando un tono claramente indignado y crítico ante las políticas cuestionadas.",
                    subject = "Raz. Verbal",
                    semana = 6
                ),
                Challenge(
                    id = "q_rv_t06_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la frase dicha por un guía en la Plaza de Armas de Arequipa: «Aquí, frente a esta imponente catedral de sillar, nos reuniremos mañana a las diez», las palabras AQUÍ y MAÑANA constituyen respectivamente deixis:",
                    options = listOf(
                        "Temporal y personal",
                        "Espacial y temporal",
                        "Personal y social",
                        "Espacial y modal",
                        "Textual y anafórica"
                    ),
                    correctIndex = 1,
                    explanation = "'Aquí' señala el lugar físico inmediato del hablante (deixis espacial); 'mañana' señala el día siguiente relativo al momento de emisión de la frase (deixis temporal).",
                    subject = "Raz. Verbal",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: CORRECCIÓN POR SENTIDO (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "rv_t07_s01",
            subjectId = "raz_verbal",
            semana = 7,
            subtema = "7.1 Ambigüedad Léxica y Anfibología Sintáctica",
            title = "Anfibología y Ambigüedad: Detección y Enmienda",
            theory = LessonTheory(
                id = "th_rv_t07_s01",
                asignatura = "Raz. Verbal",
                semana = 7,
                titulo = "Ambigüedad Léxica y Anfibología",
                resumen = "• La Anfibología (Vicio Sintáctico de Doble Sentido):\n  - Consiste en estructurar una oración de tal manera que genera dos o más interpretaciones semánticas radicalmente distintas, confundiendo al lector.\n  - En el examen de admisión se evalúa la capacidad de detectar el error y seleccionar la redacción unívoca y clara.\n\n• Casos Típicos de Anfibología en Admisión:\n  1. **Posesivo Ambiguo (*Su / Sus*):**\n     - $\\times$ *«Juan vio a Pedro cuando salía de su casa»* $\\to$ ¿De la casa de quién salía? ¿De la de Juan o de la de Pedro?\n     - $\\checkmark$ *Enmienda unívoca:* *«Cuando salía de su propia casa, Juan vio a Pedro»* o *«Juan vio a Pedro cuando este salía de su casa»*.\n  2. **Modificador Mal Ubicado o Desplazado:**\n     - $\\times$ *«Se venden casacas para señoritas de cuero»* $\\to$ ¿Las señoritas son de cuero?\n     - $\\checkmark$ *Enmienda:* *«Se venden casacas de cuero para señoritas»*.\n     - $\\times$ *«El médico examinó al niño con fiebre alta»* $\\to$ ¿Quién tenía fiebre: el médico o el niño?\n     - $\\checkmark$ *Enmienda:* *«El médico examinó al niño que presentaba fiebre alta»*.\n  3. **Complemento Objeto Confuso:**\n     - $\\times$ *«El perro de mi vecino me mordió»* (puede interpretarse como un insulto vulgar al vecino).\n     - $\\checkmark$ *Enmienda:* *«El can que pertenece a mi vecino me mordió»*.",
                conceptosClave = listOf(
                    "Anfibología: Ambigüedad sintáctica que produce dos o más interpretaciones posibles",
                    "Posesivo ambiguo: Empleo descuidado de 'su' que no esclarece al poseedor real",
                    "Modificador mal ubicado: Adyacente adjetival que califica al sustantivo erróneo",
                    "Redacción unívoca: Formulación estricta que admite una única lectura lógica"
                ),
                formulas = listOf(
                    "\\text{Anfibología}: \\; O \\implies \\{S_1, S_2\\} \\quad (S_1 \\neq S_2)",
                    "\\text{Corrección}: \\; \\text{Reordenamiento Sintáctico} \\implies O^* \\implies \\{S_1\\} \\quad (\\text{Unívoco})"
                ),
                formulaName = "Desambiguación Sintáctica Canónica",
                formulaLatex = "\\text{Ambigüedad}(O) > 0 \\implies O \\notin \\text{Norma Académica}",
                formulaDescription = "Principio de univocidad referencial en la redacción formal preuniversitaria.",
                admissionTip = "Para detectar anfibología, busca adjetivos o frases preposicionales pegadas a dos sustantivos seguidos. Si el adjetivo puede calificar a cualquiera de los dos, ¡ahí está la anfibología!",
                admissionExplanation = "• El uso del relativo 'el cual / la cual' o de demostrativos como 'este / aquel' ayuda a disipar ambigüedades de posesión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que adolece de ANFIBOLOGÍA:",
                    options = listOf(
                        "El ingeniero entregó los planos definitivos al director del proyecto.",
                        "Encontré a mi colega caminando por el parque en su automóvil.",
                        "Las enfermeras atendieron con diligencia a todos los pacientes.",
                        "El rector inauguró el año académico con un discurso memorable.",
                        "Los estudiantes presentaron su solicitud de beca dentro del plazo fijado."
                    ),
                    correctIndex = 1,
                    explanation = "«Encontré a mi colega caminando por el parque en su automóvil» contiene una anfibología absurda: no queda claro si el colega caminaba mientras el emisor iba en auto, o si el colega 'caminaba dentro del automóvil'.",
                    subject = "Raz. Verbal",
                    semana = 7
                ),
                Challenge(
                    id = "q_rv_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la forma correcta y unívoca de corregir el enunciado: «El docente felicitó a su alumno por su perseverancia en su despacho»?",
                    options = listOf(
                        "En su despacho, el docente felicitó a su alumno por su perseverancia.",
                        "El docente, en el despacho de este, felicitó a su alumno por perseverar.",
                        "El docente felicitó en su despacho por su perseverancia a su alumno.",
                        "Estando en el despacho del docente, este felicitó al alumno por la perseverancia demostrada por el joven.",
                        "En su despacho de él, el docente felicitó a su alumno."
                    ),
                    correctIndex = 3,
                    explanation = "La opción resuelve completamente la triple ambigüedad del pronombre posesivo 'su' al precisar con exactitud de quién era el despacho (del docente) y de quién era la perseverancia (del joven estudiante).",
                    subject = "Raz. Verbal",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rv_t07_s02",
            subjectId = "raz_verbal",
            semana = 7,
            subtema = "7.2 Pleonasmo, Redundancia Viciosa y Economía Verbal",
            title = "Pleonasmo y Redundancia Viciosa en la Expresión",
            theory = LessonTheory(
                id = "th_rv_t07_s02",
                asignatura = "Raz. Verbal",
                semana = 7,
                titulo = "Pleonasmo y Redundancia Viciosa",
                resumen = "• El Pleonasmo o Redundancia Viciosa:\n  - Consiste en el empleo innecesario de palabras que reiteran conceptos que ya están implícitos en la definición del término nuclear, empobreciendo el estilo y vulnerando la economía del lenguaje.\n\n• Catálogo de Redundancias Viciosas Sancionadas en Exámenes:\n  - $\\times$ *Subir arriba / Bajar abajo / Entrar adentro / Salir afuera* $\\to$ $\\checkmark$ Subir / Bajar / Entrar / Salir.\n  - $\\times$ *Hemiplegia en la mitad del cuerpo* $\\to$ $\\checkmark$ Hemiplegia (el prefijo *hemi-* ya significa mitad).\n  - $\\times$ *Lapso de tiempo* $\\to$ $\\checkmark$ Lapso (lapso es forzosamente un periodo de tiempo).\n  - $\\times$ *Mendrugo de pan* $\\to$ $\\checkmark$ Mendrugo (por definición es un pedazo de pan duro).\n  - $\\times$ *Hemorragia de sangre* $\\to$ $\\checkmark$ Hemorragia (el étimo griego *haima* significa sangre).\n  - $\\times$ *Volver a repetir* $\\to$ $\\checkmark$ Repetir.\n  - $\\times$ *Erario público* $\\to$ $\\checkmark$ Erario (el erario es necesariamente el tesoro público del Estado).\n  - $\\times$ *Prever con antelación* $\\to$ $\\checkmark$ Prever.\n  - $\\times$ *Cita previa* $\\to$ $\\checkmark$ Cita.\n  - $\\times$ *Bifurcarse en dos caminos* $\\to$ $\\checkmark$ Bifurcarse (*bi-* significa dos).\n\n• Pleonasmo Retórico vs. Vicioso:\n  - El pleonasmo retórico se tolera en poesía por belleza emotiva (*«Lo vi con mis propios ojos»*); pero en redacción académica y exámenes de admisión, todo pleonasmo constituye un error formal.",
                conceptosClave = listOf(
                    "Redundancia viciosa: Reiteración innecesaria de semas ya contenidos en la definición léxica",
                    "Principio de economía lingüística: Comunicar el máximo de sentido con el mínimo de palabras",
                    "Etimología reveladora: Comprender las raíces griegas y latinas evita pleonasmos médicos",
                    "Sanción académica: En textos formales preuniversitarios, los pleonasmos deben ser eliminados"
                ),
                formulas = listOf(
                    "\\text{Redundancia}: \\; \\text{Definición}(A) \\supset B \\implies A + B = \\text{Vicioso}",
                    "\\text{Ejemplo}: \\; \\text{Definición}(\\text{lapso}) = \\text{periodo de tiempo} \\implies \\times \\text{lapso de tiempo}"
                ),
                formulaName = "Ley de No Redundancia Semémica",
                formulaLatex = "\\text{Semas}(A) \\cap \\text{Semas}(B) = \\text{Semas}(B) \\implies B \\text{ es redundante}",
                formulaDescription = "Eliminación de unidades léxicas que no aportan nueva información semántica.",
                admissionTip = "Presta especial atención a palabras de origen griego como hemorragia, monólogo, bígamo o necropsia: si la frase repite en español la raíz griega (como 'monólogo de una sola persona'), es una redundancia viciosa.",
                admissionExplanation = "• 'Actualmente en vigor' o 'vigente en la actualidad' es redundante; basta con decir 'vigente'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que contiene una REDUNDANCIA VICIOSA:",
                    options = listOf(
                        "El científico presentó las conclusiones preliminares de su trabajo.",
                        "El paciente sufrió una hemorragia de sangre tras la intervención quirúrgica.",
                        "El comité disciplinario sancionó a los infractores del reglamento.",
                        "Las lluvias intensas afectaron los cultivos del valle de Majes.",
                        "El congresista solicitó una licencia temporal por motivos de salud."
                    ),
                    correctIndex = 1,
                    explanation = "'Hemorragia' proviene del griego 'haima' (sangre) y 'rragía' (brotar); por definición médica, toda hemorragia es una pérdida de sangre. Decir 'hemorragia de sangre' es un pleonasmo vicioso inadmisible.",
                    subject = "Raz. Verbal",
                    semana = 7
                ),
                Challenge(
                    id = "q_rv_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes frases NO contiene pleonasmo?",
                    options = listOf(
                        "Durante un breve lapso de tiempo descansaron los obreros.",
                        "El camino se bifurcó en dos sendas opuestas.",
                        "El tribunal emitió un fallo definitivo al mediodía.",
                        "El testigo prometió volver a reiterar su declaración.",
                        "Se construyó un túnel subterráneo bajo la avenida."
                    ),
                    correctIndex = 2,
                    explanation = "Un fallo judicial puede ser provisional o definitivo; por ende, 'fallo definitivo' no es redundante. En cambio, 'lapso de tiempo', 'bifurcar en dos', 'volver a reiterar' y 'túnel subterráneo' son redundancias viciosas clásicas.",
                    subject = "Raz. Verbal",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rv_t07_s03",
            subjectId = "raz_verbal",
            semana = 7,
            subtema = "7.3 Impropiedad Léxica y Barbarismos en el Registro Académico",
            title = "Impropiedad Léxica y Barbarismos Frecuentes",
            theory = LessonTheory(
                id = "th_rv_t07_s03",
                asignatura = "Raz. Verbal",
                semana = 7,
                titulo = "Impropiedad Léxica y Barbarismos",
                resumen = "• La Impropiedad Léxica:\n  - Consiste en emplear una palabra con un significado diferente al que legítimamente le corresponde según la norma de la RAE, frecuentemente por parecido fónico o traducción literal errónea del inglés (falsos amigos).\n\n• Casos Críticos Evaluados en Admisión:\n  1. **Ostentar vs. Detentar:**\n     - *Ostentar:* Exhibir algo con orgullo o ejercer legítimamente un cargo importante (*«Ostenta el cargo de rector»*).\n     - *Detentar:* Retener o ejercer un poder o cargo de forma **ilegítima o por la fuerza** (*«El dictador detenta el poder ilegalmente»*). Usar detentar para un cargo democrático es impropiedad.\n  2. **Adolecer vs. Carecer:**\n     - *Adolecer:* Padecer, sufrir o estar afectado por un mal o defecto (*«Adolece de artritis»*, *«El plan adolece de inconsistencia»*).\n     - *Carecer:* No tener algo (*«Carece de recursos económicos»*). Decir *«Adolece de dinero»* para decir que no tiene dinero es un error gravísimo.\n  3. **Aperturar vs. Abrir:**\n     - *Aperturar* es un barbarismo financiero censurado por la RAE; lo correcto es *abrir una cuenta* o *inaugurar un certamen*.\n  4. **Recepcionar vs. Recibir:**\n     - Se debe decir *recibir documentos / recibir pacientes*, no el barbarismo *recepcionar*.\n  5. **Bizarro:**\n     - En español culto tradicional significa **valiente, generoso o bizarro de ánimo**, no 'raro o grotesco' (aunque la RAE incorporó recientemente el calco del inglés, en admisión se sigue priorizando la distinción clásica).",
                conceptosClave = listOf(
                    "Impropiedad léxica: Empleo de un vocablo con sentido ajeno a su definición oficial",
                    "Adolecer (padecer un mal) vs. Carecer (falta de algo): Trampa clásica preuniversitaria",
                    "Detentar (poder ilegítimo) vs. Ostentar (cargo legítimo)",
                    "Barbarismos morfológicos: Creaciones innecesarias como aperturar o recepcionar"
                ),
                formulas = listOf(
                    "\\text{Adolecer} \\implies \\text{Padecer un defecto o enfermedad (nunca significa no tener)}",
                    "\\text{Detentar} \\implies \\text{Usurpar / Ejercer poder de facto ilegítimamente}",
                    "\\text{Impropiedad}: \\; \\text{Uso}(w) \\neq \\text{Semas}(w) \\quad (\\text{Vicio Normativo})"
                ),
                formulaName = "Filtro de Propiedad Semántica",
                formulaLatex = "w \\in \\text{Texto Académico} \\iff \\text{Sentido}(w) \\equiv \\text{Definición RAE}(w)",
                formulaDescription = "Verificación de adecuación denotativa normativa en el léxico culto.",
                admissionTip = "¡La trampa preferida de la UNSA! Si en una oración ves 'El hospital adolece de medicinas', ¡está mal redactada! Debería decir 'El hospital carece de medicinas'. Solo se adolece de males, no de faltantes.",
                admissionExplanation = "• No confundas 'infringir' (violar una ley) con 'infligir' (aplicar un castigo o causar daño)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que hace un uso CORRECTO del verbo ADOLECER:",
                    options = listOf(
                        "La biblioteca universitaria adolece de libros de cálculo avanzado.",
                        "El joven ingeniero adolece de dinero para financiar su maestría.",
                        "La propuesta legislativa adolece de graves vacíos constitucionales.",
                        "El hospital regional adolece de médicos especialistas en pediatría.",
                        "La universidad adolece de aulas suficientes para los ingresantes."
                    ),
                    correctIndex = 2,
                    explanation = "'Adolecer' significa padecer un defecto, vicio o enfermedad. En la opción (C), el proyecto de ley padece el mal de 'graves vacíos constitucionales'. En todas las demás opciones se pretendió usar indebidamente como sinónimo de 'carecer' o 'faltar'.",
                    subject = "Raz. Verbal",
                    semana = 7
                ),
                Challenge(
                    id = "q_rv_t07_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el enunciado: «El presidente democráticamente elegido DETENTA el mando supremo de las Fuerzas Armadas», existe una incorrección de:",
                    options = listOf(
                        "Anfibología sintáctica",
                        "Impropiedad léxica",
                        "Solecismo de concordancia",
                        "Pleonasmo vicioso",
                        "Barbarismo ortográfico"
                    ),
                    correctIndex = 1,
                    explanation = "'Detentar' significa retener o ejercer un poder de manera ilegítima o usurpadora. Al tratarse de un presidente democrático y legítimo, el verbo propio debe ser 'ejerce' u 'ostenta', configurando un caso evidente de impropiedad léxica.",
                    subject = "Raz. Verbal",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rv_t07_s04",
            subjectId = "raz_verbal",
            semana = 7,
            subtema = "7.4 Discordancia Gramatical, Solecismos y Régimen Preposicional",
            title = "Solecismos, Discordancias y Régimen Preposicional",
            theory = LessonTheory(
                id = "th_rv_t07_s04",
                asignatura = "Raz. Verbal",
                semana = 7,
                titulo = "Solecismos y Discordancias Gramaticales",
                resumen = "• El Solecismo (Error contra la Sintaxis y la Concordancia):\n  - Cualquier transgresión a las normas sintácticas de concordancia, régimen o construcción oracional correcta.\n\n• Principales Solecismos Evaluados en Admisión:\n  1. **Discordancia de Número en Verbos Impersonales (*Haber y Hacer*):**\n     - El verbo *haber* como impersonal **SOLO SE CONJUGA EN SINGULAR** (*había, hubo, habrá, ha habido*).\n     - $\\times$ *«Hubieron muchos postulantes en la puerta»* $\\to$ $\\checkmark$ **«Hubo muchos postulantes...»**.\n     - $\\times$ *«Habían varios problemas difíciles»* $\\to$ $\\checkmark$ **«Había varios problemas...»**.\n     - Lo mismo ocurre con el verbo hacer referido al tiempo: *«Hacía muchos años»* (NUNCA: $\times$ *hacían*).\n  2. **Discordancia de Género y Número del Pronombre Clítico (*Le / Les*):**\n     - El pronombre debe concordar en número con el complemento indirecto al que refiere:\n     - $\\times$ *«Yo **le** dije a los estudiantes que repasaran»* $\\to$ $\\checkmark$ **«Yo les dije a los estudiantes...»**.\n  3. **Dequeísmo y Queísmo (Régimen Preposicional):**\n     - **Dequeísmo:** Emplear *de que* cuando el verbo solo exige *que* (prueba: reemplazar la cláusula por 'eso').\n       * $\\times$ *«Pienso **de que** es tarde»* $\\to$ (Pienso 'de eso' es incorrecto $\\to$ Pienso 'eso' $\\to$ $\\checkmark$ **Pienso que es tarde**).\n     - **Queísmo:** Omitir la preposición *de* ante *que* cuando el verbo la exige forzosamente:\n       * $\\times$ *«Me alegro **que** ingreses»* $\\to$ (Me alegro 'de eso' $\\to$ $\\checkmark$ **Me alegro de que ingreses**).\n  4. **Errores de Régimen Preposicional Frecuentes:**\n     - $\\times$ *A cuenta de* $\\to$ $\\checkmark$ **Por cuenta de**.\n     - $\\times$ *De acuerdo a* $\\to$ $\\checkmark$ **De acuerdo con**.\n     - $\\times$ *En base a* $\\to$ $\\checkmark$ **Sobre la base de / Con base en**.",
                conceptosClave = listOf(
                    "Solecismo: Infracción a las reglas sintácticas y de concordancia formal",
                    "Haber impersonal invariable: Jamás se pluraliza ('hubo problemas', no 'hubieron')",
                    "Concordancia del clítico le/les: Ajuste numérico obligatorio con el objeto indirecto",
                    "Dequeísmo vs. Queísmo: Prueba de sustitución pronominal por 'eso' / 'de eso'"
                ),
                formulas = listOf(
                    "\\text{Haber Impersonal}: \\; \\text{Haber} \\in \\{\\text{hay, había, hubo, habrá}\\} + \\text{SN (Singular o Plural)}",
                    "\\text{Prueba Dequeísmo}: \\; V + \\text{eso} \\implies \\text{Usa } \\mathbf{que} \\;; \\; V + \\text{de eso} \\implies \\text{Usa } \\mathbf{de \\ que}",
                    "\\text{Preposición Correcta}: \\; \\text{Con base en} \\; (\\text{Válido}) \\quad \\text{vs.} \\quad \\times \\text{En base a}"
                ),
                formulaName = "Algoritmo de Corrección Morfosintáctica",
                formulaLatex = "\\text{Haber}_{\\text{impersonal}} \\implies \\text{Número} = \\text{Singular} \\quad (\\text{Invarianza Sintáctica})",
                formulaDescription = "Regla de oro de la gramática académica para oraciones impersonales.",
                admissionTip = "Prueba infalible para dequeísmo: sustituye mentalmente la subordinada por la palabra 'eso'. Si dices 'Él me dijo [eso]', va solo 'que' (Él me dijo que...). Si dices 'Él se acordó [de eso]', va 'de que' (Él se acordó de que...).",
                admissionExplanation = "• Decir 'hubieron accidentes' es el error gramatical que más puntos resta en pruebas de aptitud verbal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la oración que contiene una DISCORDANCIA GRAMATICAL grave:",
                    options = listOf(
                        "Ayer hubo manifestaciones multitudinarias en el centro histórico.",
                        "Hubieron varios postulantes que olvidaron su carné de identidad.",
                        "Había tres libros de cálculo sobre la mesa de estudio.",
                        "Hizo días de intenso frío durante el invierno arequipeño.",
                        "Ha habido muchas quejas sobre el servicio de internet."
                    ),
                    correctIndex = 1,
                    explanation = "El verbo 'haber' en su empleo existencial impersonal carece de sujeto y debe conjugarse exclusivamente en singular. La forma correcta es 'Hubo varios postulantes...', siendo 'Hubieron' un solecismo de discordancia.",
                    subject = "Raz. Verbal",
                    semana = 7
                ),
                Challenge(
                    id = "q_rv_t07_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la oración que incurre en el vicio de DEQUEÍSMO:",
                    options = listOf(
                        "Estoy convencido de que alcanzaremos la meta propuesta.",
                        "El científico nos advirtió de que el reactivo era peligroso.",
                        "El catedrático opina de que el examen debe ser reprogramado.",
                        "Ella se acordó de que hoy vencía la matrícula universitaria.",
                        "Tengo la certeza de que ingresaremos a la universidad."
                    ),
                    correctIndex = 2,
                    explanation = "El verbo transitivo 'opinar' exige un complemento directo introducido por la conjunción 'que' (opina 'eso', no opina 'de eso'). Por consiguiente, 'opina de que...' es un caso flagrante de dequeísmo.",
                    subject = "Raz. Verbal",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: RESOLUCIÓN DE PROBLEMAS VERBALES (SEMANA 8)
        // =========================================================================
        LessonNode(
            id = "rv_t08_s01",
            subjectId = "raz_verbal",
            semana = 8,
            subtema = "8.1 Plan de Redacción: Criterio Deductivo (De lo General a lo Particular)",
            title = "Plan de Redacción por Criterio Deductivo",
            theory = LessonTheory(
                id = "th_rv_t08_s01",
                asignatura = "Raz. Verbal",
                semana = 8,
                titulo = "Plan de Redacción: Criterio Deductivo",
                resumen = "• El Ejercicio de Plan de Redacción:\n  - Consiste en ordenar un conjunto de enunciados numerados (habitualmente del I al V) para estructurar el texto más coherente, lógico y cohesionado posible.\n\n• El Criterio Deductivo Universal (Estructura Canónica de lo General a lo Particular):\n  - La mente humana y la ciencia avanzan de la máxima generalidad hacia los detalles específicos y aplicaciones.\n  - Secuencia Jerárquica Obligatoria:\n    1. **Idea más amplia o marco contextual / Origen etimológico:** Introducción al campo temático general (*La lírica en la literatura universal*).\n    2. **Definición o conceptualización del tema específico:** ¿Qué es el objeto de estudio? (*El yaraví como especie lírica mestiza*).\n    3. **Características esenciales y estructura interna:** Rasgos formales, métrica, temática (*Uso de versos de arte menor y tono elegíaco*).\n    4. **Clasificación o etapas / Ejemplos representativos:** Autores clave o subdivisiones (*Mariano Melgar como máximo exponente*).\n    5. **Caso particular, aplicación actual o proyección futura:** Detalle singular o vigencia (*Análisis del yaraví 'Vuelve que ya no puedo'*).",
                conceptosClave = listOf(
                    "Plan de redacción: Ordenamiento secuencial de ideas para maximizar la coherencia",
                    "Criterio deductivo: Desplazamiento analítico desde el marco general al caso particular",
                    "Prioridad de la definición: La conceptualización siempre antecede a las características",
                    "Posición de los ejemplos: Las aplicaciones o casos concretos van siempre al cierre"
                ),
                formulas = listOf(
                    "\\text{Secuencia Deductiva} = \\text{Marco General} \\to \\text{Definición} \\to \\text{Características} \\to \\text{Ejemplos}",
                    "\\text{Regla}: \\; \\text{Etimología / Concepto} \\prec \\text{Propiedades} \\prec \\text{Casos Particulares}"
                ),
                formulaName = "Esquema Deductivo Canónico",
                formulaLatex = "\\text{Orden} = [\\text{General}] \\prec [\\text{Definición}] \\prec [\\text{Rasgos}] \\prec [\\text{Subclases}] \\prec [\\text{Ejemplo}]",
                formulaDescription = "Algoritmo de precedencia temática deductiva en textos expositivos.",
                admissionTip = "Busca siempre el enunciado que defina el concepto central (suele empezar con 'Es un...', 'Se define como...', 'Consiste en...'). Ese enunciado debe ir inmediatamente después de la introducción general y antes de cualquier característica.",
                admissionExplanation = "• Los ejemplos y anécdotas particulares son invariablemente los últimos eslabones del texto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Ordene lógicamente los enunciados para estructurar un texto coherente: \n«EL SISTEMA SOLAR» \nI. La Tierra es el tercer planeta del sistema y el único con vida confirmada. \nII. El Universo está compuesto por billones de galaxias de diversas formas. \nIII. Nuestro sistema planetario está dominado gravitacionalmente por el Sol. \nIV. La Vía Láctea alberga en uno de sus brazos espirales al Sistema Solar.",
                    options = listOf(
                        "II – IV – III – I",
                        "IV – II – III – I",
                        "II – III – IV – I",
                        "III – I – IV – II",
                        "IV – III – I – II"
                    ),
                    correctIndex = 0,
                    explanation = "Siguiendo el criterio deductivo de lo más amplio a lo particular: se parte del Universo entero (II), se desciende a la galaxia Vía Láctea (IV), luego se entra al Sistema Solar y su estrella central (III) y se concluye con el planeta Tierra (I). Orden: II – IV – III – I.",
                    subject = "Raz. Verbal",
                    semana = 8
                ),
                Challenge(
                    id = "q_rv_t08_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un plan de redacción sobre «LA FOTOSÍNTESIS», ¿qué enunciado debe situarse primero?",
                    options = listOf(
                        "Fase luminosa y fijación de energía solar.",
                        "Reacciones bioquímicas en el ciclo de Calvin.",
                        "Proceso biológico por el cual las plantas convierten energía lumínica en glucosa.",
                        "Importancia de la fotosíntesis para la generación de oxígeno en la atmósfera terrestre.",
                        "Evolución de los cloroplastos en las algas primordiales."
                    ),
                    correctIndex = 2,
                    explanation = "Siguiendo el criterio deductivo estricto, la definición conceptual esencial del fenómeno ('Proceso biológico por el cual las plantas...') debe preceder a las fases técnicas, importancia o evolución.",
                    subject = "Raz. Verbal",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "rv_t08_s02",
            subjectId = "raz_verbal",
            semana = 8,
            subtema = "8.2 Plan de Redacción: Criterio Cronológico y Proceso Causal",
            title = "Plan de Redacción Cronológico y Secuencia Causal",
            theory = LessonTheory(
                id = "th_rv_t08_s02",
                asignatura = "Raz. Verbal",
                semana = 8,
                titulo = "Plan de Redacción Cronológico y Causal",
                resumen = "• Criterio Cronológico o Histórico:\n  - Aplica en biografías de personajes célebres, narración de guerras, evolución de civilizaciones o desarrollo de descubrimientos científicos.\n  - Secuencia Temporal Universal:\n    1. **Antecedentes, contexto histórico o nacimiento:** Época previa y nacimiento del protagonista (*Arequipa a finales del siglo XVIII*).\n    2. **Formación académica y primeros trabajos:** Infancia, estudios tempranos, primeras inquietudes (*Estudios en el Seminario San Jerónimo*).\n    3. **Madurez creativa y aportes cumbres:** Obra maestra, batallas decisivas o leyes promulgadas (*Composición de los célebres yaravíes y marcha libertadora*).\n    4. **Desenlace, fallecimiento o caída:** Muerte, juicio o fusilamiento (*Fusilamiento en Umachiri en 1815*).\n    5. **Trascendencia póstuma o legado histórico:** Homenajes, influencia en generaciones futuras (*Declarado prócer y precursor del romanticismo*).\n\n• Criterio Causal o de Proceso Metodológico:\n  - Aplica en protocolos de laboratorio, recetas, desastres naturales o resolución de crisis:\n    $$\\text{Causa Originaria} \\to \\text{Desarrollo del Fenómeno} \\to \\text{Efecto o Consecuencia} \\to \\text{Solución o Reparación}$$",
                conceptosClave = listOf(
                    "Criterio cronológico: Ordenamiento riguroso sobre la línea de tiempo histórico",
                    "Estructura biográfica: Nacimiento -> Formación -> Obra cumbre -> Muerte -> Trascendencia",
                    "Criterio causal: Precedencia inquebrantable de la causa sobre el efecto y la solución",
                    "Marcadores temporales guía: Fechas, años y conectores de tiempo (luego, finalmente)"
                ),
                formulas = listOf(
                    "\\text{Línea de Tiempo}: \\; t_0 (\\text{Nacimiento}) < t_1 (\\text{Juventud}) < t_2 (\\text{Obra}) < t_3 (\\text{Muerte}) < t_4 (\\text{Legado})",
                    "\\text{Cadena Causal}: \\; \\text{Problema} \\to \\text{Investigación} \\to \\text{Descubrimiento} \\to \\text{Aplicación}"
                ),
                formulaName = "Secuenciación Temporal y Causal",
                formulaLatex = "E_i \\prec E_j \\iff t(E_i) < t(E_j) \\quad \\lor \\quad E_i \\xrightarrow{\\text{causa}} E_j",
                formulaDescription = "Ordenamiento cronológico y teleológico en textos narrativos e históricos.",
                admissionTip = "En textos biográficos, fíjate siempre en la trascendencia póstuma (homenajes, monumentos, vigencia de su pensamiento): ¡siempre va al final de todo, después del fallecimiento!",
                admissionExplanation = "• No te dejes guiar únicamente por los números de los años; verifica que el relato no pegue saltos incoherentes en la trama."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Ordene cronológicamente los enunciados biográficos sobre MARIANO MELGAR: \nI. Se une con entusiasmo al ejército rebelde de Mateo Pumacahua. \nII. Nace en la ciudad de Arequipa en 1790 en el seno de una familia tradicional. \nIII. Tras la derrota patriota en Umachiri, es fusilado con solo 24 años. \nIV. Sus yaravíes son reconocidos hoy como el origen lírico de la peruanidad. \nV. Ingresa al Seminario San Jerónimo, donde destaca como joven docente.",
                    options = listOf(
                        "II – V – I – III – IV",
                        "II – I – V – III – IV",
                        "V – II – I – III – IV",
                        "II – V – III – I – IV",
                        "V – I – III – II – IV"
                    ),
                    correctIndex = 0,
                    explanation = "Secuencia temporal biográfica estricta: Nacimiento en 1790 (II) -> Juventud y docencia en el seminario (V) -> Adhesión a la revolución patriota (I) -> Captura y fusilamiento en Umachiri (III) -> Trascendencia y homenaje póstumo en el presente (IV). Orden: II – V – I – III – IV.",
                    subject = "Raz. Verbal",
                    semana = 8
                ),
                Challenge(
                    id = "q_rv_t08_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un texto sobre «EL PROCESO DE FABRICACIÓN DEL VIDRIO», ¿cuál debe ser la última fase de la secuencia?",
                    options = listOf(
                        "Mezcla de arena de sílice con carbonato de sodio.",
                        "Fusión de los reactivos en hornos a 1500 grados Celsius.",
                        "Modelado de la masa vítrea en moldes industriales.",
                        "Enfriamiento controlado y distribución comercial del producto terminado.",
                        "Extracción de minerales en yacimientos a cielo abierto."
                    ),
                    correctIndex = 3,
                    explanation = "El enfriamiento controlado y distribución comercial representa el cierre definitivo del proceso industrial de manufactura antes de llegar al consumidor.",
                    subject = "Raz. Verbal",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "rv_t08_s03",
            subjectId = "raz_verbal",
            semana = 8,
            subtema = "8.3 Eliminación de Oraciones por Criterio de Inatingencia (Impertinencia)",
            title = "Eliminación de Oraciones: Criterio de Inatingencia",
            theory = LessonTheory(
                id = "th_rv_t08_s03",
                asignatura = "Raz. Verbal",
                semana = 8,
                titulo = "Eliminación de Oraciones por Inatingencia",
                resumen = "• El Ejercicio de Eliminación de Oraciones (Supresión de Enunciados):\n  - Consiste en identificar y suprimir de un texto de cinco oraciones aquella que quiebra la coherencia global o la economía expresiva del párrafo.\n\n• Criterio 1: Inatingencia o Impertinencia Temática:\n  - Se elimina la oración que **se aparta del eje temático central** del texto, introduciendo un tema ajeno, una digresión impertinente o un enfoque desenfocado.\n  - Modalidades de Inatingencia:\n    1. **Inatingencia Radical o Directa:** La oración trata de un tema totalmente ajeno y desvinculado (ej. el texto habla del sistema respiratorio humano y una oración habla de la respiración de las plantas acuáticas).\n    2. **Inatingencia por Énfasis o Perspectiva Distorsionante:** La oración menciona la misma palabra clave, pero cambia drásticamente el enfoque (ej. el texto aborda los aspectos históricos y militares de la Guerra del Pacífico y una oración detalla el precio de la libra de cobre en el mercado moderno).\n    3. **Inatingencia por Salto Temporal o Geográfico Injustificado:** Enfoque fuera de la delimitación contextual del párrafo.",
                conceptosClave = listOf(
                    "Eliminación de oraciones: Depuración de enunciados anómalos en un texto estructurado",
                    "Inatingencia temática: Ruptura del eje monográfico central por digresión impertinente",
                    "Distractor por palabra repetida: Oración que usa el mismo término pero con enfoque dispar",
                    "Determinación del título previo: Técnica para aislar el tema y detectar al intruso"
                ),
                formulas = listOf(
                    "\\text{Eje Temático} = \\bar{T} = \\bigcap_{i=1}^n \\text{Tema}(O_i)",
                    "\\text{Eliminación por Inatingencia} \\iff \\text{Tema}(O_k) \\cap \\bar{T} = \\emptyset \\quad (\\text{Se suprime } O_k)"
                ),
                formulaName = "Principio de Pertinencia Monográfica",
                formulaLatex = "O_{\\text{inatingente}} = \\arg\\min_{O_i} \\text{AfinidadSemántica}(O_i, \\bar{T})",
                formulaDescription = "Identificación matemática del enunciado con menor proyección sobre el tema central.",
                admissionTip = "Antes de eliminar una oración, ponle un título mental breve de 3 o 4 palabras a todo el párrafo. La oración que no encaje en ese título mental exacto es la que debes eliminar por inatingencia.",
                admissionExplanation = "• No te dejes engañar si una oración contiene el nombre del protagonista; si habla de su vida amorosa en un texto sobre su teoría física, es inatingente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Elimine la oración inatingente: \n«(I) El colibrí es una de las aves más pequeñas y veloces del planeta. (II) Sus alas pueden batir hasta ochenta veces por segundo, permitiéndole flotar en el aire. (III) Se alimenta principalmente del néctar floral gracias a su pico alargado. (IV) La deforestación indiscriminada en la Amazonía amenaza el hábitat de miles de especies animales. (V) Su metabolismo acelerado le exige consumir el doble de su peso corporal a diario».",
                    options = listOf(
                        "I",
                        "II",
                        "III",
                        "IV",
                        "V"
                    ),
                    correctIndex = 3,
                    explanation = "El eje temático del texto son las características biológicas, anatómicas y fisiológicas del colibrí (I, II, III y V). La oración (IV) habla de forma genérica sobre la deforestación de la Amazonía y otras especies, constituyendo una clara inatingencia temática.",
                    subject = "Raz. Verbal",
                    semana = 8
                ),
                Challenge(
                    id = "q_rv_t08_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el criterio para eliminar una oración que aborda el mismo tema general pero desde un ángulo totalmente discordante con el resto del texto?",
                    options = listOf(
                        "Redundancia simple",
                        "Inatingencia por desenfoque temático",
                        "Redundancia compuesta",
                        "Pleonasmo sintáctico",
                        "Ambigüedad léxica"
                    ),
                    correctIndex = 1,
                    explanation = "Se denomina 'inatingencia por desenfoque o perspectiva disonante' a la infracción que comete una oración que, aun mencionando el mismo sustantivo clave, enfoca un aspecto inconexo con el desarrollo del párrafo.",
                    subject = "Raz. Verbal",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "rv_t08_s04",
            subjectId = "raz_verbal",
            semana = 8,
            subtema = "8.4 Eliminación de Oraciones por Redundancia y Resolución de Paradojas",
            title = "Eliminación por Redundancia y Paradojas Lógicas",
            theory = LessonTheory(
                id = "th_rv_t08_s04",
                asignatura = "Raz. Verbal",
                semana = 8,
                titulo = "Eliminación por Redundancia y Paradojas Lógicas",
                resumen = "• Criterio 2: Eliminación por Redundancia:\n  - Se elimina la oración que **reitera información ya expresada** en otra u otras oraciones del texto, sin añadir ningún matiz nuevo de valor cognoscitivo.\n  - Modalidades de Redundancia:\n    1. **Redundancia Simple o Directa:** Dos oraciones dicen prácticamente lo mismo con sinónimos. Se elimina la que tenga menor riqueza léxica o menor nivel explicativo.\n    2. **Redundancia Compuesta o Implícita:** Una oración resume o combina información que ya fue detallada en dos oraciones precedentes; se elimina la oración redundante para preservar los detalles.\n    3. **Regla de Oro en Redundancia:** Entre dos oraciones que se solapan semánticamente, **SE ELIMINA LA MENOS PRECISA, LA MÁS BREVE O LA QUE NO APORTE DATOS TÉCNICOS**.\n\n• Resolución de Paradojas Semánticas en Textos Complejos:\n  - Una paradoja verbal es una contradicción aparente que encierra una verdad profunda (*«Si quieres la paz, prepárate para la guerra»*).\n  - Para resolver problemas de paradojas en admisión, se debe disolver la contradicción distinguiendo los dos planos semánticos involucrados (plano literal vs. plano metafórico/teleológico).",
                conceptosClave = listOf(
                    "Redundancia simple: Reiteración vacía de un enunciado mediante paráfrasis",
                    "Redundancia compuesta: Superposición que absorbe el contenido de varias oraciones",
                    "Criterio de desempate en redundancia: Se preserva la oración más completa y rigurosa",
                    "Resolución de paradojas: Desarticulación de contradicciones aparentes mediante planos discursivos"
                ),
                formulas = listOf(
                    "\\text{Redundancia}: \\; \\text{Info}(O_i) \\subseteq \\text{Info}(O_j) \\implies \\text{Eliminar } O_i \\quad (\\text{por menor exhaustividad})",
                    "\\text{Paradoja}: \\; A \\land \\neg A \\implies \\text{Separar en } \\text{Plano}_1(A) \\land \\text{Plano}_2(\\neg A)"
                ),
                formulaName = "Filtro de No Redundancia Textual",
                formulaLatex = "O_{\\text{redundante}} = \\{O_k \\mid \\text{Info}(O_k) \\subseteq \\bigcup_{j \\neq k} \\text{Info}(O_j)\\}",
                formulaDescription = "Detección formal de enunciados informativamente subsumidos en el texto.",
                admissionTip = "Si encuentras dos oraciones casi idénticas en el texto, una de las dos es forzosamente la respuesta. Compara cuál de las dos tiene más detalles técnicos o mayor precisión; ¡elimina siempre la más pobre o genérica!",
                admissionExplanation = "• No confundas una síntesis legítima de conclusión con una redundancia viciosa; la redundancia solo repite sin aportar cierre dialéctico."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rv_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Elimine la oración por criterio de REDUNDANCIA: \n«(I) El sillar es una roca volcánica piroclástica de color blanco predominante en la arquitectura arequipeña. (II) Su nombre geológico formal es ignimbrita y proviene de antiguas erupciones de flujos piroclásticos. (III) Los monumentos coloniales de Arequipa fueron erigidos con sillar por su facilidad de tallado. (IV) Esta piedra volcánica blanca se extrae de las canteras de Añashuayco. (V) El sillar es una piedra de origen volcánico que abunda y se utiliza en las construcciones de Arequipa».",
                    options = listOf(
                        "I",
                        "II",
                        "III",
                        "IV",
                        "V"
                    ),
                    correctIndex = 4,
                    explanation = "La oración (V) repite de forma vaga y empobrecida lo que ya fue explicado con rigor científico e histórico en las oraciones (I), (II) y (III) (que es una roca volcánica, que abunda y que se utiliza en la arquitectura arequipeña). Por ende, se elimina la (V) por redundancia.",
                    subject = "Raz. Verbal",
                    semana = 8
                ),
                Challenge(
                    id = "q_rv_t08_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la conocida sentencia paradójica atribuida a Sócrates: «Solo sé que nada sé», ¿cómo se disuelve la contradicción lógica aparente?",
                    options = listOf(
                        "Demostrando que Sócrates no sabía hablar griego",
                        "Distinguiendo entre el saber factual enciclopédico total y la conciencia crítica de los propios límites cognoscitivos",
                        "Aceptando que la frase carece de todo valor racional",
                        "Afirmando que Sócrates se burlaba de sus discípulos",
                        "Asumiendo que el conocimiento es imposible para el ser humano"
                    ),
                    correctIndex = 1,
                    explanation = "La paradoja se resuelve al separar dos planos semánticos: Sócrates ignora la totalidad de los misterios de la realidad empírica (nada sé), pero posee un conocimiento filosófico superior y genuino: la lucidez y autoconciencia de su propia ignorancia (solo sé).",
                    subject = "Raz. Verbal",
                    semana = 8
                )
            )
        )
    )
}
