package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object RazLogicoCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: PROPOSICIONES Y ENUNCIADOS LÓGICOS (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "rl_t01_s01",
            subjectId = "raz_logico",
            semana = 1,
            subtema = "1.1 Concepto de Enunciado, Proposición Lógica y Criterios de Bivalencia",
            title = "Enunciados y Proposiciones Lógicas Bivalentes",
            theory = LessonTheory(
                id = "th_rl_t01_s01",
                asignatura = "Raz. Lógico",
                semana = 1,
                titulo = "Naturaleza de la Proposición Lógica",
                resumen = "• Enunciado vs. Proposición Lógica:\n  - Enunciado: Toda frase, oración o expresión formulada mediante el lenguaje natural o formal.\n  - Proposición Lógica: Enunciado aseverativo (declarativo) con significado pleno, susceptible de ser calificado inequívocamente como VERDADERO (V) o FALSO (F), pero nunca ambos simultáneamente.\n\n• Principios Lógicos Clásicos Fundamentales:\n  1. **Principio de Bivalencia:** Toda proposición posee exactamente un valor de verdad dentro del conjunto {V, F}.\n  2. **Principio de Tercio Excluido:** No existe un tercer valor intermedio entre la verdad y la falsedad (p ∨ ~p ≡ V).\n  3. **Principio de No Contradicción:** Es imposible que una proposición sea verdadera y falsa al mismo tiempo bajo el mismo respecto (~(p ∧ ~p) ≡ V).\n\n• Verdad Fáctica vs. Verdad Formal:\n  - Verdad Fáctica: Correspondencia empírica con los hechos del mundo real (ej. 'Arequipa está al pie del volcán Misti' -> V).\n  - Verdad Formal: Validez lógica determinada por la estructura sintáctica de los operadores, independiente de la realidad empírica.",
                conceptosClave = listOf(
                    "Enunciado: Toda secuencia lingüística emitida",
                    "Proposición lógica: Enunciado aseverativo con valor bivalente objetivo (V o F)",
                    "Principio de bivalencia: V(p) ∈ {V, F}",
                    "Tercio excluido y no contradicción: Axiomas fundacionales aristotélicos"
                ),
                formulas = listOf(
                    "p \\lor \\neg p \\equiv V \\quad (\\text{Tercio Excluido})",
                    "\\neg(p \\land \\neg p) \\equiv V \\quad (\\text{No Contradicción})",
                    "V(p) \\in \\{V, F\\} \\land V(p) \\neq V(\\neg p)"
                ),
                formulaName = "Principio de Bivalencia y Consistencia",
                formulaLatex = "V(p) \\in \\{0, 1\\} \\iff p \\oplus \\neg p",
                formulaDescription = "Una proposición asume estrictamente un valor binario y su negación el opuesto.",
                admissionTip = "Para saber si una frase es proposición lógica en el examen UNSA, pregúntate: ¿Tiene sentido preguntarle a alguien si eso es '¿Verdadero o Falso?'. Si la respuesta tiene sentido objetivo, es proposición.",
                admissionExplanation = "• No te dejes confundir por afirmaciones falsas: 'El Sol gira alrededor de la Tierra' SÍ es proposición lógica (su valor es Falso)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el examen de admisión de la UNSA, se solicita discriminar cuál de los siguientes enunciados constituye formalmente una proposición lógica:",
                    options = listOf(
                        "¡Por favor, entrega tu cuadernillo de respuestas ahora mismo!",
                        "¿Cuál fue el puntaje de corte para Medicina en el proceso anterior?",
                        "El volcán Misti se ubica geográficamente en el departamento de Arequipa.",
                        "Ojalá obtenga una vacante en mi primera opción universitaria.",
                        "x² - 9 = 0"
                    ),
                    correctIndex = 2,
                    explanation = "La única expresión aseverativa e informativa cuyo valor de verdad es unívocamente verificable (Verdadero fáctico) es la ubicación geográfica del volcán Misti. Las demás son imperativa, interrogativa, desiderativa y un enunciado abierto con variable libre.",
                    subject = "Raz. Lógico",
                    semana = 1
                ),
                Challenge(
                    id = "q_rl_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El principio aristotélico que establece formalmente que 'una proposición es verdadera o es falsa, no admitiéndose una tercera posibilidad lógica intermedia' se denomina:",
                    options = listOf(
                        "Principio de razón suficiente.",
                        "Principio del tercio excluido (Tertium non datur).",
                        "Principio de identidad reflexiva.",
                        "Principio de no contradicción.",
                        "Principio de idempotencia molecular."
                    ),
                    correctIndex = 1,
                    explanation = "El principio del tercio excluido (tertium non datur) determina que entre la afirmación y la negación de una proposición no existe un estado de verdad intermedio o tercer valor.",
                    subject = "Raz. Lógico",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rl_t01_s02",
            subjectId = "raz_logico",
            semana = 1,
            subtema = "1.2 Enunciados No Proposicionales, Juicios de Valor y Paradojas Lógicas",
            title = "Enunciados No Proposicionales y Paradojas",
            theory = LessonTheory(
                id = "th_rl_t01_s02",
                asignatura = "Raz. Lógico",
                semana = 1,
                titulo = "Límites del Valor de Verdad: No Proposiciones",
                resumen = "• Tipología de Enunciados No Proposicionales:\n  Carecen de valor bivalente objetivo (no son ni V ni F):\n  1. **Interrogativos:** ¿Quién descubrió las Líneas de Nasca? (Buscan información, no la aseveran).\n  2. **Imperativos / Directivos:** '¡Silencio en la sala de examen!', 'No cruce la línea amarilla'. (Órdenes, mandatos, peticiones).\n  3. **Exclamativos / Expresivos:** '¡Qué día tan soleado!', '¡Ay de mí!' (Expresan emociones o estados afectivos).\n  4. **Desiderativos:** 'Quisiera viajar por el Cañón del Colca'. (Expresan anhelos o deseos).\n  5. **Dubitativos:** 'Quizá llueva mañana por la tarde'. (Indican incertidumbre).\n  6. **Juicios de Valor Estético o Subjetivo:** 'El adobo arequipeño es el plato más delicioso del planeta'. (Depende del gusto personal; incomprobable objetivamente).\n\n• Pseudoproposiciones y Disparates Lingüísticos:\n  - Construcciones gramaticales sin sentido semántico real: 'Los números primos sueñan con sonatas azules'.\n\n• Paradojas Lógicas Autorreferenciales:\n  - Enunciados que se contradicen a sí mismos al intentar asignarles un valor de verdad. Ej. La paradoja del mentiroso: *«Esta oración es falsa»*.\n  - Si asumimos que es Verdadera -> entonces es Falso lo que dice -> es Falsa.\n  - Si asumimos que es Falsa -> como afirma ser falsa -> es Verdadera.\n  - Conclusión: Colapsa el principio de bivalencia; es una paradoja indecidible, por tanto NO es proposición lógica.",
                conceptosClave = listOf(
                    "Enunciados imperativos y preguntas: Carentes de función informativa referencial",
                    "Juicios estéticos subjetivos: No verificables objetivamente",
                    "Pseudoproposiciones: Falta de consistencia categorial de significado",
                    "Paradoja autorreferencial: Bucle lógico contradictorio que destruye la bivalencia"
                ),
                formulas = listOf(
                    "\\text{Paradoja del Mentiroso}: p \\iff \\neg p \\quad (\\text{Inconsistente en lógica clásica})",
                    "\\text{Juicio Subjetivo} \\notin \\{V, F\\}"
                ),
                formulaName = "Criterio de Exclusión Proposicional",
                formulaLatex = "E_{\\text{no-prop}} = \\{x \\mid V(x) \\notin \\{V, F\\}\\}",
                formulaDescription = "Conjunto de enunciados que no satisfacen la bivalencia lógica estricta.",
                admissionTip = "Ojo con los refranes morales ('A quien madruga, Dios le ayuda'): la UNSA los califica como enunciados no proposicionales por carecer de rigor unívoco de verdad fáctica.",
                admissionExplanation = "• Las órdenes legales y los artículos de leyes formulados en tono prescriptivo ('Se prohíbe estacionar') son normas/directivas, no proposiciones descriptivas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Analice las siguientes expresiones:\nI. «El concierto de anoche fue sumamente conmovedor».\nII. «Prohibido usar celulares durante la prueba de admisión».\nIII. «Esta afirmación que estoy leyendo es completamente falsa».\nIV. «El litio es el metal con menor densidad de la tabla periódica».\n¿Cuáles corresponden a enunciados NO proposicionales?",
                    options = listOf(
                        "Solo IV",
                        "I, II y III",
                        "Solo II y III",
                        "I y II",
                        "I, II, III y IV"
                    ),
                    correctIndex = 1,
                    explanation = "I es un juicio de valor subjetivo estético; II es un mandato imperativo normativo; III es la clásica paradoja autorreferencial del mentiroso (indecidible). Solo IV es una proposición lógica verificable en física/química.",
                    subject = "Raz. Lógico",
                    semana = 1
                ),
                Challenge(
                    id = "q_rl_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La expresión «Esta proposición es falsa» no puede considerarse una proposición lógica en el sistema aristotélico estándar porque:",
                    options = listOf(
                        "Carece de verbo principal conjugado.",
                        "Es una oración interrogativa encubierta.",
                        "Genera una paradoja autorreferencial que viola el principio de no contradicción y bivalencia.",
                        "Pertenece a un idioma extranjero no traducible.",
                        "Es un enunciado abierto con dos variables libres."
                    ),
                    correctIndex = 2,
                    explanation = "Al ser autorreferencial, si se asume verdadera resulta falsa, y si se asume falsa resulta verdadera, entrando en una contradicción insoluble que impide asignarle un valor de verdad definido.",
                    subject = "Raz. Lógico",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rl_t01_s03",
            subjectId = "raz_logico",
            semana = 1,
            subtema = "1.3 Enunciados Abiertos, Variables y Funciones Proposicionales",
            title = "Enunciados Abiertos y Cuantificación",
            theory = LessonTheory(
                id = "th_rl_t01_s03",
                asignatura = "Raz. Lógico",
                semana = 1,
                titulo = "Funciones Proposicionales y Variables Libres",
                resumen = "• Enunciado Abierto (Función Proposicional P(x)):\n  - Es una expresión que contiene una o más variables libres dentro de un conjunto o dominio de referencia.\n  - Mientras la variable permanezca libre, la expresión NO es ni V ni F (no es proposición lógica).\n  - Ejemplos:\n    * 'x + 7 = 15' (Abierto en x)\n    * 'Él fue rector ilustre de la UNSA' (Abierto en el pronombre 'Él')\n    * 'x es un número primo y menor que 10'\n\n• Métodos para Convertir un Enunciado Abierto en Proposición:\n  1. **Asignación de una Constante (Especialización):**\n     - Si en 'x + 7 = 15' sustituimos x = 8 -> '8 + 7 = 15' (Proposición Verdadera).\n     - Si sustituimos x = 3 -> '3 + 7 = 15' (Proposición Falsa).\n  2. **Cuantificación Lógica:**\n     - Cuantificador Universal (∀x): «Para todo x...»\n       * '∀x ∈ ℝ, x² ≥ 0' (Proposición Verdadera).\n     - Cuantificador Existencial (∃x): «Existe al menos un x...»\n       * '∃x ∈ ℕ, x - 5 = 10' (Proposición Verdadera, x=15).\n\n• Dominio de la Variable y Conjunto Solución:\n  - El valor de verdad tras la cuantificación depende críticamente del universo de discurso U considerado.",
                conceptosClave = listOf(
                    "Variable libre: Símbolo que puede ser sustituido por elementos del dominio",
                    "Enunciado abierto P(x): No posee valor de verdad hasta concretar x",
                    "Cuantificador universal (∀): Asevera la propiedad para la totalidad del universo",
                    "Cuantificador existencial (∃): Asevera la existencia de al menos un caso conforme"
                ),
                formulas = listOf(
                    "P(x) \\xrightarrow{x = c} P(c) \\in \\{V, F\\}",
                    "\\forall x \\in U, P(x) \\iff P(x_1) \\land P(x_2) \\land \\dots \\land P(x_n)",
                    "\\exists x \\in U, P(x) \\iff P(x_1) \\lor P(x_2) \\lor \\dots \\lor P(x_n)"
                ),
                formulaName = "Conversión de Enunciado Abierto a Proposición",
                formulaLatex = "P(x) \\notin \\text{Prop}, \\quad [\\forall x P(x)] \\in \\text{Prop}, \\quad P(a) \\in \\text{Prop}",
                formulaDescription = "Un enunciado abierto se transforma en proposición al ligar sus variables o instanciarlas.",
                admissionTip = "Los pronombres personales indeterminados ('Él fue militar', 'Ella descubrió la vacuna') son considerados enunciados abiertos en los exámenes tipo UNSA.",
                admissionExplanation = "• Cuando veas letras como x, y, z en ecuaciones o inecuaciones sin cuantificador, márcalas inmediatamente como enunciados abiertos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Considere el enunciado: «2x - 5 > 11, donde x pertenece a los números enteros». ¿Cuál es la naturaleza lógica de esta expresión y qué ocurre si se le asigna el valor x = 6?",
                    options = listOf(
                        "Es una proposición lógica siempre falsa, independientemente de x.",
                        "Es un enunciado abierto; al sustituir x = 6 se convierte en una proposición lógica con valor Falso.",
                        "Es una tautología formal universal.",
                        "Es un enunciado abierto; al sustituir x = 6 se convierte en una proposición lógica con valor Verdadero.",
                        "Es un enunciado no proposicional imperativo."
                    ),
                    correctIndex = 1,
                    explanation = "Mientras la variable x no esté fija, es un enunciado abierto. Si evaluamos en x = 6: 2(6) - 5 = 12 - 5 = 7. La desigualdad 7 > 11 es numéricamente Falsa. Por ende, se transforma en una proposición con valor Falso.",
                    subject = "Raz. Lógico",
                    semana = 1
                ),
                Challenge(
                    id = "q_rl_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes operaciones transforma de manera concluyente un enunciado abierto P(x) en una proposición lógica con valor de verdad definido?",
                    options = listOf(
                        "Cambiar la tipografía de la variable a mayúsculas.",
                        "Multiplicar la expresión por cero en ambos miembros.",
                        "Anteponer un cuantificador lógico universal (∀) o existencial (∃) sobre el dominio de la variable.",
                        "Encerrar la expresión entre signos de exclamación.",
                        "Convertir la variable en una incógnita de matriz."
                    ),
                    correctIndex = 2,
                    explanation = "Ligar la variable libre mediante cuantificadores lógicos (∀ o ∃) o sustituirla por una constante específica del universo transforma formalmente la función proposicional en una proposición lógica bivalente.",
                    subject = "Raz. Lógico",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "rl_t01_s04",
            subjectId = "raz_logico",
            semana = 1,
            subtema = "1.4 Proposiciones Simples (Predicativas y Relacionales) vs. Compuestas (Moleculares)",
            title = "Clasificación Estructural de Proposiciones",
            theory = LessonTheory(
                id = "th_rl_t01_s04",
                asignatura = "Raz. Lógico",
                semana = 1,
                titulo = "Estructura Anatómica: Atómicas vs. Moleculares",
                resumen = "• Proposiciones Simples (Atómicas o Elementales):\n  - No contienen conectores lógicos ni el adverbio 'no'. Constan de un solo predicado o relación indisoluble.\n  - Tipos:\n    1. **Predicativas:** Atribuyen una cualidad o propiedad a un único sujeto.\n       * 'El cobre es un buen conductor de la electricidad'.\n       * 'El volcán Sabancaya se encuentra en actividad fumarólica'.\n    2. **Relacionales:** Establecen un nexo de comparación, ubicación espacial, jerarquía o parentesco entre dos o más entes. NO se pueden descomponer en oraciones independientes sin perder el sentido original.\n       * 'Arequipa está al sur de Lima'.\n       * '8 es menor que 14' (8 < 14).\n       * 'Carlos y Diana son primos hermanos consanguíneos'.\n\n• Proposiciones Compuestas (Moleculares o Coligativas):\n  - Resultan de la articulación de dos o más proposiciones atómicas mediante conectores lógicos, o de la negación de una proposición simple.\n  - Clasificación Canónica:\n    * **Conjuntivas (p ∧ q):** Unión simultánea ('y', 'pero', 'sin embargo', 'además').\n    * **Disyuntivas Inclusivas (p ∨ q):** Al menos una ('o').\n    * **Disyuntivas Exclusivas (p ⊕ q):** Una y solo una ('o bien... o bien...').\n    * **Condicionales (p -> q):** Vínculo causal antecedente-consecuente ('si... entonces').\n    * **Bicondicionales (p <-> q):** Doble implicación ('si y solo si').\n    * **Negativas (~p):** Contienen negación ('No es cierto que...', 'es falso que...').",
                conceptosClave = listOf(
                    "Proposición atómica predicativa: Sujeto + propiedad unívoca",
                    "Proposición atómica relacional: Vínculo indisoluble entre varios entes",
                    "Trampa de la conjunción gramatical 'y': No toda 'y' crea proposición molecular",
                    "Proposición molecular: Articulación mediante conectores veritativo-funcionales"
                ),
                formulas = listOf(
                    "\\text{Atómica Predicativa}: P(a)",
                    "\\text{Atómica Relacional}: R(a, b) \\not\\equiv P_1(a) \\land P_2(b)",
                    "\\text{Molecular}: \\Phi(p_1, p_2, \\dots, p_n; \\land, \\lor, \\to, \\leftrightarrow, \\neg)"
                ),
                formulaName = "Criterio de Descomponibilidad",
                formulaLatex = "P_{\\text{atómica}} \\implies \\text{Infragmentable}, \\quad P_{\\text{molecular}} \\implies \\bigvee / \\bigwedge P_i",
                formulaDescription = "Una proposición atómica carece de conectores veritativo-funcionales internos.",
                admissionTip = "¡Cuidado con la trampa típica de la UNSA! 'Pedro y María son hermanos' es ATÓMICA RELACIONAL (no puedes decir 'Pedro es hermano' y 'María es hermana'). En cambio, 'Pedro y María bailan marinera' es MOLECULAR CONJUNTIVA (Pedro baila marinera y María baila marinera).",
                admissionExplanation = "• Si el nexo 'y' une dos sujetos pero la relación exige necesariamente a ambos juntos (ej. 'son gemelos', 'son socios', 'jugaron ajedrez'), la proposición es simple relacional."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la proposición que clasifica formalmente como SIMPLE RELACIONAL (atómica):",
                    options = listOf(
                        "Gonzalo postula a Ingeniería Civil y Andrea a Medicina Humana.",
                        "Si el agua hierve a 100 °C, entonces se evapora rápidamente.",
                        "El Lago Titicaca está ubicado entre Perú y Bolivia.",
                        "El hierro es un metal ferromagnético o un semiconductor.",
                        "No es cierto que la fotosíntesis sea un proceso puramente nocturno."
                    ),
                    correctIndex = 2,
                    explanation = "«El Lago Titicaca está ubicado entre Perú y Bolivia» expresa una relación espacial geográfica binaria indisoluble que no se puede desmembrar en dos proposiciones independientes sin perder sentido. Las demás contienen conectores (y, si...entonces, o, no es cierto que).",
                    subject = "Raz. Lógico",
                    semana = 1
                ),
                Challenge(
                    id = "q_rl_t01_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La expresión «Víctor y Mateo son colegas de trabajo en la UNSA» corresponde a una proposición de tipo:",
                    options = listOf(
                        "Molecular conjuntiva, porque posee el conector 'y'.",
                        "Atómica predicativa doble con predicado compartido.",
                        "Atómica relacional, ya que la relación de 'ser colegas' vincula recíprocamente a ambos sujetos de modo indivisible.",
                        "Molecular condicional directa.",
                        "Enunciado abierto con dos sujetos libres."
                    ),
                    correctIndex = 2,
                    explanation = "Ser 'colegas' es una relación recíproca entre dos individuos. No tiene sentido lógico dividir la frase en 'Víctor es colega' y 'Mateo es colega' por separado; por ello es atómica relacional.",
                    subject = "Raz. Lógico",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: CONECTORES LÓGICOS Y TABLAS DE VERDAD (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "rl_t02_s01",
            subjectId = "raz_logico",
            semana = 2,
            subtema = "2.1 La Negación, la Conjunción y la Disyunción Débil (Inclusiva)",
            title = "Operadores Lógicos Básicos: ~, ∧, ∨",
            theory = LessonTheory(
                id = "th_rl_t02_s01",
                asignatura = "Raz. Lógico",
                semana = 2,
                titulo = "Operadores Fundamentales de la Lógica Proposicional",
                resumen = "• Conector Monádico: Negación (~, ¬):\n  - Afecta a una sola variable o esquema molecular agrupado.\n  - Tabla de Verdad: Invierte el valor veritativo (~V = F; ~F = V).\n  - Giros lingüísticos: 'no', 'jamás', 'nunca', 'es falso que', 'carece de veracidad que'.\n\n• Conector Diádico: Conjunción (∧):\n  - Une dos proposiciones exigiendo su verdad simultánea.\n  - Regla de Oro: Es VERDADERA ÚNICAMENTE cuando AMBAS componentes son verdaderas (V ∧ V = V). En los demás tres casos es Falsa.\n  - Giros lingüísticos: 'y', 'e', 'pero', 'sin embargo', 'no obstante', 'aunque', 'además', 'a la vez que', signos de puntuación como comas o punto y coma copulativos.\n\n• Conector Diádico: Disyunción Débil o Inclusiva (∨):\n  - Admite la posibilidad de que una, la otra o ambas proposiciones se cumplan.\n  - Regla de Oro: Es FALSA ÚNICAMENTE cuando AMBAS componentes son falsas (F ∨ F = F). En los demás tres casos es Verdadera.\n  - Giros lingüísticos: 'o', 'u', 'a menos que', 'salvo que'.",
                conceptosClave = listOf(
                    "Negación monádica: Inversor veritativo funcional",
                    "Conjunción veritativa: Intersección lógica (solo V con V)",
                    "Disyunción inclusiva: Unión lógica (solo F con F)",
                    "Traducción de 'pero' y 'sin embargo' como conjunciones canónicas (∧)"
                ),
                formulas = listOf(
                    "V(p \\land q) = V \\iff V(p) = V \\land V(q) = V",
                    "V(p \\lor q) = F \\iff V(p) = F \\land V(q) = F",
                    "V(\\neg p) = 1 - V(p) \\quad (\\text{Álgebra booleana})"
                ),
                formulaName = "Matrices Fundamentales de ~, ∧, ∨",
                formulaLatex = "p \\land q = \\min(V(p), V(q)), \\quad p \\lor q = \\max(V(p), V(q))",
                formulaDescription = "Modelado veritativo numérico en lógica de Boole de operadores básicos.",
                admissionTip = "En las preguntas de la UNSA, palabras como 'pero', 'mas', 'sin embargo', 'a pesar de que' se formalizan SIEMPRE como conjunción (∧), nunca como adversativas extrañas.",
                admissionExplanation = "• Cuando una negación precede a un conector de colección ('Es falso que estudies y no trabajes'), la negación afecta a todo el paréntesis: ~(p ∧ ~q)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Formalice el siguiente enunciado: «El postulante rindió el simulacro presencial, sin embargo no alcanzó el puntaje requerido salvo que presente un reclamo formal»:",
                    options = listOf(
                        "(p ∧ ~q) ∨ r",
                        "(p -> ~q) ∧ r",
                        "(p ∨ ~q) -> r",
                        "p ∧ (~q ∧ r)",
                        "~p ∨ (q ∧ r)"
                    ),
                    correctIndex = 0,
                    explanation = "'El postulante rindió...' es p. 'sin embargo' es ∧. 'no alcanzó...' es ~q. Por jerarquía de la coma: (p ∧ ~q). 'salvo que' es disyunción débil (∨). 'presente un reclamo' es r. Queda: (p ∧ ~q) ∨ r.",
                    subject = "Raz. Lógico",
                    semana = 2
                ),
                Challenge(
                    id = "q_rl_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si se conoce con certeza que la proposición molecular (p ∧ ~q) es VERDADERA, ¿cuáles son los valores de verdad respectivos de p y q?",
                    options = listOf(
                        "p = V, q = V",
                        "p = V, q = F",
                        "p = F, q = V",
                        "p = F, q = F",
                        "Indeterminado sin conocer el universo."
                    ),
                    correctIndex = 1,
                    explanation = "Para que una conjunción (A ∧ B) sea Verdadera, ambos miembros deben ser V. Así, p = V y ~q = V. Si ~q = V, entonces q = F. Por tanto, p = V y q = F.",
                    subject = "Raz. Lógico",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rl_t02_s02",
            subjectId = "raz_logico",
            semana = 2,
            subtema = "2.2 El Condicional Material (Directo e Inverso) y el Bicondicional",
            title = "Implicación y Equivalencia: ->, <->",
            theory = LessonTheory(
                id = "th_rl_t02_s02",
                asignatura = "Raz. Lógico",
                semana = 2,
                titulo = "El Condicional Material y la Doble Implicación",
                resumen = "• Condicional Material Directo (p -> q):\n  - Estructura: Antecedente (p) -> Consecuente (q).\n  - Regla de Oro: Es FALSO ÚNICAMENTE cuando el ANTECEDENTE es VERDADERO y el CONSECUENTE es FALSO (V -> F = F). En los tres casos restantes (V->V, F->V, F->F) es siempre VERDADERO.\n  - Giros directos: 'Si p, entonces q', 'p por lo tanto q', 'p en consecuencia q', 'p luego q', 'p implica q', 'p es condición suficiente para q'.\n\n• Condicional Inverso o Replicador (q <- p ó p <- q):\n  - El consecuente aparece al inicio de la frase gramatical y el antecedente después del conector.\n  - Giros inversos: 'p porque q' (q -> p), 'p ya que q' (q -> p), 'p puesto que q' (q -> p), 'p dado que q' (q -> p), 'p siempre que q' (q -> p).\n\n• Bicondicional o Doble Implicación (p <-> q):\n  - Expresa equivalencia lógica mutua entre dos afirmaciones.\n  - Regla de Oro: Es VERDADERO cuando AMBAS tienen el MISMO valor de verdad (V<->V = V; F<->F = V). Es Falso si tienen valores dispares (V<->F = F; F<->V = F).\n  - Giros: 'p si y solo si q', 'p es equivalente a q', 'p siempre y cuando q', 'p es condición necesaria y suficiente para q'.",
                conceptosClave = listOf(
                    "V -> F = F: La única combinación que invalida una promesa condicional",
                    "Ex falso quodlibet: De un antecedente falso se deriva válidamente cualquier consecuencia",
                    "Condicional inverso: Identificación del nexo 'porque' como indicador de antecedente posterior",
                    "Bicondicional: Identidad veritativa simultánea (p <-> q ≡ (p -> q) ∧ (q -> p))"
                ),
                formulas = listOf(
                    "p \\to q \\equiv \\neg p \\lor q \\quad (\\text{Definición del Condicional})",
                    "p \\leftrightarrow q \\equiv (p \\to q) \\land (q \\to p)",
                    "p \\leftrightarrow q \\equiv (p \\land q) \\lor (\\neg p \\land \\neg q)",
                    "\\neg(p \\to q) \\equiv p \\land \\neg q"
                ),
                formulaName = "Ley de Implicación y Equivalencia Material",
                formulaLatex = "V(p \\to q) = 0 \\iff V(p) = 1 \\land V(q) = 0",
                formulaDescription = "Matriz booleana del condicional: Falso exclusivamente ante antecedente V y consecuente F.",
                admissionTip = "Cuando leas 'p porque q', no pongas p -> q. ¡El antecedente es q! Se formaliza q -> p. El término que sigue inmediatamente a 'porque', 'puesto que' o 'ya que' SIEMPRE es la causa (antecedente).",
                admissionExplanation = "• Negar un condicional ~(p -> q) equivale a 'p y no q' (p ∧ ~q). Te servirá para resolver preguntas de contradicción directa."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Determine el valor de verdad de las siguientes proposiciones condicionales:\nI. «Si 3 + 2 = 8, entonces Arequipa es una ciudad peruana».\nII. «Si la Luna es de queso, entonces 5 es un número par».\nIII. «Si el triángulo tiene tres lados, entonces la suma de sus ángulos internos en geometría euclidiana es 360°».",
                    options = listOf(
                        "V, V, F",
                        "F, F, V",
                        "V, F, F",
                        "F, V, F",
                        "V, V, V"
                    ),
                    correctIndex = 0,
                    explanation = "I: Antecedente F (3+2=8) -> Consecuente V. F -> V es VERDADERO.\nII: Antecedente F (Luna de queso) -> Consecuente F (5 es par). F -> F es VERDADERO.\nIII: Antecedente V (3 lados) -> Consecuente F (la suma es 180°, no 360°). V -> F es FALSO.\nResultados: V, V, F.",
                    subject = "Raz. Lógico",
                    semana = 2
                ),
                Challenge(
                    id = "q_rl_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Formalice rigurosamente el enunciado: «Ingresas a la universidad dado que estudiaste a conciencia; no obstante, no celebras si y solo si obtuviste un puntaje regular»:",
                    options = listOf(
                        "(p -> q) ∧ (~r <-> s)",
                        "(q -> p) ∧ (~r <-> s)",
                        "(q -> p) ∨ (~r -> s)",
                        "(p ∧ q) -> (~r <-> s)",
                        "~(q -> p) ∧ (r <-> ~s)"
                    ),
                    correctIndex = 1,
                    explanation = "«Ingresas a la universidad (p) dado que estudiaste a conciencia (q)» tiene conector causal inverso 'dado que', por lo que antecedente es q: (q -> p). 'no obstante' es ∧. 'no celebras (~r) si y solo si obtuviste puntaje regular (s)' es (~r <-> s). Unión total: (q -> p) ∧ (~r <-> s).",
                    subject = "Raz. Lógico",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rl_t02_s03",
            subjectId = "raz_logico",
            semana = 2,
            subtema = "2.3 Disyunción Fuerte (Exclusiva) y Operadores Especiales (Sheffer y Peirce)",
            title = "Disyunción Exclusiva y Operadores de Sheffer/Peirce",
            theory = LessonTheory(
                id = "th_rl_t02_s03",
                asignatura = "Raz. Lógico",
                semana = 2,
                titulo = "Exclusión Lógica y Puertas Universales",
                resumen = "• Disyunción Fuerte o Exclusiva (⊕, △):\n  - Exige que exactamente una de las dos alternativas se verifique, excluyendo la posibilidad de ambas simultáneas.\n  - Regla de Oro: Es VERDADERA cuando tienen valores de verdad DISTINTOS (V ⊕ F = V; F ⊕ V = V). Es FALSA si tienen el mismo valor (V ⊕ V = F; F ⊕ F = F).\n  - Giros lingüísticos: 'O bien p o bien q', 'o p o q (excluyente)', 'o solo p o solo q'.\n  - Relación con el bicondicional: Es su negación exacta: p ⊕ q ≡ ~(p <-> q).\n\n• Operadores Especiales Monádicos y Universales:\n  1. **Barra de Sheffer (Incompatibilidad o NAND, p | q):**\n     - Significa la negación conjunta de p y q: ~(p ∧ q).\n     - Es FALSA ÚNICAMENTE cuando ambas son verdaderas. En los demás casos es V.\n  2. **Flecha de Peirce (Inalternación o NOR, p ↓ q):**\n     - Significa la negación disyuntiva: ~(p ∨ q).\n     - Es VERDADERA ÚNICAMENTE cuando ambas proposiciones son falsas ('ni p ni q').\n\n• Importancia Computacional:\n  - NAND y NOR son compuertas universales: cualquier fórmula del cálculo proposicional puede escribirse únicamente empleando barras de Sheffer o flechas de Peirce.",
                conceptosClave = listOf(
                    "Disyunción exclusiva: Verdadera solo ante valores dispares",
                    "Relación de dualidad: p ⊕ q ≡ ~(p <-> q)",
                    "Barra de Sheffer (NAND): Negación de la conjunción (~(p ∧ q))",
                    "Flecha de Peirce (NOR): Negación de la disyunción ('ni p ni q', ~(p ∨ q))"
                ),
                formulas = listOf(
                    "p \\oplus q \\equiv (p \\lor q) \\land \\neg(p \\land q)",
                    "p \\oplus q \\equiv \\neg(p \\leftrightarrow q)",
                    "p \\mid q \\equiv \\neg(p \\land q) \\quad (\\text{Barra de Sheffer / NAND})",
                    "p \\downarrow q \\equiv \\neg(p \\lor q) \\equiv \\neg p \\land \\neg q \\quad (\\text{Flecha de Peirce / NOR})"
                ),
                formulaName = "Leyes de Exclusión y Operadores de Sheffer/Peirce",
                formulaLatex = "V(p \\oplus q) = V(p) + V(q) \\pmod 2",
                formulaDescription = "La disyunción exclusiva opera como suma módulo 2 en aritmética binaria.",
                admissionTip = "Si en un problema ves 'O viajo en tren o viajo en bus' pero es físicamente imposible viajar en ambos a la vez, se trata de una disyunción fuerte (⊕).",
                admissionExplanation = "• Recuerda la traducción de 'Ni estudia ni trabaja': se formaliza como ~p ∧ ~q, que equivale exactamente a la flecha de Peirce (p ↓ q)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si la proposición molecular (p ⊕ q) es FALSA, sabiendo además que p es una proposición VERDADERA, ¿cuál es necesariamente el valor de verdad de q?",
                    options = listOf(
                        "Falso",
                        "Verdadero",
                        "Contingente",
                        "Indecidible sin conocer p",
                        "Tautológico"
                    ),
                    correctIndex = 1,
                    explanation = "La disyunción fuerte (p ⊕ q) es Falsa únicamente cuando ambas componentes tienen el mismo valor de verdad. Si p = V, para que (V ⊕ q) sea Falso, obligatoriamente q debe ser Verdadero (V ⊕ V = F).",
                    subject = "Raz. Lógico",
                    semana = 2
                ),
                Challenge(
                    id = "q_rl_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La expresión «Ni el paciente presenta fiebre alta ni registra dificultades respiratorias» equivale lógicamente a:",
                    options = listOf(
                        "La barra de Sheffer entre ambas proposiciones: p | q.",
                        "La flecha de Peirce entre ambas proposiciones: p ↓ q.",
                        "Un condicional directo: p -> q.",
                        "Una disyunción exclusiva: p ⊕ q.",
                        "Una negación monádica aislada: ~(p ∧ ~q)."
                    ),
                    correctIndex = 1,
                    explanation = "«Ni p ni q» se formaliza como ~p ∧ ~q, que por las leyes de De Morgan equivale a ~(p ∨ q), conocida formalmente como la Flecha de Peirce o conector de inalternación (p ↓ q).",
                    subject = "Raz. Lógico",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "rl_t02_s04",
            subjectId = "raz_logico",
            semana = 2,
            subtema = "2.4 Construcción y Evaluación de Tablas de Verdad: Tautología, Contradicción y Contingencia",
            title = "Evaluación Tabular: Tautología, Contradicción y Contingencia",
            theory = LessonTheory(
                id = "th_rl_t02_s04",
                asignatura = "Raz. Lógico",
                semana = 2,
                titulo = "Cálculo Matricial y Clasificación de Esquemas Moleculares",
                resumen = "• Estructura de la Tabla de Verdad:\n  - Para 'n' variables proposicionales distintas, el número total de filas es N = 2^n.\n    * 1 variable (p): 2^1 = 2 filas (V, F).\n    * 2 variables (p, q): 2^2 = 4 filas (VV, VF, FV, FF).\n    * 3 variables (p, q, r): 2^3 = 8 filas.\n  - Pasos de Evaluación:\n    1. Asignar los valores iniciales estándar a las variables.\n    2. Evaluar los operadores de menor jerarquía (dentro de paréntesis).\n    3. Resolver los corchetes o conectores secundarios.\n    4. Obtener la Matriz Principal o Columna Central bajo el operador de mayor jerarquía.\n\n• Clasificación Epistemológica del Resultado:\n  1. **Tautología (Esquema Tautológico o Principio Lógico):**\n     - La columna matriz principal está compuesta EXCLUSIVAMENTE por valores VERDADEROS (todos V).\n     - Representa una verdad formal necesaria e incuestionable (ej. p ∨ ~p).\n  2. **Contradicción (Esquema Contradictorio o Absurdo):**\n     - La columna matriz principal está compuesta EXCLUSIVAMENTE por valores FALSOS (todos F).\n     - Representa una imposibilidad lógica formal (ej. p ∧ ~p).\n  3. **Contingencia o Consistencia (Esquema Sintético o Consistente):**\n     - La columna matriz principal contiene al menos un valor VERDADERO y al menos un valor FALSO (mezcla de V y F).\n     - Su verdad depende de la realidad empírica de sus componentes fácticos.",
                conceptosClave = listOf(
                    "Fórmula de filas: N = 2^n donde n es el número de proposiciones simples distintas",
                    "Jerarquía de operadores: Signos de colección y alcance lógico",
                    "Tautología: Verdad formal necesaria en todas las interpretaciones posibles",
                    "Contradicción: Falsedad universal; Contingencia: Valores veritativos mixtos"
                ),
                formulas = listOf(
                    "N_{\\text{filas}} = 2^n",
                    "\\text{Tautología} \\iff \\forall I, \\, V_I(\\Phi) = 1",
                    "\\text{Contradicción} \\iff \\forall I, \\, V_I(\\Phi) = 0",
                    "\\text{Contingencia} \\iff \\exists I_1, I_2 : V_{I_1}(\\Phi) = 1 \\land V_{I_2}(\\Phi) = 0"
                ),
                formulaName = "Clasificación Semántica de Fórmulas Proposicionales",
                formulaLatex = "\\Phi \\in \\{\\text{Tautología}, \\text{Contradicción}, \\text{Contingencia}\\}",
                formulaDescription = "Trisector semántico para cualquier fórmula lógica molecular finita.",
                admissionTip = "Si en un examen de admisión evalúas 4 filas y las primeras 3 te dan 'V' pero la cuarta te da 'F', ¡no sigas dudando!: es una CONTINGENCIA. No requiere que estén mitad y mitad.",
                admissionExplanation = "• Para demostrar que una fórmula NO es tautología, basta encontrar un contraejemplo veritativo (una sola asignación que la vuelva Falsa)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al evaluar mediante tabla de verdad la fórmula molecular [(p -> q) ∧ p] -> q, los valores de la matriz principal corresponden a:",
                    options = listOf(
                        "V, V, V, V (Tautología)",
                        "F, F, F, F (Contradicción)",
                        "V, F, V, F (Contingencia)",
                        "F, V, V, V (Contingencia)",
                        "V, V, F, F (Contingencia)"
                    ),
                    correctIndex = 0,
                    explanation = "La fórmula representa formalmente la ley del Modus Ponendo Ponens. Evaluando las 4 combinaciones posibles de p y q, el condicional principal siempre resulta Verdadero (V, V, V, V). Por tanto, es una Tautología estricta.",
                    subject = "Raz. Lógico",
                    semana = 2
                ),
                Challenge(
                    id = "q_rl_t02_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuántas filas tiene la tabla de verdad de un esquema molecular que contiene las variables proposicionales p, q, r y s, y qué nombre recibe la fórmula si en su matriz principal se obtiene al menos un valor falso y al menos un valor verdadero?",
                    options = listOf(
                        "8 filas; Contradicción.",
                        "16 filas; Contingencia.",
                        "16 filas; Tautología.",
                        "32 filas; Contingencia.",
                        "12 filas; Inconsistencia."
                    ),
                    correctIndex = 1,
                    explanation = "Con n = 4 variables, el número de filas es 2^4 = 16. Si la matriz principal contiene una combinación de valores verdaderos y falsos, clasifica formalmente como Contingente (o consistente).",
                    subject = "Raz. Lógico",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: RELACIONES LÓGICAS ENTRE PROPOSICIONES (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "rl_t03_s01",
            subjectId = "raz_logico",
            semana = 3,
            subtema = "3.1 Relaciones de Condición: Condición Suficiente vs. Condición Necesaria",
            title = "Condición Suficiente y Condición Necesaria",
            theory = LessonTheory(
                id = "th_rl_t03_s01",
                asignatura = "Raz. Lógico",
                semana = 3,
                titulo = "La Asimetría Lógica del Condicional",
                resumen = "• Condición Suficiente (A es suficiente para B):\n  - Si se cumple A, ello BASTA Y GARANTIZA de manera concluyente que se cumpla B.\n  - En la fórmula condicional: La condición suficiente es SIEMPRE EL ANTECEDENTE.\n  - Formalización: A -> B.\n  - Ejemplo: 'Haber nacido en Arequipa (A) es condición suficiente para ser peruano (B)'. (Nacer en Arequipa basta para ser peruano; pero no es el único camino).\n\n• Condición Necesaria (B es necesaria para A):\n  - B es un requisito indispensable sin el cual A JAMÁS puede ocurrir. Si no ocurre B, es imposible que ocurra A (~B -> ~A).\n  - En la fórmula condicional: La condición necesaria es SIEMPRE EL CONSECUENTE.\n  - Formalización: A -> B (o por transposición: ~B -> ~A).\n  - Ejemplo: 'Tener DNI (B) es condición necesaria para sufragar en el referéndum (A)'. (Sin DNI no votas; pero tener DNI no garantiza que efectivamente votes).\n\n• Condición Necesaria y Suficiente (Bicondicional A <-> B):\n  - Cuando A garantiza B y a la vez B es indispensable para A.\n  - Ejemplo: 'Un polígono es un cuadrilátero si y solo si tiene exactamente cuatro lados'.",
                conceptosClave = listOf(
                    "Condición suficiente = Antecedente (A -> B)",
                    "Condición necesaria = Consecuente (A -> B, equivalente a ~B -> ~A)",
                    "Regla mnemotécnica: Suficiente antecede, Necesaria sucede",
                    "Condición necesaria y suficiente: Equivalencia o bicondicional (A <-> B)"
                ),
                formulas = listOf(
                    "\\text{A es suficiente para B} \\implies A \\to B",
                    "\\text{B es necesario para A} \\implies A \\to B \\equiv \\neg B \\to \\neg A",
                    "\\text{A es necesaria y suficiente para B} \\implies A \\leftrightarrow B"
                ),
                formulaName = "Teorema de la Condición Lógica",
                formulaLatex = "(A \\implies B) \\iff (A \\text{ es Suficiente}) \\land (B \\text{ es Necesario})",
                formulaDescription = "El antecedente aporta suficiencia y el consecuente necesidad estricta.",
                admissionTip = "¡Pregunta fija de la UNSA! Regla de oro infalible: Lo 'suficiente' va a la izquierda de la flecha; lo 'necesario' va a la derecha de la flecha.",
                admissionExplanation = "• Si te dicen: 'Es necesario tener 18 años para votar', el formalismo es: Votar -> 18 años. (18 años es el consecuente)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un manual de postulación de la UNSA se lee: «Es requisito indispensable (necesario) haber concluido la educación secundaria para rendir el examen de admisión Ordinario». ¿Cómo se formaliza lógicamente este enunciado si p = 'Rendir el examen Ordinario' y q = 'Haber concluido la educación secundaria'?",
                    options = listOf(
                        "q -> p",
                        "p -> q",
                        "p ∧ q",
                        "~p -> q",
                        "p <-> q"
                    ),
                    correctIndex = 1,
                    explanation = "La condición necesaria (requisito indispensable) opera siempre como el CONSECUENTE de la implicación. Por lo tanto, rendir el examen (p) implica necesariamente haber concluido la secundaria (q): p -> q.",
                    subject = "Raz. Lógico",
                    semana = 3
                ),
                Challenge(
                    id = "q_rl_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si «Aprobar el examen con 100 puntos es suficiente para obtener el primer puesto de la carrera», se puede deducir válidamente que:",
                    options = listOf(
                        "Si alguien no aprobó con 100 puntos, no obtuvo el primer puesto.",
                        "Si alguien obtuvo el primer puesto, obligatoriamente sacó 100 puntos.",
                        "Si alguien no obtuvo el primer puesto, con certeza no sacó 100 puntos.",
                        "Obtener el primer puesto es condición suficiente para sacar 100 puntos.",
                        "No se puede deducir nada formalmente."
                    ),
                    correctIndex = 2,
                    explanation = "Tenemos p -> q (100 pts -> 1er puesto). Por ley de contraposición (transposición), p -> q equivale lógicamente a ~q -> ~p. Por tanto: «Si no obtuvo el primer puesto (~q), entonces no sacó 100 puntos (~p)».",
                    subject = "Raz. Lógico",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rl_t03_s02",
            subjectId = "raz_logico",
            semana = 3,
            subtema = "3.2 Relación de Causa-Efecto y Nexos Condicionales Directos e Inversos",
            title = "Causa-Efecto y Sentido del Nexo Condicional",
            theory = LessonTheory(
                id = "th_rl_t03_s02",
                asignatura = "Raz. Lógico",
                semana = 3,
                titulo = "Modelado Causal en Razonamiento Lógico",
                resumen = "• La Relación Causal en la Lógica Formal:\n  - La causa eficiente opera como antecedente de un condicional, y el efecto resultante como su consecuente.\n  - En el mundo físico, la causa precede o es simultánea al efecto; en lógica formal, la relación se abstrae como implicación material (Causa -> Efecto).\n\n• Clasificación de Conectores según la Dirección Causal:\n  1. **Conectores Directos (Causa -> Efecto):**\n     - La causa se anuncia primero y luego el conector introduce el efecto.\n     - Conectores: 'Por lo tanto', 'por consiguiente', 'en consecuencia', 'de ahí que', 'luego', 'por ende', 'de manera que'.\n     - Estructura: Causa, [conector directo] Efecto.\n  2. **Conectores Inversos (Efecto <- Causa):**\n     - El efecto se describe primero y el conector introduce la causa que lo originó.\n     - Conectores: 'Porque', 'ya que', 'puesto que', 'dado que', 'debido a que', 'en vista de que', 'pues'.\n     - Estructura: Efecto, [conector inverso] Causa.\n     - Formalización: ¡Debe invertirse el orden para mantener Causa -> Efecto!\n\n• Errores Comunes de Comprensión:\n  - Escribir la implicación tal como aparecen las palabras en español sin verificar la dirección causal real.",
                conceptosClave = listOf(
                    "Causa = Antecedente; Efecto = Consecuente",
                    "Conector directo: Causa -> Efecto ('por lo tanto', 'en consecuencia')",
                    "Conector inverso: Efecto <- Causa ('porque', 'ya que', 'puesto que')",
                    "Reordenamiento canónico: Identificar la causa real y colocarla a la izquierda"
                ),
                formulas = listOf(
                    "\\text{Causa} \\xrightarrow{\\text{conector directo}} \\text{Efecto} \\equiv C \\to E",
                    "\\text{Efecto} \\xleftarrow{\\text{conector inverso}} \\text{Causa} \\equiv C \\to E"
                ),
                formulaName = "Regla de Inversión Causal",
                formulaLatex = "(E \\text{ porque } C) \\iff (C \\implies E)",
                formulaDescription = "Transformación del lenguaje natural causal a la implicación formal estándar.",
                admissionTip = "Encuentra la causa preguntándote: '¿Qué ocurrió primero o qué produce a lo otro?'. La respuesta a esa pregunta SIEMPRE va en el antecedente (inicio de la flecha).",
                admissionExplanation = "• Ejemplo: 'Hubo huaicos en la carretera debido a las lluvias intensas'. Causa = Lluvias intensas (p); Efecto = Huaicos (q). Formalización: p -> q."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Formalice el siguiente texto respetando la relación causal estricta:\n«El precio de los pasajes urbanos se incrementará en Arequipa, puesto que el costo internacional del barril de petróleo subió drásticamente»:",
                    options = listOf(
                        "p -> q (donde p = incremento de pasajes)",
                        "q -> p (donde q = subida del costo del petróleo y p = incremento de pasajes)",
                        "p ∧ q",
                        "~p ∨ ~q",
                        "p <-> q"
                    ),
                    correctIndex = 1,
                    explanation = "'puesto que' es un conector causal inverso. La causa es la subida del petróleo (q), y el efecto resultante es el incremento de pasajes (p). La formalización correcta es Causa -> Efecto: q -> p.",
                    subject = "Raz. Lógico",
                    semana = 3
                ),
                Challenge(
                    id = "q_rl_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes proposiciones compuestas presenta un CONECTOR CONDICIONAL DIRECTO?",
                    options = listOf(
                        "Se suspendió el partido de fútbol debido a la torrencial lluvia.",
                        "Los estudiantes ingresaron a tiempo a las aulas ya que se abrieron temprano las puertas.",
                        "El metal fue calentado a temperaturas extremas; por consiguiente, experimentó dilatación térmica volumétrica.",
                        "No hubo energía eléctrica en el campus universitario pues colapsó el transformador.",
                        "La cosecha de cebollas disminuyó dado que se prolongó la sequía en Majes."
                    ),
                    correctIndex = 2,
                    explanation = "«Por consiguiente» es un conector de consecuencia o condicional directo: introduce directamente el efecto (la dilatación térmica) a partir de su causa (el calentamiento del metal). Los otros usan nexos inversos (debido a, ya que, pues, dado que).",
                    subject = "Raz. Lógico",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rl_t03_s03",
            subjectId = "raz_logico",
            semana = 3,
            subtema = "3.3 Equivalencia Lógica e Implicación Tautológica entre Proposiciones",
            title = "Equivalencia Lógica e Implicación Tautológica",
            theory = LessonTheory(
                id = "th_rl_t03_s03",
                asignatura = "Raz. Lógico",
                semana = 3,
                titulo = "Relaciones Metalógicas: Equivalencia (≡) e Implicación (⊨)",
                resumen = "• Equivalencia Lógica (A ≡ B ó A ⇔ B):\n  - Dos proposiciones A y B son lógicamente equivalentes si y solo si poseen IDÉNTICA tabla de verdad bajo cualquier asignación de valores.\n  - Criterio Veritativo: El bicondicional formado por ambas (A <-> B) es una TAUTOLOGÍA.\n  - Principales Leyes de Equivalencia (Álgebra Proposicional):\n    1. **Doble Negación (Involución):** ~~p ≡ p.\n    2. **Leyes de De Morgan:** ~(p ∧ q) ≡ ~p ∨ ~q; ~(p ∨ q) ≡ ~p ∧ ~q.\n    3. **Definición del Condicional:** p -> q ≡ ~p ∨ q.\n    4. **Contraposición (Transposición):** p -> q ≡ ~q -> ~p.\n    5. **Absorción:** p ∧ (p ∨ q) ≡ p; p ∨ (p ∧ q) ≡ p; p ∧ (~p ∨ q) ≡ p ∧ q.\n\n• Implicación Lógica o Tautológica (A ⊨ B):\n  - Se dice que A implica lógicamente a B si no existe ningún caso donde A sea verdadera y B sea falsa.\n  - Criterio Veritativo: El condicional material (A -> B) es una TAUTOLOGÍA.\n  - No es reversible: Si A ⊨ B, no necesariamente B ⊨ A.",
                conceptosClave = listOf(
                    "Equivalencia: Bicondicional tautológico (A ≡ B)",
                    "Implicación: Condicional tautológico (A ⊨ B)",
                    "Leyes de De Morgan: Distribución de negación con cambio de conectiva",
                    "Transposición: Inversión de términos con doble negación (~q -> ~p)"
                ),
                formulas = listOf(
                    "A \\equiv B \\iff (A \\leftrightarrow B) \\text{ es Tautología}",
                    "A \\models B \\iff (A \\to B) \\text{ es Tautología}",
                    "p \\to q \\equiv \\neg q \\to \\neg p \\quad (\\text{Transposición})",
                    "p \\land (p \\lor q) \\equiv p \\quad (\\text{Absorción})"
                ),
                formulaName = "Criterio Metalógico de Equivalencia e Implicación",
                formulaLatex = "(A \\equiv B) \\iff (A \\models B \\land B \\models A)",
                formulaDescription = "La equivalencia lógica es una relación de implicación bilateral recíproca.",
                admissionTip = "La ley más evaluada en la UNSA es la TRANSPOSICIÓN: 'Si estudias, ingresas' equivale exactamente a 'Si no ingresas, no estudiaste'.",
                admissionExplanation = "• Otra equivalencia reina: 'p -> q' equivale a '~p ∨ q'. Memorízala: niega el primero o pon el segundo tal cual."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes afirmaciones es lógicamente equivalente a «No es verdad que Manuel no participe en el debate o falte a la conferencia»?",
                    options = listOf(
                        "Manuel participa en el debate y no falta a la conferencia.",
                        "Manuel no participa en el debate o falta a la conferencia.",
                        "Manuel participa en el debate o no falta a la conferencia.",
                        "Manuel no participa en el debate y falta a la conferencia.",
                        "Si Manuel participa en el debate, entonces falta a la conferencia."
                    ),
                    correctIndex = 0,
                    explanation = "La expresión original es ~(~p ∨ q). Aplicando la ley de De Morgan: ~(~p) ∧ ~q. Por doble negación, esto se simplifica a: p ∧ ~q. En lenguaje ordinario: «Manuel participa en el debate y no falta a la conferencia».",
                    subject = "Raz. Lógico",
                    semana = 3
                ),
                Challenge(
                    id = "q_rl_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Aplicando la ley de transposición, el enunciado «Si no se controla la inflación monetaria, entonces disminuirá el poder adquisitivo de los salarios» equivale exactamente a:",
                    options = listOf(
                        "Si se controla la inflación monetaria, no disminuirá el poder adquisitivo.",
                        "Si no disminuye el poder adquisitivo de los salarios, entonces se controló la inflación monetaria.",
                        "Disminuye el poder adquisitivo porque no se controla la inflación.",
                        "O se controla la inflación monetaria o disminuye el poder adquisitivo.",
                        "No disminuye el poder adquisitivo y se controla la inflación."
                    ),
                    correctIndex = 1,
                    explanation = "La proposición es ~p -> q. Su contrapositiva transpuesta es ~q -> ~(~p), que por involución da ~q -> p: «Si no disminuye el poder adquisitivo (~q), entonces se controló la inflación monetaria (p)».",
                    subject = "Raz. Lógico",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "rl_t03_s04",
            subjectId = "raz_logico",
            semana = 3,
            subtema = "3.4 Oposición, Contradicción, Contrariedad e Incompatibilidad de Testimonios",
            title = "Oposición Lógica, Contradicción e Incompatibilidad",
            theory = LessonTheory(
                id = "th_rl_t03_s04",
                asignatura = "Raz. Lógico",
                semana = 3,
                titulo = "Relaciones de Oposición y Análisis Testimonial",
                resumen = "• Contradicción Estricta entre Proposiciones (A vs. B):\n  - Dos proposiciones son estrictamente contradictorias si SIEMPRE poseen valores de verdad opuestos en toda circunstancia posible.\n  - Si una es Verdadera, la otra es necesariamente Falsa; y viceversa.\n  - Regla: No pueden ser ambas verdaderas a la vez NI pueden ser ambas falsas a la vez.\n  - Ejemplo: p vs. ~p; o (p ∧ q) vs. (~p ∨ ~q).\n\n• Contrariedad (Incompatibilidad Parcial):\n  - Dos proposiciones son contrarias si NO PUEDEN ser ambas verdaderas a la vez, pero SÍ pueden ser ambas falsas simultáneamente.\n  - Ejemplo: 'El semáforo está en verde' vs. 'El semáforo está en rojo'. (No pueden ser ambas V; pero si el semáforo está en amarillo, ambas son F).\n\n• Subcontrariedad:\n  - Dos proposiciones pueden ser ambas verdaderas simultáneamente, pero NO pueden ser ambas falsas a la vez.\n\n• Incompatibilidad de Testimonios en Casos DECO/Judiciales:\n  - Cuando dos sospechosos emiten asertos contradictorios entre sí (ej. Juan: 'Pedro robó el examen'; Pedro: 'Yo no robé el examen'), se garantiza que exactamente UNO dice la verdad y el OTRO miente.\n  - Esta propiedad es la piedra angular para resolver acertijos lógicos sin construir tablas de 16 filas.",
                conceptosClave = listOf(
                    "Contradicción: Una es V y la otra F (nunca ambas V ni ambas F)",
                    "Contrariedad: No pueden ser ambas V, pero sí pueden ser ambas F",
                    "Subcontrariedad: Pueden ser ambas V, pero no ambas F",
                    "Par contradictorio testimonial: Garantiza 1 V y 1 F en acertijos de veracidad"
                ),
                formulas = listOf(
                    "\\text{Contradicción}: A \\land B \\equiv F \\quad \\land \\quad A \\lor B \\equiv V",
                    "\\text{Contrariedad}: A \\land B \\equiv F \\quad (A \\lor B \\text{ puede ser } F)",
                    "\\text{Subcontrariedad}: A \\lor B \\equiv V \\quad (A \\land B \\text{ puede ser } V)"
                ),
                formulaName = "Cuadro de Relaciones de Oposición",
                formulaLatex = "A \\text{ contradice a } B \\iff A \\equiv \\neg B",
                formulaDescription = "Dos proposiciones son contradictorias si y solo si una equivale a la negación de la otra.",
                admissionTip = "En problemas de 'Quién miente y quién dice la verdad': busca primero a dos personas cuyas declaraciones se contradigan. Sabrás al instante que entre ellas dos hay una verdad y una mentira.",
                admissionExplanation = "• No confundas 'contrario' con 'contradictorio': 'Todos los cusqueños son altos' y 'Ningún cusqueño es alto' son contrarias (ambas son falsas). La contradictoria de 'Todos son altos' es 'Alguno no es alto'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cuatro sospechosos de sustraer un examen en la UNSA declaran lo siguiente:\n- Carlos: «David fue quien sustrajo el examen».\n- David: «Lo que dice Carlos es una completa mentira».\n- Esteban: «Yo no sustraí el examen».\n- Fernando: «Carlos dice la verdad».\nSi se sabe que solo uno de ellos miente y los otros tres dicen la verdad, ¿quién sustrajo efectivamente el examen?",
                    options = listOf(
                        "David",
                        "Carlos",
                        "Esteban",
                        "Fernando",
                        "No se puede determinar."
                    ),
                    correctIndex = 0,
                    explanation = "Carlos y David sostienen afirmaciones estrictamente contradictorias (uno afirma que fue David y David lo niega). En un par contradictorio, uno dice la verdad y el otro miente obligatoriamente. Como el problema dice que SOLO UNO miente, la única mentira está entre Carlos o David. Por lo tanto, Esteban y Fernando dicen la verdad. Como Fernando dice la verdad y afirma que 'Carlos dice la verdad', entonces Carlos dice la verdad y quien miente es David. Por tanto, la afirmación verdadera de Carlos confirma que David sustrajo el examen.",
                    subject = "Raz. Lógico",
                    semana = 3
                ),
                Challenge(
                    id = "q_rl_t03_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dos proposiciones lógicas se denominan CONTRARIAS cuando satisfacen formalmente la siguiente condición veritativa:",
                    options = listOf(
                        "Pueden ser ambas verdaderas simultáneamente, pero nunca ambas falsas.",
                        "Tienen siempre valores de verdad idénticos en todas las líneas de su tabla de verdad.",
                        "No pueden ser ambas verdaderas a la vez, aunque sí pueden resultar ambas falsas.",
                        "Una es siempre la negación matemática de la otra.",
                        "Su conjunción resulta en una tautología."
                    ),
                    correctIndex = 2,
                    explanation = "Por definición del cuadro tradicional de oposición, la relación de contrariedad prohíbe que ambas proposiciones sean verdaderas al mismo tiempo, admitiendo que ambas puedan ser falsas.",
                    subject = "Raz. Lógico",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: INFERENCIAS LÓGICAS Y REGLAS DE INFERENCIA (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "rl_t04_s01",
            subjectId = "raz_logico",
            semana = 4,
            subtema = "4.1 Tipos de Inferencia: Deductiva (Necesaria) vs. Inductiva y Abductiva (Probables)",
            title = "Inferencia Deductiva, Inductiva y Abductiva",
            theory = LessonTheory(
                id = "th_rl_t04_s01",
                asignatura = "Raz. Lógico",
                semana = 4,
                titulo = "Epistemología de la Inferencia",
                resumen = "• Inferencia o Razonamiento:\n  - Proceso cognoscitivo mediante el cual se deriva y fundamenta una conclusión a partir de uno o más enunciados previos llamados premisas.\n\n• Taxonomía de las Inferencias:\n  1. **Inferencia Deductiva (Formal):**\n     - Va de lo general a lo particular o se fundamenta en la pura estructura lógica formal.\n     - La conclusión se desprende de manera FORZOSA, NECESARIA Y CONCLUYENTE de las premisas.\n     - Si las premisas son verdaderas y la estructura es válida, la conclusión ES INFALIBLEMENTE VERDADERA.\n     - No aporta información empírica nueva fuera de lo contenido implícitamente en las premisas.\n  2. **Inferencia Inductiva (Empírica):**\n     - Va de casos particulares observados hacia una generalización o ley universal probable.\n     - La conclusión es PROBABLE, verosímil o plausible, pero NUNCA formalmente necesaria ni definitiva.\n     - Ejemplo: 'El cuervo 1 es negro, el cuervo 2 es negro... por tanto, probablemente todos los cuervos son negros'.\n  3. **Inferencia Abductiva (Hipotética):**\n     - Parte de un hecho sorprendente o indicio y plantea la hipótesis explicativa causal más verosímil.",
                conceptosClave = listOf(
                    "Inferencia deductiva: Conclusión necesaria y forzosa",
                    "Inferencia inductiva: Conclusión probable sujeta a refutación empírica",
                    "Inferencia abductiva: Mejor explicación causal plausible a partir de indicios",
                    "Rigor deductivo: Criterio evaluado en los exámenes de admisión de razonamiento lógico"
                ),
                formulas = listOf(
                    "\\text{Deducción}: P_1, P_2, \\dots, P_n \\vdash C \\quad (\\text{Necesaria})",
                    "\\text{Inducción}: P(a_1) \\land P(a_2) \\land \\dots \\implies \\text{Probable}(\\forall x P(x))"
                ),
                formulaName = "Principio de Necesidad Deductiva",
                formulaLatex = "\\Gamma \\models C \\iff \\neg \\exists I : (V_I(\\Gamma) = 1 \\land V_I(C) = 0)",
                formulaDescription = "En una deducción válida, es imposible que las premisas sean verdaderas y la conclusión falsa.",
                admissionTip = "En la UNSA, si te preguntan '¿Qué se concluye válidamente?', descarta cualquier opción que contenga términos como 'probablemente', 'quizás' o que extrapole datos que las premisas no garantizan al 100%.",
                admissionExplanation = "• La deducción no amplía el conocimiento empírico del universo, pero explicita con rigor absoluto lo que estaba implícito en las premisas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique cuál de los siguientes razonamientos clasifica formalmente como una INFERENCIA DEDUCTIVA VÁLIDA:",
                    options = listOf(
                        "Observé que los cisnes en Europa son blancos; por lo tanto, en Australia todos los cisnes deben ser blancos.",
                        "Todos los mamíferos tienen respiración pulmonar. La ballena azul es un mamífero. Por consiguiente, la ballena azul tiene respiración pulmonar.",
                        "El pasto de la plaza está mojado hoy; por lo tanto, con seguridad llovió anoche en Arequipa.",
                        "El 80% de los estudiantes del colegio aprobó el simulacro; por ende, Juan, que estudia allí, aprobó el simulacro.",
                        "Siempre que me pongo esta casaca azul, mi equipo favorito gana; por lo tanto, la casaca atrae la victoria."
                    ),
                    correctIndex = 1,
                    explanation = "El silogismo de los mamíferos y la ballena azul transfiere necesariamente la propiedad universal a un elemento particular; la conclusión se desprende de forma forzosa e irrefutable de las premisas (Deducción). Las demás son inductivas, abductivas, probabilísticas o falacias de causa falsa.",
                    subject = "Raz. Lógico",
                    semana = 4
                ),
                Challenge(
                    id = "q_rl_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La diferencia fundamental entre una inferencia deductiva y una inferencia inductiva radica en que:",
                    options = listOf(
                        "La deductiva se basa en la intuición y la inductiva en reglas matemáticas.",
                        "En la deductiva la conclusión se sigue de manera necesaria de las premisas, mientras que en la inductiva la conclusión es solo probable.",
                        "La inductiva solo se aplica en ciencias formales como la geometría.",
                        "La deductiva parte siempre de un solo caso particular verificado.",
                        "La inductiva jamás comete errores empíricos."
                    ),
                    correctIndex = 1,
                    explanation = "La deducción garantiza la verdad necesaria de la conclusión si las premisas son verdaderas, mientras que la inducción confiere a la conclusión únicamente un grado de probabilidad o verosimilitud.",
                    subject = "Raz. Lógico",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rl_t04_s02",
            subjectId = "raz_logico",
            semana = 4,
            subtema = "4.2 Estructura del Razonamiento: Premisas, Conclusión y Validez vs. Verdad",
            title = "Validez Formal vs. Verdad Fáctica",
            theory = LessonTheory(
                id = "th_rl_t04_s02",
                asignatura = "Raz. Lógico",
                semana = 4,
                titulo = "La Gran Diferencia: Verdad y Validez",
                resumen = "• Estructura Canónica de una Inferencia:\n  - Premisas: Proposiciones iniciales que aportan razones, evidencias o puntos de partida lógicos.\n  - Conclusión: Proposición final que se afirma como resultado derivado de las premisas.\n  - Relación de Consecuencia Lógica: Nexo formal conectivo (por lo tanto, se concluye que).\n\n• Verdad vs. Validez:\n  1. **La Verdad es una propiedad de las PROPOSICIONES:**\n     - Consiste en la correspondencia entre lo afirmado y la realidad empírica de los hechos (Verdad Fáctica) o consistencia axiomática.\n     - Se califica como: VERDADERO o FALSO.\n  2. **La Validez es una propiedad de las INFERENCIAS (Estructuras):**\n     - Consiste en que la forma lógica del razonamiento garantice que no se puedan obtener premisas verdaderas con conclusión falsa.\n     - Se califica como: VÁLIDO o INVÁLIDO (Correcto o Incorrecto).\n\n• Posibilidades Combinatorias en Lógica:\n  - Premisas Falsas + Estructura Válida -> Puede dar Conclusión Verdadera.\n    * 'Todos los peces vuelan (F). Los cóndores son peces (F). -> Los cóndores vuelan (V)'. ¡El razonamiento es VÁLIDO aunque sus premisas sean disparates fácticos!\n  - Premisas Verdaderas + Conclusión Verdadera -> Puede ser un razonamiento INVÁLIDO (falacia formal).",
                conceptosClave = listOf(
                    "Las proposiciones son verdaderas o falsas",
                    "Las inferencias son válidas o inválidas",
                    "Validez formal: Depende de la estructura sintáctica, no del contenido semántico",
                    "Razonamiento sólido (Sound argument): Estructura válida con premisas fácticas verdaderas"
                ),
                formulas = listOf(
                    "\\text{Validez} \\iff (P_1 \\land P_2 \\land \\dots \\land P_n \\to C) \\text{ es Tautología}",
                    "\\text{Solidez} = \\text{Validez Estructural} + \\text{Premisas Fácticamente Verdaderas}"
                ),
                formulaName = "Definición Estricta de Validez Inferencia",
                formulaLatex = "\\text{Válido}(\\Gamma \\vdash C) \\iff \\Gamma \\models C",
                formulaDescription = "Una inferencia es válida si la conjunción de premisas implica tautológicamente a la conclusión.",
                admissionTip = "¡Nunca digas en un examen que 'un argumento es verdadero' o que 'una proposición es válida'! La proposición es V o F; el argumento es Válido o Inválido.",
                admissionExplanation = "• La lógica formal no juzga la verdad de los hechos (eso le compete a la biología, historia, etc.), sino la corrección del enlace deductivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Analice el siguiente razonamiento:\n«Todos los reptiles son invertebrados. El león es un reptil. Por lo tanto, el león es invertebrado».\nDesde el punto de vista de la lógica formal, ¿cómo se califica este razonamiento y sus proposiciones componentes?",
                    options = listOf(
                        "Es un razonamiento inválido porque sus premisas y su conclusión son fácticamente falsas.",
                        "Es un razonamiento deductivamente válido, aun cuando sus premisas y su conclusión sean fácticamente falsas en zoología.",
                        "Es una proposición molecular contradictoria.",
                        "Es un razonamiento inductivo probabilístico.",
                        "Es una falacia no formal de apelación a la ignorancia."
                    ),
                    correctIndex = 1,
                    explanation = "La estructura tiene la forma silogística canónica: Todo M es P; S es M; por tanto, S es P. Esta forma es formalmente VÁLIDA (la conclusión se desprende necesariamente de las premisas dadas). Que las premisas y la conclusión no correspondan a la realidad zoológica no altera su perfecta validez sintáctica deductiva.",
                    subject = "Raz. Lógico",
                    semana = 4
                ),
                Challenge(
                    id = "q_rl_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Señale la afirmación epistemológicamente correcta respecto a la verdad y la validez:",
                    options = listOf(
                        "Una inferencia puede ser calificada como verdadera si la mayoría de científicos la aprueba.",
                        "La verdad se predica de los enunciados declarativos, mientras que la validez es una propiedad exclusiva de los razonamientos o inferencias.",
                        "Todo razonamiento con premisas verdaderas y conclusión verdadera es automáticamente válido.",
                        "La validez depende de la comprobación experimental de laboratorio.",
                        "Las proposiciones atómicas son válidas o inválidas según su tabla de verdad."
                    ),
                    correctIndex = 1,
                    explanation = "La verdad corresponde a la relación entre la proposición y la realidad empírica/formal, mientras que la validez es una cualidad puramente estructural de las inferencias.",
                    subject = "Raz. Lógico",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rl_t04_s03",
            subjectId = "raz_logico",
            semana = 4,
            subtema = "4.3 Reglas Clásicas de Inferencia: Modus Ponens, Modus Tollens y Silogismo Hipotético",
            title = "Reglas de Inferencia Canónicas: MPP, MTT, SHP",
            theory = LessonTheory(
                id = "th_rl_t04_s03",
                asignatura = "Raz. Lógico",
                semana = 4,
                titulo = "El Arsenal Deductivo Fundamental",
                resumen = "• 1. Modus Ponendo Ponens (MPP - El método de afirmar afirmando):\n  - Esquema:\n    * Premisa 1: p -> q (Si ocurre p, entonces ocurre q)\n    * Premisa 2: p (Ocurre efectivamente p)\n    * Conclusión: ∴ q (Ocurre necesariamente q)\n  - Fundamento: Si el condicional es verdadero y se verifica su antecedente, el consecuente no puede eludirse.\n\n• 2. Modus Tollendo Tollens (MTT - El método de negar negando):\n  - Esquema:\n    * Premisa 1: p -> q (Si ocurre p, entonces ocurre q)\n    * Premisa 2: ~q (No ocurre q / se niega el consecuente)\n    * Conclusión: ∴ ~p (No ocurrió p / se niega el antecedente)\n  - Fundamento: Si el consecuente no se produjo, la causa suficiente jamás pudo haberse activado.\n\n• 3. Silogismo Hipotético Puro (SHP - Transitividad de la implicación):\n  - Esquema:\n    * Premisa 1: p -> q\n    * Premisa 2: q -> r\n    * Conclusión: ∴ p -> r\n  - Fundamento: La relación de implicación condicional es estrictamente transitiva a lo largo de una cadena causal.",
                conceptosClave = listOf(
                    "MPP: Afirma el antecedente -> Concluye el consecuente",
                    "MTT: Niega el consecuente -> Concluye la negación del antecedente",
                    "SHP: Transitividad encadenada (p -> q y q -> r implica p -> r)",
                    "Doble negación aplicada a MPP y MTT"
                ),
                formulas = listOf(
                    "\\text{MPP}: [(p \\to q) \\land p] \\vdash q",
                    "\\text{MTT}: [(p \\to q) \\land \\neg q] \\vdash \\neg p",
                    "\\text{SHP}: [(p \\to q) \\land (q \\to r)] \\vdash (p \\to r)"
                ),
                formulaName = "Tríada de Reglas Clásicas de Inferencia",
                formulaLatex = "\\{p \\to q, \\, p\\} \\vdash q \\quad \\text{y} \\quad \\{p \\to q, \\, \\neg q\\} \\vdash \\neg p",
                formulaDescription = "Reglas primitivas de deducción natural con condicionales.",
                admissionTip = "Para MTT: Si te dicen 'Si llueve, me mojo' y luego 'No me mojé', la conclusión lógica obligatoria es 'No llovió'.",
                admissionExplanation = "• ¡Ojo! Si te dicen 'No llovió', NO puedes concluir 'No me mojé' (podrías haberte mojado en la piscina). Eso sería una falacia de negación del antecedente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dadas las siguientes premisas:\n1. Si la empresa minera cumple los estándares ambientales internacionales, obtendrá la licencia social de la comunidad.\n2. La empresa minera no obtuvo la licencia social de la comunidad.\n¿Qué conclusión formalmente válida se deduce mediante la aplicación del Modus Tollens?",
                    options = listOf(
                        "La comunidad actuó de manera irracional.",
                        "La empresa minera no cumplió los estándares ambientales internacionales.",
                        "La empresa minera volverá a solicitar la licencia el próximo año.",
                        "Si la empresa contamina, la comunidad protesta.",
                        "La empresa cumplió parcialmente los estándares requeridos."
                    ),
                    correctIndex = 1,
                    explanation = "Premisa 1: p -> q. Premisa 2: ~q. Por la regla de inferencia Modus Tollendo Tollens (MTT), al negar el consecuente se concluye necesariamente la negación del antecedente: ~p («La empresa minera no cumplió los estándares ambientales internacionales»).",
                    subject = "Raz. Lógico",
                    semana = 4
                ),
                Challenge(
                    id = "q_rl_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A partir de las premisas:\nI. «Si se incrementa la inversión en investigación científica (p), se desarrollan patentes tecnológicas de alto valor (q)».\nII. «Si se desarrollan patentes tecnológicas de alto valor (q), se eleva la competitividad del sector productivo nacional (r)».\nSe concluye válidamente por Silogismo Hipotético Puro que:",
                    options = listOf(
                        "Si se eleva la competitividad del sector productivo nacional, se incrementó la inversión en investigación.",
                        "Si se incrementa la inversión en investigación científica, se eleva la competitividad del sector productivo nacional.",
                        "Se eleva la competitividad solo si no hay inversión en patentes.",
                        "O se investiga o no hay patentes tecnológicas.",
                        "La inversión científica no depende de la competitividad."
                    ),
                    correctIndex = 1,
                    explanation = "Por la regla transitiva del Silogismo Hipotético Puro (SHP): (p -> q) ∧ (q -> r) ⊢ (p -> r). La conclusión directa es: «Si se incrementa la inversión en investigación científica, se eleva la competitividad del sector productivo nacional».",
                    subject = "Raz. Lógico",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "rl_t04_s04",
            subjectId = "raz_logico",
            semana = 4,
            subtema = "4.4 Silogismo Disyuntivo, Dilemas Lógicos y Falacias Formales de Inferencia",
            title = "Silogismo Disyuntivo, Dilemas y Falacias Formales",
            theory = LessonTheory(
                id = "th_rl_t04_s04",
                asignatura = "Raz. Lógico",
                semana = 4,
                titulo = "Reglas Disyuntivas y Trampas de Invalidez Formal",
                resumen = "• 1. Silogismo Disyuntivo (SD ó Modus Tollendo Ponens):\n  - Esquema:\n    * Premisa 1: p ∨ q (Ocurre p o ocurre q)\n    * Premisa 2: ~p (Se descarta/niega p)\n    * Conclusión: ∴ q (Ocurre forzosamente q)\n  - Fundamento: En una disyunción, si se descarta una alternativa, la otra queda automáticamente establecida.\n\n• 2. Dilemas Lógicos:\n  - Dilema Constructivo: [(p -> q) ∧ (r -> s) ∧ (p ∨ r)] ⊢ (q ∨ s).\n  - Dilema Destructivo: [(p -> q) ∧ (r -> s) ∧ (~q ∨ ~s)] ⊢ (~p ∨ ~r).\n\n• 3. Las Dos Grandes Falacias Formales de Inferencia (¡Altísima frecuencia UNSA!):\n  1. **Falacia de Afirmación del Consecuente (FAC):**\n     - Estructura Errónea: p -> q; ocurre q; ∴ concluyen p. (¡TOTALMENTE INVÁLIDO!).\n     - Ejemplo: 'Si llueve, la pista se moja. La pista está mojada. Por lo tanto, llovió'. (Error: se pudo haber mojado por un camión cisterna).\n  2. **Falacia de Negación del Antecedente (FNA):**\n     - Estructura Errónea: p -> q; ocurre ~p; ∴ concluyen ~q. (¡TOTALMENTE INVÁLIDO!).\n     - Ejemplo: 'Si obtienes 100 puntos, ingresas. No obtuviste 100 puntos. Por lo tanto, no ingresas'. (Error: podías ingresar sacando 95 o 90 puntos).",
                conceptosClave = listOf(
                    "Silogismo Disyuntivo: Negando una alternativa se afirma la otra (p ∨ q, ~p ⊢ q)",
                    "Dilema constructivo: Unión disyuntiva de consecuencias",
                    "Falacia de afirmación del consecuente: Confundir necesidad con suficiencia",
                    "Falacia de negación del antecedente: Negar la causa no autoriza a negar el efecto"
                ),
                formulas = listOf(
                    "\\text{SD}: [(p \\lor q) \\land \\neg p] \\vdash q",
                    "\\text{FAC (Inválido)}: [(p \\to q) \\land q] \\not\\vdash p",
                    "\\text{FNA (Inválido)}: [(p \\to q) \\land \\neg p] \\not\\vdash \\neg q"
                ),
                formulaName = "Silogismo Disyuntivo y Falacias Proposicionales",
                formulaLatex = "[(p \\lor q) \\land \\neg p] \\implies q \\quad \\text{vs.} \\quad [(p \\to q) \\land q] \\centernot\\implies p",
                formulaDescription = "Diferenciación matemática entre deducción legítima y falacia estructural.",
                admissionTip = "En un condicional solo hay dos movimientos válidos: afirmar el inicio (MPP) o negar el final (MTT). Si afirmas el final o niegas el inicio, estás cometiendo una falacia formal.",
                admissionExplanation = "• No te dejes engañar por razonamientos que suenan psicológicamente convincentes; fíjate en la flecha condicional."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique cuál de los siguientes razonamientos incurre en la FALACIA DE AFIRMACIÓN DEL CONSECUENTE:",
                    options = listOf(
                        "Si el volcán entra en erupción explosiva, se emiten cenizas volcánicas. No se emitieron cenizas volcánicas; en consecuencia, el volcán no entró en erupción explosiva.",
                        "O el estudiante viaja a Camaná o se queda estudiando en Arequipa. No viajó a Camaná; por lo tanto, se quedó estudiando en Arequipa.",
                        "Si un postulante obtiene el primer puesto en el cómputo general, sale fotografiado en el diario. Mario salió fotografiado en el diario; por lo tanto, Mario obtuvo el primer puesto en el cómputo general.",
                        "Si la temperatura desciende bajo cero, el agua del estanque se congela. La temperatura descendió bajo cero; por ende, el agua se congeló.",
                        "Si suben los aranceles, disminuyen las importaciones. Si disminuyen las importaciones, se protege la industria local. Luego, si suben los aranceles, se protege la industria local."
                    ),
                    correctIndex = 2,
                    explanation = "La opción con Mario tiene la estructura: p -> q (Si es 1er puesto -> sale en el diario). Ocurre q (Salió en el diario). Concluyen p (Fue 1er puesto). Esto es formalmente INVÁLIDO porque Mario pudo haber salido fotografiado por ganar un torneo de debate, una olimpiada o por cualquier otro motivo. Es la Falacia de Afirmación del Consecuente.",
                    subject = "Raz. Lógico",
                    semana = 4
                ),
                Challenge(
                    id = "q_rl_t04_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se formulan las siguientes dos premisas:\n1. El conferencista dictará su ponencia en el paraninfo de la UNSA o la transmitirá en modalidad virtual vía satélite.\n2. Se ha verificado que el conferencista no dictará su ponencia en el paraninfo de la UNSA.\n¿Qué conclusión se deriva de forma rigurosa?",
                    options = listOf(
                        "Se canceló definitivamente la conferencia.",
                        "El conferencista transmitirá su ponencia en modalidad virtual vía satélite.",
                        "La ponencia carece de valor académico.",
                        "El público exigirá la devolución de su dinero.",
                        "La transmisión virtual se realizará la próxima semana."
                    ),
                    correctIndex = 1,
                    explanation = "Por la regla de inferencia del Silogismo Disyuntivo (Modus Tollendo Ponens): (p ∨ q) ∧ ~p ⊢ q. Al descartar la primera opción disyuntiva, la segunda queda forzosa y deductivamente demostrada.",
                    subject = "Raz. Lógico",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: SILOGISMOS Y RAZONAMIENTO DEDUCTIVO BÁSICO (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "rl_t05_s01",
            subjectId = "raz_logico",
            semana = 5,
            subtema = "5.1 Proposiciones Categóricas Típicas (A, E, I, O) y Cuadro Tradicional de Boecio",
            title = "Proposiciones Categóricas Típicas: A, E, I, O",
            theory = LessonTheory(
                id = "th_rl_t05_s01",
                asignatura = "Raz. Lógico",
                semana = 5,
                titulo = "La Estructura Categórica Aristotélica",
                resumen = "• Las Cuatro Formas Categóricas Estándar:\n  1. **Universal Afirmativa (Forma A):**\n     - «Todo S es P».\n     - Teoría de Clases: La clase S está totalmente incluida en la clase P (S ∩ P' = ∅).\n  2. **Universal Negativa (Forma E):**\n     - «Ningún S es P».\n     - Teoría de Clases: La clase S y la clase P son disjuntas; su intersección es vacía (S ∩ P = ∅).\n  3. **Particular Afirmativa (Forma I):**\n     - «Algún S es P» (Al menos un elemento de S pertenece a P).\n     - Teoría de Clases: La intersección no es vacía (S ∩ P ≠ ∅).\n  4. **Particular Negativa (Forma O):**\n     - «Algún S no es P» (Al menos un elemento de S queda fuera de P).\n     - Teoría de Clases: S ∩ P' ≠ ∅.\n\n• El Cuadro Tradicional de Oposición (Cuadro de Boecio):\n  - **Contradictorias (Diagonal):** A vs. O; E vs. I. Tienen valores opuestos (V vs. F).\n  - **Contrarias (Horizontal Superior):** A vs. E. No pueden ser ambas V; pero sí pueden ser ambas F.\n  - **Subcontrarias (Horizontal Inferior):** I vs. O. No pueden ser ambas F; pero sí pueden ser ambas V.\n  - **Subalternas (Verticales):** De A a I; de E a O. Si la universal es Verdadera, la particular es forzosamente Verdadera.",
                conceptosClave = listOf(
                    "Forma A: Universal afirmativa (Todo S es P)",
                    "Forma E: Universal negativa (Ningún S es P)",
                    "Forma I: Particular afirmativa (Algún S es P)",
                    "Forma O: Particular negativa (Algún S no es P)",
                    "Contradictorias exactas: A se contradice con O; E se contradice con I"
                ),
                formulas = listOf(
                    "\\mathbf{A}: \\forall x (Sx \\to Px) \\equiv S \\cap \\bar{P} = \\emptyset",
                    "\\mathbf{E}: \\forall x (Sx \\to \\neg Px) \\equiv S \\cap P = \\emptyset",
                    "\\mathbf{I}: \\exists x (Sx \\land Px) \\equiv S \\cap P \\neq \\emptyset",
                    "\\mathbf{O}: \\exists x (Sx \\land \\neg Px) \\equiv S \\cap \\bar{P} \\neq \\emptyset"
                ),
                formulaName = "Cuadro Tradicional de Boecio",
                formulaLatex = "\\neg(\\text{Todo } S \\text{ es } P) \\equiv \\text{Algún } S \\text{ no es } P \\quad (\\neg A \\equiv O)",
                formulaDescription = "La negación exacta de una proposición universal afirmativa es su particular negativa.",
                admissionTip = "¡Error típico en admisión!: Creer que la negación de 'Todos son honestos' es 'Nadie es honesto'. ¡FALSO! La negación estricta de 'Todos son honestos' es 'Al menos uno no es honesto' (Forma O).",
                admissionExplanation = "• Igualmente: La negación de 'Ningún alumno aprobó' no es 'Todos aprobaron', sino 'Algún alumno aprobó' (Forma I)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si se determina que la proposición universal afirmativa (Tipo A) «Todos los mamíferos son animales de sangre caliente» es VERDADERA, ¿cuál es el valor de verdad que adquiere inmediatamente por contradicción su proposición opuesta correspondiente?",
                    options = listOf(
                        "«Ningún mamífero es animal de sangre caliente» es Falso.",
                        "«Algún mamífero no es animal de sangre caliente» es necesariamente Falso.",
                        "«Algún mamífero es animal de sangre caliente» es Falso.",
                        "«Todos los mamíferos son animales de sangre fría» es Verdadero.",
                        "El valor queda indeterminado."
                    ),
                    correctIndex = 1,
                    explanation = "En el Cuadro de Boecio, la contradictoria de la Universal Afirmativa (A) es la Particular Negativa (O): «Algún S no es P». Por el principio de contradicción estricta, si A es Verdadera, O es necesariamente FALSA.",
                    subject = "Raz. Lógico",
                    semana = 5
                ),
                Challenge(
                    id = "q_rl_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La negación lógica formal del aserto «Ningún estudiante de la UNSA desaprueba el curso de inducción» corresponde a:",
                    options = listOf(
                        "Todos los estudiantes de la UNSA desaprueban el curso de inducción.",
                        "Algún estudiante de la UNSA desaprueba el curso de inducción.",
                        "Muchos estudiantes de la UNSA no desaprueban el curso.",
                        "Nadie en la universidad aprueba el curso de inducción.",
                        "Si un alumno estudia en la UNSA, aprueba el curso."
                    ),
                    correctIndex = 1,
                    explanation = "La proposición dada es de tipo E («Ningún S es P»). Su negación lógica contradictoria estricta es la forma particular afirmativa I («Algún S es P»): «Algún estudiante de la UNSA desaprueba el curso de inducción».",
                    subject = "Raz. Lógico",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rl_t05_s02",
            subjectId = "raz_logico",
            semana = 5,
            subtema = "5.2 Estructura del Silogismo Categórico: Términos (Mayor, Menor y Medio) y Premisas",
            title = "Anatomía del Silogismo: Términos Mayor, Menor y Medio",
            theory = LessonTheory(
                id = "th_rl_t05_s02",
                asignatura = "Raz. Lógico",
                semana = 5,
                titulo = "Estructura del Silogismo Aristotélico",
                resumen = "• Definición de Silogismo Categórico:\n  - Razonamiento deductivo compuesto exactamente por tres proposiciones categóricas (dos premisas y una conclusión) que involucran exactamente a tres términos o clases distintas.\n\n• Los Tres Términos del Silogismo:\n  1. **Término Mayor (P):**\n     - Es el término que aparece como PREDICADO de la conclusión.\n     - La premisa que lo contiene se denomina Premisa Mayor (tradicionalmente se enuncia primero).\n  2. **Término Menor (S):**\n     - Es el término que aparece como SUJETO de la conclusión.\n     - La premisa que lo contiene se denomina Premisa Menor.\n  3. **Término Medio (M):**\n     - Es el conector conceptual que aparece en AMBAS PREMISAS pero NUNCA DEBE APARECER EN LA CONCLUSIÓN.\n     - Su función es mediar lógicamente entre S y P.\n\n• Ejemplo Estándar:\n  - Premisa Mayor: Todos los volcanes (M) son estructuras geológicas (P).\n  - Premisa Menor: El Misti (S) es un volcán (M).\n  - Conclusión: Por tanto, El Misti (S) es una estructura geológica (P).\n  - Términos: P = 'estructuras geológicas', S = 'El Misti', M = 'volcanes'.",
                conceptosClave = listOf(
                    "Término Mayor (P): Predicado de la conclusión",
                    "Término Menor (S): Sujeto de la conclusión",
                    "Término Medio (M): Puente en ambas premisas, prohibido en la conclusión",
                    "Estructura fija de 3 términos: Violada por la falacia de cuatro términos"
                ),
                formulas = listOf(
                    "\\text{Premisa Mayor}: f(M, P)",
                    "\\text{Premisa Menor}: g(S, M)",
                    "\\text{Conclusión}: h(S, P) \\quad (M \\notin \\text{Conclusión})"
                ),
                formulaName = "Estructura Trimembre del Silogismo",
                formulaLatex = "S \\to M \\land M \\to P \\implies S \\to P",
                formulaDescription = "Encadenamiento transitivo mediado por el término medio M.",
                admissionTip = "Regla de oro de la UNSA: Identifica primero la conclusión. El sujeto de la conclusión es S, el predicado es P. El término restante que se repite en las premisas es M.",
                admissionExplanation = "• Si en una alternativa de conclusión ves que aparece el término medio M, ¡márcala inmediatamente como incorrecta!"
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el siguiente silogismo:\n- «Todos los metales alcalinos son conductores térmicos».\n- «El sodio es un metal alcalino».\n- «Por consiguiente, el sodio es conductor térmico».\n¿Cuál es el TÉRMINO MEDIO (M)?",
                    options = listOf(
                        "El sodio",
                        "Conductor térmico",
                        "Metal alcalino",
                        "Química inorgánica",
                        "No existe término medio definido"
                    ),
                    correctIndex = 2,
                    explanation = "El sujeto de la conclusión es 'el sodio' (Término Menor S); el predicado de la conclusión es 'conductor térmico' (Término Mayor P). El término que se repite en ambas premisas y que no aparece en la conclusión es 'metal alcalino' (Término Medio M).",
                    subject = "Raz. Lógico",
                    semana = 5
                ),
                Challenge(
                    id = "q_rl_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Una regla estructural inviolable del silogismo categórico aristotélico establece de manera tajante que:",
                    options = listOf(
                        "El término medio debe figurar necesariamente en la conclusión como sujeto.",
                        "El término medio no debe figurar jamás en la proposición que conforma la conclusión.",
                        "La premisa menor debe ser siempre una proposición negativa.",
                        "El término mayor debe repetirse tres veces en las premisas.",
                        "La conclusión debe ser más extensa que las dos premisas combinadas."
                    ),
                    correctIndex = 1,
                    explanation = "El Término Medio (M) cumple exclusivamente la función de nexo mediador en las premisas. Si pasara a la conclusión, el silogismo carecería de mediación lógica válida.",
                    subject = "Raz. Lógico",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rl_t05_s03",
            subjectId = "raz_logico",
            semana = 5,
            subtema = "5.3 Las 8 Reglas Aristotélicas de Validez Silogística y Falacias Formales",
            title = "Reglas de Validez Silogística y Falacias Formales",
            theory = LessonTheory(
                id = "th_rl_t05_s03",
                asignatura = "Raz. Lógico",
                semana = 5,
                titulo = "Criterios Clásicos de Validez y Detección de Falacias",
                resumen = "• Las 8 Reglas Tradicionales del Silogismo Categórico:\n  *Reglas de los Términos:*\n  1. Todo silogismo debe tener exactamente 3 términos (Mayor, Menor y Medio). (Violación -> Falacia de cuatro términos por polisemia).\n  2. El Término Medio debe estar distribuido (tomado en toda su extensión) al menos una vez en las premisas. (Violación -> Falacia del Término Medio No Distribuido).\n  3. Los términos en la conclusión no pueden tener mayor extensión que en las premisas. (Violación -> Falacia de ilícito mayor o ilícito menor).\n  4. El Término Medio jamás debe figurar en la conclusión.\n\n  *Reglas de las Proposiciones:*\n  5. De dos premisas negativas NADA se concluye formalmente. (Violación -> Falacia de premisas excluyentes).\n  6. De dos premisas particulares NADA se concluye formalmente. (Violación -> Falacia de premisas particulares).\n  7. Si una de las premisas es negativa o particular, la conclusión debe seguir a la 'parte más débil' (será negativa o particular).\n  8. De dos premisas afirmativas no puede derivarse una conclusión negativa.",
                conceptosClave = listOf(
                    "Distribución del término medio: Obligatoria al menos una vez",
                    "Regla de negatividad: Dos premisas negativas anulan cualquier inferencia",
                    "Regla de particularidad: Dos premisas particulares no engendran conclusión",
                    "La conclusión sigue a la parte más débil (particular antes que universal, negativa antes que afirmativa)"
                ),
                formulas = listOf(
                    "\\text{Premisas: } (\\text{Negativa} + \\text{Negativa}) \\implies \\text{Invalidez}",
                    "\\text{Premisas: } (\\text{Particular} + \\text{Particular}) \\implies \\text{Invalidez}",
                    "M \\text{ distribuido en al menos una premisa}"
                ),
                formulaName = "Teorema de la Parte Débil de Boecio",
                formulaLatex = "(\\exists P_i \\text{ Negativa} \\implies C \\text{ Negativa}) \\land (\\exists P_i \\text{ Particular} \\implies C \\text{ Particular})",
                formulaDescription = "La debilidad cualitativa o cuantitativa de una premisa se transfiere forzosamente a la conclusión.",
                admissionTip = "Si en una pregunta de silogismo ves dos premisas que empiezan con 'Ningún' o 'Algún... no' (dos negativas), no pierdas tiempo diagramando: ¡marca de inmediato que no se deriva ninguna conclusión válida!",
                admissionExplanation = "• Lo mismo ocurre si ambas empiezan con 'Algún': de dos particulares no se deduce nada."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dadas las siguientes dos premisas categóricas:\n- «Ningún reptil es mamífero».\n- «Ningún pez es mamífero».\nDe acuerdo con las reglas formales de la silogística aristotélica, ¿qué conclusión se deduce de manera válida?",
                    options = listOf(
                        "Ningún reptil es pez.",
                        "Todos los peces son reptiles.",
                        "Algún reptil no es pez.",
                        "De dos premisas negativas no se deriva formalmente ninguna conclusión válida.",
                        "Todos los mamíferos son acuáticos."
                    ),
                    correctIndex = 3,
                    explanation = "La regla número 5 del silogismo clásico prohíbe derivar conclusiones de dos premisas negativas (falacia de premisas excluyentes). Ambas niegan la inclusión con los mamíferos, impidiendo establecer un nexo entre reptiles y peces.",
                    subject = "Raz. Lógico",
                    semana = 5
                ),
                Challenge(
                    id = "q_rl_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si una de las premisas de un silogismo categórico válido es particular afirmativa (I) y la otra es universal negativa (E), la conclusión obtenida necesariamente debe ser:",
                    options = listOf(
                        "Universal afirmativa (A).",
                        "Universal negativa (E).",
                        "Particular afirmativa (I).",
                        "Particular negativa (O).",
                        "Tautológica e indeterminada."
                    ),
                    correctIndex = 3,
                    explanation = "Por la regla de que «la conclusión sigue siempre a la parte más débil»: en cualidad, lo negativo es más débil que lo afirmativo; en cantidad, lo particular es más débil que lo universal. Por ende, la conclusión debe ser forzosamente Particular Negativa (Forma O: Algún S no es P).",
                    subject = "Raz. Lógico",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "rl_t05_s04",
            subjectId = "raz_logico",
            semana = 5,
            subtema = "5.4 Validación por Diagramas de Venn de Tres Clases Intersecadas",
            title = "Diagramación de Venn para Silogismos Categóricos",
            theory = LessonTheory(
                id = "th_rl_t05_s04",
                asignatura = "Raz. Lógico",
                semana = 5,
                titulo = "El Método Geométrico de Validación de Venn",
                resumen = "• Configuración Geométrica de Tres Círculos:\n  - Se trazan tres conjuntos circulares mutuamente intersecados que representan a las tres clases del silogismo: S (inferior izq.), P (inferior der.) y M (superior central).\n  - Esto genera 8 regiones o zonas disjuntas numeradas (1 a 8).\n\n• Convenciones Notacionales de Venn:\n  1. **Región Sombreada (Rayada):** Representa un conjunto VACÍO (∅); allí no existe ningún elemento.\n  2. **Aspa o Cruz (X):** Representa EXISTENCIA DE AL MENOS UN ELEMENTO (≠ ∅).\n     - Si la X cae sobre una línea divisoria entre dos zonas, significa que el elemento está en una o en otra, pero no se sabe con certeza en cuál.\n\n• Algoritmo Infalible de Validación:\n  1. Se diagraman EXCLUSIVAMENTE las dos premisas en los círculos.\n     - ¡Regla Crítica!: Si hay una premisa universal y una particular, diagrama PRIMERO la universal (sombrear), y luego ubica la X de la particular.\n  2. Se observa si la conclusión quedó dibujada AUTOMÁTICAMENTE en el diagrama.\n  3. Si la conclusión ya está visible sin haberla dibujado -> El silogismo es VÁLIDO.\n  4. Si para que la conclusión se cumpla habría que forzar o añadir marcas no dibujadas -> El silogismo es INVÁLIDO.",
                conceptosClave = listOf(
                    "Configuración de 3 clases intersecadas (S, P, M)",
                    "Sombreado = Conjunto vacío (∅); Cruz (X) = Conjunto no vacío (≠ ∅)",
                    "Regla de prioridad: Diagramar primero la premisa universal",
                    "Lectura de la conclusión en la relación S-P sin alterar M"
                ),
                formulas = listOf(
                    "\\text{Sombrear } (S \\cap M) \\iff S \\cap M = \\emptyset",
                    "\\text{Ubicar X en } (S \\cap M) \\iff S \\cap M \\neq \\emptyset",
                    "\\text{Válido} \\iff \\text{Diagrama}(P_1, P_2) \\models \\text{Conclusión}"
                ),
                formulaName = "Criterio de Validación de Venn-Boole",
                formulaLatex = "\\text{Silogismo Válido} \\iff \\text{Venn}(P_1) \\oplus \\text{Venn}(P_2) \\implies \\text{Lectura}(C)",
                formulaDescription = "La información de la conclusión debe emerger de manera espontánea tras el ploteo de premisas.",
                admissionTip = "¡No dibujes la conclusión! El error más frecuente en el examen es sombrear también la conclusión. La conclusión SOLO SE LEE en las regiones de S y P.",
                admissionExplanation = "• Si la X cae en la frontera de dos sectores porque no se sabe con certeza dónde está, no puedes afirmar ninguna particular contundente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al validar un silogismo categórico mediante diagramas de Venn, ¿cuál es el procedimiento metodológico estricto que se debe seguir si el silogismo consta de una premisa universal («Todo M es P») y una premisa particular («Algún S es M»)?",
                    options = listOf(
                        "Colocar primero la 'X' de la premisa particular y luego sombrear la universal.",
                        "Sombrear primero la región correspondiente a la premisa universal y posteriormente ubicar la 'X' de la premisa particular en la zona no sombreada.",
                        "Diagramar simultáneamente la conclusión y las dos premisas.",
                        "Trazar únicamente dos círculos omitiendo al término medio M.",
                        "Calcular la tabla de verdad de 8 filas en lugar del diagrama."
                    ),
                    correctIndex = 1,
                    explanation = "La regla metodológica de Venn exige diagramar primero la premisa universal (sombreando la zona vacía). De esta forma, cuando se deba colocar la 'X' de la particular, la zona sombreada no admitirá la X y esta caerá con certeza en la región permitida restante.",
                    subject = "Raz. Lógico",
                    semana = 5
                ),
                Challenge(
                    id = "q_rl_t05_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un diagrama de Venn de tres conjuntos (S, P, M), si tras graficar las premisas se observa que toda la zona de S que queda fuera de P (S ∩ P') está totalmente sombreada, ¿qué conclusión se desprende con absoluta certeza lógica?",
                    options = listOf(
                        "Algún S es P.",
                        "Ningún S es P.",
                        "Todo S es P.",
                        "Algún S no es P.",
                        "Todo P es S."
                    ),
                    correctIndex = 2,
                    explanation = "Que la zona S ∩ P' esté completamente sombreada significa que es vacía: no hay ningún elemento de S que esté fuera de P. Por lo tanto, todos los elementos de S están contenidos dentro de P, lo que se lee formalmente como la proposición universal afirmativa: «Todo S es P».",
                    subject = "Raz. Lógico",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: CONSISTENCIA Y COHERENCIA LÓGICA (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "rl_t06_s01",
            subjectId = "raz_logico",
            semana = 6,
            subtema = "6.1 Consistencia Lógica y Satisfacibilidad de un Conjunto de Premisas",
            title = "Consistencia y Satisfacibilidad de Premisas",
            theory = LessonTheory(
                id = "th_rl_t06_s01",
                asignatura = "Raz. Lógico",
                semana = 6,
                titulo = "Teoría de la Satisfacibilidad Lógica (SAT)",
                resumen = "• Consistencia Lógica de un Conjunto de Proposiciones (Γ = {P1, P2, ..., Pn}):\n  - Un conjunto de enunciados es CONSISTENTE (o satisfacible) si y solo si es lógicamente posible que todos ellos sean VERDADEROS AL MISMO TIEMPO bajo al menos una interpretación de verdad asignada.\n  - Criterio Formal: Existe al menos una fila en la tabla de verdad combinada donde V(P1) = V, V(P2) = V, ..., V(Pn) = V simultáneamente.\n\n• Inconsistencia Lógica (Insatisfacibilidad):\n  - Un conjunto es INCONSISTENTE si es lógicamente imposible que todos sus miembros sean verdaderos simultáneamente.\n  - Contiene una contradicción explícita (p ∧ ~p) o una contradicción deducible entre sus consecuencias lógicas.\n  - En un sistema inconsistente, por el principio de explosión (*ex contradictione quodlibet*), se puede deducir válidamente cualquier disparate: una contradicción destruye todo el sistema discursivo.\n\n• Coherencia Semántica:\n  - Armonía no solo formal sino contextual de las premisas dentro de un marco fáctico determinado.",
                conceptosClave = listOf(
                    "Consistencia: Existe al menos un modelo donde todas las premisas son V",
                    "Inconsistencia: Imposibilidad de verdad simultánea (conjunto contradictorio)",
                    "Principio de explosión: De la inconsistencia formal se deriva cualquier proposición",
                    "Satisfacibilidad: Base matemática del cómputo lógico moderno"
                ),
                formulas = listOf(
                    "\\text{Consistente}(\\Gamma) \\iff \\exists I : \\forall P_i \\in \\Gamma, \\, V_I(P_i) = 1",
                    "\\text{Inconsistente}(\\Gamma) \\iff \\forall I, \\, \\exists P_i \\in \\Gamma : V_I(P_i) = 0"
                ),
                formulaName = "Criterio de Satisfacibilidad Lógica",
                formulaLatex = "\\Gamma \\text{ es Consistente} \\iff \\bigwedge_{i=1}^n P_i \\not\\equiv \\bot",
                formulaDescription = "La conjunción total de premisas no colapsa en una contradicción absurda.",
                admissionTip = "Para probar que un grupo de declaraciones es consistente en un examen, no hagas toda la tabla: busca un escenario plausible asignando valores V o F que haga que todas las frases se cumplan sin chocar entre sí.",
                admissionExplanation = "• Si dos premisas chocan de frente (ej. 'Carlos es soltero' y 'Carlos está casado con María'), el conjunto es automáticamente inconsistente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Se evalúa el siguiente conjunto de afirmaciones emitidas por un testigo en un proceso judicial:\n1. «Si el vehículo iba a exceso de velocidad, los frenos dejaron huella en el asfalto».\n2. «Los frenos no dejaron ninguna huella en el asfalto».\n3. «El vehículo iba a exceso de velocidad».\n¿Qué dictamen emite la lógica formal sobre la consistencia de este testimonio?",
                    options = listOf(
                        "Es un conjunto consistente y verídico.",
                        "Es un conjunto inconsistente, puesto que las afirmaciones 1 y 2 deducen lógicamente la negación de la afirmación 3, originando una contradicción interna.",
                        "Es un conjunto tautológico.",
                        "Es una inferencia inductiva válida.",
                        "Es consistente siempre y cuando el chofer sea mayor de edad."
                    ),
                    correctIndex = 1,
                    explanation = "De 1 (p -> q) y 2 (~q), aplicando Modus Tollens se deduce necesariamente ~p («El vehículo no iba a exceso de velocidad»). Al incluir la premisa 3 que afirma p («El vehículo iba a exceso de velocidad»), se genera la contradicción p ∧ ~p. Por tanto, el conjunto de afirmaciones es estrictamente inconsistente.",
                    subject = "Raz. Lógico",
                    semana = 6
                ),
                Challenge(
                    id = "q_rl_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un conjunto de proposiciones se define formalmente como SATISFACIBLE o CONSISTENTE cuando:",
                    options = listOf(
                        "Todas sus proposiciones son necesariamente verdaderas en todas las filas de su tabla de verdad.",
                        "Existe al menos una asignación de valores de verdad que hace verdaderas a todas las proposiciones del conjunto a la vez.",
                        "Contiene únicamente proposiciones atómicas afirmativas.",
                        "Todas las proposiciones tienen el mismo sujeto y predicado.",
                        "Ninguna proposición contiene conectores disyuntivos."
                    ),
                    correctIndex = 1,
                    explanation = "La definición matemática de consistencia (o satisfacibilidad) exige que exista al menos una interpretación de verdad simultánea para todos los elementos del conjunto sin producir contradicciones.",
                    subject = "Raz. Lógico",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rl_t06_s02",
            subjectId = "raz_logico",
            semana = 6,
            subtema = "6.2 Contradicción Formal Interna (p ∧ ¬p) e Incompatibilidad Contextual",
            title = "Contradicción Formal e Incompatibilidad Contextual",
            theory = LessonTheory(
                id = "th_rl_t06_s02",
                asignatura = "Raz. Lógico",
                semana = 6,
                titulo = "Fisuras Lógicas: Contradicción vs. Incompatibilidad",
                resumen = "• Contradicción Formal Directa (p ∧ ¬p):\n  - Ocurre cuando un texto, discurso o teoría afirma y niega el mismo aserto bajo las mismas circunstancias y al mismo tiempo.\n  - Su matriz de verdad es idénticamente FALSA en todo universo posible.\n  - Viola directamente el Principio de No Contradicción: ¬(p ∧ ¬p).\n\n• Incompatibilidad Contextual Cruzada:\n  - Ocurre cuando dos afirmaciones no parecen contradictorias a simple vista gramatical, pero los hechos del contexto del problema hacen imposible que ambas coexistan.\n  - Ejemplo: 'El examen se rindió a las 8:00 a. m. en el campus de Paucarpata' y 'A las 8:00 a. m. el postulante estaba varado en el aeropuerto de Lima'. Físicamente es incompatible que esté en ambos lugares simultáneamente.\n\n• Detección de Fisuras en Textos Complejos:\n  - Paso 1: Formalizar cada tesis en proposiciones elementales p, q, r.\n  - Paso 2: Extraer las consecuencias lógicas inmediatas de cada una.\n  - Paso 3: Identificar si alguna consecuencia choca frontalmente con otra premisa.",
                conceptosClave = listOf(
                    "Contradicción directa: Afirmación y negación simultánea de la misma variable (p ∧ ~p)",
                    "Incompatibilidad contextual: Imposibilidad física o fáctica simultánea",
                    "Teorema de incoherencia: Una premisa anula la credibilidad del conjunto",
                    "Detección de incoherencias en testimonios jurídicos DECO"
                ),
                formulas = listOf(
                    "p \\land \\neg p \\equiv F \\quad (\\text{Contradicción Absoluta})",
                    "A \\cap B = \\emptyset \\implies \\neg(x \\in A \\land x \\in B) \\quad (\\text{Incompatibilidad de clases})"
                ),
                formulaName = "Principio de No Contradicción",
                formulaLatex = "\\neg(p \\land \\neg p) = 1 \\quad \\forall p",
                formulaDescription = "Axioma supremo de consistencia racional del pensamiento formal.",
                admissionTip = "En los exámenes de admisión de la UNSA, si te piden '¿Cuál de los siguientes testimonios es contradictorio?', busca oraciones donde el mismo sujeto tenga atributos excluyentes (ej. 'Era de día y el cielo nocturno estrellado brillaba').",
                admissionExplanation = "• No confundas una paradoja aparente con una contradicción formal: la paradoja cuestiona los marcos teóricos, la contradicción simplemente es un absurdo lógico."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes expresiones contiene formalmente una CONTRADICCIÓN DIRECTA?",
                    options = listOf(
                        "El postulante aprobó el examen de admisión, pero no alcanzó una vacante en su carrera.",
                        "El número entero n es par y a la vez el número entero n no es par.",
                        "El sospechoso afirma que no estuvo en la escena del crimen a pesar de que hay testigos que lo vieron en las cercanías.",
                        "El paciente presenta fiebre moderada sin manifestar tos seca.",
                        "Llueve copiosamente en la cordillera mientras brilla el sol en la costa."
                    ),
                    correctIndex = 1,
                    explanation = "«El número entero n es par (p) y a la vez no es par (~p)» tiene la forma exacta p ∧ ~p, violando el principio de no contradicción al atribuir simultáneamente una propiedad y su negación al mismo ente matemático.",
                    subject = "Raz. Lógico",
                    semana = 6
                ),
                Challenge(
                    id = "q_rl_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un informe pericial se asienta:\n«El sospechoso se encontraba a las 10:00 a. m. en una reunión pública en Camaná. Asimismo, a las 10:00 a. m. del mismo día fue identificado operando un cajero automático en la ciudad de Juliaca». \nDesde el punto de vista lógico, este informe presenta:",
                    options = listOf(
                        "Una tautología axiomática.",
                        "Una incompatibilidad contextual fáctica irresoluble.",
                        "Una regla válida de Modus Ponens.",
                        "Una premisa con cuantificador existencial múltiple.",
                        "Una falacia formal de negación del antecedente."
                    ),
                    correctIndex = 1,
                    explanation = "Estar físicamente a la misma hora en dos ciudades distantes (Camaná y Juliaca) constituye una imposibilidad empírica espaciotemporal que genera una incompatibilidad contextual en el conjunto testimonial.",
                    subject = "Raz. Lógico",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rl_t06_s03",
            subjectId = "raz_logico",
            semana = 6,
            subtema = "6.3 Problemas de Verdades y Mentiras: Principio de Contradicción y Equivalencia",
            title = "Problemas de Verdades y Mentiras: Método de Contradicción",
            theory = LessonTheory(
                id = "th_rl_t06_s03",
                asignatura = "Raz. Lógico",
                semana = 6,
                titulo = "Resolución Estratégica de Acertijos de Veracidad",
                resumen = "• Naturaleza de los Problemas de Verdades y Mentiras:\n  - Se presenta un conjunto de individuos donde cada uno emite una declaración, especificándose cuántos dicen la verdad (V) y cuántos mienten (F).\n  - Objetivo: Determinar quién cometió la acción, quién posee un objeto o qué declaración es verdadera.\n\n• El Método Maestro de Contradicción:\n  - Paso 1: Analizar las declaraciones buscando dos que sean EXMUTUAMENTE CONTRADICTORIAS (una afirma lo que la otra niega directamente).\n    * Ejemplo: Alberto dice: 'Beto rompió la ventana'; Beto dice: 'Yo no rompí la ventana'.\n  - Paso 2: Por el principio de contradicción, entre esas dos personas hay OBLIGATORIAMENTE UNA QUE DICE LA VERDAD Y OTRA QUE MIENTE (1 V y 1 F).\n  - Paso 3: Asignar esa verdad y mentira al par. Si el enunciado dice que 'solo uno miente' o 'solo uno dice la verdad', los demás quedan inmediatamente definidos.\n  - Paso 4: Leer las declaraciones de los que ya sabemos su valor fijo para obtener la solución directa sin tantear.\n\n• El Método de Equivalencia:\n  - Si dos sospechosos dicen esencialmente lo mismo (A afirma: 'El culpable es C'; B afirma: 'C cometió el delito'), ambos deben tener el mismo valor veritativo (ambos V o ambos F).",
                conceptosClave = listOf(
                    "Detección inmediata del par contradictorio (contiene 1 V y 1 F)",
                    "Detección del par equivalente (ambos V o ambos F)",
                    "Distribución del balance veritativo fijado por el problema",
                    "Deducción rápida a partir de las declaraciones de terceros no implicados"
                ),
                formulas = listOf(
                    "\\text{Par Contradictorio} \\implies \\{A, B\\} = \\{V, F\\}",
                    "\\text{Par Equivalente} \\implies V(A) = V(B)"
                ),
                formulaName = "Teorema del Par Contradictorio de Veracidad",
                formulaLatex = "A \\equiv \\neg B \\implies V(A) + V(B) = 1 \\quad (\\text{Bivalencia})",
                formulaDescription = "En un par contradictorio, la suma de verdades es idénticamente igual a 1.",
                admissionTip = "¡Este tipo de problema viene en TODOS los exámenes de la UNSA! No te pongas a suponer 'qué pasa si A miente...'. Primero busca quién se contradice con quién; ahí está el 80% de la respuesta.",
                admissionExplanation = "• Una vez que ubicas el par contradictorio, mira el enunciado: si dice 'solo uno dice la verdad', ¡los que están fuera del par son todos mentirosos!"
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cuatro amigos son interrogados acerca de quién se comió el último pastel de queso arequipeño:\n- Aldo: «Fue Beto».\n- Beto: «Fue Darío».\n- Carlos: «Yo no fui».\n- Darío: «Beto miente cuando dice que fui yo».\nSi solo uno de ellos dice la verdad y los otros tres mienten, ¿quién se comió el pastel?",
                    options = listOf(
                        "Aldo",
                        "Beto",
                        "Carlos",
                        "Darío",
                        "Nadie comió el pastel"
                    ),
                    correctIndex = 2,
                    explanation = "1. Detectamos el par contradictorio: Beto acusa a Darío («Fue Darío») y Darío lo niega («Beto miente»). Entre Beto y Darío hay obligatoriamente una verdad (V) y una mentira (F).\n2. El problema indica que SOLO UNO dice la verdad. Como esa única verdad está entre Beto o Darío, se concluye con certeza que Aldo y Carlos MIENTEN.\n3. Como Carlos miente al decir «Yo no fui», su afirmación falsa significa que ÉL SÍ FUE. Por lo tanto, quien se comió el pastel fue Carlos.",
                    subject = "Raz. Lógico",
                    semana = 6
                ),
                Challenge(
                    id = "q_rl_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un problema de verdades y mentiras con cuatro sospechosos, se descubre que dos de ellos emiten declaraciones formalmente idénticas en significado (equivalentes). Si el enunciado garantiza que existe exactamente una persona que dice la verdad y tres que mienten, se deduce necesariamente que:",
                    options = listOf(
                        "Ambos sospechosos equivalentes dicen la verdad.",
                        "Ambos sospechosos equivalentes mienten.",
                        "Uno de ellos dice la verdad y el otro miente.",
                        "La persona culpable es obligatoriamente uno de ellos dos.",
                        "El problema carece de solución lógica."
                    ),
                    correctIndex = 1,
                    explanation = "Si dos personas dicen lo mismo, deben tener el mismo valor de verdad. Si ambas dijeran la verdad, habrían al menos dos verdades en el grupo, violando la regla de que 'solo uno dice la verdad'. Por lo tanto, obligatoriamente ambos tienen que estar mintiendo.",
                    subject = "Raz. Lógico",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "rl_t06_s04",
            subjectId = "raz_logico",
            semana = 6,
            subtema = "6.4 Método de Suposición Hipotética y Resolución de Paradojas de Veracidad",
            title = "Método de Suposición y Paradojas de Veracidad",
            theory = LessonTheory(
                id = "th_rl_t06_s04",
                asignatura = "Raz. Lógico",
                semana = 6,
                titulo = "Técnica de Suposición Hipotética",
                resumen = "• Cuándo Aplicar el Método de Suposición:\n  - Se utiliza cuando en un problema de verdades y mentiras NO existen pares contradictorios evidentes ni pares equivalentes directos.\n\n• Protocolo del Método de Suposición:\n  1. Se elige a uno de los personajes y se asume una hipótesis de trabajo: 'Supongamos que el culpable es X' (o 'Supongamos que A dice la verdad').\n  2. Bajo esa hipótesis, se evalúa minuciosamente el valor de verdad (V o F) de las declaraciones de todos los involucrados.\n  3. Se cuenta el número de verdades y mentiras obtenidas y se coteja contra la condición del problema.\n  4. Si se produce alguna contradicción con los datos (ej. resultan 2 mentirosos cuando debía haber 1) -> La hipótesis queda DESCARTADA por reducción al absurdo.\n  5. Si todos los enunciados encajan sin fisuras y satisfacen el balance requerido -> La hipótesis es la SOLUCIÓN ÚNICA.\n\n• Caballeros y Bribones (La Isla de Smullyan):\n  - Caballeros: Siempre dicen la verdad (100% V).\n  - Bribones: Siempre mienten (100% F).\n  - Regla: Un habitante nunca puede decir 'Yo soy un bribón' (si fuera caballero mentiría, si fuera bribón diría la verdad; ambas absurdas).",
                conceptosClave = listOf(
                    "Suposición estructurada por casos mutuamente excluyentes",
                    "Reducción al absurdo: Descarte de hipótesis que generan contradicciones",
                    "Comprobación de consistencia total del balance de veracidad",
                    "Problemas canónicos de caballeros (siempre V) y bribones (siempre F)"
                ),
                formulas = listOf(
                    "\\text{Hipótesis: } H_i \\implies \\text{Evaluar}(D_1, D_2, \\dots, D_n)",
                    "\\text{Contradicción en } H_i \\implies \\neg H_i \\quad (\\text{Reductio ad absurdum})"
                ),
                formulaName = "Método de Ensayo Hipotético Consistente",
                formulaLatex = "H \\vdash (p \\land \\neg p) \\implies \\neg H",
                formulaDescription = "Principio de reducción al absurdo aplicado al descarte de culpabilidad.",
                admissionTip = "En lugar de suponer quién dice la verdad, a veces es tres veces más rápido suponer quién es el culpable: solo hay 4 sospechosos posibles, prueba uno por uno.",
                admissionExplanation = "• Cuando una suposición no genere contradicciones y calce con la cantidad exacta de mentirosos solicitada, esa es la respuesta correcta."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una isla hay dos tipos de habitantes: Caballeros (siempre dicen la verdad) y Bribones (siempre mienten). Nos encontramos con dos habitantes, A y B. El habitante A afirma: «Al menos uno de nosotros dos es un bribón». ¿Qué tipo de habitantes son A y B respectivamente?",
                    options = listOf(
                        "Ambos son bribones.",
                        "A es caballero y B es bribón.",
                        "A es bribón y B es caballero.",
                        "Ambos son caballeros.",
                        "Es una paradoja sin respuesta lógica formal."
                    ),
                    correctIndex = 1,
                    explanation = "1. Supongamos que A es un Bribón: Si A es bribón, su afirmación («Al menos uno de nosotros es un bribón») sería Verdadera (puesto que él mismo lo es). ¡Pero un bribón no puede decir la verdad! Contradicción. Por tanto, A NO es bribón; A es obligatoriamente un CABALLERO.\n2. Como A es Caballero, su afirmación es VERDADERA («Al menos uno de nosotros es un bribón»). Como A no es el bribón, para que la frase sea verdadera, B debe ser obligatoriamente el BRIBÓN. Por ende, A es caballero y B es bribón.",
                    subject = "Raz. Lógico",
                    semana = 6
                ),
                Challenge(
                    id = "q_rl_t06_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Tres hermanos, Hugo, Paco y Luis, son sospechosos de romper un jarrón. Sus declaraciones son:\n- Hugo: «Paco no lo rompió».\n- Paco: «Luis lo rompió».\n- Luis: «Yo no lo rompí».\nSi exactamente uno de ellos dice la verdad y solo uno rompió el jarrón, ¿quién dice la verdad y quién fue el culpable?",
                    options = listOf(
                        "Dice la verdad Paco; culpable Luis.",
                        "Dice la verdad Luis; culpable Paco.",
                        "Dice la verdad Hugo; culpable Hugo.",
                        "Dice la verdad Paco; culpable Hugo.",
                        "Dice la verdad Hugo; culpable Luis."
                    ),
                    correctIndex = 1,
                    explanation = "Paco («Luis lo rompió») y Luis («Yo no lo rompí») se contradicen; uno dice la verdad y el otro miente. Como solo hay una verdad en total, Hugo miente. Hugo dice «Paco no lo rompió»; como esto es falso, deducimos que PACO LO ROMPIÓ (él es el culpable). Al ser Paco el culpable, la acusación de Paco («Luis lo rompió») es Falsa; por ende, quien dice la verdad es LUIS.",
                    subject = "Raz. Lógico",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: RAZONAMIENTO CON CONDICIONALES (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "rl_t07_s01",
            subjectId = "raz_logico",
            semana = 7,
            subtema = "7.1 Estructura del Condicional: Antecedente, Consecuente y Jerarquía Causal",
            title = "Anatomía del Condicional y Jerarquía Causal",
            theory = LessonTheory(
                id = "th_rl_t07_s01",
                asignatura = "Raz. Lógico",
                semana = 7,
                titulo = "Descomposición Analítica del Enunciado Condicional",
                resumen = "• El Condicional como Operador Direccional Asimétrico:\n  - A diferencia de la conjunción (p ∧ q ≡ q ∧ p) y de la disyunción (p ∨ q ≡ q ∨ p) que son simétricas y conmutativas, el condicional material NO ES CONMUTATIVO: (p -> q) no equivale a (q -> p).\n  - Invertir antecedente y consecuente altera por completo el sentido de la implicación lógica y causal.\n\n• Componentes Estructurales:\n  1. **Antecedente (Prótasis / Causa / Condición Suficiente):**\n     - La proposición subordinada que formula el supuesto o desencadenante.\n  2. **Consecuente (Apódosis / Efecto / Condición Necesaria):**\n     - La proposición principal que enuncia lo que forzosamente se deriva si se satisface el supuesto.\n\n• Formas Típicas de Expresión en Lenguaje Natural:\n  - Directas (Antecedente al inicio): 'Si p, q'; 'Siempre que p, q'; 'En caso de que p, q'; 'p implica q'.\n  - Inversas (Consecuente al inicio): 'q si p'; 'q ya que p'; 'q a condición de que p'; 'q es consecuencia de p'.",
                conceptosClave = listOf(
                    "Asimetría del condicional: No conmutatividad ((p -> q) ≠ (q -> p))",
                    "Prótasis (Antecedente) vs. Apódosis (Consecuente)",
                    "Dirección del flujo de inferencia: De la causa al efecto",
                    "Conectores gramaticales de prótasis: 'si', 'cuando', 'siempre que', 'en tanto'"
                ),
                formulas = listOf(
                    "p \\to q \\not\\equiv q \\to p \\quad (\\text{No Conmutativo})",
                    "p \\to q \\equiv \\neg q \\to \\neg p \\quad (\\text{Contraposición Válida})"
                ),
                formulaName = "Propiedad Asimétrica de la Implicación",
                formulaLatex = "p \\to q \\neq q \\to p \\iff (p \\oplus q) \\land (p \\to q)",
                formulaDescription = "La relación de condicionalidad establece un ordenamiento de orden parcial irreversible.",
                admissionTip = "En las preguntas de condicionales con 'siempre que', lo que viene inmediatamente después de 'siempre que' es el ANTECEDENTE. Ej: 'Cobras tu sueldo siempre que trabajes' -> Trabajas -> Cobras.",
                admissionExplanation = "• No te dejes llevar por el orden en que lees las palabras en la oración; analiza qué hecho activa a cuál."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique cuál de los siguientes enunciados NO es equivalente a los otros cuatro:",
                    options = listOf(
                        "Si el mineral se funde a alta temperatura, se vuelve líquido.",
                        "El mineral se vuelve líquido puesto que se funde a alta temperatura.",
                        "Fundirse a alta temperatura es suficiente para que el mineral se vuelva líquido.",
                        "El mineral se vuelve líquido si y solo si se funde a alta temperatura.",
                        "Que el mineral se funda a alta temperatura implica que se vuelva líquido."
                    ),
                    correctIndex = 3,
                    explanation = "Las opciones 1, 2, 3 y 5 representan todas un condicional unidireccional directo (p -> q). La opción 4 utiliza el nexo bicondicional («si y solo si», p <-> q), que impone una equivalencia en ambos sentidos, siendo conceptualmente distinta a una simple condicional.",
                    subject = "Raz. Lógico",
                    semana = 7
                ),
                Challenge(
                    id = "q_rl_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la proposición: «Un estudiante universitario accede al comedor de la UNSA siempre que se encuentre matriculado en el semestre lectivo vigente», el ANTECEDENTE corresponde a:",
                    options = listOf(
                        "Acceder al comedor de la UNSA.",
                        "Encontrarse matriculado en el semestre lectivo vigente.",
                        "Ser un estudiante universitario.",
                        "Pagar la tarifa de alimentación.",
                        "Aprobar todas las materias del semestre."
                    ),
                    correctIndex = 1,
                    explanation = "La locución 'siempre que' encabeza y determina formalmente al antecedente de la implicación condicional. Por ende, la condición previa desencadenante es 'encontrarse matriculado en el semestre vigente'.",
                    subject = "Raz. Lógico",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rl_t07_s02",
            subjectId = "raz_logico",
            semana = 7,
            subtema = "7.2 Condiciones Lógicas: Condición Suficiente vs. Condición Necesaria en Contexto",
            title = "Condición Suficiente y Necesaria en Contextos Reales",
            theory = LessonTheory(
                id = "th_rl_t07_s02",
                asignatura = "Raz. Lógico",
                semana = 7,
                titulo = "Criterios de Suficiencia y Necesidad en Textos Académicos",
                resumen = "• Análisis Comparativo en Contextos Científicos y Jurídicos:\n  1. **Condición Suficiente (Si A -> B):**\n     - El acontecimiento de A basta plenamente para producir B. Puede haber otras causas que también produzcan B, pero con A ya está garantizado.\n     - Contexto médico: 'Tener una saturación de oxígeno menor a 85% es suficiente para requerir hospitalización'. (Otras condiciones también pueden requerirla, pero esta por sí sola basta).\n  2. **Condición Necesaria (B es necesaria para A -> A -> B):**\n     - Sin B es materialmente imposible que ocurra A. No obstante, que ocurra B no garantiza por sí solo que A suceda.\n     - Contexto biológico: 'La presencia de agua líquida es condición necesaria para la vida celular conocida'. (Sin agua no hay vida; pero tener agua no garantiza que surja vida espontáneamente).\n  3. **Condición Necesaria y Suficiente (A <-> B):**\n     - Caso ideal de reciprocidad unívoca (definiciones matemáticas exactas).\n     - Contexto geométrico: 'Que un triángulo sea equilátero es condición necesaria y suficiente para que sea equiángulo'.",
                conceptosClave = listOf(
                    "Suficiencia: Causa suficiente para activar el efecto",
                    "Necesidad: Requisito indispensable que no garantiza por sí mismo el resultado",
                    "Distinción en medicina, derecho y ciencias de la salud",
                    "Regla de la contrapositiva: Sin la condición necesaria no hay fenómeno (~B -> ~A)"
                ),
                formulas = listOf(
                    "\\text{Suficiente}: A \\implies B",
                    "\\text{Necesario}: \\neg B \\implies \\neg A \\equiv A \\implies B",
                    "\\text{Necesario y Suficiente}: A \\iff B"
                ),
                formulaName = "Matriz de Suficiencia y Necesidad Científica",
                formulaLatex = "\\text{Req. Indispensable}(B, A) \\iff A \\subseteq B",
                formulaDescription = "La clase de eventos A está contenida dentro del conjunto de condiciones necesarias B.",
                admissionTip = "Si te dicen: 'Es indispensable tener pasaporte para viajar a España', pasaporte es condición NECESARIA. Si alguien tiene pasaporte, ¿viaja a España? No necesariamente. Pero si no tiene pasaporte, ¿viaja a España? ¡No, con certeza!",
                admissionExplanation = "• El condicional sólo autoriza deducciones hacia adelante (suficiente activa necesaria) o hacia atrás negando (sin necesaria no hay suficiente)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En biología se enseña que «La presencia de oxígeno molecular es condición necesaria para la respiración celular aeróbica». De acuerdo con esta ley, ¿cuál de las siguientes conclusiones es deductivamente concluyente?",
                    options = listOf(
                        "Si hay oxígeno molecular en un ambiente, obligatoriamente habrá células respirando aeróbicamente.",
                        "Si un cultivo bacteriano no dispone de oxígeno molecular, es imposible que realice respiración aeróbica.",
                        "La respiración aeróbica es suficiente para que se produzca oxígeno molecular.",
                        "Cualquier gas noble puede sustituir al oxígeno en la respiración aeróbica.",
                        "El oxígeno molecular y la respiración aeróbica son términos sinónimos."
                    ),
                    correctIndex = 1,
                    explanation = "Al ser el oxígeno condición necesaria (consecuente: Respiración aeróbica -> Oxígeno), la ley de transposición (~Oxígeno -> ~Respiración aeróbica) garantiza con absoluta certeza deductiva que sin oxígeno es imposible realizar respiración aeróbica.",
                    subject = "Raz. Lógico",
                    semana = 7
                ),
                Challenge(
                    id = "q_rl_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "«Tener un ángulo recto es condición ____________ para que un triángulo sea rectángulo, y es condición ____________ para que una figura geométrica sea un cuadrado». Los términos que completan correctamente el sentido lógico del enunciado son:",
                    options = listOf(
                        "suficiente y necesaria — suficiente",
                        "necesaria y suficiente — necesaria pero no suficiente",
                        "necesaria — suficiente",
                        "contingente — indeterminada",
                        "insuficiente — universal"
                    ),
                    correctIndex = 1,
                    explanation = "Para un triángulo, tener un ángulo recto define de forma biunívoca que sea rectángulo (es necesaria y suficiente). Para un cuadrado, tener un ángulo recto es indispensable (necesaria), pero no basta (no es suficiente), pues requiere además tener 4 lados iguales y 4 ángulos rectos en total.",
                    subject = "Raz. Lógico",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rl_t07_s03",
            subjectId = "raz_logico",
            semana = 7,
            subtema = "7.3 Leyes de Inferencia Válida: Modus Ponens, Modus Tollens y Silogismo Hipotético",
            title = "Deducción Condicional Rigurosa: MPP, MTT, SHP",
            theory = LessonTheory(
                id = "th_rl_t07_s03",
                asignatura = "Raz. Lógico",
                semana = 7,
                titulo = "Cálculo Deductivo con Conectores Condicionales",
                resumen = "• Formalización y Demostración en Cadena:\n  - En problemas avanzados de admisión de la UNSA, se presentan 3 o más premisas condicionales encadenadas donde es necesario combinar MPP, MTT y SHP.\n\n• Reglas Clave y su Notación Formal:\n  1. **Modus Ponendo Ponens (MPP):**\n     p -> q, p ⊢ q.\n  2. **Modus Tollendo Tollens (MTT):**\n     p -> q, ~q ⊢ ~p.\n  3. **Silogismo Hipotético Puro (SHP):**\n     p -> q, q -> r ⊢ p -> r.\n  4. **Ley de Contraposición (Transposición):**\n     p -> q ≡ ~q -> ~p.\n  5. **Silogismo Hipotético Mixto:**\n     p -> q, q -> ~r, r ⊢ ~p.\n     (Se encadenan las implicaciones y se aplica MTT al final).\n\n• Técnica del Encadenamiento Causal:\n  - Cuando tengas varias premisas condicionales, invierte por contraposición las que sean necesarias para que el consecuente de una coincida exactamente con el antecedente de la siguiente.",
                conceptosClave = listOf(
                    "Cadena implicativa: p -> q -> r -> s",
                    "Aplicación combinada de contraposición para alinear términos",
                    "Deducción indirecta mediante contradicción o negación extrema",
                    "Conservación infalible de la verdad a lo largo de la cadena"
                ),
                formulas = listOf(
                    "\\{p \\to q, \\, q \\to r, \\, r \\to s, \\, \\neg s\\} \\vdash \\neg p",
                    "\\{p \\to \\neg q, \\, r \\to q, \\, p\\} \\vdash \\neg r"
                ),
                formulaName = "Teorema del Encadenamiento Deductivo",
                formulaLatex = "\\bigwedge_{i=1}^{n-1} (p_i \\to p_{i+1}) \\vdash (p_1 \\to p_n)",
                formulaDescription = "La transitividad condicional se preserva para cualquier número finito de pasos.",
                admissionTip = "Si tienes premisas como 'p -> q' y 'r -> ~q', contrapon la segunda a 'q -> ~r'. Ahora unes: p -> q -> ~r. Por ende, concluyes de inmediato p -> ~r.",
                admissionExplanation = "• No te estanques: la ley de contraposición es tu mejor aliada para encadenar flechas dispares."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Dadas las premisas:\n1. Si la inflación sube (p), las tasas de interés se elevan (q).\n2. Si las tasas de interés se elevan (q), el crédito hipotecario disminuye (r).\n3. El crédito hipotecario no ha disminuido (~r).\n¿Qué conclusión formalmente válida se deduce de manera concluyente?",
                    options = listOf(
                        "La inflación subió de todos modos.",
                        "Las tasas de interés se mantuvieron estables.",
                        "La inflación no subió (~p).",
                        "El crédito hipotecario se duplicó.",
                        "Las tasas de interés subieron pero la inflación bajó."
                    ),
                    correctIndex = 2,
                    explanation = "Por SHP con premisas 1 y 2: p -> q y q -> r produce p -> r («Si la inflación sube, el crédito disminuye»). Añadiendo la premisa 3 (~r) y aplicando Modus Tollens (MTT): de p -> r y ~r se concluye obligatoriamente ~p («La inflación no subió»).",
                    subject = "Raz. Lógico",
                    semana = 7
                ),
                Challenge(
                    id = "q_rl_t07_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A partir del conjunto de premisas:\nI. p -> ~q\nII. r -> q\nIII. p\nSe deduce formalmente por reglas de inferencia:",
                    options = listOf(
                        "r",
                        "~r",
                        "q",
                        "p ∧ q",
                        "r ∧ p"
                    ),
                    correctIndex = 1,
                    explanation = "1. De I (p -> ~q) y III (p), por Modus Ponens (MPP) se obtiene ~q.\n2. De II (r -> q), aplicando su contrapositiva obtenemos ~q -> ~r.\n3. Aplicando Modus Ponens entre (~q -> ~r) y ~q, se concluye necesariamente ~r.",
                    subject = "Raz. Lógico",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "rl_t07_s04",
            subjectId = "raz_logico",
            semana = 7,
            subtema = "7.4 Falacias Formales Clásicas: Afirmación del Consecuente y Negación del Antecedente",
            title = "Falacias de Afirmación del Consecuente y Negación del Antecedente",
            theory = LessonTheory(
                id = "th_rl_t07_s04",
                asignatura = "Raz. Lógico",
                semana = 7,
                titulo = "Las Dos Grandes Falacias del Razonamiento Condicional",
                resumen = "• 1. Falacia de Afirmación del Consecuente (FAC):\n  - Estructura:\n    * Premisa 1: p -> q (Si estudias a conciencia, apruebas el curso)\n    * Premisa 2: q (Aprobaste el curso)\n    * Conclusión Errónea: ∴ p (Por lo tanto, estudiaste a conciencia - ¡INVÁLIDO!)\n  - Por qué falla: El consecuente q pudo haberse alcanzado por otros caminos (ej. el examen fue regalado, copiaste, etc.). Afirmar el efecto no garantiza qué causa específica lo produjo.\n  - En tabla de verdad: [(p -> q) ∧ q] -> p NO es tautología (da F cuando p=F y q=V).\n\n• 2. Falacia de Negación del Antecedente (FNA):\n  - Estructura:\n    * Premisa 1: p -> q (Si comes veneno, mueres)\n    * Premisa 2: ~p (No comiste veneno)\n    * Conclusión Errónea: ∴ ~q (Por lo tanto, no morirás / eres inmortal - ¡INVÁLIDO!)\n  - Por qué falla: Negar la causa no impide que el efecto ocurra por otras causas (puedes morir por un accidente o vejez).\n  - En tabla de verdad: [(p -> q) ∧ ~p] -> ~q NO es tautología (da F cuando p=F y q=V).",
                conceptosClave = listOf(
                    "FAC: Creer erróneamente que el consecuente implica al antecedente",
                    "FNA: Creer erróneamente que la ausencia de una causa suprime el efecto",
                    "Confusión entre condición suficiente y condición necesaria",
                    "Detección en discursos políticos y argumentos pseudocientíficos"
                ),
                formulas = listOf(
                    "\\text{FAC}: [(p \\to q) \\land q] \\to p \\equiv \\text{Contingente (Falso en } p=F, q=V)",
                    "\\text{FNA}: [(p \\to q) \\land \\neg p] \\to \\neg q \\equiv \\text{Contingente (Falso en } p=F, q=V)"
                ),
                formulaName = "Tabla de Invalidez de Falacias Condicionales",
                formulaLatex = "V(p \\to q) = 1 \\land V(q) = 1 \\not\\implies V(p) = 1",
                formulaDescription = "El valor verdadero del consecuente es compatible tanto con antecedente V como con antecedente F.",
                admissionTip = "Mnemotecnia UNSA: 'Afirmar el final está mal (FAC); negar el principio está mal (FNA)'. Solo es válido afirmar el principio (MPP) o negar el final (MTT).",
                admissionExplanation = "• Cuando una pregunta te pida: '¿Cuál razonamiento es una falacia?', busca inmediatamente estas dos plantillas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Analice el siguiente discurso:\n«Si una persona padece de neumonía bacteriana severa, presenta un cuadro de fiebre alta. Juan no padece de neumonía bacteriana severa; por consiguiente, podemos asegurar que Juan no presenta fiebre alta».\n¿Qué error lógico formal se ha cometido en esta deducción?",
                    options = listOf(
                        "Falacia de afirmación del consecuente.",
                        "Falacia de negación del antecedente.",
                        "Silogismo disyuntivo equívoco.",
                        "Modus Ponens defectuoso.",
                        "Paradoja de Russell."
                    ),
                    correctIndex = 1,
                    explanation = "La estructura es: p -> q (Si tiene neumonía -> fiebre alta). Premisa 2: ~p (No tiene neumonía). Conclusión: ~q (No tiene fiebre alta). Esto constituye formalmente la Falacia de Negación del Antecedente, ya que Juan podría tener fiebre alta por malaria, gripe, infección urinaria o insolación.",
                    subject = "Raz. Lógico",
                    semana = 7
                ),
                Challenge(
                    id = "q_rl_t07_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La invalidez lógica de la falacia de afirmación del consecuente radica fundamentalmente en que:",
                    options = listOf(
                        "Las premisas nunca pueden ser proposiciones científicas verificadas.",
                        "Confunde una condición meramente suficiente con una condición necesaria y recíproca.",
                        "Utiliza el conector de disyunción fuerte en lugar del débil.",
                        "Requiere que el término medio sea una constante matemática.",
                        "La conclusión posee más de tres variables independientes."
                    ),
                    correctIndex = 1,
                    explanation = "La afirmación del consecuente asume erróneamente que porque p es suficiente para q, q a su vez exigiría necesariamente a p, ignorando que el consecuente puede desencadenarse por múltiples causas alternativas.",
                    subject = "Raz. Lógico",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: ORGANIZACIÓN Y ORDEN LÓGICO (SEMANA 8)
        // =========================================================================
        LessonNode(
            id = "rl_t08_s01",
            subjectId = "raz_logico",
            semana = 8,
            subtema = "8.1 Ordenamiento Lineal Horizontal: Posiciones Relativas y Absolutas (Izquierda/Derecha, Oeste/Este)",
            title = "Ordenamiento Lineal Horizontal",
            theory = LessonTheory(
                id = "th_rl_t08_s01",
                asignatura = "Raz. Lógico",
                semana = 8,
                titulo = "Relaciones de Orden Estricto en el Eje Horizontal",
                resumen = "• Fundamentos del Ordenamiento Lineal:\n  - Consiste en ubicar elementos a lo largo de una recta orientada respetando relaciones de orden estricto transitivo asimétrico (A > B, B > C -> A > C).\n\n• Claves Semánticas del Eje Horizontal:\n  1. **Izquierda / Derecha (Perspectiva del Observador):**\n     - Salvo indicación en contrario, 'izquierda' y 'derecha' se asumen desde la perspectiva del lector/postulante que mira de frente la hoja de examen.\n  2. **Puntos Cardinales:**\n     - Oeste = Izquierda / Occidente.\n     - Este = Derecha / Oriente.\n  3. **Adyacencia vs. Posición Relativa:**\n     - 'A está a la izquierda de B': Puede haber una o más personas entre A y B. (No implica que estén pegados).\n     - 'A está JUNTO Y a la izquierda de B' (o adyacente a la izquierda): A está inmediatamente al lado de B, sin nadie intermedio.\n     - 'A está equidistante de B y C': La cantidad de lugares entre A y B es exactamente igual a la cantidad entre A y C.",
                conceptosClave = listOf(
                    "Relación de orden estricto: Irreflexiva, asimétrica y transitiva",
                    "Distinción crítica: 'A la izquierda' vs. 'Junto y a la izquierda'",
                    "Orientación cardinal: Oeste (Occidente) es Izquierda; Este (Oriente) es Derecha",
                    "Construcción progresiva de esquemas con intervalos abiertos y fijos"
                ),
                formulas = listOf(
                    "A < B < C \\implies A < C \\quad (\\text{Transitividad})",
                    "\\text{Junto a la izquierda}: \\text{pos}(A) = \\text{pos}(B) - 1"
                ),
                formulaName = "Propiedad de Orden Total Lineal",
                formulaLatex = "\\forall x, y \\in E, \\, (x < y) \\lor (y < x) \\lor (x = y)",
                formulaDescription = "Tricotomía matemática del ordenamiento lineal sobre un conjunto finito.",
                admissionTip = "En problemas de asientos horizontales, dibuja casilleros vacíos numerados del 1 al N de izquierda a derecha. Empieza ubicando los datos fijos ('en un extremo', 'al centro') antes de los relativos.",
                admissionExplanation = "• No asumas que dos personas están juntas a menos que el texto diga expresamente 'junto a', 'al lado de' o 'adyacente'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cinco amigos (Ana, Beto, Carlos, Diana y Elena) se sientan en una fila de cinco butacas consecutivas en el Teatro Municipal de Arequipa:\n- Carlos se sienta en el extremo izquierdo de la fila.\n- Beto se sienta a la derecha de Diana y a la izquierda de Elena.\n- Ana se sienta junto y a la derecha de Carlos.\n¿Quién ocupa la butaca central (posición 3)?",
                    options = listOf(
                        "Ana",
                        "Beto",
                        "Carlos",
                        "Diana",
                        "Elena"
                    ),
                    correctIndex = 3,
                    explanation = "1. Numeramos del 1 (izq) al 5 (der).\n2. Carlos está en el extremo izquierdo: Posición 1 = Carlos.\n3. Ana está junto y a la derecha de Carlos: Posición 2 = Ana.\n4. Quedan las posiciones 3, 4 y 5 para Beto, Diana y Elena.\n5. El dato indica: Beto está a la derecha de Diana y a la izquierda de Elena -> El orden debe ser Diana, Beto, Elena.\n6. Asignando: Posición 3 = Diana, Posición 4 = Beto, Posición 5 = Elena.\nPor lo tanto, la butaca central la ocupa Diana.",
                    subject = "Raz. Lógico",
                    semana = 8
                ),
                Challenge(
                    id = "q_rl_t08_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una carrera de atletismo de la UNSA, se sabe que:\n- Manuel llegó después de José, pero antes que Raúl.\n- Pedro llegó inmediatamente después de Raúl.\n- Carlos llegó dos puestos antes que Manuel.\n¿Quién ganó la competencia llegando en primer lugar?",
                    options = listOf(
                        "José",
                        "Manuel",
                        "Carlos",
                        "Raúl",
                        "Pedro"
                    ),
                    correctIndex = 2,
                    explanation = "Analicemos las posiciones relativas:\n1. 'Manuel llegó después de José, pero antes que Raúl': José ... Manuel ... Raúl.\n2. 'Pedro inmediatamente después de Raúl': Raúl, Pedro.\n3. 'Carlos llegó dos puestos antes que Manuel': Si Manuel está en la posición p, Carlos está en p - 2. Por tanto, Carlos llegó antes que José y que Manuel.\nOrden de llegada: 1.° Carlos, 2.° José, 3.° Manuel, 4.° Raúl, 5.° Pedro. El ganador fue Carlos.",
                    subject = "Raz. Lógico",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "rl_t08_s02",
            subjectId = "raz_logico",
            semana = 8,
            subtema = "8.2 Ordenamiento Lineal Vertical: Edificios, Estaturas, Jerarquías y Puntajes",
            title = "Ordenamiento Lineal Vertical: Pisos y Jerarquías",
            theory = LessonTheory(
                id = "th_rl_t08_s02",
                asignatura = "Raz. Lógico",
                semana = 8,
                titulo = "Relaciones de Orden en el Eje Vertical (Y)",
                resumen = "• Aplicaciones Típicas del Eje Vertical:\n  - Problemas de personas que viven en pisos numerados de un edificio (piso 1 en la base, piso N en la cúspide).\n  - Comparación de estaturas (más alto que / más bajo que).\n  - Puntajes de exámenes de admisión (mayor puntaje / menor puntaje).\n  - Jerarquías corporativas o militares (rango superior / rango inferior).\n\n• Trampas Semánticas Habituales:\n  1. **'Vive a dos pisos de X':**\n     - Significa una diferencia matemática de 2 pisos (|Piso A - Piso B| = 2). Hay EXACTAMENTE UN PISO intermedio entre ambos.\n  2. **'Vive dos pisos más arriba que X':**\n     - Piso A = Piso B + 2.\n  3. **'Tanto más alto que... como más bajo que...':**\n     - El elemento es el punto medio exacto (promedio) de la diferencia de estaturas.\n  4. **'Pisos adyacentes':**\n     - Pisos contiguos (Piso n y Piso n+1 o n-1).",
                conceptosClave = listOf(
                    "Eje Y: Piso 1 siempre en la base, piso más alto en el tope",
                    "Diferencia de pisos: 'A k pisos de distancia' -> k - 1 pisos de por medio",
                    "Descartes por paridad y límites físicos (piso superior e inferior)",
                    "Ubicación de datos restrictivos absolutos como ancla de inicio"
                ),
                formulas = listOf(
                    "\\text{Distancia vertical} = |y_2 - y_1|",
                    "\\text{Pisos entre } A \\text{ y } B = |y_A - y_B| - 1"
                ),
                formulaName = "Fórmula de Separación en Edificios",
                formulaLatex = "N_{\\text{pisos entre}} = |\\text{Piso}_A - \\text{Piso}_B| - 1",
                formulaDescription = "Cálculo de pisos intermedios entre dos departamentos.",
                admissionTip = "En problemas de edificios de 6 pisos, dibuja una torre vertical con 6 casilleros. Si un dato dice 'vive en un piso par', anota al costado las opciones (2, 4, 6) y descarta según los pisos adyacentes ocupados.",
                admissionExplanation = "• Si el enunciado dice 'vive más arriba que', no significa adyacente a menos que use la palabra 'inmediatamente'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t04_s02_1_b",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cuatro familias (Pérez, Gómez, Quispe y Flores) viven en un edificio de cuatro pisos, una familia por piso:\n- Los Quispe viven más arriba que los Gómez.\n- Los Pérez viven en el último piso.\n- Los Flores viven dos pisos más abajo que los Pérez.\n¿Quiénes viven en el primer piso?",
                    options = listOf(
                        "Los Pérez",
                        "Los Gómez",
                        "Los Quispe",
                        "Los Flores",
                        "No se puede precisar"
                    ),
                    correctIndex = 1,
                    explanation = "1. Piso 4: Los Pérez (último piso).\n2. Los Flores viven dos pisos más abajo que los Pérez: Piso 4 - 2 = Piso 2 (Los Flores).\n3. Quedan libres el Piso 3 y el Piso 1 para Quispe y Gómez.\n4. El dato señala que los Quispe viven más arriba que los Gómez -> Piso 3 = Quispe; Piso 1 = Gómez.\nPor lo tanto, en el primer piso viven los Gómez.",
                    subject = "Raz. Lógico",
                    semana = 8
                ),
                Challenge(
                    id = "q_rl_t04_s02_2_b",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una evaluación de admisión de la UNSA con 5 postulantes (A, B, C, D y E), se sabe que:\n- A obtuvo mayor puntaje que B, pero menor que C.\n- D obtuvo menor puntaje que E, pero mayor que C.\n¿Quién obtuvo el puntaje más alto de todos?",
                    options = listOf(
                        "A",
                        "B",
                        "C",
                        "D",
                        "E"
                    ),
                    correctIndex = 4,
                    explanation = "Ordenemos verticalmente de mayor a menor:\n1. 'A mayor que B, pero menor que C': C > A > B.\n2. 'D menor que E, pero mayor que C': E > D > C.\n3. Concatenando ambas desigualdades por transitividad: E > D > C > A > B.\nEl puntaje más alto de todos le corresponde a E.",
                    subject = "Raz. Lógico",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "rl_t08_s03",
            subjectId = "raz_logico",
            semana = 8,
            subtema = "8.3 Ordenamiento Circular y Distribución Simétrica (Frente a Frente, Lateralidad Relativa)",
            title = "Ordenamiento Circular y Lateralidad Simétrica",
            theory = LessonTheory(
                id = "th_rl_t08_s03",
                asignatura = "Raz. Lógico",
                semana = 8,
                titulo = "Simetría Radial y Lateralidad Relativa",
                resumen = "• Fundamentos del Ordenamiento Circular:\n  - Se ubican personas o elementos simétricamente distribuidos alrededor de una mesa redonda o fogata.\n  - Condición previa: Todos miran hacia el centro de la mesa.\n\n• Conceptos Clave de Geometría Relacional:\n  1. **Frente a Frente (Diametralmente Opuestos):**\n     - Solo existe cuando el número de asientos es PAR (4, 6, 8 asientos).\n     - Si hay 6 asientos simétricos, la persona sentada al frente dista exactamente 3 asientos (la mitad del total: N/2).\n     - En una mesa de número impar (ej. 5 o 7 asientos), NINGUNA persona se sienta diametralmente al frente de otra.\n  2. **Lateralidad Relativa (Derecha e Izquierda):**\n     - Como la persona mira HACIA EL CENTRO, su brazo derecho e izquierdo se invierten respecto a la perspectiva del observador externo.\n     - Para no equivocarte: Sitúate mentalmente en la posición del personaje mirando al centro.\n  3. **'A la derecha de X' vs. 'Junto y a la derecha de X':**\n     - En una mesa de 6 asientos, 'a la derecha de X' abarca hasta dos asientos; 'junto y a la derecha' es estrictamente el asiento contiguo.",
                conceptosClave = listOf(
                    "Todos miran hacia el centro: Inversión de lateralidad izquierda/derecha",
                    "Oposición diametral: Exclusiva de mesas con número par de asientos (N/2)",
                    "Sentido horario (hacia la izquierda de quien mira al centro)",
                    "Sentido antihorario (hacia la derecha de quien mira al centro)"
                ),
                formulas = listOf(
                    "\\text{Asiento opuesto} = (\\text{pos} + N/2) \\pmod N",
                    "\\text{Mesa simétrica impar} \\implies \\text{No existen diametralmente opuestos}"
                ),
                formulaName = "Ley de Distribución Circular Simétrica",
                formulaLatex = "\\theta = \\frac{360^\\circ}{N} \\quad (\\text{Ángulo entre asientos adyacentes})",
                formulaDescription = "Separación angular constante entre participantes simétricos.",
                admissionTip = "El truco para no equivocarse con la derecha y la izquierda en una mesa circular es girar tu hoja de examen para que el personaje que analizas quede en la parte inferior, mirando hacia arriba. ¡Su derecha será tu misma derecha!",
                admissionExplanation = "• Si el número de asientos es mayor que el número de personas, hay 'asientos vacíos' que deben ser contados al evaluar 'junto a'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Seis amigos (Alex, Boris, César, David, Elmer y Franco) se sientan simétricamente alrededor de una mesa circular con seis asientos:\n- Alex se sienta frente a David.\n- César se sienta junto y a la derecha de Alex.\n- Boris se sienta frente a César.\n- Elmer no está sentado junto a David.\n¿Quién se sienta junto y a la izquierda de Alex?",
                    options = listOf(
                        "Boris",
                        "David",
                        "Elmer",
                        "Franco",
                        "César"
                    ),
                    correctIndex = 2,
                    explanation = "1. Coloquemos a Alex en la posición inferior (posición 1, 'sur'), mirando al centro (hacia el norte).\n2. David está frente a Alex -> Posición 4 ('norte').\n3. César está junto y a la derecha de Alex -> La derecha de Alex (mirando al norte) es el este: Posición 2 = César.\n4. Boris está frente a César -> Posición 5 = Boris.\n5. Quedan las posiciones 3 y 6 para Elmer y Franco. Los vecinos de David (pos 4) son los asientos 3 y 5. Como Elmer no está junto a David, no puede estar en la 3 -> Elmer está en la posición 6.\n6. Por descarte, Franco está en la posición 3.\n7. La posición 6 es contigua a Alex por su izquierda. Por lo tanto, quien está junto y a la izquierda de Alex es Elmer.",
                    subject = "Raz. Lógico",
                    semana = 8
                ),
                Challenge(
                    id = "q_rl_t08_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si cinco personas se sientan en una mesa circular simétrica de cinco asientos, ¿cuántas parejas de personas se encuentran sentadas exactamente 'frente a frente' (diametralmente opuestas)?",
                    options = listOf(
                        "Dos parejas",
                        "Una pareja",
                        "Ninguna pareja, porque el número de asientos es impar",
                        "Cinco parejas",
                        "Depende de la estatura de los participantes"
                    ),
                    correctIndex = 2,
                    explanation = "La oposición diametral frontal exacta exige que el ángulo sea de 180°, lo cual solo es geométricamente posible cuando el número de divisiones es par (360° / N con N par). En una mesa de 5 asientos (impar), frente a cada persona hay siempre un espacio entre dos asientos, nunca una persona diametralmente opuesta.",
                    subject = "Raz. Lógico",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "rl_t08_s04",
            subjectId = "raz_logico",
            semana = 8,
            subtema = "8.4 Cuadro de Decisiones: Matrices Lógicas de Doble Entrada y Tablas de Descarte Cruzado",
            title = "Cuadro de Decisiones y Correspondencia Biunívoca",
            theory = LessonTheory(
                id = "th_rl_t08_s04",
                asignatura = "Raz. Lógico",
                semana = 8,
                titulo = "Matrices Lógicas de Doble Entrada",
                resumen = "• Naturaleza del Cuadro de Decisiones:\n  - Se presentan dos o más conjuntos disjuntos de elementos (ej. personas, profesiones, ciudades natales, deportes favoritos) que deben relacionarse biunívocamente (a cada persona le corresponde exactamente una profesión y viceversa).\n\n• Metodología de la Matriz de Doble Entrada:\n  1. Se construye una cuadrícula con las personas en las filas y los atributos en las columnas.\n  2. **Regla del Aserto Positivo (✓):**\n     - Cuando un dato afirma con certeza una relación (ej. 'Luis es médico'), se coloca un visto bueno (✓) en esa casilla.\n     - ¡Regla Automática de Descarte Cruzado!: Se completan con cruces (X) TODAS las demás casillas de esa misma fila y de esa misma columna.\n  3. **Regla del Aserto Negativo (X):**\n     - Cuando un dato descarta una relación (ej. 'Mario no vive en Camaná'), se coloca una X en esa casilla.\n  4. **Principio de Casilla Única:**\n     - Si en una fila o columna todas las casillas menos una tienen X, la restante obligatoriamente debe ser ✓.\n\n• Tablas Cortas para Tres o Más Categorías:\n  - Cuando hay 3 o 4 categorías simultáneas, se utilizan tablas de correspondencia vertical con encabezados fijos.",
                conceptosClave = listOf(
                    "Correspondencia biunívoca: Una sola asignación por categoría",
                    "Descarte cruzado: Un '✓' anula su fila y su columna con 'X'",
                    "Deducción por residuo de casillas vacías",
                    "Tablas combinadas multivariable"
                ),
                formulas = listOf(
                    "\\text{Casilla}(i, j) = \\checkmark \\implies \\forall k \\neq j, \\, C(i, k) = \\times \\land \\forall m \\neq i, \\, C(m, j) = \\times",
                    "\\sum_{j=1}^n \\text{Checks en fila } i = 1"
                ),
                formulaName = "Axioma de Correspondencia Biunívoca",
                formulaLatex = "f: A \\to B \\quad (\\text{Biyectiva: Inyectiva } \\land \\text{ Sobreyectiva})",
                formulaDescription = "Matriz de permutación booleana con exactamente un 1 por fila y columna.",
                admissionTip = "Apenas coloques un visto bueno (✓), tacha de inmediato toda la fila y toda la columna con X. Es el paso mecánico más seguro para que la solución aparezca sola.",
                admissionExplanation = "• Cuando el problema dice 'El médico y Carlos fueron al cine con el que vive en Mollendo', deduces 3 cosas: Carlos no es médico, Carlos no vive en Mollendo, y el médico no vive en Mollendo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Tres amigos (Mario, Juan y Pedro) tienen profesiones distintas: Ingeniero, Abogado y Médico, no necesariamente en ese orden. Se sabe que:\n- El médico es el mejor amigo de Juan y es el más joven de los tres.\n- Pedro es el abogado de la empresa donde trabaja Mario.\n¿Qué profesión tiene Mario?",
                    options = listOf(
                        "Médico",
                        "Abogado",
                        "Ingeniero",
                        "Docente",
                        "No se puede deducir"
                    ),
                    correctIndex = 0,
                    explanation = "1. 'El médico es amigo de Juan' -> Juan NO es el médico.\n2. 'Pedro es el abogado' -> Pedro es Abogado (✓). Por descarte cruzado, Pedro no es médico ni ingeniero; y ni Mario ni Juan son abogados.\n3. Sabemos que el abogado es Pedro. Las opciones para Médico e Ingeniero son Mario y Juan.\n4. Pero Juan no puede ser el médico (dato 1). Por lo tanto, el Médico debe ser MARIO.\n5. Por descarte, Juan es el Ingeniero. Conclusión: Mario es el Médico.",
                    subject = "Raz. Lógico",
                    semana = 8
                ),
                Challenge(
                    id = "q_rl_t08_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Al resolver un cuadro de decisiones entre cuatro personas y cuatro distritos de residencia, si en una fila de cuatro columnas ya se han marcado tres casillas con 'X' por descarte de condiciones, la cuarta casilla restante debe completarse formalmente con:",
                    options = listOf(
                        "Otra 'X', declarando el problema como inconsistente.",
                        "Un '✓' (afirmación), ya que cada persona debe residir obligatoriamente en un distrito.",
                        "Una incógnita '?' pendiente de nuevos datos.",
                        "Un condicional hipotético.",
                        "Una barra de Sheffer."
                    ),
                    correctIndex = 1,
                    explanation = "Bajo el principio de correspondencia biunívoca, cada sujeto posee exactamente un atributo del conjunto disjunto. Si tres distritos han sido descartados para esa persona, el cuarto distrito restante es obligatoriamente el lugar de residencia verdadero (✓).",
                    subject = "Raz. Lógico",
                    semana = 8
                )
            )
        ),

        // =========================================================================
        // TEMA 09: DETECCIÓN DE FALACIAS SIMPLES (SEMANA 9)
        // =========================================================================
        LessonNode(
            id = "rl_t09_s01",
            subjectId = "raz_logico",
            semana = 9,
            subtema = "9.1 Concepto de Falacia: Sofismas vs. Paralogismos y Falacias Formales vs. No Formales",
            title = "Teoría General de las Falacias: Sofismas y Paralogismos",
            theory = LessonTheory(
                id = "th_rl_t09_s01",
                asignatura = "Raz. Lógico",
                semana = 9,
                titulo = "Fundamentos Epistemológicos de las Falacias",
                resumen = "• Definición Rigurosa de Falacia:\n  - Un razonamiento o argumento que parece lógicamente correcto y persuasivo a nivel psicológico, pero que analizado rigurosamente resulta formal o materialmente inválido o falso.\n\n• Sofisma vs. Paralogismo (Intencionalidad del Emisor):\n  1. **Sofisma:** Razonamiento falaz elaborado con PLENA CONCIENCIA E INTENCIÓN DELIBERADA DE ENGAÑAR, manipular o confundir al interlocutor (práctica atribuida críticamente a ciertos sofistas en la Grecia clásica).\n  2. **Paralogismo:** Razonamiento falaz emitido de FORMA INVOLUNTARIA, por torpeza metodológica, descuido argumentativo o desconocimiento de las leyes lógicas, sin dolo de engaño.\n\n• Clasificación Universal de las Falacias:\n  1. **Falacias Formales:** Violan una ley del cálculo lógico sintáctico (ej. Afirmación del Consecuente, Negación del Antecedente, Término Medio no Distribuido).\n  2. **Falacias No Formales (Materiales):** Errores en el contenido empírico, en la ambigüedad del lenguaje ordinario o en la impertinencia de las premisas respecto a la conclusión. Se subdividen en:\n     - Falacias de Atingencia (o Inatingencia).\n     - Falacias de Ambigüedad.",
                conceptosClave = listOf(
                    "Falacia: Argumento que parece válido pero no lo es",
                    "Sofisma: Con intención dolosa de engañar",
                    "Paralogismo: Error involuntario sin dolo",
                    "Falacias formales (sintaxis) vs. No formales (semántica y pragmática)"
                ),
                formulas = listOf(
                    "\\text{Falacia} = \\text{Persuasión Psicológica} - \\text{Validez Lógica}",
                    "\\text{Sofisma} = \\text{Falacia} + \\text{Intención de Engaño}",
                    "\\text{Paralogismo} = \\text{Falacia} + \\text{Error Involuntario}"
                ),
                formulaName = "Ecuación de la Falacia Dialéctica",
                formulaLatex = "\\text{Argumento Falaz} \\implies P_1, \\dots, P_n \\not\\models C \\quad (\\text{Invalidez estructural o material})",
                formulaDescription = "Ausencia de consecuencia lógica formal o fáctica entre premisas y aserto final.",
                admissionTip = "Pregunta clásica en el examen UNSA: 'Si una persona emite un argumento falso sin intención de engañar por un error en su razonamiento, comete un...'. Respuesta: PARALOGISMO.",
                admissionExplanation = "• Si el emisor conoce la trampa y la usa a propósito para estafar o ganar votos, comete un SOFISMA."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante un debate académico, un estudiante utiliza una deducción errónea creyendo firmemente que su razonamiento era matemáticamente impecable, sin tener en ningún momento la intención deliberada de engañar al auditorio. En la teoría lógica, este razonamiento clasifica formalmente como un:",
                    options = listOf(
                        "Sofisma",
                        "Paralogismo",
                        "Silogismo categórico válido",
                        "Axioma indemostrable",
                        "Dilema constructivo"
                    ),
                    correctIndex = 1,
                    explanation = "Un paralogismo es un razonamiento incorrecto formulado de buena fe, de manera involuntaria y sin la intención de inducir al error al receptor. Si hubiese existido la intención dolosa de engaño, clasificaría como sofisma.",
                    subject = "Raz. Lógico",
                    semana = 9
                ),
                Challenge(
                    id = "q_rl_t09_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La distinción primordial entre una falacia formal y una falacia no formal reside en que:",
                    options = listOf(
                        "Las formales ocurren en conversaciones cotidianas y las no formales en debates parlamentarios.",
                        "Las falacias formales infringen directamente las reglas sintácticas del cálculo lógico proposicional o silogístico, mientras que las no formales radican en problemas de ambigüedad lingüística o falta de pertinencia temática de las premisas.",
                        "Las falacias formales siempre son verdaderas.",
                        "Las falacias no formales solo se escriben en latín.",
                        "No existe diferencia epistemológica entre ambas."
                    ),
                    correctIndex = 1,
                    explanation = "Las falacias formales son errores en la estructura sintáctica abstracta de la deducción; las falacias no formales son vicios de contenido semántico, retórico, pragmático o de ambigüedad en el lenguaje natural.",
                    subject = "Raz. Lógico",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "rl_t09_s02",
            subjectId = "raz_logico",
            semana = 9,
            subtema = "9.2 Falacias de Atingencia 1: Ad Hominem, Ad Baculum, Ad Populum y Ad Verecundiam",
            title = "Falacias de Atingencia I: Desvío Argumentativo",
            theory = LessonTheory(
                id = "th_rl_t09_s02",
                asignatura = "Raz. Lógico",
                semana = 9,
                titulo = "Falacias de Pertinencia e Intimidación",
                resumen = "• Falacias de Atingencia (o Falta de Pertinencia):\n  - Las premisas carecen de conexión lógica con la conclusión; no prueban la tesis, pero buscan persuadir apelando a las emociones o al chantaje.\n\n• Principales Tipos Evaluados:\n  1. **Argumentum ad Hominem (Ataque a la Persona):**\n     - Se descalifica o refuta una afirmación atacando a quien la emite (sus defectos, su ideología, su vida privada) en lugar de evaluar sus argumentos objetivos.\n     - Subtipo circunstancial: 'No le crean lo que dice sobre el presupuesto, pues él pertenece al partido opositor'.\n  2. **Argumentum ad Baculum (Apelación a la Fuerza o a la Amenaza):**\n     - Se impone una conclusión apelando a la coacción, al miedo, a la amenaza velada o al poder económico/institucional.\n     - Ejemplo: 'El informe ambiental debe ser aprobado sin observaciones; recuerden que nuestra empresa financia sus proyectos de investigación'.\n  3. **Argumentum ad Populum (Apelación a la Multitud o al Sentimiento Popular):**\n     - Sostiene que una tesis es correcta porque la mayoría de personas la practica, o apela a pasiones patrióticas/grupales.\n     - Ejemplo: 'Este producto farmacéutico es excelente porque millones de peruanos lo compran a diario'.\n  4. **Argumentum ad Verecundiam (Apelación a la Autoridad Inadecuada):**\n     - Se cita la opinión de un personaje célebre o respetado en un área totalmente ajena al tema en discusión.\n     - Ejemplo: 'Esta pasta dental es la mejor del mercado porque lo afirma un famoso futbolista de la selección'.",
                conceptosClave = listOf(
                    "Ad Hominem: Descalificar el argumento atacando al emisor",
                    "Ad Baculum: Reemplazar la razón por la amenaza de la fuerza",
                    "Ad Populum: Justificar una tesis en la masa o en las emociones colectivas",
                    "Ad Verecundiam: Citar autoridades de áreas no competentes"
                ),
                formulas = listOf(
                    "\\text{Ad Hominem}: \\text{Atacar}(X) \\not\\models \\neg \\text{Tesis}(X)",
                    "\\text{Ad Baculum}: \\text{Amenaza}(X) \\not\\models \\text{Validez}(\\text{Tesis})"
                ),
                formulaName = "Catálogo de Falacias de Inatingencia",
                formulaLatex = "\\text{Premisas}(\\text{Emocionales}) \\centernot\\implies \\text{Conclusión}(\\text{Fáctica})",
                formulaDescription = "Desconexión veritativa entre el recurso persuasivo y la tesis evaluada.",
                admissionTip = "Si el argumento busca que alguien acepte algo 'para evitar ser despedido o sancionado', es AD BACULUM. Si apela a 'lo que la gran mayoría prefiere', es AD POPULUM.",
                admissionExplanation = "• Ojo con el Ad Hominem: no es un simple insulto; es utilizar ese insulto para pretender invalidar la verdad de un aserto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En una sesión municipal, un regidor afirma: «La propuesta del arquitecto sobre la remodelación de las pistas del centro histórico de Arequipa debe ser descartada de plano, pues todos sabemos que él fue sancionado disciplinariamente por llegar tarde en su anterior empleo». ¿Qué falacia de atingencia se comete?",
                    options = listOf(
                        "Argumentum ad baculum",
                        "Argumentum ad hominem",
                        "Argumentum ad verecundiam",
                        "Argumentum ad ignorantiam",
                        "Falacia de falsa causa"
                    ),
                    correctIndex = 1,
                    explanation = "El regidor comete la falacia Argumentum ad Hominem: descalifica la validez técnica de la propuesta urbanística atacando la conducta o antecedentes personales del arquitecto en lugar de refutar los méritos de su diseño.",
                    subject = "Raz. Lógico",
                    semana = 9
                ),
                Challenge(
                    id = "q_rl_t09_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El siguiente argumento publicitario: «Consuma siempre gaseosa Sabor Andino, la preferida por nueve de cada diez familias peruanas», constituye un ejemplo típico de:",
                    options = listOf(
                        "Argumentum ad populum",
                        "Argumentum ad baculum",
                        "Argumentum ad ignorantiam",
                        "Equívoco",
                        "Petición de principio"
                    ),
                    correctIndex = 0,
                    explanation = "Es un Argumentum ad Populum: busca convencer al consumidor apelando a la supuesta preferencia mayoritaria de la multitud en lugar de presentar pruebas científicas o nutricionales sobre la calidad del producto.",
                    subject = "Raz. Lógico",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "rl_t09_s03",
            subjectId = "raz_logico",
            semana = 9,
            subtema = "9.3 Falacias de Atingencia 2: Causa Falsa (Post Hoc), Generalización Indebida y Ad Ignorantiam",
            title = "Causa Falsa, Generalización Indebida y Ad Ignorantiam",
            theory = LessonTheory(
                id = "th_rl_t09_s03",
                asignatura = "Raz. Lógico",
                semana = 9,
                titulo = "Errores Empíricos e Inductivos Comunes",
                resumen = "• 1. Falacia de Causa Falsa (*Post hoc ergo propter hoc* / *Non causa pro causa*):\n  - Confundir una mera coincidencia temporal o correlación estadística con una genuina relación causal física o necesaria.\n  - Post hoc: 'A ocurrió antes que B, por lo tanto A es la causa de B'.\n  - Ejemplo clásico: 'Ayer cantó el gallo a las 5:00 a. m. y luego salió el Sol; por tanto, el canto del gallo hace que amanezca' o supersticiones populares (romper un espejo y tener mala suerte).\n\n• 2. Generalización Indebida o Apurada (*Secundum Quid*):\n  - Extraer una conclusión universal o norma general a partir de una muestra ínfima, insuficiente o no representativa.\n  - Ejemplo: 'Fui a una ciudad y dos taxistas me cobraron de más; en consecuencia, absolutamente todos los habitantes de esa ciudad son deshonestos'.\n\n• 3. Argumentum ad Ignorantiam (Apelación a la Ignorancia):\n  - Sostener que una afirmación es verdadera simplemente porque nadie ha podido demostrar que sea falsa; o que es falsa porque nadie ha podido demostrar que sea verdadera.\n  - Ejemplo: 'Los extraterrestres pilotan naves invisibles sobre el volcán Misti, porque ningún científico ha logrado demostrar con pruebas concluyentes que no estén allí'.",
                conceptosClave = listOf(
                    "Post hoc: Confundir sucesión temporal con causalidad necesaria",
                    "Secundum quid: Generalizar a partir de casos aislados o muestra insuficiente",
                    "Ad Ignorantiam: Proclamar verdad o falsedad escudándose en la falta de pruebas",
                    "Excepción del principio de presunción de inocencia en derecho"
                ),
                formulas = listOf(
                    "\\text{Post Hoc}: (t_A < t_B) \\not\\implies (A \\to B)",
                    "\\text{Ad Ignorantiam}: \\neg \\text{Demostrado}(P) \\not\\implies \\neg P"
                ),
                formulaName = "Correlación no implica Causalidad",
                formulaLatex = "\\text{Corr}(X, Y) \\neq 0 \\centernot\\implies X \\xrightarrow{\\text{causa}} Y",
                formulaDescription = "Principio científico supremo contra la falacia de causa falsa.",
                admissionTip = "¡Ojo al dato jurídico! En Derecho Penal, considerar inocente a un acusado porque 'no se probó su culpabilidad' NO es falacia ad ignorantiam; es la aplicación legal del principio constitucional de presunción de inocencia.",
                admissionExplanation = "• Salvo en el fuero penal garantista, en ciencias e investigación la ausencia de prueba no constituye prueba de ausencia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "«Un postulante a la UNSA usó un bolígrafo de color verde durante el simulacro y obtuvo el máximo puntaje. Convencido de su eficacia, afirma que aprobará el examen de admisión ordinario siempre que utilice ese mismo bolígrafo verde». ¿En qué falacia incurre este estudiante?",
                    options = listOf(
                        "Argumentum ad hominem",
                        "Falacia de Causa Falsa (Post hoc ergo propter hoc)",
                        "Argumentum ad ignorantiam",
                        "Falacia de anfibología",
                        "Argumentum ad populum"
                    ),
                    correctIndex = 1,
                    explanation = "Incurre en la falacia de Causa Falsa (Post hoc ergo propter hoc): atribuye erróneamente su éxito académico (efecto) a la mera coincidencia temporal de usar un bolígrafo de determinado color, sin que exista un vínculo causal real entre ambos hechos.",
                    subject = "Raz. Lógico",
                    semana = 9
                ),
                Challenge(
                    id = "q_rl_t09_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique cuál de los siguientes argumentos comete la falacia ARGUMENTUM AD IGNORANTIAM:",
                    options = listOf(
                        "No debes criticar la comida del restaurante porque el chef es un pariente del director.",
                        "Debemos suponer que existen civilizaciones submarinas inteligentes en el océano, dado que la ciencia marina aún no ha explorado el 100% del fondo marino y nadie ha probado que no existan.",
                        "O estudias medicina en la UNSA o no serás un profesional respetable.",
                        "Todos los arequipeños son poetas porque Mariano Melgar fue un gran poeta arequipeño.",
                        "Si el agua se calienta, se evapora; no se evaporó, luego no se calentó."
                    ),
                    correctIndex = 1,
                    explanation = "La afirmación sobre las civilizaciones submarinas es un clásico Argumentum ad Ignorantiam: pretende validar una hipótesis no confirmada amparándose únicamente en la incapacidad actual de refutarla empíricamente.",
                    subject = "Raz. Lógico",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "rl_t09_s04",
            subjectId = "raz_logico",
            semana = 9,
            subtema = "9.4 Falacias de Ambigüedad: El Equívoco, la Anfibología, Énfasis y Composición/División",
            title = "Falacias de Ambigüedad Lingüística",
            theory = LessonTheory(
                id = "th_rl_t09_s04",
                asignatura = "Raz. Lógico",
                semana = 9,
                titulo = "Trampas Léxicas y Sintácticas en la Argumentación",
                resumen = "• Falacias de Ambigüedad (o de Claridad):\n  - Ocurren cuando en el curso de un razonamiento se introducen palabras o frases polisémicas cuyos significados se desplazan o cambian sutilmente, viciando la conclusión.\n\n• Clasificación de Falacias de Ambigüedad:\n  1. **El Equívoco (Polisemia Léxica):**\n     - Se utiliza una misma palabra con dos sentidos totalmente distintos a lo largo de las premisas.\n     - Ejemplo: 'El fin de una cosa es su perfección (sentido teleológico: meta/propósito). La muerte es el fin de la vida (sentido cronológico: término). Por lo tanto, la muerte es la perfección de la vida'.\n  2. **La Anfibología (Ambigüedad Sintáctica):**\n     - Se origina por una defectuosa o descuidada construcción gramatical que permite dos o más interpretaciones del texto.\n     - Ejemplo: 'El perro de mi vecino mordió al cartero y fue llevado al veterinario'. (¿Quién fue al veterinario? ¿El perro o el cartero?).\n  3. **Falacia de Composición:**\n     - Atribuir erróneamente al TODO una propiedad que solo le pertenece a las PARTES individuales.\n     - Ejemplo: 'Cada pieza de esta maquinaria es sumamente ligera; por lo tanto, la maquinaria armada en su totalidad es sumamente ligera'.\n  4. **Falacia de División:**\n     - Es la inversa de la composición: Atribuir a cada una de las PARTES individuales una propiedad que solo le corresponde al TODO.\n     - Ejemplo: 'La Universidad Nacional de San Agustín tiene casi dos siglos de antigüedad; por consiguiente, cada profesor que enseña en ella tiene casi dos siglos de antigüedad'.",
                conceptosClave = listOf(
                    "Equívoco: Doble significado de una palabra en el mismo razonamiento",
                    "Anfibología: Ambigüedad por sintaxis defectuosa o mala puntuación",
                    "Composición: Transferir falsamente propiedades de las partes al todo",
                    "División: Transferir falsamente propiedades del todo a las partes individuales"
                ),
                formulas = listOf(
                    "\\text{Composición}: \\forall x \\in C, \\, P(x) \\not\\implies P(C)",
                    "\\text{División}: P(C) \\not\\implies \\forall x \\in C, \\, P(x)",
                    "\\text{Equívoco}: W_1 \\neq W_2 \\quad (\\text{Falsa identidad léxica})"
                ),
                formulaName = "Fórmula de No Transferencia Mereológica",
                formulaLatex = "P(\\text{Parte}_i) \\centernot\\iff P(\\text{Sistema Total})",
                formulaDescription = "Las propiedades emergentes de un sistema no son reducibles directamente a sus componentes.",
                admissionTip = "Si el argumento pasa de las 'piezas' o 'jugadores' al 'equipo completo' o 'máquina entera', es COMPOSICIÓN. Si pasa del 'equipo' o 'institución' a 'un solo miembro', es DIVISIÓN.",
                admissionExplanation = "• Recuerda: 'Un equipo de estrellas de fútbol no garantiza un equipo estrella'. Eso ilustra la falacia de composición."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_rl_t09_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "«Cada uno de los músicos que integra la Orquesta Sinfónica de Arequipa es un virtuoso extraordinario en su instrumento; por lo tanto, la orquesta en su conjunto brindará una interpretación colectiva insuperable y perfecta». ¿En qué falacia de ambigüedad incurre este aserto?",
                    options = listOf(
                        "Falacia de división",
                        "Falacia de composición",
                        "Falacia de equívoco",
                        "Anfibología",
                        "Argumentum ad hominem"
                    ),
                    correctIndex = 1,
                    explanation = "Comete la Falacia de Composición: atribuye al todo colectivo (la orquesta) una propiedad que solo se ha comprobado en sus partes componentes individuales (los músicos virtuosos), ignorando que la calidad colectiva depende del ensamble, la dirección y la coordinación grupal.",
                    subject = "Raz. Lógico",
                    semana = 9
                ),
                Challenge(
                    id = "q_rl_t09_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El razonamiento: «La UNSA es una institución universitaria prestigiosa y centenaria. Carlos es alumno ingresante a la UNSA; en consecuencia, Carlos es una persona prestigiosa y centenaria», ejemplifica de forma evidente la falacia de:",
                    options = listOf(
                        "Composición",
                        "División",
                        "Equívoco",
                        "Causa falsa",
                        "Ad populum"
                    ),
                    correctIndex = 1,
                    explanation = "Es una Falacia de División: traslada indebidamente los atributos globales del todo institucional (ser centenaria y prestigiosa) a un elemento individual particular (un alumno ingresante), lo cual resulta lógicamente absurdo.",
                    subject = "Raz. Lógico",
                    semana = 9
                )
            )
        )
    )
}
