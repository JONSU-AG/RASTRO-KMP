## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
El término general es un polinomio cuadrático:
t_n = a n^2 + b n + c

#### 📐 Deducción del Método Práctico de las Diferencias (Cuzcano / Lumbreras):
Tomando las diferencias previas imaginarias a la posición 1 (fila cero):
1. **Coeficiente cuadrático (a):**
   2a = \text{segunda diferencia} \implies a = \frac{\text{segunda diferencia}}{2}
2. **Coeficiente lineal (b):**
   a + b = d_1 \quad \text{o equivalentemente} \quad m_0 = a + b \implies b = m_0 - a
3. **Término independiente (c):**
   c = t_0 \quad (\text{el término anterior al primero})

---

### 3.4 Sucesión Geométrica (Progresión Geométrica)
Aquella en la que el cociente entre cualquier término y su predecesor inmediato es una constante llamada **razón geométrica** (q).
t_1, \quad t_1 \cdot q, \quad t_1 \cdot q^2, \quad \dots, \quad t_n = t_1 \cdot q^{n-1}

---

### 3.5 Sucesiones Especiales de Alta Frecuencia en Exámenes

1. **Sucesión de Fibonacci:** Cada término a partir del tercero es la suma de los dos anteriores:
   1, 1, 2, 3, 5, 8, 13, 21, 34, 55, \dots \quad \implies \quad F_n = F_{n-1} + F_{n-2}, \quad F_1 = 1, F_2 = 1
2. **Sucesión de Lucas:**
   2, 1, 3, 4, 7, 11, 18, 29, 47, \dots \quad \implies \quad L_n = L_{n-1} + L_{n-2}, \quad L_1 = 2, L_2 = 1
3. **Sucesión de Números Primos (Trampa típica):**
   2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, \dots
   *(No tiene fórmula polinomial simple; se identifica por la propiedad de indivisibilidad).*
4. **Sucesión de Números Triangulares:**
   1, 3, 6, 10, 15, 21, 28, \dots \quad \implies \quad T_n = \frac{n(n+1)}{2}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Primeros n cuadrados** | \sum_{k=1}^n k^2 = 1^2 + 2^2 + 3^2 + \dots + n^2 | \frac{n(n + 1)(2n + 1)}{6} |
| **Primeros n cubos** | \sum_{k=1}^n k^3 = 1^3 + 2^3 + 3^3 + \dots + n^3 | \left[ \frac{n(n + 1)}{2} \right]^2 |
| **Productos consecutivos binarios** | \sum_{k=1}^n k(k + 1) = 1\cdot 2 + 2\cdot 3 + \dots + n(n + 1) | \frac{n(n + 1)(n + 2)}{3} |

### 4.2 Suma Límite de Serie Geométrica Decreciente e Infinita (Convergente)
Para una serie geométrica infinita con razón |q| < 1:
S = t_1 + t_1 q + t_1 q^2 + t_1 q^3 + \dots = \frac{t_1}{1 - q}

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del "Término Cero" (t_0)
Para hallar el término enésimo de una progresión aritmética sin usar la fórmula larga t_n = t_1 + (n-1)r:
1. Identifica la razón r.
2. Multiplica r por n \to (r \cdot n).
3. Retrocede un paso antes de t_1 restando la razón: t_0 = t_1 - r.
4. **Escribe directo:** t_n = r\cdot n + t_0.
*Ejemplo:* Para 7, 11, 15, 19, \dots (r = 4):  
El término anterior al 7 es 7 - 4 = +3.  
👉 **t_n = 4n + 3** (Sin hojas de cálculo ni despejes).

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: Para la Sucesión Cuadrática
> **"MIRE A CERO"** \to Regla **a, b, c**:
> * **2a** = abajo (la segunda diferencia).
> * **a + b** = al medio (la primera diferencia antes del primer término).
> * **c** = arriba (el término cero t_0).

### Mnemotecnia 2: Suma de Impares Consecutivos
> **"El Último se Iguala a 2n - 1 y se Eleva al Cuadrado"**  
> Si te piden: 1 + 3 + 5 + \dots + 39:
> 1. Haces 2n - 1 = 39 \implies 2n = 40 \implies n = 20.
> 2. Respuesta instantánea: S = n^2 = 20^2 = \mathbf{400}. (Tiempo de resolución: 4 segundos).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Confundir el Último Término (t_n) con el Número de Términos (n):**
   * En sumatorias de impares: 1 + 3 + 5 + \dots + 19.
   * **El error típico:** Elevar 19^2 = 361 (¡MAL!).
   * **Lo correcto:** El último término es 2n - 1 = 19 \implies n = 10 \implies 10^2 = 100.
2. ⚠️ **La trampa del número primo "2" y el número "1":**
   * El número **1 NO es primo**.
   * El número **2 es el ÚNICO primo par**. En sucesiones de primos, si ves 2, 3, 5, 7, 11, \dots muchos marcan 9 pensando en impares.
3. ⚠️ **Figuras rotadas en distribuciones gráficas:**
   * En la UNSA, si una distribución gráfica usa triángulos o círculos, la operación matemática siempre respeta la posición homóloga (arriba con arriba, bases con bases). No mezcles vértices en figuras distintas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización en Almacenes Logísticos (Enfoque San Marcos / UNSA)
Una empresa de distribución en el Parque Industrial de Arequipa apila sacos de grano en forma trapezoidal. La primera fila sobre el piso tiene 40 sacos, y cada fila superior tiene 2 sacos menos que la anterior. Si la fila superior tiene 12 sacos:
* Se modela como una Progresión Aritmética decreciente con r = -2, t_1 = 40, t_n = 12.
* Número de filas: n = \frac{12 - 40}{-2} + 1 = 15 \text{ filas}.
* Total de sacos almacenados: S = \left(\frac{40 + 12}{2}\right) \cdot 15 = 26 \cdot 15 = \mathbf{390 \text{ sacos}}.

---
