package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana13 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t13_s01",
            title = "Electroquímica - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Electroquímica - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química / Conversión de Energía Química y Eléctrica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Leyes cuantitativas de Faraday, Celdas Galvánicas, Potenciales Estándar y Espontaneidad)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.3 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ELECTROQUÍMICA
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
   CELDAS ELECTROLÍTICAS                                  CELDAS GALVÁNICAS O VOLTAICAS
(Energía Eléctrica -> Química / No espontánea)         (Energía Química -> Eléctrica / Espontánea)
         │                                                       │
• Electrólisis (sales fundidas y en solución acuosa)    • Pila de Daniell (Zn / Cu)
• Electrodos:                                           • Puente Salino (KCl, KNO_3)
  - Ánodo (+) -> Oxidación                              • Electrodos:
  - Cátodo (-) -> Reducción                               - Ánodo (-) -> Oxidación
         │                                                - Cátodo (+) -> Reducción
         ▼                                                       │
LEYES DE MICHAEL FARADAY                                         ▼
• 1.ª Ley:  m = \frac{PE \cdot I \cdot t}{96\,500}    POTENCIALES ESTÁNDAR (E^\circ)
• 2.ª Ley:  \frac{m_1}{PE_1} = \frac{m_2}{PE_2}       • Fuerza Electromotriz:  E^\circ_{\text{celda}} = E^\circ_{\text{cátodo}} - E^\circ_{\text{ánodo}}
• Constante: 1\text{ Faraday} = 96\,500\text{ C} \approx 1\text{ mol } e^- • Espontaneidad:  \Delta G^\circ = -n F E^\circ_{\text{celda}} < 0 \iff E^\circ_{\text{celda}} > 0
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición y Clasificación de Celdas Electroquímicas
La Electroquímica estudia la interconversión entre la energía química de las reacciones redox y la energía eléctrica de una corriente de electrones:
1. **Celda Electrolítica:** Sistema no espontáneo (\Delta G > 0) donde una corriente eléctrica continua externa (suministrada por una fuente o batería) induce una reacción química forzada de óxido-reducción.
2. **Celda Galvánica o Voltaica:** Dispositivo espontáneo (\Delta G < 0) que genera corriente eléctrica continua útil a partir de una reacción redox que ocurre de manera natural.

### 3.2. Celdas Electrolíticas y Electrólisis
Consta de una cuba o celda, un electrolito (sales o hidróxidos fundidos o en disolución acuosa) y dos electrodos sumergidos conectados a los polos de una fuente de corriente continua:
* **Ánodo (Polo Positivo, +):** Conectado al polo positivo de la fuente. Atrae a los aniones (A^-). En su superficie ocurre la **OXIDACIÓN** (pérdida de electrones).
* **Cátodo (Polo Negativo, -):** Conectado al polo negativo de la fuente. Atrae a los cationes (C^+). En su superficie ocurre la **REDUCCIÓN** (ganancia de electrones).
* *Regla Mnemotécnica Universal:* **"AN-OX y CAT-RED"**
  - **Án**odo \to **Ox**idación.
  - **Cát**odo \to **Red**ucción.
  *(Válido absolutamente para celdas electrolíticas y para celdas galvánicas)*.

#### A. Electrólisis de Sales Fundidas
Ejemplo clásico: Electrólisis del Cloruro de Sodio fundido (NaCl_{(l)} seco a 801^\circ\text{C}):
* Disociación: NaCl_{(l)} \to Na^+ + Cl^-
* Ánodo (+): 2Cl^- \to Cl_{2(g)}\uparrow + 2e^- (Oxidación, se desprende gas cloro).
* Cátodo (-): 2Na^+ + 2e^- \to 2Na_{(l)} (Reducción, se deposita sodio metálico líquido).
* Ecuación global: 2NaCl_{(l)} \xrightarrow{\text{electrólisis}} 2Na_{(l)} + Cl_{2(g)}\uparrow

#### B. Electrólisis de Soluciones Acuosas (Competencia con el Agua)
En disolución acuosa, las moléculas de agua compiten con los iones del soluto en las semirreacciones:
* **En el Cátodo (Competencia de Reducción):**
  * Si el catión es de metales muy reactivos (Grupos IA, IIA y Al^{3+}), estos iones **NO se reducen** en agua; en su lugar, el agua se reduce liberando **gas hidrógeno (H_2)**:
    2H_2O_{(l)} + 2e^- \to H_{2(g)}\uparrow + 2OH^-_{(ac)}
  * Los cationes de metales menos activos (Cu^{2+}, Ag^+, Au^{3+}, Ni^{2+}, Sn^{2+}, Pb^{2+}) sí se reducen y se depositan como metal puro sobre el cátodo.
* **En el Ánodo (Competencia de Oxidación):**
  * Los aniones oxigenados estables (SO_4^{2-}, NO_3^-, CO_3^{2-}, ClO_4^-) y el fluoruro (F^-) **NO se oxidan**; en su lugar, el agua se oxida liberando **gas oxígeno (O_2)**:
    2H_2O_{(l)} \to O_{2(g)}\uparrow + 4H^+_{(ac)} + 4e^-
  * Los aniones no oxigenados (Cl^-, Br^-, I^-) se oxidan preferentemente frente al agua produciendo Cl_2, Br_2, I_2.

### 3.3. Leyes Cuantitativas de Michael Faraday (1833)

#### A. Primera Ley de Faraday
"La masa de una sustancia que se deposita o libera en un electrodo durante la electrólisis es directamente proporcional a la cantidad total de carga eléctrica (Q) que atraviesa la celda":
m \propto Q \implies m = \frac{PE}{F} \cdot Q = \frac{PE \cdot I \cdot t}{96\,500}
Donde:
* m: Masa depositada o desprendida en gramos (g).
* Q: Carga eléctrica en Culombios (C). Se cumple: Q = I \cdot t.
* I: Intensidad de corriente eléctrica en Amperios (A).

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. SIGNOS DE LOS ELECTRODOS SEGÚN EL TIPO DE CELDA
| Tipo de Celda | Ánodo (Proceso) | Cátodo (Proceso) | Flujo de Electrones |
| :--- | :---: | :---: | :---: |
| **Celda Electrolítica** | **Positivo (+)** (Oxidación) | **Negativo (-)** (Reducción) | Del Ánodo al Cátodo (por la fuente) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t13_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Multiplicar el valor del potencial E^\\circ por el coeficiente estequiométrico. ERROR CLÁSICO GRAVE. El potencial eléctrico E^\\circ es una propiedad intensiva; si mult\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t13_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Usar minutos u horas en las leyes de Faraday. En m = \\frac{PE \\cdot I \\cdot t}{96\\,500}, el tiempo t DEBE convertirse obligatoriamente a segundos (s).\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t13_s01_c03",
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
                    id = "quim_t13_s01_c04",
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
                    id = "quim_t13_s01_c05",
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
                    id = "quim_t13_s01_c06",
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
                    id = "quim_t13_s01_c07",
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
                    id = "quim_t13_s01_c08",
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
                    id = "quim_t13_s01_c09",
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
                    id = "quim_t13_s01_c10",
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
            id = "quim_t13_s02",
            title = "Electroquímica - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Electroquímica - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* t: Tiempo transcurrido en segundos (s).
* PE: Peso Equivalente de la sustancia liberada:
  PE = \frac{\overline{P.A.}}{\theta} \quad (\theta = \text{valencia o electrones transferidos por átomo})
* F: Constante de Faraday:
  1\text{ Faraday } (1\text{ F}) = 96\,485\text{ C/mol } e^- \approx 96\,500\text{ C} \equiv 1\text{ mol de electrones}

#### B. Segunda Ley de Faraday
"Cuando la misma cantidad de carga eléctrica atraviesa varias celdas electrolíticas conectadas en serie, las masas de las diferentes sustancias depositadas o liberadas en los electrodos son directamente proporcionales a sus respectivos pesos equivalentes":
\frac{m_1}{PE_1} = \frac{m_2}{PE_2} = \frac{m_3}{PE_3} = \dots = \#Eq\text{-}g = \frac{Q}{96\,500}

### 3.4. Celdas Galvánicas o Voltaicas (Pilas)
Transforman una reacción redox espontánea en energía eléctrica continua. El prototipo es la **Pila de Daniell (1836)**:
* **Semicelda Anódica (Oxidación):** Electrodo de Zinc sumergido en ZnSO_4 \ 1\text{ M}.
  Zn_{(s)} \to Zn^{2+}_{(ac)} + 2e^- \quad (\text{Ánodo, Polo Negativo, }-)
  *(La barra de zinc pierde masa al disolverse)*.
* **Semicelda Catódica (Reducción):** Electrodo de Cobre sumergido en CuSO_4 \ 1\text{ M}.
  Cu^{2+}_{(ac)} + 2e^- \to Cu_{(s)} \quad (\text{Cátodo, Polo Positivo, }+)
  *(La barra de cobre gana masa al depositarse el metal)*.
* **Circuito Externo:** Los electrones fluyen espontáneamente por el cable metálico desde el **Ánodo (- hacia el Cátodo (+))**.
* **Puente Salino (Tubo en U con gel agar-agar y KCl o KNO_3):**
  1. Cierra el circuito eléctrico permitiendo la migración iónica.
  2. Mantiene la neutralidad eléctrica en ambas soluciones (los aniones Cl^- viajan al ánodo para neutralizar el exceso de Zn^{2+}; los cationes K^+ viajan al cátodo para compensar el consumo de Cu^{2+}).
* **Notación Convencional de la Pila (Diagrama de Celda IUPAC):**
  \text{Ánodo} \mid \text{Electrolito Anódico} \parallel \text{Electrolito Catódico} \mid \text{Cátodo}
  Zn_{(s)} \mid Zn^{2+}_{(ac)} (1\text{ M}) \parallel Cu^{2+}_{(ac)} (1\text{ M}) \mid Cu_{(s)}

### 3.5. Potencial Estándar de Celda (E^\circ_{\text{celda}}) y Espontaneidad
El potencial estándar de reducción (E^\circ) se mide a condiciones estándar (25^\circ\text{C}, 1\text{ atm}, 1\text{ M}) frente al **Electrodo Estándar de Hidrógeno (EEH)**, al cual se le asigna arbitrariamente:
2H^+_{(ac)} (1\text{ M}) + 2e^- \rightleftharpoons H_{2(g)} (1\text{ atm}) \quad ; \quad E^\circ = 0.00\text{ V}

* **Fuerza Electromotriz de la Celda (FEM = E^\circ_{\text{celda}}):**
  E^\circ_{\text{celda}} = E^\circ_{\text{reducción}}(\text{Cátodo}) - E^\circ_{\text{reducción}}(\text{Ánodo})
  *(Ambos potenciales tomados estrictamente como potenciales estándar de reducción de tablas)*.
* **Criterio de Espontaneidad:**
  Una reacción redox es espontánea si el potencial de celda es estrictamente positivo:
  \Delta G^\circ = -n \cdot F \cdot E^\circ_{\text{celda}}
  * Si E^\circ_{\text{celda}} > 0 \implies \Delta G^\circ < 0 \implies Proceso **Espontáneo** (Celda Galvánica).
  * Si E^\circ_{\text{celda}} = 0 \implies \Delta G^\circ = 0 \implies Sistema en **Equilibrio** (Pila agotada).
  * Si E^\circ_{\text{celda}} < 0 \implies \Delta G^\circ > 0 \implies Proceso **No Espontáneo** (Requiere electrólisis).

* **Regla de Predicción:** La especie química con el potencial estándar de reducción más positivo (E^\circ_{\text{red}} mayor) tiene mayor avidez por electrones, por lo que **se reduce obligatoriamente en el cátodo** y actúa como mejor agente oxidante. La especie con menor E^\circ_{\text{red}} se invierte y **se oxida en el ánodo**.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Celda Galvánica (Pila)** | **Negativo (-)** (Oxidación) | **Positivo (+)** (Reducción) | Del Ánodo al Cátodo (espontáneo) |

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Universal de Electrodos:**
  * **"AN-OX y CAT-RED"**:
    * **Án**odo \to **Ox**idación.
    * **Cát**odo \to **Red**ucción.
* **Mnemotecnia Signos en Pilas:**
  * En una Pila Galvánica: **"Ánodo es Negativo (P-A-N: Pila Ánodo Negativo)"**.
* **Hacking de Carga Eléctrica:**
  * 1\text{ mol de electrones} = 1\text{ Faraday} = 96\,500\text{ Culombios} = 1\text{ Equivalente-gramo}.
  * Con esta igualdad resuelves cualquier problema de electrólisis por regla de tres directa sin memorizar fórmulas complejas.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Multiplicar el valor del potencial E^\circ por el coeficiente estequiométrico.** ERROR CLÁSICO GRAVE. El potencial eléctrico E^\circ es una **propiedad intensiva**; si multiplicas una semirreacción por 2 o 3 para balancear electrones, el valor de E^\circ NO se multiplica (permanece idéntico).
* **Trampa 2: Usar minutos u horas en las leyes de Faraday.** En m = \frac{PE \cdot I \cdot t}{96\,500}, el tiempo t DEBE convertirse obligatoriamente a **segundos (s)**.
* **Trampa 3: Creer que el sodio se deposita al electrolizar salmuera (NaCl_{(ac)}).** En solución acuosa, el agua se reduce con mucha mayor facilidad que el Na^+ (E^\circ_{H_2O/H_2} = -0.83\text{ V} > E^\circ_{Na^+/Na} = -2.71\text{ V}), desprendiéndose gas hidrógeno (H_2) en el cátodo y formándose NaOH.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t13_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Creer que el sodio se deposita al electrolizar salmuera (NaCl_{(ac)}). En solución acuosa, el agua se reduce con mucha mayor facilidad que el Na^+ (E^\\circ_{H_2O/H_2\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t13_s02_c02",
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
                    id = "quim_t13_s02_c03",
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
                    id = "quim_t13_s02_c04",
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
                    id = "quim_t13_s02_c05",
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
                    id = "quim_t13_s02_c06",
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
                    id = "quim_t13_s02_c07",
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
                    id = "quim_t13_s02_c08",
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
                    id = "quim_t13_s02_c09",
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
                    id = "quim_t13_s02_c10",
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
