## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
