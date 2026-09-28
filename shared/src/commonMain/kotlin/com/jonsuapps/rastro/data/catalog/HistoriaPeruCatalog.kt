package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object HistoriaPeruCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: POBLAMIENTO AMERICANO, PERIODO LÍTICO Y ARCAICO (Semana 1)
        // =========================================================================
        LessonNode(
            id = "hp_t01_s01",
            subjectId = "historia_peru",
            semana = 1,
            subtema = "1.1 Teorías Científicas del Poblamiento Americano",
            title = "Teorías Científicas del Poblamiento Americano",
            theory = LessonTheory(
                id = "theory_hp_t01_s01",
                asignatura = "Historia del Perú",
                semana = 1,
                titulo = "Teorías Científicas del Poblamiento Americano",
                resumen = "• Hipótesis Inmigracionista Asiática (Álex Hrdlicka - Tesis Monorracial):\n  - Postula que bandas paleolíticas de cazadores siberianos cruzaron por el istmo o puente terrestre de Beringia hacia Alaska durante la glaciación de Wisconsin (Pleistoceno tardío, eustasia glacial).\n  - Pruebas antroposomáticas: mancha mongólica lumbar, pliegue mongólico ocular, cabello lisótrico y pómulos salientes.\n• Hipótesis Oceánica (Paul Rivet - Tesis Polirracial):\n  - Ruta Melanésica: Navegación transpacífica a través de la Corriente Ecuatorial Norte en piraguas de balancín. Similitudes en cráneos de Lagoa Santa (Brasil), hamacas y cerbatanas.\n  - Ruta Polinésica: Migración desde Tahití y Pascua. Similitudes culturales: horno bajo tierra (pachamanca), camote (kumara) y hachas pétreas.\n• Hipótesis Australiana (Antonio Mendes Correia):\n  - Ruta: De Australia pasando por Tasmania, islas Auckland y la Antártida hasta Tierra del Fuego, favorecida por el 'optimus climaticus' polar.\n  - Evidencias: Chozas en forma de colmena, búmeran o zumbador ceremonial y similitudes lingüísticas.\n• Teoría Autoctonista (Florentino Ameghino - Descartada):\n  - Postuló el origen en las pampas argentinas (Homus pampeanus) en la era Terciaria. Hrdlicka demostró que los fósiles eran de primates platirrinos y humanos modernos del Cuaternario.",
                conceptosClave = listOf(
                    "Teoría Asiática de Hrdlicka: ruta principal por el istmo de Beringia durante la glaciación de Wisconsin",
                    "Teoría Oceánica de Rivet: aportes melanésicos y polinésicos transpacíficos",
                    "Teoría Australiana de Mendes Correia: ruta antártica con el optimus climaticus",
                    "Refutación definitiva del autoctonismo de Ameghino por estratigrafía geológica errónea"
                ),
                formulas = listOf(
                    "\\text{Glaciación de Wisconsin} \\implies \\text{Eustasia glacial} \\implies \\text{Puente de Beringia}",
                    "\\text{Origen Alóctono} = \\text{Homo sapiens cazador-recolector procedente de Asia}"
                ),
                formulaName = "Rutas del Poblamiento Americano",
                formulaLatex = "\\text{Asiática (Beringia)} + \\text{Oceánica (Melanesia/Polinesia)} + \\text{Australiana (Antártida)}",
                formulaDescription = "Matriz científica de las corrientes migratorias paleolíticas hacia el continente americano.",
                admissionTip = "La teoría asiática de Álex Hrdlicka es la mejor fundamentada geográfica y antropológicamente, pero pecó de monorracial. Paul Rivet demostró que el poblamiento fue polirracial y multicultural.",
                admissionExplanation = "• La eustasia glacial provocó un descenso del nivel del mar de aproximadamente 100 a 120 metros, dejando al descubierto una faja continental transitable llamada Beringia entre Siberia y Alaska."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El antropólogo que postuló la teoría asiática del poblamiento americano, fundamentándose en la proximidad geográfica del estrecho de Bering y en rasgos somáticos comunes como la mancha mongólica, fue:",
                    options = listOf(
                        "Paul Rivet",
                        "Florentino Ameghino",
                        "Álex Hrdlicka",
                        "Antonio Mendes Correia",
                        "Thor Heyerdahl"
                    ),
                    correctIndex = 2,
                    explanation = "Álex Hrdlicka postuló la teoría monorracial asiática, demostrando que los primeros pobladores llegaron desde Asia a través de Beringia aprovechando la última glaciación.",
                    subject = "Historia del Perú",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "hp_t01_s02",
            subjectId = "historia_peru",
            semana = 1,
            subtema = "1.2 El Periodo Lítico Andino: Cazadores y Pescadores",
            title = "El Periodo Lítico Andino: Cazadores y Pescadores",
            theory = LessonTheory(
                id = "theory_hp_t01_s02",
                asignatura = "Historia del Perú",
                semana = 1,
                titulo = "El Periodo Lítico Andino: Cazadores y Pescadores",
                resumen = "• Características Socioeconómicas del Lítico (12 000 - 6 000 a.C.):\n  - Economía depredadora o parasitaria (caza indiscriminada de megafauna pleistocénica y luego selectiva de camélidos y cérvidos, recolección y marisqueo).\n  - Organización en bandas nómades patriarcales, uso de abrigos rocosos y división sexual del trabajo.\n• Principales Sitios Arqueológicos del Lítico:\n  1. Chivateros (Valle del Chillón, Lima - Edward Lanning): Gran cantera y taller lítico de la costa peruana; preformas y lascas bifaciales.\n  2. Toquepala / Cueva del Diablo (Tacna - Bojovich y González): Primeras pinturas rupestres parietales del Perú (~7600 a.C.); representan el 'chaco' o cacería colectiva con sentido mágico-religioso.\n  3. Paiján (La Libertad - Rafael Larco Hoyle y Claude Chauchat): Puntas de proyectil lítico bifaciales con pedúnculo. Hallazgo de los restos humanos fósiles completos más antiguos del Perú (mujer y niño en posición ritual flexionada).\n  4. Lauricocha (Huánuco - Augusto Cardich): Restos óseos humanos más antiguos de la sierra peruana; primeros enterramientos rituales con ofrendas y deformaciones craneanas tabulares.\n  5. Pacaicasa (Ayacucho - MacNeish): Sus supuestas herramientas líticas son hoy catalogadas como geofactos naturales sin manufactura humana.",
                conceptosClave = listOf(
                    "Economía de subsistencia depredadora: caza, pesca y recolección",
                    "Paiján: restos humanos completos más antiguos de la costa y tradición de puntas con pedúnculo",
                    "Lauricocha: restos humanos más antiguos de la sierra y ritos funerarios",
                    "Toquepala: pinturas rupestres de cacería en chaco con función mágico-propiciatoria"
                ),
                formulas = listOf(
                    "\\text{Lítico Andino} = \\text{Bandas Nómades} + \\text{Industria Lítica} + \\text{Economía Depredadora}"
                ),
                formulaName = "Patrón Cultural del Lítico Andino",
                formulaLatex = "\\text{Caza Selectiva (Guanacos/Tarucas)} + \\text{Marisqueo (Paiján)} + \\text{Pinturas Rupestres (Toquepala)}",
                formulaDescription = "Modo de producción primitivo andino adaptado a los pisos ecológicos de costa y sierra.",
                admissionTip = "Ten muy claro: los restos fósiles humanos COMPLETOS más antiguos del Perú corresponden a PAIJÁN (costa norte). Los restos de la SIERRA más antiguos corresponden a LAURICOCHA.",
                admissionExplanation = "• En Toquepala, los cazadores pintaban animales heridos o acorralados antes de la jornada cinegética porque creían que capturar el alma del animal en la pared de la cueva garantizaba su captura física en la caza."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el periodo Lítico andino, el sitio arqueológico de la costa norte donde se hallaron los restos óseos humanos completos más antiguos del territorio peruano y una típica tradición de puntas pedunculares es:",
                    options = listOf(
                        "Lauricocha",
                        "Chivateros",
                        "Paiján",
                        "Toquepala",
                        "Guitarrero I"
                    ),
                    correctIndex = 2,
                    explanation = "En Paiján (valle de Chicama, La Libertad), Claude Chauchat y Rafael Larco descubrieron los restos humanos fósiles completos más antiguos del Perú (unos 8000 a.C.), junto a puntas líticas pedunculares bifaciales.",
                    subject = "Historia del Perú",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "hp_t01_s03",
            subjectId = "historia_peru",
            semana = 1,
            subtema = "1.3 Periodo Arcaico Inferior: Horticultura y Pastoreo",
            title = "Periodo Arcaico Inferior: Horticultura y Pastoreo Incipiente",
            theory = LessonTheory(
                id = "theory_hp_t01_s03",
                asignatura = "Historia del Perú",
                semana = 1,
                titulo = "Periodo Arcaico Inferior: Horticultura y Pastoreo Incipiente",
                resumen = "• Características del Arcaico Inferior o Temprano (6000 - 3000 a.C.):\n  - Contexto climático: Inicio del Holoceno (calentamiento global, retroceso glacial, extinción de la megafauna pleistocénica).\n  - Economía productiva incipiente: Horticultura (cultivo inicial en huertos) y pastoreo o domesticación selectiva de camélidos (llamas y alpacas).\n  - Hábitat: Semisedentarismo; primeros campamentos semipermanentes y aldeas estacionales agrupadas en clanes.\n• Principales Yacimientos del Arcaico Inferior:\n  1. Nanchoc (Alto Zaña, Cajamarca - Tom Dillehay): Primer horticultor del Perú y de América (~8000 a.C.). Cultivo de calabazas, maní, ají y quinua mediante acequias primitivas.\n  2. Guitarrero II (Callejón de Huaylas, Áncash - Thomas Lynch): Evidencias tempranas de cultivo de frejol, pallar, ají y lúcuma.\n  3. Telarmachay (San Pedro de Cajas, Junín - Danièle Lavallée): Primer domesticador de camélidos sudamericanos (llamas y alpacas); restos de corrales y huesos de neonatos.\n  4. Santo Domingo o Paracas (Ica - Frédéric Engel): Aldea de pescadores y horticultores; primera flauta de hueso de pelícano (músico más antiguo) y red de pescar de fibra vegetal de cactus.\n  5. Chilca (Lima - Frédéric Engel): Choza cónica de totora y ramas; horticultores de camote y domesticación del perro andino.",
                conceptosClave = listOf(
                    "Transición climática Holocénica: inicio de la producción de alimentos",
                    "Nanchoc como el horticultor más antiguo de América (calabazas y maní)",
                    "Telarmachay: primer domesticador de camélidos en los Andes centrales",
                    "Santo Domingo: primeros instrumentos musicales y aldea costera"
                ),
                formulas = listOf(
                    "\\text{Holoceno} \\implies \\text{Revolución Agropecuaria Incipiente} \\implies \\text{Semisedentarismo}"
                ),
                formulaName = "Transformación Económica del Arcaico Inferior",
                formulaLatex = "\\text{Horticultura (Nanchoc)} + \\text{Pastoreo (Telarmachay)} \\to \\text{Aldeas Semisedentarias}",
                formulaDescription = "Paso gradual de la depredación a la producción temprana de alimentos en el Perú.",
                admissionTip = "Históricamente se consideraba a Guitarrero como el horticultor más antiguo, pero las investigaciones radiocarbónicas de Tom Dillehay en Nanchoc (Cajamarca) probaron que sus cultivos datan de unos 8000 a.C., convirtiéndolo en el pionero de América.",
                admissionExplanation = "• En Telarmachay, el análisis tafonómico demostró una mortalidad altísima de camélidos recién nacidos encerrados en corrales, lo que prueba la domesticación zootécnica deliberada y no la simple caza."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el valle del alto Zaña (Cajamarca), el arqueólogo Tom Dillehay excavó el sitio de Nanchoc, el cual posee una relevancia fundamental en la arqueología americana porque evidencia:",
                    options = listOf(
                        "La domesticación más remota del maíz y la papa en el altiplano",
                        "Los primeros vestigios de horticultura de calabaza y maní en América",
                        "Las primeras construcciones urbanas con pirámides escalonadas",
                        "La primera orfebrería de oro laminado y cobre martillado",
                        "El taller lítico con herramientas bifaciales más grande de la costa"
                    ),
                    correctIndex = 1,
                    explanation = "Nanchoc (Cajamarca) contiene restos de calabazas (moschata) y maní cultivados hacia el 8000 a.C., por lo que es considerado el primer horticultor de América.",
                    subject = "Historia del Perú",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "hp_t01_s04",
            subjectId = "historia_peru",
            semana = 1,
            subtema = "1.4 Periodo Arcaico Superior: Caral y Centros Ceremoniales",
            title = "Periodo Arcaico Superior: Revolución Agrícola y Civilización de Caral",
            theory = LessonTheory(
                id = "theory_hp_t01_s04",
                asignatura = "Historia del Perú",
                semana = 1,
                titulo = "Periodo Arcaico Superior: Revolución Agrícola y Civilización de Caral",
                resumen = "• Características del Arcaico Superior o Tardío (3000 - 1800 a.C.):\n  - Revolución agropecuaria andina: Agricultura desarrollada (algodón, maíz, frijol) e irrigación.\n  - Sedentarismo pleno y ayllus como organización comunitaria fundamental.\n  - Arquitectura monumental ceremonial precerámica (plazas circulares hundidas, pirámides truncas escalonadas, fogones con conductos de ventilación subterránea para combustión completa).\n  - Surgimiento de la teocracia: Sacerdotes astrónomos que centralizan el excedente productivo y dirigen la fuerza laboral comunal.\n• Principales Yacimientos del Arcaico Superior:\n  1. Caral (Valle de Supe, Barranca - Ruth Shady):\n     - Considerada la civilización más antigua de América (~3000 a.C.), contemporánea de Egipto y Mesopotamia.\n     - Arquitectura pública piramidal, plazas circulares hundidas, uso de 'shicras' (bolsas de fibra vegetal con piedras para resistencia antisísmica).\n     - Quipus tempranos, 32 flautas traversas de hueso de pelícano, estatuillas antropomorfas de arcilla no cocida y ausencia de murallas o armas bélicas (sociedad pacífica de intercambio interregional).\n  2. Kotosh / Fase Mito (Huánuco - Seichi Izumi):\n     - Templo de las Manos Cruzadas: Primera escultura religiosa en relieve de América (brazos cruzados en arcilla bajo un nicho sagrado).\n  3. Huaca Prieta (Chicama, La Libertad - Junius Bird):\n     - Primer textil precerámico de algodón con diseño iconográfico de un cóndor andino con una serpiente en sus entrañas; mates pirograbados con rostros antropomorfos felínicos.\n  4. Áspero (Supe - Shady): Puerto pesquero articulado económicamente a Caral.",
                conceptosClave = listOf(
                    "Revolución urbana y surgimiento de la teocracia en los Andes centrales",
                    "Caral: civilización prístina más antigua de América con plazas circulares y shicras",
                    "Kotosh: Templo de las Manos Cruzadas y arquitectura ritual con fogón central",
                    "Huaca Prieta: tejidos de algodón pirograbados y mates antes del uso de la cerámica"
                ),
                formulas = listOf(
                    "\\text{Excedente Agrícola (Algodón)} + \\text{Intercambio Pesquero (Anchoveta)} \\implies \\text{Estado Prístino (Caral)}"
                ),
                formulaName = "Modelo de Surgimiento de la Civilización Andina",
                formulaLatex = "\\text{Agricultura Sedentaria} \\to \\text{Teocracia} \\to \\text{Arquitectura Monumental (Caral)}",
                formulaDescription = "Aparición del Estado y la planificación urbana monumental sin la existencia de alfarería (cerámica).",
                admissionTip = "Caral pertenece al Arcaico Superior o PRECERÁMICO TARDÍO. Sus constructores no conocían la cerámica ni la orfebrería, pero ya dominaban la ingeniería antisísmica con shicras y la astronomía monumental.",
                admissionExplanation = "• Las 'shicras' eran bolsas tejidas con fibras de junco o totora rellenas de rocas pesadas, empleadas en las plataformas piramidales de Caral para otorgar elasticidad y disipar las ondas sísmicas durante los terremotos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La civilización de Caral, descubierta y puesta en valor por la arqueóloga Ruth Shady en el valle de Supe, revolucionó la historiografía andina al demostrar que:",
                    options = listOf(
                        "La cerámica polícroma y la metalurgia nacieron en la costa central peruana",
                        "El origen de la civilización y del Estado en América tiene una antigüedad de 5000 años, equivalente a Mesopotamia y Egipto",
                        "Los primeros pobladores de América ingresaron navegando por la corriente de Humboldt desde Oceanía",
                        "El Imperio Wari se expandió militarmente construyendo murallas defensivas en el valle de Supe",
                        "Los reinos aimaras dominaron la agricultura intensiva de camellones antes de la llegada de los incas"
                    ),
                    correctIndex = 1,
                    explanation = "Caral demostró que la civilización urbana y el Estado teocrático surgieron en los Andes hacia el 3000 a.C. en el Periodo Precerámico Tardío, convirtiéndola en el foco civilizatorio prístino más antiguo de América.",
                    subject = "Historia del Perú",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: ALTAS CULTURAS PREÍNCAS: HORIZONTES E INTERMEDIOS (Semana 2)
        // =========================================================================
        LessonNode(
            id = "hp_t02_s01",
            subjectId = "historia_peru",
            semana = 2,
            subtema = "2.1 El Formativo Andino y Chavín: Primer Horizonte Panandino",
            title = "El Formativo Andino y Chavín: Primer Horizonte Panandino",
            theory = LessonTheory(
                id = "theory_hp_t02_s01",
                asignatura = "Historia del Perú",
                semana = 2,
                titulo = "El Formativo Andino y Chavín: Primer Horizonte Panandino",
                resumen = "• Periodización de John Rowe:\n  - Horizontes: Etapas de unificación estilística panandina (Chavín, Wari, Inca).\n  - Intermedios: Épocas de fragmentación, autonomía y desarrollos regionales artesanos.\n• Cultura Chavín (1200 - 200 a.C., Callejón de Conchucos, Áncash):\n  - Descubierta por Julio C. Tello ('Cultura Matriz del Perú Antiguo', teoría autoctonista de origen amazónico arawak).\n  - Estado Teocrático Sacerdotal: Gobernado por una casta sacerdotal que dominaba el calendario astronómico-agrícola y ejercía control mediante el terror ideológico religioso.\n  - Centro Ceremonial de Chavín de Huántar: En la confluencia de los ríos Mosna y Huachecsa. Canales subterráneos acústicos que imitaban bramidos de felinos para impresionar a los peregrinos.\n  - Escultura Lítica Monumental:\n    * Lanzón Monolítico: Dios Jaguar antropomorfo en el corazón del Templo Viejo.\n    * Estela de Raimondi: Dios de los Báculos o de las Varas con tocado de serpientes y ojos desorbitados.\n    * Obelisco Tello: Caicos míticos (caimanes de la selva) asociados a la fertilidad vegetal.\n    * Cabezas Clavas: Guardianes del templo con rostros de sacerdotes en trance alucinógeno con el cactus San Pedro.\n  - Cerámica: Monócroma (gris o negro azabache), incisa, de base plana y gollete estribo grueso con labio evertido.",
                conceptosClave = listOf(
                    "Esquema de John Rowe: Horizontes Panandinos vs Intermedios Regionales",
                    "Chavín como 'Cultura Matriz' y primera síntesis cultural panandina (Horizonte Temprano)",
                    "Teocracia represiva y manipulación del miedo religioso",
                    "Escultura lítica de la trilogía sagrada: felino, cóndor y serpiente"
                ),
                formulas = listOf(
                    "\\text{Horizontes Panandinos} = \\text{Chavín (Temprano)} \\to \\text{Wari (Medio)} \\to \\text{Inca (Tardío)}"
                ),
                formulaName = "Eje Cronológico de Integración Andina",
                formulaLatex = "\\text{Chavín} \\implies \\text{Difusión del Culto al Dios Felino en toda el área andina}",
                formulaDescription = "Unificación religiosa y tecnológica que integró costa, sierra y ceja de selva.",
                admissionTip = "Recuerda que en la Estela de Raimondi se plasmó por primera vez al 'Dios de los Báculos' o de las Varas, divinidad que reaparecerá mil años después en la Portada del Sol de Tiahuanaco y en Wari.",
                admissionExplanation = "• Las galerías subterráneas de Chavín fueron diseñadas con canales hidráulicos que, al dejar pasar el agua en época de crecidas, generaban un estruendo ensordecedor similar al rugido de un jaguar para intimidar a los fieles."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la periodización de las civilizaciones andinas propuesta por John Rowe, la cultura Chavín es clasificada dentro del Horizonte Temprano debido fundamentalmente a:",
                    options = listOf(
                        "Su carácter de imperio militar que conquistó por la fuerza las cuencas de la costa sur",
                        "La difusión panandina de su estilo artístico, patrones arquitectónicos y culto religioso teocrático",
                        "El perfeccionamiento de la orfebrería de oro laminado y bronce en Chan Chan",
                        "La construcción de una red de caminos imperiales articulada desde la ciudad de Viñaque",
                        "La invención del sistema de camellones o waru waru para controlar las heladas puneñas"
                    ),
                    correctIndex = 1,
                    explanation = "Un Horizonte cultural representa un periodo de difusión e influencia macro-regional panandina; Chavín expandió sus patrones religiosos, iconografía de la trilogía sagrada y cerámica ceremonial por casi todo el Perú.",
                    subject = "Historia del Perú",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "hp_t02_s02",
            subjectId = "historia_peru",
            semana = 2,
            subtema = "2.2 La Cultura Paracas: Medicina, Sociedad y Textilería",
            title = "La Cultura Paracas: Medicina, Sociedad y Textilería",
            theory = LessonTheory(
                id = "theory_hp_t02_s02",
                asignatura = "Historia del Perú",
                semana = 2,
                titulo = "La Cultura Paracas: Medicina, Sociedad y Textilería",
                resumen = "• Cultura Paracas (700 a.C. - 200 d.C., Península de Paracas, Pisco, Ica):\n  - Descubierta por Julio C. Tello y Toribio Mejía Xesspe.\n  - Dos Fases Históricas Fundamentales:\n    1. Paracas Cavernas (Cerro Colorado, Tajahuana):\n       * Tumbas subterráneas comunitarias en forma de botella o copa invertida (hasta 6 metros de profundidad).\n       * Alta influencia religiosa de Chavín (cerámica polícroma poscocción con pintura resinosa y figuras felínicas).\n       * Cirugía craneana avanzada: Trepanaciones craneanas con cuchillos de obsidiana (*tumi*) y placas de oro/plata para curar traumatismos de guerra y cefaleas, con supervivencia comprobada por la regeneración ósea del callo.\n    2. Paracas Necrópolis (Wari Kayan):\n       * Cementerios rectangulares semisubterráneos donde se sepultaba a la nobleza teocrática militar en fardos funerarios cónicos.\n       * Autonomía cultural respecto a Chavín (cerámica monócroma precocción en forma de calabaza).\n       * Máximo esplendor textil: Los 'Mantos de la Paracas Necrópolis', tejidos en algodón y lana de vicuña/alpaca con tintes indelebles (más de 190 matices de origen vegetal y mineral) con figuras mitológicas (el Ser Oculado).\n       * Deformaciones craneanas intencionales (alargamiento mediante tablillas y almohadillas) como símbolo de distinción estamental de la élite.",
                conceptosClave = listOf(
                    "Fase Cavernas: tumbas en copa invertida, trepanaciones craneanas y cerámica poscocción",
                    "Fase Necrópolis: fardos funerarios rectangulares, mantos textiles polícromos de alta tecnología",
                    "Deformaciones craneanas como mecanismo de diferenciación social y de linaje",
                    "Transición del Horizonte Temprano al Intermedio Temprano en la costa sur"
                ),
                formulas = listOf(
                    "\\text{Paracas Cavernas} = \\text{Trepanaciones} + \\text{Copa Invertida} + \\text{Poscocción (Chavinoide)}",
                    "\\text{Paracas Necrópolis} = \\text{Mantos Funerarios} + \\text{Cámaras Rectangulares} + \\text{Precocción}"
                ),
                formulaName = "Dicotomía Evolutiva de Paracas",
                formulaLatex = "\\text{Cavernas (Influencia Chavín)} \\to \\text{Necrópolis (Autonomía e inicio de Nazca)}",
                formulaDescription = "Evolución tecnológica y funeraria de la sociedad paracas descubierta por Julio C. Tello.",
                admissionTip = "No confundas trepanación craneana (operación quirúrgica para sanar heridas o retirar esquirlas óseas) con deformación craneana (modificación estética y de estatus nobiliario aplicada en la niñez).",
                admissionExplanation = "• Las trepanaciones paracas contaban con anestésicos naturales como la chicha de jora y la hoja de coca, y antisépticos a base de plantas y resinas tánicas; el éxito de la intervención se verifica al hallar cráneos con bordes óseos cicatrizados."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante la fase Paracas Necrópolis, la élite gobernante destacó a nivel mundial por el desarrollo de una avanzada tecnología material evidenciada principalmente en:",
                    options = listOf(
                        "Las tumbas subterráneas comunitarias excavadas en forma de copa invertida",
                        "Los mantos funerarios polícromos elaborados con lana de camélido, algodón y tintes indelebles",
                        "La cerámica escultórica con huacos retratos que documentaban estados psicológicos",
                        "Las cabezas clavas empotradas en los muros exteriores del templo de Wari Kayan",
                        "Los acueductos subterráneos filtrantes denominados puquios para el riego desértico"
                    ),
                    correctIndex = 1,
                    explanation = "La fase Paracas Necrópolis es célebre por sus extraordinarios mantos funerarios polícromos, considerados cumbres del arte textil universal por su finura, complejidad técnica y perennidad cromática.",
                    subject = "Historia del Perú",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "hp_t02_s03",
            subjectId = "historia_peru",
            semana = 2,
            subtema = "2.3 El Intermedio Temprano: Maestros Artesanos (Moche y Nazca)",
            title = "El Intermedio Temprano: Maestros Artesanos (Moche y Nazca)",
            theory = LessonTheory(
                id = "theory_hp_t02_s03",
                asignatura = "Historia del Perú",
                semana = 2,
                titulo = "El Intermedio Temprano: Maestros Artesanos (Moche y Nazca)",
                resumen = "• Periodo de los Desarrollos Regionales o Maestros Artesanos (200 a.C. - 600 d.C.):\n• Cultura Mochica (Costa Norte - Valle de Moche, Chicama, Virú; Max Uhle y Larco Hoyle):\n  - Organización Política: Teocracia militar de señoríos confederados gobernados por el Cie-quich (gobernante supremo militar) y el Alaec (curaca local).\n  - Religión y Sacrificios: Culto a Ai Apaec (el degollador o decapitador). Murales policromados de la Huaca de la Luna (rebelión de los artefactos).\n  - Ingeniería Hidráulica: Superaron la aridez desértica mediante canales monumentales (canal de La Cumbre, acueducto de Ascope) y la represa de San José.\n  - Cerámica Bícroma (blanco crema y rojo ocre): Escultórica, realista y documental. Huacos retratos (expresiones anímicas), huacos eróticos (fertilidad) y patológicos (enfermedades).\n  - Élite y Arqueología: Tumba intacta del Señor de Sipán (Walter Alva en Huaca Rajada, Lambayeque) y la Dama de Cao (régimen teocrático femenino en El Brujo).\n• Cultura Nazca (Costa Sur - Valle de Ica y Río Grande; Max Uhle):\n  - Capital y Centro Ceremonial: Cahuachi (ciudad de adobe más grande del sur).\n  - Cerámica Pictórica y Polícroma: Hasta 16 colores y 280 matices; técnica del 'horror al vacío' (toda la vasija pintada sin espacios en blanco) y gollete puente con dos picos.\n  - Obras Hidráulicas: Acueductos y galerías subterráneas filtrantes (puquios de Cantalloc) que aprovechaban las capas freáticas.\n  - Geoglifos de las Pampas de Jumana y Palpa: Descubiertos por Toribio Mejía Xesspe y estudiados por María Reiche (interpretados como un gigantesco calendario astronómico-agrícola).",
                conceptosClave = listOf(
                    "Moche: cerámica escultórica realista bícroma y señoríos militaristas (Sipán y Dama de Cao)",
                    "Canales de Ascope y La Cumbre como base del poder agrícola mochica",
                    "Nazca: cerámica pictórica polícroma con 'horror al vacío' y centro ceremonial de Cahuachi",
                    "Geoglifos de las pampas de Nazca y puquios subterráneos filtrantes"
                ),
                formulas = listOf(
                    "\\text{Intermedio Temprano} = \\text{Moche (Escultura Bícroma)} + \\text{Nazca (Pintura Polícroma + Puquios)}"
                ),
                formulaName = "Comparativa Moche vs. Nazca",
                formulaLatex = "\\text{Moche (Realismo Tridimensional)} \\quad \\longleftrightarrow \\quad \\text{Nazca (Abstracción Polícroma Plana)}",
                formulaDescription = "Diferenciación estética y tecnológica de los dos grandes maestros artesanos del periodo clásico andino.",
                admissionTip = "Mientras Moche destacó por su cerámica ESCULTÓRICA realista (huacos retratos), Nazca destacó por su cerámica PICTÓRICA polícroma plana con técnica del horror al vacío.",
                admissionExplanation = "• La Dama de Cao (Huaca Cao Viejo) demostró que las mujeres de la élite mochica ejercían el poder político, militar y ceremonial supremo, desvirtuando la creencia de que el gobierno era estrictamente patriarcal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La cultura Nazca logró florecer en uno de los desiertos más áridos del litoral peruano gracias a la invención y aplicación de una avanzada tecnología hidráulica basada en:",
                    options = listOf(
                        "Las represas de gran altitud construidas con sillar volcánico",
                        "Los acueductos y galerías filtrantes subterráneas conocidos como puquios",
                        "Los camellones o campos elevados rodeados por zanjas de agua",
                        "Los canales de regadío tallados en la roca viva de la cordillera",
                        "Las terrazas agrícolas escalonadas con muros de contención"
                    ),
                    correctIndex = 1,
                    explanation = "Los nazcas construyeron puquios o galerías filtrantes subterráneas empedradas (como Cantalloc) para captar aguas de las napas freáticas subterráneas y conducirlas por gravedad a la superficie agrícola.",
                    subject = "Historia del Perú",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "hp_t02_s04",
            subjectId = "historia_peru",
            semana = 2,
            subtema = "2.4 Horizonte Medio (Wari y Tiahuanaco) e Intermedio Tardío",
            title = "Horizonte Medio (Tiahuanaco y Wari) e Intermedio Tardío (Chimú y Chincha)",
            theory = LessonTheory(
                id = "theory_hp_t02_s04",
                asignatura = "Historia del Perú",
                semana = 2,
                titulo = "Horizonte Medio (Tiahuanaco y Wari) e Intermedio Tardío (Chimú y Chincha)",
                resumen = "• Cultura Tiahuanaco (Altiplano del Collao - Bolivia y Perú; Pedro Cieza de León):\n  - Estado Colonizador Teocrático: Control vertical de pisos ecológicos mediante el sistema de 'archipiélagos ecológicos' (John Murra) para autoabastecerse de maíz, coca y ají.\n  - Tecnología Agrícola: Waru waru o camellones (plataformas elevadas rodeadas de agua que actúan como termorreguladores contra las heladas nocturnas) y deshidratación de alimentos (chuño y charqui).\n  - Arquitectura y Escultura: Kalasasaya, Templete Semisubterráneo, Portada del Sol (Dios de los Báculos o Dios Llorón) y vasos ceremoniales de madera o arcilla (Keros).\n• Imperio Wari (Horizonte Medio, 600 - 1000 d.C.; Luis G. Lumbreras):\n  - Considerado el PRIMER IMPERIO PANANDINO. Fusión cultural de tres matrices: Huarpa (ayacuchana, base demográfica), Nazca (urbanismo y policromía) y Tiahuanaco (religión y culto al Dios de los Báculos).\n  - Revolución Urbana y Centralización: Capital imperial en Viñaque (Ayacucho). Control militar y administrativo mediante cabeceras de región amuralladas (Piquillacta en Cusco, Huiracochapampa en La Libertad, Cajamarquilla y Pachacámac en Lima) unidas por la red vial de caminos preincaicos.\n• Intermedio Tardío (Reinos y Señoríos, 1000 - 1470 d.C.):\n  - Chimú (Costa Norte): Fundado míticamente por Tacaynamo. Capital en Chan Chan (ciudad de adobe más grande de América). Máximos orfebres precolombinos (Tumi de oro o cuchillo de Íllimo). Conquistados por Túpac Yupanqui.\n  - Chincha (Costa Sur): Gran potencia comercial marítima en balsas de totora y comercio triangular con el Collao y Ecuador (conchas de Spondylus o *mullu*).",
                conceptosClave = listOf(
                    "Tiahuanaco: control vertical de pisos ecológicos y camellones (waru waru) contra heladas",
                    "Wari como el primer imperio panandino planificador con ciudades cabeceras de región",
                    "Chimú: orfebrería de oro/plata y ciudadela de adobe de Chan Chan",
                    "Chincha: talasocracia y comercio triangular con el Spondylus"
                ),
                formulas = listOf(
                    "\\text{Síntesis Wari} = \\text{Huarpa (Base)} + \\text{Nazca (Ciudad)} + \\text{Tiahuanaco (Dios de las Varas)}",
                    "\\text{Tiahuanaco} \\implies \\text{Control Vertical de Pisos Ecológicos (John Murra)}"
                ),
                formulaName = "Fórmulas de Integración del Horizonte Medio",
                formulaLatex = "\\text{Wari (Primer Imperio Militar Urbano)} \\quad \\longleftrightarrow \\quad \\text{Tiahuanaco (Estado Colonizador)}",
                formulaDescription = "Modelos sociopolíticos de expansión durante el Segundo Horizonte andino.",
                admissionTip = "Wari es catalogado por Luis G. Lumbreras como el PRIMER IMPERIO andino debido a su ejército profesional, su red vial centralizada y sus ciudades satélites amuralladas (cabeceras de región).",
                admissionExplanation = "• Las cabeceras de región wari funcionaban como centros de acopio tributario y cuarteles militares permanentes que subordinaban a las etnias locales y homogeneizaban la administración andina."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La cultura Wari es reconocida en la historia prehispánica del Perú como el primer imperio panandino debido a que logró articular el espacio andino mediante:",
                    options = listOf(
                        "Una confederación democrática de señoríos agropecuarios autónomos",
                        "Una red centralizada de ciudades cabeceras de región interconectadas por caminos y guarniciones militares",
                        "El monopolio marítimo exclusivo del intercambio comercial de conchas de Spondylus",
                        "La colonización pacífica de islas de recursos ecológicos en la cuenca del Titicaca",
                        "La imposición forzosa de la lengua puquina y el culto solar incaico"
                    ),
                    correctIndex = 1,
                    explanation = "Wari consolidó el primer imperio andino al construir centros administrativos provinciales amurallados (cabeceras de región como Piquillacta y Huiracochapampa) conectados por un sistema vial para recaudar tributos.",
                    subject = "Historia del Perú",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: EL TAHUANTINSUYO: EXPANSIÓN, ORGANIZACIÓN Y CAÍDA (Semana 3)
        // =========================================================================
        LessonNode(
            id = "hp_t03_s01",
            subjectId = "historia_peru",
            semana = 3,
            subtema = "3.1 Orígenes, Dinastías y Expansión Imperial Incaica",
            title = "Orígenes, Dinastías y Expansión Imperial Incaica",
            theory = LessonTheory(
                id = "theory_hp_t03_s01",
                asignatura = "Historia del Perú",
                semana = 3,
                titulo = "Orígenes, Dinastías y Expansión Imperial Incaica",
                resumen = "• Orígenes Míticos e Históricos:\n  - Mitos: Lago Titicaca (Manco Cápac y Mama Ocllo, recopilado por el Inca Garcilaso de la Vega) y Hermanos Áyar (Pacaritambo, recopilado por Juan de Betanzos).\n  - Origen Histórico: Migración de etnias puquinas-tiahuanacotas desplazadas del Altiplano tras la invasión de los reinos aimaras, estableciéndose en el valle de Acamama (Cusco).\n• Fases de la Historia Inca:\n  1. Periodo Curacal o Legendario (Manco Cápac y Sinchi Roca).\n  2. Periodo Confederativo o Regional (Lloque Yupanqui a Huiracocha).\n  3. Periodo Imperial o del Tahuantinsuyo (1438 - 1532):\n     * Pachacútec (Cusi Yupanqui): Vencedor de los chancas en la batalla de Yahuarpampa (1438). Fundó la etapa imperial, reedificó el Cusco en forma de puma, mandó erigir Sacsayhuamán y Machu Picchu, implantó el quechua (Runa Simi) como idioma oficial y adoptó el sistema decimal.\n     * Túpac Inca Yupanqui ('El Alejandro Magno de América'): Mayor conquistador militar; expandió el imperio por el sur hasta el río Maule (Chile) y Tucumán (Argentina), y por el norte sometió al reino Chimú.\n     * Huayna Cápac: Llevó los límites septentrionales hasta el río Ancasmayo (Pasto, Colombia). Su muerte por viruela desató la guerra de sucesión fratricida entre Huáscar y Atahualpa.",
                conceptosClave = listOf(
                    "Origen puquina histórico frente a las narrativas míticas cusqueñas",
                    "Victoria de Pachacútec sobre los chancas (1438) como hito fundacional del Imperio",
                    "Túpac Yupanqui como el más grande conquistador territorial del Tawantinsuyu",
                    "Huayna Cápac y la máxima expansión territorial antes de la crisis fratricida"
                ),
                formulas = listOf(
                    "\\text{Fase Imperial} = \\text{Pachacútec (Organizador)} + \\text{Túpac Yupanqui (Conquistador)} + \\text{Huayna Cápac (Apogeo)}"
                ),
                formulaName = "Tríada de los Incas Históricos Imperiales",
                formulaLatex = "\\text{Batalla de Yahuarpampa (1438)} \\implies \\text{Paso de Señorío Cusqueño a Imperio del Tawantinsuyu}",
                formulaDescription = "Ruptura histórica que dio origen al Tercer Horizonte Panandino.",
                admissionTip = "Recuerda que la guerra contra los chancas marca la división entre los Incas legendarios y los Incas históricos. Con Pachacútec nace formalmente el Tawantinsuyu.",
                admissionExplanation = "• Pachacútec reorganizó además el sistema de 'panacas' reales (familias de descendientes directos de cada soberano difunto encargadas de cuidar su momia o *mallqui* y administrar sus bienes agrícolas)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El soberano cusqueño que lideró la resistencia ante la invasión chanca en la batalla de Yahuarpampa (1438), inaugurando la fase imperial del Tawantinsuyu, fue:",
                    options = listOf(
                        "Manco Cápac",
                        "Huayna Cápac",
                        "Pachacútec",
                        "Túpac Inca Yupanqui",
                        "Inca Roca"
                    ),
                    correctIndex = 2,
                    explanation = "Pachacútec (originalmente el príncipe Cusi Yupanqui) asumió la defensa del Cusco ante la huida de su padre Huiracocha, venció a los chancas e inició las reformas que transformaron el curacazgo en el gran Imperio del Tahuantinsuyo.",
                    subject = "Historia del Perú",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "hp_t03_s02",
            subjectId = "historia_peru",
            semana = 3,
            subtema = "3.2 Organización Política y Territorial del Tahuantinsuyo",
            title = "Organización Política y Territorial del Tahuantinsuyo",
            theory = LessonTheory(
                id = "theory_hp_t03_s02",
                asignatura = "Historia del Perú",
                semana = 3,
                titulo = "Organización Política y Territorial del Tahuantinsuyo",
                resumen = "• Estructura Territorial (Tawantinsuyu: Las cuatro regiones cardinales unidas por el Cusco, el 'ombligo del mundo'):\n  1. Chinchaysuyu: Noroeste, costa y sierra norte; el más poblado, fértil y de mayor riqueza artesanal.\n  2. Collasuyu: Sureste, meseta del Collao; el más extenso territorialmente, centro de pastoreo de camélidos.\n  3. Antisuyu: Noreste, flanco oriental selvático; fuente de madera, coca, plumas y plantas medicinales.\n  4. Contisuyu: Suroeste, costa y sierra sur (Arequipa, Moquegua, Tacna); el más pequeño en extensión.\n• Jerarquía del Poder Político:\n  - El Sapa Inca: Monarca absoluto de origen divino (Hijo del Sol o Intichuri), concentraba poderes políticos, religiosos y militares.\n  - El Auqui: Príncipe heredero seleccionado por sus méritos bélicos y administrativos; ejercía el correinado con el Inca.\n  - El Tahuantinsuyo Camachic: Consejo Imperial integrado por los cuatro Suyuyuc Apu o Apocunas (gobernadores de cada suyo).\n  - El Apunchic o Cápac Apu: Gobernador político-militar de una provincia (*wamani*).\n  - El Tucuyricuy ('el que todo lo ve'): Inspector y visitador imperial itinerante; administraba justicia local (*taripa camayoc*) y celebraba matrimonios (*huarmicoco*); dependía directamente del Sapa Inca.\n  - El Curaca: Jefe étnico tradicional del ayllu; nexo intermediario entre el Estado incaico y los hatunrunas; en tiempos de guerra tomaba el nombre de Sinchi.",
                conceptosClave = listOf(
                    "Cuatro Suyus: Chinchaysuyu, Collasuyu, Antisuyu y Contisuyu",
                    "Institución del Correinado del Auqui para garantizar la sucesión pacífica",
                    "El Tucuyricuy como supervisor fiscal, judicial y administrativo imperial",
                    "El Curaca como bisagra mediadora entre el Estado redistribuidor y las comunidades"
                ),
                formulas = listOf(
                    "\\text{Jerarquía Política} = \\text{Inca} \\to \\text{Tahuantinsuyo Camachic} \\to \\text{Apunchic} \\to \\text{Tucuyricuy} \\to \\text{Curaca}"
                ),
                formulaName = "Estructura Piramidal del Estado Inca",
                formulaLatex = "\\text{Cusco} = \\text{Chinchaysuyu} + \\text{Collasuyu} + \\text{Antisuyu} + \\text{Contisuyu}",
                formulaDescription = "Distribución territorial y centralización administrativa imperial.",
                admissionTip = "El Tucuyricuy dependía directamente del Inca y no del gobernador provincial (Apunchic), asegurando una fiscalización imparcial de la administración pública y de la recaudación de tributos.",
                admissionExplanation = "• Los curacas que colaboraban con el Inca recibían regalos de prestigio (vajilla, ropa de cumbi, esposas secundarias) a cambio de movilizar la mano de obra del ayllu para las mitas estatales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el organigrama del Estado incaico, el funcionario itinerante que cumplía el papel de 'ojos y oídos del Inca', recorriendo secretamente las provincias para fiscalizar a los curacas y administrar justicia, era el:",
                    options = listOf(
                        "Apunchic",
                        "Suyuyuc Apu",
                        "Tucuyricuy",
                        "Auqui",
                        "Quipucamayoc"
                    ),
                    correctIndex = 2,
                    explanation = "El Tucuyricuy era el supervisor imperial comisionado por el Sapa Inca para inspeccionar el cumplimiento de las leyes, supervisar los depósitos (colcas) y recaudar el tributo laboral en las provincias.",
                    subject = "Historia del Perú",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "hp_t03_s03",
            subjectId = "historia_peru",
            semana = 3,
            subtema = "3.3 Economía y Trabajo: Ayllu, Reciprocidad y Mita",
            title = "Economía y Trabajo: Ayllu, Reciprocidad y Mita",
            theory = LessonTheory(
                id = "theory_hp_t03_s03",
                asignatura = "Historia del Perú",
                semana = 3,
                titulo = "Economía y Trabajo: Ayllu, Reciprocidad y Mita",
                resumen = "• Principios Rectores de la Economía Andina:\n  - La economía inca no conoció la moneda de cambio ni el mercado de libre concurrencia; se sustentó en el control del trabajo comunitario.\n  1. Reciprocidad: Intercambio mutuo de energía laboral. Puede ser simétrica (entre miembros iguales de la comunidad) o asimétrica (entre el Estado o curaca y el ayllu).\n  2. Redistribución: Monopolio estatal de bienes. El Estado acopiaba el excedente productivo en las colcas (depósitos estatales) y lo redistribuía a poblaciones afectadas por sequías, heladas o guerras.\n• El Ayllu: Célula social y económica básica andina. Comunidad unida por vínculos de sangre (parentesco), territorio (la *marca*), religión (la *pacarina* o ancestro común mítico), idioma y trabajo.\n• Formas de Trabajo en el Tahuantinsuyo:\n  1. Ayni: Trabajo recíproco y solidario entre miembros de familias del ayllu ('hoy por ti, mañana por mí').\n  2. Minka: Trabajo colectivo comunal en favor del bien común del ayllu (construcción de acequias, caminos comunales o siembra en tierras comunales y de ancianos/huérfanos).\n  3. Mita: Trabajo obligatorio, rotativo y por turnos que los varones adultos (hatunrunas de 18 a 50 años) prestaban al Estado imperial para obras monumentales (fortalezas, calzadas del Qhapaq Ñan, puentes colgantes, minería y ejército).\n• Estratos Sociales:\n  - Realeza: Sapa Inca, Coya (esposa principal) y Auqui.\n  - Nobleza de Sangre: Miembros de las panacas reales cusqueñas.\n  - Nobleza de Privilegio (Advenediza de curacas conquistados y Recompensada por méritos bélicos).\n  - Clases Populares: Hatunrunas (ciudadanos campesinos), Mitimaes o Mitmas (colonizadores trasladados con fines económicos y de control político), Yanaconas (servidores perpetuos desvinculados del ayllu) y Piñas (esclavos prisioneros de guerra destinados a cocales insalubres).",
                conceptosClave = listOf(
                    "Pilares económicos: Reciprocidad simétrica y Redistribución estatal asimétrica",
                    "El Ayllu y sus vínculos identitarios (territorial, sanguíneo, totémico)",
                    "Diferenciación del trabajo: Ayni (familiar), Minka (comunitario) y Mita (estatal obligatorio)",
                    "Diferencias de estatus entre Hatunrunas, Mitimaes, Yanaconas y Piñas"
                ),
                formulas = listOf(
                    "\\text{Economía Andina} = \\text{Reciprocidad (Ayllu)} + \\text{Redistribución (Colcas Estatales)}",
                    "\\text{Formas de Trabajo} = \\text{Ayni (Familiar)} \\quad \\| \\quad \\text{Minka (Comunal)} \\quad \\| \\quad \\text{Mita (Estatal)}"
                ),
                formulaName = "Modelo Laboral del Tawantinsuyu",
                formulaLatex = "\\text{Hatunruna (Mita)} \\implies \\text{Excedente en Colcas} \\implies \\text{Redistribución Imperial}",
                formulaDescription = "Mecanismo andino de acopio y provisión de alimentos sin mediación monetaria.",
                admissionTip = "La 'Mita' era estrictamente por turnos y rotativa; el Estado imperial estaba obligado a alimentar y vestir a los mitayos mientras durara la faena oficial.",
                admissionExplanation = "• Los mitimaes o *mitmacunas* eran contingentes poblacionales reubicados por el Estado; cumplían roles estratégicos de aculturación quechua en regiones rebeldes o de colonización agrícola en nuevos pisos ecológicos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la sociedad del Tahuantinsuyo, la institución del trabajo colectivo obligatorio y por turnos que los hatunrunas debían cumplir para el Estado en la construcción de caminos, fortalezas y la explotación minera se denominó:",
                    options = listOf(
                        "Ayni",
                        "Minka",
                        "Mita",
                        "Chunga",
                        "Camachic"
                    ),
                    correctIndex = 2,
                    explanation = "La mita era el tributo en fuerza de trabajo que los varones del ayllu prestaban de forma periódica y obligatoria al Estado incaico para obras públicas de infraestructura y el sostenimiento del ejército.",
                    subject = "Historia del Perú",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "hp_t03_s04",
            subjectId = "historia_peru",
            semana = 3,
            subtema = "3.4 Cosmovisión, Arte y Caída del Tahuantinsuyo",
            title = "Cosmovisión, Arte y la Caída del Tahuantinsuyo",
            theory = LessonTheory(
                id = "theory_hp_t03_s04",
                asignatura = "Historia del Perú",
                semana = 3,
                titulo = "Cosmovisión, Arte y la Caída del Tahuantinsuyo",
                resumen = "• Cosmovisión y Religión Andina:\n  - Concepción tripartita del cosmos:\n    1. Hanan Pacha: El mundo de arriba o celeste (dioses astrales: Sol o Inti, Luna o Quilla, Rayo o Illapa).\n    2. Kay Pacha: El mundo terrenal del aquí y ahora (los seres humanos, animales y plantas).\n    3. Uku Pacha: El mundo subterráneo o de las profundidades (los muertos, las semillas, Pachamama y las fuentes de agua).\n  - Religión politeísta, panteísta y heliolátrica. Divinidades mayores: Wiracocha (ordenador del cosmos) e Inti (padre del Inca). Huacas (lugares u objetos sagrados) y Mallquis (momias de antepasados venerados).\n• Logros Materiales y Artísticos:\n  - Arquitectura Lítica: Solidez, sencillez, simetría y vanos trapezoidales almohadillados (Coricancha, Ollantaytambo, Sacsayhuamán).\n  - Textilería: Tejidos de abasca (burdo para el pueblo) y tejidos de cumbi (fino de vicuña con tocapus para la nobleza).\n  - Cerámica: El Aríbalo o Urpo (cuerpo globular, base cónica y cuello largo para fermentar y trasladar chicha) y los platos con asas de cabeza de ave.\n• Caída del Imperio Incaico (Causas Reales vs. Mitos):\n  - Causa estructural determinante: Las profundas contradicciones internas y el descontento de las etnias sometidas (huancas, chachapoyas, cañaris, chancas) que apoyaron masivamente a los invasores españoles como aliados libertadores.\n  - Guerra Civil Fratricida: Disputa por el poder entre Huáscar (apoyado por las panacas del Hanan Cusco) y Atahualpa (apoyado por los generales de Quito como Quisquis y Calcuchímac).\n  - Epidemias biológicas devastadoras traídas por los europeos (viruela, sarampión) que diezmaron la población antes de la captura de Atahualpa en Cajamarca (16 de noviembre de 1532).",
                conceptosClave = listOf(
                    "Tripartición del cosmos andino: Hanan Pacha, Kay Pacha y Uku Pacha",
                    "Aríbalo incaico y arquitectura de vanos trapezoidales almohadillados",
                    "Alianzas hispano-indígenas (huancas, cañaris) como factor decisivo de la conquista",
                    "Guerra civil entre Huáscar y Atahualpa que fracturó la cohesión imperial"
                ),
                formulas = listOf(
                    "\\text{Caída del Tawantinsuyu} = \\text{Alianzas Indígenas-Españolas} + \\text{Guerra Civil Huáscar-Atahualpa} + \\text{Epidemias}"
                ),
                formulaName = "Factores Determinantes de la Conquista del Perú",
                formulaLatex = "\\text{Contradicciones Étnicas Internas} \\gg \\text{Superioridad Tecnológica de las Armas de Fuego}",
                formulaDescription = "Desmitificación historiográfica de la caída del Imperio Incaico según Waldemar Espinoza.",
                admissionTip = "La historiografía moderna (Waldemar Espinoza) demostró que el factor clave en la caída del Tahuantinsuyo no fue la supuesta superioridad bélica hispana ni la sorpresa de los caballos, sino el apoyo masivo de miles de guerreros de etnias aliadas (huancas y cañaris).",
                admissionExplanation = "• El pacto de Cajamarca y el bautizo forzoso de Atahualpa sellaron su ejecución por garrote el 26 de julio de 1533 tras pagar un rescate millonario en oro y plata que no fue respetado por Pizarro."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las investigaciones históricas contemporáneas dirigidas por Waldemar Espinoza han demostrado que el factor principal que facilitó la rápida caída y conquista del Imperio del Tahuantinsuyo por los españoles fue:",
                    options = listOf(
                        "El temor supersticioso de los soldados incas a las armas de fuego y los cañones",
                        "La alianza militar y logística de las etnias indígenas sometidas con las huestes invasoras españolas",
                        "La superioridad numérica absoluta de los soldados conquistadores peninsulares",
                        "El abandono del culto al dios Sol por parte del ejército de Atahualpa",
                        "La negativa de los generales quiteños a intervenir en la batalla de Cajamarca"
                    ),
                    correctIndex = 1,
                    explanation = "Pueblos indígenas como los huancas, cañaris y chachapoyas se aliaron activamente a los conquistadores hispanos proveyéndoles miles de soldados, víveres e información militar con el afán de librarse del dominio incaico.",
                    subject = "Historia del Perú",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: INVASIÓN HISPANA Y VIRREINATO DEL PERÚ (Semana 4)
        // =========================================================================
        LessonNode(
            id = "hp_t04_s01",
            subjectId = "historia_peru",
            semana = 4,
            subtema = "4.1 Los Viajes de Pizarro y la Invasión al Tahuantinsuyo",
            title = "Los Viajes de Pizarro y la Invasión al Tahuantinsuyo",
            theory = LessonTheory(
                id = "theory_hp_t04_s01",
                asignatura = "Historia del Perú",
                semana = 4,
                titulo = "Los Viajes de Pizarro y la Invasión al Tahuantinsuyo",
                resumen = "• La Empresa del Levante (Pacto de Panamá, 1524):\n  - Francisco Pizarro (jefe y capitán militar), Diego de Almagro (logística y pertrechos) y Hernando de Luque (procurador y testaferro del financista Gaspar de Espinoza).\n• Los Tres Viajes de Pizarro:\n  1. Primer Viaje (1524 - 1525, Viaje Explorador): Puerto Piñas, Puerto del Hambre y Pueblo Quemado (donde Almagro perdió un ojo en combate con los indígenas).\n  2. Segundo Viaje (1526 - 1528, Viaje Descubridor): Incidente de la Isla del Gallo (1527: Pizarro traza la línea en la arena y solo cruzan los 'Trece de la Fama'). Llegada a Tumbes y comprobación de la opulencia del Imperio.\n  - Capitulación de Toledo (26 de julio de 1529): Firmada entre Francisco Pizarro y la reina Isabel de Portugal. Pizarro fue nombrado gobernador, capitán general y adelantado de Nueva Castilla, relegando injustamente a Almagro a la tenencia de la fortaleza de Tumbes (germen de las guerras civiles).\n  3. Tercer Viaje (1531 - 1532, Viaje Invasor y de Conquista): Desembarco en la bahía de San Mateo, fundación de la primera ciudad española en el Perú (San Miguel de Tangarará, Piura, 1532) y marcha hacia Cajamarca.\n• Captura y Muerte de Atahualpa (Cajamarca, 1532-1533):\n  - Fray Vicente de Valverde ejecutó el 'Requerimiento' (fórmula legal para exigir sumisión al Papa y a la Corona). Tras arrojar la Biblia, Pizarro dio la señal de ataque. Captura del Inca y oferta del rescate en cuartos de oro y plata. Ejecución en la plaza de Cajamarca (julio de 1533).",
                conceptosClave = listOf(
                    "Pacto de Panamá y socios de la conquista financiada por Gaspar de Espinoza",
                    "Incidente de los Trece de la Isla del Gallo en el segundo viaje",
                    "Capitulación de Toledo (1529) y desigualdad de privilegios que enemistó a los socios",
                    "Fundación de San Miguel de Tangarará y Requerimiento de Valverde en Cajamarca"
                ),
                formulas = listOf(
                    "\\text{Empresa del Levante} = \\text{Pizarro (Mando)} + \\text{Almagro (Víveres)} + \\text{Luque/Espinoza (Capital)}"
                ),
                formulaName = "Organización Jurídica y Mercantil de la Conquista",
                formulaLatex = "\\text{Capitulación de Toledo (1529)} \\implies \\text{Pérdida de privilegios de Almagro y Guerras Civiles}",
                formulaDescription = "Tratado real que legalizó la invasión pero sembró la discordia interna en la hueste.",
                admissionTip = "La primera ciudad española fundada en el Perú fue San Miguel de Tangarará (en el actual departamento de Piura) en 1532, antes de la captura del Inca.",
                admissionExplanation = "• El 'Requerimiento' era un documento teológico-jurídico redactado por Juan López de Palacios Rubios que advertía a los indígenas que de no aceptar el cristianismo y la soberanía del rey, se les haría la 'guerra justa'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El documento legal suscrito en 1529 entre Francisco Pizarro y la Corona española, que autorizó formalmente la invasión al Perú pero otorgó excesivos títulos a Pizarro desatando los celos de Diego de Almagro, fue la:",
                    options = listOf(
                        "Capitulación de Santa Fe",
                        "Capitulación de Toledo",
                        "Capitulación de Burgos",
                        "Capitulación de Valladolid",
                        "Paz de Guayaquil"
                    ),
                    correctIndex = 1,
                    explanation = "La Capitulación de Toledo concedió a Francisco Pizarro el título de gobernador, capitán general y alguacil mayor con un suculento sueldo, mientras que Almagro recibió cargos menores, originando el rencor que condujo a las guerras civiles.",
                    subject = "Historia del Perú",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "hp_t04_s02",
            subjectId = "historia_peru",
            semana = 4,
            subtema = "4.2 Guerras Civiles entre Conquistadores y Creación del Virreinato",
            title = "Guerras Civiles entre Conquistadores y Creación del Virreinato",
            theory = LessonTheory(
                id = "theory_hp_t04_s02",
                asignatura = "Historia del Perú",
                semana = 4,
                titulo = "Guerras Civiles entre Conquistadores y Creación del Virreinato",
                resumen = "• Guerras Civiles entre Conquistadores (1537 - 1554):\n  1. Guerra de Fronteras o entre Pizarristas y Almagristas (1537-1542):\n     - Disputa por la posesión de la rica ciudad del Cusco (límite entre Nueva Castilla y Nueva Toledo).\n     - Batalla de las Salinas (1538, Hernando Pizarro derrotó a Diego de Almagro 'El Viejo', quien fue ejecutado por garrote en el Cusco).\n     - Venganza de los 'Almagristas' (los de Chile): Asesinato de Francisco Pizarro en su palacio de Lima (1541) por Almagro 'El Mozo'.\n     - Batalla de Chupas (1542): El gobernador comisionado Cristóbal Vaca de Castro derrotó a Almagro 'El Mozo'.\n• Las Leyes Nuevas de Indias y la Creación del Virreinato (20 de noviembre de 1542):\n  - Promulgadas por Carlos I de España (dinastía Habsburgo) impulsadas por las denuncias de Fray Bartolomé de las Casas sobre la crueldad contra los indígenas.\n  - Creación de la Real Audiencia de Lima y el Virreinato del Perú, eliminando la perpetuidad de las encomiendas feudales para afirmar el poder central de la Corona.\n  2. Rebelión de los Grandes Encomenderos (1544 - 1548):\n     - Liderada por Gonzalo Pizarro contra la aplicación de las Leyes Nuevas.\n     - Batalla de Añaquito (1546): Gonzalo Pizarro derrotó y decapitó al primer virrey del Perú, Blasco Núñez Vela.\n     - Llegada del clérigo Pedro de la Gasca ('El Pacificador'): Ofreció indultos y revocó las Leyes Nuevas, derrotando a Gonzalo Pizarro y a Francisco de Carvajal ('El Demonio de los Andes') en la batalla de Jaquijahuana (1548).\n  3. Rebelión de los 'Insatisfechos' (1553-1554): Liderada por Francisco Hernández Girón, derrotado en Pucará.",
                conceptosClave = listOf(
                    "Disputa territorial por el Cusco y muerte de Almagro en Las Salinas (1538)",
                    "Promulgación de las Leyes Nuevas (1542) para limitar el poder feudal encomendero",
                    "Creación del Virreinato del Perú y muerte violenta del virrey Blasco Núñez Vela",
                    "Misión pacificadora de Pedro de la Gasca y fin de la rebelión encomendera en Jaquijahuana"
                ),
                formulas = listOf(
                    "\\text{Leyes Nuevas (1542)} \\implies \\text{Creación del Virreinato del Perú} + \\text{Supresión de Encomiendas Hereditarias}"
                ),
                formulaName = "Tránsito del Encomendero al Control Virreinal",
                formulaLatex = "\\text{Poder Feudal Encomendero} \\xrightarrow{\\text{Leyes Nuevas}} \\text{Poder Burocrático Centralizado de la Corona}",
                formulaDescription = "Consolidación de la autoridad absolutista hispana sobre los conquistadores rebeldes.",
                admissionTip = "El primer virrey del Perú fue Blasco Núñez Vela, quien murió degollado en la batalla de Añaquito a manos de los encomenderos sublevados dirigidos por Gonzalo Pizarro.",
                admissionExplanation = "• Las encomiendas consistían en la concesión real de un grupo de indígenas a un conquistador español a cambio de que este los protegiera y evangelizara; en la práctica, derivó en una servidumbre feudal sanguinaria."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las Leyes Nuevas de Indias promulgadas en 1542 por el rey Carlos I de España tuvieron como consecuencia inmediata en el plano político:",
                    options = listOf(
                        "La entrega de títulos de nobleza vitalicios a los socios de la conquista",
                        "La creación del Virreinato del Perú y la abolición paulatina de las encomiendas feudales",
                        "La expulsión definitiva de los sacerdotes jesuitas de los territorios virreinales",
                        "La consolidación de la autonomía de los encomenderos en la administración tributaria",
                        "La prohibición absoluta de la minería de azogue en Huancavelica"
                    ),
                    correctIndex = 1,
                    explanation = "Las Leyes Nuevas de 1542 crearon el Virreinato del Perú e intentaron someter a los encomenderos eliminando el carácter hereditario de las encomiendas, lo que provocó la gran rebelión de Gonzalo Pizarro.",
                    subject = "Historia del Perú",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "hp_t04_s03",
            subjectId = "historia_peru",
            semana = 4,
            subtema = "4.3 La Organización Toledana: Mita, Reducciones y Minería",
            title = "La Organización Toledana: Mita, Reducciones y Minería",
            theory = LessonTheory(
                id = "theory_hp_t04_s03",
                asignatura = "Historia del Perú",
                semana = 4,
                titulo = "La Organización Toledana: Mita, Reducciones y Minería",
                resumen = "• El Virrey Francisco de Toledo (1569 - 1581):\n  - Considerado el gran organizador del Virreinato del Perú; transformó el caos inicial en un sistema de dominación colonial altamente rentable para la Corona.\n  - Realizó la Gran Visita General por todo el territorio virreinal para censar la mano de obra tributaria.\n• Pilares del Ordenamiento Toledano:\n  1. La Mita Minera Colonial: Trabajo forzado, rotativo e inhumano impuesto a la población indígena masculina (los *mitayos* o *indios de cédula* de 18 a 50 años). Principal destino: las minas de plata de Potosí (Alto Perú, actual Bolivia) y las minas de azogue/mercurio de Santa Bárbara en Huancavelica (usado para purificar la plata mediante el método de amalgamación).\n  2. Las Reducciones Indígenas: Concentración forzada de las comunidades andinas dispersas en pueblos nucleados con plano damero (alrededor de una plaza central con iglesia y cabildo) para facilitar el cobro del tributo indígena en moneda, el reclutamiento para la mita y la evangelización forzosa.\n  3. El Tributo Indígena: Impuesto personal monetizado que todo indio debía pagar a la Corona por ser vasallo del rey.\n  4. Establecimiento del Santo Oficio de la Inquisición en Lima (1570) para combatir herejías y proteger la ortodoxia católica (los indígenas estaban formalmente exentos de su fuero por ser considerados 'neófitos en la fe').\n  5. Ejecución del último Inca de Vilcabamba, Túpac Amaru I (1572), extinguiendo la resistencia andina armada.",
                conceptosClave = listOf(
                    "Francisco de Toledo como organizador estructural del aparato virreinal",
                    "Mita minera forzada en Potosí (plata) y Huancavelica (azogue por amalgamación)",
                    "Reducciones toledanas para desarticular el ayllu y optimizar la tributación fiscal",
                    "Tribunal del Santo Oficio de la Inquisición y ejecución de Túpac Amaru I"
                ),
                formulas = listOf(
                    "\\text{Amalgamación de Plata} = \\text{Mineral de Plata (Potosí)} + \\text{Azogue/Mercurio (Huancavelica)}"
                ),
                formulaName = "Columna Vertebral de la Economía Toledana",
                formulaLatex = "\\text{Reducciones} \\to \\text{Censo y Control} \\to \\text{Mita Minera Forzada} \\to \\text{Extracción de Plata}",
                formulaDescription = "Engranaje institucional diseñado por el virrey Toledo para extraer masivamente riquezas minerales.",
                admissionTip = "Los indígenas peruanos estaban EXENTOS del Tribunal del Santo Oficio de la Inquisición. Los juzgados y condenados por la Inquisición eran españoles, criollos, mestizos y negros.",
                admissionExplanation = "• Las reducciones toledanas destruyeron el control vertical de pisos ecológicos andino, desarticulando las redes de parentesco ancestrales y confinándolos a la servidumbre comunal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El virrey Francisco de Toledo implementó las 'reducciones indígenas' a lo largo del territorio del Virreinato del Perú con el objetivo primordial de:",
                    options = listOf(
                        "Promover la industrialización textil mediante talleres urbanos autogestionados",
                        "Facilitar el control administrativo, la evangelización forzosa y el reclutamiento para la mita minera",
                        "Devolver las tierras ancestrales a las panacas de los Incas de Vilcabamba",
                        "Defender la costa peruana contra los corsarios ingleses liderados por Francis Drake",
                        "Fomentar la igualdad jurídica y política entre españoles peninsulares e indígenas"
                    ),
                    correctIndex = 1,
                    explanation = "Las reducciones toledanas agruparon a los indígenas dispersos en pueblos bajo diseño hispánico para facilitar el censo tributario, el cobro del tributo personal y la conscripción de mano de obra para la mita minera.",
                    subject = "Historia del Perú",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "hp_t04_s04",
            subjectId = "historia_peru",
            semana = 4,
            subtema = "4.4 Sociedad Estamental, Castas y Sistema Fiscal Colonial",
            title = "Sociedad Estamental, Castas y Sistema Fiscal Colonial",
            theory = LessonTheory(
                id = "theory_hp_t04_s04",
                asignatura = "Historia del Perú",
                semana = 4,
                titulo = "Sociedad Estamental, Castas y Sistema Fiscal Colonial",
                resumen = "• Sociedad Colonial: Estamental, corporativa, racista y pigmentocrática. Jurídicamente dividida en dos repúblicas:\n  1. República de Españoles: Peninsulares o 'chapetones' (monopolizaban los altos cargos burocráticos y militares) y Criollos (españoles nacidos en América, dueños de haciendas y minas, marginados de las altas esferas del gobierno virreinal).\n  2. República de Indios: Indios nobles (curacas y descendientes de panacas, con privilegios educativos en colegios como el Príncipe o San Francisco de Borja, exentos de mita y tributo) e Indios del común (campesinos mitayos explotados en reducciones).\n  - Sistema de Castas: Mezcla interracial. Mestizo (español + india), Mulato (español + negra), Zambo (indio + negra).\n  - Población Negra Esclava: Traídos del África como mano de obra en haciendas costeñas; los que huían a refugios fortificados eran llamados 'cimarrones' y sus aldeas libres 'palenques'.\n• Monopolio Comercial y Sistema Fiscal:\n  - Monopolio comercial exclusivo controlado por la Casa de Contratación de Sevilla y el Tribunal del Consulado de Lima mediante el sistema de flotas y galeones.\n  - Impuestos Coloniales Clave:\n    * Quinto Real: 20% de la producción de metales preciosos para el rey de España.\n    * Alcabala: Impuesto a la compra-venta de bienes muebles e inmuebles.\n    * Almojarifazgo: Impuesto aduanero de importación y exportación.\n    * Media Anata: Impuesto sobre el primer año de sueldo en cargos públicos.\n    * Diezmo y Primicias: Tributo del 10% de la producción agrícola para la Iglesia.",
                conceptosClave = listOf(
                    "División jurídica: República de Españoles y República de Indios",
                    "Pigmentocracia y sistema de castas coloniales",
                    "Monopolio de Flotas y Galeones entre Sevilla y el Callao",
                    "Impuestos: Quinto Real (minería), Alcabala (comercio interno) y Almojarifazgo (aduanas)"
                ),
                formulas = listOf(
                    "\\text{Quinto Real} = 20\\% \\text{ de la producción minera para la Corona española}",
                    "\\text{Alcabala} = \\text{Impuesto indirecto a la compra-venta de bienes}"
                ),
                formulaName = "Estructura Tributaria Colonial",
                formulaLatex = "\\text{Monopolio Comercial} \\implies \\text{Exclusividad Sevilla - Callao}",
                formulaDescription = "Régimen mercantilista proteccionista de la metrópoli española en América del Sur.",
                admissionTip = "Los esclavos negros prófugos que escapaban de las haciendas se llamaban 'cimarrones' y sus refugios clandestinos fortificados en los montes recibían el nombre de 'palenques'.",
                admissionExplanation = "• Los curacas o indios nobles sirvieron como autoridades intermediarias del virreinato; vestían como caballeros españoles y recibían educación privilegiada a cambio de recaudar el tributo de su etnia."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el sistema fiscal y aduanero del Virreinato del Perú, el impuesto que gravaba las operaciones mercantiles de importación y exportación de mercancías en los puertos coloniales recibía el nombre de:",
                    options = listOf(
                        "Alcabala",
                        "Almojarifazgo",
                        "Quinto Real",
                        "Media Anata",
                        "Gabela"
                    ),
                    correctIndex = 1,
                    explanation = "El almojarifazgo era el arancel aduanero colonial que se pagaba por la entrada y salida de mercancías a través de los puertos autorizados (como el Callao). La alcabala, en cambio, gravaba la compra-venta interna.",
                    subject = "Historia del Perú",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: REFORMAS BORBÓNICAS Y REBELIONES ANTICOLONIALES (Semana 5)
        // =========================================================================
        LessonNode(
            id = "hp_t05_s01",
            subjectId = "historia_peru",
            semana = 5,
            subtema = "5.1 Las Reformas Borbónicas del Siglo XVIII",
            title = "Las Reformas Borbónicas y la Reestructuración Imperial",
            theory = LessonTheory(
                id = "theory_hp_t05_s01",
                asignatura = "Historia del Perú",
                semana = 5,
                titulo = "Las Reformas Borbónicas y la Reestructuración Imperial",
                resumen = "• Contexto de las Reformas Borbónicas (Siglo XVIII - Rey Carlos III):\n  - Cambio dinástico: De los Habsburgo (Austria) a los Borbones (Francia). España sufría un retraso productivo y corrupción generalizada frente a Inglaterra y Francia.\n  - Objetivos: Modernizar el Estado bajo el Despotismo Ilustrado, recuperar el control central de las colonias, frenar el contrabando inglés y aumentar drásticamente la recaudación fiscal.\n• Medidas y Reformas Específicas:\n  1. Reformas Territoriales (Desmembración del Virreinato del Perú):\n     - Creación del Virreinato de Nueva Granada (1717 / 1739): Se segregaron Quito, Bogotá y Panamá.\n     - Creación del Virreinato del Río de la Plata (1776): Se segregaron Charcas y la riquísima zona minera de Potosí de Lima, provocando la asfixia económica del sur andino.\n     - Creación de la Capitanía General de Chile y el Tratado de San Ildefonso (1777) con Portugal.\n  2. Reformas Comerciales:\n     - Reglamento de Libre Comercio (1778): Autorizó el tráfico directo entre 13 puertos españoles y 24 puertos americanos. Puso fin al monopolio exclusivo del Callao y al poderío del Tribunal del Consulado de Lima, beneficiando puertos como Buenos Aires y Valparaíso.\n  3. Reformas Eclesiásticas:\n     - Expulsión de la Orden de los Jesuitas (1767) de todos los dominios españoles, acusados de desacato y lealtad exclusiva al Papa (regalismo). Confiscación de sus prósperas haciendas mediante la Junta de Temporalidades.\n  4. Reformas Políticas y Administrativas:\n     - Supresión de los abusivos Corregimientos y sustitución por las Intendencias (1784), dividiendo el Perú en 8 intendencias (Lima, Trujillo, Tarma, Huancavelica, Huamanga, Cusco, Arequipa y Puno).",
                conceptosClave = listOf(
                    "Despotismo Ilustrado borbónico impulsado por el rey Carlos III",
                    "Segregación del Alto Perú y Potosí al Virreinato del Río de la Plata (1776)",
                    "Decreto de Libre Comercio de 1778 y quiebre del monopolio comercial limeño",
                    "Expulsión de los jesuitas (1767) y reemplazo de corregimientos por intendencias (1784)"
                ),
                formulas = listOf(
                    "\\text{Desmembración Territorial} \\implies \\text{Pérdida de Potosí (1776)} + \\text{Quiebre de la ruta comercial Cusco-Potosí}"
                ),
                formulaName = "Impacto Geopolítico de las Reformas Borbónicas",
                formulaLatex = "\\text{Reformas Fiscales y Aduaneras} \\implies \\text{Descontento Criollo e Indígena} \\implies \\text{Rebeliones Anticoloniales}",
                formulaDescription = "Cadena causal que dinamitó el equilibrio colonial y gestó la crisis del virreinato.",
                admissionTip = "La segregación de Potosí hacia el Virreinato del Río de la Plata arruinó económicamente a los comerciantes arrieros del sur andino (como José Gabriel Condorcanqui), siendo una causa directa de la Gran Rebelión.",
                admissionExplanation = "• Con la expulsión de los jesuitas, la Corona clausuró sus colegios y creó en Lima el Real Convictorio de San Carlos, institución educativa que paradójicamente se convertiría en el semillero ideológico de los patriotas peruanos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el siglo XVIII, las reformas borbónicas decretadas por la monarquía de Carlos III generaron un profundo malestar en la economía del sur andino peruano debido principalmente a:",
                    options = listOf(
                        "La abolición del tributo indígena y la prohibición de la mita en las minas de carbón",
                        "La segregación de la provincia minera de Potosí al recién fundado Virreinato del Río de la Plata",
                        "El cierre definitivo de los puertos de Buenos Aires y Valparaíso al comercio atlántico",
                        "La entrega de las tierras comunales a los misioneros de la orden jesuita",
                        "La inmediata disolución de la Real Audiencia del Cusco y de Lima"
                    ),
                    correctIndex = 1,
                    explanation = "La anexión de Charcas y las minas de Potosí al Virreinato del Río de la Plata (1776) rompió el circuito económico tradicional del sur andino con Lima, encareciendo aduanas y arruinando a los arrieros y hacendados locales.",
                    subject = "Historia del Perú",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "hp_t05_s02",
            subjectId = "historia_peru",
            semana = 5,
            subtema = "5.2 La Rebelión de Juan Santos Atahualpa en la Selva Central",
            title = "La Rebelión de Juan Santos Atahualpa en la Selva Central",
            theory = LessonTheory(
                id = "theory_hp_t05_s02",
                asignatura = "Historia del Perú",
                semana = 5,
                titulo = "La Rebelión de Juan Santos Atahualpa en la Selva Central",
                resumen = "• La Rebelión de Juan Santos Atahualpa (1742 - 1756, Gran Pajonal y Selva Central):\n  - Líder: Juan Santos Atahualpa, mestizo educado por los jesuitas en el Cusco, hablaba quechua, castellano y latín. Se proclamó 'Apu Inca' y descendiente directo de Atahualpa.\n  - Escenario Geográfico: El Gran Pajonal, valles de Chanchamayo, Perené y Cerro de la Sal (Junín, Pasco, Huánuco, Ucayali).\n  - Base Social: Alianza interétnica de comunidades selváticas amazónicas (asháninkas, amueshas, shipibos, conibos, piros) junto a fugitivos serranos.\n• Causas de la Insurrección:\n  - Rechazo a las misiones franciscanas que imponían el trabajo forzado en haciendas y talleres a los nativos, rompiendo sus patrones culturales ancestrales.\n  - Epidemias diezmandas traídas por los sacerdotes a la selva.\n  - Reclamo por el control del Cerro de la Sal (recurso estratégico vital para la subsistencia y el comercio de los pueblos amazónicos).\n• Desarrollo y Estrategia Bélica:\n  - Empleo de la guerra de guerrillas, emboscadas en la espesura de la selva y conocimiento milimétrico del terreno agreste.\n  - Derrotó sistemáticamente a las expediciones militares punitivas enviadas por los virreyes Marqués de Villagarcía y Conde de Superunda.\n  - Logró expulsar a los franciscanos y españoles de toda la selva central. Jamás fue capturado ni derrotado militarmente por las tropas de la Corona (su muerte sigue envuelta en misterio hacia 1756).",
                conceptosClave = listOf(
                    "Liderazgo mesiánico de Juan Santos Atahualpa como Apu Inca",
                    "Gran Pajonal y Cerro de la Sal como epicentros de la resistencia amazónica",
                    "Guerra de guerrillas y alianza asháninka-amuesha invicta ante el ejército virreinal",
                    "Expulsión de las misiones franciscanas de la selva central"
                ),
                formulas = listOf(
                    "\\text{Guerra de Guerrillas Selvática} \\implies \\text{Insurrección Invicta de Juan Santos Atahualpa}"
                ),
                formulaName = "Estrategia Defensiva Amazónica",
                formulaLatex = "\\text{Alianza Asháninka} + \\text{Control del Cerro de la Sal} \\to \\text{Fracaso de Tropas Virreinales}",
                formulaDescription = "Primera gran rebelión anticolonial del siglo XVIII que mantuvo liberada la selva central.",
                admissionTip = "Recuerda que Juan Santos Atahualpa NUNCA fue capturado ni derrotado por los españoles; su rebelión impidió la colonización hispánica de la selva central durante más de un siglo.",
                admissionExplanation = "• El Cerro de la Sal era un punto neurálgico sagrado donde etnias de toda la Amazonía convergían para extraer sal y realizar trueques; los franciscanos intentaron monopolizarlo, detonando la sublevación nativa."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La rebelión anticolonial acaudillada por Juan Santos Atahualpa en 1742 en la selva central se caracterizó militarmente por:",
                    options = listOf(
                        "La firma de una capitulación pacífica con el virrey Conde de Superunda",
                        "El uso eficaz de tácticas de guerra de guerrillas en el Gran Pajonal que evitaron su captura",
                        "El desembarco de tropas corsarias británicas para apoyar el asedio a Lima",
                        "La subordinación formal a la nobleza incaica del Cabildo del Cusco",
                        "La toma y saqueo violento de las minas de plata de Potosí y Pasco"
                    ),
                    correctIndex = 1,
                    explanation = "Juan Santos Atahualpa y las comunidades nativas amazónicas (asháninkas, amueshas) utilizaron la guerra de guerrillas en la selva, desgastando a las tropas realistas y logrando mantenerse invictos.",
                    subject = "Historia del Perú",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "hp_t05_s03",
            subjectId = "historia_peru",
            semana = 5,
            subtema = "5.3 La Gran Rebelión de Túpac Amaru II (1780 - 1781)",
            title = "La Gran Rebelión de Túpac Amaru II: Fases y Trascendencia",
            theory = LessonTheory(
                id = "theory_hp_t05_s03",
                asignatura = "Historia del Perú",
                semana = 5,
                titulo = "La Gran Rebelión de Túpac Amaru II: Fases y Trascendencia",
                resumen = "• José Gabriel Condorcanqui Noguera - Túpac Amaru II (Cusco, 1738 - 1781):\n  - Curaca de Surimana, Pampamarca y Tungasuca; próspero arriero dueño de 350 mulas. Educado en el Colegio San Francisco de Borja.\n  - Reclamó legalmente ante la Real Audiencia de Lima el título de Marqués de Oropesa y el cese de la mita en Potosí; al ser ignorado, inició la lucha armada.\n• Causas de la Rebelión:\n  - La opresión de los Corregidores mediante los 'repartos mercantiles forzosos' (venta obligatoria de mercancías inútiles a precios inflados).\n  - El infierno de la mita minera en Potosí.\n  - El aumento abusivo de la alcabala (del 4% al 6%) y el establecimiento de aduanas internas por las reformas borbónicas.\n• Fases de la Rebelión:\n  1. Fase Quechua o Cusqueña (Nov. 1780 - Mayo 1781):\n     - Estallido: Captura y ajusticiamiento del tiránico corregidor Antonio de Arriaga en Tinta (4 de noviembre de 1780).\n     - Victoria militar de Sangarará (18 de noviembre de 1780).\n     - Proclama de Tinta: Decretó la abolición de la mita, los repartos, las alcabalas y la libertad de los esclavos negros.\n     - Error táctico: No atacó de inmediato la ciudad del Cusco; cuando intentó sitiarla en enero de 1781, la ciudad estaba reforzada por tropas enviadas desde Lima por el virrey Jáuregui y curacas leales a la Corona (Mateo Pumacahua).\n     - Derrota en Checacupe y Combapata; traicionado y capturado en Langui junto a su esposa Micaela Bastidas (su principal consejera militar y estratega).\n     - Ejecución sanguinaria en la Plaza de Armas del Cusco el 18 de mayo de 1781.\n  2. Fase Aimara o del Alto Perú (1781 - 1782):\n     - Liderada por Túpac Katari (Julián Apaza), Diego Cristóbal Túpac Amaru y Andrés Túpac Amaru. Sitio de La Paz.\n• Consecuencias Fundamentales:\n  - Supresión definitiva de los Corregimientos y de los repartos mercantiles (1784), sustituidos por las Intendencias.\n  - Creación de la Real Audiencia del Cusco (1787).\n  - Prohibición del uso de vestimentas incaicas tradicionales, títulos de nobleza indígena y la lectura de los 'Comentarios Reales de los Incas' del Inca Garcilaso.",
                conceptosClave = listOf(
                    "Ajusticiamiento del corregidor Arriaga en Tinta como detonante de la rebelión",
                    "Victoria insurgente en Sangarará y proclama de abolición de la esclavitud negra",
                    "Rol protagónico de Micaela Bastidas como estratega y jefa de logística",
                    "Consecuencias institucionales: abolición de corregimientos y creación de intendencias (1784)"
                ),
                formulas = listOf(
                    "\\text{Repartos Mercantiles Forzosos} + \\text{Mita de Potosí} + \\text{Nuevas Aduanas Borbónicas} \\implies \\text{Rebelión de Túpac Amaru II}"
                ),
                formulaName = "Matriz de Causas de la Rebelión de 1780",
                formulaLatex = "\\text{Rebelión de 1780} \\implies \\text{Supresión de Corregimientos} + \\text{Creación de la Audiencia del Cusco}",
                formulaDescription = "La rebelión anticolonial más grande de América hispánica y sus reformas inmediatas.",
                admissionTip = "Micaela Bastidas advirtió reiteradamente a Túpac Amaru II que no demorara el asalto al Cusco ('Te he advertido bastante tiempo para que fueses al Cusco; pero tú te has paseado por los pueblos dando tiempo a que vengan soldados de Lima'). Esa dilación costó la derrota.",
                admissionExplanation = "• Como represalia cultural, la Corona española prohibió el idioma quechua en la administración, ordenó quemar cuadros de los incas y proscribió los 'Comentarios Reales' por considerar que despertaban la memoria de rebeldía autóctona."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Tras la captura y ejecución de Túpac Amaru II en 1781, la Corona española implementó trascendentales reformas administrativas y políticas para aplacar el descontento andino, entre las cuales destacó:",
                    options = listOf(
                        "La reinstauración de la perpetuidad de las encomiendas para los curacas rebeldes",
                        "La abolición definitiva de los corregimientos y su reemplazo por el sistema de intendencias",
                        "La derogación total de las reformas territoriales borbónicas y restitución de Potosí al Perú",
                        "El nombramiento de Mateo Pumacahua como primer virrey criollo del Perú",
                        "La clausura perpetua de la Real Audiencia de Lima y del puerto del Callao"
                    ),
                    correctIndex = 1,
                    explanation = "Debido a los crueles abusos cometidos por los corregidores a través de los repartos mercantiles, la Corona decretó en 1784 la extinción de los corregimientos y estableció en su lugar 8 intendencias territoriales.",
                    subject = "Historia del Perú",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "hp_t05_s04",
            subjectId = "historia_peru",
            semana = 5,
            subtema = "5.4 Precursores de la Independencia: Reformistas y Separatistas",
            title = "Los Precursores de la Independencia: Reformistas y Separatistas",
            theory = LessonTheory(
                id = "theory_hp_t05_s04",
                asignatura = "Historia del Perú",
                semana = 5,
                titulo = "Los Precursores de la Independencia: Reformistas y Separatistas",
                resumen = "• Definición de Precursor: Intelectual o pensador que con sus ideas y escritos promovió la identidad americana y sentó las bases doctrinales de la emancipación.\n• Dos Vertientes Doctrinales:\n  1. Precursores Reformistas (Fidelistas Ilustrados):\n     - No buscaban la ruptura política ni la independencia de España; exigían reformas administrativas, igualdad de derechos entre criollos y peninsulares y fin de los abusos burocráticos dentro del marco de la monarquía.\n     - José Baquíjano y Carrillo: Pronunció el célebre 'Elogio al Virrey Jáuregui' (1781) en la Universidad de San Marcos, convirtiendo un discurso de bienvenida en una valiente protesta contra la tiranía colonial ('el bien del pueblo es la suprema ley').\n     - Toribio Rodríguez de Mendoza: Rector del Real Convictorio de San Carlos; modernizó la educación con ideas de la Ilustración, formando a la generación criolla emancipadora ('Maestro de los Próceres').\n     - Hipólito Unanue: Médico y científico; fundador del Anfiteatro Anatómico y del Colegio de Medicina de San Fernando; secretario de la Sociedad Amantes del País y redactor de la revista ilustrada 'Mercurio Peruano'.\n  2. Precursores Separatistas (Rupturistas Radicales):\n     - Planteaban la ruptura armada y definitiva con España mediante la proclamación de repúblicas independientes en América.\n     - Juan Pablo Vizcardo y Guzmán (Arequipa, 1748 - 1798): Exjesuita expulsado; redactó en 1792 la célebre 'Carta a los Españoles Americanos', considerado el primer documento político que exhorta a los criollos a levantarse en armas contra el despotismo español.\n     - Francisco de Miranda (Venezuela): 'El Gran Precursor Continental'; fundó la logia 'Gran Reunión Americana' y tradujo y difundió la Carta de Vizcardo y Guzmán en Europa.\n     - José de la Riva Agüero: Aristócrata limeño; autor de las '28 Causas para la Independencia de América' (1816); primer presidente del Perú mediante golpe de Estado (Motín de Balconcillo).",
                conceptosClave = listOf(
                    "Diferencia doctrinal fundamental: Reformismo (lealtad con mejoras) vs Separatismo (ruptura armada)",
                    "José Baquíjano y Carrillo y el discurso de protesta 'Elogio al Virrey Jáuregui'",
                    "Toribio Rodríguez de Mendoza y el Real Convictorio de San Carlos",
                    "Juan Pablo Vizcardo y Guzmán y la trascendencia de la 'Carta a los Españoles Americanos'"
                ),
                formulas = listOf(
                    "\\text{Pensamiento Emancipador} = \\text{Reformistas (Baquíjano/Unanue)} \\quad \\longleftrightarrow \\quad \\text{Separatistas (Vizcardo/Riva Agüero)}"
                ),
                formulaName = "Corrientes Ideológicas Precursoras",
                formulaLatex = "\\text{Juan Pablo Vizcardo y Guzmán} \\implies \\text{'Carta a los Españoles Americanos' (1792)}",
                formulaDescription = "Fundamento doctrinal del separatismo criollo hispanoamericano.",
                admissionTip = "No olvides la autoría: La 'Carta a los Españoles Americanos' fue escrita por el jesuita arequipeño Juan Pablo Vizcardo y Guzmán, pero fue publicada y difundida en Londres por Francisco de Miranda.",
                admissionExplanation = "• El 'Mercurio Peruano' (editado por la Sociedad Amantes del País entre 1791 y 1795) fue el órgano intelectual que generó la conciencia de 'patria peruana', estudiando la geografía, historia, clima y recursos del territorio nacional."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El intelectual arequipeño y exjesuita que redactó en el exilio la célebre 'Carta a los Españoles Americanos' (1792), convocando a los criollos a romper definitivamente los lazos con la monarquía española, fue:",
                    options = listOf(
                        "José Baquíjano y Carrillo",
                        "Toribio Rodríguez de Mendoza",
                        "Juan Pablo Vizcardo y Guzmán",
                        "Hipólito Unanue",
                        "José de la Riva Agüero"
                    ),
                    correctIndex = 2,
                    explanation = "Juan Pablo Vizcardo y Guzmán redactó la 'Carta a los Españoles Americanos', obra cumbre del separatismo ideológico que argumentaba que los criollos debían ser los soberanos naturales de América.",
                    subject = "Historia del Perú",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: PROCESO DE EMANCIPACIÓN E INDEPENDENCIA NACIONAL (Semana 6)
        // =========================================================================
        LessonNode(
            id = "hp_t06_s01",
            subjectId = "historia_peru",
            semana = 6,
            subtema = "6.1 Rebeliones Criollas del Siglo XIX y Represión de Abascal",
            title = "Rebeliones Criollas del Siglo XIX y la Represión de Abascal",
            theory = LessonTheory(
                id = "theory_hp_t06_s01",
                asignatura = "Historia del Perú",
                semana = 6,
                titulo = "Rebeliones Criollas del Siglo XIX y la Represión de Abascal",
                resumen = "• La Crisis Monárquica Española (1808):\n  - Invasión napoleónica a España; abdicaciones de Bayona (Carlos IV y Fernando VII entregan la Corona a José Bonaparte 'Pepe Botella').\n  - Formación de Cortes de Cádiz (Constitución liberal de 1812: soberanía popular, igualdad de criollos e indios y libertad de imprenta).\n• El Virrey Fernando de Abascal ('El Virrey Fidelista'):\n  - Convirtió a Lima en el bastión contrarrevolucionario de Sudamérica. Financió ejércitos que aplastaron las Juntas de Gobierno patriotas de Quito, Chuquisaca, La Paz y Chile (solo sobrevivió la Junta de Buenos Aires).\n• Rebeliones Criollas en Provincias del Perú:\n  1. Conspiración de Francisco Antonio de Zela (Tacna, 1811): Primer grito de libertad en el Perú ('El Primer Grito de Tacna'), coordinado con el ejército patriota rioplatense de Castelli en el Alto Perú.\n  2. Rebelión de Juan José Crespo y Castillo (Huánuco, 1812): Levantamiento campesino indígena y mestizo contra el estanco del tabaco.\n  3. Segunda Rebelión de Tacna (1813): Dirigida por Enrique Paillardelle en coordinación con el general argentino Belgrano.\n  4. Rebelión del Cusco de 1814 (Hermanos Angulo y Mateo Pumacahua):\n     - La más poderosa rebelión regional. Alianza entre criollos liberales (José, Vicente y Mariano Angulo) y el brigadier indígena Mateo Pumacahua.\n     - Formación de tres frentes bélicos expedicionarios: Alto Perú, Huamanga y Arequipa.\n     - Campaña de Arequipa: Victoria insurgente en Apacheta y fusilamiento del joven poeta patriota Mariano Melgar tras la derrota en la batalla de Umachiri (marzo de 1815).",
                conceptosClave = listOf(
                    "Crisis de la monarquía española de 1808 y Cortes de Cádiz de 1812",
                    "Virrey Fernando de Abascal y Lima como centro de la contrarrevolución realista",
                    "Primer grito de libertad en Tacna por Francisco Antonio de Zela (1811)",
                    "Gran Rebelión del Cusco de 1814 (Hermanos Angulo y Pumacahua) y sacrificio de Mariano Melgar"
                ),
                formulas = listOf(
                    "\\text{Invasión Napoleónica (1808)} \\implies \\text{Juntas de Gobierno en América} \\implies \\text{Contrarrevolución de Abascal}"
                ),
                formulaName = "Factores Desencadenantes de la Lucha Patriota",
                formulaLatex = "\\text{Rebeliones de Zela, Crespo y Pumacahua} \\to \\text{Preparación del Terreno para San Martín y Bolívar}",
                formulaDescription = "Insurrecciones peruanas autónomas precursoras del arribo de los ejércitos libertadores.",
                admissionTip = "Mariano Melgar no fue solo un poeta romántico precursor del Yaraví, sino el Auditor de Guerra del ejército patriota de Pumacahua; fue fusilado en el campo de batalla de Umachiri a los 24 años.",
                admissionExplanation = "• Mateo Pumacahua, quien en 1780 combatió fielmente a favor de la Corona contra Túpac Amaru II, se sublevó en 1814 en defensa de la Constitución liberal de Cádiz de 1812 ante el absolutismo restaurado de Fernando VII."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la Rebelión del Cusco de 1814, liderada por los hermanos Angulo y Mateo Pumacahua, el joven poeta arequipeño que ejerció como auditor de guerra patriota y fue fusilado tras la derrota de Umachiri fue:",
                    options = listOf(
                        "Mariano Melgar",
                        "Francisco de Zela",
                        "José Faustino Sánchez Carrión",
                        "Toribio Rodríguez de Mendoza",
                        "José de la Riva Agüero"
                    ),
                    correctIndex = 0,
                    explanation = "Mariano Melgar, ilustre poeta arequipeño y autor de los célebres yaravíes, sirvió con patriotismo como auditor de guerra de la expedición rebelde de Pumacahua, siendo fusilado por las tropas realistas en Umachiri (Puno).",
                    subject = "Historia del Perú",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "hp_t06_s02",
            subjectId = "historia_peru",
            semana = 6,
            subtema = "6.2 Corriente Libertadora del Sur y el Protectorado de San Martín",
            title = "Corriente Libertadora del Sur y el Protectorado de San Martín",
            theory = LessonTheory(
                id = "theory_hp_t06_s02",
                asignatura = "Historia del Perú",
                semana = 6,
                titulo = "Corriente Libertadora del Sur y el Protectorado de San Martín",
                resumen = "• Don José de San Martín y el Plan Continental:\n  - Compendió que para asegurar la independencia de Argentina y Chile era indispensable destruir el centro militar realista en el virreinato del Perú.\n  - Cruce de los Andes, liberación de Chile (batallas de Chacabuco y Maipú).\n• Expedición Libertadora al Perú:\n  - Zarpe desde Valparaíso al mando marítimo de Lord Thomas Cochrane. Desembarco en la bahía de Paracas (8 de septiembre de 1820).\n  - Conferencia de Miraflores (1820): Negociación fallida entre enviados de San Martín y del virrey Joaquín de la Pezuela.\n  - Campaña de la Sierra Central dirigida por Juan Antonio Álvarez de Arenales (victoria de Cerro de Pasco).\n  - Motín de Aznapuquio (1821): Golpe de Estado militar de los generales realistas que destituyó al virrey Pezuela y proclamó al general José de la Serna como nuevo virrey.\n  - Conferencia de Punchauca: Entrevista personal entre San Martín y La Serna. San Martín propuso una monarquía constitucional con un príncipe español; La Serna rechazó la oferta y evacuó Lima para refugiarse en la sierra sur (Cusco).\n• Proclamación y Protectorado de San Martín (1821 - 1822):\n  - Cabildo abierto en Lima suscribe el Acta de la Independencia (15 de julio, redactada por Manuel Pérez de Tudela).\n  - Proclamación pública de la Independencia el 28 de julio de 1821.\n  - Obras del Protectorado: Creación de la Legión Peruana de la Guardia, Ley de Vientres Libres (abolición de la esclavitud para los nacidos tras el 28 de julio), creación de la Biblioteca Nacional (Mariano José de Arce) y composición del Himno Nacional (Alcedo, Torre Ugarte y Rosa Merino).\n  - Debate Político Doctrinario: Monarquía Constitucional (defendida por San Martín y Bernardo de Monteagudo) vs República (defendida con ardor por Manuel Pérez de Tudela y José Faustino Sánchez Carrión 'El Solitario de Sayán').",
                conceptosClave = listOf(
                    "Plan Continental de San Martín para neutralizar el bastión realista en Lima",
                    "Motín de Aznapuquio como primer golpe militar en territorio peruano (sube La Serna)",
                    "Proclamación de la Independencia del 28 de julio de 1821",
                    "Obras del Protectorado y debate ideológico entre monarquía constitucional y república"
                ),
                formulas = listOf(
                    "\\text{Plan Continental} = \\text{Independizar Argentina} \\to \\text{Cruzar Andes / Chile} \\to \\text{Vía Marítima a Lima}"
                ),
                formulaName = "Estrategia Continental de San Martín",
                formulaLatex = "\\text{Debate Político (1822)}: \\; \\text{Monarquía Constitucional (Monteagudo)} \\; \\text{vs.} \\; \\text{República (Sánchez Carrión)}",
                formulaDescription = "Polémica en la Sociedad Patriótica sobre la forma de gobierno para el Perú libre.",
                admissionTip = "La 'Ley de Vientres' de San Martín no abolió la esclavitud de forma inmediata; solo otorgó libertad a los hijos de esclavos nacidos después de la proclamación del 28 de julio de 1821.",
                admissionExplanation = "• En las 'Cartas del Solitario de Sayán', Sánchez Carrión demolió los argumentos monarquistas demostrando que un príncipe extranjero en el Perú traería consigo la corte feudal y la perpetuación del coloniaje."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante el Protectorado de San Martín, el intelectual patriota que defendió firmemente el modelo republicano frente a las pretensiones monárquicas a través de sus célebres cartas firmadas como 'El Solitario de Sayán' fue:",
                    options = listOf(
                        "Bernardo de Monteagudo",
                        "José Faustino Sánchez Carrión",
                        "Toribio Rodríguez de Mendoza",
                        "Hipólito Unanue",
                        "Manuel Pérez de Tudela"
                    ),
                    correctIndex = 1,
                    explanation = "José Faustino Sánchez Carrión, conocido como 'El Solitario de Sayán', fue el más ferviente defensor de la República democrática, rebatiendo el proyecto monarquista promovido por San Martín y Monteagudo.",
                    subject = "Historia del Perú",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "hp_t06_s03",
            subjectId = "historia_peru",
            semana = 6,
            subtema = "6.3 La Entrevista de Guayaquil y el Primer Congreso Constituyente",
            title = "La Entrevista de Guayaquil y el Primer Congreso Constituyente",
            theory = LessonTheory(
                id = "theory_hp_t06_s03",
                asignatura = "Historia del Perú",
                semana = 6,
                titulo = "La Entrevista de Guayaquil y el Primer Congreso Constituyente",
                resumen = "• La Entrevista de Guayaquil (26 y 27 de julio de 1822):\n  - Encuentro secreto y crucial entre Don José de San Martín y Don Simón Bolívar.\n  - Puntos de la agenda: Destino de la provincia de Guayaquil (Bolívar ya la había anexado a la Gran Colombia), forma de gobierno para Sudamérica (monarquía vs república) y auxilio militar grancolombiano para culminar la guerra en el Perú.\n  - Resultado: Bolívar rechazó compartir el mando militar ('Dos soles no pueden brillar en un mismo firmamento'). San Martín decidió retirarse generosamente para dejar el camino libre a Bolívar.\n• El Primer Congreso Constituyente del Perú (20 de septiembre de 1822):\n  - Instalado por San Martín al renunciar al Protectorado ('Peruanos: os dejo establecida la representación nacional; si depositáis en ella entera confianza, cantad el triunfo; si no, la anarquía os va a devorar').\n  - Presidente del Congreso: Francisco Xavier de Luna Pizarro. Secretarios: Sánchez Carrión y Mariátegui.\n  - Primera medida: Adopción irrevocable del sistema de gobierno REPUBLICANO representativo y redacción de la Constitución de 1823.\n• La Junta Gubernativa y el Fracaso de las Campañas a Puertos Intermedios:\n  - El Congreso nombró una Junta Gubernativa presidida por José de La Mar.\n  - Primera Campaña a Intermedios (Rudesindo Alvarado): Derrotada por los generales realistas Canterac y Valdés en Torata y Moquegua (1823).\n  - Motín de Balconcillo (febrero de 1823): El ejército patriota acantonado en Lurín exigió al Congreso la designación de José de la Riva Agüero como primer presidente de la República (primer golpe de Estado civil-militar de la historia republicana).",
                conceptosClave = listOf(
                    "Entrevista secreta de Guayaquil entre San Martín y Bolívar (1822)",
                    "Instalación del Primer Congreso Constituyente presidido por Luna Pizarro",
                    "Elección del sistema republicano y redacción de la Constitución de 1823",
                    "Motín de Balconcillo (1823): nombramiento de Riva Agüero como primer presidente"
                ),
                formulas = listOf(
                    "\\text{Motín de Balconcillo (1823)} \\implies \\text{Primer Golpe de Estado Republicano (Sube Riva Agüero)}"
                ),
                formulaName = "Génesis del Caudillismo Militar Peruano",
                formulaLatex = "\\text{Renuncia de San Martín} \\to \\text{Primer Congreso} \\to \\text{Instauración de la República Peruana}",
                formulaDescription = "Tránsito institucional hacia el gobierno soberano peruano tras la retirada protectoral.",
                admissionTip = "El primer presidente formal de la República del Perú fue JOSÉ DE LA RIVA AGÜERO Y SÁNCHEZ BOQUETE, investido por el Congreso bajo coacción militar en el Motín de Balconcillo de 1823.",
                admissionExplanation = "• Ante la amenaza realista que reocupó Lima en 1823 y la anarquía entre Riva Agüero (en Trujillo) y Torre Tagle (en Lima), el Congreso envió a Sánchez Carrión y Olmedo a Colombia para rogar a Simón Bolívar que asumiera el mando supremo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El primer golpe de Estado de la historia republicana del Perú, mediante el cual el ejército forzó al Congreso Constituyente a destituir a la Junta Gubernativa y proclamar a José de la Riva Agüero como presidente, fue el:",
                    options = listOf(
                        "Motín de Aznapuquio",
                        "Motín de Balconcillo",
                        "Golpe de Uchumayo",
                        "Pronunciamiento de Huancayo",
                        "Levantamiento de Tinta"
                    ),
                    correctIndex = 1,
                    explanation = "El 27 de febrero de 1823, el general Santa Cruz y la oficialidad del ejército patriota impusieron el Motín de Balconcillo, obligando al Congreso a designar presidente a José de la Riva Agüero.",
                    subject = "Historia del Perú",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "hp_t06_s04",
            subjectId = "historia_peru",
            semana = 6,
            subtema = "6.4 Corriente Libertadora del Norte: Junín, Ayacucho y Capitulación",
            title = "Corriente Libertadora del Norte: Junín, Ayacucho y Capitulación",
            theory = LessonTheory(
                id = "theory_hp_t06_s04",
                asignatura = "Historia del Perú",
                semana = 6,
                titulo = "Corriente Libertadora del Norte: Junín, Ayacucho y Capitulación",
                resumen = "• Llegada de Simón Bolívar al Perú (1 de septiembre de 1823, bergantín Chimborazo):\n  - El Congreso le otorgó la suprema autoridad militar y posteriormente la Dictadura con plenos poderes absolutistas.\n  - Estableció su cuartel general en Pativilca; José Faustino Sánchez Carrión actuó como su ministro general organizando los pertrechos y la logística.\n• La Campaña Final Libertadora de 1824:\n  1. Batalla de Junín (6 de agosto de 1824 - 'La Batalla sin Humo'):\n     - Se libró a orillas del lago Chinchaycocha con armas blancas (sables y lanzas), sin disparar un solo tiro de pólvora.\n     - La caballería patriota estaba derrotada ante la realista al mando de Canterac; el mayor José Andrés Rázuri comunicó una falsa orden de contraataque y el escuadrón de los 'Húsares del Perú' al mando del coronel Isidoro Suárez cargó ferozmente por la retaguardia realista, transformando la derrota en una victoria fulgurante. Bolívar los rebautizó como 'Húsares de Junín'.\n  2. Batalla de Ayacucho (9 de diciembre de 1824):\n     - Escenario: La pampa de la Quinua, al pie del cerro Condorcunca (Ayacucho).\n     - El general Antonio José de Sucre comandó el Ejército Unido Libertador frente al virrey José de la Serna.\n     - Arenga célebre de Sucre: '¡Soldados, de los esfuerzos de hoy depende la suerte de América del Sur; otro día de gloria va a coronar vuestra admirable constancia!'.\n     - La carga decisiva de la caballería de José María Córdova ('¡División, armas a discreción, de frente, paso de vencedores!') desbarató las líneas realistas. El virrey La Serna cayó herido y prisionero.\n• La Capitulación de Ayacucho (9 de diciembre de 1824):\n  - Suscrita entre el general Sucre y el teniente general español José de Canterac.\n  - Cláusulas: Reconocimiento definitivo de la independencia del Perú y entrega de todas las fortalezas y guarniciones realistas.\n  - Cláusulas polémicas: El Estado peruano se comprometía a pagar los gastos de repatriación a los oficiales españoles y a saldar la supuesta 'deuda de la independencia' a España.",
                conceptosClave = listOf(
                    "Dictadura de Bolívar y rol organizador de Sánchez Carrión desde Pativilca",
                    "Batalla de Junín ('Batalla sin humo') y la oportuna carga de los Húsares de Junín de Rázuri",
                    "Batalla de Ayacucho (9 dic 1824) comandada por Antonio José de Sucre",
                    "Capitulación de Ayacucho firmada por Sucre y Canterac que selló la independencia sudamericana"
                ),
                formulas = listOf(
                    "\\text{Batalla de Ayacucho (9 dic 1824)} \\implies \\text{Capitulación de Ayacucho e Independencia de América del Sur}"
                ),
                formulaName = "Cierre Militar de la Emancipación Sudamericana",
                formulaLatex = "\\text{Victoria de Junín (Armas Blancas)} + \\text{Victoria de Ayacucho (Sucre)} = \\text{Fin del Virreinato}",
                formulaDescription = "Consolidación bélica irreversible de la soberanía republicana continental.",
                admissionTip = "En la batalla de Junín no se disparó ni un solo tiro de fusil o cañón; fue un combate exclusivo de sables, bayonetas y lanzas a caballo, por lo que es llamada 'la batalla sin humo'.",
                admissionExplanation = "• A pesar de la Capitulación de Ayacucho, el brigadier español José Ramón Rodil desconoció el tratado y resistió tercamente en la Fortaleza del Real Felipe del Callao hasta su rendición en enero de 1826."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la batalla de Junín librada el 6 de agosto de 1824, la derrota inminente de las tropas patriotas se convirtió en una victoria decisiva gracias a la oportuna intervención de los Húsares del Perú, acción militar desencadenada por:",
                    options = listOf(
                        "La llegada de refuerzos de infantería enviados por Bernardo O'Higgins",
                        "La falsa orden de ataque transmitida por el mayor José Andrés Rázuri al escuadrón de Isidoro Suárez",
                        "El repliegue espontáneo de la caballería realista comandada por el virrey La Serna",
                        "La detonación de las baterías de artillería dirigida por Antonio José de Sucre",
                        "El sorpresivo alzamiento armado de las guerrillas de Huancavelica"
                    ),
                    correctIndex = 1,
                    explanation = "Cuando la caballería patriota retrocedía, el mayor José Andrés Rázuri, desobedeciendo la orden de retirada, le comunicó al coronel Isidoro Suárez que embistiera a los realistas por la espalda, logrando una victoria asombrosa.",
                    subject = "Historia del Perú",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: REPÚBLICA TEMPRANA, PROSPERIDAD FALAZ Y GUERRA DEL PACÍFICO (Semana 7)
        // =========================================================================
        LessonNode(
            id = "hp_t07_s01",
            subjectId = "historia_peru",
            semana = 7,
            subtema = "7.1 El Primer Militarismo y la Confederación Perú-Boliviana",
            title = "El Primer Militarismo y la Confederación Perú-Boliviana",
            theory = LessonTheory(
                id = "theory_hp_t07_s01",
                asignatura = "Historia del Perú",
                semana = 7,
                titulo = "El Primer Militarismo y la Confederación Perú-Boliviana",
                resumen = "• El Primer Militarismo (1827 - 1872, Jorge Basadre):\n  - Los caudillos militares que triunfaron en Junín y Ayacucho ('los mariscales de Ayacucho') tomaron el poder político ante la debilidad y falta de cohesión de la burguesía civil peruana.\n  - Caudillismo militar, anarquía, golpes continuos de Estado y crisis de las finanzas públicas.\n• La Confederación Perú-Boliviana (1836 - 1839):\n  - Proyecto de integración geopolítica andina liderado por el mariscal boliviano Andrés de Santa Cruz (Protector Supremo de la Confederación).\n  - Estructura: Dividida en tres estados:\n    1. Estado Norperuano (Lima, Huaylas, Junín y La Libertad).\n    2. Estado Surperuano (Arequipa, Cusco, Ayacucho y Puno).\n    3. Estado Boliviano.\n  - Congreso de Tacna (1837): Promulgó la ley fundamental de la Confederación.\n  - Ley de Puertos Libres: Declaró puertos francos (sin aranceles aduaneros) a Paita, Callao, Arica y Cobija, para atraer el comercio directo europeo y estadounidense.\n• Caída de la Confederación:\n  - Oposición chilena: El ministro chileno Diego Portales vio a la Confederación como una amenaza mortal para la hegemonía comercial de Valparaíso en el Pacífico ('Doctrina Portales').\n  - Campañas Restauradoras (Chilenos aliados con militares peruanos opositores como Gamarra y Castilla):\n    * Primera Expedición Restauradora (Blanco Encalada): Acorralada en Arequipa; firmó el Tratado de Paucarpata (1837), desconocido luego por el gobierno de Chile.\n    * Segunda Expedición Restauradora (Manuel Bulnes y Agustín Gamarra): Derrotó definitivamente a Santa Cruz en la batalla de Yungay (20 de enero de 1839). Fin de la Confederación.",
                conceptosClave = listOf(
                    "Definición de Jorge Basadre del Primer Militarismo de los mariscales de Ayacucho",
                    "Confederación Perú-Boliviana articulada en tres estados por Andrés de Santa Cruz",
                    "Ley de Puertos Libres que amenazó el predominio comercial de Valparaíso",
                    "Doctrina Portales y derrota confederada en la batalla de Yungay (1839)"
                ),
                formulas = listOf(
                    "\\text{Confederación (1836)} = \\text{Estado Norperuano} + \\text{Estado Surperuano} + \\text{Estado Boliviano}"
                ),
                formulaName = "Estructura Geopolítica Confederada",
                formulaLatex = "\\text{Ley de Puertos Libres} \\implies \\text{Hostilidad de Chile (Diego Portales)} \\implies \\text{Batalla de Yungay}",
                formulaDescription = "Choque de hegemonías comerciales marítimas en la cuenca suramericana del Pacífico.",
                admissionTip = "El Tratado de Paucarpata (1837) fue firmado en Arequipa entre Santa Cruz y el general chileno Blanco Encalada tras ser este rodeado sin escapatoria; sin embargo, el Congreso chileno repudió el pacto y reanudó la guerra.",
                admissionExplanation = "• Tras la caída de la Confederación, Agustín Gamarra invadió Bolivia para anexarla al Perú, pero murió derrotado en la batalla de Ingavi (1841), desatando un nuevo periodo de anarquía militar interna."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El proyecto geopolítico de la Confederación Perú-Boliviana ideado por Andrés de Santa Cruz fue destruido en 1839 tras la victoria de la Segunda Expedición Restauradora en la batalla de:",
                    options = listOf(
                        "Ingavi",
                        "Yungay",
                        "Socabaya",
                        "Carmen de la Legua",
                        "Yanacocha"
                    ),
                    correctIndex = 1,
                    explanation = "En la batalla de Yungay (Áncash, 20 de enero de 1839), el ejército restaurador chileno-peruano comandado por Manuel Bulnes y Agustín Gamarra derrotó a las fuerzas de Santa Cruz, disolviendo la Confederación.",
                    subject = "Historia del Perú",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "hp_t07_s02",
            subjectId = "historia_peru",
            semana = 7,
            subtema = "7.2 La Prosperidad Falaz y el Boom del Guano de Islas",
            title = "La Prosperidad Falaz y el Boom del Guano de Islas",
            theory = LessonTheory(
                id = "theory_hp_t07_s02",
                asignatura = "Historia del Perú",
                semana = 7,
                titulo = "La Prosperidad Falaz y el Boom del Guano de Islas",
                resumen = "• La 'Prosperidad Falaz' (1845 - 1872, término acuñado por Jorge Basadre):\n  - Periodo de colosal bonanza fiscal gracias al monopolio mundial del guano de las islas de Chincha, fertilizante de altísimo rendimiento demandado por la Revolución Industrial europea.\n  - A pesar de los multimillonarios ingresos, el Estado peruano despilfarró el dinero en burocracia civil y militar, corrupción en la consolidación de la deuda y ferrocarriles incosteables, dejando al país en la bancarrota al agotarse el recurso.\n• Modalidades de Comercialización del Guano:\n  1. Arrendamiento (Francisco Quirós).\n  2. Consignaciones: El Estado mantenía la propiedad y contrataba a casas comerciales para trasladar y vender el guano a cambio de comisiones (Casa Gibbs inglesa y luego los 'Hijos del País' o consignatarios nacionales criollos).\n  3. Monopolio Estatal con el Contrato Dreyfus (1869, gobierno de José Balta impulsado por Nicolás de Piérola): Entregó el monopolio exclusivo de dos millones de toneladas de guano a la casa judío-francesa Auguste Dreyfus, a cambio de pagar la deuda externa peruana.\n• Los Gobiernos de Ramón Castilla:\n  - Primer Gobierno (1845 - 1851): Estabilidad institucional, primer presupuesto de la República, Ley de Consolidación de la Deuda Interna, primer ferrocarril Lima-Callao y barco de vapor 'Rímac'.\n  - Segundo Gobierno (1855 - 1862): Abolición de la esclavitud negra (1854) mediante indemnización estatal a los hacendados; abolición del tributo indígena; promulgación de la Constitución liberal de 1856 y la moderada de 1860 (la de mayor vigencia en el Perú, 60 años).\n• La Guerra contra España (1866):\n  - La escuadra española ('Expedición Científica') ocupó las islas de Chincha exigiendo el pago de deudas coloniales (Tratado Vivanco-Pareja).\n  - Rebelión nacional de Mariano Ignacio Prado, formación de la Cuádruple Alianza (Perú, Chile, Bolivia y Ecuador) y victoria definitiva en el Combate del Dos de Mayo de 1866 en el Callao (heroico sacrificio de José Gálvez Egúsquiza en la torre de la Merced).",
                conceptosClave = listOf(
                    "Concepto basadriano de la 'Prosperidad Falaz' y despilfarro fiscal del guano",
                    "Sistema de consignaciones (Gibbs y nacionales) y el Contrato Dreyfus de 1869",
                    "Reformas sociales de Ramón Castilla: manumisión de esclavos y abolición del tributo",
                    "Guerra contra España y triunfo americano en el Combate del 2 de Mayo de 1866"
                ),
                formulas = listOf(
                    "\\text{Ingresos del Guano} \\implies \\text{54\\% Gasto Burocrático/Militar} + \\text{20\\% Ferrocarriles} + \\text{8\\% Deuda}",
                    "\\text{Contrato Dreyfus (1869)}: \\; \\text{Monopolio a Casa Francesa} \\iff \\text{Pago de la Deuda Externa}"
                ),
                formulaName = "Estructura del Despilfarro Fiscal Guanero",
                formulaLatex = "\\text{Bonanza Guanera} \\xrightarrow{\\text{Corrupción y Deuda}} \\text{Bancarrota Estatal antes de 1879}",
                formulaDescription = "Crónica económica de cómo el Perú desaprovechó la mayor riqueza natural de su historia republicana.",
                admissionTip = "La Constitución de 1860, promulgada por Ramón Castilla, ha sido la carta magna con mayor tiempo de vigencia en toda la historia constitucional del Perú (rigió hasta 1920).",
                admissionExplanation = "• La manumisión de la esclavitud decretada por Castilla en Huancayo (1854) benefició económicamente a los terratenientes criollos, pues el Estado les pagó 300 pesos de indemnización por cada esclavo liberado con dinero del guano."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante el gobierno de José Balta, con el propósito de liquidar la intermediación de los consignatarios nacionales y cubrir los compromisos de la deuda externa, el ministro Nicolás de Piérola impulsó la firma del célebre:",
                    options = listOf(
                        "Contrato Gibbs",
                        "Tratado Vivanco-Pareja",
                        "Contrato Dreyfus",
                        "Contrato Grace",
                        "Tratado de Ancón"
                    ),
                    correctIndex = 2,
                    explanation = "El Contrato Dreyfus (1869) otorgó el monopolio exclusivo de exportación de dos millones de toneladas de guano a la casa francesa Auguste Dreyfus, desplazando a la oligarquía de consignatarios criollos.",
                    subject = "Historia del Perú",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "hp_t07_s03",
            subjectId = "historia_peru",
            semana = 7,
            subtema = "7.3 La Guerra del Pacífico: Orígenes y Campaña Marítima",
            title = "La Guerra del Pacífico: Orígenes y Campaña Marítima",
            theory = LessonTheory(
                id = "theory_hp_t07_s03",
                asignatura = "Historia del Perú",
                semana = 7,
                titulo = "La Guerra del Pacífico: Orígenes y Campaña Marítima",
                resumen = "• La Guerra del Guano y del Salitre (1879 - 1883):\n  - Causa económica de fondo: El control de los ricos yacimientos salitrenses de Tarapacá (Perú) y Antofagasta (Bolivia) por parte del capitalismo británico en alianza con la burguesía expansionista chilena.\n  - Detonante Inmediato: El presidente boliviano Hilarión Daza impuso el gravamen de los '10 centavos' por quintal de salitre exportado a la Compañía de Salitres y Ferrocarril de Antofagasta (chilena-británica), violando el tratado de 1874.\n  - Invasión chilena a Antofagasta (febrero de 1879). Chile exigió al Perú neutralidad; el Perú se vio arrastrado al conflicto por el Tratado Secreto Defensivo de Alianza Defensiva Perú-Bolivia suscrito en 1873.\n  - Chile declaró la guerra al Perú y Bolivia el 5 de abril de 1879.\n• Campaña Marítima (1879):\n  - Disparidad bélica: Chile contaba con blindados modernos gemelos (*Cochrane* y *Blanco Encalada*); la escuadra peruana estaba anticuada, liderada por la fragata blindada *Independencia* y el monitor *Huáscar*.\n  - Combate de Iquique (21 de mayo de 1879): El Huáscar al mando del almirante Miguel Grau hundió a la corbeta chilena *Esmeralda* (muerte de Arturo Prat). Tragedia peruana: la *Independencia* (el mejor barco del Perú) encalló en Punta Gruesa persiguiendo a la goleta *Covadonga* y se perdió.\n  - Las 'Correrías del Huáscar' (Mayo - Octubre de 1879): Durante casi seis meses, Miguel Grau mantuvo en jaque a toda la armada chilena, bombardeando puertos enemigos, cortando líneas de telégrafo y capturando el transporte *Rímac* con un regimiento de caballería.\n  - Combate de Angamos (8 de octubre de 1879): La flota chilena cercó al Huáscar en Punta Angamos. Una granada disparada por el Cochrane impactó en la torre de mando, inmolando a Miguel Grau Seminario ('El Caballero de los Mares'). Pese a la resistencia heroica de Aguirre y Ferré y el intento de hundirlo abriendo las válvulas, el monitor fue capturado.",
                conceptosClave = listOf(
                    "Causa estructural: control imperialista británico del salitre de Tarapacá y Antofagasta",
                    "Impuesto boliviano de los 10 centavos y Tratado Secreto Defensivo de 1873",
                    "Pérdida trágica del blindado Independencia en Punta Gruesa",
                    "Correrías del Huáscar y epopeya heroica de Miguel Grau en Angamos (8 de octubre de 1879)"
                ),
                formulas = listOf(
                    "\\text{Causa Real de la Guerra} = \\text{Salitre de Tarapacá/Antofagasta} + \\text{Capitales Ingleses} + \\text{Expansionismo Chileno}"
                ),
                formulaName = "Ecuación Causal de la Guerra del Salitre",
                formulaLatex = "\\text{Combate de Angamos (8 oct 1879)} \\implies \\text{Pérdida del Mar y Comienzo de la Invasión Terrestre}",
                formulaDescription = "Hito que definió el dominio estratégico del océano Pacífico a favor de Chile.",
                admissionTip = "A Miguel Grau se le llama 'El Caballero de los Mares' porque, tras hundir a la Esmeralda en Iquique, ordenó rescatar a los náufragos chilenos que se ahogaban y envió las pertenencias personales y una carta de condolencia a la viuda del capitán Arturo Prat.",
                admissionExplanation = "• Tras la captura del Huáscar en Angamos, Chile obtuvo el control absoluto del mar, lo que le permitió desembarcar tropas y pertrechos libremente en cualquier punto de la costa peruana."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la Campaña Marítima de la Guerra del Pacífico, la pérdida naval más funesta y determinante para el Perú ocurrida durante el Combate de Iquique (21 de mayo de 1879) fue:",
                    options = listOf(
                        "La captura del transporte artillado Rímac",
                        "El encallamiento y destrucción de la fragata blindada Independencia",
                        "La inmolación de Miguel Grau en la torre de mando del Huáscar",
                        "El bombardeo y pérdida de las baterías de Arica",
                        "El hundimiento de la cañonera Pilcomayo"
                    ),
                    correctIndex = 1,
                    explanation = "La fragata blindada Independencia, el buque de guerra más moderno y potente de la escuadra peruana, encalló en una roca sumergida en Punta Gruesa mientras perseguía a la Covadonga, dejando al Huáscar en soledad frente a la armada chilena.",
                    subject = "Historia del Perú",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "hp_t07_s04",
            subjectId = "historia_peru",
            semana = 7,
            subtema = "7.4 Campañas Terrestres, la Resistencia de la Breña y Tratado de Ancón",
            title = "Campañas Terrestres, la Resistencia de la Breña y el Tratado de Ancón",
            theory = LessonTheory(
                id = "theory_hp_t07_s04",
                asignatura = "Historia del Perú",
                semana = 7,
                titulo = "Campañas Terrestres, la Resistencia de la Breña y el Tratado de Ancón",
                resumen = "• Campañas Terrestres del Sur:\n  1. Campaña de Tarapacá (1879): Toma de Pisagua, derrota en San Francisco y gloriosa victoria peruana en la Batalla de Tarapacá (27 de noviembre de 1879), donde el coronel Andrés A. Cáceres y Francisco Bolognesi destrozaron al ejército chileno (no se pudo retener la provincia por falta de víveres y municiones).\n  2. Campaña de Tacna y Arica (1880):\n     - Batalla del Alto de la Alianza (26 de mayo de 1880, Tacna): Derrota aliada definitiva; Bolivia se retira para siempre de la contienda bélica.\n     - Batalla de Arica (7 de junio de 1880): Francisco Bolognesi y un puñado de valientes juraron cumplir su deber 'hasta quemar el último cartucho'. Inmolación de Bolognesi, Alfonso Ugarte (se lanzó al mar desde el morro para salvar el pabellón nacional) y Justo Arias Aragüez.\n• Campaña de Lima y Ocupación (1881):\n  - Dictadura de Nicolás de Piérola organiza milicias civiles urbanas mal armadas.\n  - Batallas de San Juan y Chorrillos (13 de enero de 1881) y Miraflores (15 de enero de 1881). Saqueo e incendio de Chorrillos y ocupación de Lima. El contralmirante francés Abel Bergasse du Petit Thouars impidió la destrucción de la capital.\n  - Saqueo de la Biblioteca Nacional (Ricardo Palma actuó como 'El Bibliotecario Mendigo').\n• Campaña de la Breña (1881 - 1883):\n  - El coronel Andrés Avelino Cáceres ('El Brujo de los Andes') organizó la resistencia guerrillera popular con campesinos e indígenas de la sierra central.\n  - Victorias legendarias en Pucará, Marcavalle y Concepción (1882).\n  - Trágico final: Traición de hacendados norteños (Grito de Montán de Miguel Iglesias) y derrota heroica de Cáceres en la batalla de Huamachuco (10 de julio de 1883, inmolación de Leoncio Prado).\n• Desenlace: Tratado de Ancón (20 de octubre de 1883):\n  - Suscrito por José Antonio de Lavalle (Perú) y Jovino Novoa (Chile) bajo el gobierno de Miguel Iglesias.\n  - Cláusulas: Cesión definitiva e incondicional de la provincia salitrera de Tarapacá a Chile; ocupación temporal de Tacna y Arica por 10 años, tras lo cual un plebiscito popular decidiría su nacionalidad (plebiscito que Chile postergó dolosamente durante casi 50 años).",
                conceptosClave = listOf(
                    "Victoria peruana en la batalla de Tarapacá y retirada boliviana tras el Alto de la Alianza",
                    "Epopeya de Arica: Bolognesi, Alfonso Ugarte y la promesa de quemar el último cartucho",
                    "Campaña de la Breña: guerra de guerrillas campesina dirigida por Cáceres",
                    "Tratado de Ancón (1883): cesión definitiva de Tarapacá y retención de Tacna y Arica"
                ),
                formulas = listOf(
                    "\\text{Tratado de Ancón (1883)} = \\text{Pérdida definitiva de Tarapacá} + \\text{Ocupación de Tacna y Arica por 10 años}"
                ),
                formulaName = "Consecuencias Territoriales del Tratado de Ancón",
                formulaLatex = "\\text{Resistencia de la Breña (Cáceres)} \\xrightarrow{\\text{Grito de Montán (Iglesias)}} \\text{Firma del Tratado de Ancón}",
                formulaDescription = "Fractura política entre la resistencia patriota y la capitulación oligárquica de la guerra.",
                admissionTip = "El 'Grito de Montán' fue proclamado en Cajamarca en agosto de 1882 por el general Miguel Iglesias, acordando negociar la paz con cesión territorial con Chile para frenar la destrucción de las haciendas costeñas.",
                admissionExplanation = "• Leoncio Prado fue capturado gravemente herido tras Huamachuco; antes de ser fusilado en su lecho de muerte por los soldados chilenos, pidió tomar una taza de café y batió palmas para dar él mismo la orden de fuego a sus verdugos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante la Campaña de la Breña en la sierra central, el líder militar peruano conocido como 'El Brujo de los Andes' que mantuvo en jaque al ejército invasor chileno mediante la guerra de guerrillas campesina fue:",
                    options = listOf(
                        "Nicolás de Piérola",
                        "Francisco Bolognesi",
                        "Andrés Avelino Cáceres",
                        "Miguel Iglesias",
                        "Lizardo Montero"
                    ),
                    correctIndex = 2,
                    explanation = "Andrés Avelino Cáceres organizó a las comunidades campesinas del valle del Mantaro, librando una tenaz resistencia guerrillera en la sierra central con victorias en Pucará, Marcavalle y Concepción.",
                    subject = "Historia del Perú",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: REPÚBLICA ARISTOCRÁTICA, ONCENIO Y SIGLOS XX-XXI (Semana 8)
        // =========================================================================
        LessonNode(
            id = "hp_t08_s01",
            subjectId = "historia_peru",
            semana = 8,
            subtema = "8.1 La Reconstrucción Nacional y la República Aristocrática",
            title = "La Reconstrucción Nacional y la República Aristocrática",
            theory = LessonTheory(
                id = "theory_hp_t08_s01",
                asignatura = "Historia del Perú",
                semana = 8,
                titulo = "La Reconstrucción Nacional y la República Aristocrática",
                resumen = "• La Reconstrucción Nacional (Segundo Militarismo, 1883 - 1895):\n  - El Contrato Grace (1889, primer gobierno de Andrés A. Cáceres): Para cancelar la impagable deuda externa con los acreedores ingleses, el Perú cedió la administración de todos los ferrocarriles del Estado por 66 años (creación de la *Peruvian Corporation*), tres millones de toneladas de guano y libre navegación en el lago Titicaca.\n  - Revolución Civil de 1895: Alianza entre el Partido Demócrata de Nicolás de Piérola y el Partido Civil para derrocar al mariscal Cáceres. Guerra urbana sangrienta en Lima y asunción de Piérola, sentando las bases del orden civil.\n• La República Aristocrática (1895 - 1919, concepto de Jorge Basadre):\n  - Hegemonía política del Partido Civil, compuesto por una oligarquía terrateniente costeña, banqueros y barones del azúcar y algodón (familias como los Pardo, Aspíllaga, Candamo, Leguía).\n  - Modelo Agroexportador Primario y Enclaves Extranjeros: Exportación masiva de azúcar, algodón, cobre (Cerro de Pasco Mining Company), petróleo (International Petroleum Company - IPC) y caucho en la Amazonía (explotación de nativos por Carlos Fermín Fitzcarrald).\n  - Mecanismos de Explotación Laboral: El 'enganche' (deuda compulsiva para forzar al indígena serrano a trabajar en las haciendas costeñas o minas) y las 'correrías' en la selva.\n• Las Luchas Obreras y la Conquista de las 8 Horas:\n  - Difusión del Anarcosindicalismo obrero liderado por el intelectual Manuel González Prada ('Los viejos a la tumba, los jóvenes a la obra').\n  - Huelgas heroicas de jornaleros y panaderos (1911 - 1919).\n  - Hito Social: Promulgación de la Jornada Laboral de las 8 Horas Diarias para todos los trabajadores del Perú el 15 de enero de 1919, bajo el segundo gobierno de José Pardo y Barreda.",
                conceptosClave = listOf(
                    "Contrato Grace (1889): entrega de ferrocarriles estatales a cambio de la deuda externa",
                    "República Aristocrática (1895-1919): dominio oligárquico civilista y modelo agroexportador",
                    "Sistemas de enganche indígena y enclaves minero-petroleros extranjeros",
                    "Movimiento anarcosindicalista y promulgación de la jornada de las 8 horas en 1919"
                ),
                formulas = listOf(
                    "\\text{Contrato Grace (1889)} = \\text{Ferrocarriles por 66 años} + \\text{3 Millones Tn Guano} \\iff \\text{Cancelación Deuda Externa}"
                ),
                formulaName = "Costo Financiero de la Reconstrucción Nacional",
                formulaLatex = "\\text{Huelgas Obreras (1919)} \\implies \\text{Jornada Laboral de 8 Horas (Gobierno de José Pardo)}",
                formulaDescription = "Mayor conquista histórica de la clase trabajadora peruana en el siglo XX.",
                admissionTip = "La ley de las 8 horas laborales para TODOS los trabajadores del Perú se conquistó tras una masiva huelga general en enero de 1919, promulgada por el presidente José Pardo y Barreda.",
                admissionExplanation = "• En 1913, bajo el gobierno popular de Guillermo Billinghurst ('Pan Grande'), se concedió por primera vez la jornada de 8 horas exclusivamente a los estibadores del muelle Dársena del Callao, generalizándose a todo el país en 1919."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante la República Aristocrática, la conquista histórica de la jornada laboral de ocho horas de trabajo para todos los obreros del Perú fue decretada en enero de 1919 tras intensas jornadas de huelga bajo el gobierno de:",
                    options = listOf(
                        "Nicolás de Piérola",
                        "Guillermo Billinghurst",
                        "José Pardo y Barreda",
                        "Augusto B. Leguía",
                        "Manuel Candamo"
                    ),
                    correctIndex = 2,
                    explanation = "El 15 de enero de 1919, ante el paro general impulsado por la Federación Obrera Local de Lima y las federaciones estudiantiles, el presidente José Pardo y Barreda promulgó el histórico decreto de las 8 horas diarias de labor.",
                    subject = "Historia del Perú",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "hp_t08_s02",
            subjectId = "historia_peru",
            semana = 8,
            subtema = "8.2 El Oncenio de Augusto B. Leguía (1919 - 1930)",
            title = "El Oncenio de Augusto B. Leguía y la 'Patria Nueva'",
            theory = LessonTheory(
                id = "theory_hp_t08_s02",
                asignatura = "Historia del Perú",
                semana = 8,
                titulo = "El Oncenio de Augusto B. Leguía y la 'Patria Nueva'",
                resumen = "• El Oncenio de Augusto B. Leguía (1919 - 1930):\n  - Llegó al poder mediante un golpe de Estado el 4 de julio de 1919 contra José Pardo, inaugurando la llamada 'Patria Nueva'.\n  - Régimen autocrático y populista: Desplazó a la vieja oligarquía civilista, persiguió a la prensa independiente y modificó la Constitución de 1920 para reelegirse indefinidamente.\n  - Dependencia Económica: Desplazamiento del capital británico por la hegemonía financiera y comercial de Estados Unidos (empréstitos masivos de Wall Street y endeudamiento externo).\n  - Modernización Urbana: Pavimentación de avenidas (Arequipa, Leguía/Arequipa, Brasil), construcción de plazas (Plaza San Martín por el Centenario de 1821) y obras de saneamiento.\n  - La Ley de Conscripción Vial (1920): Bautizada como la 'Mita Republicana', obligaba a todos los varones de 18 a 60 años (en la práctica aplicada con discriminación racista casi exclusiva sobre los indígenas serranos) a trabajar gratuitamente en la construcción de carreteras.\n• Surgimiento de Nuevas Ideologías de Masas:\n  - APRA (Alianza Popular Revolucionaria Americana): Fundada en México (1924) por Víctor Raúl Haya de la Torre; antiimperialismo continental e integración indoamericana.\n  - Partido Socialista Peruano: Fundado en 1928 por José Carlos Mariátegui; autor de los '7 Ensayos de Interpretación de la Realidad Peruana' (el problema del indio es el problema de la tierra y del gamonalismo).\n• Tratados Limítrofes Internacionales Trascendentales:\n  1. Con Colombia: Tratado Salomón-Lozano (1922, secreto hasta 1928), entregó la faja del Trapecio Amazónico con el puerto de Leticia, otorgando a Colombia salida soberana al río Amazonas.\n  2. Con Chile: Tratado de Lima de 1929 ('Tratado Rada Gamio - Figueroa Larraín'): Resolvió la cuestión de Tacna y Arica; Tacna se reincorporó gloriosamente al territorio peruano y Arica quedó bajo soberanía chilena perpétua.\n• Fin del Oncenio: Golpe militar del comandante Luis M. Sánchez Cerro en Arequipa (agosto de 1930), acelerado por el colapso financiero mundial del Crack de 1929 de Wall Street.",
                conceptosClave = listOf(
                    "Régimen de la 'Patria Nueva' y desplazamiento del capital británico por el estadounidense",
                    "Ley de Conscripción Vial o mita republicana sobre la población indígena",
                    "Nacimiento de los partidos de masas: APRA (Haya de la Torre) y Socialismo (Mariátegui)",
                    "Tratados limítrofes: Salomón-Lozano con Colombia y Tratado de Lima de 1929 con Chile (retorno de Tacna)"
                ),
                formulas = listOf(
                    "\\text{Tratado de Lima (1929)}: \\; \\text{Tacna reincorporada al Perú} \\quad | \\quad \\text{Arica retenida por Chile}"
                ),
                formulaName = "Solución Definitiva de la Cuestión de Tacna y Arica",
                formulaLatex = "\\text{Crack de 1929 (Wall Street)} \\implies \\text{Fin de Empréstitos} \\implies \\text{Caída de Leguía (Sánchez Cerro)}",
                formulaDescription = "Impacto del colapso económico mundial en la estabilidad política peruana.",
                admissionTip = "El 28 de agosto de 1929 Tacna retornó solemnemente al seno de la patria tras casi 50 años de cautiverio bajo administración chilena; fecha celebrada anualmente como la Procesión de la Bandera.",
                admissionExplanation = "• José Carlos Mariátegui planteó en sus '7 Ensayos' que el problema del indio en el Perú no era pedagógico, eclesiástico ni racial, sino socioeconómico, derivado de la concentración feudal de la tierra en manos del gamonalismo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En el marco de la demarcación territorial durante el Oncenio de Leguía, el Tratado de Lima suscrito en 1929 resolvió la prolongada cuestión diplomática de Tacna y Arica estableciendo que:",
                    options = listOf(
                        "Ambas provincias pasaban a soberanía perpetua de la República de Bolivia",
                        "Tacna se reincorporaba al territorio soberano del Perú y Arica quedaba bajo soberanía de Chile",
                        "Arica se reincorporaba al Perú y Tacna era retenida de forma indefinida por Chile",
                        "Se postergaba por cincuenta años más la ejecución del plebiscito previsto en el Tratado de Ancón",
                        "Ambas provincias se convertían en una zona internacional administrada por la Liga de las Naciones"
                    ),
                    correctIndex = 1,
                    explanation = "El Tratado de Lima de 1929 ('Rada Gamio - Figueroa Larraín') resolvió que el territorio de Tacna regresara solemnemente al Perú, mientras que Arica quedaba definitivamente bajo dominio chileno.",
                    subject = "Historia del Perú",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "hp_t08_s03",
            subjectId = "historia_peru",
            semana = 8,
            subtema = "8.3 Del Tercer Militarismo a la Revolución de las Fuerzas Armadas",
            title = "Del Tercer Militarismo a la Revolución de las Fuerzas Armadas",
            theory = LessonTheory(
                id = "theory_hp_t08_s03",
                asignatura = "Historia del Perú",
                semana = 8,
                titulo = "Del Tercer Militarismo a la Revolución de las Fuerzas Armadas",
                resumen = "• El Tercer Militarismo (1930 - 1939):\n  - Luis M. Sánchez Cerro: Promulgó la Constitución de 1933; proscribió al APRA e inició una cruenta persecución ('Año de la Barbarie' de 1932 en Trujillo). Asesinado por un militante aprista en el Hipódromo de Santa Beatriz (1933).\n  - Óscar R. Benavides (1933-1939): Lema 'Orden, Paz y Trabajo'; construyó el Palacio de Gobierno, el Palacio de Justicia y el Seguro Social Obrero.\n• La Guerra con el Ecuador (1941) y el Protocolo de Río:\n  - Durante el primer gobierno de Manuel Prado Ugarteche, el ejército peruano al mando del general Eloy Ureta venció a las tropas invasoras ecuatorianas en la batalla de Zarumilla (inmolación del héroe de la aviación José Abelardo Quiñones).\n  - Protocolo de Paz, Amistad y Límites de Río de Janeiro (1942), garantizado por Argentina, Brasil, Chile y EE.UU., fijando la frontera definitiva.\n• El Ochenio de Manuel A. Odría (1948 - 1956):\n  - Dictadura militar ('Hechos y no palabras'). Promulgó la Ley de Seguridad Interior persiguiendo a apristas y comunistas.\n  - Bonanza económica gracias a la exportación de algodón y minerales impulsada por la Guerra de Corea.\n  - Obras públicas: Grandes Unidades Escolares (GUE), Hospital del Empleado, Estadio Nacional y concesión del derecho al voto femenino para las elecciones generales (1955).\n• El Gobierno Revolucionario de las Fuerzas Armadas (1968 - 1975, Juan Velasco Alvarado):\n  - Golpe militar del 3 de octubre de 1968 que derrocó a Fernando Belaunde Terry tras el escándalo de la 'Página Once' del contrato con la IPC.\n  - Nacionalizaciones masivas de empresas extranjeras (expropiación de la Brea y Pariñas a la IPC, transformándola en Petroperú el 'Día de la Dignidad Nacional').\n  - La Reforma Agraria (Decreto Ley 17716, 24 de junio de 1969): '¡Campesino: el patrón ya no comerá más de tu pobreza!'. Expropiación de latifundios y haciendas costeñas y serranas, creándose cooperativas agrarias (CAPS y SAIS). Destruyó el poder económico de la oligarquía terrateniente tradicional.",
                conceptosClave = listOf(
                    "Constitución de 1933 y conflicto con el APRA bajo Sánchez Cerro",
                    "Guerra contra Ecuador (1941), hazaña de José Quiñones y Protocolo de Río de Janeiro (1942)",
                    "Ochenio de Odría y conquista del voto político femenino en 1955",
                    "Gobierno de Velasco Alvarado y trascendencia histórica de la Reforma Agraria de 1969"
                ),
                formulas = listOf(
                    "\\text{Voto Femenino (1955)} \\implies \\text{Ciudadanía Plena de las Mujeres en Elecciones Generales (1956)}",
                    "\\text{Reforma Agraria (1969)} \\implies \\text{Fin del Latifundismo y Gamonalismo Tradicional}"
                ),
                formulaName = "Transformaciones Estructurales del Siglo XX",
                formulaLatex = "\\text{Reforma Agraria de 1969} \\to \\text{Liquidación de la Oligarquía Agroexportadora}",
                formulaDescription = "Ruptura del orden social terrateniente republicano implementada por las Fuerzas Armadas.",
                admissionTip = "El derecho al sufragio femenino para elecciones presidenciales y parlamentarias fue promulgado en 1955 por Manuel A. Odría, votando las mujeres peruanas por primera vez en los comicios generales de 1956.",
                admissionExplanation = "• La Reforma Agraria de Velasco eliminó el gamonalismo y la servidumbre feudal del campesinado andino, aunque la falta de asistencia técnica y créditos en las cooperativas derivó en una caída de la productividad agraria."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La medida socioeconómica más radical implementada por el Gobierno Revolucionario de las Fuerzas Armadas encabezado por el general Juan Velasco Alvarado, que puso fin al poder de la oligarquía terrateniente tradicional en el Perú, fue:",
                    options = listOf(
                        "La estatización de la banca privada y del comercio exterior",
                        "La promulgación de la Ley de Reforma Agraria en 1969",
                        "La privatización generalizada de las empresas públicas de telecomunicaciones",
                        "La firma del Protocolo de Paz y Amistad de Río de Janeiro",
                        "La creación del Sistema Nacional de Apoyo a la Movilización Social (SINAMOS)"
                    ),
                    correctIndex = 1,
                    explanation = "La Reforma Agraria del 24 de junio de 1969 (D.L. 17716) expropió los grandes latifundios costeños y serranos, transfiriendo las tierras a comunidades y cooperativas campesinas y destruyendo el poder oligárquico terrateniente.",
                    subject = "Historia del Perú",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "hp_t08_s04",
            subjectId = "historia_peru",
            semana = 8,
            subtema = "8.4 Retorno Democrático, Conflicto Armado y el Perú Contemporáneo",
            title = "Retorno Democrático, Conflicto Armado y el Perú Contemporáneo",
            theory = LessonTheory(
                id = "theory_hp_t08_s04",
                asignatura = "Historia del Perú",
                semana = 8,
                titulo = "Retorno Democrático, Conflicto Armado y el Perú Contemporáneo",
                resumen = "• Retorno a la Democracia y la Década de 1980:\n  - La Asamblea Constituyente de 1978-1979 presidida por Víctor Raúl Haya de la Torre promulgó la Constitución de 1979 (otorgó por primera vez el voto a los analfabetos y estableció la Defensoría del Pueblo).\n  - Segundo Gobierno de Fernando Belaunde Terry (1980 - 1985): Restitución de los medios de comunicación a sus dueños. Inicio del Conflicto Armado Interno: El grupo terrorista Sendero Luminoso (liderado por Abimael Guzmán) inició la violencia armada en Chuschi (Ayacucho, 17 de mayo de 1980), al que se sumó el MRTA (1984).\n  - Primer Gobierno de Alan García Pérez (1985 - 1990): Política económica heterodoxa (control de precios, limitación del pago de la deuda al 10% de las exportaciones), intento fallido de estatización de la banca (1987), hiperinflación récord mundial (+2 000 000%), escasez de alimentos y escalada del terrorismo urbano y selectivo.\n• El Decenio de Alberto Fujimori (1990 - 2000):\n  - El 'Fujishock' (agosto de 1990): Ajuste económico ortodoxo y apertura neoliberal (eliminación de subsidios y liberalización del mercado).\n  - Autogolpe de Estado del 5 de abril de 1992: Cierre inconstitucional del Congreso y toma del Poder Judicial.\n  - Constitución Política de 1993: Modelo de economía social de mercado, privatización de empresas públicas y consagración de la reelección presidencial inmediata.\n  - Captura del cabecilla terrorista Abimael Guzmán por el GEIN (Grupo Especial de Inteligencia) el 12 de septiembre de 1992 ('Operación Victoria'), desarticulando el terrorismo senderista.\n  - Conflicto del Cenepa con Ecuador (1995) y firma definitiva del Acta de Brasilia (1998) que cerró la frontera en Tiwinza.\n  - Caída del régimen fujimorista: Difusión del 'Vladivideo' Kouri-Montesinos (septiembre de 2000) desnudando una gigantesca red de corrupción política; renuncia de Fujimori por fax desde Japón y establecimiento del gobierno de transición de Valentín Paniagua.\n• El Siglo XXI: Gobiernos democráticos de Toledo, García (segundo mandato), Humala, Kuczynski, Vizcarra, Sagasti, Castillo y Boluarte, caracterizados por el crecimiento macroeconómico continuo y recurrentes crisis de gobernabilidad y fragmentación política.",
                conceptosClave = listOf(
                    "Constitución de 1979 y el derecho al voto universal para analfabetos",
                    "Inicio del terrorismo senderista en Chuschi (1980) y la hiperinflación de los años 80",
                    "Fujishock, autogolpe de 1992 y promulgación de la Constitución de 1993",
                    "Captura histórica de Abimael Guzmán por el GEIN (1992) y fin del régimen en el 2000"
                ),
                formulas = listOf(
                    "\\text{Operación Victoria (12 sep 1992)}: \\; \\text{GEIN} \\implies \\text{Captura de Abimael Guzmán y caída de Sendero Luminoso}",
                    "\\text{Acta de Brasilia (1998)}: \\; \\text{Cierre definitivo de la frontera Perú-Ecuador}"
                ),
                formulaName = "Hitos Clave del Perú Contemporáneo",
                formulaLatex = "\\text{Vladivideos (2000)} \\implies \\text{Renuncia por Fax} \\implies \\text{Gobierno de Transición de Valentín Paniagua}",
                formulaDescription = "Recuperación democrática y reinstitucionalización republicana al iniciar el siglo XXI.",
                admissionTip = "El derecho al voto de los ciudadanos analfabetos fue consagrado por primera vez en la Constitución de 1979, permitiendo su participación efectiva en los comicios generales de 1980.",
                admissionExplanation = "• El GEIN (Grupo Especial de Inteligencia de la Policía Nacional) logró capturar a la cúpula senderista mediante un trabajo silencioso y profesional de inteligencia táctica, sin disparar un solo tiro, en una casa del distrito de Surquillo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hp_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la historia política contemporánea del Perú, la Constitución Política de 1979, aprobada por la Asamblea Constituyente presidida por Víctor Raúl Haya de la Torre, introdujo una trascendental reforma electoral consistente en:",
                    options = listOf(
                        "La concesión por primera vez del derecho al voto ciudadano a la población analfabeta",
                        "La reelección presidencial inmediata y consecutiva por dos periodos de gobierno",
                        "La abolición del derecho de sufragio para los miembros de las Fuerzas Armadas",
                        "La instauración de la pena de muerte para todos los delitos de corrupción pública",
                        "La eliminación del Tribunal de Garantías Constitucionales"
                    ),
                    correctIndex = 0,
                    explanation = "La Constitución de 1979 consagró el sufragio universal pleno al eliminar la restricción histórica que excluía a las personas analfabetas, quienes votaron por primera vez en las elecciones generales de 1980.",
                    subject = "Historia del Perú",
                    semana = 8
                )
            )
        )
    )
}
