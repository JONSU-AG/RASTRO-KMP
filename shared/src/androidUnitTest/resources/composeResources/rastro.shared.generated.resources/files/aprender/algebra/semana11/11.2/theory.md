## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.3. Módulo de un Número Complejo
El módulo (o norma euclidiana) de z = a + bi, denotado por |z| o \rho, representa la distancia geométrica desde el origen de coordenadas hasta el afijo del complejo en el plano de Argand-Gauss:

|z| = \sqrt{a^2 + b^2}, \quad \text{con } |z| \geq 0

#### Teoremas Fundamentales del Módulo:
1. |z| = |\bar{z}| = |-z| = |-\bar{z}|
2. z \cdot \bar{z} = |z|^2 = a^2 + b^2
3. |z \cdot w| = |z| \cdot |w|
4. \left|\frac{z}{w}\right| = \frac{|z|}{|w|}, \quad (w \neq 0)
5. |z^n| = |z|^n, \quad \forall n \in \mathbb{Z}
6. **Desigualdad Triangular:**
   ||z| - |w|| \leq |z \pm w| \leq |z| + |w|

---

### 3.4. Resultados Notables de Examen de Admisión
\frac{1 + i}{1 - i} = i, \qquad \frac{1 - i}{1 + i} = -i
(1 + i)^2 = 2i, \qquad (1 - i)^2 = -2i
(1 + i)^4 = -4, \qquad (1 - i)^4 = -4
\frac{1}{i} = -i

---

### 3.5. Forma Polar (Trigonométrica) y Teorema de De Moivre
Todo complejo no nulo z = a + bi puede ubicarse en el plano complejo mediante coordenadas polares (r, \theta):

z = r(\cos \theta + i \sin \theta) = r \text{ cis } \theta
Donde:
- **Módulo:** r = |z| = \sqrt{a^2 + b^2}.
- **Argumento Principal (\text{Arg}(z)):** Es el ángulo medido en sentido antihorario desde el semieje real positivo hasta el vector posición, restringido al intervalo:
  \theta \in \langle -\pi, \ \pi] \quad \text{o} \quad [0, \ 2\pi\rangle
  \tan \theta = \frac{b}{a} *(tomando en cuenta el cuadrante del afijo (a, b))*.

#### Teorema de Abraham De Moivre:
Para cualquier exponente entero n \in \mathbb{Z}:
z^n = [r \text{ cis } \theta]^n = r^n [\cos(n\theta) + i \sin(n\theta)] = r^n \text{ cis}(n\theta)

#### Forma Exponencial de Leonhard Euler:
e^{i\theta} = \cos \theta + i \sin \theta \implies z = r e^{i\theta}
- **Identidad de Euler (la fórmula más bella de las matemáticas):**
  e^{i\pi} + 1 = 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cociente Notable** | \frac{1+i}{1-i} = i \quad \land \quad \frac{1-i}{1+i} = -i | Simplificaciones instantáneas |
| **Cuadrados Notables** | (1 \pm i)^2 = \pm 2i | Reducción de potencias altas |
| **Producto Polar** | r_1 \text{ cis}(\theta_1) \cdot r_2 \text{ cis}(\theta_2) = r_1 r_2 \text{ cis}(\theta_1 + \theta_2) | Multiplicación angular |
| **Cociente Polar** | \frac{r_1 \text{ cis}(\theta_1)}{r_2 \text{ cis}(\theta_2)} = \frac{r_1}{r_2} \text{ cis}(\theta_1 - \theta_2) | División angular |
| **De Moivre** | z^n = r^n \text{ cis}(n\theta) | Potenciación trigonométrica |
| **Euler** | e^{i\theta} = \cos \theta + i \sin \theta | Notación exponencial compacta |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Reducción de Potencias Altas de Binomios Complejos
Si te piden calcular (1 + i)^{40}:
**¡Jamás uses el binomio de Newton con 41 términos!**
**Hack:** Eleva primero al cuadrado usando la identidad notable (1 + i)^2 = 2i:
(1 + i)^{40} = \left[(1 + i)^2\right]^{20} = (2i)^{20} = 2^{20} \cdot i^{20}
Como 20 es múltiplo de 4, i^{20} = 1:
(1 + i)^{40} = 2^{20} \cdot 1 = 2^{20} = 1\ 048\ 576
¡Resuelto en 5 segundos!

### Artificio 2: El Módulo de un Producto o Cociente Monstruoso
Si te piden hallar el módulo de:
Z = \frac{(3 + 4i)^4 \cdot (5 - 12i)^2}{(1 + i)^6 \cdot (\sqrt{3} + i)^8}
**¡No multipliques los números complejos!**
**Hack:** Aplica la propiedad de distribución del módulo:
|Z| = \frac{|3 + 4i|^4 \cdot |5 - 12i|^2}{|1 + i|^6 \cdot |\sqrt{3} + i|^8}
Calculas cada módulo pitagórico elemental:
- |3 + 4i| = \sqrt{3^2 + 4^2} = 5
- |5 - 12i| = \sqrt{5^2 + 12^2} = 13
- |1 + i| = \sqrt{1^2 + 1^2} = \sqrt{2}
- |\sqrt{3} + i| = \sqrt{3 + 1} = 2
Sustituyes:
|Z| = \frac{5^4 \cdot 13^2}{(\sqrt{2})^6 \cdot 2^8} = \frac{625 \cdot 169}{2^3 \cdot 256} = \frac{105\ 625}{2048}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Flecha Cuaternaria de Potencias de i
> **"Uno, i, Menos Uno, Menos i" (1, i, -1, -i)**
- Divide el exponente entre 4 y quédate únicamente con el **residuo**:
  - Residuo 0 \to 1
  - Residuo 1 \to i
  - Residuo 2 \to -1
  - Residuo 3 \to -i
- *Ejemplo relámpago:* i^{2027} = i^{4(506) + 3} = i^3 = -i.

### 2. Multiplicación y División Polar: "Los Módulos se Operan, los Ángulos se Suman o Restan"
- Si multiplicas: multiplicas los radios y **sumas** los ángulos.
- Si divides: divides los radios y **restas** los ángulos.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Producto de Radicales Negativos**
> En los reales se cumple que \sqrt{a} \cdot \sqrt{b} = \sqrt{ab} para a, b \geq 0.
> Pero si calculas \sqrt{-4} \cdot \sqrt{-9}:
> **El error mortal del postulante:** \sqrt{(-4)(-9)} = \sqrt{36} = 6. **¡FATAL ERROR!**
> La regla estricta exige extraer primero la unidad imaginaria i:
> \sqrt{-4} \cdot \sqrt{-9} = (2i) \cdot (3i) = 6 i^2 = 6(-1) = -6

> [!CAUTION]
> **Trampa 2: La Parte Imaginaria NO Incluye la Letra i**
> Si z = 7 - 9i:
> ¿Cuánto vale \text{Im}(z)?
> El distractor clásico en las claves de la UNSA es -9i.
> **La respuesta correcta es:** \text{Im}(z) = -9. Es un número puramente real.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Análisis Fasorial en Sistemas de Potencia Eléctrica en la Central Hidroeléctrica de Charcani V
En la central subterránea de Charcani V (ubicada en las faldas del Misti a orillas del río Chili en Arequipa), los ingenieros electricistas analizan el flujo de potencia alterna trifásica mediante fasores complejos. El voltaje se modela como V = |V| e^{i\theta} y la impedancia de las líneas como Z = R + iX_L, donde la resistencia R disipa energía térmica y la reactancia inductiva X_L almacena campo magnético. La multiplicación y división de números complejos en forma polar es la herramienta matemática que permite calcular la potencia reactiva en volt-amperios reactivos (VAR) y evitar caídas de tensión en el alumbrado público de la ciudad blanca.

---
