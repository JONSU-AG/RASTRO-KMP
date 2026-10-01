package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana12 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t12_s01",
            title = "Ácidos, Bases y Escala de pH - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Ácidos, Bases y Escala de pH - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química Analítica y Equilibrio Iónico en Solución Acuosa
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Cálculo logarítmico de pH/pOH, ácidos/bases fuertes y débiles, hidrólisis de sales y soluciones buffer)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10 (Tema estrella indispensable en el examen de Biomédicas)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ÁCIDOS Y BASES
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
TEORÍAS ÁCIDO-BASE                                      AUTOIONIZACIÓN DEL AGUA
• Arrhenius: H^+ en agua / OH^- en agua             • 2H_2O \rightleftharpoons H_3O^+ + OH^-
• Brønsted-Lowry: Dona H^+ / Acepta H^+              • K_w = [H^+][OH^-] = 1.0 \times 10^{-14} (a 25 °C)
  (Pares Conjugados Ácido-Base)                                  │
• Lewis: Acepta par e^- / Dona par e^-                       ▼
                                                        ESCALA DE pH Y pOH (Sørensen)
                                                        • pH = -\log[H^+]  ;  pOH = -\log[OH^-]
                                                        • pH + pOH = 14  (a 25 °C)
                                                                 │
         ┌───────────────────────────────────────────────────────┴────────────────────────┐
         ▼                                                                                ▼
ELECTROLITOS FUERTES (100\% disociación)                              ELECTROLITOS DÉBILES (Equilibrio)
• Ácidos Fuertes: HCl, HBr, HI, HNO_3, HClO_4, H_2SO_4                • Ácidos Débiles: CH_3COOH, HF, HCN (K_a)
• Bases Fuertes: Hidróxidos del Grupo IA y IIA                          • Bases Débiles: NH_3, \text{aminas} (K_b)
  [H^+] = M_{\text{ácido}} \cdot \theta                                 [H^+] = \sqrt{K_a \cdot C_0}
  [OH^-] = M_{\text{base}} \cdot \theta                                 [OH^-] = \sqrt{K_b \cdot C_0}
                                                                                          │
         ┌────────────────────────────────────────────────────────────────────────────────┘
         ▼
SISTEMAS BUFFER / AMORTIGUADORES Y TITULACIÓN
• Ecuación de Henderson-Hasselbalch:  pH = pK_a + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Ácido Débil}]}\right)
• Hidrólisis Salina: Sal ácida, básica o neutra
• Curvas de Titulación y Punto de Equivalencia
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Teorías Modernas Ácido-Base

#### A. Teoría Clásica de Svante Arrhenius (1884)
* **Ácido:** Sustancia hidrogenada neutra que, al disolverse exclusivamente en agua, se disocia produciendo iones hidrógeno o protones (H^+ o H_3O^+):
  HA_{(ac)} \xrightarrow{H_2O} H^+_{(ac)} + A^-_{(ac)}
* **Base:** Sustancia que, al disolverse en agua, se disocia liberando iones hidróxido u oxhidrilo (OH^-):
  B(OH)_{n(ac)} \xrightarrow{H_2O} B^{n+}_{(ac)} + n OH^-_{(ac)}
* *Limitaciones de Arrhenius:* Solo es aplicable a disoluciones acuosas; no explica el carácter fuertemente básico de sustancias como el gas amoníaco (NH_3), que carecen del grupo OH en su fórmula molecular.

#### B. Teoría Protónica de Johannes Brønsted y Thomas Lowry (1923)
* **Ácido:** Toda especie química (molecular o iónica) capaz de **donar o ceder uno o más protones (H^+)** a otra especie.
* **Base:** Toda especie química capaz de **aceptar o recibir uno o más protones (H^+)**.
* **Pares Conjugados Ácido-Base:** Pareja de especies químicas que difieren exactamente en un único protón (H^+):
  \text{Ácido}_1 + \text{Base}_2 \rightleftharpoons \text{Base Conjugada}_1 + \text{Ácido Conjugado}_2
  * *Ejemplo:*
    CH_3COOH + H_2O \rightleftharpoons CH_3COO^- + H_3O^+
    - Par 1: CH_3COOH (ácido) / CH_3COO^- (base conjugada).
    - Par 2: H_2O (base) / H_3O^+ (ácido conjugado).
* **Sustancia Anfótera o Anfolito:** Sustancia que puede actuar como ácido o como base según el reactivo con el que interactúe (el agua H_2O, el ión bicarbonato HCO_3^-, el ión bisulfato HSO_4^-).
  * Regla de Fuerza: "A un ácido más fuerte le corresponde una base conjugada más débil, y viceversa".

#### C. Teoría Electrónica de Gilbert N. Lewis (1923)
* **Ácido de Lewis:** Especie química que posee un orbital atómico vacío y es capaz de **aceptar un par de electrones** formando un enlace covalente coordinado (electrófilo) (ej. cationes metálicos: H^+, Fe^{3+}, Cu^{2+}; compuestos con octeto incompleto: BF_3, AlCl_3, SO_3).
* **Base de Lewis:** Especie química que posee al menos un **par de electrones solitario libre** que puede **donar** para formar un enlace covalente dativo (nucleófilo) (ej. NH_3, H_2O, OH^-, CN^-, Cl^-).
* *Reacción General de Lewis:*
  BF_3 + :NH_3 \to F_3B \leftarrow NH_3 \quad (\text{Aducto o complejo de coordinación})

### 3.2. Autoionización del Agua y Producto Iónico (K_w)
El agua líquida pura es un electrolito extraordinariamente débil que experimenta auto-protólisis en un equilibrio muy desplazado a la izquierda:
H_2O_{(l)} + H_2O_{(l)} \rightleftharpoons H_3O^+_{(ac)} + OH^-_{(ac)}
La constante termodinámica de autoionización del agua a 25^\circ\text{C} (298\text{ K}) es:
K_w = [H^+][OH^-] = 1.0 \times 10^{-14}
* En agua neutra pura a 25^\circ\text{C}:
  [H^+] = [OH^-] = \sqrt{10^{-14}} = 1.0 \times 10^{-7}\text{ M}
* **Influencia de la Temperatura en K_w:** La autoionización del agua es un proceso endotérmico (\Delta H > 0). Si T > 25^\circ\text{C}, K_w > 10^{-14} (a 60^\circ\text{C}, K_w \approx 10^{-13}, por lo que el agua neutra tiene pH \approx 6.5).

### 3.3. Escala Logarítmica de pH y pOH (Søren Peter Lauritz Sørensen, 1909)
Para evitar el uso de exponentes negativos microscópicos se define el operador matemático potencial "p" (pX = -\log_{10} X):
pH = -\log_{10}[H^+] = -\log_{10}[H_3O^+] \iff [H^+] = 10^{-pH}
pOH = -\log_{10}[OH^-] \iff [OH^-] = 10^{-pOH}
Aplicando -\log a la expresión de K_w:
-\log(K_w) = -\log([H^+][OH^-]) = -\log[H^+] + (-\log[OH^-])
pK_w = pH + pOH
* A la temperatura estándar de 25^\circ\text{C}:
  pH + pOH = 14


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. INDICADORES ÁCIDO-BASE Y RANGO DE VIRAJE
| Indicador | Color Ácido | Rango de pH de Viraje | Color Básico |
| :--- | :---: | :---: | :---: |
| **Fenolftaleína** | Incoloro | 8.2 - 10.0 | Rojo grosella / Fucsia |
| **Tornasol** | Rojo | 5.0 - 8.0 | Azul |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t12_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Calcular pH de una solución de HCl \\ 10^{-8}\\text{ M} como 8. ERROR FATAL DE ADMISIÓN. ¡Un ácido jamás puede tener un pH básico (> 7)! A concentraciones ultra dil\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t12_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Olvidar el factor de disociación para bases dipróticas como Ca(OH)_2. Si tienes Ca(OH)_2 \\ 0.05\\text{ M}, cada mol libera 2\\text{ moles} de OH^-, por lo que [OH^\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t12_s01_c03",
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
                    id = "quim_t12_s01_c04",
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
                    id = "quim_t12_s01_c05",
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
                    id = "quim_t12_s01_c06",
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
                    id = "quim_t12_s01_c07",
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
                    id = "quim_t12_s01_c08",
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
                    id = "quim_t12_s01_c09",
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
                    id = "quim_t12_s01_c10",
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
            id = "quim_t12_s02",
            title = "Ácidos, Bases y Escala de pH - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Ácidos, Bases y Escala de pH - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Criterio de Acidez a 25^\circ\text{C}:**
  * **Medio Ácido:** [H^+] > 10^{-7}\text{ M} \implies pH < 7 \quad (pOH > 7)
  * **Medio Neutro:** [H^+] = [OH^-] = 10^{-7}\text{ M} \implies pH = 7 \quad (pOH = 7)
  * **Medio Básico o Alcalino:** [H^+] < 10^{-7}\text{ M} \implies pH > 7 \quad (pOH < 7)

### 3.4. Cálculo del pH en Ácidos y Bases Fuertes
Los electrolitos fuertes se ionizan o disocian cuantitativamente al 100\% en agua (\alpha = 1):
* **Ácidos Fuertes Monopróticos:** HCl, HBr, HI, HNO_3, HClO_4, HClO_3.
  [H^+] = C_{\text{ácido}} \implies pH = -\log(C_{\text{ácido}})
* **Ácidos Fuertes Dipróticos:** H_2SO_4 (primera ionización completa).
  [H^+] \approx 2 \cdot C_{\text{ácido}}
* **Bases Fuertes:** Hidróxidos de metales alcalinos (LiOH, NaOH, KOH) y alcalinotérreos solubles (Ca(OH)_2, Sr(OH)_2, Ba(OH)_2).
  [OH^-] = n \cdot C_{\text{base}} \implies pOH = -\log([OH^-]) \implies pH = 14 - pOH

### 3.5. Cálculo del pH en Ácidos y Bases Débiles
Los electrolitos débiles se ionizan solo parcialmente en agua (\alpha \ll 1), estableciendo un equilibrio de disociación gobernado por su **Constante de Acidez (K_a)** o **Constante de Basicidad (K_b)**:

1. **Ácido Débil Monoprótico (HA):**
   HA_{(ac)} + H_2O \rightleftharpoons H_3O^+ + A^- \quad ; \quad K_a = \frac{[H^+][A^-]}{[HA]}
   Si la concentración inicial C_0 satisface \frac{C_0}{K_a} > 1000 (disociación menor al 5\%), la aproximación C_0 - x \approx C_0 es válida:
   K_a = \frac{x^2}{C_0} \implies x = [H^+] = \sqrt{K_a \cdot C_0}
   pH = -\log\left(\sqrt{K_a \cdot C_0}\right) = \frac{1}{2}(pK_a - \log C_0)
   * Grado de ionización: \alpha = \frac{[H^+]}{C_0} = \sqrt{\frac{K_a}{C_0}}.
2. **Base Débil (B o NH_3):**
   NH_3 + H_2O \rightleftharpoons NH_4^+ + OH^- \quad ; \quad K_b = \frac{[NH_4^+][OH^-]}{[NH_3]}
   [OH^-] = \sqrt{K_b \cdot C_0} \implies pOH = -\log\left(\sqrt{K_b \cdot C_0}\right) \implies pH = 14 - pOH
3. **Relación entre Pares Conjugados:**
   K_a \cdot K_b = K_w = 10^{-14} \iff pK_a + pK_b = 14

### 3.6. Soluciones Reguladoras, Tampón o Buffer
Sistemas acuosos capaces de resistir y amortiguar variaciones drásticas de pH ante el agregado de pequeñas cantidades de ácidos o bases fuertes.
* **Composición:**
  * Ácido débil + Sal de su base conjugada (ej. CH_3COOH + CH_3COONa).
  * Base débil + Sal de su ácido conjugado (ej. NH_3 + NH_4Cl).
* **Ecuación de Henderson - Hasselbalch:**
  pH = pK_a + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Ácido Débil}]}\right)
  pOH = pK_b + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Base Débil}]}\right)
  * Si [\text{Sal}] = [\text{Ácido}] \implies pH = pK_a (Máxima capacidad amortiguadora).

### 3.7. Hidrólisis de Sales
Reacción de los iones de una sal disuelta con el agua:
1. **Sal de Ácido Fuerte y Base Fuerte (NaCl, KNO_3):** Ningún ión se hidroliza \implies Solución **Neutra (pH = 7)**.
2. **Sal de Ácido Fuerte y Base Débil (NH_4Cl):** El catión NH_4^+ se hidroliza cediendo H^+ \implies Solución **Ácida (pH < 7)**.
3. **Sal de Ácido Débil y Base Fuerte (CH_3COONa, NaCN):** El anión CH_3COO^- se hidroliza aceptando H^+ y liberando OH^- \implies Solución **Básica (pH > 7)**.
4. **Sal de Ácido Débil y Base Débil (NH_4CN):** Ambos se hidrolizan; el carácter del pH depende de la comparación entre K_a y K_b.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Naranja de Metilo** | Rojo / Naranja | 3.1 - 4.4 | Amarillo |
| **Azul de Bromotimol** | Amarillo | 6.0 - 7.6 | Azul |

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Hacking Logarítmico para pH sin Calculadora:**
  Si [H^+] = a \times 10^{-b}\text{ M} (con 1 \le a \le 10):
  pH = b - \log_{10}(a)
  * *Valores memorizados para admisión:*
    - \log 2 \approx 0.30
    - \log 3 \approx 0.48
    - \log 5 \approx 0.70
    - \log 7 \approx 0.85
  * *Ejemplo:* Si [H^+] = 2 \times 10^{-5}\text{ M} \implies pH = 5 - \log 2 = 5 - 0.30 = 4.70. ¡Cálculo en 3 segundos!

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Calcular pH de una solución de HCl \ 10^{-8}\text{ M} como 8.** ERROR FATAL DE ADMISIÓN. ¡Un ácido jamás puede tener un pH básico (> 7)! A concentraciones ultra diluidas (< 10^{-6}\text{ M}), se DEBE sumar la autoionización del agua: [H^+]_{\text{total}} = 10^{-8} + 10^{-7} = 1.1 \times 10^{-7}\text{ M} \implies pH = -\log(1.1 \times 10^{-7}) \approx 6.96 (ligeramente ácido).
* **Trampa 2: Olvidar el factor de disociación para bases dipróticas como Ca(OH)_2.** Si tienes Ca(OH)_2 \ 0.05\text{ M}, cada mol libera 2\text{ moles} de OH^-, por lo que [OH^-] = 2 \times 0.05 = 0.10\text{ M} = 10^{-1}\text{ M} \implies pOH = 1 \implies pH = 13.
* **Trampa 3: Creer que el agua a 60^\circ\text{C} con pH = 6.5 es ácida.** FALSO. Como K_w aumenta con la temperatura, a 60^\circ\text{C} la neutralidad ocurre cuando [H^+] = [OH^-] \implies pH = pOH = 6.5. El agua sigue siendo neutra aunque su pH sea 6.5.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t12_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Creer que el agua a 60^\\circ\\text{C} con pH = 6.5 es ácida. FALSO. Como K_w aumenta con la temperatura, a 60^\\circ\\text{C} la neutralidad ocurre cuando [H^+] = [\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t12_s02_c02",
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
                    id = "quim_t12_s02_c03",
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
                    id = "quim_t12_s02_c04",
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
                    id = "quim_t12_s02_c05",
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
                    id = "quim_t12_s02_c06",
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
                    id = "quim_t12_s02_c07",
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
                    id = "quim_t12_s02_c08",
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
                    id = "quim_t12_s02_c09",
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
                    id = "quim_t12_s02_c10",
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
