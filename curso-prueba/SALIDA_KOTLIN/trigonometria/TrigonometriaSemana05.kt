package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t05_s01",
            title = "IDENTIDADES TRIGONOMÉTRICAS FUNDAMENTALES Y AUXILIARES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "IDENTIDADES TRIGONOMÉTRICAS FUNDAMENTALES Y AUXILIARES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Álgebra Trigonométrica |
| **Nivel de Complejidad** | Intermedio a Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.0 a 5.0 horas |
| **Prerrequisitos** | Productos Notables, Factorización, Fracciones Algebraicas y R.T. Básicas |

### Competencias Clave del Prospecto
1. **Dominio de Identidades Pitagóricas, Recíprocas y por Cociente:** Manejar con fluidez las relaciones elementales para cualquier valor admisible de la variable angular.
2. **Uso Estratégico de Identidades Auxiliares:** Aplicar identidades de alta frecuencia (\tan x + \cot x = \sec x \csc x, sumas de potencias pares de senos y cosenos) para simplificar expresiones complejas en segundos.
3. **Resolución de Problemas Condicionales:** Transformar igualdades dadas para despejar expresiones algebraicas avanzadas sin calcular el ángulo.
4. **Eliminación de la Variable Angular:** Deducir relaciones numéricas o geométricas independientes del ángulo a partir de un sistema de ecuaciones trigonométricas.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Identidades Trigonométricas] --> B[Identidades Fundamentales]
    A --> C[Identidades Auxiliares de Combate]
    A --> D[Técnicas de Demostración y Simplificación]
    A --> E[Eliminación del Ángulo]

    B --> B1[Pitagóricas: sen² + cos² = 1, 1+tan²=sec², 1+cot²=csc²]
    B --> B2[Por Cociente: tan = sen/cos, cot = cos/sen]
    B --> B3[Recíprocas: sen·csc=1, cos·sec=1, tan·cot=1]

    C --> C1[Suma a Producto: tan + cot = sec·csc]
    C --> C2[Suma Cuadrática: sec² + csc² = sec²·csc²]
    C --> C3[Potencias Pares: sen⁴ + cos⁴ y sen⁶ + cos⁶]
    C --> C4[Trinomio al Cuadrado: 1 ± sen ± cos²]
    C --> C5[Binomios Conjugados: sec ± tan = p <-> sec ∓ tan = 1/p]

    D --> D1[Paso Universal a Senos y Cosenos]
    D --> D2[Artificio del Conjugado]

    E --> E1[Aislar funciones y aplicar Pitágoras]
    E --> E2[Relaciones algebraicas libres de theta]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición de Identidad Trigonométrica
Una **identidad trigonométrica** es una igualdad que vincula dos o más funciones trigonométricas y que se verifica de manera universal para **todo valor admisible** de la variable angular; es decir, para todos los ángulos donde las funciones involucradas se encuentren matemáticamente definidas en su dominio (\mathbb{R} \setminus \{\text{discontinuidades}\}).

---

### 3.2. Identidades Fundamentales

#### 1. Identidades Pitagóricas
Nacen directamente del Teorema de Pitágoras (x^2 + y^2 = r^2):
1. **Seno y Coseno:**
   \sin^2(x) + \cos^2(x) = 1 \quad (\forall x \in \mathbb{R})
   - *Despejes clave:* \sin^2(x) = 1 - \cos^2(x) = (1 - \cos x)(1 + \cos x)
   - \cos^2(x) = 1 - \sin^2(x) = (1 - \sin x)(1 + \sin x)
2. **Secante y Tangente:**
   1 + \tan^2(x) = \sec^2(x) \iff \sec^2(x) - \tan^2(x) = 1 \quad \left(x \ne (2k+1)\frac{\pi}{2}\right)
   - *Diferencia de cuadrados fundamental:*
     (\sec x - \tan x)(\sec x + \tan x) = 1
     \text{Si } \sec(x) + \tan(x) = p \implies \sec(x) - \tan(x) = \frac{1}{p}
3. **Cosecante y Cotangente:**
   1 + \cot^2(x) = \csc^2(x) \iff \csc^2(x) - \cot^2(x) = 1 \quad (x \ne k\pi)
   - *Diferencia de cuadrados fundamental:*
     (\csc x - \cot x)(\csc x + \cot x) = 1
     \text{Si } \csc(x) + \cot(x) = q \implies \csc(x) - \cot(x) = \frac{1}{q}

#### 2. Identidades por Cociente
1. \tan(x) = \frac{\sin(x)}{\cos(x)} \quad \left(x \ne (2k+1)\frac{\pi}{2}\right)
2. \cot(x) = \frac{\cos(x)}{\sin(x)} \quad (x \ne k\pi)

#### 3. Identidades Recíprocas
1. \sin(x) \cdot \csc(x) = 1 \iff \csc(x) = \frac{1}{\sin(x)} \quad (x \ne k\pi)
2. \cos(x) \cdot \sec(x) = 1 \iff \sec(x) = \frac{1}{\cos(x)} \quad \left(x \ne (2k+1)\frac{\pi}{2}\right)
3. \tan(x) \cdot \cot(x) = 1 \iff \cot(x) = \frac{1}{\tan(x)} \quad \left(x \ne \frac{k\pi}{2}\right)

---

### 3.3. Identidades Auxiliares de Combate Preuniversitario
Las siguientes identidades son demostrables a partir de las fundamentales, pero su memorización es obligatoria para rendir con éxito los exámenes de la UNSA, UNMSM y UNI:


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Tipo de Identidad | Expresión Matemática Rigurosa | Campo de Aplicación |
| :--- | :--- | :--- |
| **Pitagórica Básica** | \sin^2(x) + \cos^2(x) = 1 | Universal en \mathbb{R} |
| **Pitagórica Secante** | \sec^2(x) - \tan^2(x) = 1 | x \ne (2k+1)\frac{\pi}{2} |
| **Pitagórica Cosecante**| \csc^2(x) - \cot^2(x) = 1 | x \ne k\pi |
| **Suma de Tangente y Cot**| \tan(x) + \cot(x) = \sec(x)\csc(x) | Crucial en simplificaciones |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t05_s01_c01",
                    question = "**Enunciado:** Simplifique la siguiente expresión trigonométrica:",
                    options = listOf(
                        "1",
                        "2",
                        "4",
                        "2\\sin x \\cos x"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t05_s01_c02",
                    question = "**Enunciado:** Si se cumple que \\sec(x) + \\tan(x) = 3, determine el valor de \\cos(x).",
                    options = listOf(
                        "\\dfrac{3}{5}",
                        "\\dfrac{4}{5}",
                        "\\dfrac{1}{3}",
                        "\\dfrac{5}{3}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t05_s01_c03",
                    question = "**Enunciado:** Si \\sin(x) + \\cos(x) = \\sqrt{\\dfrac{4}{3}}, calcule el valor de:",
                    options = listOf(
                        "\\dfrac{17}{18}",
                        "\\dfrac{7}{9}",
                        "\\dfrac{5}{6}",
                        "\\dfrac{13}{18}"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t05_s01_c04",
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
                    id = "trig_t05_s01_c05",
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
                    id = "trig_t05_s01_c06",
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
                    id = "trig_t05_s01_c07",
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
                    id = "trig_t05_s01_c08",
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
                    id = "trig_t05_s01_c09",
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
                    id = "trig_t05_s01_c10",
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
            id = "trig_t05_s02",
            title = "IDENTIDADES TRIGONOMÉTRICAS FUNDAMENTALES Y AUXILIARES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "IDENTIDADES TRIGONOMÉTRICAS FUNDAMENTALES Y AUXILIARES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
1. **Suma de Tangente y Cotangente:**
   \tan(x) + \cot(x) = \sec(x) \cdot \csc(x)
   *(Demostración: \frac{\sin x}{\cos x} + \frac{\cos x}{\sin x} = \frac{\sin^2 x + \cos^2 x}{\sin x \cos x} = \frac{1}{\sin x \cos x} = \csc x \sec x).*
2. **Suma de Cuadrados de Secante y Cosecante:**
   \sec^2(x) + \csc^2(x) = \sec^2(x) \cdot \csc^2(x)
3. **Suma de Cuartas Potencias:**
   \sin^4(x) + \cos^4(x) = 1 - 2\sin^2(x)\cos^2(x)
4. **Suma de Sextas Potencias:**
   \sin^6(x) + \cos^6(x) = 1 - 3\sin^2(x)\cos^2(x)
5. **Trinomio Notable de Seno y Coseno al Cuadrado:**
   (1 \pm \sin x \pm \cos x)^2 = 2(1 \pm \sin x)(1 \pm \cos x)
6. **Binomios de Seno y Coseno al Cuadrado:**
   (\sin x \pm \cos x)^2 = 1 \pm 2\sin(x)\cos(x)
7. **Fracciones con Denominador Conjugado:**
   \frac{1}{1 \pm \sin x} = \sec^2(x) \mp \sec(x)\tan(x)
   \frac{1}{1 \pm \cos x} = \csc^2(x) \mp \csc(x)\cot(x)
8. **Identidad de Hermite / Cocientes Especiales:**
   \frac{\sin(x)}{1 \pm \cos(x)} = \frac{1 \mp \cos(x)}{\sin(x)} = \csc(x) \mp \cot(x)
   \frac{\cos(x)}{1 \pm \sin(x)} = \frac{1 \mp \sin(x)}{\cos(x)} = \sec(x) \mp \tan(x)

---

### 3.4. Técnicas Preuniversitarias para Tipos de Problemas

#### 1. Problemas de Simplificación o Demostración:
- **Estrategia Universal:** Cuando no se visualice un camino algebraico obvio, convierte todas las funciones a **senos y cosenos** (\tan \to \frac{\sin}{\cos}, \sec \to \frac{1}{\cos}, etc.).
- **Artificio del Conjugado:** Si aparece en el denominador (1 \pm \sin x) o (1 \pm \cos x), multiplica numerador y denominador por su conjugado para generar \cos^2 x o \sin^2 x en el denominador.

#### 2. Problemas Condicionales:
Si te dan como dato una relación como \sin x + \cos x = n:
- Eleva al cuadrado: (\sin x + \cos x)^2 = n^2 \implies 1 + 2\sin x \cos x = n^2 \implies \sin x \cos x = \frac{n^2 - 1}{2}.
- A partir de este producto, puedes calcular cualquier potencia (\sin^4 x + \cos^4 x, \tan x + \cot x, etc.).

#### 3. Eliminación de la Variable Angular (\theta):
El objetivo es encontrar una relación matemática entre las constantes y parámetros que sea totalmente independiente de \theta.
- Despeja las funciones trigonométricas directas (\sin\theta, \cos\theta o \tan\theta, \sec\theta).
- Aplica una identidad pitagórica (\sin^2\theta + \cos^2\theta = 1 o \sec^2\theta - \tan^2\theta = 1) para hacer desaparecer la variable angular.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Suma Cuadrática Sec/Csc**| \sec^2(x) + \csc^2(x) = \sec^2(x)\csc^2(x) | Convierte suma en producto |
| **Cuartas Potencias** | \sin^4(x) + \cos^4(x) = 1 - 2\sin^2(x)\cos^2(x) | Problemas condicionales |
| **Sextas Potencias** | \sin^6(x) + \cos^6(x) = 1 - 3\sin^2(x)\cos^2(x) | Problemas condicionales |
| **Binomio al Cuadrado** | (\sin x \pm \cos x)^2 = 1 \pm 2\sin(x)\cos(x) | Cálculo de productos |
| **Propiedad Inversa Sec**| \sec(x) + \tan(x) = p \iff \sec(x) - \tan(x) = \dfrac{1}{p}| Sistemas de ecuaciones |
| **Propiedad Inversa Csc**| \csc(x) + \cot(x) = q \iff \csc(x) - \cot(x) = \dfrac{1}{q}| Sistemas de ecuaciones |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Asignación de Valores Angulares Notables (Tabulación Rápida)
En preguntas de opción múltiple donde se pida simplificar una expresión E que es independiente del ángulo:
- Asigna un ángulo notable conveniente donde ninguna función se indetermine (generalmente x = 45^\circ, ya que \sin 45^\circ = \cos 45^\circ = \frac{\sqrt{2}}{2} y \tan 45^\circ = \cot 45^\circ = 1).
- Evalúa el valor numérico de la expresión con x = 45^\circ.
- Compara con las opciones numéricas. ¡El 80% de los problemas de simplificación se resuelven en 30 segundos sin manipular álgebra!
- *Precaución:* No uses x = 0^\circ o x = 90^\circ si la expresión contiene tangentes, cotangentes, secantes o cosecantes en denominadores.

### Hack 2: El Artificio del Cuadrado en la Suma de Seno y Coseno
Siempre que veas la suma o resta \sin x \pm \cos x:
- Ponle una letra auxiliar: S = \sin x + \cos x.
- Al elevar al cuadrado: S^2 = 1 + 2\sin x \cos x.
- El término 2\sin x \cos x es exactamente igual a S^2 - 1.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Suma que se Vuelve Producto: "TAN-COT = SEC-CSC"
- "La **TAN**queta y el **COT**xe se multiplican en **SEC**undaria con **CSC**":
  \tan(x) + \cot(x) = \sec(x) \cdot \csc(x)
  ¡Una suma de dos términos se convierte milagrosamente en un solo producto de factores!

### 2. Mnemotecnia de las Potencias Pares: "EL COEFICIENTE ES LA MITAD MENOS UNO"
- En \sin^{\mathbf{4}} x + \cos^{\mathbf{4}} x \implies 1 - \mathbf{2}\sin^2 x \cos^2 x (el 2 es \frac{4}{2}).
- En \sin^{\mathbf{6}} x + \cos^{\mathbf{6}} x \implies 1 - \mathbf{3}\sin^2 x \cos^2 x (el 3 es \frac{6}{2}).
- ¡Nunca dudarás entre si el coeficiente que resta es 2 o es 3!

### 3. Mnemotecnia de los Pares Conjugados: "SI UNO SUBE, EL OTRO INVIERTE"
- Si \sec x + \tan x = 5 \implies \sec x - \tan x = \frac{1}{5} = 0.2.
- Si sumas ambas ecuaciones: 2\sec x = 5.2 \implies \sec x = 2.6. ¡Hallas cualquier razón en 10 segundos!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo en las Diferencias Pitagóricas**
> - \sec^2(x) - \tan^2(x) = 1 (La secante va primero).
> - Si el examen pone \tan^2(x) - \sec^2(x), el resultado es **-1**.
> - Análogamente: \cot^2(x) - \csc^2(x) = -1. ¡Cuidado con el orden de sustracción!

> [!CAUTION]
> **Trampa 2: La Raíz Cuadrada de un Cuadrado Perfecto**
> \sqrt{\sin^2(x)} = |\sin(x)|, \quad \sqrt{(\sin x - \cos x)^2} = |\sin x - \cos x|
> No elimines la raíz y el cuadrado directamente sin verificar el signo en el cuadrante indicado. Si \cos x > \sin x, |\sin x - \cos x| = \cos x - \sin x.

> [!WARNING]
> **Trampa 3: Cancelación Indebida de Denominadores**
> En ecuaciones condicionales, nunca simplifiques un factor \sin x o \cos x dividiendo a ambos miembros sin antes asegurar que no sea una solución cero (x = 0 o x = \pi), pues eliminarías soluciones legítimas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Compresión de Audio y Transformada Rápida de Fourier (FFT):** Los algoritmos de codificación MP3 y streaming de audio colapsan superposiciones de ondas armónicas utilizando identidades de productos y sumas para reducir la tasa de bits sin degradar la fidelidad acústica.
2. **Gráficos por Computadora y Motores de Videojuegos:** La simplificación de identidades trigonométricas en shaders de tarjetas gráficas (GPU) ahorra millones de ciclos de coma flotante por fotograma al calcular la iluminación especular y reflexiones en tiempo real.
3. **Ingeniería Eléctrica y Factor de Potencia:** En circuitos de corriente alterna, la relación entre potencia activa (P = VI\cos\phi), reactiva (Q = VI\sin\phi) y aparente (S = VI) verifica la relación pitagórica S^2 = P^2 + Q^2.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t05_s02_c01",
                    question = "**Enunciado:** Reduzca la siguiente expresión trigonométrica a su forma más simple:",
                    options = listOf(
                        "\\tan(x)",
                        "\\sec(x)",
                        "\\cot(x)",
                        "\\csc(x)"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t05_s02_c02",
                    question = "**Enunciado:** Elimine la variable angular \\theta a partir del siguiente sistema de ecuaciones trigonométricas:",
                    options = listOf(
                        "a^2 + b^2 = 5",
                        "a^2 + b^2 = 3",
                        "a^2 - b^2 = 5",
                        "a^2 + b^2 = 25"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "trig_t05_s02_c03",
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
                    id = "trig_t05_s02_c04",
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
                    id = "trig_t05_s02_c05",
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
                    id = "trig_t05_s02_c06",
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
                    id = "trig_t05_s02_c07",
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
                    id = "trig_t05_s02_c08",
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
                    id = "trig_t05_s02_c09",
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
                    id = "trig_t05_s02_c10",
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
