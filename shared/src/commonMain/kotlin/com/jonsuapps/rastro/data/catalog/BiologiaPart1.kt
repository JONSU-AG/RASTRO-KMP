package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

/**
 * BiologiaPart1: Semanas 1 a 7 (28 niveles) para el temario oficial UNSA / CEPRUNSA.
 * Cubre:
 * Sem 1: La Biología como Ciencia y Método Científico (bio_t01_s01 a bio_t01_s04)
 * Sem 2: Seres Vivos, Características y Niveles de Organización (bio_t02_s01 a bio_t02_s04)
 * Sem 3: Base Química de la Vida: Bioelementos y Biomoléculas Inorgánicas (bio_t03_s01 a bio_t03_s04)
 * Sem 4: Biomoléculas Orgánicas: Glúcidos, Lípidos, Proteínas y Ácidos Nucleicos (bio_t04_s01 a bio_t04_s04)
 * Sem 5: Citología: Célula Procariota y Célula Eucariota (bio_t05_s01 a bio_t05_s04)
 * Sem 6: Fisiología Celular: Fotosíntesis y Respiración Celular (bio_t06_s01 a bio_t06_s04)
 * Sem 7: Histología Vegetal y Animal (bio_t07_s01 a bio_t07_s04)
 */
internal object BiologiaPart1 {
    val lessons: List<LessonNode> = listOf(
        // ==========================================
        // SEMANA 1: LA BIOLOGÍA Y EL MÉTODO CIENTÍFICO
        // ==========================================
        LessonNode(
            id = "bio_t01_s01",
            subjectId = "biologia",
            semana = 1,
            subtema = "Semana 1",
            title = "Naturaleza de la Biología y Ramas",
            theory = LessonTheory(
                id = "th_bio_t01_s01",
                asignatura = "Biología",
                semana = 1,
                titulo = "Objeto de Estudio y Ramas de la Biología",
                resumen = """La biología estudia a los seres vivos en sus múltiples niveles, auxiliándose de disciplinas especializadas.


                    # 1. Definición y Objeto de Estudio
                    Etimológicamente proviene del griego *bios* (vida) y *logos* (estudio). El término fue popularizado por **Jean-Baptiste Lamarck** y **Gottfried Treviranus** (1802). Su objeto es la materia viva en cuanto a estructura, función, evolución y relaciones ecológicas.

                    # 2. Ramas según el Ser Vivo Estudiado
                    - **Zoología:** Animales (Mastozoología: mamíferos, Ornitología: aves, Herpetología: reptiles/anfibios, Ictiología: peces, Entomología: insectos, Malacología: moluscos, Helmintología: gusanos).
                    - **Botánica / Fitología:** Plantas (Criptogámica: musgos y helechos, Fanerogámica: gimnospermas y angiospermas).
                    - **Micología:** Hongos mohos, setas y levaduras.
                    - **Microbiología:** Microorganismos (Bacteriología, Virología, Protozoología).

                    # 3. Ramas según la Perspectiva o Nivel
                    - **Citología:** Células.
                    - **Histología:** Tejidos biológicos.
                    - **Anatomía vs Fisiología:** Estructura macro/micro vs función de los órganos y sistemas.
                    - **Genética:** Mecanismos de la herencia y variación.
                    - **Ecología:** Interacción organismo-ambiente (término acuñado por Ernst Haeckel).
                    - **Etología:** Comportamiento animal.
                """,
                conceptosClave = emptyList(),
                admissionTip = "UNSA suele preguntar por ramas taxonómicas específicas: Malacología (moluscos), Ictiología (peces), Ficología (algas) y Helmintología (gusanos parásitos).",
                admissionExplanation = "Conocer la correspondencia exacta entre objeto biológico y disciplina permite responder las preguntas de relación de columnas sin titubear."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s01_c1",
                    statement = "Un investigador en las lomas de Atiquipa (Arequipa) se dedica a catalogar babosas de tierra y caracoles endémicos, analizando su concha calcárea y rádula. ¿Qué rama de la zoología corresponde a su estudio?",
                    options = listOf(
                        "Herpetología",
                        "Malacología",
                        "Helmintología",
                        "Entomología",
                        "Mastozoología"
                    ),
                    correctIndex = 1,
                    explanation = "La Malacología es la rama de la zoología encargada de estudiar a los moluscos (caracoles, babosas, pulpos, bivalvos). La herpetología estudia reptiles y anfibios; la helmintología gusanos; y la entomología insectos."
                )
            )
        ),
        LessonNode(
            id = "bio_t01_s02",
            subjectId = "biologia",
            semana = 1,
            subtema = "Semana 1",
            title = "Etapas del Método Científico",
            theory = LessonTheory(
                id = "th_bio_t01_s02",
                asignatura = "Biología",
                semana = 1,
                titulo = "Fases Rigurosas del Método Científico",
                resumen = """Proceso ordenado y autocorrectivo que genera conocimiento validado sobre los fenómenos naturales.


                    # 1. Observación Rigurosa
                    Uso de los sentidos e instrumentos para percibir un hecho o anomalía de forma objetiva y cuantificable.

                    # 2. Planteamiento del Problema
                    Formulación de una pregunta clara y delimitada, comúnmente en la forma: *¿De qué manera la variable X afecta el fenómeno Y?*

                    # 3. Hipótesis Científica
                    **Respuesta tentativa o proposición condicional** formulada para explicar el problema planteado. Debe ser **falsable** y susceptible de someterse a prueba empírica.

                    # 4. Experimentación
                    Diseño controlado para contrastar la hipótesis. Requiere un **grupo experimental** (sujeto a la variable modificada) y un **grupo control** (en condiciones estándar para servir de testigo).

                    # 5. Análisis de Resultados y Conclusión
                    Interpretación estadística de datos. Si los datos corroboran la hipótesis, se acepta; si la contradicen, se rechaza o reformula.

                    # 6. Teoría y Ley
                    - **Teoría:** Explicación amplia, unificadora y comprobada de múltiples fenómenos naturales (ej. Teoría Celular, Teoría de la Evolución).
                    - **Ley:** Enunciado descriptivo, habitualmente matemático, universal e invariable bajo condiciones dadas (ej. Leyes de Mendel).
                """,
                conceptosClave = emptyList(),
                admissionTip = "Recuerda que una hipótesis nunca se 'demuestra como verdad absoluta e incuestionable'; se corrobora, se valida o se rechaza provisionalmente dentro de los límites del experimento.",
                admissionExplanation = "El dogmatismo no cabe en la ciencia: el método científico es intrínsecamente falsacionista y reproducible."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s02_c1",
                    statement = "Antes de iniciar un cultivo de microalgas en la costa arequipeña, un biólogo postula: 'Si se incrementa la concentración de nitratos en el agua salobre, entonces la tasa de biomasa aumentará un 40%'. Esta afirmación provisional y contrastable corresponde a:",
                    options = listOf(
                        "Una ley invariable",
                        "Una teoría consolidada",
                        "Una hipótesis",
                        "Una conclusión definitiva",
                        "Una observación sensorial"
                    ),
                    correctIndex = 2,
                    explanation = "La formulación provisional de una explicación o predicción que vincula causas y efectos y que será sometida a prueba experimental se denomina Hipótesis."
                )
            )
        ),
        LessonNode(
            id = "bio_t01_s03",
            subjectId = "biologia",
            semana = 1,
            subtema = "Semana 1",
            title = "Variables y Diseño Experimental",
            theory = LessonTheory(
                id = "th_bio_t01_s03",
                asignatura = "Biología",
                semana = 1,
                titulo = "Variables en la Investigación Biológica",
                resumen = """La correcta identificación y aislamiento de variables garantiza la validez interna del experimento.


                    # 1. Variable Independiente (VI)
                    Es la variable **manipulada o causa deliberada** que el investigador modifica intencionalmente para evaluar su efecto (ej. dosis de un fertilizante, temperatura de incubación, pH del medio).

                    # 2. Variable Dependiente (VD)
                    Es la variable **medida o respuesta (efecto)**. Su variación depende de la manipulación de la variable independiente (ej. longitud del tallo, porcentaje de germinación, volumen de O_2$ liberado).

                    # 3. Variables Intervinientes / Controladas
                    Son todos los factores adicionales que podrían influir en la variable dependiente y que deben **mantenerse estrictamente constantes** en todos los grupos para no distorsionar el resultado (ej. cantidad de luz, tipo de suelo, volumen de agua suministrado).

                    # 4. Grupo Testigo o Control
                    Sirve de patrón de referencia basal. No recibe el tratamiento experimental de la VI (o recibe un placebo/condición natural) para verificar si el cambio observado es genuino.
                """,
                conceptosClave = emptyList(),
                admissionTip = "En los exámenes de admisión DECO te presentan un párrafo con un experimento agrícola o médico y te piden identificar cuál es la variable dependiente. Busca siempre lo que se mide al final.",
                admissionExplanation = "Diferenciar la causa (VI) del efecto medido (VD) resuelve de inmediato el 100% de preguntas de diseño experimental."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s03_c1",
                    statement = "Para comprobar la resistencia de la papa nativa a las heladas en Caylloma, se exponen 50 plántulas a -3 °C y otras 50 plántulas idénticas a 18 °C manteniendo idéntica iluminación, sustrato y humedad. Tras 7 días, se mide el porcentaje de clorofila degradada. ¿Cuál es la variable dependiente?",
                    options = listOf(
                        "La temperatura ambiental de ensayo",
                        "La concentración de humedad del sustrato",
                        "El porcentaje de clorofila degradada",
                        "La variedad de papa nativa",
                        "El fotoperíodo de iluminación"
                    ),
                    correctIndex = 2,
                    explanation = "La variable dependiente es el efecto que el científico mide como resultado del tratamiento: en este caso, el porcentaje de clorofila degradada. La temperatura es la variable independiente (manipulada)."
                )
            )
        ),
        LessonNode(
            id = "bio_t01_s04",
            subjectId = "biologia",
            semana = 1,
            subtema = "Semana 1",
            title = "Microscopía y Bioseguridad",
            theory = LessonTheory(
                id = "th_bio_t01_s04",
                asignatura = "Biología",
                semana = 1,
                titulo = "Microscopía y Normas de Bioseguridad",
                resumen = """Herramientas de magnificación y principios de contención del riesgo biológico.


                    # 1. Microscopía Óptica Compuesta (MOC)
                    - Utiliza luz visible (λ ≈ 400-700 nm) y un sistema de lentes (ocular y objetivos).
                    - **Límite de resolución:** ≈ 0.2 μm (200 nm).
                    - **Aumento total:** Aumento Ocular × Aumento Objetivo (ej. 10× × 40× = 400×).
                    - Permite observar células vivas, núcleos, bacterias grandes y mitosis teñida.

                    # 2. Microscopía Electrónica
                    Utiliza un haz de electrones con longitud de onda miles de veces menor que los fotones. Límite de resolución: ≈ 0.2 nm.
                    - **Transmisión (MET):** Los electrones atraviesan cortes ultrafinos; visualiza **ultraestructura interna** (organelos, membranas, ribosomas).
                    - **Barrido (MEB):** Los electrones rebotan en la superficie metalizada; proporciona **imágenes tridimensionales (3D)** de superficies.

                    # 3. Principios de Bioseguridad
                    - **Universalidad:** Todo fluido o muestra biológica se asume potencialmente infeccioso.
                    - **Barreras de protección:** Primarias (guantes, mascarillas, mandiles) y secundarias (cabinas de flujo laminar, autoclaves).
                    - **Niveles de Bioseguridad (BSL):** Desde BSL-1 (microorganismos no patógenos, *E. coli* K12) hasta BSL-4 (virus letales sin tratamiento, Ébola, Marburg).
                """,
                conceptosClave = emptyList(),
                admissionTip = "Si la pregunta menciona 'observación en 3D de la morfología externa de los cilios de un paramecio', la clave es Microscopio Electrónico de Barrido (MEB). Si pide 'crestas mitocondriales internas', es MET.",
                admissionExplanation = "Barrido = relieve/superficie 3D; Transmisión = ultraestructura interna de cortes en 2D."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s04_c1",
                    statement = "Un virólogo requiere observar los capsómeros de la cápside externa tridimensional de un nuevo bacteriófago aislado en un efluente. ¿Qué equipo microscópico es el idóneo para este propósito?",
                    options = listOf(
                        "Microscopio óptico de campo claro",
                        "Microscopio electrónico de barrido (MEB)",
                        "Microscopio estereoscópico o lupa binocular",
                        "Microscopio óptico de contraste de fases",
                        "Microscopio de fluorescencia convencional"
                    ),
                    correctIndex = 1,
                    explanation = "El microscopio electrónico de barrido (MEB) ofrece la resolución nanométrica necesaria para visualizar entidades subcelulares/virales y proporciona una imagen tridimensional de su superficie externa."
                )
            )
        ),

        // ==========================================
        // SEMANA 2: SERES VIVOS Y NIVELES DE ORGANIZACIÓN
        // ==========================================
        LessonNode(
            id = "bio_t02_s01",
            subjectId = "biologia",
            semana = 2,
            subtema = "Semana 2",
            title = "Organización Compleja y Metabolismo",
            theory = LessonTheory(
                id = "th_bio_t02_s01",
                asignatura = "Biología",
                semana = 2,
                titulo = "Metabolismo y Organización Biológica",
                resumen = """Los seres vivos mantienen su alta organización mediante un flujo constante de materia y energía.


                    # 1. Organización Compleja y Específica
                    La materia viva no es un agregado fortuito de átomos; sigue una jerarquía estructural donde cada nivel presenta **propiedades emergentes** ausentes en los niveles inferiores. La unidad biológica fundamental es la **célula**.

                    # 2. Metabolismo Celular
                    Conjunto de reacciones bioquímicas coordinadas que ocurren dentro del organismo para intercambiar materia y energía con el entorno. Se subdivide en dos ramas antagónicas y acopladas:

                    ## A. Anabolismo (Asimilación / Endergónico)
                    - Proceso de **síntesis** de moléculas complejas a partir de precursores simples.
                    - **Consume energía libre** (ΔG > 0, endergónico, absorbe ATP).
                    - Ejemplos: Fotosíntesis, síntesis de proteínas (traducción), gluconeogénesis, síntesis de glucógeno.

                    ## B. Catabolismo (Degradación / Exergónico)
                    - Proceso de **degradación u oxidación** de moléculas complejas ricas en energía hacia productos simples.
                    - **Libera energía útil** (ΔG < 0, exergónico, sintetiza ATP).
                    - Ejemplos: Glucólisis, ciclo de Krebs, respiración celular, digestión de macromoléculas, fermentación.
                """,
                conceptosClave = listOf(
                    "Anabolismo: De simple a complejo, consume energía (endergónico)"
                ),
                admissionTip = "Para recordar la diferencia: 'Ana construye' (anabolismo sintetiza) y 'Cata destruye' (catabolismo degrada para obtener ATP).",
                admissionExplanation = "El acoplamiento energético catalizado por enzimas es el pilar central del funcionamiento celular continuo."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s01_c1",
                    statement = "Durante el período de descanso nocturno, los hepatocitos polimerizan moléculas de glucosa-6-fosfato para almacenar glucógeno hepático. Este proceso bioquímico clasifica fundamentalmente como:",
                    options = listOf(
                        "Vía catabólica exergónica",
                        "Vía anabólica endergónica",
                        "Digestión oxidativa",
                        "Fermentación descarboxilativa",
                        "Lisis hidrolítica"
                    ),
                    correctIndex = 1,
                    explanation = "La síntesis de glucógeno (glucogenogénesis) es la construcción de un polímero complejo a partir de monómeros simples, lo cual requiere consumo de energía (ATP/UTP); por tanto, es una vía anabólica y endergónica."
                )
            )
        ),
        LessonNode(
            id = "bio_t02_s02",
            subjectId = "biologia",
            semana = 2,
            subtema = "Semana 2",
            title = "Homeostasis, Irritabilidad y Adaptación",
            theory = LessonTheory(
                id = "th_bio_t02_s02",
                asignatura = "Biología",
                semana = 2,
                titulo = "Mecanismos de Estabilidad y Respuesta Biológica",
                resumen = """Capacidades de los seres vivos para regular su equilibrio interno y responder a estímulos transitorios o permanentes.


                    # 1. Homeostasis
                    Concepto introducido por **Claude Bernard** y acuñado por **Walter Cannon**. Es la capacidad de mantener un **medio interno en equilibrio dinámico y constante** frente a variaciones externas (ej. regulación de la glucemia a ≈ 90 mg/dL, pH sanguíneo en 7.35-7.45, temperatura corporal mediante sudoración o vasoconstricción).

                    # 2. Irritabilidad vs Adaptación
                    - **Irritabilidad:** Respuesta **inmediata, transitoria y reversible** frente a un estímulo químico, lumínico o mecánico del entorno (ej. contracción pupilar ante luz intensa, retirada de la mano ante un pinchazo, nastias y tactismos en protistas).
                    - **Adaptación:** Modificación morfológica, fisiológica o etológica **a largo plazo**, adquirida por una población a través de generaciones bajo selección natural, que incrementa su eficacia biológica o supervivencia (ej. hojas modificadas en espinas del cactus para evitar deshidratación en zonas áridas).
                """,
                conceptosClave = emptyList(),
                admissionTip = "Diferencia temporal clave: si la respuesta dura segundos o minutos (retirar la mano, dilatar la pupila, cerrar las hojas de la mimosa) es IRRITABILIDAD. Si es un rasgo anatómico fijado por selección natural es ADAPTACIÓN.",
                admissionExplanation = "Confundir irritabilidad con adaptación es uno de los distractores más recurrentes en el examen ordinario y CEPRUNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s02_c1",
                    statement = "La vicuña (*Vicugna vicugna*) del altiplano andino posee una hemoglobina con altísima afinidad por el oxígeno molecular y eritrocitos elípticos abundantes, lo que le permite sobrevivir a más de 4000 m.s.n.m. Esta característica es un ejemplo conspicuo de:",
                    options = listOf(
                        "Irritabilidad transitoria",
                        "Adaptación biológica",
                        "Metabolismo catabólico",
                        "Taxismo negativo",
                        "Nastia reversible"
                    ),
                    correctIndex = 1,
                    explanation = "Se trata de un rasgo fisiológico heredable y permanente seleccionado evolutivamente en la población para subsistir con baja presión de oxígeno; corresponde a una adaptación biológica."
                )
            )
        ),
        LessonNode(
            id = "bio_t02_s03",
            subjectId = "biologia",
            semana = 2,
            subtema = "Semana 2",
            title = "Reproducción y Crecimiento",
            theory = LessonTheory(
                id = "th_bio_t02_s03",
                asignatura = "Biología",
                semana = 2,
                titulo = "Continuidad de la Vida y Desarrollo",
                resumen = """Mecanismos para perpetuar la especie y el desarrollo individual a lo largo del ciclo vital.


                    # 1. Reproducción Asexual
                    - Participa **un solo progenitor**, sin fusión de gametos.
                    - Ocurre mediante mitosis (o fisión binaria).
                    - **Genera clones:** Descendientes genéticamente idénticos al parental (sin variabilidad, salvo mutaciones).
                    - Ventaja: Alta velocidad y bajo gasto energético. Desventaja: Nula adaptabilidad ante catástrofes ambientales.
                    - Modalidades: Bipartición (bacterias), gemación (levaduras, hidras), esporulación (protozoos), fragmentación (planarias, estrellas de mar), partenogénesis.

                    # 2. Reproducción Sexual
                    - Intervienen generalmente **dos progenitores**, con producción y **fecundación de gametos haploides** (n$).
                    - Implica meiosis con **recombinación genética (crossing-over)**.
                    - **Genera alta variabilidad genética:** Base fundamental para la evolución biológica y adaptación.

                    # 3. Crecimiento y Desarrollo
                    - **Crecimiento:** Aumento de masa y volumen celular (hipertrofia en unicelulares) o incremento del número de células mediante mitosis (hiperplasia en pluricelulares).
                    - **Desarrollo:** Cambios cualitativos, diferenciación y especialización celular a lo largo de la ontogenia.
                """,
                conceptosClave = emptyList(),
                admissionTip = "La partenogénesis (desarrollo de un individuo a partir de un óvulo no fecundado, como en los zánganos de las abejas) se clasifica en los prospectos UNSA como una variante asexual/monoparental particular.",
                admissionExplanation = "El cruce meiótico y la fecundación al azar son las dos fuentes cardinales de recombinación génica en la reproducción sexual."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s03_c1",
                    statement = "En un cultivo agrícola se propagan plantas de fresa mediante estolones horizontales que arraigan y forman nuevas plantas. En relación con este mecanismo reproductivo, se puede afirmar con certeza que:",
                    options = listOf(
                        "Genera amplia variabilidad fenotípica por crossing-over",
                        "Los descendientes son clones genéticamente idénticos a la planta madre",
                        "Requiere obligatoriamente la formación de microsporas y óvulos",
                        "Disminuye drásticamente la tasa de multiplicación vegetal",
                        "Involucra reducción cromosómica meiótica en el estolón"
                    ),
                    correctIndex = 1,
                    explanation = "La reproducción por estolones es una forma de multiplicación vegetativa (asexual) basada en mitosis. Al no haber fecundación ni recombinación meiótica, las nuevas plantas son copias genéticamente idénticas (clones)."
                )
            )
        ),
        LessonNode(
            id = "bio_t02_s04",
            subjectId = "biologia",
            semana = 2,
            subtema = "Semana 2",
            title = "Niveles de Organización Ecológica y Biológica",
            theory = LessonTheory(
                id = "th_bio_t02_s04",
                asignatura = "Biología",
                semana = 2,
                titulo = "Jerarquía de los Niveles de Organización",
                resumen = """Estructura ascendente de complejidad: nivel químico, biológico y ecológico.


                    # 1. Nivel Químico (Abiótico / Subcelular)
                    - **Subatómico:** Protones, neutrones, electrones.
                    - **Atómico:** Bioelementos (C, H, O, N, Fe$).
                    - **Molecular:** Biomoléculas simples (H_2O, CO_2$, glucosa, aminoácidos).
                    - **Macromolecular:** Proteínas, ácidos nucleicos, glucógeno, lípidos complejos.
                    - **Supramolecular:** Complejos constituidos por diferentes macromoléculas (ribosomas, cromatina, membrana celular, **virus**). *¡Los virus se ubican en este nivel!*

                    # 2. Nivel Biológico (Biótico / Celular a Sistémico)
                    - **Celular:** Primera unidad viva y autónoma (*célula procariota y eucariota*).
                    - **Tisular:** Conjunto de células con mismo origen y función (tejidos).
                    - **Organológico:** Órganos formados por diversos tejidos (corazón, hoja, riñón).
                    - **Sistémico:** Conjunto de órganos coordinados (sistema digestivo, nervioso).
                    - **Individuo:** Organismo vivo integrado (unicelular o pluricelular).

                    # 3. Nivel Ecológico (Poblacional a Biosfera)
                    - **Población:** Individuos de la **misma especie** que coexisten en un espacio y tiempo determinado (ej. manada de vicuñas en Pampa Cañahuas en 2024).
                    - **Comunidad o Biocenosis:** Conjunto de **poblaciones de distintas especies** que interactúan en un área determinada.
                    - **Ecosistema:** Interacción de la biocenosis (seres vivos) con el biotopo (factores abióticos: suelo, clima, radiación).
                    - **Bioma:** Grandes zonas bioclimáticas (tundra, taiga, desierto, selva).
                    - **Biosfera:** Franja del planeta Tierra habitada por seres vivos.
                """,
                conceptosClave = listOf(
                    "Los virus son complejos supramoleculares (macromoléculas asociadas)"
                ),
                admissionTip = "Pregunta clásica UNSA: '¿En qué nivel de organización se ubica el virus del dengue o el SARS-CoV-2?' Respuesta inequívoca: Nivel supramolecular (complejo supramolecular abiótico).",
                admissionExplanation = "Los virus carecen de metabolismo propio y organización celular; están formados por ácido nucleico rodeado de cápside proteica."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s04_c1",
                    statement = "En la Reserva Nacional de Salinas y Aguada Blanca cohabitan flamencos andinos, parihuanas, truchas, pastizales de tola e ichu, interactuando con las lagunas salinas y la radiación solar. El conjunto formado únicamente por todas las poblaciones de seres vivos se denomina:",
                    options = listOf(
                        "Biotopo",
                        "Ecosistema",
                        "Biocenosis o comunidad",
                        "Población multiespecífica",
                        "Bioma continental"
                    ),
                    correctIndex = 2,
                    explanation = "El conjunto exclusivo de poblaciones vivas de diversas especies que interactúan en un hábitat dado constituye la Biocenosis o Comunidad biológica. Al sumar los factores abióticos (biotopo) se forma el Ecosistema."
                )
            )
        ),

        // ==========================================
        // SEMANA 3: BIOELEMENTOS Y BIOMOLÉCULAS INORGÁNICAS
        // ==========================================
        LessonNode(
            id = "bio_t03_s01",
            subjectId = "biologia",
            semana = 3,
            subtema = "Semana 3",
            title = "Clasificación de los Bioelementos",
            theory = LessonTheory(
                id = "th_bio_t03_s01",
                asignatura = "Biología",
                semana = 3,
                titulo = "Composición Atómica de la Materia Viva",
                resumen = """Bioelementos clasificados según su abundancia ponderal y funciones fisiológicas críticas.


                    # 1. Bioelementos Primarios u Organógenos (≈ 96-99%)
                    - **C, H, O, N:** Constituyen los esqueletos de las biomoléculas orgánicas gracias al bajo peso atómico y capacidad del carbono de formar 4 enlaces covalentes estables.
                    - **P, S:** El fósforo integra nucleótidos, ácidos nucleicos y fosfolípidos; el azufre forma parte de aminoácidos azufrados (cisteína, metionina) y puentes disulfuro proteicos.

                    # 2. Bioelementos Secundarios (≈ 3-4%)
                    Indispensables para la homeostasis iónica y fisiológica:
                    - **Calcio (Ca²⁺):** Dientes y huesos (hidroxiapatita), contracción muscular, sinapsis y coagulación sanguínea.
                    - **Sodio (Na⁺) y Potasio (K⁺):** Potencial de membrana, bomba Na⁺/K⁺ ATPasa, impulso nervioso. Na⁺ es el principal catión extracelular; K⁺ el principal catión intracelular.
                    - **Cloro (Cl⁻):** Principal anión extracelular, balance hídrico, componente del ácido clorhídrico estomacal (HCl).
                    - **Magnesio (Mg²⁺):** Átomo central de la molécula de **clorofila**, cofactor de quinasas y estabilizador de subunidades ribosómicas.

                    # 3. Oligoelementos o Elementos Traza (< 0.1%)
                    Presentes en cantidades ínfimas pero vitales:
                    - **Hierro (Fe):** Núcleo de la hemoglobina, mioglobina y citocromos respiratorios. Su deficiencia produce anemia ferropénica.
                    - **Yodo (I):** Componente de las hormonas tiroideas (T₃ y T₄). Su déficit causa bocio y cretinismo.
                    - **Cinc (Zn):** Componente de la anhidrasa carbónica y cofactor en la síntesis proteica e inmunidad.
                    - **Flúor (F):** Esmalte dental (fluorapatita) que previene la caries.
                    - **Cobre (Cu):** Componente de la hemocianina (pigmento respiratorio de artrópodos y moluscos) y citocromo c oxidasa.
                """,
                conceptosClave = emptyList(),
                admissionTip = "CEPRUNSA insiste constantemente en la comparación entre la clorofila (Magnesio) y la hemoglobina (Hierro), y el rol del Yodo en la tiroides.",
                admissionExplanation = "Relacionar cada oligoelemento con su proteína o metaloenzima correspondiente permite responder con rapidez meridiana."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s01_c1",
                    statement = "Un paciente en una comunidad andina acude al centro de salud presentando un agrandamiento conspicuo en la base anterior del cuello (bocio) y letargia metabólica. El médico sospecha un déficit crónico en la dieta de un oligoelemento indispensable para la síntesis de:",
                    options = listOf(
                        "Hierro para la síntesis de mioglobina",
                        "Yodo para la síntesis de tiroxina y triyodotironina",
                        "Calcio para la secreción de calcitonina",
                        "Magnesio para la activación de la clorofila",
                        "Cobre para la producción de hemocianina"
                    ),
                    correctIndex = 1,
                    explanation = "El yodo es un oligoelemento esencial para sintetizar las hormonas tiroideas (T₃ y T₄). Su carencia dietética impide la síntesis hormonal, provocando una hiperestimulación por TSH y el desarrollo de bocio endémico."
                )
            )
        ),
        LessonNode(
            id = "bio_t03_s02",
            subjectId = "biologia",
            semana = 3,
            subtema = "Semana 3",
            title = "El Agua: Estructura y Puentes de Hidrógeno",
            theory = LessonTheory(
                id = "th_bio_t03_s02",
                asignatura = "Biología",
                semana = 3,
                titulo = "Fisicoquímica del Agua Biológica",
                resumen = """El dipolo del agua y la red de puentes de hidrógeno condicionan sus propiedades fisicoquímicas únicas.


                    # 1. Geometría Molecular y Polaridad
                    La molécula de H₂O presenta un átomo de oxígeno unido covalentemente a dos hidrógenos formando un ángulo de **104.5°**. Debido a la elevada electronegatividad del oxígeno frente al hidrógeno, se genera una distribución asimétrica de carga:
                    - Densidad de carga parcial negativa (δ⁻) en el oxígeno.
                    - Densidad de carga parcial positiva (δ⁺) en los hidrógenos.
                    El agua es una **molécula polar (dipolo eléctrico)** sin carga neta.

                    # 2. El Puente de Hidrógeno
                    Atracción electrostática entre el polo δ⁻ del oxígeno de una molécula de agua y el polo δ⁺ del hidrógeno de otra molécula adyacente.
                    - Cada molécula de agua líquida puede formar en promedio hasta **3.4 a 4 puentes de hidrógeno** transitorios.
                    - La constante formación y ruptura de esta red confiere al agua su cohesión interna y comportamiento como líquido a temperatura ambiente.
                """,
                conceptosClave = emptyList(),
                admissionTip = "No confundir el enlace covalente intramolecular (que une H con O dentro de una misma molécula) con el puente de hidrógeno intermolecular (que une dos moléculas de agua distintas).",
                admissionExplanation = "Las propiedades anómalas del agua (elevada temperatura de ebullición, densidad máxima a 4 °C) derivan de su red de puentes de hidrógeno."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s02_c1",
                    statement = "A temperatura ambiental (20 °C), el sulfuro de hidrógeno (H₂S, masa molar 34 g/mol) es un gas tóxico, mientras que el agua (H₂O, masa molar 18 g/mol) es un líquido denso. La causa primordial de esta diferencia radica en:",
                    options = listOf(
                        "Los enlaces iónicos fuertes entre iones hidronio e hidroxilo",
                        "La presencia de enlaces peptídicos intramoleculares en el agua",
                        "La capacidad de las moléculas de agua de formar redes de puentes de hidrógeno",
                        "El mayor peso atómico del oxígeno frente al azufre",
                        "La total ausencia de momentos dipolares en la molécula de agua"
                    ),
                    correctIndex = 2,
                    explanation = "La gran electronegatividad del oxígeno permite formar puentes de hidrógeno intermoleculares fuertes y extensos en el agua líquida, requiriendo mucha energía para evaporarse; el azufre, menos electronegativo, no forma puentes eficaces, por lo que el H₂S es gas."
                )
            )
        ),
        LessonNode(
            id = "bio_t03_s03",
            subjectId = "biologia",
            semana = 3,
            subtema = "Semana 3",
            title = "Propiedades Biológicas del Agua",
            theory = LessonTheory(
                id = "th_bio_t03_s03",
                asignatura = "Biología",
                semana = 3,
                titulo = "Funciones Termorreguladoras y Mecánicas del Agua",
                resumen = """Las propiedades emergentes del agua sostienen la vida y la termorregulación de los ecosistemas.


                    # 1. Elevado Calor Específico
                    Se requiere 1 caloría para elevar en 1 °C un gramo de agua líquida (1 cal/g °C). Absorbe o libera ingentes cantidades de calor con mínimas variaciones de temperatura: **amortiguador térmico o termorregulador**.

                    # 2. Elevado Calor de Vaporización
                    Requiere ≈ 540 cal/g para pasar de líquido a vapor. Al evaporarse el sudor en la superficie cutánea, disipa rápidamente el calor corporal: **mecanismo de enfriamiento evaporativo**.

                    # 3. Cohesión, Adhesión y Capilaridad
                    - **Cohesión:** Fuerza con que las moléculas de agua se atraen entre sí (alta **tensión superficial**, permite a insectos acuáticos caminar sobre ella).
                    - **Adhesión:** Atracción entre el agua y superficies polares cargadas.
                    - **Capilaridad:** Ascenso espontáneo del agua por conductos estrechos (clave para el ascenso de la savia bruta por los vasos del xilema).

                    # 4. Solvente Universal y Densidad Anómala
                    - Disuelve sustancias iónicas y polares formando **capas de solvatación**.
                    - **Densidad máxima a 4 °C:** El hielo (0 °C) es menos denso que el agua líquida porque la red cristalina de puentes de hidrógeno deja espacios huecos. Por ello el hielo flota, aislando térmicamente el fondo de lagos y ríos y permitiendo la vida acuática subyacente.
                """,
                conceptosClave = listOf(
                    "Alto calor específico = amortiguador térmico del organismo y del clima.",
                    "Alto calor de vaporización = refrigeración eficiente mediante la sudoración.",
                    "Capilaridad (cohesión + adhesión)"
                ),
                admissionTip = "Si la pregunta alude a por qué los lagos no se congelan por completo en invierno protegiendo a los peces, la respuesta es la densidad anómala del agua (el hielo flota).",
                admissionExplanation = "Esta anomalía del agua es uno de los temas favoritos en física biológica y ecología preuniversitaria."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s03_c1",
                    statement = "Durante una carrera de 10 kilómetros bajo el sol en el valle de Majes, un atleta transpira profusamente. La evaporación del sudor en su epidermis le permite mantener la temperatura corporal dentro de límites fisiológicos gracias a que el agua posee:",
                    options = listOf(
                        "Bajo calor específico de disolución",
                        "Elevado calor latente de vaporización",
                        "Una densidad anómala máxima a 0 °C",
                        "Un ángulo de enlace covalente de 180°",
                        "Baja tensión superficial intermolecular"
                    ),
                    correctIndex = 1,
                    explanation = "El elevado calor de vaporización del agua ($540\text{ cal/g}$) hace que cada gramo evaporado absorba una gran cantidad de energía calórica de la piel, enfriando eficazmente el cuerpo."
                )
            )
        ),
        LessonNode(
            id = "bio_t03_s04",
            subjectId = "biologia",
            semana = 3,
            subtema = "Semana 3",
            title = "Sales Minerales y Amortiguadores de pH",
            theory = LessonTheory(
                id = "th_bio_t03_s04",
                asignatura = "Biología",
                semana = 3,
                titulo = "Sales Minerales, Ósmosis y Buffers",
                resumen = """Regulación osmótica celular y sistemas amortiguadores ácido-base.


                    # 1. Estados de las Sales Minerales
                    - **Precipitadas (Insolubles):** Estructurales y de sostén (carbonato de calcio en conchas de moluscos, hidroxiapatita de calcio en huesos y dientes, sílice en diatomeas).
                    - **Disueltas (Ionizadas):** Electrolitos libres (Na^+, K^+, Ca^{2+}, Cl^-, HCO_3^-, HPO_4^{2-}$). Mantienen la presión osmótica y el equilibrio ácido-base.

                    # 2. Ósmosis y Comportamiento Celular
                    Difusión pasiva del solvente (agua) a través de una membrana semipermeable desde un medio hipotónico hacia uno hipertónico:
                    - **En medio Hipertónico (alta concentración salina externa):** El agua sale de la célula.
                      - Célula animal: Se arruga y encoge (**Crenación**).
                      - Célula vegetal: La vacuola pierde agua y la membrana se separa de la pared (**Plasmólisis**).
                    - **En medio Hipotónico (baja concentración salina externa):** El agua ingresa a la célula.
                      - Célula animal: Se hincha y estalla (**Lisis / Hemólisis** en eritrocitos).
                      - Célula vegetal: Absorbe agua y ejerce presión contra la pared rígida (**Turgencia**), sin estallar.

                    # 3. Sistemas Amortiguadores (Buffers o Tampones)
                    Evitan fluctuaciones bruscas de pH captando o liberando iones H⁺:
                    - **Buffer Bicarbonato (H₂CO₃ / HCO₃⁻):** Principal amortiguador en el líquido extracelular y **sangre humana** (pH ≈ 7.4).
                    - **Buffer Fosfato (H₂PO₄⁻ / HPO₄²⁻):** Principal amortiguador en el **líquido intracelular**.
                """,
                conceptosClave = emptyList(),
                admissionTip = "Ten clarísimo el par: Célula vegetal en agua pura = TURGENCIA (la pared de celulosa impide que reviente). Eritrocito en agua pura = HEMÓLISIS (no tiene pared, estalla).",
                admissionExplanation = "La presencia de la pared celular celulósica es la que marca la diferencia fisiológica decisiva entre células animales y vegetales frente a la presión osmótica."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s04_c1",
                    statement = "Si se colocan glóbulos rojos humanos en un tubo de ensayo que contiene una solución salina hipertónica de NaCl al 5%, se observará al microscopio que las células:",
                    options = listOf(
                        "Experimentan lisis osmótica inmediata al ingresar agua masivamente",
                        "Sufren crenación debido a la pérdida neta de agua hacia el medio externo",
                        "Alcanzan un estado de turgencia extrema gracias a su citoesqueleto",
                        "Sufren plasmólisis con desprendimiento de su pared celular",
                        "Mantienen su volumen inalterado por transporte activo de sacarosa"
                    ),
                    correctIndex = 1,
                    explanation = "En un medio hipertónico, el agua intracelular difunde hacia el exterior por ósmosis. Al carecer de pared celular rígida, los glóbulos rojos se deshidratan y colapsan, fenómeno denominado crenación."
                )
            )
        ),

        // ==========================================
        // SEMANA 4: BIOMOLÉCULAS ORGÁNICAS
        // ==========================================
        LessonNode(
            id = "bio_t04_s01",
            subjectId = "biologia",
            semana = 4,
            subtema = "Semana 4",
            title = "Glúcidos: Monosacáridos y Polisacáridos",
            theory = LessonTheory(
                id = "th_bio_t04_s01",
                asignatura = "Biología",
                semana = 4,
                titulo = "Estructura y Clasificación de Glúcidos",
                resumen = """Hidratos de carbono: fuente primaria de energía inmediata y arquitectura de sostén biológico.


                    # 1. Definición y Monómeros
                    Compuestos ternarios (C, H, O) con fórmula empírica (CH₂O)n. Son polihidroxialdehídos o polihidroxicetonas.
                    - **Monosacáridos (Glúcidos simples):**
                      - Pentosas (5C): **Ribosa** (ARN, ATP) y **Desoxirribosa** (ADN).
                      - Hexosas (6C): **Glucosa** (dextrosa, principal combustible celular), **Galactosa** (leche) y **Fructosa** (levulosa, azúcar de frutas y semen).

                    # 2. Disacáridos (Enlace Glucosídico)
                    Se forman por condensación de dos monosacáridos con liberación de una molécula de agua mediante un enlace covalente **glucosídico**:
                    - **Maltosa:** Glucosa + Glucosa (α-1,4).
                    - **Lactosa:** Glucosa + Galactosa (β-1,4) (azúcar de la leche).
                    - **Sacarosa:** Glucosa + Fructosa (α-1,2) (azúcar de caña, no reductor).

                    # 3. Polisacáridos
                    Polímeros de cientos a miles de glucosas:
                    - **De Reserva Energética:**
                      - **Almidón:** Reserva en vegetales (amilosa helicoidal no ramificada α-1,4 + amilopectina ramificada α-1,6).
                      - **Glucógeno:** Reserva en animales (hígado y músculo esquelético) y hongos, altamente ramificado.
                    - **Estructurales:**
                      - **Celulosa:** Pared celular de plantas y algas (enlaces β-1,4 lineales, indigerible para humanos: fibra dietética).
                      - **Quitina:** Pared celular de hongos y exoesqueleto de artrópodos (polímero de N-acetilglucosamina con enlaces β-1,4).
                """,
                conceptosClave = listOf(
                    "Monómero = glucosa; Enlace = glucosídico.",
                    "Reserva: Almidón (plantas)"
                ),
                admissionTip = "La quitina no es un polímero de glucosa pura; es de N-acetilglucosamina (glucosa aminada) y contiene NITRÓGENO.",
                admissionExplanation = "Diferenciar la composición química de la quitina respecto a los demás polisacáridos es un clásico reactivo de examen."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s01_c1",
                    statement = "El exoesqueleto endurecido de los camarones de río del valle de Camaná y las paredes celulares de los mohos miceliales comparten un polisacárido estructural constituido por unidades de N-acetilglucosamina unidas por enlace beta. Este polisacárido es:",
                    options = listOf(
                        "Celulosa",
                        "Amilosa",
                        "Glucógeno",
                        "Quitina",
                        "Peptidoglicano"
                    ),
                    correctIndex = 3,
                    explanation = "La quitina es el polisacárido nitrogenado estructural característico del exoesqueleto de artrópodos y de la pared celular del reino Fungi (hongos)."
                )
            )
        ),
        LessonNode(
            id = "bio_t04_s02",
            subjectId = "biologia",
            semana = 4,
            subtema = "Semana 4",
            title = "Lípidos: Grasas, Fosfolípidos y Esteroides",
            theory = LessonTheory(
                id = "th_bio_t04_s02",
                asignatura = "Biología",
                semana = 4,
                titulo = "Clasificación y Funciones de los Lípidos",
                resumen = """Biomoléculas hidrofóbicas: reserva concentrada de energía, bicapas de membrana y regulación hormonal.


                    # 1. Definición y Enlace Éster
                    Moléculas insolubles en agua y solubles en solventes apolares (benceno, cloroformo). Proporcionan **$9.3\text{ kcal/g}$** (más del doble que los glúcidos y proteínas, $4.1\text{ kcal/g}$).
                    En los lípidos saponificables, los ácidos grasos se unen a alcoholes mediante el **enlace éster** liberando agua.

                    # 2. Lípidos Saponificables (Poseen Ácidos Grasos)
                    - **Acilglicéridos (Triglicéridos):** 1 Glicerol + 3 Ácidos grasos. Reserva energética a largo plazo en tejido adiposo y aislante térmico.
                    - **Fosfolípidos (Fosfoglicéridos):** 1 Glicerol + 2 Ácidos grasos + 1 Grupo fosfato con alcohol polar. Moléculas **anfipáticas** (cabeza hidrofílica polar y dos colas hidrofóbicas apolares) que forman la **bicapa lipídica** de todas las membranas celulares.
                    - **Céridos (Ceras):** Ácido graso de cadena larga + alcohol monohidroxílico. Función impermeabilizante y protectora (cutina en hojas, cerumen, cera de abejas).

                    # 3. Lípidos Insaponificables (Sin Ácidos Grasos ni Enlaces Éster)
                    - **Esteroides:** Derivan del ciclopentanoperhidrofenantreno (núcleo esteroideo).
                      - **Colesterol:** Otorga estabilidad y fluidez a la membrana plasmática animal; precursor de ácidos biliares, vitamina D y **hormonas sexuales** (testosterona, estrógenos, progesterona). En vegetales el análogo es el fitosterol; en hongos el ergosterol.
                    - **Terpenos:** Esencias vegetales (mentol, limoneno) y vitaminas liposolubles (A, E, K$).
                """,
                conceptosClave = listOf(
                    "Triglicéridos: Reserva energética a largo plazo ($9.3\text{ kcal/g}$)"
                ),
                admissionTip = "Ten presente las vitaminas liposolubles: A, D, E, K (nemotecnia: 'ADEK' o 'KEDA'). Son de naturaleza lipídica.",
                admissionExplanation = "El colesterol NO existe en las membranas celulares vegetales (poseen fitosteroles), un detalle clave que suele definir preguntas de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s02_c1",
                    statement = "La membrana celular de un glóbulo blanco humano debe mantener una adecuada fluidez y permeabilidad a diferentes temperaturas corporales. ¿Qué lípido esteroideo incrustado entre los fosfolípidos cumple esta función estabilizadora clave y además sirve de precursor a las hormonas sexuales?",
                    options = listOf(
                        "Ergosterol",
                        "Triglicérido",
                        "Colesterol",
                        "Fitosterol",
                        "Ácido palmítico"
                    ),
                    correctIndex = 2,
                    explanation = "El colesterol es el esteroide modulador de la fluidez en membranas de células animales y actúa como molécula precursora de sales biliares, vitamina D y hormonas esteroideas como la testosterona y el estradiol."
                )
            )
        ),
        LessonNode(
            id = "bio_t04_s03",
            subjectId = "biologia",
            semana = 4,
            subtema = "Semana 4",
            title = "Proteínas y Cinética Enzimática",
            theory = LessonTheory(
                id = "th_bio_t04_s03",
                asignatura = "Biología",
                semana = 4,
                titulo = "Estructura Proteica y Acción Enzimática",
                resumen = """Efectores macromoleculares versátiles: soporte estructural, transporte, defensa y catálisis biocatalítica.


                    # 1. Aminoácidos y Enlace Peptídico
                    Los aminoácidos contienen un carbono α unido a un grupo amino (-NH₂), un grupo carboxilo (-COOH), un hidrógeno y una cadena lateral variable (R). Se unen mediante el **enlace peptídico** (enlace amida covalente entre el carboxilo de uno y el amino del siguiente con liberación de H₂O).

                    # 2. Niveles de Organización Estructural
                    - **Primaria:** Secuencia lineal de aminoácidos codificada genéticamente (determinada por enlaces peptídicos).
                    - **Secundaria:** Plegamiento local por puentes de hidrógeno (α-hélice y lámina β-plegada).
                    - **Terciaria:** Disposición tridimensional globular o fibrosa estabilizada por puentes disulfuro (-S-S-), interacciones hidrofóbicas y enlaces iónicos. Adquiere actividad funcional biológica.
                    - **Cuaternaria:** Unión de dos o más cadenas polipeptídicas (ej. hemoglobina con 4 subunidades).
                    - **Desnaturalización:** Pérdida de las estructuras 2ª, 3ª y 4ª por calor extremo o pH extremo, conservando únicamente la estructura primaria.

                    # 3. Enzimas: Biocatalizadores Específicos
                    - Disminuyen la **energía de activación** (Ea) de las reacciones sin alterar la constante de equilibrio ni consumirse.
                    - Poseen un **sitio activo** complementario al sustrato (modelo del ajuste inducido).
                    - Muchas requieren cofactores inorgánicos (Mg²⁺, Zn²⁺) o coenzimas orgánicas (derivadas del complejo B como NAD+, FAD).
                """,
                conceptosClave = listOf(
                    "Monómero = aminoácido; Enlace = peptídico (covalente)"
                ),
                admissionTip = "Cuando una proteína se desnaturaliza por cocción o ácido fuerte (ej. el huevo frito o ceviche), NO pierde su estructura primaria (la secuencia de aminoácidos permanece intacta).",
                admissionExplanation = "Comprender la estabilidad del enlace peptídico frente a agentes desnaturalizantes físicos evita marcar alternativas erróneas."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s03_c1",
                    statement = "Al calentar una solución de catalasa a 85 °C, la enzima pierde por completo su actividad biológica debido a la ruptura de puentes de hidrógeno, interacciones hidrofóbicas y puentes disulfuro. ¿Qué nivel de organización estructural permanece intacto tras este proceso de desnaturalización?",
                    options = listOf(
                        "Estructura terciaria",
                        "Estructura secundaria",
                        "Estructura primaria",
                        "Estructura cuaternaria",
                        "Sitio activo catalítico"
                    ),
                    correctIndex = 2,
                    explanation = "La desnaturalización desorganiza la conformación espacial nativa (secundaria, terciaria y cuaternaria) sin romper los enlaces peptídicos covalentes, por lo que la estructura primaria (secuencia de aminoácidos) permanece intacta."
                )
            )
        ),
        LessonNode(
            id = "bio_t04_s04",
            subjectId = "biologia",
            semana = 4,
            subtema = "Semana 4",
            title = "Ácidos Nucleicos: ADN y ARN",
            theory = LessonTheory(
                id = "th_bio_t04_s04",
                asignatura = "Biología",
                semana = 4,
                titulo = "Bases Moleculares de la Herencia",
                resumen = """Polinucleótidos portadores y ejecutores del código genético universal.


                    # 1. Estructura del Nucleótido
                    Unidad monomérica formada por:
                    - **Base Nitrogenada:**
                      - Púricas (dos anillos): **Adenina (A) y Guanina (G)**.
                      - Pirimídicas (un anillo): **Citosina (C), Timina (T)** (exclusiva del ADN) y **Uracilo (U)** (exclusivo del ARN).
                    - **Pentosa:** Desoxirribosa (ADN) o Ribosa (ARN).
                    - **Grupo Fosfato:** Unido al carbono 5' de la pentosa.
                    Los nucleótidos sucesivos se encadenan mediante el enlace **fosfodiéster** (3'-5').

                    # 2. Ácido Desoxirribonucleico (ADN)
                    - Modelo de Watson y Crick (1953): **Doble hélice bicatenaria, antiparalela (5' → 3' y 3' → 5') y complementaria**.
                    - Regla de Chargaff: Las bases se unen por puentes de hidrógeno:
                      Adenina = Timina (2 puentes de hidrógeno)
                      Guanina ≡ Citosina (3 puentes de hidrógeno)
                      Por tanto: %A = %T y %G = %C.

                    # 3. Ácido Ribonucleico (ARN)
                    Monocatenario (una sola cadena), con ribosa y uracilo en lugar de timina:
                    - **ARNm (mensajero):** Copia la información del ADN nuclear en codones y la lleva al ribosoma.
                    - **ARNt (transferencia):** Transporta aminoácidos específicos al ribosoma mediante su **anticodón**. Presenta forma de hoja de trébol.
                    - **ARNr (ribosómico):** Forma la estructura de las subunidades ribosómicas y cataliza el enlace peptídico (ribozima).
                """,
                conceptosClave = listOf(
                    "ADN: Desoxirribosa + Timina, bicatenario, antiparalelo, complementario (A=T, G ≡ C)"
                ),
                admissionTip = "Si una hebra de ADN tiene 30% de Adenina, entonces tiene 30% de Timina, restando 40% para el par G-C (20% Guanina y 20% Citosina). Esta aplicación de la regla de Chargaff es fija en admisión.",
                admissionExplanation = "Recordar que el par G≡C tiene 3 puentes de hidrógeno explica por qué segmentos ricos en G y C requieren mayor temperatura para desnaturalizarse térmicamente."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s04_c1",
                    statement = "Un análisis genómico en una muestra bacteriana revela que el 34% de sus bases nitrogenadas totales corresponde a Guanina (G). Aplicando las leyes de complementariedad de bases de Chargaff, ¿cuál es el porcentaje esperado de Timina (T) en dicho ADN bicatenario?",
                    options = listOf(
                        "34%",
                        "16%",
                        "68%",
                        "32%",
                        "20%"
                    ),
                    correctIndex = 1,
                    explanation = "Si $%G = 34%$, entonces por complementariedad $%C = 34%$. Juntos suman $68%$. El $32%$ restante corresponde a A + T$. Como $%A = %T$, dividimos entre 2: $%T = 16%$."
                )
            )
        ),

        // ==========================================
        // SEMANA 5: CITOLOGÍA
        // ==========================================
        LessonNode(
            id = "bio_t05_s01",
            subjectId = "biologia",
            semana = 5,
            subtema = "Semana 5",
            title = "Célula Procariota y Teoría Celular",
            theory = LessonTheory(
                id = "th_bio_t05_s01",
                asignatura = "Biología",
                semana = 5,
                titulo = "Fundamentos Celulares y Procariotas",
                resumen = """Postulados de la teoría celular y la arquitectura eficiente de las bacterias.


                    # 1. Postulados de la Teoría Celular
                    Formulada por **Matthias Schleiden** (botánico, 1838) y **Theodor Schwann** (zoólogo, 1839), completada por **Rudolf Virchow** (1855: *Omnis cellula e cellula*):
                    - La célula es la unidad **morfológica o estructural** de los seres vivos.
                    - La célula es la unidad **fisiológica o funcional** (realiza las funciones vitales).
                    - Toda célula proviene de la división de otra **célula preexistente** (unidad reproductora).
                    - Contiene el material genético hereditario (unidad genética).

                    # 2. Célula Procariota (Arqueas y Bacterias)
                    Carecen de núcleo delimitado por carioteca y de organelos membranosos.
                    - **Pared celular bacteriana:** Formada por **peptidoglicano o mureína**. Distingue a Gram positivas (gruesa capa de mureína y ácidos teicoicos, tinción violeta) de Gram negativas (fina capa de mureína y membrana externa con lipopolisacáridos, tinción rosada).
                    - **Membrana plasmática:** Bicapa sin colesterol; presenta repliegues llamados **mesosomas** (sitio de la respiración celular y anclaje cromosómico).
                    - **Región nucleoide:** Contiene una sola molécula de **ADN circular y desnudo** (sin histonas en eubacterias).
                    - **Plásmido:** ADN circular extracromosómico que confiere resistencia a antibióticos.
                    - **Ribosomas 70S:** Síntesis proteica bacteriana.
                    - **Cápsula:** Capa mucosa externa antifagocítica (factor de virulencia).
                """,
                conceptosClave = listOf(
                    "Virchow postuló que toda célula proviene de otra preexistente.",
                    "Pared bacteriana = peptidoglicano (mureína)"
                ),
                admissionTip = "Los ribosomas bacterianos son 70S (subunidades 50S + 30S), a diferencia de los ribosomas citosólicos eucariotas que son 80S (subunidades 60S + 40S).",
                admissionExplanation = "Esta diferencia en el coeficiente de sedimentación es la diana de acción de antibióticos como aminoglucósidos y tetraciclinas."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t05_s01_c1",
                    statement = "Una cepa hospitalaria de *Klebsiella pneumoniae* adquiere la capacidad de inactivar a los carbapenémicos transmitiendo un anillo de ADN extracromosómico a otra bacteria durante la conjugación bacteriana. Dicho elemento genético corresponde a:",
                    options = listOf(
                        "El nucleoide bacteriano principal",
                        "Un plásmido",
                        "Un mesosoma lateral",
                        "Un ribosoma 70S",
                        "Un capsómero proteico"
                    ),
                    correctIndex = 1,
                    explanation = "Los plásmidos son moléculas de ADN circular bicatenario extracromosómico independientes que replican de forma autónoma y con frecuencia portan genes de resistencia a antibióticos transferibles por conjugación (pili sexual)."
                )
            )
        ),
        LessonNode(
            id = "bio_t05_s02",
            subjectId = "biologia",
            semana = 5,
            subtema = "Semana 5",
            title = "Membrana Plasmática y Transporte Celular",
            theory = LessonTheory(
                id = "th_bio_t05_s02",
                asignatura = "Biología",
                semana = 5,
                titulo = "Estructura y Transporte a través de la Membrana",
                resumen = """El modelo de Singer y Nicolson y los gradientes de concentración que rigen la permeabilidad selectiva.


                    # 1. Modelo del Mosaico Fluido (Singer y Nicolson, 1972)
                    - **Bicapa de fosfolípidos:** Matriz lipídica fluida con cabezas hidrofílicas expuestas y colas hidrofóbicas internas.
                    - **Proteínas:** Integrales o transmembrana (canales, transportadores) y periféricas.
                    - **Colesterol:** Estabiliza la fluidez en células animales.
                    - **Glucocálix:** Cadenas oligosacáridas hacia el exterior celular (reconocimiento celular, adhesión e histocompatibilidad).

                    # 2. Transporte Pasivo (A favor de gradiente, ΔG < 0, sin gasto de ATP)
                    - **Difusión Simple:** Paso directo de moléculas pequeñas apolares (O₂, CO₂, N₂) o liposolubles a través de la bicapa.
                    - **Difusión Facilitada:** Paso de moléculas polares o iones mediante transportadores proteicos:
                      - Por **canales iónicos** (Na⁺, K⁺, Ca²⁺) y **acuaporinas** (agua).
                      - Por **permeasas o carriers** (glucosa, aminoácidos) por cambio conformacional.

                    # 3. Transporte Activo (En contra de gradiente, con gasto de ATP)
                    - **Primario (Bombas):** Hidrólisis directa de ATP. La **Bomba Na⁺/K⁺ ATPasa** expulsa 3 Na⁺ hacia el exterior e introduce 2 K⁺ al interior celular por cada ATP consumido.
                    - **Secundario (Cotransporte):** Aprovecha el gradiente iónico generado por una bomba primaria (simporte glucosa-Na⁺, antiporte).
                    - **En Masa:** **Endocitosis** (fagocitosis de sólidos, pinocitosis de fluidos) y **Exocitosis** (secreción glandular).
                """,
                conceptosClave = listOf(
                    "Mosaico fluido: Bicapa lipídica anfipática + proteínas flotantes + glucocálix externo.",
                    "Transporte pasivo: A favor de gradiente, no gasta ATP (difusión simple y facilitada)"
                ),
                admissionTip = "Aprende de memoria los números de la bomba: '3 Sodios salen, 2 Potasios entran, 1 ATP se gasta' (regla: 'Salen 3 Na+, entran 2 K+').",
                admissionExplanation = "Es un transporte activo electrogénico fundamental para el potencial de reposo en neuronas y fibras musculares."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t05_s02_c1",
                    statement = "Para mantener el potencial de reposo excitatorio en la neurona, una proteína transmembrana bombea iones en contra de sus gradientes electroquímicos consumiendo una molécula de ATP. ¿Cuál es la estequiometría iónica exacta de este transporte activo primario?",
                    options = listOf(
                        "Introduce 3 Na+ y expulsa 2 K+",
                        "Expulsa 3 Na+ e introduce 2 K+",
                        "Introduce 2 Na+ y expulsa 3 K+",
                        "Expulsa 2 Na+ e introduce 2 K+",
                        "Introduce 1 Na+ y expulsa 1 Cl-"
                    ),
                    correctIndex = 1,
                    explanation = "La bomba Na⁺/K⁺ ATPasa transporta activamente 3 iones sodio (Na⁺) hacia el medio extracelular e introduce 2 iones potasio (K⁺) hacia el citoplasma por cada molécula de ATP hidrolizada."
                )
            )
        ),
        LessonNode(
            id = "bio_t05_s03",
            subjectId = "biologia",
            semana = 5,
            subtema = "Semana 5",
            title = "Sistema de Endomembranas y Organelos",
            theory = LessonTheory(
                id = "th_bio_t05_s03",
                asignatura = "Biología",
                semana = 5,
                titulo = "Compartimentalización Celular Eucariota",
                resumen = """Organelos membranosos especializados que coordinan la síntesis, tráfico y metabolismo celular.


                    # 1. Sistema de Endomembranas
                    - **Retículo Endoplasmático Rugoso (RER):** Asociado a ribosomas adheridos a riboforinas. Síntesis, plegamiento y glicosilación inicial de **proteínas de secreción** y de membrana.
                    - **Retículo Endoplasmático Liso (REL):** Sin ribosomas. **Síntesis de lípidos** (fosfolípidos, esteroides), **destoxificación celular** (fármacos, alcohol en hepatocitos) y almacén de calcio (retículo sarcoplásmico muscular).
                    - **Aparato de Golgi:** Dictiosomas apilados. Procesamiento, empaquetamiento, **glicosilación terminal**, secreción celular y formación de **lisosomas primarios** y pared celular vegetal (fragmoplasto).

                    # 2. Organelos Monomembranosos
                    - **Lisosomas:** Vesículas con enzimas hidrolíticas ácidas (pH ≈ 5). Realizan digestión celular (**autofagia y heterofagia**).
                    - **Peroxisomas:** Contienen enzimas oxidasas y **catalasa** (degrada el peróxido de hidrógeno tóxico: 2 H₂O₂ → 2 H₂O + O₂) y realizan β-oxidación de ácidos grasos de cadena muy larga.
                    - **Glioxisomas:** Exclusivos de semillas vegetales; transforman lípidos almacenados en azúcares (ciclo del glioxilato).
                    - **Vacuolas:** Gran vacuola central en vegetales; regula la turgencia y almacena agua, pigmentos (antocianinas) y desechos.

                    # 3. Organelos Bimembranosos Semiautónomos (Con ADN y ribosomas propios)
                    - **Mitocondrias:** Producción de ATP mediante respiración celular aeróbica.
                    - **Cloroplastos:** Fotosíntesis oxigénica en células vegetales y algas.
                """,
                conceptosClave = listOf(
                    "RER = síntesis de proteínas para secreción; REL = síntesis de lípidos y destoxificación.",
                    "Golgi = empaque, secreción y origen de los lisosomas primarios.",
                    "Peroxisoma = catalasa (degrada agua oxigenada)"
                ),
                admissionTip = "Asocia de inmediato la destoxificación en el hígado (hepatocitos) con el RETÍCULO ENDOPLASMÁTICO LISO (REL). Es una de las preguntas fijas en el examen de medicina.",
                admissionExplanation = "El REL posee citocromo P450 encargado de inactivar sustancias lipofílicas xenobióticas para facilitar su excreción."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t05_s03_c1",
                    statement = "Un individuo metaboliza un sedante tras su administración. En los hepatocitos de su tejido hepático se observa una marcada proliferación de un organelo membranoso especializado en la síntesis de esteroides y destoxificación de sustancias hidrofóbicas. ¿De qué organelo se trata?",
                    options = listOf(
                        "Retículo endoplasmático rugoso (RER)",
                        "Aparato de Golgi",
                        "Retículo endoplasmático liso (REL)",
                        "Lisosoma secundario",
                        "Peroxisoma apical"
                    ),
                    correctIndex = 2,
                    explanation = "El retículo endoplasmático liso (REL) carece de ribosomas y tiene como funciones cardinales la síntesis de lípidos (fosfolípidos y colesterol) y la destoxificación de fármacos, pesticidas y toxinas en el hígado."
                )
            )
        ),
        LessonNode(
            id = "bio_t05_s04",
            subjectId = "biologia",
            semana = 5,
            subtema = "Semana 5",
            title = "Núcleo y Comparación Animal vs Vegetal",
            theory = LessonTheory(
                id = "th_bio_t05_s04",
                asignatura = "Biología",
                semana = 5,
                titulo = "El Núcleo Celular y Taxonomía Estructural",
                resumen = """Organización nuclear del material genético y rasgos distintivos entre células animales y vegetales.


                    # 1. Componentes del Núcleo Interfásico
                    - **Carioteca (Envoltura nuclear):** Doble membrana concéntrica interrumpida por **poros nucleares** (complejos de poro) que regulan el tránsito de macromoléculas (ARN, proteínas). Su cara interna posee la lámina nuclear.
                    - **Carioplasma o Nucleoplasma:** Matriz acuosa nuclear.
                    - **Nucléolo:** Estructura no membranosa densa donde se sintetiza y ensambla el **ARN ribosómico (ARNr)** con proteínas para formar las subunidades ribosómicas.
                    - **Cromatina:** Complejo de ADN asociado a proteínas histonas (H_2A, H_2B, H_3, H_4$ en octámeros nucleosomales + H_1$ espaciador). Se presenta como **eucromatina** (laxa, transcripcionalmente activa) y **heterocromatina** (condensada, inactiva).

                    # 2. Cuadro Comparativo: Célula Animal vs Célula Vegetal
                    | Criterio | Célula Vegetal | Célula Animal |
                    | :--- | :--- | :--- |
                    | **Pared celular** | Presente (celulosa, hemicelulosa y pectina) | Ausente (presenta glucocálix externo) |
                    | **Plastidios** | Presentes (cloroplastos, cromoplastos, leucoplastos) | Ausentes |
                    | **Vacuolas** | Gran vacuola central prominente | Pequeñas y numerosas (o vesículas) |
                    | **Centriolos / Centrosoma** | Ausentes (mitosis anastral con casquetes polares) | Presentes (mitosis astral con ásteres) |
                    | **Uniones intercelulares** | Plasmodesmos | Desmosomas, uniones gap, herméticas |
                    | **Almidón / Glucógeno** | Almacena almidón | Almacena glucógeno |
                """,
                conceptosClave = listOf(
                    "El nucléolo sintetiza y ensambla las subunidades ribosómicas.",
                    "Eucromatina = laxa y activa; Heterocromatina = densa e inactiva.",
                    "Vegetales: Tienen pared de celulosa, cloroplastos, vacuola central y mitosis anastral (sin centriolos)"
                ),
                admissionTip = "Recuerda que las plantas superiores realizan mitosis ANASTRAL (sin áster ni centriolos); forman casquetes polares para orientar el huso acromático.",
                admissionExplanation = "Esta diferencia en el aparato mitótico es una pregunta recurrente de alta discriminación en exámenes de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t05_s04_c1",
                    statement = "Al analizar una muestra biológica bajo microscopía óptica, se observan células poligonales con una gruesa pared externa rica en celulosa, una gran vacuola que desplaza el núcleo hacia la periferia y ausencia total de centriolos. Se puede concluir categóricamente que corresponden a:",
                    options = listOf(
                        "Tejido epitelial animal",
                        "Una colonia de protozoarios ciliados",
                        "Células vegetales",
                        "Bacterias Gram positivas",
                        "Leucocitos polinucleares"
                    ),
                    correctIndex = 2,
                    explanation = "La combinación de pared celular de celulosa, vacuola central prominente y ausencia de centriolos (mitosis anastral) es exclusiva y diagnóstica de las células vegetales."
                )
            )
        ),

        // ==========================================
        // SEMANA 6: FISIOLOGÍA CELULAR
        // ==========================================
        LessonNode(
            id = "bio_t06_s01",
            subjectId = "biologia",
            semana = 6,
            subtema = "Semana 6",
            title = "Fotosíntesis: Fase Luminosa",
            theory = LessonTheory(
                id = "th_bio_t06_s01",
                asignatura = "Biología",
                semana = 6,
                titulo = "Fase Fotoquímica o Dependiente de la Luz",
                resumen = """Conversión de energía lumínica en energía química (ATP y NADPH) con liberación de oxígeno molecular.


                    # 1. Ecuación General y Localización
                    6 CO₂ + 6 H₂O + luz (clorofila) → C₆H₁₂O₆ + 6 O₂
                    La fase luminosa o fotoquímica se desarrolla en la **membrana de los tilacoides** dentro del cloroplasto, donde se concentran los pigmentos fotosintéticos (clorofila a, b y carotenoides) agrupados en fotosistemas.

                    # 2. Fotosistemas y Eventos Fotoquímicos
                    - **Fotosistema II (PS II o P₆₈₀):** Capta fotones a 680 nm.
                    - **Fotosistema I (PS I o P₇₀₀):** Capta fotones a 700 nm.

                    # 3. Cuatro Pasos Fundamentales de la Fase Luminosa
                    1. **Fotoexcitación de la Clorofila:** Los fotones de luz impactan en las moléculas antena y transfieren su energía al centro de reacción de los fotosistemas, liberando electrones excitados de alta energía.
                    2. **Fotólisis del Agua (Reacción de Hill):** En el lumen tilacoidal, el complejo del manganeso oxida el agua:
                       H₂O → 2 H⁺ + 2 e⁻ + 1/2 O₂ ↑
                       Los electrones reponen los electrones perdidos por el P₆₈₀, y el **oxígeno gaseoso (O₂) liberado a la atmósfera procede exclusivamente del agua**, ¡no del CO₂!
                    3. **Fotofosforilación (Síntesis de ATP):** Los protones acumulados en el lumen forman un gradiente electroquímico que activa a la **ATP sintasa** al salir al estroma (mecanismo quimiosmótico de Mitchell), produciendo **ATP**.
                    4. **Fotorreducción del NADP⁺:** Los electrones fluyen a través de la cadena transportadora (plastoquinona, citocromo b₆f, plastocianina, ferredoxina) hasta la enzima NADP⁺ reductasa en el estroma, generando **NADPH + H⁺**.
                """,
                conceptosClave = listOf(
                    "Ocurre en la membrana del tilacoide.",
                    "El oxígeno atmosférico liberado (O₂)"
                ),
                admissionTip = "Pregunta clásica e inexcusable en UNSA: '¿De dónde proviene el oxígeno que liberan las plantas durante la fotosíntesis?' Respuesta: DE LA FOTÓLISIS DEL AGUA en el fotosistema II.",
                admissionExplanation = "Fue demostrado experimentalmente por Samuel Ruben y Martin Kamen utilizando el isótopo oxígeno-18."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t06_s01_c1",
                    statement = "Durante la fase luminosa en las granas de los cloroplastos, la molécula de agua es hidrolizada por acción fotoquímica (Reacción de Hill). La consecuencia biológica y atmosférica directa de este evento es:",
                    options = listOf(
                        "La fijación directa de dióxido de carbono ambiental",
                        "La liberación de oxígeno gaseoso (O2) a la atmósfera",
                        "La síntesis directa de glucosa en el tilacoide",
                        "La oxidación completa de coenzimas FADH2",
                        "La formación de ácido pirúvico estromal"
                    ),
                    correctIndex = 1,
                    explanation = "La fotólisis del agua disocia la molécula en protones, electrones (que reponen al fotosistema II) y oxígeno gaseoso (O₂), el cual se difunde hacia la atmósfera como subproducto de la fotosíntesis."
                )
            )
        ),
        LessonNode(
            id = "bio_t06_s02",
            subjectId = "biologia",
            semana = 6,
            subtema = "Semana 6",
            title = "Fotosíntesis: Ciclo de Calvin-Benson",
            theory = LessonTheory(
                id = "th_bio_t06_s02",
                asignatura = "Biología",
                semana = 6,
                titulo = "Fase Oscura o Asimilativa de Carbono",
                resumen = """Uso de ATP y NADPH estromales para reducir el carbono inorgánico a compuestos orgánicos.


                    # 1. Localización y Naturaleza
                    Ocurre en el **estroma** (matriz coloidal) del cloroplasto. Aunque no requiere luz directa, depende estrictamente de los productos químicos formados en la fase luminosa (**ATP y NADPH**).

                    # 2. Etapas del Ciclo de Calvin-Benson
                    1. **Carboxilación (Fijación del CO₂):** El CO₂ atmosférico se une a la pentosa **Ribulosa-1,5-bisfosfato (RuBP)** catalizado por la enzima más abundante del planeta: **RuBisCO** (ribulosa bisfosfato carboxilasa/oxigenasa). Se forma un intermediario inestable de 6C que se rompe de inmediato en 2 moléculas de **3-Fosfoglicerato (3-PGA)** (3C).
                    2. **Reducción:** El 3-PGA es fosforilado con ATP y reducido por el NADPH (de la fase luminosa), convirtiéndose en **Fosfogliceraldehído (PGAL o G3P)**.
                    3. **Síntesis Orgánica:** Por cada 6 vueltas del ciclo (fijación de 6 CO₂), se generan 12 PGAL. De ellos, **2 moléculas de PGAL salen del ciclo** para condensarse y sintetizar una molécula de **Glucosa** (6C) u otros compuestos orgánicos (ácidos grasos, aminoácidos).
                    4. **Regeneración de la Ribulosa:** Las 10 moléculas de PGAL restantes (10 × 3C = 30C) se reorganizan mediante consumo de ATP para regenerar 6 moléculas de RuBP (6 × 5C = 30C), reiniciando el ciclo.
                """,
                conceptosClave = listOf(
                    "Ocurre en el estroma del cloroplasto.",
                    "La enzima clave es la RuBisCO (fija el CO₂ a la ribulosa bisfosfato)"
                ),
                admissionTip = "¡Cuidado! El producto inmediato del Ciclo de Calvin NO es directamente la glucosa, sino una triosa fosfatada: el Fosfogliceraldehído (PGAL). La glucosa se forma posteriormente en el citosol o estroma a partir de 2 PGAL.",
                admissionExplanation = "Este detalle de bioquímica fina distingue al estudiante promedio del que obtiene el puntaje máximo en biología."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t06_s02_c1",
                    statement = "En el estroma del cloroplasto, la enzima RuBisCO cataliza la incorporación de dióxido de carbono a una molécula aceptora de cinco carbonos denominada:",
                    options = listOf(
                        "Fosfogliceraldehído (PGAL)",
                        "Ribulosa-1,5-bisfosfato (RuBP)",
                        "Ácido pirúvico",
                        "Oxalacetato",
                        "Glucosa-6-fosfato"
                    ),
                    correctIndex = 1,
                    explanation = "La RuBisCO fija el CO₂ uniéndolo a la Ribulosa-1,5-bisfosfato (RuBP), originando un compuesto inestable de 6 carbonos que se escinde en dos moléculas de 3-fosfoglicerato (3-PGA)."
                )
            )
        ),
        LessonNode(
            id = "bio_t06_s03",
            subjectId = "biologia",
            semana = 6,
            subtema = "Semana 6",
            title = "Respiración Celular Anaeróbica y Glucólisis",
            theory = LessonTheory(
                id = "th_bio_t06_s03",
                asignatura = "Biología",
                semana = 6,
                titulo = "Glucólisis Citosólica y Procesos Fermentativos",
                resumen = """Vía ancestral de degradación de la glucosa en ausencia de oxígeno molecular.


                    # 1. Glucólisis (Vía de Embden-Meyerhof)
                    Ocurre en el **citosol (hialoplasma)** de todas las células vivas. Es anaeróbica (no usa O₂).
                    - **Ecuación Neta:**
                      Glucosa (6C) + 2 NAD⁺ + 2 ADP + 2 Pi → 2 Piruvato (3C) + 2 NADH + 2 H⁺ + 2 ATP netos
                    - Gasto energético: Consume 2 ATP en la fase preparatoria y genera 4 ATP en la fase de rendimiento: **Ganancia neta = 2 ATP** (por fosforilación a nivel de sustrato).

                    # 2. Destino del Piruvato en Ausencia de Oxígeno: Fermentación
                    El objetivo de la fermentación no es generar más ATP, sino **reoxidar el NADH a NAD⁺** para que la glucólisis no se detenga por falta de aceptor de electrones.
                    - **Fermentación Láctica:**
                      - Realizada por bacterias lácticas (*Lactobacillus*) en yogur y por el **músculo esquelético humano** en condiciones de hipoxia o esfuerzo físico intenso.
                      - El piruvato se reduce directamente a **Lactato (ácido láctico)** sin desprendimiento de CO₂:
                        Piruvato + NADH + H⁺ (LDH) → Lactato + NAD⁺
                    - **Fermentación Alcohólica:**
                      - Realizada por levaduras (*Saccharomyces cerevisiae*) en panificación, cerveza y vino.
                      - El piruvato se descarboxila (liberando **CO₂**) formando acetaldehído, el cual se reduce a **Etanol** regenerando NAD⁺:
                        Piruvato → Acetaldehído + CO₂ ↑ (NADH) → Etanol + NAD⁺
                """,
                conceptosClave = listOf(
                    "La glucólisis ocurre en el citosol y produce 2 Piruvatos, 2 NADH y 2 ATP netos.",
                    "La fermentación regenera NAD⁺ en ausencia de O₂ y rinde 2 ATP netos (los de la glucólisis)"
                ),
                admissionTip = "Ojo con la diferencia: la fermentación láctica NO produce CO₂, mientras que la fermentación alcohólica SÍ libera CO₂ (por eso el pan se infla con burbujas y la cerveza tiene espuma).",
                admissionExplanation = "Esta diferencia en la descarboxilación del piruvato es una trampa recurrente en las pruebas de selección."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t06_s03_c1",
                    statement = "Un atleta arequipeño realiza un sprint anaeróbico de 100 metros planos a máxima velocidad. Debido a la hipoxia transitoria en sus fibras musculares esqueléticas, el ácido pirúvico citosólico es reducido hacia:",
                    options = listOf(
                        "Etanol liberando burbujas de CO2",
                        "Ácido láctico regenerando coenzimas NAD+",
                        "Acetil-CoA para entrar a la mitocondria",
                        "Glucosa mediante fosforilación oxidativa",
                        "Citrato por la enzima citrato sintasa"
                    ),
                    correctIndex = 1,
                    explanation = "En condiciones de déficit de oxígeno (anaerobiosis muscular), el piruvato se reduce a lactato (ácido láctico) mediante la enzima lactato deshidrogenasa para reoxidar el NADH a NAD⁺, permitiendo que la glucólisis continúe produciendo 2 ATP."
                )
            )
        ),
        LessonNode(
            id = "bio_t06_s04",
            subjectId = "biologia",
            semana = 6,
            subtema = "Semana 6",
            title = "Respiración Aeróbica y Balance Energético",
            theory = LessonTheory(
                id = "th_bio_t06_s04",
                asignatura = "Biología",
                semana = 6,
                titulo = "Vía Mitocondrial y Rendimiento Máximo de ATP",
                resumen = """Oxidación completa del piruvato hasta dióxido de carbono y agua con alta producción de ATP.


                    # 1. Descarboxilación del Piruvato y Ciclo de Krebs
                    En presencia de O₂, el piruvato ingresa a la mitocondria:
                    - **Acetilación (Matriz Mitocondrial):** El piruvato (3C) se descarboxila liberando CO₂ y se oxida generando NADH, uniéndose a la coenzima A para formar **Acetil-CoA** (2C).
                    - **Ciclo de Krebs o del Ácido Cítrico (Matriz Mitocondrial):**
                      - El Acetil-CoA (2C) se condensa con el **Oxalacetato** (4C) formando **Citrato** (6C).
                      - Por cada vuelta del ciclo (por cada acetilo): se liberan 2 CO₂, se forman **3 NADH, 1 FADH₂ y 1 GTP (o ATP)**.

                    # 2. Cadena de Transporte de Electrones y Fosforilación Oxidativa
                    - Ocurre en las **crestas mitocondriales** (membrana interna).
                    - Los electrones de NADH y FADH₂ fluyen por complejos enzimáticos (I, II, III, IV y citocromo c).
                    - Los complejos I, III y IV bombean protones (H⁺) hacia el **espacio intermembrana**, creando una fuerza protón-motriz.
                    - El **aceptor final de electrones es el Oxígeno Molecular (O₂)**, el cual se reduce con protones formando **Agua (H₂O) metabólica**:
                      1/2 O₂ + 2 e⁻ + 2 H⁺ → H₂O
                    - Los protones regresan a la matriz a través de la **ATP sintasa** sintetizando ATP.

                    # 3. Balance Energético Teórico Total
                    - Cada NADH mitocondrial rinde ≈ 2.5-3 ATP; cada FADH₂ rinde ≈ 1.5-2 ATP.
                    - Dependiendo de la lanzadera usada para introducir los 2 NADH citosólicos de la glucólisis:
                      - **Lanzadera Glicerol-3-fosfato:** Músculo esquelético y cerebro → **36 ATP**.
                      - **Lanzadera Malato-Aspartato:** Hígado, riñón y corazón → **38 ATP**.
                """,
                conceptosClave = listOf(
                    "El ciclo de Krebs se realiza en la matriz mitocondrial.",
                    "La cadena respiratoria y ATP sintasa están en las crestas mitocondriales.",
                    "El aceptor final de electrones es el Oxígeno (O₂)"
                ),
                admissionTip = "¡Pregunta de oro!: '¿Cuál es el aceptor final de electrones en la respiración celular aeróbica?' Respuesta: EL OXÍGENO MOLECULAR (O₂).",
                admissionExplanation = "Al aceptar electrones y protones al final de la cadena de citocromos, el oxígeno evita la congestión de la cadena respiratoria y forma agua metabólica."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t06_s04_c1",
                    statement = "Durante la fosforilación oxidativa en las crestas de las mitocondrias de las células eucariotas, el aceptor final de los electrones procedentes de las coenzimas reducidas NADH y FADH2 es:",
                    options = listOf(
                        "El dióxido de carbono que se reduce a glucosa",
                        "El ácido pirúvico que se convierte en lactato",
                        "El oxígeno molecular que al reducirse produce agua",
                        "El citocromo c oxidasa que se disocia en grupos hemo",
                        "El ion magnesio del complejo ATP sintasa"
                    ),
                    correctIndex = 2,
                    explanation = "El oxígeno molecular (O₂) es el aceptor final de electrones e hidrogeniones al término de la cadena transportadora de electrones en las crestas mitocondriales, reduciéndose para formar agua metabólica (H₂O)."
                )
            )
        ),

        // ==========================================
        // SEMANA 7: HISTOLOGÍA VEGETAL Y ANIMAL
        // ==========================================
        LessonNode(
            id = "bio_t07_s01",
            subjectId = "biologia",
            semana = 7,
            subtema = "Semana 7",
            title = "Tejidos Vegetales: Meristemos y Protectores",
            theory = LessonTheory(
                id = "th_bio_t07_s01",
                asignatura = "Biología",
                semana = 7,
                titulo = "Tejidos Embrionarios y de Cubierta Vegetal",
                resumen = """Meristemos responsables del crecimiento y tejidos protectores que aíslan a la planta.


                    # 1. Tejidos Meristemáticos o Embrionarios
                    Células pequeñas, indiferenciadas, con pared delgada de celulosa, núcleo grande y alta tasa de división mitótica:
                    - **Meristemo Primario o Apical:** Ubicado en los ápices de tallos (yemas) y raíces (cubierto por la cofia o caliptra). Responsable del **crecimiento en longitud**.
                    - **Meristemo Secundario o Lateral:** Responsable del **crecimiento en grosor o espesor** en plantas leñosas:
                      - **Cámbium vascular:** Origina xilema secundario hacia adentro (madera) y floema secundario hacia afuera.
                      - **Cámbium suberoso o Felógeno:** Origina súber o corcho hacia afuera y felodermis hacia adentro (**peridermis**).

                    # 2. Tejidos Protectores o Tegumentarios
                    - **Epidermis:** Capa de células vivas, transparentes y monoestratificadas que recubre hojas, flores y tallos jóvenes.
                      - Recubierta por **cutina** (cutícula cérea) que previene la deshidratación.
                      - Presenta **estomas:** Complejo formado por dos **células oclusivas o de guarda** que delimitan un orificio o **ostiolo**, regulando el intercambio gaseoso (CO₂, O₂) y la transpiración (H₂O).
                      - Presenta tricomas o pelos (absorbentes, glandulares, protectores).
                    - **Peridermis (Súber o Corcho):** En tallos y raíces leñosas viejas. Células muertas impregnadas de **suberina** impermeable. Presenta orificios de aireación llamados **lenticelas**.
                """,
                conceptosClave = listOf(
                    "Meristemo apical: Crecimiento longitudinal; Meristemo lateral (cámbium/felógeno)"
                ),
                admissionTip = "Los estomas regulan el intercambio de gases en la epidermis de órganos verdes jóvenes. En ramas y troncos leñosos adultos, esa función la realizan las LENTICELAS de la peridermis.",
                admissionExplanation = "Diferenciar estomas de lenticelas es uno de los contrastes anatómicos favoritos de los docentes en comisiones de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t07_s01_c1",
                    statement = "En la superficie rugosa de la corteza leñosa de un árbol maduro de queñua en las faldas del volcán Misti, el intercambio gaseoso entre los tejidos internos y la atmósfera se lleva a cabo mediante poros visibles denominados:",
                    options = listOf(
                        "Estomas con células oclusivas",
                        "Lenticelas",
                        "Tricomas glandulares",
                        "Plasmodesmos epidérmicos",
                        "Cámbium vascular"
                    ),
                    correctIndex = 1,
                    explanation = "En los órganos vegetales adultos con crecimiento secundario cubiertos por peridermis (corcho), el intercambio de gases se realiza a través de las lenticelas, ya que los estomas son reemplazados al envejecer la epidermis."
                )
            )
        ),
        LessonNode(
            id = "bio_t07_s02",
            subjectId = "biologia",
            semana = 7,
            subtema = "Semana 7",
            title = "Tejidos Vegetales: Fundamentales, Mecánicos y Vasculares",
            theory = LessonTheory(
                id = "th_bio_t07_s02",
                asignatura = "Biología",
                semana = 7,
                titulo = "Parénquimas, Soporte y Conducción en Plantas",
                resumen = """Especialización para nutrición, sostén arquitectónico y transporte de savia a larga distancia.


                    # 1. Tejidos Fundamentales (Parénquimas)
                    Células vivas polédricas con metabolismo activo:
                    - **Clorénquima (Parénquima clorofiliano):** En hojas y tallos verdes; abundante en cloroplastos para la fotosíntesis (empalizada y lagunar).
                    - **Parénquima Reservante:** Almacena sustancias de reserva:
                      - Amiláceo: Almidón en tubérculos (papa), raíces (yuca) y semillas.
                      - Acuífero: Agua en cactus y plantas suculentas xerófitas.
                      - Aerífero (Aerénquima): Grandes espacios intercelulares de aire en plantas acuáticas para flotabilidad e intercambio.

                    # 2. Tejidos de Sostén o Mecánicos
                    - **Colénquima:** Células **vivas** con pared primaria engrosada desigualmente con celulosa y pectina. Otorga **flexibilidad y soporte a órganos jóvenes** en crecimiento (peciolos, tallos herbáceos).
                    - **Esclerénquima:** Células **muertas** con pared secundaria engrosada de **lignina**. Otorga **rigidez y resistencia a órganos adultos** leñosos (fibras y esclereidas/células pétreas en peras y cáscaras de nuez).

                    # 3. Tejidos Conductores o Vasculares
                    - **Xilema (Leño):** Células **muertas** lignificadas (traqueidas y elementos de los vasos o tráqueas). Transporta **savia bruta** (agua y sales minerales) en sentido **ascendente unidireccional** (raíz → hojas) impulsado por transpiración.
                    - **Floema (Líber):** Células **vivas** (tubos cribosos acompañados de células anexas/acompañantes). Transporta **savia elaborada** (sacarosa, aminoácidos) en sentido **bidireccional multidireccional** (fuente → sumidero).
                """,
                conceptosClave = listOf(
                    "Colénquima = vivo y flexible; Esclerénquima = muerto y rígido (lignificado)"
                ),
                admissionTip = "Regla mnemotécnica: Xilema conduce agua (como la 'X' de xilófono, leño muerto que asciende). Floema conduce alimento (Fl → Food/Flujo de sacarosa en células vivas).",
                admissionExplanation = "La distinción entre células vivas del floema y muertas del xilema es clave en botánica preuniversitaria."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t07_s02_c1",
                    statement = "Al masticar una pera madura se percibe una textura arenosa dura debida a grupos de células pétreas redondeadas con paredes secundarias sumamente gruesas e impregnadas de lignina que mueren al alcanzar la madurez. Dichas células corresponden al tejido:",
                    options = listOf(
                        "Colénquima angular",
                        "Parénquima amiláceo",
                        "Esclerénquima",
                        "Floema primario",
                        "Clorénquima lagunar"
                    ),
                    correctIndex = 2,
                    explanation = "Las esclereidas o células pétreas son elementos típicos del Esclerénquima, tejido mecánico de células muertas con paredes secundarias lignificadas que otorgan extrema dureza y protección."
                )
            )
        ),
        LessonNode(
            id = "bio_t07_s03",
            subjectId = "biologia",
            semana = 7,
            subtema = "Semana 7",
            title = "Tejidos Animales: Epitelial y Conectivo",
            theory = LessonTheory(
                id = "th_bio_t07_s03",
                asignatura = "Biología",
                semana = 7,
                titulo = "Epitelios y Tejidos de Unión y Sostén",
                resumen = """Barreras limítrofes avasculares y matrices extracelulares de soporte y nutrición.


                    # 1. Tejido Epitelial
                    - Células muy unidas con **escasa matriz extracelular** y uniones intercelulares estrechas.
                    - **Avascular:** Carece de vasos sanguíneos; se nutre por difusión desde el tejido conectivo subyacente a través de la **membrana basal**.
                    - Alta capacidad de regeneración mitótica y polaridad celular.
                    - **Clasificación de Revestimiento:** Simple (un solo estrato: endotelio, alvéolos), Estratificado (varios estratos: epidermis queratinizada, esófago) y Seudoestratificado ciliado (tráquea y vías respiratorias).
                    - **Epitelio Glandular:** Exocrinas (con conducto: sudoríparas, salivales), Endocrinas (sin conducto, vierten hormonas a la sangre: tiroides, hipófisis) y Mixtas/Anficrinas (páncreas).

                    # 2. Tejido Conectivo o Conjuntivo
                    - El más abundante del cuerpo; **muy vascularizado** (salvo cartílago) con **abundante matriz extracelular (MEC)** rica en fibras colágenas, elásticas y reticulares.
                    - **Conectivo Propiamente Dicho:** Laxo (soporte de epitelios) y Denso (tendones, ligamentos).
                    - **Tejido Adiposo:** Adipocitos con gotas lipídicas (blanco/unilocular: reserva y aislamiento; pardo/multilocular: termogénesis en neonatos).
                    - **Tejido Cartilaginoso:** Condrocitos alojados en condroplastos. **Avascular** (se nutre por difusión desde el pericondrio). Cartílago hialino (tráquea, articulaciones), elástico (oreja, epiglotis) y fibroso (discos intervertebrales).
                    - **Tejido Óseo:** Osteoblastos (formadores de matriz), osteocitos (células maduras en osteoplastos) y osteoclastos (resorción ósea). Estructurado en **osteonas o sistemas de Havers** con conductos de Havers y Volkmann.
                """,
                conceptosClave = listOf(
                    "Epitelio: Escasa MEC, avascular, sobre membrana basal.",
                    "Cartílago: Avascular, condrocitos en condroplastos.",
                    "Hueso: Muy vascularizado, matriz calcificada (hidroxiapatita)"
                ),
                admissionTip = "Recuerda que tanto el epitelio como el cartílago son AVASCULARES (no tienen vasos sanguíneos directos). El hueso, en cambio, está profusamente vascularizado por los conductos de Havers.",
                admissionExplanation = "Comprender la vascularización del tejido óseo frente a la avascularidad del cartílago explica sus diferentes velocidades de reparación clínica."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t07_s03_c1",
                    statement = "La remodelación y recambio continuo de la matriz ósea requiere la digestión y resorción del colágeno mineralizado con hidroxiapatita para liberar iones calcio a la sangre. ¿Qué célula ósea gigante y multinucleada es la responsable directa de esta resorción ósea?",
                    options = listOf(
                        "Osteoblasto",
                        "Osteocito",
                        "Osteoclasto",
                        "Condrocito",
                        "Fibroblasto"
                    ),
                    correctIndex = 2,
                    explanation = "Los osteoclastos son células gigantes multinucleadas originadas a partir de la estirpe de monocitos/macrófagos encargadas de degradar y reabsorber la matriz ósea mineralizada (resorción ósea)."
                )
            )
        ),
        LessonNode(
            id = "bio_t07_s04",
            subjectId = "biologia",
            semana = 7,
            subtema = "Semana 7",
            title = "Tejidos Animales: Muscular y Nervioso",
            theory = LessonTheory(
                id = "th_bio_t07_s04",
                asignatura = "Biología",
                semana = 7,
                titulo = "Tejidos Excitables: Músculo y Sistema Nervioso",
                resumen = """Especialización para la motilidad mecánica activa y la transmisión de impulsos bioeléctricos.


                    # 1. Tejido Muscular (Contracción Mecánica)
                    Células alargadas llamadas miocitos o fibras musculares ricas en filamentos de **actina y miosina**:
                    - **Estriado Esquelético:** Fibras cilíndricas muy largas, **multinucleadas periféricas** con estriaciones transversales. Contracción **voluntaria, rápida y fatigable** (inserto en los huesos).
                      - Unidad anátomo-funcional: **Sarcómero** (delimitado entre dos líneas Z). La contracción ocurre por deslizamiento de actina sobre miosina mediado por **Ca²⁺** y ATP.
                    - **Estriado Cardíaco:** Células ramificadas con 1 o 2 núcleos centrales y **discos intercalares** (uniones gap que permiten acoplamiento eléctrico sinodal). Contracción **involuntaria, rítmica e infatigable**.
                    - **Liso (Visceral):** Células fusiformes mononucleadas centrales **sin estriaciones** (sin sarcómeros). Contracción **involuntaria y lenta** en vísceras huecas (estómago, intestino, vasos sanguíneos).

                    # 2. Tejido Nervioso (Transmisión del Impulso)
                    - **Neurona:** Unidad funcional excitable. Formada por soma (cuerpo con corpúsculos de Nissl), dendritas (aferentes) y axón mielinizado (eferente) que culmina en el telodendrón sináptico.
                    - **Células Gliales (Neuroglías):** Más abundantes que las neuronas, no transmiten impulsos pero brindan soporte vital:
                      - **Astrocitos:** Nutrición neuronal y formación de la **barrera hematoencefálica (BHE)**.
                      - **Oligodendrocitos:** Forman la **vaina de mielina** en el Sistema Nervioso Central (SNC).
                      - **Células de Schwann:** Forman la **vaina de mielina** en el Sistema Nervioso Periférico (SNP).
                      - **Microglías:** Fagocitos defensivos del sistema nervioso (inmunidad residente).
                      - **Células Ependimarias:** Revisten ventrículos cerebrales y facilitan el flujo de líquido cefalorraquídeo.
                """,
                conceptosClave = listOf(
                    "Sarcómero = unidad funcional del músculo estriado (entre dos discos Z)"
                ),
                admissionTip = "Diferencia clásica: ¿Quién sintetiza la vaina de mielina en el cerebro/médula (SNC)? El OLIGODENDROCITO. ¿Y en los nervios periféricos (SNP)? La CÉLULA DE SCHWANN.",
                admissionExplanation = "Este par de glías mielinizantes y su respectiva ubicación anatómica es una de las preguntas fijas en el banco de biología de la UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t07_s04_c1",
                    statement = "En la esclerosis múltiple se produce una desmielinización autoinmune progresiva de los axones neuronales en el encéfalo y la médula espinal. ¿Qué célula glial encargada de producir la vaina de mielina en el sistema nervioso central es la diana de esta patología?",
                    options = listOf(
                        "Célula de Schwann",
                        "Astrocito protoplasmático",
                        "Oligodendrocito",
                        "Célula ependimaria",
                        "Microglía fagocítica"
                    ),
                    correctIndex = 2,
                    explanation = "Los oligodendrocitos son las neuroglías encargadas de sintetizar la vaina de mielina alrededor de múltiples axones en el Sistema Nervioso Central (encéfalo y médula). Las células de Schwann cumplen ese rol en el Sistema Nervioso Periférico."
                )
            )
        )
    )
}
