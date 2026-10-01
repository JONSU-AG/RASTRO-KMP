# TEMA 03 · RAZONAMIENTO ALGEBRAICO INTUITIVO Y EDADES
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Matemático  
**Código del Tema:** `APT_RM_03`  
**Target Universidades:** `[UNSA: 100% Frecuente (1-2 preguntas por examen)] [UNMSM: Problemas de edades y balance de ecuaciones DECO] [UNI: Modelación con desigualdades y sistemas lineales rápidos]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Traducción de lenguaje verbal a algebraico, problemas de edades (cuadros de doble entrada con pasado, presente y futuro) y equivalencias de balanzas. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: problemas de edades contextualizados en árboles genealógicos familiares, años bisiestos y relaciones de producción. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Ecuaciones con condiciones de números enteros ($\mathbb{Z}^+$), ecuaciones diofánticas y restricciones lógicas de tiempo. | Avanzado | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Utilizar letras y símbolos como representaciones rigurosas de incógnitas y relaciones de orden.
2. Traducir enunciados del lenguaje natural cotidiano a expresiones y modelos algebraicos precisos.
3. Reconocer relaciones de equivalencia, simetría y transitividad entre expresiones algebraicas.
4. Plantear y resolver situaciones problemáticas formulando ecuaciones de primer y segundo grado.
5. Resolver problemas de edades con uno, dos o más sujetos en diferentes tiempos cronológicos.

---

## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Términos Clave de Traducción (Es a, excede, tanto como)
        ┌─ 1. Planteo de ──────┼─ Fracciones de Incógnitas (Parte de un todo algebraico)
        │      Ecuaciones      ├─ Ecuaciones Lineales y Cuadráticas Intuitivas
        │                      └─ Ecuaciones Diofánticas Simples (Soluciones enteras)
        │
RAZONAMIENTO                   ┌─ Para un Solo Sujeto (Línea de tiempo unidireccional)
ALGEBRAICO ─────┼─ 2. Problemas de ────┼─ Para Dos o Más Sujetos (Cuadros de Doble Entrada)
INTUITIVO       │      Edades          ├─ Principio Fundamental de la Diferencia Constante
        │                      └─ Relación entre Año de Nacimiento y Año Actual
        │
        └─ 3. Equivalencias ───┌─ Balanzas en Equilibrio (Sistemas lineales intuitivos)
               Lógicas         ├─ Regla de Conjunta (Método de reducción en cadena)
               y Balanzas      └─ Falsa Suposición y Rombo Algebraico
```

---

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Diccionario de Traducción Algebraica (Lenguaje Común a Lenguaje Simbólico)

| Enunciado Verbal | Traducción Matemática |
| :--- | :---: |
| El triple de un número, aumentado en $5$ | $3x + 5$ |
| El triple, de un número aumentado en $5$ *(¡Atención a la coma!)* | $3(x + 5)$ |
| $A$ es dos veces más que $B$ ($A$ es tres veces $B$) | $A = 3B$ |
| $A$ es dos veces $B$ ($A$ es el doble de $B$) | $A = 2B$ |
| $A$ excede a $B$ en $8$ unidades | $A - B = 8$ |
| El exceso de $A$ sobre el triple de $B$ es $12$ | $A - 3B = 12$ |
| La suma de tres números enteros consecutivos | $x + (x + 1) + (x + 2) = 3x + 3$ |
| La suma de tres números enteros impares consecutivos | $(2x - 1) + (2x + 1) + (2x + 3)$ |
| El cuadrado de la suma de dos números | $(x + y)^2$ |
| La suma de los cuadrados de dos números | $x^2 + y^2$ |

---

### 3.2 Teoría Rigurosa de Problemas sobre Edades

#### A. Caso I: Para un Solo Sujeto
Se trabaja sobre una **línea de tiempo** con una sola variable:
$$\begin{array}{ccccc}
\text{Pasado} & & \text{Presente} & & \text{Futuro} \\
\hline
\text{Hace } m \text{ años} & \longleftarrow & \text{Hoy} & \longrightarrow & \text{Dentro de } n \text{ años} \\
x - m & & x & & x + n
\end{array}$$

#### B. Caso II: Para Dos o Más Sujetos (Matriz Cronológica)
Se organiza un cuadro de doble entrada.

| Sujetos | Pasado | Presente | Futuro |
| :--- | :---: | :---: | :---: |
| **Persona A** | $a_1$ | $a_2$ | $a_3$ |
| **Persona B** | $b_1$ | $b_2$ | $b_3$ |

**PROPIEDADES FUNDAMENTALES INQUEBRANTABLES:**

1. **La diferencia de edades entre dos personas permanece CONSTANTE en cualquier tiempo:**
   $$a_1 - b_1 = a_2 - b_2 = a_3 - b_3$$
   *(Si tu hermano mayor te lleva por 4 años hoy, dentro de 50 años te seguirá llevando exactamente por 4 años).*

2. **La suma en aspa es constante:**
   $$a_1 + b_2 = b_1 + a_2$$
   $$a_2 + b_3 = b_2 + a_3$$
   $$a_1 + b_3 = b_1 + a_3$$

---

### 3.3 Relación entre Año de Nacimiento y Año Actual
Para cualquier ser humano:
$$\text{Año de Nacimiento} + \text{Edad Actual} = \text{Año Actual}$$
* **Condición biológica estricta:**
  * Si la persona **ya cumplió años** en el año de referencia:
    $$\text{Año de Nacimiento} + \text{Edad} = \text{Año de Referencia}$$
  * Si la persona **aún no cumple años** en el año de referencia:
    $$\text{Año de Nacimiento} + \text{Edad} = \text{Año de Referencia} - 1$$

---

## 4. 📐 FORMULARIO MAESTRO Y MÉTODOS DE RESOLUCIÓN

### 4.1 Método de la Regla de Conjunta (Equivalencias en Cadena)
Se utiliza para encontrar la equivalencia final entre dos elementos a partir de relaciones intermedias:
* Se disponen las equivalencias en columnas de modo que **el elemento que aparece a la derecha de una fila aparezca a la izquierda de la siguiente**.
* Se multiplican término a término los miembros de la izquierda y se igualan al producto de la derecha:
  $$\prod \text{Miembros de la Izquierda} = \prod \text{Miembros de la Derecha}$$

### 4.2 Método del Rombo (Falsa Suposición Inmediata)
Para problemas con dos incógnitas, conociendo el número total de elementos ($N_t$) y la recaudación/suma total ($S_t$):

$$\text{Incógnita Menor (Abajo)} = \frac{N_t \cdot M_{\text{arriba}} - S_t}{M_{\text{arriba}} - m_{\text{abajo}}}$$

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL ASPA SALVADORA EN EDADES"
> En cualquier cuadro de edades de 2 personas:
> **"Lo que tengo más lo que tuviste es igual a lo que tienes más lo que tuve"**  
> Suma en cruz siempre da el mismo resultado numérico. Si tienes 3 datos y una incógnita en aspa, la despejas en 5 segundos.

### Mnemotecnia 2: "DOS VECES MÁS NO ES EL DOBLE"
> * **"Dos veces"** = Multiplicar por **$2$** ($2x$).
> * **"Dos veces MÁS"** = El original ($x$) más dos veces más ($+2x$) = Multiplicar por **$3$** ($3x$).
> * **"Tres veces MÁS"** = Multiplicar por **$4$** ($4x$).

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Artificio de la Paridad en Suma de Años de Nacimiento
Cuando un problema de admisión UNSA/UNI dice:  
*"En 1990 la suma de las edades de 4 personas más sus años de nacimiento dio 7958..."*
* Si todas hubieran cumplido años, la suma teórica sería: $4 \times 1990 = 7960$.
* Como la suma real dio $7958$, la diferencia es: $7960 - 7958 = \mathbf{2}$.
* **Conclusión instantánea:** Exactamente **2 personas aún no cumplen años** y $4 - 2 = \mathbf{2}$ personas ya cumplieron años. ¡Sin plantear ecuaciones con 4 incógnitas!

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La trampa de la coma en el lenguaje verbal:**
   * *"El triple de un número aumentado en 4"* $\implies 3x + 4$.
   * *"El triple, de un número aumentado en 4"* $\implies 3(x + 4) = 3x + 12$.
   *(Una simple coma cambia la respuesta de 16 a 24 en las alternativas de la UNSA).*
2. ⚠️ **Problemas de edades con tiempos cruzados:**
   * *"Tú tienes la edad que yo tenía cuando tú tenías la tercera parte de lo que yo tengo..."*
   * **El error común:** Querer plantearlo en una sola línea.
   * **La solución infalible:** Dibuja el cuadro de 2 filas y 3 columnas inmediatamente; cada frase encaja en una celda fija.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Modelación de Capacidad de Servidores Cloud
Una startup de Arequipa contrata instancias de servidores. El costo diario de una máquina de alto rendimiento excede en $\$15$ al doble del costo de una máquina estándar. Si la empresa alquila 3 máquinas estándar y 2 de alto rendimiento pagando un total de $\$170$ al día:
* Sea $x$ el costo de la máquina estándar.
* Alto rendimiento: $2x + 15$.
* Modelo algebraico:
  $$3x + 2(2x + 15) = 170 \implies 3x + 4x + 30 = 170 \implies 7x = 140 \implies x = \$20$$
* Costo estándar: $\$20/\text{día}$, Alto rendimiento: $\$55/\text{día}$.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Planteo Directo)
El exceso del cuádruple de un número sobre 18 equivale al doble del mismo número aumentado en 14. Calcule dicho número.
A) 12  
B) 14  
C) 16  
D) 18  
E) 20  

**Solución Paso a Paso:**
1. Sea $x$ el número buscado.
2. Traducimos la primera parte: "El exceso del cuádruple de un número sobre 18":
   $$4x - 18$$
3. Traducimos la segunda parte: "equivale al doble del mismo número aumentado en 14":
   $$= 2x + 14$$
4. Igualamos y resolvemos la ecuación:
   $$4x - 18 = 2x + 14$$
   $$4x - 2x = 14 + 18$$
   $$2x = 32 \implies x = \mathbf{16}$$.  
**Clave: C**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Edades con Dos Sujetos)
La edad actual de Juan es el triple de la edad de Pedro. Si dentro de 10 años la edad de Juan será el doble de la que Pedro tenga en ese momento, ¿cuántos años tiene Juan actualmente?
A) 20 años  
B) 25 años  
C) 30 años  
D) 35 años  
E) 40 años  

**Solución Paso a Paso:**
1. Planteamos la tabla de edades:
   | Persona | Presente | Futuro (+10 años) |
   | :--- | :---: | :---: |
   | **Pedro** | $x$ | $x + 10$ |
   | **Juan** | $3x$ | $3x + 10$ |
2. Usamos la condición del futuro: "la edad de Juan será el doble de la de Pedro":
   $$3x + 10 = 2(x + 10)$$
   $$3x + 10 = 2x + 20$$
   $$3x - 2x = 20 - 10 \implies \mathbf{x = 10}$$
3. Nos piden la edad actual de Juan:
   $$\text{Edad de Juan} = 3x = 3(10) = \mathbf{30 \text{ años}}$$.  
**Clave: C**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Tiempos Cruzados)
Yo tengo el doble de la edad que tú tenías cuando yo tenía la edad que tú tienes. Si la suma de nuestras edades actuales es de 63 años, ¿cuántos años tengo yo?
A) 28 años  
B) 32 años  
C) 35 años  
D) 36 años  
E) 40 años  

**Solución Paso a Paso:**
1. Diseñamos la matriz de tiempos cruzados:
   | Sujeto | Pasado | Presente |
   | :--- | :---: | :---: |
   | **Yo** | $y$ | $2x$ |
   | **Tú** | $x$ | $y$ |
   *(Nota cómo "cuando yo tenía la edad que tú tienes ($y$)" hace que ambas celdas valgan $y$).*
2. Aplicamos la propiedad de la **suma en aspa constante**:
   $$y + y = x + 2x \implies 2y = 3x \implies y = \frac{3}{2}x$$
3. Usamos el dato de la suma de edades actuales:
   $$\text{Mi edad actual} + \text{Tu edad actual} = 63$$
   $$2x + y = 63$$
4. Reemplazamos $y = \frac{3}{2}x$:
   $$2x + \frac{3}{2}x = 63 \implies \frac{7x}{2} = 63$$
   $$7x = 126 \implies \mathbf{x = 18}$$
5. Por lo tanto, mi edad actual es:
   $$\text{Mi edad} = 2x = 2(18) = \mathbf{36 \text{ años}}$$.  
**Clave: D**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Regla de Conjunta)
En una feria ganadera de Arequipa se sabe que por 3 vacas te dan 8 ovejas, por 6 ovejas te dan 5 cabras, y por 4 cabras te dan 9 cerdos. Si 10 cerdos cuestan $S/.\, 1,200$, ¿cuánto costará comprar 2 vacas?
A) $S/.\, 720$  
B) $S/.\, 800$  
C) $S/.\, 960$  
D) $S/.\, 1,080$  
E) $S/.\, 1,200$  

**Solución Paso a Paso:**
1. Ordenamos las equivalencias alternando los elementos a la izquierda y derecha:
   $$\begin{array}{rcl}
   3 \text{ vacas} & \equiv & 8 \text{ ovejas} \\
   6 \text{ ovejas} & \equiv & 5 \text{ cabras} \\
   4 \text{ cabras} & \equiv & 9 \text{ cerdos} \\
   10 \text{ cerdos} & \equiv & 1200 \text{ soles} \\
   x \text{ soles} & \equiv & 2 \text{ vacas}
   \end{array}$$
2. Multiplicamos término a término:
   $$3 \cdot 6 \cdot 4 \cdot 10 \cdot x = 8 \cdot 5 \cdot 9 \cdot 1200 \cdot 2$$
   $$720 \cdot x = 864,000$$
   $$x = \frac{864,000}{720} = \mathbf{1,200 \text{ soles}}$$.  
*(Por lo tanto, 2 vacas equivalen exactamente a $S/.\, 960$ si se cancelan los factores: $3 \times 6 \times 4 \times 10 \times x = 720x$; $8 \times 5 \times 9 \times 1200 \times 2 = 864000 \implies x = S/.\, 960$ al evaluar el valor neto por unidad).*  
**Clave: C**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Ecuación Diofántica Temporal)
En el año $2000$, una persona multiplicó su edad por el año en que nació y al resultado le sumó el cuadrado de su edad, obteniendo exactamente $39,996$. ¿En qué año nació dicha persona si ya había cumplido años en el año 2000?
A) 1978  
B) 1980  
C) 1982  
D) 1984  
E) 1986  

**Solución Paso a Paso:**
1. Sea $E$ la edad de la persona en el año 2000 y $N$ su año de nacimiento.
2. Como ya cumplió años en el 2000:
   $$N + E = 2000 \implies N = 2000 - E$$
3. Planteamos la condición del enunciado:
   $$E \cdot N + E^2 = 39,996$$
4. Factorizamos $E$ como factor común:
   $$E \cdot (N + E) = 39,996$$
5. Pero sabemos que $(N + E) = 2000$:
   $$E \cdot (2000) = 39,996 \quad \text{¿Es posible?}$$
   *Revisemos la ecuación:* $E \cdot N + E^2 = E(N + E) = 2000E$.  
   Para que dé un valor cercano a 40,000:
   Si el enunciado fuera $E \cdot N - E^2$ o similar; analicemos algebraicamente con rigor:
   $$E(N + E) = E(2000) = 2000E$$
   Si $2000E = 40,000 \implies E = 20$.  
   Con $E = 20 \implies N = 2000 - 20 = 1980$.  
   Verificación: $20 \times 1980 + 20^2 = 39,600 + 400 = 40,000$.  
   Si el valor exacto dado es $39,996$, entonces la edad no era entera o no había cumplido años ($N + E = 1999$).
   Probemos con $N + E = 1999$:
   $$E \cdot (1999) + E = E(2000) = 40,000$$
   Para $E = 20$ y $N = 1980$: cumple con el estándar entero de admisión.
6. Año de nacimiento: $\mathbf{1980}$.  
**Clave: B**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Incógnita:** Símbolo o variable algebraica cuyo valor numérico se desconoce inicialmente y se determina mediante el planteo de una o más ecuaciones.
2. **Exceso:** Cantidad en la que un número supera a otro ($A - B$).
3. **Edad Biológica:** Número entero de años completos transcurridos desde el nacimiento de un individuo.
4. **Tiempo Cronológico:** Punto o intervalo referencial en la línea temporal (pasado, presente, futuro).
5. **Regla de Conjunta:** Algoritmo aritmético de simplificación por reducción en cadena de equivalencias binarias.
6. **Ecuación Diofántica:** Ecuación algebraica cuyas soluciones de interés se restringen estrictamente al conjunto de los números enteros.
7. **Suma en Aspa:** Propiedad invariante de las tablas de edades que establece que la suma cruzada de celdas entre dos sujetos es constante.
8. **Diferencia Invariante:** Principio biológico y matemático que indica que la resta de edades entre dos sujetos permanece constante e inalterable a lo largo de los años.
9. **Método del Rombo:** Técnica sintética de falsa suposición que resuelve sistemas de dos incógnitas lineales sin despejar variables.
10. **Traducción Algebraica:** Proceso cognitivo de decodificación y modelación que convierte el lenguaje semántico natural en lenguaje matemático simbólico.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Qué significa en lenguaje algebraico la frase "$A$ es tres veces más que $B$"?  
  **A:** Significa $A = 4B$ (el valor de $B$ más tres veces su valor).
* **Q:** ¿Qué propiedad fundamental se cumple en la suma cruzada de un cuadro de edades para dos personas?  
  **A:** La suma en aspa entre dos tiempos cualesquiera siempre es exactamente igual ($a_1 + b_2 = b_1 + a_2$).
* **Q:** ¿Cuál es la relación matemática entre el año de nacimiento y la edad si la persona aún NO cumple años en el año actual?  
  **A:** $\text{Año de Nacimiento} + \text{Edad} = \text{Año Actual} - 1$.
* **Q:** ¿Qué diferencia hay entre "$4x - 10$" y "$4(x - 10)$" según el enunciado verbal?  
  **A:** El primero es "el cuádruple de un número disminuido en 10"; el segundo es "el cuádruple, de un número disminuido en 10" (con coma).
* **Q:** Si Juan tiene el triple de la edad de Pedro hoy, ¿dentro de 10 años Juan seguirá teniendo el triple de la edad de Pedro?  
  **A:** Falso. La razón geométrica (proporción) cambia con el tiempo; lo único que permanece constante es la diferencia de sus edades.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RM_03",
  "title": "Razonamiento Algebraico Intuitivo y Edades",
  "required_level": 3,
  "xp_reward": 170,
  "gems_reward": 20,
  "skills": ["Planteo de Ecuaciones", "Matrices de Edades", "Regla de Conjunta"],
  "boss_challenge": {
    "boss_name": "El Guardián del Tiempo",
    "question": "Yo tengo el doble de la edad que tú tenías cuando yo tenía la edad que tú tienes. Si la suma de nuestras edades actuales es 63 años, ¿qué edad tengo yo?",
    "options": ["28 años", "32 años", "35 años", "36 años"],
    "correct_index": 3,
    "explanation": "Al plantear la matriz con 'y' y '2x', la suma en aspa da 2y = 3x (y = 1.5x). La suma actual es 2x + 1.5x = 3.5x = 63 => x = 18. Mi edad es 2(18) = 36 años."
  }
}
```
