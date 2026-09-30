package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra23TrilceYPoemasHumanos = ObraLiteraria(
    id = "trilce-poemas-humanos",
    titulo = "Trilce y Poemas humanos",
    autor = "César Vallejo",    anio = "Siglo XX (1922 / 1939)",
    pais = "Perú",
    corriente = "Vanguardismo Radical / Poesía del Compromiso Humano y Social",
    genero = "Lírico",
    especie = "Poemario vanguardista y lírica del compromiso social",
    categoria = "Literatura Peruana",    colorHex = "#2563EB",
    sinopsis = """
        La producción poética de César Abraham Vallejo Mendoza ('El Poeta del Dolor Humano') representa la cumbre más alta de la lírica peruana y una de las cimas universales de la lengua española en el siglo XX. Su trayectoria vital y estética transita desde el posmodernismo desgarrador hasta la vanguardia absoluta y la poesía del compromiso revolucionario y solidario, condensada en cuatro hitos poéticos fundamentales:

        1. Los heraldos negros (1918 / 1919): Poemario de iniciación de raíz modernista pero habitado por una voz telúrica, áspera y conmovedora. En el poema liminar homónimo se formula el dolor ineludible, absurdo y fatal que golpea al ser humano sin justificación religiosa posible: 'Hay golpes en la vida, tan fuertes... ¡Yo no sé! / Golpes como del odio de Dios... / Esos golpes sangrientos son las crepitaciones / de algún pan que en la puerta del horno se nos quema'. En 'Los dados eternos' increpa a Dios concibiéndolo como un ser enfermo y huérfano de amor ('Dios mío, si tú hubieras sido hombre, / hoy supieras ser Dios'), y en 'A mi hermano Miguel' evoca la muerte infantil como un juego de escondidas en el poyo de la casa solariega de Santiago de Chuco.

        2. Trilce (1922): Considerado el poemario de vanguardia más radical, transformador e insurreccional en lengua castellana del siglo XX. Gestado tras la muerte de su madre María de los Santos Gurruchaga y los 112 días de injusta prisión política que Vallejo sufrió en la cárcel de Trujillo (1920-1921), el título es un neologismo acuñado por el poeta fusionando 'triste' y 'dulce' con la obsesión por el número tres. Consta de 77 poemas titulados solo con números romanos (del I al LXXVII). Vallejo dinamita la sintaxis tradicional, inventa vocablos, quiebra las palabras en sílabas a final de verso, sustantiva adverbios ('el cuándo', 'el todavía') y pluraliza pronombres para plasmar el encierro carcelario, el frío del calabozo y la orfandad cósmica: 'Las cuatro paredes de la celda. / Ah las cuatro paredes albicantes / que sin remedio, de un número semejante, / siempre dan cuatro!'.

        3. Poemas humanos (1939, póstumo): Publicado en París tras su muerte por su viuda Georgette Philippart y Raúl Porras Barrenechea, reúne los poemas escritos en Europa entre 1923 y 1938. El sufrimiento existencial desciende a la carne concreta: el hombre sufre en sus bronquios, en los talones, en el estómago vacío y en el traje raído del desempleo parisino. En 'Piedra negra sobre una piedra blanca', Vallejo profetiza con exactitud elegíaca las coordenadas de su propia muerte en el exilio: 'Me moriré en París con aguacero, / un día del cual tengo ya el recuerdo. / Me moriré en París —y no me corro— / tal vez un jueves, como es hoy, de otoño'. En 'Considerando en frío, imparcialmente', radiografía con compasión franciscana y dialéctica marxista la contradictoria miseria y grandeza del hombre proletario.

        4. España, aparta de mí este cáliz (1939, póstumo): Canto épico y elegíaco de adhesión a los milicianos republicanos en la Guerra Civil Española (1936-1939). España encarna al Cristo proletario crucificado por el fascismo. Su poema cumbre es 'Masa': un combatiente yace muerto y un hombre le ruega '¡No mueras, te amo tanto!', pero el cadáver sigue muriendo; se acercan dos, cien, miles, pero el cadáver no revive; hasta que 'todos los hombres de la tierra le rodearon', y ante el abrazo solidario y unánime de la humanidad entera, el cadáver se incorpora, abraza al primer hombre y echa a andar, consumando el triunfo supremo de la fraternidad universal sobre la muerte biológica.
    """.trimIndent(),
    contextoHistorico = """
        Nacido en 1892 en el pueblo andino de Santiago de Chuco (La Libertad), César Vallejo experimentó en carne propia el desamparo material y la injusticia social. Tras integrarse en la bohemia intelectual del Grupo Norte de Trujillo junto a Antenor Orrego y Víctor Raúl Haya de la Torre, en agosto de 1920 fue víctima de una calumniosa acusación de instigar un incendio en su pueblo natal, pasando 112 días encarcelado en Trujillo (noviembre de 1920 a febrero de 1921).

        La Ruptura Lingüística de Trilce:
        La prisión y el duelo por la muerte de su madre en 1918 desataron en Vallejo la necesidad imperiosa de destruir el idioma tradicional. 'Trilce' vio la luz en Lima en 1922 en los talleres de la Penitenciaría, incomprendido por la crítica limeña conservadora que lo tildó de disparate incomprensible, salvado únicamente por el lúcido prólogo de Antenor Orrego: 'César Vallejo ha destrozado el idioma para crear un nuevo lenguaje'.

        El Exilio Europeo, el Marxismo y la Edición Póstuma:
        En 1923 partió a París para no retornar jamás al Perú. Vivió en la penuria económica, visitó la Unión Soviética en tres ocasiones y se adhirió al marxismo como herramienta de emancipación de la clase obrera, sin despojarse jamás de su hondo misticismo andino. Conmovido por el horror de la Guerra Civil Española, redactó sus últimos versos antes de fallecer en la clínica Arago de París un viernes santo, 15 de abril de 1938. Sus poemarios de madurez ('Poemas humanos' y 'España, aparta de mí este cáliz') fueron editados póstumamente en julio de 1939 gracias al esfuerzo devoto de su viuda Georgette de Vallejo.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "César Vallejo (La Voz Poética)",
            rol = "El poeta del dolor cósmico, la orfandad y la solidaridad de los oprimidos",
            descripcion = "Voz lírica que asume sobre sus propios hombros el peso del sufrimiento de la humanidad entera. Transita del dolor individual y familiar andino al compromiso revolucionario universal y a la desgarradura biológica del cuerpo proletario."
        ),
        PersonajeLiterario(
            nombre = "Doña María de los Santos Gurruchaga",
            rol = "Madre del poeta, arquetipo de la ternura protectora y la inocencia andina",
            descripcion = "Figura sacralizada en 'Los heraldos negros' y evocada con desesperación desgarradora en 'Trilce'. Su fallecimiento en 1918 inaugura la orfandad metafísica incurable de Vallejo en el mundo."
        ),
        PersonajeLiterario(
            nombre = "Miguel Vallejo",
            rol = "Hermano fallecido del poeta en Santiago de Chuco",
            descripcion = "Destinatario de la elegía 'A mi hermano Miguel', donde la muerte es representada como una partida de escondidas en el poyo de la casa materna, esperando con angustia que no tarde para no inquietar a mamá."
        ),
        PersonajeLiterario(
            nombre = "El Combatiente Muerto en 'Masa'",
            rol = "Soldado caído de la causa republicana en la Guerra Civil Española",
            descripcion = "Encarna al ser humano derrotado por la violencia de la guerra, cuyo cadáver insensible a los ruegos individuales resucita milagrosamente cuando la masa de todos los hombres de la tierra se une en un abrazo de amor absoluto."
        ),
        PersonajeLiterario(
            nombre = "El Dios Doliente y Huérfano",
            rol = "Deidad increpada en 'Los dados eternos'",
            descripcion = "Figura divina no omnipotente ni providencial, sino incapaz de comprender el dolor humano por no haber nacido hombre, jugando a los dados en un universo ciego y desolado."
        ),
        PersonajeLiterario(
            nombre = "El Hombre Proletario Europeo",
            rol = "Sujeto lírico de 'Poemas humanos'",
            descripcion = "El ser concreto que sufre el frío de París, el desempleo y el hambre en el cuerpo; contradictorio, miserable y tierno a la vez, abrazado con profunda emoción fraternal por el poeta."
        ),
        PersonajeLiterario(
            nombre = "Georgette Philippart de Vallejo",
            rol = "Esposa, viuda y albacea de la obra vallejiana",
            descripcion = "Compañera en los años de privaciones en París que custodió los manuscritos tras la muerte de Vallejo en 1938 y gestionó la publicación póstuma de 'Poemas humanos' y 'España, aparta de mí este cáliz' en 1939."
        ),
        PersonajeLiterario(
            nombre = "La Humanidad ('Masa')",
            rol = "Fuerza cósmica redentora colectiva",
            descripcion = "El conjunto unánime de todos los seres humanos del planeta que, reconciliados en la solidaridad activa, vencen las fronteras de la biología y anulan a la muerte."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Los heraldos negros: El Dolor Ineludible y la Quiebra de la Fe",
            detalle = "El poemario abre con 'Los heraldos negros', definiendo el sufrimiento como golpes brutales que abren zanjas oscuras en el alma como si fuera el odio de Dios o el pan que en la puerta del horno se quema. En 'Los dados eternos', Vallejo dialoga con Dios reprochándole no haber sido hombre para sentir el peso de su propia creación en un cosmos donde la tierra es un dado gastado que rueda hacia la fosa."
        ),
        EscenaTrama(
            titulo = "Trilce: La Destrucción del Idioma y el Trauma de la Cárcel",
            detalle = "Publicado en 1922 tras 112 días de prisión en Trujillo, Vallejo rompe con la métrica y la sintaxis castellana en 77 poemas sin título. En el poema I equipara el acto de la defecación con la soledad metafísica matinal; en el poema II y XVIII describe las cuatro paredes albicantes de la celda carcelaria como la frontera infranqueable de la existencia humana, implorando el cobijo del vientre de la madre muerta."
        ),
        EscenaTrama(
            titulo = "Trilce: La Ausencia Materna y la Despedida Existencial",
            detalle = "La memoria de su madre impregna el libro como el único puerto de redención frente al desamparo. En el poema LXXVII despide la obra con una lluvia que no debe secarse, declarándose listo para caer en el surco y ofrendar su dolor como fruto para la humanidad."
        ),
        EscenaTrama(
            titulo = "Poemas humanos: La Profecía en París y el Dolor de la Carne",
            detalle = "En el exilio europeo, Vallejo escribe sobre el padecimiento biológico del cuerpo humano. En el soneto 'Piedra negra sobre una piedra blanca', profetiza que morirá en París un día de otoño con aguacero, recordando los golpes de palo y soga recibidos en vida. En 'Considerando en frío, imparcialmente', contempla la miseria del hombre trabajador y concluye fundiéndose en un abrazo fraternal desbordado de emoción."
        ),
        EscenaTrama(
            titulo = "España, aparta de mí este cáliz y el Milagro Fraternal de 'Masa'",
            detalle = "Vallejo canta a la resistencia del pueblo español en la guerra civil. En 'Masa', un combatiente yace muerto; ni el amor de un individuo ni el de millones logra detener su muerte; solo cuando todos los hombres de la tierra lo rodean en comunión solidaria total, el cadáver se incorpora conmovido, abraza al primer hombre y echa a andar, venciendo a la muerte por la fuerza de la fraternidad universal."
        )
    ),
    temaPrincipal = "El dolor cósmico e incomprensible de la existencia humana; la revolución radical del lenguaje poético en el encierro carcelario y la orfandad materna; el sufrimiento corpóreo y social del proletario, y la victoria trascendental de la fraternidad y solidaridad universal sobre la muerte.",
    simbolosClave = listOf(
        "El pan que en la puerta del horno se quema: Metáfora cotidiana andina que sintetiza la frustración desgarradora del destino humano arrebatado a las puertas de la felicidad.",
        "Los dados eternos: Símbolo del azar ciego y el absurdo del universo, donde Dios y el hombre juegan su suerte en una partida sin justicia divina.",
        "El neologismo 'Trilce': Fusión emocional de 'triste' y 'dulce' y el número 'tres', emblema de la insurrección verbal y la libertad poética absoluta.",
        "Las cuatro paredes de la celda: Metáfora de la prisión de Trujillo, del cuerpo biológico y de los límites infranqueables del espacio y el tiempo.",
        "La piedra negra sobre una piedra blanca: Símbolo funerario y vaticinio elegíaco de la muerte solitaria del poeta en el aguacero parisino.",
        "Los huesos húmeros: Símbolo de la fragilidad ósea y el dolor físico que encarna la tragedia del cuerpo en el exilio.",
        "El abrazo multitudinario en 'Masa': Emblema supremo de la fraternidad y solidaridad universal como la única fuerza redentora capaz de aniquilar la muerte."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué poemario pertenece el inmortal poema 'Masa' y cuál es su mensaje filosófico central?",
            respuesta = "Pertenece a 'España, aparta de mí este cáliz' (1939), y no a 'Poemas humanos'. Su mensaje central es el triunfo de la solidaridad y fraternidad universal sobre la muerte: el combatiente caído solo logra resucitar y echarse a andar cuando la totalidad de los hombres de la tierra se congrega a su alrededor en un abrazo unánime de amor."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué 'Trilce' (1922) es considerado la cumbre del Vanguardismo en lengua castellana?",
            respuesta = "Porque rompe radicalmente con toda la tradición léxica y sintáctica del español: Vallejo inventa neologismos (como el propio título 'Trilce'), quiebra palabras en sílabas a final de verso, sustantiva adverbios, violenta la puntuación y altera la ortografía para plasmar la experiencia límite de los 112 días en la cárcel de Trujillo y la orfandad por la muerte de su madre."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué vaticinio formula César Vallejo en el soneto 'Piedra negra sobre una piedra blanca' de 'Poemas humanos'?",
            respuesta = "Profetiza de manera conmovedora su propia muerte solitaria en el exilio: 'Me moriré en París con aguacero, / un día del cual tengo ya el recuerdo. / Me moriré en París —y no me corro— / tal vez un jueves, como es hoy, de otoño'."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué año y bajo qué condiciones fueron publicados 'Poemas humanos' y 'España, aparta de mí este cáliz'?",
            respuesta = "Ambos fueron publicados de manera póstuma en París en 1939 (un año después de la muerte del poeta ocurrida en 1938), gracias a la dedicación de su viuda Georgette Philippart de Vallejo y el apoyo de Raúl Porras Barrenechea."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuántos poemas componen 'Trilce' y cómo están titulados?",
            respuesta = "Consta exactamente de setenta y siete (77) poemas, los cuales no llevan títulos temáticos sino que están identificados únicamente mediante números romanos, del I al LXXVII."
        )
    )
)
