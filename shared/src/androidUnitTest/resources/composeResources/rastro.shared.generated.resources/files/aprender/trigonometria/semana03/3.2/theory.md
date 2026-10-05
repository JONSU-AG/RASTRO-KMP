## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
*Ejemplo de aplicación:* \sin(2x + 15^\circ) = \cos(3x + 25^\circ) \implies (2x + 15^\circ) + (3x + 25^\circ) = 90^\circ \implies 5x + 40^\circ = 90^\circ \implies x = 10^\circ.

---

### 3.3. Triángulos Rectángulos Notables y Aproximados

| Ángulo | \sin | \cos | \tan | \cot | \sec | \csc | Lados del Triángulo |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :--- |
| **30^\circ** | \frac{1}{2} | \frac{\sqrt{3}}{2} | \frac{\sqrt{3}}{3} | \sqrt{3} | \frac{2\sqrt{3}}{3} | 2 | Catetos: 1, \sqrt{3}; Hipotenusa: 2 |
| **45^\circ** | \frac{\sqrt{2}}{2} | \frac{\sqrt{2}}{2} | 1 | 1 | \sqrt{2} | \sqrt{2} | Catetos: 1, 1; Hipotenusa: \sqrt{2} |
| **60^\circ** | \frac{\sqrt{3}}{2} | \frac{1}{2} | \sqrt{3} | \frac{\sqrt{3}}{3} | 2 | \frac{2\sqrt{3}}{3} | Catetos: \sqrt{3}, 1; Hipotenusa: 2 |
| **37^\circ** | \frac{3}{5} | \frac{4}{5} | \frac{3}{4} | \frac{4}{3} | \frac{5}{4} | \frac{5}{3} | Catetos: 3, 4; Hipotenusa: 5 |
| **53^\circ** | \frac{4}{5} | \frac{3}{5} | \frac{4}{3} | \frac{3}{4} | \frac{5}{3} | \frac{5}{4} | Catetos: 4, 3; Hipotenusa: 5 |
| **16^\circ** | \frac{7}{25} | \frac{24}{25} | \frac{7}{24} | \frac{24}{7} | \frac{25}{24} | \frac{25}{7} | Catetos: 7, 24; Hipotenusa: 25 |
| **74^\circ** | \frac{24}{25} | \frac{7}{25} | \frac{24}{7} | \frac{7}{24} | \frac{25}{7} | \frac{25}{24} | Catetos: 24, 7; Hipotenusa: 25 |
| **\frac{37^\circ}{2}**| \frac{1}{\sqrt{10}} | \frac{3}{\sqrt{10}} | \frac{1}{3} | 3 | \frac{\sqrt{10}}{3} | \sqrt{10} | Catetos: 1, 3; Hipotenusa: \sqrt{10} |
| **\frac{53^\circ}{2}**| \frac{1}{\sqrt{5}} | \frac{2}{\sqrt{5}} | \frac{1}{2} | 2 | \frac{\sqrt{5}}{2} | \sqrt{5} | Catetos: 1, 2; Hipotenusa: \sqrt{5} |

#### Triángulo Notable de 15^\circ y 75^\circ:
- Hipotenusa: 4k.
- Cateto opuesto a 15^\circ: k(\sqrt{6} - \sqrt{2}).
- Cateto opuesto a 75^\circ: k(\sqrt{6} + \sqrt{2}).
- **Propiedad Fundamental:** La altura relativa a la hipotenusa mide exactamente la cuarta parte de la hipotenusa:
  h = \frac{\text{Hipotenusa}}{4}
- Razones de 15^\circ: \tan(15^\circ) = 2 - \sqrt{3}, \quad \cot(15^\circ) = 2 + \sqrt{3}.

---

### 3.4. Resolución de Triángulos Rectángulos
Consiste en determinar las longitudes de los lados desconocidos en función de un lado conocido (L) y un ángulo agudo (\theta).

#### La Regla de Oro:
\frac{\text{Lado que quiero}}{\text{Lado que tengo}} = \text{R.T.}(\theta) \implies \text{Lado que quiero} = \text{Lado que tengo} \cdot \text{R.T.}(\theta)

| Caso | Lado Conocido | Cateto Opuesto | Cateto Adyacente | Hipotenusa |
| :---: | :---: | :---: | :---: | :---: |
| **Caso I** | Hipotenusa (a) | a \cdot \sin(\theta) | a \cdot \cos(\theta) | a |
| **Caso II** | Cateto Adyacente (a) | a \cdot \tan(\theta) | a | a \cdot \sec(\theta) |
| **Caso III**| Cateto Opuesto (a) | a | a \cdot \cot(\theta) | a \cdot \csc(\theta) |

#### Cálculo Trigonométrico del Área Triangular:
S_{\triangle} = \frac{1}{2} a \cdot b \cdot \sin(\theta)
Donde a y b son dos lados concurrentes cualesquiera y \theta es el ángulo comprendido entre ellos.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Pitágoras Trigonométrico**| \sin^2(\theta) + \cos^2(\theta) = 1 | Identidad fundamental |
| **Tangente por Cociente** | \tan(\theta) = \dfrac{\sin(\theta)}{\cos(\theta)} | \cos(\theta) \ne 0 |
| **Área Trigonométrica** | S = \dfrac{1}{2} a b \sin(\theta) | Lados a, b con ángulo \theta |
| **Altura en 15^\circ - 75^\circ**| h = \dfrac{c}{4} | c: hipotenusa |
| **Tangente de Ángulo Mitad**| \tan\left(\dfrac{\theta}{2}\right) = \csc(\theta) - \cot(\theta) | Identidad auxiliar |
| **Cotangente Ángulo Mitad**| \cot\left(\dfrac{\theta}{2}\right) = \csc(\theta) + \cot(\theta) | Identidad auxiliar |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Construcción Geométrica del Ángulo Mitad
Para calcular las razones de \frac{\theta}{2} sin usar fórmulas algebraicas complejas:
1. Dibuja el triángulo rectángulo del ángulo \theta con hipotenusa c y cateto adyacente b.
2. Prolonga el cateto adyacente una longitud igual a la hipotenusa c.
3. Une el extremo de la prolongación con el vértice opuesto. Se genera un triángulo isósceles exterior cuyo ángulo en el extremo mide exactamente \frac{\theta}{2}.
4. El nuevo cateto adyacente total es c + b y el opuesto es a:
   \tan\left(\frac{\theta}{2}\right) = \frac{a}{c + b} = \frac{\frac{a}{c}}{1 + \frac{b}{c}} = \frac{\sin(\theta)}{1 + \cos(\theta)} = \csc(\theta) - \cot(\theta)

### Hack 2: Descomposición Rectangular en Geometría
Cuando en un problema de geometría plana aparezca un ángulo notable (30^\circ, 45^\circ, 60^\circ, 37^\circ, 53^\circ):
- **Traza siempre la perpendicular desde el vértice opuesto** para encerrar dicho ángulo en un triángulo rectángulo.
- Al aislar el ángulo notable, sus lados quedan automáticamente en proporciones conocidas, trasladando la incógnita al resto de la figura.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia Clásica: "SOH-CAH-TOA"
- **SOH:** **S**eno = **O**puesto / **H**ipotenusa.
- **CAH:** **C**oseno = **A**dyacente / **H**ipotenusa.
- **TOA:** **T**angente = **O**puesto / **A**dyacente.
- Las tres restantes son sus espejos recíprocos:
  - \csc es el inverso de \sin.
  - \sec es el inverso de \cos.
  - \cot es el inverso de \tan.

### 2. Mnemotecnia de Recíprocas vs Co-Razones: "IGUALES vs NOVENTA"
- Si están **MULTIPLICÁNDOSE** igualados a 1 (\sin \cdot \csc = 1):
  \text{¡Los ángulos son IGUALES! } (\alpha = \beta)
- Si están **SEPARADOS POR UN IGUAL** (\sin = \cos):
  \text{¡Los ángulos SUMAN NOVENTA! } (\alpha + \beta = 90^\circ)

### 3. Mnemotecnia del Ángulo Mitad: "COSECANTE MENOS COTANGENTE"
- \tan\left(\frac{37^\circ}{2}\right) = \csc(37^\circ) - \cot(37^\circ) = \frac{5}{3} - \frac{4}{3} = \frac{1}{3}.
- \tan\left(\frac{53^\circ}{2}\right) = \csc(53^\circ) - \cot(53^\circ) = \frac{5}{4} - \frac{3}{4} = \frac{2}{4} = \frac{1}{2}.
- ¡Memoriza: cateto 1 a 3 para 37^\circ/2 y cateto 1 a 2 para 53^\circ/2!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Recíprocas con Complementarias**
> Postulantes distraídos igualan los ángulos a 90^\circ cuando ven un producto igual a 1:
> - **ERROR:** \tan(2x) \cdot \cot(40^\circ) = 1 \implies 2x + 40^\circ = 90^\circ (¡FALSO!).
> - **CORRECTO:** Son recíprocas, por tanto son iguales: 2x = 40^\circ \implies x = 20^\circ.

> [!CAUTION]
> **Trampa 2: La Hipotenusa es la más Grande**
> Ningún seno ni coseno de ángulo agudo puede ser mayor o igual a 1:
> \sin(\theta) < 1 \quad \text{y} \quad \cos(\theta) < 1
> Si al resolver una ecuación cuadrática obtienes \sin(\theta) = \frac{5}{3}, ese valor debe ser descartado de inmediato por ser geométricamente absurdo en un triángulo rectángulo.

> [!WARNING]
> **Trampa 3: Inversión de Catetos en 37^\circ y 53^\circ**
> - Al ángulo MENOR (37^\circ) se le opone el lado MENOR (3k).
> - Al ángulo MAYOR (53^\circ) se le opone el lado MAYOR (4k).
> Confundir \tan(37^\circ) = \frac{3}{4} con \frac{4}{3} es el causante de perder puntos vitales en física y trigonometría.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Topografía y Altimetría (Rampas y Pendientes):** La pendiente vial de una carretera se expresa porcentualmente como p = \tan(\theta) \times 100\%. Las normas peruanas del MTC limitan la pendiente máxima en carreteras de penetración a la sierra a un 8\% o 10\% para garantizar el frenado seguro de camiones pesados.
2. **Balística y Lanzamiento de Proyectiles:** La descomposición de la velocidad inicial en componentes ortogonales utiliza directamente las razones trigonométricas: v_x = v_0 \cos(\theta) y v_y = v_0 \sin(\theta).
3. **Navegación Aérea y Deriva por Viento:** Los pilotos calculan la derrota real y el ángulo de deriva corrigiendo el rumbo con triángulos de velocidades vectoriales resueltos trigonométricamente.

---
