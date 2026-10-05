## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
1. **Propiedad Diferencial:** Su diferencia es un número entero exacto de vueltas:
   \alpha - \beta = 360^\circ \cdot k = 2\pi k \quad (k \in \mathbb{Z})
2. **Propiedad Trigonométrica:** Las razones trigonométricas de dos ángulos coterminales son numéricamente idénticas:
   \text{R.T.}(\alpha) = \text{R.T.}(\beta)

---

### 3.5. Reducción al Primer Cuadrante
Permite calcular las R.T. de cualquier ángulo a partir de un ángulo agudo equivalente del primer cuadrante.

#### Caso 1: Ángulos Positivos Menores a una Vuelta (0^\circ < \theta < 360^\circ)
- **Con los Ejes Horizontales (180^\circ y 360^\circ o \pi y 2\pi):** La razón trigonométrica **SE MANTIENE IGUAL**:
  \text{R.T.}(180^\circ \pm \theta) = \pm \text{R.T.}(\theta)
  \text{R.T.}(360^\circ - \theta) = \pm \text{R.T.}(\theta)
- **Con los Ejes Verticales (90^\circ y 270^\circ o \frac{\pi}{2} y \frac{3\pi}{2}):** La razón trigonométrica **CAMBIA A SU CO-RAZÓN**:
  \text{R.T.}(90^\circ \pm \theta) = \pm \text{Co-R.T.}(\theta)
  \text{R.T.}(270^\circ \pm \theta) = \pm \text{Co-R.T.}(\theta)
- **Regla del Signo (\pm):** El signo (+) o (-) depende **exclusivamente del signo que tiene la razón original en el cuadrante al que pertenece el ángulo compuesto**, considerando \theta como si fuese agudo.

#### Caso 2: Ángulos Mayores a una Vuelta (\theta > 360^\circ o \theta > 2\pi)
Se divide la medida entre 360^\circ (o 2\pi) y se descarta el cociente entero (número de vueltas), conservando únicamente el **residuo (r)**:
\theta = 360^\circ \cdot q + r \implies \text{R.T.}(\theta) = \text{R.T.}(r)

#### Caso 3: R.T. de Ángulos Negativos (Paridad de Funciones)
- El **coseno** y la **secante** eliminan el signo negativo (funciones pares):
  \cos(-\theta) = \cos(\theta), \quad \sec(-\theta) = \sec(\theta)
- Las demás cuatro razones expulsan el signo negativo hacia afuera (funciones impares):
  \sin(-\theta) = -\sin(\theta), \quad \csc(-\theta) = -\csc(\theta)
  \tan(-\theta) = -\tan(\theta), \quad \cot(-\theta) = -\cot(\theta)

---

### 3.6. Circunferencia Trigonométrica (C.T.)
Es una circunferencia con centro en el origen de coordenadas O(0, 0) y radio unitario (R = 1). Su ecuación cartesiana es:
x^2 + y^2 = 1
- **Puntos Notables:**
  - A(1, 0): Origen de arcos.
  - B(0, 1): Origen de complementos.
  - A'(-1, 0): Origen de suplementos.
  - B'(0, -1): Extremo inferior.

#### Representación de Líneas Trigonométricas:
1. **Línea Seno:** Es el segmento vertical dirigido desde el eje X hasta el punto extremo del arco en la C.T.
   - Su valor algebraico coincide exactamente con la ordenada del punto: \sin(\theta) = y.
   - Intervalo de variación: -1 \le \sin(\theta) \le 1.
2. **Línea Coseno:** Es el segmento horizontal dirigido desde el eje Y hasta el punto extremo del arco en la C.T.
   - Su valor algebraico coincide con la abscisa del punto: \cos(\theta) = x.
   - Intervalo de variación: -1 \le \cos(\theta) \le 1.
3. **Línea Tangente:** Es el segmento vertical trazado sobre la recta tangente a la C.T. en el origen de arcos A(1, 0) (recta x = 1), desde el punto A hasta la prolongación del radio vector que pasa por el extremo del arco.
   - Variación: -\infty < \tan(\theta) < +\infty.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Reducción con 90^\circ** | \text{R.T.}(90^\circ \pm \theta) = \pm \text{Co-R.T.}(\theta) | Cambia a Co-R.T. |
| **Reducción con 270^\circ**| \text{R.T.}(270^\circ \pm \theta) = \pm \text{Co-R.T.}(\theta) | Cambia a Co-R.T. |
| **Paridad Coseno / Sec** | \cos(-\theta) = \cos(\theta), \quad \sec(-\theta) = \sec(\theta) | Funciones pares |
| **Paridad Seno / Tan** | \sin(-\theta) = -\sin(\theta), \quad \tan(-\theta) = -\tan(\theta) | Funciones impares |
| **Ecuación de la C.T.** | x^2 + y^2 = 1 | R = 1, Centro (0,0) |
| **Extensión Seno / Coseno**| -1 \le \sin(\theta) \le 1, \quad -1 \le \cos(\theta) \le 1 | En todo \mathbb{R} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Elección Estratégica del Eje en Reducción
Al reducir al primer cuadrante, siempre que tengas la libertad de elegir entre el eje horizontal o vertical, **ELIGE SIEMPRE EL EJE HORIZONTAL (180^\circ o 360^\circ)**.
- ¿Por qué? Porque la función no cambia a su co-razón, reduciendo el riesgo de equivocarse en un 50\%.
- Ejemplo: Para 120^\circ, usa 180^\circ - 60^\circ \implies \sin(180^\circ - 60^\circ) = +\sin(60^\circ). Evita usar 90^\circ + 30^\circ.

### Hack 2: Reducción Rápida de Múltiplos de \pi en Radianes
Cuando tengas ángulos en radianes con coeficientes grandes:
1. **Si el coeficiente de \pi es un entero PAR (2k\pi):** Equivale a 0^\circ (múltiplo exacto de vueltas).
   \sin(2026\pi + x) = \sin(0 + x) = \sin(x)
2. **Si el coeficiente de \pi es un entero IMPAR ((2k+1)\pi):** Equivale exactamente a \pi (180^\circ).
   \cos(2027\pi - x) = \cos(\pi - x) = -\cos(x)
3. **Fracciones de \frac{\pi}{2}:** Divide el numerador entre 4 (el cuádruple del denominador). El residuo indica la posición en el cuadrante (1 \to 90^\circ, 2 \to 180^\circ, 3 \to 270^\circ, 0 \to 360^\circ).

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de Signos en Cuadrantes: "TODAS - SE - SIENTEN - CÓMODAS"
- **I C:** **TODAS** son positivas.
- **II C:** **SE**no (y su recíproca cosecante) son positivas.
- **III C:** **SIENTEN** \to **TA**ngente (y su recíproca cotangente) son positivas.
- **IV C:** **CÓMODAS** \to **CO**seno (y su recíproca secante) son positivas.

### 2. Mnemotecnia de Ángulos Cuadrantales: "O-I-O-N-O-N" y "I-O-N-O-N-I"
Para los ángulos ordenados 0^\circ, 90^\circ, 180^\circ, 270^\circ, 360^\circ:
- **Para Seno, Tangente y Secante:**
  \textbf{O - I - O - N - O - N}
  Donde **O** = Cero (0), **I** = Uno (1), **N** = No definido (\text{ND}). (Ajustando signos negativos en 180^\circ y 270^\circ).
- **Para Coseno, Cotangente y Cosecante:**
  \textbf{I - O - N - O - N - I}

### 3. Mnemotecnia de Reducción: "HORIZONTAL NO CAMBIA, VERTICAL CO-CAMBIA"
- Si usas la línea **horizontal** (180^\circ o 360^\circ): **NO CAMBIA** la función.
- Si usas la línea **vertical** (90^\circ o 270^\circ): **CO-CAMBIA** a su co-función (seno \to coseno, tangente \to cotangente).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo del Radio Vector**
> El radio vector r = \sqrt{x^2 + y^2} es una distancia geométrica euclidiana y **SIEMPRE ES POSITIVO (r > 0)**.
> Nunca pongas r = -5 aunque el punto esté en el tercer cuadrante (-3, -4). Las coordenadas x e y son las que llevan los signos negativos, jamás el radio vector.

> [!CAUTION]
> **Trampa 2: El Signo en la Reducción se mira en la Función ORIGINAL**
> Si vas a reducir \cos(90^\circ + \theta):
> Como 90^\circ + \theta \in \text{II C}, el **coseno original es negativo** en el II C. Por tanto:
> \cos(90^\circ + \theta) = -\sin(\theta)
> ¡Muchos postulantes miran el seno resultante (que es positivo en el II C) y le ponen signo más erróneamente! El signo depende siempre de la función de la izquierda.

> [!WARNING]
> **Trampa 3: Los Cuadrantales no tienen Signo Negativo en el Cero**
> En los ángulos cuadrantales, 0 no tiene signo. Expresiones como -0 deben simplificarse a 0. Además, los valores \text{ND} (no definidos) invalidan cualquier ecuación o denominador donde aparezcan.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Ingeniería Eléctrica y Corriente Alterna:** El voltaje y la corriente en redes eléctricas trifásicas se modelan como fasores rotatorios en posición normal: v(t) = V_{\text{máx}}\cos(\omega t + \phi). La proyección en el eje vertical representa el valor instantáneo senoidal.
2. **Robótica y Cinemática Inversa:** Los brazos articulados de robots industriales calculan la posición del actuador final (x, y) a partir de ángulos articulares sucesivos en posición normal mediante matrices de rotación trigonométrica.
3. **Sistemas de Radar y Sonar Marítimo:** El haz de barrido de una antena de radar rota 360^\circ en sentido horario/antihorario barriendo los cuatro cuadrantes para detectar blancos mediante coordenadas polares (r, \theta).

---
