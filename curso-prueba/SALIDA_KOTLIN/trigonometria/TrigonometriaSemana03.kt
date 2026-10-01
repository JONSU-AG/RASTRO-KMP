package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t03_s01",
            title = "RAZONES TRIGONOMÉTRICAS EN EL TRIÁNGULO RECTÁNGULO Y TRIÁNGULOS NOTABLES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "RAZONES TRIGONOMÉTRICAS EN EL TRIÁNGULO RECTÁNGULO Y TRIÁNGULOS NOTABLES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Trigonometría Plana |
| **Nivel de Complejidad** | Intermedio (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.0 a 5.0 horas |
| **Prerrequisitos** | Teorema de Pitágoras, Triángulos Rectángulos, Álgebra Básica y Racionalización |

### Competencias Clave del Prospecto
1. **Definición Rigurosa de las 6 R.T.:** Dominar las definiciones de seno, coseno, tangente, cotangente, secante y cosecante para ángulos agudos.
2. **Propiedades Operativas Clave:** Aplicar con solvencia las propiedades de Razones Recíprocas (\sin \theta \cdot \csc \theta = 1) y de Co-Razones Complementarias (\sin \alpha = \cos \beta \iff \alpha + \beta = 90^\circ).
3. **Manejo de Triángulos Notables:** Memorizar y calcular al instante razones de 30^\circ, 45^\circ, 60^\circ, 37^\circ, 53^\circ, 16^\circ, 74^\circ, \frac{37^\circ}{2}, \frac{53^\circ}{2} y 15^\circ - 75^\circ.
4. **Resolución de Triángulos Rectángulos:** Expresar lados desconocidos en función de un lado conocido y un ángulo agudo ("Lo que quiero sobre lo que tengo").

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Razones Trigonométricas en el Triángulo Rectángulo] --> B[Definición de las 6 R.T.]
    A --> C[Propiedades Fundamentales]
    A --> D[Triángulos Notables y Aproximados]
    A --> E[Resolución de Triángulos Rectángulos]

    B --> B1[Seno: CO / H y Coseno: CA / H]
    B --> B2[Tangente: CO / CA y Cotangente: CA / CO]
    B --> B3[Secante: H / CA y Cosecante: H / CO]

    C --> C1[Razones Recíprocas: Producto = 1 -> Ángulos Iguales]
    C --> C2[Co-Razones Complementarias: R.T. = Co-R.T. -> Suma = 90°]

    D --> D1[Exactos: 45°-45° y 30°-60°]
    D --> D2[Aproximados Frecuentes: 37°-53° y 16°-74°]
    D --> D3[Ángulos Mitad: 37°/2 y 53°/2]
    D --> D4[Triángulo 15°-75°: Altura h = c/4]

    E --> E1[Caso 1: Conozco Hipotenusa y Ángulo]
    E --> E2[Caso 2: Conozco Cateto Adyacente y Ángulo]
    E --> E3[Caso 3: Conozco Cateto Opuesto y Ángulo]
    E --> E4[Regla: Lo que quiero / Lo que tengo = R.T.]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición de las Razones Trigonométricas
Sea el triángulo rectángulo ABC recto en C, con hipotenusa c y catetos a (opuesto al ángulo \angle A = \theta) y b (adyacente al ángulo \theta).
Por el Teorema de Pitágoras:
a^2 + b^2 = c^2 \quad (c > a > 0, \quad c > b > 0)

Las seis razones trigonométricas del ángulo agudo \theta se definen como los cocientes entre las longitudes de los lados del triángulo:

1. **Seno (\sin):** Razón entre el cateto opuesto y la hipotenusa.
   \sin(\theta) = \frac{\text{Cateto Opuesto}}{\text{Hipotenusa}} = \frac{a}{c}
2. **Coseno (\cos):** Razón entre el cateto adyacente y la hipotenusa.
   \cos(\theta) = \frac{\text{Cateto Adyacente}}{\text{Hipotenusa}} = \frac{b}{c}
3. **Tangente (\tan):** Razón entre el cateto opuesto y el cateto adyacente.
   \tan(\theta) = \frac{\text{Cateto Opuesto}}{\text{Cateto Adyacente}} = \frac{a}{b}
4. **Cotangente (\cot):** Razón entre el cateto adyacente y el cateto opuesto.
   \cot(\theta) = \frac{\text{Cateto Adyacente}}{\text{Cateto Opuesto}} = \frac{b}{a}
5. **Secante (\sec):** Razón entre la hipotenusa y el cateto adyacente.
   \sec(\theta) = \frac{\text{Hipotenusa}}{\text{Cateto Adyacente}} = \frac{c}{b}
6. **Cosecante (\csc):** Razón entre la hipotenusa y el cateto opuesto.
   \csc(\theta) = \frac{\text{Hipotenusa}}{\text{Cateto Opuesto}} = \frac{c}{a}

*Restricciones para ángulos agudos (0^\circ < \theta < 90^\circ):*
0 < \sin(\theta) < 1, \quad 0 < \cos(\theta) < 1, \quad \sec(\theta) > 1, \quad \csc(\theta) > 1, \quad \tan(\theta) > 0, \quad \cot(\theta) > 0

---

### 3.2. Propiedades Fundamentales de las R.T.

#### 1. Razones Trigonométricas Recíprocas (Inversas Multiplicativas)
El producto de una razón trigonométrica por su recíproca correspondiente es igual a 1, **siempre y cuando se apliquen al mismo ángulo**:
\sin(\alpha) \cdot \csc(\beta) = 1 \iff \alpha = \beta
\cos(\alpha) \cdot \sec(\beta) = 1 \iff \alpha = \beta
\tan(\alpha) \cdot \cot(\beta) = 1 \iff \alpha = \beta

*Ejemplo de aplicación:* \tan(3x - 10^\circ) \cdot \cot(x + 30^\circ) = 1 \implies 3x - 10^\circ = x + 30^\circ \implies 2x = 40^\circ \implies x = 20^\circ.

#### 2. Razones de Ángulos Complementarios (Co-Razones)
Toda razón trigonométrica de un ángulo agudo es numéricamente igual a la co-razón trigonométrica de su ángulo complementario:
\text{R.T.}(\alpha) = \text{Co-R.T.}(\beta) \iff \alpha + \beta = 90^\circ

Específicamente:
\sin(\alpha) = \cos(\beta) \iff \alpha + \beta = 90^\circ
\tan(\alpha) = \cot(\beta) \iff \alpha + \beta = 90^\circ
\sec(\alpha) = \csc(\beta) \iff \alpha + \beta = 90^\circ


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Relación Trigonométrica | Expresión Matemática Rigurosa | Condición de Validez |
| :--- | :--- | :--- |
| **Recíproca Seno** | \sin(\theta) \cdot \csc(\theta) = 1 \iff \csc(\theta) = \dfrac{1}{\sin(\theta)} | \theta \ne k\pi |
| **Recíproca Coseno** | \cos(\theta) \cdot \sec(\theta) = 1 \iff \sec(\theta) = \dfrac{1}{\cos(\theta)} | \theta \ne (2k+1)\frac{\pi}{2} |
| **Recíproca Tangente** | \tan(\theta) \cdot \cot(\theta) = 1 \iff \cot(\theta) = \dfrac{1}{\tan(\theta)} | \theta \ne \frac{k\pi}{2} |
| **Co-Razones** | \text{R.T.}(\alpha) = \text{Co-R.T.}(\beta) | \alpha + \beta = 90^\circ |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t03_s01_c01",
                    question = "**Enunciado:** En un triángulo rectángulo, los catetos miden 5\\text{ cm} y 12\\text{ cm}. Si \\theta es el menor ángulo agudo de dicho triángulo, calcule el valor de:",
                    options = listOf(
                        "17",
                        "15",
                        "29",
                        "24"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c02",
                    question = "**Enunciado:** Si se cumple que \\sin(3x - 10^\\circ) \\cdot \\csc(x + 30^\\circ) = 1, y además \\tan(2y - 5^\\circ) = \\cot(y + 20^\\circ), determine el valor de:",
                    options = listOf(
                        "\\dfrac{1}{2}",
                        "\\dfrac{\\sqrt{3}}{2}",
                        "\\dfrac{\\sqrt{2}}{2}",
                        "1"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c03",
                    question = "**Enunciado:** Desde el vértice B de un triángulo ABC se traza la altura \\overline{BH} hacia el lado \\overline{AC} (H \\in \\overline{AC}). Si AB = 10\\text{ cm}, el ángulo \\angle A = 37^\\circ y el ángulo \\angle C = 45^\\circ, calcule la longitud del lado \\overline{AC}.",
                    options = listOf(
                        "14\\text{ cm}",
                        "12\\text{ cm}",
                        "16\\text{ cm}",
                        "18\\text{ cm}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "trig_t03_s02",
            title = "RAZONES TRIGONOMÉTRICAS EN EL TRIÁNGULO RECTÁNGULO Y TRIÁNGULOS NOTABLES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "RAZONES TRIGONOMÉTRICAS EN EL TRIÁNGULO RECTÁNGULO Y TRIÁNGULOS NOTABLES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t03_s02_c01",
                    question = "**Enunciado:** Un ingeniero diseña una rampa de acceso peatonal que asciende desde el nivel del suelo A hasta una plataforma B. Por restricciones topográficas, la rampa se divide en dos tramos consecutivos rectilíneos: el primer tramo AP tiene una longitud de 20\\text{ m} y una inclinación de 16^\\circ respecto a la horizontal; el segundo tramo PB asciende con una inclinación de 53^\\circ respecto a la horizontal logrando una altura adicional de 12\\text{ m}. Calcule la distancia horizontal total comprendida entre el inicio de la rampa A y la proyección del punto final B.",
                    options = listOf(
                        "28.2\\text{ m}",
                        "26.4\\text{ m}",
                        "30.0\\text{ m}",
                        "25.6\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c02",
                    question = "**Enunciado:** En un triángulo rectángulo ABC recto en B, se traza la ceviana interior \\overline{AD} de modo que BD = 1\\text{ cm} y DC = 2\\text{ cm}. Si el ángulo \\angle BAD = \\alpha y el ángulo \\angle DAC = \\beta, y se sabe que \\angle C = 30^\\circ, calcule el valor de \\frac{\\tan(\\alpha)}{\\tan(\\beta)}.",
                    options = listOf(
                        "\\dfrac{1}{2}",
                        "\\dfrac{3}{2}",
                        "\\dfrac{2}{3}",
                        "\\dfrac{1}{3}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "trig_t03_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
