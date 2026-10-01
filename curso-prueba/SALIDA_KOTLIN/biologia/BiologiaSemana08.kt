package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t08_s01",
            title = "COORDINACIÓN Y REGULACIÓN - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "COORDINACIÓN Y REGULACIÓN - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La coordinación y regulación biológica constituyen los mecanismos fisiológicos que permiten a los organismos pluricelulares percibir variaciones del medio interno y externo, procesar información y emitir respuestas adaptativas homeostáticas. Esta función se organiza en dos vertientes evolutivas primordiales:
1. **Regulación en Vegetales (Fitohormonas y Tropismos):** Ausencia de sistema nervioso; la coordinación celular depende exclusivamente de mensajeros químicos transportados célula a célula o por haces vasculares:
   - **Promotoras del Crecimiento:** Auxinas (AIA, elongación celular, dominancia apical y fototropismo), Citoquininas (división celular/citocinesis, retardo de la senescencia foliar) y Giberelinas (GA_3, elongación de entrenudos, germinación de semillas por inducción de \alpha-amilasa).
   - **Inhibidoras o Reguladoras de Estrés:** Ácido Abscísico (ABA, cierre estomático ante déficit hídrico, dormancia de semillas y yemas) y Etileno (C_2H_4, gas que promueve la maduración de frutos climatéricos, abscisión de hojas y epinastia).
2. **Regulación en Animales y Humanos (Sistemas Nervioso y Endocrino):**
   - **Coordinación Nerviosa:** Respuestas ultra-rápidas, focales y electroquímicas mediante potenciales de acción (canales de Na^+ y K^+ dependientes de voltaje) y sinapsis químicas con neurotransmisores (acetilcolina, glutamato, GABA, dopamina).
   - **Coordinación Endocrina:** Respuestas sostenidas, difusas y humorales mediante hormonas vertidas al torrente sanguíneo.
   - **Eje Neuroendocrino Mayor:** El eje Hipotálamo-Hipófisis-Glándula periférica, gobernado por mecanismos de retroalimentación o feedback negativo (asa larga y corta) y positivo (ej. pico de LH para ovulación o liberación de oxitocina en el parto).

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. REGULACIÓN VEGETAL: FITOHORMONAS Y MOVIMIENTOS

Las fitohormonas son compuestos orgánicos sintetizados en concentraciones extremadamente bajas (\sim 10^{-6} a 10^{-10}\text{ M}) en tejidos meristemáticos o parenquimáticos, capaces de desencadenar cascadas de transducción de señales que modulan la expresión génica y el desarrollo celular.

#### A. Fitohormonas Promotoras del Crecimiento
1. **Auxinas (Ácido Indol-3-Acético, AIA):**
   - *Lugar de síntesis:* Meristemo apical del tallo, yemas apicales, hojas jóvenes y embriones en desarrollo. Síntesis derivada del aminoácido **L-triptófano**.
   - *Transporte:* **Transporte polar polarizado basipétalo** (desde el ápice hacia la base) mediado por transportadores de eflujo PIN situados en la membrana basal de las células parenquimáticas.
   - *Funciones principales:*
     - **Elongación celular:** Hipótesis del crecimiento ácido (la auxina activa las bombas H^+-ATPasa de la membrana plasmática; la acidificación de la pared activa **expansinas** que rompen enlaces no covalentes entre microfibrillas de celulosa y hemicelulosa, permitiendo la distensión celular por turgencia).
     - **Dominancia apical:** Inhibe el desarrollo de las yemas axilares laterales mientras la yema apical permanezca intacta.
     - **Fototropismo y Gravitropismo:** Migración lateral de auxinas hacia el lado sombreado del tallo, provocando mayor elongación y curvatura hacia la luz (fototropismo positivo). En la raíz, altas concentraciones de auxina inhiben la elongación celular, curvándola hacia abajo (gravitropismo positivo mediado por estatolitos en la cofia).
     - Inducción de raíces adventicias y desarrollo del fruto (partenocarpia).
2. **Citoquininas (Zeatina, Kinetina, BAP):**
   - *Lugar de síntesis:* Meristemo apical de la raíz principalmente; se transportan en sentido acrópeto por el xilema. Derivan de la adenina (isopentenil adenina).
   - *Funciones principales:*
     - Estimulan la **división celular (mitosis)** y la citocinesis en presencia de auxinas.
     - Retrasan la **senescencia foliar** (retrasan la degradación de clorofila y proteínas, "efecto Richmond-Lang").
     - Rompen la dominancia apical, promoviendo el crecimiento de yemas laterales.
     - *Relación Auxina/Citoquinina en cultivo in vitro (Skoog):*
       - Alta auxina / baja citoquinina \implies formación de raíces (rizogénesis).
       - Baja auxina / alta citoquinina \implies formación de brotes/tallos (caulogénesis).
       - Proporción equilibrada \implies masa celular indiferenciada (**callo**).
3. **Giberelinas (GA_3 o Ácido Giberélico):**
   - *Lugar de síntesis:* Hojas jóvenes, meristemos apicales, raíces y semillas inmaduras. Derivan de la ruta de los terpenoides/isoprenoides.
   - *Funciones principales:*
     - **Elongación de entrenudos:** Revierte el enanismo genético en mutantes de maíz y guisante (alargamiento rápido del tallo o floración prematura/espigado).
     - **Ruptura de la dormancia y germinación de semillas:** Tras la imbibición de agua por la semilla, el embrión secreta GA_3 hacia la capa de **aleurona**, induciendo la transcripción de la enzima **\alpha-amilasa**, la cual hidroliza el almidón del endospermo en maltosa y glucosa para nutrir al embrión.
     - Promueve el desarrollo de frutos y partenocarpia en uvas (frutos de mayor tamaño sin semilla).

#### B. Fitohormonas Inhibidoras y de Estrés
1. **Ácido Abscísico (ABA):**
   - *Lugar de síntesis:* Células con plastidios en hojas, tallos y raíces maduras sometidas a estrés hídrico. Sintetizado a partir de carotenoides (violaxantina).
   - *Funciones principales:*
     - **Cierre estomático ante estrés hídrico:** Se une a receptores PYR/PYL/RCAR en las células oclusivas, activa quinasas SnRK2, induce flujo de salida de K^+ y aniones (Cl^- y malato) y pérdida osmótica de agua \to pérdida de turgencia \to cierre rápido del estoma.
     - **Inducción y mantenimiento de la dormancia de semillas y yemas:** Antagonista directo de las giberelinas.
     - Inhibe el crecimiento vegetativo general. (A pesar de su nombre histórico, el papel del ABA en la abscisión de hojas es secundario respecto al etileno).
2. **Etileno (H_2C=CH_2):**
   - *Naturaleza química:* Única fitohormona gaseosa e hidrocarburo insaturado. Sintetizada a partir del aminoácido **L-metionina** vía SAM y ACC (ácido 1-aminociclopropano-1-carboxílico).
   - *Funciones principales:*
     - **Maduración de frutos climatéricos:** Estimula el autocatálisis de etileno, respiración celular acelerada, degradación de clorofila, hidrólisis de almidón en azúcares simples y síntesis de poligalacturonasa (ablanda la lámina media de la pared celular) en manzanas, plátanos, tomates, paltas.
     - **Abscisión foliar y floral:** Promueve la digestión enzimática de la zona de abscisión en el pecíolo foliar.
     - **Epinastia:** Curvatura hacia abajo de las hojas por mayor crecimiento de la cara adaxial.
     - "Respuesta triple" en plántulas etioladas: acortamiento y engrosamiento del hipocótilo, y curvatura exagerada del gancho apical.

#### C. Movimientos Vegetales
* **Tropismos:** Respuestas de crecimiento orientadas con respecto a la dirección del estímulo ambiental; son irreversibles:
  - *Fototropismo:* Mediado por auxinas y fototropinas. Positivo en tallos, negativo en raíces.
  - *Gravitropismo (Geotropismo):* Positivo en raíz (hacia el centro de gravedad, mediado por estatolitos en la cofia), negativo en tallo.
  - *Tigmotropismo:* Crecimiento orientado por contacto mecánico (zarcillos de enredaderas).
* **Nastias:** Respuestas de movimiento temporales y reversibles independientes de la dirección del estímulo; mediadas por cambios turgentes en pulvínulos celulares:
  - *Sismonastia (Tigmonastia):* Movimiento rápido por choque mecánico o contacto (hojas de *Mimosa pudica* por despolarización y salida osmótica de K^+ en células motoras del pulvínulo).
  - *Fotonastia / Nictinastia:* Apertura y cierre de flores o folíolos en respuesta al ciclo luz-oscuridad.

---

### 2.2. REGULACIÓN NERVIOSA EN ANIMALES

#### A. Neurofisiología: Potencial de Reposo y Potencial de Acción
1. **Potencial de Membrana en Reposo (PMR \approx -70\text{ mV}):**
   - Determinado por la alta permeabilidad pasiva a K^+ a través de canales de fuga constitutivos y por la actividad de la **bomba Na^+/K^+-ATPasa** (extrae 3\ Na^+ e ingresa 2\ K^+, manteniendo el gradiente electroquímico).
2. **Potencial de Acción (Ley del Todo o Nada):**
   - *Despolarización:* Si el estímulo alcanza el umbral de disparo (\approx -55\text{ mV}), se abren masivamente los canales de Na^+ dependientes de voltaje, ingresando Na^+ hasta alcanzar +30\text{ a }+35\text{ mV}.
   - *Repolarización:* Inactivación rápida de canales de Na^+ y apertura retardada de canales de K^+ dependientes de voltaje \to salida masiva de K^+ al líquido extracelular.
   - *Hiperpolarización transitoria:* Los canales de K^+ permanecen abiertos unos milisegundos más, llevando el potencial a \approx -85\text{ mV}.
   - *Periodo refractario absoluto:* Canales de Na^+ inactivados; es imposible generar un segundo potencial.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS, ECUACIONES Y LEYES FUNDAMENTALES

1. **Ecuación de Nernst para un Ion:**
   E_{\text{ion}} = \frac{RT}{zF} \ln \left( \frac{[\text{ion}]_{\text{ext}}}{[\text{ion}]_{\text{int}}} \right) = \frac{61.5}{z} \log_{10} \left( \frac{[\text{ion}]_{\text{ext}}}{[\text{ion}]_{\text{int}}} \right) \quad (\text{a } 37^\circ\text{C})
   - Para el K^+ ([K^+]_{\text{int}} = 140\text{ mM}, [K^+]_{\text{ext}} = 4\text{ mM}):
     E_{K^+} = 61.5 \log_{10} \left(\frac{4}{140}\right) \approx -95\text{ mV}
   - Para el Na^+ ([Na^+]_{\text{int}} = 14\text{ mM}, [Na^+]_{\text{ext}} = 140\text{ mM}):
     E_{Na^+} = 61.5 \log_{10} (10) \approx +61.5\text{ mV}


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t08_s01_c01",
                    question = "**Enunciado:** En un centro de acopio agrícola en Camaná, se cosechan tomates y plátanos aún verdes para evitar que se dañen durante el transporte terrestre hacia Arequipa. Para acelerar su maduración simultánea antes de distribuirlos a los mercados minoristas, los comerciantes cierran herméticamente las bodegas de almacenamiento e introducen una sustancia química promotora. ¿Qué fitohormona se encuentra involucrada directamente en este proceso y qué cambio fisiológico induce?",
                    options = listOf(
                        "Ácido abscísico; aumento del potencial osmótico celular.",
                        "Auxina; inducción de fototropismo en el pericarpio.",
                        "Etileno; degradación de la clorofila y síntesis de azúcares y enzimas que ablandan el fruto.",
                        "Giberelina; división meiótica de las semillas del fruto."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Los frutos como el plátano y el tomate son **frutos climatéricos**, caracterizados por un pico brusco en la tasa respiratoria acompañado por una síntesis autocatalítica de **etileno** (C_2H_4). 2. El etileno actúa activando genes que codifican enzimas específicas: clorofilasas (que degradan el pigmento verde de la clorofila revelando carotenoides), amilasas (que transforman almidón en azúcares simples aportando sabor dulce) y pectinasas/poligalacturonasas (que hidrolizan la lámina media de la pared celular logrando la textura blanda). **Respuesta:** C ---"
                ),
                Challenge(
                    id = "bio_t08_s01_c02",
                    question = "**Enunciado:** La tetrodotoxina (TTX) es una potente neurotoxina aislada del pez globo (*Takifugu sp.*) que bloquea de forma selectiva y reversible los canales de sodio dependientes de voltaje en la membrana de las fibras nerviosas. Si se aplica TTX a un axón gigante de calamar sometido a estimulación eléctrica supraumbral en laboratorio, ¿cuál de los siguientes eventos electrofisiológicos se registrará en el osciloscopio?",
                    options = listOf(
                        "Hiperpolarización prolongada por apertura continua de canales de potasio.",
                        "Disparo continuo e incontrolado de potenciales de acción por ausencia de periodo refractario.",
                        "Imposibilidad absoluta de despolarizar la membrana hasta el nivel de disparo, aboliendo el potencial de acción.",
                        "Disminución brusca del potencial de reposo desde -70\\text{ mV} hasta -120\\text{ mV}."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. La fase ascendente o de despolarización rápida del potencial de acción axonal requiere el influjo masivo y sincronizado de iones Na^+ a favor de su gradiente electroquímico a través de los **canales de Na^+ dependientes de voltaje**. 2. Al bloquearse estos canales con TTX, aunque el estímulo experimental sea supraumbral, el sodio extracelular no puede ingresar al citoplasma axonal. 3. En consecuencia, la membrana es incapaz de revertir su polaridad hacia valores positivos (+30\\text{ mV}); el potencial de acción se bloquea totalmente y no hay transmisión del impulso nervioso. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "bio_t08_s01_c03",
                    question = "**Enunciado:** Una paciente de 35 años presenta intolerancia al frío, ganancia ponderal a pesar de hiporexia, sequedad cutánea, bradicardia y astenia marcada. Los exámenes hormonales en suero reportan:",
                    options = listOf(
                        "Hipotiroidismo secundario por adenoma hipofisario invasor.",
                        "Hipertiroidismo primario por exceso de conversión periférica de T_4 a T_3.",
                        "Hipotiroidismo primario; la falla radica en la glándula tiroides, lo que anula la retroalimentación negativa hacia la adenohipófisis.",
                        "Bocio tóxico difuso por autoanticuerpos que estimulan el receptor de TSH."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. El eje opera por **retroalimentación negativa (feedback negativo)**: la T_4 y T_3 libres circulantes ejercen freno inhibitorio directo sobre las células tirotropas de la adenohipófisis (inhibiendo TSH) y sobre el hipotálamo (inhibiendo TRH). 2. Si la falla radica en la glándula tiroides (ej. Tiroiditis de Hashimoto, tiroiditis autoinmune destructiva), no se sintetizan T_4 ni T_3 \\implies se define como **hipotiroidismo primario**. 3. Al caer los niveles plasmáticos de T_4 y T_3, se elimina el freno inhibitorio fisiológico sobre la adenohipófisis. En respuesta, las células tirotropas hiperproducen y secretan cantidades masivas de TSH en un intento biológico inútil de estimular una glándula tiroides no funcional. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "bio_t08_s01_c04",
                    question = "¿Qué aminoácido actúa como precursor bioquímico en la síntesis de auxinas (AIA)?",
                    options = listOf(
                        "El etileno (C_2H_4); sintetizado a partir de L-metionina.",
                        "El Ácido Abscísico (ABA).",
                        "En los núcleos supraóptico y paraventricular del Hipotálamo (la neurohipófisis solo las almacena y libera).",
                        "El L-triptófano."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: El L-triptófano."
                ),
                Challenge(
                    id = "bio_t08_s01_c05",
                    question = "¿Cuál es la única fitohormona de naturaleza gaseosa y cuál es su aminoácido precursor?",
                    options = listOf(
                        "El etileno (C_2H_4); sintetizado a partir de L-metionina.",
                        "El L-triptófano.",
                        "El Ácido Abscísico (ABA).",
                        "En los núcleos supraóptico y paraventricular del Hipotálamo (la neurohipófisis solo las almacena y libera)."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: El etileno (C_2H_4); sintetizado a partir de L-metionina."
                ),
                Challenge(
                    id = "bio_t08_s01_c06",
                    question = "¿Qué fitohormona induce el cierre estomático ante situaciones de sequía o estrés hídrico?",
                    options = listOf(
                        "El L-triptófano.",
                        "El Ácido Abscísico (ABA).",
                        "El etileno (C_2H_4); sintetizado a partir de L-metionina.",
                        "En los núcleos supraóptico y paraventricular del Hipotálamo (la neurohipófisis solo las almacena y libera)."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: El Ácido Abscísico (ABA)."
                ),
                Challenge(
                    id = "bio_t08_s01_c07",
                    question = "¿En qué parte del encéfalo se sintetizan la oxitocina y la hormona antidiurética (vasopresina)?",
                    options = listOf(
                        "El L-triptófano.",
                        "El etileno (C_2H_4); sintetizado a partir de L-metionina.",
                        "En los núcleos supraóptico y paraventricular del Hipotálamo (la neurohipófisis solo las almacena y libera).",
                        "El Ácido Abscísico (ABA)."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: En los núcleos supraóptico y paraventricular del Hipotálamo (la neurohipófisis solo las almacena y libera)."
                ),
                Challenge(
                    id = "bio_t08_s01_c08",
                    question = "¿Qué enzima activa la giberelina en la capa de aleurona para romper la dormancia de las semillas?",
                    options = listOf(
                        "El L-triptófano.",
                        "El etileno (C_2H_4); sintetizado a partir de L-metionina.",
                        "El Ácido Abscísico (ABA).",
                        "La \\alpha-amilasa."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: La \\alpha-amilasa."
                ),
                Challenge(
                    id = "bio_t08_s01_c09",
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
                    id = "bio_t08_s01_c10",
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
            id = "bio_t08_s02",
            title = "COORDINACIÓN Y REGULACIÓN - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "COORDINACIÓN Y REGULACIÓN - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   - *Periodo refractario relativo:* Requiere un estímulo supraumbral para disparar.
3. **Conducción del Impulso:** Continua en fibras amielínicas (lenta, \approx 0.5-2\text{ m/s}) y **saltatoria** en fibras mielinizadas (veloz, hasta 120\text{ m/s}) de un nodo de Ranvier al siguiente.

#### B. Sinapsis Química y Neurotransmisores
- La llegada del potencial de acción despolariza el botón terminal \to apertura de canales de Ca^{2+} dependientes de voltaje \to influjo de Ca^{2+} \to fusión de vesículas sinápticas (mediada por proteínas SNARE: sinaptotagmina, sintaxina) \to exocitosis del neurotransmisor a la hendidura sináptica (20-40\text{ nm}).
- **Principales Neurotransmisores:**
  - *Acetilcolina (ACh):* Placa motora neuromuscular, neuronas preganglionares del SNA y posganglionares parasimpáticas. Receptores nicotínicos (ionotrópicos) y muscarínicos (metabotrópicos).
  - *Noradrenalina (NA):* Neuronas posganglionares del sistema simpático.
  - *Glutamato:* Principal neurotransmisor excitatorio del encéfalo (induce PEPS mediante receptores AMPA y NMDA).
  - *GABA (\gamma-aminobutirato):* Principal neurotransmisor inhibitorio cerebral; abre canales de Cl^-, hiperpolarizando la membrana (induce PIPS).
  - *Dopamina, Serotonina, Endorfinas:* Moduladores del ánimo, recompensa motora y analgesia endógena.

---

### 2.3. REGULACIÓN ENDOCRINA HUMANA Y EJE HIPOTÁLAMO-HIPÓFISIS

#### A. Mecanismo de Acción Hormonal
* **Hormonas Liposolubles (Esteroides y Tiroideas):**
  - Ejemplos: Cortisol, aldosterona, testosterona, estrógenos, progesterona, T_3 y T_4.
  - Atraviesan libremente la bicapa lipídica de la membrana celular. Se unen a **receptores intracelulares** (citosólicos o nucleares). El complejo hormona-receptor dimeriza, migra al núcleo celular y se une a secuencias específicas de ADN denominadas HRE (elementos de respuesta hormonal), modulando directamente la transcripción génica (respuesta lenta, horas o días).
* **Hormonas Hidrosolubles (Peptídicas, Proteicas y Catecolaminas):**
  - Ejemplos: Insulina, glucagón, GH, ACTH, TSH, adrenalina, noradrenalina.
  - No cruzan la membrana. Se unen a **receptores de membrana acoplados a proteínas G (GPCR)** o con actividad tirosina quinasa intrínseca (receptor de insulina).
  - Activan segundos mensajeros intracelulares:
    - Vía de la adenilato ciclasa: ATP \to cAMP \to activación de Proteína Quinasa A (PKA).
    - Vía de la fosfolipasa C (PLC): PIP_2 \to IP_3 + DAG. El IP_3 libera Ca^{2+} del retículo endoplásmico liso; el DAG y el Ca^{2+} activan la Proteína Quinasa C (PKC).

#### B. Anatomía y Fisiología del Eje Hipotálamo-Hipófisis
1. **Hipotálamo:** Centro integrador neuroendocrino en la base del diencéfalo. Sintetiza factores liberadores e inhibidores que viajan a la adenohipófisis por el **sistema porta hipotálamo-hipofisario**:
   - CRH: Hormona liberadora de corticotropina \to estimula ACTH.
   - TRH: Hormona liberadora de tirotropina \to estimula TSH y prolactina.
   - GnRH: Hormona liberadora de gonadotropinas \to estimula LH y FSH.
   - GHRH: Hormona liberadora de hormona del crecimiento \to estimula GH.
   - Somatostatina (GHIH): Inhibe GH y TSH.
   - Dopamina (PIH): Inhibe tónicamente la secreción de Prolactina (PRL).
2. **Adenohipófisis (Lóbulo Anterior, tejido epitelial glandular):**
   - GH (Somatotropina): Estimula el crecimiento somático indirectamente induciendo la síntesis de **IGF-1 (somatomedina C)** en el hígado; hiperglucemiante y lipolítica.
   - TSH (Tirotropina): Estimula síntesis y liberación de T_3 y T_4 en tiroides.
   - ACTH (Adrenocorticotropina): Estimula la corteza suprarrenal (zona fasciculada: cortisol).
   - FSH (Foliculoestimulante): Maduración folicular ovárica y espermatogénesis (células de Sertoli).
   - LH (Luteinizante): Ovulación, formación del cuerpo lúteo y síntesis de testosterona (células de Leydig).
   - PRL (Prolactina): Síntesis y secreción de leche materna.
3. **Neurohipófisis (Lóbulo Posterior, tejido nervioso):**
   - No sintetiza hormonas; almacena y vierte a capilares las neurohormonas producidas en los núcleos hipotalámicos:
     - **Oxitocina** (núcleo paraventricular): Contracción de células mioepiteliales de la glándula mamaria (eyección láctea) y contracción miometrial durante el parto (reflejo de Ferguson, feedback positivo).
     - **Vasopresina / ADH** (núcleo supraóptico): Reabsorción facultativa de agua en túbulos colectores renales e induce vasoconstricción arteriolar ante hipovolemia o hiperosmolaridad plasmática.

#### C. Principales Glándulas Endocrinas Periféricas
1. **Glándula Tiroides:**
   - Células foliculares: Secretan Tiroxina (T_4) y Triyodotironina (T_3, forma biológicamente activa). Incrementan el metabolismo basal, consumo de O_2, termogénesis y maduración del SNC en el feto/lactante.
   - Células parafoliculares o C: Secretan **Calcitonina** (hipocalcemiante e hipofosfatemiante; inhibe la resorción ósea por osteoclastos y estimula excreción renal de calcio).
2. **Glándulas Paratiroides:**
   - Células principales: Secretan **Parathormona (PTH)**. Es la principal hormona **hipercalcemiante** y hipofosfatemiante:
     - Estimula indirectamente los osteoclastos mediante el sistema RANK/RANKL en osteoblastos.
     - Aumenta la reabsorción de calcio en el TCD renal y elimina fosfatos (PO_4^{3-}).
     - Estimula la 1\alpha-hidroxilasa renal que activa la vitamina D a **Calcitriol (1,25-(OH)_2-D_3)**, permitiendo la absorción intestinal activa de calcio.
3. **Páncreas Endocrino (Islotes de Langerhans):**
   - **Células \beta (60-70\%):** Secretan **Insulina** (hipoglucemiante, anabólica). Estimula la captación celular de glucosa insertando transportadores **GLUT-4** en músculo esquelético y tejido adiposo; estimula glucogenogénesis, lipogénesis y síntesis proteica; inhibe glucogenólisis y gluconeogénesis.
   - **Células \alpha (20\%):** Secretan **Glucagón** (hiperglucemiante, catabólico). Actúa en hepatocitos activando glucogenólisis y gluconeogénesis vía cAMP.
   - **Células \delta (5\%):** Secretan **Somatostatina** (inhibición paracrina de insulina y glucagón).
4. **Glándulas Suprarrenales:**
   - **Corteza Suprarrenal:**
     - *Zona Glomerular:* **Aldosterona** (mineralocorticoide; reabsorbe Na^+ y excreta K^+/H^+ en túbulos colectores).
     - *Zona Fasciculada:* **Cortisol** (glucocorticoide; hiperglucemiante, estimula gluconeogénesis y proteólisis, potente antiinflamatorio e inmunosupresor).
     - *Zona Reticular:* Andrógenos suprarrenales (DHEA y androstenediona).
   - **Médula Suprarrenal:** Células cromafines inervadas por axones simpáticos preganglionares. Secretan catecolaminas: **Adrenalina (80\%)** y **Noradrenalina (20\%)** mediando la respuesta rápida simpática de lucha o huida.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
2. **Ecuación de Goldman-Hodgkin-Katz (Potencial de Reposo de Membrana):**
   V_m = \frac{RT}{F} \ln \left( \frac{P_{K^+} [K^+]_o + P_{Na^+} [Na^+]_o + P_{Cl^-} [Cl^-]_i}{P_{K^+} [K^+]_i + P_{Na^+} [Na^+]_i + P_{Cl^-} [Cl^-]_o} \right)
   Demuestra que como en reposo la permeabilidad P_{K^+} \gg P_{Na^+}, el potencial de reposo se aproxima al equilibrio de Nernst del potasio (\approx -70\text{ mV}).

3. **Ley de Masas en la Dinámica Hormonal:**
   [H] + [R] \xrightleftharpoons{K_d} [HR]
   Donde K_d = \frac{[H][R]}{[HR]}. Una afinidad hormonal elevada implica un valor de K_d muy pequeño (\sim 10^{-9} a 10^{-11}\text{ M}), permitiendo respuestas fisiológicas plenas con concentraciones plasmáticas nanoseglares.

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **¿Quién produce la oxitocina y la ADH?:** Pregunta clásica de admisión UNSA/UNMSM. La **neurohipófisis NO sintetiza hormonas**; actúa únicamente como reservorio axonal. Ambas son sintetizadas en los núcleos supraóptico y paraventricular del **hipotálamo**.
* **El Enanismo y Gigantismo:**
  - Si hay hipersecreción de GH antes del cierre de los discos epifisarios (en niños) \implies **Gigantismo**.
  - Si la hipersecreción ocurre en adultos (discos ya cerrados) \implies **Acromegalia** (crecimiento de huesos anchos, mandíbula prognática, manos y pies toscos).
  - La hiposecreción en la infancia causa **Enanismo hipofisario** (armónico). Contrastar con el cretinismo (hipotiroidismo congénito, con retardo mental y desproporción corporal).
* **Fitohormonas en Germinación de Semillas:** Jamás marcar que la auxina induce la germinación de la semilla. La hormona desencadenante de la germinación es la **giberelina (GA_3)**, al activar la \alpha-amilasa en la aleurona. El ácido abscísico (ABA) es su antagonista directo manteniéndola dormida.
* **Insulina y el Transporte de Glucosa:** En el encéfalo y en los eritrocitos, la captación de glucosa es **independiente de insulina** (emplean GLUT-1 y GLUT-3 constitutivos). La insulina solo es obligatoria para el ingreso de glucosa en el tejido muscular esquelético y en el tejido adiposo (mediante translocación de vesículas con **GLUT-4**).
* **Parathormona vs. Vitamina D:** La PTH estimula a nivel renal la enzima 1\alpha-hidroxilasa, convirtiendo el 25-OH\text{-colecalciferol} en la hormona activa **1,25-(OH)_2\text{-D}_3 (Calcitriol)**. Es el calcitriol quien ejecuta la absorción directa de calcio en el enterocito.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Fitohormonas y sus Efectos Clave:**
   > **"AUX-EL / CITO-DIV / GIB-GER / ET-MAD / ABA-EST"**
   - **AUX**ina: **EL**ongación celular y dominancia apical.
   - **CITO**quinina: **DIV**isión celular (mitosis) y retraso de senescencia.
   - **GIB**erelina: **GER**minación de semillas y alargamiento de tallo.
   - **ET**ileno: **MAD**uración de frutos y abscisión.
   - **ABA**: **EST**rés hídrico (cierre de estomas) y dormancia.

2. **Hormonas de la Adenohipófisis:**
   > **"FLAT PIG" (Mnemotecnia clásica internacional)**
   - **F**: FSH (Foliculoestimulante)
   - **L**: LH (Luteinizante)
   - **A**: ACTH (Adrenocorticotropina)
   - **T**: TSH (Tirotropina)
   - **P**: Prolactina
   - **I**: *Ignorar*
   - **G**: GH (Growth Hormone / Somatotropina)

3. **Regulación del Calcio Sanguíneo:**
   > **"PARATOHORMONA SUBE, CALCITONINA CALMA (BAJA)"**
   - **P**TH: **P**romueve el ascenso de calcio en sangre (hipercalcemiante).
   - **C**alcitonina: mete el **C**alcio al hueso \to hipocalcemiante.

4. **Capas de la Corteza Suprarrenal y sus Productos:**
   > **"GFR \implies Sal, Azúcar, Sexo"**
   - Zona **G**lomerular: Mineralocorticoides (Aldosterona \to Sal).
   - Zona **F**asciculada: Glucocorticoides (Cortisol \to Azúcar).
   - Zona **R**eticular: Andrógenos gonadales (Testosterona débil \to Sexo).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Biofísica del Impulso Eléctrico (Ley de Ohm y Circuitos RC en Membranas):** La membrana axonal opera como un circuito eléctrico formado por una capacitancia (C_m \approx 1\ \mu\text{F/cm}^2, dada por la bicapa fosfolipídica hidrófoba) en paralelo con resistencias variables (R_{\text{canales}} = 1/g_{\text{ion}}). La velocidad de conducción del potencial de acción depende de la constante de espacio \lambda = \sqrt{r_m / r_i}. Al recubrir el axón con mielina, la resistencia transmembrana (r_m) se incrementa drásticamente, obligando a la corriente a fluir longitudinalmente hasta el siguiente nodo de Ranvier sin disiparse (conducción saltatoria).
* **Química Orgánica y Farmacología (Agonistas y Antagonistas del SNA):** Medicamentos como el **salbutamol** actúan como agonistas selectivos de receptores \beta_2-adrenérgicos acoplados a proteína G_s, incrementando el cAMP intracelular en el músculo liso bronquial y logrando broncodilatación en crisis asmáticas; mientras que la **atropina** es un antagonista competitivo de receptores muscarínicos colinérgicos, bloqueando la estimulación parasimpática para revertir la bradicardia severa.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Clínico Endocrino: Eje Suprarrenal)
Un paciente de 48 años con artritis reumatoide grave ha estado consumiendo prednisona (un glucocorticoide sintético de alta potencia) por vía oral a dosis altas de forma ininterrumpida durante 10 meses. Debido a que se siente bien, decide suspender bruscamente el medicamento. Dos días después, es traído al servicio de emergencias en estado de choque hipovolémico-hipotensivo, hipoglucemia severa, hiponatremia y letargia. ¿Cuál es la base fisiológica neuroendocrina que provocó este cuadro de crisis suprarrenal aguda?
A) Destrucción bacteriana fulminante de las células de la médula suprarrenal productoras de adrenalina.  
B) Atrofia de la corteza suprarrenal por supresión prolongada y severa del eje hipotálamo-hipófisis (freno crónico de CRH y ACTH) debido al tratamiento exógeno.  
C) Hipersecreción reactiva de aldosterona que induce pérdida masiva de agua por el riñón.  
D) Conversión hepática acelerada de la prednisona en insulina exógena.  
E) Falla autoinmune selectiva de la adenohipófisis que anula la secreción de prolactina.  

* **Resolución:** La administración crónica de glucocorticoides exógenos ejerce una retroalimentación negativa potente y sostenida sobre el hipotálamo (suprimiendo CRH) y sobre la adenohipófisis (suprimiendo ACTH). La ausencia prolongada de ACTH provoca la atrofia por desuso de la corteza suprarrenal (zonas fasciculada y reticular). Si el fármaco se suspende abruptamente, el eje hipotálamo-hipófisis no puede reactivarse de inmediato y las glándulas suprarrenales atróficas son incapaces de producir cortisol endógeno, desatando una **crisis suprarrenal aguda o insuficiencia suprarrenal secundaria aguda**, potencialmente mortal.  
* **Respuesta:** B

---

### Pregunta 2 (Caso Agronómico: Fototropismo y Fisiología Celular)
En un invernadero automatizado en el valle de Tambo (Islay), un grupo de investigadores somete plántulas de maíz (*Zea mays*) a una fuente de luz azul unidireccional constante. Al cabo de 8 horas, observan una marcada curvatura del coleóptilo hacia el foco luminoso. Mediante microanálisis de fluorescencia, miden el pH en las paredes celulares de ambos lados del coleóptilo y analizan la actividad de los transportadores proteicos PIN3. ¿Qué datos experimentales confirman el modelo de Wentworth-Thimann del fototropismo?
A) Los transportadores PIN3 se reubican hacia el lado iluminado, aumentando el pH en las paredes del lado iluminado para estimular su mitosis.  
B) Las auxinas migran lateralmente hacia el lado sombreado vía transportadores PIN; allí activan las bombas H^+-ATPasa, acidificando la pared celular y activando expansinas que elongan más dicho lado.  
C) El etileno gaseoso se acumula en el lado iluminado, provocando contracción muscular de las microfibrillas de actina.  
D) El ácido abscísico se acumula en el lado sombreado, provocando el colapso osmótico de los estomas basales.  
E) La luz degrada las auxinas en el lado sombreado, deteniendo su crecimiento por falta de triptófano.  

* **Resolución:** El fototropismo positivo en coleóptilos se explica por la hipótesis del crecimiento ácido y la redistribución lateral de auxina (AIA). La percepción de la luz azul por fotorreceptores (fototropinas) induce la relocalización de transportadores de eflujo PIN hacia el flanco sombreado. La mayor concentración de auxina en el lado en sombra activa las bombas H^+-ATPasa de membrana, bajando el pH apoplástico a \approx 4.5. La acidez activa a las expansinas, las cuales desestabilizan enlaces de hemicelulosa con celulosa; la presión de turgencia distiende las células del lado sombreado con mayor rapidez que las del lado iluminado, forzando la curvatura de la planta hacia la luz.  
* **Respuesta:** B

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t08_s02_c01",
                    question = "**Enunciado:** El glucagón y la adrenalina activan en los hepatocitos la vía de la glucogenólisis para verter glucosa al torrente sanguíneo durante periodos de ayuno o estrés agudo. Si una toxina bacteriana (como la toxina colérica) ADP-ribosila de forma permanente a la subunidad \\alpha de la proteína G_s (G\\alpha_s), impidiendo su actividad intrínseca GTPasa, ¿qué efecto metabólico se mantendrá constitutivamente activo en el hepatocito independientemente de las concentraciones de glucagón?",
                    options = listOf(
                        "Síntesis permanente de glucógeno y captación masiva de glucosa por GLUT-4.",
                        "Activación irreversible de la adenilato ciclasa, acumulación desmedida de cAMP y fosforilación continua de la glucógeno fosforilasa por la proteína quinasa A (PKA).",
                        "Bloqueo de la fosfolipasa C con descenso absoluto de los niveles intracelulares de calcio libre.",
                        "Destrucción de los receptores de insulina en la membrana canalicular hepatocelular."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. La subunidad G\\alpha_s activa a la enzima efectora transmembrana **adenilato ciclasa**. La señal fisiológica normal termina cuando la actividad GTPasa intrínseca de G\\alpha_s hidroliza el GTP a GDP, desacoplándose del efector. 2. Si se bloquea la actividad GTPasa por ADP-ribosilación, G\\alpha_s queda anclada en un estado activo continuo. 3. La adenilato ciclasa sintetiza cAMP sin control a partir de ATP. 4. Los niveles estratosféricos de cAMP saturan las subunidades regulatorias de la **Proteína Quinasa A (PKA)**, liberando sus subunidades catalíticas activas. 5. La PKA fosforila y activa a la fosforilasa quinasa, la cual fosforila a la **glucógeno fosforilasa** (convirtiéndola en su forma 'a' activa), degradando todo el glucógeno celular a glucosa-1-fosfato. **Respuesta:** B ---"
                ),
                Challenge(
                    id = "bio_t08_s02_c02",
                    question = "**Enunciado:** En un lote experimental de granos de cebada (*Hordeum vulgare*), se aíslan tres variedades mutantes antes de inducir su germinación mediante imbibición en agua:",
                    options = listOf(
                        "Variedad 1: produce \\alpha-amilasa; Variedad 2: no produce \\alpha-amilasa; Variedad 3: produce \\alpha-amilasa.",
                        "Variedades 1 y 2 no producen \\alpha-amilasa; Variedad 3 produce \\alpha-amilasa únicamente si se retira el endospermo.",
                        "Variedad 1 no produce enzima; Variedades 2 y 3 sintetizan \\alpha-amilasa de forma descontrolada.",
                        "Ninguna variedad produce enzima porque la imbibición requiere la presencia física del cotiledón."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. *Mecanismo de acción de GA_3 en la germinación:* La giberelina producida normalmente por el embrión viaja a la capa de aleurona, donde se une al receptor intracelular **GID1**. El complejo GA\\text{-}GID1 se acopla a las proteínas represoras DELLA y recluta al complejo ubiquitina-ligasa SCF, degradando a los represores DELLA en el proteasoma 26S. Esto libera a los factores de transcripción (GAMYB) que activan la expresión de la enzima **\\alpha-amilasa**. 2. *Análisis de las variedades con GA_3 exógena:* - **Variedad 1:** Aunque no tiene embrión productor, se le suministra GA_3 exógena. La capa de aleurona intacta percibe la GA_3, degrada DELLA y sintetiza/secreta activamente **\\alpha-amilasa** (demostrado clásicamente en los bioensayos de Varner). - **Variedad 2:** Al carecer del receptor **GID1**, la aleurona es incapaz de percibir la GA_3 (ni endógena ni exógena). Los represores DELLA nunca se degradan y, por tanto, **no produce \\alpha-amilasa**. - **Variedad 3:** Posee aleurona normal y maquinaria de GA_3 intacta. Al recibir GA_3 (y al ser insensible al ABA inhibidor), activa plenamente la vía y **produce \\alpha-amilasa** (incluso puede presentar germinación precoz o viviparidad). **Respuesta:** A --- 1. ¿Qué fitohormona es sintetizada a partir del aminoácido L-triptófano y promueve la dominancia apical? 2. ¿Qué hormona producida por las células beta del páncreas estimula la translocación de transportadores GLUT-4 en músculo y grasa? 3. ¿Cuál de los siguientes neurotransmisores es el principal mediador inhibitorio en el sistema nervioso central del encéfalo humano? 4. ¿Qué alteración patológica se produce por hipersecreción de hormona del crecimiento (GH) en una persona adulta? 5. ¿Qué glándula endocrina secreta calcitonina en respuesta a concentraciones elevadas de calcio plasmático? --- 1: C | 2: C | 3: C | 4: B | 5: C"
                ),
                Challenge(
                    id = "bio_t08_s02_c03",
                    question = "¿Cuál es el principal ion responsable de la fase de despolarización rápida del potencial de acción neuronal?",
                    options = listOf(
                        "Las células alfa (\\alpha) de los islotes de Langerhans en el páncreas.",
                        "Aumenta los niveles de calcio en sangre (es hipercalcemiante).",
                        "El sodio (Na^+), a través de canales dependientes de voltaje.",
                        "Transporte polar basipétalo."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: El sodio (Na^+), a través de canales dependientes de voltaje."
                ),
                Challenge(
                    id = "bio_t08_s02_c04",
                    question = "¿Qué células endocrinas sintetizan y secretan la hormona glucagón?",
                    options = listOf(
                        "El sodio (Na^+), a través de canales dependientes de voltaje.",
                        "Aumenta los niveles de calcio en sangre (es hipercalcemiante).",
                        "Transporte polar basipétalo.",
                        "Las células alfa (\\alpha) de los islotes de Langerhans en el páncreas."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Las células alfa (\\alpha) de los islotes de Langerhans en el páncreas."
                ),
                Challenge(
                    id = "bio_t08_s02_c05",
                    question = "¿Cuál es la principal acción metabólica de la hormona paratiroidea (PTH) sobre la concentración plasmática de calcio?",
                    options = listOf(
                        "Aumenta los niveles de calcio en sangre (es hipercalcemiante).",
                        "El sodio (Na^+), a través de canales dependientes de voltaje.",
                        "Las células alfa (\\alpha) de los islotes de Langerhans en el páncreas.",
                        "Transporte polar basipétalo."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Aumenta los niveles de calcio en sangre (es hipercalcemiante)."
                ),
                Challenge(
                    id = "bio_t08_s02_c06",
                    question = "¿Cómo se denomina el transporte de auxinas desde el ápice del tallo hacia la base de la planta?",
                    options = listOf(
                        "El sodio (Na^+), a través de canales dependientes de voltaje.",
                        "Transporte polar basipétalo.",
                        "Las células alfa (\\alpha) de los islotes de Langerhans en el páncreas.",
                        "Aumenta los niveles de calcio en sangre (es hipercalcemiante)."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Transporte polar basipétalo."
                ),
                Challenge(
                    id = "bio_t08_s02_c07",
                    question = "¿Qué hormona adenohipofisaria estimula a las células de Leydig en los testículos para la producción de testosterona?",
                    options = listOf(
                        "El sodio (Na^+), a través de canales dependientes de voltaje.",
                        "Las células alfa (\\alpha) de los islotes de Langerhans en el páncreas.",
                        "La hormona luteinizante (LH).",
                        "Aumenta los niveles de calcio en sangre (es hipercalcemiante)."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: La hormona luteinizante (LH)."
                ),
                Challenge(
                    id = "bio_t08_s02_c08",
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
                    id = "bio_t08_s02_c09",
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
                    id = "bio_t08_s02_c10",
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
