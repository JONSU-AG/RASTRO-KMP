package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra02Odisea = ObraLiteraria(
    id = "la-odisea",
    titulo = "La Odisea",
    autor = "Homero",
    anio = "Siglo VIII a.C.",
    pais = "Grecia Antigua",
    genero = "Épico",
    especie = "Epopeya",
    corriente = "Clasicismo Griego",
    temaPrincipal = "El nostos (retorno anhelado al hogar) y la recuperación de la identidad, el honor soberano y la paz en Ítaca mediante la inteligencia astuta (mêtis), la paciencia heroica y la fidelidad conyugal frente a la soberbia transgresora de los pretendientes.",
    colorHex = "#1E40AF",
    categoria = "Literatura Universal",
    sinopsis = """La Odisea relata el penoso y azaroso viaje de retorno a su patria de Odiseo (Ulises), rey de Ítaca, tras combatir diez años en la Guerra de Troya y padecer otros diez años de errancia por mares fabulosos (veinte años de ausencia total). Mientras tanto, en Ítaca, el palacio real se encuentra ocupado por más de un centenar de nobles pretendientes que dilapidan los bienes de la hacienda y presionan a la reina Penélope para contraer matrimonio dando por muerto a su esposo. Penélope logra contenerlos durante más de tres años mediante el célebre ardid del sudario de Laertes, tejiendo de día y destejiendo de noche a la luz de las antorchas, hasta ser delatada por una esclava. Su hijo Telémaco, exhortado por la diosa Atenea, convoca una asamblea popular y zarpa rumbo a Pilos y Esparta en busca de noticias sobre su padre, iniciando su proceso de maduración civil y heroica (la Telemaquia).

Entre tanto, Odiseo permanece retenido en la remota isla de Ogigia por la ninfa Calipso, quien le ofrece infructuosamente la inmortalidad a cambio de su amor. Por orden de Zeus transmitida por Hermes, Calipso le permite construir una balsa de madera y zarpar. No obstante, el dios marino Poseidón —quien odia a Odiseo con furia implacable por haber cegado a su hijo el cíclope Polifemo— desata una tempestad colosal que despedaza la balsa. Odiseo sobrevive a nado y llega exhausto a las costas de Esqueria, el país de los feacios, donde es socorrido por la princesa Nausícaa y recibido con hospitalidad por los reyes Alcínoo y Arete. En el banquete real, conmovido por los cantos del aedo Demódoco sobre Troya, Odiseo revela su verdadera identidad y narra en primera persona su largo periplo de aventuras: el letargo de los comedores de loto; el encierro en la caverna del cíclope Polifemo, a quien embriagó y quemó el único ojo con una estaca al rojo vivo proclamando llamarse 'Nadie'; la desgracia de los vientos de Eolo liberados por la codicia de sus marineros; la masacre de once de sus doce naves a manos de los gigantes lestrigones; el año de estancia en la isla de la hechicera Circe, quien convirtió a sus hombres en cerdos hasta ser sometida gracias a la hierba mágica moly provista por Hermes; el pavoroso descenso al Hades (la Nekuia) para consultar al adivino ciego Tiresias y encontrarse con las sombras de su madre Anticlea, Agamenón y Aquiles; el paso amarrado al mástil frente al canto mortal de las Sirenas; la navegación angustiosa entre el remolino de Caribdis y las seis cabezas voraces del monstruo Escila; y el naufragio final desatado por Zeus tras devorar sus marineros las vacas sagradas del dios Sol en Trinacia.

Conmovidos por sus padecimientos, los generosos feacios transportan a Odiseo dormido hasta las playas de Ítaca colmado de riquezas. Para protegerlo de los pretendientes, Atenea lo transforma con su vara mágica en un mendigo andrajoso y anciano. Odiseo busca refugio en la choza del leal porquerizo Eumeo, donde se reúne con su hijo Telémaco y, tras revelarle su identidad entre lágrimas, conciertan un plan minucioso de retribución. Ya en el palacio, Odiseo soporta en silencio los ultrajes, golpes y burlas de los pretendientes; es reconocido en el patio por su viejo perro de cacería Argos antes de morir, y por su anciana nodriza Euriclea al palpar durante el baño la cicatriz de juventud dejada por un jabalí en el monte Parnaso. Penélope convoca la prueba decisiva: desposará a quien sea capaz de tensar el formidable arco de Odiseo y hacer cruzar una flecha por los orificios alineados de doce hachas. Fracasados todos los pretendientes, el mendigo toma el arco, lo tensa con la maestría de un músico pulsando una lira y dispara con precisión milimétrica. Acto seguido, Odiseo se despoja de los harapos y, secundado por Telémaco, Eumeo y Filetio, y amparado por el destello de la égida de Atenea, desata una matanza implacable sobre todos los pretendientes (Mnesterofonía), ajusticiando también a las esclavas traidoras.

Tras la carnicería, Penélope somete a Odiseo a una prueba psicológica secreta e íntima: ordena sacar su lecho fuera de la alcoba. La indignada réplica de Odiseo —revelando que el lecho es inamovible porque él mismo lo construyó tallándolo sobre el tronco vivo y enraizado de un añoso olivo que sirve de cimiento a la cámara— convence a la reina de su identidad, fundiéndose ambos en un emotivo llanto conyugal. Finalmente, tras visitar a su anciano padre Laertes en el campo y sofocar el conato de guerra civil con los parientes de los pretendientes gracias a la intervención pacificadora de Atenea y Zeus, se restauran para siempre la concordia, el honor y la justicia en Ítaca.""",
    contextoHistorico = """La Odisea es atribuida a Homero y datada en el siglo VIII a.C., compuesta con posterioridad a la Ilíada. Refleja la era de la colonización y expansión marítima griega por el mar Mediterráneo tras la superación de los 'Siglos Oscuros', donde la audacia exploradora, el comercio náutico y la inventiva técnica se integran en el imaginario mítico.

Frente al paradigma de la Ilíada —dominado por la fuerza física pura, la cólera destructiva (bíe) y la muerte trágica en batalla—, la Odisea exalta el triunfo de la mente humana, la astucia reflexiva (mêtis), el autocontrol paciente ante la adversidad y la defensa de las instituciones civiles. Central en este horizonte es la ley sagrada de la hospitalidad (xenía), mandato cósmico vigilado por Zeus Xenios cuyo quebrantamiento acarrea el castigo divino (némesis), principio ético medular evaluado en los exámenes de admisión UNSA.""",
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "1. La Telemaquia y la Crisis Doméstica en Ítaca (Cantos I al IV)",
            detalle = "Atenea obtiene de Zeus la liberación de Odiseo en el Olimpo y baja a Ítaca bajo la figura de Mentes. Inspira a Telémaco a convocar la asamblea contra los 108 pretendientes que devoran su hacienda. Antínoo revela el engaño del sudario de Laertes tejido de día y destejido de noche por Penélope. Telémaco viaja a Pilos y Esparta; Néstor y Menelao confirman que Odiseo sigue con vida en la isla de Calipso, mientras los pretendientes tienden una emboscada marina a su regreso."
        ),
        EscenaTrama(
            titulo = "2. La Isla de Calipso y la Llegada al País Feacio (Cantos V al VIII)",
            detalle = "Hermes vuela a Ogigia y ordena a Calipso dejar marchar a Odiseo. El héroe rechaza la inmortalidad, fabrica una balsa y zarpa. Poseidón destruye su embarcación con una feroz tempestad; Leucótea le auxilia con un velo salvador y Odiseo arriba exhausto a Esqueria. La princesa Nausícaa lo socorre tras lavar ropa en el río y lo orienta al palacio de sus padres, los reyes Alcínoo y Arete, donde es acogido con reverencia y rompe a llorar al oír los cantos épicos del aedo Demódoco."
        ),
        EscenaTrama(
            titulo = "3. Los Lotófagos y la Ceguera del Cíclope Polifemo (Canto IX)",
            detalle = "Odiseo revela su nombre e inicia la narración retrospectiva. Relata cómo arrancó a sus marineros del olvido placentero del loto. Describe la entrada a la cueva del cíclope Polifemo, hijo de Poseidón, quien devora a seis marineros. Odiseo lo embriaga con vino de Marón, afirma llamarse 'Nadie' (Oûtis) y le revienta el ojo con una estaca al rojo vivo. Al huir bajo el vientre de los carneros, la hibris vence a Odiseo: revela su verdadero nombre y Polifemo implora a Poseidón que impida su regreso o destruya a todos sus hombres."
        ),
        EscenaTrama(
            titulo = "4. El Odre de Eolo, los Lestrigones y la Hechicera Circe (Canto X)",
            detalle = "Eolo encierra los vientos adversos en un odre de cuero; cerca de Ítaca, los marineros lo abren creyendo que contiene tesoros y el torbellino los devuelve a alta mar. Los gigantes caníbales lestrigones hunden once de sus doce naves. Arriban a la isla de Eea, donde Circe transforma a la mitad de la tripulación en cerdos; Odiseo la neutraliza consumiendo la hierba protectora moly entregada por Hermes, logrando devolver la figura humana a sus hombres y conviviendo con ella durante un año."
        ),
        EscenaTrama(
            titulo = "5. La Bajada a los Infiernos o Nekuia (Canto XI)",
            detalle = "Siguiendo el mandato de Circe, Odiseo viaja al confín occidental y realiza libaciones de sangre en una fosa para invocar a las sombras. El adivino ciego Tiresias le profetiza su retorno solitario y le advierte no tocar las vacas sagradas de Helios en Trinacia. Odiseo dialoga con su difunta madre Anticlea, con Agamenón (quien previene sobre la traición conyugal) y con Aquiles, quien confiesa que prefiere ser el siervo más humilde en la tierra antes que reinar sobre todos los muertos en el Hades."
        ),
        EscenaTrama(
            titulo = "6. Las Sirenas, Escila, Caribdis y las Vacas de Helios (Canto XII)",
            detalle = "Odiseo escucha el canto embriagador de las Sirenas atado al mástil mientras sus marineros reman con oídos tapados con cera. Cruza el estrecho marino sacrificando a seis hombres devorados por las fauces de Escila para eludir el remolino de Caribdis. En Trinacia, sus marineros hambrientos sacrifican las vacas sagradas del Sol; Helios reclama venganza y Zeus parte la nave con un rayo, ahogándose todos excepto Odiseo, quien flota nueve días en un madero hasta llegar a Ogigia."
        ),
        EscenaTrama(
            titulo = "7. El Retorno Oculto a Ítaca y el Reencuentro Filial (Cantos XIII al XVI)",
            detalle = "Los feacios trasladan a Odiseo dormido a Ítaca con cuantiosos tesoros. Atenea lo cubre con una niebla, disimula su figura convirtiéndolo en un anciano mendigo y lo envía a la cabaña del leal porquerizo Eumeo. Telémaco regresa sorteando la emboscada gracias a Atenea y acude a la choza; a solas, Odiseo recupera su porte majestuoso y ambos se funden en un llanto incontenible trazando la estrategia para abatir a los invasores de su casa."
        ),
        EscenaTrama(
            titulo = "8. El Reconocimiento del Perro Argos y la Nodriza Euriclea (Cantos XVII al XX)",
            detalle = "Odiseo entra al palacio como mendigo; en el estercolero, su leal perro Argos lo reconoce y muere en paz. El pretendiente Antínoo le arroja un taburete de madera a la espalda pero Odiseo resiste inmóvil. Derriba de un puñetazo al mendigo pendenciero Iro. Por la noche, mientras lava los pies del huésped, la nodriza Euriclea reconoce la cicatriz del muslo causada por un jabalí blanco en el monte Parnaso; Odiseo le exige guardar absoluto silencio para garantizar el éxito del plan."
        ),
        EscenaTrama(
            titulo = "9. La Prueba del Arco y la Venganza Implacable (Cantos XXI y XXII)",
            detalle = "Penélope reta a los pretendientes a tensar el arco de Odiseo y pasar la flecha por doce hachas. Todos fracasan humillados. El mendigo solicita el arco, lo tensa con infinita facilidad cual virtuoso tocando la lira y clava el tiro perfecto. Revela su identidad y desata la Mnesterofonía: flecha en la garganta a Antínoo, mata a Eurímaco y, secundado por Telémaco, Eumeo y Filetio bajo el auxilio de la égida de Atenea, extermina a los pretendientes y ejecuta a las esclavas desleales."
        ),
        EscenaTrama(
            titulo = "10. El Secreto del Lecho de Olivo y la Concordia Definitiva (Cantos XXIII y XXIV)",
            detalle = "Penélope prueba a Odiseo ordenando trasladar la cama matrimonial fuera de la cámara; Odiseo reacciona con cólera detallando que él mismo labró el lecho en el tronco vivo de un olivo enraizado en la tierra. Penélope rompe en llanto y lo abraza. Odiseo visita en el campo a su anciano padre Laertes. Cuando los familiares de los pretendientes avanzan armados clamando venganza, Atenea y un rayo de Zeus intervienen para sellar la paz perpetua y la reconciliación comunal en Ítaca."
        )
    ),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Odiseo (Ulises)",
            rol = "Rey de Ítaca y protagonista absoluto",
            descripcion = "Héroe caracterizado por su ingenio polifacético (polytropos), oratoria elocuente y resistencia moral y física. Rechaza la inmortalidad divina para recuperar a su esposa, a su hijo y a su patria terrenal."
        ),
        PersonajeLiterario(
            nombre = "Penélope (La prudente)",
            rol = "Reina de Ítaca y esposa de Odiseo",
            descripcion = "Encarna la fidelidad conyugal inquebrantable y la sagacidad defensiva. Contiene a los pretendientes durante tres años con el tejido nocturno del sudario de Laertes y somete a Odiseo a la prueba del lecho nupcial."
        ),
        PersonajeLiterario(
            nombre = "Telémaco",
            rol = "Príncipe de Ítaca e hijo de Odiseo",
            descripcion = "Joven que experimenta una evolución ética y maduración personal (Telemaquia), desafiando a los pretendientes en la asamblea, buscando a su padre en Pilos y Esparta y combatiendo valerosamente a su lado."
        ),
        PersonajeLiterario(
            nombre = "Atenea (La de ojos de lechuza)",
            rol = "Diosa protectora de la inteligencia y mentora de Odiseo",
            descripcion = "Intercede ante Zeus, guía y cuida a Telémaco bajo la apariencia de Mentor, disfraza a Odiseo de mendigo y despliega su égida en la batalla final para restaurar la justicia y la paz."
        ),
        PersonajeLiterario(
            nombre = "Poseidón",
            rol = "Dios de los mares y antagonista divino",
            descripcion = "Enemigo implacable de Odiseo motivado por la ceguera infligida a su hijo Polifemo. Persigue al héroe con tempestades devastadoras obstaculizando su retorno a Ítaca durante diez años."
        ),
        PersonajeLiterario(
            nombre = "Polifemo",
            rol = "Cíclope gigante antropófago hijo de Poseidón",
            descripcion = "Pastor salvaje de un solo ojo que transgrede la ley de la hospitalidad devorando marineros en su cueva. Es burlado con el ingenio de 'Nadie' y cegado con una estaca al rojo vivo por Odiseo."
        ),
        PersonajeLiterario(
            nombre = "Circe",
            rol = "Hechicera de la isla de Eea",
            descripcion = "Hija del Sol que transforma a los forasteros en bestias con pociones mágicas. Tras ser vencida por Odiseo gracias a la planta moly, se convierte en su aliada instruyéndolo sobre el Hades, las Sirenas y Escila."
        ),
        PersonajeLiterario(
            nombre = "Calipso",
            rol = "Ninfa de la isla de Ogigia",
            descripcion = "Retiene a Odiseo durante siete años ofreciéndole vanamente juventud eterna e inmortalidad, hasta que acata la orden de Zeus transmitida por Hermes y ayuda al héroe a construir su balsa de retorno."
        ),
        PersonajeLiterario(
            nombre = "Eumeo",
            rol = "Porquerizo mayor de Ítaca",
            descripcion = "Siervo fiel de origen noble que ejemplifica la hospitalidad pastoral pura y la lealtad incondicional, acogiendo al mendigo sin conocer su identidad y empuñando las armas en la venganza."
        ),
        PersonajeLiterario(
            nombre = "Euriclea",
            rol = "Anciana nodriza de Odiseo",
            descripcion = "Custodia leal de los aposentos y guardiana de la memoria familiar; descubre la identidad del rey al lavarle los pies y palpar la cicatriz de la herida del jabalí en su muslo."
        ),
        PersonajeLiterario(
            nombre = "Antínoo",
            rol = "Líder principal y más soberbio de los pretendientes",
            descripcion = "Instiga el complot para emboscar y degollar a Telémaco, humilla físicamente al mendigo arrojándole un taburete y es el primero en morir atravesado por una saeta en la garganta."
        ),
        PersonajeLiterario(
            nombre = "Argos",
            rol = "Perro fiel de cacería de Odiseo",
            descripcion = "Símbolo de la lealtad que trasciende el tiempo y el deterioro físico; tras veinte años de espera en un estercolero, reconoce la voz y el porte de su amo y muere pacíficamente."
        )
    ),
    simbolosClave = listOf(
        "El Telar de Penélope: La resistencia paciente, la inteligencia femenina defensiva y la dilatación temporal frente a la usurpación y la fuerza bruta.",
        "El Gran Arco de Odiseo: Símbolo de soberanía legítima, templanza moral y virilidad regia; solo el rey verdadero posee la capacidad de tensarlo.",
        "El Lecho de Olivo Enraizado: Fidelidad conyugal indisoluble, sacralidad del matrimonio y estabilidad cívica arraigada en la naturaleza viva de la tierra.",
        "El Perro Argos: La fidelidad pura e incorruptible que reconoce la esencia del amo a pesar de dos décadas de abandono y del disfraz de mendigo.",
        "El Nombre 'Nadie' (Oûtis): Triunfo de la mente astuta (mêtis) sobre la fuerza ciega y salvaje de la barbarie (bíe)."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Quién es el primero en reconocer a Odiseo al llegar a su palacio en Ítaca?",
            respuesta = "Su viejo y leal perro de cacería Argos, quien tirado sobre un estercolero reconoce su voz y mueve las orejas antes de morir en paz. Entre los humanos, la primera en reconocerlo es la nodriza Euriclea al palpar su cicatriz."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién narra las aventuras fantásticas (Polifemo, las Sirenas, Circe, el Hades) en la Odisea?",
            respuesta = "Las relata el propio Odiseo en primera persona mediante un extenso relato retrospectivo (flashback) ante la corte de los reyes Alcínoo y Arete en el país de los feacios (Cantos IX al XII)."
        ),
        PreguntaClaveObra(
            pregunta = "¿Mediante qué prueba secreta Penélope comprueba la verdadera identidad de Odiseo?",
            respuesta = "Ordena a la nodriza sacar el lecho conyugal fuera de la alcoba; la furiosa objeción de Odiseo revelando que él mismo talló la cama en el tronco vivo de un olivo enraizado en la tierra demuestra que es su esposo, pues ningún otro mortal conocía ese secreto."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué motivo el dios Poseidón persigue con odio implacable a Odiseo durante su travesía?",
            respuesta = "Porque Odiseo embriagó y quemó con una estaca al rojo vivo el único ojo de su hijo, el cíclope gigante Polifemo, quien luego maldijo al héroe invocando el castigo de su padre divino."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué temática y cantos comprende la denominada Telemaquia?",
            respuesta = "Comprende los Cantos I al IV, y describe la crisis política en Ítaca y el viaje de maduración e iniciación que emprende Telémaco a Pilos y Esparta en busca de noticias sobre su padre."
        )
    )
)
