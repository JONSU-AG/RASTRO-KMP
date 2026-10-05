## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  - Si k es par (k = 2n): \theta = 2n\pi + V_p.
  - Si k es impar (k = 2n + 1): \theta = (2n + 1)\pi - V_p.

#### 2. Para Coseno y Secante (\cos\theta = N):
\theta = 2k\pi \pm V_p \quad (k \in \mathbb{Z})
*(Las dos ramas simétricas reflejan que \cos(\alpha) = \cos(-\alpha)).*

#### 3. Para Tangente y Cotangente (\tan\theta = N):
\theta = k\pi + V_p \quad (k \in \mathbb{Z})
*(La periodicidad fundamental de la tangente es exactamente \pi o 180^\circ).*

---

### 3.4. Métodos para Resolver Ecuaciones No Elementales

#### Método 1: Factorización
Consiste en trasladar todos los términos al primer miembro e igualar a cero:
f(x) \cdot g(x) = 0 \iff f(x) = 0 \quad \lor \quad g(x) = 0
Cada factor igualado a cero genera una E.T.E. independiente.

#### Método 2: Reducción a una Sola Razón (Ecuación Polinomial)
Se emplean identidades fundamentales o del ángulo doble para expresar toda la ecuación en términos de una única función trigonométrica (por ejemplo, todo en senos o todo en cosenos):
2\cos^2(x) + 3\sin(x) - 3 = 0 \implies 2(1 - \sin^2 x) + 3\sin x - 3 = 0 \implies 2\sin^2 x - 3\sin x + 1 = 0
Se resuelve como una ecuación cuadrática en \sin(x).

#### Método 3: La Ecuación Lineal A\sin(x) + B\cos(x) = C
Se divide toda la ecuación entre \sqrt{A^2 + B^2}:
\frac{A}{\sqrt{A^2 + B^2}}\sin(x) + \frac{B}{\sqrt{A^2 + B^2}}\cos(x) = \frac{C}{\sqrt{A^2 + B^2}}
Haciendo \cos(\phi) = \frac{A}{\sqrt{A^2+B^2}} y \sin(\phi) = \frac{B}{\sqrt{A^2+B^2}}:
\sin(x + \phi) = \frac{C}{\sqrt{A^2 + B^2}}
- **Condición de Compatibilidad (Solución Real):**
  |C| \le \sqrt{A^2 + B^2} \iff C^2 \le A^2 + B^2

---

### 3.5. Cálculo de Soluciones en un Intervalo Cerrado
Para encontrar las soluciones particulares en un intervalo [a, b] (generalmente [0, 2\pi] o [0^\circ, 360^\circ]):
1. Se halla la solución general o se ubican los ángulos en los cuadrantes correspondientes mediante la C.T.
2. Se asignan valores enteros a k \in \mathbb{Z} (k = 0, 1, 2, -1\dots).
3. Se seleccionan únicamente las raíces que satisfacen: a \le x_i \le b.
4. Se efectúa la suma o conteo según lo solicitado en el enunciado.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **\sec(x) = N** | x = 2k\pi \pm V_p | V_p \in [0, \pi] \setminus \left\{\dfrac{\pi}{2}\right\} |
| **\csc(x) = N** | x = k\pi + (-1)^k V_p | V_p \in \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] \setminus \{0\} |
| **A\sin x + B\cos x = C**| \sin(x + \phi) = \dfrac{C}{\sqrt{A^2+B^2}} | Condición: C^2 \le A^2 + B^2 |
| **\sin^2(x) = N** | x = k\pi \pm V_p | Forma cuadrática |
| **\cos^2(x) = N** | x = k\pi \pm V_p | Forma cuadrática |
| **\tan^2(x) = N** | x = k\pi \pm V_p | Forma cuadrática |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Suma de Soluciones en una Vuelta sin Calcular las Raíces Individuales
En problemas que piden: "Calcule la suma de soluciones de \cos(x) = -\frac{1}{3} en [0, 2\pi]":
- **No intentes calcular el ángulo:** No es notable.
- **Usa la simetría de la C.T.:**
  - El coseno es negativo en el II C y III C.
  - La raíz del II C es x_1 = 180^\circ - \alpha.
  - La raíz del III C es x_2 = 180^\circ + \alpha.
  - Al sumarlas:
    x_1 + x_2 = (180^\circ - \alpha) + (180^\circ + \alpha) = 360^\circ = 2\pi\text{ rad}
  - ¡La suma de dos raíces de coseno en [0, 2\pi] es **SIEMPRE 2\pi** (o 360^\circ)!
  - Para el seno positivo en I C y II C: \alpha + (180^\circ - \alpha) = 180^\circ = \pi\text{ rad}.

### Hack 2: Cuidado al Simplificar Factores Comunes
Si tienes \sin(x)\cos(x) = \sin(x):
- **ERROR FATAL:** Cancelar \sin(x) y decir \cos(x) = 1. (¡Pierdes las soluciones donde \sin(x) = 0!).
- **MÉTODO CORRECTO:** Pasa a restar y factoriza:
  \sin(x)\cos(x) - \sin(x) = 0 \implies \sin(x)(\cos x - 1) = 0
  \sin(x) = 0 \quad \lor \quad \cos(x) = 1

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Solución General: "SEN-PAR-MENOS, COS-DOS-MÁS-MENOS, TAN-PI"
- **Seno:** Lleva el factor oscilante (-1)^k \to k\pi + (-1)^k V_p.
- **Coseno:** Lleva dos veces \pi y doble signo \pm \to 2k\pi \pm V_p.
- **Tangente:** La más sencilla, simplemente avanza de \pi en \pi \to k\pi + V_p.

### 2. Mnemotecnia de las Raíces en una Vuelta: "LOS CUADRANTES GEMELOS"
- Si \sin x = + \implies I C (\theta) y II C (180^\circ - \theta).
- Si \sin x = - \implies III C (180^\circ + \theta) y IV C (360^\circ - \theta).
- Si \cos x = + \implies I C (\theta) y IV C (360^\circ - \theta).
- Si \cos x = - \implies II C (180^\circ - \theta) y III C (180^\circ + \theta).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Rango del Coseno para el V_p Negativo**
> Si \cos(x) = -\frac{\sqrt{3}}{2}:
> - **ERROR GRAVE:** Decir V_p = -30^\circ (¡El rango del coseno es [0, 180^\circ], no admite negativos!).
> - **CORRECTO:** El ángulo agudo asociado es 30^\circ. En el segundo cuadrante:
>   V_p = 180^\circ - 30^\circ = 150^\circ = \frac{5\pi}{6}

> [!CAUTION]
> **Trampa 2: Elevar al Cuadrado Introduce Soluciones Extrañas**
> Si elevas ambos miembros al cuadrado para resolver A\sin x + B\cos x = C, estás resolviendo también la ecuación A\sin x + B\cos x = -C.
> Es **OBLIGATORIO** verificar cada solución obtenida en la ecuación original antes de dar la respuesta final.

> [!WARNING]
> **Trampa 3: Intervalos Abiertos vs Cerrados**
> Presta máxima atención a los corchetes del intervalo:
> - Si el intervalo es \langle 0, 2\pi \rangle, x = 0 y x = 2\pi **NO FORMAN PARTE** de la solución.
> - Si el intervalo es [0, 2\pi], ambos extremos **SÍ SE INCLUYEN**.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Predicción de Mareas Oceánicas:** La altura del nivel del mar en bahías se modela como h(t) = h_0 + A\cos(\omega t). Resolver cuándo la marea alcanza el nivel de calado seguro para el atraque de buques portacontenedores implica resolver una ecuación trigonométrica elemental acotada en el intervalo de 24 horas.
2. **Sincronización de Generadores en Redes Eléctricas:** Para conectar un turbogenerador a la red nacional interconectada (SEIN), el ángulo de fase de ambos voltajes debe coincidir exactamente: \sin(\omega t + \phi_1) - \sin(\omega t + \phi_2) = 0.
3. **Mecánica Celeste y Eclipses:** La determinación precisa de los instantes de alineación solar y lunar (sizigia) requiere resolver ecuaciones trigonométricas trascendentes de órbitas de Kepler.

---
