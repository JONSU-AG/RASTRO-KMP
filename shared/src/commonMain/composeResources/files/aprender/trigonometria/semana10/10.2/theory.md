## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
- **Rango:** \text{Ran}(f) = \langle -\infty, -1] \cup [1, +\infty\rangle \iff |y| \ge 1.
- **Periodo Fundamental:** T = 2\pi.
- **Paridad:** Función impar.
- **Asíntotas Verticales:** x = k\pi.

---

### 3.3. Transformaciones de la Onda Senoidal y Cosinoidal

Dada la función estándar modificada:
y = A \sin(Bx + C) + D \quad \text{o} \quad y = A \cos(Bx + C) + D \quad (A \ne 0, \; B \ne 0)

1. **Amplitud (|A|):** Mide la elongación máxima de la onda respecto a su eje central:
   \text{Amplitud} = |A| = \frac{y_{\text{máx}} - y_{\text{mín}}}{2}
2. **Periodo Fundamental (T):** Longitud del ciclo completo antes de repetirse:
   T = \frac{2\pi}{|B|}
   *(Para funciones tangente y cotangente: T = \frac{\pi}{|B|}).*
3. **Frecuencia (f):** Número de ciclos por unidad de longitud o tiempo:
   f = \frac{1}{T} = \frac{|B|}{2\pi}
4. **Desfase o Desplazamiento Horizontal (\phi):**
   Factorizando el argumento: B\left(x + \frac{C}{B}\right).
   \text{Desfase} = -\frac{C}{B}
   - Si -\frac{C}{B} > 0 \implies La gráfica se desplaza hacia la **DERECHA**.
   - Si -\frac{C}{B} < 0 \implies La gráfica se desplaza hacia la **IZQUIERDA**.
5. **Desplazamiento Vertical (D):**
   Desplaza toda la curva hacia arriba (D > 0) o hacia abajo (D < 0).
   - El nuevo eje medio o línea central de oscilación es la recta horizontal:
     y = D
   - **Rango de la Función Transformada:**
     \text{Ran}(f) = [D - |A|, \; D + |A|]
     y_{\text{máx}} = D + |A|, \quad y_{\text{mín}} = D - |A|

---

### 3.4. Reglas Especiales de Periodo Fundamental

#### 1. Potencias de Funciones Senoidales y Cosinoidales:
Sea f(x) = \sin^n(Bx) o f(x) = \cos^n(Bx) (n \in \mathbb{Z}^+):
- **Si n es IMPAR:**
  T = \frac{2\pi}{|B|}
- **Si n es PAR:**
  T = \frac{\pi}{|B|}
  *(La potencia par vuelve positivas las crestas negativas, duplicando la frecuencia y cortando el periodo a la mitad).*

#### 2. Funciones con Valor Absoluto:
- Para f(x) = |\sin(Bx)| o f(x) = |\cos(Bx)|:
  T = \frac{\pi}{|B|}

#### 3. Suma de Funciones Periódicas Independientes:
Si f(x) = f_1(x) + f_2(x), con periodos T_1 = \frac{a}{b} y T_2 = \frac{c}{d}:
T_{\text{total}} = \text{MCM}(T_1, T_2) = \frac{\text{MCM}(a, c)}{\text{MCD}(b, d)}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **\sec(x)** | \mathbb{R} \setminus \left\{(2k+1)\dfrac{\pi}{2}\right\} | \langle -\infty, -1] \cup [1, +\infty\rangle | 2\pi |
| **\csc(x)** | \mathbb{R} \setminus \{k\pi\} | \langle -\infty, -1] \cup [1, +\infty\rangle | 2\pi |
| **A\sin(Bx+C)+D** | \mathbb{R} | [D - \|A\|, D + \|A\|] | \dfrac{2\pi}{\|B\|} |
| **\sin^n(Bx) (n par)**| \mathbb{R} | [0, 1] | \dfrac{\pi}{\|B\|} |
| **\|\cos(Bx)\|** | \mathbb{R} | [0, 1] | \dfrac{\pi}{\|B\|} |
| **\tan^n(Bx) (\forall n)**| \text{Dom}(\tan Bx) | \mathbb{R} o [0, +\infty\rangle | \dfrac{\pi}{\|B\|} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Rango Ultrarrápido de Expresiones Cuadráticas
Para hallar el rango de y = \sin^2(x) - 4\sin(x) + 7:
- Completa cuadrados algebraicamente:
  y = (\sin x - 2)^2 - 4 + 7 = (\sin x - 2)^2 + 3
- Sabemos que -1 \le \sin(x) \le 1.
- Restamos 2: -3 \le \sin x - 2 \le -1.
- Elevamos al cuadrado (los números negativos se invierten):
  1 \le (\sin x - 2)^2 \le 9
- Sumamos 3:
  4 \le y \le 12 \implies \text{Ran} = [4, 12]
- ¡Se resuelve en 20 segundos sin derivar!

### Hack 2: Identificación Inmediata de Parámetros en Gráficos DECO
Dado un gráfico senoidal en el examen:
1. Halla la línea media: D = \frac{y_{\text{máx}} + y_{\text{mín}}}{2}.
2. Halla la amplitud: A = \frac{y_{\text{máx}} - y_{\text{mín}}}{2}.
3. Mide la distancia horizontal entre dos crestas consecutivas: esa distancia es el periodo T.
4. Despeja B con B = \frac{2\pi}{T}. ¡Tienes la regla de correspondencia completa!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de los Periodos Básicos: "TANGENTE ES MEDIA VUELTA"
- Casi todo en trigonometría tiene periodo de una vuelta completa (2\pi): seno, coseno, secante y cosecante.
- **Solo la Tangente y la Cotangente** se conforman con **media vuelta** (\pi):
  T_{\tan} = T_{\cot} = \pi

### 2. Mnemotecnia de la Paridad: "EL COSENO SE TRAGA EL MENOS"
- El **Coseno** (y su compadre la Secante) es un agujero negro que se traga el signo negativo:
  \cos(-x) = \cos(x), \quad \sec(-x) = \sec(x)
- Las otras cuatro funciones son imparables y escupen el signo negativo hacia afuera:
  \sin(-x) = -\sin(x)

### 3. Mnemotecnia del Desfase: "DENTRO MIENTE, FUERA DICE LA VERDAD"
- Dentro del paréntesis (Bx + C): Si dice +C, va a la **izquierda** (miente). Si dice -C, va a la **derecha**.
- Fuera del paréntesis (+D): Si dice +D, sube. Si dice -D, baja (dice la verdad).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Valor Absoluto en la Amplitud**
> La amplitud de y = -3\sin(2x) es **+3**, NUNCA -3. La amplitud es una distancia física de oscilación y es estrictamente positiva:
> \text{Amplitud} = |-3| = 3
> El signo menos solo indica que la onda inicia bajando en lugar de subiendo (reflexión sobre el eje X).

> [!CAUTION]
> **Trampa 2: Periodo de Potencias Pares**
> Postulantes confiados calculan el periodo de f(x) = \cos^2(4x) como \frac{2\pi}{4} = \frac{\pi}{2}.
> **ERROR:** Por ser potencia par (n = 2), la fórmula es:
> T = \frac{\pi}{|B|} = \frac{\pi}{4}
> ¡El periodo es la mitad del que tendría la función lineal!

> [!WARNING]
> **Trampa 3: Asíntotas de la Tangente**
> La tangente NO está definida en 90^\circ (\frac{\pi}{2}) ni en 270^\circ (\frac{3\pi}{2}).
> Si un problema pide el dominio de f(x) = \tan(2x), debes restringir:
> 2x \ne (2k+1)\frac{\pi}{2} \implies x \ne (2k+1)\frac{\pi}{4}

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Electrocardiogramas (ECG) y Ritmo Cardíaco:** El ciclo cardíaco normal genera ondas periódicas desfasadas P-Q-R-S-T donde la frecuencia cardíaca (f = 1/T) determina si el paciente presenta bradicardia (< 60\text{ lpm}) o taquicardia (> 100\text{ lpm}).
2. **Climatología y Ciclo Térmico en Arequipa:** La temperatura ambiental diaria en la ciudad blanca sigue un modelo senoidal: T(t) = 15 + 8\cos\left(\frac{\pi(t - 14)}{12}\right), donde 15^\circ\text{C} es la temperatura media, 8^\circ\text{C} la amplitud y el pico máximo ocurre a las 14:00 horas.
3. **Ingeniería Acústica y Tonos Puros:** Un diapasón emite un sonido puro a 440\text{ Hz} (nota La) que se describe exactamente como la función de presión de aire P(t) = P_0 \sin(2\pi \cdot 440 t).

---
