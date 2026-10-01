package razonamiento_matematico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoMatematicoSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rm_t04_s01",
            title = "RAZONAMIENTO GEOMÉTRICO, ÁREAS Y PERÍMETROS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "RAZONAMIENTO GEOMÉTRICO, ÁREAS Y PERÍMETROS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Áreas sombreadas por traslación de regiones, perímetros con semicircunferencias, conteo de figuras (segmentos, triángulos, cuadriláteros) y simetría. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: áreas de terrenos irregulares, optimización de cercos perimétricos, doblado y corte de papel, vistas ortogonales. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Relaciones de áreas en triángulos mediante razones métricas, geometría fractal elemental, rotaciones espaciales y sólidos de revolución intuitivos. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Desarrollar la visualización espacial para el análisis de figuras bidimensionales y tridimensionales.
2. Identificar y relacionar elementos angulares y de paralelismo en configuraciones geométricas.
3. Analizar perímetros y áreas sombreadas en contextos no directos mediante traslación y compensación.
4. Descomponer y reconfigurar figuras complejas como estrategia sistemática de resolución.
5. Reconocer simetrías (axiales y centrales) y transformaciones rígidas (rotación, traslación).
6. Inferir resultados mediante algoritmos analíticos de conteo de segmentos, regiones y figuras convexas.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Método de Traslación de Regiones Sombreadas
        ┌─ 1. Cálculo de ──────┼─ Método de Diferencia de Áreas (Área Total - Área No Sombreada)
        │      Áreas           ├─ Relaciones de Áreas en Triángulos (Medianas y Baricentro)
        │                      └─ Propiedades en Paralelogramos y Trapecios
        │
RAZONAMIENTO                   ┌─ Definición Rigurosa de Perímetro (Contorno exterior continuo)
GEOMÉTRICO ─────┼─ 2. Perímetros ──────┼─ Perímetros de Curvas y Semicircunferencias Compuestas
        │      y Contornos     └─ Principio de Conservación de Perímetro por Proyección Ortogonal
        │
        │                      ┌─ Conteo por Inducción: Fórmulas n(n+1)/2 (Segmentos, Ángulos)
        ├─ 3. Conteo de ───────┼─ Conteo de Triángulos y Cuadriláteros en Redes
        │      Figuras         └─ Conteo de Cubos y Bloques en Sólidos 3D
        │
        └─ 4. Visualización ───┌─ Simetría Axial (Reflexión respecto a una recta) y Central
               Espacial y      ├─ Doblado, Desdoblado y Perforación de Papel
               Simetría        └─ Vistas Principales (Frontal, Horizontal, Perfil)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Métodos Maestros para el Cálculo de Áreas Sombreadas

#### A. Método de Traslación de Regiones
Consiste en trasladar una o más regiones sombreadas congruentes hacia zonas en blanco, completando figuras geométricas elementales y conocidas (cuadrados, sectores circulares, triángulos).
* **Condición de validez:** Las regiones deben ser rigurosamente simétricas o congruentes.

#### B. Método por Diferencia de Áreas
Cuando la región sombreada tiene forma irregular o no reconocible:
A_{\text{sombreada}} = A_{\text{figura total}} - \sum A_{\text{regiones no sombreadas}}

#### C. Propiedades Clave de Relaciones de Áreas en Triángulos
1. **Propiedad de la Mediana:** La mediana divide al triángulo en dos regiones de **igual área**:
   A_{\triangle ABM} = A_{\triangle MBC} = \frac{A_{\triangle ABC}}{2}
2. **Propiedad del Baricentro (G):** Las 3 medianas dividen al triángulo en **6 triángulos de igual área**:
   S_1 = S_2 = S_3 = S_4 = S_5 = S_6 = \frac{A_{\text{total}}}{6}
   Al unir el baricentro con los tres vértices, se forman 3 triángulos de igual área: \frac{A_{\text{total}}}{3}.
3. **Puntos Medios de los 3 Lados:**
   El triángulo central formado por la unión de los tres puntos medios tiene un área igual a la cuarta parte del total:
   A_{\text{central}} = \frac{A_{\text{total}}}{4}

---

### 3.2 Perímetros: Definición y Propiedades de Proyección

* **Definición Rigurosa:** El perímetro (2p) de una región es la **longitud total de su frontera o contorno exterior**.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE REGIONES SOMBREADAS CLÁSICAS

### Cuadrado de Lado L y sus Configuraciones Típicas de Examen

| Configuración Clásica | Representación Visual | Área Sombreada (A_s) |
| :--- | :--- | :---: |
| **Pétalo Simple (Hojita)** | Cuadrante con dos arcos de radio L trazados desde vértices opuestos | A_s = \frac{L^2}{2} (\pi - 2) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t04_s01_c01",
                    question = "¿Cuántos triángulos hay en total en la siguiente figura?",
                    options = listOf(
                        "15",
                        "18",
                        "21",
                        "24"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t04_s01_c02",
                    question = "En un cuadrado ABCD de 8 \\text{ cm} de lado, se trazan sus dos diagonales y sobre cada lado se toma el punto medio, uniéndolos para formar un nuevo cuadrado interior. Si se sombrean las regiones correspondientes a los dos triángulos superiores del cuadrado interior, calcule el área sombreada.",
                    options = listOf(
                        "8 \\text{ cm}^2",
                        "12 \\text{ cm}^2",
                        "16 \\text{ cm}^2",
                        "20 \\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t04_s01_c03",
                    question = "Un parque ecológico tiene la forma de un rectángulo de 60 \\text{ m} de largo por 40 \\text{ m} de ancho. En cada uno de sus vértices se ha construido un jardín en forma de cuadrante circular de 10 \\text{ m} de radio. Si se desea colocar una cerca protectora únicamente alrededor de la zona recreativa central (la región remanente del rectángulo que excluye los cuatro jardines), ¿cuántos metros lineales de cerco se necesitarán?",
                    options = listOf(
                        "120 + 10\\pi",
                        "120 + 20\\pi",
                        "140 + 20\\pi",
                        "160 + 20\\pi"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t04_s01_c04",
                    question = "¿Cuál es la fórmula para calcular el número de segmentos en una línea con n espacios consecutivos?",
                    options = listOf(
                        "Dividen al triángulo en 6 partes de áreas exactamente iguales a \\frac{A_{\\text{total}}}{6}.",
                        "Equivale exactamente al área del triángulo rectángulo interior (A_{\\triangle} = \\frac{a \\cdot b}{2}).",
                        "Valor o condición no aplicable al caso planteado",
                        "\\text{N.° de Segmentos} = \\frac{n(n + 1)}{2}."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: \\text{N.° de Segmentos} = \\frac{n(n + 1)}{2}."
                ),
                Challenge(
                    id = "rm_t04_s01_c05",
                    question = "¿En cuántas partes de áreas iguales dividen las tres medianas a un triángulo?",
                    options = listOf(
                        "Dividen al triángulo en 6 partes de áreas exactamente iguales a \\frac{A_{\\text{total}}}{6}.",
                        "\\text{N.° de Segmentos} = \\frac{n(n + 1)}{2}.",
                        "Equivale exactamente al área del triángulo rectángulo interior (A_{\\triangle} = \\frac{a \\cdot b}{2}).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Dividen al triángulo en 6 partes de áreas exactamente iguales a \\frac{A_{\\text{total}}}{6}."
                ),
                Challenge(
                    id = "rm_t04_s01_c06",
                    question = "¿A qué equivale el área de las dos Lúnulas de Hipócrates formadas sobre los catetos de un triángulo rectángulo?",
                    options = listOf(
                        "\\text{N.° de Segmentos} = \\frac{n(n + 1)}{2}.",
                        "Equivale exactamente al área del triángulo rectángulo interior (A_{\\triangle} = \\frac{a \\cdot b}{2}).",
                        "Dividen al triángulo en 6 partes de áreas exactamente iguales a \\frac{A_{\\text{total}}}{6}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Equivale exactamente al área del triángulo rectángulo interior (A_{\\triangle} = \\frac{a \\cdot b}{2})."
                ),
                Challenge(
                    id = "rm_t04_s01_c07",
                    question = "En un triángulo de área 72 cm^2, las 3 medianas concurren en el baricentro G. ¿Cuál es el área del triángulo formado por un vértice, el punto medio de un lado adyacente y el baricentro?",
                    options = listOf(
                        "6 cm^2",
                        "8 cm^2",
                        "12 cm^2",
                        "18 cm^2"
                    ),
                    correctIndex = 2,
                    explanation = "Las 3 medianas dividen al triángulo en 6 regiones de áreas idénticas. El área de cada región elemental es 72 / 6 = 12 cm^2."
                ),
                Challenge(
                    id = "rm_t04_s01_c08",
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
                    id = "rm_t04_s01_c09",
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
                    id = "rm_t04_s01_c10",
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
            id = "rm_t04_s02",
            title = "RAZONAMIENTO GEOMÉTRICO, ÁREAS Y PERÍMETROS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "RAZONAMIENTO GEOMÉTRICO, ÁREAS Y PERÍMETROS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Principio de Proyección Ortogonal de Escaleras:**
  Si una figura poligonal tiene forma de escalera con ángulos de 90^\circ:
  \text{Suma de tramos horizontales} = \text{Base total}
  \text{Suma de tramos verticales} = \text{Altura total}
  2p_{\text{escalera}} = 2(\text{Base}) + 2(\text{Altura})
  *(El perímetro es exactamente idéntico al del rectángulo envolvente que lo contiene).*

---

### 3.3 Conteo Analítico de Figuras Geométricas

1. **Conteo de Segmentos:**
   Para una recta con n espacios consecutivos alineados:
   \text{N.° de Segmentos} = \frac{n(n + 1)}{2}
2. **Conteo de Triángulos Alineados desde un Vértice Común:**
   Con n espacios en la base:
   \text{N.° de Triángulos} = \frac{n(n + 1)}{2}
   Si tiene h líneas horizontales o secantes que cortan los lados:
   \text{N.° de Triángulos} = \frac{n(n + 1)}{2} \cdot h
3. **Conteo de Cuadriláteros en una Cuadrícula (m \times n espacios):**
   \text{N.° de Cuadriláteros} = \left[ \frac{m(m + 1)}{2} \right] \cdot \left[ \frac{n(n + 1)}{2} \right]
4. **Conteo de Cuadrados en una Cuadrícula (m \times n):**
   \text{N.° de Cuadrados} = m \cdot n + (m - 1)(n - 1) + (m - 2)(n - 2) + \dots
   *(Hasta que uno de los factores se convierta en 1).*

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cuatro Pétalos (Flor de 4 hojas)** | Cuatro semicircunferencias inscritas en los lados del cuadrado | A_s = \frac{L^2}{2} (\pi - 2) |
| **Círculo Inscrito en Cuadrado** | Círculo de radio r = \frac{L}{2} | A_s = \pi r^2 = \frac{\pi L^2}{4} |
| **Esquinas Remanentes** | Área del cuadrado menos el círculo inscrito | A_s = L^2 \left(1 - \frac{\pi}{4}\right) = \frac{L^2}{4}(4 - \pi) |
| **Lúnulas de Hipócrates** | Triángulo rectángulo de catetos a, b con semicírculos sobre sus lados | A_{\text{lúnulas}} = A_{\triangle} = \frac{a \cdot b}{2} |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Rompecabezas (Corte y Traslación Mental)
En problemas de figuras inscritas donde aparecen diagonales y medianas:
1. Divide el cuadrado en 8 triángulos rectángulos idénticos trazando sus dos diagonales y sus dos ejes de simetría horizontal y vertical.
2. Cuenta cuántos de esos 8 triángulos están sombreados.
3. Si están sombreados 3 triángulos de 8:  
   👉 A_s = \frac{3}{8} L^2. (Evita el cálculo de integrales o trigonometría).

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL TEOREMA DE LA HOJITA"
> **"Pi menos dos, lado al cuadrado sobre dos"**  
> Para el área de una hojita formada por dos cuadrantes en un cuadrado de lado L:
> A_{\text{hoja}} = \frac{L^2}{2}(\pi - 2)
> Si te dan L = 6 \implies A = \frac{36}{2}(\pi - 2) = 18(\pi - 2). ¡Sale en 3 segundos!

### Mnemotecnia 2: Las Lúnulas Mágicas de Hipócrates
> **"La suma de las dos lúnulas es simplemente el triángulo del medio"**  
> No necesitas calcular áreas circulares con \pi; el término \pi se cancela matemáticamente por el Teorema de Pitágoras.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Perímetro de una Región Sombreada NO es solo el contorno exterior si tiene hueco:**
   * Si una región sombreada tiene una perforación circular en el medio, su perímetro total es:
     2p_{\text{total}} = \text{Perímetro Exterior} + \text{Perímetro Interior}
   * *Trampa UNSA:* Muchos postulantes solo calculan el borde exterior y olvidan sumar el contorno del hueco.
2. ⚠️ **Confundir "Conteo de Cuadriláteros" con "Conteo de Cuadrados":**
   * Todo cuadrado es cuadrilátero, pero no todo cuadrilátero es cuadrado.
   * La fórmula \frac{m(m+1)}{2} \cdot \frac{n(n+1)}{2} cuenta **todos los rectángulos y cuadriláteros**.
   * Para contar **cuadrados estrictos**, se debe aplicar el producto decreciente m\cdot n + (m-1)(n-1) + \dots.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Diseño de Fachadas con Baldosas en el Centro Histórico de Arequipa
Un arquitecto diseña losetas decorativas cuadradas de 40 \text{ cm} \times 40 \text{ cm} de piedra sillar para un hotel colonial en Yanahuara. Cada loseta contiene una figura de cuatro pétalos sombreados con resina oscura.
* Lado de la loseta: L = 40 \text{ cm}.
* Área sombreada de resina por loseta:
  A_s = \frac{L^2}{2}(\pi - 2) = \frac{40^2}{2}(3.1416 - 2) = \frac{1600}{2}(1.1416) = 800 \times 1.1416 \approx \mathbf{913.28 \text{ cm}^2}
* Esto permite cotizar con exactitud milimétrica la cantidad de resina requerida por metro cuadrado de fachada.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t04_s02_c01",
                    question = "En un triángulo ABC de área 72 \\text{ cm}^2, se traza la mediana AM. Sobre AM se ubica el punto P tal que AP = 2(PM). Luego se traza el segmento CP y se prolonga hasta cortar al lado AB en el punto Q. Halle el área de la región triangular APQ.",
                    options = listOf(
                        "6 \\text{ cm}^2",
                        "8 \\text{ cm}^2",
                        "12 \\text{ cm}^2",
                        "15 \\text{ cm}^2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t04_s02_c02",
                    question = "Sobre los tres lados de un triángulo rectángulo de catetos a y b e hipotenusa c, se construyen semicírculos exteriores. Luego, el semicírculo construido sobre la hipotenusa c se pliega hacia adentro del triángulo cubriendo parte de él. Demuestre analíticamente y calcule el área total encerrada por las dos lúnulas resultantes en función de los catetos a y b.",
                    options = listOf(
                        "\\frac{a^2 + b^2}{2}",
                        "\\frac{a \\cdot b}{2}",
                        "\\frac{\\pi(a^2 + b^2)}{8}",
                        "\\frac{\\pi \\cdot a \\cdot b}{4}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t04_s02_c03",
                    question = "¿Cuál es la fórmula para el área de una hojita (pétalo) formada por dos cuadrantes en un cuadrado de lado L?",
                    options = listOf(
                        "Sumando el perímetro del contorno exterior MÁS el perímetro del contorno interior del hueco.",
                        "Valor o condición no aplicable al caso planteado",
                        "A_s = \\frac{L^2}{2}(\\pi - 2).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: A_s = \\frac{L^2}{2}(\\pi - 2)."
                ),
                Challenge(
                    id = "rm_t04_s02_c04",
                    question = "Si una región sombreada tiene una perforación o hueco interior, ¿cómo se calcula su perímetro?",
                    options = listOf(
                        "A_s = \\frac{L^2}{2}(\\pi - 2).",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Sumando el perímetro del contorno exterior MÁS el perímetro del contorno interior del hueco."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Sumando el perímetro del contorno exterior MÁS el perímetro del contorno interior del hueco."
                ),
                Challenge(
                    id = "rm_t04_s02_c05",
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
                    id = "rm_t04_s02_c06",
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
                    id = "rm_t04_s02_c07",
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
                    id = "rm_t04_s02_c08",
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
                    id = "rm_t04_s02_c09",
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
                    id = "rm_t04_s02_c10",
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
