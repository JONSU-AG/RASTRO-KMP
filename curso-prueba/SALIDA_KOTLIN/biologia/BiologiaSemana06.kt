package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t06_s01",
            title = "Organización Tisular: Tejidos Vegetales y Animales - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Organización Tisular: Tejidos Vegetales y Animales - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Histología Vegetal y Animal Comparada
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.154748700 pts/pregunta (Examen: 5 preguntas)
  * *Área 2 (Biomédicas):* 1.945140000 pts/pregunta (Examen: 9 preguntas) — **MÁXIMA PRIORIDAD DEL EXAMEN**
  * *Área 3 (Sociales):* 1.148603363 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Histología vegetal: meristemos, xilema/floema; Histología animal: epitelial, conectivo/óseo/sanguíneo, muscular y nervioso)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.7 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ORGANIZACIÓN TISULAR (HISTOLOGÍA)
                                              │
         ┌────────────────────────────────────┴────────────────────────────────────┐
         ▼                                                                         ▼
  TEJIDOS VEGETALES                                                         TEJIDOS ANIMALES
• Meristemáticos o Embrionarios:                                            • Epitelial:
  - Primario o Apical (Crecimiento en longitud)                               - De Revestimiento (Simple, Estratificado)
  - Secundario o Lateral (Crecimiento en grosor: Cámbium y Felógeno)          - Glandular (Exocrino, Endocrino, Mixto)
• Adultos o Definitivos:                                                    • Conectivo o Conjuntivo:
  - Protectores: Epidermis (Estomas) y Peridermis (Lenticelas)                - Propiamente dicho (Laxo, Denso)
  - Fundamentales (Parénquima): Clorofiliano, Reservante, Acuífero, Aerífero  - Especializado: Adiposo, Cartilaginoso,
  - De Sostén: Colénquima (Vivo, celulósico) y Esclerénquima (Muerto, lignina)   Óseo (Osteona/Havers) y Sanguíneo (Glóbulos)
  - Vasculares o Conductores:                                               • Muscular:
    * Xilema (Traqueas/Traqueidas, savia bruta)                               - Estriado Esquelético (Voluntario, multinucleado)
    * Floema (Tubos cribosos/Células anexas, savia elaborada)                 - Estriado Cardíaco (Involuntario, discos intercalares)
  - Secretores: Tubos laticíferos, tricomas glandulares                       - Liso (Involuntario, fusiforme, visceral)
                                                                            • Nervioso: Neuronas y Neuroglías
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Histología Vegetal (Tejidos Vegetales)

#### A. Tejidos Meristemáticos o Embrionarios
Formados por células pequeñas, indiferenciadas, isodiamétricas, con pared celular primaria muy delgada, núcleo grande, citoplasma denso y sin cloroplastos. Su función primordial es la **división celular activa por mitosis**:
1. **Meristemo Primario o Apical:**
   * Localización: En los ápices de tallos (yemas apicales) y ápices de raíces (cono vegetativo protegido por la cofia o caliptra).
   * Función: Determina el **crecimiento primario o longitudinal (en altura y profundidad)** de la planta.
2. **Meristemo Secundario o Lateral:**
   * Aparece a partir del primer o segundo año en plantas leñosas (gimnospermas y dicotiledóneas).
   * Función: Determina el **crecimiento secundario o diametral (en grosor o espesor)** de tallos y raíces.
   * *Tipos de Meristemos Laterales:*
     * **Cámbium Vascular:** Origina hacia el interior el **Xilema secundario (leño o madera)** y hacia el exterior el **Floema secundario (líber)**.
     * **Cámbium Suberoso o Felógeno:** Origina hacia el exterior el **Súber o Corcho** (tejido muerto protector con suberina) y hacia el interior la **Felodermis** (parénquima cortical vivo). El conjunto súber + felógeno + felodermis constituye la **Peridermis**.

#### B. Tejidos Adultos o Definitivos
1. **Tejidos Protectores o Tegumentarios:**
   * **Epidermis:** Capa externa de células vivas transparentes e incoloras que recubre hojas, flores, frutos y tallos herbáceos jóvenes. Su cara exterior secreta una capa cerosa impermeable llamada **cutícula** (formada por cutina) para evitar la pérdida excesiva de agua.
     * *Estructuras anexas:*
       - **Estomas:** Complejos celulares formados por dos **células oclusivas o de guarda** arriñonadas (con cloroplastos) que delimitan un orificio llamado **ostíolo**. Regulan el intercambio gaseoso (CO_2/O_2) y la transpiración hídrica foliar.
       - **Tricomas o pelos:** Estructuras epidérmicas glandulares, urticantes o absorbentes (pelos radiculares de la raíz).
   * **Peridermis:** Reemplaza a la epidermis en tallos y raíces de plantas leñosas adultas. Posee poros de intercambio gaseoso llamados **Lenticelas**.
2. **Tejidos Fundamentales (Parénquimas):**
   Constituyen la mayor parte de la masa vegetal; células vivas con vacuolas grandes:
   * **Parénquima Clorofiliano o Clorénquima:** Localizado en el mesófilo de las hojas (en empalizada y lagunar). Rico en cloroplastos; realiza la **fotosíntesis**.
   * **Parénquima Amiláceo (Reservante):** Almacena granos de almidón en leucoplastos (amiloplastos) en tubérculos (papa), raíces (yuca) y semillas (maíz).
   * **Parénquima Acuífero:** Almacena grandes volúmenes de agua en plantas suculentas y xerófitas de desierto (cactáceas).
   * **Parénquima Aerífero (Aerénquima):** Posee amplios meatos o espacios intercelulares llenos de aire que facilitan la flotación e intercambio gaseoso en plantas acuáticas (hidrófitas: totora, lirio de agua).
3. **Tejidos de Sostén o Mecánicos:**
   Aportan resistencia mecánica, rigidez y flexibilidad a la arquitectura vegetal:
   * **Colénquima:** Tejido formado por células **VIVAS**, alargadas, con paredes celulares engrosadas desigualmente en los ángulos con **celulosa y pectina** (sin lignina). Confiere **resistencia y flexibilidad elástica** a tallos jóvenes en crecimiento, pecíolos de hojas y pedúnculos florales.
   * **Esclerénquima:** Tejido formado por células **MUERTAS**, con paredes celulares uniformemente engrosadas, endurecidas e impregnadas de **LIGNINA** (polímero rígido hidrófobo). Confiere **soporte mecánico rígido e inelástico** a partes adultas que han cesado su crecimiento.
     * *Elementos celulares:* Fibras esclerenquimáticas (alargadas, ej. lino, cáñamo) y Esclereidas o células pétreas (isodiamétricas cortas, ej. textura arenosa del fruto de la pera, cáscaras de nueces y carozos de durazno).
4. **Tejidos Conductores o Vasculares:**
   * **Xilema (Tejido Leñoso o Leño):**
     * Conduce la **Savia Bruta** (agua y sales minerales inorgánicas absorbidas por las raíces).
     * Sentido de transporte: **Unidireccional ascendente** (desde la raíz hacia las hojas, impulsado por transpiración foliar, cohesión-tensión y presión radicular).
     * Composición: Células **MUERTAS**, huecas y lignificadas: **Traqueas (elementos del vaso)** en angiospermas y **Traqueidas** en gimnospermas.
   * **Floema (Tejido Liberiano o Líber):**
     * Conduce la **Savia Elaborada** (solución rica en sacarosa, aminoácidos y fitohormonas sintetizadas en las hojas fotosintéticas).
     * Sentido de transporte: **Bidireccional o multidireccional** (de fuentes u hojas hacia sumideros: raíces, frutos, semillas, según la hipótesis del flujo de masa de Ernst Münch).
     * Composición: Células **VIVAS**: **Elementos del tubo criboso** (anucleados en su madurez, con placas cribosas perforadas) asociados íntimamente a **Células Acompañantes o Anexas** (con núcleo denso que controlan su metabolismo).

---

### 3.2. Histología Animal (Tejidos Animales Fundamentales)
Los organismos metazoos están constituidos por cuatro familias de tejidos fundamentales derivados de las tres hojas embrionarias (Ectodermo, Mesodermo y Endodermo):

#### A. Tejido Epitelial
Tejido caracterizado por células muy cohesionadas con escasísima matriz extracelular, unidas por complejos de unión (uniones estrechas, desmosomas y uniones gap). Es **Avascular** (carece de vasos sanguíneos propios; se nutre por difusión desde el tejido conectivo subyacente a través de la **membrana basal** acelerada).
1. **Epitelio de Revestimiento y Cubierta:**
   * **Simple o Monoestratificado (1 sola capa celular):**
     * *Plano simple:* Endotelio de vasos sanguíneos, capilares, alvéolos pulmonares (neumocitos I) y cápsula de Bowman renal (óptimo para filtración y difusión de gases).
     * *Cúbico simple:* Túbulos renales contorneados, folículos tiroideos y superficie ovárica.
     * *Cilíndrico simple (Prismático):* Mucosa gástrica e intestinal con microvellosidades (*ribete en cepillo*) para absorción de nutrientes.
   * **Estratificado (Múltiples capas celulares, función protectora mecánica):**
     * *Plano estratificado queratinizado:* Epidermis de la piel (capa córnea de queratina impermeable a patógenos).
     * *Plano estratificado no queratinizado:* Mucosa oral, esófago, vagina y ano.
   * **Pseudoestratificado (1 sola capa donde todas las células tocan la membrana basal, pero núcleos a distinta altura aparentan estratos):**
     * *Cilíndrico pseudoestratificado ciliado con células caliciformes:* Mucosa del tracto respiratorio (tráquea, bronquios), encargado del aclaramiento mucociliar.
   * **Polimorfo o de Transición (Urotelio):**
     * Capaz de distenderse y modificar su morfología celular (de globosas a aplanadas). Recubre vías urinarias: cálices renales, uréteres y **vejiga urinaria**.
2. **Epitelio Glandular:**
   * *Glándulas Exocrinas:* Vierten su producto al exterior o cavidades mediante conductos excretores (glándulas salivales, sudoríparas, sebáceas, hígado/bilis).
   * *Glándulas Endocrinas:* Carecen de conductos; vierten sus mensajeros químicos (**hormonas**) directamente al torrente sanguíneo (tiroides, hipófisis, suprarrenales).
   * *Glándulas Mixtas o Anficrinas:* Poseen porción exocrina y endocrina (páncreas: acinos exocrinos e islotes de Langerhans endocrinos; gónadas).

#### B. Tejido Conectivo o Conjuntivo

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t06_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"El tejido epitelial está profundamente irrigado por capilares\". FALSO TOTAL. El tejido epitelial es completamente AVASCULAR; si se corta superficialmente no sangra. Toda\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t06_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Confundir Colénquima con Esclerénquima. Recuerda siempre: el colénquima está formado por células vivas sin lignina (flexible); el esclerénquima está formado por células m\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t06_s01_c03",
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
                    id = "bio_t06_s01_c04",
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
                    id = "bio_t06_s01_c05",
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
                    id = "bio_t06_s01_c06",
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
                    id = "bio_t06_s01_c07",
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
                    id = "bio_t06_s01_c08",
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
                    id = "bio_t06_s01_c09",
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
                    id = "bio_t06_s01_c10",
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
            id = "bio_t06_s02",
            title = "Organización Tisular: Tejidos Vegetales y Animales - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Organización Tisular: Tejidos Vegetales y Animales - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Tejido de origen mesodérmico caracterizado por abundante **Matriz Extracelular (MEC)** rica en fibras proteicas (colágeno tipo I-IV, elastina, reticulina) y sustancia fundamental glucosada (glicosaminoglicanos, ácido hialurónico). Es **altamente vascularizado e inervado** (salvo el cartílago).
1. **Células Típicas del Tejido Conectivo:**
   * **Fibroblastos:** Célula principal metabólicamente activa; sintetiza las fibras de colágeno, elásticas y la sustancia amorfa.
   * **Macrófagos (Histiocitos):** Células fagocíticas derivadas de los monocitos; defensa celular y presentación de antígenos.
   * **Mastocitos o Células Cebadas:** Gránulos ricos en **histamina** (vasodilatador alérgico) y **heparina** (anticoagulante fisiológico).
   * **Plasmocitos (Células plasmáticas):** Derivadas de linfocitos B; secretan masivamente **anticuerpos (inmunoglobulinas)**.
   * **Adipocitos:** Células que acumulan gotas lipídicas de triglicéridos.
2. **Tejidos Conectivos Especializados:**
   * **Tejido Cartilaginoso:** Avascular y sin nervios. Matriz firme y flexible rica en sulfato de condroitina. Células: **Condrocitos** alojados en lagunas (condroplastos), formados a partir de condroblastos. Nutrición por el **pericondrio**:
     - *Hialino:* Cartílagos articulares, tráquea, laringe, cartílagos costales.
     - *Elástico:* Pabellón auricular, epiglotis.
     - *Fibroso (Fibrocartílago):* Discos intervertebrales, sínfisis púbica y meniscos articulares (rico en colágeno denso).
   * **Tejido Óseo:** Matriz extracelular mineralizada rígida compuesta por una fracción orgánica (**Osteoide**: colágeno tipo I al 90\%) y una fracción inorgánica mineral cristalizada (**Hidroxiapatita de calcio**, Ca_{10}(PO_4)_6(OH)_2 al 70\%).
     * *Células óseas:*
       - **Osteoblastos:** Células jóvenes que sintetizan y secretan la matriz osteoide (mineralización activa).
       - **Osteocitos:** Células maduras encerradas en lagunas (osteoplastos) comunicadas por canalículos óseos; mantienen la matriz.
       - **Osteoclastos:** Células gigantes multinucleadas fagocíticas derivadas de monocitos; realizan la **resorción ósea** (degradación y remodelado óseo mediante secreción de ácidos y colagenasas).
     * *Estructura del Hueso Compacto:* Organizado en unidades microscópicas cilíndricas llamadas **Sistemas de Havers u Osteonas**, atravesadas centralmente por el **Conducto de Havers** (que transporta vasos sanguíneos y nervios), interconectadas transversalmente por los **Conductos de Volkmann**.
   * **Tejido Sanguíneo:** Tejido conectivo fluido:
     * *Plasma Sanguíneo (55\%):* Agua (90\%), sales y proteínas plasmáticas esenciales: **albúmina** (mantiene la presión oncótica coloidosmótica), **inmunoglobulinas** y **fibrinógeno** (coagulación).
     * *Elementos Formes (45\%):*
       - **Glóbulos Rojos (Eritrocitos o Hematíes):** Discos bicóncavos anucleados (en mamíferos), repletos de hemoglobina para el transporte de O_2 y CO_2. Vida media: 120 días.
       - **Glóbulos Blancos (Leucocitos):** Células inmunitarias con núcleo:
         * *Granulocitos:* Neutrófilos (fagocitan bacterias, primera línea), Eosinófilos (parásitos helmintos y alergias), Basófilos (histamina y heparina).
         * *Agranulocitos:* Linfocitos T y B (inmunidad específica adaptativa), Monocitos (se transforman en macrófagos tisulares).
       - **Plaquetas (Trombocitos):** Fragmentos citoplasmáticos anucleados desprendidos del **megacariocito** medular; intervienen en la hemostasia primaria y formación del tapón plaquetario.

#### C. Tejido Muscular
Tejido mesodérmico especializado en la generación de fuerza mecánica y movimiento mediante la contracción acoplada de miofilamentos de **actina** y **miosina**:
1. **Músculo Estriado Esquelético:**
   * Células o fibras cilíndricas muy largas, multinucleadas con núcleos periféricos.
   * Presenta estriaciones transversales periódicas visibles al microscopio (sarcómeros delimitados por líneas Z).
   * Contracción: **Voluntaria, rápida y fatigable**. Inervado por el sistema nervioso somático motor.
2. **Músculo Estriado Cardíaco (Miocardio):**
   * Células alargadas bifurcadas o apantalladas con uno o dos núcleos centrales.
   * Presenta sarcómeros y uniones intercelulares especializadas transversales llamadas **Discos Intercalares** (con desmosomas y abundantes uniones en hendidura o *gap junctions* que permiten la conducción bioeléctrica sincrónica del corazón como un sincitio funcional).
   * Contracción: **Involuntaria, rítmica y automática** (marcapasos nodo sinusal), insensible a la fatiga.
3. **Músculo Liso:**
   * Células fusiformes individuales (en huso) con un único núcleo central.
   * **Carece de sarcómeros y estriaciones transversales**; los filamentos de actina y miosina se anclan en *cuerpos densos* citoplasmáticos.
   * Contracción: **Involuntaria, lenta, sostenida y resistente a la fatiga**. Localizado en la pared de vísceras huecas (estómago, intestinos, útero, vejiga) y en la túnica media de vasos sanguíneos (peristaltismo y vasoconstricción).

#### D. Tejido Nervioso
Tejido de origen ectodérmico altamente especializado en la recepción de estímulos, procesamiento de señales y transmisión rápida de impulsos bioeléctricos (potenciales de acción):
1. **Neuronas (Células excitables):**
   * *Morfología:* Soma o pericarion (con corpúsculos de Nissl / RER y núcleo), Dendritas (ramificaciones aferentes receptoras) y Axón o cilindroeje (prolongación eferente única que transmite el potencial de acción hacia el teledendrón y botones sinápticos).
2. **Células de la Glía o Neuroglías (Células de soporte, 10 veces más abundantes que las neuronas, con capacidad de dividirse por mitosis):**
   * **Astrocitos:** Células en forma de estrella con pies vasculares perivasculares (podocitos). Forman la **Barrera Hematoencefálica (BHE)** que protege al SNC de toxinas y patógenos sanguíneos; regulan la homeostasis de K^+ y recaptan neurotransmisores.
   * **Oligodendrocitos:** Células que sintetizan la **vaina de mielina** alrededor de múltiples axones en el **Sistema Nervioso Central (SNC)**.
   * **Células de Schwann (Neurolemocitos):** Sintetizan la **vaina de mielina** alrededor de un axón en el **Sistema Nervioso Periférico (SNP)**; permiten la conducción saltatoria ultrarrápida del impulso nervioso.
   * **Microglía:** Células fagocíticas móviles de origen mesodérmico (macrófagos residentes del tejido nervioso); defensa inmunitaria y limpieza de detritos celulares.
   * **Células Ependimarias:** Revisten los ventrículos cerebrales y el conducto central ependimario de la médula espinal; participan en la circulación y ultrafiltración del Líquido Cefalorraquídeo (LCR).

---

### 4. CUADRO RESUMEN: TEJIDOS DE SOSTÉN Y CONDUCCIÓN COMPARADOS
\begin{array}{|l|c|c|c|}
\hline
\textbf{Tejido} & \textbf{Estado Vital} & \textbf{Composición de Pared} & \textbf{Función Principal} \\
\hline
\textbf{Colénquima} & \text{Células VIVAS} & \text{Celulosa y pectina (engrosamiento angular)} & \text{Soporte flexible en órganos jóvenes} \\
\textbf{Esclerénquima} & \text{Células MUERTAS} & \text{Lignina rígida e impermeable} & \text{Soporte mecánico rígido en órganos adultos} \\
\textbf{Xilema} & \text{Células MUERTAS} & \text{Traqueas y traqueidas lignificadas} & \text{Conducción de Savia Bruta (ascendente)} \\
\textbf{Floema} & \text{Células VIVAS} & \text{Tubos cribosos y células anexas} & \text{Conducción de Savia Elaborada (multidireccional)} \\
\hline
\end{array}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Xilema y Floema:**
  * **XIL-BRU-SUBE:** **Xil**ema transporta savia **Bru**ta y siempre **Sube** (muerto, leño).
  * **FLO-ELA-BAJA:** **Flo**ema transporta savia **Ela**borada y se reparte en todas direcciones (vivo, líber).
* **Mnemotecnia Células Óseas:**
  * **B**lastos **B**uild (Los osteo**b**lastos construyen matriz ósea).
  * **C**lastos **C**hupan/Comen (Los osteo**c**lastos destruyen y resorben matriz ósea).
* **Mnemotecnia Neuroglías de Mielina:**
  * **S-S:** Células de **S**chwann en el **S**NP.
  * **O-C:** **O**ligodendrocitos en el SN**C**.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "El tejido epitelial está profundamente irrigado por capilares".** FALSO TOTAL. El tejido epitelial es **completamente AVASCULAR**; si se corta superficialmente no sangra. Toda su nutrición y oxigenación depende por difusión del tejido conectivo vascularizado subyacente.
* **Trampa 2: Confundir Colénquima con Esclerénquima.** Recuerda siempre: el colénquima está formado por células **vivas** sin lignina (flexible); el esclerénquima está formado por células **muertas** lignificadas (rígido y duro).
* **Trampa 3: "La mielina del cerebro la producen las células de Schwann".** FALSO. En el Sistema Nervioso Central (cerebro y médula espinal) la mielina es sintetizada por los **Oligodendrocitos**. Las **Células de Schwann** sintetizan mielina exclusivamente en el Sistema Nervioso Periférico (nervios raquídeos y craneales).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t06_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"La mielina del cerebro la producen las células de Schwann\". FALSO. En el Sistema Nervioso Central (cerebro y médula espinal) la mielina es sintetizada por los Oligodendr\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t06_s02_c02",
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
                    id = "bio_t06_s02_c03",
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
                    id = "bio_t06_s02_c04",
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
                    id = "bio_t06_s02_c05",
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
                    id = "bio_t06_s02_c06",
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
                    id = "bio_t06_s02_c07",
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
                    id = "bio_t06_s02_c08",
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
                    id = "bio_t06_s02_c09",
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
                    id = "bio_t06_s02_c10",
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
