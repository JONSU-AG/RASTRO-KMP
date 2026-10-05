## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
| **Idempotencia** | A \cup A = A | A \cap A = A |
| **Conmutatividad** | A \cup B = B \cup A | A \cap B = B \cap A |
| **Asociatividad** | (A \cup B) \cup C = A \cup (B \cup C) | (A \cap B) \cap C = A \cap (B \cap C) |
| **Distributividad** | A \cup (B \cap C) = (A \cup B) \cap (A \cup C) | A \cap (B \cup C) = (A \cap B) \cup (A \cap C) |
| **De Morgan** | (A \cup B)^c = A^c \cap B^c | (A \cap B)^c = A^c \cup B^c |
| **Absorción Total** | A \cup (A \cap B) = A | A \cap (A \cup B) = A |
| **Absorción Parcial** | A \cup (A^c \cap B) = A \cup B | A \cap (A^c \cup B) = A \cap B |
| **Identidad (Neutros)** | A \cup \emptyset = A, \quad A \cup \mathbb{U} = \mathbb{U} | A \cap \mathbb{U} = A, \quad A \cap \emptyset = \emptyset |
| **Complementación** | A \cup A^c = \mathbb{U}, \quad (A^c)^c = A | A \cap A^c = \emptyset, \quad \mathbb{U}^c = \emptyset, \quad \emptyset^c = \mathbb{U} |
| **Diferencia** | A - B = A \cap B^c | (A - B)^c = A^c \cup B |

---

### 3.4 Cardinalidad y Principio de Inclusión-Exclusión

El cardinal de un conjunto finito A, denotado n(A) o |A|, es el número de elementos distintos que posee.

1. **Para dos conjuntos A y B:**
   n(A \cup B) = n(A) + n(B) - n(A \cap B)
   n(A - B) = n(A) - n(A \cap B)
   n(A \triangle B) = n(A \cup B) - n(A \cap B) = n(A - B) + n(B - A)
2. **Para tres conjuntos A, B y C (Principio de Inclusión-Exclusión de Sylvester):**
   n(A \cup B \cup C) = n(A) + n(B) + n(C) - [n(A \cap B) + n(A \cap C) + n(B \cap C)] + n(A \cap B \cap C)
3. **Conjunto Potencia (\mathcal{P}(A)):**
   Subconjunto formado por todos los subconjuntos posibles de A:
   n(\mathcal{P}(A)) = 2^{n(A)}
   \text{Subconjuntos propios} = 2^{n(A)} - 1

---

### 3.5 Producto Cartesiano (A \times B)
Dados dos conjuntos no vacíos A y B, su producto cartesiano es el conjunto de todos los pares ordenados (a, b) tales que la primera componente pertenece a A y la segunda componente pertenece a B:
A \times B = \{(a, b) \mid a \in A \land b \in B\}
* **Propiedades:**
  1. No es conmutativo: A \times B \neq B \times A (salvo que A = B o alguno sea \emptyset).
  2. Cardinal del producto: n(A \times B) = n(A) \cdot n(B).
  3. Distributividad:
     A \times (B \cup C) = (A \times B) \cup (A \times C)
     A \times (B \cap C) = (A \times B) \cap (A \times C)
     A \times (B - C) = (A \times B) - (A \times C)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Absorción Parcial** | A \cup (A^c \cap B) = A \cup B, \quad A \cap (A^c \cup B) = A \cap B |
| **Diferencia como Intersección** | A - B = A \cap B^c |
| **Inclusión-Exclusión (2 conjuntos)** | n(A \cup B) = n(A) + n(B) - n(A \cap B) |
| **Inclusión-Exclusión (3 conjuntos)** | n(A \cup B \cup C) = \sum n(A) - \sum n(A \cap B) + n(A \cap B \cap C) |
| **Cardinal Potencia** | n(\mathcal{P}(A)) = 2^{n(A)} |
| **Cardinal Producto Cartesiano** | n(A \times B) = n(A) \cdot n(B) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Simplificación Booleana de Conjuntos sin Dibujar Diagramas
Simplificar la expresión:
E = [ (A \cup B) \cap A^c ] \cup B
* **Paso 1:** Aplica distributividad o absorción parcial directa:
  (A \cup B) \cap A^c = A^c \cap (A \cup B)
  Por absorción parcial: A^c \cap (A \cup B) = A^c \cap B.
* **Paso 2:** Reemplaza en la expresión original:
  E = (A^c \cap B) \cup B = B \cup (B \cap A^c)
* **Paso 3:** Por absorción total:
  B \cup (B \cap A^c) = B
* ¡El resultado es simplemente B en tres líneas de álgebra estricta!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Leyes de Absorción: "El Monstruo Mayor y el Signo Opuesto"
* **Absorción Total (A dentro y fuera):**
  A \cup (A \cap B) = A
  *Mnemotecnia:* Si la misma letra A está afuera y adentro con signos cambiados (\cup y \cap), A se "traga" a toda la expresión y elimina a B.
* **Absorción Parcial (A afuera y A^c adentro):**
  A \cup (A^c \cap B) = A \cup B
  *Mnemotecnia:* El complemento A^c desaparece y queda A unido al término sobreviviente B.

### 2. Diferencia de Conjuntos: "Primero Intersectado con el No-Segundo"
* A - B = A \cap B^c
* Para simplificar cualquier expresión algebraica conjuntista, elimina el signo menos transformándolo en \cap con el complemento del segundo término.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Pertenencia (\in) frente a Inclusión (\subset)
> Si el conjunto es A = \{3, \{5\}, 8\}:
> - \{5\} \in A es **VERDADERO** (es un elemento físico de A).
> - \{5\} \subset A es **FALSO** (como subconjunto requeriría \{\{5\}\} \subset A).
> - 3 \subset A es **FALSO** (un elemento no puede estar incluido, debe llevar llaves: \{3\} \subset A).
> Confundir \in con \subset es el distractor N.° 1 en el primer examen CEPREUNSA.

> [!WARNING]
> ### Trampa 2: Cardinal de Conjuntos con Elementos Redundantes
> Si B = \{x^2 \mid x \in \mathbb{Z} \land -2 \le x \le 2\}:
> - Los valores de x son \{-2, -1, 0, 1, 2\}.
> - Los valores de x^2 son: (-2)^2 = 4, (-1)^2 = 1, 0^2 = 0, 1^2 = 1, 2^2 = 4.
> - Por convención de teoría de conjuntos, los elementos repetidos no se duplican:
>   B = \{0, 1, 4\} \implies n(B) = 3
> Si respondes n(B) = 5, marcarás la opción trampa.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Modelado de Filtros de Consulta en Bases de Datos Relacionales (SQL)
En los sistemas de información de la UNSA y plataformas de streaming, las consultas de búsqueda masiva se ejecutan mediante álgebra booleana de conjuntos:
```sql
SELECT postulante_id FROM postulantes 
WHERE (carrera = 'Ing_Sistemas' OR carrera = 'Ing_Industrial') 
AND NOT (modalidad = 'Traslado');
```
Esta consulta traduce formalmente la operación conjuntista:
(S \cup I) \cap T^c = (S \cup I) - T
El motor de base de datos aplica las leyes de De Morgan y distributividad para minimizar el costo computacional de indexación.

---
