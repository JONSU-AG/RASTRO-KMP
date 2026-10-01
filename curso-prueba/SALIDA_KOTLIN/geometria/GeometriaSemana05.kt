package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t05_s01",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Geometría del Triángulo y Lugares Geométricos |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Alta (91%):** Se evalúan las propiedades métricas del baricentro (razón 2:1), el circuncentro en triángulos rectángulos y la Recta de Euler. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO de centros de masa y antenas de telecomunicación), UNI (Geometría del triángulo órtico y propiedades de la Recta de Euler). |
| **Competencia Cardinal** | Definir lugares geométricos en el plano, localizar con exactitud los puntos notables del triángulo (baricentro, ortocentro, incentro, circuncentro y excentro), y aplicar las propiedades de concurrencia y la razón colineal de Euler. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    LGPN["Lugares Geométricos y Puntos Notables"] --> LG["Lugares Geométricos en el Plano"]
    LGPN --> PN["Los Cinco Puntos Notables del Triángulo"]
    LGPN --> EULER["La Recta de Leonhard Euler"]
    
    LG --> MED["Mediatriz (Equidistancia a 2 puntos)"]
    LG --> BIS["Bisectriz (Equidistancia a 2 rectas)"]
    LG --> ACAP["Arco Capaz (Ángulo de observación constante)"]
    
    PN --> BARI["Baricentro G (Medianas: razón 2 a 1)"]
    PN --> ORTO["Ortocentro H (Alturas)"]
    PN --> INCE["Incentro I (Bisectrices interiores / Inradio r)"]
    PN --> CIRC["Circuncentro O (Mediatrices / Circunradio R)"]
    PN --> EXCE["Excentro E (Bisectrices exteriores / Exradio rₐ)"]
    
    EULER --> COLINEAL["H, G, O son colineales en todo triángulo no equilátero"]
    EULER --> PROP21["Relación Métrica Fundamental: HG = 2(GO)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — GEOMETRÍA
### TEMA V: LUGARES GEOMÉTRICOS, PUNTOS NOTABLES DEL TRIÁNGULO Y RECTA DE EULER

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Teoría de Lugares Geométricos (L.G.)
Un **Lugar Geométrico** es el conjunto de todos los puntos del plano, y solo ellos, que satisfacen una propiedad geométrica o métrica determinada:
\mathcal{LG} = \{P \in \mathbb{R}^2 \mid \mathcal{P}(P) \text{ es verdadera}\}

#### Lugares Geométricos Clásicos:
1. **La Mediatriz:** Lugar geométrico de todos los puntos del plano que equidistan de dos puntos fijos A y B:
   \mathcal{LG} = \{P \mid d(P, A) = d(P, B)\}
2. **La Bisectriz:** Lugar geométrico de todos los puntos que equidistan de los lados de un ángulo:
   \mathcal{LG} = \{P \mid d(P, \overrightarrow{OA}) = d(P, \overrightarrow{OB})\}
3. **La Circunferencia:** Lugar geométrico de los puntos que equidistan de un punto fijo central O:
   \mathcal{LG} = \{P \mid d(P, O) = R\}
4. **El Arco Capaz:** Lugar geométrico de los puntos desde los cuales un segmento dado \overline{AB} se observa bajo un mismo ángulo constante \alpha.

---

### 3.2. Los Cinco Puntos Notables del Triángulo

#### 1. Baricentro o Gravicentro (G):
Es el punto de intersección de las **tres medianas** del triángulo. Es el centro de gravedad físico de una placa triangular homogénea.
- **Teorema de la Razón 2 a 1:**
  El baricentro divide a cada mediana en dos segmentos cuya razón es de 2 a 1, siendo el segmento mayor el que conecta con el vértice:
  \mathbf{AG = 2(GM_a), \qquad BG = 2(GM_b), \qquad CG = 2(GM_c)}
- **Coordenadas Cartesianas del Baricentro:**
  G = \left(\frac{x_A + x_B + x_C}{3}, \ \frac{y_A + y_B + y_C}{3}\right)

#### 2. Ortocentro (H):
Es el punto de intersección de las **tres alturas** (o de las rectas que las contienen).
- **Ubicación según la naturaleza del triángulo:**
  - En un triángulo **acutángulo:** H es un punto estrictamente **interior**.
  - En un triángulo **rectángulo:** H coincide exactamente con el **vértice del ángulo recto**.
  - En un triángulo **obtusángulo:** H se ubica en la **región exterior**, detrás del ángulo obtuso.

#### 3. Incentro (I):
Es el punto de intersección de las **tres bisectrices interiores**.
- Es el centro de la **circunferencia inscrita** (tangente interior a los tres lados).
- Su radio se denomina **inradio (r)**.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Punto / Teorema | Relación Matemática | Ubicación / Condición |
| :--- | :--- | :--- |
| **Baricentro (G)** | AG = 2(GM_a) | Razón métrica 2:1 |
| **Coordenadas G** | G = \frac{A + B + C}{3} | Media aritmética de vértices |
| **Poncelet** | a + b = c + 2r | Triángulos rectángulos |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t05_s01_c01",
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
                    id = "geom_t05_s01_c02",
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
                    id = "geom_t05_s01_c03",
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
                    id = "geom_t05_s01_c04",
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
                    id = "geom_t05_s01_c05",
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
                    id = "geom_t05_s01_c06",
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
                    id = "geom_t05_s01_c07",
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
                    id = "geom_t05_s01_c08",
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
                    id = "geom_t05_s01_c09",
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
                    id = "geom_t05_s01_c10",
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
            id = "geom_t05_s02",
            title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "GEOMETRÍA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
- Siempre es un punto **interior** en cualquier tipo de triángulo.
- **Teorema de Poncelet (exclusivo para triángulos rectángulos):**
  a + b = c + 2r \quad (\text{Suma de catetos} = \text{Hipotenusa} + 2 \cdot \text{Inradio})

#### 4. Circuncentro (O):
Es el punto de intersección de las **tres mediatrices** de los lados del triángulo.
- Es el centro de la **circunferencia circunscrita** (que pasa por los tres vértices).
- Su radio se denomina **circunradio (R)**.
- Equidista de los tres vértices: OA = OB = OC = R.
- **Ubicación en el plano:**
  - En un triángulo **acutángulo:** O es **interior**.
  - En un triángulo **rectángulo:** O se ubica exactamente en el **punto medio de la hipotenusa** (R = c/2).
  - En un triángulo **obtusángulo:** O es **exterior**, detrás del lado mayor.
- **Ángulo Central:** El ángulo formado desde el circuncentro hacia dos vértices duplica al ángulo del tercer vértice:
  \mathbf{\angle BOC = 2\angle A}

#### 5. Excentro (E):
Es el punto de intersección de **dos bisectrices exteriores y una bisectriz interior**.
- Es el centro de la **circunferencia exinscrita** (tangente a un lado y a las prolongaciones de los otros dos).
- Su radio es el **exradio (r_a)**.
- Todo triángulo posee **tres excentros** (E_a, E_b, E_c), todos exteriores.

---

### 3.3. La Recta de Leonhard Euler
En **todo triángulo no equilátero**, el **Ortocentro (H)**, el **Baricentro (G)** y el **Circuncentro (O)** son colineales y pertenecen a una misma recta denominada **Recta de Euler**.

#### Propiedad Métrica Cardinal de la Recta de Euler:
La distancia del ortocentro al baricentro es exactamente el doble de la distancia del baricentro al circuncentro:
\mathbf{HG = 2(GO) \iff \frac{HG}{GO} = 2}
- La distancia del ortocentro a un vértice es el doble de la distancia del circuncentro al lado opuesto:
  BH = 2(OM_b)

#### Casos Especiales de Puntos Notables:
1. **Triángulo Equilátero:**
   Los cuatro puntos notables coinciden en un único punto:
   \mathbf{H \equiv G \equiv I \equiv O}
   La Recta de Euler se reduce a un único punto degenerado.
2. **Triángulo Isósceles:**
   La Recta de Euler coincide con la altura relativa a la base (eje de simetría) y contiene también al **Incentro (I)**:
   H, G, I, O \quad \text{son todos colineales sobre el eje de simetría}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Circuncentro (O)** | OA = OB = OC = R | Centro de circunferencia circunscrita |
| **Ángulo Circuncentro** | \angle BOC = 2\angle A | Ángulo central |
| **Recta de Euler** | HG = 2(GO) | Colinealidad de H, G, O |
| **Distancia Vértice-Orto** | BH = 2(OM_b) | Relación con la mediatriz |
| **Pitot** | AB + CD = BC + AD | Cuadrilátero circunscrito |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Circuncentro Instantáneo en Triángulos Rectángulos
Si en un problema de admisión te dicen: *"En un triángulo rectángulo de hipotenusa 20\text{ cm}, se ubica el circuncentro O y el ortocentro H"*:
**¡No traces mediatrices ni alturas!**
**Hack:**
- El ortocentro H está en el vértice recto.
- El circuncentro O está en el punto medio de la hipotenusa.
- Por tanto, la distancia HO es la mediana a la hipotenusa:
  HO = R = \frac{20}{2} = 10\text{ cm}
- Y como HG = \frac{2}{3} HO \implies HG = \frac{20}{3}\text{ cm}. ¡Resuelto en 5 segundos!

### Artificio 2: Ángulos Formados con el Ortocentro
En un triángulo acutángulo ABC, el ángulo formado por las alturas en el ortocentro es el suplementario del ángulo del tercer vértice:
\angle BHC = 180^\circ - \angle A
¡Esto ahorra calcular cuadriláteros inscriptibles en el 90% de los problemas de examen!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Orden de la Recta de Euler: "Hugo Genera Oro" (H - G - O)
> **"H - G - O con proporción 2 a 1"**
- **H** (Ortocentro) \to el más lejano.
- **G** (Baricentro) \to el del medio.
- **O** (Circuncentro) \to el extremo opuesto.
- La distancia grande HG mide **el doble** que la chica GO:
  H \xrightarrow{\quad 2k \quad} G \xrightarrow{\quad 1k \quad} O

### 2. Puntos Notables y sus Líneas: "Me-Al-Bi-Me"
- **Me**dianas \to Baricentro
- **Al**turas \to Ortocentro
- **Bi**sectrices interiores \to Incentro
- **Me**diatrices \to Circuncentro

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Incentro NO Pertenece a la Recta de Euler en General**
> Muchos estudiantes asumen que la Recta de Euler contiene a los cuatro puntos notables (H, G, O, I).
> **¡FALSO!** El incentro I solo pertenece a la Recta de Euler si el triángulo es **isósceles** o equilátero. En un triángulo escaleno general, el incentro queda fuera de la recta de Euler formando un triángulo con ellos.

> [!CAUTION]
> **Trampa 2: La Ubicación del Ortocentro en Triángulos Obtusángulos**
> Si el triángulo es obtusángulo, el ortocentro no cae dentro del triángulo. Si intentas trazar las alturas hacia adentro, el dibujo colapsará. Debes prolongar los lados exteriores para encontrar el punto de concurrencia H.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Centro de Gravedad Estructural en Naves de Sillar y Ubicación de Antenas en Arequipa
En el diseño y restauración de cubiertas de sillar del Monasterio de Santa Catalina en Arequipa, la determinación del baricentro G de las cerchas triangulares es crítica para concentrar el apoyo de las cargas gravitatorias sobre las columnas maestras y evitar momentos de volteo durante sismos de gran magnitud. Asimismo, las empresas de telecomunicaciones ubican antenas repetidoras en el circuncentro O de tres distritos (Cerro Colorado, Cayma y Yanahuara) para asegurar que el radio de cobertura R equidiste exactamente de los tres nodos poblacionales urbanos.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t05_s02_c01",
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
                    id = "geom_t05_s02_c02",
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
                    id = "geom_t05_s02_c03",
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
                    id = "geom_t05_s02_c04",
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
                    id = "geom_t05_s02_c05",
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
                    id = "geom_t05_s02_c06",
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
                    id = "geom_t05_s02_c07",
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
                    id = "geom_t05_s02_c08",
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
                    id = "geom_t05_s02_c09",
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
                    id = "geom_t05_s02_c10",
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
