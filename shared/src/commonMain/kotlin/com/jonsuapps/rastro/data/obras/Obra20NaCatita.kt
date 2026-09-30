package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra20NaCatita = ObraLiteraria(
    id = "na-catita",
    titulo = "Ña Catita",
    autor = "Manuel Ascencio Segura",    anio = "Siglo XIX (1856)",
    pais = "Perú",
    corriente = "Costumbrismo Republicano / Vertiente Criollista",
    genero = "Dramático",
    especie = "Comedia de costumbres (en cuatro actos en verso)",
    categoria = "Literatura Peruana",    colorHex = "#EA580C",
    sinopsis = """
        Ña Catita es la comedia fundacional del teatro nacional peruano, escrita enteramente en verso octosílabo por Manuel Ascencio Segura. Ambientada en la sala principal de la casa solariega de don Jesús y doña Rufina en la Lima de mediados del siglo XIX, la trama satiriza el arribismo social y la hipocresía beata a lo largo de cuatro actos:

        Acto I: Doña Rufina recrimina agriamente a su hija Juliana por rechazar el galanteo de don Alejo, un caballero maduro de porte afectado que presume de abolengo y modales europeos. Juliana, firme en su pureza, confiesa su amor inquebrantable hacia el joven y modesto Manuel, huérfano y protegido de su padre. Entra en escena Ña Catita, anciana beata, empobrecida y desdentada, que se persigna continuamente mientras engulle dulces y chocolate. Catita adula la vanidad arribista de Rufina y acusa a Juliana de rebeldía sacrílega. Aparece don Jesús, patriarca sobrio y honrado, quien aborrece las intrigas de la beata y defiende a Manuel, desatando una ácida disputa matrimonial.

        Acto II: Llega don Alejo vestido con extravagante elegancia de petimetre criollo, soltando pedantes frases en francés deformado y vanagloriándose de riquezas. Cuando Rufina le presenta a Juliana, la doncella lo rechaza con frialdad y evidente asco, dejándolo en ridículo. Tras marcharse el pretendiente, Manuel entra a escondidas con el auxilio de la criada Mercedes para jurar amor eterno a Juliana. Ña Catita espía la cita oculta tras las celosías y corre a insuflar veneno en los oídos de doña Rufina para forzar la expulsión de Manuel.

        Acto III: Ña Catita convence a Rufina de que Manuel planea deshonrar a su hija. Rufina pierde los estribos, insulta a su esposo tratándolo de incompetente y amenaza con romper el matrimonio y marcharse con Juliana para casarla de inmediato con Alejo. Jesús estalla en cólera y abandona la sala prometiendo imponer orden con mano firme. Viendo el obstáculo de Jesús, la pérfida Ña Catita urde un doble juego diabólico: se finge aliada de Manuel, le asegura que Rufina encerrará a Juliana en un convento esa noche y lo convence de fugar con la muchacha en la madrugada, cobrándole dinero para los pasajes. El plan oculto de Catita es delatar la fuga a Rufina para que la guardia arreste a Manuel y despeje el camino nupcial a don Alejo.

        Acto IV: En la penumbra de la medianoche, Manuel y Juliana, con mantos de viaje, se disponen a huir cuando son sorprendidos por don Jesús y doña Rufina, alertados por Catita. Cuando la catástrofe parece inminente y Rufina exige la boda inmediata con don Alejo (quien entra ataviado para la ceremonia), irrumpe en la casa don Juan, viejo amigo de la familia recién desembarcado del Cuzco. Al ver a don Alejo, don Juan exhibe cartas y documentos oficiales: revela públicamente que don Alejo es un estafador prófugo y un bígamo miserable, cuya legítima esposa e hijos lo reclaman legalmente en el Cuzco. Don Alejo huye despavorido ante el desprecio general. Doña Rufina, avergonzada y desengañada de su ceguera arribista, pide perdón de rodillas a su esposo. Don Jesús reconcilia el hogar, bendice la boda entre Juliana y Manuel, y expulsa enérgicamente a Ña Catita de su casa y de la vecindad con el repudio de la sociedad honrada.
    """.trimIndent(),
    contextoHistorico = """
        Estrenada en su versión definitiva de cuatro actos el 7 de septiembre de 1856 en el Teatro Variedades de Lima, 'Ña Catita' vio la luz en plena Era del Guano, bajo la presidencia del mariscal Ramón Castilla, época de bonanza económica y consolidación de la naciente República peruana.

        La Batalla del Costumbrismo: Criollismo vs. Anticriollismo:
        La literatura republicana se escindió en dos trincheras estéticas y políticas:
        1. Vertiente Anticriolla (Aristocrática y Conservadora): Liderada por Felipe Pardo y Aliaga ('Un viaje', 'Frutos de la educación'). Añoraba las jerarquías del virreinato, despreciaba las instituciones populares republicanas y empleaba un lenguaje neoclásico y castizo.
        2. Vertiente Criollista (Popular y Liberal): Encabezada por Manuel Ascencio Segura ('El Padre del Teatro Peruano'). Identificado con las clases medias y populares, retrató con gracia y picardía los tipos sociales limeños, introduciendo en la escena teatral el lenguaje vivo de la calle, los giros jergales, modismos y refranes criollos ('dar coba', 'armar la gorda', 'mosca muerta').

        El Teatro de Costumbres y la Crítica Social:
        Segura escribió para moralizar y corregir los vicios urbanos: ataca la imposición patriarcal o materna de matrimonios desiguales por interés económico, censura el arribismo social y la cursilería ('huachafería') de quienes pretendían imitar modales europeos vacíos, y desenmascara la hipocresía beata de las alcahuetas que medraban destruyendo hogares honrados.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Ña Catita (Doña Catalina)",
            rol = "La alcahueta criolla, beata chismosa e intrigante parásita",
            descripcion = "Arquetipo universal de la Celestina criolla. Anciana empobrecida y desdentada que disimula su veneno moral portando un rosario de cuentas gordas y rezando novenas. Se infiltra en los hogares atizando rencores, adulando las flaquezas de los soberbios y concertando matrimonios por dinero a cambio de limosnas, dulces y chocolate espeso. Urde la trampa de la fuga para lucrar con ambos bandos."
        ),
        PersonajeLiterario(
            nombre = "Don Jesús",
            rol = "Padre de familia, patriarca sensato, honrado y voz de la razón republicana",
            descripcion = "Representa la honestidad de la burguesía criolla trabajadora. Paciente pero enérgico, aborrece las fanfarronadas postizas de don Alejo y reconoce de inmediato en Ña Catita a un parásito destructor. Defiende la libertad de elección de su hija Juliana y respalda a Manuel por lealtad a un compadre difunto."
        ),
        PersonajeLiterario(
            nombre = "Doña Rufina",
            rol = "Madre de Juliana, mujer arribista, vanidosa y pretenciosa",
            descripcion = "Encarna el germen de la huachafería limeña: desea escalar socialmente ('darse tono') forzando a su hija a casarse con un pretendiente adinerado. Manipulable e ingenua, se deja embaucar por las zalamerías de Ña Catita y las poses afrancesadas de don Alejo, hasta sufrir una catarsis de arrepentimiento al revelarse el engaño."
        ),
        PersonajeLiterario(
            nombre = "Juliana",
            rol = "Hija de don Jesús y doña Rufina; doncella pura, virtuosa y rebelde",
            descripcion = "Joven de diecinueve años que defiende su autonomía moral. Rechaza con asco las pretensiones de don Alejo y se mantiene leal a Manuel, prefiriendo el claustro conventual antes que someterse a un matrimonio por conveniencia."
        ),
        PersonajeLiterario(
            nombre = "Manuel",
            rol = "Pretendiente legítimo de Juliana; joven hidalgo, honrado y pobre",
            descripcion = "Huérfano protegido de don Jesús. Aunque carece de fortuna o linaje, ama sinceramente a Juliana. En su desesperación cae en la trampa tendida por Ña Catita y acepta fugar con la muchacha, pero afronta las consecuencias con nobleza caballeresca."
        ),
        PersonajeLiterario(
            nombre = "Don Alejo",
            rol = "Falso dandi maduro, petimetre criollo, estafador y bígamo",
            descripcion = "Hombre de más de cincuenta años que finge juventud, conexiones nobiliarias y modales franceses afectados. En realidad es un vividor sin recursos que busca una dote para pagar deudas, ocultando que ya está casado y con hijos en el Cuzco."
        ),
        PersonajeLiterario(
            nombre = "Don Juan",
            rol = "Amigo de juventud de don Jesús; agente de resolución providencial (deus ex machina)",
            descripcion = "Caballero leal y noble que acaba de desembarcar en el Callao procedente del Cuzco. Su oportuna llegada a la casa con cartas judiciales dinamita el fraude de don Alejo al revelar su condición de bígamo."
        ),
        PersonajeLiterario(
            nombre = "Mercedes",
            rol = "Criada de la familia, astuta y leal a los amantes",
            descripcion = "Representa la perspicacia del pueblo llano limeño: advierte desde el inicio las artimañas de Ña Catita y ayuda a Juliana y Manuel en sus citas clandestinas."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Acto I: La Disputa Doméstica y la Infiltración de la Beata Alcahueta",
            detalle = "Doña Rufina intenta obligar a Juliana a aceptar a don Alejo como esposo. Juliana se niega, declarando su amor por Manuel. Entra Ña Catita fingiendo rezos y devoción, halagando la vanidad de Rufina para sacarle comida y dinero mientras desacredita a Juliana. Llega don Jesús, quien desprecia a Ña Catita y defiende el derecho de su hija a casarse con Manuel, desatándose un enfrentamiento abierto entre los cónyuges."
        ),
        EscenaTrama(
            titulo = "Acto II: Las Fanfarronadas de Don Alejo y el Desdén de Juliana",
            detalle = "Don Alejo visita la casa desplegando poses ridículas y soltando frases en francés postizo para deslumbrar a Rufina. Juliana comparece obligada pero rechaza los galanteos del dandi con frialdad y asco. Tras marcharse Alejo, Manuel ingresa a hurtadillas auxiliado por la criada Mercedes para renovar sus promesas de amor con Juliana; Ña Catita los espía tras la celosía y corre a denunciarlos ante doña Rufina."
        ),
        EscenaTrama(
            titulo = "Acto III: La Tiranía de Rufina y la Trampa de la Fuga Nocturna",
            detalle = "Envenenada por las mentiras de Catita, Rufina insulta a don Jesús amenazando con abandonar el hogar para casar a Juliana con Alejo. Don Jesús sale enfurecido prometiendo imponer orden. Ña Catita despliega su doble juego: engaña a Manuel haciéndole creer que Juliana será encerrada en un convento y lo induce a raptarla en la madrugada, cobrándole dinero para los gastos mientras prepara en secreto la delación para encarcelarlo."
        ),
        EscenaTrama(
            titulo = "Acto IV: La Fuga Frustrada, el Desengaño de la Bigamia y el Juicio a la Celestina",
            detalle = "Juliana y Manuel son sorprendidos en plena fuga por don Jesús y Rufina. En medio del escándalo llega don Alejo y, de improviso, don Juan recién llegado del Cuzco. Don Juan reconoce a Alejo y exhibe documentos que prueban que es un bígamo prófugo con familia en la sierra. Alejo huye avergonzado; Rufina se arrepiente de rodillas ante su esposo; don Jesús perdona a su mujer, bendice el matrimonio de Juliana y Manuel, y arroja a bastonazos y gritos a Ña Catita fuera de su casa."
        )
    ),
    temaPrincipal = "La crítica a la imposición matrimonial por conveniencia y arribismo social ('darse tono'); la censura satírica a la huachafería y pedantería afrancesada frente a la honestidad criolla, y la condena a la falsa beatería hipócrita encarnada en la alcahueta de sacristía.",
    simbolosClave = listOf(
        "El rosario de cuentas gordas: Símbolo de la devoción fingida y la hipocresía beata de Ña Catita, quien lo utiliza como escudo moral para sembrar cizaña.",
        "El coche y las frases en francés postizo: Metáforas del arribismo superficial y la huachafería limeña de doña Rufina y don Alejo, que confunden apariencia con virtud.",
        "Las cartas del Cuzco traídas por don Juan: El recurso del 'deus ex machina' que restituye la verdad jurídica y moral frente a la mentira colonial.",
        "El chocolate espeso y los dulces: Símbolos del parasitismo material de Ña Catita, quien medra a costa de la ingenuidad y vanidad de sus víctimas.",
        "La sala solariega limeña: Escenario único que concentra las tensiones de la vida privada y la institución familiar en la naciente república peruana.",
        "El sayo y mantón de viaje: Símbolo de la desesperación de los jóvenes amantes frente a la tiranía materna."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué corriente y vertiente literaria pertenece 'Ña Catita' de Manuel Ascencio Segura?",
            respuesta = "Pertenece al Costumbrismo Republicano, específicamente a la vertiente Criollista o Popular (¡NO al Romanticismo!). Segura, 'Padre del Teatro Nacional Peruano', lideró esta vertiente frente al Anticriollismo aristocrático y conservador de Felipe Pardo y Aliaga."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué arquetipo literario encarna el personaje protagónico de Ña Catita?",
            respuesta = "Encarna el arquetipo universal de la Celestina criolla y la alcahueta de sacristía: una anciana beata, chismosa e intrigante que, ocultándose tras rezos y un rosario, vive del parasitismo social atizando discordias y concertando matrimonios por dinero."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué doña Rufina insiste con tanta terquedad en casar a su hija Juliana con don Alejo?",
            respuesta = "Por vanidad y arribismo social (la clásica 'huachafería' limeña). Ve en don Alejo a un caballero maduro de apariencia refinada, fortuna y modales afrancesados ('darse tono' y tener un coche a la puerta), despreciando al honrado pero modesto Manuel por no tener fortuna."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién desenmascara la verdadera identidad de don Alejo y cuál es la revelación que desbarata sus planes?",
            respuesta = "Es don Juan, un viejo amigo de la familia recién llegado del Cuzco (¡NO Manuel ni don Jesús!). Don Juan revela con cartas judiciales que don Alejo es un farsante sin fortuna y, principalmente, un hombre bígamo cuya legítima esposa e hijos lo aguardan y reclaman en el Cuzco."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo concluye la obra respecto al destino de los amantes y de la alcahueta Ña Catita?",
            respuesta = "Doña Rufina sufre una catarsis y pide perdón de rodillas a don Jesús; este perdona a su esposa y bendice la boda entre Juliana y Manuel. Ña Catita es desenmascarada por sus cobros dobles y expulsada implacablemente de la casa por don Jesús con el repudio general."
        )
    )
)
