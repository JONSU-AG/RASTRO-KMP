## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Regla de Laplace (casos favorables / casos totales), monedas, dados, barajas de 52 cartas, y extracción de bolas de urnas. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: probabilidad condicional en diagnósticos médicos (falsos positivos/negativos), loterías y probabilidad geométrica. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Teorema de Bayes, probabilidad total, eventos independientes vs. dependientes, y extracciones sucesivas sin reposición. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar, describir y cuantificar el espacio muestral (\Omega) de experimentos aleatorios discretos.
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


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Experimento Aleatorio (\varepsilon), Espacio Muestral (\Omega) y Suceso (A)
* **Experimento Aleatorio (\varepsilon):** Toda prueba o fenómeno cuyo resultado no se puede predecir con exactitud antes de realizarlo, aún conociendo todas las condiciones iniciales (ej. lanzar dos dados y registrar la suma).
* **Espacio Muestral (\Omega):** El conjunto universal formado por **todos los resultados posibles** del experimento aleatorio.
  * *Lanzar dos monedas:* \Omega = \{(C, C), (C, S), (S, C), (S, S)\} \implies n(\Omega) = 2^2 = 4.
  * *Lanzar dos dados:* \Omega = \{(1, 1), (1, 2), \dots, (6, 6)\} \implies n(\Omega) = 6^2 = 36.
* **Suceso o Evento (A):** Cualquier subconjunto del espacio muestral (A \subseteq \Omega).
  * **Suceso Seguro:** A = \Omega \implies P(A) = 1.
  * **Suceso Imposible:** A = \emptyset \implies P(A) = 0.

---

### 3.2 Definición Clásica de Probabilidad (Regla de Laplace)
Si todos los sucesos elementales del espacio muestral \Omega son **equiprobables** (tienen la misma posibilidad física de ocurrir):
P(A) = \frac{n(A)}{n(\Omega)} = \frac{\text{Número de casos favorables al suceso } A}{\text{Número total de casos posibles}}

#### Axiomas Fundamentales de Kolmogorov:
1. Para todo suceso A:
   0 \le P(A) \le 1
2. Probabilidad del espacio muestral completo:
   P(\Omega) = 1

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE EXPERIMENTOS CLÁSICOS

### 4.1 Estructura Oficial de una Baraja Clásica (Naipe Inglés de 52 Cartas)
Indispensable memorizar para preguntas de la UNSA:
* **Total de cartas:** 52 (divididas en 4 palos de 13 cartas cada uno).
* **Palos Negros (26 cartas):** Espadas (\spadesuit) y Tréboles (\clubsuit).
* **Palos Rojos (26 cartas):** Corazones (\heartsuit) y Diamantes (\diamondsuit).
* **Cartas por Palo:** As (A), 2, 3, 4, 5, 6, 7, 8, 9, 10, y las figuras: Jack (J), Reina (Q), Rey (K).
* **Total de Figuras (Con rostro):** 12 cartas (4 \text{ Jacks}, 4 \text{ Reinas}, 4 \text{ Reyes}).
* **Total de Ases:** 4 ases.

### 4.2 Lanzamiento de Dos Dados: Tabla de Sumas (Total = 36 casos)

| Suma | Casos Favorables | Pares Ordenados (D_1, D_2) | Probabilidad |
