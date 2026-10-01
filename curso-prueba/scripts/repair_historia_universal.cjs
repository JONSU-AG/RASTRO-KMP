const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const newChallenges = {
  // Semana 01
  huni_t01_s01: [
    {
      id: "huni_t01_s01_c01",
      question: "En el proceso evolutivo de la hominización, la transformación anatómica y biomecánica primaria que precedió y facilitó el desarrollo cerebral y la liberación de las manos para fabricar utensilios fue:",
      options: [
        "El bipedismo y la marcha erecta permanente.",
        "La pérdida del vello corporal denso.",
        "El desarrollo del lenguaje articulado simbólico.",
        "La invención del arco y la flecha."
      ],
      correctIndex: 0,
      explanation: "El bipedismo (surgido hace más de 4 millones de años en homínidos como Ardipithecus y Australopithecus en el Valle del Rift) liberó las extremidades anteriores de la locomoción, transformando las manos en órganos prensiles y herramientas universales."
    },
    {
      id: "huni_t01_s01_c02",
      question: "El fósil etíope de Australopithecus afarensis descubierto en 1974 por Donald Johanson en Hadar (Etiopía), bautizado popularmente como 'Lucy', es célebre en la paleoantropología porque demostró:",
      options: [
        "El dominio controlado del fuego y la caza mayor.",
        "La práctica de la locomoción bípeda erguida hace aproximadamente 3.2 millones de años.",
        "El enterramiento deliberado de los difuntos con flores.",
        "La elaboración sistemática de las primeras hachas de mano líticas."
      ],
      correctIndex: 1,
      explanation: "La pelvis ancha y la articulación de la rodilla de Lucy confirmaron fehacientemente que los australopitecinos caminaban de pie erguidos mucho antes del crecimiento espectacular de la capacidad craneal del género Homo."
    },
    {
      id: "huni_t01_s01_c03",
      question: "El primer homínido clasificado formalmente dentro del género Homo debido a su capacidad deliberada de confeccionar herramientas líticas de guijarros tallados (industria olduvayense) es:",
      options: [
        "Homo erectus",
        "Homo habilis",
        "Homo sapiens neanderthalensis",
        "Australopithecus africanus"
      ],
      correctIndex: 1,
      explanation: "Homo habilis («hombre hábil», 2.5 Ma) es reconocido como el primer fabricante consciente de herramientas de piedra (choppers o cantos rodados trabajados), lo que marca el inicio cultural del Paleolítico."
    },
    {
      id: "huni_t01_s01_c04",
      question: "El logro cultural y biológico decisivo atribuido a Homo erectus que le permitió migrar fuera de África para poblar Asia (Hombre de Java y Pekín) y Europa fue:",
      options: [
        "La domesticación del caballo de tiro.",
        "La producción y domesticación controlada del fuego, que brindó calor, defensa contra depredadores y cocción de alimentos.",
        "La pintura rupestre parietal en cavernas profundas.",
        "La agricultura sistemática de cereales."
      ],
      correctIndex: 1,
      explanation: "El control del fuego por Homo erectus representó un hito adaptativo trascendental: facilitó la digestión de proteínas acelerando la encefalización, protegió del frío glacial e hizo posible la expansión extracontinental hacia Eurasia."
    },
    {
      id: "huni_t01_s01_c05",
      question: "La primera especie del género humano a la que se le atribuyen pruebas incuestionables de pensamiento simbólico, espiritualidad y realización de entierros religiosos deliberados asociados a ofrendas florales es:",
      options: [
        "Homo habilis",
        "Homo neanderthalensis (Hombre de Neandertal)",
        "Homo ergaster",
        "Australopithecus robustus"
      ],
      correctIndex: 1,
      explanation: "Los fósiles neandertales hallados en Shanidar (Irak) y La Chapelle-aux-Saints (Francia) revelaron cuerpos depositados cuidadosamente en posición fetal con pigmentos de ocre y ofrendas, prueba irrefutable de conciencia ante la muerte y religiosidad en el Paleolítico Medio."
    },
    {
      id: "huni_t01_s01_c06",
      question: "El Hombre de Cro-Magnon, representante directo de nuestra especie Homo sapiens en el Paleolítico Superior europeo, destacó artísticamente por:",
      options: [
        "La arquitectura megalítica de templos solares circulares.",
        "La creación del arte rupestre parietal (pinturas polícromas de bisontes y caballos en Altamira y Lascaux) y del arte mobiliar (Venus esteatopigias de fecundidad).",
        "La fundición de pectorales de bronce y oro.",
        "El modelado de vasijas de cerámica cocida en hornos cerrados."
      ],
      correctIndex: 1,
      explanation: "Homo sapiens alcanzó una explosión cognitiva en el Paleolítico Superior creando arte parietal rupestre con sentido mágico-cinegético y esculturas portátiles femeninas (Venus de Willendorf) vinculadas al culto a la fertilidad."
    },
    {
      id: "huni_t01_s01_c07",
      question: "¿Cuál es la región geográfica del este de África considerada unánimemente como la «Cuna de la Humanidad» debido a su extraordinaria riqueza en fósiles de homínidos?",
      options: [
        "El Desierto del Sahara",
        "El Gran Valle del Rift (Rift Valley)",
        "La cuenca del río Congo",
        "La cordillera del Atlas"
      ],
      correctIndex: 1,
      explanation: "La fractura tectónica del Valle del Rift provocó la desecación de los bosques orientales africanos en sabanas abiertas, forzando a los primates ancestrales a descender de los árboles y evolucionar hacia el bipedismo."
    },
    {
      id: "huni_t01_s01_c08",
      question: "La capacidad de comunicación mediante un lenguaje doblemente articulado (fonemas y morfemas combinables) requirió anatómicamente de:",
      options: [
        "El acortamiento del fémur.",
        "El descenso de la laringe junto a la cavidad bucofaríngea y el desarrollo de las áreas cerebrales de Broca y Wernicke.",
        "El ensanchamiento de las mandíbulas provistas de grandes colmillos.",
        "La duplicación del número de costillas flotantes."
      ],
      correctIndex: 1,
      explanation: "El habla articulada compleja exigió una reorganización neuromuscular del córtex cerebral (áreas de Broca y Wernicke) y el descenso evolutivo de la laringe que permitió modular una amplísima gama de sonidos fonéticos inteligibles."
    },
    {
      id: "huni_t01_s01_c09",
      question: "El esqueleto de Neandertal encontrado en 1856 en el valle de Neander, cerca de Düsseldorf (Alemania), se adaptó corporalmente a los rigores de la glaciación mediante rasgos físicos como:",
      options: [
        "Cuerpo esbelto, extremidades muy alargadas y baja densidad ósea.",
        "Complexión robusta y baja, torso en barril, huesos gruesos y amplias fosas nasales para calentar el aire glacial.",
        "Ausencia de arcos superciliares en la frente.",
        "Bípedos con pulgar del pie divergente prensil."
      ],
      correctIndex: 1,
      explanation: "Siguiendo las reglas ecológicas de Bergmann y Allen, el Neandertal desarrolló un biotipo macizo y compacto para retener el calor corporal durante las eras glaciales pleistocénicas de Europa."
    },
    {
      id: "huni_t01_s01_c10",
      question: "Los análisis genéticos modernos de ADN fósil han demostrado de manera contundente que las poblaciones humanas no africanas actuales poseen entre un 1% y un 3% de genes de:",
      options: [
        "Australopithecus afarensis",
        "Homo neanderthalensis, debido a la hibridación fértil ocurrida en el Próximo Oriente hace unos 60 000 años.",
        "Gigantopithecus blacki",
        "Paranthropus boisei"
      ],
      correctIndex: 1,
      explanation: "La paleogenómica (liderada por Svante Pääbo, Nobel de Medicina 2022) comprobó el cruce genético entre sapiens salidos de África y neandertales eurasiáticos, desmintiendo el modelo de reemplazo total sin mezcla."
    }
  ],

  huni_t01_s02: [
    {
      id: "huni_t01_s02_c01",
      question: "El arqueólogo australiano Vere Gordon Childe acuñó la categoría conceptual de 'Revolución Neolítica' para definir la trascendental transformación consistente en:",
      options: [
        "El paso del nomadismo depredador a la economía productora de alimentos basada en la agricultura y la ganadería.",
        "La invención del ferrocarril a vapor y la metalurgia del acero.",
        "El descubrimiento del hierro por los invasores indoeuropeos.",
        "La conquista marítima del Mediterráneo por los fenicios."
      ],
      correctIndex: 0,
      explanation: "La Revolución Neolítica supuso el cambio más radical de la prehistoria: el ser humano dejó de depender pasivamente de la recolección y la caza para domesticar plantas y animales, asentándose en aldeas permanentes."
    },
    {
      id: "huni_t01_s02_c02",
      question: "La región geográfica del Próximo Oriente en forma de arco donde se inició primigeniamente la domesticación del trigo, la cebada, la oveja y la cabra hacia el 9 000 a.C. se denomina:",
      options: [
        "La cuenca del río Amarillo",
        "El Creciente Fértil (o Media Luna Fértil)",
        "La península Balcánica",
        "Las estepas del Cáucaso"
      ],
      correctIndex: 1,
      explanation: "El Creciente Fértil abarca desde los valles del Nilo en Egipto, la franja sirio-palestina (Levante) hasta las llanuras regadas por el Tigris y el Éufrates en Mesopotamia."
    },
    {
      id: "huni_t01_s02_c03",
      question: "Una consecuencia social e institucional determinante derivada de la producción sistemática de excedentes alimentarios en el Neolítico fue:",
      options: [
        "El retorno a la igualdad comunal irrestricta de las bandas paleolíticas.",
        "La división social del trabajo, la aparición de la propiedad privada y el surgimiento de las clases sociales y las primeras formas de Estado teocrático.",
        "La prohibición definitiva de la guerra y de los conflictos territoriales.",
        "La desaparición de los artesanos y ceramistas especializados."
      ],
      correctIndex: 1,
      explanation: "Al generarse excedentes agrícolas que no todos necesitaban producir directamente, surgieron sectores dedicados al gobierno, el culto religioso y la guerra que se apropiaron del excedente, quebrando la igualdad comunal ancestral."
    },
    {
      id: "huni_t01_s02_c04",
      question: "Las construcciones megalíticas del Neolítico y la Edad de los Metales compuestas por grandes bloques de piedra alargados clavados verticalmente de forma aislada en el suelo reciben el nombre de:",
      options: [
        "Dólmenes",
        "Menhires",
        "Crómlechs",
        "Zigurats"
      ],
      correctIndex: 1,
      explanation: "El menhir es el monumento megalítico más elemental: una piedra erguida verticalmente asociada al culto solar, fálico o a los antepasados; cuando forman círculos sagrados (como Stonehenge) se denominan crómlechs, y cuando forman cámaras funerarias techadas son dólmenes."
    },
    {
      id: "huni_t01_s02_c05",
      question: "El periodo de transición climática y cultural entre el Paleolítico y el Neolítico (aproximadamente 10 000 - 8 000 a.C.), caracterizado por el fin de las glaciaciones, la recolección intensiva, la horticultura inicial y el empleo de microlitos, es:",
      options: [
        "El Mesolítico",
        "El Calcolítico",
        "La Edad del Bronce",
        "El Paleolítico Inferior"
      ],
      correctIndex: 0,
      explanation: "El Mesolítico es la fase de readaptación al clima cálido del Holoceno: los cazadores diseñaron microlitos (pequeñas puntas líticas geométricas incrustadas en madera o hueso para arpones y hoces) e iniciaron la horticultura experimental."
    },
    {
      id: "huni_t01_s02_c06",
      question: "La Edad del Bronce (aprox. 3 000 - 1 200 a.C.) se inauguró tecnológicamente mediante el descubrimiento de una aleación metalúrgica lograda al combinar:",
      options: [
        "Hierro con carbón vegetal.",
        "Cobre con estaño en proporción aproximada de 9 a 1.",
        "Oro con plata nativa.",
        "Cinc con plomo fundido."
      ],
      correctIndex: 1,
      explanation: "El bronce superó en dureza y maleabilidad al cobre nativo al fundir nueve partes de cobre con una de estaño, permitiendo forjar armas resistentes y herramientas que impulsaron la revolución urbana y los primeros imperios."
    },
    {
      id: "huni_t01_s02_c07",
      question: "¿Cuál de los siguientes hitos civilizatorios fundamentales de la historia humana surgió durante la Edad del Bronce en Mesopotamia y Egipto?",
      options: [
        "La aparición de la escritura (cuneiforme y jeroglífica) y el nacimiento de las primeras ciudades-estado.",
        "La pintura rupestre parietal en cavernas.",
        "La invención del arco y la flecha.",
        "El bipedismo y la pérdida del pelaje."
      ],
      correctIndex: 0,
      explanation: "Hacia el 3 200 a.C., la necesidad administrativa de registrar los tributos, granos y ganado en los templos del Bronce impulsó a los sumerios a crear la escritura cuneiforme, marcando formalmente el límite entre la Prehistoria y la Historia."
    },
    {
      id: "huni_t01_s02_c08",
      question: "El pueblo indoeuropeo de Asia Menor (Anatolia) que guardó con celo el secreto de la fundición del hierro a altas temperaturas y lo utilizó como ventaja militar decisiva con sus carros de combate fue:",
      options: [
        "Los fenicios",
        "Los hititas",
        "Los minoicos",
        "Los sumerios"
      ],
      correctIndex: 1,
      explanation: "Los hititas dominaron la metalurgia del hierro forjado hacia el siglo XIV a.C., manteniendo el monopolio de las espadas y puntas de hierro con las que desafiaron a los faraones egipcios en la célebre batalla de Qadesh."
    },
    {
      id: "huni_t01_s02_c09",
      question: "El asentamiento proto-urbano neolítico de Çatalhöyük (Anatolia central, actual Turquía), descubierto por James Mellaart, es célebre porque sus viviendas carecían de puertas exteriores y calles, ingresándose a ellas:",
      options: [
        "A través de túneles subterráneos excavados en la caliza.",
        "Por los techos de barro mediante escaleras de madera portátiles.",
        "Únicamente navegando en barcas por acequias interiores.",
        "Mediante puentes levadizos vigilados por soldados."
      ],
      correctIndex: 1,
      explanation: "Çatalhöyük estaba configurado como un apiñamiento continuo de casas de adobe unidas pared con pared sin calles: las terrazas y azoteas eran el espacio de tránsito comunal y se descendía al hogar por un agujero en el techo."
    },
    {
      id: "huni_t01_s02_c10",
      question: "El término 'Calcolítico' o 'Eneolítico' designa en la cronología arqueológica a la etapa transicional en la que:",
      options: [
        "Se abandonó la agricultura en favor de la minería de oro.",
        "Se empezó a utilizar el cobre nativo martillado en frío junto con la piedra pulimentada, antes del descubrimiento de la aleación del bronce.",
        "El hierro sustituyó al aluminio en todas las herramientas.",
        "Se inventó la rueda hidráulica de madera."
      ],
      correctIndex: 1,
      explanation: "El Calcolítico (del griego chalkos, cobre, y lithos, piedra) define la fase intermedia donde conviven los instrumentos líticos tradicionales con los primeros objetos ornamentales y armas de cobre no aleado."
    }
  ],

  // Semana 02
  huni_t02_s01: [
    {
      id: "huni_t02_s01_c01",
      question: "Las primeras civilizaciones fluviales del mundo antiguo (Sumeria, Egipto, Indo y China) se caracterizaron económicamente por constituir:",
      options: [
        "Economías mercantiles y bancarias con libre cambio aduanero.",
        "Sociedades hidráulicas donde el poder centralizado organizó el aprovechamiento masivo del agua mediante canales de regadío, diques y represas.",
        "Comunidades pastoriles nómades sin división del trabajo.",
        "Repúblicas parlamentarias de pequeños propietarios campesinos."
      ],
      correctIndex: 1,
      explanation: "Como demostró Karl Wittfogel, el control de las periódicas e impredecibles crecidas de los grandes ríos exigió una burocracia centralizada, ingenieros y miles de trabajadores dirigidos por un Estado despótico para obras hidráulicas monumentales."
    },
    {
      id: "huni_t02_s01_c02",
      question: "En la Baja Mesopotamia, el pueblo de los sumerios es reconocido como el creador de la civilización histórica al fundar las primeras ciudades-estado autónomas, entre las que destacaron:",
      options: [
        "Micenas, Tirinto y Esparta",
        "Ur, Uruk, Lagash y Nippur",
        "Tebas, Menfis y Alejandría",
        "Tiro, Sidón y Cartago"
      ],
      correctIndex: 1,
      explanation: "Los sumerios establecieron ciudades-estado independientes en el sur mesopotámico (valle bajo del Tigris y Éufrates) gobernadas por un rey-sacerdote (patesi o ensi) y protegidas por una deidad tutelar local."
    },
    {
      id: "huni_t02_s01_c03",
      question: "El sistema de escritura cuneiforme inventado por los sumerios hacia el 3 300 a.C. debe su denominación técnica a:",
      options: [
        "El uso de tintas vegetales sobre rollos de papiro egipcio.",
        "Los trazos en forma de cuña o clavos impresos con un estilete de caña sobre tablillas de arcilla fresca y húmeda que luego eran secadas al sol o cocidas.",
        "El dibujo figurativo de jeroglíficos tallados sobre obeliscos de granito.",
        "El empleo exclusivo de nudos multicolores en cuerdas de lino."
      ],
      correctIndex: 1,
      explanation: "Cuneiforme proviene del latín cuneus ('cuña'); los escribas sumerios presionaban una caña con punta biselada en arcilla plástica para registrar contabilidades de graneros y más tarde leyes y literatura (Epopeya de Gilgamesh)."
    },
    {
      id: "huni_t02_s01_c04",
      question: "El templo mesopotámico característico con forma de pirámide escalonada de varios pisos de ladrillo cocido, que servía simultáneamente como centro religioso, administrativo y observatorio astronómico, se denominaba:",
      options: [
        "Hipogeo",
        "Zigurat",
        "Mastaba",
        "Partenón"
      ],
      correctIndex: 1,
      explanation: "El zigurat (como el de Ur o la mítica Torre de Babel en Babilonia) simbolizaba una montaña cósmica sagrada que unía el cielo y la tierra, rematada en un santuario superior donde moraba el dios tutelar."
    },
    {
      id: "huni_t02_s01_c05",
      question: "El primer imperio unificado de la historia universal fue fundado en Mesopotamia hacia el 2 350 a.C. por el monarca conquistador:",
      options: [
        "Hammurabi",
        "Sargón I de Acad (Sargón el Grande)",
        "Nabucodonosor II",
        "Asurbanipal"
      ],
      correctIndex: 1,
      explanation: "Sargón I, rey de los semitas acadios, derrotó a Lugalzagesi de Umma y unificó por primera vez militarmente a toda Mesopotamia bajo un solo poder dinástico que se extendió desde el Golfo Pérsico hasta el mar Mediterráneo."
    },
    {
      id: "huni_t02_s01_c06",
      question: "El Código de Hammurabi, promulgado durante el Primer Imperio Babilónico hacia el 1750 a.C., es uno de los monumentos jurídicos más célebres de la Antigüedad porque consagró de forma sistemática el principio de:",
      options: [
        "La presunción de inocencia sin juicio previo.",
        "La Ley del Talión («ojo por ojo, diente por diente»), graduando las penas según la clase social del ofensor y la víctima.",
        "La abolición definitiva de la esclavitud por deudas.",
        "La igualdad legal absoluta entre nobles y esclavos."
      ],
      correctIndex: 1,
      explanation: "Grabado en una estela de diorita negra bajo la figura del dios de la justicia Shamash, el código de Hammurabi aplicó la retribución simétrica o talión («si un hombre destruye el ojo de un noble, se le destruirá su ojo»), aunque con penalizaciones pecuniarias si la víctima era plebeyo o esclavo."
    },
    {
      id: "huni_t02_s01_c07",
      question: "El Imperio Asirio destacó en el Próximo Oriente antiguo por consolidar una maquinaria de guerra despiadada basada en:",
      options: [
        "La diplomacia pacifista y la renuncia a los tributos.",
        "El uso masivo de armas de hierro, caballería pesada acorazada, máquinas de asedio y la aplicación del terror sistemático y deportaciones en masa de pueblos vencidos.",
        "El reclutamiento exclusivo de filósofos atenienses.",
        "La conversión obligatoria al zoroastrismo persa."
      ],
      correctIndex: 1,
      explanation: "Desde sus capitales Asur y Nínive, los reyes asirios (como Senaquerib y Asurbanipal) sembraron el terror militar cometiendo empalamientos y mutilaciones para disuadir rebeliones en las provincias conquistadas."
    },
    {
      id: "huni_t02_s01_c08",
      question: "El rey asirio Asurbanipal legó a la historia de la cultura universal la mayor recopilación de tablillas de barro de la Antigüedad al fundar en su capital:",
      options: [
        "El Museo de Alejandría",
        "La Biblioteca Real de Nínive",
        "La Academia de Atenas",
        "La Casa de la Sabiduría de Bagdad"
      ],
      correctIndex: 1,
      explanation: "Asurbanipal envió emisarios por todo el imperio para copiar y confiscar miles de textos científicos, médicos, religiosos y épicos (incluida la versión más completa del Poema de Gilgamesh), preservándolos en su fastuoso palacio de Nínive."
    },
    {
      id: "huni_t02_s01_c09",
      question: "Durante el Segundo Imperio Babilónico (o Neobabilónico), el monarca Nabucodonosor II alcanzó fama histórica por:",
      options: [
        "Firmar la paz perpetua con el Imperio romano.",
        "Conquistar el reino de Judá, destruir el Templo de Salomón en Jerusalén e iniciar el «Cautiverio de Babilonia», además de mandar construir los Jardines Colgantes y la Puerta de Ishtar.",
        "Abolir el culto al dios Marduk.",
        "Trasladar la capital mesopotámica a Persépolis."
      ],
      correctIndex: 1,
      explanation: "Nabucodonosor II reedificó Babilonia con un esplendor colosal: erigió una de las siete maravillas del mundo antiguo (los Jardines Colgantes) para su esposa Amitis y sometió a Judea en el 587 a.C. desterrando a la nobleza judía a Babilonia."
    },
    {
      id: "huni_t02_s01_c10",
      question: "En el 539 a.C., la civilización babilónica llegó a su ocaso definitivo tras ser conquistada por el rey persa:",
      options: [
        "Darío I el Grande",
        "Ciro II el Grande",
        "Jerjes I",
        "Alejandro Magno"
      ],
      correctIndex: 1,
      explanation: "Ciro el Grande desvió las aguas del Éufrates y tomó Babilonia sin resistencia armada, emitiendo el célebre Cilindro de Ciro donde proclamó la libertad de cultos y autorizó a los judíos exiliados a retornar a Jerusalén para reconstruir su templo."
    }
  ],

  huni_t02_s02: [
    {
      id: "huni_t02_s02_c01",
      question: "La célebre sentencia del historiador griego Heródoto que definió a Egipto como «un don del Nilo» fundamenta su veracidad geográfica en que:",
      options: [
        "El Nilo es el único río del mundo que nace en los montes Urales.",
        "Sin las periódicas crecidas estivales del río y el depósito del limo fértil negro (kemet) en sus riberas, la civilización egipcia no habría podido subsistir en medio del desierto del Sahara.",
        "Los egipcios utilizaban el agua del río exclusivamente para navegar hacia Europa.",
        "El río contenía yacimientos inagotables de mineral de hierro fundido."
      ],
      correctIndex: 1,
      explanation: "El régimen pluvial monzónico de las fuentes del Nilo en África oriental provocaba la crecida anual (julio a octubre) inundando las tierras secas y depositando el limo fértil orgánico que posibilitaba abundantes cosechas de trigo y lino."
    },
    {
      id: "huni_t02_s02_c02",
      question: "La unificación política primigenia del Alto Egipto (corona blanca) y del Bajo Egipto (corona roja) hacia el 3 100 a.C. fue realizada por el primer faraón de la dinastía I:",
      options: [
        "Zoser",
        "Menes (o Narmer)",
        "Keops",
        "Akenatón"
      ],
      correctIndex: 1,
      explanation: "La famosa Paleta de Narmer ilustra al rey Narmer-Menes castigando a sus enemigos y ciñendo la doble corona unificada (pschent), fundando la primera dinastía y estableciendo la capital en Menfis."
    },
    {
      id: "huni_t02_s02_c03",
      question: "Durante el Imperio Antiguo o Menfita (dinastía IV), se construyeron en la llanura de Guiza los monumentos funerarios más grandiosos de la humanidad consistentes en:",
      options: [
        "Los hipogeos del Valle de los Reyes.",
        "Las tres grandes pirámides clásicas de los faraones Keops, Kefrén y Micerino.",
        "Los templos rupestres colosales de Abu Simbel.",
        "La biblioteca y el faro de Alejandría."
      ],
      correctIndex: 1,
      explanation: "Las pirámides de Guiza representaron la cumbre de la arquitectura monumental funeraria: la Gran Pirámide de Keops (erigida con más de 2 millones de bloques de piedra caliza) albergaba la cámara sepulcral del faraón deificado."
    },
    {
      id: "huni_t02_s02_c04",
      question: "El primer arquitecto de la historia registrado por su nombre, quien diseñó para el faraón Zoser la Pirámide Escalonada de Saqqara (dinastía III), fue el sabio y médico:",
      options: [
        "Hermes Trismegisto",
        "Imhotep",
        "Manetón",
        "Champollion"
      ],
      correctIndex: 1,
      explanation: "Imhotep concibió la idea revolucionaria de superponer mastabas tradicionales de tamaño decreciente para crear la pirámide escalonada de Saqqara, siendo divinizado siglos después por los egipcios como dios de la medicina y la sabiduría."
    },
    {
      id: "huni_t02_s02_c05",
      question: "La crisis del Segundo Periodo Intermedio en Egipto estuvo marcada por la traumática invasión de un pueblo guerrero semita procedente de Canaán que dominó el Bajo Egipto e introdujo el caballo, el carro de guerra y el arco compuesto, conocidos como:",
      options: [
        "Los pueblos del mar",
        "Los Hicsos («reyes pastores»)",
        "Los dorios",
        "Los etruscos"
      ],
      correctIndex: 1,
      explanation: "Los hicsos establecieron su capital en Avaris y gobernaron durante más de un siglo gracias a su superioridad bélica móvil, hasta que los príncipes tebanos Kamosis y Amosis I los expulsaron fundando el glorioso Imperio Nuevo."
    },
    {
      id: "huni_t02_s02_c06",
      question: "El faraón guerrero de la dinastía XVIII apodado el «Napoleón del Antiguo Egipto» debido a que encabezó diecisiete exitosas campañas militares conquistando Siria, Fenicia y Palestina hasta el río Éufrates fue:",
      options: [
        "Ramsés II",
        "Tutmosis III",
        "Tutankamón",
        "Seti I"
      ],
      correctIndex: 1,
      explanation: "Tutmosis III expandió las fronteras egipcias a su cenit territorial absoluto: venció en la batalla de Megido y sometió a tributo a los reyes del Próximo Oriente, consolidando el dominio imperial del Imperio Nuevo."
    },
    {
      id: "huni_t02_s02_c07",
      question: "La 'Reforma Amarniana' impulsada por el faraón Amenofis IV (Akenatón) durante el Imperio Nuevo consistió radicalmente en:",
      options: [
        "La abolición del cargo de faraón para instaurar una república sacerdotal.",
        "La imposición del culto monoteísta exclusivo al disco solar Atón, confiscando las inmensas riquezas y poder político de los sacerdotes del dios Amón en Tebas y trasladando la capital a Ajetatón (Tell el-Amarna).",
        "La prohibición de la momificación de los muertos.",
        "La rendición incondicional ante el rey de los hititas."
      ],
      correctIndex: 1,
      explanation: "Para frenar la desmedida influencia política del clero de Amón, Akenatón y su esposa Nefertiti instauraron la primera religión monoteísta o henoteísta estatal adorando a Atón, reforma que fue desmantelada tras su muerte por su sucesor Tutankamón."
    },
    {
      id: "huni_t02_s02_c08",
      question: "El descubrimiento de la tumba intacta del joven faraón Tutankamón en 1922 en el Valle de los Reyes, realizado por el arqueólogo británico Howard Carter, causó sensación mundial debido a:",
      options: [
        "La confirmación de que los egipcios conocían la energía nuclear.",
        "El hallazgo intacto del ajuar funerario de oro puro más fastuoso y completo jamás recuperado, incluyendo su máscara fúnebre de oro macizo con lapislázuli y su sarcófago real.",
        "Haber encontrado la biblioteca secreta de Cleopatra.",
        "Contener la fórmula de la inmortalidad biológica."
      ],
      correctIndex: 1,
      explanation: "La tumba KV62 de Tutankamón milagrosamente escapó al saqueo sistemático de los ladrones de tumbas antiguos, revelando miles de tesoros artísticos deslumbrantes que ilustraron la fastuosidad de la corte imperial tebana."
    },
    {
      id: "huni_t02_s02_c09",
      question: "En la religión y escatología egipcia, el ritual trascendental en el que el dios Anubis pesaba el corazón del difunto en una balanza frente a la pluma de la verdad y la justicia (Maat) ante el tribunal divino se denominaba:",
      options: [
        "Embalsamamiento",
        "Psicostasis (o Juicio de Osiris)",
        "Apertura de la boca",
        "Transmigración de almas"
      ],
      correctIndex: 1,
      explanation: "En la psicostasis, si el corazón pesaba menos o igual que la pluma de Maat, el difunto era declarado «justo de voz» y entraba a los campos de Aaru (el paraíso); si era más pesado por sus pecados, era devorado por el monstruo Ammyt."
    },
    {
      id: "huni_t02_s02_c10",
      question: "La piedra de basalto negro descubierta en 1799 por soldados franceses que permitió al lingüista Jean-François Champollion descifrar la escritura jeroglífica egipcia en 1822 fue:",
      options: [
        "La Estela de Tel Amarna",
        "La Piedra de Rosetta",
        "El Papiro Ebers",
        "La Estela de Israel"
      ],
      correctIndex: 1,
      explanation: "La Piedra de Rosetta contenía un mismo decreto sacerdotal de Ptolomeo V redactado en tres escrituras distintas: jeroglífica egipcia, demótica popular y griego antiguo, lo que permitió a Champollion comparar los nombres reales y descifrar el alfabeto jeroglífico."
    }
  ],

  // Semana 03
  huni_t03_s01: [
    {
      id: "huni_t03_s01_c01",
      question: "La civilización cretense o minoica (florecida en la isla de Creta durante el III y II milenio a.C.) desarrolló una economía y poderío naval sobre el mar Egeo que los historiadores denominan:",
      options: [
        "Autarquía continental cerrada",
        "Talasocracia",
        "Feudalismo señorial marítimo",
        "Protectorado colonial persa"
      ],
      correctIndex: 1,
      explanation: "La talasocracia minoica (del griego thalassa, mar, y kratos, poder) consistió en el control y pacificación comercial de las rutas marítimas del Mediterráneo oriental desde el fastuoso palacio laberíntico de Cnosos gobernado por el rey Minos."
    },
    {
      id: "huni_t03_s01_c02",
      question: "En la organización sociopolítica de la polis de Esparta, las leyes fundamentales y el régimen militarista implacable fueron atribuidos tradicionalmente al legislador mítico:",
      options: [
        "Solón",
        "Licurgo",
        "Dracón",
        "Clístenes"
      ],
      correctIndex: 1,
      explanation: "Licurgo redactó la 'Gran Retra', constitución espartana que instauró la diarquía (dos reyes), la gerusía (consejo de ancianos), los éforos (fiscalizadores del Estado) y el sistema educativo estatal obligatorio y militarizado (agogé)."
    },
    {
      id: "huni_t03_s01_c03",
      question: "En la estructura social espartana, la población autóctona sometida despojada de libertad que pertenecía al Estado, carecía de derechos políticos y cultivaba las tierras de los espartiatas en régimen de servidumbre forzosa eran los:",
      options: [
        "Periecos",
        "Ilotas",
        "Metecos",
        "Homoioi"
      ],
      correctIndex: 1,
      explanation: "Los ilotas eran siervos comunitarios del Estado espartano obligados a entregar la mitad de sus cosechas a los guerreros espartanos (homoioi); para mantenerlos intimidados, los jóvenes guerreros practicaban cacerías rituales nocturnas de ilotas (las cripteias)."
    },
    {
      id: "huni_t03_s01_c04",
      question: "En el proceso evolutivo de las instituciones políticas de Atenas, el legislador Clístenes (508 a.C.) es considerado el 'Padre de la Democracia' porque:",
      options: [
        "Restableció la monarquía hereditaria y la esclavitud por deudas.",
        "Dividió a los ciudadanos en 10 tribus territoriales igualitarias rompiendo los privilegios aristocráticos de sangre, e instauró el ostracismo para desterrar a posibles tiranos.",
        "Suprimió el ejército y la marina de guerra.",
        "Permitió el voto de las mujeres y de los esclavos en el tribunal de la Heliea."
      ],
      correctIndex: 1,
      explanation: "Clístenes reorganizó el Ática mezclando ciudadanos de la costa, el llano y la montaña en diez tribus que elegían a 50 miembros cada una para la Bulé (Consejo de los 500) y creó el ostracismo (votación en pedazos de cerámica u óstrakon) para expulsar por diez años a ciudadanos peligrosos para la democracia."
    },
    {
      id: "huni_t03_s01_c05",
      question: "El periodo de máximo florecimiento político, artístico y cultural de la democracia ateniense en el siglo V a.C., caracterizado por la retribución económica a los ciudadanos por ejercer cargos públicos (mistoforia) y la construcción del Partenón, se conoce como:",
      options: [
        "La Tiranía de Pisístrato",
        "El Siglo de Pericles",
        "La Época Helenística",
        "El Arcontado de Solón"
      ],
      correctIndex: 1,
      explanation: "Bajo el liderazgo del estratega Pericles, Atenas consolidó la democracia directa: se pagó una dieta pública a los ciudadanos pobres para que pudieran asistir a la Asamblea del Pueblo (Ekklesía) y al tribunal popular, transformando la Acrópolis en la joya de la Hélade con obras de Fidias."
    },
    {
      id: "huni_t03_s01_c06",
      question: "En la Primera Guerra Médica (490 a.C.), el ejército hoplita ateniense comandado por Milcíades infligió una histórica y aplastante derrota a las fuerzas del rey persa Darío I en la llanura costera de:",
      options: [
        "Termópilas",
        "Maratón",
        "Salamina",
        "Plateas"
      ],
      correctIndex: 1,
      explanation: "En Maratón, la falange ateniense cargó a la carrera contra el ejército expedicionario persa venciéndolo decisivamente; el soldado Filípides corrió 42 kilómetros hasta Atenas para anunciar la victoria antes de caer muerto de agotamiento."
    },
    {
      id: "huni_t03_s01_c07",
      question: "En la Segunda Guerra Médica (480 a.C.), la batalla naval decisiva donde la flota de trirremes atenienses ideada por Temístocles destruyó a la armada del emperador persa Jerjes I tuvo lugar en el estrecho de:",
      options: [
        "El Helesponto",
        "Salamina",
        "Mícale",
        "Queronea"
      ],
      correctIndex: 1,
      explanation: "Tras el heroico sacrificio del rey espartano Leónidas y sus 300 guerreros en las Termópilas, Temístocles atrajo a los pesados barcos persas al estrecho canal de Salamina, donde los ágiles trirremes griegos los embistieron y hundieron."
    },
    {
      id: "huni_t03_s01_c08",
      question: "La Guerra del Peloponeso (431 - 404 a.C.), narrada magistralmente por el historiador Tucídides, fue un cruento conflicto bélico fratricida que enfrentó a:",
      options: [
        "Las ciudades griegas unidas contra el Imperio Cartaginés.",
        "La Liga de Delos (encabezada por Atenas imperialista y democrática) contra la Liga del Peloponeso (liderada por Esparta oligárquica y terrestre).",
        "Macedonia contra las tribus tracias del norte.",
        "Tebas contra los piratas ilirios del Adriático."
      ],
      correctIndex: 1,
      explanation: "El recelo y temor de Esparta ante el desmedido crecimiento del poderío marítimo e imperial de Atenas desató la guerra civil griega, concluyendo con la rendición incondicional de Atenas en el 404 a.C. y el inicio de la breve hegemonía espartana."
    },
    {
      id: "huni_t03_s01_c09",
      question: "El rey de Macedonia que modernizó la falange macedonia con largas picas (sarissas) y sometió militarmente a todas las polis griegas en la batalla de Queronea (338 a.C.) fue:",
      options: [
        "Alejandro Magno",
        "Filipo II de Macedonia",
        "Antígono",
        "Seleuco"
      ],
      correctIndex: 1,
      explanation: "Filipo II unificó a la Hélade bajo la hegemonía macedonia creando la Liga de Corinto con el objetivo de emprender la invasión panhelénica contra el Imperio Persa, proyecto que ejecutó su genial hijo Alejandro Magno."
    },
    {
      id: "huni_t03_s01_c10",
      question: "La cultura helenística surgida tras las fulgurantes conquistas de Alejandro Magno desde Egipto hasta la India se caracterizó esencialmente por:",
      options: [
        "El aislamiento dogmático de la filosofía clásica de Platón.",
        "La fructífera fusión sincrética de la civilización y lengua griega (koiné) con las tradiciones, ciencias y religiones del Próximo Oriente milenario.",
        "La destrucción de todas las academias y museos científicos.",
        "La prohibición absoluta de los matrimonios mixtos."
      ],
      correctIndex: 1,
      explanation: "El helenismo universalizó la cultura helénica en grandes metrópolis cosmopolitas como Alejandría de Egipto (con sabios como Euclides, Arquímedes y Eratóstenes), amalgamando el racionalismo griego con la mística y saber oriental."
    }
  ],

  huni_t03_s02: [
    {
      id: "huni_t03_s02_c01",
      question: "En la República Romana (509 - 27 a.C.), el órgano político colegiado más poderoso que representaba a la aristocracia patricia, controlaba la política exterior, el tesoro público y asesoraba a los magistrados era:",
      options: [
        "Los Comicios Centuriados",
        "El Senado romano (Senatus)",
        "El Tribunal del Pueblo",
        "El Colegio de los Augures"
      ],
      correctIndex: 1,
      explanation: "El Senado (integrado inicialmente por 300 patricios vitalicios y exmagistrados) fue el eje rector y permanente de la política romana, emitiendo decretos (senadoconsultos) y dirigiendo las guerras y finanzas del Estado."
    },
    {
      id: "huni_t03_s02_c02",
      question: "La magistratura romana extraordinaria creada tras la retirada plebeya al Monte Sacro (494 a.C.) para proteger a los plebeyos contra los abusos y vejaciones de los patricios, dotada de la inviolabilidad personal (sacrosantidad) y el derecho de veto (ius intercedendi), fue el:",
      options: [
        "Censor",
        "Tribuno de la Plebe",
        "Cuestor",
        "Pretor urbano"
      ],
      correctIndex: 1,
      explanation: "Los tribunos de la plebe podían anular las resoluciones de los cónsules y del senado pronunciando la palabra 'Veto' («me opongo»), y cualquier persona que los agrediera físicamente era declarada homo sacer y podía ser ejecutada legalmente."
    },
    {
      id: "huni_t03_s02_c03",
      question: "El primer código legal escrito de la historia romana, redactado por una comisión de diez decenviros y expuesto en el Foro en el 450 a.C. para garantizar la igualdad jurídica frente a las costumbres orales patricias, fue:",
      options: [
        "El Corpus Iuris Civilis",
        "La Ley de las XII Tablas",
        "La Ley Canuleya",
        "La Ley Hortensia"
      ],
      correctIndex: 1,
      explanation: "La Ley de las XII Tablas consagró por escrito normas civiles, procesales y penales para patricios y plebeyos, constituyendo la fuente originaria y manantial de todo el Derecho Romano público y privado."
    },
    {
      id: "huni_t03_s02_c04",
      question: "Las Guerras Púnicas (264 - 146 a.C.) enfrentaron a la República Romana contra la rica potencia marítima de Cartago por el control absoluto del mar Mediterráneo occidental, culminando militarmente en la Segunda Guerra Púnica con la victoria de Escipión el Africano sobre Aníbal Barca en la batalla de:",
      options: [
        "Cannas",
        "Zama (202 a.C.)",
        "Trasimeno",
        "Farsalia"
      ],
      correctIndex: 1,
      explanation: "Tras las catastróficas derrotas romanas en Cannas infligidas por el genio táctico de Aníbal, Publio Cornelio Escipión trasladó la guerra al norte de África y venció decisivamente a las tropas cartaginesas en la batalla de Zama."
    },
    {
      id: "huni_t03_s02_c05",
      question: "En el siglo II a.C., los hermanos tribunos de la plebe Tiberio y Cayo Graco intentaron frenar la ruina del campesinado itálico y la voracidad de los latifundistas promoviendo una reforma social radical basada en:",
      options: [
        "La supresión total de los impuestos aduaneros.",
        "Una Ley Agraria para limitar la concentración del ager publicus y redistribuir parcelas de tierra fértil a los ciudadanos desposeídos, además de una Ley Frumentaria para subsidiar el grano.",
        "La concesión del voto a los esclavos mineros de Sicilia.",
        "El traslado de la capital a Siracusa."
      ],
      correctIndex: 1,
      explanation: "Los Graco intentaron rescatar al ciudadano-soldado romano de la miseria urbana obligando al senado aristocrático a ceder tierras públicas; la oligarquía senatorial respondió asesinando violentamente a Tiberio en el Capitolio y empujando a Cayo al suicidio."
    },
    {
      id: "huni_t03_s02_c06",
      question: "En el 60 a.C., tres poderosos líderes romanos sellaron un pacto secreto de ayuda mutua para sortear la oposición del senado y repartirse el control político de la República, conocido como el Primer Triunvirato, integrado por:",
      options: [
        "Octavio, Marco Antonio y Lépido",
        "Julio César, Pompeyo Magno y Marco Licinio Craso",
        "Mario, Sila y Cicerón",
        "Rómulo, Remo y Numa Pompilio"
      ],
      correctIndex: 1,
      explanation: "Julio César aportó el genio político y apoyo popular, Craso su inmensa fortuna financiera y Pompeyo el respaldo de sus legiones veteranas, hegemonizando el poder republicano en crisis."
    },
    {
      id: "huni_t03_s02_c07",
      question: "Julio César consolidó su poder personal supremo tras conquistar las Galias y cruzar el río Rubicón en el 49 a.C. desafiando al Senado bajo la célebre frase «Alea iacta est» («La suerte está echada»), siendo finalmente asesinado en los Idus de Marzo del 44 a.C. debido a que:",
      options: [
        "Quiso vender Roma al rey de los partos.",
        "Un grupo de senadores conspiradores liderados por Bruto y Casio temieron que instaurara una monarquía autocrática y destruyera definitivamente la República tras ser nombrado dictador perpetuo.",
        "Perdió la guerra civil frente a Pompeyo en Grecia.",
        "Fue envenenado por emisarios de Cleopatra en Egipto."
      ],
      correctIndex: 1,
      explanation: "En las escalinatas de la Curia de Pompeyo, César fue apuñalado por más de sesenta senadores tradicionalistas que justificaron el magnicidio como un acto patriótico de tiranicidio para restaurar las libertades senatoriales."
    },
    {
      id: "huni_t03_s02_c08",
      question: "En el 27 a.C., Octavio recibió del Senado los títulos de Augustus y Princeps, transformando a Roma en el Imperio Romano e inaugurando dos siglos de estabilidad territorial conocidos como:",
      options: [
        "El Siglo de Hierro",
        "La Pax Romana (o Paz Augusta)",
        "La Anarquía Militar",
        "La Tetrarquía imperial"
      ],
      correctIndex: 1,
      explanation: "Augusto centralizó el poder político, militar y religioso gobernando con prudencia institucional; la Pax Romana floreció asegurando las fronteras, fomentando el comercio, el derecho y el embellecimiento monumental de mármol de Roma."
    },
    {
      id: "huni_t03_s02_c09",
      question: "En el año 313 d.C., el emperador Constantino el Grande transformó la historia religiosa del mundo occidental al promulgar el Edicto de Milán, el cual estipulaba:",
      options: [
        "La crucifixión de todos los obispos cristianos en el Coliseo.",
        "La libertad de cultos en todo el Imperio Romano, cesando formalmente las sangrientas persecuciones imperiales contra los cristianos.",
        "La prohibición de los templos paganos en Grecia.",
        "La creación del tribunal de la Inquisición papal."
      ],
      correctIndex: 1,
      explanation: "El Edicto de Milán concedió a los cristianos plena libertad para practicar su religión y les restituyó sus templos confiscados; décadas más tarde (380 d.C.), el emperador Teodosio promulgó el Edicto de Tesalónica convirtiendo al cristianismo en la religión oficial y obligatoria del Imperio."
    },
    {
      id: "huni_t03_s02_c10",
      question: "En el año 395 d.C., el emperador Teodosio dividió administrativamente el inmenso Imperio Romano entre sus dos hijos con el fin de mejorar su defensa militar, dando origen a:",
      options: [
        "El Reino Franco y el Sacro Imperio Germánico.",
        "El Imperio Romano de Occidente (capital Milán/Rávena, concedido a Honorio) y el Imperio Romano de Oriente o Bizantino (capital Constantinopla, asignado a Arcadio).",
        "El Califato de Córdoba y el Reino de Granada.",
        "La República de Venecia y los Estados Pontificios."
      ],
      correctIndex: 1,
      explanation: "La partición de Teodosio separó dos destinos históricos: Occidente colapsó en el 476 d.C. ante las invasiones bárbaras germánicas, mientras que Oriente (Bizancio) pervivió mil años más hasta la caída de Constantinopla ante los turcos otomanos en 1453."
    }
  ],

  // Semana 04
  huni_t04_s01: [
    {
      id: "huni_t04_s01_c01",
      question: "La caída formal del Imperio Romano de Occidente en el año 476 d.C., hito histórico que marca el fin de la Edad Antigua y el inicio de la Edad Media, se consumó cuando:",
      options: [
        "Atila el Huno incendió la ciudad de Roma.",
        "El caudillo germano de los hérulos, Odoacro, depuso al último y joven emperador romano Rómulo Augústulo.",
        "Los ejércitos árabes conquistaron el sur de Italia.",
        "Carlomagno disolvió el Senado romano en la Navidad."
      ],
      correctIndex: 1,
      explanation: "Odoacro envió las insignias imperiales de Roma a Constantinopla al emperador de Oriente Zenón, asumiendo el título de rey de Italia y sellando la fragmentación de Europa occidental en múltiples reinos germánicos."
    },
    {
      id: "huni_t04_s01_c02",
      question: "El rey de los francos de la dinastía merovingia que se convirtió al catolicismo en el 496 d.C. junto a sus guerreros, ganándose el decisivo respaldo de la Iglesia y de la aristocracia galorromana, fue:",
      options: [
        "Carlos Martel",
        "Clodoveo (Clovis)",
        "Pipino el Breve",
        "Childerico III"
      ],
      correctIndex: 1,
      explanation: "Clodoveo unificó a las tribus francas y al bautizarse en Reims consolidó la alianza histórica del reino de los francos con el papado de Roma, constituyéndose en el bastión católico frente a los otros pueblos bárbaros arrianos."
    },
    {
      id: "huni_t04_s01_c03",
      question: "En la célebre batalla de Poitiers (732 d.C.), el mayordomo de palacio franco que frenó en seco la invasión y avance militar de las huestes musulmanas hacia el corazón de Europa occidental fue:",
      options: [
        "Carlomagno",
        "Carlos Martel («el Martillo»)",
        "Pipino de Heristal",
        "Rolando el paladín"
      ],
      correctIndex: 1,
      explanation: "Carlos Martel lideró a la infantería pesada franca aplastando al ejército musulmán del valí Abd ar-Rahman en Poitiers, salvando a la cristiandad occidental del dominio califal y afianzando el prestigio de su linaje carolingio."
    },
    {
      id: "huni_t04_s01_c04",
      question: "En la Navidad del año 800 en la Basílica de San Pedro en Roma, el papa León III coronó solemnemente a Carlomagno como emperador con el propósito de:",
      options: [
        "Reconocerlo como califa del mundo islámico.",
        "Restaurar la dignidad del Imperio Romano de Occidente bajo la égida de la Iglesia Católica y la espada defensora de los francos.",
        "Obligarlo a renunciar al trono de Aquisgrán.",
        "Nombrarlo gran maestre de la orden de los templarios."
      ],
      correctIndex: 1,
      explanation: "La coronación de Carlomagno simbolizó la 'Renovatio Imperii': la alianza estratégica entre el poder temporal supremo del rey franco y la autoridad espiritual del papado para forjar una Europa cristiana unida frente a Bizancio y el Islam."
    },
    {
      id: "huni_t04_s01_c05",
      question: "Para gobernar y fiscalizar su inmenso imperio, Carlomagno dividió el territorio en condados (provincias interiores), ducados y marcas (zonas fronterizas militarizadas), controladas por inspectores reales enviados de a dos denominados:",
      options: [
        "Inquisidores",
        "Missi Dominici («enviados del Señor»)",
        "Caballeros templarios",
        "Alguaciles mayores"
      ],
      correctIndex: 1,
      explanation: "Los Missi Dominici (un obispo y un conde) viajaban anualmente supervisando a los gobernadores locales, escuchando quejas de los campesinos y asegurando la aplicación de las leyes imperiales (capitulares)."
    },
    {
      id: "huni_t04_s01_c06",
      question: "El Tratado de Verdún firmado en el año 843 d.C. tuvo una trascendencia histórica colosal en la geografía política europea porque:",
      options: [
        "Puso fin a las Cruzadas en Tierra Santa.",
        "Dividió el Imperio Carolingio entre los tres nietos de Carlomagno (Carlos el Calvo recibió Francia occidental, Luis el Germánico Francia oriental o Germania, y Lotario la Lotaringia e Italia), constituyendo el germen de las futuras naciones de Francia y Alemania.",
        "Entregó Constantinopla a los vikingos normandos.",
        "Estableció el voto secreto en las elecciones papales."
      ],
      correctIndex: 1,
      explanation: "El Tratado de Verdún desmembró la unidad política carolingia; debilitados los monarcas ante las nuevas invasiones (vikingos, sarracenos y magiares), el poder central se pulverizó dando nacimiento al régimen feudal descentralizado."
    },
    {
      id: "huni_t04_s01_c07",
      question: "En el año 622 d.C., el profeta Mahoma huyó de la persecución de la oligarquía comerciante de La Meca hacia la ciudad oasis de Yatrib (Medina), acontecimiento histórico fundamental que marca:",
      options: [
        "La culminación de la Guerra Santa.",
        "La Hégira (huida), inicio oficial del calendario musulmán.",
        "La redacción final del Corán en lengua persa.",
        "La fundación de la mezquita de Córdoba."
      ],
      correctIndex: 1,
      explanation: "La Hégira (hijra) marca el año cero de la era islámica, pues en Medina Mahoma no solo actuó como líder religioso, sino como jefe político y militar unificando por vez primera a las tribus nómades de la península Arábiga bajo el Islam."
    },
    {
      id: "huni_t04_s01_c08",
      question: "El libro sagrado del Islam que contiene las revelaciones divinas de Alá transmitidas al profeta Mahoma por medio del arcángel Gabriel es:",
      options: [
        "El Talmud",
        "El Corán (Al-Qur'an)",
        "La Torá",
        "El Avesta"
      ],
      correctIndex: 1,
      explanation: "El Corán (que significa 'recitación') consta de 114 capítulos o suras dictados en prosa rimada en árabe clásico, estableciendo los preceptos de fe, la moral cotidiana y el código jurídico de la civilización musulmana."
    },
    {
      id: "huni_t04_s01_c09",
      question: "Entre los 'Cinco Pilares del Islam' (Arkān al-Islām) obligatorios para todo creyente musulmán sincero, el precepto de la Shahāda consiste en:",
      options: [
        "La peregrinación anual a la ciudad sagrada de Jerusalén.",
        "La profesión de fe solemne: «No hay más dios que Alá y Mahoma es su profeta».",
        "El ayuno durante los meses de primavera.",
        "La entrega de la mitad de las ganancias mercantiles al califa."
      ],
      correctIndex: 1,
      explanation: "Los cinco pilares son: la profesión de fe (Shahāda), la oración cinco veces al día mirando a La Meca (Salat), la limosna ritual a los pobres (Zakat), el ayuno diurno en el mes de Ramadán (Sawm) y la peregrinación a La Meca al menos una vez en la vida (Hajj)."
    },
    {
      id: "huni_t04_s01_c10",
      question: "Durante la dinastía califal de los Omeyas con capital en Damasco (661 - 750 d.C.), el acontecimiento geográfico de mayor impacto en Europa occidental fue:",
      options: [
        "El sitio y toma de las islas británicas.",
        "La invasión y conquista de la península ibérica (Hispania visigoda) en el 711 d.C. tras la batalla de Guadalete, fundando el floreciente Al-Ándalus.",
        "La firma de una alianza comercial con los vikingos de Suecia.",
        "El saqueo de la ciudad de Roma por Saladino."
      ],
      correctIndex: 1,
      explanation: "Las tropas musulmanas del general Táriq cruzaron el estrecho de Gibraltar en el 711, vencieron al último rey visigodo don Rodrigo en Guadalete y en pocos años dominaron casi toda la península, iniciando ocho siglos de presencia islámica en España."
    }
  ],

  huni_t04_s02: [
    {
      id: "huni_t04_s02_c01",
      question: "El régimen feudal que imperó en Europa occidental entre los siglos IX y XIII se caracterizó políticamente por:",
      options: [
        "Una monarquía absolutista centralizada con burocracias ministeriales omnipotentes.",
        "La fragmentación y dispersión del poder político y militar soberano en manos de señores feudales locales atrincherados en sus castillos.",
        "El predominio de asambleas populares democráticas en las aldeas.",
        "La dirección del gobierno secular a cargo de banqueros italianos."
      ],
      correctIndex: 1,
      explanation: "Ante la impotencia de los reyes para defender a la población frente a las invasiones bárbaras normandas, eslavas y magiares, los señores feudales (duques, condes, barones) asumieron la justicia, la milicia y el cobro de tributos de forma autónoma en sus dominios feudales."
    },
    {
      id: "huni_t04_s02_c02",
      question: "La relación feudo-vasallática era un contrato solemne voluntario y recíproco celebrado exclusivamente entre dos hombres libres de la nobleza mediante la ceremonia del homenaje e investidura, donde:",
      options: [
        "El siervo compraba su carta de libertad mediante una suma de oro.",
        "El vasallo juraba fidelidad, consejo y auxilio militar a su señor, y este le otorgaba protección armada y el usufructo de un beneficio económico (habitualmente un feudo o tierra).",
        "El rey nombraba jueces plebeyos en los tribunales reales.",
        "El vasallo entregaba a sus hijos como rehenes al castillo del obispo."
      ],
      correctIndex: 1,
      explanation: "En la ceremonia del homenaje (inmixtio manuum y osculum) el noble se arrodillaba y ponía sus manos en las de su señor jurando auxilium et consilium; la investidura culminaba cuando el señor le entregaba un símbolo material (un cetro, báculo o puñado de tierra) que representaba el feudo concedido."
    },
    {
      id: "huni_t04_s02_c03",
      question: "En la economía autárquica y cerrada del señorío feudal, la explotación agraria de la tierra se dividía fundamentalmente en dos partes denominadas:",
      options: [
        "Camellones y terrazas aluviales",
        "La reserva señorial (tierras cultivadas directamente para el señor) y los mansos (parcelas entregadas a los campesinos siervos para su subsistencia a cambio de tributos y trabajo forzado o corvea).",
        "Ager publicus y latifundios esclavistas",
        "Ejidos municipales y huertos botánicos"
      ],
      correctIndex: 1,
      explanation: "La reserva señorial incluía los mejores terrenos, el bosque y el castillo explotados mediante la corvea de los siervos; los mansos eran las tierras familiares que el señor cedía a los campesinos a cambio del pago de censos en especie y el uso obligatorio del molino y horno señorial (banalidades)."
    },
    {
      id: "huni_t04_s02_c04",
      question: "El llamamiento sagrado que desencadenó el inicio de las Cruzadas fue proclamado en 1095 por el papa Urbano II durante el Concilio de:",
      options: [
        "Trento",
        "Clermont (Francia)",
        "Nicea",
        "Letrán"
      ],
      correctIndex: 1,
      explanation: "Urbano II pronunció un encendido sermón en Clermont exhortando a los príncipes y caballeros cristianos a cesar sus guerras fratricidas y marchar a Oriente bajo el lema «Deus vult» («¡Dios lo quiere!») para rescatar los Santos Lugares del dominio turco selyúcida y auxiliar al Imperio Bizantino."
    },
    {
      id: "huni_t04_s02_c05",
      question: "La Primera Cruzada señorial o de los Caballeros (1096 - 1099), liderada por Godofredo de Bouillón, Raimundo de Tolosa y Bohemundo de Tarento, fue la única que logró el objetivo militar originario al:",
      options: [
        "Firmar un tratado de comercio pacífico con los mamelucos en El Cairo.",
        "Conquistar por asalto la ciudad santa de Jerusalén en 1099, masacrar a la guarnición defensora y fundar el Reino Latino de Jerusalén.",
        "Destruir la mezquita de La Meca.",
        "Expulsar a los moros de la península ibérica."
      ],
      correctIndex: 1,
      explanation: "Tras cruzar Asia Menor y tomar Antioquía, los caballeros asaltaron las murallas de Jerusalén en julio de 1099, coronando a Godofredo de Bouillón como 'Defensor del Santo Sepulcro' e implantando señoríos feudales europeos en pleno Próximo Oriente."
    },
    {
      id: "huni_t04_s02_c06",
      question: "La Tercera Cruzada (1189 - 1192), conocida como la 'Cruzada de los Reyes' (Ricardo Corazón de León de Inglaterra, Felipe Augusto de Francia y Federico Barbarroja de Alemania), fue convocada debido a que:",
      options: [
        "Los piratas sarracenos saquearon Marsella.",
        "El sultán Saladino (Salah al-Din) aplastó a los cruzados en la batalla de Hattin (1187) y recuperó Jerusalén para el Islam.",
        "El rey de Bizancio se convirtió al luteranismo.",
        "El papa fue secuestrado por los caballeros teutónicos."
      ],
      correctIndex: 1,
      explanation: "Saladino unificó Egipto y Siria, aniquiló al ejército cristiano en los Cuernos de Hattin y tomó pacíficamente Jerusalén, motivando la partida de los monarcas más poderosos de Europa; la expedición culminó con un pacto entre Ricardo y Saladino que garantizaba el acceso libre de peregrinos desarmados a Jerusalén."
    },
    {
      id: "huni_t04_s02_c07",
      question: "La insólita Cuarta Cruzada (1202 - 1204), desvirtuada completamente por los intereses comerciales de la República de Venecia y del dux Enrico Dandolo, culminó con:",
      options: [
        "El desembarco masivo en Alejandría y la liberación de los esclavos cristianos.",
        "El brutal asalto y saqueo de la ciudad cristiana de Constantinopla y la creación del efímero Imperio Latino de Constantinopla.",
        "La conquista de las islas Baleares.",
        "La conversión forzosa de los cruzados al rito copto."
      ],
      correctIndex: 1,
      explanation: "En lugar de combatir a los musulmanes en Tierra Santa, los cruzados fueron manipulados por los venecianos para atacar a su rival comercial cristiano: tomaron Constantinopla en 1204, saquearon sus reliquias y tesoros e instalaron gobernantes francos, quebrando mortalmente a Bizancio."
    },
    {
      id: "huni_t04_s02_c08",
      question: "Entre las órdenes militares religiosas fundadas en el contexto de las Cruzadas para custodiar a los peregrinos y combatir a los infieles destacaron:",
      options: [
        "Los Jesuitas y los Franciscanos",
        "Los Caballeros Templarios (del Temple), los Hospitalarios de San Juan y los Caballeros Teutónicos",
        "Los Dominicos y los Agustinos",
        "Los Escolapios y los Cistercienses"
      ],
      correctIndex: 1,
      explanation: "Los monjes-soldados combinaban la vida de oración y voto monástico con el adiestramiento militar implacable; los Templarios acumularon colosales riquezas y fortalezas financieras que despertaron la codicia del rey Felipe IV el Hermoso de Francia."
    },
    {
      id: "huni_t04_s02_c09",
      question: "Una de las consecuencias socioeconómicas más profundas y duraderas que provocaron las Cruzadas en Europa occidental fue:",
      options: [
        "La desaparición absoluta de la moneda de oro y plata en el comercio.",
        "El renacimiento del comercio a larga distancia en el Mediterráneo, el florecimiento de las ciudades mercantiles italianas (Venecia, Génova) y el paulatino debilitamiento del poder de la nobleza feudal a favor de los reyes.",
        "El triunfo definitivo de la Iglesia Ortodoxa sobre Roma.",
        "La sustitución del cultivo del trigo por la cría exclusiva de gusanos de seda en Alemania."
      ],
      correctIndex: 1,
      explanation: "Las Cruzadas abrieron los puertos de Oriente al comercio de especias, sedas y perfumes; el enriquecimiento de la naciente burguesía urbana y la muerte o ruina de cientos de señores feudales permitieron a las monarquías centralizar el poder político."
    },
    {
      id: "huni_t04_s02_c10",
      question: "La terrible epidemia biológica que asoló a Europa entre 1347 y 1353, transportada por pulgas de ratas negras en galeras mercantes genovesas provenientes de Crimea, que exterminó a un tercio de la población europea, fue:",
      options: [
        "La viruela aviar",
        "La Peste Negra (peste bubónica)",
        "El cólera asiático",
        "La gripe española"
      ],
      correctIndex: 1,
      explanation: "Causada por la bacteria Yersinia pestis, la Peste Negra diezmó a Europa acabando con cerca de 25 millones de vidas humanas, desatando histeria religiosa (flagelantes), escasez severa de mano de obra y acelerando la decadencia final de la servidumbre feudal."
    }
  ],

  // Semana 05
  huni_t05_s01: [
    {
      id: "huni_t05_s01_c01",
      question: "El Humanismo, movimiento intelectual y filosófico nacido en las ricas ciudades italianas en el siglo XIV, se caracterizó primordialmente por:",
      options: [
        "La sumisión absoluta del pensamiento a la teología escolástica medieval.",
        "El antropocentrismo: la exaltación de la dignidad, la razón y el libre albedrío del ser humano a través del estudio y rescate filológico de los autores clásicos grecolatinos.",
        "El rechazo frontal a la lengua vernácula y el aprendizaje del quechua.",
        "La glorificación del feudalismo agrario frente a la vida urbana."
      ],
      correctIndex: 1,
      explanation: "Frente al teocentrismo medieval que consideraba al hombre una criatura pecadora y miserable, el Humanismo colocó al ser humano en el centro del cosmos («el hombre es la medida de todas las cosas»), valorando las bellas letras y las ciencias profanas clásicas."
    },
    {
      id: "huni_t05_s01_c02",
      question: "El ilustre poeta y filólogo florentino Francesco Petrarca es reconocido unánimemente en la historia de la cultura europea como:",
      options: [
        "El inventor de la imprenta de tipos móviles metálicos.",
        "El «Padre del Humanismo», por su labor en la búsqueda y rescate de manuscritos de Cicerón y su lírica humanista en el Cancionero.",
        "El fundador de la orden de los jesuitas.",
        "El autor de la primera constitución democrática europea."
      ],
      correctIndex: 1,
      explanation: "Petrarca fue el primer erudito en buscar apasionadamente códices clásicos olvidados en los monasterios europeos y en proclamar que la sabiduría pagana antigua de Roma no se oponía a la virtud moral cristiana, sino que la perfeccionaba."
    },
    {
      id: "huni_t05_s01_c03",
      question: "La obra maestra de Erasmo de Rotterdam, Elogio de la locura (Moriae Encomium, 1511), dedicada a su amigo Tomás Moro, destacó por:",
      options: [
        "Defender la autoridad militar de los condottieros venecianos.",
        "Satirizar con aguda ironía el fanatismo, la hipocresía social, la ignorancia escolástica y la corrupción moral y mundana de los jerarcas de la Iglesia católica.",
        "Demostrar que la Tierra era el centro inmóvil del universo.",
        "Instaurar la venta obligatoria de indulgencias papales."
      ],
      correctIndex: 1,
      explanation: "Erasmo, llamado «el Príncipe de los Humanistas», utilizó a la personificación de la Locura o Estulticia para fustigar las supersticiones populares y la decadencia del clero y los teólogos, propugnando un cristianismo evangélico íntimo y tolerante."
    },
    {
      id: "huni_t05_s01_c04",
      question: "En el tratado político El Príncipe (1513), el florentino Nicolás Maquiavelo fundó la ciencia política moderna al postular que:",
      options: [
        "Los gobernantes deben someter sus leyes estrictamente a las encíclicas papales.",
        "La política posee una autonomía moral propia desligada de la religión y la ética tradicional, debiendo el gobernante conjugar la fuerza del león con la astucia del zorro para mantener el poder del Estado.",
        "El mejor gobierno es la anarquía agraria sin ejército.",
        "Los reyes deben gobernar por mandato biológico inalterable."
      ],
      correctIndex: 1,
      explanation: "Maquiavelo analizó la verdad efectiva de las cosas (la «verità effettuale») y no cómo los hombres deberían ser idealmente; concluyó que para preservar la estabilidad de la patria, el príncipe debe saber usar el mal si la necesidad suprema del Estado lo exige («el fin justifica los medios»)."
    },
    {
      id: "huni_t05_s01_c05",
      question: "La cuna del Renacimiento artístico del Quattrocento (siglo XV) fue la próspera ciudad italiana de Florencia, cuyo florecimiento cultural fue posible gracias al generoso mecenazgo de:",
      options: [
        "La dinastía de los Habsburgo austríacos",
        "La acaudalada familia patricia y banquera de los Médici (como Cosme y Lorenzo el Magnífico)",
        "Los reyes normandos de Sicilia",
        "La Liga Hanseática alemana"
      ],
      correctIndex: 1,
      explanation: "Los banqueros Médici protegieron y financiaron con sus ingentes fortunas a arquitectos, escultores y pintores geniales (Brunelleschi, Donatello, Botticelli, Miguel Ángel), convirtiendo a Florencia en el epicentro del arte renacentista."
    },
    {
      id: "huni_t05_s01_c06",
      question: "La invención técnica decisiva atribuida a Johannes Gutenberg en Maguncia (Alemania) hacia 1440, que revolucionó la difusión de las ideas humanistas y las ciencias, fue:",
      options: [
        "El telescopio refractor de lentes",
        "La imprenta de tipos móviles metálicos",
        "El compás magnético de navegación",
        "El telar mecánico de vapor"
      ],
      correctIndex: 1,
      explanation: "Gutenberg combinó tipos móviles de plomo reutilizables con prensas de vino y tinta oleosa; la primera obra monumental impresa fue la célebre Biblia de 42 líneas (1455), abaratando los libros y multiplicando la circulación del saber humanista."
    },
    {
      id: "huni_t05_s01_c07",
      question: "El arquetipo universal del 'hombre renacentista' (*Homo Universalis*), quien dominó con maestría la pintura (La Gioconda, La Última Cena), la escultura, la anatomía, la hidráulica y la ingeniería militar, fue:",
      options: [
        "Rafael Sanzio",
        "Leonardo da Vinci",
        "Tiziano Vecellio",
        "Sandro Botticelli"
      ],
      correctIndex: 1,
      explanation: "Leonardo encarnó el ideal del Renacimiento: una curiosidad insaciable volcada a comprender experimentalmente las leyes de la naturaleza y del cuerpo humano mediante la observación minuciosa y la creación artística (técnica del sfumato)."
    },
    {
      id: "huni_t05_s01_c08",
      question: "El colosal artista florentino que esculpió el David de mármol de Carrara, la Piedad del Vaticano y pintó los frescos monumentales de la bóveda de la Capilla Sixtina y el Juicio Final fue:",
      options: [
        "Donatello",
        "Miguel Ángel Buonarroti",
        "Tintoretto",
        "Benvenuto Cellini"
      ],
      correctIndex: 1,
      explanation: "Miguel Ángel imprimió a sus esculturas y pinturas una fuerza anatómica y dramática sobrehumana denominada la 'terribilità', plasmando la grandiosidad neoplatónica del hombre frente a la creación divina."
    },
    {
      id: "huni_t05_s01_c09",
      question: "En la pintura renacentista La Escuela de Atenas, conservada en las Estancias Vaticanas, el pintor Rafael Sanzio representó en el centro de la composición conversando dialécticamente a:",
      options: [
        "Cicerón y César",
        "Platón (señalando al cielo de las ideas) y Aristóteles (extendiendo su mano hacia la tierra empírica)",
        "Sócrates y Heródoto",
        "Alejandro Magno y Diógenes el Cínico"
      ],
      correctIndex: 1,
      explanation: "Rafael sintetizó magistralmente toda la filosofía grecolatina en la Stanza della Segnatura: Platón (con los rasgos de Leonardo da Vinci) porta el Timeo y señala al mundo de las ideas ideales, mientras Aristóteles sostiene la Ética y alude a la realidad sensible concreta."
    },
    {
      id: "huni_t05_s01_c10",
      question: "La obra astronómica Sobre las revoluciones de las esferas celestes (1543) del clérigo polaco Nicolás Copérnico provocó un cisma epistemológico radical en el pensamiento científico al postular:",
      options: [
        "Que la Tierra es un disco plano sostenido por elefantes cósmicos.",
        "La teoría heliocéntrica: el Sol se sitúa inmóvil en el centro del sistema y la Tierra y los demás planetas giran en órbitas a su alrededor, desmintiendo el geocentrismo tolemaico.",
        "Que las estrellas son orificios en una bóveda sólida de cristal.",
        "La existencia exclusiva de cuatro planetas en la galaxia."
      ],
      correctIndex: 1,
      explanation: "La revolución copernicana destruyó el geocentrismo de Ptolomeo avalado por la Iglesia durante siglos; más tarde, Galileo Galilei y Johannes Kepler aportaron las pruebas telescópicas y leyes matemáticas que consolidaron la física moderna."
    }
  ],

  huni_t05_s02: [
    {
      id: "huni_t05_s02_c01",
      question: "El acontecimiento histórico que detonó formalmente el estallido de la Reforma Protestante tuvo lugar el 31 de octubre de 1517, cuando el monje agustino Martín Lutero:",
      options: [
        "Tradujo el Corán al idioma alemán en el castillo de Wartburg.",
        "Clavó sus 95 Tesis en la puerta de la iglesia del palacio de Wittenberg (Alemania), denunciando el tráfico corrupto de las indulgencias papales autorizadas por León X.",
        "Encabezó una revuelta campesina armada contra los príncipes alemanes.",
        "Asesinó al cardenal Cayetano en el parlamento de Augsburgo."
      ],
      correctIndex: 1,
      explanation: "Lutero protestó indignado contra la venta de bulas de indulgencia promovidas por el dominico Johann Tetzel para financiar la construcción de la Basílica de San Pedro, sosteniendo que el perdón divino no puede ser comprado con dinero de los fieles."
    },
    {
      id: "huni_t05_s02_c02",
      question: "El principio teológico medular de la doctrina luterana que destruyó la necesidad de la intermediación sacerdotal y el monopolio sacramental de la Iglesia romana es:",
      options: [
        "La salvación por la compra de reliquias sagradas.",
        "La justificación por la sola fe (sola fide) y el libre examen o interpretación personal de las Sagradas Escrituras.",
        "La reencarnación sucesiva de las almas puras.",
        "El celibato obligatorio para todos los campesinos."
      ],
      correctIndex: 1,
      explanation: "Lutero postuló que el hombre es justificado únicamente por su fe interior en Cristo y no por las obras exteriores ni indulgencias, reconociendo como única fuente de verdad a la Biblia (sola Scriptura) y reduciendo los sacramentos solo al Bautismo y la Eucaristía."
    },
    {
      id: "huni_t05_s02_c03",
      question: "En la asamblea imperial de la Dieta de Worms (1521), presidida por el joven emperador Carlos V del Sacro Imperio Romano Germánico, Martín Lutero:",
      options: [
        "Aceptó retractarse humildemente de sus doctrinas teológicas a cambio de una diócesis.",
        "Rechazó retractarse de sus escritos declarando que su conciencia estaba cautiva de la palabra de Dios y que no confiaba ni en papas ni en concilios, siendo declarado hereje y prófugo de la ley.",
        "Firmó el acta de creación de la Iglesia Anglicana.",
        "Fue quemado vivo en la hoguera de la inquisición."
      ],
      correctIndex: 1,
      explanation: "Lutero pronunció su memorable defensa: «Mi conciencia es cautiva de la Palabra de Dios. No puedo ni quiero retractarme de nada, pues ir contra la conciencia no es justo ni seguro. ¡Que Dios me ayude! Amén», tras lo cual fue protegido por el príncipe elector Federico el Sabio de Sajonia."
    },
    {
      id: "huni_t05_s02_c04",
      question: "La doctrina reformadora fundada por el teólogo francés Juan Calvino en la ciudad suiza de Ginebra se distinguió por su extremo rigor moral y su dogma teológico central consistente en:",
      options: [
        "El perdón universal de todos los seres humanos al momento del bautismo.",
        "La doctrina de la doble predestinación divina absoluta: Dios ha determinado desde la eternidad quiénes se salvarán y quiénes serán condenados sin importar sus méritos terrenales.",
        "La adoración a imágenes y pinturas de santos.",
        "La entrega del gobierno eclesiástico al rey de Inglaterra."
      ],
      correctIndex: 1,
      explanation: "Para Calvino, la soberanía de Dios es total e incognoscible: el éxito en el trabajo profesional, la austeridad y la vida piadosa operaban para la burguesía como signos probables de pertenecer al grupo de los «elegidos» por la gracia divina (tesis que Max Weber vinculó al origen del capitalismo)."
    },
    {
      id: "huni_t05_s02_c05",
      question: "La Reforma en Inglaterra adquirió un carácter político y dinástico singular cuando el rey Enrique VIII rompió definitivamente con el papa Clemente VII en 1534 mediante la promulgación de:",
      options: [
        "El Edicto de Nantes",
        "El Acta de Supremacía, que lo proclamó a él y a sus sucesores como única cabeza suprema en la tierra de la Iglesia de Inglaterra (Iglesia Anglicana).",
        "La Paz de Westfalia",
        "La Declaración de Derechos (Bill of Rights)"
      ],
      correctIndex: 1,
      explanation: "Ante la negativa papal de anular su matrimonio legítimo con Catalina de Aragón para casarse con Ana Bolena, Enrique VIII subordinó la Iglesia al poder monárquico con el Acta de Supremacía, confiscando los inmensos monasterios y tierras católicas."
    },
    {
      id: "huni_t05_s02_c06",
      question: "La respuesta institucional y dogmática de la Iglesia Católica para contener el avance del protestantismo se estructuró en el Concilio de Trento (1545 - 1563), donde se reafirmaron principios como:",
      options: [
        "La abolición del latín y del celibato eclesiástico.",
        "La validez inalterable de los siete sacramentos, la autoridad suprema del Papa, el culto a los santos y a la Virgen María, y la versión Vulgata latina de la Biblia como única oficial.",
        "La libre interpretación personal de las Escrituras para todos los fieles.",
        "La eliminación del sacramento del orden sacerdotal."
      ],
      correctIndex: 1,
      explanation: "Trento definió con firmeza la ortodoxia católica frente al luteranismo: defendió la fe junto a las buenas obras para la salvación, estableció seminarios obligatorios para la formación sacerdotal y mantuvo el celibato y la tradición apostólica junto a la Biblia."
    },
    {
      id: "huni_t05_s02_c07",
      question: "La orden religiosa de combate espiritual fundada en 1534 por el militar español Íñigo de Loyola (San Ignacio de Loyola), consagrada con un cuarto voto de obediencia ciega y directa al Sumo Pontífice, fue:",
      options: [
        "La Orden Franciscana Menor",
        "La Compañía de Jesús (los Jesuitas)",
        "Los Caballeros de San Juan de Malta",
        "Los Dominicos Predicadores"
      ],
      correctIndex: 1,
      explanation: "Los jesuitas funcionaron como una disciplinada milicia de Cristo (organizada casi militarmente bajo un Prepósito General), destacando en la fundación de colegios de élite para instruir a la juventud y en heroicas misiones evangelizadoras en América, India y Japón."
    },
    {
      id: "huni_t05_s02_c08",
      question: "El movimiento filosófico, científico y cultural del siglo XVIII denominado 'La Ilustración' (el Siglo de las Luces) tuvo como postulado fundacional supremo:",
      options: [
        "El retorno a la fe mística y el aislamiento en claustros religiosos.",
        "El imperio soberano de la Razón humana como única guía infalible para desterrar la ignorancia, la tiranía y el dogma, alcanzando la libertad y el progreso continuo.",
        "La justificación teológica del absolutismo de derecho divino de los reyes.",
        "La sustitución de la ciencia física por la alquimia medieval."
      ],
      correctIndex: 1,
      explanation: "Pensadores como Immanuel Kant resumieron el espíritu ilustrado en el lema latino «Sapere aude» («¡Atrévete a saber!»), sosteniendo que el ser humano debía alcanzar su mayoría de edad intelectual mediante el uso crítico de la razón libre de tutelas dogmáticas."
    },
    {
      id: "huni_t05_s02_c09",
      question: "En su célebre tratado El espíritu de las leyes (1748), el filósofo ilustrado francés Barón de Montesquieu formuló un principio político fundamental que sustenta las democracias republicanas contemporáneas consistente en:",
      options: [
        "La concentración de todo el poder estatal en la persona del monarca absoluto.",
        "La separación y equilibrio mutuo de los poderes del Estado en tres ramas autónomas: Legislativo, Ejecutivo y Judicial.",
        "La abolición del derecho de propiedad privada.",
        "La subordinación del parlamento civil a los mandatos del ejército."
      ],
      correctIndex: 1,
      explanation: "Montesquieu advirtió que todo hombre con poder tiende a abusar de él: para garantizar la libertad de los ciudadanos, es imprescindible que «el poder frene al poder» dividiendo las funciones en tres órganos independientes que se contrapesen mutuamente."
    },
    {
      id: "huni_t05_s02_c10",
      question: "En El contrato social (1762), Jean-Jacques Rousseau expuso una tesis revolucionaria que sirvió de base a la democracia moderna y a la Revolución Francesa afirmando que:",
      options: [
        "El Estado se fundamenta en la superioridad biológica de los conquistadores.",
        "La soberanía reside inalienable e indivisiblemente en el Pueblo a través de la Voluntad General, y que los gobernantes son meros mandatarios temporales de la comunidad.",
        "El hombre nace naturalmente perverso y debe ser sometido con garrotes por el Estado.",
        "Las leyes solo son válidas si son redactadas por sabios extranjeros."
      ],
      correctIndex: 1,
      explanation: "Rousseau proclamó que «el hombre nace libre, pero en todas partes está encadenado»; postuló el pacto social democrático donde los ciudadanos libres se asocian reconociendo como máxima autoridad a la voluntad general orientada al bien común."
    }
  ],

  // Semana 06
  huni_t06_s01: [
    {
      id: "huni_t06_s01_c01",
      question: "El hecho simbólico e insurreccional popular ocurrido el 14 de julio de 1789 en París, que marcó el derrumbe del absolutismo del Antiguo Régimen y el inicio de la Revolución Francesa, fue:",
      options: [
        "La ejecución en la guillotina de Luis XVI en la Plaza de la Concordia.",
        "La Toma de la fortaleza-prisión de la Bastilla por el pueblo armado parisino.",
        "El Juramento del Juego de la Pelota.",
        "El golpe de Estado del 18 de Brumario de Napoleón."
      ],
      correctIndex: 1,
      explanation: "La Bastilla era el símbolo siniestro de la tiranía feudal borbónica donde se encarcelaba arbitrariamente a los disidentes por cartas secretas del rey; su toma armada por las masas populares enardecidas obligó a Luis XVI a ceder ante la Asamblea Nacional."
    },
    {
      id: "huni_t06_s01_c02",
      question: "El documento fundacional de derecho público universal promulgado por la Asamblea Nacional Constituyente francesa el 26 de agosto de 1789, inspirado en los ideales de la Ilustración, fue:",
      options: [
        "El Código de Hammurabi",
        "La Declaración de los Derechos del Hombre y del Ciudadano",
        "La Carta Magna de Juan sin Tierra",
        "El Tratado de Versalles"
      ],
      correctIndex: 1,
      explanation: "La Declaración proclamó en su artículo primero que «los hombres nacen y permanecen libres e iguales en derechos», consagrando los principios universales de libertad, igualdad ante la ley, propiedad privada, seguridad y soberanía nacional."
    },
    {
      id: "huni_t06_s01_c03",
      question: "Durante la etapa más radical y sanguinaria de la Revolución Francesa, denominada 'El Reinado del Terror' (1793 - 1794), el club político y el líder que gobernaron con la guillotina a través del Comité de Salvación Pública fueron:",
      options: [
        "Los Girondinos moderados liderados por Brissot.",
        "Los Jacobinos montañeses acaudillados por Maximilien de Robespierre («el Incorruptible»).",
        "Los monárquicos fuldenses encabezados por La Fayette.",
        "Los termidorianos de Paul Barras."
      ],
      correctIndex: 1,
      explanation: "Para defender a la república frente a la invasión militar de las monarquías europeas y la rebelión interna de la Vendée, Robespierre instauró una dictadura jacobina implacable que ejecutó a miles de supuestos contrarrevolucionarios (incluidos Danton y la reina María Antonieta) antes de ser él mismo guillotinado en el golpe de Termidor."
    },
    {
      id: "huni_t06_s01_c04",
      question: "El célebre monumento legislativo napoleónico promulgado en 1804 que consolidó las conquistas civiles de la Revolución Francesa (como la igualdad ante la ley, el matrimonio civil y el derecho a la propiedad) fue:",
      options: [
        "El Código Civil Napoleónico",
        "La Constitución del Año VIII",
        "El Edicto de Nantes",
        "La Santa Alianza"
      ],
      correctIndex: 0,
      explanation: "El Código Civil unificó el derecho europeo destruyendo los privilegios feudales y gremiales de casta; Napoleón llegó a declarar en su destierro de Santa Elena que su verdadera gloria no fueron sus cuarenta batallas ganadas, sino su Código Civil que viviría eternamente."
    },
    {
      id: "huni_t06_s01_c05",
      question: "La batalla definitiva librada el 18 de junio de 1815 en Bélgica, donde el emperador Napoleón Bonaparte fue derrotado categóricamente por la coalición aliada comandada por el Duque de Wellington y el prusiano Blücher, fue:",
      options: [
        "Austerlitz",
        "Waterloo",
        "Trafalgar",
        "Leipzig"
      ],
      correctIndex: 1,
      explanation: "Tras su fuga de la isla de Elba y su efímero gobierno de los Cien Días, Napoleón fue vencido en la campiña de Waterloo, tras lo cual fue desterrado por los británicos a la remota isla de Santa Elena en el océano Atlántico sur donde falleció en 1821."
    },
    {
      id: "huni_t06_s01_c06",
      question: "La Primera Revolución Industrial, originada en Inglaterra a mediados del siglo XVIII, tuvo como fuente de energía motriz motora y símbolo tecnológico supremo:",
      options: [
        "La energía atómica y los motores de turbina.",
        "La máquina de vapor perfeccionada por James Watt alimentada por la combustión de carbón mineral (hulla).",
        "La dinamo eléctrica de Faraday.",
        "El motor de combustión interna de gasolina de Benz."
      ],
      correctIndex: 1,
      explanation: "La máquina de vapor transformó el sistema productivo al independizar la fábrica de los ríos o del viento, aplicando la energía mecánica a los telares mecánicos de algodón y a transportes masivos como el ferrocarril de Stephenson y el barco de vapor de Fulton."
    },
    {
      id: "huni_t06_s01_c07",
      question: "¿Cuál fue el sector manufacturero que lideró el despegue inicial fabril mecanizado durante la Primera Revolución Industrial británica?",
      options: [
        "La industria aeroespacial",
        "La industria textil algodonera",
        "La petroquímica plástica",
        "La industria automotriz pesada"
      ],
      correctIndex: 1,
      explanation: "Invenciones como la hiladora Jenny de Hargreaves, la hiladora hidráulica de Arkwright y el telar mecánico de Cartwright dispararon la producción masiva de telas de algodón en ciudades fabriles como Mánchester y Liverpool."
    },
    {
      id: "huni_t06_s01_c08",
      question: "La Segunda Revolución Industrial, desarrollada entre 1870 y 1914 con epicentros en Alemania y Estados Unidos, se caracterizó por la sustitución del carbón y el hierro por:",
      options: [
        "La energía geotérmica y el silicio.",
        "La electricidad, el petróleo y el acero fundido en convertidores Bessemer.",
        "La tracción animal y la madera de roble.",
        "El gas metano y el titanio aeronáutico."
      ],
      correctIndex: 1,
      explanation: "La segunda fase industrializadora introdujo la electrificación masiva (alumbrado de Edison, motores de Tesla), la petroquímica y los motores de combustión de petróleo, permitiendo la producción seriada masiva (fordismo) y los grandes monopolios financieros."
    },
    {
      id: "huni_t06_s01_c09",
      question: "Una consecuencia social crítica e inmediata de la Revolución Industrial fue el surgimiento de dos clases antagónicas en el sistema capitalista denominadas:",
      options: [
        "Patricios y siervos de la gleba",
        "La burguesía industrial (poseedora del capital y los medios de producción) y el proletariado obrero fabril (que solo poseía su fuerza de trabajo vendida por un mísero salario).",
        "Nobles caballeros y esclavos de plantación",
        "Escribas y clérigos regulares"
      ],
      correctIndex: 1,
      explanation: "La fábrica moderna proletarizó a millones de campesinos desposeídos que migraron a barrios obreros hacinados sin derechos laborales, viviendo extenuantes jornadas de 14 a 16 horas que motivaron el nacimiento del movimiento obrero y el socialismo."
    },
    {
      id: "huni_t06_s01_c10",
      question: "La doctrina política y socioeconómica formulada por Karl Marx y Friedrich Engels en el Manifiesto del Partido Comunista (1848) sostiene que el motor de toda la historia humana ha sido:",
      options: [
        "La libre competencia entre comerciantes individuales.",
        "La lucha de clases sociales antagónicas (amos y esclavos, señores y siervos, burgueses y proletarios).",
        "La voluntad divina revelada a los profetas monárquicos.",
        "El destino biológico de las razas geográficas."
      ],
      correctIndex: 1,
      explanation: "Marx y Engels postularon el materialismo histórico: «Toda la historia de la sociedad humana hasta nuestros días es la historia de las luchas de clases», proclamando la necesidad de la revolución proletaria para erradicar la propiedad privada burguesa e instaurar una sociedad sin clases."
    }
  ],

  huni_t06_s02: [
    {
      id: "huni_t06_s02_c01",
      question: "El pretexto o causa detonante inmediata que provocó el estallido de la Primera Guerra Mundial (la Gran Guerra) el 28 de junio de 1914 fue:",
      options: [
        "La invasión alemana de Bélgica neutral.",
        "El atentado de Sarajevo: el asesinato del archiduque heredero del Imperio Austro-Húngaro, Francisco Fernando, a manos del terrorista serbobosnio Gavrilo Princip de la 'Mano Negra'.",
        "El torpedeamiento del transatlántico británico Lusitania.",
        "La firma del pacto de no agresión germano-soviético."
      ],
      correctIndex: 1,
      explanation: "El magnicidio en Sarajevo activó el intrincado sistema de alianzas secretas de la Paz Armada: Austria-Hungría declaró la guerra a Serbia, Rusia movilizó sus tropas en defensa de los serbios, y Alemania declaró la guerra a Rusia y Francia desatando el conflicto mundial."
    },
    {
      id: "huni_t06_s02_c02",
      question: "Durante la Primera Guerra Mundial, los dos bloques imperialistas enfrentados fueron la Triple Alianza y la Triple Entente, integradas originalmente en 1914 por:",
      options: [
        "Estados Unidos, Japón y China vs. Alemania, Austria e Italia.",
        "La Triple Entente (Gran Bretaña, Francia y Rusia zarista) vs. las Potencias Centrales de la Triple Alianza (Alemania, Austria-Hungría e Italia, aunque Italia se pasó luego a los aliados).",
        "Rusia y Alemania vs. Francia e Inglaterra.",
        "España y Portugal vs. Holanda y Bélgica."
      ],
      correctIndex: 1,
      explanation: "La Entente Cordiale unió a las democracias occidentales y al imperio ruso para contrarrestar el expansionismo del Imperio Alemán del káiser Guillermo II y de la monarquía dual austrohúngara de los Habsburgo."
    },
    {
      id: "huni_t06_s02_c03",
      question: "La fase más prolongada y desgastante de la Primera Guerra Mundial en el frente occidental (1915 - 1917), caracterizada por el estancamiento de los ejércitos en zanjas fortificadas bajo ametralladoras, alambres de púas y gases tóxicos, se denominó:",
      options: [
        "Guerra relámpago (Blitzkrieg)",
        "Guerra de posiciones o trincheras (con carnicerías épicas como Verdún y el Somme)",
        "Guerra de guerrillas en la selva",
        "Guerra de corsarios submarinos mercantes"
      ],
      correctIndex: 1,
      explanation: "El poder destructivo de la artillería pesada y la ametralladora impidió maniobras abiertas: los soldados vivieron años sepultados en el lodo de las trincheras padeciendo ataques de gas mostaza y asaltos frontales suicidas que cobraron millones de bajas."
    },
    {
      id: "huni_t06_s02_c04",
      question: "El Tratado de Versalles, firmado en el Salón de los Espejos en 1919 para sellar la paz con Alemania, generó un profundo resentimiento revanchista en el pueblo germano debido a que:",
      options: [
        "Prohibió a los alemanes beber cerveza y cultivar trigo.",
        "Impuso durísimas e humillantes condiciones: la cláusula de culpa moral exclusiva de la guerra, la pérdida de todas sus colonias y territorios (Alsacia y Lorena), la desmilitarización del Rin y astronómicas indemnizaciones económicas de guerra.",
        "Obligó al káiser a trasladar la capital a Moscú.",
        "Dividió a Alemania en cuatro zonas controladas por Turquía."
      ],
      correctIndex: 1,
      explanation: "El 'Diktat' de Versalles asfixió económicamente a la República de Weimar y humilló el orgullo nacional alemán, abonando el terreno de odio, hiperinflación y crisis social que facilitó el meteórico ascenso de Adolf Hitler y el nazismo."
    },
    {
      id: "huni_t06_s02_c05",
      question: "La catástrofe financiera iniciada el 'Jueves Negro' (24 de octubre de 1929) con el colapso y desplome especulativo de la Bolsa de Valores de Wall Street en Nueva York desató en el mundo capitalista:",
      options: [
        "El auge inmediato de la producción de automóviles.",
        "La Gran Depresión económica de los años treinta, marcada por quiebras bancarias masivas, cierre de fábricas y millones de trabajadores desempleados en todo el planeta.",
        "La sustitución del dólar por el franco suizo.",
        "El triunfo definitivo de las teorías del libre mercado sin regulación."
      ],
      correctIndex: 1,
      explanation: "La Gran Depresión fue la peor crisis del capitalismo moderno: provocó la miseria de millones de familias, empujó a Estados Unidos a adoptar el New Deal de Franklin D. Roosevelt con intervención del Estado y precipitó la radicalización de los fascismos totalitarios en Europa."
    },
    {
      id: "huni_t06_s02_c06",
      question: "El totalitarismo fascista surgido en Italia bajo la dictadura de Benito Mussolini y en Alemania con el nacionalsocialismo de Adolf Hitler se caracterizó ideológicamente por:",
      options: [
        "La defensa irrestricta de los derechos humanos y el desarme nuclear.",
        "El nacionalismo exacerbado y agresivo, el culto carismático al líder infalible (Duce / Führer), el partido único, el antisemitismo racista y la destrucción de la democracia parlamentaria y de los sindicatos obreros.",
        "El respeto a la libertad de prensa y el libre comercio internacional.",
        "La subordinación absoluta del Estado al mandato de las Naciones Unidas."
      ],
      correctIndex: 1,
      explanation: "El fascismo y el nazismo subordinaron completamente al individuo ante el Estado totalitario («Todo en el Estado, nada contra el Estado, nada fuera del Estado»), promoviendo el rearme bélico, la conquista militar de 'espacio vital' (Lebensraum) y la aniquilación sistemática de minorías étnicas."
    },
    {
      id: "huni_t06_s02_c07",
      question: "El acontecimiento militar desencadenante formal que dio inicio a la Segunda Guerra Mundial en Europa el 1 de septiembre de 1939 fue:",
      options: [
        "El bombardeo japonés a la base naval de Pearl Harbor en Hawái.",
        "La invasión militar de Polonia por las tropas alemanas nazis mediante la técnica combinada de guerra relámpago (Blitzkrieg), lo que forzó a Gran Bretaña y Francia a declarar la guerra al Tercer Reich.",
        "La batalla de Stalingrado a orillas del río Volga.",
        "El desembarco de Normandía en las costas de Francia."
      ],
      correctIndex: 1,
      explanation: "Hitler atacó Polonia tras firmar el pacto Ribbentrop-Mólotov de reparto con la URSS; Gran Bretaña y Francia cumplieron sus garantías diplomáticas y declararon la guerra a Alemania el 3 de septiembre de 1939, desatando la mayor conflagración de la historia."
    },
    {
      id: "huni_t06_s02_c08",
      question: "La sangrienta batalla urbana librada entre agosto de 1942 y febrero de 1943 que se convirtió en el punto de inflexión decisivo de la Segunda Guerra Mundial en Europa, al concluir con la aniquilación y rendición del VI Ejército alemán del mariscal Paulus ante el Ejército Rojo soviético, fue:",
      options: [
        "La batalla de El Alamein",
        "La batalla de Stalingrado",
        "La batalla de las Ardenas",
        "La batalla de Midway"
      ],
      correctIndex: 1,
      explanation: "En las ruinas de Stalingrado, el ejército soviético resistió casa por casa y ejecutó la Operación Urano cercando a 300 000 soldados nazis; la rendición alemana marcó el inicio de la imparable contraofensiva soviética que culminaría con la toma de Berlín en 1945."
    },
    {
      id: "huni_t06_s02_c09",
      question: "El desembarco aliado más grandioso de la historia marítima, ejecutado el 6 de junio de 1944 ('Día D') bajo el mando supremo del general Dwight D. Eisenhower en la Operación Overlord, tuvo como objetivo:",
      options: [
        "Desembarcar tropas en las islas Kuriles soviéticas.",
        "Abrir un segundo frente de combate en Europa occidental liberando Francia de la ocupación nazi para avanzar directamente hacia el corazón de Alemania.",
        "Ocupar los pozos petroleros de Arabia Saudita.",
        "Evacuar a los soldados británicos cercados en Dunkerque."
      ],
      correctIndex: 1,
      explanation: "Miles de barcos y lanchas de desembarco desembarcaron a soldados norteamericanos, británicos y canadienses en las playas de Normandía (Omaha, Utah, Juno, Sword, Gold), rompiendo el Muro del Atlántico nazi y liberando París."
    },
    {
      id: "huni_t06_s02_c10",
      question: "La Segunda Guerra Mundial llegó a su dramática culminación en agosto de 1945 tras la decisión del presidente estadounidense Harry S. Truman de lanzar dos bombas atómicas sobre las ciudades japonesas de:",
      options: [
        "Tokio y Osaka",
        "Hiroshima (6 de agosto) y Nagasaki (9 de agosto)",
        "Kioto y Yokohama",
        "Okinawa e Iwo Jima"
      ],
      correctIndex: 1,
      explanation: "El bombardeo atómico arrasó instantáneamente Hiroshima (bomba 'Little Boy') y Nagasaki ('Fat Man') con más de 200 000 muertos, forzando la capitulación incondicional del emperador Hirohito a bordo del acorazado Missouri el 2 de septiembre de 1945."
    }
  ]
};

// Apply to SALIDA_KOTLIN/historia_universal
const baseDir = 'SALIDA_KOTLIN/historia_universal';
const correctTitles = {
  huni_t01_s01: "3.1. El Concepto y los Motores de la Hominización",
  huni_t01_s02: "3.3. Las Edades Arqueológicas de la Prehistoria: Paleolítico, Neolítico y Edad de los Metales",
  huni_t02_s01: "3.1. Las Sociedades Fluviales e Hidráulicas de Mesopotamia",
  huni_t02_s02: "3.3. Egipto: El Don del Nilo y el Estado Faraónico",
  huni_t03_s01: "3.1. Grecia Antigua: La Matriz Democrática y Cultural de Occidente",
  huni_t03_s02: "3.4. La República y el Imperio Romano",
  huni_t04_s01: "3.1. Reinos Romano-Germánicos, Imperio Carolingio y el Islam",
  huni_t04_s02: "3.5. El Feudalismo y las Cruzadas",
  huni_t05_s01: "3.1. El Humanismo y el Renacimiento Artístico",
  huni_t05_s02: "3.4. La Reforma Protestante, la Contrarreforma y la Ilustración",
  huni_t06_s01: "3.1. Las Revoluciones Burguesas y la Revolución Industrial",
  huni_t06_s02: "3.3. Las Guerras Mundiales y el Siglo XX"
};

for (let i = 1; i <= 6; i++) {
  const pad = String(i).padStart(2, '0');
  const filePath = path.join(baseDir, `HistoriaUniversalSemana${pad}.kt`);
  const parsed = parseKotlinFileRobust(filePath);

  let newFileContent = `package historia_universal\n\nobject HistoriaUniversalSemana${pad} {\n\n    val lessons = listOf(\n`;

  for (let lIdx = 0; lIdx < parsed.lessons.length; lIdx++) {
    const l = parsed.lessons[lIdx];
    const chList = newChallenges[l.id];
    if (!chList || chList.length !== 10) {
      console.error(`Error: Missing or invalid challenges for lesson ${l.id} (got ${chList ? chList.length : 0})`);
      process.exit(1);
    }

    const cleanTitle = correctTitles[l.id] || l.title.replace(/\\/g, '').replace(/"/g, '');

    newFileContent += `        LessonNode(\n`;
    newFileContent += `            id = "${l.id}",\n`;
    newFileContent += `            subjectId = "${l.subjectId}",\n`;
    newFileContent += `            semana = ${l.semana},\n`;
    newFileContent += `            subtema = "${l.subtema}",\n`;
    newFileContent += `            title = ${JSON.stringify(cleanTitle)},\n`;
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

console.log("All Historia Universal files repaired.");
