package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t03_s01",
            title = "Estructura Atómica, Modelos y Núclidos - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Estructura Atómica, Modelos y Núclidos - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química General / Estructura de la Materia
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.6 / 10 (Tema clásico indispensable)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              EL ÁTOMO ACTUAL
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
  NÚCLEO ATÓMICO                                          ZONA EXTRANUCLEAR
 (99.99% de la masa,                                      (99.99% del volumen,
  carga positiva)                                          carga negativa)
         │                                                       │
  NUCLEONES FUNDAMENTALES                                 PARTÍCULA FUNDAMENTAL
  • Protones (p^+, carga +e)                          • Electrones (e^-, carga -e)
  • Neutrones (n^0, sin carga)                          • Se mueven en orbitales
         │
         ▼
NOTACIÓN DEL NÚCLIDO:  _Z^A X^q
  • A: Número de masa (A = Z + n)
  • Z: Número atómico / Carga nuclear (Z = p^+)
  • q: Carga eléctrica neta (q = p^+ - e^-)
         │
         ▼
ESPECIES QUÍMICAS NUCLEARES:
  • Isótopos (Hítopos): igual Z
  • Isóbaros: igual A
  • Isótonos: igual n
  • Isoelectrónicos: igual número y configuración electrónica
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Evolución Histórica de los Modelos Atómicos
1. **Modelo Atómico de John Dalton (1808) — "Esfera Rígida":**
   * El átomo es indivisible, indestructible, macizo e impenetrable.
   * Los átomos de un mismo elemento son idénticos en masa y propiedades. Explica las leyes ponderales de la química.
2. **Modelo de Joseph J. Thomson (1897 / 1904) — "Budín de Pasas":**
   * Descubrió el electrón mediante experimentos con tubos de rayos catódicos (determinó la relación carga/masa e/m).
   * El átomo es una esfera de masa uniforme cargada positivamente con electrones incrustados como pasas. Es eléctricamente neutro y divisible.
3. **Modelo Nuclear de Ernest Rutherford (1911) — "Sistema Planetario en Miniatura":**
   * Experimento con la lámina de oro bombardeada con partículas alfa (\alpha).
   * Demostró la existencia de un **núcleo central** diminuto, denso y positivo que concentra casi toda la masa, rodeado por electrones girando en órbitas concéntricas vacías (zona extranuclear).
   * *Limitación física clásica:* Según la electrodinámica de Maxwell, una carga acelerada emite radiación y colapsaría en espiral hacia el núcleo.
4. **Modelo de Niels Bohr (1913) — "Órbitas Cuantizadas Estacionarias":**
   * Aplica la teoría cuántica de Planck al átomo de hidrógeno (átomos monoelectrónicos: H, He^+, Li^{2+}).
   * **Postulados de Bohr:**
     1. El electrón gira solo en ciertas órbitas circulares estacionarias permitidas sin radiar energía.
     2. Momento angular cuantizado: L = m \cdot v \cdot r = n \frac{h}{2\pi} (n = 1, 2, 3\dots).
     3. Salto cuántico: El electrón emite o absorbe un fotón de energía \Delta E = h\nu = \frac{hc}{\lambda} solo al transitar entre órbitas (E_{\text{fotón}} = E_{\text{final}} - E_{\text{inicial}}).
5. **Modelo de Arnold Sommerfeld (1916):** Introduce órbitas elípticas y subniveles de energía (número cuántico secundario o azimutal l).

### 3.2. Estructura y Partículas Subatómicas Fundamentales
| Partícula | Símbolo | Masa absoluta (kg) | Masa (u.m.a.) | Carga absoluta (C) | Carga relativa | Descubridor |
| :--- | :---: | :---: | :---: | :---: | :---: | :--- |
| **Neutrón** | n^0 | 1.6749 \times 10^{-27} | 1.008665 | 0 | 0 | James Chadwick (1932) |
| **Protón** | p^+ | 1.6726 \times 10^{-27} | 1.007276 | +1.602 \times 10^{-19} | +1 | Ernest Rutherford (1919) |
| **Electrón** | e^- | 9.1094 \times 10^{-31} | 0.000548 | -1.602 \times 10^{-19} | -1 | J.J. Thomson (1897) |

* **Relación de masas:**
  m(n^0) > m(p^+) \gg m(e^-)
  \frac{m(p^+)}{m(e^-)} \approx 1836 \quad ; \quad \frac{m(n^0)}{m(e^-)} \approx 1839

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. SISTEMA DE RADIACTIVIDAD NATURAL
* **Emisión Alfa (\alpha):** Núcleos de Helio (^4_2 He^{2+}). Bajo poder de penetración (una hoja de papel la detiene), alto poder ionizante.
  _Z^A X \to \, _{Z-2}^{A-4} Y + \, _2^4\alpha (Ley de Soddy-Fajans).
* **Emisión Beta (\beta^-):** Electrones nucleares de alta velocidad (^0_{-1}\beta o ^0_{-1}e). Poder de penetración medio (lámina de aluminio de 2-3\text{ mm}).

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t03_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"Dos especies con el mismo número de electrones son automáticamente isoelectrónicas\". FALSO EN ADMISIÓN UNI/UNSA. Para metales de transición no basta con tener igual núme\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t03_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: \"Los isótopos tienen diferentes propiedades químicas\". FALSO. Las propiedades químicas dependen fundamentalmente de la configuración de electrones de valencia y de la car\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t03_s01_c03",
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
                    id = "quim_t03_s01_c04",
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
                    id = "quim_t03_s01_c05",
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
                    id = "quim_t03_s01_c06",
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
                    id = "quim_t03_s01_c07",
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
                    id = "quim_t03_s01_c08",
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
                    id = "quim_t03_s01_c09",
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
                    id = "quim_t03_s01_c10",
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
            id = "quim_t03_s02",
            title = "Estructura Atómica, Modelos y Núclidos - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Estructura Atómica, Modelos y Núclidos - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.3. Notación y Relaciones del Núclido
Un núclido es la representación simbólica de un átomo con composición nuclear definida:
_Z^A X^q
* **A (Número de Masa / Nucleones Fundamentales):**
  A = Z + n^0
* **Z (Número Atómico / Carga Nuclear):**
  Z = \text{número de protones } (p^+)
  * Identifica unívocamente al elemento químico en la tabla periódica.
* **q (Carga Eléctrica Neta del Ión):**
  q = p^+ - e^- = Z - e^- \implies e^- = Z - q
  * Átomo neutro (q = 0): Se cumple la regla del "PEZE":
    p^+ = e^- = Z
  * Catión (q = +n): Pérdida de n electrones (e^- = Z - n). Se reduce el radio atómico.
  * Anión (q = -n): Ganancia de n electrones (e^- = Z + n). Se incrementa el radio atómico.

### 3.4. Tipos de Núclidos y Relaciones Nucleares
1. **Isótopos (Hítopos):** Átomos del **mismo elemento** (Z_1 = Z_2) con diferente número de masa (A) y diferente número de neutrones (n). Poseen idénticas propiedades químicas pero distintas propiedades físicas (ej. densidad, masa).
   * *Isótopos del Hidrógeno:*
     * Protio (^1_1 H): 1p^+, 0n^0, 1e^-. Es el más abundante (99.98\%). Forma el agua común (H_2O).
     * Deuterio (^2_1 H o D): 1p^+, 1n^0, 1e^-. Forma el "agua pesada" (D_2O), usada como moderador nuclear.
     * Tritio (^3_1 H o T): 1p^+, 2n^0, 1e^-. Radiactivo (\beta^-). Forma el "agua súper pesada" (T_2O).
2. **Isóbaros:** Átomos de **elementos diferentes** con igual número de masa (A_1 = A_2), pero diferente Z y diferente n. Tienen propiedades químicas y físicas distintas (ej. ^{40}_{18}Ar y ^{40}_{20}Ca).
3. **Isótonos:** Átomos de **elementos diferentes** con igual número de neutrones (n_1 = n_2), pero diferente A y diferente Z (ej. ^{23}_{11}Na y ^{24}_{12}Mg, ambos tienen n = 12).
4. **Especies Isoelectrónicas:** Iones o átomos que poseen el **mismo número total de electrones** y la **misma configuración electrónica** en su estado basal (ej. ^{23}_{11}Na^+ [10e^-], ^{19}_9F^- [10e^-], ^{20}_{10}Ne [10e^-]; configuración 1s^2 2s^2 2p^6).

### 3.5. Masa Atómica Promedio (P.A.)
La masa atómica de un elemento que figura en la tabla periódica es el promedio ponderado de las masas atómicas de sus isótopos naturales estables según su abundancia porcentual (\%):
\overline{P.A.}(X) = \frac{A_1 \cdot \%_1 + A_2 \cdot \%_2 + \dots + A_k \cdot \%_k}{100\%}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
  _Z^A X \to \, _{Z+1}^A Y + \, _{-1}^0\beta (Un neutrón nuclear decae en un protón, un electrón y un antineutrino: n^0 \to p^+ + e^- + \bar{\nu}).
* **Radiación Gamma (\gamma):** Radiación electromagnética de alta energía y frecuencia (^0_0\gamma). Muy alto poder de penetración (requiere muros gruesos de plomo u hormigón). No altera Z ni A.

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia para Tipos de Núclidos:**
  * Isóto**p**os \to Igual **P**rotones (Z).
  * Isóba**r**os \to Igual Masa (**A**).
  * Isóto**n**os \to Igual **N**eutrones (n).
  * Iso**e**lectrónicos \to Igual **E**lectrones (e^-).
* **Mnemotecnia del Hidrógeno:**
  * **PRO-DEU-TRI** con neutrones **0 - 1 - 2**:
    * **Pro**tio: 0 neutrones.
    * **Deu**terio: 1 neutrón.
    * **Tri**tio: 2 neutrones.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "Dos especies con el mismo número de electrones son automáticamente isoelectrónicas".** FALSO EN ADMISIÓN UNI/UNSA. Para metales de transición no basta con tener igual número de electrones, deben tener la **misma configuración electrónica**. Ejemplo: ^{20}Ca^{2+} (18e^-) y ^{26}Fe^{8+} (18e^-) o comparaciones entre bloques s, p y d que difieren en la distribución energética.
* **Trampa 2: "Los isótopos tienen diferentes propiedades químicas".** FALSO. Las propiedades químicas dependen fundamentalmente de la configuración de electrones de valencia y de la carga nuclear (Z). Los isótopos tienen exactamente el mismo Z, por lo que reaccionan químicamente igual.
* **Trampa 3: "La masa del electrón es despreciable, por ende es cero".** FALSO. Es pequeña (1/1836 de la masa del protón), pero NO es nula (9.109 \times 10^{-28}\text{ g}).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t03_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"La masa del electrón es despreciable, por ende es cero\". FALSO. Es pequeña (1/1836 de la masa del protón), pero NO es nula (9.109 \\times 10^{-28}\\text{ g}).  ---\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t03_s02_c02",
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
                    id = "quim_t03_s02_c03",
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
                    id = "quim_t03_s02_c04",
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
                    id = "quim_t03_s02_c05",
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
                    id = "quim_t03_s02_c06",
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
                    id = "quim_t03_s02_c07",
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
                    id = "quim_t03_s02_c08",
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
                    id = "quim_t03_s02_c09",
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
                    id = "quim_t03_s02_c10",
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
