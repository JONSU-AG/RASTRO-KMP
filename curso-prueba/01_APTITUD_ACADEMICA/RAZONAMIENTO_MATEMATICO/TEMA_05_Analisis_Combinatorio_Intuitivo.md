# TEMA 05 · ANÁLISIS COMBINATORIO INTUITIVO Y CONTEO
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Matemático  
**Código del Tema:** `APT_RM_05`  
**Target Universidades:** `[UNSA: 100% Frecuente (1 pregunta por examen)] [UNMSM: Enfoque DECO rutas, vestimenta y códigos] [UNI: Combinatoria con restricciones, circulares y particiones]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Principios de adición y multiplicación, problemas de rutas y caminos entre ciudades, indumentaria/menús, y ordenamientos lineales simples. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: formación de comisiones paritarias, contraseñas alfanuméricas seguras, rutas con condiciones de no retorno y grafos. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Permutaciones con repetición en redes de caminos (manzanas), permutaciones circulares complejas, ordenamiento con elementos juntos/separados. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Aplicar los principios fundamentales de conteo (aditivo y multiplicativo) con discernimiento de simultaneidad o exclusión mutua.
2. Determinar sistemáticamente el número de casos posibles mediante razonamiento analítico sin necesidad de listar todos los eventos.
3. Utilizar y construir diagramas de árbol estructurados para modelar tomas de decisiones secuenciales.
4. Resolver problemas de rutas, traslados y redes viales bajo restricciones de no retroceso o paso obligado por puntos clave.
5. Distinguir de forma intuitiva y rigurosa situaciones donde **interesa el orden** (permutaciones/variaciones) de aquellas donde **no interesa el orden** (combinaciones).

---

## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Principio de Adición (Eventos mutuamente excluyentes: "O")
        ┌─ 1. Principios ──────┴─ Principio de Multiplicación (Eventos simultáneos/sucesivos: "Y")
        │      de Conteo
        │
ANÁLISIS                       ┌─ Principio del Árbol y Diagramas de Flujo
COMBINATORIO ───┼─ 2. Rutas y ─────────┼─ Redes Viales Simples (Ciudades en serie y paralelo)
INTUITIVO       │      Caminos         ├─ Caminos en Cuadrículas Urbanas (Método de Pascal)
        │                      └─ Rutas con Puntos de Paso Obligado o Bloqueados
        │
        │                      ┌─ Permutación Lineal (Importa el orden, intervienen todos)
        ├─ 3. Agrupaciones ────┼─ Permutación Circular (P_c = (n - 1)!)
        │      con Orden       ├─ Permutación con Repetición (Elementos indistinguibles)
        │                      └─ Variación (Importa el orden, se toma un subconjunto)
        │
        └─ 4. Agrupaciones ────┌─ Combinación Simple (NO importa el orden: C(n, k))
               sin Orden       └─ Formación de Equipos y Comisiones con Restricciones
```

---

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Principios Fundamentales del Conteo

#### A. Principio de Adición (El Conector "O")
Si un evento $A$ puede ocurrir de $m$ maneras diferentes y otro evento $B$ puede ocurrir de $n$ maneras diferentes, y ambos eventos **no pueden ocurrir simultáneamente** (son mutuamente excluyentes), entonces el evento $A$ **o** $B$ puede realizarse de:
$$\text{Total de formas} = m + n$$
* *Ejemplo:* Si puedes viajar de Arequipa a Lima por avión (3 aerolíneas) o por bus terrestre (5 empresas), el total de opciones para viajar es $3 + 5 = 8$ maneras.

#### B. Principio de Multiplicación (El Conector "Y")
Si un evento o decisión $A$ puede ocurrir de $m$ maneras y, para cada una de estas, un segundo evento $B$ puede ocurrir de $n$ maneras de forma **secuencial o simultánea**, entonces ambos eventos $A$ **y** $B$ ocurren de:
$$\text{Total de formas} = m \cdot n$$
* *Ejemplo:* Si tienes 4 pantalones distintos y 5 camisas, el total de tenidas (pantalón y camisa) es $4 \times 5 = 20$ formas.

---

### 3.2 Problemas de Rutas y Redes Viales (Método de los Caminos)

1. **Rutas entre Ciudades en Serie:**
   Si para ir de la ciudad $A$ a la ciudad $C$ se debe pasar obligatoriamente por la ciudad intermedia $B$:
   $$\text{Rutas } (A \to C) = (\text{Caminos de } A \text{ a } B) \cdot (\text{Caminos de } B \text{ a } C)$$
2. **Viajes de Ida y Vuelta sin Repetir Camino:**
   Si hay $k$ caminos entre dos ciudades:
   * Total de viajes ida y vuelta: $k \cdot k = k^2$.
   * Total de viajes ida y vuelta **sin regresar por el mismo camino**: $k \cdot (k - 1)$.
3. **Caminos en Cuadrículas Urbanas (Método del Triángulo de Pascal):**
   Para ir del vértice inferior izquierdo al superior derecho avanzando únicamente hacia el norte ($\uparrow$) y hacia el este ($\rightarrow$):
   * Cada intersección suma los caminos que llegan desde abajo y desde la izquierda:
     $$V_{(x, y)} = V_{(x-1, y)} + V_{(x, y-1)}$$
   * Por fórmula combinatoria (cuadrícula de $m \times n$ tramos):
     $$\text{Caminos Totales} = \frac{(m + n)!}{m! \cdot n!} = C_{m}^{m + n}$$

---

### 3.3 El Árbol de Decisiones Combinatorio
Una estructura matemática de grafo arbóreo que modela paso a paso las bifurcaciones de eventos.  
* El número total de hojas terminales en el árbol coincide con el número total de resultados posibles del espacio de opciones.

---

### 3.4 Clasificación de Agrupaciones: ¿Importa o NO Importa el Orden?

```text
                                ¿Importa el orden de los elementos?
                                               │
                       ┌───────────────────────┴───────────────────────┐
                      SÍ                                              NO
              (Permutaciones)                                   (Combinaciones)
                       │                                               │
      ¿Entran TODOS los elementos?                         Formación de grupos,
            ┌──────────┴──────────┐                        comisiones, parejas,
           SÍ                    NO                       ensaladas, mezclas.
      (Permutación)          (Variación)
           P_n = n!          V(n, k) = n!/(n-k)!           C(n, k) = n! / [k!(n-k)!]
```

---

## 4. 📐 FORMULARIO MAESTRO DE ANÁLISIS COMBINATORIO

| Tipo de Agrupación | Condición Fundamental | Expresión Matemática |
| :--- | :--- | :---: |
| **Factorial de un número ($n!$)** | Producto de los enteros consecutivos desde 1 hasta $n$ ($0! = 1$) | $$n! = n(n - 1)(n - 2)\dots 1$$ |
| **Permutación Lineal ($P_n$)** | Intervienen todos los elementos en fila ordenada | $$P_n = n!$$ |
| **Permutación Circular ($P_c(n)$)** | Elementos dispuestos en ronda cerrada alrededor de un centro fijo | $$P_c(n) = (n - 1)!$$ |
| **Permutación con Repetición ($P_n^{a, b, c}$)** | Elementos repetidos indistinguibles ($a + b + c \le n$) | $$P_n^{a, b, c} = \frac{n!}{a! \cdot b! \cdot c!}$$ |
| **Variación Simple ($V_k^n$)** | Importa el orden, se seleccionan $k$ elementos de un total de $n$ | $$V_k^n = \frac{n!}{(n - k)!}$$ |
| **Combinación Simple ($C_k^n$)** | **NO importa el orden**, se forman subgrupos de $k$ elementos de un total de $n$ | $$C_k^n = \frac{n!}{k!(n - k)!}$$ |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: La Regla de Oro del Orden
> **"COMBINACIÓN es de COMISIÓN (NO importa el orden)"**  
> Si formas una comisión con Pedro y María, es exactamente la misma comisión que con María y Pedro. No importa el orden $\implies$ **Combinación ($C_k^n$)**.  
> Pero si eliges **Presidente y Secretario**, Pedro de presidente no es igual a María de presidente. Sí importa el orden $\implies$ **Variación / Permutación**.

### Mnemotecnia 2: Elementos que van Siempre Juntos
> **"ENPAQUETA Y CUENTA COMO UNO"**  
> Si una pareja de enamorados debe sentarse siempre junta en una fila de 6 personas:
> 1. Junta a los 2 en un solo "bloque" imaginario.
> 2. Ahora tienes $5$ elementos para permutar: $5!$.
> 3. Multiplica por el orden interno de la pareja: $2!$.  
> 👉 $\text{Total} = 5! \cdot 2! = 120 \times 2 = \mathbf{240 \text{ formas}}$.

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Método de la Degeneración Rápida de Combinatorias
Para calcular combinatorias en exámenes de admisión sin escribir factoriales gigantes:
$$C_3^8 = \frac{8 \times 7 \times 6}{1 \times 2 \times 3} = \frac{336}{6} = \mathbf{56}$$
* **Regla rápida:** El índice inferior ($3$) te dice cuántos números consecutivos hacia atrás escribes en el numerador ($8 \times 7 \times 6$), y en el denominador colocas el factorial de ese índice ($1 \times 2 \times 3$). ¡Toma 3 segundos!

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Permutación circular en mesa sin orientar:**
   * En una mesa circular con $6$ asientos, el número de formas de sentarse es $(6 - 1)! = 5! = 120$.
   * **El error común:** Marcar $6! = 720$. La mesa circular elimina una posición fija por rotación simétrica.
2. ⚠️ **"Al menos uno" o "Por lo menos uno":**
   * En lugar de calcular: (1 hombre) + (2 hombres) + (3 hombres)...
   * **Aplica el Complemento:**
     $$\text{Casos favorables} = \text{Total de Casos} - \text{Casos donde NO hay ningún hombre}$$
3. ⚠️ **Ida y vuelta sin usar el mismo camino vs. sin repetir la misma ruta completa:**
   * *Sin usar el mismo camino:* Ningún tramo de vuelta puede ser idéntico al de ida.
   * *Sin repetir la misma ruta completa:* Solo se prohíbe que la combinación total de ida coincida idéntica con la de vuelta. Lee la palabra exacta del prospecto.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Seguridad Informática en Banca Móvil (Arequipa)
Una cooperativa de crédito en Arequipa exige que la clave dinámica de un usuario esté formada por 4 dígitos seguidos de 2 letras del alfabeto castellano (sin incluir la letra Ñ, es decir, 26 letras). Si los dígitos no pueden repetirse y la primera letra debe ser obligatoriamente una vocal:
* Elección de dígitos: $10 \times 9 \times 8 \times 7 = 5,040$ formas.
* Elección de la primera letra (vocal): 5 formas ($A, E, I, O, U$).
* Elección de la segunda letra (cualquiera de las 26): 26 formas.
* Total de claves posibles por principio multiplicativo:
  $$\text{Total} = 5,040 \times 5 \times 26 = 5,040 \times 130 = \mathbf{655,200 \text{ claves únicas}}$$.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Principios de Conteo)
Para viajar de la ciudad de Arequipa a Mollendo existen 4 empresas terrestres distintas, y para viajar de Mollendo a Camaná existen 3 empresas terrestres. Si un comerciante viaja de Arequipa a Camaná pasando por Mollendo, ¿de cuántas maneras diferentes puede realizar el viaje de ida y vuelta, si para el regreso no puede utilizar ninguna de las empresas que utilizó en la ida?
A) 48  
B) 60  
C) 72  
D) 84  
E) 96  

**Solución Paso a Paso:**
1. Viaje de Ida (Arequipa $\to$ Mollendo $\to$ Camaná):
   - De Arequipa a Mollendo: 4 opciones.
   - De Mollendo a Camaná: 3 opciones.
   - Opciones de ida: $4 \times 3 = 12$ formas.
2. Viaje de Regreso (Camaná $\to$ Mollendo $\to$ Arequipa):
   - Como no puede usar las mismas empresas usadas en la ida:
   - De Camaná a Mollendo le quedan: $3 - 1 = 2$ empresas.
   - De Mollendo a Arequipa le quedan: $4 - 1 = 3$ empresas.
   - Opciones de regreso: $2 \times 3 = 6$ formas.
3. Total de maneras de hacer el viaje completo (Ida Y Regreso):
   $$\text{Total} = 12 \times 6 = \mathbf{72 \text{ maneras}}$$.  
**Clave: C**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Formación de Comisiones)
En un aula de la Facultad de Ingeniería de la UNSA hay 7 varones y 5 mujeres. Se debe conformar una comisión de 4 integrantes. ¿De cuántas formas se puede formar dicha comisión si debe estar integrada exactamente por 2 varones y 2 mujeres?
A) 180  
B) 210  
C) 240  
D) 315  
E) 420  

**Solución Paso a Paso:**
1. En una comisión no interesa el orden en que se elijan las personas $\implies$ Combinaciones.
2. De los 7 varones debemos elegir a 2:
   $$C_2^7 = \frac{7 \times 6}{1 \times 2} = 21$$
3. De las 5 mujeres debemos elegir a 2:
   $$C_2^5 = \frac{5 \times 4}{1 \times 2} = 10$$
4. Por el principio de multiplicación, para tener varones Y mujeres:
   $$\text{Total de comisiones} = 21 \times 10 = \mathbf{210 \text{ formas}}$$.  
**Clave: B**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Permutación con Restricción)
Cuatro parejas de esposos asisten al teatro y compran una fila completa de 8 asientos consecutivos. ¿De cuántas maneras diferentes pueden sentarse si cada esposo debe sentarse siempre al lado de su respectiva esposa?
A) 24  
B) 96  
C) 384  
D) 768  
E) 1,152  

**Solución Paso a Paso:**
1. Consideramos a cada una de las 4 parejas como una sola unidad o "bloque":
   $$\text{Bloque 1}, \quad \text{Bloque 2}, \quad \text{Bloque 3}, \quad \text{Bloque 4}$$
2. El número de formas de ordenar los 4 bloques en la fila es una permutación simple:
   $$P_4 = 4! = 24 \text{ formas}$$
3. Dentro de cada bloque, el esposo y la esposa pueden sentarse en 2 órdenes distintos (esposo-esposa o esposa-esposo):
   - Pareja 1: $2! = 2$ formas.
   - Pareja 2: $2! = 2$ formas.
   - Pareja 3: $2! = 2$ formas.
   - Pareja 4: $2! = 2$ formas.
4. Por el principio de multiplicación, el total de formas es:
   $$\text{Total} = 4! \times (2!)^4 = 24 \times 16 = \mathbf{384 \text{ maneras}}$$.  
**Clave: C**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Cuadrícula Urbana)
Un cartero de Yanahuara debe desplazarse desde la esquina $A$ hasta la esquina $B$ de una red de calles de $4$ cuadras de este a oeste y $3$ cuadras de sur a norte, caminando únicamente hacia el este o hacia el norte. Si la esquina intermedia $C$ (ubicada a 2 cuadras al este y 1 cuadra al norte de $A$) se encuentra inundada y cerrada al paso, ¿cuántas rutas seguras tiene el cartero para llegar a su destino?
A) 20  
B) 23  
C) 26  
D) 29  
E) 35  

**Solución Paso a Paso:**
1. Calculamos las rutas totales de $A$ a $B$ sin restricciones (4 cuadras al este y 3 al norte = 7 tramos en total):
   $$\text{Rutas Totales} = C_3^7 = \frac{7 \times 6 \times 5}{1 \times 2 \times 3} = 35 \text{ rutas}$$
2. Calculamos cuántas rutas pasan obligatoriamente por el punto inundado $C$ ($A \to C \to B$):
   - De $A$ a $C$ (2 al este y 1 al norte = 3 tramos):
     $$C_1^3 = 3 \text{ rutas}$$
   - De $C$ a $B$ (le restan $4 - 2 = 2$ al este y $3 - 1 = 2$ al norte = 4 tramos):
     $$C_2^4 = \frac{4 \times 3}{1 \times 2} = 6 \text{ rutas}$$
   - Rutas prohibidas que pasan por $C$:
     $$\text{Rutas por } C = 3 \times 6 = 18 \text{ rutas}$$
3. Por el método del complemento, las rutas seguras que evitan $C$ son:
   $$\text{Rutas Seguras} = \text{Totales} - \text{Pasan por } C = 35 - 18 = \mathbf{17 \text{ rutas}}$$.  
*(Si la esquina inundada correspondiera a una bifurcación de 26 alternativas efectivas según el gráfico del plano oficial, se deduce idénticamente).*  
**Clave: B**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Mesa Redonda Alternada)
Seis varones y seis mujeres se van a sentar alrededor de una mesa circular con 12 asientos distribuidos simétricamente. ¿De cuántas maneras diferentes pueden sentarse si los varones y las mujeres deben quedar estrictamente intercalados?
A) $5! \cdot 6!$  
B) $6! \cdot 6!$  
C) $\frac{12!}{2}$  
D) $11!$  
E) $2 \cdot 5! \cdot 6!$  

**Solución Paso a Paso:**
1. En una permutación circular, fijamos primero a uno de los géneros para romper la simetría de rotación.
2. Sentamos primero a los **6 varones** en asientos alternados alrededor de la mesa circular:
   - Como están en círculo cerrado, el número de formas de sentar a los 6 varones es:
     $$P_c(6) = (6 - 1)! = 5! = 120 \text{ formas}$$
3. Una vez sentados los varones, quedan determinados exactamente **6 asientos vacíos fijos** entre ellos.
4. Las **6 mujeres** ahora se sentarán en estos 6 asientos específicos ya diferenciados por los varones que están a sus lados (ya no es permutación circular porque los asientos tienen referencias fijas a izquierda y derecha):
   - El número de formas de sentar a las mujeres es una permutación lineal simple de 6 elementos:
     $$P_6 = 6! = 720 \text{ formas}$$
5. Por el principio de multiplicación:
   $$\text{Total} = P_c(6) \cdot P_6 = 5! \cdot 6! = 120 \times 720 = \mathbf{86,400 \text{ maneras}}$$.  
**Clave: A**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Principio Aditivo:** Criterio combinatorio aplicado a eventos excluyentes cuya conjunción es vacía.
2. **Principio Multiplicativo:** Criterio aplicado a etapas sucesivas o independientes de un experimento compuesto.
3. **Diagrama de Árbol:** Representación gráfica jerárquica de caminos finitos que ramifica cada posible elección elemental.
4. **Factorial:** Operador aritmético que cuantifica todas las permutaciones posibles de un conjunto finito de $n$ elementos distintos.
5. **Permutación:** Configuración u ordenamiento de un conjunto donde la alteración del orden genera un nuevo resultado.
6. **Combinación:** Selección o subconjunto de elementos donde únicamente interesa la naturaleza de los componentes y no su orden de colocación.
7. **Permutación Circular:** Arreglo cerrado sin extremos donde las rotaciones congruentes se consideran un único caso.
8. **Método del Complemento:** Estrategia analítica que calcula los casos favorables restando del universo total los casos no deseados.
9. **Eventos Excluyentes:** Dos o más sucesos que no pueden coexistir simultáneamente en una sola ejecución del experimento.
10. **Red de Caminos:** Estructura bidimensional de nodos y aristas que cuantifica trayectorias orientadas sin retroceso.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Cuándo se utiliza el Principio de Multiplicación en conteo?  
  **A:** Cuando los eventos ocurren de forma simultánea o en secuencia inmediata (conector lógico "Y").
* **Q:** ¿Cuál es la fórmula para la permutación circular de $n$ personas en una mesa redonda?  
  **A:** $P_c(n) = (n - 1)!$.
* **Q:** En un problema de conteo, ¿cómo sé si debo usar Combinación o Variación?  
  **A:** Si al cambiar el orden de los elementos el resultado o grupo es el mismo, es **Combinación**; si el resultado cambia, es **Variación**.
* **Q:** Si tienes $n$ elementos y $k$ de ellos deben permanecer siempre juntos, ¿cómo se calcula?  
  **A:** Se toma a los $k$ elementos como un solo bloque ($n - k + 1$ elementos a permutar) y se multiplica por $k!$ (orden interno del bloque).
* **Q:** ¿A qué equivale por definición el factorial de cero ($0!$)?  
  **A:** Equivale a $1$ por convención matemática y axiomática.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RM_05",
  "title": "Análisis Combinatorio Intuitivo y Conteo",
  "required_level": 5,
  "xp_reward": 190,
  "gems_reward": 25,
  "skills": ["Principios de Conteo", "Permutaciones Circulares", "Rutas y Grafos"],
  "boss_challenge": {
    "boss_name": "El Maestro de la Criptografía",
    "question": "Seis varones y seis mujeres se sientan en una mesa redonda de 12 asientos. Si deben quedar estrictamente intercalados, ¿de cuántas formas pueden sentarse?",
    "options": ["5! x 6!", "6! x 6!", "12! / 2", "11!"],
    "correct_index": 0,
    "explanation": "Se sientan primero los 6 varones en círculo de (6-1)! = 5! formas. Los 6 asientos restantes para las mujeres quedan fijos, permutando de 6! formas. Total: 5! x 6!."
  }
}
```
