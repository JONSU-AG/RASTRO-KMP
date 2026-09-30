package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

/**
 * OBRA 07: Crimen y castigo (Fiódor Dostoievski)
 * Fuente oficial: CONTENIDO_PEDAGOGICO/06_COMUNICACION/LITERATURA/OBRAS/OBRA_07_Crimen_y_Castigo_Dostoievski.md
 * Integración modular para RASTRO KMP - Biblioteca -> Obras
 */
val Obra07CrimenYCastigo = ObraLiteraria(
    id = "crimen-y-castigo",
    titulo = "Crimen y castigo",
    autor = "Fiódor Dostoievski",    anio = "Siglo XIX (1866)",
    pais = "Rusia",
    colorHex = "#374151",
    corriente = "Realismo ruso / Novela psicológica y filosófica polifónica",
    genero = "Narrativo",
    especie = "Novela psicológica",
    categoria = "Literatura Universal",    sinopsis = """
        En una asfixiante y calurosa tarde de julio en los barrios bajos de San Petersburgo, el joven exestudiante de Derecho Rodión Románovich Raskólnikov abandona su opresiva buhardilla —semejante a un ataúd— para realizar el ensayo general de su proyecto homicida: empeña un reloj en casa de la anciana usurera Aliona Ivánovna, calculando al milímetro los 730 pasos del trayecto y las cerraduras del inmueble. Raskólnikov, atormentado por la extrema pobreza que paraliza sus estudios y por una carta materna donde se entera de que su hermana Dunia planea sacrificarse casándose con el mezquino burgués Luzhin para salvar a la familia, concibe una justificación ideológica total: en su artículo 'Del crimen' postula que la humanidad se divide en hombres ordinarios (material vulgar de sumisión) y hombres extraordinarios (como Napoleón), legitimados moralmente para transgredir las leyes y derramar sangre si ello sirve a ideales superiores.
        
        Tras escuchar en una taberna al desdichado y alcohólico exfuncionario Semión Marmeládov relatar el sacrificio de su hija Sonia —quien se vio forzada a ejercer la prostitución con el carné amarillo para alimentar a sus hermanos—, y soñar con una yegua apaleada hasta la muerte por carreteros ebrios, Raskólnikov se entera de que la usurera estará sola a las siete de la tarde. Ocultando un hacha bajo su gabán sujeta con un lazo cosido, acude a la vivienda y asesina a golpes de hacha a Aliona Ivánovna. Sin embargo, en pleno saqueo del baúl, la media hermana de la usurera, la inocente, bondadosa e infantil Lizaveta, entra de improviso; presa del pánico, Raskólnikov le parte el cráneo con el filo del hacha de un solo golpe. Consigue escapar y esconderse milagrosamente.
        
        A partir de ese instante se desencadena el verdadero 'castigo': no la persecución policial exterior, sino la devastación psicológica, el delirio febril y la soledad cósmica de la culpa moral. Temiendo ser descubierto, entierra el botín intacto bajo una gran piedra en un patio baldío, sin haber contado jamás el dinero. Atendido en su fiebre por su leal amigo Razumijin, Raskólnikov debe enfrentar el cerco mental magistral del juez de instrucción Porfiri Petróvich, quien utiliza la psicología forense del 'gato y el ratón' sin pruebas materiales directas, sabiendo que el criminal intelectual volverá inexorablemente atraído por su crimen.
        
        En su tormento, Raskólnikov busca a Sonia Marmeládova: se arrodilla ante ella y besa sus pies declarando: 'No me he inclinado ante ti, me he inclinado ante todo el dolor humano'. Sonia le lee en el Nuevo Testamento el pasaje de la resurrección de Lázaro, prefigurando la redención espiritual. Poco después, Raskólnikov le confiesa en secreto el doble asesinato; Sonia, lejos de repudiarlo, lo abraza en llanto, le entrega su cruz de ciprés y le exige el camino de la expiación: '¡Ponte en una encrucijada, besa la tierra que mancillaste y confiesa al mundo que eres un asesino!'. Mientras tanto, su doble cínico y hedonista Svidrigáilov, enterado de la confesión a través del tabique y tras ser rechazado a punta de revólver por Dunia, se suicida pegándose un tiro en la sien.
        
        Acorralado por Porfiri —quien le revela con certeza paternal que sabe que él es el asesino y le aconseja entregarse para mitigar su pena—, Raskólnikov acude a la plaza del Heno, besa el fango entre lágrimas y confiesa su crimen en la comisaría. Es condenado a ocho años de trabajos forzados en la fortaleza de Omsk (Siberia), adonde Sonia lo sigue abnegadamente. En las estepas siberianas junto al río Irtish, tras superar una crisis de soberbia y soñar con la peste apocalíptica de las triquinas ideológicas, Raskólnikov se quiebra a los pies de Sonia en la Pascua de Resurrección: el amor cristiano y el sufrimiento libremente aceptado resucitan su alma hacia una vida nueva.
    """.trimIndent(),
    contextoHistorico = """
        • Marco histórico y filosófico: Publicada en 1866 en 'El Mensajero Ruso', la obra cumbre de Dostoievski representa la refutación más demoledora contra el nihilismo, el utilitarismo materialista y el darwinismo social que seducían a los intelectuales rusos de la década de 1860. Denuncia que prescindir de la moral evangélica para erigir la Razón abstracta engendra monstruosidades donde 'todo está permitido'.
        • Experiencia biográfica del autor: Tras pertenecer al Círculo de Petrashevski, Dostoievski sufrió en 1849 un simulacro de fusilamiento y cuatro años de trabajos forzados en Siberia. La convivencia con criminales comunes transformó su visión del mundo hacia la ortodoxia mística y la convicción de que la redención humana solo se alcanza mediante el sufrimiento libremente aceptado ('pódvig').
        • Innovación literaria: Máximo exponente de la novela psicológica y de la novela polifónica (teorizada por Mijaíl Bajtín), donde múltiples conciencias y voces ideológicas autónomas colisionan dialécticamente con igual peso.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Rodión Románovich Raskólnikov (Rodia)",
            rol = "Protagonista / Exestudiante de Derecho",
            descripcion = "Joven de 23 años, inteligente, altivo, solitario y huraño. Su apellido proviene de 'raskol' (cisma o escisión): oscila entre la soberbia del superhombre napoleónico que justifica el derramamiento de sangre por encima de la moral y la compasión infinita que ayuda a los desvalidos. Mata a las hermanas y sufre la tortura de la culpa hasta su redención siberiana."
        ),
        PersonajeLiterario(
            nombre = "Sófia Semiónovna Marmeládova (Sonia)",
            rol = "Heroína espiritual / Símbolo de redención y fe",
            descripcion = "Hija de Marmeládov de 18 años. Se prostituye con el 'carné amarillo' por amor sacrificial para salvar de la inanición a sus hermanastros y madrastra. Encarna la pureza espiritual, la mansedumbre y la fe inquebrantable en Cristo. Lee el milagro de Lázaro a Rodia y lo acompaña al presidio de Siberia."
        ),
        PersonajeLiterario(
            nombre = "Porfiri Petróvich",
            rol = "Juez de instrucción / Antagonista dialéctico",
            descripcion = "Magistrado a cargo del caso del doble crimen. Maestro de la psicología forense que prescinde de pruebas materiales directas y cerca mentalmente a Raskólnikov ('el juego del gato y el ratón'), exhortándolo paternalmente a confesar para salvar su alma."
        ),
        PersonajeLiterario(
            nombre = "Arkadi Ivánovich Svidrigáilov",
            rol = "Doble cínico y nihilista de Raskólnikov",
            descripcion = "Antiguo patrón de Dunia. Encarna el nihilismo amoral llevado al extremo hedonista. Escucha la confesión tras la pared y ayuda financieramente a los huérfanos de Marmeládov, pero ante el vacío existencial y el rechazo de Dunia, se suicida de un tiro en la sien."
        ),
        PersonajeLiterario(
            nombre = "Aliona Ivánovna",
            rol = "Víctima / Anciana usurera",
            descripcion = "Mujer de 60 años, avara, cruel y usurera despiadada que explota la necesidad de los desamparados y esclaviza a su hermana Lizaveta. Representa el 'piojo social' cuya eliminación Raskólnikov pretende justificar con cálculos utilitaristas."
        ),
        PersonajeLiterario(
            nombre = "Lizaveta Ivánovna",
            rol = "Segunda víctima / Media hermana de la usurera",
            descripcion = "Costurera humilde, tímida, sumisa y de mente infantil. Amiga de Sonia con quien intercambiaba cruces. Su asesinato accidental a golpes de hacha destruye cualquier coartada moral de Raskólnikov."
        ),
        PersonajeLiterario(
            nombre = "Dmitri Prokófich Razumijin",
            rol = "Mejor amigo de Rodia / La razón sensata",
            descripcion = "Exestudiante leal, trabajador y noble (su nombre deriva de 'razum', razón o cordura). Cuida a Rodia en su enfermedad, protege a su madre y hermana Dunia, y termina casándose con esta última."
        ),
        PersonajeLiterario(
            nombre = "Avdotia Románovna Raskólnikova (Dunia)",
            rol = "Hermana de Rodia",
            descripcion = "Joven de gran temple ético, orgullo y abnegación. Rechaza venderse por conveniencia a Luzhin y enfrenta a punta de revólver los avances de Svidrigáilov."
        ),
        PersonajeLiterario(
            nombre = "Piotr Petróvich Luzhin",
            rol = "Pretendiente burgués / Caricatura del egoísmo racional",
            descripcion = "Abogado enriquecido y mezquino. Pretende someter a Dunia casándose con ella en la pobreza. Intenta inculpar a Sonia deslizándole un billete de 100 rublos en el bolsillo para vengarse de Raskólnikov."
        ),
        PersonajeLiterario(
            nombre = "Semión Zajárovich Marmeládov",
            rol = "Exfuncionario alcohólico / Padre de Sonia",
            descripcion = "Hombre arruinado que relata en una taberna su miseria teológica ('no tener adónde ir'). Muere atropellado por un carruaje en la vía pública, recibiendo el auxilio póstumo de Rodia."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Parte I: La coartada napoleónica y el golpe de hacha",
            detalle = "Raskólnikov ensaya el crimen en casa de la usurera Aliona. Conoce a Marmeládov en la taberna y recibe la carta de su madre sobre el sacrificio de Dunia. Tras la pesadilla del caballo apaleado por Mikolka y enterarse de que Lizaveta no estará, coge el hacha de la conserjería y mata a Aliona; sorprendido por Lizaveta, la asesina también y huye con el botín."
        ),
        EscenaTrama(
            titulo = "Parte II: El delirio febril y el tesoro bajo la piedra",
            detalle = "Raskólnikov oculta el botín intacto bajo una gran piedra en un solar sin contar el dinero. Cae en fiebres delirantes en su buhardilla alucinando con la policía. Razumijin lo asiste; Marmeládov muere atropellado y Rodia entrega todo su dinero a la viuda Katerina, conociendo a Sonia."
        ),
        EscenaTrama(
            titulo = "Parte III: El careo con Porfiri y la teoría de los hombres extraordinarios",
            detalle = "Raskólnikov se entrevista con el juez Porfiri para reclamar sus empeños. Porfiri somete a debate su artículo 'Del crimen': la tesis de que los seres superiores (Napoleón) tienen derecho moral a saltar sobre la ley y la sangre. Al salir, un transeúnte le susurra '¡Asesino!' en la calle."
        ),
        EscenaTrama(
            titulo = "Parte IV: El Evangelio de Lázaro y la falsa confesión del pintor",
            detalle = "Raskólnikov visita a Sonia, besa sus pies en honor al dolor humano y le pide que le lea la resurrección de Lázaro. En un segundo careo judicial, Porfiri lo acorrala psicológicamente, pero la sorpresiva autoinculpación del pintor Nikolái interrumpe el arresto inminente."
        ),
        EscenaTrama(
            titulo = "Parte V: La canallada de Luzhin y la confesión a Sonia",
            detalle = "En el banquete fúnebre de Marmeládov, Luzhin planta un billete de 100 rublos en el delantal de Sonia para acusarla de robo, pero es desenmascarado por Lebeziátnikov. Luego, Raskólnikov confiesa a solas su doble asesinato a Sonia; ella le exige besar la tierra y entregarse a la justicia divina y terrenal."
        ),
        EscenaTrama(
            titulo = "Parte VI: El suicidio de Svidrigáilov y el beso en la plaza del Heno",
            detalle = "Porfiri visita a Rodia y le afirma cara a cara que sabe que él es el homicida, dándole plazo para entregarse. Dunia rechaza a tiros a Svidrigáilov, quien se suicida de un tiro en la sien. Raskólnikov besa la tierra en la plaza del Heno, acude a la comisaría y confiesa el doble crimen."
        ),
        EscenaTrama(
            titulo = "Epílogo: Los trabajos forzados en Siberia y la resurrección del alma",
            detalle = "Raskólnikov es condenado a 8 años de presidio en Omsk. Sonia lo acompaña fielmente. Tras superar el orgullo intelectual y soñar con la plaga de las triquinas de la soberbia, Rodia se quiebra a los pies de Sonia a orillas del río Irtish en Pascua, renaciendo espiritualmente mediante el amor y el dolor."
        )
    ),
    temaPrincipal = "La falacia del superhombre y del utilitarismo moral, el castigo interior de la culpa y la conciencia psicológica frente a la transgresión de la ley moral, y la redención humana mediante el amor cristiano y el dolor libremente asumido.",
    simbolosClave = listOf(
        "El hacha: Instrumento violento campesino y brutal; contradice la pretendida sofisticación intelectual de Raskólnikov y lo rebaja de 'Napoleón' a carnicero despiadado.",
        "La resurrección de Lázaro (San Juan 11): Eje metafórico supremo; Raskólnikov es el muerto en descomposición moral dentro de su buhardilla a quien el amor de Cristo mediante Sonia llama a salir a la luz.",
        "La buhardilla amarilla como un ataúd: Espacio claustrofóbico que encarna la mente aislada y enferma de Rodia, asfixiada por teorías abstractas.",
        "El botín intacto bajo la piedra: Demuestra la quiebra absoluta del móvil económico utilitarista; no mató por dinero ni codicia, sino por soberbia ideológica.",
        "La cruz de ciprés de Lizaveta: Entregada por Sonia a Raskólnikov; representa la expiación vicaria del pecado y la hermandad mística con la víctima inocente.",
        "El sueño de la yegua apaleada: Anticipa la brutalidad del crimen sobre criaturas indefensas y la angustia de la inocencia infantil pisoteada por la tiranía salvaje.",
        "El beso en la tierra en la plaza del Heno: Acto de expiación pública y reconciliación con la Madre Tierra mancillada por la sangre derramada."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es el móvil fundamental e ideológico que impulsa a Raskólnikov a perpetrar el asesinato?",
            respuesta = "Demostrar si él pertenecía a la estirpe de los 'hombres extraordinarios' (como Napoleón) con derecho moral implícito a transgredir las normas de la sociedad y derramar sangre ajena para cumplir sus fines, superando la condición de mero 'hombre ordinario' o piojo sumiso."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué el asesinato imprevisto de Lizaveta destruye todas las justificaciones teóricas de Raskólnikov?",
            respuesta = "Porque Lizaveta era una víctima bondadosa, inocente y desvalida, no un 'parásito social' usurero como su hermana Aliona. Al matarla con el hacha, la teoría del utilitarismo benevolente colapsa y Raskólnikov se revela ante su propia conciencia como un homicida vulgar y cobarde."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué destino le da Raskólnikov al dinero y objetos de valor sustraídos de la casa de la usurera?",
            respuesta = "No gasta un solo rublo ni los usa para ayudar a su madre; entierra todo el botín intacto bajo una pesada piedra en un patio baldío de San Petersburgo sin haber contado jamás la suma, evidenciando que el crimen no fue motivado por lucro económico."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué método psicológico emplea el juez de instrucción Porfiri Petróvich para atrapar a Raskólnikov?",
            respuesta = "El método del 'gato y el ratón': prescinde de la detención inmediata y de pruebas materiales contundentes, sometiendo a Rodia a un acoso dialéctico y psicológico constante, seguro de que el criminal intelectual terminará entregándose impulsado por la tortura de su propia conciencia moral."
        ),
        PreguntaClaveObra(
            pregunta = "¡Trampa de Examen!: ¿Quién y cómo muere Svidrigáilov en el desenlace de la novela?",
            respuesta = "¡No es asesinado por Dunia ni condenado en juicio! Tras ser rechazado a punta de revólver por Dunia y comprender el vacío absoluto de su hedonismo amoral, pasa una noche de pesadillas y se suicida descerrajándose un tiro en la sien en plena calle frente a un centinela militar."
        )
    )
)
