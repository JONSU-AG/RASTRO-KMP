## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Análisis Matemático y Funciones Periódicas |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Funciones Algebraicas (Dominio y Rango), Circunferencia Trigonométrica y Radianes |

### Competencias Clave del Prospecto
1. **Determinación Rigurosa de Dominios y Rangos:** Identificar asíntotas, restricciones analíticas y valores extremos de las seis funciones trigonométricas directas.
2. **Análisis de Periodicidad y Amplitud:** Calcular el periodo fundamental T de funciones compuestas, con potencias pares/impares y valores absolutos.
3. **Modelación con Curvas Senoidales y Cosinoidales:** Aplicar la forma canónica y = A\sin(Bx + C) + D, reconociendo amplitud (|A|), periodo (T = \frac{2\pi}{|B|}), desfase (-\frac{C}{B}) y desplazamiento vertical.
4. **Interpretación Gráfica y Fenómenos Ondulatorios:** Modelar oscilaciones armónicas, ondas acústicas y ciclos biológicos mediante gráficos senoidales en contextos DECO.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Funciones Trigonométricas] --> B[Función Seno y Coseno]
    A --> C[Función Tangente y Cotangente]
    A --> D[Función Secante y Cosecante]
    A --> E[Parámetros y Transformaciones]
    A --> F[Reglas de Periodo Fundamental]

    B --> B1[Dom: R, Ran: [-1, 1], Periodo: 2π]
    B --> B2[Seno Impar y Coseno Par]

    C --> C1[Tangente: Dom R - 2k+1 π/2, Ran R, Periodo π]
    C --> C2[Cotangente: Dom R - kπ, Ran R, Periodo π]

    D --> D1[Secante y Cosecante: Ran <-inf, -1] U [1, +inf>]
    D --> D2[Asíntotas Verticales y Periodo 2π]

    E --> E1[Amplitud: |A|]
    E --> E2[Periodo: T = 2π / |B|]
    E --> E3[Desfase: -C / B y Desplazamiento Vertical: D]

    F --> F1[Potencia Impar: 2π / |B|]
    F --> F2[Potencia Par o Valor Absoluto: π / |B|]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición de Función Trigonométrica
Una **función trigonométrica real de variable real** es una correspondencia que asocia a cada número real x (que representa la medida de un ángulo en **radianes**) un único número real f(x) = \text{R.T.}(x):
f = \{ (x, y) \in \mathbb{R}^2 \mid y = \text{R.T.}(x), \quad x \in \text{Dom}(f) \}

---

### 3.2. Estudio de las Seis Funciones Circulares

#### 1. Función Seno: f(x) = \sin(x)
- **Dominio:** \text{Dom}(f) = \mathbb{R} = \langle -\infty, +\infty \rangle.
- **Rango:** \text{Ran}(f) = [-1, 1] \iff -1 \le \sin(x) \le 1.
- **Periodo Fundamental:** T = 2\pi.
- **Paridad:** Función impar (\sin(-x) = -\sin x), simétrica respecto al origen de coordenadas.
- **Intersecciones con el eje X (Ceros):** x = k\pi \quad (k \in \mathbb{Z}).
- **Valores Máximos (y = 1):** x = 2k\pi + \frac{\pi}{2}.
- **Valores Mínimos (y = -1):** x = 2k\pi - \frac{\pi}{2} = 2k\pi + \frac{3\pi}{2}.

#### 2. Función Coseno: f(x) = \cos(x)
- **Dominio:** \text{Dom}(f) = \mathbb{R}.
- **Rango:** \text{Ran}(f) = [-1, 1] \iff -1 \le \cos(x) \le 1.
- **Periodo Fundamental:** T = 2\pi.
- **Paridad:** Función par (\cos(-x) = \cos x), simétrica respecto al eje Y.
- **Ceros:** x = (2k + 1)\frac{\pi}{2} \quad (k \in \mathbb{Z}).
- **Valores Máximos (y = 1):** x = 2k\pi.
- **Valores Mínimos (y = -1):** x = (2k + 1)\pi.

#### 3. Función Tangente: f(x) = \tan(x)
- **Dominio:** \text{Dom}(f) = \mathbb{R} \setminus \left\{ (2k + 1)\frac{\pi}{2} \right\} \quad (k \in \mathbb{Z}).
- **Rango:** \text{Ran}(f) = \mathbb{R} = \langle -\infty, +\infty \rangle.
- **Periodo Fundamental:** T = \pi.
- **Paridad:** Función impar (\tan(-x) = -\tan x).
- **Asíntotas Verticales:** Rectas x = (2k + 1)\frac{\pi}{2}.
- **Monotonía:** Estrictamente creciente en cada intervalo abierto \left\langle k\pi - \frac{\pi}{2}, k\pi + \frac{\pi}{2} \right\rangle.

#### 4. Función Cotangente: f(x) = \cot(x)
- **Dominio:** \text{Dom}(f) = \mathbb{R} \setminus \{ k\pi \} \quad (k \in \mathbb{Z}).
- **Rango:** \text{Ran}(f) = \mathbb{R}.
- **Periodo Fundamental:** T = \pi.
- **Paridad:** Función impar.
- **Asíntotas Verticales:** Rectas x = k\pi.
- **Monotonía:** Estrictamente decreciente en cada intervalo \langle k\pi, (k+1)\pi \rangle.

#### 5. Función Secante: f(x) = \sec(x)
- **Dominio:** \text{Dom}(f) = \mathbb{R} \setminus \left\{ (2k + 1)\frac{\pi}{2} \right\}.
- **Rango:** \text{Ran}(f) = \langle -\infty, -1] \cup [1, +\infty\rangle \iff |y| \ge 1.
- **Periodo Fundamental:** T = 2\pi.
- **Paridad:** Función par (\sec(-x) = \sec x).
- **Asíntotas Verticales:** x = (2k + 1)\frac{\pi}{2}.

#### 6. Función Cosecante: f(x) = \csc(x)
- **Dominio:** \text{Dom}(f) = \mathbb{R} \setminus \{ k\pi \}.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Función | Dominio | Rango | Periodo T |
| :--- | :--- | :--- | :---: |
| **\sin(x)** | \mathbb{R} | [-1, 1] | 2\pi |
| **\cos(x)** | \mathbb{R} | [-1, 1] | 2\pi |
| **\tan(x)** | \mathbb{R} \setminus \left\{(2k+1)\dfrac{\pi}{2}\right\} | \mathbb{R} | \pi |
| **\cot(x)** | \mathbb{R} \setminus \{k\pi\} | \mathbb{R} | \pi |
