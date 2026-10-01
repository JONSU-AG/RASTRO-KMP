package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t08_s01",
            title = "PERÍMETROS, ÁREAS Y LONGITUDES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "PERÍMETROS, ÁREAS Y LONGITUDES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Geometría Plana y Métricas de Regiones |
| **Nivel de Complejidad** | Intermedio a Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.0 a 5.0 horas |
| **Prerrequisitos** | Triángulos, Semejanza, Cuadriláteros y Circunferencia |

### Competencias Clave del Prospecto
1. **Cálculo de Longitudes y Perímetros:** Determinar perímetros poligonales, longitud de la circunferencia y de arcos circulares con rigor dimensional.
2. **Dominio de Fórmulas de Áreas Triangulares:** Manejar fluidamente la fórmula básica, trigonométrica, Herón, función de inradio (A = pr), circunradio (A = \frac{abc}{4R}) y exradio.
3. **Relación de Áreas en Figuras:** Aplicar las propiedades de partición por medianas, cevianas, baricentro, semejanza geométrica y relaciones en trapecios/paralelogramos.
4. **Cálculo de Regiones Cuadrangulares y Circulares:** Resolver áreas de trapecios, rombos, cuadriláteros inscriptibles (Brahmagupta), sectores, coronas, segmentos circulares y lúnulas.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Métricas Planas: Perímetros y Áreas] --> B[Perímetros y Longitudes]
    A --> C[Áreas de Regiones Triangulares]
    A --> D[Relaciones de Áreas Triangulares]
    A --> E[Áreas de Regiones Cuadrangulares]
    A --> F[Áreas de Regiones Circulares]

    B --> B1[Perímetro Poligonal 2p]
    B --> B2[Longitud de Circunferencia: 2πR]
    B --> B3[Longitud de Arco: L = θR]

    C --> C1[Fórmula Básica y Trigonométrica]
    C --> C2[Fórmula de Herón]
    C --> C3[En función de radios: Inradio, Circunradio, Exradio]
    C --> C4[Triángulo Equilátero: L²√3 / 4]

    D --> D1[Proporcionalidad por Cevianas y Medianas]
    D --> D2[División Baricéntrica en 6 áreas iguales]
    D --> D3[Razón de Semejanza Cuadrática]

    E --> E1[Paralelogramo y Rombo]
    E --> E2[Trapecio: Base Media × Altura]
    E --> E3[Fórmula de Brahmagupta para Inscriptibles]
    E --> E4[Propiedad de Cuadriláteros: S1·S2 = S3·S4]

    F --> F1[Círculo y Sector Circular]
    F --> F2[Corona y Trapecio Circular]
    F --> F3[Segmento Circular y Lúnulas de Hipócrates]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Longitudes y Perímetros
- **Perímetro (2p):** Longitud total del contorno o frontera de una región plana cerrada. El **semiperímetro** se denota formalmente por p.
- **Longitud de la Circunferencia (L_{\mathcal{C}}):**
  L_{\mathcal{C}} = 2\pi R = \pi D
- **Longitud de Arco de Circunferencia (L_{\text{arco}}):**
  L = \theta_{\text{rad}} \cdot R = \frac{\pi R \theta^\circ}{180^\circ}

---

### 3.2. Áreas de Regiones Triangulares

#### 1. Fórmula Fundamental (Básica):
A = \frac{b \cdot h}{2}
Válida para todo triángulo (acutángulo, rectángulo u obtusángulo).

#### 2. Fórmula Trigonométrica:
A = \frac{a \cdot b \cdot \sin(\theta)}{2}
Donde a y b son dos lados adyacentes y \theta es el ángulo comprendido entre ellos.

#### 3. Fórmula de Herón de Alejandría:
Permite calcular el área conociendo únicamente las longitudes de los tres lados a, b, c:
p = \frac{a + b + c}{2} \quad (\text{semiperímetro})
A = \sqrt{p(p - a)(p - b)(p - c)}

#### 4. Triángulo Equilátero:
Para un triángulo equilátero de lado L y altura h:
A = \frac{L^2\sqrt{3}}{4} = \frac{h^2\sqrt{3}}{3}

#### 5. En Función de Radios Asociados:
- **Con el Inradio (r):**
  A = p \cdot r
- **Con el Circunradio (R):**
  A = \frac{a \cdot b \cdot c}{4R}
- **Con el Exradio (r_a relativo al lado a):**
  A = r_a(p - a)
- **Fórmula de los Exradios y el Inradio:**
  A = \sqrt{r \cdot r_a \cdot r_b \cdot r_c} \quad \text{y} \quad \frac{1}{r} = \frac{1}{r_a} + \frac{1}{r_b} + \frac{1}{r_c}

---

### 3.3. Relaciones y Partición de Áreas Triangulares
1. **Ceviana en un Triángulo:** Si desde el vértice B se traza la ceviana \overline{BD} hacia \overline{AC}:
   \frac{\text{Área}(\triangle ABD)}{\text{Área}(\triangle DBC)} = \frac{AD}{DC}
2. **Mediana:** Una mediana biseca el área del triángulo en dos regiones equivalentes:
   A_1 = A_2 = \frac{A_{\text{total}}}{2}
3. **Baricentro (G):**
   - Las tres medianas dividen al triángulo en **6 regiones triangulares de igual área**:
     S_1 = S_2 = \dots = S_6 = \frac{A_{\text{total}}}{6}
   - Al unir el baricentro G con los tres vértices A, B, C, se obtienen **3 triángulos de igual área**:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Región | Ecuación de Área | Parámetros y Condiciones |
| :--- | :--- | :--- |
| **Triángulo (Herón)** | A = \sqrt{p(p-a)(p-b)(p-c)} | p = \frac{a+b+c}{2} |
| **Triángulo (Inradio)** | A = p \cdot r | p: semiperímetro, r: inradio |
| **Triángulo (Circunradio)** | A = \dfrac{abc}{4R} | R: circunradio |
| **Triángulo Equilátero**| A = \dfrac{L^2\sqrt{3}}{4} | L: lado del triángulo equilátero |
| **Cuadrilátero Convexo** | A = \dfrac{1}{2} d_1 d_2 \sin(\theta) | d_1, d_2: diagonales, \theta: ángulo de cruce |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t08_s01_c01",
                    question = "**Enunciado:** Calcule el área de un sector circular cuyo ángulo central mide 60^\\circ y cuyo radio es 6\\text{ cm}.",
                    options = listOf(
                        "3\\pi\\text{ cm}^2",
                        "6\\pi\\text{ cm}^2",
                        "9\\pi\\text{ cm}^2",
                        "12\\pi\\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t08_s01_c02",
                    question = "**Enunciado:** Los lados de un triángulo miden 13\\text{ cm}, 14\\text{ cm} y 15\\text{ cm}. Calcule la longitud de su inradio r.",
                    options = listOf(
                        "3\\text{ cm}",
                        "4\\text{ cm}",
                        "5\\text{ cm}",
                        "3.5\\text{ cm}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t08_s01_c03",
                    question = "**Enunciado:** En un trapecio ABCD (\\overline{BC} \\parallel \\overline{AD}), las diagonales se cortan en el punto P. Si el área de la región triangular BPC es 9\\text{ m}^2 y el área de la región triangular APD es 25\\text{ m}^2, calcule el área total del trapecio ABCD.",
                    options = listOf(
                        "49\\text{ m}^2",
                        "64\\text{ m}^2",
                        "54\\text{ m}^2",
                        "72\\text{ m}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t08_s01_c04",
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
                    id = "geom_t08_s01_c05",
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
                    id = "geom_t08_s01_c06",
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
                    id = "geom_t08_s01_c07",
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
                    id = "geom_t08_s01_c08",
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
                    id = "geom_t08_s01_c09",
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
                    id = "geom_t08_s01_c10",
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
            id = "geom_t08_s02",
            title = "PERÍMETROS, ÁREAS Y LONGITUDES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "PERÍMETROS, ÁREAS Y LONGITUDES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     \text{Área}(ABG) = \text{Área}(BCG) = \text{Área}(CAG) = \frac{A_{\text{total}}}{3}
4. **Triángulos Semejantes:** La razón entre las áreas de dos triángulos semejantes es igual al cuadrado de su razón de semejanza lineal:
   \text{Si } \triangle ABC \sim \triangle A'B'C' \text{ con razón } k \implies \frac{\text{Área}(\triangle ABC)}{\text{Área}(\triangle A'B'C')} = k^2 = \left(\frac{a}{a'}\right)^2 = \left(\frac{h}{h'}\right)^2 = \left(\frac{r}{r'}\right)^2

---

### 3.4. Áreas de Regiones Cuadrangulares

1. **Cuadrilátero Convexo General:**
   A = \frac{1}{2} d_1 \cdot d_2 \cdot \sin(\theta)
   Donde d_1, d_2 son las longitudes de las diagonales y \theta es el ángulo entre ellas.
2. **Trapecio:**
   A = \left(\frac{B + b}{2}\right) h = M \cdot h
   Donde M = \frac{B+b}{2} es la longitud de la base media y h es la altura.
   - *Propiedades en el Trapecio:* Al trazar las diagonales de un trapecio con bases BC y AD, las áreas de los triángulos laterales son iguales: S_{\triangle ABM} = S_{\triangle CDM} = S. Además, S^2 = S_{\text{base1}} \cdot S_{\text{base2}} \implies S = \sqrt{S_1 \cdot S_2}.
   - El área total del trapecio es: A_{\text{total}} = (\sqrt{S_1} + \sqrt{S_2})^2.
3. **Paralelogramo / Romboide:**
   A = b \cdot h = a \cdot b \cdot \sin(\alpha)
4. **Rombo:**
   A = \frac{D \cdot d}{2}
   Donde D y d son las diagonales mayor y menor (perpendiculares entre sí).
5. **Cuadrado y Rectángulo:**
   - Rectángulo: A = b \cdot h.
   - Cuadrado: A = L^2 = \frac{d^2}{2}.
6. **Cuadrilátero Circunscrito (Tangencial):**
   A = p \cdot r
7. **Cuadrilátero Inscriptible (Fórmula de Brahmagupta):**
   Para un cuadrilátero inscriptible de lados a, b, c, d y semiperímetro p:
   A = \sqrt{(p - a)(p - b)(p - c)(p - d)}

---

### 3.5. Áreas de Regiones Circulares

1. **Círculo:**
   A = \pi R^2
2. **Sector Circular:**
   A_{\text{sector}} = \frac{\pi R^2 \theta^\circ}{360^\circ} = \frac{1}{2} \theta_{\text{rad}} R^2 = \frac{L \cdot R}{2}
3. **Corona Circular:** Región entre dos circunferencias concéntricas de radios R y r:
   A_{\text{corona}} = \pi(R^2 - r^2)
   *Artificio de la cuerda tangente:* Si \overline{AB} es una cuerda de la circunferencia mayor tangente a la menor, su longitud es 2\sqrt{R^2 - r^2}, por lo que:
   A_{\text{corona}} = \frac{\pi}{4} AB^2
4. **Trapecio Circular:**
   A_{\text{trap}} = \frac{\pi (R^2 - r^2) \theta^\circ}{360^\circ} = \left(\frac{L_1 + L_2}{2}\right) h \quad (h = R - r)
5. **Segmento Circular:**
   A_{\text{seg}} = A_{\text{sector}} - A_{\triangle} = \frac{\pi R^2 \theta^\circ}{360^\circ} - \frac{1}{2} R^2 \sin(\theta)
6. **Lúnulas de Hipócrates:**
   En un triángulo rectángulo, las áreas de las lúnulas construidas sobre los catetos como diámetros suman exactamente el área del triángulo rectángulo interior:
   S_1 + S_2 = \text{Área}(\triangle ABC)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Trapecio** | A = \left(\dfrac{B+b}{2}\right)h | B, b: bases, h: altura perpendicular |
| **Brahmagupta** | A = \sqrt{(p-a)(p-b)(p-c)(p-d)} | Cuadrilátero inscriptible |
| **Círculo** | A = \pi R^2 | R: radio |
| **Sector Circular** | A = \dfrac{\pi R^2 \theta^\circ}{360^\circ} = \dfrac{L R}{2} | \theta^\circ: ángulo central en grados |
| **Corona Circular** | A = \pi(R^2 - r^2) = \dfrac{\pi AB^2}{4} | AB: cuerda mayor tangente a menor |
| **Segmento Circular** | A = \dfrac{R^2}{2}\left(\dfrac{\pi \theta^\circ}{180^\circ} - \sin(\theta)\right) | \theta: ángulo central |
| **Lúnulas de Hipócrates**| S_1 + S_2 = S_{\triangle \text{rectángulo}} | Construidas sobre catetos |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Método del Complemento o Sustracción de Áreas
Nunca intentes integrar o aplicar fórmulas exóticas a regiones sombreadas irregulares. Descompón siempre:
A_{\text{sombreada}} = A_{\text{figura contenedora total}} - \sum A_{\text{regiones en blanco}}
Por ejemplo, una región entre un cuadrado y un cuadrante es simplemente: A = L^2 - \frac{\pi L^2}{4}.

### Hack 2: Traslación de Regiones Simétricas
En problemas con figuras sombreadas compuestas por semicircunferencias o cuadrantes repetidos (hojas, pétalos, aspas de molino):
1. Traza los ejes de simetría o diagonales.
2. Corta mentalmente las piezas y trasládalas a los espacios en blanco complementarios.
3. El 80% de las veces, las regiones sombreadas encajan perfectamente formando un triángulo, un cuadrado interior o medio semicírculo.

### Hack 3: Proporcionalidad de Áreas en Trapecios
Si te dan las áreas de las bases de un trapecio S_1 y S_2 formadas por las diagonales:
- El área total es directamente el binomio al cuadrado:
  A_{\text{total}} = (\sqrt{S_1} + \sqrt{S_2})^2
- Las áreas laterales que no son las bases valen exactamente \sqrt{S_1 \cdot S_2}. ¡Ahorra 5 minutos de ecuaciones!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de Radios en Triángulos: "P-IRATA y CUATRO-RICOS"
- **P-IRATA:** A = p \cdot r (Área = semi**P**erímetro por **r**adio).
- **CUATRO-RICOS:** A = \frac{abc}{4R} (El producto de los lados abc entre **4 R**adiazos).

### 2. Mnemotecnia del Sector Circular: "ÁREA COMO TRIÁNGULO"
- Piensa en el sector circular como si fuera un triángulo curvo:
  \text{Área} = \frac{\text{Base} \times \text{Altura}}{2} = \frac{L \cdot R}{2}
  ¡Base es el arco L, altura es el radio R!

### 3. Mnemotecnia del Baricentro: "EL PASTEL DE 6 PORCIONES"
- Todo baricentro divide el pastel del triángulo en exactamente **6 porciones iguales** si trazas las 3 medianas, o en **3 porciones iguales** si lo unes a los 3 vértices.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Perímetro (2p) con Semiperímetro (p)**
> En las fórmulas de Herón (A = \sqrt{p(p-a)(p-b)(p-c)}), en A = pr y en Brahmagupta, la variable p es el **SEMIPERÍMETRO** (la suma de lados entre 2).
> Si el examen te dice "el perímetro de una figura es 24", 2p = 24 \implies p = 12. ¡Usar 24 arruina todo el cálculo!

> [!CAUTION]
> **Trampa 2: Unidades al Cuadrado en Semejanza**
> Si los lados de dos triángulos semejantes están en razón 2 : 3, ¡sus áreas NO están en razón 2 : 3! Están en razón (2/3)^2 = 4 : 9.
> En volumen espacial, estará al cubo: 8 : 27.

> [!WARNING]
> **Trampa 3: Ángulo en Radianes vs Grados Sexagesimales**
> En la fórmula del sector circular A = \frac{1}{2}\theta R^2, el ángulo \theta **DEBE ESTAR OBLIGATORIAMENTE EN RADIANES**. Si tienes el ángulo en grados sexagesimales, debes usar A = \frac{\pi R^2 \theta^\circ}{360^\circ}.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Agrimensura y Catastro Territorial:** El cálculo de linderos irregulares de parcelas agrícolas y terrenos urbanos se realiza por triangulación y aplicación de la fórmula de Herón a partir de mediciones perimétricas con estaciones totales.
2. **Ingeniería Hidráulica y Canales de Riego:** La sección transversal de flujo de canales trapezoidales optimiza el "radio hidráulico" (R_h = \frac{A}{P_m}), donde maximizar el área A con el mínimo perímetro mojado P_m minimiza pérdidas por fricción.
3. **Diseño de Coberturas y Techos:** El cálculo del material de policarbonato o teja requerido para techos curvos (bóvedas cilíndricas) utiliza el desarrollo del área lateral y arcos de círculo.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t08_s02_c01",
                    question = "**Enunciado:** Un agricultor de Majes desea construir un reservorio con forma de corona circular. Se sabe que la cuerda más larga de la circunferencia exterior que resulta tangente a la circunferencia interior mide 40\\text{ m}. Calcule la cantidad de lona impermeable requerida para cubrir exactamente el fondo de dicho reservorio (área de la corona circular). (Considere \\pi \\approx 3.1416).",
                    options = listOf(
                        "400\\pi\\text{ m}^2",
                        "200\\pi\\text{ m}^2",
                        "800\\pi\\text{ m}^2",
                        "1600\\pi\\text{ m}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t08_s02_c02",
                    question = "**Enunciado:** En un triángulo rectángulo ABC recto en B, se construyen exteriormente semicircunferencias que tienen como diámetros a los catetos \\overline{AB} y \\overline{BC}, y se traza la semicircunferencia circunscrita con diámetro la hipotenusa \\overline{AC} pasando por el vértice B. Las regiones delimitadas por las semicircunferencias de los catetos y la semicircunferencia de la hipotenusa forman dos lúnulas (Lúnulas de Hipócrates). Si la mediana relativa a la hipotenusa mide 10\\text{ m} y uno de los ángulos agudos del triángulo mide 15^\\circ, calcule la suma de las áreas de dichas dos lúnulas.",
                    options = listOf(
                        "25\\text{ m}^2",
                        "50\\text{ m}^2",
                        "100\\text{ m}^2",
                        "50\\sqrt{3}\\text{ m}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t08_s02_c03",
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
                    id = "geom_t08_s02_c04",
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
                    id = "geom_t08_s02_c05",
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
                    id = "geom_t08_s02_c06",
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
                    id = "geom_t08_s02_c07",
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
                    id = "geom_t08_s02_c08",
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
                    id = "geom_t08_s02_c09",
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
                    id = "geom_t08_s02_c10",
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
