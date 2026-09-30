package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra40Ollantay = ObraLiteraria(
    id = "ollantay",
    titulo = "Ollantay",
    autor = "Anónimo (Manuscrito del cura Antonio Valdés)",    anio = "Siglo XVIII (1770 / Origen incaico oral)",
    pais = "Perú",
    corriente = "Teatro Quechua Colonial / Clásico Dramático Andino",
    genero = "Dramático",
    especie = "Drama heroico en verso (tres actos)",
    categoria = "Literatura Peruana",    colorHex = "#D97706",
    sinopsis = """
        Ollantay (Cusco, siglo XVIII; atribuido al cura Antonio Valdés hacia 1770) es la obra cumbre del teatro quechua prehispánico y virreinal. Articulada en tres actos de métrica octosílaba, el drama escenifica el conflicto irreconciliable entre la pasión amorosa y la rígida jerarquía estamental del Tahuantinsuyo, así como la transición del poder autoritario e implacable hacia la magnanimidad imperial:

        Acto I. La Demanda de Amor y el Destierro: Ollantay, invicto y glorioso general de origen plebeyo (Antisuyo) elevado a la nobleza de privilegio por sus hazañas bélicas, confiesa al sacerdote supremo Willac Umu su amor clandestino por la princesa Cusi Coyllur ('Estrella alegre'), hija predilecta del Sapa Inca Pachacútec. Desoyendo los augurios de muerte, Ollantay se arrodilla ante Pachacútec pidiendo la mano de la doncella. El emperador estalla en cólera recordándole su origen plebeyo: '¡Recuerda que eres un siervo y quédate en tu lugar!'. Cusi Coyllur es encerrada en los calabozos subterráneos del Acllahuasi (casa de las escogidas), donde da a luz en secreto a su hija Ima Súmac. Despechado y herido en su honor, Ollantay se subleva jurando marchar sobre el Cusco y arrancar los muros imperiales.

        Acto II. La Rebelión de Ollantaytambo y la Farsa de Rumiñahui: Ollantay se fortifica en la imponente fortaleza de Ollantaytambo, siendo proclamado Inca del Antisuyo por sus tropas leales. Pachacútec envía al general Rumiñahui ('Ojo de Piedra') a sofocar la rebelión, pero el ejército imperial es aniquilado en una emboscada en las gargantas andinas. Años más tarde, muere Pachacútec y asume el trono su joven y noble hijo Túpac Yupanqui. Para lavar su deshonra militar, Rumiñahui urde una estratagema maquiavélica: se corta el rostro a cuchilladas y se presenta ensangrentado en Ollantaytambo fingiendo haber sido torturado por el nuevo Inca. Conmovido por su desgracia, Ollantay le brinda asilo y lo designa general de honor. Durante la noche sagrada de la fiesta del Inti Raymi, cuando los rebeldes yacen embriagados, Rumiñahui abre las puertas de la fortaleza al ejército imperial, capturando a Ollantay, Orco Huaranca y a todos sus lugartenientes encadenados.

        Acto III. El Juicio, la Piedad Imperial y el Reencuentro: Los rebeldes son conducidos ante el trono de Túpac Yupanqui en el Cusco para ser ejecutados. El tribunal militar y el sacerdote Willac Umu aconsejan degollarlos por traición a la patria. Sin embargo, Túpac Yupanqui, guiado por la magnanimidad y la razón de Estado, sorprende a todos: no solo perdona la vida a Ollantay, sino que le restituye su rango y lo nombra regente del Imperio. En ese instante irrumpe en el palacio la pequeña doncella Ima Súmac implorando piedad para una mujer sepultada viva en una caverna oscura del Acllahuasi. El Inca y Ollantay acuden al calabozo y descubren a Cusi Coyllur encadenada, demacrada y ciega por la penumbra. Se produce la emotiva anagnórisis familiar: Ollantay rescata a su amada esposa, Túpac Yupanqui bendice su unión matrimonial y la armonía civil renace sobre el Tahuantinsuyo.
    """.trimIndent(),
    contextoHistorico = """
        El texto original fue preservado en quechua hacia 1770 por el cura Antonio Valdés en Sicuani (Cusco).

        Las Tres Tesis sobre el Origen del Drama:
        1. Tesis Incanista (Prehispánica): Sostenida por Sebastián Barranca, Gavino Pacheco Zegarra y José María Arguedas, afirma que el argumento, los personajes y los coros son de origen quechua precolombino transmitidos por tradición oral.
        2. Tesis Hispanista: Plantea que fue compuesto íntegramente por un dramaturgo colonial español (como Antonio Valdés) siguiendo las reglas del teatro del Siglo de Oro (presencia del gracioso, división en tres jornadas y rima consonante).
        3. Tesis Ecléctica / Mixta (Mayoritaria): Defendida por José de la Riva-Agüero y Luis Alberto Sánchez, sostiene que el drama posee un núcleo mítico e histórico incaico genuino que fue adaptado formalmente durante el siglo XVIII al molde del teatro clásico español.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Ollantay",
            rol = "General invicto del Antisuyo y rebelde por amor",
            descripcion = "Guerrero valiente de nobleza de privilegio que desafía el orden estamental incaico por su pasión hacia la princesa solar Cusi Coyllur; funda su bastión en Ollantaytambo."
        ),
        PersonajeLiterario(
            nombre = "Cusi Coyllur ('Estrella alegre')",
            rol = "Princesa solar y madre sufriente",
            descripcion = "Hija de Pachacútec y amante clandestina de Ollantay; sufre diez años de encarcelamiento en las mazmorras del Acllahuasi donde amamanta en secreto a su hija Ima Súmac."
        ),
        PersonajeLiterario(
            nombre = "Pachacútec",
            rol = "Sapa Inca inflexible y arquetipo del absolutismo",
            descripcion = "Gobernante autoritario que antepone la ley de castas y la pureza solar a los sentimientos humanos, desterrando a Ollantay y sepultando a su propia hija."
        ),
        PersonajeLiterario(
            nombre = "Túpac Yupanqui",
            rol = "Nuevo Sapa Inca y gobernante magnánimo",
            descripcion = "Hijo y sucesor de Pachacútec; encarna la piedad, la clemencia y la sabiduría política conciliadora, perdonando a los insurrectos y uniendo a los amantes."
        ),
        PersonajeLiterario(
            nombre = "Rumiñahui ('Ojo de Piedra')",
            rol = "General cusqueño y maestro de la estratagema",
            descripcion = "Militar astuto y rencoroso derrotado por Ollantay; logra la victoria mediante el engaño de la autoflagelación abriendo las puertas de Ollantaytambo en noche de fiesta."
        ),
        PersonajeLiterario(
            nombre = "Piqui Chaqui ('Pie ligero')",
            rol = "Criado leal de Ollantay y bufón cómico",
            descripcion = "Cumple el rol clásico del 'gracioso' del teatro del Siglo de Oro, introduciendo el humor, la ironía y el miedo cobarde frente a la solemnidad trágica."
        ),
        PersonajeLiterario(
            nombre = "Ima Súmac ('¡Qué bella!')",
            rol = "Hija de Ollantay y Cusi Coyllur",
            descripcion = "Niña que descubre a su madre moribunda en los sótanos del Acllahuasi e implora la piedad de Túpac Yupanqui, haciendo posible el desenlace feliz."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La Confesión a Willac Umu y la Furia de Pachacútec",
            detalle = "Ollantay pide la mano de Cusi Coyllur al Inca; Pachacútec lo humilla por su origen plebeyo y ordena encerrar a la princesa en el Acllahuasi, desatando la insurrección."
        ),
        EscenaTrama(
            titulo = "La Coronación en Ollantaytambo y la Batalla de la Quebrada",
            detalle = "Ollantay es aclamado rey del Antisuyo y aniquila al ejército de Rumiñahui en los desfiladeros de la cordillera, resistiendo diez años la soberanía del Cusco."
        ),
        EscenaTrama(
            titulo = "La Traición y Autoflagelación de Rumiñahui",
            detalle = "Rumiñahui se mutila el rostro y finge haber sido desterrado por el nuevo Inca; Ollantay le abre las puertas y Rumiñahui emboscada a los rebeldes en pleno Inti Raymi."
        ),
        EscenaTrama(
            titulo = "El Juicio en el Cusco y la Magnanimidad Imperial",
            detalle = "Túpac Yupanqui rechaza la pena de muerte y ejerce la clemencia real: perdona a Ollantay, le restituye sus tropas y lo designa segundo regente del Imperio."
        ),
        EscenaTrama(
            titulo = "El Rescate de Cusi Coyllur en las Mazmorras",
            detalle = "Guiados por la pequeña Ima Súmac, el Inca y Ollantay descienden a las tinieblas del Acllahuasi, rescatando a la princesa y sellando la concordia familiar y política."
        )
    ),
    temaPrincipal = "El conflicto entre el amor individual y la rígida estratificación social del Imperio de los Incas; la rebelión del honor militar contra el autoritarismo absolutista; y la transición política hacia la clemencia, el perdón y la reconciliación nacional encarnada por Túpac Yupanqui.",
    simbolosClave = listOf(
        "Ollantaytambo: Bastión de la resistencia, la dignidad militar y el desafío a las leyes estamentales injustas.",
        "El Acllahuasi: Casa sagrada de las vírgenes del Sol convertida en prisión oscura del amor proscrito.",
        "La cadena de oro: Símbolo del perdón imperial y la reintegración comunitaria concedida por Túpac Yupanqui.",
        "El yaraví andino: Canto elegíaco de amor quechua entonado en la trama que preludia la tragedia de la separación.",
        "El gracioso Piqui Chaqui: Puente cómico y popular que humaniza el conflicto y encarna la picardía andina.",
        "Ima Súmac: La inocencia y la luz que revela la verdad sepultada por el rencor autoritario."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Por qué prohíbe el emperador Pachacútec el matrimonio entre Ollantay y Cusi Coyllur?",
            respuesta = "Porque Ollantay pertenecía a la nobleza de privilegio (plebeyo ascendido por méritos bélicos) y no a la realeza de sangre solar del Cusco, infringiendo las rígidas normas estamentales incaicas."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuáles son las tres tesis sobre el origen del drama 'Ollantay'?",
            respuesta = "La tesis incanista (origen puramente prehispánico oral), la tesis hispanista (creación colonial española de Antonio Valdés) y la tesis ecléctica (núcleo argumental incaico con estructura dramática del Siglo de Oro español)."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo logra el general Rumiñahui capturar a Ollantay tras diez años de rebelión?",
            respuesta = "Se autoflagela el rostro simulando haber sido castigado por Túpac Yupanqui; al ganarse la piedad de Ollantay, abre las puertas de Ollantaytambo al ejército imperial durante la embriaguez del Inti Raymi."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué decisión política adopta el nuevo Sapa Inca Túpac Yupanqui al final del drama?",
            respuesta = "Ejerce la magnanimidad y clemencia: perdona la vida a los rebeldes, ratifica a Ollantay como jefe supremo militar y bendice su matrimonio con su hermana Cusi Coyllur."
        )
    )
)
