## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
En estas fórmulas, k representa el número de elementos de un conjunto finito A.
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

### 4.4 Diagramas de Lewis Carroll
Organiza datos mediante dos criterios binarios, cada uno dividido en categorías excluyentes y exhaustivas. Las cuatro celdas representan combinaciones disjuntas de esos criterios; los conjuntos definidos por criterios distintos pueden superponerse:

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
