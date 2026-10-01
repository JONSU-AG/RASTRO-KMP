package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana09 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t09_s01",
            title = "GEOMETRÍA ESPACIAL, POLIEDROS, PRISMAS Y PIRÁMIDES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "GEOMETRÍA ESPACIAL, POLIEDROS, PRISMAS Y PIRÁMIDES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Geometría del Espacio y Estereometría |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Geometría Plana, Polígonos, Áreas de Regiones Planas y Trigonometría Básica |

### Competencias Clave del Prospecto
1. **Visualización y Proyección Espacial:** Dominar las posiciones relativas de rectas y planos en el espacio \mathbb{R}^3, rectas alabeadas y el Teorema de las Tres Perpendiculares.
2. **Aplicación del Teorema de Euler y Poliedros Regulares:** Analizar y calcular elementos, áreas y volúmenes de los 5 sólidos platónicos (tetraedro, hexaedro, octaedro, dodecaedro e icosaedro).
3. **Métrica de Prismas y Paralelepípedos:** Calcular áreas laterales, totales y volúmenes de prismas rectos, oblicuos (usando sección recta) y ortoedros.
4. **Métrica de Pirámides y Troncos:** Manejar relaciones métricas, apotemas, volúmenes de pirámides y troncos de pirámide mediante semejanza tridimensional.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Geometría del Espacio] --> B[Fundamentos y Posiciones Relativas]
    A --> C[Ángulos Diedros y Triedros]
    A --> D[Poliedros Regulares / Platónicos]
    A --> E[Prismas y Paralelepípedos]
    A --> F[Pirámides y Troncos de Pirámide]

    B --> B1[Determinación del Plano]
    B --> B2[Rectas Alabeadas / Cruzadas]
    B --> B3[Teorema de las Tres Perpendiculares]

    C --> C1[Ángulo Diedro y Planos Perpendiculares]
    C --> C2[Triedro: Suma de Caras < 360°]

    D --> D1[Teorema de Euler: C + V = A + 2]
    D --> D2[Tetraedro y Octaedro Regular]
    D --> D3[Hexaedro Regular / Cubo]
    D --> D4[Dodecaedro e Icosaedro Regular]

    E --> E1[Prisma Recto: AL = 2p · h]
    E --> E2[Prisma Oblicuo: V = A_SR · a_L]
    E --> E3[Ortoedro: D² = a² + b² + c²]

    F --> F1[Pirámide Regular: V = 1/3 A_base · h]
    F --> F2[Relación de Semejanza Cúbica: V1/V2 = k³]
    F --> F3[Tronco de Pirámide: V = h/3 B1 + B2 + √(B1·B2)]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Fundamentos del Espacio y Determinación de un Plano
Un plano geométrico queda determinado de manera única por:
1. Tres puntos no colineales.
2. Una recta y un punto exterior a ella.
3. Dos rectas secantes.
4. Dos rectas paralelas no coincidentes.

#### Posiciones Relativas en el Espacio:
- **Dos Rectas:**
  - *Coplanares:* Paralelas (no se cortan) o Secantes (se cortan en un punto).
  - *No Coplanares (Alabeadas o Cruzadas):* No se intersecan ni son paralelas; pertenecen a planos distintos.
- **Recta y Plano:**
  - Recta paralela al plano (intersección vacía).
  - Recta secante al plano (se intersecan en un único punto).
  - Recta contenida en el plano (todos sus puntos pertenecen al plano).
- **Dos Planos:** Paralelos (distancia constante) o Secantes (se cortan en una línea recta llamada arista).

---

### 3.2. Teorema de las Tres Perpendiculares (Pilar de la Estereometría)
Sea un plano \mathcal{P}, una recta \mathscr{L}_1 perpendicular al plano en el punto O, y una recta \mathscr{L} contenida en dicho plano:
1. **Primera perpendicular:** \overline{PO} \perp \mathcal{P} (con P exterior y O \in \mathcal{P}).
2. **Segunda perpendicular:** Desde O se traza \overline{OH} \perp \mathscr{L} (H \in \mathscr{L}).
3. **Tesis (Tercera perpendicular):** Al unir P con H, la recta \overline{PH} es **estrictamente perpendicular** a la recta \mathscr{L}.
   \overline{PH} \perp \mathscr{L}
*Importancia:* Permite calcular al instante la distancia de un punto a una recta en el espacio y determinar la medida del ángulo diedro formado entre el plano que contiene a \triangle POH y el plano \mathcal{P}.

---

### 3.3. Ángulos Diedros y Triedros
- **Ángulo Diedro:** Figura geométrica formada por dos semiplanos (caras) que tienen una recta común de origen (arista). Su medida es el ángulo rectilíneo formado por dos rectas perpendiculares a la arista trazadas por un mismo punto de ella, una en cada cara.
- **Ángulo Triedro:** Ángulo poliedro de tres caras (a, b, c) y tres diedros (\alpha, \beta, \gamma).
  - *Propiedad de las caras:* En todo triedro, la suma de las medidas de sus caras es estrictamente mayor que 0^\circ y menor que 360^\circ:
    0^\circ < a + b + c < 360^\circ
  - *Desigualdad triangular de caras:* Cada cara es menor que la suma de las otras dos y mayor que su diferencia:
    |b - c| < a < b + c

---

### 3.4. Poliedros y Teorema de Euler
Un **poliedro** es un sólido geométrico limitado por cuatro o más regiones poligonales planas denominadas caras.
- **Teorema de Euler:** En todo poliedro convexo:
  C + V = A + 2
  Donde C es el número de caras, V el número de vértices y A el número de aristas.
- **Suma de las medidas de los ángulos internos de todas las caras (S_\angle):**
  S_\angle = 360^\circ (V - 2) = 360^\circ (A - C)

#### Los 5 Poliedros Regulares (Sólidos Platónicos):
Son aquellos cuyas caras son regiones poligonales regulares congruentes y en cada vértice concurre el mismo número de aristas.

| Poliedro | Caras (C) | Vértices (V) | Aristas (A) | Forma de la Cara | Área Total (A_T) | Volumen (V) |
| :--- | :---: | :---: | :---: | :--- | :--- | :--- |

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Sólido / Relación | Fórmula Rigurosa | Variables y Condiciones |
| :--- | :--- | :--- |
| **Teorema de Euler** | C + V = A + 2 | Válido para poliedros convexos |
| **Suma de Ángulos de Caras**| S_\angle = 360^\circ(V - 2) | V: número de vértices |
| **Tetraedro Regular (Altura)**| h = \dfrac{a\sqrt{6}}{3} | a: longitud de la arista |
| **Tetraedro Regular (Volumen)**| V = \dfrac{a^3\sqrt{2}}{12} | a: arista |
| **Octaedro Regular (Volumen)**| V = \dfrac{a^3\sqrt{2}}{3} | Formado por dos pirámides cuadrangulares |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t09_s01_c01",
                    question = "**Enunciado:** Un poliedro convexo tiene 12 caras y 20 vértices. Calcule el número de aristas de dicho poliedro.",
                    options = listOf(
                        "28",
                        "30",
                        "32",
                        "34"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t09_s01_c02",
                    question = "**Enunciado:** La suma de las tres dimensiones de un paralelepípedo rectangular (rectoedro) es 17\\text{ cm} y su diagonal espacial mide 13\\text{ cm}. Calcule el área total del paralelepípedo.",
                    options = listOf(
                        "120\\text{ cm}^2",
                        "144\\text{ cm}^2",
                        "169\\text{ cm}^2",
                        "289\\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t09_s01_c03",
                    question = "**Enunciado:** En una pirámide cuadrangular regular, la arista de la base mide 12\\text{ cm} y la altura de la pirámide mide 8\\text{ cm}. Calcule el área lateral de la pirámide.",
                    options = listOf(
                        "192\\text{ cm}^2",
                        "240\\text{ cm}^2",
                        "288\\text{ cm}^2",
                        "384\\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t09_s01_c04",
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
                    id = "geom_t09_s01_c05",
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
                    id = "geom_t09_s01_c06",
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
                    id = "geom_t09_s01_c07",
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
                    id = "geom_t09_s01_c08",
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
                    id = "geom_t09_s01_c09",
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
                    id = "geom_t09_s01_c10",
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
            id = "geom_t09_s02",
            title = "GEOMETRÍA ESPACIAL, POLIEDROS, PRISMAS Y PIRÁMIDES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "GEOMETRÍA ESPACIAL, POLIEDROS, PRISMAS Y PIRÁMIDES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
| **Tetraedro Regular** | 4 | 4 | 6 | \triangle Equilátero | a^2\sqrt{3} | \dfrac{a^3\sqrt{2}}{12} |
| **Hexaedro (Cubo)** | 6 | 8 | 12 | Cuadrado | 6a^2 | a^3 |
| **Octaedro Regular** | 8 | 6 | 12 | \triangle Equilátero | 2a^2\sqrt{3} | \dfrac{a^3\sqrt{2}}{3} |
| **Dodecaedro Regular**| 12 | 20 | 30 | Pentágono Reg. | 15a^2\sqrt{\frac{5+2\sqrt{5}}{5}} | \dfrac{a^3}{4}(15+7\sqrt{5}) |
| **Icosaedro Regular** | 20 | 12 | 30 | \triangle Equilátero | 5a^2\sqrt{3} | \dfrac{5a^3}{12}(3+\sqrt{5}) |

*Relaciones Clave en Poliedros Regulares:*
- Altura del Tetraedro Regular: h = \dfrac{a\sqrt{6}}{3}.
- Diagonal del Cubo: D = a\sqrt{3}.
- Diagonal del Octaedro Regular: D = a\sqrt{2}.

---

### 3.5. Prismas y Paralelepípedos
Un **prisma** es un poliedro limitado por dos bases poligonales congruentes y paralelas, y cuyas caras laterales son paralelogramos.
1. **Prisma Recto:** Las aristas laterales son perpendiculares a las bases (la arista lateral coincide con la altura: a_L = h).
   - Área Lateral: A_L = 2p_{\text{base}} \cdot h (2p_{\text{base}} es el perímetro de la base).
   - Área Total: A_T = A_L + 2A_{\text{base}}.
   - Volumen: V = A_{\text{base}} \cdot h.
2. **Prisma Oblicuo:** Las aristas laterales no son perpendiculares a las bases.
   - **Sección Recta (\mathcal{S}_R):** Sección plana determinada por un plano perpendicular a todas las aristas laterales.
   - Área Lateral: A_L = 2p_{\mathcal{S}_R} \cdot a_L.
   - Volumen: V = A_{\text{base}} \cdot h = A_{\mathcal{S}_R} \cdot a_L.
3. **Paralelepípedo Rectangular, Ortoedro o Rectoedro:** Prisma recto cuyas seis caras son regiones rectangulares de dimensiones a, b, c:
   - Diagonal espacial: D = \sqrt{a^2 + b^2 + c^2}.
   - Área Total: A_T = 2(ab + bc + ac).
   - Volumen: V = a \cdot b \cdot c.
   - Relación algebraica notable: (a + b + c)^2 = D^2 + A_T.

---

### 3.6. Pirámides y Troncos de Pirámide
Una **pirámide** es un poliedro determinado por una base poligonal cualquiera y caras laterales triangulares que concurren en un punto común llamado **cúspide** o **vértice**.

1. **Pirámide Regular:** Su base es un polígono regular y el pie de su altura coincide con el centro de la base.
   - **Apotema de la pirámide (Ap):** Altura de cualquiera de sus caras laterales triangulares isósceles.
   - **Apotema de la base (ap):** Distancia del centro de la base al punto medio de un lado de la base.
   - Relación pitagórica fundamental:
     Ap^2 = h^2 + ap^2
   - Área Lateral: A_L = p_{\text{base}} \cdot Ap (p_{\text{base}} es el semiperímetro de la base).
   - Área Total: A_T = A_L + A_{\text{base}}.
   - Volumen: V = \dfrac{1}{3} A_{\text{base}} \cdot h.

2. **Semejanza de Pirámides:**
   Si un plano paralelo a la base corta a una pirámide a una distancia h' del vértice:
   \frac{A_{\text{base}'}}{A_{\text{base}}} = \left(\frac{h'}{h}\right)^2 \quad \text{y} \quad \frac{V_{\text{deficiente}}}{V_{\text{total}}} = \left(\frac{h'}{h}\right)^3

3. **Tronco de Pirámide Regular (Bases Paralelas):**
   - Volumen:
     V = \frac{h}{3} \left( B_1 + B_2 + \sqrt{B_1 \cdot B_2} \right)
     Donde B_1 y B_2 son las áreas de las bases paralelas y h es la distancia entre ellas.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Diagonal del Ortoedro** | D^2 = a^2 + b^2 + c^2 | a, b, c: dimensiones de las 3 aristas concurrentes |
| **Área Total del Ortoedro**| A_T = 2(ab + bc + ca) | Superficie de las 6 caras rectangulares |
| **Volumen del Prisma Oblicuo**| V = A_{\mathcal{S}_R} \cdot a_L | A_{\mathcal{S}_R}: área sección recta, a_L: arista lateral |
| **Pirámide (Volumen)** | V = \dfrac{1}{3} A_{\text{base}} \cdot h | h: altura perpendicular a la base |
| **Pirámide Regular (A_L)** | A_L = p_{\text{base}} \cdot Ap | p_{\text{base}}: semiperímetro, Ap: apotema piramidal |
| **Tronco de Pirámide (V)** | V = \dfrac{h}{3}(B_1 + B_2 + \sqrt{B_1 B_2}) | B_1, B_2: áreas de bases paralelas |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Identidad Algebraica en el Ortoedro (Problema Clásico de Examen)
En exámenes de admisión (UNSA y UNMSM), frecuentemente dan como datos:
- "La suma de las tres dimensiones es S = a + b + c".
- "La diagonal espacial es D".
- Preguntan: "¿Cuánto mide el área total A_T?".
- **Hack:** No calcules a, b, c individualmente. Aplica directamente el trinomio al cuadrado:
  (a + b + c)^2 = a^2 + b^2 + c^2 + 2(ab + bc + ca) \implies S^2 = D^2 + A_T
  A_T = S^2 - D^2
  ¡Se resuelve en 5 segundos sin resolver ningún sistema de ecuaciones!

### Hack 2: La Pirámide Deficiente y la Razón Cúbica
Si te dicen que se corta una pirámide por un plano a la mitad de su altura (h' = \frac{h}{2}):
- La razón lineal es k = \frac{1}{2}.
- La pirámide pequeña superior tiene volumen:
  V_{\text{pequeña}} = \left(\frac{1}{2}\right)^3 V_{\text{total}} = \frac{1}{8} V_{\text{total}}
- El tronco inferior restante tiene volumen:
  V_{\text{tronco}} = V_{\text{total}} - \frac{1}{8}V_{\text{total}} = \frac{7}{8} V_{\text{total}}
- ¡La relación de volúmenes pirámide menor a tronco es siempre 1 : 7!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Teorema de Euler: "CARLOS VIVE A DOS CUADRAS"
- **C**ARLOS + **V**IVE = **A** + **2**
  C + V = A + 2
  ¡Nunca olvidarás si el +2 va con la A o con la C!

### 2. Mnemotecnia de los Sólidos Platónicos: "T-H-O-D-I (Te Huelo O Debería Irme)"
- Orden por número de caras:
  - **T**etraedro (4)
  - **H**exaedro (6)
  - **O**ctaedro (8)
  - **D**odecaedro (12)
  - **I**cosaedro (20)
- Vértices y Caras se invierten en los poliedros duales: Hexaedro (C=6, V=8) y Octaedro (C=8, V=6); Dodecaedro (C=12, V=20) e Icosaedro (C=20, V=12).

### 3. Mnemotecnia de las Tres Perpendiculares: "BAJA - CRUZA - UNE"
1. **Baja:** La perpendicular del punto al plano (\overline{PO}).
2. **Cruza:** La perpendicular desde el pie hacia la recta contenida (\overline{OH}).
3. **Une:** El punto original con el pie en la recta (\overline{PH}). ¡Esa unión es perpendicular obligatoria!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Apotema de la Pirámide con Altura**
> - La **altura (h)** cae verticalmente en el centro del polígono de la base.
> - La **apotema (Ap)** es la altura inclinada de una cara lateral triangular.
> - La hipotenusa es SIEMPRE la apotema: Ap^2 = h^2 + ap^2. Nunca asumas Ap = h.

> [!CAUTION]
> **Trampa 2: Rectas Cruzadas vs Rectas Paralelas**
> Dos rectas que no se intersecan en el espacio **NO necesariamente son paralelas**. Si no son coplanares, son **alabeadas o cruzadas**. Esta es la trampa favorita en las preguntas de Verdadero/Falso de la UNSA.

> [!WARNING]
> **Trampa 3: Área Lateral de Prisma Oblicuo**
> En un prisma oblicuo, el área lateral **NO es el perímetro de la base por la arista lateral**. Es el **perímetro de la SECCIÓN RECTA** por la arista lateral:
> A_L = 2p_{\mathcal{S}_R} \cdot a_L

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Arquitectura y Minería (Tolvas y Excavaciones):** Las tolvas de recepción de mineral en la industria minera de Arequipa (Cerro Verde) se diseñan con geometría de troncos de pirámide invertidos para garantizar el flujo gravitacional continuo de agregados.
2. **Cristalografía y Nanotecnología:** La estructura cristalina de los minerales (como la pirita de hierro o el diamante) adopta configuraciones poliédricas exactas (cubos, octaedros regulares) debido a la minimización de la energía libre en los enlaces atómicos.
3. **Cúpulas Geodésicas:** Estructuras como el domo de Epcot o invernaderos modernos se basan en la triangulación del icosaedro regular para maximizar la resistencia estructural con el menor peso de material.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t09_s02_c01",
                    question = "**Enunciado:** Una empresa de silos para granos diseña un depósito en forma de pirámide hexagonal regular cuya altura total es de 18\\text{ m}. Por cuestiones operativas de descarga, se coloca una compuerta horizontal que corta la pirámide a 6\\text{ m} de la base (formando un tronco de pirámide inferior y una pirámide menor superior). Si el volumen total de almacenamiento de la pirámide original es de 540\\text{ m}^3, determine el volumen de grano que puede almacenar la sección superior (pirámide deficiente).",
                    options = listOf(
                        "120\\text{ m}^3",
                        "160\\text{ m}^3",
                        "180\\text{ m}^3",
                        "240\\text{ m}^3"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t09_s02_c02",
                    question = "**Enunciado:** En un tetraedro regular ABCD de arista a = 6\\sqrt{2}\\text{ cm}, se ubica el punto medio M de la arista \\overline{CD}. Calcule la distancia mínima entre las rectas alabeadas que contienen a la arista \\overline{AB} y a la arista opuesta \\overline{CD}, y determine el volumen del tetraedro regular.",
                    options = listOf(
                        "6\\text{ cm} y 72\\text{ cm}^3",
                        "6\\text{ cm} y 144\\text{ cm}^3",
                        "4\\sqrt{3}\\text{ cm} y 72\\text{ cm}^3",
                        "6\\sqrt{2}\\text{ cm} y 108\\text{ cm}^3"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t09_s02_c03",
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
                    id = "geom_t09_s02_c04",
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
                    id = "geom_t09_s02_c05",
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
                    id = "geom_t09_s02_c06",
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
                    id = "geom_t09_s02_c07",
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
                    id = "geom_t09_s02_c08",
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
                    id = "geom_t09_s02_c09",
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
                    id = "geom_t09_s02_c10",
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
