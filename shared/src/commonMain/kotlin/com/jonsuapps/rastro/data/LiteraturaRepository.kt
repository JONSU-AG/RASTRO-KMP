package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

object LiteraturaRepository {

    val obrasUNSA: List<ObraLiteraria> get() = obras

    val obras = listOf(
        ObraLiteraria(
            id = "los-rios-profundos",
            titulo = "Los ríos profundos",
            autor = "José María Arguedas",
            anio = "1958",
            pais = "Perú",
            genero = "Narrativo",
            especie = "Novela",
            corriente = "Neoindigenismo",
            temaPrincipal = "El desarraigo cultural, el conflicto de identidad y la conexión mística del mundo andino frente a la violencia social.",
            colorHex = "#047857",
            categoria = "Literatura Peruana",
            sinopsis = "Ernesto, un adolescente educado íntimamente en comunidades quechuas, viaja con su padre Gabriel por diversos valles hasta Abancay, donde es internado en un colegio religioso. Experimenta la marginación y la violencia mientras encuentra en el zumbayllu y en los ríos una vía de comunión y purificación cósmica.",
            contextoHistorico = "Publicada en 1958, supera el indigenismo folclórico tradicional mostrando la cosmovisión animista y el conflicto ético de los Andes en modernización.",
            analisisTrama = listOf(
                EscenaTrama("Viaje al Cusco y los muros vivos", "Gabriel y Ernesto buscan a El Viejo en el Cusco. Ernesto siente que los muros incas tienen vida propia y dialogan con los ríos."),
                EscenaTrama("El internado de Abancay", "Ernesto queda como interno en el colegio del Padre Linares, espacio hostil con peleas entre alumnos de diferentes procedencias."),
                EscenaTrama("El zumbayllu mágico", "Ántero introduce el zumbayllu (trompo), cuyo canto cristalino pacifica temporalmente el patio y reconecta a Ernesto con la naturaleza."),
                EscenaTrama("La rebelión de las chicheras", "Doña Felipa lidera a las chicheras en el reparto de la sal acaparada por los hacendados. El ejército sofoca la protesta con violencia."),
                EscenaTrama("La peste de tifus y el Pachachaca", "Estalla una peste de tifus. Ernesto huye hacia las alturas y en el río Pachachaca siente que las aguas purificarán la enfermedad y el mal.")
            ),
            personajes = listOf(
                PersonajeLiterario("Ernesto", "Protagonista y narrador", "Muchacho mestizo sensible, criado entre indios, puente entre dos universos culturales."),
                PersonajeLiterario("Gabriel", "Padre de Ernesto", "Abogado itinerante y errabundo."),
                PersonajeLiterario("El Viejo", "Tío de Ernesto", "Terrateniente avaro y déspota que desprecia a los indios."),
                PersonajeLiterario("Doña Felipa", "Líder de las chicheras", "Mujer valerosa que encabeza la protesta por la sal."),
                PersonajeLiterario("Ántero", "Compañero de internado", "Muchacho entusiasta que crea el zumbayllu.")
            ),
            simbolosClave = listOf("Zumbayllu (comunión y canto sagrado)", "Ríos profundos (fuerza cósmica purificadora)", "Muros incas (resistencia milenaria)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿Qué simboliza el zumbayllu para Ernesto?", "Representa la armonía, la comunicación mágica con el mundo quechua y la reconciliación comunitaria frente a la violencia."),
                PreguntaClaveObra("¿Por qué se rebelan las chicheras encabezadas por doña Felipa?", "Porque los hacendados habían acaparado la sal para el ganado dejando sin sustento básico al pueblo."),
                PreguntaClaveObra("¿Cuál es el significado del río Pachachaca al final de la obra?", "Es la corriente purificadora sagrada que lavará la epidemia de tifus y la inmundicia de la opresión colonial.")
            )
        ),
        ObraLiteraria(
            id = "la-ciudad-y-los-perros",
            titulo = "La ciudad y los perros",
            autor = "Mario Vargas Llosa",
            anio = "1963",
            pais = "Perú",
            genero = "Narrativo",
            especie = "Novela",
            corriente = "Boom Latinoamericano",
            temaPrincipal = "El autoritarismo institucional, la imposición violenta de la masculinidad y la hipocresía social limeña.",
            colorHex = "#B91C1C",
            categoria = "Literatura Peruana",
            sinopsis = "En el Colegio Militar Leoncio Prado de Lima, cadetes adolescentes de diversas clases sociales son sometidos a un régimen de disciplina castrense y brutalidad informal bajo el código de 'El Círculo'. El robo de un examen desencadena una espiral de delación, el asesinato de El Esclavo y el encubrimiento de los mandos militares.",
            contextoHistorico = "Premio Biblioteca Breve 1962, inauguró el Boom latinoamericano con innovaciones técnicas como monólogos interiores, saltos temporales y multiplicidad de perspectivas.",
            analisisTrama = listOf(
                EscenaTrama("El Círculo y el robo del examen", "Cava, un cadete serrano, roba las preguntas del examen de química instigado por el Jaguar."),
                EscenaTrama("La delación y el castigo", "Tras ser castigada toda la sección, El Esclavo delata a Cava para poder salir a ver a su enamorada Teresa."),
                EscenaTrama("La maniobra en el descampado y la muerte", "Durante unas maniobras de tiro, El Esclavo recibe un balazo en la cabeza que todos atribuyen a un tiro casual."),
                EscenaTrama("La acusación del Poeta y el pacto de silencio", "Alberto (El Poeta) acusa al Jaguar de venganza ante el teniente Gamboa, pero los altos mandos callan todo para cuidar el honor de la institución.")
            ),
            personajes = listOf(
                PersonajeLiterario("El Jaguar", "Líder implacable", "Muchacho de barrio duro que funda El Círculo imponiendo la ley del más fuerte."),
                PersonajeLiterario("Alberto Fernández 'El Poeta'", "Observador de clase media", "Escribe novelitas eróticas para sus compañeros; delata al Jaguar pero cede a las presiones."),
                PersonajeLiterario("Ricardo Arana 'El Esclavo'", "Víctima indefensa", "Cadete tímido y sometido que muere trágicamente."),
                PersonajeLiterario("El Serrano Cava", "Miembro de El Círculo", "Cadete provinciano expulsado tras el robo del examen."),
                PersonajeLiterario("Teniente Gamboa", "Oficial estricto y honesto", "El único militar con sentido de justicia, desterrado a la selva por su rectitud.")
            ),
            simbolosClave = listOf("El perro (sometimiento y novatada)", "El uniforme (máscara de honor e hipocresía)", "La pistola (violencia estructural)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿Quién es El Esclavo y por qué delata a Cava?", "Es Ricardo Arana; lo delata desesperado por el encierro para poder salir a ver a Teresa."),
                PreguntaClaveObra("¿Por qué las autoridades militares archivan la investigación de Gamboa?", "Para evitar el escándalo público y preservar intacta la imagen corporativa del colegio."),
                PreguntaClaveObra("¿Qué técnica narrativa destaca en la novela?", "El uso de múltiples puntos de vista, saltos temporales (flashback) y el monólogo interior.")
            )
        ),
        ObraLiteraria(
            id = "el-mundo-es-ancho-y-ajeno",
            titulo = "El mundo es ancho y ajeno",
            autor = "Ciro Alegría",
            anio = "1941",
            pais = "Perú",
            genero = "Narrativo",
            especie = "Novela",
            corriente = "Indigenismo",
            temaPrincipal = "La lucha por la tierra y la resistencia de la comunidad campesina indígena frente al despojo latifundista y la corrupción judicial.",
            colorHex = "#92400E",
            categoria = "Literatura Peruana",
            sinopsis = "La pacífica y próspera comunidad andina de Rumi, guiada por la sabiduría del alcalde Rosendo Maqui, es despojada de sus tierras por el ambicioso hacendado Álvaro Amenábar con la complicidad de jueces sobornados. Tras la muerte de Maqui y el destierro comunal a las punas de Yanañahui, Benito Castro regresa liderando la resistencia armada.",
            contextoHistorico = "Ganadora del concurso continental de la editorial Farrar & Rinehart en 1941, es la cumbre de la novela indigenista peruana clásica.",
            analisisTrama = listOf(
                EscenaTrama("La vida comunitaria en Rumi", "Rosendo Maqui lidera una sociedad basada en el trabajo solidario y el respeto a la tierra."),
                EscenaTrama("El juicio corrupto de linderos", "Álvaro Amenábar entabla una demanda falsa contra Rumi asistido por testigos sobornados como el Mágico Vilca."),
                EscenaTrama("El destierro a Yanañahui", "La comunidad pierde sus tierras y se refugia en las frías punas de Yanañahui. Rosendo Maqui es encarcelado y golpeado hasta morir."),
                EscenaTrama("El regreso de Benito Castro y la batalla final", "Benito Castro, hijo adoptivo de Maqui que conoció el mundo exterior, regresa y organiza la defensa armada con fusiles frente a la guardia civil.")
            ),
            personajes = listOf(
                PersonajeLiterario("Rosendo Maqui", "Viejo alcalde comunal", "Símbolo de sabiduría ancestral, pacífico y profundamente apegado a la Madre Tierra."),
                PersonajeLiterario("Álvaro Amenábar", "Hacendado de Umay", "Latifundista codicioso que busca mano de obra esclava para sus minas despojando a los indios."),
                PersonajeLiterario("Benito Castro", "Líder rebelde moderno", "Joven comunero letrado que comprende que la ley de los opresores solo se enfrenta con la unión y las armas.")
            ),
            simbolosClave = listOf("Rumi (la comunidad idílica)", "La tierra comunal (madre y sustento)", "El látigo y el juez (alianza del poder)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿Cuál es el valor fundamental que defiende la comunidad de Rumi?", "La propiedad comunitaria de la tierra y la ayuda mutua (el ayni y la minka)."),
                PreguntaClaveObra("¿Cómo muere Rosendo Maqui?", "Muere en prisión producto de las golpizas de los carceleros tras intentar defender a los suyos."),
                PreguntaClaveObra("¿Cuál es la lección de Benito Castro al volver a la comunidad?", "Que el indio debe alfabetizarse y defenderse, porque el mundo de los poderosos es ancho pero ajeno.")
            )
        ),
        ObraLiteraria(
            id = "ollantay",
            titulo = "Ollantay",
            autor = "Anónimo (Atribuido a Antonio Valdés)",
            anio = "Siglo XVIII (Origen incaico oral)",
            pais = "Perú",
            genero = "Dramático",
            especie = "Drama",
            corriente = "Teatro Quechua Colonial",
            temaPrincipal = "El amor que desafía las barreras de casta social, el honor militar y la transición del absolutismo a la magnanimidad imperial.",
            colorHex = "#D97706",
            categoria = "Literatura Peruana",
            sinopsis = "El general Ollantay, héroe de origen plebeyo (Antisuyo), pide la mano de Cusi Coyllur, hija del Inca Pachacútec. Rechazado por su linaje inferior, Ollantay se rebela y funda su bastión en Ollantaytambo. Años después, tras la muerte de Pachacútec, el nuevo inca Túpac Yupanqui perdona a los rebeldes y une a la familia.",
            contextoHistorico = "Manuscrito conservado por el cura Antonio Valdés en Sicuani hacia 1770, combina la estructura del teatro del Siglo de Oro español con la poesía y métrica quechua.",
            analisisTrama = listOf(
                EscenaTrama("La petición de mano ante Pachacútec", "Ollantay confiesa su amor por la princesa Cusi Coyllur. Pachacútec se enfurece por la diferencia de rango social y lo expulsa."),
                EscenaTrama("El encierro de Cusi Coyllur", "La princesa es encarcelada en el Acllahuasi, donde nace en secreto su hija Ima Súmac."),
                EscenaTrama("La rebelión en el Antisuyo", "Ollantay se fortifica en Ollantaytambo y resiste por diez años el asedio de las tropas cusqueñas."),
                EscenaTrama("La estratagema de Rumiñahui y el perdón real", "Rumiñahui finge haber sido castigado por el Inca para ganarse la confianza de Ollantay y capturarlo por traición en una noche de fiesta. Túpac Yupanqui decide ejercer la clemencia y perdona la vida a Ollantay, liberando a Cusi Coyllur.")
            ),
            personajes = listOf(
                PersonajeLiterario("Ollantay", "General del Antisuyo", "Guerrero valiente de origen noble plebeyo que desafía la ley imperial por amor."),
                PersonajeLiterario("Cusi Coyllur", "Estrella alegre", "Hija amada de Pachacútec, madre de Ima Súmac, sufre prisión en la oscuridad."),
                PersonajeLiterario("Pachacútec", "Inca reformador", "Soberano autoritario e inflexible que hace cumplir las leyes estamentales."),
                PersonajeLiterario("Túpac Yupanqui", "Hijo y sucesor", "Gobernante magnánimo que antepone la reconciliación y el perdón al castigo."),
                PersonajeLiterario("Piqui Chaqui", "Gracioso / Bufón", "Criado de Ollantay que aporta los momentos cómicos y reflexivos del drama."),
                PersonajeLiterario("Rumiñahui", "General de Pachacútec", "Estratega astuto ('Ojo de Piedra') que vence mediante el engaño.")
            ),
            simbolosClave = listOf("Ollantaytambo (bastión de dignidad)", "Acllahuasi (cárcel del amor secreto)", "Clemencia imperial (cohesión del Tahuantinsuyo)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿Por qué Pachacútec prohíbe el matrimonio entre Ollantay y Cusi Coyllur?", "Porque Ollantay no pertenecía a la realeza de sangre solar (sangre real), sino a la nobleza de privilegio."),
                PreguntaClaveObra("¿Quién es Piqui Chaqui y qué papel desempeña?", "Es el siervo cómico ('Pie ligero') que cumple la función típica del gracioso en el teatro clásico."),
                PreguntaClaveObra("¿Cómo logra Rumiñahui capturar a Ollantay?", "Se autoflagela para engañar a Ollantay fingiendo que el Inca lo maltrató, y en la noche de Inti Raymi abre las puertas al ejército.")
            )
        ),
        ObraLiteraria(
            id = "crimen-y-castigo",
            titulo = "Crimen y castigo",
            autor = "Fiódor Dostoyevski",
            anio = "1866",
            pais = "Rusia",
            genero = "Narrativo",
            especie = "Novela",
            corriente = "Realismo Psicológico",
            temaPrincipal = "El conflicto moral, la justificación intelectual del crimen (teoría del hombre extraordinario) y la redención por el sufrimiento y la fe.",
            colorHex = "#4338CA",
            categoria = "Literatura Universal",
            sinopsis = "Rodión Raskólnikov, un brillante pero empobrecido estudiante en San Petersburgo, concibe la teoría de que los hombres superiores tienen el derecho ético de transgredir las leyes comunes. Asesina a hachazos a la usurera Aliona Ivanovna y a su hermana Lizaveta. Acosado por la fiebre y la culpa, halla redención gracias a Sonia Marmeládova.",
            contextoHistorico = "Obra cumbre de la narrativa rusa del siglo XIX, explora el abismo psicológico humano y el nihilismo antes de la revolución.",
            analisisTrama = listOf(
                EscenaTrama("La gestación del plan y el asesinato", "Raskólnikov maquina el asesinato de la vieja usurera para probar su valía como ser extraordinario. Asesina también a Lizaveta que entra de improvisto."),
                EscenaTrama("El duelo intelectual con Porfiri Petrovich", "El juez de instrucción Porfiri juega psicológicamente con las contradicciones de Rodión hasta acorralarlo."),
                EscenaTrama("El encuentro con Sonia", "Sonia, joven prostituida para salvar de hambre a su familia, le lee el pasaje de la resurrección de Lázaro y lo exhorta a confesar."),
                EscenaTrama("La confesión y Siberia", "Rodión se arrodilla en la plaza pública, confiesa su crimen ante la policía y es desterrado a trabajos forzados en Siberia con Sonia a su lado.")
            ),
            personajes = listOf(
                PersonajeLiterario("Rodión Raskólnikov", "Protagonista", "Exestudiante atormentado por su orgullo intelectual y su teoría napoleónica."),
                PersonajeLiterario("Sonia Marmeládova", "Faro moral y espiritual", "Joven compasiva que encarna el sacrificio puro y la redención cristiana."),
                PersonajeLiterario("Porfiri Petrovich", "Juez de instrucción", "Psicólogo brillante que descubre la verdad sin pruebas materiales directas."),
                PersonajeLiterario("Aliona Ivanovna", "Vieja usurera", "Símbolo del parásito social que explota a los miserables.")
            ),
            simbolosClave = listOf("El hacha (el corte violento de la moral)", "La resurrección de Lázaro (el renacimiento espiritual)", "San Petersburgo (espacio claustrofóbico y febril)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿En qué consiste la teoría de los hombres ordinarios y extraordinarios de Raskólnikov?", "Sostiene que los extraordinarios (como Napoleón) pueden violar la ley moral en pos del beneficio futuro de la humanidad."),
                PreguntaClaveObra("¿Quién convence a Raskólnikov de entregarse a las autoridades?", "Sonia Marmeládova, pidiéndole que bese la tierra que manchó y confiese su culpa."),
                PreguntaClaveObra("¿Cuál es el castigo real para Rodión?", "No es la condena penal en Siberia, sino la tortura psicológica interior y el aislamiento humano que sufre tras el asesinato.")
            )
        ),
        ObraLiteraria(
            id = "la-metamorfosis",
            titulo = "La metamorfosis",
            autor = "Franz Kafka",
            anio = "1915",
            pais = "República Checa (Imperio Austrohúngaro)",
            genero = "Narrativo",
            especie = "Novela corta",
            corriente = "Vanguardismo (Expresionismo / Existencialismo)",
            temaPrincipal = "La deshumanización del individuo en el sistema laboral capitalista, la alienación existencial y la fragilidad del afecto familiar.",
            colorHex = "#475569",
            categoria = "Literatura Universal",
            sinopsis = "Gregorio Samsa, un viajante de comercio que sostiene económicamente a sus padres y a su hermana Grete, despierta una mañana convertido en un monstruoso insecto. Incapaz de trabajar, su familia pasa de la alarma inicial a la repugnancia y al abandono total, hasta que su muerte solitaria es recibida con alivio.",
            contextoHistorico = "Escrita antes de la Primera Guerra Mundial, condensa la soledad del hombre moderno frente a la burocracia, la culpa y la pérdida de identidad.",
            analisisTrama = listOf(
                EscenaTrama("La transformación inesperada", "Gregorio amanece transformado en un insecto y su mayor preocupación inmediata es perder el tren para ir al trabajo."),
                EscenaTrama("La reacción de la familia y el jefe", "El apoderado de la empresa huye despavorido; su padre lo hace retroceder a bastonazos hacia su cuarto."),
                EscenaTrama("La manzana incrustada", "El padre le arroja manzanas, una de las cuales se le pudre en la espalda causándole una herida infectada."),
                EscenaTrama("El violín de Grete y el final", "Atraído por la música del violín de su hermana, sale al salón y es repudiado definitivamente. Muere deshidratado al amanecer.")
            ),
            personajes = listOf(
                PersonajeLiterario("Gregorio Samsa", "Protagonista", "Empleado abnegado reducido a desecho inútil al perder su capacidad productiva."),
                PersonajeLiterario("Grete Samsa", "Hermana menor", "Al inicio lo cuida tocando el violín, pero termina sentenciando que deben deshacerse de él."),
                PersonajeLiterario("El señor Samsa", "Padre severo", "Figura autoritaria que veja y agrede a Gregorio con violencia.")
            ),
            simbolosClave = listOf("El insecto (la pérdida de condición humana)", "La manzana podrida (la agresión y el desamor paterno)", "El violín (el último lazo con la belleza humana)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿Qué simboliza la metamorfosis de Gregorio Samsa?", "Simboliza la alienación del trabajador moderno que solo es valorado por su utilidad económica para el núcleo familiar."),
                PreguntaClaveObra("¿Qué objeto le causa la herida que terminará matando a Gregorio?", "Una manzana arrojada por su propio padre que queda incrustada en su caparazón y se infecta."),
                PreguntaClaveObra("¿Cómo reacciona la familia tras la muerte de Gregorio?", "Sienten un inmenso alivio, dan un paseo en tranvía y planean casar a su hija Grete.")
            )
        ),
        ObraLiteraria(
            id = "edipo-rey",
            titulo = "Edipo rey",
            autor = "Sófocles",
            anio = "429 a.C.",
            pais = "Grecia Clásica",
            genero = "Dramático",
            especie = "Tragedia",
            corriente = "Clasicismo Griego",
            temaPrincipal = "El destino inexorable (ananké), la ceguera interior del hombre ante la verdad y la fragilidad del poder frente a la justicia divina.",
            colorHex = "#7C3AED",
            categoria = "Literatura Universal",
            sinopsis = "Edipo, rey de Tebas y salvador de la ciudad tras resolver el enigma de la Esfinge, jura descubrir al asesino del rey Layo para detener la peste. A través de la investigación implacable y los testimonios de Tiresias y el mensajero de Corinto, descubre con horror que él mismo mató a su padre y se casó con su propia madre Yocasta.",
            contextoHistorico = "Considerada por Aristóteles en su Poética como la tragedia perfecta por la pureza de su anagnórisis (reconocimiento) y catarsis.",
            analisisTrama = listOf(
                EscenaTrama("La peste de Tebas y el oráculo", "El oráculo de Delfos ordena desterrar al asesino de Layo para que cese la mortífera peste en Tebas."),
                EscenaTrama("El choque con Tiresias", "El adivino ciego Tiresias acusa a Edipo de ser el causante de la impureza, pero el rey cree que es un complot de Creonte."),
                EscenaTrama("Las revelaciones de Yocasta y el mensajero", "Yocasta intenta calmar a Edipo contándole que Layo murió en una encrucijada de tres caminos, provocando el primer estremecimiento en el rey."),
                EscenaTrama("La verdad consumada y la catarsis", "El pastor confiesa la entrega del infante con los pies atados. Yocasta se ahorca y Edipo se arranca los ojos con los broches de su vestido antes de partir al autoexilio.")
            ),
            personajes = listOf(
                PersonajeLiterario("Edipo", "Rey de Tebas", "Monarca noble e implacable buscador de la verdad que labra su propia condena."),
                PersonajeLiterario("Yocasta", "Reina y madre/esposa", "Intenta negar el poder de las profecías hasta que comprende la verdad y se suicida."),
                PersonajeLiterario("Tiresias", "Adivino ciego", "Ciego físicamente pero dotado de visión espiritual y verdad profética."),
                PersonajeLiterario("Creonte", "Hermano de Yocasta", "Hombre prudente que asume la regencia tras la caída de Edipo.")
            ),
            simbolosClave = listOf("La ceguera y la visión (quien tiene ojos no ve y quien es ciego ve la verdad)", "La encrucijada de tres caminos (la encrucijada del destino)", "Los broches dorados (el castigo autoinfligido)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿Qué enigma resolvió Edipo para convertirse en rey de Tebas?", "El enigma de la Esfinge: qué ser camina a cuatro patas en la mañana, a dos al mediodía y a tres al atardecer (el hombre)."),
                PreguntaClaveObra("¿Por qué se saca los ojos Edipo al descubrir la verdad?", "Porque no soporta mirar a sus padres en el Hades ni a sus hijos nacidos del incesto."),
                PreguntaClaveObra("¿Cuál es la función del coro en la tragedia griega?", "Representa la voz de la polis, aconseja a los protagonistas y orienta la reflexión moral de la catarsis.")
            )
        ),
        ObraLiteraria(
            id = "comentarios-reales",
            titulo = "Comentarios Reales de los Incas",
            autor = "Inca Garcilaso de la Vega",
            anio = "1609 (Primera parte, Lisboa)",
            pais = "Perú / España",
            genero = "Narrativo / Ensayístico",
            especie = "Crónica histórica",
            corriente = "Renacimiento / Humanismo Colonial",
            temaPrincipal = "La reivindicación de la civilización incaica, el mestizaje biológico y cultural, y la reconciliación de dos mundos bajo una providencia humanista.",
            colorHex = "#059669",
            categoria = "Literatura Peruana",
            sinopsis = "Garcilaso, hijo del capitán español Sebastián Garcilaso de la Vega y de la palla inca Chimpu Ocllo, escribe para enmendar y comentar los relatos de los historiadores hispanos, destacando el orden político, la religión casi monoteísta (Pachacámac) y el desarrollo moral del Imperio de los Incas como preparación para el cristianismo.",
            contextoHistorico = "Primera gran obra de un mestizo americano reconocida en Europa, escrita con una prosa neoplatónica renacentista de altísima elegancia.",
            analisisTrama = listOf(
                EscenaTrama("El origen mítico y los primeros reyes", "Manco Cápac y Mama Ocllo salen del lago Titicaca con la barreta de oro enviada por el Sol para fundar el Cusco y civilizar a los pueblos salvajes."),
                EscenaTrama("Organización social y leyes del Tahuantinsuyo", "Detalla la redistribución comunitaria de la tierra (topos), la ausencia de mendigos y las festividades del Inti Raymi."),
                EscenaTrama("La lengua quechua y la cosmovisión", "Corrige errores de traducción de cronistas españoles y explica la noción de Pachacámac como Dios hacedor del universo.")
            ),
            personajes = listOf(
                PersonajeLiterario("Inca Garcilaso", "Autor y narrador", "Primer mestizo espiritual de América, cronista de nobleza doble (inca y española)."),
                PersonajeLiterario("Chimpu Ocllo", "Madre", "Princesa incaica de cuya voz y parientes Garcilaso aprendió la tradición oral del Tahuantinsuyo.")
            ),
            simbolosClave = listOf("La barreta de oro (la civilización fundacional)", "El Cusco (ombligo del mundo andino)", "La doble corona (el puente entre dos culturas)"),
            preguntasClave = listOf(
                PreguntaClaveObra("¿Por qué tituló su obra 'Comentarios Reales'?", "Porque se consideraba el heredero legítimo ('real') con autoridad de sangre para corregir a los cronistas españoles."),
                PreguntaClaveObra("¿Qué visión tiene Garcilaso de la religión incaica?", "Sostiene que los incas ya adoraban a un Dios invisible supremo (Pachacámac) preparando el terreno para el cristianismo."),
                PreguntaClaveObra("¿Qué diferencia hay entre la primera y la segunda parte de la obra?", "La primera parte (1609) trata sobre los incas; la segunda parte (Historia General del Perú, 1617) trata sobre la conquista y las guerras civiles entre españoles.")
            )
        )
    )

    fun getById(id: String): ObraLiteraria? {
        return obras.firstOrNull { it.id == id }
    }

    fun getByCategoria(cat: String): List<ObraLiteraria> {
        if (cat.isBlank() || cat.equals("Todas", ignoreCase = true)) return obras
        return obras.filter { it.categoria.equals(cat, ignoreCase = true) }
    }
}
