## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Sean los polinomios dividendo D(x) y divisor d(x) con d(x) \neq 0. Dividir D(x) entre d(x) consiste en hallar dos únicos polinomios: el cociente q(x) y el resto o residuo R(x), tales que:

D(x) = d(x) \cdot q(x) + R(x) \quad \text{(Identidad Fundamental de la División)}

#### Propiedades Fundamentales de los Grados:
1. El grado del cociente es la diferencia de los grados del dividendo y divisor:
   [q] = [D] - [d]
2. El grado máximo que puede alcanzar el residuo es una unidad menor que el grado del divisor:
   [R]_{\max} = [d] - 1
3. Si la división es **exacta**, el residuo es idénticamente nulo: R(x) \equiv 0 \implies D(x) = d(x) \cdot q(x).

---

### 3.3. Algoritmos de División

#### A. Método de William G. Horner
Se emplea cuando el divisor es de segundo grado o superior ([d] \geq 2).
- **Requisito Obligatorio:** Tanto el dividendo como el divisor deben estar **completos y ordenados descendentemente**. Si falta algún término, se completa con ceros (0x^k).
- **Esquema:**
  ```text
            | Coeficientes del Dividendo D(x)
  d_0       |  c_0   c_1   c_2  |  c_3   c_4
  ----------+-------------------+------------
  -d_1      |                   |
  -d_2      |                   |
            |                   |
  ----------+-------------------+------------
            |  q_0   q_1   q_2  |  r_0   r_1
               Coef. del Cociente | Coef. del Resto
  ```
- La línea divisoria vertical se traza contando desde la derecha tantas columnas como unidades tenga el grado del divisor [d].
- El primer coeficiente del divisor conserva su signo; todos los demás coeficientes del divisor **cambian de signo**.

#### B. Regla de Paolo Ruffini
Es un caso particular del método de Horner que se aplica cuando el divisor es de **primer grado** (de la forma ax \pm b, con a \neq 0).
- **Esquema:**
  ```text
              |  D_0    D_1    D_2    D_3  |  D_n
  x = -b/a    |         ...    ...    ...  |  ...
  ------------+----------------------------+------
              |  q'_0   q'_1   q'_2   q'_3 |  R
  ÷ a         |  ------------------------  |
  Cociente real: q_0    q_1    q_2    q_3  |  Resto exacto
  ```
> [!IMPORTANT]
> **El paso de oro en Ruffini:** Si el divisor es ax + b con a \neq 1, los coeficientes obtenidos en la base de la tabla corresponden a un cociente falso q'(x). **¡Deben dividirse todos entre a** para obtener los coeficientes del cociente verdadero q(x)! El resto R **no** se divide entre a.

---

### 3.4. Teorema del Resto (René Descartes)
Permite calcular el residuo de una división polinómica **sin necesidad de efectuar la operación**.

#### Regla Práctica:
1. Se iguala el divisor a cero: d(x) = 0.
2. Se despeja la variable o una expresión conveniente de grado conveniente (por ejemplo, x = k o x^2 = k).
3. Dicho valor se reemplaza directamente en el dividendo D(x).
4. El resultado numérico o polinómico obtenido tras la simplificación es el **resto** R(x).

#### Teorema del Factor:
Un polinomio P(x) es divisible entre (x - c) si y solo si P(c) = 0. En tal caso, decimos que c es una **raíz o cero** de P(x), y (x - c) es un **factor algebraico** de P(x).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Diferencia de Cubos** | a^3 - b^3 = (a-b)(a^2 + ab + b^2) | Racionalización y factorización |
| **Argand** | (x^2+x+1)(x^2-x+1) = x^4+x^2+1 | Productos de cuarto grado |
| **Condicional Cúbica** | a+b+c=0 \implies a^3+b^3+c^3 = 3abc | Problemas típicos de admisión |
| **Algoritmo División** | D(x) \equiv d(x)q(x) + R(x) | Todo par de polinomios con d(x) \neq 0 |
| **Grado del Resto** | \text{gr}(R) \leq \text{gr}(d) - 1 | Límite superior del grado del residuo |
| **Teorema del Resto** | R = D(-b/a) para d(x) = ax+b | Cálculo instantáneo de residuos |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Despeje en Bloque en el Teorema del Resto
Cuando el divisor no es lineal, por ejemplo d(x) = x^2 + x + 1:
**¡No intentes despejar x usando números complejos!**
**Hack:**
1. Igualas el divisor a cero: x^2 + x + 1 = 0 \implies x^2 + x = -1, o bien multiplicas por (x - 1):
   (x - 1)(x^2 + x + 1) = 0 \implies x^3 - 1 = 0 \implies x^3 = 1 \quad (\text{con } x \neq 1)
2. Expresas todo el dividendo D(x) en potencias de x^3:
   D(x) = x^{99} + x^{44} + 5 = (x^3)^{33} + (x^3)^{14} \cdot x^2 + 5
3. Reemplazas x^3 = 1:
   R(x) = (1)^{33} + (1)^{14} x^2 + 5 = x^2 + 6
4. Como el residuo no puede tener grado igual al divisor ([R] < 2), sustituyes x^2 = -x - 1:
   R(x) = (-x - 1) + 6 = -x + 5
¡Resuelto en 30 segundos sin dividir!

### Artificio 2: Reconstrucción Inversa en Horner (División con Coeficientes Desconocidos)
Si los coeficientes desconocidos están en el **dividendo** al principio (en las potencias más altas) y te dan de dato que la división es exacta, ¡invierte el orden de todos los polinomios!
- Coloca dividendo y divisor desde el término independiente hacia el grado mayor.
- El cociente se invierte, pero el residuo sigue siendo exactamente cero.
- Así calculas los coeficientes incógnita al final, evitando resolver sistemas de ecuaciones lineales engorrosos.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Signo Traicionero en Cubos: "Mismo, Opuesto, Siempre Positivo" (M-O-P)
Al descomponer suma o diferencia de cubos:
- a^3 \mathbf{+} b^3 = (a \mathbf{+} b)(a^2 \mathbf{-} ab \mathbf{+} b^2)
- a^3 \mathbf{-} b^3 = (a \mathbf{-} b)(a^2 \mathbf{+} ab \mathbf{+} b^2)
> **Regla M-O-P:**
> - Primer signo del binomio: **M**ismo signo del cubo.
> - Signo del término central del trinomio: **O**puesto.
> - Último signo del trinomio: **P**ositivo siempre.

### 2. Algoritmo de Horner: "Divide, Multiplica, Suma, Repite" (D-M-S)
En cada columna de la matriz de Horner:
1. **D**ivide el acumulado entre el pivote (esquina superior izquierda).
2. **M**ultiplica el resultado por los coeficientes de signo cambiado y colócalos a la derecha.
3. **S**uma la siguiente columna para obtener el nuevo acumulado.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Olvidar Dividir entre a en Ruffini**
> Cuando divides P(x) entre 3x - 2, la raíz es x = 2/3.
> Al terminar la fila inferior de Ruffini, obtienes los coeficientes [6, -9, 12].
> **El 70% de postulantes marca:** q(x) = 6x^2 - 9x + 12. **¡INCORRECTO!**
> Ese es el cociente falso. El cociente verdadero es:
> q(x) = \frac{6x^2 - 9x + 12}{3} = 2x^2 - 3x + 4

> [!CAUTION]
> **Trampa 2: Omitir los Ceros en Polinomios Incompletos**
> Si el dividendo es D(x) = 2x^5 - 3x^2 + 7:
> Los coeficientes para Horner o Ruffini **no son** [2, -3, 7].
> Son: [2, \ 0, \ 0, \ -3, \ 0, \ 7].
> Si olvidas completar con ceros las columnas de x^4, x^3 y x^1, el cálculo de toda la tabla colapsará.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Dinámica de Fluidos y Control en la Represa de Condoroma (Majes-Siguas)
En la ingeniería hidráulica del sistema de irrigación Majes-Siguas en Arequipa, el caudal volumétrico no lineal de descarga a través de compuertas radiales sometidas a presiones variables se aproxima mediante la división de polinomios de carga hidrostática Q(h) = \frac{D(h)}{d(h)}. La determinación del residuo R(h) mediante el Teorema del Resto permite calcular la pérdida de energía por vórtices turbulentos y disipación viscosa en la solera de sillar y concreto sin necesidad de integrar numéricamente ecuaciones diferenciales complejas en tiempo real.

---
