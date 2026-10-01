package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana13 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t13_s01",
            title = "ECOLOGÍA Y SOSTENIBILIDAD - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ECOLOGÍA Y SOSTENIBILIDAD - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Ecología es la ciencia que investiga las interacciones dinámicas entre los organismos vivos y su entorno biofísico, integrando los flujos de energía y el reciclaje de materia a escala planetaria. Comprende los siguientes ejes conceptuales:
1. **Estructura del Ecosistema:** Integración funcional de la **Biocenosis** (comunidad biológica: factores bióticos) y el **Biotopo** (matriz abiótica: sustrato, radiación, temperatura, agua, gases y nutrientes).
2. **Dinámica Trófica y Flujo Energético:** El flujo de energía a través de los ecosistemas es unidireccional y abierto, regido por las leyes de la termodinámica y la **Ley del diez por ciento (Diezmo ecológico de Lindeman)**, estructurado en cadenas y redes tróficas y representado mediante pirámides ecológicas (de números, de biomasa y de energía).
3. **Ciclos Biogeoquímicos:** Rutas circulares cerradas de reciclaje de bioelementos entre la litosfera, hidrosfera, atmósfera y la biota: Ciclo del Nitrógeno (fijación, nitrificación, asimilación, amonificación y desnitrificación), Ciclo del Carbono, Ciclo del Fósforo y Ciclo Hidrológico.
4. **Dinámica de Poblaciones y Sucesión Ecológica:** Parámetros demográficos, curvas de crecimiento poblacional (exponencial en "J" y logístico sigmoideo en "S" limitado por la **capacidad de carga K**), y sucesión ecológica primaria (sobre roca virgen) y secundaria (tras perturbaciones) hasta alcanzar el **clímax**.
5. **Problemas Ambientales Globales:** Efecto invernadero antrópico y cambio climático, destrucción de la capa de ozono estratosférico por clorofluorocarbonos (CFCs), lluvia ácida (SO_2 y NO_x), y **eutrofización** de cuerpos de agua por exceso de nitratos y fosfatos.
6. **Conservación y Áreas Naturales Protegidas (ANP) del Perú:** Sistema Nacional de Áreas Naturales Protegidas por el Estado (SINANPE / SERNANP). Unidades de conservación de uso indirecto intangible (Parques Nacionales, Santuarios Nacionales, Santuarios Históricos) y de uso directo sostenible (Reservas Nacionales, Reservas Paisajísticas, Refugios de Vida Silvestre, Bosques de Protección).

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. EL ECOSISTEMA: COMPONENTES Y NIVELES DE ORGANIZACIÓN

El término ecosistema fue acuñado por Arthur Tansley (1935) para definir la unidad funcional básica de la ecología:
\text{ECOSISTEMA} = \text{BIOTOPO (Medio Físico-Químico)} + \text{BIOCENOSIS (Comunidad Biológica)} + \text{INTERACCIONES}

#### A. Niveles de Organización Ecológica
1. **Individuo:** Organismo vivo singular e indivisible portador de un genoma particular.
2. **Población:** Conjunto de individuos de la **misma especie** que conviven en un espacio geográfico delimitado en un tiempo determinado, capaces de reproducirse libremente entre sí.
3. **Comunidad (Biocenosis):** Conjunto de poblaciones de **diferentes especies** (animales, vegetales, hongos, microorganismos) que interactúan en un biotopo compartido.
4. **Ecosistema:** Sistema ecológico formado por la comunidad biológica interactuando con los factores físicos y químicos abióticos.
5. **Bioma:** Gran unidad ecológica regional caracterizada por una fisonomía vegetal dominante y condiciones macroclimáticas homogéneas (ej. tundra, taiga, desierto, sabana, bosque tropical).
6. **Biosfera:** Capa total del planeta Tierra habitada por seres vivos (abarcando la litosfera superficial, hidrosfera y troposfera baja).

#### B. Componentes del Ecosistema
* **Biotopo (Factores Abióticos):**
  - *Luz Solar:* Fuente energética primaria de la fotosíntesis; regula ritmos circadianos y fotoperiodismo.
  - *Temperatura:* Determina la velocidad de las reacciones metabólicas. Organismos **poiquilotermos/ectotermos** (temperatura interna dependiente del ambiente: peces, anfibios, reptiles) y **homeotermos/endotermos** (termorregulación interna metabólica activa: aves y mamíferos).
  - *Agua y Humedad:* Solvente universal; adaptaciones xeromórficas (cactus con cutícula gruesa y espinas) e hidromórficas (plantas acuáticas con aerénquima).
  - *Sustrato y Suelo:* Textura, pH, materia orgánica (humus) y contenido mineral.
* **Biocenosis (Factores Bióticos):** Todos los organismos vivos y sus interacciones intraespecíficas e interespecíficas.

#### C. Relaciones Interespecíficas (Entre diferentes especies)
| Relación | Símbolo | Mecanismo Ecológico | Ejemplos Preuniversitarios Clásicos |
| :--- | :---: | :--- | :--- |
| **Mutualismo** | (+/+) | Interacción simbiótica **obligatoria**; ambas especies se benefician y dependen mutuamente para sobrevivir. | Líquenes (alga/cianobacteria + hongo); micorrizas (hongo + raíz vascular); bacterias fijadoras *Rhizobium* en nódulos de leguminosas. |
| **Protocooperación** | (+/+) | Cooperación beneficiosa mutua, pero **no obligatoria** (facultativa). | Peces limpiadores y morenas; aves desparasitadoras sobre el lomo de mamíferos ungulados; flores y polinizadores generalistas. |
| **Comensalismo** | (+/0) | Una especie se beneficia (comensal) y la otra no experimenta efecto apreciable. | Rémora adherida al vientre del tiburón para alimentarse de restos; bacterias de la piel humana. |
| **Inquilinismo** | (+/0) | Una especie busca refugio o soporte físico en el cuerpo de otra sin causarle daño. | Plantas epífitas (orquídeas y bromelias) que viven sobre ramas de árboles; pez perla en el ano del pepino de mar. |
| **Parasitismo** | (+/-) | El parásito se beneficia viviendo a expensas del hospedador, causándole daño pero habitualmente sin matarlo de inmediato. | *Taenia solium* en intestino humano (endoparásito); garrapatas y pulgas (ectoparásitos). |
| **Depredación** | (+/-) | El depredador captura, mata y consume a la presa. | Puma andino cazando vicuñas; lechuza cazando roedores. |
| **Competencia Interespecífica** | (-/-) | Ambas especies sufren detrimento al competir por un recurso limitante idéntico (nicho trófico, luz, agua). | Principio de exclusión competitiva de Gause: dos especies con el mismo nicho ecológico no pueden coexistir indefinidamente. |
| **Amensalismo** | (-/0) | Una especie inhibe o daña a otra sin recibir beneficio directo. | Hongo *Penicillium* secretando penicilina que destruye bacterias (antibiosis); sombra de grandes árboles que impide crecer a hierbas heliófilas. |

---

### 2.2. FLUJO DE ENERGÍA Y CADENAS TRÓFICAS

1. **Niveles Tróficos:**
   - **Productores Primarios (Autótrofos):** Plantas fotosintéticas, algas y cianobacterias (fotolitótrofos), y bacterias quimiosintéticas (quimiolitótrofos). Fijan la energía solar o química en enlaces orgánicos.
   - **Consumidores Primarios (Herbívoros):** Se alimentan directamente de productores.
   - **Consumidores Secundarios (Carnívoros primarios):** Se alimentan de herbívoros.
   - **Consumidores Terciarios y Cuaternarios (Superdepredadores):** Carnívoros que depredan a otros carnívoros.
   - **Descomponedores o Desintegradores (Saprófagos / Detritívoros):** Hongos y bacterias heterótrofas. Mineralizan la materia orgánica muerta transformándola en compuestos inorgánicos solubles (CO_2, NH_4^+, PO_4^{3-}), cerrando el ciclo de la materia.
2. **Leyes Termodinámicas del Ecosistema:**
   - *1.ª Ley (Conservación):* La energía solar capturada se transforma en energía química y trabajo biológico; no se crea ni se destruye.
   - *2.ª Ley (Entropía):* En cada transferencia trófica, una fracción sustancial de la energía se degrada irreversiblemente en forma de **calor metabólico disipado**, aumentando la entropía del sistema.
   - **Ley del diez por ciento (Diezmo Ecológico de Raymond Lindeman):** En promedio, **solo el 10\% de la energía química almacenada en un nivel trófico se transfiere al nivel inmediato superior**. El 90\% restante se consume en respiración celular, mantenimiento metabólico, locomoción y excreción. Esto limita la longitud de las cadenas tróficas a 4 o 5 eslabones.
3. **Pirámides Ecológicas:**
   - **Pirámide de Energía:** Representa la productividad energética (\text{kcal/m}^2\cdot\text{año} o \text{J/m}^2\cdot\text{año}). **SIEMPRE ES VERTICAL Y DIRECTA**; nunca puede invertirse debido a la segunda ley de la termodinámica.
   - **Pirámide de Biomasa:** Representa el peso seco de materia viva por unidad de área (\text{g/m}^2). Suele ser directa en ecosistemas terrestres, pero **puede ser invertida en ecosistemas marinos pelágicos**, donde una biomasa reducida de fitoplancton microscópico sostiene a una biomasa mayor de zooplancton gracias a la altísima tasa de renovación y división del fitoplancton.
   - **Pirámide de Números:** Representa el número de individuos por unidad de superficie. Puede ser invertida (ej. un solo roble centenario sosteniendo miles de insectos parásitos).

---

### 2.3. CICLOS BIOGEOQUÍMICOS

Los ciclos biogeoquímicos describen el tránsito de los bioelementos esenciales entre los compartimentos abióticos (geológicos y atmosféricos) y los seres vivos (biota):

#### A. Ciclo del Nitrógeno (Gaseoso, Reservorio: Atmósfera 78\%)
El N_2 gaseoso no puede ser asimilado directamente por las plantas ni animales debido a la extrema fuerza de su triple enlace covalente (N \equiv N):
1. **Fijación del Nitrógeno:** Conversión de N_2 atmosférico en amoníaco (NH_3) o amonio (NH_4^+).
   - *Biológica:* Catalizada por el complejo enzimático bacteriano **nitrogenasa** (inhibido por el oxígeno libre). Ejecutada por bacterias de vida libre (*Azotobacter*, *Clostridium*), cianobacterias (*Nostoc*) y bacterias simbióticas (*Rhizobium* en nódulos radiculares de leguminosas).
   - *Abiótica:* Por descargas eléctricas de tormentas y síntesis industrial (proceso Haber-Bosch).
2. **Nitrificación (Proceso bacteriano quimiosintético aerobio en el suelo):**
   - *Nitrosación:* Conversión de amonio en nitrito (NO_2^-) por bacterias como *Nitrosomonas* y *Nitrosococus*:
     2NH_4^+ + 3O_2 \xrightarrow{\text{Nitrosomonas}} 2NO_2^- + 4H^+ + 2H_2O + \text{Energía}
   - *Nitratación:* Oxidación de nitrito a **nitrato (NO_3^-)** por bacterias del género *Nitrobacter*:
     2NO_2^- + O_2 \xrightarrow{\text{Nitrobacter}} 2NO_3^- + \text{Energía}
3. **Asimilación:** Las raíces de las plantas absorben los iones nitrato (NO_3^-) y amonio (NH_4^+) para incorporarlos a aminoácidos, proteínas y nucleótidos. Los animales los adquieren al consumir plantas o a otros animales.
4. **Amonificación:** Los descomponedores (bacterias y hongos) degradan la urea, ácido úrico y cadáveres ricos en proteínas, liberando amoníaco (NH_3) y amonio (NH_4^+) al suelo.
5. **Desnitrificación (Proceso anaeróbico):** Bacterias desnitrificantes facultativas en suelos anóxicos o pantanosos (ej. *Pseudomonas denitrificans*) reducen el nitrato de regreso a óxidos de nitrógeno y **nitrógeno molecular (N_2)**, devolviéndolo a la atmósfera y cerrando el ciclo.

#### B. Ciclo del Carbono
- El CO_2 atmosférico (0.04\%) y disuelto en océanos como HCO_3^- es fijado por los productores mediante la **fotosíntesis** (Ciclo de Calvin) en biomoléculas orgánicas (glucosa, celulosa).
- El carbono regresa a la atmósfera a través de la **respiración celular** de plantas, animales y descomponedores, así como por la combustión de biomasa y de **combustibles fósiles** (carbón, petróleo, gas natural formados en el Carbonífero).

#### C. Ciclo del Fósforo (Sedimentario, Sin Reservorio Atmosférico Gaseoso)
- El reservorio primordial son las rocas fosfatadas de la corteza terrestre (apatita).
- La meteorización libera iones fosfato (PO_4^{3-}) que se disuelven en el agua del suelo y son absorbidos por las plantas para sintetizar ATP, fosfolípidos y ácidos nucleicos.
- Pasa por las redes tróficas y regresa al suelo por descomposición y a través del **guano de las islas** (aves guaneras como el guanay y piquero que extraen fósforo del mar y lo depositan en la costa peruana). Gran parte sedimenta en fosas oceánicas profundas por millones de años.


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS Y RELACIONES MATEMÁTICAS EN ECOLOGÍA

1. **Eficiencia Ecológica y Flujo Energético (Ley del 10%):**
   E_{n+1} \approx 0.10 \times E_n
   Si la productividad primaria neta de las plantas es de 10\ 000\text{ kcal/m}^2\cdot\text{año}:
   - Consumidores primarios (herbívoros): 1000\text{ kcal}
   - Consumidores secundarios (carnívoros): 100\text{ kcal}
   - Consumidores terciarios (depredadores tope): 10\text{ kcal}

2. **Ecuación Diferencial del Crecimiento Logístico:**

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t13_s01_c01",
                    question = "**Enunciado:** En los bofedales altoandinos de Arequipa, se observa que ciertas aves desparasitadoras se posan sobre el lomo de las alpacas (*Vicugna pacos*), alimentándose activamente de garrapatas y piojos adheridos a la piel del camélido. Gracias a esto, el ave obtiene una fuente rica de alimento y la alpaca queda libre de ectoparásitos molestos. Si ambas especies pueden sobrevivir de forma independiente en ausencia de la otra, ¿qué tipo de relación ecológica interespecífica protagonizan?",
                    options = listOf(
                        "Mutualismo obligado",
                        "Comensalismo trófico",
                        "Protocooperación",
                        "Amensalismo facultativo"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Ambas especies participantes se benefician de la interacción: el ave se nutre con los parásitos (+) y la alpaca mejora su confort y salud cutánea al eliminarse los parásitos (+). 2. Sin embargo, la relación **no es obligada ni indispensable para la supervivencia** de ninguna de las dos especies; el ave puede alimentarse de otros insectos y la alpaca puede vivir sin necesidad del ave. 3. La interacción ecológica simbiótica no obligatoria donde ambos participantes obtienen beneficio mutuo ((+/+)) se denomina formalmente **Protocooperación**. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "bio_t13_s01_c02",
                    question = "**Enunciado:** Un agricultor del valle de Majes nota que tras varias cosechas continuas de maíz, el suelo se ha vuelto deficiente en nitrógeno. Un ingeniero agrónomo le recomienda realizar rotación de cultivos sembrando alfalfa (*Medicago sativa*, una leguminosa). ¿Cuál es el mecanismo biológico que justifica técnicamente esta recomendación agronómica?",
                    options = listOf(
                        "Las hojas de alfalfa absorben nitrógeno gaseoso por los estomas y lo transportan por el xilema.",
                        "Las raíces de la alfalfa establecen simbiosis mutualista con bacterias del género *Rhizobium*, las cuales fijan el N_2 atmosférico transformándolo en amonio asimilable para el suelo.",
                        "La alfalfa atrae bacterias desnitrificantes que oxidan nitritos a nitratos en el aire.",
                        "Los estomas de las leguminosas secretan ácido nítrico concentrado que disuelve la roca madre."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Las plantas no pueden fijar el N_2 atmosférico de forma autónoma. 2. Las plantas leguminosas (como alfalfa, frijol, arveja, lenteja) establecen una **simbiosis mutualista** en sus raíces con bacterias del género ***Rhizobium***, formando estructuras histológicas especializadas llamadas **nódulos radiculares**. 3. Las bacterias *Rhizobium* utilizan la enzima nitrogenasa para romper el triple enlace del N_2 gaseoso y reducirlo a **amonio (NH_4^+)**, nutriendo a la planta; a cambio, la planta aporta fotosintatos (carbohidratos) y leghemoglobina para proteger a la enzima del oxígeno. 4. Al degradarse los restos de alfalfa tras la cosecha, el suelo queda enriquecido con nitrógeno orgánico mineralizable, restituyendo la fertilidad edáfica. **Respuesta:** B ---"
                ),
                Challenge(
                    id = "bio_t13_s01_c03",
                    question = "**Enunciado:** En un ecosistema lacustre de los Andes peruanos, la productividad primaria neta (PPN) generada por las macrófitas y algas fotosintéticas es de 80\\ 000\\text{ kcal/m}^2\\cdot\\text{año}. Si se asume el cumplimiento estricto de la ley del diezmo ecológico de Lindeman (10\\% de eficiencia de transferencia energética entre niveles tróficos consecutivos), ¿cuánta energía estará disponible por metro cuadrado al año para una población de truchas que actúan como consumidores terciarios en dicha laguna?",
                    options = listOf(
                        "8000\\text{ kcal}",
                        "800\\text{ kcal}",
                        "80\\text{ kcal}",
                        "8\\text{ kcal}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Nivel trófico 1 (Productores primarios): PPN = 80\\ 000\\text{ kcal/m}^2\\cdot\\text{año}. 2. Nivel trófico 2 (Consumidores primarios / herbívoros: zooplancton y caracoles): E_2 = 10\\% \\text{ de } 80\\ 000 = 8000\\text{ kcal/m}^2\\cdot\\text{año} 3. Nivel trófico 3 (Consumidores secundarios / carnívoros intermedios: insectos acuáticos y peces pequeños): E_3 = 10\\% \\text{ de } 8000 = 800\\text{ kcal/m}^2\\cdot\\text{año} 4. Nivel trófico 4 (Consumidores terciarios / truchas carnívoras tope): E_4 = 10\\% \\text{ de } 800 = 80\\text{ kcal/m}^2\\cdot\\text{año} - La energía disponible para las truchas es de **80\\text{ kcal/m}^2\\cdot\\text{año}**. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "bio_t13_s01_c04",
                    question = "¿Qué porcentaje aproximado de energía se transfiere de un nivel trófico al siguiente según la regla de Lindeman?",
                    options = listOf(
                        "La pirámide de energía (debido a la segunda ley de la termodinámica).",
                        "Bacterias del género *Rhizobium*.",
                        "El dióxido de carbono (CO_2).",
                        "Aproximadamente el 10\\% (el diezmo ecológico)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Aproximadamente el 10\\% (el diezmo ecológico)."
                ),
                Challenge(
                    id = "bio_t13_s01_c05",
                    question = "¿Qué tipo de pirámide ecológica nunca puede presentarse de forma invertida en un ecosistema natural?",
                    options = listOf(
                        "La pirámide de energía (debido a la segunda ley de la termodinámica).",
                        "Aproximadamente el 10\\% (el diezmo ecológico).",
                        "Bacterias del género *Rhizobium*.",
                        "El dióxido de carbono (CO_2)."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: La pirámide de energía (debido a la segunda ley de la termodinámica)."
                ),
                Challenge(
                    id = "bio_t13_s01_c06",
                    question = "¿Qué microorganismos realizan la fijación biológica del nitrógeno atmosférico en nódulos radiculares de leguminosas?",
                    options = listOf(
                        "Aproximadamente el 10\\% (el diezmo ecológico).",
                        "Bacterias del género *Rhizobium*.",
                        "La pirámide de energía (debido a la segunda ley de la termodinámica).",
                        "El dióxido de carbono (CO_2)."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Bacterias del género *Rhizobium*."
                ),
                Challenge(
                    id = "bio_t13_s01_c07",
                    question = "¿Cuál es el principal gas de efecto invernadero emitido por actividades antropogénicas que impulsa el calentamiento global moderno?",
                    options = listOf(
                        "Aproximadamente el 10\\% (el diezmo ecológico).",
                        "La pirámide de energía (debido a la segunda ley de la termodinámica).",
                        "El dióxido de carbono (CO_2).",
                        "Bacterias del género *Rhizobium*."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: El dióxido de carbono (CO_2)."
                ),
                Challenge(
                    id = "bio_t13_s01_c08",
                    question = "¿En qué Parque Nacional del Perú se protegen la Cordillera Blanca, el glaciar Huascarán y rodales de Puya Raimondi?",
                    options = listOf(
                        "Aproximadamente el 10\\% (el diezmo ecológico).",
                        "La pirámide de energía (debido a la segunda ley de la termodinámica).",
                        "Bacterias del género *Rhizobium*.",
                        "En el Parque Nacional Huascarán (Áncash)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: En el Parque Nacional Huascarán (Áncash)."
                ),
                Challenge(
                    id = "bio_t13_s01_c09",
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
                    id = "bio_t13_s01_c10",
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
            id = "bio_t13_s02",
            title = "ECOLOGÍA Y SOSTENIBILIDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ECOLOGÍA Y SOSTENIBILIDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
---

### 2.4. DINÁMICA DE POBLACIONES Y SUCESIÓN ECOLÓGICA

1. **Parámetros Poblacionales:**
   - **Densidad Poblacional:** D = N / \text{Área o Volumen}.
   - **Tasa de Crecimiento (r):**
     \Delta N = (\text{Natalidad} + \text{Inmigración}) - (\text{Mortalidad} + \text{Emigración})
2. **Modelos de Crecimiento Poblacional:**
   - **Crecimiento Exponencial (Curva en "J"):** Ocurre en ambientes ilimitados sin resistencia ambiental ni competencia:
     \frac{dN}{dt} = r \cdot N
     Típico de bacterias en cultivo fresco o especies invasoras en fases iniciales de colonización.
   - **Crecimiento Logístico o Sigmoideo (Curva en "S"):** Ocurre en ambientes naturales reales con recursos limitados. El crecimiento se frena a medida que la población se acerca a la **Capacidad de Carga (K)** del ambiente:
     \frac{dN}{dt} = r \cdot N \left( \frac{K - N}{K} \right)
     Donde K es el número máximo de individuos de una especie que un ecosistema puede sostener indefinidamente sin degradar los recursos.
3. **Sucesión Ecológica:**
   Proceso gradual y ordenado de cambio en la estructura de especies de una comunidad ecológica a lo largo del tiempo:
   - **Sucesión Primaria:** Se inicia en un sustrato biológicamente estéril donde nunca antes existió vida ni suelo formado (ej. lava volcánica recién enfriada, morrena dejada por un glaciar en retroceso, duna de arena virgen). Los organismos pioneros son líquenes y musgos que meteorizan la roca formando suelo primitivo.
   - **Sucesión Secundaria:** Se inicia en un área que ya poseía suelo edáfico fértil y vegetación previa, pero que fue perturbada por un disturbio (incendio forestal, tala, abandono de un campo de cultivo, aluvión). La recolonización es mucho más rápida gracias al banco de semillas y materia orgánica del suelo.
   - **Comunidad Clímax:** Estadio maduro, autorregulado y dinámicamente estable final de la sucesión ecológica, caracterizado por máxima biomasa, alta biodiversidad y redes tróficas complejas.

---

### 2.5. IMPACTO AMBIENTAL Y CONTAMINACIÓN GLOBAL

1. **Calentamiento Global y Efecto Invernadero Antrópico:**
   - El efecto invernadero natural retiene el calor en la Tierra permitiendo la vida (T_{\text{media}} \approx 15^\circ\text{C}; sin él sería de -18^\circ\text{C}).
   - La quema masiva de combustibles fósiles, deforestación y ganadería intensiva han incrementado los Gases de Efecto Invernadero (GEI): dióxido de carbono (CO_2), metano (CH_4), óxido nitroso (N_2O), vapor de agua y compuestos halogenados.
   - Consecuencias: Derretimiento de glaciares andinos y casquetes polares, elevación del nivel medio del mar, acidificación oceánica e intensificación de eventos hidrometeorológicos extremos (megasequías y fenómeno de El Niño).
2. **Destrucción de la Capa de Ozono (O_3 Estratosférico):**
   - El ozono estratosférico absorbe la radiación ultravioleta de alta energía (UV-B y UV-C).
   - Destruido catalíticamente por los **Clorofluorocarbonos (CFCs)** utilizados históricamente en refrigeración y aerosoles. El átomo de cloro liberado por la luz UV actúa como catalizador destruyendo miles de moléculas de ozono:
     Cl\cdot + O_3 \to ClO\cdot + O_2
     ClO\cdot + O \to Cl\cdot + O_2
   - Mitigado internacionalmente mediante el exitoso **Protocolo de Montreal (1987)**.
3. **Lluvia Ácida:**
   - Provocada por emisiones industriales de dióxido de azufre (SO_2) y óxidos de nitrógeno (NO_x) procedentes de centrales termoeléctricas y fundiciones metalúrgicas. En la atmósfera reaccionan con vapor de agua formando **ácido sulfúrico (H_2SO_4)** y **ácido nítrico (HNO_3)**.
   - Precipita con pH < 5.6, acidificando suelos, lixiviando cationes nutritivos (Ca^{2+}, Mg^{2+}) y liberando aluminio tóxico para las raíces, además de corroer monumentos de piedra caliza y mármol.
4. **Eutrofización de Cuerpos de Agua:**
   - Enriquecimiento anómalo de nutrientes (**nitratos y fosfatos**) en lagos y ríos procedente de fertilizantes agrícolas y detergentes domésticos con aguas servidas.
   - Desencadena la proliferación explosiva de microalgas y cianobacterias superficiales que bloquean la luz solar \to muerte y sedimentación masiva de fitoplancton \to proliferación de bacterias descomponedoras aeróbicas \to **agotamiento total del oxígeno disuelto (anoxia)** \to muerte de peces e invertebrados por asfixia y generación de olores pútridos (H_2S, CH_4).

---

### 2.6. ÁREAS NATURALES PROTEGIDAS (ANP) DEL PERÚ

Administradas por el **SERNANP** (Servicio Nacional de Áreas Naturales Protegidas por el Estado), adscrito al Ministerio del Ambiente (MINAM):

#### A. Áreas de Uso Indirecto (Tangibles e Intangibles)
Prohibida la extracción de recursos naturales y la modificación del ambiente silvestre; solo se permite la investigación científica, educación ambiental y turismo controlado:
1. **Parques Nacionales (PN):** Protegen la integridad ecológica de uno o más ecosistemas de gran extensión territorial y su biodiversidad:
   - *PN Huascarán (Áncash):* Cordillera Blanca, protege el glaciar Huascarán, queñuales y la Puya Raimondi.
   - *PN Manu (Cusco y Madre de Dios):* Uno de los enclaves de mayor megadiversidad del planeta, abarca desde la puna hasta la llanura amazónica.
   - *PN Cerros de Amotape (Tumbes y Piura):* Bosque seco ecuatorial y bosque tropical del Pacífico; refugio del cocodrilo de Tumbes.
   - *PN Cutervo (Cajamarca):* Primer Parque Nacional establecido en el Perú (1961), protege las cuevas de San Andrés y a los guácharos.
   - *PN Tingo María (Huánuco):* Protege la "Bella Durmiente" y la Cueva de las Lechuzas.
2. **Santuarios Nacionales (SN):** Protegen con carácter intangible una especie o comunidad determinada de flora o fauna, o formaciones naturales de interés científico:
   - *SN Huayllay (Pasco):* Bosque geológico de piedras más alto del mundo.
   - *SN Manglares de Tumbes (Tumbes):* Protege el ecosistema de manglar, concha negra y cangrejo del manglar.
   - *SN Lagunas de Mejía (Arequipa - Islay):* Humedal costero parada obligada de aves migratorias intercontinentales.
   - *SN Calipuy (La Libertad):* Protege el rodal más grande de Puya Raimondi.
   - *SN Ampay (Apurímac):* Protege el bosque de intimpas (*Podocarpus glomeratus*, única conífera nativa peruana).
3. **Santuarios Históricos (SH):** Protegen espacios que contienen valores naturales relevantes asociados a eventos trascendentales de la historia nacional:
   - *SH Machu Picchu (Cusco):* Maravilla del mundo moderno y biodiversidad del bosque de neblina (oso de anteojos y orquídeas).
   - *SH Pampa de Ayacucho (Ayacucho):* Escenario de la Batalla de Ayacucho (1824) que selló la independencia sudamericana.
   - *SH Chacamarca (Junín):* Escenario de la Batalla de Junín (1824).
   - *SH Bosque de Pómac (Lambayeque):* Bosque seco con pirámides de la cultura Sicán.

#### B. Áreas de Uso Directo (Aprovechamiento Sostenible)
Permiten el aprovechamiento y extracción regulada de recursos naturales prioritariamente por poblaciones locales ancestrales:
1. **Reservas Nacionales (RN):** Conservación y manejo sostenible de la fauna silvestre y recursos hidrobiológicos:
   - *RN Pampa Galeras - Bárbara D'Achille (Ayacucho):* Manejo y recuperación de la **vicuña** (*Vicugna vicugna*) mediante el *Chaccu*.
   - *RN Paracas (Ica):* Ecosistema marino-costero del Pacífico sur, lobos marinos, pingüino de Humboldt.
   - *RN Titicaca (Puno):* Lago Titicaca, totorales, protección de la rana gigante y aves lacustres.
   - *RN Pacaya Samiria (Loreto):* "La selva de los espejos", bosque inundable amazónico más extenso del Perú; manejo de paiche (*Arapaima gigas*) y tortuga charapa.
   - *RN Salinas y Aguada Blanca (Arequipa y Moquegua):* Bofedales, volcanes Misti, Chachani y Pichu Pichu; reserva hídrica de Arequipa y protección de camélidos andinos.
   - *RN Tambopata (Madre de Dios):* Colpas de guacamayos y lagos de meandro.
2. **Reservas Paisajísticas (RP):** Armonía entre el hombre y la naturaleza protegida:
   - *RP Nor Yauyos Cochas (Lima y Junín):* Cuenca del río Cañete, cascadas y andenerías vivas.
   - *RP Subcuenca del Cotahuasi (Arequipa):* Cañón del Cotahuasi, bosques de queñuales y cascada de Sipia.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   \frac{dN}{dt} = rN \left( \frac{K - N}{K} \right)
   - Si N \ll K \implies \frac{K-N}{K} \approx 1 \implies La población crece casi exponencialmente.
   - Si N \to K \implies \frac{K-N}{K} \to 0 \implies \frac{dN}{dt} = 0 \implies Población en equilibrio con la capacidad de carga.

3. **Productividad Primaria Neta (PPN):**
   PPN = PPB - R
   Donde PPB es la Productividad Primaria Bruta (energía solar total fijada por fotosíntesis) y R es la energía consumida por la respiración celular de las plantas.

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Pirámide de Energía Invertida:** Enunciado trampa clásico. **La pirámide de energía NUNCA puede ser invertida** bajo ninguna circunstancia biológica porque violaría la segunda ley de la termodinámica. Las únicas pirámides que pueden invertirse son las de **biomasa** (en ecosistemas marinos) y las de **números** (en cadenas parasitarias o árboles).
* **Parques Nacionales vs. Reservas Nacionales:**
  - En un **Parque Nacional** (como el Huascarán o el Manu) el uso es **indirecto e intangible**; no se puede talar, pastar ni cazar.
  - En una **Reserva Nacional** (como Salinas y Aguada Blanca o Pampa Galeras) el uso es **directo y sostenible**; las comunidades locales sí pueden aprovechar vicuñas o recursos hidrobiológicos bajo supervisión del SERNANP.
* **Mutualismo vs. Protocooperación:**
  - En el **Mutualismo**, la unión es **obligatoria** y vital para ambos (si se separan, mueren; ej. hongo y alga en el liquen).
  - En la **Protocooperación**, la unión es **facultativa u opcional**; se benefician, pero pueden vivir de forma independiente.
* **Causa de la Eutrofización:** El factor limitante detonante de la eutrofización en lagos de agua dulce es el exceso de **fósforo (fosfatos)** y en ambientes marinos costeros el exceso de **nitrógeno (nitratos)**.
* **El Ciclo del Fósforo NO tiene Fase Gaseosa:** El fósforo no posee reservorio atmosférico significativo en la troposfera; su ciclo es puramente sedimentario a partir de rocas fosfatadas y meteorización.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Etapas del Ciclo del Nitrógeno en Orden:**
   > **"FI-NI-A-AMO-DES"**
   - **FI**jación (N_2 \to NH_3)
   - **NI**trificación (NH_4^+ \to NO_2^- \to NO_3^-)
   - **A**similación (Plantas absorben nitratos)
   - **AMO**nificación (Descomponedores devuelven amonio)
   - **DES**nitrificación (Bacterias devuelven N_2 al aire)

2. **Categorías de Áreas Naturales Protegidas Intangibles:**
   > **"P-S-S" (Parques, Santuarios Nacionales y Santuarios Históricos)**
   - ¡En las áreas con **S**antuario o **P**arque Nacional **NO se extrae nada**! Son de **Uso Indirecto**.

3. **Gases Principales del Efecto Invernadero:**
   > **"CO-ME-VA-OX"**
   - **CO**_2 (Dióxido de carbono)
   - **ME**tano (CH_4)
   - **VA**por de agua (H_2O)
   - **ÓX**ido nitroso (N_2O)

4. **Bacterias Nitrificantes del Suelo:**
   > **"SOMONAS convierte en Nitrito, BACTER lo vuelve Nitrato"**
   - *Nitro**somonas***: NH_4^+ \to NO_2^-
   - *Nitro**bacter***: NO_2^- \to NO_3^-

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Termodinámica Física y Ecosistemas (Teoría de Sistemas Abiertos de Prigogine):** Un ecosistema es una estructura disipativa abierta lejos del equilibrio termodinámico que mantiene su baja entropía interna exportando entropía al entorno en forma de calor residual degradado (dQ/T). La entrada continua de energía solar radiante de alta frecuencia sostiene la organización biosférica en contra de la degradación espontánea.
* **Economía Ambiental y Valoración de Servicios Ecosistémicos:** Los ecosistemas naturales proporcionan cuatro categorías fundamentales de servicios ecosistémicos a la sociedad humana:
  1. *De provisión:* Alimentos, madera, agua dulce, recursos genéticos y principios farmacológicos.
  2. *De regulación:* Regulación climática, captura de carbono, polinización de cultivos y purificación de agua.
  3. *Culturales:* Ecoturismo, recreación y valores espirituales.
  4. *De soporte:* Formación del suelo y ciclaje de nutrientes.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Sanitario-Ecológico: Biomagnificación de Metales Pesados)
En una cuenca hidrográfica del sur del Perú impactada por actividades de minería ilegal de oro que emplea mercurio líquido (Hg) para la amalgamación, se realiza un estudio toxicológico en los organismos de la cadena trófica acuática. Los resultados del análisis de mercurio en tejido muscular arrojan las siguientes concentraciones:
- Fitoplancton (Productores primarios): 0.05\text{ mg/kg}
- Zooplancton herbívoro (Consumidor primario): 0.4\text{ mg/kg}
- Peces pequeños omnívoros (Consumidor secundario): 2.8\text{ mg/kg}
- Pez carnívoro grande depredador (Consumidor terciario): 18.5\text{ mg/kg}
- Aves ictiófagas / Pobladores ribereños que consumen peces grandes: >45.0\text{ mg/kg}
¿Qué fenómeno ecológico y toxicológico explica el incremento exponencial en la concentración del contaminante conforme se asciende en la red trófica?
A) Eutrofización anóxica  
B) Biomagnificación o bioamplificación trófica de un xenobiótico no biodegradable y lipofílico  
C) Ley del diezmo ecológico de Lindeman  
D) Sucesión ecológica primaria en sedimentos aluviales  
E) Disminución de la entropía por evaporación de iones mercurio  

* **Resolución:** El mercurio inorgánico vertido al río es metilado por bacterias anaerobias en el sedimento, transformándose en **metilmercurio (CH_3Hg^+)**, un compuesto organometálico altamente neurotóxico, liposoluble y resistente a la biodegradación y excreción metabólica. Al ser consumido, no se degrada ni se elimina fácilmente, acumulándose en los tejidos adiposos (**bioacumulación**). Cuando los carnívoros consumen grandes volúmenes de presas del nivel anterior para satisfacer sus demandas energéticas, el tóxico se concentra de forma multiplicativa en cada eslabón sucesivo (**biomagnificación trófica**), alcanzando dosis letales y neurotóxicas en los depredadores tope y en las poblaciones humanas consumidoras (Enfermedad de Minamata).  
* **Respuesta:** B

---

### Pregunta 2 (Caso de Gestión Ambiental: Conservación de Camélidos en Arequipa)
La comunidad campesina de Yanque en la Reserva Nacional de Salinas y Aguada Blanca solicita autorización al SERNANP para realizar el традиционный *Chaccu* de vicuñas. El plan consiste en arrear a los animales silvestres hacia mangas de captura temporales, realizar la esquila de la fibra de vellón en animales adultos sin sacrificarlos, desparasitarlos veterinariamente y liberarlos de inmediato a su hábitat natural sin alterar la estructura de los rebaños. Grupos opositores denuncian que esto viola la intangibilidad del área protegida. Desde el marco técnico de la legislación ambiental peruana, ¿cuál es el dictamen técnico correcto?
A) La denuncia procede porque en toda Área Natural Protegida está prohibido tocar a los animales.  
B) La actividad es plenamente legal y técnicamente sostenible, porque las Reservas Nacionales son Áreas de Uso Directo concebidas expresamente para el aprovechamiento y manejo racional de recursos silvestres por comunidades locales bajo planes de manejo aprobados.  
C) El Chaccu debe sustituirse por la crianza en corrales cerrados para domesticar a la vicuña.  
D) Se debe cambiar la categoría de Reserva Nacional a Parque Nacional para expulsar a la comunidad campesina.  
E) La vicuña es una especie extinta y el arreo perturba a las alpacas domésticas.  

* **Resolución:** Conforme a la Ley N.° 26834 y al SERNANP, las **Reservas Nacionales** pertenecen a la categoría de **Uso Directo**, lo que significa que su objetivo primordial es garantizar la conservación de la biodiversidad permitiendo el **aprovechamiento sostenible** y regulado de recursos silvestres prioritariamente por las comunidades locales tradicionales. El *Chaccu* incaico es el modelo emblemático internacional de conservación activa: la vicuña se captura viva, se esquila su valiosa fibra sin causarle daño y se libera al estado silvestre, generando ingresos económicos comunales que desincentivan la caza furtiva.  
* **Respuesta:** B

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t13_s02_c01",
                    question = "**Enunciado:** Una empresa minera transnacional solicita concesiones para realizar labores de exploración y extracción a cielo abierto en dos áreas geográficas del territorio peruano: la primera se ubica dentro de los límites del Parque Nacional Huascarán (Áncash) y la segunda en la Reserva Nacional Salinas y Aguada Blanca (Arequipa). El Ministerio del Ambiente (MINAM), a través del SERNANP, evalúa la solicitud conforme a la Ley N.° 26834 (Ley de Áreas Naturales Protegidas). ¿Cuál es la resolución legal y técnica que corresponde aplicar en cada caso?",
                    options = listOf(
                        "Se rechaza de plano en el Parque Nacional Huascarán por ser un área intangible de uso indirecto donde se prohíbe toda actividad extractiva; en la Reserva Nacional Salinas y Aguada Blanca la actividad minera masiva a cielo abierto es incompatible con su categoría de uso directo orientada al aprovechamiento sostenible de recursos naturales y la conservación del agua.",
                        "Se aprueba en ambas áreas porque la minería aporta divisas al Estado peruano.",
                        "Se aprueba en el Parque Nacional pero se deniega en la Reserva Nacional por existir vicuñas silvestres.",
                        "Se recalifica el Parque Nacional transformándolo en Zona Reservada para habilitar la explotación."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Conforme a la legislación ambiental peruana, las Áreas de **Uso Indirecto** (Parques Nacionales, Santuarios Nacionales y Santuarios Históricos) gozan de **intangibilidad estricta**: en ellas no se permite la extracción de recursos naturales ni modificaciones del ambiente silvestre bajo ninguna circunstancia. Por ello, la concesión en el **PN Huascarán queda automáticamente prohibida por mandato de la ley**. 2. Las Reservas Nacionales son Áreas de **Uso Directo**, lo que faculta el aprovechamiento sostenible de recursos renovables principalmente por poblaciones tradicionales locales bajo planes de manejo aprobados (como el pastoreo comunal o aprovechamiento de vicuñas), siendo incompatibles con megaproyectos mineros a cielo abierto que degraden los bofedales que alimentan de agua potable a la ciudad de Arequipa. **Respuesta:** A ---"
                ),
                Challenge(
                    id = "bio_t13_s02_c02",
                    question = "**Enunciado:** En un lago tectónico andino, se vierte de forma continua un efluente de aguas servidas urbanas rico en detergentes polifosfatados y escorrentía agrícola con fertilizantes amoniacales. A los dos meses de iniciada la descarga, se registra un florecimiento acelerado de cianobacterias filamentosas en la superficie (bloom de *Microcystis sp.*), seguido por la anoxia total de la columna profunda hipolimnética y una mortandad masiva del 100\\% de los peces nativos. Se analizan muestras del agua profunda en el fondo del lago. ¿Qué perfil de concentraciones hidroquímicas reflejará con precisión el colapso ecológico biogeoquímico por eutrofización?",
                    options = listOf(
                        "Saturación del 100\\% de oxígeno disuelto (DO), concentración nula de metano (CH_4) y ausencia de fosfatos.",
                        "Oxígeno disuelto cercano a 0\\text{ mg/L}, demanda biológica de oxígeno (\\text{DBO}_5) extremadamente elevada, y niveles altos de sulfuro de hidrógeno (H_2S), amonio (NH_4^+) y metano producidos por bacterias anaerobias metanógenas y sulfatorreductoras.",
                        "Descenso absoluto de la conductividad eléctrica y desaparición total de las bacterias descomponedoras.",
                        "Cristalización espontánea de nitrato de sodio y aumento del pH a 13.5 por absorción de ozono."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. El ingreso masivo de fosfatos y nitratos desata la **eutrofización artificial**: las microalgas y cianobacterias superficiales proliferan formando una capa densa que impide el paso de la luz solar hacia estratos profundos. 2. Al morir esta inmensa biomasa vegetal, sedimenta al fondo donde las bacterias heterótrofas descomponedoras aeróbicas se multiplican exponencialmente para degradarla, agotando todo el **oxígeno disuelto** (DO \\to 0\\text{ mg/L}). 3. Esto eleva drásticamente la **Demanda Biológica de Oxígeno (\\text{DBO}_5)**. 4. Al consumirse el oxígeno, proliferan las **bacterias anaerobias obligadas**: las sulfatorreductoras reducen sulfatos produciendo **ácido sulfhídrico (H_2S)** (olor a huevo podrido), mientras que las arqueas metanógenas fermentan la materia produciendo **metano (CH_4)** y se acumula **amonio (NH_4^+)**, creando un ambiente tóxico y anóxico letal para la fauna acuática. **Respuesta:** B --- 1. ¿Qué nombre recibe la unidad ecológica formada por la biocenosis interactuando con su biotopo abiótico? 2. ¿Qué bacteria fijadora de nitrógeno atmosférico establece simbiosis mutualista con las raíces de leguminosas? 3. ¿Cuál es la única pirámide ecológica que jamás puede presentarse de forma invertida en un ecosistema? 4. ¿En qué Área Natural Protegida del Perú se ubica el bosque geológico de piedras más alto del mundo? 5. ¿Qué contaminantes halogenados fueron los principales causantes de la degradación catalítica de la capa de ozono estratosférico? --- 1: B | 2: C | 3: D | 4: B | 5: B"
                ),
                Challenge(
                    id = "bio_t13_s02_c03",
                    question = "¿Cuál es la diferencia jurídica básica entre un Parque Nacional y una Reserva Nacional en el Perú?",
                    options = listOf(
                        "Los Clorofluorocarbonos (CFCs).",
                        "Protocooperación.",
                        "El Parque Nacional es de uso indirecto (intangible, sin extracción de recursos); la Reserva Nacional es de uso directo (permite el aprovechamiento sostenible regulado de recursos).",
                        "Eutrofización."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: El Parque Nacional es de uso indirecto (intangible, sin extracción de recursos); la Reserva Nacional es de uso directo (permite el aprovechamiento sostenible regulado de recursos)."
                ),
                Challenge(
                    id = "bio_t13_s02_c04",
                    question = "¿Qué compuestos químicos sintéticos son los principales destructores de la capa de ozono estratosférico?",
                    options = listOf(
                        "El Parque Nacional es de uso indirecto (intangible, sin extracción de recursos); la Reserva Nacional es de uso directo (permite el aprovechamiento sostenible regulado de recursos).",
                        "Protocooperación.",
                        "Eutrofización.",
                        "Los Clorofluorocarbonos (CFCs)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Los Clorofluorocarbonos (CFCs)."
                ),
                Challenge(
                    id = "bio_t13_s02_c05",
                    question = "¿Cómo se denomina la interacción biológica en la que dos especies se benefician mutuamente pero pueden vivir de forma separada sin morir?",
                    options = listOf(
                        "Protocooperación.",
                        "El Parque Nacional es de uso indirecto (intangible, sin extracción de recursos); la Reserva Nacional es de uso directo (permite el aprovechamiento sostenible regulado de recursos).",
                        "Los Clorofluorocarbonos (CFCs).",
                        "Eutrofización."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Protocooperación."
                ),
                Challenge(
                    id = "bio_t13_s02_c06",
                    question = "¿Qué fenómeno de contaminación hídrica ocurre cuando el exceso de nitratos y fosfatos provoca anoxia y proliferación masiva de microalgas?",
                    options = listOf(
                        "El Parque Nacional es de uso indirecto (intangible, sin extracción de recursos); la Reserva Nacional es de uso directo (permite el aprovechamiento sostenible regulado de recursos).",
                        "Eutrofización.",
                        "Los Clorofluorocarbonos (CFCs).",
                        "Protocooperación."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Eutrofización."
                ),
                Challenge(
                    id = "bio_t13_s02_c07",
                    question = "¿Qué Santuario Nacional ubicado en Arequipa protege un humedal costero que sirve de refugio a aves migratorias?",
                    options = listOf(
                        "El Parque Nacional es de uso indirecto (intangible, sin extracción de recursos); la Reserva Nacional es de uso directo (permite el aprovechamiento sostenible regulado de recursos).",
                        "Los Clorofluorocarbonos (CFCs).",
                        "El Santuario Nacional Lagunas de Mejía (Islay).",
                        "Protocooperación."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: El Santuario Nacional Lagunas de Mejía (Islay)."
                ),
                Challenge(
                    id = "bio_t13_s02_c08",
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
                    id = "bio_t13_s02_c09",
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
                    id = "bio_t13_s02_c10",
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
