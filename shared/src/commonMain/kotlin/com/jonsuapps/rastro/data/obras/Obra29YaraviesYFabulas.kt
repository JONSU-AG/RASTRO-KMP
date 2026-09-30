package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra29YaraviesYFabulas = ObraLiteraria(
    id = "yaravies-y-fabulas",
    titulo = "Yaravíes y fábulas",
    autor = "Mariano Melgar",    anio = "Siglo XIX (1811-1815 / 1878)",
    pais = "Perú",
    corriente = "Prerromanticismo Peruano / Literatura de la Emancipación",
    genero = "Lírico y Didáctico-Político",
    especie = "Yaraví, Fábula política, Elegía y Oda cívica",
    categoria = "Literatura Peruana",    colorHex = "#DC2626",
    sinopsis = """
        Yaravíes y fábulas reúne la producción poética fundamental de Mariano Lorenzo Melgar Valdivieso ('El Poeta Mártir de la Emancipación', 'El Cisne del Misti'), figura cumbre de las letras arequipeñas y peruanas. Fusilado a los veinticuatro años por el ejército realista español en el campo de batalla de Umachiri (1815), Melgar encarna el punto de partida de la literatura nacional mestiza a través de dos vertientes magistrales:

        I. El Nacimiento del Yaraví Mestizo: Melgar es el creador del yaraví culto y mestizo. Escuchó a los indígenas quechuas en la campiña arequipeña entonar el 'harawi' (canto prehispánico de ausencia, dolor y muerte) al compás de la quena. Melgar despojó a este lamento de artificios barrocos y lo fundió con la métrica castellana de arte menor (octosílabos y hexasílabos). De este mestizaje estético nació el yaraví: canto doliente donde la nostalgia andina se convierte en poesía universal.

        II. El Ciclo de Silvia y la Queja Amorosa: El motor de su poesía lírica fue su pasión desdichada por María Santos Corrales, a quien inmortalizó con el nombre poético de 'Silvia'. Tras ser rechazado por la joven y por la familia de esta, Melgar se retira al valle de Majes y compone sus piezas más conmovedoras:
        - Yaraví I ('Todo mi afecto puse en una ingrata...'): Obra maestra construida sobre un estribillo obsesivo e incisivo ('¿para qué diste principio a mi afán?') donde increpa el engaño de haberle dado esperanzas para luego abandonarlo al martirio.
        - Yaraví IV ('Vuelve, que ya no puedo vivir sin tus cariños / vuelve, mi palomita, vuelve a tu dulce nido'): Introduce la metáfora andina del 'urpi' (palomita agreste que abandona el nido dejando al amante en tinieblas).

        III. Las Fábulas Políticas Clandestinas: Para burlar la estricta censura del virrey Fernando de Abascal, Melgar adoptó la fábula esópica neoclásica como arma de combate ideológico independentista:
        - El cantero y el asno: Un cantero azota salvajemente a su asno acusándolo de flojo y perezoso; el animal se vuelve y le responde que si le diera buena hierba y menos carga vería su nobleza. Es la alegoría de la población indígena explotada por el colonialismo español, que achacaba cínicamente a los indios una supuesta pereza que no era sino consecuencia de tres siglos de servidumbre.
        - Los gatos: Sátira contra las facciones criollas que disputan el liderazgo mientras los ratones devoran la despensa, denunciando la falta de unidad frente al enemigo realista.
        - Las cotorras y el zorro: Crítica mordaz a los políticos charlatanes que se pierden en oratorias vacías mientras la tiranía avanza armada.

        IV. Odas Cívicas y la Inmolación de Umachiri: En su 'Oda a la Libertad' (1812) celebra la Constitución de Cádiz exigiendo derechos para los americanos. En 1814 estalla la revolución patriota de Mateo Pumacahua y los hermanos Angulo; Melgar se incorpora como Auditor de Guerra del Ejército Libertador. El 11 de marzo de 1815 se libra la sangrienta Batalla de Umachiri; derrotadas las fuerzas patriotas, Melgar es apresado. Rechaza el indulto condicionado a jurar lealtad al rey de España ('¡Cubrid vuestros ojos, generales de la tiranía, que vosotros sois los que habéis de ser vencidos!') y muere fusilado sin venda en los ojos a los 24 años el 12 de marzo de 1815.
    """.trimIndent(),
    contextoHistorico = """
        Mariano Melgar (Arequipa, 1790 – Umachiri, 1815) vivió en el umbral histórico de la Emancipación continental, en una Arequipa ilustrada influenciada por las reformas humanistas del obispo Pedro José Chávez de la Rosa en el Seminario Conciliar de San Jerónimo.

        Niño Prodigio y Humanista Clásico:
        A los tres años leía fluidamente; a los ocho dominaba el latín y a los diecisiete era profesor de Gramática, Retórica y Filosofía en San Jerónimo. Tradujo directamente del latín a Virgilio ('Las Geórgicas') y a Ovidio ('Los Remedios de Amor', retitulado por él como 'El arte de olvidar'), adaptando la mitología clásica a la campiña del río Chili.

        El Prerromanticismo y el Elogio de Mariátegui:
        Melgar se anticipó en varias décadas al Romanticismo hispanoamericano al poner la pasión amorosa, el patriotismo cívico y el dolor íntimo por encima del racionalismo neoclásico. José Carlos Mariátegui escribió en '7 Ensayos de Interpretación de la Realidad Peruana': 'Melgar es el primer momento peruano de nuestra literatura; en él se funde por primera vez el alma quechua con el idioma castellano'.

        La Rebelión de Pumacahua (1814-1815):
        La rebelión cusqueña de los hermanos Angulo y el cacique brigadier Mateo Pumacahua fue el mayor movimiento independentista previo a la llegada de San Martín. Melgar combatió en ella como Auditor de Guerra y selló su vida con el martirio heroico frente al pelotón de fusilamiento realista.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Mariano Melgar",
            rol = "Poeta mártir, precursor de la independencia y voz elegíaca",
            descripcion = "Joven prodigio arequipeño, sabio humanista y patriota intachable. Transforma el harawi quechua en el yaraví mestizo, canta su desamor por Silvia y entrega su vida a los veinticuatro años frente al pelotón de fusilamiento en Umachiri por la libertad del Perú."
        ),
        PersonajeLiterario(
            nombre = "María Santos Corrales («Silvia»)",
            rol = "Musa eterna e ideal poético del amor inalcanzable",
            descripcion = "Hermosa joven arequipeña, prima lejana de Melgar. Su desdén, inconstancia y posterior matrimonio forzado por su familia inspiraron los más desgarradores yaravíes y elegías del poeta."
        ),
        PersonajeLiterario(
            nombre = "Manuela Paredes («Meli»)",
            rol = "Primer amor juvenil de Melgar",
            descripcion = "Amor temprano de su adolescencia en Arequipa a quien dedicó sus primeros sonetos galantes antes de conocer la pasión devastadora por Silvia."
        ),
        PersonajeLiterario(
            nombre = "El Asno (de 'El cantero y el asno')",
            rol = "Personaje alegórico; símbolo del pueblo indígena y mestizo",
            descripcion = "Bestia noble y sufrida que transporta sillar bajo los azotes del amo. Con voz elocuente y digna, desmonta la acusación de pereza demostrando que su postración es fruto de la brutal opresión colonial."
        ),
        PersonajeLiterario(
            nombre = "El Cantero (de 'El cantero y el asno')",
            rol = "Personaje alegórico; arquetipo del opresor virreinal español",
            descripcion = "Amo despiadado que mata de hambre y azota al animal exigiéndole velocidad, representando el cinismo de los encomenderos y autoridades virreinales."
        ),
        PersonajeLiterario(
            nombre = "Brigadier Mateo Pumacahua",
            rol = "Líder militar patriota de la rebelión independentista de 1814-1815",
            descripcion = "Cacique noble andino que encabezó junto a los hermanos Angulo el gran levantamiento del sur peruano; designó a Melgar como su Auditor de Guerra."
        ),
        PersonajeLiterario(
            nombre = "General Juan Ramírez",
            rol = "Jefe del ejército realista español y ejecutor de Umachiri",
            descripcion = "Militar realista que comandó las fuerzas virreinales que vencieron en Umachiri; presidió el consejo sumarísimo que ordenó el fusilamiento inmediato de Melgar tras negarse este a retractarse."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La Fusión del Harawi y el Nacimiento del Yaraví",
            detalle = "Mariano Melgar escucha en los campos de Arequipa la música melancólica de la quena y los cantos quechuas de despedida (harawi). Despojándolos de adornos barrocos, los funde con los versos de arte menor castellano, creando el yaraví mestizo como expresión pura del dolor andino."
        ),
        EscenaTrama(
            titulo = "El Desamor de Silvia y la Queja Elegíaca",
            detalle = "El rechazo implacable de María Santos Corrales ('Silvia') sume a Melgar en una herida espiritual perpetua. En el valle de Majes compone el inmortal Yaraví I ('¿para qué diste principio a mi afán?') y el Yaraví IV, invocando a la amada fugitiva como una palomita que ha dejado el nido desolado."
        ),
        EscenaTrama(
            titulo = "La Fábula 'El Cantero y el Asno' como Trinchera Ideológica",
            detalle = "Para esquivar la censura colonial del virrey Abascal, Melgar escribe fábulas políticas. En 'El cantero y el asno', el animal azotado increpa a su explotador demostrando que el desmayo del indio es consecuencia de la servidumbre y los malos tratos virreinales y no de una supuesta pereza congénita."
        ),
        EscenaTrama(
            titulo = "La Incorporación al Ejército de Pumacahua y la Batalla de Umachiri",
            detalle = "En 1814 Melgar deja los libros y se alista en la revolución patriota de Mateo Pumacahua como Auditor de Guerra. El 11 de marzo de 1815 combate heroicamente a caballo en la Batalla de Umachiri (Puno); el fuego de cañón realista destroza a las tropas rebeldes y Melgar es capturado en el fango."
        ),
        EscenaTrama(
            titulo = "El Juicio Sumarísimo y el Martirio Heroico",
            detalle = "Al amanecer del 12 de marzo de 1815, el general español Ramírez le ofrece el perdón a cambio de jurar fidelidad a la Corona. Melgar rechaza con altivez la propuesta, rehúsa que le venden los ojos y muere fusilado con el rostro descubierto, consagrándose como prócer y poeta mártir del Perú."
        )
    ),
    temaPrincipal = "El dolor del amor truncado y la queja nostálgica del yaraví mestizo nacido del harawi andino; la denuncia didáctico-política contra la tiranía colonial española en defensa del indígena; y el heroísmo cívico llevado hasta el sacrificio supremo por la libertad de la patria.",
    simbolosClave = listOf(
        "El yaraví: Símbolo del mestizaje cultural fundacional de la peruanidad, donde el llanto quechua del harawi se expresa en idioma castellano.",
        "Silvia (María Santos Corrales): Arquetipo de la belleza ingrata, la ilusión inalcanzable y el destino amoroso fatal del bardo romántico.",
        "La palomita (urpi): Metáfora andina de la amada ausente o esquiva que huye dejando soledad y tinieblas en el hogar.",
        "El asno maltratado de la cantera: Emblema del indio peruano sometido a tres siglos de servidumbre colonial, cuya nobleza despierta ante la justicia.",
        "El sillar y el río Chili: Paisaje telúrico arequipeño que enmarca la pasión lírica y la soledad del poeta.",
        "El campo de Umachiri y los ojos sin venda: Símbolo del patriotismo indomable y el heroísmo del poeta mártir que prefiere la muerte a la sumisión colonial."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es la trascendencia del yaraví creado por Mariano Melgar en la literatura peruana según Mariátegui?",
            respuesta = "Constituye el primer momento auténticamente peruano y mestizo de nuestra literatura, al haber logrado fundir el sentimiento elegíaco y doliente del harawi quechua prehispánico con la métrica lírica castellana de arte menor."
        ),
        PreguntaClaveObra(
            pregunta = "¿A qué corriente literaria pertenece la obra poética de Mariano Melgar?",
            respuesta = "Pertenece al Prerromanticismo dentro del marco de la Literatura de la Emancipación o Independencia, al anteponer la pasión amorosa, el dolor íntimo y el culto a la libertad al racionalismo neoclásico."
        ),
        PreguntaClaveObra(
            pregunta = "¿A quién idealizó poéticamente Melgar con el nombre de 'Silvia' y qué papel tuvo en su vida?",
            respuesta = "A María Santos Corrales, joven arequipeña cuyo rechazo amoroso y posterior casamiento con otro hombre desgarró al poeta y motivó la creación de sus más célebres yaravíes y elegías."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué denuncia política encierra la fábula 'El cantero y el asno'?",
            respuesta = "Denuncia la opresión y explotación sufrida por la población indígena bajo el régimen colonial español, desmitificando el prejuicio de que el indio era naturalmente flojo o indolente, demostrando que su postración era producto del hambre y los azotes de los colonizadores."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué batalla fue capturado Mariano Melgar y cuál fue su desenlace heroico?",
            respuesta = "Fue capturado en la Batalla de Umachiri (Puno, 1815) actuando como Auditor de Guerra de las tropas de Mateo Pumacahua; al negarse a firmar la sumisión a la Corona española que le ofreció el general realista Ramírez, fue fusilado al día siguiente con el rostro descubierto a los veinticuatro años."
        )
    )
)
