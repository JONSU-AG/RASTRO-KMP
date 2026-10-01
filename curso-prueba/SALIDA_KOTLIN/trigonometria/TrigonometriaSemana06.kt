package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t06_s01",
            title = "RAZONES DE ÁNGULOS COMPUESTOS, ÁNGULO DOBLE, MITAD Y TRIPLE - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "RAZONES DE ÁNGULOS COMPUESTOS, ÁNGULO DOBLE, MITAD Y TRIPLE - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Álgebra Trigonométrica Avanzada |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 5.0 a 6.0 horas |
| **Prerrequisitos** | Identidades Fundamentales, Productos Notables, Racionalización y Cuadrantes |

### Competencias Clave del Prospecto
1. **Manejo de Ángulos Compuestos:** Aplicar con precisión las fórmulas de adición y sustracción para seno, coseno y tangente, reconociendo las identidades condicionales para \alpha + \beta + \gamma = 180^\circ o 90^\circ.
2. **Dominio del Ángulo Doble:** Manejar las expresiones de \sin(2x), \cos(2x), \tan(2x), las fórmulas de degradación cuadrática (2\sin^2 x = 1 - \cos 2x) y el triángulo del ángulo doble.
3. **Cálculo del Ángulo Mitad y Formas Racionales:** Utilizar las expresiones algebraicas con signo de cuadrante y las formas racionales directas \tan(\frac{x}{2}) = \csc x - \cot x.
4. **Desarrollo del Ángulo Triple:** Manejar identidades de degradación cúbica y las identidades de productos especiales \tan(x)\tan(60^\circ - x)\tan(60^\circ + x) = \tan(3x).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Ángulos Compuestos, Doble, Mitad y Triple] --> B[Ángulos Compuestos]
    A --> C[Ángulo Doble: 2x]
    A --> D[Ángulo Mitad: x/2]
    A --> E[Ángulo Triple: 3x]

    B --> B1[Seno: sen a±b = sen a cos b ± cos a sen b]
    B --> B2[Coseno: cos a±b = cos a cos b ∓ sen a sen b]
    B --> B3[Tangente: tan a±b = tan a ± tan b / 1 ∓ tan a tan b]
    B --> B4[Condicionales Triangulares: a+b+c = 180°]

    C --> C1[sen 2x = 2 sen x cos x]
    C --> C2[cos 2x = cos²x - sen²x = 2cos²x - 1 = 1 - 2sen²x]
    C --> C3[Degradación: 2sen²x = 1 - cos 2x, 2cos²x = 1 + cos 2x]
    C --> C4[Auxiliares: cot x ± tan x]

    D --> D1[Fórmulas con Radical y Signo de Cuadrante]
    D --> D2[Forma Racional: tan x/2 = csc x - cot x]
    D --> D3[Forma Racional: cot x/2 = csc x + cot x]

    E --> E1[sen 3x = 3sen x - 4sen³x]
    E --> E2[cos 3x = 4cos³x - 3cos x]
    E --> E3[Productos Notables de 60° ± x]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Razones Trigonométricas de Ángulos Compuestos

#### 1. Adición y Sustracción de Seno y Coseno:
\sin(\alpha \pm \beta) = \sin(\alpha)\cos(\beta) \pm \cos(\alpha)\sin(\beta)
\cos(\alpha \pm \beta) = \cos(\alpha)\cos(\beta) \mp \sin(\alpha)\sin(\beta)
*(Observación crucial: En el coseno, el signo se invierte: más genera menos, menos genera más).*

#### 2. Adición y Sustracción de Tangente y Cotangente:
\tan(\alpha \pm \beta) = \frac{\tan(\alpha) \pm \tan(\beta)}{1 \mp \tan(\alpha)\tan(\beta)}
\cot(\alpha \pm \beta) = \frac{\cot(\alpha)\cot(\beta) \mp 1}{\cot(\beta) \pm \cot(\alpha)}

#### 3. Identidades Auxiliares de Ángulos Compuestos:
- **Producto de Senos de Suma y Diferencia:**
  \sin(\alpha + \beta)\sin(\alpha - \beta) = \sin^2(\alpha) - \sin^2(\beta) = \cos^2(\beta) - \cos^2(\alpha)
- **Producto de Cosenos de Suma y Diferencia:**
  \cos(\alpha + \beta)\cos(\alpha - \beta) = \cos^2(\alpha) - \sin^2(\beta) = \cos^2(\beta) - \sin^2(\alpha)
- **Suma o Diferencia de Tangentes:**
  \tan(\alpha) \pm \tan(\beta) = \frac{\sin(\alpha \pm \beta)}{\cos(\alpha)\cos(\beta)}

#### 4. Identidades Condicionales Notables:
- **Si \alpha + \beta + \gamma = 180^\circ (o \pi\text{ rad}, ángulos internos de un triángulo):**
  \tan(\alpha) + \tan(\beta) + \tan(\gamma) = \tan(\alpha) \cdot \tan(\beta) \cdot \tan(\gamma)
  \cot(\alpha)\cot(\beta) + \cot(\beta)\cot(\gamma) + \cot(\gamma)\cot(\alpha) = 1
- **Si \alpha + \beta + \gamma = 90^\circ (o \frac{\pi}{2}\text{ rad}):**
  \cot(\alpha) + \cot(\beta) + \cot(\gamma) = \cot(\alpha) \cdot \cot(\beta) \cdot \cot(\gamma)
  \tan(\alpha)\tan(\beta) + \tan(\beta)\tan(\gamma) + \tan(\gamma)\tan(\alpha) = 1

---

### 3.2. Razones Trigonométricas del Ángulo Doble (2x)

Haciendo \alpha = \beta = x en las fórmulas de ángulos compuestos:
1. **Seno del Ángulo Doble:**
   \sin(2x) = 2\sin(x)\cos(x)
2. **Coseno del Ángulo Doble (Las Tres Formas):**
   \cos(2x) = \cos^2(x) - \sin^2(x)
   \cos(2x) = 2\cos^2(x) - 1
   \cos(2x) = 1 - 2\sin^2(x)
3. **Tangente del Ángulo Doble:**
   \tan(2x) = \frac{2\tan(x)}{1 - \tan^2(x)}

#### Fórmulas de Degradación Cuadrática (Clave en Integrales y Admisión):
Permiten bajar potencias cuadráticas a argumentos lineales simples:
2\sin^2(x) = 1 - \cos(2x) \implies \sin^2(x) = \frac{1 - \cos(2x)}{2}
2\cos^2(x) = 1 + \cos(2x) \implies \cos^2(x) = \frac{1 + \cos(2x)}{2}


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Identidad | Ecuación Rigurosa | Propiedad Particular |
| :--- | :--- | :--- |
| **Seno de Suma/Resta** | \sin(\alpha \pm \beta) = \sin\alpha\cos\beta \pm \cos\alpha\sin\beta | Conserva signo |
| **Coseno de Suma/Resta**| \cos(\alpha \pm \beta) = \cos\alpha\cos\beta \mp \sin\alpha\sin\beta | Invierte signo |
| **Tangente de Suma/Resta**| \tan(\alpha \pm \beta) = \dfrac{\tan\alpha \pm \tan\beta}{1 \mp \tan\alpha\tan\beta} | Denominador alterno |
| **Seno del Doble** | \sin(2x) = 2\sin(x)\cos(x) | Argumento 2x \to x |
| **Coseno del Doble** | \cos(2x) = \cos^2(x) - \sin^2(x) = 2\cos^2(x) - 1 | 3 formas equivalentes |
| **Degradación Cuadrática**| 2\sin^2(x) = 1 - \cos(2x) \quad \land \quad 2\cos^2(x) = 1 + \cos(2x) | Elimina cuadrados |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t06_s01_c01",
                    question = "**Enunciado:** Calcule el valor exacto de:",
                    options = listOf(
                        "\\dfrac{\\sqrt{3}}{2}",
                        "\\dfrac{1}{2}",
                        "\\dfrac{\\sqrt{2}}{2}",
                        "1"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t06_s01_c02",
                    question = "**Enunciado:** Si \\tan(\\alpha) = 2 y \\tan(\\beta) = 3, calcule la medida del ángulo agudo (\\alpha + \\beta) en grados sexagesimales.",
                    options = listOf(
                        "45^\\circ",
                        "135^\\circ",
                        "60^\\circ",
                        "30^\\circ"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t06_s01_c03",
                    question = "**Enunciado:** Si \\sin(x) - \\cos(x) = \\dfrac{1}{3}, determine el valor de \\sin(2x).",
                    options = listOf(
                        "\\dfrac{8}{9}",
                        "\\dfrac{4}{9}",
                        "\\dfrac{2}{3}",
                        "\\dfrac{7}{9}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t06_s01_c04",
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
                    id = "trig_t06_s01_c05",
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
                    id = "trig_t06_s01_c06",
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
                    id = "trig_t06_s01_c07",
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
                    id = "trig_t06_s01_c08",
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
                    id = "trig_t06_s01_c09",
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
                    id = "trig_t06_s01_c10",
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
            id = "trig_t06_s02",
            title = "RAZONES DE ÁNGULOS COMPUESTOS, ÁNGULO DOBLE, MITAD Y TRIPLE - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "RAZONES DE ÁNGULOS COMPUESTOS, ÁNGULO DOBLE, MITAD Y TRIPLE - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### Triángulo Rectángulo del Ángulo Doble (en función de \tan x):
Cateto opuesto = 2\tan x, cateto adyacente = 1 - \tan^2 x, hipotenusa = 1 + \tan^2 x:
\sin(2x) = \frac{2\tan(x)}{1 + \tan^2(x)}, \quad \cos(2x) = \frac{1 - \tan^2(x)}{1 + \tan^2(x)}

#### Identidades Auxiliares del Ángulo Doble:
\cot(x) + \tan(x) = 2\csc(2x)
\cot(x) - \tan(x) = 2\cot(2x)
\sec(2x) + 1 = \frac{\tan(2x)}{\tan(x)}

---

### 3.3. Razones Trigonométricas del Ángulo Mitad (\frac{x}{2})

Despejando de las fórmulas de degradación:
1. **Seno del Ángulo Mitad:**
   \sin\left(\frac{x}{2}\right) = \pm \sqrt{\frac{1 - \cos(x)}{2}}
2. **Coseno del Ángulo Mitad:**
   \cos\left(\frac{x}{2}\right) = \pm \sqrt{\frac{1 + \cos(x)}{2}}
3. **Tangente del Ángulo Mitad:**
   \tan\left(\frac{x}{2}\right) = \pm \sqrt{\frac{1 - \cos(x)}{1 + \cos(x)}}

*Regla del Signo (\pm):* El signo (+) o (-) depende **exclusivamente del cuadrante en el que se ubique el ángulo mitad \frac{x}{2}** y de la razón trigonométrica evaluada.

#### Formas Racionales Libres de Radicales (Las Fórmulas Doradas):
\tan\left(\frac{x}{2}\right) = \csc(x) - \cot(x) = \frac{\sin(x)}{1 + \cos(x)} = \frac{1 - \cos(x)}{\sin(x)}
\cot\left(\frac{x}{2}\right) = \csc(x) + \cot(x) = \frac{\sin(x)}{1 - \cos(x)} = \frac{1 + \cos(x)}{\sin(x)}

---

### 3.4. Razones Trigonométricas del Ángulo Triple (3x)

1. **Seno del Ángulo Triple:**
   \sin(3x) = 3\sin(x) - 4\sin^3(x) = \sin(x)(2\cos 2x + 1)
2. **Coseno del Ángulo Triple:**
   \cos(3x) = 4\cos^3(x) - 3\cos(x) = \cos(x)(2\cos 2x - 1)
3. **Tangente del Ángulo Triple:**
   \tan(3x) = \frac{3\tan(x) - \tan^3(x)}{1 - 3\tan^2(x)} = \tan(x)\left(\frac{2\cos 2x - 1}{2\cos 2x + 1}\right)

#### Degradación Cúbica:
4\sin^3(x) = 3\sin(x) - \sin(3x)
4\cos^3(x) = 3\cos(x) + \cos(3x)

#### Productos Notables de Ángulo Triple (Identidades de Morrie / Euler):
\sin(x) \cdot \sin(60^\circ - x) \cdot \sin(60^\circ + x) = \frac{1}{4}\sin(3x)
\cos(x) \cdot \cos(60^\circ - x) \cdot \cos(60^\circ + x) = \frac{1}{4}\cos(3x)
\tan(x) \cdot \tan(60^\circ - x) \cdot \tan(60^\circ + x) = \tan(3x)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Auxiliar Csc Doble** | \cot(x) + \tan(x) = 2\csc(2x) | Suma a cosecante |
| **Auxiliar Cot Doble** | \cot(x) - \tan(x) = 2\cot(2x) | Resta a cotangente |
| **Tangente del Mitad** | \tan\left(\dfrac{x}{2}\right) = \csc(x) - \cot(x) | Sin radical |
| **Cotangente del Mitad**| \cot\left(\dfrac{x}{2}\right) = \csc(x) + \cot(x) | Sin radical |
| **Seno del Triple** | \sin(3x) = 3\sin(x) - 4\sin^3(x) | "Tres sen menos cuatro sen cubo" |
| **Coseno del Triple** | \cos(3x) = 4\cos^3(x) - 3\cos(x) | "Cuatro cos cubo menos tres cos" |
| **Producto 60^\circ \pm x** | \tan(x)\tan(60^\circ - x)\tan(60^\circ + x) = \tan(3x) | Identidad de triplicación |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Expresión A\sin(x) + B\cos(x) (Método del Ángulo Auxiliar)
Cualquier combinación lineal de seno y coseno con el mismo argumento se colapsa en una sola función senoidal:
A\sin(x) + B\cos(x) = \sqrt{A^2 + B^2} \cdot \sin(x + \phi)
Donde \tan(\phi) = \frac{B}{A}.
- **Valores Extremos Instantáneos:**
  - Valor Máximo: +\sqrt{A^2 + B^2}
  - Valor Mínimo: -\sqrt{A^2 + B^2}
  - Ejemplo: El máximo de 3\sin(x) + 4\cos(x) es \sqrt{3^2 + 4^2} = 5. ¡Sale en 1 segundo sin derivar!

### Hack 2: Descomposición de 75^\circ y 15^\circ
- 75^\circ = 45^\circ + 30^\circ \implies \sin(75^\circ) = \frac{\sqrt{6} + \sqrt{2}}{4}, \quad \cos(75^\circ) = \frac{\sqrt{6} - \sqrt{2}}{4}.
- 15^\circ = 45^\circ - 30^\circ \implies \sin(15^\circ) = \frac{\sqrt{6} - \sqrt{2}}{4}, \quad \cos(15^\circ) = \frac{\sqrt{6} + \sqrt{2}}{4}.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Seno y Coseno Compuesto: "SEN-COS-COS-SEN y COS-COS-SEN-SEN"
- **Seno es amable:** Comparte con el coseno y mantiene el signo:
  \sin(A + B) = \textbf{sen } A \textbf{ cos } B + \textbf{cos } A \textbf{ sen } B
- **Coseno es egoísta:** Se junta consigo mismo y te cambia el signo:
  \cos(A + B) = \textbf{cos } A \textbf{ cos } B - \textbf{sen } A \textbf{ sen } B

### 2. Mnemotecnia del Ángulo Triple: "34 Y 43"
- **Seno de 3x:** El número es **34** (3 seno menos 4 seno cubo):
  \sin(3x) = \mathbf{3}\sin x - \mathbf{4}\sin^3 x
- **Coseno de 3x:** El número es **43** (4 coseno cubo menos 3 coseno):
  \cos(3x) = \mathbf{4}\cos^3 x - \mathbf{3}\cos x

### 3. Mnemotecnia de la Degradación: "MENOS ES SENO, MÁS ES COSENO"
- 1 \mathbf{-} \cos(2x) = 2\mathbf{\sin}^2(x) (El signo menos genera seno).
- 1 \mathbf{+} \cos(2x) = 2\mathbf{\cos}^2(x) (El signo más genera coseno).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo del Coseno de la Suma**
> Recordar siempre:
> \cos(x + y) = \cos(x)\cos(y) \mathbf{-} \sin(x)\sin(y)
> Poner un signo + en \cos(x+y) es el error más recurrente de los postulantes bajo estrés de tiempo.

> [!CAUTION]
> **Trampa 2: La Elección del Signo en el Ángulo Mitad**
> En \sin\left(\frac{x}{2}\right) = \pm\sqrt{\frac{1-\cos x}{2}}, el signo **NO depende del cuadrante de x**, sino del cuadrante donde cae \frac{x}{2}.
> Si x \in \text{III C} (180^\circ < x < 270^\circ), entonces 90^\circ < \frac{x}{2} < 135^\circ (\text{II C}).
> En el II C, el seno es POSITIVO (+), pero el coseno es NEGATIVO (-).

> [!WARNING]
> **Trampa 3: Confundir \sin(2x) con 2\sin(x)**
> La función trigonométrica no es distributiva con respecto a los escalares:
> \sin(2x) \ne 2\sin(x) \quad \text{y} \quad \cos(2x) \ne 2\cos(x)
> \sin(2x) es 2\sin(x)\cos(x).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Telecomunicaciones y Modulación de Señales (AM / FM):** La modulación de amplitud mezcla la portadora de alta frecuencia \cos(\omega_c t) con la señal de audio \cos(\omega_m t). Por identidades de productos y compuestos, genera las bandas laterales: \frac{1}{2}[\cos(\omega_c + \omega_m)t + \cos(\omega_c - \omega_m)t].
2. **Generación Eléctrica Trifásica:** Tres bobinados desfasados 120^\circ generan voltajes V_A = V\sin(\omega t), V_B = V\sin(\omega t - 120^\circ) y V_C = V\sin(\omega t + 120^\circ). La suma instantánea de las tres fases es exactamente cero gracias a las identidades condicionales compuestas.
3. **Mecánica Cuántica y Óptica Ondulatoria:** La interferencia de dos rayos de luz con desfase \delta sigue la intensidad I = 4I_0 \cos^2(\frac{\delta}{2}), expresión directa del ángulo mitad.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t06_s02_c01",
                    question = "**Enunciado:** Simplifique la siguiente expresión trigonométrica en función de razones de ángulo simple:",
                    options = listOf(
                        "\\cos(2x)",
                        "\\sin(2x)",
                        "\\tan(2x)",
                        "\\cos^2(x)"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t06_s02_c02",
                    question = "**Enunciado:** Calcule el valor numérico simplificado del siguiente producto de tangentes:",
                    options = listOf(
                        "\\sqrt{3}",
                        "\\dfrac{\\sqrt{3}}{3}",
                        "1",
                        "2\\sqrt{3}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t06_s02_c03",
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
                    id = "trig_t06_s02_c04",
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
                    id = "trig_t06_s02_c05",
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
                    id = "trig_t06_s02_c06",
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
                    id = "trig_t06_s02_c07",
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
                    id = "trig_t06_s02_c08",
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
                    id = "trig_t06_s02_c09",
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
                    id = "trig_t06_s02_c10",
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
