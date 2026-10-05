## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
4. **Término Central (a_c):**
   Si el número de términos n es impar, existe un único término central:
   a_c = \frac{a_1 + a_n}{2}
5. **Suma de los n Primeros Términos (S_n):**
   S_n = \left( \frac{a_1 + a_n}{2} \right) \cdot n = \left[ \frac{2a_1 + (n - 1)r}{2} \right] \cdot n
   Si n es impar: S_n = a_c \cdot n.
6. **Interpolación de m Medios Aritméticos (o Diferenciales):**
   Interpolar m medios aritméticos entre dos extremos A y B consiste en formar una P.A. de n = m + 2 términos donde a_1 = A y a_n = B. La razón común viene dada por:
   r = \frac{B - A}{m + 1}

---

### 3.4 Progresión Geométrica (P.G.)
Una P.G. es una sucesión en la cual cada término (a partir del segundo) se obtiene multiplicando el término anterior por una constante no nula q denominada **razón geométrica**:
t_n = t_{n-1} \cdot q \iff \frac{t_n}{t_{n-1}} = q \quad (\forall n \ge 2, \; q \neq 0)

#### Propiedades Fundamentales de la P.G.
1. **Término Enésimo (t_n):**
   t_n = t_1 \cdot q^{n - 1}
2. **Términos Equidistantes de los Extremos:**
   El producto de dos términos equidistantes de los extremos es constante e igual al producto de los extremos:
   t_k \cdot t_{n-k+1} = t_1 \cdot t_n
3. **Término Central (t_c):**
   Si n es impar:
   t_c = \sqrt{t_1 \cdot t_n}
4. **Suma de los n Primeros Términos (S_n para q \neq 1):**
   S_n = t_1 \cdot \frac{q^n - 1}{q - 1} = \frac{t_n \cdot q - t_1}{q - 1}
5. **Suma Límite de una P.G. Decreciente Infinita (S_\infty):**
   Si la progresión tiene infinitos términos y el valor absoluto de la razón es estrictamente menor que 1 (|q| < 1, es decir, -1 < q < 1 con q \neq 0), la suma converge a:
   S_\infty = \lim_{n \to \infty} S_n = \frac{t_1}{1 - q}
6. **Producto de los n Primeros Términos (P_n):**
   P_n = \sqrt{(t_1 \cdot t_n)^n} = (t_1 \cdot t_n)^{n/2}
7. **Interpolación de m Medios Geométricos (o Proporcionales):**
   Para formar una P.G. de n = m + 2 términos entre A y B:
   q = \sqrt[m + 1]{\frac{B}{A}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **P.A.: Razón de Interpolación** | r = \frac{B - A}{m + 1} |
| **P.G.: Término General** | t_n = t_1 \cdot q^{n - 1} |
| **P.G.: Suma Finita (q \neq 1)** | S_n = t_1 \left( \frac{q^n - 1}{q - 1} \right) |
| **P.G.: Suma Límite (|q| < 1)** | S_\infty = \frac{t_1}{1 - q} |
| **P.G.: Producto de Términos** | P_n = \sqrt{(t_1 \cdot t_n)^n} |
| **P.G.: Razón de Interpolación** | q = \sqrt[m + 1]{\frac{B}{A}} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Elección Simétrica de Variables para Ahorrar Tiempo
Cuando un problema mencione que 3 o 4 términos están en P.A. o P.G.:
* **3 términos en P.A. cuya suma se conoce:**
  No uses x, x + r, x + 2r.
  Usa términos simétricos:
  (x - r), \quad x, \quad (x + r)
  Al sumarlos: (x - r) + x + (x + r) = 3x = \text{Suma} \implies x \text{ se halla de inmediato sin operar } r.
* **3 términos en P.G. cuyo producto se conoce:**
  Usa:
  \frac{x}{q}, \quad x, \quad x \cdot q
  Al multiplicarlos: \left(\frac{x}{q}\right) \cdot x \cdot (xq) = x^3 = \text{Producto} \implies x = \sqrt[3]{\text{Producto}}.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Conteo de Cifras: "N más Uno por Cifras Menos Puros Unos"
* (N + 1) \times (\text{cifras}) - 111\dots1
* Para N = 75 (2 cifras): (75 + 1) \cdot 2 - 11 = 152 - 11 = 141 cifras.
* Para N = 450 (3 cifras): (450 + 1) \cdot 3 - 111 = 1353 - 111 = 1242 cifras.

### 2. Suma Límite Infinita: "Primero Sobre Uno Menos Razón"
* S_\infty = \frac{t_1}{1 - q}
* Recuerda: *"El primer término arriba intacto; abajo, lo que le falta a la razón para llegar al uno"*.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: El Número de Medios Interpolados frente al Número Total de Términos
> Si el examen solicita: *"Interpolar 5 medios aritméticos entre 8 y 56"*:
> - El número total de términos de la P.A. **NO es 5, sino n = 5 + 2 = 7**.
> - En el denominador de la razón va m + 1 = 5 + 1 = 6:
>   r = \frac{56 - 8}{6} = \frac{48}{6} = 8
> Si divides entre 5, obtendrás un valor no entero erróneo.

> [!WARNING]
> ### Trampa 2: Aplicar Suma Límite a Progresiones Divergentes (|q| \ge 1)
> La fórmula S_\infty = \frac{t_1}{1 - q} es válida **ÚNICAMENTE** cuando la razón satisface estrictamente:
> -1 < q < 1 \quad (q \neq 0)
> Si te presentan una serie donde q = \frac{4}{3} > 1 y aplicas la fórmula ciega, obtendrás un resultado negativo absurdo para una suma de términos positivos. La serie diverge a +\infty.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Rebote de Pelotas y Amortiguamiento Mecánico en Sismos
En ensayos del Laboratorio de Estructuras de la Facultad de Ingeniería Civil de la UNSA, se suelta una esfera elástica desde una altura inicial de H = 27\text{ metros}. Cada vez que rebota contra la losa de ensayo, se eleva hasta las \frac{2}{3} partes de la altura anterior.
El recorrido total vertical de la esfera hasta quedar en reposo teórico se modela como una suma límite infinita:
\text{Distancia} = H + 2 \sum_{k=1}^\infty H \left(\frac{2}{3}\right)^k = H + 2 \cdot \frac{H \cdot \frac{2}{3}}{1 - \frac{2}{3}} = 27 + 2 \cdot \frac{18}{\frac{1}{3}} = 27 + 108 = 135\text{ metros}

---
