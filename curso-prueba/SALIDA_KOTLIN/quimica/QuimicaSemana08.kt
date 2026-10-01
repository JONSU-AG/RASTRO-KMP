package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t08_s01",
            title = "Cálculos Químicos y Estequiometría - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Cálculos Químicos y Estequiometría - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química Cuantitativa y Leyes Ponderales
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Cálculos de pureza, reactivo limitante y rendimiento de reacción)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10 (El tema de cálculo numérico por excelencia en admisión)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         CÁLCULOS QUÍMICOS Y ESTEQUIOMETRÍA
                                         │
         ┌───────────────────────────────┴───────────────────────────────┐
         ▼                                                               ▼
UNIDADES QUÍMICAS DE MASA                                        LEYES ESTEQUIOMÉTRICAS
• Masa Atómica Promedio (\overline{P.A.})                      • Leyes Ponderales:
• Masa Molar (M en g/mol)                                        - Conservación de la masa (Lavoisier)
• Concepto de Mol y Número de Avogadro (N_A = 6.022 \times 10^{23}) - Proporciones definidas (Proust)
• Átomo-gramo (at\text{-}g) y Molécula-gramo (mol)              - Proporciones múltiples (Dalton)
• Composición Centesimal (\%m)                                   - Proporciones recíprocas (Richter-Wenzel)
• Fórmula Empírica (FE) y Fórmula Molecular (FM)                 • Ley Volumétrica de Gay-Lussac (Gases)
                                                                         │
         ┌───────────────────────────────────────────────────────────────┘
         ▼
CÁLCULOS ESTEQUIOMÉTRICOS EN REACCIONES REALES
• Reactivo Limitante (RL) y Reactivo en Exceso (RE)
• Pureza de Reactivos (\%P)
• Rendimiento Porcentual de Reacción (\%R = \frac{\text{Real}}{\text{Teórico}} \times 100\%)
• Volumen Molar a Condiciones Normales (V_{molar} = 22.4\text{ L/mol})
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Unidades Químicas de Masa (UQM)
1. **Unidad de Masa Atómica (u.m.a. o u o Dalton Da):**
   Patrón internacional de masa definido exactamente como la doceava (1/12) parte de la masa de un átomo neutro del isótopo de carbono-12 (^{12}_6C):
   1\text{ u.m.a.} = \frac{m(^{12}_6C)}{12} \approx 1.6605 \times 10^{-24}\text{ g} = 1.6605 \times 10^{-27}\text{ kg}
2. **Concepto de Mol:**
   Unidad fundamental del SI para la cantidad de sustancia. Contiene exactamente tantas entidades elementales (átomos, moléculas, iones, electrones) como átomos hay en 0.012\text{ kg} de carbono-12. Dicha constante es el **Número de Avogadro (N_A)**:
   N_A = 6.02214 \times 10^{23}\text{ entidades/mol} \approx 6.02 \times 10^{23}\text{ mol}^{-1}
3. **Masa Molar (M o \overline{M}):**
   Masa en gramos de un mol de sustancia. Numéricamente es idéntica a la masa molecular o atómica en u.m.a., pero expresada en \text{g/mol}.
   * *Relación fundamental del Mol:*
     n = \frac{m}{\overline{M}} = \frac{N^\circ \text{ partículas}}{N_A} = \frac{V_{(CN)}}{22.4\text{ L}}
4. **Átomo-gramo (at\text{-}g):** Es la masa de un mol de átomos de un elemento químico:
   1\text{ at-g}(X) = \overline{P.A.}(X)\text{ gramos} = 6.022 \times 10^{23}\text{ átomos de } X
5. **Molécula-gramo (mol\text{-}g o mol):** Es la masa de un mol de moléculas de un compuesto:
   1\text{ mol}(H_2O) = 18\text{ g} = 6.022 \times 10^{23}\text{ moléculas de } H_2O

### 3.2. Composición Centesimal, Fórmula Empírica y Molecular
1. **Composición Centesimal (\%m_i):** Porcentaje en masa que representa cada elemento dentro del compuesto:
   \%m_i = \frac{N^\circ \text{ átomos}_i \cdot \overline{P.A.}_i}{\overline{M}_{\text{compuesto}}} \times 100\%
2. **Fórmula Empírica (FE) o Mínima:** Expresa la relación de números enteros más simple entre los átomos de una sustancia:
   * *Algoritmo:* Dividir el porcentaje o masa de cada elemento entre su \overline{P.A.}; luego dividir cada cociente entre el menor valor obtenido. Si quedan decimales sencillos (\approx 0.5, 0.33), multiplicar por un factor entero mínimo (2 o 3).
3. **Fórmula Molecular (FM) o Verdadera:** Indica el número real de átomos de cada elemento en una molécula:
   \text{FM} = k \cdot (\text{FE}) \quad \text{donde} \quad k = \frac{\overline{M}_{\text{molecular}}}{\overline{M}_{\text{empírica}}} \quad (k \in \mathbb{Z}^+)

### 3.3. Leyes Ponderales de la Química
1. **Ley de Conservación de la Masa (Antoine Lavoisier, 1789):**
   "En toda reacción química ordinaria, la masa total de los reactantes es estrictamente igual a la masa total de los productos obtenidos":
   \sum m_{\text{reactantes}} = \sum m_{\text{productos}}
2. **Ley de las Proporciones Definidas o Constantes (Joseph Louis Proust, 1799):**
   "Cuando dos o más elementos se combinan químicamente para formar un compuesto determinado, lo hacen siempre en una relación de masas fija, definida e invariable".

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. MASAS ATÓMICAS FUNDAMENTALES DE ADMISIÓN
* Hidrógeno (H): 1\text{ u.m.a.}
* Carbono (C): 12\text{ u.m.a.}
* Nitrógeno (N): 14\text{ u.m.a.}
* Oxígeno (O): 16\text{ u.m.a.}
* Sodio (Na): 23\text{ u.m.a.}
* Magnesio (Mg): 24\text{ u.m.a.}
* Aluminio (Al): 27\text{ u.m.a.}
* Fósforo (P): 31\text{ u.m.a.}
* Azufre (S): 32\text{ u.m.a.}

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t08_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Usar la masa total de la muestra impura en la regla estequiométrica. ERROR FATAL. Antes de armar la regla de tres o factores de conversión, DEBES descontar las impurezas:\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t08_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Determinar el reactivo limitante comparando directamente los gramos de reactantes. FALSO. El reactivo de menor masa en gramos no necesariamente es el limitante; el cálcul\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t08_s01_c03",
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
                    id = "quim_t08_s01_c04",
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
                    id = "quim_t08_s01_c05",
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
                    id = "quim_t08_s01_c06",
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
                    id = "quim_t08_s01_c07",
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
                    id = "quim_t08_s01_c08",
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
                    id = "quim_t08_s01_c09",
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
                    id = "quim_t08_s01_c10",
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
            id = "quim_t08_s02",
            title = "Cálculos Químicos y Estequiometría - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Cálculos Químicos y Estequiometría - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   * Si uno de los reactivos se suministra en una proporción mayor a la requerida por la ley estequiométrica, el excedente no reacciona y queda como sobrante.
3. **Ley de las Proporciones Múltiples (John Dalton, 1803):**
   "Cuando dos elementos se combinan entre sí para formar más de un compuesto diferente, si la masa de uno de ellos se mantiene constante, las masas del otro elemento guardan entre sí una relación de números enteros sencillos" (ej. CO y CO_2; 12\text{ g } C se combinan con 16\text{ g } O y 32\text{ g } O; relación 1:2).
4. **Ley de las Proporciones Recíprocas o Equivalentes (Jeremias Richter y Carl Wenzel, 1792):**
   "Las masas de dos elementos distintos que se combinan separadamente con una misma masa fija de un tercer elemento, son las mismas masas con las que dichos elementos se combinarán entre sí, o bien múltiplos o submúltiplos de ellas".

### 3.4. Ley Volumétrica de Gay-Lussac (1808)
Para reacciones químicas que involucran reactantes y productos en fase gaseosa, a condiciones constantes de presión y temperatura (P y T fijos):
"Los volúmenes de las sustancias gaseosas que reaccionan o se forman guardan entre sí una relación de números enteros y sencillos, idéntica a la relación de sus coeficientes estequiométricos molares":
N_{2(g)} + 3H_{2(g)} \to 2NH_{3(g)} \implies 1\text{ L de } N_2 + 3\text{ L de } H_2 \to 2\text{ L de } NH_3
* **Condiciones Normales (C.N. o T.P.N.):**
  T = 0^\circ\text{C} = 273.15\text{ K} \quad ; \quad P = 1\text{ atm} = 760\text{ mmHg} \implies V_{\text{molar}} = 22.414\text{ L/mol} \approx 22.4\text{ L/mol}

### 3.5. Reactivo Limitante, Pureza y Rendimiento

#### A. Reactivo Limitante (RL) y Reactivo en Exceso (RE)
* **Reactivo Limitante (RL):** Sustancia que se consume completamente en primer lugar en la reacción química. Gobierna y limita estequiométricamente la cantidad teórica máxima de productos que se pueden formar.
* **Reactivo en Exceso (RE):** Sustancia que no reacciona en su totalidad, quedando una porción residual intacta al término del proceso.
* **Criterio Matemático Rápido del Cociente Estequiométrico (Q):**
  Q = \frac{\text{Moles del reactivo disponibles}}{\text{Coeficiente estequiométrico del reactivo}}
  * El reactivo que tenga el **menor cociente Q** es el **Reactivo Limitante (RL)**.
  * Todos los cálculos estequiométricos de producto se efectúan **exclusivamente con la masa pura del Reactivo Limitante**.

#### B. Pureza de una Muestra Química (\%P)
Los reactivos industriales nunca son 100\% químicamente puros (contienen impurezas inertes):
\% \text{Pureza} = \frac{m_{\text{sustancia pura}}}{m_{\text{muestra impura}}} \times 100\% \implies m_{\text{pura}} = m_{\text{muestra}} \times \frac{\%P}{100\%}

#### C. Rendimiento Porcentual de Reacción (\%R o Eficiencia \eta)
En la práctica, debido a pérdidas mecánicas, reacciones secundarias indeseadas o equilibrios químicos incompletos, la cantidad de producto obtenida experimentalmente en el laboratorio (Rendimiento Real) es inferior a la predicha teóricamente por la estequiometría ideal (Rendimiento Teórico):
\% \text{Rendimiento} = \frac{\text{Cantidad Real de Producto (obtenida en laboratorio)}}{\text{Cantidad Teórica de Producto (calculada por estequiometría)}} \times 100\%

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
* Cloro (Cl): 35.5\text{ u.m.a.}
* Potasio (K): 39\text{ u.m.a.}
* Calcio (Ca): 40\text{ u.m.a.}
* Hierro (Fe): 56\text{ u.m.a.}
* Cobre (Cu): 63.5\text{ u.m.a.}
* Zinc (Zn): 65\text{ u.m.a.}
* Plata (Ag): 108\text{ u.m.a.}

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **El Método Relámpago del Reactivo Limitante (Hack Q):**
  * Para aA + bB \to cC:
    Q_A = \frac{n_A}{a} \quad ; \quad Q_B = \frac{n_B}{b}
  * Si Q_A < Q_B \implies A es el **Reactivo Limitante**.
  * ¿Cuánto producto C se forma? Directamente:
    n_C = c \cdot Q_{\text{limitante}}
    ¡Ahorras 3 líneas de regla de tres y resuelves en 15 segundos!
* **Mnemotecnia CHON:** Los elementos más abundantes en estequiometría orgánica pesan: C=12, H=1, O=16, N=14.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Usar la masa total de la muestra impura en la regla estequiométrica.** ERROR FATAL. Antes de armar la regla de tres o factores de conversión, DEBES descontar las impurezas: solo la masa pura participa en la reacción química.
* **Trampa 2: Determinar el reactivo limitante comparando directamente los gramos de reactantes.** FALSO. El reactivo de menor masa en gramos no necesariamente es el limitante; el cálculo depende estrictamente de las relaciones molares divididas entre los coeficientes estequiométricos (Q = n_i / \text{coef}_i).
* **Trampa 3: Usar el volumen molar de 22.4\text{ L} a condiciones que no son Normales.** El valor de 22.4\text{ L/mol} SOLO es válido a Condiciones Normales (0^\circ\text{C} y 1\text{ atm}). Si te dan otra temperatura o presión, debes utilizar la ecuación universal de los gases ideales (PV = nRT).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t08_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Usar el volumen molar de 22.4\\text{ L} a condiciones que no son Normales. El valor de 22.4\\text{ L/mol} SOLO es válido a Condiciones Normales (0^\\circ\\text{C} y 1\\\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t08_s02_c02",
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
                    id = "quim_t08_s02_c03",
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
                    id = "quim_t08_s02_c04",
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
                    id = "quim_t08_s02_c05",
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
                    id = "quim_t08_s02_c06",
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
                    id = "quim_t08_s02_c07",
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
                    id = "quim_t08_s02_c08",
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
                    id = "quim_t08_s02_c09",
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
                    id = "quim_t08_s02_c10",
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
