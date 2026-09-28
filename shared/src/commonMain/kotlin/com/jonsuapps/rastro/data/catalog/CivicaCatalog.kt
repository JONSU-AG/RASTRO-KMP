package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object CivicaCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: LA PERSONA Y LA VIDA EN SOCIEDAD (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "civ_t01_s01",
            subjectId = "civica",
            semana = 1,
            subtema = "1.1 La Persona Humana: Dimensiones, Dignidad y Fin Supremo del Estado",
            title = "La Persona Humana, Dignidad y Estatus Constitucional (Art. 1°)",
            theory = LessonTheory(
                id = "th_civ_t01_s01",
                asignatura = "Ed. Cívica",
                semana = 1,
                titulo = "La Persona Humana y la Dignidad como Fin Supremo",
                resumen = "• La Persona Humana:\n  - Es un ser bio-psico-socio-espiritual dotado de conciencia, libre albedrío, racionalidad y dignidad inmanente.\n  - En el Derecho Civil peruano (Código Civil de 1984, Art. 1°), la persona humana es sujeto de derecho desde su nacimiento, pero la vida comienza con la **concepción** (el concebido es sujeto de derecho privilegiado para todo cuanto le favorece).\n\n• El Estatus Constitucional Supremo (Constitución de 1993, Artículo 1°):\n  - *'La defensa de la persona humana y el respeto de su dignidad son el fin supremo de la sociedad y del Estado'*.\n  - Consagra el **Principio Pro Homine** o Antropocéntrico: las instituciones públicas, las leyes y la economía existen en función de la persona humana, y no a la inversa.\n\n• La Dignidad Humana:\n  - Valor intrínseco, inalienable e inviolable que posee todo ser humano por el solo hecho de su condición ontológica.\n  - El Estado no otorga la dignidad: la **reconoce y tiene el deber irrenunciable de respetarla y protegerla**.\n\n• Dimensiones Integrales:\n  1. Biológica (integridad física y salud corporal).\n  2. Psicológica (autonomía anímica y proyectos vitales).\n  3. Social y Cívica (convivencia comunitaria y ciudadanía).\n  4. Ética y Espiritual (moralidad, libre albedrío y sentido de justicia).",
                conceptosClave = listOf(
                    "Artículo 1° Const.: La defensa de la persona y el respeto de su dignidad son el fin supremo",
                    "Principio Pro Homine: La sociedad y el Estado están al servicio del ser humano",
                    "El concebido es sujeto de derecho para todo cuanto le favorece (Art. 2° inc. 1)",
                    "Dignidad humana inmanente, inalienable e imprescriptible"
                ),
                formulas = listOf(
                    "\\text{Fin Supremo del Estado} = \\text{Defensa de la Persona} + \\text{Respeto de su Dignidad}",
                    "\\text{Sujeto de Derecho} \\to \\text{El Concebido (Fecundación)} \\; \\& \\; \\text{Persona Natural (Nacimiento)}"
                ),
                formulaName = "Principio Antropocéntrico Constitucional",
                formulaLatex = "\\text{Estado / Leyes / Economía} \\xrightarrow{\\text{Subordinación Axiológica}} \\text{Dignidad Humana}",
                formulaDescription = "Preeminencia ontológica de la persona humana sobre el poder público estatal.",
                admissionTip = "El Artículo 1° de la Constitución Política del Perú es el artículo más citado y preguntado en admisión UNSA: apréndelo de memoria de forma exacta.",
                admissionExplanation = "• La dignidad humana no admite excepciones; ni el criminal sentenciado pierde su dignidad esencial como ser humano."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el Artículo 1° de la Constitución Política del Perú de 1993, el fin supremo de la sociedad y del Estado es:",
                    options = listOf(
                        "El crecimiento económico sostenido del Producto Bruto Interno",
                        "La defensa de la persona humana y el respeto de su dignidad",
                        "La recaudación tributaria eficiente para obras públicas",
                        "La preservación absoluta del monopolio de la fuerza armada",
                        "La integración comercial con los bloques regionales internacionales"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 1° consagra expresamente que la defensa de la persona humana y el respeto de su dignidad son el fin supremo de la sociedad y del Estado.",
                    subject = "Ed. Cívica",
                    semana = 1
                ),
                Challenge(
                    id = "q_civ_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según el Código Civil peruano y el artículo 2° inciso 1 de la Constitución, la vida humana comienza con:",
                    options = listOf(
                        "La inscripción en el Registro Nacional de Identificación (RENIEC)",
                        "El nacimiento y el corte del cordón umbilical",
                        "La concepción",
                        "La adquisición de la mayoría de edad (18 años)",
                        "La emisión del Documento Nacional de Identidad (DNI)"
                    ),
                    correctIndex = 2,
                    explanation = "Tanto el Código Civil (Art. 1°) como la Constitución establecen que la vida humana comienza con la concepción.",
                    subject = "Ed. Cívica",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "civ_t01_s02",
            subjectId = "civica",
            semana = 1,
            subtema = "1.2 El Sistema de Normas de Convivencia: Morales, Jurídicas, Sociales y Religiosas",
            title = "Tipología y Características de las Normas de Convivencia Social",
            theory = LessonTheory(
                id = "th_civ_t01_s02",
                asignatura = "Ed. Cívica",
                semana = 1,
                titulo = "El Orden Normativo Social: Morales vs. Jurídicas",
                resumen = "• Las Normas de Convivencia:\n  Pautas y reglas de conducta que regulan las relaciones interpersonales para hacer posible la paz, el orden y la justicia en la comunidad.\n\n• Clasificación Canónica de las Normas:\n  1. Normas Morales:\n     - Origen interno (autónomas); dictadas por la propia conciencia ética individual.\n     - Unilaterales: Imponen deberes morales sin que exista un acreedor legal que exija su cumplimiento forzoso.\n     - Incoercibles: No admiten la fuerza física del Estado para imponerse; su sanción es el remordimiento interior o el reproche de conciencia.\n  2. Normas Jurídicas:\n     - Origen externo (heterónomas); emanadas del Estado a través de sus órganos legítimos (Congreso, Ejecutivo).\n     - Bilaterales: A una obligación jurídica le corresponde correlativamente una facultad o derecho exigible por otro sujeto.\n     - **Coercibles**: Respaldadas por el monopolio legítimo de la fuerza física estatal para exigir su cumplimiento forzoso o sancionar su infracción con penas privativas o multas.\n  3. Normas Sociales o Usos y Costumbres (Trato Social):\n     - Reglas de cortesía, etiqueta, moda y protocolo. Heterónomas e incoercibles; su sanción es el rechazo social, burla o marginación grupal.\n  4. Normas Religiosas:\n     - Prescripciones divinas reveladas por autoridades eclesiásticas; incoercibles externamente; su sanción es de carácter trascendente o espiritual (pecado, excomunión).",
                conceptosClave = listOf(
                    "Normas Jurídicas: Heterónomas, bilaterales, coercibles y sancionadas por el Estado",
                    "Normas Morales: Autónomas, unilaterales, incoercibles y de sanción interior",
                    "Coercibilidad: Posibilidad del uso legítimo de la fuerza pública estatal",
                    "Heteronomía: La regla es dictada por una voluntad exterior al individuo"
                ),
                formulas = listOf(
                    "\\text{Norma Jurídica} = \\text{Heteronomía} + \\text{Bilateralidad} + \\text{Coercibilidad Estatal}",
                    "\\text{Norma Moral} = \\text{Autonomía} + \\text{Unilateralidad} + \\text{Incoercibilidad (Remordimiento)}"
                ),
                formulaName = "Matriz Comparativa Normativa",
                formulaLatex = "\\text{Coerción} = \\text{Fuerza Estatal Legítima} \\iff \\text{Exclusivo de las Normas Jurídicas}",
                formulaDescription = "Criterio de demarcación fundamental entre el Derecho y la Moral.",
                admissionTip = "La 'coercibilidad' es la característica exclusiva y excluyente de las normas JURÍDICAS frente a las normas morales, religiosas y sociales.",
                admissionExplanation = "• Una norma jurídica sigue siendo válida aunque no coincida con los preceptos religiosos o morales particulares de un individuo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El rasgo privativo y distintivo de las normas jurídicas que las diferencia de las normas morales y de trato social es su carácter:",
                    options = listOf("Autónomo", "Coercible", "Unilateral", "Interior", "Imprescriptible"),
                    correctIndex = 1,
                    explanation = "La coercibilidad (posibilidad de aplicar la fuerza legítima del Estado para su cumplimiento) es exclusiva de las normas jurídicas.",
                    subject = "Ed. Cívica",
                    semana = 1
                ),
                Challenge(
                    id = "q_civ_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cuando decimos que una norma moral es 'autónoma', nos referimos a que:",
                    options = listOf(
                        "Es impuesta obligatoriamente por el Congreso de la República",
                        "Emana de la propia conciencia y juicio moral del individuo",
                        "Está respaldada por la fuerza armada del Estado",
                        "Se encuentra escrita taxativamente en el Código Penal",
                        "Solo se aplica a los ciudadanos extranjeros"
                    ),
                    correctIndex = 1,
                    explanation = "La autonomía moral significa que es el propio fuero interno de la persona quien reconoce y se autoimpone el deber ético.",
                    subject = "Ed. Cívica",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "civ_t01_s03",
            subjectId = "civica",
            semana = 1,
            subtema = "1.3 Valores Cívicos, Ética Ciudadana y Cultura de Paz",
            title = "Valores Democráticos: Justicia, Solidaridad, Tolerancia y Cultura de Paz",
            theory = LessonTheory(
                id = "th_civ_t01_s03",
                asignatura = "Ed. Cívica",
                semana = 1,
                titulo = "Axiología Cívica y Convivencia Democrática",
                resumen = "• Los Valores Cívicos Fundamentales:\n  Son principios éticos universales que orientan la conducta de los ciudadanos y la gestión de las instituciones públicas para consolidar el bien común y la convivencia pacífica.\n\n• Valores Cardinales de la Vida en Democracia:\n  1. La Justicia:\n     - Constante y perpetua voluntad de dar a cada cual lo que le corresponde según el Derecho y la equidad (Ulpiano).\n     - Justicia distributiva (equidad en la asignación de recursos) y conmutativa (equilibrio en las relaciones de reciprocidad).\n  2. La Solidaridad:\n     - Compromiso activo y cooperación fraterna con los miembros más vulnerables de la sociedad en situaciones de riesgo o emergencia.\n  3. La Tolerancia y el Respeto a la Diversidad:\n     - Reconocimiento y valoración positiva de las opiniones, creencias, identidades étnicas y cosmovisiones ajenas, siempre que respeten los derechos humanos.\n  4. La Libertad Responsable:\n     - Capacidad de actuar conforme al propio albedrío respetando el límite ineludible del derecho de los demás.\n  5. La Cultura de Paz:\n     - Conjunto de valores, actitudes y comportamientos que rechazan la violencia en todas sus formas y apuestan por la resolución dialógica y pacífica de los conflictos.",
                conceptosClave = listOf(
                    "Justicia: Voluntad de dar a cada quien lo suyo según el Derecho (Ulpiano)",
                    "Solidaridad y bien común como pilares de la cohesión social",
                    "Tolerancia democrática y respeto irrestricto al pluralismo ideológico",
                    "Cultura de paz y resolución no violenta de controversias comunitarias"
                ),
                formulas = listOf(
                    "\\text{Convivencia Democrática} = \\text{Justicia} + \\text{Tolerancia} + \\text{Solidaridad} + \\text{Legalidad}",
                    "\\text{Cultura de Paz} \\implies \\text{Diálogo Racional} \\neq \\text{Violencia / Coacción de Hecho}"
                ),
                formulaName = "Ecuación Axiológica Democrática",
                formulaLatex = "\\text{Paz Social} = \\text{Respeto de Derechos} \\oplus \\text{Cumplimiento de Deberes} \\oplus \\text{Equidad}",
                formulaDescription = "Armonía cívica basada en el estado constitucional de derecho y la ética ciudadana.",
                admissionTip = "La tolerancia democrática no implica tolerar la intolerancia ni conductas que vulneren los derechos fundamentales consagrados en la Constitución.",
                admissionExplanation = "• En los exámenes de Ceprunsa y Ordinario de la UNSA, las preguntas sobre valores cívicos suelen plantear dilemas éticos y casos de discriminación cotidiana."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El valor cívico que consiste en el reconocimiento y aceptación positiva de las diferencias ideológicas, religiosas y culturales dentro del marco democrático se denomina:",
                    options = listOf("Coerción", "Tolerancia", "Heteronomía", "Subsidiaridad", "Interdicción"),
                    correctIndex = 1,
                    explanation = "La tolerancia democrática es el respeto y valoración del pluralismo ideológico, cultural y de creencias en la vida en sociedad.",
                    subject = "Ed. Cívica",
                    semana = 1
                ),
                Challenge(
                    id = "q_civ_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el valor ético y jurídico clásico definido por el jurisconsulto romano Ulpiano como 'la constante y perpetua voluntad de dar a cada uno lo suyo'?",
                    options = listOf("Solidaridad", "Justicia", "Paz", "Autonomía", "Libertad negativa"),
                    correctIndex = 1,
                    explanation = "Ulpiano definió la justicia como 'constans et perpetua voluntas ius suum cuique tribuendi' (dar a cada cual lo que le corresponde).",
                    subject = "Ed. Cívica",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: CIUDADANÍA: DERECHOS Y DEBERES (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "civ_t02_s01",
            subjectId = "civica",
            semana = 2,
            subtema = "2.1 Concepto y Adquisición de la Ciudadanía (Art. 30°) y Características del Voto (Art. 31°)",
            title = "Adquisición de la Ciudadanía y Características Constitucionales del Sufragio",
            theory = LessonTheory(
                id = "th_civ_t02_s01",
                asignatura = "Ed. Cívica",
                semana = 2,
                titulo = "La Ciudadanía Peruana y el Derecho al Sufragio",
                resumen = "• Concepto de Ciudadanía:\n  Vínculo jurídico-político que une a una persona con el Estado, habilitándola para el ejercicio pleno de los derechos políticos y la participación en la conducción de los asuntos públicos.\n\n• Requisitos de Adquisición (Artículo 30° de la Constitución):\n  - Son ciudadanos los **peruanos mayores de dieciocho (18) años**.\n  - Para el ejercicio efectivo de la ciudadanía se requiere indispensablemente la **inscripción electoral** ante el RENIEC.\n\n• Características Constitucionales del Voto (Artículo 31° de la Constitución):\n  1. **Personal**: El voto no se delega; nadie puede sufragar por medio de apoderados.\n  2. **Igual**: Cada sufragio tiene idéntico valor aritmético (*un ciudadano, un voto*).\n  3. **Libre**: Emisión voluntaria sin coerción física, patronal o religiosa.\n  4. **Secreto**: Se garantiza la privacidad e inviolabilidad de la cámara secreta de sufragio.\n  5. **Obligatorio**: Es obligatorio desde los 18 hasta los **70 años cumplidos**. A partir de los 70 años deviene en **facultativo o voluntario** (los mayores de 70 años están exonerados de multas electorales).\n\n• Voto de las FF.AA. y PNP (Reforma Ley N.° 28480, 2005):\n  - Los miembros de las Fuerzas Armadas y Policía Nacional en actividad tienen derecho al voto, pero están **prohibidos de postular a cargos de elección popular** y de participar en actividades proselitistas partidarias.",
                conceptosClave = listOf(
                    "Artículo 30°: Ciudadanos peruanos mayores de 18 años con inscripción electoral",
                    "Características del voto: Personal, igual, libre, secreto y obligatorio hasta los 70 años",
                    "A partir de los 70 años el sufragio es facultativo (sin multa)",
                    "FF.AA. y PNP votan pero no pueden postular ni hacer proselitismo partidario"
                ),
                formulas = listOf(
                    "\\text{Ciudadanía Plena} = \\text{Nacionalidad Peruana} + \\text{Mayoría de Edad (18 años)} + \\text{Inscripción RENIEC}",
                    "\\text{Sufragio} \\to \\text{Obligatorio [18 a 70 años]} \\quad \\& \\quad \\text{Facultativo [> 70 años]}"
                ),
                formulaName = "Estatuto Electoral de la Ciudadanía",
                formulaLatex = "\\text{Voto} = \\text{Personal} \\; \\& \\; \\text{Igual} \\; \\& \\; \\text{Libre} \\; \\& \\; \\text{Secreto} \\; \\& \\; \\text{Obligatorio (18-70)}",
                formulaDescription = "Requisitos normativos del sufragio democrático según el artículo 31° constitucional.",
                admissionTip = "¡Cuidado con la edad del voto facultativo! No es a los 60 ni a los 65 años: el voto deja de ser obligatorio y pasa a ser facultativo a partir de los 70 AÑOS CUMPLIDOS.",
                admissionExplanation = "• Los peruanos residentes en el extranjero también votan para las elecciones presidenciales y para los dos escaños del distrito electoral de Peruanos en el Exterior."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 31° de la Constitución Política del Perú, el ejercicio del sufragio es obligatorio hasta la edad de:",
                    options = listOf("60 años", "65 años", "70 años", "75 años", "80 años"),
                    correctIndex = 2,
                    explanation = "El artículo 31° estipula textualmente que el voto es obligatorio hasta los setenta años; a partir de esa edad es facultativo.",
                    subject = "Ed. Cívica",
                    semana = 2
                ),
                Challenge(
                    id = "q_civ_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Respecto a los miembros de las Fuerzas Armadas y de la Policía Nacional del Perú en situación de actividad, la Constitución establece que:",
                    options = listOf(
                        "Tienen prohibido votar en cualquier proceso electoral",
                        "Tienen derecho al voto, pero no pueden postular a cargos de elección popular",
                        "Pueden postular a la Presidencia de la República sin pedir pase a retiro",
                        "Tienen la obligación de afiliarse a un partido político",
                        "Solo votan en elecciones de jueces de paz"
                    ),
                    correctIndex = 1,
                    explanation = "Desde la reforma de 2005, los miembros de las FF.AA. y PNP tienen derecho al voto, pero no pueden postular ni realizar actividades partidarias.",
                    subject = "Ed. Cívica",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "civ_t02_s02",
            subjectId = "civica",
            semana = 2,
            subtema = "2.2 Suspensión del Ejercicio de la Ciudadanía (Art. 33°) y Deberes Cívicos",
            title = "Causales de Suspensión de la Ciudadanía y Deberes Cívicos",
            theory = LessonTheory(
                id = "th_civ_t02_s02",
                asignatura = "Ed. Cívica",
                semana = 2,
                titulo = "Suspensión de la Ciudadanía y Deberes Constitucionales",
                resumen = "• Causales Taxativas de Suspensión de la Ciudadanía (Artículo 33° de la Constitución):\n  El ejercicio de la ciudadanía y el derecho de sufragio se suspenden **única y exclusivamente** por tres causales dictadas por el Poder Judicial:\n  1. Por **resolución judicial de interdicción** (declaración judicial de incapacidad mental o física absoluta para valerse por sí mismo).\n  2. Por **sentencia con pena privativa de la libertad** (durante el tiempo que dure la condena carcelaria efectiva o suspendida fijada en sentencia firme).\n  3. Por **sentencia con inhabilitación de los derechos políticos** (condena impuesta a funcionarios por delitos de corrupción o inhabilitación dictada por el Congreso tras juicio político, Art. 100°).\n\n• Los Deberes Cívicos y Constitucionales de los Ciudadanos (Artículos 38° y 44°):\n  - Honrar a la patria y proteger los intereses nacionales.\n  - Defender la Constitución Política y sus leyes legítimas.\n  - Contribuir al sostenimiento de los gastos públicos mediante el **pago de tributos** proporcionales y justos.\n  - Sufragar con conciencia cívica y cumplir con el servicio militar de acuerdo con la ley.\n  - Participar en la defensa civil y protección del medio ambiente.",
                conceptosClave = listOf(
                    "Artículo 33° Const.: Tres causales taxativas de suspensión judicial de la ciudadanía",
                    "Interdicción judicial: Incapacidad civil declarada por juez",
                    "Pena privativa de la libertad firme y consentida suspende el voto",
                    "Inhabilitación de derechos políticos por sentencia o juicio político",
                    "Artículo 38° Const.: Deber de defender la patria, la Constitución y tributar"
                ),
                formulas = listOf(
                    "\\text{Suspensión de Ciudadanía (Art. 33°)} = \\text{Interdicción} \\; \\lor \\; \\text{Pena de Cárcel} \\; \\lor \\; \\text{Inhabilitación Política}",
                    "\\text{Deberes Cívicos Fundamentales} = \\text{Defender la Constitución} + \\text{Tributar} + \\text{Honrar a la Patria}"
                ),
                formulaName = "Causales Constitucionales de Suspensión",
                formulaLatex = "\\text{Suspensión} \\iff \\text{Resolución Judicial Firme (Poder Judicial / Sentencia)}",
                formulaDescription = "Garantía de debido proceso: ningún órgano administrativo puede despojar a un ciudadano de su derecho de sufragio sin orden judicial.",
                admissionTip = "La pérdida de ciudadanía NO existe como sanción común; se suspende temporalmente por orden judicial en los tres casos taxativos del Art. 33°.",
                admissionExplanation = "• Cuando una persona recupera la libertad tras cumplir su condena penal, sus derechos ciudadanos y su habilitación en el padrón electoral se rehabilitan automáticamente."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes situaciones constituye una causal constitucional taxativa para la suspensión del ejercicio de la ciudadanía según el artículo 33°?",
                    options = listOf(
                        "Adeudar cuotas de pensión alimenticia en trámite",
                        "Sentencia penal con pena privativa de la libertad",
                        "Residir en el extranjero por más de cinco años continuos",
                        "No haber votado en las dos últimas elecciones municipales",
                        "Ser analfabeto al momento de tramitar el DNI"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 33° inc. 2 contempla expresamente la sentencia judicial firme con pena privativa de la libertad como causal de suspensión de la ciudadanía.",
                    subject = "Ed. Cívica",
                    semana = 2
                ),
                Challenge(
                    id = "q_civ_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 38° de la Carta Magna, todos los peruanos tienen el deber primordial de:",
                    options = listOf(
                        "Afiliarse a un sindicato laboral reconocido",
                        "Honrar a la patria, proteger los intereses nacionales y respetar la Constitución",
                        "Realizar servicio militar obligatorio sin excepción",
                        "Votar exclusivamente por partidos de alcance nacional",
                        "Abonar donaciones mensuales a los gobiernos regionales"
                    ),
                    correctIndex = 1,
                    explanation = "El artículo 38° fija como deberes cívicos fundamentales honrar a la patria, defender los intereses nacionales, la Constitución y el ordenamiento jurídico.",
                    subject = "Ed. Cívica",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "civ_t02_s03",
            subjectId = "civica",
            semana = 2,
            subtema = "2.3 Identidad Nacional, Símbolos Patrios (Art. 49°) e Interculturalidad",
            title = "Identidad Nacional, Símbolos de la Patria e Idiomas Oficiales",
            theory = LessonTheory(
                id = "th_civ_t02_s03",
                asignatura = "Ed. Cívica",
                semana = 2,
                titulo = "Símbolos Patrios, Patrimonio Cultural e Idiomas Oficiales",
                resumen = "• Identidad Nacional:\n  Sentimiento colectivo de pertenencia, lealtad y orgullo basado en la memoria histórica compartida, el patrimonio cultural, la geografía diversa y el proyecto de convivencia democrática del Perú.\n\n• Símbolos de la Patria (Artículo 49° de la Constitución):\n  - Son símbolos oficiales de la patria **única y taxativamente tres**:\n    1. **La Bandera** de tres franjas verticales con los colores rojo, blanco y rojo.\n    2. **El Escudo** (dividido en tres campos: la vicuña [reino animal], el árbol de la quina [reino vegetal] y la cornucopia derramando monedas de oro [reino mineral]).\n    3. **El Himno Nacional** (letra de José de la Torre Ugarte y música de José Bernardo Alcedo, restaurado en su estrofa oficial VI 'En su cima los Andes sostengan...').\n  - *Dato de Admisión*: La escarapela es un distintivo cívico tradicional de uso escolar y protocolar, pero **NO es un símbolo de la patria** según la Constitución.\n  - Capital de la República: Lima. Capital histórica: la ciudad del **Cusco**.\n\n• Idiomas Oficiales del Perú (Artículo 48° de la Constitución):\n  - Es idioma oficial el **castellano** en todo el territorio nacional.\n  - También son oficiales el **quechua**, el **aimara** y las demás **lenguas aborígenes amazónicas** *en las zonas donde predominen* (principio de oficialidad contextual territorial).",
                conceptosClave = listOf(
                    "Artículo 49°: Símbolos de la patria son la Bandera, el Escudo y el Himno Nacional",
                    "La escarapela NO es símbolo de la patria; es solo un distintivo patriótico",
                    "Escudo Nacional: Vicuña (animal), Quina (vegetal) y Cornucopia (mineral)",
                    "Artículo 48°: Quechua y Aimara son oficiales 'en las zonas donde predominen'",
                    "Capital histórica del Perú: Cusco (Art. 49°)"
                ),
                formulas = listOf(
                    "\\text{Símbolos Oficiales (Art. 49°)} = \\text{Bandera} + \\text{Escudo} + \\text{Himno Nacional} \\; (\\text{La escarapela es distintivo})",
                    "\\text{Oficialidad Lingüística (Art. 48°)} = \\text{Castellano (General)} + \\text{Quechua/Aimara (Zonas de predominio)}"
                ),
                formulaName = "Estatuto Constitucional de Símbolos e Idiomas",
                formulaLatex = "\\text{Identidad Nacional} = \\text{Pluriculturalidad} \\oplus \\text{Patrimonio Material e Inmaterial} \\oplus \\text{Memoria Cívica}",
                formulaDescription = "Reconocimiento de la diversidad lingüística y cultural como riqueza de la nación peruana.",
                admissionTip = "¡Pregunta clásica de admisión UNSA! Si te preguntan si la escarapela es símbolo patrio, marca NO. El Art. 49° reconoce únicamente Bandera, Escudo e Himno Nacional.",
                admissionExplanation = "• El árbol de la quina del Escudo Nacional simboliza la riqueza vegetal y recuerda la histórica medicina que salvó a la humanidad de la malaria (paludismo)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 49° de la Constitución Política del Perú, ¿cuál de los siguientes elementos NO es considerado un símbolo oficial de la patria?",
                    options = listOf("El Escudo Nacional", "La Bandera Nacional", "La Escarapela", "El Himno Nacional", "Todos son símbolos oficiales"),
                    correctIndex = 2,
                    explanation = "La Constitución en su Art. 49° declara expresamente que son símbolos de la patria la bandera, el escudo y el himno nacional. La escarapela es un distintivo cívico.",
                    subject = "Ed. Cívica",
                    semana = 2
                ),
                Challenge(
                    id = "q_civ_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el Escudo Nacional del Perú, el reino vegetal de nuestra biodiversidad está representado por la figura de:",
                    options = listOf("La cantuta sagrada", "El árbol de la quina", "La planta del maíz", "La flor de amancaes", "El árbol del caucho"),
                    correctIndex = 1,
                    explanation = "El árbol de la quina (Cinchona officinalis) ocupa el campo blanco superior derecho del Escudo representando al reino vegetal.",
                    subject = "Ed. Cívica",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: ESTADO Y NACIÓN (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "civ_t03_s01",
            subjectId = "civica",
            semana = 3,
            subtema = "3.1 Distinción Teórica: Estado vs. Nación y los Cuatro Elementos del Estado",
            title = "Teoría del Estado: Diferencias con Nación y Elementos Constitutivos",
            theory = LessonTheory(
                id = "th_civ_t03_s01",
                asignatura = "Ed. Cívica",
                semana = 3,
                titulo = "Estado, Nación y Elementos del Estado",
                resumen = "• Distinción Conceptual Fundamental:\n  1. Nación (Concepto Sociológico y Cultural):\n     - Comunidad humana unida por lazos históricos, tradiciones, lengua, psicología colectiva y un proyecto compartido de futuro.\n     - Puede existir una nación sin tener un Estado propio e independiente (ej. el pueblo kurdo, los pueblos indígenas amazónicos).\n  2. Estado (Concepto Jurídico y Político):\n     - Es la **sociedad jurídica y políticamente organizada bajo un gobierno soberano**, asentada sobre un territorio determinado y regulada por un orden normativo.\n\n• Los Cuatro Elementos Constitutivos del Estado:\n  1. **La Población o Pueblo (Elemento Humano)**:\n     - Conjunto de personas que habitan el territorio y están unidas al Estado por el vínculo de la **nacionalidad**.\n     - Adquisición (Art. 52° Const.): Ius soli (nacidos en el territorio nacional) e Ius sanguinis (hijos de peruanos nacidos en el exterior inscritos en su minoría de edad).\n  2. **El Territorio (Elemento Geográfico / Espacial - Art. 54°)**:\n     - Espacio físico inalienable sobre el que se ejerce soberanía exclusiva: suelo, subsuelo, dominio marítimo (200 millas del Mar de Grau) y espacio aéreo suprayacente.\n  3. **El Poder Político o Autoridad (Imperium)**:\n     - Capacidad del Estado para organizar la vida social, mandar legítimamente y ejercer el monopolio de la fuerza pública coactiva.\n  4. **El Ordenamiento Jurídico**:\n     - Sistema articulado de leyes y normas cuya cúspide suprema es la Constitución.",
                conceptosClave = listOf(
                    "Nación: Comunidad histórica y sociocultural (vínculo de identidad)",
                    "Estado: Sociedad jurídica y políticamente organizada (vínculo de soberanía y ley)",
                    "Cuatro elementos: Población, Territorio, Poder Político y Orden Jurídico",
                    "Criterios de nacionalidad: Ius soli (suelo) y Ius sanguinis (sangre)"
                ),
                formulas = listOf(
                    "\\text{Estado} = \\text{Población} + \\text{Territorio (Suelo, Mar 200 mi, Aire)} + \\text{Poder Soberano} + \\text{Constitución}",
                    "\\text{Nación} \\neq \\text{Estado} \\quad (\\text{La Nación es sociológica, el Estado es jurídico-político})"
                ),
                formulaName = "Estructura Ontológica del Estado",
                formulaLatex = "\\text{Estado Moderno} = \\text{Pueblo} \\times \\text{Territorio} \\times \\text{Soberanía Coactiva} \\times \\text{Derecho}",
                formulaDescription = "Requisitos concurrentes e indisociables de la estatalidad soberana.",
                admissionTip = "Recuerda que una nación NO requiere tener fronteras políticas propias para existir como comunidad cultural (ej. la nación gitana o kurda).",
                admissionExplanation = "• El Perú es un Estado pluricultural y multilingüe que alberga en su interior a múltiples identidades etnolingüísticas originarias."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La diferencia conceptual fundamental entre 'Nación' y 'Estado' radica en que:",
                    options = listOf(
                        "La nación es una estructura estrictamente militar, mientras el Estado es religioso",
                        "La nación es una comunidad histórico-cultural, mientras el Estado es la organización jurídica y política soberana",
                        "El Estado desaparece cuando cambia de Constitución, mientras la nación solo dura 5 años",
                        "Toda nación posee obligatoriamente un asiento en el Consejo de Seguridad de la ONU",
                        "El Estado carece de territorio geográfico definido"
                    ),
                    correctIndex = 1,
                    explanation = "La Nación es una realidad sociológica basada en la identidad compartida; el Estado es la institucionalización jurídica y soberana del poder.",
                    subject = "Ed. Cívica",
                    semana = 3
                ),
                Challenge(
                    id = "q_civ_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El criterio jurídico por el cual se reconoce como peruano de nacimiento a toda persona nacida dentro del territorio de la República se denomina:",
                    options = listOf("Ius sanguinis", "Ius soli", "Ius domicilium", "Ius gentium", "Ius imperium"),
                    correctIndex = 1,
                    explanation = "El 'Ius soli' (derecho de suelo) otorga la nacionalidad de origen por el hecho geográfico de haber nacido dentro de las fronteras territoriales del Estado.",
                    subject = "Ed. Cívica",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "civ_t03_s02",
            subjectId = "civica",
            semana = 3,
            subtema = "3.2 Características del Estado Peruano (Art. 43°) y Deberes Primordiales (Art. 44°)",
            title = "Características del Estado Peruano y Deberes Primordiales",
            theory = LessonTheory(
                id = "th_civ_t03_s02",
                asignatura = "Ed. Cívica",
                semana = 3,
                titulo = "El Régimen del Estado Peruano según la Constitución",
                resumen = "• Características del Estado Peruano (Artículo 43° de la Constitución):\n  *'La República del Perú es democrática, social, independiente y soberana. El Estado es uno e indivisible. Su gobierno es unitario, representativo y descentralizado, y se organiza según el principio de la separación de poderes'*.\n  - **Democrático**: El poder emana del pueblo.\n  - **Social**: Prioriza el bienestar general, los servicios esenciales y la justicia distributiva.\n  - **Independiente y Soberano**: No reconoce poder exterior superior en sus decisiones internas.\n  - **Uno e Indivisible**: No caben secesiones territoriales ni estados federados.\n  - **Unitario**: Hay un solo centro soberano de legislación general (el Congreso de la República).\n  - **Representativo**: Los gobernantes actúan por delegación ciudadana.\n  - **Descentralizado**: Distribuye competencias y recursos a regiones y municipalidades.\n  - **Separación de Poderes**: Poder Legislativo, Ejecutivo y Judicial con frenos y contrapesos.\n\n• Deberes Primordiales del Estado (Artículo 44° de la Constitución):\n  1. Defender la **soberanía nacional**.\n  2. Garantizar la plena eficacia de los **derechos humanos**.\n  3. Proteger a la población de las **amenazas contra su seguridad**.\n  4. Promover el **bienestar general** fundamentado en la justicia y el desarrollo integral y equilibrado de la Nación.\n  5. Establecer y ejecutar la política de fronteras y promover la integración latinoamericana.",
                conceptosClave = listOf(
                    "Artículo 43° Const.: Características del Estado peruano (democrático, social, unitario, descentralizado)",
                    "Principio de Separación de Poderes: Garantía de pesos y contrapesos constitucionales",
                    "Artículo 44° Const.: Cinco deberes primordiales del Estado (soberanía, DD.HH., seguridad, bienestar y fronteras)",
                    "El Estado peruano es uno e indivisible (no es federal)"
                ),
                formulas = listOf(
                    "\\text{Estado Peruano (Art. 43°)} = \\text{Unitario} + \\text{Representativo} + \\text{Descentralizado} + \\text{Separación de Poderes}",
                    "\\text{Deberes Primordiales (Art. 44°)} = \\text{Soberanía} + \\text{Derechos Humanos} + \\text{Seguridad} + \\text{Bienestar General}"
                ),
                formulaName = "Fórmula del Régimen Político Peruano",
                formulaLatex = "\\text{República del Perú} \\implies \\text{Democrática} \\; \\& \\; \\text{Social} \\; \\& \\; \\text{Independiente} \\; \\& \\; \\text{Soberana}",
                formulaDescription = "Bases axiológicas y estructurales del Estado peruano consagradas en el artículo 43° de la Carta Magna.",
                admissionTip = "El Perú es un Estado UNITARIO y DESCENTRALIZADO; no es un Estado federal (como EE. UU. o Brasil). Las regiones tienen autonomía administrativa y económica, pero no soberanía.",
                admissionExplanation = "• El deber primordial de 'proteger a la población de las amenazas contra su seguridad' sustenta jurídicamente la actuación de la Policía y las Fuerzas Armadas en emergencias."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 43° de la Constitución Política del Perú, el gobierno de la República se caracteriza por ser:",
                    options = listOf(
                        "Federal, aristocrático y centralizado",
                        "Unitario, representativo y descentralizado",
                        "Monárquico, representativo y confesional",
                        "Teocrático, descentralizado y parlamentarista",
                        "Unitario, confederado y absolutista"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 43° de la Carta Magna señala textualmente: 'Su gobierno es unitario, representativo y descentralizado, y se organiza según el principio de la separación de poderes'.",
                    subject = "Ed. Cívica",
                    semana = 3
                ),
                Challenge(
                    id = "q_civ_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes enunciados constituye un deber primordial del Estado peruano consagrado en el artículo 44° de la Constitución?",
                    options = listOf(
                        "Financiar obligatoriamente a los partidos políticos en campaña",
                        "Garantizar la plena eficacia de los derechos humanos y proteger a la población de amenazas",
                        "Expropiar los monopolios industriales de origen extranjero",
                        "Fijar por ley los precios de todos los productos de consumo masivo",
                        "Imponer la censura previa en los medios de comunicación"
                    ),
                    correctIndex = 1,
                    explanation = "Garantizar la plena vigencia de los derechos humanos y la seguridad ciudadana es uno de los deberes esenciales e inalienables del Estado (Art. 44°).",
                    subject = "Ed. Cívica",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "civ_t03_s03",
            subjectId = "civica",
            semana = 3,
            subtema = "3.3 Soberanía Popular (Art. 45°), Derecho de Insurgencia (Art. 46°) y Territorio Nacional (Art. 54°)",
            title = "Soberanía Popular, Derecho de Insurgencia y el Territorio Nacional",
            theory = LessonTheory(
                id = "th_civ_t03_s03",
                asignatura = "Ed. Cívica",
                semana = 3,
                titulo = "Defensa del Orden Constitucional y Dominio Territorial",
                resumen = "• El Origen del Poder Estatal (Artículo 45° de la Constitución):\n  - *'El poder del Estado emana del pueblo. Quienes lo ejercen lo hacen con las limitaciones y responsabilidades que la Constitución y las leyes establecen'*. Ninguna persona ni grupo militar o civil puede arrogarse el poder; hacerlo constituye rebelión o sedición.\n\n• El Derecho de Insurgencia (Artículo 46° de la Constitución):\n  - *'Nadie debe obediencia a un gobierno usurpador, ni a quienes asumen funciones públicas en violación de la Constitución y de las leyes. La población civil tiene el derecho de insurgencia en defensa del orden constitucional'*. Son nulos los actos de quienes usurpan funciones públicas.\n\n• El Territorio Nacional (Artículo 54° de la Constitución):\n  - El territorio del Estado es inalienable e inviolable. Comprende:\n    1. **El Suelo**: Superficie continental e insular dentro de los hitos fronterizos internacionales.\n    2. **El Subsuelo**: La capa inferior al suelo; los yacimientos mineros, gasíferos y petrolíferos son patrimonio del Estado.\n    3. **El Dominio Marítimo (Mar de Grau)**:\n       * Comprende el mar adyacente a sus costas hasta la distancia de **doscientas (200) millas marinas** medidas desde las líneas de base.\n       * El Estado ejerce soberanía y jurisdicción sobre sus aguas, su lecho y su subsuelo marino, sin perjuicio de las libertades de comunicación internacional.\n    4. **El Espacio Aéreo**: Columna aérea que cubre el suelo y el mar adyacente hasta el límite de las 200 millas.",
                conceptosClave = listOf(
                    "Artículo 45°: El poder emana del pueblo; ningún usurpador puede arrogarse el mando",
                    "Artículo 46°: Derecho de insurgencia de la población civil en defensa de la Constitución",
                    "Nulidad de pleno derecho de todos los actos emitidos por un gobierno de facto o usurpador",
                    "Artículo 54°: Territorio inalienable (suelo, subsuelo, espacio aéreo y mar de 200 millas)"
                ),
                formulas = listOf(
                    "\\text{Origen del Poder (Art. 45°)} = \\text{Voluntad Popular} \\implies \\text{Límites Constitucionales}",
                    "\\text{Gobierno Usurpador} \\to \\text{Obediencia Nula} + \\text{Derecho de Insurgencia Ciudadana (Art. 46°)}"
                ),
                formulaName = "Mecanismos de Legitimidad y Soberanía",
                formulaLatex = "\\text{Territorio} = \\text{Suelo Continental} + \\text{Subsuelo} + \\text{Mar de Grau (200 Millas)} + \\text{Espacio Aéreo}",
                formulaDescription = "Composición cuatripartita del territorio soberano de la República según el artículo 54° de la Constitución.",
                admissionTip = "El derecho de insurgencia consagrado en el Art. 46° SOLO puede ser invocado en defensa del orden constitucional frente a un régimen USURPADOR o golpista, nunca para desconocer a un gobierno democrático legítimo.",
                admissionExplanation = "• En virtud del fallo de la Corte Internacional de Justicia de La Haya (2014), el límite marítimo con Chile sigue la línea del paralelo hasta la milla 80 y luego una bisectriz equidistante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 46° de la Constitución, la población civil tiene derecho de insurgencia cuando:",
                    options = listOf(
                        "El Congreso aprueba un impuesto municipal que afecta su canasta familiar",
                        "Un gobierno asume funciones públicas usurpando el poder en violación de la Constitución",
                        "Los precios internacionales del petróleo suben de manera imprevista",
                        "El Jurado Nacional de Elecciones convoca a referéndum nacional",
                        "Se produce un desastre natural que destruye carreteras"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 46° reconoce el derecho de insurgencia en defensa exclusiva del orden constitucional frente a regímenes de facto o usurpadores.",
                    subject = "Ed. Cívica",
                    semana = 3
                ),
                Challenge(
                    id = "q_civ_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El artículo 54° de la Carta Magna establece que el dominio marítimo del Estado peruano (Mar de Grau) se extiende hasta una distancia de:",
                    options = listOf("12 millas marinas", "50 millas marinas", "100 millas marinas", "200 millas marinas", "350 millas marinas"),
                    correctIndex = 3,
                    explanation = "El dominio marítimo del Perú comprende el mar adyacente a sus costas hasta la distancia de 200 millas marinas con soberanía y jurisdicción sobre sus recursos.",
                    subject = "Ed. Cívica",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: ORGANIZACIÓN DEL ESTADO PERUANO (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "civ_t04_s01",
            subjectId = "civica",
            semana = 4,
            subtema = "4.1 Poder Legislativo: Congreso, Atribuciones y Comisión Permanente",
            title = "El Poder Legislativo: Estructura, Atribuciones y Comisión Permanente",
            theory = LessonTheory(
                id = "th_civ_t04_s01",
                asignatura = "Ed. Cívica",
                semana = 4,
                titulo = "El Congreso de la República y la Función Legislativa",
                resumen = "• Estructura del Poder Legislativo:\n  - Reside en el **Congreso de la República**, compuesto por **130 congresistas** elegidos por un período de **5 años**.\n  - *Reforma Constitucional 2024*: Retorno al sistema **Bicameral** (Cámara de Diputados y Cámara de Senadores) para el período constitucional 2026-2031.\n  - Los congresistas representan a la Nación, no están sujetos a mandato imperativo ni a interpelación, y gozan de inmunidad por sus votos y opiniones en el ejercicio del cargo.\n\n• Principales Atribuciones del Congreso (Artículo 102°):\n  1. Aprobar, interpretar, modificar o derogar leyes y reformas constitucionales.\n  2. Aprobar el **Presupuesto General de la República** y la Cuenta General de la República.\n  3. Autorizar empréstitos financieros internacionales.\n  4. Ejercer el **control político** sobre el Ejecutivo: interpelar y censurar ministros de Estado.\n  5. Declarar la vacancia de la Presidencia de la República (por incapacidad moral permanente, Art. 113°).\n  6. Elegir a altas autoridades: Defensor del Pueblo (2/3 de votos), magistrados del Tribunal Constitucional (2/3 de votos), directores del BCRP y ratificar al Contralor General.\n\n• La Comisión Permanente del Congreso (Artículo 101°):\n  - Funciona durante los recesos parlamentarios o cuando el Congreso es disuelto constitucionalmente.\n  - Está presidida por el Presidente del Congreso y sus miembros no exceden del 25% del número total de legisladores.\n  - **NO puede ser disuelta por el Presidente de la República**.\n  - *Materias prohibidas*: No puede legislar sobre reformas constitucionales, tratados internacionales, leyes orgánicas ni aprobar el presupuesto.",
                conceptosClave = listOf(
                    "Congreso unicameral (130 congresistas) y reforma hacia la bicameralidad 2026",
                    "Los congresistas no están sujetos a mandato imperativo (Art. 93°)",
                    "Atribución legislativa y de control político: Interpelación y censura ministerial",
                    "Comisión Permanente: Funciona en recesos e interregno parlamentario; nunca puede ser disuelta"
                ),
                formulas = listOf(
                    "\\text{Comisión Permanente} \\le 25\\% \\text{ del total de congresistas}",
                    "\\text{Elección de TC y Defensoría} = \\text{Mayoría Calificada de } 2/3 \\text{ de votos (87 votos)}"
                ),
                formulaName = "Métricas Parlamentarias Constitucionales",
                formulaLatex = "\\text{Control Político}: \\; \\text{Interpelación (Preguntas)} \\longrightarrow \\text{Moción de Censura (Dimisión Ministerial)}",
                formulaDescription = "Vías de control del Poder Legislativo sobre el gabinete ministerial.",
                admissionTip = "Durante la disolución del Congreso por el Presidente (Art. 134°), la Comisión Permanente NO se disuelve y continúa ejerciendo sus funciones de guardia legislativa.",
                admissionExplanation = "• La censura a un ministro exige el voto de más de la mitad del número legal de congresistas (mínimo 66 votos), obligándolo a renunciar dentro de las 72 horas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el caso excepcional de que el Presidente de la República disuelva constitucionalmente el Congreso por negar la confianza a dos gabinetes, ¿qué órgano parlamentario NO puede ser disuelto?",
                    options = listOf(
                        "La Mesa Directiva",
                        "La Junta de Portavoces",
                        "La Comisión Permanente",
                        "La Comisión de Presupuesto",
                        "El Pleno del Congreso"
                    ),
                    correctIndex = 2,
                    explanation = "El Art. 134° establece con absoluta claridad que la Comisión Permanente no puede ser disuelta bajo ninguna circunstancia.",
                    subject = "Ed. Cívica",
                    semana = 4
                ),
                Challenge(
                    id = "q_civ_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para elegir a los magistrados del Tribunal Constitucional o al Defensor del Pueblo, el Congreso requiere una mayoría calificada de:",
                    options = listOf(
                        "Mayoría simple de los presentes",
                        "La mitad más uno del número legal de congresistas",
                        "Dos tercios del número legal de miembros del Congreso",
                        "Tres quintos de los votos válidos",
                        "Unanimidad de la Comisión Permanente"
                    ),
                    correctIndex = 2,
                    explanation = "La Constitución exige una mayoría calificada de dos tercios (2/3) del número legal de congresistas (mínimo 87 de 130 votos).",
                    subject = "Ed. Cívica",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "civ_t04_s02",
            subjectId = "civica",
            semana = 4,
            subtema = "4.2 Poder Ejecutivo y Poder Judicial: Presidencia, Consejo de Ministros y Órganos Jurisdiccionales",
            title = "Poder Ejecutivo y Poder Judicial: Presidencia, Ministros y Cortes de Justicia",
            theory = LessonTheory(
                id = "th_civ_t04_s02",
                asignatura = "Ed. Cívica",
                semana = 4,
                titulo = "El Ejecutivo y la Administración de Justicia",
                resumen = "• El Poder Ejecutivo:\n  - Dirige la política general del gobierno y administra el Estado.\n  - **Presidente de la República**: Jefe de Estado y Jefe de Gobierno; Jefe Supremo de las FF.AA. y PNP. Mandato de **5 años sin reelección presidencial inmediata**.\n  - Causales de Vacancia Presidencial (Art. 113°): 1. Muerte; 2. Permanente incapacidad moral o física declarada por el Congreso; 3. Aceptación de su renuncia; 4. Salir del territorio nacional sin permiso o no regresar; 5. Destitución por infracciones graves del Art. 117°.\n  - **Consejo de Ministros**: Encabezado por el Presidente del Consejo de Ministros (Premier). Sus acuerdos requieren el voto aprobatorio de la mayoría. Son nulos los actos presidenciales que carecen de refrendo ministerial.\n  - *Cuestión de Confianza y Disolución (Art. 134°)*: El Presidente puede disolver el Congreso si este ha censurado o negado la confianza a **dos Consejos de Ministros** (no puede disolverlo en el último año de su mandato).\n\n• El Poder Judicial:\n  - Administra justicia a nombre de la Nación de manera autónoma e independiente.\n  - Principios Jurisdiccionales (Art. 139°): Unidad y exclusividad, debido proceso, pluralidad de instancia (doble instancia), gratuidad para personas de escasos recursos y presunción de inocencia.\n  - Estructura Jerárquica Jurisdiccional:\n    1. **Corte Suprema de Justicia** (sede en Lima, jurisdicción nacional; presidida por el Presidente del Poder Judicial).\n    2. **Cortes Superiores de Justicia** (en cada Distrito Judicial del país).\n    3. **Juzgados Especializados o Mixtos** (Civiles, Penales, Laborales, de Familia).\n    4. **Juzgados de Paz Letrados** (abogados titulados).\n    5. **Juzgados de Paz** (jueces legos elegidos por voto comunal popular para conciliar en comunidades campesinas).",
                conceptosClave = listOf(
                    "Presidente: Jefe de Estado y Jefe Supremo de FF.AA.; mandato de 5 años sin reelección inmediata",
                    "Refrendo ministerial obligatorio: Ningún decreto presidencial tiene validez sin firma ministerial",
                    "Disolución del Congreso: Facultativa tras dos negatorias de confianza a gabinetes ministeriales",
                    "Estructura Judicial: Corte Suprema > Cortes Superiores > Especializados > Paz Letrados > Juzgados de Paz"
                ),
                formulas = listOf(
                    "\\text{Disolución del Congreso (Art. 134°)} \\iff 2 \\text{ Gabinetes censurados o con confianza negada}",
                    "\\text{Pirámide Judicial} = \\text{Corte Suprema} > \\text{Cortes Superiores} > \\text{Juzgados Especializados} > \\text{Paz}"
                ),
                formulaName = "Equilibrio entre Ejecutivo y Judicial",
                formulaLatex = "\\text{Vacancia Presidencial (Art. 113°)} \\implies \\text{Incapacidad Moral Permanente (2/3 de votos)}",
                formulaDescription = "Reglas de control y administración de justicia según los artículos 113°, 134° y 143° constitucionales.",
                admissionTip = "Los Jueces de Paz NO son remunerados y no requieren ser abogados; son elegidos democráticamente por su propia comunidad para resolver controversias menores por equidad.",
                admissionExplanation = "• La Corte Suprema es la última instancia de la justicia ordinaria a través del recurso extraordinario de casación."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 134° de la Constitución, el Presidente de la República está facultado para disolver el Congreso si este ha:",
                    options = listOf(
                        "Rechazado el Presupuesto General de la República",
                        "Censurado o negado su confianza a dos Consejos de Ministros",
                        "Iniciado un juicio político contra el Fiscal de la Nación",
                        "Promulgado una ley ordinaria por insistencia",
                        "Interpelado a tres ministros en una misma legislatura"
                    ),
                    correctIndex = 1,
                    explanation = "La disolución constitucional del Congreso procede exclusivamente cuando este ha negado la confianza o censurado a dos gabinetes de ministros.",
                    subject = "Ed. Cívica",
                    semana = 4
                ),
                Challenge(
                    id = "q_civ_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el órgano jurisdiccional de base en la estructura del Poder Judicial cuyos titulares no requieren ser abogados y son elegidos por votación popular?",
                    options = listOf(
                        "Juzgados de Paz Letrados",
                        "Juzgados Especializados Civiles",
                        "Juzgados de Paz (no letrados)",
                        "Salas Superiores Penales",
                        "Juzgados de Tránsito y Seguridad Vial"
                    ),
                    correctIndex = 2,
                    explanation = "Los Juzgados de Paz (no letrados) resuelven por equidad en pueblos y comunidades; sus jueces son vecinos elegidos por la población.",
                    subject = "Ed. Cívica",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "civ_t04_s03",
            subjectId = "civica",
            semana = 4,
            subtema = "4.3 Organismos Constitucionales Autónomos (OCAs): Ámbito Jurídico, Electoral y Económico",
            title = "Los Diez Organismos Constitucionales Autónomos (OCAs) del Perú",
            theory = LessonTheory(
                id = "th_civ_t04_s03",
                asignatura = "Ed. Cívica",
                semana = 4,
                titulo = "Especialización y Competencias de los 10 OCAs",
                resumen = "• Los Organismos Constitucionales Autónomos (OCAs):\n  Entidades tutelares independientes consagradas en la Carta Magna para ejercer funciones especializadas sin subordinación a ningún poder del Estado.\n\n• Clasificación Funcional de los 10 OCAs:\n\n1. Ámbito Jurídico y Judicial:\n   - **Tribunal Constitucional (TC)**: Órgano de control de la Constitución. Compuesto por **7 magistrados** elegidos por el Congreso por 5 años (sin reelección inmediata). Conoce en única instancia la Acción de Inconstitucionalidad y en última instancia denegatoria el Hábeas Corpus, Amparo y Hábeas Data.\n   - **Junta Nacional de Justicia (JNJ)**: Integrada por 7 miembros elegidos por concurso público de méritos por 5 años. **Nombra, ratifica (cada 7 años) y destituye con sanción disciplinaria a jueces y fiscales** de todos los niveles, además de designar a los jefes de ONPE y RENIEC.\n   - **Ministerio Público (Fiscalía de la Nación)**: Defiende la legalidad y los intereses públicos; titular exclusivo del ejercicio de la **acción penal pública** e investigación del delito desde su etapa preliminar. Presidido por el Fiscal de la Nación.\n   - **Defensoría del Pueblo**: Defiende los derechos constitucionales y fundamentales de la persona y supervisa la prestación de los servicios públicos. Titular: Defensor del Pueblo (elegido por 5 años por el Congreso).\n\n2. Ámbito Electoral (Tríada Electoral):\n   - **Jurado Nacional de Elecciones (JNE)**: Administra justicia electoral, fiscaliza la legalidad del sufragio, inscribe partidos y proclama resultados oficiales.\n   - **Oficina Nacional de Procesos Electorales (ONPE)**: Organiza y ejecuta los procesos electorales, diseña la cédula de sufragio y capacita a los miembros de mesa.\n   - **Registro Nacional de Identificación y Estado Civil (RENIEC)**: Otorga el DNI, prepara el padrón electoral y registra nacimientos, matrimonios y defunciones.\n\n3. Ámbito Económico y Financiero:\n   - **Banco Central de Reserva del Perú (BCRP)**: Preserva la estabilidad monetaria nacional y controla la inflación mediante la emisión de billetes y fijación de tasas de interés.\n   - **Superintendencia de Banca, Seguros y AFP (SBS)**: Regula y supervisa el sistema financiero, asegurador y previsional; previene el lavado de activos a través de la UIF.\n   - **Contraloría General de la República**: Supervisa y fiscaliza la legalidad del gasto y la correcta ejecución del presupuesto público de todas las entidades estatales.",
                conceptosClave = listOf(
                    "TC: 7 magistrados elegidos por el Congreso; supremo intérprete constitucional",
                    "JNJ: Nombra, ratifica y destituye jueces y fiscales a nivel nacional",
                    "Ministerio Público: Ejerce el monopolio de la acción penal pública e investiga el delito",
                    "Tríada Electoral: JNE (justicia y fiscalización), ONPE (organización técnica), RENIEC (DNI y padrón)",
                    "BCRP: Estabilidad monetaria; SBS: Supervisión bancaria; Contraloría: Control del gasto público"
                ),
                formulas = listOf(
                    "\\text{Tribunal Constitucional} = 7 \\text{ Magistrados elegidos por el Congreso por 5 años}",
                    "\\text{Tríada Electoral} = \\text{JNE (Jurisdicción)} + \\text{ONPE (Organización)} + \\text{RENIEC (Identidad)}"
                ),
                formulaName = "Mapa Institucional de los 10 OCAs",
                formulaLatex = "\\text{JNJ} \\implies \\text{Nombramiento, Ratificación (7 años) y Destitución de Jueces y Fiscales}",
                formulaDescription = "Competencias exclusivas e indelegables de los organismos autónomos en la Constitución de 1993.",
                admissionTip = "¡No confundas la JNJ con el Poder Judicial! El Poder Judicial dicta sentencias; la JNJ nombra y sanciona disciplinariamente a los jueces.",
                admissionExplanation = "• El BCRP es gobernado por un directorio de 7 miembros: 4 designados por el Poder Ejecutivo (incluido el Presidente) y 3 elegidos por el Congreso."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El organismo constitucional autónomo encargado de nombrar, ratificar cada siete años y destituir a todos los jueces y fiscales de la República es:",
                    options = listOf(
                        "El Poder Judicial",
                        "La Junta Nacional de Justicia (JNJ)",
                        "El Tribunal Constitucional",
                        "El Ministerio Público",
                        "El Congreso de la República"
                    ),
                    correctIndex = 1,
                    explanation = "La Junta Nacional de Justicia (JNJ, que reemplazó al CNM) tiene la competencia exclusiva de nombrar, evaluar y destituir a jueces y fiscales.",
                    subject = "Ed. Cívica",
                    semana = 4
                ),
                Challenge(
                    id = "q_civ_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de las siguientes instituciones es el órgano titular exclusivo del ejercicio de la acción penal pública e investigación del delito en el Perú?",
                    options = listOf(
                        "La Policía Nacional del Perú",
                        "El Ministerio de Justicia",
                        "El Ministerio Público (Fiscalía de la Nación)",
                        "El Poder Judicial",
                        "La Defensoría del Pueblo"
                    ),
                    correctIndex = 2,
                    explanation = "El artículo 159° de la Constitución confiere al Ministerio Público el monopolio del ejercicio de la acción penal pública.",
                    subject = "Ed. Cívica",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: DEMOCRACIA Y SISTEMA POLÍTICO (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "civ_t05_s01",
            subjectId = "civica",
            semana = 5,
            subtema = "5.1 Principios y Modelos de Democracia: Directa, Representativa y Participativa",
            title = "Modelos y Principios Fundamentales del Sistema Democrático",
            theory = LessonTheory(
                id = "th_civ_t05_s01",
                asignatura = "Ed. Cívica",
                semana = 5,
                titulo = "La Democracia: Tipología y Principios Axiológicos",
                resumen = "• Definición de Democracia:\n  Del griego demos (pueblo) y kratos (poder): 'El gobierno del pueblo'. Sistema político y forma de vida civil fundamentada en el respeto irrestricto a la dignidad humana, la soberanía popular y el Estado de Derecho.\n\n• Principios Democráticos Fundamentales:\n  1. **Soberanía Popular**: El pueblo es el único titular originario del poder estatal.\n  2. **Gobierno de la Mayoría con Respeto a las Minorías**: Se decide por consenso mayoritario sin conculcar los derechos inalienables de quienes están en minoría.\n  3. **Pluralismo Político e Ideológico**: Libertad para fundar partidos y disentir pacíficamente.\n  4. **Alternancia y Periodicidad en el Poder**: Elecciones regulares; rechazo a mandatos vitalicios.\n  5. **Separación e Independencia de Poderes**: Control y equilibrio mutuo.\n\n• Modelos Históricos de Democracia:\n  - **Democracia Directa**: Los ciudadanos reunidos en asamblea deliberan y aprueban leyes directamente sin representantes (ej. la Atenas clásica de Pericles).\n  - **Democracia Representativa (Indirecta)**: La ciudadanía elige periódicamente mediante sufragio a sus gobernantes para que tomen decisiones en su nombre.\n  - **Democracia Participativa (Modelo Peruano)**: Régimen mixto que combina la representación política con **mecanismos de participación directa y control cívico** (referéndum, revocatoria, rendición de cuentas, iniciativa de ley).",
                conceptosClave = listOf(
                    "Democracia: Soberanía popular, Estado de Derecho y división de poderes",
                    "Regla de la mayoría subordinada al respeto absoluto de las minorías",
                    "Democracia directa (Atenas) vs Representativa (elecciones periódicas)",
                    "Democracia participativa: Inclusión de referéndum y control ciudadano directo"
                ),
                formulas = listOf(
                    "\\text{Democracia Participativa} = \\text{Representación Electoral} + \\text{Control Ciudadano Directo (Ley 26300)}",
                    "\\text{Regla Democrática} \\to \\text{Voluntad Mayoritaria} \\; \\& \\; \\text{Protección Irrenunciable de Minorías}"
                ),
                formulaName = "Pilares de la Democracia Contemporánea",
                formulaLatex = "\\text{Democracia} = \\text{Pluralismo} \\oplus \\text{Periodicidad Electoral} \\oplus \\text{Derechos Humanos} \\oplus \\text{Legalidad}",
                formulaDescription = "Condiciones indispensables para la existencia de un régimen democrático genuino.",
                admissionTip = "El Perú adopta un modelo de democracia REPRESENTATIVA y PARTICIPATIVA, consagrado expresamente en los artículos 31° y 43° de la Constitución.",
                admissionExplanation = "• La alternancia en el poder prohíbe la reelección presidencial inmediata para evitar la concentración autocrática del poder."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El modelo democrático en el cual la población elige a sus autoridades mediante sufragio universal, pero a la vez ejerce mecanismos directos como el referéndum y la revocatoria, se denomina:",
                    options = listOf(
                        "Democracia directa pura",
                        "Democracia representativa y participativa",
                        "Democracia aristocrática corporativa",
                        "Democracia teocrática",
                        "Democracia censitaria"
                    ),
                    correctIndex = 1,
                    explanation = "La democracia peruana es representativa y participativa, al combinar la elección de autoridades con mecanismos de control directo.",
                    subject = "Ed. Cívica",
                    semana = 5
                ),
                Challenge(
                    id = "q_civ_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál de los siguientes principios asegura que los cargos de elección popular no se conviertan en vitalicios ni deriven en tiranías?",
                    options = listOf(
                        "El principio de centralismo estatal",
                        "La periodicidad y alternancia en el poder",
                        "El mandato imperativo de los congresistas",
                        "El secreto del voto censitario",
                        "La inmunidad de la corona"
                    ),
                    correctIndex = 1,
                    explanation = "La periodicidad y alternancia en el poder garantiza que las autoridades concluyan su período y se renueven mediante elecciones libres.",
                    subject = "Ed. Cívica",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "civ_t05_s02",
            subjectId = "civica",
            semana = 5,
            subtema = "5.2 Organizaciones Políticas: Partidos, Movimientos Regionales y Ley N.° 28094",
            title = "Organizaciones Políticas: Partidos, Alianzas y la Ley N.° 28094",
            theory = LessonTheory(
                id = "th_civ_t05_s02",
                asignatura = "Ed. Cívica",
                semana = 5,
                titulo = "El Régimen de Organizaciones Políticas en el Perú",
                resumen = "• Las Organizaciones Políticas (Ley N.° 28094):\n  Son asociaciones de ciudadanos de derecho privado que expresan el pluralismo democrático, concurren a la manifestación de la voluntad popular y actúan como intermediarios entre la sociedad civil y el Estado.\n\n• Tipos de Organizaciones Políticas:\n  1. **Partidos Políticos**: De alcance nacional; pueden postular a todos los cargos públicos (Presidencia, Congreso, Gobiernos Regionales y Municipios).\n  2. **Movimientos Regionales**: De alcance circunscrito a un departamento o región; solo pueden postular a Gobernaciones Regionales y Municipios de su jurisdicción territorial.\n  3. **Alianzas Electorales**: Unión temporal de dos o más partidos políticos con fines de competencia electoral.\n\n• Requisitos y Funcionamiento:\n  - Inscripción obligatoria en el **Registro de Organizaciones Políticas (ROP)** del Jurado Nacional de Elecciones.\n  - Democracia interna: Elección obligatoria de candidatos y autoridades partidarias mediante mecanismos supervisados por la ONPE.\n  - Financiamiento y Transparencia: Financiamiento público indirecto (franja electoral) y prohibición de aportes anónimos o provenientes de empresas privadas o personas sentenciadas por delitos graves.",
                conceptosClave = listOf(
                    "Ley N.° 28094: Marco normativo de los partidos políticos en el Perú",
                    "Partidos (nacionales) vs Movimientos Regionales (departamentales)",
                    "Inscripción en el Registro de Organizaciones Políticas (ROP) del JNE",
                    "Democracia interna obligatoria y fiscalización del financiamiento por la ONPE"
                ),
                formulas = listOf(
                    "\\text{Partidos Políticos} \\to \\text{Alcance Nacional (Elecciones Generales + Subnacionales)}",
                    "\\text{Movimientos Regionales} \\to \\text{Alcance Departamental (Solo Gobiernos Regionales y Locales)}"
                ),
                formulaName = "Tipología de Organizaciones Políticas",
                formulaLatex = "\\text{Inscripción Válida} = \\text{ROP (JNE)} \\; \\& \\; \\text{Democracia Interna (Supervisada por ONPE)}",
                formulaDescription = "Requisitos legales para postular legítimamente en elecciones en el Perú.",
                admissionTip = "Los movimientos regionales NO pueden postular candidatos a la Presidencia de la República ni al Congreso nacional; esa prerrogativa es exclusiva de los partidos políticos de alcance nacional.",
                admissionExplanation = "• Si un partido político no alcanza la valla electoral del 5% o no obtiene 5 curules en el Congreso, pierde automáticamente su inscripción en el ROP."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el sistema político peruano, ¿qué tipo de organización política está facultada para presentar candidatos a la Presidencia de la República y al Congreso?",
                    options = listOf(
                        "Los movimientos regionales únicamente",
                        "Los partidos políticos de alcance nacional",
                        "Los comités distritales independientes",
                        "Las organizaciones no gubernamentales (ONG)",
                        "Las juntas vecinales debidamente reconocidas"
                    ),
                    correctIndex = 1,
                    explanation = "Solo los partidos políticos inscritos con alcance nacional están facultados para postular en las Elecciones Generales (Presidencia y Congreso).",
                    subject = "Ed. Cívica",
                    semana = 5
                ),
                Challenge(
                    id = "q_civ_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El registro público oficial donde deben inscribirse los partidos y movimientos políticos para adquirir personería legal en el Perú depende del:",
                    options = listOf(
                        "Ministerio del Interior",
                        "Tribunal Constitucional",
                        "Jurado Nacional de Elecciones (ROP)",
                        "Poder Judicial",
                        "Congreso de la República"
                    ),
                    correctIndex = 2,
                    explanation = "El Registro de Organizaciones Políticas (ROP) es administrado de manera exclusiva por el Jurado Nacional de Elecciones (JNE).",
                    subject = "Ed. Cívica",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "civ_t05_s03",
            subjectId = "civica",
            semana = 5,
            subtema = "5.3 Sistema Electoral Peruano: Balotaje (Art. 111°), Valla Electoral y Cifra Repartidora",
            title = "Reglas Electorales: Balotaje Presidencial, Valla del 5% y Cifra Repartidora",
            theory = LessonTheory(
                id = "th_civ_t05_s03",
                asignatura = "Ed. Cívica",
                semana = 5,
                titulo = "Reglas y Mecanismos de Cómputo Electoral en el Perú",
                resumen = "• Elección Presidencial y Segunda Vuelta o Balotaje (Artículo 111° de la Constitución):\n  - Para ser proclamado Presidente de la República en **Primera Vuelta**, la fórmula presidencial debe obtener **más de la mitad (50% + 1 voto) de los votos válidos** (no se cuentan votos en blanco ni nulos).\n  - Si ninguna lista alcanza dicha mayoría absoluta, se realiza una **Segunda Vuelta Electoral (Balotaje)** dentro de los 30 días siguientes a la proclamación de los cómputos oficiales, compitiendo únicamente las dos candidaturas que obtuvieron la mayor votación relativa.\n\n• El Umbral Electoral o Valla Electoral Parlamentaria:\n  - Para acceder a la repartición de escaños en el Congreso, los partidos deben superar la **valla electoral**: obtener al menos el **5% de los votos válidos a nivel nacional** O alcanzar al menos **5 congresistas** en más de una circunscripción electoral.\n  - Las listas que no alcancen esta valla quedan excluidas del Congreso y pierden su registro en el ROP.\n\n• La Cifra Repartidora (Método D'Hondt):\n  - Algoritmo matemático proporcional empleado para distribuir los escaños del Congreso entre los partidos que superaron la valla electoral, en proporción exacta al caudal de votos válidos obtenidos por cada agrupación.\n\n• El Voto Preferencial:\n  - Mecanismo optativo que permite al elector marcar hasta dos números de candidatos de su preferencia dentro de la lista parlamentaria elegida.",
                conceptosClave = listOf(
                    "Artículo 111° Const.: Elección presidencial con más del 50% de votos válidos en 1ra vuelta",
                    "Balotaje: Segunda vuelta entre las dos candidaturas con mayor votación relativa",
                    "Valla electoral: Mínimo 5% de votos válidos a nivel nacional para ingresar al Congreso",
                    "Cifra repartidora (D'Hondt): Distribución matemática proporcional de curules"
                ),
                formulas = listOf(
                    "\\text{Victoria en 1.ª Vuelta Presidencial} > 50\\% \\text{ de Votos Válidos}",
                    "\\text{Valla Parlamentaria} = 5\\% \\text{ de Votos Válidos Nacionales} \\; \\lor \\; 5 \\text{ Congresistas electos}"
                ),
                formulaName = "Fórmulas del Sistema Electoral",
                formulaLatex = "\\text{Cifra Repartidora (D'Hondt)}: \\; \\text{Votos por Lista} \\div [1, 2, 3, \\dots, N] \\implies \\text{Ordenamiento de Cocientes}",
                formulaDescription = "Procedimiento normativo para la asignación representativa proporcional de escaños en el Poder Legislativo.",
                admissionTip = "¡Recuerda para el cálculo del balotaje!: Se calcula sobre los VOTOS VÁLIDOS, lo que significa que los votos nulos (viciados) y en blanco NO se contabilizan.",
                admissionExplanation = "• El balotaje presidencial fue introducido en la historia constitucional peruana en la Carta de 1979 y ratificado en la Constitución de 1993."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para proclamarse vencedor en la primera vuelta de las elecciones presidenciales peruanas, una candidatura debe obtener:",
                    options = listOf(
                        "La mayoría simple del total de electores empadronados",
                        "Más del 50% de los votos válidos emitidos",
                        "Al menos el 40% de los votos con 10 puntos de ventaja sobre el segundo",
                        "Dos tercios de los votos emitidos en Lima Metropolitana",
                        "El 60% de los sufragios computando blancos y nulos"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 111° de la Constitución exige obtener más de la mitad (50% más uno) de los votos válidos para ganar en primera vuelta.",
                    subject = "Ed. Cívica",
                    semana = 5
                ),
                Challenge(
                    id = "q_civ_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El método matemático proporcional utilizado en el sistema electoral peruano para determinar cuántos escaños corresponden a cada partido en el Congreso se denomina:",
                    options = listOf("Voto aprobatorio", "Cifra repartidora o método D'Hondt", "Mayoría calificada uninominal", "Pluralidad relativa", "Ponderación censitaria"),
                    correctIndex = 1,
                    explanation = "El sistema electoral peruano emplea la cifra repartidora (método D'Hondt) para asignar las curules parlamentarias de manera proporcional a los votos.",
                    subject = "Ed. Cívica",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: DERECHOS HUMANOS Y GARANTÍAS CONSTITUCIONALES (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "civ_t06_s01",
            subjectId = "civica",
            semana = 6,
            subtema = "6.1 Fundamentos y Tres Generaciones de los Derechos Humanos (Karel Vasak)",
            title = "Derechos Humanos: Atributos y Evolución por Generaciones",
            theory = LessonTheory(
                id = "th_civ_t06_s01",
                asignatura = "Ed. Cívica",
                semana = 6,
                titulo = "La Doctrina de los Derechos Humanos y las Tres Generaciones",
                resumen = "• Naturaleza de los Derechos Humanos:\n  Prerrogativas y libertades inherentes a la dignidad intrínseca de toda persona, sin distinción de etnia, género, religión, nacionalidad o condición económica.\n\n• Características Esenciales:\n  1. **Innatos / Inherentes**: Se poseen desde la concepción por el simple hecho de ser humano.\n  2. **Universales**: Corresponden a todos los habitantes del planeta.\n  3. **Inalienables**: No pueden ser vendidos, transferidos ni embargados.\n  4. **Imprescriptibles**: No caducan jamás por el paso del tiempo.\n  5. **Indivisibles e Interdependientes**: No pueden jerarquizarse; el menoscabo de uno afecta al conjunto.\n  6. **Progresivos / Irrenunciables**: No cabe renuncia voluntaria ni retroceso en los niveles de protección alcanzados.\n\n• Las Tres Generaciones de Derechos Humanos (Karel Vasak, 1979):\n  - **1.ª Generación: Derechos Civiles y Políticos (El Valor Guía: La Libertad)**:\n    * Contexto: Siglo XVIII (Revolución Francesa e Independencia de EE. UU.).\n    * Contenido: Derecho a la vida, integridad personal, libertad de culto, propiedad privada, votar y participar en política.\n    * Rol del Estado: Deber de abstención o no intromisión (obligación negativa).\n  - **2.ª Generación: Derechos Económicos, Sociales y Culturales (El Valor Guía: La Igualdad)**:\n    * Contexto: Inicios del siglo XX (Revolución Mexicana 1917, Constitución de Weimar 1919).\n    * Contenido: Derecho al trabajo digno, salario justo, salud pública, educación gratuita y seguridad social.\n    * Rol del Estado: Deber de prestación activa y asignación presupuestal (obligación positiva).\n  - **3.ª Generación: Derechos de los Pueblos o de Solidaridad (El Valor Guía: La Fraternidad)**:\n    * Contexto: Segunda mitad del siglo XX (Posguerra y descolonización).\n    * Contenido: Derecho a la paz, al desarrollo sostenible, a un **medio ambiente sano y equilibrado** y al patrimonio común de la humanidad.\n    * Titularidad: Colectiva (comunidades y la humanidad entera).",
                conceptosClave = listOf(
                    "Atributos cardinales: Innatos, universales, inalienables, imprescriptibles e indivisibles",
                    "1.ª Generación (Vasak): Civiles y Políticos (Libertad individual; s. XVIII)",
                    "2.ª Generación: Económicos, Sociales y Culturales (Igualdad y Trabajo; s. XX)",
                    "3.ª Generación: Solidaridad, Paz y Medio Ambiente Equilibrado (Posguerra)",
                    "DUDH: 10 de diciembre de 1948 (París, ONU)"
                ),
                formulas = listOf(
                    "\\text{1.ª Gen (Libertad)} \\to \\text{Civiles / Políticos (Vida, Libertad personal, Voto)}",
                    "\\text{2.ª Gen (Igualdad)} \\to \\text{Sociales / Económicos (Salud, Educación, Trabajo digno)}",
                    "\\text{3.ª Gen (Solidaridad)} \\to \\text{Pueblos (Paz, Medio Ambiente Sano, Patrimonio)}"
                ),
                formulaName = "Taxonomía Generacional de Vasak",
                formulaLatex = "\\text{Evolución DD.HH.}: \\; \\text{Libertad (1.ª)} \\; \\longrightarrow \\; \\text{Igualdad (2.ª)} \\; \\longrightarrow \\; \\text{Fraternidad / Solidaridad (3.ª)}",
                formulaDescription = "Secuencia de ampliación de la protección jurídica internacional del ser humano.",
                admissionTip = "El derecho a la SALUD y a la EDUCACIÓN pertenecen a la SEGUNDA generación. El derecho a un MEDIO AMBIENTE SANO y a la PAZ pertenecen a la TERCERA generación.",
                admissionExplanation = "• La Declaración Universal de los Derechos Humanos se aprobó el 10 de diciembre de 1948 en París como respuesta moral al Holocausto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El derecho a un medio ambiente sano y ecológicamente equilibrado, así como el derecho a la paz de los pueblos, corresponden a la clasificación de:",
                    options = listOf(
                        "Derechos de primera generación",
                        "Derechos de segunda generación",
                        "Derechos de tercera generación o de solidaridad",
                        "Derechos civiles y políticos exclusivos",
                        "Derechos de cuarta generación tecnológica"
                    ),
                    correctIndex = 2,
                    explanation = "Los derechos de tercera generación o de solidaridad protegen a colectividades y tutelan la paz, la libre determinación y el medio ambiente.",
                    subject = "Ed. Cívica",
                    semana = 6
                ),
                Challenge(
                    id = "q_civ_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Los derechos humanos de segunda generación (económicos, sociales y culturales) tienen como valor rector y exigencia fundamental hacia el Estado:",
                    options = listOf(
                        "La libertad individual negativa de abstención",
                        "La igualdad material y la prestación activa de servicios de salud, trabajo y educación",
                        "La desregulación del mercado financiero internacional",
                        "El derecho a la propiedad de títulos nobiliarios",
                        "La aplicación obligatoria del arbitraje privado"
                    ),
                    correctIndex = 1,
                    explanation = "La segunda generación busca la igualdad material mediante prestaciones activas del Estado en educación, salud, trabajo y seguridad social.",
                    subject = "Ed. Cívica",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "civ_t06_s02",
            subjectId = "civica",
            semana = 6,
            subtema = "6.2 Garantías Constitucionales de Tutela de Derechos: Hábeas Corpus, Amparo y Hábeas Data",
            title = "Garantías Constitucionales de Tutela Personal: Hábeas Corpus, Amparo y Hábeas Data",
            theory = LessonTheory(
                id = "th_civ_t06_s02",
                asignatura = "Ed. Cívica",
                semana = 6,
                titulo = "Garantías Constitucionales de Tutela de Derechos (Art. 200°)",
                resumen = "• Las Garantías Constitucionales:\n  Acciones jurídicas de rango constitucional consagradas en el Artículo 200° de la Carta Magna para reponer las cosas al estado anterior a la vulneración o amenaza de derechos fundamentales.\n\n• Las Tres Acciones de Tutela de Derechos:\n\n1. **Acción de Hábeas Corpus (Art. 200° inc. 1)**:\n   - Protege: **La libertad individual y la integridad personal** (física, psicológica y moral), así como derechos conexos (no ser incomunicado, derecho a no ser detenido arbitrariamente, derecho a contar con defensa legal).\n   - Procede: Ante la detención ilegal cometida por cualquier autoridad, funcionario o persona particular.\n   - Características: Puede interponerlo cualquier persona sin necesidad de abogado ni formalidades, las 24 horas del día, ante cualquier juez penal.\n\n2. **Acción de Amparo (Art. 200° inc. 2)**:\n   - Protege: **Todos los demás derechos fundamentales** de la persona que no son tutelados por el Hábeas Corpus ni el Hábeas Data.\n   - Ejemplos: Derecho a la vida, a la salud, al trabajo, a la educación, a la igualdad sin discriminación, a la libertad de prensa, de reunión y propiedad.\n   - No procede: Contra normas legales válidas ni contra resoluciones judiciales emanadas de procedimiento regular.\n\n3. **Acción de Hábeas Data (Art. 200° inc. 3)**:\n   - Protege dos derechos de la era de la información (Art. 2° incisos 5 y 6):\n     a) Acceso a la Información Pública: Obligación de cualquier entidad estatal de brindar información presupuestal o documental solicitada (salvo secretos de defensa nacional o intimidad personal).\n     b) Autodeterminación Informativa: Derecho a conocer, actualizar, rectificar o suprimir datos personales almacenados en bancos de datos públicos o privados.",
                conceptosClave = listOf(
                    "Hábeas Corpus: Tutela exclusiva de la libertad individual y la integridad personal",
                    "Acción de Amparo: Tutela residual de todos los demás derechos fundamentales (salud, trabajo, educación)",
                    "Hábeas Data: Acceso a la información pública y rectificación de datos personales (Art. 2° inc. 5 y 6)",
                    "El Tribunal Constitucional resuelve en última y definitiva instancia denegatoria"
                ),
                formulas = listOf(
                    "\\text{Hábeas Corpus} \\iff \\text{Libertad Individual e Integridad Física}",
                    "\\text{Hábeas Data} \\iff \\text{Información Pública} + \\text{Protección de Datos Personales}",
                    "\\text{Acción de Amparo} \\iff \\text{Demás Derechos Fundamentales (Salud, Educación, Trabajo)}"
                ),
                formulaName = "Trilogía de Tutela Constitucional",
                formulaLatex = "\\text{Garantías de Tutela} = \\text{Hábeas Corpus} \\; \\cup \\; \\text{Amparo} \\; \\cup \\; \\text{Hábeas Data}",
                formulaDescription = "Mecanismos judiciales expeditos de protección ciudadana según el artículo 200° de la Constitución.",
                admissionTip = "Regla mnemotécnica infalible UNSA: Si vulneran tu libertad física o te detienen sin orden judicial = HÁBEAS CORPUS. Si te niegan información pública o usan tus datos sin permiso = HÁBEAS DATA. Para cualquier otro derecho (despido arbitrario, discriminación, salud) = ACCIÓN DE AMPARO.",
                admissionExplanation = "• El Hábeas Corpus no se suspende durante los estados de excepción (emergencia o sitio); los jueces verifican la razonabilidad y proporcionalidad de la detención."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si una persona es detenida arbitrariamente por la policía por más de 48 horas sin mediar flagrancia delictiva ni orden judicial, la garantía constitucional que debe interponerse de inmediato es:",
                    options = listOf("Acción Popular", "Acción de Amparo", "Acción de Hábeas Corpus", "Acción de Hábeas Data", "Acción de Inconstitucionalidad"),
                    correctIndex = 2,
                    explanation = "El Hábeas Corpus procede ante el hecho u omisión que vulnera o amenaza la libertad individual y los derechos conexos a ella.",
                    subject = "Ed. Cívica",
                    semana = 6
                ),
                Challenge(
                    id = "q_civ_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Un ciudadano solicita formalmente a un ministerio copias del presupuesto ejecutado en obras públicas y este se niega injustificadamente a entregarlas. La garantía idónea para exigir esta entrega es:",
                    options = listOf("Acción de Cumplimiento", "Acción de Amparo", "Acción de Hábeas Data", "Acción Popular", "Hábeas Corpus"),
                    correctIndex = 2,
                    explanation = "El Hábeas Data tutela el derecho de todo ciudadano a solicitar y recibir información de cualquier entidad pública (Art. 2° inc. 5).",
                    subject = "Ed. Cívica",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "civ_t06_s03",
            subjectId = "civica",
            semana = 6,
            subtema = "6.3 Garantías Constitucionales de Control Normativo: Inconstitucionalidad, Acción Popular y Cumplimiento",
            title = "Garantías de Control Normativo y Eficacia: Inconstitucionalidad, Acción Popular y Cumplimiento",
            theory = LessonTheory(
                id = "th_civ_t06_s03",
                asignatura = "Ed. Cívica",
                semana = 6,
                titulo = "Garantías Constitucionales de Control Normativo (Art. 200°)",
                resumen = "• Garantías de Control Normativo y Legalidad:\n  Mecanismos jurisdiccionales destinados a asegurar el principio de jerarquía normativa y el cumplimiento efectivo del orden jurídico.\n\n• Las Tres Acciones de Control:\n\n1. **Acción de Inconstitucionalidad (Art. 200° inc. 4)**:\n   - Procede contra normas que tienen **rango de ley** (leyes del Congreso, Decretos Legislativos, Decretos de Urgencia, Tratados internacionales no sobre DD.HH., Reglamentos del Congreso y Ordenanzas Regionales y Municipales) que contravengan la Constitución por la forma o por el fondo.\n   - Órgano Competente: Se interpone en **instancia única y definitiva ante el Tribunal Constitucional (TC)**.\n   - Efecto: La sentencia que declara inconstitucional la norma la **deroga y expulsa del ordenamiento jurídico** a partir del día siguiente de su publicación.\n   - Legitimados activos: Presidente, Fiscal de la Nación, Defensor del Pueblo, 25% del número legal de congresistas, 5,000 ciudadanos con firmas comprobadas.\n\n2. **Acción Popular (Art. 200° inc. 5)**:\n   - Procede contra normas de **rango reglamentario o administrativo infralegal** (Decretos Supremos, Resoluciones Supremas, Resoluciones Ministeriales) que infringen la Constitución o la ley.\n   - Órgano Competente: Se interpone exclusivamente ante el **Poder Judicial** (Salas de la Corte Superior y en apelación la Corte Suprema).\n   - Legitimación: Cualquier ciudadano puede interponerla libremente.\n\n3. **Acción de Cumplimiento (Art. 200° inc. 6)**:\n   - Procede contra cualquier autoridad o funcionario público renuente a **acatar una norma legal o ejecutar un acto administrativo firme**.\n   - No discute la constitucionalidad de la norma, sino que exige su aplicación práctica inmediata.",
                conceptosClave = listOf(
                    "Inconstitucionalidad: Contra normas con RANGO DE LEY; competencia exclusiva del Tribunal Constitucional",
                    "Acción Popular: Contra normas de RANGO REGLAMENTARIO (Decretos Supremos); competencia del Poder Judicial",
                    "Acción de Cumplimiento: Exige a funcionarios renuentes acatar leyes o actos administrativos firmes",
                    "Efecto de la inconstitucionalidad: Derogación y expulsión de la norma del ordenamiento jurídico"
                ),
                formulas = listOf(
                    "\\text{Inconstitucionalidad} \\iff \\text{Normas con Rango de Ley} \\to \\text{Tribunal Constitucional}",
                    "\\text{Acción Popular} \\iff \\text{Reglamentos / Decretos Supremos} \\to \\text{Poder Judicial}",
                    "\\text{Acción de Cumplimiento} \\iff \\text{Funcionario reacio a acatar la ley}"
                ),
                formulaName = "Mapa de Control Normativo Constitucional",
                formulaLatex = "\\text{Control Normativo} = \\text{TC (Rango Legal: Inconstitucionalidad)} \\; \\oplus \\; \\text{PJ (Rango Infralegal: Acción Popular)}",
                formulaDescription = "Distribución competencial del control constitucional concentrado y difuso en el Perú.",
                admissionTip = "Diferencia clave en admisión UNSA: Si la norma vulneradora es una LEY u ORDENANZA REGIONAL (rango de ley), va al TC con INCONSTITUCIONALIDAD. Si es un DECRETO SUPREMO o REGLAMENTO, va al Poder Judicial con ACCIÓN POPULAR.",
                admissionExplanation = "• La sentencia del Tribunal Constitucional que declara inconstitucional una ley no tiene efectos retroactivos, salvo en materia penal cuando favorece al reo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si un Decreto Supremo promulgado por el Presidente de la República vulnera abiertamente una ley orgánica aprobada por el Congreso, la garantía constitucional idónea a interponer ante el Poder Judicial es:",
                    options = listOf(
                        "Acción de Inconstitucionalidad",
                        "Acción Popular",
                        "Acción de Cumplimiento",
                        "Acción de Amparo",
                        "Hábeas Data"
                    ),
                    correctIndex = 1,
                    explanation = "La Acción Popular procede contra reglamentos, decretos supremos y resoluciones de carácter general que infringen la Constitución o las leyes.",
                    subject = "Ed. Cívica",
                    semana = 6
                ),
                Challenge(
                    id = "q_civ_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La Acción de Inconstitucionalidad se interpone en instancia única y exclusiva ante:",
                    options = listOf(
                        "La Corte Suprema de Justicia",
                        "El Tribunal Constitucional",
                        "La Fiscalía de la Nación",
                        "El Congreso de la República",
                        "La Junta Nacional de Justicia"
                    ),
                    correctIndex = 1,
                    explanation = "El Tribunal Constitucional (TC) es el órgano de control concentrado que conoce en única instancia la Acción de Inconstitucionalidad.",
                    subject = "Ed. Cívica",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: CONSTITUCIÓN Y ORDEN JURÍDICO (SEMANA 7)
        // =========================================================================
        LessonNode(
            id = "civ_t07_s01",
            subjectId = "civica",
            semana = 7,
            subtema = "7.1 La Constitución Política de 1993: Estructura, Principios y Títulos",
            title = "La Constitución de 1993: Estructura Orgánica y Principios Rectores",
            theory = LessonTheory(
                id = "th_civ_t07_s01",
                asignatura = "Ed. Cívica",
                semana = 7,
                titulo = "La Constitución Política del Perú de 1993",
                resumen = "• Concepto y Naturaleza:\n  Es la **Ley Fundamental y Suprema de la República** (*Lex Superior*). Organiza el poder político del Estado, fija los límites gubernamentales, consagra los derechos fundamentales y determina el régimen socioeconómico.\n\n• Origen Histórico:\n  - Redactada por el **Congreso Constituyente Democrático (CCD)** tras el autogolpe de Estado de 1992.\n  - Sometida a **Referéndum Constitucional el 31 de octubre de 1993**, promulgada el 29 de diciembre y entró en vigencia el **1 de enero de 1994**.\n  - Es la 12.ª Constitución de la historia republicana del Perú.\n\n• Estructura Formal (206 Artículos):\n  - Consta de un **Preámbulo**, **6 Títulos**, **26 Capítulos**, **206 Artículos**, **16 Disposiciones Finales y Transitorias** y una **Declaración sobre la Antártida**:\n    * **Título I: De la Persona y de la Sociedad** (Arts. 1° al 42°): Derechos fundamentales, sociales, económicos y políticos.\n    * **Título II: Del Estado y de la Nación** (Arts. 43° al 57°): Características republicanas, deberes, nacionalidad y tratados.\n    * **Título III: Del Régimen Económico** (Arts. 58° al 89°): **Economía Social de Mercado**, libre iniciativa privada, rol subsidiario del Estado, tributación y moneda.\n    * **Título IV: De la Estructura del Estado** (Arts. 90° al 199°): Poderes públicos, OCAs y Gobiernos Regionales y Locales.\n    * **Título V: De las Garantías Constitucionales** (Arts. 200° al 205°): Acciones de garantía y jurisdicción supranacional.\n    * **Título VI: De la Reforma de la Constitución** (Art. 206°).",
                conceptosClave = listOf(
                    "Constitución vigente de 1993: 6 Títulos, 26 Capítulos y 206 Artículos",
                    "Aprobada en referéndum en 1993 y vigente desde el 1 de enero de 1994",
                    "Título III: Modelo de Economía Social de Mercado y rol subsidiario del Estado",
                    "Es la 12.ª Carta Magna en la historia republicana del Perú"
                ),
                formulas = listOf(
                    "\\text{Constitución 1993} = \\text{Preámbulo} + 6 \\text{ Títulos} + 26 \\text{ Capítulos} + 206 \\text{ Artículos}",
                    "\\text{Régimen Económico (Art. 58°)} = \\text{Economía Social de Mercado (Libre Empresa + Rol Subsidiario)}"
                ),
                formulaName = "Arquitectura Constitucional de 1993",
                formulaLatex = "\\text{Estructura}: \\; \\text{Persona (I)} \\to \\text{Estado (II)} \\to \\text{Economía (III)} \\to \\text{Poderes (IV)} \\to \\text{Garantías (V)} \\to \\text{Reforma (VI)}",
                formulaDescription = "Organización sistemática del texto constitucional peruano.",
                admissionTip = "El modelo económico del Perú consagrado en el Art. 58° es la ECONOMÍA SOCIAL DE MERCADO: la iniciativa privada es libre, y el Estado solo ejerce actividad empresarial de forma subsidiaria (donde los privados no lleguen).",
                admissionExplanation = "• La Constitución que tuvo mayor vigencia en la historia republicana fue la de 1860 (casi 60 años ininterrumpidos)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La Constitución Política del Perú actualmente vigente fue aprobada mediante referéndum y consta formalmente de:",
                    options = listOf(
                        "4 Títulos y 150 Artículos",
                        "6 Títulos y 206 Artículos",
                        "8 Títulos y 300 Artículos",
                        "5 Títulos y 180 Artículos",
                        "10 Títulos y 250 Artículos"
                    ),
                    correctIndex = 1,
                    explanation = "La Constitución Política de 1993 consta exactamente de Preámbulo, 6 Títulos, 26 Capítulos y 206 Artículos.",
                    subject = "Ed. Cívica",
                    semana = 7
                ),
                Challenge(
                    id = "q_civ_t07_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el Título III de la Constitución, el modelo económico que rige la República del Perú se define textualmente como:",
                    options = listOf(
                        "Economía planificada centralizada estatal",
                        "Economía Social de Mercado",
                        "Capitalismo corporativo de monopolios",
                        "Economía autárquica comunal",
                        "Socialismo agrario cooperativo"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 58° establece de forma categórica que la iniciativa privada es libre y la economía nacional se ejerce bajo el modelo de Economía Social de Mercado.",
                    subject = "Ed. Cívica",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "civ_t07_s02",
            subjectId = "civica",
            semana = 7,
            subtema = "7.2 El Principio de Supremacía Constitucional (Art. 51°) y la Pirámide de Kelsen",
            title = "Jerarquía Normativa y Pirámide de Kelsen en el Orden Jurídico Peruano",
            theory = LessonTheory(
                id = "th_civ_t07_s02",
                asignatura = "Ed. Cívica",
                semana = 7,
                titulo = "Supremacía Constitucional y la Pirámide de Kelsen",
                resumen = "• El Principio de Supremacía Constitucional (Artículo 51° de la Constitución):\n  *'La Constitución prevalece sobre toda norma legal; la ley, sobre las normas de inferior jerarquía, y así sucesivamente. La publicidad es esencial para la vigencia de toda norma del Estado'*. Toda norma contraria a la Carta Magna es nula de pleno derecho.\n\n• La Pirámide de Kelsen Aplicada al Perú:\n\n1. **Primer Nivel: Nivel Constitucional (Norma Suprema)**:\n   - La Constitución Política de 1993.\n   - Leyes de Reforma Constitucional.\n   - **Tratados Internacionales sobre Derechos Humanos** (tienen rango constitucional según la Cuarta Disposición Final y Transitoria).\n\n2. **Segundo Nivel: Nivel Legal (Normas con Rango de Ley)**:\n   - Leyes Orgánicas (regulan estructura del Estado y OCAs; requieren más de la mitad de congresistas para aprobarse).\n   - Leyes Ordinarias (aprobadas por el Pleno del Congreso).\n   - **Decretos Legislativos** (dictados por el Ejecutivo por delegación de facultades del Congreso).\n   - **Decretos de Urgencia** (dictados por el Ejecutivo en materia económica y financiera en situaciones extraordinarias).\n   - Tratados internacionales ordinarios.\n   - **Ordenanzas Regionales y Ordenanzas Municipales** (tienen rango de ley dentro de su respectiva circunscripción territorial).\n\n3. **Tercer Nivel: Nivel Infralegal o Reglamentario**:\n   - Decretos Supremos (dictados por el Presidente con firma ministerial; reglamentan leyes sin transgredirlas).\n   - Resoluciones Supremas (rubricadas por el Presidente y el Ministro del sector).\n\n4. **Cuarto Nivel: Nivel Resolutivo y Administrativo**:\n   - Resoluciones Ministeriales, Directorales, Jefaturales y actos administrativos individuales.",
                conceptosClave = listOf(
                    "Artículo 51° Const.: La Constitución prevalece sobre toda norma legal",
                    "Principio de Publicidad: Toda norma requiere publicación oficial en El Peruano para regir",
                    "Nivel Legal: Leyes, Decretos Legislativos, Decretos de Urgencia y Ordenanzas",
                    "Tratados de Derechos Humanos: Gozan de jerarquía y rango constitucional"
                ),
                formulas = listOf(
                    "\\text{Pirámide Jurídica}: \\; \\text{Constitución} > \\text{Normas con Rango de Ley} > \\text{Decretos Supremos} > \\text{Resoluciones}",
                    "\\text{Vigencia de la Norma} \\iff \\text{Publicación en el Diario Oficial 'El Peruano'}"
                ),
                formulaName = "Jerarquía de Kelsen en el Perú",
                formulaLatex = "\\text{Orden}: \\; \\text{Nivel Constitucional} \\; \\longrightarrow \\; \\text{Nivel Legal} \\; \\longrightarrow \\; \\text{Nivel Reglamentario (D.S.)}",
                formulaDescription = "Gradación escalonada de validez formal del ordenamiento jurídico peruano.",
                admissionTip = "Las ORDENANZAS MUNICIPALES y REGIONALES tienen RANGO DE LEY en su territorio; por eso se impugnan ante el TC mediante Acción de Inconstitucionalidad, no ante el PJ.",
                admissionExplanation = "• Ninguna ley entra en vigencia sin haber sido publicada formalmente en el diario oficial 'El Peruano'; rige desde el día siguiente de su publicación."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la jerarquía del ordenamiento jurídico peruano (Pirámide de Kelsen), ¿cuál de los siguientes dispositivos posee rango equivalente al de una ley ordinaria?",
                    options = listOf(
                        "Una Resolución Ministerial",
                        "Un Decreto Supremo reglamentario",
                        "Un Decreto Legislativo",
                        "Una Resolución Directoral",
                        "Un Edicto municipal vecinal"
                    ),
                    correctIndex = 2,
                    explanation = "Los Decretos Legislativos dictados por el Poder Ejecutivo por delegación del Congreso tienen pleno rango de ley en la pirámide jurídica.",
                    subject = "Ed. Cívica",
                    semana = 7
                ),
                Challenge(
                    id = "q_civ_t07_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El principio constitucional consagrado en el artículo 51° por el cual la norma fundamental prima sobre toda ley y esta sobre los reglamentos se denomina:",
                    options = listOf(
                        "Principio de legalidad penal",
                        "Principio de supremacía constitucional",
                        "Principio de retroactividad benigna",
                        "Principio de presunción de inocencia",
                        "Principio de subsidiaridad económica"
                    ),
                    correctIndex = 1,
                    explanation = "El principio de supremacía constitucional establece que la Constitución es la norma cúspide indiscutible del ordenamiento.",
                    subject = "Ed. Cívica",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "civ_t07_s03",
            subjectId = "civica",
            semana = 7,
            subtema = "7.3 El Procedimiento de Reforma Constitucional (Art. 206°)",
            title = "Mecanismos y Reglas para la Reforma de la Constitución Política",
            theory = LessonTheory(
                id = "th_civ_t07_s03",
                asignatura = "Ed. Cívica",
                semana = 7,
                titulo = "El Procedimiento de Reforma Constitucional (Art. 206°)",
                resumen = "• El Artículo 206° de la Constitución Política del Perú:\n  Establece el procedimiento solemne para la modificación parcial o total del texto constitucional por el Poder Constituyente Derivado.\n\n• Iniciativa de Reforma Constitucional:\n  Tienen derecho a presentar proyectos de reforma:\n  1. El Presidente de la República con aprobación del Consejo de Ministros.\n  2. Los Congresistas de la República (mínimo el 0.3% del total o bancadas parlamentarias).\n  3. Un número de ciudadanos equivalente al **0.3% de la población electoral nacional** con firmas comprobadas ante el JNE y RENIEC.\n\n• Vías de Aprobación de la Reforma Constitucional:\n  La ley de reforma constitucional debe ser aprobada en el Congreso y admite dos procedimientos válidos alternativos:\n  - **Vía A: Aprobación Parlamentaria + Referéndum**:\n    Aprobación por **mayoría absoluta del número legal de congresistas (mínimo 66 votos)** y ratificada obligatoriamente mediante **referéndum ciudadano**.\n  - **Vía B: Doble Votación Calificada sin Referéndum**:\n    Puede omitirse el referéndum cuando el proyecto es aprobado en **dos legislaturas ordinarias sucesivas con una votación calificada superior a los dos tercios (2/3) del número legal de congresistas (mínimo 87 votos en cada legislatura)**.\n\n• Regla de Intangibilidad Presidencial:\n  La ley de reforma constitucional **NO puede ser observada por el Presidente de la República**; una vez aprobada por el Congreso, este la promulga obligatoriamente.",
                conceptosClave = listOf(
                    "Artículo 206° Const.: Dos vías legítimas de reforma constitucional",
                    "Vía A: Mayoría absoluta (66 votos) + Referéndum popular ratificatorio",
                    "Vía B: Dos legislaturas ordinarias sucesivas con más de 2/3 de votos (87 votos en cada una)",
                    "El Presidente de la República NO puede observar una ley de reforma constitucional"
                ),
                formulas = listOf(
                    "\\text{Vía A} = 66 \\text{ Votos (Mayoría Absoluta)} + \\text{Referéndum Popular Ratificatorio}",
                    "\\text{Vía B} = 87 \\text{ Votos (2/3)} \\times 2 \\text{ Legislaturas Ordinarias Sucesivas (Sin Referéndum)}"
                ),
                formulaName = "Fórmulas de Enmienda Constitucional",
                formulaLatex = "\\text{Reforma Const. (Art. 206°)} \\implies \\text{Exclusión del Veto Presidencial (No cabe observación)}",
                formulaDescription = "Requisitos formales y mecanismos de aprobación de las leyes de reforma constitucional.",
                admissionTip = "¡Dato clave UNSA!: El Presidente puede observar leyes ordinarias, pero NUNCA puede observar ni vetar una ley de reforma constitucional aprobada según el Art. 206°.",
                admissionExplanation = "• Toda reforma constitucional que suprima o reduzca derechos fundamentales reconocidos en los tratados internacionales es nula de pleno derecho."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 206° de la Constitución, para omitir el referéndum en una reforma constitucional se requiere:",
                    options = listOf(
                        "La aprobación unánime de la Comisión Permanente en sesión secreta",
                        "El voto favorable de más de dos tercios del número legal de congresistas en dos legislaturas ordinarias sucesivas",
                        "El decreto supremo de urgencia suscrito por el Presidente de la República",
                        "La opinión favorable vinculante del Tribunal Constitucional",
                        "El respaldo del 10% del padrón electoral nacional"
                    ),
                    correctIndex = 1,
                    explanation = "La vía sin referéndum exige la aprobación de más de dos tercios de congresistas (mínimo 87) en dos legislaturas ordinarias consecutivas.",
                    subject = "Ed. Cívica",
                    semana = 7
                ),
                Challenge(
                    id = "q_civ_t07_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Respecto a la ley de reforma constitucional aprobada por el Congreso, el Presidente de la República:",
                    options = listOf(
                        "Tiene la facultad de vetarla dentro del plazo de 15 días hábiles",
                        "No puede observarla bajo ninguna circunstancia",
                        "Puede someterla a revisión de la Corte Suprema",
                        "Puede anularla mediante un Decreto de Urgencia",
                        "Debe remitirla al Consejo de Estado para su aprobación"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 206° establece explícitamente: 'La ley de reforma constitucional no puede ser observada por el Presidente de la República'.",
                    subject = "Ed. Cívica",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: PARTICIPACIÓN Y CONTROL CIUDADANO (SEMANA 8)
        // =========================================================================
        LessonNode(
            id = "civ_t08_s01",
            subjectId = "civica",
            semana = 8,
            subtema = "8.1 Derechos de Participación Ciudadana: Iniciativas Legislativas y Referéndum (Art. 32°)",
            title = "Derechos de Participación: Iniciativa Legislativa y el Referéndum",
            theory = LessonTheory(
                id = "th_civ_t08_s01",
                asignatura = "Ed. Cívica",
                semana = 8,
                titulo = "Participación Ciudadana y Referéndum (Ley N.° 26300)",
                resumen = "• Derechos de Participación Ciudadana:\n  Instrumentos consagrados en el Artículo 31° de la Constitución y regulados por la Ley N.° 26300 mediante los cuales los ciudadanos proponen y deciden en asuntos normativos y de gobierno.\n\n• Mecanismos Principales de Participación:\n  1. **Iniciativa de Reforma Constitucional**: Respaldo del **0.3% del padrón electoral nacional** con firmas verificadas ante RENIEC.\n  2. **Iniciativa en la Formación de Leyes (Iniciativa Legislativa)**: Respaldo del **0.3% de la población electoral nacional**.\n  3. **Iniciativa de Dispositivos Regionales y Locales**: Para presentar proyectos de ordenanzas ante Consejos Regionales o Concejos Municipales.\n\n• El Referéndum (Artículo 32° de la Constitución):\n  - Consulta popular directa donde el pueblo aprueba o desaprueba un asunto público normativo mediante sufragio universal.\n  - **Materias que PUEDEN someterse a referéndum**:\n    1. La reforma total o parcial de la Constitución.\n    2. La aprobación de leyes, normas regionales de carácter general y ordenanzas municipales.\n    3. La desaprobación de leyes, decretos legislativos y decretos de urgencia.\n    4. La integración y delimitación de departamentos y regiones.\n  - **Materias PROHIBIDAS de someterse a referéndum (Art. 32°)**:\n    * No pueden someterse a referéndum la supresión o disminución de los **derechos fundamentales** de la persona.\n    * Las **normas de carácter tributario y presupuestal** (no se puede consultar si se eliminan o bajan impuestos).\n    * Los **tratados internacionales en vigor**.",
                conceptosClave = listOf(
                    "Ley N.° 26300: Ley de Derechos de Participación y Control Ciudadanos",
                    "Iniciativa legislativa: Requiere firmas válidas del 0.3% de electores nacionales",
                    "Referéndum (Art. 32°): Consulta popular directa de aprobación o derogación de normas",
                    "Prohibiciones del referéndum: Tributos, presupuesto, tratados vigentes y recorte de DD.HH."
                ),
                formulas = listOf(
                    "\\text{Firma para Iniciativa de Ley u Reforma} = 0.3\\% \\text{ del Padrón Electoral Nacional}",
                    "\\text{Materias Prohibidas en Referéndum} = \\text{Tributos} + \\text{Presupuesto} + \\text{Tratados Vigentes} + \\text{Recorte de DD.HH.}"
                ),
                formulaName = "Estatuto del Referéndum Constitucional",
                formulaLatex = "\\text{Referéndum Válido} \\iff \\text{Materias No Tributarias} \\; \\& \\; \\text{Respeto Irrestricto a los DD.HH.}",
                formulaDescription = "Límites materiales insoslayables a la consulta popular directa según el artículo 32° constitucional.",
                admissionTip = "En el examen de admisión suelen colocar una pregunta trampa: '¿Se puede convocar a referéndum para eliminar el Impuesto General a las Ventas (IGV)?'. La respuesta es rotunda: NO, porque las normas tributarias están prohibidas.",
                admissionExplanation = "• Las firmas de adherentes para cualquier iniciativa ciudadana deben ser verificadas digital y pericialmente por el RENIEC."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 32° de la Constitución Política del Perú, ¿cuál de las siguientes materias está terminantemente PROHIBIDA de someterse a referéndum?",
                    options = listOf(
                        "La aprobación de una ordenanza municipal distrital",
                        "La reforma parcial del texto constitucional",
                        "Las normas de carácter tributario y el presupuesto de la República",
                        "La desaprobación de una ley ordinaria del Congreso",
                        "La integración territorial de dos provincias en una región"
                    ),
                    correctIndex = 2,
                    explanation = "El Art. 32° prohíbe de manera taxativa consultar mediante referéndum normas tributarias, presupuestales o tratados internacionales en vigor.",
                    subject = "Ed. Cívica",
                    semana = 8
                ),
                Challenge(
                    id = "q_civ_t08_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El porcentaje mínimo de firmas del padrón electoral nacional exigido por la Ley N.° 26300 para ejercer el derecho de iniciativa ciudadana en la formación de leyes es:",
                    options = listOf("0.1%", "0.3%", "1.0%", "5.0%", "10.0%"),
                    correctIndex = 1,
                    explanation = "La Ley N.° 26300 estipula que la iniciativa legislativa ciudadana requiere el respaldo verificado del 0.3% del padrón electoral nacional.",
                    subject = "Ed. Cívica",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "civ_t08_s02",
            subjectId = "civica",
            semana = 8,
            subtema = "8.2 Derechos de Control Ciudadano: Revocatoria, Remoción y Demanda de Rendición de Cuentas",
            title = "Control Ciudadano: Revocatoria, Remoción y Rendición de Cuentas (Ley N.° 26300)",
            theory = LessonTheory(
                id = "th_civ_t08_s02",
                asignatura = "Ed. Cívica",
                semana = 8,
                titulo = "Mecanismos de Control Ciudadano y Fiscalización",
                resumen = "• Derechos de Control Ciudadano (Ley N.° 26300):\n  Facultades mediante las cuales los ciudadanos fiscalizan, sancionan o exigen cuentas a las autoridades en funciones:\n\n• Los Tres Mecanismos Fundamentales de Control:\n\n1. **Revocatoria de Autoridades**:\n   - Procede **exclusivamente contra autoridades de elección popular subnacional**: Gobernadores Regionales, Vicegobernadores, Consejeros Regionales, Alcaldes y Regidores municipales, así como Jueces de Paz.\n   - **NO procede contra**: El Presidente de la República ni los Congresistas de la República (no son revocables).\n   - Requisito de admisibilidad: Solicitud respaldada por el **25% de firmas de los electores de la circunscripción electoral** respectiva.\n   - Se realiza una sola vez en el tercer año de mandato del período de cuatro años.\n   - Si una autoridad es revocada, asume su reemplazante legal conforme a ley; ya no se convocan a nuevas elecciones intermedias.\n\n2. **Remoción de Autoridades**:\n   - Procede contra **autoridades designadas o nombradas** por el gobierno central o regional (prefectos, subprefectos, directores regionales de salud o educación).\n   - Requisito: Respaldada por el **50% de firmas de los ciudadanos** de la jurisdicción.\n\n3. **Demanda de Rendición de Cuentas**:\n   - Derecho a interpelar a las autoridades locales o regionales sobre el manejo presupuestal y ejecución de obras públicas.\n   - Requisito: Respaldada por el **10% de electores locales**.",
                conceptosClave = listOf(
                    "Revocatoria: Exclusiva para autoridades de elección popular subnacional (Alcaldes, Gobernadores)",
                    "El Presidente de la República y los Congresistas NO pueden ser revocados",
                    "Firma para revocatoria: 25% del padrón electoral de la circunscripción",
                    "Remoción: Para autoridades designadas a dedo (requiere el 50% de firmas)",
                    "Rendición de Cuentas: Interpelación sobre uso de fondos públicos (10% de firmas)"
                ),
                formulas = listOf(
                    "\\text{Revocatoria (Alcaldes / Gobernadores)} = 25\\% \\text{ de firmas del padrón electoral local}",
                    "\\text{Remoción (Autoridades Designadas)} = 50\\% \\text{ de firmas de la jurisdicción}",
                    "\\text{Rendición de Cuentas} = 10\\% \\text{ de firmas locales}"
                ),
                formulaName = "Métricas de Control Ciudadano (Ley 26300)",
                formulaLatex = "\\text{Revocatoria} \\implies \\text{Solo Autoridades Subnacionales (Alcaldes / Gobernadores)} \\neq \\text{Congresistas / Presidente}",
                formulaDescription = "Requisitos porcentuales y ámbito de aplicación de los instrumentos de control según la Ley N.° 26300.",
                admissionTip = "Pregunta clásica en exámenes de Ceprunsa UNSA: ¿Puede revocarse a un congresista o al Presidente? NO. Los congresistas y el Presidente de la República no están sujetos a revocatoria ciudadana.",
                admissionExplanation = "• La consulta de revocatoria solo procede en el tercer año del mandato municipal o regional para garantizar la estabilidad de la gestión pública."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con la legislación peruana de participación y control ciudadano (Ley N.° 26300), ¿cuál de las siguientes autoridades NO puede ser sometida a proceso de revocatoria?",
                    options = listOf(
                        "El Alcalde Provincial de Arequipa",
                        "El Gobernador Regional de Puno",
                        "Un Congresista de la República",
                        "Un Regidor de una municipalidad distrital",
                        "Un Juez de Paz no letrado"
                    ),
                    correctIndex = 2,
                    explanation = "Los congresistas de la República representan a la Nación y no están sujetos a revocatoria de mandato.",
                    subject = "Ed. Cívica",
                    semana = 8
                ),
                Challenge(
                    id = "q_civ_t08_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Para solicitar la revocatoria de un alcalde provincial ante el Jurado Nacional de Elecciones, la ley exige la presentación de firmas verificadas de por lo menos:",
                    options = listOf(
                        "El 10% del padrón electoral de la provincia",
                        "El 25% de los ciudadanos de la circunscripción electoral",
                        "El 50% de los vecinos empadronados",
                        "El 5% de los votantes de la última elección",
                        "El 33% de los electores de la región"
                    ),
                    correctIndex = 1,
                    explanation = "La Ley N.° 26300 exige el 25% de firmas comprobadas del padrón electoral de la circunscripción para admitir a trámite la revocatoria.",
                    subject = "Ed. Cívica",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "civ_t08_s03",
            subjectId = "civica",
            semana = 8,
            subtema = "8.3 Consulta Previa a Pueblos Indígenas (Ley N.° 29785) y Presupuesto Participativo",
            title = "La Consulta Previa a Pueblos Indígenas y el Presupuesto Participativo",
            theory = LessonTheory(
                id = "th_civ_t08_s03",
                asignatura = "Ed. Cívica",
                semana = 8,
                titulo = "Consulta Previa (Convenio 169 OIT) y Presupuesto Participativo",
                resumen = "• El Derecho a la Consulta Previa (Ley N.° 29785):\n  - Fundamento Internacional: **Convenio 169 de la Organización Internacional del Trabajo (OIT)** sobre Pueblos Indígenas y Tribales.\n  - Concepto: Es el derecho de los pueblos indígenas u originarios (andinos y amazónicos) a ser consultados de forma previa, libre e informada sobre medidas legislativas o administrativas que puedan afectar directamente sus derechos colectivos, existencia física, tierras o recursos naturales (ej. concesiones mineras, petroleras o carreteras).\n  - Carácter Jurídico: La consulta previa **busca el diálogo intercultural y el consenso mutuo**, pero **NO otorga derecho a veto**: si no se alcanza acuerdo, la decisión final corresponde soberanamente al Estado cautelando los derechos de los pueblos.\n\n• El Presupuesto Participativo (Ley N.° 28056):\n  - Proceso de gestión pública democrática en el cual los gobiernos regionales y locales convocan a la sociedad civil organizada (juntas vecinales, gremios, colegios profesionales).\n  - Objetivo: Debatir, concertar y priorizar democráticamente la asignación de recursos públicos de inversión en obras de infraestructura y desarrollo social comunitario.",
                conceptosClave = listOf(
                    "Ley N.° 29785: Consulta previa basada en el Convenio 169 de la OIT",
                    "Titulares: Pueblos indígenas u originarios andinos y amazónicos",
                    "La consulta previa NO constituye un derecho a veto; busca diálogo y consenso",
                    "Presupuesto Participativo (Ley N.° 28056): Asignación democrática de recursos para obras vecinales"
                ),
                formulas = listOf(
                    "\\text{Consulta Previa} = \\text{Diálogo Intercultural Informado} \\neq \\text{Derecho de Veto Absoluto}",
                    "\\text{Presupuesto Participativo} = \\text{Municipio / Región} + \\text{Sociedad Civil Organizada} \\to \\text{Obras Priorizadas}"
                ),
                formulaName = "Mecanismos de Concertación e Interculturalidad",
                formulaLatex = "\\text{Decisión Estatal} = \\text{Consulta Previa} \\oplus \\text{Evaluación de Impacto Ambiental y Social}",
                formulaDescription = "Participación comunitaria en la toma de decisiones sobre proyectos que inciden en tierras originarias.",
                admissionTip = "Recuerda que la consulta previa NO es un derecho a veto. El Estado escucha, dialoga y busca acuerdos, pero la decisión final sobre la medida la adopta el gobierno conforme al interés público nacional.",
                admissionExplanation = "• El Presupuesto Participativo es obligatorio para todas las municipalidades y gobiernos regionales del país en sus gastos de inversión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El derecho a la Consulta Previa reconocido a los pueblos indígenas u originarios en la Ley N.° 29785 se fundamenta en el tratado internacional denominado:",
                    options = listOf(
                        "Pacto de San José de Costa Rica",
                        "Convenio 169 de la Organización Internacional del Trabajo (OIT)",
                        "Tratado de Versalles",
                        "Convenio de Ginebra de 1949",
                        "Declaración de Río sobre Medio Ambiente"
                    ),
                    correctIndex = 1,
                    explanation = "La Consulta Previa se fundamenta en el Convenio 169 de la OIT, que protege los derechos colectivos de pueblos originarios.",
                    subject = "Ed. Cívica",
                    semana = 8
                ),
                Challenge(
                    id = "q_civ_t08_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Respecto a los efectos jurídicos del proceso de Consulta Previa a pueblos originarios en el Perú, se establece que:",
                    options = listOf(
                        "Otorga derecho de veto automático que impide cualquier acción del Estado",
                        "Busca alcanzar acuerdos por consenso, pero la decisión final corresponde al Estado",
                        "Es vinculante solo si lo aprueba la iglesia local",
                        "Reemplaza por completo el estudio de impacto ambiental de la empresa",
                        "Solo se aplica a ciudadanos que tengan título universitario"
                    ),
                    correctIndex = 1,
                    explanation = "La consulta previa es un proceso de diálogo de buena fe para lograr acuerdos, pero no confiere derecho de veto.",
                    subject = "Ed. Cívica",
                    semana = 8
                )
            )
        ),

        // =========================================================================
        // TEMA 09: GOBIERNOS REGIONALES Y LOCALES (SEMANA 9)
        // =========================================================================
        LessonNode(
            id = "civ_t09_s01",
            subjectId = "civica",
            semana = 9,
            subtema = "9.1 El Proceso de Descentralización y Autonomía Subnacional (Art. 188° a 194°)",
            title = "Descentralización y Autonomía de Gobiernos Subnacionales",
            theory = LessonTheory(
                id = "th_civ_t09_s01",
                asignatura = "Ed. Cívica",
                semana = 9,
                titulo = "La Descentralización y el Régimen de Autonomías Subnacionales",
                resumen = "• El Proceso de Descentralización (Artículo 188° de la Constitución):\n  *'La descentralización es una forma de organización democrática y constituye una política permanente de Estado, de carácter obligatorio, que tiene como objetivo fundamental el desarrollo integral del país'*. Es un proceso gradual y por etapas.\n\n• Niveles de Gobierno en el Perú:\n  1. **Gobierno Nacional**: Políticas generales de Estado, soberanía exterior, defensa nacional, moneda y relaciones diplomáticas.\n  2. **Gobierno Regional**: Conduce el desarrollo económico, social y productivo en la circunscripción departamental.\n  3. **Gobierno Local**: Ejerce el gobierno vecinal distrital y provincial prestando servicios públicos básicos.\n\n• La Autonomía Subnacional (Artículos 191° y 194° de la Constitución):\n  - Los Gobiernos Regionales y las Municipalidades gozan de **autonomía política, económica y administrativa en los asuntos de su competencia**:\n    * *Autonomía Política*: Capacidad de dictar normas con rango de ley (Ordenanzas Regionales y Municipales) y elegir democráticamente a sus autoridades.\n    * *Autonomía Administrativa*: Potestad de autoorganizarse y gestionar los servicios públicos internos.\n    * *Autonomía Económica*: Capacidad de administrar sus propios ingresos tributarios y presupuestales.\n  - **Límite Constitucional**: La autonomía NO es soberanía; los gobiernos subnacionales están sujetos a la Constitución y a las leyes de la República (Principio de Unidad del Estado).",
                conceptosClave = listOf(
                    "Artículo 188° Const.: La descentralización es política de Estado permanente y obligatoria",
                    "Tres niveles de gobierno: Nacional, Regional y Local",
                    "Autonomía triple: Política (ordenanzas), Administrativa y Económica (presupuesto propio)",
                    "Principio de Unidad del Estado: Autonomía no equivale a soberanía o secesión"
                ),
                formulas = listOf(
                    "\\text{Autonomía Subnacional} = \\text{Autonomía Política} + \\text{Autonomía Administrativa} + \\text{Autonomía Económica}",
                    "\\text{Límite Infranqueable} \\to \\text{Constitución y Leyes de la República (Estado Unitario)}"
                ),
                formulaName = "Estatuto de la Autonomía Subnacional",
                formulaLatex = "\\text{Niveles de Gobierno}: \\; \\text{Nacional (General)} \\; \\longleftrightarrow \\; \\text{Regional (Desarrollo)} \\; \\longleftrightarrow \\; \\text{Local (Vecinal)}",
                formulaDescription = "Organización territorial del poder estatal en el Perú descentralizado.",
                admissionTip = "Los Gobiernos Regionales y las Municipalidades gozan de AUTONOMÍA, pero NO tienen soberanía. La soberanía reside de manera exclusiva en el Estado Peruano como un todo.",
                admissionExplanation = "• Las Ordenanzas Regionales y Municipales tienen rango de ley en su jurisdicción, pero si contravienen una ley nacional, se declaran inconstitucionales por el TC."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t09_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 191° de la Constitución, los gobiernos regionales gozan en los asuntos de su competencia de autonomía de tipo:",
                    options = listOf(
                        "Soberana, militar y legislativa nacional",
                        "Política, económica y administrativa",
                        "Judicial, tributaria y monárquica",
                        "Exclusivamente diplomática y penal",
                        "Bancaria, aduanera y confesional"
                    ),
                    correctIndex = 1,
                    explanation = "La Constitución consagra que las regiones y municipios gozan de autonomía política, económica y administrativa en su jurisdicción.",
                    subject = "Ed. Cívica",
                    semana = 9
                ),
                Challenge(
                    id = "q_civ_t09_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La descentralización en el Perú es definida por el artículo 188° de la Constitución Política como:",
                    options = listOf(
                        "Un proceso transitorio que concluirá al crearse una federación",
                        "Una política permanente de Estado y de carácter obligatorio",
                        "Una opción voluntaria sujeta a decisión de cada alcalde",
                        "Una facultad privativa de la Presidencia del Consejo de Ministros",
                        "Un mecanismo exclusivo para la región de Lima Metropolitana"
                    ),
                    correctIndex = 1,
                    explanation = "El Art. 188° define la descentralización como una forma de organización democrática y una política permanente y obligatoria de Estado.",
                    subject = "Ed. Cívica",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "civ_t09_s02",
            subjectId = "civica",
            semana = 9,
            subtema = "9.2 Gobiernos Regionales: Gobernador, Consejo Regional (Ley N.° 27867) y Competencias",
            title = "Estructura Orgánica y Competencias de los Gobiernos Regionales (Ley N.° 27867)",
            theory = LessonTheory(
                id = "th_civ_t09_s02",
                asignatura = "Ed. Cívica",
                semana = 9,
                titulo = "La Estructura y Funcionamiento del Gobierno Regional",
                resumen = "• Ley Orgánica de Gobiernos Regionales (Ley N.° 27867):\n  Regula la estructura, organización y competencias de los **25 Gobiernos Regionales** del país (los 24 departamentos más la Provincia Constitucional del Callao; la provincia de Lima Metropolitana ejerce funciones regionales a través de su municipalidad metropolitana).\n\n• Estructura Orgánica Regional:\n  1. **El Consejo Regional (Órgano Normativo y Fiscalizador)**:\n     - Compuesto por los **Consejeros Regionales**, elegidos por voto popular por **4 años** (mínimo 7 consejeros, máximo 25).\n     - Presidido por el **Consejero Delegado** elegido entre ellos.\n     - Atribuciones: Aprobar, modificar o derogar **Ordenanzas Regionales** (normas con rango de ley en la región) y Acuerdos de Consejo; fiscalizar la gestión del gobernador y aprobar el presupuesto anual.\n  2. **La Gobernación Regional (Órgano Ejecutivo)**:\n     - Integrada por el **Gobernador Regional** y el **Vicegobernador Regional**, elegidos conjuntamente por sufragio directo por **4 años sin reelección inmediata**.\n     - Dirige y ejecuta las políticas regionales, administra los bienes y recursos, promulga las ordenanzas y designa a los gerentes regionales.\n  3. **El Consejo de Coordinación Regional (CCR - Órgano Consultivo)**:\n     - Integrado por los alcaldes provinciales de la región y representantes de la sociedad civil organizada; coordina el Plan de Desarrollo Regional Concertado.",
                conceptosClave = listOf(
                    "Ley N.° 27867: Ley Orgánica de Gobiernos Regionales (25 regiones en el Perú)",
                    "Consejo Regional: Órgano normativo y fiscalizador; dicta Ordenanzas Regionales",
                    "Gobernador y Vicegobernador: Órgano ejecutivo; mandato de 4 años sin reelección inmediata",
                    "Consejo de Coordinación Regional (CCR): Órgano consultivo y de concertación social"
                ),
                formulas = listOf(
                    "\\text{Gobierno Regional} = \\text{Consejo Regional (Normativo)} + \\text{Gobernación (Ejecutivo)} + \\text{CCR (Consultivo)}",
                    "\\text{Mandato de Autoridades Regionales} = 4 \\text{ Años sin reelección inmediata}"
                ),
                formulaName = "Estructura del Gobierno Regional",
                formulaLatex = "\\text{Normas Regionales}: \\; \\text{Ordenanzas Regionales (Rango de Ley)} \\; \\& \\; \\text{Acuerdos de Consejo (Gestión Interna)}",
                formulaDescription = "División orgánica y jerarquía de los dispositivos subnacionales según la Ley N.° 27867.",
                admissionTip = "Las autoridades regionales (Gobernador, Vicegobernador y Consejeros) son elegidas por un período de CUATRO AÑOS y NO tienen reelección inmediata.",
                admissionExplanation = "• Para ser elegido Gobernador Regional en primera vuelta se requiere un mínimo del 30% de los votos válidos; en caso contrario, se realiza segunda vuelta regional."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t09_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la estructura de un Gobierno Regional del Perú, el órgano normativo y fiscalizador encargado de aprobar las Ordenanzas Regionales es:",
                    options = listOf(
                        "La Gobernación Regional",
                        "El Consejo Regional",
                        "El Consejo de Coordinación Regional",
                        "La Gerencia General Regional",
                        "La Dirección Regional de Educación"
                    ),
                    correctIndex = 1,
                    explanation = "El Consejo Regional es el órgano colegiado normativo y fiscalizador del gobierno regional integrado por los consejeros.",
                    subject = "Ed. Cívica",
                    semana = 9
                ),
                Challenge(
                    id = "q_civ_t09_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Por qué período de tiempo son elegidos el Gobernador y los Consejeros Regionales en el Perú y cuál es la regla respecto a su reelección?",
                    options = listOf(
                        "5 años con derecho a una sola reelección inmediata",
                        "4 años sin reelección inmediata",
                        "3 años con reelección indefinida",
                        "6 años sin reelección",
                        "2 años renovables por el Congreso"
                    ),
                    correctIndex = 1,
                    explanation = "La Constitución fija un período de 4 años para las autoridades regionales y prohíbe taxativamente la reelección inmediata.",
                    subject = "Ed. Cívica",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "civ_t09_s03",
            subjectId = "civica",
            semana = 9,
            subtema = "9.3 Gobiernos Locales: Alcaldías, Concejo Municipal (Ley N.° 27972) y Financiamiento",
            title = "Gobiernos Locales: Municipalidades, Competencias y Fuentes de Financiamiento",
            theory = LessonTheory(
                id = "th_civ_t09_s03",
                asignatura = "Ed. Cívica",
                semana = 9,
                titulo = "La Organización Municipal y el Financiamiento Subnacional",
                resumen = "• Los Gobiernos Locales (Ley Orgánica de Municipalidades - Ley N.° 27972):\n  Entidades básicas de la organización territorial del Estado con personería jurídica de derecho público. Se clasifican en Municipalidades Provinciales, Distritales y de Centros Poblados.\n\n• Estructura Orgánica Municipal:\n  1. **El Concejo Municipal (Órgano Normativo y Fiscalizador)**:\n     - Integrado por el **Alcalde** y los **Regidores** elegidos por sufragio popular directo por **4 años sin reelección inmediata**.\n     - Dicta **Ordenanzas Municipales** (con rango de ley en su distrito o provincia) y Acuerdos de Concejo; fiscaliza la administración local.\n  2. **La Alcaldía (Órgano Ejecutivo Local)**:\n     - Ejercida por el **Alcalde**, máxima autoridad administrativa y representante legal del municipio.\n     - Ejecuta los acuerdos del Concejo, dirige los servicios públicos locales (limpieza pública, parques, serenazgo) y promulga las ordenanzas.\n  3. **El Consejo de Coordinación Local (CCL - Órgano Consultivo)**.\n\n• Fuentes de Financiamiento Municipal y Regional:\n  - **FONCOMUN (Fondo de Compensación Municipal)**: Transferencia del gobierno central alimentada por el Impuesto de Promoción Municipal (2% del IGV).\n  - **Canon**: Participación efectiva de los gobiernos subnacionales en los ingresos y rentas que percibe el Estado por la explotación de recursos naturales (Canon Minero, Petrolero, Gasífero, Pesquero).\n  - **Tributos Propios**: Impuesto Predial, Impuesto de Alcabala, Impuesto Vehicular y **Arbitrios** por servicios municipales (limpieza, alumbrado, serenazgo).",
                conceptosClave = listOf(
                    "Ley N.° 27972: Ley Orgánica de Municipalidades (Provinciales y Distritales)",
                    "Concejo Municipal: Órgano normativo presidido por el Alcalde e integrado por Regidores",
                    "Ordenanzas Municipales: Máxima norma local con rango de ley en la circunscripción",
                    "Fuentes de financiamiento: FONCOMUN, Canon (recursos naturales), Impuesto Predial y Arbitrios"
                ),
                formulas = listOf(
                    "\\text{Gobierno Local} = \\text{Alcaldía (Ejecutivo)} + \\text{Concejo Municipal (Normativo)} + \\text{CCL (Consultivo)}",
                    "\\text{FONCOMUN} \\to \\text{Fondo redistributivo nutrido por el Impuesto de Promoción Municipal (2% del IGV)}"
                ),
                formulaName = "Estructura Tributaria y Municipal",
                formulaLatex = "\\text{Ingresos Locales} = \\text{Canon y Sobrecanon} + \\text{FONCOMUN} + \\text{Impuesto Predial} + \\text{Arbitrios}",
                formulaDescription = "Recursos financieros de las municipalidades para sostener la inversión pública local.",
                admissionTip = "Los ARBITRIOS son tasas municipales pagadas por la prestación efectiva o mantenimiento de un servicio público individualizado (ej. recojo de basura, serenazgo, barrido de calles).",
                admissionExplanation = "• En Arequipa, el Canon Minero generado por la explotación cuprífera constituye una de las principales fuentes de financiamiento de la UNSA y los gobiernos locales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t09_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el régimen de los gobiernos locales peruanos, la máxima norma jurídica de alcance general que aprueba el Concejo Municipal con rango de ley en su circunscripción es:",
                    options = listOf(
                        "El Decreto de Alcaldía",
                        "La Ordenanza Municipal",
                        "La Resolución Directoral",
                        "El Edicto Notarial",
                        "El Acuerdo de Concertación"
                    ),
                    correctIndex = 1,
                    explanation = "La Ordenanza Municipal es la norma jurídica de mayor jerarquía emitida por los municipios y posee rango de ley en su jurisdicción.",
                    subject = "Ed. Cívica",
                    semana = 9
                ),
                Challenge(
                    id = "q_civ_t09_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La participación porcentual que reciben los gobiernos locales y regionales sobre los ingresos y rentas obtenidos por el Estado en la explotación económica de recursos naturales se denomina:",
                    options = listOf("FONCOMUN", "Canon", "Drawback", "Arbitrio", "Regalía contractual exclusiva"),
                    correctIndex = 1,
                    explanation = "El Canon es la participación económica constitucional que perciben los gobiernos regionales y locales de la explotación de recursos minerales, petrolíferos, etc.",
                    subject = "Ed. Cívica",
                    semana = 9
                )
            )
        ),

        // =========================================================================
        // TEMA 10: DESARROLLO, CONVIVENCIA Y CULTURA CÍVICA (SEMANA 10)
        // =========================================================================
        LessonNode(
            id = "civ_t10_s01",
            subjectId = "civica",
            semana = 10,
            subtema = "10.1 Enfoque del Desarrollo Humano, IDH (Amartya Sen) y Seguridad Ciudadana (SINASEC)",
            title = "Desarrollo Humano (IDH) y el Sistema de Seguridad Ciudadana (SINASEC)",
            theory = LessonTheory(
                id = "th_civ_t10_s01",
                asignatura = "Ed. Cívica",
                semana = 10,
                titulo = "El Desarrollo Humano y la Seguridad Ciudadana",
                resumen = "• El Enfoque del Desarrollo Humano (Amartya Sen y Mahbub ul Haq):\n  - Supera la visión cuantitativa tradicional que reducía el progreso de un país al crecimiento del PBI.\n  - El desarrollo humano es el **proceso de expansión de las libertades reales y capacidades de las personas** para que elijan y lleven adelante el tipo de vida que valoran.\n\n• El Índice de Desarrollo Humano (IDH del PNUD):\n  Indicador compuesto que mide tres dimensiones fundamentales:\n  1. **Salud (Vida larga y saludable)**: Medida a través de la **Esperanza de vida al nacer**.\n  2. **Educación (Acceso al conocimiento)**: Medida mediante los **Años promedio de escolaridad** (en adultos de 25 años a más) y los **Años esperados de escolaridad** (en niños en edad escolar).\n  3. **Nivel de Vida Digno**: Medido a través del **Ingreso Nacional Bruto (INB) per cápita** ajustado por la Paridad del Poder Adquisitivo (PPA en dólares).\n\n• Seguridad Ciudadana y el SINASEC (Ley N.° 27933):\n  - Condición social democrática donde las personas ejercen sus libertades libres de las amenazas de la delincuencia.\n  - Sistema Nacional de Seguridad Ciudadana: Liderado por el CONASEC (presidido por el Premier).\n  - **Trinomio de la Seguridad Local**:\n    1. Policía Nacional del Perú (PNP): Titular del orden interno e investigación del delito.\n    2. Gobiernos Locales: Cuerpo de **Serenazgo** municipal preventivo.\n    3. La Comunidad Organizada: **Juntas Vecinales de Seguridad Ciudadana**.",
                conceptosClave = listOf(
                    "Desarrollo Humano (Amartya Sen): Expansión de libertades reales y capacidades humanas",
                    "Tres dimensiones del IDH: Esperanza de vida (salud), Escolaridad (educación) e INB per cápita (ingresos)",
                    "SINASEC (Ley N.° 27933): Sistema multisectorial de seguridad ciudadana encabezado por el CONASEC",
                    "Trinomio de la seguridad comunitaria: PNP, Serenazgo municipal y Juntas Vecinales"
                ),
                formulas = listOf(
                    "\\text{IDH} = \\sqrt[3]{\\text{Índice Salud} \\times \\text{Índice Educación} \\times \\text{Índice Ingreso}}",
                    "\\text{Trinomio de Seguridad} = \\text{Policía Nacional (PNP)} + \\text{Serenazgo Municipal} + \\text{Juntas Vecinales}"
                ),
                formulaName = "Fórmula del Índice de Desarrollo Humano",
                formulaLatex = "\\text{IDH} = f(\\text{Esperanza de Vida}, \\; \\text{Años de Escolaridad}, \\; \\text{INB per cápita PPA})",
                formulaDescription = "Dimensiones objetivas de medición del bienestar humano según el PNUD.",
                admissionTip = "Las tres dimensiones evaluadas en el IDH del PNUD son: 1. SALUD (esperanza de vida), 2. EDUCACIÓN (escolaridad) y 3. INGRESOS (INB per cápita).",
                admissionExplanation = "• El serenazgo municipal cumple una función eminentemente preventiva y de apoyo a la PNP; los serenos no pueden portar armas de fuego ni sustituir a la policía."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t10_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El Índice de Desarrollo Humano (IDH) elaborado por el PNUD evalúa el bienestar social a través de tres dimensiones fundamentales que son:",
                    options = listOf(
                        "Gasto militar, exportaciones mineras e inflación anual",
                        "Salud (esperanza de vida), educación (escolaridad) e ingresos (INB per cápita)",
                        "Población total, territorio geográfico y densidad demográfica",
                        "Número de partidos políticos, congresistas electos y ministerios",
                        "Producción de energía eléctrica, carreteras pavimentadas y puertos"
                    ),
                    correctIndex = 1,
                    explanation = "El IDH evalúa de manera balanceada tres pilares: salud (vida larga), educación (conocimiento) y nivel de vida digno (ingresos per cápita).",
                    subject = "Ed. Cívica",
                    semana = 10
                ),
                Challenge(
                    id = "q_civ_t10_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el marco del Sistema Nacional de Seguridad Ciudadana (SINASEC), el trinomio estratégico de prevención y vigilancia vecinal está integrado por:",
                    options = listOf(
                        "El Ejército, la Marina y la Fuerza Aérea",
                        "El Poder Judicial, el Ministerio Público y el Inpe",
                        "La Policía Nacional, el Serenazgo municipal y las Juntas Vecinales",
                        "Los congresistas, los ministros y los jueces de paz",
                        "La Defensoría del Pueblo, el TC y la Contraloría"
                    ),
                    correctIndex = 2,
                    explanation = "A nivel local, el trinomio operativo de seguridad lo conforman la PNP, el serenazgo de los municipios y la comunidad organizada en juntas vecinales.",
                    subject = "Ed. Cívica",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "civ_t10_s02",
            subjectId = "civica",
            semana = 10,
            subtema = "10.2 Medios Alternativos de Solución de Conflictos (MASC: Negociación, Mediación, Conciliación y Arbitraje)",
            title = "Resolución Pacífica de Conflictos: Medios Alternativos (MASC)",
            theory = LessonTheory(
                id = "th_civ_t10_s02",
                asignatura = "Ed. Cívica",
                semana = 10,
                titulo = "Cultura de Paz y los MASC",
                resumen = "• Los Medios Alternativos de Solución de Conflictos (MASC):\n  Mecanismos pacíficos y dialógicos al margen de la vía judicial ordinaria que permiten resolver litigios y desavenencias de manera rápida, económica y armónica.\n\n• Gradación de los Cuatro MASC:\n\n1. **La Negociación (Mecanismo Autocompositivo Directo)**:\n   - Las partes en controversia dialogan y buscan un acuerdo mutuo por sí mismas, **sin la intervención de ningún tercero** intermediario.\n\n2. **La Mediación (Mecanismo Autocompositivo con Tercero Pasivo)**:\n   - Interviene un tercero neutral e imparcial llamado **mediador**.\n   - Rol: Facilita la comunicación entre las partes y propicia el clima de diálogo, pero **NO propone fórmulas de solución**; la solución emana exclusivamente de las partes.\n\n3. **La Conciliación Extrajudicial (Ley N.° 26872 - Con Tercero Activo)**:\n   - Interviene un **conciliador extrajudicial** acreditado por el Ministerio de Justicia.\n   - Rol: Además de facilitar el diálogo, el conciliador **SÍ está facultado para proponer fórmulas conciliatorias de solución no vinculantes**.\n   - El **Acta de Conciliación con Acuerdo** tiene mérito de **título de ejecución** (fuerza equivalente a una sentencia judicial firme).\n   - Materias conciliables: Derechos disponibles de las partes (pensiones alimenticias, régimen de visitas, deudas, desalojos).\n\n4. **El Arbitraje (Mecanismo Heterocompositivo)**:\n   - Las partes se someten voluntariamente al fallo de un **árbitro** o tribunal arbitral privado.\n   - El árbitro escucha a las partes y emite una decisión obligatoria y definitiva denominada **Laudo Arbitral**, que tiene fuerza vinculante y cosa juzgada.",
                conceptosClave = listOf(
                    "Negociación: Sin tercero intermediario; diálogo directo bilateral",
                    "Mediación: El tercero neutral facilita el diálogo pero NO propone soluciones",
                    "Conciliación Extrajudicial (Ley N.° 26872): El conciliador SÍ propone fórmulas de solución; Acta = Título de ejecución",
                    "Arbitraje: Mecanismo heterocompositivo donde el árbitro decide y dicta el Laudo Arbitral inapelable"
                ),
                formulas = listOf(
                    "\\text{Negociación} \\to \\text{Sin Tercero} \\quad \\longleftrightarrow \\quad \\text{Mediación} \\to \\text{Tercero NO Propone Fórmulas}",
                    "\\text{Conciliación} \\to \\text{Tercero SÍ Propone Fórmulas} \\quad \\longleftrightarrow \\quad \\text{Arbitraje} \\to \\text{Tercero Resuelve (Laudo)}"
                ),
                formulaName = "Escalafón de los MASC",
                formulaLatex = "\\text{MASC}: \\; \\text{Negociación (Partes)} \\to \\text{Mediación (Facilita)} \\to \\text{Conciliación (Propone)} \\to \\text{Arbitraje (Falla)}",
                formulaDescription = "Grado progresivo de intervención del tercero neutral en los métodos alternativos de solución de controversias.",
                admissionTip = "¡Pregunta estrella de examen!: El mediador NO propone fórmulas de solución; el conciliador SÍ propone fórmulas de solución; el árbitro DECIDE y resuelve el conflicto mediante el laudo.",
                admissionExplanation = "• La conciliación extrajudicial es un requisito previo obligatorio de procedibilidad antes de interponer demandas civiles sobre derechos disponibles."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t10_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En cuál de los siguientes Medios Alternativos de Solución de Conflictos (MASC) el tercero neutral NO propone fórmulas de solución, limitándose únicamente a restablecer la comunicación entre las partes:",
                    options = listOf("Arbitraje de derecho", "Conciliación extrajudicial", "Mediación", "Juicio ordinario", "Laudo vinculante"),
                    correctIndex = 2,
                    explanation = "En la mediación, el mediador actúa como facilitador de la comunicación pero no plantea fórmulas de arreglo a las partes.",
                    subject = "Ed. Cívica",
                    semana = 10
                ),
                Challenge(
                    id = "q_civ_t10_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La resolución vinculante y con valor de cosa juzgada emitida por un árbitro o tribunal arbitral que pone fin a una controversia patrimonial se denomina:",
                    options = listOf("Auto admisorio", "Laudo Arbitral", "Decreto de urgencia", "Edicto notarial", "Acta preliminar"),
                    correctIndex = 1,
                    explanation = "El Laudo Arbitral es la decisión definitiva y obligatoria dictada en sede arbitral con fuerza equivalente a una sentencia judicial.",
                    subject = "Ed. Cívica",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "civ_t10_s03",
            subjectId = "civica",
            semana = 10,
            subtema = "10.3 Ética en la Función Pública (Ley N.° 27815) y Delitos contra la Administración Pública",
            title = "Ética Pública, Transparencia y Tipificación de Delitos de Corrupción",
            theory = LessonTheory(
                id = "th_civ_t10_s03",
                asignatura = "Ed. Cívica",
                semana = 10,
                titulo = "La Ética Pública y la Lucha Anticorrupción",
                resumen = "• La Función Pública y el Código de Ética (Ley N.° 27815):\n  - Función Pública: Toda actividad temporal o permanente prestada por una persona en nombre del Estado, orientada al bien común y al servicio de la Nación.\n  - Principios de la Función Pública: **Probidad** (rectitud y honradez intachable), **Eficiencia**, **Idoneidad**, **Veracidad**, **Lealtad y Obediencia**, y **Justicia y Equidad**.\n  - Deberes: Neutralidad política en el ejercicio del cargo, transparencia en el uso de recursos y discreción.\n\n• Delitos contra la Administración Pública (Código Penal):\n  1. **Peculado**:\n     - El funcionario público que **se apropia, utiliza o desvía para sí o para un tercero caudales o bienes del Estado** que le fueron confiados por razón de su cargo (peculado doloso o por uso).\n  2. **Colusión**:\n     - El funcionario que en contratos, licitaciones o adquisiciones del Estado **se concierta clandestinamente con los proveedores privados** para defraudar patrimonialmente al Estado.\n  3. **Cohecho (El Soborno o 'Coima')**:\n     - *Cohecho Pasivo*: El funcionario público que solicita, acepta o recibe donativo o promesa económica para realizar o incumplir un acto de su función.\n     - *Cohecho Activo*: El particular que entrega, ofrece o promete el soborno al funcionario.\n  4. **Tráfico de Influencias**:\n     - El que, invocando tener influencias reales o simuladas con un funcionario judicial o administrativo, ofrece interceder ante este a cambio de dinero o beneficio.",
                conceptosClave = listOf(
                    "Ley N.° 27815: Código de Ética de la Función Pública (Probidad, Idoneidad, Veracidad)",
                    "Peculado: Apropiación indebida de dinero o bienes del Estado encomendados por razón del cargo",
                    "Colusión: Concierto fraudulento entre el funcionario y el proveedor en licitaciones públicas",
                    "Cohecho: Soborno (Pasivo: el funcionario recibe; Activo: el particular entrega o promete)",
                    "Tráfico de Influencias: Venta ilícita de influencias ante autoridades judiciales o administrativas"
                ),
                formulas = listOf(
                    "\\text{Peculado} = \\text{Funcionario Público} + \\text{Apropiación / Uso indebido de caudales públicos}",
                    "\\text{Colusión} = \\text{Pacto Secreto Funcionario-Proveedor} \\to \\text{Defraudación al Estado}",
                    "\\text{Cohecho Pasivo} = \\text{Solicitar o aceptar soborno / coima}"
                ),
                formulaName = "Tipología Penal de Delitos de Corrupción",
                formulaLatex = "\\text{Corrupción} \\implies \\text{Peculado (Robo)} \\; \\lor \\; \\text{Colusión (Pacto Ilegal)} \\; \\lor \\; \\text{Cohecho (Soborno)}",
                formulaDescription = "Delitos tipificados en el Título XVIII del Código Penal peruano contra la correcta administración estatal.",
                admissionTip = "No confundas PECULADO con COLUSIÓN: Si el funcionario se roba el dinero que custodia = PECULADO. Si el funcionario pacta en secreto con un proveedor para inflar precios en una obra = COLUSIÓN.",
                admissionExplanation = "• La presunción de inocencia y el debido proceso garantizan que todo acusado de corrupción sea procesado judicialmente antes de imponérsele condena."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t10_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El delito en el cual un funcionario público se apropia indebidamente para beneficio personal de fondos públicos que le fueron confiados en custodia por su cargo se denomina:",
                    options = listOf("Cohecho pasivo", "Peculado", "Prevaricato", "Tráfico de influencias", "Sedición"),
                    correctIndex = 1,
                    explanation = "El peculado es la apropiación o utilización indebida de caudales o bienes públicos por parte del funcionario encargado de su custodia.",
                    subject = "Ed. Cívica",
                    semana = 10
                ),
                Challenge(
                    id = "q_civ_t10_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Cuando un funcionario público encargado de una licitación de obras concierta clandestinamente con una empresa constructora para favorecerla a cambio de comisiones, comete el delito de:",
                    options = listOf("Colusión", "Peculado culposo", "Abuso de autoridad", "Desacato", "Concusión"),
                    correctIndex = 0,
                    explanation = "La colusión penaliza el acuerdo fraudulento entre funcionarios y particulares en contrataciones y adquisiciones del Estado.",
                    subject = "Ed. Cívica",
                    semana = 10
                )
            )
        ),

        // =========================================================================
        // TEMA 11: DERECHO UNIVERSITARIO (SEMANA 11)
        // =========================================================================
        LessonNode(
            id = "civ_t11_s01",
            subjectId = "civica",
            semana = 11,
            subtema = "11.1 Marco Constitucional y Fines de la Universidad Peruana (Art. 18° y Ley N.° 30220)",
            title = "Marco Constitucional de la Universidad y la Ley Universitaria N.° 30220",
            theory = LessonTheory(
                id = "th_civ_t11_s01",
                asignatura = "Ed. Cívica",
                semana = 11,
                titulo = "La Universidad Peruana: Marco Constitucional y Fines",
                resumen = "• Marco Constitucional (Artículo 18° de la Constitución):\n  - La educación universitaria tiene como fines la formación profesional, la difusión cultural, la creación intelectual y artística y la **investigación científica y tecnológica**.\n  - La universidad es una comunidad académica orientada a la investigación y a la docencia integrada por docentes, estudiantes y graduados.\n  - Las universidades se rigen por sus propios estatutos en el marco de la Constitución y de las leyes.\n\n• La Ley Universitaria N.° 30220:\n  - Aprobada en julio de 2014 para promover el aseguramiento continuo de la calidad de la educación superior universitaria.\n  - Fines Esenciales (Art. 5° de la Ley 30220):\n    1. Formar profesionales humanistas y científicos de alta calidad.\n    2. **Realizar y promover la investigación científica como función obligatoria y primordial**.\n    3. Proyección social y extensión cultural comunitaria.\n    4. Afirmar la identidad nacional y la defensa del estado constitucional democrático.\n\n• Gratuidad de la Enseñanza Pública (Art. 17° Const.):\n  - En las universidades públicas el Estado garantiza la gratuidad de la enseñanza para el pregrado (bachillerato y título).\n  - **Condición legal**: La gratuidad está supeditada al **rendimiento académico satisfactorio** de los estudiantes (quienes desaprueban reiteradamente pierden la gratuidad).\n\n• La SUNEDU (Superintendencia Nacional de Educación Superior Universitaria):\n  - Organismo técnico público adscrito al Minedu encargado de verificar las **Condiciones Básicas de Calidad (CBC)** para otorgar o denegar el **Licenciamiento Institucional** obligatorio.",
                conceptosClave = listOf(
                    "Artículo 18° Const.: Universidad como comunidad académica de investigación y docencia",
                    "Ley Universitaria N.° 30220: Investigación científica como función obligatoria y primordial",
                    "Gratuidad condicionada en universidades públicas sujeta al rendimiento académico satisfactorio",
                    "SUNEDU: Otorga el Licenciamiento Institucional tras verificar las Condiciones Básicas de Calidad"
                ),
                formulas = listOf(
                    "\\text{Comunidad Universitaria} = \\text{Docentes} + \\text{Estudiantes} + \\text{Graduados}",
                    "\\text{Gratuidad Universitaria Pública} \\iff \\text{Rendimiento Académico Satisfactorio}"
                ),
                formulaName = "Estatuto Constitucional Universitario",
                formulaLatex = "\\text{Licenciamiento Institucional (SUNEDU)} \\iff \\text{Cumplimiento de Condiciones Básicas de Calidad (CBC)}",
                formulaDescription = "Requisito legal obligatorio para el funcionamiento de universidades públicas y privadas en el Perú.",
                admissionTip = "¡Exclusivo UNSA!: La investigación científica NO es una actividad optativa; la Ley N.° 30220 la consagra como una función obligatoria y primordial de la universidad.",
                admissionExplanation = "• La Universidad Nacional de San Agustín de Arequipa (UNSA) fue fundada en 1828 y fue una de las primeras universidades públicas en obtener su Licenciamiento Institucional por 10 años."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t11_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 18° de la Constitución y la Ley N.° 30220, la función obligatoria y primordial que define la naturaleza de la universidad es:",
                    options = listOf(
                        "La intermediación financiera de cooperativas",
                        "La investigación científica, tecnológica y humanística",
                        "El adiestramiento militar obligatorio de reservistas",
                        "La producción exclusiva de bienes agropecuarios",
                        "La fiscalización de los comicios parlamentarios"
                    ),
                    correctIndex = 1,
                    explanation = "La Ley Universitaria 30220 consagra a la investigación científica como una función esencial, obligatoria y primordial de la comunidad académica.",
                    subject = "Ed. Cívica",
                    semana = 11
                ),
                Challenge(
                    id = "q_civ_t11_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En las universidades públicas del Perú, el derecho a la gratuidad de la enseñanza garantizado por el Estado está legalmente condicionado a:",
                    options = listOf(
                        "Pagar una membresía anual en la Defensoría del Pueblo",
                        "Mantener un rendimiento académico satisfactorio y no desaprobar reiteradamente",
                        "Haber nacido obligatoriamente en el departamento de la sede central",
                        "Afiliarse al partido de turno en el gobierno",
                        "No solicitar carné universitario oficial"
                    ),
                    correctIndex = 1,
                    explanation = "La Constitución y la Ley 30220 condicionan la gratuidad de la enseñanza pública universitaria al rendimiento académico satisfactorio del estudiante.",
                    subject = "Ed. Cívica",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "civ_t11_s02",
            subjectId = "civica",
            semana = 11,
            subtema = "11.2 Las Cinco Dimensiones de la Autonomía Universitaria e Inviolabilidad del Recinto",
            title = "Autonomía Universitaria (Cinco Dimensiones) e Inviolabilidad del Campus",
            theory = LessonTheory(
                id = "th_civ_t11_s02",
                asignatura = "Ed. Cívica",
                semana = 11,
                titulo = "La Autonomía Universitaria y la Inviolabilidad del Recinto",
                resumen = "• La Autonomía Universitaria (Artículo 18° de la Constitución y Art. 8° de la Ley 30220):\n  Prerrogativa inherente a las universidades para autogobernarse y organizarse con independencia de cualquier poder político, económico o religioso.\n\n• Las Cinco Dimensiones de la Autonomía Universitaria:\n  1. **Autonomía Normativa**: Potestad exclusiva para redactar, modificar y aprobar su propio **Estatuto Universitario** y reglamentos internos.\n  2. **Autonomía de Gobierno**: Facultad de elegir democráticamente a sus autoridades (Rector, Vicerrectores, Decanos) mediante voto universal de docentes y estudiantes.\n  3. **Autonomía Académica**: Capacidad de diseñar libremente sus planes de estudio, mallas curriculares, líneas de investigación y otorgar grados académicos y títulos profesionales.\n  4. **Autonomía Administrativa**: Potestad para fijar sus estructuras orgánicas internas, contratar docentes y personal administrativo.\n  5. **Autonomía Económica**: Libertad para administrar su patrimonio, rentas propias y ejecutar su presupuesto público o privado.\n\n• La Inviolabilidad del Recinto Universitario (Artículo 19° de la Ley 30220):\n  - El campus y locales universitarios son **inviolables**.\n  - La Policía Nacional del Perú y las Fuerzas Armadas **solo pueden ingresar al recinto universitario en dos casos exclusivos**:\n    1. Por **orden judicial expresa y fundada** emanada de un juez competente.\n    2. En caso de **flagrante delito comprobado**.\n  - Fuera de estos casos, la seguridad interna está a cargo exclusivo de la propia universidad.",
                conceptosClave = listOf(
                    "Cinco dimensiones: Normativa (Estatuto), De Gobierno (elecciones), Académica, Administrativa y Económica",
                    "Inviolabilidad del recinto universitario tutelada por ley",
                    "Ingreso de la Policía Nacional: Solo por orden judicial expresa o flagrante delito",
                    "La autonomía se ejerce de conformidad con la Constitución y las leyes del país"
                ),
                formulas = listOf(
                    "\\text{Autonomía Universitaria} = \\text{Normativa} + \\text{Gobierno} + \\text{Académica} + \\text{Administrativa} + \\text{Económica}",
                    "\\text{Ingreso Policial al Campus} \\iff \\text{Orden Judicial Escrita} \\; \\lor \\; \\text{Flagrante Delito}"
                ),
                formulaName = "Pentágono de la Autonomía Universitaria",
                formulaLatex = "\\text{Autonomía} \\implies \\text{Inviolabilidad del Campus} \\; (\\text{Prohibición de allanamiento policial discrecional})",
                formulaDescription = "Dimensiones jurídicas e institucionales consagradas en el artículo 8° de la Ley Universitaria.",
                admissionTip = "¡Pregunta fija UNSA!: Las CINCO dimensiones de la autonomía universitaria son: Normativa, De Gobierno, Académica, Administrativa y Económica.",
                admissionExplanation = "• La autonomía universitaria no convierte al campus en un territorio extraterritorial; los delitos comunes cometidos adentro son juzgados por el Poder Judicial ordinario."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t11_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La facultad que tiene una universidad pública como la UNSA para elaborar, modificar y aprobar democráticamente su propio Estatuto institucional corresponde a la autonomía:",
                    options = listOf("Económica", "Académica", "Normativa", "Administrativa", "Jurisdiccional"),
                    correctIndex = 2,
                    explanation = "La autonomía normativa es la potestad que tienen las universidades para dictar su Estatuto y reglamentos internos.",
                    subject = "Ed. Cívica",
                    semana = 11
                ),
                Challenge(
                    id = "q_civ_t11_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "De acuerdo con el artículo 19° de la Ley N.° 30220 sobre la inviolabilidad del recinto universitario, las fuerzas del orden (PNP) solo pueden ingresar al campus en caso de:",
                    options = listOf(
                        "Autorización verbal de cualquier dirigente de centro federado",
                        "Orden judicial expresa o flagrante delito",
                        "Solicitud de un congresista de la República",
                        "Inspección rutinaria de tránsito vehicular",
                        "Convocatoria a paro de trabajadores administrativos"
                    ),
                    correctIndex = 1,
                    explanation = "La ley consagra la inviolabilidad del recinto universitario; la policía solo puede ingresar por orden de un juez o ante flagrancia delictiva.",
                    subject = "Ed. Cívica",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "civ_t11_s03",
            subjectId = "civica",
            semana = 11,
            subtema = "11.3 Estructura de Gobierno de la Universidad (Asamblea, Consejo, Rectorado) y la Comunidad Universitaria",
            title = "Órganos de Gobierno Universitario y Representación del Tercio Estudiantil",
            theory = LessonTheory(
                id = "th_civ_t11_s03",
                asignatura = "Ed. Cívica",
                semana = 11,
                titulo = "Gobierno Universitario, Autoridades y Tercio Estudiantil",
                resumen = "• Estructura de Gobierno de la Universidad Pública (Ley N.° 30220):\n\n1. **Asamblea Universitaria (Máximo Órgano Deliberativo Colegiado)**:\n   - Integrada por el Rector, los Vicerrectores, los Decanos de las Facultades, representantes de los docentes ordinarios, representantes de los estudiantes (**el tercio estudiantil**) y representantes de los graduados.\n   - Funciones: Reformar el Estatuto Universitario, declarar la vacancia del Rector y evaluar el funcionamiento integral de la universidad.\n\n2. **Consejo Universitario (Órgano de Dirección Superior y Gestión)**:\n   - Integrado por el Rector, los Vicerrectores, los Decanos, el tercio de representantes estudiantiles y un representante de graduados.\n   - Funciones: Aprobar el presupuesto anual, planes curriculares y conferir los grados académicos (Bachiller, Maestro, Doctor) y títulos profesionales aprobados por las Facultades.\n\n3. **El Rectorado (Órgano Ejecutivo de la Universidad)**:\n   - **Rector**: Máxima autoridad y representante legal. Requiere ser docente principal con grado de Doctor. Mandato de **5 años sin reelección inmediata**.\n   - Dos Vicerrectores: **Vicerrector Académico** y **Vicerrector de Investigación**.\n\n4. **Gobierno de las Facultades**:\n   - **Consejo de Facultad**: Órgano de gobierno de la facultad (Decano + docentes + tercio estudiantil).\n   - **Decano**: Máxima autoridad de la facultad; elegido por 4 años.\n\n• El Tercio Estudiantil y Requisitos de Representación:\n  - Los estudiantes universitarios participan en todos los órganos colegiados de gobierno en una proporción no menor a **un tercio (1/3) del total de sus miembros**.\n  - Requisitos para ser delegado estudiantil: Pertenecer al **tercio superior de rendimiento académico**, haber aprobado un mínimo de 36 créditos lectivos y no registrar antecedentes disciplinarios.",
                conceptosClave = listOf(
                    "Asamblea Universitaria: Máximo órgano de gobierno colegiado y reforma del Estatuto",
                    "Consejo Universitario: Confiere grados académicos, aprueba presupuesto y calendario anual",
                    "Rector y Vicerrectores (Académico y de Investigación): Mandato de 5 años sin reelección inmediata",
                    "Tercio Estudiantil: Representación del 33.3% en todos los órganos de gobierno; requisito de pertenecer al tercio superior"
                ),
                formulas = listOf(
                    "\\text{Tercio Estudiantil} = \\frac{1}{3} \\text{ del total de miembros de la Asamblea y Consejo}",
                    "\\text{Requisito de Delegado Estudiantil} = \\text{Tercio Superior Académico} + \\ge 36 \\text{ Créditos}"
                ),
                formulaName = "Reglas de Cogobierno Universitario",
                formulaLatex = "\\text{Gobierno UNSA} = \\text{Asamblea Universitaria (Máximo)} > \\text{Consejo Universitario} > \\text{Rectorado / Decanatos}",
                formulaDescription = "Organización jerárquica de la toma de decisiones en la universidad pública peruana.",
                admissionTip = "¡Pregunta infalible UNSA!: Para ser representante estudiantil ante el Consejo de Facultad o Asamblea Universitaria, es REQUISITO OBLIGATORIO pertenecer al TERCIO SUPERIOR de rendimiento académico.",
                admissionExplanation = "• En la elección de autoridades (Rector y Decanos), el voto de los docentes equivale a dos tercios (2/3) y el de los estudiantes al tercio restante (1/3) en ponderación electoral."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_civ_t11_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la estructura de gobierno de una universidad pública como la UNSA, el máximo órgano de gobierno colegiado competente para modificar el Estatuto Universitario es:",
                    options = listOf(
                        "El Consejo Universitario",
                        "La Asamblea Universitaria",
                        "La Federación Universitaria de Arequipa (FUA)",
                        "El Consejo de Facultad de Medicina",
                        "El Tribunal de Honor Universitario"
                    ),
                    correctIndex = 1,
                    explanation = "La Asamblea Universitaria es el máximo órgano deliberativo y colegiado de la universidad, competente para aprobar y reformar el Estatuto.",
                    subject = "Ed. Cívica",
                    semana = 11
                ),
                Challenge(
                    id = "q_civ_t11_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el requisito académico indispensable exigido por la Ley Universitaria N.° 30220 para que un estudiante postule como representante ante el Consejo de Facultad o Asamblea Universitaria?",
                    options = listOf(
                        "Estar matriculado en el primer semestre de la carrera",
                        "Pertenecer al tercio superior de rendimiento académico de su especialidad",
                        "Ser presidente de su centro de estudiantes de colegio secundario",
                        "Tener matrícula invicta en todos los cursos de posgrado",
                        "Contar con una carta de recomendación del decano"
                    ),
                    correctIndex = 1,
                    explanation = "Para ser representante en el tercio estudiantil, la Ley 30220 exige obligatoriamente pertenecer al tercio superior de calificaciones.",
                    subject = "Ed. Cívica",
                    semana = 11
                )
            )
        )
    )
}
