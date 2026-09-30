package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra26LosRiosProfundos = ObraLiteraria(
    id = "los-rios-profundos",
    titulo = "Los ríos profundos",
    autor = "José María Arguedas",    anio = "Siglo XX (1958)",
    pais = "Perú",
    corriente = "Neoindigenismo Peruano / Indigenismo Lírico, Antropológico y Mágico",
    genero = "Narrativo",
    especie = "Novela de iniciación (Bildungsroman) / Novela lírico-autobiográfica",
    categoria = "Literatura Peruana",    colorHex = "#0D9488",
    sinopsis = """
        Los ríos profundos (1958) es la obra cumbre de José María Arguedas y la máxima expresión del Neoindigenismo peruano, galardonada en 1959 con el Premio Nacional de Fomento a la Cultura 'Ricardo Palma'. A través de 11 capítulos de extraordinaria intensidad poética y transculturación narrativa bilingüe (quechua-español), la novela sigue el viaje iniciático y el desgarrador conflicto cultural de Ernesto, un adolescente de catorce años que actúa como desdoblamiento autobiográfico del autor:

        I. El Cuzco y el Muro que Late: Ernesto y su padre Gabriel, un abogado itinerante y nómada, llegan de noche al Cuzco para solicitar amparo a su pariente rico, don Manuel Jesús ('el Viejo'), un gamonal avaro y despótico que los recibe con desprecio humillante. En la oscuridad, Ernesto contempla el muro incaico del palacio de Inca Roca y experimenta una revelación mística y animista: las ciclópeas piedras unidas sin argamasa no están muertas; hierven, respiran, caminan y laten como un torrente cósmico inmortal que resiste la mezquindad del tiempo y de los opresores.

        II. La Despedida y el Internado de Abancay: Tras recorrer a caballo quebradas y pueblos andinos, el padre matricula a Ernesto como interno en el Colegio Religioso de la Orden de la Merced en Abancay para continuar su errancia profesional en la costa. Ernesto queda sumido en una soledad lacerante en un internado que refleja en miniatura las taras de la sociedad peruana: racismo, violencia física, clasismo feroz y una sexualidad clandestina y sórdida cuyo blanco de ultrajes es la Opa Marcelina, una sirvienta indígena demente y muda. Ernesto rechaza este ambiente corrompido y busca refugio espiritual en la naturaleza y en las chicherías de Huanupata, donde escucha los huaynos quechuas que acariciaron su niñez.

        III. La Magia del Zumbayllu: El clima asfixiante del patio escolar se transforma con la llegada de Ántero ('el Markask'a'), quien introduce el 'zumbayllu', un trompo mágico de madera pulida que al bailar emite un zumbido agudo y luminoso como el canto de un insecto alado. Para Ernesto, el zumbayllu es un instrumento sagrado capaz de purificar el aire infectado del colegio, sintonizar con las fuerzas cósmicas y transmitir mensajes de amor a su padre lejano a través del viento y las corrientes de agua.

        IV. La Rebelión de la Sal: Estalla una grave crisis social en Abancay provocada por el acaparamiento de la sal: los hacendados latifundistas retienen los sacos para engordar a su ganado vacuno, privando del mineral básico a los campesinos y pobres. Las valientes chicheras de Huanupata, acaudilladas por doña Felipa, se sublevan, asaltan los almacenes y reparten la sal con justicia entre el pueblo y los desdichados colonos de la hacienda Patibamba. Ernesto se suma entusiasmado a la revuelta popular marchando junto a doña Felipa. La represión gubernamental es implacable: el ejército ocupa la ciudad con bayonetas y el fanático Padre Linares descarga desde el púlpito un colosal sermón condenando a las rebeldes al infierno si no devuelven la sal a los patrones.

        V. La Peste, la Marcha de los Colonos y la Catarsis del Pachachaca: En medio de la represión, estalla una mortífera epidemia de tifoidea exantemática desatada tras la agonía y muerte de la Opa Marcelina en el corral del colegio. El pánico desmorona a la ciudad; los sacerdotes y pupilos ricos huyen despavoridos. En ese instante supremo, miles de indios colonos rompen la servidumbre feudal de las haciendas y marchan en silencio sagrado sobre Abancay: no vienen a matar, sino a exigir que el Padre Linares rece una misa rogativa que libere sus almas y aleje la peste. Concluida su iniciación moral, Ernesto abandona el colegio y cruza el puente colonial sobre el rugiente río Pachachaca ('puente sobre el mundo'). El muchacho contempla el torrente embravecido que arrastra árboles y piedras, con la fe inquebrantable de que sus aguas sagradas lavarán la peste, ahogarán el pecado del gamonalismo y llevarán la purificación andina hacia el mar.
    """.trimIndent(),
    contextoHistorico = """
        Publicada en 1958 por la Editorial Losada en Buenos Aires y distinguida en 1959 con el Premio Nacional 'Ricardo Palma', 'Los ríos profundos' marca la consagración definitiva del Neoindigenismo en la literatura hispanoamericana.

        La Condición Existencial de Arguedas:
        Nacido en Andahuaylas en 1911, José María Arguedas sufrió el desgarramiento de ser un blanco criado en el seno de la servidumbre indígena. Tras la muerte de su madre y las ausencias de su padre abogado, fue maltratado por su madrastra y hermanastro en San Juan de Lucanas, quienes lo relegaron a vivir en la cocina con los pongos y sirvientes quechuas. Lejos de guardar rencor, Arguedas reconoció que la ternura, los cantos y la cosmovisión de los indios le salvaron la vida y moldearon su sensibilidad ética y poética: 'Yo soy un peruano que siente y canta en quechua y en castellano'.

        Del Indigenismo Tradicional al Neoindigenismo:
        A diferencia del indigenismo pintoresco, documental o sociológico de las primeras décadas del siglo XX, el Neoindigenismo arguediano se caracteriza por:
        1. Perspectiva desde el interior: El mundo andino no es un objeto folclórico externo, sino un universo vivo comprendido desde su propia espiritualidad mística y animista.
        2. Transculturación Narrativa (concepto acuñado por Ángel Rama): Arguedas crea una sintaxis poética española fecundada por el ritmo, la afectividad y los giros líricos de la lengua quechua.
        3. Dimensión mítica del conflicto: La lucha de clases y el gamonalismo se entrelazan con fuerzas cósmicas primordiales (los ríos, los cerros Apus, la música y el zumbayllu).
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Ernesto",
            rol = "Protagonista y narrador en primera persona (héroe lírico)",
            descripcion = "Adolescente mestizo cultural de 14 años; desdoblamiento del propio Arguedas. Hipersensible, solidario y profundamente arraigado a la cosmovisión andina animista; experimenta un dolor visceral ante la sordidez moral, la discriminación racial y la hipocresía del internado, encontrando su refugio en la naturaleza, el canto quechua y el zumbayllu."
        ),
        PersonajeLiterario(
            nombre = "Gabriel (El Padre)",
            rol = "Padre de Ernesto; abogado itinerante y desarraigado",
            descripcion = "Hombre errante, sentimental y bohemio que viaja sin descanso de pueblo en pueblo abriendo bufetes de provincia que fracasan. Traslada a su hijo por toda la sierra sur antes de dejarlo como pupilo en el internado de Abancay para buscar fortuna en la costa."
        ),
        PersonajeLiterario(
            nombre = "El «Viejo» (Don Manuel Jesús)",
            rol = "Gamonal del Cusco; arquetipo de la hipocresía y mezquindad señorial",
            descripcion = "Tío de Ernesto y dueño de cuatro inmensas haciendas. Pese a su inmensa riqueza, vive como un avaro miserable en una casona ruinosa, trata a sus sirvientes indios con crueldad inhumana y practica una religiosidad farisaica que despierta el repudio del niño."
        ),
        PersonajeLiterario(
            nombre = "Padre Linares",
            rol = "Director del internado religioso de Abancay",
            descripcion = "Sacerdote anciano de elocuencia oratoria deslumbrante, venerado casi como un santo en la comarca. No obstante, utiliza el terror al infierno y su influencia espiritual para legitimar el orden oligárquico de los hacendados y sofocar la revuelta de las chicheras."
        ),
        PersonajeLiterario(
            nombre = "Ántero («El Markask'a»)",
            rol = "Compañero de internado de Ernesto y portador del zumbayllu",
            descripcion = "Alumno de rostro marcado con un lunar (marka); enérgico, carismático y líder natural. Introduce el trompo prodigioso que purifica el colegio, pero con el tiempo asimila los prejuicios clasistas y lascivos de su casta terrateniente, distanciándose de Ernesto."
        ),
        PersonajeLiterario(
            nombre = "Doña Felipa",
            rol = "Líder popular de las chicheras de Huanupata",
            descripcion = "Mujer andina mestiza, valiente, corpulenta y de voz imponente. Encabeza el motín de la sal contra el acaparamiento de los terratenientes y reparte el mineral entre los pobres, convirtiéndose en el símbolo heroico de la justicia popular."
        ),
        PersonajeLiterario(
            nombre = "La Opa Marcelina",
            rol = "Sirvienta indígena del colegio y víctima expiatoria",
            descripcion = "Mujer demente, muda y desvalida que trabaja en las cocinas del internado. Convertida en objeto de acoso y ultraje sórdido por parte de los pupilos mayores, contrae la tifoidea y desata con su agonía el pánico colectivo a la peste."
        ),
        PersonajeLiterario(
            nombre = "Palacitos",
            rol = "El alumno más humilde del internado",
            descripcion = "Hijo de un campesino quechua modesto; sufre el desprecio y las burlas de los alumnos criollos y costeños, pero mantiene su inocencia y pureza moral gracias a la dignidad y amor de su padre."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Muro Incaico del Cusco y el Rechazo del Viejo",
            detalle = "Ernesto y su padre llegan al Cusco para buscar cobijo ante don Manuel Jesús ('el Viejo'), quien los rechaza con frialdad avarienta. En la noche cusqueña, Ernesto contempla con devoción sagrada el muro del palacio de Inca Roca: siente que las enormes piedras talladas están vivas, laten, respiran y susurran en quechua como un río eterno e indestructible frente a la mezquindad de los invasores."
        ),
        EscenaTrama(
            titulo = "La Soledad en el Internado y la Aparición del Zumbayllu",
            detalle = "El padre deja a Ernesto internado en el colegio religioso de Abancay. El muchacho se siente asfixiado por la agresividad, el racismo y la sordidez moral de sus compañeros mayores. El ambiente se purifica mágicamente cuando Ántero introduce el zumbayllu, un trompo de madera cuyo zumbido dulce opera para Ernesto como una máquina cósmica que aleja el mal y conecta su voz con su padre distante."
        ),
        EscenaTrama(
            titulo = "El Motín de la Sal y la Heroica Doña Felipa",
            detalle = "Los hacendados acaparan toda la sal traída de la costa para su ganado vacuno, privando de alimento a los pobres de Abancay. Doña Felipa lidera a las chicheras de Huanupata en un asalto justiciero al almacén y reparte la sal a los campesinos y colonos de Patibamba. Ernesto marcha junto a ellas cantando huaynos de rebelión, presenciando luego la feroz represión militar y el sermón condenatorio del Padre Linares."
        ),
        EscenaTrama(
            titulo = "La Muerte de la Opa Marcelina y el Estallido de la Peste",
            detalle = "La Opa Marcelina, sirvienta demente ultrajada en los establos por los pupilos lascivos, cae gravemente enferma de tifoidea exantemática y muere. El terror a la peste desata la histeria colectiva; los sacerdotes y las familias acomodadas huyen en carruajes, mientras los dormitorios del colegio quedan vacíos y pestilentes."
        ),
        EscenaTrama(
            titulo = "La Marcha de los Colonos y el Puente Purificador del Pachachaca",
            detalle = "Miles de colonos indígenas bajan de las haciendas en una multitudinaria y silenciosa procesión sobre Abancay, desafiando a las tropas para obligar al Padre Linares a rezar una misa que ahuyente el demonio de la peste. Ernesto abandona definitivamente el internado y cruza el puente sobre el río Pachachaca, seguro de que las aguas andinas arrastrarán la epidemia y el mal, purificando la tierra para los hombres libres."
        )
    ),
    temaPrincipal = "El desgarrador conflicto de identidad del mestizo cultural atrapado entre dos mundos antagónicos (el blanco-señorial y el quechua-comunal); la comunión mística y animista con la naturaleza andina; la purificación ética a través del arte y el zumbayllu; y la capacidad de resistencia rebelde del pueblo indígena frente a la opresión feudal.",
    simbolosClave = listOf(
        "El zumbayllu (trompo mágico): Objeto sagrado animista cuyo zumbido musical purifica el ambiente degradado del internado, vence la violencia y conecta espiritualmente a Ernesto con la naturaleza y con su padre ausente.",
        "El muro incaico del palacio de Inca Roca: Símbolo de la memoria ancestral, la resistencia milenaria y la vitalidad indestructible de la civilización andina, cuyas piedras vivas bullen y laten en la noche cusqueña.",
        "El río Pachachaca ('Puente sobre el mundo'): Torrente embravecido y sagrado que divide y conecta los dos universos; simboliza la catarsis cósmica y la purificación total que lavará la peste de la tifoidea y el pecado social hacia el mar.",
        "La sal acaparada: Emblema de la injusticia social y la codicia latifundista que antepone el engorde del ganado a la supervivencia de los campesinos desposeídos.",
        "La Opa Marcelina: Símbolo de la víctima propiciatoria y el sufrimiento mudo de la servidumbre indígena desvalida ultrajada por la degradación moral del mundo criollo.",
        "Las chicherías de Huanupata: Refugio popular andino donde se resguarda la música del pueblo (el huayno y el harawi), la lengua quechua y la llama de la solidaridad combativa."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Por qué el trompo denominado 'zumbayllu' posee un significado tan profundo para Ernesto?",
            respuesta = "Porque trasciende el valor de un juguete ordinario: es un instrumento animista y mágico cuyo canto agudo limpia la atmósfera enrarecida y pecaminosa del internado, actuando como un puente cósmico capaz de llevar sus pensamientos y mensajes de amor a su padre ausente."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál fue la causa socioeconómica de la rebelión de las chicheras de Huanupata liderada por doña Felipa?",
            respuesta = "El acaparamiento injusto y la escasez de la sal, acaparada por los terratenientes para alimentar al ganado vacuno de sus haciendas, privando de este recurso alimenticio esencial a los campesinos y a la población pobre de Abancay."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién introduce el zumbayllu en el colegio religioso de Abancay?",
            respuesta = "El alumno Ántero ('el Markask'a'), un muchacho de gran liderazgo e hijo de hacendado que entabla una profunda amistad con Ernesto antes de distanciarse por prejuicios de clase."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué buscan los miles de indios colonos que marchan masivamente sobre Abancay en el desenlace de la obra?",
            respuesta = "No vienen a saquear ni a tomar el poder militar; desafían las armas del ejército empujados por una fe desesperada para exigir que el Padre Linares oficie una misa solemne rogativa que bendiga sus almas y aleje a los demonios de la peste de tifoidea de sus comunidades."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué revela la contemplación del muro incaico por parte de Ernesto en el primer capítulo en el Cusco?",
            respuesta = "Revela la visión animista andina: para Ernesto las piedras del muro ciclópeo no son reliquias arqueológicas inertes, sino seres vivos y sagrados que bullen, respiran y se mueven como un río cósmico indestructible frente al tiempo y la opresión histórica."
        )
    )
)
