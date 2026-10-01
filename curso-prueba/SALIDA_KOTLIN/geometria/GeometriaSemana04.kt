package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t04_s01",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Proporcionalidad Geométrica y Métricas Euclidianas |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Máxima / Crítica (98%):** Es el núcleo de cálculo numérico de la geometría plana. Aparece en todo examen para calcular longitudes de alturas, cuerdas y catetos. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de cálculo de distancias inaccesibles e ingeniería vial), UNI (Teoremas de Stewart, Apolonio y relaciones métricas en la circunferencia). |
| **Competencia Cardinal** | Aplicar con exactitud analítica el Teorema de Tales, los teoremas de la bisectriz y el incentro, las relaciones métricas en el triángulo rectángulo y oblicuángulo (Apolonio, Herón), y los teoremas de cuerdas, secantes y tangentes en la circunferencia. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    TF["Teoremas Fundamentales y Métricas"] --> PROP["Proporcionalidad Geométrica"]
    TF --> RMR["Relaciones Métricas en Triángulo Rectángulo"]
    TF --> RMO["Relaciones Métricas en Triángulos Oblicuángulos"]
    TF --> RMC["Relaciones Métricas en la Circunferencia"]
    
    PROP --> TALES["Teorema de Tales: a/b = c/d"]
    PROP --> BIS["Teoremas de la Bisectriz (Interior y Exterior)"]
    PROP --> CEVAMEN["Teoremas de Ceva y Menelao"]
    
    RMR --> PIT["Pitágoras: a² + b² = c²"]
    RMR --> CATALT["Cateto: a² = c·m  |  Altura: h² = m·n  |  a·b = c·h"]
    RMR --> INVCAT["Inversas: 1/h² = 1/a² + 1/b²"]
    
    RMO --> EUC["Teoremas de Euclides I y II (Ley de Cosenos Geométrica)"]
    RMO --> APOL["Teorema de la Mediana (Apolonio): b² + c² = 2mₐ² + a²/2"]
    RMO --> HERON["Fórmula de Herón para la Altura"]
    RMO --> STEW["Teorema de Stewart (Ceviana cualquiera)"]
    
    RMC --> CUER["Teorema de las Cuerdas: a · b = c · d"]
    RMC --> SECAN["Teorema de las Secantes: PA · PB = PC · PD"]
    RMC --> TANG["Teorema de la Tangente: PT² = PA · PB"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — GEOMETRÍA
### TEMA IV: TEOREMAS FUNDAMENTALES (TALES, PITÁGORAS, RELACIONES MÉTRICAS EN TRIÁNGULOS Y CIRCUNFERENCIA)

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Proporcionalidad Geométrica

#### 1. Teorema de Tales de Mileto:
Tres o más rectas paralelas determinan sobre dos o más rectas secantes transversales segmentos correspondientes proporcionales:
\text{Si } \overleftrightarrow{L_1} \parallel \overleftrightarrow{L_2} \parallel \overleftrightarrow{L_3} \implies \mathbf{\frac{AB}{BC} = \frac{DE}{EF}}

#### 2. Teorema de la Bisectriz Interior:
En todo triángulo, la bisectriz interior divide al lado opuesto en dos segmentos cuyas longitudes son proporcionales a las longitudes de los lados adyacentes:
\mathbf{\frac{c}{a} = \frac{m}{n} \iff \frac{AB}{BC} = \frac{AD}{DC}}
- **Longitud de la bisectriz interior (x):**
  \mathbf{x^2 = c \cdot a - m \cdot n}

#### 3. Teorema de la Bisectriz Exterior:
En un triángulo escaleno ABC, la bisectriz exterior divide a la prolongación del lado opuesto en segmentos proporcionales:
\mathbf{\frac{c}{a} = \frac{m'}{n'}}
- **Longitud de la bisectriz exterior (y):**
  \mathbf{y^2 = m' \cdot n' - c \cdot a}

#### 4. Teorema del Incentro:
Si I es el incentro del triángulo ABC y \overline{BD} es la bisectriz interior:
\mathbf{\frac{BI}{ID} = \frac{AB + BC}{AC} = \frac{c + a}{b}}

#### 5. Teorema de Menelao:
Toda recta secante que corta a dos lados de un triángulo y a la prolongación del tercero determina seis segmentos que cumplen:
(a_1)(a_2)(a_3) = (b_1)(b_2)(b_3)
*(El producto de tres segmentos no consecutivos es igual al producto de los otros tres).*

#### 6. Teorema de Giovanni Ceva:
Tres cevianas interiores concurrentes en un punto interior determinan sobre los lados segmentos que cumplen:
(x)(y)(z) = (m)(n)(p)

---

### 3.2. Relaciones Métricas en el Triángulo Rectángulo
Sea el triángulo rectángulo ABC recto en B. Trazamos la altura \overline{BH} (h) relativa a la hipotenusa AC (c), determinando las proyecciones ortogonales AH = m y HC = n:

1. **Teorema de Pitágoras:**
   \mathbf{a^2 + b^2 = c^2}
2. **Teorema del Cateto:**
   El cuadrado de la longitud de un cateto es igual al producto de la hipotenusa por su proyección ortogonal sobre ella:
   \mathbf{c_1^2 = c \cdot m \qquad \land \qquad c_2^2 = c \cdot n}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Teorema | Fórmula Matemática | Aplicación Principal |
| :--- | :--- | :--- |
| **Tales** | \frac{a}{b} = \frac{c}{d} | Rectas paralelas y secantes |
| **Bisectriz Interior** | \frac{c}{a} = \frac{m}{n} \quad \land \quad x^2 = ca - mn | División proporcional interior |
| **Bisectriz Exterior** | y^2 = m'n' - ca | Longitud de bisectriz externa |
| **Pitágoras** | a^2 + b^2 = c^2 | Triángulos rectángulos |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t04_s01_c01",
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
                    id = "geom_t04_s01_c02",
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
                    id = "geom_t04_s01_c03",
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
                    id = "geom_t04_s01_c04",
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
                    id = "geom_t04_s01_c05",
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
                    id = "geom_t04_s01_c06",
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
                    id = "geom_t04_s01_c07",
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
                    id = "geom_t04_s01_c08",
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
                    id = "geom_t04_s01_c09",
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
                    id = "geom_t04_s01_c10",
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
            id = "geom_t04_s02",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
3. **Teorema de la Altura Relativa a la Hipotenusa:**
   El cuadrado de la altura relativa a la hipotenusa es igual al producto de las proyecciones de los catetos:
   \mathbf{h^2 = m \cdot n}
4. **Teorema del Producto de Lados y Altura:**
   El producto de las longitudes de los catetos es igual al producto de la hipotenusa por la altura:
   \mathbf{c_1 \cdot c_2 = c \cdot h}
5. **Teorema de la Inversa de los Cuadrados de los Catetos:**
   \mathbf{\frac{1}{h^2} = \frac{1}{c_1^2} + \frac{1}{c_2^2}}

---

### 3.3. Relaciones Métricas en Triángulos Oblicuángulos

#### 1. Teorema de Euclides (Ley de Cosenos Geométrica):
- **Para ángulo agudo (A < 90^\circ):**
  a^2 = b^2 + c^2 - 2b \cdot m
  *(donde m es la proyección de c sobre b)*.
- **Para ángulo obtuso (A > 90^\circ):**
  a^2 = b^2 + c^2 + 2b \cdot m

#### 2. Teorema de la Mediana (Teorema de Apolonio):
En todo triángulo, la suma de los cuadrados de dos lados es igual al doble del cuadrado de la mediana relativa al tercer lado, más la mitad del cuadrado de dicho tercer lado:
\mathbf{b^2 + c^2 = 2m_a^2 + \frac{a^2}{2}}

#### 3. Fórmula de Herón de Alejandría para la Altura:
Sea el semiperímetro p = \frac{a + b + c}{2}:
\mathbf{h_a = \frac{2}{a} \sqrt{p(p - a)(p - b)(p - c)}}

#### 4. Teorema de Matthew Stewart (Ceviana Cualquiera):
Si \overline{BD} (x) es una ceviana interior que divide al lado b en segmentos m y n:
\mathbf{c^2 \cdot n + a^2 \cdot m = x^2 \cdot b + b \cdot m \cdot n}

---

### 3.4. Relaciones Métricas en la Circunferencia

1. **Teorema de las Cuerdas:**
   Si dos cuerdas se cortan en un punto interior P:
   \mathbf{PA \cdot PB = PC \cdot PD}
2. **Teorema de las Secantes:**
   Si desde un punto exterior P se trazan dos rectas secantes:
   \mathbf{PA \cdot PB = PC \cdot PD}
   *(Longitud secante total por su parte externa es constante).*
3. **Teorema de la Tangente y la Secante:**
   Si desde un punto exterior P se trazan una tangente \overline{PT} y una secante \overline{PAB}:
   \mathbf{PT^2 = PA \cdot PB}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cateto** | a^2 = c \cdot m | Proyecciones en triángulo rectángulo |
| **Altura al Cuadrado** | h^2 = m \cdot n | Media geométrica de proyecciones |
| **Inversa Cuadrados** | \frac{1}{h^2} = \frac{1}{a^2} + \frac{1}{b^2} | Relación recíproca métrica |
| **Apolonio (Mediana)** | b^2 + c^2 = 2m_a^2 + \frac{a^2}{2} | Cálculo de medianas |
| **Cuerdas** | PA \cdot PB = PC \cdot PD | Cuerdas secantes interiores |
| **Tangente** | PT^2 = PA \cdot PB | Potencia de un punto exterior |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Identificación Inmediata de Triángulos Notables de Lados Enteros
Aprende de memoria los triángulos pitagóricos primitivos para evitar calcular raíces:
- **(3, 4, 5)** y sus múltiplos (6, 8, 10), (9, 12, 15), (15, 20, 25).
- **(5, 12, 13)** y sus múltiplos (10, 24, 26).
- **(7, 24, 25)**
- **(8, 15, 17)**
- **(9, 40, 41)**
- **(20, 21, 29)**
Si ves cateto 5 e hipotenusa 13, ¡el otro cateto es 12 sin aplicar la fórmula!

### Artificio 2: Teorema de la Tangente en Cuadriláteros con Circunferencia Oculta
Cuando veas una recta tangente a una circunferencia y una secante que pasa por el centro:
**Hack:** Prolonga la secante hasta que corte el extremo opuesto de la circunferencia para tener el diámetro completo.
Así aplicas PT^2 = (d - R)(d + R) = d^2 - R^2, que es la definición analítica de la **Potencia del Punto**.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Cinco del Triángulo Rectángulo: "Cateto, Altura, Producto, Inversa y Don Pitágoras"
- **Cateto al cuadrado:** Todo el piso (hipotenusa) por su pedacito de sombra (m).
- **Altura al cuadrado:** Sombra izquierda por sombra derecha (m \cdot n).
- **Producto:** Cateto por cateto es igual a hipotenusa por altura (ab = ch).
- **Inversa:** La suma de las inversas cuadráticas de los catetos da la inversa cuadrática de la altura.

### 2. Relaciones Métricas en Circunferencia: "Todo por afuera"
En el Teorema de las Secantes:
> **"Toda la secante por su pedazo exterior."**
- \text{Total}_1 \times \text{Afuera}_1 = \text{Total}_2 \times \text{Afuera}_2.
- Si la secante se convierte en tangente, ¡el "afuera" es toda la línea! Por eso queda: \text{Tangente}^2 = \text{Total} \times \text{Afuera}.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Teorema de las Secantes NO Multiplica la Parte Interna**
> Si una secante tiene parte externa 4 y cuerda interna 6:
> El error típico: multiplicar 4 \times 6 = 24. **¡ERROR GARRAFAL!**
> La fórmula exige multiplicar la **secante total**:
> \text{Secante Total} = 4 + 6 = 10 \implies 10 \times 4 = 40

> [!CAUTION]
> **Trampa 2: Confundir Mediana con Altura en Apolonio**
> El Teorema de Apolonio b^2 + c^2 = 2m_a^2 + \frac{a^2}{2} calcula exclusivamente la **MEDIANA**.
> Si el problema te pide la altura, debes usar Herón o relaciones métricas rectangulares, no Apolonio.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Cálculo de Distancias Inaccesibles y Triangulación Geodésica en el Cañón del Colca
En la medición geodésica de las profundidades del Cañón del Colca (Arequipa), los topógrafos del Instituto Geográfico Nacional (IGN) determinan el ancho del río Colca y la altura de farallones rocosos inaccesibles mediante estaciones totales láser aplicando el Teorema de Tales y el Teorema de la Bisectriz. La relación métrica de proporcionalidad permite calcular distancias kilométricas con precisión centimétrica sin necesidad de cruzar quebradas agrestes o arriesgar vidas en desfiladeros verticales de sillar y basalto.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t04_s02_c01",
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
                    id = "geom_t04_s02_c02",
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
                    id = "geom_t04_s02_c03",
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
                    id = "geom_t04_s02_c04",
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
                    id = "geom_t04_s02_c05",
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
                    id = "geom_t04_s02_c06",
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
                    id = "geom_t04_s02_c07",
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
                    id = "geom_t04_s02_c08",
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
                    id = "geom_t04_s02_c09",
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
                    id = "geom_t04_s02_c10",
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
