package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object FilosofiaCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: NOCIONES PRELIMINARES DE FILOSOFÍA (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "fil_t01_s01",
            subjectId = "filosofia",
            semana = 1,
            subtema = "1.1 Etimología, Pitágoras y el Asombro (Thauma)",
            title = "Etimología del Amor a la Sabiduría y el Asombro Originario",
            theory = LessonTheory(
                id = "th_fil_t01_s01",
                asignatura = "Filosofía",
                semana = 1,
                titulo = "Etimología y Origen Vivencial del Filosofar",
                resumen = "• Etimología:\n  - Proviene de las voces griegas philos (amante, buscador apasionado) y sophia (sabiduría suprema).\n  - Literalmente significa: 'Amor a la sabiduría'.\n\n• La Tradición Pitagórica:\n  - Según Cicerón y Heráclides Póntico, fue Pitágoras de Samos (siglo VI a.C.) quien acuñó el término al afirmar que él no era un sabio (sophos), pues la sabiduría absoluta solo pertenece a los dioses, sino un amante de la sabiduría (philosophos).\n  - Comparó la existencia con los juegos olímpicos: unos van por gloria, otros por negocio, y los mejores van como espectadores desinteresados a contemplar la verdad.\n\n• El Asombro (Thauma) como Motor Vivencial:\n  - Platón (Teeteto) y Aristóteles (Metafísica) coinciden en que la chispa originaria del filosofar es el asombro o admiración (thauma) ante lo desconocido y ante la regularidad del cosmos.",
                conceptosClave = listOf(
                    "Etimología: Philos (amante) + Sophia (sabiduría)",
                    "Pitágoras de Samos: Primer pensador en autodenominarse 'philosophos'",
                    "El asombro (thauma): Origen vivencial del filosofar según Platón y Aristóteles",
                    "Contemplación desinteresada de la verdad"
                ),
                formulas = listOf("\\text{Filosofía} = \\text{Philos (Búsqueda)} + \\text{Sophia (Sabiduría)}"),
                formulaName = "Fórmula Etimológica Pitagórica",
                formulaLatex = "\\text{Actitud Filosófica} = \\text{Reconocimiento de la Ignorancia} + \\text{Asombro (Thauma)}",
                formulaDescription = "Reconocimiento socrático de los límites del saber como punto de partida de la búsqueda.",
                admissionTip = "Para Aristóteles y Platón, la experiencia subjetiva que da origen al filosofar es el ASOMBRO o ADMIRACIÓN (thauma).",
                admissionExplanation = "• Pitágoras rechazó el título de sabio divino; el filósofo es un constante e incansable buscador de la verdad."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el testimonio histórico transmitido por Cicerón, ¿qué pensador empleó por primera vez el vocablo 'filósofo'?",
                    options = listOf("Tales de Mileto", "Sócrates", "Pitágoras de Samos", "Parménides de Elea", "Heráclito"),
                    correctIndex = 2,
                    explanation = "Fue Pitágoras de Samos quien utilizó por vez primera la voz 'filósofo' al definirse como un amante de la sabiduría.",
                    subject = "Filosofía",
                    semana = 1
                ),
                Challenge(
                    id = "q_fil_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la 'Metafísica' de Aristóteles se señala que el ser humano comenzó a filosofar movido fundamentalmente por:",
                    options = listOf("La necesidad material", "El temor divino", "El asombro o admiración ante lo desconocido", "El poder político", "La angustia existencial"),
                    correctIndex = 2,
                    explanation = "Aristóteles postula célebremente que la admiración o asombro (thauma) es el origen vivencial primero del filosofar.",
                    subject = "Filosofía",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "fil_t01_s02",
            subjectId = "filosofia",
            semana = 1,
            subtema = "1.2 El Paso del Mito al Logos en Mileto y Condiciones de la Polis",
            title = "El Origen Histórico: Del Mito al Logos y el Milagro Griego",
            theory = LessonTheory(
                id = "th_fil_t01_s02",
                asignatura = "Filosofía",
                semana = 1,
                titulo = "El Nacimiento Histórico de la Filosofía",
                resumen = "• Momento y Lugar de Nacimiento:\n  La filosofía occidental nació en el siglo VI a.C. en las colonias griegas de Jonia (Asia Menor), específicamente en Mileto con Tales.\n\n• El Tránsito del Mito al Logos:\n  - Mito (Mythos): Explicación antropomórfica, fantástica y poética que atribuía el orden del universo a caprichos sobrenaturales de divinidades (Homero, Hesíodo).\n  - Logos: Discurso racional, argumentativo, causal y demostrativo que busca el principio natural (arjé) intrínseco de las cosas mediante la razón.\n\n• Condiciones Históricas:\n  1. Geográfica y Comercial: Ciudades puerto cosmopolitas con intenso comercio que confrontaron diversas mitologías relativizando dogmas.\n  2. Religiosa: Ausencia de una casta sacerdotal teocrática dogmática y de libros sagrados incuestionables.\n  3. Política: Nacimiento de la Polis y la democracia incipiente; igualdad ante la ley (isonomía) y debate público.\n  4. Socioeconómica (Ocio creador - Scholé): Tiempo libre para la contemplación teórica desinteresada.",
                conceptosClave = listOf(
                    "Origen histórico: Siglo VI a.C. en Mileto (Jonia, Asia Menor) con Tales",
                    "Paso del Mito (fantasía/dioses) al Logos (razón/causalidad natural)",
                    "Condiciones: Comercio cosmopolita, ausencia de casta sacerdotal dogmática",
                    "Scholé (ocio creador): Base material para la reflexión teórica"
                ),
                formulas = listOf("\\text{Del Mito al Logos}: \\; \\text{Explicación Teogónica} \\to \\text{Causalidad Racional}"),
                formulaName = "Vector de Racionalización Griega",
                formulaLatex = "\\text{Logos} = \\text{Argumento} + \\text{Demostración} + \\text{Principio Natural (Arjé)}",
                formulaDescription = "Tránsito de la fe mítica a la indagación objetiva de la naturaleza.",
                admissionTip = "La filosofía NO nació en Atenas, sino en las colonias griegas de JONIA (Mileto, Asia Menor).",
                admissionExplanation = "• El término 'scholé' significaba ocio o tiempo libre dedicado al cultivo intelectual."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El proceso histórico mediante el cual los pensadores jonios abandonaron las explicaciones sobrenaturales para buscar causas racionales en la naturaleza se denomina:",
                    options = listOf("Revolución escolástica", "El paso del mito al logos", "El giro socrático", "La teogonía helenística", "La doxa epistémica"),
                    correctIndex = 1,
                    explanation = "El 'paso del mito al logos' designa el nacimiento de la explicación racional frente a las fábulas mitológicas tradicionales.",
                    subject = "Filosofía",
                    semana = 1
                ),
                Challenge(
                    id = "q_fil_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes factores socioeconómicos contribuyó directamente al surgimiento de la filosofía en Jonia?",
                    options = listOf(
                        "Una casta sacerdotal todopoderosa y dogmática",
                        "El aislamiento geográfico de las ciudades jónicas",
                        "El ocio creador (scholé) posibilitado por la sociedad de ciudadanos libres",
                        "La imposición de un texto sagrado revelado",
                        "La prohibición de los debates en el ágora"
                    ),
                    correctIndex = 2,
                    explanation = "El ocio creador (scholé) permitió a los ciudadanos libres disponer de tiempo para la reflexión teórica desinteresada.",
                    subject = "Filosofía",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "fil_t01_s03",
            subjectId = "filosofia",
            semana = 1,
            subtema = "1.3 Características de la Actitud Filosófica",
            title = "Rasgos de la Actitud Filosófica: Radical, Totalizadora, Crítica y Racional",
            theory = LessonTheory(
                id = "th_fil_t01_s03",
                asignatura = "Filosofía",
                semana = 1,
                titulo = "Características de la Actitud Filosófica",
                resumen = "La actitud filosófica se distingue por propiedades esenciales:\n\n1. Radical (Radix = raíz):\n   - Busca los primeros principios, los fundamentos últimos y la raíz más profunda de los problemas.\n\n2. Totalizadora o Universal:\n   - Su objeto de estudio es la realidad en su conjunto como totalidad holística (frente a las ciencias que estudian parcelas aisladas).\n\n3. Crítica:\n   - Cuestiona todo dogma, juicio preconcebido o certeza admitida por mera tradición o autoridad.\n\n4. Racional y Metódica:\n   - Se fundamenta en conceptos claros, argumentos lógicos y demostraciones coherentes, descartando la fe ciega.\n\n5. Problematizadora:\n   - Descubre problemas donde otros ven certezas definitivas; prefiere formular preguntas fecundas antes que conformarse con respuestas dogmáticas.",
                conceptosClave = listOf(
                    "Radical: Va a la raíz o fundamento primero de todas las cosas",
                    "Totalizadora (Universal): Abarca la realidad completa frente a la parcialidad científica",
                    "Crítica: Cuestiona dogmas y supuestos aceptados por costumbre",
                    "Racional: Rigor conceptual y consistencia deductiva",
                    "Problematizadora: Replantea continuamente nuevas interrogantes"
                ),
                formulas = listOf("\\text{Actitud Filosófica} = \\text{Radical} + \\text{Totalizadora} + \\text{Crítica} + \\text{Racional} + \\text{Problematizadora}"),
                formulaName = "Rasgos Cardinales de la Actitud Filosófica",
                formulaLatex = "\\text{Filosofía (Totalidad)} \\quad \\text{vs} \\quad \\text{Ciencia Particular (Parcela empírica)}",
                formulaDescription = "Diferencia de alcance epistemológico entre la filosofía y las ciencias empíricas.",
                admissionTip = "La filosofía se distingue de las ciencias particulares porque es TOTALIZADORA o UNIVERSAL (estudia el todo, mientras que las ciencias estudian parcelas).",
                admissionExplanation = "• Cuando un filósofo indaga '¿por qué existe algo y no la nada?', está ejerciendo una actitud RADICAL."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La característica de la filosofía que consiste en no aceptar ningún supuesto dogmático sin someterlo a examen racional previo se denomina:",
                    options = listOf("Metódica", "Crítica", "Totalizadora", "Pragmática", "Dogmática"),
                    correctIndex = 1,
                    explanation = "La filosofía es crítica porque enjuicia y cuestiona los presupuestos aceptados por costumbre o autoridad.",
                    subject = "Filosofía",
                    semana = 1
                ),
                Challenge(
                    id = "q_fil_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A diferencia de la geología o la zoología que investigan parcelas de la naturaleza, la filosofía aborda la realidad en su conjunto. Esta propiedad se define como:",
                    options = listOf("Radicalidad", "Inmanencia", "Totalizadora o universal", "Inmanentista", "Experimental"),
                    correctIndex = 2,
                    explanation = "La filosofía es totalizadora o universal porque su objeto de estudio abarca la totalidad del ser, del conocimiento y de los valores.",
                    subject = "Filosofía",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: DISCIPLINAS FILOSÓFICAS (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "fil_t02_s01",
            subjectId = "filosofia",
            semana = 2,
            subtema = "2.1 Ontología (el Ser) y Antropología Filosófica (el Hombre)",
            title = "Ontología del Ente y Antropología de la Esencia Humana",
            theory = LessonTheory(
                id = "th_fil_t02_s01",
                asignatura = "Filosofía",
                semana = 2,
                titulo = "Ontología y Antropología Filosófica",
                resumen = "• Ontología o Metafísica General:\n  - Etimología: Del griego on, ontos (el ser) y logos (estudio/tratado).\n  - Objeto de estudio: El ente en cuanto ente (el ser de las cosas), la sustancia fundamental, la esencia de la realidad y las categorías últimas de la existencia.\n  - Preguntas clave: ¿Qué es el ser? ¿Qué es lo real? ¿Cuál es la sustancia última de la realidad?\n\n• Antropología Filosófica:\n  - Etimología: Del griego anthropos (hombre) y logos.\n  - Objeto de estudio: La esencia, origen, sentido y destino del ser humano en el cosmos.\n  - Preguntas clave: ¿Qué es el hombre? ¿Tiene el ser humano una esencia fija o es libertad pura (Sartre)? ¿Cuál es la relación entre el cuerpo y el espíritu?",
                conceptosClave = listOf(
                    "Ontología: Estudio del ser en cuanto ser y la estructura última de lo real",
                    "Antropología Filosófica: Indagación sobre la naturaleza, esencia y sentido del hombre",
                    "Diferencia ontológica: Entre el ser (fundamento) y los entes (cosas particulares)",
                    "Concepciones del hombre: Animal racional (Aristóteles), animal simbólico (Cassirer)"
                ),
                formulas = listOf("\\text{Ontología} \\implies \\text{¿Qué es el Ser?}, \\quad \\text{Antropología Filosófica} \\implies \\text{¿Qué es el Hombre?}"),
                formulaName = "Ejes del Ser y la Esencia Humana",
                formulaLatex = "\\text{Ontología} = \\text{Estudio del Ente} \\quad \\mid \\quad \\text{Antropología Filosófica} = \\text{Esencia del Anthropos}",
                formulaDescription = "Disciplinas fundacionales dedicadas a la realidad ontológica y a la condición humana.",
                admissionTip = "Si la pregunta interroga sobre 'el origen o destino de la humanidad' o 'la esencia del hombre', la respuesta es ANTROPOLOGÍA FILOSÓFICA; si interroga por 'el ser de las cosas', es ONTOLOGÍA.",
                admissionExplanation = "• Martin Heidegger reformuló la ontología al plantear que el ser humano (Dasein) es el único ente que se interroga por el sentido del Ser."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La disciplina filosófica que se consagra a indagar los fundamentos primeros de la realidad, la sustancia primordial y el ser de las cosas es la:",
                    options = listOf("Gnoseología", "Ontología", "Epistemología", "Axiología", "Antropología"),
                    correctIndex = 1,
                    explanation = "La ontología tiene como objeto de estudio fundamental al ser en cuanto ente y los primeros principios constitutivos de la realidad.",
                    subject = "Filosofía",
                    semana = 2
                ),
                Challenge(
                    id = "q_fil_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Interrogarse si la esencia humana está determinada por la producción material (Marx), por la libertad incondicionada (Sartre) o por el uso de símbolos culturales (Cassirer) corresponde a la:",
                    options = listOf("Ética normativa", "Gnoseología empírica", "Antropología filosófica", "Axiología formal", "Estética pura"),
                    correctIndex = 2,
                    explanation = "La antropología filosófica se ocupa específicamente de examinar la naturaleza, definición y sentido constitutivo del ser humano.",
                    subject = "Filosofía",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "fil_t02_s02",
            subjectId = "filosofia",
            semana = 2,
            subtema = "2.2 Gnoseología (el Conocimiento) y Epistemología (la Ciencia)",
            title = "Teoría del Conocimiento General y Filosofía de la Ciencia",
            theory = LessonTheory(
                id = "th_fil_t02_s02",
                asignatura = "Filosofía",
                semana = 2,
                titulo = "Gnoseología y Epistemología",
                resumen = "• Gnoseología o Teoría del Conocimiento (Gnosis = conocimiento general):\n  - Objeto de estudio: El conocimiento humano en su dimensión más amplia y universal (origen, posibilidad, esencia y verdad).\n  - Analiza la relación entre Sujeto cognoscente y Objeto cognoscible (Racionalismo, Empirismo, Criticismo, Escepticismo).\n\n• Epistemología o Filosofía de la Ciencia (Episteme = ciencia):\n  - Objeto de estudio: El conocimiento científico exclusivamente, su estructura interna, validez formal, métodos de investigación, leyes, hipótesis y teorías científicas.\n  - Criterio de Demarcación: Separar ciencia de pseudociencia (Falsabilidad de Karl Popper, Verificabilidad del Neopositivismo).\n  - Dinámica científica: Paradigmas y revoluciones científicas (Thomas Kuhn).",
                conceptosClave = listOf(
                    "Gnoseología: Conocimiento humano general (sujeto vs. objeto)",
                    "Epistemología: Conocimiento científico, método científico, hipótesis, leyes y demarcación",
                    "Karl Popper: Criterio de falsabilidad como frontera de la ciencia",
                    "Thomas Kuhn: Paradigmas y revoluciones científicas"
                ),
                formulas = listOf(
                    "\\text{Gnoseología} = \\text{Conocimiento Humano General (Gnosis)}",
                    "\\text{Epistemología} = \\text{Conocimiento Científico Riguroso (Episteme)}"
                ),
                formulaName = "Frontera Epistemológica de Demarcación",
                formulaLatex = "\\text{Gnosis (Universal)} \\supset \\text{Episteme (Científica y Metódica)}",
                formulaDescription = "La epistemología es el estudio filosófico especializado de la ciencia particular.",
                admissionTip = "Distinción crucial: Gnoseología analiza el conocimiento en GENERAL (sentidos vs. razón); Epistemología analiza la CIENCIA (método hipotético-deductivo, leyes, paradigmas).",
                admissionExplanation = "• Mario Bunge definió la epistemología como la rama de la filosofía que estudia la investigación científica y su producto: el conocimiento científico."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La disciplina filosófica que debate si una teoría científica puede ser falsada o contrastada empíricamente es la:",
                    options = listOf("Ontología", "Gnoseología general", "Epistemología", "Axiología", "Ética"),
                    correctIndex = 2,
                    explanation = "La epistemología investiga la validez, fundamentación y métodos de contrastación del conocimiento científico.",
                    subject = "Filosofía",
                    semana = 2
                ),
                Challenge(
                    id = "q_fil_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Determinar si el origen del conocimiento radica en la experiencia sensorial (empirismo) o en las ideas innatas de la razón (racionalismo) constituye una interrogante propia de la:",
                    options = listOf("Gnoseología", "Epistemología", "Ética", "Estética", "Hermenéutica"),
                    correctIndex = 0,
                    explanation = "La gnoseología estudia el origen, la posibilidad y la esencia del conocimiento humano en su dimensión universal.",
                    subject = "Filosofía",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "fil_t02_s03",
            subjectId = "filosofia",
            semana = 2,
            subtema = "2.3 Ética (Moral y Deber) y Axiología (el Valor)",
            title = "Axiología de los Valores y Ética de la Conducta Moral",
            theory = LessonTheory(
                id = "th_fil_t02_s03",
                asignatura = "Filosofía",
                semana = 2,
                titulo = "Ética y Axiología",
                resumen = "• Axiología o Teoría del Valor (Axios = valioso; Logos = tratado):\n  - Objeto de estudio: La naturaleza de los valores, los juicios de valor y la experiencia estimativa.\n  - Características del valor:\n    1. Polaridad: Todo valor tiene su contravalor negativo (bueno/malo, bello/feo, justo/injusto).\n    2. Jerarquía: Los valores se ordenan de inferiores a superiores (sensoriales < económicos < vitales < espirituales y religiosos).\n    3. Graduación: Intensidad con que se manifiesta un valor (excelente, regular, pésimo).\n\n• Ética o Filosofía Moral (Ethos = costumbre, carácter):\n  - Objeto de estudio: La moral, la conducta humana libre, el deber, la justicia, el bien y la virtud.\n  - Requisitos de la persona moral: Conciencia moral (discernir entre bien y mal) y Libertad de decisión.",
                conceptosClave = listOf(
                    "Axiología: Estudio de la naturaleza del valor (polaridad, jerarquía, graduación)",
                    "Ética: Estudio de la moral, el bien, el deber y la responsabilidad de los actos libres",
                    "Persona Moral: Dotada de conciencia moral y libertad de elección",
                    "Polaridad: Todo valor se enfrenta a un contravalor correlativo"
                ),
                formulas = listOf(
                    "\\text{Axiología} \\implies \\text{¿Qué es el valor? (Polaridad, Jerarquía, Graduación)}",
                    "\\text{Ética} \\implies \\text{¿Qué es el bien moral y el deber? (Conciencia + Libertad)}"
                ),
                formulaName = "Dicotomía Axiológica y Moral",
                formulaLatex = "\\text{Valor} = \\text{Polo Positivo} \\iff \\text{Contravalor (Polo Negativo)}",
                formulaDescription = "La polaridad es la propiedad más distintiva de los valores frente a las cosas empíricas.",
                admissionTip = "Si la pregunta trata de juicios como 'bello/feo', 'justo/injusto' o 'la jerarquía de valores', es AXIOLOGÍA. Si trata de la responsabilidad de una acción, la culpa o el deber moral, es ÉTICA.",
                admissionExplanation = "• La estética es una rama axiológica especializada dedicada al estudio del valor de la belleza y la creación artística."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El hecho de que todo valor posea un opuesto correlativo ineludible (como la belleza frente a la fealdad o la justicia frente a la injusticia) expresa la característica axiológica de:",
                    options = listOf("Graduación", "Jerarquía", "Polaridad", "Objetividad", "Inmanencia"),
                    correctIndex = 2,
                    explanation = "La polaridad axiológica es la propiedad por la cual los valores se manifiestan en pares de opuestos complementarios (polo positivo y contravalor negativo).",
                    subject = "Filosofía",
                    semana = 2
                ),
                Challenge(
                    id = "q_fil_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes condiciones es indispensable para considerar a un individuo como 'persona moral' susceptible de responsabilidad ética?",
                    options = listOf(
                        "Poseer solvencia económica y estudios superiores",
                        "Actuar con conciencia moral y libertad de elección",
                        "Obedecer ciegamente las leyes jurídicas del Estado",
                        "Pertenecer a una congregación religiosa dogmática",
                        "Carecer de emociones y sentimientos sensibles"
                    ),
                    correctIndex = 1,
                    explanation = "Para ser persona moral se requiere poseer conciencia moral (discernimiento de los efectos de los actos) y libertad (capacidad de actuar sin coacción externa).",
                    subject = "Filosofía",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: PROBLEMAS FUNDAMENTALES DE LA FILOSOFÍA (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "fil_t03_s01",
            subjectId = "filosofia",
            semana = 3,
            subtema = "3.1 El Problema Fundamental: Relación Ser y Pensar",
            title = "El Problema Fundamental: Materialismo vs. Idealismo",
            theory = LessonTheory(
                id = "th_fil_t03_s01",
                asignatura = "Filosofía",
                semana = 3,
                titulo = "El Problema Fundamental de la Filosofía",
                resumen = "Friedrich Engels sintetizó que el gran problema cardinal de toda la filosofía es el de la relación entre el pensar y el ser, entre el espíritu y la materia.\n\n• Dos Grandes Campos en pugna ontológica:\n1. El Materialismo:\n   - Sostiene que la materia es lo primario y originario; el pensamiento y las ideas son un producto secundario y derivado de la materia altamente organizada (el cerebro humano).\n   - La materia existe objetivamente fuera e independientemente de la conciencia.\n\n2. El Idealismo:\n   - Sostiene que la idea, el espíritu o la conciencia es lo primario y creador; la materia es secundaria o un reflejo del espíritu.\n   - Se subdivide en:\n     * Idealismo Objetivo: Las ideas existen independientemente del hombre y de la materia (Platón: Mundo de las Ideas; Hegel: Idea Absoluta).\n     * Idealismo Subjetivo: El mundo exterior solo existe como percepción en la mente del sujeto (Berkeley: 'Ser es ser percibido' - Esse est percipi).",
                conceptosClave = listOf(
                    "Problema fundamental: ¿Qué es primario: la materia o el espíritu?",
                    "Materialismo: La materia es primaria y objetiva; la conciencia es su producto",
                    "Idealismo: La idea o espíritu es primario y la materia es dependiente",
                    "Idealismo Objetivo (Platón, Hegel) vs. Idealismo Subjetivo (Berkeley)"
                ),
                formulas = listOf(
                    "\\text{Materialismo}: \\; \\text{Materia (Primaria)} \\to \\text{Conciencia (Secundaria)}",
                    "\\text{Idealismo}: \\; \\text{Idea / Espíritu (Primario)} \\to \\text{Materia (Derivada)}"
                ),
                formulaName = "Línea de Demarcación Ontológica Fundamental",
                formulaLatex = "\\text{Ser vs. Pensar} \\implies \\text{Materialismo} \\iff \\text{Idealismo (Objetivo y Subjetivo)}",
                formulaDescription = "División fundacional de los sistemas metafísicos en la historia del pensamiento.",
                admissionTip = "Si Berkeley afirma que las cosas solo existen en tanto son percibidas por mis sentidos ('esse est percipi'), es IDEALISMO SUBJETIVO. Si Platón afirma que las Ideas existen en un reino trascendente, es IDEALISMO OBJETIVO.",
                admissionExplanation = "• El gnosticismo vs agnosticismo responde a la segunda faceta: ¿es el mundo cognoscible por la mente humana?"
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La tesis filosófica de George Berkeley resumida en la fórmula 'ser es ser percibido' (esse est percipi), según la cual los objetos físicos no existen independientemente de la mente del sujeto, constituye una manifestación de:",
                    options = listOf("Materialismo mecanicista", "Idealismo objetivo", "Idealismo subjetivo", "Realismo ingenuo", "Escepticismo radical"),
                    correctIndex = 2,
                    explanation = "Berkeley postuló el idealismo subjetivo, argumentando que las cosas físicas son solo conjuntos de sensaciones percibidas por la conciencia individual.",
                    subject = "Filosofía",
                    semana = 3
                ),
                Challenge(
                    id = "q_fil_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La corriente ontológica que sostiene que la materia existe objetivamente con independencia de la conciencia y que el pensamiento es una propiedad de la materia organizada es el:",
                    options = listOf("Idealismo trascendental", "Materialismo", "Agnosticismo", "Fenomenalismo", "Racionalismo dogmático"),
                    correctIndex = 1,
                    explanation = "El materialismo postula la primacía ontológica de la materia objetiva exterior frente a la conciencia y el pensamiento.",
                    subject = "Filosofía",
                    semana = 3
                )
            )
        ),

        LessonNode(
            id = "fil_t03_s02",
            subjectId = "filosofia",
            semana = 3,
            subtema = "3.2 Gnosticismo, Agnosticismo, Monismo y Dualismo",
            title = "¿Es cognoscible el mundo? Gnosticismo y Agnosticismo. Monismo vs. Dualismo",
            theory = LessonTheory(
                id = "th_fil_t03_s02",
                asignatura = "Filosofía",
                semana = 3,
                titulo = "Cognoscibilidad del Mundo y Pluralidad Ontológica",
                resumen = "• Segunda Faceta del Problema Fundamental (Cognoscibilidad):\n  1. Gnosticismo (del griego gnosis = conocimiento):\n     - Afirma que el mundo es cognoscible por la mente humana; podemos alcanzar verdades objetivas universales sobre la realidad.\n     - Posición adoptada por el materialismo dialéctico, el racionalismo (Descartes) y el realismo científico.\n  2. Agnosticismo (Inmanuel Kant, Hume):\n     - El mundo en sí mismo (la 'cosa en sí' o noúmeno kantiano) es incognoscible para el entendimiento humano; solo podemos conocer el fenómeno (apariencia estructurada por nuestras categorías mentales).\n     - David Hume negó la posibilidad de conocer las causas y sustancias profundas de las cosas.\n  3. Escepticismo (Pirrón de Elis):\n     - Suspende todo juicio de certeza (epoché) porque ningún conocimiento puede alcanzar la verdad definitiva; propone la ataraxia como consecuencia práctica de la duda universal.\n\n• Pluralidad Ontológica:\n  - Monismo: Toda la realidad tiene un único principio sustancial (Spinoza: todo es Dios-Naturaleza; Materialismo dialéctico: solo existe la materia).\n  - Dualismo: La realidad se compone de dos sustancias irreducibles (Descartes: res cogitans — alma pensante — y res extensa — cuerpo extenso material).\n  - Pluralismo (Leibniz): La realidad se compone de infinitas sustancias simples e indivisibles llamadas mónadas.",
                conceptosClave = listOf(
                    "Gnosticismo: El mundo es cognoscible por la razón y los sentidos",
                    "Agnosticismo: La 'cosa en sí' (noúmeno) es incognoscible; solo conocemos el fenómeno",
                    "Escepticismo pirrónico: Epoché (suspensión del juicio) y ataraxia resultante",
                    "Monismo (Spinoza), Dualismo (Descartes: res cogitans/res extensa), Pluralismo (Leibniz: mónadas)"
                ),
                formulas = listOf(
                    "\\text{Kant}: \\; \\text{Fenómeno (cognoscible)} \\neq \\text{Noúmeno (incognoscible)} = \\text{Cosa en Sí}"
                ),
                formulaName = "Frontera Epistémica Kantiana Fundamental",
                formulaLatex = "\\text{Gnosticismo} \\iff \\text{Mundo Cognoscible} \\quad \\text{vs} \\quad \\text{Agnosticismo} \\iff \\text{Noúmeno Inalcanzable}",
                formulaDescription = "Limitación del conocimiento humano formulada por Kant frente al optimismo gnoseológico racionalista.",
                admissionTip = "El dualismo cartesiano distingue dos sustancias: la res cogitans (alma inmaterial) y la res extensa (cuerpo material extenso).",
                admissionExplanation = "• Spinoza fue monista panteísta porque identificó a Dios con la Naturaleza (Deus sive Natura) como única sustancia infinita de la que todo es modo o atributo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para Immanuel Kant, la 'cosa en sí' o noúmeno representa:",
                    options = listOf(
                        "La realidad tal como la percibimos empíricamente con nuestros sentidos",
                        "La realidad tal como es en sí misma, incognoscible para el entendimiento humano",
                        "Las categorías a priori del entendimiento puro",
                        "El mundo ideal de las Ideas platónicas",
                        "La sustancia extensa cartesiana"
                    ),
                    correctIndex = 1,
                    explanation = "El noúmeno kantiano es la realidad trascendente en sí misma (la 'cosa en sí') que permanece inalcanzable al entendimiento humano, el cual solo accede al fenómeno estructurado.",
                    subject = "Filosofía",
                    semana = 3
                ),
                Challenge(
                    id = "q_fil_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "René Descartes propuso un sistema dualista que distingue dos tipos de sustancias irreducibles: la res cogitans (mente pensante) y la res extensa (cuerpo material). Esta doctrina se denomina:",
                    options = listOf("Monismo espinosista", "Pluralismo de mónadas", "Dualismo cartesiano", "Materialismo dialéctico", "Idealismo absoluto"),
                    correctIndex = 2,
                    explanation = "El dualismo cartesiano postula que el alma (res cogitans) y el cuerpo (res extensa) son sustancias radicalmente distintas e independientes que interactúan misteriosamente.",
                    subject = "Filosofía",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: LÓGICA Y TEORÍA DE LA ARGUMENTACIÓN (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "fil_t04_s01",
            subjectId = "filosofia",
            semana = 4,
            subtema = "4.1 Falacias No Formales de Atingencia",
            title = "Falacias de Atingencia: Ad Hominem, Ad Baculum, Ad Verecundiam, Ad Populum y Causa Falsa",
            theory = LessonTheory(
                id = "th_fil_t04_s01",
                asignatura = "Filosofía",
                semana = 4,
                titulo = "Falacias No Formales de Atingencia",
                resumen = "Una falacia es un razonamiento engañoso que parece válido pero contiene un error lógico. En las falacias de atingencia, las premisas carecen de conexión lógica con la conclusión:\n\n1. Argumentum ad hominem (Contra la persona):\n   - Ofensivo: Descalifica el argumento atacando la moral, origen o defectos del emisor (*'No escuchen su plan económico porque estuvo preso'*).\n   - Circunstancial: Ataca los supuestos intereses particulares del hablante (*'Defiende esa ley porque es empresario'*).\n\n2. Argumentum ad baculum (Apelación a la fuerza o amenaza):\n   - Intenta convencer infundiendo miedo o coacción (*'Si no aprueban mi proyecto, cerraré el departamento'*).\n\n3. Argumentum ad verecundiam (Apelación a la falsa autoridad):\n   - Se apela al prestigio de alguien en un campo ajeno para validar una afirmación (*'Este producto cura el asma porque lo dijo un futbolista famoso'*).\n\n4. Argumentum ad populum (Apelación a las masas o emociones colectivas):\n   - Se busca consenso excitando el patriotismo o la mayoría (*'Consuma este producto porque es el preferido por millones'*).\n\n5. Causa Falsa (Non causa pro causa):\n   - Considera causa de un hecho una mera coincidencia temporal anterior (*'Pasó un gato negro y luego desaprobé el examen'*).\n\n6. Argumentum ad ignorantiam (Apelación a la ignorancia):\n   - Afirma que algo es verdadero porque no se ha demostrado su falsedad (*'Los extraterrestres existen porque nadie ha probado que no existen'*).",
                conceptosClave = listOf(
                    "Ad hominem: Ataca a la persona en vez de refutar sus argumentos",
                    "Ad baculum: Apela a la amenaza, coacción o uso de la fuerza",
                    "Ad verecundiam: Apela a una autoridad inapropiada o no competente",
                    "Ad populum: Apela a los sentimientos de la multitud o a la mayoría",
                    "Causa falsa: Atribuye causalidad a una mera coincidencia temporal"
                ),
                formulas = listOf(
                    "\\text{Ad Hominem}: \\; \\text{Ataque a la persona} \\neq \\text{Refutación del argumento}",
                    "\\text{Causa Falsa}: \\; \\text{Suceso A antes de B} \\not\\implies \\text{A causa B}"
                ),
                formulaName = "Catálogo de Falacias de Atingencia de Copi",
                formulaLatex = "\\text{Invalidez de Atingencia} \\iff \\text{Premisas persuasivas pero lógicamente irrelevantes}",
                formulaDescription = "Desconexión entre el valor de verdad de las premisas y la conclusión pretendida.",
                admissionTip = "Si alguien cita la opinión de un científico famoso sobre política o de un actor sobre vacunas para justificar una tesis, es FALACIA AD VERECUNDIAM.",
                admissionExplanation = "• No todo ataque personal es falacia: en un tribunal se puede cuestionar la fiabilidad testimonial de un testigo falso comprobado."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En un debate sobre políticas ambientales, un congresista afirma: 'No debemos considerar el informe de ese ecologista, ya que en su juventud militó en partidos radicales'. ¿Qué falacia comete?",
                    options = listOf("Argumentum ad baculum", "Argumentum ad hominem", "Argumentum ad populum", "Causa falsa", "Argumentum ad ignorantiam"),
                    correctIndex = 1,
                    explanation = "Comete Argumentum ad hominem ofensivo, pues ataca el pasado de la persona en lugar de refutar los datos objetivos del informe ambiental.",
                    subject = "Filosofía",
                    semana = 4
                ),
                Challenge(
                    id = "q_fil_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un candidato presidencial exhorta a los electores diciendo: 'Esta propuesta educativa es la mejor porque la apoya la gran mayoría del pueblo peruano'. Se incurre en la falacia:",
                    options = listOf("Ad verecundiam", "Ad populum", "Ad baculum", "Petición de principio", "Equívoco"),
                    correctIndex = 1,
                    explanation = "La falacia ad populum recurre al fervor popular o a la cantidad de partidarios en lugar de esgrimir razones sustantivas objetivas.",
                    subject = "Filosofía",
                    semana = 4
                )
            )
        ),

        LessonNode(
            id = "fil_t04_s02",
            subjectId = "filosofia",
            semana = 4,
            subtema = "4.2 Falacias de Ambigüedad y Estructura del Silogismo Aristotélico",
            title = "Falacias de Ambigüedad y el Silogismo Categórico Aristotélico",
            theory = LessonTheory(
                id = "th_fil_t04_s02",
                asignatura = "Filosofía",
                semana = 4,
                titulo = "Falacias de Ambigüedad y Lógica Formal",
                resumen = "• Falacias No Formales de Ambigüedad (el argumento engaña por el uso ambiguo del lenguaje):\n\n  1. Falacia de Equívoco:\n     - Una misma palabra se utiliza con dos o más significados distintos dentro del mismo argumento (*'Las leyes de la naturaleza no pueden romperse; la ley de gravedad es una ley de la naturaleza; por tanto, no puede romperse'* — 'ley' es equívoca).\n  2. Falacia de Anfibología:\n     - Frases con construcción gramatical ambigua que generan dos lecturas posibles (*'Vi al hombre con el telescopio'*).\n  3. Falacia de Acento:\n     - Un argumento cambia de sentido al modificar el acento o énfasis prosódico en una palabra.\n  4. Falacia de Composición:\n     - Lo que es verdad de las partes se aplica erróneamente al todo (*'Cada átomo del universo es invisible; por tanto, el universo es invisible'*).\n  5. Falacia de División:\n     - Lo que es verdad del todo se aplica erróneamente a sus partes.\n\n• El Silogismo Aristotélico (Lógica Formal):\n  - Definición: Argumento deductivo válido compuesto por dos premisas (Mayor y Menor) y una Conclusión.\n  - Estructura estándar:\n    * Premisa Mayor (afirmación universal): Todo M es P.\n    * Premisa Menor (afirmación particular): S es M.\n    * Conclusión (deducida necesariamente): Por tanto, S es P.\n  - Ejemplo clásico: 'Todo hombre es mortal (Mayor); Sócrates es hombre (Menor); Por tanto, Sócrates es mortal (Conclusión)'.\n  - Términos del silogismo: Término Mayor (P), Término Menor (S) y Término Medio (M) que conecta las dos premisas.",
                conceptosClave = listOf(
                    "Falacia de equívoco: Palabra usada con doble sentido en el mismo argumento",
                    "Falacia de anfibología: Gramática ambigua que genera dos interpretaciones",
                    "Falacia de composición/división: Atribuir al todo/parte lo que solo es verdad de la parte/todo",
                    "Silogismo: Premisa Mayor + Premisa Menor → Conclusión necesaria (Deducción formal)"
                ),
                formulas = listOf(
                    "\\text{Silogismo}: \\; \\forall M \\to P, \\quad S \\to M \\quad \\therefore \\quad S \\to P"
                ),
                formulaName = "Estructura del Silogismo Categórico Aristotélico",
                formulaLatex = "\\text{Premisa Mayor} + \\text{Premisa Menor} \\implies \\text{Conclusión Válida}",
                formulaDescription = "Fundamento de la lógica deductiva formal: inferencia necesaria a partir de premisas universales.",
                admissionTip = "Identificar el término medio (M) del silogismo: es el que aparece en ambas premisas pero NO en la conclusión.",
                admissionExplanation = "• La falacia de composición clásica: 'Cada músico de la orquesta es excelente, por tanto la orquesta es excelente'— el todo puede ser mediocre aunque cada parte sea brillante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el silogismo categórico clásico 'Todo estudiante universitario estudia mucho; Pedro es estudiante universitario; por tanto, Pedro estudia mucho', el término medio es:",
                    options = listOf("Pedro", "Estudia mucho", "Estudiante universitario", "Todo", "Por tanto"),
                    correctIndex = 2,
                    explanation = "El término medio ('estudiante universitario') aparece en ambas premisas pero no en la conclusión; es el nexo que une el sujeto y el predicado de la conclusión.",
                    subject = "Filosofía",
                    semana = 4
                ),
                Challenge(
                    id = "q_fil_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El argumento 'Cada ladrillo de este edificio es ligero, por tanto, el edificio es ligero' comete la falacia de:",
                    options = listOf("Equívoco", "Ad hominem", "Causa falsa", "Composición", "División"),
                    correctIndex = 3,
                    explanation = "La falacia de composición consiste en atribuir al conjunto (edificio) una propiedad que solo tienen las partes individuales (cada ladrillo por separado).",
                    subject = "Filosofía",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: CONOCIMIENTO, CIENCIA Y VERDAD (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "fil_t05_s01",
            subjectId = "filosofia",
            semana = 5,
            subtema = "5.1 Origen del Conocimiento: Racionalismo, Empirismo y Criticismo",
            title = "Debate sobre el Origen: Racionalismo cartesiano vs. Empirismo británico",
            theory = LessonTheory(
                id = "th_fil_t05_s01",
                asignatura = "Filosofía",
                semana = 5,
                titulo = "El Origen del Conocimiento Humano",
                resumen = "La gnoseología debate cuál es la fuente fundamental del conocimiento válido:\n\n1. Racionalismo (Descartes, Spinoza, Leibniz):\n   - Sostiene que la razón es la fuente originaria y el criterio de validez de todo conocimiento auténtico universal y necesario (modelo matemático).\n   - Postula las ideas innatas: nociones que el alma posee desde el nacimiento sin derivar de la experiencia (idea de infinito, perfección, Dios).\n   - Desconfía de los sentidos empíricos porque son engañosos.\n\n2. Empirismo (Locke, Berkeley, Hume):\n   - Sostiene que la experiencia sensible es la única fuente y límite del conocimiento.\n   - Rechaza las ideas innatas: la mente al nacer es una 'tábula rasa' (hoja en blanco) donde la experiencia sensorial imprime ideas.\n\n3. Criticismo o Apriorismo Kantiano (Immanuel Kant):\n   - Síntesis superadora: 'Todo conocimiento comienza con la experiencia, pero no todo conocimiento procede de la experiencia'.\n   - Combina la materia empírica (sensaciones) con las formas a priori de la sensibilidad (espacio y tiempo) y las categorías del entendimiento.",
                conceptosClave = listOf(
                    "Racionalismo: La razón y las ideas innatas como fuente suprema (Descartes: Cogito ergo sum)",
                    "Empirismo: La experiencia sensible como origen único; mente como tábula rasa (John Locke)",
                    "Criticismo kantiano: Fusión de sensibilidad empírica a posteriori con formas a priori de la razón",
                    "Juicios sintéticos a priori: Fundamento de la ciencia según Kant"
                ),
                formulas = listOf(
                    "\\text{Racionalismo}: \\; \\text{Razón} + \\text{Ideas Innatas} \\implies \\text{Verdad Necesaria}",
                    "\\text{Empirismo}: \\; \\text{Experiencia Sensorial} \\to \\text{Tábula Rasa} \\implies \\text{Ideas}"
                ),
                formulaName = "Síntesis Epistemológica de Kant",
                formulaLatex = "\\text{Conocimiento} = \\text{Materia Empírica (Sentidos)} + \\text{Formas A Priori (Razón pura)}",
                formulaDescription = "Integración kantiana de la experiencia sensible con la estructura mental trascendental.",
                admissionTip = "La expresión 'la mente es como una tábula rasa (hoja en blanco)' pertenece a JOHN LOCKE y al EMPIRISMO.",
                admissionExplanation = "• René Descartes utilizó la 'duda metódica' para destruir todas las certezas dudosas hasta alcanzar su primera verdad indubitable: 'Pienso, luego existo' (Cogito ergo sum)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El filósofo británico que sostuvo que la mente humana al nacer es una 'tábula rasa' desprovista por completo de ideas innatas fue:",
                    options = listOf("René Descartes", "John Locke", "Gottfried Leibniz", "Immanuel Kant", "Baruch Spinoza"),
                    correctIndex = 1,
                    explanation = "John Locke, en su 'Ensayo sobre el entendimiento humano', formuló la doctrina de la mente como hoja en blanco (tábula rasa) en la que solo la experiencia escribe.",
                    subject = "Filosofía",
                    semana = 5
                ),
                Challenge(
                    id = "q_fil_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La postura gnoseológica de Immanuel Kant que superó el antagonismo entre el racionalismo y el empirismo se denomina:",
                    options = listOf("Dogmatismo radical", "Criticismo o apriorismo", "Escepticismo pirrónico", "Relativismo sofístico", "Pragmatismo utilitario"),
                    correctIndex = 1,
                    explanation = "El criticismo kantiano armonizó la experiencia sensible como inicio del conocer con las formas y categorías a priori de la mente humana.",
                    subject = "Filosofía",
                    semana = 5
                )
            )
        ),

        LessonNode(
            id = "fil_t05_s02",
            subjectId = "filosofia",
            semana = 5,
            subtema = "5.2 Teorías de la Verdad: Correspondencia, Coherencia, Pragmatismo y Tipos de Conocimiento",
            title = "Teorías de la Verdad y Tipos de Conocimiento: Vulgar, Científico y Filosófico",
            theory = LessonTheory(
                id = "th_fil_t05_s02",
                asignatura = "Filosofía",
                semana = 5,
                titulo = "La Verdad y los Tipos de Conocimiento Humano",
                resumen = "• Teorías de la Verdad:\n  1. Teoría de la Correspondencia (Aristóteles, Tomás de Aquino):\n     - La verdad es la adecuación (adaequatio) entre el pensamiento o enunciado y la realidad externa (res et intellectus).\n     - Es verdadero el juicio que se corresponde fielmente con los hechos.\n  2. Teoría de la Coherencia (Leibniz, Hegel):\n     - Un enunciado es verdadero si es coherente y no contradictorio con el sistema lógico global de proposiciones que conforman el conocimiento.\n  3. Teoría Pragmatista (William James, John Dewey):\n     - La verdad es lo que funciona en la práctica; una idea es verdadera en la medida en que resulta útil, eficaz y satisfactoria para resolver problemas.\n\n• Tipos de Conocimiento Humano:\n  1. Conocimiento Vulgar o Empírico-Cotidiano:\n     - Basado en la experiencia directa, el sentido común y las creencias tradicionales. No sistemático, superficial y acrítico.\n  2. Conocimiento Científico:\n     - Sistemático, metódico, verificable, crítico, preciso y universal. Busca leyes causales y teorías explicativas.\n  3. Conocimiento Filosófico:\n     - Radical (busca los principios más profundos), totalizador, crítico y no experimental. Reflexiona sobre los fundamentos del ser, del conocer y del valor.\n  4. Conocimiento Mítico-Religioso:\n     - Basado en la fe revelada y la tradición sagrada.",
                conceptosClave = listOf(
                    "Teoría de la Correspondencia: Verdad = Adecuación del pensamiento a la realidad",
                    "Teoría de la Coherencia: Verdad = No contradicción en el sistema lógico global",
                    "Pragmatismo (James, Dewey): Verdad = Lo que funciona y produce resultados útiles",
                    "Tipos de conocimiento: Vulgar (empírico) vs. Científico (sistemático) vs. Filosófico (radical)"
                ),
                formulas = listOf(
                    "\\text{Adaequatio}: \\; \\text{Intellectus} \\equiv \\text{Res} \\implies \\text{Verdad por Correspondencia}"
                ),
                formulaName = "Criterios de Verdad en Epistemología",
                formulaLatex = "\\text{Correspondencia (Facto)} \\; \\mid \\; \\text{Coherencia (Lógica)} \\; \\mid \\; \\text{Pragmatismo (Utilidad)}",
                formulaDescription = "Tres modelos fundamentales para determinar la verdad de un enunciado o proposición.",
                admissionTip = "Si la pregunta dice 'verdad es lo que resulta útil o práctico', marca PRAGMATISMO (William James). Si dice 'verdad es la adecuación del juicio con la realidad', marca teoría de la CORRESPONDENCIA.",
                admissionExplanation = "• El conocimiento científico se diferencia del vulgar porque es sistemático, metódico y universalmente válido, no por ser 'más difícil'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La teoría de la verdad que afirma que un juicio es verdadero cuando se adecúa o corresponde con los hechos de la realidad objetiva fue formulada clásicamente por:",
                    options = listOf("William James", "Hegel", "Aristóteles y Santo Tomás", "David Hume", "Augusto Comte"),
                    correctIndex = 2,
                    explanation = "La teoría de la correspondencia (adaequatio rei et intellectus) sostiene que la verdad consiste en la concordancia entre el enunciado y la realidad que describe.",
                    subject = "Filosofía",
                    semana = 5
                ),
                Challenge(
                    id = "q_fil_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes es el rasgo que mejor distingue al conocimiento científico del conocimiento vulgar o sentido común?",
                    options = listOf(
                        "El conocimiento científico es más difícil de entender",
                        "El conocimiento científico es sistemático, metódico, verificable y universalmente válido",
                        "El conocimiento vulgar no puede coexistir con el científico",
                        "El conocimiento científico excluye la observación empírica",
                        "El conocimiento vulgar es exclusivo de personas sin educación formal"
                    ),
                    correctIndex = 1,
                    explanation = "El conocimiento científico se define por su carácter sistemático, su método riguroso de investigación y su validez universal y verificable.",
                    subject = "Filosofía",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: LA FILOSOFÍA EN LA HISTORIA: ANTIGÜEDAD (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "fil_t06_s01",
            subjectId = "filosofia",
            semana = 6,
            subtema = "6.1 Periodo Cosmológico y Antropológico en Grecia",
            title = "Presocráticos (el Arjé), Sócrates y el Relativismo Sofista",
            theory = LessonTheory(
                id = "th_fil_t06_s01",
                asignatura = "Filosofía",
                semana = 6,
                titulo = "Filosofía Griega: Del Cosmos al Hombre",
                resumen = "1. Periodo Cosmológico o Presocrático (Siglo VI - V a.C.):\n   - Eje central: Búsqueda del Arjé (principio originario de la naturaleza physis):\n     * Monistas: Tales (Agua), Anaximandro (Ápeiron), Anaxímenes (Aire), Heráclito (Fuego y devenir constante: 'Panta rhei'), Parménides (El Ser inmóvil y eterno), Pitágoras (El Número).\n     * Pluralistas: Empédocles (Cuatro elementos: agua, aire, fuego, tierra), Anaxágoras (Homeomerías gobernadas por el Nous), Demócrito (Átomos y vacío).\n\n2. Periodo Antropológico o Socrático (Siglo V a.C., Atenas):\n   - Eje central: El hombre, la moral y la virtud en la polis.\n   - Los Sofistas (Protágoras, Gorgias): Relativismo moral y retórica ('El hombre es la medida de todas las cosas' - Protágoras).\n   - Sócrates: Opositor de los sofistas. Mayéutica (arte de dar a luz la verdad mediante el diálogo) e ironía socrática ('Solo sé que nada sé'). Intelectualismo moral: quien conoce el bien, actúa bien.",
                conceptosClave = listOf(
                    "Arjé: Principio material o abstracto fundamental del cosmos (Tales: agua, Anaximandro: ápeiron)",
                    "Heráclito (devenir/fuego) vs. Parménides (el Ser eterno e inmóvil)",
                    "Protágoras y los sofistas: 'El hombre es la medida de todas las cosas' (relativismo)",
                    "Sócrates: Mayéutica, ironía y el intelectualismo moral"
                ),
                formulas = listOf(
                    "\\text{Heráclito}: \\; \\text{Panta Rhei} \\quad \\text{vs} \\quad \\text{Parménides}: \\; \\text{El Ser es y el No-Ser no es}",
                    "\\text{Intelectualismo Moral}: \\; \\text{Sabiduría} = \\text{Virtud}, \\quad \\text{Maldad} = \\text{Ignorancia}"
                ),
                formulaName = "Dialéctica Cosmológica y Socrática",
                formulaLatex = "\\text{Método Socrático} = \\text{Ironía (Ignorancia)} + \\text{Mayéutica (Alumbramiento de la verdad)}",
                formulaDescription = "Método dialéctico de investigación moral de Sócrates.",
                admissionTip = "Para Heráclito el cosmos es devenir regido por el fuego; para Parménides el cambio es una ilusión y el Ser es único e inmóvil.",
                admissionExplanation = "• Sócrates no dejó obra escrita; su pensamiento fue transmitido por sus discípulos Platón y Jenofonte."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes filósofos presocráticos sostuvo que el principio de todas las cosas (arjé) es el fuego y que la realidad es un perpetuo cambio y devenir ('panta rhei')?",
                    options = listOf("Tales de Mileto", "Anaximandro", "Parménides de Elea", "Heráclito de Éfeso", "Empédocles"),
                    correctIndex = 3,
                    explanation = "Heráclito de Éfeso defendió la doctrina del devenir universal y la lucha de contrarios simbolizada en el fuego eterno.",
                    subject = "Filosofía",
                    semana = 6
                ),
                Challenge(
                    id = "q_fil_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La tesis del intelectualismo moral formulada por Sócrates sostiene que:",
                    options = listOf(
                        "El bien y el mal son relativos a la convención social",
                        "Quien actúa mal lo hace por ignorancia, pues quien conoce el bien obra virtuosamente",
                        "Las leyes morales son impuestas por los fuertes",
                        "La felicidad consiste en la búsqueda del placer sensual",
                        "El ser humano es incapaz de alcanzar verdades morales"
                    ),
                    correctIndex = 1,
                    explanation = "Sócrates identificó la virtud con el conocimiento racional: la persona sabia practica la justicia y quien comete el mal lo hace por ignorancia.",
                    subject = "Filosofía",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "fil_t06_s02",
            subjectId = "filosofia",
            semana = 6,
            subtema = "6.2 Periodo Ontológico: Platón y Aristóteles",
            title = "Platón (Mundo de las Ideas) y Aristóteles (Hilemorfismo y 4 Causas)",
            theory = LessonTheory(
                id = "th_fil_t06_s02",
                asignatura = "Filosofía",
                semana = 6,
                titulo = "La Filosofía Clásica: Platón y Aristóteles",
                resumen = "1. Platón (Idealismo Objetivo - Teoría de las Ideas):\n   - Dualismo Ontológico:\n     * Mundo Inteligible (Ideas): Realidad auténtica, inmaterial, eterna e inmutable (Idea suprema: el Bien).\n     * Mundo Sensible: Copia imperfecta y material de las Ideas.\n   - Dualismo Antropológico: Alma inmortal encerrada en un cuerpo material cárcel (soma sema).\n   - Reminiscencia (Anamnesis): Conocer es recordar lo contemplado en el mundo ideal.\n\n2. Aristóteles (Realismo / Hilemorfismo):\n   - Las esencias residen en las cosas concretas mismas (sustancia primera).\n   - Hilemorfismo: Toda sustancia se compone de Materia (hyle) y Forma (morphé).\n   - Potencia y Acto: El movimiento es el paso de la potencia al acto.\n   - Cuatro Causas: Material, Formal, Eficiente y Final (Telos). Motor Inmóvil como causa primera.",
                conceptosClave = listOf(
                    "Platón: Dualismo ontológico (Mundo Sensible vs. Mundo Inteligible)",
                    "Anamnesis platónica: Conocer es recordar",
                    "Aristóteles: Hilemorfismo (Materia + Forma inseparables)",
                    "Potencia (posibilidad) y Acto (realización plena)",
                    "Cuatro Causas aristotélicas: Material, Formal, Eficiente y Final"
                ),
                formulas = listOf(
                    "\\text{Sustancia Aristotélica} = \\text{Materia (Hyle)} + \\text{Forma (Morphé)}",
                    "\\text{Cambio} = \\text{Paso de la Potencia al Acto}"
                ),
                formulaName = "Fórmula Hilemórfica de Aristóteles",
                formulaLatex = "\\text{Ser Concreto} = \\text{Causa Material} + \\text{Causa Formal} + \\text{Causa Eficiente} + \\text{Causa Final}",
                formulaDescription = "Modelo tetracausal aristotélico para explicar todo ente de la naturaleza.",
                admissionTip = "Para Platón conocer es RECORDAR (reminiscencia); para Aristóteles todo conocimiento se origina primero en la EXPERIENCIA SENSORIAL.",
                admissionExplanation = "• En el mito de la caverna de Platón, los prisioneros encadenados representan a los hombres atados a las sombras de los sentidos (doxa)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para Aristóteles, la teoría hilemórfica postula que todas las sustancias sensibles de la naturaleza están compuestas indisolublemente de:",
                    options = listOf("Átomos y vacío", "Materia y forma", "Cuerpo y alma separada", "Sombras e ideas puras", "Fuego y discordia"),
                    correctIndex = 1,
                    explanation = "El hilemorfismo aristotélico afirma que todo cuerpo o sustancia se compone de materia (hyle) y forma sustancial (morphé).",
                    subject = "Filosofía",
                    semana = 6
                ),
                Challenge(
                    id = "q_fil_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según la teoría platónica de la reminiscencia (anamnesis), el proceso del auténtico conocimiento humano consiste primordialmente en:",
                    options = listOf(
                        "Percibir con exactitud los objetos sensibles de la materia",
                        "Recordar las Ideas eternas que el alma contempló antes de encarnar",
                        "Construir hipótesis mediante el método empírico",
                        "Aceptar con fe revelada los dogmas",
                        "Deducir teoremas matemáticos a partir de sensaciones"
                    ),
                    correctIndex = 1,
                    explanation = "Platón argumentó que el alma preexistió en el mundo de las Ideas y que aprender en este mundo terrenal es recordar (anamnesis) aquellas verdades.",
                    subject = "Filosofía",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: FILOSOFÍA EN LATINOAMÉRICA Y EL PERÚ (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "fil_t07_s01",
            subjectId = "filosofia",
            semana = 7,
            subtema = "7.1 El Gran Debate sobre la Autenticidad: Salazar Bondy vs. Leopoldo Zea",
            title = "Dependencia y Dominación (Salazar) vs. Circunstancialidad (Zea)",
            theory = LessonTheory(
                id = "th_fil_t07_s01",
                asignatura = "Filosofía",
                semana = 7,
                titulo = "El Debate sobre la Filosofía en Latinoamérica",
                resumen = "En las décadas de 1960 y 1970 se libró la gran polémica continental sobre la autenticidad del pensamiento latinoamericano:\n\n1. Augusto Salazar Bondy (*¿Existe una filosofía en nuestra América?*, 1968):\n   - Tesis Negativa: En Latinoamérica NO ha existido una filosofía auténtica u original, sino un pensamiento imitativo, inauténtico, alienado y eco de modas europeas.\n   - Causa Estructural: Es consecuencia directa del subdesarrollo y la dominación económica, política y cultural (sociedad alienada engendra pensamiento alienado).\n   - Propuesta: Para que surja una filosofía genuina, primero debe darse una revolución y liberación estructural que cancele la dependencia.\n\n2. Leopoldo Zea (*La filosofía americana como filosofía sin más*, 1969):\n   - Tesis Afirmativa: SÍ existe una filosofía latinoamericana auténtica.\n   - Fundamento: La originalidad no exige inventar conceptos desde cero, sino reflexionar sobre problemas humanos universales desde nuestra propia circunstancia histórica y mestiza.\n\n3. Filosofía de la Liberación (Enrique Dussel):\n   - Cuestiona la ontología europea de la dominación ('Conquisto, luego existo') y proclama la alteridad: dar voz al Otro (el oprimido, el indígena, la periferia).",
                conceptosClave = listOf(
                    "Augusto Salazar Bondy: Tesis negativa (filosofía inauténtica y alienada por la dependencia)",
                    "Leopoldo Zea: Tesis afirmativa (filosofía auténtica porque reflexiona desde la circunstancia propia)",
                    "Filosofía de la Liberación (Enrique Dussel): Pensamiento desde la alteridad del oprimido",
                    "Causa estructural de Salazar: Dependencia económica genera superestructura alienada"
                ),
                formulas = listOf(
                    "\\text{Salazar Bondy}: \\; \\text{Dependencia Estructural} \\implies \\text{Pensamiento Inauténtico y Alienado}",
                    "\\text{Leopoldo Zea}: \\; \\text{Problemas Universales} + \\text{Circunstancia Propia} \\implies \\text{Autenticidad}"
                ),
                formulaName = "Mnemotecnia del Debate Continental",
                formulaLatex = "\\text{Salazar (NO hay autenticidad por subdesarrollo)} \\quad \\text{vs} \\quad \\text{Zea (SÍ hay por circunstancia)}",
                formulaDescription = "Controversia fundacional de la filosofía latinoamericana del siglo XX.",
                admissionTip = "Salazar Bondy afirma: 'Una sociedad alienada solo puede producir una filosofía alienada'. Zea responde que la autenticidad radica en asumir nuestra propia circunstancia mestiza.",
                admissionExplanation = "• No confundir la tesis de Salazar Bondy con la frase de Mariátegui: 'ni calco ni copia, sino creación heroica' es de Mariátegui (1928)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En su ensayo '¿Existe una filosofía en nuestra América?' (1968), Augusto Salazar Bondy sostiene que el pensamiento latinoamericano ha sido inauténtico y alienado debido fundamentalmente a:",
                    options = listOf(
                        "La falta de talento intelectual de los pensadores locales",
                        "El estado estructural de dependencia y dominación económica y social",
                        "La ausencia de universidades y centros de investigación",
                        "El rechazo de las ideas filosóficas occidentales",
                        "El predominio exclusivo del pensamiento mítico indígena"
                    ),
                    correctIndex = 1,
                    explanation = "Salazar Bondy argumentó que la inautenticidad cultural es reflejo directo de la condición de dependencia, subdesarrollo y dominación que padece Latinoamérica.",
                    subject = "Filosofía",
                    semana = 7
                ),
                Challenge(
                    id = "q_fil_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué filósofo mexicano refutó la tesis de Salazar Bondy argumentando que sí existe una filosofía auténtica porque reflexiona sobre lo humano desde nuestra propia circunstancia histórica?",
                    options = listOf("Octavio Paz", "José Vasconcelos", "Leopoldo Zea", "Enrique Dussel", "Samuel Ramos"),
                    correctIndex = 2,
                    explanation = "Leopoldo Zea sostuvo en 'La filosofía americana como filosofía sin más' que el filosofar americano es genuino al responder a las urgencias de su realidad histórica.",
                    subject = "Filosofía",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "fil_t07_s02",
            subjectId = "filosofia",
            semana = 7,
            subtema = "7.2 Evolución del Pensamiento Peruano: Colonia, Positivismo y Debate Social",
            title = "Corrientes Peruanas: De Valladolid a Mariátegui y Haya de la Torre",
            theory = LessonTheory(
                id = "th_fil_t07_s02",
                asignatura = "Filosofía",
                semana = 7,
                titulo = "Etapas del Pensamiento en el Perú",
                resumen = "• El Debate de Valladolid (1550 - 1551):\n  - Fray Bartolomé de las Casas: Defiende que el indígena es un ser humano racional dotado de alma, debiendo evangelizarse pacíficamente.\n  - Juan Ginés de Sepúlveda: Apela a la 'esclavitud natural' de Aristóteles para justificar la guerra justa de conquista sobre los indios bárbaros.\n\n• El Debate Decimonónico (Soberanía Republicana):\n  - Bartolomé Herrera (Conservador): 'Soberanía de la inteligencia' (el poder debe residir en las élites educadas y el orden católico providencial).\n  - Benito Laso y Pedro Gálvez (Liberales): 'Soberanía popular' (el poder emana del pueblo, sufragio universal y república laica).\n\n• Positivismo y Espiritualismo:\n  - Manuel González Prada (*Pájinas libres*): Positivismo radical y anarquista; denuncia la alianza corrupta entre clero, militares y gamonales (*'¡Los viejos a la tumba, los jóvenes a la obra!'*).\n  - Manuel Vicente Villarán: Positivismo pedagógico; exige formar técnicos, ingenieros y científicos en vez de abogados y literatos improductivos.\n  - Alejandro Deustua: Reacción espiritualista bergsoniana; afirma la libertad moral y la estética como valores supremos; prioriza educar a la élite dirigente.\n\n• El Debate de 1920 (Generación del Centenario):\n  - José Carlos Mariátegui (*7 ensayos*): Socialismo indoamericano; el problema del indio es el problema de la tierra (liquidar el gamonalismo feudal).\n  - Víctor Raúl Haya de la Torre (APRA): Frente único antiimperialista de trabajadores manuales e intelectuales; teoría del Espacio-Tiempo Histórico.",
                conceptosClave = listOf(
                    "Valladolid: Las Casas (indio humano libre) vs. Sepúlveda (esclavitud natural aristotélica)",
                    "Herrera (Soberanía de la inteligencia) vs. Laso/Gálvez (Soberanía popular)",
                    "González Prada: Positivismo combativo, redención del indio y anticlericalismo",
                    "Mariátegui: Socialismo marxista indoamericano y problema agrario feudal",
                    "Haya de la Torre: Frente antiimperialista y Espacio-Tiempo Histórico"
                ),
                formulas = listOf(
                    "\\text{Mariátegui}: \\; \\text{Problema del Indio} = \\text{Problema de la Tierra (Semifeudalidad)}"
                ),
                formulaName = "Ejes Históricos del Pensamiento Peruano",
                formulaLatex = "\\text{Evolución}: \\; \\text{Escolástica} \\to \\text{Ilustración} \\to \\text{Positivismo} \\to \\text{Espiritualismo} \\to \\text{Debate Social}",
                formulaDescription = "Grandes fases doctrinarias del pensamiento peruano desde el virreinato al siglo XX.",
                admissionTip = "Bartolomé Herrera defendió la SOBERANÍA DE LA INTELIGENCIA (no la popular). Mariátegui afirmó que el problema del indio no es pedagógico ni étnico, sino socioeconómico (la posesión de la tierra).",
                admissionExplanation = "• Manuel Vicente Villarán en su discurso de 1900 en San Marcos criticó la educación virreinal por formar 'doctores y rábulas' en vez de técnicos productivos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el debate de Valladolid (1550-1551), el jurista Juan Ginés de Sepúlveda justificó la conquista y sometimiento de los indígenas americanos basándose en la teoría de:",
                    options = listOf(
                        "La soberanía popular de Rousseau",
                        "La esclavitud natural de Aristóteles",
                        "El contrato social de Hobbes",
                        "La tábula rasa de John Locke",
                        "El imperativo categórico de Kant"
                    ),
                    correctIndex = 1,
                    explanation = "Sepúlveda utilizó la tesis aristotélica de la servidumbre o esclavitud natural para alegar que los pueblos indígenas eran bárbaros e incapaces de autogobernarse.",
                    subject = "Filosofía",
                    semana = 7
                ),
                Challenge(
                    id = "q_fil_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En '7 ensayos de interpretación de la realidad peruana' (1928), José Carlos Mariátegui concluye que el problema indígena radica esencialmente en:",
                    options = listOf(
                        "La falta de escuelas primarias rurales",
                        "El régimen de propiedad agraria y la pervivencia del gamonalismo feudal",
                        "La inferioridad biológica de las razas andinas",
                        "La pérdida de las creencias religiosas prehispánicas",
                        "El aislamiento lingüístico del quechua y aimara"
                    ),
                    correctIndex = 1,
                    explanation = "Mariátegui superó los enfoques humanitarios o pedagógicos demostrando que la opresión del indígena tiene raíz socioeconómica en la posesión de la tierra y el régimen semifeudal gamonal.",
                    subject = "Filosofía",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: PENSAMIENTO FILOSÓFICO CONTEMPORÁNEO (SEMANA 8)
        // =========================================================================
        LessonNode(
            id = "fil_t08_s01",
            subjectId = "filosofia",
            semana = 8,
            subtema = "8.1 Positivismo, Marxismo, Nietzsche y Existencialismo",
            title = "Las Grandes Corrientes: Comte, Marx, Nietzsche y Sartre",
            theory = LessonTheory(
                id = "th_fil_t08_s01",
                asignatura = "Filosofía",
                semana = 8,
                titulo = "Filosofía Contemporánea: Siglos XIX y XX",
                resumen = "1. El Positivismo (Auguste Comte):\n   - Rechaza la metafísica especulativa; solo reconoce como conocimiento válido el obtenido por las ciencias empíricas positivas y los hechos observables.\n   - **Ley de los Tres Estados**: Teológico o ficticio (dioses), Metafísico o abstracto (esencias/fuerzas ocultas) y Positivo o científico (leyes invariables de la naturaleza). Lema: 'Orden y Progreso'.\n\n2. El Marxismo (Karl Marx y Friedrich Engels):\n   - Materialismo Dialéctico e Histórico: Las relaciones materiales de producción constituyen la estructura económica que determina la superestructura ideológica (leyes, religión, filosofía).\n   - Motor de la historia: La lucha de clases (*'La historia de todas las sociedades hasta nuestros días es la historia de las luchas de clases'*). Enajenación o alienación del proletario por el capital.\n\n3. Friedrich Nietzsche (Vitalismo y Crítica a la Cultura Occidental):\n   - Denuncia la moral de esclavos (cristianismo) que reprime la vida y el instinto dionisiaco.\n   - **'Dios ha muerto'**: Caída de los valores absolutos trascendentes que da paso al Nihilismo.\n   - Propuestas: Voluntad de Poder, el Eterno Retorno y el **Superhombre** (*Übermensch*), creador de sus propios valores afirmativos.\n\n4. El Existencialismo (Jean-Paul Sartre):\n   - Postulado fundamental: **'La existencia precede a la esencia'** (el hombre primero existe en el mundo, actúa, y solo después se autodefine por sus elecciones libres).\n   - El hombre está 'condenado a ser libre': carece de excusas deterministas y es plenamente responsable de sí mismo y de la humanidad.",
                conceptosClave = listOf(
                    "Auguste Comte: Positivismo y Ley de los Tres Estados (Teológico, Metafísico, Positivo)",
                    "Karl Marx: Materialismo histórico, alienación del trabajo y lucha de clases",
                    "Friedrich Nietzsche: Muerte de Dios, Superhombre y Voluntad de Poder",
                    "Jean-Paul Sartre: 'La existencia precede a la esencia'; libertad y angustia existencial"
                ),
                formulas = listOf(
                    "\\text{Sartre}: \\; \\text{Existencia} \\implies \\text{Esencia (Autocreación por la libertad)}",
                    "\\text{Marx}: \\; \\text{Estructura Económica} \\implies \\text{Superestructura Ideológica}"
                ),
                formulaName = "Axiomas del Pensamiento Contemporáneo",
                formulaLatex = "\\text{Comte (Positivo)} \\quad \\mid \\quad \\text{Marx (Materialismo)} \\quad \\mid \\quad \\text{Nietzsche (Voluntad)} \\quad \\mid \\quad \\text{Sartre (Libertad)}",
                formulaDescription = "Fundamentos del giro contemporáneo hacia la ciencia, la historia, la vida y la existencia.",
                admissionTip = "Si la pregunta cita la frase 'la existencia precede a la esencia', marca JEAN-PAUL SARTRE (Existencialismo). Si habla de la 'Ley de los Tres Estados', marca AUGUSTE COMTE.",
                admissionExplanation = "• Nietzsche contrapuso el espíritu apolíneo (orden, razón, armonía) con el espíritu dionisiaco (desenfreno, pasión, vida)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La tesis central del existencialismo ateo de Jean-Paul Sartre, formulada en 'El existencialismo es un humanismo', sostiene que:",
                    options = listOf(
                        "La esencia divina del hombre determina sus actos morales",
                        "La existencia precede a la esencia, por lo que el ser humano se define por sus propias decisiones libres",
                        "El destino individual está predestinado por las leyes económicas",
                        "La felicidad radica en la contemplación de las Ideas platónicas",
                        "El hombre es un esclavo biológico de sus instintos inconscientes"
                    ),
                    correctIndex = 1,
                    explanation = "Sartre afirma que en el ser humano la existencia precede a la esencia: el hombre empieza por no ser nada y solo después se construye a través de sus actos libres.",
                    subject = "Filosofía",
                    semana = 8
                ),
                Challenge(
                    id = "q_fil_t08_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la doctrina del positivismo fundada por Auguste Comte, el estadio supremo del conocimiento humano en el que se explican los fenómenos mediante leyes científicas invariables es el estado:",
                    options = listOf("Metafísico", "Teológico", "Positivo o científico", "Animista", "Ficticio"),
                    correctIndex = 2,
                    explanation = "En la Ley de los Tres Estados de Comte, el estado positivo es el definitivo y maduro, donde la razón renuncia a causas ocultas para limitarse a leyes empíricas observables.",
                    subject = "Filosofía",
                    semana = 8
                )
            )
        ),

        LessonNode(
            id = "fil_t08_s02",
            subjectId = "filosofia",
            semana = 8,
            subtema = "8.2 Fenomenología, Hermenéutica y Filosofía Analítica",
            title = "Husserl y la Fenomenología, Gadamer-Ricoeur en Hermenéutica y el Giro Lingüístico",
            theory = LessonTheory(
                id = "th_fil_t08_s02",
                asignatura = "Filosofía",
                semana = 8,
                titulo = "Corrientes Filosóficas del Siglo XX",
                resumen = "1. La Fenomenología (Edmund Husserl, 1913):\n   - Método: La reducción fenomenológica (epoché) consiste en 'poner entre paréntesis' todos los presupuestos sobre el mundo real para centrarse exclusivamente en el análisis puro de los fenómenos tal como aparecen a la conciencia (intencionalidad).\n   - Principio de intencionalidad: Toda conciencia es 'conciencia de algo'; nunca existe una mente vacía sin objeto intencional.\n   - Herederos: Martin Heidegger (ser-en-el-mundo, Dasein), Maurice Merleau-Ponty (cuerpo vivido).\n\n2. La Hermenéutica (Wilhelm Dilthey, Hans-Georg Gadamer, Paul Ricoeur):\n   - Disciplina de la comprensión e interpretación de textos, símbolos, acciones y culturas.\n   - Gadamer (*Verdad y Método*, 1960): El intérprete siempre parte de una pre-comprensión histórica (prejuicios productivos) en un diálogo dialéctico con el texto: el 'círculo hermenéutico'.\n   - Ricoeur: La narrativa es el tiempo humano objetivado; comprender una vida es comprender su relato temporal.\n\n3. Filosofía Analítica (Bertrand Russell, Ludwig Wittgenstein, Neopositivismo del Círculo de Viena):\n   - El lenguaje ordinario encubre confusiones lógicas que la filosofía debe clarificar con el análisis lógico del lenguaje.\n   - Wittgenstein (Tractatus): Solo los enunciados que describen hechos del mundo tienen sentido; las proposiciones filosóficas metafísicas son sinsentidos.\n   - Wittgenstein tardío (Investigaciones filosóficas): El significado de las palabras es su uso en los juegos del lenguaje concretos de cada comunidad.",
                conceptosClave = listOf(
                    "Husserl: Fenomenología, reducción (epoché) e intencionalidad de la conciencia",
                    "Gadamer: Círculo hermenéutico; comprensión dialógica entre horizonte del lector y del texto",
                    "Wittgenstein temprano: Solo los hechos son significativos (Tractatus); Wittgenstein tardío: el significado es el uso",
                    "Círculo de Viena: Verificacionismo y Criterio de significatividad empírica"
                ),
                formulas = listOf(
                    "\\text{Husserl}: \\; \\text{Toda Conciencia} = \\text{Conciencia DE algo (Intencionalidad)}"
                ),
                formulaName = "Tríada del Pensamiento Filosófico del XX",
                formulaLatex = "\\text{Fenomenología (Ser)} \\; \\mid \\; \\text{Hermenéutica (Sentido)} \\; \\mid \\; \\text{Analítica (Lenguaje)}",
                formulaDescription = "Tres grandes proyectos filosóficos que dominaron el siglo XX europeo y anglosajón.",
                admissionTip = "El 'círculo hermenéutico' de Gadamer: para comprender las partes del texto, necesitas entender el todo; pero para entender el todo, debes comprender las partes.",
                admissionExplanation = "• La epoché de Husserl no es escepticismo: no niega el mundo externo, sino que suspende temporalmente su asunción para describir con pureza los actos de la conciencia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El principio fundamental de la fenomenología de Edmund Husserl que sostiene que toda conciencia está siempre dirigida hacia un objeto se denomina:",
                    options = listOf("Catarsis", "Epojé", "Intencionalidad", "Hermenéutica", "Dialéctica"),
                    correctIndex = 2,
                    explanation = "La intencionalidad es la propiedad estructural esencial de la conciencia: siempre es 'conciencia de algo', nunca un estado mental vacío o sin objeto.",
                    subject = "Filosofía",
                    semana = 8
                ),
                Challenge(
                    id = "q_fil_t08_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Hans-Georg Gadamer en 'Verdad y Método' sostiene que la comprensión de un texto nunca parte de cero porque el intérprete siempre carga con una estructura de pre-comprensión histórica. A este fenómeno interpretativo se le denomina:",
                    options = listOf("Reducción eidética", "Analogía del ser", "El círculo hermenéutico", "La voluntad de poder", "El imperativo hipotético"),
                    correctIndex = 2,
                    explanation = "El círculo hermenéutico describe la relación dialéctica entre la comprensión del todo y la comprensión de las partes, mediada siempre por el horizonte histórico del intérprete.",
                    subject = "Filosofía",
                    semana = 8
                )
            )
        ),

        // =========================================================================
        // TEMA 09: ESTÉTICA Y FILOSOFÍA DEL ARTE (SEMANA 9)
        // =========================================================================
        LessonNode(
            id = "fil_t09_s01",
            subjectId = "filosofia",
            semana = 9,
            subtema = "9.1 Alexander Baumgarten y las Categorías Estéticas",
            title = "La Ciencia de la Belleza y Categorías: Bello, Sublime, Trágico y Cómico",
            theory = LessonTheory(
                id = "th_fil_t09_s01",
                asignatura = "Filosofía",
                semana = 9,
                titulo = "Estética: Origen y Categorías",
                resumen = "• Origen del Término:\n  Fue acuñado por **Alexander Baumgarten** en 1750 a partir del griego *aisthesis* (sensibilidad o percepción sensible). La definió como la ciencia del conocimiento sensible y la teoría de las artes liberales.\n\n• Categorías Estéticas Fundamentales:\n  1. Lo Bello: Armonía, simetría, proporción y deleite contemplativo armónico.\n  2. Lo Sublime: Grandeza inconmensurable, infinita y sobrecogedora que desborda la imaginación provocando una mezcla de asombro y temor reverencial (estudiado por Edmund Burke y Kant: ej. la inmensidad del océano embravecido, las cordilleras nevadas).\n  3. Lo Trágico: Conflicto desgarrador del héroe contra un destino fatal inevitable que culmina en catástrofe y suscita compasión y pavor.\n  4. Lo Cómico: Ruptura jocosa de las expectativas convencionales que provoca risa purificadora.\n  5. Lo Feo: Deformidad y discordancia que en el arte adquiere fuerza expresiva y dramática reveladora.",
                conceptosClave = listOf(
                    "Alexander Baumgarten: Creador del término estética (1750, aisthesis)",
                    "Lo Bello: Armonía, orden y proporción",
                    "Lo Sublime: Inmensidad inconmensurable que sobrecoge y sobrepasa los sentidos (Kant)",
                    "Lo Trágico: Conflicto insuperable contra el destino inexorable",
                    "Lo Cómico: Ruptura alegre e ingeniosa de la lógica convencional"
                ),
                formulas = listOf(
                    "\\text{Estética (Baumgarten)} = \\text{Filosofía del Arte y la Sensibilidad (Aisthesis)}"
                ),
                formulaName = "Espectro de Categorías Estéticas",
                formulaLatex = "\\text{Juicio Estético} \\implies [\\text{Lo Bello (Armonía)} \\; \\mid \\; \\text{Lo Sublime (Inmensidad)} \\; \\mid \\; \\text{Lo Trágico (Destino)}]",
                formulaDescription = "Dimensiones valorativas de la experiencia estética y artística.",
                admissionTip = "La categoría estética que alude a una grandeza sobrecogedora y desmesurada que desborda los límites de la imaginación (un volcán en erupción, el abismo cósmico) es LO SUBLIME.",
                admissionExplanation = "• Para Kant en la 'Crítica del juicio', el placer estético es 'desinteresado': no busca el consumo utilitario del objeto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué filósofo introdujo formalmente el término 'estética' en el siglo XVIII para designar la ciencia de la sensibilidad y de la belleza?",
                    options = listOf("Immanuel Kant", "Alexander Baumgarten", "Friedrich Hegel", "Arthur Schopenhauer", "David Hume"),
                    correctIndex = 1,
                    explanation = "Alexander Baumgarten publicó 'Aesthetica' en 1750, fundando formalmente la estética como disciplina filosófica autónoma.",
                    subject = "Filosofía",
                    semana = 9
                ),
                Challenge(
                    id = "q_fil_t09_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La categoría estética que designa una magnitud colosal, ilimitada y sobrecogedora ante la cual el ser humano experimenta asombro y pequeñez se denomina:",
                    options = listOf("Lo bello", "Lo grotesco", "Lo sublime", "Lo trágico", "Lo cómico"),
                    correctIndex = 2,
                    explanation = "Lo sublime alude a la inmensidad desmesurada que excede la imaginación y produce admiración sobrecogedora.",
                    subject = "Filosofía",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "fil_t09_s02",
            subjectId = "filosofia",
            semana = 9,
            subtema = "9.2 Teorías Filosóficas sobre el Arte: Mímesis y Catarsis",
            title = "Mímesis Platónica, Catarsis Aristotélica y el Juicio del Gusto",
            theory = LessonTheory(
                id = "th_fil_t09_s02",
                asignatura = "Filosofía",
                semana = 9,
                titulo = "Teorías del Arte en la Filosofía Clásica",
                resumen = "• Platón y el Arte como Mímesis Engañosa (*República*):\n  - Para Platón, las cosas sensibles son copias del Mundo de las Ideas; por ende, el artista que pinta o imita un árbol está haciendo una **copia de una copia** (mímesis de segundo grado alejada de la verdad).\n  - Censura a los poetas dramáticos y los expulsa de su Estado ideal porque apelan a las pasiones irracionales del alma en lugar de la razón.\n\n• Aristóteles y la Catarsis Trágica (*Poética*):\n  - Reivindica el arte: la imitación (*mímesis*) es consustancial al hombre y fuente natural de aprendizaje placentero.\n  - La Tragedia produce la **Catarsis** (*Katharsis*): purificación o liberación emocional del terror y la compasión (*eleos* y *phobos*) en los espectadores, restableciendo el equilibrio moral del alma.\n\n• Kant y el Juicio del Gusto Desinteresado (*Crítica del juicio*):\n  - La belleza no es una propiedad física del objeto ni un capricho utilitario; es la satisfacción contemplativa pura, universal y **desinteresada** provocada por el libre juego armónico entre la imaginación y el entendimiento.",
                conceptosClave = listOf(
                    "Platón: Arte como copia de sombras (mímesis de segundo grado alejada de la verdad)",
                    "Aristóteles: Catarsis como purificación de las emociones de piedad y temor en la tragedia",
                    "Kant: El juicio del gusto estético es contemplativo y desinteresado",
                    "Mímesis creadora: El arte no copia pasivamente, sino que recrea la naturaleza con universalidad"
                ),
                formulas = listOf(
                    "\\text{Catarsis (Aristóteles)} = \\text{Compasión (Éleos)} + \\text{Temor (Phobos)} \\implies \\text{Purificación del Alma}"
                ),
                formulaName = "Fórmula de la Catarsis Trágica",
                formulaLatex = "\\text{Tragedia Griega} \\implies \\text{Mímesis Dramática} \\to \\text{Catarsis Emocional en el Espectador}",
                formulaDescription = "Función pedagógica y purificadora del arte teatral según la Poética de Aristóteles.",
                admissionTip = "La función suprema de la tragedia griega según Aristóteles es la CATARSIS (purificación del alma a través de la piedad y el temor).",
                admissionExplanation = "• Platón desconfiaba del arte porque consideraba que los artistas imitaban apariencias engañosas en vez de buscar la Idea pura del Bien."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la 'Poética' de Aristóteles, el efecto de purificación y liberación de las pasiones de terror y piedad que experimenta el espectador teatral se denomina:",
                    options = listOf("Mímesis", "Catarsis", "Hamartia", "Ataraxia", "Anamnesis"),
                    correctIndex = 1,
                    explanation = "La catarsis es la purificación interior de las emociones generada por el desenlace conmovedor de la tragedia.",
                    subject = "Filosofía",
                    semana = 9
                ),
                Challenge(
                    id = "q_fil_t09_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Por qué Platón expulsó a los poetas y pintores de su República ideal en los libros III y X?",
                    options = listOf(
                        "Porque cobraban elevados impuestos a los gobernantes",
                        "Porque su arte es una copia de sombras que excita las bajas pasiones alejando de la verdad",
                        "Porque difundían el ateísmo entre los guardianes",
                        "Porque promovían la rebelión armada de los artesanos",
                        "Porque rechazaban la música y la gimnasia militar"
                    ),
                    correctIndex = 1,
                    explanation = "Platón consideraba que el arte imitativo era una copia de segundo grado que alimentaba las pasiones irracionales y desviaba a los ciudadanos del conocimiento de las Ideas.",
                    subject = "Filosofía",
                    semana = 9
                )
            )
        ),

        // =========================================================================
        // TEMA 10: ÉTICA Y MORAL (SEMANA 10)
        // =========================================================================
        LessonNode(
            id = "fil_t10_s01",
            subjectId = "filosofia",
            semana = 10,
            subtema = "10.1 Doctrinas Éticas Clásicas y Modernas",
            title = "Eudemonismo, Hedonismo, Deontologismo Kantiano y Utilitarismo",
            theory = LessonTheory(
                id = "th_fil_t10_s01",
                asignatura = "Filosofía",
                semana = 10,
                titulo = "Principales Doctrinas Éticas",
                resumen = "A lo largo de la historia se han desarrollado modelos éticos fundamentales para responder en qué consiste el bien supremo y la vida virtuosa:\n\n1. Eudemonismo (Aristóteles - *Ética a Nicómaco*):\n   - El fin supremo de la vida humana es la **Felicidad (*Eudaimonía*)**.\n   - La felicidad se alcanza mediante la actividad contemplativa de la razón y el ejercicio de la virtud moral, entendida como el **Justo Medio (*Mesótes*)** entre dos extremos viciosos (ej. el valor es el justo medio entre la cobardía y la temeridad).\n\n2. Hedonismo (Epicuro de Samos):\n   - El bien supremo es el **Placer (*Hedoné*)**, entendido no como desenfreno sensual, sino como la ausencia de dolor físico (*aponía*) y la tranquilidad espiritual o serenidad del alma (*ataraxia*).\n\n3. Ética Deontológica o del Deber (Immanuel Kant):\n   - Ética autónoma y formal: El valor moral de un acto radica exclusivamente en la **buena voluntad** y en el cumplimiento estricto del deber por respeto a la ley moral, sin buscar recompensas materiales ni felicidades sensibles.\n   - **Imperativo Categórico**: *'Obra solo según aquella máxima por la cual puedas querer que al mismo tiempo se convierta en ley universal'* y *'Trata a la humanidad siempre como un fin en sí misma y nunca meramente como un medio'*.\n\n4. Utilitarismo (Jeremy Bentham y John Stuart Mill):\n   - Ética teleológica y consecuencialista: Una acción es moralmente buena si promueve **la mayor felicidad o placer para el mayor número de personas**.",
                conceptosClave = listOf(
                    "Eudemonismo aristotélico: Felicidad como fin supremo y la virtud como justo medio (mesótes)",
                    "Hedonismo epicúreo: Serenidad del alma (ataraxia) y ausencia de dolor (aponía)",
                    "Deontologismo kantiano: Cumplimiento del deber por el deber; Imperativo Categórico universalizable",
                    "Utilitarismo: El mayor bienestar para la mayor cantidad de seres sintientes (Bentham y Mill)"
                ),
                formulas = listOf(
                    "\\text{Virtud Moral (Aristóteles)} = \\text{Término Medio} \\; [\\text{Defecto} \\leftrightarrow \\text{Exceso}]",
                    "\\text{Imperativo Categórico (Kant)}: \\; \\text{Obra de modo que tu máxima sea ley universal}"
                ),
                formulaName = "Modelos Éticos Fundamentales",
                formulaLatex = "\\text{Eudemonismo (Felicidad)} \\quad \\mid \\quad \\text{Hedonismo (Ataraxia)} \\quad \\mid \\quad \\text{Deontologismo (Deber puro)}",
                formulaDescription = "Principales concepciones de la fundamentación de la moralidad en Occidente.",
                admissionTip = "Si te piden la ética del 'Justo Medio', marca ARISTÓTELES (Eudemonismo). Si te piden la ética que ordena 'actuar por deber incondicional' con un imperativo categórico, marca KANT.",
                admissionExplanation = "• Kant diferenció los imperativos hipotéticos ('si quieres X, haz Y') del imperativo categórico moral ('debes hacer X incondicionalmente')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la ética aristotélica, la virtud ética de la valentía se define como:",
                    options = listOf(
                        "El desprecio absoluto hacia la vida terrenal",
                        "El justo término medio entre la cobardía por defecto y la temeridad por exceso",
                        "La búsqueda de la mayor cantidad de placeres sensoriales",
                        "La sumisión incondicional a los mandatos de los dioses de la polis",
                        "El cumplimiento de un imperativo categórico formal"
                    ),
                    correctIndex = 1,
                    explanation = "Aristóteles definió la virtud como el término medio (mesótes) entre dos vicios: uno por defecto (cobardía) y otro por exceso (temeridad).",
                    subject = "Filosofía",
                    semana = 10
                ),
                Challenge(
                    id = "q_fil_t10_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La máxima ética kantiana que ordena 'actúa de tal manera que trates a la humanidad, tanto en tu persona como en la de cualquier otro, siempre como un fin y nunca simplemente como un medio' formula el principio del:",
                    options = listOf("Imperativo hipotético instrumental", "Eudemonismo intelectual", "Imperativo categórico", "Pragmatismo utilitario", "Hedonismo espiritual"),
                    correctIndex = 2,
                    explanation = "Es la segunda formulación del Imperativo Categórico de Kant, que consagra la dignidad inalienable de toda persona humana como fin supremo.",
                    subject = "Filosofía",
                    semana = 10
                )
            )
        ),

        LessonNode(
            id = "fil_t10_s02",
            subjectId = "filosofia",
            semana = 10,
            subtema = "10.2 Teorías Éticas Contemporáneas: Emotivismo, Utilitarismo de Preferencias y Ética del Discurso",
            title = "Ética Discursiva de Habermas, Peter Singer y el Relativismo Moral",
            theory = LessonTheory(
                id = "th_fil_t10_s02",
                asignatura = "Filosofía",
                semana = 10,
                titulo = "Doctrinas Éticas Contemporáneas",
                resumen = "1. La Ética del Discurso o Ética Comunicativa (Jürgen Habermas y Karl-Otto Apel):\n   - Supera el subjetivismo moral formulando principios éticos válidos para todos a través del diálogo racional y libre de coacciones.\n   - Principio de Universalización: Una norma moral es válida solo si todos los afectados pueden aceptarla racionalmente en una situación ideal de discurso (argumentación libre).\n   - Principio Ético-Discursivo: Solo son válidas las normas que conseguirían la aprobación de todos los participantes en un discurso práctico racional ideal.\n\n2. Utilitarismo de Preferencias (Peter Singer):\n   - Extensión del utilitarismo a todos los seres sintientes (animales incluidos).\n   - Criterio de moralidad: Maximizar la satisfacción de las preferencias de todos los seres capaces de tener intereses.\n   - Consecuencias: Crítica al especismo (discriminar seres por especie) y defensa de los derechos de los animales.\n\n3. Relativismo Moral (Protágoras, sofistas modernos):\n   - Los valores y normas morales son relativos a cada cultura, época o individuo y no existe ningún estándar moral absoluto y universal.\n   - Se opone al absolutismo moral (Kant, religiones) que afirma la existencia de normas universales.\n\n4. Liberalismo Político y Ética de la Virtud:\n   - Ética de la Virtud (Alasdair MacIntyre): Recupera el eudemonismo aristotélico enfrentando el vacío moral del liberalismo individualista moderno.",
                conceptosClave = listOf(
                    "Ética del Discurso (Habermas): Validez moral por consenso racional libre de todos los afectados",
                    "Utilitarismo de Preferencias (Singer): Maximizar intereses de todos los seres sintientes",
                    "Especismo: Discriminación moral basada en la especie biológica",
                    "Relativismo moral: Las normas éticas varían según cultura, época o individuo"
                ),
                formulas = listOf(
                    "\\text{Habermas}: \\; \\text{Norma Válida} \\iff \\text{Consenso Racional de Todos los Afectados}"
                ),
                formulaName = "Principio de Universalización Discursiva",
                formulaLatex = "\\text{Ética del Discurso} = \\text{Argumentación Libre} + \\text{Universalización} + \\text{Consenso}",
                formulaDescription = "Fundamento comunicativo y deliberativo de la validez normativa en la ética contemporánea.",
                admissionTip = "Si la pregunta plantea que las normas morales se validan a través del diálogo racional libre entre todos los afectados, marca HABERMAS (Ética del Discurso).",
                admissionExplanation = "• Peter Singer extiende el principio de igual consideración de intereses más allá de los humanos hacia todos los seres capaces de sentir placer y dolor."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la ética del discurso de Jürgen Habermas, una norma moral es considerada universalmente válida cuando:",
                    options = listOf(
                        "La dictan los líderes políticos con mayor autoridad",
                        "Coincide con las costumbres de la mayoría de las culturas",
                        "Puede ser aceptada libremente por todos los afectados en un discurso racional sin coacciones",
                        "Se basa en el mandato de la ley natural divina revelada",
                        "Maximiza la felicidad del mayor número de individuos posible"
                    ),
                    correctIndex = 2,
                    explanation = "Habermas fundamenta la validez moral en el consenso racional alcanzado en condiciones ideales de comunicación sin presiones ni asimetrías de poder.",
                    subject = "Filosofía",
                    semana = 10
                ),
                Challenge(
                    id = "q_fil_t10_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La postura ética que afirma que no existen principios morales universales válidos para todos y que las normas de conducta varían según la cultura, el tiempo histórico o el individuo se denomina:",
                    options = listOf("Absolutismo moral", "Relativismo moral", "Deontologismo kantiano", "Eudemonismo", "Utilitarismo clásico"),
                    correctIndex = 1,
                    explanation = "El relativismo moral sostiene que los juicios éticos son relativos a los contextos culturales e históricos y niega la existencia de un código moral universal absoluto.",
                    subject = "Filosofía",
                    semana = 10
                )
            )
        ),

        // =========================================================================
        // TEMA 11: AXIOLOGÍA Y TEORÍA DEL VALOR (SEMANA 11)
        // =========================================================================
        LessonNode(
            id = "fil_t11_s01",
            subjectId = "filosofia",
            semana = 11,
            subtema = "11.1 El Acto Valorativo y las Propiedades del Valor",
            title = "Naturaleza del Valor: Polaridad, Jerarquía, Graduación e Infinitud",
            theory = LessonTheory(
                id = "th_fil_t11_s01",
                asignatura = "Filosofía",
                semana = 11,
                titulo = "Axiología: El Acto Valorativo",
                resumen = "• El Juicio de Existencia vs. Juicio de Valor:\n  - Juicio de Existencia (Contemplativo): Describe las propiedades objetivas del objeto de forma neutra (*'Esta mesa es de madera de cedro'*).\n  - Juicio de Valor (Estimativo): Manifiesta una adhesión, agrado, aprecio, reproche o rechazo afectivo frente al objeto (*'Esta mesa es hermosa'*).\n\n• Características Fundamentales del Valor:\n  1. Polaridad: Todo valor se presenta necesariamente desdoblado en un polo positivo y un contravalor o polo negativo (bueno/malo, bello/feo, justo/injusto, sagrado/profano).\n  2. Jerarquía: Los valores no son todos iguales; guardan entre sí relaciones de superioridad e inferioridad según una tabla axiológica (Max Scheler: Sensoriales < Vitales < Espirituales < Religiosos).\n  3. Graduación: Intensidad cuantitativa o cualitativa con que se realiza un valor en una situación concreta (excelente, muy bueno, regular, malo, pésimo).\n  4. Inagotabilidad / Infinitud: Ningún objeto material agota la plenitud absoluta del valor en sí mismo.",
                conceptosClave = listOf(
                    "Juicio de Existencia (neutro/descriptivo) vs. Juicio de Valor (estimativo/afectivo)",
                    "Polaridad: Pareja inseparable de valor positivo y contravalor negativo",
                    "Jerarquía: Ordenación de valores inferiores a superiores (Scheler)",
                    "Graduación: Intensidad de manifestación del valor"
                ),
                formulas = listOf(
                    "\\text{Juicio de Existencia} = \\text{Objeto es X (Neutro)}, \\quad \\text{Juicio de Valor} = \\text{Objeto es Bueno/Malo (Estimativo)}"
                ),
                formulaName = "Tríada Axiológica Formal",
                formulaLatex = "\\text{Valor} = \\text{Polaridad} + \\text{Jerarquía} + \\text{Graduación}",
                formulaDescription = "Propiedades intrínsecas del acto valorativo en la experiencia humana.",
                admissionTip = "Si una proposición describe un hecho comprobable ('el cuadro mide dos metros'), es juicio de EXISTENCIA. Si juzga su mérito ('el cuadro es una obra de arte deslumbrante'), es juicio de VALOR.",
                admissionExplanation = "• Max Scheler propuso que los valores religiosos (lo santo y lo profano) son los más elevados en la jerarquía axiológica humana."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la proposición que expresa de forma inequívoca un juicio de valor:",
                    options = listOf(
                        "El volcán Misti tiene una altitud de 5822 metros.",
                        "La novela 'Conversación en La catedral' fue escrita en 1969.",
                        "Esa sentencia judicial dictada por el tribunal es profundamente injusta.",
                        "El agua destilada hierve a cien grados Celsius al nivel del mar.",
                        "Arequipa es la capital del departamento homónimo."
                    ),
                    correctIndex = 2,
                    explanation = "La afirmación 'es profundamente injusta' califica moralmente un acto exteriorizando un juicio de valor axiológico, a diferencia de los juicios de existencia fácticos.",
                    subject = "Filosofía",
                    semana = 11
                ),
                Challenge(
                    id = "q_fil_t11_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La propiedad del valor que establece que una obra de arte no es solo bella, sino que puede ser calificada de sublime, regular o mediocre se denomina:",
                    options = listOf("Polaridad", "Jerarquía", "Graduación", "Objetividad", "Heteronomía"),
                    correctIndex = 2,
                    explanation = "La graduación mide la escala o intensidad variable con que un determinado valor se concreta en un objeto particular.",
                    subject = "Filosofía",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "fil_t11_s02",
            subjectId = "filosofia",
            semana = 11,
            subtema = "11.2 Teorías sobre el Fundamento del Valor: Subjetivismo vs. Objetivismo",
            title = "El Origen del Valor: Hedonismo, Emotivismo de Ayer y Objetivismo de Scheler",
            theory = LessonTheory(
                id = "th_fil_t11_s02",
                asignatura = "Filosofía",
                semana = 11,
                titulo = "Teorías Axiológicas",
                resumen = "El problema axiológico cardinal es: ¿Las cosas tienen valor porque las deseamos, o las deseamos porque tienen valor?\n\n1. Subjetivismo Axiológico:\n   - El valor no existe en las cosas por sí mismas; es una proyección del agrado, deseo, interés o emoción del sujeto cognoscente.\n   - Corrientes subjetivistas:\n     * Hedonismo (Epicuro): Es valioso lo que produce placer sensorial o espiritual.\n     * Utilitarismo: Es valioso lo que resulta útil para el bienestar de la colectividad.\n     * Emotivismo (Alfred Jules Ayer): Los juicios de valor no afirman nada de la realidad ni son verdaderos ni falsos; son meras expresiones de emociones subjetivas para contagiar un sentimiento (*'¡Viva la justicia!'*).\n\n2. Objetivismo Axiológico:\n   - Los valores son **entidades objetivas independientes del sujeto** que los descubre o contempla.\n   - Corrientes objetivistas:\n     * Objetivismo Idealista (Platón, Max Scheler, Nicolai Hartmann): Los valores son cualidades ideales inmateriales y absolutas (*'A priori'*) que no cambian con el tiempo ni con los gustos humanos.\n     * Objetivismo Naturalista: El valor reside en las propiedades físicas reales del objeto mismo.",
                conceptosClave = listOf(
                    "Subjetivismo: El sujeto atribuye valor según su deseo, placer o interés",
                    "Emotivismo de Ayer: Los juicios de valor son descargas emotivas sin valor veritativo",
                    "Objetivismo de Max Scheler: Los valores son esencias ideales percibidas por la intuición emocional",
                    "Dilema: ¿Deseamos lo valioso o es valioso porque lo deseamos?"
                ),
                formulas = listOf(
                    "\\text{Subjetivismo}: \\; \\text{Sujeto Desea X} \\implies \\text{X es Valioso}",
                    "\\text{Objetivismo}: \\; \\text{X posee Valor en sí} \\implies \\text{El Sujeto lo capta y estima}"
                ),
                formulaName = "Dilema Fundamental de la Axiología",
                formulaLatex = "\\text{Subjetivismo (Interés del Sujeto)} \\quad \\text{vs} \\quad \\text{Objetivismo (Esencia del Objeto)}",
                formulaDescription = "Antagonismo central sobre el fundamento ontológico de los valores.",
                admissionTip = "Si la tesis afirma que 'el oro vale porque los hombres lo codician y desean poseerlo', es SUBJETIVISMO. Si afirma que 'la honestidad vale por sí misma aunque nadie en el mundo sea honesto', es OBJETIVISMO.",
                admissionExplanation = "• Max Scheler afirmó que captamos los valores no por la razón lógica ni por los sentidos corporales, sino a través de una intuición pura emocional ('sentimiento del valor')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La postura axiológica que sostiene que las cosas poseen valor en sí mismas como esencias ideales independientes de los caprichos o deseos del ser humano es el:",
                    options = listOf("Subjetivismo hedonista", "Emotivismo radical", "Objetivismo axiológico", "Relativismo cultural", "Pragmatismo utilitario"),
                    correctIndex = 2,
                    explanation = "El objetivismo axiológico (representado por Platón y Max Scheler) postula que los valores existen objetivamente con independencia del agrado del sujeto.",
                    subject = "Filosofía",
                    semana = 11
                ),
                Challenge(
                    id = "q_fil_t11_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para el filósofo neopositivista Alfred Jules Ayer, los enunciados morales como 'matar es abominable':",
                    options = listOf(
                        "Son proposiciones científicas empíricamente contrastables",
                        "Son verdades lógicas indemostrables de la razón pura",
                        "Son expresiones de emociones subjetivas que no tienen valor de verdad ni falsedad",
                        "Son dictados indiscutibles de la ley natural revelada",
                        "Son juicios sintéticos a priori de la moral universal"
                    ),
                    correctIndex = 2,
                    explanation = "El emotivismo de Ayer postula que los juicios éticos no describen hechos sino que expresan sentimientos de aprobación o desaprobación emotiva.",
                    subject = "Filosofía",
                    semana = 11
                )
            )
        ),

        // =========================================================================
        // TEMA 12: FILOSOFÍA POLÍTICA (SEMANA 12)
        // =========================================================================
        LessonNode(
            id = "fil_t12_s01",
            subjectId = "filosofia",
            semana = 12,
            subtema = "12.1 Teorías del Contrato Social: Hobbes, Locke y Rousseau",
            title = "El Origen del Estado: Leviatán Absoluto, Liberalismo de Locke y Voluntad General",
            theory = LessonTheory(
                id = "th_fil_t12_s01",
                asignatura = "Filosofía",
                semana = 12,
                titulo = "El Contractualismo y el Origen del Estado Moderno",
                resumen = "El contractualismo explica el surgimiento de la sociedad civil y el Estado a través de un pacto voluntario entre individuos libres:\n\n1. Thomas Hobbes (*Leviatán*, 1651):\n   - Estado de Naturaleza: El hombre es egoísta y agresivo por naturaleza (*'El hombre es el lobo del hombre'* - *Homo homini lupus*). Vive en un estado de guerra permanente de todos contra todos por miedo a la muerte violenta.\n   - El Contrato: Los hombres renuncian a su libertad individual y la ceden a un soberano absoluto indivisible (**El Leviatán**) a cambio de orden, paz y seguridad.\n\n2. John Locke (*Segundo tratado sobre el gobierno civil*, 1689):\n   - Estado de Naturaleza: Los seres humanos gozan por ley natural de **derechos inalienables a la Vida, la Libertad y la Propiedad Privada**, pero falta un juez imparcial que resuelva disputas.\n   - El Contrato: Crean el Estado liberal representativo cuya única misión es salvaguardar los derechos naturales. Si el gobernante los vulnera, el pueblo tiene **derecho de resistencia o rebelión legítima**.\n\n3. Jean-Jacques Rousseau (*El contrato social*, 1762):\n   - Estado de Naturaleza: El hombre nace bueno, libre y feliz por naturaleza (*el buen salvaje*); la sociedad corrompida y la propiedad privada engendran la desigualdad y la opresión.\n   - El Contrato: Todos los ciudadanos se unen alienando sus voluntades particulares para conformar la **Voluntad General**, instituyendo la democracia directa soberana.",
                conceptosClave = listOf(
                    "Thomas Hobbes: Leviatán absolutista para frenar la guerra de todos contra todos (Homo homini lupus)",
                    "John Locke: Padre del liberalismo político; defensa de la vida, libertad y propiedad privada",
                    "Derecho de rebelión legítima en Locke cuando el Estado viola los derechos fundamentales",
                    "Jean-Jacques Rousseau: El buen salvaje corrompido por la sociedad y la Voluntad General democrática"
                ),
                formulas = listOf(
                    "\\text{Hobbes}: \\; \\text{Estado de Naturaleza (Guerra)} \\implies \\text{Pacto} \\to \\text{Leviatán Absoluto}",
                    "\\text{Locke}: \\; \\text{Derechos Naturales (Vida, Libertad, Propiedad)} \\implies \\text{Pacto} \\to \\text{Estado Liberal Limitado}"
                ),
                formulaName = "Matriz Contractualista Clásica",
                formulaLatex = "\\text{Hobbes (Seguridad Absoluta)} \\quad \\mid \\quad \\text{Locke (Propiedad y Libertad)} \\quad \\mid \\quad \\text{Rousseau (Voluntad General)}",
                formulaDescription = "Modelos teóricos de fundamentación y legitimidad del poder político estatal.",
                admissionTip = "Recuerda: Hobbes justifica el absolutismo; Locke es el padre del liberalismo clásico y la división de poderes; Rousseau funda la soberanía democrática popular.",
                admissionExplanation = "• John Locke inspiró decisivamente la Declaración de Independencia de los Estados Unidos y la Constitución liberal moderna."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t12_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El filósofo contractualista que afirmó en su obra 'Leviatán' que en el estado de naturaleza 'el hombre es el lobo del hombre' (Homo homini lupus) viviendo en una guerra de todos contra todos fue:",
                    options = listOf("John Locke", "Jean-Jacques Rousseau", "Thomas Hobbes", "Barón de Montesquieu", "Immanuel Kant"),
                    correctIndex = 2,
                    explanation = "Thomas Hobbes justificó la necesidad de un Estado absolutista centralizado e indivisible para evitar la anarquía y la violencia destructiva del estado natural.",
                    subject = "Filosofía",
                    semana = 12
                ),
                Challenge(
                    id = "q_fil_t12_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para John Locke, los derechos naturales inalienables que todo individuo posee por nacimiento y que el Estado civil tiene la obligación irrevocable de proteger son:",
                    options = listOf(
                        "El poder, la gloria y la riqueza",
                        "La vida, la libertad y la propiedad privada",
                        "La fe, la caridad y la esperanza",
                        "La soberanía, la igualdad y la sumisión",
                        "El honor, la obediencia y la tradición"
                    ),
                    correctIndex = 1,
                    explanation = "Locke postuló que los derechos prepolíticos fundamentales del individuo son el derecho a la vida, a la libertad personal y a la propiedad adquirida con el trabajo.",
                    subject = "Filosofía",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "fil_t12_s02",
            subjectId = "filosofia",
            semana = 12,
            subtema = "12.2 Teorías de la Justicia Contemporáneas: John Rawls",
            title = "Justicia como Equidad: El Velo de Ignorancia y los Principios de Justicia",
            theory = LessonTheory(
                id = "th_fil_t12_s02",
                asignatura = "Filosofía",
                semana = 12,
                titulo = "La Teoría de la Justicia de John Rawls",
                resumen = "En su célebre obra *Teoría de la justicia* (1971), John Rawls revitalizó el contractualismo para fundar una sociedad justa y equitativa frente al utilitarismo:\n\n1. La Posición Original y el Velo de Ignorancia (*Veil of Ignorance*):\n   - Es un experimento mental normativo: Los representantes de la sociedad deliberan las reglas fundamentales de convivencia bajo un **velo de ignorancia**, es decir, ignorando su futura clase social, riqueza, género, raza, talentos naturales o estatus.\n   - Como nadie sabe si le tocará nacer rico o indigente, sano o discapacitado, todos eligen racionalmente principios justos que protejan al grupo social menos favorecido (*criterio Maximin*).\n\n2. Los Dos Principios de la Justicia como Equidad:\n   - **Primer Principio (Principio de Igual Libertad)**: Toda persona tiene derecho irrevocable al esquema más amplio de libertades básicas fundamentales compatible con una libertad similar para todos (expresión, voto, asociación).\n   - **Segundo Principio (De la Desigualdad Justa)**: Las desigualdades socioeconómicas solo son tolerables moralmente si cumplen dos requisitos:\n     a) Principio de la Diferencia: Deben redundar en el mayor beneficio posible de los miembros **menos aventajados** de la sociedad.\n     b) Igualdad Equitativa de Oportunidades: Todos los puestos y cargos deben estar abiertos a todos en condiciones de justa competencia.",
                conceptosClave = listOf(
                    "John Rawls: 'Teoría de la justicia' (1971) y la justicia como equidad",
                    "Velo de Ignorancia: Experimento mental de imparcialidad moral pura",
                    "Principio de Igual Libertad: Libertades básicas absolutas para todos",
                    "Principio de Diferencia: Desigualdades válidas solo si favorecen a los más vulnerables"
                ),
                formulas = listOf(
                    "\\text{Justicia como Equidad} = \\text{Principio de Igual Libertad} + \\text{Principio de la Diferencia (Maximin)}"
                ),
                formulaName = "Ecuación de la Posición Original de Rawls",
                formulaLatex = "\\text{Velo de Ignorancia} \\implies \\text{Imparcialidad Racional} \\to \\text{Protección del Menos Aventajado}",
                formulaDescription = "Garantía de neutralidad y equidad distributiva en la fundamentación del pacto social.",
                admissionTip = "El 'velo de ignorancia' de John Rawls es un recurso heurístico que asegura que los principios de justicia se elijan sin sesgos egoístas ni privilegios de clase.",
                admissionExplanation = "• Rawls se opone al utilitarismo porque este último permitiría el sacrificio de los derechos de una minoría vulnerable si ello maximiza el bienestar general."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t12_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la filosofía política contemporánea de John Rawls, el concepto heurístico mediante el cual los participantes desconocen su posición social, talentos y riquezas para pactar principios de justicia imparciales se denomina:",
                    options = listOf(
                        "Estado de naturaleza hobbesiano",
                        "Voluntad general ilustrada",
                        "El velo de ignorancia",
                        "La mano invisible del mercado",
                        "La dictadura del proletariado"
                    ),
                    correctIndex = 2,
                    explanation = "El velo de ignorancia es el artificio metodológico de la posición original que garantiza que nadie diseñe principios para beneficiar su situación particular.",
                    subject = "Filosofía",
                    semana = 12
                ),
                Challenge(
                    id = "q_fil_t12_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según el 'Principio de la Diferencia' formulado por John Rawls, las desigualdades socioeconómicas son moralmente justas únicamente si:",
                    options = listOf(
                        "Generan la máxima acumulación de capital para los empresarios",
                        "Redundan en el mayor beneficio de los sectores menos aventajados de la sociedad",
                        "Son eliminadas de manera forzada por un régimen absolutista",
                        "Responden al orden natural inmutable de las clases sociales",
                        "Aumentan la riqueza de la mayoría aunque perjudiquen a los indigentes"
                    ),
                    correctIndex = 1,
                    explanation = "El principio de la diferencia estipula que las desigualdades solo se justifican si mejoran la situación de los miembros más desfavorecidos de la sociedad.",
                    subject = "Filosofía",
                    semana = 12
                )
            )
        ),

        // =========================================================================
        // TEMA 13: ANTROPOLOGÍA FILOSÓFICA (SEMANA 13)
        // =========================================================================
        LessonNode(
            id = "fil_t13_s01",
            subjectId = "filosofia",
            semana = 13,
            subtema = "13.1 Doctrinas sobre el Origen y la Esencia del Hombre",
            title = "Naturaleza Humana: Animal Racional, Homo Faber y Animal Simbólico",
            theory = LessonTheory(
                id = "th_fil_t13_s01",
                asignatura = "Filosofía",
                semana = 13,
                titulo = "La Esencia del Ser Humano",
                resumen = "La antropología filosófica indaga sobre la pregunta kantiana fundamental: *¿Qué es el hombre?*\n\n1. Doctrinas sobre la Esencia Humana:\n   - **Animal Racional (Aristóteles)**: El ser humano se define por su capacidad intelectiva racional (*logos*) y su inclinación natural a vivir en sociedad (*zoon politikon* = animal político).\n   - **Homo Faber / Ser Práctico (Karl Marx)**: La esencia humana no es una idea metafísica estática abstracta; el hombre se define por el **trabajo y la producción material transformadora** de la naturaleza (*'El hombre se hace a sí mismo mediante el trabajo social'*).\n   - **Animal Simbólico (Ernst Cassirer)**:\n     * En su obra *Antropología filosófica* (1944), sostiene que el hombre no vive solo en un universo puramente físico o biológico, sino en un **universo simbólico**.\n     * Entre el estímulo del medio ambiente y la respuesta del hombre se intercala un sistema simbólico compuesto por el lenguaje, el mito, la religión, el arte, la ciencia y la historia.\n   - **Ser Espiritual (Max Scheler)**: El hombre se distingue de los animales porque posee espíritu (*Geist*), capacidad de decir 'no' a los impulsos biológicos y abrirse libremente al cosmos.\n   - **El Hombre como Proyecto de Libertad (Jean-Paul Sartre)**: El ser humano no tiene una esencia fija predeterminada; es existencia pura que se autoconstruye con sus elecciones conscientes.",
                conceptosClave = listOf(
                    "Aristóteles: Animal racional (logos) y animal político (zoon politikon)",
                    "Karl Marx: Homo faber (el hombre se produce y autorrealiza a través del trabajo)",
                    "Ernst Cassirer: Animal simbólico (el lenguaje, arte, mito y ciencia median la realidad)",
                    "Jean-Paul Sartre: El hombre carece de naturaleza fija; es un proyecto libre"
                ),
                formulas = listOf(
                    "\\text{Cassirer}: \\; \\text{Ser Humano} = \\text{Animal Simbólico (Lenguaje + Mito + Arte + Ciencia)}",
                    "\\text{Marx}: \\; \\text{Esencia Humana} = \\text{Conjunto de las Relaciones Sociales de Producción}"
                ),
                formulaName = "Modelos Antropológicos Fundamentales",
                formulaLatex = "\\text{Hombre} \\implies \\text{Zoon Politikon} \\; \\mid \\; \\text{Homo Faber} \\; \\mid \\; \\text{Animal Simbólico} \\; \\mid \\; \\text{Libertad}",
                formulaDescription = "Concepciones cardinales de la condición humana en la historia de la filosofía.",
                admissionTip = "Si la pregunta señala que el ser humano media su relación con el mundo mediante el lenguaje, el arte y el mito, marca ERNST CASSIRER (Animal simbólico).",
                admissionExplanation = "• Para Sartre, afirmar que 'el hombre nace con un destino o naturaleza predeterminada' es actuar con mala fe (mauvaise foi)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t13_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El filósofo neokantiano que definió al ser humano no simplemente como animal racional, sino como un 'animal simbólico' que habita un universo cultural mediado por el lenguaje, el mito y el arte fue:",
                    options = listOf("Max Scheler", "Ernst Cassirer", "Martin Heidegger", "Jean-Paul Sartre", "Friedrich Nietzsche"),
                    correctIndex = 1,
                    explanation = "Ernst Cassirer formuló en su 'Antropología filosófica' que la característica distintiva del ser humano radica en su capacidad de crear y habitar un universo simbólico.",
                    subject = "Filosofía",
                    semana = 13
                ),
                Challenge(
                    id = "q_fil_t13_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según la concepción materialista histórica de Karl Marx, la esencia humana se manifiesta primordialmente a través de:",
                    options = listOf(
                        "La contemplación mística de las verdades divinas",
                        "La producción material y la transformación consciente de la naturaleza mediante el trabajo",
                        "El seguimiento pasivo de las leyes de la naturaleza biológica",
                        "La búsqueda incondicionada del placer hedonista corporal",
                        "La resignación espiritual ante el destino inexorable"
                    ),
                    correctIndex = 1,
                    explanation = "Para Marx, el ser humano se distingue de los animales cuando comienza a producir sus propios medios de subsistencia mediante el trabajo social transformador.",
                    subject = "Filosofía",
                    semana = 13
                )
            )
        ),
        LessonNode(
            id = "fil_t13_s02",
            subjectId = "filosofia",
            semana = 13,
            subtema = "13.2 Cuerpo y Alma: El Problema Mente-Cuerpo y la Persona en la Filosofía Contemporánea",
            title = "Dualismo Cartesiano, Monismo Materialista y Filosofía de la Mente",
            theory = LessonTheory(
                id = "th_fil_t13_s02",
                asignatura = "Filosofía",
                semana = 13,
                titulo = "El Problema Mente-Cuerpo y el Concepto de Persona",
                resumen = "• El Problema Mente-Cuerpo (o Problema de la Conciencia):\n  Es uno de los grandes problemas no resueltos de la filosofía y las neurociencias: ¿Cuál es la relación entre los estados mentales (conciencia, emociones, voluntad) y los estados físicos del cerebro?\n\n• Posiciones Filosóficas Clásicas:\n  1. Dualismo de Substancias (Descartes):\n     - Mente (res cogitans) y cuerpo (res extensa) son sustancias radicalmente distintas. El problema del interaccionismo: ¿cómo interactúan dos sustancias tan diferentes?\n  2. Monismo Materialista Reduccionista:\n     - Los estados mentales son idénticos a estados cerebrales (Teoría de la Identidad Mental — Place, Smart). La mente es un producto de la materia organizada.\n  3. Funcionalismo (Hilary Putnam):\n     - Los estados mentales se definen por sus funciones causales (inputs, outputs), no por el sustrato material; pueden realizarse en distintos sustratos (humanos, robots).\n  4. Emergentismo:\n     - La conciencia es una propiedad emergente del sistema nervioso complejo que no es reducible a sus partes físicas.\n\n• El Concepto de Persona:\n  - Boecio: 'Persona es una sustancia individual de naturaleza racional'.\n  - Kant: La persona es un fin en sí misma y nunca un medio (Imperativo Categórico); posee dignidad inalienable.\n  - Sartre: La persona no tiene una esencia fija dada; se autoconstruye con sus actos libres.\n  - Filosofía de la Liberación (Dussel): La dignidad de la persona oprimida exige una ética de la alteridad y la responsabilidad.",
                conceptosClave = listOf(
                    "Problema mente-cuerpo: Relación entre estados mentales y estados físicos del cerebro",
                    "Dualismo cartesiano (mente/cuerpo) vs. Monismo materialista (la mente es el cerebro)",
                    "Funcionalismo: Los estados mentales son funciones, no sustratos físicos específicos",
                    "Kant: La persona tiene dignidad inalienable (fin en sí misma, nunca solo un medio)"
                ),
                formulas = listOf(
                    "\\text{Kant}: \\; \\text{Persona} = \\text{Fin en Sí Misma} \\neq \\text{Medio Instrumental}"
                ),
                formulaName = "Dignidad de la Persona como Fin Absoluto",
                formulaLatex = "\\text{Mente} \\leftrightarrow \\text{Cerebro}: \\; \\text{Dualismo} \\; \\mid \\; \\text{Identidad} \\; \\mid \\; \\text{Funcionalismo} \\; \\mid \\; \\text{Emergencia}",
                formulaDescription = "Espectro de respuestas al problema de la relación entre conciencia y substrato neuronal.",
                admissionTip = "Si la pregunta dice 'la mente no es el cerebro, sino que es una sustancia diferente', es DUALISMO. Si dice 'la mente es simplemente el cerebro en funcionamiento', es MONISMO MATERIALISTA.",
                admissionExplanation = "• El funcionalismo permite la Inteligencia Artificial: si la mente es una función y no un sustrato, podría realizarse en silicio."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_fil_t13_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La posición filosófica que sostiene que los estados mentales (como el dolor o la alegría) son idénticos a estados neurales específicos del cerebro se denomina:",
                    options = listOf("Dualismo cartesiano", "Teoría de la identidad mental (monismo materialista)", "Funcionalismo múltiple", "Emergentismo radical", "Fenomenología transcendental"),
                    correctIndex = 1,
                    explanation = "La teoría de la identidad mental (tipo-identidad) postula que cada estado mental corresponde a un estado físico neural específico y reducible.",
                    subject = "Filosofía",
                    semana = 13
                ),
                Challenge(
                    id = "q_fil_t13_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según Immanuel Kant, la dignidad de la persona radica en que debe ser tratada siempre como:",
                    options = listOf(
                        "Un medio para maximizar la utilidad social colectiva",
                        "Un fin en sí misma, nunca solamente como un medio instrumental",
                        "Un reflejo condicionado de su herencia biológica evolutiva",
                        "Una entidad cuyo valor depende de su utilidad económica productiva",
                        "Una creación divina cuyo valor lo fija la autoridad religiosa"
                    ),
                    correctIndex = 1,
                    explanation = "El imperativo categórico de Kant en su formulación de la humanidad prohíbe instrumentalizar a las personas y exige reconocer su dignidad incondicionada como fines en sí mismas.",
                    subject = "Filosofía",
                    semana = 13
                )
            )
        )
    )
}
