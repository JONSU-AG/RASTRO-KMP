## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
| **Combinación con Repetición (CR_k^n)** | **NO** | Cualesquiera | **SÍ** | CR_k^n = C_k^{n + k - 1} |

---

### 3.4 Permutaciones con Restricciones Especiales

#### 1. Elementos que Deben Permanecer Juntos (Método del Paquete o Bloque)
Si en una fila de n personas, un subgrupo de m personas específicas debe estar siempre junto:
* Se agrupa a las m personas considerándolas como **un solo elemento ficticio**.
* El número total de elementos a ordenar pasa a ser: n' = (n - m + 1).
* Las m personas dentro del bloque pueden permutarse internamente entre sí de m! formas.
N_{\text{total}} = (n - m + 1)! \times m!

#### 2. Elementos que Deben Estar Separados (Método de los Espacios Libres)
Para ordenar n elementos donde k elementos específicos no pueden estar juntos:
* Primero se ordenan los (n - k) elementos restantes en una línea de (n - k)! formas.
* Estos elementos generan (n - k + 1) espacios o huecos disponibles (incluyendo los extremos).
* Los k elementos especiales deben ubicarse en esos huecos disponibles de V_k^{n - k + 1} maneras.

---

### 3.5 Propiedades Fundamentales de los Números Combinatorios

1. **Combinatorios Complementarios:**
   C_k^n = C_{n - k}^n
   *Ejemplo:* C_8^{10} = C_{10 - 8}^{10} = C_2^{10} = \frac{10 \times 9}{2 \times 1} = 45.
2. **Regla de Pascal (Identidad de Suma):**
   C_k^n + C_{k + 1}^n = C_{k + 1}^{n + 1}
3. **Suma Total de Coeficientes Binomiales (Subconjuntos de un Conjunto):**
   C_0^n + C_1^n + C_2^n + \dots + C_n^n = 2^n
4. **Fórmula Práctica de Degradación de Índices:**
   C_k^n = \frac{n}{k} \cdot C_{k - 1}^{n - 1}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Permutación con Repetición** | P_n^{k_1, k_2, \dots, k_r} = \frac{n!}{k_1! \cdot k_2! \dots k_r!} \quad (\sum k_i = n) |
| **Combinación Simple** | C_k^n = \frac{n!}{k!(n - k)!} = \frac{V_k^n}{k!} |
| **Identidad de Pascal** | C_k^n + C_{k+1}^n = C_{k+1}^{n+1} |
| **Suma de Potencia de 2** | \sum_{k=0}^n C_k^n = 2^n |
| **Combinación con Repetición** | CR_k^n = C_k^{n + k - 1} = \frac{(n + k - 1)!}{k!(n - 1)!} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: La Regla Práctica del "Conteo Regresivo" para Combinaciones
Para calcular rápidamente C_k^n sin escribir factoriales gigantes:
* Multiplica k factores decrecientes en el numerador empezando desde n.
* Divide entre el factorial de k (k!):
  C_3^8 = \frac{8 \times 7 \times 6}{3 \times 2 \times 1} = 56
  C_4^{12} = \frac{12 \times 11 \times 10 \times 9}{4 \times 3 \times 2 \times 1} = 495
* ¡Ahorra hasta un minuto entero por pregunta en el examen de admisión!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Pregunta del Millón: "¿Importa el Orden?"
* **SÍ Importa:** Es una **VARIACIÓN** o **PERMUTACIÓN** (cargos jerárquicos: Presidente/Secretario, claves de cajero, podios de carreras, números formados con dígitos).
* **NO Importa:** Es una **COMBINACIÓN** (comisiones, equipos de trabajo, apretones de manos, selección de cartas, ensaladas de frutas).

### 2. Permutación Circular: "Fija a Uno, Permuta al Resto"
* En una mesa redonda de n asientos, como todos los lugares son geométricamente equivalentes por rotación, debes **fijar a una persona de referencia** como ancla inamovible.
* El resto de (n - 1) personas se permuta normalmente en los asientos restantes:
  P_c(n) = (n - 1)!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Olvidar Permutar Internamente a los Miembros de un Paquete
> Si 4 amigos van al cine y 2 de ellos se sientan siempre juntos:
> - Número de paquetes: (4 - 2 + 1)! = 3! = 6.
> - **¡EL ERROR HABITUAL!** Marcar 6.
> - **Lo Correcto:** Los 2 amigos pueden sentarse como AB o BA (2! = 2).
>   N_{\text{total}} = 3! \times 2! = 6 \times 2 = 12

> [!WARNING]
> ### Trampa 2: Confundir Asignación de Cargos con Elección de Delegaciones
> - Si de un grupo de 10 personas se eligen 3 personas para formar una **comisión paritaria de debate**: NO importa el orden \implies C_3^{10} = 120.
> - Si de las mismas 10 personas se eligen un **Presidente, un Secretario y un Tesorero**: SÍ importa el orden de las funciones \implies V_3^{10} = 10 \times 9 \times 8 = 720.
> Ambas opciones (120 y 720) siempre estarán presentes en las alternativas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Conmutación y Ruteo en Redes de Fibra Óptica en Arequipa
En el tendido de telecomunicaciones subterráneas entre los campus de Ingenierías, Biomédicas y Sociales de la UNSA, los paquetes de datos viajan a través de una malla ortogonal de conmutadores de m \times n nodos.
El número de trayectorias mínimas posibles que puede tomar un paquete desde un servidor origen hasta una terminal destino sin retroceder se modela como una **permutación con repetición**:
N_{\text{rutas}} = P_{m + n}^{m, n} = \frac{(m + n)!}{m! \cdot n!} = C_m^{m + n}
Esta formulación combinatoria permite a los protocolos de enrutamiento balancear el tráfico y evitar la saturación de los canales.

---
