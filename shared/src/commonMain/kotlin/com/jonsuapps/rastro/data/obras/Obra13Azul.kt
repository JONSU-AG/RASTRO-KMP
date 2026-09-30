package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra13Azul = ObraLiteraria(
    id = "azul",
    titulo = "Azul...",
    autor = "Rubén Darío",    anio = "Siglo XIX (1888-1890)",
    pais = "Nicaragua",
    colorHex = "#2563EB",
    corriente = "Modernismo hispanoamericano (obra fundacional)",
    genero = "Híbrido (Lírico y Narrativo)",
    especie = "Cuentos en prosa artística, cuadros líricos y poemas en verso medido",
    categoria = "Literatura Hispanoamericana",    sinopsis = """
        Publicada inicialmente en Valparaíso (Chile) en julio de 1888 y reeditada con ampliaciones fundamentales en Guatemala en 1890, 'Azul...' de Rubén Darío es la partida de nacimiento indiscutible del Modernismo literario en la lengua castellana. Con apenas veintiún años, el genio nicaragüense refundó la literatura hispánica fusionando la perfección formal y plástica del Parnasianismo francés con la sinestesia y musicalidad envolvente del Simbolismo.

        La obra presenta una exquisita arquitectura híbrida. Su sección en prosa desentraña con crudeza e ironía la tragedia ontológica del artista bohemio en una sociedad dominada por el utilitarismo y el poder del dinero: en 'El rey burgués', un poeta que rehúsa someterse a la banalidad cortesana es condenado a girar el manubrio de una caja de música en el jardín nevado a cambio de mendrugos de pan, muriendo petrificado por el hielo; en 'El sátiro sordo', la lira divina de Orfeo es expulsada de los bosques sagrados por el dictamen ignorante de un burro que mueve las orejas; en 'El fardo', la crudeza del naturalismo social se encarna en un joven estibador de Valparaíso aplastado por el peso ciego de la mercancía en el puerto; en 'El velo de la reina Mab', cuatro artistas desesperados son rescatados del suicidio por un hada que los envuelve en el manto azul del ensueño creador; y en 'La canción del oro', un mendigo hambriento entona a medianoche un himno demoledor contra el dios dorado que corrompe la moral ante palacios cerrados.

        En su vertiente lírica en verso, Darío despliega el ciclo de las estaciones en 'El año lírico' (Primaveral, Estival, Autumnal e Invernal), donde el erotismo refinado y la embriaguez sensual dialogan con la melancolía crepuscular. Asimismo, el libro corona su revolución formal con sonetos deslumbrantes en versos alejandrinos, destacando unánimemente 'Caupolicán', donde el toqui araucano que sostiene el tronco de roble durante dos días es inmortalizado como un titán mitológico americano con la majestad rítmica del clasicismo grecolatino.
    """.trimIndent(),
    contextoHistorico = """
        A finales del siglo XIX, Hispanoamérica experimentó un vertiginoso proceso de modernización económica marcado por la inserción en el mercado capitalista mundial y la consolidación de oligarquías burguesas. En este nuevo orden mercantil, el escritor perdió su estatus tradicional de patricio o clérigo para convertirse en un trabajador asalariado o un bohemio marginal obligado a someterse a las demandas del periodismo comercial.

        Escrita durante la estancia de Rubén Darío en Chile y publicada en Valparaíso en julio de 1888, 'Azul...' sintetiza esa crisis histórica:
        1. Asimilación del Parnasianismo y el Simbolismo francés: Frente a la retórica grandilocuente del Romanticismo y la prosa chata del costumbrismo decimonónico, Darío renovó el castellano desde el interior, introduciendo el culto a la belleza plástica ('el arte por el arte'), la adjetivación sensorial, la musicalidad interna y la sinestesia.
        2. El concepto de 'galicismo mental': Tras leer el libro, el prestigioso crítico español don Juan Valera publicó en Madrid dos extensas 'Cartas americanas' consagrando la obra; reconoció que Darío no copiaba servilmente giros franceses, sino que pensaba con la modernidad europea para revitalizar el idioma español con cosmopolitismo universal.
        3. El simbolismo del título: Inspirado en la máxima de Víctor Hugo ('L'art c'est l'azur'), el color azul representa para el Modernismo el infinito, el misterio celeste, el ideal estético inalcanzable y el ensueño poético que trasciende la vulgaridad materialista de la tierra.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Poeta de 'El rey burgués'",
            rol = "Arquetipo del artista idealista en la sociedad mercantil",
            descripcion = "Voz profética y digna de la belleza trascendente. Ante el monarca vanidoso defiende que el arte es el fuego sagrado de Prometeo que ilumina la noche humana. Es degradado a la condición de autómata al ser obligado a mover una caja de música en el jardín helado para divertir los paseos cortesanos, muriendo congelado con una sonrisa de altivo desdén en los labios."
        ),
        PersonajeLiterario(
            nombre = "El Rey Burgués",
            rol = "Arquetipo de la oligarquía filistea y el consumo acumulativo",
            descripcion = "Soberano materialista que atesora en su palacio babilónico cisnes, marfiles, porcelanas y pinturas exóticas compradas por catálogo sin entender su espíritu. Incapaz de comprender la poesía pura, trata al artista como un sirviente decorativo que debe ganarse el pan con trabajo mecánico."
        ),
        PersonajeLiterario(
            nombre = "El Tío Lucas y su Hijo",
            rol = "Protagonistas proletarios en 'El fardo'",
            descripcion = "El anciano Lucas, consumido por el reumatismo marino tras años de faena, vive en una choza humilde en Valparaíso; su hijo de quince años, mozo fuerte, abnegado y alegre, trabaja cargando fardos en los muelles para sustentar a su familia. Su muerte atroz bajo una mole de telas extranjeras ilustra el sacrificio humano ante la economía de exportación."
        ),
        PersonajeLiterario(
            nombre = "Orfeo y el Sátiro Sordo",
            rol = "Protagonistas de 'El sátiro sordo'",
            descripcion = "Orfeo personifica la divina armonía del arte supremo que amansa fieras e inclina a los árboles sagrados; el Sátiro, castigado por Apolo con la sordera, encarna al gobernante ignorante que expulsa al dios lírico de la selva tras acatar el rebuzno de desaprobación de un asno pedante."
        ),
        PersonajeLiterario(
            nombre = "La Reina Mab",
            rol = "Hada de los sueños en 'El velo de la reina Mab'",
            descripcion = "Diminuta deidad feérica tomada de Shakespeare. Desciende sobre la buhardilla de cuatro artistas bohemios hambrientos (un escultor, un pintor, un músico y un poeta) y los envuelve en un manto tejido con rayos de luna y hebras azules, devolviéndoles la fe en el poder inmutable de la creación estética."
        ),
        PersonajeLiterario(
            nombre = "Caupolicán",
            rol = "Héroe épico araucano inmortalizado en soneto",
            descripcion = "Toqui legendario mapuche que sostiene sobre su lomo un tronco de roble desgajado durante un día y dos noches para conquistar el mando militar de su pueblo. Es retratado por Darío como un titán helénico americano con penacho de cóndor y maza de Hércules."
        ),
        PersonajeLiterario(
            nombre = "El Mendigo Lírico",
            rol = "Protagonista sarcástico de 'La canción del oro'",
            descripcion = "Bohemio harapiento y hambriento que, plantado bajo los faroles de gas ante los palacios cerrados de los banqueros a medianoche, entona un ditirambo demoledor al oro, desenmascarando su condición de ídolo visible que compra honras y conciencias en el mundo moderno."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Cuento I: El rey burgués (La Tragedia del Poeta Manubrio en el Jardín Helado)",
            detalle = """
                En una gran urbe opulenta reina un soberano inmensamente rico: el Rey Burgués. Su palacio fastuoso es una acumulación desordenada de lujos exóticos: cisnes en estanques de alabastro, vajillas de oro cincelado, sedas chinas, estatuas de mármol de Paros y cuadros costosos adquiridos por moda. Pasa los días ideando recetas gastronómicas extravagantes y dando órdenes sobre la poda de sus rosales.

                Un día los centinelas conducen a su presencia a un forastero andrajoso: es un poeta. El rey le exige que exponga su oficio; el poeta pronuncia un himno inflamado sobre la grandeza trascendente del arte: afirma que no es un bufón cortesano, sino el profeta del ideal que roba el fuego del sol y dialoga con las estrellas para consolar la miseria humana. Incapaz de comprenderlo, el monarca consulta a su filósofo de cámara, quien sentencia que el arte no debe mantener parásitos y que el hombre debe ganarse el pan con trabajo útil. El rey decide asignarle una tarea mecánica: le entrega una caja de música con manivela instalada en el jardín junto a los cisnes; por cada vuelta de manubrio que dé para amenizar los paseos del soberano con valses vulgares, recibirá un pedazo de pan negro.

                Sobrevienen los rigores del invierno boreal. La nieve sepulta los árboles, el estanque se cuaja en hielo y los cisnes perecen congelados. Mientras en las salas caldeadas del palacio arden leños aromáticos y la corte celebra festines pantagruélicos, el poeta permanece a la intemperie empuñando el manubrio con dedos entumecidos y ropa hecha jirones. El hambre y la escarcha consumen su cuerpo. A la mañana siguiente, tras una noche de borrachera cortesana, el rey y sus cortesanos salen al jardín: hallan al poeta sentado junto a la máquina, rígido y completamente muerto de frío, con la mano crispada en la manivela y una sonrisa de desdén inmortal sellada en sus labios.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Cuento II: El sátiro sordo (La Incomprensión de Orfeo ante el Tribunal del Asno)",
            detalle = """
                En una frondosa espesura de Grecia habita un Sátiro envejecido y montaraz que gobierna a los faunos y a las ninfas. Por haber injuriado al dios solar Apolo, este lo castigó privándolo del sentido del oído, dejándolo sordo como una roca. Para resolver los litigios de la selva, el Sátiro cuenta con dos consejeros predilectos: una alondra ligera y un asno doctoral, célebre por menear las orejas con fingida sabiduría.

                Cierto día arriba al bosque el divino aedo Orfeo buscando asilo natural para cantar sin las bajezas de las urbes humanas. El Sátiro sordo le concede audiencia. Orfeo toma su lira de marfil y pulsa las cuerdas: desata un cántico sagrado sobre la creación cósmica. El milagro conmueve a la naturaleza entera: los robles milenarios inclinan sus ramajes en reverencia, los torrentes detienen su curso para oír, las bestias carniceras se echan mansas a sus pies y las ninfas asoman desnudas entre las cañas conmovidas por la gracia del verbo.

                El Sátiro, sin embargo, no ha percibido el menor sonido. Confundido ante el clamor del bosque, pide dictamen a sus consejeros. La alondra entona un trino al vuelo que el monarca no oye. Apela entonces al asno: el jumento clava sus ojos torpes en el músico, baja la cerviz, menea las orejas pesadamente de izquierda a derecha en señal de rechazo doctrinal y suelta un rebuzno desdeñoso. Creyendo interpretar la sensatez del jumento, el Sátiro sordo alza la mano y pronuncia su fallo inapelable: condena a Orfeo al destierro inmediato, expulsándolo de la selva sagrada mientras el poeta se aleja cabizbajo con las cuerdas de su lira rotas.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Cuento III: El fardo (Naturalismo Lírico y Tragedia Proletaria en Valparaíso)",
            detalle = """
                Enmarcado en la bahía y muelles obreros de Valparaíso, el relato retrata la existencia del tío Lucas, un viejo pescador quebrado por el reumatismo que malvive con su familia indigente en una miserable covacha costera. Su único consuelo y sostén económico es su primogénito de quince años, muchacho noble, brioso y laborioso que trabaja como estibador en el desembarque de navíos mercantes.

                Una mañana de viento helado y mar picado, padre e hijo acuden a descargar una gigantesca nave extranjera anclada en la rada. El muchacho desciende ágilmente a la bodega del buque para enlazar las mercancías a los ganchos de la grúa a vapor que las traslada a las lanchas de auxilio.

                Súbitamente, un fardo descomunal y pesadísimo que transporta telas de lujo y lana extranjera se zafa de las cadenas en pleno vuelo sobre el abismo. La inmensa mole de mercancías cae a plomo sobre la lancha: aplasta sin compasión al joven estibador contra las maderas del fondo, reventando sus costillas y destrozando su cuerpo en medio de un charco de sangre. El cadáver es llevado en parihuela a la choza; el viejo tío Lucas contempla con los ojos secos de espanto el cuerpo destrozado de su hijo, mientras la madre y los niños pequeños lloran de hambre y desesperación: el único brazo sustentador ha sido aniquilado por la maquinaria ciega del comercio portuario.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Cuento IV: El velo de la reina Mab (La Redención de los Cuatro Artistas Bohemios)",
            detalle = """
                En una sórdida buhardilla bohemia se congregan cuatro jóvenes creadores al borde de la inanición: un escultor, un pintor, un músico y un poeta. Cada uno confiesa amargamente el fracaso de su vocación ante una masa indiferente: el escultor talla diosas de mármol que nadie adquiere por preferir baratijas baratas de yeso; el pintor persigue la luz dorada del cielo pero debe pintar bodegones mediocres para no fallecer de hambre; el músico sueña con la novena sinfonía de Beethoven y solo le pagan por tocar polcas grotescas en tabernas; y el poeta abriga en su pecho el fuego de Homero y Shakespeare mientras mendiga harapos.

                Abrumados por la desolación, los cuatro contemplan el suicidio como la única liberación a su martirio. En ese trance hace su aparición la Reina Mab, el hada milagrosa de los sueños que viaja en un carruaje de perla. Apiadándose del dolor de los bohemios, extrae de su cofre su presea más sagrada: un velo impalpable tejido con rayos de luna, suspiros y hebras de color azul celeste.

                La soberana feérica arroja el velo mágico sobre los cuatro jóvenes. Al instante, la estancia se inunda de resplandores dorados; el hambre, la tiritona del frío y las miserias materiales se disuelven como humo; los artistas recuperan el fuego sagrado de la inspiración y descubren que el verdadero patrimonio del ser humano no radica en las riquezas de la tierra, sino en el don inalienable de concebir y celebrar la belleza eterna.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Cuento V: La canción del oro (Himno Sarcástico y Rebelión ante los Palacios)",
            detalle = """
                A medianoche, en una fastuosa avenida cosmopolita flanqueada por suntuosos palacios de aristócratas y banqueros con cancelas doradas, deambula un mendigo pálido, bohemio y andrajoso. 

                Deteniéndose a la luz de los faroles de gas, alza sus brazos esculpidos por el hambre y rompe el silencio nocturno entonando un himno en prosa de fulgurante sarcasmo lírico dedicado al Dios Oro. Proclama al metal amarillo rey indiscutible del mundo moderno, monarca que reparte honras a los viles, nobleza a los lacayos, virtud a los canallas y belleza a los rostros monstruosos. Desgrana en antítesis feroces la doble faz del dinero: es padre del pan que nutre y al mismo tiempo padre de la infamia, luz del altar santo y luz hedionda de la mancebía, cómplice del tirano y verdugo del hambriento.

                Cuando el cántico agoniza entre las sombras, un lacayo con librea asoma por un balcón superior y le arroja despectivamente una costra de pan duro mordisqueada; el mendigo la levanta del lodo, la devora con furor y se pierde en la negrura de la noche lanzando una imprecación amarga contra los palacios silenciosos.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Poesía Cúspide: El año lírico y el Soneto Épico Caupolicán",
            detalle = """
                En el apartado en verso de 'Azul...', Darío formula el canon de la métrica modernista mediante composiciones deslumbrantes:
                - 'El año lírico' articula el ciclo natural con las mutaciones del erotismo y el espíritu: 'Primaveral' canta a la embriaguez báquica de los sentidos entre ninfas y sátiros en el despertar de la floresta; 'Estival' relata con salvajismo sensorial la tragedia de dos tigres de Bengala bajo el sol tropical y la venganza sangrienta tras la muerte de la hembra preñada; 'Autumnal' vuelca la nostalgia crepuscular del poeta en demanda de un hada bienhechora; e 'Invernal' recrea el refinamiento parnasiano de un gabinete tibio donde una dama aristocrática (Carolina) se entrega al amor sensual envuelta en martas cibelinas mientras la nieve azota los tejados.
                - En la sección de sonetos descuella con fulgor inmortal 'Caupolicán': adoptando el verso alejandrino francés (14 sílabas con rigurosa cesura en 7+7), Darío rescata la prueba épica del caudillo mapuche descrita en 'La Araucana' de Ercilla. Describe con plasticidad escultural al guerrero de Arauco cargando sobre sus espaldas musculosas un roble centenario durante un día y dos noches continuas ('¡la frente arde en sudor, los ojos echan centellas!'), hasta arrojar el madero al alba del tercer día entre el clamor ensordecedor de su pueblo que lo aclama toqui supremo, equiparando al héroe autóctono americano con los semidioses y titanes de la mitología clásica.
            """.trimIndent()
        )
    ),
    temaPrincipal = "La proclamación de la autonomía del arte y la belleza estética ('el arte por el arte') frente a la degradación utilitarista de la sociedad burguesa, enriquecida por la musicalidad, el cromatismo y el sincretismo universal.",
    simbolosClave = listOf(
        "El color azul: Símbolo del infinito, el misterio celeste, la trascendencia espiritual y el ideal poético supremo ('L'art c'est l'azur').",
        "La caja de música de manubrio ('El rey burgués'): Alegoría de la alienación y domesticación del arte en mercancía utilitaria para el ocio frívolo de los poderosos.",
        "El fardo de mercaderías ('El fardo'): Representación de la brutalidad anónima del capitalismo portuario que aplasta la vida proletaria en aras del tráfico comercial.",
        "El velo azul de la reina Mab: Encarna el bálsamo purificador de la imaginación poética que otorga al artista la dignidad y alegría que el mundo material le regatea.",
        "El asno ('El sátiro sordo'): Metáfora de la crítica reaccionaria y la pedantería académica que censura con soberbia ignorante la genialidad creadora.",
        "El tronco de roble de Caupolicán: Símbolo de la potencia telúrica indígena americana, fundida con la dignidad de los titanes clásicos bajo el molde del alejandrino.",
        "El oro ('La canción del oro'): El falso ídolo moderno que corrompe todas las esferas del orden social, sintetizado como 'padre del pan y de la infamia'."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Qué significación histórica tiene la publicación de Azul... en 1888 en las letras hispánicas?",
            respuesta = "Marca formalmente el acta de nacimiento del Modernismo hispanoamericano. Con esta obra, Rubén Darío revolucionó la prosa y la lírica castellanas al asimilar la perfección plástica del Parnasianismo y la sugestión musical del Simbolismo francés, liberando a la lengua española de la retórica barroca y decimonónica."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién redactó las cartas-prólogo que consagraron internacionalmente a Azul... y qué concepto crítico acuñó?",
            respuesta = "Fueron redactadas por el célebre crítico y novelista español don Juan Valera en sus 'Cartas americanas' publicadas en el diario 'El Imparcial' de Madrid. En ellas acuñó el concepto de 'galicismo mental' para explicar que Darío había asimilado el espíritu más refinado de la literatura francesa moderna sin adulterar la pureza del léxico castellano."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es el castigo que el Rey Burgués impone al poeta en el cuento homónimo y qué destino sufre?",
            respuesta = "El rey no encarcela al poeta ni lo destierra: lo degrada asignándole la tarea mecánica de hacer girar continuamente el manubrio de una caja de música en el jardín del palacio para ganar mendrugos de pan; al llegar el crudo invierno, el poeta perece totalmente congelado con la mano sobre la manivela."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo pierde la vida el hijo del tío Lucas en el relato proletario 'El fardo'?",
            respuesta = "No muere en un naufragio ni ahogado en el mar: fallece en la lancha de desembarco aplastado contra el maderamen por un pesadísimo fardo de telas de importación que se desenganchó accidentalmente de las cadenas de la grúa del buque."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué innovación métrica destaca en el célebre soneto 'Caupolicán' de Rubén Darío?",
            respuesta = "Darío sustituye el endecasílabo tradicional del soneto clásico castellano por el verso alejandrino (14 sílabas con cesura rítmica simétrica en 7+7) de influencia parnasiana francesa, otorgando una sonoridad majestuosa y una fuerza escultórica sin precedentes a la hazaña épica del guerrero mapuche."
        )
    )
)
