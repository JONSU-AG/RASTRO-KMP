const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const newChallenges = {
  // Semana 01
  hper_t01_s01: [
    {
      id: "hper_t01_s01_c01",
      question: "La teoría inmigracionista asiática del poblamiento americano, sustentada científicamente por el antropólogo checo-norteamericano Álex Hrdlicka, sostiene que las primeras bandas de cazadores ingresaron a América cruzando:",
      options: [
        "El istmo de Panamá provenientes de la selva amazónica.",
        "El estrecho de Bering durante la glaciación de Wisconsin aprovechando el puente terrestre de Beringia.",
        "El océano Atlántico en balsas de juncos guiados por corrientes cálidas.",
        "La plataforma continental de la Antártida favorecidos por un óptimo climático."
      ],
      correctIndex: 1,
      explanation: "Hrdlicka postuló que durante el Pleistoceno tardío (glaciación de Wisconsin), el descenso del nivel marino (eustasia glacial) expuso el lecho marino de Beringia, permitiendo el paso a pie de bandas paleomongoloides desde Siberia hacia Alaska."
    },
    {
      id: "hper_t01_s01_c02",
      question: "¿Cuál fue el principal argumento etnográfico y geográfico formulado por el portugués Méndez Correia para defender la ruta de poblamiento australiano?",
      options: [
        "El empleo exclusivo de embarcaciones a vela similares a las canoas polinesias.",
        "La existencia de un «optimus climaticus» en la Antártida que facilitó el tránsito por islas subantárticas hasta Tierra del Fuego y la Patagonia.",
        "La presencia de cerámicas vidriadas idénticas en Australia y la costa del Pacífico peruano.",
        "El cultivo simultáneo de maíz y calabazas en Tasmania y los Andes centrales."
      ],
      correctIndex: 1,
      explanation: "Méndez Correia sostuvo que grupos australoides aprovecharon un periodo de recalentamiento climático («optimus climaticus») que derritió temporalmente el casquete antártico, permitiendo cruzar de Australia a la Antártida y de allí al extremo sur de Sudamérica."
    },
    {
      id: "hper_t01_s01_c03",
      question: "En la teoría oceánica del antropólogo francés Paul Rivet, se plantea una doble corriente migratoria transpacífica compuesta por:",
      options: [
        "Grupos fenicios y vikingos.",
        "Elementos melanésicos (a través de la corriente nor-ecuatorial) y polinésicos (llegados a la isla de Pascua y costas chilenas).",
        "Poblaciones arias y celtas por el cabo de Hornos.",
        "Navegantes chinos de la dinastía Han a las costas mexicanas."
      ],
      correctIndex: 1,
      explanation: "Rivet demostró la naturaleza polirracial del hombre americano señalando que navegantes melanésicos cruzaron el Pacífico empujados por corrientes marítimas y, posteriormente, expertos navegantes polinésicos alcanzaron Sudamérica compartiendo vocablos y la pachamanca."
    },
    {
      id: "hper_t01_s01_c04",
      question: "En el yacimiento lítico de Toquepala (Tacna), estudiado por Emilio González y Miomir Bojovich, los cazadores arcaicos plasmaron pinturas rupestres con una escena célebre que representaba:",
      options: [
        "Ritos funerarios de enterramientos múltiples con sacrificios humanos.",
        "El chaku o cacería colectiva y acorralamiento de camélidos silvestres (guanacos y vicuñas) con sentido propiciatorio mágico-religioso.",
        "La navegación en balsas de cuero de lobo marino.",
        "La adoración a la deidad felínica de los colmillos cruzados."
      ],
      correctIndex: 1,
      explanation: "Toquepala contiene las pinturas rupestres más célebres del Perú (hacia 7600 a.C.), donde hombres armados con garrotes acorralan y cazan camélidos, manifestando un pensamiento mágico-religioso para propiciar el éxito de la cacería."
    },
    {
      id: "hper_t01_s01_c05",
      question: "El yacimiento arqueológico del periodo Lítico donde el ingeniero Augusto Cárdich descubrió los primeros restos fósiles óseos humanos de la sierra peruana, acompañados de entierros deliberados y deformación craneana tubular, es:",
      options: [
        "Pacaicasa",
        "Lauricocha (Huánuco)",
        "Chivateros",
        "Paiján"
      ],
      correctIndex: 1,
      explanation: "En las cuevas de Lauricocha (Huánuco), Cárdich halló en 1959 once esqueletos humanos completos asociados a ofrendas, pintura ocre y deformaciones craneanas artificiales, constituyendo los primeros fósiles humanos datados de la sierra andina."
    },
    {
      id: "hper_t01_s01_c06",
      question: "En la costa norte peruana, los restos óseos fósiles completos más antiguos de un varón y una mujer asociados a una tradición lítica de proyectiles con pedúnculo bifacial alargado corresponden a:",
      options: [
        "Paiján (La Libertad)",
        "Chivateros (Lima)",
        "Telarmachay (Junín)",
        "Guitarrero I (Áncash)"
      ],
      correctIndex: 0,
      explanation: "Descubiertos por Claude Chauchat en La Libertad, los restos de Paiján (aprox. 8000 a.C.) son los esqueletos humanos fosilizados más antiguos conocidos del territorio peruano, caracterizados por sus finas puntas pedunculadas para la pesca y caza menor."
    },
    {
      id: "hper_t01_s01_c07",
      question: "La teoría autoctonista de Florentino Ameghino sobre el origen del hombre americano fue categóricamente descartada por la comunidad científica internacional debido a que:",
      options: [
        "Ameghino no presentó ningún fósil en los congresos de americanistas.",
        "Los estratos geológicos pampeanos donde halló los restos óseos no pertenecían a la era Terciaria sino a la Cuaternaria, y los huesos correspondían a simios y humanos modernos.",
        "Se demostró que el estrecho de Magallanes jamás estuvo congelado.",
        "Los análisis de carbono 14 revelaron que los instrumentos eran de origen incaico."
      ],
      correctIndex: 1,
      explanation: "Álex Hrdlicka demostró que el «Homus pampeanus» de Ameghino era un error estratigráfico: los terrenos geológicos de la pampa argentina eran del Holoceno/Pleistoceno tardío y los fósiles eran una mezcla de huesos de primates y humanos recientes."
    },
    {
      id: "hper_t01_s01_c08",
      question: "Durante el Periodo Lítico o Preagrícola andino, la economía de las bandas nórdicas y serranas se basaba exclusivamente en:",
      options: [
        "El trueque interregional y la navegación fluvial comercial.",
        "La depredación o subsistencia mediante la caza intensiva, la recolección estacional y la pesca marisquera.",
        "La agricultura hidráulica en andenes y el pastoreo estatal.",
        "La domesticación masiva de camélidos y el cultivo de maíz."
      ],
      correctIndex: 1,
      explanation: "El Periodo Lítico se caracterizó por una economía no productiva o parasitaria: los hombres se organizaban en bandas nómades trashumantes que subsistían de lo que la naturaleza les ofrecía directamente."
    },
    {
      id: "hper_t01_s01_c09",
      question: "El gran taller lítico de la costa central ubicado cerca de la desembocadura del río Chillón, estudiado por Edward Lanning y clasificado en fases (Zona Roja, Oquendo), se denomina:",
      options: [
        "Pacaicasa",
        "Chivateros",
        "Paiján",
        "Santo Domingo"
      ],
      correctIndex: 1,
      explanation: "Chivateros (Lima) fue interpretado por Edward Lanning como una enorme cantera y taller lítico donde se extraían y preparaban preformas y lascas de cuarcita para fabricar herramientas."
    },
    {
      id: "hper_t01_s01_c10",
      question: "La expedición científica marítima 'Kon-Tiki' realizada en 1947 por el explorador noruego Thor Heyerdahl tuvo como objetivo primordial:",
      options: [
        "Demostrar que navegantes asiáticos poblaron Groenlandia en canoas.",
        "Comprobar la viabilidad de que antiguos aborígenes peruanos pudieron navegar en balsas de totora y madera balsa impulsados por la corriente de Humboldt hasta la Polinesia.",
        "Encontrar los restos del continente mítico de la Atlántida en el mar de Drake.",
        "Cartografiar la ruta de los vikingos a Terranova."
      ],
      correctIndex: 1,
      explanation: "Thor Heyerdahl construyó una balsa rústica indígena y zarpó del Callao logrando arribar a las islas Tuamotu en la Polinesia, probando experimentalmente la factibilidad de contactos precolombinos transoceánicos."
    }
  ],

  hper_t01_s02: [
    {
      id: "hper_t01_s02_c01",
      question: "El hallazgo arqueológico realizado por Tom Dillehay en el valle del Zaña (Cajamarca), que identificó restos de calabazas cultivadas, maní y quinua con una antigüedad cercana a los 8 000 a.C., consagró como el primer horticultor del Perú y de América a:",
      options: [
        "Guitarrero II",
        "Nanchoc",
        "Santo Domingo",
        "Telarmachay"
      ],
      correctIndex: 1,
      explanation: "Las investigaciones de Dillehay en Nanchoc revolucionaron la cronología agrícola de América al documentar surcos y semillas domesticadas de calabazas del periodo Arcaico Temprano, superando a Guitarrero."
    },
    {
      id: "hper_t01_s02_c02",
      question: "En el yacimiento de Telarmachay (San Pedro de Cajas, Junín), la arqueóloga francesa Danièle Lavallée descubrió abundantes restos de huesos y restos coprológicos que evidencian:",
      options: [
        "El cultivo sistemático de la papa y el maíz morado.",
        "La domesticación temprana y el pastoreo inicial de camélidos andinos (llamas y alpacas).",
        "El primer centro ceremonial con pirámides escalonadas de adobe.",
        "La producción alfarera más antigua del altiplano."
      ],
      correctIndex: 1,
      explanation: "Telarmachay demostró la transición de la caza indiscriminada de vicuñas al control selectivo y domesticación de camélidos andinos (aparición de la alpaca y la llama) hacia el 4500 a.C."
    },
    {
      id: "hper_t01_s02_c03",
      question: "La aldea de horticultores y pescadores de Santo Domingo o Paracas (Ica), excavada por Frédéric Engel, destaca históricamente por contener:",
      options: [
        "El primer tejido polícromo de algodón con figura de cóndor.",
        "Las redes de pesca confeccionadas con fibra de cactus y la flauta de hueso más antigua de América.",
        "Los primeros canales de regadío subterráneos de la costa.",
        "Estatillas de barro cocido con rasgos de felino."
      ],
      correctIndex: 1,
      explanation: "Santo Domingo albergó a pescadores y mariscadores seminómades que empleaban redes de cactus, chozas cónicas de caña y elaboraron una flauta tubular de hueso, hito musical precerámico."
    },
    {
      id: "hper_t01_s02_c04",
      question: "La civilización de Caral, situada en el valle de Supe (Barranca) e investigada por la arqueóloga Ruth Shady, revolucionó la historiografía andina al ser catalogada como:",
      options: [
        "El primer imperio militarista expansivo del periodo Formativo.",
        "La civilización y centro urbano monumental más antiguo de América (hacia el 3 000 a.C.), contemporáneo a las pirámides de Egipto y Mesopotamia.",
        "Un campamento minero exclusivo para la fundición del cobre y bronce.",
        "El principal puerto marítimo de la cultura Chavín."
      ],
      correctIndex: 1,
      explanation: "Caral demostró que en el área norcentral peruana surgió una sociedad compleja con arquitectura pública monumental (pirámides truncas, plazas circulares hundidas), economía agrícola-pesquera y uso de quipus en pleno Arcaico Tardío precerámico."
    },
    {
      id: "hper_t01_s02_c05",
      question: "En el sitio arqueológico de Kotosh (Huánuco), investigado por Seichi Izumi y la misión arqueológica de la Universidad de Tokio, se descubrió el Templo de las Manos Cruzadas, representativo por constituir:",
      options: [
        "La escultura religiosa tridimensional sobre barro más antigua de la sierra andina.",
        "El primer observatorio astronómico solar de Sudamérica.",
        "Un taller metalúrgico dedicado al oro de aluvión.",
        "La fortaleza militar defensiva más inexpugnable del valle del Huallaga."
      ],
      correctIndex: 0,
      explanation: "En Kotosh-Fase Mito, el Templo de las Manos Cruzadas exhibe bajo un nicho relieves de arcilla que representan dos pares de antebrazos cruzados, vinculados a ritos de dualidad sagrada en torno a un fogón ceremonial central."
    },
    {
      id: "hper_t01_s02_c06",
      question: "En Huaca Prieta (Chicama, La Libertad), el arqueólogo norteamericano Junius Bird descubrió en 1946 evidencias cumbres del Arcaico Superior consistentes en:",
      options: [
        "Armas de bronce y puntas de flecha de obsidiana.",
        "El primer tejido precerámico de algodón estructurado con la imagen de un cóndor andino y mates pirograbados con rostros antropomorfos.",
        "Cerámica polícroma con asa estribo.",
        "Canales de irrigación intercuencas revestidos de piedra tallada."
      ],
      correctIndex: 1,
      explanation: "Huaca Prieta brindó el célebre tejido precerámico de algodón con la imagen de un cóndor sagrado devorando una serpiente y mates de calabaza decorados con fuego (pirograbados), demostrando el florecimiento artístico precerámico."
    },
    {
      id: "hper_t01_s02_c07",
      question: "¿Cuál es el cambio económico y social determinante que marca la transición del Periodo Lítico al Periodo Arcaico en los Andes centrales?",
      options: [
        "La invención del torno de alfarero y la rueda para el transporte.",
        "El fin de la glaciación (inicio del Holoceno), el cambio climático cálido y el paso de una economía depredadora a una economía productora de alimentos (horticultura y domesticación de camélidos).",
        "La llegada de colonizadores procedentes de Centroamérica.",
        "La desaparición del cultivo del maíz en favor de la caza masiva."
      ],
      correctIndex: 1,
      explanation: "La transición al Holoceno provocó el retiro de los glaciares, la extinción de la megafauna pleistocénica y motivó al hombre andino a experimentar con la reproducción vegetal (horticultura) y animal, naciendo las primeras aldeas sedentarias."
    },
    {
      id: "hper_t01_s02_c08",
      question: "En el sitio arqueológico de Cerro Paloma (valle de Chilca, Lima), excavado por Frédéric Engel, se descubrió una estructura cuadrangular de piedra semienterrada que es considerada:",
      options: [
        "El primer palacio imperial de la costa peruana.",
        "Uno de los primeros recintos arquitectónicos de uso público o comunal comunal sedentario de América (hacia el 4 000 a.C.).",
        "El almacén de granos más grande del periodo Arcaico.",
        "Un cementerio aristocrático con sarcófagos de madera."
      ],
      correctIndex: 1,
      explanation: "Cerro Paloma presenta un edificio comunal de piedra unida con barro que no sirvió de vivienda particular, sino como espacio de asamblea o ceremonia pública, marcando el origen de la arquitectura pública en el Perú."
    },
    {
      id: "hper_t01_s02_c09",
      question: "La cueva de Piquimachay (Ayacucho), en su fase posterior excavada por Richard MacNeish, evidenció los primeros testimonios de domesticación andina de:",
      options: [
        "Perros sin pelo del Perú",
        "Cuyes (conejillos de indias)",
        "Pavos y patos silvestres",
        "Vicuñas y vizcachas"
      ],
      correctIndex: 1,
      explanation: "En Piquimachay II (fase Jaywamachay y Cachi), MacNeish encontró corralillos y abundantes huesos de cuyes domesticados, consagrando al hombre de Piquimachay como el primer domesticador de cuyes del Perú antiguo."
    },
    {
      id: "hper_t01_s02_c10",
      question: "¿Qué artefacto nemotécnico milenario, atribuido tradicionalmente solo a los incas, fue descubierto por Ruth Shady en los recintos sagrados de Caral confirmando su antigüedad de 5 000 años?",
      options: [
        "El ábaco yupana de piedra",
        "El quipu de cuerdas anudadas de algodón",
        "Las tablas de Sarhua decoradas",
        "Los queros de madera polícroma"
      ],
      correctIndex: 1,
      explanation: "Ruth Shady desenterró en el edificio piramidal de La Galería de Caral un quipu primitivo de cuerdas de algodón y atados de fibra, demostrando que el sistema de registro por nudos nació en el Arcaico Tardío precerámico."
    }
  ],

  // Semana 02
  hper_t02_s01: [
    {
      id: "hper_t02_s01_c01",
      question: "En la periodización de la historia prehispánica formulada por el arqueólogo norteamericano John Rowe, el concepto de 'Horizonte Cultural' se define formalmente como:",
      options: [
        "Un periodo de aislamiento y desarrollo exclusivo de estilos artísticos locales y regionales.",
        "Un periodo de unificación cultural Panandina caracterizado por la expansión e influencia homogénea de un estilo artístico y religioso en múltiples regiones.",
        "La fase de decadencia y despoblamiento tras catástrofes climáticas.",
        "El surgimiento exclusivo de confederaciones militares en la selva alta."
      ],
      correctIndex: 1,
      explanation: "John Rowe basó su cronología en la cerámica de Ica y definió los Horizontes (Temprano, Medio, Tardío) como fases de integración macro-regional Panandina donde un mismo patrón estético y de culto predomina sobre vastos territorios."
    },
    {
      id: "hper_t02_s01_c02",
      question: "El arqueólogo peruano Julio César Tello postuló la teoría autoctonista del origen de la alta cultura andina, afirmando categóricamente que la 'cultura matriz' del Perú fue:",
      options: [
        "Moche, originada en los valles de Moche y Chicama.",
        "Chavín, cuyo origen cultural se encontraría en la etnia Arawak procedente de la cuenca amazónica.",
        "Tiahuanaco, por el dominio del altiplano colla.",
        "Chimú, por la monumentalidad urbana de Chan Chan."
      ],
      correctIndex: 1,
      explanation: "Tello demostró que la civilización andina no provino de Centroamérica (como sostenía Max Uhle), sino que floreció endógenamente en los Andes, situando en Chavín la cultura matriz, cuya iconografía selvática (jaguar, anaconda, caimán) revelaba raíces amazónicas arawak."
    },
    {
      id: "hper_t02_s01_c03",
      question: "En el Templo de Chavín de Huántar (Áncash), el monolito subterráneo en forma de gigantesca hoja de laurel o cuchillo de piedra que representa al dios de las profundidades con colmillos de felino y cabellos de serpientes es:",
      options: [
        "La Estela de Raimondi",
        "El Lanzón Monolítico",
        "El Obelisco Tello",
        "La Cabeza Clava claudicante"
      ],
      correctIndex: 1,
      explanation: "El Lanzón Monolítico (de más de 4 metros de altura) se erige en el corazón de las galerías subterráneas del Templo Viejo de Chavín, personificando a la suprema deidad antropomorfa con atributos de jaguar y ofidios."
    },
    {
      id: "hper_t02_s01_c04",
      question: "La cultura Paracas fue dividida por Julio C. Tello y Toribio Mejía Xesspe en dos periodos distintivos (Cavernas y Necrópolis) tomando como criterio arqueológico fundamental:",
      options: [
        "La técnica de fundición del bronce arsenical.",
        "La forma de enterramiento de sus tumbas y los patrones estilísticos y cromáticos de sus tejidos y ceramios.",
        "El trazado urbanístico de sus palacios fortificados.",
        "La sustitución del cultivo del algodón por el maíz dulce."
      ],
      correctIndex: 1,
      explanation: "Tello diferenció Paracas Cavernas (tumbas en forma de copa invertida o botella, fuerte influencia Chavín y cerámica postcocción polícroma) de Paracas Necrópolis (cementerios rectangulares colectivos subterráneos, mantos polícromos finísimos y cerámica precocción monócroma)."
    },
    {
      id: "hper_t02_s01_c05",
      question: "Las extraordinarias intervenciones quirúrgicas craneanas practicadas con pericia por los médicos de Paracas Cavernas, destinadas a sanar heridas de guerra o descompresión craneal mediante cuchillos de obsidiana (tumi), se denominan:",
      options: [
        "Trepanaciones craneanas",
        "Deformaciones tubulares",
        "Momificaciones de fardo",
        "Incrustaciones dentales"
      ],
      correctIndex: 0,
      explanation: "Las trepanaciones craneanas en Paracas consistían en perforar o aserrar el hueso craneal dañado para extraer astillas, recubriendo la herida con placas de oro o calabaza; los cráneos con callo óseo confirman la supervivencia de los pacientes."
    },
    {
      id: "hper_t02_s01_c06",
      question: "La tumba real del Señor de Sipán, descubierta en 1987 por el arqueólogo Walter Alva en Huaca Rajada (Lambayeque), demostró la cumbre alcanzada por la cultura Moche en el campo de:",
      options: [
        "La ingeniería lítica de templos megalíticos.",
        "La orfebrería y metalurgia avanzada (técnicas de aleación como la tumbaga o dorado electrolítico de cobre y oro).",
        "La escultura en piedra pulida monócroma.",
        "La confección de tapices de plumas de flamencos."
      ],
      correctIndex: 1,
      explanation: "El Señor de Sipán deslumbró al mundo por el fastuoso ajuar funerario de orejeras de oro con turquesas, pectorales, collares de maníes de oro y plata y cetros ceremoniales, demostrando que los moche dominaron complejas técnicas metalúrgicas preincaicas."
    },
    {
      id: "hper_t02_s01_c07",
      question: "La cerámica Mochica es unánimemente admirada por su carácter bícromo (crema y ocre) y su sobresaliente maestría en la elaboración de ceramios escultóricos conocidos como:",
      options: [
        "Huacos retratos y huacos patológicos",
        "Vasos silbadores dobles",
        "Keros ceremoniales de madera",
        "Aríbalos globulares"
      ],
      correctIndex: 0,
      explanation: "Los alfareros moche plasmaron con realismo insuperable expresiones anímicas (alegría, dolor, serenidad) en los 'huacos retratos' y enfermedades congénitas o leishmaniasis en los 'huacos patológicos'."
    },
    {
      id: "hper_t02_s01_c08",
      question: "En la iconografía de la cerámica Nazca, el rasgo estilístico consistente en no dejar ningún espacio de la vasija sin pintar o cubrir de motivos polícromos se denomina técnicamente:",
      options: [
        "Perspectiva invertida",
        "Horror al vacío (horror vacui)",
        "Bicromía geométrica",
        "Vidriado plumbífero"
      ],
      correctIndex: 1,
      explanation: "Los ceramistas nazca destacaron como los mejores pintores del Perú antiguo: utilizaron hasta 11 a 16 colores minerales aplicados antes de la cocción (precocción) y saturaron toda la superficie del ceramio ('horror al vacío')."
    },
    {
      id: "hper_t02_s01_c09",
      question: "Los geoglifos o líneas trazadas en las pampas de Jumana y San José en Nazca, descubiertos por Toribio Mejía Xesspe e investigados tenazmente por la matemática alemana María Reiche, fueron interpretados por esta última como:",
      options: [
        "Caminos sagrados de peregrinación militar.",
        "Un gigantesco calendario astronómico y agrícola vinculado al curso de las constelaciones y los solsticios.",
        "Campos de aterrizaje para dioses extraterrestres.",
        "Canales superficiales de desagüe pluvial."
      ],
      correctIndex: 1,
      explanation: "María Reiche dedicó su vida a medir y proteger las figuras (el colibrí, el mono, la araña), concluyendo que constituían un gigantesco calendario astronómico que marcaba la llegada del agua y los ciclos agrícolas."
    },
    {
      id: "hper_t02_s01_c10",
      question: "Para superar la extrema aridez del desierto costeño de Ica, los ingenieros de la cultura Nazca construyeron una prodigiosa red de obras hidráulicas denominadas:",
      options: [
        "Andenes colgantes",
        "Galerías filtrantes o acueductos subterráneos (puquios) con ojos u espirales de ventilación",
        "Camellones o waru waru",
        "Represas de altitud en lagunas glaciares"
      ],
      correctIndex: 1,
      explanation: "Los acueductos subterráneos de Cantalloc y otros puquios nazca captaban las aguas del manto freático subterráneo y las conducían por zanjas subterráneas revestidas de piedra de canto rodado hasta cochas de regadío."
    }
  ],

  hper_t02_s02: [
    {
      id: "hper_t02_s02_c01",
      question: "En el Altiplano del Collao, la civilización de Tiahuanaco logró superar las severas heladas y condiciones extremas de la meseta mediante la técnica agrícola consistente en camellones o campos elevados de cultivo rodeados de canales de agua, conocida como:",
      options: [
        "Andenes escalonados",
        "Waru waru",
        "Huasipungos",
        "Pozas de lixiviación"
      ],
      correctIndex: 1,
      explanation: "Los waru waru o camellones acumulaban agua durante el día que absorbía la radiación solar; por la noche, liberaban ese calor acumulado atenuando las heladas nocturnas que destruían los sembríos de papa y quinua."
    },
    {
      id: "hper_t02_s02_c02",
      question: "El modelo económico formulado por el etnohistoriador John Murra para explicar cómo los pobladores de Tiahuanaco accedían a recursos de diversos pisos ecológicos sin necesidad de comercio se denomina:",
      options: [
        "Economía de mercado centralizado",
        "Control vertical de un máximo de pisos ecológicos (o archipiélago ecológico)",
        "Monopolio de enclaves tributarios marítimos",
        "Sistema de haciendas señoriales"
      ],
      correctIndex: 1,
      explanation: "Tiahuanaco enviaba colonias de mitmas a distintos pisos altitudinales (la costa para ají, guano y maíz; la selva alta para coca y madera; la puna para camélidos), manteniendo el control directo de islas de recursos sin intermediarios."
    },
    {
      id: "hper_t02_s02_c03",
      question: "En la Portada del Sol del complejo monumental de Tiwanaku, la deidad central esculpida en alto relieve sosteniendo dos báculos y con rayos que rematan en cabezas de cóndores es:",
      options: [
        "El Dios Jaguar de Chavín",
        "El Dios de las Varas (o Wiracocha / Dios Llorón)",
        "Ai Apaec el Degollador",
        "Pachacámac"
      ],
      correctIndex: 1,
      explanation: "Wiracocha o el Dios de los Báculos es la divinidad suprema del Altiplano, representado con lágrimas en los ojos que caen por sus mejillas y un tocado radiante, figura que luego fue adoptada y difundida por el Imperio Wari."
    },
    {
      id: "hper_t02_s02_c04",
      question: "El arqueólogo peruano Luis Guillermo Lumbreras identificó a Wari (600 - 1000 d.C.) como el Primer Imperio Andino, surgido en Ayacucho a partir de la síntesis cultural de:",
      options: [
        "Chavín, Paracas y Vicús",
        "Huarpa (base local ayacuchana), Nazca (patrón artesanal y color) y Tiahuanaco (religión y dios de los báculos)",
        "Moche, Lambayeque y Cajamarca",
        "Chanca, Huanca y Chachapoyas"
      ],
      correctIndex: 1,
      explanation: "Lumbreras demostró que Wari nació de la síntesis de la cultura local Huarpa con la influencia estilística nazquense y la ideología religiosa de Tiahuanaco, constituyendo el primer Estado imperial centralizado y planificador de los Andes."
    },
    {
      id: "hper_t02_s02_c05",
      question: "La estrategia urbanística y administrativa fundamental mediante la cual el Imperio Wari consolidó el control y explotación de sus provincias conquistadas fue la creación de:",
      options: [
        "Misiones religiosas franciscanas itinerantes.",
        "Centros urbanos planificados o ciudades cabeceras de región (como Piquillacta en Cusco, Huiracochapampa en Huamachuco y Cajamarquilla en Lima).",
        "Monasterios aislados para vírgenes del Sol.",
        "Guarniciones militares fronterizas compuestas por mercenarios selváticos."
      ],
      correctIndex: 1,
      explanation: "Wari dominó mediante una red urbana ortogonal amurallada: las cabeceras de región centralizaban el tributo comarcano, albergaban talleres textiles y se articulaban a la capital Viñaque mediante una monumental red vial precursora del Cápac Ñan."
    },
    {
      id: "hper_t02_s02_c06",
      question: "La capital del reino Chimú (Costa Norte), considerada la ciudad de barro más grande de América precolombina y declarada Patrimonio de la Humanidad, es:",
      options: [
        "Viñaque",
        "Chan Chan",
        "Kuelap",
        "Pachacámac"
      ],
      correctIndex: 1,
      explanation: "Chan Chan (Trujillo) abarcó más de 20 km² con diez ciudadelas o palacios amurallados de adobe decorados con frisos geométricos y marinos, sirviendo de sede a la dinastía reinante de los Chimú Cápac."
    },
    {
      id: "hper_t02_s02_c07",
      question: "El mítico fundador civilizador que arribó por mar en una flota de balsas al valle de Moche e instauró la primera dinastía del reino Chimú fue:",
      options: [
        "Naylamp",
        "Tacaynamo",
        "Minchancaman",
        "Pachacútec"
      ],
      correctIndex: 1,
      explanation: "Según la tradición oral costeña, Tacaynamo llegó por el océano Pacífico con plumas y vestiduras ceremoniales para gobernar el valle de Chimor; su bisnieto Minchancaman fue el último emperador, derrotado por los incas."
    },
    {
      id: "hper_t02_s02_c08",
      question: "El famoso cuchillo ceremonial de oro semilunar con incrustaciones de turquesas que representa al dios Naylamp, símbolo cumbre de la orfebrería de la cultura Lambayeque o Sicán (frecuentemente atribuido a Chimú), se denomina:",
      options: [
        "Aríbalo",
        "Tumi de Íllimo",
        "Kero imperial",
        "Pectoral de Chavín"
      ],
      correctIndex: 1,
      explanation: "El Tumi de Íllimo o Tumi de Sicán (hallado en la Huaca Las Ventanas de Lambayeque) representa a Naylamp con ojos alados y corona enjoyada, joya maestra de la metalurgia en oro de la costa norte."
    },
    {
      id: "hper_t02_s02_c09",
      question: "Los comerciantes de la cultura Chincha (Intermedio Tardío) destacaron en el mundo andino prehispánico por controlar:",
      options: [
        "El monopolio de la sal gema en la sierra central.",
        "Un vasto circuito de intercambio mercantil marítimo y terrestre mediante balsas a vela hacia el Ecuador (en busca de conchas spondylus o mullu) y caravanas de llamas hacia el Altiplano.",
        "La navegación transoceánica hacia Oceanía y la Polinesia.",
        "La producción exclusiva de armas de hierro fundido."
      ],
      correctIndex: 1,
      explanation: "Chincha fue una potencia comercial: sus expertos navegantes surcaban el mar hacia Puerto Viejo (Ecuador) para trocar cobre y telas por el sagrado mullu (concha spondylus), al tiempo que sus caravanas comerciaban charqui y oro en el Collao."
    },
    {
      id: "hper_t02_s02_c10",
      question: "Las colosales torres funerarias de piedra pulida edificadas por los reinos aymaras (Collas y Lupacas) en las orillas del lago Umayo (Puno) para sepultar a sus mallkus o nobles se denominan:",
      options: [
        "Ushnus",
        "Chulpas (de Sillustani)",
        "Tambos",
        "Huacas"
      ],
      correctIndex: 1,
      explanation: "Las chulpas de Sillustani son imponentes monumentos cilíndricos funerarios de sillería andina donde los jerarcas aymaras eran inhumados en cuclillas mirando hacia la salida del sol, rodeados de ofrendas mortuorias."
    }
  ],

  // Semana 03
  hper_t03_s01: [
    {
      id: "hper_t03_s01_c01",
      question: "El mito andino de los Hermanos Ayar, que explica el origen sagrado del Cusco y la fundación de la dinastía incaica a través de la pacarina de Pacaritambo, fue recogido por el cronista español:",
      options: [
        "Inca Garcilaso de la Vega en sus Comentarios Reales.",
        "Juan de Betanzos en Suma y Narración de los Incas.",
        "Pedro Cieza de León en Crónica del Perú.",
        "Felipe Guamán Poma de Ayala en Nueva Corónica y Buen Gobierno."
      ],
      correctIndex: 1,
      explanation: "Juan de Betanzos, quien dominaba el quechua por estar casado con Cusi Rimay Ocllo (doña Angelina Yupanque, viuda de Atahualpa), recogió de primera mano la versión cusqueña del mito de los cuatro hermanos Ayar que emergieron del cerro Tamputoco."
    },
    {
      id: "hper_t03_s01_c02",
      question: "El hecho histórico decisivo que marca la transformación de la etnia cusqueña en el gran Imperio del Tawantinsuyu (inicio del periodo imperial) fue:",
      options: [
        "La llegada de los conquistadores españoles a Tumbes.",
        "La aplastante victoria militar del príncipe Cusi Yupanqui sobre los invasores Chancas en la batalla de Yahuar Pampa (1438).",
        "La anexión pacífica de la confederación de los Chinchas.",
        "El traslado de la capital incaica a la ciudadela de Tumibamba."
      ],
      correctIndex: 1,
      explanation: "Cuando el anciano inca Huiracocha y su hijo Urco huyeron del Cusco ante la invasión Chanca, el príncipe Cusi Yupanqui organizó la resistencia con apoyo de los pueblos vecinos (el mito de los soldados de piedra o pururaucas), venció a los chancas y asumió el nombre de Pachacútec («el que renueva el mundo»)."
    },
    {
      id: "hper_t03_s01_c03",
      question: "Pachacútec es considerado el más genial organizador y estadista del Estado incaico debido a que realizó trascendentales reformas como:",
      options: [
        "La destrucción de los andenes y la prohibición del quechua.",
        "La división del imperio en cuatro suyos, la reconstrucción del Cusco con forma de puma, la edificación del Coricancha y la implantación del sistema de mitimaes y del runasimi como lengua oficial.",
        "La creación de una monarquía parlamentaria bicameral.",
        "La acuñación de monedas de plata grabadas con el rostro del Sol."
      ],
      correctIndex: 1,
      explanation: "Pachacútec reorganizó el Tawantinsuyu: consolidó el culto solar en el Coricancha, canalizó los ríos Huatanay y Tullumayo, instauró el sistema de chasquis y chasquihuasis e impulsó la construcción de Machu Picchu y Sacsayhuamán."
    },
    {
      id: "hper_t03_s01_c04",
      question: "El gobernante inca conocido como el «Alejandro Magno del Nuevo Mundo» debido a que protagonizó la mayor expansión militar conquistando el reino Chimú, la costa central y llegando hasta el río Maule en Chile fue:",
      options: [
        "Pachacútec",
        "Túpac Inca Yupanqui",
        "Huayna Cápac",
        "Atahualpa"
      ],
      correctIndex: 1,
      explanation: "Túpac Inca Yupanqui, primero como Auqui de su padre Pachacútec y luego como Sapa Inca, expandió las fronteras del imperio por el norte (Quito), la costa (sometió al Chimú Cápac) y por el sur hasta el centro de Chile, realizando además una audaz expedición marítima hacia islas de la Polinesia."
    },
    {
      id: "hper_t03_s01_c05",
      question: "La monumental red vial empedrada del Imperio Incaico que integraba valles, costas, punas y ceja de selva a lo largo de miles de kilómetros facilitando el transporte militar y de tributos se denominaba:",
      options: [
        "Ruta de la Plata",
        "Cápac Ñan (Camino Real del Inca)",
        "Camino de los Chankas",
        "Vía sacra del Coricancha"
      ],
      correctIndex: 1,
      explanation: "El Cápac Ñan fue una proeza de ingeniería vial que superaba los 30 000 kilómetros con puentes colgantes de fibra de ichu, tambos o albergues camineros y calzadas empedradas por donde transitaban los mensajeros chasquis y los ejércitos."
    },
    {
      id: "hper_t03_s01_c06",
      question: "En la estructura administrativa incaica, el funcionario de confianza directa del Sapa Inca que viajaba en secreto inspeccionando las provincias, aplicando justicia y supervisando a los curacas bajo el lema «el que todo lo ve», era el:",
      options: [
        "Apunchic",
        "Tucuy Ricuc",
        "Curaca",
        "Pureq"
      ],
      correctIndex: 1,
      explanation: "El Tucuy Ricuc («el que todo lo ve») era un veedor o visitador imperial con facultades penales (taripa camayoc) y matrimoniales (huarmicoco), que reportaba de forma secreta e inapelable el cumplimiento de los mandatos estatales."
    },
    {
      id: "hper_t03_s01_c07",
      question: "El curaca (o cacique en la denominación colonial española) cumplía un rol geopolítico estratégico en el mundo andino porque:",
      options: [
        "Era un militar extranjero nombrado por los reyes de España.",
        "Actuaba como nexo o bisagra entre el poder central imperial del Cusco y la comunidad del ayllu, gestionando la entrega de fuerza de trabajo (mita) a cambio de dádivas y reciprocidad.",
        "Se encargaba exclusivamente de pintar los queros ceremoniales.",
        "Lideraba el culto religioso monoteísta en las huacas de la costa."
      ],
      correctIndex: 1,
      explanation: "El curaca era la máxima autoridad tradicional del ayllu; el Sapa Inca no le despojaba de su autoridad local, sino que lo agasajaba y casaba con princesas cusqueñas para garantizar que el curaca movilizara la mano de obra de sus comuneros."
    },
    {
      id: "hper_t03_s01_c08",
      question: "La crisis terminal del Tawantinsuyu que facilitó la invasión de las huestes de Francisco Pizarro en 1532 estuvo desencadenada estructuralmente por:",
      options: [
        "Un terremoto que destruyó la fortaleza de Sacsayhuamán.",
        "La repentina muerte del inca Huayna Cápac y de su sucesor Ninan Cuyuchi por una peste de viruela, lo que desató la cruenta guerra civil de sucesión entre las panacas de Huáscar (Cusco) y Atahualpa (Quito).",
        "La renuncia voluntaria de la nobleza cusqueña al control de la tierra.",
        "El alzamiento victorioso de los pueblos sometidos guiados por caballos de guerra."
      ],
      correctIndex: 1,
      explanation: "La viruela, propagada desde Centroamérica antes de la llegada física de Pizarro, causó la muerte de Huayna Cápac y su heredero legítimo, quebrando la estabilidad del imperio y enfrentando a muerte a la nobleza tradicional cusqueña de Huáscar contra el ejército veterano norteño de Atahualpa."
    },
    {
      id: "hper_t03_s01_c09",
      question: "La institución sociopolítica cusqueña encargada de custodiar la momia (mallqui) del Sapa Inca difunto, administrar sus inmensas tierras y conservar la memoria de sus hazañas militares era:",
      options: [
        "El Camachic",
        "La Panaca real",
        "El Ayllu llactaruna",
        "El Huamani"
      ],
      correctIndex: 1,
      explanation: "Cada inca fundaba su propia panaca o linaje familiar integrado por sus descendientes (salvo el Auqui que heredaba el trono y formaba su propia panaca). La panaca conservaba las riquezas y tierras acumuladas por el inca, rivalizando ferozmente entre sí."
    },
    {
      id: "hper_t03_s01_c10",
      question: "En la jerarquía política incaica, el príncipe heredero que aprendía el arte del gobierno mediante el correinado antes de ceñirse la mascapaicha roja era denominado:",
      options: [
        "Apunchic",
        "Auqui",
        "Chasqui",
        "Sinchi"
      ],
      correctIndex: 1,
      explanation: "El Auqui (generalmente distinguido por una mascapaicha amarilla) cogobernaba con su padre para demostrar capacidad militar y liderazgo administrativo, asegurando una sucesión no traumática del mando supremo."
    }
  ],

  hper_t03_s02: [
    {
      id: "hper_t03_s02_c01",
      question: "Los dos principios rectores que articularon el funcionamiento del sistema económico en el Tawantinsuyu fueron:",
      options: [
        "El libre mercado y la usura financiera.",
        "La reciprocidad (simétrica y asimétrica) y la redistribución estatal.",
        "El feudalismo hereditario y el trabajo asalariado en moneda.",
        "La esclavitud masiva de prisioneros de guerra en plantaciones."
      ],
      correctIndex: 1,
      explanation: "En ausencia de moneda y mercado, la reciprocidad normaba el intercambio de ayuda mutua entre miembros del ayllu («hoy por ti, mañana por mí»), mientras que la redistribución permitía al Estado almacenar excedentes tributarios en colcas y repartirlos en épocas de sequía o necesidad."
    },
    {
      id: "hper_t03_s02_c02",
      question: "En el mundo andino incaico, la forma de trabajo solidario y de ayuda mutua recíproca entre los miembros de una misma familia o ayllu para labrar sus tierras o construir sus viviendas se denominaba:",
      options: [
        "Mita",
        "Ayni",
        "Minka",
        "Chunca"
      ],
      correctIndex: 1,
      explanation: "El ayni consistía en la ayuda prestada entre familias nucleares con el compromiso de que quien recibía la ayuda la devolvería en condiciones semejantes cuando el otro lo necesitara."
    },
    {
      id: "hper_t03_s02_c03",
      question: "La minka (o minga) se diferenciaba del ayni fundamentalmente porque constituía un trabajo colectivo festivo destinado a:",
      options: [
        "La explotación de yacimientos mineros de mercurio.",
        "El beneficio común del ayllu (como limpiar canales comunales) o el cultivo de las tierras del Sol y del Inca.",
        "El servicio doméstico forzado en la casa del corregidor.",
        "La leva forzosa de soldados para conquistar la selva."
      ],
      correctIndex: 1,
      explanation: "La minka convocaba a todos los comuneros del ayllu para obras comunitarias de utilidad colectiva o para trabajar las tierras sagradas del Sol y del Inca en un clima festivo con música, chicha y comida ofrecida por los beneficiarios."
    },
    {
      id: "hper_t03_s02_c04",
      question: "La forma de trabajo obligatoria, rotativa y por turnos que los varones adultos del ayllu (hatun runas de 18 a 50 años) debían entregar al Estado imperial para construir calzadas, fortalezas, templos o servir en el ejército se denominaba:",
      options: [
        "Ayni",
        "Mita",
        "Chunca",
        "Yanaconaje"
      ],
      correctIndex: 1,
      explanation: "La mita incaica era el tributo supremo al Estado: no se pagaba con productos manufacturados ni cosechas, sino con la energía humana y tiempo de trabajo organizado rigurosamente por turnos para la construcción pública y el ejército."
    },
    {
      id: "hper_t03_s02_c05",
      question: "El sistema de trabajo solidario de auxilio rápido movilizado exclusivamente en situaciones de emergencia comunal extrema (como huaicos, derrumbes o terremotos) recibía el nombre de:",
      options: [
        "Ayni",
        "Chunca",
        "Mita minera",
        "Mitma"
      ],
      correctIndex: 1,
      explanation: "La chunca era un sistema de auxilio organizado por cuadrillas (compuestas muchas veces por mujeres) para atender catástrofes naturales, socorrer heridos y reconstruir acequias arrasadas."
    },
    {
      id: "hper_t03_s02_c06",
      question: "En la distribución incaica de la tierra, la parcela de cultivo asignada anualmente a cada padre de familia del ayllu para garantizar su subsistencia se denominaba topo, cuya medida era aproximadamente:",
      options: [
        "Un topo para el varón y medio topo para cada hija mujer.",
        "Tres topos por matrimonio sin importar los hijos.",
        "Un topo para el curaca y diez para el hatun runa.",
        "La mitad de una hectárea fija delimitada por alambrados."
      ],
      correctIndex: 0,
      explanation: "El topo era una medida variable de superficie agrícola suficiente para alimentar a una persona durante un año; al nacer un varón se asignaba a la familia un topo adicional, y medio topo al nacer una mujer."
    },
    {
      id: "hper_t03_s02_c07",
      question: "Las colcas estatales en el Imperio Incaico cumplían una función socioeconómica decisiva consistente en:",
      options: [
        "Ser centros de detención punitiva para criminales reincidentes.",
        "Grandes almacenes y depósitos situados en las laderas ventiladas de los cerros para preservar excedentes de alimentos deshidratados (chuño, charqui), ropa y armas con fines de previsión y redistribución.",
        "Monopolios comerciales privados de la nobleza de privilegio.",
        "Templos subterráneos destinados a oráculos de ultratumba."
      ],
      correctIndex: 1,
      explanation: "Las colcas aprovechaban las corrientes de aire fresco de las laderas para conservar por años maíz, chuño y charqui, asegurando la supervivencia del imperio frente a sequías y abasteciendo a las tropas en marcha."
    },
    {
      id: "hper_t03_s02_c08",
      question: "Los mitimaes (o mitmas) eran poblaciones enteras trasladadas voluntaria o forzosamente de su región de origen hacia otras provincias con el propósito de:",
      options: [
        "Venderlas como esclavas en mercados costeños.",
        "Colonizar zonas deshabitadas, enseñar el quechua y las costumbres imperiales, y garantizar la pacificación militar y política de pueblos recién conquistados.",
        "Aislar a los leprosos y enfermos de viruela.",
        "Construir exclusivamente embarcaciones de totora."
      ],
      correctIndex: 1,
      explanation: "Los mitimaes fueron un formidable instrumento de cohesión estatal: etnias leales al Cusco eran asentadas en zonas rebeldes para pacificarlas e inculcar la cultura incaica, mientras que grupos insumisos eran dispersados para quebrar su capacidad de rebeldía."
    },
    {
      id: "hper_t03_s02_c09",
      question: "Dentro de la estructura social andina, los yanaconas o yanas se diferenciaban de los hatun runas comunes porque:",
      options: [
        "Eran sacerdotes de alto rango en el templo de la Luna.",
        "Eran personas desvinculadas de su ayllu y de la reciprocidad comunal, dedicadas al servicio perpetuo y exclusivo de la nobleza o del Estado incaico.",
        "Gozaban de propiedades privadas inalienables.",
        "Pertenecían a la estirpe consanguínea de los fundadores míticos."
      ],
      correctIndex: 1,
      explanation: "Los yanaconas perdían su membresía en el ayllu comunal de origen; su condición era hereditaria y pasaban a depender directamente del Sapa Inca o de nobles a quienes el soberano los asignaba como sirvientes."
    },
    {
      id: "hper_t03_s02_c10",
      question: "Las mujeres escogidas por su belleza, habilidad textil o linaje para ser educadas en los Acllahuasis del imperio bajo la tutela de las mamaconas se denominaban:",
      options: [
        "Pallas",
        "Acllas",
        "Coyas",
        "Ñustas"
      ],
      correctIndex: 1,
      explanation: "Las acllas confeccionaban los finísimos tejidos de cumbi y la chicha para las fiestas del Sol; algunas eran consagradas al culto religioso perpetuo como sacerdotisas y otras eran entregadas por el inca como esposas a curacas y militares distinguidos."
    }
  ],

  // Semana 04
  hper_t04_s01: [
    {
      id: "hper_t04_s01_c01",
      question: "El documento jurídico firmado en julio de 1529 entre Francisco Pizarro y la reina Isabel de Portugal en nombre de la Corona española, que autorizó formalmente la invasión y gobernación de Nueva Castilla, fue:",
      options: [
        "El Tratado de Tordesillas",
        "La Capitulación de Toledo",
        "Las Leyes Nuevas de Indias",
        "La Capitulación de Santa Fe"
      ],
      correctIndex: 1,
      explanation: "La Capitulación de Toledo otorgó a Pizarro el título de Adelantado, Gobernador, Alguacil Mayor y Capitán General con un elevadísimo sueldo, desatando la temprana envidia y resentimiento de su socio Diego de Almagro."
    },
    {
      id: "hper_t04_s01_c02",
      question: "En la emboscada de Cajamarca del 16 de noviembre de 1532, el sacerdote dominico que leyó el formalismo jurídico y religioso del 'Requerimiento' conminando a Atahualpa a someterse al papa y al rey Carlos I fue:",
      options: [
        "Fray Bartolomé de las Casas",
        "Fray Vicente de Valverde",
        "Fray Toribio de Mogrovejo",
        "Fray Jerónimo de Loayza"
      ],
      correctIndex: 1,
      explanation: "Valverde se acercó al inca con una biblia y una cruz recitando el Requerimiento; cuando Atahualpa arrojó el libro al no escuchar voz alguna de sus hojas, el fraile dio la señal a Pizarro gritando: «¡Santiago y a ellos!»."
    },
    {
      id: "hper_t04_s01_c03",
      question: "En 1536, el inca que inició la gran rebelión de resistencia andina sitiando el Cusco y enviando a su general Kisu Yupanqui a sitiar Lima para expulsar a los españoles fue:",
      options: [
        "Túpac Hualpa (Toparpa)",
        "Manco Inca",
        "Calcuchímac",
        "Sayri Túpac"
      ],
      correctIndex: 1,
      explanation: "Manco Inca, inicialmente coronado por Pizarro, comprendió la crueldad de los conquistadores, huyó con el pretexto de traer una estatua de oro y movilizó a miles de guerreros cercando el Cusco por meses y atacando Lima."
    },
    {
      id: "hper_t04_s01_c04",
      question: "Tras la toma del baluarte de Sacsayhuamán por los españoles, el mítico general inca que prefirió arrojarse al vacío desde lo alto del torreón de Muyucmarca antes que rendirse al enemigo fue:",
      options: [
        "Quizquiz",
        "Cahuide (Kullash o Titu Cusi Huallpa)",
        "Rumiñahui",
        "Taulichusco"
      ],
      correctIndex: 1,
      explanation: "Cahuide defendió con bravura indomable el torreón armado con armas incas y espadas de acero quitadas a los invasores; al ver perdida la posición, se arrojó envuelto en su manta para no caer prisionero."
    },
    {
      id: "hper_t04_s01_c05",
      question: "La dinastía de los 'Incas de Vilcabamba' mantuvo un Estado andino rebelde y clandestino en la ceja de selva del Cusco durante casi cuatro décadas (1536 - 1572), culminando cuando el virrey Toledo ordenó la captura y decapitación de:",
      options: [
        "Sayri Túpac",
        "Titu Cusi Yupanqui",
        "Túpac Amaru I",
        "Manco Inca"
      ],
      correctIndex: 2,
      explanation: "Túpac Amaru I fue el último inca de Vilcabamba; capturado por García de Loyola, fue decapitado públicamente en la Plaza de Armas del Cusco en 1572 por mandato inflexible del virrey Francisco de Toledo, naciendo el mito del Inkarri."
    },
    {
      id: "hper_t04_s01_c06",
      question: "La causa detonante fundamental de la Guerra de las Salinas (1538) entre los conquistadores pizarristas y almagristas fue:",
      options: [
        "El cobro del tributo del quinto real de los tesoros de Pachacámac.",
        "La posesión de la rica e histórica ciudad imperial del Cusco, reclamada por Almagro dentro de su gobernación de Nueva Toledo.",
        "La sublevación de los indígenas de Chachapoyas.",
        "La negativa de Pizarro a reconocer a Hernando de Luque como obispo."
      ],
      correctIndex: 1,
      explanation: "La imprecisión en los límites fijados por las capitulaciones reales desató la disputa por el Cusco; en las Salinas (Cusco), Hernando Pizarro derrotó a Diego de Almagro el Viejo y lo ejecutó en el garrote vil."
    },
    {
      id: "hper_t04_s01_c07",
      question: "En la batalla de Chupas (1542, Ayacucho), el gobernador enviado por la Corona española, Cristóbal Vaca de Castro, derrotó y mandó decapitar a:",
      options: [
        "Hernando Pizarro",
        "Diego de Almagro el Mozo",
        "Gonzalo Pizarro",
        "Francisco de Carvajal"
      ],
      correctIndex: 1,
      explanation: "Almagro el Mozo, cuyos partidarios habían asesinado a Francisco Pizarro en Lima en 1541, fue vencido por las tropas leales a la Corona comandadas por Vaca de Castro, poniendo fin al efímero gobierno almagrista."
    },
    {
      id: "hper_t04_s01_c08",
      question: "La Rebelión de los Grandes Encomenderos (1544 - 1548) liderada por Gonzalo Pizarro y su estratega militar Francisco de Carvajal ('el Demonio de los Andes') se sublevó contra:",
      options: [
        "La Capitulación de Toledo.",
        "La promulgación de las Leyes Nuevas de 1542 dictadas por Carlos I, que creaban el Virreinato del Perú y suprimían la perpetuidad de las encomiendas.",
        "La llegada de los sacerdotes jesuitas al Perú.",
        "La fundación de la Universidad de San Marcos."
      ],
      correctIndex: 1,
      explanation: "Las Leyes Nuevas suprimían la herencia de las encomiendas y buscaban limitar la explotación feudal del indio; los encomenderos se alzaron en armas, decapitaron al primer virrey Blasco Núñez Vela en Iñaquito y desafiaron al rey de España."
    },
    {
      id: "hper_t04_s01_c09",
      question: "El pacificador enviado por Carlos I que desarticuló la rebelión de Gonzalo Pizarro mediante el perdón real a los capitanes traidores en la batalla de Jaquijahuana (1548) fue:",
      options: [
        "Cristóbal Vaca de Castro",
        "Pedro de la Gasca",
        "Antonio de Mendoza",
        "Francisco de Toledo"
      ],
      correctIndex: 1,
      explanation: "El clérigo Pedro de la Gasca actuó con astucia política ofreciendo amnistía y confirmación de encomiendas a los rebeldes que desertaran de las filas de Gonzalo Pizarro, logrando que este fuera abandonado por su propio ejército en Jaquijahuana."
    },
    {
      id: "hper_t04_s01_c10",
      question: "El movimiento andino de resistencia religiosa e ideológica surgido en Huamanga (Ayacucho) hacia 1564, que proclamaba la resurrección de las huacas andinas y el castigo cósmico a los españoles invasores, se conoció como:",
      options: [
        "El mito de Inkarri",
        "El Taqui Oncoy («enfermedad del baile o canto»)",
        "El Yanahuara",
        "La extirpación de idolatrías"
      ],
      correctIndex: 1,
      explanation: "Liderado por Juan Chocne, el Taqui Oncoy convocaba a los indígenas a danzar en éxtasis poseídos por las huacas locales (Pachacámac, Titicaca) y a rechazar el bautismo, la comida y las vestiduras españolas para restaurar el orden andino."
    }
  ],

  hper_t04_s02: [
    {
      id: "hper_t04_s02_c01",
      question: "El virrey Francisco de Toledo (1569 - 1581) es considerado el gran organizador del Estado colonial peruano debido a que implementó una serie de reformas estructurales que incluyeron:",
      options: [
        "La abolición del tributo indígena y la disolución de los corregimientos.",
        "La reducción de indígenas en pueblos concentrados, la reglamentación obligatoria de la mita minera (Potosí y Huancavelica) y el censo y tasación del tributo indígena en moneda.",
        "La declaración del libre comercio con Inglaterra y Holanda.",
        "La entrega de la administración pública a los curacas indígenas."
      ],
      correctIndex: 1,
      explanation: "Toledo realizó la gran visita general del virreinato: organizó las 'reducciones' para concentrar a la dispersa población andina y facilitar su evangelización y cobro del tributo, y reactivó la minería canalizando la mano de obra forzada a través de la mita minera colonial."
    },
    {
      id: "hper_t04_s02_c02",
      question: "La mina colonial del Alto Perú que se convirtió en el mayor yacimiento de plata del mundo y motor neurálgico de la economía mercantilista española fue:",
      options: [
        "Castrovirreyna",
        "Potosí (Cerro Rico)",
        "Cerro de Pasco",
        "Hualgayoc"
      ],
      correctIndex: 1,
      explanation: "Potosí albergaba fabulosas vetas de plata que transformaron la economía mundial del siglo XVI y XVII, cobrando la vida de miles de mitayos indígenas forzados a trabajar en sus profundos socavones bajo el régimen de la mita toledana."
    },
    {
      id: "hper_t04_s02_c03",
      question: "El método metalúrgico introducido en el virreinato que revolucionó la producción masiva de plata permitiendo purificar minerales de baja ley mediante el uso del azogue (mercurio traído de Huancavelica) fue:",
      options: [
        "La fundición en huayras andinas de viento.",
        "El método de amalgamación o de patio (creado por Bartolomé de Medina).",
        "La lixiviación con ácido cianhídrico.",
        "La electrólisis en crisoles de arcilla."
      ],
      correctIndex: 1,
      explanation: "La amalgamación trituraba la plata y la mezclaba con mercurio en patios empedrados; el mercurio extraía la plata pura al adherirse a ella, requiriendo el aprovisionamiento vital de azogue desde la mina Santa Bárbara de Huancavelica."
    },
    {
      id: "hper_t04_s02_c04",
      question: "La autoridad colonial española que gobernaba una provincia o corregimiento, cobraba el tributo indígena y se enriquecía extorsionando a los comuneros mediante la venta forzada e ilegal de mercancías inútiles a precios inflados (reparto mercantil), era el:",
      options: [
        "Intendente",
        "Corregidor",
        "Oidor",
        "Alcalde de la Santa Hermandad"
      ],
      correctIndex: 1,
      explanation: "Los corregidores fueron las autoridades más odiadas del virreinato por imponer los «repartos mercantiles forzosos» de mercaderías chinas o europeas inservibles (como medias de seda o espejos a campesinos pobres) para endeudarlos y obligarlos a ir a la mita."
    },
    {
      id: "hper_t04_s02_c05",
      question: "El máximo tribunal de justicia del virreinato del Perú, cuyos magistrados (oidores) asesoraban al virrey y asumían provisionalmente el gobierno político en caso de muerte o vacancia de este, era:",
      options: [
        "El Consejo de Indias",
        "La Real Audiencia de Lima",
        "El Tribunal del Consulado",
        "El Cabildo de regidores"
      ],
      correctIndex: 1,
      explanation: "La Real Audiencia funcionaba como la corte suprema de justicia en el virreinato y como órgano colegiado de gobierno y control político frente a los abusos del virrey."
    },
    {
      id: "hper_t04_s02_c06",
      question: "El Tribunal de la Santa Inquisición (o Tribunal del Santo Oficio), establecido en Lima en 1570, tenía jurisdicción punitiva sobre:",
      options: [
        "Toda la población indígena del virreinato por idolatría andina.",
        "Españoles, criollos y extranjeros acusados de herejía luterana, judaísmo clandestino, brujería o bigamia, quedando los indios excluidos formalmente por ser considerados 'neófitos en la fe'.",
        "Exclusivamente piratas holandeses e ingleses capturados en el mar.",
        "Los curas doctrineros que cobraban diezmos excesivos."
      ],
      correctIndex: 1,
      explanation: "Por ley colonial, los indígenas estaban exentos de la Inquisición al ser categorizados como menores de edad y neófitos; los delitos religiosos de los indios eran juzgados por los tribunales episcopales ordinarios mediante las campañas de 'Extirpación de Idolatrías'."
    },
    {
      id: "hper_t04_s02_c07",
      question: "El gremio comercial de grandes importadores monopolistas limeños que controlaba el comercio exterior, armaba la Armada del Mar del Sur para proteger los galeones de la plata y financiaba al gobierno virreinal era:",
      options: [
        "La Casa de Contratación de Sevilla",
        "El Tribunal del Consulado de Lima",
        "La Real Compañía Guipuzcoana",
        "El gremio de azogueros de Potosí"
      ],
      correctIndex: 1,
      explanation: "El Tribunal del Consulado de Lima reunía a la acaudalada oligarquía comercial limeña que disfrutaba del monopolio comercial de la plata y mercancías enviadas desde Portobelo y Sevilla, prestando dinero al virrey para sostener las defensas contra piratas y corsarios."
    },
    {
      id: "hper_t04_s02_c08",
      question: "En la estratificación social del Virreinato del Perú, el sistema jurídico dividió formalmente a la sociedad en dos esferas corporativas con leyes, derechos y fueros diferenciados denominadas:",
      options: [
        "Burguesía y Proletariado",
        "República de Españoles y República de Indios",
        "Patricios y Plebeyos",
        "Nobles de sangre y Siervos de la gleba"
      ],
      correctIndex: 1,
      explanation: "La República de Españoles (peninsulares y criollos) gozaba de privilegios políticos y exención de tributo indígena; la República de Indios (nobles caciques e indios del común tributarios) vivía segregada en reducciones bajo tutela de la Corona y pagaba el tributo personal obligatorio."
    },
    {
      id: "hper_t04_s02_c09",
      question: "En el régimen de castas coloniales, la unión o mestizaje entre un español y una mujer negra esclava daba origen legal y social a un:",
      options: [
        "Mestizo",
        "Mulato",
        "Zambo",
        "Castizo"
      ],
      correctIndex: 1,
      explanation: "Las castas categorizaban minuciosamente las mezclas raciales: blanco + india = mestizo; blanco + negra = mulato; indio + negra = zambo (o zambahigo)."
    },
    {
      id: "hper_t04_s02_c10",
      question: "Los esclavos africanos que huían de las haciendas costeñas o casas señoriales para refugiarse en comunidades clandestinas fortificadas en los bosques y valles (palenques) eran llamados:",
      options: [
        "Bozales",
        "Cimarrones",
        "Ladinos",
        "Manumisos"
      ],
      correctIndex: 1,
      explanation: "El negro cimarrón era el esclavo prófugo que se rebelaba contra el régimen servil y fundaba palenques o quilombos (como en Huachipa o Chincha) para resistir en libertad y asaltar caminos reales."
    }
  ],

  // Semana 05
  hper_t05_s01: [
    {
      id: "hper_t05_s01_c01",
      question: "La gran rebelión anticolonial iniciada el 4 de noviembre de 1780 en Tinta por José Gabriel Condorcanqui, Túpac Amaru II, estalló de manera fulminante con:",
      options: [
        "La toma armada del Real Felipe del Callao.",
        "El apresamiento y ajusticiamiento del abusivo corregidor de Tinta, Antonio de Arriaga.",
        "La proclamación de una alianza militar con tropas británicas.",
        "El asalto a las minas de Potosí."
      ],
      correctIndex: 1,
      explanation: "Túpac Amaru II capturó al corregidor Arriaga, lo enjuició públicamente por extorsión y abusos cometidos contra los indígenas en los repartos mercantiles y lo ejecutó en la horca, dando inicio a la mayor sublevación social de los Andes coloniales."
    },
    {
      id: "hper_t05_s01_c02",
      question: "Entre las reivindicaciones sociales y económicas más revolucionarias proclamadas por Túpac Amaru II durante su sublevación destacan:",
      options: [
        "La instauración de una monarquía absolutista leal al rey de Francia.",
        "La abolición de la mita minera, la supresión de los corregimientos y repartos mercantiles, la anulación de las alcabalas y la libertad universal para los esclavos negros.",
        "El restablecimiento de los sacrificios humanos prehispánicos.",
        "La expulsión definitiva de todos los sacerdotes católicos."
      ],
      correctIndex: 1,
      explanation: "El programa tupacamarista fue precursor y radical: decretó por vez primera en América la abolición de la esclavitud negra (Bando de Tungasuca) y la cancelación de los gravámenes que esquilmaban al campesinado y a los artesanos mestizos y criollos."
    },
    {
      id: "hper_t05_s01_c03",
      question: "¿Cuál fue una consecuencia administrativa directa aplicada por la Corona española tras sofocar con extrema crueldad la rebelión de Túpac Amaru II en 1781?",
      options: [
        "El retorno de las encomiendas perpetuas.",
        "La supresión de los corregimientos y su reemplazo por el sistema de Intendencias (1784), además de la creación de la Real Audiencia del Cusco (1787).",
        "La disolución del Virreinato del Río de la Plata.",
        "La entrega del control aduanero a los criollos limeños."
      ],
      correctIndex: 1,
      explanation: "Para apaciguar el descontento andino y centralizar el cobro fiscal, la Corona abolió los odiados corregimientos sustituyéndolos por 8 intendencias gobernadas por militares y letrados, y estableció la Audiencia del Cusco para atender litigios andinos sin tener que viajar a Lima."
    },
    {
      id: "hper_t05_s01_c04",
      question: "El ilustre jesuita arequipeño Juan Pablo Viscardo y Guzmán es considerado el primer precursor ideológico separatista continental de América por haber escrito en 1792 la célebre:",
      options: [
        "Idea General del Perú",
        "Carta a los Españoles Americanos",
        "Manifestación Histórica y Política de la Revolución de la América",
        "Observaciones sobre el clima de Lima"
      ],
      correctIndex: 1,
      explanation: "Expulsado de su patria por orden de Carlos III en 1767, Viscardo redactó desde Europa la 'Carta a los Españoles Americanos', donde convoca a todos los criollos a romper definitivamente las cadenas coloniales con España al cumplirse tres siglos de dominación injusta."
    },
    {
      id: "hper_t05_s01_c05",
      question: "La Sociedad Amantes del País, fundada en Lima a fines del siglo XVIII por un selecto grupo de ilustrados criollos, difundió el conocimiento geográfico, científico y cultural de la patria a través de la revista:",
      options: [
        "La Abeja Republicana",
        "El Mercurio Peruano",
        "La Gaceta de Lima",
        "El Correo del Perú"
      ],
      correctIndex: 1,
      explanation: "Dirigido por Hipólito Unanue, El Mercurio Peruano (1791 - 1795) publicó minuciosos estudios de historia, medicina, botánica y economía bajo el lema del amor al Perú, forjando la conciencia nacional e identidad criolla."
    },
    {
      id: "hper_t05_s01_c06",
      question: "En las conferencias de Miraflores (1820) y Punchauca (1821) entre los emisarios de San Martín y los virreyes Pezuela y La Serna, la propuesta política central planteada por el general San Martín para el Perú independiente fue:",
      options: [
        "Una república federal al estilo de los Estados Unidos.",
        "Una monarquía constitucional gobernada por un príncipe de la dinastía española o europea.",
        "La anexión inmediata del Perú a la Gran Colombia de Bolívar.",
        "Una dictadura militar vitalicia sin constitución."
      ],
      correctIndex: 1,
      explanation: "San Martín y su ministro Bernardo de Monteagudo creían que la falta de educación cívica y las hondas divisiones sociales del Perú derivarían en caudillismo anárquico si se adoptaba la república pura, por lo que defendieron una monarquía constitucional moderada por un parlamento."
    },
    {
      id: "hper_t05_s01_c07",
      question: "El célebre debate doctrinario desarrollado en la Sociedad Patriótica de Lima en 1822 sobre la forma definitiva de gobierno para el Perú enfrentó a los partidarios de:",
      options: [
        "El absolutismo teocrático vs el socialismo comunal.",
        "La monarquía constitucional (defendida por Monteagudo e Ignacio Moreno) vs la República democrática (defendida gallardamente por José Faustino Sánchez Carrión 'El Solitario de Sayán').",
        "El protectorado militar vs la reintegración a la Corona de España.",
        "La federación andina vs el unitarismo regionalista."
      ],
      correctIndex: 1,
      explanation: "Sánchez Carrión, a través de sus 'Cartas del Solitario de Sayán' publicadas en La Abeja Republicana, defendió con brillantez la república soberana, convenciendo a los diputados del Primer Congreso Constituyente de 1822 de abolir cualquier opción monárquica."
    },
    {
      id: "hper_t05_s01_c08",
      question: "La batalla de Junín, librada el 6 de agosto de 1824 en las pampas de Chacamarca, es célebre militarmente porque se libró exclusivamente con armas blancas (sables y lanzas) y la victoria patriota se selló gracias a la oportuna y sorpresiva carga de:",
      options: [
        "Los Granaderos a Caballo del general Miller.",
        "Los Húsares del Perú (luego rebautizados Húsares de Junín) comandados por Isidoro Suárez tras la audaz sugerencia de José Andrés Rázuri.",
        "Las guerrillas indígenas montoneras de Ninavilca.",
        "Los dragones de caballería de Sucre."
      ],
      correctIndex: 1,
      explanation: "Cuando la caballería de Canterac parecía ganar el combate, el mayor Rázuri alteró la orden de retirada de La Mar y ordenó al comandante Suárez cargar por la retaguardia enemiga con los Húsares del Perú, sembrando el pánico realista y logrando la victoria."
    },
    {
      id: "hper_t05_s01_c09",
      question: "En la gloriosa batalla de Ayacucho (9 de diciembre de 1824), librada en las faldas del cerro Condorcunca en la pampa de la Quinua, el general libertador que comandó al ejército patriota hacia la independencia definitiva de América fue:",
      options: [
        "José de San Martín",
        "Antonio José de Sucre",
        "Simón Bolívar",
        "Agustín Gamarra"
      ],
      correctIndex: 1,
      explanation: "Sucre arengó a las tropas con la histórica frase: «¡Soldados, de los esfuerzos de hoy depende la suerte de la América del Sur; otro día de gloria va a coronar vuestra admirable constancia!», destrozando al ejército del virrey La Serna y sellando la Capitulación de Ayacucho."
    },
    {
      id: "hper_t05_s01_c09_alt", // keep index deterministic
      question: "El Tratado de la Capitulación de Ayacucho, firmado entre el mariscal Sucre y el general Canterac, causó polémica en la naciente república porque concedió generosos beneficios económicos a los realistas como:",
      options: [
        "La cesión territorial del puerto de Arica a España.",
        "El pago de los pasajes de retorno a España para los oficiales rendidos y el compromiso del Perú de reconocer la deuda de la independencia a favor de la Corona española.",
        "El nombramiento perpetuo de jueces hispanos en la Corte Suprema de Lima.",
        "La mantención del tributo indígena obligatorio para pagar a los soldados colombianos."
      ],
      correctIndex: 1,
      explanation: "La capitulación fue sumamente caballerosa y onerosa para el erario nacional: se acordó pagar el pasaje de regreso a los vencidos, respetar sus propiedades privadas y reconocer la deuda monetaria contraída por el virreinato."
    }
  ],

  hper_t05_s02: [
    {
      id: "hper_t05_s02_c01",
      question: "El periodo económico de bonanza fiscal denominado 'La Prosperidad Falaz' por Jorge Basadre (1845 - 1872) se caracterizó por:",
      options: [
        "El auge de la exportación industrial de textiles de vicuña.",
        "El gigantesco ingreso de divisas fiscales por la exportación de guano de las islas, que en lugar de invertirse en desarrollo productivo sostenible derivó en despilfarro burocrático y endeudamiento.",
        "La explotación exitosa de petróleo en la cuenca de Talara.",
        "La entrega gratuita de tierras a los campesinos andinos."
      ],
      correctIndex: 1,
      explanation: "El monopolio mundial del guano de islas generó una inmensa riqueza al Estado peruano, pero los recursos se evaporaron en empréstitos ruinosos, burocracia civil y militar, y la consolidación fraudulenta de la deuda interna."
    },
    {
      id: "hper_t05_s02_c02",
      question: "Durante su segundo gobierno constitucional (1854 - 1862), el presidente Ramón Castilla aprobó dos medidas sociales de enorme trascendencia histórica:",
      options: [
        "La ley de divorcio vincular y el voto femenino obligatorio.",
        "La abolición definitiva del tributo indígena y la manumisión de la esclavitud negra compensando económicamente a los hacendados propietarios.",
        "La reforma agraria y la expropiación de las petroleras extranjeras.",
        "La creación del Banco Central de Reserva y el sol de oro."
      ],
      correctIndex: 1,
      explanation: "En plena revolución liberal de 1854 en Ayacucho y Huancayo, Castilla decretó el fin del ignominioso tributo indígena colonial y la abolición de la esclavitud pagando 300 pesos a los hacendados por cada liberto."
    },
    {
      id: "hper_t05_s02_c03",
      question: "El Tratado de Alianza Defensiva secreto firmado en 1873 entre el Perú y Bolivia fue utilizado por Chile como argumento diplomático formal para:",
      options: [
        "Exigir la entrega de las islas guaneras de Chincha.",
        "Declarar la guerra al Perú el 5 de abril de 1879, acusando al gobierno peruano de hostilidad belicista tras negarse a declarar la neutralidad en el conflicto salitrero boliviano-chileno.",
        "Firmar un tratado de comercio libre con Lima y La Paz.",
        "Comprar blindados navales en astilleros de Gran Bretaña."
      ],
      correctIndex: 1,
      explanation: "Cuando Chile invadió Antofagasta tras el impuesto de los 10 centavos de Bolivia, el Perú envió la misión mediadora de José Antonio de Lavalle; Chile exigió la neutralidad y, ante la vigencia del tratado secreto de 1873, declaró formalmente la guerra al Perú."
    },
    {
      id: "hper_t05_s02_c04",
      question: "En la Campaña Marítima de la Guerra del Pacífico, el almirante Miguel Grau Seminario al mando del monitor Huáscar contuvo durante seis meses a la poderosa escuadra chilena, ganándose el apelativo de 'El Caballero de los Mares' debido a:",
      options: [
        "Bombardear puertos civiles indefensos en las costas chilenas.",
        "Rescatar del agua a los náufragos de la corbeta chilena Esmeralda en Iquique y enviar una conmovedora carta de condolencias con las prendas personales a la viuda del capitán Arturo Prat.",
        "Negarse a disparar los cañones de torre del monitor.",
        "Exigir el pago de rescate en lingotes de oro por los prisioneros chilenos."
      ],
      correctIndex: 1,
      explanation: "Grau combinó una genial pericia táctica militar con una intachable hidalguía humana: salvó de morir ahogados a los marinos chilenos vencidos y escribió una hermosa misiva a Carmela Carvajal, viuda de su rival Prat."
    },
    {
      id: "hper_t05_s02_c05",
      question: "Durante la Campaña de la Breña en los Andes centrales (1881 - 1883), el héroe nacional que organizó la resistencia guerrillera con campesinos andinos e infligió humillantes derrotas al ejército invasor chileno en Pucará, Marcavalle y Concepción fue:",
      options: [
        "Francisco Bolognesi",
        "Andrés Avelino Cáceres («El Brujo de los Andes»)",
        "Nicolás de Piérola",
        "Lizardo Montero"
      ],
      correctIndex: 1,
      explanation: "Cáceres, hablando quechua fluido y contando con la lealtad indoblegable de los comuneros serranos, esquivó persecuciones militares chilenas y lideró la resistencia andina hasta la dolorosa batalla de Huamachuco."
    },
    {
      id: "hper_t05_s02_c06",
      question: "El Tratado de Ancón, firmado el 20 de octubre de 1883 por el gobierno regenerador de Miguel Iglesias para poner fin a la Guerra con Chile, estipuló gravosas condiciones territoriales como:",
      options: [
        "La cesión perpetua de Arica y Tacna a favor de Chile sin plebiscito.",
        "La cesión perpetua e incondicional de la provincia salitrera de Tarapacá a favor de Chile, y la ocupación temporal por diez años de Tacna y Arica sujeta a un plebiscito posterior.",
        "La renuncia definitiva del Perú al puerto del Callao.",
        "El pago de una indemnización en barcos de guerra acorazados."
      ],
      correctIndex: 1,
      explanation: "El Tratado de Ancón cercenó definitivamente Tarapacá para el Perú y dejó cautivas por una década a Tacna y Arica, plebiscito que Chile postergó dolosamente hasta la solución diplomática de 1929."
    },
    {
      id: "hper_t05_s02_c07",
      question: "Durante la Reconstrucción Nacional, el gobierno de Andrés Avelino Cáceres firmó en 1889 el polémico Contrato Grace con los tenedores de bonos británicos, acordando:",
      options: [
        "La compra de aviones militares de combate a Inglaterra.",
        "La entrega en concesión de los ferrocarriles del Estado por 66 años, tres millones de toneladas de guano y el pago de anualidades en efectivo a cambio de cancelar la impagable deuda externa nacional.",
        "El monopolio del tabaco y del alcohol a bancos estadounidenses.",
        "La privatización total de las minas de Cerro de Pasco."
      ],
      correctIndex: 1,
      explanation: "El Contrato Grace permitió al Perú reinsertarse en el crédito financiero internacional y reconstruir su economía quebrada por la guerra, entregando a la Peruvian Corporation la administración de la red ferroviaria construida en el siglo XIX."
    },
    {
      id: "hper_t05_s02_c08",
      question: "La 'República Aristocrática' (1895 - 1919), concepto acuñado por el historiador Jorge Basadre, definió un periodo político caracterizado por:",
      options: [
        "El predominio popular de los partidos obreros socialistas en el Parlamento.",
        "La hegemonía política casi exclusiva del Partido Civil, en alianza con la oligarquía agroexportadora de la costa y el gamonalismo terrateniente de la sierra.",
        "El gobierno directo de militares de la guerra del Pacífico.",
        "La nacionalización general de las haciendas de azúcar y algodón."
      ],
      correctIndex: 1,
      explanation: "La oligarquía agrupada en el Partido Civil (los Pardo, Candamo, Aspíllaga) monopolizó el poder político republicano, gobernando para un modelo agroexportador y financiero subordinado al capital británico, excluyendo a la masa indígena y proletaria."
    },
    {
      id: "hper_t05_s02_c09",
      question: "En enero de 1919, tras una huelga obrera general y masivas movilizaciones de la Federación de Panaderos 'Estrella del Perú' y estudiantes universitarios liderados por Víctor Raúl Haya de la Torre, el gobierno de José Pardo y Barreda decretó:",
      options: [
        "La gratuidad de la enseñanza en universidades privadas.",
        "La implantación histórica de la jornada laboral de ocho horas de trabajo para todos los obreros y trabajadores del Perú.",
        "La nacionalización inmediata de los tranvías eléctricos de Lima.",
        "El voto secreto para analfabetos y mujeres."
      ],
      correctIndex: 1,
      explanation: "La histórica conquista laboral de las 8 horas diarias en el Perú fue arrancada por la huelga obrera del 13, 14 y 15 de enero de 1919, obligando al presidente José Pardo a dictar el decreto que consagró la jornada máxima legal de ocho horas de trabajo."
    },
    {
      id: "hper_t05_s02_c10",
      question: "Durante el Oncenio de Augusto B. Leguía (1919 - 1930), la política de infraestructura vial modernizadora impuso la obligatoriedad del trabajo forzado de los campesinos andinos en la apertura de carreteras a través de la odiada:",
      options: [
        "Ley de Conscripción Vial (o mita republicana)",
        "Ley de Seguridad Interior",
        "Ley de vagancia urbana",
        "Ley del enganche minero"
      ],
      correctIndex: 0,
      explanation: "La Ley de Conscripción Vial obligaba a todos los varones de 18 a 60 años a trabajar gratuitamente varios días al año en la construcción de carreteras; en la práctica, los ricos pagaban una tasa para exonerarse y la carga recayó opresivamente sobre el campesinado indígena."
    }
  ]
};

// Replace 10th challenge in hper_t05_s01 if id had suffix
if (newChallenges.hper_t05_s01.length === 11) {
  newChallenges.hper_t05_s01[9].id = "hper_t05_s01_c10";
  newChallenges.hper_t05_s01.pop();
}

// Apply to SALIDA_KOTLIN/historia_peru
const baseDir = 'SALIDA_KOTLIN/historia_peru';
for (let i = 1; i <= 5; i++) {
  const pad = String(i).padStart(2, '0');
  const filePath = path.join(baseDir, `HistoriaPeruSemana${pad}.kt`);
  const parsed = parseKotlinFileRobust(filePath);

  let newFileContent = `package historia_peru\n\nobject HistoriaPeruSemana${pad} {\n\n    val lessons = listOf(\n`;

  for (let lIdx = 0; lIdx < parsed.lessons.length; lIdx++) {
    const l = parsed.lessons[lIdx];
    const chList = newChallenges[l.id];
    if (!chList || chList.length !== 10) {
      console.error(`Error: Missing or invalid challenges for lesson ${l.id} (got ${chList ? chList.length : 0})`);
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

console.log("All Historia del Peru files repaired.");
