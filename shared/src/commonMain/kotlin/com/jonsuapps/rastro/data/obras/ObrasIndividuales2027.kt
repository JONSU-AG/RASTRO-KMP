package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

/** Each collection has its own reading sheet. First entries keep their legacy IDs for saved links. */
private fun individual(base: ObraLiteraria, id: String = base.id, title: String, year: String,
    genre: String, species: String, movement: String, main: String, summary: String, context: String,
    sections: List<EscenaTrama>, symbols: List<String>, questions: List<PreguntaClaveObra>,
    characters: List<PersonajeLiterario> = emptyList()) = base.copy(
    id = id, titulo = title, anio = year, genero = genre, especie = species, corriente = movement,
    temaPrincipal = main, sinopsis = summary, contextoHistorico = context, analisisTrama = sections,
    simbolosClave = symbols, preguntasClave = questions, personajes = characters, coverUrl = "", bannerUrl = "")

val ObraRimas = individual(Obra12RimasYLeyendas, title = "Rimas", year = "1871 (edición póstuma)",
    genre = "Lírico", species = "Poemario", movement = "Romanticismo",
    main = "La creación poética, la ilusión amorosa y la pérdida, expresadas desde una voz íntima.",
    summary = """Rimas reúne poemas breves de Gustavo Adolfo Bécquer. No cuenta una historia continua: distintas voces y situaciones exploran qué es la poesía, cómo nace el amor y cómo se vive su fracaso. El yo lírico no debe identificarse automáticamente con el autor biográfico.

    Predominan la sugerencia, la musicalidad y las imágenes sencillas cargadas de emoción. La anáfora, el paralelismo y la rima asonante ayudan a convertir una experiencia interior en un ritmo memorable. La naturaleza puede acompañar el sentimiento, pero no es una descripción ornamental independiente.

    En la rima LIII, el regreso de las golondrinas y las madreselvas contrasta con la imposibilidad de repetir cierto amor. La repetición de fenómenos naturales hace más visible la irreversibilidad de la experiencia humana. Para estudiar el conjunto, distingue el tema del poema, su hablante, sus imágenes y el efecto de sus recursos; no busques un reparto fijo de personajes.""".trimIndent(),
    context = "Bécquer representa una vertiente intimista del Romanticismo español. Sus amigos publicaron sus obras después de su muerte. La agrupación de las Rimas por asuntos poéticos y amorosos facilita la lectura, pero no convierte el libro en una novela.",
    sections = listOf(EscenaTrama("La poesía", "El lenguaje intenta expresar una experiencia que no siempre puede nombrarse directamente."),
        EscenaTrama("Amor y desengaño", "La ilusión inicial contrasta con la distancia, el fracaso y la soledad."),
        EscenaTrama("Lectura de la rima LIII", "El contraste entre retorno natural y amor irrepetible organiza su sentido.")),
    symbols = listOf("Golondrinas: regreso cíclico frente al amor irrepetible", "Música y ritmo: sugerencia emocional"),
    questions = listOf(PreguntaClaveObra("¿Es Rimas una colección de relatos?", "No. Es un poemario; Leyendas es el conjunto narrativo del mismo autor.")))

val ObraLeyendas = individual(Obra12RimasYLeyendas, id = "leyendas-becquer", title = "Leyendas",
    year = "1858–1864 (publicaciones en prensa)", genre = "Narrativo", species = "Relatos legendarios", movement = "Romanticismo",
    main = "El encuentro de lo cotidiano con lo sobrenatural, el deseo y la transgresión.",
    summary = """Leyendas reúne narraciones independientes, no capítulos de una sola aventura. Bécquer utiliza ambientes antiguos, ruinas, monasterios y tradiciones locales para introducir incertidumbre y sucesos extraordinarios. Las figuras y el conflicto deben estudiarse dentro de cada relato.

    En El monte de las Ánimas, Alonso entra en un espacio temido para recuperar una banda que Beatriz le pide. La noche y los relatos sobre los templarios preparan la amenaza. El desenlace transforma el juego inicial de Beatriz en terror y culpa. El deseo de demostrar amor no elimina el peligro del lugar.

    En Los ojos verdes, Fernando persigue a una figura misteriosa vinculada a una fuente. La atracción por una belleza ideal acaba enfrentándolo con lo sobrenatural. El rayo de luna plantea otra variante: Manrique confunde una apariencia luminosa con la mujer ideal que busca. Los relatos permiten comparar deseo, percepción e imaginación sin atribuirles a todos el mismo desenlace.""".trimIndent(),
    context = "Los relatos circularon en periódicos del siglo XIX y se recopilaron después. Su interés por el pasado y las tradiciones convive con la exploración romántica de la subjetividad y lo fantástico.",
    sections = listOf(EscenaTrama("El monte de las Ánimas", "La petición de Beatriz provoca una salida nocturna y un desenlace sobrenatural."),
        EscenaTrama("Los ojos verdes", "El deseo de Fernando lo aproxima al misterio de la fuente."),
        EscenaTrama("El rayo de luna", "La imaginación de Manrique convierte una percepción fugaz en una búsqueda imposible.")),
    symbols = listOf("Ruinas y noche: memoria y amenaza", "Fuente: atracción y frontera sobrenatural"),
    characters = listOf(PersonajeLiterario("Alonso y Beatriz", "El monte de las Ánimas", "Su relación impulsa la incursión nocturna."),
        PersonajeLiterario("Manrique", "El rayo de luna", "Busca una figura ideal nacida de una percepción equivocada.")),
    questions = listOf(PreguntaClaveObra("¿Alonso aparece como protagonista de todas las Leyendas?", "No. Pertenece a El monte de las Ánimas; cada relato tiene su propia historia.")))

val ObraFicciones = individual(Obra16BorgesFiccionesAleph, title = "Ficciones", year = "1944",
    genre = "Narrativo", species = "Libro de cuentos", movement = "Narrativa fantástica y metafísica",
    main = "Los límites del conocimiento, la identidad y el tiempo mediante libros y mundos imaginarios.",
    summary = """Ficciones se organiza en El jardín de senderos que se bifurcan y Artificios. Sus cuentos proponen problemas intelectuales mediante narradores, documentos y bibliotecas ficticias. Las referencias eruditas pueden formar parte de la invención: no todo libro citado dentro de un relato existe fuera de él.

    La biblioteca de Babel imagina una biblioteca de enormes galerías cuyos libros contienen combinaciones de signos. La abundancia de textos no garantiza encontrar sentido: los habitantes buscan explicaciones y catálogos que ordenen el universo. Pierre Menard, autor del Quijote muestra cómo un texto verbalmente idéntico puede leerse de otra manera cuando cambia su contexto de producción.

    En El jardín de senderos que se bifurcan, una trama de espionaje se cruza con la idea de tiempos que se abren en alternativas. En Funes el memorioso, una memoria extraordinaria plantea el problema de abstraer y pensar. Son historias independientes unidas por procedimientos y preocupaciones, no una novela protagonizada por una sola persona.""".trimIndent(),
    context = "Publicado en Buenos Aires en 1944, el libro consolida una narrativa que combina formas policiales y fantásticas con interrogantes filosóficos. El Aleph, de 1949, es otra colección.",
    sections = listOf(EscenaTrama("Libros y mundos", "Los documentos ficticios vuelven inestable la frontera entre realidad e invención."),
        EscenaTrama("Tiempo y memoria", "La bifurcación temporal y la memoria de Funes cuestionan la experiencia habitual.")),
    symbols = listOf("Biblioteca: universo de signos y búsqueda de sentido", "Laberinto: alternativas y dificultad del conocimiento"),
    questions = listOf(PreguntaClaveObra("¿El cuento El Aleph forma parte de Ficciones?", "No. Da título a otra colección, publicada en 1949.")))

val ObraElAleph = individual(Obra16BorgesFiccionesAleph, id = "el-aleph", title = "El Aleph", year = "1949",
    genre = "Narrativo", species = "Libro de cuentos", movement = "Narrativa fantástica y metafísica",
    main = "La totalidad, el infinito y las paradojas de percibir y contar el mundo.",
    summary = """El Aleph reúne cuentos diferentes y toma su nombre de uno de ellos. En el relato homónimo, un narrador llamado Borges conserva el recuerdo de Beatriz Viterbo y visita a Carlos Argentino Daneri. Daneri afirma que en el sótano de su casa existe un punto donde pueden verse simultáneamente todos los lugares del mundo.

    La experiencia extraordinaria contrasta con una casa y una rivalidad literaria muy cotidianas. El narrador intenta enumerar lo visto, pero el lenguaje obliga a presentar una cosa después de otra: contar una visión simultánea ya supone transformarla. La duda final mantiene abierta la interpretación del fenómeno y del propio narrador.

    Otros cuentos del volumen, como Emma Zunz, La casa de Asterión y La escritura del dios, exploran venganza, identidad y conocimiento desde sus propios personajes. Asterión no es Daneri ni comparte su argumento. Para repasar, diferencia siempre el nombre de la colección, el cuento concreto y su conflicto.""".trimIndent(),
    context = "La colección se publicó en 1949. El relato El Aleph había aparecido en la revista Sur en 1945. La primera publicación del cuento y la fecha del libro son datos distintos.",
    sections = listOf(EscenaTrama("Visitas y memoria", "El recuerdo de Beatriz conduce a los encuentros con Daneri."),
        EscenaTrama("El sótano", "La visión de la totalidad pone a prueba la percepción y su expresión verbal."),
        EscenaTrama("Otros relatos", "Cada cuento desarrolla un problema independiente; no continúa la historia del sótano.")),
    symbols = listOf("Aleph: punto de percepción de la totalidad", "Sótano: lo extraordinario alojado en lo cotidiano"),
    characters = listOf(PersonajeLiterario("Carlos Argentino Daneri", "El Aleph", "Relaciona el fenómeno del sótano con su proyecto literario."),
        PersonajeLiterario("Beatriz Viterbo", "El Aleph", "Su recuerdo da sentido a las visitas del narrador.")),
    questions = listOf(PreguntaClaveObra("¿Cuándo se publicó el libro El Aleph?", "En 1949; el cuento homónimo apareció antes, en 1945.")))

val ObraTrilce = individual(Obra23TrilceYPoemasHumanos, title = "Trilce", year = "1922",
    genre = "Lírico", species = "Poemario", movement = "Vanguardismo",
    main = "La ruptura del lenguaje para expresar orfandad, encierro, tiempo y experiencia corporal.",
    summary = """Trilce reúne 77 poemas numerados. No es una novela ni una colección ordenada por una trama continua. Vallejo modifica sintaxis, puntuación, ritmos y vocabulario, de modo que la dificultad verbal participa en lo que el poema expresa.

    La ausencia familiar, la infancia, el amor, el cuerpo y el encierro reaparecen desde perspectivas distintas. En el poema III, la espera infantil frente a la ausencia de los mayores produce inquietud. En el XVIII, las paredes del espacio carcelario concentran la experiencia del límite. Esas situaciones permiten aproximarse al texto antes de reducirlo a una definición de vanguardia.

    Para leerlo, identifica quién habla, qué imágenes se repiten y qué relación existe entre las palabras. Una anomalía gramatical puede tener una función expresiva. La biografía aporta contexto, pero no autoriza a explicar cada verso como la transcripción de un episodio real.""".trimIndent(),
    context = "Se publicó en Lima en 1922. Corresponde al período peruano de Vallejo y marca una renovación radical respecto de las formas más reconocibles de Los heraldos negros.",
    sections = listOf(EscenaTrama("Infancia y ausencia", "La voz recuerda vínculos familiares desde la pérdida."),
        EscenaTrama("Encierro y lenguaje", "La fractura verbal comunica límites y dificultades de la experiencia.")),
    symbols = listOf("Paredes: encierro y límite", "Mesa familiar: vínculo y ausencia"),
    questions = listOf(PreguntaClaveObra("¿Trilce tiene personajes y capítulos como una novela?", "No. Es un poemario de 77 composiciones numeradas.")))

val ObraPoemasHumanos = individual(Obra23TrilceYPoemasHumanos, id = "poemas-humanos", title = "Poemas humanos",
    year = "1939 (edición póstuma)", genre = "Lírico", species = "Poemario", movement = "Poesía vallejiana de madurez",
    main = "El sufrimiento humano y la solidaridad, expresados desde el cuerpo, el trabajo y la vida cotidiana.",
    summary = """Poemas humanos reúne textos de la etapa europea de Vallejo publicados después de su muerte. El dolor individual se vincula con la pobreza, el hambre, el trabajo y la condición compartida de otros seres humanos. La voz puede pasar de un caso concreto a una preocupación colectiva.

    En Los nueve monstruos, el crecimiento del dolor vuelve insuficientes las explicaciones simples y exige una respuesta solidaria. En Piedra negra sobre una piedra blanca, la voz imagina su muerte y articula una experiencia de desamparo. Su enunciación poética no convierte el poema en una predicción literal.

    Hay contrastes entre abstracciones y objetos cotidianos, desplazamientos de sentido y una presencia intensa del cuerpo. La lectura debe relacionar estos recursos con el problema del poema. España, aparta de mí este cáliz es un conjunto diferenciado, aunque algunas ediciones lo presenten junto a la poesía póstuma. El poema Masa pertenece a ese conjunto y no debe trasladarse sin aclaración a Poemas humanos.""".trimIndent(),
    context = "La primera edición apareció en París en 1939. Su carácter póstumo obliga a distinguir las decisiones de edición de los libros que el autor publicó en vida.",
    sections = listOf(EscenaTrama("Dolor compartido", "El padecimiento supera al individuo y se vuelve una preocupación humana."),
        EscenaTrama("Cuerpo y vida cotidiana", "Hambre, trabajo y objetos concretos aproximan la reflexión al mundo material.")),
    symbols = listOf("Hambre: necesidad material y sufrimiento", "Cuerpo: condición vulnerable y común"),
    questions = listOf(PreguntaClaveObra("¿Fue publicado en vida de Vallejo?", "No. La edición inicial es póstuma, de 1939.")))

val ObraLosHeraldosNegros = individual(Obra23TrilceYPoemasHumanos, id = "los-heraldos-negros", title = "Los heraldos negros",
    year = "1919 (portada fechada en 1918)", genre = "Lírico", species = "Poemario", movement = "Modernismo y transición a una voz propia",
    main = "El dolor, el hogar, la pérdida y la experiencia andina en la primera poesía de Vallejo.",
    summary = """Los heraldos negros es el primer libro de poemas de César Vallejo. Conserva recursos modernistas, pero incorpora una voz marcada por la vulnerabilidad, la vida familiar y referentes andinos. El poema que abre el libro presenta golpes vitales que la voz no logra explicar por completo: la incertidumbre forma parte de su sentido.

    Las secciones del volumen reúnen experiencias amorosas, paisajes y recuerdos del hogar. A mi hermano Miguel evoca un juego infantil cuya espera se transforma al descubrir la ausencia definitiva. Los pasos lejanos se aproxima al hogar y a los padres desde la distancia. Estos poemas no son escenas de una narración única, sino modos distintos de expresar pérdida y pertenencia.

    La imagen religiosa puede convivir con preguntas y tensiones ante el sufrimiento. Para estudiar, distingue el libro del poema homónimo y relaciona sus recursos con la voz que habla. Tampoco lo clasifiques como si tuviera la misma ruptura lingüística de Trilce: pertenece a otro momento de la trayectoria del autor.""".trimIndent(),
    context = "La portada consigna 1918, pero el libro circuló en julio de 1919. Por eso aparecen ambas fechas en bibliografías; conviene indicar qué fecha se está usando.",
    sections = listOf(EscenaTrama("Dolor e incertidumbre", "El poema inicial expresa el desconcierto frente a los golpes de la vida."),
        EscenaTrama("Hogar y memoria", "Los vínculos familiares adquieren intensidad desde la ausencia.")),
    symbols = listOf("Hogar: pertenencia y memoria", "Juego infantil: vínculo fraterno y pérdida"),
    questions = listOf(PreguntaClaveObra("¿Por qué se citan 1918 y 1919?", "1918 figura en la portada; la circulación efectiva del libro comenzó en 1919.")))

val ObraYaravies = individual(Obra29YaraviesYFabulas, title = "Yaravíes", year = "Siglo XIX (recopilación póstuma)",
    genre = "Lírico", species = "Yaraví", movement = "Precursor del Romanticismo peruano",
    main = "El amor doloroso y la ausencia en una lírica que dialoga con la tradición del harawi.",
    summary = """Los yaravíes de Mariano Melgar expresan amor, queja, distancia y pérdida mediante una voz lírica íntima. No son una novela sobre Silvia: ese nombre funciona como destinataria poética y debe distinguirse de las interpretaciones biográficas.

    El yaraví mestizo recoge la tonalidad elegíaca asociada a la tradición andina del harawi y la articula en castellano. La musicalidad y la repetición refuerzan la intensidad de la súplica. La naturaleza y figuras como la paloma sirven para expresar el vínculo amoroso y la separación.

    Para analizar un yaraví, identifica al hablante, el destinatario, el sentimiento dominante y el efecto del ritmo. No basta memorizar que es romántico: interesa reconocer cómo se expresa la subjetividad. Sus asuntos y procedimientos son diferentes de las fábulas, que emplean una narración breve para proponer una enseñanza o crítica.""".trimIndent(),
    context = "Melgar desarrolló su producción a comienzos del siglo XIX. Su participación en la independencia y su formación clásica forman parte del contexto, sin convertir todo poema amoroso en un discurso político.",
    sections = listOf(EscenaTrama("Queja y súplica", "La voz intenta recuperar o sostener un amor ausente."),
        EscenaTrama("Tradición y renovación", "La expresión castellana dialoga con una sensibilidad lírica andina.")),
    symbols = listOf("Paloma: representación amorosa", "Ausencia: motivo del lamento"),
    questions = listOf(PreguntaClaveObra("¿Un yaraví equivale a una fábula?", "No. El yaraví es lírico; la fábula narra una situación con alcance didáctico.")))

val ObraFabulasMelgar = individual(Obra29YaraviesYFabulas, id = "fabulas-melgar", title = "Fábulas",
    year = "Siglo XIX", genre = "Narrativo", species = "Fábulas en verso", movement = "Tradición didáctica y crítica social",
    main = "La crítica de conductas y relaciones de poder mediante relatos breves y alegóricos.",
    summary = """Las fábulas de Melgar emplean situaciones narrativas y figuras humanas o animales para examinar conductas. La enseñanza se obtiene al relacionar las acciones con sus consecuencias. La personificación permite representar problemas sociales sin formularlos siempre como una exposición directa.

    En El cantero y el asno, el animal se dirige a quien pretende imponerle una carga. La respuesta cuestiona la injusticia del trato y obliga a mirar la relación entre quien manda y quien soporta el trabajo. La fábula puede leerse como crítica del abuso; no debe convertirse en una descripción literal de todas las instituciones de su tiempo.

    El estudio exige identificar situación inicial, conflicto, respuesta y enseñanza. La moraleja resume una interpretación, pero las acciones deben justificarla. Estos textos se presentan aparte de Yaravíes porque su finalidad didáctica y estructura narrativa son distintas de la expresión amorosa lírica.""".trimIndent(),
    context = "La escritura de Melgar dialoga con modelos clásicos de fábula y con la realidad social de comienzos del siglo XIX. Las recopilaciones póstumas reúnen textos de circulación diversa.",
    sections = listOf(EscenaTrama("Situación y conflicto", "Un mandato o conducta provoca la respuesta que hace visible el problema."),
        EscenaTrama("Enseñanza", "La conclusión se interpreta a partir de las consecuencias del relato.")),
    symbols = listOf("Animales personificados: conductas y posiciones sociales", "Carga: imagen del trabajo impuesto"),
    questions = listOf(PreguntaClaveObra("¿Qué distingue su lectura de la de un yaraví?", "En la fábula se analiza una acción y su enseñanza; en el yaraví, una experiencia lírica.")))

val ObraJornadaHeroica = individual(Obra37PercyGibson, title = "Jornada heroica", year = "1916",
    genre = "Lírico", species = "Poesía cívica", movement = "Modernismo",
    main = "La conmemoración cívica del combate del 2 de mayo desde una voz poética celebratoria.",
    summary = """Jornada heroica es una obra de Percy Gibson Möller publicada en Arequipa en 1916. Su asunto cívico se relaciona con la conmemoración del combate del 2 de mayo de 1866. La voz poética celebra una memoria pública mediante un tono elevado.

    En una lectura de poesía cívica, interesa distinguir el acontecimiento histórico de su representación literaria. El ritmo, las imágenes y la exaltación construyen una valoración del hecho; el poema no reemplaza una fuente histórica sobre todos sus detalles.

    Gibson pertenece a la renovación literaria arequipeña asociada al modernismo y al ambiente del Aquelarre. Esta ficha corresponde a un título individual, no a una supuesta colección que agrupe todos sus poemas. Tampoco deben confundirse Percy Gibson Möller y su hijo Percy Gibson Parra.""".trimIndent(),
    context = "La Biblioteca Nacional del Perú registra Jornada heroica como obra de 1916. Su título se conserva sin atribuir al autor colecciones no verificadas.",
    sections = listOf(EscenaTrama("Conmemoración", "Una voz celebratoria representa una memoria cívica."),
        EscenaTrama("Lectura literaria", "El tono elevado se estudia como elección expresiva, no como prueba histórica.")),
    symbols = listOf("Heroísmo: construcción de una memoria cívica"),
    questions = listOf(PreguntaClaveObra("¿Quién es el autor?", "Percy Gibson Möller, vinculado al modernismo y al ambiente literario arequipeño.")))

val ObraJakeAru = individual(Obra39JoseLuisAyala, title = "Jake Aru", year = "1981 (edición consultada)",
    genre = "Lírico", species = "Poemario bilingüe", movement = "Poesía aimara contemporánea",
    main = "La expresión de una voz aimara y su diálogo con la memoria, el territorio y la experiencia social.",
    summary = """Jake Aru es un poemario de José Luis Ayala escrito en aimara y acompañado de traducción al español. La edición registrada por la Universidad Nacional Mayor de San Marcos permite identificarlo como una obra individual y estudiar la relación entre lengua y expresión literaria.

    La disposición bilingüe invita a reconocer que una traducción ofrece acceso al sentido sin reproducir necesariamente todos los sonidos y asociaciones de la lengua original. La lectura debe atender al hablante, al destinatario y a las imágenes de cada composición.

    El índice incluye textos vinculados con espacios peruanos y figuras de la memoria andina. Estos referentes permiten contextualizar la propuesta, pero no autorizan a inventar un argumento continuo ni un reparto de personajes: se trata de un poemario. Su presencia en Obras acompaña al autor solicitado por el temario sin usar títulos o fechas que no pudieron verificarse.""".trimIndent(),
    context = "La Biblioteca Pedro Zulen de la UNMSM registra la edición de enero de 1981, publicada por Ediciones El Pez de Oro. Esa fecha identifica la edición consultada y no se presenta como una primera edición demostrada.",
    sections = listOf(EscenaTrama("Lengua y traducción", "La versión española aproxima al lector a la expresión aimara."),
        EscenaTrama("Territorio y memoria", "Los referentes se interpretan dentro de cada composición.")),
    symbols = listOf("Territorio: vínculo cultural y memoria", "Voz: expresión de una comunidad lingüística"),
    questions = listOf(PreguntaClaveObra("¿Es una novela histórica?", "No. La edición consultada es un poemario bilingüe aimara-español.")))

val ObraDiscursoPoliteama = individual(Obra22PajinasLibres, id = "discurso-en-el-politeama", title = "Discurso en el Politeama",
    year = "1888", genre = "Ensayístico", species = "Discurso", movement = "Realismo y pensamiento crítico",
    main = "La renovación del país mediante educación, responsabilidad política e inclusión de la población indígena.",
    summary = """El Discurso en el Politeama es un texto de Manuel González Prada leído en una velada de 1888, después de la derrota peruana en la Guerra del Pacífico. El autor examina la crisis nacional y atribuye responsabilidades a las élites y a las estructuras que reproducen ignorancia y exclusión.

    Su argumentación contrapone el fracaso de los grupos dirigentes con la posibilidad de renovación de los jóvenes. La crítica de la obediencia intelectual y de las autoridades envejecidas se relaciona con la necesidad de educación y pensamiento propio. La población indígena ocupa un lugar decisivo: una nación que la margina no puede afirmar que integra realmente a todos sus habitantes.

    El tono combativo, las oposiciones y las exhortaciones buscan movilizar a un auditorio. Para estudiarlo, separa tesis, argumentos y recursos retóricos. No hay una trama de novela ni personajes ficticios; existen un emisor, destinatarios y problemas políticos. El texto fue incorporado a Pájinas libres, pero conserva su identidad como discurso individual.""".trimIndent(),
    context = "La posguerra planteó debates sobre derrota, reconstrucción y ciudadanía. Pájinas libres, publicado en 1894, es la colección de ensayos que contiene este discurso de 1888; ambas fechas no son intercambiables.",
    sections = listOf(EscenaTrama("Diagnóstico", "La derrota permite cuestionar las responsabilidades de los sectores dirigentes."),
        EscenaTrama("Renovación", "Educación, juventud e inclusión sustentan la propuesta de transformación.")),
    symbols = listOf("Juventud: posibilidad de renovación", "Educación: autonomía intelectual y ciudadanía"),
    questions = listOf(PreguntaClaveObra("¿1888 es la fecha de Pájinas libres?", "No. Corresponde al discurso; la colección apareció en 1894.")))

val ObraGallinazosSinPlumas = individual(Obra27LaPalabraDelMudo, id = "los-gallinazos-sin-plumas",
    title = "Los gallinazos sin plumas", year = "1955", genre = "Narrativo", species = "Cuento", movement = "Realismo urbano · Generación del 50",
    main = "La explotación infantil y la deshumanización en la periferia urbana.",
    summary = """Efraín y Enrique viven con su abuelo don Santos. Cada madrugada salen a recoger restos de comida en los basurales para alimentar a Pascual, el cerdo que el abuelo quiere engordar. Los niños realizan el trabajo que sostiene su proyecto económico, mientras sus necesidades quedan subordinadas a las del animal.

    Efraín se lastima y enferma; Enrique debe asumir una carga mayor y encuentra al perro Pedro, que ofrece una forma de compañía. La dureza de don Santos no disminuye con la enfermedad. La desaparición del perro y la violencia que lo rodea precipitan el enfrentamiento entre Enrique y su abuelo.

    Los hermanos salen juntos mientras detrás de ellos permanece el conflicto de la vivienda. El cierre no describe un futuro feliz asegurado: la ciudad continúa siendo un espacio incierto para los niños. El título compara su búsqueda de desperdicios con la de las aves carroñeras y hace visible una condición impuesta por la pobreza y el abuso, no un defecto moral de los menores.

    Para repasar, relaciona cada personaje con su función: don Santos ejerce dominio; Pascual concentra el interés económico; Pedro encarna compañía; los hermanos conservan un vínculo de apoyo. El cuento da nombre al libro de 1955 y posteriormente integra La palabra del mudo, colección más amplia.""".trimIndent(),
    context = "La narrativa urbana de Ribeyro observa vidas marginadas en la transformación de Lima. El cuento pertenece a la primera etapa de su producción y muestra la desigualdad mediante acciones concretas.",
    sections = listOf(EscenaTrama("Madrugadas", "Los niños recorren basurales para alimentar al cerdo del abuelo."),
        EscenaTrama("Enfermedad y abuso", "La fragilidad de Efraín no detiene las exigencias de don Santos."),
        EscenaTrama("Salida", "Enrique se enfrenta al abuelo y sale con su hermano hacia un futuro incierto.")),
    characters = listOf(PersonajeLiterario("Efraín y Enrique", "Hermanos", "Víctimas de explotación que se ayudan entre sí."),
        PersonajeLiterario("Don Santos", "Abuelo", "Subordina a los niños al engorde del cerdo."),
        PersonajeLiterario("Pascual", "Cerdo", "Concentra el proyecto económico de don Santos."),
        PersonajeLiterario("Pedro", "Perro", "Acompaña a Enrique y contrasta con la crueldad del entorno.")),
    symbols = listOf("Basural: marginación material", "Cerdo: interés económico que desplaza el cuidado humano"),
    questions = listOf(PreguntaClaveObra("¿El final garantiza que los niños estarán a salvo?", "No. Salen juntos, pero el relato mantiene incierto su destino en la ciudad.")))

val ObraEspanaCaliz = individual(Obra23TrilceYPoemasHumanos, id = "espana-aparta-de-mi-este-caliz",
    title = "España, aparta de mí este cáliz", year = "1939 (edición póstuma)", genre = "Lírico", species = "Poemario", movement = "Poesía de compromiso y solidaridad",
    main = "El sufrimiento de la guerra y la esperanza de una solidaridad humana capaz de responder a él.",
    summary = """Este conjunto de quince poemas responde a la Guerra Civil española. Vallejo aproxima el conflicto histórico a la experiencia del cuerpo, del pueblo y de la fraternidad. No es una crónica militar: los acontecimientos se transforman mediante voces e imágenes poéticas.

    En Masa, un combatiente muerto no se levanta ante los ruegos aislados. La convocatoria se amplía hasta que la humanidad entera lo rodea; entonces vuelve a la vida. El desenlace construye una imagen de solidaridad universal, no una explicación biológica de la resurrección.

    El título general dialoga con una imagen religiosa de sufrimiento. En la lectura, interesa cómo esa referencia se vincula con una situación colectiva. El libro tiene una identidad propia y debe distinguirse de Poemas humanos, aunque ambos figuren juntos en algunas ediciones de poesía póstuma.""".trimIndent(),
    context = "Vallejo escribió estos poemas durante la Guerra Civil española. La publicación póstuma de 1939 pertenece a un contexto distinto del de Trilce, aparecido en Lima en 1922.",
    sections = listOf(EscenaTrama("Guerra", "El conflicto colectivo se expresa mediante experiencias y voces humanas."),
        EscenaTrama("Masa", "La ampliación del ruego culmina en una imagen de fraternidad universal.")),
    symbols = listOf("Cáliz: sufrimiento", "Humanidad reunida: solidaridad"),
    questions = listOf(PreguntaClaveObra("¿A qué conjunto pertenece Masa?", "A España, aparta de mí este cáliz.")))
