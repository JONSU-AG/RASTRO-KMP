## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.3. Resolución por Determinantes (Regla de Gabriel Cramer)
Para el sistema 2 \times 2:
\Delta_s = \begin{vmatrix} a_1 & b_1 \\ a_2 & b_2 \end{vmatrix} = a_1 b_2 - a_2 b_1 \quad (\text{Determinante del Sistema})
\Delta_x = \begin{vmatrix} c_1 & b_1 \\ c_2 & b_2 \end{vmatrix} = c_1 b_2 - c_2 b_1 \quad (\text{Determinante de } x)
\Delta_y = \begin{vmatrix} a_1 & c_1 \\ a_2 & c_2 \end{vmatrix} = a_1 c_2 - a_2 c_1 \quad (\text{Determinante de } y)

Si \Delta_s \neq 0, la solución única está dada por:
x = \frac{\Delta_x}{\Delta_s}, \quad y = \frac{\Delta_y}{\Delta_s}

---

### 3.4. Sistemas Lineales de 3x3 y Regla de Sarrus
Para un sistema de tres ecuaciones con tres incógnitas:
\begin{cases} a_1 x + b_1 y + c_1 z = d_1 \\ a_2 x + b_2 y + c_2 z = d_2 \\ a_3 x + b_3 y + c_3 z = d_3 \end{cases}

El determinante del sistema se calcula mediante la **Regla de Pierre Sarrus** (o desarrollo por menores complementarios de Laplace):
\Delta_s = \begin{vmatrix} a_1 & b_1 & c_1 \\ a_2 & b_2 & c_2 \\ a_3 & b_3 & c_3 \end{vmatrix} = (a_1 b_2 c_3 + b_1 c_2 a_3 + c_1 a_2 b_3) - (a_3 b_2 c_1 + b_3 c_2 a_1 + c_3 a_2 b_1)
Las soluciones vienen dadas por:
x = \frac{\Delta_x}{\Delta_s}, \quad y = \frac{\Delta_y}{\Delta_s}, \quad z = \frac{\Delta_z}{\Delta_s}

#### Sistemas Homogéneos:
Son aquellos donde todos los términos independientes son ceros (d_1 = d_2 = d_3 = 0).
- Siempre admiten la **solución trivial**: (x, y, z) = (0, 0, 0).
- Admiten **soluciones distintas de la trivial (infinitas soluciones)** si y solo si el determinante del sistema es nulo:
  \Delta_s = 0

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cramer 2x2** | x = \frac{\Delta_x}{\Delta_s}, \ y = \frac{\Delta_y}{\Delta_s} | \Delta_s \neq 0 |
| **Cramer 3x3** | z = \frac{\Delta_z}{\Delta_s} | \Delta_s \neq 0 |
| **Sistema Homogéneo No Trivial** | \Delta_s = 0 | Infinitas soluciones para d_i = 0 |
| **Transformación Simétrica** | u = x + y, \ v = xy | Simplificación de sistemas no lineales |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Suma o Resta Global en Sistemas Cíclicos 3x3
Cuando tengas un sistema cíclico de la forma:
\begin{cases} x + y = 14 \\ y + z = 18 \\ z + x = 20 \end{cases}
**¡No despejes x para reemplazar en las otras dos!**
**Hack:** Suma las tres ecuaciones miembro a miembro:
2x + 2y + 2z = 14 + 18 + 20 = 52 \implies x + y + z = 26
Ahora resta cada ecuación original:
- (x + y + z) - (x + y) = 26 - 14 \implies z = 12
- (x + y + z) - (y + z) = 26 - 18 \implies x = 8
- (x + y + z) - (z + x) = 26 - 20 \implies y = 6
¡Resuelto mentalmente en 10 segundos!

### Artificio 2: Cambio de Variable Elemental en Sistemas Simétricos No Lineales
En sistemas de la forma:
\begin{cases} x + y + xy = 11 \\ x^2 + y^2 = 13 \end{cases}
**Hack:** Haz u = x + y y v = xy:
- La primera ecuación es: u + v = 11 \implies v = 11 - u.
- La segunda es: x^2 + y^2 = (x + y)^2 - 2xy = u^2 - 2v = 13.
Sustituyes v: u^2 - 2(11 - u) = 13 \implies u^2 + 2u - 35 = 0 \implies (u + 7)(u - 5) = 0.
Calculas u y v y luego reconstruyes la cuadrática t^2 - ut + v = 0.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Tres Proporciones de Compatibilidad: "Diferente, Triple Igual, Final Roto"
- **Diferente \to Determinado:** Si \frac{a_1}{a_2} \neq \frac{b_1}{b_2}, hay solución única (se cortan).
- **Triple Igual \to Infinitas:** Si todo es igual (\frac{a_1}{a_2} = \frac{b_1}{b_2} = \frac{c_1}{c_2}), son la misma recta disfrazada.
- **Final Roto \to Incompatible:** Si las x e y son proporcionales pero el término independiente se rompe (\neq \frac{c_1}{c_2}), las rectas corren paralelas y nunca se tocan.

### 2. Solución Trivial en Homogéneos: "El Trío Cero"
Todo sistema homogéneo tiene asegurado el (0, 0, 0). Para que tenga "vida propia" más allá del cero, su determinante debe colapsar a cero (\Delta_s = 0).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Sistema Incompatible cuando \Delta_s = 0**
> Muchos textos simplistas afirman: *"Si \Delta_s = 0, el sistema es incompatible"*.
> **¡FALSO!** Si \Delta_s = 0, el sistema puede ser **Incompatible** (\Delta_x \neq 0) o **Compatible Indeterminado** (\Delta_x = 0 y \Delta_y = 0).
> Debes verificar siempre las proporciones completas con los términos independientes.

> [!CAUTION]
> **Trampa 2: Despejar y Dividir entre Variables que Pueden ser Cero**
> En sistemas no lineales como:
> \begin{cases} x^2 y = 4 \\ x y^2 = 2 \end{cases}
> Al dividir miembro a miembro, asegúrate de constatar que x \neq 0 e y \neq 0. Como los términos independientes son no nulos (4 y 2), ninguna variable puede valer cero, lo que valida la división: \frac{x}{y} = 2 \implies x = 2y.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Distribución de Cargas Logísticas en el Parque Industrial de Río Seco
En el centro logístico de Río Seco en Arequipa, tres empresas de transporte distribuyen insumos agrícolas combinando tres tipos de camiones de distinta capacidad de carga (x: 5 tn, y: 10 tn, z: 25 tn). El requerimiento simultáneo de combustible, tonelaje transportado y peajes genera un sistema de ecuaciones lineales 3 \times 3. Si el determinante del sistema fuera nulo (\Delta_s = 0), las rutas de transporte resultarían redundantes o incompatibles, provocando la paralización del despacho de hortalizas hacia los mercados de abastos de la plataforma Avelino Cáceres.

---
