package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana07 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t07_s01",
            title = "Reacciones Químicas y Balanceo de Ecuaciones - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Reacciones Químicas y Balanceo de Ecuaciones - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química y Procesos de Transformación
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Balance redox por ión-electrón en medio ácido/básico)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.7 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         REACCIONES QUÍMICAS
                                  │
         ┌────────────────────────┴────────────────────────┐
         ▼                                                 ▼
CLASIFICACIÓN GENERAL                             REACCIONES REDOX (ÓXIDO-REDUCCIÓN)
• Por el mecanismo o reagrupamiento:               • Transferencia de electrones
  - Síntesis / Adición                             • Oxidación: Pérdida de e- (Aumenta E.O.)
  - Descomposición                                   -> Agente Reductor / Forma Oxidada
  - Desplazamiento Simple                           • Reducción: Ganancia de e- (Disminuye E.O.)
  - Doble Desplazamiento (Metátesis)                 -> Agente Oxidante / Forma Reducida
• Por la energía térmica:                         • Dismutación / Desproporción
  - Exotérmicas (\Delta H < 0)                           │
  - Endotérmicas (\Delta H > 0)                          ▼
• Por la reversibilidad:                          MÉTODOS DE BALANCEO
  - Irreversibles (\to)                          • Método del Tanteo / Simple Inspección
  - Reversibles (\rightleftharpoons)            • Método Algebraico
                                                   • Método del Estado de Oxidación (Redox simple)
                                                   • Método del Ión-Electrón:
                                                     - Medio Ácido (balance con H^+ y H_2O)
                                                     - Medio Básico (balance con OH^- y H_2O)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición y Evidencias de una Reacción Química
Una reacción química es un proceso termodinámico en el cual una o más sustancias (reactivos o reactantes) rompen sus enlaces intramoleculares y reorganizan sus átomos mediante colisiones efectivas para constituir nuevas sustancias (productos) con propiedades físicas y químicas totalmente distintas.
* **Evidencias Experimentales Macroscópicas:**
  1. Desprendimiento de gas (burbujeo persistente).
  2. Liberación o absorción espontánea de energía térmica (cambio de temperatura).
  3. Formación de un precipitado insoluble en solución acuosa.
  4. Cambio perceptible e irreversible de color, olor o sabor.
  5. Emisión de luz o energía electromagnética (quimioluminiscencia / combustión).

### 3.2. Clasificación Sistemática de las Reacciones Químicas

#### A. Por la Forma de Reagrupamiento Atómico
1. **Reacción de Síntesis, Combinación o Adición:** Dos o más reactantes forman un único producto:
   A + B \to AB \quad \text{Ejemplo: } N_{2(g)} + 3H_{2(g)} \to 2NH_{3(g)} \text{ (Proceso Haber-Bosch)}
2. **Reacción de Descomposición:** Un único reactante se fragmenta en dos o más sustancias más simples mediante el suministro de energía externa (calor, electricidad o luz):
   * *Pirólisis (por calor, \Delta):* 2KClO_{3(s)} \xrightarrow{\Delta, MnO_2} 2KCl_{(s)} + 3O_{2(g)}
   * *Electrólisis (por corriente eléctrica):* 2H_2O_{(l)} \xrightarrow{\text{electricidad}} 2H_{2(g)} + O_{2(g)}
   * *Fotólisis (por luz, h\nu):* 2H_2O_2 \xrightarrow{h\nu} 2H_2O + O_2
3. **Reacción de Desplazamiento Simple o Sustitución:** Un elemento químico libre más activo desplaza a otro menos activo en un compuesto, liberándolo:
   A + BC \to AC + B \quad \text{Ejemplo: } Zn_{(s)} + 2HCl_{(ac)} \to ZnCl_{2(ac)} + H_{2(g)}\uparrow
   * Se rige por la **Serie Electroquímica de Actividad Metálica**:
     Li > K > Ba > Ca > Na > Mg > Al > Zn > Fe > Ni > Sn > Pb > \mathbf{H} > Cu > Hg > Ag > Pt > Au
     *(Los metales a la izquierda del H desplazan al hidrógeno de los ácidos diluidos; los metales nobles a la derecha no reaccionan con ácidos hidrácidos ordinarios)*.
4. **Reacción de Doble Desplazamiento o Metátesis:** Dos compuestos en solución acuosa intercambian iones sin alterar sus estados de oxidación:
   AB + CD \to AD + CB
   * *Precipitación:* AgNO_{3(ac)} + NaCl_{(ac)} \to AgCl_{(s)}\downarrow (\text{blanco}) + NaNO_{3(ac)}
   * *Neutralización Ácido-Base:* HCl_{(ac)} + NaOH_{(ac)} \to NaCl_{(ac)} + H_2O_{(l)}

#### B. Por la Variación de Entalpía (\Delta H)
1. **Reacción Exotérmica (\Delta H < 0):** Libera calor al entorno. La entalpía de los productos es menor que la de los reactantes (H_{\text{productos}} < H_{\text{reactantes}}):
   A + B \to C + D + \text{Calor} \quad (\Delta H = -)
   * Todas las reacciones de combustión, neutralización y respiración celular son exotérmicas.
2. **Reacción Endotérmica (\Delta H > 0):** Absorbe calor del entorno. La entalpía de los productos es mayor que la de los reactantes (H_{\text{productos}} > H_{\text{reactantes}}):
   A + B + \text{Calor} \to C + D \quad (\Delta H = +)
   * Fotosíntesis, descomposición térmica de carbonatos (CaCO_3 \xrightarrow{\Delta} CaO + CO_2).

#### C. Reacciones de Combustión
Reacción redox exotérmica violenta entre un hidrocarburo (combustible) y el oxígeno gaseoso (comburente):
1. **Combustión Completa (Exceso de O_2):** Llama azulada pálida no luminosa y caliente. Produce únicamente dióxido de carbono y vapor de agua:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. AGENTES REDOX TÍPICOS DE ADMISIÓN
* **Agentes Oxidantes Fuertes:** Permanganato de potasio (KMnO_4), Dicromato de potasio (K_2Cr_2O_7), Ácido nítrico concentrado (HNO_3), Peróxido de hidrógeno (H_2O_2), Halógenos libres (Cl_2, Br_2).
* **Agentes Reductores Típicos:** Metales activos (Zn, Fe, Na), Ácido sulfhídrico (H_2S), Monóxido de carbono (CO), Ión yoduro (I^-), Dióxido de azufre (SO_2).

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t07_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Confundir Agente Oxidante con Forma Oxidada. El Agente Oxidante siempre se encuentra en los reactantes (sustancia completa antes de reaccionar). La Forma Oxidada es el pr\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t07_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Disociar especies insolubles o covalentes en ión-electrón. No se deben disociar óxidos (MnO_2), precipitados (AgCl, BaSO_4), gases (CO_2, H_2) ni agua (H_2O). Sol\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t07_s01_c03",
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
                    id = "quim_t07_s01_c04",
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
                    id = "quim_t07_s01_c05",
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
                    id = "quim_t07_s01_c06",
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
                    id = "quim_t07_s01_c07",
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
                    id = "quim_t07_s01_c08",
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
                    id = "quim_t07_s01_c09",
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
                    id = "quim_t07_s01_c10",
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
            id = "quim_t07_s02",
            title = "Reacciones Químicas y Balanceo de Ecuaciones - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Reacciones Químicas y Balanceo de Ecuaciones - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   C_xH_y + \left(x + \frac{y}{4}\right)O_2 \to x CO_2 + \frac{y}{2} H_2O + \text{Calor}
2. **Combustión Incompleta (Deficiencia de O_2):** Llama amarilla luminosa con emisión de hollín (carbono sólido particulado, C) y monóxido de carbono tóxico (CO):
   C_xH_y + O_2 \to CO + C + H_2O

### 3.3. Procesos de Óxido-Reducción (Redox)
Se basan en la transferencia simultánea de electrones:
1. **Oxidación:** Proceso en el cual una especie química **pierde electrones**, manifestando un **aumento algebraico en su estado de oxidación**:
   A^0 \to A^{n+} + n e^-
   * La sustancia que se oxida actúa como **Agente Reductor** (provoca la reducción de la otra) y tras la reacción se convierte en la **Forma Oxidada**.
2. **Reducción:** Proceso en el cual una especie química **gana electrones**, manifestando una **disminución algebraica en su estado de oxidación**:
   B^{m+} + m e^- \to B^0
   * La sustancia que se reduce actúa como **Agente Oxidante** (provoca la oxidación de la otra) y se convierte en la **Forma Reducida**.
3. **Reacción de Dismutación o Desproporción (Autoredox):** Un mismo elemento en un mismo estado de oxidación inicial se oxida y se reduce simultáneamente en la misma reacción:
   Cl_2^0 + 2NaOH \to NaCl^{-1} + NaCl^{+1}O + H_2O

### 3.4. Métodos de Balanceo de Ecuaciones Químicas
El balanceo asegura el cumplimiento estricto de la **Ley de Conservación de la Masa de Lavoisier** y la **Ley de Conservación de la Carga Eléctrica**.

#### A. Método de Estados de Oxidación (Redox Clásico)
1. Asignar los E.O. de todos los elementos.
2. Identificar el elemento que se oxida y el que se reduce.
3. Plantear las semirreacciones y calcular los electrones perdidos y ganados por átomo (multiplicando por los subíndices de la molécula).
4. Multiplicar las semirreacciones por factores mínimos para igualar electrones ganados y perdidos:
   \sum e^- \text{ ganados} = \sum e^- \text{ perdidos}
5. Trasladar los coeficientes a la ecuación principal y terminar el balance de metales, no metales, hidrógenos y oxígenos por tanteo simple.

#### B. Método del Ión-Electrón (Para Reacciones Iónicas en Solución Acuosa)
1. **En Medio Ácido:**
   * Separar en semirreacciones iónicas (solo se disocian electrolitos fuertes: ácidos, bases fuertes y sales solubles; no se disocian óxidos, gases ni agua).
   * Balancear átomos distintos de H y O.
   * Balancear oxígenos: por cada átomo de oxígeno que falte en un lado, agregar una molécula de agua (H_2O) en ese lado.
   * Balancear hidrógenos: agregar iones hidrógeno (H^+) en el lado deficitario.
   * Balancear carga neta agregando electrones (e^-).
   * Igualar electrones, sumar y simplificar.
2. **En Medio Básico:**
   * Seguir los pasos de medio ácido hasta obtener la ecuación neta final.
   * Por cada ión H^+ presente en la ecuación balanceada, sumar en **ambos miembros** la misma cantidad de iones hidróxido (OH^-).
   * En el miembro donde coinciden H^+ y OH^-, combinarlos para formar moléculas de agua (H^+ + OH^- \to H_2O).
   * Cancelar las moléculas de agua repetidas a ambos lados.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Redox:** **"LEO dice GER"**
  * **L**oss of **E**lectrons is **O**xidation (**LEO** = Pierde electrones \to Oxidación \to Agente Reductor).
  * **G**ain of **E**lectrons is **R**eduction (**GER** = Gana electrones \to Reducción \to Agente Oxidante).
* **Mnemotecnia de Orden de Tanteo:** **"M - NM - H - O"**
  * Primero balancea los **M**etales.
  * Segundo balancea los **N**o **M**etales.
  * Tercero balancea los **H**idrógenos.
  * Por último, el **O**xígeno se balancea solo y sirve como comprobador infalible.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir Agente Oxidante con Forma Oxidada.** El **Agente Oxidante** siempre se encuentra en los **reactantes** (sustancia completa antes de reaccionar). La **Forma Oxidada** es el producto resultante de la oxidación en el lado derecho.
* **Trampa 2: Disociar especies insolubles o covalentes en ión-electrón.** No se deben disociar óxidos (MnO_2), precipitados (AgCl, BaSO_4), gases (CO_2, H_2) ni agua (H_2O). Solo se disocian especies en fase acuosa iónica (ac).
* **Trampa 3: "Toda reacción de doble desplazamiento es redox".** FALSO CRÍTICO. Las reacciones de metátesis (precipitación y neutralización ácido-base) **NUNCA** son redox; los estados de oxidación de todos los elementos permanecen invariables.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t07_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"Toda reacción de doble desplazamiento es redox\". FALSO CRÍTICO. Las reacciones de metátesis (precipitación y neutralización ácido-base) NUNCA son redox; los estados de o\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t07_s02_c02",
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
                    id = "quim_t07_s02_c03",
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
                    id = "quim_t07_s02_c04",
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
                    id = "quim_t07_s02_c05",
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
                    id = "quim_t07_s02_c06",
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
                    id = "quim_t07_s02_c07",
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
                    id = "quim_t07_s02_c08",
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
                    id = "quim_t07_s02_c09",
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
                    id = "quim_t07_s02_c10",
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
