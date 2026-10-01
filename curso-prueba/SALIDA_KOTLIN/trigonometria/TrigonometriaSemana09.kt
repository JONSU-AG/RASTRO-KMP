package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana09 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t09_s01",
            title = "APLICACIONES GEOMÉTRICAS: ÁNGULOS VERTICALES Y HORIZONTALES (ROSA NÁUTICA) - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "APLICACIONES GEOMÉTRICAS: ÁNGULOS VERTICALES Y HORIZONTALES (ROSA NÁUTICA) - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Trigonometría Aplicada, Topografía y Navegación |
| **Nivel de Complejidad** | Intermedio a Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 3.5 a 4.5 horas |
| **Prerrequisitos** | Razones Trigonométricas de Triángulos Notables, Resolución de Triángulos y Geometría Plana |

### Competencias Clave del Prospecto
1. **Modelación Espacial de Ángulos Verticales:** Representar diagramas precisos que distingan la línea visual, la línea horizontal, el ángulo de elevación, de depresión y el ángulo de observación.
2. **Aplicación de la Fórmula de Doble Observación:** Deducir y calcular alturas de edificaciones o accidentes geográficos mediante dos observaciones sucesivas (d = H(\cot\alpha - \cot\beta)).
3. **Manejo de la Rosa Náutica y Rumbos:** Interpretar direcciones y rumbos estándar (N \; \theta \; E, S \; \phi \; O), azimuts y rumbos colaterales (NE, SO).
4. **Resolución de Problemas DECO de Navegación y Topografía:** Combinar rumbos horizontales con leyes de triángulos oblicuángulos para calcular distancias de separación entre embarcaciones o aeronaves.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Ángulos Verticales y Horizontales] --> B[Ángulos Verticales]
    A --> C[Ángulos Horizontales y Rosa Náutica]
    A --> D[Fórmulas de Doble Observación]
    A --> E[Navegación y Cinemática Triangular]

    B --> B1[Línea Horizontal y Línea Visual]
    B --> B2[Ángulo de Elevación: Objeto Arriba]
    B --> B3[Ángulo de Depresión: Objeto Abajo]
    B --> B4[Ángulo de Observación / Visual]

    C --> C1[Puntos Cardinales: N, S, E, O]
    C --> C2[Rumbo: N/S theta E/O]
    C --> C3[Azimut: Giro Horario desde el Norte 0° a 360°]
    C --> C4[Direcciones Colaterales: NE, SE, SO, NO a 45°]

    D --> D1[Observador en el Suelo: h despreciable]
    D --> D2[Considerando Altura del Observador h]
    D --> D3[Avance hacia la Torre: d = H cot a - cot b]

    E --> E1[Trayectorias con Velocidad y Tiempo]
    E --> E2[Aplicación de Ley de Senos y Cosenos]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Ángulos Verticales
Son aquellos ángulos contenidos en un **plano vertical** que pasa por el punto de observación y el objeto observado.

#### Elementos Fundamentales:
1. **Punto de Observación (O):** Lugar geométrico donde se sitúa el ojo del observador o el instrumento topográfico (teodolito, estación total).
2. **Línea Horizontal (\mathscr{L}_H):** Recta contenida en el plano vertical que pasa por el punto de observación y es estrictamente paralela al horizonte terrestre.
3. **Línea Visual o de Mira (\mathscr{L}_V):** Recta imaginaria trazada desde el punto de observación hacia el objeto que se está observando.
4. **Ángulo de Elevación (\alpha):** Es el ángulo vertical formado por la línea horizontal y la línea visual cuando el objeto se encuentra **POR ENCIMA** de la horizontal (0^\circ < \alpha < 90^\circ).
5. **Ángulo de Depresión (\beta):** Es el ángulo vertical formado por la línea horizontal y la línea visual cuando el objeto se encuentra **POR DEBAJO** de la horizontal (0^\circ < \beta < 90^\circ).
6. **Ángulo de Observación o Ángulo Visual (\theta):** Es el ángulo vertical comprendido entre dos líneas visuales dirigidas a los extremos de un objeto con cierta dimensión vertical (por ejemplo, de la base a la cúspide de una estatua).

*Propiedad de Reciprocidad (Alternos Internos):*
El ángulo de depresión con el que un observador situado en lo alto de un acantilado mira un barco en el mar es **estrictamente igual** al ángulo de elevación con el que un tripulante en dicho barco observa la parte superior del acantilado.

---

### 3.2. Fórmulas de Doble Observación Altimétrica

#### Caso Clásico: Avance en Línea Recta sobre Terreno Horizontal
Un observador divisa la cúspide de una torre de altura H con un ángulo de elevación \alpha. Luego avanza una distancia horizontal d hacia la torre y divisa el mismo punto con un ángulo de elevación \beta (\beta > \alpha):
- Por resolución de triángulos rectángulos:
  - Distancia inicial a la torre: x_1 = H\cot(\alpha)
  - Distancia final a la torre: x_2 = H\cot(\beta)
  - Como d = x_1 - x_2:
    d = H(\cot\alpha - \cot\beta)
- **Despeje de la Altura H de la Torre:**
  H = \frac{d}{\cot(\alpha) - \cot(\beta)}

*Consideración de la Estatura del Observador (h):*
- Si el enunciado **no menciona** la estatura del observador, se considera como un punto en el suelo (h = 0).
- Si el problema **especifica** la estatura del observador (h), la altura total respecto al suelo es:
  H_{\text{total}} = H + h = \frac{d}{\cot\alpha - \cot\beta} + h

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Situación Topográfica / Náutica | Expresión Matemática Rigurosa | Variables y Condiciones |
| :--- | :--- | :--- |
| **Ángulo de Elevación** | \tan(\alpha) = \dfrac{H}{D} | H: altura sobre la horizontal, D: distancia |
| **Ángulo de Depresión** | \tan(\beta) = \dfrac{H_{\text{desnivel}}}{D} | Objeto bajo el nivel del observador |
| **Doble Observación (Distancia)**| d = H(\cot\alpha - \cot\beta) | Avance horizontal d, \beta > \alpha |
| **Doble Observación (Altura)** | H = \dfrac{d}{\cot\alpha - \cot\beta} | Calculada desde el nivel del ojo |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t09_s01_c01",
                    question = "**Enunciado:** Desde un punto en el suelo ubicado a 36\\text{ m} de la base de un edificio, se observa su parte más alta con un ángulo de elevación de 37^\\circ. Calcule la altura del edificio.",
                    options = listOf(
                        "27\\text{ m}",
                        "24\\text{ m}",
                        "30\\text{ m}",
                        "18\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t09_s01_c02",
                    question = "**Enunciado:** Una persona situada en la azotea de un edificio de 40\\text{ m} de altura observa un automóvil estacionado en la calle con un ángulo de depresión de 53^\\circ. ¿A qué distancia de la base del edificio se encuentra el automóvil?",
                    options = listOf(
                        "30\\text{ m}",
                        "25\\text{ m}",
                        "35\\text{ m}",
                        "40\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t09_s01_c03",
                    question = "**Enunciado:** Desde un punto en el suelo se observa la parte superior de una antena de telecomunicaciones con un ángulo de elevación de 30^\\circ. Si el observador camina 40\\text{ m} en línea recta horizontal hacia la base de la antena, el nuevo ángulo de elevación es de 60^\\circ. Calcule la altura de la antena.",
                    options = listOf(
                        "20\\sqrt{3}\\text{ m}",
                        "40\\sqrt{3}\\text{ m}",
                        "30\\text{ m}",
                        "20\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t09_s01_c04",
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
                    id = "trig_t09_s01_c05",
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
                    id = "trig_t09_s01_c06",
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
                    id = "trig_t09_s01_c07",
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
                    id = "trig_t09_s01_c08",
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
                    id = "trig_t09_s01_c09",
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
                    id = "trig_t09_s01_c10",
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
            id = "trig_t09_s02",
            title = "APLICACIONES GEOMÉTRICAS: ÁNGULOS VERTICALES Y HORIZONTALES (ROSA NÁUTICA) - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "APLICACIONES GEOMÉTRICAS: ÁNGULOS VERTICALES Y HORIZONTALES (ROSA NÁUTICA) - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

---

### 3.3. Ángulos Horizontales y Rosa Náutica
Son aquellos ángulos contenidos en el **plano horizontal** y se determinan tomando como referencia los cuatro puntos cardinales universales:
- **Norte (N)** \to 0^\circ o 360^\circ
- **Este (E)** \to 90^\circ
- **Sur (S)** \to 180^\circ
- **Oeste (O o W)** \to 270^\circ

#### 1. Rumbo:
Es la dirección de una línea definida por el ángulo agudo (0^\circ < \theta < 90^\circ) que forma con el eje Norte-Sur, medido hacia el Este o hacia el Oeste.
- **Sintaxis Universal:**
  \text{Polo Referencial (N o S)} \quad \theta^\circ \quad \text{Sentido (E u O)}
  - Ejemplo: N 30^\circ E (Norte 30^\circ hacia el Este).
  - Ejemplo: S 45^\circ O (Sur 45^\circ hacia el Oeste, equivalente a SO).

#### 2. Azimut:
Es el ángulo horizontal medido **exclusivamente en sentido horario** a partir del Norte geográfico (0^\circ \le \text{Azimut} < 360^\circ).
- N 30^\circ E \implies \text{Azimut} = 30^\circ.
- S 30^\circ E \implies \text{Azimut} = 180^\circ - 30^\circ = 150^\circ.
- S 45^\circ O \implies \text{Azimut} = 180^\circ + 45^\circ = 225^\circ.
- N 60^\circ O \implies \text{Azimut} = 360^\circ - 60^\circ = 300^\circ.

#### 3. Direcciones Colaterales y Subcolaterales (Rosa de 32 Rumbos):
- **Principales Colaterales (45^\circ):**
  - Noreste (NE): N 45^\circ E
  - Sureste (SE): S 45^\circ E
  - Suroeste (SO o SW): S 45^\circ O
  - Noroeste (NO o NW): N 45^\circ O
- Cada uno de los 32 rumbos náuticos equivale a una separación angular exacta de:
  \frac{360^\circ}{32} = 11^\circ 15' = 11.25^\circ

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Altura con Estatura** | H_{\text{total}} = \dfrac{d}{\cot\alpha - \cot\beta} + h_{\text{obs}} | h_{\text{obs}}: altura del instrumento |
| **Ángulo Visual (\theta)** | \theta = \alpha - \beta | Vértice en el ojo del observador |
| **Conversión Rumbo a Azimut (I)**| \text{Azimut} = \theta | Para N \;\theta\; E |
| **Conversión Rumbo a Azimut (II)**| \text{Azimut} = 180^\circ - \theta| Para S \;\theta\; E |
| **Conversión Rumbo a Azimut (III)**| \text{Azimut} = 180^\circ + \theta| Para S \;\theta\; O |
| **Conversión Rumbo a Azimut (IV)**| \text{Azimut} = 360^\circ - \theta| Para N \;\theta\; O |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Triángulos Notables en Altimetría
El 90% de los problemas de examen usan ángulos notables complementarios (30^\circ y 60^\circ, o 37^\circ y 53^\circ, o 45^\circ y 60^\circ):
- Si \alpha = 30^\circ y \beta = 60^\circ:
  \cot(30^\circ) = \sqrt{3}, \quad \cot(60^\circ) = \frac{\sqrt{3}}{3} \implies \cot(30^\circ) - \cot(60^\circ) = \frac{2\sqrt{3}}{3}
  d = H \cdot \frac{2\sqrt{3}}{3} \implies H = \frac{d\sqrt{3}}{2}
  ¡Memoriza esta relación: con 30^\circ y 60^\circ, la altura es directamente \frac{d\sqrt{3}}{2} y el avance d es el doble del segmento final!

### Hack 2: Cierre de Trayectorias Náuticas
Cuando un barco viaja al N \;\theta\; E y luego al S \;\phi\; E:
- Dibuja una cruz cartesiana en CADA punto de cambio de rumbo.
- Usa ángulos alternos internos entre paralelas para trasladar los ángulos y encontrar el ángulo interior del triángulo de navegación.
- Aplica directamente la Ley de Cosenos para calcular la distancia en línea recta al punto de partida.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de los Ángulos Verticales: "E-ARRIBA, D-ABAJO"
- **E**levación \to La mirada va hacia **E**l cielo (Arriba de la horizontal).
- **D**epresión \to La mirada va hacia **D**ebajo del suelo (Abajo de la horizontal).
- ¡El ángulo siempre se mide PEGADO a la línea **HORIZONTAL**, jamás pegado a la vertical!

### 2. Mnemotecnia de la Doble Observación: "COTANGENTE MENOR MENOS COTANGENTE MAYOR"
- Recuerda que la cotangente decrece cuando el ángulo crece.
- Por tanto, para que la resta sea positiva:
  d = H(\cot\alpha_{\text{lejano}} - \cot\beta_{\text{cercano}})
  ¡El ángulo lejano (chico) tiene la cotangente grande!

### 3. Mnemotecnia de Rumbos: "SÁNDWICH POLAR"
- La letra del Polo manda primero (N o S), luego va el ángulo, y la última letra es el destino (E u O):
  \textbf{N} \quad [Ángulo] \quad \textbf{E}
  ¡Nunca digas "E 30^\circ N", eso no existe en la nomenclatura náutica formal!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Medir el Ángulo respecto a la Vertical (Cenit/Nadir)**
> El error más destructivo en ángulos verticales es medir el ángulo de elevación o depresión respecto a la torre, poste o pared vertical.
> **LOS ÁNGULOS VERTICALES SE MIDEN SIEMPRE RESPECTO A LA LÍNEA HORIZONTAL**.

> [!CAUTION]
> **Trampa 2: Olvidar la Estatura del Observador**
> Si el enunciado dice: "Un estudiante de 1.70\text{ m} de estatura observa la azotea de un edificio...":
> Al calcular H = D\tan(\alpha), has hallado únicamente la altura **desde el ojo del estudiante hacia arriba**.
> Debes sumar obligatoriamente los 1.70\text{ m} al final:
> H_{\text{edificio}} = D\tan(\alpha) + 1.70\text{ m}

> [!WARNING]
> **Trampa 3: Confundir Rumbos Opuestos**
> Si el móvil A observa a B en la dirección N 40^\circ E:
> El móvil B observa a A en la dirección **diametralmente opuesta**:
> S 40^\circ O
> ¡Cambias N \to S y E \to O, pero el ángulo de 40^\circ se mantiene idéntico!

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Ingeniería Forestal y Silvicultura:** Los guardabosques emplean hipsómetros y clinómetros para calcular la altura comercial de árboles maderables en la Amazonía peruana mediante el método de ángulos de elevación y depresión combinados.
2. **Defensa Antiaérea y Radar Balístico:** Los sistemas de tiro antiaéreo calculan la trayectoria de interceptación de drones o misiles registrando el azimut horizontal y el ángulo de elevación de tiro continuo.
3. **Cartografía de Montaña en Arequipa:** La determinación de la altura de volcanes como el Misti (5822\text{ m}) o el Chachani se realizó históricamente por triangulación geodésica con teodolitos desde la Plaza de Armas de Arequipa mediante doble observación.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t09_s02_c01",
                    question = "**Enunciado:** Una persona de 1.80\\text{ m} de estatura se encuentra parada frente a un poste de alumbrado público que sostiene una luminaria en su extremo superior. La persona observa la luminaria con un ángulo de elevación de 45^\\circ. Si la persona proyecta en el suelo una sombra de 1.20\\text{ m} de longitud producida por dicha luminaria, calcule la altura total del poste de alumbrado.",
                    options = listOf(
                        "4.50\\text{ m}",
                        "3.60\\text{ m}",
                        "5.40\\text{ m}",
                        "4.80\\text{ m}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t09_s02_c02",
                    question = "**Enunciado:** Dos buques de guerra de la Marina de Guerra del Perú parten simultáneamente desde la Base Naval de Ilo. El buque A navega con rumbo N 20^\\circ E a una velocidad constante de 20\\text{ nudos}, mientras que el buque B navega con rumbo S 40^\\circ E a una velocidad constante de 30\\text{ nudos}. Calcule la distancia en millas náuticas que separará a ambos buques al cabo de 2 horas de navegación continua.",
                    options = listOf(
                        "20\\sqrt{19}\\text{ millas}",
                        "40\\sqrt{7}\\text{ millas}",
                        "60\\sqrt{3}\\text{ millas}",
                        "100\\text{ millas}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t09_s02_c03",
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
                    id = "trig_t09_s02_c04",
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
                    id = "trig_t09_s02_c05",
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
                    id = "trig_t09_s02_c06",
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
                    id = "trig_t09_s02_c07",
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
                    id = "trig_t09_s02_c08",
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
                    id = "trig_t09_s02_c09",
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
                    id = "trig_t09_s02_c10",
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
