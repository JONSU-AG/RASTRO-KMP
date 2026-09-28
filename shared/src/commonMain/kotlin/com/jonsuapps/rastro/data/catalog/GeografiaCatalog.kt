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
            subtema = "1.2 Geodesia y Cartografía",
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
            subtema = "1.3 El Universo, el Sistema Planetario Solar y la Tierra",
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
            subtema = "1.4 Geósfera y Geodinámica Interna y Externa",
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
            subtema = "1.5 Atmósfera, Tiempo y Clima",
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
            subtema = "1.6 Hidrósfera: Mar Peruano y Cuencas Hidrográficas",
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
            subtema = "1.7 Geomorfología y Relieve del Territorio Peruano",
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
            subtema = "1.8 Las Ocho Regiones Naturales del Perú (Pulgar Vidal)",
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
            subtema = "1.9 Las Once Ecorregiones del Perú (Brack Egg)",
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
            subtema = "1.10 Recursos Naturales, ANP y Desarrollo Sostenible",
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
            subtema = "1.11 Población y Demografía del Perú y el Mundo",
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
            subtema = "1.12 Actividades Económicas en el Perú",
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
            subtema = "1.13 Geopolítica, Fronteras y Tratados del Perú",
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
        )
    )
}
