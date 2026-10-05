## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Principios Fundamentales del Conteo

#### A. Principio de Adición (El Conector "O")
Si un evento A puede ocurrir de m maneras diferentes y otro evento B puede ocurrir de n maneras diferentes, y ambos eventos **no pueden ocurrir simultáneamente** (son mutuamente excluyentes), entonces el evento A **o** B puede realizarse de:
\text{Total de formas} = m + n
* *Ejemplo:* Si puedes viajar de Arequipa a Lima por avión (3 aerolíneas) o por bus terrestre (5 empresas), el total de opciones para viajar es 3 + 5 = 8 maneras.

#### B. Principio de Multiplicación (El Conector "Y")
Si un evento o decisión A puede ocurrir de m maneras y, para cada una de estas, un segundo evento B puede ocurrir de n maneras de forma **secuencial o simultánea**, entonces ambos eventos A **y** B ocurren de:
\text{Total de formas} = m \cdot n
* *Ejemplo:* Si tienes 4 pantalones distintos y 5 camisas, el total de tenidas (pantalón y camisa) es 4 \times 5 = 20 formas.

---

### 3.2 Problemas de Rutas y Redes Viales (Método de los Caminos)

1. **Rutas entre Ciudades en Serie:**
   Si para ir de la ciudad A a la ciudad C se debe pasar obligatoriamente por la ciudad intermedia B:
   \text{Rutas } (A \to C) = (\text{Caminos de } A \text{ a } B) \cdot (\text{Caminos de } B \text{ a } C)
2. **Viajes de Ida y Vuelta sin Repetir Camino:**
   Si hay k caminos entre dos ciudades:
   * Total de viajes ida y vuelta: k \cdot k = k^2.
   * Total de viajes ida y vuelta **sin regresar por el mismo camino**: k \cdot (k - 1).
3. **Caminos en Cuadrículas Urbanas (Método del Triángulo de Pascal):**
   Para ir del vértice inferior izquierdo al superior derecho avanzando únicamente hacia el norte (\uparrow) y hacia el este (\rightarrow):
   * Cada intersección suma los caminos que llegan desde abajo y desde la izquierda:
     V_{(x, y)} = V_{(x-1, y)} + V_{(x, y-1)}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE ANÁLISIS COMBINATORIO

| Tipo de Agrupación | Condición Fundamental | Expresión Matemática |
| :--- | :--- | :---: |
| **Factorial de un número (n!)** | Producto de los enteros consecutivos desde 1 hasta n (0! = 1) | n! = n(n - 1)(n - 2)\dots 1 |
| **Permutación Lineal (P_n)** | Intervienen todos los elementos en fila ordenada | P_n = n! |
