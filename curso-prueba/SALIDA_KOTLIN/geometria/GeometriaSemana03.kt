package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t03_s01",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Geometría Plana Fundamental y Razonamiento Deductivo |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Máxima / Imprescindible (99%):** Es el tema más evaluado de toda la geometría preuniversitaria. Casi todo problema geométrico complejo se reduce a congruencia o semejanza de triángulos. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de cálculo de sombras, puentes y armaduras reticulares), UNI (Construcciones auxiliares y criterios de semejanza). |
| **Competencia Cardinal** | Demostrar propiedades de figuras triangulares aplicando teoremas de ángulos interiores/exteriores y desigualdad triangular, trazar líneas notables, e identificar criterios de congruencia y razones de proporcionalidad en triángulos semejantes. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    TRI["El Triángulo"] --> PROP["Propiedades Fundamentales y Auxiliares"]
    TRI --> LIN["Líneas Notables: Ceviana, Mediana, Altura, Bisectriz, Mediatriz"]
    TRI --> CONG["Congruencia de Triángulos (≅)"]
    TRI --> SEM["Semejanza de Triángulos (~)"]
    
    PROP --> ANGINT["∑ Án. Interiores = 180°  |  ∑ Án. Exteriores = 360°"]
    PROP --> EXIST["Teorema de la Existencia: |b - c| < a < b + c"]
    PROP --> AUX["Auxiliares: Boomerang, Pescadito, Corbatita"]
    
    CONG --> CASOSC["Criterios: LAL, ALA, LLL, LLA"]
    CONG --> TEOAPP["Teoremas Clásicos: Bisectriz, Mediatriz, Base Media, Mediana a la Hipotenusa"]
    
    SEM --> CASOSS["Criterios de Semejanza: AA, LAL, LLL"]
    SEM --> PROPSE["Proporcionalidad: a/a' = b/b' = c/c' = h/h' = k"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — GEOMETRÍA
### TEMA III: TRIÁNGULOS, LÍNEAS NOTABLES, CONGRUENCIA Y SEMEJANZA

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Definición y Propiedades Fundamentales del Triángulo
El **triángulo** es la figura geométrica formada por la unión de tres segmentos de recta determinados por tres puntos no colineales:
\triangle ABC = \overline{AB} \cup \overline{BC} \cup \overline{CA}

#### Teoremas Angulares Fundamentales:
1. **Suma de Ángulos Interiores:**
   \alpha + \beta + \theta = 180^\circ
2. **Suma de Ángulos Exteriores (uno por vértice):**
   x + y + z = 360^\circ
3. **Medida del Ángulo Exterior:**
   Todo ángulo exterior es igual a la suma de las medidas de los dos ángulos interiores no adyacentes a él:
   x = \beta + \theta, \qquad y = \alpha + \theta, \qquad z = \alpha + \beta
4. **Teorema de la Existencia Triangular (Desigualdad Triangular):**
   En todo triángulo, la longitud de un lado es mayor que la diferencia de los otros dos y menor que su suma:
   \mathbf{|b - c| < a < b + c}
5. **Teorema de la Correspondencia:**
   A mayor ángulo interior se opone mayor lado, y viceversa:
   \alpha > \beta \iff a > b

#### Propiedades Auxiliares Frecuentes:
- **Teorema del Boomerang:** x = \alpha + \beta + \theta
- **Teorema del Pescadito:** \alpha + \beta = x + y
- **Teorema de la Mariposa (Corbatita):** \alpha + \beta = \theta + \phi

---

### 3.2. Clasificación de Triángulos

#### A. Por las Longitudes de sus Lados:
1. **Triángulo Escaleno:** Sus tres lados tienen longitudes diferentes (a \neq b \neq c).
2. **Triángulo Isósceles:** Posee dos lados congruentes (a = b \neq c). Los ángulos opuestos a dichos lados son congruentes (**ángulos de la base**).
3. **Triángulo Equilátero:** Sus tres lados son congruentes (a = b = c). Cada ángulo interior mide estrictamente **60^\circ**.

#### B. Por las Medidas de sus Ángulos (Triángulos Oblicuángulos y Rectángulos):
1. **Triángulo Acutángulo:** Sus tres ángulos interiores son agudos (< 90^\circ).
2. **Triángulo Rectángulo:** Posee un ángulo recto (90^\circ). Los lados que forman el ángulo recto son los **catetos** y el lado opuesto es la **hipotenusa**. Sus ángulos agudos son complementarios (\alpha + \beta = 90^\circ).
3. **Triángulo Obtusángulo:** Posee un ángulo interior obtuso (> 90^\circ).

---

### 3.3. Líneas Notables Asociadas al Triángulo
1. **Ceviana:** Segmento que une un vértice con cualquier punto del lado opuesto o de su prolongación.
2. **Mediana:** Ceviana que une un vértice con el **punto medio** del lado opuesto.
3. **Altura:** Ceviana perpendicular trazada desde un vértice a la recta que contiene al lado opuesto.
4. **Bisectriz (Interior y Exterior):** Rayo que biseca un ángulo del triángulo.
   - Ángulo formado por dos bisectrices interiores:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Teorema / Propiedad | Formulación Matemática | Contexto Geométrico |
| :--- | :--- | :--- |
| **Existencia Triangular** | \|b - c\| < a < b + c | En todo triángulo real |
| **Ángulo Exterior** | x = \alpha + \beta | Ángulo exterior no adyacente |
| **Bisectrices Interiores** | x = 90^\circ + \frac{\theta}{2} | Ángulo en el incentro |
| **Bisectrices Exteriores** | x = 90^\circ - \frac{\theta}{2} | Ángulo en el excentro |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t03_s01_c01",
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
                    id = "geom_t03_s01_c02",
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
                    id = "geom_t03_s01_c03",
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
                    id = "geom_t03_s01_c04",
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
                    id = "geom_t03_s01_c05",
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
                    id = "geom_t03_s01_c06",
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
                    id = "geom_t03_s01_c07",
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
                    id = "geom_t03_s01_c08",
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
                    id = "geom_t03_s01_c09",
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
                    id = "geom_t03_s01_c10",
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
            id = "geom_t03_s02",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     x = 90^\circ + \frac{\theta}{2}
   - Ángulo formado por dos bisectrices exteriores:
     x = 90^\circ - \frac{\theta}{2}
   - Ángulo formado por una bisectriz interior y una exterior:
     x = \frac{\theta}{2}
5. **Mediatriz:** Recta coplanar perpendicular a un lado en su punto medio (no necesariamente pasa por el vértice opuesto).

---

### 3.4. Congruencia de Triángulos (\cong)
Dos triángulos son **congruentes** si sus tres lados correspondientes y sus tres ángulos correspondientes son respectivamente congruentes (tienen igual forma e igual tamaño):

\triangle ABC \cong \triangle DEF \iff \begin{cases} AB = DE, \ BC = EF, \ CA = FD \\ \angle A \cong \angle D, \ \angle B \cong \angle E, \ \angle C \cong \angle F \end{cases}

#### Criterios de Congruencia (Casos Fundamentales):
1. **Caso LAL (Lado - Ángulo - Lado):** Dos lados y el ángulo comprendido entre ellos respectivamente congruentes.
2. **Caso ALA (Ángulo - Lado - Ángulo):** Un lado y los dos ángulos adyacentes a él respectivamente congruentes.
3. **Caso LLL (Lado - Lado - Lado):** Los tres lados respectivamente congruentes.
4. **Caso LLA (Lado - Lado - Ángulo Mayor):** Dos lados y el ángulo opuesto al mayor de ellos respectivamente congruentes.

#### Teoremas Clásicos Derivados de la Congruencia:

#### 1. Teorema de la Bisectriz:
Todo punto de la bisectriz de un ángulo equidista de los lados de dicho ángulo:
P \in \text{Bisectriz} \implies PA = PB \quad \land \quad OA = OB

#### 2. Teorema de la Mediatriz:
Todo punto de la mediatriz de un segmento equidista de los extremos de dicho segmento:
P \in \text{Mediatriz}(\overline{AB}) \implies PA = PB \quad (\triangle APB \text{ es isósceles})

#### 3. Teorema de los Puntos Medios y la Base Media:
El segmento que une los puntos medios de dos lados de un triángulo es paralelo al tercer lado y su longitud es la mitad de dicho lado:
MN \parallel AC \quad \land \quad \mathbf{MN = \frac{AC}{2}}

#### 4. Teorema de la Mediana Relativa a la Hipotenusa:
En todo triángulo rectángulo, la longitud de la mediana relativa a la hipotenusa es igual a la mitad de la longitud de la hipotenusa:
\mathbf{BM = \frac{AC}{2} = AM = MC}
*(Determina dos triángulos isósceles interiores: \triangle ABM y \triangle CBM).*

---

### 3.5. Semejanza de Triángulos (\sim)
Dos triángulos son **semejantes** si tienen sus tres ángulos correspondientes de igual medida y sus lados homólogos (los que se oponen a ángulos iguales) son proporcionales:

\triangle ABC \sim \triangle A'B'C' \iff \frac{a}{a'} = \frac{b}{b'} = \frac{c}{c'} = \frac{h}{h'} = \frac{2p}{2p'} = k
Donde k es la **razón de semejanza**.

#### Criterios de Semejanza:
1. **Primer Criterio (Ángulo - Ángulo, AA):** Si dos triángulos tienen dos pares de ángulos interiores de igual medida, entonces son semejantes.
2. **Segundo Criterio (LAL):** Si tienen un ángulo congruente comprendido entre lados homólogos proporcionales.
3. **Tercer Criterio (LLL):** Si sus tres pares de lados homólogos son proporcionales.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Interior y Exterior** | x = \frac{\theta}{2} | Bisectriz interior y exterior cruzadas |
| **Base Media** | MN = \frac{AC}{2} \quad \land \quad MN \parallel AC | M, N puntos medios |
| **Mediana a la Hipotenusa** | BM = \frac{AC}{2} | Exclusivo de triángulos rectángulos |
| **Semejanza Básica** | \frac{a}{a'} = \frac{b}{b'} = \frac{h}{h'} = k | Triángulos con ángulos congruentes |
| **Teorema del Boomerang** | x = \alpha + \beta + \theta | Cuadrilátero cóncavo |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Trazo Auxiliar de la Mediana en el Triángulo Rectángulo
Cuando veas un triángulo rectángulo con un ángulo notable de 15^\circ o 75^\circ, o cuando conozcas el doble de un ángulo (\alpha y 2\alpha):
**¡No uses trigonometría engorrosa de ángulos compuestos!**
**Hack:** Traza la mediana relativa a la hipotenusa. Como BM = MC, el triángulo \triangle BMC es isósceles con ángulo en la base \alpha.
Por ángulo exterior, el ángulo \angle AMB mide exactamente **2\alpha**, transformando el problema en un triángulo isósceles o notable directo.

### Artificio 2: Identificación Relámpago de Semejanza por Ángulos Complementarios
En triángulos rectángulos donde se traza la altura relativa a la hipotenusa:
**Hack:** Nombra los ángulos agudos como \alpha y \beta (con \alpha + \beta = 90^\circ).
Al rotar por los vértices, los tres triángulos rectángulos formados (el total y los dos parciales) tienen exactamente los mismos ángulos \alpha y \beta.
Aplica semejanza de inmediato: \frac{\text{cateto opuesto a } \alpha}{\text{hipotenusa}}.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Triángulo Rectángulo y su Mediana: "La Triple M"
> **"Mediana a la hipotenusa \to Mide la Mitad."**
- Al trazar la mediana desde el ángulo recto: los tres segmentos resultantes son gemelos exactos:
  AM = MC = BM
- ¡Aparecen dos triángulos isósceles de inmediato!

### 2. Ángulos entre Bisectrices: "Interior Suma, Exterior Resta"
- Entre dos bisectrices **interiores**: vas hacia adentro \to **90^\circ + \frac{\theta}{2}**.
- Entre dos bisectrices **exteriores**: vas hacia afuera \to **90^\circ - \frac{\theta}{2}**.
- Una interior y una exterior: la mitad exacta: **\frac{\theta}{2}**.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Olvidar la Existencia Triangular al Calcular Valores Enteros**
> En un triángulo isósceles con lados 4\text{ cm} y 9\text{ cm}, ¿cuánto mide el tercer lado?
> El postulante dice: *"Puede ser 4 o 9"*.
> **¡ERROR!** Si el tercer lado fuera 4:
> Suma de lados menores: 4 + 4 = 8 < 9. ¡El triángulo no se cierra, viola la existencia triangular!
> El tercer lado debe ser obligatoriamente 9\text{ cm} (9 - 4 < 9 < 9 + 4).

> [!CAUTION]
> **Trampa 2: Lados Homólogos Desalineados en Semejanza**
> En \triangle ABC \sim \triangle PQR, muchos alumnos dividen lado izquierdo entre lado izquierdo.
> **Regla de oro:** Los lados homólogos no se eligen por su posición visual, sino **por el ángulo al cual se oponen**. El lado que se opone a \alpha en el primer triángulo se divide estrictamente entre el lado que se opone a \alpha en el segundo triángulo.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Estructuras de Techumbre y Tijerales Reticulares en Arquitectura Arequipeña
En las naves industriales y hangares del Parque Industrial de Arequipa, las estructuras de soporte de techos utilizan cerchas metálicas triangulares (armaduras tipo Pratt o Howe). La rigidez mecánica indeformable del triángulo (propiedad que no poseen los cuadriláteros) garantiza que la estructura soporte cargas de nieve y sismos sin colapsar. Los ingenieros estructurales de la UNSA aplican el criterio de congruencia LLL y el teorema de la base media para calcular la longitud exacta de las barras de arriostramiento diagonal y minimizar el peso total de acero empleado.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t03_s02_c01",
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
                    id = "geom_t03_s02_c02",
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
                    id = "geom_t03_s02_c03",
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
                    id = "geom_t03_s02_c04",
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
                    id = "geom_t03_s02_c05",
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
                    id = "geom_t03_s02_c06",
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
                    id = "geom_t03_s02_c07",
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
                    id = "geom_t03_s02_c08",
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
                    id = "geom_t03_s02_c09",
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
                    id = "geom_t03_s02_c10",
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
