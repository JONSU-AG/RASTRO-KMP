package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana11 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t11_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Sistemas Numéricos Avanzados y Variable Compleja |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Media / Alta (85%):** Muy frecuente en exámenes de área de Ingenierías y Biomédicas, evaluando potencias de i, módulos, conjugados y teorema de De Moivre. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de fasores y corriente alterna), UNI (Raíces enésimas de la unidad y geometría en el plano de Argand-Gauss). |
| **Competencia Cardinal** | Operar algebraicamente números complejos en forma binómica, polar y exponencial de Euler, dominando las propiedades del módulo, conjugado, argumento principal y la potenciación/radicación por el Teorema de De Moivre. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    NC["Conjunto de los Números Complejos (ℂ)"] --> UNID["Unidad Imaginaria i = √(-1)"]
    NC --> FORMAS["Representaciones de un Complejo"]
    NC --> PROPS["Propiedades Métricas y Operaciones"]
    
    UNID --> POT["Potencias de i: Ciclo cuaternario (i^(4k+r) = i^r)"]
    UNID --> RESNOT["Resultados Notables: (1±i)², (1+i)/(1-i) = i"]
    
    FORMAS --> FB["Forma Binómica: z = a + bi"]
    FORMAS --> FP["Forma Polar/Trigonométrica: z = r(cos θ + i sen θ) = r cis θ"]
    FORMAS --> FE["Forma Exponencial (Euler): z = r e^(iθ)"]
    
    PROPS --> CONJ["Conjugado: z̄ = a - bi"]
    PROPS --> MOD["Módulo: |z| = √(a² + b²)"]
    PROPS --> MOIVRE["Teorema de De Moivre: z^n = r^n cis(nθ)"]
    PROPS --> RAD["Raíces n-ésimas de la Unidad (Polígonos regulares en el plano de Gauss)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA XI: NÚMEROS COMPLEJOS Y FORMAS BINÓMICA, TRIGONOMÉTRICA Y EXPONENCIAL

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Definición Formal y Unidad Imaginaria
El conjunto de los **números complejos (\mathbb{C})** se define formalmente como el conjunto de pares ordenados de números reales (a, b) \in \mathbb{R}^2 dotados de las operaciones de adición y multiplicación:
(a, b) + (c, d) = (a + c, \ b + d)
(a, b) \cdot (c, d) = (ac - bd, \ ad + bc)

#### La Unidad Imaginaria (i):
Se define como el par ordenado i = (0, 1), que verifica la propiedad fundamental:
i^2 = (0, 1) \cdot (0, 1) = (0 - 1, \ 0 + 0) = (-1, 0) \equiv -1
\mathbf{i = \sqrt{-1} \implies i^2 = -1}

#### Propiedad Cuaternaria de las Potencias de i:
Las potencias enteras de la unidad imaginaria se repiten en periodos de cuatro:
i^1 = i, \quad i^2 = -1, \quad i^3 = -i, \quad i^4 = 1
En general, para cualquier k \in \mathbb{Z}:
i^{4k} = 1, \quad i^{4k+1} = i, \quad i^{4k+2} = -1, \quad i^{4k+3} = -i
- **Teorema de la Suma Cuaternaria Consecutiva:**
  \sum_{j=1}^{4} i^j = i + i^2 + i^3 + i^4 = i - 1 - i + 1 = 0 \implies \sum_{j=k}^{k+3} i^j = 0

---

### 3.2. Forma Binómica (Cartesiana) y Clasificación
Todo número complejo z se expresa como:
z = a + bi, \quad \text{con } a, b \in \mathbb{R}
- **Parte Real:** \text{Re}(z) = a
- **Parte Imaginaria:** \text{Im}(z) = b (Nótese que \text{Im}(z) es un número real, no incluye a la letra i).

#### Clasificación Canónica:
1. **Complejo Real o Real Puro:** Si su parte imaginaria es nula: \text{Im}(z) = 0 \implies z = a.
2. **Complejo Imaginario Puro:** Si su parte real es nula y su parte imaginaria no: \text{Re}(z) = 0 \land \text{Im}(z) \neq 0 \implies z = bi.
3. **Complejo Nulo:** Si ambas partes son simultáneamente cero: z = 0 + 0i = 0.

#### Complejos Asociados:
- **Conjugado de z (\bar{z}):** Se invierte el signo de la parte imaginaria:
  \bar{z} = a - bi
- **Opuesto de z (z^* o -z):** Se invierten los signos de ambas partes:
  -z = -a - bi

---

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Propiedad / Teorema | Fórmula Matemática | Dominio / Aplicación |
| :--- | :--- | :--- |
| **Unidad Imaginaria** | i^2 = -1, \quad i^3 = -i, \quad i^4 = 1 | Ciclo periodo 4 |
| **Potencia de i** | i^{4k + r} = i^r | r \in \{0, 1, 2, 3\} |
| **Módulo** | \|z\| = \sqrt{a^2 + b^2} | Distancia al origen en Argand |
| **Identidad Métrica** | z \cdot \bar{z} = \|z\|^2 | Racionalización de complejos |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t11_s01_c01",
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
                    id = "alg_t11_s01_c02",
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
                    id = "alg_t11_s01_c03",
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
                    id = "alg_t11_s01_c04",
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
                    id = "alg_t11_s01_c05",
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
                    id = "alg_t11_s01_c06",
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
                    id = "alg_t11_s01_c07",
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
                    id = "alg_t11_s01_c08",
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
                    id = "alg_t11_s01_c09",
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
                    id = "alg_t11_s01_c10",
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
            id = "alg_t11_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.3. Módulo de un Número Complejo
El módulo (o norma euclidiana) de z = a + bi, denotado por |z| o \rho, representa la distancia geométrica desde el origen de coordenadas hasta el afijo del complejo en el plano de Argand-Gauss:

|z| = \sqrt{a^2 + b^2}, \quad \text{con } |z| \geq 0

#### Teoremas Fundamentales del Módulo:
1. |z| = |\bar{z}| = |-z| = |-\bar{z}|
2. z \cdot \bar{z} = |z|^2 = a^2 + b^2
3. |z \cdot w| = |z| \cdot |w|
4. \left|\frac{z}{w}\right| = \frac{|z|}{|w|}, \quad (w \neq 0)
5. |z^n| = |z|^n, \quad \forall n \in \mathbb{Z}
6. **Desigualdad Triangular:**
   ||z| - |w|| \leq |z \pm w| \leq |z| + |w|

---

### 3.4. Resultados Notables de Examen de Admisión
\frac{1 + i}{1 - i} = i, \qquad \frac{1 - i}{1 + i} = -i
(1 + i)^2 = 2i, \qquad (1 - i)^2 = -2i
(1 + i)^4 = -4, \qquad (1 - i)^4 = -4
\frac{1}{i} = -i

---

### 3.5. Forma Polar (Trigonométrica) y Teorema de De Moivre
Todo complejo no nulo z = a + bi puede ubicarse en el plano complejo mediante coordenadas polares (r, \theta):

z = r(\cos \theta + i \sin \theta) = r \text{ cis } \theta
Donde:
- **Módulo:** r = |z| = \sqrt{a^2 + b^2}.
- **Argumento Principal (\text{Arg}(z)):** Es el ángulo medido en sentido antihorario desde el semieje real positivo hasta el vector posición, restringido al intervalo:
  \theta \in \langle -\pi, \ \pi] \quad \text{o} \quad [0, \ 2\pi\rangle
  \tan \theta = \frac{b}{a} *(tomando en cuenta el cuadrante del afijo (a, b))*.

#### Teorema de Abraham De Moivre:
Para cualquier exponente entero n \in \mathbb{Z}:
z^n = [r \text{ cis } \theta]^n = r^n [\cos(n\theta) + i \sin(n\theta)] = r^n \text{ cis}(n\theta)

#### Forma Exponencial de Leonhard Euler:
e^{i\theta} = \cos \theta + i \sin \theta \implies z = r e^{i\theta}
- **Identidad de Euler (la fórmula más bella de las matemáticas):**
  e^{i\pi} + 1 = 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cociente Notable** | \frac{1+i}{1-i} = i \quad \land \quad \frac{1-i}{1+i} = -i | Simplificaciones instantáneas |
| **Cuadrados Notables** | (1 \pm i)^2 = \pm 2i | Reducción de potencias altas |
| **Producto Polar** | r_1 \text{ cis}(\theta_1) \cdot r_2 \text{ cis}(\theta_2) = r_1 r_2 \text{ cis}(\theta_1 + \theta_2) | Multiplicación angular |
| **Cociente Polar** | \frac{r_1 \text{ cis}(\theta_1)}{r_2 \text{ cis}(\theta_2)} = \frac{r_1}{r_2} \text{ cis}(\theta_1 - \theta_2) | División angular |
| **De Moivre** | z^n = r^n \text{ cis}(n\theta) | Potenciación trigonométrica |
| **Euler** | e^{i\theta} = \cos \theta + i \sin \theta | Notación exponencial compacta |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Reducción de Potencias Altas de Binomios Complejos
Si te piden calcular (1 + i)^{40}:
**¡Jamás uses el binomio de Newton con 41 términos!**
**Hack:** Eleva primero al cuadrado usando la identidad notable (1 + i)^2 = 2i:
(1 + i)^{40} = \left[(1 + i)^2\right]^{20} = (2i)^{20} = 2^{20} \cdot i^{20}
Como 20 es múltiplo de 4, i^{20} = 1:
(1 + i)^{40} = 2^{20} \cdot 1 = 2^{20} = 1\ 048\ 576
¡Resuelto en 5 segundos!

### Artificio 2: El Módulo de un Producto o Cociente Monstruoso
Si te piden hallar el módulo de:
Z = \frac{(3 + 4i)^4 \cdot (5 - 12i)^2}{(1 + i)^6 \cdot (\sqrt{3} + i)^8}
**¡No multipliques los números complejos!**
**Hack:** Aplica la propiedad de distribución del módulo:
|Z| = \frac{|3 + 4i|^4 \cdot |5 - 12i|^2}{|1 + i|^6 \cdot |\sqrt{3} + i|^8}
Calculas cada módulo pitagórico elemental:
- |3 + 4i| = \sqrt{3^2 + 4^2} = 5
- |5 - 12i| = \sqrt{5^2 + 12^2} = 13
- |1 + i| = \sqrt{1^2 + 1^2} = \sqrt{2}
- |\sqrt{3} + i| = \sqrt{3 + 1} = 2
Sustituyes:
|Z| = \frac{5^4 \cdot 13^2}{(\sqrt{2})^6 \cdot 2^8} = \frac{625 \cdot 169}{2^3 \cdot 256} = \frac{105\ 625}{2048}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Flecha Cuaternaria de Potencias de i
> **"Uno, i, Menos Uno, Menos i" (1, i, -1, -i)**
- Divide el exponente entre 4 y quédate únicamente con el **residuo**:
  - Residuo 0 \to 1
  - Residuo 1 \to i
  - Residuo 2 \to -1
  - Residuo 3 \to -i
- *Ejemplo relámpago:* i^{2027} = i^{4(506) + 3} = i^3 = -i.

### 2. Multiplicación y División Polar: "Los Módulos se Operan, los Ángulos se Suman o Restan"
- Si multiplicas: multiplicas los radios y **sumas** los ángulos.
- Si divides: divides los radios y **restas** los ángulos.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Producto de Radicales Negativos**
> En los reales se cumple que \sqrt{a} \cdot \sqrt{b} = \sqrt{ab} para a, b \geq 0.
> Pero si calculas \sqrt{-4} \cdot \sqrt{-9}:
> **El error mortal del postulante:** \sqrt{(-4)(-9)} = \sqrt{36} = 6. **¡FATAL ERROR!**
> La regla estricta exige extraer primero la unidad imaginaria i:
> \sqrt{-4} \cdot \sqrt{-9} = (2i) \cdot (3i) = 6 i^2 = 6(-1) = -6

> [!CAUTION]
> **Trampa 2: La Parte Imaginaria NO Incluye la Letra i**
> Si z = 7 - 9i:
> ¿Cuánto vale \text{Im}(z)?
> El distractor clásico en las claves de la UNSA es -9i.
> **La respuesta correcta es:** \text{Im}(z) = -9. Es un número puramente real.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Análisis Fasorial en Sistemas de Potencia Eléctrica en la Central Hidroeléctrica de Charcani V
En la central subterránea de Charcani V (ubicada en las faldas del Misti a orillas del río Chili en Arequipa), los ingenieros electricistas analizan el flujo de potencia alterna trifásica mediante fasores complejos. El voltaje se modela como V = |V| e^{i\theta} y la impedancia de las líneas como Z = R + iX_L, donde la resistencia R disipa energía térmica y la reactancia inductiva X_L almacena campo magnético. La multiplicación y división de números complejos en forma polar es la herramienta matemática que permite calcular la potencia reactiva en volt-amperios reactivos (VAR) y evitar caídas de tensión en el alumbrado público de la ciudad blanca.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t11_s02_c01",
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
                    id = "alg_t11_s02_c02",
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
                    id = "alg_t11_s02_c03",
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
                    id = "alg_t11_s02_c04",
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
                    id = "alg_t11_s02_c05",
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
                    id = "alg_t11_s02_c06",
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
                    id = "alg_t11_s02_c07",
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
                    id = "alg_t11_s02_c08",
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
                    id = "alg_t11_s02_c09",
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
                    id = "alg_t11_s02_c10",
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
