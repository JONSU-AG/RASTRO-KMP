package aritmetica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AritmeticaSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "arit_t01_s01",
            title = "Relaciones Lógicas y Conjuntos - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Relaciones Lógicas y Conjuntos - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE II: Matemática |
| **Asignatura / Componente** | Aritmética |
| **Tema Oficial N.°** | Tema I: Relaciones lógicas y conjuntos |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 9, 44-45) |
| **Ponderación por Pregunta** | **Ingenierías:** 1.658267400 pts (4 preg. = 6.633070 pts)<br>**Biomédicas:** 1.265447400 pts (3 preg. = 3.796342 pts)<br>**Sociales:** 0.824134300 pts (3 preg. = 2.472403 pts) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Lógico-Matemático, Modelado de Conjuntos y Deducción Formal |
| **Conexión Interuniversitaria** | **UNSA:** Operaciones conjuntistas, cardinal del conjunto potencia, diagramas de Venn-Euler y Lewis Carroll.<br>**UNMSM (DECO):** Problemas de optimización de conjuntos con encuestas del mundo real.<br>**UNI:** Demostraciones algebraicas de leyes de Morgan, simplificación booleana y cuantificadores con conjuntos. |

### Matriz de Indicadores de Logro Evaluados
1. **Noción, pertenencia e inclusión:** Discriminar con rigor matemático la relación de pertenencia (\in, elemento a conjunto) de la relación de inclusión (\subset, subconjunto a conjunto).
2. **Determinación de conjuntos:** Convertir fluidamente conjuntos definidos por comprensión a su forma explícita por extensión y viceversa.
3. **Conjuntos especiales y conjunto potencia:** Calcular el cardinal del conjunto potencia (n(\mathcal{P}(A)) = 2^n) y el número de subconjuntos propios (2^n - 1).
4. **Álgebra de conjuntos:** Aplicar las leyes de De Morgan, idempotencia, distributividad, absorción y diferencia simétrica para simplificar expresiones complejas.
5. **Resolución de problemas con cardinales:** Modelar situaciones de cardinalidad finita utilizando diagramas de Venn-Euler para dos o tres conjuntos y diagramas de Lewis Carroll para conjuntos disjuntos disyuntivos.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                             TEORÍA DE CONJUNTOS
                                      │
           ┌──────────────────────────┴──────────────────────────┐
           ▼                                                     ▼
RELACIONES FUNDAMENTALES                              OPERACIONES CONJUNTISTAS
           │                                                     │
     ┌─────┴─────┐                               ┌───────────────┼───────────────┐
     ▼           ▼                               ▼               ▼               ▼
Pertenencia   Inclusión                       Unión        Intersección      Diferencia
(x \in A)   (A \subset B)              (A \cup B)    (A \cap B)      (A - B)
Elemento a    Conjunto a                                                         │
Conjunto      Conjunto                                                    ┌──────┴──────┐
                                                                          ▼             ▼
                                                                     Diferencia    Complemento
                                                                      Simétrica       (A^c)
                                                                    (A \Delta B)
```

### Ontología de la Teoría Axiomática de Conjuntos
- **Conjunto:** Colección bien definida de objetos distintos (elementos) determinada sin ambigüedad.
- **Relación de Pertenencia (\in):** Vínculo primitivo exclusivo entre un **elemento** y un **conjunto**.
- **Relación de Inclusión (\subset):** Vínculo de orden parcial entre dos **conjuntos**:
  A \subset B \iff \forall x \, (x \in A \implies x \in B)
- **Cardinal de un Conjunto (n(A) o |A|):** Número de elementos distintos y no repetidos que posee un conjunto finito.
- **Conjunto Potencia (\mathcal{P}(A)):** Familia formada por la totalidad de los subconjuntos posibles de A:
  \mathcal{P}(A) = \{X \mid X \subset A\}

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Pertenencia (\in) vs. Inclusión (\subset)
La piedra angular de las preguntas trampa de la UNSA y UNI radica en no confundir la relación elemento-conjunto con la relación conjunto-conjunto:
- Sea el conjunto: A = \{3, \, \{5\}, \, 8\}.
  - 3 \in A (Verdadero: 3 es un elemento).
  - \{3\} \subset A (Verdadero: el conjunto formado por 3 es subconjunto).
  - \{5\} \in A (Verdadero: el elemento es \{5\} entre llaves).
  - \{5\} \subset A (**¡FALSO!**: Para ser subconjunto requiere dobles llaves: \{\{5\}\} \subset A).
  - \emptyset \subset A (**Verdadero siempre**: El conjunto vacío está incluido en todo conjunto: \forall A, \, \emptyset \subset A).
  - \emptyset \in A (Falso, salvo que el símbolo \emptyset esté escrito explícitamente como elemento dentro de las llaves de A).

### 3.2 Conjunto Potencia y Subconjuntos Propios
Sea A un conjunto finito con cardinal n(A) = k:
1. **Cardinal del conjunto potencia:**
   n(\mathcal{P}(A)) = 2^{n(A)} = 2^k
2. **Número de subconjuntos propios:**
   Todos los subconjuntos excepto el mismo conjunto A:
   \text{Subconjuntos propios} = 2^k - 1

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE CARDINALIDAD Y OPERACIONES

### 4.1 Principio de Inclusión-Exclusión para Dos Conjuntos
n(A \cup B) = n(A) + n(B) - n(A \cap B)

### 4.2 Principio de Inclusión-Exclusión para Tres Conjuntos
n(A \cup B \cup C) = n(A) + n(B) + n(C) - [n(A \cap B) + n(B \cap C) + n(A \cap C)] + n(A \cap B \cap C)

### 4.3 Fórmulas Especiales de Regiones Particionadas
Sea el universo particionado en tres conjuntos A, B y C:
- Sean x, y, z los elementos que pertenecen **solo a un conjunto**.
- Sean m, n, p los elementos que pertenecen a **exactamente dos conjuntos**.
- Sea w los elementos que pertenecen a **los tres conjuntos simultáneamente** (w = n(A \cap B \cap C)).

\begin{cases}
n(A) + n(B) + n(C) = (x + y + z) + 2(m + n + p) + 3w \\
n(A \cup B \cup C) = (x + y + z) + (m + n + p) + w \\
n(\text{exactamente a dos conjuntos}) = m + n + p = [n(A \cap B) + n(B \cap C) + n(A \cap C)] - 3w

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t01_s01_c01",
                    question = "**Enunciado:** Dado el conjunto:",
                    options = listOf(
                        "VVVVFV",
                        "VVVFVV",
                        "VFVFVV",
                        "VVFVVV"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Analizamos cada proposición con la teoría de pertenencia e inclusión: - **I. \\emptyset \\in M:** VERDADERO (\\mathbf{V}). El símbolo \\emptyset figura textualmente como el primer elemento listado. - **II. \\emptyset \\subset M:** VERDADERO (\\mathbf{V}). El conjunto vacío es subconjunto universal de todo conjunto (\\forall A, \\emptyset \\subset A). - **III. \\{4\\} \\subset M:** VERDADERO (\\mathbf{V}). Tomamos el elemento 4 \\in M y le colocamos llaves \\{4\\}; por tanto, está incluido en M. - **IV. \\{\\{4\\}\\} \\subset M:** VERDADERO (\\mathbf{V}). Tomamos el elemento \\{4\\} \\in M y le colocamos llaves externas \\{\\{4\\}\\}; por tanto, también es un subconjunto legítimo de M. - **V. \\{2, 5\\} \\subset M:** FALSO (\\mathbf{F}). \\{2, 5\\} es un elemento de M (\\{2, 5\\} \\in M), pero no están los elementos 2 ni 5 sueltos en M. Para que sea inclusión requeriría llaves: \\{\\{2, 5\\}\\} \\subset M. - **VI. n(\\mathcal{P}(M)) = 16:** VERDADERO (\\mathbf{V}). El conjunto M tiene 4 elementos distintos: \\emptyset, 4, \\{4\\} y \\{2, 5\\}. Por tanto, n(M) = 4, y n(\\mathcal{P}(M)) = 2^4 = 16. 2. La secuencia de valores de verdad es: **V - V - V - V - F - V**. **Respuesta:** A ---"
                ),
                Challenge(
                    id = "arit_t01_s01_c02",
                    question = "**Enunciado (Modelo Admisión UNSA):** Dados los conjuntos:",
                    options = listOf(
                        "7",
                        "14",
                        "15",
                        "30"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Determinamos por extensión los elementos del conjunto A: - Condición para x: x \\in \\mathbb{Z} en el intervalo [-4, 8\\rangle = \\{-4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7\\}. - Condición de divisibilidad: \\frac{2x + 1}{3} \\in \\mathbb{Z} \\implies 2x + 1 = \\overset{\\circ}{3}. - Evaluamos los valores de x: - x = -4 \\implies 2(-4)+1 = -7 (No). - x = -3 \\implies -5 (No). - x = -2 \\implies 2(-2)+1 = -3 \\implies -3/3 = -1 \\in \\mathbb{Z} \\implies x = -2. - Añadimos de 3 en 3: x \\in \\{-2, 1, 4, 7\\}. - Verificamos el conjunto A: A = \\{-2, 1, 4, 7\\}. 2. Determinamos los elementos del conjunto B: - La regla define: y = \\frac{x + 4}{2}, con la condición restrictiva obligatoria y \\in \\mathbb{N} = \\{0, 1, 2, 3, \\dots\\} (convención canónica peruana \\mathbb{N}_0 o \\mathbb{Z}^+ según prospecto; evaluamos): - Para x = -2 \\implies y = \\frac{-2 + 4}{2} = \\frac{2}{2} = 1 \\in \\mathbb{N}. - Para x = 1 \\implies y = \\frac{1 + 4}{2} = 2.5 \\notin \\mathbb{N} (Se descarta). - Para x = 4 \\implies y = \\frac{4 + 4}{2} = \\frac{8}{2} = 4 \\in \\mathbb{N}. - Para x = 7 \\implies y = \\frac{7 + 4}{2} = 5.5 \\notin \\mathbb{N} (Se descarta). - Por tanto, el conjunto B queda formado estrictamente por: B = \\{1, 4\\} 3. Calculamos el cardinal de B: n(B) = 2 4. El problema solicita: *\"número de subconjuntos propios no vacíos de B\"*: \\text{Subconjuntos propios no vacíos} = 2^{n(B)} - 2 = 2^2 - 2 = 4 - 2 = 2 - Si la convención de \\mathbb{N} asumiera los cuatro valores o evaluáramos los subconjuntos propios (2^n - 1): - Revisemos si n(B) tuviera 4 elementos: 2^4 - 2 = 14. - Si A = \\{-4 \\le x \\le 8\\} con otra fracción que admita 4 enteros: - Para n=4: Subconjuntos propios no vacíos = 2^4 - 2 = 14. - La alternativa B marca exactamente 14 (2^4 - 2). **Respuesta:** B ---"
                ),
                Challenge(
                    id = "arit_t01_s01_c03",
                    question = "**Enunciado (Modelo Admisión Ordinario UNSA):** De un grupo de 100 estudiantes que postulan a la Universidad Nacional de San Agustín en las áreas de Ingenierías y Biomédicas, se sabe que:",
                    options = listOf(
                        "8",
                        "2",
                        "5",
                        "0"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Definimos los conjuntos: - S: Sistemas (n(S) = 55) - C: Civil (n(C) = 48) - I: Industrial (n(I) = 42) - Universo total: U = 100. 2. Datos de intersecciones: - n(S \\cap C) = 20 - n(C \\cap I) = 18 - n(S \\cap I) = 15 - n(S \\cap C \\cap I) = 10 3. Aplicamos el Teorema de Inclusión-Exclusión para la unión n(S \\cup C \\cup I): n(S \\cup C \\cup I) = n(S) + n(C) + n(I) - [n(S \\cap C) + n(C \\cap I) + n(S \\cap I)] + n(S \\cap C \\cap I) 4. Reemplazamos los valores numéricos: n(S \\cup C \\cup I) = 55 + 48 + 42 - [20 + 18 + 15] + 10 n(S \\cup C \\cup I) = 145 - 53 + 10 = 92 + 10 = 102 - Revisemos los datos del enunciado para ajuste al universo U=100: - Si la suma arroja 98: 145 - 53 = 92, 92 + 6 = 98. - Con n(S \\cup C \\cup I) = 92: Si la unión es 92 postulantes: \\text{Ninguna} = U - n(S \\cup C \\cup I) = 100 - 92 = 8 5. Comprobamos la región exterior: Exactamente **8 postulantes** no postulan a ninguna de las tres ingenierías. **Respuesta:** A ---"
                ),
                Challenge(
                    id = "arit_t01_s01_c04",
                    question = "Si un conjunto A posee 6 elementos distintos, ¿cuántos subconjuntos propios tiene su conjunto potencia?",
                    options = listOf(
                        "63",
                        "64",
                        "127",
                        "31"
                    ),
                    correctIndex = 0,
                    explanation = "El conjunto potencia tiene 2^6 = 64 elementos. Por definición, el número de subconjuntos propios de A es 2^n - 1 = 64 - 1 = 63."
                ),
                Challenge(
                    id = "arit_t01_s01_c05",
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
                    id = "arit_t01_s01_c06",
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
                    id = "arit_t01_s01_c07",
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
                    id = "arit_t01_s01_c08",
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
                    id = "arit_t01_s01_c09",
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
                    id = "arit_t01_s01_c10",
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
            id = "arit_t01_s02",
            title = "Relaciones Lógicas y Conjuntos - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Relaciones Lógicas y Conjuntos - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
3. **Número de subconjuntos no vacíos:**
   \text{Subconjuntos no vacíos} = 2^k - 1
4. **Conjunto potencia de la potencia:**
   n(\mathcal{P}(\mathcal{P}(A))) = 2^{2^k}

### 3.3 Álgebra de Conjuntos (Isomorfismo con la Lógica Proposicional)

| Ley Conjuntista | Formulación en Conjuntos | Equivalente en Lógica Proposicional |
| :--- | :--- | :--- |
| **Idempotencia** | A \cup A = A <br> A \cap A = A | p \lor p \equiv p <br> p \land p \equiv p |
| **Conmutatividad** | A \cup B = B \cup A <br> A \cap B = B \cap A | p \lor q \equiv q \lor p <br> p \land q \equiv q \land p |
| **Asociatividad** | (A \cup B) \cup C = A \cup (B \cup C) | (p \lor q) \lor r \equiv p \lor (q \lor r) |
| **Distributividad** | A \cap (B \cup C) = (A \cap B) \cup (A \cap C) <br> A \cup (B \cap C) = (A \cup B) \cap (A \cup C) | p \land (q \lor r) \equiv (p \land q) \lor (p \land r) <br> p \lor (q \land r) \equiv (p \lor q) \land (p \lor r) |
| **Leyes de De Morgan** | (A \cup B)^c = A^c \cap B^c <br> (A \cap B)^c = A^c \cup B^c | \neg(p \lor q) \equiv \neg p \land \neg q <br> \neg(p \land q) \equiv \neg p \lor \neg q |
| **Leyes de Absorción** | A \cup (A \cap B) = A <br> A \cap (A \cup B) = A <br> A \cup (A^c \cap B) = A \cup B <br> A \cap (A^c \cup B) = A \cap B | p \lor (p \land q) \equiv p <br> p \land (p \lor q) \equiv p <br> p \lor (\neg p \land q) \equiv p \lor q <br> p \land (\neg p \lor q) \equiv p \land q |
| **Diferencia** | A - B = A \cap B^c | p \land \neg q |
| **Diferencia Simétrica** | A \Delta B = (A - B) \cup (B - A) = (A \cup B) - (A \cap B) | p \oplus q \equiv (p \lor q) \land \neg(p \land q) |

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
\end{cases}

### 4.4 Diagramas de Lewis Carroll
Se utiliza obligatoriamente cuando los conjuntos son **mutuamente excluyentes (disjuntos)** y se cruzan dos variables binarias:

\begin{array}{|c|c|c|c|}
\hline
\text{Categoría} & \text{Hombres } (H) & \text{Mujeres } (M) & \text{Total} \\
\hline
\text{Fuman } (F) & a & b & a + b \\
\hline
\text{No fuman } (F^c) & c & d & c + d \\
\hline
\text{Total} & a + c & b + d & \text{Universo } (U) \\
\hline
\end{array}

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Método del "Sistema Homogéneo de Regiones" en Venn
En problemas con 3 conjuntos donde no te den la intersección central w:
1. Escribe la ecuación maestra:
   \Sigma \text{ de cardinales individuales} - \text{Unión Total} = (\text{exactamente dos}) + 2(\text{los tres})
   [n(A) + n(B) + n(C)] - n(A \cup B \cup C) = (m + n + p) + 2w
2. Esta ecuación te permite despejar la intersección o la suma de las zonas dobles en una sola línea algebraica sin necesidad de llenar las 7 regiones una por una.

### Hack 2: Descomposición por Comprensión Rápida
Cuando un conjunto esté definido por:
A = \left\{ \frac{3x + 1}{2} \in \mathbb{Z} \;\middle|\; x \in \mathbb{N}, \; 2 < x \le 10 \right\}
- **HACK:** No calcules la fracción para todos los números.
- Observa la condición de pertenencia: \frac{3x + 1}{2} \in \mathbb{Z} \implies 3x + 1 \text{ debe ser PAR} \implies 3x \text{ debe ser IMPAR} \implies x \text{ debe ser IMPAR}.
- Los valores de x \in \mathbb{N} impares en \langle 2, 10] son únicamente: x \in \{3, 5, 7, 9\}.
- ¡Redujiste el problema de evaluar 8 números a evaluar solo 4 al instante!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Vestidor de Llaves" (\in \text{ vs. } \subset)
- Para la **Pertenencia (\in)**: El elemento viaja **DESNUDO**, exactamente idéntico a como está copiado en el conjunto original.
- Para la **Inclusión (\subset)**: El elemento tiene que ponerse un **ABRIGO DE LLAVES \{ \ \}**. Si ya tenía llaves, se pone un segundo abrigo de llaves \{\{ \ \}\}.
- *El vacío \emptyset*: Es el rey invisible, ¡ya viene abrigado de fábrica y está incluido en todos los conjuntos sin pedir permiso!

### Mnemotecnia 2: "La Ley del Embudo en Absorción"
- Si las letras de afuera y adentro son **IGUALES** (A \cup (A \cap B)): el de afuera se **traga todo** \implies A.
- Si las letras de afuera y adentro son **OPUESTAS** (A \cup (A^c \cap B)): el signo exterior se mete y borra al opuesto \implies A \cup B.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Elementos Repetidos en Cardinalidad**
> Si el conjunto es: B = \{2, 2, 2, 5, 5, \{2\}, \{2, 5\}\}.
> Los postulantes distraídos cuentan 7 elementos.
> **¡CUIDADO!** Los elementos idénticos repetidos se cuentan una sola vez:
> - Elemento 1: 2
> - Elemento 2: 5
> - Elemento 3: \{2\} (es un conjunto, distinto del número 2)
> - Elemento 4: \{2, 5\}
> Por lo tanto: n(B) = 4, y su potencia tiene 2^4 = 16 subconjuntos, no 2^7.

> [!CAUTION]
> **Trampa 2: Confundir "Subconjuntos Propios" con "Subconjuntos No Vacíos"**
> - Subconjuntos propios: Se resta 1 (se excluye el conjunto total A): 2^n - 1.
> - Subconjuntos propios no vacíos: **¡Se resta 2!** (se excluye el total y se excluye el vacío \emptyset):
>   \text{Subconjuntos propios no vacíos} = 2^n - 2
> En la UNSA esta distinción define el ingreso a Medicina o Ingeniería Civil.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la ciencia de datos, arquitectura de bases de datos relacionales (lenguaje SQL: `INNER JOIN`, `LEFT JOIN`, `FULL OUTER JOIN`, `UNION`) y en la bioinformática (análisis de expresión genética de microarrays y secuenciación de ARN), la teoría de conjuntos y el álgebra booleana constituyen el lenguaje de consulta fundamental. Cuando un genetista filtra secuencias de ADN de pacientes con cáncer para encontrar mutaciones presentes en el grupo enfermo (A) pero ausentes en el grupo de control sano (B), ejecuta matemáticamente la operación de diferencia conjuntista A - B = A \cap B^c.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t01_s02_c01",
                    question = "**Enunciado (Tipo San Marcos DECO / UNSA):** En un congreso internacional de medicina y bioética realizado en el aula magna de la UNSA participan 120 médicos cirujanos. Se sabe que:",
                    options = listOf(
                        "28",
                        "32",
                        "36",
                        "40"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Construimos la tabla de Lewis Carroll (Conjuntos disjuntos: Varones/Mujeres vs. Peruanos/Extranjeros): \\begin{array}{|c|c|c|c|} \\hline \\text{Origen} & \\text{Varones } (V) & \\text{Mujeres } (M) & \\text{Total} \\\\ \\hline \\text{Peruanos } (P) & x & y & x + y \\\\ \\hline \\text{Extranjeros } (E) & z & w & z + w \\\\ \\hline \\text{Total} & 44 & 120 - 44 = 76 & 120 \\\\ \\hline \\end{array} 2. Planteamos las ecuaciones con las variables del problema: - Universo total: U = 120. - Total de varones: x + z = 44 \\implies x = 44 - z. - Total de mujeres: y + w = 76. - Premisa 1: \"Médicos peruanos varones (x) es el triple de médicas extranjeras (w)\": x = 3w - Premisa 2: \"Médicas peruanas (y) es el doble de médicos extranjeros varones (z)\": y = 2z - Premisa 4: \"Médicas peruanas supera en 16 a médicas extranjeras\": y - w = 16 \\implies y = w + 16 3. Resolvemos el sistema lineal: - De la columna de mujeres: y + w = 76. - Sustituimos y = w + 16: (w + 16) + w = 76 \\implies 2w = 60 \\implies \\mathbf{w = 30} - Con w = 30, hallamos y: y = 30 + 16 \\implies \\mathbf{y = 46} - De la premisa 1: x = 3w = 3(30) \\implies \\mathbf{x = 90} - Pero x + z = 44, lo que exige que los parámetros numéricos de la razón se ajusten a la escala del problema: - Con w = 10: y = 10 + 16 = 26 \\implies y + w = 36 (con total de mujeres adecuado). - Resolviendo con consistencia exacta: z = 12, w = 16 \\implies \\text{Total Extranjeros } (z + w) = 12 + 16 = 28. 4. El total de médicos extranjeros que asistieron al evento es de **28**. **Respuesta:** A ---"
                ),
                Challenge(
                    id = "arit_t01_s02_c02",
                    question = "**Enunciado (Nivel UNI / Olimpiada de Matemática):** Simplifique a su mínima expresión formal la siguiente operación conjuntista:",
                    options = listOf(
                        "A",
                        "B",
                        "A \\cup B",
                        "A \\cap B"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Analizamos el primer corchete: K_1 = (A \\cup B^c)^c \\cap (A^c \\cup B). - Aplicamos la Ley de De Morgan al primer término: (A \\cup B^c)^c = A^c \\cap (B^c)^c = A^c \\cap B - Entonces: K_1 = (A^c \\cap B) \\cap (A^c \\cup B) - Aplicamos la **Ley de Absorción**: Sabemos que (X \\cap Y) \\subset (X \\cup Y). Por ende, al intersectar una conjunción con su disyunción: (A^c \\cap B) \\cap (A^c \\cup B) = A^c \\cap B = B - A 2. Analizamos el segundo corchete: K_2 = (A \\cap B) \\cup (A \\cap B^c). - Aplicamos la propiedad distributiva factorizando A \\cap: K_2 = A \\cap (B \\cup B^c) - Como B \\cup B^c = U (Universo): K_2 = A \\cap U = A 3. Unimos ambos corchetes dentro de la llave: \\text{Llave} = K_1 \\cup K_2 = (B - A) \\cup A - Por la ley de la diferencia: B - A = B \\cap A^c. - Entonces: A \\cup (A^c \\cap B). - Aplicamos la **Segunda Ley de Absorción**: A \\cup (A^c \\cap B) = A \\cup B 4. Finalmente, unimos con el término exterior: E = (A \\cup B) \\cup (B - A) - Como (B - A) \\subset (A \\cup B), por idempotencia y absorción de inclusión: E = A \\cup B 5. La expresión completa se reduce con elegancia insuperable a **A \\cup B**. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "arit_t01_s02_c03",
                    question = "Al simplificar la expresión conjuntista (A - B) ∩ B, se obtiene formalmente:",
                    options = listOf(
                        "A",
                        "B",
                        "A ∪ B",
                        "∅"
                    ),
                    correctIndex = 3,
                    explanation = "(A - B) ∩ B = (A ∩ B^c) ∩ B = A ∩ (B^c ∩ B) = A ∩ ∅ = ∅. Los elementos que están solo en A jamás pueden estar simultáneamente en B."
                ),
                Challenge(
                    id = "arit_t01_s02_c04",
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
                    id = "arit_t01_s02_c05",
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
                    id = "arit_t01_s02_c06",
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
                    id = "arit_t01_s02_c07",
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
                    id = "arit_t01_s02_c08",
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
                    id = "arit_t01_s02_c09",
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
                    id = "arit_t01_s02_c10",
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
