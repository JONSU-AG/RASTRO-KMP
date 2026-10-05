## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
3. **Teorema de la Altura Relativa a la Hipotenusa:**
   El cuadrado de la altura relativa a la hipotenusa es igual al producto de las proyecciones de los catetos:
   \mathbf{h^2 = m \cdot n}
4. **Teorema del Producto de Lados y Altura:**
   El producto de las longitudes de los catetos es igual al producto de la hipotenusa por la altura:
   \mathbf{c_1 \cdot c_2 = c \cdot h}
5. **Teorema de la Inversa de los Cuadrados de los Catetos:**
   \mathbf{\frac{1}{h^2} = \frac{1}{c_1^2} + \frac{1}{c_2^2}}

---

### 3.3. Relaciones Métricas en Triángulos Oblicuángulos

#### 1. Teorema de Euclides (Ley de Cosenos Geométrica):
- **Para ángulo agudo (A < 90^\circ):**
  a^2 = b^2 + c^2 - 2b \cdot m
  *(donde m es la proyección de c sobre b)*.
- **Para ángulo obtuso (A > 90^\circ):**
  a^2 = b^2 + c^2 + 2b \cdot m

#### 2. Teorema de la Mediana (Teorema de Apolonio):
En todo triángulo, la suma de los cuadrados de dos lados es igual al doble del cuadrado de la mediana relativa al tercer lado, más la mitad del cuadrado de dicho tercer lado:
\mathbf{b^2 + c^2 = 2m_a^2 + \frac{a^2}{2}}

#### 3. Fórmula de Herón de Alejandría para la Altura:
Sea el semiperímetro p = \frac{a + b + c}{2}:
\mathbf{h_a = \frac{2}{a} \sqrt{p(p - a)(p - b)(p - c)}}

#### 4. Teorema de Matthew Stewart (Ceviana Cualquiera):
Si \overline{BD} (x) es una ceviana interior que divide al lado b en segmentos m y n:
\mathbf{c^2 \cdot n + a^2 \cdot m = x^2 \cdot b + b \cdot m \cdot n}

---

### 3.4. Relaciones Métricas en la Circunferencia

1. **Teorema de las Cuerdas:**
   Si dos cuerdas se cortan en un punto interior P:
   \mathbf{PA \cdot PB = PC \cdot PD}
2. **Teorema de las Secantes:**
   Si desde un punto exterior P se trazan dos rectas secantes:
   \mathbf{PA \cdot PB = PC \cdot PD}
   *(Longitud secante total por su parte externa es constante).*
3. **Teorema de la Tangente y la Secante:**
   Si desde un punto exterior P se trazan una tangente \overline{PT} y una secante \overline{PAB}:
   \mathbf{PT^2 = PA \cdot PB}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cateto** | a^2 = c \cdot m | Proyecciones en triángulo rectángulo |
| **Altura al Cuadrado** | h^2 = m \cdot n | Media geométrica de proyecciones |
| **Inversa Cuadrados** | \frac{1}{h^2} = \frac{1}{a^2} + \frac{1}{b^2} | Relación recíproca métrica |
| **Apolonio (Mediana)** | b^2 + c^2 = 2m_a^2 + \frac{a^2}{2} | Cálculo de medianas |
| **Cuerdas** | PA \cdot PB = PC \cdot PD | Cuerdas secantes interiores |
| **Tangente** | PT^2 = PA \cdot PB | Potencia de un punto exterior |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Identificación Inmediata de Triángulos Notables de Lados Enteros
Aprende de memoria los triángulos pitagóricos primitivos para evitar calcular raíces:
- **(3, 4, 5)** y sus múltiplos (6, 8, 10), (9, 12, 15), (15, 20, 25).
- **(5, 12, 13)** y sus múltiplos (10, 24, 26).
- **(7, 24, 25)**
- **(8, 15, 17)**
- **(9, 40, 41)**
- **(20, 21, 29)**
Si ves cateto 5 e hipotenusa 13, ¡el otro cateto es 12 sin aplicar la fórmula!

### Artificio 2: Teorema de la Tangente en Cuadriláteros con Circunferencia Oculta
Cuando veas una recta tangente a una circunferencia y una secante que pasa por el centro:
**Hack:** Prolonga la secante hasta que corte el extremo opuesto de la circunferencia para tener el diámetro completo.
Así aplicas PT^2 = (d - R)(d + R) = d^2 - R^2, que es la definición analítica de la **Potencia del Punto**.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Cinco del Triángulo Rectángulo: "Cateto, Altura, Producto, Inversa y Don Pitágoras"
- **Cateto al cuadrado:** Todo el piso (hipotenusa) por su pedacito de sombra (m).
- **Altura al cuadrado:** Sombra izquierda por sombra derecha (m \cdot n).
- **Producto:** Cateto por cateto es igual a hipotenusa por altura (ab = ch).
- **Inversa:** La suma de las inversas cuadráticas de los catetos da la inversa cuadrática de la altura.

### 2. Relaciones Métricas en Circunferencia: "Todo por afuera"
En el Teorema de las Secantes:
> **"Toda la secante por su pedazo exterior."**
- \text{Total}_1 \times \text{Afuera}_1 = \text{Total}_2 \times \text{Afuera}_2.
- Si la secante se convierte en tangente, ¡el "afuera" es toda la línea! Por eso queda: \text{Tangente}^2 = \text{Total} \times \text{Afuera}.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Teorema de las Secantes NO Multiplica la Parte Interna**
> Si una secante tiene parte externa 4 y cuerda interna 6:
> El error típico: multiplicar 4 \times 6 = 24. **¡ERROR GARRAFAL!**
> La fórmula exige multiplicar la **secante total**:
> \text{Secante Total} = 4 + 6 = 10 \implies 10 \times 4 = 40

> [!CAUTION]
> **Trampa 2: Confundir Mediana con Altura en Apolonio**
> El Teorema de Apolonio b^2 + c^2 = 2m_a^2 + \frac{a^2}{2} calcula exclusivamente la **MEDIANA**.
> Si el problema te pide la altura, debes usar Herón o relaciones métricas rectangulares, no Apolonio.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Cálculo de Distancias Inaccesibles y Triangulación Geodésica en el Cañón del Colca
En la medición geodésica de las profundidades del Cañón del Colca (Arequipa), los topógrafos del Instituto Geográfico Nacional (IGN) determinan el ancho del río Colca y la altura de farallones rocosos inaccesibles mediante estaciones totales láser aplicando el Teorema de Tales y el Teorema de la Bisectriz. La relación métrica de proporcionalidad permite calcular distancias kilométricas con precisión centimétrica sin necesidad de cruzar quebradas agrestes o arriesgar vidas en desfiladeros verticales de sillar y basalto.

---
