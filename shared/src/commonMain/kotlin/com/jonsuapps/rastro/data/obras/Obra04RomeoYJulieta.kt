package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra04RomeoYJulieta = ObraLiteraria(
    id = "romeo-y-julieta",
    titulo = "Romeo y Julieta",
    autor = "William Shakespeare",
    anio = "1597",
    pais = "Inglaterra (ambientada en Verona, Italia)",
    genero = "Dramático",
    especie = "Tragedia",
    corriente = "Renacimiento Isabelino",
    temaPrincipal = "El amor juvenil absoluto y desbordante que desafía el odio ancestral entre linajes rivales, quebrado por la celeridad trágica del tiempo, la fatalidad cósmica y las presiones patriarcales, cuya muerte sacrificial restaura la paz civil de Verona.",
    colorHex = "#BE123C",
    categoria = "Literatura Universal",
    sinopsis = """En la Verona renacentista, una enconada y sangrienta enemistad enfrenta a las dos familias más poderosas de la nobleza local: los Montesco y los Capuleto. Tras una violenta reyerta callejera iniciada por los criados que altera la paz cívica, el Príncipe Escala impone pena de muerte a quien vuelva a ensangrentar la ciudad. Romeo, heredero de los Montesco, vaga melancólico consumido por un amor platónico no correspondido hacia una doncella llamada Rosalina. Para distraer su ánimo, sus amigos Benvolio y Mercucio lo convencen de asistir enmascarados a un suntuoso baile en el palacio de los Capuleto. Allí, Romeo divisa a la joven Julieta, hija única del patriarca Capuleto, y experimenta una transfiguración fulminante: olvida al instante a Rosalina ante el resplandor de la doncella. Tras un devoto diálogo lírico pautado en la forma de un soneto perfecto, sellan su mutuo flechazo con un beso, descubriendo poco después con estupor que pertenecen a los linajes enemigos jurados.

Esa misma noche, Romeo burla a sus camaradas, salta la tapia del jardín y escucha a Julieta confesar su amor desde el balcón cuestionando la tiranía de los nombres de familia. Ambos se juran lealtad eterna y pactan contraer matrimonio en secreto. Al alba, Fray Lorenzo accede a consagrar la unión en su celda con la esperanza teológica y cívica de transformar el rencor secular de ambas casas en concordia ciudadana. Apenas consumada la boda clandestina, la fatalidad irrumpe en las plazas veronesas: Teobaldo, primo agresivo de Julieta apodado el 'Príncipe de los Gatos', busca a Romeo para batirse a duelo; Romeo, considerándolo ahora de su propia sangre, rehúye el combate y responde con mansedumbre. Mercucio, indignado ante lo que juzga una deshonrosa sumisión, desenvaina su acero contra Teobaldo. Romeo se interpone físicamente para separarlos, ocasión que aprovecha Teobaldo para herir a traición a Mercucio por debajo del brazo de Romeo. Al expirar maldiciendo a ambas familias, la culpa impele a Romeo a batirse a muerte con Teobaldo, abatiéndolo de una estocada certera. El Príncipe conmuta la condena capital de Romeo por el destierro perpetuo a Mantua.

Tras una angustiosa y fugaz noche de bodas consumada al amparo de las sombras, Romeo huye hacia el exilio al despuntar el alba. Paralelamente, Lord Capuleto, ignorante del sacramento matrimonial de su hija, acuerda despóticamente casar a Julieta con el acaudalado Conde Paris amenazándola con desheredarla y arrojarla a la mendicidad si se niega. Desesperada y rechazada incluso por su nodriza que le aconseja la bigamia pragmática, Julieta acude a Fray Lorenzo dispuesta al suicidio. El fraile diseña un ardid arriesgado: le entrega un bebedizo capaz de inducir una rigidez cataléptica de cuarenta y dos horas; la joven será sepultada en el panteón familiar como si hubiera fallecido, mientras un mensajero franciscano avisará a Romeo en Mantua para que acuda a desenterrarla y huir juntos. Julieta ingiere la poción sola en su lecho y su cortejo nupcial se transmuta en funeral.

No obstante, los mecanismos del destino quiebran el plan: Fray Juan, portador de la carta para Romeo, queda recluido en cuarentena por sospecha de peste bubónica, impidiendo la entrega del mensaje. Al enterarse por su criado Baltasar de que Julieta yace en la tumba familiar, Romeo compra un veneno instantáneo a un mísero boticario y galopa enloquecido hacia Verona. En el cementerio, sorprende al Conde Paris que orna la tumba con flores; ambos combaten en las sombras y Paris muere atravesado. Dentro de la cripta, conmovido por la lozanía que la muerte aún no ha borrado del semblante de Julieta, Romeo bebe el veneno, besa a su esposa y expira al pie del féretro. Segundos después, Julieta despierta del letargo; al descubrir el frasco vacío y comprobar que los labios de Romeo están aún calientes, rechaza huir con Fray Lorenzo, toma la daga de su esposo y se la clava en el pecho. Los cadáveres congregados de los amantes, de Paris y la noticia de la muerte por dolor de la madre de Romeo congregan al Príncipe y a las familias rivales, quienes abrumados por la culpa entierran su enemistad y pactan erigir sendas estatuas de oro macizo en memoria del sacrificio inmortal de sus hijos.""",
    contextoHistorico = """Compuesta hacia 1595-1597, Romeo y Julieta representa la cumbre lírica de la etapa juvenil de William Shakespeare durante el Renacimiento Isabelino. La obra toma como base argumental el poema narrativo The Tragical History of Romeus and Juliet (1562) de Arthur Brooke, inspirado a su vez en novelle italianas de Mateo Bandello y Luigi da Porto.

La genial innovación dramatúrgica de Shakespeare consistió en condensar radicalmente la temporalidad de la acción: de los nueve meses que duraba el relato de Brooke, la tragedia shakespeariana se precipita vertiginosamente en menos de cinco días (desde la mañana del domingo hasta el amanecer del viernes). Asimismo, introduce una audaz hibridación genérica, comenzando con el repertorio cómico, bufonesco y petrarquista de una comedia de enredos amorosos, la cual se fractura de forma irrevocable hacia la tragedia más sombría con la muerte de Mercucio en el Acto III, convirtiendo a la obra en el canon universal del amor romántico confrontado al odio social.""",
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "1. Acto I: El Odio de los Clanes y el Flechazo en el Baile de Máscaras",
            detalle = "Criados de Capuleto y Montesco desatan una pelea callejera mordiéndose el pulgar; Benvolio intenta mediar pero Teobaldo azuza la espada. El Príncipe Escala decreta pena de muerte si se perturba de nuevo la paz. Romeo languidece por el desdén de Rosalina; Benvolio y Mercucio lo convencen de entrar disfrazados al banquete de Capuleto. Al contemplar a Julieta bailando, Romeo queda deslumbrado; dialogan mediante un soneto perfecto y sellan su amor con un beso antes de descubrir que pertenecen a casas enemigas juradas."
        ),
        EscenaTrama(
            titulo = "2. Acto II: El Balcón de Julieta y el Enlace Clandestino",
            detalle = "Romeo elude a sus compañeros y penetra en el huerto de Capuleto. Julieta pronuncia en la ventana su célebre soliloquio cuestionando la legitimidad del nombre y del linaje. Romeo responde y ambos juran contraer nupcias al día siguiente. Al alba, Fray Lorenzo accede a consagrar el matrimonio en su celda buscando unir a las dos familias rivales en concordia cívica. Por la tarde, asistidos por el Ama y una escala de cuerdas, los amantes son desposados en secreto."
        ),
        EscenaTrama(
            titulo = "3. Acto III: La Muerte de Mercucio, la Venganza y el Destierro",
            detalle = "Teobaldo intercepta a Romeo en la plaza; este rehúye batirse por saberlo pariente secreto. Mercucio asume el duelo ofendido por la sumisión; Romeo intenta separarlos físicamente y Teobaldo atraviesa a Mercucio bajo su brazo. Mercucio muere maldiciendo a ambas casas. Desesperado por la culpa, Romeo mata a Teobaldo en duelo singular y es castigado con el destierro por el Príncipe. Tras una angustiosa noche de bodas, Romeo parte a Mantua y Lord Capuleto ordena despóticamente a Julieta casarse con Paris."
        ),
        EscenaTrama(
            titulo = "4. Acto IV: La Desesperación de Julieta y la Poción Cataléptica",
            detalle = "Repudiada por su padre y traicionada por el Ama que le aconseja la bigamia con Paris, Julieta acude a la celda de Fray Lorenzo dispuesta a clavarse un puñal. El fraile le entrega una pócima para inducir un trance cataléptico de 42 horas fingiendo su muerte, mientras planea avisar a Romeo para rescatarla. Julieta finge sumisión y su padre adelanta la boda al miércoles. Sola en su aposento, venciendo sus terrores a despertar viva en la cripta entre cadáveres putrefactos, Julieta bebe el licor y es hallada inerte al amanecer."
        ),
        EscenaTrama(
            titulo = "5. Acto V: El Retraso Fatal por la Peste y la Tragedia en la Cripta",
            detalle = "Fray Juan es retenido en cuarentena por sospecha de peste y no entrega la carta a Romeo. Baltasar llega a Mantua con la noticia falsa del entierro de Julieta. Romeo compra veneno letal a un mísero boticario y viaja a Verona. En el cementerio bate a muerte al Conde Paris e ingresa a la cripta; maravillado de ver a Julieta aún hermosa, bebe el veneno y expira besándola. Julieta despierta, halla el cadáver de su esposo y se clava la daga de Romeo en el pecho antes de la llegada de la ronda."
        ),
        EscenaTrama(
            titulo = "6. Desenlace: El Juicio del Príncipe y la Reconciliación en Oro",
            detalle = "Fray Lorenzo relata la verdad íntegra ante el Príncipe, los Capuleto y Lord Montesco (cuya esposa murió de pena por el exilio de Romeo). El Príncipe reprende la ceguera del odio que ha asesinado a sus propios hijos y deudos. Capuleto y Montesco estrechan sus manos arrepentidos, acordando erigir sendas estatuas de oro macizo en Verona para inmortalizar la memoria de Julieta y su Romeo."
        )
    ),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Romeo Montesco",
            rol = "Protagonista y heredero del clan Montesco",
            descripcion = "Joven apasionado, melancólico e impetuoso. Su encuentro con Julieta transforma su afecto retórico en devoción absoluta; su tragedia reside en la precipitación y la fatalidad temporal, quitándose la vida con veneno en la cripta."
        ),
        PersonajeLiterario(
            nombre = "Julieta Capuleto",
            rol = "Protagonista y heredera del clan Capuleto",
            descripcion = "Doncella de casi catorce años que madura con extraordinaria lucidez y valor heroico, proponiendo las nupcias clandestinas, ingiriendo la arriesgada poción cataléptica y clavándose la daga de Romeo al hallarlo muerto."
        ),
        PersonajeLiterario(
            nombre = "Fray Lorenzo",
            rol = "Monje franciscano y confesor de los amantes",
            descripcion = "Sabio humanista y boticario. Casa a los jóvenes creyendo sellar la paz cívica de Verona e idea el fallido ardid de la poción cataléptica, encarnando la advertencia de que los placeres violentos tienen finales violentos."
        ),
        PersonajeLiterario(
            nombre = "Mercucio",
            rol = "Pariente del Príncipe y amigo íntimo de Romeo",
            descripcion = "Personaje brillante, mordaz y escéptico ante el sentimentalismo cortesano (autor del monólogo de la reina Mab). Muere herido a traición por Teobaldo bajo el brazo de Romeo, maldiciendo a ambas familias rivales."
        ),
        PersonajeLiterario(
            nombre = "Teobaldo Capuleto",
            rol = "Primo de Julieta y antagonista violento",
            descripcion = "Apodado el 'Príncipe de los Gatos' por su destreza esgrimística. Encarna el odio tribal fanático y la intransigencia belicista; mata a Mercucio y muere atravesado por la espada de Romeo."
        ),
        PersonajeLiterario(
            nombre = "Lord Capuleto",
            rol = "Patriarca autoritario de la familia Capuleto",
            descripcion = "Padre despótico y colérico. Al ser desobedecido por Julieta frente al matrimonio con Paris, estalla en amenazas tiránicas; al final depone su odio y ofrece erigir una estatua de oro a Romeo."
        ),
        PersonajeLiterario(
            nombre = "El Ama (Nodriza)",
            rol = "Criada y confidente íntima de Julieta",
            descripcion = "Figura popular de lenguaje campechano y pragmatismo biológico. Facilita los encuentros iniciales de los amantes, pero traiciona la fe moral de Julieta al aconsejarle casarse con Paris tras el destierro de Romeo."
        ),
        PersonajeLiterario(
            nombre = "Conde Paris",
            rol = "Noble veronés y pretendiente de Julieta",
            descripcion = "Pariente del Príncipe y pretendiente formal respaldado por Capuleto. Ama genuinamente a Julieta según los códigos cortesanos y muere abatido por Romeo al defender su sepultura en el camposanto."
        ),
        PersonajeLiterario(
            nombre = "Benvolio Montesco",
            rol = "Primo de Romeo y mediador pacífico",
            descripcion = "Representa la buena voluntad, sensatez y templanza reflexiva, procurando sofocar los duelos callejeros y relatando los hechos con estricta ecuanimidad judicial ante el soberano."
        ),
        PersonajeLiterario(
            nombre = "Príncipe Escala",
            rol = "Soberano de Verona y garante del orden",
            descripcion = "Encarna la ley cívica imparcial. Castiga los altercados conminando al destierro a Romeo y sentencia en el epílogo el castigo colectivo sufrido por la ceguera del odio aristocrático."
        )
    ),
    simbolosClave = listOf(
        "Luz y Oscuridad: Inversión simbólica donde la luz solar diurna es el territorio hostil del odio, la violencia y la intolerancia, mientras la noche es el santuario lírico del amor, la libertad y la trascendencia.",
        "El Veneno y la Daga: Armas de consumación fúnebre mediante las cuales Romeo y Julieta sellan su pacto indestructible frente a la falsedad y la separación forzada del orden social.",
        "Las Estatuas de Oro Puro: Símbolo de la reconciliación tardía de los patriarcas sobre las tumbas de sus hijos, representando la memoria imperecedera del amor sobre la futilidad del odio clanil.",
        "La Maldición de Mercucio ('¡Malditas sean vuestras dos casas!'): Punto de quiebre dramatúrgico que clausura la comedia festiva e inaugura el abismo trágico e irreversible.",
        "El Nombre y la Rosa: Reflexión ontológica de Julieta sobre la vacuidad de las identidades sociales heredadas frente a la verdad intrínseca y pura del ser amado."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Por qué motivo Romeo rehúsa inicialmente combatir en duelo contra Teobaldo?",
            respuesta = "Porque apenas una hora antes se había casado en secreto con Julieta en la celda de Fray Lorenzo, lo que convertía a Teobaldo en su pariente carnal, respondiendo a sus provocaciones con afecto y respeto al linaje Capuleto."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué causa fortuita impide que Romeo reciba en Mantua la carta explicativa de Fray Lorenzo?",
            respuesta = "El mensajero franciscano Fray Juan fue retenido en cuarentena obligatoria en una vivienda de Verona por los celadores sanitarios ante la sospecha de un brote de peste bubónica."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué muerte familiar ocurre en la casa Montesco al enterarse del destierro de Romeo?",
            respuesta = "Lady Montesco, madre de Romeo, fallece en su hogar esa misma noche víctima del profundo dolor, la pena moral y la desesperación ante el exilio de su hijo."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué cambio radical introdujo Shakespeare en la temporalidad de la obra respecto al poema de Arthur Brooke?",
            respuesta = "Condensó la acción de nueve meses (relato original de Brooke) a escasos cinco días vertiginosos (de domingo a viernes al alba), acentuando la fatalidad del tiempo apremiante y la tragedia de la precipitación juvenil."
        ),
        PreguntaClaveObra(
            pregunta = "¿De qué manera sella la reconciliación pública entre Lord Capuleto y Lord Montesco ante el Príncipe?",
            respuesta = "Acuerdan erigir sendas estatuas de oro macizo en el corazón de Verona dedicadas a Julieta y Romeo para honrar eternamente la pureza de su sacrificio."
        )
    )
)
