package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object HistoriaUniversalCatalog {
    val lessons: List<LessonNode> = listOf(
        // =========================================================================
        // TEMA 01: HOMINIZACIÓN Y PREHISTORIA (Semana 1)
        // =========================================================================
        LessonNode(
            id = "hu_t01_s01",
            subjectId = "historia_universal",
            semana = 1,
            subtema = "1.1 Proceso de Hominización y Factores Evolutivos",
            title = "Proceso de Hominización y Factores Evolutivos",
            theory = LessonTheory(
                id = "theory_hu_t01_s01",
                asignatura = "Historia Universal",
                semana = 1,
                titulo = "Proceso de Hominización y Factores Evolutivos",
                resumen = "• Hominización: Proceso bio-psico-social de transformación evolutiva de los primates hominoideos hacia el ser humano moderno (Homo sapiens).\n• Cuna de la Humanidad: Valle del Rift (África Oriental, Etiopía, Kenia, Tanzania). La falla geológica transformó la selva tropical en sabana abierta, obligando a los homínidos a adaptarse al suelo.\n• Factores Clave de la Evolución Humana:\n  1. Bipedismo: Marcha erecta sobre dos extremidades, reducción de la insolación corporal y liberación de los miembros superiores.\n  2. Pulgar Oponible y Pinza de Precisión: Permitió la prensión y la fabricación sistemática de herramientas líticas.\n  3. Encefalización Progresiva: Aumento de la capacidad craneal y reorganización cortical vinculada al consumo de carne y proteínas.\n  4. Lenguaje Articulado: Hueso hioides, posición baja de la laringe y desarrollo de las áreas cerebrales de Broca y Wernicke.",
                conceptosClave = listOf(
                    "Valle del Rift como cuna ecológica de los homínidos",
                    "Bipedismo: primer motor adaptativo de liberación manual",
                    "Oponibilidad del pulgar y actividad instrumental",
                    "Áreas cerebrales del lenguaje: Broca y Wernicke"
                ),
                formulas = listOf(
                    "\\text{Falla del Rift} \\implies \\text{Sabana} \\implies \\text{Bipedismo} \\implies \\text{Manos libres} \\implies \\text{Herramientas}"
                ),
                formulaName = "Cadena Causal de la Hominización",
                formulaLatex = "\\text{Bipedismo} \\to \\text{Pinza Manual} \\to \\text{Encefalización} \\to \\text{Trabajo y Lenguaje}",
                formulaDescription = "Secuencia dialéctica de transformaciones anatómicas y cognitivas que originaron la especie humana según Engels y la antropología moderna.",
                admissionTip = "El bipedismo antecedió por millones de años al gran crecimiento del cerebro. Los Australopithecus ya eran bípedos con cerebros pequeños similares a los chimpancés.",
                admissionExplanation = "• No confudas la marcha bípeda (Australopithecus) con la capacidad de fabricar herramientas (Homo habilis)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t01_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El factor anatómico inicial que desencadenó el proceso evolutivo de hominización al propiciar la liberación de las manos y la ulterior fabricación de herramientas fue:",
                    options = listOf(
                        "El desarrollo del lenguaje articulado",
                        "El bipedismo o marcha erecta",
                        "El aumento súbito del volumen cerebral",
                        "La domesticación del fuego",
                        "La invención del arte rupestre"
                    ),
                    correctIndex = 1,
                    explanation = "El bipedismo fue el cambio morfológico pionero que liberó las manos de la locomoción, permitiendo la manipulación fina de objetos, la oponibilidad del pulgar y el posterior desarrollo encefálico.",
                    subject = "Historia Universal",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "hu_t01_s02",
            subjectId = "historia_universal",
            semana = 1,
            subtema = "1.2 Secuencia Hominina y Especies Principales",
            title = "Secuencia Hominina y Especies Principales",
            theory = LessonTheory(
                id = "theory_hu_t01_s02",
                asignatura = "Historia Universal",
                semana = 1,
                titulo = "Secuencia Hominina y Especies Principales",
                resumen = "• Australopithecus: Homínidos bípedos del Plioceno. Especie estelar: Australopithecus afarensis ('Lucy' descubierta por Donald Johanson en Hadar, Etiopía; huellas de Laetoli en Tanzania).\n• Género Homo:\n  - Homo habilis (2.5 - 1.6 Ma): Primer humano creador de herramientas líticas (modo 1 o industria Olduvayense / cantos rodados). Creador de la cultura.\n  - Homo erectus / ergaster (1.8 Ma - 100 mil años): Dominó y produjo el fuego (antorchas, cocción de alimentos, defensa). Primer homínido en migrar fuera de África hacia Asia (Hombre de Java, Pekín) y Europa. Industria Achelense (modo 2, bifaces).\n  - Homo neanderthalensis: Adaptado a las glaciaciones europeas. Primeros entierros funerarios (creencias mágico-religiosas del más allá), lenguaje articulado incipiente e industria Musteriense (modo 3).\n  - Homo sapiens (Cromagnon): Arte rupestre parietal (cuevas de Altamira, Lascaux) y arte mobiliar (Venus paleolíticas esteatopígicas de fertilidad). Poblamiento mundial.",
                conceptosClave = listOf(
                    "Australopithecus afarensis: 'Lucy' y huellas de Laetoli",
                    "Homo habilis: primer fabricante de herramientas líticas (Olduvai)",
                    "Homo erectus: uso del fuego y primera migración intercontinental",
                    "Neandertal: entierros rituales; Sapiens: arte parietal y mobiliar"
                ),
                formulas = listOf(
                    "\\text{Australopithecus} \\to \\text{H. habilis} \\to \\text{H. erectus} \\to \\text{H. neanderthalensis} \\to \\text{H. sapiens}"
                ),
                formulaName = "Secuencia Cronológica de Homínidos",
                formulaLatex = "\\text{Afarensis (Lucy)} \\to \\text{Habilis (Lítica)} \\to \\text{Erectus (Fuego)} \\to \\text{Neanderthal (Entierros)} \\to \\text{Sapiens (Arte)}",
                formulaDescription = "Hitos culturales diagnósticos evaluados en los exámenes de admisión de la UNSA y UNMSM.",
                admissionTip = "Recuerda el hito cultural de cada uno: Habilis = Herramientas; Erectus = Fuego; Neandertal = Entierros/Religión; Sapiens = Arte (pinturas rupestres).",
                admissionExplanation = "• Los neandertales convivieron temporalmente con los Homo sapiens en el Paleolítico Superior europeo antes de su extinción."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t01_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Los primeros indicios arqueológicos de pensamiento mágico-religioso, expresados a través de inhumaciones rituales con ofrendas florales y pigmentos, corresponden a:",
                    options = listOf(
                        "Homo habilis",
                        "Homo erectus",
                        "Homo neanderthalensis",
                        "Australopithecus africanus",
                        "Homo ergaster"
                    ),
                    correctIndex = 2,
                    explanation = "El Homo neanderthalensis fue el primer homínido en realizar entierros funerarios deliberados (como en las cuevas de Shanidar o La Chapelle-aux-Saints), evidenciando consciencia de la muerte y pensamiento abstracto.",
                    subject = "Historia Universal",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "hu_t01_s03",
            subjectId = "historia_universal",
            semana = 1,
            subtema = "1.3 Paleolítico y Mesolítico",
            title = "Paleolítico y Mesolítico",
            theory = LessonTheory(
                id = "theory_hu_t01_s03",
                asignatura = "Historia Universal",
                semana = 1,
                titulo = "Paleolítico y Mesolítico",
                resumen = "• Edad de Piedra: Dividida en Paleolítico, Mesolítico y Neolítico.\n• Paleolítico (Edad de la Piedra Tallada):\n  - Clima: Pleistoceno (era de las glaciaciones y megafauna: mamuts, bisontes).\n  - Economía: Parasitaria, depredadora o de subsistencia (caza, pesca y recolección).\n  - Organización Social: Bandas nómadas igualitarias, trogloditismo (vivienda en cuevas).\n  - Paleolítico Inferior: Habilis y Erectus (herramientas líticas y fuego).\n  - Paleolítico Medio: Neandertal (lenguaje, entierros).\n  - Paleolítico Superior: Sapiens (arco y flecha, pinturas rupestres de caza propiciatoria en Altamira y Lascaux; Venus esteatopígicas de Willendorf y Lespugue).\n• Mesolítico (Periodo de Transición):\n  - Clima: Fin de la última glaciación (Würm/Wisconsin) y tránsito al Holoceno (calentamiento global, extinción de la megafauna).\n  - Economía: Horticultura incipiente (domesticación inicial) y pesca con anzuelos y redes.\n  - Organización: Clan seminómada o trashumante, matriarcado.",
                conceptosClave = listOf(
                    "Paleolítico: economía depredadora/parasitaria y nomadismo en bandas",
                    "Arte parietal (Lascaux, Altamira) como magia propiciatoria de caza",
                    "Mesolítico: transición Pleistoceno-Holoceno y horticultura incipiente",
                    "Industria microlítica para cazar fauna menor"
                ),
                formulas = listOf(
                    "\\text{Paleolítico (Pleistoceno)} \\implies \\text{Depredación} \\implies \\text{Nómadas en bandas}",
                    "\\text{Mesolítico (Tránsito)} \\implies \\text{Holoceno} \\implies \\text{Horticultura y Seminadismo}"
                ),
                formulaName = "Ejes Socioeconómicos Paleolítico-Mesolítico",
                formulaLatex = "\\text{Depredación (Caza/Recolección)} \\to \\text{Horticultura incipiente} \\to \\text{Producción de alimentos}",
                formulaDescription = "Evolución de las modalidades de subsistencia de las sociedades cazadoras-recolectoras a productoras tempranas.",
                admissionTip = "Las pinturas rupestres tenían una finalidad mágica propiciatoria: pintaban animales heridos con la creencia de asegurar el éxito en la cacería del día siguiente.",
                admissionExplanation = "• Las Venus paleolíticas no eran diosas de la belleza estética contemporánea, sino símbolos propiciatorios de fertilidad demográfica y fecundidad de la tierra."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t01_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante el Paleolítico Superior, la realización de pinturas rupestres parietales en cuevas como Altamira y Lascaux tenía como móvil fundamental:",
                    options = listOf(
                        "La decoración suntuosa de los dormitorios de los reyes",
                        "Un carácter mágico-propiciatorio para asegurar el éxito en la cacería",
                        "El registro contable del intercambio comercial entre bandas",
                        "La transmisión de leyes codificadas escritas",
                        "Rendir culto a los dioses celestiales del Neolítico"
                    ),
                    correctIndex = 1,
                    explanation = "El arte rupestre parietal del Paleolítico Superior tenía una naturaleza de magia simpática o propiciatoria: los cazadores creían que al representar pictóricamente al animal capturado o herido, facilitaban su caza real en la naturaleza.",
                    subject = "Historia Universal",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "hu_t01_s04",
            subjectId = "historia_universal",
            semana = 1,
            subtema = "1.4 Revolución Neolítica y Edad de los Metales",
            title = "Revolución Neolítica y Edad de los Metales",
            theory = LessonTheory(
                id = "theory_hu_t01_s04",
                asignatura = "Historia Universal",
                semana = 1,
                titulo = "Revolución Neolítica y Edad de los Metales",
                resumen = "• Revolución Neolítica (Concepto acuñado por Vere Gordon Childe):\n  - Creciente Fértil (Medio Oriente, ríos Tigris, Éufrates y Nilo): Domesticación sistemática de trigo, cebada, ovejas y cabras.\n  - Economía: Productiva (agricultura y ganadería).\n  - Consecuencias Socioculturales: Sedentarismo, primeras aldeas estables (Jericó, Çatalhöyük), división social del trabajo, invención de la cerámica y textilería, excedente económico y origen de la propiedad privada y las clases sociales.\n  - Megalitismo: Menhires, dólmenes y crómlechs (Stonehenge, templos astronómicos y funerarios).\n• Edad de los Metales:\n  1. Edad del Cobre (Calcolítico / Eneolítico): Uso simultáneo de piedra y cobre. Invención de la rueda y el arado.\n  2. Edad del Bronce: Aleación de Cobre + Estaño (90% Cu + 10% Sn). Aparición de las primeras civilizaciones urbanas, la escritura (cuneiforme y jeroglífica) y el Estado teocrático.\n  3. Edad del Hierro: Metalurgia descubierta por los Hititas en Anatolia. Armas de guerra contundentes (espadas, escudos), imperios militaristas e invasiones indoeuropeas.",
                conceptosClave = listOf(
                    "Revolución Neolítica (Gordon Childe): agricultura, ganadería y sedentarismo",
                    "Excedente productivo como base del Estado y la propiedad privada",
                    "Edad del Bronce: surgimiento de las civilizaciones urbanas y la escritura",
                    "Edad del Hierro: metalurgia militar difundida por los hititas"
                ),
                formulas = listOf(
                    "\\text{Bronce} = \\text{Cobre (Cu)} + \\text{Estaño (Sn)}",
                    "\\text{Agricultura} \\implies \\text{Excedente} \\implies \\text{División del trabajo} \\implies \\text{Estado y Clases}"
                ),
                formulaName = "Ecuación de la Revolución Urbana",
                formulaLatex = "\\text{Revolución Neolítica} \\to \\text{Excedente} \\to \\text{Propiedad Privada} \\to \\text{Estado y Escritura}",
                formulaDescription = "Articulación materialista de la transición prehistórica a las primeras formaciones estatales clasistas.",
                admissionTip = "Recuerda la relación de metales: Cobre = transición; Bronce = escritura, Estado y primeras civilizaciones; Hierro = Hititas, armas y ejércitos expansivos.",
                admissionExplanation = "• El excedente agrícola permitió que un sector de la población dejara de cultivar la tierra para dedicarse al sacerdocio, la administración militar y la burocracia estatal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t01_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El surgimiento de las primeras ciudades-estado, la división clasista de la sociedad y la invención de la escritura cuneiforme y jeroglífica se consolidaron durante la:",
                    options = listOf(
                        "Edad del Cobre o Calcolítico",
                        "Edad del Bronce",
                        "Edad del Hierro",
                        "Etapa del Paleolítico Superior",
                        "Época del Mesolítico"
                    ),
                    correctIndex = 1,
                    explanation = "La Edad del Bronce (aleación de cobre y estaño) coincidió con la 'Revolución Urbana', el surgimiento de los primeros Estados teocráticos en Mesopotamia y Egipto, y la invención de los sistemas de escritura para fines administrativos y tributarios.",
                    subject = "Historia Universal",
                    semana = 1
                )
            )
        ),

        // =========================================================================
        // TEMA 02: PRIMERAS CIVILIZACIONES: MESOPOTAMIA Y EGIPTO (Semana 2)
        // =========================================================================
        LessonNode(
            id = "hu_t02_s01",
            subjectId = "historia_universal",
            semana = 2,
            subtema = "2.1 Mesopotamia: Sumerios, Acadios y Primer Imperio Babilónico",
            title = "Mesopotamia: Sumerios, Acadios y Primer Imperio",
            theory = LessonTheory(
                id = "theory_hu_t02_s01",
                asignatura = "Historia Universal",
                semana = 2,
                titulo = "Mesopotamia: Sumerios, Acadios y Primer Imperio Babilónico",
                resumen = "• Espacio Geográfico: Llanura aluvial de la Medialuna de las Tierras Fértiles entre los ríos Tigris y Éufrates (actual Irak). Dividida en Alta Mesopotamia (Asiria, montañosa y belicosa) y Baja Mesopotamia (Caldea, fértil y comercial).\n• Sumerios (IV milenio a.C.):\n  - 'Padres de la Civilización'. Ciudades-estado independientes (Ur, Uruk, Lagash, Nippur) gobernadas por reyes-sacerdotes (Patesi o Ensi).\n  - Aportes: Invención de la Escritura Cuneiforme (descifrada por Henry Rawlinson en la Roca de Behistún), la rueda, el ladrillo cocido, los Zigurats (templos escalonados astronómicos), el sistema sexagesimal y el Poema de Gilgamesh.\n• Acadios (2350 a.C.): Sargón I 'El Grande' conquistó las ciudades sumerias y fundó el Primer Imperio de la Historia con capital en Akkad.\n• Primer Imperio Babilónico (1800 a.C.):\n  - Rey Hammurabi: Centralizó el culto al dios Marduk y promulgó el Código de Hammurabi, primer código legislativo unificado basado en la Ley del Talión ('Ojo por ojo, diente por diente').",
                conceptosClave = listOf(
                    "Sumerios: escritura cuneiforme, rueda, zigurats y ciudades-estado",
                    "Roca de Behistún descifrada por Rawlinson",
                    "Sargón I acadio: primer unificador imperial de la historia",
                    "Código de Hammurabi: Ley del Talión y justicia clasista"
                ),
                formulas = listOf(
                    "\\text{Ley del Talión} \\iff \\text{'Ojo por ojo, diente por diente' (Proporcionalidad penal)}"
                ),
                formulaName = "Principio de la Ley del Talión",
                formulaLatex = "\\text{Pena infligida} = \\text{Daño ocasionado (con sesgo de clase social)}",
                formulaDescription = "Principio rector del Código babilónico de Hammurabi que reguló la retribución punitiva estricta entre hombres libres (Awilu), dependientes (Mushkenu) y esclavos (Wardu).",
                admissionTip = "La Ley del Talión en el Código de Hammurabi NO era igualitaria: si un noble golpeaba a otro noble recibía el mismo golpe, pero si golpeaba a un esclavo solo pagaba una multa económica.",
                admissionExplanation = "• Los zigurats mesopotámicos tenían funciones múltiples: centro religioso, observatorio astronómico y almacén fiscal de granos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t02_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El aporte cultural sumerio que revolucionó la administración del Estado y permitió el registro de transacciones comerciales y mitos como el de Gilgamesh fue:",
                    options = listOf(
                        "La escritura jeroglífica en papiros",
                        "La escritura cuneiforme sobre tablillas de arcilla",
                        "El alfabeto fonético consonántico",
                        "La numeración arábiga posicional",
                        "La escritura demótica en piedra"
                    ),
                    correctIndex = 1,
                    explanation = "La escritura cuneiforme, creada por los sumerios hacia el 3300 a.C. mediante incisiones en forma de cuña sobre tablillas de arcilla húmeda, fue el primer sistema formal de escritura del mundo.",
                    subject = "Historia Universal",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "hu_t02_s02",
            subjectId = "historia_universal",
            semana = 2,
            subtema = "2.2 Imperio Asirio y Segundo Imperio Babilónico",
            title = "Imperio Asirio y Segundo Imperio Babilónico",
            theory = LessonTheory(
                id = "theory_hu_t02_s02",
                asignatura = "Historia Universal",
                semana = 2,
                titulo = "Imperio Asirio y Segundo Imperio Babilónico",
                resumen = "• Imperio Asirio (Capitales: Assur y Nínive):\n  - Pueblo de semitas pastores del norte de Mesopotamia caracterizado por su crueldad militar extrema y armamento de hierro (carros de guerra, catapultas, caballería).\n  - Monarcas Destacados:\n    - Sargón II: Conquistó el Reino de Israel (722 a.C.) y deportó a las 10 tribus.\n    - Senaquerib: Destruyó Babilonia y trasladó la capital a Nínive.\n    - Asurbanipal (Sardanápalo): Máxima expansión (conquistó Egipto capturando Tebas y Menfis) y fundó la monumental Biblioteca de Nínive con miles de tablillas de arcilla.\n  - Caída: Coalición de Medos (Ciaxares) y Caldeos (Nabopolasar) que destruyó Nínive en el 612 a.C.\n• Segundo Imperio Babilónico o Neobabilónico (612 - 539 a.C.):\n  - Rey Nabucodonosor II: Gran constructor; edificó los Jardines Colgantes de Babilonia, la Puerta de Ishtar y el zigurat Etemenanki (Torre de Babel).\n  - El Cautiverio de Babilonia: Conquistó el Reino de Judá (586 a.C.), destruyó el Templo de Salomón en Jerusalén y deportó a los hebreos a Babilonia.\n  - Caída de Babilonia: Conquistada por el rey persa Ciro II 'El Grande' en el 539 a.C.",
                conceptosClave = listOf(
                    "Asiria: maquinaria militar de hierro y capital en Nínive",
                    "Asurbanipal y la gran Biblioteca de Nínive",
                    "Nabucodonosor II: Jardines Colgantes y Cautiverio de Babilonia",
                    "Ciro II el Grande y la anexión persa en 539 a.C."
                ),
                formulas = listOf(
                    "\\text{Coalición Medo-Caldea (612 a.C.)} \\implies \\text{Destrucción de Nínive y Caída Asiria}"
                ),
                formulaName = "Secuencia Imperial de Mesopotamia",
                formulaLatex = "\\text{Sumer} \\to \\text{Akkad} \\to \\text{Babilonia I} \\to \\text{Asiria} \\to \\text{Babilonia II (Neobabilónico)}",
                formulaDescription = "Evolución histórica de los centros hegemónicos en el valle mesopotámico.",
                admissionTip = "No confudas Asurbanipal (rey asirio de la biblioteca) con Nabucodonosor II (rey caldeo babilónico de los jardines colgantes y la toma de Jerusalén).",
                admissionExplanation = "• El fin definitivo de la Mesopotamia autóctona se sella cuando los persas aqueménidas toman Babilonia sin resistencia armada en 539 a.C."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t02_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El monarca neobabilónico que destruyó el Primer Templo de Jerusalén en el 586 a.C., deportando al pueblo hebreo en el célebre 'Cautiverio de Babilonia', fue:",
                    options = listOf(
                        "Hammurabi",
                        "Senaquerib",
                        "Nabucodonosor II",
                        "Asurbanipal",
                        "Sargón II"
                    ),
                    correctIndex = 2,
                    explanation = "Nabucodonosor II conquistó el reino de Judá, tomó Jerusalén en el 586 a.C., destruyó el templo salomónico y trasladó cautiva a la élite judía hacia Babilonia.",
                    subject = "Historia Universal",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "hu_t02_s03",
            subjectId = "historia_universal",
            semana = 2,
            subtema = "2.3 Egipto Antiguo: Periodización Dinástica y Sociedad",
            title = "Egipto Antiguo: Periodización Dinástica",
            theory = LessonTheory(
                id = "theory_hu_t02_s03",
                asignatura = "Historia Universal",
                semana = 2,
                titulo = "Egipto Antiguo: Periodización Dinástica y Sociedad",
                resumen = "• Espacio Geográfico: Valle del río Nilo en el noreste de África ('Egipto es un don del Nilo', según Heródoto). Dividido en Alto Egipto (valle sur) y Bajo Egipto (delta fértil norte).\n• Periodización Histórica:\n  1. Periodo Tinita (3100 a.C.): Menes o Narmer (Rey Escorpión) unifica el Alto y Bajo Egipto con la doble corona (Pschent). Capital en Tinis.\n  2. Imperio Antiguo o Menfita (2800 - 2200 a.C.): Capital en Menfis. Era de los constructores de pirámides de la IV dinastía: Keops, Kefrén y Micerino en la meseta de Guiza (arquitecto Imhotep diseña la pirámide escalonada de Zoser en Saqqara).\n  3. Imperio Medio o Tebano (2050 - 1750 a.C.): Mentuhotep II reunifica el país y traslada la capital a Tebas. Finaliza con la invasión de los Hicsos ('reyes pastores' de Asia, introdujeron el caballo, el carro de guerra y el hierro).\n  4. Imperio Nuevo o Neotebano (1550 - 1070 a.C.): Amosis I expulsa a los hicsos. Máximo esplendor y expansión imperial:\n     - Tutmosis III: El 'Napoleón egipcio', máxima expansión territorial hasta el río Éufrates.\n     - Hatshepsut: Reina-faraón de gran apogeo comercial hacia Punt.\n     - Amenofis IV (Akenatón): Reforma monoteísta hacia el dios Atón (disco solar) para quebrar el poder político de los sacerdotes tebanos de Amón-Ra; capital en Tell el-Amarna.\n     - Tutankamón: Restableció el politeísmo de Amón. Su tumba intacta fue descubierta en 1922 por Howard Carter.\n     - Ramsés II: Firmó el Tratado de Qadesh (1274 a.C.) con los hititas (primer tratado de paz internacional de la historia) y construyó los templos de Abu Simbel.",
                conceptosClave = listOf(
                    "Menes / Narmer: unificación de coronas y primera dinastía",
                    "Imperio Antiguo: pirámides de Guiza (Keops, Kefrén, Micerino)",
                    "Invasión de los Hicsos: introducción del carro de combate y caballo",
                    "Amenofis IV (Akenatón): reforma monoteísta atoniana en Amarna",
                    "Ramsés II y el Tratado de Qadesh con los hititas"
                ),
                formulas = listOf(
                    "\\text{Tratado de Qadesh (1274 a.C.)} = \\text{Primer tratado de paz internacional firmado en la historia}"
                ),
                formulaName = "Secuencia de los Imperios Egipcios",
                formulaLatex = "\\text{Tinita} \\to \\text{Menfita (Antiguo)} \\to \\text{Medio (Tebano)} \\to \\text{Imperio Nuevo (Apogeo)}",
                formulaDescription = "Línea temporal de consolidación política del Estado faraónico unificado.",
                admissionTip = "La reforma de Akenatón no fue un capricho religioso: fue un golpe político del faraón para despojar del poder económico y territorial al clero del dios Amón de Tebas.",
                admissionExplanation = "• El Tratado de Qadesh es pregunta recurrente en la UNSA por ser el acuerdo diplomático formal más antiguo conservado por la humanidad."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t02_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante el Imperio Nuevo egipcio, el faraón Amenofis IV (Akenatón) ejecutó una drástica reforma religiosa de carácter monoteísta imponiendo el culto al dios Atón, con el propósito político principal de:",
                    options = listOf(
                        "Facilitar la alianza militar con los invasores hicsos",
                        "Restar poder e influencia económica a la casta sacerdotal tebana de Amón",
                        "Imitar la estructura politeísta del Imperio Hitita",
                        "Financiar la construcción de las pirámides de Guiza",
                        "Convertir al faraón en un rey subordinado al pueblo"
                    ),
                    correctIndex = 1,
                    explanation = "La implantación del monoteísmo solar en torno a Atón y el traslado de la capital a Tell el-Amarna buscaban quebrar la hegemonía política, económica y territorial que habían acumulado los sacerdotes tebanos de Amón.",
                    subject = "Historia Universal",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "hu_t02_s04",
            subjectId = "historia_universal",
            semana = 2,
            subtema = "2.4 Religión, Cosmovisión y Aportes Culturales Egipcios",
            title = "Religión, Cosmovisión y Aportes Egipcios",
            theory = LessonTheory(
                id = "theory_hu_t02_s04",
                asignatura = "Historia Universal",
                semana = 2,
                titulo = "Religión, Cosmovisión y Aportes Egipcios",
                resumen = "• Cosmovisión Religiosa: Politeísta, antropomorfa y zoomorfa (seres con cuerpo humano y cabeza de animal). Creencia ferviente en la vida de ultratumba (Ka = alma/fuerza vital).\n• Juicio de los Muertos (Tribunal de Osiris):\n  - El corazón del difunto (Ieb) se pesa en la balanza de Maat (diosa de la justicia y la verdad) contra la Pluma de la Verdad, bajo la supervisión de Anubis.\n  - Si el corazón pesa igual o menos que la pluma, el alma entra al Aaru (paraíso de Osiris). Si pesa más por sus pecados, el monstruo Ammyt devora su corazón.\n  - Libro de los Muertos: Conjunto de fórmulas mágicas y oraciones funerarias para sortear los peligros del inframundo (Duat).\n• Momificación: Técnica médica para preservar el cuerpo físico íntegro, morada del Ka.\n• Sistemas de Escritura:\n  1. Jeroglífica: Sagrada, pictográfica, en templos y tumbas (descifrada por Jean-François Champollion en 1822 mediante la Piedra de Rosetta).\n  2. Hierática: Cursiva simplificada usada por sacerdotes y escribas sobre papiro.\n  3. Demótica: Popular, usada para trámites comerciales y jurídicos cotidianos.",
                conceptosClave = listOf(
                    "Juicio de Osiris: pesado del corazón contra la pluma de Maat",
                    "Libro de los Muertos como guía ritual para el Duat",
                    "Preservación corporal mediante la momificación para el Ka",
                    "Piedra de Rosetta y Champollion: desciframiento jeroglífico"
                ),
                formulas = listOf(
                    "\\text{Piedra de Rosetta} \\implies \\text{Jeroglífico + Demótico + Griego clásico} \\implies \\text{Desciframiento (Champollion)}"
                ),
                formulaName = "Estructura de la Escritura Egipcia",
                formulaLatex = "\\text{Jeroglífica (Monumental)} \\to \\text{Hierática (Sacerdotal)} \\to \\text{Demótica (Popular)}",
                formulaDescription = "Evolución y estratificación sociolingüística de los sistemas gráficos del Antiguo Egipto.",
                admissionTip = "La Piedra de Rosetta contenía el mismo texto escrito en tres tipos de caracteres: jeroglífico, demótico y griego antiguo. Conocer el griego permitió a Champollion traducir los jeroglíficos.",
                admissionExplanation = "• Las tumbas egipcias evolucionaron en su forma: primero fueron mastabas (tronco-piramidales), luego pirámides monumentales y finalmente hipogeos (tumbas subterráneas excavadas en la roca del Valle de los Reyes)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t02_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la cosmovisión egipcia, el ritual funerario en el cual el corazón del difunto era pesado en una balanza frente a la pluma de la verdad para determinar su acceso a la vida eterna era presidido por el dios:",
                    options = listOf("Anubis", "Osiris", "Amón", "Horus", "Seth"),
                    correctIndex = 1,
                    explanation = "El Tribunal de los Muertos era presidido por Osiris (dios supremo del inframundo y la resurrección), asistido por Anubis (dios chacal embalsamador) y Thot (dios escriba que registraba el veredicto).",
                    subject = "Historia Universal",
                    semana = 2
                )
            )
        ),

        // =========================================================================
        // TEMA 03: ANTIGÜEDAD CLÁSICA: GRECIA Y ROMA (Semana 3)
        // =========================================================================
        LessonNode(
            id = "hu_t03_s01",
            subjectId = "historia_universal",
            semana = 3,
            subtema = "3.1 Grecia: Civilizaciones Egeas, Esparta y Atenas",
            title = "Civilizaciones Egeas, Esparta y Atenas",
            theory = LessonTheory(
                id = "theory_hu_t03_s01",
                asignatura = "Historia Universal",
                semana = 3,
                titulo = "Civilizaciones Egeas, Esparta y Atenas",
                resumen = "• Civilizaciones Prehelénicas Egeas:\n  - Cretense o Minoica (Isla de Creta, palacio de Cnosos): Talasocracia comercial pacífica, escritura Lineal A (no descifrada) y mito del Minotauro.\n  - Micénica (Peloponeso, Micenas, Tirinto): Ciudades amuralladas, aqueos belicosos (Guerra de Troya), escritura Lineal B (Michael Ventris). Destruida por la invasión de los Dorios con armas de hierro.\n• Las Polis Griegas (Ciudades-Estado Autónomas):\n  - Esparta (Península del Peloponeso, Laconia):\n    - Origen: Dorios.\n    - Sociedad: Espartiatas u homoioi (ciudadanos guerreros con plenos derechos), periecos (artesanos y comerciantes libres sin derechos políticos) e ilotas (siervos del Estado sin derechos atados a la tierra).\n    - Política: Diarquía militar, Gerusía (consejo de 28 ancianos mayores de 60 años), Éforos (5 magistrados fiscalizadores) y Apella (asamblea popular).\n    - Legislador legendario: Licurgo (fundó el severo sistema de educación militar o agogé).\n  - Atenas (Península del Ática):\n    - Origen: Jonios. Desarrollo de la democracia clásica.\n    - Evolución Legislativa: Dracón (leyes severas escritas en sangre), Solón (anuló las deudas, abolió la esclavitud por deudas y dividió la sociedad por timocracia/riqueza), Clístenes (padre de la democracia: dividió el Ática en 10 demos/tribus e implantó el Ostracismo o destierro político contra aspirantes a tiranos).\n    - Siglo de Pericles (Siglo V a.C.): Apogeo de la Democracia Directa (los ciudadanos varones libres participaban en la Eclesía o asamblea popular) y esplendor artístico de la Acrópolis (Partenón con Fidias).",
                conceptosClave = listOf(
                    "Talasocracia cretense vs militarismo micénico aqueo",
                    "Esparta: diarquía, gerusía, ilotas y agogé de Licurgo",
                    "Atenas: de Dracón y Solón a Clístenes (Ostracismo)",
                    "Pericles: apogeo democrático eclesial y esplendor artístico del Partenón"
                ),
                formulas = listOf(
                    "\\text{Clístenes} \\implies \\text{Democracia (Isonomía)} + \\text{Ostracismo (Destierro por 10 años)}"
                ),
                formulaName = "Evolución Política de Atenas",
                formulaLatex = "\\text{Monarquía} \\to \\text{Aristocracia} \\to \\text{Timocracia (Solón)} \\to \\text{Tiranía (Pisístrato)} \\to \\text{Democracia (Clístenes)}",
                formulaDescription = "Secuencia de regímenes políticos atenienses que culminó en la primera democracia directa ciudadana.",
                admissionTip = "Recuerda a los legisladores atenienses con esta mnemotecnia: Dracón = Severidad escrita; Solón = Eliminó deudas; Clístenes = Creó la democracia y el ostracismo; Pericles = Esplendor de oro.",
                admissionExplanation = "• En la democracia ateniense solo participaban los ciudadanos (varones libres mayores de edad de padre y madre atenienses). Estaban excluidas las mujeres, los esclavos y los metecos (extranjeros)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t03_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El legislador ateniense considerado el 'Padre de la Democracia' por reorganizar a los ciudadanos en diez tribus e instaurar la institución del Ostracismo para prevenir la tiranía fue:",
                    options = listOf("Dracón", "Solón", "Pisístrato", "Clístenes", "Pericles"),
                    correctIndex = 3,
                    explanation = "Clístenes (508 a.C.) reformó el sistema político dividiendo a los ciudadanos en 10 tribus según su lugar de residencia (demos) para garantizar la igualdad ante la ley (isonomía) e instituyó el ostracismo: el destierro por 10 años para cualquier ciudadano sospechoso de conspirar contra la democracia.",
                    subject = "Historia Universal",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "hu_t03_s02",
            subjectId = "historia_universal",
            semana = 3,
            subtema = "3.2 Guerras Médicas, del Peloponeso y Periodo Helenístico",
            title = "Guerras Médicas, Peloponeso y Helenismo",
            theory = LessonTheory(
                id = "theory_hu_t03_s02",
                asignatura = "Historia Universal",
                semana = 3,
                titulo = "Guerras Médicas, Peloponeso y Helenismo",
                resumen = "• Guerras Médicas (492 - 449 a.C.): Conflicto entre las polis griegas y el Imperio Persa Aqueménida por el control comercial del mar Egeo.\n  - 1ra Guerra: Darío I invade Grecia; victoria ateniense de Milcíades en la Batalla de Maratón (490 a.C.).\n  - 2da Guerra: Jerjes invade Grecia. Sacrificio de Leónidas en el paso de las Termópilas (480 a.C.); victoria naval griega de Temístocles en Salamina y batallas terrestres de Platea y Micala.\n  - Consecuencia: Paz de Calias (449 a.C.), hegemonía ateniense y creación de la Liga de Delos.\n• Guerra del Peloponeso (431 - 404 a.C.): Guerra civil panhelénica entre la Liga de Delos (democrática, liderada por Atenas) y la Liga del Peloponeso (aristocrática, liderada por Esparta).\n  - Causa: Rechazo al imperialismo ateniense y pugna de modelos políticos.\n  - Consecuencia: Triunfo de Esparta (apoyada con oro persa) en la batalla naval de Egospótamos (Lisandro); ruina económica y decadencia de las polis griegas, abriendo el camino para la hegemonía macedónica.\n• Periodo Helenístico:\n  - Filipo II de Macedonia somete a las polis griegas en la Batalla de Queronea (338 a.C.).\n  - Alejandro Magno: Conquistó el Imperio Persa, Egipto y llegó hasta el río Indo en la India. Fundó Alejandría.\n  - Helenismo: Síntesis cultural de la civilización griega (occidental) con las culturas de Oriente (Egipto, Mesopotamia, Persia).",
                conceptosClave = listOf(
                    "Guerras Médicas: griegos vs persas (Maratón, Salamina, Paz de Calias)",
                    "Guerra del Peloponeso: Atenas (Delos) vs Esparta (Peloponeso)",
                    "Filipo II y la Batalla de Queronea",
                    "Alejandro Magno y la difusión del Helenismo (Oriente + Occidente)"
                ),
                formulas = listOf(
                    "\\text{Helenismo} = \\text{Cultura Griega (Hélade)} + \\text{Culturas Orientales (Egipto/Persia)}"
                ),
                formulaName = "Fórmula del Helenismo",
                formulaLatex = "\\text{Cultura Occidental Clásica} \\times \\text{Tradición Oriental} = \\text{Civilización Helenística}",
                formulaDescription = "Fenómeno de hibridación sociocultural cosmopolita impulsado tras las conquistas ecuménicas de Alejandro Magno.",
                admissionTip = "No confudas: las Guerras Médicas unieron a los griegos contra un invasor extranjero (Persia); la Guerra del Peloponeso los enfrentó entre sí (Atenas vs Esparta).",
                admissionExplanation = "• A la muerte de Alejandro Magno en Babilonia (323 a.C.), su imperio fue fragmentado entre sus generales (los diádocos: Ptolomeo en Egipto, Seleuco en Asia, Antígono en Macedonia)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t03_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La trascendencia histórica de las campañas de conquista de Alejandro Magno residió principalmente en que permitieron:",
                    options = listOf(
                        "La restauración definitiva de la democracia en todas las ciudades griegas",
                        "La difusión y fusión de la cultura griega con las tradiciones de Oriente, originando el Helenismo",
                        "La destrucción total de la cultura egipcia y babilónica sin dejar vestigios",
                        "La expulsión de los persas de la península itálica",
                        "El establecimiento del cristianismo como religión oficial en Asia"
                    ),
                    correctIndex = 1,
                    explanation = "La expansión ecuménica de Alejandro Magno propició la fusión de la cosmovisión racional helena con la sabiduría y misticismo de los pueblos conquistados (Egipto, Mesopotamia y Persia), dando nacimiento al periodo Helenístico.",
                    subject = "Historia Universal",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "hu_t03_s03",
            subjectId = "historia_universal",
            semana = 3,
            subtema = "3.3 Roma: De la Monarquía a la República",
            title = "Roma: Monarquía y República",
            theory = LessonTheory(
                id = "theory_hu_t03_s03",
                asignatura = "Historia Universal",
                semana = 3,
                titulo = "Roma: Monarquía y República",
                resumen = "• Monarquía Romana (753 - 509 a.C.):\n  - Fundación mítica por Rómulo y Remo a orillas del río Tíber (Península Itálica).\n  - Dinastías: Latino-Sabina (Rómulo, Numa Pompilio, Tulio Hostilio, Anco Marcio) y Etrusca (Tarquino el Antiguo, Servio Tulio, Tarquino el Soberbio, expulsado por tirano en el 509 a.C.).\n• República Romana (509 - 27 a.C.):\n  - Instituciones Clave: Senado (órgano supremo aristocrático patricio), Cónsules (2 jefes de gobierno y ejército con mandato de 1 año) y Comicios/Asambleas populares.\n  - Lucha Social entre Patricios (nobles terratenientes) y Plebeyos (ciudadanos comunes sin privilegios):\n    - Huelga del Monte Sacro (494 a.C.): Creación del Tribuno de la Plebe con poder de veto (intercessio) para proteger a los plebeyos.\n    - Ley de las XII Tablas (451 a.C.): Primera ley escrita que garantizó igualdad judicial básica.\n    - Ley Canuleya (445 a.C.): Permitió el matrimonio mixto entre patricios y plebeyos.\n    - Ley Licinia (367 a.C.): Acceso de los plebeyos al consulado y limitación de tierras públicas.\n    - Ley Hortensia (287 a.C.): Los plebiscitos adquieren fuerza de ley vinculante para toda Roma.\n  - Expansión en el Mediterráneo: Guerras Púnicas (264 - 146 a.C.) contra Cartago (general Aníbal Barca derrotado por Escipión el Africano en Zama). Roma se convierte en dueña absoluta del Mare Nostrum.",
                conceptosClave = listOf(
                    "Monarquía: Rómulo, Servio Tulio y expulsión de Tarquino el Soberbio",
                    "República: Senado, cónsules y magistraturas colegiadas",
                    "Conquistas plebeyas: Tribuno de la plebe, XII Tablas, Canuleya, Licinia, Hortensia",
                    "Guerras Púnicas contra Cartago y control del Mare Nostrum"
                ),
                formulas = listOf(
                    "\\text{Leyes plebeyas: } \\text{XII Tablas (Escrita)} \\to \\text{Canuleya (Matrimonio)} \\to \\text{Licinia (Consulado)} \\to \\text{Hortensia (Plebiscito)}"
                ),
                formulaName = "Secuencia de Conquistas Plebeyas en Roma",
                formulaLatex = "\\text{Tribuno Plebe} \\to \\text{XII Tablas} \\to \\text{Canuleya} \\to \\text{Licinia} \\to \\text{Hortensia}",
                formulaDescription = "Secuencia jurídica fundamental de democratización del Estado republicano romano.",
                admissionTip = "Mnemotecnia de las leyes romanas: C-L-H (Canuleya = Casamiento; Licinia = Liderazgo/Consulado; Hortensia = Hechos de ley para plebiscitos).",
                admissionExplanation = "• Tras derrotar a Cartago en las Guerras Púnicas, el mar Mediterráneo pasó a ser llamado por los romanos Mare Nostrum ('Nuestro Mar')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t03_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la Roma republicana, la gran conquista social plebeya que estableció que los plebiscitos votados en asambleas populares tendrían fuerza de ley obligatoria para toda la población fue la:",
                    options = listOf(
                        "Ley Canuleya",
                        "Ley Ogulnia",
                        "Ley Licinia",
                        "Ley Hortensia",
                        "Ley de las Doce Tablas"
                    ),
                    correctIndex = 3,
                    explanation = "La Lex Hortensia (287 a.C.) consagró que las resoluciones tomadas por los plebeyos en sus asambleas (plebiscitos) tenían rango de ley general obligatoria para todos los ciudadanos romanos, fuesen plebeyos o patricios.",
                    subject = "Historia Universal",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "hu_t03_s04",
            subjectId = "historia_universal",
            semana = 3,
            subtema = "3.4 Crisis de la República, Imperio Romano y Caída",
            title = "Crisis de la República, Imperio y Decadencia",
            theory = LessonTheory(
                id = "theory_hu_t03_s04",
                asignatura = "Historia Universal",
                semana = 3,
                titulo = "Crisis de la República, Imperio y Decadencia",
                resumen = "• Crisis de la República (Siglo I a.C.):\n  - Hermanos Graco (Tiberio y Cayo): Intentaron reformas agrarias para redistribuir tierras a los campesinos arruinados por los latifundios; ambos fueron asesinados por la oligarquía senatorial.\n  - Guerras Civiles: Mario (populares) vs Sila (optimates); rebelión de esclavos de Espartaco (73 a.C.).\n  - Primer Triunvirato: Julio César, Pompeyo y Craso. César derrota a Pompeyo en Farsalia y es nombrado dictador perpetuo; es asesinado en los Idus de Marzo (44 a.C.).\n  - Segundo Triunvirato: Octavio, Marco Antonio y Lépido. Octavio vence a Marco Antonio y Cleopatra en la Batalla de Accio (31 a.C.).\n• El Imperio Romano:\n  - Principado o Alto Imperio: Octavio recibe los títulos de Augusto e Imperator (27 a.C.). Inicia la Pax Romana (época dorada, florecimiento del Derecho Romano).\n  - Máxima Expansión: Emperador Trajano (conquista Dacia, Mesopotamia).\n  - Edicto de Caracalla (212 d.C.): Concede la ciudadanía romana a todos los hombres libres del Imperio.\n• Bajo Imperio y Caída:\n  - Constantino I: Promulga el Edicto de Milán (313 d.C., tolerancia al cristianismo) y traslada la capital a Bizancio (Constantinopla).\n  - Teodosio: Promulga el Edicto de Tesalónica (380 d.C., cristianismo como religión oficial única) y en 395 d.C. divide el Imperio entre sus hijos:\n    - Occidente (Honorio, capital Milán/Rávena): Cae en 476 d.C. cuando el hérulo Odoacro depone al último emperador Rómulo Augústulo (marca el FIN DE LA EDAD ANTIGUA).\n    - Oriente (Arcadio, capital Constantinopla): Sobrevivió 1000 años más como Imperio Bizantino hasta 1453.",
                conceptosClave = listOf(
                    "Hermanos Graco y la reforma agraria frustrada",
                    "Julio César, cruce del Rubicón e Idus de Marzo",
                    "Octavio Augusto, primer emperador y Pax Romana",
                    "Edicto de Milán (Constantino) y Edicto de Tesalónica (Teodosio)",
                    "División del imperio en 395 d.C. y caída de Occidente en 476 d.C."
                ),
                formulas = listOf(
                    "313 \\text{ d.C. (Milán: Tolerancia cristiana)} \\to 380 \\text{ d.C. (Tesalónica: Religión oficial)} \\to 476 \\text{ d.C. (Caída de Occidente)}"
                ),
                formulaName = "Línea Temporal de la Cristianización y Caída de Roma",
                formulaLatex = "\\text{Milán (Tolerancia)} \\to \\text{Tesalónica (Oficial)} \\to \\text{División Teodosiana (395)} \\to \\text{Caída de Occidente (476)}",
                formulaDescription = "Secuencia de hitos jurídicos y políticos que condujeron a la desintegración del Imperio Romano Occidental.",
                admissionTip = "¡Cuidado con los edictos!: Edicto de Milán (Constantino) = TOLERANCIA al cristianismo; Edicto de Tesalónica (Teodosio) = Cristianismo como religión OFICIAL y obligatoria.",
                admissionExplanation = "• La caída del Imperio Romano de Occidente en el 476 d.C. es el hito cronológico universal que señala el fin de la Edad Antigua y el inicio de la Edad Media."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t03_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El emperador romano que oficializó el cristianismo como la única religión legal del Imperio mediante la promulgación del Edicto de Tesalónica en el 380 d.C. fue:",
                    options = listOf("Nerón", "Trajano", "Constantino I", "Teodosio", "Diocleciano"),
                    correctIndex = 3,
                    explanation = "Teodosio I 'El Grande' promulgó el Edicto de Tesalónica (380 d.C.), proscribiendo los cultos paganos y convirtiendo al cristianismo católico niceno en la religión oficial y exclusiva del Imperio Romano.",
                    subject = "Historia Universal",
                    semana = 3
                )
            )
        ),

        // =========================================================================
        // TEMA 04: EDAD MEDIA: FEUDALISMO, ISLAM Y CRUZADAS (Semana 4)
        // =========================================================================
        LessonNode(
            id = "hu_t04_s01",
            subjectId = "historia_universal",
            semana = 4,
            subtema = "4.1 Reinos Germánicos, Imperio Carolingio y Bizancio",
            title = "Reinos Germánicos, Carolingios y Bizancio",
            theory = LessonTheory(
                id = "theory_hu_t04_s01",
                asignatura = "Historia Universal",
                semana = 4,
                titulo = "Reinos Germánicos, Imperio Carolingio y Bizancio",
                resumen = "• Reinos Bárbaro-Germánicos: Visigodos (España), Ostrogodos y Lombardos (Italia), Francos (Galia/Francia), Anglos y Sajones (Inglaterra).\n• Imperio Carolingio (Siglos VIII - IX):\n  - Dinastía Carolingia iniciada por Pipino el Breve. Máximo esplendor con Carlomagno, coronado Emperador en Roma por el papa León III en la Navidad del año 800.\n  - Organización Territorial: Condados (provincias interiores gobernadas por condes), Marcas (provincias fronterizas militarizadas gobernadas por marqueses) y Ducados. Inspectores reales: Missi Dominici ('Enviados del Señor').\n  - Renacimiento Carolingio: Creación de la Escuela Palatina de Aquisgrán dirigida por Alcuino de York (enseñanza de las 7 artes liberales: Trivium [Gramática, Retórica, Dialéctica] y Quadrivium [Aritmética, Geometría, Astronomía, Música]).\n  - Desintegración: Tras la muerte de Ludovico Pío, sus hijos firman el Tratado de Verdún (843 d.C.), dividiendo el imperio en Francia Occidental (Carlos el Calvo), Germania (Luis el Germánico) y Lotaringia/Italia (Lotario). Base del feudalismo europeo.\n• Imperio Bizantino (Imperio Romano de Oriente, 395 - 1453):\n  - Capital: Constantinopla (Bizancio / actual Estambul), cruce estratégico de rutas comerciales marítimas y terrestres.\n  - Emperador Justiniano (Siglo VI): Máxima expansión (intentó reconstruir el Imperio Romano reconquistando Italia y el norte de África), construyó la monumental Basílica de Santa Sofía (Hagia Sophia) y codificó el Corpus Iuris Civilis (Derecho Romano sistematizado).\n  - Cisma de Oriente (1054): Ruptura definitiva entre la Iglesia Católica de Roma y la Iglesia Ortodoxa Griega de Constantinopla.",
                conceptosClave = listOf(
                    "Carlomagno: coronación imperial en el 800 y Escuela Palatina",
                    "Tratado de Verdún (843 d.C.): división y origen de Francia y Alemania",
                    "Justiniano bizantino: Santa Sofía y Corpus Iuris Civilis",
                    "Cisma de Oriente (1054): separación de la Iglesia Ortodoxa"
                ),
                formulas = listOf(
                    "\\text{Tratado de Verdún (843)} \\implies \\text{Francia (Carlos)} + \\text{Germania (Luis)} + \\text{Lotaringia (Lotario)}"
                ),
                formulaName = "División Carolingia y Nacimiento de Europa",
                formulaLatex = "\\text{Imperio de Carlomagno} \\xrightarrow{\\text{Tratado de Verdún}} \\text{Francia} \\;\\cup\\; \\text{Alemania} \\;\\cup\\; \\text{Italia}",
                formulaDescription = "Tratado que fragmentó el Imperio Carolingio y sentó los límites territoriales de los futuros Estados de Europa occidental.",
                admissionTip = "Las artes liberales medievales eran: Trivium (letras: Gramática, Retórica, Dialéctica) y Quadrivium (ciencias: Aritmética, Geometría, Astronomía, Música).",
                admissionExplanation = "• El Corpus Iuris Civilis de Justiniano fue la obra jurídica fundamental que transmitió el legado del Derecho Romano a la Europa medieval y moderna."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t04_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El documento diplomático firmado en el año 843 d.C. que puso fin a la guerra civil entre los nietos de Carlomagno, fragmentando el Imperio Carolingio y sentando las bases feudales de Francia y Alemania, fue el:",
                    options = listOf(
                        "Edicto de Milán",
                        "Tratado de Verdún",
                        "Pacto de Aquisgrán",
                        "Tratado de Tordesillas",
                        "Edicto de Worms"
                    ),
                    correctIndex = 1,
                    explanation = "El Tratado de Verdún (843 d.C.) dividió el Imperio Carolingio entre Carlos el Calvo, Luis el Germánico y Lotario, desintegrando la unidad imperial y acelerando la instauración del sistema feudal.",
                    subject = "Historia Universal",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "hu_t04_s02",
            subjectId = "historia_universal",
            semana = 4,
            subtema = "4.2 El Islam: Mahoma, Expansión y Aportes Culturales",
            title = "El Islam: Mahoma y el Imperio Musulmán",
            theory = LessonTheory(
                id = "theory_hu_t04_s02",
                asignatura = "Historia Universal",
                semana = 4,
                titulo = "El Islam: Mahoma, Expansión y Aportes Culturales",
                resumen = "• Origen: Península Arábiga en el Siglo VII d.C. Tribus semitas nómadas (beduinos) unificadas bajo una nueva fe monoteísta por el profeta Mahoma.\n• El Profeta Mahoma:\n  - Nació en La Meca (tribu Coraichita). Recibió la revelación del arcángel Gabriel para predicar a Alá como único dios.\n  - La Hégira (622 d.C.): Huida de Mahoma de La Meca a Medina perseguido por los mercaderes paganos. Marca el AÑO CERO del calendario musulmán.\n  - En el 630 d.C. toma La Meca y purifica la Kaaba de ídolos paganos.\n• Doctrina Islámica:\n  - Libro Sagrado: El Corán (114 suras o capítulos). La Sunna (dichos y hechos del profeta).\n  - Los 5 Pilares del Islam: 1. Profesión de fe (Shahada: 'No hay más dios que Alá y Mahoma su profeta'); 2. Oración 5 veces al día hacia La Meca; 3. Limosna obligatoria (Zakat); 4. Ayuno en el mes de Ramadán; 5. Peregrinación a La Meca al menos una vez en la vida (Hajj).\n• Fases de la Expansión Musulmana:\n  1. Califato Ortodoxo (632 - 661, Medina): Conquistaron Siria, Palestina, Egipto y el Imperio Sasánida persa.\n  2. Califato Omeya (661 - 750, Damasco): Máxima expansión imperial. Conquistaron el norte de África y España (711 d.C., batalla de Guadalete). Su avance en Europa fue detenido por Carlos Martel en la Batalla de Poitiers (Francia, 732 d.C.).\n  3. Califato Abasí (750 - 1258, Bagdad): Época de oro cultural y científico. Destruido por los mongoles en 1258.\n• Aportes a la Humanidad: El álgebra (Al-Juarismi), los números arábigos y el concepto del cero, la alquimia (destilación, ácido sulfúrico), medicina (Avicena 'Canon de medicina', Averroes) y la preservación de la filosofía griega de Aristóteles.",
                conceptosClave = listOf(
                    "Mahoma y la Hégira (622 d.C., inicio del calendario islámico)",
                    "Los 5 pilares del Islam en el Corán",
                    "Batalla de Poitiers (732 d.C.): Carlos Martel frena a los musulmanes",
                    "Aportes: Álgebra (Al-Juarismi), numeración con cero y medicina de Avicena"
                ),
                formulas = listOf(
                    "\\text{Hégira (622 d.C.)} = \\text{Año 1 del calendario musulmán lunar}"
                ),
                formulaName = "Hito Cronológico del Islam",
                formulaLatex = "\\text{622 d.C. (Huida a Medina)} \\implies \\text{Punto de partida de la cronología islámica}",
                formulaDescription = "Acontecimiento fundacional a partir del cual el Islam se organiza como comunidad político-religiosa.",
                admissionTip = "La Batalla de Poitiers (732 d.C.) es clave: si Carlos Martel no hubiera vencido a los musulmanes, Francia y toda Europa occidental hubieran caído bajo dominio islámico.",
                admissionExplanation = "• Los musulmanes no obligaban a la conversión forzada a los pueblos del libro (judíos y cristianos), pero les cobraban un impuesto especial de protección (yizia)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t04_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El punto de partida del calendario musulmán (Hégira) conmemora el acontecimiento histórico ocurrido en el año 622 d.C. consistente en:",
                    options = listOf(
                        "La toma pacífica de la ciudad de Jerusalén",
                        "La huida de Mahoma desde La Meca hacia la ciudad de Medina",
                        "La redacción final de los versículos del Corán",
                        "La muerte de Mahoma y la coronación del primer califa",
                        "La victoria árabe en la Batalla de Poitiers"
                    ),
                    correctIndex = 1,
                    explanation = "La Hégira (año 622 d.C.) marca la huida o migración de Mahoma junto a sus seguidores desde La Meca hacia Yatrib (Medina), hecho que inaugura formalmente el calendario lunar islámico.",
                    subject = "Historia Universal",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "hu_t04_s03",
            subjectId = "historia_universal",
            semana = 4,
            subtema = "4.3 El Sistema Feudal: Sociedad, Economía y Vasallaje",
            title = "El Sistema Feudal: Señorío y Vasallaje",
            theory = LessonTheory(
                id = "theory_hu_t04_s03",
                asignatura = "Historia Universal",
                semana = 4,
                titulo = "El Sistema Feudal: Sociedad, Economía y Vasallaje",
                resumen = "• Feudalismo: Sistema político, económico y social imperante en Europa Occidental entre los siglos IX y XIII.\n• Causas de su Surgimiento:\n  1. Desintegración del Imperio Carolingio (debilitamiento de la autoridad monárquica).\n  2. Segundas invasiones bárbaras (siglo IX: vikingos/normandos, sarracenos y magiares/húngaros), que sembraron terror y obligaron a la población a buscar la protección armada de los señores locales en sus castillos amurallados.\n• Base Económica:\n  - La tierra (el feudo o señorío) es la principal fuente de riqueza y poder.\n  - Economía agraria de autoabastecimiento o autarquía (comercio casi nulo).\n  - División del Feudo: Reserva Señorial (tierras exclusivas cultivadas para el señor feudal) y Mansos (parcelas cedidas a los siervos para su subsistencia a cambio de tributos).\n• Sociedad Estamental Feudal (Inmutable y Jerárquica):\n  1. Bellatores (Los que luchan: nobleza feudal y caballeros).\n  2. Oratores (Los que rezan: clero católico, gran propietario de tierras y regulador moral).\n  3. Laboratores (Los que trabajan: siervos de la gleba atados a la tierra y campesinos libres/villanos).\n• Relación Feudo-Vasallática (Pacto Político-Militar entre Nobles Libres):\n  - Ceremonia del Homenaje: El vasallo se arrodilla, junta sus manos y jura fidelidad militar al señor feudal.\n  - Ceremonia de la Investidura: El señor feudal entrega al vasallo un símbolo de posesión del feudo (un cetro, un anillo o un puñado de tierra).",
                conceptosClave = listOf(
                    "Autarquía económica y ruralización de la sociedad",
                    "Tres estamentos medievales: Bellatores, Oratores y Laboratores",
                    "Relación feudo-vasallática: Homenaje (juramento) e Investidura (entrega del feudo)",
                    "Siervos de la gleba sometidos a tributos (corvea, gabela, diezmo)"
                ),
                formulas = listOf(
                    "\\text{Pacto de Vasallaje} = \\text{Homenaje (Fidelidad)} + \\text{Osculum (Beso)} + \\text{Investidura (Feudo)}"
                ),
                formulaName = "Contrato Feudo-Vasallático",
                formulaLatex = "\\text{Señor Feudal (Protección y Feudo)} \\iff \\text{Vasallo (Auxilium militar y Consilium consejo)}",
                formulaDescription = "Vínculo contractual bilateral de ayuda militar recíproca entre miembros de la clase dominante noble.",
                admissionTip = "No confudas: el vasallaje era un pacto de honor entre nobles libres (señor y vasallo). En cambio, la servidumbre era la explotación del señor sobre los campesinos desposeídos (siervos).",
                admissionExplanation = "• La corvea era el trabajo gratuito y forzoso que el siervo debía prestar obligatoriamente en las tierras de la reserva señorial."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t04_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la ceremonia de vasallaje feudal, el acto simbólico por el cual el señor otorgaba a su nuevo vasallo la posesión efectiva de un feudo mediante la entrega de un báculo, una espada o un puñado de tierra, se denominaba:",
                    options = listOf("Espaldarazo", "Homenaje", "Investidura", "Corvea", "Tregua de Dios"),
                    correctIndex = 2,
                    explanation = "La ceremonia feudo-vasallática constaba de dos fases: el Homenaje (donde el vasallo juraba lealtad arrodillado) y la Investidura (donde el señor feudal materializaba la concesión del beneficio o feudo entregando un símbolo territorial).",
                    subject = "Historia Universal",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "hu_t04_s04",
            subjectId = "historia_universal",
            semana = 4,
            subtema = "4.4 Las Cruzadas y el Renacimiento Urbano-Comercial",
            title = "Las Cruzadas y el Renacimiento Comercial",
            theory = LessonTheory(
                id = "theory_hu_t04_s04",
                asignatura = "Historia Universal",
                semana = 4,
                titulo = "Las Cruzadas y el Renacimiento Urbano-Comercial",
                resumen = "• Las Cruzadas (Siglos XI - XIII):\n  - Expediciones militares-religiosas organizadas por la cristiandad occidental para recuperar el Santo Sepulcro en Jerusalén, tomado por los turcos selyúcidas.\n  - Convocatoria: Papa Urbano II en el Concilio de Clermont (1095) al grito de '¡Dios lo quiere!' (Deus vult).\n  - Causas Reales: Interés expansionista de la nobleza feudal sin tierras (segundones), ansias papales de someter a la Iglesia ortodoxa bizantina y el afán comercial de ciudades italianas (Venecia, Génova).\n  - Campañas Principales:\n    - 1ra Cruzada (1096-1099): Cruzada Señorial (Godofredo de Bouillón). ÚNICA VICTORIA MILITAR que tomó Jerusalén y fundó los reinos latinos de Oriente.\n    - 3ra Cruzada ('Cruzada de los Reyes'): Ricardo Corazón de León (Inglaterra), Felipe II Augusto (Francia) y Federico Barbarroja (SIRG) contra el sultán Saladino. Saladino mantuvo Jerusalén pero permitió el peregrinaje desarmado.\n    - 4ta Cruzada ('Cruzada Comercial'): Financiada por Venecia; desvió su curso y saqueó la ciudad cristiana de Constantinopla (1204).\n• Consecuencias de las Cruzadas:\n  1. Decadencia del poder de los señores feudales (arruinados por los costos de guerra y bajas militares).\n  2. Fortalecimiento de las monarquías autoritarias europeas.\n  3. Reapertura de las rutas comerciales del Mar Mediterráneo entre Oriente y Occidente.\n  4. Renacimiento Urbano y Comercial: Reactivación de las ciudades (burgos), ferias comerciales (Champaña) y surgimiento de una nueva clase social: la Burguesía.",
                conceptosClave = listOf(
                    "Concilio de Clermont (1095) y Papa Urbano II",
                    "Primera Cruzada: única que conquistó Jerusalén militarmente",
                    "Tercera Cruzada: Ricardo Corazón de León vs Saladino",
                    "Consecuencia estructural: quiebre del feudalismo y reactivación comercial de la burguesía"
                ),
                formulas = listOf(
                    "\\text{Cruzadas} \\implies \\text{Debilitamiento de señores feudales} + \\text{Reapertura mediterránea} \\implies \\text{Burguesía}"
                ),
                formulaName = "Impacto Histórico de las Cruzadas",
                formulaLatex = "\\text{Campañas militares a Oriente} \\to \\text{Decadencia Feudal} \\to \\text{Renacimiento Urbano y Comercial}",
                formulaDescription = "Transición socioeconómica que catalizó la crisis del modo de producción feudal y dio auge a las ciudades medievales.",
                admissionTip = "La consecuencia más importante de las Cruzadas para el examen de admisión NO fue religiosa (Jerusalén quedó en manos musulmanas), sino ECONÓMICA: la reapertura comercial del Mediterráneo y el auge de la burguesía.",
                admissionExplanation = "• Los mercaderes que se establecieron en los extramuros de los castillos amurallados (burgos) fueron llamados 'burgueses', dando origen al capitalismo comercial."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t04_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La consecuencia socioeconómica de mayor trascendencia histórica originada por las Cruzadas en Europa Occidental fue:",
                    options = listOf(
                        "La consolidación perpetua del aislamiento autárquico de los feudos",
                        "El exterminio definitivo de la fe musulmana en el Cercano Oriente",
                        "La reapertura de las rutas comerciales del Mediterráneo y el renacimiento de las ciudades burguesas",
                        "La desaparición total de las monarquías autoritarias",
                        "El traslado de la Santa Sede papal a la ciudad de Constantinopla"
                    ),
                    correctIndex = 2,
                    explanation = "A pesar del fracaso religioso y militar a largo plazo, las Cruzadas restablecieron el comercio entre Oriente y Occidente a través del Mediterráneo, debilitaron a los señores feudales y fomentaron el crecimiento de las ciudades (burgos) y el ascenso de la burguesía mercantil.",
                    subject = "Historia Universal",
                    semana = 4
                )
            )
        ),

        // =========================================================================
        // TEMA 05: EDAD MODERNA: RENACIMIENTO, REFORMA E ILUSTRACIÓN (Semana 5)
        // =========================================================================
        LessonNode(
            id = "hu_t05_s01",
            subjectId = "historia_universal",
            semana = 5,
            subtema = "5.1 Humanismo y Renacimiento",
            title = "Humanismo y Renacimiento",
            theory = LessonTheory(
                id = "theory_hu_t05_s01",
                asignatura = "Historia Universal",
                semana = 5,
                titulo = "Humanismo y Renacimiento",
                resumen = "• Humanismo (Movimiento Intelectual y Filosófico, Siglos XIV - XV):\n  - Cuna: Ciudades-estado de la península itálica (Florencia, Venecia, Roma).\n  - Características: Antropocentrismo (el ser humano y la razón como centro del universo, desplazando al teocentrismo medieval), revaloración de la cultura grecolatina clásica, espíritu crítico e individualismo.\n  - Precursores: Dante Alighieri (Divina Comedia), Francesco Petrarca ('Padre del Humanismo', Cancionero) y Giovanni Boccaccio (Decamerón).\n  - Máximos Exponentes: Erasmo de Rotterdam ('Príncipe del Humanismo', Elogio de la locura), Tomás Moro (Utopía) y Nicolás Maquiavelo ('Padre de la ciencia política moderna', El Príncipe: 'el fin justifica los medios').\n  - Difusión: Invención de la imprenta de tipos móviles metálicos por Johannes Gutenberg (1450) y mecenazgo de burgueses ricos (los Médici en Florencia).\n• Renacimiento (Movimiento Artístico y Cultural, Siglos XV - XVI):\n  - Recreación de las formas grecorromanas, realismo anatómico, uso de la perspectiva lineal tridimensional y luces/sombras (claroscuro).\n  - Quattrocento (Siglo XV, Florencia): Brunelleschi (cúpula de la Catedral de Florencia), Donatello (escultura David de bronce) y Botticelli (El nacimiento de Venus).\n  - Cinquecento (Siglo XVI, Roma): Apogeo bajo el mecenazgo de los papas Julio II y León X:\n    - Leonardo da Vinci: Arquetipo del hombre universal (La Gioconda, La Última Cena, Hombre de Vitruvio).\n    - Miguel Ángel Buonarroti: Frescos de la Capilla Sixtina (La Creación de Adán, El Juicio Final) y esculturas sublimes (La Piedad, David de mármol, Moisés).\n    - Rafael Sanzio: La Escuela de Atenas (síntesis del saber clásico).",
                conceptosClave = listOf(
                    "Humanismo: antropocentrismo vs teocentrismo medieval",
                    "Petrarca (Padre del Humanismo) y Erasmo de Rotterdam",
                    "Imprenta de Gutenberg (1450) y mecenazgo de los Médici",
                    "Cinquecento en Roma: Da Vinci, Miguel Ángel y Rafael Sanzio"
                ),
                formulas = listOf(
                    "\\text{Humanismo (Filosofía / Ideas)} + \\text{Imprenta} \\implies \\text{Renacimiento (Arte / Ciencias)}"
                ),
                formulaName = "Articulación Humanismo-Renacimiento",
                formulaLatex = "\\text{Antropocentrismo} + \\text{Estudio Grecolatino} \\implies \\text{Revolución Cultural Moderna}",
                formulaDescription = "Tránsito ideológico de la tutela escolástica teocéntrica al racionalismo y antropocentrismo renacentista.",
                admissionTip = "Humanismo y Renacimiento no son lo mismo: el Humanismo fue el movimiento filosófico-literario; el Renacimiento fue su manifestación artística en pintura, escultura y arquitectura.",
                admissionExplanation = "• Maquiavelo inauguró la ciencia política al desligar la moral religiosa del ejercicio del poder estatal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t05_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El rasgo filosófico esencial que definió al movimiento humanista europeo de los siglos XIV y XV frente a la cosmovisión medieval escolástica fue:",
                    options = listOf(
                        "El dogmatismo teocéntrico absoluto",
                        "El antropocentrismo basado en la razón humana y la recuperación de los ideales clásicos",
                        "La defensa estricta del analfabetismo campesino",
                        "El rechazo frontal a toda manifestación de arte y literatura",
                        "La subordinación total de la ciencia a la Inquisición"
                    ),
                    correctIndex = 1,
                    explanation = "El Humanismo sustituyó el teocentrismo medieval (que ponía a Dios como causa y explicación de todo) por el antropocentrismo, exaltando la dignidad humana, la razón libre y el rescate de la cultura grecorromana.",
                    subject = "Historia Universal",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "hu_t05_s02",
            subjectId = "historia_universal",
            semana = 5,
            subtema = "5.2 La Expansión Europea y Grandes Descubrimientos",
            title = "Expansión Europea y Rutas Ultramarinas",
            theory = LessonTheory(
                id = "theory_hu_t05_s02",
                asignatura = "Historia Universal",
                semana = 5,
                titulo = "La Expansión Europea y Grandes Descubrimientos",
                resumen = "• Causas de la Expansión Ultramarina:\n  1. Causa Económica Principal: La toma de Constantinopla por los turcos otomanos (1453), que bloqueó las rutas terrestres de la seda y de las especias hacia las Indias orientales, obligando a buscar rutas alternas.\n  2. Avances Científicos y Técnicos: Invención y difusión de la brújula, astrolabio, carabela (embarcación ligera con velas latinas triangulares y cuadradas), cartas de navegación (portulanos) y la tesis de la esfericidad terrestre.\n  3. Consolidación de los Estados Monárquicos en Portugal y España.\n• La Empresa Portuguesa (Ruta de Circunnavegación Africana hacia el Este):\n  - Escuela Náutica de Sagres fundada por Enrique 'El Navegante'.\n  - Bartolomé Díaz (1488): Dobló el Cabo de las Tormentas (rebautizado como Cabo de Buena Esperanza).\n  - Vasco da Gama (1498): Logró llegar a Calicut en la India por mar.\n• La Empresa Española (Ruta Occidental hacia el Oeste):\n  - Cristóbal Colón presenta su proyecto a los Reyes Católicos (Isabel de Castilla y Fernando de Aragón), firmando la Capitulación de Santa Fe (1492).\n  - El 12 de octubre de 1492 arriba a la isla Guanahaní (San Salvador) en las Antillas.\n• Acuerdos Diplomáticos de Reparto del Mundo:\n  - Bula Inter Caetera (1493, Papa Alejandro VI): Línea a 100 leguas al oeste de las islas Azores y Cabo Verde.\n  - Tratado de Tordesillas (1494): España y Portugal acuerdan desplazar la línea imaginaria a 370 leguas al oeste de Cabo Verde, permitiendo a Portugal colonizar legalmente Brasil (Álvares Cabral, 1500).\n• Primera Vuelta al Mundo (1519 - 1522): Iniciada por Hernando de Magallanes (cruzó el estrecho que lleva su nombre) y culminada por Juan Sebastián Elcano a bordo de la nao Victoria.",
                conceptosClave = listOf(
                    "Toma de Constantinopla (1453): bloqueo de la ruta de especias",
                    "Proyecto portugués bordea África (Vasco da Gama llega a la India en 1498)",
                    "Capitulación de Santa Fe (1492) y llegada de Colón a América",
                    "Tratado de Tordesillas (1494): reparto del orbe a 370 leguas de Cabo Verde",
                    "Magallanes y Elcano: primera circunnavegación del globo terráqueo"
                ),
                formulas = listOf(
                    "\\text{Tratado de Tordesillas (1494)} \\implies 370 \\text{ leguas al oeste de Cabo Verde} \\implies \\text{Brasil para Portugal}"
                ),
                formulaName = "División Diplomática del Mundo Colonial",
                formulaLatex = "\\text{Bula Inter Caetera (100 leguas)} \\to \\text{Tratado de Tordesillas (370 leguas)}",
                formulaDescription = "Tratados luso-castellanos que demarcaron las áreas de exploración y conquista en el Atlántico.",
                admissionTip = "Recuerda quién demostró empíricamente la redondez de la Tierra: el viaje de expedición de Hernando de Magallanes y Juan Sebastián Elcano (1519-1522).",
                admissionExplanation = "• El impacto económico en Europa tras la conquista americana fue la 'Revolución de los Precios' (inflación masiva por la llegada de toneladas de plata del Potosí y Zacatecas)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t05_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El tratado diplomático suscrito entre los Reyes Católicos y la Corona de Portugal en 1494, que trazó una línea divisoria a 370 leguas al oeste de las islas de Cabo Verde para el reparto del Nuevo Mundo, fue el:",
                    options = listOf(
                        "Tratado de Verdún",
                        "Tratado de Utrecht",
                        "Tratado de Tordesillas",
                        "Capitulación de Toledo",
                        "Tratado de Versalles"
                    ),
                    correctIndex = 2,
                    explanation = "El Tratado de Tordesillas (1494) resolvió las disputas ultramarinas entre Castilla y Portugal desplazando el meridiano divisorio a 370 leguas al oeste de Cabo Verde, lo que posteriormente legitimó la ocupación portuguesa de la costa de Brasil.",
                    subject = "Historia Universal",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "hu_t05_s03",
            subjectId = "historia_universal",
            semana = 5,
            subtema = "5.3 Reforma Protestante y Contrarreforma Católica",
            title = "Reforma Protestante y Contrarreforma",
            theory = LessonTheory(
                id = "theory_hu_t05_s03",
                asignatura = "Historia Universal",
                semana = 5,
                titulo = "Reforma Protestante y Contrarreforma Católica",
                resumen = "• Reforma Religiosa Protestante (Siglo XVI):\n  - Movimiento de ruptura y renovación espiritual que fragmentó la unidad de la cristiandad occidental.\n  - Causas: Corrupción del clero (simonía o venta de cargos eclesiásticos, nicolaísmo o concubinato), acumulación de riquezas temporales y la venta indiscriminada de Indulgencias ordenada por el papa León X para financiar la Basílica de San Pedro.\n• Corrientes Protestantes Principales:\n  1. Luteranismo (Alemania): Martín Lutero clavó sus 95 Tesis en la iglesia de Wittenberg (1517). Doctrina: Justificación solo por la fe (Sola Fide), libre interpretación de la Biblia (Sola Scriptura), solo 2 sacramentos (Bautismo y Eucaristía), eliminación del clero célibe y de la autoridad papal. Apoyado por príncipes alemanes contra el emperador Carlos V (Paz de Augsburgo de 1555: 'Cuius regio, eius religio').\n  2. Calvinismo (Ginebra, Suiza): Juan Calvino postuló la Doctrina de la Doble Predestinación (Dios ya eligió quién se salva y quién se condena; el éxito económico y el trabajo riguroso son signos de gracia divina). Dio impulso ético al capitalismo burgués (Max Weber). Llamados hugonotes en Francia y puritanos en Inglaterra.\n  3. Anglicanismo (Inglaterra): Ruptura política impulsada por el rey Enrique VIII por motivos dinásticos (el papa Clemente VII se negó a anular su matrimonio con Catalina de Aragón). Promulgó el Acta de Supremacía (1534), erigiéndose como jefe supremo de la Iglesia de Inglaterra.\n• Contrarreforma Católica:\n  - Concilio de Trento (1545 - 1563): Ratificó los 7 sacramentos, el celibato sacerdotal, la autoridad suprema del Papa, el culto a la Virgen y los santos, y la validez exclusiva de la Biblia Vulgata latina.\n  - Compañía de Jesús (Jesuitas): Orden fundada por San Ignacio de Loyola (1534) bajo obediencia militar y voto de lealtad absoluta al Papa. Grandes educadores y misioneros en América y Asia.\n  - Tribunal de la Santa Inquisición y el Index (catálogo de libros prohibidos).",
                conceptosClave = listOf(
                    "Lutero y las 95 Tesis en Wittenberg (1517): Justificación por la Fe",
                    "Calvino y la Predestinación Absoluta (fundamento del espíritu capitalista)",
                    "Enrique VIII y el Acta de Supremacía (1534): Iglesia Anglicana",
                    "Concilio de Trento y fundación de los Jesuitas por Ignacio de Loyola"
                ),
                formulas = listOf(
                    "\\text{Lutero: Sola Fide (Fe)} \\quad \\text{vs} \\quad \\text{Calvino: Predestinación} \\quad \\text{vs} \\quad \\text{Enrique VIII: Poder Político}"
                ),
                formulaName = "Cuadro Comparativo de Reformadores",
                formulaLatex = "\\text{Luteranismo (Alemania)} \\;\\mid\\; \\text{Calvinismo (Suiza)} \\;\\mid\\; \\text{Anglicanismo (Inglaterra)}",
                formulaDescription = "Tríada de cismas religiosos que desarticularon la hegemonía papal en la Europa moderna.",
                admissionTip = "Diferencia doctrinaria clave: Lutero sostiene que el hombre se salva por la FE personal; Calvino afirma que la salvación ya está decidida por PREDESTINACIÓN divina antes de nacer.",
                admissionExplanation = "• El Acta de Supremacía de 1534 convirtió al monarca inglés en la cabeza terrenal y espiritual de la Iglesia anglicana hasta el día de hoy."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t05_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El postulado teológico central de Juan Calvino que vinculó el éxito laboral y material terrenal con la señal de la elección y salvación divina en el más allá fue:",
                    options = listOf(
                        "La justificación exclusiva por la compra de indulgencias",
                        "La doctrina de la doble predestinación divina",
                        "La infalibilidad absoluta del pontífice romano",
                        "La transustanciación litúrgica del pan y vino",
                        "La abolición del bautismo y la eucaristía"
                    ),
                    correctIndex = 1,
                    explanation = "La doctrina de la Predestinación de Calvino establecía que la salvación del alma era un designio inmutable fijado por Dios desde la eternidad, interpretándose la disciplina laboral, la austeridad y la prosperidad económica como signos visibles de pertenecer al grupo de los elegidos.",
                    subject = "Historia Universal",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "hu_t05_s04",
            subjectId = "historia_universal",
            semana = 5,
            subtema = "5.4 El Absolutismo Monárquico y la Ilustración",
            title = "Absolutismo e Ilustración",
            theory = LessonTheory(
                id = "theory_hu_t05_s04",
                asignatura = "Historia Universal",
                semana = 5,
                titulo = "El Absolutismo Monárquico y la Ilustración",
                resumen = "• Absolutismo Monárquico (Siglos XVII - XVIII):\n  - Régimen político donde el rey concentra todos los poderes del Estado de manera ilimitada.\n  - Fundamentos Teóricos: Derecho Divino de los reyes (Jacques Bossuet: el rey es representante directo de Dios en la Tierra); Soberanía absoluta (Jean Bodin y Thomas Hobbes en Leviatán: el absolutismo es necesario para evitar la guerra de todos contra todos).\n  - Modelo Paradigmático: Luis XIV de Francia, el 'Rey Sol' ('El Estado soy yo' / L'État, c'est moi), palacio de Versalles.\n• La Ilustración (Siglo XVIII, 'El Siglo de las Luces'):\n  - Movimiento ideológico, filosófico y cultural burgués que promovió el uso de la RAZÓN crítica como herramienta para desterrar el oscurantismo, la superstición y el absolutismo.\n  - Pensadores Filosófico-Políticos:\n    - John Locke (Padre del liberalismo político): Derechos naturales inalienables (vida, libertad, propiedad privada) y soberanía popular.\n    - Montesquieu (El espíritu de las leyes): División tripartita de los poderes del Estado (Ejecutivo, Legislativo y Judicial) para evitar la tiranía.\n    - Voltaire (Cartas filosóficas): Feroz crítico del fanatismo religioso, la intolerancia y la censura; defensor de la libertad de expresión y culto.\n    - Jean-Jacques Rousseau (El contrato social): La soberanía reside exclusivamente en la voluntad general del pueblo; el Estado nace de un pacto social revocable.\n  - La Enciclopedia (Diccionario razonado de las ciencias, artes y oficios):\n    - Editada por Denis Diderot y Jean d'Alembert. Compendió todo el conocimiento científico y racional de la época, socavando las bases ideológicas del Antiguo Régimen.",
                conceptosClave = listOf(
                    "Absolutismo de Luis XIV: 'El Estado soy yo' y origen divino de Bossuet",
                    "Ilustración: supremacía de la razón frente a la fe dogmática",
                    "Montesquieu: separación de los tres poderes del Estado",
                    "Rousseau: soberanía popular y El Contrato Social",
                    "La Enciclopedia de Diderot y d'Alembert como vehículo difusor"
                ),
                formulas = listOf(
                    "\\text{Montesquieu: } \\text{Poder Ejecutivo} \\;\\bot\\; \\text{Poder Legislativo} \\;\\bot\\; \\text{Poder Judicial}"
                ),
                formulaName = "Teoría de la División de Poderes",
                formulaLatex = "\\text{Libertad Política} \\iff \\text{Separación Estricta de Poderes (Montesquieu)}",
                formulaDescription = "Principio constitucional fundacional de las repúblicas y democracias representativas modernas.",
                admissionTip = "Aprende los aportes de cada ilustrado: Montesquieu = División de poderes; Voltaire = Tolerancia religiosa y libertad de opinión; Rousseau = Contrato social y soberanía popular.",
                admissionExplanation = "• El 'Despotismo Ilustrado' fue el intento de los monarcas absolutos por adoptar reformas científicas y educativas sin ceder un ápice de su poder político ('Todo para el pueblo, pero sin el pueblo')."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t05_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En su trascendental obra 'El espíritu de las leyes', el barón de Montesquieu formuló el principio político que se convirtió en pilar de los Estados constitucionales modernos, consistente en:",
                    options = listOf(
                        "La concentración de todo el poder civil y religioso en manos del monarca absoluto",
                        "La división y equilibrio de los poderes del Estado en Ejecutivo, Legislativo y Judicial",
                        "La eliminación inmediata de todo sistema electoral o asambleario",
                        "El origen estrictamente divino de las coronas reales europeas",
                        "La sustitución de la ley civil escrita por la doctrina canónica de la Iglesia"
                    ),
                    correctIndex = 1,
                    explanation = "Montesquieu postuló la doctrina de la separación y contrapeso recíproco de los tres poderes del Estado (Ejecutivo, Legislativo y Judicial) para garantizar que el poder frene al poder y evitar el despotismo.",
                    subject = "Historia Universal",
                    semana = 5
                )
            )
        ),

        // =========================================================================
        // TEMA 06: ERA DE LAS REVOLUCIONES Y ERA NAPOLEÓNICA (Semana 6)
        // =========================================================================
        LessonNode(
            id = "hu_t06_s01",
            subjectId = "historia_universal",
            semana = 6,
            subtema = "6.1 Independencia de las Trece Colonias Británicas",
            title = "Independencia de las Trece Colonias",
            theory = LessonTheory(
                id = "theory_hu_t06_s01",
                asignatura = "Historia Universal",
                semana = 6,
                titulo = "Independencia de las Trece Colonias Británicas",
                resumen = "• Antecedentes y Causas:\n  - Las Trece Colonias de Norteamérica poseían autogobierno asambleario y prosperidad comercial.\n  - Guerra de los Siete Años (1756-1763): Gran Bretaña vence a Francia pero queda endeudada. El rey Jorge III impone impuestos sin consulta colonial (Ley del Azúcar, Ley del Timbre/Stamp Act, Ley del Té).\n  - Lema colonial: 'No taxation without representation' (No hay tributación sin representación en el Parlamento de Londres).\n  - Motín del Té de Boston (1773): Colonos disfrazados de indios mohawk arrojan cargamentos de té al mar en protesta.\n• El Proceso Emancipador:\n  - 1er Congreso de Filadelfia (1774): Declaración de derechos y boicot comercial a Gran Bretaña.\n  - 2do Congreso de Filadelfia (1775-1776): Se nombra a George Washington comandante en jefe del Ejército Continental.\n  - 4 de julio de 1776: Proclamación de la Declaración de Independencia de los Estados Unidos redactada por Thomas Jefferson (con apoyo de John Adams y Benjamin Franklin).\n• Campañas Militares y Triunfo:\n  - Batalla de Saratoga (1777): Victoria patriota que motivó el apoyo militar formal de Francia (Marqués de La Fayette) y España.\n  - Batalla de Yorktown (1781): Victoria decisiva de Washington sobre el general británico Cornwallis.\n  - Tratado de Versalles o París (1783): Gran Bretaña reconoce oficialmente la independencia de EE. UU.\n• Constitución de 1787: Primera constitución escrita del mundo. Establece una República Federal, democrática y con separación estricta de poderes. Primer presidente: George Washington.",
                conceptosClave = listOf(
                    "Motín del Té de Boston (1773) y 'No taxation without representation'",
                    "4 de julio de 1776: Declaración de Independencia (Thomas Jefferson)",
                    "Batallas clave: Saratoga (1777) y Yorktown (1781)",
                    "Tratado de Versalles (1783) y Constitución federal de 1787"
                ),
                formulas = listOf(
                    "\\text{Motín del Té (1773)} \\to \\text{Independencia (1776)} \\to \\text{Yorktown (1781)} \\to \\text{Constitución (1787)}"
                ),
                formulaName = "Secuencia de la Independencia de EE. UU.",
                formulaLatex = "\\text{Reclamo Impositivo} \\to \\text{Guerra Revolucionaria} \\to \\text{República Federal Constitucional}",
                formulaDescription = "Primera revolución burguesa anticolonial que aplicó en la práctica las ideas de la Ilustración.",
                admissionTip = "La Constitución de 1787 de EE. UU. fue el primer texto constitucional del mundo en aplicar la división de poderes de Montesquieu en un sistema republicano.",
                admissionExplanation = "• El apoyo militar y económico que Francia brindó a los colonos norteamericanos endeudó a la corona de Luis XVI, acelerando la crisis financiera que detonó la Revolución Francesa."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t06_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La batalla decisiva de la Guerra de Independencia de las Trece Colonias en la cual las tropas combinadas coloniales y francesas lograron la capitulación final del ejército británico comandado por Cornwallis en 1781 fue:",
                    options = listOf("Lexington", "Bunker Hill", "Saratoga", "Yorktown", "Gettysburg"),
                    correctIndex = 3,
                    explanation = "La Batalla de Yorktown (1781) significó la derrota militar concluyente del ejército británico frente a las fuerzas dirigidas por George Washington y el conde de Rochambeau, obligando a Gran Bretaña a negociar la paz y reconocer la independencia.",
                    subject = "Historia Universal",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "hu_t06_s02",
            subjectId = "historia_universal",
            semana = 6,
            subtema = "6.2 Revolución Francesa: Causas y Etapa Monárquica",
            title = "Revolución Francesa: Etapa Monárquica",
            theory = LessonTheory(
                id = "theory_hu_t06_s02",
                asignatura = "Historia Universal",
                semana = 6,
                titulo = "Revolución Francesa: Causas y Etapa Monárquica",
                resumen = "• Revolución Francesa (1789 - 1799): Proceso social, político y económico que destruyó las estructuras del Antiguo Régimen e impuso el modelo burgués liberal.\n• Causas Principales:\n  - Estructural: Sociedad estamental profundamente desigual. Primer Estado (Clero, 1%) y Segundo Estado (Nobleza, 2%) eran privilegiados exentos de impuestos; Tercer Estado o Estado Llano (97%: burguesía, campesinos, artesanos) sostenía todas las cargas tributarias.\n  - Económica: Bancarrota fiscal por guerras, lujos de Versalles y malas cosechas de trigo que dispararon el precio del pan.\n  - Ideológica: Difusión masiva de los postulados racionalistas de la Ilustración.\n• Etapa Monárquica (1789 - 1792):\n  1. Estados Generales (mayo 1789): Convocados por Luis XVI tras la crisis. Conflicto por el sistema de voto: la nobleza quería voto por estamento; el Tercer Estado exigía voto por cabeza (individual).\n  2. Asamblea Nacional y Juramento del Juego de la Pelota: El Tercer Estado promete no separarse hasta redactar una Constitución.\n  3. Asamblea Constituyente (1789 - 1791):\n     - 14 de julio de 1789: Toma de la Bastilla (cárcel real, símbolo del absolutismo).\n     - Noche del 4 de agosto: Abolición de los privilegios feudales y servidumbre.\n     - 26 de agosto de 1789: Declaración de los Derechos del Hombre y del Ciudadano ('Libertad, Igualdad, Fraternidad').\n     - Constitución Civil del Clero (los sacerdotes pasan a ser funcionarios del Estado).\n     - Constitución de 1791: Establece una Monarquía Constitucional con voto censitario.\n  4. Asamblea Legislativa (1791 - 1792): Fuga de Varennes del rey. Estalla la guerra contra las monarquías absolutistas de Austria y Prusia. La Marsellesa. Asalto a las Tullerías (10 de agosto de 1792) que derroca la monarquía.",
                conceptosClave = listOf(
                    "Tres estamentos del Antiguo Régimen y crisis financiera",
                    "14 de julio de 1789: Toma de la Bastilla",
                    "Declaración de los Derechos del Hombre y del Ciudadano (1789)",
                    "Constitución de 1791: Monarquía Constitucional"
                ),
                formulas = listOf(
                    "\\text{Tercer Estado (97\\%)} \\implies \\text{Exclusión política} + \\text{Impuestos} \\implies \\text{Revolución Burguesa}"
                ),
                formulaName = "Dinamismo Revolucionario de 1789",
                formulaLatex = "\\text{Estados Generales} \\to \\text{Juego de la Pelota} \\to \\text{Toma de la Bastilla} \\to \\text{Derechos del Hombre}",
                formulaDescription = "Secuencia de escalamiento revolucionario popular y burgués que desmanteló el absolutismo borbónico.",
                admissionTip = "La Toma de la Bastilla (14 de julio) es el símbolo máximo popular de la caída del absolutismo, pero el documento legal cumbre fue la Declaración de los Derechos del Hombre del 26 de agosto de 1789.",
                admissionExplanation = "• El célebre texto de Emmanuel-Joseph Sieyès resumió la consigna del momento: '¿Qué es el Tercer Estado? Todo. ¿Qué ha sido hasta el presente en el orden político? Nada. ¿Qué pide? Llegar a ser algo'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t06_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El documento jurídico supremo aprobado por la Asamblea Nacional Constituyente francesa en agosto de 1789, que consagró la igualdad de todos los seres humanos ante la ley, la libertad de opinión y la propiedad privada, fue la:",
                    options = listOf(
                        "Declaración de Independencia de Filadelfia",
                        "Constitución Civil del Clero",
                        "Declaración de los Derechos del Hombre y del Ciudadano",
                        "Carta Magna de 1215",
                        "Paz de Augsburgo"
                    ),
                    correctIndex = 2,
                    explanation = "La Declaración de los Derechos del Hombre y del Ciudadano (26 de agosto de 1789) consagró los principios de libertad individual, igualdad jurídica, presunción de inocencia y soberanía nacional, liquidando los fundamentos estamentales del Antiguo Régimen.",
                    subject = "Historia Universal",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "hu_t06_s03",
            subjectId = "historia_universal",
            semana = 6,
            subtema = "6.3 Etapa Republicana: Convención Nacional y Terror Jacobino",
            title = "Etapa Republicana y el Terror Jacobino",
            theory = LessonTheory(
                id = "theory_hu_t06_s03",
                asignatura = "Historia Universal",
                semana = 6,
                titulo = "Etapa Republicana: Convención Nacional y Terror Jacobino",
                resumen = "• Proclamación de la República (Septiembre 1792): Tras la victoria militar en Valmy sobre los prusianos, se suspende la monarquía y nace la Primera República Francesa.\n• La Convención Nacional (1792 - 1795):\n  - Fuerzas Políticas:\n    - Girondinos: Alta burguesía comercial de provincias, moderados, legalistas.\n    - Jacobinos o Montañeses: Pequeña burguesía radical liderada por Maximilien Robespierre, Georges Danton y Jean-Paul Marat, apoyados por las masas urbanas de los sans-culottes.\n    - La Llanura o Pantano: Centro fluctuante y mayoritario.\n  - Juicio y Ejecución de Luis XVI: Condenado por traición a la patria y guillotinado en enero de 1793. Conmoción europea y formación de la Primera Coalición militar antifrancesa.\n• El Régimen del Terror (1793 - 1794):\n  - Los jacobinos dan un golpe y toman el control de la Convención creando el Comité de Salvación Pública encabezado por Robespierre ('El Incorruptible').\n  - Medidas Extremas: Ley de Sospechosos, ejecución masiva en la guillotina de opositores (reina María Antonieta, girondinos, campesinos de la Vendée e incluso jacobinos moderados como Danton), control de precios del trigo (Ley del Máximo General) y descristianización (nuevo calendario revolucionario y culto al Ser Supremo).\n  - Reacción Termidoriana (Julio 1794): Golpe de estado del 9 de Termidor; Robespierre y sus partidarios son arrestados y guillotinados. Fin del terror radical.\n• El Directorio (1795 - 1799): Gobierno colegiado moderado de 5 directores. Marcado por la corrupción y la inestabilidad social, sofocada por el creciente prestigio del joven general Napoleón Bonaparte.\n• Fin de la Revolución: El 18 de Brumario (9 de noviembre de 1799), Napoleón ejecuta un golpe de estado y establece el Consulado.",
                conceptosClave = listOf(
                    "Ejecución de Luis XVI en la guillotina (1793)",
                    "Robespierre y el Comité de Salvación Pública durante el Gran Terror",
                    "Sans-culottes y pugna entre Girondinos y Jacobinos",
                    "Golpe del 9 de Termidor (caída de Robespierre) y 18 de Brumario (Napoleón)"
                ),
                formulas = listOf(
                    "\\text{Convención Girondina} \\to \\text{Convención Jacobina (Terror)} \\to \\text{Directorio} \\to \\text{Golpe 18 Brumario}"
                ),
                formulaName = "Fases de la República Francesa",
                formulaLatex = "\\text{Moderados (Girondinos)} \\to \\text{Radicales (Robespierre)} \\to \\text{Reacción Termidoriana} \\to \\text{Napoleón Bonaparte}",
                formulaDescription = "Curva pendular de radicalización y posterior estabilización conservadora de la República.",
                admissionTip = "No confudas: el golpe de Termidor (1794) acabó con el Terror y ejecutó a Robespierre; el golpe de Brumario (1799) acabó con el Directorio e impuso a Napoleón.",
                admissionExplanation = "• Durante el régimen del Terror jacobino se redactó la Constitución de 1793 (Año I), que consagró por primera vez el sufragio universal masculino, aunque nunca llegó a aplicarse por el estado de guerra."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t06_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Durante la Convención Nacional de la Revolución Francesa, el Comité de Salvación Pública presidido por Maximilien Robespierre instauró el periodo conocido como 'El Terror', caracterizado primordialmente por:",
                    options = listOf(
                        "La restauración incondicional de los privilegios del clero católico",
                        "El uso sistemático de la guillotina para eliminar a los opositores políticos y enemigos de la revolución",
                        "La firma de una alianza militar perpetua con la monarquía británica",
                        "El restablecimiento de la monarquía absoluta bajo Luis XVIII",
                        "La abolición total de todo el ejército revolucionario francés"
                    ),
                    correctIndex = 1,
                    explanation = "Bajo el liderazgo de Robespierre y el Comité de Salvación Pública, se aplicó la 'Ley de Sospechosos' para ejecutar en la guillotina a miles de presuntos contrarrevolucionarios, aristócratas y facciones políticas rivales (girondinos y hebertistas).",
                    subject = "Historia Universal",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "hu_t06_s04",
            subjectId = "historia_universal",
            semana = 6,
            subtema = "6.4 Era Napoleónica, Expansión Imperial y Restauración",
            title = "Era Napoleónica y Congreso de Viena",
            theory = LessonTheory(
                id = "theory_hu_t06_s04",
                asignatura = "Historia Universal",
                semana = 6,
                titulo = "Era Napoleónica y Congreso de Viena",
                resumen = "• Consulado (1799 - 1804): Napoleón se corona Primer Cónsul. Logros: Creación del Banco de Francia, Concordato de 1801 con la Santa Sede (Pío VII) y promulgación del Código Civil Napoleónico (1804), que universalizó la igualdad jurídica, el divorcio y la propiedad privada.\n• Imperio Napoleónico (1804 - 1815):\n  - Autocoronación de Napoleón como Emperador en Notre Dame en presencia del papa Pío VII (1804).\n  - Victorias Clásicas: Batalla de Austerlitz (1805, 'Batalla de los Tres Emperadores', obra maestra táctica sobre Austria y Rusia) y Jena (sobre Prusia).\n  - Derrota Naval: Batalla de Trafalgar (1805, el almirante británico Nelson destruye la flota franco-española).\n  - Bloqueo Continental (1806): Prohibición estricta a toda Europa de comerciar con Gran Bretaña para asfixiarla económicamente.\n  - Invasión a España (1808): Farsa de Bayona (secuestro de Carlos IV y Fernando VII); impone a su hermano José Bonaparte ('Pepe Botella'). Catalizó las independencias hispanoamericanas.\n  - Campaña de Rusia (1812): El zar Alejandro I rompe el bloqueo. Táctica rusa de tierra quemada y el brutal invierno diezman al ejército francés (Grande Armée).\n  - Batalla de Leipzig (1813, 'Batalla de las Naciones'): Derrota napoleónica. Es desterrado a la isla de Elba.\n  - Gobierno de los Cien Días (1815): Regresa a Francia; es derrotado definitivamente en la Batalla de Waterloo (Bélgica, 18 de junio de 1815) por el duque de Wellington. Desterrado a la remota isla de Santa Elena, donde muere en 1821.\n• La Restauración y el Congreso de Viena (1814 - 1815):\n  - Liderado por el canciller austríaco Klemens von Metternich.\n  - Principios: Legitimismo monárquico (reponer a las dinastías absolutistas como los Borbones en Francia con Luis XVIII) y equilibrio de poder continental.\n  - Santa Alianza: Pacto militar propuesto por el zar Alejandro I (Rusia, Austria, Prusia) para intervenir militarmente en cualquier país donde estallaran revoluciones liberales.",
                conceptosClave = listOf(
                    "Código Civil de 1804 (Código Napoleónico): base del derecho contemporáneo",
                    "Austerlitz (1805) como cumbre táctica y Trafalgar como fracaso naval",
                    "Bloqueo Continental e invasión de España (1808)",
                    "Waterloo (1815) y Congreso de Viena de Metternich (Restauración absolutista)"
                ),
                formulas = listOf(
                    "\\text{Austerlitz (1805)} \\to \\text{Bloqueo Continental (1806)} \\to \\text{Rusia (1812)} \\to \\text{Waterloo (1815)}"
                ),
                formulaName = "Trayectoria Militar Napoleónica",
                formulaLatex = "\\text{Apogeo (Austerlitz)} \\to \\text{Desastre de Moscú (1812)} \\to \\text{Derrota Final (Waterloo 1815)}",
                formulaDescription = "Ascenso, hegemonía continental y caída militar definitiva del Imperio Napoleónico.",
                admissionTip = "La invasión napoleónica a España (1808) provocó el cautiverio del rey Fernando VII, lo que generó la formación de juntas de gobierno en América y el estallido de las guerras de independencia.",
                admissionExplanation = "• El Congreso de Viena intentó 'borrar' la Revolución Francesa restaurando reyes absolutos, pero las ideas liberales y nacionalistas ya habían echado raíces en la burguesía europea."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t06_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La batalla de junio de 1815 en la que Napoleón Bonaparte fue derrotado militarmente de forma concluyente por la Séptima Coalición liderada por el duque de Wellington y el mariscal Blücher fue:",
                    options = listOf("Austerlitz", "Leipzig", "Waterloo", "Trafalgar", "Marengo"),
                    correctIndex = 2,
                    explanation = "La Batalla de Waterloo (Bélgica, 18 de junio de 1815) selló la derrota irreversible del ejército napoleónico durante su efímero gobierno de los Cien Días, provocando su destierro definitivo a la isla de Santa Elena.",
                    subject = "Historia Universal",
                    semana = 6
                )
            )
        ),

        // =========================================================================
        // TEMA 07: SIGLO XIX: REVOLUCIONES INDUSTRIALES E IMPERIALISMO (Semana 7)
        // =========================================================================
        LessonNode(
            id = "hu_t07_s01",
            subjectId = "historia_universal",
            semana = 7,
            subtema = "7.1 Primera y Segunda Revolución Industrial",
            title = "Primera y Segunda Revolución Industrial",
            theory = LessonTheory(
                id = "theory_hu_t07_s01",
                asignatura = "Historia Universal",
                semana = 7,
                titulo = "Primera y Segunda Revolución Industrial",
                resumen = "• Primera Revolución Industrial (1760 - 1840):\n  - Cuna: Gran Bretaña (revolución agraria, abundancia de carbón y hierro, imperio colonial, flota naval y monarquía parlamentaria estable).\n  - Fuente de Energía: Carbón mineral (hulla) y Vapor de agua.\n  - Invento Principal: Máquina de Vapor de James Watt (1769).\n  - Industrias Líderes: Textilera del algodón (hiladoras mecánicas) y Metalúrgica.\n  - Transporte: Ferrocarril de vapor (George Stephenson, 'The Rocket') y Barco de vapor (Robert Fulton).\n  - Impacto Social: Surgimiento del Proletariado industrial y la burguesía fabril, éxodo rural masivo hacia las ciudades, hacinamiento, jornadas laborales abusivas de 16 horas y trabajo infantil.\n• Segunda Revolución Industrial (1870 - 1914):\n  - Nuevas Potencias Líderes: Estados Unidos y Alemania (desplazan a Gran Bretaña).\n  - Fuentes de Energía: Petróleo (motor de combustión interna) y Electricidad (dinamo, telégrafo, bombilla de Thomas Edison).\n  - Material Clave: Acero (convertidor Bessemer) y la industria química (plásticos, fármacos, fertilizantes sintéticos, explosivos).\n  - Transporte y Comunicación: Automóvil (Henry Ford, Ford T), aviación (hermanos Wright), teléfono (Alexander Graham Bell) y radio (Marconi).\n  - Organización del Trabajo: Taylorismo (división del trabajo cronometrada) y Fordismo (producción en cadena y masa). Capitalismo financiero y monopolios (trusts, cárteles, holdings).",
                conceptosClave = listOf(
                    "Primera Rev. Ind.: Gran Bretaña, carbón, máquina de vapor (Watt) y textil",
                    "Segunda Rev. Ind.: EE. UU. y Alemania, petróleo, electricidad y acero (Bessemer)",
                    "Impacto social: proletariado obrero, urbanización descontrolada y fordismo",
                    "Surgimiento de monopolios capitalistas financieros (trust, holding)"
                ),
                formulas = listOf(
                    "\\text{1ra Rev. Ind. (1760)} = \\text{Carbón} + \\text{Vapor} + \\text{Hierro} + \\text{Gran Bretaña}",
                    "\\text{2da Rev. Ind. (1870)} = \\text{Petróleo} + \\text{Electricidad} + \\text{Acero} + \\text{EE.UU. / Alemania}"
                ),
                formulaName = "Ejes Comparativos de las Revoluciones Industriales",
                formulaLatex = "\\text{Vapor / Carbón (Siglo XVIII)} \\to \\text{Electricidad / Petróleo / Acero (Siglo XIX-XX)}",
                formulaDescription = "Matriz comparativa de las fuentes energéticas y focos geopolíticos de la industrialización.",
                admissionTip = "Diferencia siempre las fuentes de energía: 1ra Rev. Ind. = Carbón y Vapor; 2da Rev. Ind. = Petróleo y Electricidad.",
                admissionExplanation = "• El maquinismo provocó reacciones de protesta obrera iniciales como el Ludismo (destrucción de máquinas guiada por el mítico Ned Ludd) y el Cartismo (reivindicaciones políticas mediante cartas al Parlamento)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t07_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "A diferencia de la Primera Revolución Industrial centrada en el carbón y el vapor en Gran Bretaña, la Segunda Revolución Industrial (1870-1914) se caracterizó por:",
                    options = listOf(
                        "El uso prioritario de la leña y la fuerza hidráulica en Francia",
                        "El empleo masivo del petróleo, la electricidad, el acero y el auge fabril de Estados Unidos y Alemania",
                        "La eliminación del proletariado industrial y el regreso al campo",
                        "La sustitución del ferrocarril por caravanas terrestres de tracción animal",
                        "El monopolio exclusivo del comercio marítimo por parte del Imperio Español"
                    ),
                    correctIndex = 1,
                    explanation = "La Segunda Revolución Industrial tuvo como motores energéticos principales a la electricidad y el petróleo, junto al desarrollo del acero y la industria química, encabezada por las nuevas potencias de Estados Unidos y Alemania.",
                    subject = "Historia Universal",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "hu_t07_s02",
            subjectId = "historia_universal",
            semana = 7,
            subtema = "7.2 Revoluciones Liberales de 1830 y 1848",
            title = "Revoluciones Liberales de 1830 y 1848",
            theory = LessonTheory(
                id = "theory_hu_t07_s02",
                asignatura = "Historia Universal",
                semana = 7,
                titulo = "Revoluciones Liberales de 1830 y 1848",
                resumen = "• Oleadas Revolucionarias contra la Restauración Absolutista:\n  - La burguesía y las clases populares se levantaron contra el orden monárquico impuesto por el Congreso de Viena bajo dos banderas: el Liberalismo (derechos individuales, constituciones) y el Nacionalismo (soberanía de los pueblos).\n• Revolución de 1830:\n  - Epicentro: Francia. 'Las Tres Gloriosas Jornadas' de julio (27, 28 y 29 de julio de 1830) en París, inmortalizadas por Eugène Delacroix en el lienzo 'La Libertad guiando al pueblo'.\n  - Detonante: Carlos X promulgó las Ordenanzas de Saint-Cloud (censura de prensa y disolución de la Cámara de Diputados).\n  - Consecuencia: Derrocamiento de los Borbones y ascenso de Luis Felipe de Orleans ('El Rey Burgués'), inaugurando una Monarquía Constitucional censitaria.\n  - Repercusión Internacional: Independencia de Bélgica frente a Holanda; fracaso de la insurrección nacionalista en Polonia contra el zar ruso.\n• Revolución de 1848 ('La Primavera de los Pueblos'):\n  - Epicentro: Francia. Levantamiento popular por la crisis económica y el autoritarismo de Luis Felipe y su ministro Guizot (prohibición del banquete de la oposición).\n  - Consecuencias en Francia: Caída de la monarquía y proclamación de la Segunda República Francesa con sufragio universal masculino. Es elegido presidente Luis Napoleón Bonaparte (sobrino de Napoleón, quien daría el golpe de Estado en 1851 proclamándose emperador Napoleón III del Segundo Imperio Francés).\n  - Expansión Paneuropea: Estallidos revolucionarios en el Imperio Austríaco (caída de Metternich), Prusia, Italia y Hungría. Por primera vez participa activamente el proletariado con demandas socialistas (coincide con la publicación del Manifiesto Comunista de Marx y Engels en 1848).",
                conceptosClave = listOf(
                    "Revolución de 1830 en París: derrocamiento de Carlos X y reinado de Luis Felipe",
                    "Independencia de Bélgica (1830)",
                    "Revolución de 1848: 'La Primavera de los Pueblos' y Segunda República Francesa",
                    "Entrada del proletariado en la escena política y Manifiesto Comunista (1848)"
                ),
                formulas = listOf(
                    "1830: \\text{Burguesía liberal vs Absolutismo Borbónico} \\to \\text{Monarquía Ciudadana}",
                    "1848: \\text{Obreros + Burguesía vs Régimen Censitario} \\to \\text{Segunda República}"
                ),
                formulaName = "Ciclos Revolucionarios Burgueses del Siglo XIX",
                formulaLatex = "1820 \\text{ (Incipiente)} \\to 1830 \\text{ (Liberal)} \\to 1848 \\text{ (Primavera de los Pueblos - Democrática y Social)}",
                formulaDescription = "Cadena de insurrecciones que derrotó definitivamente los rezagos del absolutismo feudal en Europa.",
                admissionTip = "El célebre cuadro 'La Libertad guiando al pueblo' de Delacroix representa la Revolución de 1830 en Francia, NO la Revolución de 1789.",
                admissionExplanation = "• La Revolución de 1848 fue llamada la 'Primavera de los Pueblos' porque despertó los anhelos nacionales de unificación e independencia en pueblos sometidos de Europa central y oriental."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t07_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La oleada revolucionaria europea de 1848, conocida como la 'Primavera de los Pueblos', se diferenció de las anteriores revoluciones liberales burguesas de 1820 y 1830 por:",
                    options = listOf(
                        "La restauración total del absolutismo imperial de Napoleón I",
                        "La activa participación de la clase obrera con demandas sociales y el reclamo del sufragio universal masculino",
                        "La renuncia voluntaria de todos los reyes europeos al trono",
                        "La firma de un pacto de no agresión perpetuo entre Francia y Gran Bretaña",
                        "El rechazo frontal a las ideas del nacionalismo y la república"
                    ),
                    correctIndex = 1,
                    explanation = "La Revolución de 1848 incorporó por primera vez al proletariado industrial y a sectores populares urbanos con reivindicaciones socioeconómicas propias (talleres nacionales, jornada justa) y exigencias de soberanía popular a través del sufragio universal.",
                    subject = "Historia Universal",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "hu_t07_s03",
            subjectId = "historia_universal",
            semana = 7,
            subtema = "7.3 Unificaciones Nacionales de Italia y Alemania",
            title = "Unificaciones de Italia y Alemania",
            theory = LessonTheory(
                id = "theory_hu_t07_s03",
                asignatura = "Historia Universal",
                semana = 7,
                titulo = "Unificaciones Nacionales de Italia y Alemania",
                resumen = "• Factores Comunes: Auge del Nacionalismo romántico y liberal, desarrollo capitalista que requería mercados internos unificados sin aduanas internas y el liderazgo de un Estado motor militarizado.\n• Unificación Italiana (Il Risorgimento, 1859 - 1870):\n  - Estado Motor: Reino de Piamonte-Cerdeña.\n  - Líderes:\n    - Rey Víctor Manuel II de Saboya (primer rey de Italia unificada).\n    - Conde de Cavour (Camilo Benso): Genio diplomático, primer ministro piamontés.\n    - Giuseppe Garibaldi: Héroe popular guerrillero al mando de los 'Camisas Rojas' (conquistó el Reino de las Dos Sicilias / Nápoles en el sur).\n    - Giuseppe Mazzini: Ideólogo de la 'Joven Italia'.\n  - Fases: Guerra contra Austria (Lombardía), anexión de los ducados centrales, conquista del sur por Garibaldi, anexión de Venecia (1866) y toma de Roma en 1870 tras la caída de Napoleón III (el papa Pío IX se declara prisionero en el Vaticano, origen de la Cuestión Romana). Capital en Roma.\n• Unificación Alemana (1864 - 1871):\n  - Antecedente Económico: El Zollverein (unión aduanera de 1834 promovida por Prusia sin Austria).\n  - Estado Motor: Reino de Prusia.\n  - Líderes:\n    - Rey Guillermo I de Hohenzollern.\n    - Otto von Bismarck: 'El Canciller de Hierro', forjó la unificación 'con sangre y hierro' mediante el realismo político (Realpolitik).\n    - Helmuth von Moltke: Mariscal militar prusiano.\n  - Las Tres Guerras de Unificación:\n    1. Guerra de los Ducados (1864): Prusia y Austria arrebatan Schleswig y Holstein a Dinamarca.\n    2. Guerra Austro-Prusiana (1866): Victoria prusiana en la Batalla de Sadowa. Austria queda excluida de la unificación alemana.\n    3. Guerra Franco-Prusiana (1870 - 1871): Napoleón III cae prisionero en la Batalla de Sedán (1870). Prusia cerca París y en la Galería de los Espejos de Versalles (1871) proclama el nacimiento del Segundo Imperio Alemán (II Reich) con Guillermo I como Káiser.\n    - Tratado de Fráncfort (1871): Francia pierde Alsacia y Lorena ante Alemania, sembrando el rencor revanchista que desembocaría en la Primera Guerra Mundial.",
                conceptosClave = listOf(
                    "Piamonte-Cerdeña: Cavour, Víctor Manuel II y los Camisas Rojas de Garibaldi",
                    "Zollverein (1834): unión aduanera como base económica alemana",
                    "Otto von Bismarck y la unificación por 'sangre y hierro'",
                    "Tres guerras prusianas: Dinamarca (1864), Sadowa (1866) y Sedán (1870)",
                    "Proclamación del II Reich en Versalles y cesión de Alsacia y Lorena"
                ),
                formulas = listOf(
                    "\\text{Unificación Alemana: } \\text{Dinamarca (1864)} \\to \\text{Sadowa (Austria, 1866)} \\to \\text{Sedán (Francia, 1870)}"
                ),
                formulaName = "Trilogía Bélica de Bismarck",
                formulaLatex = "\\text{Guerra de los Ducados} \\to \\text{Guerra Austro-Prusiana} \\to \\text{Guerra Franco-Prusiana (II Reich)}",
                formulaDescription = "Secuencia de victorias militares prusianas que alteró el equilibrio de poder en Europa continental.",
                admissionTip = "La pérdida francesa de las ricas provincias mineras de Alsacia y Lorena en 1871 es la causa directa del nacionalismo revanchista francés contra Alemania en la Primera Guerra Mundial.",
                admissionExplanation = "• La Cuestión Romana (conflicto entre el Estado italiano y el Papado por la anexión de Roma en 1870) se resolvió recién en 1929 con los Tratados de Letrán firmados por Benito Mussolini, creando el Estado soberano de la Ciudad del Vaticano."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t07_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El Tratado de Fráncfort de 1871, firmado tras la aplastante victoria prusiana en la Batalla de Sedán sobre Napoleón III, estableció la proclamación del II Reich alemán y forzó a Francia a ceder a perpetuidad las estratégicas regiones de:",
                    options = listOf(
                        "Lombardía y el Véneto",
                        "Alsacia y Lorena",
                        "Schleswig y Holstein",
                        "Los Sudetes y Bohemia",
                        "Flandes y Valonia"
                    ),
                    correctIndex = 1,
                    explanation = "Tras la victoria en la Guerra Franco-Prusiana (1870-1871), el canciller Bismarck impuso el Tratado de Fráncfort, mediante el cual Francia cedió a Alemania los territorios de Alsacia y Lorena, originando una profunda hostilidad militar que perduró hasta 1914.",
                    subject = "Historia Universal",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "hu_t07_s04",
            subjectId = "historia_universal",
            semana = 7,
            subtema = "7.4 El Imperialismo Colonial y la Conferencia de Berlín de 1885",
            title = "Imperialismo y Conferencia de Berlín",
            theory = LessonTheory(
                id = "theory_hu_t07_s04",
                asignatura = "Historia Universal",
                semana = 7,
                titulo = "El Imperialismo Colonial y la Conferencia de Berlín de 1885",
                resumen = "• Imperialismo Colonial (Fines del Siglo XIX - 1914):\n  - Dominación política, militar y económica ejercida por las potencias industriales sobre territorios de África, Asia y Oceanía.\n  - Causas Principales:\n    1. Económica: Necesidad urgente de materias primas baratas (caucho, petróleo, cobre, algodón) y nuevos mercados donde colocar los excedentes de producción y capital financiero.\n    2. Demográfica: Válvula de escape para reubicar los excedentes de población europea.\n    3. Ideológica y Pseudo-Científica: Racismo supremacista, 'Darwinismo social' y la falacia de 'la misión civilizadora del hombre blanco' (Rudyard Kipling: 'La carga del hombre blanco').\n• Reparto de África y la Conferencia de Berlín (1884 - 1885):\n  - Convocada por Otto von Bismarck y el rey Leopoldo II de Bélgica (quien poseía el Congo a título personal como empresa privada de explotación brutal de caucho).\n  - Acuerdos Clave:\n    1. Principio de Ocupación Efectiva: No bastaba con descubrir una costa; la potencia debía ocupar militar y administrativamente el interior del territorio.\n    2. Libre navegación en los ríos Congo y Níger.\n    3. Prohibición formal del comercio de esclavos.\n• Los Grandes Imperios Coloniales:\n  - Imperio Británico: El más extenso del orbe ('el imperio donde nunca se pone el sol'). Proyecto de unir África de norte a sur: El Cairo a El Cabo (Cecil Rhodes). Joya de la Corona: La India (virreinato de la reina Victoria, emperatriz en 1876).\n  - Imperio Francés: Ocupó el noroeste africano (Argelia, Túnez, África Occidental Francesa) e Indochina (Vietnam, Laos, Camboya).\n  - Guerras de Resistencia Colonial:\n    - Guerra de los Bóers (1899-1902 en Sudáfrica: británicos vs colonos holandeses por minas de oro y diamantes).\n    - Rebelión de los Cipayos (1857 en la India contra la Compañía Británica de las Indias Orientales).\n    - Guerra del Opio (1839-1842 en China: Tratado de Nanking, cesión de Hong Kong a Gran Bretaña) y Rebelión de los Bóxers (1900).",
                conceptosClave = listOf(
                    "Búsqueda imperialista de materias primas y mercados cautivos",
                    "Conferencia de Berlín (1884-1885): principio de ocupación efectiva de África",
                    "Imperio Británico: eje El Cairo-El Cabo y la India como joya de la corona",
                    "Guerras del Opio en China y Tratado de Nanking (apertura forzada de puertos)"
                ),
                formulas = listOf(
                    "\\text{Industrialización masiva} \\implies \\text{Falta de materias primas y mercados} \\implies \\text{Imperialismo colonial}"
                ),
                formulaName = "Ecuación Económica del Imperialismo (Lenin / Hobson)",
                formulaLatex = "\\text{Capitalismo Monopólico} + \\text{Excedente de Capital} \\implies \\text{Expansión Colonial Global}",
                formulaDescription = "El imperialismo entendido como la fase superior y monopólica del capitalismo industrial decimonónico.",
                admissionTip = "La Conferencia de Berlín (1884-1885) trazó fronteras artificiales con regla sobre el mapa de África sin respetar etnias ni tribus locales, sembrando guerras civiles que persisten hasta la actualidad.",
                admissionExplanation = "• En el reparto africano, solo dos países se mantuvieron libres e independientes de la dominación europea: Etiopía (Abisinia, que derrotó a Italia en la Batalla de Adua) y Liberia (fundada por antiguos esclavos negros emancipados de EE. UU.)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t07_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La Conferencia de Berlín (1884-1885), convocada por el canciller Otto von Bismarck, tuvo como propósito central para las potencias europeas:",
                    options = listOf(
                        "Descolonizar y otorgar la plena independencia a los pueblos indígenas africanos",
                        "Fijar las reglas diplomáticas y de ocupación efectiva para el reparto y colonización del continente africano",
                        "Prohibir toda extracción minera de oro y diamantes en el territorio de Sudáfrica",
                        "Impedir la navegación de barcos mercantes en los ríos Congo y Níger",
                        "Organizar una alianza militar conjunta para invadir el Imperio Chino"
                    ),
                    correctIndex = 1,
                    explanation = "La Conferencia de Berlín estableció el principio de 'ocupación efectiva' (posesión militar real sobre el terreno) para legalizar los reclamos coloniales europeos, acelerando la conquista y el reparto total del continente africano entre las potencias imperialistas.",
                    subject = "Historia Universal",
                    semana = 7
                )
            )
        ),

        // =========================================================================
        // TEMA 08: SIGLO XX: GUERRAS MUNDIALES Y GUERRA FRÍA (Semana 8)
        // =========================================================================
        LessonNode(
            id = "hu_t08_s01",
            subjectId = "historia_universal",
            semana = 8,
            subtema = "8.1 Primera Guerra Mundial y Revolución Rusa",
            title = "Primera Guerra Mundial y Revolución Rusa",
            theory = LessonTheory(
                id = "theory_hu_t08_s01",
                asignatura = "Historia Universal",
                semana = 8,
                titulo = "Primera Guerra Mundial y Revolución Rusa",
                resumen = "• Primera Guerra Mundial (1914 - 1918, La Gran Guerra):\n  - Causas Estructurales: Rivalidad imperialista por colonias y mercados, carrera armamentista de la Paz Armada (1871-1914) y nacionalismo radical en los Balcanes ('el polvorín de Europa').\n  - Bloques Antagónicos: Triple Alianza (Alemania, Austria-Hungría, Italia [luego se retira y entra el Imperio Otomano y Bulgaria]) vs Triple Entente (Gran Bretaña, Francia y Rusia [luego entran Italia y EE. UU.]).\n  - Pretexto: Asesinato del archiduque Francisco Fernando (heredero austro-húngaro) en Sarajevo (28 de junio de 1914) por Gavrilo Princip de la Mano Negra serbia.\n  - Fases de la Guerra:\n    1. Guerra de Movimientos (1914): Plan Schlieffen alemán para invadir Francia a través de Bélgica; frenado por el general Joffre en la 1ra Batalla del Marne.\n    2. Guerra de Posiciones o Trincheras (1915 - 1917): Estancamiento sangriento con ametralladoras, gases tóxicos y alambradas (batallas de Verdún y el Somme).\n    3. Año Decisivo (1917): Salida de Rusia (Revolución bolchevique y firma de la Paz de Brest-Litovsk) e Ingreso de Estados Unidos (por el hundimiento del trasatlántico Lusitania y el telegrama Zimmermann).\n    4. Desenlace (1918): 2da Batalla del Marne. Firma del Armisticio de Compiègne tras la abdicación del káiser Guillermo II.\n  - Tratado de Versalles (1919): Paz punitiva impuesta a Alemania (declarada culpable exclusiva de la guerra, desmilitarizada, obligada a pagar colosales reparaciones y despojada de colonias y de Alsacia-Lorena). Creación de la Sociedad de Naciones.\n• La Revolución Rusa (1917):\n  - Causas: Autocracia zarista opresiva de Nicolás II (dinastía Romanov), desastre militar en la Primera Guerra Mundial, hambre campesina y explotación obrera.\n  - Revolución de Febrero (1917): Huelga en Petrogrado; el zar abdica. Se establece un Gobierno Provisional burgués liderado por Alexander Kerenski (comete el error de mantener a Rusia en la guerra mundial). Dualidad de poder con los Sóviets (asambleas de obreros, soldados y campesinos).\n  - Revolución de Octubre (Noviembre 1917): Los Bolcheviques (marxistas radicales) dirigidos por Vladimir Lenin ('Todo el poder a los soviets', Tesis de Abril) y León Trotski (Guardia Roja) asaltan el Palacio de Invierno. Decretos de Paz (retiro de la guerra: tratado de Brest-Litovsk) y de Tierra (abolición del latifundio). Nace el primer Estado socialista de la historia (luego URSS en 1922).",
                conceptosClave = listOf(
                    "Paz Armada y bloques: Triple Alianza vs Triple Entente",
                    "Detonante de 1914: magnicidio de Sarajevo",
                    "Guerra de trincheras (Verdún y Somme) y año decisivo 1917 (sale Rusia, entra EE. UU.)",
                    "Tratado de Versalles (1919): humillación alemana que gestó el revanchismo nazi",
                    "Revolución Bolchevique de 1917: Lenin, Trotski y los soviets en el poder"
                ),
                formulas = listOf(
                    "\\text{1917: } \\text{Salida de Rusia (Paz Brest-Litovsk)} + \\text{Ingreso de EE. UU. (Lusitania)} = \\text{Quiebre de la Gran Guerra}"
                ),
                formulaName = "Ecuación Estratégica de 1917",
                formulaLatex = "\\text{Rusia zarista colapsa (Lenin)} \\;\\mid\\; \\text{EE. UU. interviene} \\implies \\text{Victoria de la Entente (1918)}",
                formulaDescription = "Vuelco geopolítico que determinó la derrota final de las Potencias Centrales en la Primera Guerra Mundial.",
                admissionTip = "No confudas: Febrero de 1917 derrocó al zarismo e impuso el gobierno provisional burgués de Kerenski; Octubre de 1917 derrocó a Kerenski e instaló el gobierno comunista de Lenin.",
                admissionExplanation = "• El Tratado de Versalles no pacificó Europa; Ferdinand Foch profetizó con exactitud: 'Esto no es la paz, es un armisticio por veinte años'."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t08_s01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El acontecimiento geopolítico que precipitó la salida formal de Rusia de la Primera Guerra Mundial mediante la firma del Tratado de Brest-Litovsk con Alemania en marzo de 1918 fue:",
                    options = listOf(
                        "La muerte en combate del zar Nicolás II en el frente occidental",
                        "El triunfo de la Revolución Bolchevique liderada por Vladimir Lenin en octubre de 1917",
                        "La derrota naval rusa frente a la flota japonesa",
                        "La invasión alemana a la ciudad de Moscú",
                        "La firma del armisticio de Compiègne"
                    ),
                    correctIndex = 1,
                    explanation = "Al tomar el poder en la Revolución de Octubre de 1917 bajo la consigna 'Paz, Pan y Tierra', Lenin cumplió su promesa de retirar inmediatamente a Rusia de la carnicería imperialista firmando el Tratado de Brest-Litovsk en 1918 a costa de ceder territorios en el Báltico y Ucrania.",
                    subject = "Historia Universal",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "hu_t08_s02",
            subjectId = "historia_universal",
            semana = 8,
            subtema = "8.2 El Crack del 29, la Gran Depresión y el Fascismo",
            title = "El Crack del 29 y los Totalitarismos",
            theory = LessonTheory(
                id = "theory_hu_t08_s02",
                asignatura = "Historia Universal",
                semana = 8,
                titulo = "El Crack del 29, la Gran Depresión y el Fascismo",
                resumen = "• El Crack de 1929 y la Gran Depresión:\n  - Los 'Felices Años Veinte' en EE. UU.: Época de especulación financiera desregulada y sobreproducción industrial.\n  - Jueves Negro (24 de octubre de 1929): Colapso abrupto de la Bolsa de Valores de Wall Street en Nueva York. Quiebra bancaria en cadena, ruina de fábricas, desempleo masivo (25% de la fuerza laboral) y caída del comercio mundial.\n  - Superación de la Crisis: Franklin D. Roosevelt implementa el New Deal (Nuevo Trato, 1933), basado en las tesis económicas de John Maynard Keynes (intervención del Estado en la economía, inversión masiva en obras públicas para crear empleo y subsidios sociales).\n• El Surgimiento de los Regímenes Totalitarios:\n  - Características Comunes: Estado todopoderoso por encima del individuo, unipartidismo, culto exacerbado al líder infalible, control absoluto de la prensa y propaganda, uso del terror político y violento anticomunismo.\n  - Fascismo Italiano (Benito Mussolini, 'Il Duce'):\n    - Nace en 1919 (Fasci Italiani di Combattimento / Camisas Negras).\n    - Marcha sobre Roma (1922): El rey Víctor Manuel III le entrega el gobierno.\n    - Corporativismo estatal y nacionalismo agresivo ('Todo en el Estado, nada fuera del Estado, nada contra el Estado').\n  - Nazismo Alemán (Adolf Hitler, 'El Führer'):\n    - Partido Nacionalsocialista Obrero Alemán (NSDAP / Camisas Pardas).\n    - Ideología plasmada en Mi Lucha (Mein Kampf): Odio a Versalles, antisemitismo biológico racista (supremacía de la raza aria), necesidad del 'Espacio Vital' (Lebensraum) hacia el Este y liquidación del marxismo.\n    - Ascenso: Hitler es nombrado Canciller en 1933; tras el incendio del Reichstag asume poderes dictatoriales, funda el Tercer Reich y promulga las Leyes raciales de Núremberg (1935).",
                conceptosClave = listOf(
                    "Jueves Negro de Wall Street (24 de octubre de 1929) y Gran Depresión",
                    "New Deal de Roosevelt e intervención estatal keynesiana",
                    "Totalitarismo: culto al líder, unipartidismo, terror y estatismo absoluto",
                    "Fascismo de Mussolini (Marcha sobre Roma en 1922)",
                    "Nazismo de Hitler: Mein Kampf, antisemitismo y Espacio Vital (Lebensraum)"
                ),
                formulas = listOf(
                    "\\text{Crack 1929} \\implies \\text{Desempleo masivo y quiebra} \\implies \\text{Auge de los Totalitarismos (Hitler/Mussolini)}"
                ),
                formulaName = "Relación Causal Crisis del 29 - Fascismo",
                formulaLatex = "\\text{Gran Depresión de 1929} \\to \\text{Desesperación de las masas} \\to \\text{Ascenso del Fascismo y Nazismo}",
                formulaDescription = "Vínculo sociopolítico entre el derrumbe del capitalismo liberal de mercado y el ascenso electoral de los extremismos totalitarios.",
                admissionTip = "El New Deal aplicó la teoría keynesiana: en tiempos de crisis económica profunda, el Estado debe gastar dinero público e intervenir para reactivar el consumo y el empleo.",
                admissionExplanation = "• Las Leyes de Núremberg de 1935 despojaron a los judíos alemanes de su ciudadanía y prohibieron los matrimonios mixtos, antesala del Holocausto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t08_s02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El programa socioeconómico implementado en Estados Unidos por el presidente Franklin D. Roosevelt en 1933 para rescatar al país de la devastación económica provocada por el Crack de Wall Street de 1929 fue el:",
                    options = listOf(
                        "Plan Marshall",
                        "New Deal (Nuevo Trato)",
                        "Gran Salto Adelante",
                        "Plan Schlieffen",
                        "Doctrina Truman"
                    ),
                    correctIndex = 1,
                    explanation = "El New Deal introdujo un modelo de capitalismo regulado con intervención activa del Estado federal en la economía (financiamiento de grandes obras públicas, seguridad social y supervisión bancaria) para recuperar la demanda y el empleo.",
                    subject = "Historia Universal",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "hu_t08_s03",
            subjectId = "historia_universal",
            semana = 8,
            subtema = "8.3 La Segunda Guerra Mundial (1939 - 1945)",
            title = "La Segunda Guerra Mundial",
            theory = LessonTheory(
                id = "theory_hu_t08_s03",
                asignatura = "Historia Universal",
                semana = 8,
                titulo = "La Segunda Guerra Mundial (1939 - 1945)",
                resumen = "• Causas: El revanchismo del Tratado de Versalles, el expansionismo agresivo de las potencias del Eje (Alemania, Italia, Japón) y el fracaso pacifista de la política de apaciguamiento de las democracias occidentales.\n• Detonante: 1 de septiembre de 1939: Alemania invade Polonia utilizando la Guerra Relámpago (Blitzkrieg) tras firmar el secreto Pacto Ribbentrop-Mólotov de no agresión con la URSS. Gran Bretaña y Francia declaran la guerra a Alemania.\n• Bloques Beligerantes: Eje Berlín-Roma-Tokio vs Aliados (Gran Bretaña, URSS, EE. UU., Francia Libre).\n• Fases del Conflicto:\n  1. Ofensiva del Eje (1939 - 1941):\n     - Conquista alemana de Dinamarca, Noruega, Países Bajos y Francia (junio 1940; Francia dividida en zona ocupada y el colaboracionista régimen de Vichy de Pétain).\n     - Batalla de Inglaterra: Duelo aéreo (Luftwaffe vs RAF británica bajo Winston Churchill: 'Sangre, sudor y lágrimas').\n     - Operación Barbarroja (junio 1941): Hitler traiciona a Stalin e invade la Unión Soviética.\n     - Ataque a Pearl Harbor (7 de diciembre de 1941): La aviación japonesa ataca por sorpresa la base naval estadounidense en Hawái; EE. UU. entra a la guerra.\n  2. El Viraje y Contraofensiva Aliada (1942 - 1943):\n     - Batalla de Midway (Pacífico, 1942): La marina estadounidense frena el avance imperial japonés.\n     - Batalla de El Alamein (Egipto, 1942): El general británico Montgomery derrota al Afrika Korps de Rommel.\n     - Batalla de Stalingrado (agosto 1942 - febrero 1943): El Ejército Rojo soviético aniquila al VI Ejército alemán de Von Paulus. PUNTO DE QUIEBRE CRUCIAL de toda la guerra mundial.\n  3. Desenlace y Victoria Aliada (1944 - 1945):\n     - Desembarco de Normandía (Día D, 6 de junio de 1944): Operación Overlord dirigida por Dwight Eisenhower para abrir el frente occidental en Francia.\n     - Batalla de Berlín (abril 1945): El Ejército Rojo toma la capital alemana; Hitler se suicida en su búnker (30 de abril). Rendición incondicional de Alemania (mayo 1945).\n     - Bombas Atómicas sobre Japón: El presidente estadounidense Harry Truman ordena arrojar bombas atómicas sobre Hiroshima (6 de agosto) y Nagasaki (9 de agosto de 1945). Rendición formal de Japón a bordo del USS Missouri (septiembre 1945).\n• El Holocausto (Shoá): Genocidio industrial sistemático perpetrado por el régimen nazi donde fueron asesinados más de 6 millones de judíos y millones de gitanos, eslavos y disidentes en campos de exterminio como Auschwitz-Birkenau y Treblinka.",
                conceptosClave = listOf(
                    "Detonante: 1 de septiembre de 1939 (invasión de Polonia)",
                    "Ataque a Pearl Harbor (1941) e ingreso de Estados Unidos",
                    "Batallas decisivas de viraje: Stalingrado (punto de quiebre), Midway y El Alamein",
                    "Día D en Normandía (6 de junio de 1944)",
                    "Bombas atómicas en Hiroshima y Nagasaki (agosto 1945) y Holocausto nazi"
                ),
                formulas = listOf(
                    "\\text{Stalingrado (Frente Este)} + \\text{El Alamein (África)} + \\text{Midway (Pacífico)} = \\text{Puntos de Quiebre de 1942-1943}"
                ),
                formulaName = "Trilogía de Viraje de la Segunda Guerra Mundial",
                formulaLatex = "\\text{Expansión del Eje (1939-1941)} \\to \\text{Puntos de Inflexión (1942-1943)} \\to \\text{Ofensiva Aliada (1944-1945)}",
                formulaDescription = "Estructura canónica de la mayor conflagración bélica de la historia humana.",
                admissionTip = "La batalla más sangrienta e importante que decidió el destino de la Segunda Guerra Mundial fue la Batalla de Stalingrado (URSS), donde comenzó la derrota militar nazi.",
                admissionExplanation = "• En los Juicios de Núremberg (1945-1946) se tipificaron por primera vez los delitos de 'Crímenes de lesa humanidad' y 'Crímenes de guerra' para juzgar a los jerarcas nazis."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t08_s03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La batalla librada entre 1942 y 1943 en territorio soviético, considerada el punto de inflexión decisivo de la Segunda Guerra Mundial en Europa que marcó el inicio del retroceso irreversible de las fuerzas armadas nazis, fue la:",
                    options = listOf(
                        "Batalla de Inglaterra",
                        "Batalla de Stalingrado",
                        "Batalla de Midway",
                        "Batalla de las Ardenas",
                        "Batalla de Verdún"
                    ),
                    correctIndex = 1,
                    explanation = "La Batalla de Stalingrado concluyó en febrero de 1943 con la capitulación del VI Ejército alemán del mariscal Paulus ante el Ejército Rojo, marcando el quiebre estratégico definitivo de la Alemania nazi en la Segunda Guerra Mundial.",
                    subject = "Historia Universal",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "hu_t08_s04",
            subjectId = "historia_universal",
            semana = 8,
            subtema = "8.4 La Guerra Fría y el Orden Bipolar",
            title = "La Guerra Fría y el Orden Bipolar",
            theory = LessonTheory(
                id = "theory_hu_t08_s04",
                asignatura = "Historia Universal",
                semana = 8,
                titulo = "La Guerra Fría y el Orden Bipolar",
                resumen = "• La Guerra Fría (1945 - 1991):\n  - Estado de permanente tensión diplomática, ideológica, armamentista y propagandística entre las dos superpotencias surgidas de la posguerra: Estados Unidos (bloque capitalista occidental) y la Unión Soviética (bloque socialista oriental).\n  - Conferencia de Yalta y Potsdam (1945): División de Alemania y Berlín en cuatro zonas de ocupación militar.\n• Estructura Bipolar:\n  - Bloque Capitalista (EE. UU.):\n    - Doctrina Truman (1947): Contención global del avance comunista.\n    - Plan Marshall: Programa millonario de ayuda financiera y reconstrucción para Europa Occidental con el fin de frenar la influencia de partidos de izquierda.\n    - Alianza Militar: OTAN (Organización del Tratado del Atlántico Norte, 1949).\n  - Bloque Socialista (URSS):\n    - Consejo de Ayuda Mutua Económica (COMECON, 1949).\n    - Alianza Militar: Pacto de Varsovia (1955).\n• Focos de Tensión y Guerras Subsidiarias (Proxy Wars):\n  1. Bloqueo de Berlín (1948-1949): Stalin corta los accesos terrestres a Berlín Occidental; EE. UU. responde con un puente aéreo masivo. Da origen a la creación de las dos Alemanias: RFA (Federal, capital Bonn) y RDA (Democrática, comunista, capital Berlín Oriental). En 1961 se construye el Muro de Berlín.\n  2. Guerra de Corea (1950 - 1953): Primer choque militar caliente de la Guerra Fría. Finaliza con el Armisticio de Panmunjom, dividiendo a Corea en dos países a lo largo del Paralelo 38°.\n  3. Crisis de los Misiles en Cuba (octubre 1962): El momento más peligroso de riesgo nuclear mundial; Kennedy y Jruschov acuerdan el retiro de los misiles soviéticos en Cuba a cambio del compromiso de no invadir la isla y retirar misiles en Turquía.\n  4. Guerra de Vietnam (1955 - 1975): Intervención masiva militar de EE. UU. que terminó en su mayor derrota histórica frente al Vietcong y Vietnam del Norte (Ho Chi Minh). Vietnam se unificó como Estado socialista.\n• Fin de la Guerra Fría:\n  - Mijaíl Gorbachov asume el poder en la URSS (1985) e implementa dos reformas: Perestroika (reestructuración económica de apertura al mercado) y Glasnost (transparencia y libertad política/de prensa).\n  - Caída del Muro de Berlín (9 de noviembre de 1989): Símbolo de la desintegración del bloque comunista europeo.\n  - Disolución de la URSS (diciembre 1991): Renuncia de Gorbachov y nacimiento de la Comunidad de Estados Independientes (CEI). Fin del mundo bipolar y hegemonía unipolar de EE. UU.",
                conceptosClave = listOf(
                    "Mundo bipolar: Doctrina Truman / OTAN vs COMECON / Pacto de Varsovia",
                    "Guerra de Corea (1950-1953) y división en el Paralelo 38°",
                    "Crisis de los Misiles en Cuba (1962): máxima tensión nuclear (Kennedy y Jruschov)",
                    "Reformas de Gorbachov (Perestroika y Glasnost)",
                    "Caída del Muro de Berlín (1989) y disolución de la URSS (1991)"
                ),
                formulas = listOf(
                    "\\text{Bloque Occidental (EE. UU.)} = \\text{Plan Marshall} + \\text{OTAN}",
                    "\\text{Bloque Oriental (URSS)} = \\text{COMECON} + \\text{Pacto de Varsovia}"
                ),
                formulaName = "Bipolaridad de la Guerra Fría",
                formulaLatex = "\\text{Capitalismo / Democracia Liberal (EE. UU.)} \\;\\bot\\; \\text{Socialismo / Economía Centralizada (URSS)}",
                formulaDescription = "Matriz ideológica y militar que rigió las relaciones internacionales durante la segunda mitad del siglo XX.",
                admissionTip = "Las reformas de Gorbachov fueron dos: Perestroika = REESTRUCTURACIÓN económica; Glasnost = TRANSPARENCIA informativa y libertad política.",
                admissionExplanation = "• La caída del Muro de Berlín en 1989 simbolizó el colapso del comunismo soviético en Europa oriental y permitió la reunificación de Alemania en 1990."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_hu_t08_s04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El programa económico lanzado por los Estados Unidos en 1947 con el objetivo de financiar la reconstrucción material e industrial de los países de Europa Occidental y frenar el avance del comunismo soviético fue el:",
                    options = listOf(
                        "Plan Schlieffen",
                        "New Deal",
                        "Plan Marshall",
                        "Tratado de Roma",
                        "Pacto de Varsovia"
                    ),
                    correctIndex = 2,
                    explanation = "El Plan Marshall (Programa de Recuperación Europea), impulsado por el secretario de Estado George Marshall, otorgó multimillonarias ayudas económicas y créditos a las naciones europeas devastadas para reconstruir su economía de mercado y alejarlas de la órbita soviética.",
                    subject = "Historia Universal",
                    semana = 8
                )
            )
        )
    )
}
