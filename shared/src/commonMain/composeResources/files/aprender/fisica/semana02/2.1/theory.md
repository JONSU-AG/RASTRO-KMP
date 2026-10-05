## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Cinemática es la rama de la mecánica clásica que describe cuantitativa y geométricamente el movimiento de los cuerpos materiales en el espacio y en el tiempo, sin ocuparse de las causas dinámicas (fuerzas) que lo originan o modifican:
1. **Conceptos Fundamentales:** Sistema de referencia inercial (observador, reloj y sistema cartesiano), vector posición (\vec{r}(t)), trayectoria, distancia recorrida (d, longitud de la trayectoria) vs. vector desplazamiento (\Delta \vec{r} = \vec{r}_f - \vec{r}_0).
2. **Velocidad y Aceleración:**
   - Velocidad media (\vec{v}_m = \Delta \vec{r} / \Delta t) y rapidez media (v_{\text{med}} = d / \Delta t).
   - Velocidad instantánea (\vec{v}(t) = d\vec{r}/dt).
   - Aceleración media (\vec{a}_m = \Delta \vec{v} / \Delta t) e instantánea (\vec{a}(t) = d\vec{v}/dt). Componentes intrínsecas: aceleración tangencial (\vec{a}_t, modula la rapidez) y aceleración centrípeta o normal (\vec{a}_c, modula la dirección del vector velocidad).
3. **Movimientos Rectilíneos:**
   - **Movimiento Rectilíneo Uniforme (MRU):** Velocidad vectorial constante (\vec{v} = \text{cte} \implies \vec{a} = \vec{0}), ecuación horaria x(t) = x_0 + vt.
   - **Movimiento Rectilíneo Uniformemente Variado (MRUV):** Aceleración constante (\vec{a} = \text{cte}), ecuaciones horarias cuadráticas y lineales, distancias en el n-ésimo segundo (números de Galileo).
4. **Movimiento Vertical de Caída Libre (MVCL):** Caso particular del MRUV bajo la acción exclusiva del campo gravitatorio uniforme (\vec{a} = \vec{g} = -g\hat{j}, con g \approx 9.8\text{ m/s}^2 o 10\text{ m/s}^2 en problemas tipo admisión), simetría temporal de subida y bajada.
5. **Movimiento Parabólico de Caída Libre (MPCL):** Movimiento bidimensional compuesto en el plano vertical resultante de la superposición independiente (Principio de Independencia de Galileo) de un MRU horizontal y un MVCL vertical. Altura máxima, tiempo de vuelo y alcance horizontal máximo.
6. **Movimiento Circular:** Posición angular (\theta), velocidad angular (\vec{\omega}), aceleración angular (\vec{\alpha}). MCU (\omega = \text{cte}) y MCUV (\alpha = \text{cte}). Relaciones lineales y angulares (v = \omega R, a_t = \alpha R, a_c = \omega^2 R = v^2/R).

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. ELEMENTOS DEL MOVIMIENTO MECÁNICO

El movimiento mecánico es el cambio continuo de posición que experimenta un cuerpo respecto a un **sistema de referencia** considerado arbitrariamente como fijo en el transcurso del tiempo:
1. **Partícula o Punto Material:** Idealización física de un cuerpo cuyas dimensiones geométricas son despreciables en comparación con las distancias características del movimiento analizado.
2. **Vector Posición (\vec{r}(t)):** Vector que va desde el origen de coordenadas cartesianas del sistema de referencia hasta la ubicación instantánea de la partícula:
   \vec{r}(t) = x(t)\hat{i} + y(t)\hat{j} + z(t)\hat{k}
3. **Trayectoria:** Lugar geométrico de todos los puntos espaciales sucesivos ocupados por la partícula móvil durante su desplazamiento (curvilínea o rectilínea).
4. **Distancia Recorrida (e o d):** Magnitud escalar positiva que mide la longitud total del camino recorrido a lo largo de la trayectoria:
   s = \int_{t_1}^{t_2} |\vec{v}(t)| \, dt
5. **Vector Desplazamiento (\Delta \vec{r}):** Magnitud vectorial que une la posición inicial \vec{r}_0 con la posición final \vec{r}_f, independiente de la trayectoria seguida:
   \Delta \vec{r} = \vec{r}_f - \vec{r}_0
   *Teorema geométrico:* |\Delta \vec{r}| \le d (el módulo del desplazamiento es menor o igual a la distancia recorrida; solo son iguales en movimiento rectilíneo sin cambio de sentido).

---

### 2.2. VELOCIDAD Y ACELERACIÓN: MEDIAS E INSTANTÁNEAS

1. **Velocidad Media (\vec{v}_m):** Cociente vectorial entre el desplazamiento y el intervalo de tiempo transcurrido. Tiene siempre la **misma dirección y sentido que el vector desplazamiento \Delta \vec{r}**:
   \vec{v}_m = \frac{\Delta \vec{r}}{\Delta t} = \frac{\vec{r}_f - \vec{r}_0}{t_f - t_0} \quad [\text{m/s}]
2. **Rapidez Media (v_{\text{med}}):** Magnitud escalar definida como la razón entre la distancia total recorrida sobre la trayectoria y el tiempo total empleado:
   v_{\text{med}} = \frac{d_{\text{total}}}{\Delta t_{\text{total}}}
   *¡Atención!* En general: v_{\text{med}} \ne |\vec{v}_m|.
3. **Velocidad Instantánea (\vec{v}):** Límite de la velocidad media cuando el intervalo de tiempo tiende a cero (primera derivada temporal de la posición). Es un vector **tangente a la trayectoria** en cada punto y señala en el sentido del movimiento:
   \vec{v}(t) = \lim_{\Delta t \to 0} \frac{\Delta \vec{r}}{\Delta t} = \frac{d\vec{r}}{dt}
   Su módulo |\vec{v}| se denomina **rapidez instantánea**.
4. **Aceleración Media (\vec{a}_m):** Tasa temporal promedio de cambio del vector velocidad:
   \vec{a}_m = \frac{\Delta \vec{v}}{\Delta t} = \frac{\vec{v}_f - \vec{v}_0}{t_f - t_0} \quad [\text{m/s}^2]
5. **Aceleración Instantánea (\vec{a}):** Derivada temporal del vector velocidad:
   \vec{a}(t) = \frac{d\vec{v}}{dt} = \frac{d^2\vec{r}}{dt^2}
6. **Componentes Intrínsecas de la Aceleración:**
   \vec{a} = \vec{a}_t + \vec{a}_c = a_t \hat{u}_t + a_c \hat{u}_n
   - **Aceleración Tangencial (a_t):** Tangente a la trayectoria. Mide el cambio en el módulo de la velocidad (rapidez):
     a_t = \frac{d|\vec{v}|}{dt}
     - Si a_t > 0 \implies Movimiento acelerado.
     - Si a_t < 0 \implies Movimiento desacelerado (frenado).
     - Si a_t = 0 \implies Rapidez constante.
   - **Aceleración Centrípeta o Normal (a_c):** Perpendicular a la velocidad y dirigida hacia el centro de curvatura de la trayectoria (R). Mide el cambio en la **dirección** del vector velocidad:
     a_c = \frac{v^2}{R} = \omega^2 R
     - Si a_c = 0 \implies Trayectoria rectilínea.
     - Si a_c \ne 0 \implies Trayectoria curvilínea obligatoria.
   - **Módulo de la Aceleración Total:**
     a = \sqrt{a_t^2 + a_c^2}

---

### 2.3. MOVIMIENTO RECTILÍNEO UNIFORME (MRU)

Se caracteriza por una **velocidad vectorial constante** (\vec{v} = \text{cte} \implies \vec{a} = \vec{0}). La trayectoria es una línea recta y la partícula recorre distancias iguales en intervalos de tiempo iguales:
x(t) = x_0 + v \cdot t
\Delta x = v \cdot t \implies d = v \cdot t

* **Tiempo de Encuentro (t_e):** Dos móviles separados inicialmente una distancia d que parten simultáneamente uno hacia el otro en sentidos opuestos:
  t_e = \frac{d}{v_A + v_B}
* **Tiempo de Alcance (t_a):** Dos móviles separados una distancia inicial d que viajan en el mismo sentido, donde el móvil posterior es más rápido (v_A > v_B):
  t_a = \frac{d}{v_A - v_B}
* **Velocidad Media en Tiempos Iguales vs. Distancias Iguales:**
  - Si un móvil recorre tramos con tiempos iguales (t_1 = t_2):
    v_{\text{med}} = \frac{v_1 + v_2}{2} \quad (\text{Media Aritmética})
  - Si un móvil recorre tramos de distancias iguales (d_1 = d_2):
    v_{\text{med}} = \frac{2 v_1 v_2}{v_1 + v_2} \quad (\text{Media Armónica})

---

### 2.4. MOVIMIENTO RECTILÍNEO UNIFORMEMENTE VARIADO (MRUV)

Se caracteriza por una trayectoria rectilínea con **aceleración constante** (\vec{a} = \text{cte} \ne \vec{0}). La velocidad varía linealmente con el tiempo:
1. **Ecuaciones Escalares Fundamentales:**
   v_f = v_0 \pm a \cdot t
   d = v_0 \cdot t \pm \frac{1}{2} a \cdot t^2
   v_f^2 = v_0^2 \pm 2 a \cdot d
   d = \left( \frac{v_0 + v_f}{2} \right) t
   *(Convención de signos: + si el movimiento es acelerado; - si es retardado/frenado).*
2. **Distancia Recorrida en el n-ésimo Segundo (d_n):**
   Distancia recorrida entre el instante t = n - 1 y t = n:
   d_n = v_0 \pm \frac{a}{2} (2n - 1)
   - *Números de Galileo:* Si la partícula parte del reposo (v_0 = 0) con aceleración constante, las distancias recorridas en segundos sucesivos son directamente proporcionales a los números impares:
     d_1 : d_2 : d_3 : \dots : d_n = 1 : 3 : 5 : \dots : (2n - 1)
     Donde d_1 = \frac{1}{2}a, d_2 = \frac{3}{2}a, d_3 = \frac{5}{2}a, etc.
3. **Ecuaciones Vectoriales en 1D:**
   \vec{v}(t) = \vec{v}_0 + \vec{a} \cdot t
   \vec{x}(t) = \vec{x}_0 + \vec{v}_0 \cdot t + \frac{1}{2} \vec{a} \cdot t^2

---

### 2.5. MOVIMIENTO VERTICAL DE CAÍDA LIBRE (MVCL)

Caso particular del MRUV vertical en el vacío, donde los cuerpos se mueven exclusivamente bajo la aceleración constante de la gravedad terrestre \vec{g} = -g\hat{j} (g \approx 9.8\text{ m/s}^2 o 10\text{ m/s}^2). Se desprecian el rozamiento con el aire y la curvatura terrestre:
1. **Propiedades de Simetría en el Vacío:**
   - Para un mismo nivel horizontal, la rapidez de subida es exactamente igual a la rapidez de bajada:
     v_{\text{subida}} = v_{\text{bajada}}
   - El tiempo de subida hasta alcanzar la altura máxima (v = 0) es igual al tiempo de bajada hasta el mismo nivel de lanzamiento:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS FUNDAMENTALES (COMPENDIO MATEMÁTICO)

1. **Cinemática Lineal (MRUV):**
   v_f = v_0 \pm at
   d = v_0 t \pm \frac{1}{2} at^2
   v_f^2 = v_0^2 \pm 2ad
   d_n = v_0 \pm \frac{a}{2}(2n - 1)

2. **Proyectiles Parabólicos (MPCL):**
   H_{\max} = \frac{v_0^2 \sin^2\theta}{2g}
   t_v = \frac{2 v_0 \sin\theta}{g}
