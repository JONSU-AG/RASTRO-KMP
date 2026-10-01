package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t06_s01",
            title = "Nomenclatura Química Inorgánica - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Nomenclatura Química Inorgánica - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química Inorgánica Sistemática
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Gran volumen de reglas IUPAC, Stock y Tradicional)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.9 / 10 (Fijo en todas las áreas de examen)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         FUNCIONES QUÍMICAS INORGÁNICAS
                                       │
         ┌─────────────────────────────┴─────────────────────────────┐
         ▼                                                           ▼
    FUNCIÓN ÓXIDO                                              FUNCIÓN HIDRURO
         │                                                           │
   ┌─────┴─────┐                                               ┌─────┴─────┐
   ▼           ▼                                               ▼           ▼
ÓXIDO BÁSICO  ÓXIDO ÁCIDO                                   METÁLICO    NO METÁLICO
(Metal + O)   (No Metal + O /                              (Metal + H)   (No Metal + H)
      │        Anhídrido)                                                  │
 +H2O │             │ +H2O                                       ┌─────────┴─────────┐
      ▼             ▼                                            ▼                   ▼
  HIDRÓXIDO    ÁCIDO OXÁCIDO                              HIDRURO ESPECIAL     ÁCIDO HIDRÁCIDO
 (Base / Álcali)   │                                     (NH_3, PH_3, CH_4)   (Grupos VIA, VIIA)
      │            │                                                                 │
      └─────┬──────┘                                                                 │
            ▼                                                                        │
       OXISALES  ◄─────────────────────────── REACCIÓN DE NEUTRALIZACIÓN ────────────┴──► SALES HALOIDEAS
 (Base + Ácido Oxácido)                                                          (Base + Ácido Hidrácido)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Conceptos Fundamentales: Valencia y Estado de Oxidación (E.O.)
1. **Valencia:** Capacidad de combinación de un átomo. Es un número entero **sin signo** que indica cuántos enlaces simples puede formar (o electrones que comparte/transfiere).
2. **Estado de Oxidación (E.O.) o Número de Oxidación:** Carga eléctrica real o aparente que adquiere un átomo cuando se rompen hipotéticamente todos sus enlaces considerando que los electrones compartidos se transfieren por completo al átomo más electronegativo. Es un número entero o fraccionario con **signo (+ o -)**.

### 3.2. Reglas Prácticas de Asignación de Estados de Oxidación
1. Todo elemento en estado libre o no combinado tiene \text{E.O.} = 0 (ej. Na, Fe, O_2, P_4, S_8).
2. El **Hidrógeno** actúa con +1 en la mayoría de sus compuestos; actúa con -1 únicamente en hidruros metálicos (NaH, CaH_2).
3. El **Oxígeno** actúa casi siempre con -2.
   * *Excepciones:*
     * En peróxidos (O_2^{2-}): actúa con -1 (ej. H_2O_2, Na_2O_2, BaO_2).
     * En superóxidos (O_2^-): actúa con -1/2 (ej. KO_2).
     * Unido al Flúor (OF_2): actúa con +2 (el Flúor es el único elemento más electronegativo que el oxígeno).
4. Los metales alcalinos (Grupo IA: Li, Na, K, Rb, Cs) y la plata (Ag) siempre actúan con +1.
5. Los metales alcalinotérreos (Grupo IIA: Be, Mg, Ca, Sr, Ba) y el zinc (Zn) y cadmio (Cd) siempre actúan con +2. El aluminio (Al) siempre actúa con +3.
6. El **Flúor** en todos sus compuestos tiene invariablemente \text{E.O.} = -1.
7. En una molécula neutra, la sumatoria algebraica de los E.O. de todos sus átomos es estrictamente igual a cero:
   \sum \text{E.O.} = 0
8. En un ión poliatómico, la sumatoria es igual a la carga neta del ión:
   \sum \text{E.O.} = q

### 3.3. Estados de Oxidación de Elementos Más Frecuentes en Admisión
* **Metales con 1 solo E.O.:** IA (+1), IIA (+2), Al (+3), Ag (+1), Zn (+2), Cd (+2).
* **Metales con varios E.O.:**
  * Cu, Hg: +1, +2
  * Au: +1, +3
  * Fe, Co, Ni: +2, +3
  * Sn, Pb, Pt: +2, +4
* **No Metales:**
  * Boro (B): +3
  * Carbono (C): +2, +4 (además -4)
  * Silicio (Si): +4
  * Nitrógeno (N): +1, +2, +3, +4, +5 (forma ácidos con +3, +5; óxidos neutros con +1, +2, +4)
  * Fósforo (P), Arsénico (As): +1, +3, +5 (anfóteros/polihidratados)
  * Azufre (S), Selenio (Se), Teluro (Te): -2 (hidruros/sales); +2, +4, +6 (óxidos/ácidos)
  * Cloro (Cl), Bromo (Br), Yodo (I): -1 (haloideos); +1, +3, +5, +7 (oxácidos)
* **Elementos de Comportamiento Anfótero (Metales que actúan como no metales):**
  * Manganeso (Mn):
    * Como metal (óxidos básicos / sales): +2, +3 (MnO, Mn_2O_3).
    * Como no metal (anhídridos / oxácidos): +4, +6, +7 (MnO_2, H_2MnO_4, HMnO_4).
  * Cromo (Cr):
    * Como metal: +2, +3 (CrO, Cr_2O_3).
    * Como no metal: +6 (CrO_3 \to H_2CrO_4 [ácido crómico], H_2Cr_2O_7 [ácido dicrómico]).
  * Vanadio (V): Como metal +2, +3; como no metal +4, +5.

### 3.4. Sistemas de Nomenclatura Química
1. **Nomenclatura Tradicional o Clásica:** Emplea prefijos y sufijos según la cantidad de E.O.:
   * 1 solo E.O.: Sufijo **-ico** (o nombre del elemento).
   * 2 E.O.: Menor \to **-oso** ; Mayor \to **-ico**.
   * 3 E.O.: Mínimo \to **hipo- ... -oso** ; Intermedio \to **-oso** ; Máximo \to **-ico**.
   * 4 E.O.:
     - Mínimo (+1): **hipo- ... -oso**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. RADICALES INORGÁNICOS MÁS IMPORTANTES
* Cl^-: Cloruro
* ClO^-: Hipoclorito
* ClO_2^-: Clorito
* ClO_3^-: Clorato
* ClO_4^-: Perclorato
* S^{2-}: Sulfuro
* SO_3^{2-}: Sulfito
* SO_4^{2-}: Sulfato

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t06_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Confundir Ácido Fosforoso con Ácido Fosfórico. El fósforo (P) tiene E.O. +1, +3, +5. El ácido fosforoso usa +3: H_3PO_{\\frac{3+3}{2}} = H_3PO_3. El ácido fosfóric\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t06_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Nombrar HCl_{(g)} como ácido clorhídrico. FALSO. En fase gaseosa se nombra según IUPAC como cloruro de hidrógeno. Solo adquiere el nombre de ácido clorhídrico cuando se\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t06_s01_c03",
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
                    id = "quim_t06_s01_c04",
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
                    id = "quim_t06_s01_c05",
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
                    id = "quim_t06_s01_c06",
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
                    id = "quim_t06_s01_c07",
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
                    id = "quim_t06_s01_c08",
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
                    id = "quim_t06_s01_c09",
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
                    id = "quim_t06_s01_c10",
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
            id = "quim_t06_s02",
            title = "Nomenclatura Química Inorgánica - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Nomenclatura Química Inorgánica - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     - Menor (+3): **-oso**
     - Mayor (+5): **-ico**
     - Máximo (+7): **per- ... -ico** (o hiper-...-ico).
2. **Nomenclatura Stock:** Indica la función seguida del nombre del elemento y su E.O. entre paréntesis en números romanos (ej. Óxido de hierro (III)). Si tiene un solo E.O. no se coloca el número romano.
3. **Nomenclatura Sistemática o IUPAC:** Utiliza prefijos numerales griegos (mono, di, tri, tetra, penta, hexa, hepta) para indicar la cantidad de átomos de cada elemento presentes en la fórmula (ej. Trióxido de dihierro).

### 3.5. Formulación Sistemática de Funciones Inorgánicas

#### A. Óxidos
1. **Óxidos Básicos (Metálicos):** \text{Metal} + O^{2-} \to M_2O_x
   * Ejemplos: Na_2O (óxido de sodio), FeO (óxido ferroso / óxido de hierro (II)), Fe_2O_3 (óxido férrico / óxido de hierro (III) / trióxido de dihierro).
2. **Óxidos Ácidos (Anhídridos):** \text{No Metal} + O^{2-} \to NM_2O_x
   * Ejemplos: Cl_2O (anhídrido hipocloroso), Cl_2O_7 (anhídrido perclórico), SO_2 (anhídrido sulfuroso), SO_3 (anhídrido sulfúrico).
3. **Peróxidos:** Metal (IA o IIA) + O_2^{2-}. El grupo peroxo (-O-O-) no se simplifica.
   * Ejemplos: H_2O_2 (peróxido de hidrógeno / agua oxigenada), Na_2O_2 (peróxido de sodio), BaO_2 (peróxido de bario).

#### B. Hidróxidos (Bases)
Formados por catión metálico y el ión hidróxido o hidroxilo (OH^-):
M^{x+} + (OH)^- \to M(OH)_x
* Ejemplos: NaOH (hidróxido de sodio / soda cáustica), Ca(OH)_2 (hidróxido de calcio / cal apagada), Al(OH)_3 (hidróxido de aluminio).

#### C. Ácidos
1. **Ácidos Hidrácidos:** Soluciones acuosas de los hidruros no metálicos de los grupos VIA (S, Se, Te con valencia 2) y VIIA (F, Cl, Br, I con valencia 1).
   * Fórmula: H_x NM_{(ac)} (Terminación: **-hídrico**).
   * Ejemplos: HCl_{(ac)} (ácido clorhídrico), H_2S_{(ac)} (ácido sulfhídrico), HBr_{(ac)} (ácido bromhídrico).
   * *Ojo:* En fase gaseosa pura son hidruros y terminan en **-uro**: HCl_{(g)} es cloruro de hidrógeno.
2. **Ácidos Oxácidos Normales:** \text{Anhídrido} + H_2O \to \text{Ácido Oxácido}.
   * **Fórmula Directa Rápida (H_a NM O_b):**
     * Si el E.O. del no metal es **impar**:
       H_1 NM O_{\frac{E.O. + 1}{2}} \quad \text{Ejemplo: } N^{+5} \to HNO_{\frac{5+1}{2}} = HNO_3 \text{ (ácido nítrico)}
     * Si el E.O. del no metal es **par**:
       H_2 NM O_{\frac{E.O. + 2}{2}} \quad \text{Ejemplo: } S^{+6} \to H_2SO_{\frac{6+2}{2}} = H_2SO_4 \text{ (ácido sulfúrico)}
     * Si el no metal es B, P, As, Sb (elementos que forman ácidos **orto** de forma natural con 3H_2O):
       H_3 NM O_{\frac{E.O. + 3}{2}} \quad \text{Ejemplo: } P^{+5} \to H_3PO_{\frac{5+3}{2}} = H_3PO_4 \text{ (ácido fosfórico)}
3. **Poliácidos (Diácidos):** 2 \times (\text{Ácido simple}) - H_2O.
   * Ejemplo: 2 \times H_2CrO_4 - H_2O = H_2Cr_2O_7 (ácido dicrómico).

#### D. Sales
Se obtienen por la reacción de neutralización entre un ácido y una base (hidróxido):
\text{Ácido} + \text{Hidróxido} \to \text{Sal} + H_2O
* **Cambio de sufijos de Nomenclatura Clásica:**
  \textbf{"OSO por ITO, ICO por ATO, HÍDRICO por URO"}
  *(Mnemotecnia: "El pato pico de oso chiquito con silbato de hidruro")*.
1. **Sales Haloideas (Derivan de Ácidos Hidrácidos, sin oxígeno):**
   * *Neutra:* NaCl (cloruro de sodio), FeS (sulfuro ferroso), CaCl_2 (cloruro de calcio).
   * *Ácida:* Contiene hidrógenos sustituibles: NaHS (bisulfuro de sodio o sulfuro ácido de sodio).
2. **Sales Oxisales (Derivan de Ácidos Oxácidos, con oxígeno):**
   * *Neutra:* CaCO_3 (carbonato de calcio), KMnO_4 (permanganato de potasio), CuSO_4 (sulfato cúprico).
   * *Ácida:* NaHCO_3 (bicarbonato de sodio o carbonato ácido de sodio), NaH_2PO_4 (dihidrógeno fosfato de sodio).
   * *Básica:* Contiene iones OH^-: Al(OH)SO_4 (sulfato básico de aluminio).
   * *Doble:* Contiene dos cationes metálicos diferentes: KNaSO_4 (sulfato de potasio y sodio).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
* NO_2^-: Nitrito
* NO_3^-: Nitrato
* CO_3^{2-}: Carbonato
* PO_4^{3-}: Fosfato
* Cr_2O_7^{2-}: Dicromato
* MnO_4^-: Permanganato

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **La Rima de las Sales:**
  * *"Cuando el **OSO** toca el **PITO**, el mono toca el **PICO** de un gran can**ATO**; y el **HÍDRICO** corre al muro gritando soy **URO**"*.
    - **-oso** \to **-ito**
    - **-ico** \to **-ato**
    - **-hídrico** \to **-uro**
* **Mnemotecnia Ácidos Especiales (P, As, Sb, B):**
  * Para estos 4 elementos, el ácido habitual siempre es el **ORTO** (3H_2O), por lo que no es obligatorio poner el prefijo orto: "Ácido fosfórico" es directamente el ortofosfórico (H_3PO_4).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir Ácido Fosforoso con Ácido Fosfórico.** El fósforo (P) tiene E.O. +1, +3, +5. El ácido fosforoso usa +3: H_3PO_{\frac{3+3}{2}} = H_3PO_3. El ácido fosfórico usa +5: H_3PO_{\frac{5+3}{2}} = H_3PO_4. Ojo: ambos llevan 3 hidrógenos en su fórmula.
* **Trampa 2: Nombrar HCl_{(g)} como ácido clorhídrico.** FALSO. En fase gaseosa se nombra según IUPAC como **cloruro de hidrógeno**. Solo adquiere el nombre de ácido clorhídrico cuando se disuelve en agua (HCl_{(ac)}).
* **Trampa 3: Asignar al Manganeso función básica en el KMnO_4.** En el permanganato de potasio, el manganeso actúa con su máximo estado de oxidación no metálico +7, formando una sal oxisal neutra ácida de transición.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t06_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Asignar al Manganeso función básica en el KMnO_4. En el permanganato de potasio, el manganeso actúa con su máximo estado de oxidación no metálico +7, formando una sal\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t06_s02_c02",
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
                    id = "quim_t06_s02_c03",
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
                    id = "quim_t06_s02_c04",
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
                    id = "quim_t06_s02_c05",
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
                    id = "quim_t06_s02_c06",
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
                    id = "quim_t06_s02_c07",
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
                    id = "quim_t06_s02_c08",
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
                    id = "quim_t06_s02_c09",
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
                    id = "quim_t06_s02_c10",
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
