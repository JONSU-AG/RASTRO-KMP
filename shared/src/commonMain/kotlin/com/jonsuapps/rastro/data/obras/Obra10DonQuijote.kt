package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

/**
 * OBRA 10: Don Quijote de la Mancha (Miguel de Cervantes Saavedra)
 * Fuente oficial: CONTENIDO_PEDAGOGICO/06_COMUNICACION/LITERATURA/OBRAS/OBRA_10_Don_Quijote_de_la_Mancha.md
 * Integración modular para RASTRO KMP - Biblioteca -> Obras
 */
val Obra10DonQuijote = ObraLiteraria(
    id = "don-quijote",
    titulo = "Don Quijote de la Mancha",
    autor = "Miguel de Cervantes Saavedra",    anio = "Siglo XVII (1605 - 1615)",
    pais = "España",
    colorHex = "#D97706",
    corriente = "Siglo de Oro español / Transición del Renacimiento tardío al Barroco / Fundación de la Novela Moderna",
    genero = "Narrativo",
    especie = "Novela polifónica y metaficcional",
    categoria = "Literatura Española",    sinopsis = """
        En una aldea anónima de La Mancha vive el hidalgo cincuentón Alonso Quijano, hombre seco de carnes y enjuto de rostro que, tras perder el juicio por leer febrilmente libros de caballerías sin dormir, decide resucitar la andante caballería para desfacer agravios y proteger a los desvalidos. Limpia viejas armas de sus bisabuelos, bautiza a su jamelgo como Rocinante, adopta el nombre de Don Quijote de la Mancha e inventa a su dama ideal, Dulcinea del Toboso (transfiguración de la labradora Aldonza Lorenzo). En su primera salida en solitario, llega a una venta que cree castillo feudal y es armado caballero de farsa por el ventero; intenta auxiliar al zagal Andrés azotado por su amo (desatando una desgracia mayor) y es apaleado por mercaderes toledanos al exigirles jurar la belleza de Dulcinea, siendo devuelto a su aldea por su vecino Pedro Alonso. Mientras duerme, el cura Pero Pérez y el barbero Nicolás ejecutan el célebre escrutinio y quema de su biblioteca.
        
        Para su segunda salida, convence a su vecino labrador Sancho Panza prometiéndole el gobierno de una ínsula. Se suceden célebres aventuras cómicas y trágicas: el combate contra treinta molinos de viento tomados por gigantes de Briareo transfigurados por el sabio Frestón; el combate a espada con el vizcaíno (episodio donde Cervantes finge encontrar el manuscrito en árabe de Cide Hamete Benengeli); el Discurso de la Edad de Oro ante los cabreros y la pastora Marcela; los golpes de los yangüeses; el manteo de Sancho en una venta y el brebaje del Bálsamo de Fierabrás; el ataque a rebaños de ovejas tomados por ejércitos paganos perdiendo varias muelas; el terror nocturno de los batanes; la conquista de la bacía de latón de barbero bautizada como el Yelmo de Mambrino; la liberación de los galeotes del rey liderados por Ginés de Pasamonte; la penitencia desnudo en Sierra Morena con la carta a Dulcinea; la farsa de la princesa Micomicona urdida por el cura y la bella Dorotea; la batalla a estocadas contra los odres de vino tinto en la venta; y su captura enjaulado dentro de una carreta de bueyes devuelto por sus amigos a su aldea.
        
        En la Segunda Parte (1615), Don Quijote y Sancho se enteran por el bachiller Sansón Carrasco de que sus hazañas ya han sido impresas y leídas por miles de personas en un libro famoso. Emprenden su tercera salida hacia El Toboso, donde Sancho 'encanta' a Dulcinea haciéndole creer a su amo que una labradora tosca y maloliente montada en borrica es la princesa divina. Don Quijote vence en duelo al Caballero de los Espejos (Sansón Carrasco disfrazado); desafía a un león feroz que lo ignora, nombrándose Caballero de los Leones; asiste a las bodas de Camacho el rico y la treta de Basilio; desciende a la Cueva de Montesinos; y acuchilla los títeres moros del retablo de Maese Pedro (Ginés de Pasamonte). Acogidos en el palacio de unos Duques aragoneses que montan crueles farsas teatrales a su costa, montan a ciegas en el caballo de madera volador Clavileño y se dicta que para desencantar a Dulcinea, Sancho debe darse 3.300 azotes.
        
        Sancho asume el gobierno de la ínsula Barataria, donde imparte juicios de sabiduría salomónica ejemplar, pero renuncia hastiado por el asedio médico del doctor Pedro Recio y una fingida invasión nocturna, proclamando que prefiere su libertad con pan y cebolla. Don Quijote y Sancho marchan a Barcelona (descartando Zaragoza para desmentir el apócrifo de Avellaneda) escoltados por el bandolero Roque Guinart. En la playa barcelonesa, Don Quijote es derribado en duelo por el Caballero de la Blanca Luna (Sansón Carrasco en su segundo intento), quien le impone bajo juramento de armas retirarse a su aldea durante un año. Desarmado y melancólico, rechaza el proyecto de hacerse pastores y cae en fiebres mortales. Despierta en su lecho con el juicio plenamente recobrado: reniega de los libros de caballerías, pide perdón a Sancho —quien le ruega entre lágrimas volver al campo vestidos de pastores porque la mayor locura es dejarse morir—, dicta testamento como Alonso Quijano el Bueno y muere cristianamente en paz.
    """.trimIndent(),
    contextoHistorico = """
        • Nacimiento de la Novela Moderna: Publicada en dos partes (1605 y 1615), es la obra cumbre de las letras hispanas y universales. Nació con el propósito paródico de derribar la moda absurda de los libros de caballerías, pero Cervantes revolucionó la narrativa creando el perspectivismo barroco y la novela polifónica y dialógica.
        • Perspectivismo y quijotización: La verdad ya no es unívoca (símbolo del 'baciyelmo'); los personajes no son planos, sino que evolucionan psicológicamente en permanente diálogo humano (la quijotización idealista de Sancho y la sanchificación realista y prudente de Don Quijote).
        • Metaficción y juego autoral: En 1615 los protagonistas saben que son personajes de ficción leídos en la Primera Parte de 1605 y combaten el falso 'Quijote' apócrifo de Alonso Fernández de Avellaneda (1614). Introducción del falso cronista arábigo Cide Hamete Benengeli.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Don Quijote de la Mancha / Alonso Quijano el Bueno",
            rol = "Protagonista / El Caballero de la Triste Figura",
            descripcion = "Hidalgo manchego de 50 años que enloquece por leer novelas de caballerías. Encarna el idealismo puro, la defensa de la justicia, la libertad y la dignidad moral por encima del pragmatismo social. Es un 'loco cuerdo' que razona con sublime sabiduría humanista y recobra la cordura en su lecho de muerte."
        ),
        PersonajeLiterario(
            nombre = "Sancho Panza",
            rol = "Escudero fiel / El pragmatismo campesino",
            descripcion = "Labrador vecino, gordo, refranero y amante de la buena comida. Sigue a su amo motivado por la codicia de una ínsula, pero experimenta una profunda 'quijotización': asimila la nobleza moral de don Quijote, gobierna Barataria con justicia salomónica incorruptible y suplica a su amo que viva para buscar a Dulcinea."
        ),
        PersonajeLiterario(
            nombre = "Dulcinea del Toboso / Aldonza Lorenzo",
            rol = "Dama ideal / La amada invisible",
            descripcion = "Labradora tosca y robusta de El Toboso especializada en salar cerdos. Don Quijote la transfigura platónicamente en la mujer más hermosa y virtuosa de la tierra. Jamás aparece físicamente: existe como la fe y el motor espiritual inquebrantable del caballero."
        ),
        PersonajeLiterario(
            nombre = "El Bachiller Sansón Carrasco",
            rol = "Antagonista terapéutico / Caballero de la Blanca Luna",
            descripcion = "Joven salmantino socarrón que combate con don Quijote para curar su demencia obligándolo a retirarse a su aldea. Fracasa como Caballero de los Espejos, pero triunfa como Caballero de la Blanca Luna en la playa de Barcelona."
        ),
        PersonajeLiterario(
            nombre = "Rocinante",
            rol = "Montura caballeresca",
            descripcion = "Jamelgo flaco, viejo y lleno de mataduras que acompaña al héroe en todas sus salidas, reflejando físicamente la fragilidad del sueño caballeresco."
        ),
        PersonajeLiterario(
            nombre = "El Rucio",
            rol = "Asno fiel de Sancho",
            descripcion = "Burro pardo y resistente que encarna el arraigo a la tierra y el afecto doméstico puro del escudero."
        ),
        PersonajeLiterario(
            nombre = "El Cura Pero Pérez y el Barbero Nicolás",
            rol = "Amigos aldeanos leales",
            descripcion = "Vecinos que buscan rescatar a Alonso Quijano. Escrutan y queman su biblioteca y urden ardides teatrales (la princesa Micomicona y la jaula de bueyes) para regresarlo a casa."
        ),
        PersonajeLiterario(
            nombre = "Los Duques de Aragón",
            rol = "Aristócratas burladores",
            descripcion = "Nobles ricos y ociosos que montan farsas crueles en su palacio (Clavileño, Merlín, Barataria) para mofarse de don Quijote y Sancho, representando la vacuidad moral barroca."
        ),
        PersonajeLiterario(
            nombre = "Ginés de Pasamonte (Maese Pedro)",
            rol = "Galeote pícaro y titiritero",
            descripcion = "Delincuente cínico liberado por don Quijote que le roba el asno a Sancho en Sierra Morena y luego reaparece con el retablo de marionetas acuchillado en la venta."
        ),
        PersonajeLiterario(
            nombre = "Cide Hamete Benengeli",
            rol = "Historiador arábigo ficticio",
            descripcion = "Autor ficticio al que Cervantes atribuye la crónica original comprada en Toledo, recurso metaficcional de distanciamiento irónico."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Primera Salida: La locura, la investidura bufonesca y el escrutinio",
            detalle = "Alonso Quijano enloquece por los libros de caballerías y sale solo como Don Quijote. En una venta que cree castillo, el ventero lo arma caballero tras velar armas en el corral. Intenta salvar al criado Andrés empeorando su castigo y es apaleado por mercaderes de Toledo. Vuelto malherido a su aldea por Pedro Alonso, el cura y el barbero queman su biblioteca caballeresca."
        ),
        EscenaTrama(
            titulo = "Segunda Salida: Los molinos de viento, el baciyelmo y los galeotes",
            detalle = "Don Quijote ficha a Sancho Panza como escudero por la promesa de una ínsula. Ataca a los molinos de viento tomándolos por gigantes; se bate con el vizcaíno; sufre el ataque de los yangüeses y el manteo de Sancho en la venta tras beber el Bálsamo de Fierabrás; arremete contra rebaños de ovejas perdiendo muelas; conquista la bacía de barbero bautizándola como Yelmo de Mambrino y libera a la cuerda de galeotes de Ginés de Pasamonte."
        ),
        EscenaTrama(
            titulo = "Segunda Salida: Sierra Morena, Micomicona y el regreso en jaula de bueyes",
            detalle = "Huyen a Sierra Morena; Ginés roba el Rucio y Don Quijote hace penitencia en camisa enviando una carta a Dulcinea con Sancho. El cura y el barbero disfrazan a Dorotea de princesa Micomicona para engañarlo y sacarlo de los montes. En la venta Don Quijote acuchilla los odres de vino y pronuncia el Discurso de las Armas y las Letras. Finalmente es atado y encerrado en una jaula sobre una carreta de bueyes rumbo a su aldea."
        ),
        EscenaTrama(
            titulo = "Tercera Salida: El encantamiento de Dulcinea, los leones y los Duques",
            detalle = "Enterados de que sus hazañas ya son un libro impreso, salen hacia El Toboso, donde Sancho hace pasar a una labradora por Dulcinea encantada. Don Quijote vence al Caballero de los Espejos (Sansón Carrasco) y desafía al león haciéndose Caballero de los Leones. Tras la Cueva de Montesinos y el retablo de Maese Pedro, los Duques los hospedan montando burlas pesadas (el caballo volador Clavileño y los 3.300 azotes de Sancho para desencantar a Dulcinea)."
        ),
        EscenaTrama(
            titulo = "Tercera Salida: La ínsula Barataria, la derrota en Barcelona y la muerte cuerda",
            detalle = "Sancho gobierna la ínsula Barataria con asombrosa justicia salomónica, pero renuncia harto de la tortura del doctor Pedro Recio. En Barcelona, Don Quijote es vencido en la playa por el Caballero de la Blanca Luna (Sansón Carrasco), jurando retirarse un año. De vuelta en su aldea, cae enfermo en cama: recobra el juicio renegando de las caballerías, rechaza los ruegos de Sancho de salir al campo vestidos de pastores, dicta testamento como Alonso Quijano el Bueno y fallece en paz cristiana."
        )
    ),
    temaPrincipal = "El conflicto entre el idealismo ético desinteresado y la prosaica realidad material, la dialéctica entre locura y cordura como máscara de la libertad, y el perspectivismo moderno.",
    simbolosClave = listOf(
        "Los molinos de viento: Símbolo universal de la lucha heroica, ingenua y desigual del espíritu idealista contra las fuerzas mecánicas, ciegas y deshumanizadas de la realidad.",
        "El baciyelmo: Símbolo supremo del perspectivismo cervantino; fusiona la bacía de afeitar del barbero con el yelmo de oro de Mambrino, mostrando que la realidad depende de la conciencia del observador.",
        "Dulcinea del Toboso: La fe interior y el ideal platónico absoluto; existe como motor espiritual trascendente en el alma del héroe sin necesidad de presencia física.",
        "Clavileño el alígero: El caballo de madera de los Duques; simboliza la farsa cortesana y la capacidad de la mente humana para viajar a los astros con la imaginación.",
        "La ínsula Barataria: Utopía del buen gobierno; demuestra que la pureza ética del hombre humilde y sencillo supera a la sofistería política corrupta.",
        "La jaula de bueyes: Confinamiento impuesto por la sociedad pacata y burguesa sobre el individuo libre y soñador."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿En qué consiste el fenómeno de la 'quijotización de Sancho' y la 'sanchificación de Don Quijote'?",
            respuesta = "Es la transformación psicológica mutua producida por el diálogo continuo: Sancho Panza pasa del apego materialista al aprecio noble del honor caballeresco y la justicia poética, mientras Don Quijote asimila la prudencia empírica, el valor del dinero y las limitaciones físicas de la realidad humana."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién es y qué disfraces adopta el bachiller Sansón Carrasco para vencer a Don Quijote?",
            respuesta = "Es un joven estudiante de Salamanca vecino de la aldea. Se disfraza primero como el Caballero de los Espejos (donde es vencido fortuitamente por Don Quijote) y luego como el Caballero de la Blanca Luna, venciendo al héroe en la playa de Barcelona para obligarlo bajo palabra de honor a retirarse un año a su hogar."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué Don Quijote y Sancho deciden viajar a Barcelona en lugar de asistir a los torneos de Zaragoza en la Segunda Parte?",
            respuesta = "Porque Cervantes quiso desmentir públicamente el 'Quijote' apócrifo de Alonso Fernández de Avellaneda (1614), donde los personajes iban a Zaragoza, demostrando ante la imprenta y la historia que el verdadero Don Quijote no pisaría esa ciudad."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué significado tiene el objeto bautizado como 'baciyelmo'?",
            respuesta = "Representa el perspectivismo barroco cervantino: demuestra que la realidad material no es unívoca ni dogmática, sino múltiple según la perspectiva y el deseo del sujeto. Para Don Quijote es el Yelmo de Mambrino, para el barbero es una bacía de afeitar y Sancho inventa un término conciliador intermedio."
        ),
        PreguntaClaveObra(
            pregunta = "¡Trampa de Examen!: ¿Cómo muere Don Quijote en el desenlace de la novela?",
            respuesta = "¡No muere loco en una batalla contra caballeros ni gigantes! Muere en su cama tras recobrar plenamente la cordura, reconociéndose como Alonso Quijano el Bueno, renegando de los libros de caballerías, dictando testamento cristiano y rechazando los ruegos de Sancho de salir como pastores al campo."
        )
    )
)
