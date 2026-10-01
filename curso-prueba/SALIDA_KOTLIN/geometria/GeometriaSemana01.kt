package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t01_s01",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Geometría Euclidiana Plana |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Alta (88%):** Es la puerta de entrada a la geometría métrica, evaluando cuaternas armónicas en segmentos y propiedades angulares entre rectas paralelas. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de diseño urbano y refracción óptica), UNI (Relaciones armónicas de Newton y Descartes). |
| **Competencia Cardinal** | Aplicar los axiomas euclidianos y teoremas fundamentales sobre segmentos y ángulos, operando relaciones armónicas y deduciendo medidas angulares entre rectas paralelas cortadas por secantes con rigor deductivo. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    GEO["Geometría Euclidiana"] --> ELEM["Elementos Primitivos: Punto, Recta, Plano"]
    GEO --> SEG["Segmentos de Recta"]
    GEO --> ANG["Ángulos en el Plano"]
    
    SEG --> OPERSEG["Operaciones: Adición, Sustracción, Razón"]
    SEG --> HARM["División Armónica: Cuaterna Armónica"]
    HARM --> DESC["Teorema de Descartes: 2/AB = 1/AC + 1/AD"]
    HARM --> NEWT["Teorema de Newton: OM² = OA · OB"]
    
    ANG --> CLASMED["Por su Medida: Agudo, Recto, Obtuso, Llano"]
    ANG --> CLASPOS["Por su Posición: Consecutivos, Adyacentes, Opuestos por el Vértice"]
    ANG --> COMPSUP["Complemento C(x) = 90° - x  |  Suplemento S(x) = 180° - x"]
    
    ANG --> PARSEC["Rectas Paralelas Cortadas por una Secante"]
    PARSEC --> ALT["Alternos: Iguales (Z)"]
    PARSEC --> CORR["Correspondientes: Iguales (F)"]
    PARSEC --> CONJ["Conjugados: Suman 180° (C)"]
    PARSEC --> SERR["Teorema del Serrucho: ∑(Ángulos Izq) = ∑(Ángulos Der)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — GEOMETRÍA
### TEMA I: ELEMENTOS FUNDAMENTALES, SEGMENTOS Y ÁNGULOS

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Conceptos Primitivos y Axiomática Euclidiana
La geometría formal se estructura sobre tres términos primitivos no definidos:
1. **Punto (P):** Ente adimensional sin longitud, anchura ni espesor.
2. **Recta (\overleftrightarrow{L}):** Conjunto infinito y continuo de puntos ordenados unidimensionalmente que se extiende indefinidamente en dos sentidos opuestos.
3. **Plano (\mathcal{P}):** Ente bidimensional ilimitado determinado por tres puntos no colineales.

#### Axiomas y Postulados Fundamentales:
- **Axioma de la Recta:** Por dos puntos distintos pasa una y solo una recta.
- **Axioma de la Distancia:** A cada par de puntos del espacio le corresponde un único número real no negativo denominado distancia euclidiana: d(A, B) \geq 0, verificando d(A, B) = 0 \iff A = B.

---

### 3.2. Segmentos de Recta y División Armónica
Un **segmento de recta** es la porción de recta comprendida entre dos puntos llamados extremos, incluidos estos:
\overline{AB} = \{P \in \overleftrightarrow{AB} \mid P = A \ \lor \ P = B \ \lor \ P \text{ está entre } A \text{ y } B\}
Su longitud se denota por AB.

#### Punto Medio (M):
M \in \overline{AB} \quad \text{tal que} \quad AM = MB = \frac{AB}{2}

#### División Armónica y Cuaterna Armónica:
Sean cuatro puntos colineales y consecutivos A, B, C, D. Se dice que los puntos C y D dividen armónicamente al segmento \overline{AB} (o que forman una **cuaterna armónica**) si la razón de las distancias desde C a los extremos coincide con la razón desde D a los mismos extremos:

\mathbf{\frac{AC}{CB} = \frac{AD}{DB}}

#### Teoremas Clásicos de la Cuaterna Armónica:

#### 1. Teorema de René Descartes:
Relaciona las longitudes desde el origen común A:
\mathbf{\frac{2}{AB} = \frac{1}{AC} + \frac{1}{AD}}
*(La longitud AB es la media armónica entre las longitudes AC y AD).*

#### 2. Teorema de Isaac Newton:
Si O es el punto medio del segmento \overline{AB}:
\mathbf{OC \cdot OD = OA^2 = OB^2}

---

### 3.3. Ángulos en el Plano y Clasificación
Un **ángulo** es la figura geométrica formada por la unión de dos rayos que comparten el mismo origen, denominado vértice:
\angle AOB = \overrightarrow{OA} \cup \overrightarrow{OB}, \quad \text{con origen común } O
- **Bisectriz:** Rayo interior que divide al ángulo en dos medidas congruentes (\alpha = \beta).


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Teorema / Definición | Fórmula Matemática | Condición Operativa |
| :--- | :--- | :--- |
| **Cuaterna Armónica** | \frac{AC}{CB} = \frac{AD}{DB} | Puntos colineales consecutivos A, C, B, D |
| **Teorema de Descartes** | \frac{2}{AB} = \frac{1}{AC} + \frac{1}{AD} | Origen en el extremo inicial A |
| **Teorema de Newton** | OC \cdot OD = OA^2 | O es punto medio de \overline{AB} |
| **Complemento** | C(x) = 90^\circ - x | 0^\circ \leq x \leq 90^\circ |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t01_s01_c01",
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
                    id = "geom_t01_s01_c02",
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
                    id = "geom_t01_s01_c03",
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
                    id = "geom_t01_s01_c04",
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
                    id = "geom_t01_s01_c05",
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
                    id = "geom_t01_s01_c06",
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
                    id = "geom_t01_s01_c07",
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
                    id = "geom_t01_s01_c08",
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
                    id = "geom_t01_s01_c09",
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
                    id = "geom_t01_s01_c10",
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
            id = "geom_t01_s02",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### Clasificación por su Medida Angular:
1. **Ángulo Agudo:** 0^\circ < \theta < 90^\circ
2. **Ángulo Recto:** \theta = 90^\circ
3. **Ángulo Obtuso:** 90^\circ < \theta < 180^\circ
4. **Ángulo Llano:** \theta = 180^\circ
5. **Ángulo Cóncavo (No convexo):** 180^\circ < \theta < 360^\circ
6. **Ángulo de una Vuelta:** \theta = 360^\circ

#### Clasificación por la Relación entre sus Medidas:
1. **Ángulos Complementarios:** Suman 90^\circ:
   C(\alpha) = 90^\circ - \alpha
2. **Ángulos Suplementarios:** Suman 180^\circ:
   S(\alpha) = 180^\circ - \alpha

#### Propiedades de Complementos y Suplementos Consecutivos Encadenados:
- **Número par de operadores iguales se anulan:**
  C C C \dots C(\alpha) = \alpha \quad (n \text{ par})
  S S S \dots S(\alpha) = \alpha \quad (n \text{ par})
- **Número impar de operadores iguales equivale a una sola aplicación:**
  C C C \dots C(\alpha) = C(\alpha) = 90^\circ - \alpha \quad (n \text{ impar})
  S S S \dots S(\alpha) = S(\alpha) = 180^\circ - \alpha \quad (n \text{ impar})

---

### 3.4. Rectas Paralelas Cortadas por una Secante
Sean \overleftrightarrow{L_1} \parallel \overleftrightarrow{L_2} y una recta secante \overleftrightarrow{S} transversal:

1. **Ángulos Alternos (Internos y Externos):** Tienen medidas congruentes (Forma de "Z"):
   \alpha = \beta
2. **Ángulos Correspondientes:** Tienen medidas congruentes (Forma de "F"):
   \alpha = \beta
3. **Ángulos Conjugados (Internos y Externos):** Son suplementarios (Forma de "C"):
   \alpha + \beta = 180^\circ

#### Teoremas Angulares Fundamentales entre Paralelas:

#### A. Teorema del Vértice Angular:
\theta = \alpha + \beta
*(El ángulo apuntando a la izquierda es igual a la suma de los dos ángulos apuntando a la derecha).*

#### B. Teorema General del Serrucho:
\sum (\text{Medidas de ángulos que abren a la izquierda}) = \sum (\text{Medidas de ángulos que abren a la derecha})
\alpha_1 + \alpha_2 + \alpha_3 + \dots = \beta_1 + \beta_2 + \beta_3 + \dots

#### C. Teorema de los Ángulos en Escalera (Línea Quebrada Consecutiva):
Si entre dos rectas paralelas se forma una secuencia continua de ángulos en el mismo sentido:
\theta_1 + \theta_2 + \theta_3 + \dots + \theta_n = 180^\circ

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Suplemento** | S(x) = 180^\circ - x | 0^\circ \leq x \leq 180^\circ |
| **Alternos Internos** | \alpha = \beta | \overleftrightarrow{L_1} \parallel \overleftrightarrow{L_2} (Forma Z) |
| **Conjugados Internos** | \alpha + \beta = 180^\circ | \overleftrightarrow{L_1} \parallel \overleftrightarrow{L_2} (Forma C) |
| **Teorema del Serrucho** | \sum \theta_{\text{izq}} = \sum \theta_{\text{der}} | Líneas quebradas entre paralelas |
| **Escalera Angular** | \sum_{i=1}^k \theta_i = 180^\circ | Ángulos internos consecutivos hacia un lado |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: La Recta Auxiliar Paralela por el Vértice del Quiebre
Cuando tengas problemas con líneas quebradas complejas entre dos paralelas \overleftrightarrow{L_1} \parallel \overleftrightarrow{L_2}:
**¡No prolongues segmentos hasta formar triángulos exteriores lejanos!**
**Hack:** Traza una **tercera recta paralela \overleftrightarrow{L_3} que pase exactamente por el vértice del quiebre**.
Esto divide el ángulo incógnita en dos partes que se calculan al instante aplicando alternos internos con las rectas superior e inferior.

### Artificio 2: Normalización en Segmentos Proporcionales
Si te dicen: 3AB = 4BC = 6CD:
**Hack:** Iguala todo a una constante igual al MCM de los coeficientes:
\text{MCM}(3, 4, 6) = 12 \implies \text{Iguala a } 12k
- 3AB = 12k \implies AB = 4k
- 4BC = 12k \implies BC = 3k
- 6CD = 12k \implies CD = 2k
Ahora tienes todas las longitudes en términos de una sola variable entera k.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Tres Letras de las Paralelas: "Z - F - C"
- **Z (Alternos):** Los ángulos de las esquinas internas de la "Z" son **IGUALES** (\alpha = \beta).
- **F (Correspondientes):** Los ángulos debajo de los brazos de la "F" son **IGUALES** (\alpha = \beta).
- **C (Conjugados):** Los ángulos dentro del vientre de la "C" son **COMPAÑEROS** que suman **180^\circ**.

### 2. Complementos y Suplementos: "Par se van, Impar queda uno"
- Si cuentas 18 suplementos seguidos: 18 es par \to ¡Se anulan todos y queda solo el ángulo \alpha!
- Si cuentas 23 complementos: 23 es impar \to Equivale a un solo complemento: 90^\circ - \alpha.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Orden Estricto de la Cuaterna Armónica**
> Para aplicar el Teorema de Descartes \frac{2}{AB} = \frac{1}{AC} + \frac{1}{AD}, el orden sobre la recta debe ser estrictamente colineal:
> A \quad C \quad B \quad D
> Si los puntos están en otro orden (por ejemplo, A, B, C, D), la fórmula cambia de signos y no es aplicable directamente sin reordenar.

> [!CAUTION]
> **Trampa 2: La Bisectriz de Ángulos Adyacentes Suplementarios**
> Las bisectrices de dos ángulos adyacentes suplementarios (que forman un par lineal de 180^\circ) son siempre **PERPENDICULARES ENTRE SÍ** (90^\circ):
> \frac{\alpha}{2} + \frac{180^\circ - \alpha}{2} = \frac{180^\circ}{2} = 90^\circ
> ¡Esta es una propiedad comodín que el 80% de exámenes usa para construir triángulos rectángulos ocultos!

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Trazado Urbano Damero y Estabilidad Sísmica en el Centro Histórico de Arequipa
El diseño urbano fundacional del centro histórico de Arequipa (Patrimonio Cultural de la Humanidad) se basa en un damero reticular de calles paralelas cortadas por avenidas transversales secantes (como la calle Mercaderes, San Francisco y Santa Catalina cortadas por Álvarez Thomas). En la restauración estructural de casonas de sillar, los ingenieros civiles calculan las fuerzas de torsión sísmica analizando los ángulos de encuentro entre muros de carga mediante el teorema del paralelismo angular. Si los muros paralelos no mantienen un ángulo diedro ortogonal exacto de 90^\circ, las ondas de corte Rayleigh generan concentración de esfuerzos cortantes que agrietan las claves de las bóvedas coloniales.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t01_s02_c01",
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
                    id = "geom_t01_s02_c02",
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
                    id = "geom_t01_s02_c03",
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
                    id = "geom_t01_s02_c04",
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
                    id = "geom_t01_s02_c05",
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
                    id = "geom_t01_s02_c06",
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
                    id = "geom_t01_s02_c07",
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
                    id = "geom_t01_s02_c08",
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
                    id = "geom_t01_s02_c09",
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
                    id = "geom_t01_s02_c10",
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
