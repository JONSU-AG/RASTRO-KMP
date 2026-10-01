package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana12 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t12_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Análisis Funcional y Correspondencia de Conjuntos |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Crítica / Máxima (97%):** Tema vertebral del cálculo preuniversitario, presente como cálculo de dominios/rangos, composición o inversa. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (DECO modelando funciones de oferta-demanda y crecimiento), UNI (Composición con dominios acotados y biyectividad rigurosa). |
| **Competencia Cardinal** | Determinar analíticamente el dominio y rango de funciones reales de variable real, clasificar funciones inyectivas, sobreyectivas y biyectivas, operar el álgebra de funciones, componerlas y hallar su función inversa formal. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    REL["Relaciones Binarias (R ⊆ A × B)"] --> FUNC["Función (f: A → B)"]
    
    FUNC --> COND["Condición de Unicidad: (x, y1) ∈ f ∧ (x, y2) ∈ f ⇒ y1 = y2"]
    FUNC --> DR["Dominio (Dom) y Rango (Ran)"]
    FUNC --> CLAS["Clasificación Funcional"]
    FUNC --> OP["Álgebra y Composición"]
    FUNC --> INV["Función Inversa (f⁻¹)"]
    
    CLAS --> INY["Inyectiva (Univalente: Recta Horizontal)"]
    CLAS --> SOB["Sobreyectiva (Epiyectiva: Ran(f) = B)"]
    CLAS --> BIY["Biyectiva (Inyectiva + Sobreyectiva)"]
    
    OP --> ALG["Operaciones: f ± g, f · g, f / g"]
    OP --> COMP["Composición: (f ∘ g)(x) = f(g(x))"]
    
    INV --> CONDINV["Condición de Existencia: f debe ser BIYECTIVA"]
    INV --> SIM["Simetría respecto a la recta y = x"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA XII: RELACIONES Y FUNCIONES, INYECTIVIDAD, COMPOSICIÓN E INVERSA

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Producto Cartesiano y Relación Binaria
Sean dos conjuntos no vacíos A y B:
- **Par Ordenado:** Ente matemático (a, b) con primer elemento a \in A y segundo elemento b \in B, que verifica:
  (a, b) = (c, d) \iff a = c \quad \land \quad b = d
- **Producto Cartesiano (A \times B):**
  A \times B = \{(a, b) \mid a \in A \land b \in B\}
  \text{Card}(A \times B) = n(A) \cdot n(B)
- **Relación Binaria (R):** Todo subconjunto no vacío del producto cartesiano:
  R \subseteq A \times B

---

### 3.2. Definición Formal de Función
Una **función** f de A en B (denotada f: A \to B) es una relación que satisface el **Principio de Existencia y Unicidad**: a cada elemento del dominio le corresponde **un único** elemento en el codominio.

\forall x \in \text{Dom}(f), \ \exists! \ y \in B \ / \ (x, y) \in f

#### Criterio Analítico de Unicidad:
\text{Si } (x, y_1) \in f \quad \land \quad (x, y_2) \in f \implies y_1 = y_2

#### Criterio Geométrico de la Recta Vertical:
Una gráfica en el plano cartesiano \mathbb{R}^2 corresponde a una función si y solo si **cualquier recta vertical** x = k corta a la gráfica a lo más en **un solo punto**.

---

### 3.3. Dominio y Rango de una Función Real
1. **Dominio (\text{Dom}(f) o Preimagen):** Conjunto de todos los valores reales que puede tomar la variable independiente x para que la función esté bien definida:
   \text{Dom}(f) = \{x \in \mathbb{R} \mid \exists y \in \mathbb{R}, \ y = f(x)\}
   - *Restricciones analíticas obligatorias:*
     - Denominadores no nulos: \frac{P(x)}{Q(x)} \implies Q(x) \neq 0.
     - Radicales de índice par: \sqrt[2n]{A(x)} \implies A(x) \geq 0.
     - Argumentos logarítmicos: \log_b A(x) \implies A(x) > 0 \land b > 0 \land b \neq 1.
2. **Rango (\text{Ran}(f), Recorrido o Imagen):** Conjunto de todos los valores reales que efectivamente toma la variable dependiente y:
   \text{Ran}(f) = \{y \in \mathbb{R} \mid \exists x \in \text{Dom}(f), \ y = f(x)\}

---

### 3.4. Clasificación de Funciones


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Concepto / Teorema | Fórmula Matemática | Propiedad / Condición |
| :--- | :--- | :--- |
| **Unicidad de Función** | (x, y) \in f \land (x, z) \in f \implies y = z | Definición de función |
| **Recta Vertical** | Intersección con vertical \leq 1 punto | Prueba gráfica de función |
| **Inyectividad** | f(a) = f(b) \implies a = b | Recta horizontal \leq 1 punto |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t12_s01_c01",
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
                    id = "alg_t12_s01_c02",
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
                    id = "alg_t12_s01_c03",
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
                    id = "alg_t12_s01_c04",
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
                    id = "alg_t12_s01_c05",
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
                    id = "alg_t12_s01_c06",
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
                    id = "alg_t12_s01_c07",
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
                    id = "alg_t12_s01_c08",
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
                    id = "alg_t12_s01_c09",
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
                    id = "alg_t12_s01_c10",
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
            id = "alg_t12_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### 1. Función Inyectiva (Univalente o "Uno a Uno")
Una función es inyectiva si a elementos distintos del dominio les corresponden imágenes distintas:
f(x_1) = f(x_2) \implies x_1 = x_2 \quad (\forall x_1, x_2 \in \text{Dom}(f))
- **Criterio de la Recta Horizontal:** Toda recta horizontal y = k debe cortar a la gráfica de la función en **a lo más un punto**.
- Toda función estrictamente creciente o estrictamente decreciente es **inyectiva**.

#### 2. Función Sobreyectiva (Suryectiva o Epiyectiva)
Una función f: A \to B es sobreyectiva si todo elemento del conjunto de llegada B (codominio) es imagen de al menos un elemento del dominio:
\text{Ran}(f) = B

#### 3. Función Biyectiva
Una función es **biyectiva** si y solo si es **inyectiva y sobreyectiva simultáneamente**.
- Solo las funciones biyectivas admiten **función inversa**.

---

### 3.5. Álgebra y Composición de Funciones

#### Operaciones con Funciones:
Sean f y g dos funciones reales:
- **Dominio Común:** \text{Dom}(f \pm g) = \text{Dom}(f \cdot g) = \text{Dom}(f) \cap \text{Dom}(g).
- **Cociente:** \text{Dom}\left(\frac{f}{g}\right) = [\text{Dom}(f) \cap \text{Dom}(g)] \setminus \{x \mid g(x) = 0\}.

#### Composición de Funciones ((f \circ g)):
Se define la función compuesta como:
(f \circ g)(x) = f(g(x))
- **Dominio Formal de la Composición:**
  \text{Dom}(f \circ g) = \{x \in \mathbb{R} \mid x \in \text{Dom}(g) \quad \land \quad g(x) \in \text{Dom}(f)\}
- **Propiedad Fundamental:** La composición **NO es conmutativa**:
  f \circ g \not\equiv g \circ f \quad (\text{en el caso general})

---

### 3.6. Función Inversa (f^{-1} o f^*)
Sea f: A \to B una función **biyectiva**. La función inversa f^{-1}: B \to A es aquella que invierte la correspondencia:
y = f(x) \iff x = f^{-1}(y)

#### Propiedades Cardinales:
1. \text{Dom}(f^{-1}) = \text{Ran}(f)
2. \text{Ran}(f^{-1}) = \text{Dom}(f)
3. (f \circ f^{-1})(y) = y \quad \land \quad (f^{-1} \circ f)(x) = x
4. **Simetría Espejo:** La gráfica de f^{-1} es el reflejo simétrico de la gráfica de f respecto a la recta identidad:
   y = x

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Sobreyectividad** | \text{Ran}(f) = \text{Codominio} | Todo el conjunto de llegada cubierto |
| **Biyectividad** | Inyectiva \land Sobreyectiva | Condición para que exista inversa |
| **Dominio Composición** | \text{Dom}(f \circ g) = \{x \in \text{Dom}(g) \mid g(x) \in \text{Dom}(f)\} | Intersección restringida |
| **Función Inversa** | f(f^{-1}(x)) = x | Simétrica respecto a y = x |
| **Dominio e Inversa** | \text{Dom}(f^{-1}) = \text{Ran}(f) \quad \land \quad \text{Ran}(f^{-1}) = \text{Dom}(f) | Cruce de dominios y rangos |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Rango Instantáneo en Funciones Homográficas
Dada una función racional lineal (homográfica):
f(x) = \frac{ax + b}{cx + d}, \quad \text{con } c \neq 0
**¡No despejes x en función de y para analizar el denominador!**
**Hack:**
- Dominio: \text{Dom}(f) = \mathbb{R} \setminus \left\{-\frac{d}{c}\right\} (Asíntota vertical).
- Rango: \text{Ran}(f) = \mathbb{R} \setminus \left\{\frac{a}{c}\right\} (Cociente de coeficientes principales: Asíntota horizontal).
*Ejemplo:* Para f(x) = \frac{4x - 7}{2x + 6} \implies \text{Ran}(f) = \mathbb{R} \setminus \{4/2\} = \mathbb{R} \setminus \{2\}. ¡En 3 segundos!

### Artificio 2: Inversa Rápida de la Función Homográfica
Para f(x) = \frac{ax + b}{cx + d}:
**Hack:** Intercambia las posiciones de a y d cambiándoles de signo a ambos simultáneamente:
f^{-1}(x) = \frac{-dx + b}{cx - a}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Dos Rectas Inquisidoras: "Vertical para Función, Horizontal para Inyectiva"
- **Recta VERTICAL (\mathbf{V}):** ¿Es función o no? \to Si corta dos veces, ¡NO es función!
- **Recta HORIZONTAL (\mathbf{H}):** ¿Tiene inversa o no? \to Si corta dos veces, ¡NO es inyectiva, NO tiene inversa!

### 2. Regla para Inversa: "Despeja x, Bautiza con y"
Para hallar la regla de correspondencia de f^{-1}(x):
1. Escribe y = f(x).
2. Despeja algebraicamente la variable x en términos de y.
3. Intercambia las letras: donde dice x pon f^{-1}(x), y donde dice y pon x.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Dominio de la Composición**
> Si f(x) = x^2 y g(x) = \sqrt{x - 3}.
> Al hacer (f \circ g)(x) = (\sqrt{x - 3})^2 = x - 3.
> Muchos postulantes dicen: *"Como es una recta x - 3, su dominio son todos los reales \mathbb{R}"*. **¡CERO ABSOLUTO!**
> La regla exige que x \in \text{Dom}(g) \implies x \geq 3.
> El dominio real es \text{Dom}(f \circ g) = [3, \ +\infty\rangle.

> [!CAUTION]
> **Trampa 2: La Parábola Completa NO Tiene Inversa**
> Si te dan f(x) = x^2 - 4x + 7 en todo \mathbb{R}, no tiene función inversa porque es una parábola simétrica (la recta horizontal la corta en dos puntos).
> Para que tenga inversa, su dominio debe estar restringido a una de sus dos ramas: x \geq 2 o x \leq 2.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Calibración de Sensores Sísmicos en el Instituto Geofísico de la UNSA
En el monitoreo sismológico de la falla geológica de Tamburco y el volcán Sabancaya, los transductores piezoeléctricos transforman la aceleración del terreno a(t) en una señal de microvoltaje V = f(a). Para reconstruir con exactitud absoluta el desplazamiento real del sismo a partir de la señal eléctrica registrada en el sismograma digital, la función de transducción f debe ser estrictamente **biyectiva**. La aplicación de la función inversa a = f^{-1}(V) permite a los geofísicos arequipeños emitir alertas de tsunami o colapso estructural sin distorsiones matemáticas en tiempo real.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t12_s02_c01",
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
                    id = "alg_t12_s02_c02",
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
                    id = "alg_t12_s02_c03",
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
                    id = "alg_t12_s02_c04",
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
                    id = "alg_t12_s02_c05",
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
                    id = "alg_t12_s02_c06",
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
                    id = "alg_t12_s02_c07",
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
                    id = "alg_t12_s02_c08",
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
                    id = "alg_t12_s02_c09",
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
                    id = "alg_t12_s02_c10",
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
