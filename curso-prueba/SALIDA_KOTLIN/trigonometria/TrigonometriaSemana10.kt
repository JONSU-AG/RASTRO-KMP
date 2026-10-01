package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana10 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t10_s01",
            title = "FUNCIONES TRIGONOMÉTRICAS REALES: DOMINIO, RANGO, GRÁFICAS Y TRANSFORMACIONES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "FUNCIONES TRIGONOMÉTRICAS REALES: DOMINIO, RANGO, GRÁFICAS Y TRANSFORMACIONES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t10_s01_c01",
                    question = "**Enunciado:** Calcule el periodo fundamental de la función trigonométrica f(x) = 5\\sin(4x - \\pi) + 2.",
                    options = listOf(
                        "\\dfrac{\\pi}{2}",
                        "\\pi",
                        "2\\pi",
                        "\\dfrac{\\pi}{4}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t10_s01_c02",
                    question = "**Enunciado:** Determine el rango de la función real f(x) = 3 - 2\\cos(x).",
                    options = listOf(
                        "[1, 5]",
                        "[-1, 5]",
                        "[2, 5]",
                        "[1, 3]"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t10_s01_c03",
                    question = "**Enunciado:** Calcule el periodo fundamental de la función f(x) = 4\\cos^2(6x) + 3\\tan(2x).",
                    options = listOf(
                        "\\dfrac{\\pi}{2}",
                        "\\dfrac{\\pi}{6}",
                        "\\pi",
                        "\\dfrac{\\pi}{4}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t10_s01_c04",
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
                    id = "trig_t10_s01_c05",
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
                    id = "trig_t10_s01_c06",
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
                    id = "trig_t10_s01_c07",
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
                    id = "trig_t10_s01_c08",
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
                    id = "trig_t10_s01_c09",
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
                    id = "trig_t10_s01_c10",
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
            id = "trig_t10_s02",
            title = "FUNCIONES TRIGONOMÉTRICAS REALES: DOMINIO, RANGO, GRÁFICAS Y TRANSFORMACIONES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "FUNCIONES TRIGONOMÉTRICAS REALES: DOMINIO, RANGO, GRÁFICAS Y TRANSFORMACIONES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t10_s02_c01",
                    question = "**Enunciado:** La concentración de oxígeno disuelto en un lago artificial de cultivo hidropónico varía periódicamente durante el día según la función:",
                    options = listOf(
                        "11\\text{ mg/L} a las 10:00 horas",
                        "11\\text{ mg/L} a las 06:00 horas",
                        "8\\text{ mg/L} a las 12:00 horas",
                        "11\\text{ mg/L} a las 14:00 horas"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t10_s02_c02",
                    question = "**Enunciado:** Determine el dominio de la siguiente función trigonométrica real:",
                    options = listOf(
                        "\\left[0, \\dfrac{\\pi}{8}\\right] \\cup \\left[\\dfrac{5\\pi}{8}, \\pi\\right]",
                        "\\left[\\dfrac{\\pi}{8}, \\dfrac{5\\pi}{8}\\right]",
                        "\\left[0, \\dfrac{\\pi}{4}\\right] \\cup \\left[\\dfrac{3\\pi}{4}, \\pi\\right]",
                        "\\left[\\dfrac{\\pi}{4}, \\dfrac{3\\pi}{4}\\right]"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t10_s02_c03",
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
                    id = "trig_t10_s02_c04",
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
                    id = "trig_t10_s02_c05",
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
                    id = "trig_t10_s02_c06",
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
                    id = "trig_t10_s02_c07",
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
                    id = "trig_t10_s02_c08",
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
                    id = "trig_t10_s02_c09",
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
                    id = "trig_t10_s02_c10",
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
