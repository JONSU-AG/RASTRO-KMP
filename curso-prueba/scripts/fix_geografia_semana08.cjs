const fs = require('fs');
const path = require('path');

const theoryS01 = `### 3.1. Origen y Criterios de la Tesis de Javier Pulgar Vidal
En 1940, durante la **III Asamblea General del Instituto Panamericano de Geografía e Historia (IPGH)** celebrada en Lima, el ilustre geógrafo huanuqueño **Dr. Javier Pulgar Vidal** presentó su trascendental tesis doctoral titulada *Las Ocho Regiones Naturales del Perú*, superando de forma definitiva la simplista e insuficiente división virreinal y republicana tradicional de "Costa, Sierra y Montaña".

#### Los 6 Criterios de Clasificación Científica:
1. **Factor Altitudinal:** Criterio director y estructurante. La altitud impone variaciones bruscas de temperatura, presión atmosférica, humedad y radiación solar conforme se asciende en la cordillera.
2. **Criterio Toponímico (Etimología Nativa):** Rescata el saber vernáculo de las lenguas aborígenes (quechua, aymara, cauqui y lenguas amazónicas) que sintetizaban en un vocablo la realidad geográfica y climática de cada piso ecológico.
3. **Criterio Climático:** Considera las temperaturas medias y extremas, la insolación, la nubosidad y el régimen pluvial estacional.
4. **Criterio Ecológico (Flora y Fauna):** Identifica las especies bioindicadoras endémicas adaptadas a cada hábitat térmico.
5. **Criterio Geomorfológico:** Tipo de relieve dominante (llanuras aluviales, desfiladeros, mesetas, conos volcánicos, llanuras aluviales meándricas).
6. **Criterio de la Actividad Humana (Agropecuario y Cultural):** Productos agrícolas cultivables, domesticación milenaria y adaptación del ser humano.

---

### 3.2. Regiones de la Vertiente Occidental y Valles Andinos (Chala a Suni)

#### 1. Región Chala o Costa (0 a 500 m s.n.m.)
* **Toponimia:** En quechua: *"Maizal"* o *"amontonamiento de nubes secas"*. En aymara: *"Amontonamiento"* o *"tierra arenosa y yerma"*. En cauqui: *"Tierra seca y arcillosa"*.
* **Relieve:** Llanuras aluviales (valles transversales), pampas desérticas, tablazos sobreelevados, dunas, depresiones salinas y lomas costeras.
* **Clima:** 
  * *Centro-Sur:* Subtropical árido, templado cálido, húmedo en invierno por nieblas estratos y garúas traídas por la Corriente de Humboldt; casi ausencia total de lluvias torrenciales.
  * *Norte (Tumbes y norte de Piura):* Semiaridocaluroso a tropical seco, caluroso con lluvias en verano por influjo de la Corriente de El Niño.
* **Flora:** Algarrobo, zapote, caña brava, totora, carrizos, flor de Amancaes en lomas, mangle rojo (en esteros de Tumbes).
* **Fauna:** Anchoveta, sardina, lobos marinos, aves guaneras (guanay, piquero, pelícano), zarcillo, pingüino de Humboldt.
* **Productos y Agricultura:** Caña de azúcar, algodón, espárragos, páprika, uvas de mesa, cítricos, arroz.

#### 2. Región Yunga (500 a 2 300 m s.n.m.)
* **Toponimia:** En quechua significa *"Valle cálido"*; en aymara: *"Mujer estéril"* (por la escasez de vegetación natural en sus quebradas pedregosas).
* **Subregiones Geográficas:**
  1. **Yunga Marítima (500 a 2 300 m):** Flanco occidental andino que mira al Pacífico. Clima desértico cálido, extremadamente soleado casi todo el año, aire seco. Es la **zona endémica de huaycos o llocllas** en verano. Ciudades: Chosica, Moquegua, Tacna, Nazca.
  2. **Yunga Fluvial (1 000 a 2 300 m):** Valles interandinos y flanco oriental andino. Clima templado cálido y húmedo con lluvias estivales copiosas. Menos insolación directa. Ciudades: Huánuco, Chachapoyas, Abancay.
* **Relieve:** Quebradas estrechas y profundas, valles intermontanos encajonados, laderas empinadas y pedregosas.
* **Flora:** Molle (*Schinus molle*, el árbol emblemático), cactáceas columnares (pitajaya, gigantón), cabuya o maguey, tara, carrizo.
* **Fauna:** Chaucato, taurigaray, alacranes, ciempiés, culebras, picaflores.
* **Actividad:** Es la **región frutal por excelencia del Perú** (palta, lúcuma, chirimoya, naranja, pacae, guayaba, manzana).

#### 3. Región Quechua (2 300 a 3 500 m s.n.m.)
* **Toponimia:** En quechua alude a *"Tierras de clima templado"* o *"tierras de valles y quebradas fértiles"*.
* **Relieve:** Valles interandinos amplios y laderas de pendiente moderada modeladas por erosión fluvial.
* **Clima:** Considerado unánimemente como **el clima más benigno, saludable y templado del mundo**: templado regular, aire seco y puro, días soleados y noches frescas. Lluvias periódicas en verano (enero a marzo).
* **Flora:** Aliso (*Alnus acuminata*, árbol típico), arrayán, calabaza, caigua, maíz (centro de origen y máxima diversificación genética), cantuta blanca, eucalipto (árbol exótico aclimatado).
* **Fauna:** Zorzal gris, zorro andino (*añás*), puma, venado gris, oso de anteojos, taruca.
* **Actividad:** Constituye la **zona de mayor concentración demográfica tradicional de la sierra y la despensa agrícola del Perú** (maíz, trigo, cebada, habas, hortalizas, tubérculos menores). Ciudades: **Arequipa (2 325 m)**, Cusco, Huancayo, Huaraz, Cajamarca, Ayacucho.

#### 4. Región Suni o Jalca (3 500 a 4 000 m s.n.m.)
* **Toponimia:** En quechua significa *"Tierras altas"*, *"ancho"*, *"largo"* o *"altas cumbres desoladas"*. En el norte peruano (Cajamarca) se le conoce como **Jalca**.
* **Relieve:** Muy quebrado, escarpado, con desfiladeros, paredes rocosas abruptas y cañones estrechos.
* **Clima:** Frío y seco. Es la **región límite de la agricultura tradicional y zona de inicio de las heladas meteorológicas invernales** que congelan las cosechas.
* **Flora:** **La Cantuta** (*Cantua buxifolia*, la flor sagrada de los incas y flor nacional del Perú), árbol de queñual, quishuar, saúco, taya. Cultivos de tubérculos resistentes al frío: **mashua, olluco, oca, quinua y papa amarga**.
* **Fauna:** Zorzal negro, cernícalo andino, allqamari (caracara andino), vizcacha, cuy silvestre.
* **Ciudades:** Puno (3 827 m), Huancavelica, La Oroya, Juliaca.`;

const theoryS02 = `### 3.3. Regiones de Alta Montaña y Vertiente Amazónica (Puna, Janca, Rupa Rupa y Omagua)

#### 5. Región Puna (4 000 a 4 800 m s.n.m.)
* **Toponimia:** En quechua y aymara significa *"Soroche"*, *"mal de montaña"* o *"tierra alta y fría azotada por el viento"*.
* **Relieve:** Extensas mesetas altiplánicas onduladas (planicies altoandinas), colinas suaves y numerosas lagunas glaciares.
* **Clima:** **Frígido**. Atmósfera extremadamente diáfana y seca, con una oscilación térmica diaria descomunal (fuerte calor a pleno sol durante el día y temperaturas bajo cero en la noche: hasta -20 °C). Frecuentes tempestades de nieve, aguanieve y granizo.
* **Flora:** **Ichu** (paja brava, gramínea base de la dieta ganadera), **Puya de Raimondi** (*Puya raimondii*, titanca: florece cada 100 años con más de 8 000 flores), yareta (planta compacta resinosa), pajonales y el cultivo nativo de la **maca** (hasta los 4 400 m).
* **Fauna:** Hábitat de los cuatro **camélidos sudamericanos** (vicuña y guanaco silvestres; alpaca y llama domesticadas), parihuana o flamenco andino, cóndor, chinchilla, trucha arcoíris (en lagunas).
* **Ciudades y Asentamientos:** Cerro de Pasco (4 380 m, la ciudad con más de 50 000 hab. más alta del mundo), Junín.

#### 6. Región Janca o Cordillera (4 800 a 6 768 m s.n.m.)
* **Toponimia:** En aymara y quechua significa *"Blanco"* o *"maíz tostado y reventado"* (haciendo alusión a la nieve perpetua que cubre las cumbres).
* **Relieve:** Abrupto, escarpado, dominado por picos piramidales, crestas afiladas, morrenas, circos glaciares y abismos infranqueables.
* **Clima:** **Glaciar o muy frígido**. Temperaturas permanentemente por debajo de los 0 °C durante casi todo el año. Aire enrarecido con muy baja presión parcial de oxígeno.
* **Flora:** Muy escasa y especializada; líquenes, musgos y la diminuta flor de la yaretilla pegada a las rocas.
* **Fauna:** El **Cóndor andino** (*Vultur gryphus*), la vizcacha y el zorrino andino.
* **Actividad:** Explotación minera de socavón a gran altura (e.g., La Rinconada en Puno a más de 5 100 m s.n.m., el campamento minero permanente más alto del planeta) y andinismo/turismo de alta montaña.

#### 7. Región Rupa Rupa o Selva Alta (400 a 1 000 m s.n.m.)
* **Toponimia:** En quechua significa *"Ardiente"* o *"lo que está caliente y quema"*.
* **Relieve:** Muy complejo y accidentado; cadenas montañosas cubiertas de selva, profundos cañones fluviales (**pongos**), valles longitudinales fértiles, terrazas y cavernas kársticas.
* **Clima:** Tropical cálido y húmedo. Es **la región más nubosa y lluviosa de todo el Perú** (registrándose en Quincemil, Cusco, más de 7 000 mm de precipitación anual).
* **Flora:** **El Árbol de la Quina** (*Cinchona officinalis*, árbol nacional del escudo peruano), yarina, cedro, orquídeas, bromelias, tornillo.
* **Fauna:** **El Gallito de las Rocas** (*Rupicola peruvianus*, tunqui, ave nacional del Perú), otorongo (jaguar), tapir americano o sachavaca, mono choro de cola amarilla, serpiente shushupe, sajino.
* **Actividad y Ciudades:** Agricultura agroexportadora de **café, cacao, té, frutas tropicales y coca**. Ciudades: Tingo María, Bagua, Jaén, Moyobamba, Chanchamayo, Quillabamba.

#### 8. Región Omagua o Selva Baja (80 a 400 m s.n.m.)
* **Toponimia:** En lenguas originarias amazónicas significa *"Peces de agua dulce"* o *"tierra de hombres sabios"*.
* **Relieve:** Inmensa llanura aluvial horizontal de suave pendiente atravesada por ríos gigantescos de curso meándrico. Estructurada en cuatro niveles: **tahuampas** (pantanos permanentes), **restingas** (terrazas inundables temporales), **altos** (terrazas no inundables donde se fundan las urbes) y **filos** (colinas divisorias de aguas).
* **Clima:** **Tropical muy caluroso, húmedo y lluvioso**. Es **la región más calurosa del territorio nacional** (registrándose temperaturas máximas históricas superiores a 41 °C en Neshuya, Ucayali).
* **Flora:** Árboles madereros gigantescos como la **caoba o aguano**, el **cedro**, la **lupuna** (el árbol más alto de la selva peruana, con más de 60 m de altura), la palmera de aguaje, la castaña y la flor acuática gigante *Victoria regia*.
* **Fauna:** **El Paiche** (*Arapaima gigas*, pez gigante de agua dulce), anaconda, manatí amazónico, delfín rosado, caimán negro, charapa, ronsoco (capibara).
* **Ciudades:** Iquitos, Pucallpa, Tarapoto, Puerto Maldonado, Yurimaguas.

---

### Cuadro Síntesis de Símbolos Nacionales por Región Natural:
* **Árbol de la Quina (Árbol Nacional):** Pertenece a la región **RUPA RUPA** (Selva Alta).
* **Gallito de las Rocas (Ave Nacional):** Pertenece a la región **RUPA RUPA**.
* **Vicuña (Fauna del Escudo):** Pertenece a la región **PUNA**.`;

const challengesS01 = [
  {
    id: "geo_t08_s01_c01",
    question: "En 1940, el Dr. Javier Pulgar Vidal presentó su tesis doctoral sobre las Ocho Regiones Naturales del Perú ante:",
    options: [
      "El Congreso Constituyente Democrático reunido en Lima.",
      "La III Asamblea General del Instituto Panamericano de Geografía e Historia.",
      "La Sociedad Geográfica de Londres en sesión plenaria.",
      "La Conferencia Interamericana de Cancilleres de Bogotá."
    ],
    correctIndex: 1,
    explanation: "Pulgar Vidal expuso formalmente su división biogeográfica en la III Asamblea General del Instituto Panamericano de Geografía e Historia (IPGH) celebrada en Lima en 1940."
  },
  {
    id: "geo_t08_s01_c02",
    question: "Dentro de los seis criterios científicos adoptados por Javier Pulgar Vidal, ¿cuál constituye el factor director y estructurante primordial?",
    options: [
      "El criterio altitudinal determinado por la Cordillera de los Andes.",
      "El mapa hidrográfico de cuencas exorreicas del Pacífico.",
      "La demarcación administrativa departamental republicana.",
      "El volumen de exportaciones mineras y agropecuarias."
    ],
    correctIndex: 0,
    explanation: "El factor altitudinal impuesto por el relieve andino determina variaciones drásticas en temperatura, presión, humedad y radiación solar, rigiendo la zonificación de pisos ecológicos."
  },
  {
    id: "geo_t08_s01_c03",
    question: "¿Qué significado toponímico tiene el vocablo quechua 'Chala' según la tesis de Pulgar Vidal?",
    options: [
      "Tierra alta batida continuamente por vientos gélidos.",
      "Maizal o amontonamiento de nubes secas y estratos.",
      "Valle estrecho y profundo con clima templado seco.",
      "Llanura cenagosa habitada por peces de agua dulce."
    ],
    correctIndex: 1,
    explanation: "En lengua quechua, 'Chala' remite al 'maizal' o al 'amontonamiento de nubes' (nieblas estratos), mientras en aymara significa tierra arenosa y amontonamiento."
  },
  {
    id: "geo_t08_s01_c04",
    question: "La región Yunga Marítima (500 a 2 300 m s.n.m.) se caracteriza climática y geomorfológicamente por:",
    options: [
      "Llanuras aluviales inundables y clima tropical hiperhúmedo.",
      "Laderas abruptas, intensa radiación solar todo el año y ser zona endémica de huaycos en verano.",
      "Mesetas frígidas con oscilación térmica extrema y pajonales de gramíneas.",
      "Picos nevados inaccesibles con temperaturas permanentemente subcero."
    ],
    correctIndex: 1,
    explanation: "La Yunga Marítima en la vertiente occidental destaca por su atmósfera seca, sol permanente y quebradas pedregosas donde se desatan huaycos o llocllas en meses estivales."
  },
  {
    id: "geo_t08_s01_c05",
    question: "El árbol emblemático y representativo de la región Yunga es:",
    options: [
      "El queñual (*Polylepis*).",
      "La caoba o aguano (*Swietenia macrophylla*).",
      "El molle (*Schinus molle*).",
      "El aliso andino (*Alnus acuminata*)."
    ],
    correctIndex: 2,
    explanation: "El molle (*Schinus molle*) es la especie arbórea representativa de las quebradas de la región Yunga, adaptada a laderas áridas y valles cálidos."
  },
  {
    id: "geo_t08_s01_c06",
    question: "La región Quechua (2 300 a 3 500 m s.n.m.) es reconocida en la geografía peruana por poseer:",
    options: [
      "El clima más benigno, templado y saludable del mundo, siendo la despensa agrícola tradicional del país.",
      "La atmósfera más calurosa del territorio nacional con medias superiores a 35 grados Celsius.",
      "Glaciares colgantes y una cubierta permanente de nieves perpetuas sobre crestas piramidales.",
      "Pantanos perennes o tahuampas que impiden todo tipo de asentamiento urbano e industrial."
    ],
    correctIndex: 0,
    explanation: "La región Quechua ostenta clima templado seco con noches frescas, convirtiéndose en el piso de mayor densidad demográfica andina y centro de cultivo del maíz."
  },
  {
    id: "geo_t08_s01_c07",
    question: "¿Cuál de las siguientes ciudades peruanas se ubica en el piso ecológico de la región Quechua?",
    options: [
      "Chosica (850 m s.n.m.).",
      "Cerro de Pasco (4 380 m s.n.m.).",
      "Arequipa (2 325 m s.n.m.).",
      "Tingo María (660 m s.n.m.)."
    ],
    correctIndex: 2,
    explanation: "Arequipa se asienta en la base altitudinal de la región Quechua (2 325 m s.n.m.), al igual que urbes como Cusco, Huancayo y Cajamarca."
  },
  {
    id: "geo_t08_s01_c08",
    question: "La región Suni o Jalca (3 500 a 4 000 m s.n.m.) se define agronómica y meteorológicamente como:",
    options: [
      "La zona de mayor producción de cítricos y frutas de clima cálido del país.",
      "El límite superior de la agricultura tradicional y la zona donde inician las heladas invernales.",
      "El bosque nuboso continuo con mayor precipitación anual del territorio peruano.",
      "La faja desértica de llanuras marinas sujetas a levantamiento epirogénico sostenido."
    ],
    correctIndex: 1,
    explanation: "Suni marca el límite superior para la agricultura de tubérculos resistentes al frío (mashua, oca, quinua) y sufre el impacto directo de las heladas invernales."
  },
  {
    id: "geo_t08_s01_c09",
    question: "¿Cuál es la flor emblemática sagrada de los incas que crece típicamente en la región Suni?",
    options: [
      "La orquídea zapatito (*Phragmipedium*).",
      "La flor de la yaretilla (*Azorella*).",
      "La flor de Amancaes (*Ismene amancaes*).",
      "La Cantuta (*Cantua buxifolia*)."
    ],
    correctIndex: 3,
    explanation: "La Cantuta (*Cantua buxifolia*) es la flor nacional del Perú y especie bioindicadora vegetal de la región Suni o Jalca."
  },
  {
    id: "geo_t08_s01_c10",
    question: "En el departamento de Cajamarca y el norte andino, la región Suni es comúnmente denominada por los pobladores como:",
    options: [
      "Jalca.",
      "Puna.",
      "Omagua.",
      "Yunga."
    ],
    correctIndex: 0,
    explanation: "En el norte del Perú, particularmente en Cajamarca, el piso ecológico de Suni recibe el apelativo vernáculo tradicional de 'Jalca'."
  }
];

const challengesS02 = [
  {
    id: "geo_t08_s02_c01",
    question: "En quechua y aymara, la palabra 'Puna' (4 000 a 4 800 m s.n.m.) hace referencia etimológica directa a:",
    options: [
      "Tierra fértil para el cultivo intensivo de frutales de hueso.",
      "Soroche, mal de montaña o tierra fría azotada por vientos.",
      "Valle de profundos cañones donde abundan peces de río.",
      "Selva ardiente cubierta de neblinas densas matinales."
    ],
    correctIndex: 1,
    explanation: "El vocablo Puna alude al 'soroche' o efecto de hipoxia por descompresión de oxígeno en las altas mesetas frías andinas."
  },
  {
    id: "geo_t08_s02_c02",
    question: "¿Qué planta gigante con inflorescencias que alcanzan hasta 8 000 flores es endémica y característica de la región Puna?",
    options: [
      "El algarrobo costero.",
      "La lupuna blanca.",
      "La Puya de Raimondi (*Puya raimondii*).",
      "El árbol de la quina."
    ],
    correctIndex: 2,
    explanation: "La Puya de Raimondi o titanca es la bromeliácea más colosal del mundo, hábitat exclusivo de los roquedales y pajonales de la región Puna."
  },
  {
    id: "geo_t08_s02_c03",
    question: "La región Janca o Cordillera se extiende altitudinalmente desde los:",
    options: [
      "4 800 m s.n.m. hasta la cumbre del Huascarán a 6 768 m s.n.m.",
      "3 500 m s.n.m. hasta las mesetas altiplánicas de 4 000 m s.n.m.",
      "1 000 m s.n.m. hasta los valles interandinos de 2 300 m s.n.m.",
      "400 m s.n.m. hasta la naciente de los ríos amazónicos a 800 m s.n.m."
    ],
    correctIndex: 0,
    explanation: "Janca abarca desde la isoterma de 4 800 m s.n.m. hasta la cota máxima del Perú en el nevado Huascarán (6 768 m s.n.m.)."
  },
  {
    id: "geo_t08_s02_c04",
    question: "¿Qué ave emblemática de los Andes domina el espacio aéreo de las regiones Janca y Puna?",
    options: [
      "El gallito de las rocas (*Rupicola peruvianus*).",
      "El zarcillo costero (*Larosterna inca*).",
      "El Cóndor andino (*Vultur gryphus*).",
      "El flamenco o parihuana boreal."
    ],
    correctIndex: 2,
    explanation: "El cóndor andino habita y anida en los riscos inaccesibles de la región Janca o Cordillera, sobrevolando las mesetas de la Puna."
  },
  {
    id: "geo_t08_s02_c05",
    question: "Toponímicamente, el nombre 'Rupa Rupa' (400 a 1 000 m s.n.m.) significa en quechua:",
    options: [
      "Ardiente o lo que está caliente y quema.",
      "Tierra blanca de nieve resplandeciente.",
      "Llanura pantanosa donde abundan peces sabrosos.",
      "Desierto salobre de vientos tempestuosos."
    ],
    correctIndex: 0,
    explanation: "Rupa Rupa proviene del quechua 'rupha' que denota algo caliente, ardiente y encendido, aludiendo a su clima cálido y húmedo."
  },
  {
    id: "geo_t08_s02_c06",
    question: "En la geomorfología de la región Rupa Rupa (Selva Alta), los cañones profundos por donde los ríos rompen las cadenas montañosas se denominan:",
    options: [
      "Tahuampas.",
      "Pongos.",
      "Restingas.",
      "Tablazos."
    ],
    correctIndex: 1,
    explanation: "Los pongos (del quechua 'punku', puerta) son profundos desfiladeros labrados por ríos caudalosos en los flancos montañosos de la Selva Alta."
  },
  {
    id: "geo_t08_s02_c07",
    question: "¿A qué región natural corresponden tanto el ave nacional (Gallito de las Rocas) como el árbol nacional (Árbol de la Quina) del Perú?",
    options: [
      "Quechua.",
      "Omagua.",
      "Rupa Rupa o Selva Alta.",
      "Suni o Jalca."
    ],
    correctIndex: 2,
    explanation: "Tanto el Gallito de las Rocas (*Rupicola peruvianus*) como el Árbol de la Quina (*Cinchona officinalis*) son especies nativas emblemáticas de la región Rupa Rupa."
  },
  {
    id: "geo_t08_s02_c08",
    question: "En la llanura de la región Omagua (Selva Baja), las terrazas no inundables donde se asientan las principales ciudades se denominan:",
    options: [
      "Altos.",
      "Tahuampas.",
      "Restingas.",
      "Filos."
    ],
    correctIndex: 0,
    explanation: "Los 'Altos' son colinas y terrazas fluviales que jamás se inundan con las crecidas de los ríos amazónicos, sirviendo de asiento a urbes como Iquitos y Pucallpa."
  },
  {
    id: "geo_t08_s02_c09",
    question: "¿Qué pez gigante de agua dulce, representativo de la fauna ictiológica de la región Omagua, puede superar los dos metros de longitud?",
    options: [
      "La trucha arcoíris.",
      "La anchoveta.",
      "El bagre de torrente.",
      "El Paiche (*Arapaima gigas*)."
    ],
    correctIndex: 3,
    explanation: "El Paiche (*Arapaima gigas*) es el pez escamado de agua dulce más voluminoso de la Amazonía, habitante fundamental de los ecosistemas lénticos de Omagua."
  },
  {
    id: "geo_t08_s02_c10",
    question: "¿Cuál es el árbol más alto del bosque tropical amazónico peruano (región Omagua), pudiendo alcanzar más de 60 metros de altura?",
    options: [
      "La Lupuna (*Ceiba pentandra*).",
      "El queñual de alta cumbre.",
      "El molle serrano.",
      "El mangle rojo de estero."
    ],
    correctIndex: 0,
    explanation: "La lupuna (*Ceiba pentandra*) se erige como el árbol emergente más imponente de la Selva Baja u Omagua, sobrepasando los 60 metros de altura."
  }
];

function buildFile() {
  let out = `package geografia\n\n`;
  out += `import com.clase.app.data.model.LessonNode\n`;
  out += `import com.clase.app.data.model.LessonTheory\n`;
  out += `import com.clase.app.data.model.Challenge\n\n`;
  out += `object GeografiaSemana08 {\n`;
  out += `    val lessons: List<LessonNode> = listOf(\n`;

  const lessons = [
    {
      id: "geo_t08_s01",
      title: "3.1. Origen, Criterios y Pisos Ecológicos Occidentales (Chala a Suni)",
      theory: {
        title: "Origen, Criterios y Pisos Ecológicos Occidentales (Chala a Suni)",
        content: theoryS01
      },
      challenges: challengesS01
    },
    {
      id: "geo_t08_s02",
      title: "3.2. Pisos de Alta Montaña y Vertiente Amazónica (Puna, Janca, Rupa Rupa y Omagua)",
      theory: {
        title: "Pisos de Alta Montaña y Vertiente Amazónica (Puna, Janca, Rupa Rupa y Omagua)",
        content: theoryS02
      },
      challenges: challengesS02
    }
  ];

  out += lessons.map(l => {
    let lStr = `        LessonNode(\n`;
    lStr += `            id = ${JSON.stringify(l.id)},\n`;
    lStr += `            title = ${JSON.stringify(l.title)},\n`;
    lStr += `            theory = LessonTheory(\n`;
    lStr += `                title = ${JSON.stringify(l.theory.title)},\n`;
    lStr += `                content = ${JSON.stringify(l.theory.content)}\n`;
    lStr += `            ),\n`;
    lStr += `            challenges = listOf(\n`;

    const chStr = l.challenges.map(c => {
      let cStr = `                Challenge(\n`;
      cStr += `                    id = ${JSON.stringify(c.id)},\n`;
      cStr += `                    question = ${JSON.stringify(c.question)},\n`;
      cStr += `                    options = listOf(\n`;
      cStr += c.options.map(opt => `                        ${JSON.stringify(opt)}`).join(',\n') + '\n';
      cStr += `                    ),\n`;
      cStr += `                    correctIndex = ${c.correctIndex},\n`;
      cStr += `                    explanation = ${JSON.stringify(c.explanation)}\n`;
      cStr += `                )`;
      return cStr;
    }).join(',\n');

    lStr += chStr + '\n';
    lStr += `            )\n`;
    lStr += `        )`;
    return lStr;
  }).join(',\n');

  out += `\n    )\n`;
  out += `}\n`;

  fs.writeFileSync('SALIDA_KOTLIN/geografia/GeografiaSemana08.kt', out, 'utf8');
  console.log("GeografiaSemana08.kt written successfully!");
}

buildFile();
