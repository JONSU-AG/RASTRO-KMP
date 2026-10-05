## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     t_{\text{subida}} = t_{\text{bajada}} = \frac{v_0}{g}
   - Tiempo de vuelo total:
     t_v = 2 t_s = \frac{2 v_0}{g}
   - Altura máxima (H_{\max}):
     H_{\max} = \frac{v_0^2}{2g}
2. **Formulación Vectorial Universal:**
   Eligiendo un eje Y con sentido positivo vertical hacia arriba (\vec{g} = -g\hat{j}):
   \vec{y}(t) = \left( y_0 + v_{0y} t - \frac{1}{2} g t^2 \right) \hat{j}
   \vec{v}(t) = (v_{0y} - g t) \hat{j}
   *¡Esta ecuación resuelve cualquier problema de caída libre con un solo planteamiento, independientemente de que el cuerpo suba, baje o pase por debajo del punto de lanzamiento (y < y_0 implicará un signo negativo automático).*

---

### 2.6. MOVIMIENTO PARABÓLICO DE CAÍDA LIBRE (MPCL)

Movimiento plano compuesto en el plano vertical XY bajo la aceleración de la gravedad constante \vec{g} = -g\hat{j}. Según el **Principio de Independencia de los Movimientos Simultáneos de Galileo Galilei**:
*"Un movimiento compuesto puede ser descompuesto en dos movimientos componentes independientes que se desarrollan simultáneamente en tiempos idénticos."*

#### A. Descomposición del Vector Velocidad Inicial (\vec{v}_0)
Con un ángulo de disparo \theta respecto a la horizontal:
v_{0x} = v_0 \cos\theta \quad (\text{constante durante todo el vuelo})
v_{0y} = v_0 \sin\theta \quad (\text{sometida a la aceleración } -g)

#### B. Dinámica en cada Eje
1. **Eje Horizontal X (MRU):**
   a_x = 0 \implies v_x(t) = v_{0x} = v_0 \cos\theta
   x(t) = v_{0x} \cdot t = (v_0 \cos\theta) t
2. **Eje Vertical Y (MVCL):**
   a_y = -g \implies v_y(t) = v_{0y} - gt = v_0 \sin\theta - gt
   y(t) = v_{0y} t - \frac{1}{2} gt^2 = (v_0 \sin\theta) t - \frac{1}{2} gt^2
3. **Velocidad y Rapidez en cualquier instante t:**
   \vec{v}(t) = v_x \hat{i} + v_y(t) \hat{j}
   v(t) = \sqrt{v_x^2 + v_y(t)^2}, \quad \tan\alpha = \frac{v_y(t)}{v_x}
   En el punto más alto de la trayectoria parabólica: v_y = 0 \implies \vec{v}_{\text{cima}} = v_{0x}\hat{i} (la rapidez es **mínima**, pero NO nula).

#### C. Ecuaciones Notables del MPCL (Lanzamiento sobre suelo horizontal)
1. **Tiempo de Subida y Tiempo de Vuelo:**
   t_s = \frac{v_0 \sin\theta}{g}, \quad t_v = \frac{2 v_0 \sin\theta}{g}
2. **Altura Máxima (H_{\max}):**
   H_{\max} = \frac{v_{0y}^2}{2g} = \frac{v_0^2 \sin^2\theta}{2g}
3. **Alcance Horizontal Máximo (R o D_{\max}):**
   R = v_{0x} \cdot t_v = (v_0 \cos\theta) \left( \frac{2 v_0 \sin\theta}{g} \right) = \frac{v_0^2 (2\sin\theta\cos\theta)}{g} = \frac{v_0^2 \sin(2\theta)}{g}
   - *Ángulo de Alcance Máximo:* Para una rapidez inicial fija v_0, el alcance horizontal es máximo cuando \sin(2\theta) = 1 \implies 2\theta = 90^\circ \implies \mathbf{\theta = 45^\circ}:
     R_{\max} = \frac{v_0^2}{g} = 4 H_{\max}
   - *Ángulos Complementarios:* Dos proyectiles disparados con la misma rapidez v_0 con ángulos de elevación complementarios (\theta_1 + \theta_2 = 90^\circ) alcanzan **exactamente el mismo alcance horizontal** (R_1 = R_2).
4. **Relación Geométrica Fundamental entre Altura Máxima y Alcance:**
   \tan\theta = \frac{4 H_{\max}}{R}
5. **Ecuación de la Trayectoria (Parábola en el plano):**
   Despejando t = \frac{x}{v_0 \cos\theta} y sustituyendo en y(t):
   y(x) = x \tan\theta - \frac{g x^2}{2 v_0^2 \cos^2\theta} = x \tan\theta \left( 1 - \frac{x}{R} \right)

---

### 2.7. CINEMÁTICA CIRCULAR: MCU Y MCUV

Describe el movimiento de una partícula a lo largo de una circunferencia de radio R:
1. **Magnitudes Angulares:**
   - Posición angular: \theta (\text{rad}).
   - Desplazamiento angular: \Delta \theta = \theta_f - \theta_0 (\text{rad}).
   - Longitud de arco: s = \theta \cdot R.
   - Velocidad angular media: \omega_m = \frac{\Delta \theta}{\Delta t} (\text{rad/s}).
   - Velocidad angular instantánea: \omega = \frac{d\theta}{dt} (\text{rad/s}).
   - Aceleración angular: \alpha = \frac{d\omega}{dt} (\text{rad/s}^2).
2. **Relaciones entre Magnitudes Lineales (Tangenciales) y Angulares:**
   s = \theta \cdot R
   v_t = \omega \cdot R
   a_t = \alpha \cdot R
   a_c = \frac{v_t^2}{R} = \omega^2 \cdot R
3. **Movimiento Circular Uniforme (MCU):**
   \omega = \text{cte} \implies \alpha = 0. La rapidez tangencial es constante, pero existe **aceleración centrípeta constante en módulo** (a_c \ne 0) debida al cambio de dirección del vector velocidad:
   \theta(t) = \theta_0 + \omega \cdot t
   - Periodo (T): Tiempo requerido para completar una revolución completa (2\pi\text{ rad}):
     T = \frac{2\pi}{\omega} \quad [\text{s}]
   - Frecuencia (f): Número de revoluciones por unidad de tiempo:
     f = \frac{1}{T} = \frac{\omega}{2\pi} \quad [\text{Hz} = \text{rev/s}]
     \omega = 2\pi f = \frac{2\pi}{T}
     - Conversión clásica: 1\text{ RPM} = \frac{2\pi\text{ rad}}{60\text{ s}} = \frac{\pi}{30}\text{ rad/s}.
4. **Movimiento Circular Uniformemente Variado (MCUV):**
   \alpha = \text{cte} \ne 0. La velocidad angular varía linealmente:
   \omega_f = \omega_0 \pm \alpha \cdot t
   \theta = \omega_0 \cdot t \pm \frac{1}{2} \alpha \cdot t^2
   \omega_f^2 = \omega_0^2 \pm 2 \alpha \cdot \theta
   \theta = \left( \frac{\omega_0 + \omega_f}{2} \right) t
5. **Transmisión de Movimiento Circular:**
   - **Discos o Engranajes Conectados Tangencialmente (por correa, cadena o contacto de dientes):**
     Comparten la misma velocidad tangencial:
     v_1 = v_2 \implies \omega_1 R_1 = \omega_2 R_2 \implies f_1 R_1 = f_2 R_2
   - **Discos Unidos por un Mismo Eje Concéntrico (Coaxiales):**
     Comparten la misma velocidad angular:
     \omega_1 = \omega_2 \implies \frac{v_1}{R_1} = \frac{v_2}{R_2}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   R = \frac{v_0^2 \sin(2\theta)}{g}
   \tan\theta = \frac{4 H_{\max}}{R}
   y = x \tan\theta \left( 1 - \frac{x}{R} \right)

3. **Cinemática Angular (MCU y MCUV):**
   v = \omega R, \quad a_t = \alpha R, \quad a_c = \frac{v^2}{R} = \omega^2 R
   a_{\text{total}} = \sqrt{a_t^2 + a_c^2}
   \omega = 2\pi f = \frac{2\pi}{T}
   \omega_f^2 = \omega_0^2 \pm 2\alpha\theta

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Rapidez en la Cúspide de la Parábola:** En el punto más alto del movimiento parabólico, **la velocidad NO es cero**. La componente vertical es nula (v_y = 0), pero la componente horizontal se conserva intacta: v_{\text{cima}} = v_{0x} = v_0 \cos\theta.
* **Velocidad Media vs. Rapidez Media:** Trampa clásica de admisión. Si una partícula va de A hacia B y regresa inmediatamente a A, su vector desplazamiento total es nulo (\Delta \vec{r} = \vec{0}), por lo que su **velocidad media es CERO (\vec{v}_m = \vec{0})**, mientras que su rapidez media es positiva (v_{\text{med}} = \frac{2d}{t} > 0).
* **Aceleración en el MCU:** El Movimiento Circular Uniforme **SÍ TIENE ACELERACIÓN**. Aunque la rapidez angular \omega y tangencial v sean constantes, el vector velocidad cambia continuamente de dirección, existiendo siempre la **aceleración centrípeta** dirigida hacia el centro (a_c = v^2/R \ne 0).
* **Fórmula de la Distancia en el n-ésimo Segundo:** No confundir la distancia recorrida en n segundos (d(n) = v_0 n + \frac{1}{2}an^2) con la distancia en el **segundo n particular** (d_n = v_0 + \frac{a}{2}(2n - 1)).
* **Alcance Máximo Horizontal en Proyectiles:** Ocurre a \theta = 45^\circ **únicamente cuando el punto de lanzamiento y de impacto están al mismo nivel horizontal**. Si se lanza desde un acantilado hacia el mar, el ángulo óptimo para máximo alcance es estrictamente menor a 45^\circ.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Relación Altura Máxima y Alcance en MPCL:**
   > **"TAN-TO = CUATRO H SOBRE R"**
   \tan\theta = \frac{4 H_{\max}}{R}
   *(Permite calcular el ángulo de disparo al instante sin despejar tiempos ni velocidades).*

2. **Números de Galileo en Caída Libre desde el Reposo (g = 10\text{ m/s}^2):**
   > **"5, 15, 25, 35, 45 metros"**
   - En el 1.er segundo cae: 5\text{ m} (impar 1 \times 5).
   - En el 2.º segundo cae: 15\text{ m} (impar 3 \times 5).
   - En el 3.er segundo cae: 25\text{ m} (impar 5 \times 5).
   - En el 4.º segundo cae: 35\text{ m} (impar 7 \times 5).

3. **Aceleraciones en Movimiento Curvilíneo:**
   > **"TANGEN CAMBIA RAPIDEZ, CENTRÍ CAMBIA DIRECCIÓN"**
   - Aceleración **Tangencial**: Modifica el valor numérico (rapidez).
   - Aceleración **Centrípeta**: Modifica hacia dónde apunta el móvil (curvatura).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Balística Forense e Investigación Policial:** La reconstrucción de tiroteos o trayectorias de esquirlas de proyectiles se basa en las ecuaciones de la trayectoria parabólica cuadrática de Galileo, incorporando correcciones aerodinámicas por el coeficiente de arrastre del aire y el efecto Magnus generado por el giro rotatorio del proyectil producido por el estriado helicoidal del ánima del cañón.
* **Astronomía y Mecánica Celeste:** Los satélites de órbita baja terrestre (LEO) se mantienen en órbita circular estable cuando la aceleración centrípeta requerida para la curvatura de la trayectoria (a_c = v^2/R) es proporcionada exactamente por la aceleración de la gravedad a esa altitud orbital (v = \sqrt{G M_{\text{Tierra}} / R}).

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Vial: Seguridad y Distancia de Frenado)
Un conductor que viaja por la carretera Panamericana Sur a la altura del valle de Vítor a una velocidad constante de 108\text{ km/h} (30\text{ m/s}) divisa repentinamente un deslizamiento de rocas que bloquea completamente la pista a 90\text{ metros} de distancia frontal. El tiempo de reacción del conductor (tiempo que transcurre desde que percibe el obstáculo hasta que pisa firmemente el pedal de freno) es de \Delta t_r = 0.8\text{ segundos}. Si el sistema antibloqueo de frenos (ABS) del vehículo genera una desaceleración constante de a = 6\text{ m/s}^2, determine si el automóvil logra detenerse antes de colisionar contra las rocas y a qué distancia del obstáculo lo hace.
A) Colisiona contra las rocas a una rapidez de 15\text{ m/s}.  
B) Se detiene milagrosamente justo a 1\text{ metro} antes del obstáculo.  
C) Se detiene a 9\text{ metros} antes de impactar con el obstáculo.  
D) Colisiona tras recorrer 99\text{ metros}.  
E) Se detiene a 15\text{ metros} antes del obstáculo.  

* **Resolución:**
1. *Fase 1: Reacción (MRU):* Durante el tiempo de reacción (0.8\text{ s}), el vehículo continúa desplazándose a la velocidad crucero de 30\text{ m/s}:
   d_{\text{reacción}} = v_0 \cdot \Delta t_r = (30\text{ m/s}) \times (0.8\text{ s}) = 24\text{ m}
2. *Fase 2: Frenado activo (MRUV desacelerado):*
   - Rapidez inicial de frenado: v_0 = 30\text{ m/s}
   - Rapidez final: v_f = 0
   - Desaceleración: a = 6\text{ m/s}^2
   - Aplicamos la fórmula:
     v_f^2 = v_0^2 - 2a \cdot d_{\text{frenado}} \implies 0 = 30^2 - 2(6) d_{\text{frenado}}
     12 d_{\text{frenado}} = 900 \implies d_{\text{frenado}} = \frac{900}{12} = 75\text{ m}
3. *Distancia Total de Detención:*
   d_{\text{total}} = d_{\text{reacción}} + d_{\text{frenado}} = 24\text{ m} + 75\text{ m} = 99\text{ m}
4. *Análisis del desenlace:*
   Dado que las rocas se encontraban a 90\text{ m} de distancia y el vehículo requiere 99\text{ m} para detenerse completamente, el auto no logra frenar a tiempo: **colisiona contra las rocas**.
   Calculamos la rapidez del impacto a los x = 90 - 24 = 66\text{ m} de frenado:
   v^2 = 30^2 - 2(6)(66) = 900 - 792 = 108 \implies v = \sqrt{108} \approx 10.4\text{ m/s}.
   La alternativa que describe el choque por superar los 90 m es la A.  
* **Respuesta:** A

---

### Pregunta 2 (Caso Deportivo: Fútbol y Tiro Parabólico)
En un partido en el estadio Monumental de la UNSA, un mediocampista cobra un tiro libre disparando el balón con una rapidez de 25\text{ m/s} formando un ángulo de 37^\circ con la horizontal (\sin 37^\circ = 0.6, \cos 37^\circ = 0.8, g = 10\text{ m/s}^2). La barrera defensiva se encuentra a una distancia reglamentaria de 9.15\text{ m} del punto de disparo y tiene una altura máxima con salto de 2.20\text{ m}. ¿Logrará el balón superar la barrera y cuál será su altura en ese punto?
A) No la supera; se estrella contra la barrera a 1.85\text{ m} de altura.  
B) Supera la barrera pasando a una altura de 5.82\text{ m} sobre el suelo.  
C) Supera la barrera pasando a una altura de 3.45\text{ m} sobre el suelo.  
D) Se estrella contra el suelo antes de llegar a la barrera.  
E) Supera la barrera rozando la cabeza a 2.25\text{ m}.  

* **Resolución:**
1. Descomposición de la velocidad inicial:
   v_{0x} = v_0 \cos 37^\circ = 25 \times 0.8 = 20\text{ m/s}
   v_{0y} = v_0 \sin 37^\circ = 25 \times 0.6 = 15\text{ m/s}
2. Calculamos el tiempo que tarda el balón en alcanzar la barrera (x = 9.15\text{ m}):
   t = \frac{x}{v_{0x}} = \frac{9.15\text{ m}}{20\text{ m/s}} = 0.4575\text{ s}
3. Calculamos la altura vertical y del balón en ese instante:
   y(t) = v_{0y} t - \frac{1}{2} g t^2 = (15)(0.4575) - 5(0.4575)^2
   y = 6.8625 - 5(0.2093) = 6.8625 - 1.0465 = 5.816\text{ m} \approx 5.82\text{ m}
4. Dado que la barrera mide 2.20\text{ m}, el balón **supera holgadamente la barrera pasando a una altura de 5.82\text{ m}** sobre el nivel del suelo.  
* **Respuesta:** B

---

## Posición, desplazamiento y gráficos de movimiento

La posición depende de un sistema de referencia. El desplazamiento es el cambio vectorial de posición; la distancia recorrida suma la longitud de la trayectoria. Al salir de un punto y volver, el desplazamiento es cero aunque la distancia sea positiva. Velocidad media es desplazamiento/tiempo; rapidez media usa distancia/tiempo.

En una gráfica posición-tiempo, la pendiente expresa velocidad; en velocidad-tiempo, la pendiente expresa aceleración y el área con signo expresa desplazamiento. El área bajo rapidez-tiempo corresponde a distancia. Una recta horizontal en posición-tiempo indica reposo, mientras una horizontal distinta de cero en velocidad-tiempo indica velocidad constante. Antes de operar, lee ejes, unidades y signos.
