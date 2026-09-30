package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra38KilkuWaraka = ObraLiteraria(
    id = "kilku-waraka",
    titulo = "Taki parwa (Lírica quechua)",
    autor = "Kilku Warak'a (Andrés Alencastre Gutiérrez)",    anio = "Siglo XX (1952)",
    pais = "Perú (Cusco)",
    corriente = "Poesía Quechua Contemporánea / Lírica Culta Indígena / Neoindigenismo Lírico",
    genero = "Lírico",
    especie = "Canto lírico quechua (Taki, Harawi, Haylli, Wanka)",
    categoria = "Literatura Peruana",    colorHex = "#047857",
    sinopsis = """
        Taki parwa (Cusco, 1952; 'Floración de cantos') es la obra fundacional de la lírica culta moderna en lengua quechua del siglo XX, creada por Andrés Alencastre Gutiérrez bajo el combativo seudónimo quechua de Kilku Warak'a ('Hondero de piedra sagrada'). Nacido en Langui, Canas (Cusco), Alencastre demostró que el Runa Simi no es un dialecto rústico, sino una lengua poética, filosófica y metafísica de infinita riqueza afectiva capaz de dialogar de igual a igual con las cumbres de la literatura universal, recibiendo el elogio consagratorio de José María Arguedas a través de poemas inmortales:

        I. Puma: En los riscos helados y desfiladeros de la cordillera de Canas, bajo la tempestad de nieve, el gran puma andino vigila la puna. Sus pupilas doradas cortan la noche; no lame la mano del patrón ni se deja encadenar. Encarna la soberanía, la dignidad y el coraje indómito del hombre andino que prefiere morir en el abismo antes que someterse al yugo feudal del gamonalismo.

        II. Kuntur (El Cóndor): El ave cósmica abre sus alas majestuosas sobre las cumbres sagradas y vuela sin mover una pluma rozando los astros del Hanan Pacha (cielo superior). Mensajero de los Apus y centinela de los secretos de los Incas, el cóndor contempla el sufrimiento de los comuneros en las quebradas y anuncia en su vuelo en círculos el retorno ineludible de la justicia y la dignidad andina (Pachacuti).

        III. Urpi (La Paloma): Retoma la tradición milenaria del harawi amoroso andino en su variante más pura y dolorosa. La palomita que vuela más allá de las montañas deja el nido frío; el amante desolado interroga a las flores de cantuta y a los arroyos de deshielo por la amada ausente en un canto de inmensa ternura y melancolía crepuscular.

        IV. Taki Parwa (Canto Agrario): Parwa alude a la espiga dorada del maíz cuando florece al sol. Kilku Warak'a entona un himno sagrado a la Pachamama (Madre Tierra), al trabajo colectivo y festivo de la minka, a los bueyes que abren los surcos de la ladera y a la chicha de jora espumosa que reconforta a los campesinos en el ciclo de siembra y siega.

        V. Yawar Para (Lluvia de Sangre, 1972): Elegía cósmica donde el poeta vierte el llanto por los mártires campesinos quechuas de la historia, reafirmando la fuerza inquebrantable de la lengua materna como trinchera de emancipación cultural.
    """.trimIndent(),
    contextoHistorico = """
        Nacido en la heroica provincia de Canas (Cusco) —cuna de la rebelión de José Gabriel Túpac Amaru II—, Andrés Alencastre Gutiérrez aprendió el quechua desde la infancia conviviendo con los pastores de Langui.

        El 'Hondero de la Palabra' y la Cátedra Universitaria:
        Graduado en la Universidad San Antonio Abad del Cusco, adoptó el seudónimo guerrero de 'Kilku Warak'a' para blandir la palabra poética como una honda (warak'a) contra el desprecio colonial y la discriminación que sufrían los quechuahablantes en el Perú republicano.

        La Consagración Histórica por José María Arguedas:
        En 1952, al publicar 'Taki parwa', José María Arguedas prologó y tradujo sus versos proclamando: 'Andrés Alencastre ha realizado un milagro: ha demostrado al mundo que nuestra amada lengua quechua está viva y es capaz de alcanzar la más alta poesía universal. Kilku Warak'a es el más grande poeta puro en lengua quechua desde la época de los Incas'.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Puma Andino",
            rol = "Arquetipo de la soberanía, la bravura y la resistencia",
            descripcion = "Señor de las cavernas y de la puna brava de Canas; con ojos de oro desafía al cazador y a las cadenas coloniales, encarnando la dignidad innegociable de la raza quechua."
        ),
        PersonajeLiterario(
            nombre = "El Kuntur (Cóndor Cósmico)",
            rol = "Mensajero de los Apus y centinela del Hanan Pacha",
            descripcion = "Ave sagrada que sobrevuela las tormentas vigilando la memoria del Tahuantinsuyo y anunciando el Pachacuti o gran vuelco de regeneración andina."
        ),
        PersonajeLiterario(
            nombre = "La Urpi (Palomita)",
            rol = "Emblema del amor ausente, la ternura y la queja lírica",
            descripcion = "Criatura entrañable del harawi andino que personifica el dolor del desarraigo afectivo y la nostalgia del amante en medio del paisaje de queñuales."
        ),
        PersonajeLiterario(
            nombre = "El Runa Campesino",
            rol = "Sujeto cósmico de la minka y adorador de la Pachamama",
            descripcion = "Comunero de Canas que ara la tierra con cantos rituales y celebra la floración de la espiga de maíz como sacramento de vida comunitaria."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Salto Soberano en 'Puma'",
            detalle = "Sobre las rocas escarpadas de la puna, el puma desafía la ventisca con ojos de fuego, proclamando que ningún hombre sobre la tierra podrá ponerle cadenas jamás."
        ),
        EscenaTrama(
            titulo = "El Vuelo Inmortal en 'Kuntur'",
            detalle = "El cóndor despliega sus alas de sombra sobre valles y ríos, uniendo el cielo de los antepasados con las quebradas donde sufren los pastores andinos."
        ),
        EscenaTrama(
            titulo = "La Elegía Amorosa en 'Urpi'",
            detalle = "El amante quechua llora junto a las retamas el vuelo de la paloma ingrata, fundiendo su soledad con el canto del viento en el crepúsculo de la cordillera."
        ),
        EscenaTrama(
            titulo = "La Fiesta de la Cosecha en 'Taki parwa'",
            detalle = "Comuneros y mujeres entonan cantos de haylli mientras las mazorcas doradas son recogidas de los maizales bajo la bendición solar de la Pachamama."
        ),
        EscenaTrama(
            titulo = "El Clamor Rebelde en 'Yawar para'",
            detalle = "Se canta el dolor de la sangre campesina derramada en las luchas agrarias del sur andino, afirmando la esperanza en el renacimiento de los pueblos quechuas."
        )
    ),
    temaPrincipal = "La reivindicación de la lengua quechua (Runa Simi) como idioma lírico y metafísico de jerarquía universal; la comunión sagrada con la Pachamama, los Apus y la fauna cósmica (el puma, el cóndor); y la afirmación de la libertad, dignidad y rebeldía del hombre andino frente a la opresión.",
    simbolosClave = listOf(
        "El puma: Símbolo de la altivez, la bravura indomeñable y el rechazo a la servidumbre feudal.",
        "El kuntur (cóndor): Emblema de la conexión cósmica entre el cielo sagrado y la tierra, y anuncio del Pachacuti.",
        "La urpi (paloma): La ternura infinita, la pureza y el sufrimiento del desamor en el harawi quechua.",
        "La espiga de maíz (parwa): Símbolo de la fecundidad agraria, la abundancia y la fiesta comunitaria del ayni.",
        "La warak'a (honda): El instrumento ancestral de combate convertido en metáfora de la poesía que defiende al pueblo.",
        "La lengua quechua (Runa Simi): La trinchera espiritual y matriz de pensamiento afectivo indestructible."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál era el nombre civil de Kilku Warak'a y de qué provincia cusqueña era originario?",
            respuesta = "Su nombre civil fue Andrés Alencastre Gutiérrez, originario del distrito de Langui, en la histórica provincia de Canas (Cusco)."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué trascendental poemario en lengua quechua publicó en 1952?",
            respuesta = "Publicó 'Taki parwa' ('Floración de cantos'), cumbre de la lírica culta moderna escrita íntegramente en quechua cusqueño imperial."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué intelectual y escritor peruano prologó y tradujo sus versos con los máximos elogios?",
            respuesta = "José María Arguedas, quien lo calificó como el más alto creador y poeta puro en lengua quechua que ha florecido en América desde la época de los Incas."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué simboliza el felino en su célebre poema 'Puma'?",
            respuesta = "Simboliza la soberanía, la dignidad innegociable y la resistencia indómita del hombre andino frente a las cadenas del gamonalismo y la servidumbre."
        )
    )
)
