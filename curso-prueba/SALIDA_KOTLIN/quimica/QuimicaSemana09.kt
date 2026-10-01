package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana09 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t09_s01",
            title = "Estado Gaseoso y Mezclas de Gases - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Estado Gaseoso y Mezclas de Gases - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química del Estado Gaseoso
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Ecuación universal, procesos restringidos, presiones parciales y difusión de Graham)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.4 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ESTADO GASEOSO
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
TEORÍA CINÉTICO-MOLECULAR (TCM)                         LEYES DE LOS GASES IDEALES
• Choques perfectamente elásticos                       • Ley de Boyle-Mariotte (T = \text{cte}, Isotérmico)
• Volumen molecular despreciable                        • Ley de Charles (P = \text{cte}, Isobárico)
• Sin fuerzas intermoleculares (F_a = F_r = 0)        • Ley de Gay-Lussac (V = \text{cte}, Isocórico)
• E_k \propto T (Kelvin)                               • Ecuación Combinada: \frac{P_1 V_1}{T_1} = \frac{P_2 V_2}{T_2}
                                                                 │
         ┌───────────────────────────────────────────────────────┘
         ▼
ECUACIÓN UNIVERSAL DE LOS GASES:  P \cdot V = n \cdot R \cdot T
• Densidad de un gas:  P \cdot \overline{M} = \rho \cdot R \cdot T
• Constante Universal (R):
  - R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})
  - R = 62.4\text{ mmHg}\cdot\text{L}/(\text{mol}\cdot\text{K})
  - R = 8.314\text{ J}/(\text{mol}\cdot\text{K})
         │
         ▼
MEZCLAS DE GASES Y DIFUSIÓN
• Ley de las Presiones Parciales de Dalton:  P_{\text{total}} = \sum P_i  ;  P_i = x_i \cdot P_{\text{total}}
• Ley de los Volúmenes Parciales de Amagat:  V_{\text{total}} = \sum V_i  ;  V_i = x_i \cdot V_{\text{total}}
• Masa Molar Aparente de la Mezcla:  \overline{M}_{\text{mezcla}} = \sum (x_i \cdot \overline{M}_i)
• Ley de Efusión y Difusión de Graham:  \frac{v_1}{v_2} = \sqrt{\frac{\overline{M}_2}{\overline{M}_1}}
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Postulados de la Teoría Cinético-Molecular de los Gases Ideales (Clausius, Maxwell, Boltzmann)
Un gas real se aproxima al comportamiento de un **gas ideal** a condiciones de **baja presión (P \to 0)** y **alta temperatura (T \gg 0)**:
1. Los gases están constituidos por partículas puntiformes pequeñísimas (moléculas o átomos) separadas por distancias enormes comparadas con sus diámetros. El volumen propio de las partículas se considera matemáticamente despreciable respecto al volumen total del recipiente (V_{\text{gas}} \approx V_{\text{recipiente}}).
2. Las moléculas se encuentran en movimiento caótico, continuo y rectilíneo al azar en todas las direcciones del espacio.
3. Las fuerzas de atracción y repulsión intermolecular (cohesión y Van der Waals) son totalmente nulas (F_c = F_r = 0).
4. Los choques intermoleculares y contra las paredes del recipiente son **perfectamente elásticos**: no hay pérdida neta de energía cinética total (\Delta E_k = 0).
5. La energía cinética media de traslación de las moléculas es directamente proporcional a la **Temperatura Absoluta** (T en Kelvin):
   \overline{E}_k = \frac{1}{2} m \overline{v}^2 = \frac{3}{2} k_B T
   *(Donde k_B es la constante de Boltzmann k_B = R/N_A = 1.38 \times 10^{-23}\text{ J/K})*.

### 3.2. Variables de Estado de un Gas
* **Presión (P):** Fuerza que ejercen los choques moleculares por unidad de área de superficie:
  1\text{ atm} = 760\text{ mmHg} = 760\text{ Torr} = 101.325\text{ kPa} \approx 10^5\text{ Pa}
* **Volumen (V):** Espacio disponible que ocupa el gas (volumen del recipiente):
  1\text{ m}^3 = 1000\text{ L} = 10^6\text{ mL} = 10^6\text{ cm}^3
* **Temperatura Absoluta (T):** Medida de la agitación cinética media:
  T(\text{K}) = T(^\circ\text{C}) + 273.15 \approx T(^\circ\text{C}) + 273
  *(Jamás operar leyes de gases con grados Celsius)*.
* **Cantidad de sustancia (n):** Número de moles de gas:
  n = \frac{m}{\overline{M}}

### 3.3. Leyes Empíricas de los Gases Ideales (Procesos Restringidos)

#### A. Ley de Boyle - Mariotte (Proceso Isotérmico: T = \text{constante}, n = \text{constante})
"A temperatura y masa constantes, el volumen de una masa gaseosa es inversamente proporcional a la presión absoluta que soporta":
P \cdot V = k \implies P_1 \cdot V_1 = P_2 \cdot V_2
* Gráfica P vs V: Rama de hipérbola equilátera (Isoterma).

#### B. Ley de Charles (Proceso Isobárico: P = \text{constante}, n = \text{constante})
"A presión y masa constantes, el volumen de un gas varía en forma directamente proporcional a su temperatura absoluta":
\frac{V}{T} = k \implies \frac{V_1}{T_1} = \frac{V_2}{T_2}
* Gráfica V vs T: Línea recta que converge al cero absoluto (0\text{ K}) (Isobara).

#### C. Ley de Gay-Lussac (Proceso Isocórico o Isométrico: V = \text{constante}, n = \text{constante})
"A volumen y masa constantes, la presión absoluta de un gas es directamente proporcional a su temperatura absoluta":
\frac{P}{T} = k \implies \frac{P_1}{T_1} = \frac{P_2}{T_2}
* Gráfica P vs T: Línea recta orientada hacia el origen absoluto (Isócora).

#### D. Ecuación Combinada de los Gases
Relaciona dos estados de una misma masa fija de gas (n = \text{constante}):
\frac{P_1 \cdot V_1}{T_1} = \frac{P_2 \cdot V_2}{T_2}

### 3.4. Ecuación de Estado del Gas Ideal (Ecuación Universal)
Unifica todas las variables termodinámicas para cualquier sistema gaseoso ideal:
P \cdot V = n \cdot R \cdot T

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. GASES REALES Y FACTOR DE COMPRESIBILIDAD (Z)
Para gases reales bajo presiones moderadas o altas, las moléculas sí ocupan volumen propio y sí existen fuerzas de atracción intermolecular. Se define el **Factor de Compresibilidad (Z)**:
Z = \frac{P \cdot V}{n \cdot R \cdot T}
* Si Z = 1: El gas se comporta como estrictamente ideal.
* Si Z > 1: Predominan las fuerzas de repulsión volumétrica (gas difícil de comprimir).
* Si Z < 1: Predominan las fuerzas de atracción intermolecular (gas fácilmente licuable).

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t09_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Operar con temperaturas en grados Celsius (^\\circ\\text{C}). Si divides o multiplicas por T(^\\circ\\text{C}), todo el problema se anula. DEBES sumar siempre 273 para \", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t09_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Olvidar restar la presión de vapor del agua en gases recolectados sobre agua. Si te dicen \"gas recolectado sobre agua a 20^\\circ\\text{C} con presión total de 750\\text{\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t09_s01_c03",
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
                    id = "quim_t09_s01_c04",
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
                    id = "quim_t09_s01_c05",
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
                    id = "quim_t09_s01_c06",
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
                    id = "quim_t09_s01_c07",
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
                    id = "quim_t09_s01_c08",
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
                    id = "quim_t09_s01_c09",
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
                    id = "quim_t09_s01_c10",
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
            id = "quim_t09_s02",
            title = "Estado Gaseoso y Mezclas de Gases - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Estado Gaseoso y Mezclas de Gases - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Sustituyendo n = \frac{m}{\overline{M}}:
P \cdot V = \frac{m}{\overline{M}} \cdot R \cdot T
Reordenando con la densidad \rho = \frac{m}{V}:
P \cdot \overline{M} = \rho \cdot R \cdot T \implies \rho = \frac{P \cdot \overline{M}}{R \cdot T}

* **Valores de la Constante Universal de los Gases (R):**
  * Si la presión está en **atmósferas (atm)**:
    R = 0.08206 \approx 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})
  * Si la presión está en **milímetros de mercurio (mmHg) o Torr**:
    R = 62.36 \approx 62.4\text{ mmHg}\cdot\text{L}/(\text{mol}\cdot\text{K})
  * Si la presión está en **Pascales (Pa)** y el volumen en **m^3** (SI):
    R = 8.314\text{ J}/(\text{mol}\cdot\text{K}) = 8.314\text{ Pa}\cdot\text{m}^3/(\text{mol}\cdot\text{K})

### 3.5. Mezclas Gaseosas

#### A. Fracción Molar (x_i)
Proporción de moles de un gas respecto al número total de moles en la mezcla:
x_i = \frac{n_i}{n_{\text{total}}} \quad ; \quad \sum x_i = 1 \quad ; \quad \% n_i = x_i \times 100\%

#### B. Ley de las Presiones Parciales de John Dalton (1801)
"La presión total ejercida por una mezcla de gases no reactivos es igual a la suma de las presiones parciales que ejercería cada gas si ocupara solo todo el volumen del recipiente a la misma temperatura":
P_{\text{total}} = P_1 + P_2 + \dots + P_k = \sum_{i=1}^k P_i
* **Cálculo de la Presión Parcial (P_i):**
  P_i = x_i \cdot P_{\text{total}}

#### C. Ley de los Volúmenes Parciales de Emile Amagat
"El volumen total ocupado por una mezcla gaseosa es igual a la suma de los volúmenes parciales de cada gas medidos a la misma presión y temperatura":
V_{\text{total}} = \sum V_i \quad ; \quad V_i = x_i \cdot V_{\text{total}} \implies \%V_i = \%n_i = x_i \times 100\%

#### D. Masa Molar Promedio o Aparente de la Mezcla (\overline{M}_{\text{mezcla}})
\overline{M}_{\text{mezcla}} = x_1 \overline{M}_1 + x_2 \overline{M}_2 + \dots + x_k \overline{M}_k = \frac{m_{\text{total}}}{n_{\text{total}}}
* *Para el aire seco promedio:* \approx 78\% N_2, 21\% O_2, 1\% Ar \implies \overline{M}_{\text{aire}} \approx 28.96\text{ g/mol} \approx 29\text{ g/mol}.

#### E. Recolección de Gases sobre Agua (Gas Húmedo)
Cuando un gas se recolecta por desplazamiento de agua en una probeta o cuba neumática, el gas se satura con vapor de agua:
P_{\text{gas húmedo}} = P_{\text{gas seco}} + P_{v(H_2O)}
P_{\text{gas seco}} = P_{\text{total}} - P_{v(H_2O)}
*(La presión de vapor de agua P_v solo depende de la temperatura y se obtiene de tablas termodinámicas)*.

### 3.6. Ley de Difusión y Efusión Gaseosa de Thomas Graham (1829)
* **Difusión:** Proceso espontáneo de dispersión y mezcla de un gas a través de otro.
* **Efusión:** Escape de un gas a través de un orificio microscópico hacia una zona de menor presión o vacío.
"A condiciones idénticas de presión y temperatura, las velocidades de difusión o efusión de dos gases son inversamente proporcionales a las raíces cuadradas de sus respectivas masas molares o densidades":
\frac{v_1}{v_2} = \sqrt{\frac{\overline{M}_2}{\overline{M}_1}} = \sqrt{\frac{\rho_2}{\rho_1}} = \frac{t_2}{t_1}
*(Los gases más livianos como el H_2 o el He se difunden a velocidades mucho mayores que los gases pesados como el O_2, CO_2 o SO_2)*.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
* **Ecuación de Van der Waals:**
  \left(P + \frac{a \cdot n^2}{V^2}\right)(V - n \cdot b) = n \cdot R \cdot T
  Donde a corrige las fuerzas atractivas intermoleculares y b corrige el volumen propio ocupado por las moléculas (covolumen).

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Ecuación Universal:** **"Pavo = Ratón"**
  P \cdot V = R \cdot T \cdot n
* **Mnemotecnia Densidad de un Gas:** **"Puma = Rata"**
  P \cdot \overline{M} = \rho \cdot R \cdot T
* **Mnemotecnia Ecuación Combinada:** **"Pavo Triste 1 = Pavo Triste 2"**
  \frac{P_1 V_1}{T_1} = \frac{P_2 V_2}{T_2}

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Operar con temperaturas en grados Celsius (^\circ\text{C}).** Si divides o multiplicas por T(^\circ\text{C}), todo el problema se anula. DEBES sumar siempre 273 para convertir a Kelvin (K).
* **Trampa 2: Olvidar restar la presión de vapor del agua en gases recolectados sobre agua.** Si te dicen "gas recolectado sobre agua a 20^\circ\text{C} con presión total de 750\text{ mmHg} y P_v(H_2O) = 17.5\text{ mmHg}", la presión del gas seco para usar en PV=nRT es 750 - 17.5 = 732.5\text{ mmHg}.
* **Trampa 3: Invertir las masas en la Ley de Graham.** Es una proporción inversa: \frac{v_1}{v_2} = \sqrt{\frac{M_2}{M_1}}. En tiempos de efusión se invierte: el gas pesado tarda más tiempo, por lo que \frac{t_1}{t_2} = \sqrt{\frac{M_1}{M_2}}.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t09_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Invertir las masas en la Ley de Graham. Es una proporción inversa: \\frac{v_1}{v_2} = \\sqrt{\\frac{M_2}{M_1}}. En tiempos de efusión se invierte: el gas pesado tarda más \", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t09_s02_c02",
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
                    id = "quim_t09_s02_c03",
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
                    id = "quim_t09_s02_c04",
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
                    id = "quim_t09_s02_c05",
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
                    id = "quim_t09_s02_c06",
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
                    id = "quim_t09_s02_c07",
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
                    id = "quim_t09_s02_c08",
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
                    id = "quim_t09_s02_c09",
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
                    id = "quim_t09_s02_c10",
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
