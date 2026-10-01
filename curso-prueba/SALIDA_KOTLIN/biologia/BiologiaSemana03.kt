package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t03_s01",
            title = "Base Química de la Vida: Bioelementos y Biomoléculas - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Base Química de la Vida: Bioelementos y Biomoléculas - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Bioquímica Fundamental y Biología Molecular
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.154748700 pts/pregunta (Examen: 5 preguntas)
  * *Área 2 (Biomédicas):* 1.945140000 pts/pregunta (Examen: 9 preguntas) — **MÁXIMA PRIORIDAD DEL EXAMEN**
  * *Área 3 (Sociales):* 1.148603363 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Estructura química de glúcidos, lípidos, proteínas, ácidos nucleicos, enlaces químicos y vitaminas)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10 (Fijo e insustituible en Biomédicas)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         BASE QUÍMICA DE LA MATERIA VIVA
                                        │
         ┌──────────────────────────────┴──────────────────────────────┐
         ▼                                                             ▼
    BIOELEMENTOS                                                  BIOMOLÉCULAS
• Primarios (Organógenos, 96%): CHONPS                                  │
• Secundarios (Macroelementos, 3.9%): Ca, Na, K, Cl, Mg        ┌────────┴────────┐
• Oligoelementos (Trazas, < 0.1%): Fe, I, Zn, Cu, F, Co, Mn     ▼                 ▼
                                                          INORGÁNICAS         ORGÁNICAS
                                                          • Agua (H_2O)     • Glúcidos (Carbohidratos)
                                                          • Sales minerales   • Lípidos (Grasas, fosfolípidos)
                                                          • Gases (O_2, CO_2) • Proteínas (Aminoácidos)
                                                                              • Ácidos Nucleicos (ADN, ARN)
                                                                              • Vitaminas (Hidro / Liposolubles)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Clasificación Bioquímica de los Bioelementos
De los 118 elementos químicos conocidos, aproximadamente 27 forman parte constante de los seres vivos:
1. **Bioelementos Primarios (Organógenos, \approx 96-99\% de la masa seca):**
   * **C, H, O, N, P, S.**
   * *Propiedad fundamental:* Tienen bajo peso atómico y radios pequeños, permitiendo la formación de enlaces covalentes interatómicos fuertes y estables (simples, dobles y triples) con orbitales híbridos.
2. **Bioelementos Secundarios (\approx 3.9\% de la masa):**
   * **Calcio (Ca):** Mineralización ósea y dental (Ca_{10}(PO_4)_6(OH)_2, hidroxiapatita), contracción muscular (unión a troponina C), coagulación sanguínea (Factor IV), sinapsis y segundo mensajero.
   * **Sodio (Na^+):** Principal catión del líquido extracelular (LEC). Mantiene la presión osmótica y el potencial de membrana.
   * **Potasio (K^+):** Principal catión del líquido intracelular (LIC). Conducción nerviosa y repolarización cardíaca.
   * **Cloro (Cl^-):** Principal anión del LEC. Mantiene el balance hídrico y la síntesis de ácido clorhídrico gástrico (HCl).
   * **Magnesio (Mg):** Componente central de la clorofila en plantas; cofactor de quinasas y estabilizador de la estructura del ribosoma.
3. **Oligoelementos o Elementos Traza (< 0.1\%):** Indispensables a concentraciones microscópicas:
   * **Hierro (Fe):** Constituyente del grupo hemo de la **hemoglobina** (transporte de O_2), **mioglobina** y citocromos de la cadena respiratoria. Su deficiencia causa anemia ferropénica.
   * **Yodo (I):** Componente esencial de las hormonas tiroideas (Tiroxina T_4 y Triyodotironina T_3). Su déficit causa bocio endémico y cretinismo.
   * **Zinc (Zn):** Cofactor de la anhidrasa carbónica y ARN polimerasas; cicatrización y respuesta inmune.
   * **Cobre (Cu):** Componente de la **hemocianina** (pigmento respiratorio azul en moluscos y artrópodos) y de la citocromo c oxidasa.
   * **Cobalto (Co):** Núcleo central de la **vitamina B_{12}** (cobalamina). Su déficit causa anemia perniciosa.
   * **Flúor (F):** Previene la caries dental formando fluorapatita en el esmalte.

---

### 3.2. Biomoléculas Inorgánicas

#### A. El Agua (H_2O, \approx 65-75\% del peso corporal)
Estructura: Molécula dipolar angular (104.5^\circ) donde el oxígeno electronegativo atrae los electrones formando dipolos (\delta^- - \delta^+), permitiendo la formación de hasta **4 puentes de hidrógeno** por molécula.
* **Propiedades Físico-Químicas y Relevancia Biológica:**
  1. *Elevado Calor Específico (1\text{ cal/g}^\circ\text{C} = 4.184\text{ J/g}\cdot\text{K}):* Excelente **termorregulador** corporal; absorbe o cede mucho calor con mínimas variaciones de temperatura.
  2. *Elevado Calor Latente de Vaporización (540\text{ cal/g}):* Permite la refrigeración eficiente mediante la sudoración y transpiración foliar.
  3. *Alta Tensión Superficial y Cohesión:* Fuerzas de atracción entre moléculas vecinas de agua; permite el fenómeno de **capilaridad** (ascenso de savia bruta por los vasos leñosos de xilema).
  4. *Elevada Constante Dieléctrica (\epsilon \approx 80):* Es el **disolvente universal** polar; disocia e hidrata iones y sales minerales.
  5. *Densidad Anómala:* El hielo sólido (0^\circ\text{C}, \rho \approx 0.92\text{ g/cm}^3) es menos denso que el agua líquida (máxima densidad a 4^\circ\text{C}, \rho = 1.0\text{ g/cm}^3); el hielo flota formando una capa aislante que preserva la vida acuática en invierno.

#### B. Sales Minerales
* **Precipitadas (Estructurales):** Carbonato de calcio (CaCO_3, conchas de moluscos), fosfato de calcio e hidroxiapatita (huesos y dientes), sílice (SiO_2, frústulas de diatomeas).
* **Disueltas (Iones / Electrolitos):** Mantienen la presión osmótica, el equilibrio ácido-base mediante sistemas buffer fosfato (HPO_4^{2-} / H_2PO_4^-) y bicarbonato (H_2CO_3 / HCO_3^-), y generan potenciales de acción bioeléctricos.

---

### 3.3. Biomoléculas Orgánicas

#### A. Glúcidos (Carbohidratos o Hidratos de Carbono)
Biomoléculas ternarias constituidas por C, H, O con relación empírica general C_n(H_2O)_n. Son la **fuente primaria de energía inmediata** de la célula (4\text{ kcal/g}).
1. **Monosacáridos (Azúcares Simples, monómeros):**
   * Por el número de carbonos: Triosas (C_3, gliceraldehído), Pentosas (C_5: **Ribosa** en ARN/ATP y **Desoxirribosa** en ADN), Hexosas (C_6: **Glucosa**, Fructosa, Galactosa).
   * Por el grupo carbonilo: Aldosas (tienen -CHO, ej. glucosa) y Cetosas (tienen -CO-, ej. fructosa).
2. **Disacáridos:** Unión de dos monosacáridos mediante **Enlace Glucosídico** con liberación de una molécula de agua (H_2O):
   * **Maltosa:** \alpha\text{-D-glucosa} + \alpha\text{-D-glucosa} (enlace \alpha-1,4). Azúcar de malta.
   * **Lactosa:** \beta\text{-D-galactosa} + \beta\text{-D-glucosa} (enlace \beta-1,4). Azúcar de la leche.
   * **Sacarosa:** \alpha\text{-D-glucosa} + \beta\text{-D-fructosa} (enlace \alpha-1,2). Azúcar de mesa (no reductor).
3. **Polisacáridos:** Polímeros de cientos o miles de glucosas insolubles en agua:
   * **De Reserva Energética:**
     * *Almidón:* Reserva energética vegetal (amilosa con enlaces \alpha-1,4 lineales y amilopectina con ramificaciones \alpha-1,6).
     * *Glucógeno:* Reserva energética animal en hígado y músculo esquelético (altamente ramificado, enlaces \alpha-1,4 y \alpha-1,6).
   * **Estructurales:**
     * *Celulosa:* Componente fundamental de la pared celular vegetal (polímero lineal de glucosas unidas por enlaces \mathbf{\beta-1,4} no digeribles por enzimas humanas).
     * *Quitina:* Componente del exoesqueleto de artrópodos y de la pared celular de los hongos (polímero de **N-acetilglucosamina** con enlaces \beta-1,4).
     * *Peptidoglicano o Mureína:* Componente de la pared celular bacteriana.

#### B. Lípidos
Biomoléculas ternarias (C, H, O, y a veces P, N) hidrófobas e insolubles en agua, pero solubles en solventes orgánicos apolares. Son la **mayor reserva de energía a largo plazo** (9.3\text{ kcal/g}), termoaislantes y protectores mecánicos.
1. **Lípidos Saponificables (Contienen Ácidos Grasos y Enlaces Éster):**
   * **Lípidos Simples:**
     * *Acilglicéridos (Triglicéridos):* Formados por **1 glicerol + 3 ácidos grasos** unidos por enlaces éster. Almacenados en los adipocitos del tejido adiposo.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"La desnaturalización de una proteína rompe los enlaces peptídicos\". FALSO CRÍTICO. La desnaturalización rompe exclusivamente los enlaces no covalentes e interacciones de\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t03_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Confundir los pares de bases de Chargaff. Recuerda que G \\equiv C están unidos por tres puentes de hidrógeno, mientras que A = T por dos. Un ADN con alto contenido de\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t03_s01_c03",
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
                    id = "bio_t03_s01_c04",
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
                    id = "bio_t03_s01_c05",
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
                    id = "bio_t03_s01_c06",
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
                    id = "bio_t03_s01_c07",
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
                    id = "bio_t03_s01_c08",
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
                    id = "bio_t03_s01_c09",
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
                    id = "bio_t03_s01_c10",
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
            id = "bio_t03_s02",
            title = "Base Química de la Vida: Bioelementos y Biomoléculas - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Base Química de la Vida: Bioelementos y Biomoléculas - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     * *Céridos (Ceras):* Ésteres de un ácido graso con un alcohol monohidroxílico de cadena larga (ej. cera de abeja, cutina foliar, cerumen ótico).
   * **Lípidos Complejos (Anfipáticos):**
     * *Fosfolípidos (Fosfoglicéridos):* Componentes estructurales bicapa de todas las membranas celulares. Poseen una **cabeza polar hidrofílica** (glicerol + fosfato + colina) y **dos colas no polares hidrofóbicas** (ácidos grasos).
2. **Lípidos Insaponificables (Sin Ácidos Grasos ni Enlace Éster):**
   * **Esteroides:** Derivados del núcleo hidrocarbonado **Ciclopentanoperhidrofenantreno (Esterano)**:
     * *Colesterol:* Estabiliza la fluidez de las membranas celulares animales; precursor de ácidos biliares, vitamina D y hormonas esteroideas (testosterona, estrógenos, progesterona, cortisol, aldosterona).
     * *Fitosteroles:* En plantas.
   * **Terpenos o Isoprenoides:** Derivados del isopreno (vitaminas A, E, K, pigmentos carotenoides).
   * **Prostaglandinas:** Derivadas del ácido araquidónico (mediadores del dolor e inflamación).

#### C. Proteínas
Biomoléculas cuaternarias (C, H, O, N, frecuentemente S) poliméricas de altísimo peso molecular, compuestas por cadenas de **aminoácidos** unidos mediante **Enlaces Peptídicos** (enlace amida covalente entre el grupo \alpha-carboxilo de un aminoácido y el \alpha-amino del adyacente con liberación de H_2O).
1. **Niveles de Organización Estructural de las Proteínas:**
   * *Estructura Primaria:* Secuencia lineal ordenada de aminoácidos codificada genéticamente. Determinada por enlaces peptídicos covalentes.
   * *Estructura Secundaria:* Plegamiento periódico local espacial de la cadena polipeptídica debido a **puentes de hidrógeno** entre los grupos -CO- y -NH- del esqueleto peptídico: **\alpha-hélice** (queratina) y **lámina \beta plegada** (fibroína de la seda).
   * *Estructura Terciaria:* Conformación tridimensional global nativa biológicamente activa (globular o fibrosa), estabilizada por: enlaces disulfuro covalentes (-S-S- entre cisteínas), puentes de hidrógeno, interacciones hidrofóbicas, fuerzas de Van der Waals y atracciones electrostáticas.
   * *Estructura Cuaternaria:* Unión no covalente de dos o más cadenas polipeptídicas individuales (subunidades o monómeros) (ej. Hemoglobina: 4 subunidades 2\alpha2\beta, anticuerpos).
2. **Desnaturalización Proteica:** Pérdida de las estructuras cuaternaria, terciaria y secundaria por calor extremo, cambios de pH o solventes, rompiendo los enlaces débiles pero **conservando intactos los enlaces peptídicos de la estructura primaria**. Provoca la pérdida irreversible de su función biológica.
3. **Funciones Biológicas:** Estructural (colágeno, queratina), Enzimática/Biocatalizadora (amilasa, ADN polimerasa), Transporte (hemoglobina, mioglobina, albúmina), Defensiva/Inmune (anticuerpos o inmunoglobulinas), Hormonal (insulina, glucagón), Contráctil (actina y miosina).

#### D. Ácidos Nucleicos
Biomoléculas pentarias (C, H, O, N, P) encargadas del almacenamiento, transmisión y expresión de la información genética. Son polímeros de **Nucleótidos** unidos por **Enlaces Fosfodiéster (3' \to 5')**:
* **Estructura de un Nucleótido:**
  \text{Base Nitrogenada} + \text{Azúcar Pentosa} + \text{Grupo Fosfato}
  *(Si carece de grupo fosfato se denomina **Nucleósido**)*.
  * *Bases Púricas (2 anillos):* **Adenina (A) y Guanina (G)**.
  * *Bases Pirimídicas (1 anillo):* **Citosina (C), Timina (T, exclusiva del ADN) y Uracilo (U, exclusivo del ARN)**.
* **Ácido Desoxirribonucleico (ADN):**
  * Pentosa: **2'-desoxirribosa**. Bases: A, G, C, T.
  * Estructura (Watson y Crick): Dos cadenas polinucleotídicas **antiparalelas (5'\to 3' y 3'\to 5')**, helicoidales dextrógiras y **complementarias**, unidas por puentes de hidrógeno entre bases específicas (Regla de Chargaff):
    \mathbf{A = T} \text{ (2 puentes de hidrógeno)} \quad ; \quad \mathbf{G \equiv C} \text{ (3 puentes de hidrógeno)}
* **Ácido Ribonucleico (ARN):**
  * Pentosa: **Ribosa**. Bases: A, G, C, U.
  * Monocatenario generalmente. Tipos principales:
    * *ARN mensajero (ARNm):* Porta la información genética del núcleo al ribosoma en forma de **codones**.
    * *ARN de transferencia (ARNt):* Estructura en hoja de trébol; transporta los aminoácidos específicos al ribosoma mediante su **anticodón**.
    * *ARN ribosomal (ARNr):* Forma parte estructural y catalítica (ribozima) de los ribosomas.

#### E. Vitaminas
Biomoléculas orgánicas heterogéneas indispensables en cantidades mínimas que el organismo no puede sintetizar (nutrientes esenciales). Muchas actúan como coenzimas:
1. **Vitaminas Liposolubles (Se absorben con grasas, se almacenan en hígado y tejido adiposo; su exceso produce hipervitaminosis):**
   * **Vitamina A (Retinol):** Visión nocturna (rodopsina) y epitelios. Déficit: Ceguera nocturna (nictalopía) y xeroftalmia.
   * **Vitamina D (Calciferol):** Absorción intestinal de calcio y mineralización ósea. Déficit: **Raquitismo** en niños y osteomalacia en adultos.
   * **Vitamina E (Tocoferol):** Potente antioxidante de membranas. Déficit: Anemia hemolítica y esterilidad en roedores.
   * **Vitamina K (Filoquinona / Menaquinona):** Coagulación sanguínea (síntesis hepática de protrombina). Déficit: Hemorragias espontáneas.
2. **Vitaminas Hidrosolubles (Solubles en agua, no se acumulan y se excretan en orina):**
   * **Vitamina C (Ácido Ascórbico):** Antioxidante y cofactor en la hidroxilación de colágeno. Déficit: **Escorbuto** (hemorragias gingivales, fragilidad capilar).
   * **Complejo B:**
     * *Vitamina B_1 (Tiamina):* Déficit causa **Beriberi** (polineuritis, insuficiencia cardíaca).
     * *Vitamina B_2 (Riboflavina):* Precursora de FAD. Déficit: Queilitis angular (boqueras).
     * *Vitamina B_3 (Niacina):* Precursora de NAD^+/NADP^+. Déficit: **Pelagra** (la enfermedad de las 3D: Dermatitis, Diarrea, Demencia).
     * *Vitamina B_9 (Ácido Fólico):* Síntesis de bases púricas. Déficit: Anemia megaloblástica y espina bífida en el feto.
     * *Vitamina B_{12} (Cobalamina):* Eritropoyesis. Déficit: **Anemia perniciosa**.

---

### 4. ENLACES QUÍMICOS BIOLÓGICOS ESPECÍFICOS
* Entre monosacáridos (Carbohidratos): **Enlace Glucosídico** (\alpha o \beta).
* Entre ácidos grasos y glicerol (Lípidos): **Enlace Éster**.
* Entre aminoácidos (Proteínas): **Enlace Peptídico** (enlace amida covalente).
* Entre nucleótidos (Ácidos Nucleicos): **Enlace Fosfodiéster** (3'-5').
* Entre bases nitrogenadas complementarias: **Puentes de Hidrógeno** (A=T, G\equiv C).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Vitaminas Liposolubles:** **"KEDA"**
  * Vitaminas **K, E, D, A** son liposolubles. Todas las demás (C y complejo B) son hidrosolubles.
* **Mnemotecnia Bases Púricas:** **"ÁGua Pura"**
  * **A**denina y **G**uanina son **Púri**cas.
* **Mnemotecnia Complementariedad:**
  * **A**nibal **T**roilo (A = T, 2 puentes).
  * **G**ardel **C**antor (G \equiv C, 3 puentes).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "La desnaturalización de una proteína rompe los enlaces peptídicos".** FALSO CRÍTICO. La desnaturalización rompe exclusivamente los enlaces no covalentes e interacciones de la estructura secundaria, terciaria y cuaternaria. Los enlaces peptídicos de la estructura primaria se mantienen intactos (solo se rompen por hidrólisis ácida o enzimática).
* **Trampa 2: Confundir los pares de bases de Chargaff.** Recuerda que G \equiv C están unidos por **tres** puentes de hidrógeno, mientras que A = T por **dos**. Un ADN con alto contenido de G-C tiene mayor punto de fusión termodinámico (T_m).
* **Trampa 3: "La celulosa se puede digerir por los seres humanos porque es glucosa".** FALSO. El ser humano carece de la enzima **celulasa** capaz de romper los enlaces \mathbf{\beta-1,4}-glucosídicos; por ello, la celulosa actúa como fibra dietética insoluble no digerible.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t03_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"La celulosa se puede digerir por los seres humanos porque es glucosa\". FALSO. El ser humano carece de la enzima celulasa capaz de romper los enlaces \\mathbf{\\beta-1,4}\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t03_s02_c02",
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
                    id = "bio_t03_s02_c03",
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
                    id = "bio_t03_s02_c04",
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
                    id = "bio_t03_s02_c05",
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
                    id = "bio_t03_s02_c06",
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
                    id = "bio_t03_s02_c07",
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
                    id = "bio_t03_s02_c08",
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
                    id = "bio_t03_s02_c09",
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
                    id = "bio_t03_s02_c10",
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
