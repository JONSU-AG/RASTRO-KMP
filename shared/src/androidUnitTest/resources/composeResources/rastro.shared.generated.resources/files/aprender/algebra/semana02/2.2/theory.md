## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
1. |x| \ge 0, \quad \forall x \in \mathbb{R}; y |x| = 0 \iff x = 0.
2. |-x| = |x|.
3. |x \cdot y| = |x| \cdot |y|.
4. \left|\frac{x}{y}\right| = \frac{|x|}{|y|} \quad (y \neq 0).
5. |x|^2 = |x^2| = x^2 \iff \sqrt{x^2} = |x| *(¡Atención crucial de examen!)*.
6. **Desigualdad Triangular:**
   |a + b| \le |a| + |b|, \quad \forall a, b \in \mathbb{R}
   La igualdad se verifica si y solo si a \cdot b \ge 0.
7. |a - b| \ge ||a| - |b||.

---

### 3.4 Ecuaciones e Inecuaciones con Valor Absoluto

#### 1. Ecuaciones con Valor Absoluto
* **Forma 1:** |A| = b
  |A| = b \iff [b \ge 0] \land [A = b \lor A = -b]
* **Forma 2:** |A| = |B|
  |A| = |B| \iff A = B \lor A = -B
  *(Alternativa cuadrática: |A|^2 = |B|^2 \iff A^2 - B^2 = 0 \iff (A - B)(A + B) = 0)*.

#### 2. Inecuaciones con Valor Absoluto
* **Forma Menor o Igual:** |A| \le b
  |A| \le b \iff [b \ge 0] \land [-b \le A \le b]
* **Forma Mayor o Igual:** |A| \ge b
  |A| \ge b \iff A \ge b \lor A \le -b
* **Forma con Dos Valores Absolutos:** |A| \le |B|
  |A| \le |B| \iff A^2 \le B^2 \iff A^2 - B^2 \le 0 \iff (A - B)(A + B) \le 0

---

### 3.5 Desigualdades Notables
1. Para todo número real x \neq 0:
   x + \frac{1}{x} \ge 2 \quad (\text{si } x > 0)
   x + \frac{1}{x} \le -2 \quad (\text{si } x < 0)
2. **Desigualdad de las Medias (Para reales positivos a, b > 0):**
   MA \ge MG \ge MH \implies \frac{a + b}{2} \ge \sqrt{ab} \ge \frac{2ab}{a + b}
   La igualdad MA = MG se cumple si y solo si a = b.
3. Para todo a, b \in \mathbb{R}:
   a^2 + b^2 \ge 2ab
   (a + b)^2 \ge 4ab

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Inecuación |A| \ge B** | |A| \ge B \iff A \ge B \lor A \le -B |
| **Inecuación Cuadrática Modal** | |A| \le |B| \iff (A - B)(A + B) \le 0 |
| **Desigualdad Triangular** | |a + b| \le |a| + |b| \quad (\text{Igualdad } \iff ab \ge 0) |
| **Desigualdad de Medias** | \frac{a+b}{2} \ge \sqrt{ab} \quad (a, b > 0) |
| **Acotamiento Inverso** | x + \frac{1}{x} \ge 2 \quad (\forall x > 0) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Elevación al Cuadrado en Comparación de Módulos
Para resolver inecuaciones del tipo:
|2x - 3| < |x + 4|
* **Peligro Común:** Intentar abrir 4 ramas de signos por zonas críticas (largo y propenso a errores).
* **El Hack Cuadrático Inmediato:** Como ambos miembros son estrictamente no negativos, elevamos al cuadrado:
  (2x - 3)^2 < (x + 4)^2
  (2x - 3)^2 - (x + 4)^2 < 0
* Aplicamos **diferencia de cuadrados** (u - v)(u + v) < 0:
  [(2x - 3) - (x + 4)] \cdot [(2x - 3) + (x + 4)] < 0
  (x - 7)(3x + 1) < 0
* Puntos críticos inmediatos: x = -\frac{1}{3} y x = 7.
* Como es < 0, tomamos la zona negativa:
  x \in \left\langle -\frac{1}{3}, 7 \right\rangle
* ¡Resuelto en menos de 20 segundos sin zonas críticas!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Inecuaciones de Valor Absoluto: "El Menor Encierra, el Mayor Separa"
* **|x| \le b (Menor):** El valor absoluto queda **encerrado en un sándwich**:
  -b \le x \le b \quad (\text{Intervalo cerrado único})
* **|x| \ge b (Mayor):** La solución se **separa en dos alas infinitas**:
  x \le -b \quad \lor \quad x \ge b \quad (\text{Unión de dos rayos disjuntos})

### 2. Radical Cuadrático: "La Raíz de un Cuadrado no es la Base, es su Módulo"
* \sqrt{x^2} = |x|
* ¡Nunca canceles la raíz con el exponente 2 sin colocar valor absoluto! (Si x = -5, \sqrt{(-5)^2} = \sqrt{25} = 5 = |-5| \neq -5).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Olvidar la Condición de Existencia en |A| = B
> Si te plantean: |3x - 5| = 2x - 10:
> - **El postulado obligatorio es:** B \ge 0 \implies 2x - 10 \ge 0 \implies x \ge 5.
> - Si operas ciegamente: 3x - 5 = 2x - 10 \implies x = -5, o 3x - 5 = -(2x - 10) \implies 5x = 15 \implies x = 3.
> - Ambas soluciones aparentes (-5 y 3) violan la condición x \ge 5.
> - **Conjunto Solución Real:** S = \emptyset (Vacío).
> Si no verificas la condición de no negatividad de B, marcarás una opción con raíces espurias.

> [!WARNING]
> ### Trampa 2: Multiplicar Inecuaciones por Variables de Signo Desconocido
> Si tienes \frac{1}{x} < 2, **NO puedes multiplicar por x** diciendo 1 < 2x, porque desconoces si x es positivo o negativo.
> **Procedimiento obligatorio:** Pasar todo al primer miembro y aplicar puntos críticos:
> \frac{1}{x} - 2 < 0 \implies \frac{1 - 2x}{x} < 0 \implies x \in \langle -\infty, 0 \rangle \cup \left\langle \frac{1}{2}, +\infty \right\rangle

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Tolerancias Dimensionales en Mecánica de Precisión y Minería
En la fabricación de pernos de anclaje para molinos de bolas en minera Cerro Verde, el plano exige un diámetro nominal D_0 = 50\text{ mm} con una tolerancia máxima admisible de \pm 0.08\text{ mm}.
La especificación de control de calidad se formaliza como una inecuación con valor absoluto:
|D - 50| \le 0.08
-0.08 \le D - 50 \le 0.08 \implies 49.92\text{ mm} \le D \le 50.08\text{ mm}
Toda pieza cuyo diámetro caiga fuera de este intervalo cerrado [49.92, 50.08] se descarta como merma metalúrgica.

---
