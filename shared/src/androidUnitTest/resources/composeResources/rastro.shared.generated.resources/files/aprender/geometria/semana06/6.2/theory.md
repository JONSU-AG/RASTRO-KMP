## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
6. **Medida de un ángulo interior (\alpha_i):**
   \mathbf{\alpha_i = \frac{180^\circ(n - 2)}{n}}
7. **Medida de un ángulo exterior (\alpha_e):**
   \mathbf{\alpha_e = \frac{360^\circ}{n}}
8. **Medida del ángulo central (\alpha_c - exclusivo de regulares):**
   \mathbf{\alpha_c = \frac{360^\circ}{n} = \alpha_e}

---

### 3.3. Cuadriláteros y Clasificación Rigurosa
Un **cuadrilátero** es un polígono de cuatro lados (n = 4). La suma de sus ángulos interiores es 180^\circ(4 - 2) = 360^\circ, y la suma de sus ángulos exteriores es 360^\circ.

#### A. Trapezoide (Sin lados paralelos):
1. **Trapezoide Asimétrico:** No presenta ningún tipo de simetría ni paralelismo.
2. **Trapezoide Simétrico (Deltoide o Cometa):** Formado por dos triángulos isósceles unidos por su base común. Sus diagonales son perpendiculares y la diagonal principal actúa como mediatriz de la otra y bisectriz de los ángulos correspondientes.

#### B. Trapecio (Exactamente dos lados opuestos paralelos):
Los lados paralelos son las **bases** (base menor b y base mayor B). Los otros dos lados son no paralelos.
- **Tipos de Trapecios:**
  - **Trapecio Escaleno:** Lados no paralelos de diferente longitud.
  - **Trapecio Rectángulo:** Un lado no paralelo es perpendicular a las bases (determina dos ángulos rectos y su longitud es la altura h).
  - **Trapecio Isósceles:** Lados no paralelos de igual longitud. Sus ángulos en la base son congruentes y **sus diagonales son exactamente de igual longitud**.
- **Teorema de la Mediana del Trapecio (Base Media M):**
  Une los puntos medios de los lados no paralelos. Es paralela a las bases y mide su semisuma:
  \mathbf{M = \frac{B + b}{2}}
- **Teorema del Segmento entre los Puntos Medios de las Diagonales (PQ):**
  Es paralelo a las bases y su longitud es igual a la semidiferencia de las bases:
  \mathbf{PQ = \frac{B - b}{2}}

#### C. Paralelogramo (Lados opuestos paralelos dos a dos):
- **Propiedades Universales:**
  1. Lados opuestos de igual longitud (AB = CD \land BC = AD).
  2. Ángulos opuestos de igual medida (\angle A = \angle C \land \angle B = \angle D).
  3. Ángulos consecutivos suplementarios (\alpha + \beta = 180^\circ).
  4. **Las diagonales se bisecan mutuamente en su punto medio común.**
- **Tipos de Paralelogramos:**
  1. **Romboide:** Paralelogramo general de lados y ángulos oblicuos.
  2. **Rombo (Losange):** Sus 4 lados son congruentes. Sus diagonales son **perpendiculares y bisectrices** de sus ángulos interiores.
  3. **Rectángulo (Cuadrilongo):** Sus 4 ángulos son rectos (90^\circ). Sus **diagonales son de igual longitud** y se cortan en su punto medio.
  4. **Cuadrado:** Paralelogramo regular que combina las propiedades del rombo y del rectángulo: 4 lados iguales, 4 ángulos rectos, diagonales iguales, perpendiculares y bisectrices a 45^\circ.

#### Teorema de Pierre Varignon:
En cualquier cuadrilátero convexo o no convexo, los puntos medios de sus cuatro lados determinan siempre los vértices de un **paralelogramo**.
- El perímetro de dicho paralelogramo es igual a la suma de las diagonales del cuadrilátero original:
  2p_{\text{Varignon}} = d_1 + d_2
- El área del paralelogramo de Varignon es exactamente la **mitad del área total del cuadrilátero**.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Ángulo Exterior Regular** | \alpha_e = \frac{360^\circ}{n} | Coincide con ángulo central |
| **Mediana de Trapecio** | M = \frac{B + b}{2} | Paralela a las bases |
| **Puntos Medios Diagonales** | PQ = \frac{B - b}{2} | Segmento entre diagonales |
| **Varignon** | \text{Área}(MNPQ) = \frac{\text{Área}(ABCD)}{2} | Puntos medios cuadrilátero |
| **Pitot** | AB + CD = BC + AD | Cuadrilátero circunscrito |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Trazo Paralelo en Trapecios Escalenos
En cualquier trapecio ABCD donde conozcas los ángulos de la base o los lados no paralelos:
**¡No bajes dos alturas generando tres figuras!**
**Hack:** Por el vértice de la base menor B, **traza una paralela al lado no paralelo opuesto \overline{CD}**.
Esto descompone el trapecio instantáneamente en:
- Un **paralelogramo** a la derecha (lados CD y base b).
- Un **triángulo** a la izquierda cuya base mide directamente B - b, donde puedes aplicar Pitágoras o ángulos notables al instante.

### Artificio 2: Polígono Regular a partir del Ángulo Exterior
Si el problema dice: *"El ángulo interior de un polígono regular mide 150^\circ"*:
**¡Jamás uses la fórmula con fracciones 150 = \frac{180(n - 2)}{n}!** Eso toma 4 pasos algebraicos.
**Hack:** Pasa de inmediato al ángulo exterior por suplemento:
\alpha_e = 180^\circ - 150^\circ = 30^\circ
Ahora divide 360^\circ entre el ángulo exterior:
n = \frac{360^\circ}{\alpha_e} = \frac{360^\circ}{30^\circ} = 12 \text{ lados (Dodecágono)}
¡Calculado mentalmente en 3 segundos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mediana vs. Segmento entre Diagonales del Trapecio: "Suma la grande, Resta la chica"
- **Mediana (Larga, abarca todo el cuerpo):** Semisuma: \frac{\text{Base Mayor } \mathbf{+} \text{ Base Menor}}{2}.
- **Segmento entre diagonales (Corto, solo el pedacito central):** Semidiferencia: \frac{\text{Base Mayor } \mathbf{-} \text{ Base Menor}}{2}.

### 2. Diagonales del Rombo: "La Cruz Perfecta"
El rombo es como una cometa perfecta:
- Sus diagonales forman una cruz ortogonal de 90^\circ.
- Cortan a los ángulos exactamente por la mitad (bisectrices).
- Se parten en cuatro triángulos rectángulos congruentes.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Nombre del Polígono de 9 y 11 Lados**
> - n = 9: Se llama **Nonágono** o **Eneágono** (no confundir con endecágono).
> - n = 11: Se llama **Endecágono** o **Undecágono**.
> Muchos postulantes marcan "Endecágono" creyendo que es 9 por sonar a "nueve".

> [!CAUTION]
> **Trampa 2: Las Diagonales del Rectángulo NO son Perpendiculares**
> El rectángulo tiene diagonales iguales, pero **NO son perpendiculares** (salvo que sea un cuadrado).
> El rombo tiene diagonales perpendiculares, pero **NO son de igual longitud** (salvo que sea un cuadrado).
> ¡El único que tiene diagonales iguales y perpendiculares a la vez es el **CUADRADO**!

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Estructura de Gaviones y Defensas Ribereñas en la Torrentera de San Lázaro
En las obras de ingeniería hidráulica para el control de huaycos en las torrenteras de San Lázaro y Los Incas en Arequipa, los diques de contención se construyen con muros de gaviones de sección trapezoidal. El diseño de trapecio isósceles con base mayor ancha B y base menor b en la corona permite que la resultante de empuje hidrostático y lodo pase por el tercio central de la base media, evitando el colapso por vuelco o deslizamiento. Los cálculos de volumen de piedra de sillar emplean directamente la fórmula de la mediana del trapecio multiplicada por la altura del muro.

---

## Criterios de semejanza de triángulos

Dos triángulos semejantes conservan sus ángulos correspondientes y tienen lados proporcionales. Los criterios son AA (dos ángulos correspondientes iguales), LAL (dos pares de lados proporcionales y el ángulo comprendido igual) y LLL (los tres pares de lados proporcionales). El orden de los vértices determina la correspondencia: no se comparan lados por su posición aparente en el dibujo.

Si la razón entre longitudes correspondientes es k, la de perímetros es k y la de áreas es k². Dos figuras a escala 3 tienen áreas a escala 9. La congruencia es el caso particular k = 1; semejanza no significa necesariamente igualdad de tamaño.
