package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t08_s01",
            title = "RESOLUCIÓN DE TRIÁNGULOS OBLICUÁNGULOS: LEYES DE SENOS, COSENOS, TANGENTES Y PROYECCIONES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "RESOLUCIÓN DE TRIÁNGULOS OBLICUÁNGULOS: LEYES DE SENOS, COSENOS, TANGENTES Y PROYECCIONES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Trigonometría Plana y Geometría Métrica |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Razones Trigonométricas, Reducción al Primer Cuadrante, Circunferencia y Áreas |

### Competencias Clave del Prospecto
1. **Aplicación de la Ley de Senos y Circunradio:** Relacionar lados, ángulos y el diámetro de la circunferencia circunscrita (2R) para resolver triángulos con ángulos conocidos.
2. **Dominio de la Ley de Cosenos:** Calcular lados o ángulos en casos L-A-L y L-L-L, analizando la naturaleza acutángulo u obtusángulo del triángulo según el signo del coseno.
3. **Uso de Ley de Tangentes y Proyecciones:** Aplicar el Teorema de Neper y la descomposición proyectiva de lados (a = b\cos C + c\cos B).
4. **Fórmulas de Briggs y Cálculo de Áreas:** Manejar razones de ángulos mitad en función del semiperímetro y las cinco variantes de área triangular (S = \frac{abc}{4R} = pr = 2R^2\sin A\sin B\sin C).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Resolución de Triángulos Oblicuángulos] --> B[Ley de Senos y Circunradio]
    A --> C[Ley de Cosenos]
    A --> D[Ley de Tangentes: Neper]
    A --> E[Ley de Proyecciones]
    A --> F[Fórmulas de Briggs y Áreas]

    B --> B1[a / sen A = b / sen B = c / sen C = 2R]
    B --> B2[Casos: A-L-A, L-A-A y Caso Ambiguo L-L-A]

    C --> C1[a² = b² + c² - 2bc cos A]
    C --> C2[Despeje: cos A = b² + c² - a² / 2bc]
    C --> C3[Casos: L-A-L y L-L-L]

    D --> D1[a - b / a + b = tan A-B/2 / tan A+B/2]

    E --> E1[a = b cos C + c cos B]

    F --> F1[Fórmulas de Briggs: sen A/2, cos A/2, tan A/2]
    F --> F2[Área Circunradio: S = abc / 4R = 2R² sen A sen B sen C]
    F --> F3[Área Inradio: S = p · r]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición y Elementos de un Triángulo Oblicuángulo
Un **triángulo oblicuángulo** es aquel que no posee ningún ángulo interior recto (90^\circ). Puede ser acutángulo (tres ángulos agudos) u obtusángulo (un ángulo obtuso mayor a 90^\circ).

#### Notación Convencional Estándar:
- **Vértices:** A, B, C.
- **Ángulos Interiores:** \alpha = A, \beta = B, \gamma = C, cumpliendo:
  A + B + C = 180^\circ = \pi\text{ rad}
- **Lados Opuestos:** a (opuesto a A), b (opuesto a B), c (opuesto a C).
- **Circunradio (R):** Radio de la circunferencia circunscrita al triángulo.
- **Inradio (r):** Radio de la circunferencia inscrita.
- **Semiperímetro (p):** p = \dfrac{a + b + c}{2}.

---

### 3.2. Ley de Senos (Teorema de los Senos)
En todo triángulo, las longitudes de los lados son directamente proporcionales a los senos de sus respectivos ángulos opuestos, y la constante de proporcionalidad es exactamente igual al diámetro de la circunferencia circunscrita (2R):
\frac{a}{\sin(A)} = \frac{b}{\sin(B)} = \frac{c}{\sin(C)} = 2R

#### Despejes Clave para Sustitución Rápida:
a = 2R\sin(A), \quad b = 2R\sin(B), \quad c = 2R\sin(C)

#### Casos de Aplicación Óptima:
1. **Caso A-L-A o L-A-A:** Conocidos dos ángulos y un lado cualquiera. (Tiene solución única directa).
2. **Caso L-L-A (Caso Ambiguo):** Conocidos dos lados y el ángulo opuesto a uno de ellos. Puede tener cero, una o dos soluciones dependiendo de la altura h = b\sin(A).

---

### 3.3. Ley de Cosenos (Teorema de los Cosenos)
En todo triángulo, el cuadrado de la longitud de un lado es igual a la suma de los cuadrados de los otros dos lados, menos el doble del producto de dichos lados por el coseno del ángulo comprendido entre ellos:
a^2 = b^2 + c^2 - 2bc\cos(A)
b^2 = a^2 + c^2 - 2ac\cos(B)
c^2 = a^2 + b^2 - 2ab\cos(C)

#### Despeje de los Cosenos de los Ángulos Interiores:
\cos(A) = \frac{b^2 + c^2 - a^2}{2bc}, \quad \cos(B) = \frac{a^2 + c^2 - b^2}{2ac}, \quad \cos(C) = \frac{a^2 + b^2 - c^2}{2ab}

#### Criterio de Clasificación Angular por el Signo de \cos(A):
- Si a^2 < b^2 + c^2 \implies \cos(A) > 0 \implies El ángulo A es **agudo** (< 90^\circ).
- Si a^2 = b^2 + c^2 \implies \cos(A) = 0 \implies El ángulo A es **recto** (90^\circ, Teorema de Pitágoras).
- Si a^2 > b^2 + c^2 \implies \cos(A) < 0 \implies El ángulo A es **obtuso** (> 90^\circ).

---

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Ley / Teorema | Ecuación Matemática Rigurosa | Aplicación y Contexto |
| :--- | :--- | :--- |
| **Ley de Senos** | \dfrac{a}{\sin A} = \dfrac{b}{\sin B} = \dfrac{c}{\sin C} = 2R | Relaciona lados y circunradio |
| **Lados en R** | a = 2R\sin A, \quad b = 2R\sin B, \quad c = 2R\sin C | Sustitución algebraica directa |
| **Ley de Cosenos** | a^2 = b^2 + c^2 - 2bc\cos A | Casos L-A-L y L-L-L |
| **Despeje Coseno** | \cos A = \dfrac{b^2 + c^2 - a^2}{2bc} | Detección de ángulos obtusos |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t08_s01_c01",
                    question = "**Enunciado:** En un triángulo ABC, el lado a = 12\\text{ cm}, el ángulo A = 60^\\circ y el ángulo B = 45^\\circ. Calcule la longitud del lado b.",
                    options = listOf(
                        "4\\sqrt{6}\\text{ cm}",
                        "6\\sqrt{2}\\text{ cm}",
                        "6\\sqrt{6}\\text{ cm}",
                        "8\\sqrt{3}\\text{ cm}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t08_s01_c02",
                    question = "**Enunciado:** Los lados de un triángulo miden a = 7\\text{ cm}, b = 5\\text{ cm} y c = 3\\text{ cm}. Calcule la medida del mayor ángulo interior de dicho triángulo.",
                    options = listOf(
                        "120^\\circ",
                        "135^\\circ",
                        "150^\\circ",
                        "60^\\circ"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t08_s01_c03",
                    question = "**Enunciado:** En un triángulo ABC, simplifique la siguiente expresión que vincula lados y ángulos:",
                    options = listOf(
                        "2",
                        "1",
                        "\\dfrac{a+b}{c}",
                        "\\dfrac{a}{b}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t08_s01_c04",
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
                    id = "trig_t08_s01_c05",
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
                    id = "trig_t08_s01_c06",
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
                    id = "trig_t08_s01_c07",
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
                    id = "trig_t08_s01_c08",
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
                    id = "trig_t08_s01_c09",
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
                    id = "trig_t08_s01_c10",
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
            id = "trig_t08_s02",
            title = "RESOLUCIÓN DE TRIÁNGULOS OBLICUÁNGULOS: LEYES DE SENOS, COSENOS, TANGENTES Y PROYECCIONES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "RESOLUCIÓN DE TRIÁNGULOS OBLICUÁNGULOS: LEYES DE SENOS, COSENOS, TANGENTES Y PROYECCIONES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.4. Ley de Tangentes (Teorema de Neper)
En todo triángulo, la diferencia de dos lados es a su suma como la tangente de la semidiferencia de sus ángulos opuestos es a la tangente de la semisuma de dichos ángulos:
\frac{a - b}{a + b} = \frac{\tan\left(\frac{A - B}{2}\right)}{\tan\left(\frac{A + B}{2}\right)}
\frac{b - c}{b + c} = \frac{\tan\left(\frac{B - C}{2}\right)}{\tan\left(\frac{B + C}{2}\right)}
\frac{a - c}{a + c} = \frac{\tan\left(\frac{A - C}{2}\right)}{\tan\left(\frac{A + C}{2}\right)}

*Artificio Útil:* Dado que \frac{A + B}{2} = 90^\circ - \frac{C}{2}, el denominador se convierte en:
\tan\left(\frac{A + B}{2}\right) = \cot\left(\frac{C}{2}\right)

---

### 3.5. Ley de Proyecciones
En todo triángulo, cualquier lado es numéricamente igual a la suma de las proyecciones ortogonales de los otros dos lados sobre él:
a = b\cos(C) + c\cos(B)
b = a\cos(C) + c\cos(A)
c = a\cos(B) + b\cos(A)

---

### 3.6. Fórmulas de Briggs (Razones del Ángulo Mitad)
Permiten calcular el seno, coseno y tangente de la mitad de los ángulos interiores a partir del semiperímetro p = \frac{a+b+c}{2}:
1. **Seno del Ángulo Mitad:**
   \sin\left(\frac{A}{2}\right) = \sqrt{\frac{(p - b)(p - c)}{bc}}
2. **Coseno del Ángulo Mitad:**
   \cos\left(\frac{A}{2}\right) = \sqrt{\frac{p(p - a)}{bc}}
3. **Tangente del Ángulo Mitad:**
   \tan\left(\frac{A}{2}\right) = \sqrt{\frac{(p - b)(p - c)}{p(p - a)}} = \frac{r}{p - a}

---

### 3.7. Fórmulas del Área de la Región Triangular (S)

1. **Fórmula Trigonométrica Básica:**
   S = \frac{1}{2}ab\sin(C) = \frac{1}{2}bc\sin(A) = \frac{1}{2}ac\sin(B)
2. **En Función del Circunradio (R):**
   S = \frac{abc}{4R} = 2R^2\sin(A)\sin(B)\sin(C)
3. **En Función del Inradio (r):**
   S = p \cdot r
4. **Fórmula de Herón:**
   S = \sqrt{p(p - a)(p - b)(p - c)}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Ley de Tangentes**| \dfrac{a - b}{a + b} = \dfrac{\tan\left(\frac{A-B}{2}\right)}{\cot\left(\frac{C}{2}\right)} | Relaciona diferencias angulares |
| **Ley de Proyecciones**| a = b\cos C + c\cos B | Suma de sombras ortogonales |
| **Briggs (Seno Mitad)**| \sin\left(\frac{A}{2}\right) = \sqrt{\dfrac{(p-b)(p-c)}{bc}} | p = \frac{a+b+c}{2} |
| **Briggs (Coseno Mitad)**| \cos\left(\frac{A}{2}\right) = \sqrt{\dfrac{p(p-a)}{bc}} | p = \frac{a+b+c}{2} |
| **Área con Circunradio**| S = \dfrac{abc}{4R} = 2R^2\sin A\sin B\sin C | Geometría y trigonometría mixta|
| **Área con Inradio** | S = p \cdot r | Relación con semiperímetro |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Eliminación Rápida de Lados en Fracciones Homogéneas
En preguntas teóricas donde aparezcan expresiones como \frac{a\sin B - b\sin A}{c}:
- Sustituye de inmediato los lados por la Ley de Senos: a = 2R\sin A y b = 2R\sin B.
- La expresión se convierte en:
  \frac{(2R\sin A)\sin B - (2R\sin B)\sin A}{c} = \frac{2R\sin A\sin B - 2R\sin A\sin B}{c} = \frac{0}{c} = 0
- ¡Se resuelve en 3 segundos sin dibujar ningún triángulo!

### Hack 2: Cálculo Directo de Ángulos Notables con Ley de Cosenos
- Si a^2 = b^2 + c^2 - bc \implies 2bc\cos A = bc \implies \cos A = \frac{1}{2} \implies A = 60^\circ.
- Si a^2 = b^2 + c^2 + bc \implies -2bc\cos A = bc \implies \cos A = -\frac{1}{2} \implies A = 120^\circ.
- Si a^2 = b^2 + c^2 - \sqrt{2}bc \implies \cos A = \frac{\sqrt{2}}{2} \implies A = 45^\circ.
- Si a^2 = b^2 + c^2 + \sqrt{2}bc \implies \cos A = -\frac{\sqrt{2}}{2} \implies A = 135^\circ.
- Si a^2 = b^2 + c^2 - \sqrt{3}bc \implies \cos A = \frac{\sqrt{3}}{2} \implies A = 30^\circ.
- ¡Aprende a reconocer estos patrones visuales para marcar la respuesta al instante!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Ley de Senos: "LADO ARRIBA, SENO ABAJO, DIÁMETRO AL FINAL"
- Cada lado tiene a su seno debajo:
  \frac{\text{Lado } a}{\sin A} = \frac{\text{Lado } b}{\sin B} = \frac{\text{Lado } c}{\sin C} = 2R
  ¡Recuerda siempre que al final es 2R (el diámetro), no R!

### 2. Mnemotecnia de la Ley de Cosenos: "PITÁGORAS CON DESCUENTO"
- El lado al cuadrado es Pitágoras (b^2 + c^2) **menos el descuento** del doble producto por el coseno:
  a^2 = b^2 + c^2 \mathbf{- 2bc\cos A}

### 3. Mnemotecnia de Proyecciones: "EL LADO ES LA SUMA CRUZADA"
- Para hallar el lado a, tomas los otros dos lados (b y c) y los cruzas con los cosenos de los ángulos opuestos:
  a = b \cdot \cos(C) + c \cdot \cos(B)

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo Negativo del Coseno en Ángulos Obtusos**
> Si el triángulo es obtusángulo con A = 120^\circ:
> En la ley de cosenos, \cos(120^\circ) = -\frac{1}{2}.
> Al sustituir:
> a^2 = b^2 + c^2 - 2bc\left(-\frac{1}{2}\right) = b^2 + c^2 + bc
> Muchos postulantes olvidan que menos por menos da más y restan el término, obteniendo un lado menor que los otros dos en lugar del lado mayor.

> [!CAUTION]
> **Trampa 2: Circunradio vs Radio**
> La constante de la ley de senos es **2R (dos veces el circunradio)**.
> Si te dicen "la circunferencia circunscrita tiene radio 5", la constante de la ley de senos es 2(5) = 10, no 5.

> [!WARNING]
> **Trampa 3: El Caso Ambiguo L-L-A**
> Cuando conoces dos lados a, b y el ángulo A opuesto al lado menor (a < b):
> Al aplicar \sin B = \frac{b\sin A}{a}, si \sin B < 1, existen **DOS ÁNGULOS POSIBLES**:
> Uno agudo B_1 y otro obtuso B_2 = 180^\circ - B_1. ¡Debes verificar si ambos ángulos permiten que la suma interior no supere 180^\circ!

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Triangulación Geodésica y Cartografía:** El Instituto Geográfico Nacional (IGN) traza las cartas topográficas del Perú midiendo líneas de base geodésicas y aplicando la ley de senos para calcular distancias a vértices en picos de cordilleras sin necesidad de ascender a ellos.
2. **Navegación Marítima y Aérea (Cálculo de Distancia entre Barcos):** Dos embarcaciones que parten del puerto de Matarani con rumbos divergentes que forman un ángulo \theta calculan su distancia de separación en alta mar tras cierto tiempo mediante la ley de cosenos (conociendo las distancias recorridas d_1 = v_1 t y d_2 = v_2 t).
3. **Ingeniería Estructural y Cálculo de Cerchas:** En puentes y techumbres reticuladas, los esfuerzos axiales de tracción y compresión en barras diagonales no ortogonales se resuelven planteando el equilibrio de nudos con leyes de senos y cosenos.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t08_s02_c01",
                    question = "**Enunciado:** Desde un faro costero F, un vigía observa dos lanchas patrulleras A y B. La distancia del faro a la lancha A es de 6\\text{ km} y la distancia a la lancha B es de 10\\text{ km}. Si el ángulo visual formado por las dos líneas de mira desde el faro es de 60^\\circ, determine la distancia en kilómetros que separa a ambas lanchas patrulleras.",
                    options = listOf(
                        "2\\sqrt{19}\\text{ km}",
                        "14\\text{ km}",
                        "4\\sqrt{7}\\text{ km}",
                        "8\\text{ km}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t08_s02_c02",
                    question = "**Enunciado:** En un triángulo ABC cuyos lados cumplen la relación algebraica a^3 + b^3 + c^3 = c^2(a + b + c), determine la medida del ángulo interior C.",
                    options = listOf(
                        "60^\\circ",
                        "120^\\circ",
                        "45^\\circ",
                        "30^\\circ"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t08_s02_c03",
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
                    id = "trig_t08_s02_c04",
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
                    id = "trig_t08_s02_c05",
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
                    id = "trig_t08_s02_c06",
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
                    id = "trig_t08_s02_c07",
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
                    id = "trig_t08_s02_c08",
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
                    id = "trig_t08_s02_c09",
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
                    id = "trig_t08_s02_c10",
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
