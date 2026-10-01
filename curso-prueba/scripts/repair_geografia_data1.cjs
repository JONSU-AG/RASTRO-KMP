const partA = require('./repair_geografia_data1.cjs');

// Append semanas 04, 05, 06 to partA
const partB = {
  ...partA,
  // Semana 04
  geo_t04_s01: [
    {
      id: "geo_t04_s01_c01",
      question: "La corteza terrestre o litosfera está dividida geoquímicamente en dos capas concéntricas con propiedades litológicas distintas denominadas:",
      options: [
        "Astenosfera y Pirosfera",
        "SIAL (corteza continental granítica) y SIMA (corteza oceánica basáltica)",
        "Endosfera y Mesosfera",
        "Zona fótica y afótica"
      ],
      correctIndex: 1,
      explanation: "El SIAL (compuesto predominantemente de sílice y aluminio) forma los bloques continentales con rocas graníticas livianas; el SIMA (sílice y magnesio) constituye el fondo de los océanos y la base sobre la que descansan los continentes con rocas basálticas más densas."
    },
    {
      id: "geo_t04_s01_c02",
      question: "La discontinuidad sísmica de primer orden que separa la corteza terrestre del manto superior, donde las ondas sísmicas P y S aumentan bruscamente de velocidad, es la:",
      options: [
        "Discontinuidad de Conrad",
        "Discontinuidad de Mohorovičić (Moho)",
        "Discontinuidad de Gutenberg",
        "Discontinuidad de Lehmann"
      ],
      correctIndex: 1,
      explanation: "Descubierta por el sismólogo croata Andrija Mohorovičić en 1909, el Moho marca el límite entre la delgada corteza rocosa superficial y el denso manto peridotítico subyacente."
    },
    {
      id: "geo_t04_s01_c03",
      question: "La capa del manto superior situada entre los 100 y 350 km de profundidad, compuesta por roca parcialmente fundida y viscosa (magma) donde se generan las corrientes de convección térmica que desplazan a las placas tectónicas, es la:",
      options: [
        "Pirosfera",
        "Astenosfera",
        "Endosfera",
        "Litosfera rígida"
      ],
      correctIndex: 1,
      explanation: "En la astenosfera, el calor interno de la Tierra genera corrientes de convección magmática ascendentes y descendentes que actúan como fajas transportadoras gigantescas que mueven las placas litosféricas rígidas flotantes sobre ella."
    },
    {
      id: "geo_t04_s01_c04",
      question: "El núcleo interno de la Tierra, a pesar de soportar temperaturas extremas cercanas a los 6 000 °C (similares a la superficie del Sol), se encuentra en estado físico sólido debido a:",
      options: [
        "La ausencia total de metales pesados.",
        "Las colosales presiones litostáticas hipercríticas que superan los 3.5 millones de atmósferas, impidiendo que el hierro y níquel alcancen su punto de fusión líquida.",
        "La acción de vientos cósmicos subterráneos.",
        "La presencia de agua líquida a presión."
      ],
      correctIndex: 1,
      explanation: "A profundidades de más de 5 150 km, la presión gravitatoria del peso de todo el planeta sobre el núcleo interno es tan descomunal que comprime los átomos de hierro y níquel (NIFE) en una esfera metálica sólida cristalina."
    },
    {
      id: "geo_t04_s01_c05",
      question: "La teoría de la Tectónica de Placas explica que la cordillera de los Andes y la fosa marina peruano-chilena se originan por un límite de placas convergente caracterizado por:",
      options: [
        "La separación divergente de placas que crea corteza oceánica.",
        "La subducción de la densa y pesada placa oceánica de Nazca que se hunde bajo la más liviana placa continental Sudamericana.",
        "El deslizamiento lateral o transformante pasivo sin vulcanismo.",
        "El choque frontal de dos placas continentales de igual densidad."
      ],
      correctIndex: 1,
      explanation: "La placa de Nazca converge a una velocidad de unos 6 a 8 cm por año hundiéndose en la fosa marina bajo la placa Sudamericana; la fricción y fusión de la placa subducida genera la intensa sismicidad y el arco volcánico andino."
    },
    {
      id: "geo_t04_s01_c06",
      question: "Los movimientos epirogénicos se diferencian de los orogénicos porque los primeros son:",
      options: [
        "Fuerzas horizontales violentas que pliegan y fracturan la corteza formando cadenas montañosas.",
        "Movimientos verticales lentos y de gran radio de curvatura de ascenso (emersión) o descenso (subsidencia) de masas continentales que buscan el equilibrio isostático.",
        "Erupciones volcánicas explosivas de ceniza piroclástica.",
        "Deslizamientos de lodo en quebradas andinas."
      ],
      correctIndex: 1,
      explanation: "La epirogénesis no deforma los estratos rocosos; provoca levantamientos de costas (formando tablazos marinos como en la costa norte peruana) o hundimientos marinos (depresiones como Bayóvar) para restablecer la isostasia."
    },
    {
      id: "geo_t04_s01_c07",
      question: "Cuando las fuerzas tectónicas orogénicas actúan por compresión horizontal sobre estratos rocosos rígidos e incompetentes que superan su límite de elasticidad, en lugar de plegarse la roca se rompe con desplazamiento visible de bloques, originando una:",
      options: [
        "Falla geológica",
        "Sinclinal",
        "Anticlinal",
        "Geoda de amatista"
      ],
      correctIndex: 0,
      explanation: "Las rocas duras o frágiles se fracturan formando fallas tectónicas con un bloque levantado (horst) y un bloque hundido (graben o fosa tectónica), mientras que las rocas sedimentarias plásticas forman pliegues (anticlinales y sinclinales)."
    },
    {
      id: "geo_t04_s01_c08",
      question: "El magnetismo terrestre que conforma la magnetosfera protectora del planeta frente al destructivo viento solar se genera por el efecto de dinamo producido en:",
      options: [
        "La litosfera granítica continental.",
        "El núcleo externo líquido compuesto de hierro y níquel fundido en continuo movimiento turbulento de convección y rotación.",
        "Los arrecifes de coral en el océano.",
        "La ionosfera atmosférica superior."
      ],
      correctIndex: 1,
      explanation: "Las corrientes de convección del hierro metálico fundido cargado eléctricamente en el núcleo externo líquido generan un gigantesco campo magnético dipolar que desvía las partículas letales del plasma solar."
    },
    {
      id: "geo_t04_s01_c09",
      question: "En el vulcanismo intrusivo o plutónico, la masa gigantesca de magma consolidada y enfriada muy lentamente en las profundidades de la corteza, que al quedar expuesta por erosión forma el núcleo rocoso de grandes cordilleras, se denomina:",
      options: [
        "Dique o filón",
        "Batolito",
        "Lacolito",
        "Sill o manto de lava"
      ],
      correctIndex: 1,
      explanation: "El Batolito de la Costa del Perú es una monumental estructura de roca ígnea intrusiva (granito y granodiorita) de más de 1 200 km de longitud emplazada en el Cretácico que aflora hoy formando las bases de la vertiente occidental andina."
    },
    {
      id: "geo_t04_s01_c10",
      question: "El volcán más activo del Perú, que en los últimos años ha registrado erupciones periódicas con expulsión de cenizas y gases afectando al valle de Moquegua y Arequipa, es el volcán:",
      options: [
        "Misti",
        "Ubinas",
        "Coropuna",
        "Ampato"
      ],
      correctIndex: 1,
      explanation: "Ubinas (Moquegua) es el volcán con mayor recurrencia eruptiva histórica documentada en el Perú, monitoreado permanentemente por el Instituto Geofísico del Perú (IGP) y el INGEMMET ante el riesgo de explosiones freatomagmáticas."
    }
  ],

  // Semana 05
  geo_t05_s01: [
    {
      id: "geo_t05_s01_c01",
      question: "En la composición química de la atmósfera terrestre limpia y seca (aire puro), los dos gases permanentes o constantes más abundantes que juntos representan el 99% del volumen total son:",
      options: [
        "Vapor de agua (H2O) y Dióxido de carbono (CO2)",
        "Nitrógeno molecular (N2, 78.08%) y Oxígeno molecular (O2, 20.95%)",
        "Argón (Ar) y Metano (CH4)",
        "Ozono (O3) e Hidrógeno (H2)"
      ],
      correctIndex: 1,
      explanation: "El nitrógeno es el gas más abundante e inerte biológicamente en la respiración, actuando como diluyente del oxígeno activo que hace posible la combustión y la respiración aeróbica de los seres vivos."
    },
    {
      id: "geo_t05_s01_c02",
      question: "La capa más baja de la atmósfera que está en contacto directo con la superficie terrestre, donde se concentra el 80% de la masa gaseosa y ocurren casi todos los fenómenos meteorológicos (lluvias, vientos, nubes), es la:",
      options: [
        "Estratosfera",
        "Troposfera",
        "Mesosfera",
        "Termosfera"
      ],
      correctIndex: 1,
      explanation: "La troposfera (espesor de unos 18 km en el ecuador y 9 km en los polos) es la capa del tiempo meteorológico y de la vida (biosfera); en ella opera la gradiente térmica vertical donde la temperatura desciende 6.5 °C por cada kilómetro de altitud."
    },
    {
      id: "geo_t05_s01_c03",
      question: "La Capa de Ozono (ozonosfera), escudo biológico natural que absorbe la letal radiación ultravioleta de alta energía (UV-B y UV-C) procedente del Sol, se localiza en la capa atmosférica denominada:",
      options: [
        "Troposfera",
        "Estratosfera (entre los 20 y 35 km de altitud)",
        "Exosfera",
        "Ionosfera"
      ],
      correctIndex: 1,
      explanation: "En la estratosfera media, las moléculas de oxígeno triatómico (O3) se forman y destruyen fotolíticamente absorbiendo la radiación UV dañina; su destrucción por gases clorofluorocarbonos (CFCs) originó el agujero de ozono antártico regulado por el Protocolo de Montreal."
    },
    {
      id: "geo_t05_s01_c04",
      question: "La Mesosfera se caracteriza térmicamente en la estructura vertical de la atmósfera por constituir:",
      options: [
        "La capa más caliente con miles de grados de temperatura.",
        "La capa más fría de la envoltura gaseosa terrestre, donde la temperatura desciende hasta cerca de los -90 °C en la mesopausa.",
        "La zona donde se forman los huracanes tropicales.",
        "La capa donde orbitan los satélites geoestacionarios."
      ],
      correctIndex: 1,
      explanation: "En la mesosfera (50 a 85 km) el aire es extremadamente tenue y carece de ozono para calentarse; además, en esta capa la fricción atmosférica desintegra a la inmensa mayoría de meteoritos que ingresan al planeta, produciendo las 'estrellas fugaces'."
    },
    {
      id: "geo_t05_s01_c05",
      question: "La Termosfera o Ionosfera cumple un rol técnico insustituible en las telecomunicaciones tradicionales y la ciencia aeroespacial debido a que:",
      options: [
        "Permite cultivar verduras de estación en invernaderos flotantes.",
        "Contiene capas ionizadas cargadas eléctricamente (capas Kennelly-Heaviside y Appleton) que reflejan y rebotan las ondas cortas de radio, además de ser la sede donde se producen las auroras polares y orbita la Estación Espacial Internacional.",
        "Es la capa que genera las precipitaciones de granizo.",
        "Está compuesta enteramente de gas radón puro."
      ],
      correctIndex: 1,
      explanation: "La intensa radiación X y solar ultravioleta ioniza a los átomos en la termosfera liberando electrones que hacen posible el rebote y propagación transoceánica de señales radiales analógicas antes de la era de los cables submarinos de fibra óptica."
    },
    {
      id: "geo_t05_s01_c06",
      question: "El Límite superior difuso de la atmósfera terrestre que se confunde gradualmente con el vacío del espacio interplanetario, donde el helio y el hidrógeno escapan a la gravedad, es la:",
      options: [
        "Estratosfera",
        "Exosfera (por encima de los 600 - 1 000 km)",
        "Troposfera",
        "Mesopausa"
      ],
      correctIndex: 1,
      explanation: "En la exosfera la densidad molecular es tan baja que las partículas recorren cientos de kilómetros sin colisionar entre sí; allí se encuentran los Cinturones de radiación de Van Allen que atrapan protones y electrones solares."
    },
    {
      id: "geo_t05_s01_c07",
      question: "¿Cuáles son los dos factores físicos fundamentales que hacen posible que la Tierra conserve retenida su envoltura atmosférica y no se disipe en el espacio exterior?",
      options: [
        "La radiación gamma y el movimiento de precesión.",
        "La fuerza de gravedad terrestre (que retiene y atrae los gases hacia la superficie) y la energía solar (que calienta y dinamiza el movimiento molecular de los gases).",
        "La salinidad oceánica y las mareas lunares.",
        "La presión del magma en los volcanes."
      ],
      correctIndex: 1,
      explanation: "Si la gravedad fuera débil (como en la Luna o Marte), los gases escaparían al espacio; si no hubiera radiación solar, los gases se congelarían y precipitarían al suelo. El equilibrio entre gravedad y dinamismo térmico solar mantiene la atmósfera viviente."
    },
    {
      id: "geo_t05_s01_c08",
      question: "El efecto invernadero natural de la atmósfera terrestre es un proceso biofísico beneficioso para la vida sin el cual:",
      options: [
        "La temperatura media global descendería a unos gélidos -18 °C congelando los océanos.",
        "El oxígeno desaparecería en pocas semanas.",
        "Los volcanes entrarían en erupción simultánea.",
        "La Tierra perdería su campo magnético protector."
      ],
      correctIndex: 0,
      explanation: "Gases termoactivos naturales como el vapor de agua y el CO2 absorben la radiación infrarroja de onda larga emitida por el suelo caliente, manteniendo la temperatura media global en unos benignos +15 °C; el problema actual es el efecto invernadero intensificado artificialmente por la quema de combustibles fósiles."
    },
    {
      id: "geo_t05_s01_c09",
      question: "El gas variable de la atmósfera que presenta la mayor capacidad calórica y es el principal responsable directo del efecto invernadero natural en el planeta es:",
      options: [
        "El argón",
        "El vapor de agua (H2O)",
        "El monóxido de carbono",
        "El helio"
      ],
      correctIndex: 1,
      explanation: "Aunque en el debate sobre el cambio climático se enfatiza el CO2 de origen industrial, el vapor de agua es responsable de más del 60% del efecto invernadero natural del planeta debido a su abundancia en la troposfera baja y su altísima capacidad calorífica."
    },
    {
      id: "geo_t05_s01_c10",
      question: "La gradiente térmica vertical normal en la troposfera estipula que a medida que se incrementa la altitud sobre el nivel del mar, la temperatura:",
      options: [
        "Aumenta en forma exponencial hasta hervir.",
        "Disminuye a razón constante promedio de 6.5 °C por cada 1 000 metros de ascenso (o 0.65 °C cada 100 m).",
        "Permanece inmutable e insensible a la altitud.",
        "Se duplica cada 500 metros en la sierra."
      ],
      correctIndex: 1,
      explanation: "La troposfera no se calienta directamente por los rayos solares descendentes sino por la radiación terrestre irradiada desde el suelo; por tanto, conforme nos alejamos del piso caliente hacia cumbres más altas, el aire es más frío y menos denso."
    }
  ],

  // Semana 05.2 (Climatología)
  geo_t05_s02: [
    {
      id: "geo_t05_s02_c01",
      question: "La diferencia epistemológica fundamental entre Tiempo Meteorológico y Clima radica en:",
      options: [
        "El tipo de termómetro utilizado en el laboratorio.",
        "La escala temporal: el tiempo meteorológico es el estado transitorio e instantáneo de la atmósfera en un momento y lugar específico, mientras que el clima es el patrón promedio de dicho estado registrado a lo largo de al menos 30 años.",
        "El hemisferio en el que se localiza el observador.",
        "El idioma en que se redactan los partes meteorológicos."
      ],
      correctIndex: 1,
      explanation: "Decir «hoy llueve intensamente en Huancayo» alude al tiempo meteorológico; en cambio, afirmar que «Huancayo posee un clima templado seco con lluvias estacionales de verano» alude al clima determinado por estadísticas multidecenales de la OMM."
    },
    {
      id: "geo_t05_s02_c02",
      question: "El instrumento meteorológico utilizado para medir la presión atmosférica en hectopascales o milímetros de mercurio, inventado por Evangelista Torricelli en 1643, es el:",
      options: [
        "Anemómetro",
        "Barómetro",
        "Pluviómetro",
        "Higrómetro"
      ],
      correctIndex: 1,
      explanation: "El barómetro mide el peso que ejerce la columna de aire atmosférico sobre una unidad de superficie; la presión disminuye con la altitud y varía con la temperatura, representándose en los mapas meteorológicos mediante isobaras."
    },
    {
      id: "geo_t05_s02_c03",
      question: "Los Vientos Alisios son vientos planetarios constantes y regulares que soplan permanentemente desde las zonas de altas presiones subtropicales (30° latitud) hacia:",
      options: [
        "Los círculos polares Ártico y Antártico.",
        "La zona de baja presión ecuatorial (Zona de Convergencia Intertropical o ZCIT).",
        "La meseta del Tíbet.",
        "El desierto de Gobi."
      ],
      correctIndex: 1,
      explanation: "En la célula de Hadley, el aire caliente ecuatorial asciende creando bajas presiones que atraen a los vientos alisios: alisios del noreste en el hemisferio norte y alisios del sureste en el hemisferio sur, desviados por el efecto Coriolis."
    },
    {
      id: "geo_t05_s02_c04",
      question: "Las precipitaciones de tipo 'orográfico', muy frecuentes en el flanco oriental de la cordillera de los Andes peruanos hacia la Selva Alta, se producen cuando:",
      options: [
        "El aire seco polar choca contra el mar cálido.",
        "Masas de aire húmedo empujadas por el viento chocan contra una barrera montañosa y se ven forzadas a ascender, enfriándose adiabáticamente y condensándose en lluvias torrenciales en la ladera de barlovento.",
        "Ocurre una erupción volcánica submarina.",
        "La radiación solar nocturna enfría el suelo desértico."
      ],
      correctIndex: 1,
      explanation: "Las nubes amazónicas cargadas de vapor se estrellan contra la muralla oriental andina; al elevarse por barlovento descargan lluvias descomunales (ej. Quincemil o San Gabán), pasando al otro lado (sotavento) como aire seco y cálido (efecto Föhn)."
    },
    {
      id: "geo_t05_s02_c05",
      question: "Por su localización latitudinal geográfica de baja latitud (entre 0° y 18° de Latitud Sur), al Perú le correspondería naturalmente poseer en todo su territorio un clima:",
      options: [
        "Templado oceánico con bosques caducifolios de robles.",
        "Cálido, muy húmedo y lluvioso de tipo tropical o ecuatorial en toda su extensión territorial.",
        "Gélido de tundra polar permanente.",
        "Mediterráneo de inviernos lluviosos y veranos secos."
      ],
      correctIndex: 1,
      explanation: "Al hallarse íntegramente en la zona intertropical o tórrida del globo, el Perú debería ser un país uniformemente cálido y selvático como el Congo o Indonesia; sin embargo, factores geográficos anómalos modifican drásticamente esta condición."
    },
    {
      id: "geo_t05_s02_c06",
      question: "El factor geográfico preponderante considerado la 'columna vertebral' del territorio peruano, que divide al país en cuencas hidrográficas y genera una gigantesca diversidad de pisos ecológicos y microclimas, es:",
      options: [
        "La meseta del Collao",
        "La presencia imponente de la Cordillera de los Andes",
        "La dorsal submarina de Nazca",
        "La cuenca del río Madre de Dios"
      ],
      correctIndex: 1,
      explanation: "La Cordillera de los Andes actúa como un biombo o muro climático que impide el paso de la humedad amazónica a la costa y genera gradientes altitudinales térmicas que albergan desde climas desérticos y cálidos hasta nieves polares en las cumbres."
    },
    {
      id: "geo_t05_s02_c07",
      question: "La causa meteorológica y oceanográfica principal que explica la extrema aridez y ausencia casi total de lluvias regulares en la costa central y sur del Perú (desde Piura hasta Tacna) es:",
      options: [
        "El excesivo calor de la arena marina.",
        "La presencia de la Corriente Peruana o de Humboldt de aguas frías, que enfría el aire inferior impidiendo la convección y generando una capa de inversión térmica con neblinas y nubes estratos pero sin precipitaciones.",
        "La radiación de las minas de cobre en la costa.",
        "La evaporación acelerada provocada por huracanes del Pacífico."
      ],
      correctIndex: 1,
      explanation: "El mar frío enfría la base del aire costero mientras arriba el aire es más templado (inversión térmica); esto anula las corrientes ascendentes de aire que forman nubes de tormenta (cumulonimbus), originando solo techos de nubes estratos bajas y garúas invernales."
    },
    {
      id: "geo_t05_s02_c08",
      question: "La Corriente marina de El Niño, proveniente del Golfo de Guayaquil hacia el norte peruano, ejerce un impacto climático opuesto caracterizado por:",
      options: [
        "Enfriar el litoral hasta congelar las caletas pesqueras.",
        "Aportar masas de aguas cálidas (> 23 °C) y baja salinidad, desatando intensas lluvias estacionales en la costa norte (Tumbes y Piura) y generando una vegetación de bosque seco ecuatorial.",
        "Provocar heladas nocturnas en los valles costeños.",
        "Desecar los ríos de la cuenca amazónica."
      ],
      correctIndex: 1,
      explanation: "La masa cálida de El Niño rompe la estabilidad costera norteña y propicia una intensa evaporación y convección atmosférica, originando aguaceros torrenciales de verano que en eventos extraordinarios provocan desbordes catastróficos."
    },
    {
      id: "geo_t05_s02_c09",
      question: "El fenómeno climático estacional conocido como 'Friaje' o 'Surazo', que azota periódicamente la selva baja del Perú (especialmente Madre de Dios, Ucayali y Loreto) provocando caídas térmicas bruscas de hasta 10 °C, es originado por:",
      options: [
        "La erupción de cenizas del volcán Sabancaya.",
        "La incursión violenta de masas de aire frío y seco de origen polar antártico que ingresan por la cuenca del Río de la Plata y avanzan por la llanura amazónica.",
        "El colapso de las represas hidroeléctricas en Brasil.",
        "La evaporación nocturna del río Amazonas."
      ],
      correctIndex: 1,
      explanation: "En los meses de invierno austral (mayo a agosto), frentes polares antárticos canalizados entre la cordillera andina y la meseta brasileña barren la cuenca amazónica sin obstáculos orográficos, provocando vientos helados que desploman los termómetros selváticos."
    },
    {
      id: "geo_t05_s02_c10",
      question: "Las 'Heladas' meteorológicas en la sierra peruana, fenómeno que congela cultivos de papa y pastizales por debajo de los 0 °C afectando gravemente a la ganadería de camélidos en Puno y Huancavelica, se intensifican en invierno debido a:",
      options: [
        "El exceso de nubosidad que retiene el calor.",
        "La ausencia de nubes (cielos despejados) y la extrema sequedad del aire en la noche, lo que produce una violenta pérdida por irradiación del calor acumulado durante el día.",
        "La cercanía de la Luna a la Tierra.",
        "La contaminación industrial de las fundiciones mineras."
      ],
      correctIndex: 1,
      explanation: "Sin nubes ni humedad que actúen como frazada protectora de efecto invernadero nocturno en las altas mesetas serranas, el calor del suelo se escapa libremente al espacio interestelar durante la noche helando la superficie vegetal."
    }
  ],

  // Semana 06
  geo_t06_s01: [
    {
      id: "geo_t06_s01_c01",
      question: "La delimitación jurídica y soberana de las 200 millas marinas del Mar Territorial del Perú fue consagrada históricamente el 1 de agosto de 1947 mediante decreto supremo dictado por el presidente constitucional:",
      options: [
        "Manuel A. Odría",
        "José Luis Bustamante y Rivero",
        "Fernando Belaunde Terry",
        "Augusto B. Leguía"
      ],
      correctIndex: 1,
      explanation: "El D.S. N.° 781 promulgado por el insigne jurista arequipeño Bustamante y Rivero y refrendado por su canciller Enrique García Sayán proclamó por vez primera en el derecho internacional marítimo la soberanía y jurisdicción sobre el zócalo y las 200 millas del mar adyacente."
    },
    {
      id: "geo_t06_s01_c02",
      question: "El fenómeno de Afloramiento (upwelling), motor biológico neurálgico del Mar Frío de la Corriente Peruana, consiste físicamente en:",
      options: [
        "El hundimiento de los cardúmenes hacia las fosas abisales para escapar de los barcos pesqueros.",
        "El ascenso vertical hacia la superficie iluminada de masas de agua profundas, frías y densas cargadas de sales minerales y nutrientes (nitratos, fosfatos, silicatos) removidas del fondo marino.",
        "La mezcla de agua dulce de los ríos con el petróleo derramado.",
        "El calentamiento de las bahías por fuentes hidrotermales volcánicas."
      ],
      correctIndex: 1,
      explanation: "Los vientos alisios que soplan del sureste desplazan las aguas superficiales mar afuera (transporte de Ekman), forzando a las aguas frías profundas ricas en nutrientes minerales a brotar a la superficie, fertilizando el fitoplancton que alimenta a la anchoveta."
    },
    {
      id: "geo_t06_s01_c03",
      question: "La coloración verdosa característica de las aguas del Mar Frío de la Corriente Peruana se debe fundamentalmente a:",
      options: [
        "La descomposición de algas tóxicas contaminantes.",
        "La extraordinaria densidad y proliferación masiva de fitoplancton microscópico (especialmente diatomeas ricas en clorofila).",
        "El reflejo de los bosques de eucaliptos de la costa.",
        "La disolución de minerales de cobre provenientes de los relaves."
      ],
      correctIndex: 1,
      explanation: "El fitoplancton vegetal clorofílico aprovecha la abundante luz solar en el zócalo continental y los nutrientes del afloramiento para multiplicarse exponencialmente, tiñendo el mar de color verde y formando el primer eslabón trófico más productivo del planeta."
    },
    {
      id: "geo_t06_s01_c04",
      question: "La especie ictiológica marina que constituye la piedra angular y base trófica de la biomasa del ecosistema del Mar Peruano y sustenta la industria harinera nacional es:",
      options: [
        "El bonito",
        "La anchoveta peruana (Engraulis ringens)",
        "El jurel",
        "La corvina plateada"
      ],
      correctIndex: 1,
      explanation: "La anchoveta se alimenta directamente de fitoplancton y zooplancton; su abundancia colosal sustenta la alimentación de aves guaneras (guanay, piquero, pelícano), lobos marinos, cetáceos y especies ictiológicas mayores."
    },
    {
      id: "geo_t06_s01_c05",
      question: "El ecosistema del Mar Tropical del Perú, ubicado al norte de la península de Illescas y Punta Pariñas en Tumbes y Piura, se diferencia del Mar Frío por presentar:",
      options: [
        "Aguas gélidas con formación de témpanos flotantes.",
        "Aguas cálidas (temperaturas superiores a 22 °C), baja salinidad por desembocadura de ríos ecuatoriales y la presencia exclusiva de bosques de manglares y conchas negras.",
        "Ausencia total de peces y crustáceos.",
        "Olas de más de 30 metros de altura permanentes."
      ],
      correctIndex: 1,
      explanation: "El Mar Tropical está bajo la influencia de la contracorriente ecuatorial cálida; sus aguas transparentes y bajas en fitoplancton sostienen una alta diversidad pero menor biomasa que el mar frío, destacando los manglares de Tumbes con moluscos y cocodrilos."
    },
    {
      id: "geo_t06_s01_c06",
      question: "El límite divisorio oceanográfico natural donde confluyen y se desvían hacia el oeste la Corriente de Humboldt de aguas frías y la Corriente marina de El Niño de aguas cálidas se sitúa en:",
      options: [
        "El puerto de Chimbote (Áncash)",
        "La zona de Punta Pariñas y la península de Illescas (Piura)",
        "El Callao (Lima)",
        "Pisco (Ica)"
      ],
      correctIndex: 1,
      explanation: "A la altura de los 5° de Latitud Sur (Piura), la Corriente Peruana abandona el litoral desviándose hacia las islas Galápagos integrándose a la corriente ecuatorial sur, marcando la frontera ecológica entre el Mar Frío y el Mar Tropical."
    },
    {
      id: "geo_t06_s01_c07",
      question: "El fenómeno oceanográfico y climático conocido como 'El Niño - Oscilación del Sur' (ENOS) genera en el mar peruano un impacto biológico desastroso consistente en:",
      options: [
        "La multiplicación de los bancos de anchoveta en la costa.",
        "La invasión masiva de aguas cálidas tropicales que profundizan la termoclina, bloquean el afloramiento de nutrientes y provocan la migración o muerte masiva de la anchoveta y la mortandad de aves guaneras.",
        "El congelamiento de la bahía de Paracas.",
        "La extinción definitiva de los tiburones martillo."
      ],
      correctIndex: 1,
      explanation: "Al debilitarse los vientos alisios, las aguas cálidas invaden el litoral; el agua fría se sumerge a gran profundidad, los nutrientes no afloran, el fitoplancton colapsa y la anchoveta huye hacia el sur o hacia el fondo, provocando la mortandad de guanayes y el colapso pesquero."
    },
    {
      id: "geo_t06_s01_c08",
      question: "El ave guanera más eficiente y de mayor producción de guano fertilizante natural en las islas del litoral peruano es el:",
      options: [
        "Pelícano o alcatraz",
        "Guanay (Phalacrocorax bougainvillii)",
        "Piquero común",
        "Zarcillo"
      ],
      correctIndex: 1,
      explanation: "El guanay anida en colonias densísimas de millones de individuos sobre las islas guaneras (Chincha, Ballestas, Lobos de Afuera); cada individuo consume hasta medio kilo de anchoveta al día depositando el fertilizante nitrogenado más rico del mundo."
    },
    {
      id: "geo_t06_s01_c09",
      question: "En el relieve submarino del Mar de Grau, la llanura submarina suavemente inclinada que se extiende desde la línea de playa hasta los 200 metros de profundidad, donde se concentra la mayor actividad pesquera, es:",
      options: [
        "El Talud Continental",
        "El Zócalo o Plataforma Continental",
        "La Fosa Central Marina",
        "La Dorsal de Nazca"
      ],
      correctIndex: 1,
      explanation: "El zócalo continental es la zona fótica donde la radiación solar penetra hasta el lecho marino; frente a Chimbote alcanza su máxima anchura en el Perú (hasta 140 km), albergando los mayores criaderos de peces del país."
    },
    {
      id: "geo_t06_s01_c10",
      question: "La cadena montañosa volcánica submarina que se eleva en el fondo del océano Pacífico frente a las costas de Ica y avanza hacia el continente hundiéndose en la placa Sudamericana se denomina:",
      options: [
        "Dorsal Mesoatlántica",
        "Dorsal de Nazca",
        "Cordillera del Misti submarino",
        "Fosa de las Marianas"
      ],
      correctIndex: 1,
      explanation: "La Dorsal de Nazca es una cordillera volcánica submarina de miles de kilómetros de longitud que corta oblicuamente la fosa marina frente a Ica; su colisión con la placa continental produce un levantamiento tectónico de la costa iqueña e incrementa la fricción sísmica."
    }
  ],

  // Semana 06.2 (Aguas Continentales)
  geo_t06_s02: [
    {
      id: "geo_t06_s02_c01",
      question: "La Vertiente Hidrográfica del Pacífico del Perú, integrada por 53 ríos principales que desembocan en el mar peruano, se caracteriza hidrológicamente por presentar ríos de:",
      options: [
        "Curso navegable durante miles de kilómetros y régimen constante todo el año.",
        "Cuenca exorreica, curso corto, pendiente abrupta y régimen irregular con crecidas torrenciales en verano y estiaje severo en invierno.",
        "Aguas tranquilas que forman meandros y pantanos gigantescos.",
        "Desembocadura en grandes deltas pantanosos sin valles agrícolas."
      ],
      correctIndex: 1,
      explanation: "Los ríos costeños nacen en las alturas de la cordillera occidental andina y bajan velozmente hacia el mar; como dependen de las lluvias veraniegas de la sierra, en invierno sus cauces se reducen a un hilo de agua o se secan por completo (ríos secos o intermitentes)."
    },
    {
      id: "geo_t06_s02_c02",
      question: "¿Cuál es el único río de toda la vertiente del Pacífico peruano que cuenta con desembocadura en delta navegable para embarcaciones de mediano calado en su tramo final?",
      options: [
        "Río Rímac (Lima)",
        "Río Tumbes",
        "Río Santa (Áncash)",
        "Río Majes (Arequipa)"
      ],
      correctIndex: 1,
      explanation: "El río Tumbes (nacido en Ecuador como río Puyango) es el único río de la costa peruana que forma un delta con brazos navegables e islas cubiertas de manglares, gracias a las intensas precipitaciones tropicales del extremo norte."
    },
    {
      id: "geo_t06_s02_c03",
      question: "El río más caudaloso de la vertiente del Pacífico, que corre longitudinalmente formando el fértil Callejón de Huaylas entre la Cordillera Blanca y la Cordillera Negra antes de quebrar los Andes en el Cañón del Pato, es el:",
      options: [
        "Río Jequetepeque",
        "Río Santa",
        "Río Ica",
        "Río Caplina"
      ],
      correctIndex: 1,
      explanation: "El río Santa mantiene el caudal más regular de la costa gracias al deshielo de los nevados de la Cordillera Blanca, alimentando a la central hidroeléctrica del Cañón del Pato y a los grandes proyectos de irrigación Chavimochic y Chinecas."
    },
    {
      id: "geo_t06_s02_c04",
      question: "La naciente remota y glacial del río Amazonas, el río más largo y caudaloso del planeta Tierra, fue fijada científicamente en la cordillera Chila (Arequipa) en los deshielos del nevado:",
      options: [
        "Huascarán",
        "Quehuisha / Apacheta (nevado Mismi)",
        "Alpamayo",
        "Ausangate"
      ],
      correctIndex: 1,
      explanation: "Expediciones internacionales confirmaron que el origen más lejano del Amazonas brota a más de 5 170 msnm en el nevado Mismi en Caylloma (Arequipa) a través del riachuelo Carhuasanta, recorriendo los ríos Apurímac, Ene, Tambo y Ucayali antes de unirse al Marañón."
    },
    {
      id: "geo_t06_s02_c05",
      question: "El río Amazonas nace formalmente en territorio peruano con dicho nombre tras la confluencia de dos colosales ríos navegables de la selva denominados:",
      options: [
        "Urubamba y Tambo",
        "Marañón y Ucayali (a la altura del pueblo de Nauta, Loreto)",
        "Huallaga y Napo",
        "Madre de Dios y Heath"
      ],
      correctIndex: 1,
      explanation: "En Nauta, el río Ucayali (el más largo del Perú) se une con el río Marañón (el de mayor potencial hidroeléctrico por sus pongos) para conformar el lecho principal del colosal río Amazonas que fluye hacia Iquitos y la frontera con Brasil."
    },
    {
      id: "geo_t06_s02_c06",
      question: "La Hoya Hidrográfica del Lago Titicaca es un sistema hidrográfico cerrado y endorreico situado a 3 812 msnm, caracterizado porque sus ríos tributarios:",
      options: [
        "Desembocan en el océano Atlántico cruzando la selva de Bolivia.",
        "Nacen en las cordilleras Carabaya y Volcánica, son de corto recorrido y vierten todas sus aguas en el propio lago Titicaca, sin salida al mar.",
        "Son navegables por submarinos nucleares.",
        "Se evaporan antes de llegar a cualquier meseta."
      ],
      correctIndex: 1,
      explanation: "Una cuenca endorreica no desagua en el mar; los ríos del altiplano (Ramis, Ilave, Coata, Huancané) forman una red radial centrípeta que deposita sus aguas en el lago Titicaca, el cual pierde agua únicamente por evaporación y por su único efluente el río Desaguadero."
    },
    {
      id: "geo_t06_s02_c07",
      question: "El río más extenso, largo y caudaloso de toda la cuenca hidrográfica del lago Titicaca es el:",
      options: [
        "Río Ilave",
        "Río Ramis",
        "Río Coata",
        "Río Suches"
      ],
      correctIndex: 1,
      explanation: "El río Ramis (formado por los ríos Pucará y Azángaro) es la principal arteria hídrica del altiplano puneño, aportando casi un tercio del agua total que ingresa al lago Titicaca, sufriendo hoy problemas de contaminación por minería informal."
    },
    {
      id: "geo_t06_s02_c08",
      question: "El único efluente (río emisor) que desagua parte de los caudales del lago Titicaca conduciéndolos hacia el lago Poopó en territorio boliviano es el:",
      options: [
        "Río Madre de Dios",
        "Río Desaguadero",
        "Río Pilcomayo",
        "Río Mauri"
      ],
      correctIndex: 1,
      explanation: "El río Desaguadero drena los excesos hídricos del lago Titicaca en su extremo sur sirviendo de límite fronterizo entre Perú y Bolivia, regulando el volumen del lago hacia el salar boliviano."
    },
    {
      id: "geo_t06_s02_c09",
      question: "El lago de mayor superficie interna ubicado íntegramente en territorio peruano, célebre por albergar al zambullidor de Junín (ave endémica en peligro crítico) y alimentar al río Mantaro, es el:",
      options: [
        "Lago Titicaca",
        "Lago Chinchaycocha (o Lago de Junín)",
        "Lago Sandoval",
        "Laguna de Llanganuco"
      ],
      correctIndex: 1,
      explanation: "Aunque el Titicaca es el más grande pero compartido con Bolivia, el lago Chinchaycocha (a más de 4 000 msnm en la meseta de Bombón) es el lago 100% peruano más extenso del país, declarado Reserva Nacional para proteger su avifauna acuática."
    },
    {
      id: "geo_t06_s02_c10",
      question: "El lago Titicaca cumple un papel termorregulador ecológico vital para la supervivencia humana y agrícola en la meseta del Collao porque:",
      options: [
        "Sus aguas alcanzan el punto de ebullición en la noche.",
        "Absorbe calor solar durante el día y lo libera gradualmente durante la noche fría, creando un microclima térmico benigno que mitiga las heladas y hace posible la agricultura en el Altiplano.",
        "Sus aguas son ricas en petróleo combustible que calienta la orilla.",
        "Impide la formación de vientos en toda la sierra sur."
      ],
      correctIndex: 1,
      explanation: "El enorme espejo de agua del Titicaca actúa como un gigantesco acumulador de calor; gracias a este efecto termorregulador, las orillas del lago disfrutan de temperaturas más templadas que las punas desiertas, permitiendo la mayor concentración demográfica indígena del altiplano."
    }
  ]
};

module.exports = partB;
