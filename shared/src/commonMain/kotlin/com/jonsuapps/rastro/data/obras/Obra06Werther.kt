package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

/**
 * OBRA 06: Las cuitas del joven Werther (Johann Wolfgang von Goethe)
 * Fuente oficial: CONTENIDO_PEDAGOGICO/06_COMUNICACION/LITERATURA/OBRAS/OBRA_06_Werther_Goethe.md
 * Integración modular para RASTRO KMP - Biblioteca -> Obras
 */
val Obra06Werther = ObraLiteraria(
    id = "werther",
    titulo = "Las cuitas del joven Werther",
    autor = "Johann Wolfgang von Goethe",    anio = "Siglo XVIII (1774)",
    pais = "Alemania",
    colorHex = "#991B1B",
    corriente = "Prerromanticismo alemán / Sturm und Drang ('Tormenta e Ímpetu')",
    genero = "Narrativo",
    especie = "Novela epistolar psicológica",
    categoria = "Literatura Universal",    sinopsis = """
        En mayo de 1771, el joven dibujante y letrado Werther se traslada al idílico pueblo campestre de Wahlheim para atender asuntos de la herencia materna y buscar sosiego interior. En comunión extática con la naturaleza virgen, dibuja bajo dos frondosos tilos, juega con los niños humildes y lee la serena épica de Homero. Invitado a un baile campestre en una finca comarcal, acude a recoger a su acompañante: Charlotte (Lotte), hija del respetable juez viudo de la factoría forestal. Al llegar, Werther queda fulminado de amor al contemplarla vestida de blanco con lazos rosa, repartiendo con ternura maternal rebanadas de pan negro a sus ocho hermanitos. Pese a que le advierten que la joven está formalmente comprometida con Albert, un funcionario ausente por negocios, ambos descubren en el baile una electiva comunión de almas al contemplar una tormenta estival y pronunciar a una voz el nombre del poeta sagrado: '¡Klopstock!'.
        
        Durante semanas, Werther vive una embriaguez sentimental continua visitando a Lotte a diario, escuchándola tocar el piano y compartiendo juegos familiares. No obstante, el retorno de Albert fractura su dicha. Albert es un hombre ordenado, metódico y bondadoso que trata cordialmente a Werther, lo que agrava la tortura del joven al no poder aborrecer a su rival. Tras un acalorado debate donde Albert juzga el suicidio como una cobardía semejante al delito y Werther lo defiende como el colapso invencible de un espíritu asfixiado por el dolor moral, la situación se vuelve intolerable. En su cumpleaños, Lotte le obsequia un lazo rosa idéntico al de su primer encuentro. Ahogado por los celos y aconsejado por su íntimo amigo Wilhelm, Werther parte al amanecer sin despedirse para asumir un puesto burocrático en la corte de un embajador.
        
        La estancia diplomática resulta un calvario de mezquindad y formalismo. Su único aliento es la noble amistad del Conde C..., pero en una tertulia en su palacio los aristócratas locales murmuran indignados al ver a un burgués plebeyo en su círculo. El conde, forzado por el código clasista, le pide amablemente que se retire para eludir el escándalo; humillado públicamente y viendo celebrada su afrenta por los cortesanos, Werther dimite con indignación. Tras visitar nostálgico su aldea natal, se entera de que Lotte y Albert han contraído matrimonio en secreto. Arrastrado por una atracción fatal, retorna a Wahlheim en el otoño de 1772.
        
        En esta segunda etapa, la psique de Werther zozobra en el sombrío 'Weltschmerz' (dolor del mundo). La naturaleza ya no es la madre nutricia, sino un monstruo caníbal que devora y mastica ciegamente a sus criaturas; los venerados tilos de la aldea son talados; y sus lecturas abandonan la luz de Homero para sumergirse en los páramos gélidos y lamentos fúnebres de Ossian. Werther intercede en vano por un criado que asesinó por celos a su rival campesino, concluyendo que nadie tiene salvación. Ante los rumores de la comarca, Albert exige a Lotte distanciar a Werther, y ella le prohíbe visitarla hasta la víspera de Navidad.
        
        Desoyendo el veto, Werther acude a la casa el 21 de diciembre aprovechando la ausencia de Albert. Lotte le pide que lea sus traducciones de Ossian; el patetismo de los versos fúnebres conmueve a ambos hasta las lágrimas, y Werther, en un delirio pasional incontrolable, la estrecha y cubre sus labios con besos ardientes. Desgarrada entre el amor y la virtud conyugal, Lotte se encierra bajo llave advirtiéndole que no volverá a verlo jamás. Werther regresa a su cuarto convencido de que uno de los tres debe perecer para que reine la paz. Tras ordenar sus finanzas y despedirse en cartas a Wilhelm y Lotte, envía a su criado a pedir prestadas las pistolas de Albert con el pretexto de un viaje. Lotte, temblando con funesto presentimiento pero obligada por su esposo, descuelga las armas y las limpia antes de entregarlas. Werther besa las pistolas con fervor sabiendo que sus manos las tocaron, y a medianoche se dispara un tiro en la sien sobre la ceja derecha. Agoniza convulsivamente durante doce horas con el drama 'Emilia Galotti' de Lessing abierto sobre la mesa, falleciendo al mediodía del 23 de diciembre. A las once de la noche, su féretro es conducido por peones al pie de los tilos sin cortejo religioso ni presencia de sacerdotes, al negar la Iglesia sepultura cristiana a los suicidas.
    """.trimIndent(),
    contextoHistorico = """
        • Movimiento y génesis: Publicada en 1774 (revisada en 1787), es la obra cumbre del 'Sturm und Drang' ('Tormenta e Ímpetu'), movimiento prerromántico alemán liderado por el joven Goethe que exaltó el culto al genio individual, las pasiones viscerales, el panteísmo y la rebelión juvenil contra el frío racionalismo ilustrado y las convenciones morales burguesas.
        • Base autobiográfica real: Goethe plasmó su amor apasionado y no correspondido por Charlotte Buff ('Lotte') en Wetzlar (1772), prometida de su amigo Johann Christian Kestner (Albert), fundiéndolo con el suicidio de su colega diplomático Karl Wilhelm Jerusalem, quien se descerrajó un tiro por amor usando las pistolas prestadas de Kestner.
        • Impacto sociocultural: Desató la 'Fiebre de Werther' (Werther-Fieber), con jóvenes emulando su indumentaria (frac azul y chaleco amarillo), y el célebre 'Efecto Werther' (primera oleada documentada de suicidios por contagio literario en Europa, que causó su prohibición en Leipzig y Copenhague).
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Werther",
            rol = "Protagonista / Joven artista e intelectual romántico",
            descripcion = "Joven burgués hipersensible, impulsivo y melancólico. Cree en el amor absoluto como vivencia ontológica irreductible. Incapaz de someter su pasión a las convenciones sociales ni de tolerar la rigidez estamental, sufre el colapso existencial del 'Weltschmerz' y elige el suicidio como acto de libertad suprema."
        ),
        PersonajeLiterario(
            nombre = "Charlotte (Lotte)",
            rol = "Amada inalcanzable / Doncella virtuosa",
            descripcion = "Hija mayor del juez de Wahlheim. Cuida abnegadamente a sus ocho hermanos tras la muerte de su madre. Aunque unida a Albert por deber y gratitud burguesa, experimenta una honda afinidad espiritual con la sensibilidad poética de Werther, cediendo a un beso apasionado antes de su trágico final."
        ),
        PersonajeLiterario(
            nombre = "Albert",
            rol = "Prometido y esposo de Lotte / Antagonista ético",
            descripcion = "Hombre de unos treinta años, ordenado, puntual, honesto y pragmático. Encarna el ideal ilustrado de la razón y la sensatez burguesa. Aunque acoge a Werther con aprecio, condena el suicidio como una debilidad cobarde y termina celoso ante el asedio sentimental del joven hacia su esposa."
        ),
        PersonajeLiterario(
            nombre = "Wilhelm",
            rol = "Mejor amigo de Werther / Destinatario de las cartas",
            descripcion = "Confidente silencioso a quien Werther envía la inmensa mayoría de sus cartas. Representa la voz de la prudencia, el sentido común y el afecto fraternal desde la distancia."
        ),
        PersonajeLiterario(
            nombre = "El Mozo de Labranza",
            rol = "Campesino enamorado / Espejo instintivo de Werther",
            descripcion = "Joven rústico despedido por amar apasionadamente a su patrona viuda, que luego asesina a puñaladas a su rival de amores. Werther defiende desesperadamente su pasión ante la justicia, viéndose reflejado en su locura criminal."
        ),
        PersonajeLiterario(
            nombre = "El Juez S...",
            rol = "Padre de Lotte / Funcionario forestal",
            descripcion = "Hombre viudo, afable y respetable que abre las puertas de su hogar campestre a Werther con calidez paternal."
        ),
        PersonajeLiterario(
            nombre = "El Conde C...",
            rol = "Noble culto y protector de Werther en la corte",
            descripcion = "Aristócrata de espíritu elevado que admira el talento de Werther, pero que se ve obligado por la presión clasista de la nobleza a pedirle que abandone su salón durante una tertulia social."
        ),
        PersonajeLiterario(
            nombre = "El Embajador",
            rol = "Jefe diplomático de Werther",
            descripcion = "Burócrata pedante, rígido y formalista que exaspera a Werther corrigiendo obsesivamente la redacción de sus despachos oficiales, precipitando su renuncia."
        ),
        PersonajeLiterario(
            nombre = "El Editor al Lector",
            rol = "Voz narrativa testimonial",
            descripcion = "Narrador omnisciente y forense que asume la crónica tras la última carta rota de Werther, reconstruyendo mediante cartas, pesquisas policiales y testimonios su agonía y sepelio."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Libro I: El retiro a Wahlheim y la comunión panteísta",
            detalle = "En mayo de 1771, Werther escribe a Wilhelm extasiado por la belleza primaveral de Wahlheim. Se deleita dibujando bajo los tilos, conversando con los aldeanos humildes y leyendo a Homero con el alma libre de ataduras mundanas."
        ),
        EscenaTrama(
            titulo = "Libro I: El baile campestre, el encuentro con Lotte y '¡Klopstock!'",
            detalle = "El 16 de junio, Werther acude a la casa forestal y ve a Lotte vestida de blanco repartiendo pan a sus ocho hermanos menores. Queda prendado al instante. Durante una tormenta que interrumpe el baile, ambos contemplan la lluvia y pronuncian al unísono el nombre del poeta Klopstock, sellando la comunión de sus almas."
        ),
        EscenaTrama(
            titulo = "Libro I: El retorno de Albert y el debate dialéctico del suicidio",
            detalle = "Albert regresa y entabla una cordial relación con Werther. El 12 de agosto, tras pedir unas pistolas descargadas y apoyárselas en la frente, Albert lo reprende severamente: tilda el suicidio de flaqueza cobarde y delictiva. Werther lo refuta considerándolo una enfermedad moral letal. Asfixiado por la rivalidad, Werther parte en septiembre a la corte sin despedirse de viva voz."
        ),
        EscenaTrama(
            titulo = "Libro II: El martirio burocrático y la humillación estamental",
            detalle = "Entre octubre de 1771 y marzo de 1772, Werther sirve como secretario diplomático. Aunque el noble Conde C... lo acoge con deferencia, la alta aristocracia exige expulsar al burgués plebeyo de su tertulia nocturna. Humillado y comidilla de la urbe, renuncia con rabia. Al saber que Lotte y Albert se han casado, regresa a Wahlheim."
        ),
        EscenaTrama(
            titulo = "Libro II: El quiebre psicológico: De Homero a Ossian",
            detalle = "En el otoño de 1772, la naturaleza se trueca en monstruo devorador; los tilos son talados y Werther sustituye a Homero por los cantos elegíacos de Ossian. Un mozo campesino comete un crimen por celos; Werther lo defiende en vano. Albert exige a Lotte poner frenos al asedio de Werther, y ella le prohíbe visitarla hasta Nochebuena."
        ),
        EscenaTrama(
            titulo = "Libro II: La última lectura de Ossian y el beso prohibido",
            detalle = "El 21 de diciembre, Werther acude a la casa aprovechando la ausencia de Albert. Lee entre sollozos los lamentos fúnebres de Ossian; el patetismo desborda el pudor y se besan apasionadamente. Horrorizada por su pecado conyugal, Lotte se encierra bajo llave gritando que no volverá a verlo jamás."
        ),
        EscenaTrama(
            titulo = "Desenlace: El préstamo de las pistolas, el tiro a medianoche y el sepelio",
            detalle = "Werther envía a su criado a pedir las pistolas a Albert fingiendo un viaje. Lotte, obligada por Albert, las limpia y entrega temblando de presentimientos. Werther las besa con éxtasis. A medianoche se dispara en la frente. Agoniza doce horas con 'Emilia Galotti' de Lessing en la mesa y muere al mediodía del 23 de diciembre. A las once de la noche, peones sepultan su cuerpo al pie de los tilos, sin sacerdote ni honras cristianas."
        )
    ),
    temaPrincipal = "La pasión amorosa absoluta e irrealizable frente al choque insalvable de las convenciones sociales, morales y burguesas, y el suicidio como afirmación desesperada de la libertad individual.",
    simbolosClave = listOf(
        "De Homero a Ossian: Tránsito espiritual del héroe romántico desde la armonía solar, vital y serena del clasicismo hacia la bruma otoñal, los páramos fúnebres y el abismo sepulcral de la muerte.",
        "El frac azul y chaleco amarillo de terciopelo: Vestimenta fetiche que lucía cuando bailó y conoció a Lotte; conservarla y ser enterrado con ella simboliza la fidelidad eterna e inquebrantable a ese instante de éxtasis.",
        "El lazo rosa de Lotte: Símbolo del candor y pureza del primer encuentro en la factoría; obsequiado en su cumpleaños, lo acompaña en el bolsillo hasta la tumba.",
        "La metamorfosis de la naturaleza: Espejo anímico (Landschaft der Seele); en primavera es madre nutricia fecunda, pero en invierno se desfigura en un 'monstruo que traga eternamente y mastica eternamente'.",
        "Las pistolas de Albert limpiadas por Lotte: El instrumento de muerte mediado involuntariamente por las manos puras de la amada; para Werther, recibir las armas de Lotte equivale a su bendición mística para el sacrificio.",
        "El drama 'Emilia Galotti' de Lessing abierto en la mesa: Tragedia de la Ilustración alemana donde la virtud prefiere la muerte a la corrupción mundana, prefigurando la inmolación de Werther."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A quién van dirigidas casi en su totalidad las cartas que componen la novela 'Werther'?",
            respuesta = "A su íntimo amigo Wilhelm, quien actúa como confidente y oyente silencioso desde la distancia. A Charlotte (Lotte) únicamente le escribe la desgarradora carta testamentaria que deja sobre el escritorio antes de pegarse un tiro."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué simboliza el cambio de lecturas de cabecera de Werther, de Homero a Ossian?",
            respuesta = "El colapso interior y la degradación psicológica de su visión del mundo: Homero encarna la plenitud, la salud, la luz del clasicismo y la paz primaveral de Wahlheim; Ossian encarna la desesperanza, las nieblas nórdicas, las tumbas de guerreros caídos y la pulsión irremediable hacia la muerte."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué consiste la discrepancia fundamental entre Werther y Albert sobre el suicidio?",
            respuesta = "Albert, representante del orden racional y la moral burguesa, considera el suicidio un acto vergonzoso de cobardía, insensatez y debilidad de carácter. Werther lo defiende argumentando que el dolor moral tiene límites de resistencia semejantes a una enfermedad incurable del cuerpo: el alma sobrepasada por el sufrimiento colapsa inevitablemente."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo consigue Werther las armas con las que se quita la vida?",
            respuesta = "Las pide prestadas a su rival Albert mediante una nota entregada por su criado, pretextando un viaje por las montañas. Albert ordena a Lotte entregarlas, y es ella misma quien, temblando con un presentimiento funesto, descuelga las pistolas y les limpia el polvo antes de entregarlas al sirviente."
        ),
        PreguntaClaveObra(
            pregunta = "¡Trampa de Examen!: ¿Muere Werther en el acto tras el disparo de medianoche y recibe sepultura eclesiástica?",
            respuesta = "¡Falso en ambos aspectos! Werther sobrevive al balazo en la frente en una dolorosa y sangrienta agonía de doce horas, falleciendo recién al mediodía del día siguiente (23 de diciembre). Además, la Iglesia le negó el entierro en suelo sagrado y la bendición de un sacerdote por considerarlo un suicida réprobo."
        )
    )
)
