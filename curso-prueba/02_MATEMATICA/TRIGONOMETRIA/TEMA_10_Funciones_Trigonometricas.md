# TEMA 10: FUNCIONES TRIGONOMÉTRICAS REALES: DOMINIO, RANGO, GRÁFICAS Y TRANSFORMACIONES

---

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
2. **Análisis de Periodicidad y Amplitud:** Calcular el periodo fundamental $T$ de funciones compuestas, con potencias pares/impares y valores absolutos.
3. **Modelación con Curvas Senoidales y Cosinoidales:** Aplicar la forma canónica $y = A\sin(Bx + C) + D$, reconociendo amplitud ($|A|$), periodo ($T = \frac{2\pi}{|B|}$), desfase ($-\frac{C}{B}$) y desplazamiento vertical.
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

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición de Función Trigonométrica
Una **función trigonométrica real de variable real** es una correspondencia que asocia a cada número real $x$ (que representa la medida de un ángulo en **radianes**) un único número real $f(x) = \text{R.T.}(x)$:
$$f = \{ (x, y) \in \mathbb{R}^2 \mid y = \text{R.T.}(x), \quad x \in \text{Dom}(f) \}$$

---

### 3.2. Estudio de las Seis Funciones Circulares

#### 1. Función Seno: $f(x) = \sin(x)$
- **Dominio:** $\text{Dom}(f) = \mathbb{R} = \langle -\infty, +\infty \rangle$.
- **Rango:** $\text{Ran}(f) = [-1, 1] \iff -1 \le \sin(x) \le 1$.
- **Periodo Fundamental:** $T = 2\pi$.
- **Paridad:** Función impar ($\sin(-x) = -\sin x$), simétrica respecto al origen de coordenadas.
- **Intersecciones con el eje X (Ceros):** $x = k\pi \quad (k \in \mathbb{Z})$.
- **Valores Máximos ($y = 1$):** $x = 2k\pi + \frac{\pi}{2}$.
- **Valores Mínimos ($y = -1$):** $x = 2k\pi - \frac{\pi}{2} = 2k\pi + \frac{3\pi}{2}$.

#### 2. Función Coseno: $f(x) = \cos(x)$
- **Dominio:** $\text{Dom}(f) = \mathbb{R}$.
- **Rango:** $\text{Ran}(f) = [-1, 1] \iff -1 \le \cos(x) \le 1$.
- **Periodo Fundamental:** $T = 2\pi$.
- **Paridad:** Función par ($\cos(-x) = \cos x$), simétrica respecto al eje Y.
- **Ceros:** $x = (2k + 1)\frac{\pi}{2} \quad (k \in \mathbb{Z})$.
- **Valores Máximos ($y = 1$):** $x = 2k\pi$.
- **Valores Mínimos ($y = -1$):** $x = (2k + 1)\pi$.

#### 3. Función Tangente: $f(x) = \tan(x)$
- **Dominio:** $\text{Dom}(f) = \mathbb{R} \setminus \left\{ (2k + 1)\frac{\pi}{2} \right\} \quad (k \in \mathbb{Z})$.
- **Rango:** $\text{Ran}(f) = \mathbb{R} = \langle -\infty, +\infty \rangle$.
- **Periodo Fundamental:** $T = \pi$.
- **Paridad:** Función impar ($\tan(-x) = -\tan x$).
- **Asíntotas Verticales:** Rectas $x = (2k + 1)\frac{\pi}{2}$.
- **Monotonía:** Estrictamente creciente en cada intervalo abierto $\left\langle k\pi - \frac{\pi}{2}, k\pi + \frac{\pi}{2} \right\rangle$.

#### 4. Función Cotangente: $f(x) = \cot(x)$
- **Dominio:** $\text{Dom}(f) = \mathbb{R} \setminus \{ k\pi \} \quad (k \in \mathbb{Z})$.
- **Rango:** $\text{Ran}(f) = \mathbb{R}$.
- **Periodo Fundamental:** $T = \pi$.
- **Paridad:** Función impar.
- **Asíntotas Verticales:** Rectas $x = k\pi$.
- **Monotonía:** Estrictamente decreciente en cada intervalo $\langle k\pi, (k+1)\pi \rangle$.

#### 5. Función Secante: $f(x) = \sec(x)$
- **Dominio:** $\text{Dom}(f) = \mathbb{R} \setminus \left\{ (2k + 1)\frac{\pi}{2} \right\}$.
- **Rango:** $\text{Ran}(f) = \langle -\infty, -1] \cup [1, +\infty\rangle \iff |y| \ge 1$.
- **Periodo Fundamental:** $T = 2\pi$.
- **Paridad:** Función par ($\sec(-x) = \sec x$).
- **Asíntotas Verticales:** $x = (2k + 1)\frac{\pi}{2}$.

#### 6. Función Cosecante: $f(x) = \csc(x)$
- **Dominio:** $\text{Dom}(f) = \mathbb{R} \setminus \{ k\pi \}$.
- **Rango:** $\text{Ran}(f) = \langle -\infty, -1] \cup [1, +\infty\rangle \iff |y| \ge 1$.
- **Periodo Fundamental:** $T = 2\pi$.
- **Paridad:** Función impar.
- **Asíntotas Verticales:** $x = k\pi$.

---

### 3.3. Transformaciones de la Onda Senoidal y Cosinoidal

Dada la función estándar modificada:
$$y = A \sin(Bx + C) + D \quad \text{o} \quad y = A \cos(Bx + C) + D \quad (A \ne 0, \; B \ne 0)$$

1. **Amplitud ($|A|$):** Mide la elongación máxima de la onda respecto a su eje central:
   $$\text{Amplitud} = |A| = \frac{y_{\text{máx}} - y_{\text{mín}}}{2}$$
2. **Periodo Fundamental ($T$):** Longitud del ciclo completo antes de repetirse:
   $$T = \frac{2\pi}{|B|}$$
   *(Para funciones tangente y cotangente: $T = \frac{\pi}{|B|}$).*
3. **Frecuencia ($f$):** Número de ciclos por unidad de longitud o tiempo:
   $$f = \frac{1}{T} = \frac{|B|}{2\pi}$$
4. **Desfase o Desplazamiento Horizontal ($\phi$):**
   Factorizando el argumento: $B\left(x + \frac{C}{B}\right)$.
   $$\text{Desfase} = -\frac{C}{B}$$
   - Si $-\frac{C}{B} > 0 \implies$ La gráfica se desplaza hacia la **DERECHA**.
   - Si $-\frac{C}{B} < 0 \implies$ La gráfica se desplaza hacia la **IZQUIERDA**.
5. **Desplazamiento Vertical ($D$):**
   Desplaza toda la curva hacia arriba ($D > 0$) o hacia abajo ($D < 0$).
   - El nuevo eje medio o línea central de oscilación es la recta horizontal:
     $$y = D$$
   - **Rango de la Función Transformada:**
     $$\text{Ran}(f) = [D - |A|, \; D + |A|]$$
     $$y_{\text{máx}} = D + |A|, \quad y_{\text{mín}} = D - |A|$$

---

### 3.4. Reglas Especiales de Periodo Fundamental

#### 1. Potencias de Funciones Senoidales y Cosinoidales:
Sea $f(x) = \sin^n(Bx)$ o $f(x) = \cos^n(Bx)$ ($n \in \mathbb{Z}^+$):
- **Si $n$ es IMPAR:**
  $$T = \frac{2\pi}{|B|}$$
- **Si $n$ es PAR:**
  $$T = \frac{\pi}{|B|}$$
  *(La potencia par vuelve positivas las crestas negativas, duplicando la frecuencia y cortando el periodo a la mitad).*

#### 2. Funciones con Valor Absoluto:
- Para $f(x) = |\sin(Bx)|$ o $f(x) = |\cos(Bx)|$:
  $$T = \frac{\pi}{|B|}$$

#### 3. Suma de Funciones Periódicas Independientes:
Si $f(x) = f_1(x) + f_2(x)$, con periodos $T_1 = \frac{a}{b}$ y $T_2 = \frac{c}{d}$:
$$T_{\text{total}} = \text{MCM}(T_1, T_2) = \frac{\text{MCM}(a, c)}{\text{MCD}(b, d)}$$

---

## 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Función | Dominio | Rango | Periodo $T$ |
| :--- | :--- | :--- | :---: |
| **$\sin(x)$** | $\mathbb{R}$ | $[-1, 1]$ | $2\pi$ |
| **$\cos(x)$** | $\mathbb{R}$ | $[-1, 1]$ | $2\pi$ |
| **$\tan(x)$** | $\mathbb{R} \setminus \left\{(2k+1)\dfrac{\pi}{2}\right\}$ | $\mathbb{R}$ | $\pi$ |
| **$\cot(x)$** | $\mathbb{R} \setminus \{k\pi\}$ | $\mathbb{R}$ | $\pi$ |
| **$\sec(x)$** | $\mathbb{R} \setminus \left\{(2k+1)\dfrac{\pi}{2}\right\}$ | $\langle -\infty, -1] \cup [1, +\infty\rangle$ | $2\pi$ |
| **$\csc(x)$** | $\mathbb{R} \setminus \{k\pi\}$ | $\langle -\infty, -1] \cup [1, +\infty\rangle$ | $2\pi$ |
| **$A\sin(Bx+C)+D$** | $\mathbb{R}$ | $[D - \|A\|, D + \|A\|]$ | $\dfrac{2\pi}{\|B\|}$ |
| **$\sin^n(Bx)$ ($n$ par)**| $\mathbb{R}$ | $[0, 1]$ | $\dfrac{\pi}{\|B\|}$ |
| **$\|\cos(Bx)\|$** | $\mathbb{R}$ | $[0, 1]$ | $\dfrac{\pi}{\|B\|}$ |
| **$\tan^n(Bx)$ ($\forall n$)**| $\text{Dom}(\tan Bx)$ | $\mathbb{R}$ o $[0, +\infty\rangle$ | $\dfrac{\pi}{\|B\|}$ |

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de los Periodos Básicos: "TANGENTE ES MEDIA VUELTA"
- Casi todo en trigonometría tiene periodo de una vuelta completa ($2\pi$): seno, coseno, secante y cosecante.
- **Solo la Tangente y la Cotangente** se conforman con **media vuelta** ($\pi$):
  $$T_{\tan} = T_{\cot} = \pi$$

### 2. Mnemotecnia de la Paridad: "EL COSENO SE TRAGA EL MENOS"
- El **Coseno** (y su compadre la Secante) es un agujero negro que se traga el signo negativo:
  $$\cos(-x) = \cos(x), \quad \sec(-x) = \sec(x)$$
- Las otras cuatro funciones son imparables y escupen el signo negativo hacia afuera:
  $$\sin(-x) = -\sin(x)$$

### 3. Mnemotecnia del Desfase: "DENTRO MIENTE, FUERA DICE LA VERDAD"
- Dentro del paréntesis ($Bx + C$): Si dice $+C$, va a la **izquierda** (miente). Si dice $-C$, va a la **derecha**.
- Fuera del paréntesis ($+D$): Si dice $+D$, sube. Si dice $-D$, baja (dice la verdad).

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Rango Ultrarrápido de Expresiones Cuadráticas
Para hallar el rango de $y = \sin^2(x) - 4\sin(x) + 7$:
- Completa cuadrados algebraicamente:
  $$y = (\sin x - 2)^2 - 4 + 7 = (\sin x - 2)^2 + 3$$
- Sabemos que $-1 \le \sin(x) \le 1$.
- Restamos 2: $-3 \le \sin x - 2 \le -1$.
- Elevamos al cuadrado (los números negativos se invierten):
  $$1 \le (\sin x - 2)^2 \le 9$$
- Sumamos 3:
  $$4 \le y \le 12 \implies \text{Ran} = [4, 12]$$
- ¡Se resuelve en 20 segundos sin derivar!

### Hack 2: Identificación Inmediata de Parámetros en Gráficos DECO
Dado un gráfico senoidal en el examen:
1. Halla la línea media: $D = \frac{y_{\text{máx}} + y_{\text{mín}}}{2}$.
2. Halla la amplitud: $A = \frac{y_{\text{máx}} - y_{\text{mín}}}{2}$.
3. Mide la distancia horizontal entre dos crestas consecutivas: esa distancia es el periodo $T$.
4. Despeja $B$ con $B = \frac{2\pi}{T}$. ¡Tienes la regla de correspondencia completa!

---

## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Valor Absoluto en la Amplitud**
> La amplitud de $y = -3\sin(2x)$ es **$+3$**, NUNCA $-3$. La amplitud es una distancia física de oscilación y es estrictamente positiva:
> $$\text{Amplitud} = |-3| = 3$$
> El signo menos solo indica que la onda inicia bajando en lugar de subiendo (reflexión sobre el eje X).

> [!CAUTION]
> **Trampa 2: Periodo de Potencias Pares**
> Postulantes confiados calculan el periodo de $f(x) = \cos^2(4x)$ como $\frac{2\pi}{4} = \frac{\pi}{2}$.
> **ERROR:** Por ser potencia par ($n = 2$), la fórmula es:
> $$T = \frac{\pi}{|B|} = \frac{\pi}{4}$$
> ¡El periodo es la mitad del que tendría la función lineal!

> [!WARNING]
> **Trampa 3: Asíntotas de la Tangente**
> La tangente NO está definida en $90^\circ$ ($\frac{\pi}{2}$) ni en $270^\circ$ ($\frac{3\pi}{2}$).
> Si un problema pide el dominio de $f(x) = \tan(2x)$, debes restringir:
> $$2x \ne (2k+1)\frac{\pi}{2} \implies x \ne (2k+1)\frac{\pi}{4}$$

---

## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Electrocardiogramas (ECG) y Ritmo Cardíaco:** El ciclo cardíaco normal genera ondas periódicas desfasadas P-Q-R-S-T donde la frecuencia cardíaca ($f = 1/T$) determina si el paciente presenta bradicardia ($< 60\text{ lpm}$) o taquicardia ($> 100\text{ lpm}$).
2. **Climatología y Ciclo Térmico en Arequipa:** La temperatura ambiental diaria en la ciudad blanca sigue un modelo senoidal: $T(t) = 15 + 8\cos\left(\frac{\pi(t - 14)}{12}\right)$, donde $15^\circ\text{C}$ es la temperatura media, $8^\circ\text{C}$ la amplitud y el pico máximo ocurre a las 14:00 horas.
3. **Ingeniería Acústica y Tonos Puros:** Un diapasón emite un sonido puro a $440\text{ Hz}$ (nota La) que se describe exactamente como la función de presión de aire $P(t) = P_0 \sin(2\pi \cdot 440 t)$.

---

## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS

### Ejercicio 1 (Nivel 1 - Básico / Admisión Directa)
**Enunciado:** Calcule el periodo fundamental de la función trigonométrica $f(x) = 5\sin(4x - \pi) + 2$.

- A) $\dfrac{\pi}{2}$
- B) $\pi$
- C) $2\pi$
- D) $\dfrac{\pi}{4}$
- E) $\dfrac{3\pi}{2}$

**Solución Paso a Paso:**
1. Identificamos los parámetros en la forma estándar $y = A\sin(Bx + C) + D$:
   - Amplitud: $A = 5$
   - Coeficiente angular: $B = 4$
   - Desfase: $C = -\pi$
   - Desplazamiento vertical: $D = 2$
2. Aplicamos la fórmula del periodo fundamental para la función seno:
   $$T = \frac{2\pi}{|B|}$$
3. Sustituimos $B = 4$:
   $$T = \frac{2\pi}{4} = \frac{\pi}{2}$$
- **Respuesta Correcta:** A) $\dfrac{\pi}{2}$

---

### Ejercicio 2 (Nivel 2 - Intermedio / CEPREUNSA)
**Enunciado:** Determine el rango de la función real $f(x) = 3 - 2\cos(x)$.

- A) $[1, 5]$
- B) $[-1, 5]$
- C) $[2, 5]$
- D) $[1, 3]$
- E) $[-5, -1]$

**Solución Paso a Paso:**
1. Partimos del rango fundamental de la función coseno en los números reales:
   $$-1 \le \cos(x) \le 1$$
2. Multiplicamos toda la desigualdad por $-2$ (al multiplicar por un número negativo, el sentido de las desigualdades se invierte):
   $$(-1)(-2) \ge -2\cos(x) \ge (1)(-2)$$
   $$2 \ge -2\cos(x) \ge -2 \iff -2 \le -2\cos(x) \le 2$$
3. Sumamos $3$ a todos los miembros:
   $$3 - 2 \le 3 - 2\cos(x) \le 3 + 2$$
   $$1 \le f(x) \le 5$$
4. Por tanto, el rango de la función es el intervalo cerrado:
   $$\text{Ran}(f) = [1, 5]$$
- **Respuesta Correcta:** A) $[1, 5]$

---

### Ejercicio 3 (Nivel 3 - Intermedio-Avanzado / UNSA Ordinario)
**Enunciado:** Calcule el periodo fundamental de la función $f(x) = 4\cos^2(6x) + 3\tan(2x)$.

- A) $\dfrac{\pi}{2}$
- B) $\dfrac{\pi}{6}$
- C) $\pi$
- D) $\dfrac{\pi}{4}$
- E) $\dfrac{2\pi}{3}$

**Solución Paso a Paso:**
1. Descomponemos la función en la suma de dos funciones periódicas: $f_1(x) = 4\cos^2(6x)$ y $f_2(x) = 3\tan(2x)$.
2. Calculamos el periodo de $f_1(x)$:
   - Es una función coseno elevada a una **potencia par** ($n = 2$) con coeficiente $B = 6$:
     $$T_1 = \frac{\pi}{|B|} = \frac{\pi}{6}$$
3. Calculamos el periodo de $f_2(x)$:
   - Es una función tangente con coeficiente $B = 2$:
     $$T_2 = \frac{\pi}{|B|} = \frac{\pi}{2}$$
4. El periodo de la suma es el Mínimo Común Múltiplo ($\text{MCM}$) de ambos periodos:
   $$T = \text{MCM}\left(\frac{\pi}{6}, \frac{\pi}{2}\right)$$
   Expresando con denominador común 6:
   $$\frac{\pi}{6} = \frac{1\pi}{6}, \quad \frac{\pi}{2} = \frac{3\pi}{6}$$
   $$\text{MCM}(1, 3) = 3 \implies T = \frac{3\pi}{6} = \frac{\pi}{2}$$
- **Respuesta Correcta:** A) $\dfrac{\pi}{2}$

---

### Ejercicio 4 (Nivel 4 - Avanzado / UNMSM DECO)
**Enunciado:** La concentración de oxígeno disuelto en un lago artificial de cultivo hidropónico varía periódicamente durante el día según la función:
$$C(t) = 8 + 3\sin\left(\frac{\pi t}{12} - \frac{\pi}{3}\right)$$
Donde $C(t)$ se mide en $\text{mg/L}$ y $t$ representa el tiempo en horas transcurridas desde la medianoche ($0 \le t \le 24$). Calcule la concentración máxima de oxígeno que alcanza el lago y determine la primera hora del día en que se registra dicho valor máximo.

- A) $11\text{ mg/L}$ a las 10:00 horas
- B) $11\text{ mg/L}$ a las 06:00 horas
- C) $8\text{ mg/L}$ a las 12:00 horas
- D) $11\text{ mg/L}$ a las 14:00 horas
- E) $14\text{ mg/L}$ a las 10:00 horas

**Solución Paso a Paso:**
1. **Concentración Máxima:**
   - La función seno alcanza su valor máximo cuando $\sin(\theta) = 1$.
   - Sustituimos en la regla de correspondencia:
     $$C_{\text{máx}} = 8 + 3(1) = 11\text{ mg/L}$$
2. **Determinación del Tiempo $t$ para el Máximo:**
   - La función seno alcanza $1$ por primera vez cuando su argumento es igual a $\frac{\pi}{2}$:
     $$\frac{\pi t}{12} - \frac{\pi}{3} = \frac{\pi}{2}$$
3. Dividimos toda la ecuación entre $\pi$:
   $$\frac{t}{12} - \frac{1}{3} = \frac{1}{2}$$
4. Despejamos la variable temporal $t$:
   $$\frac{t}{12} = \frac{1}{2} + \frac{1}{3} = \frac{3 + 2}{6} = \frac{5}{6}$$
   $$t = 12 \cdot \frac{5}{6} = 2 \cdot 5 = 10\text{ horas}$$
5. Por consiguiente, la concentración máxima de $11\text{ mg/L}$ se registra a las **10:00 horas** (10:00 a.m.).
- **Respuesta Correcta:** A) $11\text{ mg/L}$ a las 10:00 horas

---

### Ejercicio 5 (Nivel 5 - Boss Challenge / UNI)
**Enunciado:** Determine el dominio de la siguiente función trigonométrica real:
$$f(x) = \sqrt{\cos(2x) - \sin(2x)}$$
Para $x \in [0, \pi]$.

- A) $\left[0, \dfrac{\pi}{8}\right] \cup \left[\dfrac{5\pi}{8}, \pi\right]$
- B) $\left[\dfrac{\pi}{8}, \dfrac{5\pi}{8}\right]$
- C) $\left[0, \dfrac{\pi}{4}\right] \cup \left[\dfrac{3\pi}{4}, \pi\right]$
- D) $\left[\dfrac{\pi}{4}, \dfrac{3\pi}{4}\right]$
- E) $\left[0, \dfrac{\pi}{6}\right] \cup \left[\dfrac{5\pi}{6}, \pi\right]$

**Solución Paso a Paso:**
1. **Condición de Existencia del Radical Real:**
   El radicando debe ser mayor o igual a cero:
   $$\cos(2x) - \sin(2x) \ge 0 \iff \cos(2x) \ge \sin(2x)$$
2. **Cambio de Variable Angular:**
   Sea $\theta = 2x$.
   Como $x \in [0, \pi]$, entonces $\theta \in [0, 2\pi]$ (una vuelta completa).
   La inecuación se transforma en:
   $$\cos(\theta) \ge \sin(\theta)$$
3. **Análisis en la Circunferencia Trigonométrica (C.T.):**
   - Las curvas de seno y coseno se intersecan en $\theta = \frac{\pi}{4}$ ($45^\circ$) y $\theta = \frac{5\pi}{4}$ ($225^\circ$).
   - Evaluamos dónde el coseno es mayor o igual al seno en $[0, 2\pi]$:
     - En $\theta = 0$: $\cos(0) = 1 > \sin(0) = 0$ (Cumple).
     - De $0$ a $\frac{\pi}{4}$: $\cos(\theta) \ge \sin(\theta)$ (Cumple).
     - De $\frac{\pi}{4}$ a $\frac{5\pi}{4}$: $\sin(\theta) > \cos(\theta)$ (No cumple).
     - De $\frac{5\pi}{4}$ a $2\pi$: $\cos(\theta) \ge \sin(\theta)$ (Cumple).
   - Por tanto, para $\theta$:
     $$\theta \in \left[0, \frac{\pi}{4}\right] \cup \left[\frac{5\pi}{4}, 2\pi\right]$$
4. **Retorno a la Variable Original $x$ ($\theta = 2x$):**
   - Primer intervalo:
     $$0 \le 2x \le \frac{\pi}{4} \implies 0 \le x \le \frac{\pi}{8}$$
   - Segundo intervalo:
     $$\frac{5\pi}{4} \le 2x \le 2\pi \implies \frac{5\pi}{8} \le x \le \pi$$
5. **Dominio Final:**
   $$\text{Dom}(f) = \left[0, \frac{\pi}{8}\right] \cup \left[\frac{5\pi}{8}, \pi\right]$$
- **Respuesta Correcta:** A) $\left[0, \dfrac{\pi}{8}\right] \cup \left[\dfrac{5\pi}{8}, \pi\right]$

---

## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Función Periódica:** Función matemática que satisface $f(x + T) = f(x)$ para una constante mínima positiva $T$ llamada periodo.
2. **Amplitud ($|A|$):** Medida de la máxima desviación vertical de una función senoidal respecto a su línea media de oscilación.
3. **Periodo Fundamental ($T$):** Longitud mínima en el eje de las abscisas necesaria para que la función trace un ciclo completo.
4. **Desfase:** Desplazamiento horizontal de una onda trigonométrica hacia la izquierda o derecha en el plano cartesiano.
5. **Asíntota Vertical:** Recta vertical hacia la cual tiende la función cuando el argumento se aproxima a valores prohibidos de su dominio.
6. **Línea Media ($y = D$):** Recta horizontal equidistante de los máximos y mínimos sobre la cual oscila la función.
7. **Frecuencia:** Razón inversa del periodo ($f = 1/T$) que cuantifica los ciclos por unidad de escala.
8. **Sinusoide:** Curva geométrica continua y suave característica de las funciones seno y coseno.
9. **Monotonía:** Comportamiento estrictamente creciente o decreciente de una función en un intervalo de su dominio.
10. **Paridad:** Simetría de una función respecto al eje Y (par) o respecto al origen de coordenadas (impar).

---

## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es el dominio y rango de la función seno básica $f(x) = \sin(x)$?**
  - **A:** Dominio: $\mathbb{R}$; Rango: $[-1, 1]$.
- **Q: ¿Cuál es el periodo fundamental de la función tangente básica $f(x) = \tan(x)$?**
  - **A:** Es $T = \pi$ (media vuelta).
- **Q: ¿Cuál es el periodo de $f(x) = \cos(Bx)$ frente al de $g(x) = \cos^2(Bx)$?**
  - **A:** Para $\cos(Bx)$ es $T = \dfrac{2\pi}{|B|}$; para $\cos^2(Bx)$ (potencia par) se reduce a la mitad: $T = \dfrac{\pi}{|B|}$.
- **Q: ¿Cuáles son los puntos prohibidos del dominio de la tangente?**
  - **A:** Los múltiplos impares de $\frac{\pi}{2}$: $x \ne (2k+1)\frac{\pi}{2} \quad (k \in \mathbb{Z})$.
- **Q: ¿Cómo se calcula la amplitud de una función de la forma $y = A\sin(Bx + C) + D$?**
  - **A:** $\text{Amplitud} = |A| = \dfrac{y_{\text{máx}} - y_{\text{mín}}}{2}$.
- **Q: ¿Cuál es el rango de la función secante $f(x) = \sec(x)$?**
  - **A:** $\langle -\infty, -1] \cup [1, +\infty\rangle \iff |y| \ge 1$.

---

## 12. MOTOR DE GAMIFICACIÓN (JSON NATIVO PARA KOTLIN MULTIPLATFORM)

```json
{
  "temaId": "TRIG_10_FUNCIONES_TRIGONOMETRICAS",
  "titulo": "Funciones Trigonométricas Reales: Dominio, Rango y Transformaciones",
  "dificultad": "Avanzado",
  "xpTotal": 590,
  "skills": [
    "Dominio y Rango de Funciones Circulares",
    "Cálculo de Periodos con Potencias",
    "Amplitud, Desfase y Desplazamiento",
    "Modelación de Ondas Senoidales"
  ],
  "retos": [
    {
      "id": "reto_1",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es la amplitud de la función y = -4cos(3x - 1) + 5?",
      "opciones": ["4", "-4", "3", "5"],
      "respuestaCorrecta": "4",
      "puntos": 60,
      "explicacion": "La amplitud es el valor absoluto del coeficiente A: |-4| = 4."
    },
    {
      "id": "reto_2",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es el periodo de la función f(x) = sen²(3x)?",
      "opciones": ["π/3", "2π/3", "π/6", "π"],
      "respuestaCorrecta": "π/3",
      "puntos": 70,
      "explicacion": "Al tener potencia par n = 2, el periodo es T = π / |B| = π / 3."
    },
    {
      "id": "reto_3",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es el valor máximo de la función f(x) = 2sen(x) + 7?",
      "opciones": ["9", "7", "5", "8"],
      "respuestaCorrecta": "9",
      "puntos": 70,
      "explicacion": "y_máx = D + |A| = 7 + 2 = 9 (ocurre cuando sen x = 1)."
    },
    {
      "id": "reto_4",
      "tipo": "opcion_multiple",
      "pregunta": "¿En qué puntos tiene asíntotas verticales la función cotangente cot(x)?",
      "opciones": ["x = kπ", "x = (2k+1)π/2", "x = 2kπ", "x = kπ/2"],
      "respuestaCorrecta": "x = kπ",
      "puntos": 80,
      "explicacion": "cot(x) = cos(x)/sen(x). Se indetermina donde sen(x) = 0, es decir en x = kπ."
    },
    {
      "id": "reto_boss",
      "tipo": "boss_challenge",
      "pregunta": "Calcule el rango de la función f(x) = 4sen²(x) - 4sen(x) + 3:",
      "opciones": ["[2, 11]", "[3, 11]", "[1, 9]", "[0, 11]"],
      "respuestaCorrecta": "[2, 11]",
      "puntos": 310,
      "explicacion": "Completando cuadrados: f(x) = (2sen x - 1)² + 2. Como -1 ≤ sen x ≤ 1 -> -2 ≤ 2sen x ≤ 2 -> -3 ≤ 2sen x - 1 ≤ 1. Al elevar al cuadrado: 0 ≤ (2sen x - 1)² ≤ 9. Sumando 2: 2 ≤ f(x) ≤ 11. Ran = [2, 11]."
    }
  ]
}
```
