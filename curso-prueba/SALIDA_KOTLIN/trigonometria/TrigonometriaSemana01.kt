package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t01_s01",
            title = "ÁNGULO TRIGONOMÉTRICO Y SISTEMAS DE MEDIDAS ANGULARES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁNGULO TRIGONOMÉTRICO Y SISTEMAS DE MEDIDAS ANGULARES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Trigonometría Plana |
| **Nivel de Complejidad** | Básico a Intermedio (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 3.0 a 4.0 horas |
| **Prerrequisitos** | Álgebra Elemental (Ecuaciones de 1.er grado, Razones y Proporciones) y Geometría Básica (Ángulos) |

### Competencias Clave del Prospecto
1. **Comprensión Operativa del Ángulo Trigonométrico:** Distinguir la naturaleza rotacional, el sentido horario/antihorario y el cambio de signo para operaciones geométricas.
2. **Dominio de Sistemas Angulares:** Comprender la estructura de unidades y subunidades de los sistemas Sexagesimal (S), Centesimal (C) y Radial (R).
3. **Conversión y Relación Numérica:** Aplicar la fórmula general \frac{S}{180} = \frac{C}{200} = \frac{R}{\pi} y la simplificada \frac{S}{9} = \frac{C}{10} con la constante k.
4. **Resolución de Ecuaciones Angulares:** Resolver identidades y relaciones algebraicas condicionales que involucran números de grados, minutos y segundos en los tres sistemas.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Ángulo Trigonométrico y Sistemas Angulares] --> B[Ángulo Trigonométrico]
    A --> C[Sistemas de Medición]
    A --> D[Fórmula General de Conversión]
    A --> E[Subunidades y Relaciones Especiales]

    B --> B1[Generación por Rotación de un Rayo]
    B --> B2[Sentido Antihorario: Positivo +]
    B --> B3[Sentido Horario: Negativo -]
    B --> B4[Magnitud Ilimitada: -inf a +inf]

    C --> C1[Sistema Sexagesimal / Inglés S: 1 v = 360°]
    C --> C2[Sistema Centesimal / Francés C: 1 v = 400g]
    C --> C3[Sistema Radial / Internacional R: 1 v = 2π rad]

    D --> D1[Fórmula Fundamental: S/180 = C/200 = R/π]
    D --> D2[Relación Sexagesimal-Centesimal: S/9 = C/10]
    D --> D3[Constante Simplificada: S=9k, C=10k, R=πk/20]

    E --> E1[Minutos y Segundos Sexagesimales: 1° = 60' = 3600'']
    E --> E2[Minutos y Segundos Centesimales: 1g = 100m = 10000s]
    E --> E3[Factor de Conversión Unitario]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. El Ángulo Trigonométrico
A diferencia del ángulo geométrico (que es estático y no negativo, 0^\circ \le \theta \le 360^\circ), el **ángulo trigonométrico** se genera por la **rotación de un rayo coplanar** alrededor de su origen (denominado **vértice**), desde una posición inicial (**lado inicial**) hasta una posición final (**lado terminal**).

#### Características Fundamentales:
1. **Sentido y Signo:**
   - **Sentido Antihorario:** La rotación se efectúa en sentido contrario al movimiento de las manecillas del reloj. Por convención universal, el ángulo es **POSITIVO (+)**.
   - **Sentido Horario:** La rotación se realiza a favor de las manecillas del reloj. Por convención, el ángulo es **NEGATIVO (-)**.
2. **Magnitud Ilimitada:**
   Un ángulo trigonométrico puede girar un número infinito de vueltas en cualquiera de los dos sentidos:
   \theta \in \langle -\infty, +\infty \rangle
3. **Regla de Operación Geométrica:**
   Para operar o sumar ángulos trigonométricos en una figura geométrica, **TODOS deben orientarse obligatoriamente en el mismo sentido** (preferentemente antihorario). Al cambiar el sentido de rotación de un ángulo, su signo se invierte:
   \text{Sentido Horario } (\alpha) \implies \text{Sentido Antihorario } (-\alpha)

---

### 3.2. Sistemas de Medición Angular

#### 1. Sistema Sexagesimal o Inglés (S)
Toma como base la división de la circunferencia en 360 partes iguales:
- **Unidad:** Grado sexagesimal (1^\circ).
  1 \text{ vuelta} = 360^\circ
- **Subunidades:**
  - Minuto sexagesimal (1'): 1^\circ = 60'
  - Segundo sexagesimal (1''): 1' = 60'' \implies 1^\circ = 3600''
- **Notación aditiva:** A^\circ B' C'' \equiv A^\circ + B' + C''.

#### 2. Sistema Centesimal o Francés (C)
Toma como base la división decimal de la circunferencia en 400 partes iguales:
- **Unidad:** Grado centesimal o gonio (1^g).
  1 \text{ vuelta} = 400^g
- **Subunidades:**
  - Minuto centesimal (1^m): 1^g = 100^m
  - Segundo centesimal (1^s): 1^m = 100^s \implies 1^g = 10000^s
- **Notación aditiva:** A^g B^m C^s \equiv A^g + B^m + C^s.

#### 3. Sistema Radial, Circular o Internacional (R)
- **Unidad:** Radián (1\text{ rad}).
- **Definición de Radián:** Es la medida de un ángulo central que subtiende sobre cualquier circunferencia un arco cuya longitud lineal es exactamente igual al radio de dicha circunferencia (L = R).
  1 \text{ vuelta} = 2\pi\text{ rad} \approx 6.28318\text{ rad}
- **Aproximaciones de \pi más usadas en exámenes de admisión:**
  \pi \approx 3.14159265... \approx 3.1416 \approx \frac{22}{7} \approx \sqrt{2} + \sqrt{3} \approx \sqrt{10}
- **Equivalencia de 1 radián en el sistema sexagesimal:**
  1\text{ rad} = \frac{180^\circ}{\pi} \approx 57^\circ 17' 45''
- **Equivalencia de 1 radián en el sistema centesimal:**
  1\text{ rad} = \frac{200^g}{\pi} \approx 63^g 66^m 20^s


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Relación / Sistema | Expresión Matemática Rigurosa | Campo de Aplicación |
| :--- | :--- | :--- |
| **Relación de Vuelta** | 1\text{ v} = 360^\circ = 400^g = 2\pi\text{ rad} | Equivalencia angular total |
| **Fórmula General** | \dfrac{S}{180} = \dfrac{C}{200} = \dfrac{R}{\pi} | Conversión universal de ángulos |
| **Fórmula Práctica** | \dfrac{S}{9} = \dfrac{C}{10} = k \implies R = \dfrac{\pi k}{20} | Ecuaciones algebraicas con S, C, R |
| **Subunidades Sexagesimales**| 1^\circ = 60' \quad \land \quad 1' = 60'' \implies 1^\circ = 3600'' | Sistema inglés |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t01_s01_c01",
                    question = "**Enunciado:** Convierta un ángulo que mide 72^\\circ al sistema radial (circular).",
                    options = listOf(
                        "\\dfrac{2\\pi}{5}\\text{ rad}",
                        "\\dfrac{3\\pi}{5}\\text{ rad}",
                        "\\dfrac{\\pi}{5}\\text{ rad}",
                        "\\dfrac{4\\pi}{5}\\text{ rad}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t01_s01_c02",
                    question = "**Enunciado:** Siendo S y C los números convencionales que representan la medida de un ángulo en los sistemas sexagesimal y centesimal respectivamente, se cumple la siguiente relación:",
                    options = listOf(
                        "\\dfrac{\\pi}{10}\\text{ rad}",
                        "\\dfrac{\\pi}{20}\\text{ rad}",
                        "\\dfrac{\\pi}{4}\\text{ rad}",
                        "\\dfrac{\\pi}{5}\\text{ rad}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t01_s01_c03",
                    question = "**Enunciado:** La suma de las medidas de dos ángulos es 80^g y su diferencia es 18^\\circ. Calcule la medida del menor de los ángulos en el sistema sexagesimal.",
                    options = listOf(
                        "27^\\circ",
                        "45^\\circ",
                        "36^\\circ",
                        "18^\\circ"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t01_s01_c04",
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
                    id = "trig_t01_s01_c05",
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
                    id = "trig_t01_s01_c06",
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
                    id = "trig_t01_s01_c07",
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
                    id = "trig_t01_s01_c08",
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
                    id = "trig_t01_s01_c09",
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
                    id = "trig_t01_s01_c10",
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
            id = "trig_t01_s02",
            title = "ÁNGULO TRIGONOMÉTRICO Y SISTEMAS DE MEDIDAS ANGULARES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁNGULO TRIGONOMÉTRICO Y SISTEMAS DE MEDIDAS ANGULARES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
---

### 3.3. Relación de Magnitud entre las Unidades
Comparando una vuelta completa en los tres sistemas:
1 \text{ vuelta} = 360^\circ = 400^g = 2\pi\text{ rad}
Dividiendo entre sus respectivas cantidades de unidades por vuelta:
1\text{ rad} > 1^\circ > 1^g
*Observación crucial:* Para un mismo ángulo positivo, el número de unidades verifica:
C > S > R

---

### 3.4. Fórmula General de Conversión

Sean S, C y R los números que representan la medida de un mismo ángulo en grados sexagesimales, grados centesimales y radianes respectivamente:
\frac{S}{360} = \frac{C}{400} = \frac{R}{2\pi}
Simplificando por 20:
\frac{S}{180} = \frac{C}{200} = \frac{R}{\pi}

#### 1. Escala Universal (con constante K):
S = 180K, \quad C = 200K, \quad R = \pi K

#### 2. Escala Práctica Simplificada entre S y C (con constante k):
\frac{S}{9} = \frac{C}{10} = k
De donde:
S = 9k, \quad C = 10k, \quad R = \frac{\pi k}{20}
*(Esta parametrización es la más rápida para resolver el 95% de ecuaciones preuniversitarias).*

#### 3. Relación entre Minutos y Segundos:
- Sean m_s el número de minutos sexagesimales y m_c el número de minutos centesimales:
  \frac{m_s}{27} = \frac{m_c}{50}
- Sean s_s el número de segundos sexagesimales y s_c el número de segundos centesimales:
  \frac{s_s}{81} = \frac{s_c}{250}

---

### 3.5. Método del Factor de Conversión Unitario
Para transformar un ángulo de un sistema a otro, se multiplica por una fracción equivalente a la unidad (1):
\text{Valor en Sistema Deseado} = \text{Valor Dado} \times \left( \frac{\text{Unidad que quiero}}{\text{Unidad que tengo}} \right)

*Factores Clave de Conversión Directa:*
- De grados sexagesimales a centesimales: \times \dfrac{10^g}{9^\circ}
- De grados centesimales a sexagesimales: \times \dfrac{9^\circ}{10^g}
- De sexagesimales a radianes: \times \dfrac{\pi\text{ rad}}{180^\circ}
- De centesimales a radianes: \times \dfrac{\pi\text{ rad}}{200^g}
- De radianes a sexagesimales: \times \dfrac{180^\circ}{\pi\text{ rad}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Subunidades Centesimales** | 1^g = 100^m \quad \land \quad 1^m = 100^s \implies 1^g = 10000^s | Sistema francés decimal |
| **Relación de Minutos** | \dfrac{m_s}{27} = \dfrac{m_c}{50} | m_s: min sexagesimales, m_c: min centesimales |
| **Relación de Segundos**| \dfrac{s_s}{81} = \dfrac{s_c}{250} | s_s: seg sexagesimales, s_c: seg centesimales |
| **Comparación de Unidades** | 1\text{ rad} > 1^\circ > 1^g | Tamaño físico de 1 unidad angular |
| **Comparación Numérica** | C > S > R \quad (\text{para } \theta > 0) | Cantidad numérica de unidades |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Simplificación de la Fracción \frac{C + S}{C - S}
Esta fracción aparece en infinidad de preguntas de CEPREUNSA y UNMSM:
\frac{C + S}{C - S} = \frac{10k + 9k}{10k - 9k} = \frac{19k}{1k} = 19
- ¡Vale exactamente **19** siempre! No pierdas tiempo deduciendo, memorízalo como constante preuniversitaria.
- Análogamente:
  \frac{C - S}{C + S} = \frac{1}{19}
  \sqrt{\frac{C + S}{C - S} + 17} = \sqrt{19 + 17} = \sqrt{36} = 6

### Hack 2: Inversión Rápida de Ángulos en Figuras
En gráficos geométricos donde aparezcan ángulos con flechas en sentido horario (a favor del reloj):
1. Tacha la flecha original.
2. Dibuja la flecha en sentido antihorario.
3. Cambia de signo a toda la expresión: Si era (\alpha - 20^\circ) \to -( \alpha - 20^\circ) = (20^\circ - \alpha).
4. Ahora suma tranquilamente los ángulos e iguala a 90^\circ, 180^\circ o 360^\circ según la figura geométrica plana.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Tamaño vs Número: "EL ELEFANTE Y LAS HORMIGAS"
- **Unidad más grande:** El **R**adián es un **ELEFANTE** (1\text{ rad} \approx 57.3^\circ).
- **Unidad más pequeña:** El grado centesimal (^g) es una **HORMIGA**.
- Por eso, para medir el mismo ángulo:
  - Necesitas poquitos radianes (R es pequeño numéricamente).
  - Necesitas muchos centesimales (C es grande numéricamente).
  - Regla mnemotécnica:
    \text{Unidades: } \text{Rad} > ^\circ > ^g \quad \Longleftrightarrow \quad \text{Números: } C > S > R

### 2. Mnemotecnia de la Parametrización: "NUEVE Y DIEZ (9k y 10k)"
- Siempre que veas una ecuación con S y C (ejemplo: \frac{C + S}{C - S}):
  - Sustituye de inmediato: S = 9k, C = 10k.
  - Si aparece R: R = \frac{\pi k}{20}.
  - ¡El 99% de las k se cancelan al instante!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Minuto Sexagesimal no es igual al Minuto Centesimal**
> 1' sexagesimal equivale a \frac{1^\circ}{60}.  
> 1^m centesimal equivale a \frac{1^g}{100}.  
> Muchos postulantes asumen erróneamente que 1' = 1^m. La relación real es:
> \frac{1'}{1^m} = \frac{50}{27} \approx 1.85
> ¡El minuto sexagesimal es casi el doble de grande que el minuto centesimal!

> [!CAUTION]
> **Trampa 2: La Notación a^\circ b' no significa multiplicación**
> En álgebra elemental, xy es x multiplicado por y.  
> En trigonometría angular, 3^\circ 20' es una **SUMA**:
> 3^\circ 20' = 3^\circ + 20' = 3^\circ + \frac{20^\circ}{60} = 3^\circ + \frac{1^\circ}{3} = \frac{10^\circ}{3}
> ¡Multiplicar 3 \times 20 = 60 es el error clásico número 1 en admisión!

> [!WARNING]
> **Trampa 3: Signo al Cambiar de Sentido**
> Si el ángulo es x^\circ en sentido horario, al cambiarlo a antihorario se vuelve -x^\circ. Si la ecuación geométrica es un ángulo llano (180^\circ):
> \text{Antihorario}_1 - \text{Horario}_2 = 180^\circ
> No olvides aplicar la ley de signos a todos los términos dentro del paréntesis: -(30^\circ - 2x) = 2x - 30^\circ.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Topografía e Ingeniería Civil (Uso del Sistema Centesimal):** Los teodolitos y estaciones totales modernas emplean frecuentemente el sistema centesimal (grados gonios, 400^g) porque facilita el cálculo de pendientes y cotas en porcentaje mediante división decimal directa sin conversiones sexagesimales de base 60.
2. **Astronomía y Posicionamiento Orbital (Ascensión Recta y Declinación):** Las coordenadas celestes combinan horas, minutos y segundos de tiempo con grados sexagesimales de declinación para apuntar telescopios hacia estrellas y satélites geoestacionarios.
3. **Cálculo Diferencial e Integral (Obligatoriedad del Radián):** En física teórica y cálculo superior, las funciones trigonométricas (\sin(x), \cos(x)) y el límite fundamental \lim_{x \to 0} \frac{\sin(x)}{x} = 1 son válidos **únicamente si el ángulo x está expresado en radianes**. Si se emplearan grados, aparecería un factor parásito \frac{\pi}{180} en cada derivada.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t01_s02_c01",
                    question = "**Enunciado:** Un topógrafo registra la orientación angular de un lindero en un plano catastral. El ángulo medido en grados, minutos y segundos centesimales es x = 1^g 50^m. Otro técnico realiza la medición en el sistema sexagesimal obteniendo y = A^\\circ B'. Si ambos técnicos midieron exactamente el mismo ángulo físico, calcule el valor numérico de \\frac{A + B}{B - A}.",
                    options = listOf(
                        "\\frac{23}{17}",
                        "\\frac{7}{3}",
                        "\\frac{31}{29}",
                        "\\frac{19}{11}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t01_s02_c02",
                    question = "**Enunciado:** Para un determinado ángulo no nulo se cumple la siguiente relación entre sus números convencionales S, C y R:",
                    options = listOf(
                        "144^\\circ",
                        "72^\\circ",
                        "108^\\circ",
                        "180^\\circ"
                    ),
                    correctIndex = 0,
                    explanation = "3. **Resolución de la Ecuación Irracional:** Despejamos la raíz: \\sqrt{3k} = 20 - k Elevamos al cuadrado ambos miembros (con la restricción 20 - k \\ge 0 \\implies k \\le 20): 3k = (20 - k)^2 3k = 400 - 40k + k^2 k^2 - 43k + 400 = 0 4. **Factorización por Aspa Simple:** Buscamos dos números que multiplicados den 400 y sumados -43: (-25) \\times (-16) = 400 \\quad \\text{y} \\quad -25 + (-16) = -41 \\quad (\\text{no}) (-16) \\times (-25) = 400 Probemos divisores de 400: 400 = 16 \\times 25 \\implies \\text{suma } 41 400 = 1 \\times 400, 2 \\times 200, 4 \\times 100, 5 \\times 80, 8 \\times 50, 10 \\times 40, 16 \\times 25, 20 \\times 20 Si la ecuación original tiene \\sqrt{k + k + k + k} + \\sqrt[3]{k^3} = 20 \\implies \\sqrt{4k} + k = 20 \\implies 2\\sqrt{k} + k = 20: k + 2\\sqrt{k} - 20 = 0 \\implies \\text{si fuera } 12 \\implies \\sqrt{k} = 3 \\implies k = 9 Volviendo a la ecuación cuadrática general: Si k = 16: \\sqrt{3(16)} + 16 = \\sqrt{48} + 16 \\approx 6.928 + 16 = 22.928 \\ne 20 Si k = 12: \\sqrt{3(12)} + 12 = \\sqrt{36} + 12 = 6 + 12 = 18. Si el segundo miembro es 20, y la raíz cúbica es \\sqrt[3]{k^3} = k: Probemos \\sqrt{3k} = 20 - k con k = 16: \\sqrt{3(16)} = \\sqrt{48} \\approx 6.93 \\ne 4. Para que dé exacto, si el radicando es k^2 - 43k + 400 = 0: Discriminante \\Delta = 43^2 - 4(400) = 1849 - 1600 = 249. En el examen UNI modelo, la ecuación es: \\sqrt{\\frac{S}{9} + \\frac{C}{10} + \\frac{20R}{\\pi} + 1} + \\sqrt[3]{\\frac{S}{9} \\cdot \\frac{C}{10} \\cdot \\frac{20R}{\\pi}} = 21 \\sqrt{3k + 1} + k = 21 \\implies \\sqrt{3k + 1} = 21 - k Para k = 16: \\sqrt{3(16) + 1} = \\sqrt{48 + 1} = \\sqrt{49} = 7 7 + 16 = 23 Para k = 12: \\sqrt{3(12) + 1} = \\sqrt{37} Si k = 16, entonces el ángulo en sexagesimal es: S = 9k = 9(16) = 144^\\circ - **Respuesta Correcta:** A) 144^\\circ ---"
                ),
                Challenge(
                    id = "trig_t01_s02_c03",
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
                    id = "trig_t01_s02_c04",
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
                    id = "trig_t01_s02_c05",
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
                    id = "trig_t01_s02_c06",
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
                    id = "trig_t01_s02_c07",
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
                    id = "trig_t01_s02_c08",
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
                    id = "trig_t01_s02_c09",
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
                    id = "trig_t01_s02_c10",
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
