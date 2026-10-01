package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana10 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t10_s01",
            title = "Sistemas Dispersos y Soluciones - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Sistemas Dispersos y Soluciones - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química de Disoluciones
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Molaridad, Normalidad, Molalidad, Dilución y Mezcla de soluciones)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.9 / 10 (Fijo en los exámenes de Ciencias Biomédicas e Ingenierías)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              SISTEMAS DISPERSOS
                                      │
         ┌────────────────────────────┼────────────────────────────┐
         ▼                            ▼                            ▼
   SUSPENSIONES                   COLOIDES                    SOLUCIONES
(Diámetro > 1000 nm,          (1 nm a 1000 nm,            (Diámetro < 1 nm,
 sedimentan, opacas)          Efecto Tyndall, Browniano)   monofásica, homogénea)
                                                                   │
         ┌─────────────────────────────────────────────────────────┴────────────────────────┐
         ▼                                                                                  ▼
UNIDADES FÍSICAS DE CONCENTRACIÓN                                  UNIDADES QUÍMICAS DE CONCENTRACIÓN
• Porcentaje en masa: \%m/m = \frac{m_{\text{sto}}}{m_{\text{sol}}} \times 100     • Molaridad: M = \frac{n_{\text{sto}}}{V_{\text{sol(L)}}} = \frac{m_{\text{sto}}}{\overline{M} \cdot V}
• Porcentaje en volumen: \%v/v = \frac{V_{\text{sto}}}{V_{\text{sol}}} \times 100 • Normalidad: N = \frac{\#Eq\text{-}g}{V_{\text{sol(L)}}} = M \cdot \theta
• Porcentaje masa-volumen: \%m/v = \frac{m_{\text{sto}}}{V_{\text{sol}}} \times 100 • Molalidad: m = \frac{n_{\text{sto}}}{m_{\text{ste(kg)}}}
• Partes por millón: ppm = \frac{mg_{\text{sto}}}{kg_{\text{sol}}} = \frac{mg_{\text{sto}}}{L_{\text{sol}}} • Fracción Molar: x_{\text{sto}} = \frac{n_{\text{sto}}}{n_{\text{total}}}
                                                                                            │
         ┌──────────────────────────────────────────────────────────────────────────────────┘
         ▼
OPERACIONES CON SOLUCIONES
• Dilución:  C_1 \cdot V_1 = C_2 \cdot V_2  (M_1 V_1 = M_2 V_2)
• Mezcla de Soluciones del mismo soluto:  C_1 V_1 + C_2 V_2 = C_F V_F
• Neutralización Estequiométrica:  \#Eq\text{-}g(\text{Ácido}) = \#Eq\text{-}g(\text{Base}) \implies N_A \cdot V_A = N_B \cdot V_B
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Clasificación Comparativa de los Sistemas Dispersos
Un sistema disperso consta de una **Fase Dispersa** (análoga al soluto) distribuida en el seno de una **Fase Dispersante** (medio continuo, análogo al solvente):

| Propiedad | Suspensión | Coloide | Solución Verdadera |
| :--- | :--- | :--- | :--- |
| **Tamaño de partícula** | > 1000\text{ nm} (> 10\,000\text{ Å}) | 1\text{ nm} - 1000\text{ nm} | < 1\text{ nm} (< 10\text{ Å}) |
| **Homogeneidad** | Heterogéneo (2 fases visibles) | Heterogéneo (microscópicamente) | Homogéneo (monofásico) |
| **Sedimentación** | Sedimentan por gravedad | No sedimentan espontáneamente | No sedimentan jamás |
| **Filtrabilidad** | Retenidas por papel de filtro común | Atraviesan filtro común, retenidas por ultrafiltros | No se separan por membranas |
| **Efecto Tyndall** | No aplica (opacas o traslúcidas) | **Presente** (dispersan el haz de luz) | **Ausente** (ópticamente transparentes) |
| **Ejemplos** | Jugo de papaya, leche de magnesia | Mayonesa, gelatina, niebla, humo, sangre | Salmuera, vinagre, aire filtrado, alcohol 70° |

### 3.2. Componentes y Clasificación de las Soluciones
1. **Componentes:**
   * **Soluto (sto):** Sustancia que se disuelve y se halla generalmente en menor proporción molar. Determina el nombre y la reactividad química de la solución. Puede ser uno o más.
   * **Solvente o Disolvente (ste):** Medio dispersante que disuelve al soluto. El agua (H_2O) es el solvente universal por su elevada constante dieléctrica (\epsilon \approx 80) y momento dipolar.
   * **Masa de la solución:**
     m_{\text{solución}} = m_{\text{soluto}} + m_{\text{solvente}}
2. **Clasificación por la Capacidad de Solubilidad (S a una temperatura dada):**
   * *Solubilidad (S):* Cantidad máxima de soluto en gramos que puede disolverse en 100\text{ g} de solvente a una temperatura fija.
   * *Solución Diluida / Concentrada:* Clasificación cualitativa según la proporción relativa de soluto.
   * *Solución Insaturada:* Contiene menos soluto que la máxima cantidad permitida por la curva de solubilidad (m_{\text{sto}} < S).
   * *Solución Saturada:* Contiene exactamente la máxima cantidad disuelta en equilibrio termodinámico dinámico (m_{\text{sto}} = S).
   * *Solución Sobresaturada:* Sistema termodinámicamente inestable que contiene más soluto disuelto que el permitido por la saturación a esa temperatura. Precipita inmediatamente ante una perturbación mecánica o adición de un cristal de siembra.

### 3.3. Unidades Físicas de Concentración
1. **Porcentaje en Masa (\%m/m o \%P/P):**
   \%m/m = \frac{m_{\text{sto}}}{m_{\text{sol}}} \times 100\% = \frac{m_{\text{sto}}}{m_{\text{sto}} + m_{\text{ste}}} \times 100\%
2. **Porcentaje en Volumen (\%v/v o Grado Alcohólico ^\circ\text{GL}):**
   \%v/v = \frac{V_{\text{sto}}}{V_{\text{sol}}} \times 100\%
3. **Porcentaje Masa en Volumen (\%m/v):**
   \%m/v = \frac{m_{\text{sto}}(\text{g})}{V_{\text{sol}}(\text{mL})} \times 100\%
4. **Partes por Millón (ppm):** Usada para soluciones extremadamente diluidas (contaminación, trazas de metales pesados en agua):
   ppm = \frac{mg_{\text{sto}}}{kg_{\text{sol}}} \approx \frac{mg_{\text{sto}}}{L_{\text{solución acuosa}}}

### 3.4. Unidades Químicas de Concentración

#### A. Molaridad (M)
Número de moles de soluto disueltas por cada litro de solución:
M = \frac{n_{\text{sto}}}{V_{\text{sol}}(\text{L})} = \frac{m_{\text{sto}}(\text{g})}{\overline{M}_{\text{sto}}(\text{g/mol}) \cdot V_{\text{sol}}(\text{L})}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. DENSIDAD Y FACTORES DE CONVERSIÓN
\rho_{\text{solución}} = \frac{m_{\text{solución}}}{V_{\text{solución}}}
* La densidad del agua líquida se asume habitualmente como \rho_{H_2O} \approx 1.0\text{ g/mL} = 1.0\text{ g/cm}^3 = 1000\text{ kg/m}^3.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t10_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Confundir masa de la solución con masa del solvente en la Molalidad (m). En la molalidad el denominador es EXCLUSIVAMENTE los kilogramos del solvente puro (ste), jamá\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t10_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Sumar volúmenes asumiendo aditividad cuando se da la densidad final. Si el problema proporciona la densidad de la solución final resultante, la masa total es siempre adit\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t10_s01_c03",
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
                    id = "quim_t10_s01_c04",
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
                    id = "quim_t10_s01_c05",
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
                    id = "quim_t10_s01_c06",
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
                    id = "quim_t10_s01_c07",
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
                    id = "quim_t10_s01_c08",
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
                    id = "quim_t10_s01_c09",
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
                    id = "quim_t10_s01_c10",
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
            id = "quim_t10_s02",
            title = "Sistemas Dispersos y Soluciones - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Sistemas Dispersos y Soluciones - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Fórmula Comercial Directa de Molaridad (cuando dan \%m/m y densidad \rho):**
  M = \frac{10 \cdot \rho_{\text{sol}}(\text{g/mL}) \cdot (\%m/m)}{\overline{M}_{\text{sto}}}

#### B. Normalidad (N)
Número de equivalentes-gramo (\#Eq\text{-}g) de soluto por cada litro de solución:
N = \frac{\#Eq\text{-}g_{\text{sto}}}{V_{\text{sol}}(\text{L})} = \frac{m_{\text{sto}}}{PE_{\text{sto}} \cdot V_{\text{sol}}(\text{L})}
Donde el **Peso Equivalente (PE)** es:
PE = \frac{\overline{M}}{\theta}
* **Relación Fundamental entre Normalidad y Molaridad ("N = M · \theta"):**
  N = M \cdot \theta

* **Cálculo del Parámetro \theta (Parámetro de Carga):**
  * Para un **Ácido:** \theta = \text{número de hidrógenos } (H^+) \text{ sustituibles} (ej. HCl \to \theta=1; H_2SO_4 \to \theta=2; H_3PO_4 \to \theta=3).
  * Para un **Hidróxido:** \theta = \text{número de iones hidróxido } (OH^-) (ej. NaOH \to \theta=1; Ca(OH)_2 \to \theta=2; Al(OH)_3 \to \theta=3).
  * Para una **Sal:** \theta = \text{carga total positiva neta del catión metálico} (ej. NaCl \to \theta=1; CaCO_3 \to \theta=2; Al_2(SO_4)_3 \to 2 \times (+3) = 6).
  * Para un **Agente Redox:** \theta = \text{número de electrones transferidos por fórmula en el proceso}.

#### C. Molalidad (m)
Número de moles de soluto disueltas por cada kilogramo de **solvente puro** (es independiente de la temperatura porque no usa volúmenes):
m = \frac{n_{\text{sto}}}{m_{\text{ste}}(\text{kg})} = \frac{m_{\text{sto}}(\text{g})}{\overline{M}_{\text{sto}} \cdot m_{\text{ste}}(\text{kg})}

#### D. Fracción Molar (x_{\text{sto}}, x_{\text{ste}})
x_{\text{sto}} = \frac{n_{\text{sto}}}{n_{\text{sto}} + n_{\text{ste}}} \quad ; \quad x_{\text{ste}} = \frac{n_{\text{ste}}}{n_{\text{sto}} + n_{\text{ste}}} \quad ; \quad x_{\text{sto}} + x_{\text{ste}} = 1

### 3.5. Operaciones con Soluciones

#### A. Dilución de Soluciones
Proceso que consiste en añadir solvente puro (generalmente agua) a una solución concentrada. La cantidad de soluto permanece estrictamente invariable (n_1 = n_2):
C_1 \cdot V_1 = C_2 \cdot V_2 \implies M_1 \cdot V_1 = M_2 \cdot V_2 \implies N_1 \cdot V_1 = N_2 \cdot V_2

#### B. Mezcla de Soluciones del Mismo Soluto
Al mezclar dos o más soluciones de distinta concentración del mismo soluto, los moles de soluto son aditivos:
C_1 \cdot V_1 + C_2 \cdot V_2 = C_F \cdot V_F \quad \text{donde } V_F = V_1 + V_2

#### C. Neutralización y Titulación Ácido-Base
En el punto de equivalencia estequiométrica, el número de equivalentes-gramo del ácido neutraliza exactamente al número de equivalentes-gramo de la base:
\#Eq\text{-}g(\text{Ácido}) = \#Eq\text{-}g(\text{Base})
N_{\text{ácido}} \cdot V_{\text{ácido}} = N_{\text{base}} \cdot V_{\text{base}}
M_A \cdot \theta_A \cdot V_A = M_B \cdot \theta_B \cdot V_B

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia de la Molaridad Comercial:**
  M = \frac{10 \cdot D \cdot \%P}{\overline{M}} \quad \text{("10 De Pasadita sobre Masa Molar")}
* **Mnemotecnia Normalidad - Molaridad:** **"NEMO"**
  N = M \cdot \theta \quad (N = E \cdot M \cdot O \to N = M \cdot \theta)
* **Hacking de Dilución Rápida:**
  Si duplicas el volumen agregando agua (V_2 = 2V_1), la concentración se reduce automáticamente a la mitad (C_2 = C_1 / 2). Si el volumen se multiplica por 5, la concentración se divide entre 5.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir masa de la solución con masa del solvente en la Molalidad (m).** En la molalidad el denominador es EXCLUSIVAMENTE los kilogramos del solvente puro (ste), jamás la masa de la solución (sol).
* **Trampa 2: Sumar volúmenes asumiendo aditividad cuando se da la densidad final.** Si el problema proporciona la densidad de la solución final resultante, la masa total es siempre aditiva (m_F = m_1 + m_2), pero el volumen final DEBE despejarse como V_F = m_F / \rho_F, pues por contracción de volumen intermolecular V_F \ne V_1 + V_2.
* **Trampa 3: Usar Molaridad en lugar de Normalidad en la neutralización.** En M_A V_A = M_B V_B, esta fórmula solo es válida si \theta_A = \theta_B = 1 (ej. HCl y NaOH). Si usas H_2SO_4 (\theta=2), DEBES multiplicar la molaridad por \theta: 2 M_A V_A = M_B V_B.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t10_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Usar Molaridad en lugar de Normalidad en la neutralización. En M_A V_A = M_B V_B, esta fórmula solo es válida si \\theta_A = \\theta_B = 1 (ej. HCl y NaOH). Si usas\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t10_s02_c02",
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
                    id = "quim_t10_s02_c03",
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
                    id = "quim_t10_s02_c04",
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
                    id = "quim_t10_s02_c05",
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
                    id = "quim_t10_s02_c06",
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
                    id = "quim_t10_s02_c07",
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
                    id = "quim_t10_s02_c08",
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
                    id = "quim_t10_s02_c09",
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
                    id = "quim_t10_s02_c10",
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
