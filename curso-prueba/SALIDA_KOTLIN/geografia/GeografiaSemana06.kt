package geografia

object GeografiaSemana06 {

    val lessons = listOf(
        LessonNode(
            id = "geo_t06_s01",
            subjectId = "geografia",
            semana = 6,
            subtema = "6.1",
            title = "3.1. La Hidrósfera y el Ciclo Hidrológico",
            theory = LessonTheory(
                content = """# TEMA 06: Hidrósfera: Mar Peruano y Aguas Continentales

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    HIDRO["La Hidrósfera y el Perú"] --> MAR_PERU["El Mar Peruano (Mar de Grau)"]
    HIDRO --> AGUAS_CONT["Aguas Continentales del Perú"]

    MAR_PERU --> LIMS["Límites y Soberanía:<br/>Decreto 781 (1947), 200 Millas, Fallo de La Haya (2014)"]
    MAR_PERU --> SECT["Sectores Marinos:<br/>Norte (Cálido, Ecuatorial) y Centro-Sur (Frío, Humboldt)"]
    MAR_PERU --> AFLOR["Fenómeno de Afloramiento (Upwelling):<br/>Alisios SE, Coriolis, Transporte de Ekman, Nutrientes"]
    MAR_PERU --> CORR["Sistema de Corrientes:<br/>Corriente Peruana (Humboldt), Corriente de El Niño, Cromwell"]

    AGUAS_CONT --> VERT_PAC["Vertiente del Pacífico (Costa):<br/>Exorreica, 53 ríos, régimen irregular, torrentosos, hidroeléctricas e irrigaciones"]
    AGUAS_CONT --> VERT_AMZ["Vertiente del Amazonas (Atlántico):<br/>Exorreica, caudalosa, régimen regular, navegable, pongos, origen del río Amazonas"]
    AGUAS_CONT --> VERT_TIT["Vertiente del Titicaca:<br/>Endorreica, radial, corta longitud, efluente: río Desaguadero"]
    AGUAS_CONT --> LAGOS["Lagos y Glaciares:<br/>Titicaca, Chinchaycocha, Cordillera Blanca"]
```

---



### 3.1. La Hidrósfera y el Ciclo Hidrológico

La **hidrósfera** es el subsistema acuático del geosistema, cubriendo aproximadamente el **71\% de la superficie terrestre** (\approx 361\text{ millones de km}^2).
* **Distribución Planetaria del Agua:**
  * **Agua Salada (Océanos y Mares):** **97.2\%** del volumen total (Océano Pacífico 46\%, Atlántico 23\%, Índico 20\%, Antártico y Ártico).
  * **Agua Dulce:** Apenas el **2.8\%**:
    * *Casquetes polares y glaciares (Criósfera):* 2.15\% (más del 75\% del agua dulce líquida potencial).
    * *Aguas subterráneas (Acuíferos y napas freáticas):* 0.62\%.
    * *Lagos y embalses:* 0.009\%.
    * *Humedad del suelo:* 0.005\%.
    * *Vapor atmosférico:* 0.001\%.
    * *Ríos y arroyos superficiales:* Solo el **0.0001\%**.
* **El Ciclo Hidrológico:** Circulación cerrada y continua de agua impulsada por la energía solar y la gravedad a través de cinco etapas fundamentales: **Evaporación** (y evapotranspiración vegetal) \to **Condensación** (formación de nubes) \to **Precipitación** (lluvia, nieve, granizo) \to **Infiltración** (alimentación freática) \to **Escorrentía** superficial y subterránea hacia mares y lagos.

---



### 3.2. El Mar Peruano (Mar de Grau)

Es la porción del Océano Pacífico adyacente a las costas del Perú sobre la cual el Estado ejerce soberanía y jurisdicción bioceánica.
* **Marco Jurídico e Histórico:**
  * **Decreto Supremo N.° 781 (1 de agosto de 1947):** Promulgado por el presidente **José Luis Bustamante y Rivero**, proclamó la soberanía y jurisdicción del Perú sobre la plataforma submarina y el mar adyacente hasta una distancia de **200 millas marinas** (370.4\text{ km}), sentando las bases de la doctrina marítima internacional del Derecho del Mar.
  * **Fallo de la Corte Internacional de Justicia de La Haya (27 de enero de 2014):** Resolvió la controversia de delimitación marítima con Chile. Ratificó el paralelo del Hito N.° 1 hasta las **80\text{ millas náuticas}**, a partir de la cual trazó una línea equidistante en dirección suroeste hasta las 200 millas, reconociendo para el Perú más de **50\,000\text{ km}^2 de dominio marítimo** exclusivo.

#### A. Dimensiones y Sectores del Mar Peruano
* **Límites:**
  * *Norte:* Paralelo de Boca de Capones (03^\circ 23' 33.96''\text{ S}, frontera con Ecuador).
  * *Sur:* Punto "Concordia" / Paralelo del Hito N.° 1 (18^\circ 21' 08''\text{ S}, frontera con Chile).
  * *Oeste:* Línea imaginaria a 200 millas marinas mar adentro.
* **División en Dos Sectores Oceanográficos:**

| Parámetro | Sector Norte (Mar Ecuatorial o Tropical) | Sector Centro-Sur (Mar Frío de la Corriente Peruana) |
| :--- | :--- | :--- |
| **Ubicación Geográfica** | Desde Boca de Capones (Tumbes) hasta la Península de Illescas (Piura, 05^\circ\text{ S}). | Desde la Península de Illescas hasta la frontera con Chile (18^\circ 21'\text{ S}). |
| **Temperatura del Agua** | **Cálida:** 21^\circ\text{C} a 24^\circ\text{C} (e incluso 28^\circ\text{C} en verano). | **Fría:** 13^\circ\text{C} a 17^\circ\text{C} (anomalía térmica de -6^\circ\text{C} a -8^\circ\text{C}). |
| **Salinidad** | **Baja:** Menor a 34.5\text{ g/kg} (por dilución de lluvias y ríos ecuatoriales). | **Alta:** 34.8 a 35.2\text{ g/kg} (escasa dilución y alta evaporación neta). |
| **Coloración del Agua** | Azulina y cristalina (baja densidad de fitoplancton). | **Verdosa** (alta concentración de clorofila y fitoplancton microscópico). |
| **Ecosistemas y Fauna** | Manglares de Tumbes, cocodrilo americano, conchas negras, langostinos, perico, pez vela, marlines, atún. | **Gran biomasa pelágica:** Anchoveta (*Engraulis ringens*), sardina, jurel, caballa, lobos marinos y aves guaneras (guanay, piquero, pelícano). |

---

#### B. El Fenómeno de Afloramiento (Upwelling)
Es el proceso oceanográfico mediante el cual **aguas subsuperficiales frías, densas y cargadas de nutrientes inorgánicos (nitratos, fosfatos y silicatos) ascienden hacia la superficie marina iluminada (zona fótica)**.
* **Causas Físicas del Afloramiento:**
  1. **Vientos Alisios del Sureste:** Soplan en forma paralela y oblicua a la línea de costa peruana.
  2. **Efecto Coriolis y Transporte de Ekman:** La rotación terrestre desvía las aguas superficiales hacia la izquierda en el hemisferio sur (mar adentro), creando un vacío hidráulico superficial.
  3. **Ascenso de Reemplazo:** Para compensar el agua superficial empujada mar adentro, ascienden masas de agua fría del fondo del talud continental.
* **¿Por qué el Mar Peruano es uno de los más ricos del planeta?**
  1. **Afloramiento constante:** Suministra "abono mineral" ininterrumpido.
  2. **Alta radiación solar en baja latitud:** Permite una fotosíntesis acelerada del fitoplancton (diatomeas microscópicas).
  3. **Presencia de la Corriente de Humboldt:** Mantiene temperaturas frías que retienen mayor oxígeno disuelto (O_2).
  4. **Amplitud del zócalo continental:** Facilita la penetración de la luz solar hasta el lecho marino en la costa central.

---



## 4. FORMULARIO MAESTRO / CUADRO SINÓPTICO



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel 1 - Básico Formativo: Mar Peruano y Afloramiento)
**Enunciado:**
El fenómeno oceanográfico que consiste en el ascenso de masas de agua subsuperficiales frías y densas cargadas de sales minerales (fosfatos y nitratos) hacia la superficie del Mar Peruano, constituyendo el factor fundamental de la descomunal riqueza ictiológica de la Corriente de Humboldt, se denomina:
* A) Inversión térmica
* B) Fenómeno de El Niño
* C) Afloramiento o Upwelling
* D) Transporte de Coriolis
* E) Tsunami tectónico

**Solución Paso a Paso:**
1. El ascenso de aguas profundas impulsado por los vientos alisios del sureste y la fuerza de Coriolis se conoce científicamente como **afloramiento** (o *upwelling* en inglés).
2. Este fenómeno abona con sales nutrientes la zona fótica marina, detonando la floración del fitoplancton que alimenta a la inmensa biomasa de anchoveta del mar peruano.
* **Respuesta Correcta:** **C**

---



### Ejercicio 2 (Nivel 2 - Intermedio UNSA Ordinario: Vertiente del Pacífico)
**Enunciado:**
En la vertiente hidrográfica del Pacífico peruano, el río que destaca por poseer el régimen más regular y el mayor caudal medio anual de la costa, recorriendo de sur a norte el Callejón de Huaylas antes de quebrar la Cordillera Negra para desembocar en el mar, es el río:
* A) Rímac
* B) Santa
* C) Chira
* D) Majes
* E) Tumbes

**Solución Paso a Paso:**
1. El río que drena el Callejón de Huaylas entre la Cordillera Blanca y Negra en Áncash es el **río Santa**.
2. Posee el mayor caudal medio anual de toda la vertiente occidental peruana debido a los deshielos continuos de la Cordillera Blanca, abasteciendo a los valles agroindustriales de Chavimochic y Chinecas.
* **Respuesta Correcta:** **B**

---



### Ejercicio 5 (Nivel 5 - Boss Challenge: Geopolítica Marítima y Fallo de La Haya)
**Enunciado:**
Lea con atención el siguiente fragmento del fallo de la Corte Internacional de Justicia de La Haya dictado el 27 de enero de 2014 en la controversia marítima Perú contra Chile:
*"La Corte dictamina por quince votos a uno que el punto de inicio de la frontera marítima se sitúa en la intersección del paralelo de latitud del Hito N.° 1 con la línea de baja marea. Asimismo, concluye que dicho acuerdo tácito de delimitación marítima paralela se extiende únicamente hasta una distancia de 80 millas náuticas mar adentro. A partir de dicho punto de las 80 millas, la delimitación continuará a lo largo de una línea equidistante hasta alcanzar el punto donde convergen las 200 millas marinas medidas desde las costas de ambas naciones".*

De acuerdo con el análisis jurídico-geográfico del fallo y la soberanía del Mar de Grau, es correcto inferir que:
I. El Perú obtuvo derechos soberanos y exclusivos sobre una zona marítima de más de 50\,000\text{ km}^2 previamente bajo control fáctico chileno.  
II. El fallo eliminó de forma absoluta el zócalo continental peruano en el departamento de Tacna.  
III. La sentencia reconoció el argumento peruano de que los acuerdos pesqueros de 1952 y 1954 no constituían tratados generales de límites definitivos hasta las 200 millas.  
IV. La línea equidistante fijada a partir de la milla 80 favoreció a Chile al otorgarle aguas históricas peruanas frente al litoral de Ilo.

* A) I y III
* B) II y IV
* C) I, II y III
* D) Solo I
* E) I, III y IV

**Solución Paso a Paso:**
1. **Evaluación de I:** Con el trazado de la línea equidistante desde la milla 80 y la incorporación del triángulo exterior, el Perú incorporó formalmente a su dominio marítimo soberano aproximadamente **50\,354\text{ km}^2** de mar territorial y recursos pesqueros. (Verdadero).
2. **Evaluación de II:** El zócalo continental sigue existiendo bajo la jurisdicción de la plataforma marina peruana; no fue eliminado de ninguna manera. (Falso).
3. **Evaluación de III:** La Corte aceptó la tesis peruana de que las Declaraciones de Santiago (1952) y el Convenio de 1954 eran acuerdos pesqueros y que no existía un tratado de límites que llegara hasta las 200 millas, fijando un límite tácito solo hasta las 80 millas. (Verdadero).
4. **Evaluación de IV:** La línea equidistante a partir de la milla 80 benefició al Perú, devolviéndole un extenso sector marítimo en el sur. (Falso).
* Conclusión: Son correctas I y III.
* **Respuesta Correcta:** **A**

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Afloramiento:** Proceso oceanográfico de ascenso de aguas profundas gélidas y ricas en sales minerales hacia la zona fótica marina.
2. **Transporte de Ekman:** Movimiento neto del agua oceánica a 90^\circ de la dirección del viento debido al equilibrio entre la fuerza del viento y la aceleración de Coriolis.
3. **Cuenca Exorreica:** Sistema de drenaje hidrográfico cuyas aguas superficiales alcanzan y desembocan en el mar u océano abierto.
4. **Cuenca Endorreica:** Sistema hidrográfico cerrado cuyas aguas no llegan al mar, vertiéndose en lagos interiores o evaporándose en salares.
5. **Estiaje:** Periodo anual en el cual un río alcanza su caudal más bajo debido a la escasez estacional de precipitaciones en su cuenca.
6. **Pongo:** Cañón fluvial estrecho y profundo labrado por un río al atravesar una cordillera andina en la vertiente amazónica.
7. **Efluente:** Río o arroyo que nace de un lago o cuerpo de agua y desagua parte de su volumen hacia el exterior (e.g., río Desaguadero).
8. **Fitoplancton:** Conjunto de organismos vegetales microscópicos fotosintéticos que flotan en la zona fótica marina, base primaria de la red trófica.
9. **Zona Fótica:** Capa superior iluminada de las aguas marinas (hasta \approx 100 - 200\text{ m} de profundidad) donde es posible la fotosíntesis.
10. **Meandro:** Curva pronunciada y sinuosa descrita por el curso de un río en llanuras aluviales de escasa pendiente.

---



## 11. BANCO DE FLASHCARDS (Q/A)

* **PREGUNTA:** ¿Qué porcentaje del agua total del planeta corresponde a agua dulce y dónde se concentra su mayor volumen?
  * **RESPUESTA:** Representa el 2.8\%, y más del 75\% de ella se encuentra congelada en los glaciares y casquetes polares (criósfera).
* **PREGUNTA:** ¿Qué presidente peruano proclamó las 200 millas marinas en 1947 y mediante qué norma?
  * **RESPUESTA:** José Luis Bustamante y Rivero, mediante el Decreto Supremo N.° 781 del 1 de agosto de 1947.
* **PREGUNTA:** ¿Cuáles son las dos causas físicas fundamentales del fenómeno de afloramiento en el mar peruano?
  * **RESPUESTA:** Los vientos alisios del sureste y el Efecto Coriolis que produce el Transporte de Ekman mar adentro.
* **PREGUNTA:** ¿Cuál es la diferencia de temperatura y salinidad entre el sector norte y centro-sur del Mar Peruano?
  * **RESPUESTA:** El sector norte es cálido (> 21^\circ\text{C}) y de baja salinidad; el centro-sur es frío (13^\circ\text{C}-17^\circ\text{C}) y de alta salinidad.
* **PREGUNTA:** ¿Por qué la vertiente hidrográfica del Pacífico padece estrés hídrico si alberga al 65\% de la población peruana?
  * **RESPUESTA:** Porque solo dispone del 1.8\% de los recursos de agua dulce superficial del país.
* **PREGUNTA:** ¿Cuál es el río más caudaloso de la costa peruana y qué proyectos de irrigación abastece?
  * **RESPUESTA:** El río Santa; abastece a los proyectos Chavimochic y Chinecas.
* **PREGUNTA:** ¿Dónde nace científicamente el río Amazonas y qué nombres sucesivos adopta?
  * **RESPUESTA:** En el Nevado Quehuisha/Mismi (Arequipa) como Carhuasanta \to Lloqueta \to Apurímac \to Ene \to Tambo \to Ucayali (que al unirse al Marañón forma el Amazonas).
* **PREGUNTA:** ¿Cuál es el río más largo dentro del territorio peruano?
  * **RESPUESTA:** El río Ucayali (1\,771\text{ km}).
* **PREGUNTA:** ¿Cuál es el río más caudaloso que alimenta al lago Titicaca y cuál es su único río efluente?
  * **RESPUESTA:** El río Ramis es el más caudaloso que lo alimenta; el río Desaguadero es su único efluente de salida.
* **PREGUNTA:** ¿Qué resolvió la Corte de La Haya en 2014 sobre el límite marítimo entre Perú y Chile?
  * **RESPUESTA:** Mantuvo el paralelo del Hito N.° 1 hasta la milla 80 y trazó una línea equidistante suroeste hasta la milla 200, otorgando a Perú más de 50\,000\text{ km}^2 de mar.

---



### Matriz de Aprendizajes Esperados (Estándar UNSA / UNMSM-DECO / UNI)
* **Conceptual:** Analizar la distribución del agua en el planeta y el ciclo hidrológico. Caracterizar el Mar de Grau (sectores ecológicos, corrientes marinas, fenómeno de afloramiento, causas de su biomasa y delimitación marítima con Chile según La Haya). Comparar con rigor físico y económico las tres vertientes hidrográficas del Perú (Pacífico, Amazonas y Titicaca).
* **Procedimental:** Identificar en mapas fluviales el curso, pongos, meandros, represas e infraestructuras hidroeléctricas sobre los ríos Rímac, Santa, Mantaro, Amazonas y la cuenca del Titicaca.
* **Actitudinal / Crítico:** Valorar la seguridad hídrica, la preservación de los acuíferos subterráneos y la lucha contra la contaminación minera y de aguas servidas en las cuencas del Pacífico y el lago Titicaca.

---



### 3.3. Aguas Continentales del Perú: Las Tres Vertientes Hidrográficas

El relieve andino divide al territorio peruano en tres macrovertientes hidrográficas con características físicas y regímenes marcadamente contrastantes:

```
                      CORDILLERA DE LOS ANDES
                             /\
   Vertiente del            /  \               Vertiente del
     PACÍFICO              /    \                AMAZONAS
  (53 ríos cortos,        /      \         (Caudalosos, navegables,
 torrentosos, estiaje)   /        \        meándricos, rampa oriental)
      ←                 /          \                  →
   Océano Pacífico     /   Lago     \         Océano Atlántico
                      /  Titicaca    \
                     /  (Endorreico)  \
```

---

#### A. Vertiente Hidrográfica del Pacífico (Cuenca Occidental)
* **Generalidades:**
  * Compuesta por **53 ríos principales** que nacen en la vertiente occidental andina y desembocan en el Océano Pacífico.
  * Ocupa el **21.7\% del territorio nacional**, alberga a más del **65\% de la población del país**, pero solo dispone del **1.8\% de los recursos hídricos superficiales**.
* **Características Hidrológicas:**
  * **Cuencas Exorreicas:** Desembocan en el mar (algunos ríos sufren arreísmo en épocas de estiaje severo por infiltración y sobreexplotación agrícola, como el río Ica).
  * **Curso Corto y Pendiente Pronunciada:** Nacen a más de 4\,000 - 5\,000\text{ m s.n.m.} y recorren menos de 150 - 300\text{ km}; son ríos **torrentosos y de régimen juvenil erosionador** en su cuenca alta.
  * **Régimen Muy Irregular:** Caudal estacional marcado:
    * *Época de crecida (Avenidas):* Verano austral (enero a marzo), alimentados por lluvias andinas.
    * *Época de estiaje:* Invierno y primavera (mayo a noviembre), caudal mínimo o lechos secos.
  * **No navegables:** Salvo el **río Tumbes** en su tramo inferior (desembocadura en delta con manglares).
* **Ríos Notables de la Vertiente del Pacífico:**
  * **Río Santa (Áncash):** El de **mayor caudal anual constante** de la costa; recorre de sur a norte el Callejón de Huaylas entre la Cordillera Blanca y Negra, atraviesa el Cañón del Pato y abastece los proyectos de irrigación **Chavimochic** y **Chinecas**, además de la central hidroeléctrica del Cañón del Pato.
  * **Río Rímac (Lima):** El más urbanizado, más contaminado y el que cuenta con **mayor número de centrales hidroeléctricas escalonadas** (Huinco, Pablo Boner, Moyopampa, Huampaní).
  * **Río Majes-Camaná (Arequipa):** Posee la **mayor longitud** de la vertiente del Pacífico (\approx 388\text{ km}, naciendo como Colca). Sus aguas son trasvasadas en el colosal proyecto agroindustrial **Majes-Siguas**.
  * **Río Tambo (Arequipa-Moquegua):** Posee la **cuenca hidrográfica más extensa** de la costa (> 13\,000\text{ km}^2).
  * **Río Chira (Piura):** El de caudal más regular de la costa norte; abastece a la represa de Poechos (el reservorio de mayor capacidad del país).
  * **Río La Leche (Lambayeque):** El río menos caudaloso y más seco en estiaje.
  * **Río Caplina (Tacna):** El río más meridional del Perú, abastece a la ciudad heroica de Tacna.

---

#### B. Vertiente Hidrográfica del Amazonas (Cuenca del Atlántico)
* **Generalidades:**
  * Abarca el **74.5\% del territorio peruano** y genera el **97.7\% del agua dulce superficial** del país, albergando a menos del 30\% de la población.
  * Todos sus ríos son tributarios directos o indirectos del gran **río Amazonas**, que desagua en el Océano Atlántico.
* **Características Hidrológicas:**
  * **Cuencas Exorreicas de Escala Continental.**
  * **Ríos de Gran Longitud y Enorme Caudal:** Alimentados por lluvias tropicales perennes y deshielos glaciares andinos.
  * **Régimen Regular:** Mantienen un caudal abundante todo el año, aunque presentan épocas de vaciante (junio-setiembre) y creciente (diciembre-abril).
  * **Ríos Navegables:** En su curso medio e inferior en la Selva Baja, formando amplios **meandros**, islas fluviales, *tahuampas* y lagunas de herradura o *cochas*.
  * **Gran Potencial Hidroeléctrico en la Rampa Andina:** En su curso superior cortan las cordilleras formando cañones estrechos y profundos llamados **pongos**.
* **Ríos Notables de la Vertiente Amazónica:**
  * **Río Amazonas:** El río **más largo, ancho, profundo y caudaloso del planeta Tierra** (L \approx 6\,800\text{ km}; caudal medio de descarga \approx 219\,000\text{ m}^3\text{/s}).
    * *Nacimiento geográfico comprobado:* Nace en el departamento de **Arequipa**, en la provincia de Caylloma, en la quebrada Apacheta al pie del **Nevado Quehuisha/Mismi** a 5\,597\text{ m s.n.m.}, con el nombre de riachuelo Carhuasanta \to Lloqueta \to Challamayo \to Hornillos \to Monigote \to **Río Apurímac** \to Ene \to Tambo \to **Ucayali**, el cual al confluir con el **río Marañón** en Nauta (Loreto) forma formalmente el **Río Amazonas**.
  * **Río Ucayali:** El **río más largo del territorio peruano** (1\,771\text{ km} dentro del Perú).
  * **Río Marañón:** El río de **mayor potencial hidroeléctrico** del país; erosiona la cadena central y oriental formando célebres pongos como **Manseriche** y **Rentema**.
  * **Río Huallaga:** Forma el valle longitudinal más extenso del país (selva alta) y erosiona la cordillera en el **Pongo de Aguirre**.
  * **Río Mantaro:** Cruza el valle del Mantaro (Junín y Huancavelica); forma la península de Tayacaja donde opera el **Complejo Hidroeléctrico Santiago Antúnez de Mayolo - Restitución**, que genera cerca del 20\% de la energía eléctrica del Perú.
  * **Río Urubamba:** Riega el Valle Sagrado de los Incas en Cusco, pasa al pie de Machu Picchu y corta la cordillera oriental en el histórico **Pongo de Mainique**, ingresando a la zona gasífera de Camisea.

---

#### C. Vertiente Hidrográfica del Titicaca (Hoya del Altiplano)
* **Generalidades:**
  * Abarca el **3.8\% del territorio nacional** y concentra el **0.5\% del volumen hídrico**. Se emplaza en la Meseta del Collao (Puno) a más de 3\,812\text{ m s.n.m.}
* **Características Hidrológicas:**
  * **Cuenca Endorreica y Cerrada:** Sus ríos no tienen salida al océano; nacen en las cumbres de la Cordillera Volcánica (al oeste) y la Cordillera de Carabaya (al norte y este), convergiendo de forma **radial y centrípeta** hacia el **Lago Titicaca**.
  * **Ríos de Corto Recorrido y Poco Caudal.**
  * **Régimen Irregular:** Torrenciales en verano (enero-marzo) y con marcado estiaje en invierno.
  * **No navegables:** Aguas frías de altura.
* **Ríos Notables de la Cuenca del Titicaca:**
  * **Río Ramis:** El **más largo, extenso y caudaloso** de la vertiente (formado por la unión del Ayaviri y el Azángaro).
  * **Río Coata:** Formado por el río Cabanillas y Lampa; atraviesa la ciudad de Juliaca y sufre severos problemas de contaminación por efluentes urbanos.
  * **Río Ilave:** Segundo más largo; cuenca agrícola y ganadera tradicional.
  * **Río Huancané:** Desemboca en el extremo norte del lago.
  * **Río Suches:** Nace en la laguna de Suches y actúa como límite fronterizo natural entre Perú y Bolivia.
  * **Río Desaguadero:** Es el **único efluente (desagüe) del Lago Titicaca**; transporta una fracción de sus aguas superficiales hacia el lago Poopó en territorio boliviano.

---



### Caso de Estudio DECO: El Proyecto Especial de Irrigación e Hidroenergético Majes-Siguas
En el sur del Perú (Arequipa), la vertiente del Pacífico padece un agudo déficit de recursos hídricos superficiales en comparación con la alta fertilidad de sus pampas desérticas:
1. **La Solución Geográfica del Trasvase:** El proyecto Majes-Siguas capta aguas de la cuenca alta del río Colca y del río Apurímac (represas de Condoroma y Angostura), trasvasándolas a través de túneles y canales cordilleranos hacia las cuencas de los ríos Siguas y Quilca.
2. **Impacto Geoeconómico:** Transforma más de 38\,000\text{ hectáreas} de desierto estéril en emporios agroexportadores de uva, palta y alcachofa, al tiempo que genera energía hidroeléctrica en las centrales de Lluta y Lluclla, evidenciando el dominio y modificación antrópica del espacio geográfico andino.

---



### Ejercicio 3 (Nivel 3 - Avanzado UNMSM DECO: Vertiente del Amazonas y Pongos)
**Enunciado:**
Los ríos de la vertiente del Amazonas presentan una rampa andina de alta pendiente donde erosionan cadenas montañosas formando cañones estrechos y profundos conocidos como pongos, idóneos para el emplazamiento de presas hidroeléctricas. En este contexto, el río de mayor potencial hidroeléctrico del Perú que atraviesa la cordillera formando los célebres pongos de Rentema y Manseriche es el río:
* A) Ucayali
* B) Huallaga
* C) Marañón
* D) Urubamba
* E) Mantaro

**Solución Paso a Paso:**
1. El río Marañón es el tributario andino más importante que recorre las cadenas montañosas del norte peruano.
2. Al cortar la Cordillera Oriental y Central antes de unirse al Ucayali, modela los colosales pongos de **Rentema** y **Manseriche**, albergando el mayor potencial de generación hidroeléctrica del territorio nacional.
* **Respuesta Correcta:** **C**

---



### Ejercicio 4 (Nivel 4 - Crítico / Interdisciplinario UNI: Hoya del Lago Titicaca)
**Enunciado:**
La vertiente hidrográfica del Titicaca constituye una cuenca endorreica cerrada de carácter centrípeto ubicada en la meseta del Collao. Al analizar la dinámica hidrológica de sus tributarios y efluentes, indique la afirmación correcta:
* A) El río Ramis es el más largo y caudaloso de la vertiente y desagua en el Océano Atlántico.
* B) El río Desaguadero es el único efluente natural que drena las aguas superficiales del Titicaca hacia el lago Poopó.
* C) Todos los ríos del Altiplano son plenamente navegables durante los doce meses del año.
* D) El río Suches delimita la frontera internacional natural entre el Perú y la República de Chile.
* E) La cuenca concentra más del 50\% de los recursos hídricos superficiales de todo el Perú.

**Solución Paso a Paso:**
1. Analizamos las opciones:
   * A es falsa: el Ramis desagua en el lago Titicaca, no en el Atlántico.
   * B es **verdadera**: el río Desaguadero es el **único efluente (río de desagüe)** del Titicaca y conduce caudales excedentes hacia el lago Poopó en Bolivia.
   * C es falsa: son ríos de poco calado, pedregosos y torrenciales, no navegables.
   * D es falsa: el Suches delimita frontera con Bolivia, no con Chile.
   * E es falsa: solo concentra el 0.5\% del agua del país.
* **Respuesta Correcta:** **B**

---



## 6. TÉCNICAS Y ARTIFICIOS DE RESOLUCIÓN (HACKING PREUNIVERSITARIO)

1. **Diferenciación Rápida de Vertientes en Enunciados:**
   * Si el enunciado menciona: *valle costero, represa para irrigación agroexportadora, déficit hídrico poblacional, Huinco, Chavimochic* \to Marca **Vertiente del Pacífico**.
   * Si menciona: *pongo, meandro, puerto fluvial, cochas, gas de Camisea, Santiago Antúnez de Mayolo* \to Marca **Vertiente del Amazonas**.
   * Si menciona: *cuenca endorreica, altiplano, radial, Lago Poopó, Desaguadero, río Ramis* \to Marca **Vertiente del Titicaca**.
2. **El "Río más..." en Admisión UNSA / UNMSM:**
   * ¿Río más largo del Perú? \to **Ucayali** (1\,771\text{ km}).
   * ¿Río más caudaloso de la costa? \to **Santa**.
   * ¿Río con mayor potencial hidroeléctrico? \to **Marañón**.
   * ¿Río con mayor producción hidroeléctrica activa? \to **Mantaro**.
   * ¿Único efluente del Titicaca? \to **Desaguadero**.

---



### 3.4. Lagos y Glaciares del Perú

* **Lago Titicaca:** Es el **lago navegable más alto del mundo** (3\,812\text{ m s.n.m.}) y el más extenso de Sudamérica en agua dulce (8\,372\text{ km}^2, correspondiendo al Perú el 56\%). Es de origen **tectónico** (fosa tectónica o graben). Actúa como un colosal **termorregulador ambiental**, haciendo habitable y fértil el gélido Altiplano puneño.
* **Lago Junín o Chinchaycocha:** Segundo lago más extenso del Perú (530\text{ km}^2, a 4\,080\text{ m s.n.m.}); en él nace el río Mantaro.
* **Glaciares Andinos:** El Perú concentra más del **70\% de los glaciares tropicales del mundo**, destacando la **Cordillera Blanca** (nevado Huascarán, 6\,768\text{ m s.n.m.}), pero enfrenta una acelerada crisis de desglaciación por el cambio climático.

---



### Cuadro Comparativo de las Tres Vertientes Hidrográficas del Perú

| Parámetro | Vertiente del Pacífico | Vertiente del Amazonas | Vertiente del Titicaca |
| :--- | :--- | :--- | :--- |
| **Tipo de Cuenca** | **Exorreica** (algunos ríos sufren arreísmo temporal) | **Exorreica** (drenaje macrocontinental) | **Endorreica** (centrípeta cerrada) |
| **Desembocadura** | Océano Pacífico | Río Amazonas \to Océano Atlántico | Lago Titicaca |
| **Porcentaje de Agua** | **1.8\%** | **97.7\%** | **0.5\%** |
| **Población Servida** | \approx 65\% (estrés hídrico extremo) | \approx 30\% | \approx 5\% |
| **Régimen Fluvial** | Muy irregular (estiaje prolongado) | Regular (abundante todo el año) | Irregular (crecida en verano) |
| **Longitud y Curso** | Cortos, torrentosos, pendientes empinadas | Muy largos, caudalosos, meándricos | Cortos, radiales, baja pendiente |
| **Navegabilidad** | No navegables (salvo río Tumbes) | **Ampliamente navegables** | No navegables |
| **Río Más Caudaloso** | **Río Santa** | **Río Amazonas** | **Río Ramis** |
| **Río Más Largo** | **Río Majes-Camaná** (388\text{ km}) | **Río Ucayali** (1\,771\text{ km}) | **Río Ramis** (320\text{ km}) |
| **Mayor Hidroeléctrica** | Rímac (Huinco) / Santa (Cañón del Pato) | **Río Mantaro** (Santiago Antúnez de Mayolo) | Ninguna de gran envergadura |

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geo_t06_s01_c01",
                    question = "La hidrosfera comprende la totalidad de las aguas del planeta, de las cuales aproximadamente el 97% corresponde a:",
                    options = listOf(
                        "Glaciares y casquetes polares",
                        "Aguas subterráneas de acuíferos confinados",
                        "Océanos y mares salados",
                        "Ríos y lagos de agua dulce",
                    ),
                    correctIndex = 2,
                    explanation = "El 97.2% del volumen total de agua del planeta es agua oceánica salada; apenas el 2.8% restante es agua dulce continental, encontrándose la mayor parte congelada en glaciares polares."
                ),
                Challenge(
                    id = "geo_t06_s01_c02",
                    question = "El motor energético universal primario que impulsa el ciclo hidrológico en la Tierra mediante la evaporación y transpiración continua es:",
                    options = listOf(
                        "La presión atmosférica polar",
                        "El calor interno geotérmico del manto",
                        "La energía de la radiación solar",
                        "El campo gravitatorio lunar",
                    ),
                    correctIndex = 2,
                    explanation = "La radiación solar evapora billones de toneladas de agua de los océanos y continentes, elevándola a la atmósfera para continuar el ciclo de condensación y precipitación."
                ),
                Challenge(
                    id = "geo_t06_s01_c03",
                    question = "El fenómeno oceanográfico del 'Afloramiento' (Upwelling) en el Mar Peruano consiste esencialmente en:",
                    options = listOf(
                        "El ascenso de aguas frías y profundas cargadas de sales minerales y nutrientes (nitratos, fosfatos, silicatos) hacia la superficie iluminada.",
                        "La erupción de volcanes submarinos en la dorsal de Nazca.",
                        "La entrada de corrientes fluviales caudalosas durante el verano.",
                        "El descenso de aguas cálidas hacia fosas tectónicas abisales.",
                    ),
                    correctIndex = 0,
                    explanation = "Impulsado por los vientos alisios y el efecto Coriolis, el afloramiento trae aguas ricas en nutrientes desde profundidades de 100-200 m, fertilizando la capa fótica marina."
                ),
                Challenge(
                    id = "geo_t06_s01_c04",
                    question = "La extraordinaria riqueza ictiológica y biomasa pesquera del Mar Peruano (especialmente de la anchoveta Engraulis ringens) se sustenta en la base ecológica de:",
                    options = listOf(
                        "La profusión masiva de fitoplancton microscópico propiciada por el afloramiento de nutrientes y la radiación solar.",
                        "La ausencia absoluta de depredadores marinos cetáceos.",
                        "La alta salinidad de los arrecifes coralinos de Chimbote.",
                        "El clima ecuatorial caluroso que acelera el crecimiento de algas rojas.",
                    ),
                    correctIndex = 0,
                    explanation = "Los nutrientes del afloramiento alimentan inmensas concentraciones de fitoplancton, base trófica que sostiene al zooplancton y a gigantescos cardúmenes de peces pelágicos."
                ),
                Challenge(
                    id = "geo_t06_s01_c05",
                    question = "La Corriente Peruana o de Humboldt recorre el litoral desde el centro de Chile hasta la península de Illescas (Piura), caracterizándose por ser una corriente de aguas:",
                    options = listOf(
                        "Cálidas, azulinas y de escasa salinidad.",
                        "Frías, verdosas (por fitoplancton) y de desplazamiento de sur a norte.",
                        "Torrenciales submarinas de dirección este-oeste.",
                        "Sulfurosas y estériles biológicamente.",
                    ),
                    correctIndex = 1,
                    explanation = "La Corriente de Humboldt transporta aguas subantárticas frías hacia el ecuador (sur a norte), tornándose verdosas por la proliferación de clorofila fitoplanctónica."
                ),
                Challenge(
                    id = "geo_t06_s01_c06",
                    question = "A diferencia de la Corriente de Humboldt, la Corriente de El Niño es un flujo marino que se desplaza de norte a sur y se caracteriza por aguas:",
                    options = listOf(
                        "Cálidas, bajas en salinidad y con bajo contenido de oxígeno disuelto, provenientes del Golfo de Guayaquil y la zona ecuatorial.",
                        "Hipersalinas y desprovistas de fauna marina tropical.",
                        "Gélidas con iceberg flotantes procedentes de la Antártida.",
                        "Subterráneas con origen en la Amazonía.",
                    ),
                    correctIndex = 0,
                    explanation = "La Corriente de El Niño desciende desde aguas ecuatoriales cálidas (24 °C a 27 °C) e influye en la costa norte (Tumbes y Piura) permitiendo la presencia de manglares y fauna tropical."
                ),
                Challenge(
                    id = "geo_t06_s01_c07",
                    question = "El fenómeno climático-oceanográfico ENSO (El Niño-Oscilación del Sur) en su fase cálida ('El Niño') se desencadena por:",
                    options = listOf(
                        "El debilitamiento de los vientos alisios del este en el Pacífico ecuatorial, permitiendo que la masa de agua cálida del Pacífico occidental invada la costa sudamericana.",
                        "El fortalecimiento inusitado de los vientos alisios del sureste.",
                        "El aumento masivo del casquete polar antártico.",
                        "La apertura súbita de una fosa submarina en el Callao.",
                    ),
                    correctIndex = 0,
                    explanation = "Al debilitarse los vientos alisios, la onda de Kelvin empuja la piscina cálida del Pacífico occidental hacia las costas del Perú y Ecuador, elevando la temperatura del mar e induciendo lluvias torrenciales."
                ),
                Challenge(
                    id = "geo_t06_s01_c08",
                    question = "¿Cuál es el límite marítimo norte del Mar Peruano o Mar de Grau formalmente establecido con Ecuador?",
                    options = listOf(
                        "La línea de bajamar en la bahía de Sechura",
                        "El meridiano de Greenwich",
                        "El paralelo de la Concordia",
                        "El paralelo geográfico que pasa por Boca de Capones (03° 23' 33.96'' S)",
                    ),
                    correctIndex = 3,
                    explanation = "El límite norte con Ecuador quedó ratificado en el paralelo de Boca de Capones, mientras que el límite sur con Chile fue definido por el Fallo de la Corte Internacional de La Haya en 2014."
                ),
                Challenge(
                    id = "geo_t06_s01_c09",
                    question = "El color verdoso característico del Mar Peruano en su sector central y sur se debe principalmente a:",
                    options = listOf(
                        "La alta densidad y concentración microscópica de fitoplancton (diatomeas y dinoflagelados).",
                        "El reflejo de los minerales de cobre del zócalo continental.",
                        "La contaminación industrial urbana de las bahías.",
                        "La profundidad abisal de la fosa de Chimbote.",
                    ),
                    correctIndex = 0,
                    explanation = "La clorofila presente en los trillones de células de diatomeas y microalgas fitoplanctónicas absorbe la luz roja y azul reflejando el característico tono verde olivo de las aguas frías."
                ),
                Challenge(
                    id = "geo_t06_s01_c10",
                    question = "El fenómeno de 'Aguaje' o marea roja en el litoral peruano ocurre cuando:",
                    options = listOf(
                        "El mar retrocede varios kilómetros por un maremoto.",
                        "Las aguas marinas descienden por debajo de los 0 °C congelando peces.",
                        "El viento polar disuelve sales ferrosas en la superficie.",
                        "Se produce una multiplicación explosiva y anómala de dinoflagelados microalgales que tiñen el mar de pardo-rojizo y pueden agotar el oxígeno causando mortandad de peces.",
                    ),
                    correctIndex = 3,
                    explanation = "El aguaje o bloom de dinoflagelados genera descomposición bacteriana que asfixia la fauna marina local por anoxia, acompañada de malos olores y cambio de tonalidad en las aguas."
                ),
            )
        ),
        LessonNode(
            id = "geo_t06_s02",
            subjectId = "geografia",
            semana = 6,
            subtema = "6.2",
            title = "3.4. Lagos y Glaciares del Perú",
            theory = LessonTheory(
                content = """### Matriz de Aprendizajes Esperados (Estándar UNSA / UNMSM-DECO / UNI)
* **Conceptual:** Analizar la distribución del agua en el planeta y el ciclo hidrológico. Caracterizar el Mar de Grau (sectores ecológicos, corrientes marinas, fenómeno de afloramiento, causas de su biomasa y delimitación marítima con Chile según La Haya). Comparar con rigor físico y económico las tres vertientes hidrográficas del Perú (Pacífico, Amazonas y Titicaca).
* **Procedimental:** Identificar en mapas fluviales el curso, pongos, meandros, represas e infraestructuras hidroeléctricas sobre los ríos Rímac, Santa, Mantaro, Amazonas y la cuenca del Titicaca.
* **Actitudinal / Crítico:** Valorar la seguridad hídrica, la preservación de los acuíferos subterráneos y la lucha contra la contaminación minera y de aguas servidas en las cuencas del Pacífico y el lago Titicaca.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    HIDRO["La Hidrósfera y el Perú"] --> MAR_PERU["El Mar Peruano (Mar de Grau)"]
    HIDRO --> AGUAS_CONT["Aguas Continentales del Perú"]

    MAR_PERU --> LIMS["Límites y Soberanía:<br/>Decreto 781 (1947), 200 Millas, Fallo de La Haya (2014)"]
    MAR_PERU --> SECT["Sectores Marinos:<br/>Norte (Cálido, Ecuatorial) y Centro-Sur (Frío, Humboldt)"]
    MAR_PERU --> AFLOR["Fenómeno de Afloramiento (Upwelling):<br/>Alisios SE, Coriolis, Transporte de Ekman, Nutrientes"]
    MAR_PERU --> CORR["Sistema de Corrientes:<br/>Corriente Peruana (Humboldt), Corriente de El Niño, Cromwell"]

    AGUAS_CONT --> VERT_PAC["Vertiente del Pacífico (Costa):<br/>Exorreica, 53 ríos, régimen irregular, torrentosos, hidroeléctricas e irrigaciones"]
    AGUAS_CONT --> VERT_AMZ["Vertiente del Amazonas (Atlántico):<br/>Exorreica, caudalosa, régimen regular, navegable, pongos, origen del río Amazonas"]
    AGUAS_CONT --> VERT_TIT["Vertiente del Titicaca:<br/>Endorreica, radial, corta longitud, efluente: río Desaguadero"]
    AGUAS_CONT --> LAGOS["Lagos y Glaciares:<br/>Titicaca, Chinchaycocha, Cordillera Blanca"]
```

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1. La Hidrósfera y el Ciclo Hidrológico

La **hidrósfera** es el subsistema acuático del geosistema, cubriendo aproximadamente el **71\% de la superficie terrestre** (\approx 361\text{ millones de km}^2).
* **Distribución Planetaria del Agua:**
  * **Agua Salada (Océanos y Mares):** **97.2\%** del volumen total (Océano Pacífico 46\%, Atlántico 23\%, Índico 20\%, Antártico y Ártico).
  * **Agua Dulce:** Apenas el **2.8\%**:
    * *Casquetes polares y glaciares (Criósfera):* 2.15\% (más del 75\% del agua dulce líquida potencial).
    * *Aguas subterráneas (Acuíferos y napas freáticas):* 0.62\%.
    * *Lagos y embalses:* 0.009\%.
    * *Humedad del suelo:* 0.005\%.
    * *Vapor atmosférico:* 0.001\%.
    * *Ríos y arroyos superficiales:* Solo el **0.0001\%**.
* **El Ciclo Hidrológico:** Circulación cerrada y continua de agua impulsada por la energía solar y la gravedad a través de cinco etapas fundamentales: **Evaporación** (y evapotranspiración vegetal) \to **Condensación** (formación de nubes) \to **Precipitación** (lluvia, nieve, granizo) \to **Infiltración** (alimentación freática) \to **Escorrentía** superficial y subterránea hacia mares y lagos.

---



### 3.3. Aguas Continentales del Perú: Las Tres Vertientes Hidrográficas

El relieve andino divide al territorio peruano en tres macrovertientes hidrográficas con características físicas y regímenes marcadamente contrastantes:

```
                      CORDILLERA DE LOS ANDES
                             /\
   Vertiente del            /  \               Vertiente del
     PACÍFICO              /    \                AMAZONAS
  (53 ríos cortos,        /      \         (Caudalosos, navegables,
 torrentosos, estiaje)   /        \        meándricos, rampa oriental)
      ←                 /          \                  →
   Océano Pacífico     /   Lago     \         Océano Atlántico
                      /  Titicaca    \
                     /  (Endorreico)  \
```

---

#### A. Vertiente Hidrográfica del Pacífico (Cuenca Occidental)
* **Generalidades:**
  * Compuesta por **53 ríos principales** que nacen en la vertiente occidental andina y desembocan en el Océano Pacífico.
  * Ocupa el **21.7\% del territorio nacional**, alberga a más del **65\% de la población del país**, pero solo dispone del **1.8\% de los recursos hídricos superficiales**.
* **Características Hidrológicas:**
  * **Cuencas Exorreicas:** Desembocan en el mar (algunos ríos sufren arreísmo en épocas de estiaje severo por infiltración y sobreexplotación agrícola, como el río Ica).
  * **Curso Corto y Pendiente Pronunciada:** Nacen a más de 4\,000 - 5\,000\text{ m s.n.m.} y recorren menos de 150 - 300\text{ km}; son ríos **torrentosos y de régimen juvenil erosionador** en su cuenca alta.
  * **Régimen Muy Irregular:** Caudal estacional marcado:
    * *Época de crecida (Avenidas):* Verano austral (enero a marzo), alimentados por lluvias andinas.
    * *Época de estiaje:* Invierno y primavera (mayo a noviembre), caudal mínimo o lechos secos.
  * **No navegables:** Salvo el **río Tumbes** en su tramo inferior (desembocadura en delta con manglares).
* **Ríos Notables de la Vertiente del Pacífico:**
  * **Río Santa (Áncash):** El de **mayor caudal anual constante** de la costa; recorre de sur a norte el Callejón de Huaylas entre la Cordillera Blanca y Negra, atraviesa el Cañón del Pato y abastece los proyectos de irrigación **Chavimochic** y **Chinecas**, además de la central hidroeléctrica del Cañón del Pato.
  * **Río Rímac (Lima):** El más urbanizado, más contaminado y el que cuenta con **mayor número de centrales hidroeléctricas escalonadas** (Huinco, Pablo Boner, Moyopampa, Huampaní).
  * **Río Majes-Camaná (Arequipa):** Posee la **mayor longitud** de la vertiente del Pacífico (\approx 388\text{ km}, naciendo como Colca). Sus aguas son trasvasadas en el colosal proyecto agroindustrial **Majes-Siguas**.
  * **Río Tambo (Arequipa-Moquegua):** Posee la **cuenca hidrográfica más extensa** de la costa (> 13\,000\text{ km}^2).
  * **Río Chira (Piura):** El de caudal más regular de la costa norte; abastece a la represa de Poechos (el reservorio de mayor capacidad del país).
  * **Río La Leche (Lambayeque):** El río menos caudaloso y más seco en estiaje.
  * **Río Caplina (Tacna):** El río más meridional del Perú, abastece a la ciudad heroica de Tacna.

---

#### B. Vertiente Hidrográfica del Amazonas (Cuenca del Atlántico)
* **Generalidades:**
  * Abarca el **74.5\% del territorio peruano** y genera el **97.7\% del agua dulce superficial** del país, albergando a menos del 30\% de la población.
  * Todos sus ríos son tributarios directos o indirectos del gran **río Amazonas**, que desagua en el Océano Atlántico.
* **Características Hidrológicas:**
  * **Cuencas Exorreicas de Escala Continental.**
  * **Ríos de Gran Longitud y Enorme Caudal:** Alimentados por lluvias tropicales perennes y deshielos glaciares andinos.
  * **Régimen Regular:** Mantienen un caudal abundante todo el año, aunque presentan épocas de vaciante (junio-setiembre) y creciente (diciembre-abril).
  * **Ríos Navegables:** En su curso medio e inferior en la Selva Baja, formando amplios **meandros**, islas fluviales, *tahuampas* y lagunas de herradura o *cochas*.
  * **Gran Potencial Hidroeléctrico en la Rampa Andina:** En su curso superior cortan las cordilleras formando cañones estrechos y profundos llamados **pongos**.
* **Ríos Notables de la Vertiente Amazónica:**
  * **Río Amazonas:** El río **más largo, ancho, profundo y caudaloso del planeta Tierra** (L \approx 6\,800\text{ km}; caudal medio de descarga \approx 219\,000\text{ m}^3\text{/s}).
    * *Nacimiento geográfico comprobado:* Nace en el departamento de **Arequipa**, en la provincia de Caylloma, en la quebrada Apacheta al pie del **Nevado Quehuisha/Mismi** a 5\,597\text{ m s.n.m.}, con el nombre de riachuelo Carhuasanta \to Lloqueta \to Challamayo \to Hornillos \to Monigote \to **Río Apurímac** \to Ene \to Tambo \to **Ucayali**, el cual al confluir con el **río Marañón** en Nauta (Loreto) forma formalmente el **Río Amazonas**.
  * **Río Ucayali:** El **río más largo del territorio peruano** (1\,771\text{ km} dentro del Perú).
  * **Río Marañón:** El río de **mayor potencial hidroeléctrico** del país; erosiona la cadena central y oriental formando célebres pongos como **Manseriche** y **Rentema**.
  * **Río Huallaga:** Forma el valle longitudinal más extenso del país (selva alta) y erosiona la cordillera en el **Pongo de Aguirre**.
  * **Río Mantaro:** Cruza el valle del Mantaro (Junín y Huancavelica); forma la península de Tayacaja donde opera el **Complejo Hidroeléctrico Santiago Antúnez de Mayolo - Restitución**, que genera cerca del 20\% de la energía eléctrica del Perú.
  * **Río Urubamba:** Riega el Valle Sagrado de los Incas en Cusco, pasa al pie de Machu Picchu y corta la cordillera oriental en el histórico **Pongo de Mainique**, ingresando a la zona gasífera de Camisea.

---

#### C. Vertiente Hidrográfica del Titicaca (Hoya del Altiplano)
* **Generalidades:**
  * Abarca el **3.8\% del territorio nacional** y concentra el **0.5\% del volumen hídrico**. Se emplaza en la Meseta del Collao (Puno) a más de 3\,812\text{ m s.n.m.}
* **Características Hidrológicas:**
  * **Cuenca Endorreica y Cerrada:** Sus ríos no tienen salida al océano; nacen en las cumbres de la Cordillera Volcánica (al oeste) y la Cordillera de Carabaya (al norte y este), convergiendo de forma **radial y centrípeta** hacia el **Lago Titicaca**.
  * **Ríos de Corto Recorrido y Poco Caudal.**
  * **Régimen Irregular:** Torrenciales en verano (enero-marzo) y con marcado estiaje en invierno.
  * **No navegables:** Aguas frías de altura.
* **Ríos Notables de la Cuenca del Titicaca:**
  * **Río Ramis:** El **más largo, extenso y caudaloso** de la vertiente (formado por la unión del Ayaviri y el Azángaro).
  * **Río Coata:** Formado por el río Cabanillas y Lampa; atraviesa la ciudad de Juliaca y sufre severos problemas de contaminación por efluentes urbanos.
  * **Río Ilave:** Segundo más largo; cuenca agrícola y ganadera tradicional.
  * **Río Huancané:** Desemboca en el extremo norte del lago.
  * **Río Suches:** Nace en la laguna de Suches y actúa como límite fronterizo natural entre Perú y Bolivia.
  * **Río Desaguadero:** Es el **único efluente (desagüe) del Lago Titicaca**; transporta una fracción de sus aguas superficiales hacia el lago Poopó en territorio boliviano.

---



### 3.4. Lagos y Glaciares del Perú

* **Lago Titicaca:** Es el **lago navegable más alto del mundo** (3\,812\text{ m s.n.m.}) y el más extenso de Sudamérica en agua dulce (8\,372\text{ km}^2, correspondiendo al Perú el 56\%). Es de origen **tectónico** (fosa tectónica o graben). Actúa como un colosal **termorregulador ambiental**, haciendo habitable y fértil el gélido Altiplano puneño.
* **Lago Junín o Chinchaycocha:** Segundo lago más extenso del Perú (530\text{ km}^2, a 4\,080\text{ m s.n.m.}); en él nace el río Mantaro.
* **Glaciares Andinos:** El Perú concentra más del **70\% de los glaciares tropicales del mundo**, destacando la **Cordillera Blanca** (nevado Huascarán, 6\,768\text{ m s.n.m.}), pero enfrenta una acelerada crisis de desglaciación por el cambio climático.

---



## 4. FORMULARIO MAESTRO / CUADRO SINÓPTICO



### Cuadro Comparativo de las Tres Vertientes Hidrográficas del Perú

| Parámetro | Vertiente del Pacífico | Vertiente del Amazonas | Vertiente del Titicaca |
| :--- | :--- | :--- | :--- |
| **Tipo de Cuenca** | **Exorreica** (algunos ríos sufren arreísmo temporal) | **Exorreica** (drenaje macrocontinental) | **Endorreica** (centrípeta cerrada) |
| **Desembocadura** | Océano Pacífico | Río Amazonas \to Océano Atlántico | Lago Titicaca |
| **Porcentaje de Agua** | **1.8\%** | **97.7\%** | **0.5\%** |
| **Población Servida** | \approx 65\% (estrés hídrico extremo) | \approx 30\% | \approx 5\% |
| **Régimen Fluvial** | Muy irregular (estiaje prolongado) | Regular (abundante todo el año) | Irregular (crecida en verano) |
| **Longitud y Curso** | Cortos, torrentosos, pendientes empinadas | Muy largos, caudalosos, meándricos | Cortos, radiales, baja pendiente |
| **Navegabilidad** | No navegables (salvo río Tumbes) | **Ampliamente navegables** | No navegables |
| **Río Más Caudaloso** | **Río Santa** | **Río Amazonas** | **Río Ramis** |
| **Río Más Largo** | **Río Majes-Camaná** (388\text{ km}) | **Río Ucayali** (1\,771\text{ km}) | **Río Ramis** (320\text{ km}) |
| **Mayor Hidroeléctrica** | Rímac (Huinco) / Santa (Cañón del Pato) | **Río Mantaro** (Santiago Antúnez de Mayolo) | Ninguna de gran envergadura |

---



### Mnemotecnia 1: Los Principales Ríos Afluentes del Lago Titicaca
**"RAM-I-CO-HU-SU"**
* **RAM** \rightarrow **RAM**is (el más largo y caudaloso)
* **I** \rightarrow **I**lave
* **CO** \rightarrow **CO**ata
* **HU** \rightarrow **HU**ancané
* **SU** \rightarrow **SU**ches (fronterizo)
* *(Y el efluente que desagua es el **Desaguadero**)*.



### Mnemotecnia 2: Nacimiento Extremo del Amazonas
**"MISMI-CAR-LLO-APU-UCA"**
* Nevado **MISMI** (Apacheta) \to Riachuelo **CAR**huasanta \to **LLO**queta \to **APU**rímac \to **UCA**yali (+ Marañón = Amazonas).

---



## 6. TÉCNICAS Y ARTIFICIOS DE RESOLUCIÓN (HACKING PREUNIVERSITARIO)

1. **Diferenciación Rápida de Vertientes en Enunciados:**
   * Si el enunciado menciona: *valle costero, represa para irrigación agroexportadora, déficit hídrico poblacional, Huinco, Chavimochic* \to Marca **Vertiente del Pacífico**.
   * Si menciona: *pongo, meandro, puerto fluvial, cochas, gas de Camisea, Santiago Antúnez de Mayolo* \to Marca **Vertiente del Amazonas**.
   * Si menciona: *cuenca endorreica, altiplano, radial, Lago Poopó, Desaguadero, río Ramis* \to Marca **Vertiente del Titicaca**.
2. **El "Río más..." en Admisión UNSA / UNMSM:**
   * ¿Río más largo del Perú? \to **Ucayali** (1\,771\text{ km}).
   * ¿Río más caudaloso de la costa? \to **Santa**.
   * ¿Río con mayor potencial hidroeléctrico? \to **Marañón**.
   * ¿Río con mayor producción hidroeléctrica activa? \to **Mantaro**.
   * ¿Único efluente del Titicaca? \to **Desaguadero**.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

* ⚠️ **Trampa 1: El río Amazonas no nace en Iquitos ni en Marañón:**
  * Geográficamente y por hidrometría satelital, nace en el **Nevado Quehuisha/Mismi (Arequipa)** a través del río Carhuasanta/Apurímac.
  * La confluencia del Marañón con el Ucayali es solo donde adopta formalmente el nombre de río Amazonas (cerca de Nauta, Loreto).
* ⚠️ **Trampa 2: El Titicaca no es el único lago del Perú:**
  * El lago Junín (Chinchaycocha) es el segundo más grande del Perú y es enteramente peruano (el Titicaca es binacional).
* ⚠️ **Trampa 3: Los ríos de la costa no son navegables:**
  * Salvo el río Tumbes en su desembocadura, ningún río de la costa peruana es navegable por su régimen torrencial y escaso calado en estiaje.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO



### Caso de Estudio DECO: El Proyecto Especial de Irrigación e Hidroenergético Majes-Siguas
En el sur del Perú (Arequipa), la vertiente del Pacífico padece un agudo déficit de recursos hídricos superficiales en comparación con la alta fertilidad de sus pampas desérticas:
1. **La Solución Geográfica del Trasvase:** El proyecto Majes-Siguas capta aguas de la cuenca alta del río Colca y del río Apurímac (represas de Condoroma y Angostura), trasvasándolas a través de túneles y canales cordilleranos hacia las cuencas de los ríos Siguas y Quilca.
2. **Impacto Geoeconómico:** Transforma más de 38\,000\text{ hectáreas} de desierto estéril en emporios agroexportadores de uva, palta y alcachofa, al tiempo que genera energía hidroeléctrica en las centrales de Lluta y Lluclla, evidenciando el dominio y modificación antrópica del espacio geográfico andino.

---



### Ejercicio 2 (Nivel 2 - Intermedio UNSA Ordinario: Vertiente del Pacífico)
**Enunciado:**
En la vertiente hidrográfica del Pacífico peruano, el río que destaca por poseer el régimen más regular y el mayor caudal medio anual de la costa, recorriendo de sur a norte el Callejón de Huaylas antes de quebrar la Cordillera Negra para desembocar en el mar, es el río:
* A) Rímac
* B) Santa
* C) Chira
* D) Majes
* E) Tumbes

**Solución Paso a Paso:**
1. El río que drena el Callejón de Huaylas entre la Cordillera Blanca y Negra en Áncash es el **río Santa**.
2. Posee el mayor caudal medio anual de toda la vertiente occidental peruana debido a los deshielos continuos de la Cordillera Blanca, abasteciendo a los valles agroindustriales de Chavimochic y Chinecas.
* **Respuesta Correcta:** **B**

---



### Ejercicio 3 (Nivel 3 - Avanzado UNMSM DECO: Vertiente del Amazonas y Pongos)
**Enunciado:**
Los ríos de la vertiente del Amazonas presentan una rampa andina de alta pendiente donde erosionan cadenas montañosas formando cañones estrechos y profundos conocidos como pongos, idóneos para el emplazamiento de presas hidroeléctricas. En este contexto, el río de mayor potencial hidroeléctrico del Perú que atraviesa la cordillera formando los célebres pongos de Rentema y Manseriche es el río:
* A) Ucayali
* B) Huallaga
* C) Marañón
* D) Urubamba
* E) Mantaro

**Solución Paso a Paso:**
1. El río Marañón es el tributario andino más importante que recorre las cadenas montañosas del norte peruano.
2. Al cortar la Cordillera Oriental y Central antes de unirse al Ucayali, modela los colosales pongos de **Rentema** y **Manseriche**, albergando el mayor potencial de generación hidroeléctrica del territorio nacional.
* **Respuesta Correcta:** **C**

---



### Ejercicio 4 (Nivel 4 - Crítico / Interdisciplinario UNI: Hoya del Lago Titicaca)
**Enunciado:**
La vertiente hidrográfica del Titicaca constituye una cuenca endorreica cerrada de carácter centrípeto ubicada en la meseta del Collao. Al analizar la dinámica hidrológica de sus tributarios y efluentes, indique la afirmación correcta:
* A) El río Ramis es el más largo y caudaloso de la vertiente y desagua en el Océano Atlántico.
* B) El río Desaguadero es el único efluente natural que drena las aguas superficiales del Titicaca hacia el lago Poopó.
* C) Todos los ríos del Altiplano son plenamente navegables durante los doce meses del año.
* D) El río Suches delimita la frontera internacional natural entre el Perú y la República de Chile.
* E) La cuenca concentra más del 50\% de los recursos hídricos superficiales de todo el Perú.

**Solución Paso a Paso:**
1. Analizamos las opciones:
   * A es falsa: el Ramis desagua en el lago Titicaca, no en el Atlántico.
   * B es **verdadera**: el río Desaguadero es el **único efluente (río de desagüe)** del Titicaca y conduce caudales excedentes hacia el lago Poopó en Bolivia.
   * C es falsa: son ríos de poco calado, pedregosos y torrenciales, no navegables.
   * D es falsa: el Suches delimita frontera con Bolivia, no con Chile.
   * E es falsa: solo concentra el 0.5\% del agua del país.
* **Respuesta Correcta:** **B**

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Afloramiento:** Proceso oceanográfico de ascenso de aguas profundas gélidas y ricas en sales minerales hacia la zona fótica marina.
2. **Transporte de Ekman:** Movimiento neto del agua oceánica a 90^\circ de la dirección del viento debido al equilibrio entre la fuerza del viento y la aceleración de Coriolis.
3. **Cuenca Exorreica:** Sistema de drenaje hidrográfico cuyas aguas superficiales alcanzan y desembocan en el mar u océano abierto.
4. **Cuenca Endorreica:** Sistema hidrográfico cerrado cuyas aguas no llegan al mar, vertiéndose en lagos interiores o evaporándose en salares.
5. **Estiaje:** Periodo anual en el cual un río alcanza su caudal más bajo debido a la escasez estacional de precipitaciones en su cuenca.
6. **Pongo:** Cañón fluvial estrecho y profundo labrado por un río al atravesar una cordillera andina en la vertiente amazónica.
7. **Efluente:** Río o arroyo que nace de un lago o cuerpo de agua y desagua parte de su volumen hacia el exterior (e.g., río Desaguadero).
8. **Fitoplancton:** Conjunto de organismos vegetales microscópicos fotosintéticos que flotan en la zona fótica marina, base primaria de la red trófica.
9. **Zona Fótica:** Capa superior iluminada de las aguas marinas (hasta \approx 100 - 200\text{ m} de profundidad) donde es posible la fotosíntesis.
10. **Meandro:** Curva pronunciada y sinuosa descrita por el curso de un río en llanuras aluviales de escasa pendiente.

---



## 11. BANCO DE FLASHCARDS (Q/A)

* **PREGUNTA:** ¿Qué porcentaje del agua total del planeta corresponde a agua dulce y dónde se concentra su mayor volumen?
  * **RESPUESTA:** Representa el 2.8\%, y más del 75\% de ella se encuentra congelada en los glaciares y casquetes polares (criósfera).
* **PREGUNTA:** ¿Qué presidente peruano proclamó las 200 millas marinas en 1947 y mediante qué norma?
  * **RESPUESTA:** José Luis Bustamante y Rivero, mediante el Decreto Supremo N.° 781 del 1 de agosto de 1947.
* **PREGUNTA:** ¿Cuáles son las dos causas físicas fundamentales del fenómeno de afloramiento en el mar peruano?
  * **RESPUESTA:** Los vientos alisios del sureste y el Efecto Coriolis que produce el Transporte de Ekman mar adentro.
* **PREGUNTA:** ¿Cuál es la diferencia de temperatura y salinidad entre el sector norte y centro-sur del Mar Peruano?
  * **RESPUESTA:** El sector norte es cálido (> 21^\circ\text{C}) y de baja salinidad; el centro-sur es frío (13^\circ\text{C}-17^\circ\text{C}) y de alta salinidad.
* **PREGUNTA:** ¿Por qué la vertiente hidrográfica del Pacífico padece estrés hídrico si alberga al 65\% de la población peruana?
  * **RESPUESTA:** Porque solo dispone del 1.8\% de los recursos de agua dulce superficial del país.
* **PREGUNTA:** ¿Cuál es el río más caudaloso de la costa peruana y qué proyectos de irrigación abastece?
  * **RESPUESTA:** El río Santa; abastece a los proyectos Chavimochic y Chinecas.
* **PREGUNTA:** ¿Dónde nace científicamente el río Amazonas y qué nombres sucesivos adopta?
  * **RESPUESTA:** En el Nevado Quehuisha/Mismi (Arequipa) como Carhuasanta \to Lloqueta \to Apurímac \to Ene \to Tambo \to Ucayali (que al unirse al Marañón forma el Amazonas).
* **PREGUNTA:** ¿Cuál es el río más largo dentro del territorio peruano?
  * **RESPUESTA:** El río Ucayali (1\,771\text{ km}).
* **PREGUNTA:** ¿Cuál es el río más caudaloso que alimenta al lago Titicaca y cuál es su único río efluente?
  * **RESPUESTA:** El río Ramis es el más caudaloso que lo alimenta; el río Desaguadero es su único efluente de salida.
* **PREGUNTA:** ¿Qué resolvió la Corte de La Haya en 2014 sobre el límite marítimo entre Perú y Chile?
  * **RESPUESTA:** Mantuvo el paralelo del Hito N.° 1 hasta la milla 80 y trazó una línea equidistante suroeste hasta la milla 200, otorgando a Perú más de 50\,000\text{ km}^2 de mar.

---



### 3.2. El Mar Peruano (Mar de Grau)

Es la porción del Océano Pacífico adyacente a las costas del Perú sobre la cual el Estado ejerce soberanía y jurisdicción bioceánica.
* **Marco Jurídico e Histórico:**
  * **Decreto Supremo N.° 781 (1 de agosto de 1947):** Promulgado por el presidente **José Luis Bustamante y Rivero**, proclamó la soberanía y jurisdicción del Perú sobre la plataforma submarina y el mar adyacente hasta una distancia de **200 millas marinas** (370.4\text{ km}), sentando las bases de la doctrina marítima internacional del Derecho del Mar.
  * **Fallo de la Corte Internacional de Justicia de La Haya (27 de enero de 2014):** Resolvió la controversia de delimitación marítima con Chile. Ratificó el paralelo del Hito N.° 1 hasta las **80\text{ millas náuticas}**, a partir de la cual trazó una línea equidistante en dirección suroeste hasta las 200 millas, reconociendo para el Perú más de **50\,000\text{ km}^2 de dominio marítimo** exclusivo.

#### A. Dimensiones y Sectores del Mar Peruano
* **Límites:**
  * *Norte:* Paralelo de Boca de Capones (03^\circ 23' 33.96''\text{ S}, frontera con Ecuador).
  * *Sur:* Punto "Concordia" / Paralelo del Hito N.° 1 (18^\circ 21' 08''\text{ S}, frontera con Chile).
  * *Oeste:* Línea imaginaria a 200 millas marinas mar adentro.
* **División en Dos Sectores Oceanográficos:**

| Parámetro | Sector Norte (Mar Ecuatorial o Tropical) | Sector Centro-Sur (Mar Frío de la Corriente Peruana) |
| :--- | :--- | :--- |
| **Ubicación Geográfica** | Desde Boca de Capones (Tumbes) hasta la Península de Illescas (Piura, 05^\circ\text{ S}). | Desde la Península de Illescas hasta la frontera con Chile (18^\circ 21'\text{ S}). |
| **Temperatura del Agua** | **Cálida:** 21^\circ\text{C} a 24^\circ\text{C} (e incluso 28^\circ\text{C} en verano). | **Fría:** 13^\circ\text{C} a 17^\circ\text{C} (anomalía térmica de -6^\circ\text{C} a -8^\circ\text{C}). |
| **Salinidad** | **Baja:** Menor a 34.5\text{ g/kg} (por dilución de lluvias y ríos ecuatoriales). | **Alta:** 34.8 a 35.2\text{ g/kg} (escasa dilución y alta evaporación neta). |
| **Coloración del Agua** | Azulina y cristalina (baja densidad de fitoplancton). | **Verdosa** (alta concentración de clorofila y fitoplancton microscópico). |
| **Ecosistemas y Fauna** | Manglares de Tumbes, cocodrilo americano, conchas negras, langostinos, perico, pez vela, marlines, atún. | **Gran biomasa pelágica:** Anchoveta (*Engraulis ringens*), sardina, jurel, caballa, lobos marinos y aves guaneras (guanay, piquero, pelícano). |

---

#### B. El Fenómeno de Afloramiento (Upwelling)
Es el proceso oceanográfico mediante el cual **aguas subsuperficiales frías, densas y cargadas de nutrientes inorgánicos (nitratos, fosfatos y silicatos) ascienden hacia la superficie marina iluminada (zona fótica)**.
* **Causas Físicas del Afloramiento:**
  1. **Vientos Alisios del Sureste:** Soplan en forma paralela y oblicua a la línea de costa peruana.
  2. **Efecto Coriolis y Transporte de Ekman:** La rotación terrestre desvía las aguas superficiales hacia la izquierda en el hemisferio sur (mar adentro), creando un vacío hidráulico superficial.
  3. **Ascenso de Reemplazo:** Para compensar el agua superficial empujada mar adentro, ascienden masas de agua fría del fondo del talud continental.
* **¿Por qué el Mar Peruano es uno de los más ricos del planeta?**
  1. **Afloramiento constante:** Suministra "abono mineral" ininterrumpido.
  2. **Alta radiación solar en baja latitud:** Permite una fotosíntesis acelerada del fitoplancton (diatomeas microscópicas).
  3. **Presencia de la Corriente de Humboldt:** Mantiene temperaturas frías que retienen mayor oxígeno disuelto (O_2).
  4. **Amplitud del zócalo continental:** Facilita la penetración de la luz solar hasta el lecho marino en la costa central.

---



### Ejercicio 5 (Nivel 5 - Boss Challenge: Geopolítica Marítima y Fallo de La Haya)
**Enunciado:**
Lea con atención el siguiente fragmento del fallo de la Corte Internacional de Justicia de La Haya dictado el 27 de enero de 2014 en la controversia marítima Perú contra Chile:
*"La Corte dictamina por quince votos a uno que el punto de inicio de la frontera marítima se sitúa en la intersección del paralelo de latitud del Hito N.° 1 con la línea de baja marea. Asimismo, concluye que dicho acuerdo tácito de delimitación marítima paralela se extiende únicamente hasta una distancia de 80 millas náuticas mar adentro. A partir de dicho punto de las 80 millas, la delimitación continuará a lo largo de una línea equidistante hasta alcanzar el punto donde convergen las 200 millas marinas medidas desde las costas de ambas naciones".*

De acuerdo con el análisis jurídico-geográfico del fallo y la soberanía del Mar de Grau, es correcto inferir que:
I. El Perú obtuvo derechos soberanos y exclusivos sobre una zona marítima de más de 50\,000\text{ km}^2 previamente bajo control fáctico chileno.  
II. El fallo eliminó de forma absoluta el zócalo continental peruano en el departamento de Tacna.  
III. La sentencia reconoció el argumento peruano de que los acuerdos pesqueros de 1952 y 1954 no constituían tratados generales de límites definitivos hasta las 200 millas.  
IV. La línea equidistante fijada a partir de la milla 80 favoreció a Chile al otorgarle aguas históricas peruanas frente al litoral de Ilo.

* A) I y III
* B) II y IV
* C) I, II y III
* D) Solo I
* E) I, III y IV

**Solución Paso a Paso:**
1. **Evaluación de I:** Con el trazado de la línea equidistante desde la milla 80 y la incorporación del triángulo exterior, el Perú incorporó formalmente a su dominio marítimo soberano aproximadamente **50\,354\text{ km}^2** de mar territorial y recursos pesqueros. (Verdadero).
2. **Evaluación de II:** El zócalo continental sigue existiendo bajo la jurisdicción de la plataforma marina peruana; no fue eliminado de ninguna manera. (Falso).
3. **Evaluación de III:** La Corte aceptó la tesis peruana de que las Declaraciones de Santiago (1952) y el Convenio de 1954 eran acuerdos pesqueros y que no existía un tratado de límites que llegara hasta las 200 millas, fijando un límite tácito solo hasta las 80 millas. (Verdadero).
4. **Evaluación de IV:** La línea equidistante a partir de la milla 80 benefició al Perú, devolviéndole un extenso sector marítimo en el sur. (Falso).
* Conclusión: Son correctas I y III.
* **Respuesta Correcta:** **A**

---



### Ejercicio 1 (Nivel 1 - Básico Formativo: Mar Peruano y Afloramiento)
**Enunciado:**
El fenómeno oceanográfico que consiste en el ascenso de masas de agua subsuperficiales frías y densas cargadas de sales minerales (fosfatos y nitratos) hacia la superficie del Mar Peruano, constituyendo el factor fundamental de la descomunal riqueza ictiológica de la Corriente de Humboldt, se denomina:
* A) Inversión térmica
* B) Fenómeno de El Niño
* C) Afloramiento o Upwelling
* D) Transporte de Coriolis
* E) Tsunami tectónico

**Solución Paso a Paso:**
1. El ascenso de aguas profundas impulsado por los vientos alisios del sureste y la fuerza de Coriolis se conoce científicamente como **afloramiento** (o *upwelling* en inglés).
2. Este fenómeno abona con sales nutrientes la zona fótica marina, detonando la floración del fitoplancton que alimenta a la inmensa biomasa de anchoveta del mar peruano.
* **Respuesta Correcta:** **C**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geo_t06_s02_c01",
                    question = "En la hidrografía del Perú, el territorio nacional se divide en tres grandes vertientes hidrográficas continentales denominadas:",
                    options = listOf(
                        "Vertiente del Atlántico, del Índico y del Ártico.",
                        "Cuenca del Mantaro, Cuenca del Santa y Cuenca del Rímac.",
                        "Vertiente Septentrional, Central y Meridional.",
                        "Vertiente del Pacífico, Vertiente del Amazonas (Atlántico) y Hoya Hidrográfica del Titicaca.",
                    ),
                    correctIndex = 3,
                    explanation = "La divisoria de aguas de la Cordillera de los Andes estructura tres cuencas macrosistémicas: la vertiente del Pacífico (exorreica occidental), del Amazonas (exorreica oriental) y del Titicaca (endorreica)."
                ),
                Challenge(
                    id = "geo_t06_s02_c02",
                    question = "Los 53 ríos de la Vertiente Hidrográfica del Pacífico se caracterizan geomorfológicamente por ser:",
                    options = listOf(
                        "Caudalosos todo el año, de régimen regular y plenamente navegables en buques de alto calado.",
                        "Ríos endorreicos que nunca desembocan en el océano.",
                        "De curso corto, pendiente abrupta, torrentosos, régimen irregular y no navegables (excepto el río Tumbes en su desembocadura).",
                        "Nacientes exclusivas de la selva baja amazónica.",
                    ),
                    correctIndex = 2,
                    explanation = "Los ríos costeños bajan de los flancos occidentales andinos con enorme declive hacia el mar en trayectos breves (menos de 200 km en promedio), con crecidas en verano y estiaje severo en invierno."
                ),
                Challenge(
                    id = "geo_t06_s02_c03",
                    question = "¿Cuál es el río más largo y caudaloso de la vertiente del Pacífico peruano que rompe la cordillera Negra en el cañón del Pato y posee régimen mixto?",
                    options = listOf(
                        "Río Rímac",
                        "Río Chira",
                        "Río Santa",
                        "Río Majes-Camaná",
                    ),
                    correctIndex = 2,
                    explanation = "El río Santa (en Áncash) discurre longitudinalmente por el Callejón de Huaylas y corta la Cordillera Negra; es el más caudaloso y regular de la costa gracias al deshielo de la Cordillera Blanca."
                ),
                Challenge(
                    id = "geo_t06_s02_c04",
                    question = "La naciente remota más lejana del río Amazonas fue identificada científicamente en territorio peruano en:",
                    options = listOf(
                        "El nudo de Vilcanota en el Cusco.",
                        "La laguna de Lauricocha en Huánuco.",
                        "El nevado Mismi (quebrada Apacheta, Arequipa) a través del río Carhuasanta/Lloqueta.",
                        "El lago Junín o Chinchaycocha.",
                    ),
                    correctIndex = 2,
                    explanation = "Expediciones geográficas como la de la National Geographic Society confirmaron que el origen más distante del Amazonas nace en el nevado Mismi en las nacientes del río Apurímac a 5597 m s.n.m."
                ),
                Challenge(
                    id = "geo_t06_s02_c05",
                    question = "El río Amazonas se forma formalmente en la confluencia de dos majestuosos ríos amazónicos peruanos:",
                    options = listOf(
                        "Huallaga y Urubamba",
                        "Ucayali y Marañón (cerca de Nauta, Loreto)",
                        "Madre de Dios y Tambopata",
                        "Mantaro y Apurímac",
                    ),
                    correctIndex = 1,
                    explanation = "El río Marañón y el río Ucayali confluyen cerca de la localidad de Nauta para dar origen al cauce principal del río Amazonas en suelo peruano."
                ),
                Challenge(
                    id = "geo_t06_s02_c06",
                    question = "La cuenca hidrográfica del Lago Titicaca es de tipo 'endorreico' porque:",
                    options = listOf(
                        "Está conectada por canales artificiales subterráneos con la Amazonía brasileña.",
                        "Sus aguas se evaporan antes de salir de las montañas y nunca forman cauces continuos.",
                        "Sus ríos desaguan directamente en el océano Pacífico a través de cañones profundos.",
                        "Sus ríos vierten sus aguas en un lago interior cerrado sin salida superficial directa hacia el océano.",
                    ),
                    correctIndex = 3,
                    explanation = "Una cuenca endorreica no tiene drenaje hacia el mar; los ríos del altiplano (Ramis, Coata, Ilave, Huancané) descargan en el lago Titicaca, cuyo único efluente es el río Desaguadero hacia el lago Poopó."
                ),
                Challenge(
                    id = "geo_t06_s02_c07",
                    question = "¿Cuál es el río más largo y caudaloso de la hoya del Titicaca, formado por la unión de los ríos Pucará y Azángaro?",
                    options = listOf(
                        "Río Desaguadero",
                        "Río Coata",
                        "Río Ilave",
                        "Río Ramis",
                    ),
                    correctIndex = 3,
                    explanation = "El río Ramis es el afluente más extenso (aprox. 300 km) y caudaloso del lago Titicaca, drenando las cordilleras de Carabaya y Vilcanota en el departamento de Puno."
                ),
                Challenge(
                    id = "geo_t06_s02_c08",
                    question = "El lago navegable más alto del mundo, que actúa como un extraordinario termorregulador climático en la meseta del Collao permitiendo la vida agrícola y humana, es el:",
                    options = listOf(
                        "Lago Baikal",
                        "Lago Titicaca (3812 m s.n.m.)",
                        "Lago Tanganica",
                        "Lago Chinchaycocha (Junín)",
                    ),
                    correctIndex = 1,
                    explanation = "El lago Titicaca modera las gélidas temperaturas nocturnas de la puna gracias al calor específico del agua acumulado durante el día, atenuando las heladas en sus riberas."
                ),
                Challenge(
                    id = "geo_t06_s02_c09",
                    question = "La central hidroeléctrica más potente del Perú ('Santiago Antúnez de Mayolo' y 'Restitución'), que genera gran parte de la electricidad nacional, aprovecha las aguas del río:",
                    options = listOf(
                        "Río Rímac",
                        "Río Mantaro (en Huancavelica, península de Tayacaja)",
                        "Río Urubamba",
                        "Río Cañete",
                    ),
                    correctIndex = 1,
                    explanation = "El complejo hidroeléctrico del Mantaro aprovecha la gran caída de agua de la curva del río Mantaro en Huancavelica, generando más de 1000 MW de potencia eléctrica."
                ),
                Challenge(
                    id = "geo_t06_s02_c10",
                    question = "¿Cuál es el segundo lago más extenso del Perú, ubicado en la meseta de Bombón y donde nace el río Mantaro?",
                    options = listOf(
                        "Laguna de Parinacochas",
                        "Lago Junín o Chinchaycocha",
                        "Laguna de Yarinacocha",
                        "Laguna de Llanganuco",
                    ),
                    correctIndex = 1,
                    explanation = "El lago Chinchaycocha (Junín) es el segundo lago más grande del país (más de 500 km²), hogar del zambullidor de Junín y origen de las aguas del río Mantaro."
                ),
            )
        )
    )
}
