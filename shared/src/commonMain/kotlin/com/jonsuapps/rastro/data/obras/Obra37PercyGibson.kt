package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra37PercyGibson = ObraLiteraria(
    id = "percy-gibson-poesia",
    titulo = "Poesía modernista y nativista (Jornada heroica / Quipus)",
    autor = "Percy Gibson Möller",    anio = "Siglo XX (1916)",
    pais = "Perú (Arequipa)",
    corriente = "Modernismo Tardío / Posmodernismo Nativista y Regional / Grupo «El Aquelarre» de Arequipa",
    genero = "Lírico",
    especie = "Poesía nativista, cívica, parnasiana y descriptivo-telúrica",
    categoria = "Literatura Peruana",    colorHex = "#DC2626",
    sinopsis = """
        La producción lírica de Percy Gibson Möller (Arequipa, 1885 – México, 1960), 'El Poeta del Misti' y patriarca indiscutible del Nativismo mistiano, representa la síntesis más alta entre la orfebrería formal y el cromatismo modernista con la fuerza telúrica, la altivez cívica, la arquitectura de sillar blanco y el apego entrañable a la campiña tradicional arequipeña. Fundador e ideólogo del célebre Grupo 'El Aquelarre' (1916), Gibson superó el decadentismo exótico de salón para cantar al suelo natal a través de poemas cumbre:

        I. El Gallo: En la penumbra fría de la madrugada andina, sobre el tapial de piedra de una chacra, se yergue el gallo como un centinela sonoro con cresta encarnada y yelmo de fuego. Su canto desgarrador de bronce raja la niebla, despertando al campesino labriego e inaugurando la jornada fecunda. Lejos de ser un ave doméstica ordinaria, el gallo encarna la alegoría suprema de la virilidad, el trabajo madrugador y la indómita dignidad cívica del pueblo arequipeño.

        II. Elogio al Misti: Apoteosis lírica del volcán tutelar que domina la campiña de Paucarpata y Yanahuara. Gibson humaniza al coloso de piedra describiéndolo como un patriarca cósmico coronado de nieve pura en la cumbre que custodia una hoguera subterránea de lava ardiente. Esa dualidad telúrica —la serenidad blanca exterior y el fuego interior— define el alma rebelde de Arequipa: pacífica y hospitalaria en la concordia, pero volcánica e indomable ante la tiranía y en defensa de la libertad.

        III. El Sillar: Canto a la materia geológica con que alarifes y picapedreros tallaron iglesias, claustros y casonas de la Ciudad Blanca. El sillar no es roca inerte; es espuma volcánica petrificada por los siglos que respira, refracta la luz diáfana del mediodía y dota a la urbe de su resplandor blanco fosforescente frente al asedio de los terremotos.

        IV. Jornada Heroica (1916): Poemario épico-cívico donde Gibson exalta las hazañas cotidianas de los hombres de la tierra: los arrieros que cruzan los arenales del sur, los labriegos que domeñan las torrenteras del río Chili y los héroes de la gesta libertaria surandina (Mariano Melgar).

        V. Quipus (1918) y Cocorocó (1924): Composiciones donde fusiona la musicalidad precolombina y el humorismo campesino con la métrica parnasiana perfecta, consagrando la identidad cultural del sur andino en el canon literario hispanoamericano.
    """.trimIndent(),
    contextoHistorico = """
        En la Arequipa señorial de 1916, de manera simultánea al Movimiento Colónida de Abraham Valdelomar en Lima, un grupo de jóvenes intelectuales y poetas fundó el cenáculo 'El Aquelarre'.

        El Grupo 'El Aquelarre' (1916):
        Encabezado por Percy Gibson, Augusto Aguirre Morales, César Atahualpa Rodríguez y Belisario Calle, el grupo sacudió el conservadurismo clerical provinciano proclamando una literatura rebelde, libre y cosmopolita enraizada en el paisaje volcánico y en las chicherías campesinas de Yanahuara y Cayma.

        Hermandad con Valdelomar y Elogio de Colónida:
        Cuando Abraham Valdelomar visitó Arequipa en 1917, trabó una profunda amistad con Percy Gibson y proclamó entusiasmado: 'En Arequipa vive un gran señor del verso: Percy Gibson. Sus sonetos tienen la pureza arquitectónica del sillar y el fuego que duerme en el pecho del Misti. Nadie ha cantado a la tierra propia con tanta gallardía y música de bronce'.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Gallo de Bronce",
            rol = "Arquetipo de la virilidad campesina y la soberanía matinal",
            descripcion = "Centinela sobre el tapial de piedra que despierta a la campiña con su clarín de oro; simboliza el orgullo, el trabajo fecundo y la dignidad indomeñable del pueblo arequipeño."
        ),
        PersonajeLiterario(
            nombre = "El Volcán Misti",
            rol = "Dios tutelar, patriarca cósmico y símbolo moral",
            descripcion = "Centinela geológico de corona de nieve y entrañas de fuego; encarna el temperamento mistiano que aúna la nobleza serena en la paz con la rebeldía volcánica frente a la opresión."
        ),
        PersonajeLiterario(
            nombre = "El Sillar de Añashuayco",
            rol = "Materia prima mística y alma arquitectónica de la ciudad",
            descripcion = "Espuma volcánica petrificada que dota a Arequipa de su color albo de novia andina, resistiendo sismos y guardando la memoria viva de los picapedreros mestizos."
        ),
        PersonajeLiterario(
            nombre = "El Campesino Labriego",
            rol = "Sujeto heroico de la campiña tradicional",
            descripcion = "Trabajador de las andenerías de Paucarpata y Sachaca que desafía las torrenteras del Chili y labora de sol a sol en comunión con la tierra volcánica."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Clarín Matinal en 'El gallo'",
            detalle = "En lo alto del tapial de sillar de la chacra, el gallo irrumpe con cresta encendida y rompe la niebla fría del amanecer andino, llamando a los hombres al trabajo de la tierra."
        ),
        EscenaTrama(
            titulo = "La Coronación del Misti en 'Elogio al Misti'",
            detalle = "El poeta contempla el cono perfecto del volcán recortado en el azul diáfano, fundiendo la pureza de su nieve con el fuego de su cráter para definir el alma cívica de Arequipa."
        ),
        EscenaTrama(
            titulo = "La Plegaria de Piedra en 'El sillar'",
            detalle = "Se exalta el brillo luminoso y la porosidad de la toba volcánica que da forma a los arcos, templos y casonas coloniales de la ciudad, viva ante el paso de los siglos."
        ),
        EscenaTrama(
            titulo = "La Marcha Campestre en 'Jornada heroica'",
            detalle = "Se retrata la epopeya cotidiana de los arrieros y labriegos surandinos que cruzan valles y quebradas convirtiendo el esfuerzo físico en canto de dignidad."
        ),
        EscenaTrama(
            titulo = "El Soneto de las Cosechas en 'Quipus'",
            detalle = "Composiciones donde la memoria incaica de los nudos sagrados y el folclore rural se transfiguran en estrofas parnasianas de exquisita musicalidad."
        )
    ),
    temaPrincipal = "El nativismo poético y la exaltación del paisaje telúrico arequipeño; el Misti y el sillar como arquetipos de la identidad y rebeldía cívica regional; y la dignidad heroica del campesino y del gallo como clarín de laboriosidad y soberanía popular.",
    simbolosClave = listOf(
        "El gallo sobre el tapial: Emblema de la bravura, la virilidad y el orgullo campesino que desafía la oscuridad.",
        "El volcán Misti: Símbolo de la dualidad psicológica arequipeña: nieve serena por fuera y lava revolucionaria por dentro.",
        "La piedra de sillar: Metáfora de la blancura, nobleza y perdurabilidad de la cultura surandina frente a las tempestades.",
        "La campiña arequipeña (Yanahuara, Cayma, Paucarpata): Edén agrícola fértil donde conviven la tradición colonial y la raíz indígena.",
        "El río Chili: Torrente vital que fecunda el valle andino y baña las faldas de los volcanes sagrados.",
        "El clarín de oro: La voz poética rebelde y libre que despierta a la ciudadanía frente a la apatía y el olvido."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué grupo literario fundamental perteneció Percy Gibson y en qué año se fundó?",
            respuesta = "Fue miembro fundador e ideólogo del célebre Grupo «El Aquelarre» de Arequipa, fundado en 1916 junto a Augusto Aguirre Morales y César Atahualpa Rodríguez."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es el rasgo definitorio del Modernismo de Percy Gibson?",
            respuesta = "El Nativismo: aplicar la técnica formal y la riqueza cromática del modernismo y parnasianismo a la exaltación de la campiña, el paisaje volcánico, el sillar y las costumbres de Arequipa."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué animal protagoniza uno de sus poemas nativistas más celebrados en admisión?",
            respuesta = "El gallo (en el poema homónimo 'El gallo'), concebido como centinela sonoro de bronce y emblema de la laboriosidad campesina y la altivez arequipeña."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué significación simbólica tienen el Misti y el sillar en la obra de Gibson?",
            respuesta = "El sillar simboliza la blancura arquitectónica y la nobleza de la ciudad, mientras que el Misti encarna el carácter volcánico, rebelde y defensor de la libertad cívica de sus habitantes."
        )
    )
)
