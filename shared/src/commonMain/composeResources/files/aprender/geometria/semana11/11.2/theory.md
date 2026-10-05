## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Lugar geométrico de los puntos P(x, y) que equidistan de un punto fijo F (foco) y de una recta fija \mathscr{L}_D (directriz):
d(P, F) = d(P, \mathscr{L}_D)
- **Parámetro (p):** Distancia orientada del vértice al foco (d(V, F) = |p| y d(V, \mathscr{L}_D) = |p|).
- **Lado Recto (LR):** Cuerda focal perpendicular al eje de simetría: LR = |4p|.

| Orientación | Eje Focal | Ecuación Ordinaria (V(h, k)) | Foco (F) | Directriz (\mathscr{L}_D) |
| :--- | :--- | :--- | :--- | :--- |
| **Horizontal** | Paralelo a eje X | (y - k)^2 = 4p(x - h) | (h + p, k) | x = h - p |
| **Vertical** | Paralelo a eje Y | (x - h)^2 = 4p(y - k) | (h, k + p) | y = k - p |

---

### 3.5. La Elipse
Lugar geométrico de los puntos P(x, y) tales que la suma de sus distancias a dos puntos fijos F_1 y F_2 (focos) es constante e igual a 2a:
d(P, F_1) + d(P, F_2) = 2a \quad (a > 0)
- **Elementos Notables:**
  - Eje mayor: 2a. Eje menor: 2b. Distancia focal: 2c.
  - **Relación Pitagórica Fundamental:**
    a^2 = b^2 + c^2
  - **Excentricidad (e):** Mide el grado de achatamiento (0 < e < 1):
    e = \frac{c}{a}
  - **Lado Recto (LR):**
    LR = \frac{2b^2}{a}

#### Ecuaciones de la Elipse con Centro en C(h, k):
1. **Eje Mayor Horizontal:**
   \frac{(x - h)^2}{a^2} + \frac{(y - k)^2}{b^2} = 1 \quad (a > b)
2. **Eje Mayor Vertical:**
   \frac{(x - h)^2}{b^2} + \frac{(y - k)^2}{a^2} = 1 \quad (a > b)

---

### 3.6. La Hipérbola
Lugar geométrico de los puntos P(x, y) tales que el valor absoluto de la diferencia de sus distancias a dos puntos fijos F_1 y F_2 (focos) es constante e igual a 2a:
|d(P, F_1) - d(P, F_2)| = 2a
- **Elementos Notables:**
  - Eje transverso (real): 2a. Eje conjugado (imaginario): 2b. Distancia focal: 2c.
  - **Relación Pitagórica Fundamental:**
    c^2 = a^2 + b^2
  - **Excentricidad (e):** Siempre estrictamente mayor a 1:
    e = \frac{c}{a} > 1
  - **Lado Recto (LR):** LR = \dfrac{2b^2}{a}.

#### Ecuaciones de la Hipérbola con Centro en C(h, k):
1. **Eje Transverso Horizontal:**
   \frac{(x - h)^2}{a^2} - \frac{(y - k)^2}{b^2} = 1
   - Ecuaciones de las asíntotas: y - k = \pm \frac{b}{a}(x - h).
2. **Eje Transverso Vertical:**
   \frac{(y - k)^2}{a^2} - \frac{(x - h)^2}{b^2} = 1
   - Ecuaciones de las asíntotas: y - k = \pm \frac{a}{b}(x - h).
- **Hipérbola Equilátera:** Aquella donde a = b. Sus asíntotas son perpendiculares entre sí y su excentricidad es constante: e = \sqrt{2}.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Circunferencia** | (x-h)^2 + (y-k)^2 = r^2 | Centro (h,k), radio r |
| **Parábola (Vertical)** | (x-h)^2 = 4p(y-k) | Foco (h, k+p), LR = \|4p\| |
| **Parábola (Horizontal)** | (y-k)^2 = 4p(x-h) | Foco (h+p, k), LR = \|4p\| |
| **Elipse** | \dfrac{(x-h)^2}{a^2} + \dfrac{(y-k)^2}{b^2} = 1 | a^2 = b^2 + c^2, e = \dfrac{c}{a} < 1 |
| **Hipérbola** | \dfrac{(x-h)^2}{a^2} - \dfrac{(y-k)^2}{b^2} = 1 | c^2 = a^2 + b^2, e = \dfrac{c}{a} > 1 |
| **Asíntotas Hipérbola** | y - k = \pm \dfrac{b}{a}(x - h) | Para hipérbola horizontal |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Identificación Rápida de Cónicas a partir de la Ecuación General
Dada la ecuación cuadrática Ax^2 + Cy^2 + Dx + Ey + F = 0:
1. **Si A = C con el mismo signo:** Es una **Circunferencia** (o punto o vacía).
2. **Si A = 0 o C = 0 (solo una variable está al cuadrado):** Es una **Parábola**.
3. **Si A \ne C pero tienen el MISMO SIGNO (A \cdot C > 0):** Es una **Elipse**.
4. **Si A y C tienen SIGNOS OPUESTOS (A \cdot C < 0):** Es una **Hipérbola**.
- ¡Identificas la cónica en menos de 2 segundos sin completar ningún cuadrado!

### Hack 2: Completación Ultrarrápida de Cuadrados
Para llevar x^2 + Bx a binomio al cuadrado:
- Abre paréntesis: (x + \frac{B}{2})^2.
- Réstale de inmediato el cuadrado del término: -(\frac{B}{2})^2.
- Ejemplo: x^2 - 6x \to (x - 3)^2 - 9. ¡Sin pasos intermedios!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Pitagórica en Cónicas: "LA ELIPSE TIENE LA A MÁS GRANDE"
- En la **E**lipse: la **A** es la jefa (hipotenusa de la relación):
  a^2 = b^2 + c^2
- En la **H**ipérbola: la **C** es la jefa (los focos están afuera de las curvas, más lejos):
  c^2 = a^2 + b^2

### 2. Mnemotecnia de la Excentricidad: "C-E-H-1"
- **C**ircunferencia: e = 0.
- **E**lipse: 0 < e < 1 (Aplastadita, menor que 1).
- **P**arábola: e = 1 (Exactamente 1).
- **H**ipérbola: e > 1 (Hiperactiva, mayor que 1).

### 3. Mnemotecnia para Rectas Perpendiculares: "INVERTIR Y CAMBIAR DE SIGNO"
- Si m_1 = \frac{2}{3} \implies m_2 = -\frac{3}{2} (das vuelta la fracción y le cambias el signo; su producto siempre da -1).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo del Centro (h, k)**
> Si la ecuación es (x + 4)^2 + (y - 5)^2 = 36:
> - El centro es C(-4, 5), **NO** (4, -5).
> - El radio es r = \sqrt{36} = 6, **NO** 36.

> [!CAUTION]
> **Trampa 2: Orientación de la Elipse (a siempre es mayor que b)**
> En la elipse, el valor de a^2 es **SIEMPRE el denominador mayor**.
> Si tienes \frac{x^2}{16} + \frac{y^2}{25} = 1:
> Como 25 > 16, entonces a^2 = 25 y b^2 = 16. Como el 25 está debajo de y, ¡la elipse es **VERTICAL**!

> [!WARNING]
> **Trampa 3: Distancia entre Rectas Paralelas**
> Para aplicar d = \frac{|C_1 - C_2|}{\sqrt{A^2 + B^2}}, los coeficientes A y B deben ser **ESTRICTAMENTE IGUALES** en ambas ecuaciones. Si una ecuación tiene 3x + 4y - 5 = 0 y la otra 6x + 8y + 10 = 0, debes dividir la segunda entre 2 (3x + 4y + 5 = 0) antes de operar.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Órbitas Planetarias (Leyes de Kepler):** La Primera Ley de Kepler demuestra que los planetas del sistema solar se desplazan en órbitas elípticas donde el Sol ocupa uno de los focos.
2. **Antenas Parabólicas y Faros de Automóvil:** Por la propiedad reflectora de la parábola, cualquier señal paralela al eje focal que choca contra la parábola converge exactamente en el foco (antenas de telecomunicación). Viceversa, una bombilla en el foco emite un haz de luz cilíndrico paralelo hacia adelante (faros automotrices).
3. **Navegación LORAN y GPS:** Los sistemas de radionavegación determinan la posición del receptor calculando la diferencia de tiempos de recepción de señales emitidas por dos estaciones fijas, situando al móvil sobre ramas de hipérbolas conocidas.

---
