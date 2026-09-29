package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.LessonDepth
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
            subtema = "1.1",
            title = "Objeto de Estudio y Ramas de la Biología",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t01_s01",
                asignatura = "Biología",
                semana = 1,
                titulo = "Objeto de Estudio y Ramas de la Biología",
                resumen = """La Biología es la ciencia fáctica y natural que estudia integralmente a los seres vivos en cuanto a su estructura, función, origen, evolución y relaciones con el entorno.

                    # 1.1.1 — Objeto de Estudio y Definición de la Vida
                    Etimológicamente proviene del griego *bios* (vida) y *logos* (tratado o estudio). El término fue acuñado y popularizado de manera independiente en 1802 por el naturalista francés **Jean-Baptiste Lamarck** y el naturalista alemán **Gottfried Reinhold Treviranus**. Su objeto de estudio es la materia viva, la cual se caracteriza por poseer organización compleja, metabolismo activo (anabolismo y catabolismo), homeostasis, irritabilidad, reproducción, crecimiento y evolución adaptativa.

                    # 1.1.2 — Ramas según el Ser Vivo Estudiado
                    - **Zoología:** Estudio del reino animal. Subdisciplinas: *Mastozoología* (mamíferos), *Ornitología* (aves), *Herpetología* (reptiles y anfibios), *Ictiología* (peces), *Entomología* (insectos), *Malacología* (moluscos: pulpos, caracoles), *Helmintología* (gusanos parásitos y libres), *Aracnología* (arañas y escorpiones) y *Carcinología* (crustáceos).
                    - **Botánica / Fitología:** Estudio del reino vegetal. Subdisciplinas: *Botánica Criptogámica* (plantas sin semillas: Briología para musgos y Pteridología para helechos) y *Botánica Fanerogámica* (plantas con flores y semillas: gimnospermas y angiospermas).
                    - **Micología:** Hongos eucariotas heterótrofos con pared celular de quitina (mohos, levaduras y setas).
                    - **Ficología / Algología:** Algas unicelulares y pluricelulares fotoautótrofas.
                    - **Microbiología:** Organismos microscópicos: *Bacteriología* (bacterias y arqueas procariotas), *Protozoología* (protozoarios unicelulares eucariotas como amebas y paramecios) y *Virología* (virus y entidades acelulares submicroscópicas).

                    # 1.1.3 — Ramas según el Nivel de Organización o Enfoque
                    - **Citología:** Estructura, ultraestructura y fisiología celular.
                    - **Histología:** Arquitectura y funciones de los tejidos biológicos.
                    - **Anatomía:** Estructura macroscópica y disposición espacial de órganos y sistemas.
                    - **Fisiología:** Funcionamiento dinámico y procesos físico-químicos de los seres vivos.
                    - **Genética:** Mecanismos de la herencia biológica, expresión del ADN y variación.
                    - **Embriología:** Desarrollo ontogenético desde la fecundación hasta el nacimiento.
                    - **Taxonomía:** Clasificación sistemática y nomenclatura científica (Linneo).
                    - **Ecología:** Interacciones entre los seres vivos y su biotopo físico (término acuñado por **Ernst Haeckel** en 1869).
                    - **Etología:** Pautas de conducta y comportamiento animal en su hábitat natural.
                """,
                conceptosClave = listOf(
                    "Término 'Biología' propuesto en 1802 por Lamarck y Treviranus.",
                    "Ernst Haeckel acuñó el término 'Ecología' en 1869.",
                    "Ficología estudia algas; Micología estudia hongos."
                ),
                admissionTip = "En los exámenes de admisión UNSA y CEPRUNSA son preguntas fijas de relación: Malacología (moluscos), Ictiología (peces), Ficología (algas), Helmintología (gusanos) y Micología (hongos). Recuerda que las arañas no son insectos (son arácnidos estudiados por la Aracnología).",
                admissionExplanation = "Dominar el ser vivo estudiado por cada disciplina taxonómica asegura resolver con rapidez y total precisión las preguntas de emparejamiento."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s01_c1",
                    statement = "El término 'Biología' fue consagrado y popularizado formalmente en el año 1802 de manera independiente por los naturalistas:",
                    options = listOf(
                        "Aristóteles y Teofrasto",
                        "Jean-Baptiste Lamarck y Gottfried Treviranus",
                        "Charles Darwin y Alfred Russel Wallace",
                        "Ernst Haeckel y Carl von Linné",
                        "Robert Hooke y Anton van Leeuwenhoek"
                    ),
                    correctIndex = 1,
                    explanation = "En 1802, Jean-Baptiste Lamarck (en Francia) y Gottfried Reinhold Treviranus (en Alemania) propusieron y popularizaron de forma independiente el término 'Biología' para designar a la ciencia de los seres vivos."
                ),
                Challenge(
                    id = "bio_t01_s01_c2",
                    statement = "Un biólogo marino en la caleta de Chala (Arequipa) recolecta muestras de pulpos, choros y babosas de mar para analizar su anatomía interna. ¿Qué rama de la zoología está ejerciendo?",
                    options = listOf(
                        "Herpetología",
                        "Malacología",
                        "Ictiología",
                        "Helmintología",
                        "Carcinología"
                    ),
                    correctIndex = 1,
                    explanation = "La Malacología estudia a los moluscos (pulpos, calamares, caracoles, babosas y bivalvos como el choro). La carcinología estudia crustáceos y la ictiología a los peces."
                ),
                Challenge(
                    id = "bio_t01_s01_c3",
                    statement = "Respecto a las disciplinas botánicas y microbiológicas, determine la diferencia fundamental entre la Ficología y la Micología:",
                    options = listOf(
                        "La Ficología estudia hongos y la Micología algas",
                        "La Ficología estudia algas fotoautótrofas y la Micología hongos heterótrofos",
                        "Ambas estudian exclusivamente bacterias procariotas fotosintéticas",
                        "La Ficología se ocupa de virus acelulares y la Micología de protozoarios",
                        "La Ficología estudia musgos y la Micología helechos con semillas"
                    ),
                    correctIndex = 1,
                    explanation = "La Ficología (o Algología) estudia las algas, que son organismos autótrofos fotosintéticos, mientras que la Micología estudia los hongos, que son eucariotas estrictamente heterótrofos con pared de quitina."
                ),
                Challenge(
                    id = "bio_t01_s01_c4",
                    statement = "Un médico infectólogo analiza en heces humanas la presencia de proglótidos de Taenia solium y huevos de Ascaris lumbricoides. La rama biológica que clasifica y estudia estos organismos es la:",
                    options = listOf(
                        "Entomología",
                        "Helmintología",
                        "Aracnología",
                        "Protozoología",
                        "Mastozoología"
                    ),
                    correctIndex = 1,
                    explanation = "La Helmintología es la subdisciplina de la zoología que estudia a los gusanos planos (platelmintos como la tenia) y cilíndricos (nematelmintos como el áscaris)."
                ),
                Challenge(
                    id = "bio_t01_s01_c5",
                    statement = "Un cardiólogo analiza la arquitectura macroscópica de las aurículas y ventrículos, mientras que otro registra la variación del potencial de acción y gasto cardíaco en reposo. Estas investigaciones corresponden, respectivamente, a:",
                    options = listOf(
                        "Fisiología y Citología",
                        "Anatomía y Fisiología",
                        "Histología y Genética",
                        "Morfología y Embriología",
                        "Ecología y Etología"
                    ),
                    correctIndex = 1,
                    explanation = "La Anatomía estudia la forma, estructura macroscópica y disposición espacial de los órganos, mientras que la Fisiología investiga las funciones dinámicas y los mecanismos físico-químicos que sostienen la vida."
                ),
                Challenge(
                    id = "bio_t01_s01_c6",
                    statement = "En las lomas costeras del sur del Perú se colectan briofitas (musgos) y pteridofitas (helechos) para estudiar su reproducción sin flores ni semillas. La rama botánica pertinente es la:",
                    options = listOf(
                        "Botánica fanerogámica",
                        "Botánica criptogámica",
                        "Ficología marina",
                        "Dendrología forestal",
                        "Palinología moderna"
                    ),
                    correctIndex = 1,
                    explanation = "La Botánica Criptogámica se encarga de las plantas 'sin flores' ni semillas verdaderas, abarcando los musgos (Briología) y los helechos (Pteridología)."
                ),
                Challenge(
                    id = "bio_t01_s01_c7",
                    statement = "Un equipo de guardaparques en el Cañón del Colca monitorea la anidación, plumaje y dinámica de vuelo del cóndor andino (Vultur gryphus). ¿Qué rama especializada de la zoología interviene?",
                    options = listOf(
                        "Mastozoología",
                        "Herpetología",
                        "Ornitología",
                        "Entomología",
                        "Etología comparada vegetal"
                    ),
                    correctIndex = 2,
                    explanation = "La Ornitología es la rama de la zoología especializada en el estudio integral de las aves, como el cóndor andino."
                ),
                Challenge(
                    id = "bio_t01_s01_c8",
                    statement = "¿Qué científico acuñó formalmente en 1869 el término 'Ecología' para designar el estudio de las relaciones entre los organismos y su entorno?",
                    options = listOf(
                        "Jean-Baptiste Lamarck",
                        "Ernst Haeckel",
                        "Alexander von Humboldt",
                        "Gregor Mendel",
                        "Thomas Hunt Morgan"
                    ),
                    correctIndex = 1,
                    explanation = "El naturalista y filósofo alemán Ernst Haeckel propuso en 1869 el término Ecología (del griego oikos: casa o hábitat, y logos: tratado)."
                ),
                Challenge(
                    id = "bio_t01_s01_c9",
                    statement = "Un estudiante afirma que 'las arañas viudas negras y los escorpiones son insectos y por ende deben ser clasificados por la Entomología'. Dicha afirmación es errónea porque:",
                    options = listOf(
                        "Pertenecen a los moluscos estudiados por la Malacología",
                        "Son arácnidos quelicerados cuyo estudio corresponde a la Aracnología",
                        "Son gusanos cilíndricos investigados por la Helmintología",
                        "Son crustáceos acuáticos objeto de la Carcinología",
                        "Son animales vertebrados estudiados por la Herpetología"
                    ),
                    correctIndex = 1,
                    explanation = "Las arañas y escorpiones poseen 4 pares de patas marchadoras, quelíceros y carecen de antenas; son arácnidos y su disciplina de estudio es la Aracnología. La Entomología estudia exclusivamente a los insectos (3 pares de patas y antenas)."
                ),
                Challenge(
                    id = "bio_t01_s01_c10",
                    statement = "Al procesar una biopsia gástrica, el patólogo tiñe cortes delgados con hematoxilina-eosina para examinar la disposición del epitelio cilíndrico simple y el tejido conectivo subyacente. ¿Qué disciplina aplica directamente?",
                    options = listOf(
                        "Citología exfoliativa",
                        "Histología",
                        "Anatomía macroscópica",
                        "Embriología",
                        "Ecología humana"
                    ),
                    correctIndex = 1,
                    explanation = "La Histología estudia la organización microscópica, morfología y función de los tejidos biológicos."
                ),
                Challenge(
                    id = "bio_t01_s01_c11",
                    statement = "La observación continuada de las jerarquías de dominancia, cortejo y defensas territoriales en manadas silvestres de vicuñas (Vicugna vicugna) en Pampa Cañahuas corresponde a la:",
                    options = listOf(
                        "Taxonomía",
                        "Etología",
                        "Embriología",
                        "Fisiología vegetal",
                        "Genética molecular"
                    ),
                    correctIndex = 1,
                    explanation = "La Etología es la disciplina biológica que estudia el comportamiento instintivo y aprendido de los animales en sus condiciones naturales."
                ),
                Challenge(
                    id = "bio_t01_s01_c12",
                    statement = "Los bacteriófagos y el virus de la influenza son entidades acelulares constituidas por un genoma de ácido nucleico envuelto en una cápside proteica. La disciplina que los estudia es la:",
                    options = listOf(
                        "Bacteriología",
                        "Protozoología",
                        "Virología",
                        "Micología",
                        "Ficología"
                    ),
                    correctIndex = 2,
                    explanation = "La Virología es la rama de la microbiología que se enfoca en el estudio de los virus, viroides y priones, los cuales son agentes subcelulares no vivos que carecen de metabolismo propio."
                ),
                Challenge(
                    id = "bio_t01_s01_c13",
                    statement = "Un agricultor en el valle de Tambo cultiva maíz y olivo, plantas vasculares que desarrollan flores, polen y frutos con semillas protegidas. Estas plantas son objeto de estudio de la:",
                    options = listOf(
                        "Botánica criptogámica",
                        "Briología especializada",
                        "Botánica fanerogámica",
                        "Pteridología",
                        "Micología agrícola"
                    ),
                    correctIndex = 2,
                    explanation = "La Botánica Fanerogámica (o Espermatofitas) estudia las plantas que poseen flores evidentes y producen semillas (gimnospermas y angiospermas como el maíz y el olivo)."
                ),
                Challenge(
                    id = "bio_t01_s01_c14",
                    statement = "Relacione correctamente la rama zoológica con su respectivo objeto de estudio:\nI. Ictiología\nII. Herpetología\nIII. Mastozoología\nIV. Carcinología\n(a. Serpientes y ranas / b. Truchas y tiburones / c. Camarones y cangrejos / d. Vicuñas y ballenas)",
                    options = listOf(
                        "I-b, II-a, III-d, IV-c",
                        "I-a, II-b, III-c, IV-d",
                        "I-d, II-a, III-b, IV-c",
                        "I-b, II-c, III-d, IV-a",
                        "I-c, II-d, III-a, IV-b"
                    ),
                    correctIndex = 0,
                    explanation = "Ictiología = peces (b); Herpetología = reptiles y anfibios (a); Mastozoología = mamíferos (d); Carcinología = crustáceos (c). La combinación exacta es I-b, II-a, III-d, IV-c."
                )
            ),
            learningObjectives = listOf(
                "Definición y etimología de la Biología (Lamarck y Treviranus, 1802)",
                "Ramas taxonómicas zoológicas, botánicas y microbiológicas",
                "Disciplinas por nivel de organización: citología, histología, ecología",
                "Claves fijas y diferenciación precisa para el examen de admisión"
            )
        ),
        LessonNode(
            id = "bio_t01_s02",
            subjectId = "biologia",
            semana = 1,
            subtema = "1.2",
            title = "Fases del Método Científico en Biología",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t01_s02",
                asignatura = "Biología",
                semana = 1,
                titulo = "Fases Rigurosas del Método Científico",
                resumen = """El método científico es un procedimiento ordenado, racional, sistemático y autocorrectivo que permite investigar fenómenos naturales, adquirir nuevos conocimientos y validar hipótesis con evidencia empírica.

                    # 1.2.1 — Observación y Planteamiento del Problema
                    - **Observación Rigurosa:** Percepción atenta y sistemática de un hecho natural mediante los sentidos e instrumentos de precisión (microscopios, balanzas). Debe ser objetiva, reproducible y desprovista de juicios subjetivos.
                    - **Planteamiento del Problema:** Formulación de una pregunta científica clara, delimitada y comprobable que surge a partir de las regularidades o anomalías observadas. Suele plantearse en la forma: *¿De qué manera el factor X influye sobre el fenómeno Y bajo las condiciones Z?*

                    # 1.2.2 — Formulación de la Hipótesis y Predicciones
                    - **Hipótesis:** Es una **respuesta tentativa, racional y provisional** al problema formulado.
                    - **Criterio de Falsabilidad (Karl Popper):** Toda hipótesis científica debe ser susceptible de ser refutada o desmentida mediante pruebas experimentales. Si una afirmación no puede ponerse a prueba o no admite posible refutación, no es científica.
                    - Se enuncia comúnmente en formato condicional: *"Si [ocurre la causa postulada], entonces [se observará la consecuencia medible]"*.
                    - **Carácter provisional:** Una hipótesis nunca se declara 'verdad absoluta e incuestionable'; se valida o corrobora temporalmente mientras no existan datos que la contradigan.

                    # 1.2.3 — Experimentación, Grupo Control y Grupo Experimental
                    - **Experimentación Controlada:** Reproducción deliberada y planificada del fenómeno en condiciones estandarizadas para aislar causas y efectos.
                    - **Grupo Experimental:** Muestra que recibe la variable manipulada (el tratamiento evaluado).
                    - **Grupo Control (o Testigo):** Muestra idéntica en todos los factores pero que **no recibe el tratamiento** (o recibe un placebo/condición basal). Sirve de patrón de comparación para confirmar que el efecto se debe exclusivamente a la variable investigada.
                    - **Análisis de Resultados y Conclusión:** Evaluación estadística de los datos. Si los resultados coinciden con la predicción, la hipótesis se acepta provisionalmente; si discrepan, la hipótesis se rechaza y se reformula.

                    # 1.2.4 — Teoría Científica y Ley Científica
                    - **Teoría Científica:** Explicación integradora, coherente y ampliamente respaldada por múltiples evidencias empíricas que explica *el cómo y el porqué* de un conjunto de fenómenos naturales (ej. Teoría Celular, Teoría de la Evolución por Selección Natural).
                    - **Ley Científica:** Enunciado descriptivo, invariable, universal y habitualmente formulado en lenguaje matemático que expresa *qué sucede* con una relación constante en la naturaleza (ej. Leyes de Mendel, Ley de Conservación de la Masa). **Las teorías no son leyes en proceso de maduración; son conceptos epistemológicos distintos**.
                """,
                conceptosClave = listOf(
                    "La hipótesis es una respuesta tentativa y falsable.",
                    "El grupo control sirve de testigo comparativo sin el tratamiento.",
                    "La teoría explica el mecanismo; la ley describe la relación constante."
                ),
                admissionTip = "Pregunta clásica de admisión: 'Una teoría científica que se demuestra muchas veces, ¿se convierte en ley?' ¡FALSO! La teoría explica el mecanismo causal subyacente (por qué y cómo), mientras que la ley describe el patrón invariable observado (qué ocurre matemáticamente).",
                admissionExplanation = "Comprender la diferencia entre hipótesis, teoría y ley evita caer en las trampas conceptuales más comunes del método científico."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s02_c1",
                    statement = "En el método científico, la hipótesis se define formalmente como:",
                    options = listOf(
                        "Una verdad científica universal e inmutable",
                        "Una respuesta tentativa, racional y sujeta a contrastación empírica",
                        "El resultado estadístico definitivo de una investigación",
                        "Una simple corazonada no contrastable formulada al azar",
                        "La descripción matemática invariable de un fenómeno físico"
                    ),
                    correctIndex = 1,
                    explanation = "La hipótesis es una proposición explicativa provisional que busca responder al problema científico y que debe ponerse a prueba empíricamente."
                ),
                Challenge(
                    id = "bio_t01_s02_c2",
                    statement = "¿Cuál de los siguientes enunciados constituye una observación científica rigurosa y objetiva?",
                    options = listOf(
                        "Las plantas de habas cultivadas en suelo arenoso tienen hojas de color desagradable",
                        "Las plántulas de maíz expuestas a luz roja crecieron 14.5 cm en promedio durante 10 días",
                        "El cultivo de bacterias se ve extraño y probablemente no sirva para nada",
                        "La temperatura del invernadero fue muy agradable para el investigador",
                        "Los ratones del grupo 1 mostraron un comportamiento simpático y amistoso"
                    ),
                    correctIndex = 1,
                    explanation = "La observación científica debe ser objetiva, medible y cuantificable, libre de adjetivos subjetivos o apreciaciones personales."
                ),
                Challenge(
                    id = "bio_t01_s02_c3",
                    statement = "En un experimento biológico bien diseñado, la función primordial del grupo control o testigo es:",
                    options = listOf(
                        "Recibir la máxima dosis posible de la variable experimental",
                        "Servir de línea base de comparación para verificar si el efecto se debe al tratamiento",
                        "Aumentar artificialmente el número de datos para publicar el artículo",
                        "Reemplazar al grupo experimental cuando los resultados salen desfavorables",
                        "Demostrar que todos los individuos reaccionan exactamente igual"
                    ),
                    correctIndex = 1,
                    explanation = "El grupo control permite aislar el efecto de la variable manipulada frente a posibles variaciones fortuitas o ambientales que ocurrirían de modo natural."
                ),
                Challenge(
                    id = "bio_t01_s02_c4",
                    statement = "Según el epistemólogo Karl Popper, una característica indispensable para que una hipótesis sea considerada científica es la:",
                    options = listOf(
                        "Infalibilidad absoluta",
                        "Falsabilidad o refutabilidad",
                        "Aprobación por voto popular",
                        "Complejidad lingüística incomprensible",
                        "Imposibilidad de someterse a prueba experimental"
                    ),
                    correctIndex = 1,
                    explanation = "El criterio de demarcación popperiano establece que una hipótesis es científica solo si existe la posibilidad lógica y práctica de demostrar su eventual falsedad mediante experimentos u observaciones."
                ),
                Challenge(
                    id = "bio_t01_s02_c5",
                    statement = "En el siglo XVII, Francesco Redi colocó carne en frascos abiertos y en frascos sellados herméticamente con gasa. Al observar larvas únicamente en los frascos abiertos donde entraban moscas, Redi concluyó que los gusanos no surgían por generación espontánea. En este diseño, los frascos abiertos funcionaron como:",
                    options = listOf(
                        "Variable interviniente no controlada",
                        "Grupo experimental con gasa",
                        "Grupo testigo o control",
                        "Hipótesis irrelevante",
                        "Conclusión no validada"
                    ),
                    correctIndex = 2,
                    explanation = "Los frascos abiertos representaban la condición natural habitual (control/testigo), mientras que los cubiertos con gasa eran el grupo experimental sometido a la restricción del paso de moscas."
                ),
                Challenge(
                    id = "bio_t01_s02_c6",
                    statement = "¿Cuál de las siguientes formulaciones representa un planteamiento del problema redactado de forma correcta según el método científico?",
                    options = listOf(
                        "La fertilización orgánica siempre será superior a la química",
                        "¿En qué medida la concentración de salinidad del agua afecta la tasa de eclosión de los quistes de Artemia salina?",
                        "Es hermoso estudiar cómo crecen las flores en primavera en el valle de Chilina",
                        "Las bacterias son organismos microscópicos peligrosos para la salud humana",
                        "Si llueve intensamente en verano, entonces habrá huaicos en la cordillera"
                    ),
                    correctIndex = 1,
                    explanation = "El planteamiento del problema debe ser una pregunta delimitada, no ambigua, que relacione variables y admita contrastación empírica."
                ),
                Challenge(
                    id = "bio_t01_s02_c7",
                    statement = "Si tras rigurosos ensayos experimentales los datos obtenidos coinciden plenamente con la hipótesis formulada, el investigador debe:",
                    options = listOf(
                        "Declarar su hipótesis como un dogma universal intocable para siempre",
                        "Aceptar provisionalmente la hipótesis y comunicar sus resultados para reproducibilidad",
                        "Rechazar el experimento por falta de sorpresas estadísticas",
                        "Transformar de inmediato su hipótesis en una ley matemática",
                        "Destruir los datos para evitar que otros científicos los revisen"
                    ),
                    correctIndex = 1,
                    explanation = "En ciencia, las hipótesis contrastadas se aceptan de manera provisional y se someten al escrutinio de la comunidad científica mediante publicaciones reproducibles."
                ),
                Challenge(
                    id = "bio_t01_s02_c8",
                    statement = "Respecto a la diferencia entre Teoría Científica y Ley Científica en Biología, señale el enunciado académicamente correcto:",
                    options = listOf(
                        "Una teoría es una conjetura sin pruebas que cuando se demuestra se convierte en ley",
                        "La ley describe una relación constante observable; la teoría explica el mecanismo que la origina",
                        "Las leyes son explicaciones biológicas y las teorías son fórmulas físicas",
                        "Una teoría no requiere evidencia empírica mientras que la ley sí",
                        "En biología no existen teorías validadas debido a la variabilidad de la vida"
                    ),
                    correctIndex = 1,
                    explanation = "La ley científica describe relaciones constantes e invariables (el qué), mientras que la teoría científica proporciona el marco explicativo fundamentado y unificador de por qué y cómo ocurren los fenómenos."
                ),
                Challenge(
                    id = "bio_t01_s02_c9",
                    statement = "Un agrónomo en Majes aplica un nuevo biofungicida a 100 plantas de vid infectadas con oídio (Lote A) y a otras 100 plantas infectadas idénticas les aplica solo agua destilada (Lote B). El Lote B representa:",
                    options = listOf(
                        "El grupo experimental",
                        "El grupo testigo o control",
                        "La variable independiente",
                        "La hipótesis rechazada",
                        "La teoría confirmada"
                    ),
                    correctIndex = 1,
                    explanation = "El lote B, al recibir solo el solvente inocuo (agua destilada), actúa como grupo control o testigo para comparar la eficacia del biofungicida."
                ),
                Challenge(
                    id = "bio_t01_s02_c10",
                    statement = "Indique la secuencia lógica y cronológica habitual de las etapas del método científico:",
                    options = listOf(
                        "Experimentación → Observación → Hipótesis → Conclusión → Problema",
                        "Observación → Planteamiento del Problema → Hipótesis → Experimentación → Conclusión",
                        "Hipótesis → Conclusión → Observación → Experimentación → Ley",
                        "Planteamiento del Problema → Conclusión → Hipótesis → Observación",
                        "Teoría → Experimentación → Hipótesis → Observación → Problema"
                    ),
                    correctIndex = 1,
                    explanation = "La secuencia clásica ordenada inicia con la observación rigurosa, delimitación del problema, postulación de hipótesis, contrastación experimental y análisis para la conclusión."
                ),
                Challenge(
                    id = "bio_t01_s02_c11",
                    statement = "El principio según el cual cualquier experimento científico debe poder ser repetido por otros investigadores en cualquier laboratorio del mundo obteniendo resultados similares se denomina:",
                    options = listOf(
                        "Subjetividad",
                        "Reproducibilidad o replicabilidad",
                        "Arbitrariedad experimental",
                        "Dogmatismo metodológico",
                        "Inmutabilidad absoluta"
                    ),
                    correctIndex = 1,
                    explanation = "La reproducibilidad es una de las condiciones fundamentales del método científico: un experimento que no puede ser replicado independientemente carece de validez científica."
                ),
                Challenge(
                    id = "bio_t01_s02_c12",
                    statement = "Cuando los resultados de un experimento sistemático contradicen rotundamente las predicciones de una hipótesis, el método científico exige:",
                    options = listOf(
                        "Alterar los datos experimentales para forzar la coincidencia con la hipótesis",
                        "Rechazar o reformular la hipótesis a la luz de las nuevas evidencias obtenidas",
                        "Ignorar los resultados y publicar la hipótesis original como válida",
                        "Suspender definitivamente toda investigación sobre el tema",
                        "Acusar a los instrumentos de laboratorio de sabotaje intencional"
                    ),
                    correctIndex = 1,
                    explanation = "El método científico es autocorrectivo: si los datos empíricos no sustentan la hipótesis, esta debe ser refutada, corregida o reemplazada por una nueva formulación."
                ),
                Challenge(
                    id = "bio_t01_s02_c13",
                    statement = "Un equipo de biólogos de la UNSA formula: 'Si la concentración de dióxido de azufre en el aire de Arequipa se incrementa, entonces la diversidad de líquenes epífitos en la corteza de los árboles disminuirá'. Esta formulación condicional representa:",
                    options = listOf(
                        "Una ley invariable",
                        "Una observación sensorial aislada",
                        "Una hipótesis con predicción contrastable",
                        "Una conclusión definitiva",
                        "Un dogma de fe ambiental"
                    ),
                    correctIndex = 2,
                    explanation = "La proposición condicional 'Si... entonces...' que anticipa una relación causal contrastable entre la contaminación y la diversidad liquénica constituye formalmente una hipótesis científica."
                )
            ),
            learningObjectives = listOf(
                "Definición y principios del método científico",
                "Observación objetiva vs planteamiento del problema",
                "Hipótesis científica, falsabilidad de Popper y contrastación",
                "Grupo control vs experimental y diferencias entre Teoría y Ley"
            )
        ),
        LessonNode(
            id = "bio_t01_s03",
            subjectId = "biologia",
            semana = 1,
            subtema = "1.3",
            title = "Variables en la Investigación Biológica",
            depth = LessonDepth.SIMPLE,
            theory = LessonTheory(
                id = "th_bio_t01_s03",
                asignatura = "Biología",
                semana = 1,
                titulo = "Variables en la Investigación Biológica",
                resumen = """En todo diseño experimental riguroso, la identificación y el control estricto de variables es fundamental para asegurar que los resultados obtenidos reflejen una relación de causa y efecto indiscutible.

                    # Variable Independiente (VI)
                    Es la variable **manipulada deliberadamente o causa hipotética** que el experimentador modifica de forma intencional entre los grupos para observar qué sucede (ej. distintas dosis de un fertilizante, grados de temperatura de incubación, concentraciones de un antibiótico).

                    # Variable Dependiente (VD)
                    Es la variable de **efecto o respuesta medida**. Es el fenómeno que el investigador registra, cuantifica o mide al final del ensayo para evaluar el impacto de la variable independiente (ej. milímetros de crecimiento de la raíz, porcentaje de germinación, masa muscular ganada, volumen de oxígeno desprendido).

                    # Variables Intervinientes o Controladas
                    Son todos aquellos factores ambientales, fisiológicos o metodológicos que podrían influir sobre la variable dependiente y que **deben mantenerse idénticos y rigurosamente constantes** en todos los grupos del experimento (ej. intensidad de luz, tipo de sustrato, volumen de riego, especie biológica, edad de los especímenes). Si una variable interviniente no es controlada adecuadamente, se transforma en una *variable de confusión* que invalida el experimento.

                    # Grupo Control o Testigo
                    Sirve de patrón de comparación basal. No recibe la manipulación de la variable independiente (o recibe un tratamiento placebo estándar), permitiendo demostrar con certeza estadística que los cambios observados en el grupo experimental obedecen exclusivamente a la variable independiente.
                """,
                conceptosClave = listOf(
                    "Variable Independiente = Causa que el científico manipula intencionalmente.",
                    "Variable Dependiente = Efecto que se mide y cuantifica al final.",
                    "Variables Controladas = Factores que se mantienen idénticos para no falsear los datos."
                ),
                admissionTip = "Regla de oro para resolver preguntas DECO de admisión: Pregúntate: ¿Qué modificó el investigador con sus propias manos al inicio? Esa es la Variable Independiente. ¿Qué midió con una regla, balanza, cronómetro o contador al final? Esa es la Variable Dependiente.",
                admissionExplanation = "Diferenciar la causa manipulada del efecto medido resuelve el 100% de los ejercicios de diseño experimental en exámenes universitarios."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s03_c1",
                    statement = "En un experimento científico, la Variable Independiente se define conceptualmente como:",
                    options = listOf(
                        "El efecto que se cuantifica al culminar el experimento",
                        "El factor causal que el experimentador manipula intencionalmente",
                        "Cualquier factor secundario que cambia de forma descontrolada",
                        "El instrumento óptico empleado para tomar fotografías",
                        "El grupo de individuos que no recibe ningún tipo de tratamiento"
                    ),
                    correctIndex = 1,
                    explanation = "La Variable Independiente es la causa manipulada deliberadamente por el investigador para evaluar sus efectos sobre el sistema biológico estudiado."
                ),
                Challenge(
                    id = "bio_t01_s03_c2",
                    statement = "En una investigación sobre nutrición en truchas arcoíris, se suministran dietas con 20%, 30% y 40% de harina de quinua. Al cabo de 60 días, se pesa a cada ejemplar en una balanza digital. ¿Cuál es la Variable Dependiente?",
                    options = listOf(
                        "El porcentaje de harina de quinua suministrado",
                        "El peso final alcanzado por las truchas",
                        "La temperatura del agua en las piscigranjas",
                        "La especie de trucha elegida",
                        "La marca de la balanza digital utilizada"
                    ),
                    correctIndex = 1,
                    explanation = "La Variable Dependiente es el efecto medido por el investigador: en este caso, la masa o peso final de las truchas. La dieta con harina de quinua es la Variable Independiente."
                ),
                Challenge(
                    id = "bio_t01_s03_c3",
                    statement = "Para estudiar el efecto de las heladas en la papa nativa, un agrónomo somete plántulas a -4 °C, -1 °C y 15 °C, manteniendo idéntico tipo de maceta, volumen de sustrato, humedad y fotoperíodo de 12 horas de luz. Los factores mantenidos constantes corresponden a:",
                    options = listOf(
                        "Variables dependientes múltiples",
                        "Variables controladas o intervinientes",
                        "Variables independientes de confusión",
                        "Grupos experimentales no válidos",
                        "Hipótesis nulas confirmadas"
                    ),
                    correctIndex = 1,
                    explanation = "Los factores que el experimentador mantiene invariables en todos los grupos para evitar que influyan sobre el resultado son las Variables Controladas o Intervinientes."
                ),
                Challenge(
                    id = "bio_t01_s03_c4",
                    statement = "Un estudiante evalúa la actividad de la enzima catalasa agregando agua oxigenada a extracto de hígado a diferentes pH (pH 4, 7 y 10) y mide los mililitros de espuma de oxígeno producidos. ¿Cuáles son, respectivamente, la Variable Independiente y la Variable Dependiente?",
                    options = listOf(
                        "Volumen de espuma y tipo de hígado",
                        "El pH del medio y el volumen de espuma de oxígeno producido",
                        "La temperatura ambiente y la cantidad de agua destilada",
                        "El volumen de espuma y el pH del medio",
                        "La marca del tubo de ensayo y la concentración de sustrato"
                    ),
                    correctIndex = 1,
                    explanation = "La Variable Independiente (causa modificada) es el pH del medio ensayado. La Variable Dependiente (efecto medido) es el volumen de espuma de oxígeno liberado."
                ),
                Challenge(
                    id = "bio_t01_s03_c5",
                    statement = "Si en un experimento sobre germinación de semillas de kiwicha el investigador olvida controlar la humedad y unas macetas reciben el doble de agua que otras, dicha humedad no controlada se denomina:",
                    options = listOf(
                        "Variable dependiente de precisión",
                        "Variable extraña o de confusión que resta validez interna",
                        "Grupo testigo perfectamente estandarizado",
                        "Constante termodinámica invariable",
                        "Conclusión empíricamente contrastada"
                    ),
                    correctIndex = 1,
                    explanation = "Una variable que puede alterar el resultado pero que no fue controlada por negligencia o limitación técnica se convierte en una variable extraña o de confusión, distorsionando la validez del ensayo."
                ),
                Challenge(
                    id = "bio_t01_s03_c6",
                    statement = "En un laboratorio de microbiología se ensaya la eficacia de un nuevo antibiótico contra Staphylococcus aureus. Se preparan 10 placas Petri con discos de diferentes concentraciones del fármaco y 1 placa Petri con un disco de papel filtro con agua estéril sin antibiótico. Esta última placa corresponde a:",
                    options = listOf(
                        "La variable independiente pura",
                        "El grupo control o testigo negativo",
                        "La variable dependiente cuantitativa",
                        "Una hipótesis sin sentido",
                        "Un residuo biocontaminado inservible"
                    ),
                    correctIndex = 1,
                    explanation = "La placa que recibe el disco con agua estéril (sin agente activo) es el grupo control o testigo negativo, útil para confirmar que el disco de papel por sí solo no inhibe a las bacterias."
                ),
                Challenge(
                    id = "bio_t01_s03_c7",
                    statement = "¿Por qué es crucial mantener constantes las variables intervinientes en todos los lotes de una investigación biológica?",
                    options = listOf(
                        "Para asegurar que cualquier cambio en la variable dependiente se deba únicamente a la variable independiente",
                        "Para que el experimento sea mucho más costoso y complejo",
                        "Para evitar tener que medir los resultados al final del experimento",
                        "Porque las leyes de la física prohíben que los seres vivos cambien",
                        "Para obligar a que la hipótesis formulada se cumpla siempre sin excepción"
                    ),
                    correctIndex = 0,
                    explanation = "Controlar estrictamente las variables intervinientes garantiza el principio de aislamiento experimental: el efecto medido (VD) responderá exclusivamente a la causa manipulada (VI)."
                )
            ),
            learningObjectives = listOf(
                "Identificar la Variable Independiente como causa manipulada",
                "Identificar la Variable Dependiente como efecto medido",
                "Importancia de las variables controladas o intervinientes",
                "Resolución de casos de diseño experimental tipo examen de admisión"
            )
        ),
        LessonNode(
            id = "bio_t01_s04",
            subjectId = "biologia",
            semana = 1,
            subtema = "1.4",
            title = "Microscopía y Normas de Bioseguridad",
            depth = LessonDepth.EXTENSIVE,
            theory = LessonTheory(
                id = "th_bio_t01_s04",
                asignatura = "Biología",
                semana = 1,
                titulo = "Microscopía y Normas de Bioseguridad",
                resumen = """La microscopía revolucionó las ciencias biológicas al revelar el mundo invisible de células y moléculas. Paralelamente, la bioseguridad establece normas de contención para proteger al personal, a la comunidad y al medio ambiente contra riesgos biológicos.

                    # 1.4.1 — Microscopía Óptica Compuesta (MOC)
                    - **Principio físico:** Utiliza fotones de luz visible (λ ≈ 400 - 700 nm) y un sistema de lentes convergentes de vidrio.
                    - **Límite de resolución:** Es la distancia mínima que debe existir entre dos puntos contiguos para que puedan ser percibidos como entidades separadas. En el MOC es de aproximadamente **0.2 μm (200 nm)**. En contraste, el límite de resolución del ojo humano es de ≈ 0.1 - 0.2 mm (100 - 200 μm).
                    - **Aumento Total (A_total):** Resulta del producto del aumento del lente ocular por el aumento del lente objetivo empleado:
                      A_total = A_ocular × A_objetivo
                      Por ejemplo, un ocular de 10× combinado con un objetivo de inmersión de 100× genera un aumento total de **1000×**.
                    - **Aceite de inmersión:** Sustancia con el mismo índice de refracción que el vidrio (n ≈ 1.51) que se interpone entre el cubreobjetos y el objetivo de 100× para evitar la refracción dispersiva de la luz hacia el aire, maximizando la resolución.
                    - **Sistemas del microscopio:**
                      - *Sistema Óptico:* Oculares, revólver con objetivos (seco débil 10×, seco fuerte 40×, inmersión 100×), condensador con diafragma iris y fuente de luz.
                      - *Sistema Mecánico:* Base, brazo estativo, platina con pinzas coaxiales, tornillo macrométrico (enfoque grueso) y tornillo micrométrico (enfoque fino de alta precisión).
                    - **Aplicaciones:** Observación de células vivas en movimiento, glóbulos sanguíneos, protozoarios, cortes histológicos coloreados y morfología bacteriana básica.

                    # 1.4.2 — Microscopía Electrónica (MET y MEB)
                    - **Principio físico:** Utiliza un haz colimado de electrones acelerados al vacío y lentes electromagnéticas. Al tener los electrones una longitud de onda miles de veces menor que la luz visible (λ ≈ 0.005 nm), el límite de resolución alcanza hasta **0.2 nm (2 Å)** y aumentos superiores a 500,000×.
                    - **Microscopio Electrónico de Transmisión (MET):**
                      - Los electrones **atraviesan cortes ultrafinos** de la muestra (tratada con metales pesados como osmio o uranilo).
                      - Produce imágenes en **dos dimensiones (2D)** de la **ultraestructura interna celular**: membranas, crestas mitocondriales, cisternas del complejo de Golgi, tilacoides, ribosomas y cápsides víricas.
                    - **Microscopio Electrónico de Barrido (MEB):**
                      - Los electrones primarios **barren la superficie** de la muestra (desecada y recubierta con una película atómica de oro o platino).
                      - Los electrones secundarios emitidos son captados para generar una imagen en **tres dimensiones (3D)** con gran profundidad de campo de la **morfología superficial externa**: superficie de granos de polen, cilios celulares, patas de insectos y glóbulos rojos.

                    # 1.4.3 — Principios y Niveles de Bioseguridad
                    - **Principios Universales:**
                      - *Universalidad:* Todo paciente, muestra o fluido biológico debe considerarse potencialmente infeccioso, independientemente del origen conocido.
                      - *Uso de barreras de contención:* Barreras primarias (Equipos de Protección Personal - EPP: mandil de manga larga, guantes de nitrilo, mascarilla/respirador, gafas de seguridad) y barreras secundarias (infraestructura, cabinas de seguridad biológica - CSB y autoclaves de calor húmedo para esterilización).
                      - *Medios de eliminación de residuos:* Protocolos específicos para descarte sin riesgo ambiental.
                    - **Niveles de Bioseguridad (Biosafety Levels - BSL):**
                      - **BSL-1 (Riesgo mínimo):** Microorganismos inocuos que no causan enfermedad en humanos adultos sanos (ej. *Bacillus subtilis*, *Escherichia coli* cepa de laboratorio K12). Trabajo en mesadas abiertas.
                      - **BSL-2 (Riesgo moderado):** Patógenos que causan enfermedad por inoculación percutánea, ingestión o mucosas (ej. *Salmonella enterica*, virus de Hepatitis B, *Staphylococcus aureus*). Uso obligatorio de cabinas de bioseguridad para procedimientos que generen aerosoles.
                      - **BSL-3 (Riesgo alto / transmisión aérea):** Microorganismos autóctonos o exóticos que se transmiten por aerosoles y causan infecciones graves o letales, pero que **poseen tratamiento médico o vacuna preventiva disponible** (ej. *Mycobacterium tuberculosis*, virus del SARS-CoV-2, *Bacillus anthracis*). Requiere laboratorios con presión negativa de aire y filtros HEPA.
                      - **BSL-4 (Riesgo extremo / contención máxima):** Agentes exóticos de alta letalidad que se transmiten por vía aérea para los cuales **no existe tratamiento curativo ni vacuna disponible** (ej. virus Ébola, virus de Marburg, virus Lassa). Requiere trajes herméticos de presión positiva con suministro autónomo de oxígeno e instalaciones aisladas.

                    # 1.4.4 — Gestión de Residuos Hospitalarios y de Laboratorio
                    - **Bolsa Roja (Residuos Biocontaminados):** Gasas con sangre, cultivos bacterianos, torundas de algodón, guantes usados en procedimientos clínicos.
                    - **Bolsa Amarilla (Residuos Especiales / Químicos):** Frascos con reactivos tóxicos o inflamables, disolventes orgánicos, medicamentos vencidos o residuos citotóxicos.
                    - **Bolsa Negra (Residuos Comunes):** Papel higiénico, cartón limpio, envoltorios de alimentos procedentes de áreas administrativas.
                    - **Recipiente Rígido Punzocortante (Rojo):** Agujas hipodérmicas, hojas de bisturí, lancetas y vidrios rotos contaminados. Deben desecharse directamente sin reencapuchar la aguja y sellarse al alcanzar las **tres cuartas (3/4) partes** de su capacidad.
                """,
                conceptosClave = listOf(
                    "Límite de resolución MOC: 0.2 micrómetros (200 nm).",
                    "Aumento total = Aumento ocular × Aumento objetivo.",
                    "MET: ultraestructura interna en 2D; MEB: superficie tridimensional en 3D.",
                    "Universalidad: toda muestra biológica se asume infecciosa.",
                    "Bolsa roja = biocontaminados; Bolsa amarilla = químicos/medicamentos; Bolsa negra = comunes."
                ),
                admissionTip = "Regla mnemotécnica infalible de examen: MET = 'Transmisión' atraviesa y muestra el 'Interior 2D' (organelos). MEB = 'Barrido' rebota en oro y muestra el 'Relieve 3D' (superficies). Si preguntan por residuos: sangre y cultivos van a bolsa ROJA; medicamentos y reactivos a bolsa AMARILLA.",
                admissionExplanation = "Conocer la resolución de cada microscopio y la clasificación de residuos y niveles BSL garantiza el acierto en todas las preguntas de ciencias aplicadas y laboratorio."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s04_c1",
                    statement = "El límite de resolución del microscopio óptico compuesto (MOC) convencional es de aproximadamente:",
                    options = listOf(
                        "0.2 milímetros",
                        "0.2 micrómetros (200 nanómetros)",
                        "0.2 nanómetros (2 ángstroms)",
                        "20 picómetros",
                        "2 milímetros"
                    ),
                    correctIndex = 1,
                    explanation = "El límite de resolución del MOC está restringido por la longitud de onda de la luz visible a aproximadamente 0.2 micrómetros (200 nm)."
                ),
                Challenge(
                    id = "bio_t01_s04_c2",
                    statement = "Si un estudiante de medicina observa un frotis de sangre utilizando un ocular de 10× y un objetivo de inmersión de 100×, ¿cuál es el aumento total alcanzado?",
                    options = listOf(
                        "110×",
                        "1000×",
                        "500×",
                        "10000×",
                        "200×"
                    ),
                    correctIndex = 1,
                    explanation = "El aumento total es el producto de ambos lentes: 10 × 100 = 1000 aumentos (1000×)."
                ),
                Challenge(
                    id = "bio_t01_s04_c3",
                    statement = "¿Cuál es la función fisicoquímica fundamental de colocar una gota de aceite de inmersión entre la preparación y el objetivo de 100×?",
                    options = listOf(
                        "Teñir el núcleo celular de color azul violáceo",
                        "Igualar el índice de refracción del vidrio para evitar la dispersión de los rayos de luz",
                        "Matar instantáneamente a las bacterias patógenas para bioseguridad",
                        "Evitar que la muestra se caliente por el calor del foco",
                        "Incrementar la distancia focal del tornillo macrométrico"
                    ),
                    correctIndex = 1,
                    explanation = "El aceite de inmersión tiene un índice de refracción casi idéntico al vidrio (n ≈ 1.51), lo que impide que la luz se desvíe al salir del cubreobjetos hacia el objetivo, aumentando la apertura numérica y resolución."
                ),
                Challenge(
                    id = "bio_t01_s04_c4",
                    statement = "Un citólogo requiere examinar la doble membrana y la ultraestructura interna detallada de las crestas mitocondriales en cortes ultrafinos. ¿Qué instrumento microscópico debe emplear necesariamente?",
                    options = listOf(
                        "Microscopio óptico de campo claro",
                        "Microscopio electrónico de transmisión (MET)",
                        "Microscopio estereoscópico de disección",
                        "Microscopio óptico simple de Leeuwenhoek",
                        "Lupa binocular de mesa"
                    ),
                    correctIndex = 1,
                    explanation = "El microscopio electrónico de transmisión (MET) es el único capaz de atravesar cortes ultrafinos y mostrar la ultraestructura interna celular en 2D con resolución de hasta 0.2 nm."
                ),
                Challenge(
                    id = "bio_t01_s04_c5",
                    statement = "Para analizar la morfología tridimensional (3D) de la superficie externa de la concha de una diatomea o los ojos compuestos de una avispa, el equipo indicado es el:",
                    options = listOf(
                        "Microscopio electrónico de barrido (MEB)",
                        "Microscopio electrónico de transmisión (MET)",
                        "Microscopio óptico de inmersión",
                        "Microscopio de contraste de fases invertido",
                        "Microtomo criostático"
                    ),
                    correctIndex = 0,
                    explanation = "El microscopio electrónico de barrido (MEB) hace barrer un haz de electrones sobre una superficie metalizada produciendo imágenes en relieve 3D con gran profundidad de campo."
                ),
                Challenge(
                    id = "bio_t01_s04_c6",
                    statement = "En el microscopio óptico, el componente mecánico encargado de permitir un desplazamiento vertical lento de la platina para lograr un enfoque nítido y preciso de la preparación es el:",
                    options = listOf(
                        "Tornillo macrométrico",
                        "Tornillo micrométrico",
                        "Revólver portaobjetivos",
                        "Diafragma iris",
                        "Condensador Abbe"
                    ),
                    correctIndex = 1,
                    explanation = "El tornillo micrométrico realiza desplazamientos casi imperceptibles para obtener el enfoque nítido final, mientras que el macrométrico efectúa el enfoque grueso inicial."
                ),
                Challenge(
                    id = "bio_t01_s04_c7",
                    statement = "¿Cuál es el límite de resolución aproximado que alcanza la microscopía electrónica en condiciones óptimas?",
                    options = listOf(
                        "0.2 micrómetros",
                        "0.2 nanómetros (2 ángstroms)",
                        "20 micrómetros",
                        "1 milímetro",
                        "200 nanómetros"
                    ),
                    correctIndex = 1,
                    explanation = "Gracias a la longitud de onda extremadamente corta de los electrones acelerados, el microscopio electrónico alcanza un límite de resolución de alrededor de 0.2 nm (miles de veces superior al MOC)."
                ),
                Challenge(
                    id = "bio_t01_s04_c8",
                    statement = "El principio básico de bioseguridad que establece que todo fluido corporal o espécimen biológico debe manejarse como si fuese portador de agentes patógenos infecciosos se denomina:",
                    options = listOf(
                        "Uso selectivo de barreras",
                        "Principio de Universalidad",
                        "Esterilización fraccionada",
                        "Contención secundaria",
                        "Segregación cromática de residuos"
                    ),
                    correctIndex = 1,
                    explanation = "El Principio de Universalidad estipula que las medidas preventivas deben aplicarse con todas las personas y muestras, asumiendo su potencial infeccioso."
                ),
                Challenge(
                    id = "bio_t01_s04_c9",
                    statement = "Constituyen ejemplos típicos de barreras primarias de contención en el laboratorio biológico:",
                    options = listOf(
                        "Autoclaves de vapor y diseño de paredes con presión negativa",
                        "Guantes de nitrilo, mascarillas de protección y mandiles de manga larga",
                        "Filtros HEPA en el techo del edificio",
                        "Puertas con esclusas de doble acceso",
                        "Extintores de dióxido de carbono y duchas de emergencia"
                    ),
                    correctIndex = 1,
                    explanation = "Las barreras primarias son los equipos de protección personal (EPP) que se interponen directamente entre el operador y el agente biológico peligroso."
                ),
                Challenge(
                    id = "bio_t01_s04_c10",
                    statement = "En un laboratorio universitario se manipula Bacillus subtilis para prácticas docentes de fermentación, bacteria no patógena que no causa daño en humanos sanos. ¿A qué Nivel de Bioseguridad (BSL) corresponde esta actividad?",
                    options = listOf(
                        "BSL-1 (Nivel 1)",
                        "BSL-2 (Nivel 2)",
                        "BSL-3 (Nivel 3)",
                        "BSL-4 (Nivel 4)",
                        "BSL-0 (Sin bioseguridad)"
                    ),
                    correctIndex = 0,
                    explanation = "El nivel BSL-1 está destinado a microorganismos bien caracterizados que no provocan enfermedad en adultos sanos inmunocompetentes."
                ),
                Challenge(
                    id = "bio_t01_s04_c11",
                    statement = "El trabajo rutinario con muestras clínicas que contienen virus de la Hepatitis B o bacterias como Salmonella enterica, capaces de causar patología moderada por punción accidental o ingestión pero con riesgo de aerosol bajo, se ubica en el nivel:",
                    options = listOf(
                        "BSL-1",
                        "BSL-2",
                        "BSL-3",
                        "BSL-4",
                        "BSL-5"
                    ),
                    correctIndex = 1,
                    explanation = "El nivel BSL-2 abarca patógenos de riesgo moderado asociados a infecciones humanas mediante punción, ingestión o salpicaduras en mucosas."
                ),
                Challenge(
                    id = "bio_t01_s04_c12",
                    statement = "Un laboratorio de investigación en Arequipa procesa muestras de esputo para cultivo de Mycobacterium tuberculosis, patógeno que se transmite fácilmente por aerosoles pero para el cual existen fármacos antituberculosos. El laboratorio debe cumplir con la categoría:",
                    options = listOf(
                        "BSL-1",
                        "BSL-2",
                        "BSL-3",
                        "BSL-4",
                        "BSL-6"
                    ),
                    correctIndex = 2,
                    explanation = "El nivel BSL-3 se exige para agentes infecciosos letales que se propagan por vía aérea (aerosoles), pero que cuentan con tratamiento farmacológico o vacuna disponible."
                ),
                Challenge(
                    id = "bio_t01_s04_c13",
                    statement = "¿Cuál de los siguientes virus de máxima letalidad, transmitido por vía aérea y sin vacuna ni tratamiento antiviral eficaz, requiere obligatoriamente una instalación de contención máxima BSL-4 con trajes presurizados?",
                    options = listOf(
                        "Virus de la Influenza tipo A",
                        "Virus del Ébola",
                        "Virus del Herpes simple",
                        "Virus del Papiloma Humano (VPH)",
                        "Bacteriófago Lambda"
                    ),
                    correctIndex = 1,
                    explanation = "El virus del Ébola (filovirus) causa fiebres hemorrágicas graves con altísima letalidad y no posee tratamiento curativo universal, clasificándose en el nivel BSL-4."
                ),
                Challenge(
                    id = "bio_t01_s04_c14",
                    statement = "Tras finalizar una práctica de venopunción, las torundas de algodón empapadas con sangre fresca de los pacientes deben ser desechadas obligatoriamente en una bolsa de color:",
                    options = listOf(
                        "Negra",
                        "Verde",
                        "Roja",
                        "Amarilla",
                        "Azul"
                    ),
                    correctIndex = 2,
                    explanation = "La bolsa roja está destinada exclusivamente a los residuos biocontaminados (fluidos biológicos, sangre, tejidos, gasas infectadas)."
                ),
                Challenge(
                    id = "bio_t01_s04_c15",
                    statement = "Los frascos de reactivos químicos vencidos como xilol, cloroformo, formol o restos de fármacos citotóxicos deben segregarse en bolsas de color:",
                    options = listOf(
                        "Roja",
                        "Amarilla",
                        "Negra",
                        "Transparente",
                        "Blanca"
                    ),
                    correctIndex = 1,
                    explanation = "La bolsa amarilla identifica a los residuos especiales de naturaleza química, tóxica o farmacológica."
                ),
                Challenge(
                    id = "bio_t01_s04_c16",
                    statement = "Respecto al descarte de agujas hipodérmicas usadas, ¿cuál es la norma técnica de bioseguridad correcta?",
                    options = listOf(
                        "Doblarlas manualmente antes de tirarlas a la bolsa negra",
                        "Colocarles nuevamente el capuchón protector con las dos manos",
                        "Desecharlas directamente en un recipiente rígido de punzocortantes sin reencapuchar",
                        "Lavarlas con agua y lejía para reutilizarlas en el siguiente paciente",
                        "Tirarlas al tacho común si no tienen sangre visible"
                    ),
                    correctIndex = 2,
                    explanation = "Jamás debe reencapucharse una aguja usada para evitar punciones accidentales; se desechan de inmediato en contenedores rígidos de bioseguridad hasta un máximo de 3/4 de llenado."
                ),
                Challenge(
                    id = "bio_t01_s04_c17",
                    statement = "Un estudiante afirma que 'puede observar los ribosomas individuales y la membrana plasmática bilipídica en una célula viva con el microscopio óptico común a 400×'. Esta afirmación es físicamente falsa debido a que:",
                    options = listOf(
                        "Los ribosomas se mueven a la velocidad de la luz",
                        "El límite de resolución del MOC (0.2 micrómetros) es insuficiente para estructuras nanométricas",
                        "La luz visible quema inmediatamente a los ribosomas celulares",
                        "El microscopio óptico solo funciona con células muertas de corcho",
                        "Las células no tienen membrana plasmática en soluciones acuosas"
                    ),
                    correctIndex = 1,
                    explanation = "Los ribosomas miden entre 20 y 30 nm y la membrana celular unos 7-10 nm, dimensiones que están muy por debajo del límite de resolución del MOC (200 nm), requiriendo microscopía electrónica."
                ),
                Challenge(
                    id = "bio_t01_s04_c18",
                    statement = "Relacione el tipo de microscopio con la muestra adecuada para su observación:\nI. Microscopio óptico compuesto (MOC)\nII. Microscopio electrónico de transmisión (MET)\nIII. Microscopio electrónico de barrido (MEB)\n(a. Relieve tridimensional de la cabeza de una pulga / b. Células de cebolla vivas con cloroplastos / c. Ultraestructura de las cisternas del retículo endoplásmico rugoso)",
                    options = listOf(
                        "I-b, II-c, III-a",
                        "I-a, II-b, III-c",
                        "I-c, II-a, III-b",
                        "I-b, II-a, III-c",
                        "I-c, II-b, III-a"
                    ),
                    correctIndex = 0,
                    explanation = "MOC = células de cebolla en campo claro (b); MET = ultraestructura interna de organelos en cortes ultrafinos (c); MEB = relieve superficial en 3D de la pulga (a). Combinación: I-b, II-c, III-a."
                ),
                Challenge(
                    id = "bio_t01_s04_c19",
                    statement = "Durante un procedimiento en el laboratorio se rompe un tubo de ensayo con un cultivo de Salmonella, derramándose sobre la mesa. ¿Cuál es el protocolo de bioseguridad inicial que debe ejecutarse?",
                    options = listOf(
                        "Secar de inmediato con papel secante con las manos descubiertas y tirarlo a la bolsa negra",
                        "Cubrir el derrame con toallas absorbentes, verter desinfectante (lejía/hipoclorito) de afuera hacia adentro y dejar actuar antes de recoger",
                        "Esperar a que el líquido se evapore solo durante el fin de semana",
                        "Soplar fuertemente para dispersar el líquido por la habitación",
                        "Lavar la mesa directamente con agua caliente sin usar guantes"
                    ),
                    correctIndex = 1,
                    explanation = "El protocolo de descontaminación de derrames biológicos exige cubrir con material absorbente, aplicar desinfectante adecuado desde los bordes hacia el centro, respetar el tiempo de contacto biocida y recoger con EPP adecuado hacia bolsa roja."
                )
            ),
            learningObjectives = listOf(
                "Límite de resolución, aumento total y componentes del microscopio óptico",
                "Diferencias clave entre MET (ultraestructura 2D) y MEB (superficie 3D)",
                "Principios de bioseguridad y clasificación de niveles BSL-1 a BSL-4",
                "Código de colores de residuos (rojo, amarillo, negro) y recipientes punzocortantes"
            )
        ),

        // ==========================================
        // SEMANA 2: SERES VIVOS Y NIVELES DE ORGANIZACIÓN
        // ==========================================
        LessonNode(
            id = "bio_t02_s01",
            subjectId = "biologia",
            semana = 2,
            subtema = "2.1",
            title = "Organización Compleja y Metabolismo",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t02_s01",
                asignatura = "Biología",
                semana = 2,
                titulo = "Organización Compleja y Metabolismo Celular",
                resumen = """Los seres vivos mantienen su alta organización y combaten la entropía mediante un flujo continuo de materia y energía.

                    # 2.1.1 — Jerarquía Estructural y Propiedades Emergentes
                    La materia viva no es un agregado aleatorio de átomos, sino un sistema altamente organizado y jerárquico. En cada escalón de complejidad biológica surgen **propiedades emergentes** que no existen en los componentes aislados de los niveles inferiores. La unidad biológica mínima capaz de manifestar vida autónoma y coordinada es la **célula**.

                    # 2.1.2 — Metabolismo Celular y Acoplamiento Energético
                    Es el conjunto integrado y finamente regulado de reacciones químicas que se producen en el seno de la célula con el propósito de obtener energía, degradar nutrientes y sintetizar macromoléculas propias. Toda actividad metabólica está catalizada por enzimas específicas y se articula en dos vertientes complementarias:
                    - **Moneda de intercambio energético:** El **ATP (adenosín trifosfato)** almacena energía libre en sus enlaces fosfoanhídrido de alta energía, acoplando las reacciones que liberan energía con las que la requieren.

                    # 2.1.3 — Anabolismo (Biosíntesis y Vía Endergónica)
                    - Síntesis de moléculas complejas ricas en enlaces a partir de precursores moleculares simples.
                    - **Consume energía libre** (ΔG > 0, proceso endergónico que consume ATP).
                    - Provoca reducción química de los sustratos (ganancia de hidrógenos o electrones).
                    - **Ejemplos clave:** Fotosíntesis, síntesis de proteínas (traducción en ribosomas), glucogenogénesis (síntesis de glucógeno hepático o muscular), gluconeogénesis y síntesis de triglicéridos.

                    # 2.1.4 — Catabolismo (Degradación y Vía Exergónica)
                    - Fragmentación y oxidación de moléculas orgánicas complejas hasta moléculas inorgánicas simples de menor contenido calórico.
                    - **Libera energía química útil** (ΔG < 0, proceso exergónico que genera ATP).
                    - Provoca oxidación de los sustratos (pérdida de electrones o hidrógenos hacia transportadores como NAD+ y FAD).
                    - **Ejemplos clave:** Glucólisis (citosol), respiración celular aerobia (ciclo de Krebs y fosforilación oxidativa mitocondrial), fermentación láctica y alcohólica, beta-oxidación de ácidos grasos y digestión enzimática de alimentos.
                """,
                conceptosClave = listOf(
                    "Propiedades emergentes: características nuevas que surgen al integrar niveles biológicos.",
                    "Anabolismo: de simple a complejo, consume energía (endergónico).",
                    "Catabolismo: de complejo a simple, libera energía (exergónico y oxidativo).",
                    "ATP: molécula intermediaria universal con enlaces fosfoanhídrido de alta energía."
                ),
                admissionTip = "Regla mnemotécnica clásica: 'Ana construye' (anabolismo sintetiza con gasto de ATP) y 'Cata destruye' (catabolismo degrada nutrientes para generar ATP).",
                admissionExplanation = "El examen UNSA evalúa el acoplamiento bioenergético: la hidrólisis exergónica del ATP impulsa las vías anabólicas endergónicas que sostienen la vida celular."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s01_c1",
                    statement = "Durante el período postprandial, los hepatocitos polimerizan cientos de moléculas de glucosa para sintetizar glucógeno hepático. Este proceso bioquímico clasifica termodinámicamente como una vía:",
                    options = listOf(
                        "Catabólica y exergónica con liberación neta de calor",
                        "Anabólica y endergónica con consumo de energía metabólica",
                        "Catabólica anaerobia de tipo fermentativo",
                        "De desaminación oxidativa intraluminal",
                        "De respiración aerobia mitocondrial"
                    ),
                    correctIndex = 1,
                    explanation = "La síntesis de glucógeno (glucogenogénesis) parte de monómeros simples de glucosa para formar un polímero complejo ramificado, lo cual requiere inversión de energía (ATP/UTP); por tanto, es una vía anabólica y endergónica."
                ),
                Challenge(
                    id = "bio_t02_s01_c2",
                    statement = "Durante una carrera de velocidad de 100 metros planos, las fibras musculares esqueléticas degradan glucosa de forma acelerada produciendo lactato y sintetizando ATP. Esta transformación corresponde a un proceso:",
                    options = listOf(
                        "Anabólico de asimilación",
                        "Catabólico fermentativo y exergónico",
                        "De fotosíntesis celular",
                        "Quimiosintético autótrofo",
                        "De transcripción genética"
                    ),
                    correctIndex = 1,
                    explanation = "La degradación oxidativa parcial de glucosa en ácido láctico en ausencia temporal de oxígeno suficiente es la fermentación láctica, una vía catabólica exergónica que genera ATP rápido."
                ),
                Challenge(
                    id = "bio_t02_s01_c3",
                    statement = "La molécula universal que actúa como nexo o intermediario energético en el metabolismo celular, acoplando procesos exergónicos con procesos endergónicos, es el:",
                    options = listOf(
                        "Ácido desoxirribonucleico (ADN)",
                        "Adenosín trifosfato (ATP)",
                        "Ácido úrico",
                        "Fosfolípido de membrana",
                        "Glucógeno hepático"
                    ),
                    correctIndex = 1,
                    explanation = "El ATP es la moneda energética biológica por excelencia. Sus enlaces fosfoanhídrido terminales almacenan energía libre transferible para impulsar el trabajo mecánico, químico y osmótico de la célula."
                ),
                Challenge(
                    id = "bio_t02_s01_c4",
                    statement = "En las células del parénquima clorofiliano de una hoja de molle, la fotosíntesis utiliza agua, CO₂ y fotones lumínicos para fabricar triosas fosfato y glucosa. Por su balance bioenergético, la fotosíntesis es:",
                    options = listOf(
                        "Catabólica, oxidativa y exergónica",
                        "Anabólica, reductora y endergónica",
                        "Catabólica descarboxilativa",
                        "Una fermentación facultativa",
                        "Una lisis hidrolítica espontánea"
                    ),
                    correctIndex = 1,
                    explanation = "La fotosíntesis es el proceso anabólico por excelencia de la biosfera: construye materia orgánica compleja reduciendo el CO₂ inorgánico con aporte externo de energía luminosa (endergónico)."
                ),
                Challenge(
                    id = "bio_t02_s01_c5",
                    statement = "El principio según el cual un tejido biológico presenta propiedades y funciones coordinadas que no se manifiestan en sus células constituyentes cuando se encuentran aisladas se conoce como:",
                    options = listOf(
                        "Equilibrio osmótico pasivo",
                        "Propiedad emergente",
                        "Desnaturalización estructural",
                        "Irritabilidad inespecífica",
                        "Reacción catabólica"
                    ),
                    correctIndex = 1,
                    explanation = "Las propiedades emergentes son atributos nuevos que se manifiestan al ascender de nivel en la jerarquía biológica, resultantes de la interacción cooperativa entre sus partes y ausentes en los componentes aislados."
                ),
                Challenge(
                    id = "bio_t02_s01_c6",
                    statement = "La oxidación total del piruvato en el ciclo de Krebs y la cadena de transporte de electrones mitocondrial, con producción masiva de ATP, agua y CO₂, es un ejemplo fundamental de:",
                    options = listOf(
                        "Respiración celular aerobia catabólica",
                        "Fotosíntesis anabólica oxigénica",
                        "Síntesis de peptidoglicano",
                        "Fijación de nitrógeno atmosférico",
                        "Traducción de ARN mensajero"
                    ),
                    correctIndex = 0,
                    explanation = "La respiración celular aerobia es la principal ruta catabólica oxidativa de las células eucariotas: degrada completamente la glucosa hasta CO₂ y H₂O liberando gran cantidad de energía en forma de ATP."
                ),
                Challenge(
                    id = "bio_t02_s01_c7",
                    statement = "En períodos de ayuno intermitente o inanición, el hígado sintetiza nuevas moléculas de glucosa a partir de precursores no glucídicos como el glicerol y aminoácidos. Esta ruta metabólica se denomina:",
                    options = listOf(
                        "Glucólisis anaerobia",
                        "Gluconeogénesis anabólica",
                        "Glucogenólisis lisosomal",
                        "Ciclo de la urea",
                        "Fermentación alcohólica"
                    ),
                    correctIndex = 1,
                    explanation = "La gluconeogénesis es la biosíntesis (anabolismo) de glucosa a partir de sustratos no carbohidratos, indispensable para mantener la glucemia en el ayuno a expensas de ATP."
                ),
                Challenge(
                    id = "bio_t02_s01_c8",
                    statement = "La fragmentación secuencial de los ácidos grasos en unidades de dos carbonos (acetil-CoA) en la matriz mitocondrial para obtener energía se conoce como:",
                    options = listOf(
                        "Gluconeogénesis",
                        "Beta-oxidación catabólica",
                        "Lipogénesis citosólica",
                        "Síntesis de colesterol",
                        "Polimerización peptídica"
                    ),
                    correctIndex = 1,
                    explanation = "La beta-oxidación de los ácidos grasos es una vía catabólica aerobia que degrada los lípidos hasta acetil-CoA, produciendo abundante NADH y FADH₂ para alimentar la cadena respiratoria."
                ),
                Challenge(
                    id = "bio_t02_s01_c9",
                    statement = "¿Cuál de las siguientes afirmaciones describe con exactitud la diferencia termodinámica entre anabolismo y catabolismo?",
                    options = listOf(
                        "El anabolismo libera energía libre espontáneamente (ΔG < 0), mientras que el catabolismo la absorbe (ΔG > 0)",
                        "El anabolismo requiere aporte neto de energía libre (ΔG > 0), mientras que el catabolismo libera energía libre (ΔG < 0)",
                        "Ambos procesos tienen obligatoriamente una variación de energía libre de Gibbs igual a cero",
                        "El catabolismo solo ocurre en presencia de luz solar y el anabolismo en la oscuridad",
                        "El anabolismo degrada macromoléculas y el catabolismo las ensambla"
                    ),
                    correctIndex = 1,
                    explanation = "Desde el punto de vista termodinámico, las vías anabólicas son endergónicas (ΔG > 0, no espontáneas sin aporte energético), mientras que las catabólicas son exergónicas (ΔG < 0, liberan energía al oxidar enlaces químicos)."
                ),
                Challenge(
                    id = "bio_t02_s01_c10",
                    statement = "En la estructura química del ATP, la energía biológicamente aprovechable para el trabajo celular se encuentra concentrada prioritariamente en:",
                    options = listOf(
                        "El enlace glucosídico entre la adenina y la ribosa",
                        "Los enlaces fosfoanhídrido entre los grupos fosfato terminales",
                        "El anillo heterocíclico de purina",
                        "Los grupos hidroxilo del carbono 2 y 3 de la pentosa",
                        "Los puentes de hidrógeno intramoleculares"
                    ),
                    correctIndex = 1,
                    explanation = "Los dos enlaces fosfoanhídrido que unen los grupos fosfato beta y gamma contienen alta energía electrostática de repulsión; su hidrólisis rinde aproximadamente 7.3 kcal/mol en condiciones estándar."
                ),
                Challenge(
                    id = "bio_t02_s01_c11",
                    statement = "Durante la interfase del ciclo celular, una célula incrementa notablemente su masa mediante la síntesis activa de enzimas, tubulina y ARN. Este conjunto de eventos corresponde a:",
                    options = listOf(
                        "Un marcado predominio de reacciones catabólicas oxidativas",
                        "Un intenso anabolismo biosintético coordinado",
                        "Una desnaturalización proteica masiva",
                        "Un proceso osmótico puramente físico sin enzimas",
                        "Una fermentación anaerobia de mantenimiento"
                    ),
                    correctIndex = 1,
                    explanation = "El crecimiento celular durante las fases G1 y G2 se basa en una intensa actividad anabólica: traducción de proteínas, biosíntesis de lípidos para membranas y transcripción de ARN."
                ),
                Challenge(
                    id = "bio_t02_s01_c12",
                    statement = "El concepto de 'acoplamiento energético' en el metabolismo celular significa fundamentalmente que:",
                    options = listOf(
                        "Las reacciones catabólicas ocurren exclusivamente en el núcleo y las anabólicas en la membrana",
                        "La energía liberada por las vías catabólicas exergónicas se transfiere para impulsar las vías anabólicas endergónicas",
                        "Todas las enzimas celulares deben destruirse al final de una reacción química",
                        "La célula vegetal produce energía sin necesidad de intercambiar materia con el exterior",
                        "El catabolismo y el anabolismo nunca pueden coexistir en un mismo ser vivo"
                    ),
                    correctIndex = 1,
                    explanation = "El acoplamiento energético describe cómo la energía química liberada por procesos catabólicos (exergónicos) se almacena temporalmente en forma de ATP para suministrar la energía que requieren los procesos anabólicos (endergónicos)."
                ),
                Challenge(
                    id = "bio_t02_s01_c13",
                    statement = "En el lumen del tubo digestivo humano, las amilasas y proteasas hidrolizan almidones y polipéptidos hasta maltosa y oligopéptidos. Esta digestión intraluminal es un proceso:",
                    options = listOf(
                        "Catabólico e hidrolítico",
                        "Anabólico y condensativo",
                        "Fotosintético dependiente de luz",
                        "De homeostasis osmolar pura",
                        "De replicación semiconservativa"
                    ),
                    correctIndex = 0,
                    explanation = "La digestión es un proceso catabólico hidrolítico: fragmenta grandes macromoléculas alimenticias en nutrientes monoméricos absorbibles rompiendo enlaces covalentes mediante adición de agua."
                )
            )
        ),
        LessonNode(
            id = "bio_t02_s02",
            subjectId = "biologia",
            semana = 2,
            subtema = "2.2",
            title = "Homeostasis, Irritabilidad y Adaptación",
            depth = LessonDepth.SIMPLE,
            theory = LessonTheory(
                id = "th_bio_t02_s02",
                asignatura = "Biología",
                semana = 2,
                titulo = "Homeostasis, Irritabilidad y Respuestas Biológicas",
                resumen = """Los seres vivos mantienen su estabilidad fisicoquímica interna y responden dinámicamente a los estímulos del medio.

                    # 2.2.1 — Homeostasis: El Equilibrio del Medio Interno
                    Concepto introducido por **Claude Bernard** (medio interno constante) y acuñado por **Walter Cannon** (1926). Es la capacidad fisiológica de los organismos de mantener su **medio interno en estado de equilibrio dinámico y estable** ante las fluctuaciones del ambiente externo.
                    - **Ejemplos fisiológicos:**
                      - *Glucemia humana:* Mantenida en 70-100 mg/dL gracias a la acción antagónica de la insulina (hipoglucemiante) y el glucagón (hiperglucemiante).
                      - *Termorregulación:* Sudoración y vasodilatación periférica ante calor excesivo; tiritona (escalofríos) y vasoconstricción cutánea ante frío intenso.
                      - *Osmorregulación y pH:* Amortiguación sanguínea en pH 7.35-7.45 y excreción renal de protones o bicarbonato.

                    # 2.2.2 — Irritabilidad: Respuesta Transitoria Inmediata
                    Capacidad celular y organísmica de reaccionar con una **respuesta rápida, inmediata, transitoria y reversible** frente a un estímulo puntual (físico, químico o mecánico) del medio.
                    - No altera el genoma de la especie.
                    - **Ejemplos:**
                      - *Nastias:* Movimientos reversibles sin orientación fija en plantas (ej. el cierre rápido de las hojas de *Mimosa pudica* ante el tacto o sismonastia, apertura floral por luz o fotonastia).
                      - *Taxismos:* Desplazamiento orientado de células o microorganismos libres hacia o en contra de un estímulo (quimiotactismo positivo de leucocitos hacia bacterias, fototactismo de *Euglena*).
                      - *Tropismos:* Crecimiento orientado e irreversible en plantas (fototropismo positivo del tallo, geotropismo positivo de la raíz).
                      - *Reflejos nerviosos:* Retiro inmediato de la mano ante una quemadura o contracción pupilar ante un haz de luz intenso.

                    # 2.2.3 — Adaptación: Modificación Evolutiva a Largo Plazo
                    Proceso de adecuación morfológica, fisiológica o etológica (de conducta) que adquiere una **población a lo largo de sucesivas generaciones** mediante selección natural, lo que incrementa su eficacia biológica y probabilidad de supervivencia en un ecosistema dado.
                    - Es un rasgo genético heredable fijado en la especie.
                    - **Ejemplos:**
                      - *Adaptación fisiológica:* Hemoglobina con mayor afinidad por el oxígeno molecular y alto hematocrito en la vicuña (*Vicugna vicugna*) para vivir en la puna andina a más de 4000 m.s.n.m.
                      - *Adaptación morfológica:* Transformación de hojas en espinas en cactáceas para evitar la transpiración en desiertos áridos.
                      - *Adaptación etológica:* Migración estacional de aves o comportamiento de hibernación en mamíferos septentrionales.
                """,
                conceptosClave = listOf(
                    "Homeostasis: Walter Cannon (1926); equilibrio dinámico del medio interno (glucemia, pH, temperatura).",
                    "Irritabilidad: respuesta inmediata, transitoria y reversible a un estímulo (nastias, taxismos, reflejos).",
                    "Adaptación: rasgo heredable fijado por selección natural en generaciones (espinas en cactus, hemoglobina de vicuña)."
                ),
                admissionTip = "La clave temporal de admisión: si ocurre en segundos o minutos (retirar la mano, cerrar las hojas, sudar) es IRRITABILIDAD o respuesta homeostática. Si es un rasgo anatómico o fisiológico con el que el ser vivo nace tras millones de años de evolución, es ADAPTACIÓN.",
                admissionExplanation = "Diferenciar la inmediatez de la irritabilidad frente al carácter poblacional y evolutivo de la adaptación resuelve las preguntas de examen con certeza."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s02_c1",
                    statement = "La vicuña (*Vicugna vicugna*) del altiplano andino posee glóbulos rojos elípticos abundantes y una hemoglobina con altísima afinidad por el O₂, lo que le permite captar oxígeno en ambientes de extrema hipoxia hipobárica. Esta cualidad representa un ejemplo conspicuo de:",
                    options = listOf(
                        "Irritabilidad transitoria reversible",
                        "Adaptación biológica fisiológica heredable",
                        "Taxismo bacteriano negativo",
                        "Sismonastia mecánica momentánea",
                        "Catabolismo digestivo acelerado"
                    ),
                    correctIndex = 1,
                    explanation = "Es una adaptación fisiológica evolutiva: un rasgo genéticamente fijado a lo largo de miles de generaciones en la población de vicuñas para subsistir a más de 4000 metros de altitud."
                ),
                Challenge(
                    id = "bio_t02_s02_c2",
                    statement = "Al entrar en contacto con una llama ardiente, una persona retira la mano de forma involuntaria en una fracción de segundo gracias a un arco reflejo. Esta respuesta inmediata y transitoria corresponde a la característica biológica de:",
                    options = listOf(
                        "Adaptación evolutiva morfológica",
                        "Irritabilidad",
                        "Selección natural estabilizadora",
                        "Crecimiento hiperplásico",
                        "Homeostasis renal crónica"
                    ),
                    correctIndex = 1,
                    explanation = "La irritabilidad es la capacidad de responder de manera rápida, transitoria y coordinada ante un estímulo nocivo, térmico, mecánico o lumínico del medio ambiente."
                ),
                Challenge(
                    id = "bio_t02_s02_c3",
                    statement = "Cuando la temperatura corporal se eleva por encima de 37 °C durante una caminata en el cañón del Colca, el hipotálamo desencadena sudoración profusa y vasodilatación periférica para disipar calor. Este mecanismo ilustra el principio de:",
                    options = listOf(
                        "Homeostasis termorreguladora",
                        "Irritabilidad vegetal sismonástica",
                        "Evolución convergente",
                        "Adaptación genética individual",
                        "Hipertrofia muscular rápida"
                    ),
                    correctIndex = 0,
                    explanation = "La homeostasis es la regulación activa y coordinada del medio interno para mantener parámetros fisicoquímicos constantes (como la temperatura corporal) frente a variaciones externas."
                ),
                Challenge(
                    id = "bio_t02_s02_c4",
                    statement = "Las hojas de la planta *Mimosa pudica* se pliegan sobre el raquis a los pocos segundos de ser rozadas mecánicamente y recuperan su posición extendida minutos después. Este fenómeno se clasifica como:",
                    options = listOf(
                        "Geotropismo positivo irreversible",
                        "Sismonastia (respuesta por irritabilidad)",
                        "Adaptación morfológica permanente",
                        "Fotoperiodismo endergónico",
                        "Mutación somática repentina"
                    ),
                    correctIndex = 1,
                    explanation = "El plegamiento de las hojas de *Mimosa pudica* es una sismonastia: un movimiento de turgencia reversible e inmediato ante el tacto, correspondiente a la irritabilidad en vegetales."
                ),
                Challenge(
                    id = "bio_t02_s02_c5",
                    statement = "En el desierto costero de La Joya, los cactos presentan tallos carnosos verdes que almacenan agua y hojas transformadas en agudas espinas. La transformación de hojas en espinas para evitar la pérdida de vapor de agua es una:",
                    options = listOf(
                        "Irritabilidad rápida temporal",
                        "Adaptación morfológica seleccionada por el ambiente",
                        "Nastia reversible de apertura",
                        "Respuesta homeostática inmediata",
                        "Alteración catabólica transitoria"
                    ),
                    correctIndex = 1,
                    explanation = "La reducción de hojas a espinas y la fotosíntesis en tallos suculentos son adaptaciones morfológicas anatómicas adquiridas a nivel poblacional para minimizar la transpiración en medios xerófitos."
                ),
                Challenge(
                    id = "bio_t02_s02_c6",
                    statement = "Las bacterias de la especie *Salmonella enterica* flageladas nadan activamente siguiendo un gradiente creciente de concentración de glucosa. Este comportamiento celular orientado constituye un:",
                    options = listOf(
                        "Quimiotactismo positivo (irritabilidad celular)",
                        "Fototropismo vegetal negativo",
                        "Proceso anabólico respiratorio",
                        "Mecanismo homeostático de transcripción",
                        "Ejemplo de adaptación conductual aprendida"
                    ),
                    correctIndex = 0,
                    explanation = "El desplazamiento orientado de microorganismos libres hacia un estímulo químico favorable es un quimiotactismo positivo, una modalidad de irritabilidad celular motriz."
                ),
                Challenge(
                    id = "bio_t02_s02_c7",
                    statement = "¿Cuál es el criterio temporal cardinal que distingue a la irritabilidad de la adaptación biológica?",
                    options = listOf(
                        "La irritabilidad toma millones de años en manifestarse, mientras que la adaptación ocurre en segundos",
                        "La irritabilidad es una respuesta momentánea y reversible del individuo; la adaptación es un rasgo poblacional forjado por generaciones",
                        "La irritabilidad solo ocurre en animales y la adaptación solo en bacterias",
                        "La irritabilidad requiere mitosis y la adaptación ocurre solo por gemación",
                        "No existe distinción alguna; ambos términos son rigurosamente sinónimos en ecología"
                    ),
                    correctIndex = 1,
                    explanation = "La irritabilidad es inmediata, puntual y reversible frente a un estímulo transitorio. La adaptación es un cambio permanente y heredable fijado por selección natural a través de las generaciones en una población."
                ),
                Challenge(
                    id = "bio_t02_s02_c8",
                    statement = "El fisiólogo que acuñó y popularizó en 1926 el término 'homeostasis' para designar los procesos coordinados que mantienen la estabilidad del medio interno fue:",
                    options = listOf(
                        "Jean-Baptiste Lamarck",
                        "Walter Cannon",
                        "Ernst Haeckel",
                        "Theodor Schwann",
                        "Robert Hooke"
                    ),
                    correctIndex = 1,
                    explanation = "Walter Cannon introdujo el término 'homeostasis' basándose en los estudios previos de Claude Bernard sobre la constancia del medio interno (*milieu intérieur*)."
                )
            )
        ),
        LessonNode(
            id = "bio_t02_s03",
            subjectId = "biologia",
            semana = 2,
            subtema = "2.3",
            title = "Reproducción y Crecimiento",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t02_s03",
                asignatura = "Biología",
                semana = 2,
                titulo = "Reproducción, Desarrollo y Crecimiento",
                resumen = """Mecanismos de autoperpetuación de la especie y desarrollo individual a lo largo del ciclo vital.

                    # 2.3.1 — Reproducción Asexual (Monoparental)
                    - Participa **un solo progenitor**, sin producción ni fusión de gametos.
                    - Se fundamenta en la **mitosis** (o fisión binaria bacteriana).
                    - **Descendencia clonal:** Los descendientes son copias genéticamente idénticas al progenitor (salvo mutaciones esporádicas).
                    - **Ventaja ecológica:** Elevada tasa de multiplicación con bajo gasto de tiempo y energía (sin necesidad de buscar pareja).
                    - **Desventaja ecológica:** Nula variabilidad genética; la población es vulnerable a cambios ambientales o plagas catastróficas.
                    - **Modalidades principales:**
                      - *Bipartición o Fisión Binaria:* División en dos células hijas iguales (bacterias, amebas, paramecios).
                      - *Gemación:* Formación de una yema o brote asimétrico que se desprende o forma colonias (levaduras como *Saccharomyces*, hidras de agua dulce).
                      - *Esporulación:* División múltiple del núcleo rodeado de citoplasma formando esporas resistentes (hongos, *Plasmodium*).
                      - *Fragmentación / Regeneración:* Escisión de partes del cuerpo que regeneran un individuo completo (planarias, estrellas de mar).
                      - *Multiplicación vegetativa:* Propagación por estolones (fresas), tubérculos (papa), bulbos (cebolla) y rizomas (kion).

                    # 2.3.2 — Partenogénesis
                    Variante monoparental donde un **óvulo no fecundado** se desarrolla hasta dar origen a un individuo adulto viable.
                    - En abejas melíferas (*Apis mellifera*), la reina produce huevos fecundados (diploides: obreras y reinas) y huevos no fecundados por partenogénesis que generan machos haploides (**zánganos**).

                    # 2.3.3 — Reproducción Sexual (Biparental)
                    - Intervienen generalmente **dos progenitores**, que producen **gametos haploides (n)** mediante meiosis.
                    - La unión de los gametos en la **fecundación** restaura la diploidía (2n) en el cigoto.
                    - **Genera alta variabilidad genética:** Gracias al entrecruzamiento cromosómico (*crossing-over* en profase I) y a la segregación cromosómica al azar. Constituye la materia prima de la selección natural y la evolución biológica.

                    # 2.3.4 — Crecimiento vs Desarrollo
                    - **Crecimiento:** Aumento cuantitativo de materia viva. En organismos unicelulares ocurre por incremento del volumen celular (**hipertrofia**); en pluricelulares ocurre por multiplicación del número de células mediante mitosis (**hiperplasia**).
                    - **Desarrollo:** Cambios cualitativos que implican diferenciación celular, especialización funcional y morfogénesis ontogenética a lo largo de la vida.
                """,
                conceptosClave = listOf(
                    "Reproducción asexual: mitosis, monoparental, clones idénticos, sin variabilidad genética.",
                    "Partenogénesis: desarrollo de un óvulo no fecundado (ej. zánganos de abejas).",
                    "Reproducción sexual: meiosis con crossing-over + fecundación al azar = alta variabilidad genética.",
                    "Hiperplasia = aumento de número de células; Hipertrofia = aumento de tamaño celular."
                ),
                admissionTip = "Recuerda para CEPRUNSA: las fresas por estolones o la papa por tubérculos producen clones idénticos (asexual). Los zánganos de las abejas nacen por partenogénesis (óvulos sin fecundar).",
                admissionExplanation = "La ventaja adaptativa de la reproducción sexual frente a la asexual radica en que la recombinación génica genera individuos con combinaciones alélicas novedosas capaces de resistir nuevas presiones selectivas."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s03_c1",
                    statement = "En un vivero de Arequipa se propagan plantas de fresa mediante estolones rastreros que enraízan y forman nuevos vástagos. Respecto a este método de multiplicación, se puede afirmar con rigor biológico que:",
                    options = listOf(
                        "Origina descendientes con amplia variabilidad por recombinación meiótica",
                        "Produce descendientes genéticamente idénticos (clones) a la planta madre",
                        "Requiere obligatoriamente la fecundación del estigma por polen",
                        "Disminuye la velocidad de colonización del sustrato",
                        "Reduce a la mitad el número cromosómico en las células hijas"
                    ),
                    correctIndex = 1,
                    explanation = "La reproducción mediante estolones es multiplicación vegetativa asexual gobernada por mitosis; al no existir meiosis ni fecundación, los nuevos individuos son clones genéticos del progenitor."
                ),
                Challenge(
                    id = "bio_t02_s03_c2",
                    statement = "En una colmena de abejas (*Apis mellifera*), los machos o zánganos se originan por el desarrollo de óvulos que no fueron fecundados por ningún espermatozoide. Este mecanismo reproductivo se denomina:",
                    options = listOf(
                        "Bipartición amebiana",
                        "Partenogénesis",
                        "Fecundación cruzada",
                        "Esporulación múltiple",
                        "Fragmentación somática"
                    ),
                    correctIndex = 1,
                    explanation = "La partenogénesis es el desarrollo de un individuo adulto a partir de una célula sexual femenina (óvulo) no fecundada, común en insectos sociales como abejas y avispas."
                ),
                Challenge(
                    id = "bio_t02_s03_c3",
                    statement = "La principal ventaja biológica que confiere la reproducción sexual frente a la asexual para la supervivencia a largo plazo de una especie ante epidemias o cambios climáticos es:",
                    options = listOf(
                        "La rapidez con la que se multiplica la población en pocos minutos",
                        "La generación de variabilidad genética en los descendientes",
                        "El ahorro total de energía al no requerir búsqueda de pareja",
                        "La producción exclusiva de clones resistentes",
                        "El mantenimiento perpetuo de genomas completamente idénticos"
                    ),
                    correctIndex = 1,
                    explanation = "La reproducción sexual genera combinaciones genéticas inéditas gracias al entrecruzamiento meiótico y la fecundación aleatoria, lo que dota a la población de diversidad adaptativa frente a contingencias ambientales."
                ),
                Challenge(
                    id = "bio_t02_s03_c4",
                    statement = "Las bacterias como *Escherichia coli* se reproducen dividiendo su célula madre en dos células hijas de tamaño semejante tras replicar su único cromosoma circular. Esta modalidad asexual se denomina:",
                    options = listOf(
                        "Fisión binaria o bipartición",
                        "Gemación asimétrica",
                        "Gametogénesis meiótica",
                        "Partenogénesis haplodiploide",
                        "Multiplicación por rizomas"
                    ),
                    correctIndex = 0,
                    explanation = "La fisión binaria o bipartición es la forma clásica de reproducción asexual de procariontes y protistas, dando origen a dos células hijas de idéntico genoma."
                ),
                Challenge(
                    id = "bio_t02_s03_c5",
                    statement = "Al observar al microscopio levaduras de panadería (*Saccharomyces cerevisiae*) en fermentación, se aprecia una protuberancia que crece sobre la célula madre hasta independizarse. Este proceso corresponde a:",
                    options = listOf(
                        "Esporulación",
                        "Gemación",
                        "Fragmentación",
                        "Fecundación anisogámica",
                        "Regeneración tisular"
                    ),
                    correctIndex = 1,
                    explanation = "La gemación es una reproducción asexual asimétrica donde se forma una yema o brote sobre el cuerpo progenitor, que tras madurar se separa o permanece formando colonias."
                ),
                Challenge(
                    id = "bio_t02_s03_c6",
                    statement = "El incremento de masa muscular en un atleta que entrena levantamiento de pesas ocurre fundamentalmente por el aumento de volumen y miofibrillas dentro de las fibras musculares maduras preexistentes. Este fenómeno es:",
                    options = listOf(
                        "Hiperplasia",
                        "Hipertrofia celular",
                        "Diferenciación meiótica",
                        "Metaplasia maligna",
                        "Crenación citoplasmática"
                    ),
                    correctIndex = 1,
                    explanation = "La hipertrofia es el aumento en el tamaño y volumen de las células individuales sin aumento en su número, típico del músculo esquelético adulto cuyas fibras no se dividen por mitosis."
                ),
                Challenge(
                    id = "bio_t02_s03_c7",
                    statement = "Cuando un tejido como la epidermis o la médula ósea hematopoyética aumenta de masa debido a la multiplicación acelerada del número de células por mitosis sucesivas, se produce:",
                    options = listOf(
                        "Hipertrofia",
                        "Hiperplasia celular",
                        "Partenogénesis somática",
                        "Plasmólisis de membrana",
                        "Involución atrófica"
                    ),
                    correctIndex = 1,
                    explanation = "La hiperplasia es el crecimiento de un órgano o tejido basado en el incremento del número total de células mediante división mitótica activa."
                ),
                Challenge(
                    id = "bio_t02_s03_c8",
                    statement = "Si una planaria dulceacuícola (*Dugesia*) se corta transversalmente en dos fragmentos, cada sección es capaz de reconstituir un organismo completo y funcional. Esta forma de reproducción asexual se clasifica como:",
                    options = listOf(
                        "Gemación endógena",
                        "Fragmentación y regeneración",
                        "Partenogénesis telitoquica",
                        "Bipartición bacteriana",
                        "Esporulación sincrónica"
                    ),
                    correctIndex = 1,
                    explanation = "La fragmentación (acompañada de regeneración celular gracias a neoblastos pluripotentes) permite a platelmintos y equinodermos regenerar individuos íntegros a partir de segmentos corporales."
                ),
                Challenge(
                    id = "bio_t02_s03_c9",
                    statement = "Si una población de peces en una laguna aislada se reproduce exclusivamente por clonación asexual durante siglos y aparece una bacteria parásita letal ante la cual ningún pez es inmune, el desenlace más probable será:",
                    options = listOf(
                        "Una mutación espontánea sincrónica en el 100% de la población",
                        "La extinción masiva de la población por carecer de variabilidad genética",
                        "El inicio inmediato de partenogénesis protectora",
                        "La conversión instantánea de sus células a células procariotas",
                        "La transformación de todos los individuos en clones resistentes"
                    ),
                    correctIndex = 1,
                    explanation = "Al ser clones genéticamente uniformes, si el genoma de la población no posee resistencia natural frente al patógeno, todos los individuos sucumbirán por igual al carecer de diversidad alélica."
                ),
                Challenge(
                    id = "bio_t02_s03_c10",
                    statement = "En el parásito de la malaria (*Plasmodium vivax*), una sola célula infecta el hepatocito y divide su núcleo en decenas de porciones antes de fragmentar su citoplasma, liberando múltiples merozoítos. Esta división se conoce como:",
                    options = listOf(
                        "Gemación simple",
                        "Esporulación o esquizogonia múltiple",
                        "Conjugación paramecial",
                        "Fragmentación estolonífera",
                        "Bipartición longitudinal"
                    ),
                    correctIndex = 1,
                    explanation = "La esporulación o esquizogonia es una división múltiple característica de esporozoos como *Plasmodium*, donde el núcleo realiza múltiples mitosis antes de la citocinesis simultánea."
                ),
                Challenge(
                    id = "bio_t02_s03_c11",
                    statement = "La serie secuencial de transformaciones cualitativas, adquisición de especialización funcional y maduración tisular desde el cigoto hasta el estado senil de un organismo recibe el nombre de:",
                    options = listOf(
                        "Hipertrofia neta",
                        "Desarrollo ontogenético",
                        "Bipartición",
                        "Irritabilidad hormonal",
                        "Homeostasis pasiva"
                    ),
                    correctIndex = 1,
                    explanation = "El desarrollo abarca todos los cambios cualitativos, morfogenéticos y de diferenciación celular que experimenta un individuo a lo largo de su ciclo de vida ontogénico."
                ),
                Challenge(
                    id = "bio_t02_s03_c12",
                    statement = "En términos de bioenergética evolutiva, ¿cuál es una ventaja inmediata de la reproducción asexual sobre la reproducción sexual?",
                    options = listOf(
                        "Aumenta exponencialmente el entrecruzamiento de cromátidas no hermanas",
                        "No consume energía en producción de gametos complejos, cortejo ni búsqueda de pareja",
                        "Garantiza que los descendientes sean siempre diploides modificados",
                        "Genera más resistencia alélica a enfermedades infecciosas emergentes",
                        "Requiere obligatoriamente dos individuos compatibles para activarse"
                    ),
                    correctIndex = 1,
                    explanation = "La reproducción asexual es altamente eficiente: ahorra el enorme costo energético y temporal de desarrollar caracteres sexuales secundarios, cortejar y localizar una pareja reproductora."
                )
            )
        ),
        LessonNode(
            id = "bio_t02_s04",
            subjectId = "biologia",
            semana = 2,
            subtema = "2.4",
            title = "Niveles de Organización Ecológica y Biológica",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t02_s04",
                asignatura = "Biología",
                semana = 2,
                titulo = "Jerarquía de los Niveles de Organización de la Materia",
                resumen = """Organización ascendente de la materia viva desde los escalones subcelulares abióticos hasta la biosfera.

                    # 2.4.1 — Nivel Químico o Abiótico (Sin Vida Autónoma)
                    1. **Subatómico:** Partículas fundamentales (protones, neutrones y electrones).
                    2. **Atómico:** Bioelementos químicos indivisibles por métodos químicos comunes (C, H, O, N, P, S, Ca, Fe, Na, K).
                    3. **Molecular:** Unión de átomos por enlaces químicos covalentes o iónicos para formar biomoléculas simples (H₂O, O₂, CO₂, glucosa, aminoácidos, ácidos grasos).
                    4. **Macromolecular:** Polimerización de monómeros en grandes biomoléculas complejas (proteínas, ADN, ARN, glucógeno, celulosa).
                    5. **Supramolecular:** Asociación coordinada de diferentes macromoléculas mediante enlaces no covalentes:
                       - Membrana plasmática (lípidos + proteínas), ribosomas (ARNr + proteínas), cromatina (ADN + histonas), microtúbulos y centriolos.
                       - **¡Los virus se ubican en el nivel supramolecular!** Son complejos macromoleculares inertes de ácido nucleico envuelto en cápside proteica, carentes de metabolismo y de autonomía biológica celular.

                    # 2.4.2 — Nivel Biológico o Biótico (Materia Viva)
                    6. **Celular:** Primera unidad morfofuncional con vida autónoma, membrana limitante y metabolismo propio (*célula procariota y eucariota*).
                    7. **Tisular (Tejidos):** Conjunto coordinado de células del mismo origen embrionario y estructura similar dedicadas a una función común (ej. parénquima, tejido epitelial, tejido nervioso).
                    8. **Organológico (Órganos):** Estructura anatómica formada por la integración de diversos tejidos biológicos (ej. corazón, pulmón, riñón, hoja, raíz).
                    9. **Sistémico (Sistemas y Aparatos):** Conjunto de órganos interconectados que colaboran estrechamente en funciones orgánicas complejas (ej. sistema nervioso, digestivo, endocrino).
                    10. **Individuo u Organismo:** Ser vivo integral e independiente (un protozoario unicelular o un mamífero pluricelular).

                    # 2.4.3 — Nivel Ecológico (Interacciones de la Vida)
                    11. **Población:** Conjunto de individuos de la **misma especie** que conviven en un espacio geográfico definido y durante un tiempo determinado (ej. la manada de vicuñas de Pampa Cañahuas en 2024).
                    12. **Comunidad o Biocenosis:** Conjunto de todas las **poblaciones de distintas especies** que coexisten e interactúan biológicamente en un biotopo compartido.
                    13. **Ecosistema:** Unidad funcional de la ecología constituida por la interacción dinámica entre los seres vivos (biocenosis) y el medio físico inerte abiótico (biotopo: suelo, clima, agua, radiación solar).
                    14. **Bioma:** Grandes zonas bioclimáticas de la Tierra que comparten clima característico, flora y fauna clímax (ej. tundra, taiga, puna andina, selva tropical).
                    15. **Biosfera:** Franja habitable del planeta Tierra (litósfera superficial, hidrósfera y tropósfera baja) donde prospera la vida.
                """,
                conceptosClave = listOf(
                    "Los virus son complejos supramoleculares abióticos (ácido nucleico + cápside proteica).",
                    "Nivel celular: primera unidad con vida autónoma y metabolismo propio.",
                    "Población = misma especie en un tiempo y espacio.",
                    "Biocenosis (comunidad) = distintas especies; Ecosistema = biocenosis + biotopo."
                ),
                admissionTip = "Pregunta clásica fija en UNSA: '¿En qué nivel de organización se ubican el virus del dengue, el VIH o el SARS-CoV-2?' Respuesta inequívoca: NIVEL SUPRAMOLECULAR (complejo supramolecular inerte).",
                admissionExplanation = "Los virus carecen de ribosomas, membrana autónoma y metabolismo propio, por lo que jamás pertenecen al nivel celular ni al nivel de individuo vivo."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s04_c1",
                    statement = "En la Reserva Nacional de Salinas y Aguada Blanca habitan parihuanas, flamencos andinos, truchas arcoíris, pastizales de tola e ichu, interactuando en las lagunas salinas con la radiación solar y el viento. El conjunto formado exclusivamente por todas las poblaciones de seres vivos se clasifica como:",
                    options = listOf(
                        "Biotopo abiótico",
                        "Ecosistema total",
                        "Biocenosis o comunidad biológica",
                        "Bioma continental",
                        "Población multiespecífica"
                    ),
                    correctIndex = 2,
                    explanation = "La biocenosis o comunidad biológica está integrada exclusivamente por el conjunto de poblaciones de diferentes especies que coexisten e interactúan en un área determinada."
                ),
                Challenge(
                    id = "bio_t02_s04_c2",
                    statement = "El virus causante de la fiebre amarilla está constituido por una cápside proteica que rodea a una hebra de ARN monocatenario, careciendo de metabolismo y citoplasma. ¿En qué nivel de organización de la materia se ubica este agente infeccioso?",
                    options = listOf(
                        "Nivel celular",
                        "Nivel supramolecular (complejo supramolecular)",
                        "Nivel molecular simple",
                        "Nivel de individuo celular",
                        "Nivel tisular"
                    ),
                    correctIndex = 1,
                    explanation = "Los virus no son células; son agregados complejos macromoleculares (ácido nucleico asociado a proteínas capsulares), ubicándose en el nivel supramolecular del estrato abiótico."
                ),
                Challenge(
                    id = "bio_t02_s04_c3",
                    statement = "Un grupo de 350 vicuñas (*Vicugna vicugna*) que pastean juntas en la planicie de Pampa Cañahuas durante el mes de junio del presente año constituye formalmente un ejemplo de:",
                    options = listOf(
                        "Comunidad biótica",
                        "Población",
                        "Bioma altoandino",
                        "Ecosistema cerrado",
                        "Biotopo de altura"
                    ),
                    correctIndex = 1,
                    explanation = "Una población se define como el conjunto de individuos pertenecientes a una misma especie biológica que comparten un espacio geográfico y un marco temporal delimitados."
                ),
                Challenge(
                    id = "bio_t02_s04_c4",
                    statement = "¿Cuál es el nivel jerárquico más elemental de la organización de la materia donde emerge de forma incuestionable la vida autónoma con metabolismo propio?",
                    options = listOf(
                        "Nivel molecular",
                        "Nivel macromolecular",
                        "Nivel supramolecular",
                        "Nivel celular",
                        "Nivel tisular"
                    ),
                    correctIndex = 3,
                    explanation = "La célula es la unidad morfológica, fisiológica y genética fundamental de los seres vivos; es el nivel más simple dotado de metabolismo activo, homeostasis y autorreplicación."
                ),
                Challenge(
                    id = "bio_t02_s04_c5",
                    statement = "Los ribosomas (asociación de ARN ribosomal y cadenas polipeptídicas) y la membrana plasmática (bicapa fosfolipídica con proteínas integrales) pertenecen al nivel:",
                    options = listOf(
                        "Macromolecular simple",
                        "Supramolecular",
                        "Tisular",
                        "Celular",
                        "Atómico"
                    ),
                    correctIndex = 1,
                    explanation = "El nivel supramolecular agrupa a complejos estructurales formados por la unión o asociación espontánea de diversas macromoléculas (como lípidos, proteínas y ácidos nucleicos)."
                ),
                Challenge(
                    id = "bio_t02_s04_c6",
                    statement = "En la laguna de Mejía, la interacción funcional entre las aves migratorias, peces, insectos acuáticos y vegetación de junco con los factores abióticos (agua, salinidad, arena y luz solar) conforma un:",
                    options = listOf(
                        "Biocenosis exclusiva",
                        "Biotopo puro",
                        "Ecosistema",
                        "Nivel macromolecular",
                        "Clon poblacional"
                    ),
                    correctIndex = 2,
                    explanation = "Un ecosistema es la unidad funcional de la ecología que integra la comunidad biológica viva (biocenosis) en interrelación continua con su medio físico inerte (biotopo)."
                ),
                Challenge(
                    id = "bio_t02_s04_c7",
                    statement = "Una molécula de hemoglobina con cuatro cadenas polipeptídicas y cuatro grupos hemo se ubica en el nivel de organización:",
                    options = listOf(
                        "Atómico",
                        "Macromolecular",
                        "Supramolecular",
                        "Tisular",
                        "Celular"
                    ),
                    correctIndex = 1,
                    explanation = "Las proteínas, ácidos nucleicos y polisacáridos son polímeros de alto peso molecular que pertenecen al nivel macromolecular."
                ),
                Challenge(
                    id = "bio_t02_s04_c8",
                    statement = "El miocardio (tejido muscular cardíaco) y el parénquima en empalizada de una hoja vegetal pertenecen respectivamente al nivel:",
                    options = listOf(
                        "Organológico",
                        "Tisular",
                        "Sistémico",
                        "Supramolecular",
                        "Celular"
                    ),
                    correctIndex = 1,
                    explanation = "Los tejidos biológicos (conjuntos de células especializadas con origen y funciones comunes) se sitúan en el nivel tisular."
                ),
                Challenge(
                    id = "bio_t02_s04_c9",
                    statement = "El estómago, el hígado humano o la flor de la cantuta son estructuras anatómicas complejas integradas por la concurrencia de diversos tejidos; por lo tanto, se ubican en el nivel:",
                    options = listOf(
                        "Tisular",
                        "Organológico",
                        "Sistémico",
                        "Poblacional",
                        "Celular"
                    ),
                    correctIndex = 1,
                    explanation = "Un órgano (como el estómago, pulmón o flor) está formado por la integración estructural y funcional de diferentes tejidos biológicos (epitelial, conectivo, muscular, vascular, etc.)."
                ),
                Challenge(
                    id = "bio_t02_s04_c10",
                    statement = "Los factores fisicoquímicos inanimados de un área como el pH del agua, la humedad relativa, la temperatura ambiental y la composición del suelo constituyen el:",
                    options = listOf(
                        "Biotopo",
                        "Biocenosis",
                        "Nivel sistémico",
                        "Nivel celular",
                        "Bioma puro"
                    ),
                    correctIndex = 0,
                    explanation = "El biotopo representa el sustrato físico y las condiciones ambientales abióticas donde se asienta y desarrolla una comunidad biológica."
                ),
                Challenge(
                    id = "bio_t02_s04_c11",
                    statement = "Las grandes zonas geográficas del planeta delimitadas por condiciones climáticas globales y caracterizadas por vegetación y fauna dominante, como la taiga o la tundra, corresponden al nivel de:",
                    options = listOf(
                        "Población",
                        "Bioma",
                        "Biocenosis local",
                        "Biotopo puntual",
                        "Individuo"
                    ),
                    correctIndex = 1,
                    explanation = "Un bioma es una unidad bioclimática de gran escala que abarca múltiples ecosistemas emparentados bajo un régimen climático y fisonómico macroscópico común."
                ),
                Challenge(
                    id = "bio_t02_s04_c12",
                    statement = "¿Cuál de los siguientes parámetros es una propiedad emergente exclusiva del nivel de población que carece de sentido cuando se aplica a un individuo aislado?",
                    options = listOf(
                        "Metabolismo catabólico",
                        "Tasa de natalidad y densidad poblacional",
                        "Irritabilidad pupilar",
                        "Respiración celular aerobia",
                        "Presión arterial sistólica"
                    ),
                    correctIndex = 1,
                    explanation = "La tasa de natalidad, mortalidad, densidad poblacional y distribución etaria son atributos colectivos emergentes del nivel poblacional que no pueden medirse en un individuo único."
                ),
                Challenge(
                    id = "bio_t02_s04_c13",
                    statement = "Un protozoario ciliado como *Paramecium aurelia*, constituido por una sola célula libre con vacuolas y macronúcleo, se clasifica simultáneamente en los niveles:",
                    options = listOf(
                        "Atómico y tisular",
                        "Celular y de individuo",
                        "Tisular y organológico",
                        "Supramolecular y sistémico",
                        "Comunitario y bioma"
                    ),
                    correctIndex = 1,
                    explanation = "En los organismos unicelulares (bacterias, protozoos, levaduras), una única célula conforma el organismo biológico completo; por ello coinciden los niveles celular y de individuo."
                ),
                Challenge(
                    id = "bio_t02_s04_c14",
                    statement = "La franja global del planeta Tierra que integra todas las áreas donde se desarrolla la vida, abarcando la hidrósfera, litósfera superficial y tropósfera, se denomina:",
                    options = listOf(
                        "Biocenosis planetaria",
                        "Biosfera",
                        "Biotopo oceánico",
                        "Bioma polar",
                        "Ecosistema continental"
                    ),
                    correctIndex = 1,
                    explanation = "La biosfera es el mayor nivel de organización ecológica: representa la delgada capa del planeta Tierra habitada por los seres vivos y sus interacciones con los ciclos globales."
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
            subtema = "3.1",
            title = "Clasificación de los Bioelementos",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t03_s01",
                asignatura = "Biología",
                semana = 3,
                titulo = "Composición Atómica y Bioelementos de la Materia Viva",
                resumen = """Los bioelementos constituyen los bloques elementales de la vida, clasificados por su abundancia ponderal y funciones fisiológicas esenciales.

                    # 3.1.1 — Bioelementos Primarios u Organógenos (≈ 96% - 99%)
                    Son los más abundantes en los seres vivos: **Carbono (C), Hidrógeno (H), Oxígeno (O), Nitrógeno (N), Fósforo (P) y Azufre (S)**.
                    - **El Carbono:** Pilar fundamental de la química orgánica por su bajo peso atómico, tetravalencia (capacidad de formar 4 enlaces covalentes estables) y autosaturación (forma cadenas lineales, ramificadas y cíclicas estables C-C).
                    - **Oxígeno e Hidrógeno:** Forman el agua y participan en reacciones de oxidación-reducción celular.
                    - **Nitrógeno:** Componente insustituible del grupo amino de aminoácidos, proteínas y bases nitrogenadas de ácidos nucleicos.
                    - **Fósforo (P):** Integra los nucleótidos, ácidos nucleicos (ADN/ARN), fosfolípidos de membrana y la molécula de ATP mediante enlaces fosfoanhídrido ricos en energía.
                    - **Azufre (S):** Presente en aminoácidos azufrados (**cisteína** y **metionina**), coenzima A y permite la formación de **puentes disulfuro** que estabilizan la estructura terciaria de las proteínas.

                    # 3.1.2 — Bioelementos Secundarios (≈ 3.9%)
                    Imprescindibles para la fisiología celular y el equilibrio iónico:
                    - **Calcio (Ca²⁺):** Mineraliza huesos y dientes en forma de hidroxiapatita [Ca₁₀(PO₄)₆(OH)₂]. Indispensable para la contracción muscular (al unirse a la troponina C), la coagulación sanguínea (factor IV) y la sinapsis neuronal (exocitosis de neurotransmisores).
                    - **Sodio (Na⁺):** Principal catión del líquido **extracelular**. Genera el potencial de acción, regula la presión osmótica y el volumen hídrico.
                    - **Potasio (K⁺):** Principal catión del líquido **intracelular**. Determina el potencial de membrana en reposo, la repolarización celular y la contracción muscular junto con la bomba Na⁺/K⁺ ATPasa.
                    - **Cloro (Cl⁻):** Principal anión del líquido **extracelular**. Mantiene el balance hidrosalino y forma el ácido clorhídrico (HCl) gástrico.
                    - **Magnesio (Mg²⁺):** Catión central en el anillo de porfirina de la **clorofila**. Actúa como cofactor indispensable de enzimas quinasas (que usan ATP) y estabiliza la unión de las dos subunidades ribosómicas durante la traducción.

                    # 3.1.3 — Oligoelementos o Elementos Traza (< 0.1%)
                    Presentes en concentraciones minúsculas pero con funciones catalíticas vitales:
                    - **Hierro (Fe):** Núcleo del grupo hemo en la **hemoglobina** (transporte de O₂ en sangre) y **mioglobina** (músculo). Componente de los citocromos de la cadena respiratoria mitocondrial. Su carencia genera **anemia ferropénica**.
                    - **Yodo (I):** Componente estructural de las hormonas tiroideas **tiroxina (T₄)** y **triyodotironina (T₃)**. Su déficit nutricional produce **bocio endémico** y cretinismo congénito.
                    - **Cobre (Cu):** Forma parte de la hemocianina (pigmento respiratorio de artrópodos y moluscos) y de la enzima citocromo c oxidasa mitocondrial.
                    - **Cinc (Zn):** Cofactor de la anhidrasa carbónica, ADN polimerasa, cicatrización celular y desarrollo del sistema inmunológico.
                    - **Flúor (F):** Se incorpora a los cristales de hidroxiapatita formando **fluorapatita**, que endurece el esmalte dental y previene la caries.
                    - **Cobalto (Co):** Átomo central de la cobalamina (**vitamina B₁₂**); su ausencia causa anemia perniciosa.
                    - **Manganeso (Mn):** Participa en la fotólisis del agua en el fotosistema II durante la fotosíntesis luminosa.
                    - **Silicio (Si):** Brinda rigidez y protección en las frústulas de diatomeas y en los tallos de gramíneas y equisetos.
                """,
                conceptosClave = listOf(
                    "Bioelementos primarios (C, H, O, N, P, S): 96-99% de la masa corporal.",
                    "Magnesio en la clorofila; Hierro en la hemoglobina y mioglobina.",
                    "Na⁺ principal catión extracelular; K⁺ principal catión intracelular.",
                    "Yodo esencial para hormonas tiroideas (T₃ y T₄); su falta causa bocio."
                ),
                admissionTip = "Paralelo clásico UNSA: Magnesio es a la clorofila vegetal lo que el Hierro es a la hemoglobina animal. Ambos ocupan el centro del anillo porfirínico.",
                admissionExplanation = "Conocer la localización específica de cada bioelemento secundario y oligoelemento en metaloproteínas y tejidos garantiza responder cualquier ítem de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s01_c1",
                    statement = "Un habitante de una zona rural andina presenta un incremento notable de volumen en la región anterior del cuello (bocio) acompañado de lentitud metabólica. El médico determina que la afección obedece a la carencia dietética de un oligoelemento necesario para la síntesis de:",
                    options = listOf(
                        "Hierro para la formación de mioglobina",
                        "Yodo para la síntesis de triyodotironina y tiroxina",
                        "Calcio para la secreción de calcitonina",
                        "Magnesio para la activación de la clorofila",
                        "Cobalto para la producción de transferrina"
                    ),
                    correctIndex = 1,
                    explanation = "El yodo es el oligoelemento imprescindible para que la glándula tiroides fabrique las hormonas T₃ y T₄. Su deficiencia crónica estimula en exceso a la tiroides por acción de la TSH, desarrollando bocio endémico."
                ),
                Challenge(
                    id = "bio_t03_s01_c2",
                    statement = "En la bioquímica vegetal, el átomo metálico divalente que ocupa la posición central en el anillo de porfirina de la molécula de clorofila es el:",
                    options = listOf(
                        "Hierro (Fe²⁺)",
                        "Magnesio (Mg²⁺)",
                        "Cobre (Cu²⁺)",
                        "Calcio (Ca²⁺)",
                        "Cinc (Zn²⁺)"
                    ),
                    correctIndex = 1,
                    explanation = "El magnesio (Mg²⁺) es el átomo central de la clorofila, indispensable para la absorción de fotones durante la fase luminosa de la fotosíntesis."
                ),
                Challenge(
                    id = "bio_t03_s01_c3",
                    statement = "Durante la generación y mantenimiento del potencial eléctrico transmembrana en una neurona humana, ¿cuál es el catión más abundante en el medio intracelular y cuál en el extracelular?",
                    options = listOf(
                        "Intracelular: Na⁺; Extracelular: K⁺",
                        "Intracelular: K⁺; Extracelular: Na⁺",
                        "Intracelular: Ca²⁺; Extracelular: Mg²⁺",
                        "Intracelular: Cl⁻; Extracelular: Na⁺",
                        "Intracelular: Fe²⁺; Extracelular: K⁺"
                    ),
                    correctIndex = 1,
                    explanation = "El potasio (K⁺) es el principal catión dentro de la célula (intracelular), mientras que el sodio (Na⁺) predomina en el líquido intersticial y plasma (extracelular)."
                ),
                Challenge(
                    id = "bio_t03_s01_c4",
                    statement = "La extraordinaria diversidad y estabilidad de las biomoléculas orgánicas que componen la materia viva se sustenta primordialmente en la capacidad del carbono de:",
                    options = listOf(
                        "Formar enlaces iónicos espontáneos con gases nobles",
                        "Presentar tetravalencia y autosaturación formando enlaces covalentes estables C-C",
                        "Actuar como un solvente polar universal a 37 °C",
                        "Ionizarse rápidamente perdiendo cuatro electrones libres",
                        "Comportarse como un ácido inorgánico fuerte en disolución"
                    ),
                    correctIndex = 1,
                    explanation = "El átomo de carbono posee cuatro electrones de valencia (tetravalencia) y un bajo radio atómico, lo que le permite unirse consigo mismo (autosaturación) y con otros elementos mediante enlaces covalentes estables y variados."
                ),
                Challenge(
                    id = "bio_t03_s01_c5",
                    statement = "En el sarcómero de una fibra muscular esquelética, la contracción mecánica se inicia cuando un bioelemento secundario se libera del retículo sarcoplásmico y se une a la troponina C. Dicho bioelemento es el:",
                    options = listOf(
                        "Sodio",
                        "Calcio (Ca²⁺)",
                        "Hierro",
                        "Potasio",
                        "Fósforo"
                    ),
                    correctIndex = 1,
                    explanation = "El calcio (Ca²⁺) liberado hacia el sarcoplasma se une a la troponina C, provocando el desplazamiento de la tropomiosina para permitir la interacción entre actina y miosina."
                ),
                Challenge(
                    id = "bio_t03_s01_c6",
                    statement = "La anemia perniciosa es un trastorno hematológico severo ocasionado por la mala absorción de vitamina B₁₂ (cobalamina). El bioelemento que forma parte estructural del núcleo de esta vitamina es el:",
                    options = listOf(
                        "Cobre",
                        "Cobalto",
                        "Cinc",
                        "Manganeso",
                        "Flúor"
                    ),
                    correctIndex = 1,
                    explanation = "El cobalto (Co) es el oligoelemento central coordinado en el anillo corrina de la cobalamina (vitamina B₁₂), fundamental para la eritropoyesis y la síntesis de mielina."
                ),
                Challenge(
                    id = "bio_t03_s01_c7",
                    statement = "Un estudiante de secundaria presenta fatiga crónica, palidez mucocutánea y disnea de esfuerzo. El hemograma confirma anemia ferropénica. La alteración molecular se debe a la síntesis deficiente de:",
                    options = listOf(
                        "Insulina pancreática",
                        "Hemoglobina debido a la falta de hierro",
                        "Albúmina plasmática por déficit de sodio",
                        "Colágeno por ausencia de calcio",
                        "Amilasa salival por falta de cloro"
                    ),
                    correctIndex = 1,
                    explanation = "El hierro es el componente catalítico central del grupo hemo en la hemoglobina; su carencia impide la oxigenación tisular óptima generando anemia microcítica e hipocrómica."
                ),
                Challenge(
                    id = "bio_t03_s01_c8",
                    statement = "En el jugo gástrico secretado por las células parietales de la mucosa estomacal, el principal anión inorgánico responsable de la acidez estomacal (HCl) es el:",
                    options = listOf(
                        "Bicarbonato",
                        "Cloruro (Cl⁻)",
                        "Fosfato",
                        "Sulfato",
                        "Nitrato"
                    ),
                    correctIndex = 1,
                    explanation = "El ion cloruro (Cl⁻) es el anión más abundante del líquido extracelular y forma el ácido clorhídrico (HCl) gástrico necesario para activar el pepsinógeno en pepsina."
                ),
                Challenge(
                    id = "bio_t03_s01_c9",
                    statement = "Durante la etapa luminosa de la fotosíntesis, el agua se escinde liberando protones, electrones y oxígeno molecular gaseoso (fotólisis del agua). El oligoelemento cofactor indispensable del complejo enzimático del fotosistema II es el:",
                    options = listOf(
                        "Yodo",
                        "Manganeso (Mn)",
                        "Flúor",
                        "Cobre",
                        "Sodio"
                    ),
                    correctIndex = 1,
                    explanation = "El manganeso (Mn), junto con el calcio y el cloro, integra el complejo liberador de oxígeno del fotosistema II que cataliza la oxidación y fotólisis del agua."
                ),
                Challenge(
                    id = "bio_t03_s01_c10",
                    statement = "El oligoelemento que actúa como cofactor indispensable de la anhidrasa carbónica eritrocitaria y de las polimerasas en la síntesis de ácidos nucleicos, interviniendo además en la cicatrización e inmunidad, es el:",
                    options = listOf(
                        "Cinc (Zn)",
                        "Cobalto",
                        "Flúor",
                        "Yodo",
                        "Silicio"
                    ),
                    correctIndex = 0,
                    explanation = "El cinc (Zn) es un oligoelemento cofactor de más de 300 enzimas celulares, incluyendo la anhidrasa carbónica, la ARN/ADN polimerasa y las metaloproteinasas de cicatrización."
                ),
                Challenge(
                    id = "bio_t03_s01_c11",
                    statement = "La aplicación tópica de dentífricos fluorados fortalece las piezas dentales frente a la desmineralización ácida bacteriana porque el flúor sustituye grupos hidroxilo formando:",
                    options = listOf(
                        "Carbonato cálcico cristalino",
                        "Fluorapatita de alta resistencia química",
                        "Sulfato de calcio insoluble",
                        "Cloruro de magnesio amorfo",
                        "Fosfato monocálcico hidratado"
                    ),
                    correctIndex = 1,
                    explanation = "El flúor reacciona con la hidroxiapatita del esmalte dental originando fluorapatita, un compuesto mucho más resistente a la disolución provocada por los ácidos bacterianos causantes de la caries."
                ),
                Challenge(
                    id = "bio_t03_s01_c12",
                    statement = "En los artrópodos como los camarones de río y en cefalópodos marinos, el transporte de oxígeno en la hemolinfa no lo realiza la hemoglobina, sino la hemocianina, proteína respiratoria que posee:",
                    options = listOf(
                        "Hierro férrico",
                        "Cobre (Cu)",
                        "Magnesio libre",
                        "Cobalto quelado",
                        "Cinc divalente"
                    ),
                    correctIndex = 1,
                    explanation = "La hemocianina es un pigmento respiratorio azulado que contiene átomos de cobre coordinados directamente para fijar y transportar el oxígeno molecular en invertebrados."
                ),
                Challenge(
                    id = "bio_t03_s01_c13",
                    statement = "¿Cuál de los siguientes grupos reúne exclusivamente a bioelementos primarios u organógenos que constituyen aproximadamente el 96% al 99% de la biomasa de los organismos vivos?",
                    options = listOf(
                        "Na, K, Cl, Ca, Mg",
                        "C, H, O, N, P, S",
                        "Fe, Cu, Zn, I, F",
                        "Mn, Co, Mo, Se, Si",
                        "Ca, Fe, Na, I, P"
                    ),
                    correctIndex = 1,
                    explanation = "Los bioelementos primarios u organógenos son Carbono, Hidrógeno, Oxígeno, Nitrógeno, Fósforo y Azufre (CHONPS), constituyentes de glúcidos, lípidos, proteínas y ácidos nucleicos."
                )
            )
        ),
        LessonNode(
            id = "bio_t03_s02",
            subjectId = "biologia",
            semana = 3,
            subtema = "3.2",
            title = "El Agua: Estructura y Puentes de Hidrógeno",
            depth = LessonDepth.SIMPLE,
            theory = LessonTheory(
                id = "th_bio_t03_s02",
                asignatura = "Biología",
                semana = 3,
                titulo = "Estructura Molecular y Red de Puentes de Hidrógeno del Agua",
                resumen = """La geometría angular y la naturaleza dipolar del agua fundamentan la formación de puentes de hidrógeno, origen de sus propiedades biológicas.

                    # 3.2.1 — Geometría Molecular y Polaridad del H₂O
                    - La molécula de agua está formada por un átomo de oxígeno unido a dos átomos de hidrógeno mediante **enlaces covalentes polares**.
                    - Presenta una geometría **angular con un ángulo de enlace de 104.5°** (debido a la repulsión de los dos pares de electrones no enlazantes del oxígeno que comprimen el ángulo tetraédrico regular de 109.5°).
                    - **Dipolo eléctrico permanente:** El oxígeno es marcadamente más electronegativo (3.5 en la escala de Pauling) que el hidrógeno (2.1), atrayendo hacia sí con mayor fuerza los pares de electrones compartidos:
                      - Se forma una densidad de carga parcial negativa (δ⁻) en el oxígeno.
                      - Se forman dos densidades de carga parcial positiva (δ⁺) en los hidrógenos.
                    - Aunque la molécula de agua posee momento dipolar neto, su **carga eléctrica total es neutra (cero)**.

                    # 3.2.2 — El Puente de Hidrógeno Intermolecular
                    - Es una atracción electrostática intermolecular débil que se establece entre el polo parcialmente negativo (δ⁻) del oxígeno de una molécula de agua y el polo parcialmente positivo (δ⁺) del hidrógeno de otra molécula adyacente.
                    - En el agua líquida, cada molécula puede formar en promedio **3.4 a 3.6 puentes de hidrógeno** simultáneos, los cuales se forman y rompen con una vida media extremadamente corta (fracciones de picosegundo), confiriéndole fluidez y dinamismo.
                    - En el hielo (estado sólido a 0 °C), las moléculas quedan fijadas en una red cristalina tetraédrica abierta y rígida donde cada molécula forma **4 puentes de hidrógeno estables**.

                    # 3.2.3 — Enlace Covalente vs Puente de Hidrógeno
                    - **Enlace covalente intramolecular (O-H):** Une los átomos dentro de una misma molécula; es fuerte y requiere gran energía química para romperse (≈ 460 kJ/mol).
                    - **Puente de hidrógeno intermolecular:** Une moléculas vecinas de agua; individualmente es débil (≈ 20 kJ/mol), pero su multitudinaria suma colectiva otorga al agua líquida una notable cohesión interna.
                    - **Comparación con el H₂S:** El sulfuro de hidrógeno (H₂S, masa molar 34 g/mol) es un gas a 20 °C porque el azufre es menos electronegativo y no forma puentes de hidrógeno eficaces; en cambio, el H₂O (masa molar 18 g/mol) es un líquido gracias a su densa red de puentes de hidrógeno.
                """,
                conceptosClave = listOf(
                    "Ángulo de enlace del agua: 104.5° (geometría angular).",
                    "Dipolo eléctrico: oxígeno con δ⁻ e hidrógenos con δ⁺; carga neta neutra.",
                    "Puente de hidrógeno: atracción electrostática intermolecular oxígeno-hidrógeno.",
                    "En hielo: red tetraédrica fija de 4 puentes de hidrógeno."
                ),
                admissionTip = "Distinción crucial para exámenes: el enlace covalente une el O con el H DENTRO de la molécula (intramolecular). El puente de hidrógeno une dos moléculas de agua DISTINTAS (intermolecular).",
                admissionExplanation = "Comprender la diferencia de electronegatividad entre O y H explica por qué el agua forma dipolos y puentes de hidrógeno eficaces a diferencia del H₂S o el metano."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s02_c1",
                    statement = "En la molécula de agua (H₂O), los dos enlaces covalentes que unen al oxígeno central con los dos átomos de hidrógeno definen una geometría angular cuyo ángulo de enlace mide exactamente:",
                    options = listOf(
                        "180.0°",
                        "104.5°",
                        "120.0°",
                        "90.0°",
                        "109.5°"
                    ),
                    correctIndex = 1,
                    explanation = "Los dos pares de electrones no enlazantes del oxígeno ejercen repulsión sobre los pares enlazantes, cerrando el ángulo tetraédrico teórico hasta un ángulo angular de 104.5°."
                ),
                Challenge(
                    id = "bio_t03_s02_c2",
                    statement = "La molécula de agua es catalogada fisicoquímicamente como un dipolo eléctrico permanente porque:",
                    options = listOf(
                        "Posee carga iónica positiva neta en solución acuosa",
                        "El oxígeno es más electronegativo que el hidrógeno, generando densidades de carga parciales asimétricas",
                        "Se disocia espontáneamente en electrones y protones libres",
                        "Contiene enlaces peptídicos de alta polaridad",
                        "Tiene cuatro núcleos atómicos de masa idéntica"
                    ),
                    correctIndex = 1,
                    explanation = "La diferencia de electronegatividad entre el oxígeno (3.5) y los hidrógenos (2.1) crea una separación de carga: densidad parcial negativa (δ⁻) en el oxígeno y positiva (δ⁺) en los hidrógenos."
                ),
                Challenge(
                    id = "bio_t03_s02_c3",
                    statement = "A temperatura ambiental (20 °C), el sulfuro de hidrógeno (H₂S, masa 34 g/mol) es un gas, mientras que el agua (H₂O, masa 18 g/mol) es un líquido cohesionado. La causa determinante de este comportamiento reside en:",
                    options = listOf(
                        "La presencia de enlaces iónicos en el gas sulfuro de hidrógeno",
                        "La capacidad de las moléculas de agua de formar redes de puentes de hidrógeno intermoleculares",
                        "El mayor peso atómico del oxígeno respecto al azufre",
                        "La total ausencia de momentos dipolares en el agua líquida",
                        "La formación de enlaces fosfodiéster en el medio acuoso"
                    ),
                    correctIndex = 1,
                    explanation = "La elevada electronegatividad del oxígeno permite al agua formar redes continuas de puentes de hidrógeno intermoleculares que la mantienen en estado líquido; el azufre, menos electronegativo, no forma puentes eficaces."
                ),
                Challenge(
                    id = "bio_t03_s02_c4",
                    statement = "En la estructura cristalina del hielo a 0 °C, cada molécula individual de agua se encuentra enlazada con otras moléculas adyacentes formando un número máximo constante de:",
                    options = listOf(
                        "2 puentes de hidrógeno",
                        "4 puentes de hidrógeno en una red tetraédrica fija",
                        "8 enlaces covalentes apolares",
                        "1 enlace iónico con el catión hidronio",
                        "6 enlaces peptídicos hidrofóbicos"
                    ),
                    correctIndex = 1,
                    explanation = "En el hielo, cada molécula de agua forma 4 puentes de hidrógeno estables orientados hacia los vértices de un tetraedro regular, creando una estructura hexagonal abierta y rígida."
                ),
                Challenge(
                    id = "bio_t03_s02_c5",
                    statement = "El puente de hidrógeno que une a las moléculas de agua adyacentes consiste fundamentalmente en una:",
                    options = listOf(
                        "Atracción electrostática entre el polo δ⁻ del oxígeno de una molécula y el polo δ⁺ del hidrógeno de otra",
                        "Compartición de cuatro electrones pi deslocalizados entre dos núcleos de oxígeno",
                        "Fuerza magnética producida por el giro de neutrones",
                        "Unión covalente fuerte con transferencia neta de protones",
                        "Atracción hidrofóbica que excluye totalmente la polaridad"
                    ),
                    correctIndex = 0,
                    explanation = "El puente de hidrógeno es una interacción electrostática dipolar entre la densidad de carga negativa del oxígeno de una molécula de agua y la densidad positiva del hidrógeno de una molécula vecina."
                ),
                Challenge(
                    id = "bio_t03_s02_c6",
                    statement = "¿Cuál es la diferencia química esencial entre el enlace covalente O-H y el puente de hidrógeno en el agua?",
                    options = listOf(
                        "El enlace covalente une dos moléculas de agua distintas; el puente une los átomos dentro de una misma molécula",
                        "El enlace covalente es intramolecular y de gran energía; el puente de hidrógeno es intermolecular y de menor energía individual",
                        "El puente de hidrógeno es el enlace más fuerte que existe en la naturaleza",
                        "Ambos enlaces son estrictamente idénticos en fuerza, longitud y ubicación",
                        "El enlace covalente solo existe en estado gaseoso y el puente de hidrógeno solo en el vacío"
                    ),
                    correctIndex = 1,
                    explanation = "El enlace covalente O-H es intramolecular (une los átomos de una misma molécula) y requiere ≈ 460 kJ/mol para romperse; el puente de hidrógeno es intermolecular (une moléculas vecinas) y tiene ≈ 20 kJ/mol."
                ),
                Challenge(
                    id = "bio_t03_s02_c7",
                    statement = "En el agua en estado líquido a temperatura fisiológica (37 °C), los puentes de hidrógeno se caracterizan por:",
                    options = listOf(
                        "Permanecer permanentemente rígidos sin romperse jamás",
                        "Formarse y romperse continuamente a velocidades de picosegundos, confiriendo fluidez dinámica",
                        "Impedir totalmente el movimiento traslacional de las moléculas",
                        "Transformarse espontáneamente en enlaces metálicos",
                        "Existir exclusivamente en la interfase con el aire"
                    ),
                    correctIndex = 1,
                    explanation = "En el agua líquida los puentes de hidrógeno son efímeros y dinámicos: duran fracciones mínimas de segundo antes de reorganizarse, lo que permite que el agua sea fluida pero altamente cohesionada."
                ),
                Challenge(
                    id = "bio_t03_s02_c8",
                    statement = "La carga eléctrica neta total de una molécula de agua intacta (H₂O) en disolución es igual a:",
                    options = listOf(
                        "+1 debido a los dos hidrógenos",
                        "0 (es una molécula eléctricamente neutra)",
                        "-2 debido al oxígeno",
                        "+2 por el momento dipolar",
                        "-1 por los pares de electrones libres"
                    ),
                    correctIndex = 1,
                    explanation = "Aunque el agua es una molécula polar (posee asimetría de carga local con polos δ⁺ y δ⁻), el número total de protones (10) iguala al número de electrones (10), por lo que su carga neta total es cero."
                )
            )
        ),
        LessonNode(
            id = "bio_t03_s03",
            subjectId = "biologia",
            semana = 3,
            subtema = "3.3",
            title = "Propiedades Biológicas del Agua",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t03_s03",
                asignatura = "Biología",
                semana = 3,
                titulo = "Propiedades Fisicoquímicas y Funciones Biológicas del Agua",
                resumen = """Las propiedades anómalas del agua derivan de su cohesión intermolecular y sostienen la termorregulación, transporte y metabolismo de los seres vivos.

                    # 3.3.1 — Elevado Calor Específico (Termorregulador)
                    - El calor específico del agua es de **1 cal/g °C** (4.184 J/g °C), uno de los más altos de la naturaleza.
                    - Requiere absorber o liberar grandes cantidades de calor para modificar mínimamente su temperatura, debido a que gran parte de la energía calórica se invierte en romper puentes de hidrógeno antes de acelerar el movimiento molecular.
                    - **Función biológica:** Actúa como un magnífico **amortiguador térmico** interno, protegiendo las enzimas y estructuras celulares de cambios bruscos de temperatura. En el planeta, modera el clima en zonas costeras.

                    # 3.3.2 — Elevado Calor de Vaporización (Refrigerante)
                    - Se requieren aproximadamente **540 cal/g** a 100 °C (y cerca de 580 cal/g a temperatura corporal de 37 °C) para evaporar un solo gramo de agua.
                    - **Función biológica:** Eficaz **mecanismo de enfriamiento evaporativo**. Cuando un mamífero suda o un vegetal transpira por los estomas, la evaporación de una pequeña película de agua absorbe gran cantidad de calor de la superficie corporal, disipándolo sin causar deshidratación masiva.

                    # 3.3.3 — Cohesión, Adhesión y Capilaridad
                    - **Cohesión:** Fuerza con que las moléculas de agua se atraen entre sí mediante puentes de hidrógeno. Confiere alta resistencia a la tracción y una **elevada tensión superficial** (permite que insectos como el zapatero de agua caminen sobre ella sin hundirse).
                    - **Adhesión:** Capacidad del agua de unirse electrostáticamente a otras superficies cargadas o polares (como las paredes de celulosa del xilema o tubos capilares de vidrio).
                    - **Capilaridad:** Fenómeno físico conjunto (cohesión + adhesión) por el cual el agua asciende espontáneamente por conductos de diámetro microscópico en contra de la gravedad. Es clave para el **ascenso de la savia bruta** desde las raíces hasta las copas de los árboles sin gasto de ATP.

                    # 3.3.4 — Solvente Universal y Capas de Solvatación
                    - Disuelve una enorme variedad de solutos polares (azúcares, aminoácidos) y compuestos iónicos (sales minerales).
                    - Los dipolos del agua rodean a los iones individuales formando **esferas o capas de solvatación** (el polo δ⁺ rodea aniones como Cl⁻ y el polo δ⁻ rodea cationes como Na⁺), debilitando la atracción iónica y dispersándolos en solución.
                    - Es el medio acuoso donde ocurren todas las reacciones bioquímicas del metabolismo.

                    # 3.3.5 — Densidad Anómala (Máxima a 4 °C)
                    - A diferencia de casi todos los líquidos que se contraen y vuelven más densos al enfriarse, el agua alcanza su **densidad máxima a 4 °C (1.000 g/cm³)**.
                    - Al descender de 4 °C a 0 °C, las moléculas se ordenan en una red cristalina de hielo con espacios intersticiales vacíos, haciendo que el **hielo sólido sea menos denso que el agua líquida (≈ 0.917 g/cm³)**.
                    - **Función ecológica:** El hielo flota en la superficie de lagos y ríos andinos o polares, actuando como una **capa aislante térmica** que impide el congelamiento del fondo, manteniendo el agua profunda en estado líquido a 4 °C y preservando la vida acuática durante el invierno.
                """,
                conceptosClave = listOf(
                    "Calor específico alto: amortiguador térmico interno (1 cal/g °C).",
                    "Calor de vaporización alto (540 cal/g): disipación de calor por sudoración.",
                    "Capilaridad (cohesión + adhesión): ascenso de savia bruta en el xilema.",
                    "Densidad máxima a 4 °C: el hielo flota y aísla el fondo acuático preservando la vida."
                ),
                admissionTip = "Si la pregunta menciona 'evitar el congelamiento total de un lago en invierno protegiendo a los peces', la propiedad causante es la DENSIDAD ANÓMALA DEL AGUA (el hielo flota por ser menos denso).",
                admissionExplanation = "La distinción entre el calor específico (amortiguación térmica) y el calor de vaporización (refrigeración por sudor) es sistemáticamente evaluada en CEPRUNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s03_c1",
                    statement = "Durante una jornada de alta intensidad física bajo el sol en la costa arequipeña, una persona transpira profusamente. La evaporación del sudor en su piel le permite enfriar el organismo eficazmente gracias a que el agua posee:",
                    options = listOf(
                        "Bajo calor latente de condensación",
                        "Elevado calor de vaporización",
                        "Baja constante dieléctrica",
                        "Densidad máxima en estado de vapor",
                        "Poca cohesión entre sus moléculas"
                    ),
                    correctIndex = 1,
                    explanation = "El elevado calor de vaporización del agua (≈ 540 cal/g) hace que la evaporación de apenas unos mililitros de sudor extraiga una ingente cantidad de calor de la piel, refrigerando el cuerpo."
                ),
                Challenge(
                    id = "bio_t03_s03_c2",
                    statement = "El agua actúa como un extraordinario amortiguador térmico dentro de las células vivas, evitando que la energía liberada por las reacciones metabólicas provoque fluctuaciones drásticas de temperatura. Esta función se debe a su:",
                    options = listOf(
                        "Elevado calor específico",
                        "Baja viscosidad dinámica",
                        "Poco peso molecular",
                        "Capacidad de sublimación rápida",
                        "Densidad nula a 100 °C"
                    ),
                    correctIndex = 0,
                    explanation = "El elevado calor específico del agua (1 cal/g °C) le permite absorber o liberar grandes cantidades de calor experimentando variaciones térmicas mínimas, estabilizando la temperatura celular."
                ),
                Challenge(
                    id = "bio_t03_s03_c3",
                    statement = "Pequeños insectos como los zapateros acuáticos (*Gerris lacustris*) pueden desplazarse sobre la superficie de un estanque sin hundirse. La propiedad fisicoquímica del agua que permite este soporte es la:",
                    options = listOf(
                        "Baja tensión superficial",
                        "Elevada tensión superficial debida a la cohesión de puentes de hidrógeno",
                        "Densidad máxima a 0 °C",
                        "Alta constante crioscópica",
                        "Capacidad disolvente apolar"
                    ),
                    correctIndex = 1,
                    explanation = "La gran cohesión intermolecular del agua genera una elevada tensión superficial en la interfase líquido-aire, formando una lámina elástica capaz de soportar el peso de pequeños artrópodos."
                ),
                Challenge(
                    id = "bio_t03_s03_c4",
                    statement = "El ascenso continuo de agua y sales minerales (savia bruta) a través de los delgados vasos leñosos del xilema desde la raíz hasta las hojas de un eucalipto de 30 metros de altura se fundamenta en:",
                    options = listOf(
                        "Bomba de sodio y potasio del periciclo",
                        "El fenómeno de capilaridad resultante de la cohesión y adhesión del agua",
                        "La respiración anaerobia de la corteza",
                        "La alta solubilidad de los lípidos en savia elaborada",
                        "La contracción de células musculares vegetales"
                    ),
                    correctIndex = 1,
                    explanation = "La capilaridad, sustentada por la cohesión entre moléculas de agua y la adhesión de estas a las paredes hidrofílicas del xilema, permite el ascenso de la savia bruta por conductos capilares estrechos."
                ),
                Challenge(
                    id = "bio_t03_s03_c5",
                    statement = "Durante las heladas invernales en las lagunas de la puna andina, la superficie se cubre de una capa de hielo mientras los peces y anfibios sobreviven en el agua del fondo. Este fenómeno es posible porque:",
                    options = listOf(
                        "El hielo es más denso que el agua líquida y se hunde al fondo",
                        "El agua alcanza su densidad máxima a 4 °C y el hielo sólido es menos denso, flotando y actuando como aislante térmico",
                        "El agua pura se congela únicamente a -20 °C en la altitud",
                        "Los seres vivos acuáticos generan su propio calor por fotosíntesis",
                        "El hielo absorbe calor del fondo lacustre por capilaridad"
                    ),
                    correctIndex = 1,
                    explanation = "La densidad máxima del agua ocurre a 4 °C; el hielo a 0 °C es menos denso y flota, formando una cubierta superficial que aísla térmicamente el fondo e impide el congelamiento total de la masa hídrica."
                ),
                Challenge(
                    id = "bio_t03_s03_c6",
                    statement = "Al disolver cloruro de sodio (NaCl) en agua pura, los cristales salinos se desmoronan y los iones se dispersan homogéneamente porque las moléculas dipolares de agua:",
                    options = listOf(
                        "Oxidan al cloro convirtiéndolo en gas tóxico",
                        "Forman capas o esferas de solvatación orientadas electrostáticamente alrededor de cada ion Na⁺ y Cl⁻",
                        "Polimerizan la sal formando macromoléculas de celulosa",
                        "Neutralizan por completo las masas atómicas de los núcleos",
                        "Precipitan el sodio hacia la atmósfera"
                    ),
                    correctIndex = 1,
                    explanation = "Las moléculas de agua forman capas de solvatación: el oxígeno parcialmente negativo rodea a los cationes Na⁺ y los hidrógenos positivos rodean a los aniones Cl⁻, separándolos e impidiendo que se recombinen."
                ),
                Challenge(
                    id = "bio_t03_s03_c7",
                    statement = "La propiedad del agua de adherirse a superficies con cargas polares o con grupos hidroxilo libres, como el vidrio de una probeta o las paredes celulares vegetales, se denomina:",
                    options = listOf(
                        "Adhesión",
                        "Cohesión pura",
                        "Densidad crítica",
                        "Vaporización espontánea",
                        "Turgencia osmolar"
                    ),
                    correctIndex = 0,
                    explanation = "La adhesión es la fuerza de atracción atractiva electrostática intermolecular entre las moléculas de agua y una superficie sólida polar distinta."
                ),
                Challenge(
                    id = "bio_t03_s03_c8",
                    statement = "En animales de cuerpo blando como las lombrices de tierra (*Lumbricus terrestris*), la incompresibilidad del agua contenida en su celoma cumple la función mecánica fundamental de:",
                    options = listOf(
                        "Aislante eléctrico de mielina",
                        "Esqueleto hidrostático de sostén y locomoción",
                        "Reserva calórica de lípidos",
                        "Esmalte protector cuticular",
                        "Pigmento fototrópico"
                    ),
                    correctIndex = 1,
                    explanation = "Debido a su bajísima compresibilidad, los fluidos acuosos confinados en cavidades celómicas actúan como un esqueleto hidrostático sobre el cual actúan los músculos para la locomoción."
                ),
                Challenge(
                    id = "bio_t03_s03_c9",
                    statement = "En una ciudad costera como Mollendo, las temperaturas durante el día y la noche presentan variaciones mucho más suaves que en el desierto interior de La Joya. Esta moderación climática es consecuencia del:",
                    options = listOf(
                        "Bajo calor de fusión del agua marina",
                        "Elevado calor específico del agua oceánica que actúa como regulador térmico geográfico",
                        "Bajo punto de ebullición del agua con sal",
                        "Efecto de la fotosíntesis nocturna del fitoplancton",
                        "Nulo calor de vaporización costero"
                    ),
                    correctIndex = 1,
                    explanation = "Las grandes masas de agua oceánicas absorben calor diurno y lo ceden lentamente de noche debido a su alto calor específico, funcionando como gigantescos termorreguladores climáticos."
                ),
                Challenge(
                    id = "bio_t03_s03_c10",
                    statement = "El agua es indispensable como reactivo químico directo en el catabolismo celular, interviniendo activamente en las reacciones de rotura de enlaces covalentes denominadas:",
                    options = listOf(
                        "Reacciones de condensación deshidratante",
                        "Reacciones de hidrólisis",
                        "Polimerizaciones de monómeros",
                        "Reacciones de reducción fotosintética",
                        "Fosforilaciones a nivel de sustrato"
                    ),
                    correctIndex = 1,
                    explanation = "En las reacciones de hidrólisis enzimática (como en la digestión de almidón y proteínas), la molécula de agua se fragmenta aportando un H⁺ y un OH⁻ para romper los enlaces químicos."
                ),
                Challenge(
                    id = "bio_t03_s03_c11",
                    statement = "Cuando se colocan gotas de aceite vegetal en un vaso con agua, los lípidos apolares se agrupan espontáneamente excluyendo las moléculas acuosas. Este fenómeno fisicoquímico se conoce como:",
                    options = listOf(
                        "Interacción hidrofóbica",
                        "Capilaridad inversa",
                        "Hidrólisis micelar",
                        "Solvatación electrostática",
                        "Puente peptídico"
                    ),
                    correctIndex = 0,
                    explanation = "El efecto o interacción hidrofóbica surge porque el agua tiende a autoasociarse mediante puentes de hidrógeno, forzando a las moléculas apolares no hidrofílicas a agregarse entre sí."
                ),
                Challenge(
                    id = "bio_t03_s03_c12",
                    statement = "La constante dieléctrica del agua es sumamente alta (≈ 80 a 20 °C). Esta propiedad fisicoquímica implica que el agua:",
                    options = listOf(
                        "Facilita la disociación de compuestos iónicos disminuyendo la atracción entre iones opuestos",
                        "Imposibilita la disolución de sales en el citoplasma",
                        "Conduce corriente eléctrica sin necesidad de iones disueltos",
                        "Aumenta la fuerza de atracción electrostática entre cargas",
                        "Solidifica instantáneamente ante campos electromagnéticos"
                    ),
                    correctIndex = 0,
                    explanation = "Una constante dieléctrica alta atenúa la atracción electrostática entre cationes y aniones en una proporción de 1/80, facilitando su disociación y solubilidad en medio acuoso."
                ),
                Challenge(
                    id = "bio_t03_s03_c13",
                    statement = "¿Cuál de las siguientes afirmaciones explica con rigor por qué el calor específico del agua es notablemente superior al de sustancias como el alcohol o el mercurio?",
                    options = listOf(
                        "Porque el agua carece por completo de momentos dipolares",
                        "Porque gran parte del calor suministrado debe consumirse en debilitar y romper la red de puentes de hidrógeno antes de acelerar las moléculas",
                        "Porque las moléculas de agua tienen una masa atómica superior a la de los metales",
                        "Porque el agua se descompone espontáneamente en oxígeno al calentarse a 25 °C",
                        "Porque sus enlaces covalentes se transforman en enlaces iónicos al calentarse"
                    ),
                    correctIndex = 1,
                    explanation = "Al calentar agua líquida, gran proporción de la energía térmica suministrada se consume en romper la densa red de puentes de hidrógeno intermoleculares, en vez de aumentar directamente la energía cinética de las moléculas."
                )
            )
        ),
        LessonNode(
            id = "bio_t03_s04",
            subjectId = "biologia",
            semana = 3,
            subtema = "3.4",
            title = "Sales Minerales y Amortiguadores de pH",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t03_s04",
                asignatura = "Biología",
                semana = 3,
                titulo = "Sales Minerales, Dinámica Osmótica y Soluciones Amortiguadoras",
                resumen = """Las sales minerales en estado precipitado o disuelto regulan la rigidez estructural, la presión osmótica y el pH celular mediante buffers fisiológicos.

                    # 3.4.1 — Estados de las Sales Minerales en los Seres Vivos
                    - **Sales Precipitadas (Insolubles o de Sostén):**
                      - Se encuentran en estado sólido formando matrices rígidas de protección y sostén esquelético.
                      - *Hidroxiapatita de calcio [Ca₁₀(PO₄)₆(OH)₂]:* Mineraliza la matriz ósea en huesos y el esmalte dental en vertebrados.
                      - *Carbonato de calcio (CaCO₃):* Integra las conchas de moluscos (bivalvos, caracoles), caparazones de crustáceos y exoesqueleto de corales.
                      - *Sílice (Dióxido de silicio, SiO₂):* Constituye las frústulas de diatomeas y espículas de esponjas silíceas.
                    - **Sales Disueltas (Ionizadas o Electrolitos Libres):**
                      - Disociadas en cationes (Na⁺, K⁺, Ca²⁺, Mg²⁺) y aniones (Cl⁻, HCO₃⁻, HPO₄²⁻, SO₄²⁻).
                      - Regulan la **presión osmótica**, el balance hídrico celular, la excitabilidad neuromuscular y el equilibrio ácido-base.

                    # 3.4.2 — Presión Osmótica y Comportamiento Celular
                    La **ósmosis** es el flujo pasivo de agua a través de una membrana semipermeable desde un medio de menor concentración de soluto (hipotónico) hacia uno de mayor concentración de soluto (hipertónico):
                    - **En medio Hipertónico (alta concentración salina extracelular):**
                      - El agua sale masivamente de la célula por ósmosis.
                      - *Célula animal (eritrocito):* Se deshidrata y arruga: fenómeno de **Crenación**.
                      - *Célula vegetal:* La vacuola pierde agua y el citoplasma se contrae, desprendiendo la membrana plasmática de la pared celular: fenómeno de **Plasmólisis**.
                    - **En medio Hipotónico (baja concentración salina extracelular, ej. agua destilada):**
                      - El agua ingresa masivamente al interior celular.
                      - *Célula animal (eritrocito):* Aumenta de volumen hasta reventar por carecer de pared rígida: **Lisis osmótica** o **Hemólisis**.
                      - *Célula vegetal:* Absorbe agua y la vacuola se expande empujando el protoplasto contra la pared celular celulósica rígida, adquiriendo firmeza y resistencia sin estallar: estado de **Turgencia**.
                    - **En medio Isotónico (misma concentración que el citoplasma, ej. suero fisiológico al 0.9% NaCl):**
                      - El flujo de entrada y salida de agua es equilibrado; la célula conserva su volumen fisiológico normal.

                    # 3.4.3 — Sistemas Amortiguadores de pH (Buffers o Tampones)
                    Evitan variaciones bruscas del pH celular o tisular captando protones (H⁺) cuando el medio se acidifica o cediéndolos cuando se alcaliniza.
                    - **Buffer Bicarbonato (H₂CO₃ / HCO₃⁻):**
                      - Principal amortiguador químico del medio **extracelular y de la sangre humana** (mantiene el pH sanguíneo estrictamente entre 7.35 y 7.45).
                      - Ante acidosis (exceso de H⁺), el HCO₃⁻ capta protones formando H₂CO₃, que la anhidrasa carbónica convierte en CO₂ y H₂O, eliminado por ventilación pulmonar.
                    - **Buffer Fosfato (H₂PO₄⁻ / HPO₄²⁻):**
                      - Principal sistema amortiguador del medio **intracelular** (citoplasma) y de los túbulos renales, operando con máxima eficacia cerca de pH 6.8 a 7.2.
                    - **Amortiguadores Proteicos:** La hemoglobina y la albúmina participan como amortiguadores anfóteros mediante sus grupos amino (-NH₂) y carboxilo (-COOH).
                """,
                conceptosClave = listOf(
                    "Sales precipitadas: hidroxiapatita (huesos), CaCO₃ (conchas), SiO₂ (diatomeas).",
                    "Hipertónico: animal = crenación; vegetal = plasmólisis.",
                    "Hipotónico: animal = lisis/hemólisis; vegetal = turgencia (no estalla por la pared).",
                    "Buffer Bicarbonato: sangre extracelular; Buffer Fosfato: citoplasma intracelular."
                ),
                admissionTip = "Regla fija en exámenes de admisión: el eritrocito en agua pura ESTALLA (hemólisis/lisis), pero la célula vegetal en agua pura NO estalla, queda TURGENTE gracias a su pared de celulosa.",
                admissionExplanation = "Diferenciar el amortiguador extracelular (bicarbonato) del intracelular (fosfato) resuelve de inmediato las preguntas de bioquímica básica en CEPRUNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s04_c1",
                    statement = "Si se colocan eritrocitos humanos en una cubeta que contiene una solución salina hipertónica de cloruro de sodio al 5%, se observará al microscopio que las células:",
                    options = listOf(
                        "Aumentan su turgencia sin sufrir cambios morfológicos",
                        "Experimentan crenación al perder agua osmóticamente hacia el medio",
                        "Sufren lisis celular inmediata con dispersión de hemoglobina",
                        "Presentan plasmólisis con separación de su pared celular",
                        "Fagocitan activamente los cristales de sal mediante pseudópodos"
                    ),
                    correctIndex = 1,
                    explanation = "En un medio hipertónico, el agua del interior del eritrocito sale por ósmosis hacia la solución concentrada externa; al perder volumen, la célula se arruga y colapsa (crenación)."
                ),
                Challenge(
                    id = "bio_t03_s04_c2",
                    statement = "Cuando una célula vegetal de una hoja de elodea se coloca en agua destilada (medio marcadamente hipotónico), el agua penetra a su interior llenando la vacuola central; sin embargo, la célula no estalla porque:",
                    options = listOf(
                        "Su membrana plasmática es impermeable al paso de agua",
                        "Posee una pared celular celulósica rígida que soporta la presión de turgencia",
                        "Expulsa agua mediante vacuolas pulsátiles de origen lisosómico",
                        "Convierte instantáneamente el agua en almidón de reserva",
                        "Sus mitocondrias degradan el exceso de líquido por respiración"
                    ),
                    correctIndex = 1,
                    explanation = "La pared celular de celulosa ejerce una contrapresión mecánica que resiste la entrada de agua, permitiendo a la célula vegetal alcanzar un estado óptimo de turgencia sin sufrir lisis."
                ),
                Challenge(
                    id = "bio_t03_s04_c3",
                    statement = "Si una muestra de glóbulos rojos humanos se suspende en un tubo de ensayo con agua destilada pura, el resultado celular inmediato observado será:",
                    options = listOf(
                        "Crenación citoplasmática",
                        "Lisis osmótica o hemólisis celular",
                        "Plasmólisis reversible",
                        "Formación de endosporas bacterianas",
                        "Conservación íntegra de la morfología bicóncava"
                    ),
                    correctIndex = 1,
                    explanation = "En agua destilada (medio hipotónico extremo), el agua ingresa masivamente al eritrocito por ósmosis; al carecer de pared celular rígida, la membrana plasmática no resiste la distensión y estalla (hemólisis)."
                ),
                Challenge(
                    id = "bio_t03_s04_c4",
                    statement = "En las células del parénquima de una planta sometida a sequía severa y salinidad extrema en el suelo, se produce la pérdida neta de agua vacuolar y el desprendimiento de la membrana plasmática respecto a la pared celular. Este fenómeno se denomina:",
                    options = listOf(
                        "Crenación",
                        "Plasmólisis",
                        "Turgencia",
                        "Hemólisis",
                        "Pinocitosis"
                    ),
                    correctIndex = 1,
                    explanation = "La plasmólisis es el fenómeno exclusivo de células vegetales con pared, donde el medio hipertónico induce la pérdida de agua vacuolar y el retraimiento del protoplasto de la pared."
                ),
                Challenge(
                    id = "bio_t03_s04_c5",
                    statement = "El principal sistema químico amortiguador (buffer) encargado de regular el pH de la sangre humana y del líquido extracelular dentro del rango fisiológico de 7.35 a 7.45 es el:",
                    options = listOf(
                        "Buffer fosfato dibásico",
                        "Buffer bicarbonato / ácido carbónico",
                        "Buffer lactato de calcio",
                        "Buffer acetato de amonio",
                        "Buffer sulfato ferroso"
                    ),
                    correctIndex = 1,
                    explanation = "El sistema buffer bicarbonato (H₂CO₃ / HCO₃⁻) es el amortiguador cardinal del líquido extracelular y plasma sanguíneo humano, acoplado al sistema respiratorio y renal."
                ),
                Challenge(
                    id = "bio_t03_s04_c6",
                    statement = "A nivel del citoplasma celular (líquido intracelular), el sistema amortiguador inorgánico que opera con mayor efectividad para regular las variaciones de pH interno es el:",
                    options = listOf(
                        "Buffer bicarbonato",
                        "Buffer fosfato (H₂PO₄⁻ / HPO₄²⁻)",
                        "Buffer cloruro de sodio",
                        "Buffer carbonato de calcio",
                        "Buffer hidróxido de potasio"
                    ),
                    correctIndex = 1,
                    explanation = "El sistema buffer fosfato monoácido/diácido es el amortiguador inorgánico por excelencia dentro de las células, dado que su pKa (≈ 6.86) se aproxima al pH intracelular normal."
                ),
                Challenge(
                    id = "bio_t03_s04_c7",
                    statement = "El componente mineral precipitado que otorga la dureza característica y resistencia mecánica a la matriz del tejido óseo en los vertebrados es la:",
                    options = listOf(
                        "Fluorapatita pura",
                        "Hidroxiapatita de calcio",
                        "Sílice amorfa vesicular",
                        "Magnetita ferrosa",
                        "Pepsina globular"
                    ),
                    correctIndex = 1,
                    explanation = "La hidroxiapatita [Ca₁₀(PO₄)₆(OH)₂] es la sal mineral precipitada de fosfato y calcio que forma la fracción inorgánica de huesos y dientes en los vertebrados."
                ),
                Challenge(
                    id = "bio_t03_s04_c8",
                    statement = "Las conchas de los moluscos marinos como almejas, choros y machas, así como los esqueletos de los corales constructores de arrecifes, están formados principalmente por sales precipitadas de:",
                    options = listOf(
                        "Carbonato de calcio (CaCO₃)",
                        "Cloruro de potasio",
                        "Fosfato férrico",
                        "Dióxido de manganeso",
                        "Nitrato de sodio"
                    ),
                    correctIndex = 0,
                    explanation = "El carbonato de calcio (CaCO₃) cristalizado en forma de calcita o aragonito conforma el soporte esquelético externo de moluscos y corales marinos."
                ),
                Challenge(
                    id = "bio_t03_s04_c9",
                    statement = "Las algas microscópicas unicelulares conocidas como diatomeas poseen una cubierta externa rígida y ornamentada denominada frústula, la cual está constituida por un mineral precipitado de:",
                    options = listOf(
                        "Carbonato de sodio",
                        "Sílice (dióxido de silicio)",
                        "Sulfato de magnesio",
                        "Fosfato tricálcico",
                        "Hidróxido de aluminio"
                    ),
                    correctIndex = 1,
                    explanation = "Las diatomeas incorporan sílice hidratada (SiO₂) para formar sus frústulas vítreas bivalvas, altamente resistentes a la degradación biológica."
                ),
                Challenge(
                    id = "bio_t03_s04_c10",
                    statement = "¿Cuál es la función fisiológica primordial que define a una solución amortiguadora o buffer en un organismo vivo?",
                    options = listOf(
                        "Aumentar rápidamente la temperatura corporal durante el ejercicio",
                        "Resistir o minimizar los cambios bruscos de pH al agregar cantidades moderadas de ácidos o bases",
                        "Sintetizar nuevas moléculas de ATP sin consumo de oxígeno",
                        "Provocar la coagulación irreversible del plasma sanguíneo",
                        "Acelerar la evaporación de agua a través de la piel"
                    ),
                    correctIndex = 1,
                    explanation = "Un buffer está constituido por un par ácido débil/base conjugada que amortigua las fluctuaciones del pH captando o liberando iones H⁺ frente a perturbaciones ácido-base."
                ),
                Challenge(
                    id = "bio_t03_s04_c11",
                    statement = "Al transfundir una solución salina fisiológica al 0.9% de NaCl (suero fisiológico) a un paciente deshidratado, los glóbulos rojos no sufren ni crenación ni hemólisis porque la solución administrada es:",
                    options = listOf(
                        "Marcardamente hipotónica respecto al citosol",
                        "Isotónica respecto al medio intracelular de los eritrocitos",
                        "Altamente hipertónica y viscosa",
                        "Completamente desprovista de solvente",
                        "Un buffer alcalino concentrado al 10%"
                    ),
                    correctIndex = 1,
                    explanation = "El suero fisiológico de NaCl al 0.9% tiene una osmolaridad de ≈ 300 mOsm/L, idéntica a la del plasma y citosol (medio isotónico); no hay flujo neto de agua a través de la membrana celular."
                ),
                Challenge(
                    id = "bio_t03_s04_c12",
                    statement = "Durante una acidosis metabólica en un paciente con insuficiencia renal, el exceso de protones (H⁺) en sangre es amortiguado por el bicarbonato plasmático. ¿Cómo elimina el organismo finalmente el exceso de ácido generado?",
                    options = listOf(
                        "Almacenando ácido clorhídrico en los adipocitos",
                        "Convirtiendo el ácido carbónico en H₂O y CO₂, el cual se elimina por hiperventilación pulmonar",
                        "Precipitando fosfatos en las válvulas cardíacas",
                        "Transformando el bicarbonato en amoníaco hepático",
                        "Fijando protones libres directamente sobre las plaquetas"
                    ),
                    correctIndex = 1,
                    explanation = "El H⁺ se une al HCO₃⁻ formando H₂CO₃, que se escinde en agua y CO₂ por la anhidrasa carbónica. El aumento en la frecuencia respiratoria (hiperventilación) elimina el CO₂ espirado, compensando la acidosis."
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
            subtema = "4.1",
            title = "Glúcidos: Monosacáridos y Polisacáridos",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t04_s01",
                asignatura = "Biología",
                semana = 4,
                titulo = "Estructura, Clasificación y Funciones de los Glúcidos",
                resumen = """Los glúcidos constituyen la fuente primaria de combustible metabólico inmediato y aportan arquitectura de sostén celular en plantas y animales.

                    # 4.1.1 — Definición, Composición y Enlace Glucosídico
                    - Biomoléculas orgánicas ternarias compuestas por **Carbono (C), Hidrógeno (H) y Oxígeno (O)**, generalmente en la proporción Cn(H₂O)n.
                    - Químicamente son **polihidroxialdehídos** (poseen un grupo carbonilo aldehído -CHO en el extremo, denominados aldosas) o **polihidroxicetonas** (poseen un grupo carbonilo cetona -C=O interno, denominados cetosas).
                    - **Enlace Glucosídico:** Enlace covalente que une monosacáridos entre sí. Se forma entre el carbono anomérico de un monosacárido y un grupo hidroxilo (-OH) de otro monosacárido con liberación de una molécula de agua (reacción de condensación o deshidratación). Puede ser de tipo alfa (α) o beta (β).

                    # 4.1.2 — Monosacáridos (Glúcidos Simples)
                    Son los monómeros no hidrolizables más sencillos:
                    - **Triosas (3C):** *Gliceraldehído* (aldotriosa) y *dihidroxiacetona* (cetotriosa), intermediarios metabólicos de la glucólisis y fotosíntesis.
                    - **Pentosas (5C):**
                      - *Ribosa:* Aldopentosa constituyente del ARN y del nucleótido ATP.
                      - *Desoxirribosa:* Aldopentosa del ADN; se diferencia de la ribosa porque carece de un átomo de oxígeno en el carbono 2' (-H en lugar de -OH).
                      - *Ribulosa:* Cetopentosa cuya forma activada (ribulosa 1,5-bisfosfato) fija el CO₂ atmosférico en el ciclo de Calvin mediante la enzima RuBisCO.
                    - **Hexosas (6C):**
                      - *Glucosa:* Aldohexosa (dextrosa); principal combustible metabólico de la respiración celular en el encéfalo y eritrocitos humanos.
                      - *Galactosa:* Aldohexosa; forma parte del disacárido lactosa de la leche.
                      - *Fructosa:* Cetohexosa (levulosa); azúcar más dulce presente en frutas y en el líquido seminal, suministrando energía para el movimiento de los espermatozoides.

                    # 4.1.3 — Disacáridos (Oligosacáridos)
                    Unión de dos monosacáridos mediante enlace glucosídico:
                    - **Maltosa:** Glucosa + Glucosa con enlace **α-1,4**. Se obtiene por la hidrólisis enzimática del almidón.
                    - **Lactosa:** Galactosa + Glucosa con enlace **β-1,4**. Es el azúcar característico de la leche de los mamíferos.
                    - **Sacarosa:** Glucosa + Fructosa con enlace **α-1,2** (dicarbonílico). Es el azúcar de mesa (caña de azúcar y remolacha), disacárido no reductor transportado en el floema de las plantas.
                    - **Trehalosa:** Glucosa + Glucosa con enlace **α-1,1**. Presente en la hemolinfa de los insectos y en hongos.

                    # 4.1.4 — Polisacáridos (Macromoléculas)
                    Polímeros de cientos a miles de monosacáridos:
                    - **Polisacáridos de Reserva Energética:**
                      - *Almidón:* Reserva energética fundamental de las células vegetales, almacenado en amiloplastos de raíces (yuca), tubérculos (papa) y semillas. Formado por dos fracciones: **amilosa** (cadena lineal helicoidal sin ramificar con enlaces α-1,4; tiñe azul intenso con lugol) y **amilopectina** (cadena ramificada con enlaces α-1,4 y ramificaciones en α-1,6 cada 24-30 glucosas).
                      - *Glucógeno:* Reserva energética de los animales y hongos. Se almacena preferentemente en el hígado (regula la glucemia) y en el músculo esquelético (fuente rápida de ATP muscular). Estructuralmente similar a la amilopectina pero mucho más ramificado (ramificaciones α-1,6 cada 8-12 glucosas).
                    - **Polisacáridos Estructurales:**
                      - *Celulosa:* Componente estructural primordial de la pared celular en plantas y algas. Formada por cadenas lineales no ramificadas de miles de glucosas unidas por enlaces **β-1,4**. Los humanos carecemos de la enzima celulasa, por lo que no podemos digerirla (actúa como fibra dietética insoluble).
                      - *Quitina:* Polímero lineal de **N-acetilglucosamina** unidos por enlaces **β-1,4**. Es un polisacárido nitrogenado que forma el exoesqueleto resistente de los artrópodos (insectos, arácnidos, crustáceos) y la pared celular de los hongos (reino Fungi).
                """,
                conceptosClave = listOf(
                    "Monómeros: glucosa, fructosa, galactosa, ribosa y desoxirribosa.",
                    "Disacáridos: maltosa (Glu+Glu), lactosa (Gal+Glu), sacarosa (Glu+Fru).",
                    "Reserva: Almidón en vegetales (amilosa + amilopectina); Glucógeno en animales y hongos.",
                    "Estructurales: Celulosa (pared vegetal, enlace β-1,4); Quitina (exoesqueleto de artrópodos y hongos, contiene nitrógeno)."
                ),
                admissionTip = "Detalle clave en CEPRUNSA: la Quitina es el único polisacárido común que CONTIENE NITRÓGENO porque su monómero no es glucosa pura, sino N-acetilglucosamina.",
                admissionExplanation = "Comprender la diferencia estereoquímica entre el enlace alfa (digerible por amilasas humanas en almidón y glucógeno) y el enlace beta (indigerible en la celulosa) fundamenta las preguntas de nutrición y bioquímica."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s01_c1",
                    statement = "El caparazón endurecido de un cangrejo de las costas del sur del Perú y la pared celular de las hifas de un champiñón comestible comparten un polisacárido estructural constituido por unidades repetitivas de N-acetilglucosamina. Este compuesto nitrogenado es la:",
                    options = listOf(
                        "Celulosa",
                        "Amilosa",
                        "Quitina",
                        "Inulina",
                        "Mureína bacteriana"
                    ),
                    correctIndex = 2,
                    explanation = "La quitina es el polisacárido estructural nitrogenado por excelencia que conforma el exoesqueleto de los artrópodos y la pared celular de los hongos verdaderos."
                ),
                Challenge(
                    id = "bio_t04_s01_c2",
                    statement = "El almidón es la macromolécula de almacenamiento energético propia de las plantas. Bioquímicamente está integrado por dos polímeros de glucosa denominados:",
                    options = listOf(
                        "Glucógeno y celulosa",
                        "Amilosa (lineal helicoidal) y amilopectina (ramificada)",
                        "Sacarosa y maltosa condensadas",
                        "Quitina y peptidoglucano",
                        "Galactosa y fructosa fosforiladas"
                    ),
                    correctIndex = 1,
                    explanation = "El almidón vegetal está formado por amilosa (polímero no ramificado con enlaces α-1,4) y amilopectina (polímero ramificado con enlaces α-1,4 y bifurcaciones α-1,6)."
                ),
                Challenge(
                    id = "bio_t04_s01_c3",
                    statement = "Durante un ayuno de 12 horas, los niveles de glucosa en sangre se mantienen estables gracias a la degradación enzimática de un polisacárido muy ramificado almacenado en los hepatocitos humanos. Este polisacárido es el:",
                    options = listOf(
                        "Almidón hepático",
                        "Glucógeno",
                        "Ácido hialurónico",
                        "Colesterol libre",
                        "Sulfato de condroitina"
                    ),
                    correctIndex = 1,
                    explanation = "El glucógeno es el polisacárido de reserva animal almacenado en hígado y músculo esquelético. La glucogenólisis hepática libera glucosa a la sangre para mantener la glucemia en ayuno."
                ),
                Challenge(
                    id = "bio_t04_s01_c4",
                    statement = "La celulosa no puede ser aprovechada como nutriente calórico por el sistema digestivo humano debido a que nuestro tubo gastrointestinal carece de enzimas específicas capaces de hidrolizar los enlaces:",
                    options = listOf(
                        "Alfa-1,4 glucosídicos",
                        "Beta-1,4 glucosídicos",
                        "Alfa-1,6 ramificados",
                        "Éster intramoleculares",
                        "Peptídicos de tipo amida"
                    ),
                    correctIndex = 1,
                    explanation = "Las enzimas digestivas humanas (como la amilasa) solo reconocen e hidrolizan enlaces alfa glucosídicos. La celulosa posee enlaces beta-1,4 glucosídicos que resultan indigeribles, actuando como fibra vegetal."
                ),
                Challenge(
                    id = "bio_t04_s01_c5",
                    statement = "El azúcar transportado a través de los vasos floemáticos de las plantas vasculares desde las hojas fotosintéticas hasta los frutos y raíces es un disacárido no reductor formado por glucosa y fructosa denominado:",
                    options = listOf(
                        "Maltosa",
                        "Sacarosa",
                        "Lactosa",
                        "Celobiosa",
                        "Trehalosa"
                    ),
                    correctIndex = 1,
                    explanation = "La sacarosa es el disacárido formado por glucosa unida a fructosa mediante enlace dicarbonílico α-1,2; es el principal glúcido de transporte en la savia elaborada vegetal."
                ),
                Challenge(
                    id = "bio_t04_s01_c6",
                    statement = "La intolerancia a los lácteos que padecen muchos adultos se produce por la deficiencia intestinal de la enzima lactasa, la cual es responsable de hidrolizar el disacárido lactosa en:",
                    options = listOf(
                        "Dos moléculas de fructosa",
                        "Glucosa y galactosa",
                        "Dos moléculas de glucosa",
                        "Ribosa y desoxirribosa",
                        "Glucosa y manosa"
                    ),
                    correctIndex = 1,
                    explanation = "La lactosa es el disacárido de la leche formado por la condensación de una molécula de beta-D-galactosa y una de alfa-D-glucosa mediante enlace β-1,4 glucosídico."
                ),
                Challenge(
                    id = "bio_t04_s01_c7",
                    statement = "En el líquido seminal emitido por las vesículas seminales humanas, el monosacárido de tipo cetohexosa que proporciona energía motriz directa para el batido flagelar de los espermatozoides es la:",
                    options = listOf(
                        "Galactosa",
                        "Fructosa (levulosa)",
                        "Ribosa",
                        "Glucosa pura",
                        "Sacarosa"
                    ),
                    correctIndex = 1,
                    explanation = "La fructosa es una cetohexosa muy abundante en el semen, donde actúa como sustrato energético prioritario para el metabolismo mitocondrial y la movilidad del espermatozoide."
                ),
                Challenge(
                    id = "bio_t04_s01_c8",
                    statement = "¿Cuál es la diferencia química estructural precisa que distingue a la desoxirribosa presente en el ADN respecto a la ribosa presente en el ARN?",
                    options = listOf(
                        "La desoxirribosa posee 6 átomos de carbono y la ribosa solo 5",
                        "La desoxirribosa carece de un átomo de oxígeno en el carbono 2' del anillo",
                        "La ribosa es una cetosa y la desoxirribosa una aldosa",
                        "La desoxirribosa contiene un átomo de azufre en el carbono 3'",
                        "La ribosa no puede formar enlaces fosfodiéster"
                    ),
                    correctIndex = 1,
                    explanation = "La beta-D-desoxirribosa (C₅H₁₀O₄) posee un grupo -H en el carbono 2' de la pentosa en lugar del grupo hidroxilo (-OH) que presenta la beta-D-ribosa (C₅H₁₀O₅)."
                ),
                Challenge(
                    id = "bio_t04_s01_c9",
                    statement = "En el estroma de los cloroplastos, el monosacárido de tipo cetopentosa cuya forma difosforada capta el CO₂ atmosférico para iniciar el ciclo de Calvin-Benson es la:",
                    options = listOf(
                        "Ribulosa",
                        "Dihidroxiacetona",
                        "Gliceraldehído",
                        "Eritrosa",
                        "Xilulosa"
                    ),
                    correctIndex = 0,
                    explanation = "La ribulosa 1,5-bisfosfato (derivada de la ribulosa) es la molécula aceptora que fija el dióxido de carbono en la fotosíntesis bajo la catálisis de la enzima RuBisCO."
                ),
                Challenge(
                    id = "bio_t04_s01_c10",
                    statement = "La digestión intraluminal del almidón de la papa por acción de la amilasa salival y pancreática produce fragmentos disacáridos constituidos exclusivamente por dos moléculas de glucosa unidas por enlace α-1,4 denominados:",
                    options = listOf(
                        "Lactosa",
                        "Maltosa",
                        "Sacarosa",
                        "Isomaltosa pura",
                        "Quitobiosa"
                    ),
                    correctIndex = 1,
                    explanation = "La maltosa es el disacárido formado por dos unidades de glucosa unidas por enlace alfa-1,4, generado típicamente durante la hidrólisis digestiva de los polímeros de almidón."
                ),
                Challenge(
                    id = "bio_t04_s01_c11",
                    statement = "En el laboratorio escolar de biología, al verter unas gotas de reactivo de Lugol (yodo-yodurado) sobre una rebanada de papa, se aprecia una coloración azul-violácea oscura intensa. Esta tinción confirma la presencia de:",
                    options = listOf(
                        "Proteínas globulares desnaturalizadas",
                        "Amilosa dentro de los gránulos de almidón",
                        "Lípidos triglicéridos saponificados",
                        "Monosacáridos de fructosa libre",
                        "Ácidos nucleicos bicatenarios"
                    ),
                    correctIndex = 1,
                    explanation = "El yodo del reactivo de Lugol se introduce en el interior de la hélice de la amilosa del almidón vegetal, generando un complejo molecular que absorbe la luz dando un color azul-púrpura característico."
                ),
                Challenge(
                    id = "bio_t04_s01_c12",
                    statement = "En la hemolinfa de muchos artrópodos e insectos voladores, el principal glúcido circulante que actúa como reserva energética y protector contra la congelación es el disacárido:",
                    options = listOf(
                        "Sacarosa",
                        "Trehalosa",
                        "Lactosa",
                        "Fructosa",
                        "Celobiosa"
                    ),
                    correctIndex = 1,
                    explanation = "La trehalosa (Glucosa + Glucosa con enlace α-1,1) es el disacárido no reductor principal de la hemolinfa de los insectos, fundamental para el vuelo y la crioprotección."
                ),
                Challenge(
                    id = "bio_t04_s01_c13",
                    statement = "El enlace químico covalente característico mediante el cual se condensan dos monosacáridos con desprendimiento de una molécula de agua se denomina enlace:",
                    options = listOf(
                        "Peptídico",
                        "Glucosídico",
                        "Fosfodiéster",
                        "Éster",
                        "Puente disulfuro"
                    ),
                    correctIndex = 1,
                    explanation = "El enlace glucosídico es el enlace covalente formado por reacción de condensación que une el carbono anomérico de un monosacárido con un grupo alcohol de otro glúcido liberando H₂O."
                ),
                Challenge(
                    id = "bio_t04_s01_c14",
                    statement = "¿Cuál de las siguientes asociaciones entre glúcido y función biológica principal es rigurosamente CORRECTA?",
                    options = listOf(
                        "Glucosa: biocatalizador enzimático de membranas",
                        "Celulosa: componente estructural de la pared celular vegetal",
                        "Almidón: material genético en bacterias Gram positivas",
                        "Quitina: principal reserva de energía en los mamíferos",
                        "Glucógeno: hormona reguladora del crecimiento óseo"
                    ),
                    correctIndex = 1,
                    explanation = "La celulosa es el polisacárido estructural fibroso más abundante de la biosfera, conformando la pared celular rígida de plantas y algas verdes."
                )
            )
        ),
        LessonNode(
            id = "bio_t04_s02",
            subjectId = "biologia",
            semana = 4,
            subtema = "4.2",
            title = "Lípidos: Grasas, Fosfolípidos y Esteroides",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t04_s02",
                asignatura = "Biología",
                semana = 4,
                titulo = "Estructura, Clasificación y Funciones Biológicas de los Lípidos",
                resumen = """Biomoléculas hidrofóbicas que cumplen roles esenciales de reserva energética concentrada, arquitectura de membranas celulares y regulación endocrina.

                    # 4.2.1 — Propiedades Generales y Densidad Energética
                    - Grupo heterogéneo de biomoléculas compuestas principalmente por **Carbono (C), Hidrógeno (H) y escaso Oxígeno (O)**; algunas contienen además fósforo (P) y nitrógeno (N).
                    - **Insolubles en agua** (hidrofóbicas) y solubles en solventes orgánicos apolares (cloroformo, éter, benceno, acetona).
                    - **Máxima densidad energética:** Rinden **9.3 kcal/g**, más del doble que los glúcidos y proteínas (4.1 kcal/g). Esto se debe a su elevado estado de reducción química, con abundante cantidad de enlaces C-H ricos en electrones transferibles a la cadena respiratoria.
                    - **Enlace Éster:** Reacción de esterificación entre el grupo carboxilo (-COOH) de un ácido graso y el grupo hidroxilo (-OH) de un alcohol con desprendimiento de agua.

                    # 4.2.2 — Lípidos Saponificables (Poseen Ácidos Grasos)
                    Contienen ácidos grasos en su estructura y forman jabones por saponificación alcalina:
                    - **Ácidos Grasos:** Cadenas hidrocarbonadas con un grupo carboxilo terminal:
                      - *Saturados:* Solo enlaces simples C-C; cadenas lineales flexibles que empaquetan densamente; sólidos a temperatura ambiente (ej. ácido palmítico, esteárico; manteca, grasa animal).
                      - *Insaturados:* Uno o más dobles enlaces C=C en configuración *cis* que generan acodamientos en la cadena; no empaquetan fácilmente; líquidos a temperatura ambiente (aceites vegetales, ácido oleico, linoleico).
                    - **Acilglicéridos (Triglicéridos o Grasas Neutras):**
                      - Unión de **1 molécula de glicerol con 3 ácidos grasos** mediante 3 enlaces éster.
                      - Constituyen la **reserva calórica a largo plazo** más abundante del cuerpo, almacenados en los adipocitos del tejido adiposo blanco.
                      - Actúan como **aislante térmico** subcutáneo (conserva calor en mamíferos marinos y animales andinos) y amortiguador mecánico contra traumatismos en órganos vitales (riñones, corazón).
                    - **Fosfolípidos (Fosfoglicéridos):**
                      - Formados por 1 glicerol + 2 ácidos grasos + 1 grupo fosfato unido a un compuesto polar (como colina o etanolamina).
                      - Moléculas marcadamente **anfipáticas**: presentan una cabeza polar hidrofílica y dos colas apolares hidrofóbicas de ácidos grasos.
                      - En medio acuoso se autoensamblan formando la **bicapa lipídica**, matriz estructural básica y semipermeable de todas las membranas celulares y organelas.
                    - **Céridos (Ceras):**
                      - Unión de un ácido graso de cadena muy larga con un alcohol monohidroxílico de alto peso molecular.
                      - Fuertemente hidrofóbicos; función **impermeabilizante y protectora** contra la deshidratación y patógenos: cutina en hojas y frutos, cerumen en el conducto auditivo externo, cera de abejas y lanolina en la lana de ovejas.

                    # 4.2.3 — Lípidos Insaponificables (Sin Ácidos Grasos)
                    No contienen enlaces éster ni ácidos grasos:
                    - **Esteroides:**
                      - Derivan del hidrocarburo policíclico **ciclopentanoperhidrofenantreno** (núcleo esteroideo).
                      - *Colesterol:* Esteroide fundamental de las células animales. Se inserta entre los fosfolípidos de la membrana plasmática modulando su **fluidez y estabilidad mecánica** frente a variaciones de temperatura.
                      - Es molécula precursora de: **hormonas esteroideas** (testosterona, estrógenos, progesterona, cortisol y aldosterona), **ácidos biliares** (digestión de grasas) y **vitamina D**.
                      - *Nota de admisión:* El colesterol NO existe en células vegetales (poseen *fitosteroles*) ni en hongos (poseen *ergosterol*).
                    - **Terpenos o Isoprenoides:**
                      - Polímeros de unidades de isopreno. Comprenden las esencias vegetales volátiles (mentol, limoneno), pigmentos fotosintéticos accesorios (**carotenoides**, como carotenos y xantofilas) y vitaminas liposolubles (**A, E y K**).
                    - **Prostaglandinas (Eicosanoides):**
                      - Derivadas del ácido araquidónico (20C); median procesos inflamatorios, fiebre, dolor y agregación plaquetaria.
                """,
                conceptosClave = listOf(
                    "Triglicéridos: 1 glicerol + 3 ácidos grasos (reserva calórica: 9.3 kcal/g).",
                    "Fosfolípidos: anfipáticos (cabeza polar + 2 colas apolares) forman la bicapa celular.",
                    "Colesterol: esteroide que modula la fluidez de membrana animal y origina hormonas sexuales.",
                    "Vitaminas liposolubles: A, D, E, K (naturaleza lipídica)."
                ),
                admissionTip = "Regla mnemotécnica de admisión para lípidos: 'ADEK' son las vitaminas liposolubles. El colesterol NO está en plantas (tienen fitosteroles) ni en hongos (ergosterol).",
                admissionExplanation = "Diferenciar los lípidos saponificables (con enlaces éster y ácidos grasos) de los insaponificables (esteroides y terpenos) es un eje temático constante en el prospecto UNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s02_c1",
                    statement = "En la membrana plasmática de un leucocito humano, un lípido esteroideo derivado del ciclopentanoperhidrofenantreno se intercala entre los fosfolípidos regulando la fluidez membranosa y sirviendo además de precursor a la síntesis de testosterona y estrógenos. Dicho lípido es el:",
                    options = listOf(
                        "Ergosterol",
                        "Triglicérido neutro",
                        "Colesterol",
                        "Fitosterol",
                        "Ácido linolénico"
                    ),
                    correctIndex = 2,
                    explanation = "El colesterol es el esteroide modulador de fluidez característico de membranas animales y el precursor biosintético de las hormonas sexuales y la vitamina D."
                ),
                Challenge(
                    id = "bio_t04_s02_c2",
                    statement = "¿Cuál es el rendimiento calórico energético que aporta la combustión metabólica completa de 1 gramo de lípidos neutros en comparación con 1 gramo de glúcidos o proteínas?",
                    options = listOf(
                        "4.1 kcal/g frente a 9.3 kcal/g",
                        "9.3 kcal/g frente a 4.1 kcal/g",
                        "12.5 kcal/g frente a 1.2 kcal/g",
                        "Ambos aportan exactamente la misma cantidad calórica (4.1 kcal/g)",
                        "Los lípidos no aportan energía metabólica neta"
                    ),
                    correctIndex = 1,
                    explanation = "Los lípidos proporcionan 9.3 kcal/g debido a su mayor proporción de enlaces C-H reducidos, más del doble que los glúcidos y proteínas (4.1 kcal/g)."
                ),
                Challenge(
                    id = "bio_t04_s02_c3",
                    statement = "Las biomoléculas estructurales de la membrana celular que poseen un extremo polar hidrofílico (cabeza) y dos cadenas apolares hidrofóbicas (colas), confiriéndoles carácter anfipático para autoensamblarse en bicapa, son los:",
                    options = listOf(
                        "Céridos",
                        "Fosfolípidos",
                        "Triglicéridos simples",
                        "Carotenoides",
                        "Esteroides libres"
                    ),
                    correctIndex = 1,
                    explanation = "Los fosfolípidos son moléculas anfipáticas que en medio acuoso orientan sus cabezas polares hacia el agua y esconden sus colas apolares de ácidos grasos, conformando la bicapa lipídica."
                ),
                Challenge(
                    id = "bio_t04_s02_c4",
                    statement = "En el tejido adiposo subcutáneo de una foca o de una vicuña altoandina, las reservas energéticas que además actúan como un aislante térmico protector contra el frío extremo corresponden a moléculas de:",
                    options = listOf(
                        "Glucógeno muscular",
                        "Triglicéridos (triacilgliceroles)",
                        "Fosfatidilcolina",
                        "Colesterol libre",
                        "Celulosa insoluble"
                    ),
                    correctIndex = 1,
                    explanation = "Los triglicéridos son grasas neutras formadas por glicerol y tres ácidos grasos; se almacenan en los adipocitos brindando reserva calórica masiva y aislamiento térmico."
                ),
                Challenge(
                    id = "bio_t04_s02_c5",
                    statement = "La cutícula cerosa brillante que recubre la epidermis de las hojas de chirimoya o de molle, reduciendo la transpiración vegetal y protegiendo contra el ataque de hongos, pertenece al grupo lipídico de los:",
                    options = listOf(
                        "Fosfoglicéridos",
                        "Céridos (ceras)",
                        "Esteroides",
                        "Prostaglandinas",
                        "Glucolípidos"
                    ),
                    correctIndex = 1,
                    explanation = "Las ceras o céridos (como la cutina vegetal) son ésteres de ácidos grasos con alcoholes monohidroxílicos de cadena larga con función impermeabilizante y protectora."
                ),
                Challenge(
                    id = "bio_t04_s02_c6",
                    statement = "¿Cuál de los siguientes grupos reúne exclusivamente a vitaminas que son de naturaleza química lipídica (vitaminas liposolubles)?",
                    options = listOf(
                        "Vitaminas B₁, B₂, B₆ y B₁₂",
                        "Vitaminas A, D, E y K",
                        "Vitamina C y complejo B",
                        "Ácido fólico y biotina",
                        "Vitamina B₁₂ y ácido ascórbico"
                    ),
                    correctIndex = 1,
                    explanation = "Las vitaminas liposolubles son la A, D, E y K (nemotecnia ADEK); derivan de lípidos isoprenoides o esteroideos y se absorben conjuntamente con las grasas dietéticas."
                ),
                Challenge(
                    id = "bio_t04_s02_c7",
                    statement = "En la síntesis de un triglicérido, la unión covalente formada entre el grupo hidroxilo (-OH) del glicerol y el grupo carboxilo (-COOH) de un ácido graso con eliminación de agua se denomina enlace:",
                    options = listOf(
                        "Glucosídico",
                        "Éster",
                        "Peptídico",
                        "Fosfodiéster",
                        "Disulfuro"
                    ),
                    correctIndex = 1,
                    explanation = "El enlace éster se forma por esterificación entre un ácido graso y un alcohol (glicerol), liberando una molécula de H₂O por cada ácido graso enlazado."
                ),
                Challenge(
                    id = "bio_t04_s02_c8",
                    statement = "En la membrana plasmática de los hongos como las levaduras y mohos, el esteroide análogo funcional al colesterol animal que estabiliza su bicapa lipídica es el:",
                    options = listOf(
                        "Fitosterol",
                        "Ergosterol",
                        "Colesterol animal",
                        "Ácido cólico",
                        "Limoneno"
                    ),
                    correctIndex = 1,
                    explanation = "El ergosterol es el esteroide característico de las membranas fúngicas (blanco de fármacos antimicóticos), mientras que las plantas poseen fitosteroles y los animales colesterol."
                ),
                Challenge(
                    id = "bio_t04_s02_c9",
                    statement = "Los aceites vegetales como el de oliva o sacha inchi permanecen líquidos a temperatura ambiental porque sus ácidos grasos constituyentes son predominantemente:",
                    options = listOf(
                        "Saturados sin ningún doble enlace",
                        "Insaturados con dobles enlaces que acodan la cadena hidrocarbonada",
                        "Inorgánicos con enlaces iónicos",
                        "Completamente solubles en agua pura",
                        "Polímeros ramificados de glucosa"
                    ),
                    correctIndex = 1,
                    explanation = "Los ácidos grasos insaturados contienen dobles enlaces en configuración cis que introducen quiebres o acodos en la cadena, dificultando el empaquetamiento y reduciendo su punto de fusión (líquidos)."
                ),
                Challenge(
                    id = "bio_t04_s02_c10",
                    statement = "Las prostaglandinas son eicosanoides derivados de un ácido graso poliinsaturado de 20 carbonos denominado ácido araquidónico. Su función biológica cardinal radica en:",
                    options = listOf(
                        "Almacenar glucosa en el retículo sarcoplásmico",
                        "Actuar como mediadores locales de la respuesta inflamatoria, el dolor y la fiebre",
                        "Constituir el esmalte dental",
                        "Transportar oxígeno por el torrente sanguíneo",
                        "Fotolizar el agua durante la fotosíntesis"
                    ),
                    correctIndex = 1,
                    explanation = "Las prostaglandinas son lípidos mediadores químicos locales que intervienen decisivamente en la inflamación, la percepción del dolor, la fiebre y la contracción muscular lisa uterina."
                ),
                Challenge(
                    id = "bio_t04_s02_c11",
                    statement = "Los pigmentos accesorios fotosintéticos como los carotenos (color anaranjado) y xantofilas (amarillo), así como el precursor de la vitamina A (betacaroteno), pertenecen a la familia lipídica de los:",
                    options = listOf(
                        "Esteroides hormonales",
                        "Terpenos o isoprenoides",
                        "Fosfoglicéridos de membrana",
                        "Céridos cuticulares",
                        "Triglicéridos saturados"
                    ),
                    correctIndex = 1,
                    explanation = "Los carotenoides son terpenos formados por polimerización de unidades de isopreno, fundamentales en la absorción lumínica vegetal y como antioxidantes y precursores de la vitamina A."
                ),
                Challenge(
                    id = "bio_t04_s02_c12",
                    statement = "La solubilidad característica de los lípidos se define fisicoquímicamente por ser:",
                    options = listOf(
                        "Altamente solubles en solventes acuosos y polares",
                        "Insolubles en agua y solubles en disolventes orgánicos apolares como éter y cloroformo",
                        "Solubles únicamente en ácidos inorgánicos concentrados",
                        "Completamente insolubles en cualquier líquido existente",
                        "Solubles únicamente en soluciones salinas hipertónicas"
                    ),
                    correctIndex = 1,
                    explanation = "Por su naturaleza predominantemente hidrocarbonada y apolar, los lípidos repelen el agua (hidrofobia) y se disuelven fácilmente en solventes orgánicos apolares (benceno, éter, cloroformo)."
                ),
                Challenge(
                    id = "bio_t04_s02_c13",
                    statement = "¿Cuál de las siguientes afirmaciones respecto al colesterol es biológicamente VERDADERA?",
                    options = listOf(
                        "Es el lípido más abundante en la pared celular de las plantas leñosas",
                        "Está presente en membranas celulares animales y ausente en células vegetales",
                        "Es un lípido saponificable que contiene tres cadenas de ácidos grasos",
                        "Es la molécula precursora de la insulina y el glucagón pancreáticos",
                        "Aporta 4.1 kcal/g como combustible de respiración anaerobia"
                    ),
                    correctIndex = 1,
                    explanation = "El colesterol es exclusivo de las membranas celulares del reino animal. Las plantas carecen de colesterol (contienen fitosteroles) y las bacterias procariontes tampoco lo poseen."
                )
            )
        ),
        LessonNode(
            id = "bio_t04_s03",
            subjectId = "biologia",
            semana = 4,
            subtema = "4.3",
            title = "Proteínas y Cinética Enzimática",
            depth = LessonDepth.EXTENSIVE,
            theory = LessonTheory(
                id = "th_bio_t04_s03",
                asignatura = "Biología",
                semana = 4,
                titulo = "Estructura Proteica, Cinética y Regulación Enzimática",
                resumen = """Las proteínas son las macromoléculas ejecutoras más versátiles de la célula, actuando como biocatalizadores enzimáticos de máxima especificidad.

                    # 4.3.1 — Monómeros: Aminoácidos y Enlace Peptídico
                    - **Estructura del Aminoácido:** Molécula orgánica que contiene un carbono alfa (Cα) asimétrico unido a:
                      1. Un grupo amino básico (-NH₂).
                      2. Un grupo carboxilo ácido (-COOH).
                      3. Un átomo de hidrógeno (-H).
                      4. Una cadena lateral variable (grupo -R) que determina sus propiedades químicas (polar, apolar, ácido o básico).
                    - **Carácter Anfótero (Zwitterion):** Los aminoácidos pueden ionizarse y actuar como ácidos (cediendo H⁺) o como bases (captando H⁺) según el pH del medio, comportándose como amortiguadores de pH.
                    - **Enlace Peptídico:** Enlace covalente de tipo amida formado entre el carbono del grupo carboxilo (-COOH) de un aminoácido y el nitrógeno del grupo amino (-NH₂) del aminoácido contiguo, con liberación de una molécula de agua (reacción de condensación).
                      - Posee carácter parcial de doble enlace (rígido, coplanar y sin rotación libre), lo que condiciona la conformación de la cadena.

                    # 4.3.2 — Niveles de Organización Estructural de las Proteínas
                    1. **Estructura Primaria:**
                       - Secuencia lineal y ordenada de aminoácidos desde el extremo N-terminal al C-terminal.
                       - Determinada genéticamente por la secuencia de codones del ADN.
                       - Estabilizada exclusivamente por enlaces peptídicos covalentes.
                       - Condiciona todos los niveles tridimensionales superiores.
                    2. **Estructura Secundaria:**
                       - Plegamiento espacial local periódico de la cadena polipeptídica debido a **puentes de hidrógeno** establecidos entre los grupos -C=O y -N-H de los enlaces peptídicos del esqueleto.
                       - Dos conformaciones cardinales: **Alfa-hélice** (enrollamiento helicoidal dextrógiro; ej. queratina) y **Lámina beta-plegada** (cadenas extendidas en zigzag asociadas en paralelo o antiparalelo; ej. fibroína de la seda).
                    3. **Estructura Terciaria:**
                       - Conformación tridimensional definitiva y compacta de una sola cadena polipeptídica en el espacio (globular o fibrosa).
                       - Se estabiliza mediante diversas fuerzas entre las cadenas laterales (R):
                         - **Puentes disulfuro covalentes (-S-S-):** Formados por la oxidación de dos cisteínas contiguas (el enlace más fuerte de la estructura terciaria).
                         - Interacciones hidrofóbicas (agrupamiento de grupos R apolares en el interior de la molécula).
                         - Puentes de hidrógeno entre grupos R polares.
                         - Atracciones electrostáticas o puentes salinos entre cargas opuestas.
                       - **Conquista de la función biológica:** En este nivel la proteína adquiere su conformación nativa activa (ej. mioglobina, lisozima, enzimas monoméricas).
                    4. **Estructura Cuaternaria:**
                       - Unión coordinada de dos o más cadenas polipeptídicas independientes (llamadas subunidades o protómeros).
                       - Estabilizada por las mismas fuerzas que la estructura terciaria.
                       - Ejemplos emblemáticos: **Hemoglobina** (tetrámero con 2 subunidades alfa y 2 beta más 4 grupos hemo), anticuerpos (2 cadenas pesadas y 2 ligeras) y colágeno (triple hélice helicoidal).
                    5. **Desnaturalización Proteica:**
                       - Pérdida de la conformación espacial tridimensional nativa (ruptura de estructuras cuaternaria, terciaria y secundaria) provocada por agentes físicos (calor extremo, radiación) o químicos (pH extremos, solventes orgánicos, urea).
                       - Provoca la pérdida irreversible de la actividad biológica y la precipitación de la proteína.
                       - **Regla fija de admisión:** Los enlaces peptídicos covalentes NO se rompen durante la desnaturalización; por tanto, **la estructura primaria permanece totalmente intacta**.

                    # 4.3.3 — Clasificación Funcional de las Proteínas
                    - **Estructural:** Colágeno (tejido conectivo, tendones, huesos), queratina (pelos, uñas, cuernos), elastina.
                    - **Enzimática (Biocatalizadora):** Amilasa, pepsina, ADN polimerasa, catalasa.
                    - **Transporte:** Hemoglobina (O₂ en sangre de vertebrados), mioglobina (O₂ en músculo), hemocianina (invertebrados), albúmina (ácidos grasos).
                    - **Defensiva o Inmune:** Inmunoglobulinas (anticuerpos), trombina y fibrinógeno (coagulación).
                    - **Contráctil y Motora:** Actina y miosina (contracción muscular), dineína y cinesina (transporte vesicular y cilios).
                    - **Hormonal:** Insulina y glucagón (metabolismo hidrocarbonado), hormona del crecimiento (somatotropina).
                    - **Reserva:** Ovoalbúmina (clara de huevo), caseína (leche), gliadina (trigo).

                    # 4.3.4 — Cinética y Mecanismo Enzimático
                    - Las enzimas son biocatalizadores orgánicos (en su gran mayoría proteínas globulares, excepto ribozimas de ARN) que aceleran las reacciones químicas metabólicas hasta un millón de veces.
                    - **Modo de acción:** Disminuyen la **energía de activación (Ea)** requerida para alcanzar el estado de transición del reactivo, **sin modificar el balance energético neto (ΔG) ni la constante de equilibrio** de la reacción.
                    - **Sitio Activo:** Región tridimensional específica de la enzima donde se fija el sustrato mediante interacciones no covalentes débiles para catalizar la transformación en productos.
                    - **Modelos de interacción:**
                      - *Llave-cerradura (Emil Fischer):* Complementariedad geométrica rígida y preformada.
                      - *Ajuste Inducido (Daniel Koshland):* El sitio activo es flexible y se amolda tridimensionalmente al interactuar con el sustrato.
                    - **Estructura Holoenzimática:**
                      - *Apoenzima:* Fracción estrictamente proteica e inactiva por sí sola.
                      - *Cofactor:* Fracción no proteica indispensable para la actividad. Puede ser un ion inorgánico metálico (Mg²⁺, Zn²⁺, Fe²⁺, Cu²⁺) o una molécula orgánica termoestable denominada **coenzima** (muchas derivadas de vitaminas del complejo B, como NAD⁺, FAD o coenzima A).
                      - Holoenzima = Apoenzima + Cofactor/Coenzima (complejo catalíticamente activo).
                    - **Factores que Afectan la Velocidad Catalítica:**
                      - *Temperatura:* Cada enzima posee una temperatura óptima (en humanos ≈ 37 °C); el calor excesivo provoca su desnaturalización térmica.
                      - *pH óptimo:* Cada enzima opera a un pH característico (ej. pepsina gástrica óptima a pH 1.5 - 2; tripsina duodenal a pH 7.8 - 8.2).
                      - *Concentración de Sustrato:* A bajas concentraciones la velocidad es proporcional al sustrato; a altas concentraciones los sitios activos se saturan alcanzando la **velocidad máxima (Vmax)** (cinética de Michaelis-Menten).
                    - **Inhibición Enzimática:**
                      - *Inhibición Competitiva:* El inhibidor se parece estructuralmente al sustrato y compite directamente por ocupar el sitio activo. Se revierte aumentando la concentración del sustrato natural.
                      - *Inhibición No Competitiva:* El inhibidor se une a un sitio distinto al catalítico (sitio alostérico), provocando un cambio conformacional que desactiva el sitio activo sin importar la concentración de sustrato.
                """,
                conceptosClave = listOf(
                    "Aminoácidos unidos por enlace peptídico (covalente tipo amida).",
                    "Estructura 1ª (secuencia), 2ª (puentes H), 3ª (puentes disulfuro, activa), 4ª (varias cadenas).",
                    "Desnaturalización: se pierden estructuras 2ª, 3ª y 4ª; la estructura 1ª queda INTACTA.",
                    "Enzimas: disminuyen la energía de activación (Ea) sin alterar el equilibrio.",
                    "Holoenzima = Apoenzima (proteína) + Cofactor (ión) o Coenzima (vitamina B)."
                ),
                admissionTip = "Pregunta clásica: al sancochar un huevo o acidificar la leche para hacer queso, la proteína se desnaturaliza perdiendo su forma activa, pero los enlaces peptídicos NO se rompen (la estructura primaria se conserva intacta).",
                admissionExplanation = "Dominar la relación entre apoenzima, coenzima y holoenzima, junto con los tipos de inhibición competitiva vs no competitiva, otorga puntuación perfecta en preguntas complejas de biología celular."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s03_c1",
                    statement = "Al someter una solución acuosa de enzima catalasa a una temperatura de 80 °C durante diez minutos, se produce la pérdida total de su actividad catalítica por desnaturalización térmica. ¿Qué nivel de organización estructural de la proteína permanece inalterado tras este tratamiento?",
                    options = listOf(
                        "Estructura terciaria",
                        "Estructura secundaria",
                        "Estructura primaria",
                        "Estructura cuaternaria",
                        "Sitio activo nativo"
                    ),
                    correctIndex = 2,
                    explanation = "La desnaturalización desorganiza los puentes de hidrógeno, interacciones hidrofóbicas y puentes disulfuro (estructuras 2ª, 3ª y 4ª), pero no rompe los enlaces peptídicos covalentes; por tanto, la estructura primaria (secuencia de aminoácidos) permanece intacta."
                ),
                Challenge(
                    id = "bio_t04_s03_c2",
                    statement = "El enlace químico covalente que une monómeros consecutivos en una cadena polipeptídica se establece entre el grupo carboxilo de un aminoácido y el grupo amino del siguiente, conociéndose como enlace:",
                    options = listOf(
                        "Glucosídico",
                        "Peptídico",
                        "Fosfodiéster",
                        "Éster",
                        "Puente de hidrógeno"
                    ),
                    correctIndex = 1,
                    explanation = "El enlace peptídico es una unión covalente de tipo amida formada por reacción de condensación entre el grupo carboxilo (-COOH) y el grupo amino (-NH₂) de dos aminoácidos con pérdida de agua."
                ),
                Challenge(
                    id = "bio_t04_s03_c3",
                    statement = "En la estructura terciaria de una proteína globular como la mioglobina o la ribonucleasa, el enlace covalente más fuerte que une covalentemente dos cadenas laterales distantes en la molécula es el:",
                    options = listOf(
                        "Puente de hidrógeno",
                        "Puente disulfuro (-S-S-) entre dos cisteínas",
                        "Enlace hidrofóbico apolar",
                        "Atracción electrostática salina",
                        "Enlace glucosídico terminal"
                    ),
                    correctIndex = 1,
                    explanation = "Los puentes disulfuro covalentes se forman por la oxidación de los grupos sulfhidrilo (-SH) de dos residuos de cisteína, aportando una enorme estabilidad mecánica a la estructura terciaria."
                ),
                Challenge(
                    id = "bio_t04_s03_c4",
                    statement = "La molécula de hemoglobina humana funcional está integrada por cuatro cadenas polipeptídicas independientes (dos globinas alfa y dos beta), asociadas a cuatro grupos prostéticos hemo. Esta disposición espacial corresponde a la estructura:",
                    options = listOf(
                        "Primaria",
                        "Secundaria",
                        "Terciaria",
                        "Cuaternaria",
                        "Desnaturalizada"
                    ),
                    correctIndex = 3,
                    explanation = "La estructura cuaternaria describe la unión y coordinación no covalente de dos o más cadenas polipeptídicas individuales (subunidades) en una macromolécula proteica funcional."
                ),
                Challenge(
                    id = "bio_t04_s03_c5",
                    statement = "Las conformaciones espaciales en alfa-hélice y lámina beta-plegada corresponden al nivel de organización proteica denominado estructura secundaria, la cual se mantiene estabilizada primordialmente por:",
                    options = listOf(
                        "Enlaces peptídicos adicionales entre cadenas laterales",
                        "Puentes de hidrógeno entre los grupos C=O y N-H del esqueleto peptídico",
                        "Enlaces iónicos con cationes calcio",
                        "Puentes disulfuro entre residuos de metionina",
                        "Interacciones hidrofóbicas con el colesterol circundante"
                    ),
                    correctIndex = 1,
                    explanation = "La estructura secundaria surge por la formación regular y periódica de puentes de hidrógeno entre los grupos carbonilo (C=O) y amino (N-H) de los enlaces peptídicos de la cadena."
                ),
                Challenge(
                    id = "bio_t04_s03_c6",
                    statement = "¿Cuál es el mecanismo bioenergético fundamental mediante el cual las enzimas aceleran la velocidad de las reacciones metabólicas en los seres vivos?",
                    options = listOf(
                        "Aumentar el calor interno de la célula hasta 60 °C",
                        "Disminuir la energía de activación necesaria para que los reactivos alcancen el estado de transición",
                        "Modificar el balance energético libre neto (ΔG) de la reacción haciéndolo espontáneo",
                        "Desplazar la constante de equilibrio químico hacia la destrucción de sustratos",
                        "Consumirse en cantidades molares equivalentes al sustrato"
                    ),
                    correctIndex = 1,
                    explanation = "Las enzimas catalizan reacciones reduciendo la barrera de la energía de activación (Ea), permitiendo que un mayor porcentaje de moléculas sustrato alcancen el estado de transición rápidamente sin alterar el ΔG."
                ),
                Challenge(
                    id = "bio_t04_s03_c7",
                    statement = "El modelo biocatalítico propuesto por Daniel Koshland, el cual postula que el sitio activo de una enzima no es una cavidad preformada y rígida, sino que sufre un cambio conformacional complementario al fijar al sustrato, se denomina:",
                    options = listOf(
                        "Modelo de la llave y cerradura de Fischer",
                        "Modelo del ajuste inducido",
                        "Modelo de la hipótesis quimiosmótica",
                        "Modelo del mosaico fluido",
                        "Modelo del operón bacteriano"
                    ),
                    correctIndex = 1,
                    explanation = "El modelo del ajuste inducido de Koshland demuestra que la interacción inicial del sustrato induce una modificación conformacional plástica y específica en el sitio activo de la enzima para maximizar la catálisis."
                ),
                Challenge(
                    id = "bio_t04_s03_c8",
                    statement = "Una enzima conjugada completa y catalíticamente activa constituida por la asociación coordinada de su fracción proteica con una molécula orgánica derivada de vitaminas recibe el nombre de:",
                    options = listOf(
                        "Apoenzima",
                        "Cofactor metálico",
                        "Holoenzima",
                        "Cimógeno inactivo",
                        "Ribozima de transferencia"
                    ),
                    correctIndex = 2,
                    explanation = "La holoenzima es el complejo enzimático funcional completo formado por la unión de la apoenzima (fracción proteica) con su coenzima o cofactor no proteico."
                ),
                Challenge(
                    id = "bio_t04_s03_c9",
                    statement = "En la inhibición enzimática competitiva, una molécula extraña con similitud estructural al sustrato se une al sitio activo impidiendo la catálisis. Este tipo de inhibición se puede revertir experimentalmente mediante:",
                    options = listOf(
                        "La elevación de la temperatura por encima de 90 °C",
                        "El aumento sustancial en la concentración del sustrato natural",
                        "La acidificación drástica del medio con ácido nítrico",
                        "La adición de detergentes catiónicos",
                        "La eliminación total de la apoenzima"
                    ),
                    correctIndex = 1,
                    explanation = "Al competir por el mismo sitio activo, si se incrementa de forma notable la concentración del sustrato natural, la probabilidad de que el sustrato desplace al inhibidor aumenta hasta restaurar la Vmax."
                ),
                Challenge(
                    id = "bio_t04_s03_c10",
                    statement = "Un inhibidor que se une a un sitio regulador distinto del sitio activo (sitio alostérico), provocando una deformación tridimensional de la enzima que impide la formación de productos sin que importe cuánto sustrato se añada, es un inhibidor:",
                    options = listOf(
                        "Competitivo puro",
                        "No competitivo",
                        "Sustitutivo reversible",
                        "Anfipático simple",
                        "Holoproteico"
                    ),
                    correctIndex = 1,
                    explanation = "En la inhibición no competitiva, el inhibidor se fija a un sitio alostérico independiente, alterando la actividad catalítica sin que el incremento de sustrato pueda revertir el bloqueo."
                ),
                Challenge(
                    id = "bio_t04_s03_c11",
                    statement = "La proteína más abundante en el organismo de los mamíferos, de conformación fibrosa en triple hélice, que confiere resistencia a la tracción mecánica en tendones, cartílagos, córnea y tejido óseo es el:",
                    options = listOf(
                        "Colágeno",
                        "Queratina",
                        "Albúmina",
                        "Histona nuclear",
                        "Fibrinógeno"
                    ),
                    correctIndex = 0,
                    explanation = "El colágeno representa cerca del 25-30% de toda la masa proteica corporal de un mamífero, formando fibras de colosal resistencia tensil en la matriz extracelular conectiva."
                ),
                Challenge(
                    id = "bio_t04_s03_c12",
                    statement = "La proteína estructural insoluble, rica en aminoácidos azufrados como cisteína con múltiples puentes disulfuro, que constituye el componente primario del estrato córneo epidérmico, uñas, pelos y plumas es la:",
                    options = listOf(
                        "Elastina",
                        "Queratina",
                        "Insulina",
                        "Caseína",
                        "Hemocianina"
                    ),
                    correctIndex = 1,
                    explanation = "La queratina es una proteína fibrosa con abundante contenido de cisteína y puentes disulfuro, otorgando dureza e impermeabilidad a las estructuras tegumentarias de vertebrados."
                ),
                Challenge(
                    id = "bio_t04_s03_c13",
                    statement = "Las proteínas plasmáticas globulares con forma de 'Y' producidas por las células plasmáticas (linfocitos B activados) para reconocer y neutralizar antígenos invasores de bacterias y virus son:",
                    options = listOf(
                        "Albúminas osmolares",
                        "Inmunoglobulinas o anticuerpos",
                        "Enzimas amilasas",
                        "Actinas filamentosas",
                        "Miosinas de transporte"
                    ),
                    correctIndex = 1,
                    explanation = "Las inmunoglobulinas (anticuerpos) son glicoproteínas defensivas del sistema inmunitario humoral encargadas de unirse específicamente a los epítopos antigénicos de patógenos."
                ),
                Challenge(
                    id = "bio_t04_s03_c14",
                    statement = "La hormona peptídica secretada por las células beta de los islotes de Langerhans pancreáticos, cuya función es inducir la captación celular de glucosa para disminuir la glucemia, es la:",
                    options = listOf(
                        "Glucagón",
                        "Insulina",
                        "Somatostatina",
                        "Tiroxina",
                        "Adrenalina"
                    ),
                    correctIndex = 1,
                    explanation = "La insulina es una proteína hormonal compuesta por dos cadenas polipeptídicas unidas por puentes disulfuro, con potente acción hipoglucemiante y anabólica."
                ),
                Challenge(
                    id = "bio_t04_s03_c15",
                    statement = "En el sarcómero de las fibras musculares esqueléticas, la contracción y acortamiento celular dependen de la interacción mecánica y deslizamiento coordinado entre dos proteínas motoras denominadas:",
                    options = listOf(
                        "Queratina y colágeno",
                        "Actina y miosina",
                        "Tubulina y dineína",
                        "Histona y ribonucleasa",
                        "Caseína y ovoalbúmina"
                    ),
                    correctIndex = 1,
                    explanation = "La actina (filamentos delgados) y la miosina (filamentos gruesos con cabezas motoras con actividad ATPasa) interactúan cíclicamente para producir la contracción del músculo esquelético y cardíaco."
                ),
                Challenge(
                    id = "bio_t04_s03_c16",
                    statement = "Si se gráfica la velocidad de una reacción enzimática humana frente a la temperatura desde 0 °C hasta 80 °C, se observa una curva acampanada con una velocidad óptima cercana a los 37 °C y una caída abrupta a cero hacia los 60 °C debida a:",
                    options = listOf(
                        "La evaporación instantánea del sustrato",
                        "La desnaturalización térmica irreversible de la enzima",
                        "La conversión de la enzima en una molécula de ADN",
                        "La disociación del agua en átomos de hidrógeno gaseoso",
                        "La saturación infinita de los sitios alostéricos"
                    ),
                    correctIndex = 1,
                    explanation = "A temperaturas por encima del óptimo fisiológico, el aumento de energía cinética desordena y rompe las interacciones débiles que sostienen la conformación nativa de la enzima, provocando su desnaturalización."
                ),
                Challenge(
                    id = "bio_t04_s03_c17",
                    statement = "La enzima proteolítica pepsina opera con máxima velocidad catalítica en el estómago a un pH sumamente ácido de 1.5 a 2.0; si el quimo pasa al duodeno donde el pH se neutraliza a 8.0, la pepsina:",
                    options = listOf(
                        "Multiplica por diez su velocidad de degradación proteica",
                        "Pierde su conformación activa e inactiva su catálisis por alteración de las cargas iónicas de su sitio activo",
                        "Comienza a sintetizar glucosa de forma espontánea",
                        "Se transforma en bilis hepática alcalina",
                        "Provoca la evaporación del jugo entérico"
                    ),
                    correctIndex = 1,
                    explanation = "Cada enzima posee un pH óptimo específico. La pepsina requiere un medio fuertemente ácido; al pasar a un medio alcalino, los grupos ionizables del sitio activo se desprotonan, perdiendo su actividad catalítica."
                ),
                Challenge(
                    id = "bio_t04_s03_c18",
                    statement = "Los aminoácidos se definen químicamente como sustancias anfóteras debido a que en solución acuosa pueden comportarse:",
                    options = listOf(
                        "Exclusivamente como solventes hidrofóbicos",
                        "Como ácidos cediendo protones o como bases aceptando protones según el pH del medio",
                        "Únicamente como oxidantes de metales pesados",
                        "Como gases nobles incapaces de interactuar",
                        "Exclusivamente como moléculas con carga eléctrica negativa"
                    ),
                    correctIndex = 1,
                    explanation = "Al poseer simultáneamente un grupo ácido carboxilo (-COOH) y un grupo básico amino (-NH₂), los aminoácidos pueden ceder o captar protones según el pH del medio, confiriéndoles carácter anfótero."
                ),
                Challenge(
                    id = "bio_t04_s03_c19",
                    statement = "En un ensayo cinético in vitro, al aumentar progresivamente la concentración de sustrato, se alcanza un punto en el que la velocidad de reacción no aumenta más y permanece constante. Este fenómeno cinético se explica porque:",
                    options = listOf(
                        "La enzima se ha destruido completamente por fricción molecular",
                        "Todos los sitios activos de las enzimas presentes en la solución se encuentran saturados con sustrato (Vmax)",
                        "El sustrato se transforma en un inhibidor no competitivo irreversible",
                        "Los puentes disulfuro se convierten en enlaces peptídicos",
                        "El agua de la solución ha alcanzado su punto de ebullición"
                    ),
                    correctIndex = 1,
                    explanation = "La cinética de saturación (curva hiperbólica de Michaelis-Menten) demuestra que cuando todas las moléculas de enzima tienen sus sitios activos ocupados por sustrato, se alcanza la velocidad máxima (Vmax)."
                )
            )
        ),
        LessonNode(
            id = "bio_t04_s04",
            subjectId = "biologia",
            semana = 4,
            subtema = "4.4",
            title = "Ácidos Nucleicos: ADN y ARN",
            depth = LessonDepth.EXTENSIVE,
            theory = LessonTheory(
                id = "th_bio_t04_s04",
                asignatura = "Biología",
                semana = 4,
                titulo = "Bases Moleculares de la Herencia: ADN, ARN y Expresión Génica",
                resumen = """Polímeros de nucleótidos que almacenan, transmiten y expresan la información biológica universal en todos los seres vivos.

                    # 4.4.1 — Estructura del Nucleótido y Enlace Fosfodiéster
                    - Los ácidos nucleicos son macromoléculas biológicas formadas por la polimerización de monómeros llamados **nucleótidos**.
                    - Cada nucleótido está constituido por tres componentes moleculares:
                      1. **Base Nitrogenada:**
                         - *Bases Púricas (Purinas):* Poseen dos anillos heterocíclicos fusionados: **Adenina (A) y Guanina (G)** (nemotecnia: 'Agua Pura'). Presentes en ADN y ARN.
                         - *Bases Pirimídicas (Pirimidinas):* Poseen un solo anillo heterocíclico: **Citosina (C)** (en ADN y ARN), **Timina (T)** (exclusiva del ADN) y **Uracilo (U)** (exclusivo del ARN).
                      2. **Pentosa (Glúcido de 5 Carbonos):**
                         - *Beta-D-desoxirribosa:* En el ADN (carece de oxígeno en el C2').
                         - *Beta-D-ribosa:* En el ARN (posee grupo -OH en el C2').
                      3. **Grupo Fosfato (Ácido fosfórico, H₃PO₄):**
                         - Unido al carbono 5' de la pentosa mediante enlace éster fosfórico.
                         - Confiere la acidez y la **fuerte carga eléctrica negativa** a los ácidos nucleicos.
                    - **Diferencia entre Nucleósido y Nucleótido:**
                      - *Nucleósido:* Base nitrogenada + Pentosa (unidas por enlace N-glucosídico).
                      - *Nucleótido:* Nucleósido + Grupo Fosfato (Base + Azúcar + Fosfato).
                    - **Enlace Fosfodiéster:**
                      - Enlace covalente que une nucleótidos sucesivos en una cadena polinucleotídica.
                      - Se establece entre el grupo hidroxilo (-OH) del carbono 3' de la pentosa de un nucleótido y el grupo fosfato unido al carbono 5' de la pentosa del siguiente nucleótido.
                      - Confiere dirección y polaridad a la cadena: **sentido 5' → 3'**.

                    # 4.4.2 — Ácido Desoxirribonucleico (ADN)
                    - Modelo de la Doble Hélice (James Watson y Francis Crick, 1953, fundamentado en las imágenes de difracción de rayos X de Rosalind Franklin):
                      - Es una **doble hélice bicatenaria** (dos cadenas polinucleotídicas enrolladas alrededor de un eje común).
                      - **Antiparalela:** Una cadena discurre en sentido **5' → 3'** y la cadena complementaria en sentido **3' → 5'**.
                      - **Complementaria:** Las bases nitrogenadas quedan orientadas hacia el interior de la hélice enfrentándose mediante puentes de hidrógeno específicos:
                        - **Adenina se une con Timina** mediante **2 puentes de hidrógeno** (A = T).
                        - **Guanina se une con Citosina** mediante **3 puentes de hidrógeno** (G ≡ C).
                    - **Leyes de Chargaff (1950):**
                      - En toda molécula de ADN bicatenario, la concentración de purinas iguala a la de pirimidinas:
                        **%A = %T**  y  **%G = %C**
                        **(%A + %G) = (%T + %C) = 50%**
                      - Ejemplo de examen: Si un ADN presenta 30% de Adenina, forzosamente tiene 30% de Timina (suman 60%); el 40% restante se reparte por igual en 20% de Guanina y 20% de Citosina.
                    - **Estabilidad Térmica del ADN (Tm):**
                      - Debido a que el par G ≡ C posee 3 puentes de hidrógeno frente a los 2 del par A = T, los fragmentos de ADN con alto contenido de G y C requieren mayor temperatura para separarse térmicamente (mayor punto de fusión o Tm).

                    # 4.4.3 — Ácido Ribonucleico (ARN)
                    - Generalmente **monocatenario** (constituido por una sola cadena de polirribonucleótidos), con **ribosa** como pentosa y **uracilo** en lugar de timina.
                    - **Tipos Principales de ARN:**
                      1. **ARN Mensajero (ARNm, ≈ 3-5%):**
                         - Sintetizado en el núcleo tomando como molde una de las cadenas del ADN durante la transcripción.
                         - Es una cadena lineal que transporta la información genética codificada en tripletes de bases denominados **codones** desde el ADN nuclear hacia los ribosomas en el citoplasma.
                      2. **ARN de Transferencia (ARNt, ≈ 10-15%):**
                         - Molécula adaptadora pequeña con forma característica de 'hoja de trébol' (por apareamientos intracatenarios) y estructura terciaria en 'L'.
                         - Posee en un extremo un triplete de bases específico denominado **anticodón**, que se aparea de forma complementaria con el codón del ARNm.
                         - En su extremo 3' libre terminal (con la secuencia CCA) transporta covalentemente unido el aminoácido correspondiente para incorporarlo a la proteína en formación.
                      3. **ARN Ribosómico (ARNr, ≈ 80-85%):**
                         - El más abundante de la célula. Se ensambla con proteínas en el nucléolo formando las subunidades ribosómicas menor y mayor.
                         - Ejerce actividad de **ribozima (peptidil transferasa)**: cataliza la formación del enlace peptídico entre aminoácidos durante la traducción.

                    # 4.4.4 — Dogma Central de la Biología Molecular y Localización
                    - Flujo de la información genética:
                      **ADN (Replicación) → ARNm (Transcripción) → Proteína (Traducción)**.
                    - Excepciones: La **transcripción inversa o retrotranscripción** (ARN → ADN bicatenario), catalizada por la enzima transcriptasa inversa en retrovirus como el VIH.
                    - **Localización celular del ADN:** En células eucariotas se encuentra en el núcleo celular (asociado a histonas formando cromatina) y en el interior de mitocondrias y cloroplastos (ADN circular y desnudo de origen endosimbiótico).
                """,
                conceptosClave = listOf(
                    "Nucleótido = base nitrogenada + pentosa + grupo fosfato; unidos por enlace fosfodiéster 3'-5'.",
                    "ADN: bicatenario, antiparalelo (5'→3' y 3'→5'), complementario (A=T 2 puentes; G≡C 3 puentes).",
                    "Regla de Chargaff: %A = %T y %G = %C.",
                    "ARN: monocatenario, ribosa + uracilo; ARNm (codones), ARNt (anticodón), ARNr (ribosomas)."
                ),
                admissionTip = "Ejercicio numérico fijo en UNSA: 'Si una molécula de ADN bicatenario tiene 22% de Citosina, ¿cuál es el porcentaje de Adenina?' Solución: C = 22%, por tanto G = 22% (suman 44%). Queda 56% para A+T, por lo que A = 28% y T = 28%.",
                admissionExplanation = "Comprender que el par G≡C posee 3 puentes de hidrógeno explica por qué regiones genómicas ricas en Guanina y Citosina resisten temperaturas de desnaturalización más elevadas."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t04_s04_c1",
                    statement = "En un análisis molecular de una muestra de ADN bicatenario extraído de hepatocitos de alpaca, se determina que el 28% de las bases nitrogenadas corresponde a Adenina. Aplicando las leyes de Chargaff, ¿cuál es el porcentaje esperado de Guanina en dicha muestra?",
                    options = listOf(
                        "28%",
                        "22%",
                        "44%",
                        "36%",
                        "14%"
                    ),
                    correctIndex = 1,
                    explanation = "Por la regla de Chargaff: %A = %T = 28% (suman 56%). El 44% restante corresponde por igual al par G-C; por ende, %G = 44% / 2 = 22%."
                ),
                Challenge(
                    id = "bio_t04_s04_c2",
                    statement = "Dos muestras de ADN bicatenario de la misma longitud son sometidas a calor para separar sus cadenas (desnaturalización térmica). La muestra 1 posee 70% de pares G-C, mientras que la muestra 2 posee 70% de pares A-T. La muestra 1 requiere mayor temperatura de desnaturalización (Tm) porque:",
                    options = listOf(
                        "Las purinas tienen mayor peso molecular que las pirimidinas",
                        "Los pares G-C se encuentran unidos por tres puentes de hidrógeno, confiriendo mayor estabilidad que los pares A-T que tienen dos",
                        "La muestra 1 contiene enlaces peptídicos intercatenarios",
                        "La muestra 2 carece por completo de enlaces fosfodiéster",
                        "La timina es más hidrofílica que la citosina"
                    ),
                    correctIndex = 1,
                    explanation = "El apareamiento entre Guanina y Citosina se estabiliza mediante 3 puentes de hidrógeno intercatenarios, mientras que Adenina y Timina solo forman 2. Por ello, a mayor contenido de G-C, mayor temperatura de fusión (Tm)."
                ),
                Challenge(
                    id = "bio_t04_s04_c3",
                    statement = "En el modelo clásico de la doble hélice del ADN propuesto por Watson y Crick, el término 'antiparalela' significa que:",
                    options = listOf(
                        "Una cadena es de ARN y la otra es de ADN",
                        "Las dos cadenas polinucleotídicas corren en direcciones opuestas: una en sentido 5' → 3' y la otra en sentido 3' → 5'",
                        "Las bases nitrogenadas se ubican en el exterior y los azúcares en el centro",
                        "Ambas cadenas presentan exactamente la misma secuencia de nucleótidos",
                        "Una cadena gira hacia la derecha y la otra hacia la izquierda"
                    ),
                    correctIndex = 1,
                    explanation = "El antiparalelismo define que las dos hebras de la doble hélice tienen polaridad química opuesta: el extremo 5' fosfato libre de una cadena se enfrenta al extremo 3' hidroxilo libre de la hebra complementaria."
                ),
                Challenge(
                    id = "bio_t04_s04_c4",
                    statement = "¿Cuáles son los tres componentes químicos fundamentales que constituyen la unidad monomérica de los ácidos nucleicos denominada nucleótido?",
                    options = listOf(
                        "Aminoácido, ácido graso y fosfato",
                        "Base nitrogenada, pentosa (azúcar de 5C) y grupo fosfato",
                        "Glucosa, glicerol y nitrógeno",
                        "Ribosa, colesterol y purina",
                        "Grupo amino, carbono alfa y grupo carboxilo"
                    ),
                    correctIndex = 1,
                    explanation = "Un nucleótido completo consta de una base nitrogenada (púrica o pirimídica), un azúcar de cinco carbonos (pentosa: ribosa o desoxirribosa) y un grupo fosfato (ácido fosfórico)."
                ),
                Challenge(
                    id = "bio_t04_s04_c5",
                    statement = "A nivel de la pentosa, la desoxirribosa del ADN se diferencia fundamentalmente de la ribosa del ARN en que la desoxirribosa:",
                    options = listOf(
                        "Tiene seis átomos de carbono en lugar de cinco",
                        "Carece de un átomo de oxígeno en el carbono 2' del anillo",
                        "Es una cetohexosa fosforilada",
                        "Posee dos grupos carboxilo en el carbono 5'",
                        "No puede formar enlaces con bases nitrogenadas"
                    ),
                    correctIndex = 1,
                    explanation = "La desoxirribosa (C₅H₁₀O₄) carece de un átomo de oxígeno en la posición 2' (posee -H), a diferencia de la ribosa (C₅H₁₀O₅) que posee un grupo hidroxilo (-OH) en el carbono 2'."
                ),
                Challenge(
                    id = "bio_t04_s04_c6",
                    statement = "¿Cuál de las siguientes alternativas agrupa con exactitud a las dos bases nitrogenadas de estructura bicíclica púrica presentes en los ácidos nucleicos?",
                    options = listOf(
                        "Timina y Citosina",
                        "Adenina y Guanina",
                        "Uracilo y Adenina",
                        "Citosina y Guanina",
                        "Timina y Uracilo"
                    ),
                    correctIndex = 1,
                    explanation = "Las bases púricas (purinas) derivan del anillo doble de purina y son la Adenina (A) y la Guanina (G). La Citosina, Timina y Uracilo son pirimidinas de anillo simple."
                ),
                Challenge(
                    id = "bio_t04_s04_c7",
                    statement = "En la composición de los ácidos nucleicos, la base nitrogenada que se encuentra de forma EXCLUSIVA en la molécula de ADN y que está ausente en el ARN es la:",
                    options = listOf(
                        "Adenina",
                        "Timina",
                        "Uracilo",
                        "Guanina",
                        "Citosina"
                    ),
                    correctIndex = 1,
                    explanation = "La Timina (T) es la pirimidina exclusiva del ADN. En el ARN es reemplazada por el Uracilo (U)."
                ),
                Challenge(
                    id = "bio_t04_s04_c8",
                    statement = "El enlace químico covalente que encadena a los nucleótidos sucesivos para formar una hebra lineal de ácido nucleico, uniendo el carbono 3' de una pentosa con el carbono 5' de la siguiente, se denomina:",
                    options = listOf(
                        "Enlace peptídico",
                        "Enlace fosfodiéster",
                        "Enlace glucosídico",
                        "Puente disulfuro",
                        "Puente de hidrógeno"
                    ),
                    correctIndex = 1,
                    explanation = "El enlace fosfodiéster une el grupo hidroxilo (-OH) del carbono 3' de un azúcar con el grupo fosfato del carbono 5' del nucleótido contiguo, construyendo el esqueleto azúcar-fosfato."
                ),
                Challenge(
                    id = "bio_t04_s04_c9",
                    statement = "La molécula de ARN que se encarga de copiar la secuencia de información de un gen nuclear y transportarla en forma de codones hacia el citoplasma para su lectura en el ribosoma es el:",
                    options = listOf(
                        "ARN ribosomal (ARNr)",
                        "ARN mensajero (ARNm)",
                        "ARN de transferencia (ARNt)",
                        "ARN interferente pequeño",
                        "ARN cebador o primer"
                    ),
                    correctIndex = 1,
                    explanation = "El ARN mensajero (ARNm) lleva la copia del mensaje codificado en codones desde el ADN del núcleo hasta los ribosomas en el citoplasma para la traducción."
                ),
                Challenge(
                    id = "bio_t04_s04_c10",
                    statement = "El ARN de transferencia (ARNt) presenta una conformación espacial en hoja de trébol donde destaca un triplete de bases nitrogenadas que reconoce complementariamente al codón del ARNm denominado:",
                    options = listOf(
                        "Cistrón",
                        "Anticodón",
                        "Promotor génico",
                        "Intrón",
                        "TATA box"
                    ),
                    correctIndex = 1,
                    explanation = "El anticodón es el triplete de bases ubicado en el asa central del ARNt que se aparea de forma complementaria y antiparalela con el codón del ARNm durante la síntesis proteica."
                ),
                Challenge(
                    id = "bio_t04_s04_c11",
                    statement = "El tipo de ARN más abundante en la célula viva (representando más del 80% del ARN celular total), que además ejerce actividad catalítica de ribozima (peptidil transferasa) uniendo aminoácidos, es el:",
                    options = listOf(
                        "ARN mensajero",
                        "ARN ribosómico (ARNr)",
                        "ARN de transferencia",
                        "ARN nuclear pequeño",
                        "ADN plasmídico"
                    ),
                    correctIndex = 1,
                    explanation = "El ARN ribosómico (ARNr) es el más abundante de la célula; integra la arquitectura de los ribosomas y cataliza la formación del enlace peptídico mediante su actividad ribozima."
                ),
                Challenge(
                    id = "bio_t04_s04_c12",
                    statement = "En la complementariedad de bases de la molécula de ADN bicatenario, ¿cuántos puentes de hidrógeno se establecen respectivamente entre los pares Adenina-Timina y Guanina-Citosina?",
                    options = listOf(
                        "A-T: 3 puentes; G-C: 2 puentes",
                        "A-T: 2 puentes; G-C: 3 puentes",
                        "A-T: 1 puente; G-C: 4 puentes",
                        "A-T: 4 puentes; G-C: 1 puente",
                        "Ambos pares forman exactamente 2 puentes"
                    ),
                    correctIndex = 1,
                    explanation = "La Adenina se une a la Timina mediante 2 puentes de hidrógeno (A=T), mientras que la Guanina se une a la Citosina mediante 3 puentes de hidrógeno (G≡C)."
                ),
                Challenge(
                    id = "bio_t04_s04_c13",
                    statement = "Una molécula constituida exclusivamente por la unión de una base nitrogenada con una pentosa mediante enlace N-glucosídico, carente del grupo fosfato, se clasifica bioquímicamente como un:",
                    options = listOf(
                        "Nucleótido",
                        "Nucleósido",
                        "Polinucleótido",
                        "Codón",
                        "Oligopéptido"
                    ),
                    correctIndex = 1,
                    explanation = "Un nucleósido está formado únicamente por una base nitrogenada unida a una pentosa. Al añadir uno o más grupos fosfato se convierte en nucleótido."
                ),
                Challenge(
                    id = "bio_t04_s04_c14",
                    statement = "La fuerte carga eléctrica negativa neta que presentan los ácidos nucleicos en disolución acuosa a pH fisiológico, permitiendo su migración hacia el polo positivo (ánodo) en una electroforesis, se debe a:",
                    options = listOf(
                        "Los grupos amino básicos de las purinas",
                        "Los grupos fosfato del esqueleto de la molécula",
                        "Los grupos hidroxilo de la desoxirribosa",
                        "Los puentes de hidrógeno intercatenarios",
                        "La ausencia total de oxígeno en los extremos"
                    ),
                    correctIndex = 1,
                    explanation = "Los grupos fosfato del esqueleto fosfodiéster se encuentran ionizados negativamente a pH celular (PO₄⁻), otorgando una carga neta ácida y negativa uniforme al ADN y ARN."
                ),
                Challenge(
                    id = "bio_t04_s04_c15",
                    statement = "El retrovirus de la inmunodeficiencia humana (VIH) altera el dogma clásico de la biología molecular porque utiliza su genoma de ARN para sintetizar ADN bicatenario dentro del linfocito mediante la enzima:",
                    options = listOf(
                        "ADN polimerasa III",
                        "Transcriptasa inversa (retrotranscriptasa)",
                        "ARN polimerasa II",
                        "Helicasa mitocondrial",
                        "Topoisomerasa bacteriana"
                    ),
                    correctIndex = 1,
                    explanation = "La transcriptasa inversa es una enzima que cataliza la síntesis de ADN a partir de un molde de ARN monocatenario, proceso conocido como transcripción inversa o retrotranscripción."
                ),
                Challenge(
                    id = "bio_t04_s04_c16",
                    statement = "Si una hebra de ADN presenta la secuencia de nucleótidos 5'-A-T-G-C-C-A-3', la secuencia complementaria y antiparalela en la hebra opuesta debe ser obligatoriamente:",
                    options = listOf(
                        "5'-T-A-C-G-G-T-3'",
                        "3'-T-A-C-G-G-T-5'",
                        "3'-U-A-C-G-G-U-5'",
                        "5'-A-T-G-C-C-A-3'",
                        "3'-A-U-G-C-C-A-5'"
                    ),
                    correctIndex = 1,
                    explanation = "Por complementariedad (A con T, G con C) y antiparalelismo (5' se enfrenta a 3'), frente a 5'-ATGCCA-3' la hebra opuesta debe ser 3'-TACGGT-5'."
                ),
                Challenge(
                    id = "bio_t04_s04_c17",
                    statement = "Durante la transcripción de un gen, si la hebra molde de ADN leída por la ARN polimerasa es 3'-T-A-C-G-A-A-5', la secuencia de ARNm resultante será:",
                    options = listOf(
                        "5'-A-T-G-C-T-T-3'",
                        "5'-A-U-G-C-U-U-3'",
                        "3'-A-U-G-C-U-U-5'",
                        "5'-U-A-C-G-A-A-3'",
                        "3'-T-A-C-G-A-A-5'"
                    ),
                    correctIndex = 1,
                    explanation = "La ARN polimerasa sintetiza en dirección 5' → 3' complementando con ARN: frente a T coloca A, frente a A coloca U, frente a C coloca G, obteniéndose 5'-AUGCUU-3'."
                ),
                Challenge(
                    id = "bio_t04_s04_c18",
                    statement = "La científica británica cuyo trabajo pionero de difracción de rayos X (la célebre 'Fotografía 51') proporcionó los datos cristalográficos decisivos para elucidar la estructura en doble hélice del ADN fue:",
                    options = listOf(
                        "Marie Curie",
                        "Rosalind Franklin",
                        "Barbara McClintock",
                        "Lynn Margulis",
                        "Jane Goodall"
                    ),
                    correctIndex = 1,
                    explanation = "Rosalind Franklin obtuvo la crucial 'Fotografía 51' de difracción de rayos X que evidenció la estructura helicoidal y las dimensiones espaciales de la molécula de ADN."
                ),
                Challenge(
                    id = "bio_t04_s04_c19",
                    statement = "En las células eucariotas de una planta o de un animal, además de encontrarse confinado en el núcleo celular, el ADN también se localiza de forma semiautónoma en el interior de:",
                    options = listOf(
                        "El aparato de Golgi y los lisosomas",
                        "Las mitocondrias y los cloroplastos",
                        "Los ribosomas y el retículo liso",
                        "Los peroxisomas y las vacuolas",
                        "La pared celular y los plasmodesmos"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la teoría endosimbiótica, mitocondrias y cloroplastos poseen su propio ADN circular y ribosomas, capaces de sintetizar parte de sus proteínas de manera semiautónoma."
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
            subtema = "5.1",
            title = "Célula Procariota y Teoría Celular",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t05_s01",
                asignatura = "Biología",
                semana = 5,
                titulo = "Fundamentos Celulares y Procariotas",
                resumen = """Postulados de la teoría celular y la arquitectura biológica de los procariontes.

                    # 5.1.1 — Origen Histórico y Postulados de la Teoría Celular
                    La teoría celular unifica a las ciencias biológicas al establecer que todos los organismos vivos están compuestos por células:
                    - **Robert Hooke (1665):** Observó celdillas poliédricas en láminas de corcho (tejido vegetal muerto suberificado) e introdujo el término *cellula* (célula).
                    - **Anton van Leeuwenhoek (1674):** Pulió lentes microscópicas y describió microorganismos vivos acuáticos ("animálculos"), protozoarios, bacterias y espermatozoides.
                    - **Matthias Schleiden (1838):** Botánico alemán que concluyó que todas las plantas están constituidas íntegramente por células y productos celulares.
                    - **Theodor Schwann (1839):** Zoólogo alemán que generalizó la misma afirmación para el reino animal, fundando la Teoría Celular clásica.
                    - **Rudolf Virchow (1855):** Médico patólogo que formuló el principio de continuidad biológica: *Omnis cellula e cellula* ("Toda célula proviene de otra célula preexistente").
                    - **Postulados modernos consolidados:**
                      1. **Unidad estructural o morfológica:** Todo ser vivo está compuesto por una o más células.
                      2. **Unidad funcional o fisiológica:** Las funciones vitales y el metabolismo ocurren en el seno celular.
                      3. **Unidad genética o hereditaria:** La célula contiene el ADN con las instrucciones genéticas que se transmiten a la progenie.
                      4. **Unidad de origen o reproductiva:** Toda célula se origina por la división de otra célula previa.

                    # 5.1.2 — Características Generales de la Célula Procariota
                    Aparecieron hace aproximadamente 3800 millones de años. Comprenden a las bacterias (Eubacteria) y arqueas (Archaea). Se definen por:
                    - **Ausencia de envoltura nuclear (carioteca):** Carecen de un núcleo delimitado. Su material genético se localiza en una zona condensada del citoplasma denominada **región nucleoide**.
                    - **Ausencia de organelos membranosos:** No poseen mitocondrias, cloroplastos, retículo endoplasmático ni aparato de Golgi.
                    - **Citoesqueleto rudimentario:** Presentan proteínas homólogas a la tubulina (FtsZ) y a la actina (MreB).
                    - **Ribosomas 70S:** Menor coeficiente de sedimentación que los eucariotas (80S). Formados por una subunidad mayor (50S: con ARNr 23S y 5S) y una subunidad menor (30S: con ARNr 16S).

                    # 5.1.3 — Envoltura y Pared Celular Bacteriana
                    - **Pared celular de peptidoglicano (mureína):** Polímero de cadenas de N-acetilglucosamina (NAG) y ácido N-acetilmurámico (NAM) unidas por enlaces beta-1,4 y entrecruzadas por péptidos de aminoácidos (como D-alanina y ácido diaminopimélico/L-lisina). Confiere rigidez y previene la lisis osmótica en medios hipotónicos.
                    - **Bacterias Gram positivas:**
                      - Pared gruesa y homogénea de peptidoglicano (hasta 40 capas).
                      - Contiene **ácidos teicoicos y lipoteicoicos** (antígenos de superficie y anclaje a membrana).
                      - Retienen el colorante primario (cristal violeta) tras la decoloración con alcohol-acetona; se tiñen de **azul-violeta**.
                    - **Bacterias Gram negativas:**
                      - Pared delgada de peptidoglicano (1 a 2 capas) ubicada en el **espacio periplásmico**.
                      - Rodeada por una **membrana externa** asimétrica con porinas y **lipopolisacárido (LPS)**. El LPS actúa como endotoxina (el lípido A es el responsable del shock séptico febril).
                      - Pierden el cristal violeta y se tiñen con el colorante de contraste (safranina); se observan de color **rosado-rojo**.
                    - **Bacterias sin pared celular:** Los **micoplasmas** (*Mycoplasma pneumoniae*) carecen de peptidoglicano y contienen esteroles en su membrana plasmática; son intrínsecamente resistentes a betalactámicos como penicilinas.

                    # 5.1.4 — Membrana Plasmática, Citoplasma y Estructuras Internas
                    - **Membrana plasmática bacteriana:** Bicapa lipídica que carece de colesterol (posee hopanoides). Contiene las enzimas de la cadena respiratoria y de la síntesis de ATP (ATP sintasa). En bacterias fotosintéticas (cianobacterias), presenta láminas fotosintéticas tilacoidales con pigmentos como clorofila a y ficobilinas.
                    - **Mesosomas:** Invaginaciones de la membrana plasmática. El **mesosoma tabique** se asocia al cromosoma bacteriano y guía la citocinesis (fisión binaria); los **mesosomas laterales** incrementan la superficie para respiración o secreción enzimática.
                    - **Genoma bacteriano (Cromosoma nucleoide):** Una sola molécula circular de ADN bicatenario, superenrollado y **desnudo** (no asociado a histonas en eubacterias, a diferencia de las arqueas y eucariotas).
                    - **Plásmidos:** Pequeñas moléculas circulares de ADN extracromosómico bicatenario autorreplicable. Portan genes accesorios dispensables para la viabilidad basal, pero que confieren ventajas selectivas (resistencia a antibióticos en plásmidos R, bacteriocinas en plásmidos Col, o virulencia/toxinas).
                    - **Inclusiones citoplasmáticas:** Gránulos de reserva sin membrana (volutina o polifosfatos, glucógeno, poli-beta-hidroxibutirato).

                    # 5.1.5 — Estructuras Externas y Apéndices
                    - **Cápsula bacteriana:** Capa mucosa de polisacáridos (o polipéptidos en *Bacillus anthracis*) dispuesta externamente a la pared. Inhibe la fagocitosis por leucocitos (factor de virulencia cardinal) y favorece la adhesión a sustratos.
                    - **Flagelos bacterianos:** Apéndices helicoidales locomotores formados por la proteína **flagelina**. Anclados a la envoltura mediante un cuerpo basal rotatorio impulsado por fuerza protón-motriz.
                    - **Fimbrias o Pili:** Estructuras filamentosas proteicas rectas compuestas por **pilina**:
                      - *Fimbrias ordinarias:* Cortas y numerosas; median la adherencia a mucosas epiteliales del hospedador.
                      - *Pili sexuales (Pili F):* Más largos y huecos; participan en la **conjugación bacteriana**, facilitando la transferencia unidireccional de plásmidos conjugativos entre bacterias donantes (F+) y receptoras (F-).
                    - **Endosporas:** Formas latentes de extrema resistencia (frente a calor, radiación UV, desecación y desinfectantes químicos) producidas en condiciones adversas por géneros como *Bacillus* y *Clostridium*. Su deshidratación y alto contenido de **dipicolinato de calcio** en el cortex estabilizan el ADN bacteriano.
                """,
                conceptosClave = listOf(
                    "Postulado de Virchow: Omnis cellula e cellula (unidad de origen).",
                    "Gram positivas: gruesa capa de mureína y ácidos teicoicos (tinción violeta).",
                    "Gram negativas: membrana externa con lipopolisacárido endotóxico (LPS) y pared delgada.",
                    "Plásmidos: ADN circular extracromosómico con genes de resistencia a antibióticos.",
                    "Endosporas: estructuras de latencia y resistencia ricas en dipicolinato de calcio."
                ),
                admissionTip = "Recuerda: la penicilina ataca la síntesis del peptidoglicano (transpeptidación), por lo que es letal para bacterias en división celular pero inocua contra células humanas y micoplasmas.",
                admissionExplanation = "Las células eucariotas carecen de pared celular de peptidoglicano, otorgando a los antibióticos betalactámicos una toxicidad selectiva perfecta."
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
                ),
                Challenge(
                    id = "bio_t05_s01_c2",
                    statement = "El enunciado latino 'Omnis cellula e cellula', que consolidó a la célula como la unidad fundamental de origen y reproducción de los seres vivos, fue postulado en 1855 por el patólogo alemán:",
                    options = listOf(
                        "Robert Hooke",
                        "Matthias Schleiden",
                        "Theodor Schwann",
                        "Rudolf Virchow",
                        "Anton van Leeuwenhoek"
                    ),
                    correctIndex = 3,
                    explanation = "Rudolf Virchow completó la teoría celular al establecer que toda célula proviene de la división de otra célula preexistente, desterrando de forma definitiva las hipótesis de generación espontánea a nivel celular."
                ),
                Challenge(
                    id = "bio_t05_s01_c3",
                    statement = "Al realizar la tinción de Gram a una muestra bacteriana de exudado faríngeo, las bacterias retienen el complejo cristal violeta-iodo y se observan de color violeta al microscopio. Esta propiedad tintorial se debe fundamentalmente a que poseen:",
                    options = listOf(
                        "Una membrana externa rica en lipopolisacárido y porinas",
                        "Una capa gruesa de peptidoglicano asociada a ácidos teicoicos",
                        "Una cápsula mucosa compuesta de dipicolinato de calcio",
                        "Esteroles intercalados en la bicapa de su membrana plasmática",
                        "Una pared celular exclusivamente formada por celulosa y lignina"
                    ),
                    correctIndex = 1,
                    explanation = "Las bacterias Gram positivas poseen una pared celular ancha y homogénea constituida por múltiples estratos de peptidoglicano (mureína) atravesados por ácidos teicoicos y lipoteicoicos, que retienen el colorante violeta."
                ),
                Challenge(
                    id = "bio_t05_s01_c4",
                    statement = "En la membrana plasmática de una bacteria quimioheterótrofa aeróbica se localizan complejos enzimáticos homólogos a los de la membrana interna mitocondrial eucariota. Esto se debe a que la bacteria realiza su cadena respiratoria y fosforilación oxidativa en:",
                    options = listOf(
                        "La carioteca nuclear",
                        "La membrana plasmática y sus repliegues mesosómicos",
                        "El nucleoide citoplasmático",
                        "El estroma de los cloroplastos",
                        "La matriz del aparato de Golgi"
                    ),
                    correctIndex = 1,
                    explanation = "Al carecer de mitocondrias, las bacterias albergan los citocromos de la cadena transportadora de electrones y la ATP sintasa directamente en su membrana plasmática y sus invaginaciones (mesosomas)."
                ),
                Challenge(
                    id = "bio_t05_s01_c5",
                    statement = "¿Cuál de los siguientes microorganismos carece por completo de pared celular de peptidoglicano y contiene esteroles en su membrana plasmática, siendo inmune a la acción de la penicilina?",
                    options = listOf(
                        "Streptococcus pneumoniae",
                        "Escherichia coli",
                        "Mycoplasma pneumoniae",
                        "Bacillus anthracis",
                        "Staphylococcus aureus"
                    ),
                    correctIndex = 2,
                    explanation = "Los micoplasmas (*Mycoplasma*) son las bacterias más pequeñas conocidas y carecen congénitamente de pared celular; su membrana está reforzada con esteroles tomados del hospedador y no son afectados por antibióticos que atacan la mureína."
                ),
                Challenge(
                    id = "bio_t05_s01_c6",
                    statement = "Durante un proceso de autoclave hospitalario se somete el instrumental a calor húmedo a 121 °C bajo presión durante 20 minutos con el objetivo de eliminar formas biológicas de latencia hiperresistentes producidas por bacterias de los géneros *Clostridium* y *Bacillus*. Dichas estructuras se denominan:",
                    options = listOf(
                        "Cápsulas mucilaginosas",
                        "Plásmidos conjugativos",
                        "Endosporas bacterianas",
                        "Fimbrias de adhesión",
                        "Mesosomas de tabique"
                    ),
                    correctIndex = 2,
                    explanation = "Las endosporas bacterianas son estructuras deshidratadas de máxima resistencia física y química gracias a su envoltura queratínica y al dipicolinato de calcio en su cortex, diseñadas para sobrevivir condiciones letales."
                ),
                Challenge(
                    id = "bio_t05_s01_c7",
                    statement = "El intercambio genético parasexual entre dos bacterias vivas a través de un puente citoplasmático constituido por un pelo o pili sexual compuesto de la proteína pilina recibe el nombre de:",
                    options = listOf(
                        "Transformación mediada por ADN libre",
                        "Transducción mediada por bacteriófagos",
                        "Conjugación bacteriana",
                        "Fisión binaria o bipartición",
                        "Esporulación endógena"
                    ),
                    correctIndex = 2,
                    explanation = "La conjugación bacteriana es el mecanismo por el cual una bacteria donadora (F+) contacta a una receptora (F-) a través de un pili sexual para transferir una copia de un plásmido conjugativo."
                ),
                Challenge(
                    id = "bio_t05_s01_c8",
                    statement = "Los ribosomas de las células procariotas son estructuras ribonucleoproteicas con un coeficiente de sedimentación de 70S. Sus subunidades constituyentes y ARN ribosómico son respectivamente:",
                    options = listOf(
                        "Subunidad 60S (ARNr 28S) y subunidad 40S (ARNr 18S)",
                        "Subunidad 50S (ARNr 23S y 5S) y subunidad 30S (ARNr 16S)",
                        "Subunidad 40S (ARNr 16S) y subunidad 30S (ARNr 5S)",
                        "Subunidad 50S (ARNr 28S) y subunidad 20S (ARNr 12S)",
                        "Subunidad 70S monomerica indivisible sin subunidades"
                    ),
                    correctIndex = 1,
                    explanation = "El ribosoma procariota 70S se disocia en una subunidad mayor 50S (con ARNr 23S y 5S) y una subunidad menor 30S (con ARNr 16S), a diferencia del ribosoma citosólico eucariota que es 80S (60S + 40S)."
                ),
                Challenge(
                    id = "bio_t05_s01_c9",
                    statement = "La molécula responsable del shock endotóxico febril severo desencadenado por infecciones sistémicas causadas por bacterias Gram negativas forma parte integral de su membrana externa y corresponde al:",
                    options = listOf(
                        "Ácido teicoico superficial",
                        "Lípido A del lipopolisacárido (LPS)",
                        "Peptidoglicano monomérico",
                        "Fosfolípido de cardiolipina",
                        "Ácido dipicolínico cristalizado"
                    ),
                    correctIndex = 1,
                    explanation = "El lipopolisacárido (LPS) de la membrana externa de las Gram negativas actúa como endotoxina bacteriana; su porción lipídica (el lípido A) es el inductor directo de citocinas pirógenas (IL-1, TNF-alfa) que producen fiebre y shock séptico."
                ),
                Challenge(
                    id = "bio_t05_s01_c10",
                    statement = "Respecto a la organización del genoma nuclear en las bacterias del dominio Bacteria (Eubacterias), se afirma correctamente que su cromosoma está compuesto por:",
                    options = listOf(
                        "Múltiples moléculas lineales asociadas fuertemente a histonas",
                        "Una única molécula de ADN circular, bicatenaria y desnuda (sin histonas)",
                        "Fragmentos dispersos de ARN monocatenario de sentido positivo",
                        "ADN circular covalentemente cerrado unido a octámeros de histona H3 y H4",
                        "Plásmidos lineales rodeados por una doble membrana lipídica"
                    ),
                    correctIndex = 1,
                    explanation = "El genoma de las eubacterias típicas consiste en un único cromosoma circular de doble hélice desprovisto de histonas verdaderas (ADN desnudo), ubicado en la región nucleoide citosólica."
                ),
                Challenge(
                    id = "bio_t05_s01_c11",
                    statement = "Ciertas bacterias patógenas como *Streptococcus pneumoniae* poseen una capa mucosa exterior a la pared celular que les permite evadir el englobamiento por macrófagos y neutrófilos del huésped. Esta estructura antifagocítica es:",
                    options = listOf(
                        "El mesosoma de tabicación",
                        "La cápsula",
                        "El plásmido de virulencia",
                        "El flagelo peritrico",
                        "La fimbria tipo IV"
                    ),
                    correctIndex = 1,
                    explanation = "La cápsula bacteriana es una estructura gelatinosa externa que enmascara los antígenos de superficie e impide la opsonización y fagocitosis por los leucocitos, constituyendo un potente factor de virulencia."
                ),
                Challenge(
                    id = "bio_t05_s01_c12",
                    statement = "La afirmación botánica de 1838 que postuló que los tejidos de todas las plantas están integrados por agrupaciones organizadas de células vivas fue sustentada por:",
                    options = listOf(
                        "Matthias Schleiden",
                        "Theodor Schwann",
                        "Robert Brown",
                        "Rudolf Virchow",
                        "Marcelo Malpighi"
                    ),
                    correctIndex = 0,
                    explanation = "Matthias Schleiden, botánico alemán, formuló en 1838 el primer postulado general de la teoría celular vegetal, antes de que Schwann lo ampliara a los tejidos animales al año siguiente."
                ),
                Challenge(
                    id = "bio_t05_s01_c13",
                    statement = "A diferencia de las bacterias Gram positivas, el espacio comprendido entre la membrana plasmática y la membrana externa en las bacterias Gram negativas, donde se aloja una delgada capa de mureína y enzimas hidrolíticas, se denomina:",
                    options = listOf(
                        "Espacio intercristas",
                        "Espacio periplásmico",
                        "Lumen vesicular",
                        "Citoplasma cortical",
                        "Matriz coloidal"
                    ),
                    correctIndex = 1,
                    explanation = "El espacio periplásmico (o periplasma) es el compartimento acuoso delimitado entre la membrana interna y la externa de las bacterias Gram negativas, vital para el transporte de nutrientes y la inactivación de fármacos."
                ),
                Challenge(
                    id = "bio_t05_s01_c14",
                    statement = "Las cianobacterias (algas verdeazuladas) son procariontes autótrofos que realizan fotosíntesis oxigénica similar a las plantas superiores. Al no tener cloroplastos, ¿dónde ubican su clorofila a y pigmentos accesorios?",
                    options = listOf(
                        "En vacuolas digestivas rodeadas de tonoplasto",
                        "En invaginaciones membranosas llamadas laminillas fotosintéticas o tilacoides procariotas",
                        "En el interior de la cápsula polisacarídica externa",
                        "En el interior del nucleoide adheridos al ADN",
                        "En dictiosomas golgianos especializados"
                    ),
                    correctIndex = 1,
                    explanation = "Las cianobacterias albergan sus complejos fotosintéticos en membranas tilacoidales intracitoplasmáticas o láminas fotosintéticas concéntricas derivadas de la membrana celular."
                )
            )
        ),
        LessonNode(
            id = "bio_t05_s02",
            subjectId = "biologia",
            semana = 5,
            subtema = "5.2",
            title = "Membrana Plasmática y Transporte Celular",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t05_s02",
                asignatura = "Biología",
                semana = 5,
                titulo = "Estructura y Transporte a través de la Membrana",
                resumen = """El modelo del mosaico fluido y la termodinámica de los gradientes de concentración transmembrana.

                    # 5.2.1 — Arquitectura Molecular: El Modelo del Mosaico Fluido
                    Propuesto en 1972 por **Seymour Jonathan Singer y Garth Nicolson**, describe la membrana biológica como una estructura dinámica y asimétrica con consistencia cuasilíquida:
                    - **Bicapa de fosfolípidos:** Moléculas anfipáticas con una **cabeza polar hidrofílica** (glicerol + fosfato + grupo polar) orientada hacia los medios acuosos intra y extracelular, y dos **colas apolares hidrofóbicas** (ácidos grasos saturados e insaturados) orientadas hacia el centro de la membrana.
                    - **Fluidez de la membrana:** Depende de la temperatura y de la composición lipídica:
                      - *Ácidos grasos insaturados (con dobles enlaces cis):* Crean codos que impiden el empaquetamiento compacto, aumentando la fluidez.
                      - *Colesterol (en células animales):* Actúa como un **amortiguador térmico bidireccional**. A temperaturas fisiológicas altas limita el movimiento excesivo de los fosfolípidos evitando una fluidez desmedida; a bajas temperaturas interrumpe interacciones intercatenarias impidiendo la congelación o cristalización rígida.
                    - **Proteínas de membrana:**
                      - *Integrales o intrínsecas (transmembrana):* Atraviesan la bicapa una o múltiples veces con dominios alfa-hélice hidrofóbicos. Cumplen roles de canales, bombas, transportadores o receptores. Solo se disocian con detergentes desnaturalizantes.
                      - *Periféricas o extrínsecas:* Adheridas electrostáticamente a las superficies interna o externa de la membrana; actúan como enzimas o anclajes al citoesqueleto.
                    - **Glucocálix (Glucocáliz):** Revestimiento oligosacarídico ubicado **exclusivamente en la cara extracelular** de la membrana plasmática animal (glucolípidos y glucoproteínas). Participa en:
                      - Reconocimiento celular e inmunidad (complejo mayor de histocompatibilidad y grupos sanguíneos ABO).
                      - Adhesión intercelular tisular.
                      - Carga eléctrica negativa neta que repele solutos aniónicos.

                    # 5.2.2 — Transporte Pasivo (A Favor de Gradiente, Sin Gasto de ATP)
                    Flujo espontáneo de solutos desde zonas de mayor concentración o potencial hacia zonas de menor concentración (ΔG < 0, a favor del gradiente electroquímico):
                    - **1. Difusión simple:**
                      - Paso directo a través de los fosfolípidos de la bicapa.
                      - Ocurre con gases apolares pequeños (**O₂, CO₂, N₂**), moléculas liposolubles (hormonas esteroides, fármacos lipofílicos, vitaminas A, D, E, K) y moléculas polares no cargadas muy pequeñas (etanol, glicerol).
                      - No requiere proteínas transportadoras y no presenta cinética de saturación.
                    - **2. Ósmosis:**
                      - Difusión pasiva neta de agua (disolvente) a través de una membrana semipermeable desde un medio de menor concentración de solutos (hipotónico) hacia otro de mayor concentración de solutos (hipertónico):
                      - *En célula animal (glóbulo rojo):*
                        - Medio hipertónico → Pierde agua y se encoge (**crenación**).
                        - Medio hipotónico → Gana agua en exceso, se hincha y explota (**lisis osmótica o hemólisis**).
                        - Medio isotónico → Equilibrio dinámico normal.
                      - *En célula vegetal:*
                        - Medio hipertónico → Pierde agua y la membrana se despega de la pared (**plasmólisis**).
                        - Medio hipotónico → Gana agua, la vacuola se expande y ejerce presión contra la pared celular sin estallar (**turgencia**).
                    - **3. Difusión facilitada:**
                      - Paso de solutos polares o cargados que no pueden atravesar la matriz hidrofóbica lipídica, mediado por proteínas transmembrana:
                      - *Canales iónicos:* Poros hidrofílicos regulados por voltaje, ligando o estrés mecánico para iones como Na+, K+, Ca2+, Cl-.
                      - *Acuaporinas:* Canales proteicos específicos para el paso ultra rápido de agua en túbulos renales y eritrocitos (Premio Nobel Peter Agre).
                      - *Permeasas o transportadores (Carriers):* Se unen al soluto e inducen un cambio conformacional reversible. Presentan **cinética de saturación (Vmax)** y especificidad estricta. Ejemplo: Transportadores GLUT para la glucosa.

                    # 5.2.3 — Transporte Activo (En Contra de Gradiente, Con Gasto Energético)
                    Desplazamiento de iones o moléculas en contra de su gradiente de concentración o electroquímico (de menor a mayor concentración, ΔG > 0), acoplado a una fuente de energía:
                    - **1. Transporte Activo Primario (Bombas dependientes de ATP):**
                      - La hidrólisis directa de ATP provee la energía para bombear el soluto:
                      - **Bomba de Sodio y Potasio (Na⁺/K⁺ ATPasa):**
                        - Por cada molécula de ATP hidrolizada, **expulsa 3 iones Na⁺** hacia el líquido extracelular e **introduce 2 iones K⁺** al citoplasma.
                        - Es electrogénica (genera un potencial transmembrana negativo en el interior celular).
                        - Fundamental para mantener el potencial de reposo en neuronas y miocitos, y para regular el volumen celular osmótico.
                      - *Bomba de Ca²⁺ (SERCA):* Retira calcio del citosol hacia el retículo sarcoplásmico para la relajación muscular.
                      - *Bomba de H⁺ (H⁺-ATPasa):* Acidifica lisosomas y el lumen estomacal (bomba de protones gástrica).
                    - **2. Transporte Activo Secundario (Cotransporte acoplado):**
                      - El movimiento de un soluto en contra de gradiente se energiza mediante el flujo disipativo a favor de gradiente de otro soluto (usualmente Na⁺ o H⁺) generado previamente por una bomba primaria.
                      - *Simporte (contransporte unidireccional):* Ambos solutos viajan en el mismo sentido (ej. transportador SGLT-1 de glucosa y Na⁺ en el enterocito intestinal).
                      - *Antiporte (contratransporte bidireccional):* Los solutos viajan en sentidos opuestos (ej. intercambiador Na⁺/Ca²⁺ o Na⁺/H⁺).

                    # 5.2.4 — Transporte en Masa (Vesicular)
                    Transporte de partículas grandes, fluidos macromoleculares o bacterias completas mediante invaginación o fusión de vesículas membranosas (requiere citoesqueleto y consumo de ATP):
                    - **Endocitosis:** Incorporación de material extracelular:
                      - *Fagocitosis:* Emisión de pseudópodos por células especializadas (macrófagos, neutrófilos, amebas) para englobar partículas sólidas grandes (bacterias, restos celulares) formando un **fagosoma**, que se fusiona con lisosomas.
                      - *Pinocitosis:* Invaginación inespecífica de pequeñas gotas de líquido extracelular con solutos disueltos en vesículas pinocíticas.
                      - *Endocitosis mediada por receptor:* Proceso selectivo mediado por vesículas cubiertas de **clatrina** que captan ligandos específicos (ej. captación de colesterol LDL por hepatocitos).
                    - **Exocitosis:** Fusión de vesículas de secreción intracelulares con la membrana plasmática para verter su contenido al medio extracelular (neurotransmisores en la hendidura sináptica, hormonas polipeptídicas como insulina o enzimas digestivas).
                """,
                conceptosClave = listOf(
                    "Mosaico fluido (Singer y Nicolson): bicapa lipídica anfipática y proteínas dinámicas.",
                    "Colesterol: regula la fluidez frente a cambios de temperatura.",
                    "Difusión simple: O₂, CO₂, gases y lípidos (a favor de gradiente, sin transportador).",
                    "Bomba Na⁺/K⁺: expulsa 3 Na⁺ e ingresa 2 K⁺ por cada ATP hidrolizado.",
                    "Fagocitosis: englobamiento de sólidos mediante pseudópodos para digestión lisosomal."
                ),
                admissionTip = "Aprende el comportamiento del eritrocito: en agua destilada (hipotónico) sufre HEMÓLISIS; en solución salina al 10% (hipertónico) sufre CRENACIÓN.",
                admissionExplanation = "En vegetales la pared celular resiste la presión y no estallan en medios hipotónicos, alcanzando el estado fisiológico de turgencia."
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
                ),
                Challenge(
                    id = "bio_t05_s02_c2",
                    statement = "Al sumergir un frotis de glóbulos rojos humanos en una solución acuosa de cloruro de sodio al 0.2% (solución marcadamente hipotónica respecto a la osmolaridad fisiológica del 0.9%), los eritrocitos sufrirán:",
                    options = listOf(
                        "Crenación por deshidratación osmótica",
                        "Lisis celular o hemólisis por entrada masiva de agua",
                        "Plasmólisis con retracción de la membrana plasmática",
                        "Turgencia controlada sin cambio volumétrico",
                        "Endocitosis masiva de iones cloruro"
                    ),
                    correctIndex = 1,
                    explanation = "En un medio hipotónico, el agua ingresa masivamente al interior del glóbulo rojo por ósmosis; al carecer de pared celular protectora rígida, la membrana eritrocitaria no tolera la presión hidrostática y estalla (hemólisis)."
                ),
                Challenge(
                    id = "bio_t05_s02_c3",
                    statement = "En el modelo del mosaico fluido de Singer y Nicolson (1972), la fluidez de la membrana plasmática en células de mamíferos a temperaturas fisiológicas se encuentra regulada y amortiguada por la presencia de:",
                    options = listOf(
                        "Celulosa microfibrilar",
                        "Colesterol intercalado en la bicapa",
                        "Peptidoglicano de mureína",
                        "Glucógeno citosólico",
                        "Ácidos teicoicos transmembrana"
                    ),
                    correctIndex = 1,
                    explanation = "El colesterol se intercala entre los fosfolípidos modulando su movilidad: a temperaturas corporales amortigua el movimiento excesivo de las colas hidrocarbonadas evitando que la membrana sea demasiado fluida."
                ),
                Challenge(
                    id = "bio_t05_s02_c4",
                    statement = "¿Cuál de las siguientes moléculas químicas atraviesa la membrana plasmática directamente a través de los fosfolípidos de la bicapa por difusión simple sin requerir canales ni proteínas transportadoras?",
                    options = listOf(
                        "Glucosa monomérica",
                        "Oxígeno molecular (O2)",
                        "Ion calcio (Ca2+)",
                        "Aminoácido alanina",
                        "Ion sodio (Na+)"
                    ),
                    correctIndex = 1,
                    explanation = "El oxígeno (O₂) es una molécula no polar pequeña que se disuelve libremente a través de la región hidrofóbica de la bicapa lipídica a favor de su gradiente de presión parcial mediante difusión simple."
                ),
                Challenge(
                    id = "bio_t05_s02_c5",
                    statement = "Las cadenas cortas de carbohidratos (oligosacáridos) unidas covalentemente a proteínas y lípidos que sobresalen exclusivamente hacia el medio extracelular formando el glucocálix celular cumplen la función primordial de:",
                    options = listOf(
                        "Generar ATP mediante quimiosmosis oxidativa",
                        "Reconocimiento celular, histocompatibilidad y adhesión",
                        "Fosforilación oxidativa de azúcares libres",
                        "Polimerización de microtúbulos del huso acromático",
                        "Digestión autofágica de organelos seniles"
                    ),
                    correctIndex = 1,
                    explanation = "El glucocálix celular confiere una huella molecular única a cada estirpe celular en animales, interviniendo en el reconocimiento inmunológico (sistema ABO, HLA) y la adhesión celular."
                ),
                Challenge(
                    id = "bio_t05_s02_c6",
                    statement = "El transporte de glucosa en el epitelio intestinal a través del transportador SGLT-1 aprovecha el gradiente de sodio preexistente generado por la bomba de sodio-potasio para introducir glucosa al citosol en contra de su gradiente. Este mecanismo es un ejemplo típico de:",
                    options = listOf(
                        "Transporte pasivo por difusión facilitada",
                        "Transporte activo primario dependiente de GTP",
                        "Transporte activo secundario de tipo simporte",
                        "Difusión simple a favor de gradiente de masa",
                        "Endocitosis en fase fluida mediada por clatrina"
                    ),
                    correctIndex = 2,
                    explanation = "El cotransporte de sodio y glucosa (SGLT-1) es un transporte activo secundario de simporte (ambos solutos ingresan en la misma dirección) impulsado por el gradiente iónico de Na⁺."
                ),
                Challenge(
                    id = "bio_t05_s02_c7",
                    statement = "Cuando una célula vegetal madura es colocada en un medio extracelular fuertemente hipertónico (alta concentración de sacarosa), el agua intracelular sale de la vacuola provocando el desprendimiento de la membrana plasmática respecto a la pared celular rígida. Este fenómeno se denomina:",
                    options = listOf(
                        "Crenación",
                        "Turgencia",
                        "Plasmólisis",
                        "Hemólisis",
                        "Citolisis"
                    ),
                    correctIndex = 2,
                    explanation = "La plasmólisis ocurre en células vegetales en medio hipertónico cuando la pérdida de agua reduce el volumen citoplasmático y vacuolar, despegando la membrana plasmática de la pared celular externa."
                ),
                Challenge(
                    id = "bio_t05_s02_c8",
                    statement = "El descubrimiento de canales proteicos transmembrana altamente específicos denominados acuaporinas, que permiten el paso ultraveloz y selectivo de moléculas de agua a través de la membrana sin permitir el paso de protones, fue galardonado con el Premio Nobel y constituye un mecanismo de:",
                    options = listOf(
                        "Transporte activo primario",
                        "Difusión facilitada por canales",
                        "Pinocitosis masiva",
                        "Exocitosis constitutiva",
                        "Transporte activo secundario antiporte"
                    ),
                    correctIndex = 1,
                    explanation = "Las acuaporinas son canales proteicos transmembrana que facilitan el movimiento pasivo de moléculas de agua a favor de su gradiente osmótico sin gasto energético, es decir, difusión facilitada."
                ),
                Challenge(
                    id = "bio_t05_s02_c9",
                    statement = "Un macrófago alveolar extiende proyecciones citoplasmáticas de membrana ricas en microfilamentos de actina (pseudópodos) para rodear e internalizar una bacteria invasora dentro de una vesícula membranosa grande. Dicho proceso celular corresponde a la:",
                    options = listOf(
                        "Pinocitosis inespecífica",
                        "Fagocitosis",
                        "Exocitosis regulada",
                        "Ósmosis coloidosmótica",
                        "Difusión simple transmural"
                    ),
                    correctIndex = 1,
                    explanation = "La fagocitosis es una modalidad de endocitosis en masa mediante la cual células especializadas engloban partículas sólidas grandes o microorganismos a través de pseudópodos para formar un fagosoma."
                ),
                Challenge(
                    id = "bio_t05_s02_c10",
                    statement = "La internalización selectiva de partículas de lipoproteínas de baja densidad (LDL) cargadas de colesterol hacia el interior de los hepatocitos se realiza mediante fositas de membrana revestidas en su cara citosólica por una red de la proteína:",
                    options = listOf(
                        "Tubulina alfa",
                        "Clatrina",
                        "Queratina dura",
                        "Colágeno tipo I",
                        "Miosina de cadena pesada"
                    ),
                    correctIndex = 1,
                    explanation = "La endocitosis mediada por receptor requiere el ensamblaje de una red de clatrina en la cara interna de la membrana para invaginar y estrangular la vesícula recubierta que contiene los complejos receptor-ligando."
                ),
                Challenge(
                    id = "bio_t05_s02_c11",
                    statement = "Las proteínas de membrana que se insertan profundamente en la bicapa lipídica y que la atraviesan de lado a lado interactuando con las colas apolares de los ácidos grasos mediante segmentos en alfa-hélice reciben el nombre de:",
                    options = listOf(
                        "Proteínas periféricas extrínsecas",
                        "Proteínas integrales o transmembrana",
                        "Glucoproteínas libres del glucocálix",
                        "Histonas de ensamblaje",
                        "Proteínas hidrosolubles del estroma"
                    ),
                    correctIndex = 1,
                    explanation = "Las proteínas integrales o transmembrana cruzan la bicapa fosfolipídica y poseen dominios hidrofóbicos que interactúan con el centro apolar de los lípidos de membrana."
                ),
                Challenge(
                    id = "bio_t05_s02_c12",
                    statement = "La liberación de acetilcolina desde las vesículas sinápticas de una motoneurona hacia la hendidura sináptica al unirse la vesícula con la membrana presináptica es un proceso de:",
                    options = listOf(
                        "Fagocitosis neutra",
                        "Exocitosis",
                        "Difusión facilitada por carrier",
                        "Pinocitosis adsortiva",
                        "Transporte activo secundario"
                    ),
                    correctIndex = 1,
                    explanation = "La exocitosis es el mecanismo mediante el cual las vesículas de secreción intracelulares se fusionan con la membrana plasmática para verter su contenido (neurotransmisores) al espacio extracelular."
                ),
                Challenge(
                    id = "bio_t05_s02_c13",
                    statement = "En la difusión facilitada a través de transportadores o permeasas (carriers), la velocidad de transporte aumenta al incrementar la concentración del soluto hasta alcanzar una velocidad máxima (Vmax). Esta cinética se explica porque:",
                    options = listOf(
                        "El soluto agota las reservas de ATP citoplasmático",
                        "Los sitios de unión de las proteínas transportadoras se saturan por completo",
                        "La membrana plasmática pierde su fluidez lipídica",
                        "El gradiente electroquímico se invierte bruscamente",
                        "El glucocálix bloquea el poro proteico"
                    ),
                    correctIndex = 1,
                    explanation = "Los transportadores proteicos poseen un número finito de sitios de unión esteroespecíficos; cuando todos los carriers están ocupados por el soluto, el sistema alcanza la saturación (Vmax)."
                )
            )
        ),
        LessonNode(
            id = "bio_t05_s03",
            subjectId = "biologia",
            semana = 5,
            subtema = "5.3",
            title = "Sistema de Endomembranas y Organelos",
            depth = LessonDepth.EXTENSIVE,
            theory = LessonTheory(
                id = "th_bio_t05_s03",
                asignatura = "Biología",
                semana = 5,
                titulo = "Compartimentalización Celular Eucariota",
                resumen = """Organelos membranosos especializados que coordinan la síntesis, tráfico de vesículas, digestión y bioenergética celular.

                    # 5.3.1 — Sistema de Endomembranas (Vacuoma Citoplasmático)
                    Red interconectada de cisternas, túbulos y vesículas delimitadas por membranas que comunican el núcleo con la superficie celular:
                    - **Retículo Endoplasmático Rugoso (RER o Granular):**
                      - Cisternas aplanadas con ribosomas 80S adheridos a su cara citosólica mediante glucoproteínas transmembrana llamadas **riboforinas I y II**.
                      - *Funciones:*
                        1. Síntesis, transporte y plegamiento de **proteínas de secreción**, proteínas integrales de membrana y enzimas lisosomales hidrolíticas.
                        2. **N-glicosilación inicial:** Adición de un núcleo oligosacárido a residuos del aminoácido asparagina.
                        3. En neuronas forma los gránulos basófilos denominados **cuerpos o corpúsculos de Nissl**.
                    - **Retículo Endoplasmático Liso (REL o Agranular):**
                      - Red de túbulos membranosos lisos anastomosados carentes de ribosomas y riboforinas.
                      - *Funciones:*
                        1. **Síntesis de lípidos:** Fosfolípidos de membrana, triglicéridos, colesterol y hormonas esteroides (en gónadas y corteza suprarrenal).
                        2. **Destoxificación celular:** Inactivación y solubilización de fármacos liposolubles, alcohol, barbitúricos, pesticidas y carcinógenos mediante hidroxilación catalizada por enzimas del complejo **citocromo P450** en los hepatocitos.
                        3. **Almacenamiento y liberación de Ca²⁺:** Denominado **retículo sarcoplásmico** en las fibras musculares esqueléticas y cardíacas, indispensable para iniciar el acoplamiento excitación-contracción.
                        4. **Glucogenólisis:** Contiene la enzima glucosa-6-fosfatasa para liberar glucosa libre a la sangre desde el glucógeno hepático.
                    - **Aparato de Golgi (Complejo de Golgi):**
                      - Constituido por pilas de sacos aplanados curvados denominados **dictiosomas**, rodeados de vesículas de transporte. Presenta polaridad funcional:
                        - *Cara cis (de entrada):* Próxima al RER; recibe vesículas de transición con proteínas inmaduras.
                        - *Cisterna media:* Procesamiento enzimático secuencial.
                        - *Cara trans (de salida):* Orientada a la membrana plasmática; genera vesículas de secreción y lisosomas.
                      - *Funciones:*
                        1. **Glicosilación terminal:** O-glicosilación en serina/treonina y maduración de oligosacáridos.
                        2. **Empaquetamiento y direccionamiento molecular:** Distribuye macromoléculas hacia la membrana celular, secreción extracelular o lisosomas (etiquetadas con manosa-6-fosfato).
                        3. **Biogénesis de lisosomas primarios.**
                        4. En vegetales participa en la síntesis de pectinas y hemicelulosa para la formación del **fragmoplasto** durante la citocinesis y pared celular.
                        5. Formación del **acrosoma** en los espermatozoides (gran lisosoma apical especializado).

                    # 5.3.2 — Organelos Monomembranosos (Microcuerpos y Digestión)
                    - **Lisosomas:**
                      - Vesículas esféricas delimitadas por una membrana reforzada con glucoproteínas protectoras.
                      - Contienen aproximadamente 50 tipos de **hidrolasas ácidas** (fosfatasa ácida, proteasas, nucleasas, lipasas, glucosidasas) activas a un **pH óptimo ácido de 4.5 a 5.0**.
                      - El pH ácido se mantiene por una bomba de protones (H⁺-ATPasa) transmembrana que introduce H⁺ consumiendo ATP.
                      - *Digestión celular:*
                        - **Heterofagia:** Digestión de material exógeno captado por endocitosis/fagocitosis (fusión del lisosoma primario con fagosoma = fagolisosoma o lisosoma secundario).
                        - **Autofagia:** Degradación y reciclaje de organelos propios seniles o dañados envueltos en membrana del RE (autofagosoma). Permite el recambio celular y la supervivencia en ayuno (Premio Nobel Yoshinori Ohsumi).
                        - **Autólisis:** Ruptura masiva de lisosomas con autodigestión y muerte celular programada.
                    - **Peroxisomas:**
                      - Organelos esféricos que contienen enzimas oxidativas (**oxidasas y catalasa**).
                      - *Oxidasas de flavina:* Oxidan sustratos orgánicos (ácidos úrico, aminoácidos) transfiriendo hidrógenos al O₂ y generando **peróxido de hidrógeno (H₂O₂)**, un subproducto altamente citotóxico.
                      - *Catalasa:* Descompone de forma inmediata el peróxido de hidrógeno tóxico en agua y oxígeno molecular:
                        2 H₂O₂ (catalasa) → 2 H₂O + O₂
                      - Realizan la **beta-oxidación de ácidos grasos de cadena muy larga** (más de 22 carbonos).
                      - En hojas vegetales participan en la **fotorrespiración** (junto al cloroplasto y mitocondria).
                    - **Glioxisomas:**
                      - Microcuerpos especializados presentes exclusivamente en **plantas (particularmente en semillas oleaginosas en germinación)** y hongos filamentosos.
                      - Realizan el **ciclo del glioxilato:** Convierten los lípidos almacenados (triglicéridos) en azúcares solubles (sacarosa) para nutrir al embrión antes de que pueda fotosintetizar.
                    - **Vacuolas:**
                      - En células vegetales maduras existe una **gran vacuola central** rodeada por una membrana selectiva llamada **tonoplasto**.
                      - Mantiene la **presión de turgencia celular**, almacena agua, sales minerales, proteínas de reserva, metabolitos secundarios defensivos (alcaloides, taninos) y pigmentos hidrosolubles como las **antocianinas** (rojos, púrpuras y azules de pétalos y frutos).

                    # 5.3.3 — Organelos Bimembranosos Semiautónomos (Teoría Endosimbiótica)
                    Postulada por **Lynn Margulis**: Mitocondrias y cloroplastos evolucionaron a partir de bacterias procariontes primitivas fagocitadas por una célula hospedadora ancestral. Evidencias: poseen **doble membrana**, **ADN circular bicatenario propio (desnudo)**, **ribosomas 70S** sensibles a antibióticos y se dividen de forma autónoma por **fisión binaria**:
                    - **Mitocondrias:**
                      - Centrales bioenergéticas de la respiración celular aeróbica.
                      - *Membrana externa:* Permeable gracias a abundantes porinas.
                      - *Espacio intermembrana:* Acumula protones bombeados por la cadena respiratoria.
                      - *Membrana interna:* Altamente impermeable, replegada formando las **crestas mitocondriales**. Contiene cardiolipina, los complejos de la **cadena transportadora de electrones (I, II, III, IV)** y la enzima **ATP sintasa** (partículas F0-F1).
                      - *Matriz mitocondrial (mitosol):* Contiene las enzimas del **ciclo de Krebs**, la beta-oxidación de ácidos grasos (hélice de Lynen), ADN mitocondrial circular (ADNmt) y ribosomas 55S/70S.
                    - **Cloroplastos:**
                      - Plastidios fotosintéticos de células vegetales y algas eucariotas.
                      - *Envoltura:* Doble membrana concéntrica (externa e interna) que rodea el estroma.
                      - *Tilacoides:* Sacos membranosos aplanados organizados en pilas llamadas **granas** (unidas por lamelas estromales). En la membrana tilacoidal se encuentran los **fotosistemas (I y II)**, pigmentos (clorofila a, b, carotenoides), citocromos y ATP sintasas para la **fase luminosa**.
                      - *Estroma:* Matriz coloidal fluida que contiene la enzima **RuBisCO** para el **ciclo de Calvin-Benson (fase oscura)**, ADN cloroplástico circular (ADNcp) y ribosomas 70S.
                """,
                conceptosClave = listOf(
                    "RER: síntesis de proteínas de secreción y glicosilación inicial (riboforinas).",
                    "REL: síntesis de lípidos, destoxificación (citocromo P450) y reservorio de Ca²⁺.",
                    "Golgi: secreción, empaquetamiento, glicosilación terminal y formación de lisosomas primarios.",
                    "Lisosoma: enzimas hidrolíticas a pH ácido (4.5-5.0) para digestión autofágica y heterofágica.",
                    "Peroxisoma: enzima catalasa que degrada H₂O₂; Glioxisoma vegetal: lípidos a azúcares.",
                    "Mitocondria y cloroplasto: organelos bimembranosos semiautónomos con ADN circular y ribosomas 70S."
                ),
                admissionTip = "No confundas: peroxisoma (con catalasa) está en animales y vegetales; GLIOXISOMA solo está en vegetales (semillas oleaginosas para ciclo del glioxilato).",
                admissionExplanation = "La distinción entre autofagia (degradar organelos viejos) y heterofagia (degradar bacterias fagocitadas) por lisosomas es evaluada frecuentemente en medicina."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t05_s03_c1",
                    statement = "Un individuo metaboliza un sedante tras su administración. En los hepatocitos de su tejido hepático se observa una marcada proliferación de un organelo membranoso especializado en la síntesis de esteroides y destoxificación de sustancias hidrofóbicas mediante citocromo P450. ¿De qué organelo se trata?",
                    options = listOf(
                        "Retículo endoplasmático rugoso (RER)",
                        "Aparato de Golgi",
                        "Retículo endoplasmático liso (REL)",
                        "Lisosoma secundario",
                        "Peroxisoma apical"
                    ),
                    correctIndex = 2,
                    explanation = "El retículo endoplasmático liso (REL) carece de ribosomas y tiene como funciones cardinales la síntesis de lípidos (fosfolípidos y colesterol) y la destoxificación de fármacos, pesticidas y toxinas en el hígado."
                ),
                Challenge(
                    id = "bio_t05_s03_c2",
                    statement = "Durante períodos de privación de nutrientes o daño mitocondrial, la célula engloba sus propios organelos deteriorados dentro de una vesícula de doble membrana para fusionarla con lisosomas y reciclar sus componentes moleculares. Este proceso fisiológico de supervivencia celular se denomina:",
                    options = listOf(
                        "Heterofagia vesicular",
                        "Autólisis necrótica",
                        "Autofagia",
                        "Fagocitosis inmune",
                        "Pinocitosis adsortiva"
                    ),
                    correctIndex = 2,
                    explanation = "La autofagia es la ruta catabólica lisosomal encargada de degradar organelos y proteínas celulares deterioradas para reciclar nutrientes y mantener la homeostasis energética intracelular."
                ),
                Challenge(
                    id = "bio_t05_s03_c3",
                    statement = "Las enzimas hidrolíticas intralisosomales como proteasas, lipasas y nucleasas requieren un microambiente ácido (pH aproximado de 4.8 a 5.0) para exhibir su máxima actividad catalítica. ¿Qué componente de la membrana lisosomal mantiene activamente dicha acidez?",
                    options = listOf(
                        "Un canal pasivo para la salida de iones bicarbonato",
                        "Una bomba de protones (H+-ATPasa) que introduce H+ consumiendo ATP",
                        "La catalasa peroxisomal anclada a la membrana",
                        "El complejo citocromo c oxidasa de las crestas",
                        "Un transportador GLUT de monosacáridos"
                    ),
                    correctIndex = 1,
                    explanation = "La membrana del lisosoma posee una bomba de protones tipo V (H⁺-ATPasa) que transporta activamente iones hidrógeno desde el citosol (pH 7.2) hacia el interior lisosomal a expensas de la hidrólisis de ATP."
                ),
                Challenge(
                    id = "bio_t05_s03_c4",
                    statement = "En las células acinares del páncreas humano, encargadas de la síntesis masiva y secreción de precursores enzimáticos digestivos (zimógenos como el tripsinógeno), el organelo citoplasmático más extensamente desarrollado corresponde a:",
                    options = listOf(
                        "El retículo endoplasmático rugoso (RER)",
                        "El retículo endoplasmático liso (REL)",
                        "El glioxisoma peroxisomal",
                        "La vacuola autofágica",
                        "El centrosoma astral"
                    ),
                    correctIndex = 0,
                    explanation = "El retículo endoplasmático rugoso (RER) está altamente desarrollado en células con activa síntesis y secreción de proteínas, como los acinos pancreáticos y las células plasmáticas productoras de anticuerpos."
                ),
                Challenge(
                    id = "bio_t05_s03_c5",
                    statement = "¿Cuál de las siguientes funciones metabólicas se encuentra a cargo exclusivo del Aparato de Golgi dentro de la ruta secretora celular?",
                    options = listOf(
                        "Síntesis de ácidos grasos y fosfolípidos de bicapa",
                        "Empaquetamiento, glicosilación terminal de proteínas y formación de lisosomas primarios",
                        "Beta-oxidación de ácidos grasos de cadena muy larga",
                        "Degradación del peróxido de hidrógeno en agua y oxígeno",
                        "Fijación de dióxido de carbono mediante la enzima RuBisCO"
                    ),
                    correctIndex = 1,
                    explanation = "El complejo de Golgi actúa como el centro de clasificación, modificación postraduccional terminal (O-glicosilación) y empaquetamiento de vesículas que originan la secreción celular y los lisosomas primarios."
                ),
                Challenge(
                    id = "bio_t05_s03_c6",
                    statement = "La enzima catalasa es un marcador bioquímico esencial localizado en el interior de los peroxisomas. Su función fisiológica indispensable para la supervivencia de la célula consiste en:",
                    options = listOf(
                        "Fosforilar ADP para transformarlo en ATP de alta energía",
                        "Degradar el peróxido de hidrógeno tóxico (H2O2) en agua y oxígeno molecular",
                        "Sintetizar glucógeno a partir de moléculas de glucosa libre",
                        "Hidrolizar lípidos en ácidos grasos mediante lipasas ácidas",
                        "Escindir el ADN bacteriano durante la fagocitosis"
                    ),
                    correctIndex = 1,
                    explanation = "La catalasa peroxisomal neutraliza el peróxido de hidrógeno (H₂O₂), una especie reactiva de oxígeno muy tóxica producida por las oxidasas, descomponiéndola en 2 H₂O y O₂."
                ),
                Challenge(
                    id = "bio_t05_s03_c7",
                    statement = "Durante la germinación de semillas de soya y girasol, los lípidos de reserva deben transformarse rápidamente en glúcidos solubles para sustentar el desarrollo inicial de la plántula. Esta ruta anabólica (ciclo del glioxilato) ocurre en organelos exclusivos denominados:",
                    options = listOf(
                        "Lisosomas heterofágicos",
                        "Glioxisomas",
                        "Peroxisomas animales",
                        "Dictiosomas golgianos",
                        "Centríolos no membranosos"
                    ),
                    correctIndex = 1,
                    explanation = "Los glioxisomas son microcuerpos especializados de las semillas vegetales oleaginosas que albergan las enzimas del ciclo del glioxilato, transformando ácidos grasos en azúcares."
                ),
                Challenge(
                    id = "bio_t05_s03_c8",
                    statement = "En una biopsia de músculo esquelético, el retículo endoplasmático liso modificado que rodea estrechamente a las miofibrillas cumple la misión de almacenar grandes concentraciones de iones para liberarlos hacia el sarcoplasma al recibir un potencial de acción. Dicho ion es:",
                    options = listOf(
                        "Potasio (K+)",
                        "Sodio (Na+)",
                        "Calcio (Ca2+)",
                        "Magnesio (Mg2+)",
                        "Cloro (Cl-)"
                    ),
                    correctIndex = 2,
                    explanation = "El retículo sarcoplásmico (REL muscular) almacena activamente Ca²⁺ mediante bombas SERCA y lo libera hacia el citosol para unirse a la troponina C e iniciar la contracción muscular."
                ),
                Challenge(
                    id = "bio_t05_s03_c9",
                    statement = "De acuerdo con la Teoría Endosimbiótica propuesta por Lynn Margulis, las mitocondrias y los cloroplastos se originaron a partir de bacterias procariontes ancestrales. Uno de los respaldos estructurales decisivos para esta teoría es que ambos organelos:",
                    options = listOf(
                        "Carecen por completo de ADN y no pueden dividirse",
                        "Poseen ADN circular bicatenario propio y ribosomas de tipo 70S",
                        "Están delimitados por una sola membrana lipídica simple",
                        "Sintetizan peptidoglicano en su espacio intermembranoso",
                        "Poseen cromatina asociada a histonas idéntica al núcleo"
                    ),
                    correctIndex = 1,
                    explanation = "Las mitocondrias y cloroplastos conservan características procariotas diagnósticas: material genético en forma de ADN circular bicatenario cerrado desprovisto de histonas, ribosomas 70S y replicación por fisión binaria."
                ),
                Challenge(
                    id = "bio_t05_s03_c10",
                    statement = "En los espermatozoides de los mamíferos, el acrosoma es una estructura vesicular apical derivada del complejo de Golgi cargada de enzimas líticas (hialuronidasa y acrosina). Por su contenido y origen funcional, el acrosoma equivale a:",
                    options = listOf(
                        "Un gran lisosoma primario modificado",
                        "Una mitocondria hipertrofiada",
                        "Un glioxisoma con catalasa",
                        "Un centrosoma con microtúbulos",
                        "Un ribosoma 80S multinucleado"
                    ),
                    correctIndex = 0,
                    explanation = "El acrosoma espermático se forma por coalescencia de vesículas enzimáticas del aparato de Golgi y constituye un lisosoma especializado cuya misión es degradar la zona pelúcida del ovocito durante la fecundación."
                ),
                Challenge(
                    id = "bio_t05_s03_c11",
                    statement = "La vacuola central de las células vegetales maduras está delimitada por una membrana selectivamente permeable de gran importancia osmótica denominada:",
                    options = listOf(
                        "Carioteca",
                        "Tonoplasto",
                        "Fragmoplasto",
                        "Plasmalema basal",
                        "Cutícula"
                    ),
                    correctIndex = 1,
                    explanation = "El tonoplasto es la membrana unitaria que rodea a la gran vacuola vegetal central; regula el flujo de agua e iones para sostener la presión de turgencia celular."
                ),
                Challenge(
                    id = "bio_t05_s03_c12",
                    statement = "Los ribosomas 80S se unen transitoriamente a la membrana del retículo endoplasmático rugoso mediante receptores proteicos transmembrana específicos conocidos como:",
                    options = listOf(
                        "Integrinas de adhesión",
                        "Riboforinas",
                        "Porinas mitocondriales",
                        "Cadherinas desmosómicas",
                        "Conexinas intercelulares"
                    ),
                    correctIndex = 1,
                    explanation = "Las riboforinas I y II son glucoproteínas transmembrana del RER que fijan la subunidad mayor (60S) del ribosoma eucariota facilitando la translocación cotraduccional de la cadena polipeptídica naciente."
                ),
                Challenge(
                    id = "bio_t05_s03_c13",
                    statement = "La enfermedad de Tay-Sachs es un trastorno genético neurodegenerativo caracterizado por la acumulación patológica de gangliósidos en las neuronas del cerebro debido a la deficiencia congénita de una enzima hidrolítica. Esta patología clasifica como una enfermedad:",
                    options = listOf(
                        "Mitocondrial de la cadena de transporte",
                        "Por depósito lisosomal",
                        "Peroxisomal por deficiencia de catalasa",
                        "Ribosómica de la traducción",
                        "Golgiana del transporte vesicular"
                    ),
                    correctIndex = 1,
                    explanation = "Las enfermedades por almacenamiento o depósito lisosomal (como Tay-Sachs, Gaucher o Niemann-Pick) se producen por mutaciones en enzimas hidrolíticas lisosomales que provocan la acumulación masiva de sustratos no digeridos."
                ),
                Challenge(
                    id = "bio_t05_s03_c14",
                    statement = "En las crestas mitocondriales de las células del miocardio se localizan las partículas F0-F1 que acoplan el retorno de protones a la matriz con la fosforilación de ADP. Dicho complejo multiproteico corresponde a la enzima:",
                    options = listOf(
                        "RuBisCO carboxilasa",
                        "ATP sintasa",
                        "Catalasa oxidativa",
                        "ADN polimerasa gamma",
                        "Fosfatasa ácida"
                    ),
                    correctIndex = 1,
                    explanation = "La ATP sintasa (complejo V de la membrana interna mitocondrial) aprovecha la fuerza protón-motriz generada por la cadena respiratoria para catalizar la síntesis de ATP a partir de ADP y fosfato inorgánico."
                ),
                Challenge(
                    id = "bio_t05_s03_c15",
                    statement = "Los pigmentos hidrosolubles responsables de las coloraciones rojas, violáceas y azuladas de flores, frutos (arándanos) y de la col morada se almacenan en el interior de:",
                    options = listOf(
                        "Los cloroplastos estromales",
                        "La vacuola central",
                        "Los peroxisomas foliares",
                        "Las crestas de las mitocondrias",
                        "Los ribosomas libres"
                    ),
                    correctIndex = 1,
                    explanation = "Las antocianinas son pigmentos flavonoides solubles en agua que se acumulan en la vacuola central de las células vegetales, a diferencia de los carotenoides que son liposolubles y residen en los plastidios."
                ),
                Challenge(
                    id = "bio_t05_s03_c16",
                    statement = "La beta-oxidación de los ácidos grasos de cadena muy larga (más de 22 carbonos), que no pueden ser procesados directamente por la mitocondria humana, se inicia en el organelo denominado:",
                    options = listOf(
                        "Lisosoma secundario",
                        "Peroxisoma",
                        "Aparato de Golgi",
                        "Retículo endoplasmático rugoso",
                        "Centrosoma"
                    ),
                    correctIndex = 1,
                    explanation = "Los peroxisomas realizan la etapa inicial de acortamiento de ácidos grasos de cadena muy larga mediante beta-oxidación; los derivados más cortos son transferidos luego a la mitocondria para su combustión final."
                ),
                Challenge(
                    id = "bio_t05_s03_c17",
                    statement = "¿Cuál es el destino intracelular de una proteína citosólica que es sintetizada por ribosomas libres en el citosol y que carece de péptido señal de translocación al retículo endoplasmático?",
                    options = listOf(
                        "Es secretada inmediatamente al medio extracelular",
                        "Permanece en el citosol o se destina al núcleo, mitocondria o peroxisoma",
                        "Se incorpora a la cara luminal del aparato de Golgi",
                        "Es degradada de inmediato dentro del lisosoma primario",
                        "Pasa a formar parte de los lípidos del retículo liso"
                    ),
                    correctIndex = 1,
                    explanation = "Las proteínas sintetizadas en polirribosomas libres del citosol permanecen en el citoplasma o se importan postraduccionalmente al núcleo, mitocondrias, cloroplastos o peroxisomas; las destinadas a secreción o lisosomas se sintetizan en el RER."
                ),
                Challenge(
                    id = "bio_t05_s03_c18",
                    statement = "En la citocinesis de las células vegetales, el tabique de separación inicial que dará origen a la lámina media y a la pared celular primaria de las dos células hijas se denomina fragmoplasto, el cual se constituye a partir de vesículas secretoras aportadas por:",
                    options = listOf(
                        "El aparato de Golgi",
                        "Las mitocondrias periféricas",
                        "Los cloroplastos estromales",
                        "El centrosoma con ásteres",
                        "Los lisosomas secundarios"
                    ),
                    correctIndex = 0,
                    explanation = "Durante la telofase vegetal tardía, vesículas derivadas del aparato de Golgi cargadas de pectinas y polisacáridos se alinean en la placa ecuatorial formando el fragmoplasto, precursor de la pared divisoria celular."
                )
            )
        ),
        LessonNode(
            id = "bio_t05_s04",
            subjectId = "biologia",
            semana = 5,
            subtema = "5.4",
            title = "Núcleo y Comparación Animal vs Vegetal",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t05_s04",
                asignatura = "Biología",
                semana = 5,
                titulo = "El Núcleo Celular y Taxonomía Estructural",
                resumen = """Organización de la cromatina nuclear y diferenciación estructural entre células animales y vegetales.

                    # 5.4.1 — Componentes Estructurales del Núcleo Celular Interfásico
                    Estructura rectora de la célula eucariota donde se custodia, replica y transcribe la información genética:
                    - **1. Carioteca (Envoltura nuclear):**
                      - Doble membrana concéntrica (membrana nuclear externa e interna) separadas por el espacio perinuclear. La membrana externa se continúa con la membrana del RER y posee ribosomas adheridos.
                      - **Poros nucleares (Complejo del Poro Nuclear - CPN):** Estructuras octaméricas proteicas (nucleoporinas) que regulan el transporte activo bidireccional de macromoléculas: importación de proteínas nucleares (histonas, polimerasas mediadas por importinas) y exportación de subunidades ribosómicas y moléculas de ARNm/ARNt (mediadas por exportinas).
                      - **Lámina nuclear:** Red de filamentos intermedios (láminas A, B y C) adherida a la cara interna de la carioteca; brinda soporte estructural al núcleo y sirve de anclaje a la cromatina. Su fosforilación en profase causa la desintegración de la carioteca.
                    - **2. Nucleoplasma (Carioplasma o Cariolinfa):**
                      - Matriz acuosa coloidal rica en agua, iones, nucleótidos trifosfato (dATP, ATP, etc.) y enzimas de la replicación y transcripción celular.
                    - **3. Nucléolo:**
                      - Región nuclear densa no delimitada por membrana. Se organiza alrededor de las **regiones organizadoras nucleolares (NOR)** de los cromosomas acrocéntricos humanos (13, 14, 15, 21 y 22).
                      - *Función cardinal:* **Transcripción del ARN ribosómico (ARNr)** y **ensamblaje de las subunidades ribosómicas** (asociación de ARNr recién sintetizado con proteínas ribosómicas importadas del citoplasma). Las subunidades mayor (60S) y menor (40S) salen por separado hacia el citosol.
                    - **4. Cromatina:**
                      - Complejo supramolecular formado por **ADN bicatenario lineal asociado a proteínas histonas** y no histónicas:
                      - *El nucleosoma:* Unidad estructural básica de la cromatina ("cuentas de collar"). Formado por un octámero de histonas (**dos copias de H2A, H2B, H3 y H4**) alrededor del cual el ADN se enrolla en 1.65 vueltas (aproximadamente 146 pares de bases). La **histona H1** (espaciadora o selladora) sella la entrada y salida del ADN fuera del núcleo octamérico.
                      - *Estados de condensación:*
                        - **Eucromatina:** Cromatina poco condensada (laxa), transcripcionalmente activa (genes accesibles a la ARN polimerasa).
                        - **Heterocromatina:** Cromatina fuertemente condensada, transcripcionalmente inactiva o silenciada:
                          - *Constitutiva:* Siempre condensada en todas las células de la especie (ej. centrómeros y telómeros).
                          - *Facultativa:* Se silencia de forma diferencial según el tejido o etapa del desarrollo (ej. el **corpúsculo de Barr** o cromosoma X inactivado por lionización en células somáticas femeninas).

                    # 5.4.2 — Cuadro Comparativo Detallado: Célula Animal vs Célula Vegetal
                    | Parámetro Biológico | Célula Vegetal | Célula Animal |
                    | :--- | :--- | :--- |
                    | **Pared Celular** | Presente: celulosa, hemicelulosa y pectina (rígida, evita lisis). | Ausente (solo presenta membrana plasmática). |
                    | **Revestimiento Externo** | Lámina media y pared celular primaria/secundaria. | **Glucocálix** de glucolípidos y glucoproteínas. |
                    | **Plastidios** | Presentes: cloroplastos (fotosíntesis), leucoplastos, cromoplastos. | Ausentes por completo. |
                    | **Vacuolas** | **Gran vacuola central prominente** que empuja el núcleo a la periferia. | Pequeñas, transitorias o ausentes (vesículas). |
                    | **Centriolos / Centrosoma** | **Ausentes** en angiospermas. Presentan casquetes polares organizadores de microtúbulos. | **Presentes** (un par de centriolos perpendiculares en el centrosoma con áster). |
                    | **Tipo de Mitosis** | **Mitosis Anastral** (sin ásteres centriolares). | **Mitosis Astral** (con ásteres de microtúbulos). |
                    | **Citocinesis** | **Centrífuga** (de adentro hacia afuera) por fragmoplasto golgiano. | **Centrípeta** (de afuera hacia adentro) por anillo de estrangulamiento de actina y miosina. |
                    | **Comunicaciones Intercelulares**| **Plasmodesmos** (canales citoplasmáticos que atraviesan la pared). | Uniones comunicantes (gap o nexus), desmosomas y uniones oclusivas. |
                    | **Glúcido de Reserva** | **Almidón** (amilosa + amilopectina). | **Glucógeno** (altamente ramificado). |
                """,
                conceptosClave = listOf(
                    "CPN (Complejo de Poro Nuclear): regula el paso de proteínas (histonas) y ARNs.",
                    "Nucléolo: síntesis de ARNr y ensamblaje de las subunidades ribosómicas mayor y menor.",
                    "Nucleosoma: octámero de histonas (2 de H2A, H2B, H3 y H4) + 146 pb de ADN + H1 sellador.",
                    "Eucromatina: laxa y activa transcripcionalmente; Heterocromatina: condensada e inactiva.",
                    "Vegetal: pared de celulosa, cloroplastos, vacuola central, plasmodesmos y mitosis anastral.",
                    "Animal: glucocálix, centriolos, glucógeno, mitosis astral y citocinesis centrípeta."
                ),
                admissionTip = "Recuerda para el examen: el nucléolo NO sintetiza ribosomas completos; ensambla las SUBUNIDADES mayor y menor por separado, las cuales solo se unen en el citosol al iniciar la traducción.",
                admissionExplanation = "La citocinesis vegetal es centrífuga (fragmoplasto del Golgi) y la animal es centrípeta (anillo contráctil de actina/miosina)."
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
                ),
                Challenge(
                    id = "bio_t05_s04_c2",
                    statement = "La estructura subnuclear no membranosa que se organiza alrededor de las regiones organizadoras nucleolares (NOR) de ciertos cromosomas y cuya función cardinal consiste en la transcripción de ARNr y ensamblaje de subunidades ribosómicas es:",
                    options = listOf(
                        "El cinetocoro",
                        "El nucléolo",
                        "El centrosoma",
                        "La carioteca",
                        "El dictiosoma"
                    ),
                    correctIndex = 1,
                    explanation = "El nucléolo es el sitio intranuclear especializado donde los genes de ARNr se transcriben y se asocian con proteínas ribosómicas para conformar las subunidades ribosómicas precursoras."
                ),
                Challenge(
                    id = "bio_t05_s04_c3",
                    statement = "La unidad estructural fundamental de la cromatina eucariota (el nucleosoma) está compuesta por un octámero de proteínas histonas alrededor del cual se enrolla la doble hélice de ADN. ¿Cuáles son las histonas que integran dicho octámero central?",
                    options = listOf(
                        "H1, H2A, H3 y H4 (dos copias de cada una)",
                        "Dos copias de H2A, H2B, H3 y H4",
                        "Cuatro copias de H1 y cuatro de H2A",
                        "H2A, H2B, H3, H4 y H5 en proporción equimolar",
                        "Ocho moléculas exclusivas de histona espaciadora H1"
                    ),
                    correctIndex = 1,
                    explanation = "El octámero del core nucleosomal está formado por dos copias de cada una de las histonas centrales: H2A, H2B, H3 y H4. La histona H1 no forma parte del octámero, sino que se ubica en el exterior como estabilizador."
                ),
                Challenge(
                    id = "bio_t05_s04_c4",
                    statement = "En las células somáticas de las hembras de mamíferos (XX), uno de los dos cromosomas X se inactiva y condensa al azar durante el desarrollo embrionario temprano, haciéndose visible en el núcleo interfásico como una masa densa heterocromática conocida como:",
                    options = listOf(
                        "Cromosoma plumoso",
                        "Corpúsculo de Barr",
                        "Cariotipo politénico",
                        "Satélite telomérico",
                        "Fragmoplasto nuclear"
                    ),
                    correctIndex = 1,
                    explanation = "El corpúsculo de Barr es un ejemplo paradigmático de heterocromatina facultativa resultante de la inactivación transcripcional aleatoria de uno de los cromosomas X en las células somáticas de hembras (proceso de lionización)."
                ),
                Challenge(
                    id = "bio_t05_s04_c5",
                    statement = "¿Cuál de las siguientes afirmaciones contrasta correctamente la mitosis de una célula vegetal superior (angiosperma) frente a la de una célula animal típica?",
                    options = listOf(
                        "La célula vegetal realiza mitosis astral con centríolos; la animal es anastral",
                        "La célula vegetal realiza mitosis anastral sin centríolos; la animal realiza mitosis astral con centríolos",
                        "La célula vegetal estrangula su citoplasma en sentido centrípeto mediante un anillo de actina",
                        "La célula animal forma un fragmoplasto derivado del aparato de Golgi",
                        "La célula vegetal carece de huso acromático para segregar cromosomas"
                    ),
                    correctIndex = 1,
                    explanation = "Las plantas con flores carecen de centriolos y forman su huso mitótico a partir de casquetes polares (mitosis anastral), mientras que los animales poseen centriolos rodeados de ásteres (mitosis astral)."
                ),
                Challenge(
                    id = "bio_t05_s04_c6",
                    statement = "Los canales microscópicos que atraviesan las paredes celulares vegetales comunicando directamente los citoplasmas de células contiguas para el intercambio rápido de agua, iones y azúcares reciben el nombre de:",
                    options = listOf(
                        "Desmosomas maculares",
                        "Uniones estrechas u oclusivas",
                        "Plasmodesmos",
                        "Poros de la lámina basal",
                        "Conexinas de hendidura"
                    ),
                    correctIndex = 2,
                    explanation = "Los plasmodesmos son puentes citoplasmáticos revestidos por membrana plasmática que atraviesan la pared celular primaria vegetal, permitiendo el transporte simplástico intercelular."
                ),
                Challenge(
                    id = "bio_t05_s04_c7",
                    statement = "Durante la citocinesis de la célula animal, la división física del citoplasma ocurre por estrangulamiento centrípeto (de afuera hacia adentro) mediado por la contracción de un anillo formado por:",
                    options = listOf(
                        "Microtúbulos de tubulina beta y dineína",
                        "Microfilamentos de actina y miosina",
                        "Filamentos intermedios de queratina",
                        "Pectinas y celulosa golgiana",
                        "Histonas fosforiladas tipo H1"
                    ),
                    correctIndex = 1,
                    explanation = "La citocinesis en células animales está mediada por un anillo contráctil submembranoso compuesto por filamentos de actina y motores de miosina II que estrangulan el citoplasma hacia el centro."
                ),
                Challenge(
                    id = "bio_t05_s04_c8",
                    statement = "La fracción de la cromatina nuclear que se encuentra en un estado descondensado y extendido durante la interfase, siendo plenamente accesible para que la ARN polimerasa transcriba genes activamente, se denomina:",
                    options = listOf(
                        "Heterocromatina constitutiva",
                        "Eucromatina",
                        "Heterocromatina facultativa",
                        "Cinetocoro pericentromérico",
                        "Lámina nuclear densa"
                    ),
                    correctIndex = 1,
                    explanation = "La eucromatina es la conformación laxa y poco teñida de la cromatina que contiene los genes metabólicamente activos que están siendo expresados y transcriptos en la célula."
                ),
                Challenge(
                    id = "bio_t05_s04_c9",
                    statement = "La lámina nuclear es una red filamentosa adosada a la cara interna de la membrana nuclear interna que confiere soporte mecánico al núcleo. Bioquímicamente está constituida por proteínas que pertenecen a la familia de los:",
                    options = listOf(
                        "Microtúbulos de tubulina",
                        "Microfilamentos de actina",
                        "Filamentos intermedios",
                        "Fosfolípidos esfingolípidos",
                        "Glúcidos del glucocálix"
                    ),
                    correctIndex = 2,
                    explanation = "Las láminas nucleares (láminas A, B y C) son proteínas polipeptídicas que forman parte de la clase de filamentos intermedios del citoesqueleto intracelular."
                ),
                Challenge(
                    id = "bio_t05_s04_c10",
                    statement = "El polisacárido de reserva energética característico acumulado en los plastidios (amiloplastos) de las células vegetales se denomina:",
                    options = listOf(
                        "Glucógeno muscular",
                        "Almidón",
                        "Quitina exoesqueletica",
                        "Mureína bacteriana",
                        "Heparina mastocítica"
                    ),
                    correctIndex = 1,
                    explanation = "Las células vegetales almacenan su excedente de glucosa en forma de almidón (polímero compuesto de amilosa y amilopectina), a diferencia de las células animales que almacenan glucógeno."
                ),
                Challenge(
                    id = "bio_t05_s04_c11",
                    statement = "El transporte de macromoléculas de gran peso molecular como histonas y polimerasas desde el citosol hacia el interior del núcleo a través del complejo del poro nuclear requiere de secuencias de localización nuclear (NLS) y de proteínas receptoras solubles denominadas:",
                    options = listOf(
                        "Exportinas nucleares",
                        "Importinas",
                        "Clatrinas de envoltura",
                        "Riboforinas transmembrana",
                        "Cinesinas anterógradas"
                    ),
                    correctIndex = 1,
                    explanation = "Las importinas son receptores solubles citoplasmáticos que reconocen la secuencia NLS (Señal de Localización Nuclear) de las proteínas y las transportan a través del poro nuclear consumiendo energía de la GTPasa Ran."
                ),
                Challenge(
                    id = "bio_t05_s04_c12",
                    statement = "Una investigadora agrega colchicina a un cultivo de células vegetales. La colchicina despolimeriza los microtúbulos impidiendo la formación del huso acromático. Sin embargo, al observar la célula en interfase, confirma que esta carece congénitamente del centrosoma típico animal con un par de:",
                    options = listOf(
                        "Centríolos",
                        "Cloroplastos",
                        "Glioxisomas",
                        "Cromoplastos",
                        "Vacuolas de turgencia"
                    ),
                    correctIndex = 0,
                    explanation = "Las células de las plantas superiores (espermatofitas) carecen de centriolos; sus microtúbulos se polimerizan y nuclean a partir de regiones difusas del citoplasma conocidas como casquetes polares."
                ),
                Challenge(
                    id = "bio_t05_s04_c13",
                    statement = "¿Cuál de las siguientes estructuras une mecánicamente a dos células epiteliales animales adyacentes a través de filamentos intermedios de queratina para brindar una alta resistencia a la tracción mecánica?",
                    options = listOf(
                        "Plasmodesmos",
                        "Desmosomas (mácula adherens)",
                        "Uniones comunicantes de tipo gap",
                        "Pared primaria de celulosa",
                        "Lámina media de pectato cálcico"
                    ),
                    correctIndex = 1,
                    explanation = "Los desmosomas son complejos de adhesión intercelular en tejidos animales sometidos a fuerte estrés mecánico (como piel y miocardio) que anclan los filamentos intermedios de queratina de células vecinas."
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
            subtema = "6.1",
            title = "Fotosíntesis: Fase Luminosa",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t06_s01",
                asignatura = "Biología",
                semana = 6,
                titulo = "Fase Fotoquímica o Dependiente de la Luz",
                resumen = """Conversión transduccional de energía fotónica en energía química utilizable (ATP y NADPH) con desprendimiento de oxígeno molecular.

                    # 6.1.1 — Ecuación Global y Compartimentalización Cloroplástica
                    La fotosíntesis es el proceso anabólico y endergónico primordial de la biosfera mediante el cual los organismos fotoautótrofos convierten la materia inorgánica de bajo contenido calórico (CO₂ y H₂O) en materia orgánica rica en energía química (glucosa y otros glúcidos):
                    - **Ecuación química neta balanceada:**
                      6 CO₂ + 12 H₂O + Energía luminosa (Fotones) → C₆H₁₂O₆ + 6 O₂ ↑ + 6 H₂O
                    - **Localización estricta de la fase luminosa:**
                      Ocurre en la **membrana de los tilacoides** organizados en granas dentro de los cloroplastos. Dicha bicapa lipídica alberga los complejos pigmentarios, citocromos transportadores y la ATP sintasa.

                    # 6.1.2 — Pigmentos Fotosintéticos y Fotosistemas (Complejos Antena)
                    Los pigmentos capturan fotones gracias a sus enlaces dobles conjugados resonantes:
                    - **Clorofilas (a y b):** Anillo de porfirina con un átomo central de **Magnesio (Mg²⁺)** coordinado y una cola hidrofóbica fitol que la ancla a la membrana. Absorben principalmente luz en las longitudes de onda azul-violeta y roja, reflejando el verde.
                    - **Pigmentos accesorios:** Carotenoides (**carotenos** de color naranja y **xantofilas** amarillas) y ficobilinas (en cianobacterias y algas rojas: ficocianina y ficoeritrina). Amplían el espectro de absorción y protegen contra la fotooxidación destructiva.
                    - **Arquitectura de un Fotosistema:**
                      - *Complejo antena o colector:* Cientos de moléculas de pigmento que absorben fotones y transfieren energía por **resonancia inductiva** hacia el centro de reacción.
                      - *Centro de reacción fotoquímico:* Par especial de clorofila *a* acoplado a un aceptor primario de electrones:
                        - **Fotosistema II (PS II o P680):** Su centro de reacción absorbe preferentemente fotones a una longitud de onda de **680 nm**.
                        - **Fotosistema I (PS I o P700):** Su centro de reacción absorbe a una longitud de onda de **700 nm**.

                    # 6.1.3 — Secuencia de Eventos de la Fase Luminosa Acíclica (Esquema Z)
                    1. **Fotoexcitación de la clorofila:**
                       Los fotones excitan electrones en el P680 del PS II elevándolos a un nivel cuántico superior; los electrones son cedidos a un aceptor primario (feofitina), dejando al P680 fuertemente oxidado (P680⁺).
                    2. **Fotólisis del agua (Reacción de Hill):**
                       En la cara luminal del PS II opera el **complejo del manganeso (Mn)** que cataliza la descomposición del agua:
                       2 H₂O → 4 H⁺ + 4 e⁻ + O₂ ↑
                       - Los electrones reponen los huecos electrónicos del P680⁺.
                       - Los protones (H⁺) se liberan hacia el interior del **lumen tilacoidal**, contribuyendo al gradiente ácido.
                       - El **oxígeno molecular gaseoso (O₂) se desprende a la atmósfera**, demostrando que el O₂ liberado proviene **exclusivamente del agua** y no del dióxido de carbono.
                    3. **Cadena de transporte de electrones tilacoidal:**
                       Los electrones fluyen desde la feofitina hacia la **plastoquinona (PQ)**, el **complejo citocromo b₆f**, la **plastocianina (PC)** (proteína con cobre que reduce al P700⁺ del PS I), y tras una segunda fotoexcitación en el PS I, pasan a la **ferredoxina (Fd)**.
                    4. **Fotorreducción del NADP⁺:**
                       En la cara externa orientada hacia el estroma, la enzima **NADP⁺ reductasa** utiliza los electrones de la ferredoxina y protones estromales para reducir el NADP⁺ a coenzima reducida:
                       NADP⁺ + 2 e⁻ + 2 H⁺ → **NADPH + H⁺**
                    5. **Fotofosforilación acíclica (Síntesis Quimiosmótica de ATP):**
                       El transporte de electrones bombea protones desde el estroma hacia el lumen tilacoidal mediante la plastoquinona y el citocromo b₆f, que sumados a los protones de la fotólisis del agua generan una fuerte diferencia de pH y potencial (fuerza protón-motriz). Al disiparse este gradiente saliendo los protones hacia el estroma a través de la **ATP sintasa** (partícula CF0-CF1), se cataliza la fosforilación de ADP + Pi para formar **ATP**.

                    # 6.1.4 — Vía Cíclica de la Fase Luminosa (Fotofosforilación Cíclica)
                    - Interviene **exclusivamente el Fotosistema I (PS I - P700)**.
                    - Los electrones excitados en el P700 viajan a la ferredoxina, pero en lugar de reducir al NADP⁺, retornan a través del complejo citocromo b₆f y plastocianina hacia el propio P700.
                    - *Consecuencia bioenergética:* **Solo produce ATP** mediante el bombeo de protones; **NO hay fotólisis del agua, NO se desprende O₂ y NO se genera NADPH**. Suple el déficit de ATP necesario para impulsar las altas demandas del ciclo de Calvin.
                """,
                conceptosClave = listOf(
                    "Ocurre en la membrana de los tilacoides del cloroplasto.",
                    "Fotólisis del agua (Reacción de Hill): fuente exclusiva del O₂ liberado a la atmósfera.",
                    "Productos netos de la fase luminosa acíclica: ATP, NADPH y O₂.",
                    "Fase cíclica: participa solo el PS I (P700) y produce únicamente ATP adicional."
                ),
                admissionTip = "Recuerda siempre la ecuación de Hill: H₂O se oxida liberando O₂, y el NADP⁺ se reduce formando NADPH.",
                admissionExplanation = "Comprender que el oxígeno proviene del agua y no del dióxido de carbono es una de las preguntas de mayor recurrencia y valor en el examen UNSA."
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
                ),
                Challenge(
                    id = "bio_t06_s01_c2",
                    statement = "En la molécula de clorofila, el anillo de porfirina que capta fotones de luz y sufre fotoexcitación contiene en su centro de coordinación un átomo metálico esencial correspondiente al:",
                    options = listOf(
                        "Hierro (Fe2+)",
                        "Magnesio (Mg2+)",
                        "Manganeso (Mn2+)",
                        "Cobre (Cu2+)",
                        "Cinc (Zn2+)"
                    ),
                    correctIndex = 1,
                    explanation = "La clorofila contiene un ion magnesio (Mg²⁺) coordinado en el centro de su anillo tetrapirrólico, indispensable para la absorción resonante de fotones de luz."
                ),
                Challenge(
                    id = "bio_t06_s01_c3",
                    statement = "¿Cuál es la localización celular exacta donde se llevan a cabo los procesos de fotoexcitación, transporte electrónico tilacoidal y fotofosforilación acíclica?",
                    options = listOf(
                        "El estroma cloroplástico",
                        "La membrana de los tilacoides",
                        "La matriz mitocondrial interna",
                        "El espacio intermembranoso del plastidio",
                        "La membrana externa del cloroplasto"
                    ),
                    correctIndex = 1,
                    explanation = "La membrana tilacoidal es la bicapa lipídica que contiene incrustados a los fotosistemas I y II, los citocromos y la ATP sintasa cloroplástica encargados de la fase fotoquímica."
                ),
                Challenge(
                    id = "bio_t06_s01_c4",
                    statement = "Durante la fase luminosa acíclica, los electrones que finalmente reducen al aceptor coenzimático NADP+ en el estroma para transformarlo en NADPH provienen en última instancia de la oxidación de:",
                    options = listOf(
                        "El gas dióxido de carbono (CO2)",
                        "La molécula de agua (H2O)",
                        "La ribulosa bisfosfato",
                        "El ácido 3-fosfoglicérico",
                        "El fosfogliceraldehído"
                    ),
                    correctIndex = 1,
                    explanation = "Los electrones son arrancados del agua durante la fotólisis en el PS II y viajan por toda la cadena transportadora hasta la NADP⁺ reductasa para reducir el NADP⁺ a NADPH."
                ),
                Challenge(
                    id = "bio_t06_s01_c5",
                    statement = "A diferencia del transporte acíclico, la fotofosforilación de tipo cíclico en los cloroplastos se caracteriza biológicamente por:",
                    options = listOf(
                        "Involucrar únicamente al Fotosistema I y generar exclusivamente ATP",
                        "Requerir la fotólisis masiva de agua en el lumen tilacoidal",
                        "Generar grandes cantidades de NADPH y liberar gas oxígeno",
                        "Depender exclusivamente del Fotosistema II P680",
                        "Ocurrir en ausencia total de complejos de citocromo b6f"
                    ),
                    correctIndex = 0,
                    explanation = "En la fotofosforilación cíclica los electrones retornan al P700 del PS I mediante un circuito cerrado; no se usa agua, no se libera O₂, no se genera NADPH y solo se sintetiza ATP mediante quimiosmosis."
                ),
                Challenge(
                    id = "bio_t06_s01_c6",
                    statement = "El ion metálico que forma parte integral del complejo enzimático del Fotosistema II responsable directo de coordinar la fotólisis u oxidación del agua en el lumen tilacoidal es el:",
                    options = listOf(
                        "Manganeso (Mn)",
                        "Sodio (Na)",
                        "Calcio (Ca)",
                        "Cobalto (Co)",
                        "Molibdeno (Mo)"
                    ),
                    correctIndex = 0,
                    explanation = "El complejo liberador de oxígeno (OEC) del fotosistema II contiene un clúster de cuatro átomos de manganeso (Mn) indispensable para catalizar la extracción de electrones del agua."
                ),
                Challenge(
                    id = "bio_t06_s01_c7",
                    statement = "De acuerdo con la hipótesis quimiosmótica de Peter Mitchell, la síntesis de ATP durante la fase luminosa fotosintética es impulsada por:",
                    options = listOf(
                        "La entrada activa de glucosa al estroma por transportadores SGLT",
                        "La disipación del gradiente electroquímico de protones que fluyen a través de la ATP sintasa",
                        "La descarboxilación oxidativa del ácido málico en el mesófilo",
                        "La degradación de almidón en la membrana externa",
                        "La absorción de calor térmico por las xantofilas del estroma"
                    ),
                    correctIndex = 1,
                    explanation = "El gradiente electroquímico generado por la acumulación de protones (H⁺) en el lumen tilacoidal impulsa su retorno al estroma a través del complejo rotorico CF0-CF1 (ATP sintasa), activando la fosforilación de ADP a ATP."
                ),
                Challenge(
                    id = "bio_t06_s01_c8",
                    statement = "¿Cuál de las siguientes proteínas de la cadena de transporte electrónico tilacoidal contiene un átomo de cobre y actúa como el donador inmediato de electrones para reducir al Fotosistema I oxidado (P700+)?",
                    options = listOf(
                        "Plastocianina",
                        "Plastoquinona",
                        "Ferredoxina",
                        "Feofitina",
                        "Rubredoxina"
                    ),
                    correctIndex = 0,
                    explanation = "La plastocianina es una proteína hidrosoluble periférica que contiene cobre; se desplaza por el lumen tilacoidal llevando electrones desde el citocromo b₆f hasta el P700⁺ del fotosistema I."
                ),
                Challenge(
                    id = "bio_t06_s01_c9",
                    statement = "Los productos intermediarios generados durante la fase luminosa de la fotosíntesis que son indispensables para permitir la posterior asimilación de dióxido de carbono en la fase oscura son:",
                    options = listOf(
                        "Glucosa y oxígeno gaseoso",
                        "ATP y NADPH + H+",
                        "ADP y NADP+ oxidados",
                        "Ácido pirúvico y FADH2",
                        "Ácido láctico y GTP"
                    ),
                    correctIndex = 1,
                    explanation = "La fase luminosa produce poder reductor (NADPH) y energía química libre (ATP), los cuales se difunden hacia el estroma para impulsar las reacciones endergónicas del ciclo de Calvin."
                ),
                Challenge(
                    id = "bio_t06_s01_c10",
                    statement = "La proteína fijada a la membrana tilacoidal en la cara estromática que transfiere electrones desde la ferredoxina para reducir la coenzima NADP+ es la:",
                    options = listOf(
                        "ATP sintasa quinasa",
                        "NADP+ reductasa (FNR)",
                        "RuBisCO oxigenasa",
                        "Fosfoglicerato mutasa",
                        "Piruvato deshidrogenasa"
                    ),
                    correctIndex = 1,
                    explanation = "La ferredoxina-NADP⁺ reductasa (FNR) cataliza la reducción final de NADP⁺ a NADPH utilizando dos electrones donados por dos moléculas reducidas de ferredoxina."
                ),
                Challenge(
                    id = "bio_t06_s01_c11",
                    statement = "En el fotosistema II (PS II), el centro de reacción que absorbe preferencialmente la luz solar a una longitud de onda de 680 nanómetros se denomina:",
                    options = listOf(
                        "P700",
                        "P680",
                        "Citocromo c",
                        "Complejo F0",
                        "Carotenoide alfa"
                    ),
                    correctIndex = 1,
                    explanation = "El centro de reacción del Fotosistema II se designa P680 porque su par especial de clorofila *a* presenta su pico máximo de absorción fotónica a 680 nm."
                ),
                Challenge(
                    id = "bio_t06_s01_c12",
                    statement = "La acumulación masiva de iones H+ que crea la fuerza protón-motriz en los tilacoides durante la fase luminosa tiene lugar en el interior de:",
                    options = listOf(
                        "El estroma cloroplástico",
                        "El lumen o espacio intratilacoidal",
                        "La matriz mitocondrial",
                        "El citoplasma perinuclear",
                        "El retículo endoplasmático liso"
                    ),
                    correctIndex = 1,
                    explanation = "Los protones son acumulados en el espacio intratilacoidal o lumen tilacoidal (alcanzando un pH ácido cercano a 5), mientras que el estroma se vuelve ligeramente básico (pH 8)."
                ),
                Challenge(
                    id = "bio_t06_s01_c13",
                    statement = "Los pigmentos carotenoides presentes en los tilacoides de las plantas cumplen, además de ampliar el espectro de captura lumínica, un rol fisiológico de:",
                    options = listOf(
                        "Fijar directamente átomos de carbono atmosférico",
                        "Fotoprotección frente a la fotooxidación por radicales libres de oxígeno",
                        "Hidrolizar la pared celular durante la maduración",
                        "Transportar sacarosa hacia el floema",
                        "Sintetizar celulosa en la vacuola"
                    ),
                    correctIndex = 1,
                    explanation = "Los carotenoides disipan el exceso de energía lumínica como calor y desactivan especies reactivas de oxígeno (como el oxígeno singlete), previniendo el daño fotooxidativo a las clorofilas."
                )
            )
        ),
        LessonNode(
            id = "bio_t06_s02",
            subjectId = "biologia",
            semana = 6,
            subtema = "6.2",
            title = "Fotosíntesis: Ciclo de Calvin-Benson",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t06_s02",
                asignatura = "Biología",
                semana = 6,
                titulo = "Fase Oscura o Asimilativa de Carbono",
                resumen = """Asimilación de carbono inorgánico y síntesis de triosas fosfato impulsadas por ATP y NADPH estromales.

                    # 6.2.1 — Naturaleza y Localización del Ciclo de Calvin-Benson
                    También conocida como **fase biosintética, asimilativa o ciclo C3**. No requiere luz de manera directa (por lo que antiguamente se le llamaba 'fase oscura'), pero solo opera activamente mientras haya suministro continuo de **ATP y NADPH** generados en la fase luminosa y sus enzimas sean activadas por la luz indirectamente:
                    - **Localización celular:** Ocurre en el **estroma** (matriz coloidal del cloroplasto).

                    # 6.2.2 — Las Cuatro Fases Bioquímicas del Ciclo de Calvin
                    Para sintetizar una molécula de glucosa neta (C₆H₁₂O₆), se requiere fijar **6 moléculas de CO₂**, lo que demanda 6 vueltas del ciclo con un gasto bioenergético total de **18 ATP y 12 NADPH**:
                    1. **Carboxilación (Fijación del Carbono):**
                       - Cada molécula de CO₂ se une covalentemente a una pentosa bifosforilada receptora: la **Ribulosa-1,5-bisfosfato (RuBP)** (5C).
                       - Reacción catalizada por la enzima **RuBisCO** (Ribulosa-1,5-bisfosfato carboxilasa/oxigenasa), la proteína más abundante sobre la faz de la Tierra.
                       - Se origina un compuesto intermedio hexacarbonado muy inestable (6C) que se escinde instantáneamente por hidrólisis en **dos moléculas de 3-Fosfoglicerato (3-PGA)** (3 carbonos cada una).
                       - Al fijar 6 CO₂ a 6 RuBP, se generan **12 moléculas de 3-PGA**.
                    2. **Reducción del 3-Fosfoglicerato:**
                       - Las 12 moléculas de 3-PGA son primero activadas por fosforilación consumiendo **12 ATP** para formar 12 moléculas de 1,3-bisfosfoglicerato (1,3-BPG).
                       - Luego, el 1,3-BPG es reducido por los electrones aportados por **12 NADPH + 12 H⁺**, liberando 12 fosfatos inorgánicos (Pi) y formando **12 moléculas de Fosfogliceraldehído (PGAL o G3P)** (triosa fosfato con función aldehído).
                    3. **Síntesis y Salida de Compuestos Orgánicos:**
                       - De las 12 moléculas de PGAL generadas:
                         - **2 moléculas de PGAL (2 × 3C = 6C) salen del ciclo de Calvin.**
                         - En el estroma o citosol, estas dos triosas se condensan para formar una molécula de **Fructosa-1,6-bisfosfato**, que posteriormente se convierte en **Glucosa** (6C).
                         - A partir del PGAL la célula vegetal puede sintetizar también ácidos grasos, aminoácidos, almidón (almacenado en el estroma) y sacarosa (transportada por el floema a toda la planta).
                    4. **Regeneración de la Ribulosa-1,5-bisfosfato (RuBP):**
                       - Las **10 moléculas de PGAL restantes** (10 × 3C = 30C) se someten a una compleja cascada de reordenamientos moleculares de azúcares fosforilados (transaldolaciones y transcetolaciones).
                       - Con el consumo de **6 moléculas adicionales de ATP**, se reorganizan para **regenerar 6 moléculas de Ribulosa-1,5-bisfosfato (6 × 5C = 30C)**, cerrando el ciclo y permitiendo la captura de más CO₂.

                    # 6.2.3 — Fotorrespiración y Adaptaciones Fotosintéticas (C3, C4 y CAM)
                    - **Fotorrespiración:** La RuBisCO no solo actúa como carboxilasa; a altas temperaturas, baja concentración de CO₂ y alto O₂, actúa como **oxigenasa**, uniendo O₂ a la RuBP para formar 3-PGA y **2-fosfoglicolato** (compuesto tóxico que debe reciclarse con gasto energético entre cloroplasto, peroxisoma y mitocondria sin producir ATP ni azúcares).
                    - **Plantas C4 (Ruta de Hatch-Slack):** Como el maíz, la caña de azúcar y el sorgo. Separan espacialmente la fijación inicial de CO₂ (en las células del mesófilo mediante la enzima **PEP carboxilasa**, que no reacciona con O₂ y forma oxalacetato/malato de 4C) del ciclo de Calvin (en las células de la vaina vascular perivascular con anatomía de Kranz), eliminando la fotorrespiración.
                    - **Plantas CAM (Metabolismo Ácido de las Crasuláceas):** Plantas xerófitas como cactus y piñas. Separan temporalmente los procesos: abren estomas solo **de noche** para fijar CO₂ en malato acumulado en vacuolas, y **de día** cierran estomas para evitar la evaporación de agua, liberando el CO₂ interno para el ciclo de Calvin impulsado por la luz solar.
                """,
                conceptosClave = listOf(
                    "Ocurre en el estroma del cloroplasto.",
                    "Fijación de carbono: catalizada por la enzima RuBisCO sobre la RuBP.",
                    "Producto clave que sale del ciclo: 2 moléculas de Fosfogliceraldehído (PGAL) rinden 1 Glucosa.",
                    "Balance por molécula de glucosa: fija 6 CO₂ y consume 18 ATP y 12 NADPH.",
                    "Adaptaciones: C4 separa espacialmente la fijación; CAM separa temporalmente (noche/día)."
                ),
                admissionTip = "¡Pregunta de rigor preuniversitario!: El producto neto del Ciclo de Calvin NO es directamente la glucosa, sino el Fosfogliceraldehído (PGAL o G3P). Dos PGAL se unen para formar glucosa.",
                admissionExplanation = "La RuBisCO es una enzima bifuncional: fija CO₂ (carboxilasa) o fija O₂ (oxigenasa indeseada en la fotorrespiración)."
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
                ),
                Challenge(
                    id = "bio_t06_s02_c2",
                    statement = "El producto químico directo que abandona el ciclo de Calvin para condensarse en el estroma o citosol y posibilitar la biosíntesis de glucosa, ácidos grasos y almidón es una triosa fosfatada denominada:",
                    options = listOf(
                        "Fosfogliceraldehído (PGAL o G3P)",
                        "Ácido oxalacético (AOA)",
                        "Ácido fosfoenolpirúvico (PEP)",
                        "Ribulosa monofosfato",
                        "Ácido cítrico"
                    ),
                    correctIndex = 0,
                    explanation = "El PGAL (gliceraldehído-3-fosfato) es el carbohidrato triosa intermediario clave que sale del ciclo de Calvin para la síntesis de glucosa y otros metabolitos vegetales."
                ),
                Challenge(
                    id = "bio_t06_s02_c3",
                    statement = "Para sintetizar netamente una molécula de glucosa (C6H12O6) en el ciclo de Calvin-Benson, ¿cuántas moléculas de CO2 deben fijarse y cuántos ATP y NADPH deben consumirse respectivamente?",
                    options = listOf(
                        "3 CO2, 9 ATP y 6 NADPH",
                        "6 CO2, 18 ATP y 12 NADPH",
                        "6 CO2, 36 ATP y 24 NADPH",
                        "1 CO2, 3 ATP y 2 NADPH",
                        "12 CO2, 24 ATP y 18 NADPH"
                    ),
                    correctIndex = 1,
                    explanation = "La síntesis de una molécula de glucosa requiere fijar 6 moléculas de CO₂ mediante 6 vueltas del ciclo, lo cual demanda 12 ATP y 12 NADPH para la reducción, más 6 ATP para regenerar la RuBP (Total: 18 ATP y 12 NADPH)."
                ),
                Challenge(
                    id = "bio_t06_s02_c4",
                    statement = "¿Cuál es la proteína más abundante en la biosfera encargada de la asimilación del carbono atmosférico pero que presenta el inconveniente de fijar también oxígeno cuando la temperatura es elevada?",
                    options = listOf(
                        "ATP sintasa tilacoidal",
                        "RuBisCO",
                        "Colágeno tipo IV",
                        "Ferredoxina oxidasa",
                        "Anhidrasa carbónica"
                    ),
                    correctIndex = 1,
                    explanation = "La RuBisCO (ribulosa-1,5-bisfosfato carboxilasa-oxigenasa) constituye la enzima más abundante del planeta Tierra y posee actividad dual dependiendo de la relación CO₂/O₂."
                ),
                Challenge(
                    id = "bio_t06_s02_c5",
                    statement = "En condiciones ambientales de clima árido y cálido, cuando las hojas cierran estomas para evitar la deshidratación y la concentración de O2 supera con creces a la de CO2, la planta C3 incurre en un proceso no productivo que degrada carbohidratos sin producir ATP conocido como:",
                    options = listOf(
                        "Fosforilación acíclica",
                        "Fotorrespiración",
                        "Glucólisis anaerobia",
                        "Fermentación alcohólica",
                        "Ciclo del glioxilato"
                    ),
                    correctIndex = 1,
                    explanation = "La fotorrespiración ocurre cuando la RuBisCO fija oxígeno en vez de dióxido de carbono, generando fosfoglicolato que consume energía para ser metabolizado sin rendir ATP ni glucosa."
                ),
                Challenge(
                    id = "bio_t06_s02_c6",
                    statement = "Plantas cultivadas como el maíz y la caña de azúcar evitan la fotorrespiración gracias a una separación anatómica espacial de las fases fotosintéticas (anatomía de Kranz). Estas plantas se clasifican fisiológicamente como:",
                    options = listOf(
                        "Plantas C3 típicas",
                        "Plantas C4 (vía Hatch-Slack)",
                        "Plantas parásitas heterótrofas",
                        "Briofitas poiquilohídricas",
                        "Gimnospermas perennifolias"
                    ),
                    correctIndex = 1,
                    explanation = "Las plantas C4 fijan inicialmente CO₂ en el mesófilo mediante la PEP carboxilasa formando oxalacetato (4 carbonos) y lo transportan a las células de la vaina perivascular para nutrir a la RuBisCO en altas concentraciones."
                ),
                Challenge(
                    id = "bio_t06_s02_c7",
                    statement = "Los cactus y plantas suculentas de la familia Crasulácea habitan desiertos extremos y abren sus estomas exclusivamente durante la noche para evitar la pérdida de vapor de agua. Esta adaptación metabólica temporal corresponde a la fotosíntesis:",
                    options = listOf(
                        "CAM (Metabolismo Ácido de Crasuláceas)",
                        "C3 obligatoria",
                        "Quimiosintética nitrificante",
                        "Anoxigénica sulfurosa",
                        "Fermentativa láctica"
                    ),
                    correctIndex = 0,
                    explanation = "El metabolismo CAM separa temporalmente la absorción de CO₂ (nocturna, almacenado en forma de ácido málico en vacuolas) del ciclo de Calvin diurno impulsado por los fotones del sol con estomas cerrados."
                ),
                Challenge(
                    id = "bio_t06_s02_c8",
                    statement = "La fase del ciclo de Calvin en la cual se restituyen las moléculas aceptoras de dióxido de carbono (Ribulosa-1,5-bisfosfato) a expensas de la redistribución de triosas fosfato y consumo de ATP se denomina:",
                    options = listOf(
                        "Fotorreducción",
                        "Regeneración",
                        "Fotólisis",
                        "Carboxilación neta",
                        "Descarboxilación"
                    ),
                    correctIndex = 1,
                    explanation = "La regeneración es la etapa final del ciclo de Calvin donde 10 moléculas de PGAL se reordenan mediante el gasto de 6 ATP para volver a formar 6 moléculas de RuBP."
                ),
                Challenge(
                    id = "bio_t06_s02_c9",
                    statement = "Durante la fase reductora del ciclo de Calvin, el 1,3-bisfosfoglicerato se transforma en fosfogliceraldehído al recibir electrones e hidrógenos provenientes directamente de la coenzima:",
                    options = listOf(
                        "FADH2 de la respiración",
                        "NADPH generado en la fase luminosa",
                        "NADH citoplasmático",
                        "Coenzima A libre",
                        "Biotina carboxilada"
                    ),
                    correctIndex = 1,
                    explanation = "El NADPH aportado por la fase luminosa se oxida a NADP⁺ en el estroma, donando sus equivalentes de reducción para convertir el intermediario fosforilado en PGAL."
                ),
                Challenge(
                    id = "bio_t06_s02_c10",
                    statement = "El azúcar pentosa bifosforilado que actúa como el aceptor primario que se combina covalentemente con el CO2 atmosférico durante el primer paso del ciclo de Calvin es la:",
                    options = listOf(
                        "Ribulosa-1,5-bisfosfato",
                        "Glucosa-6-fosfato",
                        "Fructosa-1,6-bisfosfato",
                        "Desoxirribosa libre",
                        "Sedoheptulosa-7-fosfato"
                    ),
                    correctIndex = 0,
                    explanation = "La ribulosa-1,5-bisfosfato (RuBP) es la pentosa aceptora fundamental con la que reacciona el CO₂ gaseoso durante la etapa de carboxilación."
                ),
                Challenge(
                    id = "bio_t06_s02_c11",
                    statement = "En las plantas C4, la enzima responsable de fijar el CO2 en las células del mesófilo sin mostrar afinidad por el oxígeno, previniendo eficazmente la fotorrespiración, es la:",
                    options = listOf(
                        "Fosfoenolpiruvato carboxilasa (PEP carboxilasa)",
                        "RuBisCO oxigenasa",
                        "Piruvato quinasa",
                        "Lactato deshidrogenasa",
                        "Amilasa salival"
                    ),
                    correctIndex = 0,
                    explanation = "La PEP carboxilasa carece de actividad oxigenasa; fija el CO₂ a fosfoenolpiruvato con altísima afinidad incluso a concentraciones bajísimas de dióxido de carbono."
                ),
                Challenge(
                    id = "bio_t06_s02_c12",
                    statement = "Una vez producidas las triosas fosfatadas (PGAL) en el estroma de los cloroplastos foliares, el excedente diurno de glucosa no exportado inmediatamente se polimeriza y almacena transitoriamente en forma de:",
                    options = listOf(
                        "Gránulos de glucógeno",
                        "Gránulos de almidón asimilador",
                        "Cutícula de cera foliar",
                        "Cristales de celulosa pura",
                        "Fibras de esclerénquima"
                    ),
                    correctIndex = 1,
                    explanation = "El exceso de azúcares sintetizados durante las horas de luz en el cloroplasto se almacena localmente como gránulos insolubles de almidón estromático para ser degradado durante la noche."
                ),
                Challenge(
                    id = "bio_t06_s02_c13",
                    statement = "El primer intermediario estable de 3 carbonos que se detecta tras la carboxilación de la ribulosa bisfosfato en el ciclo de Calvin corresponde al:",
                    options = listOf(
                        "3-Fosfoglicerato (3-PGA)",
                        "Ácido pirúvico",
                        "Ácido cítrico",
                        "Fosfoenolpiruvato",
                        "Lactato cálcico"
                    ),
                    correctIndex = 0,
                    explanation = "El intermediario de seis carbonos se escinde rápidamente en dos moléculas de 3-fosfoglicerato (3-PGA), por lo que esta vía se denomina fotosíntesis C3."
                )
            )
        ),
        LessonNode(
            id = "bio_t06_s03",
            subjectId = "biologia",
            semana = 6,
            subtema = "6.3",
            title = "Respiración Celular Anaeróbica y Glucólisis",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t06_s03",
                asignatura = "Biología",
                semana = 6,
                titulo = "Glucólisis Citosólica y Procesos Fermentativos",
                resumen = """Vía oxidativa ancestral de catabolismo de la glucosa en el citoplasma y vías de regeneración de NAD⁺ en condiciones de anoxia.

                    # 6.3.1 — Glucólisis (Ruta de Embden-Meyerhof-Parnas)
                    Es la ruta metabólica central más primitiva y universal de todos los seres vivos. Ocurre en el **citosol (hialoplasma)** de células tanto procariotas como eucariotas. Se desarrolla íntegramente en **ausencia de oxígeno (anaerobia)**:
                    - **Ecuación química neta:**
                      Glucosa (6C) + 2 NAD⁺ + 2 ADP + 2 Pi → **2 Piruvatos (3C) + 2 NADH + 2 H⁺ + 2 ATP netos**
                    - **Fases de la glucólisis:**
                      1. *Fase preparatoria o de inversión energética (Gasto de 2 ATP):*
                         - La glucosa es fosforilada por la **hexoquinasa** consumiendo 1 ATP para dar glucosa-6-fosfato (quedando atrapada dentro de la célula).
                         - Se isomeriza a fructosa-6-fosfato y la enzima marcapasos clave, la **Fosfofructoquinasa-1 (PFK-1)**, consume un segundo ATP para producir Fructosa-1,6-bisfosfato.
                         - La fructosa-1,6-bisfosfato es escindida por la **aldolasa** en dos triosas fosfato interconvertibles: Dihidroxiacetona fosfato (DHAP) y **Gliceraldehído-3-fosfato (G3P)**.
                      2. *Fase de rendimiento o beneficio energético (Producción de 4 ATP y 2 NADH):*
                         - Ambas triosas (2 G3P) son oxidadas por la **gliceraldehído-3-fosfato deshidrogenasa** reduciendo 2 NAD⁺ a **2 NADH + 2 H⁺**.
                         - Se sintetizan 4 ATP por el mecanismo de **fosforilación a nivel de sustrato** (enzimas fosfoglicerato quinasa y piruvato quinasa).
                      3. *Balance neto:* 4 ATP producidos - 2 ATP consumidos = **2 ATP netos** por molécula de glucosa.

                    # 6.3.2 — Destino Anaeróbico del Piruvato: Las Fermentaciones
                    En ausencia de oxígeno celular (anoxia o hipoxia), la mitocondria no puede operar porque la cadena respiratoria se bloquea al faltar su aceptor final (O₂). El NADH citosólico se acumularía y agotaría las existencias de NAD⁺ libre, lo que paralizaría de inmediato a la glucólisis.
                    - **Objetivo cardinal de la fermentación:**
                      **Reoxidar el NADH a NAD⁺** en el citosol para permitir que la glucólisis continúe produciendo 2 ATP netos por molécula de glucosa.
                    - **Fermentación Láctica:**
                      - Ocurre en bacterias lácticas (*Lactobacillus*, *Streptococcus*) y en el **músculo esquelético humano** bajo ejercicio intenso con hipoxia local, así como en eritrocitos maduros (anucleados y sin mitocondrias).
                      - El piruvato se reduce directamente a **Lactato** catalizado por la **Lactato Deshidrogenasa (LDH)** consumiendo NADH:
                        Piruvato + NADH + H⁺ → **Lactato + NAD⁺**
                      - No produce CO₂ (no hay descarboxilación).
                    - **Fermentación Alcohólica:**
                      - Ocurre en levaduras (*Saccharomyces cerevisiae*) usadas en panificación, elaboración de cerveza y vino.
                      - Consta de dos pasos:
                        1. Descarboxilación del Piruvato (3C) a **Acetaldehído (2C) + CO₂ ↑** (catalizado por la piruvato descarboxilasa).
                        2. Reducción del acetaldehído a **Etanol (2C) + NAD⁺** (catalizado por la alcohol deshidrogenasa).
                """,
                conceptosClave = listOf(
                    "La glucólisis ocurre en el citosol sin O₂; genera 2 piruvatos, 2 NADH y 2 ATP netos (por fosforilación a nivel de sustrato).",
                    "El objetivo de la fermentación no es ganar más ATP, sino reoxidar el NADH a NAD⁺ para mantener activa la glucólisis.",
                    "Fermentación láctica: sin CO₂, produce lactato (músculo en hipoxia, eritrocitos, bacterias).",
                    "Fermentación alcohólica: produce CO₂ y etanol (levaduras)."
                ),
                admissionTip = "Aprende el detalle anatómico y metabólico: los glóbulos rojos maduros (sin mitocondria) obtienen todo su ATP por glucólisis anaeróbica seguida de fermentación láctica.",
                admissionExplanation = "La diferencia clave entre fermentación láctica (sin CO₂) y alcohólica (con CO₂) es una trampa muy recurrente en exámenes de la UNSA."
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
                ),
                Challenge(
                    id = "bio_t06_s03_c2",
                    statement = "La glucólisis es la vía metabólica ancestral que degrada una molécula de glucosa (6C) hasta dos moléculas de piruvato (3C). ¿En qué compartimento de la célula eucariota se llevan a cabo las diez reacciones enzimáticas de esta vía?",
                    options = listOf(
                        "Matriz mitocondrial",
                        "Citosol o hialoplasma",
                        "Espacio intermembrana mitocondrial",
                        "Estroma del cloroplasto",
                        "Lumen del retículo endoplasmático"
                    ),
                    correctIndex = 1,
                    explanation = "La glucólisis se desarrolla íntegramente en el citosol soluble (hialoplasma) de la célula, de manera independiente de las mitocondrias y del oxígeno."
                ),
                Challenge(
                    id = "bio_t06_s03_c3",
                    statement = "Durante la fase de inversión energética de la glucólisis, la enzima marcapasos clave que fosforila a la fructosa-6-fosfato consumiendo una molécula de ATP para convertirla en fructosa-1,6-bisfosfato es la:",
                    options = listOf(
                        "Hexoquinasa",
                        "Fosfofructoquinasa-1 (PFK-1)",
                        "Piruvato quinasa",
                        "Triosa fosfato isomerasa",
                        "Lactato deshidrogenasa"
                    ),
                    correctIndex = 1,
                    explanation = "La Fosfofructoquinasa-1 (PFK-1) es la enzima clave autorregulada alostéricamente que determina la velocidad de flujo metabólico de la glucólisis."
                ),
                Challenge(
                    id = "bio_t06_s03_c4",
                    statement = "En la fermentación alcohólica realizada por levaduras durante la fermentación del mosto de uva para producir pisco o vino, la liberación de gas que produce la efervescencia característica deriva de la descarboxilación del piruvato hacia:",
                    options = listOf(
                        "Lactato",
                        "Acetaldehído y dióxido de carbono (CO2)",
                        "Oxalacetato",
                        "Glicerol-3-fosfato",
                        "Acetil-CoA"
                    ),
                    correctIndex = 1,
                    explanation = "La piruvato descarboxilasa convierte el piruvato (3C) en acetaldehído (2C) desprendiendo una molécula de CO₂, el cual forma las burbujas gaseosas en la fermentación alcohólica."
                ),
                Challenge(
                    id = "bio_t06_s03_c5",
                    statement = "¿Cuál es el objetivo biológico fundamental de los procesos de fermentación (láctica o alcohólica) en condiciones de anoxia celular?",
                    options = listOf(
                        "Sintetizar 36 moléculas adicionales de ATP en la matriz",
                        "Reoxidar el NADH a NAD+ para que la glucólisis pueda proseguir",
                        "Oxidar completamente el piruvato hasta dióxido de carbono y agua",
                        "Fosforilar transportadores de electrones de las crestas mitocondriales",
                        "Fijar dióxido de carbono en forma de glucosa"
                    ),
                    correctIndex = 1,
                    explanation = "La fermentación no produce ATP en sí misma; su función insustituible es reoxidar el NADH citosólico a NAD⁺, evitando que la glucólisis se detenga por agotamiento de coenzima oxidada."
                ),
                Challenge(
                    id = "bio_t06_s03_c6",
                    statement = "Los glóbulos rojos humanos (eritrocitos maduros) obtienen toda su energía metabólica en forma de ATP exclusivamente a partir de la:",
                    options = listOf(
                        "Fosforilación oxidativa mitocondrial",
                        "Glucólisis acoplada a fermentación láctica",
                        "Beta-oxidación de ácidos grasos en peroxisomas",
                        "Fermentación alcohólica de azúcares",
                        "Respiración aeróbica dependiente de oxígeno"
                    ),
                    correctIndex = 1,
                    explanation = "Al madurar, los eritrocitos expulsan sus mitocondrias para no consumir el O₂ que transportan; por ello, producen su ATP exclusivamente mediante glucólisis anaeróbica que culmina en fermentación láctica."
                ),
                Challenge(
                    id = "bio_t06_s03_c7",
                    statement = "La principal enzima reguladora alostérica y marcapasos de la glucólisis, cuya actividad es inhibida por altas concentraciones intracelulares de ATP y citrato, corresponde a la:",
                    options = listOf(
                        "Hexoquinasa muscular",
                        "Fosfofructoquinasa-1 (PFK-1)",
                        "Lactato deshidrogenasa",
                        "Enolasa",
                        "Glucosa-6-fosfatasa"
                    ),
                    correctIndex = 1,
                    explanation = "La fosfofructoquinasa-1 (PFK-1) cataliza el paso limitante irreversible de la glucólisis (fructosa-6-P a fructosa-1,6-bisfosfato) y es finamente controlada por el estado energético de la célula."
                ),
                Challenge(
                    id = "bio_t06_s03_c8",
                    statement = "Durante la fermentación alcohólica realizada por levaduras, el piruvato experimenta una primera reacción de descarboxilación que produce dióxido de carbono y un compuesto intermedio de 2 carbonos denominado:",
                    options = listOf(
                        "Ácido láctico",
                        "Acetaldehído",
                        "Acetil-CoA",
                        "Etanol directo",
                        "Ácido acético"
                    ),
                    correctIndex = 1,
                    explanation = "El piruvato se descarboxila por la piruvato descarboxilasa formando acetaldehído (etanal), el cual es luego reducido a etanol por la alcohol deshidrogenasa."
                ),
                Challenge(
                    id = "bio_t06_s03_c9",
                    statement = "El mecanismo mediante el cual se genera ATP en la glucólisis al transferirse directamente un grupo fosfato de alta energía desde un metabolito fosforilado (como fosfoenolpiruvato) hacia una molécula de ADP se denomina:",
                    options = listOf(
                        "Fosforilación oxidativa por quimiosmosis",
                        "Fosforilación a nivel de sustrato",
                        "Fotofosforilación acíclica",
                        "Fosforilación desnaturalizante",
                        "Hidrólisis quimiosintética"
                    ),
                    correctIndex = 1,
                    explanation = "La fosforilación a nivel de sustrato consiste en la síntesis directa de ATP acoplada a la desfosforilación enzimática de un sustrato de alta energía, independiente de la cadena de transporte electrónico."
                ),
                Challenge(
                    id = "bio_t06_s03_c10",
                    statement = "El lactato producido en el músculo esquelético durante un ejercicio exhaustivo es vertido a la sangre y captado por el hígado para ser reconvertido en glucosa a través de la gluconeogénesis. Esta interrelación metabólica músculo-hígado se denomina:",
                    options = listOf(
                        "Ciclo de Krebs",
                        "Ciclo de Cori",
                        "Ciclo de Calvin",
                        "Ciclo de la urea",
                        "Ciclo del glioxilato"
                    ),
                    correctIndex = 1,
                    explanation = "El ciclo de Cori describe la circulación metabólica en la que el lactato muscular se transporta por sangre al hígado, donde se convierte en glucosa para retornar al músculo."
                ),
                Challenge(
                    id = "bio_t06_s03_c11",
                    statement = "¿Cuál de las siguientes transformaciones químicas de la glucólisis representa una reacción de oxidación donde una enzima reduce coenzimas NAD+ a NADH?",
                    options = listOf(
                        "Glucosa a glucosa-6-fosfato",
                        "Fructosa-6-fosfato a fructosa-1,6-bisfosfato",
                        "Gliceraldehído-3-fosfato a 1,3-bisfosfoglicerato",
                        "Fosfoenolpiruvato a piruvato",
                        "3-fosfoglicerato a 2-fosfoglicerato"
                    ),
                    correctIndex = 2,
                    explanation = "La gliceraldehído-3-fosfato deshidrogenasa cataliza la única reacción de oxidación-reducción de la glucólisis, oxidando el G3P a 1,3-BPG e incorporando fosfato inorgánico mientras reduce NAD⁺ a NADH."
                ),
                Challenge(
                    id = "bio_t06_s03_c12",
                    statement = "En la fermentación láctica realizada por bacterias del yogur (*Lactobacillus bulgaricus*), la reducción del ácido pirúvico es catalizada por la enzima:",
                    options = listOf(
                        "Piruvato deshidrogenasa",
                        "Lactato deshidrogenasa (LDH)",
                        "Alcohol deshidrogenasa",
                        "RuBisCO",
                        "Fosfoglicerato mutasa"
                    ),
                    correctIndex = 1,
                    explanation = "La lactato deshidrogenasa (LDH) transfiere los electrones del NADH al grupo carbonilo del piruvato, transformándolo en ácido láctico (lactato)."
                ),
                Challenge(
                    id = "bio_t06_s03_c13",
                    statement = "¿Cuántas moléculas de ATP neto se generan estrictamente a partir de la fase fermentativa que sigue a la glucólisis (reducción de piruvato a etanol o lactato)?",
                    options = listOf(
                        "2 ATP adicionales",
                        "Cero ATP",
                        "4 ATP adicionales",
                        "36 ATP",
                        "1 ATP por cada piruvato"
                    ),
                    correctIndex = 1,
                    explanation = "Las reacciones de fermentación posteriores a la glucólisis producen cero ATP adicionales; solo cumplen la función de oxidar NADH a NAD⁺ para sostener la glucólisis."
                )
            )
        ),
        LessonNode(
            id = "bio_t06_s04",
            subjectId = "biologia",
            semana = 6,
            subtema = "6.4",
            title = "Respiración Aeróbica y Balance Energético",
            depth = LessonDepth.EXTENSIVE,
            theory = LessonTheory(
                id = "th_bio_t06_s04",
                asignatura = "Biología",
                semana = 6,
                titulo = "Vía Mitocondrial y Rendimiento Máximo de ATP",
                resumen = """Oxidación completa del piruvato hasta dióxido de carbono y agua acoplada a la fosforilación oxidativa mitocondrial.

                    # 6.4.1 — Etapas Intramitocondriales de la Respiración Aerobia
                    En presencia de oxígeno molecular (O₂), el ácido pirúvico citosólico ingresa a la mitocondria a través de porinas en la membrana externa y un simporte con H⁺ en la membrana interna.
                    - **1. Descarboxilación oxidativa del Piruvato (Acetilación):**
                      - Ocurre en la **matriz mitocondrial**.
                      - Catalizada por el complejo multienzimático **Piruvato Deshidrogenasa (PDH)**.
                      - Cada molécula de piruvato (3C) se descarboxila (liberando **1 CO₂**) y se oxida (reduciendo **1 NAD⁺ a NADH + H⁺**). El resto acetilo (2C) se une a la coenzima A formando **Acetil-CoA (2C)**:
                        2 Piruvato (3C) + 2 Coenzima A + 2 NAD⁺ → **2 Acetil-CoA (2C) + 2 CO₂ ↑ + 2 NADH**
                    - **2. Ciclo de Krebs (Ciclo del Ácido Cítrico o de los Ácidos Tricarboxílicos - TCA):**
                      - Ocurre en la **matriz mitocondrial** (con la única excepción de la succinato deshidrogenasa, que se encuentra incrustada en la membrana interna formando el complejo II).
                      - *Secuencia de reacciones (por cada molécula de Acetil-CoA):*
                        1. **Condensación:** Acetil-CoA (2C) + Oxalacetato (4C) → **Citrato (6C)** (catalizado por la citrato sintasa).
                        2. **Isomerización:** Citrato → Isocitrato (6C) (por la aconitasa).
                        3. **Primera descarboxilación oxidativa:** Isocitrato → **Alfa-cetoglutarato (5C) + CO₂ ↑ + NADH**.
                        4. **Segunda descarboxilación oxidativa:** Alfa-cetoglutarato → **Succinil-CoA (4C) + CO₂ ↑ + NADH**.
                        5. **Fosforilación a nivel de sustrato:** Succinil-CoA → **Succinato (4C) + 1 GTP (o ATP)** (catalizado por succinil-CoA sintetasa).
                        6. **Oxidación con FAD:** Succinato → **Fumarato (4C) + FADH₂** (catalizado por la succinato deshidrogenasa acoplada a FAD).
                        7. **Hidratación:** Fumarato + H₂O → Malato (4C) (por la fumarasa).
                        8. **Regeneración del oxalacetato:** Malato → **Oxalacetato (4C) + NADH** (por la malato deshidrogenasa).
                      - *Rendimiento por vuelta (1 Acetil-CoA):* 2 CO₂ + 3 NADH + 1 FADH₂ + 1 GTP/ATP.
                      - *Rendimiento por molécula de glucosa (2 Acetil-CoA):* **4 CO₂ + 6 NADH + 2 FADH₂ + 2 GTP (o ATP)**.

                    # 6.4.2 — Cadena de Transporte de Electrones (Cadena Respiratoria)
                    Ocurre en la **membrana interna mitocondrial (crestas mitocondriales)**. Los electrones de alta energía transportados por el NADH y FADH₂ fluyen a través de cuatro grandes complejos proteicos transmembrana en orden creciente de potencial de reducción estándar:
                    - **Complejo I (NADH deshidrogenasa):** Transfiere electrones del NADH a la ubiquinona (coenzima Q) y bombea **4 protones (H⁺)** al espacio intermembrana.
                    - **Complejo II (Succinato deshidrogenasa):** Transfiere electrones del FADH₂ a la ubiquinona; no atraviesa la membrana y **no bombea protones**.
                    - **Coenzima Q (Ubiquinona):** Transportador móvil liposoluble en la bicapa que lleva electrones al complejo III.
                    - **Complejo III (Citocromo bc₁):** Transfiere electrones al citocromo c y bombea **4 protones (H⁺)**.
                    - **Citocromo c:** Proteína móvil hidrosoluble periférica en el espacio intermembrana que transporta electrones al complejo IV.
                    - **Complejo IV (Citocromo c oxidasa):** Posee centros de cobre y hemo; transfiere 4 electrones al aceptor final:
                      **El aceptor final de electrones es el Oxígeno Molecular (O₂)**:
                      O₂ + 4 e⁻ + 4 H⁺ → **2 H₂O (Agua metabólica)**
                      Bombea **2 protones (H⁺)** al espacio intermembrana.

                    # 6.4.3 — Fosforilación Oxidativa (Mecanismo Quimiosmótico de Mitchell)
                    El bombeo activo coordinado de protones (H⁺) por los complejos I, III y IV genera un gradiente electroquímico transmembrana (**fuerza protón-motriz**) caracterizado por un espacio intermembrana con alta concentración de H⁺ (pH ácido y carga positiva) respecto a la matriz mitocondrial (pH alcalino y carga negativa):
                    - Los protones solo pueden reingresar a la matriz mitocondrial fluyendo a través del canal F0 de la enzima **ATP sintasa** (partícula F0-F1).
                    - El flujo disipativo de protones hace girar la cabeza catalítica F1 sintetizando ATP: **ADP + Pi → ATP**.
                    - *Rendimiento estimado clásico:*
                      - Cada NADH oxidado rinde ≈ **3 ATP** (o 2.5 ATP).
                      - Cada FADH₂ oxidado rinde ≈ **2 ATP** (o 1.5 ATP).

                    # 6.4.4 — Sistemas de Lanzadera y Balance Energético Total
                    Los 2 NADH generados en el citosol durante la glucólisis no pueden atravesar libremente la membrana interna mitocondrial impermeable. Deben ceder sus equivalentes de reducción mediante lanzaderas metabólicas:
                    - **Lanzadera del Malato-Aspartato:**
                      - Presente en tejidos de alta demanda oxidativa constante: **hígado, riñones y miocardio (corazón)**.
                      - Introduce los electrones al NAD⁺ intramitocondrial (Complejo I); cada NADH citosólico rinde 3 ATP.
                      - **Rendimiento total neto: 38 ATP** (o 32 ATP modernos).
                    - **Lanzadera del Glicerol-3-Fosfato:**
                      - Presente en **músculo esquelético y cerebro**.
                      - Cede los electrones al FAD de la membrana interna (formando FADH₂ hacia la CoQ); cada NADH citosólico rinde solo 2 ATP.
                      - **Rendimiento total neto: 36 ATP** (o 30 ATP modernos).

                    # 6.4.5 — Inhibidores y Desacopladores Respiratorios
                    - **Inhibidores de la cadena:** Cianuro (CN⁻), monóxido de carbono (CO) y azida sódica bloquean al Complejo IV (citocromo oxidasa), deteniendo el consumo de O₂ y la síntesis de ATP. El monóxido de carbono y rotenona bloquean el complejo I.
                    - **Desacopladores (Termogenina y 2,4-DNP):** Disipan el gradiente de protones permitiendo el flujo de H⁺ a la matriz sin pasar por la ATP sintasa; la energía se libera en forma de **calor**. La **termogenina (UCP-1)** abunda en la grasa parda de neonatos y animales hibernantes para termogénesis sin escalofríos.
                """,
                conceptosClave = listOf(
                    "Descarboxilación del piruvato y ciclo de Krebs: ocurren en la matriz mitocondrial.",
                    "Cadena transportadora de electrones y ATP sintasa: en las crestas mitocondriales.",
                    "Aceptor final de electrones: el Oxígeno Molecular (O₂), que se reduce a Agua (H₂O).",
                    "Lanzaderas: Malato-Aspartato (hígado/corazón) rinde 38 ATP; Glicerol-3-P (músculo/cerebro) rinde 36 ATP.",
                    "Cianuro e intoxicación por CO: inhiben el complejo IV (citocromo oxidasa)."
                ),
                admissionTip = "Aprende de memoria: en el ciclo de Krebs se producen 3 NADH, 1 FADH2, 1 GTP y 2 CO2 por cada vuelta (multiplica por dos para una molécula de glucosa).",
                admissionExplanation = "La distinción entre lanzaderas (36 vs 38 ATP) y la identidad del oxígeno como aceptor final son dos de los tópicos más preguntados en el examen CEPRUNSA."
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
                ),
                Challenge(
                    id = "bio_t06_s04_c2",
                    statement = "El ciclo del ácido cítrico o ciclo de Krebs tiene lugar en el compartimento mitocondrial conocido como:",
                    options = listOf(
                        "Espacio intermembrana",
                        "Matriz mitocondrial o mitosol",
                        "Membrana externa mitocondrial",
                        "Crestas tilacoidales",
                        "Lámina basal nuclear"
                    ),
                    correctIndex = 1,
                    explanation = "Las enzimas del ciclo de Krebs son hidrosolubles y se ubican disueltas en la matriz mitocondrial, con excepción de la succinato deshidrogenasa que está incrustada en la membrana interna."
                ),
                Challenge(
                    id = "bio_t06_s04_c3",
                    statement = "En la primera reacción del ciclo de Krebs, una molécula de Acetil-CoA (2C) se condensa con una molécula de cuatro carbonos para formar citrato (6C). Dicha molécula aceptora regenerada al final del ciclo es el:",
                    options = listOf(
                        "Alfa-cetoglutarato",
                        "Oxalacetato",
                        "Succinato",
                        "Fumarato",
                        "Malato"
                    ),
                    correctIndex = 1,
                    explanation = "El oxalacetato (o ácido oxalacético de 4 carbonos) se condensa con el resto acetilo (2 carbonos) de la Acetil-CoA para formar ácido cítrico (citrato) catalizado por la citrato sintasa."
                ),
                Challenge(
                    id = "bio_t06_s04_c4",
                    statement = "Por cada vuelta completa del ciclo de Krebs impulsada por un resto acetilo (Acetil-CoA), se obtienen como productos moleculares directos:",
                    options = listOf(
                        "3 NADH, 1 FADH2, 1 GTP (o ATP) y 2 CO2",
                        "2 NADH, 2 FADH2, 2 ATP y 4 CO2",
                        "1 NADH, 3 FADH2, 2 GTP y 1 CO2",
                        "6 NADH, 2 FADH2, 2 ATP y 6 CO2",
                        "4 NADH, 0 FADH2, 1 ATP y 3 CO2"
                    ),
                    correctIndex = 0,
                    explanation = "Cada vuelta del ciclo de Krebs produce 3 NADH, 1 FADH₂, 1 GTP (convertible a ATP) y libera 2 moléculas de CO₂ procedentes de descarboxilaciones oxidativas."
                ),
                Challenge(
                    id = "bio_t06_s04_c5",
                    statement = "En las células del músculo esquelético y del tejido cerebral, los 2 NADH formados en el citoplasma durante la glucólisis transfieren sus electrones a la mitocondria a través de la lanzadera de:",
                    options = listOf(
                        "Malato-aspartato rindiendo 38 ATP totales",
                        "Glicerol-3-fosfato rindiendo 36 ATP totales",
                        "Citrato-oxalacetato rindiendo 32 ATP totales",
                        "Carnitina oxidativa rindiendo 24 ATP totales",
                        "Creatina fosfato rindiendo 40 ATP totales"
                    ),
                    correctIndex = 1,
                    explanation = "En músculo y cerebro opera la lanzadera del glicerol-3-fosfato, la cual entrega electrones al FAD mitocondrial originando 2 ATP por cada NADH citosólico, lo que da un balance global de 36 ATP por glucosa."
                ),
                Challenge(
                    id = "bio_t06_s04_c6",
                    statement = "En células con máxima eficiencia bioenergética como los hepatocitos y las fibras miocárdicas del corazón, opera una lanzadera que entrega los electrones al NAD+ de la matriz mitocondrial rindiendo un balance teórico máximo de:",
                    options = listOf(
                        "38 ATP por la lanzadera malato-aspartato",
                        "36 ATP por la lanzadera del citrato",
                        "2 ATP por la vía láctica",
                        "42 ATP por la lanzadera de fosfato",
                        "30 ATP por difusión pasiva"
                    ),
                    correctIndex = 0,
                    explanation = "La lanzadera malato-aspartato transporta electrones hacia el Complejo I mitocondrial (vía NADH) en hígado, riñón y corazón, rindiendo un balance global máximo de 38 ATP por molécula de glucosa."
                ),
                Challenge(
                    id = "bio_t06_s04_c7",
                    statement = "La intoxicación letal por cianuro de potasio produce una asfixia histotóxica fulminante debido a que el ion cianuro se une irreversiblemente al átomo de hierro del complejo respiratorio mitocondrial denominado:",
                    options = listOf(
                        "NADH deshidrogenasa (Complejo I)",
                        "Citocromo c oxidasa (Complejo IV)",
                        "Succinato deshidrogenasa (Complejo II)",
                        "Coenzima Q ubiquinona",
                        "ATP sintasa F1"
                    ),
                    correctIndex = 1,
                    explanation = "El cianuro inhibe de forma potente a la citocromo c oxidasa (Complejo IV), impidiendo la transferencia de electrones al oxígeno, colapsando el gradiente protónico y suprimiendo la síntesis celular de ATP."
                ),
                Challenge(
                    id = "bio_t06_s04_c8",
                    statement = "La única enzima del ciclo de Krebs que no se encuentra libre en la matriz mitocondrial sino inserta como proteína integral en la membrana mitocondrial interna formando el Complejo II de la cadena respiratoria es la:",
                    options = listOf(
                        "Citrato sintasa",
                        "Succinato deshidrogenasa",
                        "Alfa-cetoglutarato deshidrogenasa",
                        "Fumarasa",
                        "Isocitrato deshidrogenasa"
                    ),
                    correctIndex = 1,
                    explanation = "La succinato deshidrogenasa está unida a la membrana interna mitocondrial y actúa de puente físico directo entre el ciclo de Krebs y la cadena de transporte de electrones como Complejo II."
                ),
                Challenge(
                    id = "bio_t06_s04_c9",
                    statement = "En el tejido adiposo pardo (grasa parda) de los recién nacidos, la proteína desacopladora termogenina (UCP-1) permite que los protones del espacio intermembrana regresen a la matriz sin pasar por la ATP sintasa. La consecuencia fisiológica inmediata de este desacoplamiento es:",
                    options = listOf(
                        "Una sobreproducción masiva de ATP para contracción",
                        "La liberación de la energía del gradiente en forma de calor corporal (termogénesis)",
                        "La parada irreversible de la glucólisis por falta de glucosa",
                        "La formación excesiva de ácido láctico en sangre",
                        "La calcificación del tejido adiposo"
                    ),
                    correctIndex = 1,
                    explanation = "La termogenina desacopla la cadena de transporte de electrones de la fosforilación oxidativa, disipando la fuerza protón-motriz exclusivamente como energía térmica para mantener la temperatura en neonatos."
                ),
                Challenge(
                    id = "bio_t06_s04_c10",
                    statement = "Durante la conversión previa del piruvato (3C) en Acetil-CoA (2C) antes de ingresar al ciclo de Krebs, la enzima piruvato deshidrogenasa cataliza una reacción de:",
                    options = listOf(
                        "Fosforilación a nivel de sustrato y reducción de FAD",
                        "Descarboxilación oxidativa con producción de CO2 y NADH",
                        "Condensación con oxalacetato para formar citrato",
                        "Hidrólisis consumiendo dos moléculas de ATP",
                        "Carboxilación neta dependiente de biotina"
                    ),
                    correctIndex = 1,
                    explanation = "La acetilación del piruvato es una descarboxilación oxidativa: se remueve un átomo de carbono como CO₂ y se transfieren electrones al NAD⁺ generando NADH."
                ),
                Challenge(
                    id = "bio_t06_s04_c11",
                    statement = "¿Cuál de los siguientes transportadores de electrones de la membrana mitocondrial interna es un lípido quinónico móvil no proteico que recoge equivalentes de reducción de los Complejos I y II?",
                    options = listOf(
                        "Citocromo c",
                        "Coenzima Q (Ubiquinona)",
                        "Ferredoxina",
                        "Plastocianina",
                        "Proteína de Rieske"
                    ),
                    correctIndex = 1,
                    explanation = "La ubiquinona o coenzima Q es una molécula lipófila pequeña que se difunde libremente por la bicapa hidrofóbica de la membrana interna transportando electrones hacia el Complejo III."
                ),
                Challenge(
                    id = "bio_t06_s04_c12",
                    statement = "En la teoría quimiosmótica formulada por Peter Mitchell, los complejos enzimáticos I, III y IV de la cadena respiratoria mitocondrial bombean iones hidrógeno (H+) desde:",
                    options = listOf(
                        "El espacio intermembrana hacia el citoplasma celular",
                        "La matriz mitocondrial hacia el espacio intermembrana",
                        "El interior de las crestas hacia el estroma cloroplástico",
                        "El núcleo hacia el interior de la matriz",
                        "La vacuola hacia el retículo liso"
                    ),
                    correctIndex = 1,
                    explanation = "Los complejos I, III y IV actúan como bombas de protones impulsadas por electrones que translocan protones desde la matriz mitocondrial hacia el espacio intermembranoso, generando el gradiente quimiosmótico."
                ),
                Challenge(
                    id = "bio_t06_s04_c13",
                    statement = "¿Cuántas moléculas de dióxido de carbono (CO2) se desprenden en total durante la combustión catabólica completa de una molécula de glucosa mediante respiración celular aeróbica?",
                    options = listOf(
                        "2 moléculas",
                        "4 moléculas",
                        "6 moléculas",
                        "12 moléculas",
                        "36 moléculas"
                    ),
                    correctIndex = 2,
                    explanation = "Los 6 átomos de carbono de la glucosa se eliminan como 6 moléculas de CO₂: dos durante la descarboxilación oxidativa de los 2 piruvatos a nivel de la piruvato deshidrogenasa y cuatro durante las dos vueltas del ciclo de Krebs."
                ),
                Challenge(
                    id = "bio_t06_s04_c14",
                    statement = "El antibiótico oligomicina inhibe el canal F0 de la ATP sintasa impidiendo el retorno de protones a la matriz mitocondrial. En una suspensión mitocondrial tratada con oligomicina se constatará:",
                    options = listOf(
                        "Un cese en la síntesis de ATP por fosforilación oxidativa",
                        "Una aceleración masiva del ciclo de Calvin",
                        "La activación desmedida de la fermentación alcohólica",
                        "La conversión instantánea de agua en oxígeno molecular",
                        "La disolución de la membrana celular externa"
                    ),
                    correctIndex = 0,
                    explanation = "Al bloquear la subunidad F0 de la ATP sintasa, la oligomicina detiene el flujo de protones hacia la matriz, bloqueando mecánicamente la fosforilación de ADP y la síntesis de ATP."
                ),
                Challenge(
                    id = "bio_t06_s04_c15",
                    statement = "La única reacción del ciclo de Krebs donde se produce una fosforilación a nivel de sustrato que genera directamente una molécula de nucleótido trifosfato (GTP o ATP) es catalizada por la enzima:",
                    options = listOf(
                        "Citrato sintasa",
                        "Succinil-CoA sintetasa (succinato tioquinasa)",
                        "Aconitasa",
                        "Malato deshidrogenasa",
                        "Fumarasa"
                    ),
                    correctIndex = 1,
                    explanation = "La escisión del enlace tioéster rico en energía de la Succinil-CoA para formar succinato se acopla a la fosforilación de GDP a GTP (o ADP a ATP), siendo la única fosforilación a nivel de sustrato del ciclo."
                ),
                Challenge(
                    id = "bio_t06_s04_c16",
                    statement = "Al comparar termodinámicamente la respiración celular aeróbica frente a la fermentación anaerobia de la glucosa, la degradación aerobia resulta cuantitativamente:",
                    options = listOf(
                        "Menos eficiente porque consume todo el oxígeno tisular",
                        "Mucho más eficiente, rindiendo de 18 a 19 veces más ATP por molécula de glucosa",
                        "Idéntica en rendimiento ya que ambas producen 2 ATP netos",
                        "Incapaz de sintetizar agua metabólica en tejidos nobles",
                        "Exclusiva de células procariotas carentes de membrana"
                    ),
                    correctIndex = 1,
                    explanation = "La fermentación produce solo 2 ATP netos por glucosa, mientras que la respiración aeróbica produce de 36 a 38 ATP netos, lo que representa una ganancia energética entre 18 y 19 veces mayor."
                ),
                Challenge(
                    id = "bio_t06_s04_c17",
                    statement = "En la cadena respiratoria mitocondrial, el flujo de electrones a través del Complejo IV reduce el oxígeno para dar origen al agua conocida fisiológicamente como:",
                    options = listOf(
                        "Agua coloidal plasmática",
                        "Agua metabólica o de combustión",
                        "Agua de cristalización ósea",
                        "Agua higroscópica superficial",
                        "Agua libre extracelular"
                    ),
                    correctIndex = 1,
                    explanation = "El agua formada en el interior de la mitocondria por la unión del oxígeno con electrones y protones al final de la cadena respiratoria se denomina agua metabólica."
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
            subtema = "7.1",
            title = "Tejidos Vegetales: Meristemos y Protectores",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t07_s01",
                asignatura = "Biología",
                semana = 7,
                titulo = "Tejidos Embrionarios y de Cubierta Vegetal",
                resumen = """Meristemos proliferativos inductores del crecimiento vegetal y tejidos tegumentarios de aislamiento y protección.

                    # 7.1.1 — Clasificación General de los Tejidos Vegetales
                    Un tejido vegetal es una agrupación coordinada de células vegetales con origen embrionario común y funciones fisiológicas compartidas. Se dividen en:
                    - **Tejidos embrionarios o meristemáticos:** Células indiferenciadas en perpetua división mitótica (crecimiento).
                    - **Tejidos adultos o definitivos:** Células diferenciadas y especializadas (protectores, fundamentales, mecánicos, conductores y secretores).

                    # 7.1.2 — Tejidos Meristemáticos o Embrionarios
                    Sus células se caracterizan por ser **pequeñas, isodiamétricas, con pared celular primaria delgada de celulosa, citoplasma denso sin grandes vacuolas, proplastidios y núcleo prominente con alta actividad mitótica**. Permiten el crecimiento indeterminado y la regeneración de la planta:
                    - **1. Meristemo Primario o Apical:**
                      - *Origen:* Proviene directamente del embrión de la semilla.
                      - *Ubicación:* En los ápices de los tallos (yemas terminales y axilares) y en los extremos de las raíces (protegido por la **cofia, pilorriza o caliptra**).
                      - *Función:* Responsable del **crecimiento longitudinal en altura y profundidad** (crecimiento primario de la planta). Da origen a los tres tejidos meristemáticos primarios: protodermis (futura epidermis), meristemo fundamental (futuros parénquimas/colénquima) y procámbium (futuro xilema y floema primarios).
                    - **2. Meristemo Secundario o Lateral:**
                      - *Origen:* Se forma a partir de la desdiferenciación de células parenquimatosas adultas en plantas que presentan crecimiento leñoso (gimnospermas y dicotiledóneas).
                      - *Ubicación:* Dispuestos concéntricamente a lo largo del tallo y raíz.
                      - *Función:* Responsable del **crecimiento en grosor o espesor** (crecimiento secundario o diametral). Comprende dos anillos concéntricos:
                        - **Cámbium vascular:** Meristemo interno que origina **xilema secundario (madera o leño)** hacia el interior y **floema secundario (líber)** hacia el exterior. Forma los anillos anuales de crecimiento en los árboles.
                        - **Cámbium suberoso o Felógeno:** Meristemo externo que genera **súber o corcho** hacia el exterior y **felodermis** (parénquima cortical vivo) hacia el interior. El conjunto de súber + felógeno + felodermis constituye la **peridermis** (corteza externa protectora).

                    # 7.1.3 — Tejidos Protectores o Tegumentarios
                    Recubren la superficie exterior de la planta protegiéndola contra la desecación por evaporación, patógenos (hongos, bacterias), abrasión mecánica y herbívoros:
                    - **1. Epidermis:**
                      - *Características:* Capa uniestratificada de células **vivas**, aplanadas, íntimamente unidas y desprovistas de cloroplastos (transparentes, permiten el paso de la luz al mesófilo). Recubre hojas, flores, frutos y tallos/raíces jóvenes herbáceos.
                      - *Cutina y Cutícula:* En órganos aéreos, la cara externa de las células epidérmicas segrega una capa cerosa impermeable llamada **cutícula** (formada por cutina y ceras) que reduce drásticamente la pérdida transpiratoria de agua.
                      - *Especializaciones epidérmicas:*
                        - **Estomas:** Complejos celulares microscópicos abundantes en el envés de las hojas formados por **dos células oclusivas o de guarda** (arriñonadas, con cloroplastos y pared engrosada en la cara interna) que delimitan un poro regulable llamado **ostiolo**. Regulan la transpiración de vapor de agua y el intercambio de gases (CO₂ y O₂) según su turgencia osmótica.
                        - **Tricomas o Pelos:** Apéndices epidérmicos uni o pluricelulares. Cumplen funciones protectoras contra la radiación, reducen corrientes de aire desecantes, defienden contra insectos (pelos urticantes con histamina en la ortiga) o secretoras (pelos glandulares con aceites esenciales aromáticos).
                        - **Pelos absorbentes:** En la zona pilífera de la raíz joven; evaginaciones tubulares unicelulares que multiplican la superficie de absorción de agua y sales minerales.
                    - **2. Peridermis (Corteza suberificada):**
                      - Reemplaza a la epidermis en tallos y raíces con crecimiento secundario maduro (árboles y arbustos leñosos).
                      - *Súber o Corcho:* Capas celulares externas muertas a la madurez cuyas paredes están fuertemente impregnadas de **suberina** (lípido impermeable). Es un aislante térmico y mecánico excepcional que resiste el fuego y parásitos.
                      - *Lenticelas:* Pequeñas grietas o poros visibles a simple vista en la corteza leñosa donde las células suberosas se disponen de forma laxa, dejando grandes meatos intercelulares que **permiten el intercambio gaseoso entre los tejidos leñosos internos y la atmósfera**, sustituyendo a los estomas que se pierden con la caída de la epidermis.
                """,
                conceptosClave = listOf(
                    "Meristemo primario o apical: crecimiento en longitud (ápice caulinar y radical con cofia).",
                    "Meristemo secundario o lateral: crecimiento en grosor (cámbium vascular y felógeno).",
                    "Cámbium vascular: xilema hacia adentro y floema hacia afuera; Felógeno forma la peridermis.",
                    "Epidermis: células vivas transparentes, cutícula, estomas con células de guarda y tricomas.",
                    "Peridermis: súber con suberina (células muertas) y lenticelas para intercambio de gases."
                ),
                admissionTip = "Recuerda el contraste anatómico: el intercambio de gases en hojas jóvenes lo hacen los ESTOMAS (en epidermis viva); en troncos y ramas leñosas lo hacen las LENTICELAS (en peridermis muerta).",
                admissionExplanation = "La cofia o caliptra de la raíz protege al meristemo apical de la fricción contra el suelo y presenta estatolitos para el gravitropismo positivo."
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
                ),
                Challenge(
                    id = "bio_t07_s01_c2",
                    statement = "El tejido meristemático primario ubicado en los ápices de los tallos y raíces cuya actividad mitótica continua posibilita el crecimiento longitudinal de la planta en altura y profundidad corresponde al:",
                    options = listOf(
                        "Cámbium suberoso o felógeno",
                        "Meristemo apical",
                        "Colénquima angular",
                        "Cámbium vascular",
                        "Esclerénquima pétreo"
                    ),
                    correctIndex = 1,
                    explanation = "Los meristemos apicales o primarios se encuentran en los extremos de tallos y raíces y se encargan del crecimiento en longitud de los órganos vegetales."
                ),
                Challenge(
                    id = "bio_t07_s01_c3",
                    statement = "En el tallo de un árbol de eucalipto, el meristemo lateral que genera madera (xilema secundario) hacia la parte interna del tronco y corteza conductora (floema secundario) hacia la parte externa se denomina:",
                    options = listOf(
                        "Cámbium vascular",
                        "Cámbium suberoso o felógeno",
                        "Protodermis apical",
                        "Caliptra radical",
                        "Epidermis uniestratificada"
                    ),
                    correctIndex = 0,
                    explanation = "El cámbium vascular es el meristemo secundario cilíndrico que forma xilema secundario hacia el interior y floema secundario hacia el exterior, ensanchando el tronco año tras año."
                ),
                Challenge(
                    id = "bio_t07_s01_c4",
                    statement = "El extremo terminal de la raíz en crecimiento está resguardado mecánicamente contra la abrasión de las partículas del suelo por una estructura protectora en forma de dedal llamada:",
                    options = listOf(
                        "Cofia, caliptra o pilorriza",
                        "Tricoma radical",
                        "Zona suberificada",
                        "Lenticela apical",
                        "Cámbium cortical"
                    ),
                    correctIndex = 0,
                    explanation = "La cofia o caliptra es un capuchón celular que envuelve al meristemo apical de la raíz, protegiéndolo del roce mecánico mientras se abre paso a través de la tierra."
                ),
                Challenge(
                    id = "bio_t07_s01_c5",
                    statement = "Los estomas son aparatos reguladores del intercambio de gases y transpiración foliar. A diferencia de las células epidérmicas comunes adyacentes que son transparentes, las células oclusivas o de guarda se caracterizan por:",
                    options = listOf(
                        "Estar totalmente muertas y lignificadas",
                        "Contener cloroplastos fotosintéticos y regular su turgencia",
                        "Carecer de núcleo y de membrana plasmática",
                        "Secretar suberina en sus paredes externas",
                        "Transformarse en pelos urticantes"
                    ),
                    correctIndex = 1,
                    explanation = "Las células oclusivas poseen cloroplastos activos y paredes con engrosamientos desiguales que les permiten arquearse al cargarse de agua por ósmosis, abriendo el ostiolo estomático."
                ),
                Challenge(
                    id = "bio_t07_s01_c6",
                    statement = "La sustancia lipídica impermeable que impregna las paredes celulares secundarias del súber o corcho en la peridermis madura confiriéndole resistencia al agua, ataques de hongos y aislamiento térmico es la:",
                    options = listOf(
                        "Celulosa pura",
                        "Suberina",
                        "Pectina ácida",
                        "Hemicelulosa",
                        "Queratina dura"
                    ),
                    correctIndex = 1,
                    explanation = "La suberina es un polímero de ácidos grasos hidrofóbicos que impregna las paredes del súber o corcho haciéndolas impermeables al agua y los gases."
                ),
                Challenge(
                    id = "bio_t07_s01_c7",
                    statement = "La capa cerosa segregada por la epidermis en hojas y tallos jóvenes para evitar la evaporación desmedida de agua en climas secos está compuesta fundamentalmente por:",
                    options = listOf(
                        "Quitina",
                        "Cutina",
                        "Mureína",
                        "Colágeno",
                        "Glucógeno"
                    ),
                    correctIndex = 1,
                    explanation = "La cutícula que recubre a la epidermis vegetal está formada por cutina y ceras, que forman una barrera lipídica contra la transpiración cuticular no deseada."
                ),
                Challenge(
                    id = "bio_t07_s01_c8",
                    statement = "En la planta silvestre de la ortiga, las microestructuras epidérmicas que causan ardor y prurito intenso al contacto por inyectar histamina y ácido fórmico en la piel corresponden a:",
                    options = listOf(
                        "Lenticelas leñosas",
                        "Tricomas o pelos urticantes",
                        "Células oclusivas modificadas",
                        "Vasos de xilema leñoso",
                        "Meristemos secundarios"
                    ),
                    correctIndex = 1,
                    explanation = "Los pelos urticantes de la ortiga son tricomas glandulares modificados con una punta de sílice quebradiza que actúa como aguja hipodérmica inyectando toxinas irritantes."
                ),
                Challenge(
                    id = "bio_t07_s01_c9",
                    statement = "El conjunto tisular protector periférico de los tallos y raíces leñosas formado por súber (corcho), felógeno (cámbium suberoso) y felodermis recibe la denominación botánica de:",
                    options = listOf(
                        "Epidermis glandular",
                        "Peridermis",
                        "Endodermis de Caspary",
                        "Hipodermis colenquimatosa",
                        "Mesófilo foliar"
                    ),
                    correctIndex = 1,
                    explanation = "La peridermis es la cubierta protectora secundaria formada por el súber (externo), el felógeno (meristemo generador intermedio) y la felodermis (tejido vivo interno)."
                ),
                Challenge(
                    id = "bio_t07_s01_c10",
                    statement = "Las células meristemáticas embrionarias se distinguen citológicamente de las células vegetales adultas diferenciadas por poseer:",
                    options = listOf(
                        "Pared secundaria gruesa lignificada y gran vacuola central",
                        "Pared primaria delgada de celulosa, núcleo grande y citoplasma denso",
                        "Ausencia total de membrana plasmática",
                        "Impregnación completa de suberina impermeable",
                        "Cloroplastos hipertrofiados sin capacidad mitótica"
                    ),
                    correctIndex = 1,
                    explanation = "Las células de los meristemos son totipotentes o indiferenciadas, caracterizadas por paredes celulares primarias delgadas, núcleos grandes, citoplasma denso y rápida división mitótica."
                ),
                Challenge(
                    id = "bio_t07_s01_c11",
                    statement = "Las proyecciones tubulares unicelulares de la epidermis radical ubicadas en la zona pilífera que incrementan en cientos de veces la superficie de contacto con la solución del suelo se denominan:",
                    options = listOf(
                        "Lenticelas radicales",
                        "Pelos absorbentes o radicales",
                        "Células estomáticas",
                        "Traqueidas cribosas",
                        "Tricomas secretores"
                    ),
                    correctIndex = 1,
                    explanation = "Los pelos absorbentes son evaginaciones de células epidérmicas (tricoblastos) especializadas en la captación osmótica de agua y absorción activa de sales minerales."
                ),
                Challenge(
                    id = "bio_t07_s01_c12",
                    statement = "Cuando las células oclusivas de un estoma acumulan activamente iones potasio (K+) en su interior, el agua ingresa a ellas por ósmosis tornándolas turgentes. La consecuencia fisiológica inmediata de este estado es:",
                    options = listOf(
                        "El cierre hermético del ostiolo para retener agua",
                        "La apertura del ostiolo para permitir el intercambio de gases",
                        "La caída definitiva de la hoja por abscisión",
                        "La muerte por plasmólisis del estoma",
                        "La transformación del estoma en lenticela"
                    ),
                    correctIndex = 1,
                    explanation = "Al aumentar su turgencia, las células de guarda se expanden y arquean hacia el exterior gracias a la rigidez de su pared interna, provocando la apertura del ostiolo para la entrada de CO₂."
                ),
                Challenge(
                    id = "bio_t07_s01_c13",
                    statement = "El meristemo secundario responsable de producir felodermis (células parenquimatosas vivas) hacia el lado interno de la corteza vegetal corresponde al:",
                    options = listOf(
                        "Meristemo apical caulinar",
                        "Felógeno (cámbium suberoso)",
                        "Procámbium primario",
                        "Cámbium vascular",
                        "Protodermis foliar"
                    ),
                    correctIndex = 1,
                    explanation = "El felógeno se divide periclinalmente originando súber o corcho hacia afuera y una fina capa de parénquima llamada felodermis hacia adentro."
                )
            )
        ),
        LessonNode(
            id = "bio_t07_s02",
            subjectId = "biologia",
            semana = 7,
            subtema = "7.2",
            title = "Tejidos Vegetales: Fundamentales, Mecánicos y Vasculares",
            depth = LessonDepth.NORMAL,
            theory = LessonTheory(
                id = "th_bio_t07_s02",
                asignatura = "Biología",
                semana = 7,
                titulo = "Parénquimas, Soporte y Conducción en Plantas",
                resumen = """Metabolismo nutricional, sostén arquitectónico y transporte de savia a larga distancia en el cuerpo de la planta.

                    # 7.2.1 — Tejidos Fundamentales o Parénquimas
                    Constituyen la mayor parte de la masa corporal de la planta (relleno). Formados por células **vivas**, poliédricas, poco diferenciadas, con pared celular primaria delgada de celulosa y capacidad de desdiferenciarse (totipotencia para cicatrización y regeneración):
                    - **1. Clorénquima (Parénquima Clorofiliano o Asimilador):**
                      - Abundante en las hojas (mesófilo) y tallos verdes jóvenes herbáceos.
                      - Células repletas de cloroplastos dedicadas a la fotosíntesis:
                        - *En empalizada:* Células alargadas y compactas en el haz foliar; captan la mayor radiación solar directa.
                        - *Lagunar o esponjoso:* Células redondeadas con amplios espacios intercelulares (meatos) en el envés; facilitan la difusión de CO₂ y O₂ hacia los estomas.
                    - **2. Parénquima Reservante:**
                      - Especializado en el almacenamiento de nutrientes insolubles o sustancias de reserva:
                        - *Amiláceo:* Almacena **almidón** en leucoplastos (amiloplastos). En tubérculos (papa), raíces tuberosas (yuca, camote), rizomas y semillas (maíz, trigo).
                        - *Acuífero:* Almacena agua en grandes vacuolas con mucílagos hidrofílicos. Típico de plantas crasuláceas y xerófitas de desierto (cactus, sábila).
                        - *Aerífero (Aerénquima):* Células que delimitan gigantescas lagunas de aire intercelulares. Brinda flotabilidad e intercambio de gases en plantas acuáticas (hidrófitas como la totora o el lirio de agua).

                    # 7.2.2 — Tejidos Mecánicos o de Sostén
                    Constituyen el esqueleto arquitectónico vegetal que permite a las plantas mantenerse erguidas contra la fuerza de la gravedad y resistir tensiones mecánicas generadas por el viento o el peso de ramas y frutos:
                    - **1. Colénquima:**
                      - Constituido por células **vivas**, alargadas, con **paredes primarias desigualmente engrosadas** ricas en **celulosa, hemicelulosa y pectina** (sin lignina).
                      - Otorga **flexibilidad y soporte elástico** a órganos jóvenes y herbáceos en crecimiento que aún se están elongando: pecíolos de hojas, pedúnculos florales, tallos herbáceos tiernos (como en el apio).
                      - Tipos morfológicos: angular, lagunar y lamelar.
                    - **2. Esclerénquima:**
                      - Constituido por células **muertas a la madurez**, con paredes celulares secundarias uniformemente engrosadas e impregnadas de **lignina** (polímero fenólico hidrofóbico rígido que impide la nutrición celular causando la muerte programada del protoplasto).
                      - Otorga **rigidez, máxima dureza y soporte no deformable** a órganos adultos que han culminado su crecimiento:
                        - *Fibras esclerenquimatosas:* Células alargadas fusiformes con extremos puntiagudos (fibras textiles de lino, cáñamo, yute).
                        - *Esclereidas (Células pétreas):* Células cortas de forma irregular con paredes extremadamente lignificadas. Otorgan la textura arenosa dura a la pulpa de la **pera**, el endocarpio leñoso del cuesco del melocotón o la cáscara pétrea de nueces y almendras.

                    # 7.2.3 — Tejidos Conductores o Vasculares
                    Red continua de tuberías microscópicas que recorre toda la planta comunicando raíces, tallos y hojas para el transporte de fluidos:
                    - **1. Xilema (Leño):**
                      - Conduce la **savia bruta** (agua y sales minerales disueltas absorbidas por las raíces).
                      - *Dirección del flujo:* **Unidireccional y ascendente** (desde la raíz hacia el tallo y las hojas).
                      - *Fuerza motriz impulsora:* La **tensión-cohesión-adhesión transpiratoria** (la evaporación de agua en los estomas foliares genera una presión negativa que succiona la columna de agua).
                      - *Componentes celulares:* Células **muertas** a la madurez con paredes secundarias lignificadas y desprovistas de citoplasma:
                        - *Traqueidas:* Células alargadas con extremos biselados y punteaduras areoladas; presentes en todas las plantas vasculares (único elemento en gimnospermas).
                        - *Elementos de los vasos (Tráqueas):* Células más cortas y anchas unidas por extremos abiertos o placas perforadas formando conductos continuos muy eficientes; exclusivos y característicos de las **angiospermas**.
                    - **2. Floema (Líber):**
                      - Conduce la **savia elaborada** (solución rica en sacarosa [azúcar de transporte], aminoácidos, hormonas y vitaminas sintetizados en órganos fotosintéticos).
                      - *Dirección del flujo:* **Bidireccional o multidireccional** (desde las fuentes productoras [hojas adultas] hacia los sumideros de consumo o reserva [raíces, frutos, ápices, flores]) impulsado por el **flujo por presión osmótica (hipótesis de Münch)**.
                      - *Componentes celulares:* Células **vivas** que carecen de núcleo, vacuolas y ribosomas a la madurez para no obstruir el paso:
                        - *Células o tubos cribosos:* Se alinean longitudinalmente comunicadas por **placas cribosas** cribadas por poros revestidos de calosa.
                        - *Células acompañantes o anexas:* Células parenquimatosas vivas con núcleo activo conectadas por plasmodesmos a los elementos cribosos; realizan el control metabólico y cargan activamente la sacarosa consumiendo ATP.
                """,
                conceptosClave = listOf(
                    "Clorénquima: fotosíntesis (empalizada y lagunar en hojas).",
                    "Parénquimas de reserva: amiláceo (almidón en papa), acuífero (agua en cactus) y aerífero (aire en flotadoras).",
                    "Colénquima: soporte flexible en órganos jóvenes (células vivas con paredes ricas en pectina/celulosa).",
                    "Esclerénquima: soporte rígido (células muertas lignificadas: fibras y esclereidas en cáscaras/pera).",
                    "Xilema (leño): células muertas (traqueidas y tráqueas); savia bruta ascendente por transpiración.",
                    "Floema (líber): células vivas (tubos cribosos y células anexas); savia elaborada multidireccional."
                ),
                admissionTip = "Regla de oro de tejidos de sostén: ¿Vivo y flexible? COLÉNQUIMA. ¿Muerto y rígido con lignina? ESCLERÉNQUIMA.",
                admissionExplanation = "Las tráqueas del xilema son células muertas perforadas; los tubos cribosos del floema son células vivas desprovistas de núcleo sostenidas por células acompañantes."
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
                ),
                Challenge(
                    id = "bio_t07_s02_c2",
                    statement = "El tejido vegetal mecánico que brinda flexibilidad y sostén elástico a los pecíolos de las hojas y tallos jóvenes herbáceos en crecimiento, constituido por células vivas con paredes celulares engrosadas desigualmente de celulosa y pectina, es el:",
                    options = listOf(
                        "Colénquima",
                        "Esclerénquima",
                        "Xilema secundario",
                        "Felógeno",
                        "Aerénquima"
                    ),
                    correctIndex = 0,
                    explanation = "El colénquima es el tejido de sostén vivo y plástico por excelencia en plantas jóvenes, cuyas células no están lignificadas sino engrosadas con pectinas y celulosa."
                ),
                Challenge(
                    id = "bio_t07_s02_c3",
                    statement = "El transporte de savia bruta (agua y solutos inorgánicos) desde las raíces hacia las copas de los árboles se realiza a través de tubos continuos formados por células muertas lignificadas que integran el:",
                    options = listOf(
                        "Floema o líber",
                        "Xilema o leño",
                        "Cámbium suberoso",
                        "Colénquima lagunar",
                        "Parénquima acuífero"
                    ),
                    correctIndex = 1,
                    explanation = "El xilema conduce la savia bruta en dirección ascendente unidireccional y sus elementos funcionales principales (traqueidas y elementos de los vasos) están muertos y lignificados a la madurez."
                ),
                Challenge(
                    id = "bio_t07_s02_c4",
                    statement = "La savia elaborada rica en sacarosa y aminoácidos fluye de forma multidireccional desde los órganos fuente hacia los sumideros a través de los tubos cribosos del floema. Dichos tubos se caracterizan celularmente por ser:",
                    options = listOf(
                        "Células muertas deshidratadas y lignificadas",
                        "Células vivas que carecen de núcleo a la madurez y dependen de células anexas",
                        "Células embrionarias en continua división mitótica",
                        "Células pétreas con poros microscópicos areolados",
                        "Células con cloroplastos fotosintéticos gigantes"
                    ),
                    correctIndex = 1,
                    explanation = "Los elementos de los tubos cribosos del floema son células vivas que pierden el núcleo durante su diferenciación para facilitar el flujo continuo de savia, manteniendo su vitalidad gracias al soporte metabólico de las células acompañantes."
                ),
                Challenge(
                    id = "bio_t07_s02_c5",
                    statement = "En el tallo carnoso de un cactus de las zonas desérticas de la costa peruana, el tejido fundamental hipertrofiado que retiene masivamente agua gracias a mucílagos intracelulares corresponde al:",
                    options = listOf(
                        "Parénquima clorofiliano",
                        "Parénquima acuífero",
                        "Parénquima aerífero",
                        "Esclerénquima de fibras",
                        "Colénquima angular"
                    ),
                    correctIndex = 1,
                    explanation = "El parénquima acuífero abunda en las plantas suculentas (cactáceas) y almacena grandes volúmenes de agua en sus vacuolas para resistir las sequías prolongadas."
                ),
                Challenge(
                    id = "bio_t07_s02_c6",
                    statement = "Las plantas acuáticas como la totora (*Schoenoplectus californicus*) del lago Titicaca flotan y mantienen oxigenados sus órganos sumergidos gracias a un tejido fundamental con grandes cavidades o meatos de aire llamado:",
                    options = listOf(
                        "Aerénquima (parénquima aerífero)",
                        "Parénquima amiláceo",
                        "Xilema primario",
                        "Colénquima lagunar",
                        "Súber o corcho"
                    ),
                    correctIndex = 0,
                    explanation = "El aerénquima o parénquima aerífero presenta grandes cámaras intercelulares cargadas de aire que facilitan la flotabilidad y la ventilación interna de órganos en plantas acuáticas."
                ),
                Challenge(
                    id = "bio_t07_s02_c7",
                    statement = "En las hojas de las plantas dicotiledóneas, el clorénquima orientado hacia la cara superior (haz) formado por células cilíndricas densamente empaquetadas ricas en cloroplastos recibe el nombre de:",
                    options = listOf(
                        "Parénquima lagunar o esponjoso",
                        "Parénquima en empalizada",
                        "Parénquima de reserva amilácea",
                        "Colénquima lamelar",
                        "Peridermis foliar"
                    ),
                    correctIndex = 1,
                    explanation = "El parénquima en empalizada se localiza bajo la epidermis superior y consta de células alargadas perpendiculares a la superficie que reciben directamente la luz solar para la fotosíntesis."
                ),
                Challenge(
                    id = "bio_t07_s02_c8",
                    statement = "El motor físico principal que impulsa el ascenso continuo de la columna de savia bruta por el xilema desde la raíz hasta las hojas más altas en árboles gigantescos se fundamenta en la teoría de:",
                    options = listOf(
                        "Flujo por presión osmótica de Münch",
                        "Tensión-cohesión-adhesión transpiratoria de Dixon y Joly",
                        "Transporte activo primario por bombas de ATP",
                        "Fagocitosis simplástica",
                        "Plasmólisis retráctil"
                    ),
                    correctIndex = 1,
                    explanation = "La teoría de la tensión-cohesión explica que la transpiración foliar genera una fuerte tensión (presión negativa) que succiona la savia bruta, mantenida como hilo ininterrumpido por los puentes de hidrógeno del agua."
                ),
                Challenge(
                    id = "bio_t07_s02_c9",
                    statement = "En el endospermo de los granos de maíz y en los tubérculos de la papa se almacenan abundantes gránulos de reserva glucídica dentro de amiloplastos. El tejido responsable de este almacenamiento es el:",
                    options = listOf(
                        "Parénquima amiláceo",
                        "Colénquima de sostén",
                        "Esclerénquima fibroso",
                        "Xilema leñoso",
                        "Floema acoplado"
                    ),
                    correctIndex = 0,
                    explanation = "El parénquima amiláceo es el tejido de reserva energética vegetal que almacena grandes cantidades de almidón en leucoplastos (amiloplastos)."
                ),
                Challenge(
                    id = "bio_t07_s02_c10",
                    statement = "Las fibras textiles de uso industrial extraídas del lino (*Linum usitatissimum*) y del cáñamo, sumamente resistentes a la tracción y compresión mecánica, corresponden botánicamente a:",
                    options = listOf(
                        "Fibras de esclerénquima lignificado",
                        "Bandas de colénquima turgente",
                        "Cordones de células meristemáticas",
                        "Conductos de xilema primario",
                        "Tricomas epidérmicos absorbentes"
                    ),
                    correctIndex = 0,
                    explanation = "Las fibras textiles comerciales de lino, cáñamo y yute son paquetes de células esclerenquimatosas muertas alargadas con paredes fuertemente lignificadas."
                ),
                Challenge(
                    id = "bio_t07_s02_c11",
                    statement = "Los elementos conductores más evolucionados y anchos del xilema que forman vasos continuos y abiertos característicos de las plantas con flores (angiospermas) se denominan:",
                    options = listOf(
                        "Traqueidas biseladas",
                        "Elementos de los vasos o tráqueas",
                        "Tubos cribosos cerrados",
                        "Células anexas",
                        "Esclereidas"
                    ),
                    correctIndex = 1,
                    explanation = "Los elementos de los vasos o tráqueas son células conductoras de mayor calibre y extremos perforados exclusivas de las angiospermas, lo que les confiere un transporte hídrico más veloz que las traqueidas de gimnospermas."
                ),
                Challenge(
                    id = "bio_t07_s02_c12",
                    statement = "Las placas perforadas que separan transversalmente a las células contiguas de un tubo criboso en el floema y que permiten el paso ininterrumpido de savia elaborada reciben el nombre de:",
                    options = listOf(
                        "Placas cribosas con poros",
                        "Punteaduras areoladas",
                        "Bandas de Caspary",
                        "Discos intercalares",
                        "Ostiolos suberificados"
                    ),
                    correctIndex = 0,
                    explanation = "Las placas cribosas son las paredes transversales perforadas de los elementos cribosos del floema, recubiertas del polisacárido calosa para regular el tráfico de savia elaborada."
                ),
                Challenge(
                    id = "bio_t07_s02_c13",
                    statement = "La propiedad biológica de las células parenquimatosas maduras de poder desdiferenciarse y reanudar activamente la división mitótica para reparar una herida o formar raíces adventicias se denomina:",
                    options = listOf(
                        "Lignificación apoptótica",
                        "Totipotencia o plasticidad celular",
                        "Avascularidad permanente",
                        "Crenación citosólica",
                        "Suberificación terminal"
                    ),
                    correctIndex = 1,
                    explanation = "Las células vivas del parénquima conservan su totipotencia y plasticidad génica, lo que les permite desdiferenciarse en meristemo para formar callos de cicatrización y regenerar órganos."
                )
            )
        ),
        LessonNode(
            id = "bio_t07_s03",
            subjectId = "biologia",
            semana = 7,
            subtema = "7.3",
            title = "Tejidos Animales: Epitelial y Conectivo",
            depth = LessonDepth.EXTENSIVE,
            theory = LessonTheory(
                id = "th_bio_t07_s03",
                asignatura = "Biología",
                semana = 7,
                titulo = "Epitelios y Tejidos de Unión y Sostén",
                resumen = """Organización histológica de los tejidos epitelial y conectivo: matrices celulares, membranas basales y linajes de sostén.

                    # 7.3.1 — Tejido Epitelial (Epitelio)
                    Tejido que tapiza superficies corporales externas e internas y constituye glándulas:
                    - **Características cardinales:**
                      1. Células muy unidas y cohesionadas mediante complejos de unión (uniones oclusivas, desmosomas, uniones gap) con **mínima o casi nula matriz extracelular (MEC)**.
                      2. **Avascular:** Carece por completo de capilares sanguíneos y linfáticos directos. Se nutre exclusivamente por difusión de nutrientes y oxígeno desde los capilares del tejido conectivo subyacente.
                      3. Apoya sobre una **membrana basal** acelular rica en colágeno tipo IV, laminina y proteoglicanos, que le sirve de anclaje físico y filtro selectivo.
                      4. Marcada **polaridad celular:** Presenta un polo apical libre (con microvellosidades, cilios o estereocilios), caras laterales de unión y un polo basal adherido a la lámina basal mediante hemidesmosomas.
                      5. Alta tasa de división celular mitótica (continua renovación y regeneración).
                    - **Clasificación de los Epitelios de Revestimiento:**
                      - *Simple o Monoestratificado (un solo estrato de células):*
                        - Plano simple: Endotelio de vasos sanguíneos, alvéolos pulmonares y cápsula de Bowman renal (óptimo para difusión y filtración pasiva).
                        - Cúbico simple: Túbulos renales contorneados, folículos tiroideos y superficie ovárica (secreción y absorción).
                        - Cilíndrico o prismático simple: Revestimiento gástrico e intestinal (con microvellosidades en chapa estriada para absorción de nutrientes) y trompas de Falopio (ciliado para transporte del ovocito).
                      - *Seudoestratificado (todos tocan la lámina basal, pero sus núcleos están a distintas alturas):*
                        - Cilíndrico seudoestratificado ciliado con células caliciformes: Vías respiratorias superiores (**tráquea y bronquios**; forma el ascensor mucociliar que expulsa partículas).
                      - *Estratificado o Poliestratificado (dos o más estratos celulares):*
                        - Plano estratificado queratinizado: **Epidermis de la piel** (células superficiales muertas cargadas de queratina contra la fricción y deshidratación).
                        - Plano estratificado no queratinizado: Mucosa del **esófago**, cavidad bucal, lengua y vagina.
                        - De transición o Polimorfo (Urotelio): Exclusivo de vías urinarias (**vejiga**, uréteres); sus células globosas en paraguas cambian de forma y se distienden al llenarse de orina.
                    - **Epitelio Glandular:**
                      - *Exocrinas:* Vierten su secreción al exterior o cavidades mediante un **conducto excretor** (glándulas sudoríparas, salivales, mamarias, sebáceas). Mecanismos: merocrina (exocitosis pura, ej. páncreas), apocrina (pierde ápice celular, ej. glándula mamaria) y holocrina (la célula entera se destruye y forma la secreción, ej. glándula sebácea).
                      - *Endocrinas:* Carecen de conducto excretor; vierten mensajeros químicos (**hormonas**) directamente al torrente sanguíneo (tiroides, hipófisis, suprarrenales).
                      - *Mixtas o Anficrinas:* Poseen porción exocrina y endocrina (**páncreas**, hígado, gónadas).

                    # 7.3.2 — Tejido Conectivo o Conjuntivo
                    El tejido más abundante, heterogéneo y distribuido del organismo. Conecta, sostiene, protege y nutre a los demás tejidos:
                    - **Características cardinales:**
                      1. Células ampliamente separadas inmersas en una **abundante matriz extracelular (MEC)**.
                      2. **Altamente vascularizado** e inervado (con la notable excepción del cartílago, que es avascular).
                    - **Componentes de la Matriz Extracelular (MEC):**
                      - *Sustancia fundamental amorfa:* Gel hidratado de glucosaminoglucanos (ácido hialurónico, condroitín sulfato), proteoglicanos y glucoproteínas de adhesión (fibronectina, laminina).
                      - *Fibras proteicas:*
                        - Fibras de **colágeno:** Las más abundantes; máxima resistencia a la tracción mecánica (colágeno tipo I en hueso y tendón).
                        - Fibras **elásticas:** Compuestas de elastina y fibrilina; permiten estiramiento y retracción elástica en arterias y pulmones.
                        - Fibras **reticulares:** Malla delgada de colágeno tipo III que forma el estroma de órganos hematopoyéticos y linfoides (bazo, médula ósea, ganglios).
                    - **Células del tejido conectivo:**
                      - *Fibroblastos:* Célula principal y más abundante; sintetiza todas las fibras y la sustancia fundamental de la MEC.
                      - *Macrófagos (histiocitos):* Fagocitosis de bacterias y restos celulares; presentación de antígenos.
                      - *Mastocitos o células cebadas:* Poseen gránulos de **histamina** (vasodilatación en inflamación y alergia) y **heparina** (anticoagulante).
                      - *Plasmocitos (células plasmáticas):* Linfocitos B diferenciados que sintetizan y secretan **anticuerpos (inmunoglobulinas)**.
                      - *Adipocitos:* Células almacenadoras de triglicéridos.

                    # 7.3.3 — Tejidos Conectivos Especializados
                    - **1. Tejido Adiposo:**
                      - *Blanco o Unilocular:* Una sola gran gota lipídica central que desplaza el núcleo aplanado contra la membrana. Reserva energética, aislamiento térmico y amortiguación mecánica en adultos.
                      - *Pardo o Multilocular:* Múltiples gotitas lipídicas y abundantes mitocondrias con **termogenina**. Termogénesis por desacoplamiento en recién nacidos.
                    - **2. Tejido Cartilaginoso:**
                      - Células: **Condroblastos** (forman matriz) y **Condrocitos** (células maduras alojadas en lagunas o **condroplastos**).
                      - Matriz semirrígida rica en condroitín sulfato.
                      - **AVASCULAR:** Carece de vasos sanguíneos; se nutre por difusión pasiva desde el tejido conectivo que lo envuelve: el **pericondrio** (el cartílago articular carece de pericondrio y se nutre del líquido sinovial).
                      - *Tipos:*
                        - Cartílago hialino: El más común; en anillos traqueales, laringe, extremos costales y cartílagos articulares.
                        - Cartílago elástico: Pabellón auricular, conducto auditivo y epiglotis.
                        - Cartílago fibroso (Fibrocartílago): Carece de pericondrio; máxima resistencia a la compresión en discos intervertebrales, meniscos de la rodilla y sínfisis púbica.
                    - **3. Tejido Óseo:**
                      - Tejido de máxima rigidez; soporte locomotor, protección de órganos vitales y reserva metabólica del 99% del calcio corporal.
                      - **Matriz extracelular mineralizada:** Fracción orgánica (osteoide, 35%: colágeno tipo I) y fracción inorgánica (65%: cristales de **hidroxiapatita de fosfato de calcio** [Ca₁₀(PO₄)₆(OH)₂]).
                      - *Células óseas:*
                        - **Osteoblastos:** Células jóvenes que sintetizan la matriz orgánica y participan en la calcificación.
                        - **Osteocitos:** Células óseas maduras atrapadas en cavidades llamadas **osteoplastos u osteoceles**, comunicadas entre sí por canalículos calcóforos que permiten el intercambio nutricional.
                        - **Osteoclastos:** Células gigantes multinucleadas móviles derivadas de monocitos; ricas en lisosomas que secretan ácido clorhídrico y colagenasas para la **resorción y remodelación ósea** bajo estímulo de la hormona paratiroidea (PTH).
                      - *Estructura microscópica:*
                        - Hueso compacto: Organizado en unidades cilíndricas llamadas **osteonas o sistemas de Havers**, con laminillas concéntricas alrededor de un **conducto de Havers** (que aloja vasos y nervios) conectados transversalmente por **conductos de Volkmann**.
                """,
                conceptosClave = listOf(
                    "Epitelio: células unidas, avascular, sobre membrana basal, clasificado por estratos y forma.",
                    "Endotelio y alvéolos: plano simple; Tráquea: seudoestratificado ciliado; Epidermis: plano estratificado queratinizado.",
                    "Conectivo: abundante MEC, muy vascularizado; fibroblasto es la célula principal.",
                    "Mastocitos secretan histamina y heparina; Plasmocitos secretan anticuerpos.",
                    "Cartílago: AVASCULAR, condrocitos en condroplastos, rodeado de pericondrio.",
                    "Hueso: osteoblastos (forman), osteocitos (maduros en osteoplastos) y osteoclastos (resorción ósea)."
                ),
                admissionTip = "No olvides: cartílago y epitelio son estrictamente AVASCULARES. El hueso, al contrario, está profusamente vascularizado por los conductos de Havers y Volkmann.",
                admissionExplanation = "Diferenciar las funciones de osteoblastos (forman hueso) frente a osteoclastos (destruyen/reabsorben matriz ósea) es uno de los temas obligados en medicina humana."
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
                ),
                Challenge(
                    id = "bio_t07_s03_c2",
                    statement = "El epitelio que reviste la luz de la tráquea y los bronquios principales humanos, encargado de retener y expulsar partículas extrañas hacia la faringe mediante el batido de proyecciones apicales y secreción de moco, corresponde a un epitelio:",
                    options = listOf(
                        "Plano estratificado queratinizado",
                        "Seudoestratificado cilíndrico ciliado",
                        "Cúbico simple con microvellosidades",
                        "Polimorfo de transición urotelial",
                        "Cilíndrico estratificado mucoso"
                    ),
                    correctIndex = 1,
                    explanation = "La mucosa de las vías respiratorias superiores está tapizada por un epitelio seudoestratificado cilíndrico ciliado con células caliciformes productoras de moco."
                ),
                Challenge(
                    id = "bio_t07_s03_c3",
                    statement = "A diferencia de la mayoría de los tejidos conectivos que poseen abundantes vasos sanguíneos, el tejido cartilaginoso se caracteriza biológicamente por ser:",
                    options = listOf(
                        "Hipervascularizado con sistemas de Havers",
                        "Avascular, nutriéndose por difusión desde el pericondrio",
                        "Rico en osteocitos multinucleados",
                        "Incapaz de sintetizar matriz extracelular",
                        "Altamente inervado por fibras motoras mielínicas"
                    ),
                    correctIndex = 1,
                    explanation = "El cartílago es un tejido conectivo especializado avascular (carece de vasos sanguíneos); sus condrocitos reciben nutrientes por difusión desde los capilares del pericondrio circundante."
                ),
                Challenge(
                    id = "bio_t07_s03_c4",
                    statement = "En las reacciones alérgicas y fenómenos anafilácticos, la liberación masiva de histamina que produce broncoconstricción y vasodilatación proviene de la desgranulación en el tejido conectivo de:",
                    options = listOf(
                        "Mastocitos o células cebadas",
                        "Condrocitos hipertróficos",
                        "Osteoblastos basófilos",
                        "Adipocitos multiloculares",
                        "Fibrocitos seniles"
                    ),
                    correctIndex = 0,
                    explanation = "Los mastocitos o células cebadas contienen gránulos citoplasmáticos repletos de histamina, heparina y factores quimiotácticos que liberan tras el contacto con anticuerpos IgE en procesos alérgicos."
                ),
                Challenge(
                    id = "bio_t07_s03_c5",
                    statement = "¿Cuál es la célula del tejido conectivo especializada en la síntesis y secreción masiva de inmunoglobulinas o anticuerpos circulantes tras ser activada a partir de un linfocito B?",
                    options = listOf(
                        "Macrófago residente",
                        "Plasmocito (célula plasmática)",
                        "Fibroblasto",
                        "Osteocito",
                        "Mastocito"
                    ),
                    correctIndex = 1,
                    explanation = "Los plasmocitos son linfocitos B diferenciados con citoplasma basófilo y RER abundante que funcionan como fábricas celulares de anticuerpos específicos."
                ),
                Challenge(
                    id = "bio_t07_s03_c6",
                    statement = "La epidermis que recubre la palma de las manos y la planta de los pies soporta una continua fricción mecánica. El tejido que la constituye histológicamente corresponde a:",
                    options = listOf(
                        "Epitelio plano estratificado queratinizado",
                        "Epitelio simple cúbico con borde en cepillo",
                        "Epitelio polimorfo distensible",
                        "Tejido conectivo laxo reticular",
                        "Epitelio cilíndrico simple secretor"
                    ),
                    correctIndex = 0,
                    explanation = "La epidermis de la piel es un epitelio plano estratificado queratinizado cuyas capas externas están formadas por corneocitos muertos anucleados repletos de queratina protectora."
                ),
                Challenge(
                    id = "bio_t07_s03_c7",
                    statement = "Los meniscos de la articulación de la rodilla y los discos intervertebrales están sometidos a enormes fuerzas de compresión axial. El tipo de cartílago que los compone es:",
                    options = listOf(
                        "Cartílago elástico",
                        "Cartílago hialino puro",
                        "Fibrocartílago (cartílago fibroso)",
                        "Cartílago pericóndrico blando",
                        "Cartílago tiroideo"
                    ),
                    correctIndex = 2,
                    explanation = "El fibrocartílago carece de pericondrio y posee haces gruesos de fibras de colágeno tipo I dispuestas paralelamente, lo que le confiere una extraordinaria resistencia biomecánica al impacto y compresión."
                ),
                Challenge(
                    id = "bio_t07_s03_c8",
                    statement = "En el tejido óseo compacto de un fémur adulto, la unidad estructural y funcional microscópica formada por laminillas óseas concéntricas organizadas alrededor de un conducto vascular central se denomina:",
                    options = listOf(
                        "Sarcómero",
                        "Osteona o Sistema de Havers",
                        "Condroplasto",
                        "Canalículo de Volkmann",
                        "Trabécula esponjosa"
                    ),
                    correctIndex = 1,
                    explanation = "La osteona o sistema de Havers es la unidad fundamental del hueso compacto maduro, consistente en un conducto de Havers con vasos sanguíneos rodeado de laminillas óseas con osteocitos."
                ),
                Challenge(
                    id = "bio_t07_s03_c9",
                    statement = "La mucosa de la vejiga urinaria humana tiene la capacidad de adaptarse a variaciones drásticas de volumen de orina sin romperse, cambiando de un aspecto estratificado grueso a uno aplanado delgado. Este epitelio se clasifica como:",
                    options = listOf(
                        "Plano simple endotelial",
                        "Polimorfo, de transición o urotelio",
                        "Seudoestratificado caliciforme",
                        "Cilíndrico glandular",
                        "Cúbico estratificado"
                    ),
                    correctIndex = 1,
                    explanation = "El urotelio o epitelio de transición reviste las vías urinarias y posee células en paraguas capaces de acomodarse y aplanarse durante la repleción de la vejiga."
                ),
                Challenge(
                    id = "bio_t07_s03_c10",
                    statement = "La fracción inorgánica mineral que confiere dureza y resistencia a la compresión al tejido óseo está constituida principalmente por cristales de fosfato de calcio denominados:",
                    options = listOf(
                        "Carbonato magnésico",
                        "Hidroxiapatita",
                        "Sulfato de calcio dihidratado",
                        "Oxalato cálcico monohidratado",
                        "Fluoruro de sodio"
                    ),
                    correctIndex = 1,
                    explanation = "Los cristales de hidroxiapatita [Ca₁₀(PO₄)₆(OH)₂] se depositan sobre las fibras de colágeno tipo I de la matriz ósea, otorgándole al hueso su extrema dureza mineral."
                ),
                Challenge(
                    id = "bio_t07_s03_c11",
                    statement = "¿Cuál es la célula progenitora del tejido conectivo encargada de sintetizar activamente las fibras colágenas, reticulares y elásticas, así como los proteoglicanos de la sustancia fundamental?",
                    options = listOf(
                        "Condrocito maduro",
                        "Fibroblasto",
                        "Osteoclasto remodelador",
                        "Adipocito unilocular",
                        "Célula endotelial"
                    ),
                    correctIndex = 1,
                    explanation = "El fibroblasto es la célula primordial del tejido conectivo propiamente dicho, responsable de la biogénesis y mantenimiento de toda la matriz extracelular."
                ),
                Challenge(
                    id = "bio_t07_s03_c12",
                    statement = "Las glándulas sebáceas de la piel vierten su contenido lipídico mediante un mecanismo en el cual la célula acumula lípidos en su citoplasma, muere y se desintegra por completo para formar la secreción. Este mecanismo de secreción se califica como:",
                    options = listOf(
                        "Merocrino",
                        "Holocrino",
                        "Apocrino",
                        "Paracrino",
                        "Endocrino"
                    ),
                    correctIndex = 1,
                    explanation = "En la secreción holocrina (característica de las glándulas sebáceas), la célula entera se convierte en el producto de secreción al sufrir lisis."
                ),
                Challenge(
                    id = "bio_t07_s03_c13",
                    statement = "En el tejido óseo, las células maduras que derivan de los osteoblastos y que residen aisladas en pequeñas lagunas óseas (osteoplastos) comunicándose con otras células vecinas a través de delgados canalículos calcóforos son los:",
                    options = listOf(
                        "Condroblastos",
                        "Osteocitos",
                        "Osteoclastos",
                        "Mastocitos",
                        "Fibroblastos"
                    ),
                    correctIndex = 1,
                    explanation = "Los osteocitos son osteoblastos que quedaron atrapados en la matriz mineralizada; mantienen la integridad del tejido óseo comunicándose mediante prolongaciones citoplasmáticas en canalículos."
                ),
                Challenge(
                    id = "bio_t07_s03_c14",
                    statement = "El epitelio que recubre la pared interna de los vasos sanguíneos y linfáticos facilitando un flujo laminar sin fricción de la sangre se denomina endotelio y corresponde a un epitelio:",
                    options = listOf(
                        "Plano simple",
                        "Cúbico simple",
                        "Estratificado plano queratinizado",
                        "Cilíndrico ciliado",
                        "Polimorfo transicional"
                    ),
                    correctIndex = 0,
                    explanation = "El endotelio es una monocapa de células aplanadas íntimamente unidas (epitelio plano simple) que reviste todo el aparato circulatorio."
                ),
                Challenge(
                    id = "bio_t07_s03_c15",
                    statement = "Los conductos que perforan transversal y oblicuamente el tejido óseo compacto conectando los vasos sanguíneos de los conductos de Havers entre sí y con el periostio externo son los:",
                    options = listOf(
                        "Canalículos calcóforos",
                        "Conductos de Volkmann",
                        "Conductos de Wirsung",
                        "Canales de Stenon",
                        "Conductos de Santorini"
                    ),
                    correctIndex = 1,
                    explanation = "Los conductos de Volkmann atraviesan el hueso en sentido transversal comunicando los conductos longitudinales de Havers con la superficie perióstica y la cavidad medular."
                ),
                Challenge(
                    id = "bio_t07_s03_c16",
                    statement = "La lámina basal que sustenta a todos los epitelios y los ancla al tejido conjuntivo subyacente está compuesta fundamentalmente por glucoproteínas estructurales como la laminina y una variedad de colágeno de tipo:",
                    options = listOf(
                        "Colágeno tipo I",
                        "Colágeno tipo IV",
                        "Colágeno tipo II",
                        "Colágeno tipo X",
                        "Colágeno fibrilar III"
                    ),
                    correctIndex = 1,
                    explanation = "La lámina basal posee una red no fibrilar de colágeno tipo IV asociada a laminina, nidógeno y perlecano, que forma el filtro y sostén molecular de los epitelios."
                ),
                Challenge(
                    id = "bio_t07_s03_c17",
                    statement = "El tejido adiposo blanco o unilocular tiene como rasgo celular diagnóstico albergar en su citoplasma:",
                    options = listOf(
                        "Múltiples microgotas lipídicas ricas en termogenina",
                        "Una única gota de triglicéridos gigante que desplaza el núcleo a la periferia",
                        "Abundantes gránulos basófilos de histamina",
                        "Haces paralelos de microtúbulos contráctiles",
                        "Matriz mineralizada de fosfato cálcico"
                    ),
                    correctIndex = 1,
                    explanation = "El adipocito unilocular almacena lípidos en una sola gota voluminosa que comprime el citoplasma y empuja el núcleo aplanado contra la membrana celular (aspecto en anillo de sello)."
                )
            )
        ),
        LessonNode(
            id = "bio_t07_s04",
            subjectId = "biologia",
            semana = 7,
            subtema = "7.4",
            title = "Tejidos Animales: Muscular y Nervioso",
            depth = LessonDepth.EXTENSIVE,
            theory = LessonTheory(
                id = "th_bio_t07_s04",
                asignatura = "Biología",
                semana = 7,
                titulo = "Tejidos Excitables: Músculo y Sistema Nervioso",
                resumen = """Bases celulares y biofísicas de los tejidos excitables especializados en contracción mecánica y conducción electroquímica.

                    # 7.4.1 — Tejido Muscular
                    Especializado en la generación de fuerza mecánica y movimiento mediante la contracción activa de células alargadas llamadas **miocitos o fibras musculares**. Su citoplasma (sarcoplasma) contiene abundantes miofilamentos contráctiles de **actina y miosina**:
                    - **1. Tejido Muscular Estriado Esquelético:**
                      - *Morfología:* Fibras musculares cilíndricas muy largas (hasta 30 cm) formadas por sincitios celulares multinucleados con **múltiples núcleos alargados situados en la periferia celular** (bajo el sarcolema).
                      - *Aspecto microscópico:* Presenta un patrón estriado transversal regular debido a la disposición simétrica de filamentos delgados (actina) y gruesos (miosina).
                      - *Unidad funcional y contráctil:* El **sarcómero**, segmento miofibrilar delimitado entre **dos líneas Z contiguas**:
                        - Banda A (oscura o anisótropa): Filamentos gruesos de miosina (longitud constante durante la contracción).
                        - Banda I (clara o isótropa): Filamentos delgados de actina atravesados por la línea Z (se acorta en la contracción).
                        - Zona H: Centro de la banda A con miosina sin actina (se reduce o desaparece en la contracción).
                        - Línea M: Centro de la zona H donde se anclan las miosinas.
                      - *Mecanismo de contracción:* Un potencial de acción despolariza el sarcolema y viaja por los **túbulos T (túbulos transversos)**; el retículo sarcoplásmico libera **Ca²⁺**, el cual se une a la **troponina C**, desplazando a la tropomiosina y permitiendo que las cabezas de miosina hidrolicen ATP y deslicen la actina hacia el centro del sarcómero.
                      - *Fisiología:* Contracción **voluntaria, rápida, enérgica y fácilmente fatigable**. Inervado por el sistema nervioso somático (motoneuronas alfa).
                    - **2. Tejido Muscular Estriado Cardíaco (Miocardio):**
                      - *Morfología:* Células cilíndricas bifurcadas o ramificadas con **uno o dos núcleos ovalados ubicados en el centro celular**.
                      - *Rasgo diagnóstico patognomónico:* **Discos intercalares**, complejos de unión transversales que contienen desmosomas (fuerza mecánica) y **uniones comunicantes de tipo gap (nexus)** que permiten el flujo libre de iones de una célula a otra, haciendo que el miocardio funcione como un **sincitio funcional electrofisiológico**.
                      - *Fisiología:* Contracción **involuntaria, rítmica, continua e infatigable**. Estimulado de forma autónoma por el sistema de conducción nodal cardíaco (nodo sinusal) y regulado por el sistema nervioso autónomo.
                    - **3. Tejido Muscular Liso (Visceral):**
                      - *Morfología:* Células fusiformes individuales (en huso) con extremos afilados y **un solo núcleo central alargado**.
                      - *Rasgo diagnóstico:* **Carece de estriaciones transversales y carece de sarcómeros**. La actina y miosina se anclan a **cuerpos densos** intracitoplasmáticos (homólogos a las líneas Z).
                      - *Regulación del calcio:* No posee troponina; el Ca²⁺ citosólico se une a la proteína **calmodulina**, activando a la quinasa de cadenas ligeras de miosina (MLCK).
                      - *Localización:* Pared de vísceras huecas (estómago, intestino delgado y grueso, uréteres, vejiga, útero) y túnica media de vasos sanguíneos.
                      - *Fisiología:* Contracción **involuntaria, lenta, sostenida y resistente a la fatiga** (responsable de los movimientos peristálticos). Controlado por el sistema nervioso autónomo.

                    # 7.4.2 — Tejido Nervioso
                    Especializado en captar estímulos internos y ambientales, procesar información y generar respuestas bioeléctricas rápidas.
                    - **1. La Neurona (Unidad Estructural y Funcional Excitable):**
                      - No se dividen mitóticamente tras la diferenciación madura (G0 permanente).
                      - *Anatomía neuronal:*
                        - **Soma o Pericarion:** Cuerpo celular con núcleo esférico prominente de cromatina laxa y nucléolo evidente. Presenta abundantes acúmulos basófilos de RER y polirribosomas llamados **cuerpos de Nissl** (sustancia cromófila) para la activa síntesis de neurotransmisores.
                        - **Dendritas:** Múltiples prolongaciones citoplasmáticas ramificadas, cortas y aferentes (conducen el impulso de forma centrípeta **hacia el soma**). Poseen espinas dendríticas sinápticas.
                        - **Axón o Cilindroeje:** Prolongación única, larga y cilíndrica eferente (conduce el potencial de acción de forma centrífuga **lejos del soma**). Se origina en el cono axónico y culmina en ramificaciones terminales (**telodendrón**) con botones sinápticos cargados de vesículas de neurotransmisor.
                    - **2. Las Neuroglías o Células Gliales (Células de Sostén):**
                      - Son entre 5 y 10 veces más numerosas que las neuronas; **no transmiten potenciales de acción**, pero conservan la capacidad de división mitótica (origen de los gliomas cerebrales):
                      - *Astrocitos:* Células estrelladas con prolongaciones cuyos extremos forman **pies chupadores (pedicelos perivasculares)** que envuelven a los capilares sanguíneos cerebrales. Funciones: nutrición neuronal, recaptación de neurotransmisores y formación estructural de la **barrera hematoencefálica (BHE)** para proteger al encéfalo de toxinas.
                      - *Oligodendrocitos:* Elaboran y mantienen la **vaina de mielina en los axones del Sistema Nervioso Central (SNC: encéfalo y médula espinal)**. Un solo oligodendrocito puede mielinizar segmentos de hasta 50 axones distintos.
                      - *Células de Schwann (Neurolemocitos):* Sintetizan la **vaina de mielina en los axones del Sistema Nervioso Periférico (SNP: nervios craneales y espinales)**. Cada célula de Schwann envuelve un solo segmento internodal de un axón. Los espacios amielínicos intermedios son los **nódulos de Ranvier**, que posibilitan la **conducción saltatoria ultra rápida del impulso nervioso**.
                      - *Microglía:* Pequeñas células espinosas con capacidad fagocítica derivadas del linaje monocito-macrófago embrionario (mesodermo). Representan el **sistema inmunitario y de defensa residente del sistema nervioso central**.
                      - *Células Ependimarias (Ependimocitos):* Células epitelioides cilíndricas o cúbicas ciliadas que revisten los ventrículos cerebrales y el conducto central de la médula espinal (epéndimo); facilitan la circulación del **líquido cefalorraquídeo (LCR)**.
                """,
                conceptosClave = listOf(
                    "Músculo esquelético: fibras multinucleadas periféricas, estriado, voluntario, sarcómeros con líneas Z.",
                    "Músculo cardíaco: células ramificadas, 1-2 núcleos centrales, discos intercalares (uniones gap), involuntario.",
                    "Músculo liso: células fusiformes, mononucleadas centrales, sin sarcómeros (cuerpos densos con calmodulina), involuntario.",
                    "Neurona: soma con cuerpos de Nissl, dendritas aferentes y axón eferente mielinizado.",
                    "Oligodendrocito: vaina de mielina en el SNC; Célula de Schwann: vaina de mielina en el SNP.",
                    "Astrocitos: barrera hematoencefálica y sostén; Microglía: macrófagos fagocíticos del SNC."
                ),
                admissionTip = "¿Dónde se ubican los núcleos?: Músculo esquelético = PERIFÉRICOS múltiples; Cardíaco = CENTRALES (1 o 2); Liso = CENTRAL único.",
                admissionExplanation = "La distinción entre quién mieliniza en el SNC (oligodendrocitos) y quién en el SNP (células de Schwann) es una de las preguntas de mayor puntuación en exámenes preuniversitarios de ciencias biomédicas."
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
                ),
                Challenge(
                    id = "bio_t07_s04_c2",
                    statement = "En el tejido muscular estriado esquelético, la unidad anatómica y funcional de contracción delimitada longitudinalmente entre dos líneas Z sucesivas recibe la denominación de:",
                    options = listOf(
                        "Sarcómero",
                        "Túbulo T",
                        "Disco intercalar",
                        "Sarcolema",
                        "Cuerpo denso"
                    ),
                    correctIndex = 0,
                    explanation = "El sarcómero es la unidad microscópica contráctil repetitiva de las miofibrillas estriadas, comprendida entre dos líneas o discos Z consecutivos."
                ),
                Challenge(
                    id = "bio_t07_s04_c3",
                    statement = "Al examinar un corte histológico al microscopio se aprecian células musculares ramificadas, con uno o dos núcleos de posición central y discos intercalares transversales con abundantes uniones comunicantes. Esta muestra proviene indudablemente del:",
                    options = listOf(
                        "Músculo bíceps braquial",
                        "Miocardio cardíaco",
                        "Músculo liso intestinal",
                        "Músculo diafragma respiratorio",
                        "Esfínter anal externo"
                    ),
                    correctIndex = 1,
                    explanation = "El músculo estriado cardíaco se caracteriza inequívocamente por presentar células ramificadas mononucleadas o binucleadas centrales y discos intercalares especializados."
                ),
                Challenge(
                    id = "bio_t07_s04_c4",
                    statement = "¿Qué tipo de tejido muscular carece por completo de estriaciones transversales y de sarcómeros, anclando sus filamentos contráctiles a cuerpos densos para impulsar movimientos involuntarios en la pared del tubo digestivo?",
                    options = listOf(
                        "Tejido muscular estriado esquelético",
                        "Tejido muscular liso visceral",
                        "Tejido muscular miocárdico",
                        "Tejido muscular voluntario somático",
                        "Tejido muscular fasicular"
                    ),
                    correctIndex = 1,
                    explanation = "El músculo liso no presenta miofibrillas alineadas en sarcómeros (es inestriado o liso) y contiene cuerpos densos citoplasmáticos de alfa-actinina que fijan los filamentos de actina."
                ),
                Challenge(
                    id = "bio_t07_s04_c5",
                    statement = "Los astrocitos son células de la neuroglía que extienden prolongaciones llamadas pies perivasculares hacia los capilares sanguíneos continuos del tejido cerebral con el propósito fundamental de:",
                    options = listOf(
                        "Sintetizar mielina periférica",
                        "Formar la barrera hematoencefálica (BHE) y brindar nutrición a las neuronas",
                        "Generar potenciales de acción motores",
                        "Secretar líquido sinovial articular",
                        "Destruir eritrocitos seniles"
                    ),
                    correctIndex = 1,
                    explanation = "Los astrocitos emiten pies vasculares que sellan los capilares cerebrales, constituyendo la barrera hematoencefálica que aísla al tejido cerebral de sustancias potencialmente nocivas de la sangre."
                ),
                Challenge(
                    id = "bio_t07_s04_c6",
                    statement = "Las células gliales residentes en el sistema nervioso central que derivan de precursores monocíticos del mesodermo y que cumplen una función fagocítica inmunológica eliminando restos celulares y microorganismos son las:",
                    options = listOf(
                        "Células de Schwann",
                        "Oligodendrocitos",
                        "Microglías",
                        "Células de Purkinje",
                        "Células ependimarias"
                    ),
                    correctIndex = 2,
                    explanation = "La microglía representa el linaje macrófago y defensivo propio del SNC, activándose y fagocitando restos de tejido necrótico o agentes infecciosos durante lesiones nerviosas."
                ),
                Challenge(
                    id = "bio_t07_s04_c7",
                    statement = "Durante el acoplamiento excitación-contracción en la fibra muscular esquelética, los iones calcio liberados desde el retículo sarcoplásmico se unen de forma específica a la proteína:",
                    options = listOf(
                        "Actina globular",
                        "Troponina C",
                        "Tropomiosina fibrilar",
                        "Miosina de cadena ligera",
                        "Titina elástica"
                    ),
                    correctIndex = 1,
                    explanation = "El Ca²⁺ se une a la subunidad C de la troponina, provocando un cambio conformacional que desplaza a la tropomiosina, dejando al descubierto los sitios activos de la actina para la miosina."
                ),
                Challenge(
                    id = "bio_t07_s04_c8",
                    statement = "En el pericarion o soma de las neuronas motoras, los denominados cuerpos o corpúsculos de Nissl visibles como grumos fuertemente basófilos corresponden al ultraestructuralmente a:",
                    options = listOf(
                        "Agrupaciones densas de peroxisomas con catalasa",
                        "Cisternas de retículo endoplasmático rugoso (RER) y polirribosomas libres",
                        "Depósitos gigantes de glucógeno y lípidos",
                        "Centríolos hipertrofiados en mitosis",
                        "Complejos de poro de la carioteca"
                    ),
                    correctIndex = 1,
                    explanation = "Los cuerpos de Nissl son condensaciones de retículo endoplasmático rugoso y ribosomas dedicadas a la síntesis masiva de proteínas y neurotransmisores peptídicos."
                ),
                Challenge(
                    id = "bio_t07_s04_c9",
                    statement = "La vaina de mielina que recubre los axones de los nervios ciático y braquial en el sistema nervioso periférico permitiendo una conducción saltatoria del potencial de acción es producida por:",
                    options = listOf(
                        "Los oligodendrocitos",
                        "Las células de Schwann (neurolemocitos)",
                        "Los astrocitos fibrosos",
                        "Las microglías",
                        "Los podocitos renales"
                    ),
                    correctIndex = 1,
                    explanation = "En el SNP, la mielina es depositada por las células de Schwann al enrollar concéntricamente su membrana plasmática alrededor de un único segmento axonal."
                ),
                Challenge(
                    id = "bio_t07_s04_c10",
                    statement = "Las células epitelioides cilíndricas que revisten la superficie interna de los ventrículos cerebrales y el conducto del epéndimo, provistas de cilios para facilitar el flujo del líquido cefalorraquídeo, son los:",
                    options = listOf(
                        "Ependimocitos (células ependimarias)",
                        "Astrocitos protoplasmáticos",
                        "Oligodendrocitos mielinizantes",
                        "Amielinocitos periféricos",
                        "Macrófagos alveolares"
                    ),
                    correctIndex = 0,
                    explanation = "Las células ependimarias tapizan las cavidades ventriculares del encéfalo y el canal medular, participando en la circulación del líquido cefalorraquídeo."
                ),
                Challenge(
                    id = "bio_t07_s04_c11",
                    statement = "Los espacios o interrupciones periódicas amielínicas a lo largo del axón axonal donde la membrana posee una altísima densidad de canales de sodio dependientes de voltaje se denominan:",
                    options = listOf(
                        "Botones sinápticos",
                        "Nódulos de Ranvier",
                        "Discos intercalares",
                        "Bandas H del sarcómero",
                        "Conos axónicos"
                    ),
                    correctIndex = 1,
                    explanation = "Los nódulos de Ranvier son las brechas desnudas entre dos células de Schwann consecutivas donde se regenera el potencial de acción, posibilitando la conducción saltatoria."
                ),
                Challenge(
                    id = "bio_t07_s04_c12",
                    statement = "En el tejido muscular liso de las arterias y el útero, al carecer de la proteína troponina, el ion calcio que ingresa al citoplasma se une a una proteína fijadora citosólica denominada:",
                    options = listOf(
                        "Calmodulina",
                        "Mioglobina",
                        "Hemoglobina",
                        "Actinina alfa",
                        "Colágeno tipo III"
                    ),
                    correctIndex = 0,
                    explanation = "En el músculo liso el complejo calcio-calmodulina activa a la enzima quinasa de las cadenas ligeras de la miosina (MLCK) para fosforilar la cabeza de miosina e iniciar la contracción."
                ),
                Challenge(
                    id = "bio_t07_s04_c13",
                    statement = "¿Cuál de las siguientes características morfológicas corresponde fielmente a una fibra muscular esquelética típica?",
                    options = listOf(
                        "Célula mononucleada con núcleo central y sin estriaciones",
                        "Célula cilíndrica multinucleada con núcleos periféricos y estriaciones transversales",
                        "Célula ramificada con discos intercalares comunicantes",
                        "Célula esférica unilocular con gotas lipídicas",
                        "Célula avascular desprovista de retículo sarcoplásmico"
                    ),
                    correctIndex = 1,
                    explanation = "Las fibras musculares esqueléticas son grandes sincitios cilíndricos multinucleados con sus núcleos localizados periféricamente contra la membrana plasmática (sarcolema)."
                ),
                Challenge(
                    id = "bio_t07_s04_c14",
                    statement = "La prolongación neuronal única que conduce el potencial de acción desde el cono axónico del soma hacia las ramificaciones del telodendrón en dirección a otra célula se denomina:",
                    options = listOf(
                        "Dendrita aferente",
                        "Axón o cilindroeje",
                        "Espina dendrítica",
                        "Corpúsculo de Nissl",
                        "Línea Z"
                    ),
                    correctIndex = 1,
                    explanation = "El axón es la prolongación eferente especializada en la conducción rápida del impulso nervioso a distancia hacia la sinapsis."
                ),
                Challenge(
                    id = "bio_t07_s04_c15",
                    statement = "En el músculo estriado esquelético, los túbulos T (túbulos transversos) son estructuras membranarias fundamentales para la contracción que corresponden anatómicamente a:",
                    options = listOf(
                        "Invaginaciones profundas tubulares del sarcolema (membrana plasmática)",
                        "Prolongaciones del citoesqueleto de microtúbulos",
                        "Cisternas dilatadas del aparato de Golgi",
                        "Vesículas lisosomales cargadas de enzimas",
                        "Depósitos de sales de fosfato cálcico"
                    ),
                    correctIndex = 0,
                    explanation = "Los túbulos T son invaginaciones tubulares del sarcolema que penetran profundamente en la fibra muscular transmitiendo la despolarización eléctrica hacia el interior celular de forma casi instantánea."
                ),
                Challenge(
                    id = "bio_t07_s04_c16",
                    statement = "Los discos intercalares del tejido muscular cardíaco albergan uniones comunicantes de tipo gap (nexus) cuya función electrofisiológica vital es:",
                    options = listOf(
                        "Impedir el paso de iones para aislar cada célula miocárdica",
                        "Permitir el libre flujo de iones para propagar rápidamente el potencial de acción sincitial",
                        "Almacenar gránulos de glucógeno y triglicéridos",
                        "Anclar los filamentos de queratina de la piel",
                        "Sintetizar la vaina de mielina alrededor de las fibras"
                    ),
                    correctIndex = 1,
                    explanation = "Las uniones gap de los discos intercalares comunican eléctricamente a los cardiomiocitos, permitiendo que la onda de despolarización se propague coordinadamente a todo el corazón."
                ),
                Challenge(
                    id = "bio_t07_s04_c17",
                    statement = "Las prolongaciones ramificadas y numerosas del cuerpo neuronal encargadas de recibir señales bioquímicas y estímulos sinápticos desde otras neuronas conduciéndolos hacia el soma se denominan:",
                    options = listOf(
                        "Axones mielinizados",
                        "Dendritas",
                        "Nódulos de Ranvier",
                        "Pies vasculares de astrocitos",
                        "Botones terminales eferentes"
                    ),
                    correctIndex = 1,
                    explanation = "Las dendritas son las estructuras receptoras aferentes de la neurona que captan los impulsos sinápticos transmitiéndolos en sentido centrípeto hacia el soma neuronal."
                )
            )
        )
    )
}
