package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra19ComentariosReales = ObraLiteraria(
    id = "comentarios-reales",
    titulo = "Comentarios Reales de los Incas",
    autor = "Inca Garcilaso de la Vega",    anio = "Siglo XVII (1609 / 1617)",
    pais = "Perú",
    corriente = "Crónicas de Indias / Renacimiento hispanoamericano / Humanismo neoplatónico",
    genero = "Épico / Narrativo histórico",
    especie = "Crónica histórica monumental comentada",
    categoria = "Literatura Peruana",    colorHex = "#B45309",
    sinopsis = """
        Los Comentarios Reales de los Incas es la obra cumbre de la historiografía colonial y el monumento fundador de la identidad mestiza del Perú, escrita por Gómez Suárez de Figueroa, quien adoptó con orgullo el nombre de Inca Garcilaso de la Vega. La obra se halla dividida editorial e históricamente en dos partes monumentales:

        1. Primera Parte (Lisboa, 1609): Consta de 9 libros y 262 capítulos. Está dedicada al origen, idolatría, leyes, instituciones, economía, lengua y gobierno de los reyes incas del Tahuantinsuyo. Garcilaso divide la historia andina en dos edades: la edad salvaje preincaica (marcada por la barbarie, la antropofagia, el desorden civil y el culto zoológico a animales repugnantes) y la edad civilizadora incaica, iniciada cuando el Sol envía a Manco Cápac y Mama Ocllo desde el lago Titicaca con una vara de oro macizo para fundar el Cuzco en el cerro Huanacaure al hundirse la barreta de un solo golpe. Garcilaso demuestra que los incas alcanzaron una teología monoteísta solar racional y un culto interior al Dios invisible Pachacámac ('el que da alma al universo'), sin templos materiales ni estatuas; detalla el código moral supremo (Ama sua, Ama llulla, Ama quella), el sistema agrario tripartito (tierras del Sol, de los desvalidos y del pueblo por topos, y del Inca) con sus graneros de reserva (tambos y qollqas), la precisión estadística de los quipus y la arquitectura ciclópea de Sacsayhuamán. Concluye con la división del imperio por Huayna Cápac entre Huáscar y Atahualpa, y la feroz guerra civil fratricida que desgarró la nación andina.

        2. Segunda Parte (Córdoba, 1617, póstuma, titulada 'Historia General del Perú'): Consta de 8 libros y 268 capítulos. Relata el descubrimiento y conquista del Perú por Francisco Pizarro, Diego de Almagro y Hernando de Luque, destacando la hazaña de los Trece de la Fama en la Isla del Gallo. Analiza la catástrofe comunicativa en Cajamarca: el Requerimiento leído por el fraile Vicente de Valverde traducido grotescamente por el tosco intérprete Felipillo de Poechos, el arrojo del breviario por Atahualpa, la emboscada artillera y la prisión del monarca; la oferta del cuarto del rescate colmado de oro y plata y la injusta ejecución del inca al garrote vil tras su bautizo. A continuación, narra con dramatismo trágico las sangrientas guerras civiles entre los conquistadores: el choque entre pizarristas y almagristas (batalla de las Salinas y degollamiento de Almagro el Viejo; el asesinato de Pizarro en su palacio de Lima por los de Chile); la gran rebelión feudal de los encomenderos comandada por Gonzalo Pizarro y su implacable maestro de campo Francisco de Carvajal ('el Demonio de los Andes'), quien degüella al primer virrey Blasco Núñez Vela; la pacificación diplomática de Pedro de la Gasca y la ejecución de los rebeldes en Jaquijahuana (1548). Concluye con la resistencia final de los Incas de Vilcabamba y el desgarrador martirio en 1572 del último inca Túpac Amaru I, decapitado en la plaza mayor del Cuzco por orden del virrey Francisco de Toledo ante el clamor ensordecedor de trescientos mil indígenas que enmudecen ante el majestuoso gesto de la mano del soberano.
    """.trimIndent(),
    contextoHistorico = """
        Nacido en el Cuzco en 1539, pocos años después del choque de Cajamarca, el Inca Garcilaso de la Vega fue hijo del noble capitán conquistador extremeño Sebastián Garcilaso de la Vega y de la princesa imperial incaica Isabel Chimpu Ocllo (nieta de Túpac Yupanqui). Vivió sus primeros veinte años en el Cuzco aprendiendo las letras latinas con preceptores españoles y la memoria oral quechua y los quipus en el palacio materno con sus parientes incas.

        Viaje a España y Humanismo Neoplatónico:
        En 1560 viajó a la península ibérica para reclamar ante la corte de Madrid los servicios de su padre, sufriendo el rechazo de la burocracia imperial. Instalado en Montilla y Córdoba, se consagró al estudio de las humanidades renacentistas. En 1590 publicó su célebre traducción del italiano de los 'Diálogos de amor' del filósofo neoplatónico judío León Hebreo, asimilando la tesis filosófica central de su obra: el amor es el principio cósmico de armonía que reconcilia los contrarios. Lejos de avergonzarse, asume el mestizaje como una misión providencial: integrar la grandeza del Imperio Incaico con la lengua castellana y la fe católica.

        La Condición de Filólogo y la Prohibición de la Obra:
        Garcilaso escribe para corregir los yerros y calumnias de los cronistas españoles (López de Gómara, Zárate, Acosta), señalando que estos distorsionaron la historia andina por desconocer la riqueza semántica y fonética de la lengua quechua. 
        En 1782, tras la formidable rebelión indígena de José Gabriel Condorcanqui (Túpac Amaru II), el rey Carlos III y el Consejo de Indias emitieron una Real Cédula secreta ordenando confiscar y quemar todos los ejemplares de los 'Comentarios Reales' en el virreinato del Perú, por considerarlo un texto altamente sedicioso que despertaba el orgullo patriótico y la memoria autonomista de los naturales.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Inca Garcilaso de la Vega",
            rol = "Autor, cronista, filósofo renacentista y primer mestizo espiritual de América",
            descripcion = "Hijo de conquistador español y palla imperial inca. Escribe como testigo de vista y puente cultural supremo entre dos mundos. Reivindica con erudición humanista y elegancia ciceroniana la grandeza civilizadora, moral y teológica del Tahuantinsuyo, declarándose orgullosamente mestizo a boca llena."
        ),
        PersonajeLiterario(
            nombre = "Manco Cápac y Mama Ocllo",
            rol = "Hijos del Sol y fundadores míticos civilizadores del Cuzco",
            descripcion = "Enviados por el Padre Sol desde el lago Titicaca con la sagrada vara de oro para redimir a la humanidad del salvajismo. Manco Cápac civiliza a los varones fundando el Hanan Cuzco y enseñándoles la agricultura y las leyes; Mama Ocllo civiliza a las mujeres fundando el Hurin Cuzco y enseñándoles el tejido, el hilado y las virtudes domésticas."
        ),
        PersonajeLiterario(
            nombre = "Pachacámac",
            rol = "Dios supremo inmaterial e invisible del panteón incaico",
            descripcion = "Deidad concebida por los amautas como el sustentador que da alma al universo ('Pacha': mundo; 'Cámac': animador). Garcilaso enfatiza que los incas jamás le fabricaron ídolos ni estatuas materiales por ser infinito, rindiéndole culto reverente en el templo interior del alma."
        ),
        PersonajeLiterario(
            nombre = "Huayna Cápac",
            rol = "Último gran emperador del Tahuantinsuyo unificado",
            descripcion = "Soberano que llevó al imperio a su apogeo territorial. En su agonía comete el grave error dinástico de dividir el reino entre su hijo legítimo Huáscar (el Cuzco) y su hijo bastardo predilecto Atahualpa (Quito), profetizando el cercano advenimiento de una gente extraña de ultramar que destruiría la dinastía solar."
        ),
        PersonajeLiterario(
            nombre = "Atahualpa y Huáscar",
            rol = "Hermanos rivales y protagonistas de la guerra civil fratricida",
            descripcion = "Huáscar encarna la legitimidad dinástica cuzqueña; Atahualpa, apoyado por los experimentados generales quiteños Quisquis y Chalcuchímac, desata una feroz ofensiva militar, apresa a su hermano y perpetra un genocidio sistemático contra la nobleza imperial del Cuzco. Atahualpa es finalmente emboscado en Cajamarca y ejecutado al garrote vil por Pizarro."
        ),
        PersonajeLiterario(
            nombre = "Francisco Pizarro y Diego de Almagro",
            rol = "Capitanes socios de la conquista y antagonistas de las guerras civiles",
            descripcion = "Líderes de la hueste española que capturan el Tahuantinsuyo. Su codicia desata una cruenta guerra fratricida entre castellanos por la posesión del Cuzco: Pizarro vence en las Salinas y decapita a Almagro el Viejo; años después, los partidarios de Almagro el Mozo asaltan el palacio de Lima y degüellan a Francisco Pizarro en un charco de sangre."
        ),
        PersonajeLiterario(
            nombre = "Francisco de Carvajal ('El Demonio de los Andes')",
            rol = "Maestro de campo de la rebelión encomendera de Gonzalo Pizarro",
            descripcion = "Militar octogenario de asombrosa resistencia física, cinismo despiadado y genio bélico invicto. Siembra el terror en los Andes ahorcando sin juicio a los realistas leales al rey mientras improvisa coplas satíricas. Es derrotado en Jaquijahuana por Pedro de la Gasca y descuartizado por caballos en la horca."
        ),
        PersonajeLiterario(
            nombre = "Túpac Amaru I",
            rol = "Último inca de Vilcabamba y mártir de la soberanía andina",
            descripcion = "Joven soberano legítimo capturado en la selva por orden del virrey Francisco de Toledo. Conducido al cadalso en la plaza mayor del Cuzco en 1572, logra calmar el clamor atronador de trescientos mil súbditos alzando majestuosamente su mano antes de ser decapitado, clausurando la estirpe imperial."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Primera Parte: La Barbarie Preincaica y la Vara de Oro en Huanacaure",
            detalle = "Garcilaso retrata la edad salvaje previa a los incas: hombres viviendo en cavernas sin vestimenta, practicando la antropofagia y adorando sapos y riscos. El Padre Sol compadecido envía a sus hijos Manco Cápac y Mama Ocllo desde la isla del Titicaca con una barra de oro de media vara, instruyéndolos a caminar hacia el norte. Al llegar al cerro Huanacaure, en el valle del Cuzco, la barra se hunde en la tierra de un solo golpe. Los fundadores dividen la labor civilizadora: Manco Cápac instruye a los varones en la agricultura y el orden civil (Hanan Cuzco), y Mama Ocllo a las mujeres en el tejido y la economía doméstica (Hurin Cuzco)."
        ),
        EscenaTrama(
            titulo = "Primera Parte: La Teología de Pachacámac, Leyes Morales y la Utopía Agraria",
            detalle = "El cronista desmonta las falsedades sobre la supuesta idolatría incaica: revela que los sabios amautas adoraban interiormente al Dios supremo inmaterial Pachacámac, sin ídolos ni figuras por considerarlo inabarcable. Expone el código moral supremo (Ama sua, Ama llulla, Ama quella) y el orden agrario distributivo donde la tierra se repartía equitativamente: tierras del Sol, de viudas y huérfanos, tierras del pueblo (asignando un topo por varón y medio por mujer) y tierras del Inca con tambos de reserva para tiempos de calamidad, haciendo del imperio una utopía sin mendicidad."
        ),
        EscenaTrama(
            titulo = "Primera Parte: La Ruptura Dinástica y la Sangrienta Guerra Fratricida",
            detalle = "Huayna Cápac quiebra la armonía del imperio al dividir sus dominios entre Huáscar (Cuzco) y Atahualpa (Quito), evocando profecías sobre la llegada de extranjeros barbudos que destruirían el reino. Atahualpa se subleva con sus tropas veteranas, derrota a las huestes cuzqueñas en Cotabambas y somete a Huáscar a prisión. Desata un genocidio dinástico mandando degollar a toda la parentela imperial cuzqueña para afianzar su poder usurpado, debilitando al país justo antes del arribo de los navíos españoles."
        ),
        EscenaTrama(
            titulo = "Segunda Parte: La Tragedia de Cajamarca, el Requerimiento y el Garrote Vil",
            detalle = "Pizarro y sus tropas emboscan a Atahualpa en la plaza de Cajamarca. El dominico Vicente de Valverde pronuncia el Requerimiento, pero el tosco intérprete Felipillo de Poechos distorsiona grotescamente el mensaje teológico. Al no poder abrir los broches del breviario, Atahualpa lo arroja al suelo; los españoles rompen fuego con artillería y caballería provocando una matanza pavorosa. Pizarro apresa al inca, quien ofrece el cuarto de rescate colmado de oro y plata. Pese a pagar el tesoro, Atahualpa es juzgado falsamente y condenado al garrote vil tras recibir el bautismo con el nombre de Juan."
        ),
        EscenaTrama(
            titulo = "Segunda Parte: La Guerra Civil de los Conquistadores y el Martirio de Túpac Amaru I",
            detalle = "La ambición desata la discordia armada entre los conquistadores: Francisco Pizarro y Diego de Almagro combaten por el Cuzco hasta la decapitación de Almagro en las Salinas y el asesinato a estocadas de Pizarro en Lima. Estalla la insurrección de los encomenderos contra las Leyes Nuevas liderada por Gonzalo Pizarro y el cruel Francisco de Carvajal, sofocada por Pedro de la Gasca en Jaquijahuana. La crónica culmina en 1572 con la ejecución pública de Túpac Amaru I en la plaza del Cuzco por orden del virrey Toledo: ante el llanto estruendoso de 300.000 vasallos, el inca alza la mano imponiendo un silencio sepulcral antes de caer decapitado por el alfanje."
        )
    ),
    temaPrincipal = "La reivindicación histórica, moral y cultural de la civilización incaica como una utopía humanista providencial que preparó la llegada del cristianismo; la fundamentación neoplatónica del mestizaje armónico como esencia de la peruanidad y la tragedia del colapso andino ante la violencia de la conquista.",
    simbolosClave = listOf(
        "La vara de oro en Huanacaure: Símbolo del mandato solar, el arraigo de la civilización y el pacto de fertilidad entre el cielo y la tierra que funda el Cuzco sagrado.",
        "El Dios invisible Pachacámac: Metáfora de la suprema elevación metafísica y monoteísta incaica, venerado en el alma sin estatuas materiales por ser infinito.",
        "La triada moral (Ama sua, Ama llulla, Ama quella): Código supremo de justicia, veracidad y laboriosidad que sostuvo una sociedad sin vagancia ni miseria.",
        "El reparto agrario tripartito: Símbolo de la solidaridad económica comunitaria y la providencia estatal a través de los topos y tambos de reserva.",
        "Los quipus: Cuerdas de nudos que encarnan la memoria mnemotécnica, contable y científica indígena frente a la acusación colonial de analfabetismo.",
        "La fortaleza de Sacsayhuamán: Emblema de la arquitectura ciclópea andina erigida con piedras colosales que asombran a la mirada renacentista europea.",
        "El breviario arrojado y el indio Felipillo: Símbolo del abismo hermenéutico y la catástrofe comunicativa y lingüística en el choque violento de Cajamarca.",
        "El cadalso de Túpac Amaru I y el gesto de su mano: La serenidad majestuosa del último rey solar frente a la barbarie colonial del virrey Toledo, sellando el duelo eterno del pueblo andino."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuáles son los títulos oficiales y los lugares y fechas de publicación de las dos partes de la obra?",
            respuesta = "La Primera Parte se titula 'Comentarios Reales de los Incas' y fue publicada en Lisboa (Portugal) en 1609; la Segunda Parte se tituló póstumamente 'Historia General del Perú' y fue publicada en Córdoba (España) en 1617. Ambas fueron escritas por el Inca Garcilaso de la Vega."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuál era el propósito sagrado de la vara de oro entregada por el Sol a Manco Cápac y Mama Ocllo?",
            respuesta = "La vara de oro no era para buscar tesoros ni cavar minas; servía para señalar el sitio exacto ordenado por el Sol para fundar la capital del imperio y asiento de la civilización: aquel lugar donde la barreta se hundiera de un solo golpe en la tierra por sí misma, lo cual ocurrió milagrosamente en el cerro Huanacaure, en el valle del Cuzco."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo refuta Garcilaso la acusación española de que los incas eran idólatras bárbaros y politeístas ciegos?",
            respuesta = "Demuestra que la religión incaica constituía una teología racional que adoraba al Sol visible, pero reservaba la devoción interior suprema al Dios supremo e inmaterial Pachacámac ('el que da alma al universo'), al cual jamás representaron en estatuas materiales por ser invisible e infinito, operando como una preparación providencial (preparatio evangelica) para la fe cristiana."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué motivo y en qué año fueron prohibidos y quemados los 'Comentarios Reales' por la corona española?",
            respuesta = "Fueron prohibidos mediante Real Cédula secreta en 1782 por el rey Carlos III (¡NO por la Inquisición por herejía!), como medida represiva de seguridad estatal tras la gran rebelión de Túpac Amaru II (1780-1781), al considerarse que la obra avivaba el orgullo patriótico, la memoria gloriosa del Incanato y los anhelos autonomistas indígenas."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién fue el padre biológico del Inca Garcilaso de la Vega y cuál fue la fuente de su formación filosófica?",
            respuesta = "Su padre fue el capitán conquistador español Sebastián Garcilaso de la Vega y Vargas (¡NO el poeta toledano Garcilaso de la Vega!). Su formación filosófica humanista se consolidó con su traducción en 1590 de los 'Diálogos de amor' de León Hebreo, cuya doctrina de armonización de contrarios fundamentó su orgullo mestizo."
        )
    )
)
