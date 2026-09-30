package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra18CienAnosDeSoledad = ObraLiteraria(
    id = "cien-anos-de-soledad",
    titulo = "Cien años de soledad",
    autor = "Gabriel García Márquez",    anio = "Siglo XX (1967)",
    pais = "Colombia",
    corriente = "Realismo mágico / Boom latinoamericano",
    genero = "Narrativo",
    especie = "Novela total, épica y genealógica",
    categoria = "Literatura Hispanoamericana",    colorHex = "#D97706",
    sinopsis = """
        Cien años de soledad es la epopeya mítica, histórica y genealógica de la familia Buendía a lo largo de siete generaciones en el pueblo ficticio de Macondo, fundado en la ciénaga colombiana por el patriarca José Arcadio Buendía y su prima y esposa Úrsula Iguarán. La saga abarca un siglo continuo donde los acontecimientos cotidianos se funden con prodigios sobrenaturales narrados con impasible naturalidad.

        La novela se divide conceptualmente en cinco grandes ciclos históricos y míticos:
        1. La Fundación y el Tiempo Primordial: Tras matar en duelo de honor con una lanza a Prudencio Aguilar (quien se burló de su hombría marital), José Arcadio Buendía y Úrsula huyen de su tierra natal cruzando la sierra para escapar del fantasma y fundan Macondo a orillas de un río de aguas diáfanas con piedras blancas como huevos prehistóricos. Cada marzo, gitanos errantes liderados por Melquíades traen inventos asombrosos (el imán, el telescopio, la lupa gigante y el hielo). Llega la niña huérfana Rebeca portando la peste del insomnio y del olvido; para no perder la memoria, los habitantes marcan los objetos con letreros ('mesa', 'vaca', 'Dios existe') hasta que Melquíades los cura con una pócima sepia y se instala en la casa con su laboratorio de alquimia.
        2. Las Guerras Civiles del Coronel Aureliano Buendía: Ante los abusos y fraudes electorales del corregidor conservador don Apolinar Moscote, el silencioso Aureliano Buendía (casado con la tierna niña Remedios Moscote, quien muere por un aborto de gemelos) se proclama coronel liberal. Promueve treinta y dos revoluciones armadas y las pierde todas; sobrevive a catorce atentados, a setenta y tres emboscadas y a un pelotón de fusilamiento; engendra diecisiete hijos en diecisiete mujeres distintas marcados con una cruz de ceniza indeleble, todos asesinados en una sola noche por sicarios. Desencantado de la corrupción partidaria, firma la capitulación en el Tratado de Neerlandia, intenta suicidarse con un tiro de pistola que atraviesa un círculo de yodo sin tocar el corazón, y se recluye en su taller a fabricar y refundir pescaditos de oro en un bucle infinito de soledad hasta morir orinando en el castaño del patio.
        3. La Fiebre del Banano y la Masacre Obrera: El ferrocarril amarillo trae el capital norteamericano con la United Fruit Company (Mr. Herbert y Mr. Brown). Aureliano Segundo amasa fortunas gracias a la fecundidad mágica de su concubina Petra Cotes (el ganado pare trillizos y empapelan las paredes con billetes), mientras Remedios la Bella asciende al cielo en cuerpo y alma entre sábanas de bramante a las cuatro de la tarde. La infame explotación laboral desencadena una huelga masiva liderada por José Arcadio Segundo: tres mil trabajadores congregados en la estación de tren son ametrallados a mansalva por el ejército y sus cadáveres arrojados al mar en un tren nocturno de doscientos vagones. El Estado proclama la mentira oficial de que 'aquí no ha pasado nada', y José Arcadio Segundo se encierra en el cuarto de Melquíades custodiando la memoria histórica de los tres mil muertos.
        4. El Diluvio y la Decadencia: Terminado el crimen, llueve torrencialmente en Macondo durante cuatro años, once meses y dos días seguidos. La inundación pudre la tierra, ahoga el ganado y arrasa las instalaciones bananeras. Mueren Úrsula centenaria (a más de 115 años) y los gemelos en un mismo instante. Meme (Renata Remedios) vive un romance prohibido con el mecánico indígena Mauricio Babilonia, siempre rodeado de mariposas amarillas; un centinela balea a Mauricio dejándolo inválido y Meme es recluida de por vida en un convento de clausura tras parir en secreto a Aureliano Babilonia.
        5. El Apocalipsis Final y los Pergaminos: Aureliano Babilonia crece como huérfano solitario y sabio autodidacta en la casona ruinosa. Al regresar de Europa su tía Amaranta Úrsula, ambos se entregan a una pasión carnal devoradora e incestuosa. Engendran al último vástago de la estirpe: el niño nace con cola de cerdo en forma de sacacorchos. Amaranta Úrsula muere desangrada y el niño recién nacido es devorado vivo por un ejército de hormigas coloradas. Aureliano Babilonia corre al cuarto de Melquíades y descifra finalmente los pergaminos escritos en sánscrito cien años antes, descubriendo que la historia de la familia estaba profetizada en tiempo simultáneo: en el instante preciso en que termina de leer la última línea, un huracán bíblico colosal arrasa Macondo y borra para siempre a la estirpe de la faz de la tierra.
    """.trimIndent(),
    contextoHistorico = """
        Publicada en mayo de 1967 en Buenos Aires por la Editorial Sudamericana, 'Cien años de soledad' se convirtió de inmediato en el fenómeno editorial y cultural más trascendental de la literatura hispanoamericana, consagrando el 'Boom latinoamericano' y valiéndole a Gabriel García Márquez el Premio Nobel de Literatura en 1982.

        Génesis y Tono Narrativo:
        Trasladado a México en 1961, García Márquez padeció años de sequía creativa hasta que a inicios de 1965, viajando por carretera hacia Acapulco, tuvo la revelación definitiva del tono: debía contar las historias más desaforadas y fantásticas con la misma inmutable naturalidad, convicción y frialdad notarial con que su abuela materna, Tranquilina Iguarán, le relataba leyendas en Aracataca. El escritor se recluyó durante dieciocho meses en su estudio ('la cueva de la mafia') mientras su esposa Mercedes Barcha empeñaba las pertenencias domésticas para sustentar la creación.

        Estructura de Novela Total en Tres Planos:
        1. Plano Mítico y Bíblico: Macondo reproduce la historia sagrada de la humanidad desde el Génesis (mundo virginal donde las cosas carecían de nombre), el Éxodo, la caída original (el pecado del incesto), las plagas (peste del insomnio y del olvido), el diluvio universal purificador y la conflagración apocalíptica final por el fuego del viento.
        2. Plano Histórico-Social Colombiano: Sintetiza un siglo de conflictos republicanos: las guerras civiles sangrientas entre liberales y conservadores (el Coronel Aureliano Buendía modelado a partir del general Rafael Uribe Uribe), el Tratado de Neerlandia (pacto de paz de 1902 en la Guerra de los Mil Días), el enclave imperialista bananero norteamericano y la salvaje Masacre de las Bananeras de Ciénaga (diciembre de 1928), silenciada por el discurso estatal.
        3. Realismo Mágico como Epistemología: Invierte los polos de lo real: los fenómenos sobrenaturales (la levitación del cura tras tomar chocolate, la lluvia de flores amarillas tras la muerte del patriarca, la ascensión corpórea de Remedios la Bella o el regreso de los muertos) son aceptados con absoluta naturalidad cotidiana; mientras que los adelantos científicos y tecnológicos occidentales (el hielo, el imán, el telescopio, el cine o el ferrocarril) son percibidos por los lugareños como milagros aterradores y prodigios de la magia gitana.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "José Arcadio Buendía",
            rol = "Patriarca fundador de Macondo, soñador prometeico y alquimista",
            descripcion = "Hombre de voluntad indomable, fuerza descomunal y delirio científico. Tras matar de un lanzazo a Prudencio Aguilar en duelo de honor, huye cruzando la selva y funda Macondo. Se obsesiona con los inventos de Melquíades (el imán, la lupa gigante bélica, el daguerrotipo de Dios y la redondez de la tierra). Al enloquecer en un bucle mental donde todos los días son lunes, sufre una furia destructiva y su familia lo ata al tronco de un castaño en el patio, donde vive décadas dialogando en latín con el fantasma de Prudencio hasta morir de ancianidad bajo una lluvia mística de florecitas amarillas."
        ),
        PersonajeLiterario(
            nombre = "Úrsula Iguarán",
            rol = "Matriarca centenaria, eje moral, económico y vertebrador de la saga",
            descripcion = "Esposa y prima hermana del fundador. Es el pilar inquebrantable de la casa que sostiene a flote a la familia durante más de un siglo vendiendo animalitos de caramelo. Vive aterrada por el tabú del incesto y la amenaza atávica de engendrar descendientes con cola de cerdo. Sobrevive a casi todos sus hijos y nietos; pierde la vista en la ancianidad extrema pero finge conservar la visión guiándose por los ruidos y los olores con una memoria prodigiosa, falleciendo a más de ciento quince años encogida al tamaño de una niña de pecho."
        ),
        PersonajeLiterario(
            nombre = "Coronel Aureliano Buendía",
            rol = "Caudillo revolucionario liberal, clarividente y platero de pescaditos de oro",
            descripcion = "El primer ser humano nacido en Macondo. Dotado del don de la clarividencia y una gélida introversión. Casado con la niña Remedios Moscote, se alza en armas ante el fraude electoral conservador. Comanda 32 guerras civiles y las pierde todas; sobrevive a 14 atentados, 73 emboscadas y a un pelotón de fusilamiento. Engendra 17 hijos llamados Aureliano en 17 mujeres distintas, todos acribillados en una sola noche por la cruz de ceniza indeleble en sus frentes. Firma el armisticio de Neerlandia, sobrevive a un disparo suicida en el pecho y termina sus días enclaustrado en su taller fundiendo y refundiendo pescaditos de oro en un ritual de soledad estéril."
        ),
        PersonajeLiterario(
            nombre = "Melquíades",
            rol = "Gitano inmortal, sabio universal, alquimista y autor de los pergaminos proféticos",
            descripcion = "Líder de la tribu gitana que introduce los inventos de la modernidad en Macondo. Fallece en los médanos de Singapur y regresa de la muerte porque no toleraba la soledad del más allá. Se recluye en un cuarto de la casona donde el tiempo permanece estancado en un perpetuo marzo primaveral; allí redacta en sánscrito la totalidad de la historia de los Buendía con cien años de anticipación, encarnando la figura del demiurgo y autor omnisciente de la novela."
        ),
        PersonajeLiterario(
            nombre = "Remedios la Bella",
            rol = "Hija de Arcadio y Sofía de la Piedad; belleza virginal celestial",
            descripcion = "Mujer de una hermosura sobrehumana y una inocencia incontaminada de convenciones sociales: deambula desnuda por la casa con una sábana basta y rapada al rape. Todos los hombres que intentan poseerla o contemplarla mueren en accidentes trágicos o enloquecen de deseo. Una tarde de marzo a las cuatro, mientras dobla sábanas de bramante con Úrsula y Fernanda en el patio, un viento dorado la envuelve y asciende al cielo en cuerpo y alma, perdiéndose para siempre en el aire luminoso."
        ),
        PersonajeLiterario(
            nombre = "Aureliano Segundo y José Arcadio Segundo",
            rol = "Hermanos gemelos de identidades permutadas; desenfreno vs memoria histórica",
            descripcion = "Jugaban a intercambiarse en la infancia hasta quedar sus personalidades cruzadas: Aureliano Segundo es parrandero y comelón, y junto a su concubina Petra Cotes desata una multiplicación mágica del ganado vacuno empapelando paredes con billetes. José Arcadio Segundo es serio, lidera la gran huelga de la compañía bananera, sobrevive milagrosamente a la masacre de tres mil obreros en la estación escapando del tren de la muerte y se encierra en el cuarto de Melquíades como el único testigo que recuerda la verdad histórica frente al olvido oficial. Ambos mueren en el mismo instante y sus ataúdes son trocados por error en el sepelio."
        ),
        PersonajeLiterario(
            nombre = "Meme (Renata Remedios) y Mauricio Babilonia",
            rol = "Amantes proscritos; el mecánico de las mariposas amarillas y la reclusa del silencio",
            descripcion = "Meme, talentosa concertista de clavicémbalo, se entrega clandestinamente al amor de Mauricio Babilonia, modesto mecánico indígena del ferrocarril precedido siempre por una nube flotante de mariposas amarillas. Su madre Fernanda del Carpio apuesta un centinela que balea a Mauricio por la espalda, dejándolo paralítico de por vida. Meme enmudece para siempre y es enviada a morir a un claustro religioso lejano, donde pare a Aureliano Babilonia, escondido por la familia en un cuarto oscuro."
        ),
        PersonajeLiterario(
            nombre = "Amaranta Úrsula y Aureliano Babilonia",
            rol = "Los últimos amantes de la estirpe; pasión incestuosa y desciframiento apocalíptico",
            descripcion = "Amaranta Úrsula regresa de Bruselas hermosa y moderna. Ignorando su parentesco carnal directo, se une a su sobrino Aureliano Babilonia (sabio autodidacta del cuarto de Melquíades) en un amor pasional arrollador y salvaje. De esa unión incestuosa nace el último Buendía, provisto de una cola de cerdo en espiral. La madre muere desangrada y el bebé es devorado por las hormigas coloradas. Al contemplar el horror, Aureliano descifra los pergaminos en sánscrito mientras un huracán cósmico aniquila Macondo de la faz de la tierra."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Ciclo I: Fundación de Macondo, Inventos Gitanos y la Peste del Olvido",
            detalle = "José Arcadio Buendía asesina de un lanzazo en la garganta a Prudencio Aguilar por mofarse de su hombría. Hostigado por las apariciones del fantasma, huye con Úrsula y un grupo de familias hacia la sierra y funda Macondo a orillas de un río de aguas transparentes. Melquíades y los gitanos traen el imán, el catalejo, la lupa gigante y el bloque de hielo que deslumbran al patriarca. Llega la niña Rebeca portando en sus huesos la peste del insomnio y del olvido: el pueblo olvida el nombre y función de las cosas, debiendo colgar letreros identificatorios ('ésta es la vaca, hay que ordeñarla', 'Dios existe') hasta que Melquíades los cura con una pócima y se establece en la casa."
        ),
        EscenaTrama(
            titulo = "Ciclo II: Las 32 Guerras del Coronel Aureliano Buendía y los Pescaditos de Oro",
            detalle = "El corregidor conservador Apolinar Moscote pretende pintar de azul las casas de Macondo e impone el fraude en las urnas. Aureliano Buendía se subleva fundando la guerrilla liberal. Emprende 32 campañas armadas que concluyen en fracasos sangrientos; su sobrino Arcadio ejerce una tiranía despótica en Macondo y es fusilado por los conservadores. El coronel engendra 17 hijos en campaña militar, quienes son asesinados por la cruz de ceniza que lucen en la frente. Asqueado por las traiciones políticas de sus copartidarios, firma la rendición de Neerlandia, falla en su intento de suicidio con un tiro en el pecho y se refugia en su taller a forjar y fundir cíclicamente pescaditos de oro hasta morir de pie junto al castaño."
        ),
        EscenaTrama(
            titulo = "Ciclo III: La Fecundidad de Petra Cotes, la Ascensión Celestial y la Masacre Bananera",
            detalle = "La llegada del ferrocarril desata la fiebre del oro verde con la compañía bananera norteamericana (United Fruit Company). Aureliano Segundo nada en billetes gracias al frenesí reproductivo de los animales provocado por su idilio con Petra Cotes. Remedios la Bella asciende al cielo en cuerpo y alma envuelta en sábanas de bramante ante Úrsula y Fernanda. La brutal explotación laboral desemboca en una huelga masiva liderada por José Arcadio Segundo: 3.000 obreros son ametrallados por el ejército en la estación del ferrocarril y arrojados al mar en un tren de 200 vagones. La propaganda estatal borra el genocidio proclamando que 'aquí no ha pasado nada', enloqueciendo de aislamiento al sobreviviente."
        ),
        EscenaTrama(
            titulo = "Ciclo IV: El Diluvio Bíblico, las Mariposas Amarillas y la Ruina de Macondo",
            detalle = "Tras la masacre se desata una tempestad que dura cuatro años, once meses y dos días ininterrumpidos. La lluvia pudre las plantaciones, diezma el ganado y ahoga la economía; la compañía bananera desmantela sus instalaciones y abandona la región en ruinas. Muere Úrsula Iguarán a más de 115 años reducida al tamaño de un feto y fallecen al mismo tiempo los gemelos. Meme vive un amor prohibido con Mauricio Babilonia, anunciado siempre por mariposas amarillas; la madre Fernanda lo hace balear y lisiar por la espalda y destierra a Meme a un convento mudo tras dar a luz al bastardo Aureliano Babilonia."
        ),
        EscenaTrama(
            titulo = "Ciclo V: El Incesto Final, el Niño Devorado por Hormigas y el Huracán Profético",
            detalle = "Amaranta Úrsula regresa de Bélgica y se entrega a una pasión carnal feroz con su sobrino Aureliano Babilonia en el caserón invadido por la selva y las hormigas. El fruto de ese amor incestuoso nace con cola de cerdo, cumpliendo la maldición secular de Úrsula. Amaranta Úrsula muere desangrada y el recién nacido es devorado vivo por un enjambre de hormigas coloradas. Aureliano Babilonia corre al cuarto de Melquíades y descifra los pergaminos en sánscrito: comprende que la historia de la familia estaba escrita en tiempo simultáneo y que él mismo está viviendo el instante final mientras un huracán apocalíptico arrasa y borra para siempre a Macondo de la memoria terrenal."
        )
    ),
    temaPrincipal = "La soledad como condena ontológica e incapacidad genética y psicológica para amar de la estirpe Buendía a lo largo de un siglo; la circularidad trágica del tiempo ('el tiempo da vueltas en redondo') y la transgresión bíblica del incesto castigada con la aniquilación definitiva de Macondo.",
    simbolosClave = listOf(
        "El hielo: Símbolo del deslumbramiento inicial ante lo desconocido, el origen virginal de Macondo y la memoria evocada frente al pelotón de fusilamiento.",
        "Los pescaditos de oro: Metáfora de la esterilidad del poder, el trabajo inútil y la soledad hermética del Coronel Aureliano Buendía, quien los fabrica y refunde en un ciclo eterno sin fin ni ganancia.",
        "Las mariposas amarillas: Augurio poético y mágico que precede siempre la presencia corporal de Mauricio Babilonia, encarnando el amor apasionado, trágico y perseguido.",
        "Las sábanas de bramante: Vehículo de la pureza y ascensión celestial en cuerpo y alma de Remedios la Bella a las altas esferas del aire.",
        "El castaño del patio: Eje cósmico de la locura y el retiro del mundo; allí es amarrado José Arcadio Buendía hablando latín con los muertos y allí muere orinando el Coronel Aureliano.",
        "La cruz de ceniza: Estigma indeleble marcado por el sacerdote el Miércoles de Ceniza en la frente de los 17 Aurelianos, que sirve de blanco fatal para que los sicarios del gobierno los asesinen a todos en una sola noche.",
        "Los pergaminos en sánscrito: El texto sagrado cifrado por Melquíades donde coexiste la historia familiar en tiempo simultáneo; la lectura y la aniquilación cósmica son el mismo acto.",
        "La cola de cerdo y las hormigas coloradas: Consumación material del tabú del incesto y vehículo de la extinción biológica de la estirpe, arrastrado el cadáver del último Buendía por las hormigas devoradoras."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Quién fue el fundador de Macondo y por qué motivo abandonó su tierra de origen?",
            respuesta = "El fundador de Macondo fue el patriarca José Arcadio Buendía (¡NO el coronel Aureliano Buendía!). Abandonó su pueblo natal tras asesinar con una lanza a Prudencio Aguilar en un duelo de honor provocado por las burlas de este sobre la virginidad intacta de Úrsula; acosado por el fantasma sangrante de Prudencio que venía a lavar su herida, cruzó la sierra con su familia para fundar Macondo a orillas del río."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuántas guerras civiles lideró el Coronel Aureliano Buendía y cuál fue el resultado militar de sus campañas?",
            respuesta = "El Coronel Aureliano Buendía promovió y comandó exactamente treinta y dos (32) levantamientos armados liberales y LAS PERDIÓ TODAS. Nunca ganó una guerra; sobrevivió a catorce atentados, setenta y tres emboscadas y a un pelotón de fusilamiento antes de firmar la rendición incondicional en el Tratado de Neerlandia."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál es el núcleo histórico-social de denuncia política en la novela y quién es su único testigo?",
            respuesta = "Es la Masacre de las Bananeras (diciembre de 1928), donde el ejército ametralla a más de 3.000 trabajadores huelguistas de la United Fruit Company en la estación del ferrocarril y traslada sus cadáveres al mar en un tren de 200 vagones. El único testigo sobreviviente es José Arcadio Segundo, quien lucha inútilmente contra la mentira de Estado ('aquí no ha pasado nada') recluido en el cuarto de Melquíades."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quiénes son los padres del niño que nace con cola de cerdo en la séptima generación y cuál es su trágico destino?",
            respuesta = "El niño con cola de cerdo es fruto del amor incestuoso entre Aureliano Babilonia y su tía carnal Amaranta Úrsula (¡NO de José Arcadio Buendía y Úrsula!). Al morir la madre desangrada en el parto y salir Aureliano enloquecido a emborracharse, el recién nacido abandonado en el patio es arrastrado y devorado vivo por las hormigas coloradas, cumpliendo la profecía de Melquíades."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué idioma estaban redactados los pergaminos de Melquíades y qué revelación final contienen?",
            respuesta = "Estaban escritos en sánscrito por el gitano Melquíades con cien años de anticipación, estructurados de tal forma que un siglo de historia coexistía en un instante simultáneo. Al descifrarlos Aureliano Babilonia, descubre que lee su propio presente y muerte, concluyendo con la sentencia: 'porque las estirpes condenadas a cien años de soledad no tenían una segunda oportunidad sobre la tierra', al tiempo que Macondo es borrado por un huracán bíblico."
        )
    )
)
