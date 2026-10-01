package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana09 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t09_s01",
            title = "ELECTRICIDAD - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ELECTRICIDAD - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 09 - ELECTRICIDAD (ELECTROSTÁTICA Y ELECTRODINÁMICA)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), CIRCUITOS Y CAMPOS VECTORIALES
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[ELECTRICIDAD] --> B[Electrostática]
    A --> C[Capacitancia y Condensadores]
    A --> D[Electrodinámica]

    B --> B1[Carga Eléctrica: Cuantización Q = ±ne]
    B --> B2[Ley de Coulomb: F = k|q1 q2| / r²]
    B --> B3[Campo Eléctrico: E = F/q = k|Q|/r²]
    B --> B4[Potencial y Trabajo: V = kQ/r ; W = -qΔV]

    C --> C1[Capacidad: C = Q / V = ε₀ A / d]
    C --> C2[Asociación: Serie 1/C_eq ; Paralelo ΣC_i]
    C --> C3[Energía Almacenada: U = 1/2 CV²]

    D --> D1[Corriente e Intensidad: I = Δq / Δt]
    D --> D2[Leyes de Resistencia: Pouillet R = ρL/A y Ohm V = IR]
    D --> D3[Leyes de Kirchhoff: Mallas y Nudos]
    D --> D4[Efecto Joule y Potencia: P = VI = I²R = V²/R]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Electrostática: Principios Fundamentales
- **Carga Eléctrica (q, Q):** Propiedad intrínseca de la materia asociada con interacciones electromagnéticas. Unidad SI: Coulomb (\text{C}).
  - **Cuantización de la carga:** Toda carga observable es un múltiplo entero de la carga elemental (e = 1.602 \times 10^{-19}\text{ C}):
    Q = \pm n e \quad (n \in \mathbb{Z}^+)
  - **Principio de Conservación de la Carga:** En un sistema eléctricamente aislado, la suma algebraica de las cargas se conserva en todo proceso físico: \sum Q_{\text{inicial}} = \sum Q_{\text{final}}.
  - **Formas de Electrización:** Por fricción (arrastre electrónico por afinidad), contacto (redistribución superficial) e inducción electrostática (polarización sin contacto y puesta a tierra).

### 3.2. Ley de Coulomb
La fuerza electrostática mutua entre dos cargas puntuales en reposo en el vacío es directamente proporcional al producto de sus valores absolutos e inversamente proporcional al cuadrado de la distancia que las separa:
\vec{F}_{12} = \frac{1}{4\pi\varepsilon_0} \frac{q_1 q_2}{r^2} \hat{r}_{12} = k_e \frac{|q_1 q_2|}{r^2} \hat{u}_r
- Constante electrostática en el vacío:
  k_e = \frac{1}{4\pi\varepsilon_0} \approx 8.98755 \times 10^9\ \frac{\text{N}\cdot\text{m}^2}{\text{C}^2} \approx 9 \times 10^9\ \frac{\text{N}\cdot\text{m}^2}{\text{C}^2}
  donde \varepsilon_0 = 8.854 \times 10^{-12}\ \text{C}^2/(\text{N}\cdot\text{m}^2) es la permitividad eléctrica del vacío.

### 3.3. Campo Eléctrico (\vec{E}) y Potencial Eléctrico (V)
1. **Intensidad de Campo Eléctrico (\vec{E}):** Modificación vectorial del espacio provocada por una distribución de carga; fuerza por unidad de carga testigo positiva:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Condensadores y Capacidad Eléctrica
1. **Capacidad Eléctrica (C):**
   C = \frac{Q}{V} \quad [\text{Faradio, } \text{F} = \text{C/V}]
2. **Condensador de Placas Planas Paralelas:**
   C = \kappa \frac{\varepsilon_0 A}{d}
   (\kappa \ge 1: constante dieléctrica del material interposed).
3. **Asociación de Condensadores:**
   - **En Serie (igual carga Q):**
     \frac{1}{C_{\text{eq}}} = \frac{1}{C_1} + \frac{1}{C_2} + \dots + \frac{1}{C_n}, \quad V_{\text{total}} = V_1 + V_2 + \dots
   - **En Paralelo (igual tensión V):**
     C_{\text{eq}} = C_1 + C_2 + \dots + C_n, \quad Q_{\text{total}} = Q_1 + Q_2 + \dots
4. **Energía Almacenada en un Condensador (U):**
   U = \frac{1}{2} Q V = \frac{1}{2} C V^2 = \frac{Q^2}{2C}

### 4.2. Electrodinámica: Corriente y Resistencia
1. **Intensidad de Corriente (I):**
   I = \frac{dq}{dt} \approx \frac{\Delta q}{\Delta t} \quad [\text{Amperio, } \text{A} = \text{C/s}]
   A nivel microscópico: I = n q A v_d (v_d: velocidad de arrastre o deriva de los portadores).
2. **Ley de Pouillet (Resistencia geométrica):**
   R = \rho \frac{L}{A}
   - \rho: resistividad del material [\Omega\cdot\text{m}]. Dependencia térmica: \rho(T) = \rho_0(1 + \alpha \Delta T).
   - L: longitud del conductor [\text{m}]; A: área transversal [\text{m}^2].
3. **Ley de Ohm:**

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t09_s01_c01",
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
                    id = "fis_t09_s01_c02",
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
                    id = "fis_t09_s01_c03",
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
                    id = "fis_t09_s01_c04",
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
                    id = "fis_t09_s01_c05",
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
                    id = "fis_t09_s01_c06",
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
                    id = "fis_t09_s01_c07",
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
                    id = "fis_t09_s01_c08",
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
                    id = "fis_t09_s01_c09",
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
                    id = "fis_t09_s01_c10",
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
            id = "fis_t09_s02",
            title = "ELECTRICIDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ELECTRICIDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   \vec{E} = \lim_{q_0 \to 0} \frac{\vec{F}}{q_0} \quad \left[\frac{\text{N}}{\text{C}} = \frac{\text{V}}{\text{m}}\right]
   Para una carga puntual Q:
   \vec{E} = k_e \frac{Q}{r^2} \hat{r} \quad (\text{Radial saliente si } Q > 0, \text{ radial entrante si } Q < 0)
   Principio de superposición: \vec{E}_{\text{neto}} = \sum \vec{E}_i.
2. **Potencial Eléctrico (V):** Magnitud escalar que mide la energía potencial electrostática por unidad de carga testigo:
   V = \frac{U_e}{q_0} \quad [\text{Voltio, } \text{V} = \text{J/C}]
   Para una carga puntual Q (con referencia V_\infty = 0):
   V = k_e \frac{Q}{r}
   Superposición escalar: V_{\text{total}} = \sum V_i (considerando signos algebraicos).
3. **Trabajo del Campo Eléctrico y Diferencia de Potencial (\Delta V):**
   Dado que el campo electrostático es conservativo:
   W_{A \to B}^{\text{campo}} = -\Delta U_e = q (V_A - V_B)
   W_{A \to B}^{\text{agente externo (sin acel.)}} = \Delta U_e = q (V_B - V_A) = q \Delta V
4. **Campo Uniforme entre Placas Paralelas:**
   E = \frac{\Delta V}{d} \iff V_A - V_B = E \cdot d
   (Las líneas de campo apuntan hacia donde el potencial disminuye).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   V = I \cdot R \iff I = \frac{V}{R} \quad \left(R = \text{cte para conductores óhmicos}\right)
4. **Asociación de Resistencias:**
   - **En Serie (igual corriente I):**
     R_{\text{eq}} = R_1 + R_2 + \dots + R_n
   - **En Paralelo (igual voltaje V):**
     \frac{1}{R_{\text{eq}}} = \frac{1}{R_1} + \frac{1}{R_2} + \dots + \frac{1}{R_n} \implies (\text{para dos}): R_{\text{eq}} = \frac{R_1 R_2}{R_1 + R_2}

### 4.3. Circuitos de Corriente Continua y Leyes de Kirchhoff
1. **Fuerza Electromotriz (\mathcal{E}) y Resistencia Interna (r):**
   Tensión en bornes de una fuente real:
   V_{\text{ab}} = \mathcal{E} - I r \quad (\text{en descarga/generador})
   V_{\text{ab}} = \mathcal{E} + I r \quad (\text{en carga/receptor})
2. **Primera Ley de Kirchhoff (Ley de Nudos - Conservación de Carga):**
   \sum I_{\text{entrantes}} = \sum I_{\text{salientes}} \iff \sum I_{\text{nudo}} = 0
3. **Segunda Ley de Kirchhoff (Ley de Mallas - Conservación de Energía):**
   \sum_{\text{malla cerrada}} \Delta V = 0 \iff \sum \mathcal{E} = \sum I R
4. **Potencia Eléctrica y Efecto Joule:**
   P = V \cdot I = I^2 R = \frac{V^2}{R} \quad [\text{Watt, W}]
   Energía disipada en forma de calor (Ley de Joule):
   Q = P \cdot \Delta t = I^2 R \Delta t \quad [\text{Joule}] \approx 0.24\, I^2 R \Delta t \quad [\text{calorías}]
5. **Instrumentos de Medida Ideales:**
   - **Amperímetro:** Se conecta estrictamente en **serie**; resistencia interna ideal R_A \to 0.
   - **Voltímetro:** Se conecta estrictamente en **paralelo**; resistencia interna ideal R_V \to \infty.

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Asociaciones Inversas de R y C):** Los condensadores se asocian de forma **inversa** a las resistencias:
  - Condensadores en paralelo: **se suman directamente** (C_{\text{eq}} = C_1 + C_2).
  - Resistencias en paralelo: **se suman las inversas** (1/R_{\text{eq}} = 1/R_1 + 1/R_2).
- **Trampa 2 (Estiramiento de un Conductor Metálico):** Si un alambre de resistencia R se estira hasta duplicar su longitud sin perder masa, **su volumen se conserva** (V = A \cdot L = \text{cte}). Por lo tanto, si la longitud se duplica (L' = 2L), el área se reduce a la mitad (A' = A/2). La nueva resistencia se cuadruplica:
  R' = \rho \frac{2L}{A/2} = 4 \left(\rho \frac{L}{A}\right) = 4R
  *(Fórmula hack: R' = n^2 R, donde n es el factor de elongación).*
- **Trampa 3 (Condensador en Corriente Continua Estable):** En régimen estacionario de corriente continua, una rama que contiene un condensador cargado actúa como un **circuito abierto** (I = 0 por esa rama).
- **Trampa 4 (Puente de Wheatstone):** Si en un cuadrilátero de resistencias se cumple el producto cruzado R_1 R_4 = R_2 R_3, el potencial entre los nodos intermedios es igual (\Delta V = 0) y la resistencia conectada en ese puente **puede eliminarse del circuito**.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Ley de Ohm:**
   > **"VICTORIA = REINA DE INGLATERRA"** \implies V = R \cdot I
2. **Potencia Eléctrica:**
   > **"P-V-I"** \implies P = V \cdot I; y **"P = I²R"** ("Puro Indio al Cuadrado con Resistencia").
3. **Ley de Pouillet:**
   > **"RE-PO-L-A"** \implies R = \rho \cdot \frac{L}{A}
4. **Regla de los signos en Mallas (Kirchhoff):**
   > *"Al cruzar una resistencia a favor de la corriente: resta potencial (-IR). Al salir por la placa larga de la pila: suma f.e.m. (+\mathcal{E})."*

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neurobiología y Fisiología:** Las neuronas transmiten impulsos nerviosos a través de potenciales de acción generados por gradientes electroquímicos de iones \text{Na}^+ y \text{K}^+, modelados mediante la ecuación de Nernst y circuitos equivalentes RC de membrana celular.
- **Microelectrónica:** Los transistores MOSFET, base de la computación moderna y los procesadores, modulan canales conductores mediante campos eléctricos en la puerta aislada por dióxido de silicio (óxido-semiconductor).
- **Seguridad Eléctrica Industrial:** Los interruptores diferenciales miden la Primera Ley de Kirchhoff en tiempo real: si la corriente entrante por la fase difiere de la corriente de retorno por el neutro (\Delta I > 30\text{ mA}), desconectan el circuito en milisegundos para evitar electrocuciones por fuga a tierra.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t09_s02_c01",
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
                    id = "fis_t09_s02_c02",
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
                    id = "fis_t09_s02_c03",
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
                    id = "fis_t09_s02_c04",
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
                    id = "fis_t09_s02_c05",
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
                    id = "fis_t09_s02_c06",
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
                    id = "fis_t09_s02_c07",
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
                    id = "fis_t09_s02_c08",
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
                    id = "fis_t09_s02_c09",
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
                    id = "fis_t09_s02_c10",
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
