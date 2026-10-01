package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana02 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t02_s01",
            title = "LONGITUD DE ARCO, SECTOR CIRCULAR Y APLICACIONES DE ROTACIÓN - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "LONGITUD DE ARCO, SECTOR CIRCULAR Y APLICACIONES DE ROTACIÓN - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Trigonometría Plana y Cinemática Circular |
| **Nivel de Complejidad** | Intermedio (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 3.5 a 4.5 horas |
| **Prerrequisitos** | Sistemas de Medición Angular (Radianes), Proporcionalidad y Geometría Básica |

### Competencias Clave del Prospecto
1. **Métrica de Arcos Circulares:** Dominar y aplicar rigurosamente la ecuación fundamental L = \theta \cdot R, asegurando la condición obligatoria de \theta en radianes.
2. **Cálculo de Áreas en Regiones Circulares:** Utilizar con fluidez las tres variantes de área del sector circular (S = \frac{1}{2}\theta R^2 = \frac{LR}{2} = \frac{L^2}{2\theta}) y del trapecio circular.
3. **Modelación de Ruedas y Engranajes:** Calcular el número de vueltas (n) que da una rueda al rodar sin resbalar sobre superficies planas o curvas, así como la transmisión angular por fajas y engranajes.
4. **Partición de Áreas en Progresión:** Resolver problemas de sectores circulares concéntricos aplicando la propiedad de las áreas impares (S, 3S, 5S, 7S).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Longitud de Arco y Sector Circular] --> B[Longitud de Arco L]
    A --> C[Área del Sector Circular]
    A --> D[Trapecio Circular]
    A --> E[Cinemática de Ruedas y Transmisiones]

    B --> B1[Ecuación Fundamental: L = θ · R]
    B --> B2[Condición de Radianes: 0 < θ ≤ 2π]

    C --> C1[Variante 1: S = 1/2 θ R²]
    C --> C2[Variante 2: S = LR / 2]
    C --> C3[Variante 3: S = L² / 2θ]
    C --> C4[Propiedad de Áreas Impares: S, 3S, 5S]

    D --> D1[Área: S = L1 + L2 / 2 · h]
    D --> D2[Ángulo Central: θ = L1 - L2 / h]

    E --> E1[Número de Vueltas: n = d_c / 2πr]
    E --> E2[Ruedas Concéntricas: θA = θB]
    E --> E3[Ruedas en Contacto o Faja: LA = LB -> nA·rA = nB·rB]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Longitud de Arco de Circunferencia
En una circunferencia de radio R, un ángulo central \theta subtiende un arco de longitud L:
L = \theta \cdot R

#### Condiciones Rigurosas:
1. **Unidad Angular Obligatoria:** El ángulo \theta **DEBE ESTAR EXPRESADO OBLIGATORIAMENTE EN RADIANES**. Si el ángulo se suministra en grados sexagesimales o centesimales, debe convertirse previamente al sistema radial:
   \theta_{\text{rad}} = \theta^\circ \cdot \left(\frac{\pi}{180^\circ}\right) = \theta^g \cdot \left(\frac{\pi}{200^g}\right)
2. **Intervalo Válido:**
   0 < \theta \le 2\pi
3. **Consistencia Dimensional:** L y R deben tener las mismas unidades de longitud (\text{m, cm, mm}). El ángulo en radianes es adimensional.

---

### 3.2. Área de la Región de un Sector Circular
El sector circular es la porción de círculo delimitada por dos radios y el arco correspondiente.

#### Las Tres Fórmulas Maestras del Área (S):
Dependiendo de qué pareja de datos se conozca, se utiliza la variante más eficiente:
1. **Conociendo el ángulo central \theta y el radio R:**
   S = \frac{1}{2} \theta R^2
2. **Conociendo la longitud de arco L y el radio R:**
   S = \frac{L \cdot R}{2}
   *(Análogo a la fórmula del área del triángulo: base L por altura R entre dos).*
3. **Conociendo la longitud de arco L y el ángulo central \theta:**
   S = \frac{L^2}{2\theta}

---

### 3.3. Trapecio Circular
Región plana circular delimitada por dos arcos concéntricos de radios R y r (R > r), y dos segmentos colineales de los radios.
- **Espesor o separación radial (h):** h = R - r.
- **Longitudes de arcos:** L_1 = \theta R (arco mayor) y L_2 = \theta r (arco menor).

#### Fórmulas Fundamentales:
1. **Área del Trapecio Circular (A_T):**
   A_T = \left( \frac{L_1 + L_2}{2} \right) h = \frac{1}{2}\theta (R^2 - r^2)
2. **Cálculo del Ángulo Central a partir del Trapecio:**
   \theta = \frac{L_1 - L_2}{h} \quad (\text{en radianes})

---


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Magnitud / Situación | Ecuación Matemática Rigurosa | Restricciones y Unidades |
| :--- | :--- | :--- |
| **Longitud de Arco** | L = \theta \cdot R | \theta en radianes, 0 < \theta \le 2\pi |
| **Área Sector (1)** | S = \dfrac{1}{2} \theta R^2 | Datos: \theta y R |
| **Área Sector (2)** | S = \dfrac{L \cdot R}{2} | Datos: L y R (no requiere \theta) |
| **Área Sector (3)** | S = \dfrac{L^2}{2\theta} | Datos: L y \theta (no requiere R) |
| **Área Trapecio Circular** | A_T = \left(\dfrac{L_1 + L_2}{2}\right) h | h = R - r |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t02_s01_c01",
                    question = "**Enunciado:** Calcule la longitud de arco subtendida por un ángulo central de 45^\\circ en una circunferencia de radio 16\\text{ cm}.",
                    options = listOf(
                        "4\\pi\\text{ cm}",
                        "2\\pi\\text{ cm}",
                        "8\\pi\\text{ cm}",
                        "\\pi\\text{ cm}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t02_s01_c02",
                    question = "**Enunciado:** En un sector circular, el perímetro es de 28\\text{ cm} y su radio mide 8\\text{ cm}. Calcule el área de dicho sector circular.",
                    options = listOf(
                        "48\\text{ cm}^2",
                        "96\\text{ cm}^2",
                        "36\\text{ cm}^2",
                        "24\\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t02_s01_c03",
                    question = "**Enunciado:** En un trapecio circular, las longitudes de los arcos concéntricos son 8\\text{ cm} y 14\\text{ cm}. Si la separación radial entre dichos arcos es de 3\\text{ cm}, determine el ángulo central en radianes y el área del trapecio circular.",
                    options = listOf(
                        "2\\text{ rad} y 33\\text{ cm}^2",
                        "1\\text{ rad} y 22\\text{ cm}^2",
                        "2\\text{ rad} y 66\\text{ cm}^2",
                        "1.5\\text{ rad} y 44\\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t02_s01_c04",
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
                    id = "trig_t02_s01_c05",
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
                    id = "trig_t02_s01_c06",
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
                    id = "trig_t02_s01_c07",
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
                    id = "trig_t02_s01_c08",
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
                    id = "trig_t02_s01_c09",
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
                    id = "trig_t02_s01_c10",
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
            id = "trig_t02_s02",
            title = "LONGITUD DE ARCO, SECTOR CIRCULAR Y APLICACIONES DE ROTACIÓN - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "LONGITUD DE ARCO, SECTOR CIRCULAR Y APLICACIONES DE ROTACIÓN - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.4. Propiedad de las Áreas Impares en Sectores Concéntricos
Si se tienen sectores circulares concéntricos cuyos radios están en progresión aritmética de razón constante r (r, 2r, 3r, 4r, \dots):
- El primer sector tiene área: S_1 = S = \frac{1}{2}\theta r^2.
- El segundo trapecio circular tiene área: S_2 = \frac{1}{2}\theta (2r)^2 - S_1 = 4S - S = 3S.
- El tercer trapecio circular tiene área: S_3 = \frac{1}{2}\theta (3r)^2 - 4S = 9S - 4S = 5S.
- **Secuencia de Áreas:**
  S, \; 3S, \; 5S, \; 7S, \; 9S, \; \dots, \; (2n - 1)S
- **Secuencia de Longitudes de Arco:**
  L, \; 2L, \; 3L, \; 4L, \; \dots, \; nL

---

### 3.5. Cinemática de Ruedas que Ruedan sin Resbalar

#### 1. Número de Vueltas (n) sobre una Pista Rectilínea Plana:
Cuando una rueda circular de radio r rueda sin resbalar a lo largo de una superficie horizontal una distancia d_c recorrida por su centro:
d_c = \theta_{\text{rotación}} \cdot r = n \cdot (2\pi r)
Despejando el número de vueltas n:
n = \frac{d_c}{2\pi r} = \frac{\theta_{\text{rotación}}}{2\pi}
Donde:
- d_c: Distancia recorrida por el centro de la rueda.
- 2\pi r: Perímetro de la rueda (longitud de una vuelta completa).
- \theta_{\text{rotación}}: Ángulo total girado por la rueda (en radianes).

#### 2. Número de Vueltas sobre Superficies Curvas:
- **Pista Circular Convexa (Por el exterior de un círculo de radio R):**
  El centro de la rueda describe una trayectoria circular de radio R + r:
  n = \frac{\theta_{\text{pista}} (R + r)}{2\pi r}
- **Pista Circular Cóncava (Por el interior de una pista hueca de radio R):**
  El centro describe una trayectoria de radio R - r:
  n = \frac{\theta_{\text{pista}} (R - r)}{2\pi r}

#### 3. Sistemas de Transmisión Circular:
- **Ruedas Dentadas (Engranajes) o Conectadas por Faja / Cadena:**
  Ambas ruedas recorren la misma longitud lineal en su periferia (L_A = L_B):
  \theta_A \cdot r_A = \theta_B \cdot r_B \iff n_A \cdot r_A = n_B \cdot r_B
  *(A menor radio, mayor número de vueltas).*
- **Ruedas Concéntricas Unidas por un Mismo Eje:**
  Giran solidariamente con el mismo ángulo de rotación:
  \theta_A = \theta_B \iff n_A = n_B

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Ángulo Central Trapecio**| \theta = \dfrac{L_1 - L_2}{h} | \theta en radianes |
| **Número de Vueltas (Plano)**| n = \dfrac{d_c}{2\pi r} | d_c: distancia del centro |
| **Vueltas en Pista Convexa** | n = \dfrac{\alpha (R + r)}{2\pi r} | \alpha: ángulo barrido por la pista |
| **Vueltas en Pista Cóncava** | n = \dfrac{\alpha (R - r)}{2\pi r} | \alpha: ángulo en radianes |
| **Transmisión por Contacto**| n_A r_A = n_B r_B | Engranajes o faja externa |
| **Transmisión por Eje Común**| n_A = n_B | Ruedas coaxiales solidarias |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Evitar el Cálculo de \theta cuando conoces L y R
Si un problema te da: "Un sector circular tiene radio 8\text{ cm} y longitud de arco 6\text{ cm}, halle su área":
- **Camino lento del novato:** Despejar \theta = \frac{6}{8} = \frac{3}{4}\text{ rad}, luego calcular S = \frac{1}{2}(\frac{3}{4})(8)^2 = \frac{1}{2} \cdot \frac{3}{4} \cdot 64 = 24.
- **Hack Preuniversitario:** Aplica directamente S = \frac{L \cdot R}{2} = \frac{6 \cdot 8}{2} = 24\text{ cm}^2. ¡Toma exactamente 2 segundos!

### Hack 2: Cálculo Directo de la Relación de Vueltas
En problemas de engranajes donde la rueda A tiene radio r_A y la rueda B tiene radio r_B:
\frac{n_A}{n_B} = \frac{r_B}{r_A}
- El número de vueltas es **inversamente proporcional** a los radios o número de dientes:
  \text{Vueltas} \propto \frac{1}{\text{Radio}} \propto \frac{1}{\text{Dientes}}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Longitud de Arco: "LOR (El Loro)"
- **L = \theta · R**
  - **L** = **\theta** (O) · **R** \to **L-O-R**
  - ¡El "Loro" nunca vuela sin su pico en radianes!

### 2. Mnemotecnia del Área: "L-R sobre 2 (Como un Triángulo)"
- Piensa en el sector circular como si desenrollaras el arco L como base y el radio R como altura:
  \text{Área} = \frac{\text{Base} \times \text{Altura}}{2} = \frac{L \cdot R}{2}

### 3. Mnemotecnia de Áreas Concéntricas: "LOS NÚMEROS IMPARES DE GALILEO"
- Si los radios avanzan de 1 en 1 (r, 2r, 3r, \dots):
  - Las áreas crecen en la secuencia de impares: **1, 3, 5, 7, 9...**
  - ¡Te ahorras restar áreas de círculos en el examen!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Ángulo en Grados Sexagesimales**
> Si el examen dice: "\theta = 30^\circ y R = 12\text{ cm}":
> - **ERROR GRAVÍSIMO:** L = 30 \times 12 = 360\text{ cm} (¡Aparece siempre como distractor A en las alternativas!).
> - **CORRECTO:** Primero convertir a radianes: 30^\circ = \frac{\pi}{6}\text{ rad}.
>   L = \left(\frac{\pi}{6}\right) \times 12 = 2\pi\text{ cm}

> [!CAUTION]
> **Trampa 2: La Distancia del Centro en el Conteo de Vueltas**
> Al calcular el número de vueltas de una moneda o rueda que gira sobre otra:
> - En una pista circular de radio R, la distancia recorrida por el centro de la moneda **NO es 2\pi R**.
> - Es la longitud recorrida por el CENTRO de la moneda, que describe un círculo de radio **R + r**:
>   d_c = 2\pi(R + r)
>   ¡Olvidar sumar el radio de la rueda duplica los errores en los exámenes de la UNI!

> [!WARNING]
> **Trampa 3: Unidades Heterogéneas en L y R**
> Si L = 20\text{ cm} y R = 0.5\text{ m}:
> Homogeniza las unidades antes de operar: R = 50\text{ cm} \implies \theta = \frac{20}{50} = 0.4\text{ rad}. Nunca dividas 20 / 0.5.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Diseño de Curvas Viales y Peraltes:** Los ingenieros de carreteras diseñan las curvas de autopistas y enlaces viales calculando la longitud de arco para definir la velocidad de diseño y la transición segura del peralte sin derrape centrífugo.
2. **Cuentakilómetros y Odómetros Vehiculares:** Los sensores ABS en los cubos de rueda registran el número de revoluciones n de la rueda del automóvil y calculan la distancia recorrida en la computadora a bordo mediante d = n(2\pi r_{\text{neumático}}).
3. **Mecanismos de Relojería y Transmisiones Mecánicas:** El tren de engranajes de un reloj o una bicicleta ajusta el par torsor y la velocidad angular basándose en la conservación de la longitud periférica entre ruedas dentadas concatenadas.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t02_s02_c01",
                    question = "**Enunciado:** Una bicicleta de montaña tiene una rueda delantera de radio r_1 = 35\\text{ cm} y una rueda trasera de radio r_2 = 28\\text{ cm}. Durante un recorrido de entrenamiento en línea recta, la rueda trasera dio 150 vueltas más que la rueda delantera. Calcule la distancia total en metros que recorrió la bicicleta sin resbalar. (\\text{Considere } \\pi \\approx \\frac{22}{7}).",
                    options = listOf(
                        "1320\\text{ m}",
                        "660\\text{ m}",
                        "880\\text{ m}",
                        "924\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t02_s02_c02",
                    question = "**Enunciado:** Una moneda de radio r = 2\\text{ cm} rueda sin resbalar sobre el contorno exterior de una placa fija que tiene la forma de un sector circular de radio R = 8\\text{ cm} y ángulo central de 60^\\circ, partiendo desde el vértice O, recorriendo un radio lateral, el arco de circunferencia y el otro radio lateral hasta retornar al vértice O. Determine el número total de vueltas que da la moneda sobre su propio centro en todo el trayecto.",
                    options = listOf(
                        "3 + \\dfrac{1}{6} \\text{ vueltas}",
                        "2 + \\dfrac{5}{6} \\text{ vueltas}",
                        "3 + \\dfrac{2}{3} \\text{ vueltas}",
                        "4 \\text{ vueltas}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t02_s02_c03",
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
                    id = "trig_t02_s02_c04",
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
                    id = "trig_t02_s02_c05",
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
                    id = "trig_t02_s02_c06",
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
                    id = "trig_t02_s02_c07",
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
                    id = "trig_t02_s02_c08",
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
                    id = "trig_t02_s02_c09",
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
                    id = "trig_t02_s02_c10",
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
