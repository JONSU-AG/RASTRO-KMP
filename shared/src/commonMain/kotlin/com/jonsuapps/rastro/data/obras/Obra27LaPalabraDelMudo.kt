package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra27LaPalabraDelMudo = ObraLiteraria(
    id = "la-palabra-del-mudo",
    titulo = "La palabra del mudo",
    autor = "Julio Ramón Ribeyro",    anio = "Siglo XX (1955 / 1973)",
    pais = "Perú",
    corriente = "Generación del 50 (Narrativa Urbana / Neorrealismo Peruano)",
    genero = "Narrativo",
    especie = "Cuento urbano y de la marginalidad social / Relato neorrealista",
    categoria = "Literatura Peruana",    colorHex = "#475569",
    sinopsis = """
        La palabra del mudo es el título general que Julio Ramón Ribeyro otorgó a la recopilación definitiva de sus cuentos completos (publicada desde 1973 y ampliada hasta reunir cerca de un centenar de relatos). En su célebre prólogo fundacional, el autor define su poética: 'Dar voz a aquellos seres que en la vida cotidiana están privados de ella: a los marginados, a los olvidados, a los condenados a una existencia sin sintonía ni gloria, a los mudos de la historia'. A través de un estilo clásico, lineal y de ironía escéptica teñida de ternura compasiva, Ribeyro retrata la frustración del antihéroe limeño y las tragedias de la urbe moderna a través de sus cuentos cumbre:

        I. Los Gallinazos sin Plumas (1955): En un corralón inmundo de Lima, el tiránico abuelo don Santos, anciano cojo con pata de palo, obliga a sus dos pequeños nietos huérfanos, Efraín y Enrique, a madrugar descalzos para recolectar basura descompuesta en los muladares y acantilados de Miraflores con el fin de cebar al insaciable cerdo Pascual. Efraín se corta la planta del pie con un vidrio infectado; luego Enrique contrae una severa neumonía. Furioso al no tener comida para su animal, don Santos arroja vivo al chiquero a Pedro, un perro callejero recogido por los niños. Al descubrir a Pascual devorando los restos de su mascota, Enrique increpa a su abuelo; durante el forcejeo, la pata de palo del anciano resbala y cae de espaldas dentro del chiquero ante las fauces del hambriento animal. Enrique carga a su hermano enfermo en hombros y ambos huyen del corralón mientras Lima bosteza abriendo sus fauces de niebla y cemento.

        II. Alienación (1975): Roberto López, un muchacho zambo y humilde de Miraflores, es despreciado brutalmente por Queca, la muchacha blanca del barrio: '¡Yo no juego con zambos!'. Traumado por el rechazo racial, Roberto inicia una dolorosa mutación para des-zambarse: se alisa y tiñe el pelo de rubio, se blanquea la cara con talco de arroz, aprende inglés con acento masticado, adopta modales de vaquero y se hace llamar 'Bob López'. Para obtener la ciudadanía estadounidense, emigra a Nueva York y se enrola voluntariamente en el ejército de los Estados Unidos. Enviado a combatir en la Guerra de Vietnam, Bob López muere destrozado por una granada enemiga en un pantano asiático sin haber conseguido jamás su ansiada ciudadanía americana.

        III. Al Pie del Acantilado (1959): El anciano provinciano Leandro y sus hijos Pepe y Toribio, expulsados de los callejones de Lima, levantan con sus propias manos una casita de caña y tablas sobre las piedras inhóspitas al pie del acantilado de la Costa Verde. Con trabajo homérico, transforman el pedregal en un vergel costero y forman una barriada de pescadores. Sin embargo, la fatalidad los cerca: Pepe muere atropellado y Toribio cae preso. Finalmente, los buldóceres de la municipalidad demuelen la barriada para construir una autopista turística. Leandro, con dignidad estoica, toma su pico y su pala al hombro y camina por la playa solitaria rumbo a otro acantilado más lejano para volver a empezar desde la nada.

        IV. Silvio en el Rosedal (1977): Silvio Lombardi hereda la hacienda Ocopilla en la sierra central y se obsesiona con un laberíntico rosedal plantado por su tío difunto. Convencido de que los senderos esconden un mensaje cabalístico supremo sobre el cosmos, pasa meses midiendo y trazando mapas hasta creer leer la palabra 'RES' (cosa/materia). Una plaga de pulgones marchita las flores y las deudas agrícolas disuelven su delirio místico, llevándolo a la serena aceptación de la belleza efímera y la vida cotidiana.

        V. La Insignia (1952): Un hombre común halla en el malecón una pequeña insignia metálica en forma de pez plateado y se la prende en la solapa. De inmediato, transeúntes y mozos lo tratan con reverencia y es reclutado por una enigmática sociedad secreta internacional. El protagonista asciende sumisamente cumpliendo órdenes absurdas (contar palomas, escribir listas con la letra K) hasta convertirse en el todopoderoso presidente de la organización con una insignia de oro, sin haber descubierto jamás qué significaba ni a qué se dedicaban.
    """.trimIndent(),
    contextoHistorico = """
        Publicada a partir de 1973 por la Editorial Milla Batres, 'La palabra del mudo' representa el cenit del cuento hispanoamericano contemporáneo y consagró a Julio Ramón Ribeyro con el prestigioso Premio de Literatura Latinoamericana y del Caribe Juan Rulfo en 1994.

        La Gran Mutación Urbana y la Generación del 50:
        A partir de 1950, durante el gobierno de Manuel A. Odría, el Perú experimentó la mayor sacudida demográfica de su historia republicana: oleadas masivas de migrantes andinos bajaron a Lima buscando educación y futuro, rompiendo la estructura señorial tradicional y levantando las primeras barriadas y pueblos jóvenes sobre los arenales. La literatura peruana abandonó el indigenismo rural y el criollismo costumbrista para enfocarse en la ciudad moderna como escenario dramático, surgiendo la Generación del 50 (Ribeyro, Enrique Congrains, Carlos Eduardo Zavaleta, Sebastián Salazar Bondy).

        La Estética del Desencanto y el Antihéroe Ribeyriano:
        A contracorriente de las pirotecnias formales del Boom latinoamericano, Ribeyro cultivó una prosa clásica, diáfana, lineal y profundamente sobria heredera de Maupassant y Chéjov. Sus protagonistas son los antihéroes de la modernidad: oficinistas cesantes, niños desamparados, bohemios empobrecidos y provincianos ilusionados que chocan frontalmente contra la frustración, la discriminación racial y el absurdo de la existencia urbana.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Efraín y Enrique",
            rol = "Protagonistas infantiles de 'Los gallinazos sin plumas'",
            descripcion = "Hermanitos huérfanos explotados por su abuelo; madrugan descalzos hurgando en basurales para alimentar a un cerdo. Efraín se hiere el pie y Enrique enferma de neumonía. Tras ver cómo el cerdo devora a su perrito Pedro, Enrique empuja al abuelo al chiquero y huye cargando a su hermano en hombros."
        ),
        PersonajeLiterario(
            nombre = "Don Santos",
            rol = "Antagonista de 'Los gallinazos sin plumas'; abuelo tiránico y cruel",
            descripcion = "Anciano tuerto y cojo con pata de palo; carece de afecto humano y vive poseído por la obsesión mercantil de cebar al cerdo Pascual a costa de la vida y el sufrimiento de sus nietos enfermos."
        ),
        PersonajeLiterario(
            nombre = "El cerdo Pascual",
            rol = "Monstruo devorador en 'Los gallinazos sin plumas'",
            descripcion = "Cerdo voraz y colosal que chilla exigiendo comida podrida; encarna la voracidad ciega y deshumanizada de la explotación económica que devora al perro Pedro y finalmente a su propio dueño."
        ),
        PersonajeLiterario(
            nombre = "Roberto López («Bob López»)",
            rol = "Protagonista de 'Alienación'",
            descripcion = "Muchacho zambo de Lima humillado por la chica de sus sueños debido a su color de piel. Se somete a dolorosos procesos para blanquearse (talco, pelo planchado y rubio, modales de gringo) y se alista en el ejército de EE.UU., muriendo destrozado por una granada en Vietnam sin alcanzar la ciudadanía."
        ),
        PersonajeLiterario(
            nombre = "Queca",
            rol = "Personaje de 'Alienación'; catalizadora de la alienación racial",
            descripcion = "Muchacha blanca y superficial de Miraflores. Desprecia a Roberto por zambo y se casa con el gringo Billy Mulligan para irse a vivir a EE.UU., donde termina envejecida y maltratada por un marido alcohólico."
        ),
        PersonajeLiterario(
            nombre = "Leandro",
            rol = "Patriarca estoico de 'Al pie del acantilado'",
            descripcion = "Padre provinciano ejemplar que levanta una casa y una comunidad en las peñas de la Costa Verde. Tras perder a sus hijos y sufrir la demolición de su hogar por las máquinas municipales, parte con su pala al hombro con indomable dignidad para empezar de nuevo."
        ),
        PersonajeLiterario(
            nombre = "Silvio Lombardi",
            rol = "Protagonista de 'Silvio en el rosedal'",
            descripcion = "Solterón melómano y reflexivo que hereda una hacienda andina y busca descifrar el diseño cabalístico de un inmenso rosedal, aprendiendo al final a gozar de la vida sencilla tras la ruina de sus quimeras."
        ),
        PersonajeLiterario(
            nombre = "El narrador de 'La insignia'",
            rol = "Antihéroe de la farsa burocrática kafkiana",
            descripcion = "Hombre pasivo y obediente que recoge un pin plateado en el malecón; cumple órdenes absurdas sin cuestionarlas y escala hasta la presidencia de una sociedad secreta ignorando su propósito."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La Explotación y el Sacrificio de Pedro en el Basural",
            detalle = "En 'Los gallinazos sin plumas', los hermanos Efraín y Enrique son obligados por don Santos a llenar latas de basura para cebar al cerdo Pascual. Efraín se clava un vidrio en el pie y Enrique cae con neumonía. Don Santos, enloquecido por el hambre del marrano, arroja al perro Pedro al chiquero, donde es despedazado por el animal ante la mirada atónita de los niños."
        ),
        EscenaTrama(
            titulo = "La Venganza en el Chiquero y la Fuga hacia la Ciudad de Niebla",
            detalle = "Enrique descubre los restos de su perro devorado por Pascual y confronta a don Santos. El abuelo intenta golpearlo con su vara, resbala con el lodo, rompe su pata de palo y cae al fondo del chiquero donde el cerdo avanza sobre él. Enrique carga a Efraín y ambos escapan del corralón mientras Lima despierta como un monstruo de niebla."
        ),
        EscenaTrama(
            titulo = "El Rechazo Racial de Queca y la Tragedia de Bob López en Vietnam",
            detalle = "En 'Alienación', Roberto López es humillado por Queca ('yo no juego con zambos'). Emprende un patético proceso de blanqueamiento con talco, agua oxigenada y modales gringos, rebautizándose como Bob López. Emigra a Estados Unidos y se alista en el ejército para obtener la ciudadanía, muriendo destrozado por una granada en los arrozales de la Guerra de Vietnam."
        ),
        EscenaTrama(
            titulo = "La Demolición Municipal de la Costa Verde y el Éxodo de Leandro",
            detalle = "En 'Al pie del acantilado', Leandro y sus hijos convierten un pedregal marino abandonado en un hogar fértil. Tras la muerte accidental de su hijo Pepe y el arresto de Toribio, buldóceres del municipio arrasan su choza para abrir paso a una carretera turística. Leandro carga su pico y su pala al hombro y marcha por la playa hacia otro acantilado para reiniciar la lucha."
        ),
        EscenaTrama(
            titulo = "El Enigma Metafísico de Silvio y la Absurda Ascensión de la Insignia",
            detalle = "En 'Silvio en el rosedal', el protagonista cree descifrar en la disposición geométrica de las rosas la palabra 'RES', cayendo en la cuenta de la futilidad de sus obsesiones cuando los pulgones secan las flores; en 'La insignia', un hombre asciende sumisamente en una cofradía internacional cumpliendo tareas disparatadas guiado por un broche encontrado en la calle."
        )
    ),
    temaPrincipal = "La condición trágica del antihéroe urbano, los marginados y olvidados que carecen de voz en la metrópoli moderna; la frustración de las clases medias, el racismo estructural, la alienación cultural y la derrota inevitable de las ilusiones humanas frente a la despiadada realidad económica y social.",
    simbolosClave = listOf(
        "El cerdo Pascual: Símbolo de la voracidad ciega e insaciable del capitalismo urbano deshumanizado que devora a los seres desvalidos y a los más vulnerables.",
        "La pata de palo de don Santos: Emblema de la tiranía decadente, la mezquindad y la ruindad moral del explotador doméstico.",
        "Los gallinazos sin plumas: Metáfora de los niños y pordioseros que hurgan en los vertederos al amanecer, reducidos a carroñeros urbanos por la miseria extrema.",
        "El talco de arroz y el agua oxigenada: Símbolos de la autoagresión identitaria, el complejo de inferioridad y la farsa trágica de la alienación racial en 'Alienación'.",
        "El pico y la pala de Leandro: Emblemas de la dignidad estoica, la perseverancia y la resistencia inquebrantable del migrante provinciano frente al despojo institucional.",
        "La insignia del pez plateado: Metáfora del absurdo kafkiano, la despersonalización del individuo y la docilidad servil ante los rituales vacíos de la burocracia.",
        "El rosedal de Ocopilla y la palabra 'RES': Símbolo de la búsqueda del sentido cósmico de la existencia que desemboca en la aceptación de la realidad material efímera."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué generación literaria perteneció Julio Ramón Ribeyro y qué rasgo define a su narrativa?",
            respuesta = "Perteneció a la Generación del 50 (narrativa urbana neorrealista). Su obra se caracteriza por una prosa clásica, limpia y lineal con tono escéptico e irónico, retratando la frustración, el desempleo y el desamparo de las clases medias y los marginados urbanos en Lima."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué simboliza el cerdo Pascual en 'Los gallinazos sin plumas'?",
            respuesta = "Simboliza la voracidad insaciable del sistema económico deshumanizado que explota y devora a los seres más vulnerables y desvalidos sin compasión alguna."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué acontecimiento detona el proceso de metamorfosis y alienación de Roberto López en el cuento 'Alienación'?",
            respuesta = "El rechazo racista y humillante de la joven miraflorina Queca, quien le dice tajantemente: '¡Yo no juego con zambos!', lo que empuja al muchacho a despojarse de su identidad biológica y cultural para adoptar una farsa gringa."
        ),
        PreguntaClaveObra(
            pregunta = "¿Dónde y en qué circunstancias muere Bob López en el relato 'Alienación'?",
            respuesta = "Muere destrozado por una granada enemiga en una trinchera durante la Guerra de Vietnam, tras haberse alistado como soldado en las fuerzas armadas estadounidenses con el único fin de obtener la ciudadanía legal."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es el sentido y la justificación del título general 'La palabra del mudo'?",
            respuesta = "Expresa la poética y el compromiso ético de Ribeyro: prestar su pluma y dar voz literaria a aquellos seres que en la vida cotidiana carecen de ella (los marginados, los olvidados, los humildes y los derrotados por la historia oficial)."
        )
    )
)
