package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t04_s01",
            title = "La Célula: Teoría Celular, Estructura, ADN y Síntesis Proteica - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "La Célula: Teoría Celular, Estructura, ADN y Síntesis Proteica - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Citología, Biología Celular y Dogma Central de la Biología Molecular
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.154748700 pts/pregunta (Examen: 5 preguntas)
  * *Área 2 (Biomédicas):* 1.945140000 pts/pregunta (Examen: 9 preguntas) — **MÁXIMA PRIORIDAD DEL EXAMEN**
  * *Área 3 (Sociales):* 1.148603363 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Diferenciación procariota/eucariota, transporte de membrana, sistema de endomembranas, transcripción y código genético)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              LA CÉLULA
                                  │
         ┌────────────────────────┴────────────────────────┐
         ▼                                                 ▼
CÉLULA PROCARIOTA                                 CÉLULA EUCARIOTA
• Sin núcleo verdadero (Nucleoide)                • Núcleo con carioteca y cromatina
• Pared celular de Peptidoglicano (Gram +/-)      • Sistema de Endomembranas (RER, REL, Golgi)
• Ribosomas 70S (50S + 30S)                     • Organelas bimembranosas (Mitocondrias, Cloroplastos)
• Flagelo bacteriano de flagelina                 • Citoesqueleto y Ribosomas 80S (60S + 40S)
                                                           │
         ┌─────────────────────────────────────────────────┴─────────────────────────────────┐
         ▼                                                                                   ▼
MEMBRANA PLASMÁTICA Y TRANSPORTE                                                     EL NÚCLEO Y EL DOGMA MOLECULAR
• Mosaico Fluido (Singer y Nicolson, 1972)                                          • Carioteca, Cariolinfa, Nucléolo, Cromatina
• Transporte Pasivo (Sin ATP):                                                      • Dogma Central (Crick, 1958):
  - Difusión Simple (O_2, CO_2)                                                     \text{ADN} \xrightarrow{\text{Transcripción}} \text{ARNm} \xrightarrow{\text{Traducción}} \text{Proteína}
  - Difusión Facilitada (Canales y Permeasas)                                        • Replicación Semiconservadora del ADN
  - Ósmosis (Soluciones Hipo, Híper e Isotónicas)                                    • Código Genético Universal y Degenerado
• Transporte Activo (Con gasto de ATP):                                             • Síntesis Proteica en Ribosomas (Etapas)
  - Bomba de Sodio y Potasio (Na^+/K^+ ATPasa)
  - En Masa: Endocitosis (Fagocitosis, Pinocitosis) y Exocitosis
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Teoría Celular Clásica y Moderna
* **Postulados Históricos:**
  1. *Matthias Schleiden (1838) y Theodor Schwann (1839):* "Todos los organismos vivos (plantas y animales) están constituidos por una o más células".
  2. *Rudolf Virchow (1855):* "*Omnis cellula e cellula*": "Toda célula proviene de la división de otra célula preexistente".
  3. *August Weismann (1880):* Todas las células actuales tienen un linaje continuo que desciende de un ancestro común universal (LUCA: *Last Universal Common Ancestor*).
* **Definición Moderna:** La célula es la unidad morfológica (anatómica), fisiológica (metabólica), genética (hereditaria) y reproductora fundamental de todos los seres vivos.

### 3.2. Célula Procariota vs Célula Eucariota

| Estructura / Característica | Célula Procariota (Arqueas y Bacterias) | Célula Eucariota (Protozoarios, Hongos, Plantas, Animales) |
| :--- | :--- | :--- |
| **Envoltura Nuclear (Carioteca)** | **Ausente** (Material genético libre en el nucleoide) | **Presente** (Núcleo definido delimitado por doble membrana) |
| **Material Genético (ADN)** | Circular y cerrado, desnudo (sin histonas en bacterias) | Lineal y helicoidal, asociado a **histonas** formando cromatina |
| **Pared Celular** | Presente, formada por **peptidoglicano (mureína)** | Presente en plantas (**celulosa**) y hongos (**quitina**). Ausente en animales |
| **Compartimentalización / Organelas** | **Ausentes** (no tiene organelas membranosas) | **Presentes** (mitocondrias, cloroplastos, retículo, Golgi, lisosomas) |
| **Ribosomas** | Pequeños, **70S** (Subunidades 50S + 30S) | Grandes, **80S** (Subunidades 60S + 40S) en citosol |
| **Respiración Celular** | En los **mesosomas** de la membrana plasmática | En las **mitocondrias** |
| **División Celular** | Fisión binaria o bipartición (Amitosis) | Mitosis y Meiosis con huso acromático |

* **Pared Celular Bacteriana (Tinción de Christian Gram, 1884):**
  * **Bacterias Gram Positivas (Gram^+):** Pared celular gruesa formada por múltiples capas de **peptidoglicano** (80-90\%) con ácidos teicoicos y lipoteicoicos. Se tiñen de color **violeta/azul oscuro** con el cristal violeta.
  * **Bacterias Gram Negativas (Gram^-):** Pared celular delgada con una capa fina de peptidoglicano (10\%) rodeada por una **membrana externa** rica en **lipopolisacárido (LPS / endotoxina)** y porinas. Se tiñen de color **rojo/rosado** con la safranina.

### 3.3. Membrana Plasmática y Mecanismos de Transporte
* **Modelo del Mosaico Fluido (S. Jonathan Singer y Garth L. Nicolson, 1972):**
  Bicapa asimétrica fluida de **fosfolípidos anfipáticos** con proteínas integrales (transmembranales) y periféricas incrustadas.
  * En células animales contiene **colesterol** (intercalado entre los fosfolípidos para regular la fluidez y estabilidad mecánica).
  * En la cara extracelular posee el **Glucocálix** (cadenas de oligosacáridos asociadas a lípidos y proteínas: reconocimiento celular, histocompatibilidad y receptor antigénico).

#### Mecanismos de Transporte a través de la Membrana Plasmática:
1. **Transporte Pasivo (A favor del gradiente electroquímico, \Delta C > 0, sin consumo de ATP):**
   * *Difusión Simple:* Paso de moléculas apolares lipofílicas o gases a través de la bicapa fosfolipídica (O_2, CO_2, N_2, hormonas esteroideas, anestésicos).
   * *Difusión Facilitada:* Paso de iones y moléculas polares hidrofílicas mediante proteínas transportadoras:
     - Proteínas de canal o Canales iónicos (Na^+, K^+, Ca^{2+}, Cl^-).
     - Acuaporinas (canales proteicos específicos para el paso ultra rápido de H_2O, Peter Agre, Nobel 2003).
     - Proteínas transportadoras o Permeasas / Carriers (ej. GLUT-1 para la glucosa).
   * *Ósmosis:* Movimiento neto de agua a través de una membrana semipermeable desde una solución hipotónica (menor concentración de solutos) hacia una hipertónica (mayor concentración):
     - **En Célula Animal (Glóbulo Rojo):**
       - Medio Hipertónico: Pierde agua y se arruga \implies **Crenación**.
       - Medio Hipotónico: Gana agua en exceso y estalla \implies **Hemólisis** (lisis celular).
       - Medio Isotónico: Estado normal equilibrado.
     - **En Célula Vegetal:**
       - Medio Hipertónico: La vacuola pierde agua y la membrana se separa de la pared \implies **Plasmólisis**.
       - Medio Hipotónico: Gana agua y la vacuola se hincha resistida por la pared rígida \implies **Turgencia** (estado fisiológico óptimo).
2. **Transporte Activo (En contra del gradiente electroquímico, requiere energía metabólica en forma de ATP):**
   * *Transporte Activo Primario:* La **Bomba de Sodio y Potasio (Na^+/K^+ ATPasa)**:
     \text{Por cada molécula de ATP hidrolizada: Expulsa } 3Na^+ \text{ al exterior e ingresa } 2K^+ \text{ al citoplasma}
     Mantiene la negatividad interna del potencial de membrana en reposo (-70\text{ mV}).
   * *Transporte en Masa (Vesicular):*
     - **Endocitosis:** Invaginación de la membrana plasmática para internalizar partículas:
       * *Fagocitosis:* Ingestión de partículas sólidas de gran tamaño mediante pseudópodos (bacterias fagocitadas por neutrófilos y macrófagos formando fagosomas).
       * *Pinocitosis:* Internalización de fluidos extracelulares y solutos disueltos en microvesículas.
       * *Endocitosis mediada por receptor:* Formación de vesículas revestidas de clatrina al unirse a ligandos específicos (ej. captación de LDL-colesterol).
     - **Exocitosis:** Fusión de vesículas de secreción intracelulares con la membrana plasmática para verter su contenido al espacio extracelular (secreción de neurotransmisores, hormonas y enzimas digestivas).

### 3.4. Citoplasma y Sistema de Endomembranas
* **Citoesqueleto:** Red tridimensional de filamentos proteicos que confiere arquitectura celular, soporte mecánico, ciclosis citoplasmática y guía el transporte de vesículas:
  * *Microtúbulos (25\text{ nm}):* Polímeros de **tubulina** (\alpha y \beta). Forman el huso mitótico, centríolos (9 \times 3 + 0), cilios y flagelos axonémicos (9 \times 2 + 2).
  * *Microfilamentos (7\text{ nm}):* Polímeros de **actina**. Responsables de la contracción muscular, fagocitosis, citocinesis (anillo contráctil) y emisión de pseudópodos.
  * *Filamentos Intermedios (10\text{ nm}):* Resistencia a la tensión mecánica (queratina, desmina, vimentina, láminas nucleares).
* **Sistema de Endomembranas (Vacuoma Celular):**
  1. **Retículo Endoplasmático Rugoso (RER o Granular):** Posee ribosomas adheridos a su cara externa mediante proteínas **riboforinas**. Función: **Síntesis, plegamiento inicial y glucosilación preliminar de proteínas** de exportación, de membrana y lisosomales.
  2. **Retículo Endoplasmático Liso (REL o Agranular):** Carece de ribosomas. Funciones: **Síntesis de lípidos** (fosfolípidos, colesterol, hormonas esteroideas), **detoxificación celular** de fármacos y toxinas (hepatocitos, mediada por citocromo P450), **glucogenólisis** y reservorio de iones Ca^{2+} en el músculo esquelético (**retículo sarcoplásmico**).
  3. **Aparato o Complejo de Golgi:** Conjunto de sacos discoidales aplanados y apilados (**dictiosomas**):
     - Cara *Cis* (de entrada, orientada al RER): recibe vesículas de transición.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"La replicación del ADN lee y sintetiza en la misma dirección\". FALSO CRÍTICO. La ADN Polimerasa LEE la hebra molde en sentido 3' \\to 5', pero SINTETIZA la nueva hebra \", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 0,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "bio_t04_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Afirmar que el codón de parada codifica para un aminoácido de fin. FALSO. Los codones UAA, UAG y UGA no codifican ningún aminoácido; son reconocidos por factores de liber\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 1,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "bio_t04_s01_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s01_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s01_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s01_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s01_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "bio_t04_s02",
            title = "La Célula: Teoría Celular, Estructura, ADN y Síntesis Proteica - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "La Célula: Teoría Celular, Estructura, ADN y Síntesis Proteica - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     - Cara *Trans* (de salida): emite vesículas secretoras.
     - Funciones: **Glicosilación terminal y empaquetamiento de proteínas**, formación de la pared celular vegetal primigenia (**fragmoplasto**), síntesis de polisacáridos y génesis de **lisosomas primarios** y del **acrosoma** del espermatozoide.

### 3.5. Organelas Celulares
1. **Organelas Membranosas:**
   * **Lisosomas:** Vesículas con membrana simple formadas en el Golgi que albergan más de 50 enzimas **hidrolasas ácidas** (pH óptimo \approx 4.5-5.0, mantenido por bombas de protones H^+). Función: **Digestión intracelular** (heterofagia) y degradación de organelas senescentes de la propia célula (**autofagia** y autolisis).
   * **Peroxisomas:** Contienen enzimas oxidasas que generan peróxido de hidrógeno (H_2O_2) y la enzima **catalasa**, que descompone de forma inmediata el H_2O_2 tóxico en agua y oxígeno (2H_2O_2 \xrightarrow{\text{catalasa}} 2H_2O + O_2). Realizan la \beta-oxidación de ácidos grasos de cadena muy larga.
   * **Glioxisomas:** Organelas exclusivas de células vegetales y semillas oleaginosas. Convierten los lípidos de reserva en glúcidos (ciclo del glioxilato) durante la germinación.
   * **Vacuola Central Vegetal:** Rodeada por una membrana especializada llamada **tonoplasto**. Mantiene la presión de turgencia hidrostática y almacena agua, iones, pigmentos (antocianinas) y alcaloides.
2. **Organelas Bimembranosas Semiautónomas (Teoría Endosimbiótica de Lynn Margulis):**
   * Derivan de bacterias procariotas fagocitadas por células primitivas. Poseen **doble membrana**, **ADN circular bicatenario propio (desnudo)** y **ribosomas 70S propios**, siendo capaces de dividirse por fisión binaria de forma autónoma:
   * **Mitocondrias:** Centro de la **respiración celular aerobia** y síntesis masiva de ATP por fosforilación oxidativa.
   * **Cloroplastos:** Plastidios de células vegetales que contienen tilacoides apilados en *granas* sumergidos en el *estroma*. Realizan la **fotosíntesis** oxigénica gracias a la presencia de clorofila.
3. **Estructuras No Membranosas (Organoides):**
   * **Ribosomas:** Complejos ribonucleoproteicos de ARNr y proteínas que realizan la **síntesis de proteínas (traducción)**.
   * **Centrosoma:** Formado por 2 centríolos perpendiculares rodeados de material pericentriolar; actúa como el principal Centro Organizador de Microtúbulos (COMT) animal para formar el huso mitótico.

### 3.6. El Núcleo Celular y el Dogma Central de la Biología Molecular
El núcleo celular interfasico consta de:
* **Carioteca:** Doble membrana perforada por complejos de **poro nuclear**.
* **Nucléolo:** Región densa sin membrana donde se transcriben los ARNr y se produce el **ensamblaje de las subunidades ribosómicas**.
* **Cromatina:** Complejo de ADN bicatenario condensado alrededor de octámeros de proteínas básicas llamadas **Histonas** (H_2A, H_2B, H_3, H_4). La unidad repetitiva fundamental de la cromatina es el **Nucleosoma** (contiene un octámero de histonas envuelto por 146 pares de bases de ADN, estabilizado exteriormente por la histona de unión H_1).
  * *Eucromatina:* Cromatina descondensada activa transcripcionalmente.
  * *Heterocromatina:* Cromatina densamente compactada inactiva (constitutiva o facultativa, como el corpúsculo de Barr en mujeres).

#### El Dogma Central de la Biología Molecular (Francis Crick, 1958)
\text{ADN} \xrightarrow[\text{Replicación}]{\text{ADN Polimerasa}} \text{ADN} \xrightarrow[\text{Transcripción}]{\text{ARN Polimerasa}} \text{ARN} \xrightarrow[\text{Traducción}]{\text{Ribosomas}} \text{Proteína}
*(Excepción: La **Retrotranscripción o Transcripción Inversa**, descubierta por Temin y Baltimore en retrovirus como el VIH, donde el ARN genera ADN mediante la enzima Transcriptasa Inversa)*.

1. **Replicación del ADN:**
   * Es **semiconservadora** (Meselson y Stahl: cada molécula hija conserva una hebra parental original y sintetiza una hebra nueva complementaria), **bidireccional** y **semidiscontinua**:
   * *Helicasa:* Rompe los puentes de hidrógeno abriendo la horquilla.
   * *Topoisomerasa (ADN Girasa):* Elimina la tensión torsional del superenrollamiento.
   * *Proteínas SSB:* Mantienen separadas las hebras monocatenarias.
   * *Primasa (ARN Polimerasa):* Sintetiza el cebador o *primer* de ARN (10-12\text{ nucleótidos}).
   * *ADN Polimerasa III:* Alarga la nueva cadena añadiendo desoxirribonucleótidos estrictamente en sentido **5' \to 3'**:
     - Hebra líder o continua: Se sintetiza de forma ininterrumpida.
     - Hebra rezagada o retardada: Se sintetiza de forma discontinua en fragmentos pequeños denominados **Fragmentos de Okazaki**.
   * *ADN Ligasa:* Une covalentemente los fragmentos de Okazaki formando enlaces fosfodiéster.
2. **Transcripción Génica (Síntesis de ARN):**
   * La **ARN Polimerasa** sintetiza una molécula de ARN complementaria a una hebra molde de ADN en dirección **5' \to 3'**.
   * En eucariotas, el transcrito primario (ARN heterogéneo nuclear, ARNhn) experimenta maduración o **procesamiento postranscripcional (Splicing)**:
     - Adición de la caperuza de 7-metilguanosina (Cap 5').
     - Adición de la cola de poliadeninas (Poli-A en 3').
     - **Corte de intrones (secuencias no codificantes) y empalme de exones (secuencias codificantes)** mediado por el complejo espliceosoma (*spliceosome*).
3. **El Código Genético:**
   * Diccionario biológico que traduce la secuencia de tripletes de nucleótidos del ARNm (**Codones**) en la secuencia lineal de aminoácidos de la proteína:
   * **Universal:** El mismo codón codifica para el mismo aminoácido en casi todas las formas de vida de la Tierra (prueba irrefutable de un ancestro común).
   * **Degenerado o Redundante:** Existen 64 codones posibles para 20 aminoácidos; por tanto, varios codones distintos pueden codificar para un mismo aminoácido (salvo metionina y triptófano).
   * **No solapado y sin puntuación:** Se lee de 3 en 3 de forma continua.
   * **Codón de Inicio:** **AUG** (codifica para Metionina en eucariotas y Formilmetionina en procariotas).
   * **Codones de Parada, Alto o Stop (No codifican aminoácidos):** **UAA, UAG, UGA** (*"Uva, Uno, Uga"*).
4. **Traducción (Síntesis Proteica en los Ribosomas):**
   * *Activación:* Unión del aminoácido a su ARNt correspondiente mediante la enzima aminoacil-ARNt sintetasa consumiendo ATP.
   * *Iniciación:* El ribosoma reconoce el Cap 5', posicionando el ARNt iniciador con metionina en el **Sitio P** (peptidil) frente al codón AUG.
   * *Elongación:* El siguiente aminoacil-ARNt ingresa al **Sitio A** (aminoacil). La enzima **peptidil transferasa** (actividad ribozima del ARNr grande) forma el enlace peptídico transfiriendo la cadena al aminoácido del sitio A. Luego ocurre la **traslocación ribosomal** dependiente de GTP hacia el siguiente triplete.
   * *Terminación:* Al exponerse un codón de parada (UAA, UAG, UGA) en el sitio A, se unen factores de liberación proteicos liberando la cadena polipeptídica y disociando las subunidades ribosómicas.

---

### 4. SISTEMA DE RIBOSOMAS S (SVEDBERG)
* Ribosoma Procariota: **70S** (Subunidad grande 50S + pequeña 30S).
* Ribosoma Eucariota Citoplásmico: **80S** (Subunidad grande 60S + pequeña 40S).
*(La letra "S" representa unidades Svedberg, una medida de velocidad de sedimentación por ultracentrifugación no directamente aditiva)*.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Codones de Parada (Stop):**
  * **UAA:** **U**no **A**rrancó **A**ntes
  * **UAG:** **U**no **A**rrancó **G**anando
  * **UGA:** **U**no **G**anó **A**ntes
* **Mnemotecnia Bomba Na^+/K^+:** **"NO-K-IN"**
  * **Na** sale (**Out**), **K** entra (**In**). Se expulsan **3 Na^+** y entran **2 K^+** por cada ATP consumido.
* **Mnemotecnia Organelas Endosimbióticas:**
  * **"Mi-Clon tiene ADN"**: **Mi**tocondrias y **Clor**oplastos tienen ADN circular desnudo y ribosomas 70S.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "La replicación del ADN lee y sintetiza en la misma dirección".** FALSO CRÍTICO. La ADN Polimerasa **LEE la hebra molde en sentido 3' \to 5'**, pero **SINTETIZA la nueva hebra exclusivamente en dirección 5' \to 3'**.
* **Trampa 2: Afirmar que el codón de parada codifica para un aminoácido de fin.** FALSO. Los codones UAA, UAG y UGA no codifican ningún aminoácido; son reconocidos por factores de liberación proteicos que inducen la hidrólisis de la cadena.
* **Trampa 3: Confundir los papeles del RER y el REL.** Si preguntan por la síntesis de hormonas esteroideas (testosterona, estrógenos) o detoxificación de venenos, la respuesta es el **REL (Liso)**. Si preguntan por enzimas digestivas o insulina (proteínas de exportación), la respuesta es el **RER (Rugoso)**.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Confundir los papeles del RER y el REL. Si preguntan por la síntesis de hormonas esteroideas (testosterona, estrógenos) o detoxificación de venenos, la respuesta es el RE\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 0,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "bio_t04_s02_c02",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t04_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
