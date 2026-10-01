# TEMA 01 · RAZONAMIENTO NUMÉRICO Y REGULARIDADES
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Matemático  
**Código del Tema:** `APT_RM_01`  
**Target Universidades:** `[UNSA: 100% Frecuente (1-2 preguntas por examen)] [UNMSM: Enfoque DECO] [UNI: Regularidades polinomiales y de orden superior]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Series alfanuméricas, matrices numéricas con figuras, distribuciones gráficas y sucesiones aritméticas/geométricas. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: problemas contextualizados en finanzas, crecimiento poblacional, secuencias de producción industrial. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Sucesiones de segundo orden (cuadráticas), sucesiones recurrentes tipo Fibonacci generalizado y sumatorias polinómicas. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Analizar e identificar patrones, regularidades y leyes de correspondencia numérica.
2. Inferir la regla de formación analítica en series numéricas lineales, cuadráticas, figurativas y mixtas.
3. Establecer relaciones operativas entre números para modelar situaciones problemáticas.
4. Aplicar propiedades básicas de la teoría de números (paridad, divisibilidad, primalidad) como herramienta de deducción rápida.
5. Emplear la estimación, acotación y aproximación de resultados como filtro de validación y descarte veloz de alternativas.

---

## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Lineal o de 1.er Orden (Razón constante)
                               ├─ Cuadrática o de 2.° Orden (Método de diferencias)
        ┌─ 1. Sucesiones ─────┼─ Geométrica (Cociente constante)
        │      Numéricas       ├─ Polinomial de Orden Superior
        │                      ├─ Especiales (Fibonacci, Lucas, Tribonacci, Números Primos)
        │                      └─ Mixtas / Alternadas
        │
RAZONAMIENTO                   ┌─ Distribuciones Numéricas Lineales
NUMÉRICO ───┼─ 2. Arreglos y ──────┼─ Matrices y Cuadros Numéricos (Fila vs. Columna)
        │      Distribuciones  └─ Distribuciones Gráficas y Figurativas (Homología operativa)
        │
        │                      ┌─ Sumatorias Notables (Gauss, pares, impares, cuadrados)
        └─ 3. Series y Sumas ──┼─ Series Aritméticas y Geométricas Infinitas (Convergentes)
                               └─ Estimación y Acotamiento Rápido de Resultados
```

---

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Concepto Formal de Sucesión Numérica
Una sucesión numérica es una **función matemática discreta** cuyo dominio es el conjunto de los números enteros positivos $\mathbb{Z}^+ = \{1, 2, 3, \dots, n\}$ y cuyo codominio es el conjunto de los números reales $\mathbb{R}$:
$$f: \mathbb{Z}^+ \to \mathbb{R}, \quad f(n) = t_n$$
Donde $t_n$ representa el **término enésimo** o término general de la sucesión.

---

### 3.2 Sucesión Aritmética de Primer Orden (Lineal o Progresión Aritmética)
Es aquella en la que la diferencia entre dos términos consecutivos cualesquiera es una constante denominada **razón aritmética** ($r$).

**Forma general:**
$$t_1, \quad t_2 = t_1 + r, \quad t_3 = t_1 + 2r, \quad \dots, \quad t_n = t_1 + (n - 1)r$$

* **Fórmula canónica del término enésimo:**
  $$t_n = r \cdot n + t_0$$
  Donde $t_0$ es el **término anterior al primero** ($t_0 = t_1 - r$).
* **Número de términos ($n$):**
  $$n = \frac{t_n - t_1}{r} + 1 = \frac{t_n - t_0}{r}$$

---

### 3.3 Sucesión de Segundo Orden (Sucesión Cuadrática)
Es aquella cuya razón se vuelve constante recién en el **segundo nivel de diferencias sucesivas**.

**Estructura:**
$$\begin{array}{ccccccccc}
t_0 & & t_1 & & t_2 & & t_3 & & t_4 \\
 & m_0 & & d_1 & & d_2 & & d_3 & \\
 & & 2a & & 2a & & 2a & &
\end{array}$$

El término general es un polinomio cuadrático:
$$t_n = a n^2 + b n + c$$

#### 📐 Deducción del Método Práctico de las Diferencias (Cuzcano / Lumbreras):
Tomando las diferencias previas imaginarias a la posición 1 (fila cero):
1. **Coeficiente cuadrático ($a$):**
   $$2a = \text{segunda diferencia} \implies a = \frac{\text{segunda diferencia}}{2}$$
2. **Coeficiente lineal ($b$):**
   $$a + b = d_1 \quad \text{o equivalentemente} \quad m_0 = a + b \implies b = m_0 - a$$
3. **Término independiente ($c$):**
   $$c = t_0 \quad (\text{el término anterior al primero})$$

---

### 3.4 Sucesión Geométrica (Progresión Geométrica)
Aquella en la que el cociente entre cualquier término y su predecesor inmediato es una constante llamada **razón geométrica** ($q$).
$$t_1, \quad t_1 \cdot q, \quad t_1 \cdot q^2, \quad \dots, \quad t_n = t_1 \cdot q^{n-1}$$

---

### 3.5 Sucesiones Especiales de Alta Frecuencia en Exámenes

1. **Sucesión de Fibonacci:** Cada término a partir del tercero es la suma de los dos anteriores:
   $$1, 1, 2, 3, 5, 8, 13, 21, 34, 55, \dots \quad \implies \quad F_n = F_{n-1} + F_{n-2}, \quad F_1 = 1, F_2 = 1$$
2. **Sucesión de Lucas:**
   $$2, 1, 3, 4, 7, 11, 18, 29, 47, \dots \quad \implies \quad L_n = L_{n-1} + L_{n-2}, \quad L_1 = 2, L_2 = 1$$
3. **Sucesión de Números Primos (Trampa típica):**
   $$2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, \dots$$
   *(No tiene fórmula polinomial simple; se identifica por la propiedad de indivisibilidad).*
4. **Sucesión de Números Triangulares:**
   $$1, 3, 6, 10, 15, 21, 28, \dots \quad \implies \quad T_n = \frac{n(n+1)}{2}$$

---

## 4. 📐 FORMULARIO MAESTRO DE SERIES Y SUMATORIAS

### 4.1 Sumatorias Fundamentales

| Nombre de la Serie | Expresión Matemática | Fórmula Cerrada |
| :--- | :--- | :---: |
| **Primeros $n$ naturales** | $\sum_{k=1}^n k = 1 + 2 + 3 + \dots + n$ | $$\frac{n(n + 1)}{2}$$ |
| **Primeros $n$ números pares** | $\sum_{k=1}^n 2k = 2 + 4 + 6 + \dots + 2n$ | $$n(n + 1)$$ |
| **Primeros $n$ números impares** | $\sum_{k=1}^n (2k - 1) = 1 + 3 + 5 + \dots + (2n - 1)$ | $$n^2$$ |
| **Primeros $n$ cuadrados** | $\sum_{k=1}^n k^2 = 1^2 + 2^2 + 3^2 + \dots + n^2$ | $$\frac{n(n + 1)(2n + 1)}{6}$$ |
| **Primeros $n$ cubos** | $\sum_{k=1}^n k^3 = 1^3 + 2^3 + 3^3 + \dots + n^3$ | $$\left[ \frac{n(n + 1)}{2} \right]^2$$ |
| **Productos consecutivos binarios** | $\sum_{k=1}^n k(k + 1) = 1\cdot 2 + 2\cdot 3 + \dots + n(n + 1)$ | $$\frac{n(n + 1)(n + 2)}{3}$$ |

### 4.2 Suma Límite de Serie Geométrica Decreciente e Infinita (Convergente)
Para una serie geométrica infinita con razón $|q| < 1$:
$$S = t_1 + t_1 q + t_1 q^2 + t_1 q^3 + \dots = \frac{t_1}{1 - q}$$

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: Para la Sucesión Cuadrática
> **"MIRE A CERO"** $\to$ Regla **$a, b, c$**:
> * **$2a$** = abajo (la segunda diferencia).
> * **$a + b$** = al medio (la primera diferencia antes del primer término).
> * **$c$** = arriba (el término cero $t_0$).

### Mnemotecnia 2: Suma de Impares Consecutivos
> **"El Último se Iguala a $2n - 1$ y se Eleva al Cuadrado"**  
> Si te piden: $1 + 3 + 5 + \dots + 39$:
> 1. Haces $2n - 1 = 39 \implies 2n = 40 \implies n = 20$.
> 2. Respuesta instantánea: $S = n^2 = 20^2 = \mathbf{400}$. (Tiempo de resolución: 4 segundos).

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del "Término Cero" ($t_0$)
Para hallar el término enésimo de una progresión aritmética sin usar la fórmula larga $t_n = t_1 + (n-1)r$:
1. Identifica la razón $r$.
2. Multiplica $r$ por $n$ $\to (r \cdot n)$.
3. Retrocede un paso antes de $t_1$ restando la razón: $t_0 = t_1 - r$.
4. **Escribe directo:** $t_n = r\cdot n + t_0$.
*Ejemplo:* Para $7, 11, 15, 19, \dots$ ($r = 4$):  
El término anterior al 7 es $7 - 4 = +3$.  
👉 **$t_n = 4n + 3$** (Sin hojas de cálculo ni despejes).

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Confundir el Último Término ($t_n$) con el Número de Términos ($n$):**
   * En sumatorias de impares: $1 + 3 + 5 + \dots + 19$.
   * **El error típico:** Elevar $19^2 = 361$ (¡MAL!).
   * **Lo correcto:** El último término es $2n - 1 = 19 \implies n = 10 \implies 10^2 = 100$.
2. ⚠️ **La trampa del número primo "2" y el número "1":**
   * El número **1 NO es primo**.
   * El número **2 es el ÚNICO primo par**. En sucesiones de primos, si ves $2, 3, 5, 7, 11, \dots$ muchos marcan 9 pensando en impares.
3. ⚠️ **Figuras rotadas en distribuciones gráficas:**
   * En la UNSA, si una distribución gráfica usa triángulos o círculos, la operación matemática siempre respeta la posición homóloga (arriba con arriba, bases con bases). No mezcles vértices en figuras distintas.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización en Almacenes Logísticos (Enfoque San Marcos / UNSA)
Una empresa de distribución en el Parque Industrial de Arequipa apila sacos de grano en forma trapezoidal. La primera fila sobre el piso tiene 40 sacos, y cada fila superior tiene 2 sacos menos que la anterior. Si la fila superior tiene 12 sacos:
* Se modela como una Progresión Aritmética decreciente con $r = -2$, $t_1 = 40$, $t_n = 12$.
* Número de filas: $n = \frac{12 - 40}{-2} + 1 = 15 \text{ filas}$.
* Total de sacos almacenados: $S = \left(\frac{40 + 12}{2}\right) \cdot 15 = 26 \cdot 15 = \mathbf{390 \text{ sacos}}$.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Patrones Numéricos)
Halle el término que continúa en la sucesión:
$$4, \quad 7, \quad 12, \quad 19, \quad 28, \quad ?$$
A) 37  
B) 39  
C) 41  
D) 38  
E) 40  

**Solución Paso a Paso:**
1. Calculamos las diferencias entre términos sucesivos:
   - $7 - 4 = +3$
   - $12 - 7 = +5$
   - $19 - 12 = +7$
   - $28 - 19 = +9$
2. Observamos que las diferencias forman la sucesión de números impares consecutivos: $3, 5, 7, 9, \dots$
3. La siguiente diferencia debe ser $9 + 2 = 11$.
4. Por lo tanto: $? = 28 + 11 = \mathbf{39}$.  
**Clave: B**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Distribución Numérica)
Determine el valor de $x$ en el siguiente arreglo:
$$\begin{array}{ccc}
5 & (23) & 3 \\
6 & (28) & 4 \\
7 & (x) & 5
\end{array}$$
A) 33  
B) 35  
C) 39  
D) 40  
E) 42  

**Solución Paso a Paso:**
1. Analizamos la fila 1 para relacionar los extremos con el centro:
   - Posible relación: $5 \times 3 = 15$ ($15 + 8 = 23$)
   - Analicemos potencias: $5^2 - 3 = 25 - 3 = 22 \neq 23$.
   - Probemos: $(5 \times 4) + 3 = 23$.
2. Verificamos con la fila 2:
   - $(6 \times 4) + 4 = 24 + 4 = 28$. ¡Cumple perfectamente!
3. Aplicamos la misma ley de formación a la fila 3:
   - $x = (7 \times 4) + 5 = 28 + 5 = \mathbf{33}$.  
**Clave: A**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Contextualizado)
Un laboratorio farmacéutico en Cayma evalúa la proliferación de un cultivo celular de control. El primer día se registran $6$ colonias, el segundo día $15$, el tercer día $28$, el cuarto día $45$, y así sucesivamente. ¿Cuántas colonias se registrarán exactamente en el vigésimo ($20.°$) día?
A) 840  
B) 861  
C) 825  
D) 900  
E) 780  

**Solución Paso a Paso:**
1. Escribimos la sucesión:
   $$6, \quad 15, \quad 28, \quad 45, \quad \dots$$
2. Hallamos las primeras diferencias:
   - $15 - 6 = 9$
   - $28 - 15 = 13$
   - $45 - 28 = 17$
3. Hallamos las segundas diferencias:
   - $13 - 9 = +4$
   - $17 - 13 = +4$ (Segunda diferencia constante $\implies$ Sucesión cuadrática).
4. Aplicamos el método práctico hallando los valores previos ficticios ($t_0$):
   - Segunda diferencia: $2a = 4 \implies \mathbf{a = 2}$.
   - Primera diferencia previa $m_0$: $9 - 4 = 5$.
   - Relación: $a + b = m_0 \implies 2 + b = 5 \implies \mathbf{b = 3}$.
   - Término cero $t_0$: $6 - 5 = 1 \implies \mathbf{c = 1}$.
5. Término general:
   $$t_n = 2n^2 + 3n + 1$$
6. Evaluamos para el día $n = 20$:
   $$t_{20} = 2(20)^2 + 3(20) + 1 = 2(400) + 60 + 1 = 800 + 61 = \mathbf{861}$$.  
**Clave: B**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Serie de Fracciones)
Calcule el valor de la siguiente suma infinita:
$$S = \frac{1}{2} + \frac{2}{4} + \frac{3}{8} + \frac{4}{16} + \frac{5}{32} + \dots$$
A) $1$  
B) $\frac{3}{2}$  
C) $2$  
D) $\frac{5}{2}$  
E) $3$  

**Solución Paso a Paso:**
Esta es una serie **aritmético-geométrica**:
1. Escribimos la serie completa:
   $$S = \frac{1}{2} + \frac{2}{4} + \frac{3}{8} + \frac{4}{16} + \frac{5}{32} + \dots \quad \text{(Ecuación 1)}$$
2. Multiplicamos toda la ecuación por la razón geométrica común ($q = \frac{1}{2}$):
   $$\frac{1}{2} S = \frac{1}{4} + \frac{2}{8} + \frac{3}{16} + \frac{4}{32} + \dots \quad \text{(Ecuación 2)}$$
3. Restamos miembro a miembro la (Ecuación 1) menos la (Ecuación 2):
   $$S - \frac{1}{2} S = \frac{1}{2} + \left(\frac{2}{4} - \frac{1}{4}\right) + \left(\frac{3}{8} - \frac{2}{8}\right) + \left(\frac{4}{16} - \frac{3}{16}\right) + \dots$$
   $$\frac{1}{2} S = \frac{1}{2} + \frac{1}{4} + \frac{1}{8} + \frac{1}{16} + \dots$$
4. El lado derecho es una progresión geométrica pura decreciente infinita con $t_1 = \frac{1}{2}$ y $q = \frac{1}{2}$:
   $$\text{Suma derecha} = \frac{t_1}{1 - q} = \frac{\frac{1}{2}}{1 - \frac{1}{2}} = \frac{\frac{1}{2}}{\frac{1}{2}} = 1$$
5. Igualamos:
   $$\frac{1}{2} S = 1 \implies S = \mathbf{2}$$.  
**Clave: C**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Demostración y Límite)
Se define la sucesión recurrente:
$$a_1 = \sqrt{6}, \quad a_{n+1} = \sqrt{6 + a_n} \quad \text{para } n \ge 1$$
Si se sabe que la sucesión converge a un límite real $L$, halle el valor de $L$.
A) $\sqrt{6}$  
B) $2$  
C) $3$  
D) $6$  
E) No converge  

**Solución Paso a Paso:**
1. Si la sucesión converge a un límite $L$, se cumple que:
   $$\lim_{n \to \infty} a_n = L \quad \text{y también} \quad \lim_{n \to \infty} a_{n+1} = L$$
2. Tomando límite en ambos miembros de la ecuación de recurrencia:
   $$L = \sqrt{6 + L}$$
3. Elevamos ambos miembros al cuadrado (con la condición $L > 0$):
   $$L^2 = 6 + L \implies L^2 - L - 6 = 0$$
4. Factorizamos por aspa simple:
   $$(L - 3)(L + 2) = 0$$
5. Las raíces son $L_1 = 3$ y $L_2 = -2$.
6. Como todos los términos de la raíz cuadrada son positivos, descartamos la raíz negativa.
7. Por lo tanto: $L = \mathbf{3}$.  
**Clave: C**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Razón Aritmética:** Diferencia constante entre dos términos consecutivos de una progresión aritmética.
2. **Razón Geométrica:** Cociente constante entre un término y su precedente en una progresión geométrica.
3. **Término Enésimo ($t_n$):** Expresión analítica que determina el valor de cualquier elemento de una sucesión en función de su índice posicional $n$.
4. **Sucesión Recurrente:** Aquella cuyos términos se definen a partir de uno o más términos precedentes (ej. Fibonacci).
5. **Serie:** Suma formal de los términos de una sucesión numérica.
6. **Serie Convergente:** Aquella serie infinita cuya suma acumulada se aproxima a un número real finito y determinado.
7. **Método de Diferencias:** Algoritmo analítico para hallar el grado polinomial de una sucesión mediante restas sucesivas entre términos consecutivos.
8. **Paridad:** Propiedad intrínseca de los números enteros que clasifica a un valor como par ($2k$) o impar ($2k - 1$).
9. **Homología Operativa:** Correspondencia idéntica de operaciones algebraicas entre los elementos simétricos de figuras o matrices numéricas.
10. **Término Cero ($t_0$):** Elemento imaginario de orden posicional $n = 0$, que coincide con el término independiente del polinomio de la sucesión.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Cuál es la fórmula para la suma de los primeros $n$ números impares consecutivos?  
  **A:** $S_n = n^2$, donde $n$ es la cantidad de términos (obtenida igualando el último término a $2n - 1$).
* **Q:** En una sucesión cuadrática $t_n = an^2 + bn + c$, ¿a qué equivale la segunda diferencia constante?  
  **A:** Equivale exactamente a $2a$, por lo que $a = \frac{\text{segunda diferencia}}{2}$.
* **Q:** ¿A qué equivale la suma límite de una serie geométrica decreciente infinita ($|q| < 1$)?  
  **A:** $S = \frac{t_1}{1 - q}$.
* **Q:** ¿Cuál es la suma de los $n$ primeros números naturales?  
  **A:** $S_n = \frac{n(n + 1)}{2}$.
* **Q:** ¿El número 1 es clasificado como número primo?  
  **A:** No, el 1 es una unidad simple; el primer número primo y único par es el 2.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RM_01",
  "title": "Razonamiento Numérico y Regularidades",
  "required_level": 1,
  "xp_reward": 150,
  "gems_reward": 15,
  "skills": ["Detección de Patrones", "Sucesiones Cuadráticas", "Sumatorias Rápidas"],
  "boss_challenge": {
    "boss_name": "El Guardián de Fibonacci",
    "question": "Dada la sucesión an+1 = sqrt(6 + an) con a1 = sqrt(6), ¿cuál es el valor del límite L?",
    "options": ["sqrt(6)", "2", "3", "6"],
    "correct_index": 2,
    "explanation": "Al resolver L = sqrt(6 + L) elevando al cuadrado se obtiene L^2 - L - 6 = 0, cuya solución positiva es L = 3."
  }
}
```
