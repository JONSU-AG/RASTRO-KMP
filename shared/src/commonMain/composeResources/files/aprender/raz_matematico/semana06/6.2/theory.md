## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
3. Probabilidad del suceso imposible:
   P(\emptyset) = 0
4. **Ley del Complemento:**
   P(A^c) = 1 - P(A)

---

### 3.3 Probabilidad de la Unión de Eventos (Regla de la Adición)
1. **Para Eventos Mutuamente Excluyentes (A \cap B = \emptyset):**
   P(A \cup B) = P(A) + P(B)
2. **Para Eventos No Excluyentes (A \cap B \neq \emptyset):**
   P(A \cup B) = P(A) + P(B) - P(A \cap B)

---

### 3.4 Probabilidad Condicional e Independencia
* **Probabilidad Condicional P(A | B):** Probabilidad de que ocurra el evento A sabiendo de antemano que **ya ocurrió** el evento B:
  P(A | B) = \frac{P(A \cap B)}{P(B)}, \quad \text{con } P(B) > 0
* **Eventos Independientes:** La ocurrencia de B no altera la probabilidad de A:
  P(A | B) = P(A) \iff P(A \cap B) = P(A) \cdot P(B)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| :---: | :---: | :--- | :---: |
| **2** | 1 | (1, 1) | 1/36 |
| **3** | 2 | (1, 2), (2, 1) | 2/36 = 1/18 |
| **4** | 3 | (1, 3), (2, 2), (3, 1) | 3/36 = 1/12 |
| **5** | 4 | (1, 4), (2, 3), (3, 2), (4, 1) | 4/36 = 1/9 |
| **6** | 5 | (1, 5), (2, 4), (3, 3), (4, 2), (5, 1) | 5/36 |
| **7** | **6 (Máxima)** | (1, 6), (2, 5), (3, 4), (4, 3), (5, 2), (6, 1) | **6/36 = 1/6** |
| **8** | 5 | (2, 6), (3, 5), (4, 4), (5, 3), (6, 2) | 5/36 |
| **9** | 4 | (3, 6), (4, 5), (5, 4), (6, 3) | 4/36 = 1/9 |
| **10** | 3 | (4, 6), (5, 5), (6, 4) | 3/36 = 1/12 |
| **11** | 2 | (5, 6), (6, 5) | 2/36 = 1/18 |
| **12** | 1 | (6, 6) | 1/36 |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Extracciones Simultáneas vs. Extracciones Sucesivas sin Reposición
Un gran secreto preuniversitario: **Extraer 3 bolas a la vez es matemáticamente idéntico a extraer una bola tras otra sin reposición.**
* Si hay 5 bolas rojas y 3 azules (total 8), la probabilidad de sacar 2 rojas y 1 azul:
  * *Por Combinatoria:* P = \frac{C_2^5 \cdot C_1^3}{C_3^8} = \frac{10 \times 3}{56} = \frac{30}{56} = \frac{15}{28}.
  * *Por Fracciones Rápidas:* \left(\frac{5}{8} \times \frac{4}{7} \times \frac{3}{6}\right) \times 3 = \frac{60}{336} \times 3 = \frac{180}{336} = \frac{15}{28}.
  *(Usa las fracciones si no recuerdas las fórmulas de combinatoria en el examen).*

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: La Pirámide Simétrica del Dado Doble
> Para la suma de dos dados, la cantidad de casos crece de 1 a 6 y luego decrece de 6 a 1:
> **1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1** (para las sumas del 2 al 12).  
> La suma con mayor probabilidad siempre es el **7** (con 6 casos de 36 \implies P = 1/6).

### Mnemotecnia 2: La Estrategia del "1 Menos Nada"
> Cuando el enunciado diga: **"¿Cuál es la probabilidad de obtener AL MENOS un acierto?"**  
> Aplica:
> P(\ge 1) = 1 - P(\text{CERO Aciertos})
> Calcular la probabilidad de fallar todas las veces y restarla de 1 te ahorra sumar 5 probabilidades distintas.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **"Con reposición" vs. "Sin reposición":**
   * *Con reposición:* El tamaño del espacio muestral n(\Omega) no cambia (eventos independientes).
   * *Sin reposición:* En cada paso el total de casos disminuye en 1 (n, n-1, n-2 \dots).
2. ⚠️ **El orden en extracciones de colores distintos:**
   * Si te piden la probabilidad de obtener "una roja y una azul":
   * **El error común:** Calcular solo P(\text{Roja}) \times P(\text{Azul}).
   * **Lo correcto:** Hay dos secuencias válidas: (\text{Roja, Azul}) o (\text{Azul, Roja}). ¡Debes multiplicar por 2!
3. ⚠️ **Probabilidad condicional informal:**
   * *"Si se sabe que la suma de los dados fue mayor que 8, halle la probabilidad de que ambos dados sean iguales..."*
   * Tu nuevo espacio muestral n(\Omega) ya no es 36; solo abarca los casos donde la suma es 9, 10, 11 o 12 (4 + 3 + 2 + 1 = 10 casos).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Control de Calidad en Pruebas Biomédicas (Arequipa)
En un despistaje de tuberculosis en el Hospital Honorio Delgado de Arequipa, se sabe que una prueba rápida tiene una sensibilidad del 95\% (detecta a los enfermos) y una especificidad del 90\% (descarta a los sanos). Si en una población el 2\% tiene la enfermedad:
* Aunque la prueba salga positiva, la probabilidad real de que una persona esté verdaderamente enferma depende del Teorema de Bayes:
  P(\text{Enfermo} | +) = \frac{0.02 \times 0.95}{(0.02 \times 0.95) + (0.98 \times 0.10)} = \frac{0.019}{0.019 + 0.098} = \frac{0.019}{0.117} \approx 16.24\%
* Este cálculo es vital para que los médicos entiendan por qué una prueba positiva requiere confirmación por cultivo.

---
