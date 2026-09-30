package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra14VeintePoemas = ObraLiteraria(
    id = "veinte-poemas-de-amor",
    titulo = "Veinte poemas de amor y una canción desesperada",
    autor = "Pablo Neruda",    anio = "Siglo XX (1924)",
    pais = "Chile",
    colorHex = "#0284C7",
    corriente = "Neorromanticismo / Transición entre Modernismo tardío y Vanguardia inicial",
    genero = "Lírico",
    especie = "Poemario amoroso y elegíaco",
    categoria = "Literatura Hispanoamericana",    sinopsis = """
        Publicado en Santiago de Chile en junio de 1924 por la Editorial Nascimento cuando su autor contaba con apenas diecinueve años, 'Veinte poemas de amor y una canción desesperada' de Pablo Neruda (Neftalí Ricardo Reyes Basoalto) es el poemario más célebre, traducido, memorizado e influyente de la lírica hispánica moderna.

        La obra revoluciona de raíz el lenguaje amatorio continental al despojarlo de la bisutería exótica de cisnes y princesas del Modernismo rubeniano, enraizando el deseo en la materia viva, tangible y telúrica del sur de Chile. A través de veintiuna composiciones —veinte poemas identificados con números romanos correlativos y una pieza de cierre con título propio, 'La canción desesperada'—, Neruda funde la evocación de dos amores juveniles de su bohemia estudiantil: la muchacha campesina y luminosa de Temuco ('Marisol' / Teresa Vásquez) y la estudiante reconcentrada, misteriosa y esquiva de Santiago ('Marisombra' / Albertina Rosa Azócar).

        El libro traza un arco dramático descendente y conmovedor: arranca con la celebración gozosa de la posesión carnal y la homologación del cuerpo femenino con la tierra fértil ('Cuerpo de mujer, blancas colinas, muslos blancos', Poema 1); se adentra en la contemplación cósmica del deseo y el deslumbramiento primaveral ('Quiero hacer contigo lo que la primavera hace con los cerezos', Poema 14); explora la angustia de la incomunicación y la fascinación por la distancia contemplativa ('Me gustas cuando callas porque estás como ausente', Poema 15); desemboca en la cumbre del dolor elegíaco bajo el cielo austral de la memoria ('Puedo escribir los versos más tristes esta noche... Es tan corto el amor, y es tan largo el olvido', Poema 20); y clausura su itinerario en 'La canción desesperada', donde el amor se disuelve trágicamente en la metáfora del naufragio marítimo, los muelles desiertos en el alba y la soledad irrevocable del abandonado.
    """.trimIndent(),
    contextoHistorico = """
        Aparecido en 1924, en el mismo año en que el Surrealismo nacía en Europa con el manifiesto de Breton, el poemario del joven Neruda produjo un impacto revolucionario en las letras continentales al marcar la frontera entre el ocaso del Modernismo y la eclosión de la lírica contemporánea:
        1. Desmitificación y refundación carnal: Neruda abandona las poses aristocráticas y los salones versallescos del siglo anterior. El erotismo desciende a los cuerpos reales, jóvenes y sudorosos, concebidos no como abstracciones angelicales platónicas, sino como materia viva.
        2. Erotización de la naturaleza y poética telúrica: La mujer se funde con la geografía austral chilena. Su anatomía posee colinas, espigas, musgos, lluvias oceánicas y noches de pinares; el amante se concibe a sí mismo como un 'labriego salvaje' que ara y siembra el surco de la tierra.
        3. La crónica de la incomunicación: A pesar del ardor de la entrega física, el poemario registra la imposibilidad ontológica de la comunión plena. El amor nerudiano está acechado permanentemente por la soledad íntima, la lejanía del silencio y la herida del abandono.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Yo Lírico (El Poeta / El Amante)",
            rol = "Sujeto poético central",
            descripcion = "Joven vehemente, melancólico y bohemio que se desdobla entre el 'labriego salvaje' que fecunda con deseo ciego la geografía corporal de la amada y el 'náufrago solitario' que contempla impotente cómo las palabras se adelgazan y el amor zozobra irremediablemente en los escollos del abandono y la memoria."
        ),
        PersonajeLiterario(
            nombre = "'Marisol' (Teresa Vásquez)",
            rol = "Musa telúrica, campestre y luminosa",
            descripcion = "Muchacha del sur de Chile (provincia de Temuco y ribera de Laja). Encarna el amor diurno, vital, transparente y radiante, asociada a los maizales, la uva dulce, la fruta madura bajo el sol austral y el despertar fecundo de la primavera en la tierra."
        ),
        PersonajeLiterario(
            nombre = "'Marisombra' (Albertina Rosa Azócar)",
            rol = "Musa urbana, misteriosa y esquiva",
            descripcion = "Compañera de estudios de Neruda en el Instituto Pedagógico de Santiago. Muchacha de mirada reconcentrada, silenciosa, ataviada con su icónica boina gris. Encarna el amor nocturno, intelectual, distante, la amada esquiva de las cartas tardías y la fuente del silencio y la melancolía que inspiró 'Me gustas cuando callas' y el Poema 20."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Etapa I: La Celebración del Cuerpo y la Geografía Femenina (Poemas 1 al 4)",
            detalle = """
                El poemario se abre majestuosamente con el Poema 1 ('Cuerpo de mujer, blancas colinas, muslos blancos'), donde Neruda fija la clave metafórica de su estética: la mujer no es un ángel incorpóreo, sino la tierra misma en su actitud cósmica de entrega. El amante se define como un 'labriego salvaje' que socava el surco para hacer brotar la vida. La posesión erótica rescata momentáneamente al sujeto de su pozo de soledad previa, aunque en el horizonte del deseo asoma ya la fatiga y la tristeza infinita.

                Los poemas siguientes intensifican la pulsión sensorial: en el Poema 2 la noche se amarra a los ojos de la amada; en el Poema 3 la avidez y el temblor dominan el encuentro de la carne; y en el Poema 4 la tempestad y el viento de los pinares del sur azotan la cabaña, mientras el abrazo de los amantes desafía la furia ciega de los elementos cósmicos.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Etapa II: El Asedio del Lenguaje y la Distancia (Poemas 5 al 9)",
            detalle = """
                En este segundo tramo, la plenitud física da paso a la incertidumbre y a la lucha con el lenguaje:
                - En el Poema 5 ('Para que tú me oigas / mis palabras / se adelgazan a veces / como las huellas de las gaviotas en las playas'), el poeta constata la angustiosa fragilidad de los vocablos humanos para tender puentes hacia la amada; las palabras son colonizadas por la nostalgia y trepan por el dolor como la hiedra por la pared.
                - En el Poema 6 ('Te recuerdo como eras en el último otoño... Eras la boina gris y el corazón en calma'), irrumpe la melancolía urbana de Santiago evocando a Marisombra: las hojas caen en el agua del alma y el desprendimiento de los amantes se acompasa con la agonía del otoño.
                - Los Poemas 7, 8 y 9 ahondan en el viento costero de la tarde, la soledad entre las redes de pescar y la cerrazón nocturna donde la distancia física preludia la ruptura afectiva.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Etapa III: La Sombra del Silencio y la Incomunicación (Poemas 10 al 15)",
            detalle = """
                Se intensifica la fractura emocional y la lejanía contemplativa:
                - En el Poema 10 ('Hemos perdido aun este crepúsculo'), el atardecer que borra estatuas simboliza la complicidad perdida; el amante se interroga en soledad dónde está ella, entre qué gentes y pronunciando qué palabras mientras a él se le viene todo el amor de golpe.
                - En el Poema 14 ('Juegas todos los días con la luz del universo'), estalla una llamarada de vigor erótico y comunión salvaje con el cosmos austral, inmortalizada en el verso fulgurante: 'Quiero hacer contigo lo que la primavera hace con los cerezos'.
                - En el Poema 15 ('Me gustas cuando callas porque estás como ausente'), el canon nerudiano alcanza su cima más célebre: el silencio de la mujer no es desdén, sino una ausencia espiritual que permite al poeta poseerla más allá del ruido de la materia ('Mariposa de sueño, te pareces a mi alma, y te pareces a la palabra melancolía'), hasta que una simple sonrisa o una palabra quiebra la congoja de la nada.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Etapa IV: La Agonía del Desamor, el Olvido y la Noche Estrellada (Poemas 16 al 20)",
            detalle = """
                El poemario se precipita hacia la catástrofe del desamor y el adiós irremediable:
                - Los Poemas 16 a 19 oscilan entre el recuerdo de la niña morena y ágil bajo el sol campesino y la angustia de los crepúsculos donde la marea interior arrastra naufragios.
                - En el Poema 20 ('Puedo escribir los versos más tristes esta noche'), Neruda compone la elegía cumbre del dolor amatorio continental. Bajo una noche fría de astros azules que tiritan a lo lejos y viento que gira en el cielo, el poeta constata la distancia irreparable: la noche blanquea los mismos árboles, pero los amantes ya no son los mismos. Enfrenta la punzante certidumbre de que el cuerpo y la voz de la amada pertenecerán a otro ('De otro. Será de otro. Como antes de mis besos'), desnudando el desgarramiento del corazón en la máxima imborrable: 'Ya no la quiero, es cierto, pero tal vez la quiero. / Es tan corto el amor, y es tan largo el olvido'.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Cláusula: La canción desesperada (El Naufragio Cósmico Absoluto)",
            detalle = """
                Como broche y catarsis de todo el poemario, Neruda rompe la serie numérica e inserta 'La canción desesperada'. La escena se traslada definitivamente al puerto solitario, la escollera desierta y el mar enfurecido donde un navío zozobra.

                El poeta se contempla a sí mismo como un nauta destruido en medio de una feroz cueva de náufragos y sentina de escombros ('Abandonado como los muelles en el alba. / Es el alba de partir, ¡oh abandonado!'). La mujer fue el milagro, la fruta y la luz en la noche salvaje de las islas, pero también el escollo fatal donde se quebró la esperanza. El libro se clausura con un grito cósmico de dolor desgarrador que asume la partida inevitable y la soledad eterna del náufrago humano.
            """.trimIndent()
        )
    ),
    temaPrincipal = "La celebración sensual del amor carnal y la fecundidad telúrica, entrelazada con el dolor lacerante del desamor, la incomunicación, la soledad existencial y el olvido simbolizados en el naufragio.",
    simbolosClave = listOf(
        "El cuerpo de mujer como geografía / colinas: Alegoría de la tierra nutricia, la fertilidad del cosmos y la materia viva entregada al deseo humano.",
        "El labriego salvaje: El amante primitivo e instintivo que ara y fecunda el surco de la naturaleza con su pasión.",
        "La boina gris y el otoño (Poema 6): Símbolo del apego nostálgico, la fragilidad urbana y el desprendimiento estacional del afecto.",
        "La primavera y los cerezos (Poema 14): La fuerza cósmica y vital del deseo erótico que hace estallar la vida y la flor sobre la desnudez.",
        "El silencio y la mariposa (Poema 15): Encarnación de la lejanía contemplativa, la presencia inmaterial y la esencia de la melancolía.",
        "La noche estrellada y los astros azules (Poema 20): El frío cósmico que refleja la soledad insondable del alma tras la pérdida de la amada.",
        "El muelle en el alba y el barco naufragado ('La canción desesperada'): Metáfora suprema del abandono y el fracaso sentimental irreversible."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es la estructura cuantitativa y formal exacta de Veinte poemas de amor y una canción desesperada?",
            respuesta = "El libro consta de veintiuna composiciones en total: veinte poemas identificados exclusivamente con números ordinales romanos (Poema 1 al Poema 20), sin títulos independientes, y un poema de clausura con título propio de tono elegíaco y marítimo: 'La canción desesperada'."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué dos figuras biográficas inspiraron el poemario según confesión del propio Neruda?",
            respuesta = "Funde la evocación de dos muchachas de su juventud: Teresa Vásquez ('Marisol'), joven campesina de Temuco y Laja que encarna el amor luminoso, campestre y diurno; y Albertina Rosa Azócar ('Marisombra'), estudiante de Santiago de boina gris y carácter reconcentrado que personifica el amor urbano, nocturno, esquivo y melancólico."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué cambio radical introduce Neruda en la concepción de la mujer respecto a la lírica tradicional?",
            respuesta = "Neruda abandona la figura de la mujer como ángel incorpóreo platónico del Romanticismo y los lujos exóticos versallescos del Modernismo; concibe el cuerpo femenino como materia física, geografía real y tierra fértil austral (blancas colinas, muslos blancos, surcos y frutos), asimilando el erotismo humano con la fecundidad telúrica del universo."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué famosa antítesis existencial resume el conflicto del Poema 20?",
            respuesta = "El poema resume la lucha contradictoria entre la razón y la persistencia de la memoria en la antítesis inmortal: 'Ya no la quiero, es cierto, pero tal vez la quiero. / Es tan corto el amor, y es tan largo el olvido'."
        ),
        PreguntaClaveObra(
            pregunta = "¿A qué etapa de la evolución poética de Pablo Neruda corresponde esta obra?",
            respuesta = "Corresponde a su etapa juvenil de iniciación neorromántica con influjos del Modernismo tardío y atisbos vanguardistas (1924), anterior a la etapa de vanguardia y poesía de la desintegración caótica que caracterizará a 'Residencia en la tierra' (1935)."
        )
    )
)
