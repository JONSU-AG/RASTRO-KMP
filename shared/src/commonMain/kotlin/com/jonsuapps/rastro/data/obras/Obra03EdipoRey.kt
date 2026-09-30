package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra03EdipoRey = ObraLiteraria(
    id = "edipo-rey",
    titulo = "Edipo rey",
    autor = "Sófocles",
    anio = "ca. 429 a.C.",
    pais = "Grecia Antigua (Atenas)",
    genero = "Dramático",
    especie = "Tragedia",
    corriente = "Clasicismo Griego",
    temaPrincipal = "La fatalidad inexorable del destino (fatum/ananké), la imposibilidad del ser humano de eludir los decretos divinos, la ceguera del orgullo intelectual (hibris) y la asunción moral de la verdad mediante la ceguera autoinfligida y el destierro.",
    colorHex = "#7C3AED",
    categoria = "Literatura Universal",
    sinopsis = """La tragedia se desenvuelve en un solo día ante las puertas del palacio real de Tebas. La ciudad se encuentra devastada por una peste misteriosa que esteriliza los campos, pudre el ganado y siega la vida de los ciudadanos. Una multitud suplicante acude ante el rey Edipo, quien años atrás salvó a la polis de la mortífera Esfinge al resolver su enigma. Edipo informa que ya envió a su cuñado Creonte a consultar el oráculo de Apolo en Delfos. Creonte regresa anunciando el mandato divino: la plaga solo cesará cuando Tebas purifique el miasma (contaminación sacrílega) que la infecta, desterrando o castigando con la muerte al asesino del rey Layo, anterior monarca asesinado impunemente en un camino. Edipo jura públicamente investigar el caso con rigor implacable, proclamando un bando de excomunión y maldición eterna sobre el culpable desconocido, incluyendo a sí mismo si llegara a albergarlo bajo su propio techo.

A sugerencia del coro, Edipo interroga al anciano adivino ciego Tiresias. Ante la reticencia de este por evitar un sufrimiento inútil, Edipo lo insulta y lo acusa de conspirador. Provocado, Tiresias le arroja la espantosa verdad a la cara: Edipo es el asesino que busca, y pronto se revelará que es a la vez hijo y esposo de su madre, y hermano y padre de sus propios hijos. Edipo, cegado por su soberbia, lo tilda de impostor y acusa a Creonte de fraguar un complot político para arrebatarle la corona. La reina Yocasta interviene para apaciguar la disputa; para demostrarle la supuesta falsedad de los oráculos, le relata que a Layo le vaticinaron morir a manos de su hijo, pero que el infante fue arrojado al nacer con los tobillos perforados al monte Citerón y Layo murió a manos de bandoleros extranjeros en una encrucijada de tres caminos en Fócida. Lejos de sosegar a Edipo, el relato desata su pánico: recuerda que en su juventud huyó para siempre de Corinto tras predecirle el oráculo de Delfos que mataría a su padre y se acostaría con su madre (creyendo que sus progenitores eran los reyes Pólibo y Mérope), y que precisamente en esa misma encrucijada dio muerte con su bastón a un anciano altanero que viajaba en carro tras una disputa de tránsito.

La tensión se intensifica con la llegada del Mensajero de Corinto, quien anuncia la muerte natural por vejez del rey Pólibo. Yocasta celebra el aparente fracaso de las profecías parricidas, pero Edipo teme aún la profecía de cometer incesto con su madre Mérope. Para tranquilizarlo por completo, el mensajero comete la revelación destructiva: le informa que Pólibo y Mérope no eran sus padres biológicos, sino que él mismo recibió a Edipo de niño en el monte Citerón con los pies atravesados con clavos de hierro de manos de otro pastor perteneciente a la servidumbre de Layo. Al escuchar estas palabras, Yocasta comprende en un relámpago la espantosa verdad, suplica en vano a Edipo que detenga la investigación y huye enloquecida al interior del palacio. Edipo hace comparecer al anciano Pastor de Layo y, bajo amenaza de tortura, le arranca la confesión final: aquel niño entregado era el propio hijo de Layo y Yocasta, abandonado por orden de la reina para evitar el cumplimiento del oráculo funesto.

Ante la consumación de la anagnórisis total, Edipo prorrumpe en un desgarrador clamor comprendiendo que mató a su padre, engendró con su madre y maldijo su propia existencia. Entra al palacio y halla a Yocasta ahorcada en las vigas del lecho nupcial. Edipo arranca los broches de oro cincelado del vestido de su madre y esposa y se los clava repetidamente en los ojos, haciendo brotar chorros de sangre oscura para no contemplar en el Hades a los padres que ultrajó ni en Tebas a los frutos del incesto. Ciego y bañado en sangre, Edipo abraza a sus pequeñas hijas Antígona e Ismene lamentando su infausto porvenir, y es conducido al interior para aguardar el destierro al monte Citerón ordenado por Creonte, confirmando la sentencia del coro de que a ningún mortal se le puede llamar verdaderamente feliz antes del último día de su vida.""",
    contextoHistorico = """Edipo Rey fue escrita por Sófocles y representada en Atenas hacia el 429 a.C., durante el esplendor del Siglo de Pericles. Refleja el auge del racionalismo ateniense y el debate filosófico entre la confianza en la inteligencia humana (representada por el sabio Edipo) y la soberanía inquebrantable de la ley divina y el orden cósmico (representado por los oráculos de Apolo y el adivino Tiresias).

En la historia de la teoría literaria, Aristóteles en su Poética declaró a Edipo Rey como el paradigma perfecto de la tragedia griega clásica. La obra cumple con rigor insuperable la regla de las Tres Unidades (unidad de tiempo en un solo día, unidad de lugar ante el palacio de Tebas y unidad de acción en torno a la búsqueda del asesino de Layo) y articula de modo magistral los conceptos de hamartia (error trágico involuntario), peripeteia (inversión súbita de la fortuna), anagnórisis (reconocimiento estremecedor de la identidad) y catarsis (purificación de las pasiones mediante la piedad y el terror).""",
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "1. Prólogo: La Peste en Tebas y el Oráculo Délfico",
            detalle = "El pueblo tebano suplica a Edipo que salve a la ciudad de la mortífera peste que esteriliza campos y mujeres. Creonte regresa de Delfos con la respuesta de Apolo: la peste cesará únicamente cuando se purifique la tierra expulsando o ejecutando al asesino impune del antiguo rey Layo. Edipo asume la misión como propia prometiendo desentrañar el crimen."
        ),
        EscenaTrama(
            titulo = "2. Episodio 1: El Bando de Edipo y la Furia Profética de Tiresias",
            detalle = "Edipo promulga un edicto maldiciendo al asesino y decretando su aislamiento absoluto. Comparece el adivino ciego Tiresias, quien rehúye hablar; ante los insultos y acusaciones de complicidad de Edipo, Tiresias proclama que Edipo mismo es el asesino maldito, profetizando que terminará ciego, mendigo y desterrado tras descubrirse parricida e incestuoso. Edipo lo expulsa creyendo que es una conspiración de Creonte."
        ),
        EscenaTrama(
            titulo = "3. Episodio 2: El Choque con Creonte y la Revelación Involuntaria de Yocasta",
            detalle = "Edipo acusa a Creonte de alta traición. Yocasta interviene y, para calmarlo desacreditando a los oráculos, cuenta que Layo murió en una encrucijada de tres caminos en Fócida a manos de bandoleros y que su hijo fue arrojado al nacer con los pies perforados al Citerón. El detalle del trivio aterroriza a Edipo, quien recuerda haber matado a un anciano en un carro en ese mismo lugar tras huir de Corinto por el oráculo que le auguraba matar a su padre y yacer con su madre."
        ),
        EscenaTrama(
            titulo = "4. Episodio 3: El Mensajero de Corinto y la Huida de Yocasta",
            detalle = "Un mensajero llega de Corinto anunciando la muerte natural del rey Pólibo. Edipo siente alivio pero teme aún a su madre Mérope. El mensajero, para calmarlo, le revela que Pólibo no era su padre de sangre, sino que él mismo lo recibió de un pastor de Layo en el monte Citerón con los tobillos clavados. Yocasta comprende la espantosa verdad, suplica a Edipo que cese la indagación y huye al palacio gritando de agonía."
        ),
        EscenaTrama(
            titulo = "5. Episodio 4: El Pastor de Layo y la Anagnórisis Total",
            detalle = "El anciano pastor de Layo es interrogado bajo amenaza de tortura. Confiesa que entregó al niño por piedad al mensajero corintio y que era hijo del propio Layo y de Yocasta, nacido bajo el oráculo de que mataría a sus padres. Se produce la anagnórisis absoluta: Edipo comprende con pavor que es hijo de Layo, asesino de su padre y esposo de su propia madre, huyendo al palacio en medio de alaridos."
        ),
        EscenaTrama(
            titulo = "6. Éxodo: El Suicidio de Yocasta, la Ceguera y el Destierro",
            detalle = "Un criado relata que Yocasta se ahorcó con sus trenzas en la cámara nupcial. Edipo derriba las puertas, desprende los broches dorados del vestido de su madre y se los clava furiosamente en los ojos para no ver su ignominia. Aparece bañado en sangre, abraza por última vez a sus hijas Antígona e Ismene y es conducido al encierro por Creonte, nuevo soberano, aguardando el destierro al monte Citerón."
        )
    ),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Edipo",
            rol = "Rey de Tebas y protagonista trágico",
            descripcion = "Monarca de noble corazón, justiciero e intelectual que descifró el enigma de la Esfinge. Víctima de la hamartia y la hibris racionalista, investiga el regicidio hasta descubrir su propia identidad como parricida e incestuoso, arrancándose los ojos en castigo."
        ),
        PersonajeLiterario(
            nombre = "Yocasta",
            rol = "Reina de Tebas, viuda de Layo, madre y esposa de Edipo",
            descripcion = "Mujer escéptica de los oráculos que busca la paz de su esposo. Al percatarse de la identidad de Edipo antes que él, intenta frenar la indagación y se ahorca en la alcoba nupcial al no soportar el horror del incesto."
        ),
        PersonajeLiterario(
            nombre = "Creonte",
            rol = "Hermano de Yocasta y cuñado de Edipo",
            descripcion = "Hombre de Estado prudente, moderado y respetuoso de las leyes divinas. Acusado injustamente de conspiración por Edipo, asume la regencia tras la catástrofe con compasión y sobriedad."
        ),
        PersonajeLiterario(
            nombre = "Tiresias",
            rol = "Adivino ciego consagrado a Apolo",
            descripcion = "Vidente espiritual de Tebas. Encarna la sabiduría trágica: ciego físicamente pero dotado de visión moral plena, advierte a Edipo sobre su destino y la ceguera interior que nubla su soberbia."
        ),
        PersonajeLiterario(
            nombre = "Mensajero de Corinto",
            rol = "Antiguo pastor que entrega al infante a Pólibo",
            descripcion = "Llega creyendo traer buenas noticias sobre la corona de Corinto y la muerte de Pólibo; al revelar que Edipo fue un expósito con los pies perforados recogido en el Citerón, desata la peripeteia fatal."
        ),
        PersonajeLiterario(
            nombre = "Pastor de Layo",
            rol = "Único superviviente del trivio y siervo de palacio",
            descripcion = "Anciano que por piedad desobedeció la orden de abandonar al infante en el Citerón. Interrogado a la fuerza por Edipo, aporta el testimonio definitivo que consuma la anagnórisis."
        ),
        PersonajeLiterario(
            nombre = "Antígona e Ismene",
            rol = "Hijas de Edipo y Yocasta",
            descripcion = "Niñas inocentes nacidas de la unión incestuosa; protagonizan el doloroso llanto final al ser abrazadas por su padre ciego antes de su partida al destierro."
        ),
        PersonajeLiterario(
            nombre = "Coro de Ancianos Tebanos",
            rol = "Voz colectiva y conciencia cívico-moral",
            descripcion = "Representa la polis acongojada por la peste; comenta la acción dramática, invoca a los dioses y clausura la tragedia advirtiendo sobre la mutabilidad de la fortuna humana."
        )
    ),
    simbolosClave = listOf(
        "La Ceguera y la Visión: Contraste ontológico entre Tiresias (ciego exterior pero clarividente interior) y Edipo (vidente físico en el trono pero ciego absoluto sobre su identidad y destino).",
        "La Encrucijada de Tres Caminos (Trivio de Fócida): Lugar fatídico donde confluyen el destino inexorable, el conflicto de soberbia humana y el parricidio involuntario.",
        "Los Broches Dorados de Yocasta: Instrumento del autocastigo mediante el cual Edipo se arranca los ojos, asumiendo con lucidez ética la expiación en tinieblas para no ver en el Hades a los padres que ultrajó.",
        "Los Pies Perforados e Hinchados: Marca física imborrable del oráculo que da nombre al héroe (Oidípous) desde su martirio infantil en el monte Citerón.",
        "El Miasma y la Peste: Contaminación moral y sacrílega que quiebra el orden natural de Tebas por la impunidad del asesinato de Layo."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Quién mató al rey Layo y en qué lugar ocurrió el hecho?",
            respuesta = "Fue asesinado por su propio hijo Edipo en una encrucijada de tres caminos (el trivio de Fócida), tras una disputa violenta de tránsito donde Layo intentó expulsarlo del camino golpeándolo con su látigo."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué motivo Edipo huyó de Corinto en su juventud?",
            respuesta = "Porque el oráculo de Delfos le profetizó que mataría a su padre y desposaría a su madre, y él creía erróneamente que sus padres legítimos eran los reyes de Corinto, Pólibo y Mérope."
        ),
        PreguntaClaveObra(
            pregunta = "¿De qué manera muere la reina Yocasta en la tragedia?",
            respuesta = "Se suicida ahorcándose con sus propias trenzas en la alcoba nupcial tras comprender el horror del incesto al escuchar al mensajero de Corinto."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué razón Edipo se arranca los ojos en lugar de suicidarse?",
            respuesta = "Porque el suicidio habría sido una evasión cobarde; se arranca los ojos con los broches de Yocasta para expiar conscientemente su culpa en tinieblas, pues no soportaría mirar a sus padres en el Hades ni a sus hijas en Tebas."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué enigma resolvió Edipo a la Esfinge para ascender al trono de Tebas?",
            respuesta = "El enigma sobre qué ser camina a cuatro patas al amanecer, a dos al mediodía y a tres al atardecer: el hombre (en la niñez gatea, en la adultez camina erguido y en la vejez se apoya en un bastón)."
        )
    )
)
