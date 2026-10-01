package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana13 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t13_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Geometría Analítica de Funciones y Optimización |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Crítica / Obligatoria (96%):** Aparece como optimización de parábolas (máximo ingreso / mínima pérdida), gráficas con valor absoluto y traslaciones rígidas. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de trayectorias y modelos de costos cuadráticos), UNI (Máximo entero, signo y transformaciones múltiples). |
| **Competencia Cardinal** | Graficar con precisión las funciones elementales (constante, lineal, cuadrática, raíz cuadrada, valor absoluto, máximo entero), calcular vértices analíticos y modelar traslaciones, compresiones y reflexiones geométricas en el plano cartesiano. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    FE["Funciones Elementales"] --> POLF["Polinomiales: Constante, Lineal, Cuadrática"]
    FE --> SEC["Seccionadas y Especiales: Valor Absoluto, Signo, Máximo Entero"]
    FE --> RACRAD["Racionales y Radicales: 1/x, √x"]
    FE --> TRANSF["Transformaciones de Gráficas"]
    
    POLF --> CUAD["Cuadrática: f(x) = a(x - h)² + k"]
    CUAD --> VERT["Vértice V(h, k): h = -b/(2a), k = f(h)"]
    CUAD --> OPT["Optimización: Mínimo (a > 0) / Máximo (a < 0)"]
    
    SEC --> VA["Valor Absoluto: f(x) = |x| (Forma V)"]
    SEC --> ME["Máximo Entero: f(x) = ⟦x⟧ (Escalones unitarios)"]
    SEC --> SGN["Signo: sgn(x) ∈ {-1, 0, 1}"]
    
    TRANSF --> DESP["Desplazamientos: Horizontal f(x ± h)  |  Vertical f(x) ± k"]
    TRANSF --> REFL["Reflexiones: Eje X [-f(x)]  |  Eje Y [f(-x)]"]
    TRANSF --> MODF["Módulo: |f(x)| (Rebota en eje X)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA XIII: FUNCIONES ELEMENTALES, GRÁFICAS Y TRANSFORMACIONES

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Funciones Polinomiales Básicas

#### 1. Función Constante:
f(x) = c, \quad c \in \mathbb{R}
- \text{Dom}(f) = \mathbb{R}, \quad \text{Ran}(f) = \{c\}
- Su gráfica es una recta horizontal paralela al eje X con pendiente m = 0.

#### 2. Función Identidad:
f(x) = x
- \text{Dom}(f) = \mathbb{R}, \quad \text{Ran}(f) = \mathbb{R}
- Su gráfica es la bisectriz del primer y tercer cuadrante (recta a 45^\circ, pendiente m = 1).

#### 3. Función Lineal (Afín):
f(x) = mx + b, \quad m \neq 0
- \text{Dom}(f) = \mathbb{R}, \quad \text{Ran}(f) = \mathbb{R}
- m: pendiente (\tan \theta). Si m > 0 es creciente; si m < 0 es decreciente.
- b: ordenada al origen (corte con el eje Y en (0, b)).
- Corte con el eje X en (-b/m, 0).

---

### 3.2. Función Cuadrática y Optimización Analítica
f(x) = ax^2 + bx + c, \quad a \neq 0
- \text{Dom}(f) = \mathbb{R}
- Su gráfica es una **parábola** con eje de simetría vertical x = h.

#### Forma Canónica del Vértice:
f(x) = a(x - h)^2 + k
Donde las coordenadas del vértice V(h, k) son:
h = -\frac{b}{2a}, \qquad k = f(h) = c - \frac{b^2}{4a} = \frac{4ac - b^2}{4a}

#### Concavidad y Rango (Optimización):
1. **Si a > 0:** La parábola se abre hacia **arriba** (\bigcup).
   - Posee un **MÍNIMO ABSOLUTO** en el vértice: y_{\min} = k.
   - \text{Ran}(f) = [k, \ +\infty\rangle.
2. **Si a < 0:** La parábola se abre hacia **abajo** (\bigcap).
   - Posee un **MÁXIMO ABSOLUTO** en el vértice: y_{\max} = k.
   - \text{Ran}(f) = \langle -\infty, \ k].

---


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Función / Operación | Regla Analítica | Dominio / Rango |
| :--- | :--- | :--- |
| **Vértice de Parábola** | h = -\frac{b}{2a}, \quad k = f(h) | V(h, k) |
| **Rango Parábola (a > 0)** | \text{Ran}(f) = [k, \ +\infty\rangle | Mínimo en y = k |
| **Rango Parábola (a < 0)** | \text{Ran}(f) = \langle -\infty, \ k] | Máximo en y = k |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t13_s01_c01",
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
                    id = "alg_t13_s01_c02",
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
                    id = "alg_t13_s01_c03",
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
                    id = "alg_t13_s01_c04",
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
                    id = "alg_t13_s01_c05",
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
                    id = "alg_t13_s01_c06",
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
                    id = "alg_t13_s01_c07",
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
                    id = "alg_t13_s01_c08",
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
                    id = "alg_t13_s01_c09",
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
                    id = "alg_t13_s01_c10",
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
            id = "alg_t13_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.3. Funciones Especiales con Discontinuidades o Esquinas

#### 1. Función Valor Absoluto:
f(x) = |x| = \begin{cases} x, & \text{si } x \geq 0 \\ -x, & \text{si } x < 0 \end{cases}
- \text{Dom}(f) = \mathbb{R}, \quad \text{Ran}(f) = [0, \ +\infty\rangle
- Su gráfica es una "V" con vértice en el origen (0, 0).
- Forma trasladada: f(x) = a|x - h| + k, con vértice en V(h, k).

#### 2. Función Raíz Cuadrada:
f(x) = \sqrt{x}
- \text{Dom}(f) = [0, \ +\infty\rangle, \quad \text{Ran}(f) = [0, \ +\infty\rangle
- Gráfica: semiparábola horizontal que parte desde el origen (0, 0).

#### 3. Función Inverso Proporcional:
f(x) = \frac{1}{x}
- \text{Dom}(f) = \mathbb{R} \setminus \{0\}, \quad \text{Ran}(f) = \mathbb{R} \setminus \{0\}
- Gráfica: hipérbola equilátera con asíntota vertical en x = 0 y horizontal en y = 0.

#### 4. Función Signo (\text{sgn}(x)):
\text{sgn}(x) = \begin{cases} 1, & \text{si } x > 0 \\ 0, & \text{si } x = 0 \\ -1, & \text{si } x < 0 \end{cases}
- \text{Dom}(\text{sgn}) = \mathbb{R}, \quad \text{Ran}(\text{sgn}) = \{-1, 0, 1\}.

#### 5. Función Máximo Entero (\llbracket x \rrbracket o \lfloor x \rfloor):
Asigna a cada número real el mayor entero menor o igual que él:
\llbracket x \rrbracket = k \iff k \leq x < k + 1, \quad k \in \mathbb{Z}
- \text{Dom}(f) = \mathbb{R}, \quad \text{Ran}(f) = \mathbb{Z}
- Gráfica: función escalonada con escalones semiabiertos [k, k+1\rangle de longitud 1.
- *Propiedad de traslación entera:* \llbracket x + m \rrbracket = \llbracket x \rrbracket + m \iff m \in \mathbb{Z}.

---

### 3.4. Álgebra de Transformaciones Geométricas de Gráficas

Sea y = f(x) una gráfica conocida en el plano cartesiano y c > 0:

| Transformación | Ecuación | Efecto Geométrico en el Plano |
| :--- | :--- | :--- |
| **Desplazamiento Vertical** | y = f(x) + c | Se desplaza c unidades hacia **arriba**. |
| **Desplazamiento Vertical** | y = f(x) - c | Se desplaza c unidades hacia **abajo**. |
| **Desplazamiento Horizontal** | y = f(x - c) | Se desplaza c unidades hacia la **derecha** (X). |
| **Desplazamiento Horizontal** | y = f(x + c) | Se desplaza c unidades hacia la **izquierda** (X). |
| **Reflexión sobre el eje X** | y = -f(x) | Voltea la gráfica de arriba a abajo (espejo horizontal). |
| **Reflexión sobre el eje Y** | y = f(-x) | Voltea la gráfica de izquierda a derecha (espejo vertical). |
| **Valor Absoluto Global** | y = |f(x)| | Toda la porción que está debajo del eje X se refleja hacia arriba. |
| **Valor Absoluto Local** | y = f(|x|) | Se borra la parte izquierda (x < 0) y se refleja la derecha como espejo simétrico par. |

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Máximo Entero** | \llbracket x \rrbracket = k \iff k \leq x < k + 1 | k \in \mathbb{Z}, \ \text{Ran} = \mathbb{Z} |
| **Propiedad Entera** | \llbracket x + n \rrbracket = \llbracket x \rrbracket + n | n \in \mathbb{Z} |
| **Valor Absoluto Vértice** | f(x) = a\|x - h\| + k | Vértice en (h, k) |
| **Traslación Rígida** | g(x) = f(x - h) + k | Centro trasladado a (h, k) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Optimización Cuadrática Instantánea sin Derivadas
Si te dan un problema DECO de ganancias: G(x) = -2x^2 + 80x - 300:
**¡No derives ni completes cuadrados con tres líneas de fracciones!**
**Hack:** El óptimo ocurre exactamente en el punto medio del vértice:
x_{\text{óptimo}} = -\frac{b}{2a} = -\frac{80}{2(-2)} = \frac{80}{4} = 20
La ganancia máxima es simplemente evaluar en 20:
G(20) = -2(20)^2 + 80(20) - 300 = -800 + 1600 - 300 = 500 \text{ soles}
¡Resuelto en 10 segundos!

### Artificio 2: Graficación Rápida de Módulo Global y = |f(x)|
Cuando tengas que graficar y = |x^2 - 4|:
1. Grafica la parábola normal y = x^2 - 4 (vértice en (0, -4), pasa por -2 y 2).
2. Todo lo que está por debajo del eje X (el arco entre -2 y 2 con vértice en -4) **lo volteas como un espejo hacia arriba**: el vértice salta a (0, +4).
3. La forma final es una "W" apoyada sobre el eje X.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Signo del Desplazamiento Horizontal: "Al revés del mundo"
- En f(x \mathbf{-} 3), el postulante cree que se va a la izquierda por el menos.
> **"Lo que está DENTRO del paréntesis va AL REVÉS: si dice MENOS, camina a la DERECHA (+); si dice MÁS, camina a la IZQUIERDA (-)."**
- En cambio, lo que está FUERA (f(x) \pm k) va directo al grano: si suma sube, si resta baja.

### 2. Concavidad de la Parábola: "La Sonrisa Cuadrática"
- Si a > 0 (positivo, alegre) \implies Parábola sonriente (\bigcup, abre arriba \to tiene un fondo/mínimo).
- Si a < 0 (negativo, triste) \implies Parábola fruncida (\bigcap, abre abajo \to tiene una cima/máximo).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Máximo Entero de Números Negativos**
> ¿Cuánto vale \llbracket -3.2 \rrbracket?
> El estudiante novato responde -3. **¡ERROR GARRAFAL!**
> Recuerda la definición: es el entero **MENOR O IGUAL**. En la recta numérica, a la izquierda de -3.2 está -4:
> \llbracket -3.2 \rrbracket = -4
> ¡Solo para números positivos se trunca la parte decimal!

> [!CAUTION]
> **Trampa 2: La Raíz Cuadrada NO Produce Gráfica Arriba y Abajo**
> Si te piden graficar y = \sqrt{x}, muchos dibujan la parábola horizontal completa (con rama superior e inferior).
> **Eso viola el principio de función:** una recta vertical la cortaría dos veces. El radical con signo positivo implícito \sqrt{x} solo abarca la rama **superior no negativa** (y \geq 0).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización del Rendimiento Fotovoltaico en las Plantas Solares de La Joya
En los parques solares fotovoltaicos del desierto de La Joya (Arequipa), la potencia eléctrica neta suministrada a la red P(\theta) varía en función del ángulo cenital de incidencia solar \theta según una función cuadrática de pérdidas térmicas:
P(\theta) = -1.5\theta^2 + 180\theta - 2400 \quad (\text{en kilowatts})
La determinación analítica del vértice de la parábola mediante h = -b/(2a) permite a los controladores electrónicos de los seguidores solares orientar los paneles con precisión de fracciones de grado a la hora del cénit solar para alcanzar la máxima transferencia de potencia sin sobrecalentar los inversores trifásicos.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t13_s02_c01",
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
                    id = "alg_t13_s02_c02",
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
                    id = "alg_t13_s02_c03",
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
                    id = "alg_t13_s02_c04",
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
                    id = "alg_t13_s02_c05",
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
                    id = "alg_t13_s02_c06",
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
                    id = "alg_t13_s02_c07",
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
                    id = "alg_t13_s02_c08",
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
                    id = "alg_t13_s02_c09",
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
                    id = "alg_t13_s02_c10",
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
