## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
