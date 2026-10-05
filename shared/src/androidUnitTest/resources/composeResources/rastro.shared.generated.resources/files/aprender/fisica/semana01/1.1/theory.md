## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Física es la ciencia fundamental que estudia las propiedades de la materia, la energía, el espacio y el tiempo, así como las leyes que gobiernan sus interacciones mutuas:
1. **Magnitudes Físicas y Sistema Internacional (SI):** Clasificación según su origen (fundamentales y derivadas) y según su naturaleza (escalares y vectoriales). Las 7 magnitudes fundamentales del SI: longitud (\text{m}), masa (\text{kg}), tiempo (\text{s}), temperatura termodinámica (\text{K}), intensidad de corriente eléctrica (\text{A}), cantidad de sustancia (\text{mol}) e intensidad luminosa (\text{cd}); más dos suplementarias (ángulo plano en radianes y ángulo sólido en estereorradianes).
2. **Análisis Dimensional:** Ecuaciones dimensionales fundamentales [M], [L], [T], [\theta], [I], [J], [N]. Principio de Homogeneidad Dimensional (Principio de Fourier) y propiedades algebraicas de los operadores dimensionales. Determinación de fórmulas empíricas mediante el método de potencias de Rayleigh.
3. **Álgebra Vectorial:** El vector como ente matemático caracterizado por módulo, dirección y sentido. Métodos geométricos (polígono, paralelogramo, triángulo) y métodos analíticos: descomposición rectangular en \mathbb{R}^2 y \mathbb{R}^3, cosenos directores, vectores unitarios canónicos (\hat{i}, \hat{j}, \hat{k}), producto escalar (\vec{A} \cdot \vec{B} = AB \cos\theta) y producto vectorial (\vec{A} \times \vec{B} = AB \sin\theta\,\hat{u}_n).

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. MAGNITUDES FÍSICAS Y SISTEMA INTERNACIONAL (SI)

Una **magnitud física** es todo atributo o propiedad de un sistema material o fenómeno físico susceptible de ser medido cuantitativamente mediante un patrón de comparación estandarizado.

#### A. Clasificación por su Origen
1. **Magnitudes Fundamentales:** Aquellas elegidas por convención internacional como base independiente para definir todas las demás:
   - **Longitud:** metro (\text{m}), [L] (distancia recorrida por la luz en el vacío en 1/299\ 792\ 458\text{ s}).
   - **Masa:** kilogramo (\text{kg}), [M] (fijado mediante la constante de Planck h = 6.626\ 070\ 15 \times 10^{-34}\text{ kg}\cdot\text{m}^2\text{s}^{-1}).
   - **Tiempo:** segundo (\text{s}), [T] (9\ 192\ 631\ 770 periodos de radiación de la transición hiperfina del cesio-133).
   - **Temperatura Termodinámica:** kelvin (\text{K}), [\theta] (fijado mediante la constante de Boltzmann k).
   - **Intensidad de Corriente Eléctrica:** ampere (\text{A}), [I] (flujo de carga elemental e).
   - **Cantidad de Sustancia:** mol (\text{mol}), [N] (6.022\ 140\ 76 \times 10^{23} entidades elementales, constante de Avogadro N_A).
   - **Intensidad Luminosa:** candela (\text{cd}), [J].
2. **Magnitudes Derivadas:** Aquellas expresadas matemáticamente en función de las fundamentales. Ejemplos clásicos:
   - Velocidad: [v] = LT^{-1} (\text{m/s})
   - Aceleración: [a] = LT^{-2} (\text{m/s}^2)
   - Fuerza: [F] = MLT^{-2} (\text{N} = \text{kg}\cdot\text{m/s}^2)
   - Trabajo / Energía / Calor: [W] = [E] = ML^2T^{-2} (\text{J} = \text{N}\cdot\text{m})
   - Potencia: [P] = ML^2T^{-3} (\text{W} = \text{J/s})
   - Presión: [p] = ML^{-1}T^{-2} (\text{Pa} = \text{N/m}^2)
   - Densidad: [\rho] = ML^{-3} (\text{kg/m}^3)
   - Frecuencia: [f] = T^{-1} (\text{Hz} = \text{s}^{-1})
   - Carga Eléctrica: [q] = IT (\text{C} = \text{A}\cdot\text{s})
   - Potencial Eléctrico: [V] = ML^2T^{-3}I^{-1} (\text{V} = \text{J/C})
3. **Magnitudes Suplementarias o Adimensionales:**
   - Ángulo plano: radián (\text{rad}). Dimensión: [1].
   - Ángulo sólido: estereorradián (\text{sr}). Dimensión: [1].

#### B. Clasificación por su Naturaleza
1. **Magnitudes Escalares:** Quedan completamente determinadas por un valor numérico real y su unidad de medida correspondiente. No poseen orientación espacial. Ejemplos: masa (5\text{ kg}), tiempo (12\text{ s}), temperatura (300\text{ K}), energía (50\text{ J}), presión, volumen, densidad, trabajo, carga eléctrica.
2. **Magnitudes Vectoriales:** Requieren para su completa definición de un valor numérico (módulo), una **dirección** (línea de acción y ángulo) y un **sentido** (indicado por la saeta), obedeciendo el álgebra vectorial de adición geométrica. Ejemplos: desplazamiento (\Delta \vec{r}), velocidad (\vec{v}), aceleración (\vec{a}), fuerza (\vec{F}), cantidad de movimiento (\vec{p}), torque (\vec{\tau}), campo eléctrico (\vec{E}), campo magnético (\vec{B}).

---

### 2.2. ANÁLISIS DIMENSIONAL

Técnica físico-matemática que estudia las relaciones entre magnitudes fundamentales y derivadas para verificar la consistencia de ecuaciones físicas o deducir relaciones funcionales.

#### A. Reglas y Propiedades del Operador Dimensional [\ ]
1. **Dimensión de Magnitudes Adimensionales:** Números reales puros, ángulos, razones trigonométricas, funciones logarítmicas, funciones exponenciales y constantes adimensionales carecen de dimensión física:
   [n] = 1, \quad [\sin\theta] = 1, \quad [\ln x] = 1, \quad [e^x] = 1, \quad [\pi] = 1
   *Corolario vital:* El argumento de cualquier función trascendente (exponencial, trigonométrica, logarítmica) debe ser rigurosamente adimensional:
   y = A \sin(kx - \omega t) \implies [kx] = 1 \implies [k] = L^{-1}; \quad [\omega t] = 1 \implies [\omega] = T^{-1}
2. **Propiedades Algebraicas:**
   - Multiplicación: [A \cdot B] = [A] \cdot [B]
   - División: [A / B] = [A] / [B]
   - Potenciación: [A^n] = [A]^n
   - Radicación: [\sqrt[n]{A}] = [A]^{1/n}
   - Escalar multiplicativo: [c \cdot A] = [A] para toda constante numérica c \in \mathbb{R}.

#### B. Principio de Homogeneidad Dimensional (Principio de Fourier)
*"Toda ecuación física que exprese una ley natural válida debe ser dimensionalmente homogénea; es decir, todos los términos sumandos a ambos lados de la igualdad deben poseer exactamente las mismas dimensiones físicas."*
\text{Si } A + B = C - D \implies [A] = [B] = [C] = [D]
*Regla de la no suma dimensional:* Las dimensiones no se suman ni se restan algebraicamente:
[L] + [L] = [L], \quad [LT^{-1}] - [LT^{-1}] = [LT^{-1}]

---

### 2.3. ÁLGEBRA VECTORIAL


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS, ECUACIONES Y LEYES FUNDAMENTALES

1. **Ley de Cosenos para Vectores:**
   R = \sqrt{A^2 + B^2 + 2AB \cos\theta}
   D = \sqrt{A^2 + B^2 - 2AB \cos\theta}

2. **Condiciones de Máximos y Mínimos Vectoriales:**
   |A - B| \le |\vec{A} + \vec{B}| \le A + B

3. **Ángulo entre dos Vectores mediante Producto Escalar:**
   \cos\theta = \frac{\vec{A} \cdot \vec{B}}{|\vec{A}| |\vec{B}|} = \frac{A_x B_x + A_y B_y + A_z B_z}{\sqrt{A_x^2 + A_y^2 + A_z^2} \sqrt{B_x^2 + B_y^2 + B_z^2}}

4. **Proyección Ortogonal de \vec{A} sobre \vec{B}:**
   \text{Proy}_{\vec{B}} \vec{A} = \left( \frac{\vec{A} \cdot \vec{B}}{|\vec{B}|^2} \right) \vec{B}
