package com.jonsuapps.rastro.data.catalog

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

/**
 * BiologiaPart2: Semanas 8 a 13 (24 niveles) para el temario oficial UNSA / CEPRUNSA.
 * Cubre:
 * Sem 8: Fisiología Humana I: Digestivo, Respiratorio y Circulatorio (bio_t08_s01 a bio_t08_s04)
 * Sem 9: Fisiología Humana II: Excretor, Nervioso y Endocrino (bio_t09_s01 a bio_t09_s04)
 * Sem 10: Reproducción Celular y Gametogénesis (bio_t10_s01 a bio_t10_s04)
 * Sem 11: Genética Mendeliana, Ligamiento y Mutaciones (bio_t11_s01 a bio_t11_s04)
 * Sem 12: Origen de la Vida, Evolución y Taxonomía (bio_t12_s01 a bio_t12_s04)
 * Sem 13: Ecología, Ecosistemas y Contaminación Ambiental (bio_t13_s01 a bio_t13_s04)
 */
internal object BiologiaPart2 {
    val lessons: List<LessonNode> = listOf(
        // ==========================================
        // SEMANA 8: FISIOLOGÍA HUMANA I
        // ==========================================
        LessonNode(
            id = "bio_t08_s01",
            subjectId = "biologia",
            semana = 8,
            subtema = "Semana 8",
            title = "Sistema Digestivo Humano",
            theory = LessonTheory(
                id = "th_bio_t08_s01",
                asignatura = "Biología",
                semana = 8,
                titulo = "Digestión Mecánica, Química y Absorción de Nutrientes",
                resumen = """Transformación enzimática secuencial de macronutrientes a lo largo del tracto gastrointestinal.


                    # 1. Boca y Formación del Bolo Alimenticio
                    - Digestión mecánica (masticación) y química: **Ptialina o Amilasa salival** (hidroliza almidón a maltosa en pH ≈ 6.8) y lisozima bactericida.

                    # 2. Estómago y Formación del Quimo Ácido
                    - Glándulas gástricas (fúndicas):
                      - **Células Parietales u Oxínticas:** Secretan **Ácido Clorhídrico (HCl)** (activa pepsinógeno, desnaturaliza proteínas y destruye patógenos) y el **Factor Intrínseco de Castle** (esencial para la absorción de vitamina B₁₂ en el íleon terminal; su falta produce anemia perniciosa).
                      - **Células Principales o Cimógenas:** Secretan **Pepsinógeno** (proenzima inactiva convertida en Pepsina por el HCl, inicia la digestión de proteínas) y lipasa gástrica.
                      - **Células G:** Secretan la hormona **Gastrina** (estimula la secreción de HCl).

                    # 3. Intestino Delgado y Formación del Quilo
                    - **Duodeno:** Recibe el jugo pancreático y la bilis hepática:
                      - **Bilis:** Producida por el hígado y almacenada en la vesícula biliar. **No contiene enzimas**; contiene sales biliares que **emulsionan las grasas** aumentando la superficie de contacto para las lipasas.
                      - **Jugo Pancreático:** Rico en bicarbonato (HCO₃⁻ para neutralizar el ácido) y enzimas: Tripsina, Quimotripsina, Carboxipeptidasa, Amilasa pancreática y **Lipasa pancreática** (principal enzima digestiva de lípidos).
                    - **Yeyuno e Íleon:** Absorción de nutrientes en las **vellosidades intestinales** (microvellosidades en cepillo con enterocitos). Los glúcidos y aminoácidos pasan a los capilares sanguíneos hacia la **vena porta hepática**; los ácidos grasos y quilomicrones pasan al **vaso quilífero central (linfático)**.

                    # 4. Intestino Grueso
                    Reabsorción de agua y electrolitos, formación de heces y síntesis de **vitaminas K y B₁₂** por la microbiota bacteriana comensal (*Escherichia coli*).
                """,
                conceptosClave = listOf(
                    "Células parietales: Secretan HCl y Factor Intrínseco de Castle (absorción de B₁₂)"
                ),
                admissionTip = "Si te preguntan qué célula gástrica causa anemia perniciosa cuando es destruida por autoinmunidad: CÉLULA PARIETAL U OXÍNTICA (por falta de factor intrínseco de Castle).",
                admissionExplanation = "Sin el factor intrínseco, la cobalamina (vitamina B12) no puede ser captada por los enterocitos del íleon terminal."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t08_s01_c1",
                    statement = "A un paciente gastrectomizado se le extirpa el cuerpo y fondo del estómago. Para evitar el desarrollo de anemia perniciosa por déficit de absorción de vitamina B12 en el íleon, se le debe administrar de por vida la vitamina inyectable. ¿Qué secreción de las células parietales gástricas se ha perdido?",
                    options = listOf(
                        "Pepsinógeno activado",
                        "Factor intrínseco de Castle",
                        "Gastrina estimulante",
                        "Secretina duodenal",
                        "Amilasa pancreática"
                    ),
                    correctIndex = 1,
                    explanation = "Las células parietales u oxínticas del estómago producen ácido clorhídrico y el factor intrínseco de Castle, glicoproteína imprescindible para que la vitamina B₁₂ se absorba en el íleon terminal."
                )
            )
        ),
        LessonNode(
            id = "bio_t08_s02",
            subjectId = "biologia",
            semana = 8,
            subtema = "Semana 8",
            title = "Sistema Respiratorio y Hematosis",
            theory = LessonTheory(
                id = "th_bio_t08_s02",
                asignatura = "Biología",
                semana = 8,
                titulo = "Intercambio Gaseoso y Mecánica Ventilatoria",
                resumen = """Transporte convectivo y difusión alvéolo-capilar de oxígeno y dióxido de carbono.


                    # 1. Vías Respiratorias
                    - Fosas nasales (calientan, humedecen y filtran el aire mediante pituitaria roja y vellosidades), Faringe (vía mixta), Laringe (órgano de la fonación con cuerdas vocales y **epiglotis** que cierra la glotis al deglutir), Tráquea (anillos cartilaginosos en forma de C) y Árbol bronquial.

                    # 2. Histología Alveolar
                    Unidad anátomo-funcional: **Alvéolo pulmonar** (≈ 300 millones por pulmón):
                    - **Neumocito Tipo I:** Célula epitelial plana y delgada que reviste el 95% del alvéolo; responsable directo de la **hematosis**.
                    - **Neumocito Tipo II:** Célula cúbica secretora de **sustancia surfactante o tensioactiva** (dipalmitoilfosfatidilcolina). Reduce la tensión superficial impidiendo el colapso o atelectasia alveolar durante la espiración.
                    - **Macrófagos alveolares (células del polvo):** Fagocitan partículas y polvo inhalado.

                    # 3. Hematosis y Mecánica Ventilatoria
                    - **Hematosis:** Difusión simple de gases a través de la membrana alvéolo-capilar a favor de sus gradientes de presión parcial: el O₂ difunde del alvéolo (PO₂ ≈ 104 mmHg) al capilar venoso (PO₂ ≈ 40 mmHg); el CO₂ difunde del capilar (PCO₂ ≈ 45 mmHg) al alvéolo (PCO₂ ≈ 40 mmHg).
                    - **Inspiración (Activa):** El diafragma se contrae y desciende; los músculos intercostales externos elevan las costillas; la presión intrapleural se hace más negativa y el aire ingresa.
                    - **Espiración (Pasiva en reposo):** Relajación diafragmática por retroceso elástico del parénquima pulmonar.
                """,
                conceptosClave = listOf(
                    "Hematosis = difusión simple de gases a nivel alvéolo-capilar.",
                    "Neumocito I: Realiza la hematosis (pared delgada)"
                ),
                admissionTip = "Si un recién nacido prematuro nace con dificultad respiratoria severa (enfermedad de membrana hialina), la causa fisiológica es la inmadurez de los NEUMOCITOS TIPO II que aún no sintetizan surfactante.",
                admissionExplanation = "Esta aplicación clínica directa de la histología alveolar es recurrente en el área de biomédicas."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t08_s02_c1",
                    statement = "Un neonato nacido prematuramente a las 28 semanas de gestación presenta dificultad respiratoria progresiva y colapso alveolar difuso (atelectasia). ¿Qué tipo celular pulmonar presenta un déficit en la secreción del agente tensioactivo o surfactante?",
                    options = listOf(
                        "Neumocito Tipo I",
                        "Macrófago alveolar o célula del polvo",
                        "Neumocito Tipo II",
                        "Célula endotelial capilar",
                        "Fibroblasto septal"
                    ),
                    correctIndex = 2,
                    explanation = "Los neumocitos tipo II secretan la sustancia surfactante o tensioactiva, la cual disminuye la tensión superficial del líquido alveolar impidiendo que los alvéolos colapsen al final de la espiración."
                )
            )
        ),
        LessonNode(
            id = "bio_t08_s03",
            subjectId = "biologia",
            semana = 8,
            subtema = "Semana 8",
            title = "Sistema Cardiovascular y Ciclo Cardíaco",
            theory = LessonTheory(
                id = "th_bio_t08_s03",
                asignatura = "Biología",
                semana = 8,
                titulo = "Hemodinámica y Fisiología Cardíaca",
                resumen = """Bomba bicameral aspirante e impelente, sistema de conducción y fases del ciclo cardíaco.


                    # 1. Morfología y Cavidades Cardíacas
                    El corazón humano posee 4 cavidades: 2 aurículas (superiores, paredes delgadas) y 2 ventrículos (inferiores, paredes gruesas, el ventrículo izquierdo es el más grueso).
                    - Válvula **Tricúspide:** Entre aurícula derecha y ventrículo derecho.
                    - Válvula **Bicúspide o Mitral:** Entre aurícula izquierda y ventrículo izquierdo.
                    - Válv                    # 2. Sistema de Conducción Nodal (Automatismo Cardíaco)
                    1. **Nodo Sinoauricular / Sinusal (de Keith y Flack):** El **marcapasos natural** del corazón; genera el impulso bioeléctrico rítmico (≈ 60-100 lpm).
                    2. **Nodo Auriculoventricular (de Aschoff-Tawara):** Retrasa el impulso 0.1 s para permitir el llenado ventricular.
                    3. **Haz de His y Fibras de Purkinje:** Conducen la despolarización rápida hacia el miocardio ventricular.

                    # 3. Fases del Ciclo Cardíaco (≈ 0.8 s)
                    1. **Llenado Ventricular:** Válvulas AV abiertas. Se llenan los ventrículos.
                    2. **Contracción Isovolumétrica:** Se cierran las válvulas AV produciendo el **Primer Ruido Cardíaco (R1)** (tum). Los ventrículos se contraen con válvulas cerradas; la presión sube bruscamente sin cambio de volumen.
                    3. **Eyección:** Se abren las sigmoideas y la sangre sale impulsada hacia las arterias.
                    4. **Relajación Isovolumétrica:** Se cierran las válvulas sigmoideas produciendo el **Segundo Ruido Cardíaco (R2)** (ta). La presión cae con volumen constante hasta que se abren las AV.
                """,
                conceptosClave = listOf(
                    "Nodo sinusal = marcapasos natural del corazón.",
                    "Primer ruido cardíaco (R1)"
                ),
                admissionTip = "Recuerda siempre la correspondencia de los ruidos: R1 = Cierre AV (inicio de sístole), R2 = Cierre Sigmoideo (inicio de diástole).",
                admissionExplanation = "Esta relación temporal acústica es la base de la auscultación clínica y de las preguntas tipo admisión de fisiología cardiovascular."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t08_s03_c1",
                    statement = "Durante la auscultación cardíaca con estetoscopio, el médico percibe el primer ruido cardíaco (R1). Fisiológicamente, este sonido acústico es provocado de forma directa por:",
                    options = listOf(
                        "La apertura repentina de las válvulas sigmoideas aórtica y pulmonar",
                        "El cierre de las válvulas auriculoventriculares (tricúspide y mitral)",
                        "El cierre brusco de las válvulas sigmoideas al final de la eyección",
                        "El flujo turbulento de sangre a través del foramen oval",
                        "La contracción de los músculos papilares en la diástole"
                    ),
                    correctIndex = 1,
                    explanation = "El primer ruido cardíaco (R1) se origina por las vibraciones generadas por el cierre de las válvulas auriculoventriculares (mitral y tricúspide) al iniciarse la contracción isovolumétrica ventricular (sístole)."
                )
            )
        ),
        LessonNode(
            id = "bio_t08_s04",
            subjectId = "biologia",
            semana = 8,
            subtema = "Semana 8",
            title = "Sangre, Elementos Figurados e Inmunidad",
            theory = LessonTheory(
                id = "th_bio_t08_s04",
                asignatura = "Biología",
                semana = 8,
                titulo = "Componentes Celulares Sanguíneos y Hemostasia",
                resumen = """Células hemáticas, transporte de gases, defensa inmunitaria y mecanismos de coagulación.


                    # 1. Composición de la Sangre
                    - **Plasma (55%):** Agua (90%), electrolitos y proteínas plasmáticas: **Albúmina** (principal responsable de la presión coloidosmótica u oncótica), Globulinas (anticuerpos o inmunoglobulinas) y **Fibrinógeno** (coagulación).
                    - **Elementos Figurados (45%):**
                      - **Eritrocitos (Glóbulos rojos / Hematíes):** Células anucleadas bicóncavas (≈ 5 millones/mm³, vida media de 120 días). Transportan O₂ (como oxihemoglobina) y parte del CO₂ (como carbaminohemoglobina). La mayor parte del CO₂ (70%) viaja disuelto como **ion bicarbonato (HCO₃⁻)** en el plasma.
                      - **Leucocitos (Glóbulos blancos):** (≈ 5000-10000/mm³). Defensa inmune.
                        - Granulocitos: **Neutrófilos** (fagocitosis de bacterias, los más abundantes), **Eosinófilos** (parásitos helmintos y alergias) y **Basófilos** (liberan histamina y heparina).
                        - Agranulocitos: **Linfocitos** (B producen anticuerpos; T citotóxicos y colaboradores efectúan la inmunidad celular) y **Monocitos** (migran a tejidos convirtiéndose en **Macrófagos** fagocíticos).
                      - **Plaquetas (Trombocitos):** Fragmentos anucleados derivados de **megacariocitos** de la médula ósea (≈ 150000-400000/mm³). Esenciales para la hemostasia primaria (tapón plaquetario).

                    # 2. Cascada de la Coagulación (Hemostasia Secundaria)
                    Vía extrínseca e intrínseca convergen en la vía común:
                    Protrombina (Protrombinasa + Ca²⁺) → Trombina
                    Fibrinógeno (Trombina) → Fibrina (Malla insoluble que sella el coágulo)
                    La **vitamina K** es cofactor indispensable en el hígado para sintetizar los factores de coagulación II, VII, IX y X.
                """,
                conceptosClave = listOf(
                    "El CO₂ se transporta mayoritariamente como ion bicarbonato (HCO₃⁻)"
                ),
                admissionTip = "¿Cómo viaja la mayor cantidad de CO₂ en la sangre humana? No viaja unido a la hemoglobina: viaja disuelto en el plasma como ION BICARBONATO (HCO₃⁻) gracias a la anhidrasa carbónica del eritrocito.",
                admissionExplanation = "Este dato es uno de los aciertos seguros que definen la puntuación en fisiología respiratoria y circulatoria."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t08_s04_c1",
                    statement = "En la etapa final de la coagulación sanguínea humana (hemostasia secundaria), una enzima proteolítica activa transforma una proteína plasmática soluble en una red insoluble que atrapa eritrocitos y estabiliza el coágulo. Dicha reacción corresponde a:",
                    options = listOf(
                        "La conversión de protrombina en trombina por el calcio",
                        "La transformación de fibrinógeno en fibrina catalizada por la trombina",
                        "La activación de plasminógeno en plasmina",
                        "La hidrólisis de albúmina por la heparina",
                        "La fosforilación de megacariocitos por la vitamina K"
                    ),
                    correctIndex = 1,
                    explanation = "La trombina es la enzima que convierte el fibrinógeno (proteína soluble del plasma sintetizada en el hígado) en fibrina, formando polímeros insolubles que consolidan el coágulo definitivo."
                )
            )
        ),

        // ==========================================
        // SEMANA 9: FISIOLOGÍA HUMANA II
        // ==========================================
        LessonNode(
            id = "bio_t09_s01",
            subjectId = "biologia",
            semana = 9,
            subtema = "Semana 9",
            title = "Sistema Excretor y Fisiología Renal",
            theory = LessonTheory(
                id = "th_bio_t09_s01",
                asignatura = "Biología",
                semana = 9,
                titulo = "Estructura de la Nefrona y Formación de la Orina",
                resumen = """Mecanismos renales de depuración plasmática, balance hidroelectrolítico y regulación hormonal.


                    # 1. La Nefrona: Unidad Funcional del Riñón (≈ 1 millón por riñón)
                    Constituida por el Corpúsculo Renal (Glomérulo de Malpighi + Cápsula de Bowman) y el Sistema Tubular (Túbulo Contorneado Proximal, Asa de Henle, Túbulo Contorneado Distal) que drena en el Túbulo Colector.

                    # 2. Tres Procesos en la Formación de la Orina
                    1. **Filtración Glomerular:** Paso pasivo de agua y solutos desde los capilares glomerulares fenestrados hacia el espacio de Bowman por gradiente de presión hidrostática (≈ 125 mL/min = 180 L/día). El ultrafiltrado contiene glucosa, urea, sales y agua, pero **carece de proteínas plasmáticas y células sanguíneas**.
                    2. **Reabsorción Tubular:** Recuperación selectiva de sustancias útiles hacia los capilares peritubulares:
                       - **Túbulo Contorneado Proximal (TCP):** Se reabsorbe el **100% de la glucosa y aminoácidos** (por cotransporte con Na⁺), y el 65% de agua y sales.
                       - **Asa de Henle:** Rama descendente permeable al agua; rama ascendente impermeable al agua que transporta activamente Na⁺, K⁺, 2Cl⁻ (multiplicador por contracorriente).
                       - **Túbulo Contorneado Distal (TCD) y Colector:** Reabsorción facultativa de agua y electrolitos regulada hormonalmente.
                    3. **Secreción Tubular:** Paso de sustancias desde la sangre peritubular hacia la luz tubular (iones H⁺, K⁺, amonio y fármacos como penicilina) para regular el pH sanguíneo.

                    # 3. Regulación Hormonal
                    - **Aldosterona:** Secretada por la corteza suprarrenal; promueve la reabsorción de Na⁺ y excreción de K⁺ y H⁺ en el TCD.
                    - **Hormona Antidiurética (ADH o Vasopresina):** Sintetizada en el hipotálamo y secretada por la neurohipófisis; inserta **acuaporinas** en el túbulo colector aumentando la reabsorción de agua libre (orina concentrada). Su falta causa **diabetes insípida**.
                """,
                conceptosClave = listOf(
                    "El ultrafiltrado glomerular normal no contiene proteínas grandes ni eritrocitos.",
                    "El TCP reabsorbe el 100% de glucosa y aminoácidos filtrados.",
                    "La ADH (antidiurética) inserta acuaporinas en el túbulo colector aumentando la reabsorción de agua."
                ),
                admissionTip = "Si en un examen de orina aparece glucosa (glucosuria), significa que la glucemia superó el umbral renal del TCP (≈ 180 mg/dL), saturando los transportadores SGLT-2, signo clásico de diabetes mellitus.",
                admissionExplanation = "Comprender la saturación del transporte tubular proximal de glucosa es fundamental para medicina y biología humana."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t09_s01_c1",
                    statement = "Un estudiante realiza una travesía por el desierto de La Joya sin hidratación durante 12 horas. Su hipotálamo detecta un incremento en la osmolaridad plasmática y estimula a la neurohipófisis a secretar una hormona que incrementa la permeabilidad al agua en los túbulos colectores. ¿De qué hormona se trata?",
                    options = listOf(
                        "Aldosterona",
                        "Hormona antidiurética (ADH o vasopresina)",
                        "Péptido natriurético auricular",
                        "Renina renal",
                        "Eritropoyetina"
                    ),
                    correctIndex = 1,
                    explanation = "La hormona antidiurética (ADH o vasopresina) promueve la inserción de canales de acuaporina-2 en los túbulos colectores del riñón, provocando una masiva reabsorción de agua para conservar volumen plasmático y concentrar la orina."
                )
            )
        ),
        LessonNode(
            id = "bio_t09_s02",
            subjectId = "biologia",
            semana = 9,
            subtema = "Semana 9",
            title = "Sistema Nervioso Central y Arco Reflejo",
            theory = LessonTheory(
                id = "th_bio_t09_s02",
                asignatura = "Biología",
                semana = 9,
                titulo = "Neuroanatomía y Respuestas Reflejas",
                resumen = """Centros integradores del SNC y la circuitería motora refleja medular.


                    # 1. Encéfalo
                    - **Cerebro (Telencéfalo):** Corteza cerebral (sustancia gris periférica) con cisuras (Rolando, Silvio) que dividen lóbulos: Frontal (área motora primaria, lenguaje articulado de Broca), Parietal (área somatosensitiva), Temporal (área auditiva, comprensión del lenguaje de Wernicke) y Occipital (área visual).
                    - **Diencéfalo:**
                      - **Tálamo:** Estación de relevo de todas las sensaciones conscientes (**excepto el olfato**).
                      - **Hipotálamo:** Centro de control del sistema nervioso autónomo y sistema endocrino; regula temperatura corporal, sed (osmorreceptores), hambre/saciedad y ritmos circadianos.
                    - **Cerebelo:** Coordina el tono muscular, el **equilibrio cinético y la precisión motora fina** (metría, diadococinesia). Su lesión produce ataxia y dismetría.
                    - **Tronco Encefálico:** Mesencéfalo (reflejos pupilares y visuales), Protuberancia anular (centro neumotáxico respiratorio) y **Bulbo Raquídeo o Médula Oblongada** (centros vitales de frecuencia cardíaca, vasoconstricción, deglución, vómito, tos y estornudo).

                    # 2. Médula Espinal y Arco Reflejo
                    La médula espinal (sustancia gris central en forma de 'H' o mariposa y sustancia blanca periférica) es el centro de los actos reflejos involuntarios.
                    - **Componentes del Arco Reflejo:**
                      1. **Receptor sensorial:** Capta el estímulo (ej. huso neuromuscular en el tendón rotuliano).
                      2. **Neurona aferente o sensitiva:** Conduce el impulso por la raíz dorsal (posterior).
                      3. **Centro integrador / Interneurona:** En el asta anterior o gris de la médula.
                      4. **Neurona eferente o motora:** Sale por la raíz ventral (anterior).
                      5. **Efector:** Músculo esquelético o glándula que ejecuta la respuesta.
                """,
                conceptosClave = listOf(
                    "El tálamo es la estación de relevo sensorial de todos los sentidos EXCEPTO el olfato.",
                    "El cerebelo coordina el equilibrio, la postura y los movimientos motores finos.",
                    "El bulbo raquídeo contiene los centros respiratorio y cardiovascular vitales.",
                    "Arco reflejo: Receptor $\to$ Vía sensitiva (raíz dorsal)"
                ),
                admissionTip = "¡Fijo en el examen!: ¿Cuál es el único sentido que no hace sinapsis previa en el tálamo antes de llegar a la corteza? EL OLFATO (llega directamente al bulbo olfatorio y corteza piriforme).",
                admissionExplanation = "Esta particularidad del sistema olfatorio es una de las preguntas de anatomía más repetidas en el CEPRUNSA."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t09_s02_c1",
                    statement = "Un paciente sufre un traumatismo craneoencefálico posterior y muestra incapacidad para mantener el equilibrio al caminar, marcha ebria (ataxia) y pérdida de la coordinación motora fina para tocarse la punta de la nariz con el dedo. ¿Qué estructura encefálica se encuentra afectada?",
                    options = listOf(
                        "Lóbulo occipital",
                        "Hipotálamo posterior",
                        "Cerebelo",
                        "Bulbo raquídeo",
                        "Tálamo óptico"
                    ),
                    correctIndex = 2,
                    explanation = "El cerebelo es el centro encefálico responsable de la coordinación de la motricidad voluntaria fina, el mantenimiento del equilibrio y el tono postural muscular. Su daño produce ataxia, dismetría y temblor intencional."
                )
            )
        ),
        LessonNode(
            id = "bio_t09_s03",
            subjectId = "biologia",
            semana = 9,
            subtema = "Semana 9",
            title = "Sistema Nervioso Autónomo",
            theory = LessonTheory(
                id = "th_bio_t09_s03",
                asignatura = "Biología",
                semana = 9,
                titulo = "Fisiología del Sistema Nervioso Autónomo (SNA)",
                resumen = """Control involuntario visceral mediante subsistemas antagónicos noradrenérgico y colinérgico.


                    # 1. Generalidades del Sistema Nervioso Autónomo (Vegetativo)
                    Inerva músculo cardíaco, músculo liso visceral y glándulas. Consta de dos neuronas en serie (preganglionar y posganglionar) que hacen sinapsis en ganglios autónomos.

                    # 2. Sistema Nervioso Simpático (Toracolumbar)
                    - Se activa en situaciones de **estrés, emergencia, alarma o huida ('Fight or Flight')**.
                    - Neurotransmisor posganglionar: **Noradrenalina (Norepinefrina)**.
                    - Efectos fisiológicos:
                      - Pupilas: **Midriasis** (dilatación pupilar).
                      - Corazón: Taquicardia e incremento de contractilidad.
                      - Pulmones: **Broncodilatación** (mejora el flujo de aire).
                      - Digestivo: Inhibe peristaltismo y secreciones gástricas.
                      - Hígado: Estimula glucogenólisis (libera glucosa a sangre).
                      - Vejiga: Relajación del detrusor y contracción del esfínter (retención).

                    # 3. Sistema Nervioso Parasimpático (Craniosacro)
                    - Se activa en condiciones de **reposo, digestión, asimilación y recuperación energética ('Rest and Digest')**.
                    - Mediado principalmente por el **nervio vago (X par craneal)**.
                    - Neurotransmisor posganglionar: **Acetilcolina (ACh)** sobre receptores muscarínicos.
                    - Efectos fisiológicos:
                      - Pupilas: **Miosis** (contracción pupilar).
                      - Corazón: Bradicardia (disminuye la frecuencia cardíaca).
                      - Pulmones: Broncoconstricción.
                      - Digestivo: Estimula intensamente el peristaltismo y las secreciones digestivas y salivales.
                      - Vejiga: Contracción del detrusor y micción.
                """,
                conceptosClave = listOf(
                    "Simpático = Lucha o huida, neurotransmisor = noradrenalina, produce midriasis y taquicardia.",
                    "Parasimpático = Reposo y digestión, neurotransmisor = acetilcolina, produce miosis y bradicardia.",
                    "El nervio vago (X)"
                ),
                admissionTip = "Miosis (pupila pequeña, como la palabra miosis que es corta) = Parasimpático. Midriasis (pupila dilatada, palabra más larga) = Simpático.",
                admissionExplanation = "Asociar el estímulo de supervivencia (necesidad de mayor entrada de luz ante un peligro) clarifica la acción del simpático."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t09_s03_c1",
                    statement = "Un senderista en el cañón del Colca se encuentra súbitamente con un puma andino a pocos metros. Inmediatamente se activa su sistema nervioso simpático provocando en sus órganos:",
                    options = listOf(
                        "Miosis pupilar y bradicardia refleja",
                        "Estimulación del peristaltismo intestinal y salivación profusa",
                        "Midriasis pupilar, taquicardia y broncodilatación",
                        "Broncoconstricción y vaciamiento de la vejiga urinaria",
                        "Aumento de la secreción ácida gástrica y relajación vascular"
                    ),
                    correctIndex = 2,
                    explanation = "La respuesta de lucha o huida mediada por el sistema simpático provoca dilatación pupilar (midriasis) para mejorar la visión periférica, aumento del gasto cardíaco (taquicardia) y broncodilatación para maximizar la captación de oxígeno."
                )
            )
        ),
        LessonNode(
            id = "bio_t09_s04",
            subjectId = "biologia",
            semana = 9,
            subtema = "Semana 9",
            title = "Sistema Endocrino Humano",
            theory = LessonTheory(
                id = "th_bio_t09_s04",
                asignatura = "Biología",
                semana = 9,
                titulo = "Hormonas y Regulación Homeostática",
                resumen = """Comunicación humoral mediada por hormonas proteicas y esteroideas y mecanismos de retroalimentación.


                    # 1. Eje Hipotálamo - Hipófisis
                    - **Adenohipófisis (Lóbulo anterior glandular):** Estimulada por factores liberadores hipotalámicos (RH). Secreta:
                      - **STH / GH:** Hormona del crecimiento (somatotropina). Su exceso causa gigantismo (niños) o acromegalia (adultos); su déficit enanismo hipofisario.
                      - **TSH:** Tirotropina (estimula glándula tiroides).
                      - **ACTH:** Adrenocorticotropina (estimula corteza suprarrenal).
                      - **FSH y LH:** Gonadotropinas que regulan el ciclo gonadal.
                      - **Prolactina (PRL):** Estimula la síntesis y secreción de leche materna.
                    - **Neurohipófisis (Lóbulo posterior nervioso):** No produce hormonas; almacena y libera hormonas sintetizadas en los núcleos hipotalámicos:
                      - **Oxitocina:** Estimula las contracciones uterinas durante el parto y la **eyección de la leche materna** (reflejo de succión).
                      - **Vasopresina / ADH:** Reabsorbe agua en el riñón y eleva la presión arterial.

                    # 2. Glándula Tiroides y Paratiroides
                    - **Tiroides:** Secreta T₃ (triyodotironina) y T₄ (tiroxina) que aumentan el metabolismo basal. Secreta **Calcitonina** (células parafoliculares C): **hipocalcemiante** (fija calcio en los huesos).
                    - **Paratiroides:** Secreta **Parathormona (PTH)**: **hipercalcemiante** (estimula osteoclastos para liberar Ca²⁺ a sangre, reabsorbe calcio en riñón y activa la vitamina D).

                    # 3. Páncreas Endocrino (Islotes de Langerhans)
                    - **Células Beta (≈ 70%):** Secretan **Insulina** (hormona **hipoglucemiante**; facilita el ingreso de glucosa a células mediante transportadores GLUT4 y promueve glucogenogénesis). Su déficit causa diabetes mellitus.
                    - **Células Alfa (≈ 20%):** Secretan **Glucagón** (hormona **hiperglucemiante**; activa glucogenólisis y gluconeogénesis hepática).
                """,
                conceptosClave = listOf(
                    "Calcitonina: Hipocalcemiante (mete calcio al hueso)"
                ),
                admissionTip = "Distinción crucial para obstetricia y enfermería: la PROLACTINA sintetiza la leche; la OXITOCINA contrae las células mioepiteliales para eyectar (expulsar) la leche.",
                admissionExplanation = "Diferenciar la fase de producción láctea de la fase de expulsión motora es un reactivo clásico de endocrinología."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t09_s04_c1",
                    statement = "Tras consumir un almuerzo copioso rico en carbohidratos, los niveles de glucosa en plasma se elevan a 160 mg/dL. Para restituir la homeostasis glucémica, las células beta de los islotes pancreáticos vierten al torrente sanguíneo una hormona polipeptídica hipoglucemiante denominada:",
                    options = listOf(
                        "Glucagón",
                        "Somatostatina",
                        "Insulina",
                        "Cortisol",
                        "Adrenalina"
                    ),
                    correctIndex = 2,
                    explanation = "La insulina es la hormona hipoglucemiante producida por las células beta del páncreas endocrino que estimula la captación celular de glucosa y su almacenamiento como glucógeno en el hígado y músculo."
                )
            )
        ),

        // ==========================================
        // SEMANA 10: REPRODUCCIÓN CELULAR Y HUMANA
        // ==========================================
        LessonNode(
            id = "bio_t10_s01",
            subjectId = "biologia",
            semana = 10,
            subtema = "Semana 10",
            title = "Ciclo Celular y Puntos de Control",
            theory = LessonTheory(
                id = "th_bio_t10_s01",
                asignatura = "Biología",
                semana = 10,
                titulo = "El Ciclo Celular Eucariota y su Regulación",
                resumen = """Secuencia ordenada de proliferación celular: interfase metabólica y puntos de control cinasa.


                    # 1. La Interfase Celular (≈ 90-95% de la duración del ciclo)
                    - **Fase G₁ (Gap 1):** Crecimiento celular, intensa síntesis de proteínas y ARN, duplicación de organelos citoplasmáticos.
                      - **Fase G₀ (Quiescencia):** Estado de arresto proliferativo donde las células realizan sus funciones diferenciadas sin dividirse (ej. neuronas, cardiomiocitos).
                    - **Fase S (Síntesis):** **Duplicación o replicación semiconservativa del ADN** y duplicación de los centriolos. El contenido de ADN pasa de 2c a 4c (cromosomas de una cromátida pasan a cromosomas de dos cromátidas hermanas).
                    - **Fase G₂ (Gap 2):** Fosforilación de proteínas para la condensación de la cromatina y síntesis de tubulina para armar el huso mitótico.

                    # 2. Regulación Molecular y Puntos de Control (Checkpoints)
                    El avance del ciclo está gobernado por complejos heterodiméricos formados por **Ciclinas** y **Cinasas Dependientes de Ciclinas (CDKs)**.
                    - **Punto de Control G₁/S (Punto de restricción Start):** Verifica que el tamaño celular sea adecuado, que haya nutrientes y que el ADN no esté dañado. La proteína **p53 (el 'guardián del genoma')** detecta roturas en el ADN; si hay daño, activa a p21 para frenar el ciclo y reparar el ADN; si el daño es irreparable, induce **apoptosis (muerte celular programada)**. Las mutaciones en p53 están presentes en más del 50% de los cánceres humanos.
                    - **Punto de Control G₂/M:** Verifica que el ADN se haya replicado íntegramente en la fase S.
                    - **Punto de Control M (Metafase-Anafase):** Verifica que todos los cinetocoros cromosómicos estén anclados a los microtúbulos del huso acromático.
                """,
                conceptosClave = listOf(
                    "Fase S: Se duplica el ADN (replicación semiconservativa)"
                ),
                admissionTip = "¿En qué momento exacto del ciclo celular se duplica la cantidad de ADN? En la FASE S DE LA INTERFASE (no en la mitosis).",
                admissionExplanation = "Confundir la duplicación del ADN (fase S interfásica) con la repartición del ADN (mitosis) es el error más castigado en genética celular."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t10_s01_c1",
                    statement = "Un fármaco quimioterápico bloquea la actividad de la ADN polimerasa impidiendo la incorporación de desoxirribonucleótidos trifosfato en células de adenocarcinoma gástrico. ¿En qué fase específica de la interfase del ciclo celular actúa dicho inhibidor?",
                    options = listOf(
                        "Fase G1",
                        "Fase G0",
                        "Fase S",
                        "Fase G2",
                        "Citocinesis"
                    ),
                    correctIndex = 2,
                    explanation = "La síntesis y duplicación semiconservativa del material genético (ADN) ocurre de manera exclusiva durante la Fase S (Síntesis) de la interfase celular."
                )
            )
        ),
        LessonNode(
            id = "bio_t10_s02",
            subjectId = "biologia",
            semana = 10,
            subtema = "Semana 10",
            title = "Mitosis y División Celular",
            theory = LessonTheory(
                id = "th_bio_t10_s02",
                asignatura = "Biología",
                semana = 10,
                titulo = "Mitosis Somática y Citocinesis",
                resumen = """Repartición equitativa del genoma eucariota que produce dos células hijas idénticas ($2n 	o 2n$).


                    # 1. Fases de la Mitosis (Células Somáticas Eucariotas)
                    - **Profase:**
                      - La cromatina se condensa en **cromosomas visibles**.
                      - Los centrosomas migran a polos opuestos y forman el **huso mitótico**.
                      - Desaparece el nucléolo y se desintegra la carioteca (prometafase).
                    - **Metafase:**
                      - Los cromosomas alcanzan su **máxima condensación**.
                      - Las fibras del huso se unen a los **cinetocoros**.
                      - Los cromosomas se alinean en el ecuador celular formando la **placa ecuatorial o metafásica**. Fase ideal para realizar el **cariotipo**.
                    - **Anafase:**
                      - Disyunción o **separación de las cromátidas hermanas** por acortamiento de los microtúbulos cinetocóricos.
                      - Cada cromátida pasa a ser un cromosoma individual independiente que migra hacia los polos.
                    - **Telofase:**
                      - Los cromosomas llegan a los polos y se descondensan en cromatina.
                      - Se reorganiza la carioteca a partir del retículo endoplasmático y reaparece el nucléolo. Desaparece el huso mitótico.

                    # 2. Citocinesis (División del Citoplasma)
                    - **En Célula Animal:** Citocinesis **centrípeta** (de afuera hacia adentro) mediante un anillo contráctil de **actina y miosina** que genera un surco de estrangulamiento.
                    - **En Célula Vegetal:** Citocinesis **centrífuga** (de adentro hacia afuera) mediante la formación del **fragmoplasto** a partir de vesículas del aparato de Golgi ricas en pectina, que formará la laminilla media y pared celular.
                """,
                conceptosClave = listOf(
                    "Metafase: Máxima condensación, placa ecuatorial, óptima para cariotipo.",
                    "Anafase: Separación (disyunción)"
                ),
                admissionTip = "Citocinesis animal = CENTRÍPETA (estrangula de afuera hacia adentro). Citocinesis vegetal = CENTRÍFUGA (fragmoplasto crece de adentro hacia afuera).",
                admissionExplanation = "La presencia de la pared rígida vegetal impide el estrangulamiento, obligando a construir una nueva pared desde el centro."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t10_s02_c1",
                    statement = "Para diagnosticar si un feto presenta una alteración cromosómica numérica como el síndrome de Down, los citogenetistas detienen la división celular con colchicina para fotografiar y ordenar los cromosomas en su máxima condensación alineados en el ecuador. ¿En qué fase mitótica se realiza este procedimiento?",
                    options = listOf(
                        "Profase tardía",
                        "Anafase temprana",
                        "Metafase",
                        "Telofase",
                        "Interfase G2"
                    ),
                    correctIndex = 2,
                    explanation = "En la metafase mitótica los cromosomas alcanzan su máximo grado de condensación morfológica y se alinean en la placa ecuatorial, por lo que es la fase idónea para confeccionar cariotipos clínicos."
                )
            )
        ),
        LessonNode(
            id = "bio_t10_s03",
            subjectId = "biologia",
            semana = 10,
            subtema = "Semana 10",
            title = "Meiosis y Recombinación Genética",
            theory = LessonTheory(
                id = "th_bio_t10_s03",
                asignatura = "Biología",
                semana = 10,
                titulo = "División Meiótica y Variabilidad",
                resumen = """Reducción ploidial ($2n 	o 4n$) y recombinación homóloga generadora de biodiversidad genética.


                    # 1. Características Generales
                    Ocurre en células germinales gonadares. Consta de dos divisiones nucleares consecutivas precedidas por una sola replicación del ADN en la interfase previa: genera **4 células hijas haploides (n$) genéticamente diversas**.

                    # 2. Meiosis I (División Reduccional: $2n \to n$)
                    - **Profase I (La etapa más larga y crucial):**
                      1. **Leptonema (Leptoteno):** La cromatina se condensa en filamentos delgados; cromosomas con aspecto de 'bouquet' o ramillete polar.
                      2. **Cigonema (Cigoteno):** Apareamiento longitudinal íntimo de cromosomas homólogos (**sinapsis**) mediante el **complejo sinaptonémico**. Se forman pares de homólogos llamados **bivalentes o tétradas**.
                      3. **Paquinema (Paquiteno):** Ocurre el **Crossing-over o Recombinación Genética** (intercambio físico recíproco de segmentos de ADN entre cromátidas no hermanas homólogas). **¡Es la principal fuente de variabilidad genética de la meiosis!**
                      4. **Diplonema (Diploteno):** Los cromosomas homólogos inician su separación pero permanecen unidos en los puntos de cruce llamados **quiasmas**.
                      5. **Diacinesis:** Terminalización de los quiasmas; se desintegra la carioteca.
                    - **Metafase I:** Las tétradas u homólogos pareados se ubican en la placa ecuatorial en doble fila.
                    - **Anafase I:** Disyunción de **cromosomas homólogos** completos (cada uno con 2 cromátidas) hacia polos opuestos. **¡Aquí se reduce la ploidía de $2n$ a n$!**

                    # 3. Meiosis II (División Ecuacional: n \to n$)
                    Similar a una mitosis normal: en la **Anafase II** se separan las **cromátidas hermanas recombinadas**, culminando con 4 gametos haploides (n$).
                """,
                conceptosClave = listOf(
                    "Crossing-over ocurre en Paquinema (Paquiteno)"
                ),
                admissionTip = "Pregunta clásica: '¿En qué subfase de la profase I meiótica ocurre el crossing-over o entrecruzamiento génico?' Respuesta invariable: PAQUITENO o PAQUINEMA.",
                admissionExplanation = "Este evento es el fundamento biológico de la variación fenotípica en todas las especies con reproducción sexual."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t10_s03_c1",
                    statement = "Durante la ovogénesis humana, las células germinales detienen temporalmente su proceso meiótico antes del nacimiento de la mujer, encontrándose los cromosomas homólogos unidos únicamente a nivel de los quiasmas. ¿En qué subfase de la profase I se hallan dichos ovocitos primarios?",
                    options = listOf(
                        "Leptonema",
                        "Cigonema",
                        "Paquinema",
                        "Diplonema (Dictioteno)",
                        "Diacinesis"
                    ),
                    correctIndex = 3,
                    explanation = "En diplonema (o diploteno) los cromosomas homólogos comienzan a repelerse quedando visibles los quiasmas. En las mujeres, los ovocitos primarios entran en un largo período de latencia en diplonema llamado dictioteno hasta la pubertad."
                )
            )
        ),
        LessonNode(
            id = "bio_t10_s04",
            subjectId = "biologia",
            semana = 10,
            subtema = "Semana 10",
            title = "Gametogénesis y Ciclo Menstrual Humano",
            theory = LessonTheory(
                id = "th_bio_t10_s04",
                asignatura = "Biología",
                semana = 10,
                titulo = "Fisiología de la Reproducción Humana",
                resumen = """Diferenciación gamética haploide, ciclo ovárico-endometrial y singamia en las trompas.


                    # 1. Espermatogénesis vs Ovogénesis
                    - **Espermatogénesis:** En los túbulos seminíferos testiculares a partir de la pubertad (estimulada por FSH y testosterona producida por las **células de Leydig**; las **células de Sertoli** nutren y forman la barrera hematotesticular). Una espermatogonia (2n) da origen a **4 espermatozoides viables y funcionales** (n) tras espermiogénesis.
                    - **Ovogénesis:** En los ovarios. Una ovogonia (2n) da origen a **1 solo óvulo (u ovocito secundario) funcional (n) y 3 cuerpos polares (polocitos)** degenerativos. La ovulación expulsa un **ovocito secundario detenido en metafase II**. La meiosis II solo se completa si ocurre fecundación.

                    # 2. Ciclo Menstrual y Ovárico (≈ 28 días)
                    - **Fase Folicular / Proliferativa (Días 1 a 14):** La **FSH** estimula el desarrollo folicular. El folículo secreta **Estrógenos**, los cuales engrosan el endometrio uterino.
                    - **Ovulación (Día 14):** Desencadenada por el **pico agudo de Hormona Luteinizante (LH)**.
                    - **Fase Lútea / Secretora (Días 15 a 28):** El folículo colapsado se transforma en **Cuerpo Lúteo o Amarillo**, que secreta elevadas cantidades de **Progesterona** (prepara el endometrio secretor para la implantación). Si no hay fecundación, el cuerpo lúteo degenera en *corpus albicans*, caen los niveles hormonales y se produce la **Menstruación**.

                    # 3. Fecundación
                    Ocurre en el **tercio externo de la trompa de Falopio (ampolla)**. Requiere la reacción acrosómica del espermatozoide y la reacción cortical para evitar la polispermia.
                """,
                conceptosClave = listOf(
                    "Espermatogénesis rinde 4 espermatozoides funcionales; Ovogénesis rinde 1 óvulo y polocitos.",
                    "La ovulación ocurre por el pico de Hormona Luteinizante (LH)"
                ),
                admissionTip = "¿Qué hormona es responsable directa del estallido folicular y expulsión del ovocito el día 14? La HORMONA LUTEINIZANTE (LH) mediante su pico plasmático.",
                admissionExplanation = "El pico de LH es la señal endocrina fundamental que gatilla la ovulación en el ciclo menstrual femenino."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t10_s04_c1",
                    statement = "En un ciclo menstrual regular promedio de 28 días, el evento fisiológico de la ovulación ocurre aproximadamente hacia el día 14, provocado de manera determinante por un incremento brusco y masivo en la concentración sanguínea de:",
                    options = listOf(
                        "Progesterona lútea",
                        "Hormona Luteinizante (LH)",
                        "Prolactina adenohipofisaria",
                        "Gonadotropina coriónica humana (hCG)",
                        "Oxitocina neurohipofisaria"
                    ),
                    correctIndex = 1,
                    explanation = "Hacia el día 13-14 del ciclo ovárico, los altos niveles de estrógenos provocan un mecanismo de retroalimentación positiva sobre la hipófisis, generando el pico de LH (hormona luteinizante), el cual gatilla la ruptura folicular y la ovulación."
                )
            )
        ),

        // ==========================================
        // SEMANA 11: GENÉTICA Y MUTACIONES
        // ==========================================
        LessonNode(
            id = "bio_t11_s01",
            subjectId = "biologia",
            semana = 11,
            subtema = "Semana 11",
            title = "Leyes de Mendel y Monohibridismo",
            theory = LessonTheory(
                id = "th_bio_t11_s01",
                asignatura = "Biología",
                semana = 11,
                titulo = "Genética Mendeliana Clásica",
                resumen = """Transmisión estadística de caracteres particulados descubierta por Gregor Mendel en Pisum sativum.


                    # 1. Conceptos Fundamentales
                    - **Gen:** Unidad física y funcional de la herencia (secuencia de ADN).
                    - **Alelos:** Formas alternativas de un mismo gen que ocupan el mismo **locus** en cromosomas homólogos.
                    - **Genotipo:** Constitución genética (Homocigoto dominante AA, Heterocigoto Aa, Homocigoto recesivo aa).
                    - **Fenotipo:** Manifestación observable del genotipo influenciado por el ambiente (Fenotipo = Genotipo + Ambiente).

                    # 2. Primera Ley: Principio de Uniformidad y Segregación
                    - **Cruce Monohíbrido (Aa × Aa):**
                      - Al cruzar dos líneas puras (AA × aa), el 100% de la F₁ es heterocigota dominante (Aa).
                      - Al autofecundar la F₁ (Aa × Aa), los alelos segregan en los gametos produciendo en la F₂:
                        - **Proporción Genotípica:** 1 AA : 2 Aa : 1 aa (25% AA, 50% Aa, 25% aa o relación 1:2:1).
                        - **Proporción Fenotípica:** 3 Dominantes : 1 Recesivo (relación 3:1).

                    # 3. Segunda Ley: Distribución Independiente
                    - Se aplica al estudio simultáneo de **dos caracteres no ligados** ubicados en cromosomas distintos:
                    - **Cruce Dihíbrido (AaBb × AaBb):**
                      - Proporción Fenotípica clásica en la descendencia:
                        9 : 3 : 3 : 1
                        (9 Dominante-Dominante, 3 Dominante-Recesivo, 3 Recesivo-Dominante, 1 Recesivo-Recesivo).
                """,
                conceptosClave = listOf(
                    "Cruce monohíbrido (Aa × Aa): F₂ fenotípica 3:1 y genotípica 1:2:1.",
                    "Cruce dihíbrido (AaBb × AaBb): proporción fenotípica 9:3:3:1."
                ),
                admissionTip = "Recuerda las proporciones clásicas de Mendel: Monohíbrido fenotípico = 3:1; Dihíbrido fenotípico = 9:3:3:1.",
                admissionExplanation = "Saber estas dos proporciones de memoria te ahorra hacer el cuadro de Punnett de 16 casillas en pleno examen de admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t11_s01_c1",
                    statement = "En cobayos, el pelaje negro (B) domina sobre el pelaje blanco (b). Si se cruzan dos cobayos heterocigotos de pelaje negro (Bb x Bb), ¿cuál es la probabilidad teórica de obtener descendientes con pelaje de color blanco en la camada?",
                    options = listOf(
                        "100%",
                        "75%",
                        "50%",
                        "25%",
                        "0%"
                    ),
                    correctIndex = 3,
                    explanation = "Al cruzar dos heterocigotos (Bb × Bb), la descendencia genotípica es 1/4 BB, 2/4 Bb y 1/4 bb. Como el fenotipo blanco es homocigoto recesivo (bb), su probabilidad es de 1/4 o 25%."
                )
            )
        ),
        LessonNode(
            id = "bio_t11_s02",
            subjectId = "biologia",
            semana = 11,
            subtema = "Semana 11",
            title = "Herencia No Mendeliana y Grupos Sanguíneos",
            theory = LessonTheory(
                id = "th_bio_t11_s02",
                asignatura = "Biología",
                semana = 11,
                titulo = "Modificaciones a las Leyes de Mendel",
                resumen = """Patrones de herencia poligénica, alelos múltiples y expresión simultánea de alelos.


                    # 1. Dominancia Incompleta (Herencia Intermedia)
                    Ningún alelo domina completamente al otro; el heterocigoto exhibe un **fenotipo intermedio**.
                    - Ejemplo: Flor 'boca de dragón' o *Mirabilis jalapa*.
                      - Rojo (CᴿCᴿ) × Blanco (CᴮCᴮ) → 100% Rosa (CᴿCᴮ).
                      - En la F₂: Proporción fenotípica y genotípica coinciden: 1 Rojo : 2 Rosas : 1 Blanco (1:2:1).

                    # 2. Codominancia
                    Ambos alelos se **expresan simultáneamente por completo** en el heterocigoto sin mezclarse ni anularse.
                    - Ejemplo: Pelaje roano en ganado vacuno (pelos blancos y pelos rojos coexistentes) y el **Grupo Sanguíneo AB**.

                    # 3. Alelos Múltiples: Sistema Sanguíneo ABO
                    Regido por un solo gen con 3 alelos: Iᴬ, Iᴮ (codominantes entre sí) e i (recesivo frente a Iᴬ e Iᴮ).
                    | Grupo (Fenotipo) | Genotipo | Aglutinógeno (Antígeno eritrocitario) | Aglutinina (Anticuerpo en plasma) |
                    | :--- | :--- | :--- | :--- |
                    | **Grupo A** | IᴬIᴬ o Iᴬi | Antígeno A | Anti-B |
                    | **Grupo B** | IᴮIᴮ o Iᴮi | Antígeno B | Anti-A |
                    | **Grupo AB** | IᴬIᴮ | Antígenos A y B | **Ninguno (Receptor Universal)** |
                    | **Grupo O** | ii | **Ninguno (Donante Universal)** | Anti-A y Anti-B |

                    # 4. Factor Rh y Eritroblastosis Fetal
                    - Rh⁺ (RR, Rr, dominante): Posee antígeno D.
                    - Rh⁻ (rr, recesivo): No posee antígeno D.
                    - **Eritroblastosis Fetal (Enfermedad Hemolítica del Recién Nacido):** Ocurre cuando una **madre Rh⁻** gesta un **segundo feto Rh⁺** (tras sensibilizarse en el primer parto); los anticuerpos maternos anti-Rh atraviesan la placenta y destruyen los eritrocitos fetales.
                """,
                conceptosClave = listOf(
                    "Dominancia incompleta: Fenotipo intermedio (flores rosadas).",
                    "Codominancia: Expresión simultánea de ambos alelos (Grupo AB)."
                ),
                admissionTip = "¡Eritroblastosis fetal fija en admisión!: Recuerda siempre la combinación de riesgo: MADRE NEGATIVA (Rh⁻) con HIJO POSITIVO (Rh⁺). Si la madre es positiva, NUNCA hay incompatibilidad Rh.",
                admissionExplanation = "El sistema inmune materno solo genera anticuerpos IgG anti-Rh si ella carece del antígeno D (Rh⁻)."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t11_s02_c1",
                    statement = "Un hombre con grupo sanguíneo A heterocigoto (IAi) concibe un hijo con una mujer de grupo sanguíneo B heterocigoto (IBi). ¿Cuáles son los fenotipos sanguíneos posibles y su probabilidad en la descendencia de esta pareja?",
                    options = listOf(
                        "100% individuos de grupo AB únicamente",
                        "50% grupo A y 50% grupo B",
                        "25% grupo A, 25% grupo B, 25% grupo AB y 25% grupo O",
                        "75% grupo AB y 25% grupo O",
                        "50% grupo AB y 50% grupo O"
                    ),
                    correctIndex = 2,
                    explanation = "Cruzando Iᴬi × Iᴮi: Gametos del padre: Iᴬ, i; de la madre: Iᴮ, i. Descendencia: 1/4 IᴬIᴮ (grupo AB), 1/4 Iᴬi (grupo A), 1/4 Iᴮi (grupo B) y 1/4 ii (grupo O), es decir, un 25% de probabilidad para cada uno de los cuatro grupos."
                )
            )
        ),
        LessonNode(
            id = "bio_t11_s03",
            subjectId = "biologia",
            semana = 11,
            subtema = "Semana 11",
            title = "Herencia Ligada al Sexo",
            theory = LessonTheory(
                id = "th_bio_t11_s03",
                asignatura = "Biología",
                semana = 11,
                titulo = "Genes en Cromosomas Heterólogos",
                resumen = """Transmisión de anomalías recesivas ligadas al segmento diferencial del cromosoma X.


                    # 1. Cromosomas Sexuales Humanos
                    El ser humano posee 46 cromosomas: 44 autosomas + 2 gonosomas o cromosomas sexuales:
                    - Mujer: 46, XX (Homogamética). En las células somáticas femeninas, uno de los cromosomas X se inactiva al azar condensándose como el **Corpúsculo de Barr (cromatina sexual)**.
                    - Varón: 46, XY (Heterogamético). Es **hemicigoto** para los genes ubicados en el cromosoma X.

                    # 2. Herencia Recesiva Ligada al Cromosoma X
                    Los varones que heredan el alelo mutado manifiestan la enfermedad obligatoriamente, ya que no poseen otro X que lo compense:
                    - **Daltonismo (Ceguera a los colores rojo-verde):**
                      - Mujer sana: XᴰXᴰ | Mujer portadora sana: XᴰXᵈ | Mujer daltónica: XᵈXᵈ.
                      - Varón sano: XᴰY | Varón daltónico: XᵈY.
                    - **Hemofilia (Déficit de factores de coagulación):**
                      - Hemofilia A (déficit de factor VIII) y Hemofilia B (déficit de factor IX).
                      - Mujer sana: XᴴXᴴ | Mujer portadora: XᴴXʰ | Mujer hemofílica: XʰXʰ (extremadamente rara).
                      - Varón sano: XᴴY | Varón hemofílico: XʰY.

                    # 3. Herencia Holándrica (Ligada al Cromosoma Y)
                    Genes ubicados en el segmento no homólogo del cromosoma Y (ej. gen SRY que determina testículos, hipertricosis auricular). Se transmiten **exclusivamente de padres a todos sus hijos varones**.
                """,
                conceptosClave = listOf(
                    "Daltonismo y Hemofilia: Recesivos ligados al cromosoma X.",
                    "El varón daltónico o hemofílico (XᵈY, XʰY) hereda la alteración siempre de la madre."
                ),
                admissionTip = "Regla de oro de admisión: un padre hemofílico NUNCA le transmite la hemofilia a sus hijos varones (les da el cromosoma Y); se la transmite a sus hijas mujeres, quienes nacen portadoras obligadas.",
                admissionExplanation = "Esta relación de transmisión en zigzag (abuelo → hija portadora → nieto afectado) es fundamental para resolver problemas de pedigrí."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t11_s04_c1",
                    statement = "Un varón con visión cromática normal (XDY) y una mujer portadora del gen del daltonismo (XDXd) planifican tener descendencia. ¿Cuál es la probabilidad de que tengan un hijo varón y que este nazca daltónico?",
                    options = listOf(
                        "100%",
                        "50%",
                        "25%",
                        "12.5%",
                        "0%"
                    ),
                    correctIndex = 2,
                    explanation = "El cruce es XᴰY × XᴰXᵈ. Descendencia total: XᴰXᴰ (hija sana, 25%), XᴰXᵈ (hija portadora, 25%), XᴰY (hijo varón sano, 25%) y XᵈY (hijo varón daltónico, 25%). Por tanto, la probabilidad de tener un varón daltónico es de 1 de 4, es decir, el 25%."
                )
            )
        ),
        LessonNode(
            id = "bio_t11_s04",
            subjectId = "biologia",
            semana = 11,
            subtema = "Semana 11",
            title = "Mutaciones y Anomalías Cromosómicas",
            theory = LessonTheory(
                id = "th_bio_t11_s04",
                asignatura = "Biología",
                semana = 11,
                titulo = "Alteraciones del Material Genético",
                resumen = """Mutaciones moleculares y aberraciones cromosómicas por no disyunción meiótica.


                    # 1. Mutaciones Génicas o Puntuales
                    Afectan la secuencia de nucleótidos de un solo gen (sustitución, inserción o deleción).
                    - **Anemia Falciforme o Drepanocitosis:** Sustitución de un solo nucleótido en el codón 6 del gen de la β-globina (GAG → GTG), cambiando **ácido glutámico por valina**. Provoca eritrocitos en forma de hoz o media luna.

                    # 2. Mutaciones Cromosómicas Estructurales
                    Alteraciones en la arquitectura interna del cromosoma:
                    - **Deleción:** Pérdida de un fragmento cromosómico (ej. **Síndrome del Maullido de Gato o Cri du Chat**, deleción en el brazo corto del cromosoma 5: 5p-).
                    - **Duplicación, Inversión** y **Translocación** (intercambio de segmentos entre cromosomas no homólogos, ej. translocación robertsoniana 14/21).

                    # 3. Mutaciones Cromosómicas Numéricas (Aneuploidías)
                    Debidas a la **no disyunción meiótica** de cromosomas homólogos (en anafase I) o cromátidas (en anafase II):
                    - **Aneuploidías Autosómicas:**
                      - **Síndrome de Down (Trisomía 21):** 47, XX, +21 o 47, XY, +21. Pliegue epicántico, braquicefalia, retraso psicomotor, cardiopatía congénita.
                      - **Síndrome de Edwards (Trisomía 18):** 47, +18. Micrognatia, dedos sobrepuestos, pie en mecedora.
                      - **Síndrome de Patau (Trisomía 13):** 47, +13. Labio leporino, fisura palatina, polidactilia, holoprosencefalia.
                    - **Aneuploidías Sexuales:**
                      - **Síndrome de Turner (Monosomía X):** 45, X0 (fenotipo femenino, baja estatura, cuello alado, amenorrea primaria, esterilidad, sin corpúsculo de Barr).
                      - **Síndrome de Klinefelter:** 47, XXY (fenotipo masculino, ginecomastia, atrofia testicular, esterilidad, presencia de 1 corpúsculo de Barr).
                """,
                conceptosClave = listOf(
                    "Down: Trisomía 21 (47, +21).",
                    "Turner: Monosomía X (45, X0) en mujeres.",
                    "Klinefelter: Aneuploidía sexual (47, XXY) en varones."
                ),
                admissionTip = "Aprende los números de las tres trisomías autosómicas con nemotecnia: Patau (13), Edwards (18) y Down (21). Y recuerda: Turner = 45,X0 (única monosomía viable en humanos).",
                admissionExplanation = "Conocer la fórmula cromosómica exacta y el cuadro clínico distintivo garantiza responder sin vacilaciones."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t11_s04_c2",
                    statement = "Una paciente acude a consulta genética por talla baja, cuello alado (pterygium colli), tórax en escudo, amenorrea primaria e infertilidad. El análisis citogenético revela 45 cromosomas totales con ausencia de un cromosoma sexual. Dicho cariotipo corresponde al síndrome de:",
                    options = listOf(
                        "Klinefelter (47, XXY)",
                        "Down (47, XX, +21)",
                        "Turner (45, X0)",
                        "Edwards (47, XX, +18)",
                        "Superhembra (47, XXX)"
                    ),
                    correctIndex = 2,
                    explanation = "El síndrome de Turner es una monosomía sexual con fórmula cariotípica 45, X0. Afecta a mujeres que carecen de un segundo cromosoma sexual, manifestando baja estatura, cuello alado, infantilismo sexual y esterilidad."
                )
            )
        ),

        // ==========================================
        // SEMANA 12: EVOLUCIÓN Y TAXONOMÍA
        // ==========================================
        LessonNode(
            id = "bio_t12_s01",
            subjectId = "biologia",
            semana = 12,
            subtema = "Semana 12",
            title = "Teorías del Origen de la Vida",
            theory = LessonTheory(
                id = "th_bio_t12_s01",
                asignatura = "Biología",
                semana = 12,
                titulo = "Origen y Síntesis Prebiótica de la Vida",
                resumen = """Refutación de la abiogénesis y fundamentos de la evolución química en la Tierra primitiva.


                    # 1. Generación Espontánea (Abiogénesis) vs Biogénesis
                    - **Abiogénesis:** Sostenida por Aristóteles y Van Helmont: la vida surge de la materia inerte por una 'fuerza vital' o *entelequia*.
                    - **Refutación Experimental de la Biogénesis:**
                      - **Francesco Redi (1668):** Demostró con frascos de carne cubiertos que los gusanos provenían de huevos puestos por moscas, no de la carne descompuesta.
                      - **Lazzaro Spallanzani (1768):** Hirvió caldos en frascos sellados herméticamente impidiendo el crecimiento microbiano.
                      - **Louis Pasteur (1862):** Utilizó **matraces con cuello de cisne** que permitían el contacto con el aire pero retenían el polvo y microorganismos en la curvatura. Al no haber crecimiento, sepultó definitivamente la generación espontánea: *Omne vivum ex vivo*.

                    # 2. Teoría Quimiosintética o Prebiótica (Oparin y Haldane, 1924)
                    Propone que la vida surgió en los mares primitivos a partir de materia inorgánica sometida a fuentes de energía extrema.
                    - **Atmósfera Primitiva:** Fuertemente **reductora**, sin oxígeno libre (O₂) ni capa de ozono (O₃). Compuesta por Metano (CH₄), Amoníaco (NH₃), Vapor de agua (H₂O) e Hidrógeno (H₂).
                    Fuentes de energía: Radiación ultravioleta solar intensa y descargas eléctricas de tormentas.
                    - **Sopa Primitiva y Coacervados:** Las moléculas inorgánicas reaccionaron originando monómeros orgánicos (aminoácidos, azúcares) en el océano, agregándose en gotas coloidales llamadas **coacervados** (precursores protocelulares).
                    - **Experimento de Miller y Urey (1953):** Recrearon en el laboratorio la atmósfera reductora y descargas eléctricas, obteniendo **aminoácidos orgánicos** (glicina, alanina), demostrando la viabilidad de la síntesis prebiótica.
                """,
                conceptosClave = listOf(
                    "Pasteur demostró la Biogénesis usando matraces de cuello de cisne.",
                    "Oparin-Haldane: Atmósfera primitiva reductora (CH₄, NH₃, H₂O, H₂)."
                ),
                admissionTip = "¿Qué gas NO existía en la atmósfera primitiva según la teoría quimiosintética de Oparin? EL OXÍGENO MOLECULAR LIBRE (O₂). La atmósfera era completamente reductora.",
                admissionExplanation = "El oxígeno libre apareció millones de años después con el advenimiento de las cianobacterias y la fotosíntesis oxigénica."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t12_s01_c1",
                    statement = "En 1953, Stanley Miller y Harold Urey recrearon experimentalmente en un circuito de vidrio cerrado las condiciones postuladas por Oparin para la Tierra primitiva, logrando sintetizar aminoácidos. ¿Cuál de los siguientes gases estuvo deliberadamente AUSENTE en dicho simulador por no existir en forma libre primitiva?",
                    options = listOf(
                        "Metano (CH4)",
                        "Amoníaco (NH3)",
                        "Oxígeno molecular (O2)",
                        "Vapor de agua (H2O)",
                        "Hidrógeno gaseoso (H2)"
                    ),
                    correctIndex = 2,
                    explanation = "La atmósfera primitiva postulada por Oparin era anóxica y reductora; no contenía oxígeno molecular libre (O₂), ya que este oxidaría y degradaría las moléculas orgánicas prebióticas en formación."
                )
            )
        ),
        LessonNode(
            id = "bio_t12_s02",
            subjectId = "biologia",
            semana = 12,
            subtema = "Semana 12",
            title = "Teorías de la Evolución Biológica",
            theory = LessonTheory(
                id = "th_bio_t12_s02",
                asignatura = "Biología",
                semana = 12,
                titulo = "Mecanismos del Cambio Evolutivo",
                resumen = """Modelos teóricos de transformación de las especies a lo largo del tiempo geológico.


                    # 1. Lamarckismo (Jean-Baptiste Lamarck, 1809)
                    Expuesto en *Filosofía Zoológica*. Primera teoría evolutiva sistemática:
                    - **Ley del uso y desuso de los órganos:** El uso continuado de un órgano lo fortifica y desarrolla; el desuso provoca su atrofia progresiva.
                    - **Herencia de los caracteres adquiridos:** Las modificaciones corporales forjadas en vida por el uso/desuso son heredadas por la descendencia. *(Postulado erróneo, ya que los cambios fenotípicos somáticos no alteran el ADN germinal)*.

                    # 2. Darwinismo (Charles Darwin y Alfred Russel Wallace, 1859)
                    Expuesto en *El origen de las especies*:
                    - **Variabilidad intraespecífica preexistente:** Los individuos de una población presentan diferencias hereditarias al azar.
                    - **Potencial biótico y lucha por la existencia:** Se reproducen más descendientes de los que el ambiente puede sostener con sus recursos limitados.
                    - **Selección Natural y supervivencia del más apto:** El medio ambiente selecciona a los individuos cuyas variaciones favorables les otorgan mayor adecuación biológica (*fitness*); estos sobreviven, dejan más descendencia y transmiten sus rasgos.
                    - *Vacío del Darwinismo:* Darwin no supo explicar la causa de la variabilidad ni cómo se transmitían los caracteres (desconocía los trabajos de Mendel).

                    # 3. Neodarwinismo o Teoría Sintética de la Evolución (Dobzhansky, Mayr, Simpson)
                    Fusiona la Selección Natural de Darwin con la **Genética Mendeliana y Molecular**:
                    - La unidad de la evolución no es el individuo, sino la **población**.
                    - Las fuentes primarias de la variabilidad genética son las **mutaciones al azar** y la **recombinación meiótica (crossing-over)**.
                    - La selección natural actúa modificando las **frecuencias alélicas** del acervo genético (*gene pool*) generacionalmente.
                """,
                conceptosClave = listOf(
                    "Lamarck: Ley del uso y desuso y herencia de caracteres adquiridos (incorrecto).",
                    "Darwin: Selección natural actúa sobre la variabilidad preexistente."
                ),
                admissionTip = "Diferencia clave de razonamiento: Para Lamarck, el ambiente MODIFICA directamente al ser vivo (la jirafa estira el cuello y le crece). Para Darwin, el ambiente SELECCIONA al que ya nació con el cuello largo favorable.",
                admissionExplanation = "Comprender que la variación precede a la selección natural es la esencia del pensamiento evolutivo moderno."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t12_s02_c1",
                    statement = "El uso indiscriminado de cefalosporinas en un hospital elimina a las bacterias susceptibles y permite que unas pocas bacterias que portaban previamente una mutación enzimática sobrevivan y se multipliquen masivamente. Este fenómeno es un claro ejemplo actual de:",
                    options = listOf(
                        "Herencia de caracteres adquiridos de Lamarck",
                        "Generación espontánea microbiana",
                        "Selección natural de mutaciones genéticas preexistentes",
                        "Evolución por uso y desuso de betalactamasas",
                        "Poliploidía vegetativa inducida"
                    ),
                    correctIndex = 2,
                    explanation = "El antibiótico actúa como una fuerza de presión ambiental que selecciona a aquellas bacterias que, por variabilidad genética previa (mutación en el plásmido), ya poseían la resistencia, sobreviviendo y aumentando su frecuencia en la población."
                )
            )
        ),
        LessonNode(
            id = "bio_t12_s03",
            subjectId = "biologia",
            semana = 12,
            subtema = "Semana 12",
            title = "Pruebas de la Evolución",
            theory = LessonTheory(
                id = "th_bio_t12_s03",
                asignatura = "Biología",
                semana = 12,
                titulo = "Evidencias Empíricas de la Evolución",
                resumen = """Registros fósiles, correspondencias anatómicas, embriología y secuenciación de macromoléculas.


                    # 1. Pruebas Anatómicas (Anatomía Comparada)
                    - **Órganos Homólogos:** Mismo origen embrionario y estructura interna semejante, aunque cumplan funciones distintas. Demuestran un **ancestro común** mediante **Evolución Divergente o Radiación Adaptativa** (ej. aleta de ballena, ala de murciélago, pata de caballo y brazo humano: todos comparten el patrón óseo quiridio húmero-radio-cúbito-carpo).
                    - **Órganos Análogos:** Distinto origen embrionario y diferente anatomía interna, pero adaptados para cumplir la **misma función**. Reflejan adaptaciones a presiones ambientales semejantes mediante **Evolución Convergente** (ej. ala de mariposa formada por quitina y ala de paloma formada por huesos y plumas).
                    - **Órganos Vestigiales o Rudimentarios:** Estructuras atrofiadas sin función actual pero funcionales en ancestros (ej. apéndice cecal humano, cóccix o vestigio de cola, muelas del juicio).

                    # 2. Pruebas Paleontológicas
                    Restos o evidencias de organismos del pasado preservados en rocas sedimentarias:
                    - Formas fósiles intermedias o de transición (ej. *Archaeopteryx*, con plumas de ave y dientes/cola ósea de reptil).
                    - Series filogenéticas (ej. evolución del caballo desde *Eohippus* a *Equus*).

                    # 3. Pruebas Bioquímicas y Moleculares
                    La prueba más concluyente y cuantificable del parentesco evolutivo:
                    - Universalidad del código genético en todos los seres vivos.
                    - Comparación del grado de similitud en secuencias de nucleótidos del ADN o de aminoácidos en proteínas conservadas (ej. citocromo c, hemoglobina). A mayor porcentaje de homología molecular, mayor cercanía filogenética.
                """,
                conceptosClave = listOf(
                    "Homólogos: Mismo origen embrionario, distinta función → Evolución DIVERGENTE (ancestro común).",
                    "Análogos: Distinto origen, misma función → Evolución CONVERGENTE."
                ),
                admissionTip = "Nemotecnia fija: H-D (Homólogo = Divergente, ancestro común). A-C (Análogo = Convergente, misma función).",
                admissionExplanation = "Esta relación cruzada resuelve el 100% de las preguntas de anatomía comparada en admisión."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t12_s03_c1",
                    statement = "El ala quitinosa de una libélula y el ala ósea emplumada de un cóndor andino cumplen la misma función locomotora de vuelo, pero tienen orígenes embrionarios y arquitecturas anatómicas totalmente distintas. Dichas estructuras corresponden a:",
                    options = listOf(
                        "Órganos homólogos por evolución divergente",
                        "Órganos análogos por evolución convergente",
                        "Órganos vestigiales rudimentarios",
                        "Estructuras atávicas en regresión",
                        "Pruebas de embriología recapitulatoria"
                    ),
                    correctIndex = 1,
                    explanation = "Los órganos análogos son aquellos que poseen distinto origen embrionario y diferente organización anatómica interna pero realizan la misma función adaptativa producto de la evolución convergente."
                )
            )
        ),
        LessonNode(
            id = "bio_t12_s04",
            subjectId = "biologia",
            semana = 12,
            subtema = "Semana 12",
            title = "Taxonomía y Dominios Biológicos",
            theory = LessonTheory(
                id = "th_bio_t12_s04",
                asignatura = "Biología",
                semana = 12,
                titulo = "Sistemática, Clasificación y Filogenia",
                resumen = """Categorías taxonómicas linneanas, nomenclatura formal y los dominios moleculares modernos.


                    # 1. Taxonomía de Linneo y Nomenclatura Binomial
                    **Carlos Linneo** (1753), padre de la taxonomía:
                    - **Categorías taxonómicas obligatorias (orden jerárquico ascendente):**
                      Especie → Género → Familia → Orden → Clase → Filo / División → Reino → Dominio
                    - **Nomenclatura Binomial:** Todo ser vivo se designa por dos palabras en latín o latinizadas:
                      - La primera palabra es el **Género** (con mayúscula inicial).
                      - La segunda palabra es el **epíteto específico** (todo con minúscula).
                      - Se escriben en *cursiva* o subrayados (ej. *Homo sapiens*, *Zea mays*, *Vicugna vicugna*).

                    # 2. Los Cinco Reinos (Robert Whittaker, 1969)
                    1. **Monera:** Células procariotas unicelulares (bacterias, cianobacterias).
                    2. **Protista:** Eucariotas unicelulares o coloniales simples (protozoarios heterótrofos y algas unicelulares autótrofas).
                    3. **Fungi (Hongos):** Eucariotas heterótrofos con digestión extracelular por absorción, pared celular de **quitina** y reserva de glucógeno (mohos, levaduras, setas).
                    4. **Plantae:** Eucariotas pluricelulares autótrofos fotosintéticos con pared de celulosa y reserva de almidón.
                    5. **Animalia:** Eucariotas pluricelulares heterótrofos ingestivos con tejidos diferenciados y motilidad.

                    # 3. Los Tres Dominios (Carl Woese, 1990)
                    Basado en la secuenciación del **ARNr 16S / 18S**:
                    - **Dominio Archaea:** Procariontes extremófilos (metanógenas, halófilas, termoacidófilas). Tienen enlaces éter en sus lípidos de membrana y carecen de peptidoglicano.
                    - **Dominio Bacteria (Eubacteria):** Bacterias verdaderas con pared de peptidoglicano y cianobacterias.
                    - **Dominio Eukarya:** Todos los organismos formados por células eucariotas (protozoos, algas, hongos, plantas y animales).
                """,
                conceptosClave = listOf(
                    "Jerarquía: Dominio > Reino > Filo > Clase > Orden > Familia > Género > Especie.",
                    "Nomenclatura: Género (mayúscula) y especie (minúscula)."
                ),
                admissionTip = "Los hongos (Fungi) NO pertenecen al reino vegetal: son heterótrofos por absorción, tienen pared de QUITINA (no celulosa) y almacenan GLUCÓGENO (no almidón).",
                admissionExplanation = "Este contraste metabólico y citológico entre plantas y hongos es una pregunta clásica de clasificación biológica."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t12_s04_c1",
                    statement = "Carl Woese revolucionó la taxonomía biológica al establecer el sistema de clasificación en Tres Dominios (Bacteria, Archaea y Eukarya). ¿Qué molécula biomarcadora universal utilizó como criterio filogenético comparativo para agrupar a todos los seres vivos?",
                    options = listOf(
                        "La secuencia de fosfolípidos de la membrana nuclear",
                        "El ARN ribosomal (ARNr 16S y 18S)",
                        "El porcentaje de colesterol incrustado en el citoplasma",
                        "La presencia de pared celular con peptidoglicano",
                        "Los codones de terminación del ARN mensajero"
                    ),
                    correctIndex = 1,
                    explanation = "Carl Woese comparó la secuencia de nucleótidos del ARN ribosomal (ARNr de la subunidad menor: 16S en procariotas y 18S en eucariotas), molécula altamente conservada evolutivamente y presente en todas las células vivas."
                )
            )
        ),

        // ==========================================
        // SEMANA 13: ECOLOGÍA Y MEDIO AMBIENTE
        // ==========================================
        LessonNode(
            id = "bio_t13_s01",
            subjectId = "biologia",
            semana = 13,
            subtema = "Semana 13",
            title = "Ecosistema, Hábitat y Redes Tróficas",
            theory = LessonTheory(
                id = "th_bio_t13_s01",
                asignatura = "Biología",
                semana = 13,
                titulo = "Flujo de Energía y Niveles Tróficos",
                resumen = """Estructura ecológica, ocupación espacial vs funcional y transferencia unidireccional de energía.


                    # 1. Componentes del Ecosistema y Nicho Ecológico
                    Ecosistema = Biotopo (factores abióticos: suelo, luz, agua) + Biocenosis (seres vivos)
                    - **Hábitat:** Lugar físico o espacio geográfico donde vive y puede hallarse una especie ('la dirección postal del organismo').
                    - **Nicho Ecológico:** Papel funcional, rol trófico y conjunto de adaptaciones que desempeña una especie en la comunidad ('la profesión u oficio del organismo').

                    # 2. Niveles Tróficos y Redes Alimentarias
                    - **Productores (Autótrofos):** Plantas, algas y cianobacterias fotosintéticas. Fijan la energía radiante solar en energía química orgánica.
                    - **Consumidores (Heterótrofos):**
                      - Primarios (Herbívoros): Se alimentan de productores.
                      - Secundarios (Carnívoros primarios): Se alimentan de herbívoros.
                      - Terciarios (Carnívoros superiores / superdepredadores).
                    - **Descomponedores o Desintegradores:** Bacterias y hongos que degradan la materia orgánica muerta hasta compuestos inorgánicos minerales, cerrando el ciclo.

                    # 3. Flujo de Energía y Ley del Diezmo Ecológico (Lindeman)
                    - La energía en los ecosistemas fluye de forma **unidireccional y abierta** (no es cíclica; ingresa como luz solar y se disipa progresivamente como calor al medio ambiente).
                    - **Regla del 10% (Diezmo ecológico):** En cada paso de un nivel trófico al siguiente, solo se transfiere aproximadamente el **10% de la energía química** disponible en la biomasa; el 90% restante se disipa en calor, respiración y excreción.
                """,
                conceptosClave = listOf(
                    "Hábitat = lugar donde vive; Nicho ecológico = función o rol trófico que desempeña.",
                    "La materia es cíclica (se recicla); la energía es unidireccional y se disipa en calor.",
                    "Diezmo ecológico: solo pasa el 10% de energía al nivel trófico superior."
                ),
                admissionTip = "Si te ponen una cadena: Pasto (10000 kcal) → Conejo → Zorro → Cóndor, ¿cuánta energía llega al zorro? Pasto: 10000 kcal, Conejo: 1000 kcal, Zorro: 100 kcal, Cóndor: 10 kcal.",
                admissionExplanation = "Aplicar la regla del diezmo dividiendo sucesivamente entre 10 es un ejercicio aritmético fijo de ecología."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t13_s01_c1",
                    statement = "En un pastizal de puna en Imata, los pastos de ichu acumulan 50000 kcal de energía neta al año en su biomasa vegetal. De acuerdo con la ley del diezmo ecológico de Lindeman, ¿cuánta energía química útil estará disponible para los pumas que se alimentan de los camélidos herbívoros de este ecosistema?",
                    options = listOf(
                        "50000 kcal",
                        "5000 kcal",
                        "500 kcal",
                        "50 kcal",
                        "5 kcal"
                    ),
                    correctIndex = 2,
                    explanation = "Nivel 1 (Productores - ichu): 50000 kcal. Nivel 2 (Consumidores primarios - camélidos): 10% de 50000 = 5000 kcal. Nivel 3 (Consumidores secundarios - puma): 10% de 5000 = 500 kcal."
                )
            )
        ),
        LessonNode(
            id = "bio_t13_s02",
            subjectId = "biologia",
            semana = 13,
            subtema = "Semana 13",
            title = "Ciclos Biogeoquímicos",
            theory = LessonTheory(
                id = "th_bio_t13_s02",
                asignatura = "Biología",
                semana = 13,
                titulo = "Reciclaje de Elementos Vitales",
                resumen = """Rutas biogeoquímicas que aseguran la recirculación permanente de macroelementos.


                    # 1. Ciclo del Carbono
                    - El CO₂ atmosférico e hidrosférico es fijado por los productores mediante la **fotosíntesis** para transformarse en biomasa de carbohidratos.
                    - El carbono retorna a la atmósfera en forma de CO₂ mediante la **respiración celular** de todos los seres vivos, la **descomposición microbiana** y la **combustión** de combustibles fósiles (carbón, petróleo y gas natural).

                    # 2. Ciclo del Nitrógeno (El ciclo biogeoquímico más evaluado)
                    El gas nitrógeno (N₂) conforma el 78% de la atmósfera pero es inerte para eucariotas; requiere bacterias especializadas:
                    1. **Fijación del Nitrógeno:** Bacterias de vida libre (*Azotobacter*) y bacterias simbióticas asociadas a nódulos radiculares de leguminosas (**Rhizobium**) reducen el N₂ a amoníaco/amonio (NH₃ / NH₄⁺) mediante la enzima nitrogenasa.
                    2. **Nitrificación (Bacterias quimiosintéticas del suelo):**
                       - Nitrosación: *Nitrosomonas* oxidan amonio a nitrito (NO₂⁻).
                       - Nitratación: *Nitrobacter* oxidan nitritos a **nitratos (NO₃⁻)**, que es la **forma asimilable principal por las raíces vegetales**.
                    3. **Asimilación:** Las plantas absorben nitratos y los incorporan en aminoácidos y nucleótidos.
                    4. **Amonificación:** Descomponedores degradan desechos orgánicos liberando amoníaco.
                    5. **Desnitrificación:** Bacterias anaeróbicas (*Pseudomonas denitrificans*) reducen nitratos devolviendo gas nitrógeno (N₂) a la atmósfera.

                    # 3. Ciclo del Fósforo
                    Ciclo **sedimentario** (no tiene fase gaseosa atmosférica). Su reservorio principal son las rocas fosfatadas y el **guano de las islas**. El fósforo se libera lentamente por meteorización como fosfatos inorgánicos (PO₄³⁻).
                """,
                conceptosClave = listOf(
                    "Fijación: *Rhizobium* en raíces de leguminosas convierte N₂ en amonio.",
                    "Forma asimilable de nitrógeno para las plantas: NITRATOS (NO₃⁻)."
                ),
                admissionTip = "Pregunta recurrente: ¿Qué bacteria fija el nitrógeno atmosférico viviendo en simbiosis con las raíces de plantas leguminosas (alfalfa, habas, frejol)? RHIZOBIUM.",
                admissionExplanation = "Esta simbiosis mutualista nodular es el modelo clásico de fijación biológica de nitrógeno en agronomía y biología."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t13_s02_c1",
                    statement = "Los agricultores de la campiña arequipeña rotan cultivos sembrando alfalfa o habas para enriquecer naturalmente la fertilidad del suelo en nitrógeno. Esta práctica agrícola se fundamenta en la presencia de nódulos radiculares que albergan a la bacteria simbionte fijadora de nitrógeno denominada:",
                    options = listOf(
                        "Nitrosomonas",
                        "Nitrobacter",
                        "Rhizobium",
                        "Pseudomonas denitrificans",
                        "Escherichia coli"
                    ),
                    correctIndex = 2,
                    explanation = "*Rhizobium* es el género bacteriano que forma nódulos en las raíces de plantas leguminosas, fijando el nitrógeno atmosférico gaseoso (N₂) y transformándolo en amonio disponible para la nutrición vegetal."
                )
            )
        ),
        LessonNode(
            id = "bio_t13_s03",
            subjectId = "biologia",
            semana = 13,
            subtema = "Semana 13",
            title = "Relaciones Biológicas Interespecíficas",
            theory = LessonTheory(
                id = "th_bio_t13_s03",
                asignatura = "Biología",
                semana = 13,
                titulo = "Interacciones Ecológicas en la Comunidad",
                resumen = """Simbiosis y dinámicas poblacionales evaluadas por signos de beneficio (+), perjuicio (-) o neutralidad (0).


                    # 1. Relaciones Interespecíficas Positivas / Armónicas
                    - **Mutualismo (+/+):** Ambas especies se benefician. Si la unión es obligatoria y permanente para la supervivencia de ambas, es un mutualismo obligado (ej. **Líquenes:** Hongo + Alga o Cianobacteria; micorrizas: hongo + raíz de planta; polinización por insectos).
                    - **Protocooperación (+/+):** Ambas se benefician pero la relación no es obligatoria; pueden vivir por separado (ej. pez payaso y anémona, aves limpiadoras y rumiantes).
                    - **Comensalismo (+/0):** Una especie se beneficia (comensal) y la otra no se beneficia ni se perjudica (neutra). Ej. pez rémora adherido al tiburón para transporte y restos de comida; epifitismo de orquídeas sobre ramas de árboles.

                    # 2. Relaciones Interespecíficas Negativas / Antagónicas
                    - **Parasitismo (+/-):** El parásito se beneficia viviendo a expensas del hospedador al cual perjudica sin causarle necesariamente la muerte inmediata (ej. tenia *Taenia solium* en intestino humano, garrapatas, piojos).
                    - **Depredación (+/-):** El depredador caza, mata y devora a la presa de inmediato (ej. puma cazando vicuña, lechuza cazando ratón).
                    - **Competencia Interespecífica (-/-):** Dos especies compiten por el mismo recurso limitado (alimento, territorio, luz). Ambas resultan perjudicadas energéticamente (principio de exclusión competitiva de Gause).
                    - **Amensalismo (-/0):** Una especie inhibe o perjudica a otra sin obtener beneficio ni daño (ej. el hongo *Penicillium* secreta penicilina que aniquila bacterias circundantes; eucaliptos secretan toxinas que impiden germinar a otras plantas: alelopatía).
                """,
                conceptosClave = listOf(
                    "Mutualismo (+/+): Ambos se benefician (líquenes: hongo + alga).",
                    "Comensalismo (+/0): Uno se beneficia y el otro es neutro (orquídeas epífitas)."
                ),
                admissionTip = "¡Cuidado con la definición de Líquenes!: Los líquenes son una simbiosis MUTUALISTA obligatoria entre un hongo (micobionte) que aporta humedad y soporte, y un alga/cianobacteria (fotobionte) que aporta fotosíntesis.",
                admissionExplanation = "Este ejemplo encabeza las preguntas sobre relaciones simbióticas en los prospectos universitarios peruanos."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t13_s03_c1",
                    statement = "En los troncos de los árboles de la selva alta crecen orquídeas que utilizan la corteza del árbol únicamente como soporte físico para captar mejor la luz solar, sin extraer nutrientes ni dañar el floema del árbol hospedante. ¿Qué relación interespecífica se ilustra en este caso?",
                    options = listOf(
                        "Parasitismo estricto",
                        "Comensalismo (epifitismo)",
                        "Mutualismo obligado",
                        "Amensalismo alelopático",
                        "Depredación vegetal"
                    ),
                    correctIndex = 1,
                    explanation = "El epifitismo de las orquídeas sobre las ramas de árboles es un caso representativo de comensalismo (+/0): la orquídea se beneficia al ganar altura lumínica, mientras que el árbol no sufre daño ni obtiene beneficio."
                )
            )
        ),
        LessonNode(
            id = "bio_t13_s04",
            subjectId = "biologia",
            semana = 13,
            subtema = "Semana 13",
            title = "Contaminación y Áreas Protegidas del Perú",
            theory = LessonTheory(
                id = "th_bio_t13_s04",
                asignatura = "Biología",
                semana = 13,
                titulo = "Problemas Ambientales y Conservación en el Perú",
                resumen = """Impactos antrópicos globales y categorías del Sistema Nacional de Áreas Naturales Protegidas.


                    # 1. Grandes Problemas Ambientales Globales
                    - **Efecto Invernadero y Calentamiento Global:** Gases de efecto invernadero (**CO₂, CH₄, vapor de agua, N₂O**) retienen radiación infrarroja térmica en la tropósfera, elevando la temperatura media del planeta y desglaciando los nevados andinos.
                    - **Destrucción de la Capa de Ozono (O₃ estratosférico):** Causada por los **Clorofluorocarbonos (CFC)** de aerosoles y refrigerantes; los radicales de cloro destruyen moléculas de ozono aumentando la radiación ultravioleta B (UV-B).
                    - **Lluvia Ácida:** Óxidos de azufre (SO₂) y de nitrógeno (NOₓ) de la combustión industrial reaccionan con el agua atmosférica formando ácido sulfúrico (H₂SO₄) y nítrico (HNO₃), acidificando suelos y lagos.
                    - **Eutrofización:** Enriquecimiento excesivo de cuerpos de agua por **nitratos y fosfatos** (fertilizantes agrícolas y detergentes), provocando proliferación masiva de algas superficiales, bloqueo de luz solar y anoxia profunda con mortandad masiva de peces.

                    # 2. Áreas Naturales Protegidas del Perú (SINANPE - SERNANP)
                    - **Áreas de Uso Tangible (Directo):** Se permite el aprovechamiento sostenible de recursos naturales:
                      - **Reservas Nacionales:** Conservación de biodiversidad con uso regulado (ej. **Salinas y Aguada Blanca** en Arequipa/Moquegua para vicuñas, Paracas, Pampa Galeras, Titicaca).
                      - **Reservas Comunales, Bosques de Protección, Cotos de Caza**.
                    - **Áreas de Uso Intangible (Indirecto):** Se prohíbe la extracción de recursos y modificaciones directas; solo se permite investigación y turismo científico regulado:
                      - **Parques Nacionales:** Ecosistemas de gran extensión con flora y fauna intangibles (ej. Huascarán, Manú, Cerros de Amotape, Cutervo).
                      - **Santuarios Nacionales:** Protegen una especie o comunidad biológica específica (ej. **Lagunas de Mejía** en la costa arequipeña para aves migratorias, Huayllay).
                      - **Santuarios Históricos:** Protegen valores naturales vinculados a sitios históricos (ej. **Machu Picchu**, Pampas de Ayacucho, Chacamarca).
                """,
                conceptosClave = listOf(
                    "Calentamiento global: Gases GEI (CO₂, CH₄, vapor de agua, N₂O).",
                    "Capa de ozono: destruida por CFCs aumentando UV-B.",
                    "Áreas intangibles: Parques, Santuarios Nacionales e Históricos."
                ),
                admissionTip = "¡Arequipa fija en el examen!: La Reserva Nacional de Salinas y Aguada Blanca protege a la vicuña (uso directo/tangible). El Santuario Nacional Lagunas de Mejía protege a las aves migratorias (uso indirecto/intangible).",
                admissionExplanation = "Diferenciar el nivel de intangibilidad y el objeto biológico de conservación de las dos áreas protegidas emblemáticas de la región Arequipa es materia obligatoria de examen."
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t13_s04_c1",
                    statement = "El Santuario Nacional Lagunas de Mejía, ubicado en la provincia de Islay (Arequipa), alberga a más de 180 especies de aves playeras migratorias y residentes. De acuerdo con la legislación ambiental del SINANPE, dicha unidad de conservación clasifica legalmente como un área de:",
                    options = listOf(
                        "Uso directo o tangible con aprovechamiento agropecuario libre",
                        "Uso indirecto o intangible donde está prohibida la extracción de recursos naturales",
                        "Coto de caza comercial regulada",
                        "Zona reservada de explotación minera transitoria",
                        "Reserva comunal de pastoreo intensivo"
                    ),
                    correctIndex = 1,
                    explanation = "Los Santuarios Nacionales, al igual que los Parques Nacionales y Santuarios Históricos, son Áreas Naturales Protegidas de uso indirecto o intangible, donde no se permite la extracción de recursos ni la modificación del hábitat, permitiéndose únicamente la investigación científica y el turismo regulado."
                )
            )
        )
    )
}
