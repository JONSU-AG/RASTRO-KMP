package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra11LaVidaEsSueno = ObraLiteraria(
    id = "la-vida-es-sueno",
    titulo = "La vida es sueño",
    autor = "Pedro Calderón de la Barca",    anio = "Siglo XVII (1635-1636)",
    pais = "España",
    colorHex = "#6B21A8",
    corriente = "Siglo de Oro español / Barroco pleno / Teatro de la Contrarreforma",
    genero = "Dramático",
    especie = "Drama filosófico y palatino en verso",
    categoria = "Literatura Española",    sinopsis = """
        En el legendario reino de Polonia, el rey astrólogo Basilio recluye en una lóbrega torre agreste a su hijo recién nacido, el príncipe Segismundo, tras haber descifrado en los astros y en el sangriento eclipse del parto que el infante se convertiría en un tirano despiadado que pisotearía sus canas reales. Criado en cadenas y cubierto de toscas pieles de fieras bajo la tutela carcelaria del leal Clotaldo, Segismundo desconoce su sangre regia y se lamenta amargamente de la libertad que la naturaleza concede a las aves, los brutos, los peces y los arroyos pero le niega a él.

        Asaltado en su vejez por el remordimiento moral de usurpar el derecho natural y el libre albedrío, Basilio decide poner a prueba el dictamen del hado mediante un arriesgado experimento: suministra a Segismundo un brebaje de opio y beleño, trasladándolo en brazos del letargo a los suntuosos aposentos de palacio. Al despertar rodeado de sedas y reverencias cortesanas, Clotaldo le revela su origen dinástico. Al saberse víctima de un confinamiento atroz, el príncipe estalla en una furia salvaje: arroja a un criado por el balcón al mar, amenaza de muerte a Clotaldo, increpa con altivez al rey llamándolo usurpador y acosa violentamente a la dama Rosaura. Espantado ante la aparente corroboración del horóscopo fatídico, Basilio ordena volver a narcotizar al príncipe y devolverlo a las cadenas de la montaña, convenciéndolo de que todo lo vivido en palacio no fue sino una quimera onírica.

        Al despertar nuevamente encadenado en la penumbra, Segismundo extrae de su desengaño la cumbre del pensamiento barroco: si el rey, el rico y el desdichado sueñan sus estados hasta despertar en la muerte, toda la vida terrena no es más que una ilusión efímera ('y los sueños, sueños son'). Poco después, un ejército popular sublevado derriba los muros de la torre para impedir que el extranjero duque Astolfo de Moscovia usurpe la corona. Puesto al frente de las tropas, Segismundo asume el combate bajo un nuevo imperativo categórico: 'sea verdad o sueño, obrar bien es lo que importa'. Tras aplastar a las huestes reales y presenciar la muerte providencial del gracioso Clarín, Segismundo rechaza la tiranía: se arrodilla con reverencia filial a los pies de Basilio, redimiendo la profecía con prudencia y perdón, restaura el honor manchado de Rosaura casándola con Astolfo, desposa a la infanta Estrella y castiga al soldado rebelde que incitó la sedición, sellando el triunfo supremo del libre albedrío sobre la predestinación astrológica.
    """.trimIndent(),
    contextoHistorico = """
        Estrenada hacia 1635 y publicada en 1636 en la 'Primera parte de comedias' editada por su hermano José Calderón, 'La vida es sueño' representa el pináculo del drama filosófico y teológico de la Contrarreforma católica del Siglo de Oro español.

        La obra responde directamente al debate doctrinal más ardiente que sacudió a Europa durante los siglos XVI y XVII: la controversia sobre el libre albedrío frente a la predestinación. Frente al determinismo luterano y calvinista, y en el marco de la agria disputa 'De auxiliis' entre jesuitas (Luis de Molina y la ciencia media) y dominicos (Domingo Báñez), Calderón de la Barca —formado con los jesuitas en el Colegio Imperial de Madrid— proclama la soberanía moral de la voluntad humana:
        1. Las estrellas y los hados cósmicos pueden influir o inclinar los apetitos biológicos ('astra inclinant, non necessitant'), pero jamás tienen potestad para aniquilar la libertad del alma racional.
        2. El ser humano, apoyado en el autodominio ético, la razón y la gracia moral, posee el poder de vencer las inclinaciones salvajes y consagrar el bien.

        Asimismo, la obra plasma el tópico medular del desengaño barroco ('vanitas vanitatum'): la advertencia de raíz platónica y estoica de que el poder terrenal, las jerarquías políticas y las glorias sensoriales son sombras perecederas. La vida en el mundo es un ensayo o un 'sueño' del que solo se despierta tras el juicio inexorable de la muerte.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Segismundo",
            rol = "Príncipe heredero de Polonia y protagonista ontológico",
            descripcion = "El 'monstruo humano', escindido entre la fiera instintiva y el ser racional ('un hombre de las fieras / y una fiera de los hombres'). Encadenado desde la cuna en una torre salvaje vestido con pieles, desconoce su linaje. En la Jornada I simboliza la angustia metafísica por la privación de la libertad natural; en la Jornada II, trasplantado a la corte sin pedagogía moral, desata su furor tiránico; en la Jornada III, desengañado por la experiencia del retorno a las cadenas, experimenta una radical conversión ética: vence sus pasiones, perdona a su padre y encarna el arquetipo del Príncipe Cristiano guiado por la templanza y el libre albedrío."
        ),
        PersonajeLiterario(
            nombre = "Basilio",
            rol = "Rey de Polonia, padre de Segismundo y astrólogo cortesano",
            descripcion = "Arquetipo del soberbio intelectual y científico que desafía a la providencia. Cegado por sus cálculos astrológicos e interpretando como profecía infalible el sangriento eclipse y los sueños de la reina Clorilene al parir, condena a su hijo a un confinamiento inhumano. Al intentar burlar el hado mediante la tiranía, engendra la violencia que temía. Tras el fracaso del experimento palatino y la derrota en la guerra civil, reconoce su error hermenéutico y se arroja al fango a los pies de su hijo, siendo rescatado por la magnanimidad de Segismundo."
        ),
        PersonajeLiterario(
            nombre = "Rosaura",
            rol = "Dama moscovita y motor dinámico de la trama del honor",
            descripcion = "Hija secreta de Clotaldo y noble dama de Moscovia. Llega a Polonia disfrazada de caballero andante para vengar su afrenta: el duque Astolfo la deshonró bajo palabra de matrimonio y la abandonó para pretender el trono polaco. Su irrupción en el monte abre el drama, y su posterior reaparición en la Jornada III —ataviada con armadura y espada sobre un corcel blanco como un ser andrógino— conmueve el alma de Segismundo, obligándolo a sublimar el deseo erótico carnal para reparar el honor de la dama."
        ),
        PersonajeLiterario(
            nombre = "Clotaldo",
            rol = "Alcaide de la torre, carcelero, tutor de Segismundo y padre de Rosaura",
            descripcion = "Noble anciano de lealtad feudal inquebrantable. Custodia celosamente el secreto de Estado de la torre y educa a Segismundo en la teología y las ciencias. Reconoce a su hija Rosaura gracias a la espada que ella empuña (la misma que él entregó a su madre Violante en Moscú). Vive un perpetuo desgarramiento moral entre su deber paterno de resguardar el honor de su hija y su deber vasallático de fidelidad ciega al rey Basilio y a Astolfo."
        ),
        PersonajeLiterario(
            nombre = "Astolfo",
            rol = "Duque de Moscovia y sobrino de Basilio",
            descripcion = "Joven noble, apuesto y cortesano calculador. Pretende desposar a su prima la infanta Estrella para unificar sus pretensiones y adueñarse de la corona polaca, ocultando su falta moral con Rosaura, cuyo retrato lleva prendido al pecho. Al final es forzado por Segismundo a cumplir su juramento y reparar el honor de Rosaura en matrimonio."
        ),
        PersonajeLiterario(
            nombre = "Estrella",
            rol = "Infanta de Polonia y prima de Astolfo y Segismundo",
            descripcion = "Princesa digna, perspicaz y desconfiada de la retórica galante de Astolfo al advertir su devoción oculta por otra mujer. Termina desposándose con el redimido rey Segismundo al cierre de la obra para asegurar la paz dinástica del reino."
        ),
        PersonajeLiterario(
            nombre = "Clarín",
            rol = "El gracioso de la comedia española y criado de Rosaura",
            descripcion = "Cobarde, cínico, locuaz y oportunista. Proporciona el contrapunto festivo y cómico ante la severidad teológica del drama. En la Jornada III, Calderón le asigna una función teológica trascendental: intentando eludir el combate civil escondiéndose cobardemente tras unas rocas, es alcanzado por una bala perdida al azar, muriendo en escena para proclamar la máxima providencial: 'no hay cerrojo contra el hado'."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Jornada I: La Torre de las Fieras y la Revelación del Horóscopo",
            detalle = """
                La obra arranca de forma vertiginosa en un peñasco salvaje de Polonia: la dama moscovita Rosaura, ataviada de varón, cae de su caballo desbocado ('Hipogrifo violento') y queda extraviada con su criado Clarín al anochecer. En medio de los riscos divisan una torre tosca cuya puerta entreabierta deja escapar una luz titilante y el chirrido de cadenas. Al asomarse contemplan a un joven vestido con pieles toscas de fieras atado a la peña: es Segismundo.

                El príncipe alza la voz en décimas espinelas pronunciando su desgarrador soliloquio inicial ('¡Ay mísero de mí, y ay infelice!'). Reflexiona sobre su culpa original —el delito de haber nacido— y compara simétricamente su encierro con las criaturas libres del cosmos: el ave que vuela por el éter, el bruto fiero que corre la espesura, el pez que hiende el abismo marino y el arroyo que serpentea entre las flores. Estalla en queja existencial: poseyendo más alma, instinto y albedrío, ¿por qué goza de menos libertad? Al notar a los forasteros intenta estrangularlos por haber presenciado su vileza, pero la dulce voz de Rosaura apacigua milagrosamente su furor.

                Irrumpen los guardias con pistolas amartilladas al mando del alcaide Clotaldo, quien desarma a los intrusos por penetrar en un recinto secreto de Estado castigado con la pena capital. Al examinar la espada dorada de Rosaura, Clotaldo palidece: reconoce el arma que él mismo confió en Moscú a Violante para identificar a su futuro linaje; cree estar ante su propio hijo varón y se debate entre salvar su sangre o acatar su lealtad al monarca.

                Entretanto, en la corte de Varsovia, los infantes Astolfo y Estrella discuten la sucesión real cuando el anciano rey Basilio revela ante la corte el secreto de Estado: durante el encinta de su difunta esposa Clorilene, vio en los astros un oráculo pavoroso que auguraba que el niño Segismundo sería un monstruo sanguinario que lo destronaría y humillaría sus canas. Para eludir el hado lo recluyó en la torre, pero ahora, temeroso de cometer una injusticia que viole el derecho divino de la sangre y el libre albedrío, anuncia su audaz experimento: adormecerá al joven con pócimas de opio y lo despertará en palacio; si vence sus instintos con cordura reinará en Polonia; si se muestra tirano, regresará a su encierro creyendo que todo fue un sueño. Basilio decreta el perdón de los prisioneros y Rosaura confiesa a Clotaldo que en verdad es mujer y busca lavar la deshonra infligida por el duque Astolfo.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Jornada II: La Fiera en Palacio y el Gran Soliloquio del Desengaño",
            detalle = """
                Clotaldo informa al rey Basilio de la consumación del traslado: administraron al príncipe una poción sedante de opio, beleño y adormidera en su celda, transportándolo profundamente dormido al palacio real. Basilio justifica la treta médica y filosófica: si Segismundo fracasa en la prueba, hacerle creer que la corte fue una ilusión onírica evitará que se arroje al suicidio en sus cadenas, pues 'en el mundo todos los que viven sueñan'.

                Segismundo despierta en una suntuosa estancia recubierta de tapices, atendido por sirvientes que le ofrecen manjares, música y perfumes. Desconcertado, contempla sus manos enjoyadas y duda de sus sentidos. Clotaldo se arrodilla ante él y le desvela su condición de príncipe heredero e hijo del monarca, relatándole cómo fue su preceptor en la torre. La revelación enciende la cólera vengativa de Segismundo: tilda a Clotaldo de traidor desalmado y se abalanza para estrangularlo. Un criado cortesano interviene físicamente para frenar el asalto; Segismundo, ultrajado de que un vasallo lo desafíe, lo toma por el cuello, lo arrastra al balcón abierto y lo arroja al vacío sobre las rocas del mar.

                Comparecen Astolfo y el rey Basilio. Segismundo trata a Astolfo con soberbia altanera y enfrenta con desafío a su padre ante el cadáver del criado arrojado. Basilio le recrimina su conducta y le advierte solemnemente: 'Mira bien lo que te advierto: que seas humilde y blando, porque quizá estás soñando, aunque ves que estás despierto'. Segismundo responde con desprecio denunciando la tiranía paterna que le hurtó su condición humana. Poco después entra Rosaura bajo el disfraz cortesano de Astrea; el príncipe queda deslumbrado por su hermosura y, al quedarse a solas, intenta forzarla con violencia carnal salvaje. Clotaldo desenvaina para protegerla; Segismundo arremete para matarlo, traba un duelo de espadas con Astolfo que sale en su auxilio, y finalmente es reducido por la guardia real de Basilio.

                Convencido del cumplimiento inexorable de la crueldad astrológica, Basilio ordena verter de nuevo el narcótico en la copa de Segismundo. El joven cae dormido y es restituido a su calabozo de la montaña. Al despertar atado al muro de roca y vestido con pieles toscas, Segismundo confiesa a Clotaldo el fabuloso delirio vivido en palacio, del cual solo una mujer amada le pareció cierta. Clotaldo le deja sembrada la clave moral: 'Aun en sueños no se pierde el hacer bien'.

                A solas en la penumbra de su torre, Segismundo pronuncia el soliloquio ontológico cumbre del teatro barroco universal. Reflexiona sobre la vanidad de las grandezas humanas: el rey sueña su poder hasta despertar en la ceniza de la muerte; el rico sueña sus caudales y el pobre su desdicha. Todo es contingente, precario y ficticio: '¿Qué es la vida? Un frenesí. / ¿Qué es la vida? Una ilusión, / una sombra, una ficción, / y el mayor bien es pequeño: / que toda la vida es sueño, / y los sueños, sueños son'.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Jornada III: La Guerra Civil, el Triunfo de la Razón y el Juicio Magnánimo",
            detalle = """
                En la torre agreste, Clarín permanece encerrado por entrometido. Súbitamente, una masa armada de soldados rebeldes echa abajo las compuertas de la fortaleza. Confunden inicialmente a Clarín con el príncipe y lo aclaman, pero Segismundo entra arrastrando sus cadenas. Los insurrectos se postran ante el verdadero heredero: le anuncian que el pueblo y el ejército de Polonia se alzan en armas para impedir que el extranjero Astolfo de Moscovia sea proclamado rey por decisión de Basilio.

                Segismundo recela al principio, temiendo ser presa de una nueva ilusión burlona del palacio. Sin embargo, supera el escepticismo adoptando su definitiva regla de vida ética: 'A reinar, fortuna, vamos; no me despiertes si duermo, y si es verdad, no me duermas... mas, sea verdad o sueño, obrar bien es lo que importa'. Clotaldo acude esperando la muerte por mano del príncipe; Segismundo lo sorprende perdonándole la vida y acatando con respeto su decisión feudal de marchar a combatir al lado del rey Basilio.

                En el fragor de la contienda civil, resuena el galope de un corcel: comparece Rosaura ataviada con arnés guerrero, espada y peto de acero sobre un caballo blanco. Se arrodilla ante Segismundo y le relata en romance su historia: le pide que impida el matrimonio de Astolfo con Estrella para restaurar su honra manchada. La belleza de la joven despierta nuevamente el apetito carnal de Segismundo, pero el príncipe libra una batalla interna victoriosa: comprende que para gozar de la dignidad regia debe sobreponerse a sí mismo y renunciar al goce efímero en pos de la virtud moral.

                Se desata la batalla campal y las huestes rebeldes barren a las fuerzas leales. Clarín, aterrado por el fuego y el plomo, huye cobardemente y se esconde detrás de unas rocas para escapar del destino; en ese instante, una bala perdida disparada al azar lo hiere mortalmente en el pecho. Agonizando ante los ojos de Basilio y Clotaldo, Clarín proclama la lección providencial: el hombre no puede atrincherarse contra la hora señalada por Dios ('No hay cerrojo contra el hado').

                Desesperado y quebrantado, Basilio renuncia a la huida y aguarda su destino. Al entrar Segismundo victorioso, el anciano rey se postra en el fango a sus pies, ofreciendo su cuello cano para ser pisoteado y cumplir el oráculo. En ese instante decisivo, Segismundo asombra a la corte entera con un discurso de altísima madurez teológico-política: demuestra que el vaticinio astral inclinaba sus pasiones pero que el rey erró al pretender vencer el mal con la injusticia del encierro; y en un gesto sublime, Segismundo se arrodilla a las plantas de su padre, entregándole la espada y su sumisión filial.

                Conmovido, Basilio lo proclama legítimo soberano. Como príncipe cristiano perfecto, Segismundo restituye el orden social y moral: obliga a Astolfo a desposar a Rosaura —revelando Clotaldo que es su hija noble legítima—, pide la mano de la infanta Estrella para asegurar la paz de la corona, y ante la insolente petición del soldado rebelde que inició el motín y pide un rico premio, el monarca lo condena a prisión perpetua en la misma torre de piedra, dictaminando la célebre máxima de Estado: 'que el traidor no es menester habiendo la traición pasado'. Todos celebran la prudencia del monarca que aprendió en un sueño que toda dicha humana pasa y que la gloria se conserva únicamente obrando el bien.
            """.trimIndent()
        )
    ),
    temaPrincipal = "El triunfo del libre albedrío y la razón moral sobre el determinismo astrológico (el hado), conjugado con la doctrina barroca del desengaño ante la transitoriedad ilusoria de la existencia humana ('la vida es sueño').",
    simbolosClave = listOf(
        "La torre y las cadenas: Alegoría de la prisión de la materia, la noche, la ignorancia animal, la fiera zoológica y el caos previo a la ley.",
        "El palacio cortesano: Símbolo de la luz, el orden civil, la tentación de la soberbia del poder y el teatro donde se pone a prueba el juicio moral.",
        "El hipogrifo / caballo desbocado: Imagen inicial que representa el desenfreno de las pasiones desatadas, la ambición y la caída en la ceguera del mundo.",
        "El horóscopo y los astros: Representan las inclinaciones y tentaciones naturales de la carne que el hombre puede doblegar con su voluntad y la gracia divina ('astra inclinant, sed non necessitant').",
        "El soliloquio del ave, bruto, pez y arroyo: Alegoría rigurosa de los cuatro elementos del cosmos que gozan de la libertad física que la tiranía arrebata al hombre.",
        "La bala que mata a Clarín: Símbolo de la providencia divina implacable; demuestra la inutilidad de huir del destino o actuar con cinismo oportunista.",
        "El retrato al cuello de Astolfo: Encarnación de la deshonra secreta y la traición sentimental que articula el nudo dramático de Rosaura."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es la postura teológico-filosófica que postula Calderón de la Barca respecto al conflicto entre el hado y la libertad humana?",
            respuesta = "Alineada con la Contrarreforma católica y la teología jesuita, la obra proclama que las estrellas o el hado pueden inclinar las pasiones del ser humano ('astra inclinant, sed non necessitant'), pero jamás anulan el libre albedrío moral. Mediante el uso de la razón, la templanza y el imperativo de 'obrar bien', el hombre es capaz de vencer cualquier determinismo astral adverso."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué motivo exacto se desata la insurrección del pueblo y del ejército en la Jornada III?",
            respuesta = "El pueblo y la soldadesca de Polonia no se sublevan por compasión personal hacia Segismundo (a quien desconocían), sino para impedir que un monarca extranjero —el duque Astolfo de Moscovia— ocupe el trono polaco tras la decisión de Basilio de apartar a su legítimo sucesor natural."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo es trasladado Segismundo entre la torre y el palacio real en las Jornadas I y II?",
            respuesta = "No es trasladado despierto ni reducido por violencia física visible: es adormecido mediante un brebaje narcótico de hierbas soporíferas (opio, beleño y adormidera) para que al despertar en la corte crea estar en un nuevo estado, y de idéntica manera es retornado adormecido a su calabozo para convencerlo de que la corte fue solo un sueño."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué destino sufre el gracioso Clarín durante la batalla final y qué significado encierra?",
            respuesta = "Clarín intenta evadir el combate escondiéndose cobardemente tras unas rocas mientras ironiza sobre los que mueren por honor; no obstante, una bala perdida lo hiere de muerte al azar. Su fallecimiento sobre el tablado demuestra que no existe refugio humano ni cerrojo posible contra el designio inmutable de la muerte ('No hay cerrojo contra el hado')."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué resolución adopta Segismundo respecto al soldado rebelde que encabezó la insurrección para liberarlo?",
            respuesta = "Segismundo no lo premia: lo condena a reclusión perpetua en la misma torre de piedra donde él padeció su encierro, aplicando una rigurosa justicia de Estado bajo el aforismo: 'que el traidor no es menester habiendo la traición pasado'."
        ),
        PreguntaClaveObra(
            pregunta = "¿Con quién contrae matrimonio Segismundo al culminar el drama?",
            respuesta = "Segismundo se desposa con su prima la infanta Estrella, mientras que obliga al duque Astolfo a contraer matrimonio con Rosaura para restaurar debidamente el honor mancillado de la doncella."
        )
    )
)
