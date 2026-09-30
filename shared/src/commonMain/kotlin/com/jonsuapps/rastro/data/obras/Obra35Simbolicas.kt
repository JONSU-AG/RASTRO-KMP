package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra35Simbolicas = ObraLiteraria(
    id = "simbolicas",
    titulo = "Simbólicas",
    autor = "José María Eguren",    anio = "Siglo XX (1911)",
    pais = "Perú",
    corriente = "Simbolismo Peruano / Posmodernismo Lírico",
    genero = "Lírico",
    especie = "Poemario simbolista e impresionista",
    categoria = "Literatura Peruana",    colorHex = "#2563EB",
    sinopsis = """
        Simbólicas (Lima, 1911) es el poemario fundacional de la lírica contemporánea en el Perú y la única manifestación del Simbolismo puro en las letras nacionales, obra del solitario y genial maestro José María Eguren. Financiada por el propio poeta y celebrada por Manuel González Prada y José Carlos Mariátegui, la obra supuso una ruptura radical contra la poesía cívica, oratoria y académica del siglo XIX, inaugurando una estética donde el poema no describe la realidad material sino que sugiere el misterio, la belleza inalcanzable y las visiones oníricas de la infancia a través de composiciones cumbre:

        I. Los Reyes Rojos: En la cima de una colina verde, dos monarcas con armaduras purpurinas y lanzas de oro combaten a muerte desde la primera luz del amanecer. La lucha implacable se prolonga bajo el calor del mediodía y persiste al morir la tarde y entrar la noche sin vencedor posible. El poema alegoriza el conflicto cósmico eterno de las fuerzas antagónicas del universo (el día y la noche, el bien y el mal, la vida y la muerte, el destino contra la voluntad humana).

        II. La Niña de la Lámpara Azul: En medio de un pasadizo cubierto de bruma marina que evoca un sueño mágico de Oriente, aparece una doncella etérea que porta una lámpara de luz azulada. Con cabello humedecido por la garúa y voz melodiosa de abedul, la niña toma la mano del poeta en soledad y lo guía con paso leve de laúd a través de las tinieblas de la noche. Encarna la epifanía de la poesía pura y la belleza ideal que redime al artista de la vulgaridad del mundo terrenal.

        III. El Duque Nuez: La nobleza diminuta de los bosques celebra las nupcias aristocráticas del Duque Nuez, quien arriba en una carroza hecha de media cáscara de nuez pulida tirada por cuatro escarabajos dorados. Entre heraldos abejorros, brindis de rocío en copas de bellota y danzas de ciervos volantes bajo luciérnagas, Eguren traslada la mirada del niño eterno que transfigura juguetes e insectos en una corte imperial medieval cargada de encanto y melancolía.

        IV. Los Robles: Marcha fúnebre y gótica en un bosque milenario nórdico donde los añosos robles contemplan el avance de la Muerte y la caída de los imperios humanos, encarnando la decrepitud temporal y el misterio inexorable del fin biológico.

        V. Peregrín Cazador de Figuras: Un errante solitario recorre caminos y pantanos con una red de mariposas buscando atrapar figuras, sombras fugitivas y destellos de nubes. Aunque solo cosecha niebla intangible, prosigue su marcha gozoso, alegoría perfecta del poeta simbolista que desdeña la ganancia material por perseguir el ideal lírico.
    """.trimIndent(),
    contextoHistorico = """
        Publicado en Lima en 1911 en la Imprenta de la Revista, 'Simbólicas' marcó el nacimiento de la lírica moderna y pura en el Perú.

        El Ermitaño de Barranco y la Miniatura Óptica:
        José María Eguren vivió alejado de la política y el bullicio bohemio, recluido en la hacienda Chuquitanta y luego en su casona del balneario de Barranco frente a la neblina marina. Pintor de acuarelas feéricas e inventor de una cámara fotográfica diminuta con la que retrataba insectos y flores, trasladó esa misma precisión de miniaturista a la orfebrería de sus versos.

        La Consagración de Mariátegui y los '7 Ensayos':
        Frente a los círculos académicos que tachaban sus versos de infantiles o incomprensibles, José Carlos Mariátegui dedicó a Eguren un ensayo magistral en sus '7 Ensayos de Interpretación de la Realidad Peruana' (1928), consagrándolo como 'el primer poeta puro del Perú', enteramente descolonizado de la retórica virreinal hispana.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Los Reyes Rojos",
            rol = "Arquetipos del antagonismo cósmico universal",
            descripcion = "Dos monarcas con armaduras purpurinas y lanzas de oro que combaten sin tregua desde la aurora hasta el ocaso, encarnando la lucha perpetua entre la vida y la muerte o las fuerzas polares de la existencia."
        ),
        PersonajeLiterario(
            nombre = "La Niña de la Lámpara Azul",
            rol = "Epifanía de la poesía pura y la belleza ideal",
            descripcion = "Criatura etérea, vaporosa y virginal que emerge del pasadizo nebuloso; personifica a la Musa y el fulgor espiritual que guía al poeta en las tinieblas del mundo cotidiano."
        ),
        PersonajeLiterario(
            nombre = "El Duque Nuez",
            rol = "Monarca feérico del microuniverso infantil",
            descripcion = "Aristócrata diminuto que viaja en carroza de cáscara de nuez tirada por escarabajos dorados para celebrar sus nupcias; encarna la mirada lúdica de la niñez que mitifica la naturaleza."
        ),
        PersonajeLiterario(
            nombre = "Peregrín",
            rol = "Alegoría del poeta simbolista errante",
            descripcion = "Cazador de figuras y sombras incorpóreas que recorre el mundo con su red mágica, despreciando la riqueza terrenal para consagrarse a la persecución de la belleza intangible."
        ),
        PersonajeLiterario(
            nombre = "Los Viejos Robles",
            rol = "Testigos góticos de la caducidad y la muerte",
            descripcion = "Árboles centenarios de un bosque sombrío que asisten a la marcha fúnebre de los siglos y a la extinción inevitable de las criaturas vivientes."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Duelo Perpetuo en 'Los reyes rojos'",
            detalle = "Desde el amanecer y bajo el sol ardiente de la colina verde, dos reyes con lanzas de oro cruzan sus armas sin que el combate concluya al anochecer, fijando la ley del conflicto cósmico constante."
        ),
        EscenaTrama(
            titulo = "La Aparición Luminosa en 'La niña de la lámpara azul'",
            detalle = "En un corredor cubierto de garúa y bruma marina, surge la niña de perfil destellante que toma la mano del poeta y lo conduce con paso de laúd hacia el misterio del arte salvador."
        ),
        EscenaTrama(
            titulo = "La Corte Nupcial en 'El duque Nuez'",
            detalle = "Bajo las luces de las luciérnagas se celebra el banquete nupcial del Duque Nuez, con heraldos abejorros y copas de rocío en medio de la sinfonía secreta de los insectos del bosque."
        ),
        EscenaTrama(
            titulo = "La Marcha Fúnebre en 'Los robles'",
            detalle = "El viento gélido silba entre las ramas desnudas de los robles milenarios, entonando una elegía crepuscular sobre el fin de las glorias terrenales y la soberanía de la Muerte."
        ),
        EscenaTrama(
            titulo = "La Caza de Sombras en 'Peregrín cazador de figuras'",
            detalle = "Peregrín recorre los confines del horizonte atrapando con su red reflejos de agua y niebla, simbolizando el destino solitario y trascendente de la creación lírica pura."
        )
    ),
    temaPrincipal = "La sugerencia del misterio, la belleza ideal inalcanzable y el ensueño metafísico; el mundo feérico y lúdico de la infancia como refugio espiritual frente al tedio de la realidad material; y el combate perpetuo de las fuerzas antagónicas del cosmos evocado mediante la música pura y el color sinestésico.",
    simbolosClave = listOf(
        "La lámpara azul: Emblema del ideal poético puro, la espiritualidad incorruptible y el infinito simbolista frente a la materia vulgar.",
        "Los reyes rojos: Símbolo de la sangre, la pasión vital, el conflicto perenne de opuestos y el destino agónico universal.",
        "La lanza de oro: El fulgor solar de la inteligencia y la nobleza del espíritu que desafía la oscuridad.",
        "La carroza de cáscara de nuez: La capacidad demiúrgica de la niñez para transfigurar lo diminuto en un universo sagrado.",
        "El pasadizo nebuloso: El umbral onírico y la niebla marina de Barranco como frontera entre la realidad terrenal y el misterio lírico.",
        "La red de cazar figuras: El anhelo infructuoso pero glorioso del arte por capturar la belleza inmaterial y efímera."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué corriente literaria pertenece José María Eguren y cuál es su título en la historia literaria peruana?",
            respuesta = "Pertenece al Simbolismo Peruano (en el marco del Posmodernismo lírico) y es reconocido como el 'poeta niño' y el único cultivador de la estética simbolista pura en el Perú."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué simboliza el combate eterno entre los dos monarcas en el poema 'Los reyes rojos'?",
            respuesta = "Simboliza la lucha perpetua e irresoluble de las fuerzas antagónicas del universo (el bien y el mal, la luz y la sombra, la vida y la muerte, la voluntad y el destino inexorable)."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué representa la figura de 'La niña de la lámpara azul'?",
            respuesta = "Encarna a la Poesía pura, a la Musa celestial y a la belleza ideal que guía al artista a través de la oscuridad del mundo cotidiano hacia la trascendencia espiritual."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué juicio crítico formuló José Carlos Mariátegui sobre José María Eguren en sus '7 Ensayos'?",
            respuesta = "Consagró a Eguren como el primer poeta puramente contemporáneo del Perú, cuya obra no desciende de la retórica virreinal hispana sino de la música pura y la magia incorruptible de la infancia."
        )
    )
)
