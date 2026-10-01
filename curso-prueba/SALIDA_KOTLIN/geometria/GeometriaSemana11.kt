package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana11 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t11_s01",
            title = "GEOMETRÍA ANALÍTICA: PUNTO, RECTA Y CÓNICAS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "GEOMETRÍA ANALÍTICA: PUNTO, RECTA Y CÓNICAS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Sistema de Coordenadas Cartesianas (\mathbb{R}^2)
Todo punto en el plano se representa por un par ordenado P(x, y), donde x es la abscisa e y es la ordenada.
1. **Distancia entre Dos Puntos:**
   d(P_1, P_2) = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
2. **División de un Segmento en una Razón Dada (r = \frac{P_1P}{PP_2}):**
   x = \frac{x_1 + r x_2}{1 + r}, \quad y = \frac{y_1 + r y_2}{1 + r} \quad (r \ne -1)
   - *Punto Medio (M donde r = 1):*
     M = \left( \frac{x_1 + x_2}{2}, \frac{y_1 + y_2}{2} \right)
3. **Baricentro de un Triángulo (G):**
   G = \left( \frac{x_1 + x_2 + x_3}{3}, \frac{y_1 + y_2 + y_3}{3} \right)
4. **Área de una Región Poligonal (Método de Gauss / Determinante):**
   Para un polígono con vértices ordenados en sentido antihorario (x_1, y_1), (x_2, y_2), \dots, (x_n, y_n):
   A = \frac{1}{2} |(x_1y_2 + x_2y_3 + \dots + x_ny_1) - (y_1x_2 + y_2x_3 + \dots + y_nx_1)|

---

### 3.2. La Línea Recta en el Plano
- **Pendiente (m):** Tangente del ángulo de inclinación \theta (0^\circ \le \theta < 180^\circ):
  m = \tan(\theta) = \frac{y_2 - y_1}{x_2 - x_1} \quad (x_1 \ne x_2)
- **Ecuaciones de la Recta:**
  1. *Punto - Pendiente:* y - y_0 = m(x - x_0)
  2. *Pendiente - Intercepto (Principal):* y = mx + b (b es la ordenada en el origen)
  3. *Forma General:* Ax + By + C = 0 \implies m = -\dfrac{A}{B}
  4. *Forma Simétrica / Canónica:* \dfrac{x}{a} + \dfrac{y}{b} = 1 (a, b son los interceptos)
- **Posiciones Relativas de Dos Rectas:**
  - *Paralelas (\mathscr{L}_1 \parallel \mathscr{L}_2):* m_1 = m_2.
  - *Perpendiculares (\mathscr{L}_1 \perp \mathscr{L}_2):* m_1 \cdot m_2 = -1 \iff m_2 = -\dfrac{1}{m_1}.
- **Distancia de un Punto P(x_0, y_0) a una Recta Ax + By + C = 0:**
  d = \frac{|Ax_0 + By_0 + C|}{\sqrt{A^2 + B^2}}
- **Distancia entre Dos Rectas Paralelas (Ax + By + C_1 = 0 y Ax + By + C_2 = 0):**
  d = \frac{|C_1 - C_2|}{\sqrt{A^2 + B^2}}

---

### 3.3. La Circunferencia
Lugar geométrico de los puntos P(x, y) que equidistan de un centro fijo C(h, k) una distancia r.
1. **Ecuación Ordinaria:**
   (x - h)^2 + (y - k)^2 = r^2
2. **Ecuación Canónica (Centro en el Origen (0, 0)):**
   x^2 + y^2 = r^2
3. **Ecuación General:**
   x^2 + y^2 + Dx + Ey + F = 0
   Donde:
   h = -\frac{D}{2}, \quad k = -\frac{E}{2}, \quad r = \frac{1}{2}\sqrt{D^2 + E^2 - 4F}
   - Si D^2 + E^2 - 4F > 0 \implies Circunferencia real.
   - Si D^2 + E^2 - 4F = 0 \implies Punto único (h, k).
   - Si D^2 + E^2 - 4F < 0 \implies Conjunto vacío (circunferencia imaginaria).

---

### 3.4. La Parábola

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Elemento / Cónica | Ecuación Canónica / Ordinaria | Parámetros y Relaciones |
| :--- | :--- | :--- |
| **Distancia Entre Puntos** | d = \sqrt{(x_2-x_1)^2 + (y_2-y_1)^2} | Plano \mathbb{R}^2 |
| **Pendiente de la Recta** | m = \dfrac{y_2 - y_1}{x_2 - x_1} = -\dfrac{A}{B} | Ax + By + C = 0 |
| **Distancia Punto a Recta**| d = \dfrac{\|Ax_0 + By_0 + C\|}{\sqrt{A^2 + B^2}} | Punto (x_0, y_0) a recta |
| **Distancia Rectas //** | d = \dfrac{\|C_1 - C_2\|}{\sqrt{A^2 + B^2}} | Rectas Ax+By+C_1=0 y Ax+By+C_2=0 |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t11_s01_c01",
                    question = "**Enunciado:** Calcule la distancia entre el punto P(2, -3) y la recta \\mathscr{L}: 3x - 4y + 7 = 0.",
                    options = listOf(
                        "3",
                        "4",
                        "5",
                        "6"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t11_s01_c02",
                    question = "**Enunciado:** Determine las coordenadas del centro y la longitud del radio de la circunferencia cuya ecuación general es x^2 + y^2 - 6x + 8y - 11 = 0.",
                    options = listOf(
                        "C(3, -4), r = 6",
                        "C(-3, 4), r = 6",
                        "C(3, -4), r = 36",
                        "C(-3, 4), r = \\sqrt{11}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t11_s01_c03",
                    question = "**Enunciado:** Calcule la ecuación ordinaria de la parábola con vértice en el origen V(0, 0) cuyo foco se ubica en el punto F(0, 3), y determine la longitud de su lado recto.",
                    options = listOf(
                        "x^2 = 12y, LR = 12",
                        "y^2 = 12x, LR = 12",
                        "x^2 = 6y, LR = 6",
                        "y^2 = 6x, LR = 6"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t11_s01_c04",
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
                    id = "geom_t11_s01_c05",
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
                    id = "geom_t11_s01_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "geom_t11_s01_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "geom_t11_s01_c08",
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
                    id = "geom_t11_s01_c09",
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
                    id = "geom_t11_s01_c10",
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
            id = "geom_t11_s02",
            title = "GEOMETRÍA ANALÍTICA: PUNTO, RECTA Y CÓNICAS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "GEOMETRÍA ANALÍTICA: PUNTO, RECTA Y CÓNICAS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t11_s02_c01",
                    question = "**Enunciado:** La sección transversal de un túnel vial tiene forma semielíptica con una base de 12\\text{ m} de ancho y una altura máxima en el centro de 4\\text{ m}. Si un camión de transporte de carga tiene un ancho de 6\\text{ m}, ¿cuál es la altura máxima que puede tener el camión para pasar exactamente por el túnel sin rozar la estructura?",
                    options = listOf(
                        "2\\sqrt{3}\\text{ m}",
                        "3\\sqrt{2}\\text{ m}",
                        "3.5\\text{ m}",
                        "2\\sqrt{2}\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t11_s02_c02",
                    question = "**Enunciado:** Calcule la excentricidad de una hipérbola equilátera y halle el ángulo agudo que forman sus asíntotas entre sí. Si dicha hipérbola tiene centro en el origen y corta al eje de abscisas en los puntos (\\pm 4, 0), determine la distancia entre sus focos.",
                    options = listOf(
                        "e = \\sqrt{2}, ángulo 90^\\circ, 2c = 8\\sqrt{2}",
                        "e = 2, ángulo 60^\\circ, 2c = 16",
                        "e = \\sqrt{2}, ángulo 45^\\circ, 2c = 4\\sqrt{2}",
                        "e = \\sqrt{3}, ángulo 90^\\circ, 2c = 8\\sqrt{3}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t11_s02_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "geom_t11_s02_c04",
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
                    id = "geom_t11_s02_c05",
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
                    id = "geom_t11_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "geom_t11_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "geom_t11_s02_c08",
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
                    id = "geom_t11_s02_c09",
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
                    id = "geom_t11_s02_c10",
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
