## 1. Magnitudes, dimensiones y vectores

La Física es la ciencia fundamental que estudia las propiedades de la materia, la energía, el espacio y el tiempo, así como las leyes que gobiernan sus interacciones mutuas:
1. **Magnitudes Físicas y Sistema Internacional (SI):** Clasificación según su origen (fundamentales y derivadas) y según su naturaleza (escalares y vectoriales). Las 7 magnitudes fundamentales del SI: longitud (\text{m}), masa (\text{kg}), tiempo (\text{s}), temperatura termodinámica (\text{K}), intensidad de corriente eléctrica (\text{A}), cantidad de sustancia (\text{mol}) e intensidad luminosa (\text{cd}); el radián y el estereorradián son unidades derivadas de dimensión uno, no magnitudes fundamentales adicionales.
2. **Análisis Dimensional:** Ecuaciones dimensionales fundamentales [M], [L], [T], [\theta], [I], [J], [N]. Principio de Homogeneidad Dimensional (Principio de Fourier) y propiedades algebraicas de los operadores dimensionales. Determinación de fórmulas empíricas mediante el método de potencias de Rayleigh.
3. **Álgebra Vectorial:** El vector como ente matemático caracterizado por módulo, dirección y sentido. Métodos geométricos (polígono, paralelogramo, triángulo) y métodos analíticos: descomposición rectangular en \mathbb{R}^2 y \mathbb{R}^3, cosenos directores, vectores unitarios canónicos (\hat{i}, \hat{j}, \hat{k}), producto escalar (\vec{A} \cdot \vec{B} = AB \cos\theta) y producto vectorial (\vec{A} \times \vec{B} = AB \sin\theta\,\hat{u}_n).

---


## 2. Desarrollo de los conceptos

### 2.1. MAGNITUDES FÍSICAS Y SISTEMA INTERNACIONAL (SI)

Una **magnitud física** es todo atributo o propiedad de un sistema material o fenómeno físico susceptible de ser medido cuantitativamente mediante un patrón de comparación estandarizado.

#### A. Clasificación por su Origen
1. **Magnitudes Fundamentales:** Aquellas elegidas por convención internacional como base independiente para definir todas las demás:

| Magnitud fundamental | Dimensión | Unidad del SI | Referencia |
|---|---|---|---|
| Longitud | [L] | metro (\text{m}) | (distancia recorrida por la luz en el vacío en 1/299\ 792\ 458\text{ s}). |
| Masa | [M] | kilogramo (\text{kg}) | (fijado mediante la constante de Planck h = 6.626\ 070\ 15 \times 10^{-34}\text{ kg}\cdot\text{m}^2\text{s}^{-1}). |
| Tiempo | [T] | segundo (\text{s}) | (9\ 192\ 631\ 770 periodos de radiación de la transición hiperfina del cesio-133). |
| Temperatura Termodinámica | [\theta] | kelvin (\text{K}) | (fijado mediante la constante de Boltzmann k). |
| Intensidad de Corriente Eléctrica | [I] | ampere (\text{A}) | (flujo de carga elemental e). |
| Cantidad de Sustancia | [N] | mol (\text{mol}) | (6.022\ 140\ 76 \times 10^{23} entidades elementales, constante de Avogadro N_A). |
| Intensidad Luminosa | [J] | candela (\text{cd}) | — |

2. **Magnitudes Derivadas:** Aquellas expresadas matemáticamente en función de las fundamentales. Ejemplos clásicos:

| Magnitud derivada | Ecuación dimensional | Unidad del SI |
|---|---|---|
| Velocidad | [v] = LT^{-1} | \text{m/s} |
| Aceleración | [a] = LT^{-2} | \text{m/s}^2 |
| Fuerza | [F] = MLT^{-2} | \text{N} = \text{kg}\cdot\text{m/s}^2 |
| Trabajo / Energía / Calor | [W] = [E] = ML^2T^{-2} | \text{J} = \text{N}\cdot\text{m} |
| Potencia | [P] = ML^2T^{-3} | \text{W} = \text{J/s} |
| Presión | [p] = ML^{-1}T^{-2} | \text{Pa} = \text{N/m}^2 |
| Densidad | [\rho] = ML^{-3} | \text{kg/m}^3 |
| Frecuencia | [f] = T^{-1} | \text{Hz} = \text{s}^{-1} |
| Carga Eléctrica | [q] = IT | \text{C} = \text{A}\cdot\text{s} |
| Potencial Eléctrico | [V] = ML^2T^{-3}I^{-1} | \text{V} = \text{J/C} |

3. **Ángulos y unidades derivadas de dimensión uno:**
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

Una magnitud vectorial necesita módulo, dirección y sentido. Antes de usar una fórmula, fija los ejes y expresa las componentes respecto de ellos.

En el plano, el eje x es horizontal y el eje y es vertical. Por ejemplo, (3, 2) m indica 3 m en +x y 2 m en +y. Los símbolos $\hat i$ y $\hat j$ son flechas de una unidad que sirven de referencia para esos ejes; por eso se llaman vectores unitarios canónicos. El símbolo $\mathbb{R}^2$ solo indica que trabajamos con dos componentes reales.

Para sumar vectores por componentes se suman por separado sus componentes horizontales y verticales:

$$\vec R=\vec A+\vec B=(A_x+B_x)\hat i+(A_y+B_y)\hat j.$$

Por ejemplo, si un vector es (8, 6) N y otro es (-12, 0) N, su suma es (-4, 6) N. El vector que los equilibra debe ser el opuesto, (4, -6) N. El módulo se calcula con Pitágoras; el cuadrante se determina por los signos de las componentes, no solo por el valor de una tangente.

Para dos vectores no nulos, el producto escalar cumple:

$$\vec A\cdot\vec B=|\vec A||\vec B|\cos\theta.$$

Si el producto escalar es cero, el ángulo entre ellos es de 90°. Un vector nulo también da producto cero, pero no tiene una dirección definida; por eso la condición exige vectores no nulos.



## 3. Fórmulas de consulta

1. **Ley de Cosenos para Vectores:**
   R = \sqrt{A^2 + B^2 + 2AB \cos\theta}
   D = \sqrt{A^2 + B^2 - 2AB \cos\theta}

2. **Condiciones de Máximos y Mínimos Vectoriales:**
   |A - B| \le |\vec{A} + \vec{B}| \le A + B

3. **Ángulo entre dos Vectores mediante Producto Escalar:**
   \cos\theta = \frac{\vec{A} \cdot \vec{B}}{|\vec{A}| |\vec{B}|} = \frac{A_x B_x + A_y B_y + A_z B_z}{\sqrt{A_x^2 + A_y^2 + A_z^2} \sqrt{B_x^2 + B_y^2 + B_z^2}}

4. **Proyección Ortogonal de \vec{A} sobre \vec{B}:**
   \text{Proy}_{\vec{B}} \vec{A} = \left( \frac{\vec{A} \cdot \vec{B}}{|\vec{B}|^2} \right) \vec{B}

## Fuentes de contraste
NIST, SI, sección 2: https://www.nist.gov/pml/special-publication-330/sp-330-section-2
BIPM, Resolución 8 de 1995: https://www.bipm.org/en/committees/cg/cgpm/20-1995/resolution-8
OpenStax, productos de vectores: https://openstax.org/books/university-physics-volume-1/pages/2-4-products-of-vectors
