package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra32ElPezDeOro = ObraLiteraria(
    id = "el-pez-de-oro",
    titulo = "El pez de oro (Retablos del Laykhakuy)",
    autor = "Gamaliel Churata (Arturo Peralta Miranda)",    anio = "Siglo XX (1957)",
    pais = "Perú",
    corriente = "Vanguardismo Andino / Indigenismo Telúrico y Filosófico / Grupo «Orkopata» y Revista «Boletín Titikaka»",
    genero = "Híbrido monumental (Novela-ensayo, mito cosmogónico y retablo filosófico)",
    especie = "Retablo lírico-filosófico / Cosmovisión andina total",
    categoria = "Literatura Peruana",    colorHex = "#D97706",
    sinopsis = """
        El pez de oro. Retablos del Laykhakuy (La Paz, 1957) es la obra cumbre de la vanguardia andina y el monumento filosófico-literario más audaz del siglo XX en el Altiplano indoamericano, escrito por el patriarca intelectual Gamaliel Churata (seudónimo indigenista de Arturo Peralta Miranda). Fruto de más de tres décadas de redacción durante su prolongado exilio en Bolivia, el libro constituye una rebelión ontológica y lingüística total contra el eurocentrismo racionalista, proclamando la descolonización mental de América mediante la resurrección mítica del Pez de Oro en las aguas sagradas del Lago Titicaca a través de una serie de retablos y visiones cosmogónicas:

        I. La Homilía del Korikancha (El Sol y la Cruz): Choque ontológico entre la religión cósmica andina y el catolicismo inquisitorial español. Churata denuncia la cruz colonial como herramienta de dominación que pretendió sepultar al Dios Sol (Inti) bajo el dogma de la culpa y el pecado original. Afirma que el sol andino permanece vivo e inmanente en las piedras ciclópeas del Coricancha bajo los muros de los frailes dominicos, exhortando al hombre americano a liberarse del terror eclesiástico para reencontrarse con su matriz solar.

        II. Los Sapos y la Lluvia Sagrada: Demostración del animismo y la reciprocidad ecológica andina (Ayni). Recrea el rito ancestral de los comuneros aymaras que ascienden a los cerros tutelares en tiempos de sequía con sapos vivos en vasijas de barro; el croar desgarrador de los batracios dialoga con las nubes celestes invocando la lluvia bienhechora sin pretensión de dominio tecno-capitalista.

        III. La Sirena del Titicaca y la Tentación: Emerge en las noches de luna llena sobre las peñas de la Isla del Sol una criatura prodigiosa: mitad doncella con senos de oro y mitad pez plateado. Su canto hipnótico seduce a los filósofos andinos arrastrándolos al abismo. Churata la interpreta como la alegoría viva del mestizaje cultural: fuerza sensual, desgarrada y volcánica que seduce al hombre americano. Quien desciende a las aguas sin traicionar su raíz ancestral halla en las profundidades el tesoro primordial del Pez de Oro.

        IV. El Monolito de Tiwanaku y la Palabra de Piedra: Elogio de la arquitectura lítica tiwanacota como escritura ideográfica eterna frente a la vanidad efímera del papel europeo. Churata desbarata el prejuicio colonial de que los pueblos prehispánicos eran 'analfabetos': las tallas de la Puerta del Sol y el monolito Bennett son tratados de física, astronomía y teología grabados en andesita para perdurar millones de años.

        V. El Juicio Final Andino y el Pachacuti: Profecía colosal del gran vuelco cósmico (Pachacuti). El Lago Titicaca hierve en un cataclismo de aguas doradas; el Pez de Oro salta quebrando las ataduras coloniales de la historia y las almas de millones de indígenas sacrificados en la mita de Potosí resucitan en cuerpos de luz solar, restaurando la soberanía del continente americano.
    """.trimIndent(),
    contextoHistorico = """
        Gestada entre las décadas de 1920 y 1950 y publicada en La Paz (Bolivia) en 1957 por la Editorial Canata, la obra representa la cúspide de la vanguardia andina hispanoamericana.

        El Grupo Orkopata y el Boletín Titikaka (Puno, 1926-1930):
        En la década de 1920, la ciudad de Puno se erigió en epicentro intelectual de vanguardia continental. Gamaliel Churata fundó el Grupo Orkopata y dirigió el mítico 'Boletín Titikaka', publicación tabloide que dialogaba de igual a igual con las vanguardias europeas (Surrealismo, Ultraísmo). A diferencia de la vanguardia europea fascinada por las máquinas y rascacielos, Orkopata proclamó una vanguardia telúrica nacida de las entrañas milenarias del Titicaca y de la cosmovisión quechua-aymara.

        El Exilio en Bolivia y la Creación del Idioma Insurrecto:
        Perseguido por la dictadura de Leguía por sus convicciones socialistas e indigenistas, Churata se exilió en Bolivia durante más de treinta años. En La Paz escribió 'El pez de oro' en miles de cuartillas sueltas. Concibió que someterse a la Real Academia Española era vasallaje cultural, forjando el 'espaplata': una hibridación radical donde la sintaxis y fonética castellana quedan intervenidas y subordinadas a las estructuras aglutinantes del quechua y aymara.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Pez de Oro (Quri Challwa)",
            rol = "Tótem cosmogónico, sol sumergido y matriz generadora",
            descripcion = "No es un pez biológico; es la semilla primordial de la vida y el sol hundido en las profundidades del Lago Titicaca durante la Conquista, destinado a emerger triunfante en el Pachacuti para restaurar la civilización andina."
        ),
        PersonajeLiterario(
            nombre = "La Sirena del Titicaca",
            rol = "Alegoría sensual del mestizaje y mediadora del abismo",
            descripcion = "Criatura mitad doncella de senos dorados y mitad pez plateado que habita en las peñas lacustres; simboliza el mestizaje cultural desgarrado, seductor y peligroso que arrastra al hombre hacia las aguas matrices."
        ),
        PersonajeLiterario(
            nombre = "El Khirkhinchu (El Armadillo)",
            rol = "Arquetipo de la inmolación sagrada y la música telúrica",
            descripcion = "Animal mudo que ofrenda voluntariamente su vida para que su caparazón se convierta en charango, alcanzando la inmortalidad a través del canto y la queja cósmica andina."
        ),
        PersonajeLiterario(
            nombre = "El Layqa (Chamán / Filósofo Andino)",
            rol = "Sujeto ritual del Laykhakuy y oficiante de la palabra cósmica",
            descripcion = "Sabio y hechicero altiplánico que canaliza las fuerzas de los apus, achachilas y yatiris para alterar la realidad material y descolonizar el espíritu del pueblo."
        ),
        PersonajeLiterario(
            nombre = "Los Comuneros Aymaras y los Sapos Sagrados",
            rol = "Encarnación de la reciprocidad comunitaria (Ayni)",
            descripcion = "Campesinos del Altiplano que dialogan fraternalmente con la fauna telúrica en las cumbres montañosas para implorar la fertilidad y la lluvia sin soberbia destructiva."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La Resistencia Solar en el Coricancha",
            detalle = "Churata confronta los muros coloniales de Santo Domingo con las bases incaicas del Coricancha en el Cusco, demostrando que la luz del Sol (Inti) late invicta bajo el dogma eclesiástico de la culpa traído por los conquistadores."
        ),
        EscenaTrama(
            titulo = "El Diálogo de los Sapos en las Alturas del Collao",
            detalle = "En plena sequía andina, los comuneros llevan sapos vivos en vasijas a las cumbres heladas; los gemidos de los batracios despiertan la compasión cósmica de las nubes demostrando el principio sagrado del Ayni."
        ),
        EscenaTrama(
            titulo = "La Seducción de la Sirena y el Descenso Abisal",
            detalle = "Bajo el resplandor lunar de la Isla del Sol, la sirena entona su canto telúrico atrayendo a los iniciados; el alma mestiza debe sumergirse en sus aguas sin renegar de su origen para desenterrar el secreto del Pez de Oro."
        ),
        EscenaTrama(
            titulo = "La Escritura de Piedra en Tiwanaku",
            detalle = "Frente a la Puerta del Sol y el monolito Bennett, se reivindica la grafía lítica tiwanacota como ciencia y metafísica eterna superior al papel perecedero de la civilización occidental."
        ),
        EscenaTrama(
            titulo = "El Salto del Pez de Oro y el Pachacuti Continental",
            detalle = "El Lago Titicaca entra en ebullición dorada y el Pez de Oro emerge hacia el cielo quebrando el yugo colonial; las almas de los mitayos resucitan e inician la era de soberanía y renacimiento andino."
        )
    ),
    temaPrincipal = "La reivindicación de la filosofía, ontología y cosmovisión andinas frente al colonialismo eurocéntrico; el Lago Titicaca como matriz mítica del hombre americano; la regeneración cósmica e histórica (Pachacuti) mediante el mito del Pez de Oro; y la insurrección estética y lingüística quechua-aymara sobre el castellano.",
    simbolosClave = listOf(
        "El Pez de Oro (Quri Challwa): Sol sumergido, sabiduría ancestral y semilla de redención cósmica y política del continente andino.",
        "El Lago Titicaca: Mar interior sagrado, vientre nutricio de la civilización y escenario de resurrección ontológica.",
        "El Laykhakuy: Hechicería poética y ritual chamánico que dota al lenguaje de poder transformador sobre la realidad.",
        "El Khirkhinchu (charango): Inmolación del armadillo para nacer a la música eterna; persistencia del arte andino.",
        "La Sirena lacustre: El mestizaje cultural sensual, enigmático y trágico como umbral hacia el autodescubrimiento.",
        "La piedra de Tiwanaku: Escritura ideográfica imperecedera que desafía el alfabeto latino y el tiempo colonial."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es el verdadero nombre civil del autor de 'El pez de oro' y cuál fue su seudónimo?",
            respuesta = "Su verdadero nombre civil fue Arturo Peralta Miranda, y firmó su obra cumbre bajo el seudónimo indigenista y de combate Gamaliel Churata."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué importante grupo de vanguardia fundó Churata en Puno y qué legendaria revista dirigió?",
            respuesta = "Fundó el Grupo «Orkopata» en Puno junto a su hermano Alejandro Peralta y dirigió la revista vanguardista continental «Boletín Titikaka» (1926-1930)."
        ),
        PreguntaClaveObra(
            pregunta = "¿Dónde y en qué año se publicó por primera vez 'El pez de oro'?",
            respuesta = "Se publicó en La Paz, Bolivia, en 1957 (Editorial Canata), tras más de tres décadas de gestación y redacción durante su exilio político."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué representa el 'Pez de Oro' en el sistema simbólico de la obra?",
            respuesta = "Representa el tótem cosmogónico del Lago Titicaca, el sol sumergido tras la Conquista y la matriz de sabiduría que renace en el Pachacuti para restaurar la soberanía del hombre andino."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué consiste la revolución lingüística planteada por Churata en esta obra?",
            respuesta = "En quebrar el canon del castellano académico peninsular subordinando la sintaxis y fonética española a la estructura aglutinante, musicalidad y cosmovisión del quechua y del aymara ('espaplata')."
        )
    )
)
