## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.4 Valor Absoluto en \mathbb{Z}
El valor absoluto es una función |\cdot|: \mathbb{Z} \to \mathbb{Z}_0^+ definida por ramas:
|x| = \begin{cases} x, & \text{si } x \ge 0 \\ -x, & \text{si } x < 0 \end{cases}

#### Teoremas Fundamentales del Valor Absoluto
1. |x| \ge 0, \quad \forall x \in \mathbb{Z}; y |x| = 0 \iff x = 0.
2. |-x| = |x|.
3. |x \cdot y| = |x| \cdot |y|.
4. \left| \frac{x}{y} \right| = \frac{|x|}{|y|} \quad (y \neq 0).
5. |x|^2 = x^2.
6. **Desigualdad Triangular:**
   |x + y| \le |x| + |y|, \quad \forall x, y \in \mathbb{Z}
   La igualdad |x + y| = |x| + |y| se cumple si y solo si x e y tienen el mismo signo (x \cdot y \ge 0).
7. |x - y| \ge ||x| - |y||.

### 3.5 Ecuaciones Diofánticas Lineales
Una ecuación diofántica es una ecuación algebraica con coeficientes enteros cuyas soluciones se restringen estrictamente al conjunto de los enteros \mathbb{Z}.
La forma canónica lineal en dos variables es:
a x + b y = c \quad (a, b, c \in \mathbb{Z}, \; a \neq 0, \; b \neq 0)

#### Teorema de Existencia de Soluciones (Criterio de Bezout)
La ecuación a x + b y = c admite soluciones enteras si y solo si el Máximo Común Divisor de a y b divide exactamente al término independiente c:
\text{MCD}(a, b) \mid c

#### Algoritmo de Resolución General
1. Sea d = \text{MCD}(a, b). Si d \nmid c, no existen soluciones enteras (S = \emptyset).
2. Si d \mid c, se simplifica la ecuación dividiendo entre d:
   a' x + b' y = c' \quad \text{donde } a' = \frac{a}{d}, \; b' = \frac{b}{d}, \; c' = \frac{c}{d} \quad (\text{MCD}(a', b') = 1)
3. Se encuentra una solución particular (x_0, y_0) por tanteo o mediante el algoritmo extendido de Euclides.
4. La familia completa de infinitas soluciones enteras se describe mediante el parámetro k \in \mathbb{Z}:
   x = x_0 + b' k
   y = y_0 - a' k

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Condición de Solubilidad Diofántica** | ax + by = c \text{ tiene solución en } \mathbb{Z} \iff \text{MCD}(a, b) \mid c |
| **Ecuación Diofántica Reducida** | a'x + b'y = c' \quad \text{con } \text{MCD}(a', b') = 1 |
| **Solución General Paramétrica** | x = x_0 + b' k, \quad y = y_0 - a' k \quad (\forall k \in \mathbb{Z}) |
| **Condición para Soluciones Positivas (\mathbb{Z}^+)** | x_0 + b' k > 0 \land y_0 - a' k > 0 \implies -\frac{x_0}{b'} < k < \frac{y_0}{a'} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Aritmética Modular para Hallar la Solución Particular (x_0, y_0)
Dada la ecuación:
7x + 11y = 125
* **Paso Rápido:** Aplica módulo del menor coeficiente (módulo 7):
  7x + 11y = 125 \implies \overset{\circ}{7} + (\overset{\circ}{7} + 4)y = \overset{\circ}{7} + 6
  4y \equiv 6 \pmod 7
* Multiplica por 2 para que el coeficiente de y sea 8 \equiv 1 \pmod 7:
  8y \equiv 12 \pmod 7 \implies y \equiv 5 \pmod 7
* Escogemos el menor valor positivo: y_0 = 5.
* Reemplazamos directamente en la ecuación original:
  7x + 11(5) = 125 \implies 7x + 55 = 125 \implies 7x = 70 \implies x_0 = 10
* ¡Obtienes la solución particular (10, 5) en menos de 30 segundos sin tanteos ciegos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Signo del Parámetro Diofántico: "Si uno Sube, el Otro Baja"
* **Mnemotecnia:** En a'x + b'y = c' (con a', b' > 0):
  - La variable x va con + b'k (suma el coeficiente del otro).
  - La variable y va con - a'k (resta el coeficiente del otro).
* *Regla visual:* Uno lleva signo + y el otro -. Si sumas a ambos o restas a ambos, alteras el valor constante de la suma.

### 2. Desigualdad Triangular: "El Camino Recto es Siempre el Más Corto"
* **Mnemotecnia:** |x + y| es la distancia directa entre origen y punto final sumado.
* |x| + |y| es el recorrido por tramos separados.
* Solo son iguales si ambos van hacia la misma dirección (mismo signo).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Olvidar Verificar si \text{MCD}(a, b) \mid c
> Si el examen te presenta: *"Halle el número de soluciones enteras positivas de 6x + 9y = 100"*:
> - \text{MCD}(6, 9) = 3.
> - ¿Divide 3 a 100? No (100 = \overset{\circ}{3} + 1).
> - **Respuesta Inmediata:** Cero soluciones (S = \emptyset).
> Si no verificas la condición de Bezout, perderás tiempo intentando tabular valores inexistentes.

> [!WARNING]
> ### Trampa 2: La Condición de Enteros Positivos (\mathbb{Z}^+) Excluye al Cero
> Si la pregunta dice "soluciones enteras positivas", debes imponer x > 0 e y > 0 estrictamente (x \ge 1, y \ge 1).
> Si incluyes x = 0 o y = 0, estarás contando soluciones en los enteros no negativos (\mathbb{Z}_0^+), marcando el distractor.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización Logística y Empaque en la Industria Minera de Arequipa
Una empresa en Cerro Verde debe despachar 1850 \text{ kg} de reactivos utilizando exclusivamente dos tipos de contenedores estándar: bolsas de 25 \text{ kg} y cilindros reforzados de 60 \text{ kg}.
La ecuación diofántica modela la combinación exacta de embalajes sin desperdicio:
25x + 60y = 1850 \implies 5x + 12y = 370
Las soluciones enteras positivas determinan las combinaciones físicamente viables para el transporte y cubicaje óptimo.

---
