package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object GeografiaCatalog {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geog_t01",
            subjectId = "geografia",
            semana = 1,
            subtema = "1.1 Nociones Fundamentales y Principios Geográficos",
            title = "Nociones Fundamentales de Geografía y Principios Geográficos",
            theory = LessonTheory(
                id = "theory_geog_t01",
                asignatura = "Geografía",
                semana = 1,
                titulo = "Nociones Fundamentales de Geografía y Principios Geográficos",
                resumen = "La geografía es la ciencia social y natural que estudia las interrelaciones dialécticas entre el hombre (sociedad) y su medio geográfico (naturaleza) en el espacio geográfico (ecúmene).\n\n• Principios Geográficos Fundamentales:\n  1. Localización o Extensión (Federico Ratzel): Es el principio fundamental. Todo hecho o fenómeno geográfico debe ser ubicado con precisión espacial mediante coordenadas geográficas (latitud, longitud, altitud), límites y superficie.\n  2. Descripción (Paul Vidal de la Blache): Consiste en señalar las características, rasgos distintivos y morfología del fenómeno geográfico.\n  3. Causalidad o Explicación (Alexander von Humboldt, padre de la geografía moderna): Investiga el origen, causas y porqués del fenómeno geográfico para darle carácter científico.\n  4. Comparación o Analogía (Karl Ritter y Paul Vidal de la Blache): Establece semejanzas y diferencias entre hechos geográficos similares en distintas partes del planeta.\n  5. Conexión o Relación (Jean Brunhes): Nada está aislado; todos los fenómenos geográficos se encuentran interconectados en constante interacción.\n  6. Actividad o Dinamismo (Jean Brunhes): El espacio geográfico no es estático; todo se transforma permanentemente por la acción de agentes naturales o antrópicos.",
                conceptosClave = listOf(
                    "Objeto de estudio: el espacio geográfico y la relación sociedad-naturaleza",
                    "Principio de Localización de Ratzel como condición previa indispensable",
                    "Principio de Causalidad de Humboldt que eleva la geografía a rango científico",
                    "Doctrinas geográficas: Determinismo geográfico (Ratzel) vs Posibilismo geográfico (Vidal de la Blache)"
                ),
                formulas = listOf(
                    "\\text{Espacio Geográfico} = \\text{Medio Natural (Biótico + Abiótico)} + \\text{Acción Antrópica (Sociedad)}",
                    "\\text{Causalidad (Humboldt)}: \\; \\text{Identificar causas} \\implies \\text{Predecir y mitigar consecuencias}"
                ),
                formulaName = "Principios Metodológicos de la Geografía",
                formulaLatex = "\\text{Localización (Ratzel)} + \\text{Causalidad (Humboldt)} + \\text{Conexión/Actividad (Brunhes)}",
                formulaDescription = "Marco epistemológico y metodológico de la ciencia geográfica.",
                admissionTip = "Si la pregunta de admisión consulta '¿quién es considerado el padre de la geografía moderna por aplicar el principio de causalidad?', la respuesta inequívoca es Alexander von Humboldt.",
                admissionExplanation = "• No confundas el Determinismo Geográfico de Friedrich Ratzel (el medio físico condiciona de forma fatalista el desarrollo humano) con el Posibilismo Geográfico de Paul Vidal de la Blache (el hombre dispone de posibilidades técnicas para modificar su entorno)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t01_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El principio geográfico que indaga el origen y las causas de los fenómenos físicos otorgando rigor científico a la investigación fue formulado por Alexander von Humboldt y se denomina:",
                    options = listOf("Localización", "Causalidad o Explicación", "Analogía o Comparación", "Conexión", "Actividad"),
                    correctIndex = 1,
                    explanation = "El principio de causalidad o explicación, postulado por Humboldt, establece que no basta con describir un fenómeno, sino que se deben investigar sus causas desencadenantes.",
                    subject = "Geografía",
                    semana = 1
                ),
                Challenge(
                    id = "q_geog_t01_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La doctrina geográfica formulada por Federico Ratzel que sostiene que las condiciones del medio físico determinan fatalmente el desarrollo sociocultural y económico de las sociedades humanas es el:",
                    options = listOf("Posibilismo geográfico", "Determinismo geográfico", "Estructuralismo espacial", "Neopositivismo", "Paisajismo cultural"),
                    correctIndex = 1,
                    explanation = "El determinismo geográfico postula que el medio ambiente físico ejerce una influencia restrictiva y determinante sobre las sociedades humanas y su civilización.",
                    subject = "Geografía",
                    semana = 1
                )
            )
        ),
        LessonNode(
            id = "geog_t02",
            subjectId = "geografia",
            semana = 2,
            subtema = "2.1 Geodesia y Cartografía",
            title = "Geodesia y Cartografía: Líneas Imaginarias y Mapas",
            theory = LessonTheory(
                id = "theory_geog_t02",
                asignatura = "Geografía",
                semana = 2,
                titulo = "Geodesia y Cartografía: Líneas Imaginarias y Mapas",
                resumen = "• Geodesia: Ciencia que estudia la forma y dimensiones de la Tierra (geoide piriforme, elipsoide de revolución achatado en los polos y ensanchado en el ecuador debido a la fuerza centrífuga y rotación).\n• Líneas y Círculos Imaginarios:\n  - Eje Terrestre: Inclinado 23°27' respecto a la perpendicular de la eclíptica.\n  - Ecuador Terrestre (Paralelo 0°): Divide a la Tierra en Hemisferio Norte (Boreal, Septentrional) y Hemisferio Sur (Austral, Meridional). Es el paralelo mayor.\n  - Meridianos (Semicírculos de 180° que van de polo a polo): Meridiano de Greenwich (Meridiano 0° o de origen, divide en Este/Oriente y Oeste/Occidente; base de los husos horarios) y Antimeridiano de 180° (Línea Internacional del Cambio de Fecha).\n• Coordenadas Geográficas:\n  - Latitud: Distancia angular medida en grados, minutos y segundos desde cualquier punto hacia el Ecuador (0° a 90° N o S).\n  - Longitud: Distancia angular medida hacia el meridiano de Greenwich (0° a 180° E o W).\n• Cartografía y Representaciones:\n  - Globos Terráqueos: Representación más exacta (sin deformación de escala), pero pequeña.\n  - Mapas: Representan superficies extensas a escala pequeña (1:200,000 a más), son bidimensionales y deforman la realidad. Carta Nacional del Perú: escala 1:100,000.\n  - Planos: Representan superficies pequeñas (ciudades, viviendas) a escala grande (1:100 a 1:20,000), con gran detalle y sin deformación apreciable.\n  - Curvas de Nivel (Isolíneas o Isopletas): Líneas que unen puntos de igual altitud sobre el nivel del mar.",
                conceptosClave = listOf(
                    "Forma real de la Tierra: Geoide (superficie equipotencial gravitatoria)",
                    "Inclinación del eje terrestre (23°27') y estaciones astronómicas",
                    "Coordenadas: Latitud (respecto al Ecuador) y Longitud (respecto a Greenwich)",
                    "Escalas cartográficas: Relación de tamaño E = Terreno / Papel y curvas de nivel"
                ),
                formulas = listOf(
                    "\\text{Escala} = \\frac{\\text{Distancia en el mapa (d)}}{\\text{Distancia en el terreno (D)}}",
                    "\\text{Curvas de nivel muy juntas} \\implies \\text{Pendiente abrupta (Relieve escarpado)}",
                    "\\text{Curvas de nivel separadas} \\implies \\text{Pendiente suave (Terreno llano)}"
                ),
                formulaName = "Fórmula Cartográfica de Escala",
                formulaLatex = "E = \\frac{1}{X} = \\frac{d}{D} \\implies D = d \\cdot X",
                formulaDescription = "Proporción matemática entre la dimensión representada en el plano y su medida real en el terreno.",
                admissionTip = "Recuerda: Cuanto MAYOR sea el denominador de la escala (por ejemplo 1:1,000,000), MENOR es la escala y MENOS detalle muestra el mapa (ideal para países enteros).",
                admissionExplanation = "• Cuando las curvas de nivel están muy próximas entre sí, representan un acantilado o una fuerte pendiente; cuando están muy separadas, indican una llanura o terreno de suave declive."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t02_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la Carta Nacional del Perú, elaborada por el Instituto Geográfico Nacional (IGN) a una escala de 1:100,000, una distancia de 5 cm medida en el papel equivale en el terreno real a:",
                    options = listOf("500 m", "5 km", "50 km", "500 km", "0.5 km"),
                    correctIndex = 1,
                    explanation = "D = d · denominador = 5 cm · 100,000 = 500,000 cm.\nConvirtiendo a kilómetros: 500,000 cm / 100,000 cm/km = 5 km.",
                    subject = "Geografía",
                    semana = 2
                ),
                Challenge(
                    id = "q_geog_t02_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La distancia angular medida en grados, minutos y segundos desde cualquier punto de la superficie terrestre hacia el meridiano de Greenwich se denomina:",
                    options = listOf("Latitud", "Altitud", "Longitud", "Cenit", "Nadir"),
                    correctIndex = 2,
                    explanation = "La longitud es la distancia angular respecto al meridiano base de Greenwich, variando de 0° a 180° hacia el Este o hacia el Oeste.",
                    subject = "Geografía",
                    semana = 2
                )
            )
        ),
        LessonNode(
            id = "geog_t03",
            subjectId = "geografia",
            semana = 3,
            subtema = "3.1 El Universo, el Sistema Planetario Solar y la Tierra",
            title = "El Universo, el Sistema Planetario Solar y la Tierra",
            theory = LessonTheory(
                id = "theory_geog_t03",
                asignatura = "Geografía",
                semana = 3,
                titulo = "El Universo, el Sistema Planetario Solar y la Tierra",
                resumen = "• Origen del Universo: Teoría del Big Bang o Gran Explosión (George Lemaître y George Gamow, confirmada por la radiación cósmica de fondo de Penzias y Wilson y la recesión de galaxias de Edwin Hubble).\n• El Sistema Planetario Solar (SPS):\n  - El Sol: Estrella enana amarilla de secuencia principal, compuesta principalmente de hidrógeno (fusión a helio) que genera energía electromagnética.\n  - Planetas Interiores o Terrestres (rocosos, densos, pocos satélites): Mercurio, Venus (el más caliente por efecto invernadero desbocado y rotación retrógrada), Tierra y Marte ('planeta rojo' por óxido de hierro).\n  - Cinturón de Asteroides (entre Marte y Júpiter).\n  - Planetas Exteriores o Jovianos (gaseosos, gigantes, anillos, numerosos satélites): Júpiter (el más grande, Gran Mancha Roja), Saturno (sistema de anillos vistoso, Titán), Urano (rotación inclinada casi 98° horizontal) y Neptuno (vientos más veloces).\n• Movimientos de la Tierra:\n  - Rotación: Gira de Oeste a Este sobre su eje en 23h 56m 4s (día sidéreo). Consecuencias: Sucesión del día y la noche, achatamiento polar, efecto Coriolis (desviación de vientos hacia la derecha en hemisferio norte y hacia la izquierda en el sur) y determinación de los puntos cardinales.\n  - Traslación: Órbita elíptica alrededor del Sol en 365 días 5h 48m 45s (año trópico). Perihelio (punto más cercano, enero) y Afelio (punto más lejano, julio). Consecuencias: Estaciones del año (por inclinación del eje terrestre), equinoccios (días y noches iguales, primavera/otoño) y solsticios (verano/invierno, máxima disparidad lumínica).",
                conceptosClave = listOf(
                    "Teoría del Big Bang y radiación cósmica de fondo",
                    "Clasificación planetaria: rocosos interiores vs gaseosos exteriores",
                    "Movimiento de Rotación y Efecto Coriolis (desviación inercial)",
                    "Movimiento de Traslación e inclinación del eje como causas de las estaciones"
                ),
                formulas = listOf(
                    "\\text{Rotación Terrestre} \\implies \\text{Sucesión día/noche} + \\text{Fuerza de Coriolis}",
                    "\\text{Traslación} + \\text{Inclinación del eje (23°27')} \\implies \\text{Estaciones del año}"
                ),
                formulaName = "Mecánica Celeste Terrestre",
                formulaLatex = "\\text{Efecto Coriolis}: \\; \\text{Desvía a la derecha en el HNorte y a la izquierda en el HSur}",
                formulaDescription = "Dinámica atmosférica e hidrológica provocada por el giro planetario terrestre.",
                admissionTip = "Recuerda que la causa de las estaciones NO es la distancia de la Tierra al Sol (de hecho en enero estamos en el perihelio más cerca y es invierno en el hemisferio norte), sino la INCLINACIÓN del eje terrestre.",
                admissionExplanation = "• Venus es el planeta más caliente de todo el sistema solar (incluso más que Mercurio) debido a su densa atmósfera de dióxido de carbono que genera un efecto invernadero extremo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t03_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La fuerza inercial provocada por el movimiento de rotación terrestre que desvía los vientos y corrientes marinas hacia la derecha en el hemisferio norte y hacia la izquierda en el sur es:",
                    options = listOf("La fuerza centrípeta", "El efecto Coriolis", "La gravedad lunar", "La fuerza de Lorentz", "El efecto Doppler"),
                    correctIndex = 1,
                    explanation = "El efecto Coriolis, derivado de la rotación de la Tierra de oeste a este, genera la deflexión de las masas fluidas en movimiento sobre el globo.",
                    subject = "Geografía",
                    semana = 3
                ),
                Challenge(
                    id = "q_geog_t03_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El planeta del Sistema Solar con mayor temperatura superficial debido a un desbocado efecto invernadero causado por su densa atmósfera de CO₂ es:",
                    options = listOf("Mercurio", "Venus", "Marte", "Júpiter", "Saturno"),
                    correctIndex = 1,
                    explanation = "Venus registra temperaturas superiores a los 460 °C debido al severo efecto invernadero generado por su atmósfera compuesta en más del 95% de CO₂.",
                    subject = "Geografía",
                    semana = 3
                )
            )
        ),
        LessonNode(
            id = "geog_t04",
            subjectId = "geografia",
            semana = 4,
            subtema = "4.1 Geósfera y Geodinámica Interna y Externa",
            title = "Geósfera y Geodinámica: Tectónica de Placas y Relieve",
            theory = LessonTheory(
                id = "theory_geog_t04",
                asignatura = "Geografía",
                semana = 4,
                titulo = "Geósfera y Geodinámica: Tectónica de Placas y Relieve",
                resumen = "• Estructura de la Geósfera:\n  - Corteza o Litosfera: SIAL (corteza continental granítica rica en silicio y aluminio) y SIMA (corteza oceánica basáltica rica en silicio y magnesio).\n  - Manto o Mesosfera: Astenosfera (manto superior con corrientes de convección de magma que desplazan las placas litosféricas) y Pirosfera.\n  - Núcleo, Endosfera o NIFE: Capa interna de níquel y hierro. Núcleo externo líquido (genera el campo magnético) e interno sólido (por altísima presión).\n• Geodinámica Interna (Fuerzas Constructoras de Relieve):\n  - Tectónica de Placas: Placa de Nazca (oceánica) subduce bajo la Placa Sudamericana (continental), originando la Fosa Marina Peruana, la Cordillera de los Andes y alta sismicidad.\n  - Diastrofismo: Orogénesis (formación de montañas por plegamientos o fallas tectónicas) y Epirogénesis (movimientos verticales lentos de ascenso y descenso de masas continentales para recuperar el equilibrio isostático).\n  - Vulcanismo: Intrusivo (plutones, batolitos) y Extrusivo (volcanes, coladas de lava).\n• Geodinámica Externa (Fuerzas Modeladoras y Destructoras):\n  - Meteorización: Desintegración estática de rocas in situ (mecánica/física por cambios térmicos o química por oxidación/carbonatación).\n  - Erosión: Desgaste, transporte y sedimentación dinámica por agentes móviles (fluvial, eólica, marina, glaciar y kárstica).",
                conceptosClave = listOf(
                    "Capas de la Tierra: SIAL, SIMA, Astenosfera y Núcleo de NIFE",
                    "Teoría de la Tectónica de Placas y Subducción Nazca - Sudamericana",
                    "Orogénesis (plegamientos/fallas) y equilibrio isostático",
                    "Meteorización (estática) vs Erosión (desgaste + transporte + depósito)"
                ),
                formulas = listOf(
                    "\\text{Subducción (Nazca bajo Sudamericana)} \\implies \\text{Fosas marinas} + \\text{Cordillera de los Andes} + \\text{Sismicidad}",
                    "\\text{Erosión Fluvial} \\implies \\text{Valles en V, Cañones, Cascadas (Degradación)} \\; \\& \\; \\text{Deltas/Conos (Agradación)}"
                ),
                formulaName = "Ecuación de la Dinámica del Relieve",
                formulaLatex = "\\text{Relieve Terrestre} = \\text{Fuerzas Endógenas (Construcción)} - \\text{Fuerzas Exógenas (Degradación)}",
                formulaDescription = "Equilibrio geomorfológico permanente entre tectónica interna y meteorización externa.",
                admissionTip = "En el Perú, la Cordillera de los Andes y los terremotos se deben al choque convergente de subducción entre la Placa de Nazca y la Placa Sudamericana.",
                admissionExplanation = "• No confundas meteorización con erosión: la meteorización fragmenta la roca en el mismo lugar (in situ) sin transportarla; la erosión involucra obligatoriamente transporte y depósito de sedimentos mediante un agente móvil (río, viento, glaciar)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t04_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La Cordillera de los Andes y la fosa marina peruana se formaron principalmente debido al proceso geodinámico interno de:",
                    options = listOf(
                        "Subducción de la Placa de Nazca bajo la Placa Sudamericana",
                        "Divergencia entre la Placa Pacífica y la Placa de Cocos",
                        "Falla transformante de San Andrés",
                        "Epirogénesis marina en el zócalo continental",
                        "Erosión eólica en la meseta del Collao"
                    ),
                    correctIndex = 0,
                    explanation = "La convergencia por subducción donde la placa oceánica de Nazca se hunde bajo la placa continental Sudamericana pliega la corteza y forma los Andes.",
                    subject = "Geografía",
                    semana = 4
                ),
                Challenge(
                    id = "q_geog_t04_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La capa superior del manto terrestre donde se producen las corrientes convectivas de magma que mueven las placas tectónicas se denomina:",
                    options = listOf("Litosfera", "Astenosfera", "Endosfera", "Barisfera", "Sial"),
                    correctIndex = 1,
                    explanation = "La astenosfera es la zona semisólida del manto superior donde fluyen las corrientes de convección térmica que impulsan a las placas litosféricas.",
                    subject = "Geografía",
                    semana = 4
                )
            )
        ),
        LessonNode(
            id = "geog_t05",
            subjectId = "geografia",
            semana = 5,
            subtema = "5.1 Atmósfera, Tiempo y Clima",
            title = "Atmósfera, Tiempo y Clima: Dinámica Meteorológica",
            theory = LessonTheory(
                id = "theory_geog_t05",
                asignatura = "Geografía",
                semana = 5,
                titulo = "Atmósfera, Tiempo y Clima: Dinámica Meteorológica",
                resumen = "• Estructura de la Atmósfera:\n  - Troposfera: Capa inferior (0 a 12 km), contiene el 80% de la masa gaseosa y todo el vapor de agua. Ocurren todos los fenómenos meteorológicos (lluvia, nubes, vientos). Gradiente térmico vertical: la temperatura disminuye 6 °C por cada 1000 m de ascenso.\n  - Estratosfera: Contiene la Capa de Ozono (O₃) que absorbe la radiación ultravioleta dañina.\n  - Mesosfera: Capa más fría (-90 °C), desintegra meteoritos (estrellas fugaces).\n  - Termosfera o Ionosfera: Capa con gas ionizado que refleja ondas de radio telecomunicativas y donde se forman las auroras polares.\n  - Exosfera: Límite con el espacio exterior.\n• Tiempo Meteorológico vs Clima:\n  - Tiempo: Estado físico transitorio y momentáneo de la atmósfera en un lugar y hora determinados.\n  - Clima: Estado promedio y representativo de las condiciones atmosféricas en un lapso prolongado (mínimo 30 años).\n• Elementos del Clima: Temperatura, presión atmosférica (a mayor altitud menor presión), humedad, vientos y precipitaciones.\n• Factores del Clima Peruano (¿Por qué el Perú no es enteramente tropical?):\n  1. Cordillera de los Andes: Barrera orográfica que divide las masas de aire amazónicas húmedas de la árida costa.\n  2. Corriente de Humboldt (Aguas Frías): Enfría el aire costero, genera estabilidad atmosférica y produce nieblas e inversión térmica (ausencia de lluvias torrenciales en la costa central y sur).\n  3. Anticiclón del Pacífico Sur (APS): Masas de aire seco que empujan vientos alisios fríos.\n  4. Corriente del Niño: Aguas cálidas en la costa norte (lluvias de verano).",
                conceptosClave = listOf(
                    "Troposfera y gradiente térmico vertical (disminución de 6 °C cada 1 km)",
                    "Estratosfera y función protectora de la capa de ozono (O₃)",
                    "Diferencia conceptual entre Tiempo meteorológico (momentáneo) y Clima (promedio multidecenal)",
                    "Factores climáticos determinantes en el Perú: Andes, Corriente Peruana y Anticiclón del Pacífico Sur"
                ),
                formulas = listOf(
                    "\\text{Gradiente térmico troposférico} = -6.5^\\circ \\text{C} \\; / \\; 1000 \\text{ m de altitud}",
                    "\\text{Presión atmosférica} \\propto \\frac{1}{\\text{Altitud}}"
                ),
                formulaName = "Factores Climáticos del Territorio Peruano",
                formulaLatex = "\\text{Clima Peruano} = f(\\text{Cordillera de los Andes}, \\text{Corriente Peruana Fría}, \\text{Anticiclón del Pacífico Sur})",
                formulaDescription = "Causas geográficas de la aridez costeña y la megabiodiversidad climática del Perú.",
                admissionTip = "La costa central y sur del Perú no tiene lluvias torrenciales a pesar de estar en zona tropical debido a la Corriente Peruana de Humboldt (aguas frías), que genera el fenómeno de inversión térmica y neblinas estratosféricas.",
                admissionExplanation = "• La capa de ozono se localiza en la Estratosfera (aproximadamente entre los 20 y 35 km de altitud) y su función es filtrar la radiación UV letal para la vida orgánica."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t05_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La capa atmosférica donde se producen todos los fenómenos meteorológicos como lluvias, vientos, tormentas y nubes es la:",
                    options = listOf("Troposfera", "Estratosfera", "Mesosfera", "Termosfera", "Exosfera"),
                    correctIndex = 0,
                    explanation = "La troposfera es la capa de contacto con la superficie terrestre y alberga prácticamente todo el vapor de agua y gases responsables de los meteoros.",
                    subject = "Geografía",
                    semana = 5
                ),
                Challenge(
                    id = "q_geog_t05_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El factor geográfico fundamental que actúa como una barrera orográfica natural modificando el clima tropical del Perú y generando múltiples pisos altitudinales es:",
                    options = listOf(
                        "La Corriente del Niño",
                        "La Cordillera de los Andes",
                        "El Anticiclón del Atlántico Sur",
                        "La Selva Amazónica",
                        "El Lago Titicaca"
                    ),
                    correctIndex = 1,
                    explanation = "La imponente Cordillera de los Andes intercepta los vientos húmedos del este y genera una enorme variedad de pisos altitudinales con microclimas únicos.",
                    subject = "Geografía",
                    semana = 5
                )
            )
        ),
        LessonNode(
            id = "geog_t06",
            subjectId = "geografia",
            semana = 6,
            subtema = "6.1 Hidrósfera: Mar Peruano y Cuencas Hidrográficas",
            title = "Hidrósfera: Mar Peruano y Cuencas Hidrográficas",
            theory = LessonTheory(
                id = "theory_geog_t06",
                asignatura = "Geografía",
                semana = 6,
                titulo = "Hidrósfera: Mar Peruano y Cuencas Hidrográficas",
                resumen = "• El Mar de Grau (Mar Peruano):\n  - Extensión de 200 millas marinas promulgada en 1947 por José Luis Bustamante y Rivero. Ratificado con el fallo de La Haya (2014) en el límite con Chile.\n  - Sectores: Mar Frío (sur y centro, 13 °C - 17 °C) y Mar Tropical (norte desde Tumbes/Piura, > 22 °C, manglares).\n  - Riqueza Ictiológica Excepcional: El Mar Frío peruano es uno de los más productivos del planeta gracias al fenómeno del afloramiento (upwelling), donde aguas profundas ricas en nutrientes minerales ascienden a la superficie, alimentando al fitoplancton y zooplancton (base de la cadena trófica de la anchoveta y sardina).\n• Cuencas Hidrográficas del Perú:\n  - Vertiente del Pacífico: Ríos de corto recorrido, régimen irregular (crecidas en verano y estiaje en invierno), torrentosos y de cuenca exorreica. Ejemplos: Rímac, Majes, Santa (el más caudaloso de la costa).\n  - Vertiente del Amazonas: Ríos de largo recorrido, caudalosos, navegables, régimen regular y cuenca exorreica hacia el océano Atlántico. El río Amazonas nace en el nevado Mismi (Arequipa) por la confluencia del Marañón y Ucayali (el río más largo del Perú).\n  - Vertiente del Titicaca: Cuenca endorreica cerrada en el Altiplano andino. Ríos meándricos y de corta longitud que desembocan en el Lago Titicaca (Ramis, Ilave, Coata, Huancané). El río Desaguadero es su único efluente natural.",
                conceptosClave = listOf(
                    "Fenómeno del Afloramiento (upwelling) y fitoplancton como causa de la riqueza marina",
                    "Sectores del Mar Peruano: Mar Frío de la Corriente Peruana vs Mar Tropical",
                    "Vertiente del Pacífico: ríos transversales, irregulares y torrentosos",
                    "Vertiente del Amazonas (caudalosos y navegables) vs Vertiente endorreica del Titicaca"
                ),
                formulas = listOf(
                    "\\text{Afloramiento Marino} = \\text{Vientos alisios} + \\text{Rotación de la Tierra} \\implies \\text{Nutrientes minerales a la superficie}",
                    "\\text{Río Amazonas} = \\text{Confluencia del río Ucayali (más largo)} + \\text{río Marañón}"
                ),
                formulaName = "Dinámica de las Cuencas Hidrográficas",
                formulaLatex = "\\text{Cuencas del Perú}: \\; \\text{Pacífico (Exorreica irregular)} + \\text{Amazonas (Exorreica regular)} + \\text{Titicaca (Endorreica)}",
                formulaDescription = "Sistemas hidrográficos determinados por la divisoria de aguas de los Andes.",
                admissionTip = "El río más largo del Perú es el Ucayali, mientras que el río más caudaloso de la vertiente del Pacífico es el Santa.",
                admissionExplanation = "• El fenómeno del afloramiento es impulsado por los vientos alisios del sureste que retiran el agua superficial caliente de la costa, permitiendo el ascenso de las aguas gélidas y ricas en sales del fondo marino."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t06_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El fenómeno oceanográfico que consiste en el ascenso de aguas gélidas y cargadas de nutrientes minerales desde el fondo marino hacia la superficie se denomina:",
                    options = listOf("Marea viva", "Inversión térmica", "Afloramiento o upwelling", "Efecto foehn", "Eutrofización"),
                    correctIndex = 2,
                    explanation = "El afloramiento transporta nitratos, fosfatos y silicatos a la zona fótica iluminada, detonando la floración del fitoplancton que sustenta la biomasa marina.",
                    subject = "Geografía",
                    semana = 6
                ),
                Challenge(
                    id = "q_geog_t06_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La vertiente hidrográfica del Perú que posee una cuenca de tipo endorreico (las aguas no tienen salida hacia los océanos abiertos) corresponde a:",
                    options = listOf(
                        "La vertiente del Océano Pacífico",
                        "La cuenca del río Amazonas",
                        "La cuenca del Lago Titicaca",
                        "La cuenca del río Madre de Dios",
                        "La cuenca del río Huallaga"
                    ),
                    correctIndex = 2,
                    explanation = "La hoya hidrográfica del Titicaca es una cuenca endorreica cerrada en la meseta del Collao, donde los ríos tributan en el lago Titicaca.",
                    subject = "Geografía",
                    semana = 6
                )
            )
        ),
        LessonNode(
            id = "geog_t07",
            subjectId = "geografia",
            semana = 7,
            subtema = "7.1 Geomorfología y Relieve del Territorio Peruano",
            title = "Geomorfología del Perú: Costa, Sierra y Selva",
            theory = LessonTheory(
                id = "theory_geog_t07",
                asignatura = "Geografía",
                semana = 7,
                titulo = "Geomorfología del Perú: Costa, Sierra y Selva",
                resumen = "El relieve peruano es uno de los más accidentados y diversos del mundo debido a la tectónica andina y los procesos erosivos.\n\n• Relieve Costeño (Franja desértica árida de 0 a 500 msnm):\n  - Valles aluviales transversales: Las áreas más pobladas y de mayor productividad agropecuaria intensiva (Valle de Chicama, Rímac, Majes).\n  - Pampas: Llanuras áridas con alto potencial agrícola que requieren irrigación (Olmos, Majes, La Joya).\n  - Tablazos: Terrazas marinas en lento proceso de levantamiento epirogénico con ricas reservas de hidrocarburos/petróleo (Zorritos, Lobitos, Talara).\n  - Depresiones: Zonas bajo el nivel del mar con afloramiento de salitre y salmuera (Bayóvar en Piura, -37 msnm, la más profunda del Perú).\n  - Desiertos y dunas: Huacachina, Sechura (el más extenso del Perú).\n• Relieve Andino (Sierra, por encima de los 500 msnm):\n  - Cordilleras y Picos Nevados: Huascarán (6768 msnm, máxima cumbre del Perú y de la zona intertropical).\n  - Mesetas Altiplánicas: Altiplanicies aptas para la ganadería de camélidos y ovinos (Collao en Puno, Bombón en Junín).\n  - Cañones Fluviales: Profundas gargantas erosionadas por ríos (Cotahuasi y Colca en Arequipa, de los más profundos del mundo).\n  - Pasos o Abras: Depresiones naturales en las cordilleras que facilitan el tendido de carreteras y vías férreas (Ticlio o Anticona).\n• Relieve Amazónico (Selva Alta y Baja):\n  - Selva Alta (Rupa Rupa): Valles longitudinales (Chanchamayo, Quillabamba) y Pongos (pasos fluviales en cordilleras: Manseriche y Rentema).\n  - Selva Baja (Omagua): Tahuampas (zonas inundadas permanentemente), Restingas (inundables periódicamente), Altos (ciudades no inundables como Iquitos y Pucallpa) y Filos.",
                conceptosClave = listOf(
                    "Relieve costeño: valles aluviales, pampas irrigables, tablazos petroleros y depresiones salinas",
                    "Relieve andino: cordilleras, mesetas ganaderas, cañones profundos y pasos o abras",
                    "Relieve amazónico: valles longitudinales, pongos y pisos de la llanura (tahuampas, restingas, altos y filos)"
                ),
                formulas = listOf(
                    "\\text{Tablazos} \\implies \\text{Levantamiento epirogénico + Petróleo y gas}",
                    "\\text{Llanura Amazónica} = \\text{Tahuampas (Inundadas)} + \\text{Restingas (Inundación estacional)} + \\text{Altos (Ciudades)}"
                ),
                formulaName = "Morfología de la Llanura Amazónica",
                formulaLatex = "\\text{Tahuampas} \\to \\text{Restingas} \\to \\text{Altos (Asentamiento urbano)} \\to \\text{Filos}",
                formulaDescription = "Organización geomorfológica escalonada de la selva baja según su nivel de inundación fluvial.",
                admissionTip = "Recuerda que en la Selva Baja las ciudades principales (Iquitos, Pucallpa, Tarapoto) se ubican en los ALTOS, porque son terrazas no inundables.",
                admissionExplanation = "• La depresión de Bayóvar (Piura) es el punto más bajo de todo el territorio peruano (-37 metros bajo el nivel del mar) y alberga los mayores yacimientos de fosfatos del país."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t07_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "En la morfología de la Selva Baja peruana (Omagua), las ciudades principales y poblaciones permanentes se construyen sobre los relieves no inundables denominados:",
                    options = listOf("Tahuampas o aguajales", "Restingas", "Altos", "Filos", "Meandros"),
                    correctIndex = 2,
                    explanation = "Los 'altos' son terrazas aluviales elevadas donde los ríos no llegan en épocas de crecida, haciéndolos ideales para los asentamientos humanos urbanos.",
                    subject = "Geografía",
                    semana = 7
                ),
                Challenge(
                    id = "q_geog_t07_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Los relieves costeños de estructura rocosa en lento proceso de levantamiento epirogénico que contienen reservas de petróleo y gas natural se conocen como:",
                    options = listOf("Pampas", "Tablazos", "Valles", "Depresiones", "Estepas"),
                    correctIndex = 1,
                    explanation = "Los tablazos (como los de Máncora, Talara y Zorritos) son terrazas marinas en levantamiento con importantes cuencas de hidrocarburos.",
                    subject = "Geografía",
                    semana = 7
                )
            )
        ),
        LessonNode(
            id = "geog_t08",
            subjectId = "geografia",
            semana = 8,
            subtema = "8.1 Las Ocho Regiones Naturales del Perú (Pulgar Vidal)",
            title = "Las Ocho Regiones Naturales del Perú de Javier Pulgar Vidal",
            theory = LessonTheory(
                id = "theory_geog_t08",
                asignatura = "Geografía",
                semana = 8,
                titulo = "Las Ocho Regiones Naturales del Perú de Javier Pulgar Vidal",
                resumen = "Tesis clásica presentada en 1940 por Javier Pulgar Vidal sustentada en criterios ecológicos, pisos altitudinales, toponimia indígena, clima, flora, fauna y actividad antrópica tradicional.\n\n1. Chala o Costa (0 a 500 msnm): 'Planta de maíz' o 'tupido'. Clima árido y templado cálido. Vegetación de lomas (amancae), algarrobos y manglares.\n2. Yunga (500 a 2300 msnm): 'Valle cálido' o 'mujer estéril'. Yunga marítima y fluvial. Clima templado cálido, soleado todo el año. 'Región de los frutales' (chirimoya, lúcuma, palta) y zona de huaycos.\n3. Quechua (2300 a 3500 msnm): 'Tierra de climas templados'. El mejor clima del mundo (templado seco con lluvias de verano). Despensa agrícola de tubérculos y cereales andinos (maíz).\n4. Suni o Jalca (3500 a 4000 msnm): 'Tierras altas'. Clima frío y seco, límite de la agricultura de secano (quinua, olluco, mashua). Inicio de las heladas meteorológicas.\n5. Puna (4000 a 4800 msnm): 'Mal de altura' o 'soroche'. Clima muy frío con marcadas oscilaciones térmicas día/noche. Mesetas, lagunas y pajonales de ichu. Crianza de camélidos sudamericanos.\n6. Janca o Cordillera (4800 a 6768 msnm): 'Blanco'. Clima gélido polar con nieves perpetuas y glaciares. Cóndor andino y vizcacha. Escasa vegetación (yareta).\n7. Rupa Rupa o Selva Alta (400 a 1000 msnm): 'Ardiente'. Flanco oriental andino. Clima tropical lluvioso, valles longitudinales, pongos y cascadas. Región más lluviosa del Perú. Gallito de las rocas.\n8. Omagua o Selva Baja (80 a 400 msnm): 'Peces de agua dulce'. Gran llanura aluvial amazónica. Clima muy cálido, húmedo y lluvioso. Río Amazonas, paiche, charapa y árboles madereros (caoba, cedro).",
                conceptosClave = listOf(
                    "Criterio altitudinal combinado con toponimia indígena y bioclimas",
                    "Región Quechua: considerada el clima más benigno y saludable del mundo",
                    "Puna: región ganadera de camélidos y frío extremo con heladas",
                    "Rupa Rupa (Selva Alta, más lluviosa) vs Omagua (Selva Baja, llanura cálida de ríos navegables)"
                ),
                formulas = listOf(
                    "\\text{Costa (0-500)} \\to \\text{Yunga (500-2300)} \\to \\text{Quechua (2300-3500)} \\to \\text{Suni (3500-4000)}",
                    "\\to \\text{Puna (4000-4800)} \\to \\text{Janca (4800-6768)} \\quad \\& \\quad \\text{Rupa Rupa (400-1000)} \\to \\text{Omagua (80-400)}"
                ),
                formulaName = "Escalafón Altitudinal de Pulgar Vidal",
                formulaLatex = "\\text{Chala} \\to \\text{Yunga} \\to \\text{Quechua} \\to \\text{Suni} \\to \\text{Puna} \\to \\text{Janca} \\quad | \\quad \\text{Rupa Rupa} \\to \\text{Omagua}",
                formulaDescription = "Sucesión ecológica transversal del territorio peruano desde el mar hasta la llanura amazónica.",
                admissionTip = "La región Quechua (2300 a 3500 msnm) es reconocida tradicionalmente en exámenes de admisión por tener 'el mejor clima del mundo' (templado seco y benigno).",
                admissionExplanation = "• En la región Suni (3500 a 4000 msnm) se produce el límite superior de la agricultura tecnificada y es la zona donde las heladas nocturnas empiezan a constituir una seria amenaza para los cultivos."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t08_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según la tesis de las Ocho Regiones Naturales de Javier Pulgar Vidal, la región que se extiende entre los 2300 y 3500 msnm, caracterizada por tener el clima más benigno y templado del mundo, es la región:",
                    options = listOf("Yunga", "Quechua", "Suni", "Puna", "Chala"),
                    correctIndex = 1,
                    explanation = "La región Quechua presenta un clima templado seco, aire diáfano y lluvias estacionales, siendo el piso ecológico más poblado y cultivado de la sierra.",
                    subject = "Geografía",
                    semana = 8
                ),
                Challenge(
                    id = "q_geog_t08_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La toponimia indígena de la región 'Puna' según Javier Pulgar Vidal alude a:",
                    options = listOf("Tierra caliente", "Mal de altura o soroche", "Valle frutal", "Maizal tupido", "Tierra de nieves"),
                    correctIndex = 1,
                    explanation = "En las lenguas andinas, Puna significa 'mal de altura' o 'soroche', en referencia a los efectos de la baja presión de oxígeno a más de 4000 msnm.",
                    subject = "Geografía",
                    semana = 8
                )
            )
        ),
        LessonNode(
            id = "geog_t09",
            subjectId = "geografia",
            semana = 9,
            subtema = "9.1 Las Once Ecorregiones del Perú (Brack Egg)",
            title = "Las Once Ecorregiones del Perú de Antonio Brack Egg",
            theory = LessonTheory(
                id = "theory_geog_t09",
                asignatura = "Geografía",
                semana = 9,
                titulo = "Las Once Ecorregiones del Perú de Antonio Brack Egg",
                resumen = "Propuesta ecológica integral por el Dr. Antonio Brack Egg (primer Ministro del Ambiente) que clasifica el Perú en 11 ecorregiones considerando geomorfología, clima, hidrología, flora y fauna.\n\n1. Mar Frío de la Corriente Peruana: Alta productividad marina, fitoplancton, anchoveta, lobos marinos, pingüino de Humboldt.\n2. Mar Tropical: Aguas cálidas (> 22 °C), arrecifes de coral someros, manglares de Tumbes, tiburones, atunes y cocodrilo de Tumbes.\n3. Desierto del Pacífico: Franja costera árida desde Piura hasta Tacna. Lomas estacionales y vegetación en oasis fluviales.\n4. Bosque Seco Ecuatorial: Tumbes, Piura, Lambayeque y valles interandinos del Marañón. Árboles caducifolios (algarrobo, huarango, ceibo), oso hormiguero y pava aliblanca.\n5. Bosque Tropical del Pacífico: Pequeña ecorregión en el interior de Tumbes (El Caucho). Clima muy húmedo y tropical con árboles de gran porte, monos aulladores y jaguar costeño.\n6. Serranía Esteparia: Vertiente occidental andina de 1000 a 3800 msnm. Valles estrechos, cactáceas columnares, queñuales y puma andino.\n7. Puna y Altos Andes: Mesetas frías por encima de los 3800 msnm. Pajonales de ichu, vicuña, guanaco y suri.\n8. Páramo: Ecorregión fría y extremadamente húmeda en las alturas de Piura y Cajamarca (> 3500 msnm). Tapir de montaña y oso de anteojos.\n9. Selva Alta (Yungas): Flanco oriental andino. Bosques de neblina de extraordinaria biodiversidad botánica (orquídeas) y gallito de las rocas.\n10. Selva Baja (Bosque Tropical Amazónico): Mayor ecorregión del Perú. Bosques colosales, ríos caudalosos meándricos y máxima biodiversidad de insectos y peces de agua dulce.\n11. Sabana de Palmeras (Chaqueña): Ubicada en las pampas del río Heath (Madre de Dios). Pastizales inundables en verano con palmeras de aguaje, ciervo de los pantanos y lobo de crin.",
                conceptosClave = listOf(
                    "Enfoque ecosistémico moderno de Antonio Brack Egg",
                    "Bosque Seco Ecuatorial y especie emblemática protegida: la pava aliblanca",
                    "Páramo del norte (húmedo y con vegetación esponjosa) vs Puna central (seca y fría)",
                    "Sabana de Palmeras en Madre de Dios: pastizales con lobo de crin y ciervo de los pantanos"
                ),
                formulas = listOf(
                    "\\text{11 Ecorregiones} = \\text{2 Marinas} + \\text{3 Costeras} + \\text{3 Andinas} + \\text{3 Amazónicas}"
                ),
                formulaName = "Esquema Ecológico de Brack Egg",
                formulaLatex = "\\text{Ecorregión} = \\text{Espacio geográfico con clima, suelo, hidrología, flora y fauna homogéneos}",
                formulaDescription = "Clasificación biogeográfica oficial de los ecosistemas peruanos.",
                admissionTip = "No confundas la Puna con el Páramo: la Puna es fría y seca con pajonales; el Páramo (solo en Piura y Cajamarca) es sumamente húmedo, cubierto de neblina constante y vegetación almohadillada que absorbe agua como esponja.",
                admissionExplanation = "• La Sabana de Palmeras es una ecorregión muy singular ubicada únicamente en las Pampas del río Heath (Madre de Dios), caracterizada por pastizales inundables y fauna de origen chaqueño (lobo de crin y ciervo de los pantanos)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t09_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La ecorregión peruana ubicada exclusivamente en las pampas del río Heath (Madre de Dios), conformada por pastizales inundables y palmeras de aguaje donde habitan el lobo de crin y el ciervo de los pantanos, es:",
                    options = listOf("Bosque Tropical del Pacífico", "Páramo", "Sabana de Palmeras", "Serranía Esteparia", "Bosque Seco Ecuatorial"),
                    correctIndex = 2,
                    explanation = "La Sabana de Palmeras es una ecorregión de origen chaqueño localizada en el extremo oriental de Madre de Dios, única en el Perú.",
                    subject = "Geografía",
                    semana = 9
                ),
                Challenge(
                    id = "q_geog_t09_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El hábitat natural del ave silvestre en peligro de extinción 'pava aliblanca' (Penelope albipennis) corresponde a la ecorregión del:",
                    options = listOf("Desierto del Pacífico", "Bosque Seco Ecuatorial", "Selva Alta", "Páramo", "Puna"),
                    correctIndex = 1,
                    explanation = "El Bosque Seco Ecuatorial (Tumbes, Piura, Lambayeque) alberga especies endémicas como la pava aliblanca, el algarrobo y el algarrobito.",
                    subject = "Geografía",
                    semana = 9
                )
            )
        ),
        LessonNode(
            id = "geog_t10",
            subjectId = "geografia",
            semana = 10,
            subtema = "10.1 Recursos Naturales, ANP y Desarrollo Sostenible",
            title = "Recursos Naturales, ANP y Desarrollo Sostenible",
            theory = LessonTheory(
                id = "theory_geog_t10",
                asignatura = "Geografía",
                semana = 10,
                titulo = "Recursos Naturales, ANP y Desarrollo Sostenible",
                resumen = "• Clasificación de los Recursos Naturales:\n  - Renovables: Capacidad de autorregeneración si se respeta su tasa de recarga (suelo fértil, agua dulce, biomasa vegetal y fauna silvestre).\n  - No Renovables: Stock finito en la litosfera cuya explotación conduce a su agotamiento irreversible (minerales metálicos, carbón, gas natural y petróleo).\n  - Inagotables o Continuos: Energía solar, eólica, mareomotriz y geotérmica.\n• Sistema Nacional de Áreas Naturales Protegidas por el Estado (SINANPE / SERNANP):\n  - Áreas de Uso Indirecto (Protección Intangible estricta, no se permite aprovechamiento consuntivo de recursos):\n    * Parques Nacionales: Ecosistemas de gran tamaño y relevancia ecológica mundial (Huascarán en Áncash, Manu en Madre de Dios/Cusco, Cerros de Amotape).\n    * Santuarios Nacionales: Muestras de una comunidad biológica o especie singular (Manglares de Tumbes, Huayllay en Pasco).\n    * Santuarios Históricos: Protegen sitios con valores culturales e históricos trascendentales (Machu Picchu en Cusco, Pampa de Ayacucho, Chacamarca).\n  - Áreas de Uso Directo (Aprovechamiento sostenible regulado de recursos):\n    * Reservas Nacionales: Conservación de recursos biológicos para uso comunal regulado (Paracas en Ica, Pampa Galeras en Ayacucho para la vicuña, Titicaca).\n    * Bosques de Protección, Cotos de Caza y Reservas Comunales.\n• Desarrollo Sostenible: Satisfacer las necesidades de la generación presente sin comprometer la capacidad de las generaciones futuras de satisfacer sus propias necesidades (Informe Brundtland, 1987).",
                conceptosClave = listOf(
                    "Recursos renovables vs no renovables e inagotables",
                    "Áreas de Uso Indirecto (intangibles: Parques, Santuarios Nacionales e Históricos)",
                    "Áreas de Uso Directo (aprovechamiento regulado: Reservas Nacionales como Pampa Galeras y Paracas)",
                    "Principio rector de Desarrollo Sostenible del Informe Brundtland"
                ),
                formulas = listOf(
                    "\\text{Uso Indirecto (Intangible)}: \\; \\text{Investigación científica y turismo (Sin extracción de recursos)}",
                    "\\text{Uso Directo (Regulado)}: \\; \\text{Aprovechamiento económico sustentable y planes de manejo comunal}"
                ),
                formulaName = "Clasificación de las ANP del Perú",
                formulaLatex = "\\text{SINANPE} = \\text{Uso Indirecto (Parques y Santuarios)} + \\text{Uso Directo (Reservas y Bosques)}",
                formulaDescription = "Marco legal de protección de la biodiversidad administrado por el SERNANP.",
                admissionTip = "En los Parques Nacionales la protección es TOTALMENTE INTANGIBLE (está estrictamente prohibida la caza, tala o minería); mientras que en las Reservas Nacionales se permite el aprovechamiento sostenible planificado (como el 'chaccu' de vicuñas en Pampa Galeras).",
                admissionExplanation = "• Machu Picchu es catalogado formalmente como 'Santuario Histórico', porque protege tanto el patrimonio arqueológico incaico como la biodiversidad de flora y fauna de la selva alta circundante."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t10_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El área natural protegida de uso indirecto e intangible creada para conservar la biodiversidad de flora y fauna junto con el patrimonio arquitectónico y cultural incaico es:",
                    options = listOf(
                        "El Parque Nacional del Manu",
                        "El Santuario Histórico de Machu Picchu",
                        "La Reserva Nacional de Paracas",
                        "El Santuario Nacional de Huayllay",
                        "El Parque Nacional Huascarán"
                    ),
                    correctIndex = 1,
                    explanation = "Machu Picchu es un Santuario Histórico que protege tanto la ciudadela inca como los ecosistemas de neblina de la ceja de selva cusqueña.",
                    subject = "Geografía",
                    semana = 10
                ),
                Challenge(
                    id = "q_geog_t10_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La Reserva Nacional ubicada en Ayacucho creada con el fin específico de recuperar y conservar a las poblaciones de vicuñas mediante el tradicional 'chaccu' comunal es:",
                    options = listOf("Paracas", "Lachay", "Pampa Galeras - Bárbara D'Achille", "Pacaya Samiria", "Junín"),
                    correctIndex = 2,
                    explanation = "Pampa Galeras en Lucanas (Ayacucho) es la principal reserva de vicuñas del Perú y ejemplo exitoso de rescate de una especie en peligro.",
                    subject = "Geografía",
                    semana = 10
                )
            )
        ),
        LessonNode(
            id = "geog_t11",
            subjectId = "geografia",
            semana = 11,
            subtema = "11.1 Población y Demografía del Perú y el Mundo",
            title = "Población y Demografía del Perú: Dinámica y Censos",
            theory = LessonTheory(
                id = "theory_geog_t11",
                asignatura = "Geografía",
                semana = 11,
                titulo = "Población y Demografía del Perú: Dinámica y Censos",
                resumen = "La demografía estudia estadísticamente la estructura, volumen, evolución y distribución territorial de las poblaciones humanas.\n\n• Indicadores Demográficos Fundamentales:\n  - Población Absoluta: Número total de habitantes que residen en un territorio en un momento determinado (Perú supera los 33 millones de habitantes).\n  - Población Relativa o Densidad Poblacional: Habitantes por kilómetro cuadrado (Densidad = Población / Superficie). Perú tiene una densidad media moderada (~26 hab/km²), pero con alta concentración desigual.\n  - Tasa Bruta de Natalidad (TBN) y Tasa Bruta de Mortalidad (TBM): Nacidos vivos o defunciones por cada 1000 habitantes al año.\n  - Tasa de Fecundidad: Promedio de hijos por mujer en edad reproductiva (15 a 49 años). En franco descenso en el Perú (~1.8 hijos).\n  - Esperanza de Vida al Nacer: Años que se espera viva un recién nacido (~76 años en Perú).\n• Distribución Espacial de la Población Peruana:\n  - Desequilibrio Macrorregional: La Costa alberga más del 58% de la población nacional en apenas el 11.7% del territorio. La Sierra concentra cerca del 28% y la Selva (región más extensa con el 60% del territorio) solo alberga cerca del 14% de la población.\n  - Crecimiento Urbano: El Perú es un país predominantemente urbano (más del 79% vive en ciudades, Lima Metropolitana concentra casi un tercio de los habitantes del país).\n  - Migración Interna: Éxodo rural-urbano iniciado a mediados del siglo XX que transformó radicalmente el mapa social, económico y cultural del Perú.",
                conceptosClave = listOf(
                    "Población absoluta vs Densidad demográfica (habitantes / km²)",
                    "Desigual distribución demográfica peruana (Costa 58%, Sierra 28%, Selva 14%)",
                    "Transición demográfica: descenso de fecundidad y envejecimiento poblacional progresivo",
                    "Migración campo-ciudad y macrocefalia urbana limeña"
                ),
                formulas = listOf(
                    "\\text{Densidad Poblacional} = \\frac{\\text{Población Absoluta}}{\\text{Superficie en km}^2}",
                    "\\text{Crecimiento Natural (Vegetativo)} = \\text{Tasa de Natalidad} - \\text{Tasa de Mortalidad}"
                ),
                formulaName = "Ecuación de la Densidad Demográfica",
                formulaLatex = "D = \\frac{\\text{Población total}}{\\text{Área territorial (km}^2)}",
                formulaDescription = "Indicador de concentración territorial poblacional.",
                admissionTip = "La región natural más extensa del Perú es la Selva (más del 60% del territorio), pero es a la vez la región con menor población absoluta y menor densidad demográfica.",
                admissionExplanation = "• El departamento más poblado del Perú es Lima, seguido de Piura y La Libertad; mientras que el departamento con menor población y menor densidad es Madre de Dios."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t11_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La región geográfica natural del Perú que concentra más del 58% de la población total a pesar de ocupar solo aproximadamente el 11.7% del territorio nacional es:",
                    options = listOf("La Sierra", "La Selva Alta", "La Costa", "La Selva Baja", "El Altiplano"),
                    correctIndex = 2,
                    explanation = "La Costa peruana concentra la mayor parte de la población nacional y las principales industrias, evidenciando una profunda concentración demográfica.",
                    subject = "Geografía",
                    semana = 11
                ),
                Challenge(
                    id = "q_geog_t11_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El departamento del Perú que cuenta con la menor densidad poblacional y la menor cantidad de habitantes de todo el país es:",
                    options = listOf("Moquegua", "Tumbes", "Pasco", "Madre de Dios", "Tacna"),
                    correctIndex = 3,
                    explanation = "Madre de Dios posee una inmensa superficie selvática y una población reducida, arrojando una densidad poblacional de apenas ~1.8 hab/km².",
                    subject = "Geografía",
                    semana = 11
                )
            )
        ),
        LessonNode(
            id = "geog_t12",
            subjectId = "geografia",
            semana = 12,
            subtema = "12.1 Actividades Económicas en el Perú",
            title = "Actividades Económicas en el Perú: Extractivas, Productivas y Servicios",
            theory = LessonTheory(
                id = "theory_geog_t12",
                asignatura = "Geografía",
                semana = 12,
                titulo = "Actividades Económicas en el Perú: Extractivas, Productivas y Servicios",
                resumen = "• Actividades Extractivas:\n  - Minería: Principal fuente de divisas y recaudación fiscal del Perú (~60% de las exportaciones). El Perú es líder mundial en producción de cobre, zinc, plata, plomo y oro. Principales minas: Antamina (Áncash: cobre y zinc), Cerro Verde (Arequipa: cobre), Las Bambas (Apurímac: cobre), Yanacocha (Cajamarca: oro).\n  - Pesca: Pesca industrial (producción de harina y aceite de anchoveta para exportación) y Pesca artesanal (consumo humano directo dentro de las 5 millas marinas protegidas). Puertos pesqueros líderes: Chimbote, Coishco, Pisco y Callao.\n  - Tala o Silvicultura: Explotación maderera en la Amazonía (caoba, cedro, tornillo, lupuna).\n• Actividades Productivas:\n  - Agricultura: Agricultura costeña (intensiva, tecnificada, riego por goteo, cultivos de agroexportación: espárragos, arándanos, uvas, paltas) vs Agricultura andina (extensiva, de secano dependiente de lluvias, minifundista: papa, maíz).\n  - Ganadería: Ganadería vacuna y ovina tecnificada en valles costeros (Arequipa, Cajamarca) y camélidos en el altiplano puneño.\n• Actividades Transformativas (Sector Secundario):\n  - Industria siderúrgica (Chimbote), metalmecánica, textil, agroindustria y química.\n• Actividades Distributivas y de Servicios (Sector Terciario):\n  - Transporte: Carretera Panamericana (eje longitudinal de la costa), Carretera Central o Federico Basadre (penetra los Andes y la selva).\n  - Comercio Exterior: Balanza comercial y puertos marítimos mayores (Callao como primer puerto marítimo del país, Matarani, Paita, Chancay).",
                conceptosClave = listOf(
                    "Minería como motor de divisas de exportación (cobre, oro, zinc, plata)",
                    "Diferencias entre pesca industrial (harina) y pesca artesanal (consumo humano)",
                    "Agricultura costeña agroexportadora intensiva vs agricultura andina tradicional de secano",
                    "Ejes viales longitudinales (Panamericana) y transversales de penetración"
                ),
                formulas = listOf(
                    "\\text{Balanza Comercial} = \\text{Exportaciones (X)} - \\text{Importaciones (M)}",
                    "\\text{Superávit Comercial} \\iff X > M"
                ),
                formulaName = "Estructura Productiva Nacional",
                formulaLatex = "\\text{PBI Peruano} = \\text{Primario (Minería/Agro)} + \\text{Secundario (Industria)} + \\text{Terciario (Comercio/Servicios)}",
                formulaDescription = "Composición sectorial de la economía y generación de empleo en el Perú.",
                admissionTip = "El mineral que genera el mayor volumen de divisas por exportación para el Estado peruano es el COBRE, seguido del ORO.",
                admissionExplanation = "• Las 5 millas marinas desde la orilla de la costa peruana están reservadas por ley de manera exclusiva para la pesca artesanal y de menor escala, con el fin de proteger las zonas de desove y reproducción biológica de los peces."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t12_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La actividad extractiva que genera el mayor porcentaje de divisas por exportación para la economía peruana es la:",
                    options = listOf("Pesca industrial", "Tala maderera", "Minería metálica", "Agroexportación de arándanos", "Gas natural"),
                    correctIndex = 2,
                    explanation = "La minería metálica (especialmente la exportación cuprífera y aurífera) representa más del 60% de los ingresos totales por exportación del país.",
                    subject = "Geografía",
                    semana = 12
                ),
                Challenge(
                    id = "q_geog_t12_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La carretera longitudinal más extensa del Perú que recorre todo el litoral costeño conectando desde la frontera con Ecuador hasta la frontera con Chile es:",
                    options = listOf(
                        "La Carretera Central",
                        "La Carretera Panamericana",
                        "La Marginal de la Selva",
                        "La Carretera Interoceánica",
                        "La Carretera de los Libertadores"
                    ),
                    correctIndex = 1,
                    explanation = "La Carretera Panamericana (Ruta 001) recorre toda la costa peruana de norte a sur, conectando Tumbes con Tacna.",
                    subject = "Geografía",
                    semana = 12
                )
            )
        ),
        LessonNode(
            id = "geog_t13",
            subjectId = "geografia",
            semana = 13,
            subtema = "13.1 Geopolítica, Fronteras y Tratados del Perú",
            title = "Geopolítica, Fronteras y Tratados Limítrofes del Perú",
            theory = LessonTheory(
                id = "theory_geog_t13",
                asignatura = "Geografía",
                semana = 13,
                titulo = "Geopolítica, Fronteras y Tratados Limítrofes del Perú",
                resumen = "• Nociones de Geopolítica (Rudolf Kjellén y Friedrich Ratzel):\n  - Estudia la influencia del medio geográfico en la vida, poder y evolución del Estado.\n  - Elementos del Estado Geopolítico: Heartland (núcleo vital de poder y gobierno, ej. Lima), Hinterland (espacio de crecimiento y recursos), Fronteras (perímetro defensivo e interactivo) y Vías de Comunicación.\n• Posición Geopolítica Estratégica del Perú:\n  - País marítimo en la Cuenca del Pacífico.\n  - País andino central en la cordillera sudamericana.\n  - País bioceánico (con proyección al Atlántico a través de la red fluvial navegable del Amazonas).\n  - País antártico (presencia activa en la base científica Machu Picchu en la isla Rey Jorge según el Tratado Antártico de 1959).\n• Tratados de Límites Internacionales del Perú:\n  1. Con Brasil (Frontera más extensa, 2822 km): Tratado Velarde-Río Branco (1909).\n  2. Con Colombia: Tratado Salomón-Lozano (1922, ratificado en el Oncenio de Leguía), cedió el Trapecio Amazónico y acceso al río Amazonas a Colombia.\n  3. Con Ecuador: Protocolo de Paz, Amistad y Límites de Río de Janeiro (1942) y Acta de Brasilia (1998, paz definitiva firmada por Alberto Fujimori y Jamil Mahuad tras el conflicto del Cenepa).\n  4. Con Bolivia: Tratado Polo-Bustamante (1909).\n  5. Con Chile: Tratado de Lima de 1929 (Tacna para Perú, Arica para Chile) y Fallo de la Corte Internacional de Justicia de La Haya (2014) sobre el límite marítimo.",
                conceptosClave = listOf(
                    "Elementos del Estado según la geopolítica: Heartland, Hinterland y Fronteras",
                    "Condición bioceánica y antártica del Perú (Base Científica Machu Picchu)",
                    "Tratados limítrofes históricos: Brasil (1909), Bolivia (1909), Colombia (1922), Ecuador (1942-1998) y Chile (1929-2014)"
                ),
                formulas = listOf(
                    "\\text{Fronteras Terrestres}: \\; \\text{Brasil (2822 km)} > \\text{Ecuador} > \\text{Colombia} > \\text{Bolivia} > \\text{Chile (169 km)}",
                    "\\text{Fallo de La Haya (2014)}: \\; \\text{Fija hito paralelo hasta la milla 80 y línea equidistante suroeste}"
                ),
                formulaName = "Jerarquía de Fronteras Terrestres del Perú",
                formulaLatex = "\\text{Frontera más extensa: Brasil (2822 km)} \\quad | \\quad \\text{Frontera más corta: Chile (169 km)}",
                formulaDescription = "Longitud y delimitación de los tratados internacionales de soberanía territorial.",
                admissionTip = "La frontera terrestre más extensa del Perú es con Brasil (2822 km) y la más corta es con Chile (169 km).",
                admissionExplanation = "• El Acta Presidencial de Brasilia de 1998 cerró definitivamente la delimitación de la frontera peruano-ecuatoriana en la Cordillera del Cóndor, poniendo fin a más de un siglo y medio de disputas bélicas."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t13_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El tratado limítrofe firmado en 1922 mediante el cual el Perú cedió el Trapecio Amazónico otorgando a Colombia soberanía y acceso directo al río Amazonas fue el:",
                    options = listOf(
                        "Tratado Polo-Bustamante",
                        "Tratado Salomón-Lozano",
                        "Tratado Velarde-Río Branco",
                        "Protocolo de Río de Janeiro",
                        "Tratado de Ancón"
                    ),
                    correctIndex = 1,
                    explanation = "El Tratado Salomón-Lozano, suscrito bajo el gobierno de Augusto B. Leguía, delimitó la frontera con Colombia entregando la franja del Trapecio Amazónico con el puerto de Leticia.",
                    subject = "Geografía",
                    semana = 13
                ),
                Challenge(
                    id = "q_geog_t13_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El país limítrofe con el cual el Perú comparte su frontera territorial internacional más extensa es:",
                    options = listOf("Colombia", "Ecuador", "Brasil", "Bolivia", "Chile"),
                    correctIndex = 2,
                    explanation = "El Perú comparte con Brasil su frontera terrestre más larga, con una longitud de 2822 kilómetros delimitada por el Tratado Velarde-Río Branco.",
                    subject = "Geografía",
                    semana = 13
                )
            )
        ),
        // =========================================================================
        // TEMA 01 - NODO 2: Ramas y Doctrinas Geográficas
        // =========================================================================
        LessonNode(
            id = "geog_t01b",
            subjectId = "geografia",
            semana = 1,
            subtema = "1.2 Ramas, Divisiones y Doctrinas Geográficas",
            title = "Ramas de la Geografía y Doctrinas: Determinismo vs Posibilismo",
            theory = LessonTheory(
                id = "theory_geog_t01b",
                asignatura = "Geografía",
                semana = 1,
                titulo = "Ramas de la Geografía y Doctrinas",
                resumen = "• Ramas Principales de la Geografía:\n  - Geografía General: Estudia los elementos y procesos comunes a toda la superficie terrestre.\n    * Geografía Física: Estudia los elementos abióticos (relieve, clima, hidrología, suelos).\n    * Geografía Humana o Antropogeografía: Estudia las relaciones entre el hombre y el espacio geográfico (demografía, económica, política, cultural).\n  - Geografía Regional: Estudia territorios específicos combinando los aspectos físicos y humanos (ejemplo: Geografía del Perú).\n  - Geografía Aplicada: Utiliza los conocimientos geográficos para la planificación territorial, el ordenamiento del espacio y la toma de decisiones.\n• Principales Doctrinas Geográficas:\n  1. Determinismo Geográfico (Friedrich Ratzel): El medio físico (clima, relieve, recursos) condiciona de manera determinante y fatalista el desarrollo de las sociedades humanas.\n  2. Posibilismo Geográfico (Paul Vidal de la Blache): El medio ofrece posibilidades que el hombre puede aprovechar o rechazar según su cultura y tecnología. El hombre es agente activo del territorio.\n  3. Geodeterminismo Moderado (Carl O. Sauer): Reconoce la influencia del medio pero enfatiza la transformación cultural del paisaje ('paisaje cultural').\n  4. Neopositivismo Cuantitativo: Geografía matemática y estadística, modelos y SIG (Sistemas de Información Geográfica).\n• Padre de la Geografía Antigua: Eratóstenes (primer cálculo de la circunferencia terrestre, ~250 a.C.).\n• Padre de la Geografía Moderna: Alexander von Humboldt (por su método científico causal y sus expediciones a América).",
                conceptosClave = listOf(
                    "Geografía Física (elementos abióticos) vs Geografía Humana (relación hombre-espacio)",
                    "Determinismo de Ratzel: el medio DETERMINA al hombre",
                    "Posibilismo de Vidal de la Blache: el hombre ELIGE entre las posibilidades del medio",
                    "Eratóstenes (padre antiguo) vs Humboldt (padre moderno de la geografía científica)"
                ),
                formulas = listOf(
                    "\\text{Determinismo}: \\; \\text{Medio físico} \\implies \\text{Conducta humana (fatalismo)}",
                    "\\text{Posibilismo}: \\; \\text{Medio} = \\text{Posibilidades} + \\text{Cultura humana} \\implies \\text{Decisión libre}"
                ),
                formulaName = "Ecuación Doctrinal Geográfica",
                formulaLatex = "\\text{Determinismo (Ratzel)} \\quad \\perp \\quad \\text{Posibilismo (Vidal de la Blache)}",
                formulaDescription = "Oposición epistemológica fundamental entre las dos grandes doctrinas de la ciencia geográfica.",
                admissionTip = "Pregunta frecuente: ¿Quién dijo que el Nilo es un 'regalo de los dioses' determinado por la geografía? → Es un argumento de tipo DETERMINISTA: el río determina la civilización egipcia.",
                admissionExplanation = "• El Posibilismo reconoce que dos pueblos con el mismo medio geográfico pueden desarrollar culturas completamente diferentes según sus decisiones históricas (ejemplo: Japón y Corea en el mismo entorno asiático)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t01b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La doctrina geográfica postulada por Paul Vidal de la Blache que sostiene que el medio ambiente ofrece posibilidades y limitaciones, pero que el hombre puede adaptarse activamente a ellas según su cultura y tecnología, se denomina:",
                    options = listOf("Determinismo geográfico", "Posibilismo geográfico", "Neopositivismo cuantitativo", "Geodeterminismo moderado", "Paisajismo cultural"),
                    correctIndex = 1,
                    explanation = "El posibilismo, a diferencia del determinismo de Ratzel, considera al ser humano como agente activo con capacidad de transformar y aprovechar las posibilidades que le brinda el medio geográfico.",
                    subject = "Geografía",
                    semana = 1
                ),
                Challenge(
                    id = "q_geog_t01b_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La rama de la geografía que estudia la distribución espacial de la población, las actividades económicas, los fenómenos políticos y los aspectos culturales de las sociedades humanas es la:",
                    options = listOf("Geografía Física", "Geografía Histórica", "Geografía Humana o Antropogeografía", "Geografía Matemática", "Biogeografía"),
                    correctIndex = 2,
                    explanation = "La Geografía Humana o Antropogeografía analiza la relación dialéctica entre las sociedades y el espacio que habitan, incluyendo demografía, economía y política.",
                    subject = "Geografía",
                    semana = 1
                )
            )
        ),
        // =========================================================================
        // TEMA 02 - NODO 2: Representaciones cartográficas y proyecciones
        // =========================================================================
        LessonNode(
            id = "geog_t02b",
            subjectId = "geografia",
            semana = 2,
            subtema = "2.2 Proyecciones Cartográficas y Coordenadas Geográficas Aplicadas",
            title = "Proyecciones Cartográficas: Tipos y Usos",
            theory = LessonTheory(
                id = "theory_geog_t02b",
                asignatura = "Geografía",
                semana = 2,
                titulo = "Proyecciones Cartográficas y Aplicación de Coordenadas",
                resumen = "• Proyecciones Cartográficas: Técnicas matemáticas para representar la superficie esférica de la Tierra en un plano bidimensional. Toda proyección genera distorsiones inevitables.\n  - Proyección Cilíndrica de Mercator: Cilindro tangente al Ecuador. Conserva formas y ángulos (conforme) pero exagera las superficies en latitudes altas. Ideal para navegación marítima y aérea por conservar rumbos precisos.\n  - Proyección de Peters (Cilíndrica Equivalente): Corrige la distorsión de superficies; todos los países tienen su tamaño real proporcional, pero las formas se distorsionan. Más equitativa geopolíticamente.\n  - Proyección Cónica de Lambert: Cono tangente en paralelos de latitud media. Conserva ángulos (conforme) y es excelente para mapas de países de latitud media.\n  - Proyección Azimutal o Gnomónica (Plana): Plano tangente en un polo. Útil para mapas polares y para trazar grandes círculos (rutas aéreas más cortas).\n• Husos Horarios: La Tierra está dividida en 24 husos (franjas verticales de 15° de longitud cada una = 1 hora). Al desplazarse hacia el Este, se suman horas; hacia el Oeste, se restan.\n  - Perú está en UTC -5 (Hora oficial peruana).\n  - Línea Internacional del Cambio de Fecha (180°): Al cruzarla hacia el Oeste, se agrega un día; al cruzarla hacia el Este, se retira un día.\n• Lecturas de mapas en el examen de admisión: Interpretación de curvas de nivel, rosa de los vientos, escalas y leyendas.",
                conceptosClave = listOf(
                    "Mercator: conserva ángulos (navegación) pero distorsiona tamaños en latitudes altas",
                    "Peters: conserva superficies pero distorsiona formas",
                    "Huso horario: cada 15° de longitud = 1 hora de diferencia",
                    "Perú UTC -5; cruzar el Antimeridiano al Oeste suma un día"
                ),
                formulas = listOf(
                    "\\text{Diferencia horaria} = \\frac{\\Delta \\text{Longitud}}{15^\\circ} \\text{ horas}",
                    "\\text{Huso N°} = \\frac{\\text{Longitud Oeste}}{15}"
                ),
                formulaName = "Cálculo de Husos Horarios",
                formulaLatex = "\\Delta t = \\frac{\\Delta \\lambda}{15^\\circ/\\text{hora}}",
                formulaDescription = "Diferencia horaria entre dos puntos dada su diferencia de longitud geográfica.",
                admissionTip = "Si Lima es UTC-5 y Madrid es UTC+1, cuando en Lima son las 09:00 h, en Madrid son las 15:00 h (diferencia de +6 horas hacia el este).",
                admissionExplanation = "• La proyección de Mercator sobrerepresenta el tamaño de Europa y Norteamérica respecto a África porque a mayor latitud, mayor distorsión de área. La proyección de Peters corrige esto."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t02b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "La proyección cartográfica que conserva con exactitud los ángulos y los rumbos magnéticos, siendo por ello la más empleada históricamente para la navegación marítima y aérea, es la proyección:",
                    options = listOf("De Peters", "Azimutal gnomónica", "Cilíndrica de Mercator", "Cónica de Lambert", "Estereográfica polar"),
                    correctIndex = 2,
                    explanation = "La proyección de Mercator es conforme (conserva ángulos), lo que permite trazar líneas de rumbo constante (loxodromas) en línea recta, fundamental para la navegación.",
                    subject = "Geografía",
                    semana = 2
                ),
                Challenge(
                    id = "q_geog_t02b_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Si una ciudad A ubicada a 75° longitud Oeste tiene una hora de 12:00 mediodía, ¿qué hora tendrá una ciudad B ubicada a 105° longitud Oeste?",
                    options = listOf("14:00 horas", "10:00 horas", "13:00 horas", "09:00 horas", "15:00 horas"),
                    correctIndex = 1,
                    explanation = "La diferencia de longitud es 105° - 75° = 30°. Dividiéndola entre 15°/hora = 2 horas de diferencia. B está más al oeste, por lo que su hora es menor: 12:00 - 2:00 = 10:00 horas.",
                    subject = "Geografía",
                    semana = 2
                )
            )
        ),
        // =========================================================================
        // TEMA 03 - NODO 2: La Luna, Mareas y Movimientos secundarios
        // =========================================================================
        LessonNode(
            id = "geog_t03b",
            subjectId = "geografia",
            semana = 3,
            subtema = "3.2 La Luna, Mareas y Movimientos Secundarios de la Tierra",
            title = "La Luna y las Mareas: Influencia Gravitacional",
            theory = LessonTheory(
                id = "theory_geog_t03b",
                asignatura = "Geografía",
                semana = 3,
                titulo = "La Luna, Mareas y Movimientos Secundarios de la Tierra",
                resumen = "• La Luna: Único satélite natural de la Tierra (radio: 1737 km). Carece de atmósfera, agua líquida y campo magnético propios. Su superficie muestra cráteres de impacto, mares (maria) de basalto y regolito.\n  - Movimiento de Rotación Lunar: Igual período que su traslación alrededor de la Tierra (~27.3 días = mes sidéreo), por eso siempre le vemos la misma cara (rotación síncrona o sincrónica).\n  - Fases Lunares (ciclo sinódico de ~29.5 días): Luna Nueva (entre el Sol y la Tierra, no visible), Cuarto Creciente, Luna Llena (Tierra entre el Sol y la Luna, máxima iluminación) y Cuarto Menguante.\n• Mareas: Oscilaciones rítmicas del nivel del mar producidas por la atracción gravitacional de la Luna y en menor medida del Sol.\n  - Mareas Vivas o de Sicigia: Se producen en Luna Nueva y Luna Llena (Sol, Luna y Tierra alineados), son las más altas y más bajas (máxima amplitud de marea).\n  - Mareas Muertas o de Cuadratura: Se producen en Cuarto Creciente y Cuarto Menguante (Luna en ángulo de 90° respecto al Sol), son las de menor amplitud.\n• Otros Movimientos Terrestres:\n  - Precesión de los Equinoccios: Lento bamboleo cónico del eje terrestre (como un trompo) en un ciclo de ~26,000 años. Causado por la atracción gravitacional del Sol y la Luna sobre el abultamiento ecuatorial.\n  - Nutación: Pequeña oscilación periódica (18.6 años) superpuesta sobre la precesión.",
                conceptosClave = listOf(
                    "Rotación sincrónica lunar: siempre vemos la misma cara de la Luna",
                    "Mareas Vivas (Luna Nueva y Llena, alineación → mayor amplitud)",
                    "Mareas Muertas (Cuartos, ángulo 90° → menor amplitud)",
                    "Precesión de los equinoccios: ciclo de 26,000 años del eje terrestre"
                ),
                formulas = listOf(
                    "\\text{Mareas Vivas (Sicigia)}: \\; \\text{Sol} - \\text{Luna} - \\text{Tierra (o Tierra-Luna-Sol)} \\implies \\text{Máxima amplitud}",
                    "\\text{Mareas Muertas (Cuadratura)}: \\; \\text{Luna perpendicular al eje Sol-Tierra} \\implies \\text{Mínima amplitud}"
                ),
                formulaName = "Régimen de Mareas Gravitacionales",
                formulaLatex = "F_{marea} \\propto \\frac{M_{Luna}}{d_{Luna}^3}",
                formulaDescription = "La fuerza de marea es proporcional a la masa del cuerpo y al cubo inverso de su distancia.",
                admissionTip = "Las mareas vivas (las más extremas) ocurren en Luna Nueva y Luna Llena por la alineación Sol-Luna-Tierra. Las mareas muertas (las más suaves) ocurren en los Cuartos Creciente y Menguante.",
                admissionExplanation = "• La Luna tarda exactamente el mismo tiempo en girar sobre su propio eje que en orbitar la Tierra (rotación síncrona), razón por la cual desde la Tierra nunca podemos ver la cara oculta sin ayuda de sondas espaciales."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t03b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Las mareas de mayor amplitud (mareas vivas o de sicigia) se producen cuando:",
                    options = listOf(
                        "La Luna se encuentra en cuarto creciente",
                        "El Sol, la Luna y la Tierra están alineados (Luna nueva o llena)",
                        "La Luna se interpone entre la Tierra y el Sol en cuarto menguante",
                        "La Luna está en su punto más alejado de la Tierra (apogeo)",
                        "La Luna y el Sol forman un ángulo recto con la Tierra"
                    ),
                    correctIndex = 1,
                    explanation = "Las mareas vivas o de sicigia ocurren en Luna Nueva y Luna Llena porque el Sol, la Luna y la Tierra se alinean, sumando las fuerzas gravitacionales de ambos astros sobre los océanos.",
                    subject = "Geografía",
                    semana = 3
                )
            )
        ),
        // =========================================================================
        // TEMA 04 - NODO 2: Sismología, Vulcanismo y Sismicidad del Perú
        // =========================================================================
        LessonNode(
            id = "geog_t04b",
            subjectId = "geografia",
            semana = 4,
            subtema = "4.2 Sismología, Vulcanismo y Sismicidad del Perú",
            title = "Sismología y Vulcanismo: Terremotos y Volcanes del Perú",
            theory = LessonTheory(
                id = "theory_geog_t04b",
                asignatura = "Geografía",
                semana = 4,
                titulo = "Sismología y Vulcanismo: Terremotos y Volcanes del Perú",
                resumen = "• Sismología: Ciencia que estudia los terremotos o sismos (sacudidas del suelo por liberación brusca de energía en una zona de ruptura).\n  - Foco o Hipocentro: Punto interior donde se origina el sismo y se libera la energía elástica acumulada.\n  - Epicentro: Punto de la superficie terrestre directamente sobre el hipocentro. Es el lugar de mayor intensidad sísmica.\n  - Ondas Sísmicas: Ondas P (Primarias o de compresión, las más rápidas, atraviesan sólidos, líquidos y gases), Ondas S (Secundarias o de cizallamiento, solo en sólidos) y Ondas L o de superficie (las más destructivas).\n  - Escala de Richter (1935): Mide la magnitud (energía liberada en el foco) en escala logarítmica (cada grado = 31.6 veces más energía).\n  - Escala de Mercalli Modificada: Mide la intensidad (efectos en la superficie) del I al XII grados.\n• Vulcanismo del Perú:\n  - Perú tiene ~16 volcanes activos y potencialmente activos, concentrados en el Sur andino (región Arequipa, Moquegua, Tacna, Puno).\n  - Volcán El Misti (Arequipa, 5822 msnm): Volcán activo más emblemático del Perú. Último actividad importante en 1985.\n  - Volcán Ubinas (Moquegua, 5672 msnm): El más activo del Perú en la actualidad.\n  - Volcán Ticsani (Moquegua), Coropuna (Arequipa, el más alto en el Perú con 6425 msnm, potencialmente activo bajo nieves).\n  - Tsunamis (Maremotos): Ondas oceánicas de gran longitud y velocidad generadas por sismos submarinos o deslizamientos. Costa del Perú ha sufrido tsunamis históricos en 1746, 1940 y 1960.",
                conceptosClave = listOf(
                    "Foco (interior, origen de energía) vs Epicentro (superficie, mayor daño)",
                    "Ondas P (comprensión, las más rápidas) vs Ondas S (cizallamiento, solo sólidos) vs Ondas L (las más destructivas)",
                    "Richter: magnitud (energía) logarítmica; Mercalli: intensidad (efectos) del I al XII",
                    "Volcán más activo del Perú: Ubinas (Moquegua); más emblemático: El Misti (Arequipa)"
                ),
                formulas = listOf(
                    "\\text{Richter: logarítmica} \\implies \\Delta 1 \\text{ grado} = 31.6 \\times \\text{más energía}",
                    "\\text{Ondas sísmicas}: P \\text{ (más rápidas)} \\to S \\text{ (sólidos)} \\to L \\text{ (superficie, más destructivas)}"
                ),
                formulaName = "Relación Magnitud-Energía de Richter",
                formulaLatex = "E \\propto 10^{1.5 M} \\implies \\Delta M = 1 \\Rightarrow E \\approx 31.6 \\times",
                formulaDescription = "Escala logarítmica que relaciona la magnitud de Richter con la energía sísmica liberada.",
                admissionTip = "No confundas magnitud (escala de Richter, mide energía en el foco, sin unidades visibles) con intensidad (escala de Mercalli, mide efectos destructivos en la superficie, del I al XII).",
                admissionExplanation = "• El Volcán Ubinas es el más activo del Perú actualmente. El Misti es el más conocido (símbolo de Arequipa) pero su última erupción importante fue en 1985."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t04b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El punto de la superficie terrestre ubicado directamente sobre el foco de un sismo, donde se registra la mayor intensidad destructiva de las ondas sísmicas superficiales, recibe el nombre de:",
                    options = listOf("Hipocentro", "Epicentro", "Antiepicentro", "Isosista", "Isobata"),
                    correctIndex = 1,
                    explanation = "El epicentro es la proyección vertical del hipocentro sobre la superficie terrestre; desde él irradian las ondas de tipo L más destructivas.",
                    subject = "Geografía",
                    semana = 4
                ),
                Challenge(
                    id = "q_geog_t04b_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El volcán considerado el más activo del Perú en la actualidad, ubicado en el departamento de Moquegua, es el volcán:",
                    options = listOf("El Misti", "Coropuna", "Ubinas", "Ticsani", "Sabancaya"),
                    correctIndex = 2,
                    explanation = "El Ubinas (5672 msnm, Moquegua) es el volcán en actividad eruptiva más frecuente del Perú, con numerosos episodios registrados en las últimas décadas.",
                    subject = "Geografía",
                    semana = 4
                )
            )
        ),
        // =========================================================================
        // TEMA 05 - NODO 2: Fenómeno El Niño y Clasificación Climática del Perú
        // =========================================================================
        LessonNode(
            id = "geog_t05b",
            subjectId = "geografia",
            semana = 5,
            subtema = "5.2 Fenómeno El Niño y Climas del Perú",
            title = "Fenómeno El Niño: Causas, Efectos y Clasificación Climática del Perú",
            theory = LessonTheory(
                id = "theory_geog_t05b",
                asignatura = "Geografía",
                semana = 5,
                titulo = "El Niño, La Niña y la Clasificación Climática del Perú",
                resumen = "• Fenómeno El Niño (ENOS - El Niño Oscilación Sur):\n  - Ocurre cuando las aguas superficiales del Océano Pacífico tropical central y oriental se calientan anormalmente (>0.5 °C por encima del promedio histórico durante meses seguidos).\n  - Causas inmediatas: Debilitamiento o inversión de los vientos alisios del sureste, que normalmente empujan aguas cálidas hacia Asia e Indonesia y permiten el afloramiento frío en Sudamérica.\n  - Efectos en el Perú: Lluvias torrenciales y huaycos en la costa norte (Piura, Tumbes, Lambayeque), sequías en el sur andino (Puno, Cusco, Arequipa), desaparición de la anchoveta del litoral, aumento de enfermedades tropicales.\n  - El Niño Costero vs El Niño Oceánico: El Niño Costero afecta solo la costa peruana sin alterar el Pacífico central; el Oceánico es de escala global.\n• Fenómeno La Niña (fase fría del ENOS):\n  - Aguas superficiales más frías de lo normal → refuerzo de los vientos alisios y del afloramiento costero, mayor productividad pesquera y sequías en la costa norte peruana.\n• Clasificación Climática del Perú (según Koppen-Geiger adaptado):\n  1. Clima Árido o Desértico de la Costa (BWh): Precipitación <25 mm/año en la costa central y sur; baja humedad relativa; sin estaciones marcadas.\n  2. Clima Templado Subhúmedo de los Valles Interandinos (Csa): Temperaturas moderadas, lluvias estacionales.\n  3. Clima Frío o de Tundra Andina: Por encima de los 4000 msnm, con heladas nocturnas frecuentes.\n  4. Clima Polar o de Nieves Permanentes (EF): En la Janca (>5000 msnm).\n  5. Clima Tropical Lluvioso Amazónico (Af/Am): Alta temperatura todo el año y abundantes precipitaciones (>2000 mm/año).",
                conceptosClave = listOf(
                    "El Niño: calentamiento anormal del Pacífico → lluvias torrenciales costa norte + sequías sur andino",
                    "La Niña: enfriamiento → refuerzo del afloramiento y mayor pesca, pero sequías en norte",
                    "Costa central/sur: clima árido por Corriente Peruana + Anticiclón del Pacífico Sur",
                    "Selva baja: clima tropical lluvioso (>2000 mm/año) sin estación seca prolongada"
                ),
                formulas = listOf(
                    "\\text{El Niño} \\implies \\text{Aguas cálidas} + \\text{Lluvias norte costero} + \\text{Sequía sur andino}",
                    "\\text{La Niña} \\implies \\text{Aguas frías} + \\text{Mayor anchoveta} + \\text{Sequía norte costero}"
                ),
                formulaName = "Ciclo ENOS (El Niño - La Niña)",
                formulaLatex = "T_{superficial Pacífico} > \\overline{T} + 0.5°C \\implies \\text{El Niño activo}",
                formulaDescription = "Criterio térmico de activación del Fenómeno El Niño según el índice ONI.",
                admissionTip = "El Niño produce efectos OPUESTOS en distintas regiones del Perú: LLUVIAS TORRENCIALES en la costa norte (Piura, Tumbes) y SEQUÍAS en el sur andino (Puno, Arequipa).",
                admissionExplanation = "• El Niño 1997-98 fue el más intenso del siglo XX en el Perú, con pérdidas de más del 4% del PBI por desastres naturales en la costa norte."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t05b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El Fenómeno El Niño produce en el litoral norte del Perú (Piura, Tumbes, Lambayeque) el siguiente efecto principal:",
                    options = listOf(
                        "Disminución de temperatura y sequía prolongada",
                        "Mayor productividad pesquera de la anchoveta",
                        "Lluvias torrenciales, inundaciones y activación de huaycos",
                        "Reforzamiento de los vientos alisios del sur",
                        "Disminución de la temperatura del mar a menos de 15 °C"
                    ),
                    correctIndex = 2,
                    explanation = "El calentamiento anormal de las aguas superficiales durante El Niño genera inestabilidad atmosférica en la costa norte, con lluvias intensas que producen inundaciones y huaycos devastadores.",
                    subject = "Geografía",
                    semana = 5
                ),
                Challenge(
                    id = "q_geog_t05b_2",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El fenómeno opuesto a El Niño, caracterizado por el enfriamiento anormal de las aguas superficiales del Pacífico tropical que refuerza el afloramiento marino y mejora la productividad pesquera en el Perú, se denomina:",
                    options = listOf("El Niño Costero", "El Niño Oceánico", "La Corriente del Niño", "La Niña", "El Anticiclón del Pacífico"),
                    correctIndex = 3,
                    explanation = "La Niña es la fase fría del ciclo ENOS: aguas más frías de lo normal refuerzan los vientos alisios y el afloramiento marino, aumentando la productividad biológica del mar peruano.",
                    subject = "Geografía",
                    semana = 5
                )
            )
        ),
        // =========================================================================
        // TEMA 06 - NODO 2: Lagos, Glaciares y Recursos Hídricos del Perú
        // =========================================================================
        LessonNode(
            id = "geog_t06b",
            subjectId = "geografia",
            semana = 6,
            subtema = "6.2 Lagos, Glaciares y Gestión del Agua en el Perú",
            title = "Lagos, Glaciares y Recursos Hídricos del Perú",
            theory = LessonTheory(
                id = "theory_geog_t06b",
                asignatura = "Geografía",
                semana = 6,
                titulo = "Lagos, Glaciares y Gestión del Agua en el Perú",
                resumen = "• Lago Titicaca:\n  - El lago navegable más alto del mundo (3812 msnm) y el mayor de América del Sur por volumen de agua.\n  - Compartido entre Perú (Puno, 56%) y Bolivia (44%).\n  - Origen: Cuenca tectónica hundida del Altiplano (graben andino).\n  - Uros: Comunidades que habitan islas artificiales de totora flotante.\n  - Fauna endémica: rana del Titicaca (Telmatobius culeus, especie en peligro crítico), zambullidor del Titicaca.\n  - Su único efluente natural es el río Desaguadero, que drena hacia el Lago Poopó (Bolivia).\n• Lago Junín o Chinchaycocha (4080 msnm): Segundo lago más grande del Perú, ubicado en el altiplano de Junín, declarado Reserva Nacional.\n• Glaciares y Nevados del Perú:\n  - El Perú posee el 71% de los glaciares tropicales del planeta (Coropuna, Huascarán, Chonta, Ausangate).\n  - Huascarán (6768 msnm): Punto más alto del Perú, en la Cordillera Blanca de Áncash. Patrimonio Natural de la Humanidad.\n  - Glaciar Pastoruri (Áncash): Ejemplo dramático del retroceso glaciar por el cambio climático; perdió >50% de su masa en los últimos 30 años.\n• Estrés Hídrico y Proyectos de Irrigación:\n  - Costa peruana: desierto árido, pero los proyectos Chira-Piura, Tinajones, Chavimochic, Olmos, Majes-Siguas trasvasan agua de la Amazonia hacia la vertiente del Pacífico.",
                conceptosClave = listOf(
                    "Titicaca: lago navegable más alto del mundo (3812 msnm), endémico: rana gigante Telmatobius culeus",
                    "Perú = 71% de glaciares tropicales del planeta (Coropuna, Huascarán, Ausangate)",
                    "Huascarán: 6768 msnm, cima más alta del Perú, Patrimonio Natural UNESCO",
                    "Proyectos de irrigación: Chavimochic y Majes-Siguas trasvasan agua hacia la costa árida"
                ),
                formulas = listOf(
                    "\\text{Caudal del Amazonas} = \\text{Mayor del mundo} = \\sim 20\\% \\text{ del total de agua dulce del planeta}",
                    "\\text{Lago Titicaca} = 3812 \\text{ msnm} \\implies \\text{Lago navegable de mayor altitud del mundo}"
                ),
                formulaName = "Datos Clave de los Recursos Hídricos Peruanos",
                formulaLatex = "\\text{Titicaca (3812 msnm)} > \\text{Junín (4080 msnm)} \\quad \\text{[más alto NO es más navegable: Junín es pantanoso]}",
                formulaDescription = "Distinción entre lago más alto y lago navegable más alto del mundo.",
                admissionTip = "Junín (4080 msnm) es más alto que el Titicaca, pero el Titicaca es el lago NAVEGABLE más alto (vapores y embarcaciones regularmente). Junín es pantanoso, no navegable.",
                admissionExplanation = "• El retroceso de los glaciares peruanos por el cambio climático amenaza el abastecimiento de agua dulce de millones de personas, ya que los deshielos de nevados alimentan ríos que riegan la costa árida."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t06b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El lago Titicaca es considerado el lago navegable más alto del mundo. ¿Por qué se usa el calificativo 'navegable' si el lago Junín tiene una altitud mayor?",
                    options = listOf(
                        "Porque el Titicaca tiene mayor profundidad que el Junín",
                        "Porque el Titicaca tiene embarcaciones a vapor que lo atraviesan regularmente, mientras que Junín es muy pantanoso y superficial",
                        "Porque el Titicaca tiene mayor superficie que el Junín",
                        "Porque el Titicaca está en la frontera internacional Peru-Bolivia",
                        "Porque el Junín está a mayor altitud que cualquier punto del Titicaca"
                    ),
                    correctIndex = 1,
                    explanation = "El lago Junín (4080 msnm) está a mayor altitud, pero es una laguna pantanosa de poca profundidad no apta para la navegación regular con embarcaciones. El Titicaca sí cuenta con vapores y barcos comerciales.",
                    subject = "Geografía",
                    semana = 6
                )
            )
        ),
        // =========================================================================
        // TEMA 07 - NODO 2: División Política del Perú y Regiones
        // =========================================================================
        LessonNode(
            id = "geog_t07b",
            subjectId = "geografia",
            semana = 7,
            subtema = "7.2 División Política del Perú: Departamentos, Provincias y Distritos",
            title = "División Político-Administrativa del Perú: 25 Regiones",
            theory = LessonTheory(
                id = "theory_geog_t07b",
                asignatura = "Geografía",
                semana = 7,
                titulo = "División Político-Administrativa del Perú",
                resumen = "• División Político-Administrativa del Perú:\n  - 25 regiones (24 departamentos + la Provincia Constitucional del Callao).\n  - 196 provincias.\n  - 1874 distritos.\n• Datos Geográficos Clave de los Departamentos:\n  - Mayor superficie: Loreto (368,852 km², 29% del Perú), seguido de Ucayali y Madre de Dios.\n  - Mayor altitud capital: Puno (3827 msnm), seguida de Huancavelica (3676 msnm) y Cusco (3399 msnm).\n  - Departamentos sin costa: Amazonas, Cajamarca, Huancavelica, Huánuco, Junín, Pasco, Cusco, Puno, Ayacucho, Apurímac, Loreto, Ucayali, Madre de Dios (13 departamentos mediterráneos = sin litoral).\n  - Departamentos sin selva: Tacna, Moquegua, Arequipa, Ica, Lima, Áncash, Lambayeque, La Libertad, Piura, Tumbes, Callao (11 departamentos sin territorio amazónico).\n  - Departamento más pequeño: Callao (147 km², Provincia Constitucional).\n• Límites Macrorregionales:\n  - El Perú limita al Norte con Ecuador y Colombia, al Este con Brasil y Bolivia, al Sur con Bolivia y Chile, y al Oeste con el Océano Pacífico.\n  - Capital: Lima (8°06' S, 77°03' W), a 154 m sobre el nivel del mar, en la costa central.\n• Organización del Estado Peruano:\n  - Gobierno Nacional (Lima), Gobiernos Regionales (25) y Gobiernos Locales (Municipalidades).",
                conceptosClave = listOf(
                    "25 regiones (24 departamentos + Callao); 196 provincias; 1874 distritos",
                    "Loreto: mayor superficie (29% del país); Callao: menor superficie",
                    "Puno: capital departamental más alta (3827 msnm)",
                    "13 departamentos sin costa (mediterráneos); 11 sin selva"
                ),
                formulas = listOf(
                    "\\text{Superficie del Perú} = 1,285,216 \\text{ km}^2 \\quad (\\text{N°19 mundo})",
                    "\\text{Loreto} = 368,852 \\text{ km}^2 \\approx 29\\% \\text{ del territorio nacional}"
                ),
                formulaName = "Datos Territoriales del Perú",
                formulaLatex = "\\text{Perú} = 1{,}285{,}216 \\text{ km}^2 \\; | \\; 25 \\text{ regiones} \\; | \\; >33 \\text{ mill. hab.}",
                formulaDescription = "Magnitudes fundamentales de la extensión y organización territorial del Estado Peruano.",
                admissionTip = "El departamento con mayor superficie es Loreto (selva), el de menor superficie es el Callao (provincia constitucional costera). Puno tiene la capital de departamento más elevada (3827 msnm).",
                admissionExplanation = "• Loreto es el departamento más grande del Perú (368,852 km²), pero también uno de los menos poblados en proporción a su superficie, con la ciudad de Iquitos como capital amazónica más grande del mundo sin carretera."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t07b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El departamento del Perú con mayor extensión territorial, que abarca aproximadamente el 29% de toda la superficie nacional, es:",
                    options = listOf("Ucayali", "Madre de Dios", "Loreto", "Cusco", "Puno"),
                    correctIndex = 2,
                    explanation = "Loreto, con 368,852 km², es el departamento más extenso del Perú y uno de los más grandes de toda América del Sur.",
                    subject = "Geografía",
                    semana = 7
                )
            )
        ),
        // =========================================================================
        // TEMA 08 - NODO 2: Pisos Altitudinales y Biodiversidad
        // =========================================================================
        LessonNode(
            id = "geog_t08b",
            subjectId = "geografia",
            semana = 8,
            subtema = "8.2 Yunga, Puna y Janca: Flora y Fauna por Región Natural",
            title = "Flora y Fauna Emblemática por Región Natural de Pulgar Vidal",
            theory = LessonTheory(
                id = "theory_geog_t08b",
                asignatura = "Geografía",
                semana = 8,
                titulo = "Flora y Fauna por Piso Ecológico (Pulgar Vidal)",
                resumen = "• Región Chala o Costa (0-500 msnm):\n  - Flora: Lomas costeras estacionales (amancaes, tillandsias), algarrobo (Prosopis pallida), mangle.\n  - Fauna: Pingüino de Humboldt, lobo marino, gaviota peruana, zorrillo, iguana costera.\n• Región Yunga (500-2300 msnm):\n  - Flora: Frutales tropicales (chirimoya, lúcuma, guayabo, palta). Caña de azúcar en valles.\n  - Fauna: Puma (presente desde la Yunga hasta la Puna), zorro andino, loro de frente roja.\n  - Peligro: Zona de huaycos (derrumbes fluvio-aluviales).\n• Región Quechua (2300-3500 msnm):\n  - Flora: Maíz, papa, quinua (alturas), eucalipto introducido.\n  - Fauna: Cóndor andino (Vultur gryphus, el ave voladora más grande del mundo por envergadura), venado de cola blanca, zorro andino.\n• Región Suni o Jalca (3500-4000 msnm):\n  - Flora: Quinua, olluco, mashua, oca, ichu, queñual (Polylepis, el árbol que crece a mayor altitud del mundo).\n  - Fauna: Taruca o ciervo andino, vizcacha, halcón perdiguero.\n• Región Puna (4000-4800 msnm):\n  - Flora: Ichu (pajonal), yareta, totora (a orillas del Titicaca).\n  - Fauna: Vicuña (camélido andino más pequeño y de fibra más fina del mundo), alpaca, llama, guanaco, suri.\n• Región Janca o Cordillera (4800-6768 msnm):\n  - Flora: Yareta, musgos y líquenes. Sin vegetación a partir de los 5000 msnm.\n  - Fauna: Cóndor andino (llega hasta aquí), vizcacha de la sierra.\n• Región Rupa Rupa o Selva Alta (400-1000 msnm):\n  - Flora: Orquídeas, helechos, bambúes, palmeras de pona.\n  - Fauna: Gallito de las rocas (Rupicola peruviana, ave nacional del Perú), tapir de montaña, oso de anteojos.\n• Región Omagua o Selva Baja (80-400 msnm):\n  - Flora: Caoba, cedro, lupuna, palo de rosa, shiringa (caucho silvestre), aguaje.\n  - Fauna: Delfín rosado del Amazonas, paiche (pez de agua dulce más grande de América), charapa (tortuga), anaconda, jaguar.",
                conceptosClave = listOf(
                    "Cóndor andino: ave voladora más grande del mundo por envergadura alar",
                    "Vicuña: camélido andino de fibra más fina y valiosa del mundo (solo en Puna y Janca)",
                    "Gallito de las rocas (Rupicola peruviana): ave nacional del Perú, habita la Selva Alta",
                    "Queñual (Polylepis): árbol que crece a mayor altitud del mundo (hasta 5000 msnm)"
                ),
                formulas = listOf(
                    "\\text{Rupa Rupa} \\implies \\text{Gallito de las rocas + Oso de anteojos + Tapir}",
                    "\\text{Puna} \\implies \\text{Vicuña + Alpaca + Llama + Guanaco}"
                ),
                formulaName = "Fauna Representativa por Piso Ecológico",
                formulaLatex = "\\text{Puna: Vicuña (fibra más fina)} \\quad | \\quad \\text{Rupa Rupa: Gallito de las Rocas (ave nacional)}",
                formulaDescription = "Animales emblemáticos asociados a los pisos ecológicos clave para examen de admisión.",
                admissionTip = "El Gallito de las Rocas es el AVE NACIONAL del Perú y habita en la Selva Alta (Rupa Rupa), no en la Puna. El Cóndor es el ave voladora más grande por envergadura, no por peso (el avestruz pesa más).",
                admissionExplanation = "• La vicuña (Vicugna vicugna) produce la fibra natural animal más fina del mundo (<12 micras), más valiosa que la cachemira y el angora. Solo puede ser esquilada viva mediante el chaccu comunal."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t08b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El ave declarada símbolo nacional del Perú que habita principalmente en los bosques de neblina de la región Rupa Rupa o Selva Alta andina es:",
                    options = listOf("El cóndor andino", "El pájaro carpintero gigante", "El gallito de las rocas", "La pava aliblanca", "El tucán serrano"),
                    correctIndex = 2,
                    explanation = "El gallito de las rocas (Rupicola peruviana) es el ave nacional del Perú, caracterizado por su plumaje rojo anaranjado en el macho y su cresta semicircular, habitante de los bosques de neblina de la selva alta.",
                    subject = "Geografía",
                    semana = 8
                )
            )
        ),
        // =========================================================================
        // TEMA 09 - NODO 2: Diversidad biológica y Centros de Origen
        // =========================================================================
        LessonNode(
            id = "geog_t09b",
            subjectId = "geografia",
            semana = 9,
            subtema = "9.2 Biodiversidad del Perú: Centro de Origen Vavilov y Megadiversidad",
            title = "Megadiversidad del Perú: Centro Vavilov y Especies Endémicas",
            theory = LessonTheory(
                id = "theory_geog_t09b",
                asignatura = "Geografía",
                semana = 9,
                titulo = "Megadiversidad del Perú y Centro de Origen de Vavilov",
                resumen = "• Megadiversidad del Perú:\n  - El Perú es el 3er país megadiverso del planeta (después de Brasil y Colombia por superficie selvática).\n  - Posee 84 de las 104 zonas de vida reconocidas en el mundo según el sistema de Holdridge.\n  - Tiene 28 de los 32 tipos de clima del planeta.\n  - 25,000 especies de flora (10% del total mundial); 500 especies de mamíferos; 1,800 especies de aves (20% del total mundial).\n  - Es el primer país del mundo en diversidad de mariposas y orquídeas.\n• Perú como Centro de Origen Vavilov:\n  - Nikolai Ivanovich Vavilov (genetista ruso) identificó 8 grandes centros mundiales de origen y diversificación de plantas cultivadas (1926).\n  - El Perú pertenece al Centro Andino-Amazónico de Origen de Plantas Cultivadas, uno de los más ricos del mundo.\n  - Plantas originarias del Perú: Papa (Solanum tuberosum, +3000 variedades nativas), maíz (Zea mays, domesticado en Mesoamérica pero diversificado en los Andes), quinua, kiwicha, oca, olluco, yuca (Manihot esculenta), camote, tomate, cacao (Theobroma cacao), aguaymanto, lucuma, chirimoya, maní, frijol.\n• Endemismo:\n  - El Perú cuenta con 5777 especies de flora endémica (no existen en ningún otro lugar del planeta), la mayoría en la selva alta y la cordillera.\n  - La pava aliblanca (Penelope albipennis) y el pato crestado del Amazonas son aves estrictamente endémicas del Perú.",
                conceptosClave = listOf(
                    "Perú: 3er país megadiverso, 84/104 zonas de vida de Holdridge, 28/32 climas del planeta",
                    "Centro Andino-Amazónico de Vavilov: papa (+3000 variedades), quinua, kiwicha, cacao originarios del Perú",
                    "1ro en diversidad de mariposas y orquídeas; 20% de aves del mundo",
                    "5777 especies de flora endémica del Perú"
                ),
                formulas = listOf(
                    "\\text{Megadiversidad}: \\text{Perú} = 3^\\circ \\text{ mundo} \\; | \\; 84/104 \\text{ zonas de vida}",
                    "\\text{Papa}: +3000 \\text{ variedades nativas en el Perú} \\implies \\text{Mayor diversidad del planeta}"
                ),
                formulaName = "Índices de Biodiversidad del Perú",
                formulaLatex = "\\text{28 climas} + \\text{84 zonas de vida} + \\text{25,000 spp. flora} = \\text{3° país megadiverso}",
                formulaDescription = "Cuantificación de la riqueza biológica única del territorio peruano.",
                admissionTip = "El Perú tiene el 10% de las plantas del mundo entero en solo el 0.87% de la superficie terrestre. Esto lo convierte en uno de los territorios más eficientes en biodiversidad por km².",
                admissionExplanation = "• La quinua y la kiwicha (amaranto andino) son granos ancestrales peruanos reconocidos por la FAO como alimentos del futuro por su perfil nutricional completo (proteínas con todos los aminoácidos esenciales)."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t09b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "Según el sistema de clasificación de zonas de vida de Holdridge, el Perú concentra 84 de las 104 zonas de vida reconocidas en el mundo, posicionándose como el tercer país megadiverso del planeta. ¿Qué factor geográfico explica principalmente esta riqueza?",
                    options = listOf(
                        "Su posición en el ecuador geográfico y la lluvia constante",
                        "La combinación de la Corriente de Humboldt, la Cordillera de los Andes y la cuenca amazónica",
                        "La extensión de su costa sobre el Océano Pacífico",
                        "Su alta temperatura media anual superior a los 30 °C",
                        "La ausencia de estaciones climáticas marcadas en todo el territorio"
                    ),
                    correctIndex = 1,
                    explanation = "La interacción de la Corriente Peruana fría, la barrera orográfica andina y la cuenca amazónica caliente y húmeda genera una multiplicidad excepcional de microclimas, pisos ecológicos y hábitats únicos.",
                    subject = "Geografía",
                    semana = 9
                )
            )
        ),
        // =========================================================================
        // TEMA 10 - NODO 2: Contaminación ambiental y Minería
        // =========================================================================
        LessonNode(
            id = "geog_t10b",
            subjectId = "geografia",
            semana = 10,
            subtema = "10.2 Impacto Ambiental, Minería y Contaminación en el Perú",
            title = "Problemas Ambientales del Perú: Minería, Deforestación y Contaminación",
            theory = LessonTheory(
                id = "theory_geog_t10b",
                asignatura = "Geografía",
                semana = 10,
                titulo = "Impacto Ambiental, Minería y Contaminación en el Perú",
                resumen = "• Principales Problemas Ambientales del Perú:\n  1. Deforestación Amazónica: Se pierden ~150,000 hectáreas/año de bosque por tala ilegal, agricultura migratoria (chacra y quema), coca y plantaciones de palma aceitera.\n  2. Contaminación Minera (Pasivos Mineros): Más de 7,000 pasivos ambientales mineros en el Perú. Elementos contaminantes: metales pesados como arsénico (As), mercurio (Hg, usado en la minería artesanal de oro), cadmio (Cd) y plomo (Pb) que contaminan el agua y el suelo.\n  3. Minería Ilegal de Oro (Madre de Dios - La Pampa): Destrucción de bosques y ríos amazónicos con dragas y excavadoras. El mercurio librado contamina cuencas, afecta a comunidades nativas y provoca bioacumulación en peces.\n  4. Contaminación del Lago Titicaca: Descargas de aguas residuales sin tratar y relaves mineros del río Suches contaminan el lago con metales pesados y patógenos.\n  5. Derrame de Petróleo: El Oleoducto Nor-Peruano (Petroperú) ha sufrido más de 100 derrames en la Amazonía en los últimos 50 años.\n  6. Residuos Sólidos Urbanos: Lima genera más de 9,000 toneladas/día de basura, de las cuales solo un 5% se recicla.\n• Marco Legal Ambiental:\n  - Ministerio del Ambiente (MINAM): Creado en 2008.\n  - SENACE: Organismo que aprueba Estudios de Impacto Ambiental (EIA).\n  - OEFA: Fiscaliza el cumplimiento de la normativa ambiental.\n  - Principio Precautorio: Ante la duda de daño ambiental irreversible, se debe actuar preventivamente aunque no exista certeza científica absoluta.",
                conceptosClave = listOf(
                    "Mercurio (Hg): principal contaminante de la minería artesanal ilegal de oro en Madre de Dios",
                    "150,000 ha/año de bosque amazónico deforestado por tala, quema y coca",
                    "MINAM (2008), SENACE (EIA), OEFA (fiscalización): sistema ambiental del Estado",
                    "Principio Precautorio: actuar ante la duda de daño ambiental grave e irreversible"
                ),
                formulas = listOf(
                    "\\text{Contaminación minera} \\implies \\text{As, Hg, Cd, Pb} \\implies \\text{Bioacumulación en cadena trófica}",
                    "\\text{Bioacumulación}: \\text{Plancton} \\to \\text{Peces} \\to \\text{Aves/Mamíferos} \\to \\text{Humanos} \\quad (\\text{factor } 10^4 - 10^6)"
                ),
                formulaName = "Cadena de Bioacumulación de Metales Pesados",
                formulaLatex = "C_{organismo} \\gg C_{ambiente} \\implies \\text{Riesgo de toxicidad crónica en el eslabón final}",
                formulaDescription = "La concentración de metales pesados se incrementa exponencialmente en cada nivel trófico de la cadena alimentaria.",
                admissionTip = "El principal contaminante de la minería artesanal ilegal de oro es el MERCURIO (Hg), no el cianuro. El cianuro se usa en la minería formal a gran escala para la lixiviación del oro.",
                admissionExplanation = "• La región de Madre de Dios (La Pampa) es la zona de minería ilegal aurífera más devastada del Perú, con más de 10,000 hectáreas de bosque convertidas en desierto árido de mercurio y erosión."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t10b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El metal pesado empleado por los mineros artesanales ilegales en el proceso de extracción de oro en la región amazónica de Madre de Dios, cuyo vertido en ríos y cuerpos de agua provoca bioacumulación en la cadena trófica, es el:",
                    options = listOf("Plomo (Pb)", "Arsénico (As)", "Mercurio (Hg)", "Cadmio (Cd)", "Cobre (Cu)"),
                    correctIndex = 2,
                    explanation = "El mercurio (Hg) se emplea para amalgamar el oro de los sedimentos fluviales. Al ser vertido sin tratamiento a los ríos, se bioacumula en peces y llega al ser humano a través de la dieta.",
                    subject = "Geografía",
                    semana = 10
                )
            )
        ),
        // =========================================================================
        // TEMA 11 - NODO 2: Migraciones y Urbanización del Perú
        // =========================================================================
        LessonNode(
            id = "geog_t11b",
            subjectId = "geografia",
            semana = 11,
            subtema = "11.2 Migraciones, Urbanización y Problemática Social en el Perú",
            title = "Migraciones Internas y Proceso de Urbanización del Perú",
            theory = LessonTheory(
                id = "theory_geog_t11b",
                asignatura = "Geografía",
                semana = 11,
                titulo = "Migraciones y Urbanización del Perú",
                resumen = "• Migración en el Perú:\n  - Migración Interna (Éxodo Rural-Urbano): Desplazamiento masivo del campo hacia las ciudades, intensificado a partir de los años 50 por la industrialización costera y el terrorismo (Sendero Luminoso en los 80). Lima absorbió millones de migrantes andinos.\n  - Migración Interregional: Movimiento entre departamentos por motivos económicos y educativos.\n  - Migración Internacional: El Perú cuenta con más de 3 millones de emigrantes en el exterior (principal destino: Estados Unidos, España, Chile, Argentina e Italia). Importancia de las remesas como fuente de divisas (~4% del PBI).\n• Proceso de Urbanización del Perú:\n  - En 1940 el Perú era mayoritariamente rural (65% campo, 35% ciudad). En 2024 la relación se invirtió a más del 79% urbano.\n  - Lima Metropolitana: Megalópolis con más de 10 millones de habitantes (cercana al 32% de la población del país). Macrocefalia urbana: concentración excesiva en una sola ciudad en detrimento del resto del país.\n  - Ciudades Intermedias: Trujillo, Arequipa, Chiclayo, Iquitos, Piura compiten como polos de desarrollo descentralizados.\n• Problemas Asociados a la Urbanización Acelerada:\n  - Tugurizacion, hacinamiento en asentamientos humanos (pueblos jóvenes).\n  - Deficiencias en servicios básicos (agua, desagüe, electricidad).\n  - Criminalidad, informalidad laboral y subempleo.\n  - Expansión sobre zonas de riesgo sísmico y deslizamiento.",
                conceptosClave = listOf(
                    "Éxodo rural-urbano: de 35% urbano en 1940 → más del 79% urbano en 2024",
                    "Lima: macrocefalia urbana, ~32% de la población nacional en un solo punto",
                    "Remesas del exterior: ~4% del PBI peruano, fuente vital de divisas",
                    "Descentralización: Trujillo, Arequipa, Chiclayo como ciudades intermedias"
                ),
                formulas = listOf(
                    "\\text{Índice de Primacía Urbana} = \\frac{\\text{Población Lima}}{\\text{Población 2ª ciudad (Arequipa)}} \\gg 1 \\implies \\text{Macrocefalia}",
                    "\\text{Crecimiento Urbano} = \\text{Crecimiento Vegetativo} + \\text{Migración Interna} + \\text{Reclasificación}"
                ),
                formulaName = "Índice de Macrocefalia Urbana",
                formulaLatex = "\\text{Primacía} = \\frac{P_{Lima}}{P_{Arequipa}} \\approx 7.5 \\implies \\text{Altísima concentración metropolitana}",
                formulaDescription = "Desequilibrio territorial extremo entre la capital y las demás ciudades del Perú.",
                admissionTip = "La macrocefalia urbana peruana (Lima concentra ~32% de la población) contrasta con la desigualdad regional: el departamento de Madre de Dios tiene menos del 0.4% de la población en el 10% del territorio.",
                admissionExplanation = "• Las remesas enviadas por los peruanos en el exterior (especialmente desde EE. UU., España e Italia) superan los 3,700 millones de dólares anuales, siendo una fuente de divisas comparable a la pesca o el turismo."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t11b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El fenómeno geográfico-social que describe la concentración desproporcionada de población, servicios, industria y poder político en una sola ciudad metropolitana en detrimento del resto del país se denomina:",
                    options = listOf("Conurbación", "Metropolización", "Macrocefalia urbana", "Suburbanización", "Megalopolización"),
                    correctIndex = 2,
                    explanation = "La macrocefalia urbana describe el desequilibrio territorial en que Lima concentra cerca del 32% de la población peruana y más del 50% de la actividad económica nacional.",
                    subject = "Geografía",
                    semana = 11
                )
            )
        ),
        // =========================================================================
        // TEMA 12 - NODO 2: Minería, Energía e Infraestructura Vial
        // =========================================================================
        LessonNode(
            id = "geog_t12b",
            subjectId = "geografia",
            semana = 12,
            subtema = "12.2 Energía, Industria e Infraestructura Vial del Perú",
            title = "Energía, Industria e Infraestructura del Perú: Puertos y Gasoductos",
            theory = LessonTheory(
                id = "theory_geog_t12b",
                asignatura = "Geografía",
                semana = 12,
                titulo = "Energía, Industria e Infraestructura Vial del Perú",
                resumen = "• Fuentes de Energía en el Perú:\n  - Hidroeléctrica: Principal fuente (~60% de la generación eléctrica). Centrales: Mantaro (Junín, la mayor), El Platanal, Cerro del Águila, San Gaban.\n  - Gas Natural: Proyecto Camisea (Cusco, Cuzco), el yacimiento de gas natural más grande de la historia del Perú. Gasoducto sur peruano inconcluso.\n  - Petróleo: Cuencas de la Selva Norte (Loreto: lotes 8 y 1AB), Talara (Piura). La refinería más importante es la de Talara (Petroperú).\n  - Energías Renovables: Solar (sur desértico), eólica (La Libertad, Ica) y geotérmica (sur andino volcánico).\n• Infraestructura de Transporte:\n  - Sistema Vial Nacional: Red de carreteras administrada por PROVIAS. 80,000+ km de vías.\n  - Carretera Panamericana (Ruta 1): Eje longitudinal costero, de Tumbes a Tacna.\n  - Carretera Interoceánica: Conecta la costa peruana del Pacífico con el Atlántico a través de Brasil (IIRSA Sur, llamada Corredor Vial Interoceánico).\n  - Carretera Marginal de la Selva: Vía longitudinal de penetración a la selva alta.\n  - Ferrocarriles: Central (Lima - Cerro de Pasco / Huancayo), el más alto del mundo hasta hace algunos años. Machu Picchu: Ferrocarril Cusco - Aguas Calientes.\n  - Puertos Principales: Callao (1° nacional y el más importante del Pacífico sur), Paita (Piura), Matarani (Arequipa), Ilo (Moquegua), General San Martín (Pisco), Chancay (proyecto en expansión, financiado por China).",
                conceptosClave = listOf(
                    "Mantaro: central hidroeléctrica más grande del Perú; ~60% de la electricidad es hidráulica",
                    "Camisea (Cusco): mayor yacimiento de gas natural en la historia del Perú",
                    "Callao: primer puerto marítimo del país y de mayor movimiento en Sudamérica sur",
                    "Interoceánica (IIRSA Sur): conecta el Pacífico peruano con el Atlántico brasileño"
                ),
                formulas = listOf(
                    "\\text{Matriz Energética} = 60\\%\\text{ Hidro} + 35\\%\\text{ Gas natural} + 5\\%\\text{ Renovables no conv.}",
                    "\\text{Callao} = \\text{N°1 en contenedores de Sudamérica Sur}"
                ),
                formulaName = "Composición de la Matriz Eléctrica del Perú",
                formulaLatex = "E_{eléctrica} \\approx 60\\% \\text{Hidro} + 35\\% \\text{Gas} + 5\\% \\text{Solar/Eólica}",
                formulaDescription = "Distribución aproximada de la generación eléctrica nacional.",
                admissionTip = "El proyecto Camisea (descubierto en 1983, iniciado en 2004) produce gas natural y líquidos de gas natural en las regiones de Cusco y Ucayali, distribuyendo energía al sur, Lima y para exportación.",
                admissionExplanation = "• El Puerto de Chancay, a 80 km al norte de Lima, se está desarrollando como un megapuerto financiado por capitales chinos que busca convertirse en el hub logístico más importante del Pacífico latinoamericano."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t12b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El proyecto energético que consiste en la extracción y distribución del mayor yacimiento de gas natural descubierto en la historia del Perú, ubicado en la región de Cusco y Ucayali, es:",
                    options = listOf("El proyecto Oleoducto Nor-Peruano", "El proyecto Camisea", "El proyecto Mantaro", "El Gasoducto Sur Peruano", "El proyecto Talara"),
                    correctIndex = 1,
                    explanation = "El proyecto Camisea explota los yacimientos de gas natural y líquidos de Camisea (Cusco), siendo la fuente energética más importante en la historia moderna del Perú.",
                    subject = "Geografía",
                    semana = 12
                )
            )
        ),
        // =========================================================================
        // TEMA 13 - NODO 2: Cuencas del Pacífico y cooperación limítrofe
        // =========================================================================
        LessonNode(
            id = "geog_t13b",
            subjectId = "geografia",
            semana = 13,
            subtema = "13.2 Política Exterior, Soberanía y Controversias Limítrofes del Perú",
            title = "Política Exterior del Perú: Fallo de La Haya y Controversias",
            theory = LessonTheory(
                id = "theory_geog_t13b",
                asignatura = "Geografía",
                semana = 13,
                titulo = "Política Exterior, Soberanía Marítima y Controversias del Perú",
                resumen = "• Dominio Marítimo del Perú:\n  - El Perú reivindica 200 millas náuticas (370.4 km) de dominio marítimo soberano (Decreto Supremo N°781, firmado por José Luis Bustamante y Rivero el 1 de agosto de 1947). Concepto más amplio que la 'Zona Económica Exclusiva' de 200 millas del UNCLOS.\n  - Mar Territorial: 12 millas náuticas de plena soberanía.\n  - Zona Contigua: Hasta 24 millas (control aduanero, sanitario y migratorio).\n  - Zona Económica Exclusiva (ZEE): Hasta 200 millas (derechos económicos de exploración y explotación exclusiva).\n• Fallo de La Haya (27 de enero de 2014):\n  - La Corte Internacional de Justicia (CIJ) emitió un fallo delimitando definitivamente la frontera marítima entre el Perú y Chile.\n  - Resultado: El Perú recuperó unas 50,000 km² de mar (en el extremo sur del triángulo en disputa), pero Chile mantuvo jurisdicción sobre las primeras 80 millas paralelas a la costa.\n  - El fallo fue acatado por ambos países y es considerado de cumplimiento obligatorio.\n• Controversia con Bolivia (Demanda de Acceso al Mar):\n  - Bolivia perdió su costa en la Guerra del Pacífico (1879-1883) ante Chile. Desde entonces demanda un corredor terrestre soberano hacia el Océano Pacífico.\n  - En 2018, la CIJ desestimó la demanda boliviana contra Chile.\n• Organizaciones Internacionales con participación del Perú:\n  - ONU, OEA, APEC, CAN (Comunidad Andina de Naciones), UNASUR, Foro del Pacífico, Alianza del Pacífico (Perú, Colombia, Chile y México).\n  - Antártida: Base Científica Machu Picchu en la Isla Rey Jorge (Perú, desde 1989).",
                conceptosClave = listOf(
                    "200 millas marinas soberanas del Perú (Decreto Bustamante, 1947), anticipó la ZEE del UNCLOS",
                    "Fallo de La Haya (2014): Perú recupera ~50,000 km² de mar disputado con Chile",
                    "Alianza del Pacífico: Perú, Colombia, Chile y México (mayor bloque comercial de AL)",
                    "Base Científica Machu Picchu en la Antártida (Isla Rey Jorge, desde 1989)"
                ),
                formulas = listOf(
                    "\\text{Dominio Marítimo Peruano}: 12 \\text{ mn (Mar Territorial)} + 200 \\text{ mn (ZEE soberana)}",
                    "\\text{Fallo La Haya 2014}: \\text{Perú recupera} \\approx 50{,}000 \\text{ km}^2 \\text{ de área marítima}"
                ),
                formulaName = "Extensión del Dominio Marítimo Peruano",
                formulaLatex = "\\text{Dominio total} = 200 \\text{ mn} \\approx 370 \\text{ km desde la línea de costa peruana}",
                formulaDescription = "Extensión del espacio marítimo sobre el cual el Perú ejerce derechos de soberanía y jurisdicción.",
                admissionTip = "El dominio marítimo del Perú fue establecido en 1947 por Bustamante y Rivero mediante el D.S. 781. Es 200 millas náuticas, equivalentes a ~370 km, lo que incluye la ZEE más el mar territorial.",
                admissionExplanation = "• La Alianza del Pacífico (2011) integrada por Perú, Colombia, Chile y México es el bloque económico más dinámico de América Latina, representando el 40% del PBI regional y más del 50% del comercio exterior."
            ),
            challenges = listOf(
                Challenge(
                    id = "q_geog_t13b_1",
                    type = ChallengeType.MULTIPLE_CHOICE,
                    statement = "El presidente peruano que estableció por primera vez las 200 millas náuticas de dominio marítimo soberano mediante el Decreto Supremo N°781 en 1947 fue:",
                    options = listOf("Manuel A. Odría", "José Luis Bustamante y Rivero", "Fernando Belaúnde Terry", "Juan Velasco Alvarado", "Alan García Pérez"),
                    correctIndex = 1,
                    explanation = "El Presidente José Luis Bustamante y Rivero promulgó el 1 de agosto de 1947 el Decreto Supremo N°781, estableciendo el dominio marítimo del Perú sobre las 200 millas náuticas adyacentes a sus costas.",
                    subject = "Geografía",
                    semana = 13
                )
            )
        )
    )
}
