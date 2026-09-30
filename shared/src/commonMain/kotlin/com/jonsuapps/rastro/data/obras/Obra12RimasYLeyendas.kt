package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra12RimasYLeyendas = ObraLiteraria(
    id = "rimas-y-leyendas",
    titulo = "Rimas y leyendas",
    autor = "Gustavo Adolfo Bécquer",    anio = "Siglo XIX (1858-1871)",
    pais = "España",
    colorHex = "#9333EA",
    corriente = "Posromanticismo español / Romanticismo intimista tardío",
    genero = "Lírico / Narrativo",
    especie = "Poesía lírica breve (Rimas) y Relatos de prosa poética gótica (Leyendas)",
    categoria = "Literatura Española",    sinopsis = """
        'Rimas y leyendas' constituye el monumento cimero del Posromanticismo hispánico, compuesto por la producción poética breve y los relatos legendarios en prosa de Gustavo Adolfo Bécquer, recopilados póstumamente en 1871 por sus amigos más íntimos tras la prematura muerte del autor.

        Las 'Rimas' trazan una conmovedora parábola existencial en cuatro series temáticas: comienza con la reflexión metapoética sobre la inefabilidad del misterio creador y la convicción de que la poesía es un hálito cósmico eterno superior a las palabras humanas (Serie I); se adentra luego en la radiante celebración del amor ilusionado, donde la mirada de la amada encarna el ideal lírico absoluto (Serie II); desciende abruptamente hacia el dolor desgarrador del desengaño, la incomunicación, el orgullo herido y la ruptura irreconciliable ('Volverán las oscuras golondrinas', Serie III); para culminar en la desolación fúnebre, el vacío ontológico y el pavor ante la soledad del camposanto ('¡Dios mío, qué solos se quedan los muertos!', Serie IV).

        Por su parte, las 'Leyendas' son una veintena de relatos en prosa de exquisito lirismo musical ambientados en abadías, castillos templarios y callejones góticos de Soria, Toledo y Sevilla. En ellas, los protagonistas persiguen obsesivamente una belleza ideal o sacrílega que desemboca inexorablemente en el misterio sobrenatural, la locura o la muerte física: Alonso muere devorado por los lobos al buscar el lazo azul de su fría prima Beatriz en 'El monte de las ánimas'; Fernando de Argensola es arrastrado al fondo de una fuente mortal por los ojos verdes de una ondina diabólica; Manrique pierde la razón al descubrir que la dama de sus sueños es solo un rayo de luna reflejado en el follaje; el órgano de Maese Pérez continúa interpretando armonías celestiales después de la muerte del anciano ciego; y Pedro Alfonso enloquece en la catedral toledana al arrancar la ajorca de oro de los brazos de la Virgen del Sagrario frente a las estatuas que cobran vida.
    """.trimIndent(),
    contextoHistorico = """
        Publicadas originalmente de forma dispersa en periódicos y revistas madrileñas (como 'El Museo Universal', 'El Contemporáneo' y 'La Ilustración de Madrid') entre 1858 y 1868, las 'Rimas' y las 'Leyendas' vieron la luz como libro unitario en la edición póstuma de 1871, editada por los amigos de Bécquer tras su muerte a los 34 años de tuberculosis. El manuscrito original de las poesías se perdió en 1868 durante el asalto al palacio del ministro González Bravo en la Revolución 'La Gloriosa', viéndose obligado Bécquer a transcribirlas febrilmente de memoria en un cuaderno escolar titulado 'Libro de los gorriones'.

        En una España dominada por el positivismo cientificista y el realismo burgués de la Restauración, Bécquer encabezó una auténtica revolución estética interior:
        1. Asimiló el influjo de la balada germánica (particularmente el 'Intermezzo lírico' de Heinrich Heine traducido por Eulogio Florentino Sanz), desterrando el sonsonete sonoro y la oratoria pomposa del primer Romanticismo de Espronceda.
        2. Instauró la Poética de la Inefabilidad: la poesía es un sentimiento inmaterial prelingüístico que habita en el misterio del universo, y el poeta moderno experimenta la dolorosa angustia de comprobar la impotencia del lenguaje humano para atrapar la infinitud del espíritu.
        3. Exploró la naturaleza destructora de la belleza: la mujer es a la vez musa etérea y fuerza fatídica cuyo influjo precipita al hombre sensible hacia la catástrofe existencial.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "La Voz Lírica (El Poeta)",
            rol = "Protagonista interior de las Rimas",
            descripcion = "Espíritu hipersensible que encarna al artista posromántico desgarrado entre la infinitud de sus ideales y la estrechez del mundo prosaico. Transita desde el fervor de la comunión mística y el amor absoluto hacia el desencanto, el silencio doliente del orgullo y el terror ante el abismo de la nada y el sepulcro solitario."
        ),
        PersonajeLiterario(
            nombre = "Don Alonso",
            rol = "Joven noble cazador en 'El monte de las ánimas'",
            descripcion = "Caballero valeroso y devoto de Soria. Aunque conoce el pavoroso peligro sobrenatural que acecha a la Noche de Difuntos en las ruinas templarias, su orgullo caballeresco y el amor idolátrico que profesa a su prima Beatriz lo impulsan a cabalgar a medianoche hacia el monte maldito para rescatar una cinta de su corpiño, encontrando una muerte espantosa devorado por los lobos."
        ),
        PersonajeLiterario(
            nombre = "Beatriz",
            rol = "Dama altiva y prima de Alonso en 'El monte de las ánimas'",
            descripcion = "Joven hermosa, calculadora, fría y desdeñosa. Se mofa de las advertencias piadosas de Alonso y manipula su honra sugiriendo la pérdida de su lazo azul en el monte de los templarios. Pasa una noche de agonía sensorial y pánico psicológico encerrada en su aposento señorial y muere de puro terror al alba al hallar sobre su lecho el lazo desgarrado y bañado en sangre fresca."
        ),
        PersonajeLiterario(
            nombre = "Don Fernando de Argensola",
            rol = "Primogénito de los marqueses de Almenar en 'Los ojos verdes'",
            descripcion = "Noble apasionado que desoye las advertencias de su anciano montero Íñigo y se interna en la espesura prohibida de la Fuente de los Álamos tras un ciervo herido. Cae presa de una obsesión hipnótica al vislumbrar unos misteriosos ojos verdes fosforescentes en el fondo del agua, dejándose abrazar y arrastrar a la sima abismal por una ondina espectral."
        ),
        PersonajeLiterario(
            nombre = "La Ondina / El Espíritu del Agua",
            rol = "Aparición sobrenatural femenina en 'Los ojos verdes'",
            descripcion = "Ser diabólico y seductor que habita en las profundidades líquidas del Moncayo. Posee una belleza sobrehumana con ojos verdes esmeralda y voz de viento; tienta a Fernando con promesas de dicha inmortal sin dolor para devorarlo en el remolino abismal del lago."
        ),
        PersonajeLiterario(
            nombre = "Don Manrique",
            rol = "Noble poeta soñador en 'El rayo de luna'",
            descripcion = "Joven hidalgo soriano solitario y misántropo que rehúye la gloria bélica y el trato cortesano para buscar a una mujer ideal hecha de silencio y luz. Persigue febrilmente por las riberas del Duero una tela blanca que ondea en la noche, cayendo en la locura lúcida al comprobar que su princesa soñada no era más que un rayo de luna que cruzaba las ramas."
        ),
        PersonajeLiterario(
            nombre = "Maese Pérez",
            rol = "Anciano organista ciego en 'Maese Pérez el organista'",
            descripcion = "Músico venerable y santo de setenta y seis años que toca el órgano del convento de Santa Inés en Sevilla. Anciano desinteresado y pobre que eleva a los fieles a una comunión celestial durante la Misa del Gallo. Fallece sobre el teclado en pleno éxtasis místico, pero su alma fiel regresa del más allá para hacer resonar el instrumento en Nochebuena de forma milagrosa."
        ),
        PersonajeLiterario(
            nombre = "María Antúnez y Pedro Alfonso",
            rol = "Amantes trágicos en 'La ajorca de oro'",
            descripcion = "Ella es una doncella toledana de hermosura diabólica y capricho tiránico; él, un joven caballero ciegamente enamorado que comete el sacrilegio de arrancar a medianoche la ajorca de diamantes del brazo de la estatua de la Virgen del Sagrario en la catedral gótica de Toledo, perdiendo irremediablemente el juicio ante la visión pavorosa de las estatuas que despiertan y bajan de sus nichos."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Las Rimas: La Parábola Lírica en Cuatro Series (Metapoesía, Amor, Desengaño y Sepulcro)",
            detalle = """
                La edición póstuma de 1871 organizó las composiciones de Bécquer en cuatro series simétricas que condensan la evolución interior del espíritu lírico:
                - Serie I (Rimas I a XI - La Poética y la Inefabilidad): El poeta indaga en el misterio del arte. En la Rima I confiesa albergar un himno gigante que el lenguaje humano resulta impotente de expresar. En la Rima IV lanza su manifiesto desafiante contra el racionalismo positivista ('mientras haya un misterio para el hombre, ¡habrá poesía!'). En la Rima VII contempla el arpa dormida en el rincón oscuro del salón, aguardando la voz de la inspiración que le ordene como a Lázaro: 'Levántate y anda'.
                - Serie II (Rimas XII a XXIX - El Amor Pleno y la Comunión): El yo lírico experimenta la felicidad del amor correspondido. En la Rima XI rechaza a la mujer terrenal apasionada y a la mujer hogareña inocente para abrazar al fantasma inmaterial de niebla y luz ('no puedo amarte. —¡Oh, ven; ven tú!'). En la célebre Rima XXI proclama que la poesía no es una técnica sino la mirada misma de la amada ('Poesía... eres tú'), y en la Rima XXIII despliega la hipérbole del goce íntimo ('Por una mirada, un mundo; por una sonrisa, un cielo; por un beso... ¡yo no sé qué te diera por un beso!').
                - Serie III (Rimas XXX a LI - La Ruptura, el Rencor y el Desengaño): La dicha se desmorona por la soberbia y el orgullo mudo. En la Rima XXX rememora el instante en que ella asomó una lágrima y él ahogó una súplica de perdón, callando ambos para perderse en vidas solitarias. En la Rima XXXVIII indaga en el destino del afecto extinguido ('Dime, mujer, cuando el amor se olvida, ¿sabes tú adónde va?'). Y en la cumbre Rima LIII ('Volverán las oscuras golondrinas') confronta la ciclicidad biológica con la tragedia del alma: las golondrinas y las madreselvas renacerán en primavera, pero el amor único y sagrado con que él la adoró de rodillas no volverá jamás.
                - Serie IV (Rimas LII a LXXVI - El Vacío, la Soledad y el Olvido): Dominada por el dolor físico, el desengaño metafísico y el presagio de la tumba. En la Rima LXVI busca un sendero de rocas ensangrentadas y almas en jirones para hallar su cuna, y un páramo de nieblas sin epitafio donde habite el olvido para fijar su fosa. En la Rima LXXIII describe con lúgubre crudeza el entierro de una doncella amortajada, sellando cada estrofa con el estremecedor gemido: '¡Dios mío, qué solos se quedan los muertos!'.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Leyenda I: El monte de las ánimas (Soria, la Noche de Difuntos y el Lazo Azul)",
            detalle = """
                Durante una tarde de cacería otoñal en los campos de Soria, el joven caballero don Alonso y su altiva prima Beatriz regresan hacia la ciudad. Alonso advierte que cae la Noche de Difuntos (1 de noviembre) y que deben sortear el siniestro Monte de las Ánimas antes de que doblen las campanas. Relata la leyenda sangrienta: en la Edad Media, los caballeros templarios se degollaron mutuamente con los hidalgos castellanos por el privilegio de caza; desde entonces, cada primero de noviembre las osamentas de los monjes guerreros y los lobos resucitan envueltos en jirones mortuorios para librar una cacería infernal.

                En el calor del palacio condal, Beatriz acoge el relato con ironía burlona. Alonso le ofrece una joya de despedida, y la doncella lamenta con fría picardía haber extraviado en el monte maldito una cinta de color azul que prendía de su corpiño. Herido en su orgullo de caballero ante la sonrisa altiva de Beatriz, Alonso monta a caballo en plena medianoche y se interna en la espesura umbría para recuperar la prenda.

                Encerrada en su alcoba, Beatriz es presa del terror gótico: escucha el viento silbar en los cristales, las campanas doblando a agonía, crujidos tenebrosos, roces de ropajes en la alfombra y susurros fantasmales junto a su cama. Tiembla de espanto rezando padrenuestros hasta que la luz del alba penetra por la ventana. Sonríe creyendo haber superado una alucinación infantil, pero al abrir los ojos divisa sobre su reclinatorio el lazo azul desgarrado y empapado en sangre viva. Al entrar los sirvientes para comunicar que don Alonso ha sido encontrado despedazado por las fieras en el monte, hallan a Beatriz muerta de horror sobre su lecho con los ojos desencajados. Un cazador nocturno asegura que desde entonces los espectros templarios persiguen eternamente a la doncella en torno a su sepultura ensangrentada.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Leyenda II: Los ojos verdes (El Moncayo, la Fuente Maldita y el Abismo Acuático)",
            detalle = """
                En las faldas boscosas del Moncayo, el primogénito don Fernando de Argensola hiere a un ciervo excepcional durante una batida señorial. El animal herido busca refugio en la maleza prohibida que custodia la Fuente de los Álamos. Su viejo montero Íñigo se arroja al freno del caballo suplicándole que no cruce la linde, pues la tradición oral advierte que en ese manantial mora un espíritu demoníaco femenino que precipita a la perdición a quien ose mirarlo. Soberbio y terco, Fernando azuza a su corcel y se pierde entre los árboles.

                Con el paso de las semanas, Fernando se convierte en un ser espectral, pálido y taciturno que abandona la caza para pasar los días en solitaria contemplación junto a la fuente. Ante las preguntas angustiadas de Íñigo, el noble confiesa su secreto: en el fondo cristalino de las aguas, entre las algas movedizas, ha descubierto unos ojos verdes fosforescentes de brillo sobrenatural que lo tienen hechizado.

                En su última jornada junto al estanque, la bruma matinal se condensa y surge de las aguas el cuerpo desnudo de una bellísima doncella de cabellos de oro y pupilas color esmeralda. El espíritu le susurra palabras embriagadoras con música de viento: le declara su amor eterno, prometiéndole un reino submarino libre de amarguras si accede a unirse a ella. Embriagado de deseo e incapaz de resistir la fascinación hipnótica, Fernando se inclina sobre la orilla para besar sus labios; los brazos helados de la ondina se anudan a su cuello y lo arrastran sin piedad al abismo profundo del lago, cuyas aguas se cierran en ondas concéntricas devorando al caballero para siempre.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Leyenda III: El rayo de luna (Soria, la Obsesión Poética y el Desengaño Óptico)",
            detalle = """
                En Soria, el joven noble don Manrique vive como un ermitaño de la fantasía: detesta los banquetes cortesanos, las lides militares y el trato con doncellas reales; su vida consiste en contemplar el curso del río Duero, leer leyendas antiguas y soñar con una belleza incorpórea que colme su ideal poético.

                Una noche veraniega, mientras vaga entre los claustros góticos abandonados de los Templarios junto al río, divisa entre los troncos de los álamos una sombra blanca y flotante que se mueve con la cadencia de una falda de seda. Convencido de que al fin ha hallado a la mujer de sus delirios, Manrique se lanza en una persecución alucinada a través de las cuestas y callejones empedrados de la ciudad. La mancha nívea parece doblar esquinas, cruzar en una barca y detenerse ante el portalón de una casona noble. Manrique pasa la noche en vela aguardando ver el rostro de su adorada; al rayar el día, un escudero le informa agriamente que allí no reside ninguna noble dama, sino el médico de la villa.

                A la noche siguiente, empujado por su monomanía, Manrique regresa al paraje boscoso a orillas del Duero. La luna llena vuelve a iluminar las aguas; ve de nuevo la silueta blanca que se mece entre las hojas y se abalanza conteniendo el aliento... para descubrir con desolación demoledora que la doncella soñada no era más que un rayo de luna que se filtraba entre las copas mecidas por la brisa, iluminando el lecho vegetal del suelo. El impacto del desengaño arrasa la cordura de Manrique: sumido en una melancolía incurable, se recluye en su alcoba repitiendo con amargura su máxima existencial: la gloria, la pasión y el honor son quimeras vacías, pues todo en este mundo no es más que humo y rayo de luna.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Leyenda IV: Maese Pérez el organista (Sevilla, Nochebuena y la Melodía Sobrenatural)",
            detalle = """
                En la bulliciosa Sevilla dieciochesca, una multitud abigarrada de nobles, prelados y vecinos acude al convento de Santa Inés para celebrar la Misa del Gallo. El mayor atractivo es Maese Pérez, anciano organista ciego de setenta y seis años dotado de un don divino: bajo sus dedos trémulos, el viejo órgano conventual produce sinfonías sobrehumanas que transportan a los devotos a la presencia de Dios.

                Esa noche Maese Pérez yace postrado en cama al borde de la muerte; un organista competidor, mezquino y envidioso, acecha la tribuna para arrebatarle el puesto. No obstante, al comenzar la misa, Maese Pérez llega llevado en andas por sus feligreses, empeñado en tocar para su Señor una última vez. Durante la consagración del cáliz y la hostia, el maestro desata una plegaria armónica sublime que conmueve hasta las lágrimas a la feligresía; en el momento supremo de la elevación, un quejido áspero rompe la melodía: Maese Pérez se desploma inerte sobre el teclado.

                Al año siguiente, el organista rival ocupa la tribuna del coro; al tocar, la música resuena con prodigiosa belleza, pero el músico desciende despavorido y lívido, jurando no volver a tocar jamás ese órgano. Dos años después del fallecimiento, la hija de Maese Pérez accede con temor a interpretar la misa solemne; al iniciar el servicio, la muchacha retrocede gritando aterrada que ve la silueta fantasmal de su difunto padre sentado al banquillo acariciando las teclas invisibles. Pese a que nadie toca físicamente el instrumento y la hija llora en el suelo, los tubos del órgano resuenan solos en el templo entonando los mismos acordes sacros con que Maese Pérez consagró su alma a la eternidad.
            """.trimIndent()
        ),
        EscenaTrama(
            titulo = "Leyenda V: La ajorca de oro (Toledo, la Virgen del Sagrario y el Sacrilegio Demencial)",
            detalle = """
                En Toledo, el caballero don Pedro Alfonso se halla perdidamente enamorado de María Antúnez, una doncella de fascinante hermosura idolátrica pero de corazón vanidoso, perverso y déspota. Al encontrarla llorando amargamente, Pedro le exige saber el motivo de su pena; María le confiesa que en la misa mayor de la Asunción sus ojos codiciaron la ajorca de oro cuajada de piedras preciosas que orna el brazo de la Virgen del Sagrario, patrona venerada de la catedral de Toledo, afirmando histéricamente que morirá si no posee esa joya en su muñeca.

                Horrorizado ante la abominación sacrílega de expoliar a la Madre de Dios, Pedro se niega al principio; pero las lágrimas manipuladoras y los reproches de cobardía de María lo empujan al abismo de la perdición. En la oscuridad de la medianoche, Pedro fuerza una poterna y penetra clandestinamente en la colosal catedral toledana.

                El silencio sepulcral, el viento azotando las vidrieras góticas y las sombras agigantadas de las columnas siembran el pánico en su ánimo. Sube con pasos trémulos al altar mayor de la Virgen del Sagrario, cierra los ojos para no contemplar la efigie y arranca de un tirón la ajorca dorada. Al abrirlos para contemplar el tesoro, contempla una visión dantesca que hiela su sangre: las estatuas de piedra de apóstoles, reyes, arzobispos, caballeros y monstruos han descendido de sus pedestales y nichos góticos, rodeando el presbiterio y clavando sus cuencas de piedra vacías en el ladrón sacrílego mientras avanzan hacia él. Al amanecer, los sacerdotes hallan a Pedro Alfonso revolcándose convulso en el pavimento, privado de la razón para siempre, apretando la ajorca contra su pecho ensangrentado y gritando a carcajadas dementes: '¡Suya, suya!'.
            """.trimIndent()
        )
    ),
    temaPrincipal = "La búsqueda angustiosa e imposible del ideal absoluto (en la poesía, el amor y la trascendencia mística), el desengaño frente a la contingencia terrenal y el castigo fatal ante la transgresión sacrílega y la obsesión idolátrica.",
    simbolosClave = listOf(
        "El arpa dormida en el ángulo oscuro (Rima VII): Símbolo del genio creador, la potencia poética latente en el espíritu y la necesidad de una chispa iniciática que rompa el silencio sepulcral.",
        "Las oscuras golondrinas (Rima LIII): Alegoría de la transitoriedad temporal; contrasta la renovación cíclica de la naturaleza material con la irrepetibilidad trágica del amor humano desvanecido.",
        "El lazo azul ensangrentado ('El monte de las ánimas'): Representa el capricho egoísta y destructivo de la belleza femenina frívola, coronado por la culpa y el pavor que culminan en la muerte.",
        "Los ojos verdes de la fuente: Símbolo de la atracción fatal del misterio y la muerte bajo la apariencia de una fascinación erótica y celestial inalcanzable.",
        "El rayo de luna: Metáfora culminante del engaño de los sentidos y la quimera poética; la belleza ideal adorada por el romántico es solo una ilusión óptica intangible proyectada por el alma solitaria.",
        "El órgano que suena solo ('Maese Pérez'): Encarna la inmortalidad del arte verdadero y sagrado, cuya armonía celestial triunfa sobre la descomposición física y la muerte terrena.",
        "La ajorca de oro: Símbolo de la ambición sacrílega y el pecado de idolatría terrenal que arrebata lo sagrado para alimentar la vanidad mundana, provocando la locura eterna."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cómo se originó el manuscrito de las Rimas de Bécquer y en qué circunstancias vio la luz la primera edición del libro?",
            respuesta = "El manuscrito original autógrafo que Bécquer entregó al ministro González Bravo desapareció durante el saqueo de su palacio en la Revolución de 1868 ('La Gloriosa'). Bécquer lo reescribió pacientemente de memoria en un cuaderno escolar titulado 'Libro de los gorriones'. Tras su fallecimiento en 1870 a los 34 años, sus amigos íntimos costearon y ordenaron la primera edición póstuma en dos volúmenes en 1871 para ayudar económicamente a su viuda e hijos huérfanos."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué tesis fundamental sobre la naturaleza de la poesía sostiene Bécquer en la Rima IV ('No digáis que agotado su tesoro...')?",
            respuesta = "Bécquer defiende la inmortalidad e inmanencia de la poesía frente al utilitarismo cientificista y positivista: la poesía preexiste a los poetas y al lenguaje humano, y existirá eternamente mientras perdure el misterio del universo, el sentimiento amoroso, la pugna entre la razón y el corazón, o una lágrima humana que consolar."
        ),
        PreguntaClaveObra(
            pregunta = "¿De qué manera fallece la altiva Beatriz en la leyenda 'El monte de las ánimas'?",
            respuesta = "Beatriz no es asesinada materialmente por los espectros templarios ni por los lobos; fallece de puro espanto y terror psicológico en su propio lecho al rayar el alba, al descubrir sobre su reclinatorio el lazo azul de su corpiño desgarrado y empapado en sangre fresca que Alonso había ido a rescatar al monte."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué descubre don Manrique al final de su febril persecución en la leyenda 'El rayo de luna'?",
            respuesta = "Descubre que la misteriosa dama etérea vestida de blanco a la que persiguió con delirio amoroso por las riberas del Duero y las calles de Soria no era un ser humano ni un fantasma, sino una simple ilusión óptica producida por un rayo de luna filtrándose a través de las ramas de los álamos movidas por la brisa nocturna."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cuáles son las características métricas y formales que singularizan a las Rimas frente al Romanticismo anterior?",
            respuesta = "Bécquer rechaza la rima consonante altisonante y la grandilocuencia oratoria de Espronceda; opta por una lírica intimista de influencia germánica (Heine), basada en la rima asonante en los versos pares (dejando libres los impares) y la combinación flexible de endecasílabos solemnes y heptasílabos ágiles (silva arromanzada), creando una musicalidad leve, aérea y sugerente."
        )
    )
)
