package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra01Iliada = ObraLiteraria(
    id = "la-iliada",
    titulo = "La Ilíada",
    autor = "Homero",
    anio = "Siglo VIII a.C.",
    pais = "Grecia Antigua",
    genero = "Épico",
    especie = "Epopeya",
    corriente = "Clasicismo Griego",
    temaPrincipal = "La cólera de Aquiles (mênis) —iniciada por la afrenta de Agamenón al arrebatarle a Briseida y recrudecida tras la muerte de Patroclo— y su posterior humanización trágica a través de la piedad y el dolor compartido ante el anciano rey Príamo.",
    colorHex = "#991B1B",
    categoria = "Literatura Universal",
    sinopsis = """La acción de la Ilíada se concentra en 51 días cruciales del décimo y último año de la legendaria Guerra de Troya. El conflicto se desata cuando Agamenón, comandante en jefe de los aqueos, ultraja al sacerdote troyano Crises negándose a devolverle a su hija Criseida. En castigo, el dios Apolo descarga una peste mortífera con sus flechas sobre el campamento griego. Para aplacar la ira divina, Agamenón devuelve a Criseida, pero en compensación despoja violentamente a Aquiles de su doncella y botín de honor, Briseida. Enfurecido ante semejante afrenta a su honor guerrero (timé), Aquiles jura por su cetro retirarse del combate junto con sus mirmidones y ruega a su madre, la nereida Tetis, que interceda ante Zeus para que los troyanos derroten a los griegos hasta que su honor sea plenamente restaurado.

Aprovechando la ausencia del máximo adalid aqueo, las huestes troyanas lideradas por el príncipe Héctor desatan una ofensiva arrolladora. Los teucros hacen retroceder a los griegos, traspasan su muro defensivo y alcanzan las proas de las naves, amenazando con incendiarlas y cortar toda retirada. Ante el inminente desastre, Agamenón reconoce su error y envía una embajada de desagravio encabezada por Odiseo, Áyax y Fénix ofreciendo inmensas riquezas y la devolución de Briseida; sin embargo, Aquiles rechaza con desdén la oferta, priorizando su orgullo herido. Desesperado al ver arder los navíos y a los caudillos heridos, Patroclo, hermano espiritual y compañero entrañable de Aquiles, le suplica permiso para vestir su armadura divina y encabezar a los mirmidones con el fin de aterrorizar a los troyanos. Aquiles consiente, pero le impone una orden estricta: expulsar a los enemigos de las naves sin perseguirlos hasta las murallas de Ilión. No obstante, cegado por el fervor de la victoria, Patroclo avanza hasta la ciudadela, donde el dios Apolo lo golpea y desarma por la espalda, Euforbo lo hiere y Héctor lo remata con su pica, despojándolo de la armadura.

La muerte de Patroclo produce un quiebre desgarrador en el alma de Aquiles, transformando su rencor contra Agamenón en una segunda cólera implacable y sanguinaria de venganza contra Héctor. Tras reconciliarse formalmente con Agamenón en la asamblea y recibir una nueva armadura forjada por el dios Hefesto —cuyo escudo representa una alegoría integral del cosmos y la sociedad humana—, Aquiles reingresa al combate como una fuerza salvaje e imparable. Ciega con cadáveres el curso del río Escamandro (Janto), obligando a intervenir a los propios dioses, y acorrala a los defensores de Troya. Solo Héctor permanece fuera de las puertas Esceas para afrontarlo; invadido por el terror ante el porte refulgente del héroe griego, Héctor huye dando tres vueltas a las murallas antes de ser engañado por la diosa Atenea para presentar batalla. Héctor solicita un pacto recíproco de respeto al cadáver del vencido, pero Aquiles lo rechaza con odio lapidario, le clava su pica en la garganta y, tras perforar sus tobillos con correas, arrastra su cuerpo atado a su carro de combate alrededor del túmulo de Patroclo.

La epopeya no concluye con la barbarie, sino con la cumbre de la piedad y la dignidad humana. Guiado en secreto por el dios Hermes, el anciano rey Príamo cruza las líneas enemigas en la noche, ingresa a la tienda de Aquiles y besa las manos homicidas que habían degollado a sus hijos, implorando la entrega del cuerpo de Héctor en memoria del anciano padre de Aquiles, Peleo. Conmovido hasta el llanto ante el sufrimiento compartido y la fragilidad de la condición mortal, Aquiles aplaca su cólera, levanta a Príamo del suelo, comparte con él un banquete de reconciliación, le entrega con honores el cadáver de su hijo y pacta doce días de tregua militar absoluta. La obra culmina con las solemnes exequias fúnebres de Héctor en Troya.""",
    contextoHistorico = """La Ilíada es una epopeya fundamental atribuida al aedo ciego Homero, datada filológicamente hacia el siglo VIII a.C. (Época Arcaica griega). Refleja el recuerdo idealizado de la civilización micénica de la Edad de Bronce (siglo XII a.C.), transmitido oralmente a lo largo de los 'Siglos Oscuros' por aedos (compositores orales) y rapsodas (recitadores) hasta su fijación textual en Atenas en el siglo VI a.C. bajo el gobierno de Pisístrato.

En el plano curricular de admisión UNSA, representa el origen de la épica clásica occidental y sintetiza el código ético heroico: la areté (excelencia en combate y palabra), la timé (honor público ganado por el botín) y la kléos áphthiton (gloria imperecedera que vence al olvido de la muerte). Asimismo, la tradición filológica estudia la denominada 'Cuestión Homérica' (iniciada modernamente por F. A. Wolf en 1795), que debate la existencia histórica individual de Homero frente a la autoría colectiva y rapsódica de la tradición épica griega.""",
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "1. La Peste y la Primera Cólera de Aquiles (Canto I)",
            detalle = "El sacerdote Crises acude a los barcos griegos a rescatar a su hija Criseida; Agamenón lo expulsa con soberbia. Apolo castiga al ejército aqueo con nueve días de mortífera peste. Al conocerse por el adivino Calcante que la causa es el agravio a Crises, Agamenón accede a devolverla, pero arrebata en represalia a Briseida, botín de Aquiles. Atenea interviene para frenar a Aquiles de asesinar a Agamenón. Aquiles jura abandonar la contienda y su madre Tetis consigue que Zeus otorgue la victoria a los troyanos hasta que se repare el honor del mirmidón."
        ),
        EscenaTrama(
            titulo = "2. El Duelo Singular de Paris y la Despedida de Héctor (Cantos II al VII)",
            detalle = "Se despliegan los ejércitos en la llanura (Catálogo de las Naves). Paris y Menelao pactan un duelo por Helena para frenar la guerra; al ser arrastrado por el casco, Afrodita envuelve a Paris en niebla y lo salva. Se rompe la tregua y Diomedes desata su furor (aristeia) hiriendo a Afrodita y a Ares. Héctor regresa brevemente a Troya y tiene lugar el conmovedor coloquio con su esposa Andrómaca y su hijo Astianacte junto a las puertas Esceas, quitándose el yelmo marcial para calmar el llanto del infante y aceptando con dignidad el llamado de su patria."
        ),
        EscenaTrama(
            titulo = "3. La Gran Crisis en las Naves y la Embajada Frustrada (Cantos VIII y IX)",
            detalle = "Zeus prohíbe combatir a los dioses e inclina su balanza en favor de Troya. Héctor cerca a los griegos y acampa a orillas del campamento naval con mil fogatas. Agamenón, desesperado, envía a Odiseo, Áyax y Fénix ofreciendo disculpas públicas, inmensos tesoros y la devolución de Briseida intacta. Aquiles rechaza enérgicamente la embajada, manifestando que ningún botín terrenal compensa el sacrificio de su propia vida frente a un caudillo tiránico."
        ),
        EscenaTrama(
            titulo = "4. La Invasión Troyana y la Muerte de Patroclo (Cantos X al XVII)",
            detalle = "Héctor revienta los portones del muro aqueo con una piedra colosal e inicia el incendio de la flota. Patroclo suplica a Aquiles que le permita vestir su armadura para espantar a los enemigos. Aquiles le ordena limitarse a defender las naves y no acercarse a las murallas de Ilión. Patroclo salva los barcos y mata a Sarpedón, pero enardecido avanza hasta los muros de Troya. El dios Apolo lo golpea y desarma por la espalda, Euforbo lo hiere y Héctor lo remata, arrebatándole la armadura de Aquiles mientras Menelao rescata su cadáver desnudo."
        ),
        EscenaTrama(
            titulo = "5. El Duelo por Patroclo y el Escudo Cósmico (Cantos XVIII al XXI)",
            detalle = "Al enterarse de la muerte de Patroclo, Aquiles cae en desesperación, ensucia sus cabellos de ceniza y emite un triple rugido colosal en la trinchera que espanta a los teucros. Hefesto forja para él una armadura invulnerable con un escudo que representa todo el universo: el sol, las estrellas, dos ciudades (una pacífica con bodas y justicia civil, y otra en guerra), campos de labranza y viñedos. Aquiles se reconcilia con Agamenón, vuelve al combate y ciega de sangre y cadáveres las aguas del río Escamandro, que cobra vida para ahogarlo hasta ser sofocado por el fuego divino de Hefesto."
        ),
        EscenaTrama(
            titulo = "6. El Combate Mortal: Aquiles contra Héctor (Canto XXII)",
            detalle = "Héctor aguarda en soledad ante las murallas de Ilión. Ante la aterradora aproximación de Aquiles, huye dando tres vueltas completas a la ciudad. Atenea adopta la figura de su hermano Deífobo para inducirlo a pelear. Héctor propone un pacto de respeto mutuo al cuerpo del vencido, pero Aquiles lo rechaza con desprecio comparando su enemistad con la de leones y hombres. Aquiles clava su pica en la garganta de Héctor, le perfora los tobillos con correas de buey y arrastra su cuerpo en el polvo atado a su carro triunfal a la vista de Príamo, Hécuba y Andrómaca."
        ),
        EscenaTrama(
            titulo = "7. La Redención Trágica y los Funerales de Héctor (Cantos XXIII y XXIV)",
            detalle = "Se celebran juegos funerarios en honor a Patroclo. Durante días, Aquiles profana el cadáver de Héctor arrastrándolo en torno al túmulo, pero Apolo protege el cuerpo. Zeus ordena que se devuelva el cadáver. Guiado por Hermes, el anciano rey Príamo ingresa encubierto a la tienda de Aquiles y besa las manos del asesino de sus hijos. Conmovido por el recuerdo de su padre Peleo, Aquiles rompe en llanto junto a Príamo, entrega con honores el cadáver y concede doce días de tregua militar para que Troya celebre los funerales solemnes de Héctor."
        )
    ),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Aquiles (El de los pies ligeros)",
            rol = "Protagonista y héroe máximo aqueo",
            descripcion = "Semidiós hijo de Peleo y la nereida Tetis, rey de los mirmidones. Encarna el orgullo individualista, la pasión colérica desbordada y la búsqueda de gloria eterna (kléos) mediante una muerte joven y memorable."
        ),
        PersonajeLiterario(
            nombre = "Héctor (El de tremolante casco)",
            rol = "Príncipe heredero y defensor supremo de Troya",
            descripcion = "Hijo de Príamo y Hécuba. Lucha por amor a su patria, el honor de su pueblo y la defensa de su esposa Andrómaca y su hijo Astianacte, encarnando el deber cívico y moral frente al egoísmo bélico."
        ),
        PersonajeLiterario(
            nombre = "Agamenón (Rey de hombres)",
            rol = "Comandante supremo de las tropas aqueas",
            descripcion = "Soberano de Micenas y hermano de Menelao. De carácter soberbio, codicioso y autoritario; su afrenta al despojar a Aquiles de Briseida desata el conflicto inicial del poema."
        ),
        PersonajeLiterario(
            nombre = "Patroclo",
            rol = "Compañero entrañable y alter ego de Aquiles",
            descripcion = "Mirmidón leal caracterizado por su piedad y conmiseración hacia los aqueos. Viste la armadura de Aquiles para salvar la flota y muere trágicamente a manos de Apolo, Euforbo y Héctor."
        ),
        PersonajeLiterario(
            nombre = "Príamo",
            rol = "Anciano rey de Troya",
            descripcion = "Padre piadoso de Héctor, Paris y cincuenta hijos. Protagoniza el clímax emocional al arrodillarse ante Aquiles y besar sus manos homicidas para rescatar el cuerpo de su primogénito."
        ),
        PersonajeLiterario(
            nombre = "Odiseo (El fecundo en ardides)",
            rol = "Rey de Ítaca y estratega aqueo",
            descripcion = "Maestro de la astucia, prudencia y elocuencia diplomática. Contiene las desbandadas militares y lidera la embajada enviada a la tienda de Aquiles."
        ),
        PersonajeLiterario(
            nombre = "Diomedes",
            rol = "Joven rey de Argos",
            descripcion = "Guerrero aqueo de extraordinaria valentía. En su aristeia, dotado de fuerza divina por Atenea, llega a herir en el campo de combate a los dioses Afrodita y Ares."
        ),
        PersonajeLiterario(
            nombre = "Andrómaca",
            rol = "Esposa de Héctor",
            descripcion = "Símbolo de la abnegación conyugal y madre protectora de Astianacte. Presiente con dolorosa certidumbre la caída de Ilión y la tragedia que asolará a su estirpe."
        ),
        PersonajeLiterario(
            nombre = "Paris (Alejandro)",
            rol = "Príncipe troyano raptor de Helena",
            descripcion = "Hermano de Héctor. De porte seductor y aficionado al arco, rehúye el combate frontal pero constituye el detonante mítico de la expedición helénica tras el Juicio de Paris."
        ),
        PersonajeLiterario(
            nombre = "Helena de Esparta",
            rol = "Causa mítica de la guerra",
            descripcion = "Esposa de Menelao entregada a Paris por Afrodita. Vive atormentada por la culpa y el desprecio de las mujeres troyanas ante la ruina causada por su belleza."
        )
    ),
    simbolosClave = listOf(
        "La Cólera (mênis): Núcleo vertebrador de la epopeya; fuerza destructiva que quiebra el orden y solo halla purificación en el dolor compartido.",
        "El Escudo de Aquiles: Alegoría cósmica integral labrada por Hefesto que sintetiza el universo natural, la paz social con justicia civil y la guerra como contingencia transitoria.",
        "La Balanza Dorada de Zeus (kerostasía): Símbolo del Destino supremo (ananké/moira) al que incluso los dioses olímpicos están inexorablemente subordinados.",
        "Las Manos Besadas por Príamo: La derrota del odio bélico y el advenimiento de la compasión, la piedad filial y el reconocimiento de la humanidad en el enemigo.",
        "El Río Escamandro (Janto): Reacción colérica de la naturaleza viva frente a la desmesura sangrienta de los mortales."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Con qué suceso culmina exactamente la Ilíada de Homero?",
            respuesta = "Culmina con los funerales solemnes de Héctor en Troya ('Así celebraron las exequias fúnebres de Héctor, domador de caballos'). Ni la muerte de Aquiles, ni el caballo de madera, ni el incendio de Troya forman parte del poema."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quiénes participan en la muerte de Patroclo según el Canto XVI?",
            respuesta = "Es golpeado y despojado de sus armas primero por el dios Apolo, luego herido por el combatiente troyano Euforbo y finalmente rematado por Héctor."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es el motivo que provoca el retiro de Aquiles del campo de batalla?",
            respuesta = "La afrenta a su honor perpetrada por Agamenón, quien le despojó injustamente de su doncella y botín de honor Briseida tras haber devuelto a Criseida."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué argumento de Príamo conmueve el corazón de Aquiles para devolver el cuerpo de Héctor?",
            respuesta = "La invocación a su propio padre Peleo, de edad similar a Príamo y sumido en la soledad de la vejez en Ftía, a quien Aquiles sabe que jamás volverá a ver con vida."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué dioses apoyan a cada bando durante la lid homérica?",
            respuesta = "A favor de los aqueos (griegos): Hera, Atenea, Poseidón y Hefesto. A favor de los troyanos: Apolo, Afrodita, Ares y Artemisa. Zeus se sitúa como árbitro imparcial subordinado al Destino."
        )
    )
)
