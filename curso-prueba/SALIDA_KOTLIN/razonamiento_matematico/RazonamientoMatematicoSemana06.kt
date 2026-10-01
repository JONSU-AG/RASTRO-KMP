package razonamiento_matematico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoMatematicoSemana06 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rm_t06_s01",
            title = "PROBABILIDAD INTUITIVA Y CONDICIONAL - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "PROBABILIDAD INTUITIVA Y CONDICIONAL - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Regla de Laplace (casos favorables / casos totales), monedas, dados, barajas de 52 cartas, y extracción de bolas de urnas. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: probabilidad condicional en diagnósticos médicos (falsos positivos/negativos), loterías y probabilidad geométrica. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Teorema de Bayes, probabilidad total, eventos independientes vs. dependientes, y extracciones sucesivas sin reposición. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar, describir y cuantificar el espacio muestral (\Omega) de experimentos aleatorios discretos.
2. Comparar la probabilidad intuitiva de diversos sucesos clasificándolos en seguros, probables, imposibles o equiprobables.
3. Interpretar y aplicar la definición clásica de probabilidad (Regla de Laplace) en contextos cotidianos y técnicos.
4. Calcular probabilidades de eventos compuestos mediante reglas de adición (sucesos mutuamente excluyentes o no excluyentes).
5. Resolver situaciones de extracciones sucesivas con y sin reposición aplicando el principio de la probabilidad condicional.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Experimento Determinístico (Resultado predecible)
        ┌─ 1. Conceptos ───────┼─ Experimento Aleatorio (Regido por el azar)
        │      Fundamentales   ├─ Espacio Muestral (Omega: Conjunto de todos los resultados)
        │                      └─ Suceso o Evento (Subconjunto de Omega: Seguro, Imposible)
        │
PROBABILIDAD                   ┌─ Regla Clásica de Laplace: P(A) = Casos Favorables / Casos Totales
INTUITIVA ──────┼─ 2. Cálculo de ──────┼─ Propiedades Axiomáticas: 0 <= P(A) <= 1
        │      Probabilidades  └─ Probabilidad del Suceso Contrario (Complemento): P(A') = 1 - P(A)
        │
        │                      ┌─ Eventos Mutuamente Excluyentes (P(A U B) = P(A) + P(B))
        ├─ 3. Álgebra de ──────┼─ Eventos No Excluyentes (P(A U B) = P(A) + P(B) - P(A n B))
        │      Sucesos         └─ Eventos Independientes (P(A n B) = P(A) * P(B))
        │
        └─ 4. Probabilidad ────┌─ Probabilidad Condicional: P(A|B) = P(A n B) / P(B)
               Avanzada        ├─ Extracciones en Urnas: Con Reposición vs. Sin Reposición
               y Bayes         └─ Teorema de Probabilidad Total y Teorema de Bayes
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Experimento Aleatorio (\varepsilon), Espacio Muestral (\Omega) y Suceso (A)
* **Experimento Aleatorio (\varepsilon):** Toda prueba o fenómeno cuyo resultado no se puede predecir con exactitud antes de realizarlo, aún conociendo todas las condiciones iniciales (ej. lanzar dos dados y registrar la suma).
* **Espacio Muestral (\Omega):** El conjunto universal formado por **todos los resultados posibles** del experimento aleatorio.
  * *Lanzar dos monedas:* \Omega = \{(C, C), (C, S), (S, C), (S, S)\} \implies n(\Omega) = 2^2 = 4.
  * *Lanzar dos dados:* \Omega = \{(1, 1), (1, 2), \dots, (6, 6)\} \implies n(\Omega) = 6^2 = 36.
* **Suceso o Evento (A):** Cualquier subconjunto del espacio muestral (A \subseteq \Omega).
  * **Suceso Seguro:** A = \Omega \implies P(A) = 1.
  * **Suceso Imposible:** A = \emptyset \implies P(A) = 0.

---

### 3.2 Definición Clásica de Probabilidad (Regla de Laplace)
Si todos los sucesos elementales del espacio muestral \Omega son **equiprobables** (tienen la misma posibilidad física de ocurrir):
P(A) = \frac{n(A)}{n(\Omega)} = \frac{\text{Número de casos favorables al suceso } A}{\text{Número total de casos posibles}}

#### Axiomas Fundamentales de Kolmogorov:
1. Para todo suceso A:
   0 \le P(A) \le 1
2. Probabilidad del espacio muestral completo:
   P(\Omega) = 1

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE EXPERIMENTOS CLÁSICOS

### 4.1 Estructura Oficial de una Baraja Clásica (Naipe Inglés de 52 Cartas)
Indispensable memorizar para preguntas de la UNSA:
* **Total de cartas:** 52 (divididas en 4 palos de 13 cartas cada uno).
* **Palos Negros (26 cartas):** Espadas (\spadesuit) y Tréboles (\clubsuit).
* **Palos Rojos (26 cartas):** Corazones (\heartsuit) y Diamantes (\diamondsuit).
* **Cartas por Palo:** As (A), 2, 3, 4, 5, 6, 7, 8, 9, 10, y las figuras: Jack (J), Reina (Q), Rey (K).
* **Total de Figuras (Con rostro):** 12 cartas (4 \text{ Jacks}, 4 \text{ Reinas}, 4 \text{ Reyes}).
* **Total de Ases:** 4 ases.

### 4.2 Lanzamiento de Dos Dados: Tabla de Sumas (Total = 36 casos)

| Suma | Casos Favorables | Pares Ordenados (D_1, D_2) | Probabilidad |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t06_s01_c01",
                    question = "Al lanzar dos dados comunes y no cargados, ¿cuál es la probabilidad de que la suma de los puntos obtenidos sea un número primo?",
                    options = listOf(
                        "5/12",
                        "7/18",
                        "1/2",
                        "13/36"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t06_s01_c02",
                    question = "En una urna opaca se tienen 6 esferas rojas, 4 esferas azules y 5 esferas verdes. Si se extraen al azar y consecutivamente 2 esferas sin reposición, ¿cuál es la probabilidad de que la primera sea roja y la segunda sea verde?",
                    options = listOf(
                        "1/5",
                        "1/7",
                        "2/15",
                        "3/25"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t06_s01_c03",
                    question = "Un examen de admisión consta de una prueba virtual donde se lanzan 5 monedas equilibradas al aire. Para ganar el pase a la siguiente ronda, un postulante debe obtener al menos una cara. ¿Cuál es la probabilidad de que el postulante logre pasar a la siguiente ronda?",
                    options = listOf(
                        "15/16",
                        "31/32",
                        "7/8",
                        "63/64"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t06_s01_c04",
                    question = "¿Cuál es la probabilidad de que al lanzar dos dados comunes la suma de sus puntos sea 7?",
                    options = listOf(
                        "Siempre está acotada entre 0 y 1 inclusive (0 \\le P(A) \\le 1).",
                        "Equivale al producto directo de sus probabilidades individuales: P(A \\cap B) = P(A) \\cdot P(B).",
                        "Valor o condición no aplicable al caso planteado",
                        "P = \\frac{6}{36} = \\frac{1}{6} (es la suma con mayor cantidad de casos favorables)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: P = \\frac{6}{36} = \\frac{1}{6} (es la suma con mayor cantidad de casos favorables)."
                ),
                Challenge(
                    id = "rm_t06_s01_c05",
                    question = "¿Cuál es el rango de valores posibles para cualquier probabilidad matemática?",
                    options = listOf(
                        "Siempre está acotada entre 0 y 1 inclusive (0 \\le P(A) \\le 1).",
                        "P = \\frac{6}{36} = \\frac{1}{6} (es la suma con mayor cantidad de casos favorables).",
                        "Equivale al producto directo de sus probabilidades individuales: P(A \\cap B) = P(A) \\cdot P(B).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Siempre está acotada entre 0 y 1 inclusive (0 \\le P(A) \\le 1)."
                ),
                Challenge(
                    id = "rm_t06_s01_c06",
                    question = "Si dos eventos A y B son independientes, ¿a qué equivale P(A \\cap B)?",
                    options = listOf(
                        "P = \\frac{6}{36} = \\frac{1}{6} (es la suma con mayor cantidad de casos favorables).",
                        "Equivale al producto directo de sus probabilidades individuales: P(A \\cap B) = P(A) \\cdot P(B).",
                        "Siempre está acotada entre 0 y 1 inclusive (0 \\le P(A) \\le 1).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Equivale al producto directo de sus probabilidades individuales: P(A \\cap B) = P(A) \\cdot P(B)."
                ),
                Challenge(
                    id = "rm_t06_s01_c07",
                    question = "Se lanza una moneda para elegir entre la Urna A (4 blancas, 2 negras) y la Urna B (2 blancas, 4 negras). Si la bola extraída resultó ser blanca, ¿cuál es la probabilidad de que provenga de la Urna A?",
                    options = listOf(
                        "1/3",
                        "1/2",
                        "2/3",
                        "3/4"
                    ),
                    correctIndex = 2,
                    explanation = "Por Bayes: P(A|Blanca) = P(A)P(Blanca|A) / P(Blanca Total). P(Blanca Total) = 1/2(4/6) + 1/2(2/6) = 1/2. Por tanto: (1/2 * 2/3) / (1/2) = 2/3."
                ),
                Challenge(
                    id = "rm_t06_s01_c08",
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
                    id = "rm_t06_s01_c09",
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
                    id = "rm_t06_s01_c10",
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
            id = "rm_t06_s02",
            title = "PROBABILIDAD INTUITIVA Y CONDICIONAL - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "PROBABILIDAD INTUITIVA Y CONDICIONAL - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
3. Probabilidad del suceso imposible:
   P(\emptyset) = 0
4. **Ley del Complemento:**
   P(A^c) = 1 - P(A)

---

### 3.3 Probabilidad de la Unión de Eventos (Regla de la Adición)
1. **Para Eventos Mutuamente Excluyentes (A \cap B = \emptyset):**
   P(A \cup B) = P(A) + P(B)
2. **Para Eventos No Excluyentes (A \cap B \neq \emptyset):**
   P(A \cup B) = P(A) + P(B) - P(A \cap B)

---

### 3.4 Probabilidad Condicional e Independencia
* **Probabilidad Condicional P(A | B):** Probabilidad de que ocurra el evento A sabiendo de antemano que **ya ocurrió** el evento B:
  P(A | B) = \frac{P(A \cap B)}{P(B)}, \quad \text{con } P(B) > 0
* **Eventos Independientes:** La ocurrencia de B no altera la probabilidad de A:
  P(A | B) = P(A) \iff P(A \cap B) = P(A) \cdot P(B)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| :---: | :---: | :--- | :---: |
| **2** | 1 | (1, 1) | 1/36 |
| **3** | 2 | (1, 2), (2, 1) | 2/36 = 1/18 |
| **4** | 3 | (1, 3), (2, 2), (3, 1) | 3/36 = 1/12 |
| **5** | 4 | (1, 4), (2, 3), (3, 2), (4, 1) | 4/36 = 1/9 |
| **6** | 5 | (1, 5), (2, 4), (3, 3), (4, 2), (5, 1) | 5/36 |
| **7** | **6 (Máxima)** | (1, 6), (2, 5), (3, 4), (4, 3), (5, 2), (6, 1) | **6/36 = 1/6** |
| **8** | 5 | (2, 6), (3, 5), (4, 4), (5, 3), (6, 2) | 5/36 |
| **9** | 4 | (3, 6), (4, 5), (5, 4), (6, 3) | 4/36 = 1/9 |
| **10** | 3 | (4, 6), (5, 5), (6, 4) | 3/36 = 1/12 |
| **11** | 2 | (5, 6), (6, 5) | 2/36 = 1/18 |
| **12** | 1 | (6, 6) | 1/36 |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Extracciones Simultáneas vs. Extracciones Sucesivas sin Reposición
Un gran secreto preuniversitario: **Extraer 3 bolas a la vez es matemáticamente idéntico a extraer una bola tras otra sin reposición.**
* Si hay 5 bolas rojas y 3 azules (total 8), la probabilidad de sacar 2 rojas y 1 azul:
  * *Por Combinatoria:* P = \frac{C_2^5 \cdot C_1^3}{C_3^8} = \frac{10 \times 3}{56} = \frac{30}{56} = \frac{15}{28}.
  * *Por Fracciones Rápidas:* \left(\frac{5}{8} \times \frac{4}{7} \times \frac{3}{6}\right) \times 3 = \frac{60}{336} \times 3 = \frac{180}{336} = \frac{15}{28}.
  *(Usa las fracciones si no recuerdas las fórmulas de combinatoria en el examen).*

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: La Pirámide Simétrica del Dado Doble
> Para la suma de dos dados, la cantidad de casos crece de 1 a 6 y luego decrece de 6 a 1:
> **1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1** (para las sumas del 2 al 12).  
> La suma con mayor probabilidad siempre es el **7** (con 6 casos de 36 \implies P = 1/6).

### Mnemotecnia 2: La Estrategia del "1 Menos Nada"
> Cuando el enunciado diga: **"¿Cuál es la probabilidad de obtener AL MENOS un acierto?"**  
> Aplica:
> P(\ge 1) = 1 - P(\text{CERO Aciertos})
> Calcular la probabilidad de fallar todas las veces y restarla de 1 te ahorra sumar 5 probabilidades distintas.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **"Con reposición" vs. "Sin reposición":**
   * *Con reposición:* El tamaño del espacio muestral n(\Omega) no cambia (eventos independientes).
   * *Sin reposición:* En cada paso el total de casos disminuye en 1 (n, n-1, n-2 \dots).
2. ⚠️ **El orden en extracciones de colores distintos:**
   * Si te piden la probabilidad de obtener "una roja y una azul":
   * **El error común:** Calcular solo P(\text{Roja}) \times P(\text{Azul}).
   * **Lo correcto:** Hay dos secuencias válidas: (\text{Roja, Azul}) o (\text{Azul, Roja}). ¡Debes multiplicar por 2!
3. ⚠️ **Probabilidad condicional informal:**
   * *"Si se sabe que la suma de los dados fue mayor que 8, halle la probabilidad de que ambos dados sean iguales..."*
   * Tu nuevo espacio muestral n(\Omega) ya no es 36; solo abarca los casos donde la suma es 9, 10, 11 o 12 (4 + 3 + 2 + 1 = 10 casos).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Control de Calidad en Pruebas Biomédicas (Arequipa)
En un despistaje de tuberculosis en el Hospital Honorio Delgado de Arequipa, se sabe que una prueba rápida tiene una sensibilidad del 95\% (detecta a los enfermos) y una especificidad del 90\% (descarta a los sanos). Si en una población el 2\% tiene la enfermedad:
* Aunque la prueba salga positiva, la probabilidad real de que una persona esté verdaderamente enferma depende del Teorema de Bayes:
  P(\text{Enfermo} | +) = \frac{0.02 \times 0.95}{(0.02 \times 0.95) + (0.98 \times 0.10)} = \frac{0.019}{0.019 + 0.098} = \frac{0.019}{0.117} \approx 16.24\%
* Este cálculo es vital para que los médicos entiendan por qué una prueba positiva requiere confirmación por cultivo.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t06_s02_c01",
                    question = "En una fábrica de calzado en Arequipa se seleccionan al azar a 100 operarios. Se sabe que 60 de ellos son mujeres, 30 son técnicos especializados y 20 son mujeres técnicas especializadas. Si se elige un operario al azar y resulta ser mujer, ¿cuál es la probabilidad de que también sea técnica especializada?",
                    options = listOf(
                        "1/4",
                        "1/3",
                        "1/2",
                        "2/5"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t06_s02_c02",
                    question = "Se tienen dos urnas idénticas en apariencia. La Urna A contiene 4 bolas blancas y 2 negras; la Urna B contiene 2 bolas blancas y 4 negras. Se lanza una moneda equilibrada: si sale cara, se extrae una bola de la Urna A; si sale sello, se extrae una bola de la Urna B. Se realiza el experimento y se constata que la bola extraída es blanca. Calcule la probabilidad de que dicha bola blanca provenga de la Urna A.",
                    options = listOf(
                        "1/3",
                        "1/2",
                        "2/3",
                        "3/4"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t06_s02_c03",
                    question = "¿Cuántas cartas rojas tiene una baraja clásica estándar de naipes?",
                    options = listOf(
                        "Restando de 1 la probabilidad de fallar absolutamente todos los intentos: P(\\ge 1) = 1 - P(\\text{cero aciertos}).",
                        "Valor o condición no aplicable al caso planteado",
                        "Tiene exactamente 26 cartas rojas (13 de corazones y 13 de diamantes).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Tiene exactamente 26 cartas rojas (13 de corazones y 13 de diamantes)."
                ),
                Challenge(
                    id = "rm_t06_s02_c04",
                    question = "¿Cómo se calcula rápidamente la probabilidad de obtener \"al menos un acierto\"?",
                    options = listOf(
                        "Tiene exactamente 26 cartas rojas (13 de corazones y 13 de diamantes).",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Restando de 1 la probabilidad de fallar absolutamente todos los intentos: P(\\ge 1) = 1 - P(\\text{cero aciertos})."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Restando de 1 la probabilidad de fallar absolutamente todos los intentos: P(\\ge 1) = 1 - P(\\text{cero aciertos})."
                ),
                Challenge(
                    id = "rm_t06_s02_c05",
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
                    id = "rm_t06_s02_c06",
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
                    id = "rm_t06_s02_c07",
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
                    id = "rm_t06_s02_c08",
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
                    id = "rm_t06_s02_c09",
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
                    id = "rm_t06_s02_c10",
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
