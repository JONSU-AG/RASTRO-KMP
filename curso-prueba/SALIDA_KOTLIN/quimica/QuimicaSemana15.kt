package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana15 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t15_s01",
            title = "Funciones Químicas Orgánicas Oxigenadas y Nitrogenadas - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Funciones Químicas Orgánicas Oxigenadas y Nitrogenadas - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química Orgánica Funcional y Biomoléculas
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Jerarquía de grupos funcionales IUPAC, reacciones de oxidación/reducción, esterificación, saponificación y biomoléculas)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10 (Fijo en los exámenes de Biomédicas e Ingenierías)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         FUNCIONES ORGÁNICAS OXIGENADAS Y NITROGENADAS
                                               │
         ┌─────────────────────────────────────┴─────────────────────────────────────┐
         ▼                                                                           ▼
FUNCIONES OXIGENADAS                                                        FUNCIONES NITROGENADAS
• Alcoholes (-OH, sufijo -ol)                                             • Aminas (-NH_2, -NH-, -N<, básicas)
• Éteres (-O-, alcoxi- o éter)                                            • Amidas (-CONH_2, enlace peptídico)
• Aldehídos (-CHO, carbonilo terminal, -al)                               • Nitrilos (-C \equiv N)
• Cetonas (-CO-, carbonilo intermedio, -ona)                              • Nitroderivados (-NO_2)
• Ácidos Carboxílicos (-COOH, carboxilo, ácido ...-oico)                           │
• Ésteres (-COO-, carboxilato de alquilo, aroma frutal)                            ▼
                                                                            BIOMOLÉCULAS Y POLÍMEROS
         ┌──────────────────────────────────────────────────────────────────┤
         ▼                                                                  ▼
REACCIONES FUNDAMENTALES                                            • Glúcidos (Monosacáridos: glucosa)
• Oxidación de Alcoholes:                                           • Lípidos (Triglicéridos, saponificación)
  - 1^\circ \xrightarrow{[O]} \text{Aldehído} \xrightarrow{[O]} \text{Ácido Carboxílico}  • Aminoácidos y Proteínas
  - 2^\circ \xrightarrow{[O]} \text{Cetona}                       • Polímeros de Adición y Condensación
  - 3^\circ \xrightarrow{[O]} \text{No reacciona}
• Esterificación de Fischer: Ácido + Alcohol \rightleftharpoons Éster + H_2O
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Jerarquía Oficial IUPAC de Grupos Funcionales
Cuando en una misma molécula polifuncional coinciden dos o más grupos funcionales distintos, el grupo de mayor jerarquía define la función principal y la terminación del nombre (sufijo principal). Los grupos restantes pasan a nombrarse como simples sustituyentes o prefijos:

\begin{array}{|c|c|c|c|c|}
\hline
\textbf{Prioridad} & \textbf{Función Química} & \textbf{Grupo Funcional} & \textbf{Sufijo (Principal)} & \textbf{Prefijo (Sustituyente)} \\
\hline
1 & \text{Ácido Carboxílico} & -COOH & \text{ácido ...-oico} & \text{carboxi-} \\
2 & \text{Éster} & -COOR & \text{-oato de ...-ilo} & \text{alcoxicarbonil-} \\
3 & \text{Amida} & -CONH_2 & \text{-amida} & \text{carbamoil-} \\
4 & \text{Nitrilo} & -C \equiv N & \text{-nitrilo} & \text{ciano-} \\
5 & \text{Aldehído} & -CHO & \text{-al} & \text{formil- / oxo-} \\
6 & \text{Cetona} & -CO- & \text{-ona} & \text{oxo-} \\
7 & \text{Alcohol / Fenol} & -OH & \text{-ol} & \text{hidroxi-} \\
8 & \text{Amina} & -NH_2 & \text{-amina} & \text{amino-} \\
9 & \text{Éter} & -O- & \text{éter / -oxi} & \text{alcoxi-} \\
10 & \text{Alqueno / Alquino} & = / \equiv & \text{-eno / -ino} & \text{enil- / inil-} \\
11 & \text{Halógeno / Nitro} & -X / -NO_2 & \text{-} & \text{halo- / nitro-} \\
\hline
\end{array}

### 3.2. Funciones Químicas Oxigenadas

#### A. Alcoholes (-OH, Grupo Hidroxilo)
* Compuestos derivados de hidrocarburos al sustituir uno o más átomos de hidrógeno por el grupo hidroxilo (-OH).
* **Clasificación por el tipo de carbono que porta el -OH:**
  1. *Primario (1^\circ):* R-CH_2-OH (ej. etanol CH_3CH_2OH).
  2. *Secundario (2^\circ):* R-CH(OH)-R' (ej. 2-propanol o alcohol isopropílico).
  3. *Terciario (3^\circ):* R-C(OH)(R')-R'' (ej. 2-metilpropan-2-ol o alcohol ter-butílico).
* **Propiedades Físicas:** Forman intensos **enlaces puente de hidrógeno intermoleculares**, confiriéndoles puntos de ebullición sustancialmente más elevados que los éteres o hidrocarburos de masa molar similar. Los alcoholes de 1 a 3 carbonos son totalmente miscibles en agua en cualquier proporción.
* **Fenoles:** Compuestos donde el grupo -OH está enlazado directamente a un anillo aromático (C_6H_5OH, fenol o ácido fénico). Poseen carácter ligeramente más ácido que los alcoholes alifáticos.

#### B. Éteres (-O-, Grupo Oxi)
* Compuestos de fórmula general R-O-R', donde dos radicales alquilo o arilo se enlazan a un átomo de oxígeno central.
* Geometría angular (\approx 110^\circ). Carecen de hidrógenos unidos directamente a oxígeno, por lo que **NO pueden formar puentes de hidrógeno entre sí** (puntos de ebullición bajos, muy volátiles e inflamables).
* Nomenclatura: IUPAC usa prefijo alcoxi (ej. metoxietano: CH_3-O-C_2H_5) o nomenclatura radicofuncional (éter etilmetílico).

#### C. Aldehídos y Cetonas (Grupo Carbonilo, >C=O)
El enlace doble C=O es fuertemente polarizado (C^{\delta+} = O^{\delta-}), con hibridación sp^2 en el carbono.
1. **Aldehídos (R-CHO):** El grupo carbonilo se ubica en un **extremo de la cadena** (carbono primario terminal). Sufijo: **-al**.
   * Metanal (Formaldehído / Formol al 40%): conservante biológico.
   * Etanal (Acetaldehído): metabolito intermedio de la degradación del alcohol.
   * *Reactivos de diferenciación:* Dan positivo en el **Reactivo de Tollens** (espejo de plata: Ag^+ \to Ag^0) y en el **Reactivo de Fehling** (precipitado rojo ladrillo de Cu_2O), debido a su facilidad para oxidarse a ácidos carboxílicos.
2. **Cetonas (R-CO-R'):** El grupo carbonilo se ubica en una **posición intermedia** (carbono secundario). Sufijo: **-ona**.
   * Propanona (Acetona, CH_3-CO-CH_3): disolvente industrial y quitaesmalte.
   * Son resistentes a la oxidación suave (dan prueba negativa con Tollens y Fehling).

#### D. Ácidos Carboxílicos (R-COOH, Grupo Carboxilo)
* Resultan de la unión de un grupo carbonilo y un hidroxilo en el mismo átomo de carbono. Es la función oxigenada de mayor jerarquía.
* Sufijo: **ácido ...-oico**.
  * Ácido metanoico (Ácido fórmico, HCOOH): veneno de hormigas y abejas.
  * Ácido etanoico (Ácido acético, CH_3COOH): componente del vinagre al 5%.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. ENSAYOS Y REACTIVOS ANALÍTICOS ESPECÍFICOS
* **Reactivo de Tollens ([Ag(NH_3)_2]^+ en medio básico):** Oxida aldehídos produciendo un espejo de plata brillante en las paredes del tubo de ensayo. Las cetonas no reaccionan.
* **Reactivo de Fehling (Cu^{2+} complejado con tartrato):** Reduce el cobre formando un precipitado rojo ladrillo de óxido cuproso (Cu_2O) con aldehídos y azúcares reductores.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t15_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Intentar oxidar un alcohol terciario. Los alcoholes terciarios (como el 2-metilpropan-2-ol) NO poseen átomos de hidrógeno unidos al carbono que porta el grupo -OH. Por \", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t15_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Confundir aminas con amidas. La amina solo contiene nitrógeno unido a carbonos alifáticos o aromáticos (-NH_2). La amida posee el nitrógeno enlazado directamente a un g\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t15_s01_c03",
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
                    id = "quim_t15_s01_c04",
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
                    id = "quim_t15_s01_c05",
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
                    id = "quim_t15_s01_c06",
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
                    id = "quim_t15_s01_c07",
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
                    id = "quim_t15_s01_c08",
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
                    id = "quim_t15_s01_c09",
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
                    id = "quim_t15_s01_c10",
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
            id = "quim_t15_s02",
            title = "Funciones Químicas Orgánicas Oxigenadas y Nitrogenadas - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Funciones Químicas Orgánicas Oxigenadas y Nitrogenadas - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  * Ácido butanoico (Ácido butírico): olor a mantequilla rancia.
* **Propiedades Físicas:** Forman **dímeros moleculares estables** unidos por un par de puentes de hidrógeno, otorgándoles los puntos de ebullición más altos entre las sustancias orgánicas de similar masa molecular.

#### E. Ésteres (R-COO-R')
* Derivados de ácidos carboxílicos donde el hidrógeno del grupo carboxilo ha sido sustituido por un radical carbonado (R').
* Nomenclatura: Sufijo **-oato de ...-ilo** (ej. etanoato de etilo o acetato de etilo).
* **Propiedades:** Líquidos volátiles de olores y fragancias frutales placenteras (ej. butanoato de metilo: aroma a manzana; etanoato de pentilo: aroma a plátano; octanoato de etilo: aroma a naranja).

### 3.3. Funciones Químicas Nitrogenadas

#### A. Aminas (Derivadas del Amoníaco, NH_3)
Se forman al sustituir átomos de hidrógeno del NH_3 por radicales alquilo o arilo:
* *Primaria (1^\circ):* R-NH_2 (ej. metilamina, anilina o fenilamina C_6H_5NH_2).
* *Secundaria (2^\circ):* R-NH-R' (ej. dimetilamina).
* *Terciaria (3^\circ):* R-N(R')-R'' (ej. trimetilamina, responsable del olor a pescado descompuesto).
* **Carácter Básico:** Gracias al par de electrones solitario en el átomo de nitrógeno, las aminas actúan como **Bases de Lewis y Brønsted-Lowry** en solución acuosa, aceptando protones.

#### B. Amidas (R-CO-NH_2)
* Derivadas de los ácidos carboxílicos al sustituir el grupo -OH por un grupo amino (-NH_2).
* Poseen el enlace amida o **enlace peptídico**:
  -CO - NH-
* Son compuestos polares de muy alto punto de ebullición debido a su extensa red de puentes de hidrógeno. La diamida del ácido carbónico es la **urea** (H_2N-CO-NH_2).

#### C. Nitrilos o Cianuros Orgánicos (R-C \equiv N)
* Contienen el grupo ciano unido a un radical carbonado. El carbono y el nitrógeno poseen hibridación sp lineal (ej. etanonitrilo o acetonitrilo, CH_3-CN).

### 3.4. Reacciones Orgánicas Fundamentales de Admisión
1. **Oxidación Escalonada de Alcoholes:**
   * **Alcohol Primario:**
     R-CH_2OH \xrightarrow{[O] \ (\text{suave: PCC})} R-CHO \text{ (Aldehído)} \xrightarrow{[O] \ (\text{fuerte: } KMnO_4 / K_2Cr_2O_7)} R-COOH \text{ (Ácido Carboxílico)}
   * **Alcohol Secundario:**
     R-CH(OH)-R' \xrightarrow{[O]} R-CO-R' \text{ (Cetona)}
   * **Alcohol Terciario:**
     R-C(OH)(R')-R'' \xrightarrow{[O]} \textbf{NO SE OXIDA} \text{ (No hay H en el carbono carbinol)}
2. **Esterificación de Fischer (Condensación Ácido-Base Orgánica):**
   \text{Ácido Carboxílico} + \text{Alcohol} \xrightleftharpoons{H^+, \Delta} \text{Éster} + \text{Agua}
   CH_3COOH + CH_3CH_2OH \xrightleftharpoons{H_2SO_4} CH_3COOCH_2CH_3 + H_2O
3. **Saponificación (Hidrólisis Alcalina de Grasas y Ésteres):**
   \text{Triglicérido (Grasa)} + 3NaOH \xrightarrow{\Delta} \text{Glicerol (Glicerina)} + 3 \text{Jabones (Sales de ácidos grasos)}

### 3.5. Biomoléculas y Polímeros
1. **Glúcidos (Carbohidratos):** Polihidroxialdehídos o polihidroxicetonas. Fórmula empírica: C_n(H_2O)_m.
   * *Monosacáridos:* Glucosa (C_6H_{12}O_6, aldohexosa), Fructosa (cetohexosa).
   * *Disacáridos (Enlace Glucosídico con pérdida de H_2O):*
     - Sacarosa (azúcar común): Glucosa + Fructosa (\alpha-1,2).
     - Lactosa (azúcar de leche): Glucosa + Galactosa (\beta-1,4).
     - Maltosa: Glucosa + Glucosa (\alpha-1,4).
   * *Polisacáridos:* Almidón y Glucógeno (reserva vegetal y animal), Celulosa (estructural en plantas, no digerible por humanos por enlaces \beta-1,4).
2. **Lípidos:** Ésteres de ácidos grasos y glicerol (alcohol propano-1,2,3-triol). Insolubles en agua.
3. **Proteínas:** Polímeros biológicos de **aminoácidos** unidos mediante **enlaces peptídicos (amida)**.
   * Estructura de un aminoácido: Carbono \alpha asimétrico unido a: un grupo amino (-NH_2), un grupo carboxilo (-COOH), un hidrógeno (-H) y una cadena lateral (-R).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
* **Reactivo de Lucas (ZnCl_2 concentrado en HCl):** Distingue alcoholes por velocidad de turbidez (alquilhalogenación): Alcohol 3^\circ (turbidez instantánea), Alcohol 2^\circ (5 minutos), Alcohol 1^\circ (no reacciona en frío).

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Oxidación de Alcoholes:**
  * **P-A-A:** Alcohol **P**rimario \to **A**ldehído \to **Á**cido carboxílico.
  * **S-C:** Alcohol **S**ecundario \to **C**etona.
  * **T-NO:** Alcohol **T**erciario \to **NO** se oxida.
* **Mnemotecnia Jerarquía IUPAC:**
  * **"Ácido Ester-iliza a la Amiga Nidia que tiene Aldehído y Cetona, y toma Alcohol con su Amiga"**
    * **Ácido** carboxílico > **Éster** > **Amida** > **Nitrilo** > **Aldehído** > **Cetona** > **Alcohol** > **Amina**.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Intentar oxidar un alcohol terciario.** Los alcoholes terciarios (como el 2-metilpropan-2-ol) NO poseen átomos de hidrógeno unidos al carbono que porta el grupo -OH. Por tanto, resisten la oxidación con permanganato o dicromato en medio ácido y no reaccionan.
* **Trampa 2: Confundir aminas con amidas.** La **amina** solo contiene nitrógeno unido a carbonos alifáticos o aromáticos (-NH_2). La **amida** posee el nitrógeno enlazado directamente a un grupo carbonilo (-CO-NH_2).
* **Trampa 3: Invertir el orden de nomenclatura en un éster.** En el CH_3-COO-C_2H_5, la parte que contiene el carbonilo proviene del ácido acético (dos carbonos \to etanoato) y la parte alquilo unida al oxígeno proviene del etanol (etilo) \implies Se nombra **etanoato de etilo**, jamás etilacetato invertido.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t15_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Invertir el orden de nomenclatura en un éster. En el CH_3-COO-C_2H_5, la parte que contiene el carbonilo proviene del ácido acético (dos carbonos \\to etanoato) y la p\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t15_s02_c02",
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
                    id = "quim_t15_s02_c03",
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
                    id = "quim_t15_s02_c04",
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
                    id = "quim_t15_s02_c05",
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
                    id = "quim_t15_s02_c06",
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
                    id = "quim_t15_s02_c07",
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
                    id = "quim_t15_s02_c08",
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
                    id = "quim_t15_s02_c09",
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
                    id = "quim_t15_s02_c10",
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
