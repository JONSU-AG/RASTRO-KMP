# TEMA 11: OSCILACIONES Y ONDAS

---

## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 11 - OSCILACIONES, ONDAS MECÁNICAS, ACÚSTICA Y ÓPTICA GEOMÉTRICA
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), ÓPTICA DE RAYOS Y DINÁMICA ONDULATORIA
========================================================================================
```

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[OSCILACIONES Y ONDAS] --> B[Movimiento Armónico Simple - MAS]
    A --> C[Ondas Mecánicas y Acústica]
    A --> D[Óptica Geométrica]

    B --> B1[Cinemática: x, v, a con funciones sinusoidales]
    B --> B2[Dinámica: Masa-Resorte T = 2π√(m/k)]
    B --> B3[Péndulo Simple: T = 2π√(L/g)]
    B --> B4[Conservación de Energía: E = 1/2 k A²]

    C --> C1[Onda Armónica: y = A sen(kx ± ωt)]
    C --> C2[Velocidad de Propagación: v = λ f]
    C --> C3[Sonido y Nivel de Intensidad: β = 10 log(I / I₀)]
    C --> C4[Efecto Doppler: f_obs = f_fte (v ± v_o)/(v ∓ v_f)]

    D --> D1[Reflexión y Refracción: Ley de Snell n1 sen θ1 = n2 sen θ2]
    D --> D2[Reflexión Total Interna y Ángulo Crítico]
    D --> D3[Espejos Esféricos y Lentes: 1/f = 1/s + 1/s']
    D --> D4[Aumento Lateral y Potencia en Dioptrías P = 1/f]
```

---

## 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Movimiento Armónico Simple (MAS)
- **Definición Dinámica:** Movimiento oscilatorio periódico rectilíneo en torno a una posición de equilibrio ($x = 0$), originado por una fuerza recuperadora elástica lineal (Ley de Hooke):
  $$\vec{F} = -k x \implies m \frac{d^2 x}{dt^2} + k x = 0 \iff \frac{d^2 x}{dt^2} + \omega^2 x = 0$$
  donde $\omega = \sqrt{\frac{k}{m}}$ es la frecuencia angular natural $[\text{rad/s}]$.
- **Ecuaciones Cinemáticas del MAS:**
  1. **Posición:**
     $$x(t) = A \sin(\omega t + \phi)$$
     - $A$: Amplitud máxima de oscilación $[\text{m}]$.
     - $\phi$: Fase inicial en $t = 0$ $[\text{rad}]$.
  2. **Velocidad:**
     $$v(t) = \frac{dx}{dt} = \omega A \cos(\omega t + \phi) = \pm \omega \sqrt{A^2 - x^2}$$
     - $v_{\max} = \omega A$ (en la posición de equilibrio $x = 0$).
     - $v = 0$ en los extremos ($x = \pm A$).
  3. **Aceleración:**
     $$a(t) = \frac{dv}{dt} = -\omega^2 A \sin(\omega t + \phi) = -\omega^2 x$$
     - $a_{\max} = \omega^2 A$ (en los extremos $x = \pm A$, dirigida siempre hacia el centro).
     - $a = 0$ en el centro ($x = 0$).
- **Sistemas Oscilatorios Clásicos:**
  - **Sistema Masa-Resorte:**
    $$T = 2\pi \sqrt{\frac{m}{k}}, \quad f = \frac{1}{2\pi} \sqrt{\frac{k}{m}}$$
  - **Péndulo Simple (para pequeñas oscilaciones $\theta \le 10^\circ \approx 0.17\text{ rad}$):**
    $$T = 2\pi \sqrt{\frac{L}{g}}, \quad \omega = \sqrt{\frac{g}{L}}$$
- **Conservación de la Energía Mecánica en el MAS:**
  $$E = E_k + E_p = \frac{1}{2} m v^2 + \frac{1}{2} k x^2 = \frac{1}{2} k A^2 = \frac{1}{2} m (\omega A)^2 = \text{cte}$$

### 3.2. Ondas Mecánicas y Acústica
1. **Onda:** Propagación de una perturbación que transporta energía y cantidad de movimiento a través del espacio **sin transporte neto de materia**.
   - **Transversales:** Las partículas del medio oscilan perpendicularmente a la dirección de propagación (ej. cuerda tensa, ondas electromagnéticas).
   - **Longitudinales:** Las partículas oscilan paralelamente a la dirección de propagación (ej. sonido en fluidos, ondas de compresión en resortes).
2. **Ecuación de Onda Unidimensional Armónica:**
   $$y(x, t) = A \sin(k x \mp \omega t + \phi)$$
   - Signo $(-)$: se propaga hacia la derecha ($+x$).
   - Signo $(+)$: se propaga hacia la izquierda ($-x$).
   - Número de onda: $k = \frac{2\pi}{\lambda}$ $[\text{rad/m}]$.
   - Rapidez de onda:
     $$v = \frac{\lambda}{T} = \lambda f = \frac{\omega}{k}$$
   - En una cuerda tensa (Fórmula de Taylor): $v = \sqrt{\frac{T_{\text{tensión}}}{\mu}}$, donde $\mu = m/L$ es la densidad lineal de masa.
3. **Ondas Sonoras y Nivel Sonoro ($\beta$):**
   - Rapidez del sonido en el aire seco a $20^\circ\text{C}$: $v_s \approx 343\text{ m/s}$ ($v \approx 331 + 0.6 T_C\text{ m/s}$).
   - **Intensidad Sonora ($I$):** Potencia por unidad de área normal:
     $$I = \frac{P}{A} = \frac{P}{4\pi r^2} \quad \left[\frac{\text{W}}{\text{m}^2}\right]$$
   - **Nivel de Intensidad Sonora ($\beta$ en Decibelios, $\text{dB}$):**
     $$\beta = 10 \log_{10}\left(\frac{I}{I_0}\right)$$
     donde $I_0 = 10^{-12}\ \text{W/m}^2$ es el umbral de audición humana a $1000\text{ Hz}$.
4. **Efecto Doppler:**
   Cambio aparente en la frecuencia percibida por un observador debido al movimiento relativo entre la fuente emisora y el receptor:
   $$f_{\text{obs}} = f_{\text{fte}} \left(\frac{v \pm v_{\text{obs}}}{v \mp v_{\text{fte}}}\right)$$
   - **Regla de signos:** El observador suma ($+$) si se acerca a la fuente; la fuente resta ($-$) en el denominador si se acerca al observador.

---

## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Óptica Geométrica
Se basa en la aproximación de rayos luminosos rectilíneos ($\lambda \to 0$).

1. **Índice de Refracción Absoluto ($n$):**
   $$n = \frac{c}{v} \ge 1 \quad (c \approx 3 \times 10^8\text{ m/s})$$
   (Para el vacío $n = 1$; aire $n \approx 1.0003 \approx 1$; agua $n = 4/3$; vidrio $n = 3/2$).
2. **Leyes de la Refracción (Ley de Snell-Descartes):**
   $$n_1 \sin\theta_1 = n_2 \sin\theta_2$$
   - $\theta_1, \theta_2$: ángulos medidos **respecto a la recta normal** en la superficie de separación.
3. **Reflexión Total Interna y Ángulo Crítico ($\theta_c$):**
   Ocurre exclusivamente cuando la luz viaja desde un medio más denso hacia uno menos denso ($n_1 > n_2$):
   $$\sin\theta_c = \frac{n_2}{n_1} \implies \theta_c = \arcsin\left(\frac{n_2}{n_1}\right)$$
   Para $\theta_1 > \theta_c$, la luz no se refracta y se refleja totalmente (base de la fibra óptica).

### 4.2. Espejos Esféricos y Lentes Delgadas
1. **Ecuación Fundamental de Descartes (Fórmula de Gauss):**
   $$\frac{1}{f} = \frac{1}{s} + \frac{1}{s'}$$
   - $f$: distancia focal ($f = R/2$ en espejos esféricos paraxiales).
   - $s$: distancia del objeto al vértice o centro óptico (siempre $+s$ para objeto real).
   - $s'$: distancia de la imagen (positivo para imagen real; negativo para imagen virtual).
2. **Convenio de Signos Universal:**
   - **Espejo Cóncavo / Lente Convergente:** $f > 0$.
   - **Espejo Convexo / Lente Divergente:** $f < 0$.
   - **Imagen Real:** $s' > 0$ (delante del espejo / detrás de la lente; siempre invertida).
   - **Imagen Virtual:** $s' < 0$ (detrás del espejo / delante de la lente; siempre derecha).
3. **Aumento Lateral ($m$):**
   $$m = \frac{y'}{y} = -\frac{s'}{s}$$
   - Si $m > 0$: imagen derecha. Si $m < 0$: imagen invertida.
   - Si $|m| > 1$: imagen aumentada. Si $|m| < 1$: imagen disminuida.
4. **Potencia de una Lente ($P$):**
   $$P = \frac{1}{f(\text{en metros})} \quad [\text{Dioptrías, D} = \text{m}^{-1}]$$

---

## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Velocidad máxima en el MAS:**
   > **"V-M-A"** $\implies v_{\max} = \omega \cdot A$.
2. **Aceleración máxima en el MAS:**
   > **"A-O-C-A"** $\implies a_{\max} = \omega^2 \cdot A$.
3. **Periodo del Péndulo Simple:**
   > **"T = 2π √(L/g)"** $\implies$ **"Tengo Dos Pies Largos y Gordos"**.
4. **Fórmula de Descartes de Espejos y Lentes:**
   > **"FIO":** $\frac{1}{f} = \frac{1}{i} + \frac{1}{o}$ $\implies$ **"Foco = Imagen + Objeto"**.
5. **Decibelios:**
   > Cada aumento de $10\text{ dB}$ multiplica la intensidad por $10$. $+20\text{ dB} \to \times 100$; $+30\text{ dB} \to \times 1000$.

---

## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Péndulo en Ascensor con Aceleración):** En un ascensor con aceleración vertical $\vec{a}$, la gravedad efectiva cambia:
  - Si acelera hacia arriba: $g_{\text{ef}} = g + a \implies T$ disminuye (oscila más rápido).
  - Si acelera hacia abajo: $g_{\text{ef}} = g - a \implies T$ aumenta (oscila más lento).
- **Trampa 2 (Ángulos en Snell):** El ángulo de incidencia y refracción **se mide siempre respecto a la normal**, nunca respecto a la superficie o interfaz.
- **Trampa 3 (Espejo Convexo y Lente Divergente):** Para un objeto real, tanto el espejo convexo como la lente divergente forman **SIEMPRE, sin excepción**, una imagen:
  $$\text{VIRTUAL, DERECHA Y DE MENOR TAMAÑO}$$
- **Trampa 4 (Duplicar el número de fuentes sonoras):** Si una fuente emite $60\text{ dB}$, dos fuentes idénticas emiten $2I$, lo que equivale a:
  $$\beta = 60 + 10 \log_{10}(2) \approx 60 + 3 = 63\text{ dB} \quad (\text{¡NO } 120\text{ dB!})$$

---

## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS

### Problema 1: Cinemática y Dinámica del MAS (Nivel Básico)
**Enunciado:** Un bloque de $0.5\text{ kg}$ unido a un resorte oscila horizontalmente sin fricción con una amplitud de $0.2\text{ m}$ y un periodo de $0.4\pi\text{ s}$.
a) Halle la constante elástica del resorte.
b) Calcule la rapidez máxima y la aceleración máxima del bloque.

**Solución paso a paso:**
1. Frecuencia angular $\omega$:
   $$\omega = \frac{2\pi}{T} = \frac{2\pi}{0.4\pi} = 5\text{ rad/s}$$
2. Constante elástica ($k = m \omega^2$):
   $$k = 0.5 \times (5)^2 = 0.5 \times 25 = 12.5\text{ N/m}$$
3. Rapidez máxima:
   $$v_{\max} = \omega A = 5 \times 0.2 = 1.0\text{ m/s}$$
4. Aceleración máxima:
   $$a_{\max} = \omega^2 A = 25 \times 0.2 = 5.0\text{ m/s}^2$$

**Respuesta:** a) $k = 12.5\text{ N/m}$; b) $v_{\max} = 1.0\text{ m/s}$, $a_{\max} = 5.0\text{ m/s}^2$.

---

### Problema 2: Péndulo Simple y Variación de Gravedad (Nivel Intermedio)
**Enunciado:** Un péndulo simple bate segundos en la superficie terrestre ($T_1 = 2.0\text{ s}$). Si se traslada a la superficie de un planeta cuya masa es el doble de la terrestre y su radio es el doble del terrestre, determine el nuevo periodo de oscilación del péndulo.

**Solución paso a paso:**
1. Gravedad planetaria superficial:
   $$g = G \frac{M}{R^2} \implies g_p = G \frac{2 M_T}{(2 R_T)^2} = G \frac{2 M_T}{4 R_T^2} = \frac{1}{2} g_T$$
2. Periodo del péndulo simple:
   $$T = 2\pi \sqrt{\frac{L}{g}} \implies \frac{T_p}{T_1} = \sqrt{\frac{g_T}{g_p}} = \sqrt{\frac{g_T}{\frac{1}{2} g_T}} = \sqrt{2}$$
3. Cálculo del nuevo periodo:
   $$T_p = T_1 \sqrt{2} = 2.0 \times 1.414 \approx 2.83\text{ s}$$

**Respuesta:** El nuevo periodo es $2\sqrt{2}\text{ s} \approx 2.83\text{ s}$.

---

### Problema 3: Nivel Sonoro y Ley de Inverso del Cuadrado (Nivel Intermedio-Avanzado)
**Enunciado:** El nivel sonoro a una distancia de $10\text{ m}$ de una sirena puntual isotrópica es de $80\text{ dB}$.
a) Calcule la intensidad acústica a dicha distancia.
b) Calcule la potencia acústica total emitida por la sirena.
c) ¿A qué distancia el nivel sonoro se reduce a $60\text{ dB}$?

**Solución paso a paso:**
1. Determinación de la intensidad $I_1$ a $r_1 = 10\text{ m}$:
   $$\beta_1 = 10 \log_{10}\left(\frac{I_1}{I_0}\right) \implies 80 = 10 \log_{10}\left(\frac{I_1}{10^{-12}}\right) \implies 8 = \log_{10}\left(\frac{I_1}{10^{-12}}\right)$$
   $$I_1 = 10^{-12} \times 10^8 = 10^{-4}\text{ W/m}^2$$
2. Potencia total emitida ($P = I_1 \cdot 4\pi r_1^2$):
   $$P = (10^{-4}\text{ W/m}^2)(4\pi \times 10^2\text{ m}^2) = 10^{-4} \times 400\pi = 0.04\pi\text{ W} \approx 0.126\text{ W}$$
3. Distancia para $\beta_2 = 60\text{ dB}$:
   La reducción de $\Delta\beta = 80 - 60 = 20\text{ dB}$ significa que la intensidad se reduce en un factor de $100$:
   $$\frac{I_1}{I_2} = 10^{\Delta\beta/10} = 10^{20/10} = 100$$
   Dado que $I \propto \frac{1}{r^2}$:
   $$\frac{I_1}{I_2} = \left(\frac{r_2}{r_1}\right)^2 \implies 100 = \left(\frac{r_2}{10}\right)^2 \implies \frac{r_2}{10} = 10 \implies r_2 = 100\text{ m}$$

**Respuesta:** a) $I_1 = 10^{-4}\text{ W/m}^2$; b) $P = 0.04\pi\text{ W} \approx 0.126\text{ W}$; c) $r_2 = 100\text{ m}$.

---

### Problema 4: Espejo Cóncavo y Aumento (Nivel Avanzado)
**Enunciado:** Un objeto de $4\text{ cm}$ de altura se coloca frente a un espejo esférico cóncavo de radio de curvatura $R = 60\text{ cm}$. Si se obtiene una imagen real invertida cuya altura es de $8\text{ cm}$, determine:
a) La distancia focal del espejo.
b) La posición del objeto ($s$) y la posición de la imagen ($s'$).

**Solución paso a paso:**
1. Distancia focal del espejo cóncavo:
   $$f = +\frac{R}{2} = +\frac{60}{2} = +30\text{ cm}$$
2. Aumento lateral:
   Dado que la imagen es real e invertida ($y' = -8\text{ cm}$, $y = +4\text{ cm}$):
   $$m = \frac{y'}{y} = \frac{-8}{4} = -2$$
   Por fórmula de aumento:
   $$m = -\frac{s'}{s} \implies -2 = -\frac{s'}{s} \implies s' = 2s$$
3. Ecuación de Descartes:
   $$\frac{1}{f} = \frac{1}{s} + \frac{1}{s'} \implies \frac{1}{30} = \frac{1}{s} + \frac{1}{2s} = \frac{3}{2s}$$
   $$2s = 3 \times 30 = 90 \implies s = 45\text{ cm}$$
4. Posición de la imagen:
   $$s' = 2s = 2 \times 45 = 90\text{ cm}$$

**Respuesta:** a) $f = 30\text{ cm}$; b) Objeto a $45\text{ cm}$ del vértice; imagen real a $90\text{ cm}$ del vértice.

---

### Problema 5: Refracción, Ángulo Crítico y Prisma de Reflexión Total (Boss Challenge)
**Enunciado:** Un rayo de luz incide normalmente sobre una de las caras de un prisma de sección triangular equilátera de vidrio ($n = 1.50$) inmerso en un medio desconocido de índice de refracción $n_{\text{medio}}$. Determine el valor máximo de $n_{\text{medio}}$ para que el rayo experimente reflexión total interna en la segunda cara del prisma.

**Solución paso a paso:**
1. Geometría del prisma equilátero:
   - Los tres ángulos internos miden $A = 60^\circ$.
   - Como el rayo incide **normalmente** en la cara 1 ($\theta_{\text{incidencia}} = 0^\circ$), no sufre desviación y penetra en línea recta.
2. Incidencia en la cara 2:
   - El rayo viaja horizontalmente hacia la cara 2 inclinada a $60^\circ$.
   - El ángulo que forma el rayo con la normal a la cara 2 es geométricamente:
     $$\theta_1 = 60^\circ$$
3. Condición de Reflexión Total Interna en la cara 2:
   Para que haya reflexión total interna, el ángulo de incidencia debe ser mayor o igual al ángulo crítico:
   $$\theta_1 \ge \theta_c \implies \sin\theta_1 \ge \sin\theta_c$$
4. Expresión del ángulo crítico:
   $$\sin\theta_c = \frac{n_{\text{medio}}}{n_{\text{vidrio}}}$$
   Sustituyendo $\theta_1 = 60^\circ$ y $n_{\text{vidrio}} = 1.50$:
   $$\sin 60^\circ \ge \frac{n_{\text{medio}}}{1.50} \implies \frac{\sqrt{3}}{2} \ge \frac{n_{\text{medio}}}{1.50}$$
5. Cálculo del valor máximo de $n_{\text{medio}}$:
   $$n_{\text{medio}} \le 1.50 \times \frac{\sqrt{3}}{2} = 0.75 \sqrt{3} \approx 0.75 \times 1.73205 \approx 1.299$$

**Respuesta:** El índice máximo del medio circundante es $n_{\text{medio, max}} = \frac{3\sqrt{3}}{4} \approx 1.30$ (por ejemplo, en agua $n=1.33$ el rayo se refractaría y escaparía).

---

## 8. 5 PROBLEMAS PROPUESTOS

1. Un móvil con Movimiento Armónico Simple tiene una aceleración de $16\text{ m/s}^2$ cuando su posición es $x = 4\text{ cm}$. Calcule su periodo de oscilación.
   - *Pista:* $a = \omega^2 x \implies 16 = \omega^2 (0.04) \implies \omega = 20\text{ rad/s}$.
   - *Clave:* $T = \frac{\pi}{10}\text{ s} \approx 0.314\text{ s}$.

2. Una cuerda de guitarra de $60\text{ cm}$ de longitud y masa $3\text{ g}$ está sometida a una tensión de $180\text{ N}$. Calcule la rapidez de las ondas transversales en dicha cuerda.
   - *Pista:* $\mu = m/L = 3 \times 10^{-3} / 0.6 = 5 \times 10^{-3}\text{ kg/m}$; $v = \sqrt{T/\mu}$.
   - *Clave:* $189.7\text{ m/s} = 60\sqrt{10}\text{ m/s}$.

3. Una patrulla emite una sirena de $900\text{ Hz}$ mientras se desplaza a $30\text{ m/s}$ hacia un obstáculo plano fijo. Calcule la frecuencia percibida por un observador en reposo cerca del obstáculo reflejada por este. ($v_{\text{sonido}} = 340\text{ m/s}$).
   - *Pista:* Efecto Doppler con fuente acercándose al receptor: $f' = f \frac{v}{v - v_{\text{fte}}}$.
   - *Clave:* $987.1\text{ Hz}$.

4. Una lente convergente delgada tiene una potencia de $+5\text{ Dioptrías}$. ¿A qué distancia de la lente debe ubicarse un objeto para obtener una imagen virtual tres veces mayor?
   - *Pista:* $f = 1/P = 0.2\text{ m} = 20\text{ cm}$; imagen virtual $m = +3 = -s'/s \implies s' = -3s$.
   - *Clave:* $s = 13.33\text{ cm} = \frac{40}{3}\text{ cm}$.

5. La velocidad de la luz en cierto líquido es de $2 \times 10^8\text{ m/s}$. Un rayo de luz que viaja en dicho líquido incide en la superficie con el aire ($c = 3 \times 10^8\text{ m/s}$). Calcule el ángulo límite o crítico de reflexión total.
   - *Pista:* $n_L = c/v = 1.5$; $\sin\theta_c = 1/n_L = 2/3$.
   - *Clave:* $\theta_c \approx 41.81^\circ$.

---

## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Movimiento Armónico Simple (MAS):** Movimiento periódico y oscilatorio regido por una fuerza recuperadora proporcional al desplazamiento respecto al equilibrio estable.
2. **Longitud de Onda ($\lambda$):** Distancia mínima espacial entre dos puntos consecutivos de un tren de ondas que se encuentran en el mismo estado o fase de oscilación.
3. **Decibel ($\text{dB}$):** Unidad logarítmica adimensional empleada para expresar la relación entre una magnitud física (como la intensidad sonora) y un valor de referencia umbral.
4. **Efecto Doppler:** Variación aparente de la frecuencia observada de una onda emitida cuando existe movimiento relativo entre la fuente y el observador.
5. **Refracción:** Cambio de dirección y velocidad que experimenta una onda al pasar oblicuamente de un medio material de propagación a otro de distinta densidad óptica.
6. **Reflexión Total Interna:** Fenómeno óptico en el cual un rayo luminoso que viaja por un medio más refringente no se refracta hacia el medio menos refringente al superar el ángulo crítico, reflejándose al $100\%$.
7. **Dioptría ($\text{D}$):** Unidad de medida de la potencia óptica de una lente o espejo esférico, igual al inverso de su distancia focal expresada en metros ($1\text{ D} = 1\text{ m}^{-1}$).
8. **Aberración Cromática:** Defecto óptico de las lentes por el cual la luz blanca se dispersa en diferentes focos debido a que el índice de refracción varía con la longitud de onda.
9. **Onda Estacionaria:** Patrón ondulatorio generado por la superposición destructiva y constructiva de dos ondas idénticas que viajan en sentidos contrarios, caracterizado por nodos fijos (amplitud nula) y antinodos.
10. **Principio de Huygens:** Todo punto alcanzado por un frente de onda se comporta como una nueva fuente puntual emisora de ondas esféricas secundarias.

---

## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿En qué posición del MAS la energía cinética es máxima y en cuál la potencial es máxima?**
  *R: $E_k$ es máxima en la posición de equilibrio ($x = 0$); $E_p$ es máxima en los extremos de amplitud ($x = \pm A$).*
- **P: ¿De qué depende el periodo de un péndulo simple para pequeñas oscilaciones?**
  *R: Exclusivamente de la longitud del hilo ($L$) y de la aceleración gravitacional ($g$). Es completamente independiente de la masa pendular.*
- **P: Si la distancia a una fuente puntual se triplica, ¿cómo varía la intensidad acústica?**
  *R: Disminuye a la novena parte ($I \propto 1/r^2$).*
- **P: ¿Bajo qué condiciones se produce la reflexión total interna de la luz?**
  *R: Cuando la luz pasa de un medio de mayor índice de refracción a uno de menor índice ($n_1 > n_2$) con un ángulo de incidencia superior al crítico ($\theta_1 > \theta_c$).*
- **P: ¿Qué tipo de imagen forma siempre una lente divergente para un objeto real?**
  *R: Siempre virtual, derecha y de menor tamaño que el objeto.*

---

## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Telecomunicaciones y Fibra Óptica:** Las autopistas de datos de internet global operan mediante pulsos láser de infrarrojo guiados a través de fibras de sílice ultra puras mediante confinamiento por reflexión total interna, alcanzando anchos de banda de terabits por segundo.
- **Sismología y Geofísica:** Los terremotos generan ondas primarias ($P$, longitudinales, más rápidas) y secundarias ($S$, transversales, que no se transmiten en líquidos). El análisis del tiempo de llegada de ambas permite triangular el epicentro y reveló que el núcleo externo de la Tierra es líquido.
- **Medicina Oftalmológica:** La miopía (globo ocular alargado) se corrige con lentes divergentes (potencia negativa en dioptrías) para desplazar el foco hacia atrás sobre la retina; la hipermetropía se corrige con lentes convergentes (potencia positiva).

---

## 12. BLOQUE DE GAMIFICACIÓN KMP (JSON)

```json
{
  "curso": "Fisica",
  "tema": "Oscilaciones_y_Ondas",
  "xp_recompensa": 230,
  "insignia": "Maestro_del_Foco_y_la_Frecuencia",
  "desafios": [
    {
      "id": "OND_01",
      "tipo": "opcion_multiple",
      "pregunta": "¿Qué ocurre con la frecuencia de una onda electromagnética al refractarse de aire a vidrio?",
      "opciones": [
        "Permanece estrictamente constante",
        "Aumenta proporcionalmente a n",
        "Disminuye porque su velocidad disminuye",
        "Se duplica"
      ],
      "respuesta_correcta": 0,
      "explicacion": "La frecuencia es determinada únicamente por la fuente emisora; al pasar a un medio con mayor n, la velocidad v y la longitud de onda λ disminuyen en la misma proporción (v = λ f), pero f no cambia."
    },
    {
      "id": "OND_02",
      "tipo": "opcion_multiple",
      "pregunta": "Un péndulo simple oscila en la Tierra con periodo T. Si se transporta a la Luna (g_L = g_T / 6), su nuevo periodo será:",
      "opciones": [
        "√6 T",
        "T / √6",
        "6 T",
        "T / 6"
      ],
      "respuesta_correcta": 0,
      "explicacion": "Como T = 2π √(L/g), al ser g seis veces menor, el denominador bajo la raíz disminuye y T se multiplica por √6."
    },
    {
      "id": "OND_03",
      "tipo": "calculo_numerico",
      "pregunta": "Calcule la potencia en dioptrías de una lente delgada cuya distancia focal es f = +25 cm.",
      "respuesta_correcta": 4.0,
      "tolerancia": 0.05,
      "explicacion": "P = 1 / f(m) = 1 / 0.25 m = +4.0 D."
    }
  ]
}
```
