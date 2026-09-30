package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra28LaCiudadYLosPerros = ObraLiteraria(
    id = "la-ciudad-y-los-perros",
    titulo = "La ciudad y los perros",
    autor = "Mario Vargas Llosa",    anio = "Siglo XX (1962 / 1963)",
    pais = "Perú",
    corriente = "Boom Hispanoamericano / Novela Total / Realismo Estructural",
    genero = "Narrativo",
    especie = "Novela urbana contemporánea / Novela coral y de iniciación",
    categoria = "Literatura Peruana",    colorHex = "#B91C1C",
    sinopsis = """
        La ciudad y los perros (1963) es la obra maestra fundacional del Boom Hispanoamericano y la primera gran novela de Mario Vargas Llosa (Premio Nobel de Literatura 2010). Galardonada con el Premio Biblioteca Breve en 1962 y el Premio de la Crítica Española en 1963, la novela causó una conmoción continental al desmitificar el autoritarismo militarista mediante una revolucionaria arquitectura técnica polifónica:

        I. El Robo del Examen y la Cuarentena Militar: La acción se abre in media res en la oscuridad de la cuadra del quinto año del Colegio Militar Leoncio Prado (Callao): cuatro cadetes juegan a los dados para decidir quién robará las preguntas del examen de química. El azar condena al Serrano Cava, quien quiebra un vidrio y sustrae el formulario bajo órdenes de 'El Círculo', cofradía mafiosa de cadetes comandada con puño de hierro por El Jaguar para traficar con licor, cigarrillos y exámenes, e imponer la ley de la fuerza sobre los más débiles. Al descubrirse el robo, las autoridades militares suspenden indefinidamente las salidas de fin de semana de toda la sección hasta que aparezca el culpable.

        II. La Delación del Esclavo y la Expulsión de Cava: El encierro asfixiante desespera a Ricardo Arana ('El Esclavo'), muchacho tímido y sumiso sometido a constantes golpizas por sus compañeros. Arana necesita salir urgentemente para ver a Teresa, muchacha humilde de Lince de quien está platónicamente enamorado. Desesperado, el Esclavo delata en secreto al Serrano Cava ante los oficiales. En una humillante ceremonia en el patio de armas, el teniente Gamboa arranca los galones de Cava y lo expulsa con deshonor. El Jaguar jura vengarse quebrando los huesos del soplón.

        III. Las Maniobras de Carabayllo y el Asesinato: Durante las maniobras tácticas de tiro con munición real en las colinas de Carabayllo, se oye un disparo fuera de fila: el Esclavo cae mortalmente herido con un balazo certero en la base de la nuca. Agoniza y muere en el hospital militar. La cúpula castrense (el coronel y los mayores), aterrada ante el escándalo público y el desprestigio del Ejército, archiva el caso calificándolo cínicamente de 'accidente fortuito por impericia del cadete al disparar su propia arma'.

        IV. La Denuncia del Poeta y la Cruzada de Gamboa: Alberto Fernández ('El Poeta'), cadete burgués miraflorino que escribe novelitas pornográficas y cartas de amor por encargo para sobrevivir al rigor del cuartel, acude al despacho del teniente Gamboa —el único oficial con honor auténtico— y denuncia formalmente al Jaguar como el asesino del Esclavo, confesando también todas las corruptelas de la cuadra. Gamboa encierra al Jaguar en el calabozo y eleva el parte acusatorio. Sin embargo, los altos mandos chantajean a Alberto exhibiendo sus novelitas eróticas para deshonrar a su familia si no retira la denuncia. Alberto cede y se quiebra; simultáneamente, la cúpula castiga la rectitud moral del teniente Gamboa desterrándolo a una lejana e inhóspita guarnición en Juliaca.

        V. Epílogo y Anagnórisis de las Máscaras: Gamboa libera al Jaguar antes de partir. Al volver a la cuadra, los cadetes creen que el Jaguar fue el soplón que delató los contrabandos y lo muelen a golpes en manada; el Jaguar asume la paliza en silencio absoluto sin delatar a Alberto. En la vida civil adulta, las máscaras caen: Alberto olvida a Teresa, viaja a Estados Unidos a estudiar ingeniería y se reintegra a la burguesía frívola; Gamboa asume su exilio altiplánico; y se revela que el muchacho marginal de Bellavista que amaba a Teresa desde niño era El Jaguar, quien se ha regenerado en la vida civil trabajando honradamente en un banco y casándose con ella.
    """.trimIndent(),
    contextoHistorico = """
        Publicada en 1963 por Seix Barral en Barcelona, 'La ciudad y los perros' marcó el punto de partida oficial del fenómeno editorial y estético del 'Boom Hispanoamericano'.

        La Experiencia Biográfica en el Leoncio Prado:
        A los catorce años, el padre de Mario Vargas Llosa, alarmado porque el muchacho escribía versos y temiendo que se convirtiera en un bohemio o 'maricón', lo internó a la fuerza en el Colegio Militar Leoncio Prado (1950-1951) para que 'se hiciera hombre'. La vivencia traumática del racismo, la violencia brutal de las novatadas, las jerarquías castrenses y la convivencia forzada de todas las clases sociales peruanas suministraron la materia viva para la obra.

        Repercusión y Quema de Libros:
        Al publicarse la novela, las autoridades castrenses peruanas consideraron la obra un ataque sedicioso contra la institución militar: los mandos del Leoncio Prado quemaron públicamente cerca de mil ejemplares en el patio de armas del colegio, calificando al autor de 'traidor a la patria, pornógrafo e instrumento del comunismo'.

        La Novela Total y el Realismo Estructural:
        Vargas Llosa aplicó las técnicas vanguardistas más audaces del siglo XX: la multiplicidad de puntos de vista (narrador omnisciente, primera persona de Alberto y monólogo interior torrencial del Boa con su perra Malpapeada), la técnica de los 'vasos comunicantes' (fusión de dos diálogos lejanos en tiempo y espacio en un solo párrafo), el montaje cinematográfico y la anagnórisis final que revela la verdadera identidad del Jaguar en el epílogo.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "El Jaguar",
            rol = "Líder indiscutible de 'El Círculo' y antagonista central",
            descripcion = "Muchacho duro de Bellavista, criado en la bravura callejera; no se deja 'bautizar' por nadie al ingresar al colegio e impone la ley del más fuerte. Asesina de un tiro en la nuca al Esclavo en venganza por su delación; tras ser apaleado por la cuadra al ser confundido con un soplón, se regenera en la vida civil, trabaja en un banco y se casa con Teresa."
        ),
        PersonajeLiterario(
            nombre = "Alberto Fernández («El Poeta»)",
            rol = "Narrador interno y arquetipo de la burguesía miraflorina",
            descripcion = "Muchacho de clase media acomodada que usa una máscara de cinismo para sobrevivir en el cuartel; escribe novelitas pornográficas y cartas de amor por cigarrillos. Intenta hacer justicia denunciando al Jaguar tras la muerte del Esclavo, pero capitula ante el chantaje del coronel y vuelve a su vida frívola de comodidades."
        ),
        PersonajeLiterario(
            nombre = "Ricardo Arana («El Esclavo»)",
            rol = "Víctima propiciatoria del autoritarismo y la violencia escolar",
            descripcion = "Cadete sumiso, sensible y tímido, maltratado por su padre autoritario y humillado por sus compañeros de cuadra. Incapaz de defenderse con los puños, delata al Serrano Cava para obtener un permiso de salida y ver a Teresa, siendo ejecutado a traición en Carabayllo."
        ),
        PersonajeLiterario(
            nombre = "Teniente Gamboa",
            rol = "Instructor militar incorruptible y símbolo del honor auténtico",
            descripcion = "Oficial estricto y de disciplina inflexible; cree honestamente en los ideales militares. Desafía a la cúpula castrense al exigir una investigación penal contra el Jaguar por el asesinato del Esclavo, siendo desterrado a Juliaca como castigo a su intransigencia ética."
        ),
        PersonajeLiterario(
            nombre = "Porfirio Cava («El Serrano Cava»)",
            rol = "Cadete de origen andino e integrante de 'El Círculo'",
            descripcion = "Muchacho leal pero desdichado; roba el examen de química tras perder en los dados. Tras la delación del Esclavo, es degradado públicamente en el patio de armas y expulsado con deshonor."
        ),
        PersonajeLiterario(
            nombre = "El Boa",
            rol = "Cadete violento y voz del monólogo interior instintivo",
            descripcion = "Brazo ejecutor del Círculo y compinche del Jaguar; vuelca su afecto reprimido y su desbordada animalidad en soliloquios ininterrumpidos con su perra 'Malpapeada'."
        ),
        PersonajeLiterario(
            nombre = "Teresa",
            rol = "Figura femenina idealizada y eje afectivo de los cadetes",
            descripcion = "Muchacha humilde, dulce y virtuosa de Lince; es la ilusión amorosa del Esclavo, la novia transitoria de Alberto y finalmente la esposa del Jaguar en la vida civil."
        ),
        PersonajeLiterario(
            nombre = "El Coronel y la Jerarquía Castrense",
            rol = "Representantes del encubrimiento y la hipocresía institucional",
            descripcion = "Altos mandos militares que silencian el homicidio del Esclavo tildándolo de 'accidente' para salvaguardar el prestigio del colegio, chantajeando al Poeta y desterrando a Gamboa."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "El Juego de Dados en la Oscuridad y el Robo del Examen",
            detalle = "En la cuadra del quinto año, los cadetes del Círculo juegan a los dados para definir quién robará el examen de química. El Serrano Cava saca el puntaje fatal, rompe el cristal del aula y sustrae la prueba. Al descubrirse el vidrio quebrado, los jefes militares suspenden todos los pases de salida indefinidamente."
        ),
        EscenaTrama(
            titulo = "La Desesperación del Esclavo y la Delación de Cava",
            detalle = "Ricardo Arana ('El Esclavo'), desesperado por salir a ver a Teresa, confiesa en secreto a los oficiales que el autor del robo fue el Serrano Cava. En formación general, Gamboa le arranca los galones a Cava y lo expulsa del colegio. El Jaguar jura venganza a muerte contra el delator anónimo."
        ),
        EscenaTrama(
            titulo = "Las Maniobras en Carabayllo y el Tiro en la Nuca",
            detalle = "Durante ejercicios de tiro con fuego real en Carabayllo, el Esclavo cae acribillado por un balazo vertical en la nuca. La cúpula militar, para evitar un escándalo que manche el honor del Ejército, encubre el asesinato declarando oficialmente que se trató de un accidente provocado por el propio cadete."
        ),
        EscenaTrama(
            titulo = "La Denuncia de Alberto y la Incorruptibilidad de Gamboa",
            detalle = "Alberto acusa formalmente al Jaguar ante Gamboa y devela los contrabandos de la cuadra. Gamboa encarcela al sospechoso y eleva el parte. Sin embargo, el Coronel chantajea a Alberto con sus novelitas pornográficas para forzarlo a callar, y destierra al teniente Gamboa a una remota guarnición en Juliaca."
        ),
        EscenaTrama(
            titulo = "La Paliza al Jaguar y el Destino de las Máscaras Civiles",
            detalle = "Liberado del calabozo, el Jaguar es apaleado por sus propios compañeros que lo creen soplón, soportando el castigo en silencio. En el epílogo, Alberto regresa a su vida burguesa frívola y se descubre que el Jaguar, redimido en la vida civil como empleado bancario, está casado con Teresa."
        )
    ),
    temaPrincipal = "La desmitificación brutal del machismo militarista y la violencia autoritaria como mecanismo de domesticación social; la hipocresía corporativa de las instituciones castrenses que sacrifican la verdad y la justicia para proteger su prestigio corporativo; y la fractura moral de una juventud obligada a adoptar máscaras de supervivencia.",
    simbolosClave = listOf(
        "Los dados en la oscuridad: Símbolo del azar ciego y la fatalidad que gobierna la vida de los cadetes en el encierro militar.",
        "Los 'perros': Apelativo zoológico despectivo que reciben los novatos del tercer año; simboliza la domesticación salvaje y la pérdida de dignidad impuesta por la institución.",
        "El uniforme militar: Máscara oficial de honor, virilidad y disciplina que encubre internamente la corrupción, el vicio, el racismo y la delincuencia.",
        "Las novelitas pornográficas de Alberto: Símbolo de la hipocresía burguesa; sirven a Alberto para sobrevivir económicamente y son usadas luego por los mandos para chantajearlo.",
        "La perra Malpapeada: Reflejo del desamparo afectivo y la animalización instintiva en los monólogos interiores del cadete Boa.",
        "El destierro a Juliaca del teniente Gamboa: Emblema del castigo que el sistema corrupto inflige al individuo íntegro que antepone la verdad a los intereses del poder.",
        "Teresa: La ilusión inalcanzable de pureza e inocencia en medio del fango de violencia moral de la ciudad y el cuartel."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Cuál es el móvil real por el que el Jaguar asesina al cadete Ricardo Arana ('El Esclavo')?",
            respuesta = "El Jaguar lo ejecuta de un disparo en la nuca durante las maniobras en Carabayllo como represalia implacable por haber traicionado el código de silencio del Círculo, al delatar al Serrano Cava por el robo del examen de química."
        ),
        PreguntaClaveObra(
            pregunta = "¿Cómo logran los mandos militares que Alberto ('El Poeta') retire la acusación de homicidio contra el Jaguar?",
            respuesta = "Lo someten a un chantaje moral: amenazan con expulsarlo y denunciarlo públicamente ante la sociedad limeña y su familia aristocrática como corruptor de menores, exhibiendo el paquete de novelitas pornográficas que le decomisaron en su casillero."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué destino sufre el teniente Gamboa por defender la verdad sobre el asesinato?",
            respuesta = "Es castigado por la cúpula militar por su falta de 'criterio institucional', siendo destituido de su cargo en Lima y desterrado a una inhóspita guarnición militar en Juliaca (Puno), truncando su carrera profesional."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué revelación mayúscula sobre la vida de los personajes se produce en el epílogo de la novela?",
            respuesta = "Se descubre que el narrador marginal de los pasajes de infancia en Bellavista era El Jaguar, quien en la vida civil se ha regenerado de la delincuencia trabajando honradamente en un banco y logrando casarse con Teresa."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué trascendental galardón literario obtuvo 'La ciudad y los perros' antes de su publicación en 1963?",
            respuesta = "Obtuvo en España el prestigioso Premio Biblioteca Breve de la editorial Seix Barral en 1962, hito que marcó el inicio y la consagración internacional del Boom Hispanoamericano."
        )
    )
)
