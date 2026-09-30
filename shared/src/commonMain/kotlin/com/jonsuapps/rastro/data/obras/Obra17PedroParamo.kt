package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra17PedroParamo = ObraLiteraria(
    id = "pedro-paramo",
    titulo = "Pedro Páramo",
    autor = "Juan Rulfo",    anio = "Siglo XX (1955)",
    pais = "México",
    colorHex = "#7C2D12",
    corriente = "Realismo mágico / Narrativa mexicana contemporánea / Antesala del Boom",
    genero = "Narrativo",
    especie = "Novela breve polifónica, fragmentaria y poética",
    categoria = "Literatura Hispanoamericana",    sinopsis = """
        Publicada en México en marzo de 1955 por el Fondo de Cultura Económica, 'Pedro Páramo' de Juan Rulfo es una de las obras cumbre de la literatura universal del siglo XX y la pieza fundacional del Realismo Mágico hispanoamericano. A través de una magistral estructura fragmentaria compuesta por 70 secuencias no lineales, la novela dinamita las fronteras entre el tiempo cronológico y la eternidad, y entre la vida y la muerte.

        La trama entrelaza dos planos fundamentales: el presente fantasmal de Juan Preciado, quien desciende al abrasador valle de Comala para cumplir la promesa hecha a su madre moribunda (Dolores Preciado) de cobrarle el abandono a su padre, el cacique Pedro Páramo. Al internarse en el poblado, guiado por el arriero sordo Abundio Martínez y hospedado por doña Eduviges Dyada, Juan descubre con pavor que todos los habitantes con quienes dialoga son ánimas en pena; acosado por los susurros de los difuntos, muere asfixiado de terror en medio de la plaza mayor y despierta sepultado en una fosa común junto a la mendiga Dorotea la Cuarraca, desde donde continúa escuchando las voces que brotan de la tierra.

        Bajo tierra se reconstruye el segundo plano: la ascensión y ruina del cacique Pedro Páramo, 'un rencor vivo' que se apoderó a sangre y fuego de la hacienda La Media Luna y de las tierras de Comala, despojando a campesinos, comprando jueces, engendrando hijos bastardos impunes y sobornando con costales de oro tanto a la Iglesia cómplice del padre Rentería como a las tropas de la Revolución Mexicana. No obstante, el déspota alberga una devoción lírica inquebrantable por Susana San Juan, su amor puro de infancia; pero al recuperarla, Susana habita en la demencia erótica de su difunto esposo Florencio. Tras la muerte de Susana y el ultraje de ver que el pueblo celebra con música y ferias en vez de guardar luto, Pedro Páramo jura la venganza suprema: 'Me cruzaré de brazos y Comala se morirá de hambre', condenando al valle a la extinción. Finalmente, el propio Abundio Martínez, enloquecido por la muerte de su mujer y el alcohol, acude a pedir limosna y apuñala mortalmente al anciano cacique, quien se desploma desmoronándose como si fuera un montón de piedras.
    """.trimIndent(),
    contextoHistorico = """
        Nacido en Sayula y criado en San Gabriel (Jalisco), Juan Rulfo creció en una tierra sacudida por la violencia del bandidaje agrario y el fanatismo de la Guerra Cristera (1926-1929), perdiendo a su padre y abuelo asesinados en disputas de tierras antes de ser internado en un orfanato.

        'Pedro Páramo' surge de esa experiencia de duelo telúrico y orfandad histórica:
        1. Desmitificación de la Revolución Mexicana: Rulfo rechaza la épica triunfalista oficial. En la novela, la Revolución no redime al campesino: es cooptada por caciques pragmáticos como Pedro Páramo, que financian con oro a los jefes rebeldes para convertirlos en sus sicarios privados.
        2. La cosmovisión mexicana de la muerte: Enraizada en el sincretismo entre el catolicismo colonial y los mitos prehispánicos (Día de Muertos), la muerte en Comala no es un término, sino un estado de permanencia dolorosa. Las ánimas purgan sus culpas terrenales flotando en los muros porque el sacerdote corrupto les negó la absolución.
        3. Innovación formal: Ruptura del tiempo newtoniano mediante saltos temporales, polifonía coral (heteroglosia) y una prosa poética concisa, elíptica y despojada de adornos retóricos superfluos.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Juan Preciado",
            rol = "Hijo legítimo de Pedro Páramo y narrador del descenso a Comala",
            descripcion = "Arquetipo de Telémaco en busca del padre ausente. Emprende el viaje a Comala para cobrar la herencia y el honor prometidos a su madre. Es una conciencia receptiva y vulnerable que dialoga con los muertos sin advertirlo, hasta que muere asfixiado por el pavor a los murmullos en la plaza mayor, compartiendo tumba con Dorotea."
        ),
        PersonajeLiterario(
            nombre = "Pedro Páramo",
            rol = "Cacique absoluto de La Media Luna y señor feudal de Comala",
            descripcion = "Definido como 'un rencor vivo'. Patriarca despiadado que despoja tierras, asesina rivales y engendra decenas de hijos ilegítimos. Paradójicamente, vive obsesionado por el amor infantil puro e inalcanzable de Susana San Juan; al morir esta y sentirse burlado por las fiestas del pueblo, se cruza de brazos y condena a muerte por inanición a Comala, muriendo apuñalado por su hijo bastardo Abundio."
        ),
        PersonajeLiterario(
            nombre = "Susana San Juan",
            rol = "El amor obsesivo e inalcanzable del cacique",
            descripcion = "Único ser humano amado con verdad por Pedro Páramo. Traumatizada desde niña cuando su padre la descolgó a una tumba a buscar oro entre osamentas, enloquece tras el asesinato de su primer esposo Florencio. Encerrada en La Media Luna, habita en un delirio místico-erótico que la hace inaccesible al poder del cacique, rechazando la extremaunción antes de morir."
        ),
        PersonajeLiterario(
            nombre = "El Padre Rentería",
            rol = "Párroco católico de Comala y símbolo de la simonía eclesiástica",
            descripcion = "Sacerdote desgarrado por la culpa moral. Otorga el perdón divino a los ricos que pagan limosnas de oro y niega la salvación a los desposeídos y a los suicidas. Aunque odia a Miguel Páramo por matar a su hermano y violar a su sobrina, bendice su cadáver a cambio de monedas. Termina colgando la sotana para sumarse como guerrillero armado a la Guerra Cristera."
        ),
        PersonajeLiterario(
            nombre = "Miguel Páramo",
            rol = "El único hijo bastardo reconocido por el cacique",
            descripcion = "Joven disoluto, violento y sádico que comete crímenes y abusos amparado por el terror del apellido paterno. Muere al romperse el cuello cuando su caballo 'Colorado' intenta saltar una cerca de piedras a galope en la bruma; su espectro visita a Eduviges antes de advertir que ha muerto."
        ),
        PersonajeLiterario(
            nombre = "Abundio Martínez",
            rol = "Arriero sordo, hijo bastardo no reconocido y parricida",
            descripcion = "Guía a Juan Preciado al valle al inicio de la novela; enloquecido por la muerte de su esposa Celerina y la falta de dinero para el ataúd, se embriaga de alcohol y acude a La Media Luna a pedir ayuda, asestándole las puñaladas mortales a Pedro Páramo durante un confuso forcejeo."
        ),
        PersonajeLiterario(
            nombre = "Dorotea la Cuarraca",
            rol = "Mendiga de Comala y compañera de fosa de Juan Preciado",
            descripcion = "Antigua alcahueta del cacique que cargaba un bulto de harapos bajo el rebozo creyendo que era su hijo recién nacido. Sepultada en la misma fosa común que Juan Preciado, dialoga con él bajo tierra explicándole la naturaleza espectral de las voces y murmullos que pueblan el suelo."
        ),
        PersonajeLiterario(
            nombre = "Dolores Preciado (Dóloritas)",
            rol = "Madre de Juan Preciado y esposa despojada del cacique",
            descripcion = "Heredera ingenua que se casa con Pedro Páramo para condonar deudas; tras ser despojada de sus tierras y repudiada, muere en el destierro inculcando en su hijo la memoria nostálgica de una Comala fértil y el deber de venganza."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Fase 1: El Descenso de Juan Preciado al Inframundo de Comala y la Noche de los Murmullos",
            detalle = """
                Juan Preciado baja por la cuesta de Vilmayo hacia Comala en pleno calor canicular de agosto para cumplir la promesa hecha a su madre moribunda Dolores de cobrarle el abandono a su padre, Pedro Páramo. En el camino se encuentra con el arriero sordo Abundio Martínez, quien le advierte que el pueblo está sobre las brasas de la tierra, en la mera boca del infierno, y califica al cacique como 'un rencor vivo', confesando ser también su hijo.

                Al arribar al pueblo desierto y derruido, Abundio lo conduce a la casa de doña Eduviges Dyada. Eduviges lo recibe asegurando que su madre Dolores le anunció esa misma mañana la visita de su hijo, pese a llevar meses difunta. Eduviges le relata las bodas falsas de sus padres y la muerte del jinete espectral Miguel Páramo a lomos de su caballo Colorado. Cuando Juan menciona a Abundio, Eduviges le revela con frialdad que el arriero murió hace tiempo y que debió ser su ánima vagabunda.

                Poco después, Eduviges se desvanece y comparece la vieja criada Damiana Cisneros, quien le confiesa que Eduviges se ahorcó en esa misma casa años atrás. En medio de la noche espectral, Juan escucha en la habitación contigua los lamentos y gritos de asfixia de Toribio Aldrete siendo colgado de una viga por los esbirros de Pedro Páramo.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Fase 2: El Despertar Bajo la Tierra y el Diálogo Fúnebre con Dorotea",
            detalle = """
                Aterrado por el eco sonoro de la muerte, Juan Preciado huye por las calles desiertas y se guarece en la choza ruinosa de Donis y su hermana, dos ancianos que cohabitan en pecado incestuoso creyendo que el cuerpo se les derrite en lodo podrido ante la mirada condenatoria de las ánimas sin absolución.

                Buscando escapar hacia Sayula, Juan sale a la plaza mayor en el amanecer. El aire se espesa; una masa invisible de murmullos, suspiros y voces rotas de muertos se mete por sus oídos y le oprime la garganta. Sin poder respirar, Juan Preciado muere de puro pánico y asfixia en el suelo de la plaza.

                El relato da un giro radical: Juan Preciado despierta en la oscuridad sepulcral bajo la tierra. A su lado yace sepultada en la misma fosa común la mendiga Dorotea la Cuarraca, quien cargaba un feto imaginario de harapos. Juan le explica que no murió de hambre sino del espanto a los murmullos. Ambos muertos inician un diálogo eterno bajo la tierra, sirviendo de puente para escuchar y desentrañar las conversaciones y culpas de todos los difuntos que purgan en Comala.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Fase 3: El Mito Caciquil de La Media Luna, el Despojo Territorial y Miguel Páramo",
            detalle = """
                A través de las voces subterráneas, la narración reconstruye el pasado de Comala. Se evoca la infancia solitaria de Pedro Páramo, huérfano de don Lucas Páramo tras ser este asesinado en una fiesta, y su devoción eterna por Susana San Juan con quien volaba cometas en las lomas verdes.

                Al heredar La Media Luna en bancarrota, Pedro urde su ascenso calculador: envía a su mayordomo Fulgor Sedano a pedir la mano de Dolores Preciado; al casarse con ella borra las deudas de su familia, se adueña de sus tierras y la confina al destierro. Luego altera violentamente los linderos, asesina a Toribio Aldrete en una habitación cerrada y soborna a las autoridades.

                Cría en su hacienda a su único hijo bastardo reconocido, Miguel Páramo, muchacho desalmado que siembra el pánico con violaciones y muertes hasta romperse el cuello al saltar una barda de piedras con su caballo. El padre Rentería, corroído por el remordimiento moral, bendice el cadáver del asesino tras recibir un puñado de monedas de oro de Pedro Páramo. Poco después estalla la Revolución de 1910; Pedro Páramo soborna con cien mil pesos y trescientos hombres armados a los rebeldes comandados por el Tilcuate, utilizándolos para liquidar a sus propios enemigos y preservar su latifundio.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Fase 4: El Delirio Erótico de Susana San Juan y la Venganza del Hambre",
            detalle = """
                Treinta años después, el anciano Bartolomé San Juan regresa con su hija Susana arruinado de las minas. Pedro Páramo manda asesinar secretamente a Bartolomé para instalar a Susana en La Media Luna. Sin embargo, el cacique descubre la impotencia absoluta de su poder: Susana vive enclaustrada en un delirio permanente de recuerdos sensuales con su difunto esposo Florencio, rechazando el lecho del cacique.

                Enferma de muerte, el padre Rentería intenta arrancarle una confesión aterrándola con el infierno, pero Susana expira abrazada al recuerdo carnal de su verdadero amante. Desesperado de dolor, Pedro Páramo ordena doblar las campanas de Comala a muerto.

                Los pueblos vecinos confunden el repique fúnebre con una festividad religiosa; durante semanas Comala se llena de feriantes, cirqueros, gallos y borrachera colectiva. Indignado ante la mofa profana sobre el cadáver de Susana, Pedro Páramo jura su sentencia destructora: 'Me cruzaré de brazos y Comala se morirá de hambre'. Clausura graneros, retira peones y ganado, dejando que la región perezca de inanición hasta convertirse en el pueblo fantasma.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Fase 5: El Parricidio de Abundio Martínez y el Desmoronamiento de Piedra",
            detalle = """
                Años más tarde, Pedro Páramo es un anciano quebrado y casi ciego que pasa los días sentado en su equipal mirando al camino vacío.

                Una tarde llega tambaleante su hijo bastardo, el arriero Abundio Martínez, ebrio de dolor tras el fallecimiento de su esposa Celerina y buscando unas monedas para pagar el ataúd y la misa. La sirvienta Damiana Cisneros grita aterrada al verlo con un cuchillo; en el forcejeo ciego, el arriero sordo pierde el control y asesta varias puñaladas en el pecho y el costado a Pedro Páramo.

                El cacique no se queja; contempla el atardecer, apoya su brazo inerte en el hombro de Damiana y trata de alzar la mano para alcanzar la sombra de Susana. Al extinguirse sus fuerzas, da un golpe seco contra la tierra y se desmorona sobre el polvo como si fuera un montón de piedras, sellando el fin de Comala.
            """.trimIndent()
        )
    ),
    temaPrincipal = "La búsqueda infructuosa del padre y la identidad en un purgatorio terrenal poblado de muertos, la tiranía devastadora del caciquismo patriarcal y la dialéctica entre el amor absoluto inalcanzable y el odio que aniquila la comunidad.",
    simbolosClave = listOf(
        "Comala: Alegoría del infierno y el purgatorio terrenal ardiente sobre las brasas de la tierra, donde las almas penan atrapadas por la falta de perdón.",
        "El nombre 'Pedro Páramo': Síntesis ontológica de la piedra inerte (Petros) y la aridez desértica (Páramo) de un cacique que engendra la esterilidad y la muerte.",
        "Los murmullos: La memoria acústica colectiva de los difuntos que flota en el aire y que sofoca físicamente a Juan Preciado.",
        "El bulto de harapos de Dorotea: Metáfora de la maternidad frustrada y la culpa en un mundo estéril donde la vida ya no puede nacer.",
        "Las monedas de oro al padre Rentería: Símbolo de la simonía y la complicidad de la Iglesia con la injusticia feudal.",
        "El caballo Colorado sudando sangre: La fuerza ciega e impune de la violencia del cacicazgo que engendra su propia destrucción.",
        "El montón de piedras final: La disolución mineral y física del poder despótico de Pedro Páramo, devuelto a la nada."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿De qué causa exacta muere Juan Preciado a mitad de la novela en Comala?",
            respuesta = "No muere apuñalado ni asesinado por Pedro Páramo: fallece en medio de la plaza mayor víctima del puro terror psicológico y la asfixia física provocada por los murmullos incesantes de las almas de los muertos que le taponaron los pulmones."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué motivo Pedro Páramo decide destruir a Comala dejándola morir de hambre?",
            respuesta = "Porque al morir su adorada Susana San Juan, el cacique mandó doblar las campanas a muerto; el pueblo y los caseríos vecinos confundieron el tañido con una festividad patronal y organizaron ferias, músicas y borracheras profanas alrededor de la iglesia, lo que enfureció al cacique haciéndolo jurar: 'Me cruzaré de brazos y Comala se morirá de hambre'."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién asesina a Pedro Páramo en el desenlace de la obra y en qué circunstancias?",
            respuesta = "Es apuñalado por su propio hijo bastardo no reconocido, el arriero sordo Abundio Martínez, quien acudió ebrio de alcohol y desesperado por la muerte de su esposa Celerina a pedirle unas monedas para el ataúd, asestándole las cuchilladas durante un forcejeo confuso con Damiana Cisneros."
        ),
        PreguntaClaveObra(
            pregunta = "¿Con quién comparte sepultura Juan Preciado tras su muerte?",
            respuesta = "Yace enterrado en una fosa común junto a la mendiga Dorotea la Cuarraca, antigua alcahueta de Pedro Páramo que cargaba un bulto de harapos como hijo imaginario, con quien dialoga bajo tierra desentrañando los murmullos de los difuntos."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué decisión adopta el padre Rentería hacia el final de la novela tras vivir atormentado por su complicidad con los Páramo?",
            respuesta = "Cuelga la sotana, abandona el templo de Comala y se marcha a las montañas a combatir con las armas en la mano como guerrillero en la rebelión armada de la Guerra Cristera."
        )
    )
)
