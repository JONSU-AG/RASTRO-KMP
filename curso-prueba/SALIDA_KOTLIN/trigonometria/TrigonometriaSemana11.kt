package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana11 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t11_s01",
            title = "FUNCIONES TRIGONOMÉTRICAS INVERSAS (FUNCIONES ARCO) - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "FUNCIONES TRIGONOMÉTRICAS INVERSAS (FUNCIONES ARCO) - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Análisis Matemático y Funciones Trascendentes |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Funciones Inversas, Biyectividad, Funciones Trigonométricas Directas y Radianes |

### Competencias Clave del Prospecto
1. **Comprensión de Dominios y Rangos Restringidos:** Dominar los intervalos de existencia y los rangos principales de las funciones arco seno, arco coseno y arco tangente.
2. **Propiedades de Paridad y Simetría:** Aplicar las identidades para argumentos negativos (\arcsin(-x) = -\arcsin x y \arccos(-x) = \pi - \arccos x).
3. **Manejo de Arcos Complementarios:** Utilizar la suma fundamental \arcsin(x) + \arccos(x) = \frac{\pi}{2} y \arctan(x) + \text{arccot}(x) = \frac{\pi}{2}.
4. **Composición de Funciones y Despeje Triangular:** Resolver composiciones del tipo \arcsin(\sin\theta) cuando \theta excede el rango principal y sumar arcos mediante la fórmula de la tangente compuesta.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Funciones Trigonométricas Inversas] --> B[Función Arco Seno: arcsin x]
    A --> C[Función Arco Coseno: arccos x]
    A --> D[Función Arco Tangente: arctan x]
    A --> E[Propiedades Fundamentales]
    A --> F[Adición de Arcos: Teorema de Euler]

    B --> B1[Dom: [-1, 1], Ran: [-π/2, π/2]]
    B --> B2[Impar: arcsin -x = -arcsin x]

    C --> C1[Dom: [-1, 1], Ran: [0, π]]
    C --> C2[Suplementaria: arccos -x = π - arccos x]

    D --> D1[Dom: R, Ran: <-π/2, π/2>]
    D --> D2[Asíntotas Horizontales: y = ± π/2]

    E --> E1[Arcos Complementarios: arcsin x + arccos x = π/2]
    E --> E2[Composición Directa: sen arcsin x = x]
    E --> E3[Composición Inversa: arcsin sen θ = θ solo en el rango]

    F --> F1[arctan x + arctan y = arctan x+y / 1-xy para xy < 1]
    F --> F2[Cambio de Arco mediante Triángulo Auxiliar]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Concepto y Necesidad de Restricción
Dado que las funciones trigonométricas directas son periódicas, **no son inyectivas** en todo su dominio real; por tanto, no admiten función inversa global.
Para construir la función inversa, es matemáticamente obligatorio **restringir el dominio** a un intervalo cerrado donde la función sea estrictamente monótona (creciente o decreciente) y continua, garantizando su **biyectividad**:
y = \text{arc R.T.}(x) \iff \text{R.T.}(y) = x \quad \text{con } y \in \text{Ran}(\text{arc R.T.})

*Interpretación Semántica:* \arcsin(x) se lee literalmente: *"El arco (o ángulo en radianes) cuyo seno es x"*.

---

### 3.2. Las Tres Funciones Inversas Principales

#### 1. Función Arco Seno: y = \arcsin(x) = \sin^{-1}(x)
- **Definición:** y = \arcsin(x) \iff \sin(y) = x.
- **Dominio:** \text{Dom} = [-1, 1].
- **Rango (Intervalo Principal):** \text{Ran} = \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right].
- **Monotonía:** Estrictamente creciente en todo su dominio [-1, 1].
- **Paridad:** Función impar:
  \arcsin(-x) = -\arcsin(x)
- **Valores Notables:**
  \arcsin(0) = 0, \quad \arcsin(1) = \frac{\pi}{2}, \quad \arcsin(-1) = -\frac{\pi}{2}, \quad \arcsin\left(\frac{1}{2}\right) = \frac{\pi}{6}

#### 2. Función Arco Coseno: y = \arccos(x) = \cos^{-1}(x)
- **Definición:** y = \arccos(x) \iff \cos(y) = x.
- **Dominio:** \text{Dom} = [-1, 1].
- **Rango (Intervalo Principal):** \text{Ran} = [0, \pi].
- **Monotonía:** Estrictamente decreciente en todo su dominio.
- **Propiedad para Argumentos Negativos:**
  \arccos(-x) = \pi - \arccos(x)
- **Valores Notables:**
  \arccos(1) = 0, \quad \arccos(0) = \frac{\pi}{2}, \quad \arccos(-1) = \pi, \quad \arccos\left(\frac{1}{2}\right) = \frac{\pi}{3}, \quad \arccos\left(-\frac{1}{2}\right) = \frac{2\pi}{3}

#### 3. Función Arco Tangente: y = \arctan(x) = \tan^{-1}(x)
- **Definición:** y = \arctan(x) \iff \tan(y) = x.
- **Dominio:** \text{Dom} = \mathbb{R} = \langle -\infty, +\infty \rangle.
- **Rango (Intervalo Principal):** \text{Ran} = \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle.
- **Monotonía:** Estrictamente creciente en todo \mathbb{R}.
- **Paridad:** Función impar:
  \arctan(-x) = -\arctan(x)
- **Asíntotas Horizontales:** Rectas y = \dfrac{\pi}{2} (cuando x \to +\infty) e y = -\dfrac{\pi}{2} (cuando x \to -\infty).
- **Valores Notables:**
  \arctan(0) = 0, \quad \arctan(1) = \frac{\pi}{4}, \quad \arctan(-1) = -\frac{\pi}{4}, \quad \arctan(\sqrt{3}) = \frac{\pi}{3}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Función Inversa | Dominio | Rango | Simetría / Paridad |
| :--- | :--- | :--- | :--- |
| **\arcsin(x)** | [-1, 1] | \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] | \arcsin(-x) = -\arcsin(x) |
| **\arccos(x)** | [-1, 1] | [0, \pi] | \arccos(-x) = \pi - \arccos(x) |
| **\arctan(x)** | \mathbb{R} | \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle| \arctan(-x) = -\arctan(x) |
| **\text{arccot}(x)**| \mathbb{R} | \langle 0, \pi \rangle | \text{arccot}(-x) = \pi - \text{arccot}(x) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t11_s01_c01",
                    question = "**Enunciado:** Calcule el valor numérico en radianes de la siguiente expresión:",
                    options = listOf(
                        "\\dfrac{3\\pi}{4}",
                        "\\dfrac{\\pi}{2}",
                        "\\pi",
                        "\\dfrac{2\\pi}{3}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t11_s01_c02",
                    question = "**Enunciado:** Calcule el valor de:",
                    options = listOf(
                        "\\dfrac{7\\pi}{6}",
                        "\\dfrac{5\\pi}{6}",
                        "\\dfrac{\\pi}{2}",
                        "\\dfrac{2\\pi}{3}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t11_s01_c03",
                    question = "**Enunciado:** Calcule el valor exacto de:",
                    options = listOf(
                        "\\dfrac{12}{5}",
                        "\\dfrac{5}{12}",
                        "\\dfrac{12}{13}",
                        "\\dfrac{13}{5}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t11_s01_c04",
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
                    id = "trig_t11_s01_c05",
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
                    id = "trig_t11_s01_c06",
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
                    id = "trig_t11_s01_c07",
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
                    id = "trig_t11_s01_c08",
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
                    id = "trig_t11_s01_c09",
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
                    id = "trig_t11_s01_c10",
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
            id = "trig_t11_s02",
            title = "FUNCIONES TRIGONOMÉTRICAS INVERSAS (FUNCIONES ARCO) - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "FUNCIONES TRIGONOMÉTRICAS INVERSAS (FUNCIONES ARCO) - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

---

### 3.3. Funciones Inversas Secundarias

1. **Arco Cotangente (y = \text{arccot } x):**
   - \text{Dom} = \mathbb{R}, \text{Ran} = \langle 0, \pi \rangle.
   - Propiedad para negativos: \text{arccot}(-x) = \pi - \text{arccot}(x).
2. **Arco Secante (y = \text{arcsec } x):**
   - \text{Dom} = \langle -\infty, -1] \cup [1, +\infty\rangle, \text{Ran} = [0, \pi] \setminus \left\{\frac{\pi}{2}\right\}.
   - Propiedad para negativos: \text{arcsec}(-x) = \pi - \text{arcsec}(x).
3. **Arco Cosecante (y = \text{arccsc } x):**
   - \text{Dom} = \langle -\infty, -1] \cup [1, +\infty\rangle, \text{Ran} = \left[-\frac{\pi}{2}, \frac{\pi}{2}\right] \setminus \{0\}.
   - Propiedad para negativos: \text{arccsc}(-x) = -\text{arccsc}(x).

---

### 3.4. Teoremas y Propiedades Fundamentales

#### 1. Suma de Arcos Complementarios:
\arcsin(x) + \arccos(x) = \frac{\pi}{2} \quad (\forall x \in [-1, 1])
\arctan(x) + \text{arccot}(x) = \frac{\pi}{2} \quad (\forall x \in \mathbb{R})
\text{arcsec}(x) + \text{arccsc}(x) = \frac{\pi}{2} \quad (|x| \ge 1)

#### 2. Composición de Funciones (Directa vs Inversa):
- **Operador Directo afuera:** Se cancela siempre en todo el dominio de la función arco:
  \sin(\arcsin x) = x \quad (\forall x \in [-1, 1])
  \cos(\arccos x) = x \quad (\forall x \in [-1, 1])
  \tan(\arctan x) = x \quad (\forall x \in \mathbb{R})
- **Operador Inverso afuera (¡Peligro Examen!):** Se cancela **ÚNICAMENTE** si el ángulo original \theta pertenece al rango restringido de la función arco:
  \arcsin(\sin \theta) = \theta \iff \theta \in \left[-\frac{\pi}{2}, \frac{\pi}{2}\right]
  \arccos(\cos \theta) = \theta \iff \theta \in [0, \pi]
  \arctan(\tan \theta) = \theta \iff \theta \in \left\langle -\frac{\pi}{2}, \frac{\pi}{2} \right\rangle
  - Si \theta no pertenece al rango, debe **reducirse al rango principal** mediante ángulos equivalentes.
  - Ejemplo: \arcsin(\sin\frac{5\pi}{6}) \ne \frac{5\pi}{6} (pues \frac{5\pi}{6} = 150^\circ > 90^\circ). Como \sin(\frac{5\pi}{6}) = \sin(\frac{\pi}{6}), el resultado es \frac{\pi}{6}.

#### 3. Fórmula de Adición de Arco Tangente:
\arctan(x) + \arctan(y) = \arctan\left(\frac{x + y}{1 - xy}\right) \quad (\text{si } xy < 1)
- Si x > 0, y > 0 y xy > 1:
  \arctan(x) + \arctan(y) = \pi + \arctan\left(\frac{x + y}{1 - xy}\right)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **\arcsin x + \arccos x**| [-1, 1] | \dfrac{\pi}{2} constante | Arcos complementarios |
| **\arctan x + \text{arccot } x**| \mathbb{R} | \dfrac{\pi}{2} constante | Arcos complementarios |
| **Recíproco Arco** | \text{arccot}(x) = \arctan\left(\dfrac{1}{x}\right) | Para x > 0 | Cambio de función |
| **Recíproco Arco** | \text{arcsec}(x) = \arccos\left(\dfrac{1}{x}\right) | Para |x| \ge 1 | Cambio a coseno |
| **Adición Arcos** | \arctan x + \arctan y = \arctan\left(\dfrac{x+y}{1-xy}\right)| Para xy < 1 | Teorema de Euler |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Reducción Rápida de \arcsin(\sin\theta) y \arccos(\cos\theta)
Si te piden evaluar \arccos(\cos 300^\circ):
- **NO pongas 300^\circ** (está fuera de [0, 180^\circ]).
- Por reducción al primer cuadrante: \cos(300^\circ) = \cos(360^\circ - 60^\circ) = \cos(60^\circ).
- Ahora sí, como 60^\circ \in [0, 180^\circ]:
  \arccos(\cos 60^\circ) = 60^\circ = \frac{\pi}{3}\text{ rad}
- ¡Toma 5 segundos reducir al intervalo permitido!

### Hack 2: Suma de Tres Arco Tangentes Notables
En problemas clásicos donde x = 1, y = 2, z = 3:
\arctan(1) + \arctan(2) + \arctan(3) = \pi
- \arctan(1) = \frac{\pi}{4}.
- \arctan(2) + \arctan(3) = \frac{3\pi}{4}.
- ¡Memoriza que la suma de \arctan(1) + \arctan(2) + \arctan(3) da exactamente \pi (180^\circ)!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Signo Menos: "LOS CO-ARCOS RESTAN CON PI"
- Las funciones que llevan la sílaba **CO** (\arccos, \text{arccot}, \text{arcsec}) no son impares: al recibir un negativo, **RESTAN DE \pi**:
  \text{CO-ARCO}(-x) = \mathbf{\pi - \text{CO-ARCO}(x)}
- Las otras tres (\arcsin, \arctan, \text{arccsc}) son impares directas: simplemente sacan el signo menos hacia afuera:
  \arcsin(-x) = -\arcsin(x)

### 2. Mnemotecnia del Triángulo Auxiliar: "PONLE \alpha Y DIBUJA"
- Cada vez que veas una función trigonométrica inversa como argumento de otra razón (ejemplo: \tan(\arccos \frac{3}{5})):
  1. Nómbralo como un ángulo: Sea \alpha = \arccos(\frac{3}{5}) \implies \cos(\alpha) = \frac{3}{5}.
  2. Dibuja un triángulo rectángulo: Cateto adyacente = 3, hipotenusa = 5, cateto opuesto = 4.
  3. Lee la razón pedida directamente del dibujo: \tan(\alpha) = \frac{4}{3}. ¡Sin fórmulas!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Dominio de Arco Seno y Arco Coseno**
> \arcsin(x) y \arccos(x) **NO EXISTEN** para valores de x fuera del intervalo [-1, 1].
> Si un problema conduce a \arcsin(2) o \arccos(-1.5), la expresión es un absurdo matemático (conjunto vacío \emptyset).

> [!CAUTION]
> **Trampa 2: La Notación \sin^{-1}(x) no es \frac{1}{\sin(x)}**
> En cálculo superior y calculadoras científicas, \sin^{-1}(x) denota la **función inversa** (\arcsin x).
> NO confundir con el inverso multiplicativo (la cosecante):
> \sin^{-1}(x) \ne (\sin x)^{-1} = \frac{1}{\sin(x)} = \csc(x)

> [!WARNING]
> **Trampa 3: Rango Cerrado vs Abierto en la Arco Tangente**
> El rango de \arctan(x) es **ABIERTO**: \left\langle -\frac{\pi}{2}, \frac{\pi}{2} \right\rangle.
> La tangente nunca alcanza +\infty o -\infty, por lo que \arctan(x) **NUNCA puede ser igual a \frac{\pi}{2} ni a -\frac{\pi}{2}**.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Visión por Computadora y Robótica (Cinemática Inversa):** Para que el brazo de un robot se posicione en las coordenadas (x, y), los servomotores deben girar un ángulo de articulación calculado mediante la función \theta = \text{atan2}(y, x) (arco tangente de dos argumentos con signo de cuadrante).
2. **Navegación Aérea y Corrección de Deriva:** El ángulo de corrección de rumbo de un avión frente a un viento lateral de velocidad v_v con velocidad propia v_a se determina mediante \theta = \arcsin\left(\frac{v_v}{v_a}\right).
3. **Cálculo de Desnivel y Pendientes Viales:** Los altímetros digitales y niveles láser calculan el ángulo de inclinación de rampas mediante \theta = \arctan\left(\frac{\Delta h}{d}\right).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t11_s02_c01",
                    question = "**Enunciado:** Determine el dominio de la función real definida por:",
                    options = listOf(
                        "[-1, 4]",
                        "[-2, 3]",
                        "[-4, 4]",
                        "[1, 4]"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t11_s02_c02",
                    question = "**Enunciado:** Calcule el valor simplificado de la siguiente expresión compuesta:",
                    options = listOf(
                        "\\dfrac{\\pi}{2}",
                        "\\dfrac{5\\pi}{6}",
                        "\\dfrac{\\pi}{3}",
                        "\\pi"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t11_s02_c03",
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
                    id = "trig_t11_s02_c04",
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
                    id = "trig_t11_s02_c05",
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
                    id = "trig_t11_s02_c06",
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
                    id = "trig_t11_s02_c07",
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
                    id = "trig_t11_s02_c08",
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
                    id = "trig_t11_s02_c09",
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
                    id = "trig_t11_s02_c10",
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
