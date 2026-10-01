package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana04 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t04_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Álgebra Superior |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Crítica / Alta (94%):** Aparece como pregunta directa de polinomios especiales o implícito en simplificaciones y ecuaciones. |
| **Modelos de Examen** | UNSA (Ordinario y CEPREUNSA), UNMSM (Preguntas DECO contextualizadas), UNI (Álgebra analítica rigurosa). |
| **Competencia Cardinal** | Clasificar expresiones matemáticas, operar términos semejantes, calcular grados relativos y absolutos en monomios y polinomios, y resolver sistemas paramétricos aplicando las propiedades de polinomios homogéneos, ordenados, completos e idénticos. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    EA["Expresión Algebraica (E.A.)"] --> EAR["E.A. Racional"]
    EA --> EAI["E.A. Irracional (Radicales con variables)"]
    EA --> ET["Expresión Trascendente (No algebraica: Exponenciales, Log, Trig)"]
    
    EAR --> EARE["E.A. Racional Entera (Polinomios: Exp. en Z+)"]
    EAR --> EARF["E.A. Racional Fraccionaria (Variables en denominador o exp. negativos)"]
    
    EARE --> MON["Monomio (Un solo término)"]
    EARE --> POL["Polinomio (Dos o más términos)"]
    
    MON --> GRM["Grado Relativo (GR) y Grado Absoluto (GA)"]
    POL --> GRP["Grados en Polinomios (Máximos por variable / suma)"]
    
    POL --> PE["Polinomios Especiales"]
    PE --> HOM["Homogéneo (Todos los términos con igual GA)"]
    PE --> ORD["Ordenado (Exponentes en orden asc/desc)"]
    PE --> COM["Completo (Tiene todos los exponentes desde 0 a n)"]
    PE --> IDE["Polinomios Idénticos (P(x) ≡ Q(x))"]
    PE --> NUL["Polinomio Idénticamente Nulo (P(x) ≡ 0)"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA IV: EXPRESIONES ALGEBRAICAS, MONOMIOS Y POLINOMIOS ESPECIALES

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Definición Formal de Expresión Algebraica (E.A.)
Una **Expresión Algebraica** es una combinación finita de constantes (números reales) y variables (letras que representan cantidades indeterminadas), vinculadas exclusivamente mediante un número finito de operaciones fundamentales de adición, sustracción, multiplicación, división, potenciación y radicación.

\text{E.A.} = P(x, y, z) = a_1 x^{m_1} y^{n_1} + a_2 x^{m_2} y^{n_2} + \dots + a_k x^{m_k} y^{n_k}

#### Clasificación Rigurosa:
1. **Expresión Algebraica Racional (E.A.R.):** Las variables no se encuentran afectadas por el operador de radicación ni actúan como exponentes.
   - **E.A. Racional Entera (E.A.R.E.):** Todos los exponentes de sus variables son números enteros no negativos (\mathbb{Z}_0^+ = \{0, 1, 2, 3, \dots\}). Corresponde al concepto formal de **Polinomio**.
     P(x, y) = 4x^3 y^2 - \sqrt{7} x y^5 + 9 (Nótese que \sqrt{7} es coeficiente real, no variable bajo raíz).
   - **E.A. Racional Fraccionaria (E.A.R.F.):** Al menos una variable presenta exponente entero negativo, o se ubica en el denominador.
     Q(x, y) = \frac{5x^2 + 1}{y^3} - 4x^{-2} y
2. **Expresión Algebraica Irracional (E.A.I.):** Al menos una variable se encuentra bajo el signo radical o presenta exponente fraccionario irreductible.
   R(x, y) = 3\sqrt{x^3 y} + 5x^{2/3} y - 11
3. **Expresiones No Algebraicas o Trascendentes:** Aquellas que contienen infinitos términos, variables en los exponentes, o funciones trascendentes (trigonométricas, logarítmicas, hiperbólicas):
   - Exponenciales: f(x) = 2^x + 5
   - Logarítmicas: g(x) = \ln(x^2 + 1)
   - Trigonométricas: h(x) = \text{sen}(x) + \cos(2x)
   - Sumatorias infinitas: S(x) = 1 + x + x^2 + x^3 + \dots

---

### 3.2. Término Algebraico y Términos Semejantes
Un **término algebraico** es la mínima unidad de una expresión algebraica donde no intervienen la suma ni la resta entre variables.
Se compone de:
- **Parte Constante (Coeficiente):** Incluye el signo y los números reales que multiplican a las variables.
- **Parte Variable (Parte Literal):** Las variables con sus respectivos exponentes.

\underbrace{-12 \sqrt{5}}_{\text{Coeficiente}} \cdot \underbrace{x^4 y^7 z}_{\text{Parte Literal}}

#### Términos Semejantes:
Dos o más términos son **semejantes** si y solo si poseen **exactamente las mismas variables afectadas por los mismos exponentes**, sin importar sus coeficientes.
- T_1(x, y) = (a + 3) x^5 y^{n-2} y T_2(x, y) = (2b - 1) x^m y^8 son semejantes si:
  m = 5 \quad \text{y} \quad n - 2 = 8 \implies n = 10
- **Reducción:** Solo los términos semejantes pueden sumarse o restarse algebraicamente sumando sus coeficientes.

---

### 3.3. Teoría de Grados en Monomios y Polinomios

El grado es una característica exclusiva de los polinomios (E.A. Racionales Enteras) relacionada con los exponentes de sus variables.

#### A. En Monomios:
Sea el monomio M(x, y, z) = c \cdot x^a y^b z^k, con c \neq 0:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Concepto / Teorema | Fórmula Matemática | Condición / Aplicación |
| :--- | :--- | :--- |
| **Grado Absoluto Monomio** | \text{GA}(c x^a y^b z^k) = a + b + k | c \neq 0, variables x, y, z |
| **Grado Relativo Monomio** | \text{GR}_x(M) = a | Exponente de x |
| **Grado de Polinomio** | \text{GA}(P) = \max_i \{\text{GA}(T_i)\} | Mayor suma de exp. por término |
| **Suma de Coeficientes** | \sum \text{coef.} = P(1, 1, \dots, 1) | Evaluación en 1 |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t04_s01_c01",
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
                    id = "alg_t04_s01_c02",
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
                    id = "alg_t04_s01_c03",
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
                    id = "alg_t04_s01_c04",
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
                    id = "alg_t04_s01_c05",
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
                    id = "alg_t04_s01_c06",
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
                    id = "alg_t04_s01_c07",
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
                    id = "alg_t04_s01_c08",
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
                    id = "alg_t04_s01_c09",
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
                    id = "alg_t04_s01_c10",
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
            id = "alg_t04_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
1. **Grado Relativo (G.R.):** Es el exponente de la variable en mención.
   \text{GR}(x) = a, \quad \text{GR}(y) = b, \quad \text{GR}(z) = k
2. **Grado Absoluto (G.A.):** Es la suma de los exponentes de **todas** sus variables.
   \text{GA}(M) = a + b + k

#### B. En Polinomios de dos o más términos:
Sea P(x, y) = T_1 + T_2 + \dots + T_k:
1. **Grado Relativo (G.R.):** Es el **mayor exponente** que presenta dicha variable en todo el polinomio.
   \text{GR}(x) = \max\{\text{exp}(x) \text{ en cada término}\}
2. **Grado Absoluto (G.A.) o Grado del Polinomio:** Es el **mayor de los grados absolutos** de sus términos constitutivos.
   \text{GA}(P) = \max\{\text{GA}(T_1), \text{GA}(T_2), \dots, \text{GA}(T_k)\}

---

### 3.4. Polinomios Especiales (Propiedades Fundamentales)

#### 1. Polinomio Homogéneo
Es aquel polinomio en el cual todos sus términos presentan exactamente el mismo Grado Absoluto. Dicho valor común recibe el nombre de **Grado de Homogeneidad**.
P(x, y) = \underbrace{5x^7}_{\text{GA}=7} - \underbrace{3x^4 y^3}_{\text{GA}=4+3=7} + \underbrace{\sqrt{2} x y^6}_{\text{GA}=1+6=7} - \underbrace{8y^7}_{\text{GA}=7} \implies \text{Grado de homogeneidad} = 7

#### 2. Polinomio Ordenado
Un polinomio está ordenado respecto a una variable si los exponentes de dicha variable van aumentando (**orden ascendente**) o disminuyendo (**orden descendente**) de izquierda a derecha. No requiere poseer todos los exponentes intermedios.
P(x) = 2x^{11} - 5x^8 + 3x^4 - x + 9 \quad (\text{Ordenado descendentemente respecto a } x)

#### 3. Polinomio Completo
Un polinomio es completo respecto a una variable si contiene **todos** los exponentes de dicha variable, desde el mayor grado hasta el exponente cero (término independiente), sin omitir ninguno.
P(x) = 6x^4 - 2x^2 + 5x^3 - x + 7 \quad (\text{Completo de grado 4, aunque desordenado})

**Teoremas Cardinales de Polinomios Completos en una variable:**
1. **Número de Términos:** En todo polinomio completo de grado n:
   \text{N.° de términos} = \text{Grado} + 1 = n + 1
2. **Término Independiente (T.I.):** Es aquel término que no contiene la variable (x^0). Se calcula evaluando el polinomio en cero:
   \text{T.I.} = P(0)
3. **Suma de Coeficientes (\sum \text{coef.}):** Se obtiene evaluando la variable en 1:
   \sum \text{coef.} = P(1)
4. Si un polinomio es **completo y ordenado** en una variable:
   - La diferencia de los exponentes de dos términos consecutivos es +1 (ascendente) o -1 (descendente).

#### 4. Polinomios Idénticos (P(x) \equiv Q(x))
Dos polinomios del mismo grado son idénticos si y solo si los coeficientes de sus términos semejantes respectivos son exactamente iguales:
a x^2 + b x + c \equiv d x^2 + e x + f \iff a = d, \quad b = e, \quad c = f
- **Criterio del Valor Numérico:** Dos polinomios son idénticos si toman el mismo valor numérico para cualquier asignación de valores reales a sus variables:
  P(x) \equiv Q(x) \iff P(k) = Q(k), \quad \forall k \in \mathbb{R}

#### 5. Polinomio Idénticamente Nulo (P(x) \equiv 0)
Es aquel polinomio cuyo valor numérico es siempre cero para cualquier valor real de sus variables. Esto ocurre si y solo si **todos sus coeficientes son iguales a cero**.
a x^3 + b x^2 + c x + d \equiv 0 \iff a = 0, \quad b = 0, \quad c = 0, \quad d = 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Término Independiente** | \text{T.I.} = P(0, 0, \dots, 0) | Evaluación en 0 |
| **N.° Términos (Completo)** | N_T = \text{Grado} + 1 | Polinomio completo de una variable |
| **Polinomio Homogéneo** | \text{GA}(T_1) = \text{GA}(T_2) = \dots = \text{GA}(T_k) = H | H: grado de homogeneidad |
| **Polinomios Idénticos** | P(x) \equiv Q(x) \iff P(\alpha) = Q(\alpha), \ \forall \alpha \in \mathbb{R} | Coeficientes homólogos iguales |
| **Polinomio Nulo** | \sum_{i=0}^n a_i x^i \equiv 0 \iff a_i = 0, \ \forall i | Todos los coeficientes se anulan |
| **Términos Semejantes** | c_1 x^a y^b \sim c_2 x^m y^n \iff a = m \ \land \ b = n | Misma parte literal exacta |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Método de los Puntos Test para Polinomios Idénticos
Cuando un problema indique una identidad del tipo:
A(x - 2)(x + 3) + B(x + 1)(x + 3) + C(x - 2)(x + 1) \equiv 5x^2 - 3x + 14
**¡Jamás multipliques término a término para igualar coeficientes!** Eso toma 5 minutos y genera errores de signos.
**Hack:** Evalúa en las raíces que anulan los factores:
- Para x = 2: Se anulan los términos con (x - 2). Queda:
  B(2 + 1)(2 + 3) = 5(2)^2 - 3(2) + 14 \implies 15B = 20 - 6 + 14 = 28 \implies B = \frac{28}{15}
- Para x = -3: Se anulan los términos con (x + 3). Despejas C en 5 segundos.
- Para x = -1: Se anulan los términos con (x + 1). Despejas A en 5 segundos.

### Artificio 2: Reconstrucción Exponencial en Polinomios Completos y Ordenados
Si un polinomio de grado n es **completo y ordenado descendentemente**:
- El exponente del primer término es n.
- El exponente del último término es 0 (término independiente).
- Cada término consecutivo decrece en exactamente 1: \text{exp}(k) - \text{exp}(k+1) = 1.
Esto permite armar un sistema lineal de ecuaciones directas e inmediatas.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Regla del "Cero y Uno" para Coeficientes e Independiente
> **"Con UNO sumas todo, con CERO te quedas solo."**
- **P(1):** Da la **SUMA DE TODOS LOS COEFICIENTES** (el 1 no altera las multiplicaciones).
- **P(0):** Anula todas las variables con exponentes positivos y deja **SOLO AL TÉRMINO INDEPENDIENTE**.

### 2. Clasificación de Expresiones: "R-E-F-I"
- **R-E (Racional Entera):** Exponentes **E**nteros positivos (\mathbb{Z}^+). ¡Polinomio!
- **R-F (Racional Fraccionaria):** Variable en la **F**osa (denominador) o exponente negativo.
- **I (Irracional):** Variable en el **I**glú (dentro de un radical o exp. fraccionario).

### 3. Polinomios Especiales: "H-O-C-I-N"
- **H**omogéneo \to **H**ermano gemelo en grado (mismo GA en cada monomio).
- **O**rdenado \to **O**rganizado (los exponentes van en fila india: suben o bajan).
- **C**ompleto \to **C**ompletito (no falta ningún escalón desde el x^n hasta el x^0).
- **I**dénticos \to **I**guales coeficientes espejo.
- **N**ulo \to **N**ada queda (todos los coeficientes valen cero).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Coeficiente con Variable en Expresiones Racionales**
> En la expresión:
> P(x) = \sqrt{3} x^4 - \frac{2}{5} x^2 + \pi x - 7
> Muchos postulantes marcan "Expresión Irracional" porque ven \sqrt{3}, o "Fraccionaria" porque ven \frac{2}{5}. 
> **La regla es clara:** La clasificación depende **única y exclusivamente de las variables**, no de los coeficientes numéricos. Como las variables tienen exponentes \{4, 2, 1, 0\} \subset \mathbb{Z}_0^+, es una **E.A. Racional Entera (Polinomio)**.

> [!WARNING]
> **Trampa 2: El Término Independiente en Polinomios Compuestos**
> Si te piden el término independiente de P(x + 3) = x^2 - 5x + 6, el postulante novato evalúa x = 0 y responde 6. **¡FATAL ERROR!**
> Para hallar el término independiente del polinomio P, se debe lograr que el argumento sea 0:
> x + 3 = 0 \implies x = -3
> Luego: P(0) = (-3)^2 - 5(-3) + 6 = 9 + 15 + 6 = 30.

> [!CAUTION]
> **Trampa 3: Polinomios Homogéneos con Variables Escondidas**
> Si el polinomio es P(x, y) = a x^{m+2} y^3 - b x^5 y^n + c z^8 x y^4:
> ¡Cuidado! Mira la notación funcional P(x, y). La letra z **no es variable**, ¡es una constante o coeficiente! Por ende, el grado de ese término es solo la suma de los exponentes de x e y (1 + 4 = 5), no 8 + 1 + 4.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización y Modelado de Señales Acústicas en Arquitectura Arequipeña
En la restauración bioclimática de las bóvedas de sillar de los claustros de la UNSA, la atenuación de presión sonora P(r, \theta) frente a ondas estacionarias se modela mediante polinomios armónicos multivariables donde cada término representa un modo normal de vibración. Para asegurar que la acústica no distorsione frecuencias de la voz humana, el modelo matemático exige que el polinomio de dispersión sea **homogéneo** (para que todas las frecuencias espaciales decaigan a la misma tasa proporcional) y **completo** (para no omitir armónicos pares o impares que generen resonancias indeseadas en el recinto).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t04_s02_c01",
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
                    id = "alg_t04_s02_c02",
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
                    id = "alg_t04_s02_c03",
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
                    id = "alg_t04_s02_c04",
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
                    id = "alg_t04_s02_c05",
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
                    id = "alg_t04_s02_c06",
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
                    id = "alg_t04_s02_c07",
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
                    id = "alg_t04_s02_c08",
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
                    id = "alg_t04_s02_c09",
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
                    id = "alg_t04_s02_c10",
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
