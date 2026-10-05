## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
