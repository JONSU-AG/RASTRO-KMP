package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object LiteraturaCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: TEORÍA LITERARIA, GÉNEROS Y FIGURAS RETÓRICAS (SEMANA 1)
        // =========================================================================
        LessonNode(
            id = "lit_t01_s01",
            subjectId = "literatura",
            semana = 1,
            subtema = "1.1 Naturaleza del Fenómeno Literario y Función Poética",
            title = "Naturaleza de la Literatura, Ficcionalidad y Función Poética",
            theory = LessonTheory(
                id = "th_lit_t01_s01",
                asignatura = "Literatura",
                semana = 1,
                titulo = "El Fenómeno Literario y la Función Poética",
                resumen = "• La Literatura como Arte:\n  - Arte que utiliza la palabra oral o escrita como vehículo de expresión estética.\n  - Según Roman Jakobson, en el hecho literario predomina la **función poética o estética**, donde el mensaje atrae la atención sobre su propia forma, estructura fónica y densidad connotativa.\n\n• Conceptos Clave de la Teoría Literaria:\n  1. Literariedad (Literaturnost): Concepto formulado por los formalistas rusos (Roman Jakobson, Viktor Shklovski) que define aquello que convierte a un mensaje verbal común en una obra de arte literaria.\n  2. Extrañamiento (Ostranenie): Procedimiento artístico que desautomatiza la percepción habitual, haciendo que los objetos y vivencias cotidianas se perciban como algo insólito y nuevo.\n  3. Pacto Ficcional: Convención tácita entre el autor y el lector por la cual este último suspende voluntariamente su incredulidad ante el universo de ficción propuesto, aceptándolo como verosímil durante la lectura.",
                conceptosClave = listOf(
                    "Función poética (Jakobson): Énfasis en la forma estética del mensaje",
                    "Literariedad: Rasgos específicos que convierten el lenguaje en arte",
                    "Extrañamiento (Ostranenie): Desautomatización perceptiva según Viktor Shklovski",
                    "Pacto de ficcionalidad: Suspensión voluntaria de la incredulidad"
                ),
                formulas = listOf(
                    "\\text{Hecho Literario} = \\text{Función Poética} + \\text{Plurisignificación (Connotación)}",
                    "\\text{Extrañamiento} \\implies \\text{Desautomatización de la Percepción Cotidiana}"
                ),
                formulaName = "Ecuación Semiótica del Discurso Literario",
                formulaLatex = "\\text{Literariedad} = \\text{Forma Estética} \\oplus \\text{Pacto Ficcional} \\oplus \\text{Polisemia}",
                formulaDescription = "Condiciones estructurales del discurso verbal estético según el formalismo ruso.",
                admissionTip = "Si la pregunta de admisión consulta qué lingüista definió la 'función poética' como el enfoque en el mensaje por el mensaje mismo, marca ROMAN JAKOBSON.",
                admissionExplanation = "• La ficción literaria no es 'mentira', sino un mundo verosímil regulado por sus propias leyes estéticas internas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el marco de la teoría de la comunicación propuesta por Roman Jakobson, el texto literario se distingue fundamentalmente por la primacía de la función:",
                    options = listOf("Metalingüística", "Referencial", "Fática", "Poética o estética", "Apelativa o conativa"),
                    correctIndex = 3,
                    explanation = "La función poética o estética centra la atención en la configuración formal, estética y connotativa del propio mensaje.",
                    subject = "Literatura",
                    semana = 1
                ),
                Challenge(
                    id = "q_lit_t01_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cómo denominaron los teóricos del formalismo ruso a la propiedad intrínseca que convierte un discurso verbal cualquiera en un objeto de arte estético?",
                    options = listOf("Verosimilitud", "Literariedad", "Mímesis", "Catarsis", "Catacresis"),
                    correctIndex = 1,
                    explanation = "La 'literariedad' (literaturnost) es el rasgo definitorio que hace que una obra verbal constituya literatura y arte.",
                    subject = "Literatura",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "lit_t01_s02",
            subjectId = "literatura",
            semana = 1,
            subtema = "1.2 Géneros Literarios: Épico, Lírico, Dramático y Ensayo",
            title = "Clasificación de Géneros y Especies Literarias",
            theory = LessonTheory(
                id = "th_lit_t01_s02",
                asignatura = "Literatura",
                semana = 1,
                titulo = "Taxonomía de los Géneros y Especies Literarias",
                resumen = "• La Tríada Aristotélica Clásica (Poética de Aristóteles):\n  1. Género Épico (Objetivo / Pasado):\n     - Narración en verso de acontecimientos externos y hazañas heroicas monumentales.\n     - Especies: Epopeya (La Ilíada, La Odisea), Cantar de Gesta (Cantar de Mio Cid, Chanson de Roland), Poema Épico (La Araucana).\n  2. Género Lírico (Subjetivo / Presente Intemporal):\n     - Expresión del mundo afectivo íntimo del yo poético; musicalidad y ritmo.\n     - Especies: Oda (alabanza solemne), Elegía (dolor por muerte o pérdida), Égloga (escenario pastoril bucólico), Madrigal (canto breve de amor), Sátira (burla punzante), Yaraví (melancolía mestiza).\n  3. Género Dramático (Acción Dialógica / Representación Escénica):\n     - Conflictos encarnados por personajes sin intermediario narrador; diseñado para el teatro.\n     - Especies: Tragedia (desenlace fatal, soberbia [hibris], purificación de pasiones [catarsis]), Comedia (tono festivo satírico, final feliz), Drama o Tragicomedia (fusión realista de lo trágico y cómico).\n\n• Género Narrativo Moderno (Prosa):\n  - Especies: Novela (extensa, polifónica) y Cuento (breve, concentrado, tensión única).\n\n• Género Expositivo / Didáctico:\n  - Especie: Ensayo (fundado por Michel de Montaigne; prosa reflexiva y argumentativa con voluntad de estilo).",
                conceptosClave = listOf(
                    "Épico: Objetividad, narrador, hazañas pretéritas (Epopeya, Cantar de gesta)",
                    "Lírico: Subjetividad, yo poético, emotividad (Oda, Elegía, Égloga)",
                    "Dramático: Acción directa representada en escenario (Tragedia, Comedia, Drama)",
                    "Catarsis: Purificación espiritual por terror y compasión en la tragedia griega"
                ),
                formulas = listOf(
                    "\\text{Tragedia} = \\text{Héroe Noble} + \\text{Destino Ineludible (Fatum)} \\to \\text{Catarsis}",
                    "\\text{Lírica} = \\text{Subjetividad} \\oplus \\text{Ritmo/Métrica}, \\quad \\text{Épica} = \\text{Objetividad} \\oplus \\text{Diégesis}"
                ),
                formulaName = "Tríada Canónica Aristotélica",
                formulaLatex = "\\text{Géneros}: \\; \\text{Épico (Objetivo)} \\; \\longleftrightarrow \\; \\text{Lírico (Subjetivo)} \\; \\longleftrightarrow \\; \\text{Dramático (Acción)}",
                formulaDescription = "Clasificación fundacional de las formas discursivas en la estética occidental.",
                admissionTip = "Diferencia siempre: la ELEGÍA expresa dolor o luto por muerte o pérdida; la ÉGLOGA es un diálogo pastoril en un paisaje campestre idílico.",
                admissionExplanation = "• La tragedia griega culmina en 'catarsis', estado de purificación emocional del espectador provocado por la conmiseración y el pavor ante el destino."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Especie lírica de ambiente pastoril y bucólico en la que pastores idealizados dialogan en medio de una naturaleza amena sobre sus venturas o desdichas amorosas:",
                    options = listOf("Oda", "Elegía", "Égloga", "Madrigal", "Epigrama"),
                    correctIndex = 2,
                    explanation = "La égloga es la composición poética bucólica protagonizada por pastores en un marco campestre idealizado (locus amoenus).",
                    subject = "Literatura",
                    semana = 1
                ),
                Challenge(
                    id = "q_lit_t01_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la especie dramática clásica en la que el protagonista se enfrenta a un destino inexorable e insuperable, provocando la catarsis en el espectador?",
                    options = listOf("Comedia de enredos", "Tragedia", "Auto sacramental", "Entremés", "Melodrama"),
                    correctIndex = 1,
                    explanation = "La tragedia enfrenta al héroe contra el hado (fatum), culminando en un desenlace funesto que purifica espiritualmente al espectador (catarsis).",
                    subject = "Literatura",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "lit_t01_s03",
            subjectId = "literatura",
            semana = 1,
            subtema = "1.3 Figuras Retóricas: Tropos (Metáfora, Símil, Metonimia, Sinécdoque)",
            title = "Tropos Literarios: Traslación y Sustitución del Significado",
            theory = LessonTheory(
                id = "th_lit_t01_s03",
                asignatura = "Literatura",
                semana = 1,
                titulo = "Tropos y Figuras de Sentido",
                resumen = "• Definición de Tropo:\n  Sustitución de una palabra o frase por otra cuyo significado original se traslada a un nuevo sentido figurado por relación de analogía o proximidad.\n\n• Principales Tropos Literarios:\n  1. Metáfora:\n     - Identificación o sustitución de un término real (A) por un término imaginario (B) basándose en una relación de semejanza intrínseca.\n     - Metáfora impura (A es B): 'Nuestras vidas son los ríos' (Jorge Manrique).\n     - Metáfora pura (solo B en lugar de A): 'Las perlas de tu boca' (por los dientes blancos).\n  2. Símil o Comparación:\n     - Cotejo explícito entre dos realidades mediante nexos comparativos obligatorios (*como, cual, semejante a, parece*).\n     - Ejemplo: 'El amigo verdadero es como la sombra protectora'.\n  3. Metonimia:\n     - Sustitución semántica basada en una relación de **contigüidad real** objetiva (espacial, temporal o causal):\n       * Causa por efecto: 'Vive de su sudor' (de su trabajo).\n       * Autor por obra: 'Compraron un lienzo de Vinatea Reinoso' (su pintura).\n       * Continente por contenido: 'Bebió tres copas'.\n       * Símbolo por lo simbolizado: 'Traicionó la bandera'.\n  4. Sinécdoque:\n     - Tipo especial de metonimia basada en una relación cuantitativa de inclusión:\n       * La parte por el todo: 'Mil cabezas de ganado', 'Pidió su mano'.\n       * El todo por la parte: 'La ciudad entera salió a recibir al campeón'.",
                conceptosClave = listOf(
                    "Metáfora: Identificación analógica directa (sin nexo comparativo)",
                    "Símil: Comparación expresa con nexos conectores (como, tal cual, parece)",
                    "Metonimia: Relación de contigüidad espacial, causal o material",
                    "Sinécdoque: Relación de inclusión cuantitativa (la parte por el todo)"
                ),
                formulas = listOf(
                    "\\text{Metáfora}: \\; A = B \\quad (\\text{Identificación sin nexo})",
                    "\\text{Símil}: \\; A \\sim B \\quad (\\text{Con nexo comparativo: 'como', 'cual'})",
                    "\\text{Sinécdoque}: \\; \\text{Pars pro toto (La parte por el todo)}"
                ),
                formulaName = "Fórmulas de Tropos y Sustitución",
                formulaLatex = "\\text{Tropo} = \\text{Término Real (A)} \\xrightarrow{\\text{Analogía / Contigüidad}} \\text{Término Evocado (B)}",
                formulaDescription = "Mecanismos de transferencia semántica en el lenguaje poético.",
                admissionTip = "Regla de oro UNSA: Si encuentras el conector 'como', 'cual' o 'parece', es SÍMIL. Si no hay conector y se afirma la equivalencia directa, es METÁFORA.",
                admissionExplanation = "• En la metonimia 'Compró un Picasso', se sustituye la obra artística por el nombre de su creador debido a una relación de causalidad."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la frase: 'El veterano marino divisó diez velas en el horizonte', la figura retórica empleada al referirse a barcos utilizando la palabra 'velas' es:",
                    options = listOf("Hipérbole", "Sinécdoque", "Antítesis", "Epíteto", "Anáfora"),
                    correctIndex = 1,
                    explanation = "La sinécdoque designa la parte de un objeto ('velas') para nombrar la totalidad del mismo ('barcos').",
                    subject = "Literatura",
                    semana = 1
                ),
                Challenge(
                    id = "q_lit_t01_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Identifique la figura de traslación semántica que vincula explícitamente dos términos mediante un nexo comparativo en: 'Tu cabello reluce como el oro al atardecer':",
                    options = listOf("Metonimia", "Metáfora pura", "Símil o comparación", "Paradoja", "Hipérbaton"),
                    correctIndex = 2,
                    explanation = "La presencia del nexo gramatical comparativo 'como' caracteriza de forma unívoca al símil o comparación.",
                    subject = "Literatura",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "lit_t01_s04",
            subjectId = "literatura",
            semana = 1,
            subtema = "1.4 Figuras Retóricas: Pensamiento y Dicción (Hipérbole, Antítesis, Anáfora, Hipérbaton)",
            title = "Figuras de Pensamiento y Construcción Sintáctica",
            theory = LessonTheory(
                id = "th_lit_t01_s04",
                asignatura = "Literatura",
                semana = 1,
                titulo = "Figuras de Pensamiento, Dicción y Sintaxis",
                resumen = "• Figuras de Pensamiento (Afectan la idea global):\n  1. Antítesis: Contraposición simétrica de dos palabras o ideas de significación opuesta ('Es tan corto el amor y es tan largo el olvido').\n  2. Paradoja: Unión aparente de dos ideas contradictorias que esconden una verdad profunda ('Vivo sin vivir en mí, y tan alta vida espero, que muero porque no muero').\n  3. Hipérbole: Exageración desmedida de la realidad ('Tanto dolor se agrupa en mi costado, que por doler me duele hasta el aliento').\n  4. Prosopopeya o Personificación: Atribución de rasgos humanos a seres inanimados ('El viento susurraba secretos entre los sauces').\n\n• Figuras de Construcción o Sintaxis (Afectan el orden gramatical):\n  1. Anáfora: Reiteración de una o más palabras al comienzo de versos o frases consecutivas ('Temprano levantó la muerte el vuelo, / temprano madrugó la madrugada').\n  2. Hipérbaton: Alteración intencionada del orden sintáctico canónico (Sujeto + Verbo + Complemento) ('Volverán las oscuras golondrinas / en tu balcón sus nidos a colgar').\n  3. Epíteto: Adjetivo explicativo innecesario que destaca una cualidad inherente del sustantivo ('blanca nieve', 'roja sangre', 'verde prado').\n  4. Polisíndeton y Asíndeton:\n     - Polisíndeton: Repetición insistente de conjunciones coordinantes (y... y... y).\n     - Asíndeton: Omisión total de conjunciones para dar dinamismo vertiginoso.",
                conceptosClave = listOf(
                    "Antítesis: Contraste de opuestos (corto amor / largo olvido)",
                    "Paradoja: Contradicción aparente que encierra sentido profundo",
                    "Hipérbole: Exageración magnificada de dimensiones o sentimientos",
                    "Hipérbaton: Dislocación del orden sintáctico habitual",
                    "Anáfora: Repetición al inicio de versos sucesivos"
                ),
                formulas = listOf(
                    "\\text{Hipérbaton}: \\; \\text{S + V + C} \\longrightarrow \\text{C + V + S} \\; (\\text{Inversión sintáctica})",
                    "\\text{Antítesis} = \\text{Tesis (A)} \\; \\text{vs.} \\; \\text{Antítesis (No A)}"
                ),
                formulaName = "Mecanismos Sintácticos y de Pensamiento",
                formulaLatex = "\\text{Anáfora}: \\; [X \\dots] \\; / \\; [X \\dots] \\quad \\longleftrightarrow \\quad \\text{Epíteto}: \\; \\text{Cualidad Intrínseca Inmanente}",
                formulaDescription = "Recursos de intensificación expresiva formal y semántica.",
                admissionTip = "Recuerda: la 'antítesis' contrapone términos contrarios que no se anulan; la 'paradoja' fusiona ideas aparentemente irreconciliables creando un sentido superior.",
                admissionExplanation = "• En los versos de Gustavo Adolfo Bécquer, el hipérbaton es constante para subordinar la sintaxis al ritmo melódico del verso de arte menor y mayor."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la estrofa: 'Por tu amor me duele el aire, el corazón y el sombrero', la figura poética predominante que intensifica desmesuradamente el padecimiento es:",
                    options = listOf("Epíteto", "Hipérbole", "Hipérbaton", "Símil", "Sinécdoque"),
                    correctIndex = 1,
                    explanation = "La hipérbole es el recurso de exageración lírica que magnifica la experiencia del dolor afectivo.",
                    subject = "Literatura",
                    semana = 1
                ),
                Challenge(
                    id = "q_lit_t01_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En los versos: 'Del salón en el ángulo oscuro, / de su dueña tal vez olvidada, / silenciosa y cubierta de polvo, / veíase el arpa', la alteración del orden sintáctico normal se denomina:",
                    options = listOf("Anáfora", "Antítesis", "Hipérbaton", "Metáfora pura", "Polisíndeton"),
                    correctIndex = 2,
                    explanation = "El hipérbaton altera el orden regular de la oración (el orden natural sería: 'El arpa veíase silenciosa y cubierta de polvo en el ángulo oscuro del salón').",
                    subject = "Literatura",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: LITERATURA UNIVERSAL (SEMANA 2)
        // =========================================================================
        LessonNode(
            id = "lit_t02_s01",
            subjectId = "literatura",
            semana = 2,
            subtema = "2.1 Clasicismo Griego: Homero (Ilíada y Odisea)",
            title = "Clasicismo Griego: Homero y las Grandes Epopeyas Heroicas",
            theory = LessonTheory(
                id = "th_lit_t02_s01",
                asignatura = "Literatura",
                semana = 2,
                titulo = "La Épica Homérica: La Ilíada y La Odisea",
                resumen = "• Rasgos del Clasicismo Griego (s. VIII a.C. - IV a.C.):\n  Búsqueda de la armonía, equilibrio formal, serenidad, simetría y fatalismo (subordinación al destino inexorable o moira/fatum).\n\n• La Ilíada (Epopeya Heroica Bélica):\n  - Estructura: 24 cantos en hexámetros dactílicos. Narra 51 días del décimo y último año de la Guerra de Troya (Ilión).\n  - Tema Central: **La cólera de Aquiles** (el de los pies ligeros) y sus funestas consecuencias para los aqueos.\n  - Trama: Agamenón arrebata a Aquiles su cautiva Briseida; Aquiles se retira colérico de la batalla, causando estragos a los griegos. Patroclo, usando la armadura de Aquiles, muere a manos del príncipe troyano Héctor. La furia y dolor empujan a Aquiles a volver a la guerra: mata a Héctor, ultraja su cuerpo arrastrándolo en su carro, pero finalmente, ante las lágrimas del anciano rey Príamo, se apiada y entrega el cadáver para los funerales.\n  - Arquetipos: Aquiles (el valor y la pasión bélica), Héctor (el deber cívico patrio y el honor familiar).\n\n• La Odisea (Epopeya de Aventuras Marinas):\n  - Estructura: 24 cantos. Narra el retorno (nostos) de Odiseo (Ulises) a su reino en Ítaca tras diez años de navegación errante.\n  - Partes: 1. Telemaquia (viaje de Telémaco en busca de noticias de su padre); 2. El regreso de Odiseo (sortea a Polifemo, Circe, las Sirenas, Escila, Caribdis y Calipso en Ogigia); 3. La venganza de Ítaca (concursa con el arco y aniquila a los pretendientes que acosaban a su fiel esposa Penélope).",
                conceptosClave = listOf(
                    "Ilíada: 24 cantos, 51 días, tema central es la cólera de Aquiles",
                    "Héctor: Arquetipo del amor a la patria y la defensa de Troya",
                    "Odisea: Epopeya del nostos (retorno marino) de Odiseo hacia Ítaca",
                    "Penélope: Arquetipo supremo de la fidelidad conyugal"
                ),
                formulas = listOf(
                    "\\text{La Ilíada} \\to \\text{Cólera de Aquiles} + \\text{Muerte de Patroclo y Héctor}",
                    "\\text{La Odisea} \\to \\text{Nostos (Retorno a Ítaca)} + \\text{Astucia de Odiseo}"
                ),
                formulaName = "Díptico Épico Homérico",
                formulaLatex = "\\text{Homero}: \\; \\text{Ilíada (Fuerza y Gloria Bélica)} \\; \\oplus \\; \\text{Odisea (Astucia y Fidelidad)}",
                formulaDescription = "Pilares de la cosmovisión y el heroísmo del clasicismo helénico.",
                admissionTip = "La Ilíada NO concluye con la toma de Troya ni el caballo de madera; concluye con los solemnes funerales del héroe troyano Héctor.",
                admissionExplanation = "• Odiseo se distingue de los demás guerreros por su astucia e ingenio protegido por la diosa Atenea, diosa de la sabiduría."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El desencadenante inmediato que provoca el retorno definitivo de Aquiles al campo de batalla en la 'Ilíada' es:",
                    options = listOf(
                        "La muerte de su entrañable amigo y compañero Patroclo",
                        "El incendio de las naves aqueas por los troyanos",
                        "El perdón concedido por el rey Agamenón",
                        "La aparición del caballo de madera ideado por Odiseo",
                        "La destrucción de las murallas de Ilión"
                    ),
                    correctIndex = 0,
                    explanation = "La trágica muerte de Patroclo a manos de Héctor despierta la segunda y definitiva cólera de Aquiles, motivándolo a vengar a su amigo.",
                    subject = "Literatura",
                    semana = 2
                ),
                Challenge(
                    id = "q_lit_t02_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la 'Odisea', la primera parte que comprende los cuatro primeros cantos y relata el viaje que emprende el hijo de Odiseo en busca de noticias de su padre se titula:",
                    options = listOf("Nostos", "Telemaquia", "Catábasis", "Mequis", "La Ítaca"),
                    correctIndex = 1,
                    explanation = "La Telemaquia comprende los cuatro primeros cantos de la 'Odisea' y narra la búsqueda emprendida por el joven Telémaco.",
                    subject = "Literatura",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "lit_t02_s02",
            subjectId = "literatura",
            semana = 2,
            subtema = "2.2 La Tragedia Ática: Sófocles y Edipo Rey",
            title = "La Tragedia Griega: Sófocles, Fatalismo y Edipo Rey",
            theory = LessonTheory(
                id = "th_lit_t02_s02",
                asignatura = "Literatura",
                semana = 2,
                titulo = "Sófocles y la Tragedia Ática: Edipo Rey",
                resumen = "• Aportes de Sófocles al Teatro Griego:\n  - Introduce el tercer actor (triagonista), incrementa el diálogo frente a los cantos corales, humaniza a los personajes e intensifica la psicología del conflicto trágico.\n\n• Edipo Rey (La Tragedia Perfecta según Aristóteles):\n  - Género: Dramático. Especie: Tragedia. Respeta la unidad de tiempo, lugar y acción.\n  - Tema Central: **La fatalidad del destino inexorable (fatum)** y el drama del hombre que, intentando huir de su destino, lo cumple con exactitud matemática.\n  - Argumento:\n    * Tebas está asolada por la peste. El oráculo de Delfos advierte que la plaga cesará solo cuando sea expulsado el asesino del rey Layo.\n    * Edipo, actual rey de Tebas y esposo de la reina viuda Yocasta, inicia una investigación implacable maldiciendo al culpable.\n    * El adivino ciego Tiresias acusa a Edipo de ser el causante de la impureza. Edipo sospecha de una conspiración entre Tiresias y su cuñado Creonte.\n    * Mediante los testimonios de un mensajero de Corinto y del anciano pastor tebano que entregó a Edipo de niño, se produce la **anagnórisis** (revelación): Edipo mató a su padre Layo en una encrucijada y desposó a su madre Yocasta.\n    * Desenlace: Yocasta se suicida ahorcándose con sus trenzas; Edipo se arranca los ojos con los broches de oro del vestido de su madre y esposa, marchando al autoexilio ciego como encarnación viviente de la culpa y la lucidez moral.",
                conceptosClave = listOf(
                    "Sófocles: Inclusión del tercer actor y humanización del héroe trágico",
                    "Edipo Rey: Cumplimiento inexorable del oráculo (parricidio e incesto)",
                    "Anagnórisis: Reconocimiento trágico de la verdadera identidad",
                    "Autocastigo: Ceguera voluntaria de Edipo al contemplar la verdad"
                ),
                formulas = listOf(
                    "\\text{Estructura Trágica}: \\; \\text{Hibris (Soberbia)} \\to \\text{Anagnórisis (Revelación)} \\to \\text{Catarsis}",
                    "\\text{Fatum}: \\; \\text{Oráculo Ineludible (Matar al padre y casarse con la madre)}"
                ),
                formulaName = "Mecanismo Dramático de Edipo Rey",
                formulaLatex = "\\text{Verdad Oculta} \\xrightarrow{\\text{Investigación Judicial}} \\text{Anagnórisis} \\implies \\text{Ceguera Simbólica}",
                formulaDescription = "Ironía trágica en la que el juez resulta ser el culpable perseguido.",
                admissionTip = "En 'Edipo Rey', Tiresias es físicamente ciego pero ve la verdad espiritual; Edipo, que tiene vista física, está espiritualmente ciego hasta que descubre la verdad y se arranca los ojos.",
                admissionExplanation = "• Aristóteles consideraba a 'Edipo Rey' el modelo insuperable de tragedia por la perfecta correspondencia entre peripecia y anagnórisis."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En 'Edipo Rey', el momento dramático en que el protagonista descubre su verdadera filiación y reconoce que mató a su padre y desposó a su madre se denomina técnicamente:",
                    options = listOf("Catarsis", "Hibris", "Anagnórisis", "Catéresis", "Mímesis"),
                    correctIndex = 2,
                    explanation = "La anagnórisis es el reconocimiento o revelación del personaje de una verdad oculta sobre su origen o identidad.",
                    subject = "Literatura",
                    semana = 2
                ),
                Challenge(
                    id = "q_lit_t02_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el motivo fundamental por el cual Edipo decide arrancarse los ojos al descubrir su trágico destino?",
                    options = listOf(
                        "Para escapar del castigo físico impuesto por el pueblo de Tebas",
                        "Porque no resiste contemplar a sus padres en el Hades ni ver el fruto de su incesto",
                        "Para cumplir una orden expresa del dios Apolo transmitida por Creonte",
                        "Como ofrenda voluntaria a las Moiras para purificar la peste de Corinto",
                        "Para imitar la ceguera física del adivino Tiresias"
                    ),
                    correctIndex = 1,
                    explanation = "Edipo declara que no podría mirar a los ojos a su padre Layo ni a su madre Yocasta en el inframundo, ni ver el rostro de sus hijos nacidos del incesto.",
                    subject = "Literatura",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "lit_t02_s03",
            subjectId = "literatura",
            semana = 2,
            subtema = "2.3 Renacimiento y Teatro Isabelino: William Shakespeare",
            title = "William Shakespeare y los Arquetipos Universales del Teatro Isabelino",
            theory = LessonTheory(
                id = "th_lit_t02_s03",
                asignatura = "Literatura",
                semana = 2,
                titulo = "El Teatro Isabelino y William Shakespeare",
                resumen = "• El Contexto del Teatro Isabelino (Inglaterra, s. XVI - XVII):\n  - Florece bajo el reinado de Isabel I y Jacobo I.\n  - Ruptura de las tres unidades clásicas aristotélicas (unidad de tiempo, lugar y acción), combinación de prosa y verso blanco, mezcla de lo cómico con lo trágico y profunda indagación de las pasiones humanas universales.\n\n• William Shakespeare (El Cisne de Avon):\n  - Máximo dramaturgo universal. Sus personajes trascienden la individualidad convirtiéndose en **arquetipos universales de la psique humana**:\n\n• Obras Cumbres y Arquetipos:\n  1. Hamlet (La Duda Existencial y la Venganza Moral):\n     - El fantasma del rey de Dinamarca revela a su hijo Hamlet que fue asesinado por su hermano Claudio, quien usurpó el trono y se casó con la reina viuda Gertrudis.\n     - Hamlet finge locura; dilema entre la acción vengativa y la parálisis de la duda reflexiva ('Ser o no ser, esa es la cuestión'). Desemboca en la tragedia final con la muerte de Polonio, Ofelia, Laertes, Gertrudis, Claudio y Hamlet.\n  2. Romeo y Julieta (El Amor Juvenil Trágico):\n     - Amor pasional de dos jóvenes de familias rivales (Montesco y Capuleto) en Verona; triunfan espiritualmente sacrificando sus vidas y sellando la paz de sus estirpes.\n  3. Otelo: Los celos patológicos devastadores alimentados por las intrigas del alférez Yago hasta estrangular a su inocente esposa Desdémona.\n  4. Macbeth: La ambición desenfrenada de poder tiránico inducida por la profecía de las brujas y la complicidad de Lady Macbeth.\n  5. El rey Lear: La ingratitud filial (hijas Goneril y Regan frente a la leal Cordelia).",
                conceptosClave = listOf(
                    "Teatro isabelino: Ruptura de unidades clásicas y universalidad de pasiones",
                    "Hamlet: Arquetipo de la duda metafísica y la reflexión paralizante",
                    "Romeo y Julieta: Arquetipo del amor juvenil apasionado e imposible",
                    "Otelo: Los celos destructivos y la manipulación maquiavélica de Yago"
                ),
                formulas = listOf(
                    "\\text{Hamlet} \\to \\text{'Ser o no ser'} = \\text{Duda Metafísica} + \\text{Venganza Moral}",
                    "\\text{Macbeth} = \\text{Ambición Ilícita}, \\quad \\text{Otelo} = \\text{Celos Ciegos}"
                ),
                formulaName = "Mapeo de Arquetipos Shakespearianos",
                formulaLatex = "\\text{Shakespeare} \\implies \\text{Hamlet (Duda)} \\; \\mid \\; \\text{Otelo (Celos)} \\; \\mid \\; \\text{Macbeth (Ambición)}",
                formulaDescription = "Encarnación dramática de las pulsiones psíquicas esenciales.",
                admissionTip = "Hamlet NO duda porque sea cobarde, sino por su agudeza moral y reflexiva que lo lleva a cuestionar la justicia del mundo y las consecuencias de matar en el más allá.",
                admissionExplanation = "• En 'Hamlet', el príncipe comprueba la culpabilidad de su tío Claudio montando una obra de teatro dentro del teatro ('La ratonera')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Qué personaje shakespeariano encarna el arquetipo universal de la duda metafísica y la vacilación ante el deber moral de la venganza?",
                    options = listOf("Macbeth", "Otelo", "Hamlet", "El rey Lear", "Yago"),
                    correctIndex = 2,
                    explanation = "El príncipe Hamlet de Dinamarca es el arquetipo de la duda reflexiva ante la traición moral y el deber de venganza.",
                    subject = "Literatura",
                    semana = 2
                ),
                Challenge(
                    id = "q_lit_t02_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la tragedia 'Otelo' de Shakespeare, el personaje que mediante intrigas perversas manipula al protagonista sembrando celos infundados sobre Desdémona es:",
                    options = listOf("Casio", "Yago", "Brabancio", "Rodrigo", "Horacio"),
                    correctIndex = 1,
                    explanation = "El alférez Yago encarna la hipocresía y la maldad calculadora que conduce a Otelo a la ruina por celos.",
                    subject = "Literatura",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "lit_t02_s04",
            subjectId = "literatura",
            semana = 2,
            subtema = "2.4 Del Romanticismo y Realismo al Vanguardismo: Goethe, Dostoievski y Kafka",
            title = "Evolución Universal: Sturm und Drang, Realismo Ruso y Alienación Vanguardista",
            theory = LessonTheory(
                id = "th_lit_t02_s04",
                asignatura = "Literatura",
                semana = 2,
                titulo = "De Goethe y Dostoyevski a la Vanguardia de Franz Kafka",
                resumen = "• Romanticismo Alemán: J.W. Goethe (Sturm und Drang - Tormenta e Ímpetu):\n  - Obra: *Las cuitas del joven Werther* (1774, novela epistolar).\n  - Tema: La pasión sentimental desbordada, el choque entre el idealismo romántico del artista y las convenciones burguesas materialistas.\n  - Trama: El joven Werther se enamora apasionadamente de Lotte (Carlota), pero esta está comprometida con el pragmático Albert; ante la imposibilidad de consumar su amor puro, Werther se suicida con una pistola prestada de Albert.\n\n• Realismo Psicológico Ruso: Fiódor Dostoievski (1821-1881):\n  - Obra Cumbre: *Crimen y castigo* (1866).\n  - Tema: La expiación psicológica de la culpa, la teoría del hombre extraordinario (superhombre) y la regeneración espiritual cristiana.\n  - Argumento: Rodión Raskólnikov, paupérrimo exestudiante de Derecho en San Petersburgo, postula que los hombres superiores están legitimados para transgredir leyes morales en bien de la humanidad. Asesina a la vieja usurera Aliona Ivánovna y accidentalmente a su hermana Lisaveta. El tormento de su conciencia lo carcome hasta que, guiado por el amor sacrificado y evangélico de Sonia Marmeládova, confiesa ante el juez Porfirio Petrovich y es enviado a cumplir condena en Siberia, donde halla su salvación moral.\n\n• Vanguardismo del Siglo XX: Franz Kafka (1883-1924):\n  - Obra Monumental: *La metamorfosis* (1915).\n  - Tema: La alienación del ser humano en la sociedad moderna burocrática, la deshumanización capitalista y la incomunicación familiar.\n  - Trama: Gregorio Samsa amanece convertido en un monstruoso insecto. Se ve impedido de trabajar como comerciante y sostener a su familia; gradualmente su padre, madre y hermana Grete lo aíslan, repudian y desprecian hasta que Gregorio muere solitario en su habitación polvorienta.",
                conceptosClave = listOf(
                    "Werther (Goethe): Desgarro romántico y pasión suicida",
                    "Crimen y castigo (Dostoievski): Raskólnikov, teoría del superhombre, culpa y redención",
                    "Sonia Marmeládova: Símbolo de la fe y el perdón redentor cristiano",
                    "La metamorfosis (Kafka): Gregorio Samsa y la alienación del sujeto moderno"
                ),
                formulas = listOf(
                    "\\text{Crimen y castigo} \\to \\text{Soberbia Intelectual} \\to \\text{Culpa Psicológica} \\to \\text{Redención por Sonia}",
                    "\\text{La metamorfosis} \\to \\text{Gregorio Samsa (Hombre)} \\xrightarrow{\\text{Cosificación laboral}} \\text{Insecto Desechable}"
                ),
                formulaName = "Tránsito de la Subjetividad Moderna",
                formulaLatex = "\\text{Evolución}: \\; \\text{Pasión Romántica} \\longrightarrow \\text{Conciencia Culpable (Realismo)} \\longrightarrow \\text{Absurdo / Alienación (Vanguardia)}",
                formulaDescription = "Secuencia de transformaciones de la condición existencial del ser humano en las letras universales.",
                admissionTip = "En 'Crimen y castigo', la condena de Raskólnikov en Siberia no representa su derrota, sino el inicio de su renacimiento espiritual gracias al amor de Sonia.",
                admissionExplanation = "• Franz Kafka utiliza la transformación física en insecto como metáfora de la deshumanización que sufre el trabajador como engranaje productivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la novela 'Crimen y castigo' de Fiódor Dostoievski, ¿qué personaje encarna el sacrificio amoroso, la caridad cristiana y conduce a Raskólnikov hacia su redención moral?",
                    options = listOf("Aliona Ivánovna", "Dunia Raskólnikova", "Sonia Marmeládova", "Catalina Ivánovna", "Marléne"),
                    correctIndex = 2,
                    explanation = "Sonia Marmeládova, quien se prostituye para sostener a su familia, encarna el amor desinteresado y la fe evangélica que redime a Raskólnikov.",
                    subject = "Literatura",
                    semana = 2
                ),
                Challenge(
                    id = "q_lit_t02_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El tema central de la célebre obra 'La metamorfosis' de Franz Kafka es:",
                    options = listOf(
                        "La lucha heroica del proletariado contra las fábricas textiles",
                        "La deshumanización, incomunicación y alienación del individuo en la sociedad moderna",
                        "El idílico amor fraternal entre Gregorio Samsa y su hermana Grete",
                        "El triunfo de la justicia judicial ante la burocracia estatal",
                        "La superación de una enfermedad degenerativa gracias al descanso"
                    ),
                    correctIndex = 1,
                    explanation = "'La metamorfosis' es la metáfora suprema de la alienación y deshumanización del trabajador moderno cosificado y abandonado por su familia.",
                    subject = "Literatura",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: LITERATURA ESPAÑOLA (SEMANA 3)
        // =========================================================================
        LessonNode(
            id = "lit_t03_s01",
            subjectId = "literatura",
            semana = 3,
            subtema = "3.1 La Épica Medieval: El Cantar de Mio Cid y la Honra Heroica",
            title = "El Mester de Juglaría y el Cantar de Mio Cid",
            theory = LessonTheory(
                id = "th_lit_t03_s01",
                asignatura = "Literatura",
                semana = 3,
                titulo = "La Épica Medieval Castellana: El Cantar de Mio Cid",
                resumen = "• El Mester de Juglaría (s. XII - XIII):\n  - Oficio de juglares populares de difusión oral en plazas públicas. Métrica irregular (anisosilabismo) con rima asonante y temática heroica.\n\n• El Cantar de Mio Cid (Copia de Per Abbat, 1307):\n  - Cantar de gesta cumbre de la épica castellana. Destaca por su **sobrio realismo histórico y geográfico** (a diferencia de la fantasía mitológica francesa de Roland).\n  - Héroe Protagónico: Don Rodrigo Díaz de Vivar, el 'Campeador'.\n  - Eje Temático Vertebrador: **La doble pérdida y la doble recuperación del honor** (honra política y honra social/familiar).\n\n• Estructura en Tres Cantares:\n  1. Cantar del Destierro: El Cid es desterrado de Castilla por el rey Alfonso VI debido a envidias cortesanas. Deja a su esposa Jimena y sus hijas Elvira y Sol en el monasterio de San Pedro de Cardeña. Conquista tierras moras y envía ricos botines al rey demostrando lealtad vasallática.\n  2. Cantar de las Bodas de las Hijas del Cid: El Cid reconquista la rica e inexpugnable Valencia. El rey le concede el perdón a orillas del río Tajo y concierta las bodas de doña Elvira y doña Sol con los infantes de Carrión.\n  3. Cantar de la Afrenta de Corpes: Los infantes de Carrión evidencian su cobardía ante un león suelto. En venganza, azotan salvajemente a sus esposas en el robledal de Corpes. El Cid no toma venganza sangrienta desordenada; exige Cortes en Toledo. Sus campeones derrotan a los infantes en juicio de armas y sus hijas son desposadas con los infantes de Navarra y Aragón, emparentando al Cid con los reyes de España.",
                conceptosClave = listOf(
                    "Mester de juglaría: Poesía oral, popular, métrica irregular y rima asonante",
                    "Cantar de Mio Cid: Rodrigo Díaz de Vivar y la recuperación del honor",
                    "Copia de Per Abbat fechada en 1307",
                    "Estructura tripartita: Destierro, Bodas y Afrenta de Corpes"
                ),
                formulas = listOf(
                    "\\text{Honra I} = \\text{Destierro de Castilla} \\xrightarrow{\\text{Conquista de Valencia}} \\text{Perdón Real}",
                    "\\text{Honra II} = \\text{Afrenta de Corpes} \\xrightarrow{\\text{Cortes de Toledo}} \\text{Bodas con Príncipes Reales}"
                ),
                formulaName = "Ciclo de Restitución del Honor",
                formulaLatex = "\\text{Honor} \\implies \\text{Pérdida Política (Destierro)} \\to \\text{Pérdida Familiar (Corpes)} \\to \\text{Apoteosis Real}",
                formulaDescription = "Eje vertebrador de la epopeya castellana medieval.",
                admissionTip = "El Cid nunca se rebela contra su soberano; encarna la virtud de la mesura, la piedad cristiana y la lealtad vasallática incondicional.",
                admissionExplanation = "• En las Cortes de Toledo, el Cid recupera sus famosas espadas Colada y Tizona, además del dote entregado a los infantes de Carrión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El eje temático vertebrador y motor argumental del 'Cantar de Mio Cid' es:",
                    options = listOf(
                        "La conversión forzosa de los moros de Valencia al cristianismo",
                        "La doble pérdida y la doble recuperación de la honra de Rodrigo Díaz de Vivar",
                        "La rebelión violenta del héroe para destronar al rey Alfonso VI",
                        "La búsqueda mística del Santo Grial en los monasterios de Castilla",
                        "El amor caballeresco trágico entre el Cid y la reina de Sevilla"
                    ),
                    correctIndex = 1,
                    explanation = "El cantar se estructura sobre la pérdida y restitución de la honra política (destierro) y la honra familiar (afrenta de Corpes).",
                    subject = "Literatura",
                    semana = 3
                ),
                Challenge(
                    id = "q_lit_t03_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el 'Cantar de Mio Cid', el ultraje físico cometido por los infantes de Carrión contra las hijas del Campeador ocurre en:",
                    options = listOf("Las murallas de Valencia", "El monasterio de Cardeña", "El robledal de Corpes", "Las orillas del río Tajo", "El alcázar de Toledo"),
                    correctIndex = 2,
                    explanation = "Los infantes de Carrión vengan su humillación azotando salvajemente y abandonando a sus esposas en el espeso robledal de Corpes.",
                    subject = "Literatura",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "lit_t03_s02",
            subjectId = "literatura",
            semana = 3,
            subtema = "3.2 La Novela Moderna: Miguel de Cervantes y Don Quijote de la Mancha",
            title = "Miguel de Cervantes y el Ingenioso Hidalgo Don Quijote de la Mancha",
            theory = LessonTheory(
                id = "th_lit_t03_s02",
                asignatura = "Literatura",
                semana = 3,
                titulo = "Cervantes y el Nacimiento de la Novela Moderna: El Quijote",
                resumen = "• Miguel de Cervantes Saavedra (1547-1616 - El Manco de Lepanto):\n  - Creador de la novela moderna polifónica y el perspectivismo estético.\n\n• El ingenioso hidalgo don Quijote de la Mancha (Primera Parte: 1605; Segunda Parte: 1615):\n  - Propósito Inicial Explícito: Parodiar y demoler los disparatados y falsos libros de caballerías.\n  - Dimensión Profunda: Enfrentamiento entre el **idealismo espiritual desinteresado** y el **realismo materialista pragmático**.\n\n• Ejes Estéticos y Estructurales:\n  1. El Perspectivismo: La realidad es relativa y depende del prisma del observador (el conflicto del *baciyelmo*: ¿es la bacía de afeitar de un barbero o el yelmo de Mambrino?).\n  2. Dialéctica de los Protagonistas:\n     - Don Quijote (Alonso Quijano): Idealista noble que busca justicia, deshacer entuertos y la gloria por su dama Dulcinea del Toboso (la campesina Aldonza Lorenzo).\n     - Sancho Panza: El sentido común, el apego a la materia, la comida y el refranero popular.\n     - La Sanchificación y la Quijotización: En sus andanzas mutuas, don Quijote se impregna de la duda de Sancho, mientras Sancho asimila los nobles ideales del caballero, al punto de que cuando Alonso Quijano recobra la cordura en su lecho de muerte, Sancho le implora entre lágrimas salir vestidos de pastores a vivir aventuras al campo.\n  3. La Metaficción: En la Segunda Parte (1615), los personajes han leído la Primera Parte (1605) y denuncian el Quijote apócrifo de Avellaneda.",
                conceptosClave = listOf(
                    "Publicación: 1605 (Primera parte) y 1615 (Segunda parte)",
                    "Parodia a las novelas de caballería y fundación de la novela moderna",
                    "Perspectivismo cervantino: La realidad poliédrica (el baciyelmo)",
                    "Dialéctica psicológica: Sanchificación de don Quijote y Quijotización de Sancho"
                ),
                formulas = listOf(
                    "\\text{El Quijote} \\to \\text{Don Quijote (Idealismo)} \\; \\longleftrightarrow \\; \\text{Sancho Panza (Realismo)}",
                    "\\text{Evolución} = \\text{Quijotización de Sancho} + \\text{Sanchificación de Quijote}"
                ),
                formulaName = "Dialéctica Cervantina del Perspectivismo",
                formulaLatex = "\\text{Baciyelmo} = \\text{Bacía de Barbero (Materia)} \\oplus \\text{Yelmo de Mambrino (Espíritu)}",
                formulaDescription = "Superación de la antinomia entre realidad y ficción en la modernidad literaria.",
                admissionTip = "Don Quijote es derrotado finalmente en las playas de Barcelona por el Bachiller Sansón Carrasco, quien se disfraza como el Caballero de la Blanca Luna.",
                admissionExplanation = "• Como condición de su derrota, el Caballero de la Blanca Luna obliga a don Quijote a abandonar las armas por un año y regresar a su aldea."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El proceso psicológico por el cual Sancho Panza asimila gradualmente la nobleza y los elevados ideales caballerescos de su amo a lo largo de sus viajes se denomina:",
                    options = listOf("Catarsis trágica", "Quijotización de Sancho", "Sanchificación de Quijote", "Perspectivismo", "Metaficción"),
                    correctIndex = 1,
                    explanation = "La 'quijotización' de Sancho describe cómo el rudo campesino adopta el amor por la justicia y el idealismo de don Quijote.",
                    subject = "Literatura",
                    semana = 3
                ),
                Challenge(
                    id = "q_lit_t03_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Bajo qué disfraz el bachiller Sansón Carrasco logra vencer definitivamente a don Quijote en las playas de Barcelona forzándolo a regresar a su hogar?",
                    options = listOf(
                        "El Caballero de los Espejos",
                        "El Caballero del Bosque",
                        "El Caballero de la Blanca Luna",
                        "El Gigante Caraculiambro",
                        "El Mago Frestón"
                    ),
                    correctIndex = 2,
                    explanation = "Disfrazado como el Caballero de la Blanca Luna, Sansón Carrasco derrota al hidalgo y le impone la pena de dejar las armas por un año.",
                    subject = "Literatura",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "lit_t03_s03",
            subjectId = "literatura",
            semana = 3,
            subtema = "3.3 El Teatro Barroco del Siglo de Oro: Calderón de la Barca y Lope de Vega",
            title = "El Teatro del Siglo de Oro: Calderón de la Barca y Lope de Vega",
            theory = LessonTheory(
                id = "th_lit_t03_s03",
                asignatura = "Literatura",
                semana = 3,
                titulo = "La Dramaturgia Barroca Española: Honor y Libre Albedrío",
                resumen = "• El Siglo de Oro del Teatro Español (s. XVII):\n  Dos vertientes magistrales: la comedia nacional popular (Lope de Vega) y el drama filosófico barroco (Calderón de la Barca).\n\n• Félix Lope de Vega (El Fénix de los Ingenios):\n  - Creador de la Comedia Nueva Española (Arte nuevo de hacer comedias, 1609): reduce los actos de cinco a tres (planteamiento, nudo y desenlace), polimetría estrófica, inclusión del personaje gracioso y defensa del honor villano.\n  - Obra Cumbre: *Fuenteovejuna* (1619).\n    * Argumento: El Comendador Fernán Gómez abusa tiránicamente de los campesinos del pueblo de Fuenteovejuna, agraviando a Laurencia y Frondoso.\n    * El pueblo indignado se subleva colectivamente y ajusticia al Comendador. Ante la tortura de los jueces reales preguntando quién mató al Comendador, todos responden al unísono: '¡Fuenteovejuna, señor!'. Los Reyes Católicos perdonan al pueblo por clemencia real.\n\n• Pedro Calderón de la Barca:\n  - Cénit del drama filosófico, intelectual, estilizado y cortesano.\n  - Obra Cumbre: *La vida es sueño* (1635).\n    * Tema: **El triunfo del libre albedrío sobre el fatalismo astrológico** y la transitoriedad ilusoria de la existencia terrenal.\n    * Argumento: El rey Basilio de Polonia encierra a su hijo Segismundo en una torre porque los horóscopos auguraban que sería un tirano. Para probar el oráculo, lo narcotiza y lleva al palacio; Segismundo despierta furioso y comete crueldades, confirmando los temores, y es devuelto a la prisión haciéndole creer que todo fue un sueño.\n    * Tras una rebelión popular que lo libera, Segismundo domina sus pasiones primitivas demostrando que el hombre forja su propio destino mediante la virtud moral ('porque aún en sueños no se pierde el hacer el bien').",
                conceptosClave = listOf(
                    "Lope de Vega: Comedia nueva, honor campesino y justicia colectiva en Fuenteovejuna",
                    "Calderón de la Barca: Drama filosófico, conceptismo y soliloquios metafísicos",
                    "La vida es sueño: Segismundo y el triunfo del libre albedrío sobre el horóscopo",
                    "Transitoriedad terrenal: '¿Qué es la vida? Un frenesí... que toda la vida es sueño'"
                ),
                formulas = listOf(
                    "\\text{Fuenteovejuna} \\to \\text{Tiranía del Comendador} \\to \\text{Justicia Popular Colectiva}",
                    "\\text{La vida es sueño} \\to \\text{Predestinación Astral} \\xrightarrow{\\text{Virtud Moral}} \\text{Libre Albedrío}"
                ),
                formulaName = "Paradigmas del Teatro Barroco",
                formulaLatex = "\\text{Barroco Teatral}: \\; \\text{Honor Popular (Lope)} \\; \\longleftrightarrow \\; \\text{Filosofía del Destino (Calderón)}",
                formulaDescription = "Dos cimas antagónicas y complementarias del drama del Siglo de Oro.",
                admissionTip = "En 'La vida es sueño', el rey Basilio es el responsable directo del encierro de Segismundo debido a su confianza ciega en los astros.",
                admissionExplanation = "• La célebre respuesta 'Fuenteovejuna lo hizo' encarna el arquetipo de la solidaridad y la justicia social comunitaria frente al abuso despótico feudal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El tema filosófico capital que aborda Pedro Calderón de la Barca en su obra maestra 'La vida es sueño' a través de la evolución moral de Segismundo es:",
                    options = listOf(
                        "La imposibilidad humana de cambiar el destino escrito por los astros",
                        "El triunfo del libre albedrío sobre la predestinación y el autodominio moral",
                        "La venganza sangrienta de los hijos legítimos contra los monarcas déspotas",
                        "La defensa estricta del honor conyugal en la corte de Polonia",
                        "El rechazo al conocimiento científico en favor de la astrología"
                    ),
                    correctIndex = 1,
                    explanation = "Segismundo demuestra que el ser humano, mediante la razón y la virtud moral, puede sobreponerse a los pronósticos astrales ejerciendo el libre albedrío.",
                    subject = "Literatura",
                    semana = 3
                ),
                Challenge(
                    id = "q_lit_t03_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el drama 'Fuenteovejuna' de Lope de Vega, ¿quién asume la responsabilidad del asesinato del despótico comendador Fernán Gómez ante las autoridades reales?",
                    options = listOf("Frondoso", "Laurencia", "El juez inquisidor", "Todo el pueblo colectivamente", "El rey Fernando"),
                    correctIndex = 3,
                    explanation = "La colectividad entera del pueblo de Fuenteovejuna responde unánimemente que todo el pueblo fue el autor de la muerte del comendador.",
                    subject = "Literatura",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "lit_t03_s04",
            subjectId = "literatura",
            semana = 3,
            subtema = "3.4 El Postromanticismo Español: Gustavo Adolfo Bécquer (Rimas y Leyendas)",
            title = "Gustavo Adolfo Bécquer: El Lirismo Intimista y las Leyendas Góticas",
            theory = LessonTheory(
                id = "th_lit_t03_s04",
                asignatura = "Literatura",
                semana = 3,
                titulo = "El Postromanticismo: Gustavo Adolfo Bécquer",
                resumen = "• El Postromanticismo Español (Segunda mitad del s. XIX):\n  - Surge cuando en Europa predominaba el Realismo. Bécquer abandona el romanticismo altisonante y declamatorio, cultivando una lírica intimista, esencial, breve, sugerente y musical.\n\n• Las Rimas de Gustavo Adolfo Bécquer (1836-1870):\n  - Colección de composiciones breves de métrica asonante y ritmo leve, agrupadas temáticamente en cuatro series:\n    1. Rimas I a XI: La poesía como misterio inefable y la inspiración creadora ('Poesía eres tú').\n    2. Rimas XII a XXIX: El amor ilusionado, juvenil y apasionado.\n    3. Rimas XXX a LI: El desengaño amoroso, la traición, el dolor y la amargura ('Volverán las oscuras golondrinas').\n    4. Rimas LII a LXXVI: La angustia de la soledad, el presentimiento de la muerte y la nada.\n\n• Las Leyendas:\n  - Prosa poética que rescata tradiciones medievales, folklore popular y leyendas góticas de misterio sobrenatural y transgresión sacrílega.\n  - Ejemplos:\n    * *El monte de las ánimas* (la noche de difuntos en Soria, la soberbia de Beatriz que induce a su primo Alonso a la muerte entre espíritus ancestrales).\n    * *Los ojos verdes* (la fascinación espectral por una ninfa que arrastra al caballero Fernando al fondo de una fuente mágica).\n    * *El rayo de luna* (la persecución obsesiva de un ideal inalcanzable por parte del soñador Manrique).",
                conceptosClave = listOf(
                    "Postromanticismo: Poesía intimista, depurada, breve y asonante",
                    "Rimas: Cuatro ciclos (poesía, amor, desengaño y soledad/muerte)",
                    "Leyendas: Prosa poética, misterio medieval gótico y folklore popular",
                    "El monte de las ánimas: Leyenda de la noche de difuntos y la soberbia de Beatriz"
                ),
                formulas = listOf(
                    "\\text{Poesía Bécqueriana} = \\text{Métrica Asonante Leve} + \\text{Lirismo Intimista} + \\text{Inefabilidad}",
                    "\\text{Leyendas} \\to \\text{Transgresión de un Tabú Religioso} \\to \\text{Castigo Sobrenatural}"
                ),
                formulaName = "Estética Bécqueriana",
                formulaLatex = "\\text{Rimas}: \\; \\text{Inspiración} \\to \\text{Amor} \\to \\text{Desengaño} \\to \\text{Soledad / Muerte}",
                formulaDescription = "Ciclo vivencial y poético condensado en las Rimas.",
                admissionTip = "Para Bécquer, la mujer y la poesía son la misma entidad: '¿Qué es poesía? dices mientras clavas en mi pupila tu pupila azul... ¡Poesía eres tú!'.",
                admissionExplanation = "• En sus Leyendas, el castigo al héroe siempre se debe a transgredir una prohibición sagrada motivado por la pasión o la soberbia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En las 'Rimas' de Gustavo Adolfo Bécquer, la tercera serie de poemas (Rimas XXX a LI) gira temáticamente en torno a:",
                    options = listOf(
                        "La exaltación patriótica de España contra la invasión francesa",
                        "El dolor del desengaño amoroso, la amargura y la ruptura",
                        "La contemplación científica de la naturaleza",
                        "El misterio inefable del origen de la inspiración poética",
                        "La dicha del matrimonio y la plenitud familiar"
                    ),
                    correctIndex = 1,
                    explanation = "La serie intermedia de las Rimas de Bécquer aborda el fracaso amoroso, la traición, el rencor y la nostalgia del desengaño.",
                    subject = "Literatura",
                    semana = 3
                ),
                Challenge(
                    id = "q_lit_t03_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la célebre leyenda 'El monte de las ánimas' de Bécquer, ¿qué acontecimiento desencadena la trágica muerte de Alonso?",
                    options = listOf(
                        "Rescatar una cinta azul olvidada por su prima Beatriz durante la noche de difuntos",
                        "Buscar el Santo Grial en una gruta sagrada",
                        "Retar en duelo al comendador de Soria",
                        "Perseguir un ciervo encantado en las ruinas de un convento",
                        "Beber agua embrujada de la fuente de los ojos verdes"
                    ),
                    correctIndex = 0,
                    explanation = "Beatriz desafía la valentía de Alonso fingiendo haber olvidado su banda azul en el temido Monte de las Ánimas durante la Noche de Difuntos.",
                    subject = "Literatura",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: LITERATURA HISPANOAMERICANA (SEMANA 4)
        // =========================================================================
        LessonNode(
            id = "lit_t04_s01",
            subjectId = "literatura",
            semana = 4,
            subtema = "4.1 El Modernismo Continental: Rubén Darío y la Trilogía Fundamental",
            title = "El Modernismo Hispanoamericano y la Trilogía de Rubén Darío",
            theory = LessonTheory(
                id = "th_lit_t04_s01",
                asignatura = "Literatura",
                semana = 4,
                titulo = "El Modernismo y la Poética de Rubén Darío",
                resumen = "• El Modernismo (Fin del s. XIX - Inicios del s. XX):\n  - Primer movimiento literario originado en Hispanoamérica que ejerció influencia decisiva sobre España (inversión de magisterio cultural).\n  - Síntesis de dos corrientes francesas:\n    1. Parnasianismo: El 'arte por el arte', rigor formal, frialdad escultural y belleza plástica.\n    2. Simbolismo: Musicalidad interior del verso, correspondencias sensoriales y sinestesias.\n  - Rasgos Estéticos: Cosmopolitismo, exotismo (evocación de Versalles, Grecia mitológica y Oriente), cromatismo pictórico, rescate del verso alejandrino (14 sílabas) y el símbolo supremo del **cisne**.\n\n• Rubén Darío (Nicaragua, 1867-1916) y su Trilogía Canónica:\n  1. *Azul...* (Valparaíso, Chile, 1888):\n     - Obra fundacional del modernismo. Mezcla de cuentos en prosa poética (*El rey burgués*, *El rubí*) y poemas (*Caupolicán*). Critica la mercantilización burguesa del arte.\n  2. *Prosas profanas* (Buenos Aires, 1896):\n     - Cénit de la sensualidad, el exotismo galante, la fiesta palaciega y la perfección métrica (*Sonatina: 'La princesa está triste... ¿qué tendrá la princesa?'*).\n  3. *Cantos de vida y esperanza* (Madrid, 1905):\n     - Madurez reflexiva y cívica. Darío asume la defensa de la identidad hispanoamericana frente al imperialismo anglosajón (*A Roosevelt*) y se angustia ante el misterio ontológico de la existencia (*Lo fatal: 'Dichoso el árbol, que es apenas sensitivo...'*).",
                conceptosClave = listOf(
                    "Modernismo: Primer movimiento autónomo nacido en América con magisterio sobre España",
                    "Influencia francesa: Parnasianismo (forma) + Simbolismo (musicalidad)",
                    "Trilogía de Darío: Azul... (1888), Prosas profanas (1896), Cantos de vida y esperanza (1905)",
                    "El cisne: Símbolo modernista de belleza, elegancia y pureza artística"
                ),
                formulas = listOf(
                    "\\text{Modernismo} = \\text{Parnasianismo (Forma)} + \\text{Simbolismo (Música)} + \\text{Exotismo}",
                    "\\text{Azul... (Génesis)} \\to \\text{Prosas profanas (Apogeo)} \\to \\text{Cantos de vida y esperanza (Madurez)}"
                ),
                formulaName = "Evolución Estética del Modernismo",
                formulaLatex = "\\text{Trilogía Dariana}: \\; \\text{Azul... (1888)} \\; \\longrightarrow \\; \\text{Prosas profanas (1896)} \\; \\longrightarrow \\; \\text{Cantos de vida (1905)}",
                formulaDescription = "Tránsito de la ornamentación exótica a la honda meditación cívica y metafísica.",
                admissionTip = "La fecha fundacional del Modernismo es 1888 con la publicación de 'Azul...' en Valparaíso, Chile.",
                admissionExplanation = "• En el cuento 'El rey burgués', Darío presenta al poeta condenado a tocar una caja de música en el jardín hasta morir congelado, simbolizando el desprecio burgués por el arte puro."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El libro de Rubén Darío publicado en 1888 en Valparaíso que dio inicio oficial al movimiento modernista hispanoamericano se titula:",
                    options = listOf("Prosas profanas", "Cantos de vida y esperanza", "Azul...", "El canto errante", "Abrojos"),
                    correctIndex = 2,
                    explanation = "La publicación de 'Azul...' en 1888 en Chile marca el inicio del Modernismo en las letras hispánicas.",
                    subject = "Literatura",
                    semana = 4
                ),
                Challenge(
                    id = "q_lit_t04_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En su obra de madurez 'Cantos de vida y esperanza' (1905), Rubén Darío asume un tono más reflexivo y político, defendiendo la identidad hispanoamericana en el célebre poema:",
                    options = listOf("Sonatina", "A Roosevelt", "Caupolicán", "Sinfonía en gris mayor", "El rey burgués"),
                    correctIndex = 1,
                    explanation = "En 'A Roosevelt', Darío advierte a Theodore Roosevelt que la América hispana conserva su alma, sus poetas y su dignidad frente al expansionismo norteamericano.",
                    subject = "Literatura",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "lit_t04_s02",
            subjectId = "literatura",
            semana = 4,
            subtema = "4.2 La Lírica del Siglo XX: Las Cuatro Etapas Poéticas de Pablo Neruda",
            title = "Pablo Neruda: Trayectoria Lírica y Premio Nobel 1971",
            theory = LessonTheory(
                id = "th_lit_t04_s02",
                asignatura = "Literatura",
                semana = 4,
                titulo = "Las Cuatro Etapas Poéticas de Pablo Neruda",
                resumen = "• Pablo Neruda (Ricardo Eliécer Neftalí Reyes Basoalto, Chile, 1904-1973):\n  - Premio Nobel de Literatura 1971. Su trayectoria atraviesa cuatro etapas artísticas monumentales:\n\n1. Etapa de Iniciación / Neorromántica (1924):\n   - *Veinte poemas de amor y una canción desesperada:*\n     * Poesía lírica juvenil melancólica; la mujer amada se asocia con el paisaje marítimo y la geografía del sur de Chile.\n     * Inspirado en dos musas: Marisol (Teresa Vázquez) y Marisombra (Albertina Azócar).\n     * Famoso Poema 20: 'Puedo escribir los versos más tristes esta noche...'.\n\n2. Etapa de Residencia / Vanguardista Hermética (1935):\n   - *Residencia en la tierra:*\n     * Escrita durante su labor diplomática en Asia. Desolación existencial, visión caótica de la materia, angustia ante el tiempo destructor y desintegración del cosmos. Uso de metáforas surrealistas oscuras y versolibrismo.\n\n3. Etapa Épico-Social / Política (1950):\n   - *Canto General:*\n     * Magno poema épico continental de la historia y naturaleza de América Latina.\n     * Destaca la sección cumbre *Alturas de Macchu Picchu*, donde el poeta asciende a la ciudadela inca y convoca a los antiguos trabajadores andinos a hablar a través de su propia voz ('Sube a nacer conmigo, hermano').\n\n4. Etapa Elemental y Cotidiana (1954):\n   - *Odas elementales:*\n     * Retorno a la sencillez y claridad comunicativa; homenaje poético a los objetos cotidianos y humildes (la cebolla, el aire, la cuchara, el caldillo de congrio).",
                conceptosClave = listOf(
                    "Premio Nobel de Literatura 1971",
                    "Etapa Neorromántica: Veinte poemas de amor y una canción desesperada (1924)",
                    "Etapa Vanguardista: Residencia en la tierra (angustia, caos y soledad en Asia)",
                    "Etapa Épico-Social: Canto General y Alturas de Macchu Picchu",
                    "Etapa Elemental: Odas elementales y el rescate lírico de lo cotidiano"
                ),
                formulas = listOf(
                    "\\text{Veinte poemas} \\to \\text{Amor Melancólico} + \\text{Paisaje Austral Chileno}",
                    "\\text{Alturas de Macchu Picchu} \\to \\text{Voz Poética de los Olvidados de la Historia}"
                ),
                formulaName = "Ciclo Poético Nerudiano",
                formulaLatex = "\\text{Neruda}: \\; \\text{Amor Juvenil} \\; \\to \\; \\text{Vanguardia Existencial} \\; \\to \\; \\text{Épica Social} \\; \\to \\; \\text{Odas Cotidianas}",
                formulaDescription = "Evolución desde el individualismo intimista hacia el compromiso social y la simpleza de las cosas humildes.",
                admissionTip = "En 'Alturas de Macchu Picchu', Neruda no solo admira la arquitectura ciclópea de piedra, sino que rescata y reivindica el sudor y sacrificio de los albañiles quechuas anónimos.",
                admissionExplanation = "• La obra 'Residencia en la tierra' representa una de las cimas del surrealismo hispanoamericano por su expresión angustiosa de la decadencia cósmica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el poemario de Pablo Neruda que marca su etapa vanguardista y hermética, caracterizado por una visión caótica, desolada y angustiante del mundo material?",
                    options = listOf(
                        "Veinte poemas de amor y una canción desesperada",
                        "Odas elementales",
                        "Residencia en la tierra",
                        "Canto General",
                        "Crepusculario"
                    ),
                    correctIndex = 2,
                    explanation = "'Residencia en la tierra' (1935) es la obra cumbre del periodo surrealista y existencial de Neruda, cargada de desintegración y angustia cósmica.",
                    subject = "Literatura",
                    semana = 4
                ),
                Challenge(
                    id = "q_lit_t04_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la sección 'Alturas de Macchu Picchu' del 'Canto General', la actitud fundamental del poeta frente a la imponente ciudadela incaica consiste en:",
                    options = listOf(
                        "Alabar exclusivamente a los dioses solares incaicos",
                        "Prestar su voz poética a los campesinos y constructores indígenas sacrificados en la historia",
                        "Lamentar la pérdida de los tesoros de oro arrebatados por los conquistadores",
                        "Renunciar a la lucha política para recluirse como eremita en las montañas",
                        "Cuestionar la autenticidad arquitectónica del santuario andino"
                    ),
                    correctIndex = 1,
                    explanation = "El poeta proclama 'Sube a nacer conmigo, hermano' para erigirse en la voz colectiva de los antiguos obreros andinos anónimos y explotados.",
                    subject = "Literatura",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "lit_t04_s03",
            subjectId = "literatura",
            semana = 4,
            subtema = "4.3 Precursores del Boom: Alejo Carpentier (Lo Real Maravilloso) y Jorge Luis Borges (El Aleph)",
            title = "Los Precursores de la Nueva Narrativa: Carpentier y Borges",
            theory = LessonTheory(
                id = "th_lit_t04_s03",
                asignatura = "Literatura",
                semana = 4,
                titulo = "Carpentier, Lo Real Maravilloso y la Metaficción de Borges",
                resumen = "• Alejo Carpentier (Cuba, 1904-1980) y *Lo Real Maravilloso*:\n  - En el prólogo a su novela *El reino de este mundo* (1949), Carpentier formula la teoría de **lo real maravilloso americano**:\n    * A diferencia del surrealismo europeo artificioso que necesita forzar lo insólito mediante trucos mecánicos, en América Latina lo insólito, prodigioso y mágico brota de manera natural de su historia violenta, sus mitos y sus creencias sincretistas.\n  - Argumento de *El reino de este mundo*:\n    * Narra la rebelión de los esclavos negros en Haití inspirada en el vudú y el líder Mackandal (capaz de metamorfosearse en animales), seguido por el reinado despótico del tirano Henri Christophe en la fortaleza de La Ferrière, todo presenciado por el esclavo Ti Noel.\n\n• Jorge Luis Borges (Argentina, 1899-1986):\n  - Creador de una narrativa intelectual, metafísica, lúdica y fantástica única en Occidente.\n  - Obras Cumbres de Cuentos: *Ficciones* (1944) y *El Aleph* (1949).\n  - Temas y Motivos Obsesivos: **El laberinto**, **los espejos**, **el tiempo circular / infinito**, los dobles, las bibliotecas infinitas (*La biblioteca de Babel*), los libros de arena y la identidad ilusoria.\n  - El Aleph: Cuento donde el protagonista contempla en el sótano de una casa de la calle Garay un punto diminuto del espacio donde convergen simultáneamente todos los lugares, tiempos y sucesos del universo sin confundirse.",
                conceptosClave = listOf(
                    "Alejo Carpentier: Lo Real Maravilloso formulado en El reino de este mundo (1949)",
                    "Mackandal y la rebelión mítica haitiana; el rey Henri Christophe",
                    "Jorge Luis Borges: Cuentos metafísicos en Ficciones (1944) y El Aleph (1949)",
                    "Motivos borgeanos: Laberintos, espejos, tiempo circular y el infinito"
                ),
                formulas = listOf(
                    "\\text{Lo Real Maravilloso} = \\text{Magia Natural Latinoamericana} \\neq \\text{Surrealismo Forzado}",
                    "\\text{El Aleph} \\to \\text{Punto del Espacio que Contiene Todo el Universo Simultáneamente}"
                ),
                formulaName = "Raíces de la Nueva Narrativa",
                formulaLatex = "\\text{Borges} \\implies \\text{Laberintos} \\; \\oplus \\; \\text{Tiempo Circular} \\; \\oplus \\; \\text{Espejos Infinitos}",
                formulaDescription = "Revolución de la prosa hispanoamericana previa al Boom de los años 60.",
                admissionTip = "Distingue siempre: 'Lo real maravilloso' es formulado por Alejo Carpentier en 1949; el 'Realismo mágico' es la técnica narrativa consagrada por García Márquez en 1967.",
                admissionExplanation = "• Borges nunca escribió novelas extensas; consideraba un despropósito demorarse en quinientas páginas para exponer una idea que podía sintetizarse con perfección en un cuento de pocas carillas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿En cuál de sus obras el escritor cubano Alejo Carpentier formula teóricamente el concepto de 'lo real maravilloso americano' en contraposición al surrealismo europeo?",
                    options = listOf(
                        "El siglo de las luces",
                        "Los pasos perdidos",
                        "El reino de este mundo",
                        "El recurso del método",
                        "Guerra del tiempo"
                    ),
                    correctIndex = 2,
                    explanation = "En el prólogo a 'El reino de este mundo' (1949), Carpentier postuló que lo maravilloso en América es una cualidad inherente a su historia y fe.",
                    subject = "Literatura",
                    semana = 4
                ),
                Challenge(
                    id = "q_lit_t04_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la poética narrativa de Jorge Luis Borges, los espejos, los laberintos y los universos circulares infinitos simbolizan fundamentalmente:",
                    options = listOf(
                        "La denuncia del analfabetismo en el campo argentino",
                        "El drama material de la lucha de clases obrera",
                        "El enigma metafísico del tiempo, la multiplicidad y la identidad humana",
                        "La defensa militar de las fronteras bonaerenses",
                        "El costumbrismo criollo de los gauchos pampeanos"
                    ),
                    correctIndex = 2,
                    explanation = "Borges utiliza los espejos y laberintos como alegorías filosóficas sobre la infinitud, el tiempo no lineal y el enigma de la existencia.",
                    subject = "Literatura",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "lit_t04_s04",
            subjectId = "literatura",
            semana = 4,
            subtema = "4.4 El Boom Latinoamericano y el Realismo Mágico: Gabriel García Márquez y Macondo",
            title = "El Boom Latinoamericano y Cien Años de Soledad",
            theory = LessonTheory(
                id = "th_lit_t04_s04",
                asignatura = "Literatura",
                semana = 4,
                titulo = "El Boom y el Realismo Mágico de Gabriel García Márquez",
                resumen = "• El Boom Latinoamericano (Década de 1960):\n  - Fenómeno estético y editorial sin precedentes que proyectó la narrativa latinoamericana a la vanguardia mundial.\n  - Cuarteto Central: Gabriel García Márquez (Colombia), Mario Vargas Llosa (Perú), Julio Cortázar (Argentina - *Rayuela*) y Carlos Fuentes (México - *La muerte de Artemio Cruz*).\n  - Rasgos Técnicos: Ruptura de la linealidad cronológica (racconto, flashback), monólogo interior, polifonía de narradores y multiplicidad de perspectivas.\n\n• Gabriel García Márquez (1927-2014 - Premio Nobel 1982):\n  - Creador del **Realismo Mágico**: integración de hechos extraordinarios, míticos e hiperbólicos narrados con total naturalidad y tono de crónica verosímil cotidiana.\n\n• Cien años de soledad (Buenos Aires, 1967):\n  - Espacio Mítico: **Macondo**, aldea fundada por José Arcadio Buendía y Úrsula Iguarán.\n  - Trama: Siete generaciones de la estirpe de los Buendía marcados por el aislamiento, la repetición de nombres y conductas, las guerras civiles del coronel Aureliano Buendía, la fiebre del banano traída por la compañía norteamericana, la matanza de trabajadores en la estación y la decadencia final.\n  - Hechos Míticos Clave:\n    * Remedios la bella asciende al cielo en cuerpo y alma envuelta en sábanas limpias.\n    * Llueve durante cuatro años, once meses y dos días en Macondo.\n    * El gitano Melquíades escribe en sánscrito los pergaminos proféticos con la historia total de la familia.\n  - Desenlace: Aureliano Babilonia descifra los pergaminos en el instante en que el último Buendía (engendrado con su tía Amaranta Úrsula) nace con cola de cerdo y es devorado por las hormigas rojas, mientras un viento bíblico arrasa Macondo para siempre.",
                conceptosClave = listOf(
                    "El Boom (1960): García Márquez, Vargas Llosa, Cortázar y Fuentes",
                    "Realismo Mágico: Lo insólito narrado con naturalidad y tono testimonial",
                    "Cien años de soledad (1967): La saga de los Buendía y el espacio mítico de Macondo",
                    "Los pergaminos de Melquíades y la destrucción final de la estirpe"
                ),
                formulas = listOf(
                    "\\text{Realismo Mágico} = \\text{Hechos Prodigiosos / Míticos} + \\text{Naturalidad Testimonial}",
                    "\\text{Ciclo de Macondo} \\to \\text{Fundación} \\to \\text{Guerras} \\to \\text{Compañía Bananera} \\to \\text{Apocalipsis Bíblico}"
                ),
                formulaName = "Fórmula del Realismo Mágico",
                formulaLatex = "\\text{Cien Años de Soledad} = \\text{Tiempo Circular} \\oplus \\text{Soledad Hereditaria} \\oplus \\text{Mito de Macondo}",
                formulaDescription = "Integración de la historia desgarrada de Colombia con la cosmogonía mágica popular.",
                admissionTip = "El primer Buendía está atado a un castaño (José Arcadio) y al último se lo están comiendo las hormigas (el niño con cola de cerdo).",
                admissionExplanation = "• La novela inicia con una de las frases más célebres de la literatura: 'Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendía había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En 'Cien años de soledad', ¿cuál es la técnica definitoria del Realismo Mágico empleada por Gabriel García Márquez?",
                    options = listOf(
                        "Explicar científicamente cada fenómeno sobrenatural mediante teorías físicas",
                        "Narrar sucesos milagrosos e inverosímiles con absoluto tono de normalidad cotidiana",
                        "Presentar la historia como un sueño onírico que el lector descubre falso al final",
                        "Usar únicamente el verso alejandrino para describir las guerras civiles",
                        "Reemplazar a los personajes humanos por alegorías de animales salvajes"
                    ),
                    correctIndex = 1,
                    explanation = "El Realismo Mágico incorpora acontecimientos maravillosos (levitaciones, lluvias de flores, ascensiones) narrados con frialdad y naturalidad fáctica.",
                    subject = "Literatura",
                    semana = 4
                ),
                Challenge(
                    id = "q_lit_t04_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Quién es el personaje gitano que en 'Cien años de soledad' redacta en sánscrito los pergaminos proféticos que anticipan toda la historia de la estirpe de los Buendía?",
                    options = listOf("Pietro Crespi", "Aureliano José", "Melquíades", "Prudencio Aguilar", "Gerineldo Márquez"),
                    correctIndex = 2,
                    explanation = "El sabio gitano Melquíades redacta los pergaminos cifrados que Aureliano Babilonia descifra antes del cataclismo final de Macondo.",
                    subject = "Literatura",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: LITERATURA PERUANA (SEMANA 5)
        // =========================================================================
        LessonNode(
            id = "lit_t05_s01",
            subjectId = "literatura",
            semana = 5,
            subtema = "5.1 Crónica Mestiza y Siglo XIX: Inca Garcilaso de la Vega, Costumbrismo y Romanticismo",
            title = "Del Inca Garcilaso de la Vega al Costumbrismo y Tradiciones Peruanas",
            theory = LessonTheory(
                id = "th_lit_t05_s01",
                asignatura = "Literatura",
                semana = 5,
                titulo = "La Crónica Virreinal y la Literatura del Siglo XIX",
                resumen = "• El Inca Garcilaso de la Vega (Gómez Suárez de Figueroa, 1539-1616):\n  - Primer mestizo biológico y espiritual de América (hijo del capitán español Sebastián Garcilaso y de la ñusta Isabel Chimpu Ocllo).\n  - Obra Cumbre: *Comentarios Reales de los Incas*:\n    * Primera Parte (Lisboa, 1609): Historia, mitos (Manco Cápac y Mama Ocllo), leyes, religión y sociedad del Tahuantinsuyo. Presenta al imperio incaico como una sociedad providencial armónica preparada para la evangelización cristiana.\n    * Segunda Parte (*Historia General del Perú*, Córdoba, 1617): La conquista del Perú y las sangrientas guerras civiles entre pizarristas y almagristas; busca vindicar la honra de su padre.\n\n• El Costumbrismo Republicano (Mediados del s. XIX):\n  1. Vertiente Criollista / Popular: Manuel Ascencio Segura (padre del teatro nacional). Comedia de costumbres limeñas en verso ágil y habla popular. Obra: *Ña Catita* (1856, comedia satírica sobre una vieja alcahueta intrigante).\n  2. Vertiente Anticriollista / Aristocrática: Felipe Pardo y Aliaga. Purismo idiomático y sátira contra el desorden republicano. Obra: *Un viaje* (el consentido niño Goyito tarda tres años en alistar su viaje a Chile).\n\n• El Romanticismo Peruano:\n  - Ricardo Palma y las *Tradiciones Peruanas*: Creación de la **tradición** como especie híbrida (fundamento histórico + anécdota costumbrista + gracejo criollo con refranes).\n  - Carlos Augusto Salaverry: Máximo lírico romántico (*Cartas a un ángel*, elegía amorosa '¡Acuérdate de mí!').",
                conceptosClave = listOf(
                    "Inca Garcilaso de la Vega: Primer mestizo espiritual y los Comentarios Reales (1609/1617)",
                    "Costumbrismo: Segura (criollista / Ña Catita) vs Pardo y Aliaga (anticriollista / Un viaje)",
                    "Ricardo Palma: Creador de la tradición peruana (historia + ficción + humor criollo)",
                    "Carlos Augusto Salaverry: Cumbre lírica romántica con ¡Acuérdate de mí!"
                ),
                formulas = listOf(
                    "\\text{Tradición Palmista} = \\text{Dato Histórico Verídico} + \\text{Ficción Costumbrista} + \\text{Humor Criollo}",
                    "\\text{Comentarios Reales} \\to \\text{I Parte: Imperio Incaico} \\; \\mid \\; \\text{II Parte: Conquista y Guerras Civiles}"
                ),
                formulaName = "Mestizaje e Identidad Republicana",
                formulaLatex = "\\text{Literatura Republicana} = \\text{Mestizaje Garcilasista} \\; \\oplus \\; \\text{Teatro Costumbrista} \\; \\oplus \\; \\text{Tradición Palmista}",
                formulaDescription = "Génesis y consolidación de las letras peruanas desde la colonia hasta la república temprana.",
                admissionTip = "La Primera Parte de los Comentarios Reales se publicó en Lisboa (1609); la Segunda Parte se publicó póstumamente en Córdoba (1617) con el título de 'Historia General del Perú'.",
                admissionExplanation = "• En 'Ña Catita', la protagonista es desenmascarada cuando don Juan revela que don Alejo, el pretendiente maduro que busca casarse con Juliana, en realidad ya está casado en el Cusco."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la Primera Parte de los 'Comentarios Reales de los Incas' (1609), el Inca Garcilaso de la Vega se propone fundamentalmente:",
                    options = listOf(
                        "Justificar las atrocidades cometidas durante las guerras civiles pizarristas",
                        "Describir el origen mítico, gobierno y grandiosa civilización del Tahuantinsuyo",
                        "Denunciar a la Inquisición española por destruir templos andinos",
                        "Traducir las fábulas de Esopo al quechua cusqueño",
                        "Exigir la restitución armada de la nobleza incaica en el trono virreinal"
                    ),
                    correctIndex = 1,
                    explanation = "La Primera Parte de los 'Comentarios Reales' rescata la cultura, leyes, orden social y grandeza del Imperio de los Incas.",
                    subject = "Literatura",
                    semana = 5
                ),
                Challenge(
                    id = "q_lit_t05_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La especie narrativa típicamente peruana creada por Ricardo Palma que fusiona documentos históricos verídicos con relatos costumbristas populares y humor criollo festivo se denomina:",
                    options = listOf("Leyenda", "Cantar de gesta", "Tradición", "Mito andino", "Crónica mestiza"),
                    correctIndex = 2,
                    explanation = "La 'tradición' es el género literario híbrido fundado por Ricardo Palma en sus célebres 'Tradiciones peruanas'.",
                    subject = "Literatura",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "lit_t05_s02",
            subjectId = "literatura",
            semana = 5,
            subtema = "5.2 El Realismo Radical y el Discurso en el Politeama: Manuel González Prada",
            title = "Manuel González Prada: Realismo Radical y Conciencia Nacional",
            theory = LessonTheory(
                id = "th_lit_t05_s02",
                asignatura = "Literatura",
                semana = 5,
                titulo = "El Realismo Crítico y Manuel González Prada",
                resumen = "• El Realismo Peruano (Posguerra del Pacífico, 1883 en adelante):\n  - Surge como una dolorosa y enérgica toma de conciencia crítica frente al desastre nacional tras la Guerra del Guano y del Salitre con Chile.\n  - Rechaza la evasión risueña del costumbrismo y romanticismo; propugna el rigor sociológico, el antirreligiosismo, la ciencia positivista y la redención del indio.\n\n• Manuel González Prada (1844-1918):\n  - Máximo ensayista, orador iconoclasta y reformador del verso peruano.\n  - Obras Fundamentales: *Pájinas libres* (1894) y *Horas de lucha* (1908).\n\n• El «Discurso en el Politeama» (Teatro Politeama, 1888):\n  - Pronunciado por un escolar (el niño Eloy Unda) en una velada cívica para recaudar fondos para el rescate de Tacna y Arica.\n  - Tesis Cruciales:\n    1. La causa de la derrota ante Chile no fue la cobardía individual ni la superioridad militar chilena, sino nuestra propia ignorancia, servilismo y desunión nacional:\n       * 'La mano brutal de Chile despedazó nuestra carne y machacó nuestros huesos; pero los verdaderos vencedores fueron la ignorancia y el espíritu de servidumbre de nuestros gobernantes'.\n    2. Reivindicación de la Nación Andina:\n       * 'No forman el verdadero Perú las agrupaciones de criollos y extranjeros que habitan la faja de tierra situada entre el Pacífico y los Andes; la nación está formada por las muchedumbres de indios diseminadas en la banda oriental de la cordillera'.\n    3. La Consigna Generacional:\n       * '¡Los viejos a la tumba, los jóvenes a la obra!' (Llamado a la juventud a romper con el pasado oligárquico corrupto).",
                conceptosClave = listOf(
                    "Realismo peruano posguerra: Actitud iconoclasta, positivista y patriótica",
                    "Manuel González Prada: Pájinas libres (1894) y Horas de lucha (1908)",
                    "Discurso en el Politeama (1888): Diagnóstico implacable de la derrota ante Chile",
                    "Redención del indio como la verdadera base demográfica y moral del Perú"
                ),
                formulas = listOf(
                    "\\text{Nación Peruana} = \\text{Las Muchedumbres Indígenas} \\neq \\text{La Oligarquía Costeña Criolla}",
                    "\\text{Lema Histórico} \\to \\text{'¡Los viejos a la tumba, los jóvenes a la obra!'}"
                ),
                formulaName = "Tesis Central de González Prada",
                formulaLatex = "\\text{Causa de la Derrota} = \\text{Ignorancia Generalizada} + \\text{Servidumbre Colonial} + \\text{Exclusión del Indio}",
                formulaDescription = "Crítica estructural a la república aristocrática peruana de fines del siglo XIX.",
                admissionTip = "González Prada es considerado precursor del Modernismo poético (introdujo estrofas como el triolet y el rondel) y padre ideológico del Indigenismo peruano.",
                admissionExplanation = "• González Prada promovió una ortografía fonética radical en sus escritos (usando 'j' en lugar de 'g' suave, de ahí 'Pájinas libres', 'i' en lugar de 'y')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En su célebre 'Discurso en el Politeama' (1888), Manuel González Prada sostiene que el verdadero Perú está conformado por:",
                    options = listOf(
                        "La élite letrada y diplomática ilustrada de la costa limeña",
                        "Los veteranos militares que combatieron en las batallas de Miraflores",
                        "Las muchedumbres de indios diseminadas en la cordillera andina",
                        "Los inmigrantes europeos afincados en las haciendas agroindustriales",
                        "Los comerciantes del puerto del Callao"
                    ),
                    correctIndex = 2,
                    explanation = "González Prada afirma rotundamente que la nación real son las grandes mayorías indígenas postergadas en la región andina.",
                    subject = "Literatura",
                    semana = 5
                ),
                Challenge(
                    id = "q_lit_t05_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es la famosa consigna generacional que Manuel González Prada dirige a la juventud peruana tras la desastrosa Guerra del Pacífico?",
                    options = listOf(
                        "¡Paz para los vencidos, gloria para los vencedores!",
                        "¡Unión, combate y perdón cristiano!",
                        "¡Los viejos a la tumba, los jóvenes a la obra!",
                        "¡Hacia el orden y el progreso positivista!",
                        "¡Someterse con paciencia ante el destino adverso!"
                    ),
                    correctIndex = 2,
                    explanation = "'¡Los viejos a la tumba, los jóvenes a la obra!' es la histórica sentencia con que convoca a una nueva generación moral para reconstruir la patria.",
                    subject = "Literatura",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "lit_t05_s03",
            subjectId = "literatura",
            semana = 5,
            subtema = "5.3 Vanguardismo Universal: Las Etapas Poéticas de César Vallejo",
            title = "César Vallejo: Vanguardismo Universal y Solidaridad Humana",
            theory = LessonTheory(
                id = "th_lit_t05_s03",
                asignatura = "Literatura",
                semana = 5,
                titulo = "César Vallejo y su Revolución Poética Universal",
                resumen = "• César Vallejo (Santiago de Chuco, 1892 - París, 1938):\n  - Máxima cumbre poética del Perú y una de las figuras más renovadoras de la literatura universal.\n\n• Tres Etapas Estéticas Monumentales:\n  1. Etapa Modernista / Transición (1918):\n     - *Los heraldos negros:*\n       * Tono modernista tardío bajo la influencia de Herrera y Reissig y Rubén Darío, pero con una incipiente voz andina de dolor y orfandad metafísica.\n       * Verso célebre: 'Hay golpes en la vida, tan fuertes... ¡Yo no sé! / Golpes como del odio de Dios...'. Temas del hogar provinciano, la madre, la muerte del hermano Miguel.\n  2. Etapa Vanguardista Radical (1922):\n     - *Trilce:*\n       * Cénit de la vanguardia poética en lengua castellana. Ruptura violenta de la sintaxis, ortografía y léxico convencional (crea neologismos, usa faltas ortográficas deliberadas, disloca números y tipografía).\n       * Escrito tras su injusto encarcelamiento en Trujillo (1920). Expresa la soledad carcelaria, la orfandad absoluta por la muerte de su madre y la vivencia absurda de la existencia humana.\n  3. Etapa de Compromiso Político y Solidaridad Humana (París, póstumo, 1939):\n     - *Poemas humanos:*\n       * Poesía del dolor corporal, el trabajo extenuante y la compasión universal hacia el hombre concreto de carne y hueso ('Quiero escribir, pero me sale espuma...').\n     - *España, aparta de mí este cáliz:*\n       * Himno combativo de adhesión a la República durante la Guerra Civil Española.\n       * Poema cumbre: *Masa* (el cadáver del combatiente caído revive únicamente cuando el amor solidario de todos los hombres de la Tierra lo congrega al unísono).",
                conceptosClave = listOf(
                    "César Vallejo: Máxima voz poética del Perú y renovador universal",
                    "Los heraldos negros (1918): Dolor existencial, orfandad y hogar andino",
                    "Trilce (1922): Ruptura vanguardista radical de la sintaxis y el lenguaje",
                    "Poemas humanos (1939): Dolor físico, compromiso social y el poema Masa"
                ),
                formulas = listOf(
                    "\\text{Los heraldos negros} \\to \\text{Modernismo Intimista} + \\text{Orfandad Andina}",
                    "\\text{Trilce (1922)} \\to \\text{Vanguardia Radical} + \\text{Desarticulación Sintáctica}",
                    "\\text{Masa} \\to \\text{Muerte del Soldado} \\xrightarrow{\\text{Solidaridad Total de la Humanidad}} \\text{Resurrección}"
                ),
                formulaName = "Trilogía Poética Vallejiana",
                formulaLatex = "\\text{Vallejo}: \\; \\text{Los heraldos negros (1918)} \\; \\longrightarrow \\; \\text{Trilce (1922)} \\; \\longrightarrow \\; \\text{Poemas humanos (1939)}",
                formulaDescription = "Itinerario espiritual desde el hogar provinciano andino hasta la redención universal del hombre.",
                admissionTip = "El poemario 'Trilce' no tiene un significado unívoco prefijado; es un neologismo acuñado por el propio Vallejo (asociado a 'tres' y 'dulce').",
                admissionExplanation = "• En el poema 'Masa', la muerte es derrotada no por un milagro divino sobrenatural, sino por la fuerza moral de la fraternidad universal de la humanidad."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El poemario de César Vallejo publicado en 1922 que representó la ruptura radical más audaz con la sintaxis, ortografía y métrica tradicional del idioma castellano es:",
                    options = listOf("Los heraldos negros", "Trilce", "Poemas humanos", "España, aparta de mí este cáliz", "Fabla salvaje"),
                    correctIndex = 1,
                    explanation = "'Trilce' (1922) es la cumbre indiscutible de la vanguardia experimental en la lírica hispanoamericana.",
                    subject = "Literatura",
                    semana = 5
                ),
                Challenge(
                    id = "q_lit_t05_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el célebre poema 'Masa' de César Vallejo, el combatiente muerto finalmente resucita y abraza al primer hombre cuando:",
                    options = listOf(
                        "Llegan los refuerzos de la aviación republicana",
                        "Los médicos logran curar sus heridas de guerra",
                        "Todos los hombres de la Tierra lo rodean con amor y fraternidad universal",
                        "Su madre reza por su alma en el pueblo natal",
                        "El sacerdote del ejército le concede la extremaunción"
                    ),
                    correctIndex = 2,
                    explanation = "La resurrección en 'Masa' ocurre cuando toda la humanidad, unida en amor fraterno y solidario, le ruega al cadáver que regrese a la vida.",
                    subject = "Literatura",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "lit_t05_s04",
            subjectId = "literatura",
            semana = 5,
            subtema = "5.4 Indigenismo y Narrativa Contemporánea: Arguedas, Ribeyro y Mario Vargas Llosa",
            title = "Del Indigenismo Andino al Boom Urbano: Arguedas, Ribeyro y Vargas Llosa",
            theory = LessonTheory(
                id = "th_lit_t05_s04",
                asignatura = "Literatura",
                semana = 5,
                titulo = "Indigenismo y Narrativa Urbana Contemporánea",
                resumen = "• El Indigenismo Peruano:\n  1. Ciro Alegría (1909-1967):\n     - Indigenismo del norte andino. Novela cumbre: *El mundo es ancho y ajeno* (1941).\n     - Argumento: La defensa heroica de la comunidad campesina de Rumi, liderada por el anciano alcalde Rosendo Maqui, frente a la codicia del hacendado Álvaro Amenábar que la destruye legal y físicamente.\n  2. José María Arguedas (1911-1969):\n     - Indigenismo antropológico vivencial desde adentro; bilingüismo literario quechua-español.\n     - Obra Cumbre: *Los ríos profundos* (1958).\n     - Protagonista: Ernesto, adolescente que viaja con su padre Gabriel y es internado en un colegio religioso de Abancay. Ernesto habita entre dos mundos culturales (andino indígena y criollo señorial). El zumbayllu (trompo mágico sonoro) actúa como puente de comunión fraterna. Destaca la revuelta de las chicheras lideradas por doña Felipa exigiendo sal para los pobres y la epidemia de peste de tifo.",
                conceptosClave = listOf(
                    "Ciro Alegría: La comunidad campesina de Rumi y Rosendo Maqui en El mundo es ancho y ajeno",
                    "José María Arguedas: Los ríos profundos (Ernesto, el zumbayllu y la cosmovisión andina)",
                    "Julio Ramón Ribeyro: La palabra del mudo y Los gallinazos sin plumas (realismo urbano marginal)",
                    "Mario Vargas Llosa: Premio Nobel 2010 y La ciudad y los perros (violencia del Colegio Militar Leoncio Prado)"
                ),
                formulas = listOf(
                    "\\text{Arguedas} \\to \\text{Mundo Andino Visto desde Adentro} \\; (\\text{Animismo Cósmico})",
                    "\\text{Vargas Llosa} \\to \\text{Técnicas Vanguardistas Modernas (Vasos Comunicantes + Cajas Chinas)}"
                ),
                formulaName = "Ejes de la Narrativa Peruana Contemporánea",
                formulaLatex = "\\text{Narrativa}: \\; \\text{Indigenismo (Arguedas / Alegría)} \\; \\longrightarrow \\; \\text{Urbana (Ribeyro)} \\; \\longrightarrow \\; \\text{Boom Global (Vargas Llosa)}",
                formulaDescription = "Tránsito de la problemática agraria andina a la metrópoli alienante y la modernidad técnica internacional.",
                admissionTip = "En 'Los ríos profundos', el 'zumbayllu' es un trompo que emite un zumbido mágico, considerado por Ernesto un instrumento de encantamiento y paz espiritual.",
                admissionExplanation = "• En 'Los gallinazos sin plumas' de Ribeyro, el abuelo don Santos explota a sus nietos Efraín y Enrique para cebar a un cerdo voraz llamado Pascual."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la novela 'Los ríos profundos' de José María Arguedas, ¿qué objeto lúdico y sonoro despierta fascinación en Ernesto al actuar como un instrumento mágico pacificante?",
                    options = listOf("El charango", "El zumbayllu (trompo)", "La quena", "El pututo", "La honda"),
                    correctIndex = 1,
                    explanation = "El zumbayllu es el trompo mágico cuyo sonido genera armonía y emoción poética entre los estudiantes del colegio de Abancay.",
                    subject = "Literatura",
                    semana = 5
                ),
                Challenge(
                    id = "q_lit_t05_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la obra 'La ciudad y los perros' de Mario Vargas Llosa, ¿cuál es el crimen que desencadena el asesinato del cadete Ricardo Arana ('el Esclavo') en el polígono de tiro?",
                    options = listOf(
                        "El asalto armado a las oficinas de la dirección del colegio",
                        "La denuncia del robo de un examen de química cometido por el Círculo",
                        "El escape no autorizado de varios cadetes del recinto militar",
                        "La falsificación de las libretas de calificaciones militares",
                        "El robo de fusiles Mauser del almacén de guardia"
                    ),
                    correctIndex = 1,
                    explanation = "El Esclavo delata que Cava robó el examen de química; en represalia durante las maniobras de tiro, el Jaguar asesina al Esclavo de un disparo.",
                    subject = "Literatura",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: LITERATURA REGIONAL: SUR ANDINO Y AREQUIPA (SEMANA 6)
        // =========================================================================
        LessonNode(
            id = "lit_t06_s01",
            subjectId = "literatura",
            semana = 6,
            subtema = "6.1 Mariano Melgar: Prócer Mártir, Fábulas Cívicas y la Génesis del Yaraví Mestizo",
            title = "Mariano Melgar: El Yaraví Mestizo y el Patriotismo Mártir",
            theory = LessonTheory(
                id = "th_lit_t06_s01",
                asignatura = "Literatura",
                semana = 6,
                titulo = "Mariano Melgar y la Génesis del Yaraví Mestizo",
                resumen = "• Mariano Melgar y Valdivieso (Arequipa, 1790 - Umachiri, 1815):\n  - Poeta precoz, músico, traductor erudito de Virgilio y Ovidio, teólogo y patriota mártir fusilado a los 24 años en Umachiri tras enrolarse en la rebelión independentista de Mateo Pumacahua.\n  - Reconocido como el **precursor del Romanticismo en el Perú y América Latina**.\n\n• Tres Facetas Estéticas Trascendentales:\n  1. La Fusión Poética del Yaraví Mestizo:\n     - Melgar une de forma simbiótica el **harawi quechua prehispánico** (canto lírico de dolor amoroso, despedida y congoja) con la **métrica lírica culta castellana** (versos de arte menor, rima asonante o consonante y pie quebrado).\n     - La Musa Inmortal: María de los Santos Corrales y Salazar ('Silvia'), quien rechazó su amor provocando elegías desgarradoras de dolor e ingratitud amorosa ('¿Por qué a verte volví, Silvia querida?'). Anteriormente dedicó versos a Manuela Paredes ('Meli').\n  2. Fábulas Cívico-Patrióticas:\n     - Alegorías poéticas con mensaje político clandestino contra la dominación española:\n       * *El cantero y el asno:* Demuestra que el indio peruano no es servil o torpe por naturaleza, sino por la opresión feudal virreinal que lo trata como animal de carga.\n       * *Los gatos:* Advierte a los patriotas que, al dividirse por ambiciones mezquinas, terminan devorados por el perro común.\n  3. Odas Cívicas Humanistas:\n     - *A la libertad*, *Al conde de Vista Florida* (exaltación ilustrada del saber y la patria).",
                conceptosClave = listOf(
                    "Precursor del Romanticismo en América e iniciador de la poesía mestiza",
                    "Yaraví: Fusión del harawi quechua con la métrica culta castellana",
                    "Musas: Manuelita Paredes ('Meli') y María Santos Corrales ('Silvia')",
                    "Fábulas de protesta patriótica: El cantero y el asno, Los gatos",
                    "Mártir de la independencia: Fusilado tras la batalla de Umachiri (1815)"
                ),
                formulas = listOf(
                    "\\text{Yaraví Mestizo} = \\text{Harawi Quechua (Lamento)} + \\text{Poesía Lírica Española}",
                    "\\text{Fábulas Políticas} \\to \\text{Alegoría de Animales} \\implies \\text{Crítica al Yugo Colonial}"
                ),
                formulaName = "Fórmula Poética Melgariana",
                formulaLatex = "\\text{Melgar}: \\; \\text{Harawi} \\; \\oplus \\; \\text{Verso Castellano} \\implies \\text{Fundación de la Poesía Nacional}",
                formulaDescription = "Síntesis lírica fundacional de la identidad mestiza del Perú.",
                admissionTip = "Mariano Melgar es el poeta símbolo de Arequipa. En admisión UNSA preguntan invariablemente por la fusión del harawi con el verso español y su musa Silvia.",
                admissionExplanation = "• En 'El cantero y el asno', el asno se niega a trabajar respondiendo al amo que si fuera bien alimentado y tratado con dignidad, demostraría tanta nobleza como cualquier caballo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El aporte literario e histórico más trascendental de Mariano Melgar a la identidad de la poesía peruana consistió en:",
                    options = listOf(
                        "Escribir la primera epopeya en latín sobre la conquista del Cusco",
                        "Fundar el yaraví mestizo sintetizando el harawi quechua con la métrica castellana",
                        "Dirigir el primer periódico clandestino modernista de Lima",
                        "Componer dramas de honor al estilo del teatro barroco calderoniano",
                        "Introducir la poesía de vanguardia dadaísta en el sur andino"
                    ),
                    correctIndex = 1,
                    explanation = "Melgar fundó el yaraví mestizo al asimilar el sentimiento desgarrado del harawi andino a las formas poéticas castellanas.",
                    subject = "Literatura",
                    semana = 6
                ),
                Challenge(
                    id = "q_lit_t06_s01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la fábula política 'El cantero y el asno' de Mariano Melgar, la figura del asno maltratado que responde a su amo simboliza:",
                    options = listOf(
                        "La nobleza virreinal española en decadencia",
                        "La población indígena peruana oprimida y degradada por el régimen colonial",
                        "Los ejércitos realistas acuartelados en el Callao",
                        "El clero inquisitorial reacio a las ideas liberales",
                        "Los comerciantes extranjeros del puerto de Islay"
                    ),
                    correctIndex = 1,
                    explanation = "El asno encarna al indio andino oprimido, a quien los amos acusan injustamente de torpeza innata cuando es la opresión la que lo reduce.",
                    subject = "Literatura",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "lit_t06_s02",
            subjectId = "literatura",
            semana = 6,
            subtema = "6.2 Modernismo y Vanguardia Arequipeña: Percy Gibson, El Aquelarre y Alberto Hidalgo",
            title = "Arequipa Lírica: El Grupo Aquelarre y el Simplismo de Alberto Hidalgo",
            theory = LessonTheory(
                id = "th_lit_t06_s02",
                asignatura = "Literatura",
                semana = 6,
                titulo = "El Grupo Aquelarre y la Vanguardia de Alberto Hidalgo",
                resumen = "• El Grupo 'El Aquelarre' (Arequipa, 1916):\n  - Movimiento de bohemia y renovación lírica arequipeña contemporáneo del grupo limeño Colónida de Abraham Valdelomar.\n  - Integrantes: Percy Gibson, Belisario Calle, César Atahualpa Rodríguez y Renato Morales de Rivera.\n  - Postulados: Exaltación de la campiña mistiana, el sillar blanco, la rebeldía estética frente a los moldes académicos tradicionales y el culto a la belleza sensorial modernista.\n\n• Percy Gibson (1885-1960):\n  - El poeta supremo de la campiña arequipeña y la energía de la naturaleza volcánica.\n  - Obras: *Jornada heroica* (1916), *Quince sonetos de la campiña*. Su poema 'El gallo' es una obra maestra de plástica y fuerza lírica.\n\n• Alberto Hidalgo (Arequipa, 1897 - Buenos Aires, 1967):\n  - Máxima figura de la **vanguardia poética iconoclasta, beligerante y contestataria** en América Latina.\n  - Fundador del **Simplismo**:\n    * Movimiento vanguardista que propugnaba la supresión de adjetivos decorativos inútiles, retórica vacía y rima gastada.\n    * Uso de metáforas visuales matemáticas, versolibrismo absoluto y pausas espaciales en blanco.\n  - Obras Cumbres: *Panoplia lírica* (1917), *Las voces de colores* (1918), *Química del espíritu* (1923), *Carta al Perú*.\n  - Personalidad megalómana y polémica sin claudicaciones que desafió tanto a las dictaduras políticas como a las convenciones burguesas de su tiempo.",
                conceptosClave = listOf(
                    "Grupo El Aquelarre (1916): Renovación lírica arequipeña (Gibson, Rodríguez, Calle)",
                    "Percy Gibson: Cantor de la campiña de Arequipa, Jornada heroica y El gallo",
                    "Alberto Hidalgo: Fundador del Simplismo y pionero de la vanguardia poética continental",
                    "Simplismo: Supresión de adornos retóricos, metáforas geométricas y espacio en blanco"
                ),
                formulas = listOf(
                    "\\text{Aquelarre} \\to \\text{Campiña Arequipeña} + \\text{Lirismo Volcánico}",
                    "\\text{Simplismo de Hidalgo} = \\text{Poesía Pura} - \\text{Retórica Decorativa} + \\text{Espacio Tipográfico}"
                ),
                formulaName = "Vanguardia y Tradición Arequipeña",
                formulaLatex = "\\text{Lírica Arequipeña}: \\; \\text{Campiña (Gibson)} \\; \\longleftrightarrow \\; \\text{Vanguardia Radical (Hidalgo)}",
                formulaDescription = "Tensión fecunda entre la identidad telúrica local y la ruptura estética cosmopolita.",
                admissionTip = "Alberto Hidalgo fue propuesto al Premio Nobel de Literatura y fundó en Buenos Aires la revista de vanguardia 'Oral'.",
                admissionExplanation = "• Percy Gibson y César Atahualpa Rodríguez simbolizan la comunión íntima del creador arequipeño con el Misti y el trabajo agrícola del loncco."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál es el movimiento de vanguardia poética fundado por el escritor arequipeño Alberto Hidalgo que proponía despojar al poema de toda retórica y adjetivación innecesaria?",
                    options = listOf("Creacionismo", "Simplismo", "Ultraísmo", "Estridentismo", "Futurismo"),
                    correctIndex = 1,
                    explanation = "Alberto Hidalgo creó y teorizó el 'Simplismo' como un método vanguardista para despojar al verso de artificios ornamentales.",
                    subject = "Literatura",
                    semana = 6
                ),
                Challenge(
                    id = "q_lit_t06_s02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El grupo bohemio de renovación literaria fundado en Arequipa en 1916 que congregó a figuras como Percy Gibson y César Atahualpa Rodríguez se conoció con el nombre de:",
                    options = listOf("Colónida", "El Aquelarre", "Orkopata", "Boletín Titikaka", "Norte"),
                    correctIndex = 1,
                    explanation = "'El Aquelarre' fue el célebre grupo lírico arequipeño de 1916 que impulsó la modernización poética y el canto a la campiña del sur.",
                    subject = "Literatura",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "lit_t06_s03",
            subjectId = "literatura",
            semana = 6,
            subtema = "6.3 Narrativa Arequipeña: Augusto Aguirre Morales (El pueblo del sol) y Oswaldo Reynoso (Los inocentes)",
            title = "Narrativa de Arequipa: Augusto Aguirre Morales y Oswaldo Reynoso",
            theory = LessonTheory(
                id = "th_lit_t06_s03",
                asignatura = "Literatura",
                semana = 6,
                titulo = "La Narrativa Arequipeña: Épica Histórica y Realismo Urbano Juvenil",
                resumen = "• Augusto Aguirre Morales (Arequipa, 1888 - 1957):\n  - Miembro de El Aquelarre en Arequipa y de Colónida en Lima (amigo íntimo de Abraham Valdelomar).\n  - Obra Monumental: *El pueblo del sol* (1924, dos tomos):\n    * Novela histórica ambientada en el apogeo del Tahuantinsuyo bajo el reinado del inca Huayna Cápac.\n    * Reconstruye con rigor arqueológico, prosa modernista sensual y riqueza pictórica el esplendor del imperio, las ceremonias del Inti Raymi, la psicología de las ñustas y acllas, y las tensiones cortesanas previas a la guerra fratricida entre Huáscar y Atahualpa.\n\n• Oswaldo Reynoso (Arequipa, 1931 - Lima, 2016):\n  - Integrante fundamental de la Generación del 50 y cofundador del grupo 'Narración'.\n  - *Los inocentes* (1961, también reeditado con el título *Lima en rock*):\n    * Libro de cuentos que provocó un terremoto crítico en la literatura peruana al incorporar con maestría el habla coloquial de la juventud urbana marginal, el mundo de los billares, esquinas y la música rock.\n    * Personajes: Una pandilla de adolescentes apodados 'Cara de Ángel', 'el Príncipe', 'el Choro', 'el Coloreao', 'el Chino' y 'Goro'. Muestra sus dilemas de identidad, descubrimientos sexuales, violencia, inocencia truncada y soledad en la urbe.\n  - Novela: *En octubre no hay milagros* (1965, radiografía descarnada de las clases sociales limeñas en un solo día durante la procesión del Señor de los Milagros).",
                conceptosClave = listOf(
                    "Augusto Aguirre Morales: El pueblo del sol (1924, recreación del imperio incaico)",
                    "Oswaldo Reynoso: Los inocentes / Lima en rock (1961, lenguaje juvenil urbano)",
                    "Personajes de Los inocentes: Cara de Ángel, el Príncipe, el Choro, el Coloreao",
                    "En octubre no hay milagros (1965): Crítica social en el día del Señor de los Milagros"
                ),
                formulas = listOf(
                    "\\text{El pueblo del sol} \\to \\text{Prosa Modernista} + \\text{Tahuantinsuyo de Huayna Cápac}",
                    "\\text{Los inocentes} \\to \\text{Jerga Juvenil} + \\text{Billares Limeños} + \\text{Rock and Roll}"
                ),
                formulaName = "Cumbres de la Prosa Arequipeña",
                formulaLatex = "\\text{Narrativa Arequipeña}: \\; \\text{Épica Incaica (Aguirre Morales)} \\; \\longleftrightarrow \\; \\text{Juventud Marginal (Reynoso)}",
                formulaDescription = "Diversidad de la prosa del sur peruano: desde la recreación histórica monumental hasta el quiebre del canon urbano moderno.",
                admissionTip = "La publicación de 'Los inocentes' de Oswaldo Reynoso en 1961 fue recibida con escándalo por los críticos conservadores, pero aplaudida con entusiasmo por José María Arguedas.",
                admissionExplanation = "• En 'El pueblo del sol', Aguirre Morales describe no solo la grandeza militar incaica, sino la vida íntima y los anhelos pasionales de sus protagonistas en el Cusco imperial."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La novela histórica del escritor arequipeño Augusto Aguirre Morales publicada en 1924 que recrea con minuciosa prosa lírica y rigor documental el esplendor del Tahuantinsuyo durante el reinado de Huayna Cápac se titula:",
                    options = listOf("Flor de desierto", "El pueblo del sol", "La ciudad de los reyes", "La venganza del cóndor", "Hijos del sol"),
                    correctIndex = 1,
                    explanation = "'El pueblo del sol' (1924) es la monumental novela histórica de Augusto Aguirre Morales sobre el esplendor imperial incaico.",
                    subject = "Literatura",
                    semana = 6
                ),
                Challenge(
                    id = "q_lit_t06_s03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En 'Los inocentes' (Lima en rock) de Oswaldo Reynoso, los protagonistas que habitan las esquinas, billares y cines de barrio son:",
                    options = listOf(
                        "Comuneros andinos despojados de sus tierras comunales",
                        "Una pandilla de muchachos adolescentes que exploran su identidad y la marginalidad",
                        "Soldados reclutados en los cuarteles de infantería",
                        "Aristócratas limeños que organizan recepciones diplomáticas",
                        "Escolares provincianos internados en un colegio religioso"
                    ),
                    correctIndex = 1,
                    explanation = "'Los inocentes' retrata la vivencia íntima, el lenguaje coloquial y la fragilidad afectiva de un grupo de adolescentes de barrio en los billares limeños.",
                    subject = "Literatura",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "lit_t06_s04",
            subjectId = "literatura",
            semana = 6,
            subtema = "6.4 Poética del Sur Andino: Gamaliel Churata (El pez de oro, Grupo Orkopata) y la Lírica Quechua",
            title = "Gamaliel Churata, el Grupo Orkopata y la Cosmovisión del Sur Andino",
            theory = LessonTheory(
                id = "th_lit_t06_s04",
                asignatura = "Literatura",
                semana = 6,
                titulo = "Gamaliel Churata y la Vanguardia Telúrica del Sur Andino",
                resumen = "• El Grupo Orkopata y el *Boletín Titikaka* (Puno, 1926-1930):\n  - Movimiento vanguardista andino encabezado por los hermanos Arturo Peralta (Gamaliel Churata) y Alejandro Peralta en Puno.\n  - Difundieron la vanguardia estética universal dialogando en igualdad de condiciones con la cosmovisión mítico-filosófica quechua y aimara.\n\n• Gamaliel Churata (Arturo Peralta, 1897-1969):\n  - Pensador, ensayista, poeta y filósofo cumbre del indigenismo cósmico.\n  - Obra Monumental: *El pez de oro* (La Paz, 1957, subtitulado *Retablos del Laykhakuy*):\n    * Obra inclasificable que fusiona ensayo filosófico, novela mítica, poesía vanguardista, relato cosmogónico y teatro ritual.\n    * Escrita en una lengua mestiza revolucionaria que transgrede la gramática hispana incorporando la sintaxis y resonancias del quechua y el aimara.\n    * El Pez de Oro es el símbolo mítico del alma cósmica andina que nada en las profundidades del lago sagrado Titicaca; representa la regeneración espiritual de América frente a la alienación del pensamiento colonial europeo.\n\n• La Lírica Quechua del Sur Andino:\n  - Rescate de la voz lírica vernácula a través de poetas como Andrés Alencastre Gutiérrez (*Kilku Warak'a*, Cusco) y su obra *Taki parwa* (1952), que evidencian la vitalidad y hondura metafísica de la lengua originaria andina.",
                conceptosClave = listOf(
                    "Gamaliel Churata (Arturo Peralta): Máxima figura del indigenismo cósmico y vanguardista",
                    "Grupo Orkopata y el emblemático Boletín Titikaka (Puno, 1926-1930)",
                    "El pez de oro (1957): Obra monumental que fusiona filosofía mítica andina y vanguardia lingüística",
                    "Kilku Warak'a (Andrés Alencastre): Cénit de la poesía quechua moderna con Taki parwa"
                ),
                formulas = listOf(
                    "\\text{El pez de oro} = \\text{Mito Andino (Titicaca)} + \\text{Filosofía Telúrica} + \\text{Vanguardia Lingüística}",
                    "\\text{Grupo Orkopata} \\to \\text{Puno: Polo Cultural Continental del Indigenismo Vanguardista}"
                ),
                formulaName = "Cosmovisión del Sur Andino",
                formulaLatex = "\\text{Gamaliel Churata} \\implies \\text{Descolonización del Pensamiento} \\oplus \\text{Pez de Oro (Alma Andina)}",
                formulaDescription = "Revolución filosófica y literaria andina nacida a orillas del lago sagrado Titicaca.",
                admissionTip = "Gamaliel Churata es el seudónimo literario de Arturo Peralta; su obra cumbre es 'El pez de oro' (1957).",
                admissionExplanation = "• El 'Boletín Titikaka' fue una de las revistas culturales más influyentes de todo el continente, recibiendo colaboraciones de Vallejo, Mariátegui y Borges."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_lit_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La obra monumental publicada en 1957 por Gamaliel Churata (Arturo Peralta) que constituye una síntesis filosófica, mítica y poética de la cosmovisión quechua y aimara se titula:",
                    options = listOf("El pez de oro", "Boletín Titikaka", "Taki parwa", "Tempestad en los Andes", "El zumbayllu sagrado"),
                    correctIndex = 0,
                    explanation = "'El pez de oro' (1957) es la obra cumbre de Gamaliel Churata, considerada una de las mayores hazañas lingüísticas y filosóficas de las letras andinas.",
                    subject = "Literatura",
                    semana = 6
                ),
                Challenge(
                    id = "q_lit_t06_s04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "¿Cuál fue la emblemática publicación periódica editada en Puno por el Grupo Orkopata que articuló el movimiento vanguardista e indigenista del sur andino durante la década de 1920?",
                    options = listOf("Colónida", "Amauta", "Boletín Titikaka", "Variedades", "El Clarín del Sur"),
                    correctIndex = 2,
                    explanation = "El 'Boletín Titikaka' (1926-1930) fue el órgano central de difusión del Grupo Orkopata liderado por los hermanos Peralta en Puno.",
                    subject = "Literatura",
                    semana = 6
                )
            )
        )
    )
}
