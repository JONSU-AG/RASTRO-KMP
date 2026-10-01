package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana02 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t02_s01",
            title = "Energía y Cambios Físicos de la Materia - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Energía y Cambios Físicos de la Materia - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química Fundamental y Termodinámica Clásica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Cálculos de calorimetría y equivalencia masa-energía)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.0 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         ENERGÍA Y ESTADOS DE LA MATERIA
                                       │
         ┌─────────────────────────────┴─────────────────────────────┐
         ▼                                                           ▼
ESTADOS DE AGREGACIÓN                                   RELACIÓN MASA - ENERGÍA
(Sólido, Líquido, Gaseoso, Plasmático)                  (Teoría Especial de la Relatividad)
         │                                                           │
   CAMBIOS DE FASE                                             E = mc^2
(Absorben / Liberan calor)                                     E = \Delta m \cdot c^2
         │                                                           │
┌────────┴────────┐                                            Masa Relativista:
▼                 ▼                                      m_f = \frac{m_0}{\sqrt{1 - (v/c)^2}}
ENDOTÉRMICOS     EXOTÉRMICOS
• Fusión         • Solidificación
• Vaporización   • Condensación/Licuación
• Sublimación    • Sublimación inversa /
  directa          Deposición
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Los Estados de Agregación de la Materia
El estado físico depende del balance dinámico entre las fuerzas de atracción intermolecular (fuerzas de cohesión, F_c) y las fuerzas de repulsión cinética molecular (F_r):
1. **Estado Sólido:** F_c \gg F_r. Forma y volumen propios y definidos. Incompresibles. Movimiento molecular restringido a vibraciones en posiciones reticulares fijas. Densidad generalmente alta (anomalía del agua: el hielo es menos denso que el agua líquida a 4^\circ\text{C}).
2. **Estado Líquido:** F_c \approx F_r. Volumen constante pero forma variable (adopta la forma del recipiente). Prácticamente incompresibles. Presentan fluidez, viscosidad y tensión superficial.
3. **Estado Gaseoso:** F_r \gg F_c. Forma y volumen variables (ocupan todo el volumen disponible). Alta compresibilidad y expansibilidad. Movimiento caótico translacional a altas velocidades (entropía elevada).
4. **Estado Plasmático (Cuarto Estado):** Gas altamente ionizado compuesto por cationes, electrones libres y fotones a temperaturas extraordinariamente altas (> 10\,000\text{ K}). Excelente conductor de la electricidad. Es el estado más abundante en el Universo observable (sol, estrellas, nebulosas, reactores Tokamak, auroras boreales).
5. **Condensado de Bose-Einstein (Quinto Estado):** Materia a temperaturas extremadamente cercanas al cero absoluto (0\text{ K} = -273.15^\circ\text{C}). Los átomos caen al nivel cuántico más bajo, comportándose como una sola "superonda" o superátomo.

### 3.2. Cambios de Fase (Cambios Físicos de Estado)
Son transformaciones físicas reversibles gobernadas por la adición o remoción de energía térmica (entalpía de cambio de fase) a presión constante:
* **Procesos Endotérmicos (Ganan calor, \Delta H > 0):**
  * *Fusión:* Sólido \to Líquido.
  * *Vaporización (Evaporación / Ebullición):* Líquido \to Gas/Vapor.
  * *Sublimación Directa o Volatilización:* Sólido \to Gas (ej. naftalina, hielo seco CO_{2(s)}, yodo sólido I_{2(s)}).
* **Procesos Exotérmicos (Liberan calor, \Delta H < 0):**
  * *Solidificación:* Líquido \to Sólido.
  * *Condensación:* Gas/Vapor \to Líquido (se llama *licuación* cuando un gas real se somete a aumento de presión y enfriamiento simultáneo).
  * *Sublimación Inversa, Deposición o Compensación:* Gas \to Sólido (ej. formación de escarcha, nieve).

### 3.3. Calorimetría Aplicada a Cambios Físicos
1. **Calor Sensible (Q_s):** Energía térmica absorbida o cedida que produce variación de temperatura sin cambio de estado:
   Q_s = m \cdot c_e \cdot \Delta T = m \cdot c_e \cdot (T_f - T_i)
   Donde:
   * m: masa en gramos (g).
   * c_e: calor específico en \text{cal}/(\text{g}\cdot^\circ\text{C}) o \text{J}/(\text{kg}\cdot\text{K}).
   * Para el agua: c_e(\text{hielo}) = 0.5\text{ cal/g}^\circ\text{C}, c_e(\text{líquida}) = 1.0\text{ cal/g}^\circ\text{C}, c_e(\text{vapor}) = 0.5\text{ cal/g}^\circ\text{C}.
2. **Calor Latente de Cambio de Fase (Q_L):** Energía necesaria para que una unidad de masa cambie de estado isotérmicamente (a temperatura constante):
   Q_L = m \cdot L

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t02_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Confundir evaporación con ebullición. La evaporación ocurre solo en la superficie del líquido y a cualquier temperatura; la ebullición es un fenómeno turbulento de toda l\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t02_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Aplicar Q = m \\cdot c_e \\cdot \\Delta T durante un cambio de fase. ERROR GRAVE. Durante el cambio de fase la temperatura no cambia (\\Delta T = 0); se debe usar Q = m \", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t02_s01_c03",
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
                    id = "quim_t02_s01_c04",
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
                    id = "quim_t02_s01_c05",
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
                    id = "quim_t02_s01_c06",
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
                    id = "quim_t02_s01_c07",
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
                    id = "quim_t02_s01_c08",
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
                    id = "quim_t02_s01_c09",
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
                    id = "quim_t02_s01_c10",
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
            id = "quim_t02_s02",
            title = "Energía y Cambios Físicos de la Materia - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Energía y Cambios Físicos de la Materia - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   Donde para el agua a 1\text{ atm}:
   * Calor latente de fusión: L_f = 80\text{ cal/g} (334\text{ J/g}).
   * Calor latente de solidificación: L_s = -80\text{ cal/g}.
   * Calor latente de vaporización: L_v = 540\text{ cal/g} (2260\text{ J/g}).
   * Calor latente de condensación: L_c = -540\text{ cal/g}.

### 3.4. Relación Materia - Energía (Albert Einstein, 1905)
La Ley de Conservación Clásica de Lavoisier (materia) y Mayer (energía) se unifican en la Teoría de la Relatividad Especial: la masa y la energía son formas interconvertibles de una misma entidad fundamental.

1. **Ecuación de Equivalencia Masa - Energía:**
   E = m \cdot c^2 \quad \text{o} \quad \Delta E = \Delta m \cdot c^2
   Donde:
   * E: Energía liberada o absorbida en Joules (J = \text{kg}\cdot\text{m}^2/\text{s}^2) o Ergios (1\text{ erg} = 1\text{ g}\cdot\text{cm}^2/\text{s}^2).
   * c: Velocidad de la luz en el vacío:
     c \approx 3 \times 10^8\text{ m/s} = 3 \times 10^{10}\text{ cm/s}
   * Equivalencia: 1\text{ J} = 10^7\text{ ergios}.
2. **Masa Relativista en Movimiento:**
   Cuando una partícula subatómica alcanza velocidades comparables a la de la luz (v \to c), su masa inercial aparente m_f aumenta según el factor de Lorentz:
   m_f = \frac{m_0}{\sqrt{1 - \left(\frac{v}{c}\right)^2}}
   Donde m_0 es la masa en reposo de la partícula.

---

### 4. SISTEMAS DE UNIDADES Y CONSTANTES UNIVERSALES
* 1\text{ cal} = 4.184\text{ J} \approx 4.18\text{ J}
* 1\text{ BTU} = 252\text{ cal} = 1055\text{ J}
* 1\text{ kWh} = 3.6 \times 10^6\text{ J}
* 1\text{ u.m.a.} = 1.66 \times 10^{-24}\text{ g} \implies 1\text{ u.m.a.} \approx 931.5\text{ MeV}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia de Procesos:**
  * **"FU-VA-SUB" son calientes (+Q / Endo):** **Fu**sión, **Va**porización, **Sub**limación absorben calor.
  * **"SO-CON-DE" son frías (-Q / Exo):** **So**lidificación, **Con**densación, **De**posición liberan calor.
* **Hacking Einstein:**
  * 1\text{ gramo de materia} convertido íntegramente en energía equivale a:
    E = (10^{-3}\text{ kg})(3 \times 10^8\text{ m/s})^2 = 9 \times 10^{13}\text{ Joules} = 9 \times 10^{20}\text{ Ergios}
  * Guarda esta constante en la memoria: ¡1\text{ g} \equiv 9 \times 10^{13}\text{ J}! Si se desintegra 0.2\text{ g}, directamente calculas 0.2 \times 9 \times 10^{13} = 1.8 \times 10^{13}\text{ J}.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir evaporación con ebullición.** La evaporación ocurre solo en la superficie del líquido y a cualquier temperatura; la ebullición es un fenómeno turbulento de toda la masa líquida que ocurre a una temperatura fija donde la presión de vapor iguala a la presión atmosférica externa.
* **Trampa 2: Aplicar Q = m \cdot c_e \cdot \Delta T durante un cambio de fase.** ERROR GRAVE. Durante el cambio de fase la temperatura no cambia (\Delta T = 0); se debe usar Q = m \cdot L.
* **Trampa 3: Usar unidades no homogéneas en E = mc^2.** Si m está en gramos (g), c debe estar en \text{cm/s} (3 \times 10^{10}\text{ cm/s}) y la energía resultará en Ergios. Si m está en kilogramos (kg), c debe estar en \text{m/s} (3 \times 10^8\text{ m/s}) y la energía en Joules (J).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t02_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Usar unidades no homogéneas en E = mc^2. Si m está en gramos (g), c debe estar en \\text{cm/s} (3 \\times 10^{10}\\text{ cm/s}) y la energía resultará en Ergios.\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t02_s02_c02",
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
                    id = "quim_t02_s02_c03",
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
                    id = "quim_t02_s02_c04",
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
                    id = "quim_t02_s02_c05",
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
                    id = "quim_t02_s02_c06",
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
                    id = "quim_t02_s02_c07",
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
                    id = "quim_t02_s02_c08",
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
                    id = "quim_t02_s02_c09",
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
                    id = "quim_t02_s02_c10",
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
