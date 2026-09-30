package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra33AvesSinNido = ObraLiteraria(
    id = "aves-sin-nido",
    titulo = "Aves sin nido",
    autor = "Clorinda Matto de Turner",    anio = "Siglo XIX (1889)",
    pais = "Perú",
    corriente = "Realismo Peruano / Novela Precursora y Fundacional del Indigenismo Social",
    genero = "Narrativo",
    especie = "Novela social, moralizadora y trágica",
    categoria = "Literatura Peruana",    colorHex = "#B45309",
    sinopsis = """
        Aves sin nido (Lima, 1889) es la obra fundacional de la novela social e indigenista en el Perú y en Hispanoamérica, escrita por la valiente escritora cusqueña Clorinda Matto de Turner. Ambientada en el pueblo andino de Killac (sierra del Cusco), la obra denuncia con crudeza realista la 'trinidad explotadora' (el cura párroco, el gobernador y el juez de paz) que somete a la servidumbre feudal, el despojo y la miseria a los campesinos quechuas, entrelazando la lucha filantrópica con un idilio juvenil de desgarrador desenlace trágico:

        I. El Llanto de Marcela y la Caridad de los Marín: La campesina indígena Marcela Yupanqui acude desolada ante doña Lucía Marín, recién llegada de Lima junto a su esposo, el ingeniero de minas don Fernando Marín. Marcela implora auxilio contra el infame 'repartimiento forzoso de lanas': el cura y el gobernador han adelantado a su esposo Juan diez pesos de plata para exigirle arrobas de lana que no posee. Si no cancelan la deuda con intereses usureros, los cobradores embargarán su ganado y se llevarán a sus pequeñas hijas, Margarita (de catorce años) y Rosalía, como siervas domésticas a la casa parroquial. Los nobles esposos Marín pagan íntegramente la deuda de su propio bolsillo.

        II. La Conspiración de Killac y la Noche de Sangre: Lejos de apaciguarse, los poderes fácticos del pueblo —el párroco alcohólico Pascual Vargas, el tiránico gobernador Sebastián Pancorbo y el juez Estéfano Benites— ven en la filantropía de los Marín una herejía subversiva que amenaza con sublevar a la indiada. En una tertulia en la casa parroquial, urden un asalto criminal: azuzan a una muchedumbre borracha haciéndoles creer que los forasteros son herejes. La turba cerca la casona a balazos y pedradas; el leal Juan Yupanqui acude a defender a sus benefactores y cae acribillado en el tiroteo, mientras Marcela es herida de muerte en el vientre.

        III. La Llegada Heroica de Manuel y el Secreto Agónico: La masacre es frenada por la oportuna intervención de Manuel, un virtuoso estudiante de Derecho que desaprueba la barbarie de su padrastro (el gobernador Pancorbo) y dispersa a los asaltantes. En la casona, la agonizante Marcela hace jurar a Lucía que criará a sus hijas huérfanas como propias; en su último aliento, le susurra al oído el tremendo secreto sobre el verdadero progenitor de la hermosa Margarita. Los Marín adoptan a las niñas, convirtiéndolas en las 'aves sin nido'.

        IV. El Idilio Puro y la Farsa Judicial del Campanero: La oligarquía local busca un chivo expiatorio y encarcela injustamente al humilde campanero indio Champi. Don Fernando y Manuel asumen su defensa jurídica. En medio de las tensiones, florece un amor puro, espiritual y correspondido entre Manuel y Margarita. Manuel ve en la muchacha al ángel de su vida y Margarita halla en él a su protector. Entretanto, el cura Pascual Vargas muere devorado por las fiebres tifoideas y el delirio culpable.

        V. El Desenlace Trágico en el Hotel Imperial de Arequipa: Hostigados por el odio caciquil, los Marín liquidan sus negocios y viajan en ferrocarril rumbo a Lima, haciendo escala en el Hotel Imperial de Arequipa. Allí aparece Manuel, victorioso tras liberar al indio Champi y cabalgar sin descanso para pedir formalmente la mano de Margarita en matrimonio. La felicidad parece consumada; sin embargo, al advertirle don Fernando que Margarita es hija natural de un sacerdote, Manuel responde que él también es fruto del pecado de un prelado: el doctor don Pedro de Miranda y Claro (antiguo cura de Killac y luego consagrado Obispo del Cusco). El horror paraliza a los presentes: ¡Manuel y Margarita son hermanos biológicos de padre! Margarita se desmaya entre alaridos y Manuel queda destrozado ante la imposibilidad del incesto, consumando la tragedia de una patria cuyas culpas coloniales envenenan a los hijos inocentes.
    """.trimIndent(),
    contextoHistorico = """
        Publicada en Lima en 1889 en la imprenta 'El Universo', 'Aves sin nido' apareció durante el periodo de la Reconstrucción Nacional tras el desastre de la Guerra del Pacífico.

        El Tránsito del Romanticismo al Realismo Indigenista:
        Inspirada por el ideario radical de Manuel González Prada ('Discurso en el Politeama'), Clorinda Matto superó la visión idealizada y romántica del indio incaico de postal para mostrar el sufrimiento desgarrador del comunero andino contemporáneo, explotado por el gamonalismo republicano.

        Escándalo, Excomunión Eclesiástica y Destierro:
        La novela desató un terremoto sociopolítico: al denunciar la corrupción del clero, la violación sistemática del celibato y la procreación de hijos bastardos por prelados en los pueblos andinos, la Iglesia católica excomulgó a Clorinda Matto. Turbas fanáticas saquearon su imprenta y quemaron efigies suyas en el Cusco y Lima, obligándola a huir al exilio a Buenos Aires, donde murió en 1909.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Margarita Yupanqui",
            rol = "Joven mestiza inocente, doncella huérfana de amor trágico",
            descripcion = "Hija de Marcela; hermosa doncella de catorce años de espíritu puro. Adoptada por los esposos Marín tras la muerte de sus padres, ama apasionadamente a Manuel ignorando que comparten el mismo progenitor."
        ),
        PersonajeLiterario(
            nombre = "Manuel Pancorbo / Miranda",
            rol = "Joven estudiante de Derecho e hidalgo de moral intachable",
            descripcion = "Joven noble, ilustrado y justiciero; cree ser hijo del gobernador Sebastián Pancorbo, pero descubre que su padre biológico fue el obispo Pedro de Miranda y Claro. Su amor por Margarita culmina en la devastación del incesto."
        ),
        PersonajeLiterario(
            nombre = "Don Fernando y Doña Lucía Marín",
            rol = "Matrimonio burgués ilustrado y filántropo",
            descripcion = "Pareja limeña radicada temporalmente en Killac por negocios mineros; encarnan la razón, la caridad cristiana auténtica y la defensa legal de los indígenas frente al salvajismo feudal."
        ),
        PersonajeLiterario(
            nombre = "Juan y Marcela Yupanqui",
            rol = "Campesinos indígenas mártires",
            descripcion = "Familia quechua despojada por el reparto forzoso de lanas; Juan muere acribillado defendiendo la casa de los Marín y Marcela expira confiando a Lucía el secreto de la paternidad de Margarita."
        ),
        PersonajeLiterario(
            nombre = "La «Trinidad Explotadora»",
            rol = "Bloque de opresión feudal gamonal en Killac",
            descripcion = "Conformada por el cura párroco Pascual Vargas (lujurioso y simoniaco), el gobernador Sebastián Pancorbo (tirano y cobarde) y el juez Estéfano Benites (tinterillo leguleyo), artífices del asalto criminal."
        ),
        PersonajeLiterario(
            nombre = "Obispo Pedro de Miranda y Claro",
            rol = "Causa remota e invisible de la catástrofe familiar",
            descripcion = "Antiguo cura párroco de Killac elevado a la dignidad episcopal del Cusco; sedujo tanto a la madre de Manuel como a la madre de Marcela (engendrando a Margarita), sellando la desgracia consanguínea de los amantes."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La Súplica de Marcela y el Reparto de Lanas",
            detalle = "Marcela Yupanqui llora ante Lucía Marín denunciando la amenaza de que el cobrador parroquial les arrebate a sus hijas por una deuda ficticia de lanas; don Fernando salda la cuenta rescatando a la familia."
        ),
        EscenaTrama(
            titulo = "El Asalto Nocturno y la Muerte de los Yupanqui",
            detalle = "El cura Vargas y el gobernador Pancorbo azuzan a una turba fanatizada contra la casona de los Marín; Juan Yupanqui muere baleado defendiendo a sus protectores y Marcela es herida mortalmente."
        ),
        EscenaTrama(
            titulo = "El Secreto Agónico y la Adopción de las Niñas",
            detalle = "En sus últimos estertores, Marcela confiesa al oído de Lucía el origen secreto de Margarita; los Marín adoptan formalmente a Margarita y Rosalía asumiendo su custodia."
        ),
        EscenaTrama(
            titulo = "La Defensa del Campanero Champi y el Florecer del Amor",
            detalle = "Manuel defiende al inocente campanero Champi encarcelado por los caciques; paralelamente, declara su amor apasionado y respetuoso a Margarita prometiendo desposarla."
        ),
        EscenaTrama(
            titulo = "La Anagnórisis del Incesto en el Hotel Imperial de Arequipa",
            detalle = "Manuel pide la mano de Margarita en Arequipa; al confrontar la identidad de sus progenitores, descubren aterrados que ambos son hijos del obispo Pedro de Miranda y Claro, truncándose su destino en dolor irreparable."
        )
    ),
    temaPrincipal = "La denuncia descarnada de la explotación feudal del indio por la alianza del clero, la gobernación y la justicia venal ('la trinidad explotadora'); y la tragedia moral del incesto involuntario entre dos jóvenes virtuosos engendrados por un mismo prelado de la Iglesia, metáfora de una nación desarticulada por la hipocresía colonial.",
    simbolosClave = listOf(
        "Aves sin nido: Metáfora de los huérfanos desamparados (Margarita, Rosalía y Manuel), arrojados del calor familiar por la violencia y el pecado eclesiástico.",
        "La «trinidad explotadora»: Símbolo del yugo tripartito (cura, gobernador y juez) que asfixia económica, física y jurídicamente a las comunidades indígenas.",
        "El reparto forzoso de lanas: Mecanismo usurero de expoliación económica colonial perpetuado en la República.",
        "El ferrocarril del sur: Emblema del progreso tecnológico y la civilización ilustrada que avanza frente a la barbarie feudal de los pueblos andinos.",
        "El Hotel Imperial de Arequipa: Escenario cosmopolita de la modernidad donde estalla fatalmente la verdad colonial oculta.",
        "La sotana del obispo: Símbolo de la hipocresía moral, la simonía y la corrupción del celibato eclesiástico que corrompe vidas inocentes."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué corriente literaria pertenece 'Aves sin nido' y por qué se la considera precursora?",
            respuesta = "Pertenece al Realismo Peruano de fines del siglo XIX y se considera la obra precursora y fundacional del Indigenismo porque superó el romanticismo exótico para denunciar la explotación real del campesino andino."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quiénes conforman la célebre 'trinidad explotadora' de la novela?",
            respuesta = "Está conformada por el cura párroco (Pascual Vargas), el gobernador (Sebastián Pancorbo) y el juez de paz (Estéfano Benites), quienes conspiran juntos para oprimir a la población indígena."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es el motivo exacto por el cual Manuel y Margarita no pueden casarse al final de la obra?",
            respuesta = "Porque descubren en el Hotel Imperial de Arequipa que son hermanos consanguíneos de padre, engendrados ambos por el difunto obispo del Cusco don Pedro de Miranda y Claro."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué represalias sufrió Clorinda Matto de Turner tras publicar 'Aves sin nido' en 1889?",
            respuesta = "Fue excomulgada por la Iglesia católica, su imprenta en Lima fue asaltada por turbas fanatizadas, sus efigies y libros fueron quemados en plazas públicas y tuvo que exiliarse definitivamente en Argentina."
        )
    )
)
