## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Sean x_1 y x_2 las raíces de ax^2 + bx + c = 0:
1. **Suma de Raíces (S):**
   S = x_1 + x_2 = -\frac{b}{a}
2. **Producto de Raíces (P):**
   P = x_1 \cdot x_2 = \frac{c}{a}
3. **Diferencia de Raíces (|D|):**
   A través de la Identidad de Legendre:
   (x_1 + x_2)^2 - (x_1 - x_2)^2 = 4x_1 x_2 \implies |x_1 - x_2| = \frac{\sqrt{\Delta}}{|a|}

#### Casos Particulares de Raíces Cuadráticas:
- **Raíces Simétricas u Opuestas:**
  x_1 + x_2 = 0 \iff b = 0 \quad (\text{las raíces son de la forma } r \text{ y } -r)
- **Raíces Recíprocas o Inversas:**
  x_1 \cdot x_2 = 1 \iff c = a \quad \left(\text{las raíces son de la forma } r \text{ y } \frac{1}{r}\right)
- **Raíz Nula (x = 0):**
  c = 0

#### Reconstrucción de la Ecuación Cuadrática:
Dadas la suma S y el producto P de dos números:
x^2 - S x + P = 0

---

### 3.4. Ecuaciones Bicuadradas (Cuarto Grado Canónico)
Una **ecuación bicuadrada** es una ecuación polinómica de cuarto grado que contiene únicamente potencias pares de la incógnita:

a x^4 + b x^2 + c = 0, \quad \text{con } a \neq 0; \ a, b, c \in \mathbb{R}

#### Propiedades Estructurales de sus Cuatro Raíces:
Al hacer el cambio de variable y = x^2, la ecuación se reduce a a y^2 + b y + c = 0.
Si sus raíces en y son y_1 e y_2, entonces las cuatro raíces en x son:
x = \pm \sqrt{y_1}, \quad x = \pm \sqrt{y_2}
Por tanto, las cuatro raíces de toda ecuación bicuadrada son **simétricas dos a dos**:
\text{Raíces} = \{m, -m, n, -n\}

#### Relaciones de Cardano-Viète en Bicuadradas:
1. **Suma de las cuatro raíces:**
   x_1 + x_2 + x_3 + x_4 = m + (-m) + n + (-n) = 0
2. **Suma de productos binarios:**
   x_1 x_2 + x_1 x_3 + \dots = -m^2 - n^2 = -\frac{b}{a} \implies m^2 + n^2 = -\frac{b}{a}
3. **Producto de las cuatro raíces:**
   x_1 \cdot x_2 \cdot x_3 \cdot x_4 = (m)(-m)(n)(-n) = m^2 n^2 = \frac{c}{a}

#### Reconstrucción de una Ecuación Bicuadrada:
Si se conocen dos raíces no simétricas m y n:
x^4 - (m^2 + n^2) x^2 + m^2 n^2 = 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Diferencia de Raíces** | \|x_1 - x_2\| = \frac{\sqrt{\Delta}}{\|a\|} | Vía Legendre |
| **Reconstrucción Cuadrática** | x^2 - Sx + P = 0 | S = x_1+x_2, \ P = x_1 x_2 |
| **Raíces Simétricas** | x_1 + x_2 = 0 \iff b = 0 | Raíces opuestas |
| **Raíces Recíprocas** | x_1 x_2 = 1 \iff a = c | Raíces inversas |
| **Cardano Bicuadrada** | m^2 + n^2 = -b/a \quad \land \quad m^2 n^2 = c/a | Raíces: \{m, -m, n, -n\} |
| **Reconstrucción Bicuadrada** | x^4 - (m^2 + n^2)x^2 + m^2 n^2 = 0 | Cuarto grado simétrico |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Reconstrucción Rápida de la Suma de Cuadrados y Cubos de Raíces
Si tienes a x^2 + b x + c = 0 y te piden x_1^2 + x_2^2 o x_1^3 + x_2^3:
**¡Jamás resuelvas la ecuación cuadrática por fórmula general para luego elevar las raíces al cuadrado o al cubo!**
**Hack:** Usa directamente los productos notables sobre la suma S y el producto P:
x_1^2 + x_2^2 = S^2 - 2P
x_1^3 + x_2^3 = S^3 - 3PS
Esto reduce el tiempo de resolución de 4 minutos a 15 segundos.

### Artificio 2: Cambio de Variable Fraccionario en Ecuaciones Recíprocas de Cuarto Grado
Dada una ecuación simétrica de cuarto grado:
a x^4 + b x^3 + c x^2 + b x + a = 0
**Hack:**
1. Divide toda la ecuación entre x^2:
   a\left(x^2 + \frac{1}{x^2}\right) + b\left(x + \frac{1}{x}\right) + c = 0
2. Haz el cambio de variable u = x + \frac{1}{x} \implies x^2 + \frac{1}{x^2} = u^2 - 2.
3. La ecuación se transforma en una cuadrática simple en u:
   a(u^2 - 2) + bu + c = 0

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Semáforo del Discriminante (\Delta)
> **"Verde (Positivo), Amarillo (Cero), Rojo (Negativo)"**
- **\Delta > 0 (Verde - Vía libre):** 2 raíces reales distintas.
- **\Delta = 0 (Amarillo - Precaución):** 1 raíz doble (son gemelas).
- **\Delta < 0 (Rojo - Alto al mundo real):** Se sale de \mathbb{R}, entra al mundo de los complejos imaginarios.

### 2. Ecuaciones Bicuadradas: "Parejas de Baile Gemelas"
En toda ecuación bicuadrada, las raíces nunca van solas:
- Si entra el 3, obligatoriamente entra su gemelo opuesto -3.
- Si entra el 2i, obligatoriamente entra -2i.
- Por eso: **¡La suma total de las 4 raíces siempre es CERO!**

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Coeficiente Principal Paramétrico (a \neq 0)**
> Si el problema dice: *"La ecuación cuadrática (k - 2)x^2 + 5x + 3 = 0 tiene solución única"*:
> El estudiante novato calcula \Delta = 0.
> **¡CUIDADO!** Si k = 2, el término cuadrático desaparece y la ecuación se convierte en 5x + 3 = 0 \implies x = -3/5, ¡que también tiene solución única!
> La pregunta debe indicar si se mantiene como ecuación de segundo grado obligatoriamente.

> [!CAUTION]
> **Trampa 2: Raíz Doble vs. Conjunto Solución**
> Si una ecuación cuadrática tiene como raíz doble x = 4:
> - Sus raíces son: x_1 = 4 y x_2 = 4 (posee dos raíces).
> - Su Conjunto Solución es: C.S. = \{4\} (posee **un solo elemento**).
> ¡Muchos postulantes fallan cuando la pregunta pide: "Indique el cardinal del conjunto solución"! El cardinal es 1, no 2.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Balística y Trayectoria Parabólica en la Topografía del Misti
En los cálculos de prevención de riesgo volcánico del Observatorio Vulcanológico del INGEMMET en Arequipa, la trayectoria de los proyectiles balísticos eyectados por el cráter del volcán Misti se modela mediante la función cinemática cuadrática de altura:
h(t) = h_0 + v_{0y} t - \frac{1}{2} g t^2
La determinación del tiempo de impacto en la base de la quebrada corresponde a resolver la ecuación cuadrática h(t) = 0. El discriminante \Delta permite determinar si el proyectil logra franquear una cresta topográfica intermedia de sillar (\Delta > 0), si apenas roza la cumbre (\Delta = 0), o si colisiona antes de la cima.

---
