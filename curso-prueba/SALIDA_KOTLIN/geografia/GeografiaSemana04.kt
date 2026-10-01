package geografia

object GeografiaSemana04 {

    val lessons = listOf(
        LessonNode(
            id = "geo_t04_s01",
            subjectId = "geografia",
            semana = 4,
            subtema = "4.1",
            title = "3.1. Estructura Interna de la Geósfera",
            theory = LessonTheory(
                content = """### Matriz de Aprendizajes Esperados (Estándar UNSA / UNMSM-DECO / UNI)
* **Conceptual:** Identificar la estructura concéntrica de la geósfera (corteza, manto y núcleo) y sus discontinuidades sísmicas primarias y secundarias. Diferenciar los procesos endógenos constructores de relieve (diastrofismo: orogénesis y epirogénesis; vulcanismo y sismicidad) de los procesos exógenos modeladores (meteorización física/química y fases de degradación-agradación en la erosión).
* **Procedimental:** Explicar la tectónica de placas en el borde convergente peruano (subducción de la Placa de Nazca bajo la Sudamericana) y clasificar las geoformas resultantes de la erosión fluvial, eólica, glaciar, marina y kárstica.
* **Actitudinal / Crítico:** Evaluar la vulnerabilidad sísmica y volcánica del sur peruano (Arequipa, Moquegua, Tacna), promoviendo una cultura de gestión prospectiva del riesgo de desastres.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    GEOS["La Dinámica de la Geósfera"] --> ESTR_INT["Estructura de la Geósfera"]
    GEOS --> GEOD_INT["Geodinámica Interna (Fuerzas Endógenas)"]
    GEOS --> GEOD_EXT["Geodinámica Externa (Fuerzas Exógenas)"]

    ESTR_INT --> CORT["Corteza (Litósfera): SIAL (Continental) y SIMA (Oceánica)<br/>Discontinuidad de Conrad"]
    ESTR_INT --> DISC_MOHO["Discontinuidad de Mohorovičić (1er Orden)"]
    ESTR_INT --> MANT["Manto (Mesósfera): Superior (Astenósfera) e Inferior (Pirósfera)<br/>Discontinuidad de Repetti"]
    ESTR_INT --> DISC_GUT["Discontinuidad de Gutenberg (1er Orden)"]
    ESTR_INT --> NUC["Núcleo (Endósfera/NIFE): Externo (Líquido) e Interno (Sólido)<br/>Discontinuidad de Lehmann-Wiechert"]

    GEOD_INT --> DIAST["Diastrofismo: Epirogénesis (Isostasia) y Orogénesis (Plegamientos y Fallas)"]
    GEOD_INT --> VULC["Vulcanismo: Intrusivo (Batolitos, Lacolitos) y Extrusivo (Volcanes, Lava)"]
    GEOD_INT --> SISM["Sismicidad: Hipocentro, Epicentro, Ondas Sísmicas (P, S, L, R)"]

    GEOD_EXT --> MET["Meteorización (In situ):<br/>Física (Gelifracción, Termoclastia) y Química (Oxidación, Carbonatación)"]
    GEOD_EXT --> EROS["Erosión (Degradación + Transporte + Agradación):<br/>Fluvial, Glaciar, Eólica, Marina, Kárstica"]
```

---



### 3.1. Estructura Interna de la Geósfera

La geósfera es la porción mineral y sólida del planeta Tierra. Su estudio se realiza mediante métodos directos (perforaciones petrolíferas de hasta \approx 12.3\text{ km} en la península de Kola, erupciones volcánicas) y métodos indirectos (análisis de la propagación y refracción de las **ondas sísmicas P y S**, gravimetría y geomagnetismo).

#### A. Las Capas Concéntricas de la Tierra
1. **La Corteza Terrestre (Litósfera u Oxiesfera):**
   * Es la capa más superficial, delgada y fría (1\% del volumen terrestre).
   * Se divide en dos subcapas:
     * **SIAL (Corteza Continental):** Compuesta predominantemente por **Silicio y Aluminio**. Rocas ácidas graníticas. Constituye la base de los continentes y cordilleras. Densidad media: 2.7\text{ g/cm}^3.
     * *Discontinuidad de Conrad:* Separa el SIAL del SIMA.
     * **SIMA (Corteza Oceánica):** Compuesta por **Silicio y Magnesio**. Rocas básicas basálticas. Forma el fondo oceánico y sirve de soporte al SIAL. Densidad media: 3.0\text{ g/cm}^3.
2. **El Manto Terrestre (Mesósfera):**
   * Capa intermedia que representa el **82\% del volumen** y el 65\% de la masa terrestre.
   * Compuesto por silicatos de hierro y magnesio (peridotita).
   * Se divide en:
     * **Manto Superior (Astenósfera):** Estado plástico/semifluido (T \approx 1\,500 - 2\,000^\circ\text{C}). En él ocurren las **corrientes de convección del magma**, motor térmico que desplaza a las placas tectónicas.
     * *Discontinuidad de Repetti:* Separa el Manto Superior del Manto Inferior.
     * **Manto Inferior (Pirósfera):** Estado sólido de alta densidad, rico en óxidos densos de silicio y magnesio.
3. **El Núcleo Terrestre (Endósfera, Barósfera, Siderósfera o NIFE):**
   * Ocupa el centro geocéntrico (16\% del volumen, pero más del 30\% de la masa).
   * Compuesto fundamentalmente por **Níquel y Hierro (NIFE)**.
   * Se divide en:
     * **Núcleo Externo:** Estado **líquido** (T \approx 4\,000 - 5\,000^\circ\text{C}). La circulación de hierro líquido conductor genera el **campo magnético terrestre** (efecto dínamo o magnetósfera). Las ondas S no lo atraviesan.
     * *Discontinuidad de Lehmann-Wiechert:* Separa el Núcleo Externo del Núcleo Interno.
     * **Núcleo Interno:** Estado **sólido metálico** debido a la colosal presión litostática (> 3.5\text{ millones de atm}), con temperaturas cercanas a los 6\,000^\circ\text{C} (similares a la fotósfera solar).

#### B. Las Discontinuidades Sísmicas
Son zonas de transición abrupta en la velocidad y dirección de las ondas sísmicas debido al cambio de densidad y composición de los materiales:
* **Discontinuidades de Primer Orden (Mayores):**
  1. **Mohorovičić:** Límite entre la **Corteza** y el **Manto** (\approx 30 - 70\text{ km} bajo continentes).
  2. **Gutenberg:** Límite entre el **Manto** y el **Núcleo** (\approx 2\,900\text{ km} de profundidad).
* **Discontinuidades de Segundo Orden (Menores):**
  1. **Conrad:** Límite entre **SIAL** y **SIMA**.
  2. **Repetti:** Límite entre **Manto Superior** y **Manto Inferior** (\approx 700\text{ km}).
  3. **Lehmann-Wiechert:** Límite entre **Núcleo Externo** y **Núcleo Interno** (\approx 5\,150\text{ km}).

---



### 3.2. Geodinámica Interna (Fuerzas Endógenas)

Procesos impulsados por la energía geotérmica del interior terrestre y las corrientes de convección del manto que **construyen relieve** y elevan la corteza.

#### A. Tectónica de Placas
* **Teoría de la Deriva Continental (Alfred Wegener, 1912):** Planteó que hace 250 millones de años los continentes formaban un supercontinente llamado **Pangea** rodeado por el océano **Panthalassa**. Argumentó pruebas paleontológicas (fósiles de *Mesosaurus* y *Glossopteris*), morfológicas (encaje Sudamérica-África) y paleoclimáticas.
* **Teoría de la Expansión del Fondo Oceánico (Harry Hess, 1962):** El magma asciende por las dorsales oceánicas, generando nueva corteza marina que empuja los fondos.
* **Tipos de Límites de Placas:**
  1. **Límites Divergentes (Constructivos):** Dos placas se separan. Se forma magma nuevo en dorsales oceánicas (Dorsal Mesoatlántica) o rifts continentales (Rift Valley africano).
  2. **Límites Convergentes (Destructivos):** Dos placas colisionan:
     * *Subducción (Oceánica bajo Continental):* La placa oceánica más densa se hunde en la astenósfera, generando fosas marinas profundas, sismicidad y cordilleras volcánicas (e.g., Placa de Nazca subduciendo bajo la Placa Sudamericana, formando la **Cordillera de los Andes**).
     * *Colisión Continental (Obducción):* Dos placas continentales chocan, arrugando la corteza sin subducción profunda y formando cadenas colosales (e.g., Placa Índica contra Placa Euroasiática \to **Himalaya**).
  3. **Límites Transformantes (Conservativos):** Desplazamiento lateral tangencial sin creación ni destrucción de corteza (e.g., **Falla de San Andrés** en California).

#### B. Diastrofismo
1. **Epirogénesis (Movimientos Verticales Continentales):**
   * Fuerzas radiales ascendentes o descendentes de gran radio de curvatura que afectan a masas continentales estables (cratones o escudos).
   * Regulados por la **Isostasia** (equilibrio gravitacional hidrostático de la corteza flotando sobre el manto denso, formulada por Airy y Pratt).
   * *Consecuencias:* Formación de acantilados escalonados, emersión de **tablazos** (playas fósiles levantadas con reservas petrolíferas en la costa norte peruana: Zorritos, Lobitos, La Brea y Pariñas).
2. **Orogénesis (Movimientos Horizontales y Compresivos):**
   * Fuerzas tectónicas que pliegan o fracturan la corteza en zonas geosinclinales, originando montañas y cordilleras.
   * **Plegamientos:** Si las rocas son plásticas y sedimentarias:
     * *Anticlinal:* Porción convexa o arqueada hacia arriba (origina cumbres y montañas).
     * *Sinclinal:* Porción cóncava o arqueada hacia abajo (origina valles y depresiones).
   * **Fallamientos:** Si las rocas son rígidas, se quiebran y desplazan a lo largo de un plano de falla:
     * *Horst (Pilar tectónico):* Bloque elevado entre dos fallas normales (forma mesetas y mesetas altiplánicas).
     * *Graben (Fosa tectónica):* Bloque hundido entre dos fallas normales (alberga lagos como el **Titicaca** o el Mar Muerto).

#### C. Vulcanismo o Magmatismo
* **Vulcanismo Intrusivo (Plutónico):** El magma se consolida y enfría lentamente en el interior de la corteza:
  * *Batolito:* Masa intrusiva de escala regional gigantesca (> 100\text{ km}^2), base de las cordilleras (e.g., Batolito de la Costa del Perú).
  * *Lacolito:* Hongo magmático que levanta los estratos superiores.
  * *Dique:* Masa tabular que corta verticalmente los estratos rocosos.
  * *Sill (Manto):* Lámina magmática consolidada horizontalmente entre estratos.
* **Vulcanismo Extrusivo (Volcánico):** El magma alcanza la superficie a través de chimeneas y cráteres expulsando lava, cenizas, lapilli y gases piroclásticos.
  * Tipos de volcanes peruanos: Estratovolcanes andesíticos (Ubinas, Sabancaya, Misti, Coropuna, Tutupaca).

#### D. Sismicidad
* **Definición:** Liberación repentina de energía elástica acumulada en las rocas a lo largo de una falla por deformación tectónica (**Teoría del Rebote Elástico de Reid**).
* **Puntos Clave:**
  * **Hipocentro (Foco):** Punto en el interior de la geósfera donde se inicia la fractura y ruptura de rocas.
  * **Epicentro:** Punto de la superficie terrestre ubicado en la vertical sobre el hipocentro, donde el sismo se siente con mayor intensidad y primero.
* **Ondas Sísmicas:**
  * *Ondas de Cuerpo (Internas):*
    * **Ondas P (Primarias / Longitudinales):** Compresionales, las más veloces (V \approx 6 - 8\text{ km/s}), viajan a través de sólidos y líquidos.
    * **Ondas S (Secundarias / Transversales):** De cizalla o corte, más lentas (V \approx 3.5 - 4.5\text{ km/s}), **solo viajan a través de sólidos**. No atraviesan el núcleo externo.
  * *Ondas Superficiales (Provocan los daños en superficie):*
    * **Ondas Rayleigh (R):** Movimiento elíptico retrógrado (similar a olas marinas).
    * **Ondas Love (L):** Movimiento horizontal serpentino de vaivén perpendicular a la dirección de propagación. Son las más destructivas para las estructuras de ingeniería.
* **Escalas de Medición:**
  * **Escala de Richter (Magnitud Local - M_L / Magnitud de Momento - M_w):** Mide la **energía liberada** en el hipocentro mediante sismógrafos. Es una escala logarítmica cuantitativa abierta (un aumento de 1 grado representa \approx 31.6 veces más energía liberada).
  * **Escala de Mercalli Modificada (Intensidad):** Mide los **efectos, daños y percepción humana** en la superficie. Escala cualitativa cerrada en números romanos del **I al XII** (I: imperceptible; XII: catástrofe total).

---



## 4. FORMULARIO MAESTRO / CUADRO SINÓPTICO



### Matriz Comparativa de Capas y Discontinuidades de la Geósfera

| Capa | Subcapas | Densidad Media | Estado Físico | Discontinuidad Superior | Discontinuidad Inferior | Elementos Predominantes |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Corteza** | SIAL (Continental)<br/>SIMA (Oceánica) | 2.7\text{ g/cm}^3<br/>3.0\text{ g/cm}^3 | Sólido rígido | Superficie terrestre | **Mohorovičić** (1er orden) | Si, Al, O, Mg<br/>(Rocas graníticas y basálticas) |
| **Manto** | Superior (Astenósfera)<br/>Inferior (Pirósfera) | 3.5\text{ g/cm}^3<br/>5.6\text{ g/cm}^3 | Plástico/fluido<br/>Sólido | Mohorovičić | **Gutenberg** (1er orden) | Fe, Mg, Si<br/>(Peridotitas, corrientes de convección) |
| **Núcleo** | Externo<br/>Interno | 10.0\text{ g/cm}^3<br/>13.6\text{ g/cm}^3 | **Líquido**<br/>**Sólido** | Gutenberg | Centro terrestre (6\,378\text{ km}) | Fe, Ni (NIFE)<br/>(Genera magnetósfera) |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: Las 5 Discontinuidades Sísmicas en Orden Descendente
**"CO-MO-RE-GU-LE"**
* **CO** \rightarrow **CO**nrad (SIAL - SIMA)
* **MO** \rightarrow **MO**horovičić (Corteza - Manto)
* **RE** \rightarrow **RE**petti (Manto Superior - Manto Inferior)
* **GU** \rightarrow **GU**tenberg (Manto - Núcleo)
* **LE** \rightarrow **LE**hmann (Núcleo Externo - Núcleo Interno)

*Frase clave:* **"COMO REsto GUiso LEchero"**.



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

* ⚠️ **Trampa 1: El Núcleo Externo es Líquido, no Sólido:**
  * El núcleo interno es sólido por la altísima presión, pero el núcleo externo es **líquido**, razón por la cual las ondas sísmicas transversales (S) no pueden propagarse a través de él.
* ⚠️ **Trampa 2: La diferencia entre Hipocentro y Epicentro:**
  * **Hipocentro:** Punto focal subterráneo real (origen geofísico de la fractura).
  * **Epicentro:** Proyección en la superficie terrestre directamente sobre el foco (lugar geográfico donde primero se percibe).
* ⚠️ **Trampa 3: Los Tablazos no se forman por orogénesis:**
  * Los tablazos de la costa peruana (Piura, Tumbes) se forman por **epirogénesis** (movimientos verticales de ajuste isostático marino lento), no por plegamiento orogénico.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO



### Caso de Estudio DECO: El Cinturón de Fuego del Pacífico y la Vulnerabilidad del Sur Peruano
El territorio peruano forma parte del **Cinturón de Fuego del Pacífico**, donde se concentra más del 85\% de la actividad sísmica del planeta:
1. **Mecanismo Tectónico:** La Placa de Nazca se desplaza hacia el este a una tasa de \approx 6 - 7\text{ cm/año}, colisionando y subduciendo bajo la Placa Sudamericana a lo largo de la Fosa Peruano-Chilena.
2. **Consecuencia Geológica:** Esta fricción acumula tensiones elásticas colosales (silencio sísmico en el sur peruano) y alimenta las cámaras magmáticas del Arco Volcánico del Sur (sabana de volcanes activos en Arequipa y Moquegua como el Ubinas y Sabancaya).
3. **Gestión del Riesgo:** El CENEPRED y el IGP emplean redes acelerográficas satelitales y mapas de microzonificación sísmica para restringir construcciones sobre suelos colapsables o rellenos sanitarios en ciudades como Arequipa, Lima e Ica.

---



## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel 1 - Básico Formativo: Estructura de la Geósfera)
**Enunciado:**
La discontinuidad sísmica de primer orden que marca el límite entre la corteza terrestre y el manto superior (astenósfera), donde se registra un incremento abrupto en la velocidad de propagación de las ondas sísmicas longitudinales (P), se denomina:
* A) Discontinuidad de Gutenberg
* B) Discontinuidad de Mohorovičić
* C) Discontinuidad de Conrad
* D) Discontinuidad de Repetti
* E) Discontinuidad de Lehmann

**Solución Paso a Paso:**
1. Las discontinuidades de primer orden son aquellas que separan las tres capas fundamentales de la geósfera.
2. La discontinuidad que separa la corteza del manto fue descubierta en 1909 por el sismólogo croata Andrija Mohorovičić y se conoce como **Discontinuidad de Mohorovičić (Moho)**.
* **Respuesta Correcta:** **B**

---



### Ejercicio 3 (Nivel 3 - Avanzado UNMSM DECO: Tectónica y Vulcanismo)
**Enunciado:**
Durante los últimos años, el Instituto Geológico, Minero y Metalúrgico (INGEMMET) ha monitoreado la constante emisión de cenizas y gases piroclásticos en el volcán Sabancaya (Arequipa) y Ubinas (Moquegua). Desde una perspectiva geodinámica global, el origen causal de este vulcanismo extrusivo en la Cordillera Occidental del sur peruano se debe a:
* A) La divergencia entre la Placa Antártica y la Placa de Cocos.
* B) La subducción de la Placa oceánica de Nazca bajo la Placa continental Sudamericana.
* C) El deslizamiento transcurrente de la Falla de San Andrés.
* D) La fracturación isostática del Cratón Amazónico.
* E) La formación de un punto caliente intraplaca o pluma del manto similar a Hawái.

**Solución Paso a Paso:**
1. La costa y cordillera del Perú se sitúan en un borde de placa convergente destructivo.
2. La placa oceánica de **Nazca** se hunde (subduce) bajo la placa continental **Sudamericana**. Al descender a profundidades de más de 100\text{ km}, el agua atrapada y la litósfera oceánica se funden parcialmente en la astenósfera, generando magmas andesíticos que ascienden boyantes formando el arco volcánico andino.
* **Respuesta Correcta:** **B**

---



### Ejercicio 4 (Nivel 4 - Crítico / Interdisciplinario UNI: Ondas Sísmicas y Núcleo)
**Enunciado:**
Cuando se produce un sismo de gran magnitud, los sismógrafos situados en estaciones ubicadas entre los 103^\circ y 142^\circ de distancia angular desde el epicentro no registran ondas P directas, y ninguna estación situada a más de 103^\circ registra ondas S directas (zona de sombra sísmica). ¿Qué conclusión fundamental sobre el interior de la Tierra se dedujo a partir del comportamiento de las ondas transversales (S) en esta zona de sombra?
* A) Que el manto inferior es enteramente hueco y carece de minerales densos.
* B) Que el núcleo externo se encuentra en estado líquido, impidiendo el paso de ondas de cizalla.
* C) Que la corteza continental tiene un espesor constante de 100\text{ km} en todo el globo.
* D) Que el núcleo interno gira en sentido contrario al movimiento de rotación terrestre.
* E) Que las ondas sísmicas aumentan de velocidad en medios gaseosos de la atmósfera.

**Solución Paso a Paso:**
1. Las ondas S son ondas transversales de corte que requieren rigidez elástica en el medio de propagación; por tanto, **solo pueden transmitirse a través de materiales en estado sólido**.
2. Al llegar a la discontinuidad de Gutenberg a 2\,900\text{ km} de profundidad, las ondas S se extinguen por completo y no logran atravesar el **núcleo externo**.
3. Este hecho demostró científicamente que el núcleo externo de la Tierra se encuentra en **estado líquido**.
* **Respuesta Correcta:** **B**

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Astenósfera:** Capa superior del manto terrestre constituida por rocas plásticas y semifundidas donde se desarrollan las corrientes de convección que desplazan a las placas litosféricas.
2. **Isostasia:** Condición de equilibrio hidrostático y gravitacional entre la corteza terrestre ligera y el manto subyacente más denso.
3. **Subducción:** Proceso tectónico por el cual una placa litosférica oceánica más densa desciende por debajo de una placa continental hacia el manto.
4. **Horst:** Bloque de corteza terrestre elevado entre dos fallas paralelas, también denominado pilar tectónico.
5. **Graben:** Bloque de corteza hundido entre dos o más fallas normales paralelas; fosa tectónica que suele albergar lagos.
6. **Hipocentro:** Foco o punto en el interior de la corteza donde se produce la fractura inicial y liberación de energía de un terremoto.
7. **Epicentro:** Punto de la superficie terrestre situado en la vertical exacta sobre el hipocentro de un sismo.
8. **Gelifracción (Crioclastia):** Proceso de meteorización física mediante el cual el agua se congela en las fisuras de las rocas, fracturándolas al expandirse.
9. **Pongo:** Cañón o garganta fluvial profunda y estrecha abierta por un río al erosionar una cadena montañosa en la selva alta peruana.
10. **Estalactita:** Geoforma kárstica cónica de agradación que se forma en el techo de las cavernas por el goteo y precipitación de carbonato de calcio.

---



## 11. BANCO DE FLASHCARDS (Q/A)

* **PREGUNTA:** ¿Cuáles son las dos subcapas que componen la corteza terrestre y qué elementos químicos las caracterizan?
  * **RESPUESTA:** El SIAL (corteza continental: Silicio y Aluminio) y el SIMA (corteza oceánica: Silicio y Magnesio).
* **PREGUNTA:** ¿Qué discontinuidad separa la corteza del manto y cuál separa el manto del núcleo?
  * **RESPUESTA:** Mohorovičić separa corteza de manto; Gutenberg separa manto de núcleo.
* **PREGUNTA:** ¿En qué estado físico se encuentra el núcleo externo y qué fenómeno geofísico genera?
  * **RESPUESTA:** Se encuentra en estado líquido; su circulación de hierro metálico genera el campo magnético terrestre (magnetósfera).
* **PREGUNTA:** ¿Qué placas tectónicas interactúan frente a la costa del Perú y qué tipo de borde forman?
  * **RESPUESTA:** La Placa de Nazca y la Placa Sudamericana, formando un límite convergente de subducción.
* **PREGUNTA:** ¿Cuál es la diferencia entre orogénesis y epirogénesis?
  * **RESPUESTA:** La orogénesis produce movimientos horizontales que pliegan o fracturan cordilleras; la epirogénesis produce movimientos verticales lentos que elevan o hunden masas continentales (tablazos).
* **PREGUNTA:** ¿Cómo se llama la parte arqueada hacia arriba en un plegamiento y cómo la parte arqueada hacia abajo?
  * **RESPUESTA:** La cresta arqueada hacia arriba es el anticlinal; la parte cóncava hacia abajo es el sinclinal.
* **PREGUNTA:** ¿Por qué las ondas sísmicas S no pueden atravesar el núcleo externo?
  * **RESPUESTA:** Porque son ondas de cizalla o corte que únicamente se propagan a través de materiales sólidos, y el núcleo externo es líquido.
* **PREGUNTA:** ¿En qué se diferencia la meteorización física de la química?
  * **RESPUESTA:** La física desintegra mecánicamente la roca sin alterar su composición mineralógica; la química altera y descompone las moléculas minerales de la roca.
* **PREGUNTA:** ¿Qué diferencia geomorfológica presenta un valle fluvial frente a un valle glaciar?
  * **RESPUESTA:** El valle fluvial tiene perfil en "V"; el valle glaciar tiene fondo plano y laderas escarpadas en forma de "U" (artesa).
* **PREGUNTA:** ¿Qué escala mide la energía liberada por un sismo y cuál mide sus daños e intensidad?
  * **RESPUESTA:** Richter (o Magnitud de Momento) mide la energía liberada; Mercalli Modificada mide los daños e intensidad perceptiva.

---



### 3.3. Geodinámica Externa (Fuerzas Exógenas)

Procesos impulsados por la radiación solar y la gravedad que **destruyen, desgastan, modelan y nivelan el relieve terrestre** a través del intemperismo y la erosión.

#### A. Meteorización (Intemperismo)
Destrucción, desintegración y alteración físico-química de las rocas *in situ* (sin transporte de materiales):
1. **Meteorización Mecánica o Física:** Desintegra la roca en fragmentos menores sin alterar su composición mineralógica:
   * *Gelifracción o Crioclastia:* El agua se infiltra en las fisuras, se congela aumentando su volumen en un 9\% y fractura la roca (típica de la región Puna y Janca).
   * *Termoclastia:* Dilatación y contracción térmica diferencial entre el día y la noche en zonas desérticas.
   * *Haloclastia:* Crecimiento de cristales de sal en los poros rocosos.
   * *Bioclastia:* Fracturación por crecimiento de raíces de árboles.
2. **Meteorización Química:** Modifica y descompone la estructura química de los minerales de la roca:
   * *Oxidación:* Reacción del oxígeno disuelto con minerales ricos en hierro (formación de hematita y limonita de color rojizo/amarillento).
   * *Carbonatación:* El agua combinada con dióxido de carbono (H_2CO_3) disuelve rocas calcáreas (calizas).
   * *Hidratación y Disolución:* Incorporación de moléculas de agua a la red cristalina de minerales como el sulfato de calcio.

#### B. Erosión (Modelado del Relieve)
Proceso dinámico que comprende tres fases secuenciales: **Degradación** (desgaste y remoción) \to **Transporte** (acarreo) \to **Agradación o Sedimentación** (depósito).

| Agente Erosivo | Geoformas por Degradación (Desgaste) | Geoformas por Agradación (Sedimentación) |
| :--- | :--- | :--- |
| **Fluvial** (Ríos) | Valles en "V", cañones (Colca, Cotahuasi), gargantas, pongos (Manseriche, Rentema), cataratas, meandros. | Valles aluviales, llanuras de inundación, conos de deyección o abanicos aluviales, terrazas fluviales, deltas y estuarios. |
| **Glaciar** (Hielos) | Valles en "U", circos glaciares, picos piramidales (horns), aristas, fiordos. | Morrenas (laterales, centrales, frontales), drumlins, bloques erráticos, llanuras fluvioglaciares. |
| **Eólica** (Vientos) | Pedestales rocosos (rocas hongo), ventifactos, tafonis, yardangs, depresiones de deflación. | Dunas (barjanes, transversales), médanos, campos de loess (suelos fértiles). |
| **Marina** (Olas y Mareas) | Acantilados costeros, arcos marinos, farallones, ensenadas, bufaderos o cuevas marinas. | Playas de arena, cordones litorales, tómbolos, espigas litorales, albuferas. |
| **Kárstica** (Aguas Subterráneas en caliza) | Cavernas subterráneas, grutas, dolinas, simas, puentes naturales, lapiaces o lenares. | Estalactitas (techo), estalagmitas (suelo), estalagnatos (columnas completas de fusión). |

---



### Ejercicio 5 (Nivel 5 - Boss Challenge: Geomorfología y Análisis Diastrófico DECO)
**Enunciado:**
Lea con detenimiento el siguiente reporte técnico geomorfológico sobre el territorio peruano:
*"En la costa norte del departamento de Piura se extienden amplias mesetas escalonadas conocidas como tablazos de Máncora y Lobitos, las cuales contienen importantes terrazas marinas fósiles con presencia de restos de moluscos del Pleistoceno y ricas cuencas hidrocarburíferas. Por su parte, en el sur andino, la meseta del Collao alberga al lago Titicaca flanqueado por fallas geológicas normales que limitan fosas tectónicas, mientras que en la Cordillera de Huayhuash se aprecian valles en forma de artesa con morrenas terminales y circos glaciares".*

A partir de la lectura y aplicando la teoría de la geodinámica terrestre, determine el valor de verdad (V) o falsedad (F) de las siguientes proposiciones:
I. Los tablazos piuranos se han originado por movimientos epirogénicos de levantamiento isostático continental.  
II. La depresión donde se asienta la cuenca del lago Titicaca es un graben o fosa tectónica originada por orogénesis de fallamiento.  
III. Los circos y valles en artesa de Huayhuash son geoformas de agradación producidas por la acción química del agua subterránea.  
IV. La presencia de petróleo en los tablazos se debe a que antiguamente constituyeron fondos marinos receptores de materia orgánica sedimentada.

* A) V - V - F - V
* B) V - F - F - V
* C) F - V - V - F
* D) V - V - V - V
* E) F - F - V - V

**Solución Paso a Paso:**
1. **Evaluación de I:** Los tablazos son terrazas marinas sobreelevadas por lentos movimientos epirogénicos verticales (isostáticos) a razón de unos 25\text{ cm} por siglo. (Verdadero).
2. **Evaluación de II:** La meseta del Collao y la cuenca del Titicaca constituyen un clásico graben o fosa tectónica hundida entre bloques elevados (horst) de la cordillera. (Verdadero).
3. **Evaluación de III:** Los circos y valles en artesa (forma de "U") son geoformas de **degradación (desgaste) glaciar**, no de agradación ni de origen kárstico. (Falso).
4. **Evaluación de IV:** Los tablazos fueron fondos marinos costeros donde el plancton y materia orgánica quedaron sepultados bajo sedimentos antes de la emersión, originando los reservorios de petróleo y gas natural. (Verdadero).
* Conclusión: V - V - F - V.
* **Respuesta Correcta:** **A**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geo_t04_s01_c01",
                    question = "La corteza terrestre o litosfera está dividida geoquímicamente en dos capas concéntricas con propiedades litológicas distintas denominadas:",
                    options = listOf(
                        "Astenosfera y Pirosfera",
                        "Endosfera y Mesosfera",
                        "Zona fótica y afótica",
                        "SIAL (corteza continental granítica) y SIMA (corteza oceánica basáltica)",
                    ),
                    correctIndex = 3,
                    explanation = "El SIAL (compuesto predominantemente de sílice y aluminio) forma los bloques continentales con rocas graníticas livianas; el SIMA (sílice y magnesio) constituye el fondo de los océanos y la base sobre la que descansan los continentes con rocas basálticas más densas."
                ),
                Challenge(
                    id = "geo_t04_s01_c02",
                    question = "La discontinuidad sísmica de primer orden que separa la corteza terrestre del manto superior, donde las ondas sísmicas P y S aumentan bruscamente de velocidad, es la:",
                    options = listOf(
                        "Discontinuidad de Mohorovičić (Moho)",
                        "Discontinuidad de Conrad",
                        "Discontinuidad de Gutenberg",
                        "Discontinuidad de Lehmann",
                    ),
                    correctIndex = 0,
                    explanation = "La discontinuidad de Mohorovičić (Moho) marca el límite inferior de la corteza y el inicio del manto superior peridotítico a profundidades de 30 a 70 km bajo los continentes."
                ),
                Challenge(
                    id = "geo_t04_s01_c03",
                    question = "La capa plástica o semifundida del manto superior sobre la cual flotan y se desplazan las placas litosféricas debido a corrientes de convección térmica se denomina:",
                    options = listOf(
                        "Astenosfera",
                        "Litosfera",
                        "Endosfera",
                        "Barisfera",
                    ),
                    correctIndex = 0,
                    explanation = "La astenosfera (parte del manto superior entre 100 y 350 km) presenta comportamiento dúctil y plástico, permitiendo que las corrientes convectivas arrastren a las placas tectónicas rígidas suprayacentes."
                ),
                Challenge(
                    id = "geo_t04_s01_c04",
                    question = "El núcleo terrestre (NIFE o endosfera) está compuesto predominantemente por una aleación metálica densa de:",
                    options = listOf(
                        "Cobre y Magnesio",
                        "Silicio y Aluminio",
                        "Calcio y Sodio",
                        "Níquel y Hierro (Ferrum)",
                    ),
                    correctIndex = 3,
                    explanation = "El núcleo de la Tierra está constituido en un 85-90% por hierro y níquel, dividido en un núcleo externo líquido (generador del campo geomagnético) y un núcleo interno sólido por inmensa presión."
                ),
                Challenge(
                    id = "geo_t04_s01_c05",
                    question = "La teoría de la Deriva Continental, precursora de la Tectónica de Placas, fue formulada en 1912 por el meteorólogo alemán:",
                    options = listOf(
                        "Harry Hess",
                        "Tuzo Wilson",
                        "Alfred Wegener",
                        "Arthur Holmes",
                    ),
                    correctIndex = 2,
                    explanation = "Alfred Wegener propuso que hace 250 millones de años todos los continentes estuvieron unidos en un supercontinente único llamado Pangea, el cual se fragmentó y derivó sobre el lecho oceánico."
                ),
                Challenge(
                    id = "geo_t04_s01_c06",
                    question = "El levantamiento y origen de la Cordillera de los Andes frente a la costa occidental sudamericana se debe al proceso tectónico de:",
                    options = listOf(
                        "Subducción de la placa oceánica de Nazca bajo la placa continental Sudamericana.",
                        "Divergencia entre la placa Pacífica y la placa Norteamericana.",
                        "Hundimiento epirogénico del cratón amazónico.",
                        "Falla transformante lateral de desgarre pasivo.",
                    ),
                    correctIndex = 0,
                    explanation = "La placa de Nazca (más densa y delgada) converge y subduce bajo la placa Sudamericana, comprimiendo y plegando los sedimentos continentales y provocando vulcanismo y la orogénesis andina."
                ),
                Challenge(
                    id = "geo_t04_s01_c07",
                    question = "En las dorsales oceánicas submarinas (como la dorsal Mesoatlántica), las placas tectónicas experimentan límites de tipo:",
                    options = listOf(
                        "Obducción laminar",
                        "Transformante o pasivo sin creación de corteza",
                        "Divergente o constructivo (con emisión de magma basáltico)",
                        "Convergente o destructivo",
                    ),
                    correctIndex = 2,
                    explanation = "En los límites divergentes, las placas se separan permitiendo el ascenso de magma del manto que solidifica creando nueva corteza oceánica y expandiendo el fondo marino."
                ),
                Challenge(
                    id = "geo_t04_s01_c08",
                    question = "Los movimientos epirogénicos se diferencian de los orogénicos porque los primeros son movimientos:",
                    options = listOf(
                        "Originados por la fuerza del oleaje marino en los litorales.",
                        "Exclusivamente sísmicos de oscilación superficial.",
                        "Horizontales y violentos que pliegan y fracturan cordilleras.",
                        "Verticales, lentos y de gran radio que provocan el ascenso o descenso de masas continentales para recuperar el equilibrio isostático.",
                    ),
                    correctIndex = 3,
                    explanation = "La epirogénesis es un movimiento vertical y lento de grandes bloques continentales (isostasia), originando tablazos marinos por emersión o rías por sumersión, sin plegamiento."
                ),
                Challenge(
                    id = "geo_t04_s01_c09",
                    question = "El punto subterráneo exacto al interior de la corteza donde se origina la fractura o liberación súbita de energía sísmica se denomina:",
                    options = listOf(
                        "Falla escalonada",
                        "Cráter adventicio",
                        "Epicentro",
                        "Hipocentro o foco sísmico",
                    ),
                    correctIndex = 3,
                    explanation = "El hipocentro o foco es el lugar en el interior de la corteza donde se libera la energía; el epicentro es el punto de la superficie terrestre situado verticalmente sobre el hipocentro."
                ),
                Challenge(
                    id = "geo_t04_s01_c10",
                    question = "La 'Cinturón de Fuego del Pacífico' (o Cinturón Circumpacífico) concentra más del 80% de los terremotos y volcanes más activos del mundo debido a:",
                    options = listOf(
                        "La intensa radiación solar recibida en las aguas tropicales del Pacífico.",
                        "La existencia de una falla transformante única que rodea el planeta.",
                        "La continua colisión y subducción de placas oceánicas contra los márgenes continentales circundantes.",
                        "La gran profundidad batimétrica de la fosa de las Marianas.",
                    ),
                    correctIndex = 2,
                    explanation = "El borde del océano Pacífico está flanqueado por zonas de subducción masiva y fosas tectónicas donde las placas oceánicas se hunden bajo los continentes, desatando constante sismicidad y vulcanismo."
                ),
            )
        ),
        LessonNode(
            id = "geo_t04_s02",
            subjectId = "geografia",
            semana = 4,
            subtema = "4.2",
            title = "3.3. Geodinámica Externa (Fuerzas Exógenas)",
            theory = LessonTheory(
                content = """# TEMA 04: Geósfera y Geodinámica Interna y Externa

---



### Matriz de Aprendizajes Esperados (Estándar UNSA / UNMSM-DECO / UNI)
* **Conceptual:** Identificar la estructura concéntrica de la geósfera (corteza, manto y núcleo) y sus discontinuidades sísmicas primarias y secundarias. Diferenciar los procesos endógenos constructores de relieve (diastrofismo: orogénesis y epirogénesis; vulcanismo y sismicidad) de los procesos exógenos modeladores (meteorización física/química y fases de degradación-agradación en la erosión).
* **Procedimental:** Explicar la tectónica de placas en el borde convergente peruano (subducción de la Placa de Nazca bajo la Sudamericana) y clasificar las geoformas resultantes de la erosión fluvial, eólica, glaciar, marina y kárstica.
* **Actitudinal / Crítico:** Evaluar la vulnerabilidad sísmica y volcánica del sur peruano (Arequipa, Moquegua, Tacna), promoviendo una cultura de gestión prospectiva del riesgo de desastres.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    GEOS["La Dinámica de la Geósfera"] --> ESTR_INT["Estructura de la Geósfera"]
    GEOS --> GEOD_INT["Geodinámica Interna (Fuerzas Endógenas)"]
    GEOS --> GEOD_EXT["Geodinámica Externa (Fuerzas Exógenas)"]

    ESTR_INT --> CORT["Corteza (Litósfera): SIAL (Continental) y SIMA (Oceánica)<br/>Discontinuidad de Conrad"]
    ESTR_INT --> DISC_MOHO["Discontinuidad de Mohorovičić (1er Orden)"]
    ESTR_INT --> MANT["Manto (Mesósfera): Superior (Astenósfera) e Inferior (Pirósfera)<br/>Discontinuidad de Repetti"]
    ESTR_INT --> DISC_GUT["Discontinuidad de Gutenberg (1er Orden)"]
    ESTR_INT --> NUC["Núcleo (Endósfera/NIFE): Externo (Líquido) e Interno (Sólido)<br/>Discontinuidad de Lehmann-Wiechert"]

    GEOD_INT --> DIAST["Diastrofismo: Epirogénesis (Isostasia) y Orogénesis (Plegamientos y Fallas)"]
    GEOD_INT --> VULC["Vulcanismo: Intrusivo (Batolitos, Lacolitos) y Extrusivo (Volcanes, Lava)"]
    GEOD_INT --> SISM["Sismicidad: Hipocentro, Epicentro, Ondas Sísmicas (P, S, L, R)"]

    GEOD_EXT --> MET["Meteorización (In situ):<br/>Física (Gelifracción, Termoclastia) y Química (Oxidación, Carbonatación)"]
    GEOD_EXT --> EROS["Erosión (Degradación + Transporte + Agradación):<br/>Fluvial, Glaciar, Eólica, Marina, Kárstica"]
```

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.3. Geodinámica Externa (Fuerzas Exógenas)

Procesos impulsados por la radiación solar y la gravedad que **destruyen, desgastan, modelan y nivelan el relieve terrestre** a través del intemperismo y la erosión.

#### A. Meteorización (Intemperismo)
Destrucción, desintegración y alteración físico-química de las rocas *in situ* (sin transporte de materiales):
1. **Meteorización Mecánica o Física:** Desintegra la roca en fragmentos menores sin alterar su composición mineralógica:
   * *Gelifracción o Crioclastia:* El agua se infiltra en las fisuras, se congela aumentando su volumen en un 9\% y fractura la roca (típica de la región Puna y Janca).
   * *Termoclastia:* Dilatación y contracción térmica diferencial entre el día y la noche en zonas desérticas.
   * *Haloclastia:* Crecimiento de cristales de sal en los poros rocosos.
   * *Bioclastia:* Fracturación por crecimiento de raíces de árboles.
2. **Meteorización Química:** Modifica y descompone la estructura química de los minerales de la roca:
   * *Oxidación:* Reacción del oxígeno disuelto con minerales ricos en hierro (formación de hematita y limonita de color rojizo/amarillento).
   * *Carbonatación:* El agua combinada con dióxido de carbono (H_2CO_3) disuelve rocas calcáreas (calizas).
   * *Hidratación y Disolución:* Incorporación de moléculas de agua a la red cristalina de minerales como el sulfato de calcio.

#### B. Erosión (Modelado del Relieve)
Proceso dinámico que comprende tres fases secuenciales: **Degradación** (desgaste y remoción) \to **Transporte** (acarreo) \to **Agradación o Sedimentación** (depósito).

| Agente Erosivo | Geoformas por Degradación (Desgaste) | Geoformas por Agradación (Sedimentación) |
| :--- | :--- | :--- |
| **Fluvial** (Ríos) | Valles en "V", cañones (Colca, Cotahuasi), gargantas, pongos (Manseriche, Rentema), cataratas, meandros. | Valles aluviales, llanuras de inundación, conos de deyección o abanicos aluviales, terrazas fluviales, deltas y estuarios. |
| **Glaciar** (Hielos) | Valles en "U", circos glaciares, picos piramidales (horns), aristas, fiordos. | Morrenas (laterales, centrales, frontales), drumlins, bloques erráticos, llanuras fluvioglaciares. |
| **Eólica** (Vientos) | Pedestales rocosos (rocas hongo), ventifactos, tafonis, yardangs, depresiones de deflación. | Dunas (barjanes, transversales), médanos, campos de loess (suelos fértiles). |
| **Marina** (Olas y Mareas) | Acantilados costeros, arcos marinos, farallones, ensenadas, bufaderos o cuevas marinas. | Playas de arena, cordones litorales, tómbolos, espigas litorales, albuferas. |
| **Kárstica** (Aguas Subterráneas en caliza) | Cavernas subterráneas, grutas, dolinas, simas, puentes naturales, lapiaces o lenares. | Estalactitas (techo), estalagmitas (suelo), estalagnatos (columnas completas de fusión). |

---



## 4. FORMULARIO MAESTRO / CUADRO SINÓPTICO



### Mnemotecnia 2: Geoformas Kársticas de Agradación
* **EstalacTITA** \rightarrow Viene del **Techo** (termina en **T** de Techo).
* **EstalagMITA** \rightarrow Sube del **Suelo** (termina en **M** de Montículo/suelo).
* **Estalagnato** \rightarrow Columna que une ambas.

---



## 6. TÉCNICAS Y ARTIFICIOS DE RESOLUCIÓN (HACKING PREUNIVERSITARIO)

1. **Distinguir Valles Fluviales de Glaciares al Instante:**
   * Valle con sección transversal en forma de **"V"** \rightarrow Origen **Fluvial** (ríos que erosionan en el fondo con pendiente rápida).
   * Valle con fondo plano y laderas verticales en forma de **"U"** o artesón \rightarrow Origen **Glaciar** (masa de hielo que lima y aplana el valle).
2. **Identificación de Plegamientos vs. Fallamientos:**
   * Si el texto menciona *rocas sedimentarias plásticas, anticlinal, sinclinal* \rightarrow **Plegamiento**.
   * Si menciona *bloque levantado (horst), fosa hundida (graben), rocas cristalinas rígidas, fractura* \rightarrow **Fallamiento**.

---



### Ejercicio 2 (Nivel 2 - Intermedio UNSA Ordinario: Geodinámica Externa y Erosión)
**Enunciado:**
El impresionante Cañón del Colca (Arequipa) y el Cañón de Cotahuasi (La Unión) son gargantas geográficas colosales que presentan perfiles transversales en forma de "V", modelados durante millones de años por la acción destructiva de corrientes de agua continuas. Dichas geoformas corresponden a un proceso de:
* A) Sedimentación eólica
* B) Degradación fluvial
* C) Agradación kárstica
* D) Degradación glaciar
* E) Agradación marina

**Solución Paso a Paso:**
1. Los ríos Colca y Cotahuasi discurren a gran velocidad erosionando verticalmente los estratos rocosos andinos.
2. El desgaste de la roca provocado por las corrientes de agua de los ríos se clasifica formalmente como **degradación fluvial** (erosión fluvial de desgaste).
* **Respuesta Correcta:** **B**

---



### Ejercicio 5 (Nivel 5 - Boss Challenge: Geomorfología y Análisis Diastrófico DECO)
**Enunciado:**
Lea con detenimiento el siguiente reporte técnico geomorfológico sobre el territorio peruano:
*"En la costa norte del departamento de Piura se extienden amplias mesetas escalonadas conocidas como tablazos de Máncora y Lobitos, las cuales contienen importantes terrazas marinas fósiles con presencia de restos de moluscos del Pleistoceno y ricas cuencas hidrocarburíferas. Por su parte, en el sur andino, la meseta del Collao alberga al lago Titicaca flanqueado por fallas geológicas normales que limitan fosas tectónicas, mientras que en la Cordillera de Huayhuash se aprecian valles en forma de artesa con morrenas terminales y circos glaciares".*

A partir de la lectura y aplicando la teoría de la geodinámica terrestre, determine el valor de verdad (V) o falsedad (F) de las siguientes proposiciones:
I. Los tablazos piuranos se han originado por movimientos epirogénicos de levantamiento isostático continental.  
II. La depresión donde se asienta la cuenca del lago Titicaca es un graben o fosa tectónica originada por orogénesis de fallamiento.  
III. Los circos y valles en artesa de Huayhuash son geoformas de agradación producidas por la acción química del agua subterránea.  
IV. La presencia de petróleo en los tablazos se debe a que antiguamente constituyeron fondos marinos receptores de materia orgánica sedimentada.

* A) V - V - F - V
* B) V - F - F - V
* C) F - V - V - F
* D) V - V - V - V
* E) F - F - V - V

**Solución Paso a Paso:**
1. **Evaluación de I:** Los tablazos son terrazas marinas sobreelevadas por lentos movimientos epirogénicos verticales (isostáticos) a razón de unos 25\text{ cm} por siglo. (Verdadero).
2. **Evaluación de II:** La meseta del Collao y la cuenca del Titicaca constituyen un clásico graben o fosa tectónica hundida entre bloques elevados (horst) de la cordillera. (Verdadero).
3. **Evaluación de III:** Los circos y valles en artesa (forma de "U") son geoformas de **degradación (desgaste) glaciar**, no de agradación ni de origen kárstico. (Falso).
4. **Evaluación de IV:** Los tablazos fueron fondos marinos costeros donde el plancton y materia orgánica quedaron sepultados bajo sedimentos antes de la emersión, originando los reservorios de petróleo y gas natural. (Verdadero).
* Conclusión: V - V - F - V.
* **Respuesta Correcta:** **A**

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Astenósfera:** Capa superior del manto terrestre constituida por rocas plásticas y semifundidas donde se desarrollan las corrientes de convección que desplazan a las placas litosféricas.
2. **Isostasia:** Condición de equilibrio hidrostático y gravitacional entre la corteza terrestre ligera y el manto subyacente más denso.
3. **Subducción:** Proceso tectónico por el cual una placa litosférica oceánica más densa desciende por debajo de una placa continental hacia el manto.
4. **Horst:** Bloque de corteza terrestre elevado entre dos fallas paralelas, también denominado pilar tectónico.
5. **Graben:** Bloque de corteza hundido entre dos o más fallas normales paralelas; fosa tectónica que suele albergar lagos.
6. **Hipocentro:** Foco o punto en el interior de la corteza donde se produce la fractura inicial y liberación de energía de un terremoto.
7. **Epicentro:** Punto de la superficie terrestre situado en la vertical exacta sobre el hipocentro de un sismo.
8. **Gelifracción (Crioclastia):** Proceso de meteorización física mediante el cual el agua se congela en las fisuras de las rocas, fracturándolas al expandirse.
9. **Pongo:** Cañón o garganta fluvial profunda y estrecha abierta por un río al erosionar una cadena montañosa en la selva alta peruana.
10. **Estalactita:** Geoforma kárstica cónica de agradación que se forma en el techo de las cavernas por el goteo y precipitación de carbonato de calcio.

---



### 3.1. Estructura Interna de la Geósfera

La geósfera es la porción mineral y sólida del planeta Tierra. Su estudio se realiza mediante métodos directos (perforaciones petrolíferas de hasta \approx 12.3\text{ km} en la península de Kola, erupciones volcánicas) y métodos indirectos (análisis de la propagación y refracción de las **ondas sísmicas P y S**, gravimetría y geomagnetismo).

#### A. Las Capas Concéntricas de la Tierra
1. **La Corteza Terrestre (Litósfera u Oxiesfera):**
   * Es la capa más superficial, delgada y fría (1\% del volumen terrestre).
   * Se divide en dos subcapas:
     * **SIAL (Corteza Continental):** Compuesta predominantemente por **Silicio y Aluminio**. Rocas ácidas graníticas. Constituye la base de los continentes y cordilleras. Densidad media: 2.7\text{ g/cm}^3.
     * *Discontinuidad de Conrad:* Separa el SIAL del SIMA.
     * **SIMA (Corteza Oceánica):** Compuesta por **Silicio y Magnesio**. Rocas básicas basálticas. Forma el fondo oceánico y sirve de soporte al SIAL. Densidad media: 3.0\text{ g/cm}^3.
2. **El Manto Terrestre (Mesósfera):**
   * Capa intermedia que representa el **82\% del volumen** y el 65\% de la masa terrestre.
   * Compuesto por silicatos de hierro y magnesio (peridotita).
   * Se divide en:
     * **Manto Superior (Astenósfera):** Estado plástico/semifluido (T \approx 1\,500 - 2\,000^\circ\text{C}). En él ocurren las **corrientes de convección del magma**, motor térmico que desplaza a las placas tectónicas.
     * *Discontinuidad de Repetti:* Separa el Manto Superior del Manto Inferior.
     * **Manto Inferior (Pirósfera):** Estado sólido de alta densidad, rico en óxidos densos de silicio y magnesio.
3. **El Núcleo Terrestre (Endósfera, Barósfera, Siderósfera o NIFE):**
   * Ocupa el centro geocéntrico (16\% del volumen, pero más del 30\% de la masa).
   * Compuesto fundamentalmente por **Níquel y Hierro (NIFE)**.
   * Se divide en:
     * **Núcleo Externo:** Estado **líquido** (T \approx 4\,000 - 5\,000^\circ\text{C}). La circulación de hierro líquido conductor genera el **campo magnético terrestre** (efecto dínamo o magnetósfera). Las ondas S no lo atraviesan.
     * *Discontinuidad de Lehmann-Wiechert:* Separa el Núcleo Externo del Núcleo Interno.
     * **Núcleo Interno:** Estado **sólido metálico** debido a la colosal presión litostática (> 3.5\text{ millones de atm}), con temperaturas cercanas a los 6\,000^\circ\text{C} (similares a la fotósfera solar).

#### B. Las Discontinuidades Sísmicas
Son zonas de transición abrupta en la velocidad y dirección de las ondas sísmicas debido al cambio de densidad y composición de los materiales:
* **Discontinuidades de Primer Orden (Mayores):**
  1. **Mohorovičić:** Límite entre la **Corteza** y el **Manto** (\approx 30 - 70\text{ km} bajo continentes).
  2. **Gutenberg:** Límite entre el **Manto** y el **Núcleo** (\approx 2\,900\text{ km} de profundidad).
* **Discontinuidades de Segundo Orden (Menores):**
  1. **Conrad:** Límite entre **SIAL** y **SIMA**.
  2. **Repetti:** Límite entre **Manto Superior** y **Manto Inferior** (\approx 700\text{ km}).
  3. **Lehmann-Wiechert:** Límite entre **Núcleo Externo** y **Núcleo Interno** (\approx 5\,150\text{ km}).

---



### 3.2. Geodinámica Interna (Fuerzas Endógenas)

Procesos impulsados por la energía geotérmica del interior terrestre y las corrientes de convección del manto que **construyen relieve** y elevan la corteza.

#### A. Tectónica de Placas
* **Teoría de la Deriva Continental (Alfred Wegener, 1912):** Planteó que hace 250 millones de años los continentes formaban un supercontinente llamado **Pangea** rodeado por el océano **Panthalassa**. Argumentó pruebas paleontológicas (fósiles de *Mesosaurus* y *Glossopteris*), morfológicas (encaje Sudamérica-África) y paleoclimáticas.
* **Teoría de la Expansión del Fondo Oceánico (Harry Hess, 1962):** El magma asciende por las dorsales oceánicas, generando nueva corteza marina que empuja los fondos.
* **Tipos de Límites de Placas:**
  1. **Límites Divergentes (Constructivos):** Dos placas se separan. Se forma magma nuevo en dorsales oceánicas (Dorsal Mesoatlántica) o rifts continentales (Rift Valley africano).
  2. **Límites Convergentes (Destructivos):** Dos placas colisionan:
     * *Subducción (Oceánica bajo Continental):* La placa oceánica más densa se hunde en la astenósfera, generando fosas marinas profundas, sismicidad y cordilleras volcánicas (e.g., Placa de Nazca subduciendo bajo la Placa Sudamericana, formando la **Cordillera de los Andes**).
     * *Colisión Continental (Obducción):* Dos placas continentales chocan, arrugando la corteza sin subducción profunda y formando cadenas colosales (e.g., Placa Índica contra Placa Euroasiática \to **Himalaya**).
  3. **Límites Transformantes (Conservativos):** Desplazamiento lateral tangencial sin creación ni destrucción de corteza (e.g., **Falla de San Andrés** en California).

#### B. Diastrofismo
1. **Epirogénesis (Movimientos Verticales Continentales):**
   * Fuerzas radiales ascendentes o descendentes de gran radio de curvatura que afectan a masas continentales estables (cratones o escudos).
   * Regulados por la **Isostasia** (equilibrio gravitacional hidrostático de la corteza flotando sobre el manto denso, formulada por Airy y Pratt).
   * *Consecuencias:* Formación de acantilados escalonados, emersión de **tablazos** (playas fósiles levantadas con reservas petrolíferas en la costa norte peruana: Zorritos, Lobitos, La Brea y Pariñas).
2. **Orogénesis (Movimientos Horizontales y Compresivos):**
   * Fuerzas tectónicas que pliegan o fracturan la corteza en zonas geosinclinales, originando montañas y cordilleras.
   * **Plegamientos:** Si las rocas son plásticas y sedimentarias:
     * *Anticlinal:* Porción convexa o arqueada hacia arriba (origina cumbres y montañas).
     * *Sinclinal:* Porción cóncava o arqueada hacia abajo (origina valles y depresiones).
   * **Fallamientos:** Si las rocas son rígidas, se quiebran y desplazan a lo largo de un plano de falla:
     * *Horst (Pilar tectónico):* Bloque elevado entre dos fallas normales (forma mesetas y mesetas altiplánicas).
     * *Graben (Fosa tectónica):* Bloque hundido entre dos fallas normales (alberga lagos como el **Titicaca** o el Mar Muerto).

#### C. Vulcanismo o Magmatismo
* **Vulcanismo Intrusivo (Plutónico):** El magma se consolida y enfría lentamente en el interior de la corteza:
  * *Batolito:* Masa intrusiva de escala regional gigantesca (> 100\text{ km}^2), base de las cordilleras (e.g., Batolito de la Costa del Perú).
  * *Lacolito:* Hongo magmático que levanta los estratos superiores.
  * *Dique:* Masa tabular que corta verticalmente los estratos rocosos.
  * *Sill (Manto):* Lámina magmática consolidada horizontalmente entre estratos.
* **Vulcanismo Extrusivo (Volcánico):** El magma alcanza la superficie a través de chimeneas y cráteres expulsando lava, cenizas, lapilli y gases piroclásticos.
  * Tipos de volcanes peruanos: Estratovolcanes andesíticos (Ubinas, Sabancaya, Misti, Coropuna, Tutupaca).

#### D. Sismicidad
* **Definición:** Liberación repentina de energía elástica acumulada en las rocas a lo largo de una falla por deformación tectónica (**Teoría del Rebote Elástico de Reid**).
* **Puntos Clave:**
  * **Hipocentro (Foco):** Punto en el interior de la geósfera donde se inicia la fractura y ruptura de rocas.
  * **Epicentro:** Punto de la superficie terrestre ubicado en la vertical sobre el hipocentro, donde el sismo se siente con mayor intensidad y primero.
* **Ondas Sísmicas:**
  * *Ondas de Cuerpo (Internas):*
    * **Ondas P (Primarias / Longitudinales):** Compresionales, las más veloces (V \approx 6 - 8\text{ km/s}), viajan a través de sólidos y líquidos.
    * **Ondas S (Secundarias / Transversales):** De cizalla o corte, más lentas (V \approx 3.5 - 4.5\text{ km/s}), **solo viajan a través de sólidos**. No atraviesan el núcleo externo.
  * *Ondas Superficiales (Provocan los daños en superficie):*
    * **Ondas Rayleigh (R):** Movimiento elíptico retrógrado (similar a olas marinas).
    * **Ondas Love (L):** Movimiento horizontal serpentino de vaivén perpendicular a la dirección de propagación. Son las más destructivas para las estructuras de ingeniería.
* **Escalas de Medición:**
  * **Escala de Richter (Magnitud Local - M_L / Magnitud de Momento - M_w):** Mide la **energía liberada** en el hipocentro mediante sismógrafos. Es una escala logarítmica cuantitativa abierta (un aumento de 1 grado representa \approx 31.6 veces más energía liberada).
  * **Escala de Mercalli Modificada (Intensidad):** Mide los **efectos, daños y percepción humana** en la superficie. Escala cualitativa cerrada en números romanos del **I al XII** (I: imperceptible; XII: catástrofe total).

---



### Matriz Comparativa de Capas y Discontinuidades de la Geósfera

| Capa | Subcapas | Densidad Media | Estado Físico | Discontinuidad Superior | Discontinuidad Inferior | Elementos Predominantes |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Corteza** | SIAL (Continental)<br/>SIMA (Oceánica) | 2.7\text{ g/cm}^3<br/>3.0\text{ g/cm}^3 | Sólido rígido | Superficie terrestre | **Mohorovičić** (1er orden) | Si, Al, O, Mg<br/>(Rocas graníticas y basálticas) |
| **Manto** | Superior (Astenósfera)<br/>Inferior (Pirósfera) | 3.5\text{ g/cm}^3<br/>5.6\text{ g/cm}^3 | Plástico/fluido<br/>Sólido | Mohorovičić | **Gutenberg** (1er orden) | Fe, Mg, Si<br/>(Peridotitas, corrientes de convección) |
| **Núcleo** | Externo<br/>Interno | 10.0\text{ g/cm}^3<br/>13.6\text{ g/cm}^3 | **Líquido**<br/>**Sólido** | Gutenberg | Centro terrestre (6\,378\text{ km}) | Fe, Ni (NIFE)<br/>(Genera magnetósfera) |

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

* ⚠️ **Trampa 1: El Núcleo Externo es Líquido, no Sólido:**
  * El núcleo interno es sólido por la altísima presión, pero el núcleo externo es **líquido**, razón por la cual las ondas sísmicas transversales (S) no pueden propagarse a través de él.
* ⚠️ **Trampa 2: La diferencia entre Hipocentro y Epicentro:**
  * **Hipocentro:** Punto focal subterráneo real (origen geofísico de la fractura).
  * **Epicentro:** Proyección en la superficie terrestre directamente sobre el foco (lugar geográfico donde primero se percibe).
* ⚠️ **Trampa 3: Los Tablazos no se forman por orogénesis:**
  * Los tablazos de la costa peruana (Piura, Tumbes) se forman por **epirogénesis** (movimientos verticales de ajuste isostático marino lento), no por plegamiento orogénico.

---



## 11. BANCO DE FLASHCARDS (Q/A)

* **PREGUNTA:** ¿Cuáles son las dos subcapas que componen la corteza terrestre y qué elementos químicos las caracterizan?
  * **RESPUESTA:** El SIAL (corteza continental: Silicio y Aluminio) y el SIMA (corteza oceánica: Silicio y Magnesio).
* **PREGUNTA:** ¿Qué discontinuidad separa la corteza del manto y cuál separa el manto del núcleo?
  * **RESPUESTA:** Mohorovičić separa corteza de manto; Gutenberg separa manto de núcleo.
* **PREGUNTA:** ¿En qué estado físico se encuentra el núcleo externo y qué fenómeno geofísico genera?
  * **RESPUESTA:** Se encuentra en estado líquido; su circulación de hierro metálico genera el campo magnético terrestre (magnetósfera).
* **PREGUNTA:** ¿Qué placas tectónicas interactúan frente a la costa del Perú y qué tipo de borde forman?
  * **RESPUESTA:** La Placa de Nazca y la Placa Sudamericana, formando un límite convergente de subducción.
* **PREGUNTA:** ¿Cuál es la diferencia entre orogénesis y epirogénesis?
  * **RESPUESTA:** La orogénesis produce movimientos horizontales que pliegan o fracturan cordilleras; la epirogénesis produce movimientos verticales lentos que elevan o hunden masas continentales (tablazos).
* **PREGUNTA:** ¿Cómo se llama la parte arqueada hacia arriba en un plegamiento y cómo la parte arqueada hacia abajo?
  * **RESPUESTA:** La cresta arqueada hacia arriba es el anticlinal; la parte cóncava hacia abajo es el sinclinal.
* **PREGUNTA:** ¿Por qué las ondas sísmicas S no pueden atravesar el núcleo externo?
  * **RESPUESTA:** Porque son ondas de cizalla o corte que únicamente se propagan a través de materiales sólidos, y el núcleo externo es líquido.
* **PREGUNTA:** ¿En qué se diferencia la meteorización física de la química?
  * **RESPUESTA:** La física desintegra mecánicamente la roca sin alterar su composición mineralógica; la química altera y descompone las moléculas minerales de la roca.
* **PREGUNTA:** ¿Qué diferencia geomorfológica presenta un valle fluvial frente a un valle glaciar?
  * **RESPUESTA:** El valle fluvial tiene perfil en "V"; el valle glaciar tiene fondo plano y laderas escarpadas en forma de "U" (artesa).
* **PREGUNTA:** ¿Qué escala mide la energía liberada por un sismo y cuál mide sus daños e intensidad?
  * **RESPUESTA:** Richter (o Magnitud de Momento) mide la energía liberada; Mercalli Modificada mide los daños e intensidad perceptiva.

---



### Ejercicio 1 (Nivel 1 - Básico Formativo: Estructura de la Geósfera)
**Enunciado:**
La discontinuidad sísmica de primer orden que marca el límite entre la corteza terrestre y el manto superior (astenósfera), donde se registra un incremento abrupto en la velocidad de propagación de las ondas sísmicas longitudinales (P), se denomina:
* A) Discontinuidad de Gutenberg
* B) Discontinuidad de Mohorovičić
* C) Discontinuidad de Conrad
* D) Discontinuidad de Repetti
* E) Discontinuidad de Lehmann

**Solución Paso a Paso:**
1. Las discontinuidades de primer orden son aquellas que separan las tres capas fundamentales de la geósfera.
2. La discontinuidad que separa la corteza del manto fue descubierta en 1909 por el sismólogo croata Andrija Mohorovičić y se conoce como **Discontinuidad de Mohorovičić (Moho)**.
* **Respuesta Correcta:** **B**

---



### Ejercicio 4 (Nivel 4 - Crítico / Interdisciplinario UNI: Ondas Sísmicas y Núcleo)
**Enunciado:**
Cuando se produce un sismo de gran magnitud, los sismógrafos situados en estaciones ubicadas entre los 103^\circ y 142^\circ de distancia angular desde el epicentro no registran ondas P directas, y ninguna estación situada a más de 103^\circ registra ondas S directas (zona de sombra sísmica). ¿Qué conclusión fundamental sobre el interior de la Tierra se dedujo a partir del comportamiento de las ondas transversales (S) en esta zona de sombra?
* A) Que el manto inferior es enteramente hueco y carece de minerales densos.
* B) Que el núcleo externo se encuentra en estado líquido, impidiendo el paso de ondas de cizalla.
* C) Que la corteza continental tiene un espesor constante de 100\text{ km} en todo el globo.
* D) Que el núcleo interno gira en sentido contrario al movimiento de rotación terrestre.
* E) Que las ondas sísmicas aumentan de velocidad en medios gaseosos de la atmósfera.

**Solución Paso a Paso:**
1. Las ondas S son ondas transversales de corte que requieren rigidez elástica en el medio de propagación; por tanto, **solo pueden transmitirse a través de materiales en estado sólido**.
2. Al llegar a la discontinuidad de Gutenberg a 2\,900\text{ km} de profundidad, las ondas S se extinguen por completo y no logran atravesar el **núcleo externo**.
3. Este hecho demostró científicamente que el núcleo externo de la Tierra se encuentra en **estado líquido**.
* **Respuesta Correcta:** **B**

---



### Ejercicio 3 (Nivel 3 - Avanzado UNMSM DECO: Tectónica y Vulcanismo)
**Enunciado:**
Durante los últimos años, el Instituto Geológico, Minero y Metalúrgico (INGEMMET) ha monitoreado la constante emisión de cenizas y gases piroclásticos en el volcán Sabancaya (Arequipa) y Ubinas (Moquegua). Desde una perspectiva geodinámica global, el origen causal de este vulcanismo extrusivo en la Cordillera Occidental del sur peruano se debe a:
* A) La divergencia entre la Placa Antártica y la Placa de Cocos.
* B) La subducción de la Placa oceánica de Nazca bajo la Placa continental Sudamericana.
* C) El deslizamiento transcurrente de la Falla de San Andrés.
* D) La fracturación isostática del Cratón Amazónico.
* E) La formación de un punto caliente intraplaca o pluma del manto similar a Hawái.

**Solución Paso a Paso:**
1. La costa y cordillera del Perú se sitúan en un borde de placa convergente destructivo.
2. La placa oceánica de **Nazca** se hunde (subduce) bajo la placa continental **Sudamericana**. Al descender a profundidades de más de 100\text{ km}, el agua atrapada y la litósfera oceánica se funden parcialmente en la astenósfera, generando magmas andesíticos que ascienden boyantes formando el arco volcánico andino.
* **Respuesta Correcta:** **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geo_t04_s02_c01",
                    question = "La geodinámica externa comprende el conjunto de fuerzas exógenas que actúan sobre la superficie terrestre, cuyo efecto morfológico final es:",
                    options = listOf(
                        "Generar el campo magnético del núcleo terrestre.",
                        "Modelar, desgastar (degradación) y nivelar el relieve mediante meteorización, erosión y sedimentación (agradación).",
                        "Elevar cordilleras y formar fosas marinas abisales.",
                        "Provocar la fragmentación del supercontinente Pangea.",
                    ),
                    correctIndex = 1,
                    explanation = "Las fuerzas externas (agua, viento, hielo, temperatura) son agentes modeladores que destruyen las elevaciones por degradación y rellenan las depresiones por agradación o sedimentación."
                ),
                Challenge(
                    id = "geo_t04_s02_c02",
                    question = "La meteorización física o mecánica por gelifracción (crioclastia) se produce cuando:",
                    options = listOf(
                        "El agua introducida en las grietas de las rocas se congela, expande su volumen en un 9% y rompe mecánicamente la roca.",
                        "El oxígeno atmosférico reacciona con minerales de hierro.",
                        "Los ácidos húmicos de las plantas disuelven las calizas.",
                        "Las sales marinas precipitan formando eflorescencias salinas.",
                    ),
                    correctIndex = 0,
                    explanation = "En zonas de alta montaña con ciclos de hielo y deshielo, el agua penetra en fisuras rocosas; al congelarse incrementa su volumen actuando como cuña que fragmenta la roca."
                ),
                Challenge(
                    id = "geo_t04_s02_c03",
                    question = "El proceso de disolución y alteración química de las rocas calizas por acción de aguas subterráneas ricas en ácido carbónico origina el relieve denominado:",
                    options = listOf(
                        "Relieve morrénico glaciar",
                        "Relieve kárstico (cárstico)",
                        "Relieve eólico",
                        "Relieve volcánico piroclástico",
                    ),
                    correctIndex = 1,
                    explanation = "El carst o relieve kárstico se origina por la carbonatación y disolución de carbonato de calcio por aguas cargadas de dióxido de carbono, formando cavernas, estalactitas, dolinas y cañones."
                ),
                Challenge(
                    id = "geo_t04_s02_c04",
                    question = "La erosión fluvial en el curso superior de los ríos de montaña, caracterizada por una fuerte pendiente y gran fuerza de arrastre, excava valles con perfil transversal en forma de:",
                    options = listOf(
                        "U ensanchada con fondo plano",
                        "V estrecha y profunda con paredes empinadas (gargantas o cañones)",
                        "Dolina sumergida",
                        "Meseta escalonada semicircular",
                    ),
                    correctIndex = 1,
                    explanation = "En la juventud de un río la incisión vertical domina sobre la erosión lateral, labrando valles profundos y estrechos con paredes en ángulo agudo en forma de V."
                ),
                Challenge(
                    id = "geo_t04_s02_c05",
                    question = "A diferencia de los valles fluviales en V, los valles esculpidos por la acción de los glaciares presentan característicamente una sección transversal en forma de:",
                    options = listOf(
                        "Embudo cárstico vertical",
                        "Cañón en zig-zag con meandros",
                        "U con fondo amplio, paredes escarpadas y laderas pulidas",
                        "V cerrada y tortuosa",
                    ),
                    correctIndex = 2,
                    explanation = "El avance de la pesada masa de hielo y su carga de rocas (morrenas) ejerce abrasión en el fondo y en los laterales, tallando un perfil característico en U o artesa glaciar."
                ),
                Challenge(
                    id = "geo_t04_s02_c06",
                    question = "En las zonas costeras, el retroceso continuo de los acantilados por el choque incesante de las olas marinas es un relieve originado por:",
                    options = listOf(
                        "Sedimentación o agradación marina",
                        "Erosión o degradación marina (abrasión marina)",
                        "Sedimentación eólica continental",
                        "Meteorización biológica por líquenes",
                    ),
                    correctIndex = 1,
                    explanation = "El impacto hidráulico del oleaje y la carga de arena socavan la base de los macizos rocosos litorales, originando acantilados, arcos marinos y plataformas de abrasión por erosión marina."
                ),
                Challenge(
                    id = "geo_t04_s02_c07",
                    question = "Los relieves eólicos formados por la acumulación y sedimentación de arena transportada por el viento en forma de colinas ondulantes o dunas se llaman técnicamente:",
                    options = listOf(
                        "Pedestales o rocas fungiformes",
                        "Loess y fiordos",
                        "Médanos y dunas (barjanes)",
                        "Morrenas terminales",
                    ),
                    correctIndex = 2,
                    explanation = "Las dunas (móviles de arena pura) y los médanos (colinas de arena con base rocosa) son relieves de agradación o depósito eólico típicos de los desiertos costeros y continentales."
                ),
                Challenge(
                    id = "geo_t04_s02_c08",
                    question = "Las cavernas subterráneas kársticas (como la Cueva de las Lechuzas en Tingo María o Huagapo en Tarma) destacan por presentar formaciones calcáreas minerales que crecen del techo hacia abajo llamadas:",
                    options = listOf(
                        "Estalagmitas",
                        "Columnas basálticas",
                        "Cirques glaciares",
                        "Estalactitas",
                    ),
                    correctIndex = 3,
                    explanation = "Las estalactitas cuelgan del techo por goteo continuo y precipitación de bicarbonato de calcio; las que crecen desde el suelo hacia arriba son estalagmitas, y al unirse forman columnas."
                ),
                Challenge(
                    id = "geo_t04_s02_c09",
                    question = "En el curso inferior de los ríos de llanura, cuando la pendiente es mínima y el agua serpentea depositando aluviones, se forman curvas pronunciadas conocidas como:",
                    options = listOf(
                        "Meandros fluviales",
                        "Rápidos",
                        "Cataratas de falla",
                        "Pongos de ruptura",
                    ),
                    correctIndex = 0,
                    explanation = "Los meandros son sinuosidades y curvas continuas que trazan los ríos en terrenos de escasa pendiente, erosionando la orilla externa cóncava y sedimentando en la interna convexa."
                ),
                Challenge(
                    id = "geo_t04_s02_c10",
                    question = "Las morrenas son geoformas típicas constituidas por acumulaciones desordenadas de bloques rocosos, cantos y arcillas depositadas por la acción de:",
                    options = listOf(
                        "Las corrientes fluviales en su delta terminal.",
                        "Los glaciares durante su retroceso o avance (sedimentación glaciar).",
                        "Las mareas vivas en los estuarios.",
                        "Los vientos alisios en los desiertos.",
                    ),
                    correctIndex = 1,
                    explanation = "Las morrenas (laterales, centrales, de fondo o terminales) son acumulaciones de sedimentos no estratificados transportados y abandonados por el deshielo de las lenguas glaciares."
                ),
            )
        )
    )
}
