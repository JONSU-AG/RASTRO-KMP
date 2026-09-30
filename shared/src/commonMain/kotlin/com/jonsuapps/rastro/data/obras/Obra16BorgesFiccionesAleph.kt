package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra16BorgesFiccionesAleph = ObraLiteraria(
    id = "ficciones-y-el-aleph",
    titulo = "Ficciones y El Aleph",
    autor = "Jorge Luis Borges",    anio = "Siglo XX (1944-1949)",
    pais = "Argentina",
    colorHex = "#4F46E5",
    corriente = "Narrativa fantástica hispanoamericana contemporánea / Posmodernismo filosófico",
    genero = "Narrativo",
    especie = "Cuentos filosóficos, relatos fantásticos y policiales metafísicos",
    categoria = "Literatura Hispanoamericana",    sinopsis = """
        Publicadas respectivamente en 1944 y 1949 en Buenos Aires, 'Ficciones' y 'El Aleph' constituyen la cumbre estética e intelectual de Jorge Luis Borges y dos de las obras más revolucionarias e influyentes de la literatura universal del siglo XX. Con una concisión verbal matemática y una erudición prodigiosa, Borges demolió el realismo psicológico decimonónico para erigir una mitología filosófica donde el universo se concibe como un laberinto indescifrable, una biblioteca inagotable o una ficción soñada por otros.

        En 'Ficciones', Borges despliega la metaficción absoluta: en 'Tlön, Uqbar, Orbis Tertius' una sociedad secreta inventa un planeta idealista cuya enciclopedia apócrifa termina colonizando y disolviendo la realidad empírica; en 'Pierre Menard, autor del Quijote' postula la proeza paradójica de reescribir literalmente el texto de Cervantes desde el siglo XX; en 'Las ruinas circulares' un mago engendra a un hijo soñándolo minuciosamente para descubrir aterrado que él mismo es la ilusión soñada por otro; en 'La biblioteca de Babel' el cosmos se equipara a infinitas galerías hexagonales que albergan todas las combinaciones posibles de letras; en 'El jardín de senderos que se bifurcan' el espía Yu Tsun descifra el enigma de su antepasado Ts'ui Pên, descubriendo que el laberinto es una novela infinita de universos paralelos y tiempos simultáneos; en 'Funes el memorioso' expone la tragedia del muchacho paralítico con memoria visual absoluta incapaz de pensar; en 'La muerte y la brújula' el detective cerebral Lönnrot es cazado en una trampa geométrica y cabalística urdida por el gánster Scharlach; y en 'El Sur' Juan Dahlmann encuentra la redención heroica en un duelo a cuchillo en la pampa tras rozar la muerte por septicemia.

        En 'El Aleph', Borges profundiza en la infinitud y la disolución de la identidad: en 'El inmortal' el tribuno Rufo descubre que la eternidad despoja de valor ético a la vida humana y halla a Homero como un troglodita mudo; en 'Biografía de Tadeo Isidoro Cruz' el sargento de policía descubre su destino al pelear codo a codo junto al desertor Martín Fierro ('Cualquier destino consta de un solo momento: cuando el hombre sabe quién es'); en 'La casa de Asterión' humaniza al Minotauro de Creta en su dédalo de soledad, esperando la llegada de su Redentor para dejarse matar sin resistencia; y en el relato titular 'El Aleph', en el oscuro sótano de la calle Garay bajo el escalón decimonoveno, el narrador contempla la totalidad del cosmos en una pequeña esfera tornasolada de dos centímetros donde coexisten simultáneamente todos los puntos del espacio universal.
    """.trimIndent(),
    contextoHistorico = """
        En la Nochebuena de 1938, Borges sufrió un accidente gravísimo al golpearse la cabeza con el marco de una ventana recién pintada, contrayendo una septicemia que lo mantuvo al borde de la muerte con fiebres alucinadas. Temiendo haber perdido sus facultades intelectuales, decidió experimentar con un género nuevo para él: la ficción fantástica en prosa, concibiendo los relatos que integrarían 'Ficciones' (1944) y 'El Aleph' (1949).

        La narrativa borgeana transformó las letras universales mediante una profunda revolución conceptual:
        1. La ficción como ensayo y la erudición apócrifa: Borges suprime el desvarío de escribir novelas de quinientas páginas; prefiere simular que esos libros ya existen y redactar una reseña crítica inventando fuentes, citas de enciclopedias y bibliografías apócrifas mezcladas con filósofos reales (Spinoza, Schopenhauer, Berkeley).
        2. El panteísmo idealista y la identidad única: Influenciado por el idealismo de Berkeley, postula que el mundo exterior es una proyección de la mente y que la individualidad es una ilusión: 'un hombre es todos los hombres'; el perseguidor y el verdugo intercambian destinos.
        3. El laberinto y el tiempo simultáneo: El tiempo no es lineal ni progresivo; es una red infinita de senderos que se bifurcan, donde un solo instante contiene el pasado, el presente y el porvenir.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Yu Tsun y Stephen Albert",
            rol = "Espía y sinólogo en 'El jardín de senderos que se bifurcan'",
            descripcion = "Yu Tsun es un profesor chino que espía para Alemania en Inglaterra acosado por el capitán Madden; Stephen Albert es el erudito inglés que descifra el laberinto temporal de Ts'ui Pên. Yu Tsun lo asesina fríamente como único método para transmitir por la prensa el nombre de la ciudad francesa que debe ser bombardeada, cargando con una infinita contrición interior."
        ),
        PersonajeLiterario(
            nombre = "Pierre Menard",
            rol = "Escritor simbolista francés apócrifo",
            descripcion = "Autor decimonónico que asume la empresa sobrehumana de escribir 'El Quijote' no por copia ni por transposición, sino palabra por palabra y línea por línea coincidiendo exactamente con Cervantes, convirtiendo un texto clásico en una paradoja filosófica contemporánea infinitamente más sutil y rica."
        ),
        PersonajeLiterario(
            nombre = "El Soñador de las Ruinas Circulares",
            rol = "Mago demiurgo",
            descripcion = "Extranjero taciturno que desembarca en un templo quemado con el propósito de soñar a un hombre con integridad minuciosa e imponerlo a la realidad. Al final, cercado por un incendio, descubre que el fuego no quema sus carnes, comprendiendo con alivio y terror que él mismo es un fantasma soñado por otro demiurgo."
        ),
        PersonajeLiterario(
            nombre = "Ireneo Funes",
            rol = "El joven prodigio de Fray Bentos en 'Funes el memorioso'",
            descripcion = "Muchacho uruguayo que, tras una caída de caballo, queda tullido pero adquiere una percepción y memoria infinita donde recuerda la forma de cada nube y cada grieta. Borges revela su tragedia: abrumado por el inventario inconmensurable de los detalles sensibles, Funes es casi incapaz de pensar, pues pensar es olvidar diferencias y generalizar."
        ),
        PersonajeLiterario(
            nombre = "Erik Lönnrot y Red Scharlach",
            rol = "Detective razonador y gánster vengador en 'La muerte y la brújula'",
            descripcion = "Lönnrot se cree un puro intelecto geométrico guiado por la Cábala y los puntos cardinales; Scharlach es el criminal que teje un falso laberinto de crímenes místicos explotando la pedantería de su rival para atraerlo a la quinta Triste-le-Roy y fusilarlo en venganza."
        ),
        PersonajeLiterario(
            nombre = "Juan Dahlmann",
            rol = "Secretario bibliotecario en 'El Sur'",
            descripcion = "Criollo desgarrado entre su linaje germánico y su herencia gaucha. Tras convalecer de septicemia viaja en tren a su estancia del Sur; en una pulpería campestre recoge la daga que le arroja un viejo gaucho y sale a la llanura a morir en un duelo de facones, eligiendo la muerte heroica que hubiera soñado en el sanatorio."
        ),
        PersonajeLiterario(
            nombre = "Asterión",
            rol = "El Minotauro humanizado en 'La casa de Asterión'",
            descripcion = "Habitante solitario del palacio de Creta (el laberinto de infinitas encrucijadas). Lejos de ser una fiera salvaje, es un ser melancólico que pasa los siglos esperando a su 'Redentor', dejándose matar sin resistencia por la espada de Teseo para escapar del encierro eterno."
        ),
        PersonajeLiterario(
            nombre = "Carlos Argentino Daneri y el Narrador Borges",
            rol = "Protagonistas de 'El Aleph'",
            descripcion = "Daneri es un poeta mediocre y pedante que redacta un poema farragoso sobre la redondez de la Tierra auxiliado por el Aleph del sótano de su casa en la calle Garay; el narrador Borges acude fascinado por el recuerdo de su amada muerta Beatriz Viterbo y experimenta en el sótano el vértigo sagrado de contemplar la totalidad del cosmos en un solo punto."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Ficciones I: El jardín de senderos que se bifurcan (Tlön, Menard, Ruinas Circulares y la Biblioteca de Babel)",
            detalle = """
                En 'Tlön, Uqbar, Orbis Tertius', una cita casual sobre la abominación de los espejos conduce al hallazgo del tomo XI de la enciclopedia de Tlön, un planeta inventado por una sociedad secreta donde rige el idealismo absoluto de Berkeley: las cosas existen sólo en la mente y desaparecen si se olvidan; poco a poco, los objetos pesadísimos de Tlön irrumpen en la tierra hasta que el orden riguroso de la ficción coloniza la historia y el lenguaje humano.

                En 'Pierre Menard, autor del Quijote', un crítico examina la obra invisible del escritor simbolista francés que se propuso escribir el Quijote palabra por palabra en pleno siglo XX, demostrando que dos textos literalmente idénticos resultan radicalmente distintos según el contexto y fundando la técnica del anacronismo deliberado.

                En 'Las ruinas circulares', un mago arriba a un templo circular calcinado con el propósito de soñar a un hombre e imponerlo a la realidad. Sueña minuciosamente sus órganos y cabellos, y el dios del Fuego le infunde vida a cambio de que sea invulnerable a las llamas; al final de sus días, cercado por un incendio voraz, el mago camina hacia el fuego y descubre que las llamas no lo queman, comprendiendo con alivio y terror que él también es una ilusión soñada por otro.

                En 'La biblioteca de Babel', el cosmos se define como una biblioteca de galerías hexagonales infinitas que reúne todos los libros posibles mediante la combinación aleatoria de veinticinco caracteres ortográficos, albergando la verdad suprema pero sumiendo a los bibliotecarios en la desesperación del caos y el sinsentido.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Ficciones II: El laberinto del tiempo de Ts'ui Pên y el enigma de Yu Tsun",
            detalle = """
                En el cuento 'El jardín de senderos que se bifurcan', ambientado durante la Primera Guerra Mundial en 1916, el doctor Yu Tsun —espía chino al servicio del Imperio Alemán— huye del implacable capitán británico Richard Madden con la ubicación secreta de la artillería inglesa en la ciudad de Albert. Con una sola bala en el revólver, acude a la casa del ilustre sinólogo Stephen Albert.

                Albert lo recibe y le revela la solución al enigma secular de su antepasado Ts'ui Pên, quien pretendió escribir un libro infinito y construir un laberinto en el que se perdieran todos los hombres. Albert demuestra que la novela caótica y el laberinto son un mismo objeto: una obra donde el protagonista no elige una opción eliminando las demás, sino que adopta simultáneamente todas las bifurcaciones posibles, creando infinitos universos paralelos y tiempos divergentes.

                Al ver a Madden avanzar por el jardín, Yu Tsun comprende que su única opción para enviar el mensaje es matar a su anfitrión: dispara al corazón de Albert; Madden lo arresta y es condenado a la horca, pero Berlín descifra la clave en los periódicos y bombardea la ciudad de Albert, sellando su triunfo militar en medio de una infinita contrición.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Ficciones III: Artificios (Funes el memorioso, La muerte y la brújula, El milagro secreto y El Sur)",
            detalle = """
                En 'Funes el memorioso', el joven uruguayo Ireneo Funes queda tullido tras una rodada y adquiere una percepción milimétrica infalible; no olvida el curso de ninguna nube ni de ninguna hoja, pero Borges expone su tragedia cognitiva: al estar abrumado por los detalles materiales, es incapaz del pensamiento abstracto.

                En 'La muerte y la brújula', el detective cerebral Erik Lönnrot investiga tres asesinatos en fechas 3 y deduce con base en el Tetragrámaton y la Cábala que debe ocurrir un cuarto crimen en el Sur para formar un rombo perfecto; al acudir a la quinta Triste-le-Roy el 3 de marzo, cae en la emboscada de Red Scharlach, quien urdió la trama geométrica para atrapar la soberbia intelectual del detective y fusilarlo.

                En 'El milagro secreto', el dramaturgo judío Jaromir Hladík es condenado a muerte en Praga por los nazis; ante el pelotón de fusilamiento pide a Dios un año para terminar su obra teatral: el tiempo físico exterior se congela y durante un año mental concluye su drama en su cabeza hasta que la bala lo alcanza.

                En 'El Sur', Juan Dahlmann convaleciente de septicemia viaja en tren hacia la pampa arcaica; en una pulpería rural es desafiado por unos compadritos ebrios y, al recibir una daga desnuda arrojada por un viejo gaucho, cruza el umbral hacia la llanura para morir en un duelo a cuchillo, abrazando la muerte heroica y romántica que hubiera deseado.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "El Aleph I: La Inmortalidad, el Destino de Cruz y la Redención de Asterión",
            detalle = """
                En 'El inmortal', el tribuno Marco Flaminio Rufo halla el Río de la Inmortalidad en África y una ciudad laberíntica construida por arquitectos dementes; descubre que los trogloditas mudos son los inmortales y que uno de ellos es Homero. Comprende la lección filosófica: la eternidad anula la moral y el valor de las acciones humanas, pues solo la muerte hace preciosos y patéticos a los hombres, iniciando un viaje de siglos para volver a ser mortal.

                En 'Biografía de Tadeo Isidoro Cruz', el sargento de policía comanda la partida contra un gaucho fugitivo en un pajonal nocturno; al contemplar el coraje indomable del acorralado en la oscuridad, Cruz experimenta la revelación fulminante de su ser: comprende que su destino es el del lobo y no el del perro sometido, arroja su quepis y desenvaina su facón al grito de '¡Cruz no consiente que se cometa el delito de matar a un valiente!', pasándose a combatir al lado de Martín Fierro.

                En 'La casa de Asterión', el relato adopta la voz de Asterión, un habitante melancólico de una mansión de infinitas galerías y patios desiertos; explica cómo inventa juegos solitarios y espera pacientemente a su Redentor profetizado. El cuento concluye con la voz exterior de Teseo diciéndole a Ariadna con la espada ensangrentada: 'El minotauro apenas se defendió', desvelando que el laberinto era Creta y que el monstruo buscó su muerte para poner fin a la soledad.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "El Aleph II: El Vértigo del Infinito en el Sótano de la Calle Garay",
            detalle = """
                Tras la muerte de la inolvidable Beatriz Viterbo, el narrador Borges visita periódicamente la casona de la calle Garay habitada por su primo Carlos Argentino Daneri, autor mediocre que compone un farragoso poema geográfico titulado 'La Tierra'.

                Desesperado ante la inminente demolición del inmueble para ampliar una confitería, Daneri confiesa a Borges el secreto cósmico que atesora en el sótano bajo el escalón decimonoveno: el Aleph, un punto del espacio que contiene todos los puntos del universo sin superposición ni transparencia.

                Borges desciende a la penumbra del sótano y se tiende en el suelo; al mirar fijamente el escalón, experimenta la visión mística colosal en una esfera tornasolada de apenas tres centímetros: contempla simultáneamente mares populosos, racimos, desiertos, pirámides, su dormitorio vacío, cartas obscenas de Beatriz a Daneri y el universo entero mirado desde todos los ángulos a la vez. Aterrado y asombrado ante el infinito, sube a la sala y se venga de Daneri fingiendo no haber visto nada; el relato se cierra con la melancolía del paso del tiempo y la certidumbre de que el olvido devorará también el rostro sagrado de Beatriz.
            """.trimIndent()
        )
    ),
    temaPrincipal = "El laberinto espacial y temporal, la realidad como ilusión o texto infinito, la coexistencia simultánea de todos los tiempos y espacios, y la disolución de la identidad individual en el destino cósmico universal.",
    simbolosClave = listOf(
        "El Aleph: Símbolo del infinito y la omnisciencia cósmica concentrada en un punto que desafía la linealidad del lenguaje humano.",
        "El laberinto temporal de Ts'ui Pên: Alegoría de la infinitud cuántica del tiempo, donde todas las alternativas posibles se realizan simultáneamente.",
        "La Biblioteca de Babel: El universo como combinatoria matemática total, que alberga tanto la verdad absoluta como la desesperación del caos.",
        "Los espejos y los duplicados (hrönir): Representación de la falsedad de la materia, la ilusión multiplicadora y la fragilidad ontológica del mundo.",
        "La memoria absoluta de Funes: Parábola de la imposibilidad del pensamiento abstracto ante la saturación de los detalles sensibles del mundo.",
        "La bala detenida de Jaromir Hladík: El triunfo del tiempo subjetivo de la mente creadora sobre la cronología mecánica exterior.",
        "El Redentor del Minotauro: La muerte liberadora como única salida ética al laberinto de la eterna soledad existencial."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Qué enigma revela Stephen Albert sobre la monumental obra de Ts'ui Pên en 'El jardín de senderos que se bifurcan'?",
            respuesta = "Revela que el laberinto y la novela inconclusa son un solo y mismo objeto: Ts'ui Pên concibió un laberinto temporal donde el protagonista, al enfrentar varias opciones, elige simultáneamente todas las bifurcaciones posibles, creando infinitos universos paralelos y tiempos divergentes que proliferan sin cesar."
        ),
        PreguntaClaveObra(
            pregunta = "¿De qué manera cae el detective Erik Lönnrot en la trampa mortal de Red Scharlach en 'La muerte y la brújula'?",
            respuesta = "Scharlach aprovechó la pedantería razonadora y la obsesión cabalística de Lönnrot para tejer un patrón geométrico falso de tres crímenes en triángulo con mensajes sobre el Nombre sagrado de Dios, sabiendo que el detective deduciría la existencia de un cuarto vértice en el Sur (la quinta Triste-le-Roy) el 3 de marzo para entregarse ciegamente a su verdugo."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué perspectiva narrativa innovadora introduce Borges en 'La casa de Asterión'?",
            respuesta = "Narra el mito clásico de Creta en primera persona desde la interioridad melancólica del Minotauro (Asterión), quien no actúa como un monstruo sanguinario sino como un ser solitario que concibe la llegada de su 'Redentor' (Teseo) como una liberación y se deja matar sin oponer resistencia."
        ),
        PreguntaClaveObra(
            pregunta = "¿Dónde se localiza físicamente el Aleph en el cuento homónimo y qué fenómeno permite contemplar?",
            respuesta = "Se ubica en el sótano oscuro de la casona de Carlos Argentino Daneri en la calle Garay de Buenos Aires, exactamente bajo el escalón decimonoveno de la escalera. Es una esfera tornasolada de apenas tres centímetros que contiene todos los puntos del universo de forma simultánea, sin confusión ni transparencia."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué famosa revelación existencial formula Borges en 'Biografía de Tadeo Isidoro Cruz'?",
            respuesta = "Postula que cualquier destino humano, por intrincado que sea, consta en verdad de un solo momento supremo: aquel en que el hombre sabe para siempre quién es, instante en el que Cruz arroja su quepis militar al suelo y decide pelear junto al desertor Martín Fierro."
        )
    )
)
