package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

/**
 * OBRA 09: Cantar de Mio Cid (Anónimo / Copia de Per Abbat)
 * Fuente oficial: CONTENIDO_PEDAGOGICO/06_COMUNICACION/LITERATURA/OBRAS/OBRA_09_Cantar_de_Mio_Cid.md
 * Integración modular para RASTRO KMP - Biblioteca -> Obras
 */
val Obra09MioCid = ObraLiteraria(
    id = "cantar-de-mio-cid",
    titulo = "Cantar de Mio Cid",
    autor = "Anónimo (Códice copiado por Per Abbat)",    anio = "Siglo XII (c. 1140-1207)",
    pais = "España",
    colorHex = "#B45309",
    corriente = "Épica medieval española / Mester de juglaría",
    genero = "Épico",
    especie = "Cantar de gesta",
    categoria = "Literatura Española",    sinopsis = """
        Víctima de las calumniosas intrigas palaciegas de nobles envidiosos liderados por el conde García Ordóñez, el noble caballero castellano Rodrigo Díaz de Vivar, el Cid Campeador, es condenado por el rey Alfonso VI de Castilla al destierro feudal, con un plazo perentorio de nueve días para abandonar el reino bajo pena de muerte. Con lágrimas en los ojos, el héroe parte de su solar natal en Vivar contemplando sus palacios desiertos. Al entrar en Burgos, halla todas las puertas cerradas por orden real; únicamente una niña de nueve años se atreve a hablarle para suplicarle con ternura que se retire para no acarrear la ruina del pueblo. Alojado en la glera del río Arlanzón y sin recursos, su leal vasallo Martín Antolínez engaña a los prestamistas Raquel y Vidas empeñándoles dos pesadas arcas cubiertas de cuero bermejo que aseguran contener oro y que en realidad sólo llevan arena, obteniendo seiscientos marcos para financiar la partida.
        
        En el monasterio de San Pedro de Cardeña, el Cid se despide de su virtuosa esposa Doña Jimena y de sus dos pequeñas hijas, Doña Elvira y Doña Sol, en una desgarradora separación comparada a 'la uña de la carne'. Tras una visión onírica del Arcángel San Gabriel que le augura ventura y gloria militar incesante, cruza la frontera e inicia sus fulgurantes campañas bélicas en territorio musulmán: toma Castejón y Alcocer, vence a los reyes moros Fáriz y Galve y derrota en el pinar de Tévar al soberbio conde Ramón Berenguer de Barcelona, a quien libera generosamente tras ganar la célebre espada Colada. Con cada victoria, el Cid envía al rey Alfonso sucesivas y opulentas embajadas de caballos de guerra conducidas por su lugarteniente Minaya Álvar Fáñez, demostrando una fidelidad vasallática inquebrantable.
        
        Tras un prolongado asedio de nueve meses, el Campeador corona su mayor hazaña bélica: la conquista de la rica e imponente ciudad mora de Valencia (1094). El botín es tan colosal que todos sus caballeros se enriquecen. Rodrigo envía una tercera embajada con doscientos corceles selectos; conmovido por la perseverante lealtad de su vasallo, Alfonso VI autoriza que Doña Jimena y sus hijas viajen a Valencia y concede finalmente el perdón formal en una solemne entrevista a orillas del río Tajo, donde el héroe muerde la hierba en señal de sumisión. Para recompensarlo y honrarlo, el monarca concierta y apadrina el matrimonio de Doña Elvira y Doña Sol con los infantes de Carrión (don Fernando y don Diego), miembros de la encumbrada nobleza leonesa de los Beni-Gómez.
        
        Los desposorios se celebran en Valencia con fastuosos festejos durante quince días. Sin embargo, pronto queda al descubierto la vileza de los infantes: cuando un león doméstico se escapa en el alcázar, los infantes huyen aterrorizados —uno ocultándose bajo el escaño del Cid y el otro arrojándose a una cuba sucia de vino—, mientras el Campeador doma al felino cogiéndolo de la melena; y durante la batalla contra el rey Búcar de Marruecos (donde el Cid gana la espada Tizona), los yernos tiemblan de pánico ante el combate. Sintiéndose burlados por las mofas de los soldados, traman una despiadada venganza: piden permiso para llevar a sus esposas a Carrión, despiden a la escolta y, en el sombrío robledal de Corpes, despojan a las jóvenes doncellas, las azotan brutalmente con cinchas y espuelas de hierro y las abandonan malheridas dándolas por muertas para ser devoradas por lobos.
        
        Rescatadas providencialmente por su primo Félez Muñoz, la noticia del ultraje llega a Valencia. Lejos de iniciar una sangrienta vendetta privada, el Cid da muestra de su proverbial virtud de la 'mesura' y acude al derecho institucional regio, exigiendo al rey Alfonso VI que convoque a las Cortes de Toledo. Ante la asamblea imperial, el Cid reclama primero la restitución de sus dos espadas históricas (Colada y Tizona, que entrega a sus capitanes Martín Antolínez y Pedro Bermúdez), luego la devolución de los tres mil marcos de la dote matrimonial y, finalmente, formula el reto al honor (riepto) por felonía y traición. Los capitanes del Cid desafían a los infantes de Carrión y a su tío Asur González, venciéndolos de forma aplastante en el 'Juicio de Dios' en la vega de Carrión. Simultáneamente, emisarios reales de Navarra y Aragón solicitan la mano de Doña Elvira y Doña Sol. El cantar concluye con la gloria suprema del Campeador: recuperada plenamente la honra familiar y pública, sus hijas se desposan con los príncipes herederos, emparentando para siempre la sangre del infanzón castellano con las casas reales de España.
    """.trimIndent(),
    contextoHistorico = """
        • Monumento fundacional de la épica española: Compuesto hacia finales del siglo XII o 1207 (conservado en un códice único copiado por Per Abbat), es la obra cumbre del mester de juglaría castellano.
        • Base histórica y sociopolítica: Narra las hazañas reales de Rodrigo Díaz de Vivar (1048-1099) durante la Reconquista ibérica, reflejando el conflicto entre la vieja y parasitaria alta nobleza leonesa cortesana (ricos-hombres representados por los infantes de Carrión y García Ordóñez) y la baja nobleza castellana de frontera (infanzones que conquistan honra y hacienda con su propio esfuerzo).
        • Realismo épico y métrica juglaresca: A diferencia de las epopeyas míticas y mágicas europeas, destaca por su estricto realismo geográfico, histórico y económico. Métrica caracterizada por el anisosilabismo (versos irregulares de 14-16 sílabas con profunda cesura central) y rima asonante monorrima en tiradas variables.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Rodrigo Díaz de Vivar (El Cid Campeador)",
            rol = "Protagonista / Héroe épico castellano",
            descripcion = "Infanzón de Vivar dotado de la virtud suprema de la 'mesura' (prudencia, serenidad y justicia). Leal vasallo que sufre el injusto destierro, conquista Valencia a los moros y recupera dos veces su honra: primero la honra feudal ante el rey Alfonso VI y luego la honra familiar en las Cortes de Toledo."
        ),
        PersonajeLiterario(
            nombre = "Doña Jimena",
            rol = "Esposa virtuosa del Cid",
            descripcion = "Noble dama de gran dignidad y piedad cristiana que permanece orando en el monasterio de San Pedro de Cardeña durante el exilio de su esposo, hasta reunirse gloriosamente en Valencia."
        ),
        PersonajeLiterario(
            nombre = "Doña Elvira y Doña Sol",
            rol = "Hijas del Cid",
            descripcion = "Jóvenes doncellas casadas por pacto real con los infantes de Carrión. Sufren el brutal ultraje y azotes en el robledal de Corpes, siendo luego desposadas con los infantes herederos de Navarra y Aragón para convertirse en reinas."
        ),
        PersonajeLiterario(
            nombre = "Alfonso VI de Castilla y León",
            rol = "Rey feudal / Juez soberano",
            descripcion = "Monarca que destierra injustamente al Cid mal aconsejado por nobles intrigantes; conmovido por los suntuosos presentes y la fidelidad del héroe, lo perdona en el río Tajo y preside con rectitud las Cortes de Toledo."
        ),
        PersonajeLiterario(
            nombre = "Minaya Álvar Fáñez",
            rol = "Lugarteniente y brazo derecho del Cid",
            descripcion = "Primo hermano y principal capitán del héroe ('el mi diestro brazo'). Valeroso estratega y hábil diplomático que encabeza las tres embajadas con caballos y riquezas ante el rey Alfonso."
        ),
        PersonajeLiterario(
            nombre = "Martín Antolínez",
            rol = "Noble burgalés / El burgalés complido",
            descripcion = "Hombre de audacia e ingenio práctico que engaña a los prestamistas Raquel y Vidas con las arcas de arena. En el Juicio de Dios vence a Diego de Carrión empuñando la espada Colada."
        ),
        PersonajeLiterario(
            nombre = "Pedro Bermúdez (El Mudo)",
            rol = "Sobrino del Cid y portaestandarte",
            descripcion = "Guerrero impetuoso y temible que tartamudea en la paz pero es el primero en arrojarse al combate. En las Cortes desenmascara a Fernando de Carrión y lo abate en el duelo judicial con la espada Tizona."
        ),
        PersonajeLiterario(
            nombre = "Los Infantes de Carrión (Fernando y Diego)",
            rol = "Antagonistas / Condes de la nobleza leonesa",
            descripcion = "Pertenecientes al linaje de los Beni-Gómez. Soberbios, ambiciosos y cobardes. Buscan el matrimonio por codicia; humillados por el incidente del león y la batalla, azotan a sus esposas en Corpes y son vencidos en el duelo judicial."
        ),
        PersonajeLiterario(
            nombre = "Conde García Ordóñez",
            rol = "Enemigo cortesano del Cid",
            descripcion = "Gran noble castellano ('el de la barba vellida') corroído por la envidia hacia los éxitos del Cid, artífice del destierro injusto y protector de los infantes de Carrión."
        ),
        PersonajeLiterario(
            nombre = "Conde Ramón Berenguer de Barcelona",
            rol = "Noble catalán derrotado en Tévar",
            descripcion = "Aristócrata arrogante que menosprecia al Cid; tras ser capturado en batalla hace huelga de hambre por orgullo hasta que el Cid lo libera caballerosamente a cambio de la espada Colada."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Cantar I: El destierro, las arcas de arena y la despedida familiar",
            detalle = "El Cid sale llorando de Vivar desterrado por Alfonso VI. En Burgos nadie le abre por mandato real y una niña de nueve años le ruega que se marche. Martín Antolínez consigue 600 marcos de los prestamistas Raquel y Vidas empeñando dos arcas llenas de arena. En San Pedro de Cardeña el Cid se despide de Jimena y sus hijas 'como la uña de la carne'. Tras soñar con el Arcángel San Gabriel, vence a moros en Alcocer y al Conde de Barcelona en Tévar, ganando la espada Colada."
        ),
        EscenaTrama(
            titulo = "Cantar II: La conquista de Valencia, el perdón en el Tajo y las bodas",
            detalle = "El Cid conquista Valencia tras nueve meses de sitio. Envía suntuosas embajadas de caballos al rey, quien autoriza el viaje de su familia al alcázar valenciano frente al mar. Derrota al rey Yúsuf de Marruecos y Alfonso VI le concede el perdón solemne en las vistas del río Tajo, donde el Cid muerde la hierba en sumisión. El monarca concierta las bodas de Doña Elvira y Doña Sol con los infantes de Carrión, celebrándose durante 15 días."
        ),
        EscenaTrama(
            titulo = "Cantar III: El león, el rey Búcar y la afrenta del robledal de Corpes",
            detalle = "Un león escapa en palacio y los infantes huyen con pánico cómico (uno bajo el escaño y otro a una cuba de vino). Ante el ataque del rey Búcar, los yernos tiemblan; el Cid mata a Búcar y gana la espada Tizona. Humillados por las mofas, los infantes piden llevar a sus esposas a Carrión: en el robledal de Corpes las despojan, las azotan con cinchas y espuelas y las abandonan dándolas por muertas. Félez Muñoz las rescata providencialmente."
        ),
        EscenaTrama(
            titulo = "Cantar III: Las Cortes de Toledo, el Juicio de Dios y la apoteosis regia",
            detalle = "El Cid recurre a la ley e insta a Alfonso VI a convocar las Cortes de Toledo. El Campeador exige y recupera las espadas Colada y Tizona y los tres mil marcos de dote, y sus capitanes desafían a los traidores. En la vega de Carrión, Pedro Bermúdez, Martín Antolínez y Muño Gustioz derrotan a los infantes. Llegan emisarios de Navarra y Aragón pidiendo la mano de las hijas: el Cid emparenta con los reyes de España y culmina su ascenso en gloria inmarcesible."
        )
    ),
    temaPrincipal = "La doble pérdida y la doble recuperación y ensalzamiento de la honra (honor feudal ante el rey y honor familiar privado ante los infantes), sustentada en la virtud castellana de la mesura.",
    simbolosClave = listOf(
        "La mesura: Virtud ética cardinal del Cid que encarna la prudencia, el equilibrio de ánimo, la serenidad en la desgracia y el rechazo a la venganza tribal en favor de la ley.",
        "La espada Colada (ganada a Ramón Berenguer) y la espada Tizona (ganada al rey Búcar): Símbolos del mérito bélico y valor del héroe, que intimidan por sí solas a los infantes cobardes en el duelo final.",
        "Las arcas de arena (Raquel y Vidas): Símbolo del ingenio práctico (astucia de frontera) frente a la indigencia impuesta por el injusto destierro.",
        "El caballo Babieca: Símbolo de fidelidad, velocidad y majestuosidad caballeresca que acompaña al Campeador en sus mayores gestas.",
        "La barba florida e intocada ('por esta barba que nadie mesó jamás'): Juramento viviente de honor y dignidad del héroe.",
        "El león manso ante el Cid: Símbolo de la auténtica nobleza y autoridad moral sobrehumana del héroe, en contraste con la cobardía grotesca de los infantes de Carrión."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es el eje estructural y argumental que articula toda la trama del Cantar de Mio Cid?",
            respuesta = "La doble pérdida y la posterior doble recuperación y enaltecimiento de la honra: primero, la pérdida del honor público/feudal por el destierro y su restauración con la toma de Valencia y el perdón en el Tajo; segundo, la pérdida del honor privado/familiar tras el ultraje en Corpes y su restauración en las Cortes de Toledo con el matrimonio de sus hijas con los futuros reyes de Navarra y Aragón."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién es Per Abbat y qué papel cumple respecto al texto del cantar?",
            respuesta = "Per Abbat no es el autor de la obra, sino el clérigo o copista que trasladó el manuscrito en el año 1207. El cantar de gesta es originariamente anónimo y fruto de la tradición del mester de juglaría."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo consigue el Cid recursos económicos para financiar su partida al destierro?",
            respuesta = "Mediante una estratagema de Martín Antolínez: empeña a los prestamistas burgaleses Raquel y Vidas dos pesadas arcas cubiertas de cuero bermejo y clavos dorados, haciéndoles creer que contienen riquezas acumuladas cuando en realidad solo llevan arena fina, recibiendo 600 marcos de plata."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo obtiene el Cid sus dos célebres espadas, Colada y Tizona?",
            respuesta = "Gana la espada Colada tras derrotar en batalla en el pinar de Tévar al conde Ramón Berenguer de Barcelona (Cantar I); y conquista la espada Tizona tras matar en combate al rey moro Búcar de Marruecos en las playas de Valencia (Cantar III)."
        ),
        PreguntaClaveObra(
            pregunta = "¡Trampa de Examen!: ¿Cómo toma venganza el Cid del ultraje de sus hijas en el robledal de Corpes?",
            respuesta = "¡No ejecuta una venganza personal sangrienta ni asesina a los infantes por propia mano! Ejerciendo su mesura, recurre a la vía de la justicia real e institucional acudiendo a las Cortes de Toledo presididas por Alfonso VI, donde exige la devolución de espadas y dotes, y sus vasallos vencen legalmente a los infantes en el Juicio de Dios."
        )
    )
)
