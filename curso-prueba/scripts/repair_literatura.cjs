const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const newChallenges = {
  // Semana 01
  lit_t01_s01: [
    {
      id: "lit_t01_s01_c01",
      question: "En la teoría literaria moderna formulada por Roman Jakobson, la función poética del lenguaje se caracteriza principalmente por:",
      options: [
        "Centrar la atención en el propio mensaje por su configuración estética y estilística.",
        "Transmitir información fáctica y verificable acerca del entorno extralingüístico.",
        "Persuadir al receptor para que adopte una conducta o creencia determinada.",
        "Verificar que el canal de comunicación permanezca abierto y operativo."
      ],
      correctIndex: 0,
      explanation: "La función poética o estética orienta el acto comunicativo hacia el mensaje mismo, seleccionando y combinando signos para generar belleza, extrañamiento y valor artístico formal."
    },
    {
      id: "lit_t01_s01_c02",
      question: "¿Cuál de las siguientes composiciones líricas se caracteriza específicamente por ser un canto de lamento fúnebre ante la muerte de un ser querido o una pérdida irreparable?",
      options: [
        "La égloga pastoril",
        "La elegía",
        "El madrigal amoroso",
        "La oda laudatoria"
      ],
      correctIndex: 1,
      explanation: "La elegía es una especie lírica de tono melancólico que expresa dolor, pesadumbre y duelo ante la muerte o una desgracia honda (ej. Coplas a la muerte de su padre de Jorge Manrique)."
    },
    {
      id: "lit_t01_s01_c03",
      question: "En la preceptiva aristotélica expuesta en la Poética, la finalidad suprema de la tragedia clásica es la catarsis, entendida como:",
      options: [
        "El desenlace funesto inevitable determinado por el capricho de los dioses olímpicos.",
        "La resolución cómica de enredos mediante la intervención de un bufón o gracioso.",
        "La purificación o purga espiritual de las pasiones en el espectador a través del terror y la compasión.",
        "La ruptura de la cuarta pared para aleccionar moralmente a los ciudadanos atenienses."
      ],
      correctIndex: 2,
      explanation: "Aristóteles definió la catarsis (kátharsis) como la purificación espiritual de las emociones del público provocada al suscitar terror (phobos) y compasión (éleos) ante la catástrofe del héroe."
    },
    {
      id: "lit_t01_s01_c04",
      question: "La especie del género épico que relata en verso las hazañas heroicas y bélicas de los caballeros medievales en defensa de su fe y su pueblo se denomina:",
      options: [
        "Cantar de gesta",
        "Epopeya clásica",
        "Poema épico renacentista",
        "Romance fronterizo"
      ],
      correctIndex: 0,
      explanation: "Los cantares de gesta son poemas épicos medievales anónimos transmitidos por juglares que celebran a caballeros virtuosos e históricos (como el Cantar de Mio Cid o el Cantar de Roldán)."
    },
    {
      id: "lit_t01_s01_c05",
      question: "Lea con atención los siguientes versos de Gustavo Adolfo Bécquer:\n«Volverán las oscuras golondrinas / en tu balcón sus nidos a colgar...»\nPor su contenido subjetivo e íntimo, donde se expresan emociones personales del yo poético, este texto pertenece al género:",
      options: [
        "Épico",
        "Lírico",
        "Dramático",
        "Narrativo"
      ],
      correctIndex: 1,
      explanation: "El género lírico se distingue por la primacía de la interioridad subjetiva, la manifestación de vivencias afectivas y el predominio de la voz de un hablante lírico personal."
    },
    {
      id: "lit_t01_s01_c06",
      question: "¿Cuál es el subgénero dramático nacido en la modernidad que combina elementos trágicos y cómicos con el fin de representar la vida humana de forma más fiel a la realidad?",
      options: [
        "Auto sacramental",
        "Entremés",
        "Drama (o tragicomedia)",
        "Sainete"
      ],
      correctIndex: 2,
      explanation: "El drama o tragicomedia surge al romper la rígida separación clásica entre tragedia y comedia, mezclando pasiones solemnes con situaciones cotidianas o ligeras."
    },
    {
      id: "lit_t01_s01_c07",
      question: "La composición lírica bucólica en la que pastores idealizados dialogan en medio de una naturaleza amena e incontaminada (locus amoenus) corresponde a:",
      options: [
        "La égloga",
        "El epigrama",
        "La epístola",
        "El soneto heroico"
      ],
      correctIndex: 0,
      explanation: "La égloga es un subgénero poético de corte pastoril cultivado por Teócrito, Virgilio y magistralmente en España por Garcilaso de la Vega (Égloga I: Salicio y Nemoroso)."
    },
    {
      id: "lit_t01_s01_c08",
      question: "En una obra teatral, las notas explicativas que el autor intercala entre paréntesis o cursivas para indicar los movimientos, entradas, salidas y tonos de los actores se denominan:",
      options: [
        "Parlamentos",
        "Acotaciones (o didascalias)",
        "Soliloquios",
        "Apartes"
      ],
      correctIndex: 1,
      explanation: "Las acotaciones o didascalias son instrucciones del dramaturgo destinadas al director y actores para guiar la puesta en escena, gestualidad y escenografía."
    },
    {
      id: "lit_t01_s01_c09",
      question: "La novela, el cuento y la fábula son especies literarias que pertenecen formalmente al género:",
      options: [
        "Lírico",
        "Dramático",
        "Narrativo",
        "Expositivo"
      ],
      correctIndex: 2,
      explanation: "El género narrativo (evolución moderna de la épica en prosa) se estructura en torno a un narrador que relata acontecimientos ficticios protagonizados por personajes en un espacio y tiempo definidos."
    },
    {
      id: "lit_t01_s01_c10",
      question: "El subgénero lírico que consiste en una composición poética breve, ingeniosa y habitualmente festiva o satírica con un remate mordaz se denomina:",
      options: [
        "Epigrama",
        "Oda",
        "Madrigal",
        "Himno"
      ],
      correctIndex: 0,
      explanation: "El epigrama es un poema condensado y punzante que expresa con agudeza una burla, sátira moral o juicio ingenioso."
    }
  ],

  lit_t01_s02: [
    {
      id: "lit_t01_s02_c01",
      question: "En los versos de Jorge Manrique: «Nuestras vidas son los ríos / que van a dar en la mar, / que es el morir», la figura literaria predominante es:",
      options: [
        "Símil o comparación",
        "Metáfora impura",
        "Hipérbaton",
        "Sinestesia"
      ],
      correctIndex: 1,
      explanation: "Se trata de una metáfora impura porque identifica de manera directa el término real A («vidas») con el término imaginario B («ríos») mediante el verbo copulativo ser (A es B)."
    },
    {
      id: "lit_t01_s02_c02",
      question: "En la expresión poética: «El Perú entero lloró la partida de su más insigne poeta», se identifica un claro ejemplo de:",
      options: [
        "Sinécdoque",
        "Paradoja",
        "Anáfora",
        "Pleonasmo"
      ],
      correctIndex: 0,
      explanation: "La sinécdoque es un tropo que designa el todo por la parte o el continente por el contenido (aquí «el Perú entero» designa a todos los habitantes peruanos)."
    },
    {
      id: "lit_t01_s02_c03",
      question: "¿Cuál es la figura retórica consistente en alterar el orden sintáctico habitual de las palabras en una oración (sujeto + verbo + complementos)?",
      options: [
        "Asíndeton",
        "Hipérbole",
        "Hipérbaton",
        "Polisíndeton"
      ],
      correctIndex: 2,
      explanation: "El hipérbaton invierte la disposición lógica o gramatical estándar de las palabras en el verso, como en «Del salón en el ángulo oscuro» (G. A. Bécquer)."
    },
    {
      id: "lit_t01_s02_c04",
      question: "En el verso satírico de Francisco de Quevedo: «Érase un hombre a una nariz pegado», la figura retórica dominante es:",
      options: [
        "Hipérbole",
        "Elipsis",
        "Epíteto",
        "Antítesis"
      ],
      correctIndex: 0,
      explanation: "La hipérbole es una exageración desmedida y magnificada de la realidad con fines expresivos o caricaturescos."
    },
    {
      id: "lit_t01_s02_c05",
      question: "Identifique la figura retórica presente en la siguiente frase: «Compró un auténtico Picasso en la subasta de arte»:",
      options: [
        "Metonimia",
        "Sinécdoque",
        "Símil",
        "Prosopopeya"
      ],
      correctIndex: 0,
      explanation: "La metonimia sustituye un término por otro con base en una relación causal o de contigüidad material; en este caso, se nombra al autor («Picasso») en lugar de la obra producida (un cuadro de Picasso)."
    },
    {
      id: "lit_t01_s02_c06",
      question: "En los versos: «Vivo sin vivir en mí, / y tan alta vida espero, / que muero porque no muero» de Santa Teresa de Jesús, la figura central es:",
      options: [
        "La antítesis simple",
        "La paradoja",
        "El oxímoron sensorial",
        "La hipérbole épica"
      ],
      correctIndex: 1,
      explanation: "La paradoja armoniza dos ideas aparentemente incompatibles o contradictorias en un plano lógico estricto para revelar una verdad mística o vivencial profunda."
    },
    {
      id: "lit_t01_s02_c07",
      question: "La reiteración voluntaria de una o varias palabras al inicio de versos sucesivos o frases consecutivas se denomina:",
      options: [
        "Epífora",
        "Anáfora",
        "Aliteración",
        "Concatenación"
      ],
      correctIndex: 1,
      explanation: "La anáfora es una figura de dicción que aporta ritmo y énfasis acústico repitiendo vocablos al comienzo de dos o más cláusulas o versos."
    },
    {
      id: "lit_t01_s02_c08",
      question: "En la frase «ardiente fuego» o «blanca nieve», el empleo de un adjetivo inherente que resalta una cualidad intrínseca y prototípica del sustantivo constituye un:",
      options: [
        "Epíteto",
        "Oxímoron",
        "Tropos",
        "Silepsis"
      ],
      correctIndex: 0,
      explanation: "El epíteto es un adjetivo explicativo que subraya una propiedad esencial ya consustancial al sustantivo, con fines estilísticos y estéticos."
    },
    {
      id: "lit_t01_s02_c09",
      question: "La supresión deliberada de conjunciones coordinantes entre elementos oracionales para dotar al texto de rapidez, dinamismo y vehemencia («Llegué, vi, vencí») es:",
      options: [
        "Polisíndeton",
        "Asíndeton",
        "Anacoluto",
        "Elipsis"
      ],
      correctIndex: 1,
      explanation: "El asíndeton prescinde de los nexos copulativos (como «y»), produciendo un ritmo acelerado y enérgico en el discurso."
    },
    {
      id: "lit_t01_s02_c10",
      question: "La atribución de cualidades humanas, sentimientos o acciones voluntarias a seres inanimados o animales («El viento gemía en la noche fría») se denomina:",
      options: [
        "Personificación o prosopopeya",
        "Sinestesia",
        "Hipálage",
        "Alegoría"
      ],
      correctIndex: 0,
      explanation: "La personificación o prosopopeya traslada atributos propios de los seres humanos (gemir, llorar, hablar) a entidades naturales, objetos abstractos o cosas inertes."
    }
  ],

  // Semana 02
  lit_t02_s01: [
    {
      id: "lit_t02_s01_c01",
      question: "¿Cuál es el tema central que articula el argumento y la estructura épica de la Ilíada de Homero?",
      options: [
        "El largo viaje de regreso de Odiseo a su patria Ítaca.",
        "La cólera de Aquiles y sus funestas consecuencias para el ejército aqueo.",
        "El juicio de Paris y el rapto de Helena de Esparta.",
        "La construcción del caballo de madera ideado por Odiseo."
      ],
      correctIndex: 1,
      explanation: "La Ilíada inicia con la invocación a la musa para cantar la cólera funesta de Aquiles («Canta, oh diosa, la cólera del Pelida Aquiles...»), desencadenada por el ultraje de Agamenón al despojarlo de Briseida."
    },
    {
      id: "lit_t02_s01_c02",
      question: "En la tragedia Edipo Rey de Sófocles, ¿cuál es la revelación trágica fundamental que consuma el destino inexorable del protagonista?",
      options: [
        "Que Yocasta había huido a Corinto tras conspirar contra el oráculo.",
        "Que él mismo dio muerte a su padre Layo y contrajo matrimonio con su propia madre Yocasta.",
        "Que el adivino Tiresias era un espía enviado por Creonte para derrocarlo.",
        "Que los ciudadanos tebanos tramaban su muerte mediante una epidemia fabricada."
      ],
      correctIndex: 1,
      explanation: "El núcleo trágico de Edipo Rey reside en la anagnórisis donde Edipo descubre con horror que, intentando eludir la profecía délfica, asesinó involuntariamente a Layo en una encrucijada y se desposó con su madre biológica Yocasta."
    },
    {
      id: "lit_t02_s01_c03",
      question: "¿Qué héroe troyano es el principal defensor de su patria en la Ilíada y muere en combate singular a manos de Aquiles?",
      options: [
        "Paris",
        "Héctor",
        "Príamo",
        "Eneas"
      ],
      correctIndex: 1,
      explanation: "Héctor, el de tremolante casco, primogénito de Príamo y símbolo del héroe patriótico y familiar, combate valientemente y es vencido por Aquiles para vengar la muerte de Patroclo."
    },
    {
      id: "lit_t02_s01_c04",
      question: "En la Odisea, la virtud primordial que define al héroe Odiseo frente a los múltiples peligros y monstruos marinos es:",
      options: [
        "La fuerza bruta invencible",
        "La astucia, prudencia y el ingenio (metis)",
        "El fervor religioso sumiso",
        "La destreza letal en el combate a caballo"
      ],
      correctIndex: 1,
      explanation: "Odiseo encarna al héroe de la inteligencia práctica y la astucia (polymétis), capaz de vencer al cíclope Polifemo, eludir el canto de las sirenas y recuperar su hogar mediante el engaño meditado."
    },
    {
      id: "lit_t02_s01_c05",
      question: "Las fórmulas fijas como «el de los pies ligeros» (para Aquiles) o «Atenea, la de ojos de lechuza» corresponden al recurso estilístico homérico denominado:",
      options: [
        "Hipérbaton épico",
        "Epíteto homérico",
        "Metáfora heroica",
        "Sinécdoque formular"
      ],
      correctIndex: 1,
      explanation: "El epíteto homérico es un adjetivo o frase adjetival recurrente que fija un rasgo distintivo del personaje o dios y facilitaba la memorización rítmica a los aedos."
    },
    {
      id: "lit_t02_s01_c06",
      question: "¿Cuál de los siguientes dramaturgos griegos es considerado el «padre de la tragedia» al incorporar al segundo actor (deuteragonista) y escribir la célebre Orestíada?",
      options: [
        "Sófocles",
        "Esquilo",
        "Eurípides",
        "Aristófanes"
      ],
      correctIndex: 1,
      explanation: "Esquilo transformó el ditirambo litúrgico en verdadero teatro dialogado introduciendo el segundo actor y componiendo tragedias de grandiosa tensión teológica como la trilogía de la Orestíada."
    },
    {
      id: "lit_t02_s01_c07",
      question: "En la poética clásica griega, la hybris que precipita la ruina de los héroes trágicos consiste formalmente en:",
      options: [
        "La ignorancia absoluta de las leyes de la polis.",
        "La soberbia desmedida o desafío insolente al orden de los dioses y al destino.",
        "La cobardía demostrada en el campo de batalla frente al enemigo.",
        "El apego desmedido a las riquezas materiales y al comercio."
      ],
      correctIndex: 1,
      explanation: "La hybris es el orgullo o desmesura con la que el ser humano transgrede sus propios límites mortales, desafiando a los dioses, lo que desata la venganza o castigo cósmico (némesis)."
    },
    {
      id: "lit_t02_s01_c08",
      question: "¿Qué rey de Troya acude de noche a la tienda de Aquiles para suplicarle compasión y el rescate del cadáver mutilado de su hijo Héctor?",
      options: [
        "Príamo",
        "Menelao",
        "Peleo",
        "Néstor"
      ],
      correctIndex: 0,
      explanation: "En uno de los momentos más conmovedores de la Ilíada (Canto XXIV), el anciano rey Príamo besa las manos homicidas de Aquiles implorando el cuerpo de su hijo para darle digna sepultura."
    },
    {
      id: "lit_t02_s01_c09",
      question: "En Edipo Rey, el personaje ciego que encarna la clarividencia espiritual y revela que el asesino de Layo es el propio rey de Tebas es:",
      options: [
        "Creonte",
        "Tiresias",
        "Polifemo",
        "Corifeo"
      ],
      correctIndex: 1,
      explanation: "Tiresias, el adivino invidente consagrado a Apolo, opone su ceguera física a la ceguera moral de Edipo, develando la verdad que el monarca se niega a aceptar."
    },
    {
      id: "lit_t02_s01_c10",
      question: "La fidelidad conyugal inquebrantable en la Odisea está encarnada emblemáticamente por el personaje de:",
      options: [
        "Calipso",
        "Circe",
        "Penélope",
        "Nausícaa"
      ],
      correctIndex: 2,
      explanation: "Penélope teje y desteje su manto fúnebre durante veinte años para retrasar a los pretendientes y esperar el retorno de su legítimo esposo Odiseo."
    }
  ],

  lit_t02_s02: [
    {
      id: "lit_t02_s02_c01",
      question: "La novela epistolar Las cuitas del joven Werther (1774) de Johann Wolfgang von Goethe es considerada la obra cumbre de la corriente prerromántica alemana denominada:",
      options: [
        "Parnasianismo",
        "Sturm und Drang (Tormenta e Ímpetu)",
        "Siglo de las Luces",
        "Simbolismo estético"
      ],
      correctIndex: 1,
      explanation: "El movimiento Sturm und Drang exaltó la pasión indómita, la libertad espiritual del genio creador y el individualismo frente a la rigidez racionalista de la Ilustración."
    },
    {
      id: "lit_t02_s02_c02",
      question: "¿Cuál es el desenlace trágico del protagonista en Las cuitas del joven Werther motivado por su amor imposible hacia Lotte?",
      options: [
        "Huye al extranjero para alistarse en el ejército prusiano.",
        "Se suicida disparándose con una pistola facilitada por el prometido de Carlota.",
        "Restaura su equilibrio emocional refugiándose en la vida campestre.",
        "Reta a duelo de honor a Albert y perece en el enfrentamiento."
      ],
      correctIndex: 1,
      explanation: "Werther, incapaz de tolerar el abismo entre sus ideales pasionales absolutos y la realidad burguesa donde Lotte está casada con Albert, se quita la vida con la pistola de este."
    },
    {
      id: "lit_t02_s02_c03",
      question: "En la novela Crimen y castigo de Fiódor Dostoievski, la teoría personal que elabora Rodión Raskólnikov para justificar el homicidio de la usurera sostiene que:",
      options: [
        "El Estado zarista debe ser destruido mediante actos terroristas sistemáticos.",
        "Existen hombres extraordinarios que tienen el derecho moral de violar las leyes ordinarias en pro del progreso humano.",
        "Todas las personas nacen con una predestinación demoníaca innata.",
        "El robo es la única forma legítima de redistribuir la riqueza entre el proletariado."
      ],
      correctIndex: 1,
      explanation: "Raskólnikov expone en un artículo que la humanidad se divide en hombres ordinarios (obedientes) y hombres extraordinarios (como Napoleón), legitimados para transgredir la moral corriente en beneficio de un fin superior."
    },
    {
      id: "lit_t02_s02_c04",
      question: "En Crimen y castigo, el personaje femenino que encarna el amor redentor, la fe cristiana y la regeneración espiritual de Raskólnikov es:",
      options: [
        "Aliona Ivánovna",
        "Sonia Marmeládova",
        "Dunia Raskólnikova",
        "Katerina Ivánovna"
      ],
      correctIndex: 1,
      explanation: "Sonia Marmeládova, quien ejerce la prostitución para alimentar a su paupérrima familia, convence a Rodión de entregarse a la justicia terrenal y lo acompaña a Siberia en su purificación moral."
    },
    {
      id: "lit_t02_s02_c05",
      question: "La célebre novela corta La metamorfosis (1915) de Franz Kafka se inicia de forma impactante cuando el protagonista Gregorio Samsa:",
      options: [
        "Pierde la memoria y deambula por los suburbios industriales de Praga.",
        "Despierta una mañana convertido en un monstruoso insecto.",
        "Es arrestado arbitrariamente por dos guardias sin conocer la acusación en su contra.",
        "Descubre que su jefe ha desfalco la empresa textil donde labora."
      ],
      correctIndex: 1,
      explanation: "Kafka arranca in media res: «Al despertar Gregorio Samsa una mañana tras un sueño intranquilo, se encontró en su cama convertido en un monstruoso insecto», metáfora suprema de la alienación humana moderna."
    },
    {
      id: "lit_t02_s02_c06",
      question: "¿Cuál es la temática sociopsicológica central que aborda Franz Kafka a través del proceso de aislamiento y muerte de Gregorio Samsa en La metamorfosis?",
      options: [
        "La alienación del individuo, la deshumanización burocrática y el rechazo familiar ante la pérdida de utilidad económica.",
        "La lucha de clases heroica y el triunfo sindical de los empleados de comercio.",
        "El misticismo religioso y el valor salvífico del perdón divino.",
        "La exaltación idílica del progreso técnico y el capitalismo industrial."
      ],
      correctIndex: 0,
      explanation: "La novela desnuda la deshumanización del trabajador moderno, reducido a engranaje económico; al quedar incapacitado para producir, Gregorio se vuelve una carga repugnante y es abandonado a la muerte por su propia familia."
    },
    {
      id: "lit_t02_s02_c07",
      question: "El rasgo literario definitorio del Romanticismo universal que lo contrapone frontalmente a las normas de la Ilustración es:",
      options: [
        "El respeto incondicional por las tres unidades aristotélicas de tiempo, lugar y acción.",
        "La primacía de la subjetividad, la libertad formal y el desbordamiento pasional.",
        "El uso exclusivo del latín y temas de la mitología grecolatina.",
        "La descripción positivista y científica de las leyes sociales."
      ],
      correctIndex: 1,
      explanation: "El Romanticismo postula la primacía del sentimiento sobre la razón, el ansia de libertad individual irrestricta y el culto a la imaginación creadora."
    },
    {
      id: "lit_t02_s02_c08",
      question: "En Fausto de Goethe, ¿qué pacto trascendental realiza el sabio protagonista con el demonio Mefistófeles?",
      options: [
        "Vende su alma a cambio de disfrutar del conocimiento ilimitado, la juventud y los placeres terrenales.",
        "Solicita la inmortalidad para gobernar el Sacro Imperio Romano Germánico.",
        "Exige que Mefistófeles cure la peste negra que asola a su pueblo.",
        "Pide riquezas infinitas para repartirlas entre los siervos de la gleba."
      ],
      correctIndex: 0,
      explanation: "Fausto, insatisfecho con la ciencia terrenal finita, entrega su alma al diablo a condición de que este le otorgue un instante tan pleno de dicha que le haga exclamar: «¡Deténte, momento, eres tan bello!»."
    },
    {
      id: "lit_t02_s02_c09",
      question: "El Realismo literario del siglo XIX, al que pertenece Fiódor Dostoievski, se caracteriza formalmente por:",
      options: [
        "La evasión hacia mundos exóticos y épocas pretéritas de fantasía medieval.",
        "La observación minuciosa de la sociedad contemporánea y el análisis psicológico de los personajes.",
        "La invención de realidades mágicas donde no rige el principio de causalidad.",
        "La brevedad lírica y el hermetismo experimental de la vanguardia."
      ],
      correctIndex: 1,
      explanation: "El Realismo se fundamenta en la observación fidedigna de las relaciones humanas, los ambientes urbanos y los conflictos morales de la sociedad de su tiempo."
    },
    {
      id: "lit_t02_s02_c10",
      question: "¿Cómo reacciona el padre de Gregorio Samsa ante la transformación de su hijo en La metamorfosis?",
      options: [
        "Llama a eminentes médicos para intentar sanar su extraña enfermedad.",
        "Lo agrede con violencia lanzándole manzanas, una de las cuales queda incrustada en su caparazón infectándose.",
        "Acepta con resignación cristiana la condición monstruosa de Gregorio.",
        "Lo entrega inmediatamente a un circo para exhibirlo como fenómeno biológico."
      ],
      correctIndex: 1,
      explanation: "El padre muestra una hostilidad despiadada y lo ataca a pedradas con manzanas, hiriéndolo de gravedad y simbolizando el castigo del poder patriarcal despiadado."
    }
  ],

  // Semana 03
  lit_t03_s01: [
    {
      id: "lit_t03_s01_c01",
      question: "¿Cuál fue el motivo histórico-social por el cual el rey Alfonso VI desterró a Rodrigo Díaz de Vivar en el Cantar de Mio Cid?",
      options: [
        "Las falsas acusaciones e intrigas de nobles envidiosos sobre la apropiación indebida de las parias de Sevilla.",
        "La negativa del Cid a combatir contra las tropas del conde García Ordóñez en Cabra.",
        "Haber forzado al rey a jurar en Santa Gadea que no tuvo participación en el asesinato de su hermano Sancho II.",
        "El matrimonio no consentido del Cid con doña Jimena sin venia de la corte toledana."
      ],
      correctIndex: 0,
      explanation: "El Cantar arranca in media res con el destierro del Cid a causa de «mestureros» (nobles intrigantes de la corte como García Ordóñez) que lo acusaron falsamente de retener parte de los tributos (parias) cobrados al rey moro de Sevilla."
    },
    {
      id: "lit_t03_s01_c02",
      question: "¿Cuál es el tema primordial que articula de principio a fin el argumento del Cantar de Mio Cid?",
      options: [
        "La venganza sangrienta contra los moros invasores de la península ibérica.",
        "La pérdida y doble recuperación del honor social y familiar del héroe.",
        "La instauración de una monarquía absolutista en el reino de Castilla.",
        "El amor cortés platónico hacia doña Jimena."
      ],
      correctIndex: 1,
      explanation: "El Cid sufre una doble pérdida del honor: primero en el plano militar y político al ser desterrado (lo recupera conquistando Valencia y enviando ricos presentes al rey), y luego en el plano familiar por la afrenta de Corpes (lo recupera por la vía jurídica en las Cortes de Toledo)."
    },
    {
      id: "lit_t03_s01_c03",
      question: "La virtud moral y conductual que distingue a Rodrigo Díaz de Vivar en el Cantar de Mio Cid, caracterizada por la serenidad, prudencia y autocontrol incluso ante la injusticia real, se denomina:",
      options: [
        "Desmesura",
        "Mesura",
        "Hybris",
        "Beatus ille"
      ],
      correctIndex: 1,
      explanation: "La mesura es el rasgo definitorio del Cid castellano: jamás se rebela contra su soberano natural Alfonso VI, actúa con calculada prudencia y perdona con clemencia a sus vencidos."
    },
    {
      id: "lit_t03_s01_c04",
      question: "En el tercer cantar del poema épico castellano, el cobarde ultraje perpetrado por los infantes de Carrión contra doña Elvira y doña Sol tiene lugar en:",
      options: [
        "El robledal de Corpes",
        "Las orillas del río Arlanzón",
        "Las murallas de Alcocer",
        "El alcázar de Valencia"
      ],
      correctIndex: 0,
      explanation: "En el robledal de Corpes, los infantes de Carrión azotan brutalmente y dejan por muertas a sus esposas para vengarse de las burlas sufridas por su cobardía ante el león en Valencia."
    },
    {
      id: "lit_t03_s01_c05",
      question: "¿De qué manera obtiene el Cid justicia y desagravio final por el ultraje de Corpes?",
      options: [
        "Asesina a traición a los infantes de Carrión mientras dormían en su feudo.",
        "Convoca a las Cortes de Toledo presididas por el rey, donde sus vasallos vencen a los infantes en duelo de honor y se anuncian nuevas bodas con infantes reales de Navarra y Aragón.",
        "Rechaza todo contacto con la corte castellana y funda un reino independiente en Valencia.",
        "Exige que la Iglesia excomulgue a los nobles leoneses."
      ],
      correctIndex: 1,
      explanation: "El Cid no opta por la venganza privada ni sangrienta desmedida; apela a las leyes y al rey en las Cortes de Toledo, donde recupera sus espadas Colada y Tizona y casa a sus hijas con futuros reyes."
    },
    {
      id: "lit_t03_s01_c06",
      question: "La forma métrica predominante en el Cantar de Mio Cid se caracteriza formalmente por:",
      options: [
        "Sonetos endecasílabos con rima consonante perfecta.",
        "Versos alejandrinos de catorce sílabas agrupados en cuaderna vía.",
        "Tiradas monorrimas de versos anisosilábicos (de medida irregular, entre 14 y 16 sílabas) divididos por una cesura con rima asonante.",
        "Octosílabos en estrofas de redondilla popular."
      ],
      correctIndex: 2,
      explanation: "Propio del mester de juglaría, el Cantar presenta tiradas de extensión variable con rima asonante monorrima y versos de metro irregular (anisosilabismo) partidos en dos hemistiquios por una cesura central."
    },
    {
      id: "lit_t03_s01_c07",
      question: "¿Quién es el fiel lugarteniente del Cid, llamado «el diestro brazo» o «fardido lidiador», que custodia a doña Jimena y a sus hijas?",
      options: [
        "Minaya Álvar Fáñez",
        "Martín Antolínez",
        "Pedro Bermúdez",
        "Félez Muñoz"
      ],
      correctIndex: 0,
      explanation: "Álvar Fáñez de Minaya es el brazo derecho de Rodrigo, principal estratega militar y emisario encargado de llevar las embajadas y tributos al rey Alfonso VI."
    },
    {
      id: "lit_t03_s01_c08",
      question: "Las dos famosas espadas ganadas en combate por el Cid y recuperadas en las Cortes de Toledo son:",
      options: [
        "Joyeuse y Durandal",
        "Colada y Tizona",
        "Excalibur y Balmung",
        "Lobera y Curtana"
      ],
      correctIndex: 1,
      explanation: "El Cid gana la espada Colada tras vencer al conde de Barcelona don Ramón Berenguer, y la espada Tizona al derrotar al rey moro Búcar de Marruecos."
    },
    {
      id: "lit_t03_s01_c09",
      question: "El copista que firmó en 1207 el manuscrito único conservado del Cantar de Mio Cid fue:",
      options: [
        "Gonzalo de Berceo",
        "Per Abbat (Pedro Abad)",
        "Juan Ruiz, Arcipreste de Hita",
        "Alfonso X el Sabio"
      ],
      correctIndex: 1,
      explanation: "Al final del códice medieval se lee el célebre colofón: «Quien escribió este libro déle Dios paraíso, amén. Per Abbat le escribió en el mes de mayo en era de mil e CC e XLV años (1207)». Fue el copista que fijó el texto."
    },
    {
      id: "lit_t03_s01_c10",
      question: "A diferencia de las epopeyas de la Antigüedad, el Cantar de Mio Cid destaca en la épica universal por su marcado carácter:",
      options: [
        "Mitológico y presencia de monstruos marinos fantásticos.",
        "Realista, verosímil y sobriedad histórica y geográfica.",
        "Mágico y empleo de pócimas de invisibilidad.",
        "Teológico alegórico y viajes al infierno."
      ],
      correctIndex: 1,
      explanation: "El Cantar prescinde casi en absoluto de elementos sobrenaturales o mágicos (salvo la visión en sueños del arcángel San Gabriel); sus batallas, ciudades (Burgos, Toledo, Valencia) y personajes son históricos y geográficamente precisos."
    }
  ],

  lit_t03_s02: [
    {
      id: "lit_t03_s02_c01",
      question: "En El ingenioso hidalgo don Quijote de la Mancha de Miguel de Cervantes, el proceso psicológico por el cual Don Quijote se contagia progresivamente del sentido común y realismo de su escudero, mientras Sancho absorbe los ideales caballerescos de su amo, se conoce críticamente como:",
      options: [
        "Catarsis barroca",
        "Sanchificación del Quijote y quijotización de Sancho",
        "Anagnórisis picaresca",
        "Metamorfosis caballeresca"
      ],
      correctIndex: 1,
      explanation: "A lo largo de sus andanzas compartidas, Don Quijote asimila la prudencia fáctica de Sancho (sanchificación), mientras que Sancho Panza abraza la fantasía heroica, el desinterés noble y el afán de justicia de su amo (quijotización)."
    },
    {
      id: "lit_t03_s02_c02",
      question: "¿Cuál es el propósito paródico explícito que declara Miguel de Cervantes en el prólogo de la primera parte del Quijote (1605)?",
      options: [
        "Satirizar a la Iglesia católica y a la Inquisición española.",
        "Derribar la máquina mal fundada de los disparatados y nocivos libros de caballerías.",
        "Criticar la política imperialista de la dinastía de los Austrias.",
        "Exaltar la superioridad militar de España sobre el Imperio otomano."
      ],
      correctIndex: 1,
      explanation: "Cervantes declara expresamente que su objetivo es poner en aborrecimiento de los lectores las fábulas absurdas y desmesuradas de los libros de caballerías mediante la sátira y el humor."
    },
    {
      id: "lit_t03_s02_c03",
      question: "En la culminación de la segunda parte del Quijote (1615), ¿bajo qué disfraz el bachiller Sansón Carrasco derrota al caballero andante en las playas de Barcelona para obligarlo a regresar a su aldea?",
      options: [
        "El Caballero de los Espejos",
        "El Caballero de la Blanca Luna",
        "El Caballero del Verde Gabán",
        "El Caballero del Sol Naciente"
      ],
      correctIndex: 1,
      explanation: "Sansón Carrasco vence a Don Quijote bajo la identidad del Caballero de la Blanca Luna y le impone como condición de la derrota retirarse de la caballería andante por el plazo de un año, lo que precipita su retorno a casa y su muerte."
    },
    {
      id: "lit_t03_s02_c04",
      question: "En el drama filosófico La vida es sueño de Pedro Calderón de la Barca, ¿cuál es el motivo por el cual el rey Basilio de Polonia encierra a su hijo Segismundo en una torre desde su nacimiento?",
      options: [
        "Porque el príncipe nació con una deformidad física monstruosa.",
        "Por los horóscopos y vaticinios astrológicos que predecían que sería un tirano sanguinario y humillaría a su padre.",
        "Para evitar que heredara el trono un hijo concebido fuera del matrimonio real.",
        "Porque la reina Clorilene murió ordenando su perpetuo cautiverio."
      ],
      correctIndex: 1,
      explanation: "El rey Basilio, astrólogo y matemático, creyó ciegamente en los astros que presagiaban que Segismundo destrozaría el reino y pondría sus pies sobre la cabeza de su anciano padre."
    },
    {
      id: "lit_t03_s02_c05",
      question: "¿Cuál es el dilema filosófico y teológico central que se resuelve victoriosamente en La vida es sueño a través de la evolución moral de Segismundo?",
      options: [
        "La lucha entre el protestantismo y el catolicismo inquisitorial.",
        "El triunfo del libre albedrío y la razón sobre la predestinación fatídica de los astros.",
        "La supremacía del poder civil sobre la jerarquía eclesiástica.",
        "La justificación maquiavélica del tiranicidio."
      ],
      correctIndex: 1,
      explanation: "Calderón, en consonancia con la Contrarreforma católica, demuestra que el hombre no está determinado fatalmente por los horóscopos: Segismundo, mediante su voluntad y discernimiento, vence sus impulsos salvajes y perdona a su padre, probando la primacía del libre albedrío."
    },
    {
      id: "lit_t03_s02_c06",
      question: "En el celebérrimo soliloquio que cierra la primera jornada de La vida es sueño, Segismundo concluye meditativamente que:",
      options: [
        "La rebelión armada es el único camino legítimo hacia la libertad política.",
        "Toda la existencia terrenal es ilusión efímera y que las glorias del mundo son meras sombras y sueños.",
        "Los reyes gobiernan por mandato biológico inalterable.",
        "La ciencia astrológica es la única fuente infalible de verdad cósmica."
      ],
      correctIndex: 1,
      explanation: "Segismundo reflexiona con hondo barroquismo desengañado: «¿Qué es la vida? Un frenesí. / ¿Qué es la vida? Una ilusión, / una sombra, una ficción, / y el mayor bien es pequeño: / que toda la vida es sueño, / y los sueños, sueños son»."
    },
    {
      id: "lit_t03_s02_c07",
      question: "El autor de las célebres Rimas y Leyendas, cumbre del posromanticismo lírico español caracterizado por su tono intimista, melancólico y leve musicalidad, es:",
      options: [
        "José de Espronceda",
        "Gustavo Adolfo Bécquer",
        "Mariano José de Larra",
        "Fray Luis de León"
      ],
      correctIndex: 1,
      explanation: "Gustavo Adolfo Bécquer depuró el romanticismo español de su retórica rimbombante anterior, creando una poesía condensada, transparente y hondamente emotiva sobre el amor, el desengaño y el misterio de la creación lírica."
    },
    {
      id: "lit_t03_s02_c08",
      question: "¿Cómo recupera la cordura y el juicio el protagonista del Quijote en su lecho de muerte?",
      options: [
        "Tras beber el mítico bálsamo de Fierabrás preparado por el cura Pero Pérez.",
        "Abandona la locura caballeresca, reconoce que su nombre es Alonso Quijano «el Bueno» y reniega de los perniciosos libros de caballerías.",
        "Planifica una última expedición militar junto a Sancho para rescatar a Dulcinea de Toboso.",
        "Es coronado emperador de Trapisonda por los pastores de Sierra Morena."
      ],
      correctIndex: 1,
      explanation: "En el capítulo final, Alonso Quijano despierta lúcido, pide confesar sus pecados, dicta su testamento con plena sensatez y fallece cristianamente habiendo dejado atrás la quimera andante."
    },
    {
      id: "lit_t03_s02_c09",
      question: "El personaje leal que educa a Segismundo en la torre y vela por la seguridad del secreto de Estado por orden del rey Basilio es:",
      options: [
        "Astolfo",
        "Clotaldo",
        "Clarín",
        "Soldado rebelde"
      ],
      correctIndex: 1,
      explanation: "Clotaldo encarna el conflicto del deber y la lealtad al rey frente a los afectos personales y filiales; es el carcelero e instructor de Segismundo y padre secreto de Rosaura."
    },
    {
      id: "lit_t03_s02_c10",
      question: "La dama idealizada a quien Don Quijote consagra todas sus hazañas y victorias guerreras, y cuya identidad campesina real es Aldonza Lorenzo, es:",
      options: [
        "Dorotea",
        "Maritornes",
        "Dulcinea del Toboso",
        "Marcela"
      ],
      correctIndex: 2,
      explanation: "Don Quijote transforma con su imaginación idealista a la rústica labradora Aldonza Lorenzo en la sublime señora de sus pensamientos, Dulcinea del Toboso."
    }
  ],

  // Semana 04
  lit_t04_s01: [
    {
      id: "lit_t04_s01_c01",
      question: "La publicación en Valparaíso (Chile) del libro Azul... (1888) del poeta nicaragüense Rubén Darío marca formalmente:",
      options: [
        "El nacimiento del Romanticismo social hispanoamericano.",
        "El inicio triunfal del Modernismo como primer movimiento literario originario de Hispanoamérica.",
        "La consolidación de la novela indigenista de la tierra.",
        "La ruptura vanguardista con las formas métricas clásicas."
      ],
      correctIndex: 1,
      explanation: "Azul... amalgama cuentos líricos y poemas donde confluyen el parnasianismo (perfección formal plástica) y el simbolismo (musicalidad y misterio), dando inicio al Modernismo hispanoamericano."
    },
    {
      id: "lit_t04_s01_c02",
      question: "¿Cuál es el animal emblemático que simboliza la elegancia aristocrática, la belleza pura y la búsqueda de perfección plástica en la lírica modernista de Rubén Darío?",
      options: [
        "El cóndor andino",
        "El cisne",
        "El águila bicéfala",
        "El jaguar"
      ],
      correctIndex: 1,
      explanation: "El cisne blancor y grácil se convirtió en el tótem estético de los poetas modernistas, encarnando la gracia alada, la aristocracia del espíritu y el misterio poético consagrado por Darío en Cantos de vida y esperanza."
    },
    {
      id: "lit_t04_s01_c03",
      question: "En la evolución de Rubén Darío, la obra que trasciende el esteticismo cosmopolita y princesas de Versalles para asumir una voz reflexiva y defensora de la identidad de la América española frente al imperialismo anglosajón es:",
      options: [
        "Prosas profanas",
        "Cantos de vida y esperanza (1905)",
        "Primeras notas",
        "Canto errante"
      ],
      correctIndex: 1,
      explanation: "En Cantos de vida y esperanza (con poemas cumbres como «A Roosevelt» y «Lo fatal»), Darío alcanza una madurez sombría, cívica y humanista, defendiendo a la América hispana que «todavía reza a Jesucristo y habla en español»."
    },
    {
      id: "lit_t04_s01_c04",
      question: "En el poemario Veinte poemas de amor y una canción desesperada (1924) de Pablo Neruda, el motivo temático dominante que atraviesa los versos amorosos juveniles es:",
      options: [
        "La celebración cívica de la independencia chilena.",
        "El erotismo juvenil fusionado con la melancolía del desamor, la soledad y la naturaleza austral.",
        "La exaltación bélica de las vanguardias futuristas.",
        "La sátira contra la hipocresía social de la burguesía santiaguina."
      ],
      correctIndex: 1,
      explanation: "El poemario juvenil de Neruda canta al cuerpo de la mujer amada comparándolo con el paisaje natural de su infancia (el mar, los pinos, el viento) en medio del abandono y la nostalgia melancólica («Es tan corto el amor, y es tan largo el olvido»)."
    },
    {
      id: "lit_t04_s01_c05",
      question: "La monumental obra lírica de Pablo Neruda que constituye un canto épico e histórico al continente americano y a sus pueblos oprimidos, e incluye el célebre poema «Alturas de Macchu Picchu», se titula:",
      options: [
        "Residencia en la tierra",
        "Canto General (1950)",
        "Odas elementales",
        "Memorial de Isla Negra"
      ],
      correctIndex: 1,
      explanation: "Canto General es el magno friso histórico-político de Neruda, donde desfilan la geografía primigenia, los libertadores, los tiranos, los trabajadores del cobre y el sobrecogedor ascenso a la ciudadela incaica para dar voz a los muertos olvidados."
    },
    {
      id: "lit_t04_s01_c06",
      question: "¿Cuál de las siguientes poetisas hispanoamericanas fue la primera escritora de América Latina en ser galardonada con el Premio Nobel de Literatura (1945)?",
      options: [
        "Alfonsina Storni",
        "Gabriela Mistral",
        "Juana de Ibarbourou",
        "Delmira Agustini"
      ],
      correctIndex: 1,
      explanation: "La pedagoga y poetisa chilena Lucila Godoy Alcayaga (Gabriela Mistral), autora de Desolación, Ternura y Tala, recibió el Nobel en 1945 por su lírica inspirada en poderosas emociones que convirtieron su nombre en un símbolo de las aspiraciones del mundo latinoamericano."
    },
    {
      id: "lit_t04_s01_c07",
      question: "El rasgo estilístico modernista consistente en asociar sensaciones provenientes de distintos sentidos corporales («un silencio dorado», «aromas azules») se denomina:",
      options: [
        "Sinestesia",
        "Silepsis",
        "Anadiplosis",
        "Paranomasia"
      ],
      correctIndex: 0,
      explanation: "La sinestesia es un procedimiento sensorial emblemático del Modernismo que entrecruza sensaciones ópticas, acústicas, táctiles u olfativas para suscitar una experiencia estética hipersensible."
    },
    {
      id: "lit_t04_s01_c08",
      question: "La búsqueda de ambientaciones lejanas en el tiempo y el espacio (jardines versallescos, la Grecia clásica, pagodas orientales) en la poesía modernista responde a la actitud conocida como:",
      options: [
        "Costumbrismo regional",
        "Exotismo y cosmopolitismo",
        "Nativismo telúrico",
        "Compromiso partidario"
      ],
      correctIndex: 1,
      explanation: "El exotismo modernista fue una manifestación del rechazo al prosaísmo mercantil de la vida burguesa contemporánea, refugiándose en universos de refinamiento histórico o mitológico suntuoso."
    },
    {
      id: "lit_t04_s01_c09",
      question: "En la lírica de Alfonsina Storni, poemas célebres como «Tú me quieres blanca» destacan tempranamente por:",
      options: [
        "La defensa sumisa de los roles domésticos tradicionales.",
        "La denuncia enérgica del doble rasero moral masculino que exige pureza a la mujer mientras el varón vive en libertinaje.",
        "La exaltación bucólica de la pampa ganadera argentina.",
        "La imitación estricta de los romances medievales castellanos."
      ],
      correctIndex: 1,
      explanation: "Alfonsina Storni cuestiona con valentía la hipocresía patriarcal en «Tú me quieres blanca», increpando al hombre que exige castidad virginal («blanca, nívea, casta») habiendo vivido disolutamente."
    },
    {
      id: "lit_t04_s01_c10",
      question: "El poemario de Pablo Neruda marcado por la angustia existencial, el desmoronamiento cósmico y el empleo de técnicas surrealistas durante su estancia diplomática en Oriente es:",
      options: [
        "Veinte poemas de amor y una canción desesperada",
        "Residencia en la tierra",
        "Crepusculario",
        "Los versos del Capitán"
      ],
      correctIndex: 1,
      explanation: "Residencia en la tierra (1935) es la obra cumbre del periodo hermético y expresionista de Neruda, donde poetiza la decadencia, la descomposición biológica y la angustia cósmica del ser humano solitario."
    }
  ],

  lit_t04_s02: [
    {
      id: "lit_t04_s02_c01",
      question: "En el prólogo de su novela El reino de este mundo (1949), Alejo Carpentier postula la categoría estética de «lo real maravilloso», fundamentándola en:",
      options: [
        "La invención artificial de trucos mágicos y fantasías desvinculadas de la historia.",
        "La presencia natural, cotidiana e histórica de lo prodigioso en la geografía, mitos y sincretismo cultural de América Latina y el Caribe.",
        "La adopción pasiva de las modas automáticas del surrealismo parisino.",
        "La influencia exclusiva de los cuentos de hadas nórdicos en el Caribe."
      ],
      correctIndex: 1,
      explanation: "Carpentier sostiene que lo insólito y desmesurado en América no es un artificio literario calculado, sino una cualidad inherente a su historia convulsa, su naturaleza exuberante y la fe sincrética de sus pueblos (como la rebelión de Mackandal en Haití)."
    },
    {
      id: "lit_t04_s02_c02",
      question: "En la arquitectura narrativa de Cien años de soledad de Gabriel García Márquez, ¿cuál es el destino final trágico que sella la desaparición de la estirpe de los Buendía?",
      options: [
        "Mueren en la huelga bananera masacrados por los soldados en la estación del tren.",
        "El último descendiente nace con cola de cerdo y es devorado por las hormigas rojas mientras un ciclón bíblico borra a Macondo de la faz de la tierra.",
        "La peste del insomnio provoca la pérdida irreversible de la memoria y la dispersión por el mundo.",
        "El coronel Aureliano Buendía gana sus treinta y dos guerras civiles e instaura una tiranía militar."
      ],
      correctIndex: 1,
      explanation: "Tal como rezaban los pergaminos de Melquíades que descifra Aureliano Babilonia: «El primero de la estirpe está amarrado en un árbol y al último se lo están comiendo las hormigas», culminando con el cataclismo profético que arrasa Macondo."
    },
    {
      id: "lit_t04_s02_c03",
      question: "En la narrativa fantástica y filosófica de Jorge Luis Borges (Ficciones, El Aleph), los motivos recurrentes que simbolizan la infinitud inabarcable, la perplejidad metafísica y la pérdida del yo son:",
      options: [
        "El arado, el ferrocarril y la fábrica textil.",
        "Los laberintos, los espejos, los libros infinitos y el tiempo circular.",
        "Los campos de batalla sangrientos y las banderas patrias.",
        "Las haciendas feudales y las descripciones botánicas."
      ],
      correctIndex: 1,
      explanation: "Borges construye una literatura de rigurosa arquitectura conceptual donde el laberinto refleja la confusión de la mente humana ante el cosmos, los espejos duplican aterradoramente la apariencia, y el tiempo se desdobla en senderos que se bifurcan."
    },
    {
      id: "lit_t04_s02_c04",
      question: "En la novela Pedro Páramo (1955) del mexicano Juan Rulfo, el protagonista Juan Preciado llega al pueblo desértico de Comala con la promesa de buscar a su padre, descubriendo progresivamente que:",
      options: [
        "El pueblo prospera gracias al descubrimiento de ricas minas de plata.",
        "Todos los habitantes con los que dialoga y él mismo están muertos, atrapados en un limbo de culpas y susurros fantasmales.",
        "Su padre se había consagrado como sacerdote para redimir a la comunidad.",
        "El cacique Pedro Páramo había repartido todas sus tierras a los campesinos."
      ],
      correctIndex: 1,
      explanation: "Rulfo rompe magistralmente las fronteras entre vivos y difuntos: Comala es un purgatorio calcinado donde las ánimas en pena susurran sus recuerdos y agonías bajo el yugo caciquil de Pedro Páramo."
    },
    {
      id: "lit_t04_s02_c05",
      question: "¿Cuál de las siguientes características técnicas distingue de manera revolucionaria a la Nueva Narrativa del «Boom latinoamericano» de las novelas regionalistas tradicionales?",
      options: [
        "La narración estrictamente lineal en orden cronológico inalterable con un único narrador omnisciente.",
        "La experimentación temporal (saltos temporales, analepsis, prolepsis), la multiplicidad de perspectivas, el monólogo interior y la disolución de la frontera entre realidad y mito.",
        "El rechazo frontal a cualquier influencia de la vanguardia europea y norteamericana.",
        "La renuncia total a la ficción para redactar actas policiales literales."
      ],
      correctIndex: 1,
      explanation: "Los narradores del Boom (García Márquez, Cortázar, Vargas Llosa, Fuentes) transformaron la novela incorporando innovaciones técnicas universales (Joyce, Faulkner) aplicadas a la compleja realidad sociopolítica y mítica latinoamericana."
    },
    {
      id: "lit_t04_s02_c06",
      question: "En el cuento «El Aleph» de Jorge Luis Borges, el objeto maravilloso que el narrador contempla en el sótano de la calle Garay es:",
      options: [
        "Un reloj que detiene el paso del tiempo en el universo.",
        "Un punto del espacio que contiene, sin superponerse, todos los puntos y acontecimientos del universo desde todos los ángulos simultáneos.",
        "Un espejo mágico que muestra cómo morirá cada ser humano.",
        "Un códice sagrado escrito en la lengua primordial de Adán."
      ],
      correctIndex: 1,
      explanation: "El Aleph borgeano es la condensación absoluta del infinito: una pequeña esfera tornasolada donde convergen todos los lugares del cosmos vistos simultáneamente sin confusión."
    },
    {
      id: "lit_t04_s02_c07",
      question: "¿Quién es el gitano trashumante que llega periódicamente a Macondo trayendo los inventos del mundo (el imán, el telescopio, el hielo) y redacta los pergaminos premonitorios en Cien años de soledad?",
      options: [
        "Pietro Crespi",
        "Melquíades",
        "José Raquel Moncada",
        "Apolinar Moscote"
      ],
      correctIndex: 1,
      explanation: "Melquíades es el sabio y alquimista inmortal que introduce a José Arcadio Buendía en el ansia de conocimiento y fija en sánscrito la historia completa de la estirpe cien años antes de que ocurra."
    },
    {
      id: "lit_t04_s02_c08",
      question: "La novela Rayuela (1963) del escritor argentino Julio Cortázar es célebre en la literatura universal porque:",
      options: [
        "Consta de un solo párrafo continuo sin ningún signo de puntuación.",
        "Propone una estructura lúdica y abierta («tablero de dirección») que permite múltiples itinerarios de lectura invitando a la participación activa del lector cómplice.",
        "Está redactada íntegramente en lunfardo carcelario bonaerense.",
        "Fue escrita durante un viaje en globo aerostático sobre París."
      ],
      correctIndex: 1,
      explanation: "Rayuela dinamita la novela lineal decimonónica ofreciendo al lector la posibilidad de leer de corrido hasta el capítulo 56 o seguir el tablero secuencial propuesto por Cortázar, explorando la vida de Horacio Oliveira y la Maga."
    },
    {
      id: "lit_t04_s02_c09",
      question: "En Pedro Páramo, la única mujer a la que el déspota cacique de la Media Luna amó verdaderamente a lo largo de su vida fue:",
      options: [
        "Dolores Preciado",
        "Susana San Juan",
        "Eduviges Dyada",
        "Dorotea la Cuarraca"
      ],
      correctIndex: 1,
      explanation: "Pedro Páramo somete, despoja y ultraja a toda la comarca, pero vive atormentado por su amor obsesivo e inalcanzable hacia la trastornada Susana San Juan; tras la muerte de esta, el cacique cruza los brazos y deja morir a Comala."
    },
    {
      id: "lit_t04_s02_c10",
      question: "El episodio de la masacre de los trabajadores de la compañía bananera en Cien años de soledad alude históricamente a un hecho real acontecido en Colombia en 1928, donde en la ficción el único sobreviviente que recuerda la verdad es:",
      options: [
        "Aureliano Segundo",
        "José Arcadio Segundo",
        "Gerineldo Márquez",
        "Mauricio Babilonia"
      ],
      correctIndex: 1,
      explanation: "José Arcadio Segundo sobrevive al ametrallamiento en la plaza de la estación y despierta en un tren repleto de cadáveres arrojados al mar; al regresar a Macondo, descubre con horror que la historia oficial ha decretado que allí «no pasó nada»."
    }
  ],

  // Semana 05
  lit_t05_s01: [
    {
      id: "lit_t05_s01_c01",
      question: "En los Comentarios Reales de los Incas (Primera Parte, Lisboa, 1609), el Inca Garcilaso de la Vega asume un proyecto historiográfico y literario que se caracteriza por:",
      options: [
        "Justificar la destrucción absoluta de las costumbres andinas en nombre de la Inquisición.",
        "Reivindicar y armonizar su doble herencia biológica y cultural (incaica y española), corrigiendo los errores de los cronistas hispanos mediante sus memorias y dominio del quechua.",
        "Fomentar una sublevación armada independentista inmediata de los caciques del Cusco.",
        "Negar cualquier valor civilizatorio a los gobernantes del Tahuantinsuyo."
      ],
      correctIndex: 1,
      explanation: "El Inca Garcilaso, primer mestizo biológico y espiritual de América, se proclama orgullosamente «indio, quechua y mestizo», utilizando los testimonios orales de sus parientes maternos de la realeza incaica para brindar una visión idealizada y grandiosa del imperio incaico."
    },
    {
      id: "lit_t05_s01_c02",
      question: "La comedia costumbrista Ña Catita (1856) de Manuel Ascencio Segura censura y satiriza principalmente:",
      options: [
        "La tiranía militarista de las montoneras revolucionarias.",
        "La alcahuetería, el chisme hipócrita y los matrimonios de conveniencia económica impuestos por los padres.",
        "El romanticismo melancólico de los poetas de salón limeños.",
        "La explotación laboral de las comunidades indígenas andinas."
      ],
      correctIndex: 1,
      explanation: "La vieja Ña Catita encarna el arquetipo de la alcahueta chismosa e intrigante (al estilo de la Celestina) que manipula a doña Rufina para que case a su virtuosa hija Juliana con el pretencioso don Alejo por mero interés pecuniario."
    },
    {
      id: "lit_t05_s01_c03",
      question: "En el célebre Discurso en el Politeama (1888), pronunciado tras la desastrosa Guerra del Pacífico, Manuel González Prada sentenció una frase lapidaria que clamaba por la renovación moral del Perú:",
      options: [
        "«El Perú es un mendigo sentado en un banco de oro».",
        "«¡Los viejos a la tumba, los jóvenes a la obra!».",
        "«Libertad, igualdad, fraternidad o muerte».",
        "«En el Perú, donde se pone el dedo, salta la pus»."
      ],
      correctIndex: 1,
      explanation: "González Prada fustigó a la dirigencia política y militar corrupta causante de la derrota bélica («la mano que empuñó el fusil debió manejar la pluma de la ciencia») y llamó a la juventud a reconstruir la patria sobre la base de la ciencia y el trabajo."
    },
    {
      id: "lit_t05_s01_c04",
      question: "La polémica costumbrista en el Perú republicano decimonónico enfrentó dos vertientes literarias e ideológicas representadas respectivamente por:",
      options: [
        "Garcilaso de la Vega (indigenista) vs. Guamán Poma (hispanista).",
        "Manuel Ascencio Segura (criollismo popular y democrático) vs. Felipe Pardo y Aliaga (anticriollismo conservador y aristocrático).",
        "José María Arguedas (socialismo) vs. Ciro Alegría (aprismo).",
        "César Vallejo (vanguardismo) vs. José Santos Chocano (modernismo)."
      ],
      correctIndex: 1,
      explanation: "Segura representó el criollismo nacionalista, popular, con lenguaje coloquial limeño y simpatía por las clases medias; mientras Pardo y Aliaga (autor de «Un viaje») defendió el clasicismo aristocrático, criticando con ironía mordaz el desorden republicano."
    },
    {
      id: "lit_t05_s01_c05",
      question: "¿Cuál de las siguientes obras líricas es la más representativa del poeta romántico piurano Carlos Augusto Salaverry, inspirada en su amor ausente por Ismena Torres?",
      options: [
        "Albores y destellos",
        "Cartas a un ángel (que contiene el poema «¡Acuérdate de mí!»)",
        "Diamantes y perlas",
        "Misterios de la tumba"
      ],
      correctIndex: 1,
      explanation: "Cartas a un ángel (1871) consagra a Salaverry como la máxima voz del romanticismo lírico peruano, destacando la célebre elegía amorosa «¡Acuérdate de mí!» con un tono de suave melancolía becqueriana."
    },
    {
      id: "lit_t05_s01_c06",
      question: "En la Segunda Parte de los Comentarios Reales, publicada póstumamente en Córdoba en 1617 bajo el título Historia General del Perú, Garcilaso de la Vega relata:",
      options: [
        "El origen mítico de Manco Cápac y Mama Ocllo en el lago Titicaca.",
        "El descubrimiento y conquista del Perú por Pizarro, y las sangrientas guerras civiles entre los conquistadores españoles.",
        "La biografía heroica de Túpac Amaru II.",
        "La descripción botánica de las plantas medicinales andinas."
      ],
      correctIndex: 1,
      explanation: "La Primera Parte (1609) trata sobre el imperio incaico, su religión, leyes y gobierno; la Segunda Parte (1617) narra la invasión y conquista hispana, la prisión de Atahualpa y las disputas fratricidas entre pizarristas y almagristas."
    },
    {
      id: "lit_t05_s01_c07",
      question: "La novela precursora del indigenismo peruano Aves sin nido (1889), que denuncia la explotación feudal del indio por la trilogía opresora (gobernador, cura y juez) en el pueblo andino de Kíllac, fue escrita por:",
      options: [
        "Mercedes Cabello de Carbonera",
        "Clorinda Matto de Turner",
        "Flora Tristán",
        "María Nieves y Bustamante"
      ],
      correctIndex: 1,
      explanation: "Clorinda Matto de Turner expone en Aves sin nido el desamparo de la masa indígena oprimida por los gamonales y autoridades corruptas, convirtiéndose en el hito fundacional de la novela indigenista peruana."
    },
    {
      id: "lit_t05_s01_c08",
      question: "En la comedia Ña Catita, ¿quién desenmascara finalmente a don Alejo al revelar que era un hombre casado y sin fortuna en el Cusco?",
      options: [
        "Don Jesús",
        "Don Juan",
        "Don Manuel",
        "Doña Rufina"
      ],
      correctIndex: 1,
      explanation: "Don Juan, un viejo amigo de la familia que llega de viaje, reconoce a don Alejo y entrega una carta que demuestra que este es un impostor con esposa en otra ciudad, arruinando los planes de doña Rufina y despidiendo a Ña Catita."
    },
    {
      id: "lit_t05_s01_c09",
      question: "Manuel González Prada, además de su oratoria incendiaria, impulsó una reforma ortográfica fonética en sus libros (escribiendo 'pájinas', 'ortojrafía') porque consideraba que:",
      options: [
        "Había que acercar la escritura a la pronunciación real y emancipar la cultura peruana del servilismo a la Real Academia Española.",
        "El idioma castellano debía ser sustituido por el quechua colonial en todos los colegios.",
        "Las imprentas limeñas carecían de los tipos móviles tradicionales.",
        "Era una clave secreta para comunicarse con los obreros anarquistas."
      ],
      correctIndex: 0,
      explanation: "González Prada preconizó la simplificación ortográfica como un acto de rebeldía emancipadora frente a la tradición colonial de la metrópoli española."
    },
    {
      id: "lit_t05_s01_c10",
      question: "El relato satírico costumbrista «Un viaje» de Felipe Pardo y Aliaga describe jocosamente las indecisiones y temores de la aristocracia limeña a través del personaje de:",
      options: [
        "El niño Goyito",
        "Ña Catita",
        "El sargento Canuto",
        "El marqués de Torre Tagle"
      ],
      correctIndex: 0,
      explanation: "«El niño Goyito» (don Gregorio), un maduro caballero de cincuenta y dos años mimado e incompetente, tarda tres años en preparar un viaje a Chile debido a la consulta interminable a parientes, monjas y médicos."
    }
  ],

  lit_t05_s02: [
    {
      id: "lit_t05_s02_c01",
      question: "El poemario Trilce (1922) de César Vallejo es considerado una cumbre revolucionaria de la poesía de vanguardia universal porque:",
      options: [
        "Sigue con rigidez la métrica clásica del soneto alejandrino hispánico.",
        "Destruye y reinventa la sintaxis, crea neologismos audaces, subvierte la ortografía y transmite el desamparo existencial y carcelario del ser humano.",
        "Está compuesto exclusivamente en verso quechua prehispánico.",
        "Fue escrito para ensalzar los discursos políticos de la revolución soviética."
      ],
      correctIndex: 1,
      explanation: "En Trilce, Vallejo rompe con el molde modernista y las convenciones gramaticales impuestas: fractura la lengua («quedéme calentico», «calumbos»), expresa la vivencia atroz de su injusto encierro en Trujillo y funda una nueva expresividad estética."
    },
    {
      id: "lit_t05_s02_c02",
      question: "En la novela Los ríos profundos (1958) de José María Arguedas, ¿cuál es el juguete mágico y sonoro que une a los escolares del internado de Abancay y simboliza la armonía cósmica andina?",
      options: [
        "El zumbayllu (peonza o trompo)",
        "El charango de caparazón de armadillo",
        "La quena de hueso",
        "El pututo ceremonial"
      ],
      correctIndex: 0,
      explanation: "El zumbayllu, trompo musical cuyo giro y zumbido hipnótico cautiva a los alumnos del colegio religioso, opera como un mediador mágico que pacifica la hostilidad del internado y conecta al protagonista Ernesto con las fuerzas de la naturaleza andina."
    },
    {
      id: "lit_t05_s02_c03",
      question: "En El mundo es ancho y ajeno (1941) de Ciro Alegría, el venerable alcalde comunal que encarna la sabiduría ancestral, la dignidad colectiva y el apego sagrado a la tierra es:",
      options: [
        "Benito Castro",
        "Rosendo Maqui",
        "El Fiero Vásquez",
        "Álvaro Amenábar"
      ],
      correctIndex: 1,
      explanation: "El anciano Rosendo Maqui lidera la comunidad campesina de Rumi con serenidad, justicia y apego moral inquebrantable a sus tierras ancestrales frente a las artimañas del codicioso terrateniente Amenábar."
    },
    {
      id: "lit_t05_s02_c04",
      question: "En el poemario póstumo Poemas humanos (París, 1939) de César Vallejo, el núcleo temático fundamental gira en torno a:",
      options: [
        "El dolor biológico, el cuerpo sufriente del hombre trabajador, la orfandad cósmica y la solidaridad fraternal universal.",
        "El canto idílico a los paisajes bucólicos de su natal Santiago de Chuco.",
        "La recreación mitológica de los dioses del Olimpo grecolatino.",
        "El optimismo ingenuo ante el progreso de las máquinas industriales."
      ],
      correctIndex: 0,
      explanation: "Poemas humanos es la conmovedora elegía a la condición física y material del hombre («¡Y desgraciadamente, el dolor crece en el mundo a cada rato!»), donde el cuerpo, el hambre, el trabajo proletario y el anhelo de fraternidad se funden en verso desgarrador."
    },
    {
      id: "lit_t05_s02_c05",
      question: "En Los ríos profundos de Arguedas, el levantamiento popular que desborda el orden colonial en Abancay y genera la solidaridad de Ernesto es encabezado por:",
      options: [
        "Los soldados del regimiento militar",
        "Las chicheras mestizas lideradas por doña Felipa exigiendo el reparto justo de la sal",
        "Los sacerdotes del colegio encabezados por el padre Linares",
        "Los hacendados latifundistas de la cuenca del Pachachaca"
      ],
      correctIndex: 1,
      explanation: "El motín de las chicheras en protesta por el acaparamiento y escasez de la sal para los campesinos desata una rebelión popular que conmueve a Ernesto, quien admira el valor de doña Felipa y las mujeres quechuas."
    },
    {
      id: "lit_t05_s02_c06",
      question: "¿Cuál es el desenlace de la comunidad de Rumi en El mundo es ancho y ajeno tras la muerte de Rosendo Maqui y el retorno de Benito Castro?",
      options: [
        "La comunidad gana pacíficamente el juicio de linderos en el Tribunal Supremo de Lima.",
        "Los comuneros deciden emigrar a la selva y abandonar la agricultura.",
        "Benito Castro organiza la resistencia armada de los comuneros en Yanañahui, pero son masacrados por la policía y el ejército armados con fusiles Mauser.",
        "El hacendado Amenábar les devuelve sus fértiles valles reconociendo su error moral."
      ],
      correctIndex: 2,
      explanation: "La novela concluye en tragedia: Benito Castro empuña las armas para defender Yanañahui proclamando «¡Comuneros, a defender Rumi!», pero las tropas enviadas por el Estado y el latifundio exterminan a los comuneros, dejando la tierra ajena a sus legítimos dueños."
    },
    {
      id: "lit_t05_s02_c07",
      question: "El primer verso del poema inicial de Los heraldos negros (1918) de César Vallejo es uno de los comienzos más famosos de la literatura hispanoamericana:",
      options: [
        "«Me moriré en París con aguacero...»",
        "«Hay golpes en la vida, tan fuertes... ¡Yo no sé!»",
        "«Canta, oh diosa, la cólera del Pelida Aquiles...»",
        "«Puedo escribir los versos más tristes esta noche...»"
      ],
      correctIndex: 1,
      explanation: "«Hay golpes en la vida, tan fuertes... ¡Yo no sé! / Golpes como del odio de Dios...» abre el primer poemario de Vallejo, obra aún de influencia modernista formal pero ya cargada de una desgarradora originalidad existencial andina."
    },
    {
      id: "lit_t05_s02_c08",
      question: "¿Qué temática singular caracteriza la narrativa indigenista de José María Arguedas frente a la de Ciro Alegría?",
      options: [
        "Arguedas describe al indígena desde una perspectiva puramente externa y sociológica.",
        "Arguedas vivenció desde niño el mundo quechua como su lengua y universo afectivo materno, logrando una representación lírica, mágica y bicultural desde el interior de la psique andina.",
        "Arguedas escribió novelas policíacas ambientadas en la selva amazónica.",
        "Arguedas descalificó el folclore musical y las tradiciones quechuas."
      ],
      correctIndex: 1,
      explanation: "Criado entre la servidumbre indígena en la hacienda Viseca tras el maltrato de su madrastra, Arguedas asumió el quechua como lengua nutricia, lo que le permitió plasmar la cosmovisión mítica, la ternura y el desgarrador drama identitario del mestizo peruano."
    },
    {
      id: "lit_t05_s02_c09",
      question: "El poemario de César Vallejo inspirado en su compromiso solidario con la causa republicana durante la contienda fratricida española de 1936 es:",
      options: [
        "España, aparta de mí este cáliz",
        "Trilce",
        "Fabla salvaje",
        "Tungsteno"
      ],
      correctIndex: 0,
      explanation: "España, aparta de mí este cáliz (1939) incluye poemas de vibrante fraternidad y fe laica como «Masa», donde el combatiente muerto resucita cuando todos los hombres de la tierra se unen en un abrazo de amor fraternal."
    },
    {
      id: "lit_t05_s02_c10",
      question: "En Los ríos profundos, la peste del tifus negro que azota a los colonos indios de las haciendas del valle del Pachachaca provoca que estos:",
      options: [
        "Huyan hacia Lima para asaltar el palacio de gobierno.",
        "Invadan en masa la ciudad de Abancay desarmados para exigir a los sacerdotes una misa que expulse al demonio de la peste.",
        "Quemen el internado religioso y fusilen a los estudiantes.",
        "Se rindan ante el ejército para ser hospitalizados."
      ],
      correctIndex: 1,
      explanation: "Los colonos enfermos marchan en una sobrecogedora procesión fúnebre sobre Abancay; su fe no busca medicinas químicas, sino la misa y la bendición del padre Linares para salvar sus almas del castigo cósmico."
    }
  ],

  // Semana 06
  lit_t06_s01: [
    {
      id: "lit_t06_s01_c01",
      question: "Mariano Melgar y Valdivieso (Arequipa, 1790 - Umachiri, 1815) es unánimemente considerado en la historia de la literatura peruana como:",
      options: [
        "El máximo exponente de la narrativa modernista criolla.",
        "El precursor del Romanticismo literario en América y creador del yaraví mestizo.",
        "El fundador del costumbrismo satírico limeño.",
        "El principal cronista de la conquista española."
      ],
      correctIndex: 1,
      explanation: "Melgar anticipó por sensibilidad, pasión desgarrada y sacrificio cívico el espíritu romántico antes de su arribo formal a América, fundiendo el yaraví andino tradicional con la métrica y estrofismo lírico castellano."
    },
    {
      id: "lit_t06_s01_c02",
      question: "La musa inspiradora inmortalizada en los apasionados sonetos y yaravíes de Mariano Melgar bajo el nombre poético de 'Silvia' fue:",
      options: [
        "Manuela Sáenz",
        "María Santos Corrales",
        "Francisca Zubiaga",
        "Perricholi"
      ],
      correctIndex: 1,
      explanation: "María Santos Corrales, joven prima de Melgar, rechazó su amor provocando en el poeta el hondo desconsuelo y dolor que nutrió sus composiciones más sentidas y elegíacas («¿Por qué a verte volví, Silvia querida?»)."
    },
    {
      id: "lit_t06_s01_c03",
      question: "¿Cuál es la génesis cultural del yaraví melgariano que José Carlos Mariátegui destacó en sus 7 Ensayos de Interpretación de la Realidad Peruana?",
      options: [
        "Es una copia servil de las odas de Horacio sin ningún elemento andino.",
        "Es el primer instante de auténtica confluencia mestiza donde el harawi quechua doliente se injerta en las formas poéticas del castellano.",
        "Es un subgénero teatral importado de la comedia del arte italiana.",
        "Es un canto guerrero de las milicias realistas virreinales."
      ],
      correctIndex: 1,
      explanation: "Mariátegui precisó que en Melgar el harawi quechua (antiguo canto andino de amor y tristeza) se reviste del traje lírico español, constituyendo el primer brote mestizo genuino de nuestra literatura nacional."
    },
    {
      id: "lit_t06_s01_c04",
      question: "En sus Fábulas políticas, como El cantero y el asno o Los gatos, Mariano Melgar utilizó el género didáctico para:",
      options: [
        "Enseñar latín clásico a los novicios del Seminario San Jerónimo.",
        "Criticar con ingenio alegórico la servidumbre colonial, la opresión del indio por el poder virreinal y la discordia civil de los patriotas.",
        "Adular al virrey Fernando de Abascal para conseguir prebendas judiciales.",
        "Describir la fauna silvestre de la campiña arequipeña."
      ],
      correctIndex: 1,
      explanation: "Melgar convirtió la fábula esópica en arma de combate cívico: en El cantero y el asno denuncia cómo el dominador acusa al indio de ignorante y flojo sin advertir que es la brutal opresión y los azotes lo que lo reducen a esa condición."
    },
    {
      id: "lit_t06_s01_c05",
      question: "¿Cuál fue el papel cívico y el destino final de Mariano Melgar en la gesta de la Independencia del Perú?",
      options: [
        "Fue nombrado embajador en España y murió de anciano en Madrid.",
        "Se incorporó como auditor de guerra al ejército patriota de Mateo Pumacahua y los hermanos Angulo, siendo fusilado por las tropas realistas tras la batalla de Umachiri a los 24 años.",
        "Presidió el primer Congreso Constituyente de la República en Lima.",
        "Falleció en la batalla de Ayacucho al mando de un regimiento de caballería."
      ],
      correctIndex: 1,
      explanation: "Melgar se unió a la rebelión patriota cusqueña-arequipeña de 1814; tras la sangrienta derrota de Umachiri en marzo de 1815, fue capturado por el general realista Ramírez y fusilado en el mismo campo de batalla, sellando con su sangre su fervor libertario."
    },
    {
      id: "lit_t06_s01_c06",
      question: "En el célebre soneto de Melgar que inicia: «La noche lúgubre, callada y fría, / tiende su manto tenebroso y triste...», la atmósfera nocturna y fúnebre ilustra con antelación un rasgo típicamente:",
      options: [
        "Neoclásico racionalista",
        "Romántico",
        "Modernista preciosista",
        "Vanguardista lúdico"
      ],
      correctIndex: 1,
      explanation: "La noche desolada, el alma apesadumbrada, la soledad espectral y la exaltación del dolor íntimo son rasgos precursores del temperamento romántico que Melgar plasmó décadas antes que los románticos hispanoamericanos."
    },
    {
      id: "lit_t06_s01_c07",
      question: "Antes de Silvia, el joven Mariano Melgar dedicó sus primeras composiciones amorosas a otra dama arequipeña llamada Manuela Paredes, a quien llamó poéticamente:",
      options: [
        "Melissa",
        "Amarilis",
        "Filis",
        "Lesbia"
      ],
      correctIndex: 0,
      explanation: "Bajo la convención poética pastoril de su juventud neoclásica, Melgar cantó primero a 'Melissa' (Manuela Paredes) antes de su apasionada entrega al amor desdichado por 'Silvia'."
    },
    {
      id: "lit_t06_s01_c08",
      question: "Melgar dominaba con excelencia el latín clásico en el Seminario de San Jerónimo de Arequipa, lo que le permitió realizar la célebre traducción al castellano de:",
      options: [
        "La Eneida de Virgilio",
        "El Arte de olvidar (Remedia Amoris) de Ovidio",
        "Las Metamorfosis de Apuleyo",
        "La República de Cicerón"
      ],
      correctIndex: 1,
      explanation: "Melgar vertió al español con singular elegancia los Remedia Amoris de Ovidio bajo el título de El arte de olvidar, procurando en vano remediar su propia obsesión afectiva."
    },
    {
      id: "lit_t06_s01_c09",
      question: "La célebre Marcha Patriótica de Melgar («Ya llegó el dulce momento / en que esparza la alegría / sus aromas...») fue entonada entusiastamente por:",
      options: [
        "Los virreyes en la Plaza Mayor de Lima.",
        "Las tropas patriotas que ingresaron victoriosas a Arequipa en 1814.",
        "Los corsarios ingleses en el puerto de Mollendo.",
        "Los jesuitas expulsados en su viaje a Roma."
      ],
      correctIndex: 1,
      explanation: "La Marcha Patriótica fue compuesta y cantada por Melgar para arengar a las fuerzas insurgentes patriotas cuando el ejército de Pumacahua tomó la ciudad blanca de Arequipa."
    },
    {
      id: "lit_t06_s01_c10",
      question: "En la estructura lírica del yaraví de Melgar, la métrica preferida que aporta ligereza y cadencia melancólica al canto es predominantemente el verso:",
      options: [
        "Alejandrino de catorce sílabas",
        "Arte menor (cinco y seis sílabas o heptasílabos)",
        "Endecasílabo heroico",
        "Versículo libre asonante"
      ],
      correctIndex: 1,
      explanation: "El yaraví adopta versos cortos de arte menor (pentasílabos y hexasílabos o combinaciones con heptasílabos), idóneos para acompañar el tañido de la vihuela o guitarra en compás triste."
    }
  ],

  lit_t06_s02: [
    {
      id: "lit_t06_s02_c01",
      question: "El grupo literario de vanguardia puneño de la década de 1920 fundado en torno a la revista Boletín Titikaka y liderado por Gamaliel Churata fue:",
      options: [
        "El Grupo Colónida",
        "El Grupo Orkopata",
        "El Grupo Norte",
        "La Generación del 50"
      ],
      correctIndex: 1,
      explanation: "El Grupo Orkopata, integrado por Gamaliel Churata, Alejandro Peralta, Emilio Vásquez y otros intelectuales del altiplano, revolucionó la literatura andina aunando el vanguardismo formal internacional con el indigenismo telúrico de la cuenca del Titicaca."
    },
    {
      id: "lit_t06_s02_c02",
      question: "La obra maestra de Gamaliel Churata (Puno, 1897 - Lima, 1969), monumental texto híbrido donde confluyen mito andino, filosofía quechua-aymara, ensayo y experimentación lingüística radical, se titula:",
      options: [
        "El pez de oro (1957)",
        "Ande",
        "Chukiwanka",
        "Tempestad en los Andes"
      ],
      correctIndex: 0,
      explanation: "El pez de oro (Retablo del Laykakuy) es una de las cumbres del pensamiento y la vanguardia surandina; en él Churata indaga en la cosmogonía andina, el mito del pez de oro del lago Titicaca y concibe un lenguaje heterodoxo donde el castellano es permeado por la sintaxis quechua y aymara."
    },
    {
      id: "lit_t06_s02_c03",
      question: "En Arequipa de inicios del siglo XX, la tertulia literaria e intelectual conocida como 'La Bohemia del Aquelarre' reunió a destacados poetas que abrieron el camino a la modernidad lírica regional, entre los cuales destacaron:",
      options: [
        "Abraham Valdelomar y José Carlos Mariátegui",
        "Percy Gibson y César Atahualpa Rodríguez",
        "César Vallejo y Alcides Spelucín",
        "José Santos Chocano y Clemente Palma"
      ],
      correctIndex: 1,
      explanation: "La Bohemia del Aquelarre (hacia 1916) nucleó a figuras como Percy Gibson (autor de «El gallo»), César Atahualpa Rodríguez («Canto a Arequipa») y Alberto Guillén, combinando el refinamiento posmodernista con el orgullo cívico y el paisaje del Misti."
    },
    {
      id: "lit_t06_s02_c04",
      question: "La novela inaugural de Mario Vargas Llosa, La ciudad y los perros (Premio Biblioteca Breve 1962), ambientada en el Colegio Militar Leoncio Prado de Lima, aborda medularmente:",
      options: [
        "La idílica relación de los cadetes con sus profesores civiles.",
        "La violencia institucional, el autoritarismo militar, la falsedad del código del honor y la fractura social y racial del Perú.",
        "El enfrentamiento diplomático entre Perú y Ecuador en la Amazonía.",
        "La apología de la disciplina cuartelaria como modelo pedagógico supremo."
      ],
      correctIndex: 1,
      explanation: "La ciudad y los perros desnuda el machismo, la crueldad y la hipocresía de una educación castrense donde conviven jóvenes de todas las clases sociales y regiones peruanas, condensando las contradicciones de todo el país."
    },
    {
      id: "lit_t06_s02_c05",
      question: "¿Quién es el personaje del círculo de cadetes en La ciudad y los perros que encarna el liderazgo brutal, la ley de la fuerza despiadada y funda el 'Círculo'?",
      options: [
        "Alberto Fernández «el Poeta»",
        "Ricardo Arana «el Esclavo»",
        "El Jaguar",
        "El Boa"
      ],
      correctIndex: 2,
      explanation: "El Jaguar impone el respeto a través de la violencia física inmutable en la cuadra militar, concibiendo el mundo como una selva donde solo los fuertes sobreviven frente a los débiles."
    },
    {
      id: "lit_t06_s02_c06",
      question: "En La ciudad y los perros, el cadete tímido y marginado apodado «el Esclavo» es asesinado durante unas maniobras militares debido a que:",
      options: [
        "Había intentado fugarse del cuartel con un fusil ametralladora.",
        "Había delatado al cadete Cava como autor del robo del examen de Química para obtener un permiso de salida.",
        "Había golpeado al teniente Gamboa en el comedor de cadetes.",
        "Pertenecía a una célula política clandestina en el colegio."
      ],
      correctIndex: 1,
      explanation: "Ricardo Arana («el Esclavo»), desesperado por salir a ver a Teresa, confiesa quién robó el examen, desatando la cólera del 'Círculo' y siendo víctima de un disparo mortal en la nuca durante las maniobras en Chorrillos."
    },
    {
      id: "lit_t06_s02_c07",
      question: "Entre las técnicas narrativas de vanguardia magistralmente utilizadas por Mario Vargas Llosa en La ciudad y los perros, destaca la técnica de 'los vasos comunicantes', que consiste formalmente en:",
      options: [
        "Intercalar poemas rimados dentro de cada capítulo en prosa.",
        "Fundir y alternar en un mismo párrafo o secuencia dos o más escenas que ocurren en tiempos o espacios diferentes para que se iluminen y potencien mutuamente.",
        "Obligar al lector a utilizar un diccionario quechua para descifrar la trama.",
        "Escribir toda la novela exclusivamente en diálogos teatrales sin narrador."
      ],
      correctIndex: 1,
      explanation: "Los vasos comunicantes enlazan dos acontecimientos o conversaciones ocurridas en distintos lugares o épocas entrelazando sus líneas, creando una rica tensión dramática y una perspectiva totalizadora."
    },
    {
      id: "lit_t06_s02_c08",
      question: "El poemario Ande (1926) del puneño Alejandro Peralta, ilustrado con grabados de Diego Kunurana y tipografía experimental, es emblemático por:",
      options: [
        "Ser el primer poemario vanguardista indigenista del Perú que canta al campesino y a la meseta del Collao con versos libres de impacto visual.",
        "Celebrar las victorias militares del general Bolívar en Junín.",
        "Imitar los sonetos renacentistas de Garcilaso de la Vega.",
        "Estar redactado en coplas de pie quebrado medievales."
      ],
      correctIndex: 0,
      explanation: "Ande fusiona el ultraísmo y vanguardismo cosmopolita (disposición gráfica, metáforas dinámicas) con la vivencia telúrica del indio altiplánico, inaugurando el vanguardismo indigenista peruano."
    },
    {
      id: "lit_t06_s02_c09",
      question: "En La ciudad y los perros, el oficial recto y disciplinado que cree en la justicia militar e insiste en investigar a fondo el homicidio del Esclavo a pesar de la complicidad de sus superiores es:",
      options: [
        "El capitán Garrido",
        "El teniente Remigio Gamboa",
        "El coronel director",
        "El teniente Huarina"
      ],
      correctIndex: 1,
      explanation: "El teniente Gamboa representa la estricta rectitud profesional y moral; por negarse a encubrir el asesinato para proteger el «prestigio» de la institución, es castigado con el traslado a un remoto puesto en la puna andina."
    },
    {
      id: "lit_t06_s02_c10",
      question: "El célebre poema cívico que proclama «Arequipa, la tierra de libres, / cuna de Mariano Melgar...» tiene como autor insigne de la lírica mistiana a:",
      options: [
        "César Atahualpa Rodríguez",
        "Percy Gibson",
        "Gamaliel Churata",
        "Guillermo Mercado"
      ],
      correctIndex: 0,
      explanation: "César Atahualpa Rodríguez, patriarca de la poesía arequipeña contemporánea y miembro de Aquelarre, plasmó en sus versos la bravura, la independencia cívica y la devoción hacia la tierra del volcán Misti."
    }
  ]
};

// Apply new challenges to all 6 weeks of Literatura
const baseDir = 'SALIDA_KOTLIN/literatura';
for (let i = 1; i <= 6; i++) {
  const pad = String(i).padStart(2, '0');
  const filePath = path.join(baseDir, `LiteraturaSemana${pad}.kt`);
  const parsed = parseKotlinFileRobust(filePath);

  let newFileContent = `package literatura\n\nobject LiteraturaSemana${pad} {\n\n    val lessons = listOf(\n`;

  for (let lIdx = 0; lIdx < parsed.lessons.length; lIdx++) {
    const l = parsed.lessons[lIdx];
    const chList = newChallenges[l.id];
    if (!chList || chList.length !== 10) {
      console.error(`Error: Missing or invalid challenges for lesson ${l.id}`);
      process.exit(1);
    }

    newFileContent += `        LessonNode(\n`;
    newFileContent += `            id = "${l.id}",\n`;
    newFileContent += `            subjectId = "${l.subjectId}",\n`;
    newFileContent += `            semana = ${l.semana},\n`;
    newFileContent += `            subtema = "${l.subtema}",\n`;
    newFileContent += `            title = "${l.title}",\n`;
    newFileContent += `            theory = LessonTheory(\n`;
    newFileContent += `                content = """${l.theory}""".trimIndent()\n`;
    newFileContent += `            ),\n`;
    newFileContent += `            challenges = listOf(\n`;

    for (let cIdx = 0; cIdx < chList.length; cIdx++) {
      const c = chList[cIdx];
      newFileContent += `                Challenge(\n`;
      newFileContent += `                    id = "${c.id}",\n`;
      newFileContent += `                    question = ${JSON.stringify(c.question)},\n`;
      newFileContent += `                    options = listOf(\n`;
      for (let oIdx = 0; oIdx < c.options.length; oIdx++) {
        const comma = oIdx < c.options.length - 1 ? ',' : '';
        newFileContent += `                        ${JSON.stringify(c.options[oIdx])}${comma}\n`;
      }
      newFileContent += `                    ),\n`;
      newFileContent += `                    correctIndex = ${c.correctIndex},\n`;
      newFileContent += `                    explanation = ${JSON.stringify(c.explanation)}\n`;
      const chComma = cIdx < chList.length - 1 ? ',' : '';
      newFileContent += `                )${chComma}\n`;
    }

    const lComma = lIdx < parsed.lessons.length - 1 ? ',' : '';
    newFileContent += `            )\n`;
    newFileContent += `        )${lComma}\n`;
  }

  newFileContent += `    )\n}\n`;

  fs.writeFileSync(filePath, newFileContent, 'utf8');
  console.log(`Updated ${filePath} successfully.`);
}

console.log("All Literatura files repaired.");
