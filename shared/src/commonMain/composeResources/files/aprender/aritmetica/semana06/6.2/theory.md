## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Clasificación:**
  1. **Discreta:** Los términos medios son diferentes (b \neq c):
     \frac{a}{b} = \frac{c}{d}
     - d es la **cuarta proporcional** de a, b y c.
  2. **Continua:** Los términos medios son idénticos (b = c):
     \frac{a}{b} = \frac{b}{c} \implies b^2 = a \cdot c \implies b = \sqrt{a \cdot c} \quad (a, b, c > 0)
     - b se denomina **media proporcional** o **media geométrica** de a y c.
     - c se denomina **tercera proporcional** de a y b.

---

### 3.3 Serie de Razones Geométricas Equivalentes (SRGE)
Una SRGE es la igualdad de tres o más razones geométricas que comparten una constante común de proporcionalidad k:
\frac{a_1}{b_1} = \frac{a_2}{b_2} = \frac{a_3}{b_3} = \dots = \frac{a_n}{b_n} = k

#### Propiedades Fundamentales de las SRGE
1. **Propiedad de la Suma (Invarianza de la Razón):**
   La suma de todos los antecedentes dividida entre la suma de todos los consecuentes mantiene inalterado el valor de la constante k:
   \frac{\sum_{i=1}^n a_i}{\sum_{i=1}^n b_i} = \frac{a_1 + a_2 + \dots + a_n}{b_1 + b_2 + \dots + b_n} = k

2. **Propiedad del Producto (Multiplicación de Razones):**
   El producto de los n antecedentes dividido entre el producto de los n consecuentes es igual a la constante k elevada al número n de razones multiplicadas:
   \frac{\prod_{i=1}^n a_i}{\prod_{i=1}^n b_i} = \frac{a_1 \cdot a_2 \dots a_n}{b_1 \cdot b_2 \dots b_n} = k^n

3. **Propiedad de las Potencias y Raíces:**
   \frac{a_1^m + a_2^m + \dots + a_n^m}{b_1^m + b_2^m + \dots + b_n^m} = k^m \quad \text{y} \quad \frac{\sqrt[m]{a_1} + \dots + \sqrt[m]{a_n}}{\sqrt[m]{b_1} + \dots + \sqrt[m]{b_n}} = \sqrt[m]{k}

4. **Operaciones Combinadas por Razón:**
   Para cualquier razón \frac{a}{b} = \frac{c}{d} = k:
   \frac{a + b}{b} = \frac{c + d}{d} = k + 1, \quad \frac{a - b}{b} = \frac{c - d}{d} = k - 1, \quad \frac{a + b}{a - b} = \frac{c + d}{c - d} = \frac{k + 1}{k - 1}

---

### 3.4 Serie de Razones Geométricas Continuas Equivalentes
Es aquella donde el consecuente de cada razón es el antecedente de la razón siguiente:
\frac{a}{b} = \frac{b}{c} = \frac{c}{d} = \frac{d}{e} = k

#### Parametrización Clásica en Función del Último Consecuente (e):
Haciendo e la base del sistema:
d = e \cdot k
c = d \cdot k = e \cdot k^2
b = c \cdot k = e \cdot k^3
a = b \cdot k = e \cdot k^4
* **Relación de Extremos:**
  \frac{a}{e} = k^n \quad (n \text{ es el número de razones})

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Prop. Geométrica Discreta** | \frac{a}{b} = \frac{c}{d} \implies a \cdot d = b \cdot c \quad (d: \text{cuarta proporcional}) |
| **Prop. Geométrica Continua** | \frac{a}{b} = \frac{b}{c} \implies b = \sqrt{a \cdot c} \quad (b: \text{media proporcional}), \; c = \frac{b^2}{a} |
| **SRGE: Suma de Términos** | \frac{a_1 + a_2 + \dots + a_n}{b_1 + b_2 + \dots + b_n} = k |
| **SRGE: Producto de Términos** | \frac{a_1 \cdot a_2 \dots a_n}{b_1 \cdot b_2 \dots b_n} = k^n |
| **SRGE Continua Paramétrica** | \frac{a}{b} = \frac{b}{c} = \dots = \frac{y}{z} = k \implies \frac{\text{Primer antecedente}}{\text{Último consecuente}} = k^n |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Homogeneización de Incógnitas con la Constante k
Cuando un problema exprese relaciones compuestas del tipo:
A \text{ es a } B \text{ como } 3 \text{ es a } 5, \quad \text{y } B \text{ es a } C \text{ como } 4 \text{ es a } 7
* **Error Común:** Decir que A = 3k, B = 5k y luego B = 4k, C = 7k (inconsistente porque B tendría dos valores).
* **El Hack de la Nivelación de Término Común:**
  \frac{A}{B} = \frac{3 \times 4}{5 \times 4} = \frac{12}{20}
  \frac{B}{C} = \frac{4 \times 5}{7 \times 5} = \frac{20}{35}
* Ahora el término común B vale 20 en ambas razones:
  A = 12k, \quad B = 20k, \quad C = 35k
* ¡Resuelves cualquier sistema de 3 o más variables en una sola línea!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Truco del Nombre: "Discreta = Distinta (4 Términos), Continua = Consecutiva (Medios Iguales)"
* **Discreta:** Los 4 términos son discretos (diferentes). Por tanto, la incógnita final siempre se llama **CUARTA** (diferencial o proporcional).
* **Continua:** Los medios continúan igual (b y b). Solo hay 3 letras distintas (a, b, c), por lo que la incógnita final se llama **TERCERA** y el centro se llama **MEDIA**.

### 2. Proporción Continua: "La Cadena de Potencias de k"
* Si tienes \frac{a}{b} = \frac{b}{c} = \frac{c}{d} = k, visualízalo de derecha a izquierda:
  d, \quad c = dk, \quad b = dk^2, \quad a = dk^3
* ¡Todos los términos quedan expresados en función de solo 2 variables: d y k!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: El Orden de Mención en "Cuarta Proporcional"
> Si el enunciado dice: *"Calcule la cuarta proporcional de A, B y C"*, el orden algebraico estricto es:
> \frac{A}{B} = \frac{C}{x} \implies x = \frac{B \cdot C}{A}
> Si alteras el orden y escribes \frac{A}{C} = \frac{B}{x}, obtendrás otro valor que siempre estará colocado en las opciones como distractor premeditado.

> [!WARNING]
> ### Trampa 2: La Media Proporcional Geométrica y el Signo Negativo
> En aritmética preuniversitaria, por definición de magnitudes reales positivas, la media proporcional entre dos números positivos a y c es **siempre positiva**:
> b = +\sqrt{a \cdot c}
> No consideres la raíz negativa a menos que el problema especifique que los números pertenecen a \mathbb{Z}^-.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Dosificación de Mezclas en Ingeniería Civil y Concreto Armado
En las obras viales y edificaciones de la región Arequipa (como el puente Chilina o edificaciones antisísmicas), el diseño de mezclas de concreto se especifica mediante razones geométricas continuas de materiales:
\text{Cemento} : \text{Arena} : \text{Grava} = 1 : 2 : 3
Para un vaciado de 180\text{ m}^3 de concreto, la relación 1k + 2k + 3k = 180 \implies 6k = 180 \implies k = 30\text{ m}^3 permite dosificar con exactitud micrométrica los insumos evitando fallas estructurales por exceso o déficit de agregados.

---
