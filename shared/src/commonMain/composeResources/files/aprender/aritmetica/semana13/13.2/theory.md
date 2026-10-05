## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
---

### 3.4 Probabilidad Condicional
La probabilidad condicional de que ocurra el evento A, dado que ya se ha verificado la ocurrencia previa del evento B (con P(B) > 0), se define formalmente como:
P(A \mid B) = \frac{P(A \cap B)}{P(B)}
* **Regla General del Producto:**
  P(A \cap B) = P(B) \cdot P(A \mid B) = P(A) \cdot P(B \mid A)

---

### 3.5 Sucesos Estocásticamente Independientes
Dos eventos A y B son estadísticamente independientes si la ocurrencia de uno no afecta en absoluto la probabilidad de ocurrencia del otro:
A \text{ y } B \text{ son independientes} \iff P(A \mid B) = P(A) \iff P(B \mid A) = P(B)
* **Regla Especial de la Multiplicación para Sucesos Independientes:**
  P(A \cap B) = P(A) \cdot P(B)
* Si los eventos A y B son independientes, entonces sus complementos también lo son:
  - A y B^c son independientes.
  - A^c y B son independientes.
  - A^c y B^c son independientes.

---

### 3.6 Teorema de la Probabilidad Total y Teorema de Bayes

#### 1. Partición de un Espacio Muestral
Una colección de eventos B_1, B_2, \dots, B_k constituye una partición de \Omega si:
1. Son disjuntos dos a dos: B_i \cap B_j = \emptyset \quad (\forall i \neq j).
2. Su unión abarca todo el espacio muestral: \bigcup_{i=1}^k B_i = \Omega.
3. P(B_i) > 0 \quad (\forall i).

#### 2. Teorema de la Probabilidad Total
Sea A cualquier evento definido sobre \Omega. Su probabilidad puede calcularse sumando las probabilidades conjuntas sobre la partición:
P(A) = \sum_{i=1}^k P(B_i) \cdot P(A \mid B_i) = P(B_1)P(A \mid B_1) + P(B_2)P(A \mid B_2) + \dots + P(B_k)P(A \mid B_k)

#### 3. Teorema de Bayes (Probabilidad a Posteriori)
Permite actualizar la probabilidad de una causa hipotética B_j habiendo observado el efecto o resultado A:
P(B_j \mid A) = \frac{P(B_j \cap A)}{P(A)} = \frac{P(B_j) \cdot P(A \mid B_j)}{\sum_{i=1}^k P(B_i) \cdot P(A \mid B_i)}
- P(B_j): Probabilidad *a priori* de la causa.
- P(A \mid B_j): Verosimilitud del evento bajo la causa B_j.
- P(B_j \mid A): Probabilidad *a posteriori* de la causa habiendo ocurrido A.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Probabilidad Condicional** | P(A \mid B) = \frac{P(A \cap B)}{P(B)} \quad (P(B) > 0) |
| **Regla del Producto** | P(A \cap B) = P(B) \cdot P(A \mid B) |
| **Sucesos Independientes** | P(A \cap B) = P(A) \cdot P(B) |
| **Probabilidad Total** | P(A) = \sum_{i=1}^k P(B_i) \cdot P(A \mid B_i) |
| **Teorema de Bayes** | P(B_j \mid A) = \frac{P(B_j) \cdot P(A \mid B_j)}{\sum_{i=1}^k P(B_i) \cdot P(A \mid B_i)} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Selección sin Reposición mediante Números Combinatorios
Al extraer simultáneamente k objetos de una urna con n objetos totales (donde hay b objetos blancos y n - b negros):
* **Espacio muestral total:** n(\Omega) = C_k^n.
* **Casos favorables a obtener r blancos y k - r negros:**
  n(A) = C_r^b \times C_{k - r}^{n - b}
* **Probabilidad Hipergeométrica Inmediata:**
  P(A) = \frac{C_r^b \cdot C_{k - r}^{n - b}}{C_k^n}
* ¡Elimina la necesidad de calcular fracciones encadenadas de producto en múltiples órdenes!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Truco del "Al Menos Uno": "Uno Menos Ninguno"
* En problemas de probabilidad con múltiples intentos o tiros donde se pregunte:
  *"¿Cuál es la probabilidad de obtener **al menos un** éxito?"*
* **Mnemotecnia:**
  P(\text{al menos uno}) = 1 - P(\text{ninguno})
* Calcular la probabilidad de que **ninguno** ocurra y restarla de 1 evita sumar laboriosamente decenas de casos combinatorios.

### 2. Teorema de Bayes: "La Rama Elegida sobre la Suma de Todas las Ramas"
* En un diagrama de árbol:
  P(\text{Causa } j \mid \text{Resultado}) = \frac{\text{Camino de la rama } j}{\text{Suma de todos los caminos que llegan a ese resultado}}

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Confundir Sucesos Mutuamente Excluyentes con Independientes
> - Dos eventos A y B de probabilidad no nula son **mutuamente excluyentes** si A \cap B = \emptyset \implies P(A \cap B) = 0.
> - Son **independientes** si P(A \cap B) = P(A) \cdot P(B) > 0.
> **Conclusión axiomática:** Dos eventos mutuamente excluyentes con probabilidad positiva **NUNCA pueden ser independientes** (si ocurre uno, la probabilidad de que ocurra el otro se vuelve cero instantáneamente).

> [!WARNING]
> ### Trampa 2: Modificación del Espacio Muestral en Extracciones Sucesivas
> Si se extraen dos cartas de una baraja de 52 naipes:
> - **Con reposición:** n(\Omega) = 52 \times 52.
> - **Sin reposición:** n(\Omega) = 52 \times 51.
> Omitir restar la unidad en el denominador para la segunda extracción es el error clásico de distracción en admisión.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Epidemiología Clínica: Falsos Positivos en Tamizajes de Salud
En la detección de enfermedades raras mediante pruebas serológicas en los centros de salud de Arequipa:
- Supongamos una enfermedad con prevalencia del 1\% (P(E) = 0.01).
- La prueba tiene una sensibilidad del 95\% (P(+ \mid E) = 0.95) y especificidad del 90\% (P(- \mid S) = 0.90 \implies P(+ \mid S) = 0.10).
Si una persona da positivo (+), la probabilidad real de que realmente esté enferma se calcula con el **Teorema de Bayes**:
P(E \mid +) = \frac{0.01 \times 0.95}{(0.01 \times 0.95) + (0.99 \times 0.10)} = \frac{0.0095}{0.0095 + 0.0990} = \frac{0.0095}{0.1085} \approx 8.76\%
¡A pesar de una prueba con 95\% de precisión, la probabilidad de enfermedad real es menor al 9\% debido a la baja prevalencia basal!

---
