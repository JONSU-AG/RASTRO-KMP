package historia_peru

object HistoriaPeruSemana03 {

    val lessons = listOf(
        LessonNode(
            id = "hper_t03_s01",
            subjectId = "historia_peru",
            semana = 3,
            subtema = "3.1",
            title = "3.1. Orígenes Míticos e Históricos del Tawantinsuyu",
            theory = LessonTheory(
                content = """# TEMA 03: EL TAWANTINSUYU (ORGANIZACIÓN, EXPANSIÓN, COSMOVISIÓN Y CAÍDA)

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["El Imperio del Tawantinsuyu"] --> B["Orígenes y Periodo Histórico Imperial"]
    A --> C["Estructura Política y Administrativa"]
    A --> D["Organización Social Estamental"]
    A --> E["Economía: Principios, Trabajo y Tierras"]
    A --> F["Cosmovisión, Religión y Caída del Imperio"]

    B --> B1["Mitos: Manco Cápac / Hermanos Ayar"]
    B --> B2["Pachacútec (1438: Guerra Chanca, Expansión, Cusco)"]
    B --> B3["Túpac Yupanqui (Gran Conquistador) y Huayna Cápac (Apogeo)"]

    C --> C1["Sapa Inca, Auqui (Correinado), Tahuantinsuyo Camachic"]
    C --> C2["Apunchic (Huamani), Tucuy Ricuy (Inspector), Curaca"]
    C --> C3["Qhapaq Ñan, Chasquis, Colcas, Tambos y Quipus"]

    D --> D1["Realeza y Panacas Reales (Mallquis)"]
    D --> D2["Nobleza de Sangre y Privilegio (Advenediza y Recompensada)"]
    D --> D3["Pueblo: Hatun Runas, Mitimaes, Yanaconas, Piñas, Acllas"]

    E --> E1["Principios Rectores: Reciprocidad (Ayni) y Redistribución"]
    E --> E2["Formas de Trabajo: Ayni, Minka, Mita (Estatal), Chunca"]
    E --> E3["División de Tierras: Del Sol, del Inca y del Pueblo (Topos)"]

    F --> F1["Espacio Tripartito: Hanan, Kay y Uku Pacha; Capac Cocha"]
    F --> F2["Factores de Caída: Guerra Huáscar-Atahualpa y Alianza de Etnias"]
```

---



### 3.1. Orígenes Míticos e Históricos del Tawantinsuyu
- **Mitos Fundacionales:**
  1. *Mito de Manco Cápac y Mama Ocllo:* Recogido por el cronista **Inca Garcilaso de la Vega** en *Comentarios Reales de los Incas*. Salida sagrada de las aguas del Lago Titicaca (*pacarina*); misión civilizadora otorgada por el dios Sol (*Inti*) de clavar la barreta de oro en el cerro Huanacaure; ensalza el linaje noble de origen cuzqueño.
  2. *Mito de los Hermanos Ayar:* Recogido por **Juan de Betanzos** en *Suma y Narración de los Incas*. Cuatro hermanos varones y cuatro mujeres salidos de las ventanas del cerro Tamputoco (Paccaritambo, Paruro): Ayar Cachi (encerrado en la cueva por su descomunal fuerza telúrica), Ayar Uchu (convertido en huaca de piedra en Huanacaure), Ayar Auca (convertido en piedra voladora en el cerro del Cusco) y **Ayar Manco**, quien junto a las cuatro hermanas fundó la ciudad del Cusco. Refleja la migración histórica de cuatro clanes agrícolas y guerreros de origen aimara-tiwanaku que huyeron del Collao invadido.

#### Fases Históricas del Estado Incaico:
1. **Periodo Tribal o Curacal (Siglos XII - XIII):** Asentamiento inicial en el valle de Acamama (Cusco) bajo Manco Cápac y Sinchi Roca.
2. **Periodo de la Confederación Cusqueña (Siglo XIV):** Alianza defensiva con etnias vecinas (desde Lloque Yupanqui hasta Huiracocha Inca).
3. **Periodo Imperial o Expansión Panandina (1438 - 1532):**
   - **Pachacútec (1438 - 1471):**
     - *La Guerra contra los Chancas (1438):* Ante la huida del anciano inca Huiracocha y su sucesor Urco frente a la invasión chanca comandada por Astoy Huaraca y Tomay Huaraca, el joven príncipe **Cusi Yupanqui** asumió la resistencia militar. Derrotó a los chancas en la épica **Batalla de Yahuarpampa** ("llanura de sangre") con la leyenda de los *Pururaucas* (soldados de piedra que cobraron vida).
     - Asumió el trono como **Pachacútec** ("el transformador de la tierra y del tiempo").
     - *Obras Maestras:* Diseñó el Cusco con forma de puma, reedificó el templo del Coricancha, mandó construir Sacsayhuamán y Machu Picchu, implantó el sistema de **mitimaes**, oficializó el quechua (**Runa Simi**) como idioma de integración imperial, organizó el sistema de chasquis y chasquihuasis, y dividió el territorio en los **Cuatro Suyos**:
       - *Chinchaysuyo:* Norte (costa y sierra norte; el más poblado e industrial).
       - *Collasuyo:* Sur (altiplano del Collao; el más extenso territorialmente).
       - *Antisuyo:* Este (ceja de selva; proveedor de coca y madera).
       - *Contisuyo:* Oeste (suroeste costero y valles de Arequipa e Ica; el más pequeño).
   - **Túpac Inca Yupanqui (1471 - 1493):**
     - El mayor genio militar conquistador del imperio (el "Alejandro Magno andino"). Sometió al reino Chimú (capturando a Minchancaman), a los Chachapoyas, Cañaris y extendió las fronteras australes hasta el río Maule (Chile). Realizó una célebre expedición marítima en balsas por el océano Pacífico que según las crónicas tocó las islas de la Polinesia (Mangareva y Pascua).
   - **Huayna Cápac (1493 - 1525):**
     - Consolidó las fronteras septentrionales hasta el río Ancasmayo (Pasto, Colombia), alcanzando la **máxima extensión territorial del Tawantinsuyu**.
     - Falleció repentinamente de viruela europea junto a su heredero legítimo Ninan Cuyuchi hacia 1525-1527, desatando la sangrienta **guerra civil fratricida entre Huáscar y Atahualpa**.

---



### 3.2. Estructura Política y Administrativa

```
+---------------------------------------------------------------------------------------------------+
|                        JERARQUÍA DEL PODER POLÍTICO EN EL TAWANTINSUYU                           |
+-------------------+-------------------------------------------------------------------------------+
| AUTORIDAD         | ATRIBUCIONES Y ROLES ESTATALES                                                |
+-------------------+-------------------------------------------------------------------------------+
| 1. Sapa Inca      | Soberano sagrado absoluto, encarnación viviente del Sol (*Inti Churin*).      |
|                   | Portaba la *Mascapaicha* roja como emblema de poder indiscutible.             |
| 2. El Auqui       | Príncipe heredero correinante; aprendía el gobierno cogobernando con su padre.|
|                   | Portaba la *Mascapaicha* amarilla.                                            |
| 3. Tahuantinsuyo  | Consejo Imperial supremo integrado por los 4 gobernantes de cada Suyo         |
|    Camachic       | (*Suyuyuc Apu*), encargados de asesorar al monarca en asuntos de Estado.      |
| 4. Apunchic o     | Gobernador político-militar de una provincia o *Huamani*; velaba por el orden |
|    Tocricoc       | interno, el mantenimiento de caminos y la recaudación tributaria.             |
| 5. Tucuy Ricuy    | "El que todo lo ve": Inspector imperial itinerante dependiente del Inca.      |
|                   | Fiscalizaba tributos, administraba justicia como juez de paz (*Taripa Camayoc*)|
|                   | y celebraba matrimonios colectivos (*Huarmicoco*).                            |
| 6. El Curaca      | Jefe tradicional del *Ayllu*; nexo e intermediario clave entre el Estado      |
|    (o Aylluca)    | cusqueño y la comunidad para la organización de la mita y redistribución.     |
+-------------------+-------------------------------------------------------------------------------+
```

- **Dispositivos Administrativos y de Comunicación:**
  - *El Qhapaq Ñan:* Colosal red vial empedrada de más de 30\,000\text{ km} que unía los cuatro suyos con el Cusco, provista de puentes colgantes de ichu (*q'eswachaka*).
  - *Los Chasquis:* Corredores postas entrenados desde jóvenes que transportaban mensajes verbales cifrados o quipus a lo largo de relevos de 2\text{ km} de tambo en tambo.
  - *Los Tambos:* Albergues y almacenes apostados cada jornada de camino para dar posada y víveres a los chasquis, ejércitos y comitivas imperiales.
  - *Las Colcas:* Depósitos y silos estatales erigidos en laderas altas y ventiladas para almacenar excedentes agrícolas (maíz, chuño, charqui), armas y ropa para redistribuirlos en emergencias.
  - *El Quipu:* Sistema mnemotécnico de registro contable decimal confeccionado con cuerdas de algodón o lana con nudos coloreados, descifrado por los **Quipucamayocs**.

---



### 3.5. Cosmovisión, Religión y Caída del Tawantinsuyu

#### A. La Cosmovisión Andina y sus Planos Sagrados:
- Concepción del tiempo: **Cíclico** (eras cósmicas alternadas por cataclismos o *Pachacuti*).
- Concepción espacial tripartita:
  1. **Hanan Pacha:** El mundo de arriba, celeste y celestial; morada de los dioses estelares (el Sol o *Inti*, la Luna o *Quilla*, el Rayo o *Illapa*, las Pléyades o *Collca*).
  2. **Kay Pacha:** El mundo terrenal del aquí y el ahora; habitado por los seres humanos, animales y plantas.
  3. **Uku Pacha:** El mundo subterráneo, interior y de los muertos; origen de la vida, las semillas, gérmenes y manantiales (*pacarinas*).

#### B. Deidades Principales:
- **Apu Kon Ticci Wiracocha:** Dios ordenador supremo y civilizador del universo andino.
- **Inti:** El Dios Sol; divinidad tutelar oficial imperial, padre de la dinastía reinante; su santuario principal fue el **Coricancha** en el Cusco.
- **Illapa:** Dios del rayo, relámpago y trueno; señor de las tempestades y las lluvias.
- **Pachamama:** La Madre Tierra, deidad fecundadora agraria.
- **Pachacámac:** Dios oracular costeño de los terremotos y movimientos telúricos.
- **Ritos y la Capac Cocha:** Ofrenda suprema imperial consistente en el sacrificio ceremonial de niños y doncellas de linaje noble en las cumbres nevadas de los volcanes y montañas sagradas (**Apus**) para restablecer la armonía cósmica ante erupciones volcánicas o muerte del monarca (ej. la célebre momia de la "Dama de Ampato" o Juanita en Arequipa).

#### C. Factores Reales de la Caída del Tawantinsuyu:
La caída de un imperio de más de diez millones de habitantes ante un destacamento de solo 168 conquistadores comandados por Francisco Pizarro en Cajamarca (1532) no se explica por la supuesta "superioridad racial" o armamentista española, sino por factores estructurales profundos:
1. **La Guerra Civil Fratricida Dinástica:** El cruento choque bélico entre Huáscar y Atahualpa desangró las tropas de élite del imperio, rompió el principio de reciprocidad y dividió mortalmente a las panacas nobles cusqueñas y quiteñas.
2. **El Resentimiento y la Sublevación de las Etnias Conquistadas:** Decenas de naciones andinas recientemente sojuzgadas por la violencia incaica (**Huancas, Chachapoyas, Cañaris, Chancas, Huaylas**) vieron a los españoles como sus libertadores mesiánicos y forjaron una **alianza militar masiva con Pizarro**, aportando miles de guerreros auxiliares, víveres y cargadores.
3. **El Impacto Demográfico y Biológico de las Epidemias:** La llegada previa de la viruela, el sarampión y la peste diezmaron a más de un tercio de la población andina antes de que los españoles pisaran Cajamarca, segando la vida del propio emperador Huayna Cápac.

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: "C-A-C-C" de los Cuatro Suyos
- **C**: **C**hinchaysuyo = Costa y Sierra Norte (el más poblado).
- **A**: **A**ntisuyo = Este / Ceja de Selva (coca y madera).
- **C**: **C**ollasuyo = Sur / Altiplano (el más extenso).
- **C**: **C**ontisuyo = Oeste / Arequipa e Ica (el más pequeño).



## 6. TÉCNICAS Y ARTIFICIOS DE RESOLUCIÓN (HACKING PREUNIVERSITARIO)



### Hack 2: La Causa Principal de la Caída del Tawantinsuyu
Si el reactivo pregunta por la causa determinante de la derrota inca en Cajamarca:
- **DESCARTA:** "Superioridad de las armas de fuego" (eran arcabuces lentos e ineficaces), "Los caballos" o "La traición divina de los dioses".
- **MARCA SIN DUDAR:** La **sublevación y alianza de las etnias sometidas (Huancas, Cañaris, Chachapoyas)** con los conquistadores españoles, sumada a la guerra civil entre Huáscar y Atahualpa.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Topo NO era una medida fija en metros cuadrados**
> El **topo** no medía una superficie geométrica idéntica en todo el imperio. Su tamaño dependía de la **calidad del suelo y del régimen ecológico**: en tierras fértiles de regadío el topo era más pequeño; en punas y secano era mucho más extenso, pues su objetivo era garantizar la **alimentación suficiente** de una persona durante un año.

> [!CAUTION]
> **Trampa 2: La reciprocidad simétrica vs. asimétrica**
> El Ayni es reciprocidad **simétrica** (entre pares del ayllu). La relación tributaria con el Inca es reciprocidad **asimétrica** (el hatun runa da mano de obra física en la mita y el Inca retribuye con bienes ceremoniales de las colcas).

> [!WARNING]
> **Trampa 3: Pachacútec no fue el primer inca de la dinastía**
> Pachacútec fue el **noveno monarca del Capac Cuna**, pero fue el **primer emperador de la fase expansiva imperial**. Antes de él gobernaron ocho incas en fases tribales y confederativas.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO



### Caso 2: El Qhapaq Ñan como Patrimonio Mundial de la UNESCO
En el año 2014, la UNESCO declaró al **Qhapaq Ñan (Sistema Vial Andino)** como Patrimonio de la Humanidad. Esta portentosa red de caminos empedrados, con más de 30\,000\text{ km} que atraviesa seis países sudamericanos (Argentina, Bolivia, Chile, Colombia, Ecuador y Perú), representa una de las mayores hazañas de ingeniería territorial prehispánica de la historia universal.

---



## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel 1 - Acceso Inmediato): Instituciones del Tawantinsuyu
**Enunciado (UNSA):** En la estructura administrativa del Imperio del Tawantinsuyu, el funcionario imperial itinerante que recorría secretamente las provincias para supervisar la recaudación de tributos, fiscalizar a los gobernantes locales y administrar justicia en nombre del Sapa Inca era el:
A) Apunchic  
B) Tucuy Ricuy  
C) Curaca  
D) Quipucamayoc  
E) Suyuyuc Apu

**Solución paso a paso:**
1. El **Tucuy Ricuy** (cuyo nombre en quechua significa "el que todo lo ve") era el inspector imperial de confianza directa del Sapa Inca.
2. Poseía facultades judiciales como *Taripa Camayoc* y celebraba matrimonios oficiales de hatun runas (*Huarmicoco*).
**Respuesta:** **B) Tucuy Ricuy**.

---



### Ejercicio 3 (Nivel 3 - Contexto DECO Avanzado): Causa Central de la Caída del Imperio
**Enunciado (UNMSM DECO / UNSA):** Durante siglos, la historiografía tradicional atribuyó la fulminante caída del Tawantinsuyu ante las huestes de Francisco Pizarro a la valentía militar hispana y al impacto psicológico de los caballos y arcabuces. Sin embargo, las modernas investigaciones etnohistóricas (Waldemar Espinoza, María Rostworowski) han demostrado que el factor determinante fue:
A) La invasión simultánea de tribus araucanas desde el extremo sur.  
B) El apoyo militar masivo brindado a los españoles por etnias y señoríos andinos sometidos (como huancas, cañaris y chachapoyas) que buscaban liberarse del dominio cusqueño.  
C) La sublevación violenta de las Acllas y los artesanos quipucamayocs en el Cusco.  
D) La escasez total de armas de bronce y cobre en los almacenes estatales.  
E) La conversión religiosa voluntaria de los ejércitos de Atahualpa al catolicismo.

**Solución paso a paso:**
1. Los invasores españoles se beneficiaron del descontento de numerosos pueblos que habían sido anexados violentamente por los incas.
2. Reinos como los **huancas, cañaris y chachapoyas** se aliaron militarmente con Pizarro, aportando decenas de miles de guerreros indígenas que lucharon en primera línea contra las fuerzas atahualpistas.
**Respuesta:** **B) El apoyo militar masivo brindado a los españoles por etnias y señoríos andinos sometidos (como huancas, cañaris y chachapoyas) que buscaban liberarse del dominio cusqueño.**

---



### Ejercicio 5 (Nivel 5 - Reto Titán / Examen de Excelencia): Geopolítica y Dinastía Incaica
**Enunciado (Reto Historiográfico Élite):** Determine la veracidad (V) o falsedad (F) de las siguientes proposiciones sobre la historia y sociedad incaica:
I. El gobernante Pachacútec asumió el poder tras vencer a los chancas en la Batalla de Yahuarpampa, organizó los Cuatro Suyos y oficializó el Runa Simi.  
II. Las panacas reales cusqueñas eran asambleas comunales democráticas donde los hatun runas elegían por sufragio secreto al próximo soberano.  
III. La ceremonia de la Capac Cocha implicaba el sacrificio de niños de noble linaje en las altas cumbres para honrar a los Apus tutelares.  
IV. El imperio alcanzó su máxima expansión territorial hacia el sur con Huayna Cápac al conquistar hasta el estrecho de Magallanes.

A) V - F - V - F  
B) V - V - F - F  
C) F - F - V - V  
D) V - F - V - V  
E) F - V - V - F  

**Solución paso a paso:**
- **Afirmación I (VERDADERA):** Pachacútec lideró la victoria sobre los chancas (1438), fundó la etapa imperial, instituyó los 4 suyos e impuso el quechua.
- **Afirmación II (FALSA):** Las panacas eran linajes aristocráticos cerrados compuestos por los descendientes de cada inca fallecido, encargados de cuidar su momia (*mallqui*) y administrar sus extensas propiedades.
- **Afirmación III (VERDADERA):** La Capac Cocha era el rito de consagración cósmica donde se realizaban sacrificios rituales de niños puros de la aristocracia andina en volcanes sagrados (ej. Dama de Ampato).
- **Afirmación IV (FALSA):** La frontera sur no llegó al estrecho de Magallanes, sino únicamente hasta el **río Maule (Chile)**, detenida por la feroz resistencia del pueblo mapuche; Huayna Cápac expandió el imperio hacia el **norte** (río Ancasmayo, Colombia).
- Secuencia: V - F - V - F.
**Respuesta:** **A) V - F - V - F**.

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Ayllu:** Comunidad básica andina unida por vínculos consanguíneos, territoriales, de trabajo colectivo y adoración a un tótem o antepasado común.
2. **Panaca:** Familia linajuda y corte personal de un emperador inca difunto, integrada por todos sus descendientes varones y mujeres, excepto el heredero reinante.
3. **Mallqui:** Momia sagrada de los antepasados nobles incaicos, venerada y consultada como oráculo en los grandes rituales del Cusco.
4. **Mascapaicha:** Borla de lana fina de color rojo encendido coronada con plumas de corequenque, insignia exclusiva del poder soberano del Sapa Inca.
5. **Mitimaes (Mitmas):** Familias o ayllus trasladados por mandato del Inca a otras provincias con fines de colonización agrícola, adoctrinamiento o control geopolítico.
6. **Colca:** Gran almacén o silo estatal construido en hileras en laderas ventiladas para conservar alimentos desecados y vestimentas para la redistribución.
7. **Tambo:** Edificación y albergue de posta construido a lo largo del Qhapaq Ñan para suministrar alimentos, descanso y abrigo a los chasquis y ejércitos imperiales.
8. **Chasqui:** Mensajero y corredor veloz oficial que transportaba información oficial de posta en posta a través de las rutas del Qhapaq Ñan.
9. **Capac Cocha:** Rito ceremonial panandino de ofrendas supremas y sacrificios de niños a los dioses tutelares y apus en circunstancias cósmicas críticas.
10. **Topo:** Extensión de tierra de cultivo entregada anualmente en usufructo por el ayllu a cada familia para garantizar su autosuficiencia alimentaria.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **P:** ¿Quién recogió el mito fundacional de Manco Cápac y Mama Ocllo emergiendo del Lago Titicaca?
  - **R:** El cronista Inca Garcilaso de la Vega en sus *Comentarios Reales de los Incas*.
- **P:** ¿Qué victoria militar en 1438 dio nacimiento a la etapa imperial y transformadora del Tawantinsuyu bajo Pachacútec?
  - **R:** La victoria sobre los chancas en la Batalla de Yahuarpampa.
- **P:** ¿Cómo se llamaba el consejo imperial que asesoraba directamente al Sapa Inca integrado por los cuatro gobernantes de los suyos?
  - **R:** El Tahuantinsuyo Camachic.
- **P:** ¿Qué funcionario incaico era conocido como "el que todo lo ve" por fiscalizar las provincias y administrar justicia?
  - **R:** El Tucuy Ricuy.
- **P:** ¿Qué principio económico andino consistía en el intercambio recíproco de mano de obra entre familias del mismo ayllu?
  - **R:** La reciprocidad simétrica (el *Ayni*).
- **P:** ¿Qué nombre recibía la forma de trabajo obligatorio y por turnos que los hatun runas prestaban al Estado imperial?
  - **R:** La *Mita*.
- **P:** ¿Qué tres planos o mundos componían la cosmovisión espacial de los incas?
  - **R:** El Hanan Pacha (mundo de arriba), el Kay Pacha (mundo terrenal) y el Uku Pacha (mundo de abajo subterráneo).
- **P:** ¿Cuál fue la causa estructural interna determinante de la derrota incaica ante los conquistadores españoles?
  - **R:** La rebelión y alianza militar de etnias sometidas (Huancas, Cañaris, Chachapoyas) con las huestes de Pizarro, agravada por la guerra civil dinástica.

---



### 3.3. Organización Social Estamental Andina
Sociedad jerárquica y estamental fundada en el parentesco y la pertenencia al **Ayllu** (célula social básica integrada por familias unidas por vínculos consanguíneos, territoriales (*marca*), económicos y totémicos).

```
+---------------------------------------------------------------------------------------------------+
|                            ESTRUCTURA SOCIAL DEL TAWANTINSUYU                                     |
+-------------------+-------------------------------------------------------------------------------+
| ESTRATO SOCIAL    | MIEMBROS Y CONDICIÓN JURÍDICO-POLÍTICA                                        |
+-------------------+-------------------------------------------------------------------------------+
| 1. REALEZA        | - El Sapa Inca y la Coya (esposa principal legítima).                         |
|                   | - Las Panacas Reales: Familias aristocráticas del Inca fallecido que          |
|                   |   custodiaban y veneraban su momia sagrada (*mallqui*) y sus tierras.         |
| 2. NOBLEZA        | a) Nobleza de Sangre: Parientes y descendientes de los monarcas cusqueños;    |
|                   |    llamados "Orejones" por los españoles por sus grandes aretes de oro.       |
|                   | b) Nobleza de Privilegio:                                                     |
|                   |    - Advenediza o Curacal: Señores provinciales sometidos (ej. Chinchay Cápac)|
|                   |    - Recompensada: Guerreros, sabios (*amautas*) o sacerdotes promovidos por  |
|                   |      sus méritos excepcionales al servicio del Estado.                        |
| 3. EL PUEBLO      | a) Hatun Runas: Masa campesina y artesana del ayllu; base tributaria obligada|
|                   |    a cumplir la mita laboral.                                                 |
|                   | b) Mitimaes o Mitmas: Poblaciones enteras trasladadas a otras regiones para   |
|                   |    colonizar fronteras, enseñar el quechua o pacificar zonas rebeldes.        |
|                   | c) Yanaconas: Siervos perpetuos desvinculados de su ayllu; trabajaban en las  |
|                   |    tierras de la nobleza o del Estado sin derechos comunales.                 |
|                   | d) Piñas: Prisioneros de guerra sometidos a una condición de cuasiesclavitud  |
|                   |    en los cocales insalubres de la selva alta.                                |
|                   | e) Acllas: Mujeres escogidas educadas en el *Acllahuasi* por las Mamaconas    |
|                   |    para tejer ropa fina (*cumbi*), preparar chicha o ser sacrificadas.        |
+-------------------+-------------------------------------------------------------------------------+
```

---



### 3.4. Organización Económica: Principios, Tierras y Formas de Trabajo
La economía del Tawantinsuyu **no conoció la moneda, el mercado libre ni el salario**. Funcionó bajo dos principios rectores fundamentales:

#### A. Los Dos Principios Económicos Rectores:
1. **Reciprocidad:** Intercambio simétrico de trabajo y bienes entre los miembros del Ayllu ("dar y recibir").
   - *Simétrica:* Se da entre iguales (*Ayni*: ayuda mutua intrafamiliar).
   - *Asimétrica:* Se da entre el Ayllu y el Estado imperial (la comunidad entrega trabajo colectivo forzoso al Estado mediante la mita, y el Inca "devuelve" la energía en forma de festines, chicha, ropa fina y seguridad en épocas de hambruna).
2. **Redistribución:** Función privativa y exclusiva del Estado cusqueño. El Inca acopiaba todos los excedentes de la producción agrícola, textil y armamentista en las **Colcas**, y los redistribuía entre las provincias afectadas por sequías, heladas, viudas, huérfanos o para avituallar al ejército en campaña.

#### B. Las Formas de Trabajo Andino:
- **Ayni:** Sistema de ayuda mutua intrafamiliar entre los miembros del Ayllu en faenas agrícolas y construcción de techos familiares (*"Hoy por ti, mañana por mí"*).
- **Minka:** Trabajo comunitario colectivo y festivo en beneficio comunal del Ayllu (limpieza de canales, siembra comunal) o para cultivar las tierras del Sol y del Inca.
- **Mita:** Trabajo obligatorio, rotativo y por turnos que los varones de 18 a 50 años (*mitayos*) prestaban gratuitamente al Estado imperial (construcción de andenes, calzadas, fortalezas, laboreo en minas de oro y plata, servicio de chasquis y filas del ejército).
- **Chunca:** Sistema de trabajo colectivo solidario de auxilio rápido activado exclusivamente en casos de desastres y catástrofes naturales (terremotos, aluviones o derrumbes).

#### C. Régimen de Tenencia de la Tierra:
1. **Tierras del Sol:** Destinadas a la manutención del clero sacerdotal, templos sagrados y la celebración de las fiestas religiosas y ofrendas.
2. **Tierras del Inca:** Destinadas a sostener a la nobleza cusqueña, la burocracia estatal y abastecer los silos y colcas militares del imperio.
3. **Tierras del Pueblo (Comunales):** Entregadas en usufructo intransferible a las familias del Ayllu. A cada varón recién nacido se le asignaba **un topo** de tierra (parcela suficiente para su manutención anual) y a cada mujer **medio topo**. La tierra no se podía vender ni transferir; pertenecía a la comunidad.

---



### Ejercicio 2 (Nivel 2 - Intermedio Operativo): Principios Económicos Andinos
**Enunciado (UNMSM DECO):** La economía incaica careció del uso de moneda acuñada y de mercados abiertos en el sentido occidental. En su lugar, el sistema productivo y distributivo se sustentó en los principios ancestrales andinos de:
A) Libre comercio y feudalismo señorial.  
B) Reciprocidad comunal simétrica y redistribución estatal asimétrica de excedentes.  
C) Esclavitud masiva de mano de obra y pago estricto de salarios en oro.  
D) Acaparamiento individual de la tierra y herencia privada.  
E) Centralización mercantil y monopolio de gremios artesanales.

**Solución paso a paso:**
1. El orden socioeconómico del Tawantinsuyu funcionó sobre dos pilares: la **reciprocidad** (prestación mutua de trabajo a nivel del ayllu) y la **redistribución**.
2. Mediante la redistribución, el Estado acopiaba los excedentes de la mita en las colcas imperiales para proveer de recursos en tiempos de crisis a las provincias.
**Respuesta:** **B) Reciprocidad comunal simétrica y redistribución estatal asimétrica de excedentes.**

---



### Hack 1: Distinción entre Yanaconas y Piñas
- **Yanaconas:** Siervos adscritos a la nobleza; no tenían ayllu pero gozaban de buen trato y podían poseer pequeñas pertenencias personales.
- **Piñas:** Prisioneros de guerra rebeldes sometidos a **esclavitud forzosa de Estado** en los cocales insalubres de la selva alta; eran la clase más explotada y paria del imperio.



### Ejercicio 4 (Nivel 4 - Análisis Crítico / UNI CEPRE): Formas de Trabajo Andino
**Enunciado (UNI):** Dentro del complejo sistema de relaciones laborales del Tawantinsuyu, la mano de obra era convocada según la naturaleza y finalidad de la tarea. Identifique la alternativa que describe correctamente la institución de la **Mita**:
A) Era la ayuda mutua recíproca entre miembros de un mismo ayllu para levantar techos familiares.  
B) Era el auxilio solidario que se activaba de emergencia únicamente tras un aluvión o terremoto.  
C) Era el trabajo obligatorio, periódico y por turnos que los hatun runas prestaban al Estado para obras públicas y el ejército.  
D) Era la faena comunal voluntaria para cultivar las tierras exclusivas del sol en días festivos.  
E) Era la condena perpetua impuesta a los prisioneros de guerra en los cocales amazónicos.

**Solución paso a paso:**
1. La **Mita** (turno) era el tributo fundamental en energía física que todo hatun runa varón en edad productiva adeudaba al Sapa Inca.
2. Se cumplía de forma rotativa en obras monumentales (caminos, puentes, andenes, fortalezas) o en la guerra.
**Respuesta:** **C) Era el trabajo obligatorio, periódico y por turnos que los hatun runas prestaban al Estado para obras públicas y el ejército.**

---



## 4. CUADRO SINÓPTICO COMPARATIVO

\begin{array}{|l|l|l|l|}
\hline
\textbf{Institución / Concepto} & \textbf{Definición Andina} & \textbf{Beneficiario Directo} & \textbf{Carácter / Lema} \\ \hline
\text{Ayni} & \text{Trabajo familiar recíproco} & \text{Familias del Ayllu} & \text{"Hoy por ti, mañana por mí"} \\ \hline
\text{Minka} & \text{Trabajo comunal solidario} & \text{Toda la comunidad / Sol / Inca} & \text{Festivo y voluntario} \\ \hline
\text{Mita} & \text{Trabajo obligatorio estatal} & \text{El Estado imperial cusqueño} & \text{Rotativo y por turnos} \\ \hline
\text{Chunca} & \text{Auxilio ante catástrofes} & \text{Afectados por huaycos/sismos} & \text{Emergencia inmediata} \\ \hline
\text{Curaca} & \text{Jefe tradicional del ayllu} & \text{Intermediario ayllu-Estado} & \text{Liderazgo de parentesco} \\ \hline
\text{Tucuy Ricuy} & \text{Inspector itinerante del Inca} & \text{La administración del Sapa Inca} & \text{"El que todo lo ve"} \\ \hline
\end{array}

---



### Mnemotecnia 2: "A-M-M-C" para las Formas de Trabajo
- **A**: **A**yni = Ayuda familiar.
- **M**: **M**inka = Mejora comunal del ayllu.
- **M**: **M**ita = Mando estatal obligatorio.
- **C**: **C**hunca = Catástrofes y auxilio.

---



### Caso 1: La Vigencia Ancestral de la Minka y el Ayni en el Perú Rural
En las comunidades campesinas de los Andes peruanos (Cusco, Ayacucho, Puno, Huancavelica), las obras comunales como la limpieza de canales de riego, la construcción de locales comunales o la siembra y cosecha de papa continúan ejecutándose bajo las figuras consuetudinarias de la **Minka** y el **Ayni**. Esta cohesión social andina sin remuneración monetaria es un patrimonio cultural vivo que asombra a la sociología y economía moderna."""
            ),
            challenges = listOf(
                Challenge(
                    id = "hper_t03_s01_c01",
                    question = "El mito andino de los Hermanos Ayar, que explica el origen sagrado del Cusco y la fundación de la dinastía incaica a través de la pacarina de Pacaritambo, fue recogido por el cronista español:",
                    options = listOf(
                        "Pedro Cieza de León en Crónica del Perú.",
                        "Felipe Guamán Poma de Ayala en Nueva Corónica y Buen Gobierno.",
                        "Juan de Betanzos en Suma y Narración de los Incas.",
                        "Inca Garcilaso de la Vega en sus Comentarios Reales.",
                    ),
                    correctIndex = 2,
                    explanation = "Juan de Betanzos, quien dominaba el quechua por estar casado con Cusi Rimay Ocllo (doña Angelina Yupanque, viuda de Atahualpa), recogió de primera mano la versión cusqueña del mito de los cuatro hermanos Ayar que emergieron del cerro Tamputoco."
                ),
                Challenge(
                    id = "hper_t03_s01_c02",
                    question = "El hecho histórico decisivo que marca la transformación de la etnia cusqueña en el gran Imperio del Tawantinsuyu (inicio del periodo imperial) fue:",
                    options = listOf(
                        "La llegada de los conquistadores españoles a Tumbes.",
                        "La anexión pacífica de la confederación de los Chinchas.",
                        "El traslado de la capital incaica a la ciudadela de Tumibamba.",
                        "La aplastante victoria militar del príncipe Cusi Yupanqui sobre los invasores Chancas en la batalla de Yahuar Pampa (1438).",
                    ),
                    correctIndex = 3,
                    explanation = "Cuando el anciano inca Huiracocha y su hijo Urco huyeron del Cusco ante la invasión Chanca, el príncipe Cusi Yupanqui organizó la resistencia con apoyo de los pueblos vecinos (el mito de los soldados de piedra o pururaucas), venció a los chancas y asumió el nombre de Pachacútec («el que renueva el mundo»)."
                ),
                Challenge(
                    id = "hper_t03_s01_c03",
                    question = "Pachacútec es considerado el más genial organizador y estadista del Estado incaico debido a que realizó trascendentales reformas como:",
                    options = listOf(
                        "La creación de una monarquía parlamentaria bicameral.",
                        "La acuñación de monedas de plata grabadas con el rostro del Sol.",
                        "La división del imperio en cuatro suyos, la reconstrucción del Cusco con forma de puma, la edificación del Coricancha y la implantación del sistema de mitimaes y del runasimi como lengua oficial.",
                        "La destrucción de los andenes y la prohibición del quechua.",
                    ),
                    correctIndex = 2,
                    explanation = "Pachacútec reorganizó el Tawantinsuyu: consolidó el culto solar en el Coricancha, canalizó los ríos Huatanay y Tullumayo, instauró el sistema de chasquis y chasquihuasis e impulsó la construcción de Machu Picchu y Sacsayhuamán."
                ),
                Challenge(
                    id = "hper_t03_s01_c04",
                    question = "El gobernante inca conocido como el «Alejandro Magno del Nuevo Mundo» debido a que protagonizó la mayor expansión militar conquistando el reino Chimú, la costa central y llegando hasta el río Maule en Chile fue:",
                    options = listOf(
                        "Túpac Inca Yupanqui",
                        "Pachacútec",
                        "Huayna Cápac",
                        "Atahualpa",
                    ),
                    correctIndex = 0,
                    explanation = "Túpac Inca Yupanqui, primero como Auqui de su padre Pachacútec y luego como Sapa Inca, expandió las fronteras del imperio por el norte (Quito), la costa (sometió al Chimú Cápac) y por el sur hasta el centro de Chile, realizando además una audaz expedición marítima hacia islas de la Polinesia."
                ),
                Challenge(
                    id = "hper_t03_s01_c05",
                    question = "La monumental red vial empedrada del Imperio Incaico que integraba valles, costas, punas y ceja de selva a lo largo de miles de kilómetros facilitando el transporte militar y de tributos se denominaba:",
                    options = listOf(
                        "Vía sacra del Coricancha",
                        "Ruta de la Plata",
                        "Cápac Ñan (Camino Real del Inca)",
                        "Camino de los Chankas",
                    ),
                    correctIndex = 2,
                    explanation = "El Cápac Ñan fue una proeza de ingeniería vial que superaba los 30 000 kilómetros con puentes colgantes de fibra de ichu, tambos o albergues camineros y calzadas empedradas por donde transitaban los mensajeros chasquis y los ejércitos."
                ),
                Challenge(
                    id = "hper_t03_s01_c06",
                    question = "En la estructura administrativa incaica, el funcionario de confianza directa del Sapa Inca que viajaba en secreto inspeccionando las provincias, aplicando justicia y supervisando a los curacas bajo el lema «el que todo lo ve», era el:",
                    options = listOf(
                        "Apunchic",
                        "Curaca",
                        "Pureq",
                        "Tucuy Ricuc",
                    ),
                    correctIndex = 3,
                    explanation = "El Tucuy Ricuc («el que todo lo ve») era un veedor o visitador imperial con facultades penales (taripa camayoc) y matrimoniales (huarmicoco), que reportaba de forma secreta e inapelable el cumplimiento de los mandatos estatales."
                ),
                Challenge(
                    id = "hper_t03_s01_c07",
                    question = "El curaca (o cacique en la denominación colonial española) cumplía un rol geopolítico estratégico en el mundo andino porque:",
                    options = listOf(
                        "Se encargaba exclusivamente de pintar los queros ceremoniales.",
                        "Lideraba el culto religioso monoteísta en las huacas de la costa.",
                        "Actuaba como nexo o bisagra entre el poder central imperial del Cusco y la comunidad del ayllu, gestionando la entrega de fuerza de trabajo (mita) a cambio de dádivas y reciprocidad.",
                        "Era un militar extranjero nombrado por los reyes de España.",
                    ),
                    correctIndex = 2,
                    explanation = "El curaca era la máxima autoridad tradicional del ayllu; el Sapa Inca no le despojaba de su autoridad local, sino que lo agasajaba y casaba con princesas cusqueñas para garantizar que el curaca movilizara la mano de obra de sus comuneros."
                ),
                Challenge(
                    id = "hper_t03_s01_c08",
                    question = "La crisis terminal del Tawantinsuyu que facilitó la invasión de las huestes de Francisco Pizarro en 1532 estuvo desencadenada estructuralmente por:",
                    options = listOf(
                        "La repentina muerte del inca Huayna Cápac y de su sucesor Ninan Cuyuchi por una peste de viruela, lo que desató la cruenta guerra civil de sucesión entre las panacas de Huáscar (Cusco) y Atahualpa (Quito).",
                        "Un terremoto que destruyó la fortaleza de Sacsayhuamán.",
                        "La renuncia voluntaria de la nobleza cusqueña al control de la tierra.",
                        "El alzamiento victorioso de los pueblos sometidos guiados por caballos de guerra.",
                    ),
                    correctIndex = 0,
                    explanation = "La viruela, propagada desde Centroamérica antes de la llegada física de Pizarro, causó la muerte de Huayna Cápac y su heredero legítimo, quebrando la estabilidad del imperio y enfrentando a muerte a la nobleza tradicional cusqueña de Huáscar contra el ejército veterano norteño de Atahualpa."
                ),
                Challenge(
                    id = "hper_t03_s01_c09",
                    question = "La institución sociopolítica cusqueña encargada de custodiar la momia (mallqui) del Sapa Inca difunto, administrar sus inmensas tierras y conservar la memoria de sus hazañas militares era:",
                    options = listOf(
                        "La Panaca real",
                        "El Camachic",
                        "El Ayllu llactaruna",
                        "El Huamani",
                    ),
                    correctIndex = 0,
                    explanation = "Cada inca fundaba su propia panaca o linaje familiar integrado por sus descendientes (salvo el Auqui que heredaba el trono y formaba su propia panaca). La panaca conservaba las riquezas y tierras acumuladas por el inca, rivalizando ferozmente entre sí."
                ),
                Challenge(
                    id = "hper_t03_s01_c10",
                    question = "En la jerarquía política incaica, el príncipe heredero que aprendía el arte del gobierno mediante el correinado antes de ceñirse la mascapaicha roja era denominado:",
                    options = listOf(
                        "Apunchic",
                        "Auqui",
                        "Chasqui",
                        "Sinchi",
                    ),
                    correctIndex = 1,
                    explanation = "El Auqui (generalmente distinguido por una mascapaicha amarilla) cogobernaba con su padre para demostrar capacidad militar y liderazgo administrativo, asegurando una sucesión no traumática del mando supremo."
                ),
            )
        ),
        LessonNode(
            id = "hper_t03_s02",
            subjectId = "historia_peru",
            semana = 3,
            subtema = "3.2",
            title = "3.4. Organización Económica: Principios, Tierras y Formas de Trabajo",
            theory = LessonTheory(
                content = """## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["El Imperio del Tawantinsuyu"] --> B["Orígenes y Periodo Histórico Imperial"]
    A --> C["Estructura Política y Administrativa"]
    A --> D["Organización Social Estamental"]
    A --> E["Economía: Principios, Trabajo y Tierras"]
    A --> F["Cosmovisión, Religión y Caída del Imperio"]

    B --> B1["Mitos: Manco Cápac / Hermanos Ayar"]
    B --> B2["Pachacútec (1438: Guerra Chanca, Expansión, Cusco)"]
    B --> B3["Túpac Yupanqui (Gran Conquistador) y Huayna Cápac (Apogeo)"]

    C --> C1["Sapa Inca, Auqui (Correinado), Tahuantinsuyo Camachic"]
    C --> C2["Apunchic (Huamani), Tucuy Ricuy (Inspector), Curaca"]
    C --> C3["Qhapaq Ñan, Chasquis, Colcas, Tambos y Quipus"]

    D --> D1["Realeza y Panacas Reales (Mallquis)"]
    D --> D2["Nobleza de Sangre y Privilegio (Advenediza y Recompensada)"]
    D --> D3["Pueblo: Hatun Runas, Mitimaes, Yanaconas, Piñas, Acllas"]

    E --> E1["Principios Rectores: Reciprocidad (Ayni) y Redistribución"]
    E --> E2["Formas de Trabajo: Ayni, Minka, Mita (Estatal), Chunca"]
    E --> E3["División de Tierras: Del Sol, del Inca y del Pueblo (Topos)"]

    F --> F1["Espacio Tripartito: Hanan, Kay y Uku Pacha; Capac Cocha"]
    F --> F2["Factores de Caída: Guerra Huáscar-Atahualpa y Alianza de Etnias"]
```

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.2. Estructura Política y Administrativa

```
+---------------------------------------------------------------------------------------------------+
|                        JERARQUÍA DEL PODER POLÍTICO EN EL TAWANTINSUYU                           |
+-------------------+-------------------------------------------------------------------------------+
| AUTORIDAD         | ATRIBUCIONES Y ROLES ESTATALES                                                |
+-------------------+-------------------------------------------------------------------------------+
| 1. Sapa Inca      | Soberano sagrado absoluto, encarnación viviente del Sol (*Inti Churin*).      |
|                   | Portaba la *Mascapaicha* roja como emblema de poder indiscutible.             |
| 2. El Auqui       | Príncipe heredero correinante; aprendía el gobierno cogobernando con su padre.|
|                   | Portaba la *Mascapaicha* amarilla.                                            |
| 3. Tahuantinsuyo  | Consejo Imperial supremo integrado por los 4 gobernantes de cada Suyo         |
|    Camachic       | (*Suyuyuc Apu*), encargados de asesorar al monarca en asuntos de Estado.      |
| 4. Apunchic o     | Gobernador político-militar de una provincia o *Huamani*; velaba por el orden |
|    Tocricoc       | interno, el mantenimiento de caminos y la recaudación tributaria.             |
| 5. Tucuy Ricuy    | "El que todo lo ve": Inspector imperial itinerante dependiente del Inca.      |
|                   | Fiscalizaba tributos, administraba justicia como juez de paz (*Taripa Camayoc*)|
|                   | y celebraba matrimonios colectivos (*Huarmicoco*).                            |
| 6. El Curaca      | Jefe tradicional del *Ayllu*; nexo e intermediario clave entre el Estado      |
|    (o Aylluca)    | cusqueño y la comunidad para la organización de la mita y redistribución.     |
+-------------------+-------------------------------------------------------------------------------+
```

- **Dispositivos Administrativos y de Comunicación:**
  - *El Qhapaq Ñan:* Colosal red vial empedrada de más de 30\,000\text{ km} que unía los cuatro suyos con el Cusco, provista de puentes colgantes de ichu (*q'eswachaka*).
  - *Los Chasquis:* Corredores postas entrenados desde jóvenes que transportaban mensajes verbales cifrados o quipus a lo largo de relevos de 2\text{ km} de tambo en tambo.
  - *Los Tambos:* Albergues y almacenes apostados cada jornada de camino para dar posada y víveres a los chasquis, ejércitos y comitivas imperiales.
  - *Las Colcas:* Depósitos y silos estatales erigidos en laderas altas y ventiladas para almacenar excedentes agrícolas (maíz, chuño, charqui), armas y ropa para redistribuirlos en emergencias.
  - *El Quipu:* Sistema mnemotécnico de registro contable decimal confeccionado con cuerdas de algodón o lana con nudos coloreados, descifrado por los **Quipucamayocs**.

---



### 3.3. Organización Social Estamental Andina
Sociedad jerárquica y estamental fundada en el parentesco y la pertenencia al **Ayllu** (célula social básica integrada por familias unidas por vínculos consanguíneos, territoriales (*marca*), económicos y totémicos).

```
+---------------------------------------------------------------------------------------------------+
|                            ESTRUCTURA SOCIAL DEL TAWANTINSUYU                                     |
+-------------------+-------------------------------------------------------------------------------+
| ESTRATO SOCIAL    | MIEMBROS Y CONDICIÓN JURÍDICO-POLÍTICA                                        |
+-------------------+-------------------------------------------------------------------------------+
| 1. REALEZA        | - El Sapa Inca y la Coya (esposa principal legítima).                         |
|                   | - Las Panacas Reales: Familias aristocráticas del Inca fallecido que          |
|                   |   custodiaban y veneraban su momia sagrada (*mallqui*) y sus tierras.         |
| 2. NOBLEZA        | a) Nobleza de Sangre: Parientes y descendientes de los monarcas cusqueños;    |
|                   |    llamados "Orejones" por los españoles por sus grandes aretes de oro.       |
|                   | b) Nobleza de Privilegio:                                                     |
|                   |    - Advenediza o Curacal: Señores provinciales sometidos (ej. Chinchay Cápac)|
|                   |    - Recompensada: Guerreros, sabios (*amautas*) o sacerdotes promovidos por  |
|                   |      sus méritos excepcionales al servicio del Estado.                        |
| 3. EL PUEBLO      | a) Hatun Runas: Masa campesina y artesana del ayllu; base tributaria obligada|
|                   |    a cumplir la mita laboral.                                                 |
|                   | b) Mitimaes o Mitmas: Poblaciones enteras trasladadas a otras regiones para   |
|                   |    colonizar fronteras, enseñar el quechua o pacificar zonas rebeldes.        |
|                   | c) Yanaconas: Siervos perpetuos desvinculados de su ayllu; trabajaban en las  |
|                   |    tierras de la nobleza o del Estado sin derechos comunales.                 |
|                   | d) Piñas: Prisioneros de guerra sometidos a una condición de cuasiesclavitud  |
|                   |    en los cocales insalubres de la selva alta.                                |
|                   | e) Acllas: Mujeres escogidas educadas en el *Acllahuasi* por las Mamaconas    |
|                   |    para tejer ropa fina (*cumbi*), preparar chicha o ser sacrificadas.        |
+-------------------+-------------------------------------------------------------------------------+
```

---



### 3.4. Organización Económica: Principios, Tierras y Formas de Trabajo
La economía del Tawantinsuyu **no conoció la moneda, el mercado libre ni el salario**. Funcionó bajo dos principios rectores fundamentales:

#### A. Los Dos Principios Económicos Rectores:
1. **Reciprocidad:** Intercambio simétrico de trabajo y bienes entre los miembros del Ayllu ("dar y recibir").
   - *Simétrica:* Se da entre iguales (*Ayni*: ayuda mutua intrafamiliar).
   - *Asimétrica:* Se da entre el Ayllu y el Estado imperial (la comunidad entrega trabajo colectivo forzoso al Estado mediante la mita, y el Inca "devuelve" la energía en forma de festines, chicha, ropa fina y seguridad en épocas de hambruna).
2. **Redistribución:** Función privativa y exclusiva del Estado cusqueño. El Inca acopiaba todos los excedentes de la producción agrícola, textil y armamentista en las **Colcas**, y los redistribuía entre las provincias afectadas por sequías, heladas, viudas, huérfanos o para avituallar al ejército en campaña.

#### B. Las Formas de Trabajo Andino:
- **Ayni:** Sistema de ayuda mutua intrafamiliar entre los miembros del Ayllu en faenas agrícolas y construcción de techos familiares (*"Hoy por ti, mañana por mí"*).
- **Minka:** Trabajo comunitario colectivo y festivo en beneficio comunal del Ayllu (limpieza de canales, siembra comunal) o para cultivar las tierras del Sol y del Inca.
- **Mita:** Trabajo obligatorio, rotativo y por turnos que los varones de 18 a 50 años (*mitayos*) prestaban gratuitamente al Estado imperial (construcción de andenes, calzadas, fortalezas, laboreo en minas de oro y plata, servicio de chasquis y filas del ejército).
- **Chunca:** Sistema de trabajo colectivo solidario de auxilio rápido activado exclusivamente en casos de desastres y catástrofes naturales (terremotos, aluviones o derrumbes).

#### C. Régimen de Tenencia de la Tierra:
1. **Tierras del Sol:** Destinadas a la manutención del clero sacerdotal, templos sagrados y la celebración de las fiestas religiosas y ofrendas.
2. **Tierras del Inca:** Destinadas a sostener a la nobleza cusqueña, la burocracia estatal y abastecer los silos y colcas militares del imperio.
3. **Tierras del Pueblo (Comunales):** Entregadas en usufructo intransferible a las familias del Ayllu. A cada varón recién nacido se le asignaba **un topo** de tierra (parcela suficiente para su manutención anual) y a cada mujer **medio topo**. La tierra no se podía vender ni transferir; pertenecía a la comunidad.

---



## 4. CUADRO SINÓPTICO COMPARATIVO

\begin{array}{|l|l|l|l|}
\hline
\textbf{Institución / Concepto} & \textbf{Definición Andina} & \textbf{Beneficiario Directo} & \textbf{Carácter / Lema} \\ \hline
\text{Ayni} & \text{Trabajo familiar recíproco} & \text{Familias del Ayllu} & \text{"Hoy por ti, mañana por mí"} \\ \hline
\text{Minka} & \text{Trabajo comunal solidario} & \text{Toda la comunidad / Sol / Inca} & \text{Festivo y voluntario} \\ \hline
\text{Mita} & \text{Trabajo obligatorio estatal} & \text{El Estado imperial cusqueño} & \text{Rotativo y por turnos} \\ \hline
\text{Chunca} & \text{Auxilio ante catástrofes} & \text{Afectados por huaycos/sismos} & \text{Emergencia inmediata} \\ \hline
\text{Curaca} & \text{Jefe tradicional del ayllu} & \text{Intermediario ayllu-Estado} & \text{Liderazgo de parentesco} \\ \hline
\text{Tucuy Ricuy} & \text{Inspector itinerante del Inca} & \text{La administración del Sapa Inca} & \text{"El que todo lo ve"} \\ \hline
\end{array}

---



### Mnemotecnia 2: "A-M-M-C" para las Formas de Trabajo
- **A**: **A**yni = Ayuda familiar.
- **M**: **M**inka = Mejora comunal del ayllu.
- **M**: **M**ita = Mando estatal obligatorio.
- **C**: **C**hunca = Catástrofes y auxilio.

---



### Hack 1: Distinción entre Yanaconas y Piñas
- **Yanaconas:** Siervos adscritos a la nobleza; no tenían ayllu pero gozaban de buen trato y podían poseer pequeñas pertenencias personales.
- **Piñas:** Prisioneros de guerra rebeldes sometidos a **esclavitud forzosa de Estado** en los cocales insalubres de la selva alta; eran la clase más explotada y paria del imperio.



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Topo NO era una medida fija en metros cuadrados**
> El **topo** no medía una superficie geométrica idéntica en todo el imperio. Su tamaño dependía de la **calidad del suelo y del régimen ecológico**: en tierras fértiles de regadío el topo era más pequeño; en punas y secano era mucho más extenso, pues su objetivo era garantizar la **alimentación suficiente** de una persona durante un año.

> [!CAUTION]
> **Trampa 2: La reciprocidad simétrica vs. asimétrica**
> El Ayni es reciprocidad **simétrica** (entre pares del ayllu). La relación tributaria con el Inca es reciprocidad **asimétrica** (el hatun runa da mano de obra física en la mita y el Inca retribuye con bienes ceremoniales de las colcas).

> [!WARNING]
> **Trampa 3: Pachacútec no fue el primer inca de la dinastía**
> Pachacútec fue el **noveno monarca del Capac Cuna**, pero fue el **primer emperador de la fase expansiva imperial**. Antes de él gobernaron ocho incas en fases tribales y confederativas.

---



### Caso 1: La Vigencia Ancestral de la Minka y el Ayni en el Perú Rural
En las comunidades campesinas de los Andes peruanos (Cusco, Ayacucho, Puno, Huancavelica), las obras comunales como la limpieza de canales de riego, la construcción de locales comunales o la siembra y cosecha de papa continúan ejecutándose bajo las figuras consuetudinarias de la **Minka** y el **Ayni**. Esta cohesión social andina sin remuneración monetaria es un patrimonio cultural vivo que asombra a la sociología y economía moderna.



### Ejercicio 2 (Nivel 2 - Intermedio Operativo): Principios Económicos Andinos
**Enunciado (UNMSM DECO):** La economía incaica careció del uso de moneda acuñada y de mercados abiertos en el sentido occidental. En su lugar, el sistema productivo y distributivo se sustentó en los principios ancestrales andinos de:
A) Libre comercio y feudalismo señorial.  
B) Reciprocidad comunal simétrica y redistribución estatal asimétrica de excedentes.  
C) Esclavitud masiva de mano de obra y pago estricto de salarios en oro.  
D) Acaparamiento individual de la tierra y herencia privada.  
E) Centralización mercantil y monopolio de gremios artesanales.

**Solución paso a paso:**
1. El orden socioeconómico del Tawantinsuyu funcionó sobre dos pilares: la **reciprocidad** (prestación mutua de trabajo a nivel del ayllu) y la **redistribución**.
2. Mediante la redistribución, el Estado acopiaba los excedentes de la mita en las colcas imperiales para proveer de recursos en tiempos de crisis a las provincias.
**Respuesta:** **B) Reciprocidad comunal simétrica y redistribución estatal asimétrica de excedentes.**

---



### Ejercicio 4 (Nivel 4 - Análisis Crítico / UNI CEPRE): Formas de Trabajo Andino
**Enunciado (UNI):** Dentro del complejo sistema de relaciones laborales del Tawantinsuyu, la mano de obra era convocada según la naturaleza y finalidad de la tarea. Identifique la alternativa que describe correctamente la institución de la **Mita**:
A) Era la ayuda mutua recíproca entre miembros de un mismo ayllu para levantar techos familiares.  
B) Era el auxilio solidario que se activaba de emergencia únicamente tras un aluvión o terremoto.  
C) Era el trabajo obligatorio, periódico y por turnos que los hatun runas prestaban al Estado para obras públicas y el ejército.  
D) Era la faena comunal voluntaria para cultivar las tierras exclusivas del sol en días festivos.  
E) Era la condena perpetua impuesta a los prisioneros de guerra en los cocales amazónicos.

**Solución paso a paso:**
1. La **Mita** (turno) era el tributo fundamental en energía física que todo hatun runa varón en edad productiva adeudaba al Sapa Inca.
2. Se cumplía de forma rotativa en obras monumentales (caminos, puentes, andenes, fortalezas) o en la guerra.
**Respuesta:** **C) Era el trabajo obligatorio, periódico y por turnos que los hatun runas prestaban al Estado para obras públicas y el ejército.**

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Ayllu:** Comunidad básica andina unida por vínculos consanguíneos, territoriales, de trabajo colectivo y adoración a un tótem o antepasado común.
2. **Panaca:** Familia linajuda y corte personal de un emperador inca difunto, integrada por todos sus descendientes varones y mujeres, excepto el heredero reinante.
3. **Mallqui:** Momia sagrada de los antepasados nobles incaicos, venerada y consultada como oráculo en los grandes rituales del Cusco.
4. **Mascapaicha:** Borla de lana fina de color rojo encendido coronada con plumas de corequenque, insignia exclusiva del poder soberano del Sapa Inca.
5. **Mitimaes (Mitmas):** Familias o ayllus trasladados por mandato del Inca a otras provincias con fines de colonización agrícola, adoctrinamiento o control geopolítico.
6. **Colca:** Gran almacén o silo estatal construido en hileras en laderas ventiladas para conservar alimentos desecados y vestimentas para la redistribución.
7. **Tambo:** Edificación y albergue de posta construido a lo largo del Qhapaq Ñan para suministrar alimentos, descanso y abrigo a los chasquis y ejércitos imperiales.
8. **Chasqui:** Mensajero y corredor veloz oficial que transportaba información oficial de posta en posta a través de las rutas del Qhapaq Ñan.
9. **Capac Cocha:** Rito ceremonial panandino de ofrendas supremas y sacrificios de niños a los dioses tutelares y apus en circunstancias cósmicas críticas.
10. **Topo:** Extensión de tierra de cultivo entregada anualmente en usufructo por el ayllu a cada familia para garantizar su autosuficiencia alimentaria.

---



### 3.1. Orígenes Míticos e Históricos del Tawantinsuyu
- **Mitos Fundacionales:**
  1. *Mito de Manco Cápac y Mama Ocllo:* Recogido por el cronista **Inca Garcilaso de la Vega** en *Comentarios Reales de los Incas*. Salida sagrada de las aguas del Lago Titicaca (*pacarina*); misión civilizadora otorgada por el dios Sol (*Inti*) de clavar la barreta de oro en el cerro Huanacaure; ensalza el linaje noble de origen cuzqueño.
  2. *Mito de los Hermanos Ayar:* Recogido por **Juan de Betanzos** en *Suma y Narración de los Incas*. Cuatro hermanos varones y cuatro mujeres salidos de las ventanas del cerro Tamputoco (Paccaritambo, Paruro): Ayar Cachi (encerrado en la cueva por su descomunal fuerza telúrica), Ayar Uchu (convertido en huaca de piedra en Huanacaure), Ayar Auca (convertido en piedra voladora en el cerro del Cusco) y **Ayar Manco**, quien junto a las cuatro hermanas fundó la ciudad del Cusco. Refleja la migración histórica de cuatro clanes agrícolas y guerreros de origen aimara-tiwanaku que huyeron del Collao invadido.

#### Fases Históricas del Estado Incaico:
1. **Periodo Tribal o Curacal (Siglos XII - XIII):** Asentamiento inicial en el valle de Acamama (Cusco) bajo Manco Cápac y Sinchi Roca.
2. **Periodo de la Confederación Cusqueña (Siglo XIV):** Alianza defensiva con etnias vecinas (desde Lloque Yupanqui hasta Huiracocha Inca).
3. **Periodo Imperial o Expansión Panandina (1438 - 1532):**
   - **Pachacútec (1438 - 1471):**
     - *La Guerra contra los Chancas (1438):* Ante la huida del anciano inca Huiracocha y su sucesor Urco frente a la invasión chanca comandada por Astoy Huaraca y Tomay Huaraca, el joven príncipe **Cusi Yupanqui** asumió la resistencia militar. Derrotó a los chancas en la épica **Batalla de Yahuarpampa** ("llanura de sangre") con la leyenda de los *Pururaucas* (soldados de piedra que cobraron vida).
     - Asumió el trono como **Pachacútec** ("el transformador de la tierra y del tiempo").
     - *Obras Maestras:* Diseñó el Cusco con forma de puma, reedificó el templo del Coricancha, mandó construir Sacsayhuamán y Machu Picchu, implantó el sistema de **mitimaes**, oficializó el quechua (**Runa Simi**) como idioma de integración imperial, organizó el sistema de chasquis y chasquihuasis, y dividió el territorio en los **Cuatro Suyos**:
       - *Chinchaysuyo:* Norte (costa y sierra norte; el más poblado e industrial).
       - *Collasuyo:* Sur (altiplano del Collao; el más extenso territorialmente).
       - *Antisuyo:* Este (ceja de selva; proveedor de coca y madera).
       - *Contisuyo:* Oeste (suroeste costero y valles de Arequipa e Ica; el más pequeño).
   - **Túpac Inca Yupanqui (1471 - 1493):**
     - El mayor genio militar conquistador del imperio (el "Alejandro Magno andino"). Sometió al reino Chimú (capturando a Minchancaman), a los Chachapoyas, Cañaris y extendió las fronteras australes hasta el río Maule (Chile). Realizó una célebre expedición marítima en balsas por el océano Pacífico que según las crónicas tocó las islas de la Polinesia (Mangareva y Pascua).
   - **Huayna Cápac (1493 - 1525):**
     - Consolidó las fronteras septentrionales hasta el río Ancasmayo (Pasto, Colombia), alcanzando la **máxima extensión territorial del Tawantinsuyu**.
     - Falleció repentinamente de viruela europea junto a su heredero legítimo Ninan Cuyuchi hacia 1525-1527, desatando la sangrienta **guerra civil fratricida entre Huáscar y Atahualpa**.

---



### 3.5. Cosmovisión, Religión y Caída del Tawantinsuyu

#### A. La Cosmovisión Andina y sus Planos Sagrados:
- Concepción del tiempo: **Cíclico** (eras cósmicas alternadas por cataclismos o *Pachacuti*).
- Concepción espacial tripartita:
  1. **Hanan Pacha:** El mundo de arriba, celeste y celestial; morada de los dioses estelares (el Sol o *Inti*, la Luna o *Quilla*, el Rayo o *Illapa*, las Pléyades o *Collca*).
  2. **Kay Pacha:** El mundo terrenal del aquí y el ahora; habitado por los seres humanos, animales y plantas.
  3. **Uku Pacha:** El mundo subterráneo, interior y de los muertos; origen de la vida, las semillas, gérmenes y manantiales (*pacarinas*).

#### B. Deidades Principales:
- **Apu Kon Ticci Wiracocha:** Dios ordenador supremo y civilizador del universo andino.
- **Inti:** El Dios Sol; divinidad tutelar oficial imperial, padre de la dinastía reinante; su santuario principal fue el **Coricancha** en el Cusco.
- **Illapa:** Dios del rayo, relámpago y trueno; señor de las tempestades y las lluvias.
- **Pachamama:** La Madre Tierra, deidad fecundadora agraria.
- **Pachacámac:** Dios oracular costeño de los terremotos y movimientos telúricos.
- **Ritos y la Capac Cocha:** Ofrenda suprema imperial consistente en el sacrificio ceremonial de niños y doncellas de linaje noble en las cumbres nevadas de los volcanes y montañas sagradas (**Apus**) para restablecer la armonía cósmica ante erupciones volcánicas o muerte del monarca (ej. la célebre momia de la "Dama de Ampato" o Juanita en Arequipa).

#### C. Factores Reales de la Caída del Tawantinsuyu:
La caída de un imperio de más de diez millones de habitantes ante un destacamento de solo 168 conquistadores comandados por Francisco Pizarro en Cajamarca (1532) no se explica por la supuesta "superioridad racial" o armamentista española, sino por factores estructurales profundos:
1. **La Guerra Civil Fratricida Dinástica:** El cruento choque bélico entre Huáscar y Atahualpa desangró las tropas de élite del imperio, rompió el principio de reciprocidad y dividió mortalmente a las panacas nobles cusqueñas y quiteñas.
2. **El Resentimiento y la Sublevación de las Etnias Conquistadas:** Decenas de naciones andinas recientemente sojuzgadas por la violencia incaica (**Huancas, Chachapoyas, Cañaris, Chancas, Huaylas**) vieron a los españoles como sus libertadores mesiánicos y forjaron una **alianza militar masiva con Pizarro**, aportando miles de guerreros auxiliares, víveres y cargadores.
3. **El Impacto Demográfico y Biológico de las Epidemias:** La llegada previa de la viruela, el sarampión y la peste diezmaron a más de un tercio de la población andina antes de que los españoles pisaran Cajamarca, segando la vida del propio emperador Huayna Cápac.

---



### Ejercicio 3 (Nivel 3 - Contexto DECO Avanzado): Causa Central de la Caída del Imperio
**Enunciado (UNMSM DECO / UNSA):** Durante siglos, la historiografía tradicional atribuyó la fulminante caída del Tawantinsuyu ante las huestes de Francisco Pizarro a la valentía militar hispana y al impacto psicológico de los caballos y arcabuces. Sin embargo, las modernas investigaciones etnohistóricas (Waldemar Espinoza, María Rostworowski) han demostrado que el factor determinante fue:
A) La invasión simultánea de tribus araucanas desde el extremo sur.  
B) El apoyo militar masivo brindado a los españoles por etnias y señoríos andinos sometidos (como huancas, cañaris y chachapoyas) que buscaban liberarse del dominio cusqueño.  
C) La sublevación violenta de las Acllas y los artesanos quipucamayocs en el Cusco.  
D) La escasez total de armas de bronce y cobre en los almacenes estatales.  
E) La conversión religiosa voluntaria de los ejércitos de Atahualpa al catolicismo.

**Solución paso a paso:**
1. Los invasores españoles se beneficiaron del descontento de numerosos pueblos que habían sido anexados violentamente por los incas.
2. Reinos como los **huancas, cañaris y chachapoyas** se aliaron militarmente con Pizarro, aportando decenas de miles de guerreros indígenas que lucharon en primera línea contra las fuerzas atahualpistas.
**Respuesta:** **B) El apoyo militar masivo brindado a los españoles por etnias y señoríos andinos sometidos (como huancas, cañaris y chachapoyas) que buscaban liberarse del dominio cusqueño.**

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **P:** ¿Quién recogió el mito fundacional de Manco Cápac y Mama Ocllo emergiendo del Lago Titicaca?
  - **R:** El cronista Inca Garcilaso de la Vega en sus *Comentarios Reales de los Incas*.
- **P:** ¿Qué victoria militar en 1438 dio nacimiento a la etapa imperial y transformadora del Tawantinsuyu bajo Pachacútec?
  - **R:** La victoria sobre los chancas en la Batalla de Yahuarpampa.
- **P:** ¿Cómo se llamaba el consejo imperial que asesoraba directamente al Sapa Inca integrado por los cuatro gobernantes de los suyos?
  - **R:** El Tahuantinsuyo Camachic.
- **P:** ¿Qué funcionario incaico era conocido como "el que todo lo ve" por fiscalizar las provincias y administrar justicia?
  - **R:** El Tucuy Ricuy.
- **P:** ¿Qué principio económico andino consistía en el intercambio recíproco de mano de obra entre familias del mismo ayllu?
  - **R:** La reciprocidad simétrica (el *Ayni*).
- **P:** ¿Qué nombre recibía la forma de trabajo obligatorio y por turnos que los hatun runas prestaban al Estado imperial?
  - **R:** La *Mita*.
- **P:** ¿Qué tres planos o mundos componían la cosmovisión espacial de los incas?
  - **R:** El Hanan Pacha (mundo de arriba), el Kay Pacha (mundo terrenal) y el Uku Pacha (mundo de abajo subterráneo).
- **P:** ¿Cuál fue la causa estructural interna determinante de la derrota incaica ante los conquistadores españoles?
  - **R:** La rebelión y alianza militar de etnias sometidas (Huancas, Cañaris, Chachapoyas) con las huestes de Pizarro, agravada por la guerra civil dinástica.

---



### Ejercicio 5 (Nivel 5 - Reto Titán / Examen de Excelencia): Geopolítica y Dinastía Incaica
**Enunciado (Reto Historiográfico Élite):** Determine la veracidad (V) o falsedad (F) de las siguientes proposiciones sobre la historia y sociedad incaica:
I. El gobernante Pachacútec asumió el poder tras vencer a los chancas en la Batalla de Yahuarpampa, organizó los Cuatro Suyos y oficializó el Runa Simi.  
II. Las panacas reales cusqueñas eran asambleas comunales democráticas donde los hatun runas elegían por sufragio secreto al próximo soberano.  
III. La ceremonia de la Capac Cocha implicaba el sacrificio de niños de noble linaje en las altas cumbres para honrar a los Apus tutelares.  
IV. El imperio alcanzó su máxima expansión territorial hacia el sur con Huayna Cápac al conquistar hasta el estrecho de Magallanes.

A) V - F - V - F  
B) V - V - F - F  
C) F - F - V - V  
D) V - F - V - V  
E) F - V - V - F  

**Solución paso a paso:**
- **Afirmación I (VERDADERA):** Pachacútec lideró la victoria sobre los chancas (1438), fundó la etapa imperial, instituyó los 4 suyos e impuso el quechua.
- **Afirmación II (FALSA):** Las panacas eran linajes aristocráticos cerrados compuestos por los descendientes de cada inca fallecido, encargados de cuidar su momia (*mallqui*) y administrar sus extensas propiedades.
- **Afirmación III (VERDADERA):** La Capac Cocha era el rito de consagración cósmica donde se realizaban sacrificios rituales de niños puros de la aristocracia andina en volcanes sagrados (ej. Dama de Ampato).
- **Afirmación IV (FALSA):** La frontera sur no llegó al estrecho de Magallanes, sino únicamente hasta el **río Maule (Chile)**, detenida por la feroz resistencia del pueblo mapuche; Huayna Cápac expandió el imperio hacia el **norte** (río Ancasmayo, Colombia).
- Secuencia: V - F - V - F.
**Respuesta:** **A) V - F - V - F**.

---



### Ejercicio 1 (Nivel 1 - Acceso Inmediato): Instituciones del Tawantinsuyu
**Enunciado (UNSA):** En la estructura administrativa del Imperio del Tawantinsuyu, el funcionario imperial itinerante que recorría secretamente las provincias para supervisar la recaudación de tributos, fiscalizar a los gobernantes locales y administrar justicia en nombre del Sapa Inca era el:
A) Apunchic  
B) Tucuy Ricuy  
C) Curaca  
D) Quipucamayoc  
E) Suyuyuc Apu

**Solución paso a paso:**
1. El **Tucuy Ricuy** (cuyo nombre en quechua significa "el que todo lo ve") era el inspector imperial de confianza directa del Sapa Inca.
2. Poseía facultades judiciales como *Taripa Camayoc* y celebraba matrimonios oficiales de hatun runas (*Huarmicoco*).
**Respuesta:** **B) Tucuy Ricuy**.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "hper_t03_s02_c01",
                    question = "Los dos principios rectores que articularon el funcionamiento del sistema económico en el Tawantinsuyu fueron:",
                    options = listOf(
                        "El libre mercado y la usura financiera.",
                        "La reciprocidad (simétrica y asimétrica) y la redistribución estatal.",
                        "El feudalismo hereditario y el trabajo asalariado en moneda.",
                        "La esclavitud masiva de prisioneros de guerra en plantaciones.",
                    ),
                    correctIndex = 1,
                    explanation = "En ausencia de moneda y mercado, la reciprocidad normaba el intercambio de ayuda mutua entre miembros del ayllu («hoy por ti, mañana por mí»), mientras que la redistribución permitía al Estado almacenar excedentes tributarios en colcas y repartirlos en épocas de sequía o necesidad."
                ),
                Challenge(
                    id = "hper_t03_s02_c02",
                    question = "En el mundo andino incaico, la forma de trabajo solidario y de ayuda mutua recíproca entre los miembros de una misma familia o ayllu para labrar sus tierras o construir sus viviendas se denominaba:",
                    options = listOf(
                        "Ayni",
                        "Mita",
                        "Minka",
                        "Chunca",
                    ),
                    correctIndex = 0,
                    explanation = "El ayni consistía en la ayuda prestada entre familias nucleares con el compromiso de que quien recibía la ayuda la devolvería en condiciones semejantes cuando el otro lo necesitara."
                ),
                Challenge(
                    id = "hper_t03_s02_c03",
                    question = "La minka (o minga) se diferenciaba del ayni fundamentalmente porque constituía un trabajo colectivo festivo destinado a:",
                    options = listOf(
                        "La explotación de yacimientos mineros de mercurio.",
                        "El beneficio común del ayllu (como limpiar canales comunales) o el cultivo de las tierras del Sol y del Inca.",
                        "El servicio doméstico forzado en la casa del corregidor.",
                        "La leva forzosa de soldados para conquistar la selva.",
                    ),
                    correctIndex = 1,
                    explanation = "La minka convocaba a todos los comuneros del ayllu para obras comunitarias de utilidad colectiva o para trabajar las tierras sagradas del Sol y del Inca en un clima festivo con música, chicha y comida ofrecida por los beneficiarios."
                ),
                Challenge(
                    id = "hper_t03_s02_c04",
                    question = "La forma de trabajo obligatoria, rotativa y por turnos que los varones adultos del ayllu (hatun runas de 18 a 50 años) debían entregar al Estado imperial para construir calzadas, fortalezas, templos o servir en el ejército se denominaba:",
                    options = listOf(
                        "Ayni",
                        "Mita",
                        "Chunca",
                        "Yanaconaje",
                    ),
                    correctIndex = 1,
                    explanation = "La mita incaica era el tributo supremo al Estado: no se pagaba con productos manufacturados ni cosechas, sino con la energía humana y tiempo de trabajo organizado rigurosamente por turnos para la construcción pública y el ejército."
                ),
                Challenge(
                    id = "hper_t03_s02_c05",
                    question = "El sistema de trabajo solidario de auxilio rápido movilizado exclusivamente en situaciones de emergencia comunal extrema (como huaicos, derrumbes o terremotos) recibía el nombre de:",
                    options = listOf(
                        "Mita minera",
                        "Mitma",
                        "Ayni",
                        "Chunca",
                    ),
                    correctIndex = 3,
                    explanation = "La chunca era un sistema de auxilio organizado por cuadrillas (compuestas muchas veces por mujeres) para atender catástrofes naturales, socorrer heridos y reconstruir acequias arrasadas."
                ),
                Challenge(
                    id = "hper_t03_s02_c06",
                    question = "En la distribución incaica de la tierra, la parcela de cultivo asignada anualmente a cada padre de familia del ayllu para garantizar su subsistencia se denominaba topo, cuya medida era aproximadamente:",
                    options = listOf(
                        "Un topo para el varón y medio topo para cada hija mujer.",
                        "Tres topos por matrimonio sin importar los hijos.",
                        "Un topo para el curaca y diez para el hatun runa.",
                        "La mitad de una hectárea fija delimitada por alambrados.",
                    ),
                    correctIndex = 0,
                    explanation = "El topo era una medida variable de superficie agrícola suficiente para alimentar a una persona durante un año; al nacer un varón se asignaba a la familia un topo adicional, y medio topo al nacer una mujer."
                ),
                Challenge(
                    id = "hper_t03_s02_c07",
                    question = "Las colcas estatales en el Imperio Incaico cumplían una función socioeconómica decisiva consistente en:",
                    options = listOf(
                        "Monopolios comerciales privados de la nobleza de privilegio.",
                        "Templos subterráneos destinados a oráculos de ultratumba.",
                        "Ser centros de detención punitiva para criminales reincidentes.",
                        "Grandes almacenes y depósitos situados en las laderas ventiladas de los cerros para preservar excedentes de alimentos deshidratados (chuño, charqui), ropa y armas con fines de previsión y redistribución.",
                    ),
                    correctIndex = 3,
                    explanation = "Las colcas aprovechaban las corrientes de aire fresco de las laderas para conservar por años maíz, chuño y charqui, asegurando la supervivencia del imperio frente a sequías y abasteciendo a las tropas en marcha."
                ),
                Challenge(
                    id = "hper_t03_s02_c08",
                    question = "Los mitimaes (o mitmas) eran poblaciones enteras trasladadas voluntaria o forzosamente de su región de origen hacia otras provincias con el propósito de:",
                    options = listOf(
                        "Venderlas como esclavas en mercados costeños.",
                        "Aislar a los leprosos y enfermos de viruela.",
                        "Colonizar zonas deshabitadas, enseñar el quechua y las costumbres imperiales, y garantizar la pacificación militar y política de pueblos recién conquistados.",
                        "Construir exclusivamente embarcaciones de totora.",
                    ),
                    correctIndex = 2,
                    explanation = "Los mitimaes fueron un formidable instrumento de cohesión estatal: etnias leales al Cusco eran asentadas en zonas rebeldes para pacificarlas e inculcar la cultura incaica, mientras que grupos insumisos eran dispersados para quebrar su capacidad de rebeldía."
                ),
                Challenge(
                    id = "hper_t03_s02_c09",
                    question = "Dentro de la estructura social andina, los yanaconas o yanas se diferenciaban de los hatun runas comunes porque:",
                    options = listOf(
                        "Pertenecían a la estirpe consanguínea de los fundadores míticos.",
                        "Eran personas desvinculadas de su ayllu y de la reciprocidad comunal, dedicadas al servicio perpetuo y exclusivo de la nobleza o del Estado incaico.",
                        "Eran sacerdotes de alto rango en el templo de la Luna.",
                        "Gozaban de propiedades privadas inalienables.",
                    ),
                    correctIndex = 1,
                    explanation = "Los yanaconas perdían su membresía en el ayllu comunal de origen; su condición era hereditaria y pasaban a depender directamente del Sapa Inca o de nobles a quienes el soberano los asignaba como sirvientes."
                ),
                Challenge(
                    id = "hper_t03_s02_c10",
                    question = "Las mujeres escogidas por su belleza, habilidad textil o linaje para ser educadas en los Acllahuasis del imperio bajo la tutela de las mamaconas se denominaban:",
                    options = listOf(
                        "Ñustas",
                        "Pallas",
                        "Coyas",
                        "Acllas",
                    ),
                    correctIndex = 3,
                    explanation = "Las acllas confeccionaban los finísimos tejidos de cumbi y la chicha para las fiestas del Sol; algunas eran consagradas al culto religioso perpetuo como sacerdotisas y otras eran entregadas por el inca como esposas a curacas y militares distinguidos."
                ),
            )
        )
    )
}
