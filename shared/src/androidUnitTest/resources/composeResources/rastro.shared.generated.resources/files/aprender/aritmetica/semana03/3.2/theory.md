## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   CD(N) = (\alpha_1 + 1)(\alpha_2 + 1)(\alpha_3 + 1)\dots(\alpha_k + 1)
   CD(N) = 1 + CD_{\text{primos}} + CD_{\text{compuestos}}
2. **Suma de Divisores (SD):**
   SD(N) = \left( \frac{p_1^{\alpha_1 + 1} - 1}{p_1 - 1} \right) \cdot \left( \frac{p_2^{\alpha_2 + 1} - 1}{p_2 - 1} \right) \dots \left( \frac{p_k^{\alpha_k + 1} - 1}{p_k - 1} \right)
3. **Suma de las Inversas de los Divisores (SID):**
   SID(N) = \frac{SD(N)}{N}
4. **Producto de Divisores (PD):**
   PD(N) = \sqrt{N^{CD(N)}} = N^{\frac{CD(N)}{2}}

### 3.5 Máximo Común Divisor (MCD) y Mínimo Común Múltiplo (MCM)
* **MCD:** El mayor de los divisores comunes de dos o más enteros.
  - Por descomposición canónica: Factores primos **comunes** con sus **menores** exponentes.
* **MCM:** El menor múltiplo positivo común de dos o más enteros.
  - Por descomposición canónica: Factores primos **comunes y no comunes** con sus **mayores** exponentes.

#### Algoritmo de Euclides (Divisiones Sucesivas)
Aplica exclusivamente para **dos números** enteros positivos A > B:
\begin{array}{c|c|c|c|c}
 & q_1 & q_2 & q_3 & q_4 \\ \hline
A & B & r_1 & r_2 & r_3 = \text{MCD} \\ \hline
r_1 & r_2 & r_3 & 0 & 
\end{array}
Donde:
A = B \cdot q_1 + r_1
B = r_1 \cdot q_2 + r_2
r_1 = r_2 \cdot q_3 + r_3
r_2 = r_3 \cdot q_4 + 0 \implies \text{MCD}(A, B) = r_3

#### Propiedades Fundamentales de MCD y MCM
1. Si \text{MCD}(A, B) = d \implies A = d \cdot p y B = d \cdot q, donde p y q son **PESI**.
2. \text{MCM}(A, B) = d \cdot p \cdot q.
3. Para dos números A y B:
   A \cdot B = \text{MCD}(A, B) \cdot \text{MCM}(A, B)
4. Si A = \overset{\circ}{B} \implies \text{MCD}(A, B) = B y \text{MCM}(A, B) = A.
5. \text{MCD}(k A, k B) = k \cdot \text{MCD}(A, B) y \text{MCM}(k A, k B) = k \cdot \text{MCM}(A, B).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cantidad de Divisores** | CD(N) = \prod_{i=1}^k (\alpha_i + 1) = CD_{\text{primos}} + CD_{\text{compuestos}} + 1 |
| **Suma de Divisores** | SD(N) = \prod_{i=1}^k \left( \frac{p_i^{\alpha_i + 1} - 1}{p_i - 1} \right) |
| **Suma de Inversas de Divisores** | SID(N) = \frac{SD(N)}{N} |
| **Producto de Divisores** | PD(N) = N^{\frac{CD(N)}{2}} |
| **Estructura Paramétrica PESI** | A = d \cdot p, \quad B = d \cdot q \quad (\text{MCD}(p, q) = 1) \implies \text{MCM}(A, B) = d \cdot p \cdot q |
| **Teorema del Producto MCD-MCM** | A \cdot B = \text{MCD}(A, B) \cdot \text{MCM}(A, B) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Homogeneización de Residuos Distintos
Cuando te den un sistema de congruencias con residuos diferentes:
N = \overset{\circ}{5} + 3, \quad N = \overset{\circ}{7} + 5, \quad N = \overset{\circ}{9} + 7
* **El Truco del Residuo por Exceso:** Observa la diferencia entre el divisor y el residuo:
  5 - 3 = 2, \quad 7 - 5 = 2, \quad 9 - 7 = 2
* Por lo tanto:
  N = \overset{\circ}{5} - 2 = \overset{\circ}{7} - 2 = \overset{\circ}{9} - 2 \implies N = \overset{\circ}{\text{MCM}(5, 7, 9)} - 2 = \overset{\circ}{315} - 2

### Artificio 2: Reconstrucción Euclídea Inversa ("Escalera hacia Atrás")
En problemas de la UNSA del tipo: *"Los cocientes sucesivos al calcular el MCD de dos números mediante divisiones sucesivas fueron 2, 3, 1, 4..."*
* **Regla de Oro:** Empieza asignando al residuo final el valor del \text{MCD} = d y el último resto 0.
* Aplica recursivamente: \text{Dividendo} = \text{Divisor} \times \text{Cociente} + \text{Resto}.
* Si los cocientes son q_1, q_2, q_3, q_4:
  r_3 = 0, \quad r_2 = d
  r_1 = r_2 \cdot q_4 + 0 = d \cdot q_4
  B = r_1 \cdot q_3 + r_2
  A = B \cdot q_2 + r_1
* ¡Esto ahorra hasta 4 minutos de prueba y error en el examen!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Ponderador del 7: "132 Positivo, 132 Negativo"
* **Clave Mnemotécnica:** Recuerda el prefijo telefónico **`1 - 3 - 2`**.
* **Mecánica:** Empieza desde la última cifra (derecha) hacia la izquierda con signos en tríadas:
  (+1, +3, +2), \quad (-1, -3, -2), \quad (+1, +3, +2), \dots
* *Ejemplo Mental:* En \overline{abcdef}, multiplicas 1(f) + 3(e) + 2(d) - 1(c) - 3(b) - 2(a).

### 2. El Ponderador del 13: "1 - 341 - 341 Alternado"
* **Clave Mnemotécnica:** "El 1 inicial va solo con +, luego bloques de 3, 4, 1 cambiando de signo".
* **Secuencia de derecha a izquierda:**
  +1, \quad (-3, -4, -1), \quad (+3, +4, +1), \quad (-3, -4, -1)

### 3. Fórmulas de Divisores: "La Fracción Geométrica"
* Para la suma de divisores SD(N), recuerda que cada factor primo genera una **suma de progresión geométrica finita**:
  1 + p + p^2 + \dots + p^\alpha = \frac{p^{\alpha+1} - 1}{p - 1}
* Si olvidas la fórmula, simplemente factoriza la serie geométrica.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Olvidar el Divisor Unidad en la Cantidad de Divisores
> Muchos postulantes confunden "divisores primos" con "divisores simples".
> - **Divisores Simples** = Divisores Primos + 1 (la unidad).
> - \text{Divisores Totales} = \text{Simples} + \text{Compuestos} = \text{Primos} + \text{Compuestos} + 1.
> Si el problema pide hallar los *divisores compuestos* y restas solo los primos de la cantidad total, marcarás la alternativa distractora inmediata.

> [!WARNING]
> ### Trampa 2: Aplicar A \cdot B = \text{MCD} \cdot \text{MCM} a Tres o Más Números
> La relación A \cdot B = \text{MCD}(A, B) \cdot \text{MCM}(A, B) es válida **ÚNICAMENTE PARA DOS NÚMEROS**.
> Para tres números: A \cdot B \cdot C \neq \text{MCD}(A, B, C) \cdot \text{MCM}(A, B, C).

> [!WARNING]
> ### Trampa 3: Descomposición no Canónica al Calcular CD(N)
> Si tienes N = 6^4 \cdot 10^2, **NO** puedes hacer (4+1)(2+1) = 15. La base debe estar formada **exclusivamente por números primos**:
> N = (2 \cdot 3)^4 \cdot (2 \cdot 5)^2 = 2^6 \cdot 3^4 \cdot 5^2 \implies CD(N) = (6+1)(4+1)(2+1) = 7 \cdot 5 \cdot 3 = 105

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Criptografía RSA y Números Primos Gigantes
La seguridad de todas las transacciones bancarias mundiales e internet (protocolo HTTPS) se basa en la asimetría computacional del Teorema Fundamental de la Aritmética:
* Multiplicar dos números primos de 300 dígitos p y q toma microsegundos (n = p \cdot q).
* Pero factorizar n para recuperar p y q requeriría millones de años a una supercomputadora clásica.

### Planificación de Tráfico Ferroviario y Líneas de Transporte (MCM)
En sistemas de transporte masivo (trenes metropolitanos, semáforos inteligentes de Arequipa), las frecuencias de salida de diferentes líneas (12 \text{ min}, 18 \text{ min} y 30 \text{ min}) sincronizan sus llegadas a una estación central exactamente en los múltiplos comunes. El \text{MCM}(12, 18, 30) = 180 \text{ minutos} = 3 \text{ horas}.

---
