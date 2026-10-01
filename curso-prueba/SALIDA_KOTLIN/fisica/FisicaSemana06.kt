package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t06_s01",
            title = "TRABAJO, ENERGÍA Y POTENCIA - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "TRABAJO, ENERGÍA Y POTENCIA - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

El Trabajo y la Energía constituyen los principios unificadores fundamentales de la física clásica, permitiendo analizar sistemas mecánicos complejos mediante magnitudes escalares sin recurrir a la integración directa de ecuaciones vectoriales de movimiento:
1. **Trabajo Mecánico (W):** Magnitud escalar que cuantifica la transferencia de movimiento o deformación debida a una fuerza que actúa a lo largo de un desplazamiento (W = \vec{F} \cdot \Delta\vec{r} = F d \cos\theta, unidad SI: el **joule [\text{J} = \text{N}\cdot\text{m}]**). Trabajo de fuerzas variables mediante el cálculo integral y el área bajo la curva F vs. x.
2. **Potencia Mecánica (P):** Rapidez temporal con la que se transfiere energía o se realiza trabajo mecánico (P = W/\Delta t = \vec{F} \cdot \vec{v}, unidad SI: el **watt [\text{W} = \text{J/s}]**). Eficiencia mecánica o rendimiento de máquinas (\eta = \frac{P_{\text{útil}}}{P_{\text{entregada}}} \times 100\%).
3. **Energía Mecánica (E_m):** Capacidad que posee un sistema material para realizar trabajo mecánico:
   - **Energía Cinética (E_c = \frac{1}{2} m v^2):** Asociada al estado de movimiento.
   - **Energía Potencial Gravitatoria (E_{pg} = m g h):** Asociada a la posición en el campo gravitatorio.
   - **Energía Potencial Elástica (E_{pe} = \frac{1}{2} k x^2):** Asociada a la deformación reversible de un resorte.
4. **Teoremas Fundamentales:**
   - **Teorema del Trabajo y la Energía Cinética (Teorema de las Fuerzas Vivas):** El trabajo neto de todas las fuerzas actuantes es igual a la variación de la energía cinética (W_{\text{neto}} = \Delta E_c).
   - **Conservación de la Energía Mecánica:** En presencia exclusiva de **fuerzas conservativas** (peso, fuerza elástica), la energía mecánica total permanece constante (E_{m1} = E_{m2}).
   - **Teorema de las Fuerzas No Conservativas:** En presencia de fricción o fuerzas disipativas: W_{FNC} = \Delta E_m = E_{mf} - E_{m0}.

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. TRABAJO MECÁNICO

El trabajo mecánico cuantifica la acción motriz o resistente que ejerce una fuerza al desplazar a un cuerpo a lo largo de una trayectoria:

#### A. Trabajo Realizado por una Fuerza Constante
Si una fuerza constante \vec{F} desplaza una partícula en línea recta una distancia \vec{d} = \Delta \vec{r}:
W = \vec{F} \cdot \vec{d} = F \cdot d \cdot \cos\theta
Donde \theta es el ángulo comprendido entre el vector fuerza \vec{F} y el vector desplazamiento \vec{d}.
- **Unidad en el SI:** Joule (\text{J}), donde 1\text{ J} = 1\text{ N}\cdot\text{m} = 1\text{ kg}\cdot\text{m}^2/\text{s}^2.
- **Fórmula Dimensional:** [W] = ML^2T^{-2}.
- **Signo Físico del Trabajo:**
  - **Trabajo Motor o Positivo (W > 0):** Cuando 0^\circ \le \theta < 90^\circ (\cos\theta > 0). La fuerza colabora con el movimiento, transfiriendo energía al cuerpo (máximo cuando \theta = 0^\circ \implies W = F \cdot d).
  - **Trabajo Resistente o Negativo (W < 0):** Cuando 90^\circ < \theta \le 180^\circ (\cos\theta < 0). La fuerza se opone al movimiento, extrayendo energía del cuerpo (ej. fuerza de rozamiento cinético: \theta = 180^\circ \implies W_{f_k} = -f_k \cdot d).
  - **Trabajo Nulo (W = 0):** Cuando \theta = 90^\circ (\cos 90^\circ = 0). **Una fuerza perpendicular al desplazamiento NO realiza trabajo mecánico** (ej. la fuerza normal en un plano horizontal, o la fuerza centrípeta en cualquier movimiento circular: W_{F_c} = 0).

#### B. Trabajo Realizado por una Fuerza Variable Unidimensional
Para una fuerza cuya magnitud varía a lo largo de la trayectoria rectilínea F_x(x):
W = \int_{x_1}^{x_2} F_x(x) \, dx
- **Interpretación Gráfica:** En una gráfica de Fuerza versus Posición (F vs. x), **el área bajo la curva comprendida entre las posiciones inicial y final representa exactamente el trabajo mecánico realizado**:
  W_{x_1 \to x_2} = \text{Área bajo la curva } F-x
  *(Las áreas por encima del eje X representan trabajo positivo y las áreas por debajo trabajo negativo).*

#### C. Trabajo de Fuerzas Notables
1. **Trabajo de la Fuerza de Gravedad (Peso):**
   W_g = \pm m g h
   - Signo + si el cuerpo desciende (a favor de la gravedad).
   - Signo - si el cuerpo asciende (en contra de la gravedad).
   - *Propiedad:* Es independiente de la trayectoria; solo depende del desnivel vertical entre la posición inicial y final:
     W_g = -mg(y_f - y_0) = -\Delta E_{pg}
2. **Trabajo de la Fuerza Elástica (Resorte de Hooke):**
   Dado que F_e = -kx, al estirar o comprimir el resorte desde una posición x_1 hasta x_2:
   W_{\text{resorte}} = \int_{x_1}^{x_2} (-kx) \, dx = -\frac{1}{2} k x_2^2 + \frac{1}{2} k x_1^2 = -\Delta E_{pe}
3. **Trabajo Neto o Total (W_{\text{neto}}):**
   Es la suma algebraica de los trabajos realizados por todas las fuerzas individuales que actúan sobre el cuerpo, o equivalentemente el trabajo de la fuerza resultante:
   W_{\text{neto}} = \sum_{i=1}^{n} W_i = \vec{F}_R \cdot \Delta \vec{r}

---

### 2.2. POTENCIA MECÁNICA Y RENDIMIENTO

La potencia mecánica es la rapidez con la que se transfiere energía o se ejecuta trabajo mecánico:
1. **Potencia Media (P_m):**
   P_m = \frac{W}{\Delta t} \quad [\text{J/s} = \text{Watt (W)}]
   - Equivalencias clásicas:
     1\text{ Kilowatt (kW)} = 1000\text{ W}
     1\text{ Caballo de Vapor (CV)} \approx 735.5\text{ W}
     1\text{ Caballo de Fuerza (HP)} \approx 746\text{ W}
2. **Potencia Instantánea (P):**
   P = \frac{dW}{dt} = \frac{\vec{F} \cdot d\vec{r}}{dt} = \vec{F} \cdot \vec{v} = F \cdot v \cos\theta
   Si la fuerza y la velocidad son colineales y del mismo sentido:
   P = F \cdot v
3. **Eficiencia Mecánica o Rendimiento (\eta):**
   En toda máquina real, parte de la potencia consumida o entregada se disipa en calor debido a la fricción interna y viscosidad:
   P_{\text{entregada (total)}} = P_{\text{útil (aprovechada)}} + P_{\text{perdida (disipada)}}
   \eta = \frac{P_{\text{útil}}}{P_{\text{entregada}}} \times 100\% \quad (0 < \eta < 100\%)

---


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS FUNDAMENTALES Y RELACIONES MATEMÁTICAS

1. **Trabajo Mecánico:**
   W = F \cdot d \cdot \cos\theta
   W = \text{Área}_{F-x}
   W_{\text{gravedad}} = \pm mgh
   W_{\text{resorte}} = -\left(\frac{1}{2}kx_f^2 - \frac{1}{2}kx_i^2\right)

2. **Potencia y Eficiencia:**
   P_m = \frac{W}{\Delta t}, \quad P = \vec{F} \cdot \vec{v} = F v \cos\theta
   \eta = \frac{P_{\text{útil}}}{P_{\text{entregada}}} \times 100\%


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t06_s01_c01",
                    question = "**Enunciado:** Un bloque de masa m = 5\\text{ kg} es arrastrado sobre un piso horizontal una distancia de d = 10\\text{ metros} mediante una fuerza constante F = 40\\text{ N} que forma un ángulo de 60^\\circ con la horizontal. Si sobre el bloque actúa una fuerza de rozamiento cinético constante de f_k = 6\\text{ N}, determine:",
                    options = listOf(
                        "W_F = 200\\text{ J}; W_{\\text{neto}} = 140\\text{ J}",
                        "W_F = 400\\text{ J}; W_{\\text{neto}} = 340\\text{ J}",
                        "W_F = 200\\text{ J}; W_{\\text{neto}} = 260\\text{ J}",
                        "W_F = 346\\text{ J}; W_{\\text{neto}} = 286\\text{ J}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Calculamos el trabajo realizado por la fuerza F usando la definición de producto escalar (\\theta = 60^\\circ, \\cos 60^\\circ = 0.5): W_F = F \\cdot d \\cdot \\cos 60^\\circ = (40\\text{ N}) \\times (10\\text{ m}) \\times (0.5) = 200\\text{ J} 2. Calculamos el trabajo realizado por la fuerza de rozamiento cinético (\\theta = 180^\\circ): W_{f_k} = f_k \\cdot d \\cdot \\cos 180^\\circ = (6\\text{ N}) \\times (10\\text{ m}) \\times (-1) = -60\\text{ J} 3. El peso y la normal son perpendiculares al desplazamiento (W_P = 0, W_N = 0). 4. Calculamos el trabajo neto sumando algebraicamente los trabajos de todas las fuerzas: W_{\\text{neto}} = W_F + W_{f_k} + W_P + W_N = 200\\text{ J} + (-60\\text{ J}) + 0 + 0 = 140\\text{ J} **Respuesta:** A ---"
                ),
                Challenge(
                    id = "fis_t06_s01_c02",
                    question = "**Enunciado:** Una electrobomba instalada en una finca agrícola en La Joya (Arequipa) extrae agua subterránea desde una profundidad de h = 30\\text{ metros} a razón de 1200\\text{ litros} por minuto, descargándola a nivel del suelo con velocidad despreciable. Si el motor eléctrico de la bomba tiene una eficiencia o rendimiento mecánico del 80\\%, ¿cuál es la potencia eléctrica que debe suministrar la red para operar el sistema? (Considere densidad del agua \\rho = 1000\\text{ kg/m}^3 y g = 10\\text{ m/s}^2).",
                    options = listOf(
                        "4.5\\text{ kW}",
                        "6.0\\text{ kW}",
                        "7.5\\text{ kW}",
                        "9.0\\text{ kW}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Determinamos la masa de agua bombeada por unidad de tiempo: V = 1200\\text{ L} \\implies m = 1200\\text{ kg} Intervalo de tiempo: \\Delta t = 1\\text{ minuto} = 60\\text{ segundos}. 2. Calculamos el trabajo útil necesario para elevar dicha masa de agua contra la gravedad: W_{\\text{útil}} = m \\cdot g \\cdot h = (1200\\text{ kg}) \\times (10\\text{ m/s}^2) \\times (30\\text{ m}) = 360\\ 000\\text{ J} 3. Calculamos la potencia mecánica útil generada por la bomba: P_{\\text{útil}} = \\frac{W_{\\text{útil}}}{\\Delta t} = \\frac{360\\ 000\\text{ J}}{60\\text{ s}} = 6000\\text{ W} = 6\\text{ kW} 4. Aplicamos la fórmula del rendimiento mecánico: \\eta = \\frac{P_{\\text{útil}}}{P_{\\text{consumida}}} \\times 100\\% \\implies 0.80 = \\frac{6\\text{ kW}}{P_{\\text{consumida}}} P_{\\text{consumida}} = \\frac{6\\text{ kW}}{0.80} = 7.5\\text{ kW} **Respuesta:** C ---"
                ),
                Challenge(
                    id = "fis_t06_s01_c03",
                    question = "**Enunciado:** Un bloque de masa m = 2\\text{ kg} se suelta desde el reposo en el punto A de una rampa curva lisa sin rozamiento desde una altura de H = 1.8\\text{ metros} sobre un piso horizontal liso. En el tramo horizontal colisiona frontalmente contra un resorte elástico horizontal de constante elástica k = 400\\text{ N/m} fijado firmemente a una pared rígida. Determine la máxima deformación (compresión) que experimenta el resorte al detener momentáneamente al bloque. (g = 10\\text{ m/s}^2).",
                    options = listOf(
                        "0.20\\text{ m}",
                        "0.30\\text{ m}",
                        "0.42\\text{ m}",
                        "0.50\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Elegimos como Nivel de Referencia (N.R.) el piso horizontal donde se ubica el resorte (y = 0). 2. Dado que no existe fricción en ninguna parte del recorrido y la fuerza normal no realiza trabajo (W_{NC} = 0), la **energía mecánica total se conserva rigurosamente** entre la posición inicial A y el punto de máxima compresión del resorte B: E_{mA} = E_{mB} 3. En el punto A (reposo a altura H): E_{mA} = E_{cA} + E_{pgA} + E_{peA} = 0 + mgH + 0 = (2\\text{ kg})(10\\text{ m/s}^2)(1.8\\text{ m}) = 36\\text{ J} 4. En el punto B (resorte comprimido al máximo x_{\\max}, el bloque se detiene momentáneamente \\implies v = 0): E_{mB} = E_{cB} + E_{pgB} + E_{peB} = 0 + 0 + \\frac{1}{2} k x_{\\max}^2 = \\frac{1}{2}(400) x_{\\max}^2 = 200 x_{\\max}^2 5. Igualamos las energías mecánicas: 36 = 200 x_{\\max}^2 \\implies x_{\\max}^2 = \\frac{36}{200} = \\frac{18}{100} = 0.18 x_{\\max} = \\sqrt{0.18} = \\sqrt{\\frac{18}{100}} = \\frac{3\\sqrt{2}}{10} \\approx \\frac{3(1.414)}{10} \\approx 0.424\\text{ m} - La máxima compresión del resorte es de **0.42\\text{ metros}**. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "fis_t06_s01_c04",
                    question = "¿Cuánto trabajo mecánico realiza una fuerza que actúa de manera estrictamente perpendicular al desplazamiento del cuerpo?",
                    options = listOf(
                        "El trabajo mecánico realizado por la fuerza.",
                        "W_{\\text{neto}} = \\Delta E_c = \\frac{1}{2}mv_f^2 - \\frac{1}{2}mv_0^2.",
                        "Cuando únicamente actúan fuerzas conservativas o las fuerzas no conservativas presentes no realizan trabajo mecánico (W_{FNC} = 0).",
                        "Cero (W = F d \\cos 90^\\circ = 0)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Cero (W = F d \\cos 90^\\circ = 0)."
                ),
                Challenge(
                    id = "fis_t06_s01_c05",
                    question = "¿Qué magnitud física representa el área bajo la curva en un gráfico de Fuerza versus Posición (F vs. x)?",
                    options = listOf(
                        "El trabajo mecánico realizado por la fuerza.",
                        "Cero (W = F d \\cos 90^\\circ = 0).",
                        "W_{\\text{neto}} = \\Delta E_c = \\frac{1}{2}mv_f^2 - \\frac{1}{2}mv_0^2.",
                        "Cuando únicamente actúan fuerzas conservativas o las fuerzas no conservativas presentes no realizan trabajo mecánico (W_{FNC} = 0)."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: El trabajo mecánico realizado por la fuerza."
                ),
                Challenge(
                    id = "fis_t06_s01_c06",
                    question = "¿Cómo se formula el Teorema del Trabajo y la Energía Cinética?",
                    options = listOf(
                        "Cero (W = F d \\cos 90^\\circ = 0).",
                        "W_{\\text{neto}} = \\Delta E_c = \\frac{1}{2}mv_f^2 - \\frac{1}{2}mv_0^2.",
                        "El trabajo mecánico realizado por la fuerza.",
                        "Cuando únicamente actúan fuerzas conservativas o las fuerzas no conservativas presentes no realizan trabajo mecánico (W_{FNC} = 0)."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: W_{\\text{neto}} = \\Delta E_c = \\frac{1}{2}mv_f^2 - \\frac{1}{2}mv_0^2."
                ),
                Challenge(
                    id = "fis_t06_s01_c07",
                    question = "¿En qué condiciones físicas se conserva de forma estricta la energía mecánica total de un sistema (E_{m1} = E_{m2})?",
                    options = listOf(
                        "Cero (W = F d \\cos 90^\\circ = 0).",
                        "El trabajo mecánico realizado por la fuerza.",
                        "Cuando únicamente actúan fuerzas conservativas o las fuerzas no conservativas presentes no realizan trabajo mecánico (W_{FNC} = 0).",
                        "W_{\\text{neto}} = \\Delta E_c = \\frac{1}{2}mv_f^2 - \\frac{1}{2}mv_0^2."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Cuando únicamente actúan fuerzas conservativas o las fuerzas no conservativas presentes no realizan trabajo mecánico (W_{FNC} = 0)."
                ),
                Challenge(
                    id = "fis_t06_s01_c08",
                    question = "¿Cuál es la relación matemática que vincula la potencia mecánica instantánea con la fuerza y la velocidad?",
                    options = listOf(
                        "Cero (W = F d \\cos 90^\\circ = 0).",
                        "El trabajo mecánico realizado por la fuerza.",
                        "W_{\\text{neto}} = \\Delta E_c = \\frac{1}{2}mv_f^2 - \\frac{1}{2}mv_0^2.",
                        "P = \\vec{F} \\cdot \\vec{v} = F v \\cos\\theta."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: P = \\vec{F} \\cdot \\vec{v} = F v \\cos\\theta."
                ),
                Challenge(
                    id = "fis_t06_s01_c09",
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
                    id = "fis_t06_s01_c10",
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
            id = "fis_t06_s02",
            title = "TRABAJO, ENERGÍA Y POTENCIA - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "TRABAJO, ENERGÍA Y POTENCIA - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 2.3. ENERGÍA MECÁNICA Y SUS FORMAS

La energía mecánica es una magnitud escalar asociada al movimiento relativo y a la configuración espacial de un sistema:

#### A. Energía Cinética Traslacional (E_c)
Energía asociada al movimiento de una masa m que se desplaza a una rapidez v:
E_c = \frac{1}{2} m v^2 = \frac{p^2}{2m}
- Siempre es una magnitud no negativa: E_c \ge 0.
- Depende del sistema de referencia inercial elegido (a través de la velocidad).

#### B. Energía Potencial Gravitatoria (E_{pg})
Energía de configuración debida a la atracción gravitatoria mutua entre la Tierra y una masa m situada a una altura h respecto a un **Nivel de Referencia (N.R.)** horizontal arbitrario:
E_{pg} = m \cdot g \cdot h
- Puede ser positiva (si el cuerpo está por encima del N.R.), nula (en el N.R.) o negativa (si se sitúa por debajo del N.R.).

#### C. Energía Potencial Elástica (E_{pe})
Energía interna almacenada en los enlaces interatómicos de un resorte o cuerpo deformable ideal de rigidez k sometido a una deformación (alargamiento o acortamiento) x:
E_{pe} = \frac{1}{2} k x^2
- Siempre es no negativa (E_{pe} \ge 0), independientemente de si el resorte está estirado (x > 0) o comprimido (x < 0).

#### D. Energía Mecánica Total (E_m)
Suma de la energía cinética y las energías potenciales presentes en el sistema:
E_m = E_c + E_p = \frac{1}{2} m v^2 + m g h + \frac{1}{2} k x^2

---

### 2.4. TEOREMAS DE TRABAJO Y ENERGÍA

#### A. Teorema del Trabajo y la Energía Cinética
*"El trabajo neto realizado por todas las fuerzas externas que actúan sobre una partícula es igual al cambio en su energía cinética entre las posiciones inicial y final."*
W_{\text{neto}} = \Delta E_c = E_{cf} - E_{c0} = \frac{1}{2} m v_f^2 - \frac{1}{2} m v_0^2
- Es un teorema universal: **es válido siempre**, tanto para fuerzas conservativas como no conservativas, trayectorias rectilíneas o curvilíneas.

#### B. Fuerzas Conservativas vs. Fuerzas No Conservativas (Disipativas)
1. **Fuerzas Conservativas:**
   - Aquellas en las que el trabajo realizado entre dos puntos depende **únicamente de la posición inicial y final, y es independiente de la trayectoria recorrida**.
   - El trabajo realizado a lo largo de cualquier trayectoria cerrada (ciclo cerrado) es rigurosamente nulo:
     \oint \vec{F}_{\text{cons}} \cdot d\vec{r} = 0
   - Se relacionan con una función de energía potencial mediante: W_{\text{cons}} = -\Delta E_p.
   - *Ejemplos:* Peso (gravedad), fuerza elástica de resortes, fuerza electrostática de Coulomb.
2. **Fuerzas No Conservativas (Disipativas):**
   - Aquellas en las que el trabajo depende de la trayectoria y longitud recorrida; disipan energía mecánica en forma de energía térmica (calor) no recuperable.
   - *Ejemplos:* Fuerza de rozamiento cinético (f_k), resistencia aerodinámica de fluidos, viscosidad, fuerzas aplicadas por motores.

#### C. Principio de Conservación de la Energía Mecánica
Si sobre un sistema actúan **únicamente fuerzas conservativas** (o las fuerzas no conservativas presentes no realizan trabajo mecánico, como la fuerza normal que es perpendicular al movimiento):
W_{\text{neto}} = W_{\text{cons}} \implies \Delta E_c = -\Delta E_p \implies \Delta E_c + \Delta E_p = 0
\Delta E_m = 0 \implies \mathbf{E_{m,\text{inicial}} = E_{m,\text{final}}}
E_{c1} + E_{pg1} + E_{pe1} = E_{c2} + E_{pg2} + E_{pe2}

#### D. Teorema General de la Energía con Fuerzas No Conservativas
Si en el sistema actúan fuerzas disipativas (como la fricción con el piso o el aire):
W_{\text{neto}} = W_{\text{cons}} + W_{FNC}
\Delta E_c = -\Delta E_p + W_{FNC} \implies \mathbf{W_{FNC} = \Delta E_m = E_{mf} - E_{m0}}
Como habitualmente el trabajo de las fuerzas disipativas es negativo (W_{FNC} < 0):
E_{mf} = E_{m0} - |W_{\text{fricción}}|
La diferencia de energía mecánica se transforma íntegramente en calor disipado (Q = |W_{f_k}|).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
3. **Energías Mecánicas:**
   E_c = \frac{1}{2} m v^2 = \frac{p^2}{2m}
   E_{pg} = mgh
   E_{pe} = \frac{1}{2} k x^2

4. **Teoremas Clave de Conservación:**
   W_{\text{neto}} = \Delta E_c
   E_{m1} = E_{m2} \quad (\text{Sin fricción})
   W_{FNC} = \Delta E_m = E_{m2} - E_{m1}
   W_{f_k} = -f_k \cdot d

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Trabajo de la Fuerza Normal:** En la inmensa mayoría de problemas preuniversitarios, la fuerza normal es perpendicular al desplazamiento instantáneo de la superficie, por lo que **su trabajo mecánico es CERO (W_N = 0)**. ¡Cuidado! La normal solo realiza trabajo si la superficie de apoyo se desplaza aceleradamente (como en un ascensor o cuña móvil).
* **Nivel de Referencia (N.R.) en Energía Potencial:** La energía potencial gravitatoria no tiene un valor absoluto único; depende de dónde coloques el Nivel de Referencia horizontal (h = 0). Una vez fijado el N.R. al inicio del problema, **debes mantenerlo constante para todos los puntos del análisis**.
* **El Trabajo del Rozamiento no es Función de Estado:** El trabajo de la fricción cinética depende de la longitud total recorrida de la trayectoria, no del vector desplazamiento: W_{f_k} = -f_k \cdot d_{\text{trayectoria}}.
* **Potencia y Velocidad en Subidas:** Para subir un vehículo a velocidad constante por una pendiente inclinada, la fuerza motriz del motor debe equilibrar al componente del peso paralelo a la pendiente más la fricción: F_{\text{motor}} = mg\sin\theta + f_k \implies P = (mg\sin\theta + f_k)v.
* **El Teorema de las Fuerzas Vivas no Requiere Masa en Caída Libre:** Al aplicar W_{\text{neto}} = \Delta E_c a un objeto que cae en el vacío: mgh = \frac{1}{2}mv_f^2 \implies v_f = \sqrt{2gh}, independiente de la masa.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Signo del Trabajo según el Ángulo:**
   > **"AGUDO AYUDA (+), RECTO NO HACE NADA (0), OBTUSO SE OPONE (-)"**
   - \theta < 90^\circ: Trabajo Positivo (Motor).
   - \theta = 90^\circ: Trabajo Nulo (W = 0).
   - \theta > 90^\circ: Trabajo Negativo (Resistente).

2. **Teorema de Fuerzas Vivas:**
   > **"NETO ES CINÉTICO"**
   W_{\text{neto}} = \Delta E_c
   *(El trabajo neto de TODAS las fuerzas solo cambia la energía cinética).*

3. **Fuerzas No Conservativas:**
   > **"LA FRICCIÓN SE ROBA LA MECÁNICA"**
   W_{FNC} = E_{m,\text{final}} - E_{m,\text{inicial}}

4. **Potencia con Velocidad:**
   > **"PAVO"**
   \mathbf{P} = \mathbf{F} \cdot \mathbf{v}

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Hidroeléctrica (Central de Charcani V en Arequipa):** La generación de energía eléctrica en presas y centrales hidroeléctricas aprovecha la transformación de energía potencial gravitatoria del agua embalsada (mgh) en energía cinética de chorros a alta presión que mueven turbinas Pelton. La potencia hidráulica generada se modela directamente como P = \eta \cdot \rho Q g h, donde \eta es la eficiencia combinada de la turbina y el generador sincrónico.
* **Fisiología del Esfuerzo y Ergometría Médica:** En pruebas de esfuerzo cardíaco (ergometría en cinta rodante o cicloergómetro), se mide la potencia mecánica disipada por el cuerpo humano en watts (P = \vec{F} \cdot \vec{v}). La relación entre la potencia mecánica externa y la tasa metabólica basal (consumo de oxígeno, \text{VO}_2\max) refleja la eficiencia muscular del organismo, que oscila típicamente entre el 18\% y el 25\%.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Energético: Montaña Rusa y Fuerza de Apoyo)
En un parque de atracciones se diseña una montaña rusa de rieles lisos (sin fricción). Un carrito de masa m = 200\text{ kg} parte del reposo desde una plataforma elevada en el punto A situado a una altura H sobre el suelo y desciende por una pendiente para ingresar a un rizo vertical (*looping*) circular de radio R = 8\text{ metros}. Si los diseñadores requieren que en el punto más alto del rizo (punto C, a una altura de 2R = 16\text{ m} sobre el suelo) la fuerza normal que los rieles ejercen sobre las ruedas del carrito sea igual al propio peso del carrito (N_C = mg) para garantizar la seguridad de los pasajeros sin descarrilamiento, ¿desde qué altura mínima H debe soltarse el carrito en el punto A? (Considere g = 10\text{ m/s}^2).
A) 16\text{ m}  
B) 20\text{ m}  
C) 24\text{ m}  
D) 28\text{ m}  
E) 32\text{ m}  

* **Resolución:**
1. *Dinámica circular en la cúspide del rizo (punto C):*
   En el punto más alto, tanto la fuerza normal \vec{N}_C como el peso m\vec{g} apuntan verticalmente hacia el centro del rizo (hacia abajo), suministrando la fuerza centrípeta:
   F_c = N_C + mg = m \frac{v_C^2}{R}
   El enunciado establece como condición de diseño que N_C = mg:
   mg + mg = m \frac{v_C^2}{R} \implies 2mg = m \frac{v_C^2}{R} \implies v_C^2 = 2gR
2. *Conservación de la energía mecánica entre el punto inicial A y la cúspide C:*
   Dado que los rieles son lisos y la normal no realiza trabajo mecánico, la energía mecánica se conserva:
   E_{mA} = E_{mC}
   Tomando como Nivel de Referencia el suelo horizontal:
   - En el punto A (reposo, v_A = 0):
     E_{mA} = mgH
   - En el punto C (altura 2R y velocidad v_C):
     E_{mC} = \frac{1}{2} m v_C^2 + mg(2R) = \frac{1}{2} m (2gR) + 2mgR = mgR + 2mgR = 3mgR
3. Igualamos ambas energías mecánicas:
   mgH = 3mgR \implies H = 3R
4. Reemplazamos el valor del radio del rizo (R = 8\text{ m}):
   H = 3(8\text{ m}) = 24\text{ metros}
- El carrito debe soltarse desde una altura mínima de **24\text{ metros}**.  
* **Respuesta:** C

---

### Pregunta 2 (Caso de Seguridad Industrial: Frenado de Emergencia en Minas)
En un pique inclinado de una mina subterránea en Caylloma que desciende con un ángulo de 37^\circ respecto a la horizontal, un carro minero de masa m = 500\text{ kg} se suelta accidentalmente por la rotura de un cable. El carro desliza libremente por la pendiente lisa a lo largo de d_1 = 20\text{ metros} y luego ingresa a una rampa horizontal de arena de seguridad de longitud L dotada de un coeficiente de fricción cinética \mu_k = 0.60 diseñada para frenar carritos desbocados. Determine la longitud horizontal mínima L que debe tener la rampa de arena para detener por completo al carro minero. (\sin 37^\circ = 0.6, \cos 37^\circ = 0.8, g = 10\text{ m/s}^2).
A) 10\text{ m}  
B) 15\text{ m}  
C) 20\text{ m}  
D) 25\text{ m}  
E) 30\text{ m}  

* **Resolución:**
1. Establecemos el Nivel de Referencia (N.R.) en la rampa horizontal de arena.
2. Calculamos la altura vertical inicial h desde la cual se desprendió el carro:
   h = d_1 \sin 37^\circ = (20\text{ m}) \times (0.6) = 12\text{ metros}
3. Estado inicial 1 (reposo a altura h = 12\text{ m}):
   E_{m1} = mgh = (500\text{ kg})(10\text{ m/s}^2)(12\text{ m}) = 60\ 000\text{ J}
4. Estado final 2 (detenido en la rampa horizontal, v_2 = 0, h_2 = 0):
   E_{m2} = 0
5. En la rampa horizontal actúa la fricción no conservativa de la arena sobre una distancia L:
   - Fuerza normal: N = mg = (500)(10) = 5000\text{ N}.
   - Fuerza de fricción: f_k = \mu_k N = (0.60)(5000\text{ N}) = 3000\text{ N}.
   - Trabajo de la fuerza de fricción:
     W_{FNC} = -f_k \cdot L = -3000 L
6. Aplicamos el Teorema de las Fuerzas No Conservativas:
   W_{FNC} = E_{m2} - E_{m1} \implies -3000 L = 0 - 60\ 000
   3000 L = 60\ 000 \implies L = \frac{60\ 000}{3000} = 20\text{ metros}
- La rampa de arena debe medir como mínimo **20\text{ metros}**.  
* **Respuesta:** C

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t06_s02_c01",
                    question = "**Enunciado:** Un bloque de masa m = 4\\text{ kg} se proyecta horizontalmente sobre una superficie áspera con una rapidez inicial de v_0 = 12\\text{ m/s}. El bloque recorre una distancia horizontal L = 10\\text{ metros} sobre un tramo con coeficiente de fricción cinética \\mu_k = 0.25, y a continuación asciende por una rampa curva lisa (sin rozamiento) hasta detenerse momentáneamente en un punto B a una altura h sobre el suelo horizontal. Determine la altura máxima h alcanzada por el bloque. (g = 10\\text{ m/s}^2).",
                    options = listOf(
                        "3.6\\text{ m}",
                        "4.7\\text{ m}",
                        "5.2\\text{ m}",
                        "6.0\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Establecemos el Nivel de Referencia (N.R.) en el suelo horizontal. 2. Identificamos los estados inicial y final: - Estado inicial 1 (en el suelo, h_1 = 0, v_1 = 12\\text{ m/s}): E_{m1} = \\frac{1}{2} m v_1^2 = \\frac{1}{2}(4\\text{ kg})(12\\text{ m/s})^2 = 2 \\times 144 = 288\\text{ J} - Estado final 2 (en la cima de la rampa lisa, v_2 = 0, altura h): E_{m2} = m g h = (4\\text{ kg})(10\\text{ m/s}^2) h = 40 h 3. Calculamos el trabajo realizado por la fuerza no conservativa (rozamiento cinético en el tramo horizontal de 10\\text{ m}): - Fuerza normal en el plano horizontal: N = mg = (4)(10) = 40\\text{ N}. - Fuerza de rozamiento: f_k = \\mu_k N = (0.25)(40\\text{ N}) = 10\\text{ N}. - Trabajo de la fricción: W_{FNC} = W_{f_k} = -f_k \\cdot L = -(10\\text{ N}) \\times (10\\text{ m}) = -100\\text{ J} 4. Aplicamos el Teorema de las Fuerzas No Conservativas: W_{FNC} = \\Delta E_m = E_{m2} - E_{m1} -100 = 40h - 288 40h = 288 - 100 = 188 h = \\frac{188}{40} = 4.7\\text{ metros} **Respuesta:** B ---"
                ),
                Challenge(
                    id = "fis_t06_s02_c02",
                    question = "**Enunciado:** Una partícula de masa m = 2\\text{ kg} se desplaza a lo largo del eje X bajo la acción de una fuerza resultante unidimensional cuya magnitud varía con la posición según la ley:",
                    options = listOf(
                        "W = 51\\text{ J}; v_f = 6.0\\text{ m/s}",
                        "W = 60\\text{ J}; v_f = 7.0\\text{ m/s}",
                        "W = 51\\text{ J}; v_f = \\sqrt{60}\\text{ m/s} \\approx 7.75\\text{ m/s}",
                        "W = 45\\text{ J}; v_f = 6.5\\text{ m/s}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución:** 1. Calculamos el trabajo neto realizado por la fuerza variable mediante la integral de línea unidimensional: W = \\int_{x_0}^{x_f} F(x) \\, dx = \\int_{0}^{3} (6x^2 - 4x + 5) \\, dx 2. Integramos término a término: W = \\left[ 6 \\frac{x^3}{3} - 4 \\frac{x^2}{2} + 5x \\right]_{0}^{3} = \\left[ 2x^3 - 2x^2 + 5x \\right]_{0}^{3} 3. Evaluamos en los límites de integración: W = [2(3)^3 - 2(3)^2 + 5(3)] - [0] W = [2(27) - 2(9) + 15] = 54 - 18 + 15 = 51\\text{ J} El trabajo neto realizado es **51\\text{ Joules}**. 4. Aplicamos el Teorema del Trabajo y la Energía Cinética para hallar la rapidez final: W_{\\text{neto}} = \\Delta E_c = \\frac{1}{2} m v_f^2 - \\frac{1}{2} m v_0^2 51 = \\frac{1}{2}(2\\text{ kg}) v_f^2 - \\frac{1}{2}(2\\text{ kg})(3\\text{ m/s})^2 51 = v_f^2 - 9 \\implies v_f^2 = 51 + 9 = 60 v_f = \\sqrt{60} = 2\\sqrt{15} \\approx 7.75\\text{ m/s} - El trabajo neto es 51\\text{ J} y la rapidez final es \\sqrt{60}\\text{ m/s}. **Respuesta:** C --- 1. ¿Qué unidad dimensional en el Sistema Internacional corresponde al trabajo mecánico? 2. ¿Cuánto vale el trabajo realizado por la fuerza centrípeta sobre una partícula en cualquier trayectoria circular? 3. Si un motor absorbe una potencia eléctrica de 10\\text{ kW} y realiza un trabajo útil de 8\\text{ kW}, ¿cuál es su eficiencia mecánica? 4. Si la rapidez de un automóvil se duplica (v \\to 2v), ¿en qué factor se incrementa su energía cinética? 5. ¿Cuál de las siguientes fuerzas mecánicas es de naturaleza NO conservativa (disipativa)? --- 1: B | 2: B | 3: C | 4: C | 5: D"
                ),
                Challenge(
                    id = "fis_t06_s02_c03",
                    question = "¿Cuál es la fórmula de la energía potencial elástica almacenada en un resorte deformado una distancia x?",
                    options = listOf(
                        "W_{\\text{cons}} = -\\Delta E_p = -(E_{pf} - E_{p0}).",
                        "Aproximadamente 746\\text{ Watts}.",
                        "E_{pe} = \\frac{1}{2} k x^2.",
                        "Tiene signo negativo (W_{f_k} < 0), porque se opone al desplazamiento relativo (\\cos 180^\\circ = -1)."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: E_{pe} = \\frac{1}{2} k x^2."
                ),
                Challenge(
                    id = "fis_t06_s02_c04",
                    question = "¿Qué relación existe entre el trabajo realizado por una fuerza conservativa y la energía potencial correspondiente?",
                    options = listOf(
                        "E_{pe} = \\frac{1}{2} k x^2.",
                        "Aproximadamente 746\\text{ Watts}.",
                        "Tiene signo negativo (W_{f_k} < 0), porque se opone al desplazamiento relativo (\\cos 180^\\circ = -1).",
                        "W_{\\text{cons}} = -\\Delta E_p = -(E_{pf} - E_{p0})."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: W_{\\text{cons}} = -\\Delta E_p = -(E_{pf} - E_{p0})."
                ),
                Challenge(
                    id = "fis_t06_s02_c05",
                    question = "¿A cuántos watts equivale aproximadamente un caballo de fuerza métrico (1 HP)?",
                    options = listOf(
                        "Aproximadamente 746\\text{ Watts}.",
                        "E_{pe} = \\frac{1}{2} k x^2.",
                        "W_{\\text{cons}} = -\\Delta E_p = -(E_{pf} - E_{p0}).",
                        "Tiene signo negativo (W_{f_k} < 0), porque se opone al desplazamiento relativo (\\cos 180^\\circ = -1)."
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Aproximadamente 746\\text{ Watts}."
                ),
                Challenge(
                    id = "fis_t06_s02_c06",
                    question = "Si un cuerpo se desplaza sobre una superficie rugosa, ¿qué signo tiene siempre el trabajo realizado por la fuerza de rozamiento cinético?",
                    options = listOf(
                        "E_{pe} = \\frac{1}{2} k x^2.",
                        "Tiene signo negativo (W_{f_k} < 0), porque se opone al desplazamiento relativo (\\cos 180^\\circ = -1).",
                        "W_{\\text{cons}} = -\\Delta E_p = -(E_{pf} - E_{p0}).",
                        "Aproximadamente 746\\text{ Watts}."
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Tiene signo negativo (W_{f_k} < 0), porque se opone al desplazamiento relativo (\\cos 180^\\circ = -1)."
                ),
                Challenge(
                    id = "fis_t06_s02_c07",
                    question = "¿Cómo se calcula el rendimiento o eficiencia mecánica de un motor?",
                    options = listOf(
                        "E_{pe} = \\frac{1}{2} k x^2.",
                        "W_{\\text{cons}} = -\\Delta E_p = -(E_{pf} - E_{p0}).",
                        "\\eta = \\frac{P_{\\text{útil}}}{P_{\\text{entregada}}} \\times 100\\%.",
                        "Aproximadamente 746\\text{ Watts}."
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: \\eta = \\frac{P_{\\text{útil}}}{P_{\\text{entregada}}} \\times 100\\%."
                ),
                Challenge(
                    id = "fis_t06_s02_c08",
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
                    id = "fis_t06_s02_c09",
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
                    id = "fis_t06_s02_c10",
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
