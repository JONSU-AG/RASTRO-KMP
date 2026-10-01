# TEMA 11: FUNCIONES TRIGONOMÉTRICAS INVERSAS (FUNCIONES ARCO)

---

## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Análisis Matemático y Funciones Trascendentes |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Funciones Inversas, Biyectividad, Funciones Trigonométricas Directas y Radianes |

### Competencias Clave del Prospecto
1. **Comprensión de Dominios y Rangos Restringidos:** Dominar los intervalos de existencia y los rangos principales de las funciones arco seno, arco coseno y arco tangente.
2. **Propiedades de Paridad y Simetría:** Aplicar las identidades para argumentos negativos ($\arcsin(-x) = -\arcsin x$ y $\arccos(-x) = \pi - \arccos x$).
3. **Manejo de Arcos Complementarios:** Utilizar la suma fundamental $\arcsin(x) + \arccos(x) = \frac{\pi}{2}$ y $\arctan(x) + \text{arccot}(x) = \frac{\pi}{2}$.
4. **Composición de Funciones y Despeje Triangular:** Resolver composiciones del tipo $\arcsin(\sin\theta)$ cuando $\theta$ excede el rango principal y sumar arcos mediante la fórmula de la tangente compuesta.

---

## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Funciones Trigonométricas Inversas] --> B[Función Arco Seno: arcsin x]
    A --> C[Función Arco Coseno: arccos x]
    A --> D[Función Arco Tangente: arctan x]
    A --> E[Propiedades Fundamentales]
    A --> F[Adición de Arcos: Teorema de Euler]

    B --> B1[Dom: [-1, 1], Ran: [-π/2, π/2]]
    B --> B2[Impar: arcsin -x = -arcsin x]

    C --> C1[Dom: [-1, 1], Ran: [0, π]]
    C --> C2[Suplementaria: arccos -x = π - arccos x]

    D --> D1[Dom: R, Ran: <-π/2, π/2>]
    D --> D2[Asíntotas Horizontales: y = ± π/2]

    E --> E1[Arcos Complementarios: arcsin x + arccos x = π/2]
    E --> E2[Composición Directa: sen arcsin x = x]
    E --> E3[Composición Inversa: arcsin sen θ = θ solo en el rango]

    F --> F1[arctan x + arctan y = arctan x+y / 1-xy para xy < 1]
    F --> F2[Cambio de Arco mediante Triángulo Auxiliar]
```

---

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Concepto y Necesidad de Restricción
Dado que las funciones trigonométricas directas son periódicas, **no son inyectivas** en todo su dominio real; por tanto, no admiten función inversa global.
Para construir la función inversa, es matemáticamente obligatorio **restringir el dominio** a un intervalo cerrado donde la función sea estrictamente monótona (creciente o decreciente) y continua, garantizando su **biyectividad**:
$$y = \text{arc R.T.}(x) \iff \text{R.T.}(y) = x \quad \text{con } y \in \text{Ran}(\text{arc R.T.})$$

*Interpretación Semántica:* $\arcsin(x)$ se lee literalmente: *"El arco (o ángulo en radianes) cuyo seno es $x$"*.

---

### 3.2. Las Tres Funciones Inversas Principales

#### 1. Función Arco Seno: $y = \arcsin(x) = \sin^{-1}(x)$
- **Definición:** $y = \arcsin(x) \iff \sin(y) = x$.
- **Dominio:** $\text{Dom} = [-1, 1]$.
- **Rango (Intervalo Principal):** $\text{Ran} = \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right]$.
- **Monotonía:** Estrictamente creciente en todo su dominio $[-1, 1]$.
- **Paridad:** Función impar:
  $$\arcsin(-x) = -\arcsin(x)$$
- **Valores Notables:**
  $$\arcsin(0) = 0, \quad \arcsin(1) = \frac{\pi}{2}, \quad \arcsin(-1) = -\frac{\pi}{2}, \quad \arcsin\left(\frac{1}{2}\right) = \frac{\pi}{6}$$

#### 2. Función Arco Coseno: $y = \arccos(x) = \cos^{-1}(x)$
- **Definición:** $y = \arccos(x) \iff \cos(y) = x$.
- **Dominio:** $\text{Dom} = [-1, 1]$.
- **Rango (Intervalo Principal):** $\text{Ran} = [0, \pi]$.
- **Monotonía:** Estrictamente decreciente en todo su dominio.
- **Propiedad para Argumentos Negativos:**
  $$\arccos(-x) = \pi - \arccos(x)$$
- **Valores Notables:**
  $$\arccos(1) = 0, \quad \arccos(0) = \frac{\pi}{2}, \quad \arccos(-1) = \pi, \quad \arccos\left(\frac{1}{2}\right) = \frac{\pi}{3}, \quad \arccos\left(-\frac{1}{2}\right) = \frac{2\pi}{3}$$

#### 3. Función Arco Tangente: $y = \arctan(x) = \tan^{-1}(x)$
- **Definición:** $y = \arctan(x) \iff \tan(y) = x$.
- **Dominio:** $\text{Dom} = \mathbb{R} = \langle -\infty, +\infty \rangle$.
- **Rango (Intervalo Principal):** $\text{Ran} = \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle$.
- **Monotonía:** Estrictamente creciente en todo $\mathbb{R}$.
- **Paridad:** Función impar:
  $$\arctan(-x) = -\arctan(x)$$
- **Asíntotas Horizontales:** Rectas $y = \dfrac{\pi}{2}$ (cuando $x \to +\infty$) e $y = -\dfrac{\pi}{2}$ (cuando $x \to -\infty$).
- **Valores Notables:**
  $$\arctan(0) = 0, \quad \arctan(1) = \frac{\pi}{4}, \quad \arctan(-1) = -\frac{\pi}{4}, \quad \arctan(\sqrt{3}) = \frac{\pi}{3}$$

---

### 3.3. Funciones Inversas Secundarias

1. **Arco Cotangente ($y = \text{arccot } x$):**
   - $\text{Dom} = \mathbb{R}$, $\text{Ran} = \langle 0, \pi \rangle$.
   - Propiedad para negativos: $\text{arccot}(-x) = \pi - \text{arccot}(x)$.
2. **Arco Secante ($y = \text{arcsec } x$):**
   - $\text{Dom} = \langle -\infty, -1] \cup [1, +\infty\rangle$, $\text{Ran} = [0, \pi] \setminus \left\{\frac{\pi}{2}\right\}$.
   - Propiedad para negativos: $\text{arcsec}(-x) = \pi - \text{arcsec}(x)$.
3. **Arco Cosecante ($y = \text{arccsc } x$):**
   - $\text{Dom} = \langle -\infty, -1] \cup [1, +\infty\rangle$, $\text{Ran} = \left[-\frac{\pi}{2}, \frac{\pi}{2}\right] \setminus \{0\}$.
   - Propiedad para negativos: $\text{arccsc}(-x) = -\text{arccsc}(x)$.

---

### 3.4. Teoremas y Propiedades Fundamentales

#### 1. Suma de Arcos Complementarios:
$$\arcsin(x) + \arccos(x) = \frac{\pi}{2} \quad (\forall x \in [-1, 1])$$
$$\arctan(x) + \text{arccot}(x) = \frac{\pi}{2} \quad (\forall x \in \mathbb{R})$$
$$\text{arcsec}(x) + \text{arccsc}(x) = \frac{\pi}{2} \quad (|x| \ge 1)$$

#### 2. Composición de Funciones (Directa vs Inversa):
- **Operador Directo afuera:** Se cancela siempre en todo el dominio de la función arco:
  $$\sin(\arcsin x) = x \quad (\forall x \in [-1, 1])$$
  $$\cos(\arccos x) = x \quad (\forall x \in [-1, 1])$$
  $$\tan(\arctan x) = x \quad (\forall x \in \mathbb{R})$$
- **Operador Inverso afuera (¡Peligro Examen!):** Se cancela **ÚNICAMENTE** si el ángulo original $\theta$ pertenece al rango restringido de la función arco:
  $$\arcsin(\sin \theta) = \theta \iff \theta \in \left[-\frac{\pi}{2}, \frac{\pi}{2}\right]$$
  $$\arccos(\cos \theta) = \theta \iff \theta \in [0, \pi]$$
  $$\arctan(\tan \theta) = \theta \iff \theta \in \left\langle -\frac{\pi}{2}, \frac{\pi}{2} \right\rangle$$
  - Si $\theta$ no pertenece al rango, debe **reducirse al rango principal** mediante ángulos equivalentes.
  - Ejemplo: $\arcsin(\sin\frac{5\pi}{6}) \ne \frac{5\pi}{6}$ (pues $\frac{5\pi}{6} = 150^\circ > 90^\circ$). Como $\sin(\frac{5\pi}{6}) = \sin(\frac{\pi}{6})$, el resultado es $\frac{\pi}{6}$.

#### 3. Fórmula de Adición de Arco Tangente:
$$\arctan(x) + \arctan(y) = \arctan\left(\frac{x + y}{1 - xy}\right) \quad (\text{si } xy < 1)$$
- Si $x > 0, y > 0$ y $xy > 1$:
  $$\arctan(x) + \arctan(y) = \pi + \arctan\left(\frac{x + y}{1 - xy}\right)$$

---

## 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Función Inversa | Dominio | Rango | Simetría / Paridad |
| :--- | :--- | :--- | :--- |
| **$\arcsin(x)$** | $[-1, 1]$ | $\left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right]$ | $\arcsin(-x) = -\arcsin(x)$ |
| **$\arccos(x)$** | $[-1, 1]$ | $[0, \pi]$ | $\arccos(-x) = \pi - \arccos(x)$ |
| **$\arctan(x)$** | $\mathbb{R}$ | $\left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle$| $\arctan(-x) = -\arctan(x)$ |
| **$\text{arccot}(x)$**| $\mathbb{R}$ | $\langle 0, \pi \rangle$ | $\text{arccot}(-x) = \pi - \text{arccot}(x)$ |
| **$\arcsin x + \arccos x$**| $[-1, 1]$ | $\dfrac{\pi}{2}$ constante | Arcos complementarios |
| **$\arctan x + \text{arccot } x$**| $\mathbb{R}$ | $\dfrac{\pi}{2}$ constante | Arcos complementarios |
| **Recíproco Arco** | $\text{arccot}(x) = \arctan\left(\dfrac{1}{x}\right)$ | Para $x > 0$ | Cambio de función |
| **Recíproco Arco** | $\text{arcsec}(x) = \arccos\left(\dfrac{1}{x}\right)$ | Para $|x| \ge 1$ | Cambio a coseno |
| **Adición Arcos** | $\arctan x + \arctan y = \arctan\left(\dfrac{x+y}{1-xy}\right)$| Para $xy < 1$ | Teorema de Euler |

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Signo Menos: "LOS CO-ARCOS RESTAN CON PI"
- Las funciones que llevan la sílaba **CO** ($\arccos, \text{arccot}, \text{arcsec}$) no son impares: al recibir un negativo, **RESTAN DE $\pi$**:
  $$\text{CO-ARCO}(-x) = \mathbf{\pi - \text{CO-ARCO}(x)}$$
- Las otras tres ($\arcsin, \arctan, \text{arccsc}$) son impares directas: simplemente sacan el signo menos hacia afuera:
  $$\arcsin(-x) = -\arcsin(x)$$

### 2. Mnemotecnia del Triángulo Auxiliar: "PONLE $\alpha$ Y DIBUJA"
- Cada vez que veas una función trigonométrica inversa como argumento de otra razón (ejemplo: $\tan(\arccos \frac{3}{5})$):
  1. Nómbralo como un ángulo: Sea $\alpha = \arccos(\frac{3}{5}) \implies \cos(\alpha) = \frac{3}{5}$.
  2. Dibuja un triángulo rectángulo: Cateto adyacente $= 3$, hipotenusa $= 5$, cateto opuesto $= 4$.
  3. Lee la razón pedida directamente del dibujo: $\tan(\alpha) = \frac{4}{3}$. ¡Sin fórmulas!

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Reducción Rápida de $\arcsin(\sin\theta)$ y $\arccos(\cos\theta)$
Si te piden evaluar $\arccos(\cos 300^\circ)$:
- **NO pongas $300^\circ$** (está fuera de $[0, 180^\circ]$).
- Por reducción al primer cuadrante: $\cos(300^\circ) = \cos(360^\circ - 60^\circ) = \cos(60^\circ)$.
- Ahora sí, como $60^\circ \in [0, 180^\circ]$:
  $$\arccos(\cos 60^\circ) = 60^\circ = \frac{\pi}{3}\text{ rad}$$
- ¡Toma 5 segundos reducir al intervalo permitido!

### Hack 2: Suma de Tres Arco Tangentes Notables
En problemas clásicos donde $x = 1, y = 2, z = 3$:
$$\arctan(1) + \arctan(2) + \arctan(3) = \pi$$
- $\arctan(1) = \frac{\pi}{4}$.
- $\arctan(2) + \arctan(3) = \frac{3\pi}{4}$.
- ¡Memoriza que la suma de $\arctan(1) + \arctan(2) + \arctan(3)$ da exactamente $\pi$ ($180^\circ$)!

---

## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Dominio de Arco Seno y Arco Coseno**
> $\arcsin(x)$ y $\arccos(x)$ **NO EXISTEN** para valores de $x$ fuera del intervalo $[-1, 1]$.
> Si un problema conduce a $\arcsin(2)$ o $\arccos(-1.5)$, la expresión es un absurdo matemático (conjunto vacío $\emptyset$).

> [!CAUTION]
> **Trampa 2: La Notación $\sin^{-1}(x)$ no es $\frac{1}{\sin(x)}$**
> En cálculo superior y calculadoras científicas, $\sin^{-1}(x)$ denota la **función inversa** ($\arcsin x$).
> NO confundir con el inverso multiplicativo (la cosecante):
> $$\sin^{-1}(x) \ne (\sin x)^{-1} = \frac{1}{\sin(x)} = \csc(x)$$

> [!WARNING]
> **Trampa 3: Rango Cerrado vs Abierto en la Arco Tangente**
> El rango de $\arctan(x)$ es **ABIERTO**: $\left\langle -\frac{\pi}{2}, \frac{\pi}{2} \right\rangle$.
> La tangente nunca alcanza $+\infty$ o $-\infty$, por lo que $\arctan(x)$ **NUNCA puede ser igual a $\frac{\pi}{2}$ ni a $-\frac{\pi}{2}$**.

---

## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Visión por Computadora y Robótica (Cinemática Inversa):** Para que el brazo de un robot se posicione en las coordenadas $(x, y)$, los servomotores deben girar un ángulo de articulación calculado mediante la función $\theta = \text{atan2}(y, x)$ (arco tangente de dos argumentos con signo de cuadrante).
2. **Navegación Aérea y Corrección de Deriva:** El ángulo de corrección de rumbo de un avión frente a un viento lateral de velocidad $v_v$ con velocidad propia $v_a$ se determina mediante $\theta = \arcsin\left(\frac{v_v}{v_a}\right)$.
3. **Cálculo de Desnivel y Pendientes Viales:** Los altímetros digitales y niveles láser calculan el ángulo de inclinación de rampas mediante $\theta = \arctan\left(\frac{\Delta h}{d}\right)$.

---

## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS

### Ejercicio 1 (Nivel 1 - Básico / Admisión Directa)
**Enunciado:** Calcule el valor numérico en radianes de la siguiente expresión:
$$E = \arcsin\left(\frac{1}{2}\right) + \arccos\left(\frac{1}{2}\right) + \arctan(1)$$

- A) $\dfrac{3\pi}{4}$
- B) $\dfrac{\pi}{2}$
- C) $\pi$
- D) $\dfrac{2\pi}{3}$
- E) $\dfrac{5\pi}{4}$

**Solución Paso a Paso:**
1. Evaluamos cada término individualmente o aplicamos la propiedad de arcos complementarios:
   - **Método 1 (Directo):**
     $$\arcsin\left(\frac{1}{2}\right) = \frac{\pi}{6} \quad (30^\circ)$$
     $$\arccos\left(\frac{1}{2}\right) = \frac{\pi}{3} \quad (60^\circ)$$
     $$\arctan(1) = \frac{\pi}{4} \quad (45^\circ)$$
     $$E = \frac{\pi}{6} + \frac{\pi}{3} + \frac{\pi}{4} = \frac{2\pi + 4\pi + 3\pi}{12} = \frac{9\pi}{12} = \frac{3\pi}{4}$$
   - **Método 2 (Por Propiedad de Arcos Complementarios):**
     Sabemos que $\arcsin(x) + \arccos(x) = \frac{\pi}{2}$ para todo $x \in [-1, 1]$:
     $$E = \left[\arcsin\left(\frac{1}{2}\right) + \arccos\left(\frac{1}{2}\right)\right] + \arctan(1) = \frac{\pi}{2} + \frac{\pi}{4} = \frac{3\pi}{4}$$
- **Respuesta Correcta:** A) $\dfrac{3\pi}{4}$

---

### Ejercicio 2 (Nivel 2 - Intermedio / CEPREUNSA)
**Enunciado:** Calcule el valor de:
$$K = \arccos\left(-\frac{\sqrt{3}}{2}\right) - \arcsin\left(-\frac{\sqrt{3}}{2}\right)$$

- A) $\dfrac{7\pi}{6}$
- B) $\dfrac{5\pi}{6}$
- C) $\dfrac{\pi}{2}$
- D) $\dfrac{2\pi}{3}$
- E) $\pi$

**Solución Paso a Paso:**
1. Evaluamos el primer término aplicando la propiedad de arco coseno negativo:
   $$\arccos(-x) = \pi - \arccos(x)$$
   $$\arccos\left(-\frac{\sqrt{3}}{2}\right) = \pi - \arccos\left(\frac{\sqrt{3}}{2}\right) = \pi - \frac{\pi}{6} = \frac{5\pi}{6}$$
2. Evaluamos el segundo término aplicando la paridad impar de arco seno:
   $$\arcsin(-x) = -\arcsin(x)$$
   $$\arcsin\left(-\frac{\sqrt{3}}{2}\right) = -\arcsin\left(\frac{\sqrt{3}}{2}\right) = -\frac{\pi}{3}$$
3. Sustituimos en la resta:
   $$K = \frac{5\pi}{6} - \left(-\frac{\pi}{3}\right) = \frac{5\pi}{6} + \frac{2\pi}{6} = \frac{7\pi}{6}$$
- **Respuesta Correcta:** A) $\dfrac{7\pi}{6}$

---

### Ejercicio 3 (Nivel 3 - Intermedio-Avanzado / UNSA Ordinario)
**Enunciado:** Calcule el valor exacto de:
$$M = \tan\left( \arccos\left(\frac{5}{13}\right) \right)$$

- A) $\dfrac{12}{5}$
- B) $\dfrac{5}{12}$
- C) $\dfrac{12}{13}$
- D) $\dfrac{13}{5}$
- E) $\dfrac{5}{13}$

**Solución Paso a Paso:**
1. Aplicamos la técnica del **Triángulo Auxiliar**:
   - Sea $\theta = \arccos\left(\frac{5}{13}\right)$.
   - Por definición: $\cos(\theta) = \frac{5}{13}$, con $\theta$ en el primer cuadrante ($0 < \theta < \frac{\pi}{2}$).
2. Construimos un triángulo rectángulo para el ángulo $\theta$:
   - Cateto adyacente: $CA = 5$.
   - Hipotenusa: $H = 13$.
   - Calculamos el cateto opuesto mediante Pitágoras:
     $$CO = \sqrt{13^2 - 5^2} = \sqrt{169 - 25} = \sqrt{144} = 12$$
3. Calculamos la tangente del ángulo $\theta$:
   $$M = \tan(\theta) = \frac{CO}{CA} = \frac{12}{5}$$
- **Respuesta Correcta:** A) $\dfrac{12}{5}$

---

### Ejercicio 4 (Nivel 4 - Avanzado / UNMSM DECO)
**Enunciado:** Determine el dominio de la función real definida por:
$$f(x) = \arcsin\left(\frac{2x - 3}{5}\right)$$

- A) $[-1, 4]$
- B) $[-2, 3]$
- C) $[-4, 4]$
- D) $[1, 4]$
- E) $[-1, 5]$

**Solución Paso a Paso:**
1. Recordamos que la función arco seno tiene como dominio el intervalo cerrado $[-1, 1]$.
2. Por tanto, el argumento de la función debe satisfacer la siguiente desigualdad doble:
   $$-1 \le \frac{2x - 3}{5} \le 1$$
3. Multiplicamos todos los miembros por 5:
   $$-5 \le 2x - 3 \le 5$$
4. Sumamos 3 a todos los miembros:
   $$-5 + 3 \le 2x \le 5 + 3$$
   $$-2 \le 2x \le 8$$
5. Dividimos entre 2:
   $$-1 \le x \le 4$$
6. El dominio de la función es:
   $$\text{Dom}(f) = [-1, 4]$$
- **Respuesta Correcta:** A) $[-1, 4]$

---

### Ejercicio 5 (Nivel 5 - Boss Challenge / UNI)
**Enunciado:** Calcule el valor simplificado de la siguiente expresión compuesta:
$$S = \arcsin\left(\sin\left(\frac{4\pi}{3}\right)\right) + \arccos\left(\cos\left(\frac{7\pi}{6}\right)\right)$$

- A) $\dfrac{\pi}{2}$
- B) $\dfrac{5\pi}{6}$
- C) $\dfrac{\pi}{3}$
- D) $\pi$
- E) $\dfrac{2\pi}{3}$

**Solución Paso a Paso:**
1. **Evaluación de $\arcsin\left(\sin\frac{4\pi}{3}\right)$:**
   - El ángulo $\frac{4\pi}{3} = 240^\circ$ se ubica en el III C y está fuera del rango de arco seno $\left[-\frac{\pi}{2}, \frac{\pi}{2}\right] = [-90^\circ, 90^\circ]$.
   - Calculamos el valor numérico:
     $$\sin\left(\frac{4\pi}{3}\right) = -\sin(60^\circ) = -\frac{\sqrt{3}}{2}$$
   - Evaluamos el arco seno de dicho valor dentro del rango admisible:
     $$\arcsin\left(-\frac{\sqrt{3}}{2}\right) = -\arcsin\left(\frac{\sqrt{3}}{2}\right) = -\frac{\pi}{3}$$
2. **Evaluación de $\arccos\left(\cos\frac{7\pi}{6}\right)$:**
   - El ángulo $\frac{7\pi}{6} = 210^\circ$ se ubica en el III C y está fuera del rango de arco coseno $[0, \pi] = [0^\circ, 180^\circ]$.
   - Calculamos el valor numérico:
     $$\cos\left(\frac{7\pi}{6}\right) = -\cos(30^\circ) = -\frac{\sqrt{3}}{2}$$
   - Evaluamos el arco coseno de dicho valor dentro del rango admisible:
     $$\arccos\left(-\frac{\sqrt{3}}{2}\right) = \pi - \arccos\left(\frac{\sqrt{3}}{2}\right) = \pi - \frac{\pi}{6} = \frac{5\pi}{6}$$
3. **Suma de Ambos Resultados:**
   $$S = -\frac{\pi}{3} + \frac{5\pi}{6} = -\frac{2\pi}{6} + \frac{5\pi}{6} = \frac{3\pi}{6} = \frac{\pi}{2}$$
- **Respuesta Correcta:** A) $\dfrac{\pi}{2}$

---

## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Función Arco:** Función inversa de una razón trigonométrica obtenida restringiendo su dominio a un intervalo biyectivo.
2. **Dominio de la Inversa:** Intervalo de números reales que coincide con el rango de la función directa originaria.
3. **Rango Principal:** Intervalo angular convencional donde la función inversa adopta valores únicos.
4. **Arcos Complementarios:** Pares de funciones arco cuya suma es idéntica a $\frac{\pi}{2}$ ($\arcsin x + \arccos x = \frac{\pi}{2}$).
5. **Triángulo Auxiliar:** Artificio geométrico para evaluar razones trigonométricas directas compuestas con funciones arco.
6. **Biyectividad Local:** Propiedad de ser simultáneamente inyectiva y sobreyectiva en un tramo acotado.
7. **Monotonía Estricta:** Comportamiento continuo puramente creciente o decreciente que asegura la no repetición de imágenes.
8. **Asíntota Horizontal:** Línea horizontal hacia la que converge el arco cuando el argumento tiende a infinito ($\pm \frac{\pi}{2}$ en $\arctan$).
9. **Desfase de Cuadrante:** Corrección requerida cuando el argumento de una composición $\arcsin(\sin\theta)$ excede el intervalo principal.
10. **Teorema de Machin:** Identidad basada en la suma de arco tangentes utilizada históricamente para calcular decimales de $\pi$.

---

## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es el dominio y rango de la función arco seno $y = \arcsin(x)$?**
  - **A:** Dominio: $[-1, 1]$; Rango: $\left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right]$.
- **Q: ¿Cuál es el dominio y rango de la función arco coseno $y = \arccos(x)$?**
  - **A:** Dominio: $[-1, 1]$; Rango: $[0, \pi]$.
- **Q: ¿A qué es igual $\arccos(-x)$ en términos de $\arccos(x)$?**
  - **A:** $\arccos(-x) = \pi - \arccos(x)$.
- **Q: ¿Cuánto vale la suma $\arcsin(x) + \arccos(x)$ para cualquier $x \in [-1, 1]$?**
  - **A:** Vale siempre $\dfrac{\pi}{2}\text{ rad}$ ($90^\circ$).
- **Q: ¿Por qué $\arcsin(\sin 150^\circ)$ NO es igual a $150^\circ$?**
  - **A:** Porque $150^\circ$ está fuera del rango principal $[-90^\circ, 90^\circ]$; su valor real es $30^\circ$ ($\frac{\pi}{6}$).
- **Q: ¿Cuáles son las asíntotas horizontales de la función arco tangente $y = \arctan(x)$?**
  - **A:** Las rectas horizontales $y = \dfrac{\pi}{2}$ e $y = -\dfrac{\pi}{2}$.

---

## 12. MOTOR DE GAMIFICACIÓN (JSON NATIVO PARA KOTLIN MULTIPLATFORM)

```json
{
  "temaId": "TRIG_11_FUNCIONES_INVERSAS",
  "titulo": "Funciones Trigonométricas Inversas (Funciones Arco)",
  "dificultad": "Avanzado",
  "xpTotal": 580,
  "skills": [
    "Dominio y Rango de Funciones Arco",
    "Propiedades de Argumentos Negativos",
    "Arcos Complementarios",
    "Composición y Triángulo Auxiliar"
  ],
  "retos": [
    {
      "id": "reto_1",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es el valor de arccos(-1/2)?",
      "opciones": ["2π/3", "π/3", "-π/3", "5π/6"],
      "respuestaCorrecta": "2π/3",
      "puntos": 70,
      "explicacion": "arccos(-x) = π - arccos(x) -> π - arccos(1/2) = π - π/3 = 2π/3."
    },
    {
      "id": "reto_2",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es el dominio de la función f(x) = arccos(3x - 1)?",
      "opciones": ["[0, 2/3]", "[-1, 1]", "[-2/3, 2/3]", "[0, 1]"],
      "respuestaCorrecta": "[0, 2/3]",
      "puntos": 80,
      "explicacion": "-1 ≤ 3x - 1 ≤ 1 -> 0 ≤ 3x ≤ 2 -> 0 ≤ x ≤ 2/3."
    },
    {
      "id": "reto_3",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuánto resulta sen(arctan(1))?",
      "opciones": ["√2/2", "1", "1/2", "√3/2"],
      "respuestaCorrecta": "√2/2",
      "puntos": 60,
      "explicacion": "arctan(1) = π/4 (45°). sen(45°) = √2/2."
    },
    {
      "id": "reto_4",
      "tipo": "opcion_multiple",
      "pregunta": "La suma arcsin(x) + arccos(x) es igual a:",
      "opciones": ["π/2", "π", "0", "1"],
      "respuestaCorrecta": "π/2",
      "puntos": 60,
      "explicacion": "Propiedad de arcos complementarios para todo x en [-1, 1]: arcsin(x) + arccos(x) = π/2."
    },
    {
      "id": "reto_boss",
      "tipo": "boss_challenge",
      "pregunta": "Calcule el valor de arcsin(sen(7π/6)):",
      "opciones": ["-π/6", "7π/6", "5π/6", "π/6"],
      "respuestaCorrecta": "-π/6",
      "puntos": 310,
      "explicacion": "sen(7π/6) = sen(210°) = -1/2. Luego arcsin(-1/2) = -arcsin(1/2) = -π/6 (debe estar dentro de [-π/2, π/2])."
    }
  ]
}
```
