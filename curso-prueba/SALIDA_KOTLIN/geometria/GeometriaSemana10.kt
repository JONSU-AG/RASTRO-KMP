package geometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object GeometriaSemana10 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "geom_t10_s01",
            title = "CUERPOS DE REVOLUCIÓN: CILINDRO, CONO Y ESFERA - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "CUERPOS DE REVOLUCIÓN: CILINDRO, CONO Y ESFERA - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Geometría del Espacio y Cuerpos Redondos |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.0 a 5.0 horas |
| **Prerrequisitos** | Circunferencia, Áreas Planas, Triángulos Rectángulos y Geometría del Espacio |

### Competencias Clave del Prospecto
1. **Generación por Rotación:** Comprender y aplicar la generación de sólidos redondos mediante la rotación de figuras planas 360^\circ alrededor de un eje coplanar.
2. **Métrica del Cilindro y Tronco:** Calcular generatrices, áreas laterales, totales y volúmenes de cilindros rectos, equiláteros y troncos de cilindro.
3. **Métrica del Cono y Desarrollo Lateral:** Dominar la relación pitagórica g^2 = h^2 + r^2, el ángulo de desarrollo \theta = \frac{r}{g} \cdot 360^\circ, volúmenes de conos y troncos de cono.
4. **Esfera y Partes Esféricas:** Resolver problemas métricos en casquetes, zonas, husos, cuñas, sectores y segmentos esféricos.
5. **Teoremas de Pappus-Guldin:** Calcular áreas superficiales y volúmenes de sólidos de revolución generados por curvas y regiones planas arbitrarias conociendo su centroide.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Cuerpos de Revolución] --> B[Cilindro Circular Recto]
    A --> C[Cono Circular Recto]
    A --> D[Esfera y Zonas Esféricas]
    A --> E[Teoremas de Pappus-Guldin]

    B --> B1[Generatriz y Radio: h = g]
    B --> B2[Área: AL = 2πrg, AT = 2πr(g+r)]
    B --> B3[Volumen: V = πr²h]
    B --> B4[Cilindro Equilátero y Tronco de Cilindro]

    C --> C1[Pitagórica: g² = h² + r²]
    C --> C2[Desarrollo: θ = 360° · r/g]
    C --> C3[Área y Volumen: V = 1/3 πr²h]
    C --> C4[Tronco de Cono de Revolución]

    D --> D1[Superficie: A = 4πR²]
    D --> D2[Volumen: V = 4/3 πR³]
    D --> D3[Zona y Casquete: A = 2πRh]
    D --> D4[Huso y Cuña Esférica]

    E --> E1[1er Teorema: Área = 2π · ȳ · L]
    E --> E2[2do Teorema: Volumen = 2π · ȳ · A]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición y Generación de Cuerpos de Revolución
Un **sólido o cuerpo de revolución** es aquel generado por la rotación completa (360^\circ o 2\pi\text{ rad}) de una región plana alrededor de una recta coplanar denominada **eje de giro** o revolución.

---

### 3.2. Cilindro Circular Recto (Cilindro de Revolución)
Generado por la rotación de una región rectangular alrededor de uno de sus lados:
- **Radio de la base (r):** Radio del círculo base.
- **Altura (h) y Generatriz (g):** En el cilindro recto, g = h.
- **Desarrollo de la Superficie Lateral:** Es una región rectangular cuyos lados miden 2\pi r (longitud de la circunferencia base) y g (altura).

#### Fórmulas Métricas del Cilindro Recto:
1. **Área Lateral (A_L):**
   A_L = 2\pi r g = 2\pi r h
2. **Área Total (A_T):**
   A_T = A_L + 2A_{\text{base}} = 2\pi r g + 2\pi r^2 = 2\pi r(g + r)
3. **Volumen (V):**
   V = A_{\text{base}} \cdot h = \pi r^2 h

#### Casos Especiales:
- **Cilindro Equilátero:** Su generatriz es igual al diámetro de la base (g = 2r). Su sección axial es un cuadrado de lado 2r.
- **Tronco de Cilindro Recto:** Resulta de cortar un cilindro recto con un plano oblicuo no paralelo a las bases:
  - Generatriz del eje: g_{\text{eje}} = \dfrac{g_{\text{máx}} + g_{\text{mín}}}{2}.
  - Volumen: V = \pi r^2 \cdot g_{\text{eje}} = \pi r^2 \left( \dfrac{g_{\text{máx}} + g_{\text{mín}}}{2} \right).
  - Área Lateral: A_L = 2\pi r \cdot g_{\text{eje}}.

---

### 3.3. Cono Circular Recto (Cono de Revolución)
Generado por la rotación de una región triangular rectangular alrededor de uno de sus catetos:
- **Eje:** Cateto sobre el cual gira (h).
- **Radio de la base (r):** Cateto que barre el círculo de la base.
- **Generatriz (g):** Hipotenusa del triángulo rectángulo generador.
- **Relación Pitagórica Fundamental:**
  g^2 = h^2 + r^2

#### Desarrollo de la Superficie Lateral:
Al abrir y extender la superficie lateral del cono sobre un plano, se obtiene un **sector circular** cuyo radio es la generatriz g y cuya longitud de arco es el perímetro de la base 2\pi r.
- **Ángulo de Desarrollo (\theta^\circ):**
  \frac{\theta^\circ}{360^\circ} = \frac{r}{g} \implies \theta^\circ = \left(\frac{r}{g}\right) \cdot 360^\circ

#### Fórmulas Métricas del Cono Recto:
1. **Área Lateral (A_L):**
   A_L = \pi r g
2. **Área Total (A_T):**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Sólido / Elemento | Área Lateral / Superficie | Volumen | Relación Particular |
| :--- | :--- | :--- | :--- |
| **Cilindro Recto** | A_L = 2\pi r h | V = \pi r^2 h | A_T = 2\pi r(h + r) |
| **Cilindro Equilátero** | A_L = 4\pi r^2 | V = 2\pi r^3 | g = 2r |
| **Tronco de Cilindro**| A_L = 2\pi r \left(\dfrac{g_1 + g_2}{2}\right) | V = \pi r^2 \left(\dfrac{g_1 + g_2}{2}\right) | Eje central promedio |
| **Cono Recto** | A_L = \pi r g | V = \dfrac{1}{3}\pi r^2 h | g^2 = h^2 + r^2 |
| **Desarrollo Cono** | \theta^\circ = \left(\dfrac{r}{g}\right) 360^\circ | — | Sector circular plano |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t10_s01_c01",
                    question = "**Enunciado:** Calcule el volumen de un cono circular recto cuya generatriz mide 10\\text{ cm} y cuyo radio de la base mide 6\\text{ cm}.",
                    options = listOf(
                        "96\\pi\\text{ cm}^3",
                        "48\\pi\\text{ cm}^3",
                        "72\\pi\\text{ cm}^3",
                        "108\\pi\\text{ cm}^3"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t10_s01_c02",
                    question = "**Enunciado:** Un cilindro circular recto de radio R = 4\\text{ cm} contiene agua hasta cierta altura. Se sumerge completamente en él una esfera metálica maciza de radio r = 3\\text{ cm}. ¿Cuántos centímetros se elevará el nivel del agua en el cilindro?",
                    options = listOf(
                        "2.25\\text{ cm}",
                        "2.5\\text{ cm}",
                        "3.0\\text{ cm}",
                        "1.75\\text{ cm}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t10_s01_c03",
                    question = "**Enunciado:** Al desarrollar la superficie lateral de un cono de revolución sobre un plano, se obtiene un sector circular cuyo ángulo central mide 216^\\circ. Si la generatriz del cono mide 15\\text{ cm}, calcule el área total del cono.",
                    options = listOf(
                        "216\\pi\\text{ cm}^2",
                        "135\\pi\\text{ cm}^2",
                        "180\\pi\\text{ cm}^2",
                        "240\\pi\\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t10_s01_c04",
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
                    id = "geom_t10_s01_c05",
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
                    id = "geom_t10_s01_c06",
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
                    id = "geom_t10_s01_c07",
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
                    id = "geom_t10_s01_c08",
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
                    id = "geom_t10_s01_c09",
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
                    id = "geom_t10_s01_c10",
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
            id = "geom_t10_s02",
            title = "CUERPOS DE REVOLUCIÓN: CILINDRO, CONO Y ESFERA - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "CUERPOS DE REVOLUCIÓN: CILINDRO, CONO Y ESFERA - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   A_T = A_L + A_{\text{base}} = \pi r g + \pi r^2 = \pi r(g + r)
3. **Volumen (V):**
   V = \frac{1}{3} \pi r^2 h

#### Casos Especiales y Tronco de Cono:
- **Cono Equilátero:** La generatriz mide igual al diámetro de la base (g = 2r). Su sección axial es un triángulo equilátero. El ángulo de desarrollo de su superficie lateral es exactamente:
  \theta = \left(\frac{r}{2r}\right) \cdot 360^\circ = 180^\circ \quad (\text{una semicircunferencia})
- **Tronco de Cono de Revolución (Bases Paralelas):**
  - Generatriz del tronco: g^2 = h^2 + (R - r)^2.
  - Área Lateral: A_L = \pi g (R + r).
  - Volumen: V = \dfrac{\pi h}{3} (R^2 + r^2 + R \cdot r).

---

### 3.4. Esfera y Elementos Esféricos
Generada por la rotación de un semicírculo alrededor de su diámetro:
- **Superficie Esférica:** Conjunto de todos los puntos del espacio que equidistan de un centro O a una distancia fija R.
  A_{\text{superficie}} = 4\pi R^2
- **Volumen de la Esfera:**
  V_{\text{esfera}} = \frac{4}{3}\pi R^3

#### Partes de la Superficie y Sólidos Esféricos:
1. **Zona Esférica:** Porción de superficie esférica comprendida entre dos planos secantes paralelos.
   A_{\text{zona}} = 2\pi R h \quad (h \text{ es la distancia entre planos})
2. **Casquete Esférico:** Zona esférica con una sola base (el plano corta un extremo).
   A_{\text{casquete}} = 2\pi R h = \pi c^2 \quad (c \text{ es la cuerda trazada desde el polo})
3. **Huso Esférico:** Porción de superficie esférica limitada por dos semicircunferencias máximas con el mismo diámetro:
   A_{\text{huso}} = \frac{\pi R^2 \theta^\circ}{90^\circ}
4. **Cuña Esférica:** Sólido delimitado por un huso esférico y dos semicírculos máximos:
   V_{\text{cuña}} = \frac{\pi R^3 \theta^\circ}{270^\circ}
5. **Sector Esférico:** Sólido generado por un sector circular que rota alrededor de un diámetro exterior al sector:
   V_{\text{sector}} = \frac{2}{3}\pi R^2 h

---

### 3.5. Teoremas de Pappus-Guldin

#### Primer Teorema (Área de Superficie de Revolución)
El área de la superficie generada por una línea plana cuando gira 360^\circ alrededor de un eje coplanar no secante es igual a la longitud de la línea multiplicada por la longitud de la circunferencia descrita por su centroide (centro de gravedad \bar{y}):
A = 2\pi \cdot \bar{y} \cdot L

#### Segundo Teorema (Volumen de Sólido de Revolución)
El volumen del sólido generado por una región plana cerrada cuando gira 360^\circ alrededor de un eje coplanar que no corta a la región es igual al área de la región multiplicada por la longitud de la circunferencia que describe su centroide:
V = 2\pi \cdot \bar{y} \cdot A_{\text{región}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Tronco de Cono** | A_L = \pi g (R + r) | V = \dfrac{\pi h}{3}(R^2 + r^2 + Rr) | Bases circulares paralelas |
| **Esfera Completa** | A = 4\pi R^2 | V = \dfrac{4}{3}\pi R^3 | D = 2R |
| **Casquete Esférico** | A = 2\pi R h = \pi c^2 | — | c: cuerda polar |
| **Cuña Esférica** | A_{\text{huso}} = \dfrac{\pi R^2 \theta^\circ}{90^\circ}| V_{\text{cuña}} = \dfrac{\pi R^3 \theta^\circ}{270^\circ} | \theta^\circ: ángulo diedro |
| **Pappus (Superficie)**| A = 2\pi \bar{y} L | — | L: longitud de la curva |
| **Pappus (Volumen)** | — | V = 2\pi \bar{y} A_{\text{región}} | A_{\text{región}}: área generatriz |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Inscripción de Esfera en un Cilindro Equilátero (Teorema de Arquímedes)
Cuando una esfera de radio R se inscribe perfectamente en un cilindro recto (el cilindro es necesariamente equilátero, con r = R y h = 2R):
1. **Razón de Áreas:**
   \frac{A_{\text{esfera}}}{A_{\text{total cilindro}}} = \frac{4\pi R^2}{2\pi R(2R + R)} = \frac{4\pi R^2}{6\pi R^2} = \frac{2}{3}
2. **Razón de Volúmenes:**
   \frac{V_{\text{esfera}}}{V_{\text{cilindro}}} = \frac{\frac{4}{3}\pi R^3}{\pi R^2(2R)} = \frac{\frac{4}{3}}{2} = \frac{2}{3}
- **Conclusión de Arquímedes:** ¡Tanto el área como el volumen de la esfera son exactamente los \frac{2}{3} del cilindro circunscrito! Si sabes uno, el otro sale por simple multiplicación por \frac{2}{3}.

### Hack 2: Ángulo de Desarrollo en Conos Notables
- Si el cono tiene generatriz g y radio r = \frac{g}{2} (30^\circ - 60^\circ, cono equilátero): \theta = 180^\circ.
- Si r = \frac{g}{4}: \theta = 90^\circ (un cuadrante).
- Si r = \frac{g}{3}: \theta = 120^\circ.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Esfera: "CUATRO CÍRCULOS MÁXIMOS"
- El área de la superficie esférica es exactamente igual al área de **4 círculos máximos**:
  A = 4 \times (\pi R^2) = 4\pi R^2
- El volumen de la esfera es simplemente esa área multiplicada por el radio y dividida entre 3:
  V = \frac{A \cdot R}{3} = \frac{4\pi R^2 \cdot R}{3} = \frac{4}{3}\pi R^3

### 2. Mnemotecnia del Cono: "PI-R-G (El Pirograbador)"
- Para el área lateral del cono: **P**i - **R**adio - **G**eneratriz:
  A_L = \pi \cdot r \cdot g

### 3. Mnemotecnia de Pappus-Guldin: "DOS-PI-Y-COSA"
- Siempre es 2\pi \bar{y} (la trayectoria del centroide) multiplicada por la "cosa" que gira:
  - Si gira una línea (L) \implies da Área: A = 2\pi \bar{y} L.
  - Si gira un área (A) \implies da Volumen: V = 2\pi \bar{y} A.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Tercio en el Volumen del Cono**
> No olvides dividir entre 3 el volumen del cono (V = \frac{1}{3}\pi r^2 h). Es el error más frecuente cuando los estudiantes resuelven bajo presión de tiempo y calculan el volumen del cilindro por descuido.

> [!CAUTION]
> **Trampa 2: Generatriz vs Altura en el Cono**
> En el área lateral del cono interviene la **GENERATRIZ** (A_L = \pi r g), pero en el volumen interviene la **ALTURA** (V = \frac{1}{3}\pi r^2 h). Nunca pongas la generatriz en el volumen ni la altura en el área lateral.

> [!WARNING]
> **Trampa 3: La Distancia \bar{y} en Pappus-Guldin**
> La variable \bar{y} es la distancia perpendicular desde el centro de gravedad (centroide) de la figura **HASTA EL EJE DE GIRO**, no la coordenada de la figura ni la distancia entre vértices.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Tanques de Almacenamiento de Gas (GLP/GNL):** Los tanques esféricos tipo "Hortonsphere" son comunes en refinerías e industrias químicas porque la esfera ofrece la menor área de contención por unidad de volumen y distribuye la presión de manera homogénea sin concentradores de tensión.
2. **Diseño de Tolvas y Silos Cónicos:** En agroindustria y minería, las tolvas troncocónicas canalizan sólidos a granel regulando la velocidad de descarga terminal.
3. **Pistones y Motores de Combustión:** La cilindrada de un motor automotriz es la suma de los volúmenes de revolución de los cilindros recorridos por los pistones entre el punto muerto superior (PMS) y el punto muerto inferior (PMI): V = \frac{\pi D^2}{4} \cdot S \cdot N.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "geom_t10_s02_c01",
                    question = "**Enunciado:** Un cono de helado en forma de cono invertido de radio R = 6\\text{ cm} y altura H = 12\\text{ cm} se llena hasta el borde con crema líquida. Si se introduce una bola esférica de helado de modo que queda tangente a las paredes laterales del cono y su círculo máximo coincide exactamente con la base superior del cono, calcule el volumen de helado que queda fuera del cono (en la semiesfera superior sobresaliente).",
                    options = listOf(
                        "72\\pi\\text{ cm}^3",
                        "144\\pi\\text{ cm}^3",
                        "288\\pi\\text{ cm}^3",
                        "108\\pi\\text{ cm}^3"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t10_s02_c02",
                    question = "**Enunciado:** Un triángulo rectángulo cuyos catetos miden 6\\text{ cm} y 8\\text{ cm} rota 360^\\circ alrededor de una recta coplanar exterior al triángulo, paralela a su hipotenusa y situada a una distancia de 5\\text{ cm} de dicha hipotenusa. Determine el volumen del sólido de revolución generado utilizando el Segundo Teorema de Pappus-Guldin.",
                    options = listOf(
                        "360\\pi\\text{ cm}^3",
                        "384\\pi\\text{ cm}^3",
                        "320\\pi\\text{ cm}^3",
                        "400\\pi\\text{ cm}^3"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "geom_t10_s02_c03",
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
                    id = "geom_t10_s02_c04",
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
                    id = "geom_t10_s02_c05",
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
                    id = "geom_t10_s02_c06",
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
                    id = "geom_t10_s02_c07",
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
                    id = "geom_t10_s02_c08",
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
                    id = "geom_t10_s02_c09",
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
                    id = "geom_t10_s02_c10",
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
