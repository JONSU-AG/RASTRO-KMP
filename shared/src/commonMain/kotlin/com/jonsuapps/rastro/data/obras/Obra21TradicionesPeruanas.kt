package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra21TradicionesPeruanas = ObraLiteraria(
    id = "tradiciones-peruanas",
    titulo = "Tradiciones Peruanas",
    autor = "Ricardo Palma",    anio = "Siglo XIX - XX (1872 - 1910)",
    pais = "Perú",
    corriente = "Romanticismo Peruano (Vertiente Histórica y Tradicionalista) / Costumbrismo tardío",
    genero = "Narrativo",
    especie = "Tradición (género híbrido genuinamente peruano)",
    categoria = "Literatura Peruana",    colorHex = "#9333EA",
    sinopsis = """
        Las Tradiciones Peruanas constituyen el monumento narrativo más representativo de las letras peruanas del siglo XIX, creado por Ricardo Palma ('El Bibliotecario Mendigo'). La tradición es una especie narrativa original e híbrida que fusiona tres componentes indisolubles: el rigor de la historia documentada en crónicas virreinales y archivos conventuales, la ficción novelesca de capa y espada, y el humor criollo repleto de ironía socarrona, picardía y escepticismo liberal.

        Cada tradición obedece canónicamente a una estructura tripartita:
        1. Introducción histórica o digresión erudita: Fechas precisas, nombres de virreyes y citas de cronistas coloniales.
        2. Desarrollo de la anécdota novelada: Presentación de personajes típicos, lances de amor o de honor, y diálogos chispeantes del habla limeña.
        3. Colofón o remate sentencioso: Explicación del origen etimológico de un refrán, dicho popular o moraleja socarrona.

        Aunque abarca desde la época incaica hasta la republicana, más del 60% de las 453 tradiciones transcurren en el Virreinato de Lima durante los siglos XVII y XVIII. Entre las tradiciones capitales para el análisis académico destacan:
        - La camisa de Margarita: En la Lima de 1765, el joven Luis Alcázar se enamora de Margarita Pareja. Su arrogante padre, don Raimundo, rechaza al pretendiente por 'pobrete'. Margarita enferma mortalmente de melancolía y don Raimundo debe rogar al acaudalado tío de Luis, don Honorato, quien dolido en su orgullo aragonés acepta la boda con la condición draconiana de no recibir dote alguna salvo 'la camisa de novia'. Raimundo cumple juramento, pero confecciona una camisa con encajes de Flandes y un collar de brillantes valorizado en más de 30.000 pesos de oro, originando el dicho popular: '¡Esto es más caro que la camisa de Margarita!'.
        - ¡Al rincón! ¡Quita calzón!: En el Seminario de San Jerónimo de Arequipa, el ilustrado obispo Chávez de la Rosa evalúa latín a los colegiales castigando con azotes en el rincón ('¡Al rincón! ¡Quita calzón!') a los que fallan. Un menudo monaguillo desafía al obispo preguntándole cuántas veces se reza la palabra 'Quidquid' en la misa; al no recordar la cifra el prelado, suspende el castigo colectivo y adopta como pupilo al niño, quien sería el prócer Francisco Javier de Luna Pizarro.
        - Los incas ajedrecistas: Durante su cautiverio en Cajamarca, Atahualpa aprende a jugar ajedrez solo mirando las partidas de los capitanes españoles. En un duelo entre Hernando de Soto y Ruy García, el Inca interviene señalando una jugada maestra ('¡No, capitán, no... la torre!') que da jaque mate a Ruy García; este último, resentido en su orgullo herido, emite semanas después el voto dirimente que condena al garrote al monarca andino.
        - Al pie de la letra: El general Felipe Santiago Salaverry admira el valor legendario pero padece la ingenuidad mental del fornido capitán Paiva, incapaz de entender metáforas. En la víspera de la batalla de Socabaya (1836), Salaverry le ordena con furia: '¡Vaya con sus lanceros y hágase matar en esa loma!'; Paiva carga en solitario y muere cosido a bayonetazos, cumpliendo la orden al pie de la letra.
        - El alacrán de Fray Gómez: El humilde fraile franciscano ayuda a un comerciante al borde de la quiebra envolviendo un alacrán venenoso de su celda en un papel; al abrirlo en la tienda del usurero, el insecto se ha transformado en una joya de oro y esmeraldas sobre la que le prestan 500 pesos. Al devolver el comerciante la prenda meses después, Fray Gómez coloca la joya en la ventana y esta vuelve a ser un alacrán vivo que huye por la pared.
        - Historia de un cañoncito: El presidente Ramón Castilla recibe como obsequio de santo un diminuto cañón de oro con balas de perlas de un pretendiente a puestos públicos; Castilla le devuelve el juguete advirtiéndole que dispara balas demasiado gruesas para las rentas de la nación.
        - Don Dimas de la Tijereta: Un escribano limeño vende su 'almilla' al diablo Lilith por tres años del amor de una mulata; al expirar el plazo, le entrega un chaleco interior de lana (llamado 'almilla' en la época), ganándole el juicio al demonio ante los tribunales eclesiásticos.
    """.trimIndent(),
    contextoHistorico = """
        Nacido en Lima en 1833, Ricardo Palma consagró su vida al cultivo del Romanticismo peruano en su vertiente histórica y tradicionalista, diferenciándose de la vertiente lírica amatoria de Carlos Augusto Salaverry.

        La Hazaña de 'El Bibliotecario Mendigo':
        Tras el desastre de la Guerra del Pacífico y la ocupación de Lima en 1881, las tropas invasoras chilenas saquearon, utilizaron como caballeriza e incendiaron la Biblioteca Nacional del Perú. El presidente Miguel Iglesias encomendó a Palma la reconstrucción del recinto; sin presupuesto fiscal, Palma se dedicó epistolarmente a solicitar donaciones de libros a autores, dignatarios y academias de América y Europa, ganándose con nobleza el apelativo de 'El Bibliotecario Mendigo' y devolviendo al Perú su templo del saber.

        Desmitificación y Defensa del Lenguaje Peruano:
        Palma utilizó la tradición como instrumento ideológico para humanizar y desmitificar la historia: retrató a virreyes enamoradizos, beatas cizañeras y próceres con flaquezas humanas. Asimismo, como miembro de la Academia Peruana de la Lengua, libró célebres batallas en Madrid frente a la Real Academia Española (RAE) exigiendo el reconocimiento de peruanismos ('concho', 'desconchinflar', 'calato', 'huachafo'), consagrando en sus textos el léxico criollo mestizo.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Ricardo Palma ('El Bibliotecario Mendigo')",
            rol = "Autor, narrador omnisciente y creador del género de la tradición",
            descripcion = "Intelectual limeño liberal de fino humor y erudición de archivo. Transforma la historia rígida en amenas estampas donde el narrador dialoga con complicidad irónica con el lector ('mi carísimo lector')."
        ),
        PersonajeLiterario(
            nombre = "Margarita Pareja y Don Luis Alcázar",
            rol = "Amantes protagonistas de 'La camisa de Margarita'",
            descripcion = "Margarita, doncella mimada que prefiere enfermar mortalmente antes que renunciar a su amor; don Luis, hidalgo aragonés orgulloso y galán que no tolera la humillación clasista de su suegro."
        ),
        PersonajeLiterario(
            nombre = "Don Raimundo Pareja y Don Honorato Alcázar",
            rol = "Antagonistas paternales; orgullo limeño vs hidalguía aragonesa",
            descripcion = "Raimundo rehúsa al pretendiente por pobre; Honorato, tío acaudalado, le impone el humillante juramento de no entregar más dote que la camisa de novia, burlada por el ingenio con pedrería millonaria."
        ),
        PersonajeLiterario(
            nombre = "Obispo Chávez de la Rosa y Francisco Javier de Luna Pizarro",
            rol = "Duelo pedagógico en '¡Al rincón! ¡Quita calzón!'",
            descripcion = "Chávez de la Rosa, severo rector ilustrado del seminario de San Jerónimo; Luna Pizarro, niño monaguillo de agudeza genial que desarma la soberbia clerical con la pregunta litúrgica del 'Quidquid', llegando a ser prócer nacional."
        ),
        PersonajeLiterario(
            nombre = "Inca Atahualpa y Capitán Ruy García",
            rol = "Duelo ajedrecístico en 'Los incas ajedrecistas'",
            descripcion = "Atahualpa, soberano cautivo de inteligencia prodigiosa que salva a Hernando de Soto con el movimiento de la torre; Ruy García, oficial mediocre y resentido que se venga condenando a muerte al Inca por una partida perdida."
        ),
        PersonajeLiterario(
            nombre = "Capitán Paiva y General Felipe Santiago Salaverry",
            rol = "Obediencia ciega vs cólera militar en 'Al pie de la letra'",
            descripcion = "Paiva, oficial mulato gigantesco de lealtad heroica pero cerebro literal que no entiende metáforas; Salaverry, joven y vehemente presidente que ordena con ira su sacrificio en la loma de Socabaya."
        ),
        PersonajeLiterario(
            nombre = "Mariscal Ramón Castilla",
            rol = "Presidente astuto y socarrón en 'Historia de un cañoncito'",
            descripcion = "Veterano gobernante de la Era del Guano que conoce la psicología criolla y rechaza los sobornos de empleo estatal devolviendo el cañoncito de oro a su remitente."
        ),
        PersonajeLiterario(
            nombre = "Fray Gómez",
            rol = "Fraile lego franciscano y taumaturgo en 'El alacrán de Fray Gómez'",
            descripcion = "Varón de santidad sencilla que socorre a los menesterosos convirtiendo temporalmente un alacrán de barro en una joya deslumbrante de oro y esmeraldas."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La camisa de Margarita y el Origen de una Expresión Popular",
            detalle = "Luis Alcázar pide la mano de Margarita Pareja en Lima; su padre don Raimundo lo despide por pobrete. Margarita cae en melancolía mortal. Aterrado, Raimundo acude donde el tío Honorato Alcázar; este consiente la boda bajo juramento sacramental de que la novia solo llevará puesta su camisa de novia. Raimundo acata el juramento pero manda confeccionar la camisa con encaje de Flandes y un collar de brillantes valorizado en 30.000 pesos de oro, consagrando el dicho sobre los precios exorbitantes."
        ),
        EscenaTrama(
            titulo = "¡Al rincón! ¡Quita calzón! y el Desafío del Latín en Arequipa",
            detalle = "El obispo Chávez de la Rosa toma examen de latín en el seminario de San Jerónimo enviando a azotes al rincón a todos los alumnos que titubean. Al interrogar a un menudo monaguillo, este titubea y recibe la misma orden de azotes, pero desafía al obispo a contestar cuántas veces se repite el vocablo 'Quidquid' en la misa. Al no recordarlo el prelado, perdona la penitencia general y protege al infante, quien sería el futuro prócer Francisco Javier de Luna Pizarro."
        ),
        EscenaTrama(
            titulo = "Los incas ajedrecistas y la Sentencia Fatal de Cajamarca",
            detalle = "En el cautiverio de Cajamarca, Atahualpa aprende ajedrez en silencio mirando jugar a los capitanes españoles. Durante una partida entre Hernando de Soto y Ruy García, el Inca interviene diciendo: 'No, capitán, no... ¡la torre!', provocando el jaque mate contra Ruy García. Humillado en su orgullo, Ruy García emite semanas después el voto decisivo en el tribunal que condena al garrote al soberano inca."
        ),
        EscenaTrama(
            titulo = "Al pie de la letra y el Sacrificio Heroico del Capitán Paiva",
            detalle = "El capitán Paiva cumple las órdenes de Salaverry con estricta literalidad carente de sentido figurado: asesina a balazos a un detenido pacífico porque le ordenaron 'mandarlo al otro mundo' y se tapa un ojo media hora en una tienda porque le dijeron 'hazte de la vista gorda'. En Socabaya, Salaverry irritado le grita: '¡Vaya y hágase matar en esa loma!'; Paiva carga solo a caballo contra un batallón enemigo y muere acribillado a bayonetas, dejando al general en amargo llanto."
        ),
        EscenaTrama(
            titulo = "El Alacrán Milagroso, el Cañoncito de Oro y el Pleito al Demonio",
            detalle = "Fray Gómez convierte un alacrán de su celda en una joya de oro y rubíes para salvar de la quiebra a un buhonero, devolviéndolo a su condición de insecto tras pagar la deuda. Ramón Castilla devuelve un cañoncito de oro a un pretendiente que buscaba favores fiscales. Don Dimas de la Tijereta burla al diablo Lilith entregándole su almilla (chaleco de lana) en vez de su alma, ganándole la demanda judicial a Satanás."
        )
    ),
    temaPrincipal = "La recreación histórica, picaresca y desmitificadora de la memoria colectiva del Perú (con especial énfasis en el Virreinato limeño); el triunfo del ingenio, la agudeza criolla y la piedad popular frente al autoritarismo institucional eclesiástico, civil, militar o diabólico.",
    simbolosClave = listOf(
        "La camisa de novia enjoyada: Metáfora del ingenio criollo limeño para burlar un juramento restrictivo y símbolo del costo desorbitante en el habla popular.",
        "El término 'Quidquid' y la palmeta del rincón: Símbolos de la rebeldía de la inteligencia viva infantil frente a la pedagogía dogmática colonial de 'la letra con sangre entra'.",
        "La torre de ajedrez en Cajamarca: Emblema de la agudeza estratégica de Atahualpa que hiere fatalmente el resentimiento soberbio de los conquistadores.",
        "La lanza del Capitán Paiva: Símbolo del heroísmo popular sacrificado estérilmente por la obediencia ciega a los impulsos de los caudillos militares republicanos.",
        "El alacrán de Fray Gómez: Emblema de la caridad franciscana pura que transmuta lo venenoso en auxilio material desinteresado.",
        "El cañoncito de oro de Castilla: Símbolo del clientelismo y la adulación política que apunta a vaciar los fondos del tesoro público.",
        "La almilla de Don Dimas: Metáfora de la astucia leguleya de los escribanos limeños capaz de vencer al mismísimo demonio en los tribunales."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué corriente literaria pertenecen las 'Tradiciones Peruanas' y qué especie literaria inauguran?",
            respuesta = "Pertenecen al Romanticismo Peruano en su vertiente Histórica y Tradicionalista (con fuerte influencia del costumbrismo tardío). Inauguran la 'tradición', una especie narrativa original e híbrida creada por Ricardo Palma que combina historia documental, ficción novelesca y humor criollo."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es la estructura canónica interna de una tradición de Ricardo Palma?",
            respuesta = "Presenta un tríptico invariable: 1) Introducción histórica o digresión erudita con fuentes y fechas de virreyes; 2) Desarrollo novelado de la anécdota con diálogos y chispa criolla; y 3) Colofón o remate sentencioso con moraleja o explicación del origen de un refrán popular."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué motivo histórico recibió Ricardo Palma el apelativo honorífico de 'El Bibliotecario Mendigo'?",
            respuesta = "Porque tras la invasión chilena en la Guerra del Pacífico (1881), en la que la Biblioteca Nacional de Lima fue saqueada e incendiada, Palma asumió su dirección y la reconstruyó pidiendo libros de propia mano como donación ('mendingando libros') a intelectuales y gobiernos de todo el mundo."
        ),
        PreguntaClaveObra(
            pregunta = "¿A qué época histórica pertenece la inmensa mayoría de las tradiciones de Palma?",
            respuesta = "A la época del Virreinato del Perú (¡más del 60% de las tradiciones!), particularmente a los siglos XVII y XVIII en la ciudad de Lima (las intrigas virreinales, las tapadas, los conventos y los santos populares)."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué consiste la trama y la frase de la tradición 'La camisa de Margarita'?",
            respuesta = "El padre de Margarita (Raimundo Pareja) jura al tío de Luis Alcázar que solo entregará de dote 'la camisa de novia'. Raimundo cumple el juramento en apariencia, pero borda la camisa con encaje de Flandes y cordoncillos de brillantes valuados en más de 30.000 pesos de oro, dando origen a la frase: '¡Esto es más caro que la camisa de Margarita!'."
        )
    )
)
