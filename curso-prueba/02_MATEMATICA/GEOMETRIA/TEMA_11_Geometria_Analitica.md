# TEMA 11: GEOMETRÍA ANALÍTICA: PUNTO, RECTA Y CÓNICAS

---

## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Geometría Analítica Plana |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 5.0 a 6.0 horas |
| **Prerrequisitos** | Álgebra (Ecuación Cuadrática, Factorización), Trigonometría Básica y Geometría Plana |

### Competencias Clave del Prospecto
1. **Álgebra en el Plano Cartesiano:** Manejar distancia entre puntos, división de segmentos en razón dada, cálculo de áreas por determinantes y baricentros.
2. **Ecuaciones de la Recta:** Dominar todas las formas de la recta (punto-pendiente, pendiente-intercepto, general, simétrica), distancias a puntos y paralelismo/perpendicularidad.
3. **Análisis Completo de Cónicas:** Determinar focos, vértices, directrices, excentricidades y ecuaciones de la circunferencia, parábola, elipse e hipérbola.
4. **Completación de Cuadrados y Transformación:** Convertir ecuaciones generales cuadráticas de segundo grado a sus formas ordinarias para graficación e identificación inmediata de parámetros.

---

## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Geometría Analítica Plana] --> B[Plano Cartesiano Fundamental]
    A --> C[La Línea Recta]
    A --> D[La Circunferencia]
    A --> E[La Parábola]
    A --> F[La Elipse]
    A --> G[La Hipérbola]

    B --> B1[Distancia entre Puntos y Punto Medio]
    B --> B2[División de Segmento en una Razón]
    B --> B3[Área por Determinante / Gauss]

    C --> C1[Pendiente m = tan theta]
    C --> C2[Forma General: Ax + By + C = 0]
    C --> C3[Distancia de Punto a Recta]
    C --> C4[Condición Paralela y Perpendicular]

    D --> D1[Ordinaria: x-h² + y-k² = r²]
    D --> D2[General: x² + y² + Dx + Ey + F = 0]

    E --> E1[Definición: d P,F = d P,L]
    E --> E2[Parámetro p y Lado Recto LR = 4p]
    E --> E3[Eje Focal Horizontal y Vertical]

    F --> F1[Definición: d1 + d2 = 2a]
    F --> F2[Pitagórica: a² = b² + c²]
    F --> F3[Excentricidad: e = c/a < 1]

    G --> G1[Definición: |d1 - d2| = 2a]
    G --> G2[Pitagórica: c² = a² + b²]
    G --> G3[Asíntotas e Hipérbola Equilátera]
```

---

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Sistema de Coordenadas Cartesianas ($\mathbb{R}^2$)
Todo punto en el plano se representa por un par ordenado $P(x, y)$, donde $x$ es la abscisa e $y$ es la ordenada.
1. **Distancia entre Dos Puntos:**
   $$d(P_1, P_2) = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$$
2. **División de un Segmento en una Razón Dada ($r = \frac{P_1P}{PP_2}$):**
   $$x = \frac{x_1 + r x_2}{1 + r}, \quad y = \frac{y_1 + r y_2}{1 + r} \quad (r \ne -1)$$
   - *Punto Medio ($M$ donde $r = 1$):*
     $$M = \left( \frac{x_1 + x_2}{2}, \frac{y_1 + y_2}{2} \right)$$
3. **Baricentro de un Triángulo ($G$):**
   $$G = \left( \frac{x_1 + x_2 + x_3}{3}, \frac{y_1 + y_2 + y_3}{3} \right)$$
4. **Área de una Región Poligonal (Método de Gauss / Determinante):**
   Para un polígono con vértices ordenados en sentido antihorario $(x_1, y_1), (x_2, y_2), \dots, (x_n, y_n)$:
   $$A = \frac{1}{2} |(x_1y_2 + x_2y_3 + \dots + x_ny_1) - (y_1x_2 + y_2x_3 + \dots + y_nx_1)|$$

---

### 3.2. La Línea Recta en el Plano
- **Pendiente ($m$):** Tangente del ángulo de inclinación $\theta$ ($0^\circ \le \theta < 180^\circ$):
  $$m = \tan(\theta) = \frac{y_2 - y_1}{x_2 - x_1} \quad (x_1 \ne x_2)$$
- **Ecuaciones de la Recta:**
  1. *Punto - Pendiente:* $y - y_0 = m(x - x_0)$
  2. *Pendiente - Intercepto (Principal):* $y = mx + b$ ($b$ es la ordenada en el origen)
  3. *Forma General:* $Ax + By + C = 0 \implies m = -\dfrac{A}{B}$
  4. *Forma Simétrica / Canónica:* $\dfrac{x}{a} + \dfrac{y}{b} = 1$ ($a, b$ son los interceptos)
- **Posiciones Relativas de Dos Rectas:**
  - *Paralelas ($\mathscr{L}_1 \parallel \mathscr{L}_2$):* $m_1 = m_2$.
  - *Perpendiculares ($\mathscr{L}_1 \perp \mathscr{L}_2$):* $m_1 \cdot m_2 = -1 \iff m_2 = -\dfrac{1}{m_1}$.
- **Distancia de un Punto $P(x_0, y_0)$ a una Recta $Ax + By + C = 0$:**
  $$d = \frac{|Ax_0 + By_0 + C|}{\sqrt{A^2 + B^2}}$$
- **Distancia entre Dos Rectas Paralelas ($Ax + By + C_1 = 0$ y $Ax + By + C_2 = 0$):**
  $$d = \frac{|C_1 - C_2|}{\sqrt{A^2 + B^2}}$$

---

### 3.3. La Circunferencia
Lugar geométrico de los puntos $P(x, y)$ que equidistan de un centro fijo $C(h, k)$ una distancia $r$.
1. **Ecuación Ordinaria:**
   $$(x - h)^2 + (y - k)^2 = r^2$$
2. **Ecuación Canónica (Centro en el Origen $(0, 0)$):**
   $$x^2 + y^2 = r^2$$
3. **Ecuación General:**
   $$x^2 + y^2 + Dx + Ey + F = 0$$
   Donde:
   $$h = -\frac{D}{2}, \quad k = -\frac{E}{2}, \quad r = \frac{1}{2}\sqrt{D^2 + E^2 - 4F}$$
   - Si $D^2 + E^2 - 4F > 0 \implies$ Circunferencia real.
   - Si $D^2 + E^2 - 4F = 0 \implies$ Punto único $(h, k)$.
   - Si $D^2 + E^2 - 4F < 0 \implies$ Conjunto vacío (circunferencia imaginaria).

---

### 3.4. La Parábola
Lugar geométrico de los puntos $P(x, y)$ que equidistan de un punto fijo $F$ (foco) y de una recta fija $\mathscr{L}_D$ (directriz):
$$d(P, F) = d(P, \mathscr{L}_D)$$
- **Parámetro ($p$):** Distancia orientada del vértice al foco ($d(V, F) = |p|$ y $d(V, \mathscr{L}_D) = |p|$).
- **Lado Recto ($LR$):** Cuerda focal perpendicular al eje de simetría: $LR = |4p|$.

| Orientación | Eje Focal | Ecuación Ordinaria ($V(h, k)$) | Foco ($F$) | Directriz ($\mathscr{L}_D$) |
| :--- | :--- | :--- | :--- | :--- |
| **Horizontal** | Paralelo a eje X | $(y - k)^2 = 4p(x - h)$ | $(h + p, k)$ | $x = h - p$ |
| **Vertical** | Paralelo a eje Y | $(x - h)^2 = 4p(y - k)$ | $(h, k + p)$ | $y = k - p$ |

---

### 3.5. La Elipse
Lugar geométrico de los puntos $P(x, y)$ tales que la suma de sus distancias a dos puntos fijos $F_1$ y $F_2$ (focos) es constante e igual a $2a$:
$$d(P, F_1) + d(P, F_2) = 2a \quad (a > 0)$$
- **Elementos Notables:**
  - Eje mayor: $2a$. Eje menor: $2b$. Distancia focal: $2c$.
  - **Relación Pitagórica Fundamental:**
    $$a^2 = b^2 + c^2$$
  - **Excentricidad ($e$):** Mide el grado de achatamiento ($0 < e < 1$):
    $$e = \frac{c}{a}$$
  - **Lado Recto ($LR$):**
    $$LR = \frac{2b^2}{a}$$

#### Ecuaciones de la Elipse con Centro en $C(h, k)$:
1. **Eje Mayor Horizontal:**
   $$\frac{(x - h)^2}{a^2} + \frac{(y - k)^2}{b^2} = 1 \quad (a > b)$$
2. **Eje Mayor Vertical:**
   $$\frac{(x - h)^2}{b^2} + \frac{(y - k)^2}{a^2} = 1 \quad (a > b)$$

---

### 3.6. La Hipérbola
Lugar geométrico de los puntos $P(x, y)$ tales que el valor absoluto de la diferencia de sus distancias a dos puntos fijos $F_1$ y $F_2$ (focos) es constante e igual a $2a$:
$$|d(P, F_1) - d(P, F_2)| = 2a$$
- **Elementos Notables:**
  - Eje transverso (real): $2a$. Eje conjugado (imaginario): $2b$. Distancia focal: $2c$.
  - **Relación Pitagórica Fundamental:**
    $$c^2 = a^2 + b^2$$
  - **Excentricidad ($e$):** Siempre estrictamente mayor a 1:
    $$e = \frac{c}{a} > 1$$
  - **Lado Recto ($LR$):** $LR = \dfrac{2b^2}{a}$.

#### Ecuaciones de la Hipérbola con Centro en $C(h, k)$:
1. **Eje Transverso Horizontal:**
   $$\frac{(x - h)^2}{a^2} - \frac{(y - k)^2}{b^2} = 1$$
   - Ecuaciones de las asíntotas: $y - k = \pm \frac{b}{a}(x - h)$.
2. **Eje Transverso Vertical:**
   $$\frac{(y - k)^2}{a^2} - \frac{(x - h)^2}{b^2} = 1$$
   - Ecuaciones de las asíntotas: $y - k = \pm \frac{a}{b}(x - h)$.
- **Hipérbola Equilátera:** Aquella donde $a = b$. Sus asíntotas son perpendiculares entre sí y su excentricidad es constante: $e = \sqrt{2}$.

---

## 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Elemento / Cónica | Ecuación Canónica / Ordinaria | Parámetros y Relaciones |
| :--- | :--- | :--- |
| **Distancia Entre Puntos** | $d = \sqrt{(x_2-x_1)^2 + (y_2-y_1)^2}$ | Plano $\mathbb{R}^2$ |
| **Pendiente de la Recta** | $m = \dfrac{y_2 - y_1}{x_2 - x_1} = -\dfrac{A}{B}$ | $Ax + By + C = 0$ |
| **Distancia Punto a Recta**| $d = \dfrac{\|Ax_0 + By_0 + C\|}{\sqrt{A^2 + B^2}}$ | Punto $(x_0, y_0)$ a recta |
| **Distancia Rectas //** | $d = \dfrac{\|C_1 - C_2\|}{\sqrt{A^2 + B^2}}$ | Rectas $Ax+By+C_1=0$ y $Ax+By+C_2=0$ |
| **Circunferencia** | $(x-h)^2 + (y-k)^2 = r^2$ | Centro $(h,k)$, radio $r$ |
| **Parábola (Vertical)** | $(x-h)^2 = 4p(y-k)$ | Foco $(h, k+p)$, $LR = \|4p\|$ |
| **Parábola (Horizontal)** | $(y-k)^2 = 4p(x-h)$ | Foco $(h+p, k)$, $LR = \|4p\|$ |
| **Elipse** | $\dfrac{(x-h)^2}{a^2} + \dfrac{(y-k)^2}{b^2} = 1$ | $a^2 = b^2 + c^2$, $e = \dfrac{c}{a} < 1$ |
| **Hipérbola** | $\dfrac{(x-h)^2}{a^2} - \dfrac{(y-k)^2}{b^2} = 1$ | $c^2 = a^2 + b^2$, $e = \dfrac{c}{a} > 1$ |
| **Asíntotas Hipérbola** | $y - k = \pm \dfrac{b}{a}(x - h)$ | Para hipérbola horizontal |

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Pitagórica en Cónicas: "LA ELIPSE TIENE LA A MÁS GRANDE"
- En la **E**lipse: la **A** es la jefa (hipotenusa de la relación):
  $$a^2 = b^2 + c^2$$
- En la **H**ipérbola: la **C** es la jefa (los focos están afuera de las curvas, más lejos):
  $$c^2 = a^2 + b^2$$

### 2. Mnemotecnia de la Excentricidad: "C-E-H-1"
- **C**ircunferencia: $e = 0$.
- **E**lipse: $0 < e < 1$ (Aplastadita, menor que 1).
- **P**arábola: $e = 1$ (Exactamente 1).
- **H**ipérbola: $e > 1$ (Hiperactiva, mayor que 1).

### 3. Mnemotecnia para Rectas Perpendiculares: "INVERTIR Y CAMBIAR DE SIGNO"
- Si $m_1 = \frac{2}{3} \implies m_2 = -\frac{3}{2}$ (das vuelta la fracción y le cambias el signo; su producto siempre da $-1$).

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Identificación Rápida de Cónicas a partir de la Ecuación General
Dada la ecuación cuadrática $Ax^2 + Cy^2 + Dx + Ey + F = 0$:
1. **Si $A = C$ con el mismo signo:** Es una **Circunferencia** (o punto o vacía).
2. **Si $A = 0$ o $C = 0$ (solo una variable está al cuadrado):** Es una **Parábola**.
3. **Si $A \ne C$ pero tienen el MISMO SIGNO ($A \cdot C > 0$):** Es una **Elipse**.
4. **Si $A$ y $C$ tienen SIGNOS OPUESTOS ($A \cdot C < 0$):** Es una **Hipérbola**.
- ¡Identificas la cónica en menos de 2 segundos sin completar ningún cuadrado!

### Hack 2: Completación Ultrarrápida de Cuadrados
Para llevar $x^2 + Bx$ a binomio al cuadrado:
- Abre paréntesis: $(x + \frac{B}{2})^2$.
- Réstale de inmediato el cuadrado del término: $-(\frac{B}{2})^2$.
- Ejemplo: $x^2 - 6x \to (x - 3)^2 - 9$. ¡Sin pasos intermedios!

---

## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo del Centro $(h, k)$**
> Si la ecuación es $(x + 4)^2 + (y - 5)^2 = 36$:
> - El centro es $C(-4, 5)$, **NO** $(4, -5)$.
> - El radio es $r = \sqrt{36} = 6$, **NO** $36$.

> [!CAUTION]
> **Trampa 2: Orientación de la Elipse ($a$ siempre es mayor que $b$)**
> En la elipse, el valor de $a^2$ es **SIEMPRE el denominador mayor**.
> Si tienes $\frac{x^2}{16} + \frac{y^2}{25} = 1$:
> Como $25 > 16$, entonces $a^2 = 25$ y $b^2 = 16$. Como el 25 está debajo de $y$, ¡la elipse es **VERTICAL**!

> [!WARNING]
> **Trampa 3: Distancia entre Rectas Paralelas**
> Para aplicar $d = \frac{|C_1 - C_2|}{\sqrt{A^2 + B^2}}$, los coeficientes $A$ y $B$ deben ser **ESTRICTAMENTE IGUALES** en ambas ecuaciones. Si una ecuación tiene $3x + 4y - 5 = 0$ y la otra $6x + 8y + 10 = 0$, debes dividir la segunda entre 2 ($3x + 4y + 5 = 0$) antes de operar.

---

## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Órbitas Planetarias (Leyes de Kepler):** La Primera Ley de Kepler demuestra que los planetas del sistema solar se desplazan en órbitas elípticas donde el Sol ocupa uno de los focos.
2. **Antenas Parabólicas y Faros de Automóvil:** Por la propiedad reflectora de la parábola, cualquier señal paralela al eje focal que choca contra la parábola converge exactamente en el foco (antenas de telecomunicación). Viceversa, una bombilla en el foco emite un haz de luz cilíndrico paralelo hacia adelante (faros automotrices).
3. **Navegación LORAN y GPS:** Los sistemas de radionavegación determinan la posición del receptor calculando la diferencia de tiempos de recepción de señales emitidas por dos estaciones fijas, situando al móvil sobre ramas de hipérbolas conocidas.

---

## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS

### Ejercicio 1 (Nivel 1 - Básico / Admisión Directa)
**Enunciado:** Calcule la distancia entre el punto $P(2, -3)$ y la recta $\mathscr{L}: 3x - 4y + 7 = 0$.

- A) 3
- B) 4
- C) 5
- D) 6
- E) 2.5

**Solución Paso a Paso:**
1. Identificamos los coeficientes de la recta $Ax + By + C = 0$:
   $$A = 3, \quad B = -4, \quad C = 7$$
2. Identificamos las coordenadas del punto $P(x_0, y_0)$:
   $$x_0 = 2, \quad y_0 = -3$$
3. Aplicamos la fórmula de distancia de un punto a una recta:
   $$d = \frac{|Ax_0 + By_0 + C|}{\sqrt{A^2 + B^2}}$$
4. Sustituimos los valores numéricos:
   $$d = \frac{|3(2) + (-4)(-3) + 7|}{\sqrt{3^2 + (-4)^2}} = \frac{|6 + 12 + 7|}{\sqrt{9 + 16}} = \frac{|25|}{\sqrt{25}} = \frac{25}{5} = 5$$
- **Respuesta Correcta:** C) 5

---

### Ejercicio 2 (Nivel 2 - Intermedio / CEPREUNSA)
**Enunciado:** Determine las coordenadas del centro y la longitud del radio de la circunferencia cuya ecuación general es $x^2 + y^2 - 6x + 8y - 11 = 0$.

- A) $C(3, -4), r = 6$
- B) $C(-3, 4), r = 6$
- C) $C(3, -4), r = 36$
- D) $C(-3, 4), r = \sqrt{11}$
- E) $C(6, -8), r = 5$

**Solución Paso a Paso:**
1. Agrupamos los términos en $x$ y en $y$:
   $$(x^2 - 6x) + (y^2 + 8y) = 11$$
2. Completamos cuadrados para cada variable:
   - Para $x$: $x^2 - 6x = (x - 3)^2 - 9$
   - Para $y$: $y^2 + 8y = (y + 4)^2 - 16$
3. Sustituimos en la ecuación:
   $$(x - 3)^2 - 9 + (y + 4)^2 - 16 = 11$$
   $$(x - 3)^2 + (y + 4)^2 = 11 + 9 + 16$$
   $$(x - 3)^2 + (y - (-4))^2 = 36$$
4. Comparando con la forma ordinaria $(x - h)^2 + (y - k)^2 = r^2$:
   - Centro: $h = 3, k = -4 \implies C(3, -4)$
   - Radio: $r^2 = 36 \implies r = 6$
- **Respuesta Correcta:** A) $C(3, -4), r = 6$

---

### Ejercicio 3 (Nivel 3 - Intermedio-Avanzado / UNSA Ordinario)
**Enunciado:** Calcule la ecuación ordinaria de la parábola con vértice en el origen $V(0, 0)$ cuyo foco se ubica en el punto $F(0, 3)$, y determine la longitud de su lado recto.

- A) $x^2 = 12y, LR = 12$
- B) $y^2 = 12x, LR = 12$
- C) $x^2 = 6y, LR = 6$
- D) $y^2 = 6x, LR = 6$
- E) $x^2 = -12y, LR = 12$

**Solución Paso a Paso:**
1. El vértice es $V(0, 0)$ y el foco es $F(0, 3)$.
   - Observamos que ambas coordenadas tienen la misma abscisa ($x = 0$), lo que indica que el **eje focal es vertical** (coincide con el eje Y).
2. El foco está ubicado hacia arriba del vértice:
   $$p = y_F - y_V = 3 - 0 = 3 \quad (p > 0, \text{abre hacia arriba})$$
3. La forma canónica de una parábola vertical con vértice en el origen es:
   $$x^2 = 4py$$
4. Sustituimos $p = 3$:
   $$x^2 = 4(3)y \implies x^2 = 12y$$
5. Calculamos la longitud del lado recto ($LR$):
   $$LR = |4p| = |4(3)| = 12$$
- **Respuesta Correcta:** A) $x^2 = 12y, LR = 12$

---

### Ejercicio 4 (Nivel 4 - Avanzado / UNMSM DECO)
**Enunciado:** La sección transversal de un túnel vial tiene forma semielíptica con una base de $12\text{ m}$ de ancho y una altura máxima en el centro de $4\text{ m}$. Si un camión de transporte de carga tiene un ancho de $6\text{ m}$, ¿cuál es la altura máxima que puede tener el camión para pasar exactamente por el túnel sin rozar la estructura?

- A) $2\sqrt{3}\text{ m}$
- B) $3\sqrt{2}\text{ m}$
- C) $3.5\text{ m}$
- D) $2\sqrt{2}\text{ m}$
- E) $3\text{ m}$

**Solución Paso a Paso:**
1. Establecemos un sistema cartesiano con el origen $(0, 0)$ en el centro de la base del túnel.
   - El eje mayor de la elipse descansa sobre la base horizontal:
     $$2a = 12\text{ m} \implies a = 6\text{ m}$$
   - La altura máxima en el centro corresponde al semieje menor vertical:
     $$b = 4\text{ m}$$
2. La ecuación canónica de la elipse correspondiente es:
   $$\frac{x^2}{a^2} + \frac{y^2}{b^2} = 1 \implies \frac{x^2}{6^2} + \frac{y^2}{4^2} = 1 \implies \frac{x^2}{36} + \frac{y^2}{16} = 1$$
3. El camión tiene un ancho de $6\text{ m}$ y circula centrado en la vía. Por tanto, sus bordes exteriores se sitúan a una distancia de:
   $$x = \pm \frac{6}{2} = \pm 3\text{ m}$$
4. Sustituimos $x = 3$ en la ecuación de la elipse para hallar la altura permitida $y$:
   $$\frac{3^2}{36} + \frac{y^2}{16} = 1 \implies \frac{9}{36} + \frac{y^2}{16} = 1 \implies \frac{1}{4} + \frac{y^2}{16} = 1$$
   $$\frac{y^2}{16} = 1 - \frac{1}{4} = \frac{3}{4} \implies y^2 = 16 \cdot \frac{3}{4} = 12$$
   $$y = \sqrt{12} = 2\sqrt{3}\text{ m} \approx 3.464\text{ m}$$
- **Respuesta Correcta:** A) $2\sqrt{3}\text{ m}$

---

### Ejercicio 5 (Nivel 5 - Boss Challenge / UNI)
**Enunciado:** Calcule la excentricidad de una hipérbola equilátera y halle el ángulo agudo que forman sus asíntotas entre sí. Si dicha hipérbola tiene centro en el origen y corta al eje de abscisas en los puntos $(\pm 4, 0)$, determine la distancia entre sus focos.

- A) $e = \sqrt{2}$, ángulo $90^\circ$, $2c = 8\sqrt{2}$
- B) $e = 2$, ángulo $60^\circ$, $2c = 16$
- C) $e = \sqrt{2}$, ángulo $45^\circ$, $2c = 4\sqrt{2}$
- D) $e = \sqrt{3}$, ángulo $90^\circ$, $2c = 8\sqrt{3}$
- E) $e = \frac{3}{2}$, ángulo $90^\circ$, $2c = 12$

**Solución Paso a Paso:**
1. **Definición y Propiedades de la Hipérbola Equilátera:**
   - Una hipérbola es equilátera si sus semiejes real e imaginario son iguales: $a = b$.
   - La relación fundamental es:
     $$c^2 = a^2 + b^2 = a^2 + a^2 = 2a^2 \implies c = a\sqrt{2}$$
   - Su excentricidad es:
     $$e = \frac{c}{a} = \frac{a\sqrt{2}}{a} = \sqrt{2}$$
2. **Ángulo entre las Asíntotas:**
   - Las ecuaciones de las asíntotas para una hipérbola horizontal son $y = \pm \frac{b}{a}x$.
   - Como $a = b$, las asíntotas son:
     $$y = x \quad \text{y} \quad y = -x$$
   - Las pendientes son $m_1 = 1$ y $m_2 = -1$.
   - El producto de pendientes es:
     $$m_1 \cdot m_2 = (1)(-1) = -1$$
   - Por tanto, las asíntotas son **perpendiculares entre sí**, formando un ángulo de $90^\circ$.
3. **Cálculo de la Distancia Focal ($2c$):**
   - Corta al eje de abscisas en $(\pm 4, 0)$, lo que significa que los vértices son $V_1(-4, 0)$ y $V_2(4, 0)$.
   - Por consiguiente, el semieje transverso es $a = 4$.
   - Calculamos $c$:
     $$c = a\sqrt{2} = 4\sqrt{2}$$
   - La distancia focal (distancia entre los focos) es:
     $$2c = 2(4\sqrt{2}) = 8\sqrt{2}$$
- **Respuesta Correcta:** A) $e = \sqrt{2}$, ángulo $90^\circ$, $2c = 8\sqrt{2}$

---

## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Pendiente ($m$):** Medida de la inclinación de una recta, calculada como la tangente del ángulo de inclinación respecto al semieje X positivo.
2. **Lugar Geométrico:** Conjunto de puntos del plano que satisfacen una propiedad o relación geométrica/algebraica determinada.
3. **Cónica:** Curva resultante de la intersección de un plano secante con una superficie cónica de revolución de dos mantos.
4. **Directriz:** Recta fija que, junto con el foco, define la posición de los puntos de una parábola, elipse o hipérbola.
5. **Parámetro ($p$):** Distancia orientada entre el vértice y el foco de una parábola.
6. **Lado Recto ($LR$):** Cuerda focal perpendicular al eje principal de una cónica.
7. **Excentricidad ($e$):** Razón entre la distancia focal y el eje principal ($e = c/a$), caracterizando la forma de la cónica.
8. **Asíntota:** Recta a la cual se aproxima indefinidamente una curva en el infinito sin llegar a tocarla.
9. **Eje Transverso:** Eje focal principal de la hipérbola que contiene a los vértices y a los focos.
10. **Hipérbola Equilátera:** Hipérbola con semiejes de igual longitud ($a = b$) y asíntotas perpendiculares entre sí.

---

## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es la condición para que dos rectas sean perpendiculares en el plano analítico?**
  - **A:** Que el producto de sus pendientes sea igual a $-1$ ($m_1 \cdot m_2 = -1$).
- **Q: ¿Cuál es la distancia entre el punto $(x_0, y_0)$ y la recta $Ax + By + C = 0$?**
  - **A:** $d = \dfrac{|Ax_0 + By_0 + C|}{\sqrt{A^2 + B^2}}$.
- **Q: En la ecuación cuadrática $Ax^2 + Cy^2 + Dx + Ey + F = 0$, ¿cómo se reconoce que es una parábola?**
  - **A:** Cuando uno de los coeficientes cuadráticos es cero ($A = 0$ o $C = 0$).
- **Q: ¿Cuál es la relación pitagórica entre los semiejes $a, b$ y la semidistancia focal $c$ en la elipse?**
  - **A:** $a^2 = b^2 + c^2$.
- **Q: ¿Cuál es la relación pitagórica en la hipérbola?**
  - **A:** $c^2 = a^2 + b^2$.
- **Q: ¿Cuánto vale la excentricidad de cualquier hipérbola equilátera?**
  - **A:** Vale siempre $e = \sqrt{2}$.

---

## 12. MOTOR DE GAMIFICACIÓN (JSON NATIVO PARA KOTLIN MULTIPLATFORM)

```json
{
  "temaId": "GEO_11_GEOMETRIA_ANALITICA",
  "titulo": "Maestría en Geometría Analítica Plana: Rectas, Circunferencias y Cónicas",
  "dificultad": "Avanzado",
  "xpTotal": 600,
  "skills": [
    "Ecuaciones y Distancias de la Recta",
    "Ecuación Ordinaria y General de la Circunferencia",
    "Parábola y Lado Recto",
    "Elipse, Hipérbola y Excentricidad"
  ],
  "retos": [
    {
      "id": "reto_1",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es la pendiente de una recta perpendicular a la recta 2x - 3y + 5 = 0?",
      "opciones": ["-3/2", "3/2", "2/3", "-2/3"],
      "respuestaCorrecta": "-3/2",
      "puntos": 70,
      "explicacion": "La recta original tiene pendiente m1 = -A/B = -2/(-3) = 2/3. La perpendicular tiene m2 = -1 / (2/3) = -3/2."
    },
    {
      "id": "reto_2",
      "tipo": "opcion_multiple",
      "pregunta": "La ecuación (x - 2)² + (y + 1)² = 16 representa una circunferencia con centro y radio:",
      "opciones": ["C(2, -1), r = 4", "C(-2, 1), r = 4", "C(2, -1), r = 16", "C(-2, 1), r = 16"],
      "respuestaCorrecta": "C(2, -1), r = 4",
      "puntos": 70,
      "explicacion": "h = 2, k = -1 -> Centro C(2, -1). Radio r = √16 = 4."
    },
    {
      "id": "reto_3",
      "tipo": "opcion_multiple",
      "pregunta": "En una parábola de ecuación y² = 16x, la longitud de su lado recto es:",
      "opciones": ["16", "4", "8", "32"],
      "respuestaCorrecta": "16",
      "puntos": 80,
      "explicacion": "La forma es y² = 4px. El lado recto es LR = |4p| = 16."
    },
    {
      "id": "reto_4",
      "tipo": "opcion_multiple",
      "pregunta": "En una elipse con semieje mayor a = 5 y semidistancia focal c = 3, ¿cuánto mide el semieje menor b?",
      "opciones": ["4", "2", "√34", "16"],
      "respuestaCorrecta": "4",
      "puntos": 80,
      "explicacion": "En la elipse a² = b² + c² -> 25 = b² + 9 -> b² = 16 -> b = 4."
    },
    {
      "id": "reto_boss",
      "tipo": "boss_challenge",
      "pregunta": "¿Cuál es la distancia entre las rectas paralelas 3x + 4y - 12 = 0 y 3x + 4y + 8 = 0?",
      "opciones": ["4", "20/7", "2", "5"],
      "respuestaCorrecta": "4",
      "puntos": 300,
      "explicacion": "d = |C1 - C2| / √(A² + B²) = |-12 - 8| / √(3² + 4²) = |-20| / 5 = 20 / 5 = 4."
    }
  ]
}
```
