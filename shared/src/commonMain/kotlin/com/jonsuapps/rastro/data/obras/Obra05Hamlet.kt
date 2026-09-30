package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

/**
 * OBRA 05: Hamlet, el príncipe de Dinamarca (William Shakespeare)
 * Fuente oficial: CONTENIDO_PEDAGOGICO/06_COMUNICACION/LITERATURA/OBRAS/OBRA_05_Hamlet_Shakespeare.md
 * Integración modular para RASTRO KMP - Biblioteca -> Obras
 */
val Obra05Hamlet = ObraLiteraria(
    id = "hamlet",
    titulo = "Hamlet",
    autor = "William Shakespeare",
    anio = "Siglo XVII (1600-1601)",
    pais = "Inglaterra",
    colorHex = "#1E3A8A",
    corriente = "Renacimiento tardío inglés / Época Isabelina y Jacobina",
    genero = "Dramático",
    especie = "Tragedia de venganza",
    categoria = "Literatura Universal",
    sinopsis = """
        En el castillo real de Elsinor (Dinamarca), los centinelas divisan a medianoche el espectro del difunto rey Hamlet. Avisado por su fiel amigo Horacio, el joven príncipe Hamlet acude a la muralla y se entrevista a solas con el fantasma de su padre. La aparición le revela un crimen horrendo: no murió por la picadura casual de una serpiente mientras dormía en el huerto, sino envenenado con jugo de beleño (hebegon) vertido en su oído por su propio hermano Claudio, quien usurpó la corona y contrajo matrimonio incestuoso y apresurado con la reina viuda Gertrudis. El espectro exige venganza contra Claudio, pero le ordena no manchar sus manos con la sangre de su madre.
        
        Conmocionado por la revelación, Hamlet finge demencia ("antic disposition") como estratagema táctica para investigar sin despertar sospechas directas. Sin embargo, su profunda naturaleza reflexiva, melancólica e intelectual lo sume en una parálisis existencial: duda si el fantasma es verídico o un espíritu demoníaco tentándolo al pecado. Para disimular su locura, repudia con crueldad a su enamorada Ofelia, instándola a recluirse en un convento ("¡Vete a un convento!"), al tiempo que los cortesanos Polonio (chambelán y padre de Ofelia) y los falsos amigos de juventud Rosencrantz y Guildenstern espían cada uno de sus movimientos por encargo de Claudio.
        
        Aprovechando la llegada de una compañía de cómicos ambulantes a Elsinor, Hamlet concibe una prueba infalible: pide que representen un drama titulado "El asesinato de Gonzago", modificando escenas para escenificar con precisión milimétrica la forma exacta en que Claudio envenenó al rey ("La ratonera"). Al presenciar cómo el asesino vierte el veneno en el oído del monarca dormido, Claudio, consumido por el pánico y el remordimiento, interrumpe abruptamente la obra y huye del salón. La culpabilidad del rey queda demostrada sin lugar a dudas ante Hamlet y Horacio.
        
        Poco después, Hamlet encuentra a Claudio a solas intentando orar arrepentido de rodillas. El príncipe desenvaina su espada para matarlo, pero frena su impulso: teme que, al morir en oración y gracia, su alma vaya directamente al cielo, frustrando una venganza cabal y condenatoria. Enseguida acude a los aposentos de la reina Gertrudis para confrontarla severamente por su infamia matrimonial; durante el altercado escucha ruidos tras el tapiz y, creyendo que se trata de Claudio, apuñala a ciegas la cortina, asesinando en realidad al viejo cortesano Polonio que espiaba la charla.
        
        Aterrado por el asesinato de Polonio, Claudio destierra de inmediato a Hamlet a Inglaterra con una carta secreta que ordena a las autoridades británicas decapitar al príncipe tan pronto pise sus costas. Durante la travesía naval, Hamlet descubre la carta traicionera custodiada por Rosencrantz y Guildenstern, la sustituye por una orden donde pide la ejecución fulminante de los portadores, y tras un combate con piratas logra retornar a salvo a Dinamarca. Al llegar, se encuentra con una doble tragedia: Ofelia, enloquecida por la muerte de su padre y el desdén de Hamlet, ha muerto ahogada en un arroyo mientras recogía flores; y su hermano Laertes, desbordado por la ira, regresa de Francia dispuesto a derrocar a Claudio.
        
        Claudio manipula el dolor y la sed de venganza de Laertes para fraguar una trampa mortal definitiva contra Hamlet: organiza un torneo amistoso de esgrima donde Laertes empuñará una espada con punta desnuda untada con un veneno letal e incurable. Además, como seguro de muerte, Claudio prepara una copa de vino envenenada con una perla para ofrecérsela a Hamlet en un descanso.
        
        Durante el asalto, la reina Gertrudis, ignorante del veneno, bebe de la copa mortal para brindar por su hijo y cae fulminada. En el frenesí del combate, Laertes hiere y envenena a Hamlet; en el forcejeo posterior se intercambian los floretes y Hamlet hiere de muerte a Laertes con la misma espada ponzoñosa. Agonizante, Laertes confiesa la traición colectiva y señala a Claudio como el artífice supremo. Encolerizado, Hamlet apuñala al rey tirano con la hoja envenenada y le hace tragar el resto del brebaje de la copa. Antes de expirar, Hamlet detiene a su leal Horacio cuando este intenta suicidarse con las sobras del veneno, pidiéndole que permanezca con vida para contar su verdadera historia, y cede la corona danesa al príncipe noruego Fortinbrás, quien arriba con honores militares mientras pronuncia sus últimas palabras: "El resto es silencio".
    """.trimIndent(),
    contextoHistorico = """
        • Marco histórico-cultural: Compuesta entre 1600 y 1601, 'Hamlet' marca la transición del Renacimiento isabelino hacia la era jacobina. Representa el ocaso del optimismo antropocéntrico humanista renacentista y el surgimiento de la crisis existencial, el escepticismo y la angustia barroca moderna.
        • Antecedentes literarios: Se basa en la leyenda altomedieval danesa de Amleth, recopilada por Saxo Grammaticus en 'Gesta Danorum' (siglo XII), y en el 'Ur-Hamlet' (tragedia perdida atribuida a Thomas Kyd). Pertenece al subgénero de la tragedia de venganza (Revenge Tragedy) de raigambre senequista, pero Shakespeare la despoja del primitivismo mecánico de sangre para transformarla en la más honda indagación psicológica y filosófica de la literatura universal.
        • Corriente y relevancia: Tragedia cumbre del Siglo de Oro inglés. Se anticipa al existencialismo moderno examinando el abismo entre la conciencia reflexiva y la acción resolutiva.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Hamlet",
            rol = "Protagonista / Príncipe de Dinamarca",
            descripcion = "Hijo del difunto rey Hamlet y Gertrudis. Arquetipo universal de la duda, el conflicto existencial y la parálisis de la acción provocada por el exceso de reflexión y melancolía filosófica. Finge locura para investigar el crimen."
        ),
        PersonajeLiterario(
            nombre = "Claudio",
            rol = "Antagonista / Rey usurpador de Dinamarca",
            descripcion = "Hermano del rey difunto y tío-padrastro de Hamlet. Asesino traicionero y calculador que vertió jugo de beleño en el oído de su hermano mientras dormía. Encarna la ambición política corrupta, la felonía y la hipocresía."
        ),
        PersonajeLiterario(
            nombre = "Gertrudis",
            rol = "Reina viuda de Dinamarca / Madre de Hamlet",
            descripcion = "Mujer frágil y dependiente que consumó un apresurado e incestuoso matrimonio con su cuñado Claudio tras la muerte de su esposo. Muere accidentalmente envenenada al beber la copa dispuesta para su hijo."
        ),
        PersonajeLiterario(
            nombre = "El Espectro (Sombra del Rey Hamlet)",
            rol = "Fantasma del monarca asesinado",
            descripcion = "Aparición espectral con armadura completa en las almenas de Elsinor. Revela la verdad del asesinato a Hamlet y le exige venganza, pidiéndole compasión hacia el alma de Gertrudis."
        ),
        PersonajeLiterario(
            nombre = "Ofelia",
            rol = "Amada de Hamlet / Hija de Polonio",
            descripcion = "Joven noble ingenua, sumisa y desdichada. Atrapada entre la lealtad ciega a su padre y su amor por Hamlet. Enloquece tras la muerte de Polonio a manos del príncipe y muere ahogada en un arroyo en misteriosas circunstancias."
        ),
        PersonajeLiterario(
            nombre = "Laertes",
            rol = "Hijo de Polonio / Hermano de Ofelia",
            descripcion = "Hombre de acción rápida e impulsiva, antagonista complementario y contrafigura ('foil') de Hamlet. Busca vengar a su padre y a su hermana sin vacilación filosófica alguna, siendo manipulado por Claudio."
        ),
        PersonajeLiterario(
            nombre = "Polonio",
            rol = "Chambelán / Lord Canciller de Dinamarca",
            descripcion = "Padre de Ofelia y Laertes. Anciano cortesano charlatán, servil, pomposo y entrometido. Muere apuñalado por Hamlet al ocultarse imprudentemente detrás de un tapiz para espiarlo en la alcoba de Gertrudis."
        ),
        PersonajeLiterario(
            nombre = "Horacio",
            rol = "Fiel amigo y confidente de Hamlet",
            descripcion = "Estudiante y hombre de templanza estoica y racional. El único que permanece leal y sobrevive al baño de sangre final para transmitir a la posteridad la trágica verdad de lo acontecido."
        ),
        PersonajeLiterario(
            nombre = "Rosencrantz y Guildenstern",
            rol = "Compañeros de estudios de Hamlet / Espías cortesanos",
            descripcion = "Cortesanos oportunistas que traicionan su amistad juvenil por el favor del rey Claudio. Son enviados para custodiar la carta de muerte de Hamlet, pero terminan ejecutados en Inglaterra al trocarse el mensaje."
        ),
        PersonajeLiterario(
            nombre = "Fortinbrás",
            rol = "Príncipe de Noruega",
            descripcion = "Joven príncipe guerrero y decidido que recupera las tierras de su padre. Hamlet, antes de morir, le otorga su voto para ser coronado rey de Dinamarca, restaurando el orden cósmico y político en el reino."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Acto I: La revelación espectral y el voto de venganza",
            detalle = "En las frías explanadas de Elsinor, los centinelas y Horacio ven pasar el espectro del difunto rey. Enterado, Hamlet se reúne con la sombra a medianoche. El espectro le confiesa el asesinato perpetrado por Claudio mediante envenenamiento y le exige venganza. Hamlet promete vengar a su padre y advierte a sus amigos que en adelante fingirá demencia."
        ),
        EscenaTrama(
            titulo = "Acto II: El fingimiento de locura y la trampa del teatro",
            detalle = "Polonio cree que la demencia de Hamlet procede del mal de amores causado por el rechazo forzado de Ofelia. Claudio hace venir a Rosencrantz y Guildenstern para espiarlo. Arriban los actores cómicos ambulantes; Hamlet planea que representen 'El asesinato de Gonzago' introduciendo versos propios para cazar la conciencia culpable del rey ('La ratonera')."
        ),
        EscenaTrama(
            titulo = "Acto III: 'Ser o no ser', la ratonera y la muerte de Polonio",
            detalle = "Hamlet reflexiona en su inmortal soliloquio sobre el dolor de vivir, el suicidio y el temor a lo desconocido tras la muerte. Humilla a Ofelia enviándola al convento. Se representa la obra y Claudio huye despavorido al ver escenificado su crimen. Luego, Hamlet ve a Claudio rezando de rodillas pero no lo mata para no enviar su alma al cielo. En la alcoba materna, Hamlet reprende a su madre y mata tras el tapiz a Polonio confundiéndolo con Claudio."
        ),
        EscenaTrama(
            titulo = "Acto IV: El destierro a Inglaterra y la locura de Ofelia",
            detalle = "Claudio aprovecha el crimen de Polonio para desterrar a Hamlet con orden secreta de muerte. Ofelia enloquece de dolor, reparte flores simbólicas y se ahoga en un arroyo. Laertes vuelve de Francia furibundo para vengar a su padre. Claudio se alía con él al enterarse de que Hamlet interceptó la carta británica y regresó a Dinamarca, tramando el duelo amañado con espada emponzoñada."
        ),
        EscenaTrama(
            titulo = "Acto V: El camposanto, el torneo envenenado y la catástrofe",
            detalle = "En el cementerio, dos sepultureros cavan la fosa de Ofelia. Hamlet sostiene la calavera del bufón Yorick y medita sobre la vanidad de las grandezas humanas y la descomposición corporal. Durante el entierro de Ofelia, Hamlet se bate a golpes con Laertes en la tumba. Ya en palacio, se disputa el torneo: Gertrudis toma la copa envenenada y muere; Laertes y Hamlet se hieren mutuamente con la espada ponzoñosa; Laertes confiesa la conjura antes de expirar; Hamlet mata a Claudio apuñalándolo y forzándolo a beber el veneno; Hamlet encomienda a Horacio la verdad de los hechos, proclama a Fortinbrás rey de Dinamarca y fallece ('El resto es silencio')."
        )
    ),
    temaPrincipal = "La duda existencial, el conflicto entre la reflexión filosófica y la acción resolutiva, la venganza y la corrupción moral y política del poder.",
    simbolosClave = listOf(
        "El veneno en el oído: Símbolo del crimen biológico literal cometido por Claudio y alegoría de la corrupción moral que infecta al reino entero mediante la mentira, la adulación y la traición.",
        "La calavera de Yorick: El bufón de la infancia de Hamlet. Símbolo del 'memento mori', la vanidad de la existencia humana, la caducidad inevitable de toda gloria terrenal y la igualdad absoluta ante la muerte.",
        "El teatro dentro del teatro ('La ratonera'): Representación de la ficción dramática como espejo revelador de la verdad que desbarata la farsa hipócrita de la realidad política.",
        "Las ropas negras de Hamlet: Representan el luto riguroso, la melancolía irreductible y la negativa moral a integrarse en la fiesta cortesana corrupta e impúdica de Claudio y Gertrudis.",
        "Las flores de Ofelia: Símbolos de su desvarío y acusación velada a los cortesanos (romero para el recuerdo, pensamientos, ruda para el dolor y la culpa, margaritas y violetas marchitas).",
        "El estado podrido de Dinamarca ('Algo huele a podrido en Dinamarca'): Metáfora del desorden cósmico provocado por el regicidio ilegítimo de Claudio."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es el motivo fundamental por el cual Hamlet retrasa sistemáticamente la venganza contra Claudio?",
            respuesta = "El exceso de reflexión intelectual y filosófica, y su escrúpulo moral. Hamlet vacila primero por dudar de la naturaleza bondadosa o demoníaca del espectro; luego comprueba el crimen con 'La ratonera', pero pospone el tajo cuando Claudio reza para no enviar su alma absuelta al cielo, cayendo en la parálisis de la acción típica del héroe trágico moderno."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué significa el dilema del célebre soliloquio 'Ser o no ser, esa es la cuestión'?",
            respuesta = "Plantea el conflicto ético y existencial entre soportar pasivamente las miserias, injusticias y reveses del destino ('padecer los dardos de la fortuna') o rebelarse activamente contra ellos arriesgando la vida, e interroga el suicidio como escape frente al pánico a lo que vendrá tras la muerte ('el país desconocido del que ningún viajero regresa')."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo prueba Hamlet de forma concluyente la culpabilidad de Claudio?",
            respuesta = "Haciendo representar por actores ambulantes la obra 'El asesinato de Gonzago' (bautizada por él como 'La ratonera'), con versos intercalados por él mismo que imitan con exactitud la escena del fratricidio. La violenta turbación y la fuga de Claudio del salón confirman fehacientemente el crimen."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién hereda legítimamente la corona de Dinamarca al final de la tragedia?",
            respuesta = "El príncipe Fortinbrás de Noruega. Agonizante por el veneno, Hamlet le confiere su voto sucesorio, reconociendo en Fortinbrás al hombre de acción noble y resuelta capaz de restablecer el orden político y moral destruido en Dinamarca."
        ),
        PreguntaClaveObra(
            pregunta = "¡Trampa de Examen!: ¿Muere Polonio envenenado o apuñalado por Claudio?",
            respuesta = "¡Falso en ambos casos! Polonio muere apuñalado por el propio Hamlet a través de una cortina/tapiz en los aposentos de la reina Gertrudis, al escuchar ruidos y creer impulsivamente que quien espiaba era el rey Claudio."
        )
    )
)
