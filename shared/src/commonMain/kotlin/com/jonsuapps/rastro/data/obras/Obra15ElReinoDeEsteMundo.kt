package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra15ElReinoDeEsteMundo = ObraLiteraria(
    id = "el-reino-de-este-mundo",
    titulo = "El reino de este mundo",
    autor = "Alejo Carpentier",    anio = "Siglo XX (1949)",
    pais = "Cuba",
    colorHex = "#059669",
    corriente = "Narrativa hispanoamericana contemporánea / Lo Real Maravilloso Americano",
    genero = "Narrativo",
    especie = "Novela histórica y mítica",
    categoria = "Literatura Hispanoamericana",    sinopsis = """
        Publicada en México en 1949 e inaugurada por su célebre Prólogo donde Alejo Carpentier formula el manifiesto estético de 'lo real maravilloso americano', 'El reino de este mundo' es una de las cumbres universales de la novela histórica y mítica contemporánea. Ambientada en el Caribe durante más de seis décadas vertiginosas (desde mediados del siglo XVIII hasta la década de 1820), la novela recrea los acontecimientos colosales de la Revolución de Haití —la primera república negra del mundo— a través de la mirada épica y chamánica del esclavo Ti Noel.

        La trama articula la tragedia colectiva de una tierra atravesada por el prodigio y la barbarie: se inicia en la colonia francesa de Saint-Domingue, donde el esclavo mandinga Mackandal pierde un brazo en el trapiche, se alza en cimarrón y desata una guerra invisible de venenos fúngicos contra los amos blancos, consumando ante la hoguera colonial el milagro de quebrar sus cadenas y volar por los aires ante la multitud negra. Años después estalla la insurrección general tras el juramento de sangre de Bois-Caïman convocado por el sacerdote vudú Bouckman; mientras los hacendados huyen arruinados a Santiago de Cuba y la armada napoleónica de Pauline Bonaparte sucumbe diezmada por la fiebre amarilla entre ritos mágicos, Ti Noel compra su libertad y regresa a su patria esperando encontrar la emancipación fraterna.

        Sin embargo, Ti Noel descubre que la revolución ha engendrado una pesadilla aún más sanguinaria: el antiguo cocinero Henri Christophe se ha autoproclamado monarca absolutista (Rey Enrique I), imponiendo el látigo a decenas de miles de negros para erigir la ciclópea Ciudadela La Ferrière en la cima de un monte, amasada con cal viva y sangre de toros degollados. Acosado por el fantasma del arzobispo Brelle y la sublevación de los tambores de vudú, Christophe se suicida con una bala de plata pura. Finalmente, ante la llegada de los agrimensores mulatos republicanos que restablecen el trabajo forzado, el anciano Ti Noel utiliza la licantropía chamánica para metamorfosearse en diversos animales (pájaro, caballo, avispa y ganso); al ser repudiado por el clan de los gansos, experimenta la epifanía final: la evasión animal es cobarde y la verdadera grandeza del hombre consiste en habitar la historia terrenal y luchar por la dignidad en 'el reino de este mundo', convocando el gran huracán verde que barre la opresión antes de disolverse en el viento.
    """.trimIndent(),
    contextoHistorico = """
        En diciembre de 1943, Alejo Carpentier viajó a Haití en compañía de Louis Jouvet; al contemplar las ruinas barrocas del palacio de Sans-Souci y la monumental fortaleza de La Ferrière en el Cabo haitiano, experimentó la revelación de que la realidad latinoamericana y caribeña superaba cualquier invención literaria.

        En el Prólogo fundacional a la edición de 1949, Carpentier ajustó cuentas con el Surrealismo europeo:
        1. Lo maravilloso prefabricado europeo: Calificó el surrealismo de Breton como un artificio cerebral, frío y mecánico nacido del hastío burgués de Occidente (relojes blandos, cadáveres exquisitos, trucos de prestidigitador).
        2. Lo real maravilloso americano: Es una dimensión ontológica, espontánea e inmanente a la historia viva de América Latina. Brota del mestizaje cultural, la supervivencia viva de las religiones y mitos africanos (vudú, santería), la exuberancia de la naturaleza virgen y una historia inverosímil poblada de prodigios cotidianos.
        3. El requisito de la fe: Para que el milagro exista, es imprescindible la fe colectiva. Para el esclavo haitiano, la metamorfosis animal de Mackandal o el vuelo sobre las llamas no son metáforas decorativas, sino hechos empíricos indiscutibles que moldearon la independencia.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Ti Noel",
            rol = "Esclavo testigo, narrador mítico y patriarca colectivo",
            descripcion = "Esclavo analfabeto perteneciente inicialmente a la plantación de Mezy. Atraviesa seis décadas de historia haitiana desde la juventud hasta la decrepitud chamánica. Es el depositario de la memoria mítica de los loas y de las hazañas de Mackandal. Padece sucesivamente la tiranía de los franceses blancos, del rey negro Christophe y de los mulatos republicanos. En su vejez adquiere la facultad de metamorfosearse en animales y formula la gran epifanía ética de la novela antes de convocar el huracán liberador."
        ),
        PersonajeLiterario(
            nombre = "Mackandal",
            rol = "Caudillo cimarrón, hechicero y señor del veneno",
            descripcion = "Esclavo negro mandinga de gran estatura e inteligencia botánica. Tras perder el brazo izquierdo triturado por los rodillos de un trapiche azucarero, huye a las montañas. Emplea la flora tropical para elaborar venenos que diezman a los amos coloniales. Dotado de poderes de licantropía mágica, al ser quemado vivo en la plaza mayor de Cap-Français quiebra sus cadenas y vuela por los cielos, transformándose en mito inmortal de resistencia."
        ),
        PersonajeLiterario(
            nombre = "Monsieur Lenormand de Mezy",
            rol = "Hacendado blanco francés de la llanura del Norte",
            descripcion = "Amo original de Ti Noel. Representa la decadencia, la crueldad sádica y la lascivia del régimen colonialista francés. Salva la vida durante la sublevación de 1791 sumergiéndose en un pozo de fango y estiércol. Huye a Santiago de Cuba, donde termina arruinado en las mesas de juego y la bohemia alcohólica, vendiendo a Ti Noel al mejor postor antes de morir en la indigencia."
        ),
        PersonajeLiterario(
            nombre = "Bouckman",
            rol = "Sacerdote y brujo vudú (houngan) jamaicano",
            descripcion = "Caudillo hercúleo que convoca el histórico pacto de Bois-Caïman en agosto de 1791. En medio de una tormenta atroz, degüella a un cerdo negro sagrado y reparte su sangre caliente entre los delegados de las plantaciones, proclamando la guerra santa contra el Dios de los blancos y ordenando el exterminio de los opresores."
        ),
        PersonajeLiterario(
            nombre = "Pauline Bonaparte",
            rol = "Princesa imperial francesa, hermana de Napoleón",
            descripcion = "Esposa del general Leclerc que arriba a la isla de la Tortuga desplegando el lujo indolente, sensual y caprichoso de la corte parisina. Al desatarse la epidemia mortífera de fiebre amarilla que diezma a las tropas francesas, su barniz ilustrado colapsa: aterrada por el contagio, se entrega a los baños de sangre y ritos de brujería de su criado negro Solimán antes de huir a Europa con el féretro de su marido."
        ),
        PersonajeLiterario(
            nombre = "Henri Christophe (Rey Enrique I)",
            rol = "Antiguo cocinero negro y monarca absolutista de Haití",
            descripcion = "Instaura un régimen negro tiránico y grotesco en el norte de Haití que imita servilmente el protocolo feudal de Versalles, creando títulos como duques de la Limonada y marqueses del Chocolate. Esclaviza despiadadamente a su propio pueblo a punta de látigo para levantar la Ciudadela La Ferrière con sangre de reses vivas. Tras sufrir un ataque de apoplejía ante el fantasma del arzobispo Brelle, se suicida disparándose en el corazón con una bala de plata pura."
        ),
        PersonajeLiterario(
            nombre = "Solimán",
            rol = "Bañero, masajista de Pauline y criado de la corte negra",
            descripcion = "Criado musculoso que administra los baños y conjuros de vudú a Pauline Bonaparte en la Tortuga. Posteriormente sirve a Henri Christophe y marcha al destierro a Roma con la reina viuda; en la Villa Borghese contempla la estatua de mármol desnuda de Pauline esculpida por Canova, sufriendo un delirio histérico que destruye su razón al chocar la piedra fría con la memoria viva de la carne."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Parte I: El Veneno de Mackandal, la Licantropía y el Milagroso Vuelo en la Hoguera",
            detalle = """
                En la llanura norte de Saint-Domingue, el esclavo Ti Noel sirve a su amo colonial Lenormand de Mezy. Su compañero de faena, el vigoroso esclavo mandinga Mackandal, sufre un atroz accidente en el trapiche azucarero al serle triturada la mano y el brazo izquierdo entre los rodillos de molienda. Lisiado y apartado del corte de caña, Mackandal cuida del ganado y se adentra con sabiduría mística en la botánica secreta del trópico: recolecta hongos venenosos, raíces y savias letales, ensayando toxinas invisibles.

                Poco después se fuga a las cumbres escarpadas, convirtiéndose en el gran caudillo cimarrón. Desata una guerra bacteriológica despiadada: rebaños enteros, caballos y familias blancas mueren entre espasmos repentinos tras beber el agua o consumir chocolate en las mansiones. El pánico paraliza a Cap-Français. Los colonos descubren la conjura torturando a una esclava y peinan los montes, pero los negros celebran que Mackandal posee el don de la licantropía: se transmuta en mariposa, avispa, pájaro o serpiente para burlar los cerrojos.

                Tras cuatro años de guerra invisible, Mackandal baja a un baile campesino en el ingenio de Dufrené; delatado a los soldados, es apresado y condenado a la hoguera en la plaza mayor. En medio del suplicio, cuando las llamas lamen su carne, el mandinga da un alarido cósmico, quiebra las cadenas con furor sobrehumano y salta por los aires por encima de la multitud despavorida. Aunque los soldados sofocan el tumulto y barren las cenizas, los esclavos regresan cantando y riendo a los barracones: tienen la certeza absoluta de que Mackandal sigue vivo en el aire de la isla.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Parte II: El Pacto de Bois-Caïman, el Exilio en Cuba y la Peste de Pauline Bonaparte",
            detalle = """
                Casi dos décadas después de la inmolación de Mackandal, el descontento esclavo estalla en el bosque sagrado de Bois-Caïman en la noche tormentosa del 14 de agosto de 1791. El sacerdote vudú Bouckman maldice al Dios de los opresores y degüella un cerdo negro sagrado; todos beben su sangre caliente y juran degollar a los amos blancos al compás de los tambores radás.

                Esa misma noche los cañaverales arden y estalla la matanza general. Ti Noel y los rebeldes saquean la hacienda de Mezy, destrozan los espejos y violan a Mademoiselle Floridor; Lenormand de Mezy se salva milagrosamente sumergiéndose durante horas en un pozo ciego de estiércol y lodo. La represión brutal del gobernador Rochambeau con perros dogos obliga a Mezy a huir a Santiago de Cuba con Ti Noel. En Cuba, los hacendados franceses consumen sus rentas entre prostíbulos, timbas y teatros; Mezy se arruina en el juego y malvende a Ti Noel a un funcionario colonial.

                En 1802 desembarca en la Tortuga la armada imperial del general Leclerc acompañada por la deslumbrante y frívola Pauline Bonaparte. Sin embargo, la fiebre amarilla ('el vómito negro') diezma a las tropas napoleónicas y ataca al general; ante el hedor de la muerte, Pauline olvida su educación ilustrada y se entrega con histeria a los ritos mágicos, sangrías de gallos y conjuros de su masajista esclavo Solimán, antes de escapar a Europa con el féretro de plomo de su esposo.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Parte III: La Tiranía de Henri Christophe, la Ciudadela de Sangre y el Suicidio de Plata",
            detalle = """
                Ti Noel compra su carta de manumisión tras la muerte de su amo cubano y regresa en bergantín a Haití creyendo hallar una república fraterna de hombres libres gobernada por su raza. Al desembarcar en Cap-Français contempla atónito un imperio negro absolutista fundado por el ex cocinero Henri Christophe (Enrique I), poblado de carrozas doradas y duques de la Limonada.

                Caminando por el campo, Ti Noel es apresado a culatazos por la guardia real: la nueva tiranía negra es infinitamente más sanguinaria que la colonial francesa. Decenas de miles de campesinos y niños son forzados a latigazos a construir la monumental Ciudadela La Ferrière en la cima del Bonnet-à-l'Évêque para guarecer al monarca de Napoleón, amasando la argamasa de los baluartes con sangre caliente de toros degollados.

                El régimen colapsa desde el misterio: durante una misa solemne en Sans-Souci, el fantasma del arzobispo Corneille Brelle se aparece al rey en el altar; Christophe sufre un ataque fulminante de apoplejía que lo paraliza. Al resonar en las colinas los tambores sagrados de vudú anunciando la rebelión de sus propias tropas, el monarca se reviste con sus galas imperiales y se suicida disparándose en el corazón con una bala de plata pura. Su cadáver es arrojado en cal viva líquida en La Ferrière, mientras Ti Noel participa en el saqueo festivo de Sans-Souci apoderándose de un espejo de ángeles dorados, un biombo y una casaca roja de gala.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Parte IV: El Delirio en Roma, las Metamorfosis de Ti Noel y el Huracán Libertario",
            detalle = """
                En Roma, adonde marcha la corte viuda de Christophe, el criado Solimán deambula por la Villa Borghese y descubre la estatua desnuda de Pauline Bonaparte esculpida en mármol por Canova: el roce de la piedra fría revive la carnalidad de sus masajes, precipitándolo a una crisis dionisiaca de locura donde muere víctima de la malaria.

                Entretanto, en las ruinas del ingenio de Mezy, Ti Noel reina como un anciano patriarca vestido con su casaca roja frente a su espejo barroco. Su sosiego se quiebra con la irrupción de agrimensores mulatos republicanos escoltados por soldados: la nueva república burguesa restablece el látigo y el trabajo obligatorio en las plantaciones.

                Comprendiendo que la tiranía se repite sin fin, Ti Noel utiliza los secretos de Mackandal para huir mediante la licantropía: se transmuta en pájaro, caballo, avispa y finalmente en ganso. No obstante, el clan de los gansos lo agrede a picotazos y lo expulsa por forastero. Desengañado, Ti Noel recupera su figura humana y experimenta su magna epifanía ontológica: la fuga animal es una cobardía y la verdadera grandeza del ser humano reside en luchar y amar en la historia terrenal contra la injusticia en 'el reino de este mundo'. Con dignidad titánica, Ti Noel declara la guerra a los nuevos tiranos y convoca un descomunal huracán verde que devasta las plantaciones, desvaneciéndose para siempre en el viento sagrado de la libertad.
            """.trimIndent()
        )
    ),
    temaPrincipal = "La circularidad trágica de la opresión y el poder político a través de los ciclos históricos, confrontada con el poder liberador de la fe colectiva en 'lo real maravilloso' y la afirmación heroica de la dignidad humana en 'el reino de este mundo'.",
    simbolosClave = listOf(
        "El vuelo de Mackandal sobre la hoguera: Símbolo de la victoria metafísica del oprimido y la fe mágica colectiva que trasciende el exterminio colonial.",
        "El sacrificio del cerdo negro en Bois-Caïman: La alianza mística indisoluble entre las fuerzas de la tierra, los loas del vudú y la insurrección de los esclavos.",
        "La Ciudadela La Ferrière: Metáfora de la tiranía circular del poder absolutista, amasada con la sangre de los mismos hermanos a quienes prometió liberar.",
        "La bala de plata de Henri Christophe: La única materia pura capaz de quebrar el pacto mágico y sellar el fin del tirano que desafió a los dioses ancestrales.",
        "La estatua de mármol de Pauline Bonaparte (Canova): Choque trágico entre el esteticismo frío neoclásico europeo y la memoria caliente de la sensualidad caribeña.",
        "El clan de los gansos: Representa la sociedad animal egoísta y cerrada que ignora la solidaridad, revelando a Ti Noel que la grandeza ética pertenece solo al ser humano.",
        "El gran huracán verde final: Encarna el juicio cósmico de la naturaleza liberada y la disolución chamánica de Ti Noel en la memoria eterna de Haití."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿En qué texto formuló Alejo Carpentier por primera vez el concepto estético de 'lo real maravilloso' y frente a qué movimiento europeo se contraponía?",
            respuesta = "Lo formuló en el célebre Prólogo a la primera edición de 'El reino de este mundo' en 1949. Se oponía frontalmente al Surrealismo europeo de André Breton, al que calificó de artificio cerebral, frío y mecánico de prestidigitadores, defendiendo que en América Latina lo maravilloso no es una invención retórica sino un fenómeno ontológico, histórico y cotidiano sustentado en la fe y el mestizaje cultural."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué doble perspectiva histórica se manifiesta durante la ejecución en la hoguera del cimarrón Mackandal?",
            respuesta = "Se produce una simetría de miradas opuestas: para los colonos blancos franceses, Mackandal fue capturado y reducido a cenizas por las llamas; en cambio, para la multitud de esclavos negros dotada de fe mágica, Mackandal quebró las cadenas y voló por los cielos sobre la plaza, manteniéndose vivo e inmortal en la naturaleza de la isla."
        ),
        PreguntaClaveObra(
            pregunta = "¿De qué manera pierde la vida el rey negro Henri Christophe y qué destino sufre su cadáver?",
            respuesta = "Tras sufrir un ataque de apoplejía ante la visión del arzobispo Brelle y presenciar el amotinamiento de sus tropas al son de los tambores de vudú, Henri Christophe se suicida en Sans-Souci disparándose en el corazón con una bala de plata pura. Su cadáver es trasladado en secreto a la Ciudadela La Ferrière y sumergido en un foso de cal viva líquida."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es la última transformación animal de Ti Noel y qué enseñanza ontológica extrae al ser rechazado?",
            respuesta = "Se transforma en un ganso para integrarse en su clan; al ser picoteado y expulsado por las aves, comprende que los animales solo velan por su especie sin solidaridad moral. Extrae la epifanía de que la evasión es una cobardía y que la suprema grandeza del ser humano no está en la dicha inútil del cielo, sino en habitar y luchar por la dignidad en 'el reino de este mundo'."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué tesis sociopolítica plantea la construcción de la fortaleza La Ferrière bajo el mando de Henri Christophe?",
            respuesta = "Plantea la circularidad trágica de la tiranía: la revolución victoriosa devino en una autocracia negra que reprodujo con mayor crueldad los métodos de servidumbre colonial, obligando a miles de campesinos a morir cargando piedras bajo el látigo de oficiales de su propia raza."
        )
    )
)
