package geografia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeografiaSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geo_t08_s01",
            title = "3.1. Origen, Criterios y Pisos Ecológicos Occidentales (Chala a Suni)",
            theory = LessonTheory(
                title = "Origen, Criterios y Pisos Ecológicos Occidentales (Chala a Suni)",
                content = """# TEMA 08: Las Ocho Regiones Naturales del Perú (Javier Pulgar Vidal)

---



### Matriz de Aprendizajes Esperados (Estándar UNSA / UNMSM-DECO / UNI)
* **Conceptual:** Analizar los seis criterios de clasificación ecológica-geográfica formulados por el Dr. Javier Pulgar Vidal (altitudinal, toponímico, climático, ecológico/flora/fauna, geomorfológico y actividad antrópica tradicional). Caracterizar cada una de las 8 regiones naturales: Chala, Yunga, Quechua, Suni, Puna, Janca, Rupa Rupa y Omagua.
* **Procedimental:** Localizar los límites altitudinales de cada región, identificar la toponimia aborigen (quechua, aymara, cauqui) y asociar especies emblemáticas de flora y fauna a su piso ecológico correspondiente.
* **Actitudinal / Crítico:** Valorar el conocimiento ecológico ancestral de los pueblos andino-amazónicos sobre el control vertical de pisos ecológicos y reflexionar sobre la vulnerabilidad de la biodiversidad ante la degradación antrópica.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    OCHO_REG["Las 8 Regiones Naturales del Perú (Javier Pulgar Vidal, 1940)"] --> CRIT["Criterios de Clasificación"]
    OCHO_REG --> VER_OCC["Vertiente Occidental y Cumbres"]
    OCHO_REG --> VER_ORI["Vertiente Oriental y Llanura Amazónica"]

    CRIT --> ALT["Altitudinal (Factor Principal)"]
    CRIT --> TOP["Toponímico (Etimología Nativa)"]
    CRIT --> CLI["Climático (Temperatura y Lluvias)"]
    CRIT --> BIO["Ecológico (Flora y Fauna)"]
    CRIT --> MORF["Geomorfológico (Relieve)"]
    CRIT --> ACT["Actividad Humana y Productos"]

    VER_OCC --> CHALA["1. Chala o Costa (0 a 500 m)<br/>'Maizal / Amontonamiento'"]
    VER_OCC --> YUNGA["2. Yunga (500 a 2 300 m)<br/>'Valle cálido' (Marítima y Fluvial)"]
    VER_OCC --> QUECHUA["3. Quechua (2 300 a 3 500 m)<br/>'Tierra de clima templado'"]
    VER_OCC --> SUNI["4. Suni o Jalca (3 500 a 4 000 m)<br/>'Tierras altas / Heladas'"]
    VER_OCC --> PUNA["5. Puna (4 000 a 4 800 m)<br/>'Soroche / Altiplano'"]
    VER_OCC --> JANCA["6. Janca o Cordillera (4 800 a 6 768 m)<br/>'Blanco / Nieve'"]

    VER_ORI --> RUPA["7. Rupa Rupa o Selva Alta (400 a 1 000 m)<br/>'Ardiente / Muy lluvioso'"]
    VER_ORI --> OMAGUA["8. Omagua o Selva Baja (80 a 400 m)<br/>'Peces de agua dulce / Muy cálido'"]
```

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1. Origen y Criterios de la Tesis de Javier Pulgar Vidal

En 1940, durante la **III Asamblea General del Instituto Panamericano de Geografía e Historia (IPGH)** celebrada en Lima, el ilustre geógrafo huanuqueño **Dr. Javier Pulgar Vidal** presentó su trascendental tesis doctoral titulada *Las Ocho Regiones Naturales del Perú*, superando de forma definitiva la simplista e insuficiente división virreinal y republicana tradicional de "Costa, Sierra y Montaña".

#### Los 6 Criterios de Clasificación Científica:
1. **Factor Altitudinal:** Criterio director y estructurante. La altitud impone variaciones bruscas de temperatura, presión atmosférica, humedad y radiación solar conforme se asciende en la cordillera.
2. **Criterio Toponímico (Etimología Nativa):** Rescata el saber vernáculo de las lenguas aborígenes (quechua, aymara, cauqui y lenguas amazónicas) que sintetizaban en un vocablo la realidad geográfica y climática de cada piso ecológico.
3. **Criterio Climático:** Considera las temperaturas medias y extremas, la insolación, la nubosidad y el régimen pluvial estacional.
4. **Criterio Ecológico (Flora y Fauna):** Identifica las especies bioindicadoras endémicas adaptadas a cada hábitat térmico.
5. **Criterio Geomorfológico:** Tipo de relieve dominante (llanuras aluviales, desfiladeros, mesetas, conos volcánicos, llanuras aluviales meándricas).
6. **Criterio de la Actividad Humana (Agropecuario y Cultural):** Productos agrícolas cultivables, domesticación milenaria y adaptación del ser humano.

---



### 3.2. Estudio Exhaustivo de las 8 Regiones Naturales

```
Altitud (m)
6 768 |                                  [JANCA O CORDILLERA] (Nieve permanente, cóndor)
      |                                        /\
4 800 |---------------------------------------/  \---------------------------------------
      |                         [PUNA]       /    \
      |                    (Ichu, camélidos) /      \
4 000 |-------------------------------------/        \-----------------------------------
      |                   [SUNI]           /          \
      |              (Cantuta, heladas)   /            \
3 500 |----------------------------------/              \---------------------------------
      |               [QUECHUA]         /                \
      |          (Maíz, clima benigno) /                  \
2 300 |-------------------------------/                    \-----------------------------
      |          [YUNGA]             /                      \        [RUPA RUPA]
      |     (Frutales, huaycos)     /                        \     (Selva Alta, pongos)
  500 |----------------------------/                          \-------------------------- (1 000 m)
      |       [CHALA O COSTA]     /                            \     [OMAGUA]
    0 +==========================/                              \====(Selva Baja, tahuampas) (80 m)
         Océano Pacífico (Oeste)                                     Llanura Amazónica (Este)
```

---

#### 1. Región Chala o Costa (0\text{ a }500\text{ m s.n.m.})
* **Toponimia:**
  * En quechua: *"Maizal"* o *"amontonamiento de nubes secas"*.
  * En aymara: *"Amontonamiento"* o *"tierra arenosa y yerma"*.
  * En cauqui: *"Tierra seca y arcillosa"*.
* **Relieve:** Llanuras aluviales (valles transversales), pampas desérticas, tablazos sobreelevados, dunas, depresiones salinas y lomas costeras.
* **Clima:**
  * *Centro-Sur (desde Piura hasta Tacna):* **Subtropical árido**, templado cálido, húmedo en invierno por nieblas estratos y garúas traídas por la Corriente de Humboldt; casi ausencia total de lluvias torrenciales.
  * *Norte (Tumbes y norte de Piura):* **Semiaridocaluroso a tropical seco**, caluroso con lluvias en verano por influjo de la Corriente de El Niño.
* **Flora:** Algarrobo, zapote, caña brava, totora, carrizos, flor de Amancaes y lito en lomas, mangle rojo (en esteros de Tumbes).
* **Fauna:** Anchoveta, sardina, lobos marinos, aves guaneras (guanay, piquero, pelícano), zarcillo, pingüino de Humboldt, conchas negras.
* **Productos y Agricultura:** Caña de azúcar, algodón, espárragos, páprika, uvas de mesa, cítricos, arroz.

---

#### 2. Región Yunga (500\text{ a }2\,300\text{ m s.n.m.})
* **Toponimia:** En quechua significa *"Valle cálido"*; en aymara: *"Mujer estéril"* (por la escasez de vegetación natural arbórea en sus quebradas pedregosas).
* **Subregiones Geográficas:**
  1. **Yunga Marítima (500\text{ a }2\,300\text{ m}):** Flanco occidental andino que mira al Pacífico. Clima desértico cálido, extremadamente soleado casi todo el año, aire seco. Es la **zona endémica de huaycos o llocllas** en verano. Ciudades: Chosica, Moquegua, Tacna, Nazca.
  2. **Yunga Fluvial (1\,000\text{ a }2\,300\text{ m}):** Valles interandinos y flanco oriental andino. Clima templado cálido y húmedo con lluvias estivales copiosas. Menos insolación directa. Ciudades: Huánuco, Chachapoyas, Abancay.
* **Relieve:** Quebradas estrechas y profundas, valles intermontanos encajonados, laderas empinadas y pedregosas.
* **Flora:** Molle (*Schinus molle*, el árbol emblemático), cactáceas columnares (pitajaya, gigantón), cabuya o maguey, tara, carrizo.
* **Fauna:** Chaucato, taurigaray, alacranes, ciempiés, culebras, picaflores.
* **Actividad:** Es la **región frutal por excelencia del Perú** (palta, lúcuma, chirimoya, naranja, pacae, guayaba, manzana).

---

#### 3. Región Quechua (2\,300\text{ a }3\,500\text{ m s.n.m.})
* **Toponimia:** En quechua alude a *"Tierras de clima templado"* o *"tierras de valles y quebradas fértiles"*.
* **Relieve:** Valles interandinos amplios y laderas de pendiente moderada modeladas por erosión fluvial.
* **Clima:** Considerado unánimemente como **el clima más benigno, saludable y templado del mundo**: templado regular, aire seco y puro, días soleados y noches frescas. Lluvias periódicas en verano (enero a marzo).
* **Flora:** Aliso (*Alnus acuminata*, árbol típico), arrayán, calabaza, caigua, maíz (centro de origen y máxima diversificación genética), cantuta blanca, eucalipto (árbol exótico aclimatado).
* **Fauna:** Zorzal gris, zorro andino (*añás*), puma, venado gris, oso de anteojos, taruca.
* **Actividad:** Constituye la **zona de mayor concentración demográfica tradicional de la sierra y la despensa agrícola del Perú** (maíz, trigo, cebada, habas, hortalizas, tubérculos menores). Ciudades: **Arequipa (2\,325\text{ m})**, Cusco, Huancayo, Huaraz, Cajamarca, Ayacucho.

---

#### 4. Región Suni o Jalca (3\,500\text{ a }4\,000\text{ m s.n.m.})
* **Toponimia:** En quechua significa *"Tierras altas"*, *"ancho"*, *"largo"* o *"altas cumbres desoladas"*. En el norte peruano (Cajamarca) se le conoce como **Jalca**.
* **Relieve:** Muy quebrado, escarpado, con desfiladeros, paredes rocosas abruptas y cañones estrechos.
* **Clima:** Frío y seco. Es la **región límite de la agricultura tradicional y zona de inicio de las heladas meteorológicas invernales** que congelan las cosechas.
* **Flora:** **La Cantuta** (*Cantua buxifolia*, la flor sagrada de los incas y flor nacional del Perú), árbol de queñual, quishuar, saúco, taya. Cultivos de tubérculos resistentes al frío: **mashua, olluco, oca, quinua y papa amarga**.
* **Fauna:** Zorzal negro, cernícalo andino, allqamari (caracara andino), vizcacha, cuy silvestre.
* **Ciudades:** Puno (3\,827\text{ m}), Huancavelica, La Oroya, Juliaca.

---

#### 5. Región Puna (4\,000\text{ a }4\,800\text{ m s.n.m.})
* **Toponimia:** En quechua y aymara significa *"Soroche"*, *"mal de montaña"* o *"tierra alta y fría azotada por el viento"*.
* **Relieve:** Extensas mesetas altiplánicas onduladas (planicies altoandinas), colinas suaves y numerosas lagunas glaciares.
* **Clima:** **Frígido**. Atmósfera extremadamente diáfana y seca, con una oscilación térmica diaria descomunal (fuerte calor a pleno sol durante el día y temperaturas bajo cero en la noche: hasta -20^\circ\text{C}). Frecuentes tempestades de nieve, aguanieve y granizo.
* **Flora:** **Ichu** (paja brava, gramínea base de la dieta ganadera), **Puya de Raimondi** (*Puya raimondii*, titanca: florece cada 100 años con más de 8\,000 flores), yareta (planta compacta resinosa), pajonales y el cultivo nativo de la **maca** (hasta los 4\,400\text{ m}).
* **Fauna:** Hábitat de los cuatro **camélidos sudamericanos** (vicuña y guanaco silvestres; alpaca y llama domesticadas), parihuana o flamenco andino, cóndor, chinchilla, trucha arcoíris (en lagunas).
* **Ciudades y Asentamientos:** Cerro de Pasco (4\,380\text{ m}, la ciudad con más de 50\,000 hab. más alta del mundo), Junín.

---

#### 6. Región Janca o Cordillera (4\,800\text{ a }6\,768\text{ m s.n.m.})
* **Toponimia:** En aymara y quechua significa *"Blanco"* o *"maíz tostado y reventado"* (haciendo alusión a la nieve perpetua que cubre las cumbres).
* **Relieve:** Abrupto, escarpado, dominado por picos piramidales, crestas afiladas, morrenas, circos glaciares y abismos infranqueables.
* **Clima:** **Glaciar o muy frígido**. Temperaturas permanentemente por debajo de los 0^\circ\text{C} durante casi todo el año. Aire enrarecido con muy baja presión parcial de oxígeno.
* **Flora:** Muy escasa y especializada; líquenes, musgos y la diminuta flor de la yaretilla pegada a las rocas.
* **Fauna:** El **Cóndor andino** (*Vultur gryphus*), la vizcacha y el zorrino andino.
* **Actividad:** Explotación minera de socavón a gran altura (e.g., La Rinconada en Puno a más de 5\,100\text{ m s.n.m.}, el campamento minero permanente más alto del planeta) y andinismo/turismo de alta montaña.

---

#### 7. Región Rupa Rupa o Selva Alta (400\text{ a }1\,000\text{ m s.n.m.})
* **Toponimia:** En quechua significa *"Ardiente"* o *"lo que está caliente y quema"*.
* **Relieve:** Muy complejo y accidentado; cadenas montañosas cubiertas de selva, profundos cañones fluviales (**pongos**), valles longitudinales fértiles, terrazas y cavernas kársticas.
* **Clima:** Tropical cálido y húmedo. Es **la región más nubosa y lluviosa de todo el Perú** (registrándose en Quincemil, Cusco, más de 7\,000\text{ mm} de precipitación anual).
* **Flora:** **El Árbol de la Quina** (*Cinchona officinalis*, árbol nacional del escudo peruano), yarina, cedro, orquídeas, bromelias, tornillo.
* **Fauna:** **El Gallito de las Rocas** (*Rupicola peruvianus*, tunqui, ave nacional del Perú), otorongo (jaguar), tapir americano o sachavaca, mono choro de cola amarilla, serpiente shushupe, sajino.
* **Actividad y Ciudades:** Agricultura agroexportadora de **café, cacao, té, frutas tropicales y coca**. Ciudades: Tingo María, Bagua, Jaén, Moyobamba, Chanchamayo, Quillabamba.

---

#### 8. Región Omagua o Selva Baja (80\text{ a }400\text{ m s.n.m.})
* **Toponimia:** En lenguas originarias amazónicas significa *"Peces de agua dulce"* o *"tierra de hombres sabios"*.
* **Relieve:** Inmensa llanura aluvial horizontal de suave pendiente atravesada por ríos gigantescos de curso meándrico. Estructurada en cuatro niveles: **tahuampas** (pantanos permanentes), **restingas** (terrazas inundables temporales), **altos** (terrazas no inundables donde se fundan las urbes) y **filos** (colinas divisorias de aguas).
* **Clima:** **Tropical muy caluroso, húmedo y lluvioso**. Es **la región más calurosa del territorio nacional** (registrándose temperaturas máximas históricas superiores a 41^\circ\text{C} en Neshuya, Ucayali).
* **Flora:** Árboles madereros gigantescos como la **caoba o aguano**, el **cedro**, la **lupuna** (el árbol más alto de la selva peruana, con más de 60\text{ m} de altura), la palmera de aguaje, la castaña y la flor acuática gigante *Victoria regia*.
* **Fauna:** **El Paiche** (*Arapaima gigas*, pez gigante de agua dulce), anaconda, manatí amazónico, delfín rosado, caimán negro, charapa, ronsoco (capibara).
* **Ciudades:** Iquitos, Pucallpa, Tarapoto, Puerto Maldonado, Yurimaguas.

---



## 4. FORMULARIO MAESTRO / CUADRO SINÓPTICO



### Matriz Maestra de las 8 Regiones Naturales del Perú

| Región | Altitud (\text{m s.n.m.}) | Significado Toponímico | Clima Predominante | Especie de Flora Típica | Especie de Fauna Típica | Ciudad Emblemática |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Chala** | 0 - 500 | *"Maizal / Nubes amontonadas"* | Subtropical árido / Tropical seco | Algarrobo, Amancaes, Mangle | Anchoveta, Aves guaneras | Lima, Trujillo, Chiclayo |
| **Yunga** | 500 - 2\,300 | *"Valle cálido / Mujer estéril"* | Desértico cálido (sol permanente) | Molle, Pitajaya, Lúcumo | Chaucato, Taurigaray | Chosica, Moquegua, Tacna |
| **Quechua** | 2\,300 - 3\,500 | *"Tierra de clima templado"* | **Templado seco (el más benigno)**| Aliso, Maíz, Arrayán | Zorzal gris, Oso de anteojos | **Arequipa**, Cusco, Huancayo |
| **Suni** | 3\,500 - 4\,000 | *"Tierras altas / Heladas"* | Frío y seco (heladas frecuentes) | **Flor de la Cantuta**, Queñual | Allqamari, Zorzal negro | Puno, Huancavelica, Juliaca |
| **Puna** | 4\,000 - 4\,800 | *"Soroche / Mal de altura"* | Frígido (oscilación extrema) | **Ichu**, **Puya de Raimondi**, Maca | Vicuña, Alpaca, Parihuana | Cerro de Pasco, Junín |
| **Janca** | 4\,800 - 6\,768 | *"Blanco / Maíz tostado"* | Glaciar (bajo 0^\circ\text{C} siempre) | Líquenes, Yaretilla | **Cóndor andino**, Vizcacha | La Rinconada (campamento) |
| **Rupa Rupa**| 400 - 1\,000 | *"Ardiente / Caliente"* | Cálido húmedo (**la más lluviosa**) | **Árbol de la Quina**, Cedro | **Gallito de las Rocas**, Otorongo | Tingo María, Bagua, Jaén |
| **Omagua** | 80 - 400 | *"Peces de agua dulce"* | Tropical cálido (**la más calurosa**)| Caoba, **Lupuna**, Aguaje | **Paiche**, Anaconda, Charapa | Iquitos, Pucallpa, Tarapoto |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



## 6. TÉCNICAS Y ARTIFICIOS DE RESOLUCIÓN (HACKING PREUNIVERSITARIO)

1. **La Ubicación de Arequipa en las 8 Regiones:**
   * La Plaza de Armas de Arequipa está a **2\,325\text{ m s.n.m.}**
   * Por tanto, Arequipa pertenece formalmente a la **Región Quechua** (que empieza a los 2\,300\text{ m}), aunque sus distritos bajos hacia la costa limítrofe pertenezcan a la Yunga Marítima.
2. **Flora y Fauna Símbolos Patrios:**
   * **Flor Nacional (Cantuta):** Pertenece a la región **SUNI**.
   * **Árbol de la Quina (Árbol Nacional):** Pertenece a la región **RUPA RUPA** (Selva Alta).
   * **Gallito de las Rocas (Ave Nacional):** Pertenece a la región **RUPA RUPA**.
   * **Vicuña (Fauna del Escudo):** Pertenece a la región **PUNA**.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

* ⚠️ **Trampa 1: Confundir Yunga Marítima con Yunga Fluvial:**
  * Yunga Marítima: 500 - 2\,300\text{ m} en el flanco occidental desértico soleado (zona de huaycos).
  * Yunga Fluvial: 1\,000 - 2\,300\text{ m} en los valles interandinos orientales, más húmeda y con menor insolación.
* ⚠️ **Trampa 2: La Puya de Raimondi no crece en Janca:**
  * La Puya de Raimondi (*titanca*) es de la región **Puna** (4\,000 - 4\,800\text{ m}), no de la Janca. En la Janca solo viven líquenes y musgos.
* ⚠️ **Trampa 3: ¿Cuál es la región de mayor producción de maíz?**
  * La región **Quechua** es el centro de origen, domesticación y cultivo del maíz andino.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO



### Caso de Estudio DECO: El Control Vertical de Pisos Ecológicos de John Murra
El antropólogo John Murra formuló el modelo del **"Control vertical de un máximo de pisos ecológicos"** en las sociedades andinas prehispánicas:
1. **Fundamento Ecológico:** Las comunidades andinas (como los Lupacas en el Altiplano) no se limitaban a cultivar en su región de origen (Puna). Establecían colonias o "archipiélagos humanos" en la costa (Chala: sal, guano, ají, algodón), en los valles templados (Quechua: maíz), en las quebradas cálidas (Yunga: frutas, coca) y en la ceja de selva (Rupa Rupa: madera, plumas, miel).
2. **Autosuficiencia y Resiliencia:** Este manejo sincrónico de las 8 regiones naturales garantizaba la seguridad alimentaria frente a heladas o sequías locales, demostrando que la topografía andina no fue una barrera, sino una despensa complementaria escalonada.

---



## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel 1 - Básico Formativo: Altitudes y Toponimia)
**Enunciado:**
En la clasificación biogeográfica de Javier Pulgar Vidal, la región natural situada entre los 2\,300 y los 3\,500\text{ metros sobre el nivel del mar}, cuyo vocablo toponímico en lengua nativa alude a "tierras de clima templado" y que se caracteriza por poseer el clima más benigno y saludable del país, apto para el cultivo del maíz, se denomina:
* A) Yunga
* B) Quechua
* C) Suni
* D) Puna
* E) Rupa Rupa

**Solución Paso a Paso:**
1. Analizamos los límites altitudinales dados: 2\,300 a 3\,500\text{ m s.n.m.}
2. Esta faja altitudinal corresponde inequívocamente a la región **Quechua**, célebre por albergar a las principales ciudades serranas (Cusco, Huancayo, Arequipa) y ser el hábitat óptimo del maíz con un clima templado seco benigno.
* **Respuesta Correcta:** **B**

---



### Ejercicio 2 (Nivel 2 - Intermedio UNSA Ordinario: Especies Emblemáticas y Pisos)
**Enunciado:**
Relacione adecuadamente la región natural formulada por Javier Pulgar Vidal con la especie vegetal o animal que actúa como bioindicador característico de dicho piso ecológico:
1. Puna  
2. Suni  
3. Rupa Rupa  
4. Yunga  

a. Flor de la Cantuta (*Cantua buxifolia*)  
b. Puya de Raimondi (*Puya raimondii*)  
c. Molle (*Schinus molle*)  
d. Gallito de las Rocas (*Rupicola peruvianus*)  

* A) 1b, 2a, 3d, 4c
* B) 1a, 2b, 3c, 4d
* C) 1c, 2d, 3a, 4b
* D) 1b, 2c, 3d, 4a
* E) 1d, 2a, 3b, 4c

**Solución Paso a Paso:**
1. **Puna:** Se caracteriza por los pajonales de ichu y la titanca o **Puya de Raimondi** (1 \to b).
2. **Suni:** Alberga a la flor nacional del Perú, la **Cantuta** (2 \to a).
3. **Rupa Rupa:** Selva alta donde habita el ave nacional, el **Gallito de las Rocas** (3 \to d).
4. **Yunga:** Quebradas cálidas y pedregosas donde abunda el árbol de **Molle** (4 \to c).
* Secuencia correcta: **1b, 2a, 3d, 4c**.
* **Respuesta Correcta:** **A**

---



### Ejercicio 3 (Nivel 3 - Avanzado UNMSM DECO: Clima y Extremos Meteorológicos)
**Enunciado:**
Un equipo de agrónomos evalúa las pérdidas económicas en cultivos de tubérculos causadas por el congelamiento súbito nocturno durante los meses de junio y julio en localidades situadas a 3\,700\text{ m s.n.m.}, mientras que en un valle a 800\text{ m s.n.m.} del flanco oriental se reportan lluvias torrenciales continuas que superan los 5\,000\text{ mm} anuales. Según la tesis de las 8 regiones naturales, ¿en qué regiones se ubican respectivamente ambos escenarios?
* A) Quechua y Omagua
* B) Suni y Rupa Rupa
* C) Puna y Yunga Fluvial
* D) Janca y Chala
* E) Suni y Selva Baja

**Solución Paso a Paso:**
1. Primer escenario: Altitud de 3\,700\text{ m s.n.m.} con severas heladas meteorológicas invernales. Esta cota se encuentra dentro del rango de 3\,500 a 4\,000\text{ m s.n.m.}, correspondiente a la región **Suni o Jalca** ("tierra de heladas").
2. Segundo escenario: Altitud de 800\text{ m s.n.m.} en el flanco oriental amazónico con precipitaciones torrenciales extremas. Corresponde al rango de 400 a 1\,000\text{ m s.n.m.}, que define a la región **Rupa Rupa o Selva Alta** (la región más lluviosa del Perú).
* **Respuesta Correcta:** **B**

---



### Ejercicio 4 (Nivel 4 - Crítico / Interdisciplinario UNI: Criterio Toponímico Nativo)
**Enunciado:**
El Dr. Javier Pulgar Vidal fundamentó su tesis rescatando los saberes tradicionales mediante el análisis toponímico de las lenguas aborígenes. Al respecto, señale qué alternativa asocia de manera errónea la región natural con el significado etimológico originario de su nombre:
* A) Chala: En quechua "maizal" o "amontonamiento de nubes secas".
* B) Yunga: En aymara "mujer estéril" y en quechua "valle cálido".
* C) Puna: En quechua "soroche" o "mal de montaña".
* D) Janca: En aymara "tierra de hombres sabios y fértiles".
* E) Omagua: En lenguas nativas amazónicas "peces de agua dulce".

**Solución Paso a Paso:**
1. Analizamos cada correspondencia etimológica:
   * A es correcta: Chala alude a hojas secas de maíz o nubes bajas estratos.
   * B es correcta: Yunga significa valle cálido o mujer estéril por la aridez de sus laderas.
   * C es correcta: Puna alude a la baja presión que genera el mal de montaña (soroche).
   * D es **incorrecta (falsa)**: **Janca** significa en aymara y quechua **"blanco"** o **"maíz reventado/tostado"** por la blancura de sus nieves eternas; la expresión *"tierra de hombres sabios"* corresponde a una interpretación tradicional de la Omagua.
   * E es correcta: Omagua proviene de las etnias ribereñas y alude a los peces fluviales.
* **Respuesta Correcta:** **D**

---



### Ejercicio 5 (Nivel 5 - Boss Challenge: Integración Ecosistémica y DECO)
**Enunciado:**
Lea con rigurosidad el siguiente fragmento sobre la zonificación ecológica peruana:
*"En una expedición que parte desde el puerto de Mollendo hacia el interior del continente, los investigadores cruzan sucesivamente una faja de lomas con flor de amancaes, quebradas hiperáridas donde abundan cactáceas columnares y huaycos estivales, un valle templado interandino dominado por campos de maíz y alisos, un corredor escarpado con bosques de queñuales y cultivos de cantuta, y una colosal altiplanicie fría cubierta de ichu donde pastan hatos de alpacas al pie de glaciares escarpados".*

A partir de la descripción geográfica del trayecto y considerando las 8 regiones naturales, determine la secuencia altitudinal ordenada de las regiones recorridas por la expedición:
* A) Yunga \to Chala \to Quechua \to Puna \to Suni \to Janca
* B) Chala \to Yunga \to Quechua \to Suni \to Puna \to Janca
* C) Chala \to Quechua \to Yunga \to Suni \to Janca \to Puna
* D) Omagua \to Rupa Rupa \to Quechua \to Puna \to Suni
* E) Chala \to Yunga \to Suni \to Quechua \to Puna \to Janca

**Solución Paso a Paso:**
1. **Lomas y puerto de Mollendo (0 - 500\text{ m}):** Región **Chala o Costa**.
2. **Quebradas de cactáceas y huaycos (500 - 2\,300\text{ m}):** Región **Yunga Marítima**.
3. **Valle templado con maíz y alisos (2\,300 - 3\,500\text{ m}):** Región **Quechua**.
4. **Corredor escarpado con queñuales y cantuta (3\,500 - 4\,000\text{ m}):** Región **Suni o Jalca**.
5. **Altiplanicie con ichu y alpacas (4\,000 - 4\,800\text{ m}):** Región **Puna**.
6. **Glaciares escarpados (> 4\,800\text{ m}):** Región **Janca o Cordillera**.
* Secuencia exacta: **Chala \to Yunga \to Quechua \to Suni \to Puna \to Janca**.
* **Respuesta Correcta:** **B**

---



## 11. BANCO DE FLASHCARDS (Q/A)

* **PREGUNTA:** ¿Quién formuló la tesis de las Ocho Regiones Naturales del Perú y en qué año la presentó?
  * **RESPUESTA:** El Dr. Javier Pulgar Vidal, presentada en 1940 en Lima.
* **PREGUNTA:** ¿Cuál es el factor geográfico determinante y estructurante de las 8 regiones naturales?
  * **RESPUESTA:** El factor altitudinal (impuesto por la Cordillera de los Andes).
* **PREGUNTA:** ¿Qué significa etimológicamente la palabra "Yunga" en aymara y quechua?
  * **RESPUESTA:** "Mujer estéril" en aymara (por la aridez rocosa) y "Valle cálido" en quechua.
* **PREGUNTA:** ¿Cuál es la región natural con el clima más benigno y saludable del Perú y qué cultivo la simboliza?
  * **RESPUESTA:** La región Quechua (2\,300 - 3\,500\text{ m}), simbolizada por el cultivo del maíz.
* **PREGUNTA:** ¿Cuál es la flor nacional del Perú y a qué región natural pertenece como especie nativa?
  * **RESPUESTA:** La Cantuta (*Cantua buxifolia*), perteneciente a la región Suni o Jalca.
* **PREGUNTA:** ¿Qué región natural es denominada "tierra del soroche" y qué planta cubre predominantemente sus mesetas?
  * **RESPUESTA:** La región Puna (4\,000 - 4\,800\text{ m}), cubierta por el ichu o paja brava.
* **PREGUNTA:** ¿Qué significa la toponimia "Janca" y qué tipo de clima presenta?
  * **RESPUESTA:** Significa "blanco" o "maíz tostado"; presenta clima glaciar o muy frígido con temperaturas bajo cero.
* **PREGUNTA:** ¿Cuál es la región natural más lluviosa y nubosa del Perú?
  * **RESPUESTA:** La región Rupa Rupa o Selva Alta (400 - 1\,000\text{ m s.n.m.}).
* **PREGUNTA:** ¿Cuál es el ave nacional del Perú y en qué región natural habita?
  * **RESPUESTA:** El Gallito de las Rocas (*Rupicola peruvianus*), en la región Rupa Rupa.
* **PREGUNTA:** ¿Qué significa toponímicamente "Omagua" y cuál es el pez gigante que habita sus ríos?
  * **RESPUESTA:** Significa "peces de agua dulce" o "tierra de hombres sabios"; su pez emblemático es el Paiche (*Arapaima gigas*).

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Piso Ecológico:** Faja altitudinal del relieve andino delimitada por condiciones térmicas, pluviales y geomorfológicas particulares que sustentan comunidades biológicas adaptadas.
2. **Toponimia:** Estudio del origen, significado y etimología de los nombres de lugares geográficos en las lenguas autóctonas.
3. **Soroche:** Conjunto de síntomas fisiológicos (cefalea, náuseas, disnea) causados por la hipoxia o baja presión parcial de oxígeno en altitudes superiores a los 3\,000\text{ m s.n.m.}
4. **Lloclla (Huayco):** Aluvión violento de lodo, agua y rocas sueltas que desciende por quebradas estrechas en la región Yunga tras lluvias torrenciales estivales.
5. **Cantuta:** Flor sagrada del Tawantinsuyu y flor nacional del Perú (*Cantua buxifolia*), arbusto típico de la región Suni.
6. **Titanca (Puya de Raimondi):** Especie botánica gigante de la región Puna que alcanza hasta 12\text{ metros} de altura y florece una sola vez en su vida centenaria.
7. **Queñual:** Árbol nativo retorcido de corteza laminar rojiza (*Polylepis*) que forma bosques de altura en las regiones Suni y Puna.
8. **Gallito de las Rocas (Tunqui):** Ave nacional del Perú (*Rupicola peruvianus*), de llamativo plumaje rojo anaranjado que anida en cañones rocosos de la Selva Alta.
9. **Lupuna:** Árbol gigante emergente de la llanura amazónica (Omagua) que supera los 60\text{ metros} de altura, dotado de grandes aletas de soporte basal.
10. **Pongo:** Cañón fluvial estrecho labrado por ríos amazónicos al quebrar la Cordillera Oriental en la región Rupa Rupa.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geo_t08_s01_c01",
                    question = "En 1940, el Dr. Javier Pulgar Vidal presentó su tesis doctoral sobre las Ocho Regiones Naturales del Perú ante:",
                    options = listOf(
                        "La Sociedad Geográfica de Londres en sesión plenaria.",
                        "La III Asamblea General del Instituto Panamericano de Geografía e Historia.",
                        "El Congreso Constituyente Democrático reunido en Lima.",
                        "La Conferencia Interamericana de Cancilleres de Bogotá."
                    ),
                    correctIndex = 1,
                    explanation = "Pulgar Vidal expuso formalmente su división biogeográfica en la III Asamblea General del Instituto Panamericano de Geografía e Historia (IPGH) celebrada en Lima en 1940."
                ),
                Challenge(
                    id = "geo_t08_s01_c02",
                    question = "Dentro de los seis criterios científicos adoptados por Javier Pulgar Vidal, ¿cuál constituye el factor director y estructurante primordial?",
                    options = listOf(
                        "El mapa hidrográfico de cuencas exorreicas del Pacífico.",
                        "La demarcación administrativa departamental republicana.",
                        "El volumen de exportaciones mineras y agropecuarias.",
                        "El criterio altitudinal determinado por la Cordillera de los Andes."
                    ),
                    correctIndex = 3,
                    explanation = "El factor altitudinal impuesto por el relieve andino determina variaciones drásticas en temperatura, presión, humedad y radiación solar, rigiendo la zonificación de pisos ecológicos."
                ),
                Challenge(
                    id = "geo_t08_s01_c03",
                    question = "¿Qué significado toponímico tiene el vocablo quechua 'Chala' según la tesis de Pulgar Vidal?",
                    options = listOf(
                        "Maizal o amontonamiento de nubes secas y estratos.",
                        "Tierra alta batida continuamente por vientos gélidos.",
                        "Valle estrecho y profundo con clima templado seco.",
                        "Llanura cenagosa habitada por peces de agua dulce."
                    ),
                    correctIndex = 0,
                    explanation = "En lengua quechua, 'Chala' remite al 'maizal' o al 'amontonamiento de nubes' (nieblas estratos), mientras en aymara significa tierra arenosa y amontonamiento."
                ),
                Challenge(
                    id = "geo_t08_s01_c04",
                    question = "La región Yunga Marítima (500 a 2 300 m s.n.m.) se caracteriza climática y geomorfológicamente por:",
                    options = listOf(
                        "Llanuras aluviales inundables y clima tropical hiperhúmedo.",
                        "Mesetas frígidas con oscilación térmica extrema y pajonales de gramíneas.",
                        "Picos nevados inaccesibles con temperaturas permanentemente subcero.",
                        "Laderas abruptas, intensa radiación solar todo el año y ser zona endémica de huaycos en verano."
                    ),
                    correctIndex = 3,
                    explanation = "La Yunga Marítima en la vertiente occidental destaca por su atmósfera seca, sol permanente y quebradas pedregosas donde se desatan huaycos o llocllas en meses estivales."
                ),
                Challenge(
                    id = "geo_t08_s01_c05",
                    question = "El árbol emblemático y representativo de la región Yunga es:",
                    options = listOf(
                        "La caoba o aguano (*Swietenia macrophylla*).",
                        "El queñual (*Polylepis*).",
                        "El aliso andino (*Alnus acuminata*).",
                        "El molle (*Schinus molle*)."
                    ),
                    correctIndex = 3,
                    explanation = "El molle (*Schinus molle*) es la especie arbórea representativa de las quebradas de la región Yunga, adaptada a laderas áridas y valles cálidos."
                ),
                Challenge(
                    id = "geo_t08_s01_c06",
                    question = "La región Quechua (2 300 a 3 500 m s.n.m.) es reconocida en la geografía peruana por poseer:",
                    options = listOf(
                        "Pantanos perennes o tahuampas que impiden todo tipo de asentamiento urbano e industrial.",
                        "Glaciares colgantes y una cubierta permanente de nieves perpetuas sobre crestas piramidales.",
                        "El clima más benigno, templado y saludable del mundo, siendo la despensa agrícola tradicional del país.",
                        "La atmósfera más calurosa del territorio nacional con medias superiores a 35 grados Celsius."
                    ),
                    correctIndex = 2,
                    explanation = "La región Quechua ostenta clima templado seco con noches frescas, convirtiéndose en el piso de mayor densidad demográfica andina y centro de cultivo del maíz."
                ),
                Challenge(
                    id = "geo_t08_s01_c07",
                    question = "¿Cuál de las siguientes ciudades peruanas se ubica en el piso ecológico de la región Quechua?",
                    options = listOf(
                        "Chosica (850 m s.n.m.).",
                        "Arequipa (2 325 m s.n.m.).",
                        "Cerro de Pasco (4 380 m s.n.m.).",
                        "Tingo María (660 m s.n.m.)."
                    ),
                    correctIndex = 1,
                    explanation = "Arequipa se asienta en la base altitudinal de la región Quechua (2 325 m s.n.m.), al igual que urbes como Cusco, Huancayo y Cajamarca."
                ),
                Challenge(
                    id = "geo_t08_s01_c08",
                    question = "La región Suni o Jalca (3 500 a 4 000 m s.n.m.) se define agronómica y meteorológicamente como:",
                    options = listOf(
                        "El límite superior de la agricultura tradicional y la zona donde inician las heladas invernales.",
                        "El bosque nuboso continuo con mayor precipitación anual del territorio peruano.",
                        "La zona de mayor producción de cítricos y frutas de clima cálido del país.",
                        "La faja desértica de llanuras marinas sujetas a levantamiento epirogénico sostenido."
                    ),
                    correctIndex = 0,
                    explanation = "Suni marca el límite superior para la agricultura de tubérculos resistentes al frío (mashua, oca, quinua) y sufre el impacto directo de las heladas invernales."
                ),
                Challenge(
                    id = "geo_t08_s01_c09",
                    question = "¿Cuál es la flor emblemática sagrada de los incas que crece típicamente en la región Suni?",
                    options = listOf(
                        "La orquídea zapatito (*Phragmipedium*).",
                        "La flor de la yaretilla (*Azorella*).",
                        "La flor de Amancaes (*Ismene amancaes*).",
                        "La Cantuta (*Cantua buxifolia*)."
                    ),
                    correctIndex = 3,
                    explanation = "La Cantuta (*Cantua buxifolia*) es la flor nacional del Perú y especie bioindicadora vegetal de la región Suni o Jalca."
                ),
                Challenge(
                    id = "geo_t08_s01_c10",
                    question = "En el departamento de Cajamarca y el norte andino, la región Suni es comúnmente denominada por los pobladores como:",
                    options = listOf(
                        "Omagua.",
                        "Jalca.",
                        "Puna.",
                        "Yunga."
                    ),
                    correctIndex = 1,
                    explanation = "En el norte del Perú, particularmente en Cajamarca, el piso ecológico de Suni recibe el apelativo vernáculo tradicional de 'Jalca'."
                )
            )
        ),
        LessonNode(
            id = "geo_t08_s02",
            title = "3.2. Pisos de Alta Montaña y Vertiente Amazónica (Puna, Janca, Rupa Rupa y Omagua)",
            theory = LessonTheory(
                title = "Pisos de Alta Montaña y Vertiente Amazónica (Puna, Janca, Rupa Rupa y Omagua)",
                content = """## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    OCHO_REG["Las 8 Regiones Naturales del Perú (Javier Pulgar Vidal, 1940)"] --> CRIT["Criterios de Clasificación"]
    OCHO_REG --> VER_OCC["Vertiente Occidental y Cumbres"]
    OCHO_REG --> VER_ORI["Vertiente Oriental y Llanura Amazónica"]

    CRIT --> ALT["Altitudinal (Factor Principal)"]
    CRIT --> TOP["Toponímico (Etimología Nativa)"]
    CRIT --> CLI["Climático (Temperatura y Lluvias)"]
    CRIT --> BIO["Ecológico (Flora y Fauna)"]
    CRIT --> MORF["Geomorfológico (Relieve)"]
    CRIT --> ACT["Actividad Humana y Productos"]

    VER_OCC --> CHALA["1. Chala o Costa (0 a 500 m)<br/>'Maizal / Amontonamiento'"]
    VER_OCC --> YUNGA["2. Yunga (500 a 2 300 m)<br/>'Valle cálido' (Marítima y Fluvial)"]
    VER_OCC --> QUECHUA["3. Quechua (2 300 a 3 500 m)<br/>'Tierra de clima templado'"]
    VER_OCC --> SUNI["4. Suni o Jalca (3 500 a 4 000 m)<br/>'Tierras altas / Heladas'"]
    VER_OCC --> PUNA["5. Puna (4 000 a 4 800 m)<br/>'Soroche / Altiplano'"]
    VER_OCC --> JANCA["6. Janca o Cordillera (4 800 a 6 768 m)<br/>'Blanco / Nieve'"]

    VER_ORI --> RUPA["7. Rupa Rupa o Selva Alta (400 a 1 000 m)<br/>'Ardiente / Muy lluvioso'"]
    VER_ORI --> OMAGUA["8. Omagua o Selva Baja (80 a 400 m)<br/>'Peces de agua dulce / Muy cálido'"]
```

---



### 3.2. Estudio Exhaustivo de las 8 Regiones Naturales

```
Altitud (m)
6 768 |                                  [JANCA O CORDILLERA] (Nieve permanente, cóndor)
      |                                        /\
4 800 |---------------------------------------/  \---------------------------------------
      |                         [PUNA]       /    \
      |                    (Ichu, camélidos) /      \
4 000 |-------------------------------------/        \-----------------------------------
      |                   [SUNI]           /          \
      |              (Cantuta, heladas)   /            \
3 500 |----------------------------------/              \---------------------------------
      |               [QUECHUA]         /                \
      |          (Maíz, clima benigno) /                  \
2 300 |-------------------------------/                    \-----------------------------
      |          [YUNGA]             /                      \        [RUPA RUPA]
      |     (Frutales, huaycos)     /                        \     (Selva Alta, pongos)
  500 |----------------------------/                          \-------------------------- (1 000 m)
      |       [CHALA O COSTA]     /                            \     [OMAGUA]
    0 +==========================/                              \====(Selva Baja, tahuampas) (80 m)
         Océano Pacífico (Oeste)                                     Llanura Amazónica (Este)
```

---

#### 1. Región Chala o Costa (0\text{ a }500\text{ m s.n.m.})
* **Toponimia:**
  * En quechua: *"Maizal"* o *"amontonamiento de nubes secas"*.
  * En aymara: *"Amontonamiento"* o *"tierra arenosa y yerma"*.
  * En cauqui: *"Tierra seca y arcillosa"*.
* **Relieve:** Llanuras aluviales (valles transversales), pampas desérticas, tablazos sobreelevados, dunas, depresiones salinas y lomas costeras.
* **Clima:**
  * *Centro-Sur (desde Piura hasta Tacna):* **Subtropical árido**, templado cálido, húmedo en invierno por nieblas estratos y garúas traídas por la Corriente de Humboldt; casi ausencia total de lluvias torrenciales.
  * *Norte (Tumbes y norte de Piura):* **Semiaridocaluroso a tropical seco**, caluroso con lluvias en verano por influjo de la Corriente de El Niño.
* **Flora:** Algarrobo, zapote, caña brava, totora, carrizos, flor de Amancaes y lito en lomas, mangle rojo (en esteros de Tumbes).
* **Fauna:** Anchoveta, sardina, lobos marinos, aves guaneras (guanay, piquero, pelícano), zarcillo, pingüino de Humboldt, conchas negras.
* **Productos y Agricultura:** Caña de azúcar, algodón, espárragos, páprika, uvas de mesa, cítricos, arroz.

---

#### 2. Región Yunga (500\text{ a }2\,300\text{ m s.n.m.})
* **Toponimia:** En quechua significa *"Valle cálido"*; en aymara: *"Mujer estéril"* (por la escasez de vegetación natural arbórea en sus quebradas pedregosas).
* **Subregiones Geográficas:**
  1. **Yunga Marítima (500\text{ a }2\,300\text{ m}):** Flanco occidental andino que mira al Pacífico. Clima desértico cálido, extremadamente soleado casi todo el año, aire seco. Es la **zona endémica de huaycos o llocllas** en verano. Ciudades: Chosica, Moquegua, Tacna, Nazca.
  2. **Yunga Fluvial (1\,000\text{ a }2\,300\text{ m}):** Valles interandinos y flanco oriental andino. Clima templado cálido y húmedo con lluvias estivales copiosas. Menos insolación directa. Ciudades: Huánuco, Chachapoyas, Abancay.
* **Relieve:** Quebradas estrechas y profundas, valles intermontanos encajonados, laderas empinadas y pedregosas.
* **Flora:** Molle (*Schinus molle*, el árbol emblemático), cactáceas columnares (pitajaya, gigantón), cabuya o maguey, tara, carrizo.
* **Fauna:** Chaucato, taurigaray, alacranes, ciempiés, culebras, picaflores.
* **Actividad:** Es la **región frutal por excelencia del Perú** (palta, lúcuma, chirimoya, naranja, pacae, guayaba, manzana).

---

#### 3. Región Quechua (2\,300\text{ a }3\,500\text{ m s.n.m.})
* **Toponimia:** En quechua alude a *"Tierras de clima templado"* o *"tierras de valles y quebradas fértiles"*.
* **Relieve:** Valles interandinos amplios y laderas de pendiente moderada modeladas por erosión fluvial.
* **Clima:** Considerado unánimemente como **el clima más benigno, saludable y templado del mundo**: templado regular, aire seco y puro, días soleados y noches frescas. Lluvias periódicas en verano (enero a marzo).
* **Flora:** Aliso (*Alnus acuminata*, árbol típico), arrayán, calabaza, caigua, maíz (centro de origen y máxima diversificación genética), cantuta blanca, eucalipto (árbol exótico aclimatado).
* **Fauna:** Zorzal gris, zorro andino (*añás*), puma, venado gris, oso de anteojos, taruca.
* **Actividad:** Constituye la **zona de mayor concentración demográfica tradicional de la sierra y la despensa agrícola del Perú** (maíz, trigo, cebada, habas, hortalizas, tubérculos menores). Ciudades: **Arequipa (2\,325\text{ m})**, Cusco, Huancayo, Huaraz, Cajamarca, Ayacucho.

---

#### 4. Región Suni o Jalca (3\,500\text{ a }4\,000\text{ m s.n.m.})
* **Toponimia:** En quechua significa *"Tierras altas"*, *"ancho"*, *"largo"* o *"altas cumbres desoladas"*. En el norte peruano (Cajamarca) se le conoce como **Jalca**.
* **Relieve:** Muy quebrado, escarpado, con desfiladeros, paredes rocosas abruptas y cañones estrechos.
* **Clima:** Frío y seco. Es la **región límite de la agricultura tradicional y zona de inicio de las heladas meteorológicas invernales** que congelan las cosechas.
* **Flora:** **La Cantuta** (*Cantua buxifolia*, la flor sagrada de los incas y flor nacional del Perú), árbol de queñual, quishuar, saúco, taya. Cultivos de tubérculos resistentes al frío: **mashua, olluco, oca, quinua y papa amarga**.
* **Fauna:** Zorzal negro, cernícalo andino, allqamari (caracara andino), vizcacha, cuy silvestre.
* **Ciudades:** Puno (3\,827\text{ m}), Huancavelica, La Oroya, Juliaca.

---

#### 5. Región Puna (4\,000\text{ a }4\,800\text{ m s.n.m.})
* **Toponimia:** En quechua y aymara significa *"Soroche"*, *"mal de montaña"* o *"tierra alta y fría azotada por el viento"*.
* **Relieve:** Extensas mesetas altiplánicas onduladas (planicies altoandinas), colinas suaves y numerosas lagunas glaciares.
* **Clima:** **Frígido**. Atmósfera extremadamente diáfana y seca, con una oscilación térmica diaria descomunal (fuerte calor a pleno sol durante el día y temperaturas bajo cero en la noche: hasta -20^\circ\text{C}). Frecuentes tempestades de nieve, aguanieve y granizo.
* **Flora:** **Ichu** (paja brava, gramínea base de la dieta ganadera), **Puya de Raimondi** (*Puya raimondii*, titanca: florece cada 100 años con más de 8\,000 flores), yareta (planta compacta resinosa), pajonales y el cultivo nativo de la **maca** (hasta los 4\,400\text{ m}).
* **Fauna:** Hábitat de los cuatro **camélidos sudamericanos** (vicuña y guanaco silvestres; alpaca y llama domesticadas), parihuana o flamenco andino, cóndor, chinchilla, trucha arcoíris (en lagunas).
* **Ciudades y Asentamientos:** Cerro de Pasco (4\,380\text{ m}, la ciudad con más de 50\,000 hab. más alta del mundo), Junín.

---

#### 6. Región Janca o Cordillera (4\,800\text{ a }6\,768\text{ m s.n.m.})
* **Toponimia:** En aymara y quechua significa *"Blanco"* o *"maíz tostado y reventado"* (haciendo alusión a la nieve perpetua que cubre las cumbres).
* **Relieve:** Abrupto, escarpado, dominado por picos piramidales, crestas afiladas, morrenas, circos glaciares y abismos infranqueables.
* **Clima:** **Glaciar o muy frígido**. Temperaturas permanentemente por debajo de los 0^\circ\text{C} durante casi todo el año. Aire enrarecido con muy baja presión parcial de oxígeno.
* **Flora:** Muy escasa y especializada; líquenes, musgos y la diminuta flor de la yaretilla pegada a las rocas.
* **Fauna:** El **Cóndor andino** (*Vultur gryphus*), la vizcacha y el zorrino andino.
* **Actividad:** Explotación minera de socavón a gran altura (e.g., La Rinconada en Puno a más de 5\,100\text{ m s.n.m.}, el campamento minero permanente más alto del planeta) y andinismo/turismo de alta montaña.

---

#### 7. Región Rupa Rupa o Selva Alta (400\text{ a }1\,000\text{ m s.n.m.})
* **Toponimia:** En quechua significa *"Ardiente"* o *"lo que está caliente y quema"*.
* **Relieve:** Muy complejo y accidentado; cadenas montañosas cubiertas de selva, profundos cañones fluviales (**pongos**), valles longitudinales fértiles, terrazas y cavernas kársticas.
* **Clima:** Tropical cálido y húmedo. Es **la región más nubosa y lluviosa de todo el Perú** (registrándose en Quincemil, Cusco, más de 7\,000\text{ mm} de precipitación anual).
* **Flora:** **El Árbol de la Quina** (*Cinchona officinalis*, árbol nacional del escudo peruano), yarina, cedro, orquídeas, bromelias, tornillo.
* **Fauna:** **El Gallito de las Rocas** (*Rupicola peruvianus*, tunqui, ave nacional del Perú), otorongo (jaguar), tapir americano o sachavaca, mono choro de cola amarilla, serpiente shushupe, sajino.
* **Actividad y Ciudades:** Agricultura agroexportadora de **café, cacao, té, frutas tropicales y coca**. Ciudades: Tingo María, Bagua, Jaén, Moyobamba, Chanchamayo, Quillabamba.

---

#### 8. Región Omagua o Selva Baja (80\text{ a }400\text{ m s.n.m.})
* **Toponimia:** En lenguas originarias amazónicas significa *"Peces de agua dulce"* o *"tierra de hombres sabios"*.
* **Relieve:** Inmensa llanura aluvial horizontal de suave pendiente atravesada por ríos gigantescos de curso meándrico. Estructurada en cuatro niveles: **tahuampas** (pantanos permanentes), **restingas** (terrazas inundables temporales), **altos** (terrazas no inundables donde se fundan las urbes) y **filos** (colinas divisorias de aguas).
* **Clima:** **Tropical muy caluroso, húmedo y lluvioso**. Es **la región más calurosa del territorio nacional** (registrándose temperaturas máximas históricas superiores a 41^\circ\text{C} en Neshuya, Ucayali).
* **Flora:** Árboles madereros gigantescos como la **caoba o aguano**, el **cedro**, la **lupuna** (el árbol más alto de la selva peruana, con más de 60\text{ m} de altura), la palmera de aguaje, la castaña y la flor acuática gigante *Victoria regia*.
* **Fauna:** **El Paiche** (*Arapaima gigas*, pez gigante de agua dulce), anaconda, manatí amazónico, delfín rosado, caimán negro, charapa, ronsoco (capibara).
* **Ciudades:** Iquitos, Pucallpa, Tarapoto, Puerto Maldonado, Yurimaguas.

---



## 4. FORMULARIO MAESTRO / CUADRO SINÓPTICO



### Matriz Maestra de las 8 Regiones Naturales del Perú

| Región | Altitud (\text{m s.n.m.}) | Significado Toponímico | Clima Predominante | Especie de Flora Típica | Especie de Fauna Típica | Ciudad Emblemática |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Chala** | 0 - 500 | *"Maizal / Nubes amontonadas"* | Subtropical árido / Tropical seco | Algarrobo, Amancaes, Mangle | Anchoveta, Aves guaneras | Lima, Trujillo, Chiclayo |
| **Yunga** | 500 - 2\,300 | *"Valle cálido / Mujer estéril"* | Desértico cálido (sol permanente) | Molle, Pitajaya, Lúcumo | Chaucato, Taurigaray | Chosica, Moquegua, Tacna |
| **Quechua** | 2\,300 - 3\,500 | *"Tierra de clima templado"* | **Templado seco (el más benigno)**| Aliso, Maíz, Arrayán | Zorzal gris, Oso de anteojos | **Arequipa**, Cusco, Huancayo |
| **Suni** | 3\,500 - 4\,000 | *"Tierras altas / Heladas"* | Frío y seco (heladas frecuentes) | **Flor de la Cantuta**, Queñual | Allqamari, Zorzal negro | Puno, Huancavelica, Juliaca |
| **Puna** | 4\,000 - 4\,800 | *"Soroche / Mal de altura"* | Frígido (oscilación extrema) | **Ichu**, **Puya de Raimondi**, Maca | Vicuña, Alpaca, Parihuana | Cerro de Pasco, Junín |
| **Janca** | 4\,800 - 6\,768 | *"Blanco / Maíz tostado"* | Glaciar (bajo 0^\circ\text{C} siempre) | Líquenes, Yaretilla | **Cóndor andino**, Vizcacha | La Rinconada (campamento) |
| **Rupa Rupa**| 400 - 1\,000 | *"Ardiente / Caliente"* | Cálido húmedo (**la más lluviosa**) | **Árbol de la Quina**, Cedro | **Gallito de las Rocas**, Otorongo | Tingo María, Bagua, Jaén |
| **Omagua** | 80 - 400 | *"Peces de agua dulce"* | Tropical cálido (**la más calurosa**)| Caoba, **Lupuna**, Aguaje | **Paiche**, Anaconda, Charapa | Iquitos, Pucallpa, Tarapoto |

---



### Mnemotecnia 1: Las 8 Regiones en Orden de Ascenso y Descenso
**"CHA-YU-QUE-SU-PU-JAN / RU-O"**
* **CHA** \rightarrow **CHA**la (0 - 500)
* **YU** \rightarrow **YU**nga (500 - 2\,300)
* **QUE** \rightarrow **QUE**chua (2\,300 - 3\,500)
* **SU** \rightarrow **SU**ni (3\,500 - 4\,000)
* **PU** \rightarrow **PU**na (4\,000 - 4\,800)
* **JAN** \rightarrow **JAN**ca (4\,800 - 6\,768)
* *(Bajando por el flanco oriental hacia la Amazonía:)*
* **RU** \rightarrow **RU**pa Rupa (400 - 1\,000)
* **O** \rightarrow **O**magua (80 - 400)

*Frase de combate:* **"CHArly Y Un QUErido SUjeto PUdieron JANkear RUpitas de OMAha"**.



### Mnemotecnia 2: Récords de Extremos Climáticos
* **La más BENIGNA** \rightarrow **QUECHUA** (templado ideal).
* **La más LLUVIOSA** \rightarrow **RUPA RUPA** (Selva Alta, Quincemil).
* **La más CALUROSA** \rightarrow **OMAGUA** (Selva Baja, Neshuya).
* **La más FRÍA** \rightarrow **JANCA** (glaciares perpetuos).

---



## 6. TÉCNICAS Y ARTIFICIOS DE RESOLUCIÓN (HACKING PREUNIVERSITARIO)

1. **La Ubicación de Arequipa en las 8 Regiones:**
   * La Plaza de Armas de Arequipa está a **2\,325\text{ m s.n.m.}**
   * Por tanto, Arequipa pertenece formalmente a la **Región Quechua** (que empieza a los 2\,300\text{ m}), aunque sus distritos bajos hacia la costa limítrofe pertenezcan a la Yunga Marítima.
2. **Flora y Fauna Símbolos Patrios:**
   * **Flor Nacional (Cantuta):** Pertenece a la región **SUNI**.
   * **Árbol de la Quina (Árbol Nacional):** Pertenece a la región **RUPA RUPA** (Selva Alta).
   * **Gallito de las Rocas (Ave Nacional):** Pertenece a la región **RUPA RUPA**.
   * **Vicuña (Fauna del Escudo):** Pertenece a la región **PUNA**.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

* ⚠️ **Trampa 1: Confundir Yunga Marítima con Yunga Fluvial:**
  * Yunga Marítima: 500 - 2\,300\text{ m} en el flanco occidental desértico soleado (zona de huaycos).
  * Yunga Fluvial: 1\,000 - 2\,300\text{ m} en los valles interandinos orientales, más húmeda y con menor insolación.
* ⚠️ **Trampa 2: La Puya de Raimondi no crece en Janca:**
  * La Puya de Raimondi (*titanca*) es de la región **Puna** (4\,000 - 4\,800\text{ m}), no de la Janca. En la Janca solo viven líquenes y musgos.
* ⚠️ **Trampa 3: ¿Cuál es la región de mayor producción de maíz?**
  * La región **Quechua** es el centro de origen, domesticación y cultivo del maíz andino.

---



### Caso de Estudio DECO: El Control Vertical de Pisos Ecológicos de John Murra
El antropólogo John Murra formuló el modelo del **"Control vertical de un máximo de pisos ecológicos"** en las sociedades andinas prehispánicas:
1. **Fundamento Ecológico:** Las comunidades andinas (como los Lupacas en el Altiplano) no se limitaban a cultivar en su región de origen (Puna). Establecían colonias o "archipiélagos humanos" en la costa (Chala: sal, guano, ají, algodón), en los valles templados (Quechua: maíz), en las quebradas cálidas (Yunga: frutas, coca) y en la ceja de selva (Rupa Rupa: madera, plumas, miel).
2. **Autosuficiencia y Resiliencia:** Este manejo sincrónico de las 8 regiones naturales garantizaba la seguridad alimentaria frente a heladas o sequías locales, demostrando que la topografía andina no fue una barrera, sino una despensa complementaria escalonada.

---



### Ejercicio 2 (Nivel 2 - Intermedio UNSA Ordinario: Especies Emblemáticas y Pisos)
**Enunciado:**
Relacione adecuadamente la región natural formulada por Javier Pulgar Vidal con la especie vegetal o animal que actúa como bioindicador característico de dicho piso ecológico:
1. Puna  
2. Suni  
3. Rupa Rupa  
4. Yunga  

a. Flor de la Cantuta (*Cantua buxifolia*)  
b. Puya de Raimondi (*Puya raimondii*)  
c. Molle (*Schinus molle*)  
d. Gallito de las Rocas (*Rupicola peruvianus*)  

* A) 1b, 2a, 3d, 4c
* B) 1a, 2b, 3c, 4d
* C) 1c, 2d, 3a, 4b
* D) 1b, 2c, 3d, 4a
* E) 1d, 2a, 3b, 4c

**Solución Paso a Paso:**
1. **Puna:** Se caracteriza por los pajonales de ichu y la titanca o **Puya de Raimondi** (1 \to b).
2. **Suni:** Alberga a la flor nacional del Perú, la **Cantuta** (2 \to a).
3. **Rupa Rupa:** Selva alta donde habita el ave nacional, el **Gallito de las Rocas** (3 \to d).
4. **Yunga:** Quebradas cálidas y pedregosas donde abunda el árbol de **Molle** (4 \to c).
* Secuencia correcta: **1b, 2a, 3d, 4c**.
* **Respuesta Correcta:** **A**

---



### Ejercicio 3 (Nivel 3 - Avanzado UNMSM DECO: Clima y Extremos Meteorológicos)
**Enunciado:**
Un equipo de agrónomos evalúa las pérdidas económicas en cultivos de tubérculos causadas por el congelamiento súbito nocturno durante los meses de junio y julio en localidades situadas a 3\,700\text{ m s.n.m.}, mientras que en un valle a 800\text{ m s.n.m.} del flanco oriental se reportan lluvias torrenciales continuas que superan los 5\,000\text{ mm} anuales. Según la tesis de las 8 regiones naturales, ¿en qué regiones se ubican respectivamente ambos escenarios?
* A) Quechua y Omagua
* B) Suni y Rupa Rupa
* C) Puna y Yunga Fluvial
* D) Janca y Chala
* E) Suni y Selva Baja

**Solución Paso a Paso:**
1. Primer escenario: Altitud de 3\,700\text{ m s.n.m.} con severas heladas meteorológicas invernales. Esta cota se encuentra dentro del rango de 3\,500 a 4\,000\text{ m s.n.m.}, correspondiente a la región **Suni o Jalca** ("tierra de heladas").
2. Segundo escenario: Altitud de 800\text{ m s.n.m.} en el flanco oriental amazónico con precipitaciones torrenciales extremas. Corresponde al rango de 400 a 1\,000\text{ m s.n.m.}, que define a la región **Rupa Rupa o Selva Alta** (la región más lluviosa del Perú).
* **Respuesta Correcta:** **B**

---



### Ejercicio 4 (Nivel 4 - Crítico / Interdisciplinario UNI: Criterio Toponímico Nativo)
**Enunciado:**
El Dr. Javier Pulgar Vidal fundamentó su tesis rescatando los saberes tradicionales mediante el análisis toponímico de las lenguas aborígenes. Al respecto, señale qué alternativa asocia de manera errónea la región natural con el significado etimológico originario de su nombre:
* A) Chala: En quechua "maizal" o "amontonamiento de nubes secas".
* B) Yunga: En aymara "mujer estéril" y en quechua "valle cálido".
* C) Puna: En quechua "soroche" o "mal de montaña".
* D) Janca: En aymara "tierra de hombres sabios y fértiles".
* E) Omagua: En lenguas nativas amazónicas "peces de agua dulce".

**Solución Paso a Paso:**
1. Analizamos cada correspondencia etimológica:
   * A es correcta: Chala alude a hojas secas de maíz o nubes bajas estratos.
   * B es correcta: Yunga significa valle cálido o mujer estéril por la aridez de sus laderas.
   * C es correcta: Puna alude a la baja presión que genera el mal de montaña (soroche).
   * D es **incorrecta (falsa)**: **Janca** significa en aymara y quechua **"blanco"** o **"maíz reventado/tostado"** por la blancura de sus nieves eternas; la expresión *"tierra de hombres sabios"* corresponde a una interpretación tradicional de la Omagua.
   * E es correcta: Omagua proviene de las etnias ribereñas y alude a los peces fluviales.
* **Respuesta Correcta:** **D**

---



### Ejercicio 5 (Nivel 5 - Boss Challenge: Integración Ecosistémica y DECO)
**Enunciado:**
Lea con rigurosidad el siguiente fragmento sobre la zonificación ecológica peruana:
*"En una expedición que parte desde el puerto de Mollendo hacia el interior del continente, los investigadores cruzan sucesivamente una faja de lomas con flor de amancaes, quebradas hiperáridas donde abundan cactáceas columnares y huaycos estivales, un valle templado interandino dominado por campos de maíz y alisos, un corredor escarpado con bosques de queñuales y cultivos de cantuta, y una colosal altiplanicie fría cubierta de ichu donde pastan hatos de alpacas al pie de glaciares escarpados".*

A partir de la descripción geográfica del trayecto y considerando las 8 regiones naturales, determine la secuencia altitudinal ordenada de las regiones recorridas por la expedición:
* A) Yunga \to Chala \to Quechua \to Puna \to Suni \to Janca
* B) Chala \to Yunga \to Quechua \to Suni \to Puna \to Janca
* C) Chala \to Quechua \to Yunga \to Suni \to Janca \to Puna
* D) Omagua \to Rupa Rupa \to Quechua \to Puna \to Suni
* E) Chala \to Yunga \to Suni \to Quechua \to Puna \to Janca

**Solución Paso a Paso:**
1. **Lomas y puerto de Mollendo (0 - 500\text{ m}):** Región **Chala o Costa**.
2. **Quebradas de cactáceas y huaycos (500 - 2\,300\text{ m}):** Región **Yunga Marítima**.
3. **Valle templado con maíz y alisos (2\,300 - 3\,500\text{ m}):** Región **Quechua**.
4. **Corredor escarpado con queñuales y cantuta (3\,500 - 4\,000\text{ m}):** Región **Suni o Jalca**.
5. **Altiplanicie con ichu y alpacas (4\,000 - 4\,800\text{ m}):** Región **Puna**.
6. **Glaciares escarpados (> 4\,800\text{ m}):** Región **Janca o Cordillera**.
* Secuencia exacta: **Chala \to Yunga \to Quechua \to Suni \to Puna \to Janca**.
* **Respuesta Correcta:** **B**

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Piso Ecológico:** Faja altitudinal del relieve andino delimitada por condiciones térmicas, pluviales y geomorfológicas particulares que sustentan comunidades biológicas adaptadas.
2. **Toponimia:** Estudio del origen, significado y etimología de los nombres de lugares geográficos en las lenguas autóctonas.
3. **Soroche:** Conjunto de síntomas fisiológicos (cefalea, náuseas, disnea) causados por la hipoxia o baja presión parcial de oxígeno en altitudes superiores a los 3\,000\text{ m s.n.m.}
4. **Lloclla (Huayco):** Aluvión violento de lodo, agua y rocas sueltas que desciende por quebradas estrechas en la región Yunga tras lluvias torrenciales estivales.
5. **Cantuta:** Flor sagrada del Tawantinsuyu y flor nacional del Perú (*Cantua buxifolia*), arbusto típico de la región Suni.
6. **Titanca (Puya de Raimondi):** Especie botánica gigante de la región Puna que alcanza hasta 12\text{ metros} de altura y florece una sola vez en su vida centenaria.
7. **Queñual:** Árbol nativo retorcido de corteza laminar rojiza (*Polylepis*) que forma bosques de altura en las regiones Suni y Puna.
8. **Gallito de las Rocas (Tunqui):** Ave nacional del Perú (*Rupicola peruvianus*), de llamativo plumaje rojo anaranjado que anida en cañones rocosos de la Selva Alta.
9. **Lupuna:** Árbol gigante emergente de la llanura amazónica (Omagua) que supera los 60\text{ metros} de altura, dotado de grandes aletas de soporte basal.
10. **Pongo:** Cañón fluvial estrecho labrado por ríos amazónicos al quebrar la Cordillera Oriental en la región Rupa Rupa.

---



## 11. BANCO DE FLASHCARDS (Q/A)

* **PREGUNTA:** ¿Quién formuló la tesis de las Ocho Regiones Naturales del Perú y en qué año la presentó?
  * **RESPUESTA:** El Dr. Javier Pulgar Vidal, presentada en 1940 en Lima.
* **PREGUNTA:** ¿Cuál es el factor geográfico determinante y estructurante de las 8 regiones naturales?
  * **RESPUESTA:** El factor altitudinal (impuesto por la Cordillera de los Andes).
* **PREGUNTA:** ¿Qué significa etimológicamente la palabra "Yunga" en aymara y quechua?
  * **RESPUESTA:** "Mujer estéril" en aymara (por la aridez rocosa) y "Valle cálido" en quechua.
* **PREGUNTA:** ¿Cuál es la región natural con el clima más benigno y saludable del Perú y qué cultivo la simboliza?
  * **RESPUESTA:** La región Quechua (2\,300 - 3\,500\text{ m}), simbolizada por el cultivo del maíz.
* **PREGUNTA:** ¿Cuál es la flor nacional del Perú y a qué región natural pertenece como especie nativa?
  * **RESPUESTA:** La Cantuta (*Cantua buxifolia*), perteneciente a la región Suni o Jalca.
* **PREGUNTA:** ¿Qué región natural es denominada "tierra del soroche" y qué planta cubre predominantemente sus mesetas?
  * **RESPUESTA:** La región Puna (4\,000 - 4\,800\text{ m}), cubierta por el ichu o paja brava.
* **PREGUNTA:** ¿Qué significa la toponimia "Janca" y qué tipo de clima presenta?
  * **RESPUESTA:** Significa "blanco" o "maíz tostado"; presenta clima glaciar o muy frígido con temperaturas bajo cero.
* **PREGUNTA:** ¿Cuál es la región natural más lluviosa y nubosa del Perú?
  * **RESPUESTA:** La región Rupa Rupa o Selva Alta (400 - 1\,000\text{ m s.n.m.}).
* **PREGUNTA:** ¿Cuál es el ave nacional del Perú y en qué región natural habita?
  * **RESPUESTA:** El Gallito de las Rocas (*Rupicola peruvianus*), en la región Rupa Rupa.
* **PREGUNTA:** ¿Qué significa toponímicamente "Omagua" y cuál es el pez gigante que habita sus ríos?
  * **RESPUESTA:** Significa "peces de agua dulce" o "tierra de hombres sabios"; su pez emblemático es el Paiche (*Arapaima gigas*).

---



### Matriz de Aprendizajes Esperados (Estándar UNSA / UNMSM-DECO / UNI)
* **Conceptual:** Analizar los seis criterios de clasificación ecológica-geográfica formulados por el Dr. Javier Pulgar Vidal (altitudinal, toponímico, climático, ecológico/flora/fauna, geomorfológico y actividad antrópica tradicional). Caracterizar cada una de las 8 regiones naturales: Chala, Yunga, Quechua, Suni, Puna, Janca, Rupa Rupa y Omagua.
* **Procedimental:** Localizar los límites altitudinales de cada región, identificar la toponimia aborigen (quechua, aymara, cauqui) y asociar especies emblemáticas de flora y fauna a su piso ecológico correspondiente.
* **Actitudinal / Crítico:** Valorar el conocimiento ecológico ancestral de los pueblos andino-amazónicos sobre el control vertical de pisos ecológicos y reflexionar sobre la vulnerabilidad de la biodiversidad ante la degradación antrópica.

---



### Ejercicio 1 (Nivel 1 - Básico Formativo: Altitudes y Toponimia)
**Enunciado:**
En la clasificación biogeográfica de Javier Pulgar Vidal, la región natural situada entre los 2\,300 y los 3\,500\text{ metros sobre el nivel del mar}, cuyo vocablo toponímico en lengua nativa alude a "tierras de clima templado" y que se caracteriza por poseer el clima más benigno y saludable del país, apto para el cultivo del maíz, se denomina:
* A) Yunga
* B) Quechua
* C) Suni
* D) Puna
* E) Rupa Rupa

**Solución Paso a Paso:**
1. Analizamos los límites altitudinales dados: 2\,300 a 3\,500\text{ m s.n.m.}
2. Esta faja altitudinal corresponde inequívocamente a la región **Quechua**, célebre por albergar a las principales ciudades serranas (Cusco, Huancayo, Arequipa) y ser el hábitat óptimo del maíz con un clima templado seco benigno.
* **Respuesta Correcta:** **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geo_t08_s02_c01",
                    question = "En quechua y aymara, la palabra 'Puna' (4 000 a 4 800 m s.n.m.) hace referencia etimológica directa a:",
                    options = listOf(
                        "Tierra fértil para el cultivo intensivo de frutales de hueso.",
                        "Valle de profundos cañones donde abundan peces de río.",
                        "Soroche, mal de montaña o tierra fría azotada por vientos.",
                        "Selva ardiente cubierta de neblinas densas matinales."
                    ),
                    correctIndex = 2,
                    explanation = "El vocablo Puna alude al 'soroche' o efecto de hipoxia por descompresión de oxígeno en las altas mesetas frías andinas."
                ),
                Challenge(
                    id = "geo_t08_s02_c02",
                    question = "¿Qué planta gigante con inflorescencias que alcanzan hasta 8 000 flores es endémica y característica de la región Puna?",
                    options = listOf(
                        "La lupuna blanca.",
                        "La Puya de Raimondi (*Puya raimondii*).",
                        "El algarrobo costero.",
                        "El árbol de la quina."
                    ),
                    correctIndex = 1,
                    explanation = "La Puya de Raimondi o titanca es la bromeliácea más colosal del mundo, hábitat exclusivo de los roquedales y pajonales de la región Puna."
                ),
                Challenge(
                    id = "geo_t08_s02_c03",
                    question = "La región Janca o Cordillera se extiende altitudinalmente desde los:",
                    options = listOf(
                        "3 500 m s.n.m. hasta las mesetas altiplánicas de 4 000 m s.n.m.",
                        "1 000 m s.n.m. hasta los valles interandinos de 2 300 m s.n.m.",
                        "4 800 m s.n.m. hasta la cumbre del Huascarán a 6 768 m s.n.m.",
                        "400 m s.n.m. hasta la naciente de los ríos amazónicos a 800 m s.n.m."
                    ),
                    correctIndex = 2,
                    explanation = "Janca abarca desde la isoterma de 4 800 m s.n.m. hasta la cota máxima del Perú en el nevado Huascarán (6 768 m s.n.m.)."
                ),
                Challenge(
                    id = "geo_t08_s02_c04",
                    question = "¿Qué ave emblemática de los Andes domina el espacio aéreo de las regiones Janca y Puna?",
                    options = listOf(
                        "El Cóndor andino (*Vultur gryphus*).",
                        "El flamenco o parihuana boreal.",
                        "El zarcillo costero (*Larosterna inca*).",
                        "El gallito de las rocas (*Rupicola peruvianus*)."
                    ),
                    correctIndex = 0,
                    explanation = "El cóndor andino habita y anida en los riscos inaccesibles de la región Janca o Cordillera, sobrevolando las mesetas de la Puna."
                ),
                Challenge(
                    id = "geo_t08_s02_c05",
                    question = "Toponímicamente, el nombre 'Rupa Rupa' (400 a 1 000 m s.n.m.) significa en quechua:",
                    options = listOf(
                        "Ardiente o lo que está caliente y quema.",
                        "Tierra blanca de nieve resplandeciente.",
                        "Llanura pantanosa donde abundan peces sabrosos.",
                        "Desierto salobre de vientos tempestuosos."
                    ),
                    correctIndex = 0,
                    explanation = "Rupa Rupa proviene del quechua 'rupha' que denota algo caliente, ardiente y encendido, aludiendo a su clima cálido y húmedo."
                ),
                Challenge(
                    id = "geo_t08_s02_c06",
                    question = "En la geomorfología de la región Rupa Rupa (Selva Alta), los cañones profundos por donde los ríos rompen las cadenas montañosas se denominan:",
                    options = listOf(
                        "Tablazos.",
                        "Restingas.",
                        "Pongos.",
                        "Tahuampas."
                    ),
                    correctIndex = 2,
                    explanation = "Los pongos (del quechua 'punku', puerta) son profundos desfiladeros labrados por ríos caudalosos en los flancos montañosos de la Selva Alta."
                ),
                Challenge(
                    id = "geo_t08_s02_c07",
                    question = "¿A qué región natural corresponden tanto el ave nacional (Gallito de las Rocas) como el árbol nacional (Árbol de la Quina) del Perú?",
                    options = listOf(
                        "Quechua.",
                        "Rupa Rupa o Selva Alta.",
                        "Omagua.",
                        "Suni o Jalca."
                    ),
                    correctIndex = 1,
                    explanation = "Tanto el Gallito de las Rocas (*Rupicola peruvianus*) como el Árbol de la Quina (*Cinchona officinalis*) son especies nativas emblemáticas de la región Rupa Rupa."
                ),
                Challenge(
                    id = "geo_t08_s02_c08",
                    question = "En la llanura de la región Omagua (Selva Baja), las terrazas no inundables donde se asientan las principales ciudades se denominan:",
                    options = listOf(
                        "Altos.",
                        "Restingas.",
                        "Tahuampas.",
                        "Filos."
                    ),
                    correctIndex = 0,
                    explanation = "Los 'Altos' son colinas y terrazas fluviales que jamás se inundan con las crecidas de los ríos amazónicos, sirviendo de asiento a urbes como Iquitos y Pucallpa."
                ),
                Challenge(
                    id = "geo_t08_s02_c09",
                    question = "¿Qué pez gigante de agua dulce, representativo de la fauna ictiológica de la región Omagua, puede superar los dos metros de longitud?",
                    options = listOf(
                        "La trucha arcoíris.",
                        "La anchoveta.",
                        "El bagre de torrente.",
                        "El Paiche (*Arapaima gigas*)."
                    ),
                    correctIndex = 3,
                    explanation = "El Paiche (*Arapaima gigas*) es el pez escamado de agua dulce más voluminoso de la Amazonía, habitante fundamental de los ecosistemas lénticos de Omagua."
                ),
                Challenge(
                    id = "geo_t08_s02_c10",
                    question = "¿Cuál es el árbol más alto del bosque tropical amazónico peruano (región Omagua), pudiendo alcanzar más de 60 metros de altura?",
                    options = listOf(
                        "El mangle rojo de estero.",
                        "El molle serrano.",
                        "La Lupuna (*Ceiba pentandra*).",
                        "El queñual de alta cumbre."
                    ),
                    correctIndex = 2,
                    explanation = "La lupuna (*Ceiba pentandra*) se erige como el árbol emergente más imponente de la Selva Baja u Omagua, sobrepasando los 60 metros de altura."
                )
            )
        )
    )
}
