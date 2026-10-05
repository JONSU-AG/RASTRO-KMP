## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Ecuaciones y Funciones Trigonométricas |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Identidades Trigonométricas, Ángulos Cuadrantales, Factorización y Ecuaciones Cuadráticas |

### Competencias Clave del Prospecto
1. **Identificación y Cálculo del Valor Principal (V_p):** Determinar con precisión el valor principal de una ecuación elemental según el rango canónico de cada función.
2. **Formulación de la Solución General (S.G.):** Aplicar las fórmulas generales de seno (k\pi + (-1)^k V_p), coseno (2k\pi \pm V_p) y tangente (k\pi + V_p).
3. **Determinación de Soluciones en Intervalos Acotados:** Hallar el número de raíces y la suma de soluciones dentro de un intervalo cerrado (ej. [0, 2\pi] o [0, 360^\circ]).
4. **Transformación de Ecuaciones No Elementales:** Resolver ecuaciones trigonométricas mediante factorización, reducción a una sola función y el método del ángulo auxiliar (A\sin x + B\cos x = C).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Ecuaciones Trigonométricas] --> B[Ecuaciones Elementales: E.T.E.]
    A --> C[Valor Principal Vp]
    A --> D[Fórmulas de Solución General]
    A --> E[Ecuaciones No Elementales]
    A --> F[Soluciones en Intervalos]

    B --> B1[Forma: RT ax + b = N]
    B --> B2[Condiciones de Existencia: -1 <= N <= 1 para sen y cos]

    C --> C1[Vp para Seno: [-π/2, π/2]]
    C --> C2[Vp para Coseno: [0, π]]
    C --> C3[Vp para Tangente: <-π/2, π/2>]

    D --> D1[Seno: x = kπ + -1^k · Vp]
    D --> D2[Coseno: x = 2kπ ± Vp]
    D --> D3[Tangente: x = kπ + Vp]

    E --> E1[Método por Factorización]
    E --> E2[Reducción a Cuadrática]
    E --> E3[Método Ángulo Auxiliar: A sen x + B cos x = C]
    E --> E4[Transformación Suma a Producto]

    F --> F1[Tabulación con k en Z]
    F --> F2[Suma de Soluciones en una Vuelta: 0 a 2π]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición y Ecuación Trigonométrica Elemental (E.T.E.)
Una **ecuación trigonométrica** es una igualdad condicional donde la incógnita se encuentra afectada por al menos un operador trigonométrico.
La forma más simple se denomina **Ecuación Trigonométrica Elemental (E.T.E.)**:
\text{R.T.}(k x + \phi) = N
Donde:
- \text{R.T.} es una razón trigonométrica (\sin, \cos, \tan, \cot, \sec, \csc).
- k, \phi son números reales constantes (k \ne 0).
- N es un valor real perteneciente al rango de la razón correspondiente:
  - Para \sin y \cos: -1 \le N \le 1.
  - Para \sec y \csc: |N| \ge 1 \iff N \ge 1 \lor N \le -1.
  - Para \tan y \cot: N \in \mathbb{R}.

---

### 3.2. El Valor Principal (V_p)
El **Valor Principal** es el ángulo elemental único que satisface la ecuación \text{R.T.}(\theta) = N dentro del intervalo restringido de definición de su función inversa:

| Función Trigonométrica | E.T.E. | Intervalo Restringido del V_p |
| :---: | :---: | :---: |
| **Seno** (\sin) | \sin(\theta) = N | V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] \equiv [-90^\circ, 90^\circ] |
| **Coseno** (\cos) | \cos(\theta) = N | V_p \in [0, \pi] \equiv [0^\circ, 180^\circ] |
| **Tangente** (\tan) | \tan(\theta) = N | V_p \in \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle \equiv \langle -90^\circ, 90^\circ \rangle |
| **Cotangente** (\cot) | \cot(\theta) = N | V_p \in \langle 0, \pi \rangle \equiv \langle 0^\circ, 180^\circ \rangle |
| **Secante** (\sec) | \sec(\theta) = N | V_p \in [0, \pi] \setminus \left\{\dfrac{\pi}{2}\right\} |
| **Cosecante** (\csc) | \csc(\theta) = N | V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] \setminus \{0\} |

#### Reglas para Hallar el V_p con Valores Negativos:
1. Para \sin y \tan: Si N < 0 \implies V_p = -\text{ángulo agudo}.
   - Ejemplo: \sin(\theta) = -\frac{1}{2} \implies V_p = -30^\circ = -\frac{\pi}{6}.
   - Ejemplo: \tan(\theta) = -1 \implies V_p = -45^\circ = -\frac{\pi}{4}.
2. Para \cos: Si N < 0 \implies V_p = 180^\circ - \text{ángulo agudo}.
   - Ejemplo: \cos(\theta) = -\frac{1}{2} \implies V_p = 180^\circ - 60^\circ = 120^\circ = \frac{2\pi}{3}.

---

### 3.3. Fórmulas de la Solución General (S.G.)
El conjunto de infinitas soluciones de una E.T.E. se expresa mediante una fórmula general en función de un número entero arbitrario k \in \mathbb{Z}:

#### 1. Para Seno y Cosecante (\sin\theta = N):
\theta = k\pi + (-1)^k V_p \quad (k \in \mathbb{Z})
- *Desglose práctico:*

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Ecuación Elemental | Solución General (k \in \mathbb{Z}) | Rango del Valor Principal |
| :--- | :--- | :--- |
| **\sin(x) = N** | x = k\pi + (-1)^k V_p | V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] |
| **\cos(x) = N** | x = 2k\pi \pm V_p | V_p \in [0, \pi] |
| **\tan(x) = N** | x = k\pi + V_p | V_p \in \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle |
| **\cot(x) = N** | x = k\pi + V_p | V_p \in \langle 0, \pi \rangle |
