package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t04_s01",
            title = "Estructura Electrónica y Tabla Periódica Moderna - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Estructura Electrónica y Tabla Periódica Moderna - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Mecánica Cuántica Química y Periodicidad
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Números cuánticos, excepciones Aufbau, periodicidad)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.8 / 10 (Imprescindible en todo examen de admisión)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         ESTRUCTURA ELECTRÓNICA Y TABLA PERIÓDICA
                                            │
         ┌──────────────────────────────────┴──────────────────────────────────┐
         ▼                                                                     ▼
NÚMEROS CUÁNTICOS (4)                                                 CONFIGURACIÓN ELECTRÓNICA
• n: Nivel principal (tamaño/energía)                               • Principio de Aufbau (Energía Relativa)
• l: Subnivel (forma: s, p, d, f)                                  • Principio de Exclusión de Pauli
• m_l: Orbital (orientación espacial)                               • Regla de Máxima Multiplicidad de Hund
• m_s: Spin (giro del electrón: \pm 1/2)                          • Anomalías / Antiserrucho (d^4 \to d^5, d^9 \to d^{10})
                                                                               │
         ┌─────────────────────────────────────────────────────────────────────┘
         ▼
TABLA PERIÓDICA MODERNA
• Ley Periódica Moderna (Henry Moseley): Propiedades en función creciente de Z.
• Organización: 7 Períodos (filas) y 18 Grupos / 16 Familias (columnas: A y B).
• Bloques: s, p (Representativos), d (Transición), f (Transición Interna / Tierras Raras).
• Propiedades Periódicas:
  - Crecen hacia \leftarrow \downarrow: Radio Atómico (RA), Radio Iónico, Carácter Metálico (CM).
  - Crecen hacia \rightarrow \uparrow: Electronegatividad (EN), Energía de Ionización (EI),
                                        Afinidad Electrónica (AE), Carácter No Metálico (CNM).
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Números Cuánticos y Orbitales Atómicos
Derivan de la solución matemática de la ecuación de onda no relativista de Erwin Schrödinger (1926): \hat{H}\Psi = E\Psi.
Los tres primeros números cuánticos (n, l, m_l) definen al **orbital atómico** (REEMPE: Región de Espacio Energético de Manifestación Probabilística del Electrón). El cuarto número cuántico (m_s) caracteriza al electrón individual.

1. **Número Cuántico Principal (n):**
   * *Para el electrón:* Determina el nivel principal de energía y su distancia promedio al núcleo.
   * *Para el orbital:* Define el volumen efectivo o tamaño del orbital.
   * *Valores permitidos:* n \in \{1, 2, 3, 4, 5, 6, 7, \dots, \infty\} o capas \{K, L, M, N, O, P, Q\}.
   * *Capacidad máxima:* 2n^2 electrones por nivel; n^2 orbitales por nivel.
2. **Número Cuántico Secundario o Azimutal (l):**
   * *Para el electrón:* Determina el subnivel de energía donde se halla.
   * *Para el orbital:* Define la forma geométrica o simetría espacial de la nube electrónica.
   * *Valores permitidos:* l \in \{0, 1, 2, \dots, n-1\}.
   * *Subniveles:*
     * l = 0 (s - Sharp): Esférico. Contiene 1 orbital (2e^- máx).
     * l = 1 (p - Principal): Dilobular o bilobular. Contiene 3 orbitales: p_x, p_y, p_z (6e^- máx).
     * l = 2 (d - Diffuse): Tetralobular (salvo d_{z^2} que es bilobular con toroide anular). Contiene 5 orbitales (10e^- máx).
     * l = 3 (f - Fundamental): Octalobular / compleja. Contiene 7 orbitales (14e^- máx).
   * *Capacidad máxima del subnivel:* 2(2l + 1) electrones; (2l + 1) orbitales.
3. **Número Cuántico Magnético (m_l o m):**
   * Determina la orientación espacial tridimensional del orbital bajo un campo magnético externo.
   * *Valores permitidos:* m_l \in \{-l, \dots, 0, \dots, +l\}.
4. **Número Cuántico de Spin Magnético (m_s o s):**
   * Introducido empíricamente por Uhlenbeck y Goudsmit (y fundamentado por Paul Dirac).
   * Describe el momento intrínseco de giro angular y campo magnético propio del electrón.
   * *Valores permitidos:* m_s \in \{+1/2, -1/2\} (antiparalelos).

### 3.2. Principios de la Configuración Electrónica
1. **Principio de Aufbau (Construcción Progresiva):**
   Los electrones se ubican de menor a mayor contenido de **Energía Relativa (E_R)**:
   E_R = n + l
   * Si dos o más subniveles tienen la misma E_R (subniveles *degenerados*), es más estable el que tiene menor nivel principal n.
   * *Secuencia Nemotécnica del Serrucho:*
     1s^2 \to 2s^2 \to 2p^6 \to 3s^2 \to 3p^6 \to 4s^2 \to 3d^{10} \to 4p^6 \to 5s^2 \to 4d^{10} \to 5p^6 \to 6s^2 \to 4f^{14} \to 5d^{10} \to 6p^6 \to 7s^2 \to 5f^{14} \to 6d^{10} \to 7p^6
2. **Principio de Exclusión de Wolfgang Pauli (1925):**
   En un mismo átomo no pueden existir dos electrones con sus cuatro números cuánticos idénticos. Como mínimo deben diferir en el spin (m_s).
   * *Consecuencia:* Un orbital atómico puede albergar como máximo a 2 electrones con espines opuestos (apareados).
3. **Regla de Máxima Multiplicidad de Friedrich Hund:**
   Al llenar orbitales de un mismo subnivel degenerado, los electrones ocupan primero el mayor número posible de orbitales con espines paralelos (m_s = +1/2), y solo se aparean cuando todos los orbitales contienen ya un electrón (desapareado / semilleno).
4. **Casos Especiales de Inestabilidad (Anomalías / Antiserrucho):**
   Las configuraciones que culminan en ns^2 (n-1)d^4 o ns^2 (n-1)d^9 son energéticamente inestables. Un electrón del orbital s salta espontáneamente al orbital d para adquirir mayor estabilidad por simetría esférica de subnivel semilleno (d^5) o lleno (d^{10}):
   * Grupo VIB (Cr, Mo):
     _{24}Cr: [Ar] 4s^2 3d^4 \text{ (Inestable)} \implies [Ar] 4s^1 3d^5 \text{ (Real)}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. RESUMEN DE VARIACIÓN PERIÓDICA
\begin{array}{|c|c|c|}
\hline
\textbf{Propiedad} & \textbf{En un Grupo (Vertical)} & \textbf{En un Período (Horizontal)} \\
\hline
\text{Radio Atómico } (RA) & \text{Aumenta hacia abajo } (\downarrow) & \text{Aumenta hacia la izquierda } (\leftarrow) \\
\text{Carácter Metálico } (CM) & \text{Aumenta hacia abajo } (\downarrow) & \text{Aumenta hacia la izquierda } (\leftarrow) \\

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t04_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Quitar electrones del subnivel d antes del s en cationes. En el ^{28}Ni^{2+}, jamás retires electrones de 3d^8 antes de agotar el 4s^2. La configuración correct\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t04_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Creer que el Flúor tiene mayor afinidad electrónica que el Cloro. FALSO. Aunque el Flúor es el más electronegativo, debido al tamaño extraordinariamente pequeño de su orb\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t04_s01_c03",
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
                    id = "quim_t04_s01_c04",
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
                    id = "quim_t04_s01_c05",
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
                    id = "quim_t04_s01_c06",
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
                    id = "quim_t04_s01_c07",
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
                    id = "quim_t04_s01_c08",
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
                    id = "quim_t04_s01_c09",
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
                    id = "quim_t04_s01_c10",
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
            id = "quim_t04_s02",
            title = "Estructura Electrónica y Tabla Periódica Moderna - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Estructura Electrónica y Tabla Periódica Moderna - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   * Grupo IB (Cu, Ag, Au):
     _{29}Cu: [Ar] 4s^2 3d^9 \text{ (Inestable)} \implies [Ar] 4s^1 3d^{10} \text{ (Real)}

### 3.3. Configuración Electrónica de Iones
* **Para un Anión (X^{q-}):** Se halla el número total de electrones (Z + q) y se distribuye normalmente con el serrucho.
* **Para un Catión (X^{q+}):** ¡CUIDADO EXAMEN!
  1. Primero se realiza la configuración electrónica del átomo neutro (Z).
  2. Luego se retiran los q electrones comenzando estrictamente por el **nivel más externo** (mayor n), y si este se vacía, del subnivel inmediato de mayor energía.
  * *Ejemplo:* ^{26}Fe \to [Ar] 4s^2 3d^6. Para ^{26}Fe^{3+}, se pierden primero los dos electrones de 4s y luego uno de 3d: ^{26}Fe^{3+} \to [Ar] 3d^5.

### 3.4. Tabla Periódica Moderna y Clasificación
* **Ley Periódica Moderna (Henry Moseley, 1913):** "Las propiedades físicas y químicas de los elementos químicos son funciones periódicas de sus números atómicos crecientes (Z)".
* **Diseño Estructural (Alfred Werner):**
  * **7 Períodos (Filas horizontales):** Coinciden con el número cuántico principal más alto del nivel ocupado (n_{\text{máx}}).
  * **18 Columnas / Grupos:**
    * **Elementos Representativos (Grupo A / Bloques s y p):** Terminan en s o p.
      * IA (Alcalinos): ns^1 (valencia +1)
      * IIA (Alcalinotérreos): ns^2 (valencia +2)
      * IIIA (Boroideos o Térreos): ns^2 np^1
      * IVA (Carbonoideos): ns^2 np^2
      * VA (Nitrogenoideos): ns^2 np^3
      * VIA (Calcógenos o Anfígenos): ns^2 np^4
      * VIIA (Halógenos): ns^2 np^5
      * VIIIA (Gases Nobles): ns^2 np^6 (salvo He: 1s^2)
    * **Elementos de Transición (Grupo B / Bloque d):** Terminan en ns^2 (n-1)d^x. Su grupo es (2 + x). Si la suma es 8, 9 o 10 pertenecen al grupo VIIIB (Fe, Co, Ni). Si suma 11 es IB, si suma 12 es IIB.
    * **Elementos de Transición Interna (Bloque f):** Lantánidos (4f) y Actínidos (5f). Pertenecen formalmente al grupo IIIB.

### 3.5. Propiedades Periódicas Fundamentales
1. **Radio Atómico (RA):** Mitad de la distancia internuclear entre dos átomos idénticos unidos por enlace covalente simple.
   * En un período: aumenta hacia la izquierda (\leftarrow) por disminución de la Carga Nuclear Efectiva (Z_{\text{ef}}).
   * En un grupo: aumenta hacia abajo (\downarrow) por aumento del número de capas (n).
2. **Radio Iónico (RI):**
   * Para una misma especie: RI(\text{anión}) > RA(\text{neutro}) > RI(\text{catión}).
   * Para especies isoelectrónicas: A mayor carga nuclear (Z), menor radio iónico (más atracción nuclear):
     _{7}N^{3-} > \, _{8}O^{2-} > \, _{9}F^- > \, _{11}Na^+ > \, _{12}Mg^{2+} > \, _{13}Al^{3+}
3. **Energía o Potencial de Ionización (EI):** Energía mínima requerida para arrancar el electrón más externo de un átomo o ión en estado gaseoso fundamental:
   X_{(g)} + EI_1 \to X^+_{(g)} + 1e^- \quad (EI_1 < EI_2 < EI_3 \dots)
   * Aumenta hacia arriba y a la derecha (\rightarrow \uparrow). Máximo en los Gases Nobles (Helio).
4. **Electronegatividad (EN):** Capacidad de un átomo enlazado en una molécula para atraer hacia sí el par de electrones compartidos (Escala de Linus Pauling: Flúor = 4.0 [máximo]; Francio y Cesio = 0.7 [mínimos]).
   * Aumenta hacia arriba y a la derecha (\rightarrow \uparrow).
5. **Afinidad Electrónica (AE):** Energía liberada o absorbida cuando un átomo gaseoso neutro en estado basal captura un electrón para formar un anión monovalente:
   X_{(g)} + 1e^- \to X^-_{(g)} + AE
   * Aumenta hacia arriba y a la derecha (\rightarrow \uparrow). El Cloro posee la mayor afinidad electrónica exotérmica.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
\text{Electronegatividad } (EN) & \text{Aumenta hacia arriba } (\uparrow) & \text{Aumenta hacia la derecha } (\rightarrow) \\
\text{Energía de Ionización } (EI) & \text{Aumenta hacia arriba } (\uparrow) & \text{Aumenta hacia la derecha } (\rightarrow) \\
\text{Afinidad Electrónica } (AE) & \text{Aumenta hacia arriba } (\uparrow) & \text{Aumenta hacia la derecha } (\rightarrow) \\
\hline
\end{array}

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia del Serrucho:**
  * **"Sí, Sopa Sopa, Se Da Pensión, Se Da Pensión, Se Fue De Paseo, Se Fue De Paseo"**
  * 1s \mid 2s \ 2p \mid 3s \ 3p \mid 4s \ 3d \ 4p \mid 5s \ 4d \ 5p \mid 6s \ 4f \ 5d \ 6p \mid 7s \ 5f \ 6d \ 7p.
* **Mnemotecnia de los Gases Nobles para Kernel de Configuración:**
  * **He**lio (2), **Ne**ón (10), **Ar**gón (18), **Kr**iptón (36), **Xe**nón (54), **Ra**dón (86).
  * *"Helena Negra Ardiente Quiere Cero Rayas"*.
* **Mnemotecnia de Flechas Periódicas:**
  * Las que tienen prefijo "E" o "A" (**E**lectronegatividad, **E**nergía de ionización, **A**finidad electrónica) crecen hacia el **Extremo Arriba-Derecha** (\nearrow).
  * El **R**adio atómico y carácter metálico crecen hacia el **R**incón Abajo-Izquierda (\swarrow).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Quitar electrones del subnivel d antes del s en cationes.** En el ^{28}Ni^{2+}, jamás retires electrones de 3d^8 antes de agotar el 4s^2. La configuración correcta de ^{28}Ni^{2+} es [Ar] 3d^8 y NO [Ar] 4s^2 3d^6.
* **Trampa 2: Creer que el Flúor tiene mayor afinidad electrónica que el Cloro.** FALSO. Aunque el Flúor es el más electronegativo, debido al tamaño extraordinariamente pequeño de su orbital 2p, la densidad electrónica genera fuerte repulsión al nuevo electrón. Por ello, el **Cloro (Cl)** tiene la mayor afinidad electrónica neta liberada del sistema periódico.
* **Trampa 3: "La Tabla Periódica de Mendeleiev se basó en el número atómico".** FALSO. Mendeleiev y Meyer la ordenaron en función de la **masa atómica creciente**, lo que generó anomalías como el par Te-I o Co-Ni. Fue Henry Moseley quien demostró que la periodicidad se debe al número atómico (Z).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t04_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"La Tabla Periódica de Mendeleiev se basó en el número atómico\". FALSO. Mendeleiev y Meyer la ordenaron en función de la masa atómica creciente, lo que generó anomalías c\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t04_s02_c02",
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
                    id = "quim_t04_s02_c03",
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
                    id = "quim_t04_s02_c04",
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
                    id = "quim_t04_s02_c05",
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
                    id = "quim_t04_s02_c06",
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
                    id = "quim_t04_s02_c07",
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
                    id = "quim_t04_s02_c08",
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
                    id = "quim_t04_s02_c09",
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
                    id = "quim_t04_s02_c10",
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
