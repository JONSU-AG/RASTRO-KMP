package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana11 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t11_s01",
            title = "Cinética Química y Equilibrio Químico - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Cinética Química y Equilibrio Químico - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química Dinámica y Termodinámica Química
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Ley de velocidad, perfiles energéticos, cálculo de K_c y K_p, y Principio de Le Chatelier)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.3 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         CINÉTICA Y EQUILIBRIO QUÍMICO
                                       │
         ┌─────────────────────────────┴─────────────────────────────┐
         ▼                                                           ▼
  CINÉTICA QUÍMICA                                          EQUILIBRIO QUÍMICO
• Teoría de las Colisiones Efectivas                        • Reacciones Reversibles: v_{\text{directa}} = v_{\text{inversa}}
• Energía de Activación (E_a)                             • Constante de Equilibrio en Concentraciones (K_c)
• Complejo Activado                                         • Constante en Presiones (K_p): K_p = K_c (RT)^{\Delta n}
• Ley de Acción de Masas (Guldberg y Waage):               • Cociente de Reacción (Q vs K)
  v_r = k [A]^\alpha [B]^\beta                             • Principio de Henry Le Chatelier:
• Factores que modifican la velocidad:                        - Efecto de la Concentración
  - Concentración de reactivos                                - Efecto de la Presión y Volumen (fase gas)
  - Temperatura (T \uparrow \implies v \uparrow)            - Efecto de la Temperatura (\Delta H)
  - Grado de división / Superficie                            - Inercia del Catalizador (NO altera K)
  - Catalizadores (disminuyen E_a)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Cinética Química: Velocidad de Reacción
La Cinética Química estudia la rapidez con que los reactivos se transforman en productos y los mecanismos moleculares detallados del proceso.
* **Velocidad Media de Reacción:** Variación de la concentración molar de una sustancia por unidad de tiempo:
  aA + bB \to cC + dD
  v_{\text{reacción}} = -\frac{1}{a} \frac{\Delta [A]}{\Delta t} = -\frac{1}{b} \frac{\Delta [B]}{\Delta t} = +\frac{1}{c} \frac{\Delta [C]}{\Delta t} = +\frac{1}{d} \frac{\Delta [D]}{\Delta t}
  *(El signo negativo indica consumo de reactantes y el positivo formación de productos)*.

### 3.2. Teoría de las Colisiones y Perfil de Energía Potencial
Para que una reacción química ocurra tras un choque molecular, deben cumplirse dos condiciones simultáneas:
1. **Orientación geométrica espacial adecuada.**
2. **Energía cinética mínima suficiente:** Denominada **Energía de Activación (E_a)**, requerida para vencer las repulsiones electrónicas y romper los enlaces iniciales formando el **Complejo Activado** (estado de transición inestable de máxima energía potencial).

* **Parámetros del Diagrama de Energía:**
  * **Variación de Entalpía (\Delta H):**
    \Delta H = H_{\text{productos}} - H_{\text{reactantes}}
    * Si \Delta H < 0: Proceso Exotérmico (libera calor).
    * Si \Delta H > 0: Proceso Endotérmico (absorbe calor).
  * **Energía de Activación Directa (E_{a(d)}):**
    E_{a(d)} = H_{\text{complejo activado}} - H_{\text{reactantes}}
  * **Energía de Activación Inversa (E_{a(i)}):**
    E_{a(i)} = H_{\text{complejo activado}} - H_{\text{productos}}
  * **Relación Fundamental:**
    \Delta H = E_{a(d)} - E_{a(i)}

### 3.3. Ley de Velocidad y Orden de Reacción
Para una reacción homogénea general en una sola etapa (reacción elemental):
aA + bB \to \text{Productos}
La Ley de Velocidad (Ley de Acción de Masas de Guldberg y Waage) es:
v = k [A]^a [B]^b
Para una reacción compleja en varias etapas, la velocidad está gobernada estrictamente por la **etapa más lenta (etapa determinante de la velocidad)**, y los órdenes de reacción (\alpha, \beta) se determinan **experimentalmente**:
v = k [A]^\alpha [B]^\beta
* \alpha, \beta: Órdenes parciales respecto a A y B.
* \alpha + \beta: **Orden Total de la Reacción**.
* k: Constante cinética específica de velocidad (depende exclusivamente de la temperatura según la ecuación de Svante Arrhenius: k = A e^{-E_a/RT}).

### 3.4. Factores que Modifican la Velocidad de Reacción
1. **Naturaleza de los Reactantes:** Reacciones iónicas en disolución acuosa no requieren ruptura previa de enlaces y son casi instantáneas (v \to \infty); reacciones covalentes con enlaces múltiples son lentas.
2. **Concentración de Reactivos:** A mayor concentración molar, mayor densidad de moléculas por unidad de volumen y mayor frecuencia de colisiones por segundo (v \uparrow).
3. **Superficie de Contacto (Grado de División en Sólidos):** A mayor subdivisión (polvo fino vs fragmento macizo), mayor área expuesta a colisiones y mayor velocidad.
4. **Temperatura:** Un incremento térmico eleva la energía cinética media molecular; según la regla empírica de Van 't Hoff, por cada 10^\circ\text{C} de incremento, la velocidad se duplica o triplica.
5. **Catalizadores:** Sustancias que aumentan notablemente la velocidad de reacción ofreciendo una ruta alternativa con una **menor Energía de Activación (E_a)**.
   * *Propiedades del Catalizador:*
     * No se consume en la reacción (se recupera intacto).
     * No altera la entalpía de reacción (\Delta H permanece constante).
     * No modifica la constante de equilibrio (K_c) ni desplaza el equilibrio; únicamente **acelera el tiempo para alcanzarlo**.

### 3.5. Equilibrio Químico y Ley de Acción de Masas
El equilibrio químico es un estado dinámico alcanzado por una reacción reversible en un sistema cerrado a temperatura constante, donde las **velocidades de la reacción directa e inversa se igualan**:
v_{\text{directa}} = v_{\text{inversa}}
Macroscópicamente, las concentraciones de reactantes y productos permanecen constantes en el tiempo.


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t11_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Incluir sólidos o líquidos en la expresión de K_c o K_p. Si la reacción es CaCO_{3(s)} \\rightleftharpoons CaO_{(s)} + CO_{2(g)}, la constante es simplemente K_c = \", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t11_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Afirmar que el catalizador aumenta el rendimiento o altera K_c. FALSO TOTAL. El catalizador solo reduce el tiempo necesario para llegar al equilibrio acelerando por igu\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t11_s01_c03",
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
                    id = "quim_t11_s01_c04",
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
                    id = "quim_t11_s01_c05",
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
                    id = "quim_t11_s01_c06",
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
                    id = "quim_t11_s01_c07",
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
                    id = "quim_t11_s01_c08",
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
                    id = "quim_t11_s01_c09",
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
                    id = "quim_t11_s01_c10",
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
            id = "quim_t11_s02",
            title = "Cinética Química y Equilibrio Químico - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Cinética Química y Equilibrio Químico - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Expresión de la Constante de Equilibrio (K_c):**
  Para el sistema en equilibrio:
  aA_{(g)} + bB_{(ac)} \rightleftharpoons cC_{(g)} + dD_{(ac)}
  K_c = \frac{[C]^c [D]^d}{[A]^a [B]^b}
  * **Regla de Exclusión de Fases:** En la expresión de K_c y K_p **NUNCA se incluyen sólidos puros (s) ni líquidos puros (l, como el agua solvente)**, ya que sus concentraciones (densidades molares) son constantes y se hallan subsumidas en el valor de K.

* **Constante en Términos de Presiones Parciales (K_p):**
  Para sustancias exclusivamente en fase gaseosa:
  K_p = \frac{(P_C)^c (P_D)^d}{(P_A)^a (P_B)^b}
* **Relación Matemática entre K_p y K_c:**
  K_p = K_c \cdot (R \cdot T)^{\Delta n}
  Donde:
  * R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K}).
  * T: Temperatura absoluta en Kelvin.
  * \Delta n: Variación de moles gaseosos:
    \Delta n = \sum n_{\text{gaseosos}}(\text{productos}) - \sum n_{\text{gaseosos}}(\text{reactantes})
  * Si \Delta n = 0 \implies K_p = K_c.

* **Cociente de Reacción (Q):**
  Posee la misma expresión matemática que K_c, pero evaluada en cualquier instante fuera del equilibrio:
  * Si Q < K_c: La reacción avanza espontáneamente hacia la **derecha (\to, productos)** para alcanzar el equilibrio.
  * Si Q = K_c: El sistema se encuentra en **equilibrio químico**.
  * Si Q > K_c: La reacción avanza hacia la **izquierda (\leftarrow, reactantes)**.

### 3.6. Principio de Le Chatelier (1884)
"Si sobre un sistema químico en equilibrio se aplica una perturbación externa (cambio de concentración, temperatura o presión/volumen), el sistema evolucionará espontáneamente en el sentido que contrarreste o minimice dicha alteración, restableciendo un nuevo estado de equilibrio":

1. **Efecto de la Concentración:**
   * Si se **añade** una sustancia, el sistema se desplaza hacia el **lado opuesto** para consumirla.
   * Si se **retira** una sustancia, el sistema se desplaza hacia el **mismo lado** para reponerla.
2. **Efecto de la Presión y Volumen (Aplica solo a gases con \Delta n \ne 0):**
   * Si se **aumenta la presión** (o se disminuye el volumen), el sistema se desplaza hacia donde haya **menor número de moles gaseosos (\sum n_g)**.
   * Si se **disminuye la presión** (o se incrementa el volumen), el sistema se desplaza hacia donde haya **mayor número de moles gaseosos**.
   * Si \Delta n = 0, un cambio de presión **no altera el equilibrio**.
3. **Efecto de la Temperatura (El único factor que altera el valor numérico de K_c y K_p):**
   * *Reacción Exotérmica (\Delta H < 0 / Calor en productos):*
     * Si T \uparrow \implies Se desplaza hacia la izquierda (\leftarrow) \implies K_c \downarrow.
     * Si T \downarrow \implies Se desplaza hacia la derecha (\to) \implies K_c \uparrow.
   * *Reacción Endotérmica (\Delta H > 0 / Calor en reactantes):*
     * Si T \uparrow \implies Se desplaza hacia la derecha (\to) \implies K_c \uparrow.
     * Si T \downarrow \implies Se desplaza hacia la izquierda (\leftarrow) \implies K_c \downarrow.
4. **Adición de un Gas Inerte (ej. He, Ar):**
   * A **volumen constante**: Aumenta la presión total, pero las presiones parciales de los reactivos no cambian \implies **No altera el equilibrio**.
   * A **presión constante**: Provoca expansión del volumen total, favoreciendo el lado con mayor número de moles gaseosos.

---

### 4. PROPIEDADES ALGEBRAICAS DE LA CONSTANTE K
* Si se invierte la ecuación química: K' = \frac{1}{K}.
* Si se multiplica la ecuación por un factor n: K' = K^n.
* Si dos o más equilibrios se suman miembro a miembro: K_{\text{global}} = K_1 \cdot K_2 \cdot K_3 \dots

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia K_p y K_c:** **"Kapa = Koko por Ratón a la Delta ene"**
  K_p = K_c \cdot (RT)^{\Delta n}
* **Hacking de Le Chatelier para Presión:**
  * *"Más Presión \to Menos Moles gaseosos"* (la compresión obliga a las moléculas a juntarse).
  * *"Menos Presión \to Más Moles gaseosos"*.
* **Hacking Temperatura:** Considera al "Calor" como un reactivo más:
  * Endo: \text{Reactivo} + \text{Calor} \rightleftharpoons \text{Producto}. Si subes calor, empujas a la derecha.
  * Exo: \text{Reactivo} \rightleftharpoons \text{Producto} + \text{Calor}. Si subes calor, empujas a la izquierda.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Incluir sólidos o líquidos en la expresión de K_c o K_p.** Si la reacción es CaCO_{3(s)} \rightleftharpoons CaO_{(s)} + CO_{2(g)}, la constante es simplemente K_c = [CO_2] y K_p = P_{CO_2}. Los sólidos CaCO_3 y CaO NO figuran en el cociente.
* **Trampa 2: Afirmar que el catalizador aumenta el rendimiento o altera K_c.** FALSO TOTAL. El catalizador solo reduce el tiempo necesario para llegar al equilibrio acelerando por igual la velocidad directa y la inversa; el rendimiento final y el valor de K_c permanecen inalterados.
* **Trampa 3: Usar R = 62.4 en K_p = K_c(RT)^{\Delta n}.** En la deducción termodinámica de K_p, la constante R DEBE ser obligatoriamente 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K}) y la presión debe estar en atmósferas.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t11_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Usar R = 62.4 en K_p = K_c(RT)^{\\Delta n}. En la deducción termodinámica de K_p, la constante R DEBE ser obligatoriamente 0.082\\text{ atm}\\cdot\\text{L}/(\\text{mo\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t11_s02_c02",
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
                    id = "quim_t11_s02_c03",
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
                    id = "quim_t11_s02_c04",
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
                    id = "quim_t11_s02_c05",
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
                    id = "quim_t11_s02_c06",
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
                    id = "quim_t11_s02_c07",
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
                    id = "quim_t11_s02_c08",
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
                    id = "quim_t11_s02_c09",
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
                    id = "quim_t11_s02_c10",
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
