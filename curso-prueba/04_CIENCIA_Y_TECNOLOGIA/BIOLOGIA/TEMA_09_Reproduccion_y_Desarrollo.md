# TEMA 09: REPRODUCCIÓN Y DESARROLLO

---

## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La reproducción asegura la autoperpetuación de las especies biológicas y la transmisión del material hereditario a través de las generaciones. Su base celular y molecular radica en el **ciclo celular**, un conjunto ordenado y estrictamente regulado de etapas que culmina en la formación de nuevas células viables:
1. **Ciclo Celular Eucariota:** Comprende la **Interfase** (fases $G_1$, $S$ y $G_2$) y la **División Celular** (Fase M), coordinadas mediante complejos enzimáticos de **Ciclinas y Quinasas Dependientes de Ciclinas (CDK)**, y supervisadas por **puntos de control** (G1/S, G2/M y Control del Huso en metafase/anafase) con participación central de proteínas supresoras de tumores como p53 y pRb.
2. **Mitosis vs. Meiosis:**
   - *Mitosis:* División ecuacional somática que preserva el número cromosómico ($2n \to 2n$ o $n \to n$), generando dos células hijas genéticamente idénticas.
   - *Meiosis:* División reduccional y ecuacional sucesiva ($2n \to 4n$ células haploides $n$) exclusiva de células de la línea germinal. Genera variabilidad genética mediante el **crossing-over** (recombinación homóloga en Paquiteno de Profase I) y la **segregación independiente** de cromosomas maternos y paternos en Anafase I.
3. **Modalidades Reproductivas:** Asexual (clonación mitótica: bipartición, gemación, esporulación, fragmentación y partenogénesis) y Sexual (anfimixis, singamia, fecundación y recombina genomas).
4. **Reproducción en Plantas con Flor (Angiospermas):** Verticilos florales (cáliz, corola, androceo, gineceo), micro y megaesporogénesis, polinización y la característica **doble fecundación** exclusiva de angiospermas (generando el cigoto $2n$ y el endospermo nutricio $3n$).
5. **Reproducción Humana y Desarrollo Embrionario:** Espermatogénesis y ovogénesis; fecundación en el tercio distal de la trompa de Falopio; etapas del desarrollo (segmentación a mórula, blastulación, gastrulación con especificación de ectodermo, mesodermo y endodermo, y organogénesis).

---

## 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. EL CICLO CELULAR Y SU CONTROL MOLECULAR

El ciclo celular es el periodo que abarca desde el nacimiento de una célula por división de una célula progenitora hasta que dicha célula se divide a su vez:
$$\text{Ciclo Celular} = \text{Interfase } (90-95\% \text{ del tiempo}) + \text{Fase M (División, } 5-10\%)$$

#### A. Fases de la Interfase
1. **Fase $G_1$ (Gap 1 o Primer Intervalo):**
   - Intensa actividad metabólica, transcripción masiva de ARN y traducción de proteínas enzimáticas y estructurales.
   - Duplicación de organelos citoplasmáticos y volumen celular.
   - Células que salen del ciclo ingresan a **$G_0$ o quiescencia** (ej. neuronas maduras, cardiomiocitos, hepatocitos en reposo).
2. **Fase $S$ (Síntesis):**
   - **Replicación semiconservativa del ADN nuclear:** Cada cromosoma simple pasa a estar constituido por dos cromátidas hermanas idénticas unidas por el centrómero (complejo de cohesinas).
   - Duplicación de las proteínas **histonas**.
   - Duplicación del par de **centriolos** (en células animales con centrosoma).
3. **Fase $G_2$ (Gap 2 o Segundo Intervalo):**
   - La célula posee el doble de ADN ($4c$, con $2n$ cromosomas dobles).
   - Síntesis de tubulina $\alpha$ y $\beta$ para el ensamblaje del huso acromático.
   - Fosforilación de histonas para iniciar la condensación de la cromatina. Comprobación y reparación de errores de replicación del ADN.

#### B. Sistema de Puntos de Control y Regulación Molecular
- **Motores del Ciclo:** Complejos de **Ciclinas** (proteínas reguladoras cuya concentración oscila cíclicamente) y **CDK (Cyclin-Dependent Kinases)**, quinasas que fosforilan sustratos diana para habilitar la transición de fase:
  - Complejo Ciclina D - CDK4/6: Progresión temprana en $G_1$.
  - Complejo Ciclina E - CDK2: Transición $G_1 \to S$.
  - Complejo Ciclina A - CDK2: Progresión en Fase $S$.
  - Complejo Ciclina B - CDK1 (antiguamente llamado **MPF**, Factor Promotor de la Maduración o Mitosis): Induce el ingreso a la Fase M.
- **Puntos de Control Fisiológicos:**
  1. *Punto de Control $G_1/S$ (Punto de Restricción o Start):* Evalúa integridad del ADN, masa celular y señales nutricionales. Si hay daño en el ADN, la proteína senescencia/quinasa ATM/ATR activa a **p53** (el "guardián del genoma"), que transcribe al inhibidor **p21** ($CIP1/WAF1$). La proteína p21 inhibe a Ciclina E-CDK2, manteniendo a la proteína del retinoblastoma (**pRb**) desfosforilada. pRb hipofosforilada secuestra al factor de transcripción **E2F**, bloqueando la replicación hasta que el ADN sea reparado; si el daño es irreparable, p53 activa la apoptosis celular (vía Bax/citocromo c).
  2. *Punto de Control $G_2/M$:* Verifica que la replicación del ADN se haya completado al $100\%$ sin errores. La fosfatasa **Cdc25** desfosforila residuos inhibitorios en CDK1, activando al MPF (Ciclina B - CDK1) para desencadenar el desensamblaje de la lámina nuclear y la condensación cromosómica.
  3. *Punto de Control del Huso (Metafase-Anafase o Checkpoint SAC):* Monitorea que todos los cinetocoros cromosómicos estén anclados bipolarmente a microtúbulos del huso con tensión simétrica. Si un cinetocoro está desanclado, el complejo Mad2/BubR1 inhibe a Cdc20. Cuando todos están correctamente alineados, Cdc20 activa al **Complejo Promotor de la Anafase (APC/C)**, que ubiquitina y destruye a la securina; esto libera a la enzima **separasa**, la cual cliva a las cohesinas centroméricas, permitiendo la disyunción anafásica.

---

### 2.2. MITOSIS Y MEIOSIS

#### A. Mitosis (Cariocinesis Ecuacional)
Ocurre en células somáticas eucariotas. Consta de cuatro fases sucesivas:
1. **Profase:** Condensación progresiva de la cromatina en cromosomas visibles de dos cromátidas. Migración de los centrosomas hacia polos opuestos guiados por microtúbulos polares. Desaparición del nucléolo. Ruptura y desensamblaje de la envoltura nuclear (carioteca) mediante fosforilación de láminas nucleares tipo A, B y C por CDK1. Los microtúbulos cinetocóricos capturan a los cromosomas en la prometafase.
2. **Metafase:** Grado máximo de condensación cromosómica. Los cromosomas se alinean de forma individual e independiente en el plano ecuatorial celular formando la **placa metafásica o ecuatorial**.
3. **Anafase:** Ruptura proteolítica de las cohesinas centroméricas por acción de la separasa. **Disyunción de cromátidas hermanas**, las cuales son traccionadas hacia los polos celulares opuestos mediante acortamiento de microtúbulos cinetocóricos (despolimerización de tubulina impulsada por cinesinas y dineínas). Cada cromátida pasa a considerarse un cromosoma hijo simple independiente.
4. **Telofase:** Los cromosomas hijos alcanzan los polos y se descondensan en cromatina laxa. Desensamblaje del huso mitótico. Reconstitución de la carioteca a partir del retículo endoplásmico rugoso. Reaparición de los nucléolos.
- **Citocinesis (División del Citoplasma):**
  - *Célula Animal:* Estrangulamiento centrípeto (de afuera hacia adentro) mediado por un **anillo contráctil de actina y miosina II**.
  - *Célula Vegetal:* Formación centrífuga (de adentro hacia afuera) de la placa celular o **fragmoplasto**, formado por vesículas secretadas por el complejo de Golgi cargadas de pectina y hemicelulosa, que originan la lámina media y la nueva pared celular primaria.

#### B. Meiosis (División Reduccional y Ecuacional)
Consiste en dos divisiones nucleares consecutivas con una única replicación previa del ADN:

##### 1. Meiosis I (División Reduccional: $2n \to n$)
- **Profase I (Subetapas en orden estricto):**
  1. *Leptoteno:* Condensación de la cromatina; cromosomas delgados con engrosamientos en forma de cuentas denominados **cromómeros**. Polarización en bouquet hacia el centrosoma.
  2. *Cigoteno:* Apareamiento longitudinal gen por gen de cromosomas homólogos (**sinapsis**), estructurado por el **complejo sinaptonémico** proteico. Los pares se denominan bivalentes o tétradas (4 cromátidas).
  3. *Paquiteno:* Los cromosomas homólogos completamente apareados experimentan la recombinación genética o **crossing-over** (entrecruzamiento entre cromátidas no hermanas), catalizado por endonucleasas (Spo11) y recombinasas (Rad51/Dmc1). Fuente fundamental de variabilidad biológica.
  4. *Diploteno:* Disolución del complejo sinaptonémico; los cromosomas homólogos se repelen pero permanecen temporalmente unidos en los puntos exactos donde ocurrió el intercambio genético, denominados **quiasmas**. En ovogénesis humana, los ovocitos primarios se detienen en diploteno (dictioteno) desde la etapa prenatal hasta la pubertad.
  5. *Diacinesis:* Máxima condensación cromosómica; **terminalización de quiasmas** (se desplazan a los extremos). Desaparición de la carioteca y del nucléolo.
- **Metafase I:** Los bivalentes o pares homólogos se alinean en la placa ecuatorial en **doble fila**.
- **Anafase I:** **Disyunción de cromosomas homólogos** recombinados hacia polos opuestos. Las cromátidas hermanas permanecen unidas por sus centrómeros (protegidas por la proteína shugoshina).
- **Telofase I y Citocinesis:** Se forman dos células hijas haploides ($n$) cuyos cromosomas son dobles ($2c$).
- **Intercinesis:** Periodo breve entre Meiosis I y Meiosis II; **NO hay replicación de ADN**.

##### 2. Meiosis II (División Ecuacional: $n \to n$)
Ocurre similar a una mitosis convencional pero partiendo de un genoma haploide ($n$):
- *Profase II:* Condensación de cromatina y formación de nuevos husos acromáticos perpendiculares al primero.
- *Metafase II:* Los cromosomas ($n$, con 2 cromátidas recombinadas) se alinean en el plano ecuatorial en **fila simple**.
- *Anafase II:* **Disyunción de cromátidas hermanas** recombinadas hacia polos opuestos.
- *Telofase II y Citocinesis:* Da como resultado neto **4 células hijas haploides ($n$)** genéticamente distintas entre sí y distintas a la célula progenitora.

---

### 2.3. GAMETOGÉNESIS HUMANA

| Criterio | Espermatogénesis | Ovogénesis |
| :--- | :--- | :--- |
| **Lugar Anatómico** | Túbulos seminíferos de los testículos | Corteza de los ovarios |
| **Momento de Inicio** | En la pubertad y continúa toda la vida | En la vida embrionaria/fetal (3.º a 7.º mes intrauterino) |
| **Pausas / Detenciones** | Proceso continuo ininterrumpido | Dos detenciones meióticas obligadas: 1.ª en **Diploteno de Profase I** (dictioteno); 2.ª en **Metafase II** |
| **Resultado de la Meiosis** | **4 espermátidas funcionales** de tamaño equitativo | **1 ovocito secundario maduro** funcional + 3 cuerpos polares no viables |
| **Proceso de Maduración** | **Espermiogénesis** (condensación nuclear por protaminas, acrosoma del Golgi, flagelo del centriolo distal y pieza intermedia con vaina mitocondrial helicoidal) | Citoplasma hipertrofiado rico en vitelo, gránulos corticales y ribosomas |

---

### 2.4. REPRODUCCIÓN ASEXUAL Y SEXUAL

* **Modalidades Asexuales:**
  - *Fisión Binaria (Bipartición):* En bacterias (amitosis con proteína FtsZ), protozoarios (longitudinal en *Euglena*, transversal en *Paramecium*).
  - *Gemación:* Formación de una yema o brote desigual (levaduras como *Saccharomyces*, hidras de agua dulce).
  - *Esporulación:* Múltiples divisiones nucleares previas a la tabicación celular (hongos, esporozoos como *Plasmodium* vía esquizogonia).
  - *Fragmentación / Regeneración:* Regeneración de un individuo completo a partir de un fragmento corporal (planarias, estrellas de mar).
  - *Partenogénesis:* Desarrollo de un individuo adulto a partir de un óvulo no fecundado. Típico en insectos sociales (abejas: huevos no fecundados $n$ originan **zánganos** machos; fecundados $2n$ originan hembras obreras o reinas).
* **Modalidades Sexuales:** Singamia (fecundación isogámica, anisogámica u oogámica). En humanos: oogamia interna.

---

### 2.5. REPRODUCCIÓN EN PLANTAS CON FLOR (ANGIOSPERMAS)

1. **Estructura Floral (Verticilos Florales desde afuera hacia adentro):**
   - *Cáliz:* Formado por sépalos (protección del capullo).
   - *Corola:* Formada por pétalos coloreados (atracción de polinizadores).
   - *Androceo (Aparato Reproductor Masculino):* Estambres constituidos por filamento y antera (tecas con sacos polínicos).
   - *Gineceo o Pistilo (Aparato Reproductor Femenino):* Hojas carpelares cerradas formando estigma, estilo y ovario (con primordios seminales u óvulos vegetales).
2. **Microesporogénesis y Formación del Grano de Polen:**
   - La célula madre del grano de polen ($2n$) sufre meiosis originando $4$ microesporas haploides ($n$).
   - Cada microespora sufre una cariocinesis mitótica originando el **grano de polen maduro** (gametofito masculino bicelular): contiene una **célula generatriz** (que luego formará dos núcleos espermáticos o anterozoides) y una **célula del tubo** o vegetativa (que formará el tubo polínico).
3. **Megaesporogénesis y Formación del Saco Embrionario:**
   - La célula madre del saco embrionario ($2n$) en el óvulo vegetal sufre meiosis originando $4$ megasporas ($n$), de las cuales $3$ degeneran y $1$ megaspora funcional sobrevive.
   - La megaspora funcional experimenta **tres mitosis consecutivas sin citocinesis inmediata**, originando el **saco embrionario maduro** (gametofito femenino) de **7 células y 8 núcleos**:
     - Extremo micropilar: **1 Oosfera** u ovocélula ($n$) flanqueada por **2 sinérgidas**.
     - Célula central: Binucleada con **2 núcleos polares** ($n+n$).
     - Extremo calazal: **3 células antípodas**.
4. **Doble Fecundación (Exclusiva de Angiospermas):**
   - El grano de polen germina en el estigma proyectando el tubo polínico a través del estilo hacia el micrópilo ovular.
   - La célula generatriz se divide en dos núcleos espermáticos o anterozoides ($n$):
     $$\text{1.er Anterozoide } (n) + \text{Oosfera } (n) \implies \text{Cigoto } (2n) \to \text{Embrión vegetal}$$
     $$\text{2.º Anterozoide } (n) + 2\text{ Núcleos Polares } (n+n) \implies \text{Núcleo del Endospermo } (3n) \to \text{Tejido Nutricio}$$
   - Tras la doble fecundación:
     - El primordio seminal (óvulo) fecundado se transforma en la **semilla** (cubierta por la testa derivada de los tegumentos).
     - Las paredes del ovario hipertrofiadas bajo el estímulo de auxinas se transforman en el **fruto** (pericarpio: epicarpio, mesocarpio y endocarpio).

---

### 2.6. DESARROLLO EMBRIONARIO HUMANO

1. **Fecundación:** Ocurre en el **tercio externo de la trompa de Falopio (ampolla)**. Comprende reacción acrosómica (hialuronidasa y acrosina que digieren la corona radiada y la zona pelúcida, uniéndose a la proteína ZP3), fusión de membranas, bloqueo rápido de la poliespermia (despolarización por $Na^+$) y bloqueo lento (reacción cortical por influjo de $Ca^{2+}$ que endurece la zona pelúcida). El ovocito secundario completa la Meiosis II expulsando el segundo glóbulo polar. Se forman y fusionan los dos pronúcleos (**anfimixis**), reconstituyendo el estado diploide ($2n = 46$ cromosomas).
2. **Segmentación:** Sucesión rápida de mitosis sin incremento volumétrico total a lo largo de la trompa. A los 3-4 días post-fecundación se forma una masa sólida compacta de 16 a 32 blastómeras denominada **mórula**.
3. **Blastulación:** Ingreso de líquido que crea una cavidad central (blastocele), originando el **blastocisto** (día 5-6). Está formado por:
   - **Trofoblasto (capa celular periférica):** Dará origen a la porción fetal de la placenta y corion; secreta la hormona **gonadotropina coriónica humana (hCG)** que rescata al cuerpo lúteo.
   - **Masa celular interna o Embrioblasto:** Células pluripotentes que formarán el cuerpo del embrión.
   - *Implantación:* El blastocisto eclosiona de la zona pelúcida y se anida en el endometrio secretor uterino hacia los días 6 a 7.
4. **Gastrulación (Tercera semana):** Formación de la línea primitiva y migración celular que transforma el disco embrionario bilaminar (epiblasto e hipoblasto) en un embrión trilaminar con **tres capas germinativas primordiales**:
   - **Ectodermo:** Origina el sistema nervioso central y periférico, retina y cristalino, epidermis de la piel y sus faneras (pelos, uñas), esmalte dental, epitelio de la cavidad oral y anal, médula suprarrenal.
   - **Mesodermo:** Origina el tejido conectivo general, cartílago, hueso, sistema muscular estriado y liso, sistema cardiovascular (corazón, vasos sanguíneos y células de la sangre), sistema urogenital (riñones, gónadas y sus conductos), bazo y corteza suprarrenal.
   - **Endodermo:** Origina el epitelio de revestimiento del tracto gastrointestinal y respiratorio (neumocitos), parénquima del hígado, páncreas, vesícula biliar, tiroides, paratiroides, timo y epitelio de la vejiga urinaria y uretra.

---

## 3. FÓRMULAS, ECUACIONES Y RELACIONES CUANTITATIVAS

1. **Variabilidad Genética por Segregación Independiente en Meiosis:**
   $$\text{Número de combinaciones gaméticas posibles} = 2^n$$
   Donde $n$ es el número haploide de cromosomas (sin considerar crossing-over).
   - En humanos ($n = 23$):
     $$2^{23} = 8\ 388\ 608 \text{ tipos de gametos diferentes por individuo}$$
   - Con fecundación al azar entre dos progenitores:
     $$2^{23} \times 2^{23} = 2^{46} \approx 7.04 \times 10^{13} \text{ combinaciones genotípicas teóricas}$$

2. **Cálculo de Células y Dotación Genómica en Mitosis vs. Meiosis:**
   - Mitosis de 1 célula madre ($2n, 2c$):
     $$1 \text{ célula } (2n, 2c) \xrightarrow{\text{Fase S}} 1 \text{ célula } (2n, 4c) \xrightarrow{\text{Mitosis}} 2 \text{ células hijas } (2n, 2c)$$
   - Meiosis de 1 célula germinal ($2n, 2c$):
     $$1 \text{ célula } (2n, 2c) \xrightarrow{\text{Fase S}} (2n, 4c) \xrightarrow{\text{Meiosis I}} 2 \text{ células } (n, 2c) \xrightarrow{\text{Meiosis II}} 4 \text{ células hijas } (n, c)$$

3. **Ecuación Estequiométrica de la Doble Fecundación en Angiospermas:**
   $$\text{Grano de polen } [2 \times \text{núcleo espermático } (n)] + \text{Saco embrionario } [\text{Oosfera } (n) + 2 \text{ núcleos polares } (2n)] \implies \text{Cigoto } (2n) + \text{Endospermo } (3n)$$

---

## 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Fases de la Mitosis en Orden:**
   > **"PRO-METE-ANA-TEJER"**
   - **PRO**fase
   - **META**fase
   - **ANA**fase
   - **TEL**ofase

2. **Subfases de la Profase I de la Meiosis en Orden Estricto:**
   > **"LE-CIGO-PA-DIDI"**
   - **LE**ptoteno (condensación, cromómeros, bouquet).
   - **CIGO**teno (sinapsis de homólogos, complejo sinaptonémico).
   - **PA**quiteno (**PA**recitas intercambian: crossing-over).
   - **DI**ploteno (quiasmas visibles, dictioteno en ovocitos).
   - **DI**acinesis (terminalización de quiasmas).

3. **Destino de las Capas Germinativas (Derivados Embriológicos Clave):**
   > **"ECTO = Lo que se ve y siente (Piel + Nervios)"**
   > **"MESO = Lo que late, sostiene y se mueve (Músculos, Huesos, Sangre, Riñón)"**
   > **"ENDO = Lo que digiere y respira por dentro (Tubo digestivo, Pulmones, Hígado, Páncreas)"**

4. **Células del Saco Embrionario de Angiospermas:**
   > **"3 Arriba, 3 Abajo, 2 en el Centro"**
   - 3 arriba (calaza): Antípodas.
   - 3 abajo (micrópilo): 1 Oosfera + 2 Sinérgidas.
   - 2 en el centro: Núcleos polares (forman la célula central).

---

## 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **¿Dónde ocurre exactamente el crossing-over?:** Siempre marcar **Paquiteno de Profase I**. Cuidado con la trampa clásica: los quiasmas se hacen visibles al microscopio en **Diploteno**, pero el intercambio físico molecular del ADN ocurrió en **Paquiteno**.
* **Separación de Cromosomas: ¿Anafase I o Anafase II?:**
  - En **Anafase I** se separan los **cromosomas homólogos** (reducción cromosómica $2n \to n$).
  - En **Anafase II** se separan las **cromátidas hermanas** recombinadas (separación ecuacional de centrómeros).
* **Ploidy del Endospermo:** En Gimnospermas (pinos), el tejido de reserva nutricio de la semilla es haploide ($n$, tejido primario del megagametofito). En Angiospermas, el endospermo es **triploide ($3n$)** porque deriva de la fecundación de dos núcleos polares ($n+n$) por un anterozoide ($n$).
* **¿En qué fase meiótica se ovula la mujer humana?:** La mujer no ovula un óvulo maduro; ovula un **ovocito secundario detenido en METAFASE II**. La meiosis II solo se completa si un espermatozoide fecunda al ovocito.
* **Células en Fase $G_0$ Frecuentes en Admisión:** Neuronas y miocardiocitos se consideran células en $G_0$ permanente o irreversible; los hepatocitos están en $G_0$ facultativo (pueden proliferar si se lesiona el parénquima hepático).

---

## 6. PROBLEMAS RESUELTOS GRADUADOS

### Problema 1 (Nivel Básico: Ciclo Celular y Contenido de ADN)
**Enunciado:** Una especie vegetal diploide posee un cariotipo con $2n = 16$ cromosomas. Si una célula meristemática apical de esta planta se encuentra en la etapa de metafase de la mitosis, ¿cuántos cromosomas, cuántas cromátidas y cuántos centrómeros se encontrarán presentes en dicha célula?
A) 8 cromosomas, 16 cromátidas y 8 centrómeros.  
B) 16 cromosomas, 32 cromátidas y 16 centrómeros.  
C) 32 cromosomas, 32 cromátidas y 32 centrómeros.  
D) 16 cromosomas, 16 cromátidas y 32 centrómeros.  
E) 32 cromosomas, 64 cromátidas y 16 centrómeros.  

**Resolución:**
1. En metafase de la mitosis, la célula aún no ha separado sus cromátidas (la disyunción ocurre en anafase).
2. El número cromosómico en metafase sigue siendo diploide: $2n = 16$ cromosomas.
3. Como la célula pasó por la fase $S$ de replicación, cada cromosoma está duplicado y consta de $2$ cromátidas hermanas unidas por un centrómero común:
   - Número de cromátidas: $16 \times 2 = 32$ cromátidas.
   - Número de centrómeros: Cada cromosoma posee $1$ centrómero functional $\implies 16$ centrómeros.  
**Respuesta:** B

---

### Problema 2 (Nivel Intermedio: Botánica Reproductiva de Angiospermas)
**Enunciado:** En un cultivo de quinua (*Chenopodium quinoa*), se examina al microscopio un primordio seminal maduro listo para la fecundación. Se cuenta el número de núcleos haploides que integran el saco embrionario maduro (gametofito femenino). ¿Cuál es la conformación celular y nuclear exacta de esta estructura?
A) 8 células y 8 núcleos haploides independientes.  
B) 4 células uninucleadas y 1 célula con 4 núcleos espermáticos.  
C) 7 células que contienen en conjunto 8 núcleos haploides.  
D) 6 células haploides y 1 cigoto diploide preformado.  
E) 1 célula gigante con 8 núcleos triploides.  

**Resolución:**
1. Tras la meiosis de la célula madre de la megaspora, solo una megaspora haploide sobrevive y experimenta tres cariocinesis consecutivas originando 8 núcleos haploides.
2. Estos núcleos se distribuyen citoplasmáticamente en **7 células**:
   - 3 células antípodas en el polo calazal (uninucleadas).
   - 2 células sinérgidas en el polo micropilar (uninucleadas).
   - 1 oosfera u ovocélula (uninucleada).
   - 1 gran célula central que alberga los **2 núcleos polares** ($n+n$).
3. Por lo tanto, el saco embrionario maduro de una angiosperma está formado por **7 células y 8 núcleos**.  
**Respuesta:** C

---

### Problema 3 (Nivel Intermedio-Avanzado: Embriología Humana y Capas Germinativas)
**Enunciado:** Un recién nacido es diagnosticado con una anomalía congénita severa que compromete la formación de la retina ocular, la médula suprarrenal y el esmalte dental. Un genetista y un embriólogo analizan el caso y determinan que todas las estructuras afectadas provienen ontogénicamente de la misma hoja blastodérmica embrionaria. ¿Cuál es dicha capa germinativa primordial?
A) Mesodermo paraxial  
B) Endodermo faríngeo  
C) Ectodermo  
D) Mesodermo lateral esplácnico  
E) Hipoblasto vitelino  

**Resolución:**
1. Durante la gastrulación se establecen las tres hojas germinativas fundamentales: ectodermo, mesodermo y endodermo.
2. Revisando los derivados de las estructuras mencionadas:
   - Retina: Derivado del neuroectodermo (vesícula óptica diencefálica).
   - Médula suprarrenal: Derivado de las células de la cresta neural (origen ectodérmico).
   - Esmalte dental: Sintetizado por ameloblastos de origen ectodérmico estomodéal.
3. Todas las estructuras afectadas provienen unívocamente del **ectodermo**. (El mesodermo origina la corteza suprarrenal, no la médula; la dentina deriva del mesénquima de la cresta neural).  
**Respuesta:** C

---

### Problema 4 (Nivel Avanzado: Genética del Ciclo Celular y Cáncer)
**Enunciado:** En una línea de células tumorales epiteliales humanas, se identifica una mutación con pérdida total de función en el gen supresor de tumores *TP53* (proteína p53 no funcional). Si estas células son expuestas a radiación gamma que fragmenta severamente las cadenas de ADN en fase $G_1$, ¿qué comportamiento exhibirán en el ciclo celular en comparación con células somáticas normales?
A) Se detendrán irreversiblemente en $G_0$ activando la vía de apoptosis por la caspasa 8.  
B) Sobreexpresarán masivamente al inhibidor p21, hiperfosforilando al retinoblastoma (pRb).  
C) Ignorarán el punto de control $G_1/S$, entrarán a la fase $S$ replicando ADN lesionado y transmitirán mutaciones cromosómicas a las células hijas.  
D) El complejo APC/C destruirá inmediatamente los centriolos deteniendo la metafase.  
E) Aumentará la actividad de la enzima separasa impidiendo el crossing-over en mitosis.  

**Resolución:**
1. En condiciones normales, el daño en el ADN activa quinasas sensoras (ATM/ATR/Chk2), que estabilizan y fosforilan a **p53**. La p53 activa la transcripción del inhibidor de quinasas dependientes de ciclinas **p21**, el cual bloquea al complejo Ciclina E-CDK2. Esto evita la fosforilación de pRb, manteniendo inhibido a E2F e impidiendo la entrada a la fase $S$ hasta reparar el daño.
2. Al estar p53 inactivada por la mutación, la célula no puede transcribir p21 ante el daño radiante.
3. El complejo Ciclina E-CDK2 permanece activo, fosforila a pRb y libera a E2F.
4. La célula supera sin freno el **punto de restricción $G_1/S$** y entra a sintetizar ADN con roturas de doble cadena no reparadas, acumulando inestabilidad genómica severa y proliferando de forma anómala (carcinogénesis).  
**Respuesta:** C

---

### Problema 5 (Nivel Boss Challenge: Citogenética y Gametogénesis con No Disyunción)
**Enunciado:** En un cariotipo clínico de un feto con Síndrome de Klinefelter ($47, XXY$), se realiza un análisis molecular de microsatélites polimórficos vinculados al cromosoma X. Se determina que los dos cromosomas X son alélicamente distintos y provienen en su totalidad de la madre: uno corresponde exactamente al cromosoma X materno de origen paterno (abuelo materno) y el otro al cromosoma X materno de origen materno (abuela materna). Sabiendo que el padre biológico aportó normalmente el cromosoma Y, ¿en qué etapa exacta de la gametogénesis ocurrió el error cromosómico meiótico y en cuál progenitor?
A) No disyunción de cromátidas hermanas en Meiosis II de la espermatogénesis.  
B) No disyunción de cromosomas homólogos en Meiosis I de la ovogénesis materna.  
C) Fecundación polispérmica de un ovocito haploide por dos espermatozoides.  
D) No disyunción de cromátidas hermanas en Meiosis II de la ovogénesis materna.  
E) Duplicación postcigótica del cromosoma X durante la primera división de segmentación.  

**Resolución:**
1. El cigoto posee cariotipo $XXY$. El enunciado indica que el cromosoma Y es paterno normal; por tanto, el óvulo aportó dos cromosomas X ($X_1 X_2$), configurando un gameto hiperploide ($n+1 = 24, XX$).
2. Para que el ovocito contenga ambos cromosomas X homólogos maternos (uno proveniente del abuelo materno y otro de la abuela materna), **el par de cromosomas homólogos $X$ debió fallar en separarse durante la Anafase I de la Meiosis I**.
3. Si el error hubiese ocurrido en Meiosis II materna, se habrían separado normalmente los homólogos en Meiosis I, y la no disyunción en Meiosis II habría provocado la migración conjunta de **cromátidas hermanas idénticas**, generando un ovocito con dos cromosomas X alélicamente idénticos ($X_1 X_1$ o $X_2 X_2$), lo cual contradice el análisis de microsatélites.
4. Por lo tanto, el evento biológico exacto fue una **no disyunción de cromosomas homólogos durante la Meiosis I de la ovogénesis**.  
**Respuesta:** B

---

## 7. GLOSARIO TÉCNICO

1. **Crossing-over:** Proceso de recombinación homóloga recíproca entre cromátidas no hermanas de cromosomas homólogos que tiene lugar durante el paquiteno de la profase I meiótica.
2. **Complejo Sinaptonémico:** Estructura nucleoproteica tripartita que ensambla longitudinalmente y con alta precisión a los pares de cromosomas homólogos durante el cigoteno.
3. **Punto de Restricción (Start):** Punto de control crítico en la fase tardía de $G_1$ donde la célula se compromete de forma irreversible a iniciar la replicación del ADN y completar la división celular.
4. **Fragmoplasto:** Estructura vesicular derivada del aparato de Golgi alineada en el ecuador de la célula vegetal en telofase, que guía la síntesis centrífuga de la placa celular y pared primaria.
5. **Espermiogénesis:** Fase final de la espermatogénesis en la que las espermátidas haploides esféricas sufren remodelación morfológica radical para transformarse en espermatozoides hidrodinámicos flagelados.
6. **Dictioteno:** Estado prolongado de quiescencia meiótica en el diploteno de la profase I en el que se detienen los ovocitos primarios humanos desde el quinto mes de vida fetal hasta la ovulación en la pubertad.
7. **Doble Fecundación:** Fenómeno reproductivo universal y exclusivo de angiospermas en el que dos anterozoides fecundan simultáneamente a la oosfera (formando el cigoto $2n$) y a la célula central binucleada (formando el endospermo $3n$).
8. **Zona Pelúcida:** Matriz glucoproteica extracelular acelular (compuesta por ZP1, ZP2, ZP3 y ZP4) que envuelve al ovocito de los mamíferos y participa en el reconocimiento espermático especie-específico.
9. **Gastrulación:** Proceso morfogenético fundamental durante la tercera semana embrionaria que transforma el blastocisto bilaminar en un embrión trilaminar con ectodermo, mesodermo y endodermo.
10. **Reacción Cortical:** Exocitosis masiva de gránulos corticales ovocitarios inducida por el aumento de $Ca^{2+}$ intracelular tras la fecundación, que modifica enzimáticamente la zona pelúcida para impedir la poliespermia.

---

## 8. FLASHCARDS DE REPETICIÓN ESPACIADA

- **Q1:** ¿En qué subetapa de la profase I meiótica se produce el crossing-over o recombinación genética?
  - **A1:** En el Paquiteno.
- **Q2:** ¿Qué proteína es reconocida universalmente como el "guardián del genoma" en el punto de control G1/S?
  - **A2:** La proteína p53.
- **Q3:** ¿Cuál es la ploidía del tejido nutricio (endospermo) de la semilla en las plantas Angiospermas?
  - **A3:** Triploide ($3n$).
- **Q4:** ¿En qué fase meiótica se encuentra detenido el ovocito secundario humano en el momento de la ovulación?
  - **A4:** En Metafase II (solo se completa si ocurre fecundación).
- **Q5:** ¿Qué estructura forma el tabique de división celular citoplasmático en las células vegetales durante la citocinesis?
  - **A5:** El fragmoplasto (o placa celular).
- **Q6:** ¿Qué capa embrionaria da origen al sistema nervioso central y a la epidermis de la piel?
  - **A6:** El Ectodermo.
- **Q7:** ¿Cuántas células y cuántos núcleos componen el saco embrionario maduro típico de una angiosperma?
  - **A7:** 7 células y 8 núcleos haploides.
- **Q8:** ¿Qué tipo de disyunción ocurre durante la Anafase I meiótica?
  - **A8:** Disyunción (separación) de cromosomas homólogos.
- **Q9:** ¿Cómo se denomina la fase de transformación morfológica de espermátida a espermatozoide maduro?
  - **A9:** Espermiogénesis.
- **Q10:** ¿En qué estructura anatómica femenina se produce habitualmente la fecundación humana?
  - **A10:** En el tercio distal de la trompa de Falopio (ampolla tubárica).

---

## 9. BLOQUE DE GAMIFICACIÓN KMP (INTERACTIVO)

```json
{
  "subject_id": "BIOLOGIA",
  "topic_id": "TEMA_09_REPRODUCCION_Y_DESARROLLO",
  "difficulty_level": "PREUNIVERSITARIO_AVANZADO",
  "questions": [
    {
      "id": "BIO_REP_001",
      "question": "Durante la meiosis, si una célula 2n = 20 ingresa a la Anafase I, ¿cuántos cromosomas y cuántas cromátidas totales migran hacia cada polo de la célula en división?",
      "options": [
        "10 cromosomas dobles (20 cromátidas) hacia cada polo.",
        "20 cromosomas simples (20 cromátidas) hacia cada polo.",
        "5 cromosomas dobles (10 cromátidas) hacia cada polo.",
        "10 cromosomas simples (10 cromátidas) hacia cada polo.",
        "20 cromosomas dobles (40 cromátidas) hacia un solo polo."
      ],
      "correct_answer": 0,
      "explanation": "En la Anafase I se segregan los pares homólogos recombinados. Como 2n = 20, la mitad (10 cromosomas dobles, cada uno con 2 cromátidas hermanas unidas por el centrómero = 20 cromátidas) se dirige a cada polo."
    },
    {
      "id": "BIO_REP_002",
      "question": "¿Cuál de los siguientes tejidos y órganos se origina a partir de la hoja embrionaria mesodérmica?",
      "options": [
        "La retina ocular y el cristalino.",
        "El epitelio alveolar del pulmón y la tiroides.",
        "El tejido muscular esquelético, los riñones y el corazón.",
        "La epidermis y el esmalte dental.",
        "El revestimiento mucoso del estómago y el hígado."
      ],
      "correct_answer": 2,
      "explanation": "El mesodermo forma el aparato cardiovascular (corazón y vasos), el sistema musculoesquelético (músculos y huesos) y el sistema urogenital (riñones y gónadas)."
    },
    {
      "id": "BIO_REP_003",
      "question": "En la flor de las angiospermas, el gametofito masculino maduro corresponde exactamente a:",
      "options": [
        "El saco embrionario octanucleado.",
        "El grano de polen maduro bicelular (con célula generatriz y célula vegetativa).",
        "El estambre con sus dos tecas fértiles.",
        "La microespora uninucleada recién liberada de la tétrada.",
        "El estigma receptivo tras la polinización."
      ],
      "correct_answer": 1,
      "explanation": "El grano de polen maduro es el gametofito masculino haploide; contiene la célula vegetativa (célula del tubo) y la célula generatriz (que por mitosis forma los 2 anterozoides)."
    }
  ]
}
```

---

## 10. CONEXIÓN MULTIDISCIPLINARIA

* **Farmacología Oncológica y Dinámica del Citoesqueleto:** Los agentes quimioterápicos como el **paclitaxel (Taxol)** se unen a la tubulina $\beta$ estabilizando los microtúbulos e impidiendo su despolimerización durante la anafase, bloqueando la mitosis en metafase. En contraste, la **vincristina** y la **colquicina** inhiben la polimerización de tubulina impidiendo el ensamblaje del huso mitótico, activando el punto de control SAC que conduce a las células neoplásicas a la muerte celular por apoptosis.
* **Biotecnología y Células Madre Pluripotentes (Factores de Yamanaka):** El blastocisto contiene en su masa celular interna células madre embrionarias pluripotentes. La expresión forzada de cuatro factores de transcripción clave (Oct4, Sox2, Klf4 y c-Myc) es capaz de reprogramar células somáticas adultas diferenciadas para devolverlas a un estado indiferenciado (células madre pluripotentes inducidas, iPSC), revolucionando la medicina regenerativa y el modelado de enfermedades congénitas.

---

## 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Clínico Obstétrico: Fecundación y Diagnóstico)
Una paciente de 29 años con retraso menstrual de tres semanas se realiza una prueba de embarazo cualitativa en orina y una cuantificación sérica, resultando ambas fuertemente positivas para la subunidad $\beta$ de la gonadotropina coriónica humana ($\beta$-hCG). En la ecografía transvaginal se visualiza un saco gestacional intrauterino normoimplantado de 5 semanas. Desde la perspectiva del desarrollo embrionario y la endocrinología feto-materna temprana, ¿qué estructura del blastocisto es la responsable directa de la producción de esta hormona y cuál es su objetivo fisiológico inmediato?
A) El embrioblasto; inducir la gastrulación acelerada del epiblasto.  
B) El sincitiotrofoblasto; mantener el cuerpo lúteo ovárico funcional para que continúe secretando progesterona y sostenga el endometrio.  
C) El hipoblasto embrionario; cerrar la cavidad amniótica primaria mediante apoptosis.  
D) La zona pelúcida desprendida; activar la reacción decidual del miometrio uterino.  
E) El saco vitelino secundario; sintetizar eritrocitos nucleados para la placenta.  

* **Resolución:** El trofoblasto del blastocisto se diferencia durante la implantación en citotrofoblasto y sincitiotrofoblasto invasivo. El **sincitiotrofoblasto** secreta precozmente la hormona **gonadotropina coriónica humana (hCG)**. La hCG comparte homología estructural con la LH y actúa sobre los receptores del cuerpo lúteo ovárico, impidiendo su regresión (luteólisis) y transformándolo en cuerpo lúteo del embarazo. Este secreta continuamente **progesterona**, hormona que mantiene la decidua endometrial secretora e inhibe las contracciones miometriales, evitando el aborto espontáneo hasta que la placenta madura asuma la síntesis de esteroides hacia la semana 10-12.  
* **Respuesta:** B

---

### Pregunta 2 (Caso Experimental: Citogenética y Meiosis Vegetal)
Un equipo de botánicos de la UNSA investiga la meiosis en anteras jóvenes de *Solanum tuberosum* (papa, variedad silvestre diploide). Al analizar células meióticas bajo microscopía confocal con tinción fluorescente de anticuerpos dirigidos contra la proteína de cohesión centromérica shugoshina, observan que una mutación nula provoca la degradación prematura de la shugoshina durante la Metafase I. ¿Cuál será la consecuencia directa de esta alteración durante la Anafase I meiótica?
A) Bloqueo de la sinapsis y ausencia total de tétradas en el cigoteno.  
B) Separación prematura de las cromátidas hermanas en lugar de la disyunción normal de cromosomas homólogos durante la Anafase I, produciendo aneuploidías severas en las microesporas resultantes.  
C) Formación de una flor estéril por ausencia completa de células del tubo polínico.  
D) Incapacidad para formar el fragmoplasto en las células somáticas de la hoja.  
E) Fusión irreversible de los cuatro núcleos meióticos en una única espora tetraploide.  

* **Resolución:** En la meiosis I, la proteína **shugoshina** protege a las cohesinas centroméricas de la acción proteolítica de la separasa, asegurando que solo se destruyan las cohesinas de los brazos cromosómicos (permitiendo la separación de cromosomas homólogos en Anafase I) mientras las cromátidas hermanas permanecen unidas por el centrómero hasta la Meiosis II. Si la shugoshina se pierde prematuramente, la separasa cliva también los centrómeros en Meiosis I; en consecuencia, las cromátidas hermanas se segregan anómalamente al azar en la primera división, provocando una catástrofe meiótica con microesporas portadoras de aneuploidías no viables.  
* **Respuesta:** B

---

## 12. AUTOEVALUACIÓN RÁPIDA

1. ¿En qué fase del ciclo celular eucariota ocurre la replicación semiconservativa del ADN nuclear y la duplicación de los centriolos?
   - A) Fase $G_1$
   - B) Fase $G_2$
   - C) Fase $S$
   - D) Profase
   - E) Telofase
2. ¿Qué nombre recibe la unión longitudinal de cromosomas homólogos mediada por el complejo sinaptonémico durante el cigoteno?
   - A) Cariocinesis
   - B) Sinapsis
   - C) Disyunción
   - D) Crossing-over
   - E) Quiasma
3. ¿Cuál es el producto de la fecundación entre el segundo núcleo espermático ($n$) y los dos núcleos polares ($n+n$) en las angiospermas?
   - A) La testa
   - B) El cigoto diploide
   - C) El endospermo triploide ($3n$)
   - D) El pericarpio
   - E) El cotiledón haploide
4. ¿Qué capa germinativa embrionaria origina el músculo cardíaco, los huesos y los riñones?
   - A) Ectodermo
   - B) Endodermo
   - C) Mesodermo
   - D) Hipoblasto
   - E) Trofoblasto
5. ¿Cuál es la proteína que inhibe al factor de transcripción E2F impidiendo el paso de $G_1$ a fase $S$ cuando no está fosforilada?
   - A) Ciclina B
   - B) Proteína del Retinoblastoma (pRb)
   - C) Separasa
   - D) Securina
   - E) Cohesina

---

### Claves de Respuestas:
1: C | 2: B | 3: C | 4: C | 5: B
