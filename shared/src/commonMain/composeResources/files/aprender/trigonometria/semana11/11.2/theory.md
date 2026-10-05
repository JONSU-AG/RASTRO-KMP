## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

---

### 3.3. Funciones Inversas Secundarias

1. **Arco Cotangente (y = \text{arccot } x):**
   - \text{Dom} = \mathbb{R}, \text{Ran} = \langle 0, \pi \rangle.
   - Propiedad para negativos: \text{arccot}(-x) = \pi - \text{arccot}(x).
2. **Arco Secante (y = \text{arcsec } x):**
   - \text{Dom} = \langle -\infty, -1] \cup [1, +\infty\rangle, \text{Ran} = [0, \pi] \setminus \left\{\frac{\pi}{2}\right\}.
   - Propiedad para negativos: \text{arcsec}(-x) = \pi - \text{arcsec}(x).
3. **Arco Cosecante (y = \text{arccsc } x):**
   - \text{Dom} = \langle -\infty, -1] \cup [1, +\infty\rangle, \text{Ran} = \left[-\frac{\pi}{2}, \frac{\pi}{2}\right] \setminus \{0\}.
   - Propiedad para negativos: \text{arccsc}(-x) = -\text{arccsc}(x).

---

### 3.4. Teoremas y Propiedades Fundamentales

#### 1. Suma de Arcos Complementarios:
\arcsin(x) + \arccos(x) = \frac{\pi}{2} \quad (\forall x \in [-1, 1])
\arctan(x) + \text{arccot}(x) = \frac{\pi}{2} \quad (\forall x \in \mathbb{R})
\text{arcsec}(x) + \text{arccsc}(x) = \frac{\pi}{2} \quad (|x| \ge 1)

#### 2. Composición de Funciones (Directa vs Inversa):
- **Operador Directo afuera:** Se cancela siempre en todo el dominio de la función arco:
  \sin(\arcsin x) = x \quad (\forall x \in [-1, 1])
  \cos(\arccos x) = x \quad (\forall x \in [-1, 1])
  \tan(\arctan x) = x \quad (\forall x \in \mathbb{R})
- **Operador Inverso afuera (¡Peligro Examen!):** Se cancela **ÚNICAMENTE** si el ángulo original \theta pertenece al rango restringido de la función arco:
  \arcsin(\sin \theta) = \theta \iff \theta \in \left[-\frac{\pi}{2}, \frac{\pi}{2}\right]
  \arccos(\cos \theta) = \theta \iff \theta \in [0, \pi]
  \arctan(\tan \theta) = \theta \iff \theta \in \left\langle -\frac{\pi}{2}, \frac{\pi}{2} \right\rangle
  - Si \theta no pertenece al rango, debe **reducirse al rango principal** mediante ángulos equivalentes.
  - Ejemplo: \arcsin(\sin\frac{5\pi}{6}) \ne \frac{5\pi}{6} (pues \frac{5\pi}{6} = 150^\circ > 90^\circ). Como \sin(\frac{5\pi}{6}) = \sin(\frac{\pi}{6}), el resultado es \frac{\pi}{6}.

#### 3. Fórmula de Adición de Arco Tangente:
\arctan(x) + \arctan(y) = \arctan\left(\frac{x + y}{1 - xy}\right) \quad (\text{si } xy < 1)
- Si x > 0, y > 0 y xy > 1:
  \arctan(x) + \arctan(y) = \pi + \arctan\left(\frac{x + y}{1 - xy}\right)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **\arcsin x + \arccos x**| [-1, 1] | \dfrac{\pi}{2} constante | Arcos complementarios |
| **\arctan x + \text{arccot } x**| \mathbb{R} | \dfrac{\pi}{2} constante | Arcos complementarios |
| **Recíproco Arco** | \text{arccot}(x) = \arctan\left(\dfrac{1}{x}\right) | Para x > 0 | Cambio de función |
| **Recíproco Arco** | \text{arcsec}(x) = \arccos\left(\dfrac{1}{x}\right) | Para |x| \ge 1 | Cambio a coseno |
| **Adición Arcos** | \arctan x + \arctan y = \arctan\left(\dfrac{x+y}{1-xy}\right)| Para xy < 1 | Teorema de Euler |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Reducción Rápida de \arcsin(\sin\theta) y \arccos(\cos\theta)
Si te piden evaluar \arccos(\cos 300^\circ):
- **NO pongas 300^\circ** (está fuera de [0, 180^\circ]).
- Por reducción al primer cuadrante: \cos(300^\circ) = \cos(360^\circ - 60^\circ) = \cos(60^\circ).
- Ahora sí, como 60^\circ \in [0, 180^\circ]:
  \arccos(\cos 60^\circ) = 60^\circ = \frac{\pi}{3}\text{ rad}
- ¡Toma 5 segundos reducir al intervalo permitido!

### Hack 2: Suma de Tres Arco Tangentes Notables
En problemas clásicos donde x = 1, y = 2, z = 3:
\arctan(1) + \arctan(2) + \arctan(3) = \pi
- \arctan(1) = \frac{\pi}{4}.
- \arctan(2) + \arctan(3) = \frac{3\pi}{4}.
- ¡Memoriza que la suma de \arctan(1) + \arctan(2) + \arctan(3) da exactamente \pi (180^\circ)!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Signo Menos: "LOS CO-ARCOS RESTAN CON PI"
- Las funciones que llevan la sílaba **CO** (\arccos, \text{arccot}, \text{arcsec}) no son impares: al recibir un negativo, **RESTAN DE \pi**:
  \text{CO-ARCO}(-x) = \mathbf{\pi - \text{CO-ARCO}(x)}
- Las otras tres (\arcsin, \arctan, \text{arccsc}) son impares directas: simplemente sacan el signo menos hacia afuera:
  \arcsin(-x) = -\arcsin(x)

### 2. Mnemotecnia del Triángulo Auxiliar: "PONLE \alpha Y DIBUJA"
- Cada vez que veas una función trigonométrica inversa como argumento de otra razón (ejemplo: \tan(\arccos \frac{3}{5})):
  1. Nómbralo como un ángulo: Sea \alpha = \arccos(\frac{3}{5}) \implies \cos(\alpha) = \frac{3}{5}.
  2. Dibuja un triángulo rectángulo: Cateto adyacente = 3, hipotenusa = 5, cateto opuesto = 4.
  3. Lee la razón pedida directamente del dibujo: \tan(\alpha) = \frac{4}{3}. ¡Sin fórmulas!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Dominio de Arco Seno y Arco Coseno**
> \arcsin(x) y \arccos(x) **NO EXISTEN** para valores de x fuera del intervalo [-1, 1].
> Si un problema conduce a \arcsin(2) o \arccos(-1.5), la expresión es un absurdo matemático (conjunto vacío \emptyset).

> [!CAUTION]
> **Trampa 2: La Notación \sin^{-1}(x) no es \frac{1}{\sin(x)}**
> En cálculo superior y calculadoras científicas, \sin^{-1}(x) denota la **función inversa** (\arcsin x).
> NO confundir con el inverso multiplicativo (la cosecante):
> \sin^{-1}(x) \ne (\sin x)^{-1} = \frac{1}{\sin(x)} = \csc(x)

> [!WARNING]
> **Trampa 3: Rango Cerrado vs Abierto en la Arco Tangente**
> El rango de \arctan(x) es **ABIERTO**: \left\langle -\frac{\pi}{2}, \frac{\pi}{2} \right\rangle.
> La tangente nunca alcanza +\infty o -\infty, por lo que \arctan(x) **NUNCA puede ser igual a \frac{\pi}{2} ni a -\frac{\pi}{2}**.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Visión por Computadora y Robótica (Cinemática Inversa):** Para que el brazo de un robot se posicione en las coordenadas (x, y), los servomotores deben girar un ángulo de articulación calculado mediante la función \theta = \text{atan2}(y, x) (arco tangente de dos argumentos con signo de cuadrante).
2. **Navegación Aérea y Corrección de Deriva:** El ángulo de corrección de rumbo de un avión frente a un viento lateral de velocidad v_v con velocidad propia v_a se determina mediante \theta = \arcsin\left(\frac{v_v}{v_a}\right).
3. **Cálculo de Desnivel y Pendientes Viales:** Los altímetros digitales y niveles láser calculan el ángulo de inclinación de rampas mediante \theta = \arctan\left(\frac{\Delta h}{d}\right).

---

## Funciones inversas: dominio, rango y gráfica

Una función periódica no tiene inversa en todo su dominio, porque repite valores. Se restringe a un intervalo donde es uno a uno. Con las convenciones principales, arcsin x tiene dominio [−1, 1] y rango [−π/2, π/2]; arccos x, dominio [−1, 1] y rango [0, π]; arctan x, dominio ℝ y rango (−π/2, π/2).

Sus gráficas se obtienen reflejando el tramo restringido de la función original respecto de y = x. Arcsin y arctan son crecientes; arccos es decreciente. Arctan se aproxima a sus límites sin alcanzarlos. La inversa no es el recíproco: arcsin x no significa 1/sin x. Así, arcsin(sin(5π/6)) = π/6, porque la respuesta debe estar en el rango principal.
