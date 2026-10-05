## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.4 Representación Decimal de Números Racionales
Toda fracción irreducible \frac{a}{b} genera un único número decimal que pertenece a una de las siguientes tres categorías:

#### 1. Número Decimal Exacto (Limitado)
Ocurre si y solo si el denominador b (descompuesto canónicamente) contiene **únicamente** factores primos 2 y/o 5:
b = 2^\alpha \cdot 5^\beta \quad (\alpha, \beta \in \mathbb{Z}_0^+)
* **Cantidad de Cifras Decimales:** Viene dada por el máximo de los exponentes:
  N_{\text{cifras decimales}} = \max(\alpha, \beta)
* **Fracción Generatriz:**
  0.a_1a_2\dots a_k = \frac{\overline{a_1a_2\dots a_k}}{10^k}

#### 2. Número Decimal Periódico Puro (Ilimitado)
Ocurre si y solo si el denominador b **no contiene factores 2 ni 5** (\text{MCD}(b, 10) = 1):
b \neq \overset{\circ}{2} \land b \neq \overset{\circ}{5}
* **Cantidad de Cifras del Periodo:** Es la menor cantidad de nueves (999\dots9) que contiene a b como divisor (orden de 10 módulo b).
* **Tabla de Factores de Nueves (Lumbreras / UNSA):**
  9 = 3^2 (1 cifra 9)
  99 = 3^2 \cdot 11 (2 cifras 9)
  999 = 3^3 \cdot 37 (3 cifras 9)
  9999 = 3^2 \cdot 11 \cdot 101 (4 cifras 9)
  99999 = 3^2 \cdot 41 \cdot 271 (5 cifras 9)
  999999 = 3^3 \cdot 7 \cdot 11 \cdot 13 \cdot 37 (6 cifras 9)
  9999999 = 3^2 \cdot 239 \cdot 4649 (7 cifras 9)
* **Fracción Generatriz:**
  0.\widehat{a_1a_2\dots a_p} = \frac{\overline{a_1a_2\dots a_p}}{\underbrace{99\dots9}_{p \text{ nueves}}}

#### 3. Número Decimal Periódico Mixto (Ilimitado)
Ocurre si el denominador b contiene factores 2 y/o 5 **y además** otros factores primos diferentes:
b = 2^\alpha \cdot 5^\beta \cdot p_1^{\gamma_1} \dots p_k^{\gamma_k} \quad (p_i \notin \{2, 5\})
* **Cantidad de Cifras No Periódicas:** \max(\alpha, \beta).
* **Cantidad de Cifras del Periodo:** Cantidad de nueves generada por la parte coprima con 10 (p_1^{\gamma_1} \dots p_k^{\gamma_k}).
* **Fracción Generatriz:**
  0.n_1\dots n_k\widehat{p_1\dots p_m} = \frac{\overline{n_1\dots n_k p_1\dots p_m} - \overline{n_1\dots n_k}}{\underbrace{99\dots9}_{m \text{ nueves}} \underbrace{00\dots0}_{k \text{ ceros}}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Decimal Exacto (Generatriz)** | 0.c_1 c_2 \dots c_k = \frac{\overline{c_1 c_2 \dots c_k}}{10^k} |
| **Cifras Decimales Exactas** | Para b = 2^\alpha \cdot 5^\beta \implies N_{\text{no periódicas}} = \max(\alpha, \beta) |
| **Decimal Periódico Puro (Generatriz)** | 0.\widehat{p_1 p_2 \dots p_m} = \frac{\overline{p_1 p_2 \dots p_m}}{\underbrace{99\dots9}_{m \text{ cifras}}} |
| **Decimal Periódico Mixto (Generatriz)** | 0.a_1\dots a_k\widehat{p_1\dots p_m} = \frac{\overline{a_1\dots a_k p_1\dots p_m} - \overline{a_1\dots a_k}}{\underbrace{99\dots9}_{m} \underbrace{00\dots0}_{k}} |
| **Reducción a la Unidad (Caudal Combinado)** | \frac{1}{T_{\text{total}}} = \frac{1}{t_1} + \frac{1}{t_2} - \frac{1}{t_{\text{desagüe}}} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Determinación Flash de Cifras Periódicas sin Dividir
¿Cuántas cifras decimales periódicas y no periódicas origina la fracción \frac{17}{5600}?
* **Paso 1: Verificar si es irreducible:** \text{MCD}(17, 5600) = 1 (17 es primo y no divide a 5600).
* **Paso 2: Descomposición canónica del denominador:**
  5600 = 56 \times 100 = (2^3 \cdot 7) \times (2^2 \cdot 5^2) = 2^5 \cdot 5^2 \cdot 7^1
* **Paso 3: Cifras no periódicas (Factores 2 y 5):**
  N_{\text{no periódicas}} = \max(5, 2) = 5 \text{ cifras}
* **Paso 4: Cifras periódicas (Factor 7):**
  Por la tabla de nueves, 7 divide por primera vez a 999999 (6 nueves).
  N_{\text{periódicas}} = 6 \text{ cifras}
* **Conclusión Inmediata:** Genera un decimal periódico mixto con 5 cifras no periódicas y 6 cifras en el periodo. ¡Calculado en 15 segundos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Clave de los 6 Nueves: "El Club de los Viajeros (7, 11, 13, 27, 37)"
* **Mnemotecnia:** 999999 (seis nueves) es el número mágico de las universidades peruanas.
  999999 = 27 \times 7 \times 11 \times 13 \times 37
* **Regla:**
  - 7 origina siempre **6 cifras periódicas**.
  - 13 origina siempre **6 cifras periódicas**.
  - 11 origina **2 cifras periódicas** (divide a 99).
  - 37 origina **3 cifras periódicas** (divide a 999).
  - 41 origina **5 cifras periódicas** (divide a 99999).

### 2. Generatriz Mixta: "Todo Menos lo Que No Tiene Sombrero"
* **Mnemotecnia:**
  \text{Numerador} = (\text{Número completo sin coma}) - (\text{Parte no periódica})
  \text{Denominador} = \text{Tantos 9 como cifras bajo el sombrero, seguidos de tantos 0 como cifras sin sombrero después de la coma}

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Calcular Cifras Decimales sin Simplificar Previamente la Fracción
> Si te dan la fracción \frac{21}{1400} y descompones directamente el denominador 1400 = 2^3 \cdot 5^2 \cdot 7, concluirías erróneamente que tiene 6 cifras periódicas por el factor 7.
> **¡GRAVE ERROR!** Primero debes simplificar:
> \frac{21}{1400} = \frac{3 \cdot 7}{2^3 \cdot 5^2 \cdot 7} = \frac{3}{2^3 \cdot 5^2}
> El factor 7 se cancela por completo. El número es un **decimal exacto** con \max(3, 2) = 3 cifras decimales y **cero cifras periódicas**.

> [!WARNING]
> ### Trampa 2: Confundir Fracciones Equivalentes con Términos Sumados
> Si a ambos términos de una fracción propia \frac{a}{b} (a < b) se les suma un mismo entero positivo k > 0, la fracción resultante **aumenta de valor**:
> \frac{a + k}{b + k} > \frac{a}{b}
> Si la fracción es impropia (a > b), al sumar k a ambos términos, la fracción resultante **disminuye de valor**. Muchos postulantes asumen intuitivamente que el valor permanece inalterado.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Control de Dosificación Farmacéutica y Caudales de Infusión Intravenosa
En las salas de cuidados intensivos del Hospital Regional Honorio Delgado de Arequipa, las bombas de infusión administran medicamentos en microgotas por minuto. La velocidad combinada de absorción y excreción renal se modela mediante el principio de reducción a la unidad:
\frac{1}{T_{\text{efectivo}}} = \frac{1}{T_{\text{infusión}}} - \frac{1}{T_{\text{eliminación}}}
El cálculo exacto de la fracción generatriz evita errores de redondeo que podrían derivar en toxicidad por acumulación o dosis subterapéuticas.

---
