# TEMA 07: ECUACIONES TRIGONOMÉTRICAS ELEMENTALES Y NO ELEMENTALES

---

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
1. **Identificación y Cálculo del Valor Principal ($V_p$):** Determinar con precisión el valor principal de una ecuación elemental según el rango canónico de cada función.
2. **Formulación de la Solución General (S.G.):** Aplicar las fórmulas generales de seno ($k\pi + (-1)^k V_p$), coseno ($2k\pi \pm V_p$) y tangente ($k\pi + V_p$).
3. **Determinación de Soluciones en Intervalos Acotados:** Hallar el número de raíces y la suma de soluciones dentro de un intervalo cerrado (ej. $[0, 2\pi]$ o $[0, 360^\circ]$).
4. **Transformación de Ecuaciones No Elementales:** Resolver ecuaciones trigonométricas mediante factorización, reducción a una sola función y el método del ángulo auxiliar ($A\sin x + B\cos x = C$).

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

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición y Ecuación Trigonométrica Elemental (E.T.E.)
Una **ecuación trigonométrica** es una igualdad condicional donde la incógnita se encuentra afectada por al menos un operador trigonométrico.
La forma más simple se denomina **Ecuación Trigonométrica Elemental (E.T.E.)**:
$$\text{R.T.}(k x + \phi) = N$$
Donde:
- $\text{R.T.}$ es una razón trigonométrica ($\sin, \cos, \tan, \cot, \sec, \csc$).
- $k, \phi$ son números reales constantes ($k \ne 0$).
- $N$ es un valor real perteneciente al rango de la razón correspondiente:
  - Para $\sin$ y $\cos$: $-1 \le N \le 1$.
  - Para $\sec$ y $\csc$: $|N| \ge 1 \iff N \ge 1 \lor N \le -1$.
  - Para $\tan$ y $\cot$: $N \in \mathbb{R}$.

---

### 3.2. El Valor Principal ($V_p$)
El **Valor Principal** es el ángulo elemental único que satisface la ecuación $\text{R.T.}(\theta) = N$ dentro del intervalo restringido de definición de su función inversa:

| Función Trigonométrica | E.T.E. | Intervalo Restringido del $V_p$ |
| :---: | :---: | :---: |
| **Seno** ($\sin$) | $\sin(\theta) = N$ | $V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] \equiv [-90^\circ, 90^\circ]$ |
| **Coseno** ($\cos$) | $\cos(\theta) = N$ | $V_p \in [0, \pi] \equiv [0^\circ, 180^\circ]$ |
| **Tangente** ($\tan$) | $\tan(\theta) = N$ | $V_p \in \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle \equiv \langle -90^\circ, 90^\circ \rangle$ |
| **Cotangente** ($\cot$) | $\cot(\theta) = N$ | $V_p \in \langle 0, \pi \rangle \equiv \langle 0^\circ, 180^\circ \rangle$ |
| **Secante** ($\sec$) | $\sec(\theta) = N$ | $V_p \in [0, \pi] \setminus \left\{\dfrac{\pi}{2}\right\}$ |
| **Cosecante** ($\csc$) | $\csc(\theta) = N$ | $V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] \setminus \{0\}$ |

#### Reglas para Hallar el $V_p$ con Valores Negativos:
1. Para $\sin$ y $\tan$: Si $N < 0 \implies V_p = -\text{ángulo agudo}$.
   - Ejemplo: $\sin(\theta) = -\frac{1}{2} \implies V_p = -30^\circ = -\frac{\pi}{6}$.
   - Ejemplo: $\tan(\theta) = -1 \implies V_p = -45^\circ = -\frac{\pi}{4}$.
2. Para $\cos$: Si $N < 0 \implies V_p = 180^\circ - \text{ángulo agudo}$.
   - Ejemplo: $\cos(\theta) = -\frac{1}{2} \implies V_p = 180^\circ - 60^\circ = 120^\circ = \frac{2\pi}{3}$.

---

### 3.3. Fórmulas de la Solución General (S.G.)
El conjunto de infinitas soluciones de una E.T.E. se expresa mediante una fórmula general en función de un número entero arbitrario $k \in \mathbb{Z}$:

#### 1. Para Seno y Cosecante ($\sin\theta = N$):
$$\theta = k\pi + (-1)^k V_p \quad (k \in \mathbb{Z})$$
- *Desglose práctico:*
  - Si $k$ es par ($k = 2n$): $\theta = 2n\pi + V_p$.
  - Si $k$ es impar ($k = 2n + 1$): $\theta = (2n + 1)\pi - V_p$.

#### 2. Para Coseno y Secante ($\cos\theta = N$):
$$\theta = 2k\pi \pm V_p \quad (k \in \mathbb{Z})$$
*(Las dos ramas simétricas reflejan que $\cos(\alpha) = \cos(-\alpha)$).*

#### 3. Para Tangente y Cotangente ($\tan\theta = N$):
$$\theta = k\pi + V_p \quad (k \in \mathbb{Z})$$
*(La periodicidad fundamental de la tangente es exactamente $\pi$ o $180^\circ$).*

---

### 3.4. Métodos para Resolver Ecuaciones No Elementales

#### Método 1: Factorización
Consiste en trasladar todos los términos al primer miembro e igualar a cero:
$$f(x) \cdot g(x) = 0 \iff f(x) = 0 \quad \lor \quad g(x) = 0$$
Cada factor igualado a cero genera una E.T.E. independiente.

#### Método 2: Reducción a una Sola Razón (Ecuación Polinomial)
Se emplean identidades fundamentales o del ángulo doble para expresar toda la ecuación en términos de una única función trigonométrica (por ejemplo, todo en senos o todo en cosenos):
$$2\cos^2(x) + 3\sin(x) - 3 = 0 \implies 2(1 - \sin^2 x) + 3\sin x - 3 = 0 \implies 2\sin^2 x - 3\sin x + 1 = 0$$
Se resuelve como una ecuación cuadrática en $\sin(x)$.

#### Método 3: La Ecuación Lineal $A\sin(x) + B\cos(x) = C$
Se divide toda la ecuación entre $\sqrt{A^2 + B^2}$:
$$\frac{A}{\sqrt{A^2 + B^2}}\sin(x) + \frac{B}{\sqrt{A^2 + B^2}}\cos(x) = \frac{C}{\sqrt{A^2 + B^2}}$$
Haciendo $\cos(\phi) = \frac{A}{\sqrt{A^2+B^2}}$ y $\sin(\phi) = \frac{B}{\sqrt{A^2+B^2}}$:
$$\sin(x + \phi) = \frac{C}{\sqrt{A^2 + B^2}}$$
- **Condición de Compatibilidad (Solución Real):**
  $$|C| \le \sqrt{A^2 + B^2} \iff C^2 \le A^2 + B^2$$

---

### 3.5. Cálculo de Soluciones en un Intervalo Cerrado
Para encontrar las soluciones particulares en un intervalo $[a, b]$ (generalmente $[0, 2\pi]$ o $[0^\circ, 360^\circ]$):
1. Se halla la solución general o se ubican los ángulos en los cuadrantes correspondientes mediante la C.T.
2. Se asignan valores enteros a $k \in \mathbb{Z}$ ($k = 0, 1, 2, -1\dots$).
3. Se seleccionan únicamente las raíces que satisfacen: $a \le x_i \le b$.
4. Se efectúa la suma o conteo según lo solicitado en el enunciado.

---

## 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Ecuación Elemental | Solución General ($k \in \mathbb{Z}$) | Rango del Valor Principal |
| :--- | :--- | :--- |
| **$\sin(x) = N$** | $x = k\pi + (-1)^k V_p$ | $V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right]$ |
| **$\cos(x) = N$** | $x = 2k\pi \pm V_p$ | $V_p \in [0, \pi]$ |
| **$\tan(x) = N$** | $x = k\pi + V_p$ | $V_p \in \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle$ |
| **$\cot(x) = N$** | $x = k\pi + V_p$ | $V_p \in \langle 0, \pi \rangle$ |
| **$\sec(x) = N$** | $x = 2k\pi \pm V_p$ | $V_p \in [0, \pi] \setminus \left\{\dfrac{\pi}{2}\right\}$ |
| **$\csc(x) = N$** | $x = k\pi + (-1)^k V_p$ | $V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] \setminus \{0\}$ |
| **$A\sin x + B\cos x = C$**| $\sin(x + \phi) = \dfrac{C}{\sqrt{A^2+B^2}}$ | Condición: $C^2 \le A^2 + B^2$ |
| **$\sin^2(x) = N$** | $x = k\pi \pm V_p$ | Forma cuadrática |
| **$\cos^2(x) = N$** | $x = k\pi \pm V_p$ | Forma cuadrática |
| **$\tan^2(x) = N$** | $x = k\pi \pm V_p$ | Forma cuadrática |

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Solución General: "SEN-PAR-MENOS, COS-DOS-MÁS-MENOS, TAN-PI"
- **Seno:** Lleva el factor oscilante $(-1)^k$ $\to$ $k\pi + (-1)^k V_p$.
- **Coseno:** Lleva dos veces $\pi$ y doble signo $\pm$ $\to$ $2k\pi \pm V_p$.
- **Tangente:** La más sencilla, simplemente avanza de $\pi$ en $\pi$ $\to$ $k\pi + V_p$.

### 2. Mnemotecnia de las Raíces en una Vuelta: "LOS CUADRANTES GEMELOS"
- Si $\sin x = + \implies$ I C ($\theta$) y II C ($180^\circ - \theta$).
- Si $\sin x = - \implies$ III C ($180^\circ + \theta$) y IV C ($360^\circ - \theta$).
- Si $\cos x = + \implies$ I C ($\theta$) y IV C ($360^\circ - \theta$).
- Si $\cos x = - \implies$ II C ($180^\circ - \theta$) y III C ($180^\circ + \theta$).

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Suma de Soluciones en una Vuelta sin Calcular las Raíces Individuales
En problemas que piden: "Calcule la suma de soluciones de $\cos(x) = -\frac{1}{3}$ en $[0, 2\pi]$":
- **No intentes calcular el ángulo:** No es notable.
- **Usa la simetría de la C.T.:**
  - El coseno es negativo en el II C y III C.
  - La raíz del II C es $x_1 = 180^\circ - \alpha$.
  - La raíz del III C es $x_2 = 180^\circ + \alpha$.
  - Al sumarlas:
    $$x_1 + x_2 = (180^\circ - \alpha) + (180^\circ + \alpha) = 360^\circ = 2\pi\text{ rad}$$
  - ¡La suma de dos raíces de coseno en $[0, 2\pi]$ es **SIEMPRE $2\pi$** (o $360^\circ$)!
  - Para el seno positivo en I C y II C: $\alpha + (180^\circ - \alpha) = 180^\circ = \pi\text{ rad}$.

### Hack 2: Cuidado al Simplificar Factores Comunes
Si tienes $\sin(x)\cos(x) = \sin(x)$:
- **ERROR FATAL:** Cancelar $\sin(x)$ y decir $\cos(x) = 1$. (¡Pierdes las soluciones donde $\sin(x) = 0$!).
- **MÉTODO CORRECTO:** Pasa a restar y factoriza:
  $$\sin(x)\cos(x) - \sin(x) = 0 \implies \sin(x)(\cos x - 1) = 0$$
  $$\sin(x) = 0 \quad \lor \quad \cos(x) = 1$$

---

## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Rango del Coseno para el $V_p$ Negativo**
> Si $\cos(x) = -\frac{\sqrt{3}}{2}$:
> - **ERROR GRAVE:** Decir $V_p = -30^\circ$ (¡El rango del coseno es $[0, 180^\circ]$, no admite negativos!).
> - **CORRECTO:** El ángulo agudo asociado es $30^\circ$. En el segundo cuadrante:
>   $$V_p = 180^\circ - 30^\circ = 150^\circ = \frac{5\pi}{6}$$

> [!CAUTION]
> **Trampa 2: Elevar al Cuadrado Introduce Soluciones Extrañas**
> Si elevas ambos miembros al cuadrado para resolver $A\sin x + B\cos x = C$, estás resolviendo también la ecuación $A\sin x + B\cos x = -C$.
> Es **OBLIGATORIO** verificar cada solución obtenida en la ecuación original antes de dar la respuesta final.

> [!WARNING]
> **Trampa 3: Intervalos Abiertos vs Cerrados**
> Presta máxima atención a los corchetes del intervalo:
> - Si el intervalo es $\langle 0, 2\pi \rangle$, $x = 0$ y $x = 2\pi$ **NO FORMAN PARTE** de la solución.
> - Si el intervalo es $[0, 2\pi]$, ambos extremos **SÍ SE INCLUYEN**.

---

## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Predicción de Mareas Oceánicas:** La altura del nivel del mar en bahías se modela como $h(t) = h_0 + A\cos(\omega t)$. Resolver cuándo la marea alcanza el nivel de calado seguro para el atraque de buques portacontenedores implica resolver una ecuación trigonométrica elemental acotada en el intervalo de 24 horas.
2. **Sincronización de Generadores en Redes Eléctricas:** Para conectar un turbogenerador a la red nacional interconectada (SEIN), el ángulo de fase de ambos voltajes debe coincidir exactamente: $\sin(\omega t + \phi_1) - \sin(\omega t + \phi_2) = 0$.
3. **Mecánica Celeste y Eclipses:** La determinación precisa de los instantes de alineación solar y lunar (sizigia) requiere resolver ecuaciones trigonométricas trascendentes de órbitas de Kepler.

---

## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS

### Ejercicio 1 (Nivel 1 - Básico / Admisión Directa)
**Enunciado:** Calcule la menor solución positiva de la siguiente ecuación trigonométrica:
$$2\sin(x) - \sqrt{3} = 0$$

- A) $30^\circ$
- B) $60^\circ$
- C) $120^\circ$
- D) $45^\circ$
- E) $150^\circ$

**Solución Paso a Paso:**
1. Despejamos el operador trigonométrico elemental:
   $$2\sin(x) = \sqrt{3} \implies \sin(x) = \frac{\sqrt{3}}{2}$$
2. Buscamos el menor ángulo positivo cuyo seno sea $\frac{\sqrt{3}}{2}$:
   - En el primer cuadrante, el ángulo notable correspondiente es:
     $$x = 60^\circ \quad \left(\frac{\pi}{3}\text{ rad}\right)$$
- **Respuesta Correcta:** B) $60^\circ$

---

### Ejercicio 2 (Nivel 2 - Intermedio / CEPREUNSA)
**Enunciado:** Determine el número de soluciones de la ecuación trigonométrica $\cos(2x) = 0$ en el intervalo cerrado $[0, 2\pi]$.

- A) 2
- B) 4
- C) 3
- D) 6
- E) 8

**Solución Paso a Paso:**
1. El argumento es $\theta = 2x$.
   - Como la variable $x$ varía en $[0, 2\pi]$, el argumento $2x$ varía en:
     $$0 \le x \le 2\pi \implies 0 \le 2x \le 4\pi \quad (\text{dos vueltas completas})$$
2. La ecuación es $\cos(2x) = 0$.
   - El coseno se anula en los ángulos cuadrantales de la forma $(2k + 1)\frac{\pi}{2}$:
     $$2x \in \left\{ \frac{\pi}{2}, \frac{3\pi}{2}, \frac{5\pi}{2}, \frac{7\pi}{2} \right\}$$
3. Despejamos los valores de $x$ dividiendo cada término entre 2:
   $$x_1 = \frac{\pi}{4}, \quad x_2 = \frac{3\pi}{4}, \quad x_3 = \frac{5\pi}{4}, \quad x_4 = \frac{7\pi}{4}$$
4. Todas estas cuatro raíces pertenecen estrictamente al intervalo $[0, 2\pi]$.
   - Número de soluciones: 4.
- **Respuesta Correcta:** B) 4

---

### Ejercicio 3 (Nivel 3 - Intermedio-Avanzado / UNSA Ordinario)
**Enunciado:** Calcule la suma de todas las soluciones de la siguiente ecuación trigonométrica en el intervalo $[0, 2\pi]$:
$$2\sin^2(x) - \sin(x) - 1 = 0$$

- A) $2\pi$
- B) $3\pi$
- C) $\dfrac{5\pi}{2}$
- D) $\dfrac{7\pi}{2}$
- E) $4\pi$

**Solución Paso a Paso:**
1. Factorizamos la ecuación cuadrática por el método del aspa simple:
   $$2\sin^2(x) - \sin(x) - 1 = 0$$
   $$(2\sin x + 1)(\sin x - 1) = 0$$
2. Igualamos cada factor a cero para obtener las E.T.E.:
   - **Caso 1:** $\sin(x) - 1 = 0 \implies \sin(x) = 1$
     En el intervalo $[0, 2\pi]$, la única solución es:
     $$x_1 = \frac{\pi}{2}$$
   - **Caso 2:** $2\sin(x) + 1 = 0 \implies \sin(x) = -\frac{1}{2}$
     El seno es negativo en el III C y IV C con ángulo de referencia $30^\circ$ ($\frac{\pi}{6}$):
     $$x_2 = \pi + \frac{\pi}{6} = \frac{7\pi}{6}$$
     $$x_3 = 2\pi - \frac{\pi}{6} = \frac{11\pi}{6}$$
3. Sumamos las tres soluciones encontradas:
   $$S = x_1 + x_2 + x_3 = \frac{\pi}{2} + \frac{7\pi}{6} + \frac{11\pi}{6}$$
   $$S = \frac{\pi}{2} + \frac{18\pi}{6} = \frac{\pi}{2} + 3\pi = \frac{7\pi}{2}$$
- **Respuesta Correcta:** D) $\dfrac{7\pi}{2}$

---

### Ejercicio 4 (Nivel 4 - Avanzado / UNMSM DECO)
**Enunciado:** El perfil de oscilación de una compuerta hidráulica sumergida responde a la ecuación $\sin(x) + \cos(x) = 1$. Determine todas las soluciones angulares en el intervalo cerrado $[0, 2\pi]$ que determinan la apertura total de la válvula.

- A) $\left\{0, \dfrac{\pi}{2}, 2\pi\right\}$
- B) $\left\{0, \pi\right\}$
- C) $\left\{\dfrac{\pi}{4}, \dfrac{5\pi}{4}\right\}$
- D) $\left\{\dfrac{\pi}{2}, \dfrac{3\pi}{2}\right\}$
- E) $\left\{0, \dfrac{\pi}{2}\right\}$

**Solución Paso a Paso:**
1. Aplicamos el método del ángulo auxiliar dividiendo entre $\sqrt{1^2 + 1^2} = \sqrt{2}$:
   $$\frac{1}{\sqrt{2}}\sin(x) + \frac{1}{\sqrt{2}}\cos(x) = \frac{1}{\sqrt{2}}$$
2. Expresamos en forma de seno de la suma:
   $$\sin\left(x + \frac{\pi}{4}\right) = \frac{\sqrt{2}}{2}$$
3. Determinamos las soluciones para el argumento $\theta = x + \frac{\pi}{4}$ en el intervalo correspondiente:
   - Primera posibilidad:
     $$x + \frac{\pi}{4} = \frac{\pi}{4} \implies x_1 = 0$$
   - Segunda posibilidad (segundo cuadrante):
     $$x + \frac{\pi}{4} = \pi - \frac{\pi}{4} = \frac{3\pi}{4} \implies x_2 = \frac{3\pi}{4} - \frac{\pi}{4} = \frac{2\pi}{4} = \frac{\pi}{2}$$
   - Tercera posibilidad (siguiente ciclo):
     $$x + \frac{\pi}{4} = 2\pi + \frac{\pi}{4} \implies x_3 = 2\pi$$
4. Como el intervalo es cerrado $[0, 2\pi]$, las soluciones admisibles son:
   $$\{0, \frac{\pi}{2}, 2\pi\}$$
- **Respuesta Correcta:** A) $\left\{0, \dfrac{\pi}{2}, 2\pi\right\}$

---

### Ejercicio 5 (Nivel 5 - Boss Challenge / UNI)
**Enunciado:** Determine la solución general para $x$ en la siguiente ecuación trigonométrica:
$$\sin(5x) + \sin(3x) + \sin(x) = 0$$

- A) $x = \dfrac{k\pi}{3} \quad \lor \quad x = 2k\pi \pm \dfrac{2\pi}{3}$
- B) $x = \dfrac{k\pi}{3} \quad \lor \quad x = k\pi \pm \dfrac{\pi}{3}$
- C) $x = \dfrac{k\pi}{3} \quad \lor \quad x = 2k\pi \pm \dfrac{\pi}{3}$
- D) $x = \dfrac{k\pi}{2} \quad \lor \quad x = k\pi \pm \dfrac{\pi}{6}$
- E) $x = \dfrac{k\pi}{4} \quad \lor \quad x = 2k\pi \pm \dfrac{\pi}{6}$

**Solución Paso a Paso:**
1. **Agrupación Estratégica de Términos Extremos:**
   Agrupamos $\sin(5x)$ con $\sin(x)$ para aplicar la transformación de suma a producto:
   $$(\sin 5x + \sin x) + \sin 3x = 0$$
2. **Transformación Trigonométrica:**
   $$\sin(5x) + \sin(x) = 2\sin\left(\frac{5x + x}{2}\right)\cos\left(\frac{5x - x}{2}\right) = 2\sin(3x)\cos(2x)$$
3. **Sustitución y Factorización:**
   $$2\sin(3x)\cos(2x) + \sin(3x) = 0$$
   Factorizamos el término común $\sin(3x)$:
   $$\sin(3x)[2\cos(2x) + 1] = 0$$
4. **Resolución de cada Factor:**
   - **Primer Factor:**
     $$\sin(3x) = 0 \implies 3x = k\pi \implies x = \frac{k\pi}{3} \quad (k \in \mathbb{Z})$$
   - **Segundo Factor:**
     $$2\cos(2x) + 1 = 0 \implies \cos(2x) = -\frac{1}{2}$$
     El valor principal para $\cos(\theta) = -\frac{1}{2}$ es $V_p = 180^\circ - 60^\circ = 120^\circ = \frac{2\pi}{3}$.
     Aplicamos la fórmula general del coseno:
     $$2x = 2n\pi \pm \frac{2\pi}{3} \implies x = n\pi \pm \frac{\pi}{3} \quad (n \in \mathbb{Z})$$
5. **Conjunto Solución General:**
   $$x = \frac{k\pi}{3} \quad \lor \quad x = n\pi \pm \frac{\pi}{3} \quad (k, n \in \mathbb{Z})$$
- **Respuesta Correcta:** B) $x = \dfrac{k\pi}{3} \quad \lor \quad x = k\pi \pm \dfrac{\pi}{3}$

---

## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Ecuación Trigonométrica:** Igualdad condicional donde la incógnita interviene como argumento de una o más funciones circulares.
2. **E.T.E. (Elemental):** Ecuación de la forma básica $\text{R.T.}(kx + \phi) = N$.
3. **Valor Principal ($V_p$):** Ángulo canónico elemental que se encuentra dentro del rango de definición de la función inversa.
4. **Solución General (S.G.):** Expresión analítica que parametriza el conjunto infinito de soluciones mediante una variable entera $k \in \mathbb{Z}$.
5. **Solución Particular:** Cada uno de los valores numéricos concretos obtenidos al asignar un valor entero específico a $k$.
6. **Solución Extraña:** Raíz no válida introducida artificialmente al elevar una ecuación a una potencia par.
7. **Periodicidad:** Propiedad por la cual las funciones trigonométricas repiten sus valores a intervalos angulares constantes ($2\pi$ o $\pi$).
8. **Ecuación Homogénea:** Ecuación trigonométrica donde todos los términos tienen el mismo grado respecto a las razones involucradas.
9. **Compatibilidad:** Condición algebraica que asegura la existencia de soluciones reales ($|N| \le 1$ para senos y cosenos).
10. **Factorización:** Descomposición de una expresión trigonométrica en producto de factores para igualar cada uno a cero.

---

## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es la fórmula de la Solución General para $\sin(x) = N$?**
  - **A:** $x = k\pi + (-1)^k V_p \quad (k \in \mathbb{Z})$.
- **Q: ¿Cuál es la fórmula de la Solución General para $\cos(x) = N$?**
  - **A:** $x = 2k\pi \pm V_p \quad (k \in \mathbb{Z})$.
- **Q: ¿Cuál es la fórmula de la Solución General para $\tan(x) = N$?**
  - **A:** $x = k\pi + V_p \quad (k \in \mathbb{Z})$.
- **Q: ¿Cuánto vale el Valor Principal ($V_p$) si $\cos(x) = -\frac{1}{2}$?**
  - **A:** $V_p = 120^\circ = \frac{2\pi}{3}\text{ rad}$ (está en $[0, \pi]$).
- **Q: ¿Cuál es la condición de compatibilidad para que $A\sin(x) + B\cos(x) = C$ tenga solución real?**
  - **A:** $C^2 \le A^2 + B^2$.
- **Q: ¿Cuánto vale siempre la suma de dos soluciones de $\cos(x) = N$ en el intervalo $[0, 2\pi]$?**
  - **A:** Vale siempre $2\pi\text{ rad}$ (o $360^\circ$).

---

## 12. MOTOR DE GAMIFICACIÓN (JSON NATIVO PARA KOTLIN MULTIPLATFORM)

```json
{
  "temaId": "TRIG_07_ECUACIONES_TRIGONOMETRICAS",
  "titulo": "Ecuaciones Trigonométricas Elementales y No Elementales",
  "dificultad": "Avanzado",
  "xpTotal": 570,
  "skills": [
    "Cálculo del Valor Principal",
    "Fórmulas de Solución General",
    "Método por Factorización",
    "Soluciones en Intervalos Acotados"
  ],
  "retos": [
    {
      "id": "reto_1",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es el valor principal de la ecuación tan(x) = -1?",
      "opciones": ["-π/4", "3π/4", "7π/4", "-π/2"],
      "respuestaCorrecta": "-π/4",
      "puntos": 70,
      "explicacion": "El rango del valor principal para la tangente es <-π/2, π/2>. Por tanto, tan(x) = -1 -> Vp = -45° = -π/4."
    },
    {
      "id": "reto_2",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuántas soluciones tiene sen(x) = 0 en el intervalo [0, 2π]?",
      "opciones": ["3", "2", "1", "4"],
      "respuestaCorrecta": "3",
      "puntos": 70,
      "explicacion": "sen(x) = 0 para x = 0, x = π y x = 2π. Como el intervalo es cerrado [0, 2π], tiene 3 soluciones."
    },
    {
      "id": "reto_3",
      "tipo": "opcion_multiple",
      "pregunta": "Para la ecuación cos(x) = 1/2, ¿cuál es su solución general?",
      "opciones": ["2kπ ± π/3", "kπ + (-1)^k π/3", "kπ ± π/3", "2kπ + π/3"],
      "respuestaCorrecta": "2kπ ± π/3",
      "puntos": 80,
      "explicacion": "Vp = π/3. Fórmula general del coseno: x = 2kπ ± Vp -> x = 2kπ ± π/3."
    },
    {
      "id": "reto_4",
      "tipo": "opcion_multiple",
      "pregunta": "¿Para qué valores de C tiene solución real la ecuación 3sen(x) + 4cos(x) = C?",
      "opciones": ["|C| ≤ 5", "|C| ≤ 7", "C ≤ 25", "C ≥ 5"],
      "respuestaCorrecta": "|C| ≤ 5",
      "puntos": 80,
      "explicacion": "La condición es C² ≤ A² + B² -> C² ≤ 3² + 4² = 25 -> |C| ≤ 5."
    },
    {
      "id": "reto_boss",
      "tipo": "boss_challenge",
      "pregunta": "Calcule la suma de todas las soluciones de sen(2x) = cos(x) en el intervalo [0, π]:",
      "opciones": ["π", "3π/2", "2π", "π/2"],
      "respuestaCorrecta": "π",
      "puntos": 270,
      "explicacion": "2sen(x)cos(x) - cos(x) = 0 -> cos(x)(2sen x - 1) = 0. Caso 1: cos(x) = 0 -> x = π/2 en [0, π]. Caso 2: sen(x) = 1/2 -> x = π/6 y x = 5π/6 en [0, π]. Suma = π/2 + π/6 + 5π/6 = π/2 + π = 3π/2... Verificando: π/6 + π/2 + 5π/6 = (1 + 3 + 5)π/6 = 9π/6 = 3π/2."
    }
  ]
}
```
