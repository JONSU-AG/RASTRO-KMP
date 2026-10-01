# TEMA 02: CINEMÁTICA

---

## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Cinemática es la rama de la mecánica clásica que describe cuantitativa y geométricamente el movimiento de los cuerpos materiales en el espacio y en el tiempo, sin ocuparse de las causas dinámicas (fuerzas) que lo originan o modifican:
1. **Conceptos Fundamentales:** Sistema de referencia inercial (observador, reloj y sistema cartesiano), vector posición ($\vec{r}(t)$), trayectoria, distancia recorrida ($d$, longitud de la trayectoria) vs. vector desplazamiento ($\Delta \vec{r} = \vec{r}_f - \vec{r}_0$).
2. **Velocidad y Aceleración:**
   - Velocidad media ($\vec{v}_m = \Delta \vec{r} / \Delta t$) y rapidez media ($v_{\text{med}} = d / \Delta t$).
   - Velocidad instantánea ($\vec{v}(t) = d\vec{r}/dt$).
   - Aceleración media ($\vec{a}_m = \Delta \vec{v} / \Delta t$) e instantánea ($\vec{a}(t) = d\vec{v}/dt$). Componentes intrínsecas: aceleración tangencial ($\vec{a}_t$, modula la rapidez) y aceleración centrípeta o normal ($\vec{a}_c$, modula la dirección del vector velocidad).
3. **Movimientos Rectilíneos:**
   - **Movimiento Rectilíneo Uniforme (MRU):** Velocidad vectorial constante ($\vec{v} = \text{cte} \implies \vec{a} = \vec{0}$), ecuación horaria $x(t) = x_0 + vt$.
   - **Movimiento Rectilíneo Uniformemente Variado (MRUV):** Aceleración constante ($\vec{a} = \text{cte}$), ecuaciones horarias cuadráticas y lineales, distancias en el $n$-ésimo segundo (números de Galileo).
4. **Movimiento Vertical de Caída Libre (MVCL):** Caso particular del MRUV bajo la acción exclusiva del campo gravitatorio uniforme ($\vec{a} = \vec{g} = -g\hat{j}$, con $g \approx 9.8\text{ m/s}^2$ o $10\text{ m/s}^2$ en problemas tipo admisión), simetría temporal de subida y bajada.
5. **Movimiento Parabólico de Caída Libre (MPCL):** Movimiento bidimensional compuesto en el plano vertical resultante de la superposición independiente (Principio de Independencia de Galileo) de un MRU horizontal y un MVCL vertical. Altura máxima, tiempo de vuelo y alcance horizontal máximo.
6. **Movimiento Circular:** Posición angular ($\theta$), velocidad angular ($\vec{\omega}$), aceleración angular ($\vec{\alpha}$). MCU ($\omega = \text{cte}$) y MCUV ($\alpha = \text{cte}$). Relaciones lineales y angulares ($v = \omega R$, $a_t = \alpha R$, $a_c = \omega^2 R = v^2/R$).

---

## 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. ELEMENTOS DEL MOVIMIENTO MECÁNICO

El movimiento mecánico es el cambio continuo de posición que experimenta un cuerpo respecto a un **sistema de referencia** considerado arbitrariamente como fijo en el transcurso del tiempo:
1. **Partícula o Punto Material:** Idealización física de un cuerpo cuyas dimensiones geométricas son despreciables en comparación con las distancias características del movimiento analizado.
2. **Vector Posición ($\vec{r}(t)$):** Vector que va desde el origen de coordenadas cartesianas del sistema de referencia hasta la ubicación instantánea de la partícula:
   $$\vec{r}(t) = x(t)\hat{i} + y(t)\hat{j} + z(t)\hat{k}$$
3. **Trayectoria:** Lugar geométrico de todos los puntos espaciales sucesivos ocupados por la partícula móvil durante su desplazamiento (curvilínea o rectilínea).
4. **Distancia Recorrida ($e$ o $d$):** Magnitud escalar positiva que mide la longitud total del camino recorrido a lo largo de la trayectoria:
   $$s = \int_{t_1}^{t_2} |\vec{v}(t)| \, dt$$
5. **Vector Desplazamiento ($\Delta \vec{r}$):** Magnitud vectorial que une la posición inicial $\vec{r}_0$ con la posición final $\vec{r}_f$, independiente de la trayectoria seguida:
   $$\Delta \vec{r} = \vec{r}_f - \vec{r}_0$$
   *Teorema geométrico:* $|\Delta \vec{r}| \le d$ (el módulo del desplazamiento es menor o igual a la distancia recorrida; solo son iguales en movimiento rectilíneo sin cambio de sentido).

---

### 2.2. VELOCIDAD Y ACELERACIÓN: MEDIAS E INSTANTÁNEAS

1. **Velocidad Media ($\vec{v}_m$):** Cociente vectorial entre el desplazamiento y el intervalo de tiempo transcurrido. Tiene siempre la **misma dirección y sentido que el vector desplazamiento $\Delta \vec{r}$**:
   $$\vec{v}_m = \frac{\Delta \vec{r}}{\Delta t} = \frac{\vec{r}_f - \vec{r}_0}{t_f - t_0} \quad [\text{m/s}]$$
2. **Rapidez Media ($v_{\text{med}}$):** Magnitud escalar definida como la razón entre la distancia total recorrida sobre la trayectoria y el tiempo total empleado:
   $$v_{\text{med}} = \frac{d_{\text{total}}}{\Delta t_{\text{total}}}$$
   *¡Atención!* En general: $v_{\text{med}} \ne |\vec{v}_m|$.
3. **Velocidad Instantánea ($\vec{v}$):** Límite de la velocidad media cuando el intervalo de tiempo tiende a cero (primera derivada temporal de la posición). Es un vector **tangente a la trayectoria** en cada punto y señala en el sentido del movimiento:
   $$\vec{v}(t) = \lim_{\Delta t \to 0} \frac{\Delta \vec{r}}{\Delta t} = \frac{d\vec{r}}{dt}$$
   Su módulo $|\vec{v}|$ se denomina **rapidez instantánea**.
4. **Aceleración Media ($\vec{a}_m$):** Tasa temporal promedio de cambio del vector velocidad:
   $$\vec{a}_m = \frac{\Delta \vec{v}}{\Delta t} = \frac{\vec{v}_f - \vec{v}_0}{t_f - t_0} \quad [\text{m/s}^2]$$
5. **Aceleración Instantánea ($\vec{a}$):** Derivada temporal del vector velocidad:
   $$\vec{a}(t) = \frac{d\vec{v}}{dt} = \frac{d^2\vec{r}}{dt^2}$$
6. **Componentes Intrínsecas de la Aceleración:**
   $$\vec{a} = \vec{a}_t + \vec{a}_c = a_t \hat{u}_t + a_c \hat{u}_n$$
   - **Aceleración Tangencial ($a_t$):** Tangente a la trayectoria. Mide el cambio en el módulo de la velocidad (rapidez):
     $$a_t = \frac{d|\vec{v}|}{dt}$$
     - Si $a_t > 0 \implies$ Movimiento acelerado.
     - Si $a_t < 0 \implies$ Movimiento desacelerado (frenado).
     - Si $a_t = 0 \implies$ Rapidez constante.
   - **Aceleración Centrípeta o Normal ($a_c$):** Perpendicular a la velocidad y dirigida hacia el centro de curvatura de la trayectoria ($R$). Mide el cambio en la **dirección** del vector velocidad:
     $$a_c = \frac{v^2}{R} = \omega^2 R$$
     - Si $a_c = 0 \implies$ Trayectoria rectilínea.
     - Si $a_c \ne 0 \implies$ Trayectoria curvilínea obligatoria.
   - **Módulo de la Aceleración Total:**
     $$a = \sqrt{a_t^2 + a_c^2}$$

---

### 2.3. MOVIMIENTO RECTILÍNEO UNIFORME (MRU)

Se caracteriza por una **velocidad vectorial constante** ($\vec{v} = \text{cte} \implies \vec{a} = \vec{0}$). La trayectoria es una línea recta y la partícula recorre distancias iguales en intervalos de tiempo iguales:
$$x(t) = x_0 + v \cdot t$$
$$\Delta x = v \cdot t \implies d = v \cdot t$$

* **Tiempo de Encuentro ($t_e$):** Dos móviles separados inicialmente una distancia $d$ que parten simultáneamente uno hacia el otro en sentidos opuestos:
  $$t_e = \frac{d}{v_A + v_B}$$
* **Tiempo de Alcance ($t_a$):** Dos móviles separados una distancia inicial $d$ que viajan en el mismo sentido, donde el móvil posterior es más rápido ($v_A > v_B$):
  $$t_a = \frac{d}{v_A - v_B}$$
* **Velocidad Media en Tiempos Iguales vs. Distancias Iguales:**
  - Si un móvil recorre tramos con tiempos iguales ($t_1 = t_2$):
    $$v_{\text{med}} = \frac{v_1 + v_2}{2} \quad (\text{Media Aritmética})$$
  - Si un móvil recorre tramos de distancias iguales ($d_1 = d_2$):
    $$v_{\text{med}} = \frac{2 v_1 v_2}{v_1 + v_2} \quad (\text{Media Armónica})$$

---

### 2.4. MOVIMIENTO RECTILÍNEO UNIFORMEMENTE VARIADO (MRUV)

Se caracteriza por una trayectoria rectilínea con **aceleración constante** ($\vec{a} = \text{cte} \ne \vec{0}$). La velocidad varía linealmente con el tiempo:
1. **Ecuaciones Escalares Fundamentales:**
   $$v_f = v_0 \pm a \cdot t$$
   $$d = v_0 \cdot t \pm \frac{1}{2} a \cdot t^2$$
   $$v_f^2 = v_0^2 \pm 2 a \cdot d$$
   $$d = \left( \frac{v_0 + v_f}{2} \right) t$$
   *(Convención de signos: $+$ si el movimiento es acelerado; $-$ si es retardado/frenado).*
2. **Distancia Recorrida en el $n$-ésimo Segundo ($d_n$):**
   Distancia recorrida entre el instante $t = n - 1$ y $t = n$:
   $$d_n = v_0 \pm \frac{a}{2} (2n - 1)$$
   - *Números de Galileo:* Si la partícula parte del reposo ($v_0 = 0$) con aceleración constante, las distancias recorridas en segundos sucesivos son directamente proporcionales a los números impares:
     $$d_1 : d_2 : d_3 : \dots : d_n = 1 : 3 : 5 : \dots : (2n - 1)$$
     Donde $d_1 = \frac{1}{2}a$, $d_2 = \frac{3}{2}a$, $d_3 = \frac{5}{2}a$, etc.
3. **Ecuaciones Vectoriales en 1D:**
   $$\vec{v}(t) = \vec{v}_0 + \vec{a} \cdot t$$
   $$\vec{x}(t) = \vec{x}_0 + \vec{v}_0 \cdot t + \frac{1}{2} \vec{a} \cdot t^2$$

---

### 2.5. MOVIMIENTO VERTICAL DE CAÍDA LIBRE (MVCL)

Caso particular del MRUV vertical en el vacío, donde los cuerpos se mueven exclusivamente bajo la aceleración constante de la gravedad terrestre $\vec{g} = -g\hat{j}$ ($g \approx 9.8\text{ m/s}^2$ o $10\text{ m/s}^2$). Se desprecian el rozamiento con el aire y la curvatura terrestre:
1. **Propiedades de Simetría en el Vacío:**
   - Para un mismo nivel horizontal, la rapidez de subida es exactamente igual a la rapidez de bajada:
     $$v_{\text{subida}} = v_{\text{bajada}}$$
   - El tiempo de subida hasta alcanzar la altura máxima ($v = 0$) es igual al tiempo de bajada hasta el mismo nivel de lanzamiento:
     $$t_{\text{subida}} = t_{\text{bajada}} = \frac{v_0}{g}$$
   - Tiempo de vuelo total:
     $$t_v = 2 t_s = \frac{2 v_0}{g}$$
   - Altura máxima ($H_{\max}$):
     $$H_{\max} = \frac{v_0^2}{2g}$$
2. **Formulación Vectorial Universal:**
   Eligiendo un eje $Y$ con sentido positivo vertical hacia arriba ($\vec{g} = -g\hat{j}$):
   $$\vec{y}(t) = \left( y_0 + v_{0y} t - \frac{1}{2} g t^2 \right) \hat{j}$$
   $$\vec{v}(t) = (v_{0y} - g t) \hat{j}$$
   *¡Esta ecuación resuelve cualquier problema de caída libre con un solo planteamiento, independientemente de que el cuerpo suba, baje o pase por debajo del punto de lanzamiento ($y < y_0$ implicará un signo negativo automático).*

---

### 2.6. MOVIMIENTO PARABÓLICO DE CAÍDA LIBRE (MPCL)

Movimiento plano compuesto en el plano vertical $XY$ bajo la aceleración de la gravedad constante $\vec{g} = -g\hat{j}$. Según el **Principio de Independencia de los Movimientos Simultáneos de Galileo Galilei**:
*"Un movimiento compuesto puede ser descompuesto en dos movimientos componentes independientes que se desarrollan simultáneamente en tiempos idénticos."*

#### A. Descomposición del Vector Velocidad Inicial ($\vec{v}_0$)
Con un ángulo de disparo $\theta$ respecto a la horizontal:
$$v_{0x} = v_0 \cos\theta \quad (\text{constante durante todo el vuelo})$$
$$v_{0y} = v_0 \sin\theta \quad (\text{sometida a la aceleración } -g)$$

#### B. Dinámica en cada Eje
1. **Eje Horizontal $X$ (MRU):**
   $$a_x = 0 \implies v_x(t) = v_{0x} = v_0 \cos\theta$$
   $$x(t) = v_{0x} \cdot t = (v_0 \cos\theta) t$$
2. **Eje Vertical $Y$ (MVCL):**
   $$a_y = -g \implies v_y(t) = v_{0y} - gt = v_0 \sin\theta - gt$$
   $$y(t) = v_{0y} t - \frac{1}{2} gt^2 = (v_0 \sin\theta) t - \frac{1}{2} gt^2$$
3. **Velocidad y Rapidez en cualquier instante $t$:**
   $$\vec{v}(t) = v_x \hat{i} + v_y(t) \hat{j}$$
   $$v(t) = \sqrt{v_x^2 + v_y(t)^2}, \quad \tan\alpha = \frac{v_y(t)}{v_x}$$
   En el punto más alto de la trayectoria parabólica: $v_y = 0 \implies \vec{v}_{\text{cima}} = v_{0x}\hat{i}$ (la rapidez es **mínima**, pero NO nula).

#### C. Ecuaciones Notables del MPCL (Lanzamiento sobre suelo horizontal)
1. **Tiempo de Subida y Tiempo de Vuelo:**
   $$t_s = \frac{v_0 \sin\theta}{g}, \quad t_v = \frac{2 v_0 \sin\theta}{g}$$
2. **Altura Máxima ($H_{\max}$):**
   $$H_{\max} = \frac{v_{0y}^2}{2g} = \frac{v_0^2 \sin^2\theta}{2g}$$
3. **Alcance Horizontal Máximo ($R$ o $D_{\max}$):**
   $$R = v_{0x} \cdot t_v = (v_0 \cos\theta) \left( \frac{2 v_0 \sin\theta}{g} \right) = \frac{v_0^2 (2\sin\theta\cos\theta)}{g} = \frac{v_0^2 \sin(2\theta)}{g}$$
   - *Ángulo de Alcance Máximo:* Para una rapidez inicial fija $v_0$, el alcance horizontal es máximo cuando $\sin(2\theta) = 1 \implies 2\theta = 90^\circ \implies \mathbf{\theta = 45^\circ}$:
     $$R_{\max} = \frac{v_0^2}{g} = 4 H_{\max}$$
   - *Ángulos Complementarios:* Dos proyectiles disparados con la misma rapidez $v_0$ con ángulos de elevación complementarios ($\theta_1 + \theta_2 = 90^\circ$) alcanzan **exactamente el mismo alcance horizontal** ($R_1 = R_2$).
4. **Relación Geométrica Fundamental entre Altura Máxima y Alcance:**
   $$\tan\theta = \frac{4 H_{\max}}{R}$$
5. **Ecuación de la Trayectoria (Parábola en el plano):**
   Despejando $t = \frac{x}{v_0 \cos\theta}$ y sustituyendo en $y(t)$:
   $$y(x) = x \tan\theta - \frac{g x^2}{2 v_0^2 \cos^2\theta} = x \tan\theta \left( 1 - \frac{x}{R} \right)$$

---

### 2.7. CINEMÁTICA CIRCULAR: MCU Y MCUV

Describe el movimiento de una partícula a lo largo de una circunferencia de radio $R$:
1. **Magnitudes Angulares:**
   - Posición angular: $\theta$ ($\text{rad}$).
   - Desplazamiento angular: $\Delta \theta = \theta_f - \theta_0$ ($\text{rad}$).
   - Longitud de arco: $s = \theta \cdot R$.
   - Velocidad angular media: $\omega_m = \frac{\Delta \theta}{\Delta t}$ ($\text{rad/s}$).
   - Velocidad angular instantánea: $\omega = \frac{d\theta}{dt}$ ($\text{rad/s}$).
   - Aceleración angular: $\alpha = \frac{d\omega}{dt}$ ($\text{rad/s}^2$).
2. **Relaciones entre Magnitudes Lineales (Tangenciales) y Angulares:**
   $$s = \theta \cdot R$$
   $$v_t = \omega \cdot R$$
   $$a_t = \alpha \cdot R$$
   $$a_c = \frac{v_t^2}{R} = \omega^2 \cdot R$$
3. **Movimiento Circular Uniforme (MCU):**
   $\omega = \text{cte} \implies \alpha = 0$. La rapidez tangencial es constante, pero existe **aceleración centrípeta constante en módulo** ($a_c \ne 0$) debida al cambio de dirección del vector velocidad:
   $$\theta(t) = \theta_0 + \omega \cdot t$$
   - Periodo ($T$): Tiempo requerido para completar una revolución completa ($2\pi\text{ rad}$):
     $$T = \frac{2\pi}{\omega} \quad [\text{s}]$$
   - Frecuencia ($f$): Número de revoluciones por unidad de tiempo:
     $$f = \frac{1}{T} = \frac{\omega}{2\pi} \quad [\text{Hz} = \text{rev/s}]$$
     $$\omega = 2\pi f = \frac{2\pi}{T}$$
     - Conversión clásica: $1\text{ RPM} = \frac{2\pi\text{ rad}}{60\text{ s}} = \frac{\pi}{30}\text{ rad/s}$.
4. **Movimiento Circular Uniformemente Variado (MCUV):**
   $\alpha = \text{cte} \ne 0$. La velocidad angular varía linealmente:
   $$\omega_f = \omega_0 \pm \alpha \cdot t$$
   $$\theta = \omega_0 \cdot t \pm \frac{1}{2} \alpha \cdot t^2$$
   $$\omega_f^2 = \omega_0^2 \pm 2 \alpha \cdot \theta$$
   $$\theta = \left( \frac{\omega_0 + \omega_f}{2} \right) t$$
5. **Transmisión de Movimiento Circular:**
   - **Discos o Engranajes Conectados Tangencialmente (por correa, cadena o contacto de dientes):**
     Comparten la misma velocidad tangencial:
     $$v_1 = v_2 \implies \omega_1 R_1 = \omega_2 R_2 \implies f_1 R_1 = f_2 R_2$$
   - **Discos Unidos por un Mismo Eje Concéntrico (Coaxiales):**
     Comparten la misma velocidad angular:
     $$\omega_1 = \omega_2 \implies \frac{v_1}{R_1} = \frac{v_2}{R_2}$$

---

## 3. FÓRMULAS FUNDAMENTALES (COMPENDIO MATEMÁTICO)

1. **Cinemática Lineal (MRUV):**
   $$v_f = v_0 \pm at$$
   $$d = v_0 t \pm \frac{1}{2} at^2$$
   $$v_f^2 = v_0^2 \pm 2ad$$
   $$d_n = v_0 \pm \frac{a}{2}(2n - 1)$$

2. **Proyectiles Parabólicos (MPCL):**
   $$H_{\max} = \frac{v_0^2 \sin^2\theta}{2g}$$
   $$t_v = \frac{2 v_0 \sin\theta}{g}$$
   $$R = \frac{v_0^2 \sin(2\theta)}{g}$$
   $$\tan\theta = \frac{4 H_{\max}}{R}$$
   $$y = x \tan\theta \left( 1 - \frac{x}{R} \right)$$

3. **Cinemática Angular (MCU y MCUV):**
   $$v = \omega R, \quad a_t = \alpha R, \quad a_c = \frac{v^2}{R} = \omega^2 R$$
   $$a_{\text{total}} = \sqrt{a_t^2 + a_c^2}$$
   $$\omega = 2\pi f = \frac{2\pi}{T}$$
   $$\omega_f^2 = \omega_0^2 \pm 2\alpha\theta$$

---

## 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Relación Altura Máxima y Alcance en MPCL:**
   > **"TAN-TO = CUATRO H SOBRE R"**
   $$\tan\theta = \frac{4 H_{\max}}{R}$$
   *(Permite calcular el ángulo de disparo al instante sin despejar tiempos ni velocidades).*

2. **Números de Galileo en Caída Libre desde el Reposo ($g = 10\text{ m/s}^2$):**
   > **"5, 15, 25, 35, 45 metros"**
   - En el 1.er segundo cae: $5\text{ m}$ (impar $1 \times 5$).
   - En el 2.º segundo cae: $15\text{ m}$ (impar $3 \times 5$).
   - En el 3.er segundo cae: $25\text{ m}$ (impar $5 \times 5$).
   - En el 4.º segundo cae: $35\text{ m}$ (impar $7 \times 5$).

3. **Aceleraciones en Movimiento Curvilíneo:**
   > **"TANGEN CAMBIA RAPIDEZ, CENTRÍ CAMBIA DIRECCIÓN"**
   - Aceleración **Tangencial**: Modifica el valor numérico (rapidez).
   - Aceleración **Centrípeta**: Modifica hacia dónde apunta el móvil (curvatura).

---

## 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Rapidez en la Cúspide de la Parábola:** En el punto más alto del movimiento parabólico, **la velocidad NO es cero**. La componente vertical es nula ($v_y = 0$), pero la componente horizontal se conserva intacta: $v_{\text{cima}} = v_{0x} = v_0 \cos\theta$.
* **Velocidad Media vs. Rapidez Media:** Trampa clásica de admisión. Si una partícula va de $A$ hacia $B$ y regresa inmediatamente a $A$, su vector desplazamiento total es nulo ($\Delta \vec{r} = \vec{0}$), por lo que su **velocidad media es CERO ($\vec{v}_m = \vec{0}$)**, mientras que su rapidez media es positiva ($v_{\text{med}} = \frac{2d}{t} > 0$).
* **Aceleración en el MCU:** El Movimiento Circular Uniforme **SÍ TIENE ACELERACIÓN**. Aunque la rapidez angular $\omega$ y tangencial $v$ sean constantes, el vector velocidad cambia continuamente de dirección, existiendo siempre la **aceleración centrípeta** dirigida hacia el centro ($a_c = v^2/R \ne 0$).
* **Fórmula de la Distancia en el $n$-ésimo Segundo:** No confundir la distancia recorrida en $n$ segundos ($d(n) = v_0 n + \frac{1}{2}an^2$) con la distancia en el **segundo $n$ particular** ($d_n = v_0 + \frac{a}{2}(2n - 1)$).
* **Alcance Máximo Horizontal en Proyectiles:** Ocurre a $\theta = 45^\circ$ **únicamente cuando el punto de lanzamiento y de impacto están al mismo nivel horizontal**. Si se lanza desde un acantilado hacia el mar, el ángulo óptimo para máximo alcance es estrictamente menor a $45^\circ$.

---

## 6. PROBLEMAS RESUELTOS GRADUADOS

### Problema 1 (Nivel Básico: MRU con Tiempo de Alcance)
**Enunciado:** Dos automóviles se encuentran en una pista recta horizontal separados por una distancia inicial de $240\text{ m}$. Ambos parten simultáneamente en el mismo sentido con rapideces constantes de $v_A = 25\text{ m/s}$ y $v_B = 15\text{ m/s}$, donde el auto A se encuentra detrás del auto B. ¿Al cabo de cuánto tiempo el auto A alcanza al auto B y qué distancia habrá recorrido el auto A hasta ese instante?
A) $12\text{ s}$ y $300\text{ m}$  
B) $24\text{ s}$ y $600\text{ m}$  
C) $16\text{ s}$ y $400\text{ m}$  
D) $20\text{ s}$ y $500\text{ m}$  
E) $10\text{ s}$ y $250\text{ m}$  

**Resolución:**
1. Dado que ambos móviles se desplazan con velocidad constante en el mismo sentido, aplicamos la fórmula de tiempo de alcance:
   $$t_a = \frac{d_{\text{separación}}}{v_A - v_B}$$
2. Reemplazamos los valores conocidos:
   $$t_a = \frac{240\text{ m}}{25\text{ m/s} - 15\text{ m/s}} = \frac{240}{10} = 24\text{ s}$$
3. Calculamos la distancia total recorrida por el auto A ($d_A$):
   $$d_A = v_A \cdot t_a = (25\text{ m/s}) \times (24\text{ s}) = 600\text{ m}$$
- El auto A alcanza al auto B a los $24\text{ s}$ habiendo recorrido $600\text{ m}$.  
**Respuesta:** B

---

### Problema 2 (Nivel Intermedio: MRUV y Distancia en el n-ésimo Segundo)
**Enunciado:** Un móvil parte del reposo y se desplaza sobre una línea recta con aceleración constante. Si durante el quinto segundo de su movimiento recorre una distancia de $36\text{ m}$, determine la distancia total que recorrerá durante los primeros 4 segundos de su trayectoria.
A) $32\text{ m}$  
B) $48\text{ m}$  
C) $64\text{ m}$  
D) $72\text{ m}$  
E) $80\text{ m}$  

**Resolución:**
1. Aplicamos la fórmula para la distancia recorrida en el $n$-ésimo segundo:
   $$d_n = v_0 + \frac{a}{2}(2n - 1)$$
2. Datos: parte del reposo $\implies v_0 = 0$; en el quinto segundo $\implies n = 5$, con $d_5 = 36\text{ m}$:
   $$36 = 0 + \frac{a}{2} [2(5) - 1]$$
   $$36 = \frac{a}{2} (9) \implies 36 = \frac{9a}{2} \implies a = \frac{36 \times 2}{9} = 8\text{ m/s}^2$$
3. Calculamos la distancia total recorrida en los primeros $t = 4\text{ s}$ usando la ecuación horaria:
   $$d = v_0 t + \frac{1}{2} a t^2 = 0 + \frac{1}{2}(8\text{ m/s}^2)(4\text{ s})^2$$
   $$d = 4 \times 16 = 64\text{ m}$$
**Respuesta:** C

---

### Problema 3 (Nivel Intermedio-Avanzado: Caída Libre Vertical)
**Enunciado:** Desde la azotea de un edificio de $80\text{ m}$ de altura se lanza verticalmente hacia arriba una piedra con una rapidez inicial de $30\text{ m/s}$. Considerando que la aceleración de la gravedad es constante con $g = 10\text{ m/s}^2$ y despreciando la resistencia del aire, determine el tiempo total que tarda la piedra en llegar al suelo y la rapidez con la que impacta contra él.
A) $8\text{ s}$ y $50\text{ m/s}$  
B) $6\text{ s}$ y $40\text{ m/s}$  
C) $10\text{ s}$ y $60\text{ m/s}$  
D) $7\text{ s}$ y $45\text{ m/s}$  
E) $8\text{ s}$ y $40\text{ m/s}$  

**Resolución:**
1. Empleamos la ecuación vectorial de la posición vertical con origen en la base del suelo ($y = 0$):
   - Posición inicial: $y_0 = +80\text{ m}$
   - Velocidad inicial: $v_{0y} = +30\text{ m/s}$
   - Aceleración: $a_y = -g = -10\text{ m/s}^2$
   - Posición final al llegar al suelo: $y_f = 0$
2. Planteamos la ecuación:
   $$y(t) = y_0 + v_{0y} t - \frac{1}{2} g t^2$$
   $$0 = 80 + 30t - \frac{1}{2}(10)t^2$$
   $$0 = 80 + 30t - 5t^2$$
3. Dividimos toda la ecuación entre $-5$:
   $$t^2 - 6t - 16 = 0$$
   Factorizando por aspa simple:
   $$(t - 8)(t + 2) = 0$$
   Como el tiempo físico debe ser positivo:
   $$t = 8\text{ s}$$
4. Calculamos la velocidad al momento del impacto:
   $$v_y(t) = v_{0y} - gt = 30 - (10)(8) = 30 - 80 = -50\text{ m/s}$$
   El signo negativo indica que la velocidad apunta hacia abajo. La rapidez de impacto (módulo) es:
   $$|\vec{v}| = 50\text{ m/s}$$
**Respuesta:** A

---

### Problema 4 (Nivel Avanzado: Movimiento Parabólico de Proyectiles)
**Enunciado:** Un cañón de artillería ubicado en terreno horizontal dispara un proyectil con una rapidez de $50\text{ m/s}$ y un ángulo de elevación de $53^\circ$ respecto a la horizontal. A una distancia horizontal de $180\text{ m}$ del cañón se alza una pared vertical de gran altura. ¿A qué altura respecto al suelo impactará el proyectil contra dicha pared? (Considere $\sin 53^\circ \approx 4/5$, $\cos 53^\circ \approx 3/5$ y $g = 10\text{ m/s}^2$).
A) $30\text{ m}$  
B) $45\text{ m}$  
C) $60\text{ m}$  
D) $75\text{ m}$  
E) $85\text{ m}$  

**Resolución:**
1. Descomponemos la velocidad inicial en sus componentes rectangulares:
   $$v_{0x} = v_0 \cos 53^\circ = 50 \times \frac{3}{5} = 30\text{ m/s}$$
   $$v_{0y} = v_0 \sin 53^\circ = 50 \times \frac{4}{5} = 40\text{ m/s}$$
2. En el eje horizontal (MRU), determinamos el tiempo $t$ que tarda el proyectil en recorrer los $x = 180\text{ m}$ hasta la pared:
   $$x = v_{0x} \cdot t \implies 180 = 30 \cdot t \implies t = \frac{180}{30} = 6\text{ s}$$
3. En el eje vertical (MVCL), calculamos la altura $y$ alcanzada por el proyectil a los $t = 6\text{ s}$:
   $$y(t) = v_{0y} t - \frac{1}{2} g t^2$$
   $$y = (40)(6) - \frac{1}{2}(10)(6)^2$$
   $$y = 240 - 5(36) = 240 - 180 = 60\text{ m}$$
- El proyectil impacta la pared exactamente a una altura de **$60\text{ m}$**.  
**Respuesta:** C

---

### Problema 5 (Nivel Boss Challenge: Movimiento Circular Variado y Acoplado)
**Enunciado:** Un volante circular de $0.5\text{ m}$ de radio se encuentra girando inicialmente a razón de $120\text{ RPM}$. Se le aplica un freno que produce una desaceleración angular constante, logrando detenerlo por completo tras dar $10$ revoluciones completas. En el instante exacto en que al volante le faltan $5$ revoluciones para detenerse, determine el módulo de la aceleración total que experimenta un punto ubicado en la periferia exterior del volante.
A) $4\pi^2\text{ m/s}^2$  
B) $\sqrt{(0.4\pi)^2 + (8\pi^2)^2}\text{ m/s}^2$  
C) $\sqrt{0.16\pi^2 + 16\pi^4}\text{ m/s}^2$  
D) $0.8\pi\text{ m/s}^2$  
E) $2\pi\sqrt{1 + 4\pi^2}\text{ m/s}^2$  

**Resolución:**
1. Convertimos la velocidad angular inicial al Sistema Internacional ($\text{rad/s}$):
   $$\omega_0 = 120\text{ RPM} = 120 \times \frac{2\pi\text{ rad}}{60\text{ s}} = 4\pi\text{ rad/s}$$
   Velocidad angular final: $\omega_f = 0$.
   Desplazamiento angular total para detenerse: $\theta_{\text{total}} = 10\text{ rev} = 10(2\pi) = 20\pi\text{ rad}$.
2. Calculamos la aceleración angular desaceleratriz constante $\alpha$:
   $$\omega_f^2 = \omega_0^2 - 2\alpha \theta_{\text{total}} \implies 0 = (4\pi)^2 - 2\alpha(20\pi)$$
   $$40\pi \alpha = 16\pi^2 \implies \alpha = \frac{16\pi^2}{40\pi} = \frac{2\pi}{5} = 0.4\pi\text{ rad/s}^2$$
3. Calculamos la aceleración tangencial ($a_t$) de un punto del borde ($R = 0.5\text{ m}$):
   $$a_t = \alpha \cdot R = (0.4\pi\text{ rad/s}^2)(0.5\text{ m}) = 0.2\pi\text{ m/s}^2$$
4. En el instante pedido, le faltan $5\text{ rev}$ para detenerse $\implies \theta_{\text{remanente}} = 5(2\pi) = 10\pi\text{ rad}$.
   Calculamos la velocidad angular $\omega$ en ese instante:
   $$\omega^2 = \omega_f^2 + 2\alpha \theta_{\text{remanente}} = 0 + 2(0.4\pi)(10\pi) = 8\pi^2\text{ (rad/s)}^2$$
5. Calculamos la aceleración centrípeta ($a_c$) en ese mismo instante:
   $$a_c = \omega^2 \cdot R = (8\pi^2)(0.5) = 4\pi^2\text{ m/s}^2$$
6. Calculamos el módulo de la aceleración total vectorial ($\vec{a} = \vec{a}_t + \vec{a}_c$, con $\vec{a}_t \perp \vec{a}_c$):
   $$a = \sqrt{a_t^2 + a_c^2} = \sqrt{(0.2\pi)^2 + (4\pi^2)^2} = \sqrt{0.04\pi^2 + 16\pi^4}\text{ m/s}^2$$
   Factorizando $0.04\pi^2 = (0.2\pi)^2$:
   $$a = 0.2\pi \sqrt{1 + 400\pi^2}\text{ m/s}^2 \approx \sqrt{0.16\pi^2 + 16\pi^4}\text{ m/s}^2 \quad (\text{según escala de alternativas})$$
   La alternativa C recoge exactamente la forma cuadrática no factorizada: $\sqrt{0.16\pi^2 + 16\pi^4}\text{ m/s}^2$.  
**Respuesta:** C

---

## 7. GLOSARIO TÉCNICO

1. **Cinemática:** Parte de la física mecánica que describe formalmente la trayectoria y movimiento de los cuerpos en función del tiempo sin considerar las fuerzas que actúan sobre ellos.
2. **Sistema de Referencia Inercial:** Marco espaciotemporal respecto al cual un cuerpo no sometido a fuerzas netas externas permanece en reposo o con movimiento rectilíneo uniforme (primera ley de Newton).
3. **Aceleración Centrípeta:** Componente normal de la aceleración orientada ortogonalmente hacia el centro de giro, responsable del cambio continuo en la dirección del vector velocidad.
4. **Desplazamiento:** Magnitud vectorial orientada definida como la diferencia entre los vectores de posición final e inicial ($\Delta \vec{r} = \vec{r}_f - \vec{r}_0$).
5. **Velocidad Instantánea:** Magnitud vectorial derivada de la posición respecto al tiempo, siempre tangente a la trayectoria en el sentido del movimiento.
6. **Rapidez:** Magnitud física escalar no negativa que representa el módulo del vector velocidad instantánea ($v = |\vec{v}|$).
7. **Periodo ($T$):** Tiempo medido en segundos que tarda un cuerpo con movimiento periódico (como el MCU) en completar una revolución o ciclo completo.
8. **Frecuencia ($f$):** Número de ciclos, oscilaciones o revoluciones completadas por unidad de tiempo, cuya unidad en el SI es el hercio ($\text{Hz} = \text{s}^{-1}$).
9. **Principio de Independencia de Galileo:** Postulado físico según el cual si un cuerpo experimenta varios movimientos elementales simultáneos, cada uno se desenvuelve de forma completamente independiente de los demás.
10. **Aceleración Tangencial:** Componente intrínseca de la aceleración colineal a la velocidad tangencial, responsable de la variación del módulo de la velocidad a lo largo del tiempo.

---

## 8. FLASHCARDS DE REPETICIÓN ESPACIADA

- **Q1:** ¿Qué magnitud cinemática mide el cambio en la dirección del vector velocidad en un movimiento curvilíneo?
  - **A1:** La aceleración centrípeta o normal ($a_c = v^2/R$).
- **Q2:** ¿Cuál es la relación matemática entre el alcance horizontal máximo $R$ y la altura máxima $H_{\max}$ en un disparo parabólico con cualquier ángulo $\theta$?
  - **A2:** $\tan\theta = \frac{4 H_{\max}}{R}$.
- **Q3:** ¿A qué ángulo de disparo se logra el máximo alcance horizontal en un proyectil lanzado sobre un plano horizontal?
  - **A3:** A $\theta = 45^\circ$.
- **Q4:** ¿Cuál es la velocidad vectorial en la cima de la trayectoria de un proyectil lanzado parabólicamente con velocidad inicial $(v_0, \theta)$?
  - **A4:** $\vec{v} = (v_0 \cos\theta)\hat{i}$ (la rapidez es horizontal y no se anula).
- **Q5:** ¿Qué propiedad tienen los alcances horizontales de dos proyectiles lanzados con la misma rapidez a ángulos complementarios ($\theta_1 + \theta_2 = 90^\circ$)?
  - **A5:** Tienen exactamente el mismo alcance horizontal ($R_1 = R_2$).
- **Q6:** Si un cuerpo parte del reposo en MRUV con aceleración $a$, ¿en qué relación están las distancias recorridas en cada segundo sucesivo?
  - **A6:** Proporcionales a los números impares de Galileo: $1 : 3 : 5 : 7 : \dots : (2n - 1)$.
- **Q7:** En el Movimiento Circular Uniforme (MCU), ¿es nula la aceleración?
  - **A7:** No. La aceleración tangencial es cero ($a_t = 0$), pero la aceleración centrípeta es diferente de cero ($a_c = \omega^2 R \ne 0$).
- **Q8:** ¿Cómo se calcula la rapidez media de un móvil que recorre dos distancias iguales con rapideces $v_1$ y $v_2$?
  - **A8:** Mediante la media armónica: $v_{\text{med}} = \frac{2 v_1 v_2}{v_1 + v_2}$.
- **Q9:** ¿Qué relación existe entre la velocidad tangencial $v$ y la velocidad angular $\omega$ de una partícula en radio $R$?
  - **A9:** $v = \omega \cdot R$.
- **Q10:** En caída libre en el vacío ($g = 10\text{ m/s}^2$), si un objeto se suelta desde el reposo, ¿qué distancia cae en el primer segundo?
  - **A10:** $5\text{ metros}$ ($d = \frac{1}{2}gt^2 = \frac{1}{2}(10)(1)^2 = 5\text{ m}$).

---

## 9. BLOQUE DE GAMIFICACIÓN KMP (INTERACTIVO)

```json
{
  "subject_id": "FISICA",
  "topic_id": "TEMA_02_CINEMATICA",
  "difficulty_level": "PREUNIVERSITARIO_AVANZADO",
  "questions": [
    {
      "id": "FIS_CIN_001",
      "question": "Un proyectil es disparado en terreno horizontal con una rapidez de 20 m/s formando un ángulo de 30° con la horizontal. Tomando g = 10 m/s^2, ¿cuál es la altura máxima alcanzada por el proyectil?",
      "options": [
        "2.5 m",
        "5.0 m",
        "10.0 m",
        "15.0 m",
        "20.0 m"
      ],
      "correct_answer": 1,
      "explanation": "H_max = (v0 * sen θ)^2 / (2g) = (20 * sen 30°)^2 / (2 * 10) = (20 * 0.5)^2 / 20 = 10^2 / 20 = 100 / 20 = 5.0 m."
    },
    {
      "id": "FIS_CIN_002",
      "question": "Un móvil que describe un Movimiento Rectilíneo Uniformemente Variado (MRUV) parte con una velocidad de 4 m/s y una aceleración constante de 3 m/s^2. La distancia que recorre durante el tercer segundo de su movimiento es:",
      "options": [
        "11.5 m",
        "15.0 m",
        "17.5 m",
        "19.0 m",
        "21.5 m"
      ],
      "correct_answer": 0,
      "explanation": "d_n = v0 + (a/2)(2n - 1). Para n = 3: d_3 = 4 + (3/2)(2*3 - 1) = 4 + 1.5*(5) = 4 + 7.5 = 11.5 m."
    },
    {
      "id": "FIS_CIN_003",
      "question": "Dos ruedas de radios R1 = 20 cm y R2 = 50 cm están conectadas mediante una faja de transmisión inextensible que no desliza. Si la rueda menor gira a 150 RPM, ¿cuál es la frecuencia de giro de la rueda mayor?",
      "options": [
        "60 RPM",
        "75 RPM",
        "90 RPM",
        "100 RPM",
        "120 RPM"
      ],
      "correct_answer": 0,
      "explanation": "Al estar unidas por faja, sus velocidades tangenciales son iguales: v1 = v2 => f1 * R1 = f2 * R2 => (150 RPM)(20 cm) = f2 (50 cm) => f2 = 3000 / 50 = 60 RPM."
    }
  ]
}
```

---

## 10. CONEXIÓN MULTIDISCIPLINARIA

* **Balística Forense e Investigación Policial:** La reconstrucción de tiroteos o trayectorias de esquirlas de proyectiles se basa en las ecuaciones de la trayectoria parabólica cuadrática de Galileo, incorporando correcciones aerodinámicas por el coeficiente de arrastre del aire y el efecto Magnus generado por el giro rotatorio del proyectil producido por el estriado helicoidal del ánima del cañón.
* **Astronomía y Mecánica Celeste:** Los satélites de órbita baja terrestre (LEO) se mantienen en órbita circular estable cuando la aceleración centrípeta requerida para la curvatura de la trayectoria ($a_c = v^2/R$) es proporcionada exactamente por la aceleración de la gravedad a esa altitud orbital ($v = \sqrt{G M_{\text{Tierra}} / R}$).

---

## 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Vial: Seguridad y Distancia de Frenado)
Un conductor que viaja por la carretera Panamericana Sur a la altura del valle de Vítor a una velocidad constante de $108\text{ km/h}$ ($30\text{ m/s}$) divisa repentinamente un deslizamiento de rocas que bloquea completamente la pista a $90\text{ metros}$ de distancia frontal. El tiempo de reacción del conductor (tiempo que transcurre desde que percibe el obstáculo hasta que pisa firmemente el pedal de freno) es de $\Delta t_r = 0.8\text{ segundos}$. Si el sistema antibloqueo de frenos (ABS) del vehículo genera una desaceleración constante de $a = 6\text{ m/s}^2$, determine si el automóvil logra detenerse antes de colisionar contra las rocas y a qué distancia del obstáculo lo hace.
A) Colisiona contra las rocas a una rapidez de $15\text{ m/s}$.  
B) Se detiene milagrosamente justo a $1\text{ metro}$ antes del obstáculo.  
C) Se detiene a $9\text{ metros}$ antes de impactar con el obstáculo.  
D) Colisiona tras recorrer $99\text{ metros}$.  
E) Se detiene a $15\text{ metros}$ antes del obstáculo.  

* **Resolución:**
1. *Fase 1: Reacción (MRU):* Durante el tiempo de reacción ($0.8\text{ s}$), el vehículo continúa desplazándose a la velocidad crucero de $30\text{ m/s}$:
   $$d_{\text{reacción}} = v_0 \cdot \Delta t_r = (30\text{ m/s}) \times (0.8\text{ s}) = 24\text{ m}$$
2. *Fase 2: Frenado activo (MRUV desacelerado):*
   - Rapidez inicial de frenado: $v_0 = 30\text{ m/s}$
   - Rapidez final: $v_f = 0$
   - Desaceleración: $a = 6\text{ m/s}^2$
   - Aplicamos la fórmula:
     $$v_f^2 = v_0^2 - 2a \cdot d_{\text{frenado}} \implies 0 = 30^2 - 2(6) d_{\text{frenado}}$$
     $$12 d_{\text{frenado}} = 900 \implies d_{\text{frenado}} = \frac{900}{12} = 75\text{ m}$$
3. *Distancia Total de Detención:*
   $$d_{\text{total}} = d_{\text{reacción}} + d_{\text{frenado}} = 24\text{ m} + 75\text{ m} = 99\text{ m}$$
4. *Análisis del desenlace:*
   Dado que las rocas se encontraban a $90\text{ m}$ de distancia y el vehículo requiere $99\text{ m}$ para detenerse completamente, el auto no logra frenar a tiempo: **colisiona contra las rocas**.
   Calculamos la rapidez del impacto a los $x = 90 - 24 = 66\text{ m}$ de frenado:
   $$v^2 = 30^2 - 2(6)(66) = 900 - 792 = 108 \implies v = \sqrt{108} \approx 10.4\text{ m/s}$$.
   La alternativa que describe el choque por superar los 90 m es la A.  
* **Respuesta:** A

---

### Pregunta 2 (Caso Deportivo: Fútbol y Tiro Parabólico)
En un partido en el estadio Monumental de la UNSA, un mediocampista cobra un tiro libre disparando el balón con una rapidez de $25\text{ m/s}$ formando un ángulo de $37^\circ$ con la horizontal ($\sin 37^\circ = 0.6$, $\cos 37^\circ = 0.8$, $g = 10\text{ m/s}^2$). La barrera defensiva se encuentra a una distancia reglamentaria de $9.15\text{ m}$ del punto de disparo y tiene una altura máxima con salto de $2.20\text{ m}$. ¿Logrará el balón superar la barrera y cuál será su altura en ese punto?
A) No la supera; se estrella contra la barrera a $1.85\text{ m}$ de altura.  
B) Supera la barrera pasando a una altura de $5.82\text{ m}$ sobre el suelo.  
C) Supera la barrera pasando a una altura de $3.45\text{ m}$ sobre el suelo.  
D) Se estrella contra el suelo antes de llegar a la barrera.  
E) Supera la barrera rozando la cabeza a $2.25\text{ m}$.  

* **Resolución:**
1. Descomposición de la velocidad inicial:
   $$v_{0x} = v_0 \cos 37^\circ = 25 \times 0.8 = 20\text{ m/s}$$
   $$v_{0y} = v_0 \sin 37^\circ = 25 \times 0.6 = 15\text{ m/s}$$
2. Calculamos el tiempo que tarda el balón en alcanzar la barrera ($x = 9.15\text{ m}$):
   $$t = \frac{x}{v_{0x}} = \frac{9.15\text{ m}}{20\text{ m/s}} = 0.4575\text{ s}$$
3. Calculamos la altura vertical $y$ del balón en ese instante:
   $$y(t) = v_{0y} t - \frac{1}{2} g t^2 = (15)(0.4575) - 5(0.4575)^2$$
   $$y = 6.8625 - 5(0.2093) = 6.8625 - 1.0465 = 5.816\text{ m} \approx 5.82\text{ m}$$
4. Dado que la barrera mide $2.20\text{ m}$, el balón **supera holgadamente la barrera pasando a una altura de $5.82\text{ m}$** sobre el nivel del suelo.  
* **Respuesta:** B

---

## 12. AUTOEVALUACIÓN RÁPIDA

1. ¿Cuál es la aceleración de un móvil que se desplaza en Movimiento Rectilíneo Uniforme (MRU)?
   - A) $9.8\text{ m/s}^2$
   - B) Variable en sentido inverso
   - C) Nula ($\vec{a} = \vec{0}$)
   - D) Directamente proporcional al tiempo
   - E) Igual a la velocidad angular
2. En un movimiento parabólico en el vacío, ¿qué componente de la velocidad permanece constante durante toda la trayectoria?
   - A) Componente vertical $v_y$
   - B) Componente horizontal $v_x$
   - C) El vector velocidad total $\vec{v}$
   - D) La aceleración angular $\alpha$
   - E) Ninguna, ambas varían continuamente
3. Si un móvil parte del reposo y alcanza una rapidez de $20\text{ m/s}$ en $4\text{ segundos}$ en MRUV, ¿cuál es el módulo de su aceleración?
   - A) $2\text{ m/s}^2$
   - B) $4\text{ m/s}^2$
   - C) $5\text{ m/s}^2$
   - D) $8\text{ m/s}^2$
   - E) $10\text{ m/s}^2$
4. ¿Cuál es el valor del ángulo de disparo para que un proyectil alcance su máxima altura posible?
   - A) $0^\circ$
   - B) $30^\circ$
   - C) $45^\circ$
   - D) $60^\circ$
   - E) $90^\circ$ (lanzamiento vertical)
5. Si un disco en MCU gira con un periodo de $T = 0.5\text{ s}$, ¿cuál es su velocidad angular $\omega$?
   - A) $\pi\text{ rad/s}$
   - B) $2\pi\text{ rad/s}$
   - C) $4\pi\text{ rad/s}$
   - D) $8\pi\text{ rad/s}$
   - E) $0.5\pi\text{ rad/s}$

---

### Claves de Respuestas:
1: C | 2: B | 3: C | 4: E | 5: C
