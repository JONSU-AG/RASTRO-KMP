package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra24ElCaballeroCarmelo = ObraLiteraria(
    id = "el-caballero-carmelo",
    titulo = "El caballero Carmelo",
    autor = "Abraham Valdelomar",    anio = "Siglo XX (1913 / 1918)",
    pais = "Perú",
    corriente = "Posmodernismo Peruano / Movimiento Colónida (1916)",
    genero = "Narrativo",
    especie = "Cuento criollo / Relato lírico-intimista",
    categoria = "Literatura Peruana",    colorHex = "#B45309",
    sinopsis = """
        El caballero Carmelo es la obra cumbre de la narrativa provinciana e intimista del Perú, escrita por Abraham Valdelomar ('El Conde de Lemos'). Publicado inicialmente en 1913 tras ganar el concurso literario de La Nación y recogido en libro en 1918, el relato recrea con sublime prosa lírica y ternura hogareña la infancia del autor en la caleta marina de San Andrés de los Pescadores, cerca de Pisco:

        I. El Retorno de Roberto y la Llegada del Héroe: Una mañana luminosa, la casa solariega despierta alborozada ante el regreso de Roberto, el primogénito ausente durante años. El joven descarga sus alforjas repartiendo regalos: pañuelos para la madre, una pipa para el padre, juguetes y dulces para los pequeños Jesús, Anfiloquio y Abraham. De un cesto saca con devoción un regalo especial para el padre: un gallo de combate joven y soberbio que es bautizado como 'El Caballero Carmelo'.

        II. La Paz Hogareña y la Vejez del Paladín: Durante tres años el Carmelo reina pacíficamente en el corral bajo la higuera frondosa. Valdelomar lo retrata con adjetivos de la caballería medieval: esbelto, magro, musculoso y austero, de ojos de oro y cresta encarnada, con porte de hidalgo incapaz de bajezas. El animal se convierte en un miembro amado de la familia y en un venerable veterano mimado por los niños.

        III. La Apuesta del 28 de Julio: Una tarde, el padre anuncia con rostro grave que ha aceptado un desafío formal para el 28 de julio (Fiestas Patrias) en el circo de San Andrés. El viejo y cansado Carmelo deberá batirse a muerte contra 'El Ajiseco', el gallo más joven, pesado y sanguinario del valle. Pese a las lágrimas de la madre y los niños, la palabra de honor del padre está empeñada y la riña resulta ineludible.

        IV. El Combate Épico en San Andrés: En medio de la algarabía patriótica del pueblo, los rivales saltan al ruedo armados con afiladas navajas en los espolones. Las apuestas favorecen al Ajiseco diez a uno. El gallo joven embiste con furia destrozando las plumas del Carmelo y asestándole una grave herida en el pecho que tiñe la arena de sangre. El público da por muerto al veterano y el Ajiseco canta victoria prematura. En ese instante supremo, recordando su estirpe hidalga, el Carmelo se alza como un espectro de acero, vuela por los aires en una postrera estocada y clava su navaja en los ojos y el cuello del rival. El Ajiseco rueda inerte; el Carmelo vence heroicamente, pero cae destrozado de fatiga y heridas mortales.

        V. La Agonía y el Tránsito del Héroe: El Carmelo es llevado en triunfo doloroso a casa. Durante dos días la madre le cura las heridas y los niños le dan masitas de harina remojadas en vino. Al atardecer del segundo día, el gallo se levanta tambaleante, bate sus alas débiles, emite un último y quejumbroso canto mirando la luz del sol que se apaga en el mar de San Andrés, y expira a los pies de sus amos, dejando una huella de dulce melancolía imborrable.

        El universo criollo de Valdelomar se complementa con dos relatos célebres:
        - El vuelo de los cóndores: En el Circo Fiel de Pisco, el niño Abraham queda fascinado por Miss Orquídea, frágil trapecista que sufre una caída fatal al ser forzada por el cruel domador a repetir un salto mortal sin red, despidiéndose días después desde un barco.
        - Los ojos de Judas: La culpa y el terror de Abraham en el muelle de Pisco la noche de la quema de Judas, cuando las llamas revelan en las olas el cadáver ahogado de la misteriosa mujer de blanco a quien el niño había delatado ingenuamente.
    """.trimIndent(),
    contextoHistorico = """
        Publicado en 1913 en Lima y consolidado en 1918, 'El caballero Carmelo' inauguró el Posmodernismo en el Perú, movimiento que actuó como puente renovador entre el decadentismo modernista y la irrupción de las vanguardias de los años veinte.

        El Movimiento y la Revista Colónida (1916):
        Abraham Valdelomar fundó en 1916 la revista 'Colónida', liderando una insurrección estética contra el elitismo aristocrático, conservador y castizo de la oligarquía cultural limeña (simbolizada por José de la Riva-Agüero). El grupo Colónida (integrado por Federico More, Alberto Hidalgo y el joven César Vallejo) reivindicó la sensibilidad provinciana, la sencillez del pueblo marinero, la emoción hogareña y la dignidad de lo cotidiano.

        La Dualidad del 'Conde de Lemos':
        Valdelomar encarnó una fascinante paradoja estética: en las calles de Lima y en las tertulias del Palais Concert se mostraba como un extravagante dandi de chaleco de seda y monóculo; sin embargo, en su intimidad creadora dio a luz una literatura de extrema pureza, empapada de ternura filial, espiritualidad franciscana y nostalgia por la aldea costera de Pisco.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Caballero Carmelo",
            rol = "Protagonista absoluto, gallo paladín y emblema del honor caballeresco",
            descripcion = "Gallo anciano de porte aristocrático, cresta de corona real y plumaje de arco iris. Encarna la lealtad, la nobleza y la hidalguía andante: salta al ruedo por el honor de su dueño y vence al temible Ajiseco en un agónico esfuerzo supremo que le cuesta la vida."
        ),
        PersonajeLiterario(
            nombre = "El Ajiseco",
            rol = "Antagonista gallístico; fuerza física bruta, agresividad y soberbia",
            descripcion = "Gallo joven, pesado, fiero y sanguinario del valle de Pisco. Arremete con violencia desmedida y canta victoria antes de tiempo, siendo fulminado por la estocada final del Carmelo."
        ),
        PersonajeLiterario(
            nombre = "Abraham (El Narrador Niño)",
            rol = "Testigo lírico, voz autobiográfica y memoria nostálgica",
            descripcion = "El autor evocando su niñez provinciana en San Andrés. Observa con inocencia, ternura y piedad franciscana la vida cotidiana, amando al gallo como a un héroe y hermano de infancia."
        ),
        PersonajeLiterario(
            nombre = "Roberto",
            rol = "Hermano mayor ausente que inaugura la fiesta familiar",
            descripcion = "Llega desde lejanas tierras con alforjas repletas de obsequios para todos los suyos, trayendo en un cesto al Carmelo como regalo principal para su padre."
        ),
        PersonajeLiterario(
            nombre = "El Padre de Familia",
            rol = "Patriarca austero, silencioso y apasionado por la gallística",
            descripcion = "Hombre de palabra inflexible que acepta el desafío del 28 de julio por pundonor criollo, sufriendo amargamente al ver morir a su noble animal vencedor."
        ),
        PersonajeLiterario(
            nombre = "La Madre",
            rol = "Matriarca protectora, eje de abnegación y piedad hogareña",
            descripcion = "Mujer hacendosa y tierna que ruega por la paz del corral, prepara los alimentos y cuida al Carmelo agonizante con vendas de hierbas y lágrimas."
        ),
        PersonajeLiterario(
            nombre = "Miss Orquídea",
            rol = "Protagonista infantil de 'El vuelo de los cóndores'",
            descripcion = "Niña trapecista rubia del Circo Fiel forzada a volar sin red de protección; cae al vacío quedando lisiada y deja en Abraham una huella imborrable de piedad y amor platónico."
        ),
        PersonajeLiterario(
            nombre = "El gallo Pelado",
            rol = "Personaje secundario y contrapunto cómico del corral",
            descripcion = "Gallo joven, calvo y travieso que anima la vida doméstica del patio solariego frente a la serenidad aristocrática del Carmelo."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Retorno de Roberto y la Entrada Triunfal del Carmelo",
            detalle = "El hogar de San Andrés despierta alborozado con la llegada de Roberto, el hermano mayor que vuelve tras largo tiempo cargado de regalos para sus padres y hermanos. De un cesto especial saca un fino gallo de pelea que el padre examina con orgullo de perito y que los niños bautizan con devoción como El Caballero Carmelo."
        ),
        EscenaTrama(
            titulo = "La Apacible Vejez del Paladín bajo la Higuera",
            detalle = "Pasan tres años de dicha y armonía campesina. El Carmelo, ya entrado en años, pasea como un aristócrata del corral, incapaz de bajezas, conviviendo con el chivo y el gallo Pelado. Es mimado por Abraham y sus hermanos, que lo alimentan con granos de maíz selecto y admiran su porte de hidalgo medieval."
        ),
        EscenaTrama(
            titulo = "El Fatídico Desafío del 28 de Julio",
            detalle = "El padre regresa a casa anunciando que ha pactado una pelea formal para las Fiestas Patrias del 28 de julio en el circo de gallos de San Andrés: el Carmelo deberá enfrentarse a muerte contra El Ajiseco, el gallo más temido del valle. La madre y los niños lloran desconsolados, pero el honor empeñado del patriarca no admite marcha atrás."
        ),
        EscenaTrama(
            titulo = "El Combate a Muerte y la Estocada de la Victoria",
            detalle = "En el coliseo atestado de pescadores y hacendados, el Carmelo y el Ajiseco se baten a navajazos limpios. El Ajiseco arremete con brutalidad juvenil y hiere de gravedad en el pecho al Carmelo, haciéndolo sangrar. El público grita su derrota; el Ajiseco canta victoria. En un destello épico de honor, el Carmelo se alza majestuoso, vuela por el aire y asesta una estocada letal al cuello de su rival, que cae muerto en la arena."
        ),
        EscenaTrama(
            titulo = "La Agonía de Dos Días y el Último Canto en el Ocaso",
            detalle = "El Carmelo vuelve a casa agonizante. La familia lo cuida con devoción dos días con frazadas y maíz en vino. Al atardecer del segundo día, el paladín se pone en pie con temblores, bate débilmente las alas, lanza un último canto mirando al sol que se hunde en el mar de San Andrés y cae muerto a los pies de los niños, dejando un luto eterno en el hogar."
        )
    ),
    temaPrincipal = "La sublimación del honor, la dignidad y el deber heroico de un noble gallo frente a la decrepitud física y la muerte en el ruedo; la celebración lírica y nostálgica del hogar provinciano andino-costeño, la piedad familiar y la inocencia de la niñez.",
    simbolosClave = listOf(
        "El plumaje de arco iris y la cresta encarnada del Carmelo: Símbolos de la hidalguía, la aristocracia moral y la nobleza del paladín medieval trasladado al corral costeño.",
        "La higuera frondosa del patio solariego: Eje de la paz, la sombra protectora y la memoria de la infancia campesina feliz.",
        "La navaja en el espolón: Emblema de la fatalidad trágica de la riña de gallos donde se empeña el honor y la sangre.",
        "El 28 de julio: Fecha patria que enmarca el sacrificio épico del héroe en medio de la algarabía popular.",
        "El último canto mirando al mar en el ocaso: Metáfora de la despedida cósmica de la vida y el tránsito del héroe sin tumba ni corona a la eternidad del recuerdo.",
        "El trapecio sin red de Miss Orquídea: Símbolo de la fragilidad infantil expuesta a la crueldad y al morbo de los adultos en 'El vuelo de los cóndores'.",
        "El muñeco en llamas y los ojos de Judas: Símbolo de la culpa, la delación involuntaria y la tragedia mortal en el muelle de Pisco."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué movimiento literario perteneció Abraham Valdelomar y qué trascendencia tuvo 'Colónida'?",
            respuesta = "Perteneció al Posmodernismo Peruano (transición entre el modernismo y la vanguardia). En 1916 fundó la revista y Movimiento 'Colónida', que encabezó una rebelión estética contra el academicismo oligárquico limeño, abriendo paso a la voz de las provincias, la ternura hogareña y figuras como César Vallejo."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué fecha y lugar se libró el combate decisivo entre el Carmelo y el Ajiseco?",
            respuesta = "El combate se realizó el 28 de julio (día de las Fiestas Patrias de la Independencia del Perú), en la aldea marítima de San Andrés de los Pescadores, contigua al puerto de Pisco."
        ),
        PreguntaClaveObra(
            pregunta = "¿Murió el Caballero Carmelo en el ruedo de arena durante el combate?",
            respuesta = "No. El Carmelo venció al Ajiseco con una estocada mortal agónica; fue recogido desfallecido por su dueño y llevado a casa, donde agonizó durante dos días bajo los cuidados devotos de la familia, muriendo pacíficamente tras emitir su último canto frente al mar al atardecer."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién trajo al Carmelo a la casa de Pisco y qué motivo propició su llegada?",
            respuesta = "Fue traído por Roberto, el hermano mayor de la familia, quien regresaba a la casona tras largos años de ausencia en tierras lejanas, trayendo al gallo como regalo especial para su padre."
        ),
        PreguntaClaveObra(
            pregunta = "¿Con qué tipo de personaje histórico o literario es equiparado el Carmelo en el relato?",
            respuesta = "Es caracterizado poéticamente con los atributos de un caballero andante medieval y un hidalgo español ('magro, musculoso y austero', 'aristócrata del corral, incapaz de bajezas'), dotado de honor, dignidad y serenidad frente al peligro y la muerte."
        )
    )
)
