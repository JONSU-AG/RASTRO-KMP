# TEMA 06 · PROBABILIDAD INTUITIVA Y CONDICIONAL
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Matemático  
**Código del Tema:** `APT_RM_06`  
**Target Universidades:** `[UNSA: 100% Frecuente (1 pregunta por examen)] [UNMSM: Enfoque DECO epidemiología, juegos justos y control de calidad] [UNI: Probabilidad condicional, variables discretas y urnas con reposición/sin reposición]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Regla de Laplace (casos favorables / casos totales), monedas, dados, barajas de 52 cartas, y extracción de bolas de urnas. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: probabilidad condicional en diagnósticos médicos (falsos positivos/negativos), loterías y probabilidad geométrica. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Teorema de Bayes, probabilidad total, eventos independientes vs. dependientes, y extracciones sucesivas sin reposición. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar, describir y cuantificar el espacio muestral ($\Omega$) de experimentos aleatorios discretos.
2. Comparar la probabilidad intuitiva de diversos sucesos clasificándolos en seguros, probables, imposibles o equiprobables.
3. Interpretar y aplicar la definición clásica de probabilidad (Regla de Laplace) en contextos cotidianos y técnicos.
4. Calcular probabilidades de eventos compuestos mediante reglas de adición (sucesos mutuamente excluyentes o no excluyentes).
5. Resolver situaciones de extracciones sucesivas con y sin reposición aplicando el principio de la probabilidad condicional.

---

## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Experimento Determinístico (Resultado predecible)
        ┌─ 1. Conceptos ───────┼─ Experimento Aleatorio (Regido por el azar)
        │      Fundamentales   ├─ Espacio Muestral (Omega: Conjunto de todos los resultados)
        │                      └─ Suceso o Evento (Subconjunto de Omega: Seguro, Imposible)
        │
PROBABILIDAD                   ┌─ Regla Clásica de Laplace: P(A) = Casos Favorables / Casos Totales
INTUITIVA ──────┼─ 2. Cálculo de ──────┼─ Propiedades Axiomáticas: 0 <= P(A) <= 1
        │      Probabilidades  └─ Probabilidad del Suceso Contrario (Complemento): P(A') = 1 - P(A)
        │
        │                      ┌─ Eventos Mutuamente Excluyentes (P(A U B) = P(A) + P(B))
        ├─ 3. Álgebra de ──────┼─ Eventos No Excluyentes (P(A U B) = P(A) + P(B) - P(A n B))
        │      Sucesos         └─ Eventos Independientes (P(A n B) = P(A) * P(B))
        │
        └─ 4. Probabilidad ────┌─ Probabilidad Condicional: P(A|B) = P(A n B) / P(B)
               Avanzada        ├─ Extracciones en Urnas: Con Reposición vs. Sin Reposición
               y Bayes         └─ Teorema de Probabilidad Total y Teorema de Bayes
```

---

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Experimento Aleatorio ($\varepsilon$), Espacio Muestral ($\Omega$) y Suceso ($A$)
* **Experimento Aleatorio ($\varepsilon$):** Toda prueba o fenómeno cuyo resultado no se puede predecir con exactitud antes de realizarlo, aún conociendo todas las condiciones iniciales (ej. lanzar dos dados y registrar la suma).
* **Espacio Muestral ($\Omega$):** El conjunto universal formado por **todos los resultados posibles** del experimento aleatorio.
  * *Lanzar dos monedas:* $\Omega = \{(C, C), (C, S), (S, C), (S, S)\} \implies n(\Omega) = 2^2 = 4$.
  * *Lanzar dos dados:* $\Omega = \{(1, 1), (1, 2), \dots, (6, 6)\} \implies n(\Omega) = 6^2 = 36$.
* **Suceso o Evento ($A$):** Cualquier subconjunto del espacio muestral ($A \subseteq \Omega$).
  * **Suceso Seguro:** $A = \Omega \implies P(A) = 1$.
  * **Suceso Imposible:** $A = \emptyset \implies P(A) = 0$.

---

### 3.2 Definición Clásica de Probabilidad (Regla de Laplace)
Si todos los sucesos elementales del espacio muestral $\Omega$ son **equiprobables** (tienen la misma posibilidad física de ocurrir):
$$P(A) = \frac{n(A)}{n(\Omega)} = \frac{\text{Número de casos favorables al suceso } A}{\text{Número total de casos posibles}}$$

#### Axiomas Fundamentales de Kolmogorov:
1. Para todo suceso $A$:
   $$0 \le P(A) \le 1$$
2. Probabilidad del espacio muestral completo:
   $$P(\Omega) = 1$$
3. Probabilidad del suceso imposible:
   $$P(\emptyset) = 0$$
4. **Ley del Complemento:**
   $$P(A^c) = 1 - P(A)$$

---

### 3.3 Probabilidad de la Unión de Eventos (Regla de la Adición)
1. **Para Eventos Mutuamente Excluyentes ($A \cap B = \emptyset$):**
   $$P(A \cup B) = P(A) + P(B)$$
2. **Para Eventos No Excluyentes ($A \cap B \neq \emptyset$):**
   $$P(A \cup B) = P(A) + P(B) - P(A \cap B)$$

---

### 3.4 Probabilidad Condicional e Independencia
* **Probabilidad Condicional $P(A | B)$:** Probabilidad de que ocurra el evento $A$ sabiendo de antemano que **ya ocurrió** el evento $B$:
  $$P(A | B) = \frac{P(A \cap B)}{P(B)}, \quad \text{con } P(B) > 0$$
* **Eventos Independientes:** La ocurrencia de $B$ no altera la probabilidad de $A$:
  $$P(A | B) = P(A) \iff P(A \cap B) = P(A) \cdot P(B)$$

---

## 4. 📐 FORMULARIO MAESTRO DE EXPERIMENTOS CLÁSICOS

### 4.1 Estructura Oficial de una Baraja Clásica (Naipe Inglés de 52 Cartas)
Indispensable memorizar para preguntas de la UNSA:
* **Total de cartas:** $52$ (divididas en 4 palos de 13 cartas cada uno).
* **Palos Negros (26 cartas):** Espadas ($\spadesuit$) y Tréboles ($\clubsuit$).
* **Palos Rojos (26 cartas):** Corazones ($\heartsuit$) y Diamantes ($\diamondsuit$).
* **Cartas por Palo:** As ($A$), $2, 3, 4, 5, 6, 7, 8, 9, 10$, y las figuras: Jack ($J$), Reina ($Q$), Rey ($K$).
* **Total de Figuras (Con rostro):** $12$ cartas ($4 \text{ Jacks}, 4 \text{ Reinas}, 4 \text{ Reyes}$).
* **Total de Ases:** $4$ ases.

### 4.2 Lanzamiento de Dos Dados: Tabla de Sumas (Total = 36 casos)

| Suma | Casos Favorables | Pares Ordenados $(D_1, D_2)$ | Probabilidad |
| :---: | :---: | :--- | :---: |
| **2** | 1 | $(1, 1)$ | $1/36$ |
| **3** | 2 | $(1, 2), (2, 1)$ | $2/36 = 1/18$ |
| **4** | 3 | $(1, 3), (2, 2), (3, 1)$ | $3/36 = 1/12$ |
| **5** | 4 | $(1, 4), (2, 3), (3, 2), (4, 1)$ | $4/36 = 1/9$ |
| **6** | 5 | $(1, 5), (2, 4), (3, 3), (4, 2), (5, 1)$ | $5/36$ |
| **7** | **6 (Máxima)** | $(1, 6), (2, 5), (3, 4), (4, 3), (5, 2), (6, 1)$ | **$6/36 = 1/6$** |
| **8** | 5 | $(2, 6), (3, 5), (4, 4), (5, 3), (6, 2)$ | $5/36$ |
| **9** | 4 | $(3, 6), (4, 5), (5, 4), (6, 3)$ | $4/36 = 1/9$ |
| **10** | 3 | $(4, 6), (5, 5), (6, 4)$ | $3/36 = 1/12$ |
| **11** | 2 | $(5, 6), (6, 5)$ | $2/36 = 1/18$ |
| **12** | 1 | $(6, 6)$ | $1/36$ |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: La Pirámide Simétrica del Dado Doble
> Para la suma de dos dados, la cantidad de casos crece de 1 a 6 y luego decrece de 6 a 1:
> **1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1** (para las sumas del 2 al 12).  
> La suma con mayor probabilidad siempre es el **7** (con 6 casos de 36 $\implies P = 1/6$).

### Mnemotecnia 2: La Estrategia del "1 Menos Nada"
> Cuando el enunciado diga: **"¿Cuál es la probabilidad de obtener AL MENOS un acierto?"**  
> Aplica:
> $$P(\ge 1) = 1 - P(\text{CERO Aciertos})$$
> Calcular la probabilidad de fallar todas las veces y restarla de 1 te ahorra sumar 5 probabilidades distintas.

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Extracciones Simultáneas vs. Extracciones Sucesivas sin Reposición
Un gran secreto preuniversitario: **Extraer 3 bolas a la vez es matemáticamente idéntico a extraer una bola tras otra sin reposición.**
* Si hay 5 bolas rojas y 3 azules (total 8), la probabilidad de sacar 2 rojas y 1 azul:
  * *Por Combinatoria:* $P = \frac{C_2^5 \cdot C_1^3}{C_3^8} = \frac{10 \times 3}{56} = \frac{30}{56} = \frac{15}{28}$.
  * *Por Fracciones Rápidas:* $\left(\frac{5}{8} \times \frac{4}{7} \times \frac{3}{6}\right) \times 3 = \frac{60}{336} \times 3 = \frac{180}{336} = \frac{15}{28}$.
  *(Usa las fracciones si no recuerdas las fórmulas de combinatoria en el examen).*

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **"Con reposición" vs. "Sin reposición":**
   * *Con reposición:* El tamaño del espacio muestral $n(\Omega)$ no cambia (eventos independientes).
   * *Sin reposición:* En cada paso el total de casos disminuye en 1 ($n, n-1, n-2 \dots$).
2. ⚠️ **El orden en extracciones de colores distintos:**
   * Si te piden la probabilidad de obtener "una roja y una azul":
   * **El error común:** Calcular solo $P(\text{Roja}) \times P(\text{Azul})$.
   * **Lo correcto:** Hay dos secuencias válidas: $(\text{Roja, Azul})$ o $(\text{Azul, Roja})$. ¡Debes multiplicar por 2!
3. ⚠️ **Probabilidad condicional informal:**
   * *"Si se sabe que la suma de los dados fue mayor que 8, halle la probabilidad de que ambos dados sean iguales..."*
   * Tu nuevo espacio muestral $n(\Omega)$ ya no es 36; solo abarca los casos donde la suma es 9, 10, 11 o 12 ($4 + 3 + 2 + 1 = 10$ casos).

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Control de Calidad en Pruebas Biomédicas (Arequipa)
En un despistaje de tuberculosis en el Hospital Honorio Delgado de Arequipa, se sabe que una prueba rápida tiene una sensibilidad del $95\%$ (detecta a los enfermos) y una especificidad del $90\%$ (descarta a los sanos). Si en una población el $2\%$ tiene la enfermedad:
* Aunque la prueba salga positiva, la probabilidad real de que una persona esté verdaderamente enferma depende del Teorema de Bayes:
  $$P(\text{Enfermo} | +) = \frac{0.02 \times 0.95}{(0.02 \times 0.95) + (0.98 \times 0.10)} = \frac{0.019}{0.019 + 0.098} = \frac{0.019}{0.117} \approx 16.24\%$$
* Este cálculo es vital para que los médicos entiendan por qué una prueba positiva requiere confirmación por cultivo.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Dados y Cartas)
Al lanzar dos dados comunes y no cargados, ¿cuál es la probabilidad de que la suma de los puntos obtenidos sea un número primo?
A) $5/12$  
B) $7/18$  
C) $1/2$  
D) $13/36$  
E) $5/18$  

**Solución Paso a Paso:**
1. Casos totales al lanzar 2 dados:
   $$n(\Omega) = 6 \times 6 = 36$$
2. Las sumas posibles varían del 2 al 12. Los números primos en este rango son: $\{2, 3, 5, 7, 11\}$.
3. Contamos los casos favorables para cada suma prima:
   - Suma 2: $(1, 1) \implies 1 \text{ caso}$.
   - Suma 3: $(1, 2), (2, 1) \implies 2 \text{ casos}$.
   - Suma 5: $(1, 4), (2, 3), (3, 2), (4, 1) \implies 4 \text{ casos}$.
   - Suma 7: $(1, 6), (2, 5), (3, 4), (4, 3), (5, 2), (6, 1) \implies 6 \text{ casos}$.
   - Suma 11: $(5, 6), (6, 5) \implies 2 \text{ casos}$.
4. Total de casos favorables:
   $$n(A) = 1 + 2 + 4 + 6 + 2 = 15 \text{ casos}$$
5. Aplicamos la regla de Laplace:
   $$P(A) = \frac{15}{36} = \frac{5}{12}$$.  
**Clave: A**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Extracciones de Urna)
En una urna opaca se tienen 6 esferas rojas, 4 esferas azules y 5 esferas verdes. Si se extraen al azar y consecutivamente 2 esferas sin reposición, ¿cuál es la probabilidad de que la primera sea roja y la segunda sea verde?
A) $1/5$  
B) $1/7$  
C) $2/15$  
D) $3/25$  
E) $4/21$  

**Solución Paso a Paso:**
1. Total de esferas en la urna:
   $$6 + 4 + 5 = 15 \text{ esferas}$$
2. Probabilidad de que la 1.ª esfera sea roja:
   $$P(R_1) = \frac{6}{15}$$
3. Como la extracción es **sin reposición**, quedan 14 esferas en la urna (pero siguen intactas las 5 verdes):
   $$P(V_2 | R_1) = \frac{5}{14}$$
4. Por la regla de la multiplicación:
   $$P(R_1 \cap V_2) = \frac{6}{15} \times \frac{5}{14} = \frac{2}{5} \times \frac{5}{14} = \frac{2}{14} = \frac{\mathbf{1}}{\mathbf{7}}$$.  
**Clave: B**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Monedas y Complemento)
Un examen de admisión consta de una prueba virtual donde se lanzan 5 monedas equilibradas al aire. Para ganar el pase a la siguiente ronda, un postulante debe obtener al menos una cara. ¿Cuál es la probabilidad de que el postulante logre pasar a la siguiente ronda?
A) $15/16$  
B) $31/32$  
C) $7/8$  
D) $63/64$  
E) $1/32$  

**Solución Paso a Paso:**
1. Casos totales al lanzar 5 monedas:
   $$n(\Omega) = 2^5 = 32 \text{ casos posibles}$$
2. El evento es "obtener al menos una cara" ($\ge 1 \text{ cara}$).
3. Aplicamos la técnica del complemento: el suceso contrario es "obtener CERO caras" (es decir, que salgan todos sellos):
   $$A^c = \{(S, S, S, S, S)\} \implies n(A^c) = 1 \text{ caso}$$
4. Probabilidad del suceso contrario:
   $$P(A^c) = \frac{1}{32}$$
5. Por lo tanto, la probabilidad del suceso pedido es:
   $$P(A) = 1 - P(A^c) = 1 - \frac{1}{32} = \frac{\mathbf{31}}{\mathbf{32}}$$.  
**Clave: B**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Probabilidad Condicional)
En una fábrica de calzado en Arequipa se seleccionan al azar a 100 operarios. Se sabe que 60 de ellos son mujeres, 30 son técnicos especializados y 20 son mujeres técnicas especializadas. Si se elige un operario al azar y resulta ser mujer, ¿cuál es la probabilidad de que también sea técnica especializada?
A) $1/4$  
B) $1/3$  
C) $1/2$  
D) $2/5$  
E) $3/5$  

**Solución Paso a Paso:**
1. Definimos los eventos:
   - $M$: El operario es mujer $\implies n(M) = 60$.
   - $T$: El operario es técnico especializado $\implies n(T) = 30$.
   - $M \cap T$: Es mujer y técnica $\implies n(M \cap T) = 20$.
2. Nos piden calcular la probabilidad condicional de que sea técnica sabiendo que es mujer:
   $$P(T | M) = \frac{P(T \cap M)}{P(M)}$$
3. Como conocemos las cantidades directas de personas, calculamos sobre el subconjunto de mujeres:
   $$P(T | M) = \frac{n(T \cap M)}{n(M)} = \frac{20}{60} = \frac{\mathbf{1}}{\mathbf{3}}$$.  
**Clave: B**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Urnas de Polya y Probabilidad Total)
Se tienen dos urnas idénticas en apariencia. La Urna $A$ contiene 4 bolas blancas y 2 negras; la Urna $B$ contiene 2 bolas blancas y 4 negras. Se lanza una moneda equilibrada: si sale cara, se extrae una bola de la Urna $A$; si sale sello, se extrae una bola de la Urna $B$. Se realiza el experimento y se constata que la bola extraída es blanca. Calcule la probabilidad de que dicha bola blanca provenga de la Urna $A$.
A) $1/3$  
B) $1/2$  
C) $2/3$  
D) $3/4$  
E) $4/5$  

**Solución Paso a Paso:**
1. Probabilidad a priori de elegir cada urna:
   $$P(A) = \frac{1}{2} \quad (\text{moneda sale cara}), \quad P(B) = \frac{1}{2} \quad (\text{moneda sale sello})$$
2. Probabilidad de extraer bola blanca ($Bl$) de cada urna:
   - De la Urna $A$: $P(Bl | A) = \frac{4}{6} = \frac{2}{3}$.
   - De la Urna $B$: $P(Bl | B) = \frac{2}{6} = \frac{1}{3}$.
3. Calculamos la probabilidad total de extraer una bola blanca mediante el Teorema de Probabilidad Total:
   $$P(Bl) = P(A) \cdot P(Bl | A) + P(B) \cdot P(Bl | B)$$
   $$P(Bl) = \left(\frac{1}{2} \times \frac{2}{3}\right) + \left(\frac{1}{2} \times \frac{1}{3}\right) = \frac{2}{6} + \frac{1}{6} = \frac{3}{6} = \frac{1}{2}$$
4. Aplicamos el **Teorema de Bayes** para calcular la probabilidad a posteriori de que provenga de la Urna $A$:
   $$P(A | Bl) = \frac{P(A) \cdot P(Bl | A)}{P(Bl)} = \frac{\frac{1}{2} \times \frac{2}{3}}{\frac{1}{2}} = \frac{\mathbf{2}}{\mathbf{3}}$$.  
**Clave: C**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Espacio Muestral ($\Omega$):** Conjunto universal que reúne la totalidad de resultados posibles de un experimento aleatorio.
2. **Suceso Equiprobable:** Condición donde todos los eventos elementales tienen la misma probabilidad teórica de materializarse.
3. **Regla de Laplace:** Cociente analítico entre el número de casos favorables y el número total de casos posibles.
4. **Sucesos Mutuamente Excluyentes:** Dos eventos cuya intersección es vacía ($A \cap B = \emptyset$); no pueden ocurrir al mismo tiempo.
5. **Eventos Independientes:** Dos sucesos donde la ocurrencia de uno no condiciona ni altera la probabilidad del otro.
6. **Probabilidad Condicional:** Medida de verosimilitud de un evento $A$ calculada sobre la certeza de que otro evento $B$ ya tuvo lugar.
7. **Suceso Contrario (Complemento):** El evento que ocurre si y solo si el evento original $A$ no ocurre ($P(A^c) = 1 - P(A)$).
8. **Teorema de Bayes:** Algoritmo probabilístico que actualiza la probabilidad de una hipótesis a la luz de nueva evidencia confirmada.
9. **Extracción con Reposición:** Proceso de muestreo donde el elemento seleccionado se reintegra a la población antes de la siguiente extracción.
10. **Extracción sin Reposición:** Proceso de muestreo destructivo o acumulativo donde el espacio muestral se reduce tras cada etapa.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Cuál es la probabilidad de que al lanzar dos dados comunes la suma de sus puntos sea 7?  
  **A:** $P = \frac{6}{36} = \frac{1}{6}$ (es la suma con mayor cantidad de casos favorables).
* **Q:** ¿Cuál es el rango de valores posibles para cualquier probabilidad matemática?  
  **A:** Siempre está acotada entre $0$ y $1$ inclusive ($0 \le P(A) \le 1$).
* **Q:** Si dos eventos $A$ y $B$ son independientes, ¿a qué equivale $P(A \cap B)$?  
  **A:** Equivale al producto directo de sus probabilidades individuales: $P(A \cap B) = P(A) \cdot P(B)$.
* **Q:** ¿Cuántas cartas rojas tiene una baraja clásica estándar de naipes?  
  **A:** Tiene exactamente 26 cartas rojas (13 de corazones y 13 de diamantes).
* **Q:** ¿Cómo se calcula rápidamente la probabilidad de obtener "al menos un acierto"?  
  **A:** Restando de 1 la probabilidad de fallar absolutamente todos los intentos: $P(\ge 1) = 1 - P(\text{cero aciertos})$.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RM_06",
  "title": "Probabilidad Intuitiva y Condicional",
  "required_level": 6,
  "xp_reward": 200,
  "gems_reward": 25,
  "skills": ["Regla de Laplace", "Extracciones sin Reposición", "Teorema de Bayes"],
  "boss_challenge": {
    "boss_name": "El Crupier de Bayes",
    "question": "Se lanza una moneda para elegir entre la Urna A (4 blancas, 2 negras) y la Urna B (2 blancas, 4 negras). Si la bola extraída resultó ser blanca, ¿cuál es la probabilidad de que provenga de la Urna A?",
    "options": ["1/3", "1/2", "2/3", "3/4"],
    "correct_index": 2,
    "explanation": "Por Bayes: P(A|Blanca) = P(A)P(Blanca|A) / P(Blanca Total). P(Blanca Total) = 1/2(4/6) + 1/2(2/6) = 1/2. Por tanto: (1/2 * 2/3) / (1/2) = 2/3."
  }
}
```
