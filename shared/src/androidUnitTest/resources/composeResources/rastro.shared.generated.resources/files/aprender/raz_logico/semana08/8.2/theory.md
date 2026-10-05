## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.2 Ordenamiento Circular

Para n personas simétricamente espaciadas alrededor de una mesa circular:
- **Ángulo entre asientos consecutivos:** \theta = \frac{360^\circ}{n}.
- **Frente a frente (Diametralmente opuesto):** Solo existe con total rigor geométrico cuando el número de asientos es **par** (n = 4, 6, 8, \dots). Si n es impar, ningún comensal tiene a alguien exactamente enfrente.
- **Sentido Relativo de Orientación:**
  - Todo comensal está mirando **hacia el centro de la mesa**.
  - Por lo tanto, la "derecha" de una persona corresponde a su propio brazo derecho (sentido **antihorario** desde una vista cenital).
  - La "izquierda" corresponde a su propio brazo izquierdo (sentido **horario** desde una vista cenital).

### 3.3 Cuadro de Decisiones (Principio de Correspondencia Biunívoca)
Cuando se relacionan dos o más categorías donde a cada elemento de un conjunto le corresponde **exactamente uno** del otro (función biyectiva):
- **Teorema de la Fila y Columna Única:** En una tabla de doble entrada, cada fila y cada columna debe contener exactamente un solo visto bueno (\checkmark) y todos los demás casilleros deben llenarse con aspas (\times).
\sum_{j=1}^m x_{ij} = 1 \quad \forall i, \qquad \sum_{i=1}^n x_{ij} = 1 \quad \forall j
- Si un problema involucra 3 o más atributos (ejemplo: Persona, Profesión, Ciudad y Bebida), se utiliza una **tabla corta** (columnas de atributos con filas de personas fijas) para no saturar una matriz cúbica multidimensional.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Circular: Asiento Opuesto** | Para n asientos pares simétricos | \text{Opuesto}(k) = k + \frac{n}{2} |
| **Circular: Personas a la derecha** | En mesa de n asientos (par) | Hay \frac{n-2}{2} comensales a la derecha y \frac{n-2}{2} a la izquierda. |
| **Principio del Dato Cierto** | Punto de inicio obligatorio | *"Comenzar siempre por el dato que fija una posición absoluta única"*. |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Anclaje del "Dato Pivot" (La Posición Fija)
Nunca empieces a dibujar un ordenamiento por datos comparativos ("A es más alto que B", "C no está junto a D").
1. Escanea el texto buscando el **Dato Ancla** (ejemplo: *"Raúl está sentado en el extremo izquierdo"*, o *"Mario vive en el primer piso"*).
2. Dibuja el esquema base y ponle nombre al casillero fijo.
3. Desde el pivote, conecta los datos que mencionen directamente a dicho personaje.
4. Los datos ambiguos se dejan para el final como verificación de descarte.

### Hack 2: Desdoblamiento de Escenarios en Paralelo
Si un dato genera una bifurcación (ejemplo: *"Juan puede estar en el piso 2 o en el piso 5"*):
- **NO pierdas tiempo borrando:** Traza dos esquemas pequeños paralelos (Caso 1 y Caso 2).
- Continúa leyendo las siguientes premisas en ambos casos a la vez.
- Verás que en menos de 20 segundos uno de los dos casos colisiona en contradicción insalvable (\bot). Deséchalo y el otro será la respuesta definitiva.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Reloj Antidisturbios" (Para Mesas Circulares)
- Imagínate sentado en la silla del personaje mirando al plato (centro):
  - **A**ntihorario = **D**erecha (**A-D**: "Antes de Dormir").
  - **H**orario = **I**zquierda (**H-I**: "Hijos Ilustres").
- Si te paras detrás del dibujo cometes el error más común del examen de admisión: invertir la lateralidad del personaje.

### Mnemotecnia 2: "La Ley del Sniper" (Para Cuadro de Decisiones)
- *"Un tiro, una baja"*: Apenas colocas un \checkmark en la celda (i, j):
  - Disparas en cruz horizontalmente: Toda la fila i se llena de \times.
  - Disparas en cruz verticalmente: Toda la columna j se llena de \times.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: "A está a la derecha de B" NO significa que esté a su costado**
> Si el texto dice: *"Ana se sienta a la derecha de Beatriz"*, no asumas que están pegadas. Ana puede estar a 3 o 4 asientos de distancia. Solo si el texto dice explícitamente *"junto y a la derecha"* o *"inmediatamente a la derecha"*, la distancia es exactamente de 1 asiento.

> [!CAUTION]
> **Trampa 2: Mesas con número impar de asientos o sillas vacías**
> En un problema de mesa circular, cuenta primero la cantidad total de asientos, no de personas. Si hay 4 amigos pero la mesa tiene 6 asientos, hay 2 asientos vacíos que juegan como elementos reales en la lateralidad y adyacencia.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la ingeniería de transporte y logística de almacenes (Amazon Fulfillment Centers o puertos de contenedores como Matarani o Chancay), los algoritmos de ordenamiento topológico (*Topological Sorting*) resuelven redes de precedencia donde una tarea o despacho de carga no puede ejecutarse antes de que otra termine. De igual manera, en la secuenciación de nucleótidos del ADN o en la planificación de turnos hospitalarios del personal de salud, la correspondencia biunívoca libre de colisiones es la garantía formal de que ningún quirófano ni paciente quede desatendido.

---
