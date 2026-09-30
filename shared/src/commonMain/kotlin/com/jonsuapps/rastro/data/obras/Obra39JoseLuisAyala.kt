package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra39JoseLuisAyala = ObraLiteraria(
    id = "jose-luis-ayala",
    titulo = "Sinfonía al viento del altiplano / Wanq’uri",
    autor = "José Luis Ayala Olazával",    anio = "Siglo XX (1968 / 1988)",
    pais = "Perú (Puno)",
    corriente = "Poesía Andina y Aymara Contemporánea / Etnoliteratura y Crónica Histórica / Vanguardia Altiplánica Tardía",
    genero = "Lírico y Narrativo",
    especie = "Poesía cósmica aymara / Novela testimonial histórica",
    categoria = "Literatura Peruana",    colorHex = "#0284C7",
    sinopsis = """
        La producción literaria de José Luis Ayala Olazával (Huancané, Puno, 1942), 'La Voz Mayor del Altiplano Aymara', constituye el proyecto más ambicioso de descolonización, dignificación y rescate de la memoria oral, la lengua y la cosmovisión del pueblo aymara en la literatura peruana del siglo XX. Heredero de la vanguardia telúrica del Grupo Orkopata y Gamaliel Churata, Ayala amalgama la lírica cósmica con la crónica de resistencia frente al gamonalismo a través de sus obras cumbre:

        I. Sinfonía al Viento del Altiplano (1968): El viento gélido que azota las pampas de Huancané y las aguas sagradas del Lago Titicaca es el protagonista absoluto. No es un fenómeno meteorológico vacío: es la respiración cósmica del universo andino, la flauta de los Achachilas (ancestros tutelares) que arrastra la memoria de los comuneros degollados en las rebeliones agrarias, las canciones de cuna de las madres en las chozas de piedra y el silbido guerrero de las sikuris. El hombre aymara no teme a la intemperie: su cuerpo de bronce se funde con el viento en un himno de pertenencia sagrada a la Pachamama.

        II. Wanq’uri (1988) – La República de Wancho Lima: Novela histórica y testimonial que rescata la colosal rebelión aymara de 1923 en Huancané. Hartos de los abusos inenarrables de los terratenientes y jueces mistis —quienes despojaban las tierras comunales y prohibían aprender a leer y escribir bajo pena de amputar los pulgares—, los campesinos liderados por Carlos Condorena fundan su propia capital alternativa: la 'República de Wancho Lima'. Trazan calles rectas, abren escuelas rurales en lengua aymara y eligen sus propios cabildos. El Estado oligárquico responde con terror militar masacrando a miles de comuneros e incendiando la ciudadela. Wanq’uri ('el eco resonante que no se apaga') demuestra que el fuego de Wancho Lima pervive invicto en el alma del altiplano.

        III. Celebración del Cosmos (1998): Conjunto de cantos chamánicos donde codifica la ética del Jaqi (la persona íntegra y comunitaria), la concepción cíclica del tiempo andino (donde el pasado está adelante porque lo conocemos y el futuro atrás) y el respeto sagrado a la hoja de coca (kuka) como sacramento de salud y comunión con las estrellas.
    """.trimIndent(),
    contextoHistorico = """
        Nacido en Huancané (Puno), conocida como 'la tierra de las cholas bravas y de los poetas del viento', José Luis Ayala creció en el corazón geográfico y espiritual de la etnia aymara surandina.

        La Herida Histórica de Wancho Lima (1923):
        En 1923, Huancané fue escenario de una de las más heroicas y trágicas rebeliones indígenas del Perú republicano: la proclamación de la efímera República de Wancho Lima, brutalmente aplastada a sangre y fuego por los terratenientes locales y el ejército. Ayala transformó este hito silenciado en materia narrativa para devolver la dignidad a los mártires aymaras.

        La Etnoliteratura y la Filosofía del Jaqi:
        Poeta, cronista e investigador, Ayala desarrolló el concepto de 'etnoliteratura': escribir desde las entrañas del saber de los yatiris (sabios y chamanes aymaras), reivindicando la lógica trivalente de la lengua aymara frente a la razón positivista colonial.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Viento del Altiplano",
            rol = "Protagonista cósmico, aliento de los Achachilas y memoria",
            descripcion = "Fuerza telúrica sagrada que barre la meseta del Collao y el Lago Titicaca; custodia el dolor, los cantos de sikuris y la esperanza de justicia del pueblo aymara."
        ),
        PersonajeLiterario(
            nombre = "Carlos Condorena",
            rol = "Líder histórico y presidente de Wancho Lima",
            descripcion = "Caudillo campesino aymara que condujo la insurrección agraria de 1923 contra el gamonalismo en Huancané, fundando una república comunal con escuelas propias."
        ),
        PersonajeLiterario(
            nombre = "El Jaqi (El Ser Humano Aymara)",
            rol = "Sujeto ético y comunitario de la cosmovisión andina",
            descripcion = "Persona completa que no vive para el enriquecimiento egoísta, sino en reciprocidad armónica (Ayni) con su comunidad y con la Pachamama."
        ),
        PersonajeLiterario(
            nombre = "Los Yatiris y Chamanes de Huancané",
            rol = "Custodios de la sabiduría milenaria y del pago a la tierra",
            descripcion = "Sabios ancianos que leen los designios cósmicos en las hojas de coca y convocan a los espíritus de las montañas para proteger a su pueblo."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La Sinfonía Cósmica sobre el Titicaca",
            detalle = "El viento aúlla sobre las islas del lago sagrado y los pajonales de Huancané, entrelazando el silbido de las zampoñas con el llanto de los abuelos quechuas y aymaras."
        ),
        EscenaTrama(
            titulo = "El Despojo Feudal y la Asfixia Gamonal",
            detalle = "En 'Wanq’uri' se documenta la infamia de los hacendados que usurpan los pastizales y prohíben la educación campesina para someter a los indígenas al pongueaje."
        ),
        EscenaTrama(
            titulo = "La Proclamación de la República de Wancho Lima",
            detalle = "Los comuneros aymaras fundan su propia capital libertaria en Huancané, levantando escuelas vernáculas y nombrando jueces y cabildos indígenas independientes."
        ),
        EscenaTrama(
            titulo = "La Masacre a Fuego y el Incendio de la Ciudadela",
            detalle = "Tropas del ejército y guardias gamonales fusilan a miles de campesinos tiñendo de sangre las aguas del río Huancané, sembrando el luto en el Altiplano."
        ),
        EscenaTrama(
            titulo = "El Resurgir del Eco Inextinguible ('Wanq’uri')",
            detalle = "A pesar de la carnicería militar, la memoria de Wancho Lima se transmuta en mito y palabra poética indestructible que anuncia la futura liberación del Collao."
        )
    ),
    temaPrincipal = "La descolonización cultural y la afirmación ontológica de la lengua y cosmovisión aymara; la epopeya libertaria y la masacre de la República de Wancho Lima (1923); el viento altiplánico como archivo cósmico de la resistencia indígena; y la ética comunitaria del Jaqi frente al individualismo capitalista.",
    simbolosClave = listOf(
        "El viento del altiplano: Aliento espiritual de los Achachilas y vehículo de la memoria histórica comunitaria.",
        "Wancho Lima: La capital mítica de la libertad y la educación aymara frente al feudalismo gamonal.",
        "El Lago Titicaca: Matriz sagrada y mar interior que ampara la resistencia cultural de los pueblos del Collao.",
        "La hoja de coca (kuka): Sacramento ancestral de salud, adivinación cósmica y diálogo místico con los dioses.",
        "El concepto de Jaqi: La plenitud ética del hombre andino que vive en reciprocidad comunitaria (Ayni).",
        "Wanq'uri: El eco sonoro que resuena a través de los siglos impidiendo el olvido de los mártires campesinos."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿De qué provincia andina es oriundo José Luis Ayala y a qué cultura consagró su obra?",
            respuesta = "Es originario de la provincia de Huancané, en el departamento de Puno, y consagró la totalidad de su proyecto literario a la cultura y lengua aymara."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué importante hito de la resistencia campesina del siglo XX relata en su novela 'Wanq’uri'?",
            respuesta = "Relata la proclamación de la efímera República de Wancho Lima (Huancané, 1923), fundada por comuneros aymaras contra el gamonalismo y brutalmente masacrada por las fuerzas armadas."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es su poemario lírico fundamental publicado en 1968?",
            respuesta = "Su poemario más célebre es 'Sinfonía al viento del altiplano' (1968), donde el viento de la puna opera como metáfora de la memoria y la resistencia andina."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué significado tiene el concepto aymara de 'Jaqi' en la filosofía de Ayala?",
            respuesta = "Alude a la persona humana íntegra y completa, cuya dignidad reside en vivir en armonía ética, solidaridad y reciprocidad comunitaria con sus semejantes y con la Madre Tierra."
        )
    )
)
