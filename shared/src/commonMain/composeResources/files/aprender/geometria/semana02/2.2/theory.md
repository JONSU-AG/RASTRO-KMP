## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
4. **Ecuación General de la Recta:**
   Ax + By + C = 0, \quad \text{con } A^2 + B^2 \neq 0
   - Pendiente analítica: m = -\frac{A}{B}
   - Ordenada al origen: b = -\frac{C}{B}
   - Abscisa al origen: a = -\frac{C}{A}

---

### 3.3. Posiciones Relativas de dos Rectas en el Plano
Sean las rectas L_1: A_1 x + B_1 y + C_1 = 0 y L_2: A_2 x + B_2 y + C_2 = 0:

#### A. Rectas Paralelas (L_1 \parallel L_2):
Poseen la misma inclinación y por tanto pendientes idénticas:
L_1 \parallel L_2 \iff m_1 = m_2 \iff \frac{A_1}{A_2} = \frac{B_1}{B_2} \neq \frac{C_1}{C_2}

#### B. Rectas Perpendiculares u Ortogonales (L_1 \perp L_2):
Se cortan formando un ángulo recto de 90^\circ. El producto de sus pendientes es igual a -1:
L_1 \perp L_2 \iff m_1 \cdot m_2 = -1 \iff A_1 A_2 + B_1 B_2 = 0
- Si una recta tiene pendiente m = \frac{p}{q}, toda recta perpendicular tendrá pendiente m_{\perp} = -\frac{q}{p}.

#### C. Ángulo \alpha entre dos Rectas Secantes:
\tan \alpha = \left| \frac{m_2 - m_1}{1 + m_1 m_2} \right|

---

### 3.4. Distancias y Métricas Fundamentales

#### 1. Distancia de un Punto P_0(x_0, y_0) a una Recta L: Ax + By + C = 0:
Es la longitud del segmento perpendicular trazado desde el punto a la recta:
\mathbf{d(P_0, L) = \frac{|A x_0 + B y_0 + C|}{\sqrt{A^2 + B^2}}}

#### 2. Distancia entre dos Rectas Paralelas:
Dadas L_1: Ax + By + C_1 = 0 y L_2: Ax + By + C_2 = 0 (con coeficientes A y B idénticos):
\mathbf{d(L_1, L_2) = \frac{|C_1 - C_2|}{\sqrt{A^2 + B^2}}}

#### 3. Área de un Polígono por Coordenadas (Fórmula de Gauss / Determinante del Agrimensor):
Dados los vértices ordenados en sentido antihorario: (x_1, y_1), (x_2, y_2), \dots, (x_n, y_n):
\text{Área} = \frac{1}{2} |(x_1 y_2 + x_2 y_3 + \dots + x_n y_1) - (y_1 x_2 + y_2 x_3 + \dots + y_n x_1)|

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Condición de Paralelismo** | m_1 = m_2 \iff A_1 B_2 - A_2 B_1 = 0 | Mismo ángulo de inclinación |
| **Condición Perpendicular** | m_1 \cdot m_2 = -1 \iff A_1 A_2 + B_1 B_2 = 0 | Ángulo de 90^\circ entre rectas |
| **Distancia Punto-Recta** | d = \frac{\|Ax_0 + By_0 + C\|}{\sqrt{A^2 + B^2}} | Longitud perpendicular |
| **Distancia entre Paralelas** | d = \frac{\|C_1 - C_2\|}{\sqrt{A^2 + B^2}} | Coeficientes A y B homogeneizados |
| **Ángulo entre Rectas** | \tan \alpha = \left\|\frac{m_2 - m_1}{1 + m_1 m_2}\right\| | Ángulo agudo de corte |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Homogeneización Obligatoria en la Distancia entre Paralelas
Si te piden la distancia entre:
L_1: 3x + 4y - 12 = 0
L_2: 6x + 8y + 16 = 0
**¡Jamás restes directamente C_1 - C_2 = -12 - 16!** Los coeficientes de x e y son diferentes (3, 4 vs 6, 8).
**Hack:** Divide L_2 entre 2 para igualar los coeficientes A y B:
L_2: 3x + 4y + 8 = 0
Ahora sí:
d = \frac{|-12 - 8|}{\sqrt{3^2 + 4^2}} = \frac{|-20|}{5} = 4\text{ unidades}
¡Calculado en 10 segundos sin fallar la pregunta!

### Artificio 2: Ecuación Inmediata de Recta Paralela o Perpendicular
Dada la recta L: 5x - 2y + 7 = 0:
- **Toda recta paralela** tiene exactamente la forma:
  5x - 2y + K = 0
- **Toda recta perpendicular** intercambia coeficientes y cambia un signo:
  2x + 5y + K = 0
Solo reemplazas el punto de paso para hallar K en un solo paso algebraico.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Pendientes Perpendiculares: "Invierte y Cambia de Signo" (I-C-S)
- Si una recta tiene pendiente \frac{3}{5}:
> **"Le das la vuelta a la tortilla y le cambias el signo."**
- Su pendiente perpendicular es forzosamente: -\frac{5}{3}.
- Si tiene pendiente -4: su perpendicular es +\frac{1}{4}.

### 2. Distancia Punto-Recta: "Evalúa arriba, Pitágoras abajo"
- Arriba en el numerador: Metes las coordenadas (x_0, y_0) dentro de la ecuación de la recta con barras de valor absoluto.
- Abajo en el denominador: Sacas el teorema de Pitágoras con los coeficientes A y B: \sqrt{A^2 + B^2}.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Ángulo de Inclinación con Pendiente Negativa**
> Si m = -\sqrt{3}, el alumno novato calcula \arctan(-\sqrt{3}) en su memoria y dice -60^\circ.
> **¡INCORRECTO!** El ángulo de inclinación de una recta siempre se mide entre 0^\circ y 180^\circ:
> \theta = 180^\circ - 60^\circ = 120^\circ

> [!CAUTION]
> **Trampa 2: La Recta Vertical NO Tiene Pendiente Real**
> Una recta de ecuación x = 5 es vertical (\theta = 90^\circ).
> Su pendiente no está definida en \mathbb{R}. Si intentas usar la fórmula de la distancia o del ángulo con m = \infty, el cálculo fallará. Debes utilizar las propiedades ortogonales directas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Georreferenciación y Trazado de Tuberías en el Proyecto Minero Cerro Verde
En el monitoreo topográfico satelital de la planta de beneficio de Cerro Verde en Uchumayo (Arequipa), el tendido de un ducto de relaves mineros de alta presión se modela como una recta analítica L_1: 4x - 3y + 25 = 0 en el sistema de coordenadas UTM. Un pozo de monitoreo freático se ubica en las coordenadas P_0(10, 5). Para cumplir con la normativa ambiental del OEFA y evitar filtraciones al río Chili, se exige que la distancia mínima de seguridad desde el pozo al ducto supere los 50 metros. El cálculo de la distancia punto-recta permite certificar la idoneidad espacial del trazado con precisión milimétrica.

---
