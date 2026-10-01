package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t06_s01",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Geometría Plana de Polígonos y Cuadriláteros |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Alta (90%):** Se evalúan fórmulas de diagonales y ángulos de polígonos regulares, junto con medianas de trapecios y propiedades de rombos. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de pavimentación con teselados y estructuras de puentes trapeciales), UNI (Diagonales desde k vértices y Teorema de Varignon). |
| **Competencia Cardinal** | Deducir y aplicar las fórmulas generales de polígonos de n lados (suma de ángulos y diagonales), clasificar cuadriláteros convexos, y calcular medianas trapeciales y segmentos entre diagonales. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    POLCUAD["Polígonos y Cuadriláteros"] --> POL["Polígonos Convexos y Regulares"]
    POLCUAD --> CUAD["Cuadriláteros"]
    
    POL --> FGEN["Fórmulas Generales: Sᵢ = 180°(n - 2)  |  N_D = n(n - 3)/2"]
    POL --> REG["Polígonos Regulares: αᵢ = 180°(n-2)/n  |  αₑ = α_c = 360°/n"]
    
    CUAD --> TRAPD["Trapezoides: Asimétrico y Simétrico (Deltoide)"]
    CUAD --> TRAP["Trapecios: Escaleno, Rectángulo, Isósceles"]
    CUAD --> PARAL["Paralelogramos: Romboide, Rombo, Rectángulo, Cuadrado"]
    
    TRAP --> MEDT["Mediana (Base Media): M = (B + b)/2"]
    TRAP --> SEGD["Segmento entre Diagonales: PQ = (B - b)/2"]
    
    PARAL --> VARIG["Teorema de Varignon: Puntos medios forman un Paralelogramo"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — GEOMETRÍA
### TEMA VI: POLÍGONOS GENERALES, REGULARES Y CUADRILÁTEROS

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Teoría General de Polígonos
Un **polígono** es una figura geométrica plana cerrada formada por una secuencia finita de segmentos de recta consecutivos coplanares que se intersecan únicamente en sus extremos:
\mathcal{P} = \overline{A_1 A_2} \cup \overline{A_2 A_3} \cup \dots \cup \overline{A_n A_1}

#### Clasificación por sus Características:
1. **Polígono Convexo:** Todo segmento que une dos puntos interiores queda completamente contenido en el polígono. Cualquier recta secante lo corta en a lo más dos puntos.
2. **Polígono Cóncavo (No Convexo):** Al menos un ángulo interior es mayor a 180^\circ.
3. **Polígono Equilátero:** Todos sus lados tienen longitudes iguales.
4. **Polígono Equiángulo:** Todos sus ángulos interiores tienen igual medida.
5. **Polígono Regular:** Es **equilátero y equiángulo simultáneamente**. Posee un centro geométrico común para la circunferencia inscrita y circunscrita.

#### Nomenclatura Oficial según el Número de Lados (n):
- n = 3: Triángulo
- n = 4: Cuadrilátero
- n = 5: Pentágono
- n = 6: Hexágono
- n = 7: Heptágono
- n = 8: Octógono u Octágono
- n = 9: Nonágono o Eneágono
- n = 10: Decágono
- n = 11: Endecágono o Undecágono
- n = 12: Dodecágono
- n = 15: Pentadecágono
- n = 20: Icoságono

---

### 3.2. Fórmulas Fundamentales en Polígonos de n Lados

Para **todo polígono convexo** de n lados:
1. **Suma de las medidas de los ángulos interiores (S_i):**
   \mathbf{S_i = 180^\circ(n - 2)}
2. **Suma de las medidas de los ángulos exteriores (S_e):**
   \mathbf{S_e = 360^\circ}
3. **Número de diagonales trazadas desde un solo vértice (d_1):**
   \mathbf{d_1 = n - 3}
4. **Número total de diagonales (N_D):**
   \mathbf{N_D = \frac{n(n - 3)}{2}}
5. **Número de diagonales trazadas desde k vértices consecutivos (D_k):**
   \mathbf{D_k = n k - \frac{(k + 1)(k + 2)}{2}}

Para **polígonos regulares o equiángulos**:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Propiedad / Teorema | Fórmula Matemática | Alcance / Restricción |
| :--- | :--- | :--- |
| **Suma Ángulos Interiores** | S_i = 180^\circ(n - 2) | Todo polígono convexo |
| **Número de Diagonales** | N_D = \frac{n(n - 3)}{2} | Total de diagonales |
| **Ángulo Interior Regular** | \alpha_i = \frac{180^\circ(n - 2)}{n} | Polígonos regulares/equiángulos |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t06_s01_c01",
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
                    id = "geom_t06_s01_c02",
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
                    id = "geom_t06_s01_c03",
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
                    id = "geom_t06_s01_c04",
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
                    id = "geom_t06_s01_c05",
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
                    id = "geom_t06_s01_c06",
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
                    id = "geom_t06_s01_c07",
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
                    id = "geom_t06_s01_c08",
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
                    id = "geom_t06_s01_c09",
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
                    id = "geom_t06_s01_c10",
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
            id = "geom_t06_s02",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
6. **Medida de un ángulo interior (\alpha_i):**
   \mathbf{\alpha_i = \frac{180^\circ(n - 2)}{n}}
7. **Medida de un ángulo exterior (\alpha_e):**
   \mathbf{\alpha_e = \frac{360^\circ}{n}}
8. **Medida del ángulo central (\alpha_c - exclusivo de regulares):**
   \mathbf{\alpha_c = \frac{360^\circ}{n} = \alpha_e}

---

### 3.3. Cuadriláteros y Clasificación Rigurosa
Un **cuadrilátero** es un polígono de cuatro lados (n = 4). La suma de sus ángulos interiores es 180^\circ(4 - 2) = 360^\circ, y la suma de sus ángulos exteriores es 360^\circ.

#### A. Trapezoide (Sin lados paralelos):
1. **Trapezoide Asimétrico:** No presenta ningún tipo de simetría ni paralelismo.
2. **Trapezoide Simétrico (Deltoide o Cometa):** Formado por dos triángulos isósceles unidos por su base común. Sus diagonales son perpendiculares y la diagonal principal actúa como mediatriz de la otra y bisectriz de los ángulos correspondientes.

#### B. Trapecio (Exactamente dos lados opuestos paralelos):
Los lados paralelos son las **bases** (base menor b y base mayor B). Los otros dos lados son no paralelos.
- **Tipos de Trapecios:**
  - **Trapecio Escaleno:** Lados no paralelos de diferente longitud.
  - **Trapecio Rectángulo:** Un lado no paralelo es perpendicular a las bases (determina dos ángulos rectos y su longitud es la altura h).
  - **Trapecio Isósceles:** Lados no paralelos de igual longitud. Sus ángulos en la base son congruentes y **sus diagonales son exactamente de igual longitud**.
- **Teorema de la Mediana del Trapecio (Base Media M):**
  Une los puntos medios de los lados no paralelos. Es paralela a las bases y mide su semisuma:
  \mathbf{M = \frac{B + b}{2}}
- **Teorema del Segmento entre los Puntos Medios de las Diagonales (PQ):**
  Es paralelo a las bases y su longitud es igual a la semidiferencia de las bases:
  \mathbf{PQ = \frac{B - b}{2}}

#### C. Paralelogramo (Lados opuestos paralelos dos a dos):
- **Propiedades Universales:**
  1. Lados opuestos de igual longitud (AB = CD \land BC = AD).
  2. Ángulos opuestos de igual medida (\angle A = \angle C \land \angle B = \angle D).
  3. Ángulos consecutivos suplementarios (\alpha + \beta = 180^\circ).
  4. **Las diagonales se bisecan mutuamente en su punto medio común.**
- **Tipos de Paralelogramos:**
  1. **Romboide:** Paralelogramo general de lados y ángulos oblicuos.
  2. **Rombo (Losange):** Sus 4 lados son congruentes. Sus diagonales son **perpendiculares y bisectrices** de sus ángulos interiores.
  3. **Rectángulo (Cuadrilongo):** Sus 4 ángulos son rectos (90^\circ). Sus **diagonales son de igual longitud** y se cortan en su punto medio.
  4. **Cuadrado:** Paralelogramo regular que combina las propiedades del rombo y del rectángulo: 4 lados iguales, 4 ángulos rectos, diagonales iguales, perpendiculares y bisectrices a 45^\circ.

#### Teorema de Pierre Varignon:
En cualquier cuadrilátero convexo o no convexo, los puntos medios de sus cuatro lados determinan siempre los vértices de un **paralelogramo**.
- El perímetro de dicho paralelogramo es igual a la suma de las diagonales del cuadrilátero original:
  2p_{\text{Varignon}} = d_1 + d_2
- El área del paralelogramo de Varignon es exactamente la **mitad del área total del cuadrilátero**.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Ángulo Exterior Regular** | \alpha_e = \frac{360^\circ}{n} | Coincide con ángulo central |
| **Mediana de Trapecio** | M = \frac{B + b}{2} | Paralela a las bases |
| **Puntos Medios Diagonales** | PQ = \frac{B - b}{2} | Segmento entre diagonales |
| **Varignon** | \text{Área}(MNPQ) = \frac{\text{Área}(ABCD)}{2} | Puntos medios cuadrilátero |
| **Pitot** | AB + CD = BC + AD | Cuadrilátero circunscrito |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Trazo Paralelo en Trapecios Escalenos
En cualquier trapecio ABCD donde conozcas los ángulos de la base o los lados no paralelos:
**¡No bajes dos alturas generando tres figuras!**
**Hack:** Por el vértice de la base menor B, **traza una paralela al lado no paralelo opuesto \overline{CD}**.
Esto descompone el trapecio instantáneamente en:
- Un **paralelogramo** a la derecha (lados CD y base b).
- Un **triángulo** a la izquierda cuya base mide directamente B - b, donde puedes aplicar Pitágoras o ángulos notables al instante.

### Artificio 2: Polígono Regular a partir del Ángulo Exterior
Si el problema dice: *"El ángulo interior de un polígono regular mide 150^\circ"*:
**¡Jamás uses la fórmula con fracciones 150 = \frac{180(n - 2)}{n}!** Eso toma 4 pasos algebraicos.
**Hack:** Pasa de inmediato al ángulo exterior por suplemento:
\alpha_e = 180^\circ - 150^\circ = 30^\circ
Ahora divide 360^\circ entre el ángulo exterior:
n = \frac{360^\circ}{\alpha_e} = \frac{360^\circ}{30^\circ} = 12 \text{ lados (Dodecágono)}
¡Calculado mentalmente en 3 segundos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mediana vs. Segmento entre Diagonales del Trapecio: "Suma la grande, Resta la chica"
- **Mediana (Larga, abarca todo el cuerpo):** Semisuma: \frac{\text{Base Mayor } \mathbf{+} \text{ Base Menor}}{2}.
- **Segmento entre diagonales (Corto, solo el pedacito central):** Semidiferencia: \frac{\text{Base Mayor } \mathbf{-} \text{ Base Menor}}{2}.

### 2. Diagonales del Rombo: "La Cruz Perfecta"
El rombo es como una cometa perfecta:
- Sus diagonales forman una cruz ortogonal de 90^\circ.
- Cortan a los ángulos exactamente por la mitad (bisectrices).
- Se parten en cuatro triángulos rectángulos congruentes.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Nombre del Polígono de 9 y 11 Lados**
> - n = 9: Se llama **Nonágono** o **Eneágono** (no confundir con endecágono).
> - n = 11: Se llama **Endecágono** o **Undecágono**.
> Muchos postulantes marcan "Endecágono" creyendo que es 9 por sonar a "nueve".

> [!CAUTION]
> **Trampa 2: Las Diagonales del Rectángulo NO son Perpendiculares**
> El rectángulo tiene diagonales iguales, pero **NO son perpendiculares** (salvo que sea un cuadrado).
> El rombo tiene diagonales perpendiculares, pero **NO son de igual longitud** (salvo que sea un cuadrado).
> ¡El único que tiene diagonales iguales y perpendiculares a la vez es el **CUADRADO**!

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Estructura de Gaviones y Defensas Ribereñas en la Torrentera de San Lázaro
En las obras de ingeniería hidráulica para el control de huaycos en las torrenteras de San Lázaro y Los Incas en Arequipa, los diques de contención se construyen con muros de gaviones de sección trapezoidal. El diseño de trapecio isósceles con base mayor ancha B y base menor b en la corona permite que la resultante de empuje hidrostático y lodo pase por el tercio central de la base media, evitando el colapso por vuelco o deslizamiento. Los cálculos de volumen de piedra de sillar emplean directamente la fórmula de la mediana del trapecio multiplicada por la altura del muro.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t06_s02_c01",
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
                    id = "geom_t06_s02_c02",
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
                    id = "geom_t06_s02_c03",
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
                    id = "geom_t06_s02_c04",
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
                    id = "geom_t06_s02_c05",
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
                    id = "geom_t06_s02_c06",
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
                    id = "geom_t06_s02_c07",
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
                    id = "geom_t06_s02_c08",
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
                    id = "geom_t06_s02_c09",
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
                    id = "geom_t06_s02_c10",
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
