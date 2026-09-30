package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra30ElPuebloDelSol = ObraLiteraria(
    id = "el-pueblo-del-sol",
    titulo = "El pueblo del Sol",
    autor = "Augusto Aguirre Morales",    anio = "Siglo XX (1924)",
    pais = "Perú",
    corriente = "Modernismo Tardío / Novela Histórica Indigenista / Grupo «El Aquelarre» de Arequipa",
    genero = "Narrativo",
    especie = "Novela histórica monumental",
    categoria = "Literatura Peruana",    colorHex = "#EAB308",
    sinopsis = """
        El pueblo del Sol (1924) es la obra cumbre del escritor arequipeño Augusto Aguirre Morales, figura consular del Grupo 'El Aquelarre'. Galardonada con el Primer Premio en el Concurso de la Municipalidad de Lima con motivo del Centenario de la Batalla de Ayacucho, la novela rompe radicalmente con la visión pastoral y edulcorada del Tahuantinsuyo transmitida por el Inca Garcilaso de la Vega, reconstruyendo el Imperio de los Incas con suntuosa prosa modernista y rigor arqueológico como una civilización monumental, trágica y compleja:

        I. El Esplendor del Coricancha y la Tensión de los Poderes: La acción se sitúa en el apogeo del Tahuantinsuyo. El Cusco amanece iluminado por el Padre Sol (Inti), revelando la magnificencia ciclópea de la capital: muros de piedra andesita pulida, planchas de oro macizo en el Coricancha y jardines mágicos donde mazorcas, vicuñas y mariposas están forjadas en oro y plata pura. Sin embargo, tras la fachada del orden perfecto late una feroz lucha de castas: el Sumo Sacerdote Willac Umu conspira para subordinar el Estado a los oráculos sagrados y sacrificios, mientras la casta militar, liderada por el joven príncipe Auqui Túpac, desciende de las conquistas fronterizas despreciando la intriga sacerdotal. El Sapa Inca mantiene el equilibrio con autoridad absoluta desde su ushnu de oro.

        II. Las Campañas Bélicas y el Destierro de los Mitimaes: Ante la rebelión de tribus del norte, el Inca convoca a cien mil guerreros en Sacsayhuamán. La campaña militar es descrita con un realismo épico crudo: lluvia de dardos incendiarios, asaltos a fortalezas y combate cuerpo a cuerpo con macanas de obsidiana. Tras la victoria, los cabecillas rebeldes son desollados para fabricar tambores de guerra (taquis). Para consolidar la pacificación, el Inca aplica la ley geopolítica más severa: naciones enteras son arrancadas de sus valles natales y deportadas a tierras inhóspitas como mitimaes, tejiendo un dolor sordo y un resentimiento subterráneo en los confines del imperio.

        III. El Acllahuasi y la Pasión Trágica Prohibida: En el recinto sagrado de las Vírgenes del Sol (Acllahuasi) vive recluida la hermosa princesa Chuquillanto, consagrada a la castidad ritual. Durante las festividades triunfales del Inti Raymi en Huacaypata, Chuquillanto cruza su mirada con el general victorioso Auqui Túpac, naciendo un amor irresistible. Desafiando la ley imperial de bronce —que castiga el sacrilegio enterrando vivos a los transgresores y arrasando su pueblo—, Auqui Túpac penetra en el claustro en la noche del solsticio y consuma su pasión en medio de los jardines de cantutas.

        IV. El Juicio Teocrático, el Sacrificio y la Profecía Apocalíptica: Los espías del Willac Umu descubren la transgresión y exigen la pena capital para humillar a los militares. El Sapa Inca, desgarrado entre el amor por su hijo y la razón de Estado teocrática, ratifica la sentencia de muerte. Los amantes son conducidos a las cumbres de la pampa de Anta y sepultados vivos en una caverna sellada con ciclópeos bloques de piedra, proclamando su amor eterno sobre las leyes del poder. La novela culmina con un eclipse solar, la caída de un cóndor muerto y la profecía aterradora de los sacerdotes: hombres barbados del mar con bestias de hierro quebrarán el cetro cusqueño y reducirán a cenizas el Imperio del Sol.
    """.trimIndent(),
    contextoHistorico = """
        Publicada en 1924 durante el gobierno de Augusto B. Leguía con motivo del Centenario de la Batalla de Ayacucho, 'El pueblo del Sol' representa la cumbre de la novela histórica indigenista en el sur del Perú.

        El Grupo «El Aquelarre» de Arequipa (1916):
        Augusto Aguirre Morales fundó y lideró en Arequipa el influyente grupo literario 'El Aquelarre', junto a grandes creadores como Percy Gibson, César Atahualpa Rodríguez y Belisario Calle. El movimiento representó una insurrección estética contra el costumbrismo decimonónico y la sensiblería romántica, buscando forjar una vanguardia mestiza orgullosa de la historia andina y nutrida de la fuerza formal del modernismo.

        Desmitificación del Inca Garcilaso de la Vega:
        La novela asume una postura historiográfica revolucionaria frente a los 'Comentarios Reales': Aguirre Morales refutó la imagen arcádica y cristiana del incario garcilasista, basando su reconstrucción en cronistas toledanos de visión cruda y realista (como Pedro Cieza de León, Juan de Betanzos y Pedro Sarmiento de Gamboa), exponiendo la ferocidad de la guerra incaica, el despotismo teocrático y el sufrimiento de los pueblos deportados (mitimaes).
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Sapa Inca",
            rol = "Soberano absoluto, hijo viviente del Inti y árbitro imperial",
            descripcion = "Monarca de majestuosidad sobrehumana; personifica la ley inflexible del imperio. Pese al dolor paternal, subordina sus sentimientos y condena a muerte a su hijo Auqui Túpac para preservar la cohesión teocrática y el orden sagrado del Tahuantinsuyo."
        ),
        PersonajeLiterario(
            nombre = "Auqui Túpac",
            rol = "Príncipe guerrero, general del ejército y héroe trágico",
            descripcion = "Joven comandante victorioso de las campañas del norte; encarna la gloria de la casta militar. Desafía el código sagrado del Acllahuasi al enamorarse de Chuquillanto y asume con dignidad heroica la condena de ser sepultado vivo."
        ),
        PersonajeLiterario(
            nombre = "Chuquillanto",
            rol = "Princesa sagrada, aclla del Sol y víctima trágica",
            descripcion = "Doncella de belleza hierática recluida en el Acllahuasi; prefiere entregarse al amor humano de Auqui Túpac antes que someterse a la fría castidad del claustro, afrontando su destino fatal en la fosa de piedra."
        ),
        PersonajeLiterario(
            nombre = "Willac Umu",
            rol = "Sumo Sacerdote del Coricancha y antagonista político",
            descripcion = "Anciano hierático y estratega eclesiástico del culto al Sol; utiliza la falta de los amantes como arma política para subordinar a los generales victoriosos al poder de la casta sacerdotal."
        ),
        PersonajeLiterario(
            nombre = "Los Mitimaes",
            rol = "Símbolo colectivo de los pueblos conquistados y deportados",
            descripcion = "Poblaciones enteras desarraigadas a la fuerza de sus tierras ancestrales para poblar fronteras hostiles; encarnan la llaga abierta y el resentimiento acumulado contra el absolutismo cusqueño."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Amanecer Dorado del Cusco y la Disputa de Castas",
            detalle = "El Sol ilumina las murallas de piedra y el oro deslumbrante del Coricancha. Tras el esplendor teocrático, se libra una pugna sorda entre la casta sacerdotal del Willac Umu y los generales del ejército encabezados por el príncipe Auqui Túpac, bajo la mirada inflexible del Sapa Inca."
        ),
        EscenaTrama(
            titulo = "La Guerra en el Norte y la Ferocidad de las Conquistas",
            detalle = "Auqui Túpac lidera cien mil guerreros desde Sacsayhuamán para sofocar una rebelión fronteriza. La batalla es descrita con crudeza épica: macanas, hondas y hachas chocan en combate cuerpo a cuerpo. Los jefes rebeldes son convertidos en tambores de guerra y sus pueblos deportados como mitimaes."
        ),
        EscenaTrama(
            titulo = "El Desafío al Claustro Sagrado del Acllahuasi",
            detalle = "Durante las celebraciones del Inti Raymi, Auqui Túpac y la doncella consagrada Chuquillanto se enamoran fulminantemente. En la noche del solsticio, el príncipe penetra en el recinto sagrado y consuma su pasión prohibida, desafiando la pena de muerte implacable del imperio."
        ),
        EscenaTrama(
            titulo = "El Juicio del Sapa Inca y el Sacrificio en la Caverna",
            detalle = "Willac Umu delata la transgresión sacrílega y el Sapa Inca, anteponiendo la razón de Estado al amor de padre, ratifica la sentencia capital. Chuquillanto y Auqui Túpac son sepultados vivos en una cueva de piedra en las cumbres de Anta, sellando su amor en la inmortalidad."
        ),
        EscenaTrama(
            titulo = "El Presagio Apocalíptico y el Crepúsculo del Sol",
            detalle = "La novela concluye con un eclipse solar en Sacsayhuamán y la caída de un cóndor muerto. Los sacerdotes leen en las entrañas de las llamas el vaticinio del colapso: hombres barbados del mar quebrarán el imperio y arrasarán el culto al Sol, clausurando la época de oro del Tahuantinsuyo."
        )
    ),
    temaPrincipal = "La desmitificación histórica del Tahuantinsuyo como un imperio teocrático y militarista monumental atravesado por luchas de poder y opresión geopolítica; y la trágica derrota de la libertad y el amor individual frente a la razón de Estado y la rigidez de las leyes religiosas imperiales.",
    simbolosClave = listOf(
        "El Sol (Inti): Deidad solar de fuego implacable que exige sacrificios y disciplina absoluta, metáfora del poder devorador del Estado incaico.",
        "El Coricancha de oro: Símbolo del poder espiritual, la riqueza suntuosa y la perfección arquitectónica alcanzada por el Tahuantinsuyo.",
        "El tambor de piel humana (taqui): Emblema de la ferocidad militar y el terror disuasorio que la élite cusqueña aplicaba a los pueblos rebeldes.",
        "Los mitimaes: Metáfora del desarraigo impuesto por la geopolítica expansionista que sembró el rencor interno en el imperio.",
        "La caverna sellada con piedras ciclópeas: Monumento al sacrificio de los amantes y a la aniquilación del individuo bajo las leyes de bronce del claustro sagrado.",
        "El cóndor caído y el eclipse: Presagios cósmicos de la catástrofe histórica y el advenimiento de la invasión española."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué grupo literario arequipeño perteneció Augusto Aguirre Morales y qué ruptura estética propuso?",
            respuesta = "Perteneció al célebre Grupo 'El Aquelarre' de Arequipa (1916). Rompió con el costumbrismo tradicional y el sentimentalismo romántico mediante una prosa modernista suntuosa y una reinterpretación histórica rigurosa y monumental del pasado andino."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué se diferencia la visión del Tahuantinsuyo de 'El pueblo del Sol' de la de los 'Comentarios Reales' de Garcilaso?",
            respuesta = "Garcilaso idealizó el imperio incaico como un paraíso armónico, comunista y providencial preparatorio del cristianismo; Aguirre Morales desmitifica esta visión apoyándose en cronistas toledanos, mostrando un imperio teocrático y militarista, con sangrientas guerras de conquista, tensiones de castas y el drama de los pueblos desterrados (mitimaes)."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es el conflicto central que sella el destino trágico de Auqui Túpac y Chuquillanto?",
            respuesta = "Su amor transgresor: Chuquillanto era una doncella sagrada del Acllahuasi consagrada al Sol; al romper el voto de castidad con el general Auqui Túpac, desafían la ley imperial y son condenados a morir sepultados vivos en una caverna de piedra por mandato del Sapa Inca."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué premio literario consagró a 'El pueblo del Sol' en 1924?",
            respuesta = "Obtuvo el Primer Premio en el Concurso de la Municipalidad de Lima convocado con motivo de las celebraciones por el Centenario de la Batalla de Ayacucho."
        )
    )
)
