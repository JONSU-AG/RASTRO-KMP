package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra31LosInocentes = ObraLiteraria(
    id = "los-inocentes",
    titulo = "Los inocentes (Lima en rock)",
    autor = "Oswaldo Reynoso",    anio = "Siglo XX (1961 / 1964)",
    pais = "Perú",
    corriente = "Generación del 50 / Tránsito a la Generación del 60 / Narrativa Urbana de Contracultura / Grupo «Narración»",
    genero = "Narrativo",
    especie = "Libro orgánico de cuentos urbanos / Novela fragmentaria coral",
    categoria = "Literatura Peruana",    colorHex = "#7C3AED",
    sinopsis = """
        Los inocentes (1961), reeditada en 1964 con el célebre título alternativo Lima en rock, es la obra más transgresora, revolucionaria y poética de la narrativa juvenil peruana del siglo XX, escrita por el arequipeño Oswaldo Reynoso. La obra causó un terremoto cultural al introducir por primera vez en las letras peruanas la jerga viva de la calle, la música electrizante del rock and roll, la sexualidad descarnada y la angustia existencial de la 'collera' (pandilla juvenil de esquina) en los barrios populares de Lima (La Victoria y Chorrillos) a través de cinco relatos magistralmente interconectados:

        I. Cara de Ángel (Lucho): Adolescente de quince años cuya extraordinaria belleza física (tez blanca, ojos claros, facciones finas) le vale el apodo de 'Cara de Ángel'. En la atmósfera viciosa y humeante de los billares de la avenida Manco Cápac, viejos perversos y proxenetas adinerados lo acechan con billetes crujientes y cigarrillos rubios para corromperlo. Lucho siente náusea y terror ante el fango moral; desea jugar al fútbol y enamorar a una muchacha de su edad como los demás chicos, pero la miseria de su hogar y la orfandad lo acorralan. Llora frente al espejo roto del billar, comprendiendo que su hermosura es una maldición que la ciudad devorará.

        II. El Príncipe (Roberto): El líder temerario, gallardo y admirado de la collera. Viste pantalones ajustados, camisa desabotonada y peina su copete engominado al estilo de James Dean al son del rock de las rocolas. Para mantener su estatus de ídolo barrial, se desempeña como un hábil 'lanza' (carterista en el tranvía de Lima). Una tarde en la plaza Manco Cápac, una víctima da la alarma al sentir sus dedos en el bolsillo: el Príncipe huye entre los autos, pero es acorralado en un callejón y golpeado brutalmente por la policía ante la mirada atónita de sus amigos, perdiendo su corona y cayendo en el infierno de la comisaría.

        III. Carambola (El Choro): Retrata el salón de billar como el templo iniciático de la adolescencia marginal. El Choro es el maestro indiscutible del taco sobre el paño verde, capaz de ejecutar carambolas imposibles a tres bandas. Entre tiza azul y humo espeso, los muchachos encuentran en el billar el único refugio frente a la violencia doméstica, el hacinamiento de los callejones y la discriminación clasista de los colegios ricos de Miraflores.

        IV. Colorete: Adolescente cholo y mestizo que lucha contra el complejo de inferioridad racial acicalándose desesperadamente con brillantina de limón y colonia barata. Asiste ilusionado a una fiesta en casa de Juana, la chica del barrio que le quita el sueño. Al compás del rock lento, Colorete saca a bailar a Juana y recibe una gélida mirada de rechazo: la muchacha prefiere marcharse con un chico blanco de ojos verdes. Colorete huye a emborracharse a una cantina maldiciendo en soledad el color de su piel.

        V. El Rosquita (Goro): Muchacho sensible, tímido y de modales suaves, víctima del acoso implacable de la collera que lo tilda de afeminado. Para no ser desterrado de la pandilla, acepta someterse a una salvaje 'prueba de virilidad' en los arenales de Chorrillos con una mujer enajenada y alcoholizada. Goro se quiebra en llanto, dominado por el asco y la piedad moral, incapaz de consumar el ultraje. Sus camaradas estallan en carcajadas despiadadas, sellando su aislamiento y desnudando la atroz crueldad del machismo callejero.
    """.trimIndent(),
    contextoHistorico = """
        Publicado en 1961 en Lima, 'Los inocentes' inauguró una nueva sensibilidad estética y lingüística en la literatura urbana latinoamericana.

        El Escándalo Puritano y la Consagración de Arguedas:
        Al salir de imprenta, los sectores conservadores y la crítica académica de la prensa limeña desataron un feroz linchamiento contra el libro, acusándolo de 'inmundicia pornográfica, cloaca moral y atentado contra el idioma'. Frente a la hostilidad burguesa, José María Arguedas publicó una histórica defensa consagratoria: 'Reynoso ha creado un nuevo estilo... una poesía desgarradora que brota del fango, la ternura y la soledad de nuestra juventud de barrio. Quienes lo llaman inmoral no ven la inocencia trágica de estos muchachos abandonados por un país egoísta'.

        La Contracultura del Rock and Roll y la Collera:
        En los años sesenta, los hijos de migrantes provincianos afincados en Lima rompieron tanto con la música criolla colonial como con el folclore andino de sus padres: abrazaron el Rock and Roll (Bill Haley, Elvis), las rocolas, el billar y los cines continuados. La 'collera' de esquina se convirtió en su única trinchera afectiva y comunitaria frente a la hostilidad de una urbe clasista.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Cara de Ángel (Lucho)",
            rol = "Adolescente de belleza angelical y pureza amenazada",
            descripcion = "Muchacho de quince años con rostro fino y ojos claros; vive asediado por adultos perversos y proxenetas en los billares. Se debate en la angustia entre la miseria económica de su hogar y el deseo desesperado de no prostituirse."
        ),
        PersonajeLiterario(
            nombre = "El Príncipe (Roberto)",
            rol = "Líder carismático de la collera y carterista juvenil",
            descripcion = "El dandi de barrio; peina tupé engominado y viste al compás del rock and roll. Financia su vanidad como 'lanza' (carterista del tranvía) hasta ser capturado y golpeado salvajemente por la policía."
        ),
        PersonajeLiterario(
            nombre = "Colorete",
            rol = "Muchacho mestizo marcado por el complejo racial",
            descripcion = "Adolescente cholo que busca superar el estigma de su piel acicalándose con brillantina y perfume barato; experimenta el desprecio clasista en una fiesta barrial al ser rechazado por Juana."
        ),
        PersonajeLiterario(
            nombre = "El Choro (Carambola)",
            rol = "Maestro del taco y rey del salón de billar",
            descripcion = "Muchacho frío y hábil que encuentra en las carambolas de tres bandas el único instante de control y belleza de su vida marginal."
        ),
        PersonajeLiterario(
            nombre = "El Rosquita (Goro)",
            rol = "Miembro sensible de la collera y víctima de homofobia",
            descripcion = "Muchacho tímido atormentado por las burlas de sus compañeros; fracasa en la prueba de virilidad impuesta por el grupo al negarse a violentar a una mujer desvalida, sufriendo el desprecio colectivo."
        ),
        PersonajeLiterario(
            nombre = "La «Collera»",
            rol = "Protagonista colectivo barrial",
            descripcion = "Pandilla de adolescentes de esquina y billar que comparten ocio, frustraciones, jerga y ritos de iniciación, operando como refugio afectivo y a la vez como cárcel de machismo opresivo."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Cara de Ángel y el Espejo Roto del Billar",
            detalle = "En un salón de billar de la avenida Manco Cápac, hombres adultos intentan comprar con dinero la compañía de Lucho ('Cara de Ángel'). El muchacho siente náusea y llora en silencio ante el espejo quebrado del billar, comprendiendo que la pobreza de su hogar terminará empujándolo al fango."
        ),
        EscenaTrama(
            titulo = "La Caída del Príncipe en la Parada del Tranvía",
            detalle = "Roberto ('El Príncipe') roba billeteras con destreza en los tranvías para comprarse ropa de moda al ritmo del rock and roll. En la plaza Manco Cápac es descubierto in fraganti: corre despavorido, pero la policía lo derriba a patadas y se lo lleva ensangrentado en un furgón ante la mirada atónita de su pandilla."
        ),
        EscenaTrama(
            titulo = "El Templo del Billar y la Maestría de Carambola",
            detalle = "Bajo las luces amarillentas y el polvo de tiza azul, el Choro deslumbra a la collera ejecutando carambolas maestras de tres bandas. El billar se consagra como el santuario de los muchachos marginados, donde olvidan los golpes paternos y las miserias de la niebla limeña."
        ),
        EscenaTrama(
            titulo = "El Baile Frustrado de Colorete y la Herida Racial",
            detalle = "Colorete se peina con brillantina de limón y asiste esperanzado a una fiesta de cumpleaños para conquistar a Juana. La muchacha lo rechaza con desdén clasista prefiriendo bailar con un joven rubio. Colorete se emborracha en una cantina y llora de rabia impotente por su color de piel."
        ),
        EscenaTrama(
            titulo = "El Rito Machista Fallido del Rosquita en Chorrillos",
            detalle = "Para liberarse del apodo afrentoso de 'El Rosquita', Goro es llevado por la collera a un arenal de Chorrillos para consumar una prueba de virilidad forzada con una mujer desquiciada. Goro se niega con piedad y horror; sus compañeros estallan en carcajadas despiadadas, sellando la soledad del muchacho."
        )
    ),
    temaPrincipal = "La desolación existencial, la angustia identitaria, el despertar sexual y la marginalidad de los adolescentes de barrio en la Lima moderna; la collera de esquina como refugio fraternal y jaula de machismo violento; y la inocencia profanada de unos jóvenes arrastrados al fango por una sociedad clasista e hipócrita.",
    simbolosClave = listOf(
        "La «collera» de esquina: Refugio afectivo, tribu urbana y cárcel moral donde los adolescentes buscan pertenencia frente al desamparo social.",
        "El salón de billar y la tiza azul: Microcosmos y templo iniciático de la adolescencia marginal donde se forjan los códigos de honor callejero.",
        "La rocola y el rock and roll: Banda sonora de la contracultura juvenil que expresa la rebeldía y el desarraigo de la nueva generación urbana.",
        "El copete engominado del Príncipe: Emblema de la gallardía, el orgullo dandi y la frágil mitología delincuencial que se quiebra en la prisión.",
        "La brillantina con olor a limón de Colorete: Símbolo del intento fallido de acicalamiento para ocultar la identidad mestiza frente al racismo.",
        "El espejo quebrado del billar: Reflejo de la identidad fracturada y la pérdida ineludible de la pureza en medio del asedio de la urbe."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Con qué título alternativo y célebre se conoce al libro 'Los inocentes' de Oswaldo Reynoso?",
            respuesta = "Se le conoce como 'Lima en rock', título adoptado a partir de la reedición de 1964 debido a la omnipresencia de la música rock and roll en la ambientación urbana de los relatos."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué significado ético y social encierra el título 'Los inocentes'?",
            respuesta = "Los adolescentes de la collera son calificados de 'inocentes' porque sus extravíos, agresividad y coqueteos con el delito no nacen de una maldad innata, sino del desamparo afectivo, la miseria y la corrupción de la sociedad que los excluye y juzga con hipocresía."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué papel desempeñó José María Arguedas tras el escándalo que provocó la publicación de la obra en 1961?",
            respuesta = "Defendió públicamente a Reynoso frente al linchamiento moral de la crítica conservadora que tildaba el libro de pornografía, consagrando la obra como una revolución estética que unía el lenguaje callejero con la más pura y desgarradora poesía."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo concluye la historia de Roberto ('El Príncipe')?",
            respuesta = "Es descubierto mientras roba una billetera en el tranvía de la plaza Manco Cápac, siendo perseguido, golpeado y capturado violentamente por la policía ante sus amigos, desmoronándose su condición de líder mítico del barrio."
        )
    )
)
