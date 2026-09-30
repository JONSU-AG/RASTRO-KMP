package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra34ConversacionEnLaCatedral = ObraLiteraria(
    id = "conversacion-en-la-catedral",
    titulo = "Conversación en La Catedral",
    autor = "Mario Vargas Llosa",    anio = "Siglo XX (1969)",
    pais = "Perú",
    corriente = "Boom Hispanoamericano / Novela Total / Realismo Estructural y Político",
    genero = "Narrativo",
    especie = "Novela política monumental / Radiografía sociológica del poder autoritario",
    categoria = "Literatura Peruana",    colorHex = "#475569",
    sinopsis = """
        Conversación en La Catedral (Barcelona, 1969) es la obra cumbre de Mario Vargas Llosa y una de las cimas indiscutibles de la novelística universal del siglo XX. Estructurada a partir de un diálogo torrencial de cuatro horas en una grasienta taberna de la avenida Alfonso Ugarte en Lima —el bar 'La Catedral'— entre el periodista desencantado Santiago Zavala ('Zavalita') y el zambo Ambrosio Pardo (antiguo chofer de su padre), la novela disecciona con maestría arquitectónica quince años de historia política peruana bajo la dictadura militar del general Manuel A. Odría (el 'Ochenio', 1948-1956), articulada en cuatro densas partes:

        I. La Rebelión de Zavalita y el Engranaje Dictatorial: Santiago, hijo del poderoso financista oligárquico don Fermín Zavala ('Bola de Oro'), renuncia a los privilegios de su clase social y postula a escondidas a la combativa Universidad de San Marcos en lugar de la elitista Universidad Católica. Allí se afilia a la célula comunista clandestina 'Cahuide' junto a Aída y Jacobo. Paralelamente, se expone el ascenso de Cayo Bermúdez ('Cayo Mierda'), temible Director de Gobierno de Odría, quien orquesta una siniestra red de espionaje, censura y represión policial financiada por la burguesía cómplice. Al ser desbaratada la célula, todos son torturados salvo Santiago, liberado de inmediato por influencia directa de don Fermín. Humillado por la impunidad de su apellido, Santiago rompe con su padre, abandona la universidad y se refugia en la mediocridad como gacetillero de crónicas policiales en el diario La Crónica.

        II. La Huelga Insurrecta de Arequipa y la Caída de Cayo: En 1955, el Ochenio entra en agonía cuando estalla en Arequipa una huelga popular cívica liderada por estudiantes y obreros. Cayo Bermúdez envía matones a sueldo que disparan contra la multitud en el puente Bolognesi; la ciudad entera responde levantando barricadas de sillar y el ejército rehúsa masacrar al pueblo. Don Fermín y los magnates limeños comprenden que Bermúdez se ha vuelto un lastre y exigen su destitución a Odría, obligando al represor a huir al exilio en Europa.

        III. La Musa, la Homosexualidad Oculta y el Chantaje: Hortensia ('La Musa'), cortesana y amante de Cayo Bermúdez que organizaba orgías para la cúpula del poder, queda arruinada tras la caída del régimen. Adicta a la morfina, Hortensia chantajea a don Fermín Zavala con hacer pública su homosexualidad secreta: el respetable magnate miraflorino mantenía citas clandestinas en una casa alquilada en Ancón con su propio chofer, Ambrosio. Ante la inminencia del escándalo que destruiría a su familia, Hortensia aparece cosida a puñaladas en su modesta vivienda de Chorrillos.

        IV. La Anagnórisis en La Catedral y el Vómito de la Verdad: Santiago busca a su perro Batuque en la Perrera Municipal y reconoce en el exterminador de perros callejeros a Ambrosio. En la mesa de 'La Catedral', entre cervezas Cristal, Santiago acorrala a Ambrosio para saber si don Fermín ordenó el asesinato de La Musa. Con lealtad desesperada, Ambrosio confiesa que don Fermín no supo nada: él mismo la asesinó para proteger a su patrón y amante de la infamia pública. Don Fermín le dio dinero para huir a la selva, donde Ambrosio lo perdió todo antes de volver a Lima como piltrafa humana. Santiago regresa a su hogar gris con su esposa Maruja, asumiendo que el Perú se degrada cada día por la cobardía moral colectiva.
    """.trimIndent(),
    contextoHistorico = """
        Publicada en dos tomos en 1969 por Seix Barral en Barcelona, la novela recrea con rigor sociológico y documental la dictadura militar del general Manuel A. Odría (1948-1956).

        El Ochenio de Manuel A. Odría:
        Tras derrocar al presidente democrático José Luis Bustamante y Rivero en 1948, Odría suspendió las garantías constitucionales e impuso la siniestra Ley de Seguridad Interior. El régimen persiguió, encarceló y deportó a líderes del APRA y de la izquierda, instaurando un clima de delación y terror policial conducido por Alejandro Esparza Zañartu (modelo histórico de Cayo Bermúdez).

        La San Marcos Rebelde y la Pregunta Fundacional:
        Mario Vargas Llosa ingresó a la Universidad de San Marcos en 1953, participando en el grupo comunista 'Cahuide'. La célebre pregunta que abre la novela ('¿En qué momento se había jodido el Perú?') sintetiza la frustración de una generación de jóvenes que vieron cómo la dictadura envileció las instituciones, la prensa y los lazos familiares.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Santiago Zavala («Zavalita»)",
            rol = "Protagonista; periodista desencantado y rebelde frustrado",
            descripcion = "Hijo de don Fermín Zavala; rompe con su familia burguesa, milita en la célula clandestina 'Cahuide' en San Marcos y termina resignado como gacetillero de crónicas rojas en La Crónica, buscando comprender las raíces de la descomposición del Perú."
        ),
        PersonajeLiterario(
            nombre = "Ambrosio Pardo",
            rol = "Chofer zambo provinciano y ejecutor del crimen",
            descripcion = "Hombre humilde de Chincha; sirve a don Fermín con sumisión total convirtiéndose en su amante secreto y chofer. Asesina a puñaladas a Hortensia para defender el honor de su amo, terminando en la indigencia en la Perrera Municipal."
        ),
        PersonajeLiterario(
            nombre = "Don Fermín Zavala («Bola de Oro»)",
            rol = "Magnate oligarca y financista de la dictadura",
            descripcion = "Padre de Santiago; caballero respetable en los clubes aristocráticos y hombre de negocios cómplice del régimen de Odría que oculta con pánico su homosexualidad clandestina con su chofer Ambrosio."
        ),
        PersonajeLiterario(
            nombre = "Cayo Bermúdez («Cayo Mierda»)",
            rol = "Director de Gobierno y cerebro represor del Ochenio",
            descripcion = "Hombre frío, implacable y sin ideología; maneja el espionaje político, las torturas, los sobornos a la prensa y los prostíbulos del poder hasta ser derrocado por la insurrección de Arequipa de 1955."
        ),
        PersonajeLiterario(
            nombre = "Hortensia («La Musa»)",
            rol = "Cortesana de Cayo Bermúdez y víctima del chantaje",
            descripcion = "Exprostituta de lujo que hospeda las orgías del régimen; al caer en la ruina y la drogadicción, chantajea a don Fermín con divulgar su secreto carnal y es salvajemente degollada por Ambrosio."
        ),
        PersonajeLiterario(
            nombre = "Amalia",
            rol = "Empleada doméstica sufrida y esposa de Ambrosio",
            descripcion = "Mujer humilde que sirve en casa de los Zavala y de La Musa; se casa con Ambrosio y viaja con él a Pucallpa, donde muere trágicamente de parto en un hospital sin recursos."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Reencuentro en la Perrera y la Mesa de La Catedral",
            detalle = "Santiago rescata a su perro Batuque en la Perrera Municipal y halla a Ambrosio trabajando como aporreador de perros; se trasladan al bar 'La Catedral' iniciando cuatro horas de evocaciones con cerveza."
        ),
        EscenaTrama(
            titulo = "La Célula Cahuide y la Prisión Privilegiada",
            detalle = "Santiago milita en San Marcos contra la tiranía; es apresado por la policía política pero liberado de inmediato gracias al soborno de su padre, provocando la ruptura definitiva con su hogar aristocrático."
        ),
        EscenaTrama(
            titulo = "La Rebelión Heroica de Arequipa en 1955",
            detalle = "El pueblo arequipeño y los estudiantes del Colegio Independencia se sublevan en la Plaza de Armas contra los sicarios de Cayo Bermúdez, forzando a Odría a destituir a su siniestro ministro represor."
        ),
        EscenaTrama(
            titulo = "El Asesinato a Puñaladas de La Musa",
            detalle = "Hortensia chantajea a don Fermín con revelar sus citas homosexuales clandestinas en Ancón; días después, aparece apuñalada en su cama de Chorrillos en medio de un charco de sangre."
        ),
        EscenaTrama(
            titulo = "La Confesión de Ambrosio y la Náusea Moral de Zavalita",
            detalle = "Ambrosio confiesa haber matado a La Musa por propia mano para blindar a don Fermín; Santiago asume la putrefacción moral del poder y regresa a la monotonía de su vida gris."
        )
    ),
    temaPrincipal = "La descomposición moral, la corrupción política, el chantaje institucional y la degradación humana bajo la dictadura militar de Odría; la pregunta por el fracaso histórico de la nación ('¿en qué momento se había jodido el Perú?'); y el servilismo feudal que lleva a las clases subalternas a cometer crímenes para resguardar la hipocresía de la oligarquía.",
    simbolosClave = listOf(
        "El bar 'La Catedral': Espacio sórdido y grasiento de la avenida Alfonso Ugarte donde se desnuda la degradación moral de todas las clases sociales.",
        "La Perrera Municipal y los garrotes: Metáfora de la brutalidad estatal y el exterminio de los desamparados bajo el régimen dictatorial.",
        "El perro Batuque: Símbolo de la inocencia y el afecto doméstico frágil que debe ser rescatado de la violencia callejera.",
        "La pregunta '¿En qué momento se había jodido el Perú?': Eje axiomático de la novela que diagnostica la capitulación ética de una sociedad entera.",
        "Los diálogos telescópicos: Técnica estructural donde convergen múltiples épocas en un solo párrafo, mostrando que el autoritarismo contamina todos los tiempos.",
        "La casa clandestina de Ancón: Refugio del secreto homosexual de don Fermín, donde se evidencia la fractura entre la apariencia pública y la miseria privada."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Qué es exactamente 'La Catedral' en la novela de Mario Vargas Llosa?",
            respuesta = "No es la iglesia catedralicia de Lima, sino un cafetín y bar popular de mala muerte en la avenida Alfonso Ugarte cerca del río Rímac y de la Perrera Municipal."
        ),
        PreguntaClaveObra(
            pregunta = "¿Bajo qué dictadura militar peruana se ambienta el trasfondo histórico de la obra?",
            respuesta = "Se ambienta durante la dictadura militar del general Manuel A. Odría, periodo conocido en la historia republicana como el 'Ochenio' (1948-1956)."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién mató a Hortensia ('La Musa') y por qué motivo?",
            respuesta = "La asesinó el zambo Ambrosio Pardo por iniciativa propia, para evitar que siguiera chantajeando a don Fermín Zavala con revelar su relación homosexual clandestina."
        ),
        PreguntaClaveObra(
            pregunta = "¿En qué consiste la técnica de los 'diálogos telescópicos' desarrollada en esta obra?",
            respuesta = "Consiste en entrelazar y superponer dentro de un mismo párrafo dos, tres o más conversaciones que ocurrieron en tiempos y lugares distintos, creando un efecto de simultaneidad y radiografía total de la sociedad."
        )
    )
)
