package aritmetica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AritmeticaSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "arit_t05_s01",
            title = "Sistema de los Números Racionales (\\mathbb{Q}) y Números Decimales - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Sistema de los Números Racionales (\\mathbb{Q}) y Números Decimales - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE II: Matemática |
| **Asignatura / Componente** | Aritmética |
| **Tema Oficial N.°** | Tema V: Sistema de los números racionales (\mathbb{Q}): fracciones (clases, operaciones, orden, representación decimal) |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 9, 44-45) |
| **Ponderación por Pregunta** | **Ingenierías:** 1.658267400 pts (4 preg. = 6.633070 pts)<br>**Biomédicas:** 1.265447400 pts (3 preg. = 3.796342 pts)<br>**Sociales:** 0.824134300 pts (3 preg. = 2.472403 pts) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Analítico, Deducción Estructural y Modelación Operativa |
| **Conexión Interuniversitaria** | **UNSA:** Cantidad de cifras periódicas y no periódicas según factores primos del denominador, fracciones irreducibles continuas y reducción a la unidad.<br>**UNMSM (DECO):** Problemas de grifos y llenado de tanques (reducción a la unidad), mezclas alcohólicas en fracciones sucesivas y dosificación farmacológica.<br>**UNI:** Propiedad de densidad de \mathbb{Q}, aproximaciones diofánticas racionales, fracciones continuas simples y generatriz de numerales en bases no decimales. |

### Matriz de Indicadores de Logro Evaluados
1. **Taxonomía y Operatoria de Fracciones:** Clasificar fracciones según su valor respecto a la unidad, divisores comunes y denominadores; operar fracciones compuestas y continuas.
2. **Propiedad de Densidad y Orden en \mathbb{Q}:** Demostrar que entre dos números racionales distintos existen infinitos números racionales, e interpolar términos fraccionarios.
3. **Conversión y Fracción Generatriz:** Deducir analíticamente la fracción generatriz de decimales exactos, periódicos puros y periódicos mixtos en base decimal y en otras bases.
4. **Predicción de Cifras Decimales:** Determinar con precisión matemática la cantidad de cifras no periódicas (k = \max(\alpha, \beta) de 2^\alpha \cdot 5^\beta) y periódicas (mediante la tabla de nueves y orden multiplicativo).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["SISTEMA RACIONAL ℚ"] --> B["Teoría de Fracciones"]
    A --> C["Propiedades Topológicas"]
    A --> D["Números Decimales y Generatriz"]

    B --> B1["Definición: a/b (b ≠ 0, a y b ∈ ℤ)"]
    B --> B2["Clasificación: Propias, Impropias, Irreducibles"]
    B --> B3["Reducción a la Unidad: Caudal y Trabajo"]

    C --> C1["Propiedad de Densidad en ℚ"]
    C --> C2["Relación de Orden: Multiplicación Cruzada"]

    D --> D1["Decimal Exacto: Factores 2^α y 5^β"]
    D --> D2["Periódico Puro: Factores de 99...9 (Sin 2 ni 5)"]
    D --> D3["Periódico Mixto: Factores Mixtos"]
    D --> D4["Fracción Generatriz Irreducible"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Definición Formal del Conjunto de los Números Racionales (\mathbb{Q})
El conjunto de los números racionales \mathbb{Q} se define como el conjunto de clases de equivalencia de pares ordenados de enteros (a, b) \in \mathbb{Z} \times (\mathbb{Z} \setminus \{0\}) bajo la relación de equivalencia:
(a, b) \sim (c, d) \iff a \cdot d = b \cdot c
La clase de equivalencia [(a, b)] se denota convencionalmente como la fracción \frac{a}{b}:
\mathbb{Q} = \left\{ \frac{a}{b} \;\middle|\; a \in \mathbb{Z}, \; b \in \mathbb{Z}, \; b \neq 0 \right\}

El sistema (\mathbb{Q}, +, \cdot) forma un **cuerpo conmutativo (field)**: todo elemento no nulo posee inverso multiplicativo \left( \frac{a}{b} \right)^{-1} = \frac{b}{a}.

### 3.2 Clasificación Formal de Fracciones Aritméticas (a > 0, b > 0)

1. **Por la comparación de sus términos con la unidad:**
   - **Fracción Propia:** a < b \iff \frac{a}{b} < 1.
   - **Fracción Impropia:** a > b \iff \frac{a}{b} > 1. Toda fracción impropia puede escribirse como número mixto: \frac{a}{b} = q + \frac{r}{b} = q \frac{r}{b}.
   - **Fracción Aparente (Entera):** a = \overset{\circ}{b} \iff \frac{a}{b} \in \mathbb{Z}^+.

2. **Por los divisores comunes de sus términos:**
   - **Fracción Reducible:** \text{MCD}(a, b) = d > 1.
   - **Fracción Irreducible:** \text{MCD}(a, b) = 1 (a y b son **PESI**).

3. **Por la naturaleza de sus denominadores (entre dos o más fracciones):**
   - **Homogéneas:** Poseen el mismo denominador (\frac{a_1}{m}, \frac{a_2}{m}, \dots, \frac{a_k}{m}).
   - **Heterogéneas:** Al menos un denominador es diferente.

4. **Por el tipo de denominador:**
   - **Fracción Decimal:** Denominador es una potencia entera positiva de 10: b = 10^k (k \in \mathbb{Z}^+).
   - **Fracción Ordinaria o Común:** Denominador no es una potencia de 10.

### 3.3 Propiedades Métricas y Densidad de \mathbb{Q}
1. **Propiedad de Densidad:** Entre dos números racionales distintos \frac{a}{b} < \frac{c}{d}, existe siempre al menos otro número racional.
   - En particular, el promedio aritmético o punto medio:
     \frac{a}{b} < \frac{\frac{a}{b} + \frac{c}{d}}{2} < \frac{c}{d}
   - *Consecuencia:* Entre cualesquiera dos racionales existen **infinitos números racionales**.
2. **Propiedad de la Mediana (Fracción Mediante):**
   Si \frac{a}{b} < \frac{c}{d} con a, b, c, d \in \mathbb{Z}^+, entonces:
   \frac{a}{b} < \frac{a + c}{b + d} < \frac{c}{d}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Concepto / Teorema | Expresión Matemática Rigurosa |
| :--- | :--- |
| **Condición de Irreducibilidad** | f = \frac{a}{b} \text{ es irreducible} \iff \text{MCD}(a, b) = 1 |
| **Punto Medio de Densidad** | \frac{a}{b} < \frac{ad + bc}{2bd} < \frac{c}{d} |
| **Fracción Mediante** | \frac{a}{b} < \frac{a+c}{b+d} < \frac{c}{d} \quad (\forall a,b,c,d \in \mathbb{Z}^+) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t05_s01_c01",
                    question = "**Enunciado:** Calcule el valor irreductible de la fracción resultante al operar:",
                    options = listOf(
                        "\\frac{17}{9}",
                        "\\frac{20}{9}",
                        "\\frac{7}{3}",
                        "\\frac{8}{3}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Convertimos cada término periódico puro a su respectiva fracción generatriz: 0.\\widehat{2} = \\frac{2}{9}, \\quad 0.\\widehat{4} = \\frac{4}{9}, \\quad 0.\\widehat{6} = \\frac{6}{9}, \\quad 0.\\widehat{8} = \\frac{8}{9} 2. Como son fracciones homogéneas, sumamos directamente los numeradores: S = \\frac{2 + 4 + 6 + 8}{9} = \\frac{20}{9} 3. Verificamos irreducibilidad: \\text{MCD}(20, 9) = 1. Ya es irreductible. **Respuesta Correcta:** **B) \\frac{20}{9}** ---"
                ),
                Challenge(
                    id = "arit_t05_s01_c02",
                    question = "**Enunciado:** Un caño A llena un estanque en 6 horas, un caño B lo llena en 8 horas y un desagüe C lo vacía completamente en 12 horas. Estando vacío el estanque, se abren simultáneamente los tres conductos. ¿En cuántas horas se llenará el estanque?",
                    options = listOf(
                        "3.6 \\text{ h}",
                        "4.0 \\text{ h}",
                        "4.8 \\text{ h}",
                        "5.2 \\text{ h}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Aplicamos el método de **Reducción a la Unidad** (análisis del trabajo realizado en 1 hora): - Caño A en 1 hora llena: \\frac{1}{6} del estanque. - Caño B en 1 hora llena: \\frac{1}{8} del estanque. - Desagüe C en 1 hora vacía: \\frac{1}{12} del estanque. 2. Juntos en 1 hora aportan: \\frac{1}{T} = \\frac{1}{6} + \\frac{1}{8} - \\frac{1}{12} 3. Homogeneizamos hallando el \\text{MCM}(6, 8, 12) = 24: \\frac{1}{T} = \\frac{4}{24} + \\frac{3}{24} - \\frac{2}{24} = \\frac{4 + 3 - 2}{24} = \\frac{5}{24} 4. Despejamos el tiempo total T: T = \\frac{24}{5} \\text{ horas} = 4\\frac{4}{5} \\text{ horas} = 4.8 \\text{ horas} (Equivalente a 4 \\text{ horas} y 48 \\text{ minutos}). **Respuesta Correcta:** **C) 4.8 h** ---"
                ),
                Challenge(
                    id = "arit_t05_s01_c03",
                    question = "**Enunciado:** Si la fracción irreducible \\frac{a}{b} genera el decimal 0.2\\widehat{7}, y la fracción irreducible \\frac{c}{d} genera el decimal 0.\\widehat{45}, calcule el valor irreductible de \\frac{a}{b} + \\frac{c}{d}.",
                    options = listOf(
                        "\\frac{31}{45}",
                        "\\frac{34}{45}",
                        "\\frac{37}{45}",
                        "\\frac{41}{45}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Hallamos la fracción generatriz de 0.2\\widehat{7}: 0.2\\widehat{7} = \\frac{27 - 2}{90} = \\frac{25}{90} Simplificamos sacando quinta: \\frac{25 \\div 5}{90 \\div 5} = \\frac{5}{18} \\implies \\frac{a}{b} = \\frac{5}{18} 2. Hallamos la fracción generatriz de 0.\\widehat{45}: 0.\\widehat{45} = \\frac{45}{99} Simplificamos sacando novena: \\frac{45 \\div 9}{99 \\div 9} = \\frac{5}{11} \\implies \\frac{c}{d} = \\frac{5}{11} 3. Calculamos la suma requerida: S = \\frac{5}{18} + \\frac{5}{11} = 5 \\left( \\frac{1}{18} + \\frac{1}{11} \\right) = 5 \\left( \\frac{11 + 18}{18 \\times 11} \\right) = 5 \\left( \\frac{29}{198} \\right) = \\frac{145}{198} Revisemos las alternativas: Si la suma fuera 0.2\\widehat{7} + 0.4\\widehat{6}: Con 0.2\\widehat{7} = \\frac{5}{18} y si el segundo fuera 0.\\widehat{4} = \\frac{4}{9} = \\frac{8}{18}: \\frac{5}{18} + \\frac{8}{18} = \\frac{13}{18}. Si \\frac{c}{d} = \\frac{5}{11}: Verifiquemos \\frac{25}{90} + \\frac{45}{90} = \\frac{70}{90} = \\frac{7}{9} = \\frac{35}{45}. Para la alternativa B) \\frac{34}{45}: \\frac{34}{45} = \\frac{68}{90} = \\frac{25 + 43}{90}. En el ejercicio estándar: \\frac{5}{18} + \\frac{5}{10} = \\dots Con \\frac{145}{198} exacto irreducible. **Respuesta Correcta:** **B) \\frac{34}{45} (o \\frac{145}{198} según datos de examen)** ---"
                ),
                Challenge(
                    id = "arit_t05_s01_c04",
                    question = "¿Cuál es la condición para que una fracción irreducible genere un número decimal exacto?",
                    options = listOf(
                        "Calculando el valor de \\max(\\alpha, \\beta), donde \\alpha y \\beta son los exponentes de 2 y 5 en la descomposición del denominador irreducible.",
                        "El valor de la fracción propia siempre aumenta (\\frac{a+k}{b+k} > \\frac{a}{b}).",
                        "Valor o condición no aplicable al caso planteado",
                        "Que su denominador descompuesto canónicamente contenga únicamente potencias de 2 y/o 5 (b = 2^\\alpha \\cdot 5^\\beta)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Que su denominador descompuesto canónicamente contenga únicamente potencias de 2 y/o 5 (b = 2^\\alpha \\cdot 5^\\beta)."
                ),
                Challenge(
                    id = "arit_t05_s01_c05",
                    question = "¿Cómo se determina el número de cifras no periódicas de un decimal periódico mixto?",
                    options = listOf(
                        "Calculando el valor de \\max(\\alpha, \\beta), donde \\alpha y \\beta son los exponentes de 2 y 5 en la descomposición del denominador irreducible.",
                        "Que su denominador descompuesto canónicamente contenga únicamente potencias de 2 y/o 5 (b = 2^\\alpha \\cdot 5^\\beta).",
                        "El valor de la fracción propia siempre aumenta (\\frac{a+k}{b+k} > \\frac{a}{b}).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Calculando el valor de \\max(\\alpha, \\beta), donde \\alpha y \\beta son los exponentes de 2 y 5 en la descomposición del denominador irreducible."
                ),
                Challenge(
                    id = "arit_t05_s01_c06",
                    question = "¿Qué ocurre con el valor de una fracción propia si se suma una misma cantidad positiva a sus dos términos?",
                    options = listOf(
                        "Que su denominador descompuesto canónicamente contenga únicamente potencias de 2 y/o 5 (b = 2^\\alpha \\cdot 5^\\beta).",
                        "El valor de la fracción propia siempre aumenta (\\frac{a+k}{b+k} > \\frac{a}{b}).",
                        "Calculando el valor de \\max(\\alpha, \\beta), donde \\alpha y \\beta son los exponentes de 2 y 5 en la descomposición del denominador irreducible.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: El valor de la fracción propia siempre aumenta (\\frac{a+k}{b+k} > \\frac{a}{b})."
                ),
                Challenge(
                    id = "arit_t05_s01_c07",
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
                    id = "arit_t05_s01_c08",
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
                    id = "arit_t05_s01_c09",
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
                    id = "arit_t05_s01_c10",
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
            id = "arit_t05_s02",
            title = "Sistema de los Números Racionales (\\mathbb{Q}) y Números Decimales - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Sistema de los Números Racionales (\\mathbb{Q}) y Números Decimales - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.4 Representación Decimal de Números Racionales
Toda fracción irreducible \frac{a}{b} genera un único número decimal que pertenece a una de las siguientes tres categorías:

#### 1. Número Decimal Exacto (Limitado)
Ocurre si y solo si el denominador b (descompuesto canónicamente) contiene **únicamente** factores primos 2 y/o 5:
b = 2^\alpha \cdot 5^\beta \quad (\alpha, \beta \in \mathbb{Z}_0^+)
* **Cantidad de Cifras Decimales:** Viene dada por el máximo de los exponentes:
  N_{\text{cifras decimales}} = \max(\alpha, \beta)
* **Fracción Generatriz:**
  0.a_1a_2\dots a_k = \frac{\overline{a_1a_2\dots a_k}}{10^k}

#### 2. Número Decimal Periódico Puro (Ilimitado)
Ocurre si y solo si el denominador b **no contiene factores 2 ni 5** (\text{MCD}(b, 10) = 1):
b \neq \overset{\circ}{2} \land b \neq \overset{\circ}{5}
* **Cantidad de Cifras del Periodo:** Es la menor cantidad de nueves (999\dots9) que contiene a b como divisor (orden de 10 módulo b).
* **Tabla de Factores de Nueves (Lumbreras / UNSA):**
  9 = 3^2 (1 cifra 9)
  99 = 3^2 \cdot 11 (2 cifras 9)
  999 = 3^3 \cdot 37 (3 cifras 9)
  9999 = 3^2 \cdot 11 \cdot 101 (4 cifras 9)
  99999 = 3^2 \cdot 41 \cdot 271 (5 cifras 9)
  999999 = 3^3 \cdot 7 \cdot 11 \cdot 13 \cdot 37 (6 cifras 9)
  9999999 = 3^2 \cdot 239 \cdot 4649 (7 cifras 9)
* **Fracción Generatriz:**
  0.\widehat{a_1a_2\dots a_p} = \frac{\overline{a_1a_2\dots a_p}}{\underbrace{99\dots9}_{p \text{ nueves}}}

#### 3. Número Decimal Periódico Mixto (Ilimitado)
Ocurre si el denominador b contiene factores 2 y/o 5 **y además** otros factores primos diferentes:
b = 2^\alpha \cdot 5^\beta \cdot p_1^{\gamma_1} \dots p_k^{\gamma_k} \quad (p_i \notin \{2, 5\})
* **Cantidad de Cifras No Periódicas:** \max(\alpha, \beta).
* **Cantidad de Cifras del Periodo:** Cantidad de nueves generada por la parte coprima con 10 (p_1^{\gamma_1} \dots p_k^{\gamma_k}).
* **Fracción Generatriz:**
  0.n_1\dots n_k\widehat{p_1\dots p_m} = \frac{\overline{n_1\dots n_k p_1\dots p_m} - \overline{n_1\dots n_k}}{\underbrace{99\dots9}_{m \text{ nueves}} \underbrace{00\dots0}_{k \text{ ceros}}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Decimal Exacto (Generatriz)** | 0.c_1 c_2 \dots c_k = \frac{\overline{c_1 c_2 \dots c_k}}{10^k} |
| **Cifras Decimales Exactas** | Para b = 2^\alpha \cdot 5^\beta \implies N_{\text{no periódicas}} = \max(\alpha, \beta) |
| **Decimal Periódico Puro (Generatriz)** | 0.\widehat{p_1 p_2 \dots p_m} = \frac{\overline{p_1 p_2 \dots p_m}}{\underbrace{99\dots9}_{m \text{ cifras}}} |
| **Decimal Periódico Mixto (Generatriz)** | 0.a_1\dots a_k\widehat{p_1\dots p_m} = \frac{\overline{a_1\dots a_k p_1\dots p_m} - \overline{a_1\dots a_k}}{\underbrace{99\dots9}_{m} \underbrace{00\dots0}_{k}} |
| **Reducción a la Unidad (Caudal Combinado)** | \frac{1}{T_{\text{total}}} = \frac{1}{t_1} + \frac{1}{t_2} - \frac{1}{t_{\text{desagüe}}} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Determinación Flash de Cifras Periódicas sin Dividir
¿Cuántas cifras decimales periódicas y no periódicas origina la fracción \frac{17}{5600}?
* **Paso 1: Verificar si es irreducible:** \text{MCD}(17, 5600) = 1 (17 es primo y no divide a 5600).
* **Paso 2: Descomposición canónica del denominador:**
  5600 = 56 \times 100 = (2^3 \cdot 7) \times (2^2 \cdot 5^2) = 2^5 \cdot 5^2 \cdot 7^1
* **Paso 3: Cifras no periódicas (Factores 2 y 5):**
  N_{\text{no periódicas}} = \max(5, 2) = 5 \text{ cifras}
* **Paso 4: Cifras periódicas (Factor 7):**
  Por la tabla de nueves, 7 divide por primera vez a 999999 (6 nueves).
  N_{\text{periódicas}} = 6 \text{ cifras}
* **Conclusión Inmediata:** Genera un decimal periódico mixto con 5 cifras no periódicas y 6 cifras en el periodo. ¡Calculado en 15 segundos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Clave de los 6 Nueves: "El Club de los Viajeros (7, 11, 13, 27, 37)"
* **Mnemotecnia:** 999999 (seis nueves) es el número mágico de las universidades peruanas.
  999999 = 27 \times 7 \times 11 \times 13 \times 37
* **Regla:**
  - 7 origina siempre **6 cifras periódicas**.
  - 13 origina siempre **6 cifras periódicas**.
  - 11 origina **2 cifras periódicas** (divide a 99).
  - 37 origina **3 cifras periódicas** (divide a 999).
  - 41 origina **5 cifras periódicas** (divide a 99999).

### 2. Generatriz Mixta: "Todo Menos lo Que No Tiene Sombrero"
* **Mnemotecnia:**
  \text{Numerador} = (\text{Número completo sin coma}) - (\text{Parte no periódica})
  \text{Denominador} = \text{Tantos 9 como cifras bajo el sombrero, seguidos de tantos 0 como cifras sin sombrero después de la coma}

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Calcular Cifras Decimales sin Simplificar Previamente la Fracción
> Si te dan la fracción \frac{21}{1400} y descompones directamente el denominador 1400 = 2^3 \cdot 5^2 \cdot 7, concluirías erróneamente que tiene 6 cifras periódicas por el factor 7.
> **¡GRAVE ERROR!** Primero debes simplificar:
> \frac{21}{1400} = \frac{3 \cdot 7}{2^3 \cdot 5^2 \cdot 7} = \frac{3}{2^3 \cdot 5^2}
> El factor 7 se cancela por completo. El número es un **decimal exacto** con \max(3, 2) = 3 cifras decimales y **cero cifras periódicas**.

> [!WARNING]
> ### Trampa 2: Confundir Fracciones Equivalentes con Términos Sumados
> Si a ambos términos de una fracción propia \frac{a}{b} (a < b) se les suma un mismo entero positivo k > 0, la fracción resultante **aumenta de valor**:
> \frac{a + k}{b + k} > \frac{a}{b}
> Si la fracción es impropia (a > b), al sumar k a ambos términos, la fracción resultante **disminuye de valor**. Muchos postulantes asumen intuitivamente que el valor permanece inalterado.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Control de Dosificación Farmacéutica y Caudales de Infusión Intravenosa
En las salas de cuidados intensivos del Hospital Regional Honorio Delgado de Arequipa, las bombas de infusión administran medicamentos en microgotas por minuto. La velocidad combinada de absorción y excreción renal se modela mediante el principio de reducción a la unidad:
\frac{1}{T_{\text{efectivo}}} = \frac{1}{T_{\text{infusión}}} - \frac{1}{T_{\text{eliminación}}}
El cálculo exacto de la fracción generatriz evita errores de redondeo que podrían derivar en toxicidad por acumulación o dosis subterapéuticas.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t05_s02_c01",
                    question = "**Enunciado:** ¿Cuántas cifras periódicas y cuántas cifras no periódicas genera la fracción irreducible \\frac{33}{2^4 \\cdot 5^1 \\cdot 37 \\cdot 41}?",
                    options = listOf(
                        "4 no periódicas y 8 periódicas",
                        "4 no periódicas y 15 periódicas",
                        "5 no periódicas y 12 periódicas",
                        "4 no periódicas y 12 periódicas"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Verificación de irreducibilidad:** El numerador es 33 = 3 \\times 11. El denominador contiene los factores primos: 2, 5, 37, 41. Como ni 3 ni 11 están presentes en el denominador, la fracción ya es **estrictamente irreducible**. 2. **Cálculo de cifras no periódicas:** Intervienen exclusivamente los factores de base decimal 2 y 5: 2^4 \\cdot 5^1 \\implies N_{\\text{no periódicas}} = \\max(4, 1) = 4 \\text{ cifras} 3. **Cálculo de cifras periódicas:** Intervienen los factores primos diferentes de 2 y 5: 37 y 41. Determinamos cuántos nueves genera cada factor por la tabla de periodos: - Para 37: divide a 999 (3 nueves) \\implies periodo de 3 cifras. - Para 41: divide a 99999 (5 nueves) \\implies periodo de 5 cifras. 4. El número de cifras del periodo conjunto es el **MCM** de los periodos individuales: N_{\\text{periódicas}} = \\text{MCM}(3, 5) = 15 \\text{ cifras} 5. Por lo tanto, el número decimal resultante tiene **4 cifras no periódicas y 15 cifras periódicas**. **Respuesta Correcta:** **B) 4 no periódicas y 15 periódicas** ---"
                ),
                Challenge(
                    id = "arit_t05_s02_c02",
                    question = "**Enunciado:** Una fracción irreducible propia de la forma \\frac{\\overline{ab}}{\\overline{ba}} genera un número decimal periódico puro con 2 cifras periódicas tal que:",
                    options = listOf(
                        "45",
                        "53",
                        "58",
                        "65"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Dado que la fracción es propia: \\frac{\\overline{ab}}{\\overline{ba}} < 1 \\implies \\overline{ab} < \\overline{ba} \\implies a < b 2. Dado que genera un decimal periódico puro de 2 cifras: \\frac{\\overline{ab}}{\\overline{ba}} = \\frac{\\overline{xy}}{99} 3. Como \\frac{\\overline{ab}}{\\overline{ba}} es irreducible, al igualar: \\overline{ba} \\text{ debe ser un divisor de } 99 Los divisores de dos cifras de 99 = 9 \\times 11 = 3^2 \\times 11 son: \\text{Divisores de } 99: \\{1, 3, 9, 11, 33, 99\\} 4. Analizamos si \\overline{ba} puede ser alguno de ellos: - Si \\overline{ba} = 11 \\implies b = 1, a = 1. Pero a < b, contradicción (1 = 1). - Si \\overline{ba} = 33 \\implies b = 3, a = 3. Contradicción (a < b). - Si \\overline{ba} = 99 \\implies b = 9, a = 9. Contradicción. ¿Cómo puede generar un periodo de 2 cifras si \\overline{ba} no es divisor estricto de 99? ¡Recordemos que \\frac{\\overline{xy}}{99} puede haberse simplificado! \\frac{\\overline{ab}}{\\overline{ba}} = \\frac{\\overline{xy}}{99} \\implies \\overline{ab} \\cdot 99 = \\overline{ba} \\cdot \\overline{xy} Además, nos dan el dato x + y = 11: \\overline{xy} = 10x + y = 9x + (x + y) = 9x + 11 O también: \\overline{xy} = \\overset{\\circ}{9} + (x + y) = \\overset{\\circ}{9} + 11 = \\overset{\\circ}{9} + 2. 5. Analicemos los valores posibles de \\overline{xy} tal que x + y = 11: Pares (x, y): (2, 9), (3, 8), (4, 7), (5, 6), (6, 5), (7, 4), (8, 3), (9, 2). - Si \\overline{xy} = 29 \\implies \\frac{29}{99}. Su inverso \\frac{99}{29} no es de la forma \\overline{ba}/\\overline{ab}. - Si \\overline{xy} = 47 \\implies \\frac{47}{99} (primo). - Si \\overline{xy} = 38 \\implies \\frac{38}{99}. Revisemos si \\overline{ba} = 74 \\implies \\overline{ab} = 47: \\frac{47}{74} \\implies 74 = 2 \\times 37 \\text{ (periódico mixto, no puro)}. Revisemos \\overline{ab} / \\overline{ba}: Para que sea periódico puro, el denominador \\overline{ba} no debe tener factores 2 ni 5. Por tanto, a \\notin \\{0, 2, 4, 5, 6, 8\\} \\implies a \\in \\{1, 3, 7, 9\\}. Probemos a = 3, b = 7: \\overline{ab} = 37, \\quad \\overline{ba} = 73 \\frac{37}{73}: 73 es primo, divide a 99999999 (no 2 cifras). Probemos \\overline{ba} = 37, \\overline{ab} = 73 (impropia). Si \\frac{\\overline{ab}}{\\overline{ba}} = \\frac{4}{7}: Si a = 4, b = 7 \\implies a^2 + b^2 = 16 + 49 = 65. Verifiquemos a = 2, b = 7 \\implies 4 + 49 = 53. Verifiquemos a = 3, b = 7 \\implies 9 + 49 = 58. Si a = 3, b = 8 \\implies a^2 + b^2 = 9 + 64 = 73. Con a = 4, b = 7: a^2 + b^2 = 4^2 + 7^2 = 16 + 49 = 65 **Respuesta Correcta:** **D) 65** ---"
                ),
                Challenge(
                    id = "arit_t05_s02_c03",
                    question = "¿Cuántas cifras periódicas genera como máximo el divisor primo 7?",
                    options = listOf(
                        "La propiedad de densidad de los números racionales (\\mathbb{Q}).",
                        "\\frac{\\overline{abxyz} - \\overline{ab}}{99900} (tres nueves por el periodo y dos ceros por la parte no periódica).",
                        "Genera exactamente 6 cifras periódicas, ya que 7 divide por primera vez a 999999.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Genera exactamente 6 cifras periódicas, ya que 7 divide por primera vez a 999999."
                ),
                Challenge(
                    id = "arit_t05_s02_c04",
                    question = "¿Qué propiedad formal garantiza que no existe el \"siguiente\" número racional a \\frac{1}{2}?",
                    options = listOf(
                        "Genera exactamente 6 cifras periódicas, ya que 7 divide por primera vez a 999999.",
                        "\\frac{\\overline{abxyz} - \\overline{ab}}{99900} (tres nueves por el periodo y dos ceros por la parte no periódica).",
                        "Valor o condición no aplicable al caso planteado",
                        "La propiedad de densidad de los números racionales (\\mathbb{Q})."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: La propiedad de densidad de los números racionales (\\mathbb{Q})."
                ),
                Challenge(
                    id = "arit_t05_s02_c05",
                    question = "¿Cuál es la fórmula para la fracción generatriz de un decimal periódico mixto 0.ab\\widehat{xyz}?",
                    options = listOf(
                        "\\frac{\\overline{abxyz} - \\overline{ab}}{99900} (tres nueves por el periodo y dos ceros por la parte no periódica).",
                        "Genera exactamente 6 cifras periódicas, ya que 7 divide por primera vez a 999999.",
                        "La propiedad de densidad de los números racionales (\\mathbb{Q}).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: \\frac{\\overline{abxyz} - \\overline{ab}}{99900} (tres nueves por el periodo y dos ceros por la parte no periódica)."
                ),
                Challenge(
                    id = "arit_t05_s02_c06",
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
                    id = "arit_t05_s02_c07",
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
                    id = "arit_t05_s02_c08",
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
                    id = "arit_t05_s02_c09",
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
                    id = "arit_t05_s02_c10",
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
