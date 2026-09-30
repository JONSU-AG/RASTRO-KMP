package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra36CantoVillano = ObraLiteraria(
    id = "canto-villano",
    titulo = "Canto villano",
    autor = "Blanca Varela",    anio = "Siglo XX (1978)",
    pais = "Perú",
    corriente = "Generación del 50 (Lírica Existencial, Esencialista y de Desencanto) / Poesía Contemporánea Peruana",
    genero = "Lírico",
    especie = "Poemario existencial, ontológico y corporal",
    categoria = "Literatura Peruana",    colorHex = "#991B1B",
    sinopsis = """
        Canto villano (Valencia, 1978; reunido en 1986 por el Fondo de Cultura Económica) es el poemario cumbre de Blanca Varela y una de las cimas de la lírica hispanoamericana contemporánea. Perteneciente a la Generación del 50, Varela concibe el poema no como un ornamento consolador, sino como un bisturí despiadado que extirpa la retórica burguesa para hurgar en la carne viva de la existencia, desmitificando los tópicos patriarcales de la maternidad edulcorada, la fe divina y el éxito social a través de composiciones magistrales:

        I. Canto Villano (Poema Homónimo): Ante una mesa desnuda y un plato de pobre, la voz lírica contempla un magro trozo de 'celeste cerdo', insólito oxímoron que funde la aspiración metafísica con la miseria biológica de la comida cotidiana. Desde allí contempla la crueldad inocente de matar una mosca o encender una vela para un ciego, desembocando en una de las desmitificaciones más descarnadas de la maternidad de la literatura universal: el acto de amamantar es vivido como una posesión carnal parasitaria donde el hijo devora los huesos, la carne y la sangre de la madre para nutrirse de su propia nada.

        II. Currículum Vitae: Subversión feroz del documento burocrático de los méritos ciudadanos. La voz poética interpela al individuo que cree haber triunfado en la sociedad capitalista: 'ganaste la carrera y el premio era correr otra carrera'. En lugar del néctar de la victoria, solo bebe la sal de su sudor, rodeado de ladridos de perros y perseguido por su propia sombra como única y desleal competidora hacia la vejez y la muerte.

        III. Puerto Supe: Evocación del litoral norteño donde la poeta pasaba los veranos de su niñez; el Océano Pacífico y la colina negra de arena no son estampas turísticas plácidas, sino una fuerza geológica muda, hostil y calcinante que testimonia la desolación radical del ser humano arrojado a las costas del desierto.

        IV. Nadie Sabe Mis Desvelos: Radiografía de la vigilia solitaria en la noche doméstica; la conciencia desvelada constata que la oscuridad no trae paz ni tregua, sino el asedio de fantasmas interiores y culpas que nadie en el mundo exterior puede consolar.

        V. Fútbol: Parábola ontológica de la corporalidad biológica; el balón que rueda es el cráneo humano pateado por el azar cósmico y los atletas sudorosos encarnan la animalidad de la materia viva forcejeando por un instante efímero de júbilo antes del silencio final.
    """.trimIndent(),
    contextoHistorico = """
        Publicado inicialmente en Valencia en 1978 y consagrado en 1986 como título de su poesía reunida en México, el libro sitúa a Blanca Varela en la cúspide de la lírica moderna en español.

        La Estancia en París y el Aval de Octavio Paz:
        En 1949, Varela emigró a París junto a su esposo, el pintor Fernando de Szyszlo, vinculándose con Jean-Paul Sartre, Simone de Beauvoir y Alberto Giacometti. En París trabó una entrañable amistad con Octavio Paz, quien prologó su primer libro 'Ese puerto existe' (1959) señalando: 'Varela no se complace en sus cantos... opera como un bisturí sobre la propia carne. Su palabra quema como el hielo seco'.

        La Ruptura con el Cánone Lírico Femenino:
        Varela dinamitó la tradición lírica femenina hispanoamericana que reducía a las autoras a la queja amorosa sentimental o a la maternidad angelical. Adoptó una poética del silencio, la contención implacable y el verso seco, despojado de adornos, recibiendo galardones cumbre como el Premio Reina Sofía de Poesía Iberoamericana (2007) y el Premio Internacional García Lorca (2006).
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Sujeto Lírico / La Madre Devorada",
            rol = "Voz desgarrada ante la precariedad biológica y el plato de pobre",
            descripcion = "Conciencia lúcida y escéptica que se contempla en el plato cotidiano y en el acto carnal de amamantar, reconociendo que su cuerpo es materia prestada que engendra y se desgasta."
        ),
        PersonajeLiterario(
            nombre = "El «Celeste Cerdo»",
            rol = "Arquetipo poético de la paradoja existencial humana",
            descripcion = "Oxímoron central del poema homónimo que amalgama el vuelo espiritual y divino ('celeste') con la materia grasa, animal y biodegradable de la carne terrenal ('cerdo')."
        ),
        PersonajeLiterario(
            nombre = "El Corredor del «Currículum Vitae»",
            rol = "Víctima alienada de la farsa del éxito burgués",
            descripcion = "Hombre moderno condenado a competir sin descanso, cuyo premio tras ganar la carrera de la vida es volver a correr hasta ser derrotado por su propia sombra."
        ),
        PersonajeLiterario(
            nombre = "La Propia Sombra",
            rol = "Antagonista invisible, finitud biológica y muerte",
            descripcion = "Competidora desleal y sombra interior que acompaña al ser humano recordándole a cada paso el avance inexorable del tiempo y la descomposición corporal."
        ),
        PersonajeLiterario(
            nombre = "Los Jugadores de «Fútbol»",
            rol = "Encarnación de la animalidad física y el azar cósmico",
            descripcion = "Cuerpos de sudor y choque que disputan una pelota que rueda como un cráneo humano, metáfora del juego ciego de la materia viva sobre la tierra."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "La Revelación en el Plato de Pobre ('Canto villano')",
            detalle = "La voz lírica contempla el 'magro trozo de celeste cerdo' en su plato y asume la crudeza del amamantamiento como una mutilación y entrega biológica de la propia nada."
        ),
        EscenaTrama(
            titulo = "La Paradoja de la Carrera Infinita ('Currículum vitae')",
            detalle = "Se deconstruye la vanidad de los diplomas y victorias mundanas: el vencedor solo cosecha la sal de su sudor mientras su propia sombra lo conduce al sepulcro."
        ),
        EscenaTrama(
            titulo = "El Vértigo Desértico en 'Puerto Supe'",
            detalle = "El ascenso a la colina negra de arena frente al Océano Pacífico devela la soledad primigenia del hombre costeño amarrado a un horizonte árido y calcinante."
        ),
        EscenaTrama(
            titulo = "La Noche Inmisericorde en 'Nadie sabe mis desvelos'",
            detalle = "En el silencio de la casa dormida, la conciencia insomne lidia con fantasmas interiores y certidumbres de incomunicación absoluta que ninguna palabra logra sanar."
        ),
        EscenaTrama(
            titulo = "El Juego Ciego de la Materia en 'Fútbol'",
            detalle = "El forcejeo corporal de los atletas tras una pelota rodante se transmuta en parábola de la humanidad disputando a patadas una brizna de sentido ante el vacío."
        )
    ),
    temaPrincipal = "La depuración verbal extrema y la poética de la incisión; la desmitificación radical de la maternidad y el éxito burgués; la condición precaria, carnal y animal del cuerpo humano expuesto al hambre, la vejez y el dolor; y la soledad ontológica del ser ante el silencio del universo.",
    simbolosClave = listOf(
        "El 'celeste cerdo': Oxímoron que condensa la doble condición del hombre: anhelo de trascendencia divina ('celeste') y atadura a la carne porcina perecedera ('cerdo').",
        "El plato de pobre: Espacio despojado de la supervivencia cotidiana donde la vida aguarda sin oropeles ni consuelos.",
        "El acto de amamantar: Metáfora de la maternidad como sacrificio orgánico donde el hijo devora la carne y huesos de la madre.",
        "La propia sombra en la carrera: Símbolo de la muerte ineludible y el envejecimiento que sabotea toda victoria terrenal.",
        "El cuchillo / bisturí verbal: Concepción de la palabra poética como corte preciso que extirpa la grasa retórica para revelar la herida.",
        "La pelota de fútbol: Representación del cráneo y la mente zarandeados a patadas por el azar de la existencia cósmica."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué generación literaria peruana pertenece Blanca Varela y cuál es su impronta estilística?",
            respuesta = "Perteneció a la Generación del 50; su estilo se distingue por la depuración verbal extrema, la brevedad punzante del verso y el rechazo a todo ornamento lírico complaciente."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué significado encierra el oxímoron 'celeste cerdo' en el poema 'Canto villano'?",
            respuesta = "Expresa la tensión desgarradora de la condición humana: la aspiración hacia lo celestial y sublime enfrentada a la ineludible animalidad biológica y carnal de la existencia terrenal."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo desmitifica Blanca Varela la maternidad en 'Canto villano'?",
            respuesta = "La despoja de la visión sacra tradicional y la muestra como un proceso corporal descarnado y parasitario, donde el hijo devora la carne, huesos y sangre de la madre para alimentarse de su propia nada."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué crítica social y existencial plantea el poema 'Currículum vitae'?",
            respuesta = "Critica la trampa del éxito y la productividad burguesa, señalando que ganar la carrera social solo conduce a la exigencia de correr otra carrera interminable hasta ser alcanzado por la muerte."
        )
    )
)
