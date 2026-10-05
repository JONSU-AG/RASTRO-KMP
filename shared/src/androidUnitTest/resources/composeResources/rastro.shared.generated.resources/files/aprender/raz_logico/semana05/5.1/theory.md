## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Estructura del silogismo categórico (premisa mayor, premisa menor, conclusión), identificación de términos (Mayor, Menor, Medio) y diagramas de Venn de clases. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: razonamientos en lenguaje cotidiano con cuantificadores existenciales y universales implícitos, silogismos jurídicos. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Modos y figuras válidas del silogismo (Bárbara, Celarent, Darii, Ferio...), leyes de distribución y falacias formales de silogismo. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Analizar la estructura interna de razonamientos deductivos tipo silogismo: Premisa Mayor (P), Premisa Menor (S) y Término Medio (M).
2. Determinar la validez o invalidez formal de un silogismo simple mediante diagramas de clases (Venn) y reglas aristotélicas.
3. Identificar el Término Medio (M) reconociendo que este jamás debe figurar en la conclusión.
4. Detectar errores y falacias formales de razonamiento deductivo: término medio no distribuido, falacia de cuatro términos, premisas particulares o negativas.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Universal Afirmativa (A: Todo S es P -> S n P' = vacío)
        ┌─ 1. Proposiciones ───┼─ Universal Negativa (E: Ningún S es P -> S n P = vacío)
        │      Categóricas     ├─ Particular Afirmativa (I: Algún S es P -> S n P =/= vacío)
        │      (A, E, I, O)    └─ Particular Negativa (O: Algún S no es P -> S n P' =/= vacío)
        │
SILOGISMOS                     ┌─ Término Mayor (P: Predicado de la conclusión)
Y RAZONAMIENTO ─┼─ 2. Estructura del ──┼─ Término Menor (S: Sujeto de la conclusión)
DEDUCTIVO       │      Silogismo       ├─ Término Medio (M: Conecta las premisas, NO va en conclusión)
        │                      └─ Premisa Mayor (contiene P) y Premisa Menor (contiene S)
        │
        │                      ┌─ Regla del Término Medio (Debe estar distribuido al menos una vez)
        ├─ 3. Reglas de ───────┼─ Regla de Negatividad (De dos premisas negativas NADA se concluye)
        │      Validez         ├─ Regla de Particularidad (De dos premisas particulares NADA se concluye)
        │                      └─ La Conclusión sigue siempre a la parte más débil (Negativa / Particular)
        │
        └─ 4. Métodos de ──────┌─ Método de Diagramas de Venn de Tres Conjuntos (S, P, M)
               Validación      └─ Las 4 Figuras del Silogismo Tradicional (M-P, P-M, etc.)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Proposiciones Categóricas Típicas (El Cuadro de Boole)
Aristóteles clasificó los juicios categóricos en cuatro formas canónicas identificadas por las vocales latinas **A, E, I, O**:

| Tipo | Denominación Clásica | Estructura | Cuantificador | Diagrama Booleano | Representación Venn |
| :---: | :--- | :--- | :---: | :---: | :---: |
| **A** | **Universal Afirmativa** | "Todo S es P" | Universal | S \cap \bar{P} = \emptyset | Zona de S fuera de P sombreada (vacía) |
| **E** | **Universal Negativa** | "Ningún S es P" | Universal | S \cap P = \emptyset | Zona de intersección S \cap P sombreada |
| **I** | **Particular Afirmativa** | "Algún S es P" | Existencial | S \cap P \neq \emptyset | Una "\times" en la intersección S \cap P |
| **O** | **Particular Negativa** | "Algún S no es P" | Existencial | S \cap \bar{P} \neq \emptyset | Una "\times" en la zona de S fuera de P |

* *Mnemotecnia latina:* **A**ff**I**rmo (A, I: Afirmativas) y n**E**g**O** (E, O: Negativas).

---

### 3.2 Distribución de Términos
Un término está **distribuido** en una proposición cuando dicha proposición se refiere a la **totalidad absoluta** de los elementos de la clase:
* En **A** (Todo S es P): El **Sujeto (S)** está distribuido.
* En **E** (Ningún S es P): **Ambos (S y P)** están distribuidos.
* En **I** (Algún S es P): **Ningún** término está distribuido.
* En **O** (Algún S no es P): El **Predicado (P)** está distribuido.

---

### 3.3 Estructura Formal del Silogismo Categórico
Un silogismo categórico estándar está compuesto rigurosamente por **tres proposiciones categóricas** que contienen exactamente **tres términos distintos**, cada uno de los cuales aparece en exactamente dos proposiciones.

\begin{array}{rll}
\text{Premisa Mayor:} & M - P \quad (\text{contiene al Término Medio y al Mayor}) \\

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE FIGURAS Y DIAGRAMAS DE VENN

### Las 4 Figuras Clásicas del Silogismo (Posición del Término Medio M)

\begin{array}{c|c|c|c}
\text{1.ª FIGURA} & \text{2.ª FIGURA} & \text{3.ª FIGURA} & \text{4.ª FIGURA} \\
\hline
M - P & P - M & M - P & P - M \\
S - M & S - M & M - S & M - S \\
\hline
