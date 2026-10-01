package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t03_s01",
            title = "DINÁMICA - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "DINÁMICA - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Dinámica es la rama de la mecánica clásica que estudia el movimiento de los cuerpos relacionándolo explícitamente con las causas que lo originan y modifican: las **fuerzas** como medida cuantitativa de las interacciones materiales:
1. **Leyes Fundamentales del Movimiento (Isaac Newton, *Philosophiae Naturalis Principia Mathematica*, 1687):**
   - *Primera Ley (Principio de Inercia):* Un cuerpo permanece en su estado de reposo o de movimiento rectilíneo uniforme a menos que actúe sobre él una fuerza neta no equilibrada (\sum \vec{F} = \vec{0} \implies \vec{v} = \text{cte}).
   - *Segunda Ley (Ley Fundamental de la Dinámica):* La aceleración que experimenta una partícula es directamente proporcional a la fuerza resultante e inversamente proporcional a su masa inercial (\sum \vec{F} = m \vec{a}).
   - *Tercera Ley (Principio de Acción y Reacción):* A toda fuerza de acción le corresponde una fuerza de reacción de igual magnitud, en la misma dirección y de sentido opuesto, aplicada en cuerpos distintos (\vec{F}_{AB} = -\vec{F}_{BA}).
2. **Fuerzas Mecánicas Comunes:** Peso (\vec{P} = m\vec{g}), fuerza normal (\vec{N}), tensión en cuerdas (\vec{T}), fuerza elástica restauradora (Ley de Hooke: \vec{F}_e = -k\Delta\vec{x}) y fuerza de rozamiento o fricción: estática (f_s \le \mu_s N) y cinética (f_k = \mu_k N).
3. **Dinámica Lineal:** Diagrama de Cuerpo Libre (DCL), resolución de sistemas acoplados (máquinas de Atwood, masas conectadas por cuerdas, bloques sobre planos inclinados con y sin rozamiento).
4. **Dinámica Circular:** Aceleración centrípeta y **Fuerza Centrípeta (F_c = m a_c = m \frac{v^2}{R} = m \omega^2 R)**, análisis de fuerzas en el plano vertical (tensión máxima en el punto más bajo, tensión mínima en la cúspide) y en el plano horizontal (péndulo cónico, peralte óptimo de carreteras sin rozamiento: \tan\theta = \frac{v^2}{Rg}).

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. CONCEPTO DE FUERZA, INERCIA Y MASA

* **Fuerza (\vec{F}):** Magnitud física vectorial que cuantifica la intensidad de la interacción mecánica entre dos o más cuerpos. Puede actuar por **contacto directo** (tensión, normal, fricción, elástica) o **a distancia mediante campos** (gravitatorio, electromagnético). Unidad en el SI: el **newton (\text{N} = \text{kg}\cdot\text{m/s}^2)**.
* **Inercia:** Propiedad intrínseca de la materia por la cual todo cuerpo se opone activamente a cualquier modificación de su estado de reposo o de movimiento rectilíneo uniforme.
* **Masa Inercial (m):** Medida cuantitativa escalar de la inercia de un cuerpo. Es invariable ante cambios de posición o temperatura. Se distingue conceptualmente del **peso** (P = mg), que es una fuerza gravitatoria local dependiente de la aceleración de la gravedad g.

---

### 2.2. LAS TRES LEYES DE NEWTON

#### A. Primera Ley de Newton (Principio de Inercia)
*"Todo cuerpo preserva su estado de reposo o de movimiento rectilíneo y uniforme, a no ser que sea obligado a cambiar ese estado por fuerzas impresas sobre él."*
\sum \vec{F} = \vec{0} \iff \vec{v} = \text{constante} \iff \vec{a} = \vec{0}
- Define los **Sistemas de Referencia Inerciales (SRI)**: aquellos marcos de referencia que no están acelerados (en reposo o MRU respecto a las estrellas lejanas). Las leyes de Newton solo son rigurosamente válidas en SRI.

#### B. Segunda Ley de Newton (Ley Fundamental de la Dinámica)
*"El cambio de movimiento es proporcional a la fuerza motriz impresa y ocurre según la línea recta a lo largo de la cual aquella fuerza se imprime."*
En términos modernos, la fuerza neta o resultante sobre un cuerpo es igual a la derivada temporal de su cantidad de movimiento lineal (\vec{p} = m\vec{v}):
\vec{F}_{\text{net}} = \frac{d\vec{p}}{dt} = \frac{d(m\vec{v})}{dt}
Para un cuerpo de masa constante (m = \text{cte}):
\sum \vec{F} = m \vec{a}
- La aceleración \vec{a} tiene **siempre exactamente la misma dirección y el mismo sentido** que la fuerza resultante \vec{F}_R.
- Descomposición cartesiana en \mathbb{R}^2:
  \sum F_x = m a_x, \quad \sum F_y = m a_y
- Para un movimiento en una dirección preferencial de aceleración:
  \sum F_{(\text{a favor de } \vec{a})} - \sum F_{(\text{en contra de } \vec{a})} = m \cdot a

#### C. Tercera Ley de Newton (Principio de Acción y Reacción)
*"A toda acción se opone siempre una reacción igual y contraria: o sea, las acciones mutuas de dos cuerpos siempre son iguales y dirigidas en direcciones opuestas."*
\vec{F}_{A \to B} = -\vec{F}_{B \to A}
|\vec{F}_{A \to B}| = |\vec{F}_{B \to A}|
- **Características Ineludibles del Par Acción-Reacción:**
  1. Tienen **igual módulo o magnitud**.
  2. Tienen la **misma dirección** (misma línea de acción colineal).
  3. Tienen **sentidos opuestos**.
  4. **Actúan sobre cuerpos distintos** \implies **¡NUNCA SE ANULAN ENTRE SÍ!** No pueden equilibrarse porque operan en diagramas de cuerpo libre independientes.
  5. Son de la misma naturaleza física (si la acción es gravitatoria, la reacción es gravitatoria; si es de contacto, la reacción es de contacto).

---

### 2.3. FUERZAS MECÁNICAS FUNDAMENTALES Y ROZAMIENTO

1. **Fuerza de Gravedad o Peso (\vec{P}):**
   Atracción gravitatoria ejercida por la Tierra sobre la masa del cuerpo:
   \vec{P} = m \vec{g} \quad (\text{siempre vertical hacia abajo})
2. **Fuerza Normal (\vec{N}):**
   Fuerza de contacto electrostática repulsiva microscópica ejercida por una superficie sobre el cuerpo apoyado en ella; es **siempre perpendicular a la superficie de contacto** y dirigida hacia el cuerpo.
3. **Fuerza de Tensión (\vec{T}):**
   Fuerza electromagnética interna que surge en cuerdas, cables o hilos inextensibles de masa despreciable al ser traccionados; se dibuja siempre saliendo del cuerpo analizado a lo largo del hilo ("tirando" del cuerpo).
4. **Fuerza Elástica (Ley de Hooke):**
   Fuerza recuperadora que surge en un resorte elástico ideal deformado, proporcional a la elongación o compresión \Delta \vec{x} = \vec{x} - \vec{x}_0:
   \vec{F}_e = -k \Delta \vec{x} \implies F_e = k \cdot x
   Donde k es la constante elástica o de rigidez del resorte (\text{N/m}).
5. **Fuerza de Rozamiento o Fricción (\vec{f}):**
   Fuerza tangencial a la superficie de contacto que se opone al movimiento relativo o al deslizamiento inminente entre dos cuerpos rugosos.
   - **Rozamiento Estático (f_s):** Actúa cuando no hay movimiento relativo. Su valor se ajusta exactamente para equilibrar la fuerza externa aplicada hasta alcanzar un valor límite superior denominado **fuerza de rozamiento estático máxima (f_{s,\max})**:
     0 \le f_s \le f_{s,\max} = \mu_s N
     Donde \mu_s es el coeficiente de rozamiento estático (adimensional).
   - **Rozamiento Cinético (f_k):** Actúa una vez que los cuerpos rompen la inercia y se deslizan efectivamente uno sobre el otro; su valor es constante e independiente de la velocidad relativa para velocidades moderadas:
     f_k = \mu_k N

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS FUNDAMENTALES Y LEYES DE DINÁMICA

1. **Segunda Ley de Newton:**
   \sum \vec{F} = m \vec{a}
   \sum F_{\text{a favor de } a} - \sum F_{\text{en contra de } a} = m \cdot a

2. **Fuerzas de Rozamiento:**
   f_{s,\max} = \mu_s N
   f_k = \mu_k N \quad (\mu_s > \mu_k)

3. **Dinámica Circular:**

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t03_s01_c01",
                    question = "**Enunciado:** Sobre un bloque de masa m = 8\\text{ kg} apoyado sobre una superficie horizontal lisa (sin rozamiento) actúan dos fuerzas horizontales constantes: \\vec{F}_1 de módulo 50\\text{ N} hacia la derecha y \\vec{F}_2 de módulo 18\\text{ N} hacia la izquierda. Si el bloque parte del reposo, determine el módulo de la aceleración que adquiere y la distancia que recorre en los primeros 5\\text{ segundos} de su movimiento.",
                    options = listOf(
                        "2\\text{ m/s}^2 y 25\\text{ m}",
                        "4\\text{ m/s}^2 y 50\\text{ m}",
                        "5\\text{ m/s}^2 y 62.5\\text{ m}",
                        "3\\text{ m/s}^2 y 37.5\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Calculamos la fuerza resultante horizontal (\\vec{F}_R): Tomando como positivo el sentido hacia la derecha: F_R = F_1 - F_2 = 50\\text{ N} - 18\\text{ N} = 32\\text{ N hacia la derecha} 2. Aplicamos la Segunda Ley de Newton para hallar la aceleración: F_R = m \\cdot a \\implies 32 = 8 \\cdot a \\implies a = \\frac{32}{8} = 4\\text{ m/s}^2 3. Calculamos la distancia recorrida en t = 5\\text{ s} partiendo del reposo (v_0 = 0): d = v_0 t + \\frac{1}{2} a t^2 = 0 + \\frac{1}{2}(4\\text{ m/s}^2)(5\\text{ s})^2 = 2 \\times 25 = 50\\text{ m} **Respuesta:** B ---"
                ),
                Challenge(
                    id = "fis_t03_s01_c02",
                    question = "**Enunciado:** Un bloque de madera de masa m = 10\\text{ kg} descansa sobre un piso horizontal cuyos coeficientes de rozamiento son \\mu_s = 0.5 y \\mu_k = 0.4. Se aplica al bloque una fuerza horizontal \\vec{F} de magnitud variable. Determine el módulo de la fuerza de rozamiento que actúa sobre el bloque en los dos casos siguientes:",
                    options = listOf(
                        "Caso I: 30\\text{ N}; Caso II: 40\\text{ N}",
                        "Caso I: 50\\text{ N}; Caso II: 40\\text{ N}",
                        "Caso I: 30\\text{ N}; Caso II: 50\\text{ N}",
                        "Caso I: 0\\text{ N}; Caso II: 40\\text{ N}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. En el eje vertical, el bloque está en equilibrio estático: \\sum F_y = 0 \\implies N = P = mg = (10\\text{ kg})(10\\text{ m/s}^2) = 100\\text{ N} 2. Calculamos la fuerza de rozamiento estático máxima (f_{s,\\max}): f_{s,\\max} = \\mu_s \\cdot N = (0.5)(100\\text{ N}) = 50\\text{ N} 3. Calculamos la fuerza de rozamiento cinético (f_k): f_k = \\mu_k \\cdot N = (0.4)(100\\text{ N}) = 40\\text{ N} 4. *Análisis del Caso I (F = 30\\text{ N}):* Dado que la fuerza aplicada F = 30\\text{ N} < f_{s,\\max} (50\\text{ N}), la fuerza no logra romper la inercia del reposo. El bloque **permanece en reposo**. Por primera ley de Newton, la fuerza de rozamiento estático equilibra exactamente a la fuerza aplicada: f_s = F = 30\\text{ N} 5. *Análisis del Caso II (F = 60\\text{ N}):* Dado que la fuerza aplicada F = 60\\text{ N} > f_{s,\\max} (50\\text{ N}), el bloque supera la fuerza estática y **se desliza con aceleración**. En estado de movimiento cinético activo, la fuerza de fricción es la cinética: f_k = 40\\text{ N} - Resultados: Caso I = 30\\text{ N}; Caso II = 40\\text{ N}. **Respuesta:** A ---"
                ),
                Challenge(
                    id = "fis_t03_s01_c03",
                    question = "**Enunciado:** En el sistema mecánico mostrado, un bloque A de masa m_A = 6\\text{ kg} se encuentra sobre una mesa horizontal lisa y está conectado mediante una cuerda ideal inextensible que pasa por una polea sin fricción a un bloque B de masa m_B = 4\\text{ kg} que cuelga verticalmente. Si el sistema se libera a partir del reposo, determine la aceleración del sistema y la tensión en la cuerda. (g = 10\\text{ m/s}^2).",
                    options = listOf(
                        "a = 2\\text{ m/s}^2; T = 36\\text{ N}",
                        "a = 4\\text{ m/s}^2; T = 24\\text{ N}",
                        "a = 4\\text{ m/s}^2; T = 40\\text{ N}",
                        "a = 5\\text{ m/s}^2; T = 30\\text{ N}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Realizamos el Diagrama de Cuerpo Libre (DCL) para cada bloque: - Bloque A (horizontal, sin fricción): \\sum F_x = m_A \\cdot a \\implies T = 6a \\quad \\text{--- (Ecuación 1)} - Bloque B (vertical, desciende acelerando con aceleración a): \\sum F_y = m_B \\cdot a \\implies P_B - T = m_B \\cdot a \\implies m_B g - T = m_B \\cdot a (4)(10) - T = 4a \\implies 40 - T = 4a \\quad \\text{--- (Ecuación 2)} 2. Sumamos miembro a miembro las ecuaciones (1) y (2): T + (40 - T) = 6a + 4a 40 = 10a \\implies a = 4\\text{ m/s}^2 3. Reemplazamos el valor de a en la ecuación (1) para hallar la tensión: T = 6a = 6(4) = 24\\text{ N} **Respuesta:** B ---"
                ),
                Challenge(
                    id = "fis_t03_s01_c04",
                    question = "¿Qué predice la Primera Ley de Newton para un cuerpo sobre el cual la fuerza neta resultante es cero (\\sum \\vec{F} = \\vec{0})?",
                    options = listOf(
                        "Porque actúan siempre sobre cuerpos distintos (en diagramas de cuerpo libre independientes).",
                        "F_c = m \\frac{v^2}{R} = m \\omega^2 R.",
                        "P_\\perp = mg \\cos\\theta.",
                        "Que el cuerpo permanecerá en reposo o se moverá en línea recta con velocidad constante (MRU)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Que el cuerpo permanecerá en reposo o se moverá en línea recta con velocidad constante (MRU)."
                ),
                Challenge(
                    id = "fis_t03_s01_c05",
                    question = "¿Por qué las fuerzas del par acción-reacción de la Tercera Ley de Newton nunca pueden anularse mutuamente?",
                    options = listOf(
                        "Porque actúan siempre sobre cuerpos distintos (en diagramas de cuerpo libre independientes).",
                        "Que el cuerpo permanecerá en reposo o se moverá en línea recta con velocidad constante (MRU).",
                        "F_c = m \\frac{v^2}{R} = m \\omega^2 R.",
                        "P_\\perp = mg \\cos\\theta."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Porque actúan siempre sobre cuerpos distintos (en diagramas de cuerpo libre independientes)."
                ),
                Challenge(
                    id = "fis_t03_s01_c06",
                    question = "¿Cuál es la relación matemática que define a la fuerza centrípeta F_c en función de la velocidad tangencial y el radio de giro?",
                    options = listOf(
                        "Que el cuerpo permanecerá en reposo o se moverá en línea recta con velocidad constante (MRU).",
                        "F_c = m \\frac{v^2}{R} = m \\omega^2 R.",
                        "Porque actúan siempre sobre cuerpos distintos (en diagramas de cuerpo libre independientes).",
                        "P_\\perp = mg \\cos\\theta."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: F_c = m \\frac{v^2}{R} = m \\omega^2 R."
                ),
                Challenge(
                    id = "fis_t03_s01_c07",
                    question = "En un plano inclinado de ángulo \\theta, ¿cuál es la componente del peso perpendicular a la superficie del plano?",
                    options = listOf(
                        "Que el cuerpo permanecerá en reposo o se moverá en línea recta con velocidad constante (MRU).",
                        "Porque actúan siempre sobre cuerpos distintos (en diagramas de cuerpo libre independientes).",
                        "P_\\perp = mg \\cos\\theta.",
                        "F_c = m \\frac{v^2}{R} = m \\omega^2 R."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: P_\\perp = mg \\cos\\theta."
                ),
                Challenge(
                    id = "fis_t03_s01_c08",
                    question = "¿Cuál coeficiente de fricción es mayor en un par de superficies en contacto: el estático (\\mu_s) o el cinético (\\mu_k)?",
                    options = listOf(
                        "Que el cuerpo permanecerá en reposo o se moverá en línea recta con velocidad constante (MRU).",
                        "Porque actúan siempre sobre cuerpos distintos (en diagramas de cuerpo libre independientes).",
                        "F_c = m \\frac{v^2}{R} = m \\omega^2 R.",
                        "El coeficiente estático (\\mu_s > \\mu_k)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: El coeficiente estático (\\mu_s > \\mu_k)."
                ),
                Challenge(
                    id = "fis_t03_s01_c09",
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
                    id = "fis_t03_s01_c10",
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
            id = "fis_t03_s02",
            title = "DINÁMICA - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "DINÁMICA - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     Donde \mu_k es el coeficiente de rozamiento cinético.
   - *Relación física fundamental:* \mu_s > \mu_k \implies f_{s,\max} > f_k. Cuesta más iniciar el deslizamiento que mantenerlo.

---

### 2.4. DINÁMICA RECTILÍNEA Y MÉTODOS DE RESOLUCIÓN

1. **Diagrama de Cuerpo Libre (DCL):**
   Aislamiento imaginario de un cuerpo o subsistema del resto del universo, graficando todas las fuerzas externas que actúan directamente sobre él (peso, normales, tensiones, elásticas, fricción).
2. **Método de los Sistemas Compuestos:**
   Para un sistema de varios cuerpos rígidamente conectados que se desplazan con la misma aceleración lineal común a:
   a = \frac{\sum F_{\text{externas a favor de } a} - \sum F_{\text{externas en contra de } a}}{\sum m_{\text{total}}}
   - *Máquina de Atwood:* Dos masas m_1 > m_2 unidas por una cuerda inextensible sobre una polea fija ideal:
     a = g \left( \frac{m_1 - m_2}{m_1 + m_2} \right), \quad T = \frac{2 m_1 m_2}{m_1 + m_2} g
3. **Plano Inclinado con Ángulo \theta:**
   Descomposición del peso en ejes paralelo (\parallel) y perpendicular (\perp) al plano:
   P_\perp = mg \cos\theta \implies N = mg \cos\theta
   P_\parallel = mg \sin\theta
   - Si no hay fricción (\mu = 0): a = g \sin\theta (independiente de la masa del bloque).
   - Si desciende con fricción (\mu_k):
     F_R = mg \sin\theta - f_k = mg \sin\theta - \mu_k (mg \cos\theta) \implies a = g(\sin\theta - \mu_k \cos\theta)
   - *Ángulo de reposo crítico (\theta_c):* Ángulo máximo de inclinación sin deslizar:
     \tan\theta_c = \mu_s

---

### 2.5. DINÁMICA CIRCULAR

Cuando una partícula describe una trayectoria curva de radio de curvatura R, experimenta necesariamente una aceleración normal o centrípeta orientada radialmente hacia el centro de giro. Por la segunda ley de Newton, debe existir una fuerza neta en esa misma dirección:

#### A. La Fuerza Centrípeta (F_c)
**¡La fuerza centrípeta NO es una fuerza física nueva o independiente!** Es simplemente la resultante vectorial de todas las fuerzas reales existentes que apuntan radialmente hacia el centro de curvatura menos aquellas que apuntan hacia afuera:
F_c = \sum F_{\text{hacia el centro}} - \sum F_{\text{hacia afuera}} = m a_c
F_c = m \frac{v_t^2}{R} = m \omega^2 R

#### B. Movimiento Circular en Plano Vertical (Masa atada a una cuerda de longitud L)
1. **En el Punto Más Bajo de la Trayectoria (A):**
   La tensión \vec{T} apunta hacia el centro (arriba) y el peso m\vec{g} hacia afuera (abajo):
   F_c = T_A - mg = m \frac{v_A^2}{L} \implies T_A = mg + m \frac{v_A^2}{L} \quad (\text{Tensión MÁXIMA})
2. **En el Punto Más Alto de la Trayectoria (B):**
   Tanto la tensión \vec{T} como el peso m\vec{g} apuntan hacia el centro (abajo):
   F_c = T_B + mg = m \frac{v_B^2}{L} \implies T_B = m \frac{v_B^2}{L} - mg \quad (\text{Tensión MÍNIMA})
   - *Rapidez Crítica para completar la vuelta vertical (T_B \ge 0):*
     La cuerda apenas permanece tensa en la cúspide cuando T_B = 0:
     mg = m \frac{v_{\text{crítica}}^2}{L} \implies v_{\text{crítica}} = \sqrt{g L}

#### C. Curvas y Peralte de Carreteras
1. **Curva Plana Horizontal con Rozamiento (Peralte \theta = 0^\circ):**
   La única fuerza que proporciona la aceleración centrípeta hacia el centro de la curva es la fuerza de rozamiento estático lateral de los neumáticos:
   f_s = F_c \implies \mu_s N = m \frac{v^2}{R} \implies \mu_s (mg) = m \frac{v^2}{R} \implies v_{\max} = \sqrt{\mu_s g R}
2. **Curva con Ángulo de Peralte \theta sin Rozamiento:**
   La componente horizontal de la normal provee la fuerza centrípeta:
   N \cos\theta = mg \implies N = \frac{mg}{\cos\theta}
   N \sin\theta = F_c = m \frac{v^2}{R}
   Dividiendo ambas ecuaciones:
   \tan\theta = \frac{v^2}{g R} \implies v_{\text{óptima}} = \sqrt{g R \tan\theta}
3. **Péndulo Cónico:**
   Masa m atada a una cuerda de longitud L girando en un círculo horizontal de radio R = L\sin\theta con ángulo constante \theta con la vertical:
   T \cos\theta = mg, \quad T \sin\theta = m \omega^2 R
   \tan\theta = \frac{\omega^2 R}{g} \implies \omega = \sqrt{\frac{g}{L \cos\theta}}, \quad \text{Periodo } T_p = 2\pi \sqrt{\frac{L \cos\theta}{g}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   F_c = m \frac{v^2}{R} = m \omega^2 R
   v_{\text{curva sin peralte}} = \sqrt{\mu_s g R}
   \tan\theta_{\text{peralte}} = \frac{v^2}{g R}
   v_{\text{crítica cúspide vertical}} = \sqrt{g R}

4. **Fórmula de Aceleración en Máquina de Atwood:**
   a = g \left( \frac{m_1 - m_2}{m_1 + m_2} \right)
   T = \frac{2 m_1 m_2}{m_1 + m_2} g

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **La Fuerza Normal NO SIEMPRE es igual al Peso:** Afirmar que N = mg es un error habitual. Si una fuerza tira oblicuamente hacia arriba con ángulo \alpha: N = mg - F\sin\alpha. En un plano inclinado: N = mg\cos\theta. En un ascensor acelerando hacia arriba: N = m(g + a).
* **La Falsa Fuerza Centrífuga en Sistemas Inerciales:** En un marco de referencia inercial (en reposo respecto a tierra), la fuerza centrífuga **NO EXISTE**. Es una fuerza ficticia o inercial que solo aparece si el observador se sitúa dentro del sistema no inercial en rotación.
* **El Rozamiento Estático es Variable:** La fuerza de rozamiento estático **no vale siempre \mu_s N**. Ese es su valor *máximo*. Si empujas una caja de 100\text{ kg} con una fuerza minúscula de 2\text{ N} y no se mueve, la fricción estática vale exactamente 2\text{ N}, no \mu_s N.
* **Pares de Acción y Reacción:** Pregunta clásica: *"¿Son el peso y la normal un par de acción y reacción?"* **¡NO!** El peso es la atracción de la Tierra sobre el cuerpo; su reacción está aplicada en el centro de la Tierra. La normal es el contacto de la mesa sobre el cuerpo; su reacción es la fuerza del cuerpo sobre la mesa. Ambas actúan sobre el mismo cuerpo, por lo que jamás pueden ser un par acción-reacción de Newton.
* **Tensión en una Cuerda que une dos bloques acelerados:** Jamás igualar la tensión al peso de uno de los bloques si el sistema está acelerado. Siempre aplicar la segunda ley de Newton a cada bloque por separado mediante su DCL.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Segunda Ley de Newton:**
   > **"FAMA"**
   \mathbf{F} = \mathbf{m} \cdot \mathbf{a}
   *(La Fuerza Resultante crea la Fama de mover masas).*

2. **Componentes del Peso en el Plano Inclinado:**
   > **"SENO SE DESLIZA, COSENO CONTRA EL PLANO"**
   - Paralelo al plano (el que desliza): P_\parallel = mg \mathbf{\sin}\theta.
   - Perpendicular al plano (el que comprime): P_\perp = mg \mathbf{\cos}\theta.

3. **Condición de Peralte sin Fricción:**
   > **"TANTO VUELO SOBRE GR"**
   \mathbf{\tan\theta} = \frac{v^2}{g R}

4. **Tensión en Circunferencia Vertical:**
   > **"ABAJO PESA MÁS (SUMA), ARRIBA ALIVIA (RESTA)"**
   - Abajo: T = mg + \frac{mv^2}{R}
   - Arriba: T = \frac{mv^2}{R} - mg

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Aeroespacial y Fuerza G:** Durante el despegue de un cohete espacial o maniobras en cazas supersónicos, los astronautas experimentan aceleraciones lineales extremas hacia arriba (a). Por la segunda ley de Newton, la fuerza normal de soporte del asiento sobre el cuerpo del piloto alcanza varias veces su peso natural (N = m(g + a) = n \cdot mg). Esto induce el drenaje de sangre de la cabeza hacia las extremidades inferiores, pudiendo causar pérdida de conciencia por hipoxia cerebral inducida por fuerza G (*G-LOC*).
* **Biomecánica y Aparato Locomotor:** En la marcha humana, el pie ejerce una fuerza muscular oblicua hacia atrás contra el piso; por la tercera ley de Newton, el suelo responde con una fuerza de reacción de igual magnitud dirigida hacia adelante y hacia arriba (fuerza de reacción del suelo, GRF), permitiendo la propulsión cinemática del centro de gravedad corporal.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Fisiológico y Dinámica en Ascensores)
Un estudiante de física de masa m = 60\text{ kg} se coloca sobre una balanza de resorte graduada en newtons dentro de la cabina de un ascensor en un edificio de Yanahuara. Al iniciar el movimiento, la balanza registra una lectura transitoria de 720\text{ N} durante los primeros 3\text{ segundos}, luego marca 600\text{ N} durante los siguientes 10\text{ segundos}, y finalmente registra 450\text{ N} antes de detenerse. Considerando g = 10\text{ m/s}^2, ¿cuál es la descripción cinemática y dinámica correcta del movimiento del ascensor durante la primera y tercera etapa?
A) Etapa 1: Acelera hacia arriba con a = 2\text{ m/s}^2; Etapa 3: Desacelera frenando hacia arriba con a = 2.5\text{ m/s}^2.  
B) Etapa 1: Cae en caída libre; Etapa 3: Sube con velocidad constante.  
C) Etapa 1: Acelera hacia abajo con a = 1.2\text{ m/s}^2; Etapa 3: Acelera hacia arriba.  
D) Etapa 1: Permanece en reposo; Etapa 3: Cae con velocidad terminal.  
E) Etapa 1: Desacelera con a = 5\text{ m/s}^2; Etapa 3: Acelera con a = 2\text{ m/s}^2.  

* **Resolución:**
1. El peso real del estudiante es:
   P = mg = (60\text{ kg})(10\text{ m/s}^2) = 600\text{ N}
   La balanza registra la fuerza normal N que el piso ejerce sobre los pies del estudiante.
2. *Etapa 1 (N = 720\text{ N}):*
   Como N > P \implies La fuerza resultante apunta hacia arriba:
   F_R = N - mg = m \cdot a \implies 720 - 600 = 60 \cdot a \implies 120 = 60a \implies a = 2\text{ m/s}^2 \text{ (hacia arriba)}
   El ascensor sube acelerando con a = 2\text{ m/s}^2.
3. *Etapa 2 (N = 600\text{ N}):*
   N = P \implies a = 0. El ascensor sube con velocidad constante (MRU).
4. *Etapa 3 (N = 450\text{ N}):*
   Como N < P \implies La fuerza resultante apunta hacia abajo (frenado):
   mg - N = m \cdot a \implies 600 - 450 = 60 \cdot a \implies 150 = 60a \implies a = 2.5\text{ m/s}^2 \text{ (hacia abajo)}
   El ascensor sigue subiendo pero desacelera (frena) con a = 2.5\text{ m/s}^2 hasta detenerse.  
* **Respuesta:** A

---

### Pregunta 2 (Caso de Seguridad Vial y Rozamiento en Pavimento)
Un camión de carga pesada transita a 72\text{ km/h} (20\text{ m/s}) por una curva horizontal no peraltada en la variante de Uchumayo. El radio de curvatura de la pista es de R = 80\text{ m}. Si repentinamente cae una lluvia torrencial que reduce el coeficiente de fricción estática entre las llantas y el pavimento húmedo a \mu_s = 0.35, ¿qué ocurrirá con el camión al ingresar a la curva con esa rapidez y cuál es la rapidez máxima segura sin derrapar? (g = 10\text{ m/s}^2).
A) No derrapa; la rapidez máxima segura es de 25\text{ m/s}.  
B) Derrapa saliéndose tangencialmente de la pista porque su rapidez de 20\text{ m/s} supera la rapidez máxima admisible de \approx 16.7\text{ m/s}.  
C) El camión vuelca sobre su eje porque la aceleración centrípeta es nula.  
D) El rozamiento cinético empuja al camión hacia el centro de curvatura.  
E) No derrapa porque el peso del camión cancela la aceleración centrípeta.  

* **Resolución:**
1. En una curva horizontal sin peralte, la única fuerza que suministra la aceleración centrípeta para mantener al vehículo en la trayectoria circular es la fuerza de rozamiento estático máxima transversal de los neumáticos:
   F_c \le f_{s,\max} \implies m \frac{v^2}{R} \le \mu_s N
2. Como N = mg:
   m \frac{v^2}{R} \le \mu_s (mg) \implies v^2 \le \mu_s g R \implies v_{\max} = \sqrt{\mu_s g R}
3. Calculamos la rapidez máxima segura permitida por el asfalto mojado:
   v_{\max} = \sqrt{(0.35)(10\text{ m/s}^2)(80\text{ m})} = \sqrt{280} \approx 16.73\text{ m/s} \quad (60.2\text{ km/h})
4. Como el camión viaja a v = 20\text{ m/s} > 16.73\text{ m/s}, la fuerza centrípeta requerida para curvar la trayectoria excede la fricción máxima disponible en el piso mojado. El vehículo **derrapa lateralmente y pierde el control por inercia**.  
* **Respuesta:** B

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t03_s02_c01",
                    question = "**Enunciado:** Los ingenieros de transporte diseñan una curva en la autopista Arequipa-La Joya con un radio de curvatura de R = 200\\text{ metros}. La pista debe tener un ángulo de peralte \\theta calculado de manera que un vehículo que transite a la velocidad reglamentaria de diseño de 72\\text{ km/h} no dependa en absoluto de la fuerza de rozamiento entre los neumáticos y el asfalto mojado para mantenerse en su carril sin derrapar lateralmente. Considerando g = 10\\text{ m/s}^2, determine el valor de la tangente del ángulo de peralte óptimo (\\tan\\theta).",
                    options = listOf(
                        "0.10",
                        "0.15",
                        "0.20",
                        "0.25"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Convertimos la rapidez reglamentaria de \\text{km/h} a \\text{m/s}: v = 72\\text{ km/h} = 72 \\times \\frac{5}{18}\\text{ m/s} = 20\\text{ m/s} 2. Planteamos el DCL del vehículo sobre el plano inclinado peraltado sin rozamiento: - Fuerzas actuantes: el peso vertical hacia abajo (P = mg) y la fuerza normal \\vec{N} perpendicular a la calzada peraltada (que forma un ángulo \\theta con la vertical). 3. Ecuaciones dinámicas en los ejes: - Eje vertical (equilibrio): N \\cos\\theta = mg \\implies N = \\frac{mg}{\\cos\\theta} - Eje horizontal radial (provee la aceleración centrípeta a_c = v^2/R hacia el centro de giro): N \\sin\\theta = m a_c = m \\frac{v^2}{R} 4. Dividimos miembro a miembro la ecuación radial entre la ecuación vertical: \\frac{N \\sin\\theta}{N \\cos\\theta} = \\frac{m \\frac{v^2}{R}}{mg} \\implies \\tan\\theta = \\frac{v^2}{g R} 5. Reemplazamos los datos numéricos: \\tan\\theta = \\frac{(20\\text{ m/s})^2}{(10\\text{ m/s}^2)(200\\text{ m})} = \\frac{400}{2000} = \\frac{4}{20} = 0.20 - La tangente del ángulo de peralte óptimo es **0.20** (aproximadamente \\theta \\approx 11.3^\\circ). **Respuesta:** C ---"
                ),
                Challenge(
                    id = "fis_t03_s02_c02",
                    question = "**Enunciado:** Una pequeña esfera metálica de masa m = 0.5\\text{ kg} está sujeta al extremo de una cuerda inextensible y ligera de longitud L = 1.25\\text{ m}. El otro extremo de la cuerda está fijado a un punto del techo. La esfera gira describiendo una circunferencia en un plano horizontal con rapidez angular constante \\omega, formando la cuerda un ángulo constante de \\theta = 37^\\circ con la línea vertical descendente (péndulo cónico). Si la resistencia del aire es despreciable y tomando \\sin 37^\\circ \\approx 0.6, \\cos 37^\\circ \\approx 0.8 y g = 10\\text{ m/s}^2, calcule la tensión en la cuerda y la rapidez lineal v de la esfera en su órbita.",
                    options = listOf(
                        "T = 6.25\\text{ N}; v = 1.5\\sqrt{3}\\text{ m/s}",
                        "T = 5.00\\text{ N}; v = 2.0\\text{ m/s}",
                        "T = 6.25\\text{ N}; v = 2.37\\text{ m/s}",
                        "T = 4.00\\text{ N}; v = 1.85\\text{ m/s}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Determinamos el radio R de la trayectoria circular horizontal a partir de la geometría del péndulo: R = L \\sin\\theta = (1.25\\text{ m}) \\times (\\sin 37^\\circ) = 1.25 \\times 0.6 = 0.75\\text{ m} 2. Realizamos el DCL de la esfera: - Peso: P = mg = (0.5\\text{ kg})(10\\text{ m/s}^2) = 5\\text{ N} hacia abajo. - Tensión \\vec{T} a lo largo de la cuerda formando un ángulo \\theta = 37^\\circ con la vertical. 3. Descomponemos la tensión en ejes vertical y horizontal radial: - En el eje vertical (no hay aceleración vertical, equilibrio): \\sum F_y = 0 \\implies T \\cos 37^\\circ = mg \\implies T(0.8) = 5\\text{ N} T = \\frac{5}{0.8} = \\frac{50}{8} = 6.25\\text{ N} 4. En el eje horizontal radial hacia el centro de la órbita (aceleración centrípeta): \\sum F_c = m a_c \\implies T \\sin 37^\\circ = m \\frac{v^2}{R} (6.25\\text{ N}) \\times (0.6) = (0.5\\text{ kg}) \\frac{v^2}{0.75\\text{ m}} 3.75 = \\frac{0.5}{0.75} v^2 = \\frac{2}{3} v^2 v^2 = \\frac{3 \\times 3.75}{2} = \\frac{11.25}{2} = 5.625 v = \\sqrt{5.625} \\approx 2.37\\text{ m/s} - La tensión es 6.25\\text{ N} y la rapidez es \\approx 2.37\\text{ m/s}. **Respuesta:** C --- 1. ¿Qué magnitud física vectorial posee siempre exactamente la misma dirección y el mismo sentido que la aceleración de un cuerpo? 2. Si un bloque de 4\\text{ kg} se mueve en una superficie horizontal con velocidad constante de 15\\text{ m/s}, ¿cuánto vale la fuerza neta horizontal aplicada sobre él? 3. ¿Cuál es el módulo de la aceleración centrípeta de un automóvil que recorre una pista circular de radio R = 50\\text{ m} a una rapidez constante de 10\\text{ m/s}? 4. Si un resorte de constante k = 400\\text{ N/m} se comprime una distancia de x = 0.05\\text{ m}, ¿qué módulo tiene la fuerza elástica restauradora? 5. ¿Qué ley de Newton fundamenta que cuando disparamos un rifle, este retrocede contra el hombro del tirador? --- 1: C | 2: B | 3: B | 4: A | 5: C"
                ),
                Challenge(
                    id = "fis_t03_s02_c03",
                    question = "¿Cuál es la rapidez crítica mínima en la cúspide de una trayectoria circular vertical para que la cuerda no se afloje?",
                    options = listOf(
                        "\\tan\\theta = \\frac{v^2}{g R}.",
                        "Marca una normal aparente N = m(g + a).",
                        "v_{\\text{crítica}} = \\sqrt{g R}.",
                        "F_e = k \\cdot x (vectorialmente \\vec{F}_e = -k \\Delta\\vec{x})."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: v_{\\text{crítica}} = \\sqrt{g R}."
                ),
                Challenge(
                    id = "fis_t03_s02_c04",
                    question = "¿Qué fórmula describe el ángulo de peralte óptimo \\theta de una curva de radio R para una rapidez v sin rozamiento?",
                    options = listOf(
                        "v_{\\text{crítica}} = \\sqrt{g R}.",
                        "Marca una normal aparente N = m(g + a).",
                        "F_e = k \\cdot x (vectorialmente \\vec{F}_e = -k \\Delta\\vec{x}).",
                        "\\tan\\theta = \\frac{v^2}{g R}."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: \\tan\\theta = \\frac{v^2}{g R}."
                ),
                Challenge(
                    id = "fis_t03_s02_c05",
                    question = "Si la aceleración de un ascensor de masa m es a hacia arriba, ¿cuánto marca una balanza sobre la que se apoya una persona de masa m?",
                    options = listOf(
                        "Marca una normal aparente N = m(g + a).",
                        "v_{\\text{crítica}} = \\sqrt{g R}.",
                        "\\tan\\theta = \\frac{v^2}{g R}.",
                        "F_e = k \\cdot x (vectorialmente \\vec{F}_e = -k \\Delta\\vec{x})."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Marca una normal aparente N = m(g + a)."
                ),
                Challenge(
                    id = "fis_t03_s02_c06",
                    question = "¿Cómo se formula la Ley de Hooke para un resorte ideal?",
                    options = listOf(
                        "v_{\\text{crítica}} = \\sqrt{g R}.",
                        "F_e = k \\cdot x (vectorialmente \\vec{F}_e = -k \\Delta\\vec{x}).",
                        "\\tan\\theta = \\frac{v^2}{g R}.",
                        "Marca una normal aparente N = m(g + a)."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: F_e = k \\cdot x (vectorialmente \\vec{F}_e = -k \\Delta\\vec{x})."
                ),
                Challenge(
                    id = "fis_t03_s02_c07",
                    question = "En una curva horizontal plana sin peralte, ¿qué fuerza física proporciona la fuerza centrípeta que impide el derrape del automóvil?",
                    options = listOf(
                        "v_{\\text{crítica}} = \\sqrt{g R}.",
                        "\\tan\\theta = \\frac{v^2}{g R}.",
                        "La fuerza de rozamiento estático entre los neumáticos y el asfalto.",
                        "Marca una normal aparente N = m(g + a)."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: La fuerza de rozamiento estático entre los neumáticos y el asfalto."
                ),
                Challenge(
                    id = "fis_t03_s02_c08",
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
                    id = "fis_t03_s02_c09",
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
                    id = "fis_t03_s02_c10",
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
