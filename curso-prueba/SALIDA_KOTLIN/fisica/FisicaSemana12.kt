package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana12 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t12_s01",
            title = "FÍSICA MODERNA - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "FÍSICA MODERNA - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 12 - FÍSICA MODERNA (CUÁNTICA, RELATIVIDAD Y FÍSICA NUCLEAR)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), POSTULADOS Y MODELOS CUÁNTICO-RELATIVISTAS
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[FÍSICA MODERNA] --> B[Física Cuántica Temprana]
    A --> C[Relatividad Especial de Einstein]
    A --> D[Física Nuclear y Radiactividad]

    B --> B1[Radiación de Cuerpo Negro: Hipótesis de Planck E = hf]
    B --> B2[Efecto Fotoeléctrico: hf = Φ + Ec_max]
    B --> B3[Longitud de Onda de De Broglie: λ = h / p]
    B --> B4[Principio de Incertidumbre de Heisenberg: Δx Δp ≥ ℏ/2]

    C --> C1[Postulados: Invariancia de c y Covarianza de Leyes]
    C --> C2[Factor de Lorentz: γ = 1 / √(1 - v²/c²)]
    C --> C3[Dilatación Temporal t = γ t₀ y Contracción L = L₀/γ]
    C --> C4[Equivalencia Masa-Energía: E = mc²]

    D --> D1[Desintegraciones Radiactivas: α, β⁻, β⁺, γ]
    D --> D2[Ley de Decaimiento: N(t) = N₀ e^(-λt)]
    D --> D3[Periodo de Semidesintegración: t_1/2 = ln 2 / λ]
    D --> D4[Defecto de Masa y Fisión / Fusión Nuclear]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Crisis de la Física Clásica e Hipótesis de Planck
A finales del siglo XIX, la física clásica (electrodinámica de Maxwell y termodinámica estadística) fracasó al explicar la radiación térmica emitida por un cuerpo negro ideal.
- **La Catástrofe Ultravioleta:** La ley clásica de Rayleigh-Jeans predecía que la densidad de energía radiada tendía a infinito en frecuencias ultravioletas elevadas (\lambda \to 0), violando la conservación de energía.
- **Hipótesis Cuántica de Max Planck (1900):** La energía electromagnética no se emite ni se absorbe en forma continua, sino en paquetes discretos llamados *cuantos* (fotones), proporcionales a la frecuencia de oscilación de las cargas:
  E = n h f = n \frac{h c}{\lambda} \quad (n = 1, 2, 3, \dots)
  - Constante de Planck:
    h \approx 6.626 \times 10^{-34}\ \text{J}\cdot\text{s} \approx 4.136 \times 10^{-15}\ \text{eV}\cdot\text{s}
  - Constante reducida (Dirac): \hbar = \frac{h}{2\pi} \approx 1.054 \times 10^{-34}\ \text{J}\cdot\text{s}.
  - Equivalencia energética común: h c \approx 1240\ \text{eV}\cdot\text{nm}.

### 3.2. Efecto Fotoeléctrico de Albert Einstein (Premio Nobel 1921)
Fenómeno mediante el cual la radiación electromagnética incide sobre una superficie metálica y arranca electrones (fotoelectrones).
- **Inconsistencias con la Teoría Ondulatoria Clásica:**
  1. Clásicamente, la energía de los electrones expulsados debía aumentar con la intensidad de la luz incidente; experimentalmente depende exclusivamente de la **frecuencia** (f).
  2. Clásicamente, cualquier frecuencia con suficiente intensidad debía arrancar electrones tras un tiempo de acumulación; experimentalmente existe una **frecuencia umbral** (f_0) por debajo de la cual no hay emisión fotoeléctrica, independientemente de la intensidad o tiempo de exposición.
  3. La emisión es prácticamente **instantánea** (\Delta t < 10^{-9}\text{ s}).
- **Ecuación Fotoeléctrica de Einstein:**
  Cada fotón colisiona individualmente con un electrón del metal, cediéndole toda su energía:
  E_{\text{fotón}} = \Phi + E_{c,\max} \iff h f = \Phi + \frac{1}{2} m v_{\max}^2

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Teoría de la Relatividad Especial (Einstein, 1905)
Se fundamenta en dos postulados:
1. **Primer Postulado (Principio de Relatividad):** Las leyes de la física son idénticas en todos los sistemas de referencia inerciales.
2. **Segundo Postulado (Constancia de la Rapidez de la Luz):** La velocidad de la luz en el vacío es una constante universal c = 3 \times 10^8\text{ m/s}, independiente del movimiento de la fuente emisora o del observador.

- **Factor de Lorentz (\gamma):**
  \gamma = \frac{1}{\sqrt{1 - \beta^2}} = \frac{1}{\sqrt{1 - \frac{v^2}{c^2}}} \quad (\gamma \ge 1)
- **Efectos Cinemáticos Relativistas:**
  1. **Dilatación Temporal:** El tiempo medido en un sistema respecto al cual el reloj se mueve (t) es mayor que el tiempo propio (t_0):
     t = \gamma t_0 = \frac{t_0}{\sqrt{1 - v^2/c^2}}
  2. **Contracción de la Longitud:** La longitud de un cuerpo en la dirección de su movimiento relativo se contrae respecto a su longitud propia en reposo (L_0):
     L = \frac{L_0}{\gamma} = L_0 \sqrt{1 - \frac{v^2}{c^2}}
- **Dinámica Relativista y Equivalencia Masa-Energía:**
  - Cantidad de movimiento relativista: \vec{p} = \gamma m_0 \vec{v}.
  - Energía en reposo: E_0 = m_0 c^2.
  - Energía total relativista:
    E = \gamma m_0 c^2 = E_k + m_0 c^2
  - Relación fundamental energía-momento:
    E^2 = (p c)^2 + (m_0 c^2)^2
    (Para fotones con m_0 = 0 \implies E = p c).

### 4.2. Física Nuclear y Radiactividad

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t12_s01_c01",
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
                    id = "fis_t12_s01_c02",
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
                    id = "fis_t12_s01_c03",
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
                    id = "fis_t12_s01_c04",
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
                    id = "fis_t12_s01_c05",
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
                    id = "fis_t12_s01_c06",
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
                    id = "fis_t12_s01_c07",
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
                    id = "fis_t12_s01_c08",
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
                    id = "fis_t12_s01_c09",
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
                    id = "fis_t12_s01_c10",
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
            id = "fis_t12_s02",
            title = "FÍSICA MODERNA - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "FÍSICA MODERNA - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  - \Phi = h f_0 = \frac{h c}{\lambda_0}: Función trabajo o función de extracción (energía mínima de ligadura del electrón al metal) [\text{eV} \text{ o } \text{J}].
  - f_0: Frecuencia umbral.
  - \lambda_0: Longitud de onda de corte máxima para emisión.
- **Potencial de Frenado o de Corte (V_s):**
  Diferencia de potencial eléctrico retardador necesario para detener a los fotoelectrones más energéticos:
  E_{c,\max} = e V_s \implies e V_s = h f - \Phi \implies V_s = \left(\frac{h}{e}\right) f - \frac{\Phi}{e}
  (Gráfica de V_s vs f: recta lineal de pendiente universal h/e).

### 3.3. Dualidad Onda-Partícula y Principio de Incertidumbre
1. **Hipótesis Ondulatoria de Louis de Broglie (1924):**
   Si la luz (onda clásica) posee propiedades corpusculares (fotones con momento p = E/c = h/\lambda), toda partícula material con masa m y velocidad v posee una onda asociada cuya longitud de onda es:
   \lambda = \frac{h}{p} = \frac{h}{m v}
   Confirmado experimentalmente por la difracción de electrones en cristales de níquel (experimento de Davisson-Germer, 1927).
2. **Principio de Incertidumbre de Werner Heisenberg (1927):**
   Es físicamente imposible determinar simultáneamente y con precisión arbitraria la posición (x) y la cantidad de movimiento lineal (p_x) de una partícula:
   \Delta x \cdot \Delta p_x \ge \frac{\hbar}{2}
   Relación análoga tiempo-energía:
   \Delta E \cdot \Delta t \ge \frac{\hbar}{2}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
1. **Estructura Nuclear y Defecto de Masa (\Delta m):**
   La masa de un núcleo atómico es menor que la suma de las masas de sus nucleones libres constitutivos:
   \Delta m = [Z \cdot m_p + (A - Z) \cdot m_n] - m_{\text{núcleo}}
   - **Energía de Enlace Nuclear (E_b):**
     E_b = \Delta m \cdot c^2 \quad (1\text{ u} \cdot c^2 \approx 931.5\text{ MeV})
2. **Tipos de Desintegración Radiactiva:**
   - **Alfa (\alpha):** Emisión de un núcleo de Helio (^4_2\text{He}):
     ^A_Z X \longrightarrow ^{A-4}_{Z-2} Y + ^4_2\alpha
   - **Beta Menos (\beta^-):** Emisión de un electrón y un antineutrino electrónico:
     ^1_0 n \longrightarrow ^1_1 p + ^0_{-1} e^- + \bar{\nu}_e \implies ^A_Z X \longrightarrow ^A_{Z+1} Y + ^0_{-1}\beta^- + \bar{\nu}_e
   - **Beta Más (\beta^+):** Emisión de un positrón y un neutrino electrónico:
     ^1_1 p \longrightarrow ^1_0 n + ^0_{+1} e^+ + \nu_e \implies ^A_Z X \longrightarrow ^A_{Z-1} Y + ^0_{+1}\beta^+ + \nu_e
   - **Gamma (\gamma):** Desexcitación nuclear mediante fotones de altísima energía sin cambio en A ni en Z:
     ^A_Z X^* \longrightarrow ^A_Z X + \gamma
3. **Ley de Decaimiento Radiactivo:**
   N(t) = N_0 e^{-\lambda t} = N_0 \left(\frac{1}{2}\right)^{t / t_{1/2}}
   - \lambda: Constante de desintegración radiactiva [\text{s}^{-1}].
   - **Periodo de Semidesintegración o Vida Media (t_{1/2}):**
     t_{1/2} = \frac{\ln 2}{\lambda} \approx \frac{0.693}{\lambda}
   - **Actividad (A):** Tasa de desintegración por unidad de tiempo:
     A(t) = -\frac{dN}{dt} = \lambda N(t) \quad [\text{Becquerel, Bq} = \text{desint/s}; \quad 1\text{ Curie, Ci} = 3.7 \times 10^{10}\text{ Bq}]

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Intensidad de la Luz vs. Energía de los Fotoelectrones):** Aumentar la intensidad luminosa (brillo) **NO** incrementa la energía cinética máxima de los electrones ni el potencial de frenado; solo aumenta el número de fotones por segundo y, por tanto, la **corriente fotoeléctrica de saturación**.
- **Trampa 2 (Unidades de Energía en Fotones):** Muy a menudo la función trabajo viene en \text{eV} y la constante h en \text{J}\cdot\text{s}. ¡Recuerda convertir siempre con 1\text{ eV} = 1.6 \times 10^{-19}\text{ J} o usar h \approx 4.14 \times 10^{-15}\text{ eV}\cdot\text{s}!
- **Trampa 3 (Contracción Espacial Transversal):** La contracción de Lorentz ocurre **única y exclusivamente en la dirección paralela a la velocidad**. Las dimensiones perpendiculares al movimiento relativo no se modifican.
- **Trampa 4 (Masa en Relatividad):** La masa propia m_0 es un invariante de Lorentz. Cuando una partícula se acelera a velocidades cercanas a c, su momento p = \gamma m_0 v y su energía E = \gamma m_0 c^2 tienden a infinito, requiriendo un trabajo infinito para alcanzar c; de ahí que ninguna partícula con masa propia pueda alcanzar la velocidad de la luz.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Efecto Fotoeléctrico de Einstein:**
   > **"FOTÓN = TRABAJO + CINÉTICA"** \implies hf = \Phi + E_{c,\max}
2. **Longitud de Onda de De Broglie:**
   > **"LAMBDA = HACHE SOBRE PIVO"** \implies \lambda = \frac{h}{p} = \frac{h}{mv}
3. **Regla de Soddy-Fajans en Emisión Alfa:**
   > *"El Alfa resta 4 arriba y 2 abajo"* (A - 4, Z - 2).
4. **Regla de Decaimiento por Periodos:**
   > En cada t_{1/2}, la masa remanente se parte a la mitad: 1 \to 1/2 \to 1/4 \to 1/8 \dots \left(\frac{1}{2}\right)^n.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Energía y Transición Energética:** Los reactores nucleares de fisión comercial de cuarta generación y los proyectos de fusión experimental (ITER, National Ignition Facility con confinamiento inercial y magnético Tokamak) buscan recrear la energía de las estrellas para producir electricidad masiva limpia y libre de carbono.
- **Arqueología y Geología:** La datación radiométrica por Carbono-14 (t_{1/2} = 5730\text{ años}) y Uranio-Plomo permite determinar con precisión cronológica la edad de fósiles orgánicos, civilizaciones humanas antiguas y la edad de la Tierra (4540\text{ millones de años}).
- **Tecnología Cuántica:** Sensores cuánticos de gravedad, criptografía cuántica inmune a espionaje (QKD mediante entrelazamiento de fotones) y transistores cuánticos en computadoras superconductoras operan gracias a los principios de superposición e incertidumbre.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t12_s02_c01",
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
                    id = "fis_t12_s02_c02",
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
                    id = "fis_t12_s02_c03",
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
                    id = "fis_t12_s02_c04",
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
                    id = "fis_t12_s02_c05",
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
                    id = "fis_t12_s02_c06",
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
                    id = "fis_t12_s02_c07",
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
                    id = "fis_t12_s02_c08",
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
                    id = "fis_t12_s02_c09",
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
                    id = "fis_t12_s02_c10",
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
